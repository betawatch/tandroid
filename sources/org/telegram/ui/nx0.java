package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class nx0 implements f5.d {
    public final /* synthetic */ int a;
    public final /* synthetic */ ProfileActivity b;

    public /* synthetic */ nx0(ProfileActivity profileActivity, int i10) {
        this.a = i10;
        this.b = profileActivity;
    }

    @Override // f5.d
    public final void accept(Object obj) {
        View view = (View) obj;
        switch (this.a) {
            case 0:
                if (view instanceof org.telegram.ui.Cells.w8) {
                    org.telegram.ui.Cells.w8 w8Var = (org.telegram.ui.Cells.w8) view;
                    gh.s sVar = w8Var.a;
                    ProfileActivity profileActivity = this.b;
                    sVar.setLoading(profileActivity.e5);
                    w8Var.b.setLoading(profileActivity.e5);
                    break;
                }
                break;
            default:
                boolean z10 = view instanceof org.telegram.ui.Cells.k4;
                ProfileActivity profileActivity2 = this.b;
                if (z10) {
                    ((org.telegram.ui.Cells.k4) view).setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.L6, profileActivity2.v0));
                } else if (view instanceof org.telegram.ui.Cells.w8) {
                    ((org.telegram.ui.Cells.w8) view).e();
                } else if (view instanceof org.telegram.ui.Cells.m8) {
                    ((org.telegram.ui.Cells.m8) view).v();
                } else if (view instanceof org.telegram.ui.Cells.j) {
                    org.telegram.ui.ActionBar.g6.P1.linkColor = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.gc, ((org.telegram.ui.Cells.j) view).E);
                } else if (view instanceof org.telegram.ui.Cells.h5) {
                    ((org.telegram.ui.Cells.h5) view).getCheckBox().invalidate();
                } else if (view instanceof sf.a1) {
                    sf.a1 a1Var = (sf.a1) view;
                    org.telegram.ui.Components.xp xpVar = a1Var.r;
                    int dp = AndroidUtilities.dp(8.0f);
                    int i10 = org.telegram.ui.ActionBar.g6.o6;
                    org.telegram.ui.ActionBar.c6 c6Var = a1Var.a;
                    int v02 = org.telegram.ui.ActionBar.g6.v0(i10, c6Var);
                    a1Var.a(v02);
                    int l1 = org.telegram.ui.ActionBar.g6.l1(0.1f, v02);
                    int v03 = org.telegram.ui.ActionBar.g6.v0(i10, c6Var);
                    a1Var.a(v03);
                    int l12 = org.telegram.ui.ActionBar.g6.l1(0.22f, v03);
                    xpVar.setBackground(org.telegram.ui.ActionBar.g6.i0(dp, dp, dp, dp, l1, l12, l12));
                    int v04 = org.telegram.ui.ActionBar.g6.v0(i10, c6Var);
                    a1Var.a(v04);
                    xpVar.setTextColor(v04);
                } else if (view instanceof org.telegram.ui.Cells.e6) {
                    ((org.telegram.ui.Cells.e6) view).e();
                }
                vz0 vz0Var = profileActivity2.d;
                profileActivity2.a.getClass();
                RecyclerView.R(view);
                vz0Var.getClass();
                profileActivity2.d.getClass();
                break;
        }
    }
}
