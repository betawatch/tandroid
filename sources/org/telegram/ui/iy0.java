package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class iy0 extends f2.a1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ProfileActivity b;

    public /* synthetic */ iy0(ProfileActivity profileActivity, int i10) {
        this.a = i10;
        this.b = profileActivity;
    }

    @Override // f2.a1
    public final void a(RecyclerView recyclerView, int i10) {
        switch (this.a) {
            case 0:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(this.b.getParentActivity().getCurrentFocus());
                    break;
                }
                break;
            default:
                ProfileActivity profileActivity = this.b;
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(profileActivity.getParentActivity().getCurrentFocus());
                }
                if (profileActivity.B0 && i10 != 2) {
                    profileActivity.B0 = false;
                }
                org.telegram.ui.ActionBar.w0 w0Var = profileActivity.Q0;
                if (w0Var != null) {
                    boolean z10 = i10 != 0;
                    profileActivity.v1 = z10;
                    w0Var.setEnabled((z10 || profileActivity.l2) ? false : true);
                }
                hz0 hz0Var = profileActivity.K;
                boolean z11 = profileActivity.a.G1;
                hz0Var.getClass();
                break;
        }
    }

    @Override // f2.a1
    public void b(RecyclerView recyclerView, int i10, int i11) {
        switch (this.a) {
            case 1:
                ProfileActivity profileActivity = this.b;
                org.telegram.ui.Components.g40 g40Var = profileActivity.T;
                if (g40Var != null) {
                    g40Var.b(true);
                }
                profileActivity.A3();
                if (profileActivity.y1 != null && !profileActivity.z1 && profileActivity.c.N0() > profileActivity.r4 - 8) {
                    profileActivity.R3(false);
                }
                hz0 hz0Var = profileActivity.K;
                hz0Var.setPinnedToTop(hz0Var.getY() <= 0.0f);
                profileActivity.U4();
                break;
        }
    }
}
