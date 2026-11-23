package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.io.File;
import org.telegram.messenger.ApplicationLoaderImpl;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class m51 extends org.telegram.ui.ActionBar.w2 {
    public final Drawable m1;
    public final l51 n1;
    public AnimatorSet o1;
    public final View p1;
    public final LinearLayout q1;
    public int r1;
    public final int[] s1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m51(Context context, org.telegram.messenger.d1 d1Var) {
        super(context, false);
        final int i7 = 0;
        int i10 = 2;
        this.s1 = new int[2];
        setCanceledOnTouchOutside(false);
        this.v0 = false;
        this.w0 = false;
        Drawable g10 = i5.c.g(context, R.drawable.sheet_shadow_round);
        this.m1 = g10;
        g10.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.h5, false), PorterDuff.Mode.MULTIPLY));
        final int i11 = 1;
        w01 w01Var = new w01(1, context, this);
        w01Var.setWillNotDraw(false);
        this.b = w01Var;
        l51 l51Var = new l51(this, context);
        this.n1 = l51Var;
        l51Var.setFillViewport(true);
        l51Var.setWillNotDraw(false);
        l51Var.setClipToPadding(false);
        l51Var.setVerticalScrollBarEnabled(false);
        w01Var.addView(l51Var, c8.na.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 130.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.q1 = linearLayout;
        linearLayout.setOrientation(1);
        l51Var.addView(linearLayout, c8.na.x(-1, -2, 51));
        TextView textView = new TextView(context);
        org.telegram.messenger.m10.p(textView, 1, 20.0f);
        int i12 = org.telegram.ui.ActionBar.n6.j5;
        textView.setTextColor(org.telegram.ui.ActionBar.n6.x0(null, i12, false));
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setText(org.telegram.messenger.gd.N0(2131754226, null));
        linearLayout.addView(textView, c8.na.t(-2, -2, 49, 23, 16, 23, 0));
        TextView textView2 = new TextView(getContext());
        textView2.setTextColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.r5, false));
        textView2.setTextSize(1, 14.0f);
        textView2.setMovementMethod(new org.telegram.messenger.c0(false));
        int i13 = org.telegram.ui.ActionBar.n6.k5;
        textView2.setLinkTextColor(org.telegram.ui.ActionBar.n6.x0(null, i13, false));
        textView2.setText(org.telegram.messenger.gd.a0(null, null, 2131754239, d1Var.b, Integer.valueOf(d1Var.a)));
        textView2.setGravity(49);
        linearLayout.addView(textView2, c8.na.t(-2, -2, 49, 23, 0, 23, 5));
        String str = d1Var.c;
        if (!TextUtils.isEmpty(str)) {
            TextView textView3 = new TextView(getContext());
            textView3.setTextColor(org.telegram.ui.ActionBar.n6.x0(null, i12, false));
            textView3.setTextSize(1, 14.0f);
            textView3.setMovementMethod(new org.telegram.messenger.c0(false));
            textView3.setLinkTextColor(org.telegram.ui.ActionBar.n6.x0(null, i13, false));
            textView3.setText(org.telegram.messenger.j6.m(str, textView3.getPaint().getFontMetricsInt(), false, null, 0));
            org.telegram.messenger.ks.i(textView3);
            textView3.setGravity(51);
            linearLayout.addView(textView3, c8.na.t(-2, -2, 51, 23, 15, 23, 0));
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, org.telegram.messenger.g0.f1(), 83);
        layoutParams.bottomMargin = org.telegram.messenger.g0.L(130.0f);
        View view = new View(context);
        this.p1 = view;
        view.setBackgroundColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.V5, false));
        view.setAlpha(0.0f);
        view.setTag(1);
        w01Var.addView(view, layoutParams);
        hi.e eVar = new hi.e(context, null, true);
        File g11 = org.telegram.messenger.t0.a.g();
        if (g11 != null) {
            eVar.i(org.telegram.messenger.gd.a0(null, null, 2131754222, new Object[0]), false, true);
            eVar.setOnClickListener(new p31(i10, this, g11));
        } else {
            eVar.i(org.telegram.messenger.gd.a0(null, null, 2131754224, new Object[0]), false, true);
            eVar.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.k51
                public final /* synthetic */ m51 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    switch (i7) {
                        case 0:
                            if (((ApplicationLoaderImpl) org.telegram.messenger.t0.a).q()) {
                                org.telegram.messenger.h1.e().b(false);
                            }
                            this.b.dismiss();
                            break;
                        default:
                            this.b.dismiss();
                            break;
                    }
                }
            });
        }
        w01Var.addView(eVar, c8.na.d(-1, 48.0f, 87, 20.0f, 0.0f, 20.0f, 60.0f));
        hi.e eVar2 = new hi.e(context, null, false);
        eVar2.i(org.telegram.messenger.gd.N0(2131754221, null), false, true);
        eVar2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.k51
            public final /* synthetic */ m51 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i11) {
                    case 0:
                        if (((ApplicationLoaderImpl) org.telegram.messenger.t0.a).q()) {
                            org.telegram.messenger.h1.e().b(false);
                        }
                        this.b.dismiss();
                        break;
                    default:
                        this.b.dismiss();
                        break;
                }
            }
        });
        w01Var.addView(eVar2, c8.na.d(-1, 48.0f, 87, 20.0f, 4.0f, 20.0f, 8.0f));
    }

    public static void J0(m51 m51Var) {
        View childAt = m51Var.q1.getChildAt(0);
        int[] iArr = m51Var.s1;
        childAt.getLocationInWindow(iArr);
        int max = Math.max(iArr[1] - org.telegram.messenger.g0.L(24.0f), 0);
        if (r0.getMeasuredHeight() + iArr[1] <= m51Var.b.getTranslationY() + (m51Var.c.getMeasuredHeight() - org.telegram.messenger.g0.L(113.0f))) {
            m51Var.K0(false);
        } else {
            m51Var.K0(true);
        }
        if (m51Var.r1 != max) {
            m51Var.r1 = max;
            m51Var.n1.invalidate();
        }
    }

    @Override // org.telegram.ui.ActionBar.w2
    public final boolean F() {
        return false;
    }

    public final void K0(boolean z10) {
        View view = this.p1;
        if ((!z10 || view.getTag() == null) && (z10 || view.getTag() != null)) {
            return;
        }
        view.setTag(z10 ? null : 1);
        if (z10) {
            view.setVisibility(0);
        }
        AnimatorSet animatorSet = this.o1;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.o1 = animatorSet2;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, z10 ? 1.0f : 0.0f));
        this.o1.setDuration(150L);
        this.o1.addListener(new org.telegram.ui.on(25, this, z10));
        this.o1.start();
    }
}
