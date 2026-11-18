package org.telegram.ui.Wallet;

import android.animation.ValueAnimator;
import android.app.ActivityManager;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.bz;
import org.telegram.messenger.gd;
import org.telegram.messenger.ks;
import org.telegram.messenger.pc;
import org.telegram.ui.Components.lr;
import org.telegram.ui.k71;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes4.dex */
public final class l6 extends FrameLayout {
    public final TextView a;
    public final TextView b;
    public final FrameLayout c;
    public final FrameLayout d;
    public final FrameLayout e;
    public a1 f;
    public boolean h;
    public boolean n;
    public ValueAnimator r;

    public l6(Context context, String str) {
        super(context);
        ActivityManager activityManager;
        addView(new d6(context, str), c8.ma.e(-1, -1, 17));
        FrameLayout frameLayout = new FrameLayout(context);
        this.c = frameLayout;
        frameLayout.setBackground(org.telegram.ui.ActionBar.n6.d0(org.telegram.messenger.g0.L(20.0f), -1));
        frameLayout.setCameraDistance(org.telegram.messenger.g0.L(8000.0f));
        addView(frameLayout, c8.ma.d(ks.p3, 244.0f, 49, 0.0f, 22.0f, 0.0f, 0.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.d = frameLayout2;
        frameLayout.addView(frameLayout2, c8.ma.c(-1.0f, -1));
        FrameLayout frameLayout3 = new FrameLayout(context);
        frameLayout2.addView(frameLayout3, c8.ma.d(ks.u2, 164.0f, 49, 0.0f, 24.0f, 0.0f, 0.0f));
        final int i7 = 0;
        ci.e c10 = ci.f.c("ton://transfer/".concat(str), 768, gc.b.d, 1.0f, new ColorDrawable(0));
        frameLayout3.addView(new fi.u2(context, c10), c8.ma.c(-1.0f, -1));
        float f10 = c10 == null ? 0.0f : c10.l / c10.b;
        if (f10 > 0.0f) {
            if (bz.o() == 0 || pc.f() || (activityManager = (ActivityManager) context.getSystemService("activity")) == null || activityManager.getDeviceConfigurationInfo().reqGlEsVersion < 196608) {
                ImageView imageView = new ImageView(context);
                imageView.setScaleType(ImageView.ScaleType.FIT_XY);
                imageView.setImageResource(R.drawable.mini_gram_72);
                int round = Math.round(f10 * 164.0f);
                frameLayout3.addView(imageView, c8.ma.e(round, round, 17));
            } else {
                int round2 = Math.round(f10 * 164.0f * 1.35f);
                frameLayout3.addView(new e9(context), c8.ma.e(round2, round2, 17));
            }
        }
        TextView textView = new TextView(context);
        this.a = textView;
        textView.setText(gd.M0(2131742914, null));
        textView.setTextColor(-15556886);
        textView.setTextSize(1, 14.0f);
        textView.setGravity(17);
        textView.setCompoundDrawablePadding(org.telegram.messenger.g0.L(4.0f));
        textView.setTypeface(org.telegram.messenger.g0.o1("fonts/rmedium.ttf"));
        textView.setPadding(org.telegram.messenger.g0.L(10.0f), 0, org.telegram.messenger.g0.L(12.0f), 0);
        int L = org.telegram.messenger.g0.L(18.0f);
        textView.setBackground(org.telegram.ui.ActionBar.n6.k0(L, L, L, L, -984578, -1903620, -1903620));
        Drawable g10 = i5.c.g(context, R.drawable.wallet_copy);
        g10.setColorFilter(new PorterDuffColorFilter(-15556886, PorterDuff.Mode.SRC_IN));
        g10.setBounds(0, 0, org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(14.0f));
        textView.setCompoundDrawables(g10, null, null, null);
        c8.ra.a(textView);
        frameLayout2.addView(textView, c8.ma.d(-2, 28.0f, 49, 0.0f, 202.0f, 0.0f, 0.0f));
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.e = frameLayout4;
        frameLayout4.setVisibility(4);
        frameLayout4.setRotationY(180.0f);
        frameLayout.addView(frameLayout4, c8.ma.c(-1.0f, -1));
        TextView textView2 = new TextView(context);
        String replace = str.replace(" ", "");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int i10 = 0;
        int i11 = 0;
        while (i10 < replace.length()) {
            if (i11 > 0) {
                spannableStringBuilder.append(i11 % 3 == 0 ? '\n' : ' ');
            }
            int length = spannableStringBuilder.length();
            int i12 = i10 + 4;
            spannableStringBuilder.append((CharSequence) replace, i10, Math.min(i12, replace.length()));
            if ((i11 & 1) != 0) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(-7434605), length, spannableStringBuilder.length(), 33);
            }
            i11++;
            i10 = i12;
        }
        textView2.setText(spannableStringBuilder);
        textView2.setTextColor(-16777216);
        textView2.setTextSize(1, 18.0f);
        textView2.setTypeface(n6.s0(context));
        textView2.setGravity(17);
        textView2.setIncludeFontPadding(false);
        textView2.setMaxLines(4);
        textView2.setLineSpacing(0.0f, 1.0f);
        TextView m10 = org.telegram.ui.Cells.c0.m(this.e, textView2, c8.ma.d(-1, 112.0f, 55, 8.0f, 32.0f, 8.0f, 0.0f), context);
        m10.setText(gd.M0(2131742962, null));
        m10.setTextColor(-15556886);
        m10.setTextSize(1, 14.0f);
        m10.setTypeface(org.telegram.messenger.g0.o1("fonts/rmedium.ttf"));
        m10.setGravity(17);
        m10.setCompoundDrawablePadding(org.telegram.messenger.g0.L(3.0f));
        Drawable mutate = context.getResources().getDrawable(R.drawable.msg_text_check).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(-15556886, PorterDuff.Mode.SRC_IN));
        mutate.setBounds(0, 0, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f));
        m10.setCompoundDrawables(mutate, null, null, null);
        TextView m11 = org.telegram.ui.Cells.c0.m(this.e, m10, c8.ma.d(-2, 28.0f, 49, 0.0f, 149.0f, 0.0f, 0.0f), context);
        this.b = m11;
        m11.setText(gd.M0(2131742755, null));
        m11.setTextColor(-15556886);
        m11.setTextSize(1, 14.0f);
        m11.setTypeface(org.telegram.messenger.g0.o1("fonts/rmedium.ttf"));
        m11.setGravity(17);
        m11.setPadding(org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), 0);
        int L2 = org.telegram.messenger.g0.L(18.0f);
        m11.setBackground(org.telegram.ui.ActionBar.n6.k0(L2, L2, L2, L2, -984578, -1903620, -1903620));
        c8.ra.a(m11);
        this.e.addView(m11, c8.ma.d(-2, 28.0f, 49, 0.0f, 202.0f, 0.0f, 0.0f));
        View.OnClickListener onClickListener = new View.OnClickListener(this) { // from class: org.telegram.ui.Wallet.k6
            public final /* synthetic */ l6 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i7) {
                    case 0:
                        l6 l6Var = this.b;
                        if (!l6Var.h && !l6Var.n) {
                            a1 a1Var = l6Var.f;
                            if (a1Var != null) {
                                a1Var.run();
                            }
                            l6Var.a(true);
                            break;
                        }
                        break;
                    default:
                        this.b.a(false);
                        break;
                }
            }
        };
        frameLayout3.setOnClickListener(onClickListener);
        this.a.setOnClickListener(onClickListener);
        final int i13 = 1;
        m11.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Wallet.k6
            public final /* synthetic */ l6 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i13) {
                    case 0:
                        l6 l6Var = this.b;
                        if (!l6Var.h && !l6Var.n) {
                            a1 a1Var = l6Var.f;
                            if (a1Var != null) {
                                a1Var.run();
                            }
                            l6Var.a(true);
                            break;
                        }
                        break;
                    default:
                        this.b.a(false);
                        break;
                }
            }
        });
    }

    public final void a(boolean z10) {
        if (this.h == z10 || this.n) {
            return;
        }
        this.n = true;
        this.h = z10;
        FrameLayout frameLayout = this.c;
        int i7 = 2;
        frameLayout.setLayerType(2, null);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(frameLayout.getRotationY(), z10 ? 180.0f : 0.0f);
        this.r = ofFloat;
        ofFloat.setDuration(420L);
        this.r.setInterpolator(lr.h);
        this.r.addUpdateListener(new z3(this, i7));
        this.r.addListener(new k71(this, 8));
        this.r.start();
    }
}
