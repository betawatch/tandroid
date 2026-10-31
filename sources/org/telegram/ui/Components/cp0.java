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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class cp0 extends FrameLayout {
    public final View a;
    public final org.telegram.ui.ActionBar.u5 b;
    public final org.telegram.ui.ActionBar.u5 c;
    public final bi.t0 d;
    public int e;
    public AnimatorSet f;
    public LinearGradient h;
    public final Paint n;
    public final RectF r;
    public final /* synthetic */ op0 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cp0(op0 op0Var, Context context) {
        super(context);
        this.s = op0Var;
        final int i10 = 1;
        this.n = new Paint(1);
        this.r = new RectF();
        View view = new View(context);
        this.a = view;
        int L = org.telegram.messenger.i0.L(18.0f);
        int i11 = org.telegram.ui.ActionBar.t6.O5;
        Drawable d02 = org.telegram.ui.ActionBar.t6.d0(L, org.telegram.ui.ActionBar.t6.w0(i11, op0Var.I0));
        org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i11);
        org.telegram.ui.ActionBar.p6 p6Var = op0Var.I0;
        view.setBackground(d02);
        org.telegram.ui.ActionBar.a7.k(view, d02, N, null, p6Var);
        addView(view, w7.b6.d(-1, 36.0f, 51, 14.0f, 0.0f, 14.0f, 0.0f));
        bi.t0 t0Var = new bi.t0(this, context, 19);
        this.d = t0Var;
        addView(t0Var, w7.b6.d(-1, 36.0f, 51, 14.0f, 0.0f, 14.0f, 0.0f));
        org.telegram.ui.ActionBar.u5 u5Var = new org.telegram.ui.ActionBar.u5(context);
        this.c = u5Var;
        int i12 = org.telegram.ui.ActionBar.t6.bh;
        org.telegram.ui.ActionBar.a7.Y(u5Var, i12, op0Var.I0);
        u5Var.setTextSize(13);
        u5Var.setLeftDrawable(R.drawable.msg_tabs_mic1);
        final int i13 = 0;
        u5Var.l(org.telegram.messenger.cd.L0(2131743401, null), false);
        u5Var.setGravity(17);
        addView(u5Var, w7.b6.d(-1, -1.0f, 51, 14.0f, 0.0f, 0.0f, 0.0f));
        u5Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.np0
            public final /* synthetic */ cp0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i13) {
                    case 0:
                        this.b.a(0);
                        break;
                    default:
                        this.b.a(1);
                        break;
                }
            }
        });
        org.telegram.ui.ActionBar.u5 u5Var2 = new org.telegram.ui.ActionBar.u5(context);
        this.b = u5Var2;
        org.telegram.ui.ActionBar.a7.Y(u5Var2, i12, op0Var.I0);
        u5Var2.setTextSize(13);
        u5Var2.setLeftDrawable(R.drawable.msg_tabs_mic2);
        u5Var2.l(org.telegram.messenger.cd.L0(2131743400, null), false);
        u5Var2.setGravity(17);
        addView(u5Var2, w7.b6.d(-1, -1.0f, 51, 0.0f, 0.0f, 14.0f, 0.0f));
        u5Var2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.np0
            public final /* synthetic */ cp0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i10) {
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
        int i11 = this.e;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(this.d, (Property<bi.t0, Float>) View.TRANSLATION_X, i11 == 0 ? 0.0f : r1.getMeasuredWidth()));
        this.f.setDuration(180L);
        this.f.setInterpolator(gr.g);
        this.f.addListener(new t60(this, 19));
        this.f.start();
        this.s.a1();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int size = (View.MeasureSpec.getSize(i10) - org.telegram.messenger.i0.L(28.0f)) / 2;
        ((FrameLayout.LayoutParams) this.c.getLayoutParams()).width = size;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.b.getLayoutParams();
        layoutParams.width = size;
        layoutParams.leftMargin = org.telegram.messenger.i0.L(14.0f) + size;
        bi.t0 t0Var = this.d;
        ((FrameLayout.LayoutParams) t0Var.getLayoutParams()).width = size;
        AnimatorSet animatorSet = this.f;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        t0Var.setTranslationX(this.e == 0 ? 0.0f : r2.width);
        super.onMeasure(i10, i11);
    }
}
