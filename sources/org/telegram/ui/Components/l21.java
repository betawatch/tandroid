package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.MotionEvent;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class l21 extends h6 {
    public final Paint s;
    public final n2.o0 w;
    public final /* synthetic */ n21 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l21(n21 n21Var, Context context) {
        super(context, false, false, false);
        this.x = n21Var;
        this.s = new Paint(1);
        this.w = new n2.o0();
    }

    @Override // org.telegram.ui.Components.h6, android.view.View
    public final void onDraw(Canvas canvas) {
        if (org.telegram.messenger.hd.a0) {
            org.telegram.messenger.g0.P.set(getWidth() - d(), (getHeight() - org.telegram.messenger.g0.L(18.0f)) / 2.0f, getWidth(), (org.telegram.messenger.g0.L(18.0f) + getHeight()) / 2.0f);
        } else {
            org.telegram.messenger.g0.P.set(0.0f, (getHeight() - org.telegram.messenger.g0.L(18.0f)) / 2.0f, d(), (org.telegram.messenger.g0.L(18.0f) + getHeight()) / 2.0f);
        }
        p21 p21Var = this.x.n;
        int i7 = org.telegram.ui.ActionBar.j6.Gj;
        String[] strArr = p21.S1;
        int r12 = org.telegram.ui.ActionBar.j6.r1(0.1175f, org.telegram.ui.ActionBar.j6.w0(i7, p21Var.J0));
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
        p21 p21Var = this.x.n;
        int action = motionEvent.getAction();
        n2.o0 o0Var = this.w;
        if (action != 0) {
            if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                if (motionEvent.getAction() == 1) {
                    performClick();
                }
                o0Var.f(true);
                invalidate();
            }
            return super.onTouchEvent(motionEvent);
        }
        String[] strArr = p21.S1;
        a80 a80Var = new a80(null, p21Var.J0, motionEvent.getX(), motionEvent.getY(), 0);
        a80Var.d(org.telegram.ui.ActionBar.j6.r1(0.1175f, org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.Gj, p21Var.J0)));
        u70 b10 = a80Var.b();
        if (org.telegram.messenger.hd.a0) {
            org.telegram.messenger.g0.P.set(getWidth() - d(), (getHeight() - org.telegram.messenger.g0.L(18.0f)) / 2.0f, getWidth(), (org.telegram.messenger.g0.L(18.0f) + getHeight()) / 2.0f);
        } else {
            org.telegram.messenger.g0.P.set(0.0f, (getHeight() - org.telegram.messenger.g0.L(18.0f)) / 2.0f, d(), (org.telegram.messenger.g0.L(18.0f) + getHeight()) / 2.0f);
        }
        b10.addRect(org.telegram.messenger.g0.P, Path.Direction.CW);
        o0Var.b(a80Var, null);
        invalidate();
        return true;
    }
}
