package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class cq0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ eu0 b;

    public /* synthetic */ cq0(eu0 eu0Var, int i9) {
        this.a = i9;
        this.b = eu0Var;
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
                eu0 eu0Var = this.b;
                zq0 zq0Var = eu0Var.S;
                vq0 vq0Var = eu0Var.R;
                if (eu0Var.m0.getAlpha() >= 0.1f) {
                    if (vq0Var != null && vq0Var.g()) {
                        vq0Var.i();
                    }
                    if (zq0Var != null && zq0Var.w) {
                        du0 i12 = eu0Var.i1(eu0Var.h1(eu0Var.getClosestTab()));
                        xs0 W = eu0Var.W(i12.a);
                        if (W != null) {
                            zq0Var.setReorderingAlbums(false);
                            dr0 dr0Var = W.h;
                            for (int i9 = 0; i9 < dr0Var.getChildCount(); i9++) {
                                View childAt = dr0Var.getChildAt(i9);
                                if (childAt instanceof org.telegram.ui.Cells.r7) {
                                    ((org.telegram.ui.Cells.r7) childAt).l(false, true);
                                }
                            }
                            cu0 cu0Var = i12.c;
                            if (cu0Var != null && cu0Var.x) {
                                cu0Var.x = false;
                                break;
                            }
                        }
                    }
                }
                break;
            default:
                org.telegram.ui.ActionBar.o2 o2Var = this.b.r1;
                o2Var.getMessagesController().getMainSettings().edit().putBoolean("story_keep", true).apply();
                kh.wb.E(o2Var.getParentActivity(), o2Var.getCurrentAccount()).R(null);
                break;
        }
    }
}
