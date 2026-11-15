package org.telegram.ui.ActionBar;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class x2 extends FrameLayout implements h3 {
    public final h3 a;

    public x2(h3 h3Var) {
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
    public final float z(Canvas canvas, RectF rectF, float f10, RectF rectF2, float f11) {
        return this.a.z(canvas, rectF, f10, rectF2, f11);
    }
}
