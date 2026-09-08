package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class l2 extends z4.g {
    public final /* synthetic */ q2 w0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l2(q2 q2Var, Context context) {
        super(context);
        this.w0 = q2Var;
    }

    @Override // z4.g, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        q2 q2Var = this.w0;
        if (actionMasked == 0) {
            q2Var.x.f0.requestDisallowInterceptTouchEvent(true);
        } else if (motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 3) {
            q2Var.x.f0.requestDisallowInterceptTouchEvent(false);
        }
        q2Var.x.k();
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // z4.g, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        q2 q2Var = this.w0;
        if (actionMasked == 0) {
            q2Var.x.f0.requestDisallowInterceptTouchEvent(true);
        }
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        if (motionEvent.getActionMasked() != 1 && motionEvent.getActionMasked() != 3) {
            return onTouchEvent;
        }
        q2Var.x.f0.requestDisallowInterceptTouchEvent(false);
        return onTouchEvent;
    }
}
