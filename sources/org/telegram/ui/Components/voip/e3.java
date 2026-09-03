package org.telegram.ui.Components.voip;

import android.graphics.Canvas;
import android.view.View;
import org.telegram.ui.Components.bw0;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
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

    public void setState(boolean z4) {
        this.b = z4;
        invalidate();
    }
}
