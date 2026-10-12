package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class ur0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ xv0 b;

    public /* synthetic */ ur0(xv0 xv0Var, int i10) {
        this.a = i10;
        this.b = xv0Var;
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
                xv0 xv0Var = this.b;
                ss0 ss0Var = xv0Var.W;
                ns0 ns0Var = xv0Var.V;
                if (xv0Var.q0.getAlpha() >= 0.1f) {
                    if (ns0Var != null && ns0Var.g()) {
                        ns0Var.i();
                    }
                    if (ss0Var != null && ss0Var.w) {
                        wv0 i12 = xv0Var.i1(xv0Var.h1(xv0Var.getClosestTab()));
                        qu0 W = xv0Var.W(i12.a);
                        if (W != null) {
                            ss0Var.setReorderingAlbums(false);
                            ws0 ws0Var = W.h;
                            for (int i10 = 0; i10 < ws0Var.getChildCount(); i10++) {
                                View childAt = ws0Var.getChildAt(i10);
                                if (childAt instanceof org.telegram.ui.Cells.t7) {
                                    ((org.telegram.ui.Cells.t7) childAt).l(false, true);
                                }
                            }
                            vv0 vv0Var = i12.c;
                            if (vv0Var != null && vv0Var.x) {
                                vv0Var.x = false;
                                break;
                            }
                        }
                    }
                }
                break;
            default:
                org.telegram.ui.ActionBar.m2 m2Var = this.b.v1;
                m2Var.getMessagesController().getMainSettings().edit().putBoolean("story_keep", true).apply();
                di.kc.D(m2Var.getParentActivity(), m2Var.getCurrentAccount()).Q(null);
                break;
        }
    }
}
