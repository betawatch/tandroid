package org.telegram.ui.Components.voip;

import android.graphics.Canvas;
import android.view.View;
import org.telegram.ui.Components.gv0;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class m2 extends View {
    public gv0 a;
    public boolean b;

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        gv0 gv0Var;
        if (this.b || (gv0Var = this.a) == null) {
            return;
        }
        gv0Var.b(canvas, this);
    }

    public void setState(boolean z10) {
        this.b = z10;
        invalidate();
    }
}
