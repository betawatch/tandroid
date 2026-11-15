package org.telegram.ui.Components;

import android.view.View;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class xo0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ys0 b;

    public /* synthetic */ xo0(ys0 ys0Var, int i7) {
        this.a = i7;
        this.b = ys0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                ys0 ys0Var = this.b;
                int closestTab = ys0Var.getClosestTab();
                m60 H = m60.H(ys0Var.y1, view);
                H.J = false;
                if (ys0Var.b0(closestTab, new cf(H))) {
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
                org.telegram.ui.ActionBar.d5 d5Var = ys0Var2.J;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = d5Var.b;
                if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout.d();
                }
                if (ys0Var2.b0(ys0Var2.getClosestTab(), new ff(ys0Var2, 6))) {
                    d5Var.V(null, null);
                    break;
                }
                break;
            case 2:
                this.b.V(true);
                break;
            case 3:
                ys0 ys0Var3 = this.b;
                zp0 zp0Var = ys0Var3.c0;
                wp0 wp0Var = ys0Var3.b0;
                if (ys0Var3.t0.getAlpha() >= 0.1f) {
                    if (wp0Var != null && wp0Var.g()) {
                        wp0Var.i();
                    }
                    if (zp0Var != null && zp0Var.f) {
                        xs0 x12 = ys0Var3.x1(ys0Var3.w1(ys0Var3.getClosestTab()));
                        tr0 g02 = ys0Var3.g0(x12.a);
                        if (g02 != null) {
                            zp0Var.setReorderingAlbums(false);
                            dq0 dq0Var = g02.h;
                            for (int i7 = 0; i7 < dq0Var.getChildCount(); i7++) {
                                View childAt = dq0Var.getChildAt(i7);
                                if (childAt instanceof org.telegram.ui.Cells.n7) {
                                    ((org.telegram.ui.Cells.n7) childAt).l(false, true);
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
                org.telegram.ui.ActionBar.e2 e2Var = this.b.y1;
                e2Var.getMessagesController().f7.edit().putBoolean("story_keep", true).apply();
                hi.sa.D(e2Var.getParentActivity(), e2Var.getCurrentAccount()).Q(null);
                break;
        }
    }
}
