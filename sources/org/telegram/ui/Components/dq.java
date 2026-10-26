package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class dq extends FrameLayout {
    public TextView[] a;
    public ak0[] b;
    public ImageView c;
    public AnimatorSet d;
    public bq e;
    public float f;

    public final void a() {
        if (getTag() == null) {
            return;
        }
        setTag(null);
        bq bqVar = this.e;
        if (bqVar != null) {
            AndroidUtilities.cancelRunOnUIThread(bqVar);
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
