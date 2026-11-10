package org.telegram.ui.Components.voip;

import android.graphics.Canvas;
import android.view.View;
import org.telegram.ui.Components.du0;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class v2 extends View {
    public du0 a;
    public boolean b;

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        du0 du0Var;
        if (this.b || (du0Var = this.a) == null) {
            return;
        }
        du0Var.b(canvas, this);
    }

    public void setState(boolean z9) {
        this.b = z9;
        invalidate();
    }
}
