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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class i51 extends FrameLayout {
    public final TextView a;
    public final org.telegram.ui.Components.aj0 b;
    public final ImageView c;
    public float d;
    public ValueAnimator e;
    public final /* synthetic */ d61 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i51(d61 d61Var, Context context, boolean z10) {
        super(context);
        this.f = d61Var;
        LinearLayout g10 = org.telegram.messenger.x3.g(context, 0);
        addView(g10, i7.f6.e(-2, -2, z10 ? 3 : 17));
        org.telegram.ui.Components.aj0 aj0Var = new org.telegram.ui.Components.aj0(context);
        this.b = aj0Var;
        aj0Var.f(R.raw.unlock_icon, 20, 20, null);
        int i10 = org.telegram.ui.ActionBar.g6.Te;
        org.telegram.ui.ActionBar.c6 c6Var = d61Var.V0;
        aj0Var.setColorFilter(org.telegram.ui.ActionBar.g6.v0(i10, c6Var));
        g10.addView(aj0Var, i7.f6.n(20, 20));
        TextView textView = new TextView(context);
        this.a = textView;
        textView.setTextColor(org.telegram.ui.ActionBar.g6.v0(i10, c6Var));
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextSize(1, 14.0f);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setLines(1);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        g10.addView(textView, i7.f6.q(-2, -2, 17));
        ImageView imageView = new ImageView(context);
        this.c = imageView;
        imageView.setImageResource(R.drawable.msg_close);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Ve, c6Var), PorterDuff.Mode.MULTIPLY));
        addView(imageView, i7.f6.e(24, 24, 21));
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
        org.telegram.ui.Components.aj0 aj0Var = this.b;
        aj0Var.setTranslationX(dp);
        this.a.setTranslationX((1.0f - this.d) * AndroidUtilities.dp(-8.0f));
        aj0Var.setAlpha(this.d);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(30.0f), TLObject.FLAG_30));
    }
}
