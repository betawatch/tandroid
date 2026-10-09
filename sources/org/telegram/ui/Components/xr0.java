package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class xr0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ bw0 b;

    public /* synthetic */ xr0(bw0 bw0Var, int i10) {
        this.a = i10;
        this.b = bw0Var;
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
                bw0 bw0Var = this.b;
                ws0 ws0Var = bw0Var.W;
                rs0 rs0Var = bw0Var.V;
                if (bw0Var.q0.getAlpha() >= 0.1f) {
                    if (rs0Var != null && rs0Var.g()) {
                        rs0Var.i();
                    }
                    if (ws0Var != null && ws0Var.w) {
                        aw0 i12 = bw0Var.i1(bw0Var.h1(bw0Var.getClosestTab()));
                        uu0 W = bw0Var.W(i12.a);
                        if (W != null) {
                            ws0Var.setReorderingAlbums(false);
                            at0 at0Var = W.h;
                            for (int i10 = 0; i10 < at0Var.getChildCount(); i10++) {
                                View childAt = at0Var.getChildAt(i10);
                                if (childAt instanceof org.telegram.ui.Cells.t7) {
                                    ((org.telegram.ui.Cells.t7) childAt).l(false, true);
                                }
                            }
                            zv0 zv0Var = i12.c;
                            if (zv0Var != null && zv0Var.x) {
                                zv0Var.x = false;
                                break;
                            }
                        }
                    }
                }
                break;
            default:
                org.telegram.ui.ActionBar.n2 n2Var = this.b.v1;
                n2Var.getMessagesController().getMainSettings().edit().putBoolean("story_keep", true).apply();
                ci.lc.D(n2Var.getParentActivity(), n2Var.getCurrentAccount()).Q(null);
                break;
        }
    }
}
