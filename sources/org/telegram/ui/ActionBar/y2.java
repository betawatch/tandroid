package org.telegram.ui.ActionBar;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
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
