package org.telegram.ui.Components.voip;

import android.graphics.Canvas;
import android.view.View;
import org.telegram.ui.Components.bw0;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class f3 extends View {
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
