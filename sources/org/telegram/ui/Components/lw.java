package org.telegram.ui.Components;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.Property;
import android.view.MotionEvent;
import android.view.ViewGroup;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class lw extends m2.g {
    public final /* synthetic */ wy s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lw(wy wyVar, Context context) {
        super(context);
        this.s0 = wyVar;
    }

    @Override // m2.g, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.s0.f) {
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

    @Override // m2.g
    public final void x(int i9, boolean z10) {
        wy wyVar = this.s0;
        vv vvVar = wyVar.E;
        wy.b(wyVar, i9 == 1);
        if (i9 != getCurrentItem()) {
            super.x(i9, z10);
            return;
        }
        if (i9 != 0) {
            if (i9 == 1) {
                wyVar.d0.x0(0);
                return;
            } else {
                wyVar.z0.x0(1);
                return;
            }
        }
        wyVar.M0[1] = 0;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(vvVar, (Property<vv, Float>) ViewGroup.TRANSLATION_Y, 0.0f);
        ofFloat.setDuration(150L);
        ofFloat.setInterpolator(gr.h);
        ofFloat.start();
        wyVar.H(1, 0);
        if (vvVar != null) {
            vvVar.j(0, true);
        }
    }
}
