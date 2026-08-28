package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class o2 extends m2.g {
    public final /* synthetic */ t2 s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o2(t2 t2Var, Context context) {
        super(context);
        this.s0 = t2Var;
    }

    @Override // m2.g, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        t2 t2Var = this.s0;
        if (actionMasked == 0) {
            t2Var.x.b0.requestDisallowInterceptTouchEvent(true);
        } else if (motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 3) {
            t2Var.x.b0.requestDisallowInterceptTouchEvent(false);
        }
        t2Var.x.k();
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // m2.g, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        t2 t2Var = this.s0;
        if (actionMasked == 0) {
            t2Var.x.b0.requestDisallowInterceptTouchEvent(true);
        }
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        if (motionEvent.getActionMasked() != 1 && motionEvent.getActionMasked() != 3) {
            return onTouchEvent;
        }
        t2Var.x.b0.requestDisallowInterceptTouchEvent(false);
        return onTouchEvent;
    }
}
