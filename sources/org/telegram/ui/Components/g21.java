package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.MotionEvent;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class g21 extends j6 {
    public final Paint s;
    public final n2.n0 w;
    public final /* synthetic */ i21 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g21(i21 i21Var, Context context) {
        super(context, false, false, false);
        this.x = i21Var;
        this.s = new Paint(1);
        this.w = new n2.n0();
    }

    @Override // org.telegram.ui.Components.j6, android.view.View
    public final void onDraw(Canvas canvas) {
        if (org.telegram.messenger.hd.a0) {
            org.telegram.messenger.g0.P.set(getWidth() - d(), (getHeight() - org.telegram.messenger.g0.L(18.0f)) / 2.0f, getWidth(), (org.telegram.messenger.g0.L(18.0f) + getHeight()) / 2.0f);
        } else {
            org.telegram.messenger.g0.P.set(0.0f, (getHeight() - org.telegram.messenger.g0.L(18.0f)) / 2.0f, d(), (org.telegram.messenger.g0.L(18.0f) + getHeight()) / 2.0f);
        }
        k21 k21Var = this.x.n;
        int i7 = org.telegram.ui.ActionBar.k6.Dj;
        String[] strArr = k21.O1;
        int r12 = org.telegram.ui.ActionBar.k6.r1(0.1175f, org.telegram.ui.ActionBar.k6.w0(i7, k21Var.I0));
        Paint paint = this.s;
        paint.setColor(r12);
        canvas.drawRoundRect(org.telegram.messenger.g0.P, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), paint);
        if (this.w.h(canvas)) {
            invalidate();
        }
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        k21 k21Var = this.x.n;
        int action = motionEvent.getAction();
        n2.n0 n0Var = this.w;
        if (action != 0) {
            if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                if (motionEvent.getAction() == 1) {
                    performClick();
                }
                n0Var.f(true);
                invalidate();
            }
            return super.onTouchEvent(motionEvent);
        }
        String[] strArr = k21.O1;
        x70 x70Var = new x70(null, k21Var.I0, motionEvent.getX(), motionEvent.getY(), 0);
        x70Var.d(org.telegram.ui.ActionBar.k6.r1(0.1175f, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Dj, k21Var.I0)));
        r70 b10 = x70Var.b();
        if (org.telegram.messenger.hd.a0) {
            org.telegram.messenger.g0.P.set(getWidth() - d(), (getHeight() - org.telegram.messenger.g0.L(18.0f)) / 2.0f, getWidth(), (org.telegram.messenger.g0.L(18.0f) + getHeight()) / 2.0f);
        } else {
            org.telegram.messenger.g0.P.set(0.0f, (getHeight() - org.telegram.messenger.g0.L(18.0f)) / 2.0f, d(), (org.telegram.messenger.g0.L(18.0f) + getHeight()) / 2.0f);
        }
        b10.addRect(org.telegram.messenger.g0.P, Path.Direction.CW);
        n0Var.b(x70Var, null);
        invalidate();
        return true;
    }
}
