package org.telegram.ui.Components;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.Property;
import android.view.MotionEvent;
import android.view.ViewGroup;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class rw extends m2.g {
    public final /* synthetic */ fz s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rw(fz fzVar, Context context) {
        super(context);
        this.s0 = fzVar;
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
    public final void x(int i10, boolean z10) {
        fz fzVar = this.s0;
        bw bwVar = fzVar.E;
        fz.a(fzVar, i10 == 1);
        if (i10 != getCurrentItem()) {
            super.x(i10, z10);
            return;
        }
        if (i10 != 0) {
            if (i10 == 1) {
                fzVar.d0.x0(0);
                return;
            } else {
                fzVar.z0.x0(1);
                return;
            }
        }
        fzVar.M0[1] = 0;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(bwVar, (Property<bw, Float>) ViewGroup.TRANSLATION_Y, 0.0f);
        ofFloat.setDuration(150L);
        ofFloat.setInterpolator(jr.h);
        ofFloat.start();
        fzVar.H(1, 0);
        if (bwVar != null) {
            bwVar.j(0, true);
        }
    }
}
