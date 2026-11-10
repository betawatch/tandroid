package org.telegram.ui.Components;

import android.view.View;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class to0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ys0 b;

    public /* synthetic */ to0(ys0 ys0Var, int i7) {
        this.a = i7;
        this.b = ys0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                ys0 ys0Var = this.b;
                int closestTab = ys0Var.getClosestTab();
                k60 H = k60.H(ys0Var.x1, view);
                H.J = false;
                if (ys0Var.b0(closestTab, new m(H))) {
                    if (closestTab == 13 || closestTab == 11) {
                        H.a0(0.0f, -org.telegram.messenger.g0.L(52.0f));
                    } else {
                        H.Y = true;
                    }
                    H.s = 0;
                    H.Z();
                    break;
                }
                break;
            case 1:
                ys0 ys0Var2 = this.b;
                org.telegram.ui.ActionBar.g5 g5Var = ys0Var2.I;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = g5Var.b;
                if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout.d();
                }
                if (ys0Var2.b0(ys0Var2.getClosestTab(), new qt(ys0Var2, 4))) {
                    g5Var.U(null, null);
                    break;
                }
                break;
            case 2:
                this.b.V(true);
                break;
            case 3:
                ys0 ys0Var3 = this.b;
                yp0 yp0Var = ys0Var3.b0;
                up0 up0Var = ys0Var3.a0;
                if (ys0Var3.s0.getAlpha() >= 0.1f) {
                    if (up0Var != null && up0Var.g()) {
                        up0Var.i();
                    }
                    if (yp0Var != null && yp0Var.f) {
                        xs0 x12 = ys0Var3.x1(ys0Var3.w1(ys0Var3.getClosestTab()));
                        tr0 g02 = ys0Var3.g0(x12.a);
                        if (g02 != null) {
                            yp0Var.setReorderingAlbums(false);
                            cq0 cq0Var = g02.h;
                            for (int i7 = 0; i7 < cq0Var.getChildCount(); i7++) {
                                View childAt = cq0Var.getChildAt(i7);
                                if (childAt instanceof org.telegram.ui.Cells.o7) {
                                    ((org.telegram.ui.Cells.o7) childAt).l(false, true);
                                }
                            }
                            ws0 ws0Var = x12.c;
                            if (ws0Var != null && ws0Var.y) {
                                ws0Var.y = false;
                                break;
                            }
                        }
                    }
                }
                break;
            default:
                org.telegram.ui.ActionBar.f2 f2Var = this.b.x1;
                f2Var.getMessagesController().e7.edit().putBoolean("story_keep", true).apply();
                fi.va.D(f2Var.getParentActivity(), f2Var.getCurrentAccount()).Q(null);
                break;
        }
    }
}
