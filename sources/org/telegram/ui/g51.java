package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class g51 extends e61 {
    public final /* synthetic */ q61 B;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g51(q61 q61Var, Context context, boolean z4) {
        super(q61Var, context, z4);
        this.B = q61Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        q61 q61Var = this.B;
        a51 a51Var = q61Var.d0;
        g51 g51Var = q61Var.c0;
        p51 p51Var = q61Var.R;
        if (p51Var != null) {
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            float x10 = a51Var.getX() + g51Var.getX();
            float y10 = a51Var.getY() + g51Var.getY();
            mg.w wVar = (mg.w) p51Var;
            mg.d0 d0Var = (mg.d0) wVar.b;
            mg.c0 c0Var = d0Var.a;
            org.telegram.ui.Components.pk0 pk0Var = (org.telegram.ui.Components.pk0) wVar.c;
            RectF rectF = AndroidUtilities.rectTmp;
            float f10 = 0;
            rectF.set(f10, f10, measuredWidth, measuredHeight);
            pk0Var.getDelegate().n(canvas, rectF, 0.0f, c0Var.getX() + x10, (d0Var.y == 1 ? c0Var.getY() - AndroidUtilities.statusBarHeight : c0Var.getY() + d0Var.c.getY()) + y10, 255, true);
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
