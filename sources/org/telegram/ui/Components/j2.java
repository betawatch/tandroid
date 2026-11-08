package org.telegram.ui.Components;

import android.content.Context;
import android.net.Uri;
import java.io.IOException;
import java.util.HashSet;
import java.util.LinkedHashMap;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class j2 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ long b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ j2(Context context, String str, long j3, boolean z9, vf.b bVar) {
        this.d = context;
        this.e = str;
        this.b = j3;
        this.c = z9;
        this.f = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        org.telegram.ui.Wallet.j0 j0Var;
        org.telegram.ui.Wallet.j0 j0Var2;
        Object obj;
        ew0 r10;
        switch (this.a) {
            case 0:
                vf.c.r((Context) this.d, Uri.parse((String) this.e), this.b == 0, this.c, (vf.b) this.f);
                return;
            case 1:
                b8 b8Var = (b8) this.d;
                long j3 = this.b;
                boolean z9 = this.c;
                TLRPC.Document document = (TLRPC.Document) this.e;
                Runnable runnable = (Runnable) this.f;
                HashSet hashSet = org.telegram.messenger.qp.s1(b8Var.a).H1().b;
                if (z9) {
                    hashSet.add(Long.valueOf(j3));
                } else {
                    hashSet.remove(Long.valueOf(j3));
                }
                long e10 = org.telegram.messenger.p10.i(b8Var.a).e();
                TLRPC.UserFull b22 = org.telegram.messenger.qp.s1(b8Var.a).b2(e10);
                if (b22 != null) {
                    if (z9) {
                        b22.flags2 |= TLObject.FLAG_21;
                        b22.saved_music = document;
                    } else {
                        TLRPC.Document document2 = b22.saved_music;
                        if (document2 != null && document2.id == j3) {
                            b22.flags2 &= -2097153;
                            b22.saved_music = null;
                        }
                    }
                    org.telegram.messenger.yr.a0(b8Var.a).j2(b22, true);
                    org.telegram.messenger.qs.f(b8Var.a).k(org.telegram.messenger.qs.V3, Long.valueOf(e10));
                }
                runnable.run();
                return;
            default:
                org.telegram.ui.Wallet.q0 q0Var = (org.telegram.ui.Wallet.q0) this.d;
                long j10 = this.b;
                String str = (String) this.e;
                boolean z10 = this.c;
                org.telegram.messenger.c20 c20Var = (org.telegram.messenger.c20) this.f;
                try {
                    obj = org.telegram.ui.Wallet.q0.f;
                    synchronized (obj) {
                        q0Var.c(j10);
                        r10 = q0Var.r();
                    }
                } catch (Exception e11) {
                    e = e11;
                    j0Var = null;
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
                                        org.telegram.messenger.g0.h3(new org.telegram.ui.o61(4));
                                    }
                                }
                            } catch (Exception e12) {
                                org.telegram.messenger.a8.g(e12, true);
                            } finally {
                            }
                        }
                        j0Var2 = j0Var;
                    } catch (Exception e13) {
                        e = e13;
                        org.telegram.messenger.a8.g(e, true);
                        if (j0Var != null) {
                            j0Var.close();
                        }
                        j0Var2 = null;
                        org.telegram.messenger.g0.h3(new bi.w2(q0Var, j0Var2, c20Var, j10, 26));
                        return;
                    }
                    org.telegram.messenger.g0.h3(new bi.w2(q0Var, j0Var2, c20Var, j10, 26));
                    return;
                }
                j0Var2 = null;
                org.telegram.messenger.g0.h3(new bi.w2(q0Var, j0Var2, c20Var, j10, 26));
                return;
        }
    }

    public /* synthetic */ j2(b8 b8Var, long j3, boolean z9, TLRPC.Document document, Runnable runnable) {
        this.d = b8Var;
        this.b = j3;
        this.c = z9;
        this.e = document;
        this.f = runnable;
    }

    public /* synthetic */ j2(org.telegram.ui.Wallet.q0 q0Var, long j3, String str, boolean z9, org.telegram.messenger.c20 c20Var) {
        this.d = q0Var;
        this.b = j3;
        this.e = str;
        this.c = z9;
        this.f = c20Var;
    }
}
