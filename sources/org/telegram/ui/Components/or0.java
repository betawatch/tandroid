package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final /* synthetic */ class or0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ sv0 b;

    public /* synthetic */ or0(sv0 sv0Var, int i10) {
        this.a = i10;
        this.b = sv0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                this.b.L(true);
                break;
            case 1:
                this.b.E0(102, view);
                break;
            case 2:
                this.b.E0(100, view);
                break;
            case 3:
                this.b.E0(103, view);
                break;
            case 4:
                this.b.E0(104, view);
                break;
            case 5:
                this.b.E0(101, view);
                break;
            case 6:
                sv0 sv0Var = this.b;
                ns0 ns0Var = sv0Var.W;
                is0 is0Var = sv0Var.V;
                if (sv0Var.q0.getAlpha() >= 0.1f) {
                    if (is0Var != null && is0Var.g()) {
                        is0Var.i();
                    }
                    if (ns0Var != null && ns0Var.w) {
                        rv0 k12 = sv0Var.k1(sv0Var.j1(sv0Var.getClosestTab()));
                        lu0 W = sv0Var.W(k12.a);
                        if (W != null) {
                            ns0Var.setReorderingAlbums(false);
                            rs0 rs0Var = W.h;
                            for (int i10 = 0; i10 < rs0Var.getChildCount(); i10++) {
                                View childAt = rs0Var.getChildAt(i10);
                                if (childAt instanceof org.telegram.ui.Cells.s7) {
                                    ((org.telegram.ui.Cells.s7) childAt).l(false, true);
                                }
                            }
                            qv0 qv0Var = k12.c;
                            if (qv0Var != null && qv0Var.x) {
                                qv0Var.x = false;
                                break;
                            }
                        }
                    }
                }
                break;
            default:
                org.telegram.ui.ActionBar.n2 n2Var = this.b.v1;
                n2Var.getMessagesController().getMainSettings().edit().putBoolean("story_keep", true).apply();
                ei.vb.D(n2Var.getParentActivity(), n2Var.getCurrentAccount()).Q(null);
                break;
        }
    }
}
