// default package

import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.Property;
import android.view.MotionEvent;
import android.view.ViewGroup;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class d04 extends fic {
    public final /* synthetic */ o24 x0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d04(o24 o24Var, Context context) {
        super(context);
        this.x0 = o24Var;
    }

    @Override // fic, android.view.ViewGroup
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

    @Override // fic
    public final void x(int i, boolean z) {
        o24 o24Var = this.x0;
        t04 t04Var = o24Var.J;
        o24Var.Q(i == 1);
        if (i != getCurrentItem()) {
            super.x(i, z);
            return;
        }
        if (i != 0) {
            if (i == 1) {
                o24Var.i0.A0(0);
                return;
            } else {
                o24Var.E0.A0(1);
                return;
            }
        }
        o24Var.R0[1] = 0;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(t04Var, (Property<t04, Float>) ViewGroup.TRANSLATION_Y, 0.0f);
        ofFloat.setDuration(150L);
        ofFloat.setInterpolator(k43.h);
        ofFloat.start();
        o24Var.E(1, 0);
        if (t04Var != null) {
            t04Var.j(0, true);
        }
    }
}
