package org.telegram.ui.ActionBar;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class w2 extends FrameLayout implements h3 {
    public final h3 a;

    public w2(h3 h3Var) {
        super(h3Var.getContext());
        this.a = h3Var;
    }

    @Override // org.telegram.ui.ActionBar.h3
    public RectF getRect() {
        return this.a.getRect();
    }

    @Override // org.telegram.ui.ActionBar.h3
    public void setDrawingFromOverlay(boolean z10) {
        this.a.setDrawingFromOverlay(z10);
    }

    @Override // org.telegram.ui.ActionBar.h3
    public final float y(Canvas canvas, RectF rectF, float f10, RectF rectF2, float f11) {
        return this.a.y(canvas, rectF, f10, rectF2, f11);
    }
}
