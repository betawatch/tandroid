package org.telegram.ui.Components;

import android.view.View;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final /* synthetic */ class ip0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ jt0 b;

    public /* synthetic */ ip0(jt0 jt0Var, int i7) {
        this.a = i7;
        this.b = jt0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                jt0 jt0Var = this.b;
                int closestTab = jt0Var.getClosestTab();
                a70 I = a70.I(jt0Var.y1, view);
                I.J = false;
                if (jt0Var.b0(closestTab, new org.telegram.ui.Cells.c5(I))) {
                    if (closestTab == 13 || closestTab == 11) {
                        I.b0(0.0f, -org.telegram.messenger.g0.L(52.0f));
                    } else {
                        I.b0 = true;
                    }
                    I.s = 0;
                    I.a0();
                    break;
                }
                break;
            case 1:
                jt0 jt0Var2 = this.b;
                org.telegram.ui.ActionBar.g5 g5Var = jt0Var2.J;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = g5Var.b;
                if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout.d();
                }
                if (jt0Var2.b0(jt0Var2.getClosestTab(), new qf(jt0Var2, 6))) {
                    g5Var.V(null, null);
                    break;
                }
                break;
            case 2:
                this.b.V(true);
                break;
            case 3:
                jt0 jt0Var3 = this.b;
                jq0 jq0Var = jt0Var3.c0;
                gq0 gq0Var = jt0Var3.b0;
                if (jt0Var3.t0.getAlpha() >= 0.1f) {
                    if (gq0Var != null && gq0Var.g()) {
                        gq0Var.i();
                    }
                    if (jq0Var != null && jq0Var.f) {
                        it0 x12 = jt0Var3.x1(jt0Var3.w1(jt0Var3.getClosestTab()));
                        ds0 g02 = jt0Var3.g0(x12.a);
                        if (g02 != null) {
                            jq0Var.setReorderingAlbums(false);
                            nq0 nq0Var = g02.h;
                            for (int i7 = 0; i7 < nq0Var.getChildCount(); i7++) {
                                View childAt = nq0Var.getChildAt(i7);
                                if (childAt instanceof org.telegram.ui.Cells.p7) {
                                    ((org.telegram.ui.Cells.p7) childAt).l(false, true);
                                }
                            }
                            ht0 ht0Var = x12.c;
                            if (ht0Var != null && ht0Var.y) {
                                ht0Var.y = false;
                                break;
                            }
                        }
                    }
                }
                break;
            default:
                org.telegram.ui.ActionBar.g2 g2Var = this.b.y1;
                g2Var.getMessagesController().h7.edit().putBoolean("story_keep", true).apply();
                hi.sa.D(g2Var.getParentActivity(), g2Var.getCurrentAccount()).Q(null);
                break;
        }
    }
}
