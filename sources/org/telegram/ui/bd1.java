package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class bd1 extends LinearLayout implements org.telegram.ui.ActionBar.k6 {
    public final org.telegram.ui.ActionBar.p6 a;
    public final ImageView b;
    public final LinearLayout c;
    public final TextView d;
    public final TextView e;
    public final ImageView f;
    public boolean h;
    public boolean n;
    public int r;

    public bd1(Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        setOrientation(0);
        this.a = p6Var;
        ImageView imageView = new ImageView(context);
        this.b = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        addView(imageView, w7.b6.t(40, 40, 19, 12, 0, 12, 0));
        LinearLayout linearLayout = new LinearLayout(context);
        this.c = linearLayout;
        linearLayout.setOrientation(1);
        linearLayout.setPadding(0, org.telegram.messenger.i0.L(10.0f), 0, org.telegram.messenger.i0.L(10.0f));
        addView(linearLayout, w7.b6.q(0, -2, 1.0f, 23, 0, 0, 32, 0));
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setTextSize(1, 16.0f);
        TextView f7 = org.telegram.messenger.z20.f(linearLayout, textView, w7.b6.t(-1, -2, 7, 0, 0, 0, 0), context);
        this.e = f7;
        f7.setTextSize(1, 13.0f);
        linearLayout.addView(f7, w7.b6.s(-1, -2, 7, 0.0f, 4.33f, 0.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.f = imageView2;
        imageView2.setScaleType(scaleType);
        addView(imageView2, w7.b6.t(40, 40, 21, 12, 0, 12, 0));
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), i11);
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void updateColors() {
        int i10 = this.n ? org.telegram.ui.ActionBar.t6.q7 : this.h ? org.telegram.ui.ActionBar.t6.n6 : org.telegram.ui.ActionBar.t6.G6;
        org.telegram.ui.ActionBar.p6 p6Var = this.a;
        int w02 = org.telegram.ui.ActionBar.t6.w0(i10, p6Var);
        int i11 = this.r;
        ImageView imageView = this.f;
        ImageView imageView2 = this.b;
        if (w02 != i11 || imageView2.getColorFilter() == null || imageView.getColorFilter() == null) {
            this.r = w02;
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            imageView2.setColorFilter(new PorterDuffColorFilter(w02, mode));
            imageView.setColorFilter(new PorterDuffColorFilter(w02, mode));
        }
        this.d.setTextColor(org.telegram.ui.ActionBar.t6.w0(this.n ? org.telegram.ui.ActionBar.t6.p7 : this.h ? org.telegram.ui.ActionBar.t6.n6 : org.telegram.ui.ActionBar.t6.G6, p6Var));
        this.e.setTextColor(org.telegram.ui.ActionBar.t6.w0(this.n ? org.telegram.ui.ActionBar.t6.p7 : this.h ? org.telegram.ui.ActionBar.t6.n6 : org.telegram.ui.ActionBar.t6.y6, p6Var));
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
