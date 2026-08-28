package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class lx implements ValueAnimator.AnimatorUpdateListener {
    public int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ dy d;

    public lx(dy dyVar, float f10, boolean z10, float f11) {
        this.d = dyVar;
        this.b = f10;
        this.c = f11;
        this.a = (int) f10;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        ((Float) valueAnimator.getAnimatedValue()).getClass();
        int lerp = (int) AndroidUtilities.lerp(this.b, this.c, ((Float) valueAnimator.getAnimatedValue()).floatValue());
        int i9 = lerp - this.a;
        this.a = lerp;
        dy dyVar = this.d;
        dyVar.a0[0].a.scrollBy(0, i9);
        View view = dyVar.fragmentView;
        if (view != null) {
            view.invalidate();
        }
    }
}
