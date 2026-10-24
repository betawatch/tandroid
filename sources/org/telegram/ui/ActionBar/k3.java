package org.telegram.ui.ActionBar;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class k3 extends FrameLayout implements x3 {
    public final x3 a;

    public k3(x3 x3Var) {
        super(x3Var.getContext());
        this.a = x3Var;
    }

    @Override // org.telegram.ui.ActionBar.x3
    public RectF getRect() {
        return this.a.getRect();
    }

    @Override // org.telegram.ui.ActionBar.x3
    public void setDrawingFromOverlay(boolean z10) {
        this.a.setDrawingFromOverlay(z10);
    }

    @Override // org.telegram.ui.ActionBar.x3
    public final float y(Canvas canvas, RectF rectF, float f7, RectF rectF2, float f10) {
        return this.a.y(canvas, rectF, f7, rectF2, f10);
    }
}
