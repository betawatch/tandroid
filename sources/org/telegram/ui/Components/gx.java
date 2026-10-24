package org.telegram.ui.Components;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.Property;
import android.view.MotionEvent;
import android.view.ViewGroup;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class gx extends z4.h {
    public final /* synthetic */ tz w0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gx(tz tzVar, Context context) {
        super(context);
        this.w0 = tzVar;
    }

    @Override // z4.h, android.view.ViewGroup
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

    @Override // z4.h
    public final void x(int i10, boolean z10) {
        tz tzVar = this.w0;
        vx vxVar = tzVar.I;
        tz.a(tzVar, i10 == 1);
        if (i10 != getCurrentItem()) {
            super.x(i10, z10);
            return;
        }
        if (i10 != 0) {
            if (i10 == 1) {
                tzVar.h0.x0(0);
                return;
            } else {
                tzVar.D0.x0(1);
                return;
            }
        }
        tzVar.Q0[1] = 0;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(vxVar, (Property<vx, Float>) ViewGroup.TRANSLATION_Y, 0.0f);
        ofFloat.setDuration(150L);
        ofFloat.setInterpolator(bs.h);
        ofFloat.start();
        tzVar.F(1, 0);
        if (vxVar != null) {
            vxVar.j(0, true);
        }
    }
}
