package org.telegram.ui.ActionBar;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
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
