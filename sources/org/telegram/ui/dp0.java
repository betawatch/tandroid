package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class dp0 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ ep0 b;

    public /* synthetic */ dp0(ep0 ep0Var, int i10) {
        this.a = i10;
        this.b = ep0Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        int i10;
        pp0 pp0Var;
        lp0 lp0Var;
        switch (this.a) {
            case 0:
                Integer num = (Integer) obj;
                ep0 ep0Var = this.b;
                lp0 lp0Var2 = ep0Var.e;
                TL_stars.StarGift starGift = num.intValue() == 0 ? null : (TL_stars.StarGift) lp0Var2.M.get(num);
                lp0Var2.K = starGift;
                rp0 rp0Var = lp0Var2.p0;
                if (starGift == null) {
                    zh.u3 u3Var = lp0Var2.J;
                    if (u3Var != null) {
                        u3Var.a();
                        lp0Var2.J = null;
                    }
                } else {
                    zh.u3 u3Var2 = lp0Var2.J;
                    if (u3Var2 == null || u3Var2.b != starGift.id) {
                        i10 = ((org.telegram.ui.ActionBar.r2) rp0Var).currentAccount;
                        zh.u3 u3Var3 = new zh.u3(lp0Var2.K.id, i10, new dp0(ep0Var, 2));
                        lp0Var2.J = u3Var3;
                        u3Var3.g(false);
                    }
                }
                lp0.a(lp0Var2);
                (rp0Var.I.getCurrentPosition() == 1 ? rp0Var.n : rp0Var.h).e();
                break;
            case 1:
                lp0 lp0Var3 = this.b.e;
                lp0Var3.h = ((Integer) obj).intValue();
                lp0Var3.r = null;
                lp0Var3.s = null;
                lp0Var3.I = null;
                lp0Var3.j(true);
                lp0Var3.i();
                lp0Var3.f(true);
                kp0 kp0Var = lp0Var3.y;
                if (kp0Var != null) {
                    kp0Var.invalidate();
                }
                rp0 rp0Var2 = lp0Var3.p0;
                lp0 lp0Var4 = rp0Var2.n;
                if (lp0Var4 != null && (pp0Var = lp0Var4.a) != null && (lp0Var = rp0Var2.h) != null) {
                    pp0Var.a(lp0Var.h);
                    break;
                }
                break;
            default:
                this.b.e.e();
                break;
        }
    }
}
