package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import org.telegram.ui.Components.pa0;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class k6 extends org.telegram.ui.Components.i9 {
    public final /* synthetic */ int H;
    public final /* synthetic */ l6 I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k6(l6 l6Var, Context context, int i7) {
        super(context);
        this.I = l6Var;
        this.H = i7;
    }

    @Override // org.telegram.ui.Components.i9, android.view.View
    public final void onDraw(Canvas canvas) {
        l6 l6Var = this.I;
        j6 j6Var = l6Var.F;
        pa0 pa0Var = l6.I;
        if (this.H != 1) {
            super.onDraw(canvas);
        } else {
            j6Var.F.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
            fi.l7.h(l6Var.E, canvas, getImageReceiver(), j6Var);
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.I.F.a(this, motionEvent);
    }
}
