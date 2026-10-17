package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.Property;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public abstract class cr0 extends FrameLayout {
    public View a;
    public org.telegram.ui.ActionBar.j5 b;
    public org.telegram.ui.ActionBar.j5 c;
    public ai.hc d;
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
        animatorSet2.playTogether(ObjectAnimator.ofFloat(this.d, (Property<ai.hc, Float>) View.TRANSLATION_X, this.e == 0 ? 0.0f : r0.getMeasuredWidth()));
        this.f.setDuration(180L);
        this.f.setInterpolator(bs.g);
        this.f.addListener(new c80(this, 18));
        this.f.start();
        ((pq0) this).r.a1();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int size = (View.MeasureSpec.getSize(i10) - AndroidUtilities.dp(28.0f)) / 2;
        ((FrameLayout.LayoutParams) this.c.getLayoutParams()).width = size;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.b.getLayoutParams();
        layoutParams.width = size;
        layoutParams.leftMargin = AndroidUtilities.dp(14.0f) + size;
        ai.hc hcVar = this.d;
        ((FrameLayout.LayoutParams) hcVar.getLayoutParams()).width = size;
        AnimatorSet animatorSet = this.f;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        hcVar.setTranslationX(this.e == 0 ? 0.0f : r2.width);
        super.onMeasure(i10, i11);
    }
}
