package org.telegram.ui.ActionBar;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class i3 extends FrameLayout implements w3 {
    public final w3 a;

    public i3(w3 w3Var) {
        super(w3Var.getContext());
        this.a = w3Var;
    }

    @Override // org.telegram.ui.ActionBar.w3
    public RectF getRect() {
        return this.a.getRect();
    }

    @Override // org.telegram.ui.ActionBar.w3
    public void setDrawingFromOverlay(boolean z10) {
        this.a.setDrawingFromOverlay(z10);
    }

    @Override // org.telegram.ui.ActionBar.w3
    public final float x(Canvas canvas, RectF rectF, float f7, RectF rectF2, float f10) {
        return this.a.x(canvas, rectF, f7, rectF2, f10);
    }
}
