package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class n81 implements kg.a {
    public final RectF a = new RectF();
    public final /* synthetic */ gh.q4 b;
    public final /* synthetic */ q91 c;

    public n81(q91 q91Var, gh.q4 q4Var) {
        this.c = q91Var;
        this.b = q4Var;
    }

    @Override // kg.a
    public final void e(Canvas canvas, RectF rectF) {
        jg.k kVar;
        View view;
        yb ybVar;
        q91 q91Var = this.c;
        q91Var.fragmentView.getMeasuredWidth();
        q91Var.fragmentView.getMeasuredHeight();
        canvas.drawColor(q91Var.getThemedColor(org.telegram.ui.ActionBar.g6.d6));
        for (int i10 = 0; i10 < 3; i10++) {
            if (i10 == 0) {
                kVar = q91Var.P;
                view = q91Var.O;
            } else if (i10 != 1 || (ybVar = q91Var.f0) == null) {
                fe feVar = q91Var.g0;
                if (feVar != null) {
                    kVar = feVar.X0;
                    view = feVar;
                } else {
                    kVar = null;
                    view = null;
                }
            } else {
                kVar = ybVar.C;
                view = ybVar;
            }
            if (kVar != null && view != null) {
                gh.q4 q4Var = this.b;
                RectF rectF2 = this.a;
                qg.j.c(view, q4Var, rectF2);
                if (rectF2.right > 0.0f) {
                    q91Var.fragmentView.getMeasuredWidth();
                }
                canvas.save();
                kVar.e(canvas, rectF);
                canvas.restore();
            }
        }
    }

    @Override // kg.a
    public final void g(g.y yVar, RectF rectF) {
        yVar.b = true;
    }
}
