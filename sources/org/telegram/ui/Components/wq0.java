package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class wq0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ yu0 b;

    public /* synthetic */ wq0(yu0 yu0Var, int i10) {
        this.a = i10;
        this.b = yu0Var;
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
                yu0 yu0Var = this.b;
                sr0 sr0Var = yu0Var.T;
                or0 or0Var = yu0Var.S;
                if (yu0Var.n0.getAlpha() >= 0.1f) {
                    if (or0Var != null && or0Var.g()) {
                        or0Var.i();
                    }
                    if (sr0Var != null && sr0Var.w) {
                        xu0 i12 = yu0Var.i1(yu0Var.h1(yu0Var.getClosestTab()));
                        qt0 W = yu0Var.W(i12.a);
                        if (W != null) {
                            sr0Var.setReorderingAlbums(false);
                            wr0 wr0Var = W.h;
                            for (int i10 = 0; i10 < wr0Var.getChildCount(); i10++) {
                                View childAt = wr0Var.getChildAt(i10);
                                if (childAt instanceof org.telegram.ui.Cells.q7) {
                                    ((org.telegram.ui.Cells.q7) childAt).l(false, true);
                                }
                            }
                            wu0 wu0Var = i12.c;
                            if (wu0Var != null && wu0Var.x) {
                                wu0Var.x = false;
                                break;
                            }
                        }
                    }
                }
                break;
            default:
                org.telegram.ui.ActionBar.p2 p2Var = this.b.s1;
                p2Var.getMessagesController().getMainSettings().edit().putBoolean("story_keep", true).apply();
                ph.da.E(p2Var.getParentActivity(), p2Var.getCurrentAccount()).R(null);
                break;
        }
    }
}
