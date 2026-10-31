package org.telegram.ui.Components;

import android.view.View;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class up0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ zt0 b;

    public /* synthetic */ up0(zt0 zt0Var, int i10) {
        this.a = i10;
        this.b = zt0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                zt0 zt0Var = this.b;
                int closestTab = zt0Var.getClosestTab();
                z60 H = z60.H(zt0Var.x1, view);
                H.J = false;
                if (zt0Var.Z(closestTab, new k2.m0(H))) {
                    if (closestTab == 13 || closestTab == 11) {
                        H.a0(0.0f, -org.telegram.messenger.i0.L(52.0f));
                    } else {
                        H.Y = true;
                    }
                    H.s = 0;
                    H.Z();
                    break;
                }
                break;
            case 1:
                zt0 zt0Var2 = this.b;
                org.telegram.ui.ActionBar.p5 p5Var = zt0Var2.I;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = p5Var.b;
                if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout.d();
                }
                if (zt0Var2.Z(zt0Var2.getClosestTab(), new n2.u(zt0Var2, 14))) {
                    p5Var.U(null, null);
                    break;
                }
                break;
            case 2:
                this.b.T(true);
                break;
            case 3:
                zt0 zt0Var3 = this.b;
                zq0 zq0Var = zt0Var3.b0;
                vq0 vq0Var = zt0Var3.a0;
                if (zt0Var3.s0.getAlpha() >= 0.1f) {
                    if (vq0Var != null && vq0Var.g()) {
                        vq0Var.i();
                    }
                    if (zq0Var != null && zq0Var.f) {
                        yt0 s12 = zt0Var3.s1(zt0Var3.r1(zt0Var3.getClosestTab()));
                        ss0 e02 = zt0Var3.e0(s12.a);
                        if (e02 != null) {
                            zq0Var.setReorderingAlbums(false);
                            dr0 dr0Var = e02.h;
                            for (int i10 = 0; i10 < dr0Var.getChildCount(); i10++) {
                                View childAt = dr0Var.getChildAt(i10);
                                if (childAt instanceof org.telegram.ui.Cells.s7) {
                                    ((org.telegram.ui.Cells.s7) childAt).l(false, true);
                                }
                            }
                            xt0 xt0Var = s12.c;
                            if (xt0Var != null && xt0Var.y) {
                                xt0Var.y = false;
                                break;
                            }
                        }
                    }
                }
                break;
            default:
                org.telegram.ui.ActionBar.k2 k2Var = this.b.x1;
                k2Var.getMessagesController().f7.edit().putBoolean("story_keep", true).apply();
                vh.o8.D(k2Var.getParentActivity(), k2Var.getCurrentAccount()).Q(null);
                break;
        }
    }
}
