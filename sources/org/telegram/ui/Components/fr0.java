package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final /* synthetic */ class fr0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ jv0 b;

    public /* synthetic */ fr0(jv0 jv0Var, int i10) {
        this.a = i10;
        this.b = jv0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                this.b.L(true);
                break;
            case 1:
                this.b.C0(102, view);
                break;
            case 2:
                this.b.C0(100, view);
                break;
            case 3:
                this.b.C0(103, view);
                break;
            case 4:
                this.b.C0(104, view);
                break;
            case 5:
                this.b.C0(101, view);
                break;
            case 6:
                jv0 jv0Var = this.b;
                es0 es0Var = jv0Var.W;
                zr0 zr0Var = jv0Var.V;
                if (jv0Var.q0.getAlpha() >= 0.1f) {
                    if (zr0Var != null && zr0Var.g()) {
                        zr0Var.i();
                    }
                    if (es0Var != null && es0Var.w) {
                        iv0 i12 = jv0Var.i1(jv0Var.h1(jv0Var.getClosestTab()));
                        cu0 W = jv0Var.W(i12.a);
                        if (W != null) {
                            es0Var.setReorderingAlbums(false);
                            is0 is0Var = W.h;
                            for (int i10 = 0; i10 < is0Var.getChildCount(); i10++) {
                                View childAt = is0Var.getChildAt(i10);
                                if (childAt instanceof org.telegram.ui.Cells.t7) {
                                    ((org.telegram.ui.Cells.t7) childAt).l(false, true);
                                }
                            }
                            hv0 hv0Var = i12.c;
                            if (hv0Var != null && hv0Var.x) {
                                hv0Var.x = false;
                                break;
                            }
                        }
                    }
                }
                break;
            default:
                org.telegram.ui.ActionBar.m2 m2Var = this.b.v1;
                m2Var.getMessagesController().getMainSettings().edit().putBoolean("story_keep", true).apply();
                ci.lc.E(m2Var.getParentActivity(), m2Var.getCurrentAccount()).R(null);
                break;
        }
    }
}
