package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class d91 implements og.a {
    public final RectF a = new RectF();
    public final /* synthetic */ kh.j4 b;
    public final /* synthetic */ ga1 c;

    public d91(ga1 ga1Var, kh.j4 j4Var) {
        this.c = ga1Var;
        this.b = j4Var;
    }

    @Override // og.a
    public final void e(Canvas canvas, RectF rectF) {
        ng.k kVar;
        View view;
        bc bcVar;
        ga1 ga1Var = this.c;
        ga1Var.fragmentView.getMeasuredWidth();
        ga1Var.fragmentView.getMeasuredHeight();
        canvas.drawColor(ga1Var.getThemedColor(org.telegram.ui.ActionBar.j6.d6));
        for (int i10 = 0; i10 < 3; i10++) {
            if (i10 == 0) {
                kVar = ga1Var.Q;
                view = ga1Var.P;
            } else if (i10 != 1 || (bcVar = ga1Var.g0) == null) {
                ke keVar = ga1Var.h0;
                if (keVar != null) {
                    kVar = keVar.Y0;
                    view = keVar;
                } else {
                    kVar = null;
                    view = null;
                }
            } else {
                kVar = bcVar.D;
                view = bcVar;
            }
            if (kVar != null && view != null) {
                kh.j4 j4Var = this.b;
                RectF rectF2 = this.a;
                ug.i.c(view, j4Var, rectF2);
                if (rectF2.right > 0.0f) {
                    ga1Var.fragmentView.getMeasuredWidth();
                }
                canvas.save();
                kVar.e(canvas, rectF);
                canvas.restore();
            }
        }
    }

    @Override // og.a
    public final void g(g.x xVar, RectF rectF) {
        xVar.b = true;
    }
}
