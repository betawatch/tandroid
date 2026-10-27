package org.telegram.ui.Components.voip;

import android.graphics.Canvas;
import android.view.View;
import org.telegram.ui.Components.hx0;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class f3 extends View {
    public hx0 a;
    public boolean b;

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        hx0 hx0Var;
        if (this.b || (hx0Var = this.a) == null) {
            return;
        }
        hx0Var.b(canvas, this);
    }

    public void setState(boolean z10) {
        this.b = z10;
        invalidate();
    }
}
