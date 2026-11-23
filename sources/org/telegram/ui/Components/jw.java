package org.telegram.ui.Components;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.Property;
import android.view.MotionEvent;
import android.view.ViewGroup;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class jw extends c5.l {
    public final /* synthetic */ ty x0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jw(ty tyVar, Context context) {
        super(context);
        this.x0 = tyVar;
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
        ty tyVar = this.x0;
        yw ywVar = tyVar.J;
        ty.a(tyVar, i7 == 1);
        if (i7 != getCurrentItem()) {
            super.x(i7, z10);
            return;
        }
        if (i7 != 0) {
            if (i7 == 1) {
                tyVar.i0.y0(0);
                return;
            } else {
                tyVar.E0.y0(1);
                return;
            }
        }
        tyVar.R0[1] = 0;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(ywVar, (Property<yw, Float>) ViewGroup.TRANSLATION_Y, 0.0f);
        ofFloat.setDuration(150L);
        ofFloat.setInterpolator(nr.h);
        ofFloat.start();
        tyVar.G(1, 0);
        if (ywVar != null) {
            ywVar.j(0, true);
        }
    }
}
