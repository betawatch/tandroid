package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import org.telegram.ui.Components.wb0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class k6 extends org.telegram.ui.Components.t9 {
    public final /* synthetic */ int C;
    public final /* synthetic */ l6 D;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k6(l6 l6Var, Context context, int i10) {
        super(context);
        this.D = l6Var;
        this.C = i10;
    }

    @Override // org.telegram.ui.Components.t9, android.view.View
    public final void onDraw(Canvas canvas) {
        l6 l6Var = this.D;
        j6 j6Var = l6Var.y;
        wb0 wb0Var = l6.C;
        if (this.C != 1) {
            super.onDraw(canvas);
        } else {
            j6Var.F.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
            lh.l7.h(l6Var.x, canvas, getImageReceiver(), j6Var);
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.D.y.a(motionEvent, this);
    }
}
