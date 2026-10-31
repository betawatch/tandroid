package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class hp extends FrameLayout {
    public TextView[] a;
    public ei0[] b;
    public ImageView c;
    public AnimatorSet d;
    public ho e;
    public float f;

    public final void a() {
        if (getTag() == null) {
            return;
        }
        setTag(null);
        ho hoVar = this.e;
        if (hoVar != null) {
            org.telegram.messenger.i0.r(hoVar);
            this.e = null;
        }
        AnimatorSet animatorSet = this.d;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.d = null;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.d = animatorSet2;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(this, (Property<hp, Float>) View.ALPHA, 0.0f), ObjectAnimator.ofFloat(this, (Property<hp, Float>) View.SCALE_X, 0.0f), ObjectAnimator.ofFloat(this, (Property<hp, Float>) View.SCALE_Y, 0.0f));
        this.d.addListener(new gp(this, 1));
        this.d.setDuration(180L);
        this.d.start();
    }

    public float getBaseTranslationY() {
        return this.f;
    }
}
