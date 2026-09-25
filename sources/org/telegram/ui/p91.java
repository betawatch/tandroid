package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class p91 implements bh.a {
    public final RectF a = new RectF();
    public final /* synthetic */ w8 b;
    public final /* synthetic */ sa1 c;

    public p91(sa1 sa1Var, w8 w8Var) {
        this.c = sa1Var;
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
        sa1 sa1Var = this.c;
        sa1Var.fragmentView.getMeasuredWidth();
        sa1Var.fragmentView.getMeasuredHeight();
        canvas.drawColor(sa1Var.getThemedColor(org.telegram.ui.ActionBar.h6.d6));
        for (int i10 = 0; i10 < 3; i10++) {
            if (i10 == 0) {
                nVar = sa1Var.T;
                view = sa1Var.S;
            } else if (i10 != 1 || (bcVar = sa1Var.j0) == null) {
                je jeVar = sa1Var.k0;
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
                    sa1Var.fragmentView.getMeasuredWidth();
                }
                canvas.save();
                nVar.f(canvas, rectF);
                canvas.restore();
            }
        }
    }
}
