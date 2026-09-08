package org.telegram.ui.Components;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.Property;
import android.view.MotionEvent;
import android.view.ViewGroup;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class zw extends z4.g {
    public final /* synthetic */ kz w0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zw(kz kzVar, Context context) {
        super(context);
        this.w0 = kzVar;
    }

    @Override // z4.g, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.w0.f) {
            return false;
        }
        if (getParent() != null) {
            getParent().requestDisallowInterceptTouchEvent(canScrollHorizontally(-1));
        }
        try {
            return super.onInterceptTouchEvent(motionEvent);
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    @Override // z4.g
    public final void x(int i10, boolean z10) {
        kz kzVar = this.w0;
        jw jwVar = kzVar.I;
        kz.c(kzVar, i10 == 1);
        if (i10 != getCurrentItem()) {
            super.x(i10, z10);
            return;
        }
        if (i10 != 0) {
            if (i10 == 1) {
                kzVar.h0.x0(0);
                return;
            } else {
                kzVar.D0.x0(1);
                return;
            }
        }
        kzVar.Q0[1] = 0;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(jwVar, (Property<jw, Float>) ViewGroup.TRANSLATION_Y, 0.0f);
        ofFloat.setDuration(150L);
        ofFloat.setInterpolator(pr.h);
        ofFloat.start();
        kzVar.I(1, 0);
        if (jwVar != null) {
            jwVar.j(0, true);
        }
    }
}
