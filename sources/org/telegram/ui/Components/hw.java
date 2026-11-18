package org.telegram.ui.Components;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.Property;
import android.view.MotionEvent;
import android.view.ViewGroup;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class hw extends c5.l {
    public final /* synthetic */ ry x0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hw(ry ryVar, Context context) {
        super(context);
        this.x0 = ryVar;
    }

    @Override // c5.l, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.x0.f) {
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

    @Override // c5.l
    public final void x(int i7, boolean z10) {
        ry ryVar = this.x0;
        ww wwVar = ryVar.J;
        ry.a(ryVar, i7 == 1);
        if (i7 != getCurrentItem()) {
            super.x(i7, z10);
            return;
        }
        if (i7 != 0) {
            if (i7 == 1) {
                ryVar.i0.y0(0);
                return;
            } else {
                ryVar.E0.y0(1);
                return;
            }
        }
        ryVar.R0[1] = 0;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(wwVar, (Property<ww, Float>) ViewGroup.TRANSLATION_Y, 0.0f);
        ofFloat.setDuration(150L);
        ofFloat.setInterpolator(lr.h);
        ofFloat.start();
        ryVar.G(1, 0);
        if (wwVar != null) {
            wwVar.j(0, true);
        }
    }
}
