package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import org.telegram.ui.Components.cc0;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class l6 extends org.telegram.ui.Components.p9 {
    public final /* synthetic */ int D;
    public final /* synthetic */ m6 E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l6(m6 m6Var, Context context, int i10) {
        super(context);
        this.E = m6Var;
        this.D = i10;
    }

    @Override // org.telegram.ui.Components.p9, android.view.View
    public final void onDraw(Canvas canvas) {
        m6 m6Var = this.E;
        k6 k6Var = m6Var.y;
        cc0 cc0Var = m6.D;
        if (this.D != 1) {
            super.onDraw(canvas);
        } else {
            k6Var.F.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
            nh.m7.h(m6Var.x, canvas, getImageReceiver(), k6Var);
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.E.y.a(motionEvent, this);
    }
}
