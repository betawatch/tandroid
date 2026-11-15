package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import c8.ja;
import org.telegram.messenger.hd;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class n1 extends FrameLayout {
    public final TextView a;
    public final ImageView b;

    public n1(Context context, e6 e6Var) {
        super(context);
        int i7 = j6.I5;
        Drawable h02 = j6.h0(j6.w0(i7, e6Var), 2, -1);
        m6 M = q6.M(i7);
        setBackground(h02);
        q6.j(this, h02, null, M, e6Var);
        setPadding(org.telegram.messenger.g0.L(23.0f), 0, org.telegram.messenger.g0.L(23.0f), 0);
        ImageView imageView = new ImageView(context);
        this.b = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        q6.s(imageView, j6.J5, e6Var, PorterDuff.Mode.MULTIPLY);
        addView(imageView, ja.e(-2, 40, (hd.a0 ? 5 : 3) | 16));
        TextView textView = new TextView(context);
        this.a = textView;
        textView.setLines(1);
        textView.setSingleLine(true);
        textView.setGravity(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        q6.U(textView, j6.j5, e6Var);
        textView.setTextSize(1, 16.0f);
        addView(textView, ja.e(-2, -2, (hd.a0 ? 5 : 3) | 16));
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
            textView.setPadding(hd.a0 ? 0 : org.telegram.messenger.g0.L(56.0f), 0, hd.a0 ? org.telegram.messenger.g0.L(56.0f) : 0, 0);
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
