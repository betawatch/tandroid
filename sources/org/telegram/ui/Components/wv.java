package org.telegram.ui.Components;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.Property;
import android.view.MotionEvent;
import android.view.ViewGroup;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class wv extends c5.k {
    public final /* synthetic */ hy w0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wv(hy hyVar, Context context) {
        super(context);
        this.w0 = hyVar;
    }

    @Override // c5.k, android.view.ViewGroup
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

    @Override // c5.k
    public final void x(int i7, boolean z9) {
        hy hyVar = this.w0;
        lw lwVar = hyVar.I;
        hy.a(hyVar, i7 == 1);
        if (i7 != getCurrentItem()) {
            super.x(i7, z9);
            return;
        }
        if (i7 != 0) {
            if (i7 == 1) {
                hyVar.h0.y0(0);
                return;
            } else {
                hyVar.D0.y0(1);
                return;
            }
        }
        hyVar.Q0[1] = 0;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(lwVar, (Property<lw, Float>) ViewGroup.TRANSLATION_Y, 0.0f);
        ofFloat.setDuration(150L);
        ofFloat.setInterpolator(xq.h);
        ofFloat.start();
        hyVar.G(1, 0);
        if (lwVar != null) {
            lwVar.j(0, true);
        }
    }
}
