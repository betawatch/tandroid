package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class o81 implements ch.a {
    public final RectF a = new RectF();
    public final /* synthetic */ y8 b;
    public final /* synthetic */ r91 c;

    public o81(r91 r91Var, y8 y8Var) {
        this.c = r91Var;
        this.b = y8Var;
    }

    @Override // ch.a
    public final void e(bh.a aVar, RectF rectF) {
        aVar.a = true;
    }

    @Override // ch.a
    public final void f(Canvas canvas, RectF rectF) {
        bh.l lVar;
        View view;
        ec ecVar;
        r91 r91Var = this.c;
        r91Var.fragmentView.getMeasuredWidth();
        r91Var.fragmentView.getMeasuredHeight();
        canvas.drawColor(r91Var.getThemedColor(org.telegram.ui.ActionBar.h6.d6));
        for (int i10 = 0; i10 < 3; i10++) {
            if (i10 == 0) {
                lVar = r91Var.T;
                view = r91Var.S;
            } else if (i10 != 1 || (ecVar = r91Var.j0) == null) {
                ke keVar = r91Var.k0;
                if (keVar != null) {
                    lVar = keVar.b1;
                    view = keVar;
                } else {
                    lVar = null;
                    view = null;
                }
            } else {
                lVar = ecVar.G;
                view = ecVar;
            }
            if (lVar != null && view != null) {
                y8 y8Var = this.b;
                RectF rectF2 = this.a;
                ih.j.c(view, y8Var, rectF2);
                if (rectF2.right > 0.0f) {
                    r91Var.fragmentView.getMeasuredWidth();
                }
                canvas.save();
                lVar.f(canvas, rectF);
                canvas.restore();
            }
        }
    }
}
