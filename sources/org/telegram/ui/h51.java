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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class h51 extends FrameLayout {
    public final TextView a;
    public final org.telegram.ui.Components.ak0 b;
    public final ImageView c;
    public float d;
    public ValueAnimator e;
    public final /* synthetic */ c61 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h51(c61 c61Var, Context context, boolean z10) {
        super(context);
        this.f = c61Var;
        LinearLayout d = org.telegram.messenger.vh.d(context, 0);
        addView(d, org.telegram.ui.Components.gb1.i(-2, -2, z10 ? 3 : 17));
        org.telegram.ui.Components.ak0 ak0Var = new org.telegram.ui.Components.ak0(context);
        this.b = ak0Var;
        ak0Var.f(R.raw.unlock_icon, 20, 20, null);
        int i10 = org.telegram.ui.ActionBar.y6.Te;
        org.telegram.ui.ActionBar.u6 u6Var = c61Var.Z0;
        org.telegram.ui.ActionBar.f7.t(ak0Var, i10, u6Var, PorterDuff.Mode.SRC_ATOP);
        d.addView(ak0Var, org.telegram.ui.Components.gb1.r(20, 20));
        TextView textView = new TextView(context);
        this.a = textView;
        org.telegram.ui.ActionBar.f7.V(textView, i10, u6Var);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextSize(1, 14.0f);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setLines(1);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        d.addView(textView, org.telegram.ui.Components.gb1.u(-2, -2, 17));
        ImageView imageView = new ImageView(context);
        this.c = imageView;
        imageView.setImageResource(R.drawable.msg_close);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        org.telegram.ui.ActionBar.f7.t(imageView, org.telegram.ui.ActionBar.y6.Ve, u6Var, PorterDuff.Mode.MULTIPLY);
        addView(imageView, org.telegram.ui.Components.gb1.i(24, 24, 21));
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
        org.telegram.ui.Components.ak0 ak0Var = this.b;
        ak0Var.setTranslationX(dp);
        this.a.setTranslationX((1.0f - this.d) * AndroidUtilities.dp(-8.0f));
        ak0Var.setAlpha(this.d);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(30.0f), TLObject.FLAG_30));
    }
}
