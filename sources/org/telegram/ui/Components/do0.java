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

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class do0 extends FrameLayout {
    public final View a;
    public final org.telegram.ui.ActionBar.j5 b;
    public final org.telegram.ui.ActionBar.j5 c;
    public final bi.o2 d;
    public int e;
    public AnimatorSet f;
    public LinearGradient h;
    public final Paint n;
    public final RectF r;
    public final /* synthetic */ po0 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public do0(po0 po0Var, Context context) {
        super(context);
        this.s = po0Var;
        final int i7 = 1;
        this.n = new Paint(1);
        this.r = new RectF();
        View view = new View(context);
        this.a = view;
        int L = org.telegram.messenger.g0.L(18.0f);
        int i10 = org.telegram.ui.ActionBar.j6.O5;
        Drawable d02 = org.telegram.ui.ActionBar.j6.d0(L, org.telegram.ui.ActionBar.j6.w0(i10, po0Var.J0));
        org.telegram.ui.ActionBar.m6 M = org.telegram.ui.ActionBar.q6.M(i10);
        org.telegram.ui.ActionBar.e6 e6Var = po0Var.J0;
        view.setBackground(d02);
        org.telegram.ui.ActionBar.q6.j(view, d02, M, null, e6Var);
        addView(view, c8.ja.d(-1, 36.0f, 51, 14.0f, 0.0f, 14.0f, 0.0f));
        bi.o2 o2Var = new bi.o2(25, context, this);
        this.d = o2Var;
        addView(o2Var, c8.ja.d(-1, 36.0f, 51, 14.0f, 0.0f, 14.0f, 0.0f));
        org.telegram.ui.ActionBar.j5 j5Var = new org.telegram.ui.ActionBar.j5(context);
        this.c = j5Var;
        int i11 = org.telegram.ui.ActionBar.j6.eh;
        org.telegram.ui.ActionBar.q6.X(j5Var, i11, po0Var.J0);
        j5Var.setTextSize(13);
        j5Var.setLeftDrawable(R.drawable.msg_tabs_mic1);
        final int i12 = 0;
        j5Var.l(org.telegram.messenger.hd.M0(2131743375, null), false);
        j5Var.setGravity(17);
        addView(j5Var, c8.ja.d(-1, -1.0f, 51, 14.0f, 0.0f, 0.0f, 0.0f));
        j5Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.oo0
            public final /* synthetic */ do0 b;

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
        org.telegram.ui.ActionBar.j5 j5Var2 = new org.telegram.ui.ActionBar.j5(context);
        this.b = j5Var2;
        org.telegram.ui.ActionBar.q6.X(j5Var2, i11, po0Var.J0);
        j5Var2.setTextSize(13);
        j5Var2.setLeftDrawable(R.drawable.msg_tabs_mic2);
        j5Var2.l(org.telegram.messenger.hd.M0(2131743374, null), false);
        j5Var2.setGravity(17);
        addView(j5Var2, c8.ja.d(-1, -1.0f, 51, 0.0f, 0.0f, 14.0f, 0.0f));
        j5Var2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.oo0
            public final /* synthetic */ do0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i7) {
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

    public final void a(int i7) {
        if (this.e == i7) {
            return;
        }
        this.e = i7;
        AnimatorSet animatorSet = this.f;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f = animatorSet2;
        int i10 = this.e;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(this.d, (Property<bi.o2, Float>) View.TRANSLATION_X, i10 == 0 ? 0.0f : r1.getMeasuredWidth()));
        this.f.setDuration(180L);
        this.f.setInterpolator(er.g);
        this.f.addListener(new h60(this, 19));
        this.f.start();
        this.s.a1();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        int size = (View.MeasureSpec.getSize(i7) - org.telegram.messenger.g0.L(28.0f)) / 2;
        ((FrameLayout.LayoutParams) this.c.getLayoutParams()).width = size;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.b.getLayoutParams();
        layoutParams.width = size;
        layoutParams.leftMargin = org.telegram.messenger.g0.L(14.0f) + size;
        bi.o2 o2Var = this.d;
        ((FrameLayout.LayoutParams) o2Var.getLayoutParams()).width = size;
        AnimatorSet animatorSet = this.f;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        o2Var.setTranslationX(this.e == 0 ? 0.0f : r2.width);
        super.onMeasure(i7, i10);
    }
}
