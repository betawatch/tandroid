package org.telegram.ui.Components;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.Property;
import android.view.MotionEvent;
import android.view.ViewGroup;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class ox extends z4.g {
    public final /* synthetic */ a00 w0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ox(a00 a00Var, Context context) {
        super(context);
        this.w0 = a00Var;
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
        a00 a00Var = this.w0;
        ey eyVar = a00Var.I;
        a00.a(a00Var, i10 == 1);
        if (i10 != getCurrentItem()) {
            super.x(i10, z10);
            return;
        }
        if (i10 != 0) {
            if (i10 == 1) {
                a00Var.h0.x0(0);
                return;
            } else {
                a00Var.D0.x0(1);
                return;
            }
        }
        a00Var.Q0[1] = 0;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(eyVar, (Property<ey, Float>) ViewGroup.TRANSLATION_Y, 0.0f);
        ofFloat.setDuration(150L);
        ofFloat.setInterpolator(hs.h);
        ofFloat.start();
        a00Var.G(1, 0);
        if (eyVar != null) {
            eyVar.j(0, true);
        }
    }
}
