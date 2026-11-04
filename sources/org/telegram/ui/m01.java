package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class m01 extends FrameLayout {
    public final TextView a;
    public final org.telegram.ui.Components.fh0 b;
    public final ImageView c;
    public float d;
    public ValueAnimator e;
    public final /* synthetic */ g11 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m01(g11 g11Var, Context context, boolean z10) {
        super(context);
        this.f = g11Var;
        LinearLayout f10 = org.telegram.messenger.k5.f(context, 0);
        addView(f10, b8.mf.e(-2, -2, z10 ? 3 : 17));
        org.telegram.ui.Components.fh0 fh0Var = new org.telegram.ui.Components.fh0(context);
        this.b = fh0Var;
        fh0Var.f(R.raw.unlock_icon, 20, 20, null);
        int i3 = org.telegram.ui.ActionBar.k6.If;
        org.telegram.ui.ActionBar.e6 e6Var = g11Var.a1;
        org.telegram.ui.ActionBar.r6.t(fh0Var, i3, e6Var, PorterDuff.Mode.SRC_ATOP);
        f10.addView(fh0Var, b8.mf.o(20, 20));
        TextView textView = new TextView(context);
        this.a = textView;
        org.telegram.ui.ActionBar.r6.V(textView, i3, e6Var);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setTextSize(1, 14.0f);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setLines(1);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        f10.addView(textView, b8.mf.r(-2, -2, 17));
        ImageView imageView = new ImageView(context);
        this.c = imageView;
        imageView.setImageResource(R.drawable.msg_close);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        org.telegram.ui.ActionBar.r6.t(imageView, org.telegram.ui.ActionBar.k6.Kf, e6Var, PorterDuff.Mode.MULTIPLY);
        addView(imageView, b8.mf.e(24, 24, 21));
    }

    public final void a(String str, boolean z10) {
        this.a.setText(str);
        b(z10);
    }

    public final void b(boolean z10) {
        ValueAnimator valueAnimator = this.e;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.e = null;
        }
        this.d = z10 ? 1.0f : 0.0f;
        float L = (1.0f - this.d) * org.telegram.messenger.g0.L(-8.0f);
        org.telegram.ui.Components.fh0 fh0Var = this.b;
        fh0Var.setTranslationX(L);
        this.a.setTranslationX((1.0f - this.d) * org.telegram.messenger.g0.L(-8.0f));
        fh0Var.setAlpha(this.d);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(i3, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(30.0f), TLObject.FLAG_30));
    }
}
