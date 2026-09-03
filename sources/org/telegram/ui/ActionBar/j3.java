package org.telegram.ui.ActionBar;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class j3 extends FrameLayout implements v3 {
    public final v3 a;

    public j3(v3 v3Var) {
        super(v3Var.getContext());
        this.a = v3Var;
    }

    @Override // org.telegram.ui.ActionBar.v3
    public RectF getRect() {
        return this.a.getRect();
    }

    @Override // org.telegram.ui.ActionBar.v3
    public void setDrawingFromOverlay(boolean z4) {
        this.a.setDrawingFromOverlay(z4);
    }

    @Override // org.telegram.ui.ActionBar.v3
    public final float z(Canvas canvas, RectF rectF, float f10, RectF rectF2, float f11) {
        return this.a.z(canvas, rectF, f10, rectF2, f11);
    }
}
