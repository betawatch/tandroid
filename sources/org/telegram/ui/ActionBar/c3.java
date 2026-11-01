package org.telegram.ui.ActionBar;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class c3 extends FrameLayout implements o3 {
    public final o3 a;

    public c3(o3 o3Var) {
        super(o3Var.getContext());
        this.a = o3Var;
    }

    @Override // org.telegram.ui.ActionBar.o3
    public RectF getRect() {
        return this.a.getRect();
    }

    @Override // org.telegram.ui.ActionBar.o3
    public void setDrawingFromOverlay(boolean z10) {
        this.a.setDrawingFromOverlay(z10);
    }

    @Override // org.telegram.ui.ActionBar.o3
    public final float x(Canvas canvas, RectF rectF, float f7, RectF rectF2, float f10) {
        return this.a.x(canvas, rectF, f7, rectF2, f10);
    }
}
