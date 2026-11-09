package org.telegram.ui.Components;

import android.view.View;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class uo0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ zs0 b;

    public /* synthetic */ uo0(zs0 zs0Var, int i7) {
        this.a = i7;
        this.b = zs0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                zs0 zs0Var = this.b;
                int closestTab = zs0Var.getClosestTab();
                l60 H = l60.H(zs0Var.x1, view);
                H.J = false;
                if (zs0Var.b0(closestTab, new n(H))) {
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
                zs0 zs0Var2 = this.b;
                org.telegram.ui.ActionBar.f5 f5Var = zs0Var2.I;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = f5Var.b;
                if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout.d();
                }
                if (zs0Var2.b0(zs0Var2.getClosestTab(), new rt(zs0Var2, 4))) {
                    f5Var.U(null, null);
                    break;
                }
                break;
            case 2:
                this.b.V(true);
                break;
            case 3:
                zs0 zs0Var3 = this.b;
                zp0 zp0Var = zs0Var3.b0;
                vp0 vp0Var = zs0Var3.a0;
                if (zs0Var3.s0.getAlpha() >= 0.1f) {
                    if (vp0Var != null && vp0Var.g()) {
                        vp0Var.i();
                    }
                    if (zp0Var != null && zp0Var.f) {
                        ys0 x12 = zs0Var3.x1(zs0Var3.w1(zs0Var3.getClosestTab()));
                        ur0 g02 = zs0Var3.g0(x12.a);
                        if (g02 != null) {
                            zp0Var.setReorderingAlbums(false);
                            dq0 dq0Var = g02.h;
                            for (int i7 = 0; i7 < dq0Var.getChildCount(); i7++) {
                                View childAt = dq0Var.getChildAt(i7);
                                if (childAt instanceof org.telegram.ui.Cells.o7) {
                                    ((org.telegram.ui.Cells.o7) childAt).l(false, true);
                                }
                            }
                            xs0 xs0Var = x12.c;
                            if (xs0Var != null && xs0Var.y) {
                                xs0Var.y = false;
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
