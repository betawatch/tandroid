package org.telegram.ui;

import android.graphics.RectF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class ov0 implements org.telegram.messenger.q20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ProfileActivity b;

    public /* synthetic */ ov0(ProfileActivity profileActivity, int i10) {
        this.a = i10;
        this.b = profileActivity;
    }

    @Override // org.telegram.messenger.q20
    public final void a(Object obj) {
        int i10 = this.a;
        ProfileActivity profileActivity = this.b;
        switch (i10) {
            case 0:
                View view = (View) obj;
                RectF rectF = ProfileActivity.R6;
                if (view instanceof org.telegram.ui.Cells.z8) {
                    org.telegram.ui.Cells.z8 z8Var = (org.telegram.ui.Cells.z8) view;
                    z8Var.a.setLoading(profileActivity.i5);
                    z8Var.b.setLoading(profileActivity.i5);
                    break;
                }
                break;
            case 1:
                ProfileActivity.p0(profileActivity, (Boolean) obj);
                break;
            case 2:
                RectF rectF2 = ProfileActivity.R6;
                profileActivity.getClass();
                ArrayList arrayList = new ArrayList(1);
                arrayList.add((TLRPC.InputStickerSet) obj);
                profileActivity.showDialog(new org.telegram.ui.Components.cv(profileActivity, profileActivity.getParentActivity(), profileActivity.z0, arrayList));
                break;
            default:
                View view2 = (View) obj;
                RectF rectF3 = ProfileActivity.R6;
                if (view2 instanceof org.telegram.ui.Cells.p4) {
                    ((org.telegram.ui.Cells.p4) view2).setTextColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.L6, profileActivity.z0));
                } else if (view2 instanceof org.telegram.ui.Cells.z8) {
                    ((org.telegram.ui.Cells.z8) view2).updateColors();
                } else if (view2 instanceof org.telegram.ui.Cells.p8) {
                    ((org.telegram.ui.Cells.p8) view2).updateColors();
                } else if (view2 instanceof org.telegram.ui.Cells.i) {
                    ((org.telegram.ui.Cells.i) view2).updateColors();
                } else if (view2 instanceof org.telegram.ui.Cells.l5) {
                    ((org.telegram.ui.Cells.l5) view2).getCheckBox().invalidate();
                } else if (view2 instanceof ag.k2) {
                    ag.k2 k2Var = (ag.k2) view2;
                    org.telegram.ui.Components.tp tpVar = k2Var.r;
                    int L = org.telegram.messenger.i0.L(8.0f);
                    int i11 = org.telegram.ui.ActionBar.t6.o6;
                    org.telegram.ui.ActionBar.p6 p6Var = k2Var.a;
                    int w02 = org.telegram.ui.ActionBar.t6.w0(i11, p6Var);
                    k2Var.a(w02);
                    int r12 = org.telegram.ui.ActionBar.t6.r1(0.1f, w02);
                    int w03 = org.telegram.ui.ActionBar.t6.w0(i11, p6Var);
                    k2Var.a(w03);
                    int r13 = org.telegram.ui.ActionBar.t6.r1(0.22f, w03);
                    tpVar.setBackground(org.telegram.ui.ActionBar.t6.k0(L, L, L, L, r12, r13, r13));
                    int w04 = org.telegram.ui.ActionBar.t6.w0(i11, p6Var);
                    k2Var.a(w04);
                    tpVar.setTextColor(w04);
                } else if (view2 instanceof org.telegram.ui.Cells.j6) {
                    ((org.telegram.ui.Cells.j6) view2).updateColors();
                }
                xx0 xx0Var = profileActivity.d;
                profileActivity.a.getClass();
                xx0Var.d(RecyclerView.R(view2));
                profileActivity.d.getClass();
                break;
        }
    }
}
