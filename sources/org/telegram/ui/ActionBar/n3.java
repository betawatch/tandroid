package org.telegram.ui.ActionBar;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class n3 extends FrameLayout implements z3 {
    public final z3 a;

    public n3(z3 z3Var) {
        super(z3Var.getContext());
        this.a = z3Var;
    }

    @Override // org.telegram.ui.ActionBar.z3
    public RectF getRect() {
        return this.a.getRect();
    }

    @Override // org.telegram.ui.ActionBar.z3
    public void setDrawingFromOverlay(boolean z10) {
        this.a.setDrawingFromOverlay(z10);
    }

    @Override // org.telegram.ui.ActionBar.z3
    public final float y(Canvas canvas, RectF rectF, float f7, RectF rectF2, float f10) {
        return this.a.y(canvas, rectF, f7, rectF2, f10);
    }
}
