package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import org.telegram.ui.Components.lb0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class j6 extends org.telegram.ui.Components.n9 {
    public final /* synthetic */ int C;
    public final /* synthetic */ k6 D;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j6(k6 k6Var, Context context, int i10) {
        super(context);
        this.D = k6Var;
        this.C = i10;
    }

    @Override // org.telegram.ui.Components.n9, android.view.View
    public final void onDraw(Canvas canvas) {
        k6 k6Var = this.D;
        i6 i6Var = k6Var.y;
        lb0 lb0Var = k6.C;
        if (this.C != 1) {
            super.onDraw(canvas);
        } else {
            i6Var.F.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
            jh.l7.h(k6Var.x, canvas, getImageReceiver(), i6Var);
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.D.y.a(motionEvent, this);
    }
}
