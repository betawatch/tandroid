package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class op0 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ pp0 b;

    public /* synthetic */ op0(pp0 pp0Var, int i10) {
        this.a = i10;
        this.b = pp0Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        int i10;
        aq0 aq0Var;
        wp0 wp0Var;
        switch (this.a) {
            case 0:
                Integer num = (Integer) obj;
                pp0 pp0Var = this.b;
                wp0 wp0Var2 = pp0Var.e;
                TL_stars.StarGift starGift = num.intValue() == 0 ? null : (TL_stars.StarGift) wp0Var2.M.get(num);
                wp0Var2.K = starGift;
                cq0 cq0Var = wp0Var2.p0;
                if (starGift == null) {
                    xh.u3 u3Var = wp0Var2.J;
                    if (u3Var != null) {
                        u3Var.f();
                        wp0Var2.J = null;
                    }
                } else {
                    xh.u3 u3Var2 = wp0Var2.J;
                    if (u3Var2 == null || u3Var2.b != starGift.id) {
                        i10 = ((org.telegram.ui.ActionBar.o2) cq0Var).currentAccount;
                        xh.u3 u3Var3 = new xh.u3(wp0Var2.K.id, i10, new op0(pp0Var, 2));
                        wp0Var2.J = u3Var3;
                        u3Var3.g(false);
                    }
                }
                wp0.a(wp0Var2);
                (cq0Var.I.getCurrentPosition() == 1 ? cq0Var.n : cq0Var.h).e();
                break;
            case 1:
                wp0 wp0Var3 = this.b.e;
                wp0Var3.h = ((Integer) obj).intValue();
                wp0Var3.r = null;
                wp0Var3.s = null;
                wp0Var3.I = null;
                wp0Var3.j(true);
                wp0Var3.i();
                wp0Var3.f(true);
                vp0 vp0Var = wp0Var3.y;
                if (vp0Var != null) {
                    vp0Var.invalidate();
                }
                cq0 cq0Var2 = wp0Var3.p0;
                wp0 wp0Var4 = cq0Var2.n;
                if (wp0Var4 != null && (aq0Var = wp0Var4.a) != null && (wp0Var = cq0Var2.h) != null) {
                    aq0Var.a(wp0Var.h);
                    break;
                }
                break;
            default:
                this.b.e.e();
                break;
        }
    }
}
