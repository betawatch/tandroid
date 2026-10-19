package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class jy0 extends s4.b0 {
    public final /* synthetic */ ProfileActivity I;

    public jy0(ProfileActivity profileActivity) {
        this.I = profileActivity;
    }

    @Override // s4.b0, s4.n0
    public final int o0(int i10, qf.e eVar, s4.y0 y0Var) {
        ProfileActivity profileActivity = this.I;
        View m10 = profileActivity.c.m(0);
        if (m10 != null && !profileActivity.G0) {
            int top = m10.getTop() - profileActivity.T3();
            boolean z10 = profileActivity.p2;
            if (z10 || top <= i10) {
                if (z10) {
                    if (i10 >= top) {
                        profileActivity.p2 = false;
                    } else if (profileActivity.a.getScrollState() == 1 && !profileActivity.q2) {
                        i10 /= 2;
                    }
                }
            } else if (!profileActivity.o0.X0.isEmpty() && profileActivity.f0.getImageReceiver().hasNotThumb() && !AndroidUtilities.isAccessibilityScreenReaderEnabled() && ((!profileActivity.o2 && !AndroidUtilities.isTablet()) || profileActivity.J0)) {
                profileActivity.p2 = profileActivity.K2 == null;
            }
            i10 = top;
        }
        if (!profileActivity.P1 || profileActivity.a.P0) {
            return super.o0(i10, eVar, y0Var);
        }
        return 0;
    }

    @Override // s4.b0, s4.n0
    public final boolean y0() {
        return this.I.r0 != null;
    }
}
