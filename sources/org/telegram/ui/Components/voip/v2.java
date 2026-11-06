package org.telegram.ui.Components.voip;

import android.graphics.Canvas;
import android.view.View;
import org.telegram.ui.Components.cu0;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class v2 extends View {
    public cu0 a;
    public boolean b;

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        cu0 cu0Var;
        if (this.b || (cu0Var = this.a) == null) {
            return;
        }
        cu0Var.b(canvas, this);
    }

    public void setState(boolean z9) {
        this.b = z9;
        invalidate();
    }
}
