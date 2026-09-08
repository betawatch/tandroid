package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class ry extends FrameLayout {
    public final ImageView a;
    public final TextView b;
    public final RadialProgressView c;
    public boolean d;
    public final /* synthetic */ kz e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ry(kz kzVar, Context context) {
        super(context);
        this.e = kzVar;
        ImageView imageView = new ImageView(getContext());
        this.a = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.gif_empty);
        int i10 = org.telegram.ui.ActionBar.j6.Le;
        imageView.setColorFilter(new PorterDuffColorFilter(kzVar.A(i10), PorterDuff.Mode.MULTIPLY));
        addView(imageView, w7.x5.d(-2, -2.0f, 17, 0.0f, 8.0f, 0.0f, 0.0f));
        TextView textView = new TextView(getContext());
        this.b = textView;
        textView.setText(LocaleController.getString(R.string.NoGIFsFound));
        textView.setTextSize(1, 16.0f);
        textView.setTextColor(kzVar.A(i10));
        addView(textView, w7.x5.d(-2, -2.0f, 17, 0.0f, 42.0f, 0.0f, 0.0f));
        RadialProgressView radialProgressView = new RadialProgressView(context, kzVar.Z1);
        this.c = radialProgressView;
        radialProgressView.setVisibility(8);
        radialProgressView.setProgressColor(kzVar.A(org.telegram.ui.ActionBar.j6.h6));
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
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(!this.d ? (int) (org.telegram.messenger.wl.y(8.0f, r0 - r4.b1, 3) * 1.7f) : this.e.h0.getMeasuredHeight() - AndroidUtilities.dp(80.0f), TLObject.FLAG_30));
    }
}
