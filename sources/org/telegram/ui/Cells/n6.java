package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import org.telegram.ui.Components.wc0;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class n6 extends org.telegram.ui.Components.w9 {
    public final /* synthetic */ int G;
    public final /* synthetic */ o6 H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n6(o6 o6Var, Context context, int i10) {
        super(context);
        this.H = o6Var;
        this.G = i10;
    }

    @Override // org.telegram.ui.Components.w9, android.view.View
    public final void onDraw(Canvas canvas) {
        o6 o6Var = this.H;
        m6 m6Var = o6Var.E;
        wc0 wc0Var = o6.H;
        if (this.G != 1) {
            super.onDraw(canvas);
        } else {
            m6Var.F.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
            ci.c8.h(o6Var.y, canvas, getImageReceiver(), m6Var);
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.H.E.a(motionEvent, this);
    }
}
