package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class k2 extends z4.g {
    public final /* synthetic */ p2 w0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k2(p2 p2Var, Context context) {
        super(context);
        this.w0 = p2Var;
    }

    @Override // z4.g, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        p2 p2Var = this.w0;
        if (actionMasked == 0) {
            p2Var.x.f0.requestDisallowInterceptTouchEvent(true);
        } else if (motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 3) {
            p2Var.x.f0.requestDisallowInterceptTouchEvent(false);
        }
        p2Var.x.k();
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // z4.g, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        p2 p2Var = this.w0;
        if (actionMasked == 0) {
            p2Var.x.f0.requestDisallowInterceptTouchEvent(true);
        }
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        if (motionEvent.getActionMasked() != 1 && motionEvent.getActionMasked() != 3) {
            return onTouchEvent;
        }
        p2Var.x.f0.requestDisallowInterceptTouchEvent(false);
        return onTouchEvent;
    }
}
