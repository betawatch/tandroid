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
import org.telegram.ui.Components.lq;
import org.telegram.ui.yh;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
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
    public final org.telegram.ui.ActionBar.f6 v;

    public m8(Context context, boolean z4, boolean z10, org.telegram.ui.ActionBar.f6 f6Var, boolean z11) {
        super(context);
        ViewGroup.LayoutParams d;
        ViewGroup.LayoutParams d10;
        this.v = f6Var;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(17);
        TextView textView = new TextView(context);
        this.a = textView;
        org.telegram.messenger.y3.t(textView, z11 ? a(0.6f) : org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Te, f6Var), 1, 15.0f);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setSingleLine(true);
        if (z4) {
            textView.setGravity(17);
            textView.setTextAlignment(4);
        }
        if (z10) {
            d = k7.b6.i(-2.0f, -2.0f, 8388659, z4 ? 5.0f : 15.0f, 5.0f, z4 ? 15.0f : 25.0f, 0.0f);
        } else {
            d = k7.b6.d(-2, -2.0f, 51, z4 ? 5.0f : 15.0f, 5.0f, z4 ? 15.0f : 25.0f, 0.0f);
        }
        addView(linearLayout, d);
        TextView j10 = yh.j(linearLayout, textView, k7.b6.o(-2, -2, 1.0f, 16), context);
        this.c = j10;
        j10.setTextColor(z11 ? a(0.6f) : org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Te, f6Var));
        j10.setTextSize(1, 11.0f);
        j10.setTypeface(AndroidUtilities.bold());
        j10.setEllipsize(truncateAt);
        j10.setPadding(AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.33f), 0);
        int dp = AndroidUtilities.dp(9.0f);
        int a2 = z11 ? a(0.05f) : org.telegram.ui.ActionBar.j6.l1(0.1f, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Te, f6Var));
        int a10 = z11 ? a(0.08f) : org.telegram.ui.ActionBar.j6.l1(0.24f, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Te, f6Var));
        j10.setBackground(org.telegram.ui.ActionBar.j6.i0(dp, dp, dp, dp, a2, a10, a10));
        j10.setGravity(17);
        j10.setSingleLine(true);
        k7.d6.a(j10);
        linearLayout.addView(j10, k7.b6.p(-2, -2, 0.0f, 16, 5, 1, 0, 0));
        j10.setVisibility(8);
        TextView textView2 = new TextView(context);
        this.b = textView2;
        textView2.setTextColor(z11 ? a(0.6f) : org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Te, f6Var));
        textView2.setTextSize(1, 12.0f);
        textView2.setEllipsize(truncateAt);
        textView2.setSingleLine(true);
        textView2.setVisibility(4);
        addView(textView2, z10 ? k7.b6.i(-2.0f, -2.0f, 8388661, 12.0f, 6.0f, 17.0f, 0.0f) : k7.b6.d(-2, -2.0f, 53, 12.0f, 6.0f, 17.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setColorFilter(new PorterDuffColorFilter(z11 ? a(0.6f) : org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Ve, f6Var), PorterDuff.Mode.MULTIPLY));
        imageView.setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.i6, f6Var), 3, -1));
        if (z10) {
            d10 = k7.b6.i(24.0f, 24.0f, 8388661, 0.0f, 0.0f, z4 ? 0.0f : 10.0f, 0.0f);
        } else {
            d10 = k7.b6.d(24, 24.0f, 53, 0.0f, 0.0f, z4 ? 0.0f : 10.0f, 0.0f);
        }
        imageView.setTranslationY(AndroidUtilities.dp(4.0f));
        addView(imageView, d10);
    }

    public final int a(float f10) {
        return i0.a.k(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Wk, this.v), (int) (f10 * 255.0f));
    }

    public final void b(int i10, CharSequence charSequence) {
        c(charSequence, i10, null, 0, 0);
    }

    public final void c(CharSequence charSequence, int i10, CharSequence charSequence2, int i11, int i12) {
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
                e();
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

    public final void d(int i10, CharSequence charSequence) {
        this.r = charSequence;
        this.s = i10;
        this.b.setVisibility(charSequence != null ? 0 : 8);
        f();
    }

    public final void e() {
        if (this.f == null || this.n <= 0) {
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f);
        try {
            ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Ue, this.v));
            int i10 = this.h;
            spannableStringBuilder.setSpan(foregroundColorSpan, i10, this.n + i10, 33);
        } catch (Exception unused) {
        }
        TextView textView = this.a;
        textView.setText(Emoji.replaceEmoji(spannableStringBuilder, textView.getPaint().getFontMetricsInt(), false));
    }

    public final void f() {
        org.telegram.ui.ActionBar.f6 f6Var = this.v;
        if (this.r != null) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.r);
            try {
                spannableStringBuilder.setSpan(new lq(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Ue, f6Var)), 0, this.s, 33);
                spannableStringBuilder.setSpan(new lq(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Te, f6Var)), this.s, this.r.length(), 33);
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
            i11 = org.telegram.messenger.y3.C(16.0f, this.a.getMeasuredWidth(), i11);
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
