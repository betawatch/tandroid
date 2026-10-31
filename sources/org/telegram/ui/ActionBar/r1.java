package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.cd;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class r1 extends FrameLayout {
    public final TextView a;
    public final ImageView b;

    public r1(Context context, p6 p6Var) {
        super(context);
        int i10 = t6.I5;
        Drawable h02 = t6.h0(t6.w0(i10, p6Var), 2, -1);
        w6 N = a7.N(i10);
        setBackground(h02);
        a7.k(this, h02, null, N, p6Var);
        setPadding(org.telegram.messenger.i0.L(23.0f), 0, org.telegram.messenger.i0.L(23.0f), 0);
        ImageView imageView = new ImageView(context);
        this.b = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        a7.t(imageView, t6.J5, p6Var, PorterDuff.Mode.MULTIPLY);
        addView(imageView, w7.b6.e(-2, 40, (cd.X ? 5 : 3) | 16));
        TextView textView = new TextView(context);
        this.a = textView;
        textView.setLines(1);
        textView.setSingleLine(true);
        textView.setGravity(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        a7.V(textView, t6.j5, p6Var);
        textView.setTextSize(1, 16.0f);
        addView(textView, w7.b6.e(-2, -2, (cd.X ? 5 : 3) | 16));
    }

    public final void a(int i10, CharSequence charSequence) {
        TextView textView = this.a;
        textView.setText(charSequence);
        ImageView imageView = this.b;
        if (i10 == 0) {
            imageView.setVisibility(4);
            textView.setPadding(0, 0, 0, 0);
        } else {
            imageView.setImageResource(i10);
            imageView.setVisibility(0);
            textView.setPadding(cd.X ? 0 : org.telegram.messenger.i0.L(56.0f), 0, cd.X ? org.telegram.messenger.i0.L(56.0f) : 0, 0);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(48.0f), TLObject.FLAG_30));
    }

    public void setGravity(int i10) {
        this.a.setGravity(i10);
    }

    public void setTextColor(int i10) {
        this.a.setTextColor(i10);
    }
}
