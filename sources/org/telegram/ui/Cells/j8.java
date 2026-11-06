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
import org.telegram.messenger.hd;
import org.telegram.messenger.qs;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.xz;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class j8 extends FrameLayout {
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
    public final org.telegram.ui.ActionBar.f6 w;

    public j8(Context context, boolean z9, boolean z10, org.telegram.ui.ActionBar.f6 f6Var, boolean z11) {
        super(context);
        ViewGroup.LayoutParams d;
        ViewGroup.LayoutParams d2;
        this.w = f6Var;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(17);
        TextView textView = new TextView(context);
        this.a = textView;
        org.telegram.ui.ActionBar.r6.W(textView, z11 ? org.telegram.ui.ActionBar.r6.h(org.telegram.ui.ActionBar.k6.Kl, qs.j2) : org.telegram.ui.ActionBar.r6.N(org.telegram.ui.ActionBar.k6.If), f6Var);
        textView.setTextSize(1, 15.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setSingleLine(true);
        if (z9) {
            textView.setGravity(17);
            textView.setTextAlignment(4);
        }
        if (z10) {
            d = c8.ha.i(-2.0f, -2.0f, 8388659, z9 ? 5.0f : 15.0f, 5.0f, z9 ? 15.0f : 25.0f, 0.0f);
        } else {
            d = c8.ha.d(-2, -2.0f, 51, z9 ? 5.0f : 15.0f, 5.0f, z9 ? 15.0f : 25.0f, 0.0f);
        }
        addView(linearLayout, d);
        TextView f10 = org.telegram.messenger.camera.q.f(linearLayout, textView, c8.ha.p(-2, -2, 1.0f, 16), context);
        this.c = f10;
        org.telegram.ui.ActionBar.r6.W(f10, z11 ? org.telegram.ui.ActionBar.r6.h(org.telegram.ui.ActionBar.k6.Kl, qs.j2) : org.telegram.ui.ActionBar.r6.N(org.telegram.ui.ActionBar.k6.If), f6Var);
        f10.setTextSize(1, 11.0f);
        f10.setTypeface(org.telegram.messenger.g0.o());
        f10.setEllipsize(truncateAt);
        f10.setPadding(org.telegram.messenger.g0.L(6.0f), 0, org.telegram.messenger.g0.L(6.33f), 0);
        int L = org.telegram.messenger.g0.L(9.0f);
        int o4 = z11 ? i0.a.o(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Kl, f6Var), (int) 12.75f) : org.telegram.ui.ActionBar.k6.r1(0.1f, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.If, f6Var));
        int o10 = z11 ? i0.a.o(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Kl, f6Var), (int) 20.4f) : org.telegram.ui.ActionBar.k6.r1(0.24f, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.If, f6Var));
        y k02 = org.telegram.ui.ActionBar.k6.k0(L, L, L, L, o4, o10, o10);
        org.telegram.ui.ActionBar.n6 h = z11 ? org.telegram.ui.ActionBar.r6.h(org.telegram.ui.ActionBar.k6.Kl, 12) : org.telegram.ui.ActionBar.r6.L(0.1f, org.telegram.ui.ActionBar.k6.If);
        org.telegram.ui.ActionBar.n6 h7 = z11 ? org.telegram.ui.ActionBar.r6.h(org.telegram.ui.ActionBar.k6.Kl, 20) : org.telegram.ui.ActionBar.r6.L(0.24f, org.telegram.ui.ActionBar.k6.If);
        f10.setBackground(k02);
        org.telegram.ui.ActionBar.r6.k(f10, k02, h, h7, f6Var);
        f10.setGravity(17);
        f10.setSingleLine(true);
        c8.ka.a(f10);
        linearLayout.addView(f10, c8.ha.q(-2, -2, 0.0f, 16, 5, 1, 0, 0));
        f10.setVisibility(8);
        TextView textView2 = new TextView(context);
        this.b = textView2;
        org.telegram.ui.ActionBar.r6.W(textView2, z11 ? org.telegram.ui.ActionBar.r6.h(org.telegram.ui.ActionBar.k6.Kl, qs.j2) : org.telegram.ui.ActionBar.r6.N(org.telegram.ui.ActionBar.k6.If), f6Var);
        textView2.setTextSize(1, 12.0f);
        textView2.setEllipsize(truncateAt);
        textView2.setSingleLine(true);
        textView2.setVisibility(4);
        addView(textView2, z10 ? c8.ha.i(-2.0f, -2.0f, 8388661, 12.0f, 6.0f, 17.0f, 0.0f) : c8.ha.d(-2, -2.0f, 53, 12.0f, 6.0f, 17.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        org.telegram.ui.ActionBar.n6 h10 = z11 ? org.telegram.ui.ActionBar.r6.h(org.telegram.ui.ActionBar.k6.Kl, qs.j2) : org.telegram.ui.ActionBar.r6.N(org.telegram.ui.ActionBar.k6.Kf);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        int i7 = h10.a;
        int i10 = h10.b;
        int i11 = h10.c;
        float f11 = h10.d;
        int Q = org.telegram.ui.ActionBar.r6.Q(i7, i10, i11, f11, f6Var);
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(Q, mode);
        imageView.setColorFilter(porterDuffColorFilter);
        org.telegram.ui.ActionBar.r6.O(imageView, 5, i7, i10, i11, f11, f6Var, Q, porterDuffColorFilter).h = mode;
        int i12 = org.telegram.ui.ActionBar.k6.i6;
        y h02 = org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.w0(i12, f6Var), 3, -1);
        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i12);
        imageView.setBackground(h02);
        org.telegram.ui.ActionBar.r6.k(imageView, h02, null, N, f6Var);
        if (z10) {
            d2 = c8.ha.i(24.0f, 24.0f, 8388661, 0.0f, 0.0f, z9 ? 0.0f : 10.0f, 0.0f);
        } else {
            d2 = c8.ha.d(24, 24.0f, 53, 0.0f, 0.0f, z9 ? 0.0f : 10.0f, 0.0f);
        }
        imageView.setTranslationY(org.telegram.messenger.g0.L(4.0f));
        addView(imageView, d2);
    }

    public final void a(int i7, CharSequence charSequence) {
        b(charSequence, i7, null, 0, 0);
    }

    public final void b(CharSequence charSequence, int i7, CharSequence charSequence2, int i10, int i11) {
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
            if (i7 != 0) {
                imageView.setImageResource(i7);
                imageView.setContentDescription(charSequence2);
                imageView.setVisibility(0);
            } else {
                imageView.setVisibility(4);
            }
        }
        this.c.setVisibility(8);
    }

    public final void c(int i7, CharSequence charSequence) {
        this.r = charSequence;
        this.s = i7;
        this.b.setVisibility(charSequence != null ? 0 : 8);
        e();
    }

    public final void d() {
        if (this.f == null || this.n <= 0) {
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f);
        try {
            xz xzVar = new xz(org.telegram.ui.ActionBar.k6.Jf, this.w);
            int i7 = this.h;
            spannableStringBuilder.setSpan(xzVar, i7, this.n + i7, 33);
        } catch (Exception unused) {
        }
        TextView textView = this.a;
        textView.setText(org.telegram.messenger.i6.m(spannableStringBuilder, textView.getPaint().getFontMetricsInt(), false, null, 0));
    }

    public final void e() {
        org.telegram.ui.ActionBar.f6 f6Var = this.w;
        if (this.r != null) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.r);
            try {
                spannableStringBuilder.setSpan(new i8(org.telegram.ui.ActionBar.k6.Jf, f6Var), 0, this.s, 33);
                spannableStringBuilder.setSpan(new i8(org.telegram.ui.ActionBar.k6.If, f6Var), this.s, this.r.length(), 33);
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
    public final void measureChildWithMargins(View view, int i7, int i10, int i11, int i12) {
        if (view == this.b) {
            i10 = org.telegram.messenger.k5.C(16.0f, this.a.getMeasuredWidth(), i10);
        }
        super.measureChildWithMargins(view, i7, i10, i11, i12);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        if (this.e) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(1, TLObject.FLAG_30));
        } else {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(27.0f), TLObject.FLAG_30));
        }
    }

    public void setEdit(View.OnClickListener onClickListener) {
        TextView textView = this.c;
        textView.setVisibility(0);
        textView.setText(hd.M0(2131751258, null));
        textView.setOnClickListener(onClickListener);
    }

    public void setHeaderOnClick(View.OnClickListener onClickListener) {
        this.a.setOnClickListener(onClickListener);
    }

    public void setOnIconClickListener(View.OnClickListener onClickListener) {
        this.d.setOnClickListener(onClickListener);
    }

    public void setTitleColor(int i7) {
        this.a.setTextColor(i7);
    }
}
