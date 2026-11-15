package org.telegram.ui.Components.voip;

import android.graphics.Canvas;
import android.view.View;
import org.telegram.ui.Components.du0;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class z2 extends View {
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

    public void setState(boolean z10) {
        this.b = z10;
        invalidate();
    }
}
