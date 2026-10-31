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
import org.telegram.messenger.cd;
import org.telegram.messenger.sc;
import org.telegram.messenger.tz;
import org.telegram.messenger.zs;
import org.telegram.ui.Components.gr;
import org.telegram.ui.ns0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class z5 extends FrameLayout {
    public final TextView a;
    public final FrameLayout b;
    public final FrameLayout c;
    public final FrameLayout d;
    public q0 e;
    public boolean f;
    public boolean h;
    public ValueAnimator n;

    public z5(Context context, String str) {
        super(context);
        ActivityManager activityManager;
        addView(new q5(context, str), w7.b6.e(-1, -1, 17));
        FrameLayout frameLayout = new FrameLayout(context);
        this.b = frameLayout;
        frameLayout.setBackground(org.telegram.ui.ActionBar.t6.d0(org.telegram.messenger.i0.L(20.0f), -1));
        frameLayout.setCameraDistance(org.telegram.messenger.i0.L(8000.0f));
        addView(frameLayout, w7.b6.d(zs.p3, 244.0f, 49, 0.0f, 22.0f, 0.0f, 0.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.c = frameLayout2;
        frameLayout.addView(frameLayout2, w7.b6.c(-1.0f, -1));
        FrameLayout frameLayout3 = new FrameLayout(context);
        frameLayout2.addView(frameLayout3, w7.b6.d(zs.u2, 164.0f, 49, 0.0f, 24.0f, 0.0f, 0.0f));
        final int i10 = 0;
        qh.f c10 = qh.g.c("ton://transfer/".concat(str), 768, ac.d.d, 1.0f, new ColorDrawable(0));
        frameLayout3.addView(new ih.c(context, c10), w7.b6.c(-1.0f, -1));
        float f7 = c10 == null ? 0.0f : c10.l / c10.b;
        if (f7 > 0.0f) {
            if (tz.o() == 0 || sc.f() || (activityManager = (ActivityManager) context.getSystemService("activity")) == null || activityManager.getDeviceConfigurationInfo().reqGlEsVersion < 196608) {
                ImageView imageView = new ImageView(context);
                imageView.setScaleType(ImageView.ScaleType.FIT_XY);
                imageView.setImageResource(R.drawable.mini_gram_72);
                int round = Math.round(f7 * 164.0f);
                frameLayout3.addView(imageView, w7.b6.e(round, round, 17));
            } else {
                int round2 = Math.round(f7 * 164.0f * 1.35f);
                frameLayout3.addView(new u8(context), w7.b6.e(round2, round2, 17));
            }
        }
        TextView textView = new TextView(context);
        this.a = textView;
        textView.setText(cd.L0(2131743178, null));
        textView.setTextColor(-15556886);
        textView.setTextSize(1, 14.0f);
        textView.setGravity(17);
        textView.setCompoundDrawablePadding(org.telegram.messenger.i0.L(4.0f));
        textView.setTypeface(org.telegram.messenger.i0.o1("fonts/rmedium.ttf"));
        textView.setPadding(org.telegram.messenger.i0.L(10.0f), 0, org.telegram.messenger.i0.L(12.0f), 0);
        int L = org.telegram.messenger.i0.L(18.0f);
        textView.setBackground(org.telegram.ui.ActionBar.t6.k0(L, L, L, L, -984578, -1903620, -1903620));
        Drawable f10 = i0.a.f(context, R.drawable.wallet_copy);
        f10.setColorFilter(new PorterDuffColorFilter(-15556886, PorterDuff.Mode.SRC_IN));
        f10.setBounds(0, 0, org.telegram.messenger.i0.L(14.0f), org.telegram.messenger.i0.L(14.0f));
        textView.setCompoundDrawables(f10, null, null, null);
        w7.e6.a(textView);
        frameLayout2.addView(textView, w7.b6.d(-2, 28.0f, 49, 0.0f, 202.0f, 0.0f, 0.0f));
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.d = frameLayout4;
        frameLayout4.setVisibility(4);
        frameLayout4.setRotationY(180.0f);
        frameLayout.addView(frameLayout4, w7.b6.c(-1.0f, -1));
        TextView textView2 = new TextView(context);
        String replace = str.replace(" ", "");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int i11 = 0;
        int i12 = 0;
        while (i11 < replace.length()) {
            if (i12 > 0) {
                spannableStringBuilder.append(i12 % 3 == 0 ? '\n' : ' ');
            }
            int length = spannableStringBuilder.length();
            int i13 = i11 + 4;
            spannableStringBuilder.append((CharSequence) replace, i11, Math.min(i13, replace.length()));
            if ((i12 & 1) != 0) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(-7434605), length, spannableStringBuilder.length(), 33);
            }
            i12++;
            i11 = i13;
        }
        textView2.setText(spannableStringBuilder);
        textView2.setTextColor(-16777216);
        textView2.setTextSize(1, 18.0f);
        textView2.setTypeface(b6.q0(context));
        textView2.setGravity(17);
        textView2.setIncludeFontPadding(false);
        textView2.setMaxLines(4);
        textView2.setLineSpacing(0.0f, 1.0f);
        TextView l4 = org.telegram.ui.Cells.f1.l(this.d, textView2, w7.b6.d(-1, 112.0f, 55, 8.0f, 32.0f, 8.0f, 0.0f), context);
        l4.setText(cd.L0(2131743226, null));
        l4.setTextColor(-15556886);
        l4.setTextSize(1, 14.0f);
        l4.setTypeface(org.telegram.messenger.i0.o1("fonts/rmedium.ttf"));
        l4.setGravity(17);
        l4.setCompoundDrawablePadding(org.telegram.messenger.i0.L(3.0f));
        Drawable mutate = context.getResources().getDrawable(R.drawable.msg_text_check).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(-15556886, PorterDuff.Mode.SRC_IN));
        mutate.setBounds(0, 0, org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(16.0f));
        l4.setCompoundDrawables(mutate, null, null, null);
        TextView l10 = org.telegram.ui.Cells.f1.l(this.d, l4, w7.b6.d(-2, 28.0f, 49, 0.0f, 149.0f, 0.0f, 0.0f), context);
        l10.setText(cd.L0(2131743039, null));
        l10.setTextColor(-15556886);
        l10.setTextSize(1, 14.0f);
        l10.setTypeface(org.telegram.messenger.i0.o1("fonts/rmedium.ttf"));
        l10.setGravity(17);
        l10.setPadding(org.telegram.messenger.i0.L(12.0f), 0, org.telegram.messenger.i0.L(12.0f), 0);
        int L2 = org.telegram.messenger.i0.L(18.0f);
        l10.setBackground(org.telegram.ui.ActionBar.t6.k0(L2, L2, L2, L2, -984578, -1903620, -1903620));
        w7.e6.a(l10);
        this.d.addView(l10, w7.b6.d(-2, 28.0f, 49, 0.0f, 202.0f, 0.0f, 0.0f));
        View.OnClickListener onClickListener = new View.OnClickListener(this) { // from class: org.telegram.ui.Wallet.y5
            public final /* synthetic */ z5 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        z5 z5Var = this.b;
                        if (!z5Var.f && !z5Var.h) {
                            q0 q0Var = z5Var.e;
                            if (q0Var != null) {
                                q0Var.run();
                            }
                            z5Var.a(true);
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
        final int i14 = 1;
        l10.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Wallet.y5
            public final /* synthetic */ z5 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i14) {
                    case 0:
                        z5 z5Var = this.b;
                        if (!z5Var.f && !z5Var.h) {
                            q0 q0Var = z5Var.e;
                            if (q0Var != null) {
                                q0Var.run();
                            }
                            z5Var.a(true);
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
        int i10 = 2;
        frameLayout.setLayerType(2, null);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(frameLayout.getRotationY(), z10 ? 180.0f : 0.0f);
        this.n = ofFloat;
        ofFloat.setDuration(420L);
        this.n.setInterpolator(gr.h);
        this.n.addUpdateListener(new r3(this, i10));
        this.n.addListener(new ns0(this, 18));
        this.n.start();
    }
}
