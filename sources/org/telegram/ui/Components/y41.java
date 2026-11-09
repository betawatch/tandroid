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

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class y41 extends org.telegram.ui.ActionBar.v2 {
    public final Drawable i1;
    public final x41 j1;
    public AnimatorSet k1;
    public final View l1;
    public final LinearLayout m1;
    public int n1;
    public final int[] o1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y41(Context context, org.telegram.messenger.d1 d1Var) {
        super(context, false);
        final int i7 = 0;
        this.o1 = new int[2];
        setCanceledOnTouchOutside(false);
        this.u0 = false;
        this.v0 = false;
        Drawable h = jg.g.h(context, R.drawable.sheet_shadow_round);
        this.i1 = h;
        h.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.h5, false), PorterDuff.Mode.MULTIPLY));
        w41 w41Var = new w41(0, context, this);
        w41Var.setWillNotDraw(false);
        this.b = w41Var;
        x41 x41Var = new x41(this, context);
        this.j1 = x41Var;
        final int i10 = 1;
        x41Var.setFillViewport(true);
        x41Var.setWillNotDraw(false);
        x41Var.setClipToPadding(false);
        x41Var.setVerticalScrollBarEnabled(false);
        w41Var.addView(x41Var, c8.ha.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 130.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.m1 = linearLayout;
        linearLayout.setOrientation(1);
        x41Var.addView(linearLayout, c8.ha.x(-1, -2, 51));
        TextView textView = new TextView(context);
        org.telegram.messenger.camera.q.m(textView, 1, 20.0f);
        int i11 = org.telegram.ui.ActionBar.l6.j5;
        textView.setTextColor(org.telegram.ui.ActionBar.l6.x0(null, i11, false));
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setText(org.telegram.messenger.id.M0(2131754229, null));
        linearLayout.addView(textView, c8.ha.t(-2, -2, 49, 23, 16, 23, 0));
        TextView textView2 = new TextView(getContext());
        textView2.setTextColor(org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.r5, false));
        textView2.setTextSize(1, 14.0f);
        textView2.setMovementMethod(new org.telegram.messenger.c0(false));
        int i12 = org.telegram.ui.ActionBar.l6.k5;
        textView2.setLinkTextColor(org.telegram.ui.ActionBar.l6.x0(null, i12, false));
        textView2.setText(org.telegram.messenger.id.a0(null, null, 2131754242, d1Var.b, Integer.valueOf(d1Var.a)));
        textView2.setGravity(49);
        linearLayout.addView(textView2, c8.ha.t(-2, -2, 49, 23, 0, 23, 5));
        String str = d1Var.c;
        if (!TextUtils.isEmpty(str)) {
            TextView textView3 = new TextView(getContext());
            textView3.setTextColor(org.telegram.ui.ActionBar.l6.x0(null, i11, false));
            textView3.setTextSize(1, 14.0f);
            textView3.setMovementMethod(new org.telegram.messenger.c0(false));
            textView3.setLinkTextColor(org.telegram.ui.ActionBar.l6.x0(null, i12, false));
            textView3.setText(org.telegram.messenger.i6.m(str, textView3.getPaint().getFontMetricsInt(), false, null, 0));
            org.telegram.messenger.qs.i(textView3);
            textView3.setGravity(51);
            linearLayout.addView(textView3, c8.ha.t(-2, -2, 51, 23, 15, 23, 0));
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, org.telegram.messenger.g0.f1(), 83);
        layoutParams.bottomMargin = org.telegram.messenger.g0.L(130.0f);
        View view = new View(context);
        this.l1 = view;
        view.setBackgroundColor(org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.V5, false));
        view.setAlpha(0.0f);
        view.setTag(1);
        w41Var.addView(view, layoutParams);
        fi.d dVar = new fi.d(context, null, true);
        File g10 = org.telegram.messenger.t0.a.g();
        if (g10 != null) {
            dVar.i(org.telegram.messenger.id.a0(null, null, 2131754225, new Object[0]), false, true);
            dVar.setOnClickListener(new u41(i7, this, g10));
        } else {
            dVar.i(org.telegram.messenger.id.a0(null, null, 2131754227, new Object[0]), false, true);
            dVar.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.v41
                public final /* synthetic */ y41 b;

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
        w41Var.addView(dVar, c8.ha.d(-1, 48.0f, 87, 20.0f, 0.0f, 20.0f, 60.0f));
        fi.d dVar2 = new fi.d(context, null, false);
        dVar2.i(org.telegram.messenger.id.M0(2131754224, null), false, true);
        dVar2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.v41
            public final /* synthetic */ y41 b;

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
        w41Var.addView(dVar2, c8.ha.d(-1, 48.0f, 87, 20.0f, 4.0f, 20.0f, 8.0f));
    }

    public static void I0(y41 y41Var) {
        View childAt = y41Var.m1.getChildAt(0);
        int[] iArr = y41Var.o1;
        childAt.getLocationInWindow(iArr);
        int max = Math.max(iArr[1] - org.telegram.messenger.g0.L(24.0f), 0);
        if (r0.getMeasuredHeight() + iArr[1] <= y41Var.b.getTranslationY() + (y41Var.c.getMeasuredHeight() - org.telegram.messenger.g0.L(113.0f))) {
            y41Var.J0(false);
        } else {
            y41Var.J0(true);
        }
        if (y41Var.n1 != max) {
            y41Var.n1 = max;
            y41Var.j1.invalidate();
        }
    }

    @Override // org.telegram.ui.ActionBar.v2
    public final boolean G() {
        return false;
    }

    public final void J0(boolean z9) {
        View view = this.l1;
        if ((!z9 || view.getTag() == null) && (z9 || view.getTag() != null)) {
            return;
        }
        view.setTag(z9 ? null : 1);
        if (z9) {
            view.setVisibility(0);
        }
        AnimatorSet animatorSet = this.k1;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.k1 = animatorSet2;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, z9 ? 1.0f : 0.0f));
        this.k1.setDuration(150L);
        this.k1.addListener(new t9(24, this, z9));
        this.k1.start();
    }
}
