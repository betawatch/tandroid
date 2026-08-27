package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class dy0 extends f2.k0 {
    public final /* synthetic */ ProfileActivity I;

    public dy0(ProfileActivity profileActivity) {
        this.I = profileActivity;
    }

    @Override // f2.k0, f2.x0
    public final int o0(int i10, f2.e1 e1Var, f2.l1 l1Var) {
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
            return super.o0(i10, e1Var, l1Var);
        }
        return 0;
    }

    @Override // f2.k0, f2.x0
    public final boolean y0() {
        return this.I.m0 != null;
    }
}
