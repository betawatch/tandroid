package org.telegram.ui.ActionBar;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class i3 extends FrameLayout implements u3 {
    public final u3 a;

    public i3(u3 u3Var) {
        super(u3Var.getContext());
        this.a = u3Var;
    }

    @Override // org.telegram.ui.ActionBar.u3
    public RectF getRect() {
        return this.a.getRect();
    }

    @Override // org.telegram.ui.ActionBar.u3
    public void setDrawingFromOverlay(boolean z4) {
        this.a.setDrawingFromOverlay(z4);
    }

    @Override // org.telegram.ui.ActionBar.u3
    public final float z(Canvas canvas, RectF rectF, float f10, RectF rectF2, float f11) {
        return this.a.z(canvas, rectF, f10, rectF2, f11);
    }
}
