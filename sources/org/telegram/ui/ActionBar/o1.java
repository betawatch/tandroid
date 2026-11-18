package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import c8.ma;
import org.telegram.messenger.gd;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class o1 extends FrameLayout {
    public final TextView a;
    public final ImageView b;

    public o1(Context context, i6 i6Var) {
        super(context);
        int i7 = n6.I5;
        Drawable h02 = n6.h0(n6.w0(i7, i6Var), 2, -1);
        q6 M = u6.M(i7);
        setBackground(h02);
        u6.j(this, h02, null, M, i6Var);
        setPadding(org.telegram.messenger.g0.L(23.0f), 0, org.telegram.messenger.g0.L(23.0f), 0);
        ImageView imageView = new ImageView(context);
        this.b = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        u6.s(imageView, n6.J5, i6Var, PorterDuff.Mode.MULTIPLY);
        addView(imageView, ma.e(-2, 40, (gd.a0 ? 5 : 3) | 16));
        TextView textView = new TextView(context);
        this.a = textView;
        textView.setLines(1);
        textView.setSingleLine(true);
        textView.setGravity(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        u6.U(textView, n6.j5, i6Var);
        textView.setTextSize(1, 16.0f);
        addView(textView, ma.e(-2, -2, (gd.a0 ? 5 : 3) | 16));
    }

    public final void a(int i7, CharSequence charSequence) {
        TextView textView = this.a;
        textView.setText(charSequence);
        ImageView imageView = this.b;
        if (i7 == 0) {
            imageView.setVisibility(4);
            textView.setPadding(0, 0, 0, 0);
        } else {
            imageView.setImageResource(i7);
            imageView.setVisibility(0);
            textView.setPadding(gd.a0 ? 0 : org.telegram.messenger.g0.L(56.0f), 0, gd.a0 ? org.telegram.messenger.g0.L(56.0f) : 0, 0);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(48.0f), TLObject.FLAG_30));
    }

    public void setGravity(int i7) {
        this.a.setGravity(i7);
    }

    public void setTextColor(int i7) {
        this.a.setTextColor(i7);
    }
}
