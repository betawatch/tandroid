package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class dq0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ hu0 b;

    public /* synthetic */ dq0(hu0 hu0Var, int i10) {
        this.a = i10;
        this.b = hu0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                this.b.L(true);
                break;
            case 1:
                this.b.C0(102, view);
                break;
            case 2:
                this.b.C0(100, view);
                break;
            case 3:
                this.b.C0(103, view);
                break;
            case 4:
                this.b.C0(104, view);
                break;
            case 5:
                this.b.C0(101, view);
                break;
            case 6:
                hu0 hu0Var = this.b;
                ar0 ar0Var = hu0Var.S;
                wq0 wq0Var = hu0Var.R;
                if (hu0Var.m0.getAlpha() >= 0.1f) {
                    if (wq0Var != null && wq0Var.g()) {
                        wq0Var.i();
                    }
                    if (ar0Var != null && ar0Var.w) {
                        gu0 i12 = hu0Var.i1(hu0Var.h1(hu0Var.getClosestTab()));
                        zs0 W = hu0Var.W(i12.a);
                        if (W != null) {
                            ar0Var.setReorderingAlbums(false);
                            er0 er0Var = W.h;
                            for (int i10 = 0; i10 < er0Var.getChildCount(); i10++) {
                                View childAt = er0Var.getChildAt(i10);
                                if (childAt instanceof org.telegram.ui.Cells.o7) {
                                    ((org.telegram.ui.Cells.o7) childAt).l(false, true);
                                }
                            }
                            fu0 fu0Var = i12.c;
                            if (fu0Var != null && fu0Var.x) {
                                fu0Var.x = false;
                                break;
                            }
                        }
                    }
                }
                break;
            default:
                org.telegram.ui.ActionBar.n2 n2Var = this.b.r1;
                n2Var.getMessagesController().getMainSettings().edit().putBoolean("story_keep", true).apply();
                lh.sb.E(n2Var.getParentActivity(), n2Var.getCurrentAccount()).R(null);
                break;
        }
    }
}
