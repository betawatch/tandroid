package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final class m81 implements ch.a {
    public final RectF a = new RectF();
    public final /* synthetic */ y8 b;
    public final /* synthetic */ p91 c;

    public m81(p91 p91Var, y8 y8Var) {
        this.c = p91Var;
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
        cc ccVar;
        p91 p91Var = this.c;
        p91Var.fragmentView.getMeasuredWidth();
        p91Var.fragmentView.getMeasuredHeight();
        canvas.drawColor(p91Var.getThemedColor(org.telegram.ui.ActionBar.h6.d6));
        for (int i10 = 0; i10 < 3; i10++) {
            if (i10 == 0) {
                lVar = p91Var.T;
                view = p91Var.S;
            } else if (i10 != 1 || (ccVar = p91Var.j0) == null) {
                ie ieVar = p91Var.k0;
                if (ieVar != null) {
                    lVar = ieVar.b1;
                    view = ieVar;
                } else {
                    lVar = null;
                    view = null;
                }
            } else {
                lVar = ccVar.G;
                view = ccVar;
            }
            if (lVar != null && view != null) {
                y8 y8Var = this.b;
                RectF rectF2 = this.a;
                ih.j.c(view, y8Var, rectF2);
                if (rectF2.right > 0.0f) {
                    p91Var.fragmentView.getMeasuredWidth();
                }
                canvas.save();
                lVar.f(canvas, rectF);
                canvas.restore();
            }
        }
    }
}
