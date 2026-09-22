package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import org.telegram.ui.Components.mc0;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class o6 extends org.telegram.ui.Components.v9 {
    public final /* synthetic */ int G;
    public final /* synthetic */ p6 H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o6(p6 p6Var, Context context, int i10) {
        super(context);
        this.H = p6Var;
        this.G = i10;
    }

    @Override // org.telegram.ui.Components.v9, android.view.View
    public final void onDraw(Canvas canvas) {
        p6 p6Var = this.H;
        n6 n6Var = p6Var.y;
        mc0 mc0Var = p6.G;
        if (this.G != 1) {
            super.onDraw(canvas);
        } else {
            n6Var.F.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
            ai.ia.h(p6Var.x, canvas, getImageReceiver(), n6Var);
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.H.y.a(motionEvent, this);
    }
}
