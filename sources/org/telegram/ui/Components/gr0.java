package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final /* synthetic */ class gr0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ kv0 b;

    public /* synthetic */ gr0(kv0 kv0Var, int i10) {
        this.a = i10;
        this.b = kv0Var;
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
                kv0 kv0Var = this.b;
                fs0 fs0Var = kv0Var.W;
                zr0 zr0Var = kv0Var.V;
                if (kv0Var.q0.getAlpha() >= 0.1f) {
                    if (zr0Var != null && zr0Var.g()) {
                        zr0Var.i();
                    }
                    if (fs0Var != null && fs0Var.w) {
                        jv0 i12 = kv0Var.i1(kv0Var.h1(kv0Var.getClosestTab()));
                        du0 W = kv0Var.W(i12.a);
                        if (W != null) {
                            fs0Var.setReorderingAlbums(false);
                            js0 js0Var = W.h;
                            for (int i10 = 0; i10 < js0Var.getChildCount(); i10++) {
                                View childAt = js0Var.getChildAt(i10);
                                if (childAt instanceof org.telegram.ui.Cells.t7) {
                                    ((org.telegram.ui.Cells.t7) childAt).l(false, true);
                                }
                            }
                            iv0 iv0Var = i12.c;
                            if (iv0Var != null && iv0Var.x) {
                                iv0Var.x = false;
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
