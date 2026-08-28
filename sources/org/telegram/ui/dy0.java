package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class dy0 extends f2.m0 {
    public final /* synthetic */ ProfileActivity I;

    public dy0(ProfileActivity profileActivity) {
        this.I = profileActivity;
    }

    @Override // f2.m0, f2.z0
    public final int o0(int i9, f2.g1 g1Var, f2.n1 n1Var) {
        ProfileActivity profileActivity = this.I;
        View m10 = profileActivity.c.m(0);
        if (m10 != null && !profileActivity.B0) {
            int top = m10.getTop() - profileActivity.T3();
            boolean z10 = profileActivity.k2;
            if (z10 || top <= i9) {
                if (z10) {
                    if (i9 >= top) {
                        profileActivity.k2 = false;
                    } else if (profileActivity.a.getScrollState() == 1 && !profileActivity.l2) {
                        i9 /= 2;
                    }
                }
            } else if (!profileActivity.j0.T0.isEmpty() && profileActivity.a0.getImageReceiver().hasNotThumb() && !AndroidUtilities.isAccessibilityScreenReaderEnabled() && ((!profileActivity.j2 && !AndroidUtilities.isTablet()) || profileActivity.E0)) {
                profileActivity.k2 = profileActivity.F2 == null;
            }
            i9 = top;
        }
        if (!profileActivity.K1 || profileActivity.a.K0) {
            return super.o0(i9, g1Var, n1Var);
        }
        return 0;
    }

    @Override // f2.m0, f2.z0
    public final boolean y0() {
        return this.I.m0 != null;
    }
}
