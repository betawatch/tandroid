package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.os.SystemClock;
import android.view.View;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public abstract class jb extends org.telegram.ui.Components.du0 {
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
                if (childAt instanceof org.telegram.ui.Cells.r1) {
                    canvas.save();
                    canvas.translate(childAt.getX(), childAt.getY());
                    org.telegram.ui.Cells.r1 r1Var = (org.telegram.ui.Cells.r1) childAt;
                    if (r1Var.L0()) {
                        canvas.save();
                        canvas.translate(0.0f, r1Var.W);
                        r1Var.M0(canvas, true, false);
                        canvas.restore();
                    }
                    canvas.restore();
                    lbVar.w.drawChild(canvas, childAt, uptimeMillis);
                    if (r1Var.k2()) {
                        canvas.save();
                        canvas.translate(r1Var.getX(), r1Var.getY());
                        r1Var.i1(canvas);
                        canvas.restore();
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.v0) {
                    lbVar.w.drawChild(canvas, childAt, uptimeMillis);
                    canvas.save();
                    canvas.translate(childAt.getX(), childAt.getY());
                    ((org.telegram.ui.Cells.v0) childAt).I(canvas);
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
