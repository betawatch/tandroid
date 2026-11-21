package org.telegram.ui.Components.voip;

import android.graphics.Canvas;
import android.view.View;
import org.telegram.ui.Components.ou0;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class y2 extends View {
    public ou0 a;
    public boolean b;

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        ou0 ou0Var;
        if (this.b || (ou0Var = this.a) == null) {
            return;
        }
        ou0Var.b(canvas, this);
    }

    public void setState(boolean z10) {
        this.b = z10;
        invalidate();
    }
}
