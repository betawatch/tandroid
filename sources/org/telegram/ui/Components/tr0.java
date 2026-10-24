package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final /* synthetic */ class tr0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ xv0 b;

    public /* synthetic */ tr0(xv0 xv0Var, int i10) {
        this.a = i10;
        this.b = xv0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                this.b.M(true);
                break;
            case 1:
                this.b.F0(102, view);
                break;
            case 2:
                this.b.F0(100, view);
                break;
            case 3:
                this.b.F0(103, view);
                break;
            case 4:
                this.b.F0(104, view);
                break;
            case 5:
                this.b.F0(101, view);
                break;
            case 6:
                xv0 xv0Var = this.b;
                ss0 ss0Var = xv0Var.W;
                ns0 ns0Var = xv0Var.V;
                if (xv0Var.q0.getAlpha() >= 0.1f) {
                    if (ns0Var != null && ns0Var.g()) {
                        ns0Var.i();
                    }
                    if (ss0Var != null && ss0Var.w) {
                        wv0 l1 = xv0Var.l1(xv0Var.k1(xv0Var.getClosestTab()));
                        qu0 X = xv0Var.X(l1.a);
                        if (X != null) {
                            ss0Var.setReorderingAlbums(false);
                            ws0 ws0Var = X.h;
                            for (int i10 = 0; i10 < ws0Var.getChildCount(); i10++) {
                                View childAt = ws0Var.getChildAt(i10);
                                if (childAt instanceof org.telegram.ui.Cells.s7) {
                                    ((org.telegram.ui.Cells.s7) childAt).l(false, true);
                                }
                            }
                            vv0 vv0Var = l1.c;
                            if (vv0Var != null && vv0Var.x) {
                                vv0Var.x = false;
                                break;
                            }
                        }
                    }
                }
                break;
            default:
                org.telegram.ui.ActionBar.o2 o2Var = this.b.v1;
                o2Var.getMessagesController().getMainSettings().edit().putBoolean("story_keep", true).apply();
                ei.vb.D(o2Var.getParentActivity(), o2Var.getCurrentAccount()).Q(null);
                break;
        }
    }
}
