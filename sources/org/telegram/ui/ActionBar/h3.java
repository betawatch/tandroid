package org.telegram.ui.ActionBar;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
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
