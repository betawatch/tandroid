package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class kx implements ValueAnimator.AnimatorUpdateListener {
    public int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ ey d;

    public kx(ey eyVar, float f7, boolean z10, float f10) {
        this.d = eyVar;
        this.b = f7;
        this.c = f10;
        this.a = (int) f7;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        ((Float) valueAnimator.getAnimatedValue()).getClass();
        int lerp = (int) AndroidUtilities.lerp(this.b, this.c, ((Float) valueAnimator.getAnimatedValue()).floatValue());
        int i10 = lerp - this.a;
        this.a = lerp;
        ey eyVar = this.d;
        eyVar.e0[0].a.scrollBy(0, i10);
        View view = eyVar.fragmentView;
        if (view != null) {
            view.invalidate();
        }
    }
}
