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

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class m21 extends FrameLayout {
    public final TextView a;
    public final org.telegram.ui.Components.fi0 b;
    public final ImageView c;
    public float d;
    public ValueAnimator e;
    public final /* synthetic */ g31 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m21(g31 g31Var, Context context, boolean z10) {
        super(context);
        this.f = g31Var;
        LinearLayout f7 = org.telegram.messenger.m5.f(context, 0);
        addView(f7, w7.b6.e(-2, -2, z10 ? 3 : 17));
        org.telegram.ui.Components.fi0 fi0Var = new org.telegram.ui.Components.fi0(context);
        this.b = fi0Var;
        fi0Var.f(R.raw.unlock_icon, 20, 20, null);
        int i10 = org.telegram.ui.ActionBar.t6.If;
        org.telegram.ui.ActionBar.p6 p6Var = g31Var.Z0;
        org.telegram.ui.ActionBar.a7.t(fi0Var, i10, p6Var, PorterDuff.Mode.SRC_ATOP);
        f7.addView(fi0Var, w7.b6.o(20, 20));
        TextView textView = new TextView(context);
        this.a = textView;
        org.telegram.ui.ActionBar.a7.V(textView, i10, p6Var);
        textView.setTypeface(org.telegram.messenger.i0.o());
        textView.setTextSize(1, 14.0f);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setLines(1);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        f7.addView(textView, w7.b6.r(-2, -2, 17));
        ImageView imageView = new ImageView(context);
        this.c = imageView;
        imageView.setImageResource(R.drawable.msg_close);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        org.telegram.ui.ActionBar.a7.t(imageView, org.telegram.ui.ActionBar.t6.Kf, p6Var, PorterDuff.Mode.MULTIPLY);
        addView(imageView, w7.b6.e(24, 24, 21));
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
        float L = (1.0f - this.d) * org.telegram.messenger.i0.L(-8.0f);
        org.telegram.ui.Components.fi0 fi0Var = this.b;
        fi0Var.setTranslationX(L);
        this.a.setTranslationX((1.0f - this.d) * org.telegram.messenger.i0.L(-8.0f));
        fi0Var.setAlpha(this.d);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(30.0f), TLObject.FLAG_30));
    }
}
