package org.telegram.ui.Components.voip;

import android.graphics.Canvas;
import android.view.View;
import org.telegram.ui.Components.dx0;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final class e3 extends View {
    public dx0 a;
    public boolean b;

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        dx0 dx0Var;
        if (this.b || (dx0Var = this.a) == null) {
            return;
        }
        dx0Var.b(canvas, this);
    }

    public void setState(boolean z10) {
        this.b = z10;
        invalidate();
    }
}
