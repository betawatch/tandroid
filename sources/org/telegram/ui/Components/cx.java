package org.telegram.ui.Components;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.Property;
import android.view.MotionEvent;
import android.view.ViewGroup;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final class cx extends z4.g {
    public final /* synthetic */ nz w0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cx(nz nzVar, Context context) {
        super(context);
        this.w0 = nzVar;
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
        nz nzVar = this.w0;
        rx rxVar = nzVar.I;
        nz.a(nzVar, i10 == 1);
        if (i10 != getCurrentItem()) {
            super.x(i10, z10);
            return;
        }
        if (i10 != 0) {
            if (i10 == 1) {
                nzVar.h0.y0(0);
                return;
            } else {
                nzVar.D0.y0(1);
                return;
            }
        }
        nzVar.Q0[1] = 0;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(rxVar, (Property<rx, Float>) ViewGroup.TRANSLATION_Y, 0.0f);
        ofFloat.setDuration(150L);
        ofFloat.setInterpolator(tr.h);
        ofFloat.start();
        nzVar.E(1, 0);
        if (rxVar != null) {
            rxVar.j(0, true);
        }
    }
}
