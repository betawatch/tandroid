package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final /* synthetic */ class pr0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ tv0 b;

    public /* synthetic */ pr0(tv0 tv0Var, int i10) {
        this.a = i10;
        this.b = tv0Var;
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
                tv0 tv0Var = this.b;
                os0 os0Var = tv0Var.W;
                js0 js0Var = tv0Var.V;
                if (tv0Var.q0.getAlpha() >= 0.1f) {
                    if (js0Var != null && js0Var.g()) {
                        js0Var.i();
                    }
                    if (os0Var != null && os0Var.w) {
                        sv0 k12 = tv0Var.k1(tv0Var.j1(tv0Var.getClosestTab()));
                        mu0 W = tv0Var.W(k12.a);
                        if (W != null) {
                            os0Var.setReorderingAlbums(false);
                            ss0 ss0Var = W.h;
                            for (int i10 = 0; i10 < ss0Var.getChildCount(); i10++) {
                                View childAt = ss0Var.getChildAt(i10);
                                if (childAt instanceof org.telegram.ui.Cells.s7) {
                                    ((org.telegram.ui.Cells.s7) childAt).l(false, true);
                                }
                            }
                            rv0 rv0Var = k12.c;
                            if (rv0Var != null && rv0Var.x) {
                                rv0Var.x = false;
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
