package org.telegram.ui;

import android.graphics.RectF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class du0 implements org.telegram.messenger.z10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ProfileActivity b;

    public /* synthetic */ du0(ProfileActivity profileActivity, int i7) {
        this.a = i7;
        this.b = profileActivity;
    }

    @Override // org.telegram.messenger.z10
    public final void a(Object obj) {
        int i7 = this.a;
        ProfileActivity profileActivity = this.b;
        switch (i7) {
            case 0:
                View view = (View) obj;
                RectF rectF = ProfileActivity.X6;
                if (view instanceof org.telegram.ui.Cells.w8) {
                    org.telegram.ui.Cells.w8 w8Var = (org.telegram.ui.Cells.w8) view;
                    w8Var.a.setLoading(profileActivity.m5);
                    w8Var.b.setLoading(profileActivity.m5);
                    break;
                }
                break;
            case 1:
                ProfileActivity.q0(profileActivity, (Boolean) obj);
                break;
            case 2:
                RectF rectF2 = ProfileActivity.X6;
                profileActivity.getClass();
                ArrayList arrayList = new ArrayList(1);
                arrayList.add((TLRPC.InputStickerSet) obj);
                profileActivity.showDialog(new org.telegram.ui.Components.wu(profileActivity, profileActivity.getParentActivity(), profileActivity.A0, arrayList));
                break;
            default:
                View view2 = (View) obj;
                RectF rectF3 = ProfileActivity.X6;
                if (view2 instanceof org.telegram.ui.Cells.n4) {
                    ((org.telegram.ui.Cells.n4) view2).setTextColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.L6, profileActivity.A0));
                } else if (view2 instanceof org.telegram.ui.Cells.w8) {
                    ((org.telegram.ui.Cells.w8) view2).updateColors();
                } else if (view2 instanceof org.telegram.ui.Cells.l8) {
                    ((org.telegram.ui.Cells.l8) view2).updateColors();
                } else if (view2 instanceof org.telegram.ui.Cells.j) {
                    ((org.telegram.ui.Cells.j) view2).updateColors();
                } else if (view2 instanceof org.telegram.ui.Cells.h5) {
                    ((org.telegram.ui.Cells.h5) view2).getCheckBox().invalidate();
                } else if (view2 instanceof kg.f1) {
                    kg.f1 f1Var = (kg.f1) view2;
                    org.telegram.ui.Components.up upVar = f1Var.r;
                    int L = org.telegram.messenger.g0.L(8.0f);
                    int i10 = org.telegram.ui.ActionBar.j6.o6;
                    org.telegram.ui.ActionBar.e6 e6Var = f1Var.a;
                    int w02 = org.telegram.ui.ActionBar.j6.w0(i10, e6Var);
                    f1Var.a(w02);
                    int r12 = org.telegram.ui.ActionBar.j6.r1(0.1f, w02);
                    int w03 = org.telegram.ui.ActionBar.j6.w0(i10, e6Var);
                    f1Var.a(w03);
                    int r13 = org.telegram.ui.ActionBar.j6.r1(0.22f, w03);
                    upVar.setBackground(org.telegram.ui.ActionBar.j6.k0(L, L, L, L, r12, r13, r13));
                    int w04 = org.telegram.ui.ActionBar.j6.w0(i10, e6Var);
                    f1Var.a(w04);
                    upVar.setTextColor(w04);
                } else if (view2 instanceof org.telegram.ui.Cells.e6) {
                    ((org.telegram.ui.Cells.e6) view2).updateColors();
                }
                iw0 iw0Var = profileActivity.d;
                profileActivity.a.getClass();
                iw0Var.d(RecyclerView.R(view2));
                profileActivity.d.getClass();
                break;
        }
    }
}
