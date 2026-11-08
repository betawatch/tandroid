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
import org.telegram.messenger.id;
import org.telegram.messenger.iz;
import org.telegram.messenger.qs;
import org.telegram.messenger.sc;
import org.telegram.ui.Components.xq;
import org.telegram.ui.s81;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes4.dex */
public final class v5 extends FrameLayout {
    public final TextView a;
    public final FrameLayout b;
    public final FrameLayout c;
    public final FrameLayout d;
    public r0 e;
    public boolean f;
    public boolean h;
    public ValueAnimator n;

    public v5(Context context, String str) {
        super(context);
        ActivityManager activityManager;
        addView(new n5(context, str), c8.ha.e(-1, -1, 17));
        FrameLayout frameLayout = new FrameLayout(context);
        this.b = frameLayout;
        frameLayout.setBackground(org.telegram.ui.ActionBar.k6.d0(org.telegram.messenger.g0.L(20.0f), -1));
        frameLayout.setCameraDistance(org.telegram.messenger.g0.L(8000.0f));
        addView(frameLayout, c8.ha.d(qs.p3, 244.0f, 49, 0.0f, 22.0f, 0.0f, 0.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.c = frameLayout2;
        frameLayout.addView(frameLayout2, c8.ha.c(-1.0f, -1));
        FrameLayout frameLayout3 = new FrameLayout(context);
        frameLayout2.addView(frameLayout3, c8.ha.d(qs.u2, 164.0f, 49, 0.0f, 24.0f, 0.0f, 0.0f));
        final int i7 = 0;
        ai.g c10 = ai.h.c("ton://transfer/".concat(str), 768, gc.b.d, 1.0f, new ColorDrawable(0));
        frameLayout3.addView(new di.b3(context, c10), c8.ha.c(-1.0f, -1));
        float f10 = c10 == null ? 0.0f : c10.l / c10.b;
        if (f10 > 0.0f) {
            if (iz.o() == 0 || sc.f() || (activityManager = (ActivityManager) context.getSystemService("activity")) == null || activityManager.getDeviceConfigurationInfo().reqGlEsVersion < 196608) {
                ImageView imageView = new ImageView(context);
                imageView.setScaleType(ImageView.ScaleType.FIT_XY);
                imageView.setImageResource(R.drawable.mini_gram_72);
                int round = Math.round(f10 * 164.0f);
                frameLayout3.addView(imageView, c8.ha.e(round, round, 17));
            } else {
                int round2 = Math.round(f10 * 164.0f * 1.35f);
                frameLayout3.addView(new o8(context), c8.ha.e(round2, round2, 17));
            }
        }
        TextView textView = new TextView(context);
        this.a = textView;
        textView.setText(id.M0(2131743155, null));
        textView.setTextColor(-15556886);
        textView.setTextSize(1, 14.0f);
        textView.setGravity(17);
        textView.setCompoundDrawablePadding(org.telegram.messenger.g0.L(4.0f));
        textView.setTypeface(org.telegram.messenger.g0.o1("fonts/rmedium.ttf"));
        textView.setPadding(org.telegram.messenger.g0.L(10.0f), 0, org.telegram.messenger.g0.L(12.0f), 0);
        int L = org.telegram.messenger.g0.L(18.0f);
        textView.setBackground(org.telegram.ui.ActionBar.k6.k0(L, L, L, L, -984578, -1903620, -1903620));
        Drawable h = jg.g.h(context, R.drawable.wallet_copy);
        h.setColorFilter(new PorterDuffColorFilter(-15556886, PorterDuff.Mode.SRC_IN));
        h.setBounds(0, 0, org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(14.0f));
        textView.setCompoundDrawables(h, null, null, null);
        c8.ka.a(textView);
        frameLayout2.addView(textView, c8.ha.d(-2, 28.0f, 49, 0.0f, 202.0f, 0.0f, 0.0f));
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.d = frameLayout4;
        frameLayout4.setVisibility(4);
        frameLayout4.setRotationY(180.0f);
        frameLayout.addView(frameLayout4, c8.ha.c(-1.0f, -1));
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
        textView2.setTypeface(x5.r0(context));
        textView2.setGravity(17);
        textView2.setIncludeFontPadding(false);
        textView2.setMaxLines(4);
        textView2.setLineSpacing(0.0f, 1.0f);
        TextView i13 = org.telegram.ui.Cells.f1.i(this.d, textView2, c8.ha.d(-1, 112.0f, 55, 8.0f, 32.0f, 8.0f, 0.0f), context);
        i13.setText(id.M0(2131743203, null));
        i13.setTextColor(-15556886);
        i13.setTextSize(1, 14.0f);
        i13.setTypeface(org.telegram.messenger.g0.o1("fonts/rmedium.ttf"));
        i13.setGravity(17);
        i13.setCompoundDrawablePadding(org.telegram.messenger.g0.L(3.0f));
        Drawable mutate = context.getResources().getDrawable(R.drawable.msg_text_check).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(-15556886, PorterDuff.Mode.SRC_IN));
        mutate.setBounds(0, 0, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f));
        i13.setCompoundDrawables(mutate, null, null, null);
        TextView i14 = org.telegram.ui.Cells.f1.i(this.d, i13, c8.ha.d(-2, 28.0f, 49, 0.0f, 149.0f, 0.0f, 0.0f), context);
        i14.setText(id.M0(2131743016, null));
        i14.setTextColor(-15556886);
        i14.setTextSize(1, 14.0f);
        i14.setTypeface(org.telegram.messenger.g0.o1("fonts/rmedium.ttf"));
        i14.setGravity(17);
        i14.setPadding(org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), 0);
        int L2 = org.telegram.messenger.g0.L(18.0f);
        i14.setBackground(org.telegram.ui.ActionBar.k6.k0(L2, L2, L2, L2, -984578, -1903620, -1903620));
        c8.ka.a(i14);
        this.d.addView(i14, c8.ha.d(-2, 28.0f, 49, 0.0f, 202.0f, 0.0f, 0.0f));
        View.OnClickListener onClickListener = new View.OnClickListener(this) { // from class: org.telegram.ui.Wallet.u5
            public final /* synthetic */ v5 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i7) {
                    case 0:
                        v5 v5Var = this.b;
                        if (!v5Var.f && !v5Var.h) {
                            r0 r0Var = v5Var.e;
                            if (r0Var != null) {
                                r0Var.run();
                            }
                            v5Var.a(true);
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
        final int i15 = 1;
        i14.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Wallet.u5
            public final /* synthetic */ v5 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i15) {
                    case 0:
                        v5 v5Var = this.b;
                        if (!v5Var.f && !v5Var.h) {
                            r0 r0Var = v5Var.e;
                            if (r0Var != null) {
                                r0Var.run();
                            }
                            v5Var.a(true);
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

    public final void a(boolean z9) {
        if (this.f == z9 || this.h) {
            return;
        }
        this.h = true;
        this.f = z9;
        FrameLayout frameLayout = this.b;
        int i7 = 2;
        frameLayout.setLayerType(2, null);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(frameLayout.getRotationY(), z9 ? 180.0f : 0.0f);
        this.n = ofFloat;
        ofFloat.setDuration(420L);
        this.n.setInterpolator(xq.h);
        this.n.addUpdateListener(new q3(this, i7));
        this.n.addListener(new s81(this, 7));
        this.n.start();
    }
}
