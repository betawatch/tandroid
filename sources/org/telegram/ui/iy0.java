package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class iy0 extends f2.d1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ProfileActivity b;

    public /* synthetic */ iy0(ProfileActivity profileActivity, int i9) {
        this.a = i9;
        this.b = profileActivity;
    }

    @Override // f2.d1
    public final void a(RecyclerView recyclerView, int i9) {
        switch (this.a) {
            case 0:
                if (i9 == 1) {
                    AndroidUtilities.hideKeyboard(this.b.getParentActivity().getCurrentFocus());
                    break;
                }
                break;
            default:
                ProfileActivity profileActivity = this.b;
                if (i9 == 1) {
                    AndroidUtilities.hideKeyboard(profileActivity.getParentActivity().getCurrentFocus());
                }
                if (profileActivity.B0 && i9 != 2) {
                    profileActivity.B0 = false;
                }
                org.telegram.ui.ActionBar.w0 w0Var = profileActivity.Q0;
                if (w0Var != null) {
                    boolean z10 = i9 != 0;
                    profileActivity.v1 = z10;
                    w0Var.setEnabled((z10 || profileActivity.l2) ? false : true);
                }
                hz0 hz0Var = profileActivity.K;
                boolean z11 = profileActivity.a.G1;
                hz0Var.getClass();
                break;
        }
    }

    @Override // f2.d1
    public void b(RecyclerView recyclerView, int i9, int i10) {
        switch (this.a) {
            case 1:
                ProfileActivity profileActivity = this.b;
                org.telegram.ui.Components.s30 s30Var = profileActivity.T;
                if (s30Var != null) {
                    s30Var.b(true);
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
