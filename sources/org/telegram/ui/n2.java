package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class n2 extends z4.g {
    public final /* synthetic */ s2 w0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n2(s2 s2Var, Context context) {
        super(context);
        this.w0 = s2Var;
    }

    @Override // z4.g, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        s2 s2Var = this.w0;
        if (actionMasked == 0) {
            s2Var.x.f0.requestDisallowInterceptTouchEvent(true);
        } else if (motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 3) {
            s2Var.x.f0.requestDisallowInterceptTouchEvent(false);
        }
        s2Var.x.k();
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // z4.g, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        s2 s2Var = this.w0;
        if (actionMasked == 0) {
            s2Var.x.f0.requestDisallowInterceptTouchEvent(true);
        }
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        if (motionEvent.getActionMasked() != 1 && motionEvent.getActionMasked() != 3) {
            return onTouchEvent;
        }
        s2Var.x.f0.requestDisallowInterceptTouchEvent(false);
        return onTouchEvent;
    }
}
