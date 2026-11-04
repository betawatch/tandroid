package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import b8.mf;
import org.telegram.messenger.bd;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class m1 extends FrameLayout {
    public final TextView a;
    public final ImageView b;

    public m1(Context context, e6 e6Var) {
        super(context);
        int i3 = k6.I5;
        Drawable h02 = k6.h0(k6.w0(i3, e6Var), 2, -1);
        n6 N = r6.N(i3);
        setBackground(h02);
        r6.k(this, h02, null, N, e6Var);
        setPadding(org.telegram.messenger.g0.L(23.0f), 0, org.telegram.messenger.g0.L(23.0f), 0);
        ImageView imageView = new ImageView(context);
        this.b = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        r6.t(imageView, k6.J5, e6Var, PorterDuff.Mode.MULTIPLY);
        addView(imageView, mf.e(-2, 40, (bd.a0 ? 5 : 3) | 16));
        TextView textView = new TextView(context);
        this.a = textView;
        textView.setLines(1);
        textView.setSingleLine(true);
        textView.setGravity(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        r6.V(textView, k6.j5, e6Var);
        textView.setTextSize(1, 16.0f);
        addView(textView, mf.e(-2, -2, (bd.a0 ? 5 : 3) | 16));
    }

    public final void a(int i3, CharSequence charSequence) {
        TextView textView = this.a;
        textView.setText(charSequence);
        ImageView imageView = this.b;
        if (i3 == 0) {
            imageView.setVisibility(4);
            textView.setPadding(0, 0, 0, 0);
        } else {
            imageView.setImageResource(i3);
            imageView.setVisibility(0);
            textView.setPadding(bd.a0 ? 0 : org.telegram.messenger.g0.L(56.0f), 0, bd.a0 ? org.telegram.messenger.g0.L(56.0f) : 0, 0);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(i3, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(48.0f), TLObject.FLAG_30));
    }

    public void setGravity(int i3) {
        this.a.setGravity(i3);
    }

    public void setTextColor(int i3) {
        this.a.setTextColor(i3);
    }
}
