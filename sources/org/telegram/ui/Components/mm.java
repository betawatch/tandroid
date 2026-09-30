package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final /* synthetic */ class mm implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ rm b;

    public /* synthetic */ mm(rm rmVar, int i10) {
        this.a = i10;
        this.b = rmVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                rm rmVar = this.b;
                rmVar.getClass();
                rmVar.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                rmVar.invalidate();
                break;
            default:
                rm rmVar2 = this.b;
                rmVar2.getClass();
                rmVar2.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                rmVar2.invalidate();
                break;
        }
    }
}
