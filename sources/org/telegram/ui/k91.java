package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class k91 implements pg.a {
    public final RectF a = new RectF();
    public final /* synthetic */ lh.j4 b;
    public final /* synthetic */ na1 c;

    public k91(na1 na1Var, lh.j4 j4Var) {
        this.c = na1Var;
        this.b = j4Var;
    }

    @Override // pg.a
    public final void e(Canvas canvas, RectF rectF) {
        og.k kVar;
        View view;
        ac acVar;
        na1 na1Var = this.c;
        na1Var.fragmentView.getMeasuredWidth();
        na1Var.fragmentView.getMeasuredHeight();
        canvas.drawColor(na1Var.getThemedColor(org.telegram.ui.ActionBar.k6.d6));
        for (int i10 = 0; i10 < 3; i10++) {
            if (i10 == 0) {
                kVar = na1Var.Q;
                view = na1Var.P;
            } else if (i10 != 1 || (acVar = na1Var.g0) == null) {
                ke keVar = na1Var.h0;
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
                    na1Var.fragmentView.getMeasuredWidth();
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
