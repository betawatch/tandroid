package org.telegram.ui.Components.voip;

import android.graphics.Canvas;
import android.view.View;
import org.telegram.ui.Components.aw0;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class e3 extends View {
    public aw0 a;
    public boolean b;

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        aw0 aw0Var;
        if (this.b || (aw0Var = this.a) == null) {
            return;
        }
        aw0Var.b(canvas, this);
    }

    public void setState(boolean z10) {
        this.b = z10;
        invalidate();
    }
}
