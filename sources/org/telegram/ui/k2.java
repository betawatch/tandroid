package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
