package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.view.GestureDetector;
import android.view.MotionEvent;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.wo;
import org.telegram.messenger.xo;
import org.telegram.messenger.zi;
import org.telegram.ui.Components.xq;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class y9 extends q1 {
    public final GestureDetector kd;
    public final org.telegram.ui.Components.x4 ld;
    public final org.telegram.ui.Components.x4 md;
    public final /* synthetic */ int nd;
    public final /* synthetic */ z9 od;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y9(z9 z9Var, Context context, int i3, org.telegram.ui.ActionBar.e6 e6Var, Context context2, int i10) {
        super(context, i3, false, null, e6Var);
        this.od = z9Var;
        this.nd = i10;
        this.kd = new GestureDetector(context2, new x9(0, this));
        xq xqVar = xq.g;
        this.ld = new org.telegram.ui.Components.x4(this, 180L, xqVar, 0);
        this.md = new org.telegram.ui.Components.x4(this, 180L, xqVar, 0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int w02;
        int w03;
        zi messageObject = getMessageObject();
        org.telegram.ui.Components.x4 x4Var = this.md;
        org.telegram.ui.Components.x4 x4Var2 = this.ld;
        org.telegram.ui.Components.u8 u8Var = this.A7;
        if (messageObject == null || getMessageObject().c1 < 0) {
            x4Var2.a(u8Var.b(), false);
            x4Var.a(u8Var.c(), false);
        } else {
            int i3 = getMessageObject().c1;
            if (i3 >= 14) {
                xo xoVar = hp.s1(h10.t0).q4;
                wo d = xoVar != null ? xoVar.d(i3) : null;
                if (d != null) {
                    int f10 = d.f();
                    w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.p8[org.telegram.ui.Components.u8.f(f10)], this.Pb);
                    w03 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.q8[org.telegram.ui.Components.u8.f(f10)], this.Pb);
                } else {
                    long j10 = i3;
                    w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.p8[org.telegram.ui.Components.u8.e(j10)], this.Pb);
                    w03 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.q8[org.telegram.ui.Components.u8.e(j10)], this.Pb);
                }
            } else {
                long j11 = i3;
                w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.p8[org.telegram.ui.Components.u8.e(j11)], this.Pb);
                w03 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.q8[org.telegram.ui.Components.u8.e(j11)], this.Pb);
            }
            u8Var.i(x4Var2.a(w02, false), x4Var.a(w03, false));
        }
        if (getAvatarImage() != null && getAvatarImage().O0 != 0.0f) {
            getAvatarImage().y0(getAvatarImage().L0, (getMeasuredHeight() - getAvatarImage().O0) - org.telegram.messenger.g0.L(4.0f), getAvatarImage().N0, getAvatarImage().O0);
            getAvatarImage().J0((int) (getAvatarImage().O0 / 2.0f));
            getAvatarImage().h(canvas, null);
        } else if (this.nd == 2) {
            invalidate();
        }
        super.dispatchDraw(canvas);
    }

    @Override // org.telegram.ui.Cells.q1, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.od.a()) {
            return super.onTouchEvent(motionEvent);
        }
        this.kd.onTouchEvent(motionEvent);
        return true;
    }
}
