package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final class bq extends FrameLayout {
    public TextView[] a;
    public bk0[] b;
    public ImageView c;
    public AnimatorSet d;
    public zp e;
    public float f;

    public final void a() {
        if (getTag() == null) {
            return;
        }
        setTag(null);
        zp zpVar = this.e;
        if (zpVar != null) {
            AndroidUtilities.cancelRunOnUIThread(zpVar);
            this.e = null;
        }
        AnimatorSet animatorSet = this.d;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.d = null;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.d = animatorSet2;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(this, (Property<bq, Float>) View.ALPHA, 0.0f), ObjectAnimator.ofFloat(this, (Property<bq, Float>) View.SCALE_X, 0.0f), ObjectAnimator.ofFloat(this, (Property<bq, Float>) View.SCALE_Y, 0.0f));
        this.d.addListener(new aq(this, 1));
        this.d.setDuration(180L);
        this.d.start();
    }

    public float getBaseTranslationY() {
        return this.f;
    }
}
