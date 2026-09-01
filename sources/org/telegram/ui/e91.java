package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class e91 implements pg.a {
    public final RectF a = new RectF();
    public final /* synthetic */ lh.j4 b;
    public final /* synthetic */ ha1 c;

    public e91(ha1 ha1Var, lh.j4 j4Var) {
        this.c = ha1Var;
        this.b = j4Var;
    }

    @Override // pg.a
    public final void e(Canvas canvas, RectF rectF) {
        og.k kVar;
        View view;
        ac acVar;
        ha1 ha1Var = this.c;
        ha1Var.fragmentView.getMeasuredWidth();
        ha1Var.fragmentView.getMeasuredHeight();
        canvas.drawColor(ha1Var.getThemedColor(org.telegram.ui.ActionBar.k6.d6));
        for (int i10 = 0; i10 < 3; i10++) {
            if (i10 == 0) {
                kVar = ha1Var.Q;
                view = ha1Var.P;
            } else if (i10 != 1 || (acVar = ha1Var.g0) == null) {
                ke keVar = ha1Var.h0;
                if (keVar != null) {
                    kVar = keVar.Y0;
                    view = keVar;
                } else {
                    kVar = null;
                    view = null;
                }
            } else {
                kVar = acVar.D;
                view = acVar;
            }
            if (kVar != null && view != null) {
                lh.j4 j4Var = this.b;
                RectF rectF2 = this.a;
                vg.i.c(view, j4Var, rectF2);
                if (rectF2.right > 0.0f) {
                    ha1Var.fragmentView.getMeasuredWidth();
                }
                canvas.save();
                kVar.e(canvas, rectF);
                canvas.restore();
            }
        }
    }

    @Override // pg.a
    public final void g(g.x xVar, RectF rectF) {
        xVar.b = true;
    }
}
