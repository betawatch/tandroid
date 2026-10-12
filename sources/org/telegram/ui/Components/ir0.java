package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.Property;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public abstract class ir0 extends FrameLayout {
    public View a;
    public org.telegram.ui.ActionBar.h5 b;
    public org.telegram.ui.ActionBar.h5 c;
    public di.ab d;
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
        animatorSet2.playTogether(ObjectAnimator.ofFloat(this.d, (Property<di.ab, Float>) View.TRANSLATION_X, this.e == 0 ? 0.0f : r0.getMeasuredWidth()));
        this.f.setDuration(180L);
        this.f.setInterpolator(es.g);
        this.f.addListener(new k90(this, 16));
        this.f.start();
        ((vq0) this).r.a1();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int size = (View.MeasureSpec.getSize(i10) - AndroidUtilities.dp(28.0f)) / 2;
        ((FrameLayout.LayoutParams) this.c.getLayoutParams()).width = size;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.b.getLayoutParams();
        layoutParams.width = size;
        layoutParams.leftMargin = AndroidUtilities.dp(14.0f) + size;
        di.ab abVar = this.d;
        ((FrameLayout.LayoutParams) abVar.getLayoutParams()).width = size;
        AnimatorSet animatorSet = this.f;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        abVar.setTranslationX(this.e == 0 ? 0.0f : r2.width);
        super.onMeasure(i10, i11);
    }
}
