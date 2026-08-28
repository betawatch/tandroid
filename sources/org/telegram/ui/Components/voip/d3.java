package org.telegram.ui.Components.voip;

import android.graphics.Canvas;
import android.view.View;
import org.telegram.ui.Components.iv0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class d3 extends View {
    public iv0 a;
    public boolean b;

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        iv0 iv0Var;
        if (this.b || (iv0Var = this.a) == null) {
            return;
        }
        iv0Var.b(canvas, this);
    }

    public void setState(boolean z10) {
        this.b = z10;
        invalidate();
    }
}
