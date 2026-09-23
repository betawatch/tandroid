package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class o91 implements bh.a {
    public final RectF a = new RectF();
    public final /* synthetic */ w8 b;
    public final /* synthetic */ ra1 c;

    public o91(ra1 ra1Var, w8 w8Var) {
        this.c = ra1Var;
        this.b = w8Var;
    }

    @Override // bh.a
    public final void b(ah.a aVar, RectF rectF) {
        aVar.a = true;
    }

    @Override // bh.a
    public final void f(Canvas canvas, RectF rectF) {
        ah.n nVar;
        View view;
        bc bcVar;
        ra1 ra1Var = this.c;
        ra1Var.fragmentView.getMeasuredWidth();
        ra1Var.fragmentView.getMeasuredHeight();
        canvas.drawColor(ra1Var.getThemedColor(org.telegram.ui.ActionBar.h6.d6));
        for (int i10 = 0; i10 < 3; i10++) {
            if (i10 == 0) {
                nVar = ra1Var.T;
                view = ra1Var.S;
            } else if (i10 != 1 || (bcVar = ra1Var.j0) == null) {
                je jeVar = ra1Var.k0;
                if (jeVar != null) {
                    nVar = jeVar.b1;
                    view = jeVar;
                } else {
                    nVar = null;
                    view = null;
                }
            } else {
                nVar = bcVar.G;
                view = bcVar;
            }
            if (nVar != null && view != null) {
                w8 w8Var = this.b;
                RectF rectF2 = this.a;
                hh.k.c(view, w8Var, rectF2);
                if (rectF2.right > 0.0f) {
                    ra1Var.fragmentView.getMeasuredWidth();
                }
                canvas.save();
                nVar.f(canvas, rectF);
                canvas.restore();
            }
        }
    }
}
