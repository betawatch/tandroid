package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class z50 extends FrameLayout implements org.telegram.ui.ActionBar.k6 {
    public final ImageView a;
    public final TextView b;
    public final TextView c;
    public int d;
    public int e;
    public final /* synthetic */ c60 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z50(c60 c60Var, Context context) {
        super(context);
        this.f = c60Var;
        ImageView imageView = new ImageView(context);
        this.a = imageView;
        imageView.setBackground(org.telegram.ui.ActionBar.t6.M(46, org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.R7, false), org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Y7, false)));
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setImageResource(R.drawable.large_income);
        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        addView(imageView, w7.b6.d(46, 46.0f, 19, 13.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.b = textView;
        sc.e.t(textView, 1, 16.0f);
        org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.G6, null);
        addView(textView, w7.b6.d(-1, -2.0f, 51, 72.0f, 9.0f, 0.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.c = textView2;
        textView2.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.a7.V(textView2, org.telegram.ui.ActionBar.t6.y6, null);
        addView(textView2, w7.b6.d(-1, -2.0f, 51, 72.0f, 32.0f, 0.0f, 0.0f));
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(58.0f), TLObject.FLAG_30));
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void updateColors() {
        int x02 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.R7, false);
        int x03 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Y7, false);
        ImageView imageView = this.a;
        if (imageView != null) {
            if (x02 == this.d && x03 == this.e) {
                return;
            }
            this.d = x02;
            this.e = x03;
            imageView.setBackground(org.telegram.ui.ActionBar.t6.M(46, x02, x03));
            invalidate();
        }
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
