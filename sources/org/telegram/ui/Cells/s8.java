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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.wh;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.kb1;
import org.telegram.ui.Components.p10;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class s8 extends FrameLayout {
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
    public final org.telegram.ui.ActionBar.u6 v;

    public s8(Context context, boolean z10, boolean z11, org.telegram.ui.ActionBar.u6 u6Var, boolean z12) {
        super(context);
        ViewGroup.LayoutParams h;
        ViewGroup.LayoutParams h10;
        this.v = u6Var;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(17);
        TextView textView = new TextView(context);
        this.a = textView;
        org.telegram.ui.ActionBar.f7.W(textView, z12 ? org.telegram.ui.ActionBar.f7.h(org.telegram.ui.ActionBar.y6.Wk, 153) : org.telegram.ui.ActionBar.f7.N(org.telegram.ui.ActionBar.y6.Te), u6Var);
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
            h = kb1.m(-2.0f, -2.0f, 8388659, z10 ? 5.0f : 15.0f, 5.0f, z10 ? 15.0f : 25.0f, 0.0f);
        } else {
            h = kb1.h(-2, -2.0f, 51, z10 ? 5.0f : 15.0f, 5.0f, z10 ? 15.0f : 25.0f, 0.0f);
        }
        addView(linearLayout, h);
        TextView e = wh.e(linearLayout, textView, kb1.s(-2, -2, 1.0f, 16), context);
        this.c = e;
        org.telegram.ui.ActionBar.f7.W(e, z12 ? org.telegram.ui.ActionBar.f7.h(org.telegram.ui.ActionBar.y6.Wk, 153) : org.telegram.ui.ActionBar.f7.N(org.telegram.ui.ActionBar.y6.Te), u6Var);
        e.setTextSize(1, 11.0f);
        e.setTypeface(AndroidUtilities.bold());
        e.setEllipsize(truncateAt);
        e.setPadding(AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.33f), 0);
        int dp = AndroidUtilities.dp(9.0f);
        int o10 = z12 ? i0.a.o(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.Wk, u6Var), (int) 12.75f) : org.telegram.ui.ActionBar.y6.o1(0.1f, org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.Te, u6Var));
        int o11 = z12 ? i0.a.o(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.Wk, u6Var), (int) 20.4f) : org.telegram.ui.ActionBar.y6.o1(0.24f, org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.Te, u6Var));
        y j02 = org.telegram.ui.ActionBar.y6.j0(dp, dp, dp, dp, o10, o11, o11);
        org.telegram.ui.ActionBar.b7 h11 = z12 ? org.telegram.ui.ActionBar.f7.h(org.telegram.ui.ActionBar.y6.Wk, 12) : org.telegram.ui.ActionBar.f7.L(0.1f, org.telegram.ui.ActionBar.y6.Te);
        org.telegram.ui.ActionBar.b7 h12 = z12 ? org.telegram.ui.ActionBar.f7.h(org.telegram.ui.ActionBar.y6.Wk, 20) : org.telegram.ui.ActionBar.f7.L(0.24f, org.telegram.ui.ActionBar.y6.Te);
        e.setBackground(j02);
        org.telegram.ui.ActionBar.f7.k(e, j02, h11, h12, u6Var);
        e.setGravity(17);
        e.setSingleLine(true);
        kb1.b(e);
        linearLayout.addView(e, kb1.t(-2, -2, 0.0f, 16, 5, 1, 0, 0));
        e.setVisibility(8);
        TextView textView2 = new TextView(context);
        this.b = textView2;
        org.telegram.ui.ActionBar.f7.W(textView2, z12 ? org.telegram.ui.ActionBar.f7.h(org.telegram.ui.ActionBar.y6.Wk, 153) : org.telegram.ui.ActionBar.f7.N(org.telegram.ui.ActionBar.y6.Te), u6Var);
        textView2.setTextSize(1, 12.0f);
        textView2.setEllipsize(truncateAt);
        textView2.setSingleLine(true);
        textView2.setVisibility(4);
        addView(textView2, z11 ? kb1.m(-2.0f, -2.0f, 8388661, 12.0f, 6.0f, 17.0f, 0.0f) : kb1.h(-2, -2.0f, 53, 12.0f, 6.0f, 17.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        org.telegram.ui.ActionBar.b7 h13 = z12 ? org.telegram.ui.ActionBar.f7.h(org.telegram.ui.ActionBar.y6.Wk, 153) : org.telegram.ui.ActionBar.f7.N(org.telegram.ui.ActionBar.y6.Ve);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        int i10 = h13.a;
        int i11 = h13.b;
        int i12 = h13.c;
        float f7 = h13.d;
        int Q = org.telegram.ui.ActionBar.f7.Q(i10, i11, i12, f7, u6Var);
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(Q, mode);
        imageView.setColorFilter(porterDuffColorFilter);
        org.telegram.ui.ActionBar.f7.O(imageView, 5, i10, i11, i12, f7, u6Var, Q, porterDuffColorFilter).h = mode;
        int i13 = org.telegram.ui.ActionBar.y6.i6;
        y g02 = org.telegram.ui.ActionBar.y6.g0(org.telegram.ui.ActionBar.y6.w0(i13, u6Var), 3, -1);
        org.telegram.ui.ActionBar.b7 N = org.telegram.ui.ActionBar.f7.N(i13);
        imageView.setBackground(g02);
        org.telegram.ui.ActionBar.f7.k(imageView, g02, null, N, u6Var);
        if (z11) {
            h10 = kb1.m(24.0f, 24.0f, 8388661, 0.0f, 0.0f, z10 ? 0.0f : 10.0f, 0.0f);
        } else {
            h10 = kb1.h(24, 24.0f, 53, 0.0f, 0.0f, z10 ? 0.0f : 10.0f, 0.0f);
        }
        imageView.setTranslationY(AndroidUtilities.dp(4.0f));
        addView(imageView, h10);
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
            p10 p10Var = new p10(org.telegram.ui.ActionBar.y6.Ue, this.v);
            int i10 = this.h;
            spannableStringBuilder.setSpan(p10Var, i10, this.n + i10, 33);
        } catch (Exception unused) {
        }
        TextView textView = this.a;
        textView.setText(Emoji.replaceEmoji(spannableStringBuilder, textView.getPaint().getFontMetricsInt(), false));
    }

    public final void e() {
        org.telegram.ui.ActionBar.u6 u6Var = this.v;
        if (this.r != null) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.r);
            try {
                spannableStringBuilder.setSpan(new r8(org.telegram.ui.ActionBar.y6.Ue, u6Var), 0, this.s, 33);
                spannableStringBuilder.setSpan(new r8(org.telegram.ui.ActionBar.y6.Te, u6Var), this.s, this.r.length(), 33);
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
            i11 = org.telegram.messenger.t.D(16.0f, this.a.getMeasuredWidth(), i11);
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
