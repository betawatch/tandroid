package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ur0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ aw0 b;

    public /* synthetic */ ur0(aw0 aw0Var, int i10) {
        this.a = i10;
        this.b = aw0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                aw0 aw0Var = this.b;
                int closestTab = aw0Var.getClosestTab();
                k80 H = k80.H(aw0Var.x1, view);
                H.J = false;
                if (aw0Var.Y(closestTab, new jg.s0(H, 22))) {
                    if (closestTab == 13 || closestTab == 11) {
                        H.a0(0.0f, -AndroidUtilities.dp(52.0f));
                    } else {
                        H.Y = true;
                    }
                    H.s = 0;
                    H.Z();
                    break;
                }
                break;
            case 1:
                aw0 aw0Var2 = this.b;
                org.telegram.ui.ActionBar.y5 y5Var = aw0Var2.I;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = y5Var.b;
                if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout.d();
                }
                if (aw0Var2.Y(aw0Var2.getClosestTab(), new jg.i(aw0Var2))) {
                    y5Var.U(null, null);
                    break;
                }
                break;
            case 2:
                this.b.S(true);
                break;
            case 3:
                aw0 aw0Var3 = this.b;
                zs0 zs0Var = aw0Var3.b0;
                vs0 vs0Var = aw0Var3.a0;
                if (aw0Var3.s0.getAlpha() >= 0.1f) {
                    if (vs0Var != null && vs0Var.g()) {
                        vs0Var.i();
                    }
                    if (zs0Var != null && zs0Var.f) {
                        zv0 r12 = aw0Var3.r1(aw0Var3.q1(aw0Var3.getClosestTab()));
                        tu0 d02 = aw0Var3.d0(r12.a);
                        if (d02 != null) {
                            zs0Var.setReorderingAlbums(false);
                            dt0 dt0Var = d02.h;
                            for (int i10 = 0; i10 < dt0Var.getChildCount(); i10++) {
                                View childAt = dt0Var.getChildAt(i10);
                                if (childAt instanceof org.telegram.ui.Cells.w7) {
                                    ((org.telegram.ui.Cells.w7) childAt).l(false, true);
                                }
                            }
                            yv0 yv0Var = r12.c;
                            if (yv0Var != null && yv0Var.x) {
                                yv0Var.x = false;
                                break;
                            }
                        }
                    }
                }
                break;
            default:
                org.telegram.ui.ActionBar.r2 r2Var = this.b.x1;
                r2Var.getMessagesController().getMainSettings().edit().putBoolean("story_keep", true).apply();
                fi.sb.D(r2Var.getParentActivity(), r2Var.getCurrentAccount()).Q(null);
                break;
        }
    }
}
