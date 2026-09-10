package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class c61 extends a71 {
    public final /* synthetic */ l71 E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c61(l71 l71Var, Context context, boolean z10) {
        super(l71Var, context, z10);
        this.E = l71Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        l71 l71Var = this.E;
        bi.l4 l4Var = l71Var.g0;
        c61 c61Var = l71Var.f0;
        l61 l61Var = l71Var.U;
        if (l61Var != null) {
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            float x10 = l4Var.getX() + c61Var.getX();
            float y3 = l4Var.getY() + c61Var.getY();
            sg.f0 f0Var = (sg.f0) l61Var;
            yg.c0 c0Var = (yg.c0) f0Var.c;
            yg.b0 b0Var = c0Var.a;
            org.telegram.ui.Components.pk0 pk0Var = (org.telegram.ui.Components.pk0) f0Var.b;
            RectF rectF = AndroidUtilities.rectTmp;
            float f7 = 0;
            rectF.set(f7, f7, measuredWidth, measuredHeight);
            pk0Var.getDelegate().r(canvas, rectF, 0.0f, b0Var.getX() + x10, (c0Var.y == 1 ? b0Var.getY() - AndroidUtilities.statusBarHeight : b0Var.getY() + c0Var.c.getY()) + y3, 255, true);
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
