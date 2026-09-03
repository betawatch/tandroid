package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class az0 extends f2.a1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ProfileActivity b;

    public /* synthetic */ az0(ProfileActivity profileActivity, int i10) {
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
                if (profileActivity.C0 && i10 != 2) {
                    profileActivity.C0 = false;
                }
                org.telegram.ui.ActionBar.w0 w0Var = profileActivity.R0;
                if (w0Var != null) {
                    boolean z4 = i10 != 0;
                    profileActivity.w1 = z4;
                    w0Var.setEnabled((z4 || profileActivity.m2) ? false : true);
                }
                zz0 zz0Var = profileActivity.L;
                boolean z10 = profileActivity.a.H1;
                zz0Var.getClass();
                break;
        }
    }

    @Override // f2.a1
    public void b(RecyclerView recyclerView, int i10, int i11) {
        switch (this.a) {
            case 1:
                ProfileActivity profileActivity = this.b;
                org.telegram.ui.Components.m40 m40Var = profileActivity.U;
                if (m40Var != null) {
                    m40Var.b(true);
                }
                profileActivity.A3();
                if (profileActivity.z1 != null && !profileActivity.A1 && profileActivity.c.N0() > profileActivity.s4 - 8) {
                    profileActivity.R3(false);
                }
                zz0 zz0Var = profileActivity.L;
                zz0Var.setPinnedToTop(zz0Var.getY() <= 0.0f);
                profileActivity.U4();
                break;
        }
    }
}
