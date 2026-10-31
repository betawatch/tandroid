package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class dw0 extends s4.a0 {
    public final /* synthetic */ ProfileActivity I;

    public dw0(ProfileActivity profileActivity) {
        this.I = profileActivity;
    }

    @Override // s4.a0, s4.n0
    public final int o0(int i10, hf.e eVar, s4.z0 z0Var) {
        ProfileActivity profileActivity = this.I;
        View m10 = profileActivity.c.m(0);
        if (m10 != null && !profileActivity.F0) {
            int top = m10.getTop() - profileActivity.i4();
            boolean z10 = profileActivity.n2;
            if (z10 || top <= i10) {
                if (z10) {
                    if (i10 >= top) {
                        profileActivity.n2 = false;
                    } else if (profileActivity.a.getScrollState() == 1 && !profileActivity.o2) {
                        i10 /= 2;
                    }
                }
            } else if (!profileActivity.n0.X0.isEmpty() && profileActivity.e0.getImageReceiver().L() && !org.telegram.messenger.i0.C1() && ((!profileActivity.m2 && !org.telegram.messenger.i0.Q1()) || profileActivity.I0)) {
                profileActivity.n2 = profileActivity.I2 == null;
            }
            i10 = top;
        }
        if (!profileActivity.N1 || profileActivity.a.P0) {
            return super.o0(i10, eVar, z0Var);
        }
        return 0;
    }

    @Override // s4.a0, s4.n0
    public final boolean y0() {
        return this.I.q0 != null;
    }

    @Override // s4.a0
    public final void z0(s4.z0 z0Var, int[] iArr) {
        super.z0(z0Var, iArr);
        iArr[0] = Math.max(iArr[0], ProfileActivity.I0(this.I));
    }
}
