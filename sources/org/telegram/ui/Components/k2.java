package org.telegram.ui.Components;

import android.content.Context;
import android.net.Uri;
import java.io.IOException;
import java.util.HashSet;
import java.util.LinkedHashMap;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class k2 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ long b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ k2(Context context, String str, long j10, boolean z10, gf.e eVar) {
        this.d = context;
        this.e = str;
        this.b = j10;
        this.c = z10;
        this.f = eVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        org.telegram.ui.Wallet.h0 h0Var;
        org.telegram.ui.Wallet.h0 h0Var2;
        Object obj;
        ix0 r10;
        switch (this.a) {
            case 0:
                gf.f.p((Context) this.d, Uri.parse((String) this.e), this.b == 0, this.c, (gf.e) this.f);
                return;
            case 1:
                w7 w7Var = (w7) this.d;
                long j10 = this.b;
                boolean z10 = this.c;
                TLRPC.Document document = (TLRPC.Document) this.e;
                Runnable runnable = (Runnable) this.f;
                HashSet hashSet = org.telegram.messenger.vp.r1(w7Var.a).G1().b;
                if (z10) {
                    hashSet.add(Long.valueOf(j10));
                } else {
                    hashSet.remove(Long.valueOf(j10));
                }
                long e = org.telegram.messenger.d20.i(w7Var.a).e();
                TLRPC.UserFull a2 = org.telegram.messenger.vp.r1(w7Var.a).a2(e);
                if (a2 != null) {
                    if (z10) {
                        a2.flags2 |= TLObject.FLAG_21;
                        a2.saved_music = document;
                    } else {
                        TLRPC.Document document2 = a2.saved_music;
                        if (document2 != null && document2.id == j10) {
                            a2.flags2 &= -2097153;
                            a2.saved_music = null;
                        }
                    }
                    org.telegram.messenger.hs.a0(w7Var.a).j2(a2, true);
                    org.telegram.messenger.zs.f(w7Var.a).k(org.telegram.messenger.zs.V3, Long.valueOf(e));
                }
                runnable.run();
                return;
            default:
                org.telegram.ui.Wallet.p0 p0Var = (org.telegram.ui.Wallet.p0) this.d;
                long j11 = this.b;
                String str = (String) this.e;
                boolean z11 = this.c;
                org.telegram.messenger.q20 q20Var = (org.telegram.messenger.q20) this.f;
                try {
                    obj = org.telegram.ui.Wallet.p0.f;
                    synchronized (obj) {
                        p0Var.c(j11);
                        r10 = p0Var.r();
                    }
                } catch (Exception e7) {
                    e = e7;
                    h0Var = null;
                }
                if (((LinkedHashMap) r10.e).containsKey(str)) {
                    h0Var = p0Var.h(r10, str, j11);
                    try {
                        synchronized (obj) {
                            try {
                                p0Var.c(j11);
                                if (z11) {
                                    r10.b = ConnectionsManager.getInstance(p0Var.b).getCurrentTime();
                                    if (p0Var.d.exists()) {
                                        p0Var.v(r10, new LinkedHashMap());
                                    } else {
                                        if (!p0Var.q().edit().putInt("lastUsageDate", r10.b).commit()) {
                                            throw new IOException("usage write");
                                        }
                                        org.telegram.messenger.i0.g3(new org.telegram.ui.Components.voip.m0(20));
                                    }
                                }
                            } catch (Exception e10) {
                                org.telegram.messenger.f8.g(e10, true);
                            } finally {
                            }
                        }
                        h0Var2 = h0Var;
                    } catch (Exception e11) {
                        e = e11;
                        org.telegram.messenger.f8.g(e, true);
                        if (h0Var != null) {
                            h0Var.close();
                        }
                        h0Var2 = null;
                        org.telegram.messenger.i0.g3(new ag.a3(p0Var, h0Var2, q20Var, j11, 14));
                        return;
                    }
                    org.telegram.messenger.i0.g3(new ag.a3(p0Var, h0Var2, q20Var, j11, 14));
                    return;
                }
                h0Var2 = null;
                org.telegram.messenger.i0.g3(new ag.a3(p0Var, h0Var2, q20Var, j11, 14));
                return;
        }
    }

    public /* synthetic */ k2(w7 w7Var, long j10, boolean z10, TLRPC.Document document, Runnable runnable) {
        this.d = w7Var;
        this.b = j10;
        this.c = z10;
        this.e = document;
        this.f = runnable;
    }

    public /* synthetic */ k2(org.telegram.ui.Wallet.p0 p0Var, long j10, String str, boolean z10, org.telegram.messenger.q20 q20Var) {
        this.d = p0Var;
        this.b = j10;
        this.e = str;
        this.c = z10;
        this.f = q20Var;
    }
}
