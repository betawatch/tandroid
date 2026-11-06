package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class j2 extends c5.k {
    public final /* synthetic */ o2 w0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j2(o2 o2Var, Context context) {
        super(context);
        this.w0 = o2Var;
    }

    @Override // c5.k, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        o2 o2Var = this.w0;
        if (actionMasked == 0) {
            o2Var.D.f0.requestDisallowInterceptTouchEvent(true);
        } else if (motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 3) {
            o2Var.D.f0.requestDisallowInterceptTouchEvent(false);
        }
        o2Var.D.i();
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // c5.k, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        o2 o2Var = this.w0;
        if (actionMasked == 0) {
            o2Var.D.f0.requestDisallowInterceptTouchEvent(true);
        }
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        if (motionEvent.getActionMasked() != 1 && motionEvent.getActionMasked() != 3) {
            return onTouchEvent;
        }
        o2Var.D.f0.requestDisallowInterceptTouchEvent(false);
        return onTouchEvent;
    }
}
