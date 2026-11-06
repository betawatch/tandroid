package org.telegram.ui.Components;

import android.view.View;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final /* synthetic */ class to0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ xs0 b;

    public /* synthetic */ to0(xs0 xs0Var, int i7) {
        this.a = i7;
        this.b = xs0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                xs0 xs0Var = this.b;
                int closestTab = xs0Var.getClosestTab();
                k60 H = k60.H(xs0Var.x1, view);
                H.J = false;
                if (xs0Var.b0(closestTab, new n(H))) {
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
                xs0 xs0Var2 = this.b;
                org.telegram.ui.ActionBar.f5 f5Var = xs0Var2.I;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = f5Var.b;
                if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout.d();
                }
                if (xs0Var2.b0(xs0Var2.getClosestTab(), new qt(xs0Var2, 4))) {
                    f5Var.U(null, null);
                    break;
                }
                break;
            case 2:
                this.b.V(true);
                break;
            case 3:
                xs0 xs0Var3 = this.b;
                yp0 yp0Var = xs0Var3.b0;
                up0 up0Var = xs0Var3.a0;
                if (xs0Var3.s0.getAlpha() >= 0.1f) {
                    if (up0Var != null && up0Var.g()) {
                        up0Var.i();
                    }
                    if (yp0Var != null && yp0Var.f) {
                        ws0 v12 = xs0Var3.v1(xs0Var3.u1(xs0Var3.getClosestTab()));
                        sr0 g02 = xs0Var3.g0(v12.a);
                        if (g02 != null) {
                            yp0Var.setReorderingAlbums(false);
                            cq0 cq0Var = g02.h;
                            for (int i7 = 0; i7 < cq0Var.getChildCount(); i7++) {
                                View childAt = cq0Var.getChildAt(i7);
                                if (childAt instanceof org.telegram.ui.Cells.o7) {
                                    ((org.telegram.ui.Cells.o7) childAt).l(false, true);
                                }
                            }
                            vs0 vs0Var = v12.c;
                            if (vs0Var != null && vs0Var.y) {
                                vs0Var.y = false;
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
