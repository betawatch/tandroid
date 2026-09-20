package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
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
                yr0 yr0Var = jv0Var.V;
                if (jv0Var.q0.getAlpha() >= 0.1f) {
                    if (yr0Var != null && yr0Var.g()) {
                        yr0Var.i();
                    }
                    if (es0Var != null && es0Var.w) {
                        iv0 i12 = jv0Var.i1(jv0Var.h1(jv0Var.getClosestTab()));
                        cu0 W = jv0Var.W(i12.a);
                        if (W != null) {
                            es0Var.setReorderingAlbums(false);
                            is0 is0Var = W.h;
                            for (int i10 = 0; i10 < is0Var.getChildCount(); i10++) {
                                View childAt = is0Var.getChildAt(i10);
                                if (childAt instanceof org.telegram.ui.Cells.u7) {
                                    ((org.telegram.ui.Cells.u7) childAt).l(false, true);
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
                org.telegram.ui.ActionBar.n2 n2Var = this.b.v1;
                n2Var.getMessagesController().getMainSettings().edit().putBoolean("story_keep", true).apply();
                ci.oc.E(n2Var.getParentActivity(), n2Var.getCurrentAccount()).R(null);
                break;
        }
    }
}
