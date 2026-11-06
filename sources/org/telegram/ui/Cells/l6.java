package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import org.telegram.ui.Components.oa0;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class l6 extends org.telegram.ui.Components.l9 {
    public final /* synthetic */ int G;
    public final /* synthetic */ m6 H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l6(m6 m6Var, Context context, int i7) {
        super(context);
        this.H = m6Var;
        this.G = i7;
    }

    @Override // org.telegram.ui.Components.l9, android.view.View
    public final void onDraw(Canvas canvas) {
        m6 m6Var = this.H;
        k6 k6Var = m6Var.E;
        oa0 oa0Var = m6.H;
        if (this.G != 1) {
            super.onDraw(canvas);
        } else {
            k6Var.F.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
            di.r7.h(m6Var.D, canvas, getImageReceiver(), k6Var);
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.H.E.a(this, motionEvent);
    }
}
