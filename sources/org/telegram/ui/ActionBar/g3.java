package org.telegram.ui.ActionBar;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class g3 extends FrameLayout implements t3 {
    public final t3 a;

    public g3(t3 t3Var) {
        super(t3Var.getContext());
        this.a = t3Var;
    }

    @Override // org.telegram.ui.ActionBar.t3
    public RectF getRect() {
        return this.a.getRect();
    }

    @Override // org.telegram.ui.ActionBar.t3
    public void setDrawingFromOverlay(boolean z10) {
        this.a.setDrawingFromOverlay(z10);
    }

    @Override // org.telegram.ui.ActionBar.t3
    public final float x(Canvas canvas, RectF rectF, float f7, RectF rectF2, float f10) {
        return this.a.x(canvas, rectF, f7, rectF2, f10);
    }
}
