package org.telegram.ui.Components;

import android.view.View;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class vo0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ws0 b;

    public /* synthetic */ vo0(ws0 ws0Var, int i3) {
        this.a = i3;
        this.b = ws0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                ws0 ws0Var = this.b;
                int closestTab = ws0Var.getClosestTab();
                f60 H = f60.H(ws0Var.y1, view);
                H.J = false;
                if (ws0Var.b0(closestTab, new y00(H))) {
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
                ws0 ws0Var2 = this.b;
                org.telegram.ui.ActionBar.f5 f5Var = ws0Var2.J;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = f5Var.b;
                if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout.d();
                }
                if (ws0Var2.b0(ws0Var2.getClosestTab(), new i9(ws0Var2, 7))) {
                    f5Var.U(null, null);
                    break;
                }
                break;
            case 2:
                this.b.V(true);
                break;
            case 3:
                ws0 ws0Var3 = this.b;
                yp0 yp0Var = ws0Var3.c0;
                vp0 vp0Var = ws0Var3.b0;
                if (ws0Var3.t0.getAlpha() >= 0.1f) {
                    if (vp0Var != null && vp0Var.g()) {
                        vp0Var.i();
                    }
                    if (yp0Var != null && yp0Var.f) {
                        vs0 v12 = ws0Var3.v1(ws0Var3.u1(ws0Var3.getClosestTab()));
                        rr0 g02 = ws0Var3.g0(v12.a);
                        if (g02 != null) {
                            yp0Var.setReorderingAlbums(false);
                            cq0 cq0Var = g02.h;
                            for (int i3 = 0; i3 < cq0Var.getChildCount(); i3++) {
                                View childAt = cq0Var.getChildAt(i3);
                                if (childAt instanceof org.telegram.ui.Cells.n7) {
                                    ((org.telegram.ui.Cells.n7) childAt).l(false, true);
                                }
                            }
                            us0 us0Var = v12.c;
                            if (us0Var != null && us0Var.y) {
                                us0Var.y = false;
                                break;
                            }
                        }
                    }
                }
                break;
            default:
                org.telegram.ui.ActionBar.d2 d2Var = this.b.y1;
                d2Var.getMessagesController().e7.edit().putBoolean("story_keep", true).apply();
                gi.va.D(d2Var.getParentActivity(), d2Var.getCurrentAccount()).Q(null);
                break;
        }
    }
}
