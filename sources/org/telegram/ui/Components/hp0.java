package org.telegram.ui.Components;

import android.view.View;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class hp0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ it0 b;

    public /* synthetic */ hp0(it0 it0Var, int i7) {
        this.a = i7;
        this.b = it0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                it0 it0Var = this.b;
                int closestTab = it0Var.getClosestTab();
                x60 I = x60.I(it0Var.y1, view);
                I.J = false;
                if (it0Var.b0(closestTab, new org.telegram.ui.ActionBar.i5(I))) {
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
                it0 it0Var2 = this.b;
                org.telegram.ui.ActionBar.g5 g5Var = it0Var2.J;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = g5Var.b;
                if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout.d();
                }
                if (it0Var2.b0(it0Var2.getClosestTab(), new org.telegram.ui.Cells.aa(it0Var2, 8))) {
                    g5Var.V(null, null);
                    break;
                }
                break;
            case 2:
                this.b.V(true);
                break;
            case 3:
                it0 it0Var3 = this.b;
                iq0 iq0Var = it0Var3.c0;
                fq0 fq0Var = it0Var3.b0;
                if (it0Var3.t0.getAlpha() >= 0.1f) {
                    if (fq0Var != null && fq0Var.g()) {
                        fq0Var.i();
                    }
                    if (iq0Var != null && iq0Var.f) {
                        ht0 x12 = it0Var3.x1(it0Var3.w1(it0Var3.getClosestTab()));
                        ds0 g02 = it0Var3.g0(x12.a);
                        if (g02 != null) {
                            iq0Var.setReorderingAlbums(false);
                            mq0 mq0Var = g02.h;
                            for (int i7 = 0; i7 < mq0Var.getChildCount(); i7++) {
                                View childAt = mq0Var.getChildAt(i7);
                                if (childAt instanceof org.telegram.ui.Cells.o7) {
                                    ((org.telegram.ui.Cells.o7) childAt).l(false, true);
                                }
                            }
                            gt0 gt0Var = x12.c;
                            if (gt0Var != null && gt0Var.y) {
                                gt0Var.y = false;
                                break;
                            }
                        }
                    }
                }
                break;
            default:
                org.telegram.ui.ActionBar.g2 g2Var = this.b.y1;
                g2Var.getMessagesController().h7.edit().putBoolean("story_keep", true).apply();
                hi.nb.D(g2Var.getParentActivity(), g2Var.getCurrentAccount()).Q(null);
                break;
        }
    }
}
