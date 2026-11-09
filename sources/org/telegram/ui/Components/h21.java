package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.MotionEvent;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class h21 extends j6 {
    public final Paint s;
    public final n2.n0 w;
    public final /* synthetic */ j21 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h21(j21 j21Var, Context context) {
        super(context, false, false, false);
        this.x = j21Var;
        this.s = new Paint(1);
        this.w = new n2.n0();
    }

    @Override // org.telegram.ui.Components.j6, android.view.View
    public final void onDraw(Canvas canvas) {
        if (org.telegram.messenger.id.a0) {
            org.telegram.messenger.g0.P.set(getWidth() - d(), (getHeight() - org.telegram.messenger.g0.L(18.0f)) / 2.0f, getWidth(), (org.telegram.messenger.g0.L(18.0f) + getHeight()) / 2.0f);
        } else {
            org.telegram.messenger.g0.P.set(0.0f, (getHeight() - org.telegram.messenger.g0.L(18.0f)) / 2.0f, d(), (org.telegram.messenger.g0.L(18.0f) + getHeight()) / 2.0f);
        }
        l21 l21Var = this.x.n;
        int i7 = org.telegram.ui.ActionBar.l6.Dj;
        String[] strArr = l21.O1;
        int r12 = org.telegram.ui.ActionBar.l6.r1(0.1175f, org.telegram.ui.ActionBar.l6.w0(i7, l21Var.I0));
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
        l21 l21Var = this.x.n;
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
        String[] strArr = l21.O1;
        y70 y70Var = new y70(null, l21Var.I0, motionEvent.getX(), motionEvent.getY(), 0);
        y70Var.d(org.telegram.ui.ActionBar.l6.r1(0.1175f, org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.Dj, l21Var.I0)));
        s70 b10 = y70Var.b();
        if (org.telegram.messenger.id.a0) {
            org.telegram.messenger.g0.P.set(getWidth() - d(), (getHeight() - org.telegram.messenger.g0.L(18.0f)) / 2.0f, getWidth(), (org.telegram.messenger.g0.L(18.0f) + getHeight()) / 2.0f);
        } else {
            org.telegram.messenger.g0.P.set(0.0f, (getHeight() - org.telegram.messenger.g0.L(18.0f)) / 2.0f, d(), (org.telegram.messenger.g0.L(18.0f) + getHeight()) / 2.0f);
        }
        b10.addRect(org.telegram.messenger.g0.P, Path.Direction.CW);
        n0Var.b(y70Var, null);
        invalidate();
        return true;
    }
}
