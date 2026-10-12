package org.telegram.ui.Components;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.Property;
import android.view.MotionEvent;
import android.view.ViewGroup;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class kx extends z4.g {
    public final /* synthetic */ wz w0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kx(wz wzVar, Context context) {
        super(context);
        this.w0 = wzVar;
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
        wz wzVar = this.w0;
        zx zxVar = wzVar.I;
        wz.c(wzVar, i10 == 1);
        if (i10 != getCurrentItem()) {
            super.x(i10, z10);
            return;
        }
        if (i10 != 0) {
            if (i10 == 1) {
                wzVar.h0.x0(0);
                return;
            } else {
                wzVar.D0.x0(1);
                return;
            }
        }
        wzVar.Q0[1] = 0;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(zxVar, (Property<zx, Float>) ViewGroup.TRANSLATION_Y, 0.0f);
        ofFloat.setDuration(150L);
        ofFloat.setInterpolator(es.h);
        ofFloat.start();
        wzVar.G(1, 0);
        if (zxVar != null) {
            zxVar.j(0, true);
        }
    }
}
