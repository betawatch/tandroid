package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import b8.mf;
import b8.pf;
import org.telegram.messenger.bd;
import org.telegram.messenger.hs;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.tz;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class i8 extends FrameLayout {
    public final TextView a;
    public final TextView b;
    public final TextView c;
    public final ImageView d;
    public boolean e;
    public CharSequence f;
    public int h;
    public int n;
    public CharSequence r;
    public int s;
    public final org.telegram.ui.ActionBar.e6 w;

    public i8(Context context, boolean z10, boolean z11, org.telegram.ui.ActionBar.e6 e6Var, boolean z12) {
        super(context);
        ViewGroup.LayoutParams d;
        ViewGroup.LayoutParams d10;
        this.w = e6Var;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(17);
        TextView textView = new TextView(context);
        this.a = textView;
        org.telegram.ui.ActionBar.r6.W(textView, z12 ? org.telegram.ui.ActionBar.r6.h(org.telegram.ui.ActionBar.k6.Kl, hs.j2) : org.telegram.ui.ActionBar.r6.N(org.telegram.ui.ActionBar.k6.If), e6Var);
        textView.setTextSize(1, 15.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setSingleLine(true);
        if (z10) {
            textView.setGravity(17);
            textView.setTextAlignment(4);
        }
        if (z11) {
            d = mf.i(-2.0f, -2.0f, 8388659, z10 ? 5.0f : 15.0f, 5.0f, z10 ? 15.0f : 25.0f, 0.0f);
        } else {
            d = mf.d(-2, -2.0f, 51, z10 ? 5.0f : 15.0f, 5.0f, z10 ? 15.0f : 25.0f, 0.0f);
        }
        addView(linearLayout, d);
        TextView f10 = org.telegram.messenger.camera.q.f(linearLayout, textView, mf.p(-2, -2, 1.0f, 16), context);
        this.c = f10;
        org.telegram.ui.ActionBar.r6.W(f10, z12 ? org.telegram.ui.ActionBar.r6.h(org.telegram.ui.ActionBar.k6.Kl, hs.j2) : org.telegram.ui.ActionBar.r6.N(org.telegram.ui.ActionBar.k6.If), e6Var);
        f10.setTextSize(1, 11.0f);
        f10.setTypeface(org.telegram.messenger.g0.o());
        f10.setEllipsize(truncateAt);
        f10.setPadding(org.telegram.messenger.g0.L(6.0f), 0, org.telegram.messenger.g0.L(6.33f), 0);
        int L = org.telegram.messenger.g0.L(9.0f);
        int o10 = z12 ? i0.a.o(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Kl, e6Var), (int) 12.75f) : org.telegram.ui.ActionBar.k6.r1(0.1f, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.If, e6Var));
        int o11 = z12 ? i0.a.o(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Kl, e6Var), (int) 20.4f) : org.telegram.ui.ActionBar.k6.r1(0.24f, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.If, e6Var));
        y k02 = org.telegram.ui.ActionBar.k6.k0(L, L, L, L, o10, o11, o11);
        org.telegram.ui.ActionBar.n6 h = z12 ? org.telegram.ui.ActionBar.r6.h(org.telegram.ui.ActionBar.k6.Kl, 12) : org.telegram.ui.ActionBar.r6.L(0.1f, org.telegram.ui.ActionBar.k6.If);
        org.telegram.ui.ActionBar.n6 h7 = z12 ? org.telegram.ui.ActionBar.r6.h(org.telegram.ui.ActionBar.k6.Kl, 20) : org.telegram.ui.ActionBar.r6.L(0.24f, org.telegram.ui.ActionBar.k6.If);
        f10.setBackground(k02);
        org.telegram.ui.ActionBar.r6.k(f10, k02, h, h7, e6Var);
        f10.setGravity(17);
        f10.setSingleLine(true);
        pf.a(f10);
        linearLayout.addView(f10, mf.q(-2, -2, 0.0f, 16, 5, 1, 0, 0));
        f10.setVisibility(8);
        TextView textView2 = new TextView(context);
        this.b = textView2;
        org.telegram.ui.ActionBar.r6.W(textView2, z12 ? org.telegram.ui.ActionBar.r6.h(org.telegram.ui.ActionBar.k6.Kl, hs.j2) : org.telegram.ui.ActionBar.r6.N(org.telegram.ui.ActionBar.k6.If), e6Var);
        textView2.setTextSize(1, 12.0f);
        textView2.setEllipsize(truncateAt);
        textView2.setSingleLine(true);
        textView2.setVisibility(4);
        addView(textView2, z11 ? mf.i(-2.0f, -2.0f, 8388661, 12.0f, 6.0f, 17.0f, 0.0f) : mf.d(-2, -2.0f, 53, 12.0f, 6.0f, 17.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        org.telegram.ui.ActionBar.n6 h10 = z12 ? org.telegram.ui.ActionBar.r6.h(org.telegram.ui.ActionBar.k6.Kl, hs.j2) : org.telegram.ui.ActionBar.r6.N(org.telegram.ui.ActionBar.k6.Kf);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        int i3 = h10.a;
        int i10 = h10.b;
        int i11 = h10.c;
        float f11 = h10.d;
        int Q = org.telegram.ui.ActionBar.r6.Q(i3, i10, i11, f11, e6Var);
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(Q, mode);
        imageView.setColorFilter(porterDuffColorFilter);
        org.telegram.ui.ActionBar.r6.O(imageView, 5, i3, i10, i11, f11, e6Var, Q, porterDuffColorFilter).h = mode;
        int i12 = org.telegram.ui.ActionBar.k6.i6;
        y h02 = org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.w0(i12, e6Var), 3, -1);
        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i12);
        imageView.setBackground(h02);
        org.telegram.ui.ActionBar.r6.k(imageView, h02, null, N, e6Var);
        if (z11) {
            d10 = mf.i(24.0f, 24.0f, 8388661, 0.0f, 0.0f, z10 ? 0.0f : 10.0f, 0.0f);
        } else {
            d10 = mf.d(24, 24.0f, 53, 0.0f, 0.0f, z10 ? 0.0f : 10.0f, 0.0f);
        }
        imageView.setTranslationY(org.telegram.messenger.g0.L(4.0f));
        addView(imageView, d10);
    }

    public final void a(int i3, CharSequence charSequence) {
        b(charSequence, i3, null, 0, 0);
    }

    public final void b(CharSequence charSequence, int i3, CharSequence charSequence2, int i10, int i11) {
        this.f = charSequence;
        this.h = i10;
        this.n = i11;
        TextView textView = this.a;
        ImageView imageView = this.d;
        if (charSequence == null) {
            this.e = true;
            textView.setText("");
            imageView.setVisibility(4);
        } else {
            this.e = false;
            if (i11 != 0) {
                d();
            } else {
                textView.setText(org.telegram.messenger.i6.m(charSequence, textView.getPaint().getFontMetricsInt(), false, null, 0));
            }
            if (i3 != 0) {
                imageView.setImageResource(i3);
                imageView.setContentDescription(charSequence2);
                imageView.setVisibility(0);
            } else {
                imageView.setVisibility(4);
            }
        }
        this.c.setVisibility(8);
    }

    public final void c(int i3, CharSequence charSequence) {
        this.r = charSequence;
        this.s = i3;
        this.b.setVisibility(charSequence != null ? 0 : 8);
        e();
    }

    public final void d() {
        if (this.f == null || this.n <= 0) {
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f);
        try {
            tz tzVar = new tz(org.telegram.ui.ActionBar.k6.Jf, this.w);
            int i3 = this.h;
            spannableStringBuilder.setSpan(tzVar, i3, this.n + i3, 33);
        } catch (Exception unused) {
        }
        TextView textView = this.a;
        textView.setText(org.telegram.messenger.i6.m(spannableStringBuilder, textView.getPaint().getFontMetricsInt(), false, null, 0));
    }

    public final void e() {
        org.telegram.ui.ActionBar.e6 e6Var = this.w;
        if (this.r != null) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.r);
            try {
                spannableStringBuilder.setSpan(new h8(org.telegram.ui.ActionBar.k6.Jf, e6Var), 0, this.s, 33);
                spannableStringBuilder.setSpan(new h8(org.telegram.ui.ActionBar.k6.If, e6Var), this.s, this.r.length(), 33);
            } catch (Exception unused) {
            }
            this.b.setText(spannableStringBuilder);
        }
    }

    public TextView getTextView() {
        return this.a;
    }

    @Override // android.view.View
    public final void invalidate() {
        this.a.invalidate();
        super.invalidate();
    }

    @Override // android.view.ViewGroup
    public final void measureChildWithMargins(View view, int i3, int i10, int i11, int i12) {
        if (view == this.b) {
            i10 = org.telegram.messenger.k5.C(16.0f, this.a.getMeasuredWidth(), i10);
        }
        super.measureChildWithMargins(view, i3, i10, i11, i12);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i3, int i10) {
        if (this.e) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(1, TLObject.FLAG_30));
        } else {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(27.0f), TLObject.FLAG_30));
        }
    }

    public void setEdit(View.OnClickListener onClickListener) {
        TextView textView = this.c;
        textView.setVisibility(0);
        textView.setText(bd.M0(2131751258, null));
        textView.setOnClickListener(onClickListener);
    }

    public void setHeaderOnClick(View.OnClickListener onClickListener) {
        this.a.setOnClickListener(onClickListener);
    }

    public void setOnIconClickListener(View.OnClickListener onClickListener) {
        this.d.setOnClickListener(onClickListener);
    }

    public void setTitleColor(int i3) {
        this.a.setTextColor(i3);
    }
}
