package org.telegram.ui.ActionBar;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class h3 extends FrameLayout implements v3 {
    public final v3 a;

    public h3(v3 v3Var) {
        super(v3Var.getContext());
        this.a = v3Var;
    }

    @Override // org.telegram.ui.ActionBar.v3
    public RectF getRect() {
        return this.a.getRect();
    }

    @Override // org.telegram.ui.ActionBar.v3
    public void setDrawingFromOverlay(boolean z10) {
        this.a.setDrawingFromOverlay(z10);
    }

    @Override // org.telegram.ui.ActionBar.v3
    public final float x(Canvas canvas, RectF rectF, float f7, RectF rectF2, float f10) {
        return this.a.x(canvas, rectF, f7, rectF2, f10);
    }
}
