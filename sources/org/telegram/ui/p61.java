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

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class p61 extends FrameLayout {
    public final TextView a;
    public final org.telegram.ui.Components.fk0 b;
    public final ImageView c;
    public float d;
    public ValueAnimator e;
    public final /* synthetic */ k71 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p61(k71 k71Var, Context context, boolean z10) {
        super(context);
        this.f = k71Var;
        LinearLayout e7 = org.telegram.messenger.bi.e(context, 0);
        addView(e7, w7.x5.e(-2, -2, z10 ? 3 : 17));
        org.telegram.ui.Components.fk0 fk0Var = new org.telegram.ui.Components.fk0(context);
        this.b = fk0Var;
        fk0Var.f(R.raw.unlock_icon, 20, 20, null);
        int i10 = org.telegram.ui.ActionBar.i6.Te;
        org.telegram.ui.ActionBar.e6 e6Var = k71Var.Z0;
        fk0Var.setColorFilter(org.telegram.ui.ActionBar.i6.w0(i10, e6Var));
        e7.addView(fk0Var, w7.x5.n(20, 20));
        TextView textView = new TextView(context);
        this.a = textView;
        textView.setTextColor(org.telegram.ui.ActionBar.i6.w0(i10, e6Var));
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextSize(1, 14.0f);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setLines(1);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        e7.addView(textView, w7.x5.q(-2, -2, 17));
        ImageView imageView = new ImageView(context);
        this.c = imageView;
        imageView.setImageResource(R.drawable.msg_close);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.Ve, e6Var), PorterDuff.Mode.MULTIPLY));
        addView(imageView, w7.x5.e(24, 24, 21));
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
        org.telegram.ui.Components.fk0 fk0Var = this.b;
        fk0Var.setTranslationX(dp);
        this.a.setTranslationX((1.0f - this.d) * AndroidUtilities.dp(-8.0f));
        fk0Var.setAlpha(this.d);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(30.0f), TLObject.FLAG_30));
    }
}
