package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class ju0 extends u4.b0 {
    public final /* synthetic */ ProfileActivity I;

    public ju0(ProfileActivity profileActivity) {
        this.I = profileActivity;
    }

    @Override // u4.b0, u4.o0
    public final int o0(int i3, tf.e eVar, u4.a1 a1Var) {
        ProfileActivity profileActivity = this.I;
        View m10 = profileActivity.c.m(0);
        if (m10 != null && !profileActivity.G0) {
            int top = m10.getTop() - profileActivity.j4();
            boolean z10 = profileActivity.o2;
            if (z10 || top <= i3) {
                if (z10) {
                    if (i3 >= top) {
                        profileActivity.o2 = false;
                    } else if (profileActivity.a.getScrollState() == 1 && !profileActivity.p2) {
                        i3 /= 2;
                    }
                }
            } else if (!profileActivity.o0.Y0.isEmpty() && profileActivity.f0.getImageReceiver().L() && !org.telegram.messenger.g0.C1() && ((!profileActivity.n2 && !org.telegram.messenger.g0.Q1()) || profileActivity.J0)) {
                profileActivity.o2 = profileActivity.J2 == null;
            }
            i3 = top;
        }
        if (!profileActivity.O1 || profileActivity.a.Q0) {
            return super.o0(i3, eVar, a1Var);
        }
        return 0;
    }

    @Override // u4.b0, u4.o0
    public final boolean y0() {
        return this.I.r0 != null;
    }

    @Override // u4.b0
    public final void z0(u4.a1 a1Var, int[] iArr) {
        super.z0(a1Var, iArr);
        iArr[0] = Math.max(iArr[0], ProfileActivity.J0(this.I));
    }
}
