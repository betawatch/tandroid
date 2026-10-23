package org.telegram.ui.Components.voip;

import android.graphics.Canvas;
import android.view.View;
import org.telegram.ui.Components.ww0;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes4.dex */
public final class c3 extends View {
    public ww0 a;
    public boolean b;

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        ww0 ww0Var;
        if (this.b || (ww0Var = this.a) == null) {
            return;
        }
        ww0Var.b(canvas, this);
    }

    public void setState(boolean z10) {
        this.b = z10;
        invalidate();
    }
}
