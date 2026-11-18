package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.view.GestureDetector;
import android.view.MotionEvent;
import org.telegram.messenger.bp;
import org.telegram.messenger.cp;
import org.telegram.messenger.fj;
import org.telegram.messenger.j10;
import org.telegram.messenger.mp;
import org.telegram.ui.Components.lr;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class z9 extends q1 {
    public final org.telegram.ui.Components.f5 Ad;
    public final org.telegram.ui.Components.f5 Bd;
    public final /* synthetic */ int Cd;
    public final /* synthetic */ aa Dd;
    public final GestureDetector zd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z9(aa aaVar, Context context, int i7, org.telegram.ui.ActionBar.i6 i6Var, Context context2, int i10) {
        super(context, i7, false, null, i6Var);
        this.Dd = aaVar;
        this.Cd = i10;
        this.zd = new GestureDetector(context2, new y9(0, this));
        lr lrVar = lr.g;
        this.Ad = new org.telegram.ui.Components.f5(this, 180L, lrVar, 0);
        this.Bd = new org.telegram.ui.Components.f5(this, 180L, lrVar, 0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int w02;
        int w03;
        fj messageObject = getMessageObject();
        org.telegram.ui.Components.f5 f5Var = this.Bd;
        org.telegram.ui.Components.f5 f5Var2 = this.Ad;
        org.telegram.ui.Components.b9 b9Var = this.B7;
        if (messageObject == null || getMessageObject().e1 < 0) {
            f5Var2.a(b9Var.b(), false);
            f5Var.a(b9Var.c(), false);
        } else {
            int i7 = getMessageObject().e1;
            if (i7 >= 14) {
                cp cpVar = mp.u1(j10.t0).t4;
                bp d = cpVar != null ? cpVar.d(i7) : null;
                if (d != null) {
                    int f10 = d.f();
                    w02 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.p8[org.telegram.ui.Components.b9.f(f10)], this.Qb);
                    w03 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.q8[org.telegram.ui.Components.b9.f(f10)], this.Qb);
                } else {
                    long j3 = i7;
                    w02 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.p8[org.telegram.ui.Components.b9.e(j3)], this.Qb);
                    w03 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.q8[org.telegram.ui.Components.b9.e(j3)], this.Qb);
                }
            } else {
                long j10 = i7;
                w02 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.p8[org.telegram.ui.Components.b9.e(j10)], this.Qb);
                w03 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.q8[org.telegram.ui.Components.b9.e(j10)], this.Qb);
            }
            b9Var.i(f5Var2.a(w02, false), f5Var.a(w03, false));
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
