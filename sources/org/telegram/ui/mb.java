package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.os.SystemClock;
import android.view.View;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public abstract class mb extends org.telegram.ui.Components.xu0 {
    public final /* synthetic */ pb s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mb(pb pbVar, Context context) {
        super(context, null);
        this.s0 = pbVar;
    }

    public final void Z(Canvas canvas, RectF rectF) {
        boolean z10;
        long uptimeMillis = SystemClock.uptimeMillis();
        pb pbVar = this.s0;
        if (pbVar.A.Z0()) {
            canvas.save();
            canvas.clipRect(rectF);
            drawChild(canvas, pbVar.A, uptimeMillis);
            canvas.restore();
            return;
        }
        canvas.save();
        canvas.clipRect(rectF);
        canvas.translate(0.0f, pbVar.A.getY());
        pbVar.A.getClass();
        for (int i9 = 0; i9 < pbVar.A.getChildCount(); i9++) {
            View childAt = pbVar.A.getChildAt(i9);
            RectF rectF2 = pbVar.S0;
            if (rectF == null || pbVar.A == null || childAt == null) {
                z10 = false;
            } else {
                rectF2.set(childAt.getX(), pbVar.A.getY() + childAt.getY(), childAt.getX() + childAt.getWidth(), pbVar.A.getY() + childAt.getY() + childAt.getHeight());
                z10 = !rectF2.intersect(rectF);
            }
            if (!z10) {
                if (childAt instanceof org.telegram.ui.Cells.t1) {
                    canvas.save();
                    canvas.translate(childAt.getX(), childAt.getY());
                    org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) childAt;
                    if (t1Var.C1()) {
                        canvas.save();
                        canvas.translate(0.0f, t1Var.R);
                        t1Var.D1(canvas, true, false);
                        canvas.restore();
                    }
                    canvas.restore();
                    pbVar.A.drawChild(canvas, childAt, uptimeMillis);
                    if (t1Var.U2()) {
                        canvas.save();
                        canvas.translate(t1Var.getX(), t1Var.getY());
                        t1Var.X1(canvas);
                        canvas.restore();
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.w0) {
                    pbVar.A.drawChild(canvas, childAt, uptimeMillis);
                    canvas.save();
                    canvas.translate(childAt.getX(), childAt.getY());
                    ((org.telegram.ui.Cells.w0) childAt).z(canvas);
                    canvas.restore();
                } else {
                    pbVar.A.drawChild(canvas, childAt, uptimeMillis);
                }
            }
        }
        pbVar.A.getClass();
        canvas.restore();
    }

    @Override // org.telegram.ui.Components.xu0
    public /* bridge */ /* synthetic */ int[] getColorKeys() {
        return null;
    }
}
