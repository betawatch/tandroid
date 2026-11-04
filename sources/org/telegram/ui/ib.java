package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.os.SystemClock;
import android.view.View;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public abstract class ib extends org.telegram.ui.Components.qt0 {
    public final /* synthetic */ kb g0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ib(kb kbVar, Context context) {
        super(context, null);
        this.g0 = kbVar;
    }

    public final void X(Canvas canvas, RectF rectF) {
        boolean z10;
        long uptimeMillis = SystemClock.uptimeMillis();
        kb kbVar = this.g0;
        if (kbVar.w.Y0()) {
            canvas.save();
            canvas.clipRect(rectF);
            drawChild(canvas, kbVar.w, uptimeMillis);
            canvas.restore();
            return;
        }
        canvas.save();
        canvas.clipRect(rectF);
        canvas.translate(0.0f, kbVar.w.getY());
        kbVar.w.getClass();
        for (int i3 = 0; i3 < kbVar.w.getChildCount(); i3++) {
            View childAt = kbVar.w.getChildAt(i3);
            RectF rectF2 = kbVar.Q0;
            if (rectF == null || kbVar.w == null || childAt == null) {
                z10 = false;
            } else {
                rectF2.set(childAt.getX(), kbVar.w.getY() + childAt.getY(), childAt.getX() + childAt.getWidth(), kbVar.w.getY() + childAt.getY() + childAt.getHeight());
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
                    kbVar.w.drawChild(canvas, childAt, uptimeMillis);
                    if (q1Var.j2()) {
                        canvas.save();
                        canvas.translate(q1Var.getX(), q1Var.getY());
                        q1Var.i1(canvas);
                        canvas.restore();
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.t0) {
                    kbVar.w.drawChild(canvas, childAt, uptimeMillis);
                    canvas.save();
                    canvas.translate(childAt.getX(), childAt.getY());
                    ((org.telegram.ui.Cells.t0) childAt).H(canvas);
                    canvas.restore();
                } else {
                    kbVar.w.drawChild(canvas, childAt, uptimeMillis);
                }
            }
        }
        kbVar.w.getClass();
        canvas.restore();
    }
}
