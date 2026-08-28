package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
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
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.dq;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class m8 extends FrameLayout {
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
    public final org.telegram.ui.ActionBar.b6 v;

    public m8(Context context, boolean z10, boolean z11, org.telegram.ui.ActionBar.b6 b6Var, boolean z12) {
        super(context);
        ViewGroup.LayoutParams d;
        ViewGroup.LayoutParams d9;
        this.v = b6Var;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(17);
        TextView textView = new TextView(context);
        this.a = textView;
        org.telegram.messenger.l0.q(textView, z12 ? a(0.6f) : org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Te, b6Var), 1, 15.0f);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setSingleLine(true);
        if (z10) {
            textView.setGravity(17);
            textView.setTextAlignment(4);
        }
        if (z11) {
            d = g7.e6.i(-2.0f, -2.0f, 8388659, z10 ? 5.0f : 15.0f, 5.0f, z10 ? 15.0f : 25.0f, 0.0f);
        } else {
            d = g7.e6.d(-2, -2.0f, 51, z10 ? 5.0f : 15.0f, 5.0f, z10 ? 15.0f : 25.0f, 0.0f);
        }
        addView(linearLayout, d);
        TextView h = j3.r0.h(linearLayout, textView, g7.e6.o(-2, -2, 1.0f, 16), context);
        this.c = h;
        h.setTextColor(z12 ? a(0.6f) : org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Te, b6Var));
        h.setTextSize(1, 11.0f);
        h.setTypeface(AndroidUtilities.bold());
        h.setEllipsize(truncateAt);
        h.setPadding(AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.33f), 0);
        int dp = AndroidUtilities.dp(9.0f);
        int a2 = z12 ? a(0.05f) : org.telegram.ui.ActionBar.f6.l1(0.1f, org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Te, b6Var));
        int a3 = z12 ? a(0.08f) : org.telegram.ui.ActionBar.f6.l1(0.24f, org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Te, b6Var));
        h.setBackground(org.telegram.ui.ActionBar.f6.i0(dp, dp, dp, dp, a2, a3, a3));
        h.setGravity(17);
        h.setSingleLine(true);
        g7.g6.a(h);
        linearLayout.addView(h, g7.e6.p(-2, -2, 0.0f, 16, 5, 1, 0, 0));
        h.setVisibility(8);
        TextView textView2 = new TextView(context);
        this.b = textView2;
        textView2.setTextColor(z12 ? a(0.6f) : org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Te, b6Var));
        textView2.setTextSize(1, 12.0f);
        textView2.setEllipsize(truncateAt);
        textView2.setSingleLine(true);
        textView2.setVisibility(4);
        addView(textView2, z11 ? g7.e6.i(-2.0f, -2.0f, 8388661, 12.0f, 6.0f, 17.0f, 0.0f) : g7.e6.d(-2, -2.0f, 53, 12.0f, 6.0f, 17.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setColorFilter(new PorterDuffColorFilter(z12 ? a(0.6f) : org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Ve, b6Var), PorterDuff.Mode.MULTIPLY));
        imageView.setBackground(org.telegram.ui.ActionBar.f6.f0(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.i6, b6Var), 3, -1));
        if (z11) {
            d9 = g7.e6.i(24.0f, 24.0f, 8388661, 0.0f, 0.0f, z10 ? 0.0f : 10.0f, 0.0f);
        } else {
            d9 = g7.e6.d(24, 24.0f, 53, 0.0f, 0.0f, z10 ? 0.0f : 10.0f, 0.0f);
        }
        imageView.setTranslationY(AndroidUtilities.dp(4.0f));
        addView(imageView, d9);
    }

    public final int a(float f10) {
        return i0.a.k(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Wk, this.v), (int) (f10 * 255.0f));
    }

    public final void b(int i9, CharSequence charSequence) {
        c(charSequence, i9, null, 0, 0);
    }

    public final void c(CharSequence charSequence, int i9, CharSequence charSequence2, int i10, int i11) {
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
                e();
            } else {
                textView.setText(Emoji.replaceEmoji(charSequence, textView.getPaint().getFontMetricsInt(), false));
            }
            if (i9 != 0) {
                imageView.setImageResource(i9);
                imageView.setContentDescription(charSequence2);
                imageView.setVisibility(0);
            } else {
                imageView.setVisibility(4);
            }
        }
        this.c.setVisibility(8);
    }

    public final void d(int i9, CharSequence charSequence) {
        this.r = charSequence;
        this.s = i9;
        this.b.setVisibility(charSequence != null ? 0 : 8);
        f();
    }

    public final void e() {
        if (this.f == null || this.n <= 0) {
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f);
        try {
            ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Ue, this.v));
            int i9 = this.h;
            spannableStringBuilder.setSpan(foregroundColorSpan, i9, this.n + i9, 33);
        } catch (Exception unused) {
        }
        TextView textView = this.a;
        textView.setText(Emoji.replaceEmoji(spannableStringBuilder, textView.getPaint().getFontMetricsInt(), false));
    }

    public final void f() {
        org.telegram.ui.ActionBar.b6 b6Var = this.v;
        if (this.r != null) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.r);
            try {
                spannableStringBuilder.setSpan(new dq(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Ue, b6Var)), 0, this.s, 33);
                spannableStringBuilder.setSpan(new dq(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Te, b6Var)), this.s, this.r.length(), 33);
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
    public final void measureChildWithMargins(View view, int i9, int i10, int i11, int i12) {
        if (view == this.b) {
            i10 = org.telegram.messenger.l0.C(16.0f, this.a.getMeasuredWidth(), i10);
        }
        super.measureChildWithMargins(view, i9, i10, i11, i12);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i9, int i10) {
        if (this.e) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(1, TLObject.FLAG_30));
        } else {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(27.0f), TLObject.FLAG_30));
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

    public void setTitleColor(int i9) {
        this.a.setTextColor(i9);
    }
}
