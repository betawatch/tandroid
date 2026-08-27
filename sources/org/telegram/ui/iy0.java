package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class iy0 extends f2.b1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ProfileActivity b;

    public /* synthetic */ iy0(ProfileActivity profileActivity, int i10) {
        this.a = i10;
        this.b = profileActivity;
    }

    @Override // f2.b1
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
                org.telegram.ui.ActionBar.v0 v0Var = profileActivity.Q0;
                if (v0Var != null) {
                    boolean z10 = i10 != 0;
                    profileActivity.v1 = z10;
                    v0Var.setEnabled((z10 || profileActivity.l2) ? false : true);
                }
                hz0 hz0Var = profileActivity.K;
                boolean z11 = profileActivity.a.G1;
                hz0Var.getClass();
                break;
        }
    }

    @Override // f2.b1
    public void b(RecyclerView recyclerView, int i10, int i11) {
        switch (this.a) {
            case 1:
                ProfileActivity profileActivity = this.b;
                org.telegram.ui.Components.x30 x30Var = profileActivity.T;
                if (x30Var != null) {
                    x30Var.b(true);
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
