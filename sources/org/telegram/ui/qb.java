package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.os.SystemClock;
import android.view.View;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public abstract class qb extends org.telegram.ui.Components.uu0 {
    public final /* synthetic */ sb f0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qb(sb sbVar, Context context) {
        super(context, null);
        this.f0 = sbVar;
    }

    public final void X(Canvas canvas, RectF rectF) {
        boolean z10;
        long uptimeMillis = SystemClock.uptimeMillis();
        sb sbVar = this.f0;
        if (sbVar.w.Y0()) {
            canvas.save();
            canvas.clipRect(rectF);
            drawChild(canvas, sbVar.w, uptimeMillis);
            canvas.restore();
            return;
        }
        canvas.save();
        canvas.clipRect(rectF);
        canvas.translate(0.0f, sbVar.w.getY());
        sbVar.w.getClass();
        for (int i10 = 0; i10 < sbVar.w.getChildCount(); i10++) {
            View childAt = sbVar.w.getChildAt(i10);
            RectF rectF2 = sbVar.P0;
            if (rectF == null || sbVar.w == null || childAt == null) {
                z10 = false;
            } else {
                rectF2.set(childAt.getX(), sbVar.w.getY() + childAt.getY(), childAt.getX() + childAt.getWidth(), sbVar.w.getY() + childAt.getY() + childAt.getHeight());
                z10 = !rectF2.intersect(rectF);
            }
            if (!z10) {
                if (childAt instanceof org.telegram.ui.Cells.q1) {
                    canvas.save();
                    canvas.translate(childAt.getX(), childAt.getY());
                    org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) childAt;
                    if (q1Var.J0()) {
                        canvas.save();
                        canvas.translate(0.0f, q1Var.V);
                        q1Var.K0(canvas, true, false);
                        canvas.restore();
                    }
                    canvas.restore();
                    sbVar.w.drawChild(canvas, childAt, uptimeMillis);
                    if (q1Var.h2()) {
                        canvas.save();
                        canvas.translate(q1Var.getX(), q1Var.getY());
                        q1Var.g1(canvas);
                        canvas.restore();
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.s0) {
                    sbVar.w.drawChild(canvas, childAt, uptimeMillis);
                    canvas.save();
                    canvas.translate(childAt.getX(), childAt.getY());
                    ((org.telegram.ui.Cells.s0) childAt).I(canvas);
                    canvas.restore();
                } else {
                    sbVar.w.drawChild(canvas, childAt, uptimeMillis);
                }
            }
        }
        sbVar.w.getClass();
        canvas.restore();
    }
}
