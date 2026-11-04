package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class nu0 extends u4.t0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ProfileActivity b;

    public /* synthetic */ nu0(ProfileActivity profileActivity, int i3) {
        this.a = i3;
        this.b = profileActivity;
    }

    @Override // u4.t0
    public final void a(RecyclerView recyclerView, int i3) {
        View m10;
        switch (this.a) {
            case 0:
                if (i3 == 1) {
                    org.telegram.messenger.g0.v1(this.b.getParentActivity().getCurrentFocus());
                    break;
                }
                break;
            default:
                ProfileActivity profileActivity = this.b;
                if (i3 == 1) {
                    org.telegram.messenger.g0.v1(profileActivity.getParentActivity().getCurrentFocus());
                }
                if (profileActivity.G0 && i3 != 2) {
                    profileActivity.G0 = false;
                }
                if (i3 == 0 && !profileActivity.G1 && (m10 = profileActivity.c.m(0)) != null) {
                    ProfileActivity.R0(profileActivity, m10, 0.0f);
                }
                org.telegram.ui.ActionBar.f5 f5Var = profileActivity.U0;
                if (f5Var != null) {
                    boolean z10 = i3 != 0;
                    profileActivity.z1 = z10;
                    f5Var.setEnabled((z10 || profileActivity.p2) ? false : true);
                }
                mv0 mv0Var = profileActivity.O;
                boolean z11 = profileActivity.a.J1;
                mv0Var.getClass();
                break;
        }
    }

    @Override // u4.t0
    public void b(RecyclerView recyclerView, int i3, int i10) {
        switch (this.a) {
            case 1:
                ProfileActivity profileActivity = this.b;
                gi.l3 l3Var = profileActivity.X;
                if (l3Var != null) {
                    l3Var.f(true);
                }
                profileActivity.O3();
                if (profileActivity.C1 != null && !profileActivity.D1 && profileActivity.c.N0() > profileActivity.v4 - 8) {
                    profileActivity.h4(false);
                }
                mv0 mv0Var = profileActivity.O;
                mv0Var.setPinnedToTop(mv0Var.getY() <= 0.0f);
                profileActivity.p5();
                break;
        }
    }
}
