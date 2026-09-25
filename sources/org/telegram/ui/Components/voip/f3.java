package org.telegram.ui.Components.voip;

import android.graphics.Canvas;
import android.view.View;
import org.telegram.ui.Components.lw0;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class f3 extends View {
    public lw0 a;
    public boolean b;

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        lw0 lw0Var;
        if (this.b || (lw0Var = this.a) == null) {
            return;
        }
        lw0Var.b(canvas, this);
    }

    public void setState(boolean z10) {
        this.b = z10;
        invalidate();
    }
}
