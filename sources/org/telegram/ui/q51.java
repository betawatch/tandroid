package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class q51 extends o61 {
    public final /* synthetic */ z61 E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q51(z61 z61Var, Context context, boolean z10) {
        super(z61Var, context, z10);
        this.E = z61Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        z61 z61Var = this.E;
        l51 l51Var = z61Var.g0;
        q51 q51Var = z61Var.f0;
        z51 z51Var = z61Var.U;
        if (z51Var != null) {
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            float x10 = l51Var.getX() + q51Var.getX();
            float y3 = l51Var.getY() + q51Var.getY();
            tg.d dVar = (tg.d) z51Var;
            zg.c0 c0Var = (zg.c0) dVar.b;
            zg.b0 b0Var = c0Var.a;
            org.telegram.ui.Components.gk0 gk0Var = (org.telegram.ui.Components.gk0) dVar.c;
            RectF rectF = AndroidUtilities.rectTmp;
            float f7 = 0;
            rectF.set(f7, f7, measuredWidth, measuredHeight);
            gk0Var.getDelegate().n(canvas, rectF, 0.0f, b0Var.getX() + x10, (c0Var.y == 1 ? b0Var.getY() - AndroidUtilities.statusBarHeight : b0Var.getY() + c0Var.c.getY()) + y3, 255, true);
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
