package org.telegram.ui.Components;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.Property;
import android.view.MotionEvent;
import android.view.ViewGroup;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class iw extends z4.g {
    public final /* synthetic */ vy w0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iw(vy vyVar, Context context) {
        super(context);
        this.w0 = vyVar;
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
        vy vyVar = this.w0;
        zw zwVar = vyVar.I;
        vy.a(vyVar, i10 == 1);
        if (i10 != getCurrentItem()) {
            super.x(i10, z10);
            return;
        }
        if (i10 != 0) {
            if (i10 == 1) {
                vyVar.h0.y0(0);
                return;
            } else {
                vyVar.D0.y0(1);
                return;
            }
        }
        vyVar.Q0[1] = 0;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(zwVar, (Property<zw, Float>) ViewGroup.TRANSLATION_Y, 0.0f);
        ofFloat.setDuration(150L);
        ofFloat.setInterpolator(gr.h);
        ofFloat.start();
        vyVar.H(1, 0);
        if (zwVar != null) {
            zwVar.j(0, true);
        }
    }
}
