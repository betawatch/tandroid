package org.telegram.ui.Components;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.Property;
import android.view.MotionEvent;
import android.view.ViewGroup;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class xw extends m2.h {
    public final /* synthetic */ mz t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xw(mz mzVar, Context context) {
        super(context);
        this.t0 = mzVar;
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
        mz mzVar = this.t0;
        hw hwVar = mzVar.F;
        mz.a(mzVar, i10 == 1);
        if (i10 != getCurrentItem()) {
            super.x(i10, z4);
            return;
        }
        if (i10 != 0) {
            if (i10 == 1) {
                mzVar.e0.x0(0);
                return;
            } else {
                mzVar.A0.x0(1);
                return;
            }
        }
        mzVar.N0[1] = 0;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(hwVar, (Property<hw, Float>) ViewGroup.TRANSLATION_Y, 0.0f);
        ofFloat.setDuration(150L);
        ofFloat.setInterpolator(pr.h);
        ofFloat.start();
        mzVar.H(1, 0);
        if (hwVar != null) {
            hwVar.j(0, true);
        }
    }
}
