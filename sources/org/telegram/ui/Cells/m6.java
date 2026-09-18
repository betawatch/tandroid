package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import org.telegram.ui.Components.ac0;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class m6 extends org.telegram.ui.Components.u9 {
    public final /* synthetic */ int G;
    public final /* synthetic */ n6 H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m6(n6 n6Var, Context context, int i10) {
        super(context);
        this.H = n6Var;
        this.G = i10;
    }

    @Override // org.telegram.ui.Components.u9, android.view.View
    public final void onDraw(Canvas canvas) {
        n6 n6Var = this.H;
        l6 l6Var = n6Var.y;
        ac0 ac0Var = n6.G;
        if (this.G != 1) {
            super.onDraw(canvas);
        } else {
            l6Var.F.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
            ai.ia.h(n6Var.x, canvas, getImageReceiver(), l6Var);
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.H.y.a(motionEvent, this);
    }
}
