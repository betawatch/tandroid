package org.telegram.ui.ActionBar;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class j3 extends FrameLayout implements x3 {
    public final x3 a;

    public j3(x3 x3Var) {
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
    public final float w(Canvas canvas, RectF rectF, float f7, RectF rectF2, float f10) {
        return this.a.w(canvas, rectF, f7, rectF2, f10);
    }
}
