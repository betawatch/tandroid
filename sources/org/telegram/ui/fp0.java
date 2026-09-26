package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final /* synthetic */ class fp0 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ gp0 b;

    public /* synthetic */ fp0(gp0 gp0Var, int i10) {
        this.a = i10;
        this.b = gp0Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        int i10;
        rp0 rp0Var;
        np0 np0Var;
        switch (this.a) {
            case 0:
                Integer num = (Integer) obj;
                gp0 gp0Var = this.b;
                np0 np0Var2 = gp0Var.e;
                TL_stars.StarGift starGift = num.intValue() == 0 ? null : (TL_stars.StarGift) np0Var2.M.get(num);
                np0Var2.K = starGift;
                tp0 tp0Var = np0Var2.p0;
                if (starGift == null) {
                    xh.v3 v3Var = np0Var2.J;
                    if (v3Var != null) {
                        v3Var.f();
                        np0Var2.J = null;
                    }
                } else {
                    xh.v3 v3Var2 = np0Var2.J;
                    if (v3Var2 == null || v3Var2.b != starGift.id) {
                        i10 = ((org.telegram.ui.ActionBar.m2) tp0Var).currentAccount;
                        xh.v3 v3Var3 = new xh.v3(np0Var2.K.id, i10, new fp0(gp0Var, 2));
                        np0Var2.J = v3Var3;
                        v3Var3.g(false);
                    }
                }
                np0.a(np0Var2);
                (tp0Var.I.getCurrentPosition() == 1 ? tp0Var.n : tp0Var.h).e();
                break;
            case 1:
                np0 np0Var3 = this.b.e;
                np0Var3.h = ((Integer) obj).intValue();
                np0Var3.r = null;
                np0Var3.s = null;
                np0Var3.I = null;
                np0Var3.j(true);
                np0Var3.i();
                np0Var3.f(true);
                mp0 mp0Var = np0Var3.y;
                if (mp0Var != null) {
                    mp0Var.invalidate();
                }
                tp0 tp0Var2 = np0Var3.p0;
                np0 np0Var4 = tp0Var2.n;
                if (np0Var4 != null && (rp0Var = np0Var4.a) != null && (np0Var = tp0Var2.h) != null) {
                    rp0Var.a(np0Var.h);
                    break;
                }
                break;
            default:
                this.b.e.e();
                break;
        }
    }
}
