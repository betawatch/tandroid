package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class gz extends FrameLayout {
    public final ImageView a;
    public final TextView b;
    public final RadialProgressView c;
    public boolean d;
    public final /* synthetic */ a00 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gz(a00 a00Var, Context context) {
        super(context);
        this.e = a00Var;
        ImageView imageView = new ImageView(getContext());
        this.a = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.gif_empty);
        int i10 = org.telegram.ui.ActionBar.i6.Le;
        imageView.setColorFilter(new PorterDuffColorFilter(a00Var.B(i10), PorterDuff.Mode.MULTIPLY));
        addView(imageView, w7.x5.a(-2.0f, 0.0f, 8.0f, 0.0f, 0.0f, -2, 17));
        TextView textView = new TextView(getContext());
        this.b = textView;
        org.telegram.messenger.bi.j(16.0f, R.string.NoGIFsFound, 1, textView);
        textView.setTextColor(a00Var.B(i10));
        addView(textView, w7.x5.a(-2.0f, 0.0f, 42.0f, 0.0f, 0.0f, -2, 17));
        RadialProgressView radialProgressView = new RadialProgressView(context, a00Var.Z1);
        this.c = radialProgressView;
        radialProgressView.setVisibility(8);
        radialProgressView.setProgressColor(a00Var.B(org.telegram.ui.ActionBar.i6.h6));
        addView(radialProgressView, w7.x5.e(-2, -2, 17));
    }

    public final void a(boolean z10) {
        if (this.d != z10) {
            this.d = z10;
            this.a.setVisibility(z10 ? 8 : 0);
            this.b.setVisibility(z10 ? 8 : 0);
            this.c.setVisibility(z10 ? 0 : 8);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(!this.d ? (int) (org.telegram.messenger.bi.A(8.0f, r0 - r4.b1, 3) * 1.7f) : this.e.h0.getMeasuredHeight() - AndroidUtilities.dp(80.0f), TLObject.FLAG_30));
    }
}
