package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import org.telegram.ui.Components.ab0;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class m6 extends org.telegram.ui.Components.q9 {
    public final /* synthetic */ int H;
    public final /* synthetic */ n6 I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m6(n6 n6Var, Context context, int i7) {
        super(context);
        this.I = n6Var;
        this.H = i7;
    }

    @Override // org.telegram.ui.Components.q9, android.view.View
    public final void onDraw(Canvas canvas) {
        n6 n6Var = this.I;
        l6 l6Var = n6Var.F;
        ab0 ab0Var = n6.I;
        if (this.H != 1) {
            super.onDraw(canvas);
        } else {
            l6Var.F.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
            fi.i7.h(n6Var.E, canvas, getImageReceiver(), l6Var);
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.I.F.a(this, motionEvent);
    }
}
