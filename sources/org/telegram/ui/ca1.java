package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class ca1 implements ah.a {
    public final RectF a = new RectF();
    public final /* synthetic */ w8 b;
    public final /* synthetic */ fb1 c;

    public ca1(fb1 fb1Var, w8 w8Var) {
        this.c = fb1Var;
        this.b = w8Var;
    }

    @Override // ah.a
    public final void e(Canvas canvas, RectF rectF) {
        zg.k kVar;
        View view;
        ec ecVar;
        fb1 fb1Var = this.c;
        fb1Var.fragmentView.getMeasuredWidth();
        fb1Var.fragmentView.getMeasuredHeight();
        canvas.drawColor(fb1Var.getThemedColor(org.telegram.ui.ActionBar.j6.d6));
        for (int i10 = 0; i10 < 3; i10++) {
            if (i10 == 0) {
                kVar = fb1Var.T;
                view = fb1Var.S;
            } else if (i10 != 1 || (ecVar = fb1Var.j0) == null) {
                le leVar = fb1Var.k0;
                if (leVar != null) {
                    kVar = leVar.b1;
                    view = leVar;
                } else {
                    kVar = null;
                    view = null;
                }
            } else {
                kVar = ecVar.G;
                view = ecVar;
            }
            if (kVar != null && view != null) {
                w8 w8Var = this.b;
                RectF rectF2 = this.a;
                gh.k.c(view, w8Var, rectF2);
                if (rectF2.right > 0.0f) {
                    fb1Var.fragmentView.getMeasuredWidth();
                }
                canvas.save();
                kVar.e(canvas, rectF);
                canvas.restore();
            }
        }
    }

    @Override // ah.a
    public final void g(g.z zVar, RectF rectF) {
        zVar.b = true;
    }
}
