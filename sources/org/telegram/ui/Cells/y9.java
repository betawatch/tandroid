package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.view.GestureDetector;
import android.view.MotionEvent;
import org.telegram.messenger.fp;
import org.telegram.messenger.gp;
import org.telegram.messenger.ij;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.ui.Components.xq;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class y9 extends q1 {
    public final GestureDetector kd;
    public final org.telegram.ui.Components.z4 ld;
    public final org.telegram.ui.Components.z4 md;
    public final /* synthetic */ int nd;
    public final /* synthetic */ z9 od;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y9(z9 z9Var, Context context, int i7, org.telegram.ui.ActionBar.f6 f6Var, Context context2, int i10) {
        super(context, i7, false, null, f6Var);
        this.od = z9Var;
        this.nd = i10;
        this.kd = new GestureDetector(context2, new x9(0, this));
        xq xqVar = xq.g;
        this.ld = new org.telegram.ui.Components.z4(this, 180L, xqVar, 0);
        this.md = new org.telegram.ui.Components.z4(this, 180L, xqVar, 0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int w02;
        int w03;
        ij messageObject = getMessageObject();
        org.telegram.ui.Components.z4 z4Var = this.md;
        org.telegram.ui.Components.z4 z4Var2 = this.ld;
        org.telegram.ui.Components.w8 w8Var = this.A7;
        if (messageObject == null || getMessageObject().c1 < 0) {
            z4Var2.a(w8Var.b(), false);
            z4Var.a(w8Var.c(), false);
        } else {
            int i7 = getMessageObject().c1;
            if (i7 >= 14) {
                gp gpVar = qp.s1(p10.s0).q4;
                fp d = gpVar != null ? gpVar.d(i7) : null;
                if (d != null) {
                    int f10 = d.f();
                    w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.p8[org.telegram.ui.Components.w8.f(f10)], this.Pb);
                    w03 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.q8[org.telegram.ui.Components.w8.f(f10)], this.Pb);
                } else {
                    long j3 = i7;
                    w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.p8[org.telegram.ui.Components.w8.e(j3)], this.Pb);
                    w03 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.q8[org.telegram.ui.Components.w8.e(j3)], this.Pb);
                }
            } else {
                long j10 = i7;
                w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.p8[org.telegram.ui.Components.w8.e(j10)], this.Pb);
                w03 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.q8[org.telegram.ui.Components.w8.e(j10)], this.Pb);
            }
            w8Var.i(z4Var2.a(w02, false), z4Var.a(w03, false));
        }
        if (getAvatarImage() != null && getAvatarImage().N0 != 0.0f) {
            getAvatarImage().y0(getAvatarImage().K0, (getMeasuredHeight() - getAvatarImage().N0) - org.telegram.messenger.g0.L(4.0f), getAvatarImage().M0, getAvatarImage().N0);
            getAvatarImage().J0((int) (getAvatarImage().N0 / 2.0f));
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
