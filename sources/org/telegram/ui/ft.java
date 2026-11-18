package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class ft extends FrameLayout {
    public final ImageView a;
    public final TextView b;
    public final ImageView c;
    public final TextView d;
    public boolean e;

    public ft(pt ptVar, Context context) {
        super(context);
        org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.d6, this, null);
        ImageView imageView = new ImageView(context);
        this.a = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView, c8.ma.d(28, 28.0f, (org.telegram.messenger.gd.a0 ? 5 : 3) | 16, 18.0f, 0.0f, 18.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(2.0f);
        addView(linearLayout, c8.ma.i(-1.0f, -2.0f, (org.telegram.messenger.gd.a0 ? 5 : 3) | 16, 64.0f, 0.0f, 20.0f, 0.0f));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        if (org.telegram.messenger.gd.a0) {
            linearLayout2.setGravity(5);
        }
        linearLayout2.setWeightSum(2.0f);
        TextView textView = new TextView(context);
        this.b = textView;
        textView.setTextSize(1, 16.0f);
        int i7 = org.telegram.ui.ActionBar.n6.G6;
        org.telegram.ui.ActionBar.u6.U(textView, i7, null);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setSingleLine();
        textView.setLines(1);
        ImageView imageView2 = new ImageView(context);
        this.c = imageView2;
        imageView2.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageView2.setImageResource(R.drawable.arrow_more);
        org.telegram.ui.ActionBar.u6.s(imageView2, i7, null, PorterDuff.Mode.MULTIPLY);
        imageView2.setTranslationY(org.telegram.messenger.g0.L(1.0f));
        imageView2.setVisibility(8);
        if (org.telegram.messenger.gd.a0) {
            linearLayout2.addView(imageView2, c8.ma.t(16, 16, 21, 3, 0, 0, 0));
            linearLayout2.addView(textView, c8.ma.r(-2, -2, 21));
        } else {
            linearLayout2.addView(textView, c8.ma.r(-2, -2, 16));
            linearLayout2.addView(imageView2, c8.ma.t(16, 16, 16, 3, 0, 0, 0));
        }
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setTextSize(1, 16.0f);
        org.telegram.ui.ActionBar.u6.U(textView2, org.telegram.ui.ActionBar.n6.o6, null);
        textView2.setGravity(org.telegram.messenger.gd.a0 ? 3 : 5);
        if (org.telegram.messenger.gd.a0) {
            linearLayout.addView(textView2, c8.ma.r(-2, -2, 19));
            linearLayout.addView(linearLayout2, c8.ma.p(0, -2, 2.0f, 21));
        } else {
            linearLayout.addView(linearLayout2, c8.ma.p(0, -2, 2.0f, 16));
            linearLayout.addView(textView2, c8.ma.r(-2, -2, 21));
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.e) {
            canvas.drawLine(org.telegram.messenger.gd.a0 ? 0.0f : org.telegram.messenger.g0.L(64.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (org.telegram.messenger.gd.a0 ? org.telegram.messenger.g0.L(64.0f) : 0), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.n6.k0);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(48.0f), TLObject.FLAG_30));
    }
}
