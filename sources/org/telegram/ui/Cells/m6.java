package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import org.telegram.ui.Components.bc0;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class m6 extends org.telegram.ui.Components.x9 {
    public final /* synthetic */ int G;
    public final /* synthetic */ n6 H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m6(n6 n6Var, Context context, int i10) {
        super(context);
        this.H = n6Var;
        this.G = i10;
    }

    @Override // org.telegram.ui.Components.x9, android.view.View
    public final void onDraw(Canvas canvas) {
        n6 n6Var = this.H;
        l6 l6Var = n6Var.y;
        bc0 bc0Var = n6.G;
        if (this.G != 1) {
            super.onDraw(canvas);
        } else {
            l6Var.F.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
            bi.p9.h(n6Var.x, canvas, getImageReceiver(), l6Var);
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.H.y.a(motionEvent, this);
    }
}
