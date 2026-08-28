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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class dy extends FrameLayout {
    public final ImageView a;
    public final TextView b;
    public final RadialProgressView c;
    public boolean d;
    public final /* synthetic */ wy e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dy(wy wyVar, Context context) {
        super(context);
        this.e = wyVar;
        ImageView imageView = new ImageView(getContext());
        this.a = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.gif_empty);
        int i9 = org.telegram.ui.ActionBar.f6.Le;
        imageView.setColorFilter(new PorterDuffColorFilter(wyVar.z(i9), PorterDuff.Mode.MULTIPLY));
        addView(imageView, g7.e6.d(-2, -2.0f, 17, 0.0f, 8.0f, 0.0f, 0.0f));
        TextView textView = new TextView(getContext());
        this.b = textView;
        textView.setText(LocaleController.getString(R.string.NoGIFsFound));
        textView.setTextSize(1, 16.0f);
        textView.setTextColor(wyVar.z(i9));
        addView(textView, g7.e6.d(-2, -2.0f, 17, 0.0f, 42.0f, 0.0f, 0.0f));
        RadialProgressView radialProgressView = new RadialProgressView(context, wyVar.V1);
        this.c = radialProgressView;
        radialProgressView.setVisibility(8);
        radialProgressView.setProgressColor(wyVar.z(org.telegram.ui.ActionBar.f6.h6));
        addView(radialProgressView, g7.e6.e(-2, -2, 17));
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
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(i9, View.MeasureSpec.makeMeasureSpec(!this.d ? (int) (org.telegram.messenger.ll.y(8.0f, r0 - r4.X0, 3) * 1.7f) : this.e.d0.getMeasuredHeight() - AndroidUtilities.dp(80.0f), TLObject.FLAG_30));
    }
}
