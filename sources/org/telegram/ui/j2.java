package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class j2 extends c5.l {
    public final /* synthetic */ o2 x0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j2(o2 o2Var, Context context) {
        super(context);
        this.x0 = o2Var;
    }

    @Override // c5.l, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        o2 o2Var = this.x0;
        if (actionMasked == 0) {
            o2Var.E.g0.requestDisallowInterceptTouchEvent(true);
        } else if (motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 3) {
            o2Var.E.g0.requestDisallowInterceptTouchEvent(false);
        }
        o2Var.E.i();
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // c5.l, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        o2 o2Var = this.x0;
        if (actionMasked == 0) {
            o2Var.E.g0.requestDisallowInterceptTouchEvent(true);
        }
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        if (motionEvent.getActionMasked() != 1 && motionEvent.getActionMasked() != 3) {
            return onTouchEvent;
        }
        o2Var.E.g0.requestDisallowInterceptTouchEvent(false);
        return onTouchEvent;
    }
}
