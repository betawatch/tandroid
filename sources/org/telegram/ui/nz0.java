package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class nz0 extends s4.b0 {
    public final /* synthetic */ ProfileActivity I;

    public nz0(ProfileActivity profileActivity) {
        this.I = profileActivity;
    }

    @Override // s4.b0, s4.n0
    public final int o0(int i10, qf.e eVar, s4.y0 y0Var) {
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
        if (!profileActivity.O1 || profileActivity.a.P0) {
            return super.o0(i10, eVar, y0Var);
        }
        return 0;
    }

    @Override // s4.b0, s4.n0
    public final boolean y0() {
        return this.I.q0 != null;
    }
}
