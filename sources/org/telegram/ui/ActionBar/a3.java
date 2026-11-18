package org.telegram.ui.ActionBar;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class a3 extends FrameLayout implements l3 {
    public final l3 a;

    public a3(l3 l3Var) {
        super(l3Var.getContext());
        this.a = l3Var;
    }

    @Override // org.telegram.ui.ActionBar.l3
    public RectF getRect() {
        return this.a.getRect();
    }

    @Override // org.telegram.ui.ActionBar.l3
    public void setDrawingFromOverlay(boolean z10) {
        this.a.setDrawingFromOverlay(z10);
    }

    @Override // org.telegram.ui.ActionBar.l3
    public final float z(Canvas canvas, RectF rectF, float f10, RectF rectF2, float f11) {
        return this.a.z(canvas, rectF, f10, rectF2, f11);
    }
}
