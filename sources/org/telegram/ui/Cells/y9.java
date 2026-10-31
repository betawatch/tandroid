package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.view.GestureDetector;
import android.view.MotionEvent;
import org.telegram.messenger.d20;
import org.telegram.messenger.jj;
import org.telegram.messenger.kp;
import org.telegram.messenger.lp;
import org.telegram.messenger.vp;
import org.telegram.ui.Components.gr;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class y9 extends q1 {
    public final GestureDetector hd;
    public final org.telegram.ui.Components.w4 id;
    public final org.telegram.ui.Components.w4 jd;
    public final /* synthetic */ int kd;
    public final /* synthetic */ z9 ld;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y9(z9 z9Var, Context context, int i10, org.telegram.ui.ActionBar.p6 p6Var, Context context2, int i11) {
        super(context, i10, false, null, p6Var);
        this.ld = z9Var;
        this.kd = i11;
        this.hd = new GestureDetector(context2, new lg.f(2, this));
        gr grVar = gr.g;
        this.id = new org.telegram.ui.Components.w4(this, 180L, grVar, 0);
        this.jd = new org.telegram.ui.Components.w4(this, 180L, grVar, 0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int w02;
        int w03;
        jj messageObject = getMessageObject();
        org.telegram.ui.Components.w4 w4Var = this.jd;
        org.telegram.ui.Components.w4 w4Var2 = this.id;
        org.telegram.ui.Components.r8 r8Var = this.z7;
        if (messageObject == null || getMessageObject().c1 < 0) {
            w4Var2.a(r8Var.b(), false);
            w4Var.a(r8Var.c(), false);
        } else {
            int i10 = getMessageObject().c1;
            if (i10 >= 14) {
                lp lpVar = vp.r1(d20.s0).r4;
                kp d = lpVar != null ? lpVar.d(i10) : null;
                if (d != null) {
                    int f7 = d.f();
                    w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.p8[org.telegram.ui.Components.r8.f(f7)], this.Ob);
                    w03 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.q8[org.telegram.ui.Components.r8.f(f7)], this.Ob);
                } else {
                    long j10 = i10;
                    w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.p8[org.telegram.ui.Components.r8.e(j10)], this.Ob);
                    w03 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.q8[org.telegram.ui.Components.r8.e(j10)], this.Ob);
                }
            } else {
                long j11 = i10;
                w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.p8[org.telegram.ui.Components.r8.e(j11)], this.Ob);
                w03 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.q8[org.telegram.ui.Components.r8.e(j11)], this.Ob);
            }
            r8Var.i(w4Var2.a(w02, false), w4Var.a(w03, false));
        }
        if (getAvatarImage() != null && getAvatarImage().N0 != 0.0f) {
            getAvatarImage().y0(getAvatarImage().K0, (getMeasuredHeight() - getAvatarImage().N0) - org.telegram.messenger.i0.L(4.0f), getAvatarImage().M0, getAvatarImage().N0);
            getAvatarImage().J0((int) (getAvatarImage().N0 / 2.0f));
            getAvatarImage().h(canvas, null);
        } else if (this.kd == 2) {
            invalidate();
        }
        super.dispatchDraw(canvas);
    }

    @Override // org.telegram.ui.Cells.q1, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.ld.a()) {
            return super.onTouchEvent(motionEvent);
        }
        this.hd.onTouchEvent(motionEvent);
        return true;
    }
}
