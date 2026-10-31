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
import org.telegram.messenger.cd;
import org.telegram.messenger.z20;
import org.telegram.messenger.zs;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.l00;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class n8 extends FrameLayout {
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
    public final org.telegram.ui.ActionBar.p6 w;

    public n8(Context context, boolean z10, boolean z11, org.telegram.ui.ActionBar.p6 p6Var, boolean z12) {
        super(context);
        ViewGroup.LayoutParams d;
        ViewGroup.LayoutParams d10;
        this.w = p6Var;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(17);
        TextView textView = new TextView(context);
        this.a = textView;
        org.telegram.ui.ActionBar.a7.W(textView, z12 ? org.telegram.ui.ActionBar.a7.h(org.telegram.ui.ActionBar.t6.Kl, zs.j2) : org.telegram.ui.ActionBar.a7.N(org.telegram.ui.ActionBar.t6.If), p6Var);
        textView.setTextSize(1, 15.0f);
        textView.setTypeface(org.telegram.messenger.i0.o());
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setSingleLine(true);
        if (z10) {
            textView.setGravity(17);
            textView.setTextAlignment(4);
        }
        if (z11) {
            d = w7.b6.i(-2.0f, -2.0f, 8388659, z10 ? 5.0f : 15.0f, 5.0f, z10 ? 15.0f : 25.0f, 0.0f);
        } else {
            d = w7.b6.d(-2, -2.0f, 51, z10 ? 5.0f : 15.0f, 5.0f, z10 ? 15.0f : 25.0f, 0.0f);
        }
        addView(linearLayout, d);
        TextView f7 = z20.f(linearLayout, textView, w7.b6.p(-2, -2, 1.0f, 16), context);
        this.c = f7;
        org.telegram.ui.ActionBar.a7.W(f7, z12 ? org.telegram.ui.ActionBar.a7.h(org.telegram.ui.ActionBar.t6.Kl, zs.j2) : org.telegram.ui.ActionBar.a7.N(org.telegram.ui.ActionBar.t6.If), p6Var);
        f7.setTextSize(1, 11.0f);
        f7.setTypeface(org.telegram.messenger.i0.o());
        f7.setEllipsize(truncateAt);
        f7.setPadding(org.telegram.messenger.i0.L(6.0f), 0, org.telegram.messenger.i0.L(6.33f), 0);
        int L = org.telegram.messenger.i0.L(9.0f);
        int o10 = z12 ? i0.b.o(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Kl, p6Var), (int) 12.75f) : org.telegram.ui.ActionBar.t6.r1(0.1f, org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.If, p6Var));
        int o11 = z12 ? i0.b.o(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Kl, p6Var), (int) 20.4f) : org.telegram.ui.ActionBar.t6.r1(0.24f, org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.If, p6Var));
        y k02 = org.telegram.ui.ActionBar.t6.k0(L, L, L, L, o10, o11, o11);
        org.telegram.ui.ActionBar.w6 h = z12 ? org.telegram.ui.ActionBar.a7.h(org.telegram.ui.ActionBar.t6.Kl, 12) : org.telegram.ui.ActionBar.a7.L(0.1f, org.telegram.ui.ActionBar.t6.If);
        org.telegram.ui.ActionBar.w6 h10 = z12 ? org.telegram.ui.ActionBar.a7.h(org.telegram.ui.ActionBar.t6.Kl, 20) : org.telegram.ui.ActionBar.a7.L(0.24f, org.telegram.ui.ActionBar.t6.If);
        f7.setBackground(k02);
        org.telegram.ui.ActionBar.a7.k(f7, k02, h, h10, p6Var);
        f7.setGravity(17);
        f7.setSingleLine(true);
        w7.e6.a(f7);
        linearLayout.addView(f7, w7.b6.q(-2, -2, 0.0f, 16, 5, 1, 0, 0));
        f7.setVisibility(8);
        TextView textView2 = new TextView(context);
        this.b = textView2;
        org.telegram.ui.ActionBar.a7.W(textView2, z12 ? org.telegram.ui.ActionBar.a7.h(org.telegram.ui.ActionBar.t6.Kl, zs.j2) : org.telegram.ui.ActionBar.a7.N(org.telegram.ui.ActionBar.t6.If), p6Var);
        textView2.setTextSize(1, 12.0f);
        textView2.setEllipsize(truncateAt);
        textView2.setSingleLine(true);
        textView2.setVisibility(4);
        addView(textView2, z11 ? w7.b6.i(-2.0f, -2.0f, 8388661, 12.0f, 6.0f, 17.0f, 0.0f) : w7.b6.d(-2, -2.0f, 53, 12.0f, 6.0f, 17.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        org.telegram.ui.ActionBar.w6 h11 = z12 ? org.telegram.ui.ActionBar.a7.h(org.telegram.ui.ActionBar.t6.Kl, zs.j2) : org.telegram.ui.ActionBar.a7.N(org.telegram.ui.ActionBar.t6.Kf);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        int i10 = h11.a;
        int i11 = h11.b;
        int i12 = h11.c;
        float f10 = h11.d;
        int Q = org.telegram.ui.ActionBar.a7.Q(i10, i11, i12, f10, p6Var);
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(Q, mode);
        imageView.setColorFilter(porterDuffColorFilter);
        org.telegram.ui.ActionBar.a7.O(imageView, 5, i10, i11, i12, f10, p6Var, Q, porterDuffColorFilter).h = mode;
        int i13 = org.telegram.ui.ActionBar.t6.i6;
        y h02 = org.telegram.ui.ActionBar.t6.h0(org.telegram.ui.ActionBar.t6.w0(i13, p6Var), 3, -1);
        org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i13);
        imageView.setBackground(h02);
        org.telegram.ui.ActionBar.a7.k(imageView, h02, null, N, p6Var);
        if (z11) {
            d10 = w7.b6.i(24.0f, 24.0f, 8388661, 0.0f, 0.0f, z10 ? 0.0f : 10.0f, 0.0f);
        } else {
            d10 = w7.b6.d(24, 24.0f, 53, 0.0f, 0.0f, z10 ? 0.0f : 10.0f, 0.0f);
        }
        imageView.setTranslationY(org.telegram.messenger.i0.L(4.0f));
        addView(imageView, d10);
    }

    public final void a(int i10, CharSequence charSequence) {
        b(charSequence, i10, null, 0, 0);
    }

    public final void b(CharSequence charSequence, int i10, CharSequence charSequence2, int i11, int i12) {
        this.f = charSequence;
        this.h = i11;
        this.n = i12;
        TextView textView = this.a;
        ImageView imageView = this.d;
        if (charSequence == null) {
            this.e = true;
            textView.setText("");
            imageView.setVisibility(4);
        } else {
            this.e = false;
            if (i12 != 0) {
                d();
            } else {
                textView.setText(org.telegram.messenger.k6.m(charSequence, textView.getPaint().getFontMetricsInt(), false, null, 0));
            }
            if (i10 != 0) {
                imageView.setImageResource(i10);
                imageView.setContentDescription(charSequence2);
                imageView.setVisibility(0);
            } else {
                imageView.setVisibility(4);
            }
        }
        this.c.setVisibility(8);
    }

    public final void c(int i10, CharSequence charSequence) {
        this.r = charSequence;
        this.s = i10;
        this.b.setVisibility(charSequence != null ? 0 : 8);
        e();
    }

    public final void d() {
        if (this.f == null || this.n <= 0) {
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f);
        try {
            l00 l00Var = new l00(org.telegram.ui.ActionBar.t6.Jf, this.w);
            int i10 = this.h;
            spannableStringBuilder.setSpan(l00Var, i10, this.n + i10, 33);
        } catch (Exception unused) {
        }
        TextView textView = this.a;
        textView.setText(org.telegram.messenger.k6.m(spannableStringBuilder, textView.getPaint().getFontMetricsInt(), false, null, 0));
    }

    public final void e() {
        org.telegram.ui.ActionBar.p6 p6Var = this.w;
        if (this.r != null) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.r);
            try {
                spannableStringBuilder.setSpan(new m8(org.telegram.ui.ActionBar.t6.Jf, p6Var), 0, this.s, 33);
                spannableStringBuilder.setSpan(new m8(org.telegram.ui.ActionBar.t6.If, p6Var), this.s, this.r.length(), 33);
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
    public final void measureChildWithMargins(View view, int i10, int i11, int i12, int i13) {
        if (view == this.b) {
            i11 = org.telegram.messenger.m5.C(16.0f, this.a.getMeasuredWidth(), i11);
        }
        super.measureChildWithMargins(view, i10, i11, i12, i13);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        if (this.e) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(1, TLObject.FLAG_30));
        } else {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(27.0f), TLObject.FLAG_30));
        }
    }

    public void setEdit(View.OnClickListener onClickListener) {
        TextView textView = this.c;
        textView.setVisibility(0);
        textView.setText(cd.L0(2131751258, null));
        textView.setOnClickListener(onClickListener);
    }

    public void setHeaderOnClick(View.OnClickListener onClickListener) {
        this.a.setOnClickListener(onClickListener);
    }

    public void setOnIconClickListener(View.OnClickListener onClickListener) {
        this.d.setOnClickListener(onClickListener);
    }

    public void setTitleColor(int i10) {
        this.a.setTextColor(i10);
    }
}
