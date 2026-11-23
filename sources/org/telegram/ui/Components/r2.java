package org.telegram.ui.Components;

import android.content.Context;
import android.net.Uri;
import java.io.IOException;
import java.util.HashSet;
import java.util.LinkedHashMap;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class r2 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ long b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ r2(Context context, String str, long j3, boolean z10, vf.b bVar) {
        this.d = context;
        this.e = str;
        this.b = j3;
        this.c = z10;
        this.f = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        org.telegram.ui.Wallet.s0 s0Var;
        pw0 s5;
        org.telegram.ui.Wallet.s0 s0Var2 = null;
        switch (this.a) {
            case 0:
                vf.c.r((Context) this.d, Uri.parse((String) this.e), this.b == 0, this.c, (vf.b) this.f);
                return;
            case 1:
                e8 e8Var = (e8) this.d;
                long j3 = this.b;
                boolean z10 = this.c;
                TLRPC.Document document = (TLRPC.Document) this.e;
                Runnable runnable = (Runnable) this.f;
                HashSet hashSet = org.telegram.messenger.mp.u1(e8Var.a).J1().b;
                if (z10) {
                    hashSet.add(Long.valueOf(j3));
                } else {
                    hashSet.remove(Long.valueOf(j3));
                }
                long e10 = org.telegram.messenger.i10.i(e8Var.a).e();
                TLRPC.UserFull d2 = org.telegram.messenger.mp.u1(e8Var.a).d2(e10);
                if (d2 != null) {
                    if (z10) {
                        d2.flags2 |= TLObject.FLAG_21;
                        d2.saved_music = document;
                    } else {
                        TLRPC.Document document2 = d2.saved_music;
                        if (document2 != null && document2.id == j3) {
                            d2.flags2 &= -2097153;
                            d2.saved_music = null;
                        }
                    }
                    org.telegram.messenger.tr.a0(e8Var.a).j2(d2, true);
                    org.telegram.messenger.ks.f(e8Var.a).k(org.telegram.messenger.ks.Y3, Long.valueOf(e10));
                }
                runnable.run();
                return;
            default:
                org.telegram.ui.Wallet.a1 a1Var = (org.telegram.ui.Wallet.a1) this.d;
                long j10 = this.b;
                String str = (String) this.e;
                boolean z11 = this.c;
                org.telegram.messenger.w10 w10Var = (org.telegram.messenger.w10) this.f;
                try {
                    a1Var.f = null;
                    Object obj = org.telegram.ui.Wallet.a1.g;
                    synchronized (obj) {
                        a1Var.c(j10);
                        s5 = a1Var.s();
                    }
                    if (((LinkedHashMap) s5.e).containsKey(str)) {
                        s0Var = a1Var.h(s5, str, j10);
                        try {
                            synchronized (obj) {
                                try {
                                    a1Var.c(j10);
                                    if (z11) {
                                        s5.b = ConnectionsManager.getInstance(a1Var.b).getCurrentTime();
                                        if (a1Var.d.exists()) {
                                            a1Var.w(s5, new LinkedHashMap());
                                        } else {
                                            if (!a1Var.r().edit().putInt("lastUsageDate", s5.b).commit()) {
                                                throw new IOException("usage write");
                                            }
                                            org.telegram.messenger.g0.g3(new org.telegram.ui.cd0(10));
                                        }
                                    }
                                } catch (Exception e11) {
                                    a1Var.m(e11);
                                } finally {
                                }
                            }
                            s0Var2 = s0Var;
                        } catch (Exception e12) {
                            e = e12;
                            a1Var.m(e);
                            if (s0Var != null) {
                                s0Var.close();
                            }
                            org.telegram.messenger.g0.g3(new di.j2(a1Var, s0Var2, w10Var, j10, 25));
                            return;
                        }
                    }
                } catch (Exception e13) {
                    e = e13;
                    s0Var = null;
                }
                org.telegram.messenger.g0.g3(new di.j2(a1Var, s0Var2, w10Var, j10, 25));
                return;
        }
    }

    public /* synthetic */ r2(e8 e8Var, long j3, boolean z10, TLRPC.Document document, Runnable runnable) {
        this.d = e8Var;
        this.b = j3;
        this.c = z10;
        this.e = document;
        this.f = runnable;
    }

    public /* synthetic */ r2(org.telegram.ui.Wallet.a1 a1Var, long j3, String str, boolean z10, org.telegram.messenger.w10 w10Var) {
        this.d = a1Var;
        this.b = j3;
        this.e = str;
        this.c = z10;
        this.f = w10Var;
    }
}
