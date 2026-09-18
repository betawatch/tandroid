package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class tq0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ zu0 b;

    public /* synthetic */ tq0(zu0 zu0Var, int i10) {
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
                ur0 ur0Var = zu0Var.W;
                or0 or0Var = zu0Var.V;
                if (zu0Var.q0.getAlpha() >= 0.1f) {
                    if (or0Var != null && or0Var.g()) {
                        or0Var.i();
                    }
                    if (ur0Var != null && ur0Var.w) {
                        yu0 i12 = zu0Var.i1(zu0Var.h1(zu0Var.getClosestTab()));
                        st0 W = zu0Var.W(i12.a);
                        if (W != null) {
                            ur0Var.setReorderingAlbums(false);
                            yr0 yr0Var = W.h;
                            for (int i10 = 0; i10 < yr0Var.getChildCount(); i10++) {
                                View childAt = yr0Var.getChildAt(i10);
                                if (childAt instanceof org.telegram.ui.Cells.t7) {
                                    ((org.telegram.ui.Cells.t7) childAt).l(false, true);
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
                org.telegram.ui.ActionBar.o2 o2Var = this.b.v1;
                o2Var.getMessagesController().getMainSettings().edit().putBoolean("story_keep", true).apply();
                ci.oc.E(o2Var.getParentActivity(), o2Var.getCurrentAccount()).R(null);
                break;
        }
    }
}
