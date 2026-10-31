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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class a61 extends org.telegram.ui.ActionBar.z2 {
    public final Drawable i1;
    public final z51 j1;
    public AnimatorSet k1;
    public final View l1;
    public final LinearLayout m1;
    public int n1;
    public final int[] o1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a61(Context context, org.telegram.messenger.g1 g1Var) {
        super(context, false);
        final int i10 = 0;
        this.o1 = new int[2];
        setCanceledOnTouchOutside(false);
        this.u0 = false;
        this.v0 = false;
        Drawable f7 = i0.a.f(context, R.drawable.sheet_shadow_round);
        this.i1 = f7;
        f7.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.h5, false), PorterDuff.Mode.MULTIPLY));
        jg.l0 l0Var = new jg.l0(this, context, 29);
        l0Var.setWillNotDraw(false);
        this.b = l0Var;
        z51 z51Var = new z51(this, context);
        this.j1 = z51Var;
        final int i11 = 1;
        z51Var.setFillViewport(true);
        z51Var.setWillNotDraw(false);
        z51Var.setClipToPadding(false);
        z51Var.setVerticalScrollBarEnabled(false);
        l0Var.addView(z51Var, w7.b6.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 130.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.m1 = linearLayout;
        linearLayout.setOrientation(1);
        z51Var.addView(linearLayout, w7.b6.x(-1, -2, 51));
        TextView textView = new TextView(context);
        org.telegram.messenger.z20.n(textView, 1, 20.0f);
        int i12 = org.telegram.ui.ActionBar.t6.j5;
        textView.setTextColor(org.telegram.ui.ActionBar.t6.x0(null, i12, false));
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setText(org.telegram.messenger.cd.L0(2131754229, null));
        linearLayout.addView(textView, w7.b6.t(-2, -2, 49, 23, 16, 23, 0));
        TextView textView2 = new TextView(getContext());
        textView2.setTextColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.r5, false));
        textView2.setTextSize(1, 14.0f);
        textView2.setMovementMethod(new org.telegram.messenger.e0(false));
        int i13 = org.telegram.ui.ActionBar.t6.k5;
        textView2.setLinkTextColor(org.telegram.ui.ActionBar.t6.x0(null, i13, false));
        textView2.setText(org.telegram.messenger.cd.a0(null, null, 2131754242, g1Var.a, Integer.valueOf(g1Var.c)));
        textView2.setGravity(49);
        linearLayout.addView(textView2, w7.b6.t(-2, -2, 49, 23, 0, 23, 5));
        String str = g1Var.b;
        if (!TextUtils.isEmpty(str)) {
            TextView textView3 = new TextView(getContext());
            textView3.setTextColor(org.telegram.ui.ActionBar.t6.x0(null, i12, false));
            textView3.setTextSize(1, 14.0f);
            textView3.setMovementMethod(new org.telegram.messenger.e0(false));
            textView3.setLinkTextColor(org.telegram.ui.ActionBar.t6.x0(null, i13, false));
            textView3.setText(org.telegram.messenger.k6.m(str, textView3.getPaint().getFontMetricsInt(), false, null, 0));
            org.telegram.messenger.zs.i(textView3);
            textView3.setGravity(51);
            linearLayout.addView(textView3, w7.b6.t(-2, -2, 51, 23, 15, 23, 0));
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, org.telegram.messenger.i0.f1(), 83);
        layoutParams.bottomMargin = org.telegram.messenger.i0.L(130.0f);
        View view = new View(context);
        this.l1 = view;
        view.setBackgroundColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.V5, false));
        view.setAlpha(0.0f);
        view.setTag(1);
        l0Var.addView(view, layoutParams);
        vh.d dVar = new vh.d(context, null, true);
        File g10 = org.telegram.messenger.w0.a.g();
        if (g10 != null) {
            dVar.i(org.telegram.messenger.cd.a0(null, null, 2131754225, new Object[0]), false, true);
            dVar.setOnClickListener(new sr(23, this, g10));
        } else {
            dVar.i(org.telegram.messenger.cd.a0(null, null, 2131754227, new Object[0]), false, true);
            dVar.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.y51
                public final /* synthetic */ a61 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    switch (i10) {
                        case 0:
                            if (((ApplicationLoaderImpl) org.telegram.messenger.w0.a).q()) {
                                org.telegram.messenger.k1.e().b(false);
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
        l0Var.addView(dVar, w7.b6.d(-1, 48.0f, 87, 20.0f, 0.0f, 20.0f, 60.0f));
        vh.d dVar2 = new vh.d(context, null, false);
        dVar2.i(org.telegram.messenger.cd.L0(2131754224, null), false, true);
        dVar2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.y51
            public final /* synthetic */ a61 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i11) {
                    case 0:
                        if (((ApplicationLoaderImpl) org.telegram.messenger.w0.a).q()) {
                            org.telegram.messenger.k1.e().b(false);
                        }
                        this.b.dismiss();
                        break;
                    default:
                        this.b.dismiss();
                        break;
                }
            }
        });
        l0Var.addView(dVar2, w7.b6.d(-1, 48.0f, 87, 20.0f, 4.0f, 20.0f, 8.0f));
    }

    public static void I0(a61 a61Var) {
        View childAt = a61Var.m1.getChildAt(0);
        int[] iArr = a61Var.o1;
        childAt.getLocationInWindow(iArr);
        int max = Math.max(iArr[1] - org.telegram.messenger.i0.L(24.0f), 0);
        if (r0.getMeasuredHeight() + iArr[1] <= a61Var.b.getTranslationY() + (a61Var.c.getMeasuredHeight() - org.telegram.messenger.i0.L(113.0f))) {
            a61Var.J0(false);
        } else {
            a61Var.J0(true);
        }
        if (a61Var.n1 != max) {
            a61Var.n1 = max;
            a61Var.j1.invalidate();
        }
    }

    @Override // org.telegram.ui.ActionBar.z2
    public final boolean H() {
        return false;
    }

    public final void J0(boolean z10) {
        View view = this.l1;
        if ((!z10 || view.getTag() == null) && (z10 || view.getTag() != null)) {
            return;
        }
        view.setTag(z10 ? null : 1);
        if (z10) {
            view.setVisibility(0);
        }
        AnimatorSet animatorSet = this.k1;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.k1 = animatorSet2;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, z10 ? 1.0f : 0.0f));
        this.k1.setDuration(150L);
        this.k1.addListener(new ha0(10, this, z10));
        this.k1.start();
    }
}
