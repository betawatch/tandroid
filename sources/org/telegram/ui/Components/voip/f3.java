package org.telegram.ui.Components.voip;

import android.graphics.Canvas;
import android.view.View;
import org.telegram.ui.Components.xw0;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class f3 extends View {
    public xw0 a;
    public boolean b;

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        xw0 xw0Var;
        if (this.b || (xw0Var = this.a) == null) {
            return;
        }
        xw0Var.b(canvas, this);
    }

    public void setState(boolean z10) {
        this.b = z10;
        invalidate();
    }
}
