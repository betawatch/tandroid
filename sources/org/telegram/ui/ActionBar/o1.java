package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import c8.ha;
import org.telegram.messenger.id;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class o1 extends FrameLayout {
    public final TextView a;
    public final ImageView b;

    public o1(Context context, g6 g6Var) {
        super(context);
        int i7 = l6.I5;
        Drawable h02 = l6.h0(l6.w0(i7, g6Var), 2, -1);
        o6 M = s6.M(i7);
        setBackground(h02);
        s6.j(this, h02, null, M, g6Var);
        setPadding(org.telegram.messenger.g0.L(23.0f), 0, org.telegram.messenger.g0.L(23.0f), 0);
        ImageView imageView = new ImageView(context);
        this.b = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        s6.s(imageView, l6.J5, g6Var, PorterDuff.Mode.MULTIPLY);
        addView(imageView, ha.e(-2, 40, (id.a0 ? 5 : 3) | 16));
        TextView textView = new TextView(context);
        this.a = textView;
        textView.setLines(1);
        textView.setSingleLine(true);
        textView.setGravity(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        s6.U(textView, l6.j5, g6Var);
        textView.setTextSize(1, 16.0f);
        addView(textView, ha.e(-2, -2, (id.a0 ? 5 : 3) | 16));
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
            textView.setPadding(id.a0 ? 0 : org.telegram.messenger.g0.L(56.0f), 0, id.a0 ? org.telegram.messenger.g0.L(56.0f) : 0, 0);
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
