package org.telegram.ui.Components.voip;

import android.graphics.Canvas;
import android.view.View;
import org.telegram.ui.Components.gx0;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final class f3 extends View {
    public gx0 a;
    public boolean b;

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        gx0 gx0Var;
        if (this.b || (gx0Var = this.a) == null) {
            return;
        }
        gx0Var.b(canvas, this);
    }

    public void setState(boolean z10) {
        this.b = z10;
        invalidate();
    }
}
