package org.telegram.ui.Components;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.Property;
import android.view.MotionEvent;
import android.view.ViewGroup;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class fx extends a5.m {
    public final /* synthetic */ sz w0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fx(sz szVar, Context context) {
        super(context);
        this.w0 = szVar;
    }

    @Override // a5.m, android.view.ViewGroup
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

    @Override // a5.m
    public final void x(int i10, boolean z10) {
        sz szVar = this.w0;
        ux uxVar = szVar.I;
        sz.a(szVar, i10 == 1);
        if (i10 != getCurrentItem()) {
            super.x(i10, z10);
            return;
        }
        if (i10 != 0) {
            if (i10 == 1) {
                szVar.h0.y0(0);
                return;
            } else {
                szVar.D0.y0(1);
                return;
            }
        }
        szVar.Q0[1] = 0;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(uxVar, (Property<ux, Float>) ViewGroup.TRANSLATION_Y, 0.0f);
        ofFloat.setDuration(150L);
        ofFloat.setInterpolator(ds.h);
        ofFloat.start();
        szVar.G(1, 0);
        if (uxVar != null) {
            uxVar.j(0, true);
        }
    }
}
