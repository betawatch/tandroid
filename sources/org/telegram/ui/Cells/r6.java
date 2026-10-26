package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import org.telegram.ui.Components.sc0;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class r6 extends org.telegram.ui.Components.y9 {
    public final /* synthetic */ int G;
    public final /* synthetic */ s6 H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r6(s6 s6Var, Context context, int i10) {
        super(context);
        this.H = s6Var;
        this.G = i10;
    }

    @Override // org.telegram.ui.Components.y9, android.view.View
    public final void onDraw(Canvas canvas) {
        s6 s6Var = this.H;
        q6 q6Var = s6Var.E;
        sc0 sc0Var = s6.H;
        if (this.G != 1) {
            super.onDraw(canvas);
        } else {
            q6Var.F.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
            di.a8.h(s6Var.y, canvas, getImageReceiver(), q6Var);
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.H.E.a(motionEvent, this);
    }
}
