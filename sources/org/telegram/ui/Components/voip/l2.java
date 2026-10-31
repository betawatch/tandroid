package org.telegram.ui.Components.voip;

import android.graphics.Canvas;
import android.view.View;
import org.telegram.ui.Components.fv0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class l2 extends View {
    public fv0 a;
    public boolean b;

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        fv0 fv0Var;
        if (this.b || (fv0Var = this.a) == null) {
            return;
        }
        fv0Var.b(canvas, this);
    }

    public void setState(boolean z10) {
        this.b = z10;
        invalidate();
    }
}
