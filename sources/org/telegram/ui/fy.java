package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class fy implements ValueAnimator.AnimatorUpdateListener {
    public int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ wy d;

    public fy(wy wyVar, float f7, boolean z10, float f10) {
        this.d = wyVar;
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
        wy wyVar = this.d;
        wyVar.e0[0].a.scrollBy(0, i10);
        View view = wyVar.fragmentView;
        if (view != null) {
            view.invalidate();
        }
    }
}
