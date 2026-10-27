package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class k2 extends a5.m {
    public final /* synthetic */ p2 w0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k2(p2 p2Var, Context context) {
        super(context);
        this.w0 = p2Var;
    }

    @Override // a5.m, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        p2 p2Var = this.w0;
        if (actionMasked == 0) {
            p2Var.y.f0.requestDisallowInterceptTouchEvent(true);
        } else if (motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 3) {
            p2Var.y.f0.requestDisallowInterceptTouchEvent(false);
        }
        p2Var.y.k();
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // a5.m, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        p2 p2Var = this.w0;
        if (actionMasked == 0) {
            p2Var.y.f0.requestDisallowInterceptTouchEvent(true);
        }
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        if (motionEvent.getActionMasked() != 1 && motionEvent.getActionMasked() != 3) {
            return onTouchEvent;
        }
        p2Var.y.f0.requestDisallowInterceptTouchEvent(false);
        return onTouchEvent;
    }
}
