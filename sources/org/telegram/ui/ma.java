package org.telegram.ui;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final /* synthetic */ class ma implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ na b;

    public /* synthetic */ ma(na naVar, int i10) {
        this.a = i10;
        this.b = naVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                na naVar = this.b;
                naVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                naVar.n = floatValue;
                naVar.f.setTranslationX(floatValue * AndroidUtilities.dp(16.0f));
                naVar.d.setAlpha(naVar.n);
                break;
            default:
                na naVar2 = this.b;
                naVar2.getClass();
                naVar2.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int i10 = org.telegram.ui.ActionBar.j6.z6;
                org.telegram.ui.ActionBar.f6 f6Var = naVar2.b;
                int d = i0.a.d(naVar2.E, org.telegram.ui.ActionBar.j6.v0(i10, f6Var), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.n6, f6Var));
                naVar2.e.b(d);
                naVar2.f.setTextColor(d);
                break;
        }
    }
}
