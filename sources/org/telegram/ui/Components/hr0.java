package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final /* synthetic */ class hr0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ lv0 b;

    public /* synthetic */ hr0(lv0 lv0Var, int i10) {
        this.a = i10;
        this.b = lv0Var;
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
                lv0 lv0Var = this.b;
                gs0 gs0Var = lv0Var.W;
                bs0 bs0Var = lv0Var.V;
                if (lv0Var.q0.getAlpha() >= 0.1f) {
                    if (bs0Var != null && bs0Var.g()) {
                        bs0Var.i();
                    }
                    if (gs0Var != null && gs0Var.w) {
                        kv0 i12 = lv0Var.i1(lv0Var.h1(lv0Var.getClosestTab()));
                        eu0 W = lv0Var.W(i12.a);
                        if (W != null) {
                            gs0Var.setReorderingAlbums(false);
                            ks0 ks0Var = W.h;
                            for (int i10 = 0; i10 < ks0Var.getChildCount(); i10++) {
                                View childAt = ks0Var.getChildAt(i10);
                                if (childAt instanceof org.telegram.ui.Cells.u7) {
                                    ((org.telegram.ui.Cells.u7) childAt).l(false, true);
                                }
                            }
                            jv0 jv0Var = i12.c;
                            if (jv0Var != null && jv0Var.x) {
                                jv0Var.x = false;
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
