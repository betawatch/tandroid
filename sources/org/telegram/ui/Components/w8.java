package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class w8 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ float a;
    public final /* synthetic */ float b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ b9 d;

    public w8(b9 b9Var, float f9, float f10, boolean z10) {
        this.d = b9Var;
        this.a = f9;
        this.b = f10;
        this.c = z10;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        org.telegram.ui.ActionBar.l lVar;
        org.telegram.ui.ActionBar.l lVar2;
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        b9 b9Var = this.d;
        b9Var.J = floatValue;
        float lerp = AndroidUtilities.lerp(this.a, this.b, floatValue);
        lVar = ((org.telegram.ui.ActionBar.o2) b9Var).actionBar;
        lVar.getTitleTextView().setAlpha(b9Var.J);
        if (b9Var.B && !this.c) {
            b9Var.i0(1.0f - b9Var.J, false);
        }
        b9Var.r.setTranslationY(lerp);
        b9Var.x.setTranslationY(lerp);
        b9Var.fragmentView.invalidate();
        lVar2 = ((org.telegram.ui.ActionBar.o2) b9Var).actionBar;
        lVar2.invalidate();
    }
}
