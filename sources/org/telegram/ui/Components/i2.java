package org.telegram.ui.Components;

import android.content.Context;
import android.net.Uri;
import java.io.IOException;
import java.util.HashSet;
import java.util.LinkedHashMap;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class i2 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ long b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ i2(Context context, String str, long j3, boolean z10, vf.b bVar) {
        this.d = context;
        this.e = str;
        this.b = j3;
        this.c = z10;
        this.f = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        org.telegram.ui.Wallet.i0 i0Var;
        org.telegram.ui.Wallet.i0 i0Var2;
        Object obj;
        hw0 r10;
        switch (this.a) {
            case 0:
                vf.c.r((Context) this.d, Uri.parse((String) this.e), this.b == 0, this.c, (vf.b) this.f);
                return;
            case 1:
                y7 y7Var = (y7) this.d;
                long j3 = this.b;
                boolean z10 = this.c;
                TLRPC.Document document = (TLRPC.Document) this.e;
                Runnable runnable = (Runnable) this.f;
                HashSet hashSet = org.telegram.messenger.np.s1(y7Var.a).H1().b;
                if (z10) {
                    hashSet.add(Long.valueOf(j3));
                } else {
                    hashSet.remove(Long.valueOf(j3));
                }
                long e10 = org.telegram.messenger.m10.i(y7Var.a).e();
                TLRPC.UserFull b22 = org.telegram.messenger.np.s1(y7Var.a).b2(e10);
                if (b22 != null) {
                    if (z10) {
                        b22.flags2 |= TLObject.FLAG_21;
                        b22.saved_music = document;
                    } else {
                        TLRPC.Document document2 = b22.saved_music;
                        if (document2 != null && document2.id == j3) {
                            b22.flags2 &= -2097153;
                            b22.saved_music = null;
                        }
                    }
                    org.telegram.messenger.vr.a0(y7Var.a).j2(b22, true);
                    org.telegram.messenger.ns.f(y7Var.a).k(org.telegram.messenger.ns.V3, Long.valueOf(e10));
                }
                runnable.run();
                return;
            default:
                org.telegram.ui.Wallet.p0 p0Var = (org.telegram.ui.Wallet.p0) this.d;
                long j10 = this.b;
                String str = (String) this.e;
                boolean z11 = this.c;
                org.telegram.messenger.z10 z10Var = (org.telegram.messenger.z10) this.f;
                try {
                    obj = org.telegram.ui.Wallet.p0.f;
                    synchronized (obj) {
                        p0Var.c(j10);
                        r10 = p0Var.r();
                    }
                } catch (Exception e11) {
                    e = e11;
                    i0Var = null;
                }
                if (((LinkedHashMap) r10.e).containsKey(str)) {
                    i0Var = p0Var.h(r10, str, j10);
                    try {
                        synchronized (obj) {
                            try {
                                p0Var.c(j10);
                                if (z11) {
                                    r10.b = ConnectionsManager.getInstance(p0Var.b).getCurrentTime();
                                    if (p0Var.d.exists()) {
                                        p0Var.v(r10, new LinkedHashMap());
                                    } else {
                                        if (!p0Var.q().edit().putInt("lastUsageDate", r10.b).commit()) {
                                            throw new IOException("usage write");
                                        }
                                        org.telegram.messenger.g0.h3(new org.telegram.ui.ah0(8));
                                    }
                                }
                            } catch (Exception e12) {
                                org.telegram.messenger.a8.g(e12, true);
                            } finally {
                            }
                        }
                        i0Var2 = i0Var;
                    } catch (Exception e13) {
                        e = e13;
                        org.telegram.messenger.a8.g(e, true);
                        if (i0Var != null) {
                            i0Var.close();
                        }
                        i0Var2 = null;
                        org.telegram.messenger.g0.h3(new di.f2(p0Var, i0Var2, z10Var, j10, 26));
                        return;
                    }
                    org.telegram.messenger.g0.h3(new di.f2(p0Var, i0Var2, z10Var, j10, 26));
                    return;
                }
                i0Var2 = null;
                org.telegram.messenger.g0.h3(new di.f2(p0Var, i0Var2, z10Var, j10, 26));
                return;
        }
    }

    public /* synthetic */ i2(y7 y7Var, long j3, boolean z10, TLRPC.Document document, Runnable runnable) {
        this.d = y7Var;
        this.b = j3;
        this.c = z10;
        this.e = document;
        this.f = runnable;
    }

    public /* synthetic */ i2(org.telegram.ui.Wallet.p0 p0Var, long j3, String str, boolean z10, org.telegram.messenger.z10 z10Var) {
        this.d = p0Var;
        this.b = j3;
        this.e = str;
        this.c = z10;
        this.f = z10Var;
    }
}
