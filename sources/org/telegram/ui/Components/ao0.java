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

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class ao0 extends FrameLayout {
    public final View a;
    public final org.telegram.ui.ActionBar.m5 b;
    public final org.telegram.ui.ActionBar.m5 c;
    public final bi.ec d;
    public int e;
    public AnimatorSet f;
    public LinearGradient h;
    public final Paint n;
    public final RectF r;
    public final /* synthetic */ mo0 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ao0(mo0 mo0Var, Context context) {
        super(context);
        this.s = mo0Var;
        final int i7 = 1;
        this.n = new Paint(1);
        this.r = new RectF();
        View view = new View(context);
        this.a = view;
        int L = org.telegram.messenger.g0.L(18.0f);
        int i10 = org.telegram.ui.ActionBar.m6.O5;
        Drawable d02 = org.telegram.ui.ActionBar.m6.d0(L, org.telegram.ui.ActionBar.m6.w0(i10, mo0Var.I0));
        org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i10);
        org.telegram.ui.ActionBar.h6 h6Var = mo0Var.I0;
        view.setBackground(d02);
        org.telegram.ui.ActionBar.t6.j(view, d02, M, null, h6Var);
        addView(view, c8.ha.d(-1, 36.0f, 51, 14.0f, 0.0f, 14.0f, 0.0f));
        bi.ec ecVar = new bi.ec(24, context, this);
        this.d = ecVar;
        addView(ecVar, c8.ha.d(-1, 36.0f, 51, 14.0f, 0.0f, 14.0f, 0.0f));
        org.telegram.ui.ActionBar.m5 m5Var = new org.telegram.ui.ActionBar.m5(context);
        this.c = m5Var;
        int i11 = org.telegram.ui.ActionBar.m6.bh;
        org.telegram.ui.ActionBar.t6.X(m5Var, i11, mo0Var.I0);
        m5Var.setTextSize(13);
        m5Var.setLeftDrawable(R.drawable.msg_tabs_mic1);
        final int i12 = 0;
        m5Var.l(org.telegram.messenger.id.M0(2131743375, null), false);
        m5Var.setGravity(17);
        addView(m5Var, c8.ha.d(-1, -1.0f, 51, 14.0f, 0.0f, 0.0f, 0.0f));
        m5Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.lo0
            public final /* synthetic */ ao0 b;

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
        org.telegram.ui.ActionBar.m5 m5Var2 = new org.telegram.ui.ActionBar.m5(context);
        this.b = m5Var2;
        org.telegram.ui.ActionBar.t6.X(m5Var2, i11, mo0Var.I0);
        m5Var2.setTextSize(13);
        m5Var2.setLeftDrawable(R.drawable.msg_tabs_mic2);
        m5Var2.l(org.telegram.messenger.id.M0(2131743374, null), false);
        m5Var2.setGravity(17);
        addView(m5Var2, c8.ha.d(-1, -1.0f, 51, 0.0f, 0.0f, 14.0f, 0.0f));
        m5Var2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.lo0
            public final /* synthetic */ ao0 b;

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
        animatorSet2.playTogether(ObjectAnimator.ofFloat(this.d, (Property<bi.ec, Float>) View.TRANSLATION_X, i10 == 0 ? 0.0f : r1.getMeasuredWidth()));
        this.f.setDuration(180L);
        this.f.setInterpolator(wq.g);
        this.f.addListener(new e60(this, 19));
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
        bi.ec ecVar = this.d;
        ((FrameLayout.LayoutParams) ecVar.getLayoutParams()).width = size;
        AnimatorSet animatorSet = this.f;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        ecVar.setTranslationX(this.e == 0 ? 0.0f : r2.width);
        super.onMeasure(i7, i10);
    }
}
