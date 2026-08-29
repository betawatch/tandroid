package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class q81 implements mg.a {
    public final RectF a = new RectF();
    public final /* synthetic */ ih.j4 b;
    public final /* synthetic */ t91 c;

    public q81(t91 t91Var, ih.j4 j4Var) {
        this.c = t91Var;
        this.b = j4Var;
    }

    @Override // mg.a
    public final void e(Canvas canvas, RectF rectF) {
        lg.k kVar;
        View view;
        wb wbVar;
        t91 t91Var = this.c;
        t91Var.fragmentView.getMeasuredWidth();
        t91Var.fragmentView.getMeasuredHeight();
        canvas.drawColor(t91Var.getThemedColor(org.telegram.ui.ActionBar.g6.d6));
        for (int i10 = 0; i10 < 3; i10++) {
            if (i10 == 0) {
                kVar = t91Var.P;
                view = t91Var.O;
            } else if (i10 != 1 || (wbVar = t91Var.f0) == null) {
                de deVar = t91Var.g0;
                if (deVar != null) {
                    kVar = deVar.X0;
                    view = deVar;
                } else {
                    kVar = null;
                    view = null;
                }
            } else {
                kVar = wbVar.C;
                view = wbVar;
            }
            if (kVar != null && view != null) {
                ih.j4 j4Var = this.b;
                RectF rectF2 = this.a;
                sg.i.c(view, j4Var, rectF2);
                if (rectF2.right > 0.0f) {
                    t91Var.fragmentView.getMeasuredWidth();
                }
                canvas.save();
                kVar.e(canvas, rectF);
                canvas.restore();
            }
        }
    }

    @Override // mg.a
    public final void g(g.x xVar, RectF rectF) {
        xVar.b = true;
    }
}
