package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import org.telegram.ui.Components.xa0;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class l6 extends org.telegram.ui.Components.p9 {
    public final /* synthetic */ int H;
    public final /* synthetic */ m6 I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l6(m6 m6Var, Context context, int i7) {
        super(context);
        this.I = m6Var;
        this.H = i7;
    }

    @Override // org.telegram.ui.Components.p9, android.view.View
    public final void onDraw(Canvas canvas) {
        m6 m6Var = this.I;
        k6 k6Var = m6Var.F;
        xa0 xa0Var = m6.I;
        if (this.H != 1) {
            super.onDraw(canvas);
        } else {
            k6Var.F.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
            fi.i7.h(m6Var.E, canvas, getImageReceiver(), k6Var);
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.I.F.a(this, motionEvent);
    }
}
