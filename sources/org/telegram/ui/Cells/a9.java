package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.cd;
import org.telegram.messenger.z20;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public class a9 extends FrameLayout {
    public final TextView a;
    public final TextView b;
    public final ImageView c;
    public boolean d;
    public boolean e;

    public a9(Context context) {
        super(context);
        TextView textView = new TextView(context);
        this.a = textView;
        org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.G6, null);
        z20.o(textView, 1, 16.0f, 1, 1);
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setGravity((cd.X ? 5 : 3) | 16);
        addView(textView, w7.b6.d(-2, -2.0f, (cd.X ? 5 : 3) | 48, 21.0f, 10.0f, 21.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.b = textView2;
        org.telegram.ui.ActionBar.a7.V(textView2, org.telegram.ui.ActionBar.t6.z6, null);
        textView2.setTextSize(1, 13.0f);
        textView2.setGravity(cd.X ? 5 : 3);
        textView2.setLines(1);
        textView2.setMaxLines(1);
        textView2.setSingleLine(true);
        textView2.setPadding(0, 0, 0, 0);
        addView(textView2, w7.b6.d(-2, -2.0f, (cd.X ? 5 : 3) | 48, 21.0f, 35.0f, 21.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.c = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        org.telegram.ui.ActionBar.a7.t(imageView, org.telegram.ui.ActionBar.t6.m6, null, PorterDuff.Mode.MULTIPLY);
        imageView.setVisibility(8);
        addView(imageView, w7.b6.d(52, 52.0f, (cd.X ? 5 : 3) | 48, 8.0f, 6.0f, 8.0f, 0.0f));
    }

    public final void a(String str, String str2, boolean z10) {
        this.a.setText(str);
        this.b.setText(str2);
        this.d = z10;
        this.c.setVisibility(8);
        setWillNotDraw(!z10);
    }

    public final void b(int i10, String str, String str2, boolean z10) {
        TextView textView = this.a;
        textView.setText(str);
        TextView textView2 = this.b;
        textView2.setText(str2);
        ImageView imageView = this.c;
        imageView.setImageResource(i10);
        imageView.setVisibility(0);
        textView.setPadding(cd.X ? 0 : org.telegram.messenger.i0.L(50.0f), 0, cd.X ? org.telegram.messenger.i0.L(50.0f) : 0, 0);
        textView2.setPadding(cd.X ? 0 : org.telegram.messenger.i0.L(50.0f), 0, cd.X ? org.telegram.messenger.i0.L(50.0f) : 0, this.e ? org.telegram.messenger.i0.L(12.0f) : 0);
        this.d = z10;
        setWillNotDraw(!z10);
    }

    public TextView getTextView() {
        return this.a;
    }

    public TextView getValueTextView() {
        return this.b;
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        this.a.invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float L;
        int i10;
        if (!this.d || org.telegram.ui.ActionBar.t6.k0 == null) {
            return;
        }
        boolean z10 = cd.X;
        ImageView imageView = this.c;
        if (z10) {
            L = 0.0f;
        } else {
            L = org.telegram.messenger.i0.L(imageView.getVisibility() == 0 ? 71.0f : 20.0f);
        }
        float f7 = L;
        float measuredHeight = getMeasuredHeight() - 1;
        int measuredWidth = getMeasuredWidth();
        if (cd.X) {
            i10 = org.telegram.messenger.i0.L(imageView.getVisibility() == 0 ? 71.0f : 20.0f);
        } else {
            i10 = 0;
        }
        canvas.drawLine(f7, measuredHeight, measuredWidth - i10, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.t6.k0);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        if (this.e) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(0, 0));
        } else {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(64.0f) + (this.d ? 1 : 0), TLObject.FLAG_30));
        }
    }

    public void setMultilineDetail(boolean z10) {
        this.e = z10;
        TextView textView = this.b;
        if (z10) {
            textView.setLines(0);
            textView.setMaxLines(0);
            textView.setSingleLine(false);
            textView.setPadding(0, 0, 0, org.telegram.messenger.i0.L(12.0f));
            return;
        }
        textView.setLines(1);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        textView.setPadding(0, 0, 0, 0);
    }

    public void setValue(CharSequence charSequence) {
        this.b.setText(charSequence);
    }
}
