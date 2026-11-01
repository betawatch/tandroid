package org.telegram.ui.Components;

import android.view.View;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class vp0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ au0 b;

    public /* synthetic */ vp0(au0 au0Var, int i10) {
        this.a = i10;
        this.b = au0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                au0 au0Var = this.b;
                int closestTab = au0Var.getClosestTab();
                z60 H = z60.H(au0Var.x1, view);
                H.J = false;
                if (au0Var.a0(closestTab, new k2.m0(H))) {
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
                au0 au0Var2 = this.b;
                org.telegram.ui.ActionBar.p5 p5Var = au0Var2.I;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = p5Var.b;
                if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout.d();
                }
                if (au0Var2.a0(au0Var2.getClosestTab(), new n2.u(au0Var2, 14))) {
                    p5Var.U(null, null);
                    break;
                }
                break;
            case 2:
                this.b.U(true);
                break;
            case 3:
                au0 au0Var3 = this.b;
                ar0 ar0Var = au0Var3.b0;
                wq0 wq0Var = au0Var3.a0;
                if (au0Var3.s0.getAlpha() >= 0.1f) {
                    if (wq0Var != null && wq0Var.g()) {
                        wq0Var.i();
                    }
                    if (ar0Var != null && ar0Var.f) {
                        zt0 t12 = au0Var3.t1(au0Var3.s1(au0Var3.getClosestTab()));
                        ts0 f02 = au0Var3.f0(t12.a);
                        if (f02 != null) {
                            ar0Var.setReorderingAlbums(false);
                            er0 er0Var = f02.h;
                            for (int i10 = 0; i10 < er0Var.getChildCount(); i10++) {
                                View childAt = er0Var.getChildAt(i10);
                                if (childAt instanceof org.telegram.ui.Cells.s7) {
                                    ((org.telegram.ui.Cells.s7) childAt).l(false, true);
                                }
                            }
                            yt0 yt0Var = t12.c;
                            if (yt0Var != null && yt0Var.y) {
                                yt0Var.y = false;
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
