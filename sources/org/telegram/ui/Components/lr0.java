package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final /* synthetic */ class lr0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ qv0 b;

    public /* synthetic */ lr0(qv0 qv0Var, int i10) {
        this.a = i10;
        this.b = qv0Var;
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
                qv0 qv0Var = this.b;
                ls0 ls0Var = qv0Var.W;
                gs0 gs0Var = qv0Var.V;
                if (qv0Var.q0.getAlpha() >= 0.1f) {
                    if (gs0Var != null && gs0Var.g()) {
                        gs0Var.i();
                    }
                    if (ls0Var != null && ls0Var.w) {
                        pv0 i12 = qv0Var.i1(qv0Var.h1(qv0Var.getClosestTab()));
                        ju0 W = qv0Var.W(i12.a);
                        if (W != null) {
                            ls0Var.setReorderingAlbums(false);
                            ps0 ps0Var = W.h;
                            for (int i10 = 0; i10 < ps0Var.getChildCount(); i10++) {
                                View childAt = ps0Var.getChildAt(i10);
                                if (childAt instanceof org.telegram.ui.Cells.t7) {
                                    ((org.telegram.ui.Cells.t7) childAt).l(false, true);
                                }
                            }
                            ov0 ov0Var = i12.c;
                            if (ov0Var != null && ov0Var.x) {
                                ov0Var.x = false;
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
