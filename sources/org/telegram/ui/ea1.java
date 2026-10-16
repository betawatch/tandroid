package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class ea1 implements ch.a {
    public final RectF a = new RectF();
    public final /* synthetic */ z8 b;
    public final /* synthetic */ hb1 c;

    public ea1(hb1 hb1Var, z8 z8Var) {
        this.c = hb1Var;
        this.b = z8Var;
    }

    @Override // ch.a
    public final void e(bh.a aVar, RectF rectF) {
        aVar.a = true;
    }

    @Override // ch.a
    public final void f(Canvas canvas, RectF rectF) {
        bh.l lVar;
        View view;
        hc hcVar;
        hb1 hb1Var = this.c;
        hb1Var.fragmentView.getMeasuredWidth();
        hb1Var.fragmentView.getMeasuredHeight();
        canvas.drawColor(hb1Var.getThemedColor(org.telegram.ui.ActionBar.g6.d6));
        for (int i10 = 0; i10 < 3; i10++) {
            if (i10 == 0) {
                lVar = hb1Var.T;
                view = hb1Var.S;
            } else if (i10 != 1 || (hcVar = hb1Var.j0) == null) {
                qe qeVar = hb1Var.k0;
                if (qeVar != null) {
                    lVar = qeVar.b1;
                    view = qeVar;
                } else {
                    lVar = null;
                    view = null;
                }
            } else {
                lVar = hcVar.G;
                view = hcVar;
            }
            if (lVar != null && view != null) {
                z8 z8Var = this.b;
                RectF rectF2 = this.a;
                ih.j.c(view, z8Var, rectF2);
                if (rectF2.right > 0.0f) {
                    hb1Var.fragmentView.getMeasuredWidth();
                }
                canvas.save();
                lVar.f(canvas, rectF);
                canvas.restore();
            }
        }
    }
}
