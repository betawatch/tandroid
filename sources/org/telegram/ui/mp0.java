package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final /* synthetic */ class mp0 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ np0 b;

    public /* synthetic */ mp0(np0 np0Var, int i10) {
        this.a = i10;
        this.b = np0Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        int i10;
        yp0 yp0Var;
        up0 up0Var;
        switch (this.a) {
            case 0:
                Integer num = (Integer) obj;
                np0 np0Var = this.b;
                up0 up0Var2 = np0Var.e;
                TL_stars.StarGift starGift = num.intValue() == 0 ? null : (TL_stars.StarGift) up0Var2.M.get(num);
                up0Var2.K = starGift;
                aq0 aq0Var = up0Var2.p0;
                if (starGift == null) {
                    xh.u3 u3Var = up0Var2.J;
                    if (u3Var != null) {
                        u3Var.f();
                        up0Var2.J = null;
                    }
                } else {
                    xh.u3 u3Var2 = up0Var2.J;
                    if (u3Var2 == null || u3Var2.b != starGift.id) {
                        i10 = ((org.telegram.ui.ActionBar.n2) aq0Var).currentAccount;
                        xh.u3 u3Var3 = new xh.u3(up0Var2.K.id, i10, new mp0(np0Var, 2));
                        up0Var2.J = u3Var3;
                        u3Var3.g(false);
                    }
                }
                up0.a(up0Var2);
                (aq0Var.I.getCurrentPosition() == 1 ? aq0Var.n : aq0Var.h).e();
                break;
            case 1:
                up0 up0Var3 = this.b.e;
                up0Var3.h = ((Integer) obj).intValue();
                up0Var3.r = null;
                up0Var3.s = null;
                up0Var3.I = null;
                up0Var3.j(true);
                up0Var3.i();
                up0Var3.f(true);
                tp0 tp0Var = up0Var3.y;
                if (tp0Var != null) {
                    tp0Var.invalidate();
                }
                aq0 aq0Var2 = up0Var3.p0;
                up0 up0Var4 = aq0Var2.n;
                if (up0Var4 != null && (yp0Var = up0Var4.a) != null && (up0Var = aq0Var2.h) != null) {
                    yp0Var.a(up0Var.h);
                    break;
                }
                break;
            default:
                this.b.e.e();
                break;
        }
    }
}
