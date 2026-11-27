package org.telegram.ui;

import android.app.Activity;
import android.view.MotionEvent;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class k extends fic {
    public final /* synthetic */ qv x0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(qv qvVar, Activity activity) {
        super(activity);
        this.x0 = qvVar;
    }

    @Override // fic, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        o oVar = this.x0.E;
        if (motionEvent.getActionMasked() == 0) {
            oVar.g0.requestDisallowInterceptTouchEvent(true);
        } else if (motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 3) {
            oVar.g0.requestDisallowInterceptTouchEvent(false);
        }
        oVar.h();
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // fic, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        o oVar = this.x0.E;
        if (motionEvent.getActionMasked() == 0) {
            oVar.g0.requestDisallowInterceptTouchEvent(true);
        }
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        if (motionEvent.getActionMasked() != 1 && motionEvent.getActionMasked() != 3) {
            return onTouchEvent;
        }
        oVar.g0.requestDisallowInterceptTouchEvent(false);
        return onTouchEvent;
    }
}
