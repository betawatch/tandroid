package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.os.SystemClock;
import android.view.View;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public abstract class jb extends org.telegram.ui.Components.au0 {
    public final /* synthetic */ lb g0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jb(lb lbVar, Context context) {
        super(context, null);
        this.g0 = lbVar;
    }

    public final void X(Canvas canvas, RectF rectF) {
        boolean z10;
        long uptimeMillis = SystemClock.uptimeMillis();
        lb lbVar = this.g0;
        if (lbVar.w.Y0()) {
            canvas.save();
            canvas.clipRect(rectF);
            drawChild(canvas, lbVar.w, uptimeMillis);
            canvas.restore();
            return;
        }
        canvas.save();
        canvas.clipRect(rectF);
        canvas.translate(0.0f, lbVar.w.getY());
        lbVar.w.getClass();
        for (int i7 = 0; i7 < lbVar.w.getChildCount(); i7++) {
            View childAt = lbVar.w.getChildAt(i7);
            RectF rectF2 = lbVar.Q0;
            if (rectF == null || lbVar.w == null || childAt == null) {
                z10 = false;
            } else {
                rectF2.set(childAt.getX(), lbVar.w.getY() + childAt.getY(), childAt.getX() + childAt.getWidth(), lbVar.w.getY() + childAt.getY() + childAt.getHeight());
                z10 = !rectF2.intersect(rectF);
            }
            if (!z10) {
                if (childAt instanceof org.telegram.ui.Cells.q1) {
                    canvas.save();
                    canvas.translate(childAt.getX(), childAt.getY());
                    org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) childAt;
                    if (q1Var.L0()) {
                        canvas.save();
                        canvas.translate(0.0f, q1Var.W);
                        q1Var.M0(canvas, true, false);
                        canvas.restore();
                    }
                    canvas.restore();
                    lbVar.w.drawChild(canvas, childAt, uptimeMillis);
                    if (q1Var.k2()) {
                        canvas.save();
                        canvas.translate(q1Var.getX(), q1Var.getY());
                        q1Var.i1(canvas);
                        canvas.restore();
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.u0) {
                    lbVar.w.drawChild(canvas, childAt, uptimeMillis);
                    canvas.save();
                    canvas.translate(childAt.getX(), childAt.getY());
                    ((org.telegram.ui.Cells.u0) childAt).K(canvas);
                    canvas.restore();
                } else {
                    lbVar.w.drawChild(canvas, childAt, uptimeMillis);
                }
            }
        }
        lbVar.w.getClass();
        canvas.restore();
    }
}
