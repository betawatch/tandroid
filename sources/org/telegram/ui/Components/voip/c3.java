package org.telegram.ui.Components.voip;

import android.graphics.Canvas;
import android.view.View;
import org.telegram.ui.Components.zv0;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
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
