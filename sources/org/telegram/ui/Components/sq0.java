package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final /* synthetic */ class sq0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ xu0 b;

    public /* synthetic */ sq0(xu0 xu0Var, int i10) {
        this.a = i10;
        this.b = xu0Var;
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
                xu0 xu0Var = this.b;
                sr0 sr0Var = xu0Var.W;
                nr0 nr0Var = xu0Var.V;
                if (xu0Var.q0.getAlpha() >= 0.1f) {
                    if (nr0Var != null && nr0Var.g()) {
                        nr0Var.i();
                    }
                    if (sr0Var != null && sr0Var.w) {
                        wu0 i12 = xu0Var.i1(xu0Var.h1(xu0Var.getClosestTab()));
                        qt0 W = xu0Var.W(i12.a);
                        if (W != null) {
                            sr0Var.setReorderingAlbums(false);
                            wr0 wr0Var = W.h;
                            for (int i10 = 0; i10 < wr0Var.getChildCount(); i10++) {
                                View childAt = wr0Var.getChildAt(i10);
                                if (childAt instanceof org.telegram.ui.Cells.t7) {
                                    ((org.telegram.ui.Cells.t7) childAt).l(false, true);
                                }
                            }
                            vu0 vu0Var = i12.c;
                            if (vu0Var != null && vu0Var.x) {
                                vu0Var.x = false;
                                break;
                            }
                        }
                    }
                }
                break;
            default:
                org.telegram.ui.ActionBar.n2 n2Var = this.b.v1;
                n2Var.getMessagesController().getMainSettings().edit().putBoolean("story_keep", true).apply();
                di.pc.E(n2Var.getParentActivity(), n2Var.getCurrentAccount()).R(null);
                break;
        }
    }
}
