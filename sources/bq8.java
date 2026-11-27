// default package

import android.graphics.RectF;
import android.view.View;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class bq8 extends x46 {
    public final /* synthetic */ ProfileActivity I;

    public bq8(ProfileActivity profileActivity) {
        this.I = profileActivity;
    }

    @Override // x46, q79
    public final int n0(int i, oh2 oh2Var, c89 c89Var) {
        ProfileActivity profileActivity = this.I;
        View m = profileActivity.c.m(0);
        if (m != null && !profileActivity.G0) {
            int top = m.getTop() - profileActivity.d2();
            if (profileActivity.p2) {
                if (i >= top) {
                    profileActivity.p2 = false;
                    i = top;
                } else if (profileActivity.a.getScrollState() == 1 && !profileActivity.q2) {
                    i /= 2;
                }
            } else if (top > i) {
                if (!profileActivity.o0.Y0.isEmpty() && profileActivity.f0.getImageReceiver().E() && !hl.A1() && ((!profileActivity.o2 && !hl.O1()) || profileActivity.J0)) {
                    profileActivity.p2 = profileActivity.K2 == null;
                }
                i = top;
            }
        }
        if (!profileActivity.O1 || profileActivity.a.Q0) {
            return super.n0(i, oh2Var, c89Var);
        }
        return 0;
    }

    @Override // x46, q79
    public final boolean x0() {
        return this.I.r0 != null;
    }

    @Override // x46
    public final void y0(c89 c89Var, int[] iArr) {
        super.y0(c89Var, iArr);
        int i = iArr[0];
        RectF rectF = ProfileActivity.Z6;
        iArr[0] = Math.max(i, this.I.c2());
    }
}
