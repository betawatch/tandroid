package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class mk extends lu0 {
    public mk(ViewGroup viewGroup, ViewGroup viewGroup2) {
        super(viewGroup, viewGroup2);
    }

    @Override // org.telegram.ui.lu0
    public final void c(Canvas canvas, float f9, float f10, float f11, float f12, float f13) {
        if (f9 > 0.0f) {
            View view = this.e;
            if (view instanceof org.telegram.ui.Cells.s1) {
                org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) view;
                int max = (int) Math.max(f12, f11);
                int min = (int) Math.min(f13, s1Var.getMeasuredHeight() + f11);
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(f10, max, s1Var.getMeasuredWidth() + f10, min);
                canvas.saveLayerAlpha(rectF, (int) (f9 * 255.0f), 31);
                canvas.translate(f10, f11 + s1Var.getPaddingTop());
                s1Var.Ad = true;
                s1Var.Y1(canvas);
                if (s1Var.f4() && s1Var.getCurrentMessagesGroup() == null) {
                    s1Var.m2(1.0f, canvas, false);
                }
                s1Var.Ad = false;
                canvas.restore();
            }
        }
    }
}
