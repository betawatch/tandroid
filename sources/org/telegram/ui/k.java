package org.telegram.ui;

import android.app.Activity;
import android.view.MotionEvent;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class k extends gec {
    public final /* synthetic */ pv x0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(pv pvVar, Activity activity) {
        super(activity);
        this.x0 = pvVar;
    }

    @Override // gec, android.view.ViewGroup
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

    @Override // gec, android.view.View
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
