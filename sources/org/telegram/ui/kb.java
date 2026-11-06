package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.os.SystemClock;
import android.view.View;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public abstract class kb extends org.telegram.ui.Components.rt0 {
    public final /* synthetic */ mb f0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kb(mb mbVar, Context context) {
        super(context, null);
        this.f0 = mbVar;
    }

    public final void X(Canvas canvas, RectF rectF) {
        boolean z9;
        long uptimeMillis = SystemClock.uptimeMillis();
        mb mbVar = this.f0;
        if (mbVar.w.Y0()) {
            canvas.save();
            canvas.clipRect(rectF);
            drawChild(canvas, mbVar.w, uptimeMillis);
            canvas.restore();
            return;
        }
        canvas.save();
        canvas.clipRect(rectF);
        canvas.translate(0.0f, mbVar.w.getY());
        mbVar.w.getClass();
        for (int i7 = 0; i7 < mbVar.w.getChildCount(); i7++) {
            View childAt = mbVar.w.getChildAt(i7);
            RectF rectF2 = mbVar.P0;
            if (rectF == null || mbVar.w == null || childAt == null) {
                z9 = false;
            } else {
                rectF2.set(childAt.getX(), mbVar.w.getY() + childAt.getY(), childAt.getX() + childAt.getWidth(), mbVar.w.getY() + childAt.getY() + childAt.getHeight());
                z9 = !rectF2.intersect(rectF);
            }
            if (!z9) {
                if (childAt instanceof org.telegram.ui.Cells.q1) {
                    canvas.save();
                    canvas.translate(childAt.getX(), childAt.getY());
                    org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) childAt;
                    if (q1Var.L0()) {
                        canvas.save();
                        canvas.translate(0.0f, q1Var.V);
                        q1Var.M0(canvas, true, false);
                        canvas.restore();
                    }
                    canvas.restore();
                    mbVar.w.drawChild(canvas, childAt, uptimeMillis);
                    if (q1Var.j2()) {
                        canvas.save();
                        canvas.translate(q1Var.getX(), q1Var.getY());
                        q1Var.i1(canvas);
                        canvas.restore();
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.t0) {
                    mbVar.w.drawChild(canvas, childAt, uptimeMillis);
                    canvas.save();
                    canvas.translate(childAt.getX(), childAt.getY());
                    ((org.telegram.ui.Cells.t0) childAt).G(canvas);
                    canvas.restore();
                } else {
                    mbVar.w.drawChild(canvas, childAt, uptimeMillis);
                }
            }
        }
        mbVar.w.getClass();
        canvas.restore();
    }
}
