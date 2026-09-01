package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class xq0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ zu0 b;

    public /* synthetic */ xq0(zu0 zu0Var, int i10) {
        this.a = i10;
        this.b = zu0Var;
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
                zu0 zu0Var = this.b;
                tr0 tr0Var = zu0Var.T;
                pr0 pr0Var = zu0Var.S;
                if (zu0Var.n0.getAlpha() >= 0.1f) {
                    if (pr0Var != null && pr0Var.g()) {
                        pr0Var.i();
                    }
                    if (tr0Var != null && tr0Var.w) {
                        yu0 i12 = zu0Var.i1(zu0Var.h1(zu0Var.getClosestTab()));
                        rt0 W = zu0Var.W(i12.a);
                        if (W != null) {
                            tr0Var.setReorderingAlbums(false);
                            xr0 xr0Var = W.h;
                            for (int i10 = 0; i10 < xr0Var.getChildCount(); i10++) {
                                View childAt = xr0Var.getChildAt(i10);
                                if (childAt instanceof org.telegram.ui.Cells.r7) {
                                    ((org.telegram.ui.Cells.r7) childAt).l(false, true);
                                }
                            }
                            xu0 xu0Var = i12.c;
                            if (xu0Var != null && xu0Var.x) {
                                xu0Var.x = false;
                                break;
                            }
                        }
                    }
                }
                break;
            default:
                org.telegram.ui.ActionBar.p2 p2Var = this.b.s1;
                p2Var.getMessagesController().getMainSettings().edit().putBoolean("story_keep", true).apply();
                qh.ca.E(p2Var.getParentActivity(), p2Var.getCurrentAccount()).R(null);
                break;
        }
    }
}
