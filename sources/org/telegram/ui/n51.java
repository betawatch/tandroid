package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class n51 extends l61 {
    public final /* synthetic */ w61 B;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n51(w61 w61Var, Context context, boolean z4) {
        super(w61Var, context, z4);
        this.B = w61Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        w61 w61Var = this.B;
        h51 h51Var = w61Var.d0;
        n51 n51Var = w61Var.c0;
        w51 w51Var = w61Var.R;
        if (w51Var != null) {
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            float x10 = h51Var.getX() + n51Var.getX();
            float y10 = h51Var.getY() + n51Var.getY();
            ng.w wVar = (ng.w) w51Var;
            ng.d0 d0Var = (ng.d0) wVar.b;
            ng.c0 c0Var = d0Var.a;
            org.telegram.ui.Components.qk0 qk0Var = (org.telegram.ui.Components.qk0) wVar.c;
            RectF rectF = AndroidUtilities.rectTmp;
            float f10 = 0;
            rectF.set(f10, f10, measuredWidth, measuredHeight);
            qk0Var.getDelegate().j(canvas, rectF, 0.0f, c0Var.getX() + x10, (d0Var.y == 1 ? c0Var.getY() - AndroidUtilities.statusBarHeight : c0Var.getY() + d0Var.c.getY()) + y10, 255, true);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.View
    public final void setTranslationY(float f10) {
        if (f10 != getTranslationY()) {
            super.setTranslationY(f10);
            if (this.B.R != null) {
                invalidate();
            }
        }
    }
}
