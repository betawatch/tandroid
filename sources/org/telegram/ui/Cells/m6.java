package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import org.telegram.ui.Components.hb0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class m6 extends org.telegram.ui.Components.o9 {
    public final /* synthetic */ int C;
    public final /* synthetic */ n6 D;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m6(n6 n6Var, Context context, int i9) {
        super(context);
        this.D = n6Var;
        this.C = i9;
    }

    @Override // org.telegram.ui.Components.o9, android.view.View
    public final void onDraw(Canvas canvas) {
        n6 n6Var = this.D;
        l6 l6Var = n6Var.y;
        hb0 hb0Var = n6.C;
        if (this.C != 1) {
            super.onDraw(canvas);
        } else {
            l6Var.F.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
            ih.p7.h(n6Var.x, canvas, getImageReceiver(), l6Var);
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.D.y.a(motionEvent, this);
    }
}
