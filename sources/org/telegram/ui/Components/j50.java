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

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class j50 extends FrameLayout implements org.telegram.ui.ActionBar.a6 {
    public final ImageView a;
    public final TextView b;
    public final TextView c;
    public int d;
    public int e;
    public final /* synthetic */ m50 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j50(m50 m50Var, Context context) {
        super(context);
        this.f = m50Var;
        ImageView imageView = new ImageView(context);
        this.a = imageView;
        imageView.setBackground(org.telegram.ui.ActionBar.k6.M(46, org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.R7, false), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Y7, false)));
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setImageResource(R.drawable.large_income);
        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        addView(imageView, c8.ha.d(46, 46.0f, 19, 13.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.b = textView;
        com.google.android.recaptcha.internal.a.q(textView, 1, 16.0f);
        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.G6, null);
        addView(textView, c8.ha.d(-1, -2.0f, 51, 72.0f, 9.0f, 0.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.c = textView2;
        textView2.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.r6.V(textView2, org.telegram.ui.ActionBar.k6.y6, null);
        addView(textView2, c8.ha.d(-1, -2.0f, 51, 72.0f, 32.0f, 0.0f, 0.0f));
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(58.0f), TLObject.FLAG_30));
    }

    @Override // org.telegram.ui.ActionBar.a6
    public final void updateColors() {
        int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.R7, false);
        int x03 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Y7, false);
        ImageView imageView = this.a;
        if (imageView != null) {
            if (x02 == this.d && x03 == this.e) {
                return;
            }
            this.d = x02;
            this.e = x03;
            imageView.setBackground(org.telegram.ui.ActionBar.k6.M(46, x02, x03));
            invalidate();
        }
    }

    @Override // org.telegram.ui.ActionBar.a6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
