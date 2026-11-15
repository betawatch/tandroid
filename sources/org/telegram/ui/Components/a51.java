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

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class a51 extends org.telegram.ui.ActionBar.u2 {
    public final Drawable m1;
    public final z41 n1;
    public AnimatorSet o1;
    public final View p1;
    public final LinearLayout q1;
    public int r1;
    public final int[] s1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a51(Context context, org.telegram.messenger.d1 d1Var) {
        super(context, false);
        final int i7 = 0;
        this.s1 = new int[2];
        setCanceledOnTouchOutside(false);
        this.v0 = false;
        this.w0 = false;
        Drawable g10 = i5.c.g(context, R.drawable.sheet_shadow_round);
        this.m1 = g10;
        g10.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.h5, false), PorterDuff.Mode.MULTIPLY));
        final int i10 = 1;
        m01 m01Var = new m01(1, context, this);
        m01Var.setWillNotDraw(false);
        this.b = m01Var;
        z41 z41Var = new z41(this, context);
        this.n1 = z41Var;
        z41Var.setFillViewport(true);
        z41Var.setWillNotDraw(false);
        z41Var.setClipToPadding(false);
        z41Var.setVerticalScrollBarEnabled(false);
        m01Var.addView(z41Var, c8.ja.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 130.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.q1 = linearLayout;
        linearLayout.setOrientation(1);
        z41Var.addView(linearLayout, c8.ja.x(-1, -2, 51));
        TextView textView = new TextView(context);
        org.telegram.messenger.i20.o(textView, 1, 20.0f);
        int i11 = org.telegram.ui.ActionBar.j6.j5;
        textView.setTextColor(org.telegram.ui.ActionBar.j6.x0(null, i11, false));
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setText(org.telegram.messenger.hd.M0(2131754229, null));
        linearLayout.addView(textView, c8.ja.t(-2, -2, 49, 23, 16, 23, 0));
        TextView textView2 = new TextView(getContext());
        textView2.setTextColor(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.r5, false));
        textView2.setTextSize(1, 14.0f);
        textView2.setMovementMethod(new org.telegram.messenger.c0(false));
        int i12 = org.telegram.ui.ActionBar.j6.k5;
        textView2.setLinkTextColor(org.telegram.ui.ActionBar.j6.x0(null, i12, false));
        textView2.setText(org.telegram.messenger.hd.a0(null, null, 2131754242, d1Var.b, Integer.valueOf(d1Var.a)));
        textView2.setGravity(49);
        linearLayout.addView(textView2, c8.ja.t(-2, -2, 49, 23, 0, 23, 5));
        String str = d1Var.c;
        if (!TextUtils.isEmpty(str)) {
            TextView textView3 = new TextView(getContext());
            textView3.setTextColor(org.telegram.ui.ActionBar.j6.x0(null, i11, false));
            textView3.setTextSize(1, 14.0f);
            textView3.setMovementMethod(new org.telegram.messenger.c0(false));
            textView3.setLinkTextColor(org.telegram.ui.ActionBar.j6.x0(null, i12, false));
            textView3.setText(org.telegram.messenger.j6.m(str, textView3.getPaint().getFontMetricsInt(), false, null, 0));
            org.telegram.messenger.ns.i(textView3);
            textView3.setGravity(51);
            linearLayout.addView(textView3, c8.ja.t(-2, -2, 51, 23, 15, 23, 0));
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, org.telegram.messenger.g0.f1(), 83);
        layoutParams.bottomMargin = org.telegram.messenger.g0.L(130.0f);
        View view = new View(context);
        this.p1 = view;
        view.setBackgroundColor(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.V5, false));
        view.setAlpha(0.0f);
        view.setTag(1);
        m01Var.addView(view, layoutParams);
        hi.d dVar = new hi.d(context, null, true);
        File g11 = org.telegram.messenger.t0.a.g();
        if (g11 != null) {
            dVar.i(org.telegram.messenger.hd.a0(null, null, 2131754225, new Object[0]), false, true);
            dVar.setOnClickListener(new vv0(8, this, g11));
        } else {
            dVar.i(org.telegram.messenger.hd.a0(null, null, 2131754227, new Object[0]), false, true);
            dVar.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.y41
                public final /* synthetic */ a51 b;

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
        m01Var.addView(dVar, c8.ja.d(-1, 48.0f, 87, 20.0f, 0.0f, 20.0f, 60.0f));
        hi.d dVar2 = new hi.d(context, null, false);
        dVar2.i(org.telegram.messenger.hd.M0(2131754224, null), false, true);
        dVar2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.y41
            public final /* synthetic */ a51 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i10) {
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
        m01Var.addView(dVar2, c8.ja.d(-1, 48.0f, 87, 20.0f, 4.0f, 20.0f, 8.0f));
    }

    public static void I0(a51 a51Var) {
        View childAt = a51Var.q1.getChildAt(0);
        int[] iArr = a51Var.s1;
        childAt.getLocationInWindow(iArr);
        int max = Math.max(iArr[1] - org.telegram.messenger.g0.L(24.0f), 0);
        if (r0.getMeasuredHeight() + iArr[1] <= a51Var.b.getTranslationY() + (a51Var.c.getMeasuredHeight() - org.telegram.messenger.g0.L(113.0f))) {
            a51Var.J0(false);
        } else {
            a51Var.J0(true);
        }
        if (a51Var.r1 != max) {
            a51Var.r1 = max;
            a51Var.n1.invalidate();
        }
    }

    @Override // org.telegram.ui.ActionBar.u2
    public final boolean H() {
        return false;
    }

    public final void J0(boolean z10) {
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
        this.o1.addListener(new org.telegram.ui.nn(25, this, z10));
        this.o1.start();
    }
}
