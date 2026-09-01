package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class i51 extends g61 {
    public final /* synthetic */ r61 B;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i51(r61 r61Var, Context context, boolean z4) {
        super(r61Var, context, z4);
        this.B = r61Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        r61 r61Var = this.B;
        c51 c51Var = r61Var.d0;
        i51 i51Var = r61Var.c0;
        r51 r51Var = r61Var.R;
        if (r51Var != null) {
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            float x10 = c51Var.getX() + i51Var.getX();
            float y10 = c51Var.getY() + i51Var.getY();
            ng.w wVar = (ng.w) r51Var;
            ng.d0 d0Var = (ng.d0) wVar.b;
            ng.c0 c0Var = d0Var.a;
            org.telegram.ui.Components.rk0 rk0Var = (org.telegram.ui.Components.rk0) wVar.c;
            RectF rectF = AndroidUtilities.rectTmp;
            float f10 = 0;
            rectF.set(f10, f10, measuredWidth, measuredHeight);
            rk0Var.getDelegate().j(canvas, rectF, 0.0f, c0Var.getX() + x10, (d0Var.y == 1 ? c0Var.getY() - AndroidUtilities.statusBarHeight : c0Var.getY() + d0Var.c.getY()) + y10, 255, true);
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
