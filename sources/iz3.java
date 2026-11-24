// default package

import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.Property;
import android.view.MotionEvent;
import android.view.ViewGroup;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class iz3 extends gec {
    public final /* synthetic */ t14 x0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iz3(t14 t14Var, Context context) {
        super(context);
        this.x0 = t14Var;
    }

    @Override // gec, android.view.ViewGroup
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

    @Override // gec
    public final void x(int i, boolean z) {
        t14 t14Var = this.x0;
        yz3 yz3Var = t14Var.J;
        t14Var.R(i == 1);
        if (i != getCurrentItem()) {
            super.x(i, z);
            return;
        }
        if (i != 0) {
            if (i == 1) {
                t14Var.i0.z0(0);
                return;
            } else {
                t14Var.E0.z0(1);
                return;
            }
        }
        t14Var.R0[1] = 0;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(yz3Var, (Property<yz3, Float>) ViewGroup.TRANSLATION_Y, 0.0f);
        ofFloat.setDuration(150L);
        ofFloat.setInterpolator(s33.h);
        ofFloat.start();
        t14Var.F(1, 0);
        if (yz3Var != null) {
            yz3Var.j(0, true);
        }
    }
}
