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

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
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
        org.telegram.ui.Wallet.g0 g0Var;
        zy0 r10;
        switch (this.a) {
            case 0:
                pf.d.q((Context) this.d, Uri.parse((String) this.e), this.b == 0, this.c, (pf.c) this.f);
                return;
            case 1:
                m8.B((m8) this.d, this.b, this.c, (TLRPC.Document) this.e, (Runnable) this.f);
                return;
            default:
                org.telegram.ui.Wallet.o0 o0Var = (org.telegram.ui.Wallet.o0) this.d;
                long j10 = this.b;
                String str = (String) this.e;
                boolean z10 = this.c;
                Utilities.Callback callback = (Utilities.Callback) this.f;
                org.telegram.ui.Wallet.g0 g0Var2 = null;
                try {
                    Object obj = org.telegram.ui.Wallet.o0.f;
                    synchronized (obj) {
                        o0Var.c(j10);
                        r10 = o0Var.r();
                    }
                    if (((LinkedHashMap) r10.e).containsKey(str)) {
                        g0Var = o0Var.h(r10, str, j10);
                        try {
                            synchronized (obj) {
                                try {
                                    o0Var.c(j10);
                                    if (z10) {
                                        r10.b = ConnectionsManager.getInstance(o0Var.b).getCurrentTime();
                                        if (o0Var.d.exists()) {
                                            o0Var.v(r10, new LinkedHashMap());
                                        } else {
                                            if (!o0Var.q().edit().putInt("lastUsageDate", r10.b).commit()) {
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
                            g0Var2 = g0Var;
                        } catch (Exception e7) {
                            e = e7;
                            FileLog.e(e);
                            if (g0Var != null) {
                                g0Var.close();
                            }
                            AndroidUtilities.runOnUIThread(new bi.b8(o0Var, g0Var2, callback, j10, 18));
                            return;
                        }
                    }
                } catch (Exception e10) {
                    e = e10;
                    g0Var = null;
                }
                AndroidUtilities.runOnUIThread(new bi.b8(o0Var, g0Var2, callback, j10, 18));
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

    public /* synthetic */ r2(org.telegram.ui.Wallet.o0 o0Var, long j10, String str, boolean z10, Utilities.Callback callback) {
        this.d = o0Var;
        this.b = j10;
        this.e = str;
        this.c = z10;
        this.f = callback;
    }
}
