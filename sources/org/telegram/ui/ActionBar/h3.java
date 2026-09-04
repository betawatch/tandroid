package org.telegram.ui.ActionBar;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
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
    public final float z(Canvas canvas, RectF rectF, float f7, RectF rectF2, float f10) {
        return this.a.z(canvas, rectF, f7, rectF2, f10);
    }
}
