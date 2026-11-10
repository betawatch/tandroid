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

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class jb1 extends LinearLayout implements org.telegram.ui.ActionBar.c6 {
    public final org.telegram.ui.ActionBar.h6 a;
    public final ImageView b;
    public final LinearLayout c;
    public final TextView d;
    public final TextView e;
    public final ImageView f;
    public boolean h;
    public boolean n;
    public int r;

    public jb1(Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        setOrientation(0);
        this.a = h6Var;
        ImageView imageView = new ImageView(context);
        this.b = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        addView(imageView, c8.ha.t(40, 40, 19, 12, 0, 12, 0));
        LinearLayout linearLayout = new LinearLayout(context);
        this.c = linearLayout;
        linearLayout.setOrientation(1);
        linearLayout.setPadding(0, org.telegram.messenger.g0.L(10.0f), 0, org.telegram.messenger.g0.L(10.0f));
        addView(linearLayout, c8.ha.q(0, -2, 1.0f, 23, 0, 0, 32, 0));
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setTextSize(1, 16.0f);
        TextView f10 = org.telegram.messenger.camera.q.f(linearLayout, textView, c8.ha.t(-1, -2, 7, 0, 0, 0, 0), context);
        this.e = f10;
        f10.setTextSize(1, 13.0f);
        linearLayout.addView(f10, c8.ha.s(-1, -2, 7, 0.0f, 4.33f, 0.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.f = imageView2;
        imageView2.setScaleType(scaleType);
        addView(imageView2, c8.ha.t(40, 40, 21, 12, 0, 12, 0));
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), TLObject.FLAG_30), i10);
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final void updateColors() {
        int i7 = this.n ? org.telegram.ui.ActionBar.m6.q7 : this.h ? org.telegram.ui.ActionBar.m6.n6 : org.telegram.ui.ActionBar.m6.G6;
        org.telegram.ui.ActionBar.h6 h6Var = this.a;
        int w02 = org.telegram.ui.ActionBar.m6.w0(i7, h6Var);
        int i10 = this.r;
        ImageView imageView = this.f;
        ImageView imageView2 = this.b;
        if (w02 != i10 || imageView2.getColorFilter() == null || imageView.getColorFilter() == null) {
            this.r = w02;
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            imageView2.setColorFilter(new PorterDuffColorFilter(w02, mode));
            imageView.setColorFilter(new PorterDuffColorFilter(w02, mode));
        }
        this.d.setTextColor(org.telegram.ui.ActionBar.m6.w0(this.n ? org.telegram.ui.ActionBar.m6.p7 : this.h ? org.telegram.ui.ActionBar.m6.n6 : org.telegram.ui.ActionBar.m6.G6, h6Var));
        this.e.setTextColor(org.telegram.ui.ActionBar.m6.w0(this.n ? org.telegram.ui.ActionBar.m6.p7 : this.h ? org.telegram.ui.ActionBar.m6.n6 : org.telegram.ui.ActionBar.m6.y6, h6Var));
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
