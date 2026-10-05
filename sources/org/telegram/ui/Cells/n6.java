package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import org.telegram.ui.Components.oc0;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
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
        m6 m6Var = o6Var.y;
        oc0 oc0Var = o6.G;
        if (this.G != 1) {
            super.onDraw(canvas);
        } else {
            m6Var.F.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
            ai.ia.h(o6Var.x, canvas, getImageReceiver(), m6Var);
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.H.y.a(motionEvent, this);
    }
}
