package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class oz0 extends s4.s0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ProfileActivity b;

    public /* synthetic */ oz0(ProfileActivity profileActivity, int i10) {
        this.a = i10;
        this.b = profileActivity;
    }

    @Override // s4.s0
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
                if (profileActivity.F0 && i10 != 2) {
                    profileActivity.F0 = false;
                }
                org.telegram.ui.ActionBar.w0 w0Var = profileActivity.U0;
                if (w0Var != null) {
                    boolean z10 = i10 != 0;
                    profileActivity.z1 = z10;
                    w0Var.setEnabled((z10 || profileActivity.p2) ? false : true);
                }
                n01 n01Var = profileActivity.O;
                boolean z11 = profileActivity.a.K1;
                n01Var.getClass();
                break;
        }
    }

    @Override // s4.s0
    public void b(RecyclerView recyclerView, int i10, int i11) {
        switch (this.a) {
            case 1:
                ProfileActivity profileActivity = this.b;
                org.telegram.ui.Components.i40 i40Var = profileActivity.X;
                if (i40Var != null) {
                    i40Var.b(true);
                }
                profileActivity.A3();
                if (profileActivity.C1 != null && !profileActivity.D1 && profileActivity.c.N0() > profileActivity.v4 - 8) {
                    profileActivity.R3(false);
                }
                n01 n01Var = profileActivity.O;
                n01Var.setPinnedToTop(n01Var.getY() <= 0.0f);
                profileActivity.U4();
                break;
        }
    }
}
