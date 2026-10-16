package org.telegram.ui.Components;

import android.content.Context;
import android.net.Uri;
import java.io.IOException;
import java.util.LinkedHashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class r2 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ long b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ r2(Context context, String str, long j10, boolean z10, pf.c cVar) {
        this.d = context;
        this.e = str;
        this.b = j10;
        this.c = z10;
        this.f = cVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        org.telegram.ui.Wallet.h0 h0Var;
        az0 r10;
        switch (this.a) {
            case 0:
                pf.d.p((Context) this.d, Uri.parse((String) this.e), this.b == 0, this.c, (pf.c) this.f);
                return;
            case 1:
                m8.C((m8) this.d, this.b, this.c, (TLRPC.Document) this.e, (Runnable) this.f);
                return;
            default:
                org.telegram.ui.Wallet.p0 p0Var = (org.telegram.ui.Wallet.p0) this.d;
                long j10 = this.b;
                String str = (String) this.e;
                boolean z10 = this.c;
                Utilities.Callback callback = (Utilities.Callback) this.f;
                org.telegram.ui.Wallet.h0 h0Var2 = null;
                try {
                    Object obj = org.telegram.ui.Wallet.p0.f;
                    synchronized (obj) {
                        p0Var.c(j10);
                        r10 = p0Var.r();
                    }
                    if (((LinkedHashMap) r10.e).containsKey(str)) {
                        h0Var = p0Var.h(r10, str, j10);
                        try {
                            synchronized (obj) {
                                try {
                                    p0Var.c(j10);
                                    if (z10) {
                                        r10.b = ConnectionsManager.getInstance(p0Var.b).getCurrentTime();
                                        if (p0Var.d.exists()) {
                                            p0Var.v(r10, new LinkedHashMap());
                                        } else {
                                            if (!p0Var.q().edit().putInt("lastUsageDate", r10.b).commit()) {
                                                throw new IOException("usage write");
                                            }
                                            AndroidUtilities.runOnUIThread(new org.telegram.ui.b31(7));
                                        }
                                    }
                                } catch (Exception e) {
                                    FileLog.e(e);
                                } finally {
                                }
                            }
                            h0Var2 = h0Var;
                        } catch (Exception e7) {
                            e = e7;
                            FileLog.e(e);
                            if (h0Var != null) {
                                h0Var.close();
                            }
                            AndroidUtilities.runOnUIThread(new bi.b8(p0Var, h0Var2, callback, j10, 18));
                            return;
                        }
                    }
                } catch (Exception e10) {
                    e = e10;
                    h0Var = null;
                }
                AndroidUtilities.runOnUIThread(new bi.b8(p0Var, h0Var2, callback, j10, 18));
                return;
        }
    }

    public /* synthetic */ r2(m8 m8Var, long j10, boolean z10, TLRPC.Document document, Runnable runnable) {
        this.d = m8Var;
        this.b = j10;
        this.c = z10;
        this.e = document;
        this.f = runnable;
    }

    public /* synthetic */ r2(org.telegram.ui.Wallet.p0 p0Var, long j10, String str, boolean z10, Utilities.Callback callback) {
        this.d = p0Var;
        this.b = j10;
        this.e = str;
        this.c = z10;
        this.f = callback;
    }
}
