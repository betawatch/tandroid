package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.Property;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public abstract class qp0 extends FrameLayout {
    public org.telegram.ui.ActionBar.h5 a;
    public org.telegram.ui.ActionBar.h5 b;
    public fh.l2 c;
    public int d;
    public AnimatorSet e;
    public Paint f;
    public RectF h;

    public final void a(int i9) {
        if (this.d == i9) {
            return;
        }
        this.d = i9;
        AnimatorSet animatorSet = this.e;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.e = animatorSet2;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(this.c, (Property<fh.l2, Float>) View.TRANSLATION_X, this.d == 0 ? 0.0f : r0.getMeasuredWidth()));
        this.e.setDuration(180L);
        this.e.setInterpolator(gr.g);
        this.e.addListener(new r60(this, 18));
        this.e.start();
        ((dp0) this).n.Z0();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i9, int i10) {
        int size = (View.MeasureSpec.getSize(i9) - AndroidUtilities.dp(28.0f)) / 2;
        ((FrameLayout.LayoutParams) this.b.getLayoutParams()).width = size;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.a.getLayoutParams();
        layoutParams.width = size;
        layoutParams.leftMargin = AndroidUtilities.dp(14.0f) + size;
        fh.l2 l2Var = this.c;
        ((FrameLayout.LayoutParams) l2Var.getLayoutParams()).width = size;
        AnimatorSet animatorSet = this.e;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        l2Var.setTranslationX(this.d == 0 ? 0.0f : r2.width);
        super.onMeasure(i9, i10);
    }
}
