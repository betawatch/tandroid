package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import org.telegram.ui.Components.ja0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class k6 extends org.telegram.ui.Components.k9 {
    public final /* synthetic */ int H;
    public final /* synthetic */ l6 I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k6(l6 l6Var, Context context, int i3) {
        super(context);
        this.I = l6Var;
        this.H = i3;
    }

    @Override // org.telegram.ui.Components.k9, android.view.View
    public final void onDraw(Canvas canvas) {
        l6 l6Var = this.I;
        j6 j6Var = l6Var.F;
        ja0 ja0Var = l6.I;
        if (this.H != 1) {
            super.onDraw(canvas);
        } else {
            j6Var.F.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
            ei.s7.h(l6Var.E, canvas, getImageReceiver(), j6Var);
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.I.F.a(this, motionEvent);
    }
}
