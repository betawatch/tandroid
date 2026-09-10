package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class dr0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ iv0 b;

    public /* synthetic */ dr0(iv0 iv0Var, int i10) {
        this.a = i10;
        this.b = iv0Var;
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
                iv0 iv0Var = this.b;
                cs0 cs0Var = iv0Var.W;
                wr0 wr0Var = iv0Var.V;
                if (iv0Var.q0.getAlpha() >= 0.1f) {
                    if (wr0Var != null && wr0Var.g()) {
                        wr0Var.i();
                    }
                    if (cs0Var != null && cs0Var.w) {
                        hv0 i12 = iv0Var.i1(iv0Var.h1(iv0Var.getClosestTab()));
                        au0 W = iv0Var.W(i12.a);
                        if (W != null) {
                            cs0Var.setReorderingAlbums(false);
                            gs0 gs0Var = W.h;
                            for (int i10 = 0; i10 < gs0Var.getChildCount(); i10++) {
                                View childAt = gs0Var.getChildAt(i10);
                                if (childAt instanceof org.telegram.ui.Cells.u7) {
                                    ((org.telegram.ui.Cells.u7) childAt).l(false, true);
                                }
                            }
                            gv0 gv0Var = i12.c;
                            if (gv0Var != null && gv0Var.x) {
                                gv0Var.x = false;
                                break;
                            }
                        }
                    }
                }
                break;
            default:
                org.telegram.ui.ActionBar.p2 p2Var = this.b.v1;
                p2Var.getMessagesController().getMainSettings().edit().putBoolean("story_keep", true).apply();
                bi.ce.E(p2Var.getParentActivity(), p2Var.getCurrentAccount()).R(null);
                break;
        }
    }
}
