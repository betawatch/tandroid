package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.Property;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public abstract class rq0 extends FrameLayout {
    public org.telegram.ui.ActionBar.l5 a;
    public org.telegram.ui.ActionBar.l5 b;
    public bi.nc c;
    public int d;
    public AnimatorSet e;
    public Paint f;
    public RectF h;

    public final void a(int i10) {
        if (this.d == i10) {
            return;
        }
        this.d = i10;
        AnimatorSet animatorSet = this.e;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.e = animatorSet2;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(this.c, (Property<bi.nc, Float>) View.TRANSLATION_X, this.d == 0 ? 0.0f : r0.getMeasuredWidth()));
        this.e.setDuration(180L);
        this.e.setInterpolator(wr.g);
        this.e.addListener(new zn0(this, 2));
        this.e.start();
        ((eq0) this).n.Z0();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int size = (View.MeasureSpec.getSize(i10) - AndroidUtilities.dp(28.0f)) / 2;
        ((FrameLayout.LayoutParams) this.b.getLayoutParams()).width = size;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.a.getLayoutParams();
        layoutParams.width = size;
        layoutParams.leftMargin = AndroidUtilities.dp(14.0f) + size;
        bi.nc ncVar = this.c;
        ((FrameLayout.LayoutParams) ncVar.getLayoutParams()).width = size;
        AnimatorSet animatorSet = this.e;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        ncVar.setTranslationX(this.d == 0 ? 0.0f : r2.width);
        super.onMeasure(i10, i11);
    }
}
