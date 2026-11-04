package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.Property;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class co0 extends FrameLayout {
    public final View a;
    public final org.telegram.ui.ActionBar.k5 b;
    public final org.telegram.ui.ActionBar.k5 c;
    public final ai.x2 d;
    public int e;
    public AnimatorSet f;
    public LinearGradient h;
    public final Paint n;
    public final RectF r;
    public final /* synthetic */ oo0 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public co0(oo0 oo0Var, Context context) {
        super(context);
        this.s = oo0Var;
        final int i3 = 1;
        this.n = new Paint(1);
        this.r = new RectF();
        View view = new View(context);
        this.a = view;
        int L = org.telegram.messenger.g0.L(18.0f);
        int i10 = org.telegram.ui.ActionBar.k6.O5;
        Drawable d02 = org.telegram.ui.ActionBar.k6.d0(L, org.telegram.ui.ActionBar.k6.w0(i10, oo0Var.J0));
        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i10);
        org.telegram.ui.ActionBar.e6 e6Var = oo0Var.J0;
        view.setBackground(d02);
        org.telegram.ui.ActionBar.r6.k(view, d02, N, null, e6Var);
        addView(view, b8.mf.d(-1, 36.0f, 51, 14.0f, 0.0f, 14.0f, 0.0f));
        ai.x2 x2Var = new ai.x2(25, context, this);
        this.d = x2Var;
        addView(x2Var, b8.mf.d(-1, 36.0f, 51, 14.0f, 0.0f, 14.0f, 0.0f));
        org.telegram.ui.ActionBar.k5 k5Var = new org.telegram.ui.ActionBar.k5(context);
        this.c = k5Var;
        int i11 = org.telegram.ui.ActionBar.k6.bh;
        org.telegram.ui.ActionBar.r6.Y(k5Var, i11, oo0Var.J0);
        k5Var.setTextSize(13);
        k5Var.setLeftDrawable(R.drawable.msg_tabs_mic1);
        final int i12 = 0;
        k5Var.l(org.telegram.messenger.bd.M0(2131743385, null), false);
        k5Var.setGravity(17);
        addView(k5Var, b8.mf.d(-1, -1.0f, 51, 14.0f, 0.0f, 0.0f, 0.0f));
        k5Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.no0
            public final /* synthetic */ co0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i12) {
                    case 0:
                        this.b.a(0);
                        break;
                    default:
                        this.b.a(1);
                        break;
                }
            }
        });
        org.telegram.ui.ActionBar.k5 k5Var2 = new org.telegram.ui.ActionBar.k5(context);
        this.b = k5Var2;
        org.telegram.ui.ActionBar.r6.Y(k5Var2, i11, oo0Var.J0);
        k5Var2.setTextSize(13);
        k5Var2.setLeftDrawable(R.drawable.msg_tabs_mic2);
        k5Var2.l(org.telegram.messenger.bd.M0(2131743384, null), false);
        k5Var2.setGravity(17);
        addView(k5Var2, b8.mf.d(-1, -1.0f, 51, 0.0f, 0.0f, 14.0f, 0.0f));
        k5Var2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.no0
            public final /* synthetic */ co0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i3) {
                    case 0:
                        this.b.a(0);
                        break;
                    default:
                        this.b.a(1);
                        break;
                }
            }
        });
    }

    public final void a(int i3) {
        if (this.e == i3) {
            return;
        }
        this.e = i3;
        AnimatorSet animatorSet = this.f;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f = animatorSet2;
        int i10 = this.e;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(this.d, (Property<ai.x2, Float>) View.TRANSLATION_X, i10 == 0 ? 0.0f : r1.getMeasuredWidth()));
        this.f.setDuration(180L);
        this.f.setInterpolator(xq.g);
        this.f.addListener(new a60(this, 19));
        this.f.start();
        this.s.a1();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i3, int i10) {
        int size = (View.MeasureSpec.getSize(i3) - org.telegram.messenger.g0.L(28.0f)) / 2;
        ((FrameLayout.LayoutParams) this.c.getLayoutParams()).width = size;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.b.getLayoutParams();
        layoutParams.width = size;
        layoutParams.leftMargin = org.telegram.messenger.g0.L(14.0f) + size;
        ai.x2 x2Var = this.d;
        ((FrameLayout.LayoutParams) x2Var.getLayoutParams()).width = size;
        AnimatorSet animatorSet = this.f;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        x2Var.setTranslationX(this.e == 0 ? 0.0f : r2.width);
        super.onMeasure(i3, i10);
    }
}
