package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class nx0 implements d5.d {
    public final /* synthetic */ int a;
    public final /* synthetic */ ProfileActivity b;

    public /* synthetic */ nx0(ProfileActivity profileActivity, int i9) {
        this.a = i9;
        this.b = profileActivity;
    }

    @Override // d5.d
    public final void accept(Object obj) {
        View view = (View) obj;
        switch (this.a) {
            case 0:
                if (view instanceof org.telegram.ui.Cells.z8) {
                    org.telegram.ui.Cells.z8 z8Var = (org.telegram.ui.Cells.z8) view;
                    dh.u uVar = z8Var.a;
                    ProfileActivity profileActivity = this.b;
                    uVar.setLoading(profileActivity.e5);
                    z8Var.b.setLoading(profileActivity.e5);
                    break;
                }
                break;
            default:
                boolean z10 = view instanceof org.telegram.ui.Cells.m4;
                ProfileActivity profileActivity2 = this.b;
                if (z10) {
                    ((org.telegram.ui.Cells.m4) view).setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.L6, profileActivity2.v0));
                } else if (view instanceof org.telegram.ui.Cells.z8) {
                    ((org.telegram.ui.Cells.z8) view).e();
                } else if (view instanceof org.telegram.ui.Cells.p8) {
                    ((org.telegram.ui.Cells.p8) view).v();
                } else if (view instanceof org.telegram.ui.Cells.j) {
                    org.telegram.ui.ActionBar.f6.P1.linkColor = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.gc, ((org.telegram.ui.Cells.j) view).E);
                } else if (view instanceof org.telegram.ui.Cells.j5) {
                    ((org.telegram.ui.Cells.j5) view).getCheckBox().invalidate();
                } else if (view instanceof pf.b1) {
                    pf.b1 b1Var = (pf.b1) view;
                    org.telegram.ui.Components.tp tpVar = b1Var.r;
                    int dp = AndroidUtilities.dp(8.0f);
                    int i9 = org.telegram.ui.ActionBar.f6.o6;
                    org.telegram.ui.ActionBar.b6 b6Var = b1Var.a;
                    int v02 = org.telegram.ui.ActionBar.f6.v0(i9, b6Var);
                    b1Var.a(v02);
                    int l1 = org.telegram.ui.ActionBar.f6.l1(0.1f, v02);
                    int v03 = org.telegram.ui.ActionBar.f6.v0(i9, b6Var);
                    b1Var.a(v03);
                    int l12 = org.telegram.ui.ActionBar.f6.l1(0.22f, v03);
                    tpVar.setBackground(org.telegram.ui.ActionBar.f6.i0(dp, dp, dp, dp, l1, l12, l12));
                    int v04 = org.telegram.ui.ActionBar.f6.v0(i9, b6Var);
                    b1Var.a(v04);
                    tpVar.setTextColor(v04);
                } else if (view instanceof org.telegram.ui.Cells.g6) {
                    ((org.telegram.ui.Cells.g6) view).d();
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
