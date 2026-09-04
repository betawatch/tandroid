package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class iz0 extends s4.c0 {
    public final /* synthetic */ ProfileActivity I;

    public iz0(ProfileActivity profileActivity) {
        this.I = profileActivity;
    }

    @Override // s4.c0, s4.o0
    public final int o0(int i10, pf.e eVar, s4.z0 z0Var) {
        ProfileActivity profileActivity = this.I;
        View m10 = profileActivity.c.m(0);
        if (m10 != null && !profileActivity.F0) {
            int top = m10.getTop() - profileActivity.T3();
            boolean z10 = profileActivity.o2;
            if (z10 || top <= i10) {
                if (z10) {
                    if (i10 >= top) {
                        profileActivity.o2 = false;
                    } else if (profileActivity.a.getScrollState() == 1 && !profileActivity.p2) {
                        i10 /= 2;
                    }
                }
            } else if (!profileActivity.n0.X0.isEmpty() && profileActivity.e0.getImageReceiver().hasNotThumb() && !AndroidUtilities.isAccessibilityScreenReaderEnabled() && ((!profileActivity.n2 && !AndroidUtilities.isTablet()) || profileActivity.I0)) {
                profileActivity.o2 = profileActivity.J2 == null;
            }
            i10 = top;
        }
        if (!profileActivity.O1 || profileActivity.a.O0) {
            return super.o0(i10, eVar, z0Var);
        }
        return 0;
    }

    @Override // s4.c0, s4.o0
    public final boolean y0() {
        return this.I.q0 != null;
    }
}
