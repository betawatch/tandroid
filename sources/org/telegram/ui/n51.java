package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class n51 extends l61 {
    public final /* synthetic */ x61 B;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n51(x61 x61Var, Context context, boolean z4) {
        super(x61Var, context, z4);
        this.B = x61Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        x61 x61Var = this.B;
        h51 h51Var = x61Var.d0;
        n51 n51Var = x61Var.c0;
        w51 w51Var = x61Var.R;
        if (w51Var != null) {
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            float x10 = h51Var.getX() + n51Var.getX();
            float y10 = h51Var.getY() + n51Var.getY();
            mg.w wVar = (mg.w) w51Var;
            mg.d0 d0Var = (mg.d0) wVar.b;
            mg.c0 c0Var = d0Var.a;
            org.telegram.ui.Components.pk0 pk0Var = (org.telegram.ui.Components.pk0) wVar.c;
            RectF rectF = AndroidUtilities.rectTmp;
            float f10 = 0;
            rectF.set(f10, f10, measuredWidth, measuredHeight);
            pk0Var.getDelegate().l(canvas, rectF, 0.0f, c0Var.getX() + x10, (d0Var.y == 1 ? c0Var.getY() - AndroidUtilities.statusBarHeight : c0Var.getY() + d0Var.c.getY()) + y10, 255, true);
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
