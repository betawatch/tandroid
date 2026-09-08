package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class a61 extends y61 {
    public final /* synthetic */ j71 E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a61(j71 j71Var, Context context, boolean z10) {
        super(j71Var, context, z10);
        this.E = j71Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        j71 j71Var = this.E;
        v51 v51Var = j71Var.g0;
        a61 a61Var = j71Var.f0;
        j61 j61Var = j71Var.U;
        if (j61Var != null) {
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            float x10 = v51Var.getX() + a61Var.getX();
            float y3 = v51Var.getY() + a61Var.getY();
            ah.i0 i0Var = (ah.i0) j61Var;
            ah.u0 u0Var = (ah.u0) i0Var.b;
            ah.t0 t0Var = u0Var.a;
            org.telegram.ui.Components.fk0 fk0Var = (org.telegram.ui.Components.fk0) i0Var.c;
            RectF rectF = AndroidUtilities.rectTmp;
            float f7 = 0;
            rectF.set(f7, f7, measuredWidth, measuredHeight);
            fk0Var.getDelegate().I(canvas, rectF, 0.0f, t0Var.getX() + x10, (u0Var.y == 1 ? t0Var.getY() - AndroidUtilities.statusBarHeight : t0Var.getY() + u0Var.c.getY()) + y3, 255, true);
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
