package org.telegram.ui.Components.voip;

import android.graphics.Canvas;
import android.view.View;
import org.telegram.ui.Components.lu0;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class y2 extends View {
    public lu0 a;
    public boolean b;

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        lu0 lu0Var;
        if (this.b || (lu0Var = this.a) == null) {
            return;
        }
        lu0Var.b(canvas, this);
    }

    public void setState(boolean z10) {
        this.b = z10;
        invalidate();
    }
}
