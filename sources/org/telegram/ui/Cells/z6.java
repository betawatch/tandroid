package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cd;
import org.telegram.messenger.z20;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class z6 extends FrameLayout {
    public final TextView a;
    public final TextView b;
    public final ImageView c;
    public boolean d;
    public int e;

    public z6(Context context) {
        super(context);
        TextView textView = new TextView(context);
        this.a = textView;
        org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.G6, null);
        textView.setTextSize(1, 16.0f);
        textView.setGravity(cd.X ? 5 : 3);
        textView.setLines(1);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        boolean z10 = cd.X;
        addView(textView, w7.b6.d(-2, -2.0f, z10 ? 5 : 3, z10 ? 16.0f : 71.0f, 10.0f, z10 ? 71.0f : 16.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.b = textView2;
        org.telegram.ui.ActionBar.a7.V(textView2, org.telegram.ui.ActionBar.t6.z6, null);
        z20.o(textView2, 1, 13.0f, 1, 1);
        textView2.setSingleLine(true);
        textView2.setGravity(cd.X ? 5 : 3);
        boolean z11 = cd.X;
        addView(textView2, w7.b6.d(-2, -2.0f, z11 ? 5 : 3, z11 ? 16.0f : 71.0f, 33.0f, z11 ? 71.0f : 16.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.c = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        org.telegram.ui.ActionBar.a7.t(imageView, org.telegram.ui.ActionBar.t6.m6, null, PorterDuff.Mode.MULTIPLY);
        addView(imageView, w7.b6.d(48, 48.0f, cd.X ? 5 : 3, 10.0f, 8.0f, 10.0f, 0.0f));
    }

    public final void a(CharSequence charSequence, String[] strArr, boolean z10, boolean z11) {
        TextView textView = this.a;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) textView.getLayoutParams();
        TextView textView2 = this.b;
        if (z10) {
            textView2.setText(charSequence);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            for (int i10 = 0; i10 < strArr.length; i10++) {
                if (i10 != 0) {
                    spannableStringBuilder.append((CharSequence) " > ");
                    Drawable mutate = getContext().getResources().getDrawable(R.drawable.settings_arrow).mutate();
                    mutate.setBounds(0, 0, mutate.getIntrinsicWidth(), mutate.getIntrinsicHeight());
                    org.telegram.ui.ActionBar.a7.y(this, mutate, org.telegram.ui.ActionBar.t6.G6, null, PorterDuff.Mode.MULTIPLY);
                    spannableStringBuilder.setSpan(new y6(mutate), spannableStringBuilder.length() - 2, spannableStringBuilder.length() - 1, 33);
                }
                spannableStringBuilder.append((CharSequence) strArr[i10]);
            }
            textView.setText(spannableStringBuilder);
            textView2.setVisibility(0);
            layoutParams.topMargin = org.telegram.messenger.i0.L(10.0f);
        } else {
            textView.setText(charSequence);
            if (strArr != null) {
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                for (int i11 = 0; i11 < strArr.length; i11++) {
                    if (i11 != 0) {
                        spannableStringBuilder2.append((CharSequence) " > ");
                        Drawable mutate2 = getContext().getResources().getDrawable(R.drawable.settings_arrow).mutate();
                        mutate2.setBounds(0, 0, mutate2.getIntrinsicWidth(), mutate2.getIntrinsicHeight());
                        org.telegram.ui.ActionBar.a7.y(this, mutate2, org.telegram.ui.ActionBar.t6.z6, null, PorterDuff.Mode.MULTIPLY);
                        spannableStringBuilder2.setSpan(new y6(mutate2), spannableStringBuilder2.length() - 2, spannableStringBuilder2.length() - 1, 33);
                    }
                    spannableStringBuilder2.append((CharSequence) strArr[i11]);
                }
                textView2.setText(spannableStringBuilder2);
                textView2.setVisibility(0);
                layoutParams.topMargin = org.telegram.messenger.i0.L(10.0f);
            } else {
                layoutParams.topMargin = org.telegram.messenger.i0.L(21.0f);
                textView2.setVisibility(8);
            }
        }
        int L = org.telegram.messenger.i0.L(16.0f);
        layoutParams.rightMargin = L;
        layoutParams.leftMargin = L;
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) textView2.getLayoutParams();
        int L2 = org.telegram.messenger.i0.L(16.0f);
        layoutParams2.rightMargin = L2;
        layoutParams2.leftMargin = L2;
        this.c.setVisibility(8);
        this.d = z11;
        setWillNotDraw(!z11);
        this.e = 16;
    }

    public final void b(CharSequence charSequence, String[] strArr, int i10, boolean z10) {
        TextView textView = this.a;
        textView.setText(charSequence);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) textView.getLayoutParams();
        layoutParams.leftMargin = org.telegram.messenger.i0.L(cd.X ? 16.0f : 71.0f);
        layoutParams.rightMargin = org.telegram.messenger.i0.L(cd.X ? 71.0f : 16.0f);
        TextView textView2 = this.b;
        if (strArr != null) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            for (int i11 = 0; i11 < strArr.length; i11++) {
                if (i11 != 0) {
                    spannableStringBuilder.append((CharSequence) " > ");
                    Drawable mutate = getContext().getResources().getDrawable(R.drawable.settings_arrow).mutate();
                    mutate.setBounds(0, 0, mutate.getIntrinsicWidth(), mutate.getIntrinsicHeight());
                    org.telegram.ui.ActionBar.a7.y(this, mutate, org.telegram.ui.ActionBar.t6.z6, null, PorterDuff.Mode.MULTIPLY);
                    spannableStringBuilder.setSpan(new y6(mutate), spannableStringBuilder.length() - 2, spannableStringBuilder.length() - 1, 33);
                }
                spannableStringBuilder.append((CharSequence) strArr[i11]);
            }
            textView2.setText(spannableStringBuilder);
            textView2.setVisibility(0);
            layoutParams.topMargin = org.telegram.messenger.i0.L(10.0f);
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) textView2.getLayoutParams();
            layoutParams2.leftMargin = org.telegram.messenger.i0.L(cd.X ? 16.0f : 71.0f);
            layoutParams2.rightMargin = org.telegram.messenger.i0.L(cd.X ? 71.0f : 16.0f);
        } else {
            layoutParams.topMargin = org.telegram.messenger.i0.L(21.0f);
            textView2.setVisibility(8);
        }
        ImageView imageView = this.c;
        if (i10 != 0) {
            imageView.setImageResource(i10);
            imageView.setVisibility(0);
        } else {
            imageView.setVisibility(8);
        }
        this.e = 69;
        this.d = z10;
        setWillNotDraw(!z10);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.d) {
            canvas.drawLine(cd.X ? 0.0f : org.telegram.messenger.i0.L(this.e), getMeasuredHeight() - 1, getMeasuredWidth() - (cd.X ? org.telegram.messenger.i0.L(this.e) : 0), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.t6.k0);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(64.0f) + (this.d ? 1 : 0), TLObject.FLAG_30));
    }
}
