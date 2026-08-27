package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ox0 implements d5.d {
    public final /* synthetic */ int a;
    public final /* synthetic */ ProfileActivity b;

    public /* synthetic */ ox0(ProfileActivity profileActivity, int i10) {
        this.a = i10;
        this.b = profileActivity;
    }

    @Override // d5.d
    public final void accept(Object obj) {
        View view = (View) obj;
        switch (this.a) {
            case 0:
                if (view instanceof org.telegram.ui.Cells.v8) {
                    org.telegram.ui.Cells.v8 v8Var = (org.telegram.ui.Cells.v8) view;
                    eh.s sVar = v8Var.a;
                    ProfileActivity profileActivity = this.b;
                    sVar.setLoading(profileActivity.e5);
                    v8Var.b.setLoading(profileActivity.e5);
                    break;
                }
                break;
            default:
                boolean z10 = view instanceof org.telegram.ui.Cells.j4;
                ProfileActivity profileActivity2 = this.b;
                if (z10) {
                    ((org.telegram.ui.Cells.j4) view).setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.L6, profileActivity2.v0));
                } else if (view instanceof org.telegram.ui.Cells.v8) {
                    ((org.telegram.ui.Cells.v8) view).e();
                } else if (view instanceof org.telegram.ui.Cells.l8) {
                    ((org.telegram.ui.Cells.l8) view).v();
                } else if (view instanceof org.telegram.ui.Cells.j) {
                    org.telegram.ui.ActionBar.g6.P1.linkColor = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.gc, ((org.telegram.ui.Cells.j) view).E);
                } else if (view instanceof org.telegram.ui.Cells.g5) {
                    ((org.telegram.ui.Cells.g5) view).getCheckBox().invalidate();
                } else if (view instanceof qf.b1) {
                    qf.b1 b1Var = (qf.b1) view;
                    org.telegram.ui.Components.rp rpVar = b1Var.r;
                    int dp = AndroidUtilities.dp(8.0f);
                    int i10 = org.telegram.ui.ActionBar.g6.o6;
                    org.telegram.ui.ActionBar.c6 c6Var = b1Var.a;
                    int v02 = org.telegram.ui.ActionBar.g6.v0(i10, c6Var);
                    b1Var.a(v02);
                    int l1 = org.telegram.ui.ActionBar.g6.l1(0.1f, v02);
                    int v03 = org.telegram.ui.ActionBar.g6.v0(i10, c6Var);
                    b1Var.a(v03);
                    int l12 = org.telegram.ui.ActionBar.g6.l1(0.22f, v03);
                    rpVar.setBackground(org.telegram.ui.ActionBar.g6.i0(dp, dp, dp, dp, l1, l12, l12));
                    int v04 = org.telegram.ui.ActionBar.g6.v0(i10, c6Var);
                    b1Var.a(v04);
                    rpVar.setTextColor(v04);
                } else if (view instanceof org.telegram.ui.Cells.d6) {
                    ((org.telegram.ui.Cells.d6) view).d();
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
