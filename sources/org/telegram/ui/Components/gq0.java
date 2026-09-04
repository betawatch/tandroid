package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.Property;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public abstract class gq0 extends FrameLayout {
    public org.telegram.ui.ActionBar.j5 a;
    public org.telegram.ui.ActionBar.j5 b;
    public di.eb c;
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
        animatorSet2.playTogether(ObjectAnimator.ofFloat(this.c, (Property<di.eb, Float>) View.TRANSLATION_X, this.d == 0 ? 0.0f : r0.getMeasuredWidth()));
        this.e.setDuration(180L);
        this.e.setInterpolator(pr.g);
        this.e.addListener(new r80(this, 15));
        this.e.start();
        ((tp0) this).n.Z0();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int size = (View.MeasureSpec.getSize(i10) - AndroidUtilities.dp(28.0f)) / 2;
        ((FrameLayout.LayoutParams) this.b.getLayoutParams()).width = size;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.a.getLayoutParams();
        layoutParams.width = size;
        layoutParams.leftMargin = AndroidUtilities.dp(14.0f) + size;
        di.eb ebVar = this.c;
        ((FrameLayout.LayoutParams) ebVar.getLayoutParams()).width = size;
        AnimatorSet animatorSet = this.e;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        ebVar.setTranslationX(this.d == 0 ? 0.0f : r2.width);
        super.onMeasure(i10, i11);
    }
}
