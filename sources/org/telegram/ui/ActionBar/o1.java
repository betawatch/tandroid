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
import org.telegram.messenger.hd;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class o1 extends FrameLayout {
    public final TextView a;
    public final ImageView b;

    public o1(Context context, f6 f6Var) {
        super(context);
        int i7 = k6.I5;
        Drawable h02 = k6.h0(k6.w0(i7, f6Var), 2, -1);
        n6 N = r6.N(i7);
        setBackground(h02);
        r6.k(this, h02, null, N, f6Var);
        setPadding(org.telegram.messenger.g0.L(23.0f), 0, org.telegram.messenger.g0.L(23.0f), 0);
        ImageView imageView = new ImageView(context);
        this.b = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        r6.t(imageView, k6.J5, f6Var, PorterDuff.Mode.MULTIPLY);
        addView(imageView, ha.e(-2, 40, (hd.a0 ? 5 : 3) | 16));
        TextView textView = new TextView(context);
        this.a = textView;
        textView.setLines(1);
        textView.setSingleLine(true);
        textView.setGravity(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        r6.V(textView, k6.j5, f6Var);
        textView.setTextSize(1, 16.0f);
        addView(textView, ha.e(-2, -2, (hd.a0 ? 5 : 3) | 16));
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
