package org.telegram.ui.Components.voip;

import android.graphics.Canvas;
import android.view.View;
import org.telegram.ui.Components.zv0;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class c3 extends View {
    public zv0 a;
    public boolean b;

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        zv0 zv0Var;
        if (this.b || (zv0Var = this.a) == null) {
            return;
        }
        zv0Var.b(canvas, this);
    }

    public void setState(boolean z10) {
        this.b = z10;
        invalidate();
    }
}
