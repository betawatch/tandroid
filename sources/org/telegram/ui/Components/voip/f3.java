package org.telegram.ui.Components.voip;

import android.graphics.Canvas;
import android.view.View;
import org.telegram.ui.Components.cw0;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class f3 extends View {
    public cw0 a;
    public boolean b;

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        cw0 cw0Var;
        if (this.b || (cw0Var = this.a) == null) {
            return;
        }
        cw0Var.b(canvas, this);
    }

    public void setState(boolean z4) {
        this.b = z4;
        invalidate();
    }
}
