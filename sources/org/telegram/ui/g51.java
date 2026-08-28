package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class g51 extends FrameLayout {
    public final TextView a;
    public final org.telegram.ui.Components.pi0 b;
    public final ImageView c;
    public float d;
    public ValueAnimator e;
    public final /* synthetic */ b61 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g51(b61 b61Var, Context context, boolean z10) {
        super(context);
        this.f = b61Var;
        LinearLayout f10 = org.telegram.messenger.ll.f(context, 0);
        addView(f10, g7.e6.e(-2, -2, z10 ? 3 : 17));
        org.telegram.ui.Components.pi0 pi0Var = new org.telegram.ui.Components.pi0(context);
        this.b = pi0Var;
        pi0Var.f(R.raw.unlock_icon, 20, 20, null);
        int i9 = org.telegram.ui.ActionBar.f6.Te;
        org.telegram.ui.ActionBar.b6 b6Var = b61Var.V0;
        pi0Var.setColorFilter(org.telegram.ui.ActionBar.f6.v0(i9, b6Var));
        f10.addView(pi0Var, g7.e6.n(20, 20));
        TextView textView = new TextView(context);
        this.a = textView;
        textView.setTextColor(org.telegram.ui.ActionBar.f6.v0(i9, b6Var));
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextSize(1, 14.0f);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setLines(1);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        f10.addView(textView, g7.e6.q(-2, -2, 17));
        ImageView imageView = new ImageView(context);
        this.c = imageView;
        imageView.setImageResource(R.drawable.msg_close);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Ve, b6Var), PorterDuff.Mode.MULTIPLY));
        addView(imageView, g7.e6.e(24, 24, 21));
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
        float dp = (1.0f - this.d) * AndroidUtilities.dp(-8.0f);
        org.telegram.ui.Components.pi0 pi0Var = this.b;
        pi0Var.setTranslationX(dp);
        this.a.setTranslationX((1.0f - this.d) * AndroidUtilities.dp(-8.0f));
        pi0Var.setAlpha(this.d);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(i9, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(30.0f), TLObject.FLAG_30));
    }
}
