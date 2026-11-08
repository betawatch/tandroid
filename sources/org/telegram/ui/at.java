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

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class at extends FrameLayout {
    public final ImageView a;
    public final TextView b;
    public final ImageView c;
    public final TextView d;
    public boolean e;

    public at(kt ktVar, Context context) {
        super(context);
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, this, null);
        ImageView imageView = new ImageView(context);
        this.a = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView, c8.ha.d(28, 28.0f, (org.telegram.messenger.id.a0 ? 5 : 3) | 16, 18.0f, 0.0f, 18.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(2.0f);
        addView(linearLayout, c8.ha.i(-1.0f, -2.0f, (org.telegram.messenger.id.a0 ? 5 : 3) | 16, 64.0f, 0.0f, 20.0f, 0.0f));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        if (org.telegram.messenger.id.a0) {
            linearLayout2.setGravity(5);
        }
        linearLayout2.setWeightSum(2.0f);
        TextView textView = new TextView(context);
        this.b = textView;
        textView.setTextSize(1, 16.0f);
        int i7 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.r6.V(textView, i7, null);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setSingleLine();
        textView.setLines(1);
        ImageView imageView2 = new ImageView(context);
        this.c = imageView2;
        imageView2.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageView2.setImageResource(R.drawable.arrow_more);
        org.telegram.ui.ActionBar.r6.t(imageView2, i7, null, PorterDuff.Mode.MULTIPLY);
        imageView2.setTranslationY(org.telegram.messenger.g0.L(1.0f));
        imageView2.setVisibility(8);
        if (org.telegram.messenger.id.a0) {
            linearLayout2.addView(imageView2, c8.ha.t(16, 16, 21, 3, 0, 0, 0));
            linearLayout2.addView(textView, c8.ha.r(-2, -2, 21));
        } else {
            linearLayout2.addView(textView, c8.ha.r(-2, -2, 16));
            linearLayout2.addView(imageView2, c8.ha.t(16, 16, 16, 3, 0, 0, 0));
        }
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setTextSize(1, 16.0f);
        org.telegram.ui.ActionBar.r6.V(textView2, org.telegram.ui.ActionBar.k6.o6, null);
        textView2.setGravity(org.telegram.messenger.id.a0 ? 3 : 5);
        if (org.telegram.messenger.id.a0) {
            linearLayout.addView(textView2, c8.ha.r(-2, -2, 19));
            linearLayout.addView(linearLayout2, c8.ha.p(0, -2, 2.0f, 21));
        } else {
            linearLayout.addView(linearLayout2, c8.ha.p(0, -2, 2.0f, 16));
            linearLayout.addView(textView2, c8.ha.r(-2, -2, 21));
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.e) {
            canvas.drawLine(org.telegram.messenger.id.a0 ? 0.0f : org.telegram.messenger.g0.L(64.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (org.telegram.messenger.id.a0 ? org.telegram.messenger.g0.L(64.0f) : 0), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.k6.k0);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(48.0f), TLObject.FLAG_30));
    }
}
