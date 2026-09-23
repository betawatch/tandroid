package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final /* synthetic */ class ly0 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ ProfileActivity b;

    public /* synthetic */ ly0(ProfileActivity profileActivity, int i10) {
        this.a = i10;
        this.b = profileActivity;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                View view = (View) obj;
                if (view instanceof org.telegram.ui.Cells.d9) {
                    org.telegram.ui.Cells.d9 d9Var = (org.telegram.ui.Cells.d9) view;
                    vh.o oVar = d9Var.a;
                    ProfileActivity profileActivity = this.b;
                    oVar.setLoading(profileActivity.i5);
                    d9Var.b.setLoading(profileActivity.i5);
                    break;
                }
                break;
            case 1:
                ProfileActivity profileActivity2 = this.b;
                profileActivity2.getClass();
                ArrayList arrayList = new ArrayList(1);
                arrayList.add((TLRPC.InputStickerSet) obj);
                profileActivity2.showDialog(new org.telegram.ui.Components.tv(profileActivity2, profileActivity2.getParentActivity(), profileActivity2.z0, arrayList));
                break;
            case 2:
                View view2 = (View) obj;
                boolean z10 = view2 instanceof org.telegram.ui.Cells.m4;
                ProfileActivity profileActivity3 = this.b;
                if (z10) {
                    ((org.telegram.ui.Cells.m4) view2).setTextColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.L6, profileActivity3.z0));
                } else if (view2 instanceof org.telegram.ui.Cells.d9) {
                    ((org.telegram.ui.Cells.d9) view2).e();
                } else if (view2 instanceof org.telegram.ui.Cells.s8) {
                    ((org.telegram.ui.Cells.s8) view2).v();
                } else if (view2 instanceof org.telegram.ui.Cells.j) {
                    org.telegram.ui.ActionBar.h6.P1.linkColor = org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.gc, ((org.telegram.ui.Cells.j) view2).I);
                } else if (view2 instanceof org.telegram.ui.Cells.j5) {
                    ((org.telegram.ui.Cells.j5) view2).getCheckBox().invalidate();
                } else if (view2 instanceof hg.k1) {
                    hg.k1 k1Var = (hg.k1) view2;
                    org.telegram.ui.Components.eq eqVar = k1Var.r;
                    int dp = AndroidUtilities.dp(8.0f);
                    int i10 = org.telegram.ui.ActionBar.h6.o6;
                    org.telegram.ui.ActionBar.d6 d6Var = k1Var.a;
                    int v02 = org.telegram.ui.ActionBar.h6.v0(i10, d6Var);
                    k1Var.a(v02);
                    int l1 = org.telegram.ui.ActionBar.h6.l1(0.1f, v02);
                    int v03 = org.telegram.ui.ActionBar.h6.v0(i10, d6Var);
                    k1Var.a(v03);
                    int l12 = org.telegram.ui.ActionBar.h6.l1(0.22f, v03);
                    eqVar.setBackground(org.telegram.ui.ActionBar.h6.i0(dp, dp, dp, dp, l1, l12, l12));
                    int v04 = org.telegram.ui.ActionBar.h6.v0(i10, d6Var);
                    k1Var.a(v04);
                    eqVar.setTextColor(v04);
                } else if (view2 instanceof org.telegram.ui.Cells.h6) {
                    ((org.telegram.ui.Cells.h6) view2).e();
                }
                s01 s01Var = profileActivity3.d;
                profileActivity3.a.getClass();
                RecyclerView.R(view2);
                s01Var.getClass();
                profileActivity3.d.getClass();
                break;
            default:
                ProfileActivity.e0(this.b, (Boolean) obj);
                break;
        }
    }
}
