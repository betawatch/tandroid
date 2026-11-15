package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.view.GestureDetector;
import android.view.MotionEvent;
import org.telegram.messenger.cp;
import org.telegram.messenger.dp;
import org.telegram.messenger.gj;
import org.telegram.messenger.m10;
import org.telegram.messenger.np;
import org.telegram.ui.Components.er;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class y9 extends q1 {
    public final org.telegram.ui.Components.x4 Ad;
    public final org.telegram.ui.Components.x4 Bd;
    public final /* synthetic */ int Cd;
    public final /* synthetic */ z9 Dd;
    public final GestureDetector zd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y9(z9 z9Var, Context context, int i7, org.telegram.ui.ActionBar.e6 e6Var, Context context2, int i10) {
        super(context, i7, false, null, e6Var);
        this.Dd = z9Var;
        this.Cd = i10;
        this.zd = new GestureDetector(context2, new x9(0, this));
        er erVar = er.g;
        this.Ad = new org.telegram.ui.Components.x4(this, 180L, erVar, 0);
        this.Bd = new org.telegram.ui.Components.x4(this, 180L, erVar, 0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int w02;
        int w03;
        gj messageObject = getMessageObject();
        org.telegram.ui.Components.x4 x4Var = this.Bd;
        org.telegram.ui.Components.x4 x4Var2 = this.Ad;
        org.telegram.ui.Components.t8 t8Var = this.B7;
        if (messageObject == null || getMessageObject().e1 < 0) {
            x4Var2.a(t8Var.b(), false);
            x4Var.a(t8Var.c(), false);
        } else {
            int i7 = getMessageObject().e1;
            if (i7 >= 14) {
                dp dpVar = np.s1(m10.t0).r4;
                cp d = dpVar != null ? dpVar.d(i7) : null;
                if (d != null) {
                    int f10 = d.f();
                    w02 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.p8[org.telegram.ui.Components.t8.f(f10)], this.Qb);
                    w03 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.q8[org.telegram.ui.Components.t8.f(f10)], this.Qb);
                } else {
                    long j3 = i7;
                    w02 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.p8[org.telegram.ui.Components.t8.e(j3)], this.Qb);
                    w03 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.q8[org.telegram.ui.Components.t8.e(j3)], this.Qb);
                }
            } else {
                long j10 = i7;
                w02 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.p8[org.telegram.ui.Components.t8.e(j10)], this.Qb);
                w03 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.q8[org.telegram.ui.Components.t8.e(j10)], this.Qb);
            }
            t8Var.i(x4Var2.a(w02, false), x4Var.a(w03, false));
        }
        if (getAvatarImage() != null && getAvatarImage().O0 != 0.0f) {
            getAvatarImage().y0(getAvatarImage().L0, (getMeasuredHeight() - getAvatarImage().O0) - org.telegram.messenger.g0.L(4.0f), getAvatarImage().N0, getAvatarImage().O0);
            getAvatarImage().J0((int) (getAvatarImage().O0 / 2.0f));
            getAvatarImage().h(canvas, null);
        } else if (this.Cd == 2) {
            invalidate();
        }
        super.dispatchDraw(canvas);
    }

    @Override // org.telegram.ui.Cells.q1, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.Dd.a()) {
            return super.onTouchEvent(motionEvent);
        }
        this.zd.onTouchEvent(motionEvent);
        return true;
    }
}
