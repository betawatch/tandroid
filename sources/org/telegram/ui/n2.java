package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class n2 extends m2.h {
    public final /* synthetic */ s2 t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n2(s2 s2Var, Context context) {
        super(context);
        this.t0 = s2Var;
    }

    @Override // m2.h, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        s2 s2Var = this.t0;
        if (actionMasked == 0) {
            s2Var.x.c0.requestDisallowInterceptTouchEvent(true);
        } else if (motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 3) {
            s2Var.x.c0.requestDisallowInterceptTouchEvent(false);
        }
        s2Var.x.k();
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // m2.h, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        s2 s2Var = this.t0;
        if (actionMasked == 0) {
            s2Var.x.c0.requestDisallowInterceptTouchEvent(true);
        }
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        if (motionEvent.getActionMasked() != 1 && motionEvent.getActionMasked() != 3) {
            return onTouchEvent;
        }
        s2Var.x.c0.requestDisallowInterceptTouchEvent(false);
        return onTouchEvent;
    }
}
