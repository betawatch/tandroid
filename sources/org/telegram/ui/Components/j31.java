package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.MotionEvent;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class j31 extends f6 {
    public final Paint s;
    public final ji.a w;
    public final /* synthetic */ l31 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j31(l31 l31Var, Context context) {
        super(context, false, false, false);
        this.x = l31Var;
        this.s = new Paint(1);
        this.w = new ji.a();
    }

    @Override // org.telegram.ui.Components.f6, android.view.View
    public final void onDraw(Canvas canvas) {
        if (org.telegram.messenger.dd.X) {
            org.telegram.messenger.i0.P.set(getWidth() - d(), (getHeight() - org.telegram.messenger.i0.L(18.0f)) / 2.0f, getWidth(), (org.telegram.messenger.i0.L(18.0f) + getHeight()) / 2.0f);
        } else {
            org.telegram.messenger.i0.P.set(0.0f, (getHeight() - org.telegram.messenger.i0.L(18.0f)) / 2.0f, d(), (org.telegram.messenger.i0.L(18.0f) + getHeight()) / 2.0f);
        }
        n31 n31Var = this.x.n;
        int i10 = org.telegram.ui.ActionBar.t6.Dj;
        String[] strArr = n31.O1;
        int r12 = org.telegram.ui.ActionBar.t6.r1(0.1175f, org.telegram.ui.ActionBar.t6.w0(i10, n31Var.I0));
        Paint paint = this.s;
        paint.setColor(r12);
        canvas.drawRoundRect(org.telegram.messenger.i0.P, org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), paint);
        if (this.w.h(canvas)) {
            invalidate();
        }
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        n31 n31Var = this.x.n;
        int action = motionEvent.getAction();
        ji.a aVar = this.w;
        if (action != 0) {
            if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                if (motionEvent.getAction() == 1) {
                    performClick();
                }
                aVar.f(true);
                invalidate();
            }
            return super.onTouchEvent(motionEvent);
        }
        String[] strArr = n31.O1;
        q80 q80Var = new q80(null, n31Var.I0, motionEvent.getX(), motionEvent.getY(), 0);
        q80Var.d(org.telegram.ui.ActionBar.t6.r1(0.1175f, org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Dj, n31Var.I0)));
        k80 b10 = q80Var.b();
        if (org.telegram.messenger.dd.X) {
            org.telegram.messenger.i0.P.set(getWidth() - d(), (getHeight() - org.telegram.messenger.i0.L(18.0f)) / 2.0f, getWidth(), (org.telegram.messenger.i0.L(18.0f) + getHeight()) / 2.0f);
        } else {
            org.telegram.messenger.i0.P.set(0.0f, (getHeight() - org.telegram.messenger.i0.L(18.0f)) / 2.0f, d(), (org.telegram.messenger.i0.L(18.0f) + getHeight()) / 2.0f);
        }
        b10.addRect(org.telegram.messenger.i0.P, Path.Direction.CW);
        aVar.b(q80Var, null);
        invalidate();
        return true;
    }
}
