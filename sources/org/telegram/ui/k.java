package org.telegram.ui;

import android.app.Activity;
import android.view.MotionEvent;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
