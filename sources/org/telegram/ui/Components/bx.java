package org.telegram.ui.Components;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.Property;
import android.view.MotionEvent;
import android.view.ViewGroup;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes3.dex */
public final class bx extends z4.g {
    public final /* synthetic */ mz w0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bx(mz mzVar, Context context) {
        super(context);
        this.w0 = mzVar;
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
        mz mzVar = this.w0;
        qx qxVar = mzVar.I;
        mz.a(mzVar, i10 == 1);
        if (i10 != getCurrentItem()) {
            super.x(i10, z10);
            return;
        }
        if (i10 != 0) {
            if (i10 == 1) {
                mzVar.h0.x0(0);
                return;
            } else {
                mzVar.D0.x0(1);
                return;
            }
        }
        mzVar.Q0[1] = 0;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(qxVar, (Property<qx, Float>) ViewGroup.TRANSLATION_Y, 0.0f);
        ofFloat.setDuration(150L);
        ofFloat.setInterpolator(sr.h);
        ofFloat.start();
        mzVar.G(1, 0);
        if (qxVar != null) {
            qxVar.j(0, true);
        }
    }
}
