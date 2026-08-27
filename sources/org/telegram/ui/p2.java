package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class p2 extends m2.g {
    public final /* synthetic */ u2 s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p2(u2 u2Var, Context context) {
        super(context);
        this.s0 = u2Var;
    }

    @Override // m2.g, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        u2 u2Var = this.s0;
        if (actionMasked == 0) {
            u2Var.x.b0.requestDisallowInterceptTouchEvent(true);
        } else if (motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 3) {
            u2Var.x.b0.requestDisallowInterceptTouchEvent(false);
        }
        u2Var.x.k();
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // m2.g, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        u2 u2Var = this.s0;
        if (actionMasked == 0) {
            u2Var.x.b0.requestDisallowInterceptTouchEvent(true);
        }
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        if (motionEvent.getActionMasked() != 1 && motionEvent.getActionMasked() != 3) {
            return onTouchEvent;
        }
        u2Var.x.b0.requestDisallowInterceptTouchEvent(false);
        return onTouchEvent;
    }
}
