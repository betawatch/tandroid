package org.telegram.ui.Components.voip;

import android.graphics.Canvas;
import android.view.View;
import org.telegram.ui.Components.bw0;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class e3 extends View {
    public bw0 a;
    public boolean b;

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        bw0 bw0Var;
        if (this.b || (bw0Var = this.a) == null) {
            return;
        }
        bw0Var.b(canvas, this);
    }

    public void setState(boolean z10) {
        this.b = z10;
        invalidate();
    }
}
