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

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class r2 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ long b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ r2(Context context, String str, long j3, boolean z10, of.e eVar) {
        this.d = context;
        this.e = str;
        this.b = j3;
        this.c = z10;
        this.f = eVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        org.telegram.ui.Wallet.h0 h0Var;
        dz0 r10;
        switch (this.a) {
            case 0:
                of.f.q((Context) this.d, Uri.parse((String) this.e), this.b == 0, this.c, (of.e) this.f);
                return;
            case 1:
                l8.C((l8) this.d, this.b, this.c, (TLRPC.Document) this.e, (Runnable) this.f);
                return;
            default:
                org.telegram.ui.Wallet.p0 p0Var = (org.telegram.ui.Wallet.p0) this.d;
                long j3 = this.b;
                String str = (String) this.e;
                boolean z10 = this.c;
                Utilities.Callback callback = (Utilities.Callback) this.f;
                org.telegram.ui.Wallet.h0 h0Var2 = null;
                try {
                    Object obj = org.telegram.ui.Wallet.p0.f;
                    synchronized (obj) {
                        p0Var.c(j3);
                        r10 = p0Var.r();
                    }
                    if (((LinkedHashMap) r10.e).containsKey(str)) {
                        h0Var = p0Var.h(r10, str, j3);
                        try {
                            synchronized (obj) {
                                try {
                                    p0Var.c(j3);
                                    if (z10) {
                                        r10.b = ConnectionsManager.getInstance(p0Var.b).getCurrentTime();
                                        if (p0Var.d.exists()) {
                                            p0Var.v(r10, new LinkedHashMap());
                                        } else {
                                            if (!p0Var.q().edit().putInt("lastUsageDate", r10.b).commit()) {
                                                throw new IOException("usage write");
                                            }
                                            AndroidUtilities.runOnUIThread(new org.telegram.ui.t21(6));
                                        }
                                    }
                                } catch (Exception e7) {
                                    FileLog.e(e7);
                                } finally {
                                }
                            }
                            h0Var2 = h0Var;
                        } catch (Exception e10) {
                            e = e10;
                            FileLog.e(e);
                            if (h0Var != null) {
                                h0Var.close();
                            }
                            AndroidUtilities.runOnUIThread(new o31(p0Var, h0Var2, callback, j3, 8));
                            return;
                        }
                    }
                } catch (Exception e11) {
                    e = e11;
                    h0Var = null;
                }
                AndroidUtilities.runOnUIThread(new o31(p0Var, h0Var2, callback, j3, 8));
                return;
        }
    }

    public /* synthetic */ r2(l8 l8Var, long j3, boolean z10, TLRPC.Document document, Runnable runnable) {
        this.d = l8Var;
        this.b = j3;
        this.c = z10;
        this.e = document;
        this.f = runnable;
    }

    public /* synthetic */ r2(org.telegram.ui.Wallet.p0 p0Var, long j3, String str, boolean z10, Utilities.Callback callback) {
        this.d = p0Var;
        this.b = j3;
        this.e = str;
        this.c = z10;
        this.f = callback;
    }
}
