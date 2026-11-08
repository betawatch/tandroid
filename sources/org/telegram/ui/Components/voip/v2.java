package org.telegram.ui.Components.voip;

import android.graphics.Canvas;
import android.view.View;
import org.telegram.ui.Components.cu0;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
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
