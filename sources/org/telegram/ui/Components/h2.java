package org.telegram.ui.Components;

import android.content.Context;
import android.net.Uri;
import java.io.IOException;
import java.util.HashSet;
import java.util.LinkedHashMap;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.hb1;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class h2 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ long b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ h2(Context context, String str, long j10, boolean z10, sf.b bVar) {
        this.d = context;
        this.e = str;
        this.b = j10;
        this.c = z10;
        this.f = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        org.telegram.ui.Wallet.h0 h0Var;
        org.telegram.ui.Wallet.h0 h0Var2;
        Object obj;
        dw0 r5;
        switch (this.a) {
            case 0:
                sf.c.r((Context) this.d, Uri.parse((String) this.e), this.b == 0, this.c, (sf.b) this.f);
                return;
            case 1:
                z7 z7Var = (z7) this.d;
                long j10 = this.b;
                boolean z10 = this.c;
                TLRPC.Document document = (TLRPC.Document) this.e;
                Runnable runnable = (Runnable) this.f;
                HashSet hashSet = org.telegram.messenger.hp.s1(z7Var.a).H1().b;
                if (z10) {
                    hashSet.add(Long.valueOf(j10));
                } else {
                    hashSet.remove(Long.valueOf(j10));
                }
                long e10 = org.telegram.messenger.h10.i(z7Var.a).e();
                TLRPC.UserFull b22 = org.telegram.messenger.hp.s1(z7Var.a).b2(e10);
                if (b22 != null) {
                    if (z10) {
                        b22.flags2 |= TLObject.FLAG_21;
                        b22.saved_music = document;
                    } else {
                        TLRPC.Document document2 = b22.saved_music;
                        if (document2 != null && document2.id == j10) {
                            b22.flags2 &= -2097153;
                            b22.saved_music = null;
                        }
                    }
                    org.telegram.messenger.qr.a0(z7Var.a).j2(b22, true);
                    org.telegram.messenger.hs.f(z7Var.a).k(org.telegram.messenger.hs.V3, Long.valueOf(e10));
                }
                runnable.run();
                return;
            default:
                org.telegram.ui.Wallet.o0 o0Var = (org.telegram.ui.Wallet.o0) this.d;
                long j11 = this.b;
                String str = (String) this.e;
                boolean z11 = this.c;
                org.telegram.messenger.u10 u10Var = (org.telegram.messenger.u10) this.f;
                try {
                    obj = org.telegram.ui.Wallet.o0.f;
                    synchronized (obj) {
                        o0Var.c(j11);
                        r5 = o0Var.r();
                    }
                } catch (Exception e11) {
                    e = e11;
                    h0Var = null;
                }
                if (((LinkedHashMap) r5.e).containsKey(str)) {
                    h0Var = o0Var.h(r5, str, j11);
                    try {
                        synchronized (obj) {
                            try {
                                o0Var.c(j11);
                                if (z11) {
                                    r5.b = ConnectionsManager.getInstance(o0Var.b).getCurrentTime();
                                    if (o0Var.d.exists()) {
                                        o0Var.v(r5, new LinkedHashMap());
                                    } else {
                                        if (!o0Var.q().edit().putInt("lastUsageDate", r5.b).commit()) {
                                            throw new IOException("usage write");
                                        }
                                        org.telegram.messenger.g0.h3(new hb1(3));
                                    }
                                }
                            } catch (Exception e12) {
                                org.telegram.messenger.a8.g(e12, true);
                            } finally {
                            }
                        }
                        h0Var2 = h0Var;
                    } catch (Exception e13) {
                        e = e13;
                        org.telegram.messenger.a8.g(e, true);
                        if (h0Var != null) {
                            h0Var.close();
                        }
                        h0Var2 = null;
                        org.telegram.messenger.g0.h3(new ci.l2(o0Var, h0Var2, u10Var, j11, 26));
                        return;
                    }
                    org.telegram.messenger.g0.h3(new ci.l2(o0Var, h0Var2, u10Var, j11, 26));
                    return;
                }
                h0Var2 = null;
                org.telegram.messenger.g0.h3(new ci.l2(o0Var, h0Var2, u10Var, j11, 26));
                return;
        }
    }

    public /* synthetic */ h2(z7 z7Var, long j10, boolean z10, TLRPC.Document document, Runnable runnable) {
        this.d = z7Var;
        this.b = j10;
        this.c = z10;
        this.e = document;
        this.f = runnable;
    }

    public /* synthetic */ h2(org.telegram.ui.Wallet.o0 o0Var, long j10, String str, boolean z10, org.telegram.messenger.u10 u10Var) {
        this.d = o0Var;
        this.b = j10;
        this.e = str;
        this.c = z10;
        this.f = u10Var;
    }
}
