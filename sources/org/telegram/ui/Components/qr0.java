package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class qr0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ uv0 b;

    public /* synthetic */ qr0(uv0 uv0Var, int i10) {
        this.a = i10;
        this.b = uv0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                this.b.L(true);
                break;
            case 1:
                this.b.E0(102, view);
                break;
            case 2:
                this.b.E0(100, view);
                break;
            case 3:
                this.b.E0(103, view);
                break;
            case 4:
                this.b.E0(104, view);
                break;
            case 5:
                this.b.E0(101, view);
                break;
            case 6:
                uv0 uv0Var = this.b;
                ps0 ps0Var = uv0Var.W;
                ks0 ks0Var = uv0Var.V;
                if (uv0Var.q0.getAlpha() >= 0.1f) {
                    if (ks0Var != null && ks0Var.g()) {
                        ks0Var.i();
                    }
                    if (ps0Var != null && ps0Var.w) {
                        tv0 k12 = uv0Var.k1(uv0Var.j1(uv0Var.getClosestTab()));
                        nu0 W = uv0Var.W(k12.a);
                        if (W != null) {
                            ps0Var.setReorderingAlbums(false);
                            ts0 ts0Var = W.h;
                            for (int i10 = 0; i10 < ts0Var.getChildCount(); i10++) {
                                View childAt = ts0Var.getChildAt(i10);
                                if (childAt instanceof org.telegram.ui.Cells.s7) {
                                    ((org.telegram.ui.Cells.s7) childAt).l(false, true);
                                }
                            }
                            sv0 sv0Var = k12.c;
                            if (sv0Var != null && sv0Var.x) {
                                sv0Var.x = false;
                                break;
                            }
                        }
                    }
                }
                break;
            default:
                org.telegram.ui.ActionBar.n2 n2Var = this.b.v1;
                n2Var.getMessagesController().getMainSettings().edit().putBoolean("story_keep", true).apply();
                ei.vb.D(n2Var.getParentActivity(), n2Var.getCurrentAccount()).Q(null);
                break;
        }
    }
}
