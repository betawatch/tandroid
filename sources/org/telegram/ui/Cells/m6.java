package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import org.telegram.ui.Components.bc0;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class m6 extends org.telegram.ui.Components.p9 {
    public final /* synthetic */ int D;
    public final /* synthetic */ n6 E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m6(n6 n6Var, Context context, int i10) {
        super(context);
        this.E = n6Var;
        this.D = i10;
    }

    @Override // org.telegram.ui.Components.p9, android.view.View
    public final void onDraw(Canvas canvas) {
        n6 n6Var = this.E;
        l6 l6Var = n6Var.y;
        bc0 bc0Var = n6.D;
        if (this.D != 1) {
            super.onDraw(canvas);
        } else {
            l6Var.F.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
            nh.m7.h(n6Var.x, canvas, getImageReceiver(), l6Var);
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.E.y.a(motionEvent, this);
    }
}
