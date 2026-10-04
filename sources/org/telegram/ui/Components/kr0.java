package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final /* synthetic */ class kr0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ pv0 b;

    public /* synthetic */ kr0(pv0 pv0Var, int i10) {
        this.a = i10;
        this.b = pv0Var;
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
                pv0 pv0Var = this.b;
                ks0 ks0Var = pv0Var.W;
                fs0 fs0Var = pv0Var.V;
                if (pv0Var.q0.getAlpha() >= 0.1f) {
                    if (fs0Var != null && fs0Var.g()) {
                        fs0Var.i();
                    }
                    if (ks0Var != null && ks0Var.w) {
                        ov0 i12 = pv0Var.i1(pv0Var.h1(pv0Var.getClosestTab()));
                        iu0 W = pv0Var.W(i12.a);
                        if (W != null) {
                            ks0Var.setReorderingAlbums(false);
                            os0 os0Var = W.h;
                            for (int i10 = 0; i10 < os0Var.getChildCount(); i10++) {
                                View childAt = os0Var.getChildAt(i10);
                                if (childAt instanceof org.telegram.ui.Cells.t7) {
                                    ((org.telegram.ui.Cells.t7) childAt).l(false, true);
                                }
                            }
                            nv0 nv0Var = i12.c;
                            if (nv0Var != null && nv0Var.x) {
                                nv0Var.x = false;
                                break;
                            }
                        }
                    }
                }
                break;
            default:
                org.telegram.ui.ActionBar.n2 n2Var = this.b.v1;
                n2Var.getMessagesController().getMainSettings().edit().putBoolean("story_keep", true).apply();
                ci.kc.E(n2Var.getParentActivity(), n2Var.getCurrentAccount()).R(null);
                break;
        }
    }
}
