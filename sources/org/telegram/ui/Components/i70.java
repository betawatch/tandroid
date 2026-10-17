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

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final class i70 extends FrameLayout {
    public final TextView a;
    public final TextView b;
    public final /* synthetic */ l70 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i70(l70 l70Var, Context context) {
        super(context);
        this.c = l70Var;
        ImageView imageView = new ImageView(context);
        imageView.setBackground(org.telegram.ui.ActionBar.h6.L(46, org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.R7, false), org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Y7, false)));
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setImageResource(R.drawable.large_income);
        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        addView(imageView, w7.z5.a(46.0f, 13.0f, 0.0f, 0.0f, 0.0f, 46, 19));
        TextView textView = new TextView(context);
        this.a = textView;
        com.google.android.gms.internal.cast.a6.m(16.0f, 1, textView);
        textView.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.G6, false));
        addView(textView, w7.z5.a(-2.0f, 72.0f, 9.0f, 0.0f, 0.0f, -1, 51));
        TextView textView2 = new TextView(context);
        this.b = textView2;
        textView2.setTextSize(1, 14.0f);
        textView2.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.y6, false));
        addView(textView2, w7.z5.a(-2.0f, 72.0f, 32.0f, 0.0f, 0.0f, -1, 51));
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(58.0f), TLObject.FLAG_30));
    }
}
