package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.PorterDuff;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.sl;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.m10;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class o8 extends FrameLayout {
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
    public final org.telegram.ui.ActionBar.g6 v;

    public o8(Context context, boolean z10, boolean z11, org.telegram.ui.ActionBar.g6 g6Var, boolean z12) {
        super(context);
        ViewGroup.LayoutParams d;
        ViewGroup.LayoutParams d10;
        this.v = g6Var;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(17);
        TextView textView = new TextView(context);
        this.a = textView;
        org.telegram.ui.ActionBar.r6.X(textView, z12 ? org.telegram.ui.ActionBar.r6.h(org.telegram.ui.ActionBar.k6.Wk, 153) : org.telegram.ui.ActionBar.r6.O(org.telegram.ui.ActionBar.k6.Te), g6Var);
        textView.setTextSize(1, 15.0f);
        textView.setTypeface(AndroidUtilities.bold());
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setSingleLine(true);
        if (z10) {
            textView.setGravity(17);
            textView.setTextAlignment(4);
        }
        if (z11) {
            d = w7.z5.i(-2.0f, -2.0f, 8388659, z10 ? 5.0f : 15.0f, 5.0f, z10 ? 15.0f : 25.0f, 0.0f);
        } else {
            d = w7.z5.d(-2, -2.0f, 51, z10 ? 5.0f : 15.0f, 5.0f, z10 ? 15.0f : 25.0f, 0.0f);
        }
        addView(linearLayout, d);
        TextView f7 = sl.f(linearLayout, textView, w7.z5.o(-2, -2, 1.0f, 16), context);
        this.c = f7;
        org.telegram.ui.ActionBar.r6.X(f7, z12 ? org.telegram.ui.ActionBar.r6.h(org.telegram.ui.ActionBar.k6.Wk, 153) : org.telegram.ui.ActionBar.r6.O(org.telegram.ui.ActionBar.k6.Te), g6Var);
        f7.setTextSize(1, 11.0f);
        f7.setTypeface(AndroidUtilities.bold());
        f7.setEllipsize(truncateAt);
        f7.setPadding(AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.33f), 0);
        int dp = AndroidUtilities.dp(9.0f);
        int o10 = z12 ? i0.a.o(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Wk, g6Var), (int) 12.75f) : org.telegram.ui.ActionBar.k6.o1(0.1f, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Te, g6Var));
        int o11 = z12 ? i0.a.o(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Wk, g6Var), (int) 20.4f) : org.telegram.ui.ActionBar.k6.o1(0.24f, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Te, g6Var));
        y j02 = org.telegram.ui.ActionBar.k6.j0(dp, dp, dp, dp, o10, o11, o11);
        org.telegram.ui.ActionBar.n6 h = z12 ? org.telegram.ui.ActionBar.r6.h(org.telegram.ui.ActionBar.k6.Wk, 12) : org.telegram.ui.ActionBar.r6.M(0.1f, org.telegram.ui.ActionBar.k6.Te);
        org.telegram.ui.ActionBar.n6 h10 = z12 ? org.telegram.ui.ActionBar.r6.h(org.telegram.ui.ActionBar.k6.Wk, 20) : org.telegram.ui.ActionBar.r6.M(0.24f, org.telegram.ui.ActionBar.k6.Te);
        f7.setBackground(j02);
        org.telegram.ui.ActionBar.r6.k(f7, j02, h, h10, g6Var);
        f7.setGravity(17);
        f7.setSingleLine(true);
        w7.b6.a(f7);
        linearLayout.addView(f7, w7.z5.p(-2, -2, 0.0f, 16, 5, 1, 0, 0));
        f7.setVisibility(8);
        TextView textView2 = new TextView(context);
        this.b = textView2;
        org.telegram.ui.ActionBar.r6.X(textView2, z12 ? org.telegram.ui.ActionBar.r6.h(org.telegram.ui.ActionBar.k6.Wk, 153) : org.telegram.ui.ActionBar.r6.O(org.telegram.ui.ActionBar.k6.Te), g6Var);
        textView2.setTextSize(1, 12.0f);
        textView2.setEllipsize(truncateAt);
        textView2.setSingleLine(true);
        textView2.setVisibility(4);
        addView(textView2, z11 ? w7.z5.i(-2.0f, -2.0f, 8388661, 12.0f, 6.0f, 17.0f, 0.0f) : w7.z5.d(-2, -2.0f, 53, 12.0f, 6.0f, 17.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        org.telegram.ui.ActionBar.r6.u(imageView, z12 ? org.telegram.ui.ActionBar.r6.h(org.telegram.ui.ActionBar.k6.Wk, 153) : org.telegram.ui.ActionBar.r6.O(org.telegram.ui.ActionBar.k6.Ve), g6Var, PorterDuff.Mode.MULTIPLY);
        int i10 = org.telegram.ui.ActionBar.k6.i6;
        y g02 = org.telegram.ui.ActionBar.k6.g0(org.telegram.ui.ActionBar.k6.w0(i10, g6Var), 3, -1);
        org.telegram.ui.ActionBar.n6 O = org.telegram.ui.ActionBar.r6.O(i10);
        imageView.setBackground(g02);
        org.telegram.ui.ActionBar.r6.k(imageView, g02, null, O, g6Var);
        if (z11) {
            d10 = w7.z5.i(24.0f, 24.0f, 8388661, 0.0f, 0.0f, z10 ? 0.0f : 10.0f, 0.0f);
        } else {
            d10 = w7.z5.d(24, 24.0f, 53, 0.0f, 0.0f, z10 ? 0.0f : 10.0f, 0.0f);
        }
        imageView.setTranslationY(AndroidUtilities.dp(4.0f));
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
                textView.setText(Emoji.replaceEmoji(charSequence, textView.getPaint().getFontMetricsInt(), false));
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
            m10 m10Var = new m10(org.telegram.ui.ActionBar.k6.Ue, this.v);
            int i10 = this.h;
            spannableStringBuilder.setSpan(m10Var, i10, this.n + i10, 33);
        } catch (Exception unused) {
        }
        TextView textView = this.a;
        textView.setText(Emoji.replaceEmoji(spannableStringBuilder, textView.getPaint().getFontMetricsInt(), false));
    }

    public final void e() {
        org.telegram.ui.ActionBar.g6 g6Var = this.v;
        if (this.r != null) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.r);
            try {
                spannableStringBuilder.setSpan(new n8(org.telegram.ui.ActionBar.k6.Ue, g6Var), 0, this.s, 33);
                spannableStringBuilder.setSpan(new n8(org.telegram.ui.ActionBar.k6.Te, g6Var), this.s, this.r.length(), 33);
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
            i11 = org.telegram.messenger.v0.C(16.0f, this.a.getMeasuredWidth(), i11);
        }
        super.measureChildWithMargins(view, i10, i11, i12, i13);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        if (this.e) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(1, TLObject.FLAG_30));
        } else {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(27.0f), TLObject.FLAG_30));
        }
    }

    public void setEdit(View.OnClickListener onClickListener) {
        TextView textView = this.c;
        textView.setVisibility(0);
        textView.setText(LocaleController.getString(R.string.EditPack));
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
