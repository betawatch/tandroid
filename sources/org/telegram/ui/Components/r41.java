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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class r41 extends org.telegram.ui.ActionBar.t2 {
    public final Drawable j1;
    public final q41 k1;
    public AnimatorSet l1;
    public final View m1;
    public final LinearLayout n1;
    public int o1;
    public final int[] p1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r41(Context context, org.telegram.messenger.d1 d1Var) {
        super(context, false);
        final int i3 = 0;
        this.p1 = new int[2];
        setCanceledOnTouchOutside(false);
        this.v0 = false;
        this.w0 = false;
        Drawable g7 = k2.p1.g(context, R.drawable.sheet_shadow_round);
        this.j1 = g7;
        g7.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.h5, false), PorterDuff.Mode.MULTIPLY));
        kw0 kw0Var = new kw0(2, context, this);
        kw0Var.setWillNotDraw(false);
        this.b = kw0Var;
        q41 q41Var = new q41(this, context);
        this.k1 = q41Var;
        final int i10 = 1;
        q41Var.setFillViewport(true);
        q41Var.setWillNotDraw(false);
        q41Var.setClipToPadding(false);
        q41Var.setVerticalScrollBarEnabled(false);
        kw0Var.addView(q41Var, b8.mf.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 130.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.n1 = linearLayout;
        linearLayout.setOrientation(1);
        q41Var.addView(linearLayout, b8.mf.x(-1, -2, 51));
        TextView textView = new TextView(context);
        org.telegram.messenger.camera.q.m(textView, 1, 20.0f);
        int i11 = org.telegram.ui.ActionBar.k6.j5;
        textView.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, i11, false));
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setText(org.telegram.messenger.bd.M0(2131754229, null));
        linearLayout.addView(textView, b8.mf.t(-2, -2, 49, 23, 16, 23, 0));
        TextView textView2 = new TextView(getContext());
        textView2.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.r5, false));
        textView2.setTextSize(1, 14.0f);
        textView2.setMovementMethod(new org.telegram.messenger.c0(false));
        int i12 = org.telegram.ui.ActionBar.k6.k5;
        textView2.setLinkTextColor(org.telegram.ui.ActionBar.k6.x0(null, i12, false));
        textView2.setText(org.telegram.messenger.bd.a0(null, null, 2131754242, d1Var.a, Integer.valueOf(d1Var.c)));
        textView2.setGravity(49);
        linearLayout.addView(textView2, b8.mf.t(-2, -2, 49, 23, 0, 23, 5));
        String str = d1Var.b;
        if (!TextUtils.isEmpty(str)) {
            TextView textView3 = new TextView(getContext());
            textView3.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, i11, false));
            textView3.setTextSize(1, 14.0f);
            textView3.setMovementMethod(new org.telegram.messenger.c0(false));
            textView3.setLinkTextColor(org.telegram.ui.ActionBar.k6.x0(null, i12, false));
            textView3.setText(org.telegram.messenger.i6.m(str, textView3.getPaint().getFontMetricsInt(), false, null, 0));
            org.telegram.messenger.hs.i(textView3);
            textView3.setGravity(51);
            linearLayout.addView(textView3, b8.mf.t(-2, -2, 51, 23, 15, 23, 0));
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, org.telegram.messenger.g0.f1(), 83);
        layoutParams.bottomMargin = org.telegram.messenger.g0.L(130.0f);
        View view = new View(context);
        this.m1 = view;
        view.setBackgroundColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.V5, false));
        view.setAlpha(0.0f);
        view.setTag(1);
        kw0Var.addView(view, layoutParams);
        gi.d dVar = new gi.d(context, null, true);
        File g10 = org.telegram.messenger.t0.a.g();
        if (g10 != null) {
            dVar.i(org.telegram.messenger.bd.a0(null, null, 2131754225, new Object[0]), false, true);
            dVar.setOnClickListener(new ux0(6, (Object) this, (Object) g10));
        } else {
            dVar.i(org.telegram.messenger.bd.a0(null, null, 2131754227, new Object[0]), false, true);
            dVar.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.p41
                public final /* synthetic */ r41 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    switch (i3) {
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
        kw0Var.addView(dVar, b8.mf.d(-1, 48.0f, 87, 20.0f, 0.0f, 20.0f, 60.0f));
        gi.d dVar2 = new gi.d(context, null, false);
        dVar2.i(org.telegram.messenger.bd.M0(2131754224, null), false, true);
        dVar2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.p41
            public final /* synthetic */ r41 b;

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
        kw0Var.addView(dVar2, b8.mf.d(-1, 48.0f, 87, 20.0f, 4.0f, 20.0f, 8.0f));
    }

    public static void I0(r41 r41Var) {
        View childAt = r41Var.n1.getChildAt(0);
        int[] iArr = r41Var.p1;
        childAt.getLocationInWindow(iArr);
        int max = Math.max(iArr[1] - org.telegram.messenger.g0.L(24.0f), 0);
        if (r0.getMeasuredHeight() + iArr[1] <= r41Var.b.getTranslationY() + (r41Var.c.getMeasuredHeight() - org.telegram.messenger.g0.L(113.0f))) {
            r41Var.J0(false);
        } else {
            r41Var.J0(true);
        }
        if (r41Var.o1 != max) {
            r41Var.o1 = max;
            r41Var.k1.invalidate();
        }
    }

    @Override // org.telegram.ui.ActionBar.t2
    public final boolean G() {
        return false;
    }

    public final void J0(boolean z10) {
        View view = this.m1;
        if ((!z10 || view.getTag() == null) && (z10 || view.getTag() != null)) {
            return;
        }
        view.setTag(z10 ? null : 1);
        if (z10) {
            view.setVisibility(0);
        }
        AnimatorSet animatorSet = this.l1;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.l1 = animatorSet2;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, z10 ? 1.0f : 0.0f));
        this.l1.setDuration(150L);
        this.l1.addListener(new s9(24, this, z10));
        this.l1.start();
    }
}
