package org.telegram.ui.Components;

import android.content.Context;
import android.net.Uri;
import java.io.IOException;
import java.util.HashSet;
import java.util.LinkedHashMap;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final /* synthetic */ class s2 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ long b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ s2(Context context, String str, long j3, boolean z10, vf.b bVar) {
        this.d = context;
        this.e = str;
        this.b = j3;
        this.c = z10;
        this.f = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        org.telegram.ui.Wallet.r0 r0Var;
        qw0 s5;
        org.telegram.ui.Wallet.r0 r0Var2 = null;
        switch (this.a) {
            case 0:
                vf.c.r((Context) this.d, Uri.parse((String) this.e), this.b == 0, this.c, (vf.b) this.f);
                return;
            case 1:
                f8 f8Var = (f8) this.d;
                long j3 = this.b;
                boolean z10 = this.c;
                TLRPC.Document document = (TLRPC.Document) this.e;
                Runnable runnable = (Runnable) this.f;
                HashSet hashSet = org.telegram.messenger.np.u1(f8Var.a).J1().b;
                if (z10) {
                    hashSet.add(Long.valueOf(j3));
                } else {
                    hashSet.remove(Long.valueOf(j3));
                }
                long e10 = org.telegram.messenger.k10.i(f8Var.a).e();
                TLRPC.UserFull d2 = org.telegram.messenger.np.u1(f8Var.a).d2(e10);
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
                    org.telegram.messenger.ur.a0(f8Var.a).j2(d2, true);
                    org.telegram.messenger.ls.f(f8Var.a).k(org.telegram.messenger.ls.Y3, Long.valueOf(e10));
                }
                runnable.run();
                return;
            default:
                org.telegram.ui.Wallet.z0 z0Var = (org.telegram.ui.Wallet.z0) this.d;
                long j10 = this.b;
                String str = (String) this.e;
                boolean z11 = this.c;
                org.telegram.messenger.y10 y10Var = (org.telegram.messenger.y10) this.f;
                try {
                    z0Var.f = null;
                    Object obj = org.telegram.ui.Wallet.z0.g;
                    synchronized (obj) {
                        z0Var.c(j10);
                        s5 = z0Var.s();
                    }
                    if (((LinkedHashMap) s5.e).containsKey(str)) {
                        r0Var = z0Var.h(s5, str, j10);
                        try {
                            synchronized (obj) {
                                try {
                                    z0Var.c(j10);
                                    if (z11) {
                                        s5.b = ConnectionsManager.getInstance(z0Var.b).getCurrentTime();
                                        if (z0Var.d.exists()) {
                                            z0Var.w(s5, new LinkedHashMap());
                                        } else {
                                            if (!z0Var.r().edit().putInt("lastUsageDate", s5.b).commit()) {
                                                throw new IOException("usage write");
                                            }
                                            org.telegram.messenger.g0.g3(new org.telegram.ui.cd0(10));
                                        }
                                    }
                                } catch (Exception e11) {
                                    z0Var.m(e11);
                                } finally {
                                }
                            }
                            r0Var2 = r0Var;
                        } catch (Exception e12) {
                            e = e12;
                            z0Var.m(e);
                            if (r0Var != null) {
                                r0Var.close();
                            }
                            org.telegram.messenger.g0.g3(new di.j2(z0Var, r0Var2, y10Var, j10, 25));
                            return;
                        }
                    }
                } catch (Exception e13) {
                    e = e13;
                    r0Var = null;
                }
                org.telegram.messenger.g0.g3(new di.j2(z0Var, r0Var2, y10Var, j10, 25));
                return;
        }
    }

    public /* synthetic */ s2(f8 f8Var, long j3, boolean z10, TLRPC.Document document, Runnable runnable) {
        this.d = f8Var;
        this.b = j3;
        this.c = z10;
        this.e = document;
        this.f = runnable;
    }

    public /* synthetic */ s2(org.telegram.ui.Wallet.z0 z0Var, long j3, String str, boolean z10, org.telegram.messenger.y10 y10Var) {
        this.d = z0Var;
        this.b = j3;
        this.e = str;
        this.c = z10;
        this.f = y10Var;
    }
}
