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
import org.telegram.ui.Components.wq;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class y9 extends q1 {
    public final GestureDetector ld;
    public final org.telegram.ui.Components.y4 md;
    public final org.telegram.ui.Components.y4 nd;
    public final /* synthetic */ int od;
    public final /* synthetic */ z9 pd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y9(z9 z9Var, Context context, int i7, org.telegram.ui.ActionBar.h6 h6Var, Context context2, int i10) {
        super(context, i7, false, null, h6Var);
        this.pd = z9Var;
        this.od = i10;
        this.ld = new GestureDetector(context2, new x9(0, this));
        wq wqVar = wq.g;
        this.md = new org.telegram.ui.Components.y4(this, 180L, wqVar, 0);
        this.nd = new org.telegram.ui.Components.y4(this, 180L, wqVar, 0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int w02;
        int w03;
        ij messageObject = getMessageObject();
        org.telegram.ui.Components.y4 y4Var = this.nd;
        org.telegram.ui.Components.y4 y4Var2 = this.md;
        org.telegram.ui.Components.v8 v8Var = this.A7;
        if (messageObject == null || getMessageObject().c1 < 0) {
            y4Var2.a(v8Var.b(), false);
            y4Var.a(v8Var.c(), false);
        } else {
            int i7 = getMessageObject().c1;
            if (i7 >= 14) {
                gp gpVar = qp.s1(p10.s0).q4;
                fp d = gpVar != null ? gpVar.d(i7) : null;
                if (d != null) {
                    int f10 = d.f();
                    w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.p8[org.telegram.ui.Components.v8.f(f10)], this.Pb);
                    w03 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.q8[org.telegram.ui.Components.v8.f(f10)], this.Pb);
                } else {
                    long j3 = i7;
                    w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.p8[org.telegram.ui.Components.v8.e(j3)], this.Pb);
                    w03 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.q8[org.telegram.ui.Components.v8.e(j3)], this.Pb);
                }
            } else {
                long j10 = i7;
                w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.p8[org.telegram.ui.Components.v8.e(j10)], this.Pb);
                w03 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.q8[org.telegram.ui.Components.v8.e(j10)], this.Pb);
            }
            v8Var.i(y4Var2.a(w02, false), y4Var.a(w03, false));
        }
        if (getAvatarImage() != null && getAvatarImage().N0 != 0.0f) {
            getAvatarImage().y0(getAvatarImage().K0, (getMeasuredHeight() - getAvatarImage().N0) - org.telegram.messenger.g0.L(4.0f), getAvatarImage().M0, getAvatarImage().N0);
            getAvatarImage().J0((int) (getAvatarImage().N0 / 2.0f));
            getAvatarImage().h(canvas, null);
        } else if (this.od == 2) {
            invalidate();
        }
        super.dispatchDraw(canvas);
    }

    @Override // org.telegram.ui.Cells.q1, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.pd.a()) {
            return super.onTouchEvent(motionEvent);
        }
        this.ld.onTouchEvent(motionEvent);
        return true;
    }
}
