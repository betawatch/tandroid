package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
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
        u41 u41Var = j71Var.g0;
        a61 a61Var = j71Var.f0;
        j61 j61Var = j71Var.U;
        if (j61Var != null) {
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            float x10 = u41Var.getX() + a61Var.getX();
            float y3 = u41Var.getY() + a61Var.getY();
            s5.e eVar = (s5.e) j61Var;
            zg.b0 b0Var = (zg.b0) eVar.b;
            zg.a0 a0Var = b0Var.a;
            org.telegram.ui.Components.pk0 pk0Var = (org.telegram.ui.Components.pk0) eVar.c;
            RectF rectF = AndroidUtilities.rectTmp;
            float f7 = 0;
            rectF.set(f7, f7, measuredWidth, measuredHeight);
            pk0Var.getDelegate().n(canvas, rectF, 0.0f, a0Var.getX() + x10, (b0Var.y == 1 ? a0Var.getY() - AndroidUtilities.statusBarHeight : a0Var.getY() + b0Var.c.getY()) + y3, 255, true);
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
