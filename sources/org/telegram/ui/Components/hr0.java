package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.Property;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public abstract class hr0 extends FrameLayout {
    public View a;
    public org.telegram.ui.ActionBar.n5 b;
    public org.telegram.ui.ActionBar.n5 c;
    public ai.jc d;
    public int e;
    public AnimatorSet f;
    public Paint h;
    public RectF n;

    public final void a(int i10) {
        if (this.e == i10) {
            return;
        }
        this.e = i10;
        AnimatorSet animatorSet = this.f;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f = animatorSet2;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(this.d, (Property<ai.jc, Float>) View.TRANSLATION_X, this.e == 0 ? 0.0f : r0.getMeasuredWidth()));
        this.f.setDuration(180L);
        this.f.setInterpolator(bs.g);
        this.f.addListener(new i60(this, 19));
        this.f.start();
        ((uq0) this).r.f1();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int size = (View.MeasureSpec.getSize(i10) - AndroidUtilities.dp(28.0f)) / 2;
        ((FrameLayout.LayoutParams) this.c.getLayoutParams()).width = size;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.b.getLayoutParams();
        layoutParams.width = size;
        layoutParams.leftMargin = AndroidUtilities.dp(14.0f) + size;
        ai.jc jcVar = this.d;
        ((FrameLayout.LayoutParams) jcVar.getLayoutParams()).width = size;
        AnimatorSet animatorSet = this.f;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        jcVar.setTranslationX(this.e == 0 ? 0.0f : r2.width);
        super.onMeasure(i10, i11);
    }
}
