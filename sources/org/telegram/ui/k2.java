package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class k2 extends b5.l {
    public final /* synthetic */ p2 x0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k2(p2 p2Var, Context context) {
        super(context);
        this.x0 = p2Var;
    }

    @Override // b5.l, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        p2 p2Var = this.x0;
        if (actionMasked == 0) {
            p2Var.E.g0.requestDisallowInterceptTouchEvent(true);
        } else if (motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 3) {
            p2Var.E.g0.requestDisallowInterceptTouchEvent(false);
        }
        p2Var.E.i();
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // b5.l, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        p2 p2Var = this.x0;
        if (actionMasked == 0) {
            p2Var.E.g0.requestDisallowInterceptTouchEvent(true);
        }
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        if (motionEvent.getActionMasked() != 1 && motionEvent.getActionMasked() != 3) {
            return onTouchEvent;
        }
        p2Var.E.g0.requestDisallowInterceptTouchEvent(false);
        return onTouchEvent;
    }
}
