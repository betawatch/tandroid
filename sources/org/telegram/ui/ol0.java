package org.telegram.ui;

import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ol0 implements org.telegram.messenger.u10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ pl0 b;

    public /* synthetic */ ol0(pl0 pl0Var, int i3) {
        this.a = i3;
        this.b = pl0Var;
    }

    @Override // org.telegram.messenger.u10
    public final void a(Object obj) {
        int i3;
        am0 am0Var;
        wl0 wl0Var;
        switch (this.a) {
            case 0:
                Integer num = (Integer) obj;
                pl0 pl0Var = this.b;
                wl0 wl0Var2 = pl0Var.e;
                TL_stars.StarGift starGift = num.intValue() == 0 ? null : (TL_stars.StarGift) wl0Var2.N.get(num);
                wl0Var2.L = starGift;
                cm0 cm0Var = wl0Var2.q0;
                if (starGift == null) {
                    ai.w5 w5Var = wl0Var2.K;
                    if (w5Var != null) {
                        w5Var.f();
                        wl0Var2.K = null;
                    }
                } else {
                    ai.w5 w5Var2 = wl0Var2.K;
                    if (w5Var2 == null || w5Var2.b != starGift.id) {
                        i3 = ((org.telegram.ui.ActionBar.d2) cm0Var).currentAccount;
                        ai.w5 w5Var3 = new ai.w5(i3, wl0Var2.L.id, new ol0(pl0Var, 2));
                        wl0Var2.K = w5Var3;
                        w5Var3.g(false);
                    }
                }
                wl0.a(wl0Var2);
                (cm0Var.J.getCurrentPosition() == 1 ? cm0Var.n : cm0Var.h).e();
                break;
            case 1:
                wl0 wl0Var3 = this.b.e;
                wl0Var3.h = ((Integer) obj).intValue();
                wl0Var3.r = null;
                wl0Var3.s = null;
                wl0Var3.J = null;
                wl0Var3.j(true);
                wl0Var3.i();
                wl0Var3.f(true);
                vl0 vl0Var = wl0Var3.E;
                if (vl0Var != null) {
                    vl0Var.invalidate();
                }
                cm0 cm0Var2 = wl0Var3.q0;
                wl0 wl0Var4 = cm0Var2.n;
                if (wl0Var4 != null && (am0Var = wl0Var4.a) != null && (wl0Var = cm0Var2.h) != null) {
                    am0Var.a(wl0Var.h);
                    break;
                }
                break;
            default:
                this.b.e.e();
                break;
        }
    }
}
