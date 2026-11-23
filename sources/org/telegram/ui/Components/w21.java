package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.MotionEvent;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class w21 extends n6 {
    public final Paint s;
    public final n2.p0 w;
    public final /* synthetic */ y21 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w21(y21 y21Var, Context context) {
        super(context, false, false, false);
        this.x = y21Var;
        this.s = new Paint(1);
        this.w = new n2.p0();
    }

    @Override // org.telegram.ui.Components.n6, android.view.View
    public final void onDraw(Canvas canvas) {
        if (org.telegram.messenger.gd.a0) {
            org.telegram.messenger.g0.P.set(getWidth() - d(), (getHeight() - org.telegram.messenger.g0.L(18.0f)) / 2.0f, getWidth(), (org.telegram.messenger.g0.L(18.0f) + getHeight()) / 2.0f);
        } else {
            org.telegram.messenger.g0.P.set(0.0f, (getHeight() - org.telegram.messenger.g0.L(18.0f)) / 2.0f, d(), (org.telegram.messenger.g0.L(18.0f) + getHeight()) / 2.0f);
        }
        a31 a31Var = this.x.n;
        int i7 = org.telegram.ui.ActionBar.n6.Gj;
        String[] strArr = a31.S1;
        int r12 = org.telegram.ui.ActionBar.n6.r1(0.1175f, org.telegram.ui.ActionBar.n6.w0(i7, a31Var.J0));
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
        a31 a31Var = this.x.n;
        int action = motionEvent.getAction();
        n2.p0 p0Var = this.w;
        if (action != 0) {
            if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                if (motionEvent.getAction() == 1) {
                    performClick();
                }
                p0Var.f(true);
                invalidate();
            }
            return super.onTouchEvent(motionEvent);
        }
        String[] strArr = a31.S1;
        k80 k80Var = new k80(null, a31Var.J0, motionEvent.getX(), motionEvent.getY(), 0);
        k80Var.d(org.telegram.ui.ActionBar.n6.r1(0.1175f, org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Gj, a31Var.J0)));
        e80 b10 = k80Var.b();
        if (org.telegram.messenger.gd.a0) {
            org.telegram.messenger.g0.P.set(getWidth() - d(), (getHeight() - org.telegram.messenger.g0.L(18.0f)) / 2.0f, getWidth(), (org.telegram.messenger.g0.L(18.0f) + getHeight()) / 2.0f);
        } else {
            org.telegram.messenger.g0.P.set(0.0f, (getHeight() - org.telegram.messenger.g0.L(18.0f)) / 2.0f, d(), (org.telegram.messenger.g0.L(18.0f) + getHeight()) / 2.0f);
        }
        b10.addRect(org.telegram.messenger.g0.P, Path.Direction.CW);
        p0Var.b(k80Var, null);
        invalidate();
        return true;
    }
}
