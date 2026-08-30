package org.telegram.ui.Components;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.Property;
import android.view.MotionEvent;
import android.view.ViewGroup;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class vw extends m2.h {
    public final /* synthetic */ kz t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vw(kz kzVar, Context context) {
        super(context);
        this.t0 = kzVar;
    }

    @Override // m2.h, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.t0.f) {
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

    @Override // m2.h
    public final void x(int i10, boolean z4) {
        kz kzVar = this.t0;
        fw fwVar = kzVar.F;
        kz.a(kzVar, i10 == 1);
        if (i10 != getCurrentItem()) {
            super.x(i10, z4);
            return;
        }
        if (i10 != 0) {
            if (i10 == 1) {
                kzVar.e0.x0(0);
                return;
            } else {
                kzVar.A0.x0(1);
                return;
            }
        }
        kzVar.N0[1] = 0;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(fwVar, (Property<fw, Float>) ViewGroup.TRANSLATION_Y, 0.0f);
        ofFloat.setDuration(150L);
        ofFloat.setInterpolator(nr.h);
        ofFloat.start();
        kzVar.H(1, 0);
        if (fwVar != null) {
            fwVar.j(0, true);
        }
    }
}
