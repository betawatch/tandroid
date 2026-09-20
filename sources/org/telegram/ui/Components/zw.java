package org.telegram.ui.Components;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.Property;
import android.view.MotionEvent;
import android.view.ViewGroup;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
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
        ox oxVar = kzVar.I;
        kz.a(kzVar, i10 == 1);
        if (i10 != getCurrentItem()) {
            super.x(i10, z10);
            return;
        }
        if (i10 != 0) {
            if (i10 == 1) {
                kzVar.h0.y0(0);
                return;
            } else {
                kzVar.D0.y0(1);
                return;
            }
        }
        kzVar.Q0[1] = 0;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(oxVar, (Property<ox, Float>) ViewGroup.TRANSLATION_Y, 0.0f);
        ofFloat.setDuration(150L);
        ofFloat.setInterpolator(qr.h);
        ofFloat.start();
        kzVar.G(1, 0);
        if (oxVar != null) {
            oxVar.j(0, true);
        }
    }
}
