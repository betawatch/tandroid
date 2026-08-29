package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class dy0 extends f2.j0 {
    public final /* synthetic */ ProfileActivity I;

    public dy0(ProfileActivity profileActivity) {
        this.I = profileActivity;
    }

    @Override // f2.j0, f2.w0
    public final int o0(int i10, f2.d1 d1Var, f2.k1 k1Var) {
        ProfileActivity profileActivity = this.I;
        View m10 = profileActivity.c.m(0);
        if (m10 != null && !profileActivity.B0) {
            int top = m10.getTop() - profileActivity.T3();
            boolean z10 = profileActivity.k2;
            if (z10 || top <= i10) {
                if (z10) {
                    if (i10 >= top) {
                        profileActivity.k2 = false;
                    } else if (profileActivity.a.getScrollState() == 1 && !profileActivity.l2) {
                        i10 /= 2;
                    }
                }
            } else if (!profileActivity.j0.T0.isEmpty() && profileActivity.a0.getImageReceiver().hasNotThumb() && !AndroidUtilities.isAccessibilityScreenReaderEnabled() && ((!profileActivity.j2 && !AndroidUtilities.isTablet()) || profileActivity.E0)) {
                profileActivity.k2 = profileActivity.F2 == null;
            }
            i10 = top;
        }
        if (!profileActivity.K1 || profileActivity.a.K0) {
            return super.o0(i10, d1Var, k1Var);
        }
        return 0;
    }

    @Override // f2.j0, f2.w0
    public final boolean y0() {
        return this.I.m0 != null;
    }
}
