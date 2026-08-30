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

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class qy extends FrameLayout {
    public final ImageView a;
    public final TextView b;
    public final RadialProgressView c;
    public boolean d;
    public final /* synthetic */ kz e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qy(kz kzVar, Context context) {
        super(context);
        this.e = kzVar;
        ImageView imageView = new ImageView(getContext());
        this.a = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.gif_empty);
        int i10 = org.telegram.ui.ActionBar.j6.Le;
        imageView.setColorFilter(new PorterDuffColorFilter(kzVar.A(i10), PorterDuff.Mode.MULTIPLY));
        addView(imageView, k7.b6.d(-2, -2.0f, 17, 0.0f, 8.0f, 0.0f, 0.0f));
        TextView textView = new TextView(getContext());
        this.b = textView;
        textView.setText(LocaleController.getString(R.string.NoGIFsFound));
        textView.setTextSize(1, 16.0f);
        textView.setTextColor(kzVar.A(i10));
        addView(textView, k7.b6.d(-2, -2.0f, 17, 0.0f, 42.0f, 0.0f, 0.0f));
        RadialProgressView radialProgressView = new RadialProgressView(context, kzVar.W1);
        this.c = radialProgressView;
        radialProgressView.setVisibility(8);
        radialProgressView.setProgressColor(kzVar.A(org.telegram.ui.ActionBar.j6.h6));
        addView(radialProgressView, k7.b6.e(-2, -2, 17));
    }

    public final void a(boolean z4) {
        if (this.d != z4) {
            this.d = z4;
            this.a.setVisibility(z4 ? 8 : 0);
            this.b.setVisibility(z4 ? 8 : 0);
            this.c.setVisibility(z4 ? 0 : 8);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(!this.d ? (int) (org.telegram.ui.b.x(8.0f, r0 - r4.Y0, 3) * 1.7f) : this.e.e0.getMeasuredHeight() - AndroidUtilities.dp(80.0f), TLObject.FLAG_30));
    }
}
