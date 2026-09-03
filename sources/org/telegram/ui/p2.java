package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class p2 extends m2.h {
    public final /* synthetic */ u2 t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p2(u2 u2Var, Context context) {
        super(context);
        this.t0 = u2Var;
    }

    @Override // m2.h, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        u2 u2Var = this.t0;
        if (actionMasked == 0) {
            u2Var.x.c0.requestDisallowInterceptTouchEvent(true);
        } else if (motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 3) {
            u2Var.x.c0.requestDisallowInterceptTouchEvent(false);
        }
        u2Var.x.k();
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // m2.h, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        u2 u2Var = this.t0;
        if (actionMasked == 0) {
            u2Var.x.c0.requestDisallowInterceptTouchEvent(true);
        }
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        if (motionEvent.getActionMasked() != 1 && motionEvent.getActionMasked() != 3) {
            return onTouchEvent;
        }
        u2Var.x.c0.requestDisallowInterceptTouchEvent(false);
        return onTouchEvent;
    }
}
