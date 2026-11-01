package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class gw0 extends s4.s0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ProfileActivity b;

    public /* synthetic */ gw0(ProfileActivity profileActivity, int i10) {
        this.a = i10;
        this.b = profileActivity;
    }

    @Override // s4.s0
    public final void a(RecyclerView recyclerView, int i10) {
        View m10;
        switch (this.a) {
            case 0:
                if (i10 == 1) {
                    org.telegram.messenger.i0.v1(this.b.getParentActivity().getCurrentFocus());
                    break;
                }
                break;
            default:
                ProfileActivity profileActivity = this.b;
                if (i10 == 1) {
                    org.telegram.messenger.i0.v1(profileActivity.getParentActivity().getCurrentFocus());
                }
                if (profileActivity.F0 && i10 != 2) {
                    profileActivity.F0 = false;
                }
                if (i10 == 0 && !profileActivity.F1 && (m10 = profileActivity.c.m(0)) != null) {
                    ProfileActivity.R0(profileActivity, m10, 0.0f);
                }
                org.telegram.ui.ActionBar.p5 p5Var = profileActivity.T0;
                if (p5Var != null) {
                    boolean z10 = i10 != 0;
                    profileActivity.y1 = z10;
                    p5Var.setEnabled((z10 || profileActivity.o2) ? false : true);
                }
                hx0 hx0Var = profileActivity.N;
                boolean z11 = profileActivity.a.I1;
                hx0Var.getClass();
                break;
        }
    }

    @Override // s4.s0
    public void b(RecyclerView recyclerView, int i10, int i11) {
        switch (this.a) {
            case 1:
                ProfileActivity profileActivity = this.b;
                org.telegram.ui.Components.q30 q30Var = profileActivity.W;
                if (q30Var != null) {
                    q30Var.b(true);
                }
                profileActivity.O3();
                if (profileActivity.B1 != null && !profileActivity.C1 && profileActivity.c.N0() > profileActivity.u4 - 8) {
                    profileActivity.h4(false);
                }
                hx0 hx0Var = profileActivity.N;
                hx0Var.setPinnedToTop(hx0Var.getY() <= 0.0f);
                profileActivity.p5();
                break;
        }
    }
}
