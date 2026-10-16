package org.telegram.ui.ActionBar;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
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
    public final float z(Canvas canvas, RectF rectF, float f7, RectF rectF2, float f10) {
        return this.a.z(canvas, rectF, f7, rectF2, f10);
    }
}
