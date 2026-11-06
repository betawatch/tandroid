package org.telegram.ui.ActionBar;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class y2 extends FrameLayout implements i3 {
    public final i3 a;

    public y2(i3 i3Var) {
        super(i3Var.getContext());
        this.a = i3Var;
    }

    @Override // org.telegram.ui.ActionBar.i3
    public RectF getRect() {
        return this.a.getRect();
    }

    @Override // org.telegram.ui.ActionBar.i3
    public void setDrawingFromOverlay(boolean z9) {
        this.a.setDrawingFromOverlay(z9);
    }

    @Override // org.telegram.ui.ActionBar.i3
    public final float z(Canvas canvas, RectF rectF, float f10, RectF rectF2, float f11) {
        return this.a.z(canvas, rectF, f10, rectF2, f11);
    }
}
