package org.telegram.ui.Components;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.Property;
import android.view.MotionEvent;
import android.view.ViewGroup;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class vv extends c5.k {
    public final /* synthetic */ gy w0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vv(gy gyVar, Context context) {
        super(context);
        this.w0 = gyVar;
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
        gy gyVar = this.w0;
        kw kwVar = gyVar.I;
        gy.a(gyVar, i7 == 1);
        if (i7 != getCurrentItem()) {
            super.x(i7, z9);
            return;
        }
        if (i7 != 0) {
            if (i7 == 1) {
                gyVar.h0.y0(0);
                return;
            } else {
                gyVar.D0.y0(1);
                return;
            }
        }
        gyVar.Q0[1] = 0;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(kwVar, (Property<kw, Float>) ViewGroup.TRANSLATION_Y, 0.0f);
        ofFloat.setDuration(150L);
        ofFloat.setInterpolator(xq.h);
        ofFloat.start();
        gyVar.G(1, 0);
        if (kwVar != null) {
            kwVar.j(0, true);
        }
    }
}
