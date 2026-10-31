package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import org.telegram.ui.Components.hb0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class p6 extends org.telegram.ui.Components.g9 {
    public final /* synthetic */ int G;
    public final /* synthetic */ q6 H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p6(q6 q6Var, Context context, int i10) {
        super(context);
        this.H = q6Var;
        this.G = i10;
    }

    @Override // org.telegram.ui.Components.g9, android.view.View
    public final void onDraw(Canvas canvas) {
        q6 q6Var = this.H;
        o6 o6Var = q6Var.E;
        hb0 hb0Var = q6.H;
        if (this.G != 1) {
            super.onDraw(canvas);
        } else {
            o6Var.F.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
            th.w5.h(q6Var.D, canvas, getImageReceiver(), o6Var);
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.H.E.a(this, motionEvent);
    }
}
