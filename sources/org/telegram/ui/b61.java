package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class b61 extends z61 {
    public final /* synthetic */ k71 E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b61(k71 k71Var, Context context, boolean z10) {
        super(k71Var, context, z10);
        this.E = k71Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        k71 k71Var = this.E;
        w51 w51Var = k71Var.g0;
        b61 b61Var = k71Var.f0;
        k61 k61Var = k71Var.U;
        if (k61Var != null) {
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            float x10 = w51Var.getX() + b61Var.getX();
            float y3 = w51Var.getY() + b61Var.getY();
            qg.x1 x1Var = (qg.x1) k61Var;
            zg.a0 a0Var = (zg.a0) x1Var.b;
            zg.z zVar = a0Var.a;
            org.telegram.ui.Components.kl0 kl0Var = (org.telegram.ui.Components.kl0) x1Var.c;
            RectF rectF = AndroidUtilities.rectTmp;
            float f7 = 0;
            rectF.set(f7, f7, measuredWidth, measuredHeight);
            kl0Var.getDelegate().r(canvas, rectF, 0.0f, zVar.getX() + x10, (a0Var.y == 1 ? zVar.getY() - AndroidUtilities.statusBarHeight : zVar.getY() + a0Var.c.getY()) + y3, 255, true);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.View
    public final void setTranslationY(float f7) {
        if (f7 != getTranslationY()) {
            super.setTranslationY(f7);
            if (this.E.U != null) {
                invalidate();
            }
        }
    }
}
