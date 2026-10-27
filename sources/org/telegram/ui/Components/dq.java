package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class dq extends FrameLayout {
    public TextView[] a;
    public bk0[] b;
    public ImageView c;
    public AnimatorSet d;
    public cp e;
    public float f;

    public final void a() {
        if (getTag() == null) {
            return;
        }
        setTag(null);
        cp cpVar = this.e;
        if (cpVar != null) {
            AndroidUtilities.cancelRunOnUIThread(cpVar);
            this.e = null;
        }
        AnimatorSet animatorSet = this.d;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.d = null;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.d = animatorSet2;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(this, (Property<dq, Float>) View.ALPHA, 0.0f), ObjectAnimator.ofFloat(this, (Property<dq, Float>) View.SCALE_X, 0.0f), ObjectAnimator.ofFloat(this, (Property<dq, Float>) View.SCALE_Y, 0.0f));
        this.d.addListener(new cq(this, 1));
        this.d.setDuration(180L);
        this.d.start();
    }

    public float getBaseTranslationY() {
        return this.f;
    }
}
