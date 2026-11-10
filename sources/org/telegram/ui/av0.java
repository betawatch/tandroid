package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class av0 extends v4.s0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ProfileActivity b;

    public /* synthetic */ av0(ProfileActivity profileActivity, int i7) {
        this.a = i7;
        this.b = profileActivity;
    }

    @Override // v4.s0
    public final void a(RecyclerView recyclerView, int i7) {
        View m10;
        switch (this.a) {
            case 0:
                if (i7 == 1) {
                    org.telegram.messenger.g0.v1(this.b.getParentActivity().getCurrentFocus());
                    break;
                }
                break;
            default:
                ProfileActivity profileActivity = this.b;
                if (i7 == 1) {
                    org.telegram.messenger.g0.v1(profileActivity.getParentActivity().getCurrentFocus());
                }
                if (profileActivity.F0 && i7 != 2) {
                    profileActivity.F0 = false;
                }
                if (i7 == 0 && !profileActivity.F1 && (m10 = profileActivity.c.m(0)) != null) {
                    ProfileActivity.R0(profileActivity, m10, 0.0f);
                }
                org.telegram.ui.ActionBar.g5 g5Var = profileActivity.T0;
                if (g5Var != null) {
                    boolean z9 = i7 != 0;
                    profileActivity.y1 = z9;
                    g5Var.setEnabled((z9 || profileActivity.o2) ? false : true);
                }
                yv0 yv0Var = profileActivity.N;
                boolean z10 = profileActivity.a.I1;
                yv0Var.getClass();
                break;
        }
    }

    @Override // v4.s0
    public void b(RecyclerView recyclerView, int i7, int i10) {
        switch (this.a) {
            case 1:
                ProfileActivity profileActivity = this.b;
                fi.m3 m3Var = profileActivity.W;
                if (m3Var != null) {
                    m3Var.f(true);
                }
                profileActivity.O3();
                if (profileActivity.B1 != null && !profileActivity.C1 && profileActivity.c.N0() > profileActivity.u4 - 8) {
                    profileActivity.h4(false);
                }
                yv0 yv0Var = profileActivity.N;
                yv0Var.setPinnedToTop(yv0Var.getY() <= 0.0f);
                profileActivity.s5();
                break;
        }
    }
}
