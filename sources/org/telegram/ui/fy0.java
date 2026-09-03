package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class fy0 implements h5.d {
    public final /* synthetic */ int a;
    public final /* synthetic */ ProfileActivity b;

    public /* synthetic */ fy0(ProfileActivity profileActivity, int i10) {
        this.a = i10;
        this.b = profileActivity;
    }

    @Override // h5.d
    public final void accept(Object obj) {
        View view = (View) obj;
        switch (this.a) {
            case 0:
                if (view instanceof org.telegram.ui.Cells.x8) {
                    org.telegram.ui.Cells.x8 x8Var = (org.telegram.ui.Cells.x8) view;
                    ih.s sVar = x8Var.a;
                    ProfileActivity profileActivity = this.b;
                    sVar.setLoading(profileActivity.f5);
                    x8Var.b.setLoading(profileActivity.f5);
                    break;
                }
                break;
            default:
                boolean z4 = view instanceof org.telegram.ui.Cells.l4;
                ProfileActivity profileActivity2 = this.b;
                if (z4) {
                    ((org.telegram.ui.Cells.l4) view).setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.L6, profileActivity2.w0));
                } else if (view instanceof org.telegram.ui.Cells.x8) {
                    ((org.telegram.ui.Cells.x8) view).e();
                } else if (view instanceof org.telegram.ui.Cells.n8) {
                    ((org.telegram.ui.Cells.n8) view).v();
                } else if (view instanceof org.telegram.ui.Cells.j) {
                    org.telegram.ui.ActionBar.j6.P1.linkColor = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.gc, ((org.telegram.ui.Cells.j) view).F);
                } else if (view instanceof org.telegram.ui.Cells.i5) {
                    ((org.telegram.ui.Cells.i5) view).getCheckBox().invalidate();
                } else if (view instanceof uf.a1) {
                    uf.a1 a1Var = (uf.a1) view;
                    org.telegram.ui.Components.aq aqVar = a1Var.r;
                    int dp = AndroidUtilities.dp(8.0f);
                    int i10 = org.telegram.ui.ActionBar.j6.o6;
                    org.telegram.ui.ActionBar.f6 f6Var = a1Var.a;
                    int v02 = org.telegram.ui.ActionBar.j6.v0(i10, f6Var);
                    a1Var.a(v02);
                    int l1 = org.telegram.ui.ActionBar.j6.l1(0.1f, v02);
                    int v03 = org.telegram.ui.ActionBar.j6.v0(i10, f6Var);
                    a1Var.a(v03);
                    int l12 = org.telegram.ui.ActionBar.j6.l1(0.22f, v03);
                    aqVar.setBackground(org.telegram.ui.ActionBar.j6.i0(dp, dp, dp, dp, l1, l12, l12));
                    int v04 = org.telegram.ui.ActionBar.j6.v0(i10, f6Var);
                    a1Var.a(v04);
                    aqVar.setTextColor(v04);
                } else if (view instanceof org.telegram.ui.Cells.f6) {
                    ((org.telegram.ui.Cells.f6) view).e();
                }
                n01 n01Var = profileActivity2.d;
                profileActivity2.a.getClass();
                RecyclerView.R(view);
                n01Var.getClass();
                profileActivity2.d.getClass();
                break;
        }
    }
}
