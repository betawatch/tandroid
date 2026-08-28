package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class p81 implements jg.a {
    public final RectF a = new RectF();
    public final /* synthetic */ fh.x4 b;
    public final /* synthetic */ s91 c;

    public p81(s91 s91Var, fh.x4 x4Var) {
        this.c = s91Var;
        this.b = x4Var;
    }

    @Override // jg.a
    public final void e(Canvas canvas, RectF rectF) {
        ig.k kVar;
        View view;
        xb xbVar;
        s91 s91Var = this.c;
        s91Var.fragmentView.getMeasuredWidth();
        s91Var.fragmentView.getMeasuredHeight();
        canvas.drawColor(s91Var.getThemedColor(org.telegram.ui.ActionBar.f6.d6));
        for (int i9 = 0; i9 < 3; i9++) {
            if (i9 == 0) {
                kVar = s91Var.P;
                view = s91Var.O;
            } else if (i9 != 1 || (xbVar = s91Var.f0) == null) {
                fe feVar = s91Var.g0;
                if (feVar != null) {
                    kVar = feVar.X0;
                    view = feVar;
                } else {
                    kVar = null;
                    view = null;
                }
            } else {
                kVar = xbVar.C;
                view = xbVar;
            }
            if (kVar != null && view != null) {
                fh.x4 x4Var = this.b;
                RectF rectF2 = this.a;
                pg.i.c(view, x4Var, rectF2);
                if (rectF2.right > 0.0f) {
                    s91Var.fragmentView.getMeasuredWidth();
                }
                canvas.save();
                kVar.e(canvas, rectF);
                canvas.restore();
            }
        }
    }

    @Override // jg.a
    public final void g(g.x xVar, RectF rectF) {
        xVar.b = true;
    }
}
