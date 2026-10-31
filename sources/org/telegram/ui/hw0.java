package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class hw0 extends s4.s0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ProfileActivity b;

    public /* synthetic */ hw0(ProfileActivity profileActivity, int i10) {
        this.a = i10;
        this.b = profileActivity;
    }

    @Override // s4.s0
    public final void a(RecyclerView recyclerView, int i10) {
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
                org.telegram.ui.ActionBar.p5 p5Var = profileActivity.T0;
                if (p5Var != null) {
                    boolean z10 = i10 != 0;
                    profileActivity.y1 = z10;
                    p5Var.setEnabled((z10 || profileActivity.o2) ? false : true);
                }
                ix0 ix0Var = profileActivity.N;
                boolean z11 = profileActivity.a.I1;
                ix0Var.getClass();
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
                profileActivity.N3();
                if (profileActivity.B1 != null && !profileActivity.C1 && profileActivity.c.N0() > profileActivity.u4 - 8) {
                    profileActivity.g4(false);
                }
                ix0 ix0Var = profileActivity.N;
                ix0Var.setPinnedToTop(ix0Var.getY() <= 0.0f);
                profileActivity.o5();
                break;
        }
    }
}
