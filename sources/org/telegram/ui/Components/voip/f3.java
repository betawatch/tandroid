package org.telegram.ui.Components.voip;

import android.graphics.Canvas;
import android.view.View;
import org.telegram.ui.Components.ww0;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final class f3 extends View {
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
