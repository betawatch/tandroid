package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class oq0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ qu0 b;

    public /* synthetic */ oq0(qu0 qu0Var, int i10) {
        this.a = i10;
        this.b = qu0Var;
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
                qu0 qu0Var = this.b;
                kr0 kr0Var = qu0Var.S;
                gr0 gr0Var = qu0Var.R;
                if (qu0Var.m0.getAlpha() >= 0.1f) {
                    if (gr0Var != null && gr0Var.g()) {
                        gr0Var.i();
                    }
                    if (kr0Var != null && kr0Var.w) {
                        pu0 i12 = qu0Var.i1(qu0Var.h1(qu0Var.getClosestTab()));
                        it0 W = qu0Var.W(i12.a);
                        if (W != null) {
                            kr0Var.setReorderingAlbums(false);
                            or0 or0Var = W.h;
                            for (int i10 = 0; i10 < or0Var.getChildCount(); i10++) {
                                View childAt = or0Var.getChildAt(i10);
                                if (childAt instanceof org.telegram.ui.Cells.p7) {
                                    ((org.telegram.ui.Cells.p7) childAt).l(false, true);
                                }
                            }
                            ou0 ou0Var = i12.c;
                            if (ou0Var != null && ou0Var.x) {
                                ou0Var.x = false;
                                break;
                            }
                        }
                    }
                }
                break;
            default:
                org.telegram.ui.ActionBar.o2 o2Var = this.b.r1;
                o2Var.getMessagesController().getMainSettings().edit().putBoolean("story_keep", true).apply();
                nh.gb.E(o2Var.getParentActivity(), o2Var.getCurrentAccount()).R(null);
                break;
        }
    }
}
