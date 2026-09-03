package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class l91 implements og.a {
    public final RectF a = new RectF();
    public final /* synthetic */ kh.i4 b;
    public final /* synthetic */ oa1 c;

    public l91(oa1 oa1Var, kh.i4 i4Var) {
        this.c = oa1Var;
        this.b = i4Var;
    }

    @Override // og.a
    public final void e(Canvas canvas, RectF rectF) {
        ng.k kVar;
        View view;
        cc ccVar;
        oa1 oa1Var = this.c;
        oa1Var.fragmentView.getMeasuredWidth();
        oa1Var.fragmentView.getMeasuredHeight();
        canvas.drawColor(oa1Var.getThemedColor(org.telegram.ui.ActionBar.j6.d6));
        for (int i10 = 0; i10 < 3; i10++) {
            if (i10 == 0) {
                kVar = oa1Var.Q;
                view = oa1Var.P;
            } else if (i10 != 1 || (ccVar = oa1Var.g0) == null) {
                me meVar = oa1Var.h0;
                if (meVar != null) {
                    kVar = meVar.Y0;
                    view = meVar;
                } else {
                    kVar = null;
                    view = null;
                }
            } else {
                kVar = ccVar.D;
                view = ccVar;
            }
            if (kVar != null && view != null) {
                kh.i4 i4Var = this.b;
                RectF rectF2 = this.a;
                ug.i.c(view, i4Var, rectF2);
                if (rectF2.right > 0.0f) {
                    oa1Var.fragmentView.getMeasuredWidth();
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
