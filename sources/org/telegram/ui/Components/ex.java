package org.telegram.ui.Components;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.Property;
import android.view.MotionEvent;
import android.view.ViewGroup;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class ex extends z4.g {
    public final /* synthetic */ rz w0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ex(rz rzVar, Context context) {
        super(context);
        this.w0 = rzVar;
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
        rz rzVar = this.w0;
        ow owVar = rzVar.I;
        rz.a(rzVar, i10 == 1);
        if (i10 != getCurrentItem()) {
            super.x(i10, z10);
            return;
        }
        if (i10 != 0) {
            if (i10 == 1) {
                rzVar.h0.x0(0);
                return;
            } else {
                rzVar.D0.x0(1);
                return;
            }
        }
        rzVar.Q0[1] = 0;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(owVar, (Property<ow, Float>) ViewGroup.TRANSLATION_Y, 0.0f);
        ofFloat.setDuration(150L);
        ofFloat.setInterpolator(wr.h);
        ofFloat.start();
        rzVar.I(1, 0);
        if (owVar != null) {
            owVar.j(0, true);
        }
    }
}
