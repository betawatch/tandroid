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

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class no0 extends FrameLayout {
    public final View a;
    public final org.telegram.ui.ActionBar.n5 b;
    public final org.telegram.ui.ActionBar.n5 c;
    public final bi.o3 d;
    public int e;
    public AnimatorSet f;
    public LinearGradient h;
    public final Paint n;
    public final RectF r;
    public final /* synthetic */ zo0 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public no0(zo0 zo0Var, Context context) {
        super(context);
        this.s = zo0Var;
        final int i7 = 1;
        this.n = new Paint(1);
        this.r = new RectF();
        View view = new View(context);
        this.a = view;
        int L = org.telegram.messenger.g0.L(18.0f);
        int i10 = org.telegram.ui.ActionBar.n6.O5;
        Drawable d02 = org.telegram.ui.ActionBar.n6.d0(L, org.telegram.ui.ActionBar.n6.w0(i10, zo0Var.J0));
        org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i10);
        org.telegram.ui.ActionBar.i6 i6Var = zo0Var.J0;
        view.setBackground(d02);
        org.telegram.ui.ActionBar.u6.j(view, d02, M, null, i6Var);
        addView(view, c8.na.d(-1, 36.0f, 51, 14.0f, 0.0f, 14.0f, 0.0f));
        bi.o3 o3Var = new bi.o3(25, context, this);
        this.d = o3Var;
        addView(o3Var, c8.na.d(-1, 36.0f, 51, 14.0f, 0.0f, 14.0f, 0.0f));
        org.telegram.ui.ActionBar.n5 n5Var = new org.telegram.ui.ActionBar.n5(context);
        this.c = n5Var;
        int i11 = org.telegram.ui.ActionBar.n6.eh;
        org.telegram.ui.ActionBar.u6.X(n5Var, i11, zo0Var.J0);
        n5Var.setTextSize(13);
        n5Var.setLeftDrawable(R.drawable.msg_tabs_mic1);
        final int i12 = 0;
        n5Var.l(org.telegram.messenger.gd.N0(2131743125, null), false);
        n5Var.setGravity(17);
        addView(n5Var, c8.na.d(-1, -1.0f, 51, 14.0f, 0.0f, 0.0f, 0.0f));
        n5Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.yo0
            public final /* synthetic */ no0 b;

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
        org.telegram.ui.ActionBar.n5 n5Var2 = new org.telegram.ui.ActionBar.n5(context);
        this.b = n5Var2;
        org.telegram.ui.ActionBar.u6.X(n5Var2, i11, zo0Var.J0);
        n5Var2.setTextSize(13);
        n5Var2.setLeftDrawable(R.drawable.msg_tabs_mic2);
        n5Var2.l(org.telegram.messenger.gd.N0(2131743124, null), false);
        n5Var2.setGravity(17);
        addView(n5Var2, c8.na.d(-1, -1.0f, 51, 0.0f, 0.0f, 14.0f, 0.0f));
        n5Var2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.yo0
            public final /* synthetic */ no0 b;

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
        animatorSet2.playTogether(ObjectAnimator.ofFloat(this.d, (Property<bi.o3, Float>) View.TRANSLATION_X, i10 == 0 ? 0.0f : r1.getMeasuredWidth()));
        this.f.setDuration(180L);
        this.f.setInterpolator(kr.g);
        this.f.addListener(new p60(this, 19));
        this.f.start();
        this.s.b1();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        int size = (View.MeasureSpec.getSize(i7) - org.telegram.messenger.g0.L(28.0f)) / 2;
        ((FrameLayout.LayoutParams) this.c.getLayoutParams()).width = size;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.b.getLayoutParams();
        layoutParams.width = size;
        layoutParams.leftMargin = org.telegram.messenger.g0.L(14.0f) + size;
        bi.o3 o3Var = this.d;
        ((FrameLayout.LayoutParams) o3Var.getLayoutParams()).width = size;
        AnimatorSet animatorSet = this.f;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        o3Var.setTranslationX(this.e == 0 ? 0.0f : r2.width);
        super.onMeasure(i7, i10);
    }
}
