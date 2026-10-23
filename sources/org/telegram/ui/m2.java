package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final class m2 extends z4.h {
    public final /* synthetic */ r2 w0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m2(r2 r2Var, Context context) {
        super(context);
        this.w0 = r2Var;
    }

    @Override // z4.h, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        r2 r2Var = this.w0;
        if (actionMasked == 0) {
            r2Var.y.f0.requestDisallowInterceptTouchEvent(true);
        } else if (motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 3) {
            r2Var.y.f0.requestDisallowInterceptTouchEvent(false);
        }
        r2Var.y.k();
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // z4.h, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        r2 r2Var = this.w0;
        if (actionMasked == 0) {
            r2Var.y.f0.requestDisallowInterceptTouchEvent(true);
        }
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        if (motionEvent.getActionMasked() != 1 && motionEvent.getActionMasked() != 3) {
            return onTouchEvent;
        }
        r2Var.y.f0.requestDisallowInterceptTouchEvent(false);
        return onTouchEvent;
    }
}
