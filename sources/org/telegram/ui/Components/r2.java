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

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
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
        org.telegram.ui.Wallet.j0 j0Var;
        vy0 r10;
        switch (this.a) {
            case 0:
                pf.d.p((Context) this.d, Uri.parse((String) this.e), this.b == 0, this.c, (pf.c) this.f);
                return;
            case 1:
                k8.B((k8) this.d, this.b, this.c, (TLRPC.Document) this.e, (Runnable) this.f);
                return;
            default:
                org.telegram.ui.Wallet.q0 q0Var = (org.telegram.ui.Wallet.q0) this.d;
                long j10 = this.b;
                String str = (String) this.e;
                boolean z10 = this.c;
                Utilities.Callback callback = (Utilities.Callback) this.f;
                org.telegram.ui.Wallet.j0 j0Var2 = null;
                try {
                    Object obj = org.telegram.ui.Wallet.q0.f;
                    synchronized (obj) {
                        q0Var.c(j10);
                        r10 = q0Var.r();
                    }
                    if (((LinkedHashMap) r10.e).containsKey(str)) {
                        j0Var = q0Var.h(r10, str, j10);
                        try {
                            synchronized (obj) {
                                try {
                                    q0Var.c(j10);
                                    if (z10) {
                                        r10.b = ConnectionsManager.getInstance(q0Var.b).getCurrentTime();
                                        if (q0Var.d.exists()) {
                                            q0Var.v(r10, new LinkedHashMap());
                                        } else {
                                            if (!q0Var.q().edit().putInt("lastUsageDate", r10.b).commit()) {
                                                throw new IOException("usage write");
                                            }
                                            AndroidUtilities.runOnUIThread(new org.telegram.ui.df0(9));
                                        }
                                    }
                                } catch (Exception e) {
                                    FileLog.e(e);
                                } finally {
                                }
                            }
                            j0Var2 = j0Var;
                        } catch (Exception e7) {
                            e = e7;
                            FileLog.e(e);
                            if (j0Var != null) {
                                j0Var.close();
                            }
                            AndroidUtilities.runOnUIThread(new ai.c3(q0Var, j0Var2, callback, j10, 26));
                            return;
                        }
                    }
                } catch (Exception e10) {
                    e = e10;
                    j0Var = null;
                }
                AndroidUtilities.runOnUIThread(new ai.c3(q0Var, j0Var2, callback, j10, 26));
                return;
        }
    }

    public /* synthetic */ r2(k8 k8Var, long j10, boolean z10, TLRPC.Document document, Runnable runnable) {
        this.d = k8Var;
        this.b = j10;
        this.c = z10;
        this.e = document;
        this.f = runnable;
    }

    public /* synthetic */ r2(org.telegram.ui.Wallet.q0 q0Var, long j10, String str, boolean z10, Utilities.Callback callback) {
        this.d = q0Var;
        this.b = j10;
        this.e = str;
        this.c = z10;
        this.f = callback;
    }
}
