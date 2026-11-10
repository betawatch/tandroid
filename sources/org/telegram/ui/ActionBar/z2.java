package org.telegram.ui.ActionBar;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class z2 extends FrameLayout implements j3 {
    public final j3 a;

    public z2(j3 j3Var) {
        super(j3Var.getContext());
        this.a = j3Var;
    }

    @Override // org.telegram.ui.ActionBar.j3
    public RectF getRect() {
        return this.a.getRect();
    }

    @Override // org.telegram.ui.ActionBar.j3
    public void setDrawingFromOverlay(boolean z9) {
        this.a.setDrawingFromOverlay(z9);
    }

    @Override // org.telegram.ui.ActionBar.j3
    public final float z(Canvas canvas, RectF rectF, float f10, RectF rectF2, float f11) {
        return this.a.z(canvas, rectF, f10, rectF2, f11);
    }
}
