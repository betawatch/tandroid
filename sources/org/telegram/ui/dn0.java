package org.telegram.ui;

import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class dn0 implements org.telegram.messenger.r20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ en0 b;

    public /* synthetic */ dn0(en0 en0Var, int i10) {
        this.a = i10;
        this.b = en0Var;
    }

    @Override // org.telegram.messenger.r20
    public final void a(Object obj) {
        int i10;
        pn0 pn0Var;
        ln0 ln0Var;
        switch (this.a) {
            case 0:
                Integer num = (Integer) obj;
                en0 en0Var = this.b;
                ln0 ln0Var2 = en0Var.e;
                TL_stars.StarGift starGift = num.intValue() == 0 ? null : (TL_stars.StarGift) ln0Var2.M.get(num);
                ln0Var2.K = starGift;
                rn0 rn0Var = ln0Var2.p0;
                if (starGift == null) {
                    ph.h3 h3Var = ln0Var2.J;
                    if (h3Var != null) {
                        h3Var.f();
                        ln0Var2.J = null;
                    }
                } else {
                    ph.h3 h3Var2 = ln0Var2.J;
                    if (h3Var2 == null || h3Var2.b != starGift.id) {
                        i10 = ((org.telegram.ui.ActionBar.k2) rn0Var).currentAccount;
                        ph.h3 h3Var3 = new ph.h3(i10, ln0Var2.K.id, new dn0(en0Var, 2));
                        ln0Var2.J = h3Var3;
                        h3Var3.g(false);
                    }
                }
                ln0.a(ln0Var2);
                (rn0Var.I.getCurrentPosition() == 1 ? rn0Var.n : rn0Var.h).e();
                break;
            case 1:
                ln0 ln0Var3 = this.b.e;
                ln0Var3.h = ((Integer) obj).intValue();
                ln0Var3.r = null;
                ln0Var3.s = null;
                ln0Var3.I = null;
                ln0Var3.j(true);
                ln0Var3.i();
                ln0Var3.f(true);
                kn0 kn0Var = ln0Var3.D;
                if (kn0Var != null) {
                    kn0Var.invalidate();
                }
                rn0 rn0Var2 = ln0Var3.p0;
                ln0 ln0Var4 = rn0Var2.n;
                if (ln0Var4 != null && (pn0Var = ln0Var4.a) != null && (ln0Var = rn0Var2.h) != null) {
                    pn0Var.a(ln0Var.h);
                    break;
                }
                break;
            default:
                this.b.e.e();
                break;
        }
    }
}
