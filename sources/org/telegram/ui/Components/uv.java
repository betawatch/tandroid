package org.telegram.ui.Components;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.Property;
import android.view.MotionEvent;
import android.view.ViewGroup;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class uv extends b5.l {
    public final /* synthetic */ ey x0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uv(ey eyVar, Context context) {
        super(context);
        this.x0 = eyVar;
    }

    @Override // b5.l, android.view.ViewGroup
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

    @Override // b5.l
    public final void x(int i3, boolean z10) {
        ey eyVar = this.x0;
        jw jwVar = eyVar.J;
        ey.a(eyVar, i3 == 1);
        if (i3 != getCurrentItem()) {
            super.x(i3, z10);
            return;
        }
        if (i3 != 0) {
            if (i3 == 1) {
                eyVar.i0.y0(0);
                return;
            } else {
                eyVar.E0.y0(1);
                return;
            }
        }
        eyVar.R0[1] = 0;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(jwVar, (Property<jw, Float>) ViewGroup.TRANSLATION_Y, 0.0f);
        ofFloat.setDuration(150L);
        ofFloat.setInterpolator(xq.h);
        ofFloat.start();
        eyVar.G(1, 0);
        if (jwVar != null) {
            jwVar.j(0, true);
        }
    }
}
