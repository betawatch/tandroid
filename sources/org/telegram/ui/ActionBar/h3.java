package org.telegram.ui.ActionBar;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class h3 extends FrameLayout implements u3 {
    public final u3 a;

    public h3(u3 u3Var) {
        super(u3Var.getContext());
        this.a = u3Var;
    }

    @Override // org.telegram.ui.ActionBar.u3
    public RectF getRect() {
        return this.a.getRect();
    }

    @Override // org.telegram.ui.ActionBar.u3
    public void setDrawingFromOverlay(boolean z10) {
        this.a.setDrawingFromOverlay(z10);
    }

    @Override // org.telegram.ui.ActionBar.u3
    public final float z(Canvas canvas, RectF rectF, float f7, RectF rectF2, float f10) {
        return this.a.z(canvas, rectF, f7, rectF2, f10);
    }
}
