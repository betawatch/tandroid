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
import b8.mf;
import b8.pf;
import org.telegram.messenger.az;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hs;
import org.telegram.messenger.lc;
import org.telegram.ui.Components.xq;
import org.telegram.ui.i81;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class u5 extends FrameLayout {
    public final TextView a;
    public final FrameLayout b;
    public final FrameLayout c;
    public final FrameLayout d;
    public p0 e;
    public boolean f;
    public boolean h;
    public ValueAnimator n;

    public u5(Context context, String str) {
        super(context);
        ActivityManager activityManager;
        addView(new m5(context, str), mf.e(-1, -1, 17));
        FrameLayout frameLayout = new FrameLayout(context);
        this.b = frameLayout;
        frameLayout.setBackground(org.telegram.ui.ActionBar.k6.d0(org.telegram.messenger.g0.L(20.0f), -1));
        frameLayout.setCameraDistance(org.telegram.messenger.g0.L(8000.0f));
        addView(frameLayout, mf.d(hs.p3, 244.0f, 49, 0.0f, 22.0f, 0.0f, 0.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.c = frameLayout2;
        frameLayout.addView(frameLayout2, mf.c(-1.0f, -1));
        FrameLayout frameLayout3 = new FrameLayout(context);
        frameLayout2.addView(frameLayout3, mf.d(hs.u2, 164.0f, 49, 0.0f, 24.0f, 0.0f, 0.0f));
        final int i3 = 0;
        bi.e c2 = bi.f.c("ton://transfer/".concat(str), 768, dc.b.d, 1.0f, new ColorDrawable(0));
        frameLayout3.addView(new ei.e3(context, c2), mf.c(-1.0f, -1));
        float f10 = c2 == null ? 0.0f : c2.l / c2.b;
        if (f10 > 0.0f) {
            if (az.o() == 0 || lc.f() || (activityManager = (ActivityManager) context.getSystemService("activity")) == null || activityManager.getDeviceConfigurationInfo().reqGlEsVersion < 196608) {
                ImageView imageView = new ImageView(context);
                imageView.setScaleType(ImageView.ScaleType.FIT_XY);
                imageView.setImageResource(R.drawable.mini_gram_72);
                int round = Math.round(f10 * 164.0f);
                frameLayout3.addView(imageView, mf.e(round, round, 17));
            } else {
                int round2 = Math.round(f10 * 164.0f * 1.35f);
                frameLayout3.addView(new o8(context), mf.e(round2, round2, 17));
            }
        }
        TextView textView = new TextView(context);
        this.a = textView;
        textView.setText(bd.M0(2131743162, null));
        textView.setTextColor(-15556886);
        textView.setTextSize(1, 14.0f);
        textView.setGravity(17);
        textView.setCompoundDrawablePadding(org.telegram.messenger.g0.L(4.0f));
        textView.setTypeface(org.telegram.messenger.g0.o1("fonts/rmedium.ttf"));
        textView.setPadding(org.telegram.messenger.g0.L(10.0f), 0, org.telegram.messenger.g0.L(12.0f), 0);
        int L = org.telegram.messenger.g0.L(18.0f);
        textView.setBackground(org.telegram.ui.ActionBar.k6.k0(L, L, L, L, -984578, -1903620, -1903620));
        Drawable g7 = k2.p1.g(context, R.drawable.wallet_copy);
        g7.setColorFilter(new PorterDuffColorFilter(-15556886, PorterDuff.Mode.SRC_IN));
        g7.setBounds(0, 0, org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(14.0f));
        textView.setCompoundDrawables(g7, null, null, null);
        pf.a(textView);
        frameLayout2.addView(textView, mf.d(-2, 28.0f, 49, 0.0f, 202.0f, 0.0f, 0.0f));
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.d = frameLayout4;
        frameLayout4.setVisibility(4);
        frameLayout4.setRotationY(180.0f);
        frameLayout.addView(frameLayout4, mf.c(-1.0f, -1));
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
        textView2.setTypeface(w5.r0(context));
        textView2.setGravity(17);
        textView2.setIncludeFontPadding(false);
        textView2.setMaxLines(4);
        textView2.setLineSpacing(0.0f, 1.0f);
        TextView m10 = org.telegram.ui.Cells.f1.m(this.d, textView2, mf.d(-1, 112.0f, 55, 8.0f, 32.0f, 8.0f, 0.0f), context);
        m10.setText(bd.M0(2131743210, null));
        m10.setTextColor(-15556886);
        m10.setTextSize(1, 14.0f);
        m10.setTypeface(org.telegram.messenger.g0.o1("fonts/rmedium.ttf"));
        m10.setGravity(17);
        m10.setCompoundDrawablePadding(org.telegram.messenger.g0.L(3.0f));
        Drawable mutate = context.getResources().getDrawable(R.drawable.msg_text_check).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(-15556886, PorterDuff.Mode.SRC_IN));
        mutate.setBounds(0, 0, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f));
        m10.setCompoundDrawables(mutate, null, null, null);
        TextView m11 = org.telegram.ui.Cells.f1.m(this.d, m10, mf.d(-2, 28.0f, 49, 0.0f, 149.0f, 0.0f, 0.0f), context);
        m11.setText(bd.M0(2131743023, null));
        m11.setTextColor(-15556886);
        m11.setTextSize(1, 14.0f);
        m11.setTypeface(org.telegram.messenger.g0.o1("fonts/rmedium.ttf"));
        m11.setGravity(17);
        m11.setPadding(org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), 0);
        int L2 = org.telegram.messenger.g0.L(18.0f);
        m11.setBackground(org.telegram.ui.ActionBar.k6.k0(L2, L2, L2, L2, -984578, -1903620, -1903620));
        pf.a(m11);
        this.d.addView(m11, mf.d(-2, 28.0f, 49, 0.0f, 202.0f, 0.0f, 0.0f));
        View.OnClickListener onClickListener = new View.OnClickListener(this) { // from class: org.telegram.ui.Wallet.t5
            public final /* synthetic */ u5 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i3) {
                    case 0:
                        u5 u5Var = this.b;
                        if (!u5Var.f && !u5Var.h) {
                            p0 p0Var = u5Var.e;
                            if (p0Var != null) {
                                p0Var.run();
                            }
                            u5Var.a(true);
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
        m11.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Wallet.t5
            public final /* synthetic */ u5 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i13) {
                    case 0:
                        u5 u5Var = this.b;
                        if (!u5Var.f && !u5Var.h) {
                            p0 p0Var = u5Var.e;
                            if (p0Var != null) {
                                p0Var.run();
                            }
                            u5Var.a(true);
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
        if (this.f == z10 || this.h) {
            return;
        }
        this.h = true;
        this.f = z10;
        FrameLayout frameLayout = this.b;
        int i3 = 2;
        frameLayout.setLayerType(2, null);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(frameLayout.getRotationY(), z10 ? 180.0f : 0.0f);
        this.n = ofFloat;
        ofFloat.setDuration(420L);
        this.n.setInterpolator(xq.h);
        this.n.addUpdateListener(new p3(this, i3));
        this.n.addListener(new i81(this, 7));
        this.n.start();
    }
}
