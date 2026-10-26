package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class lg1 extends LinearLayout implements org.telegram.ui.ActionBar.p6 {
    public final org.telegram.ui.ActionBar.u6 a;
    public final ImageView b;
    public final LinearLayout c;
    public final TextView d;
    public final TextView e;
    public final ImageView f;
    public boolean h;
    public boolean n;
    public int r;

    public lg1(Context context, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context);
        setOrientation(0);
        this.a = u6Var;
        ImageView imageView = new ImageView(context);
        this.b = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        addView(imageView, org.telegram.ui.Components.gb1.x(40, 40, 19, 12, 0, 12, 0));
        LinearLayout linearLayout = new LinearLayout(context);
        this.c = linearLayout;
        linearLayout.setOrientation(1);
        linearLayout.setPadding(0, AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f));
        addView(linearLayout, org.telegram.ui.Components.gb1.t(0, -2, 1.0f, 23, 0, 0, 32, 0));
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setTextSize(1, 16.0f);
        TextView e = org.telegram.messenger.vh.e(linearLayout, textView, org.telegram.ui.Components.gb1.x(-1, -2, 7, 0, 0, 0, 0), context);
        this.e = e;
        e.setTextSize(1, 13.0f);
        linearLayout.addView(e, org.telegram.ui.Components.gb1.v(-1, -2, 7, 0.0f, 4.33f, 0.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.f = imageView2;
        imageView2.setScaleType(scaleType);
        addView(imageView2, org.telegram.ui.Components.gb1.x(40, 40, 21, 12, 0, 12, 0));
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), i11);
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final void updateColors() {
        int i10 = this.n ? org.telegram.ui.ActionBar.y6.q7 : this.h ? org.telegram.ui.ActionBar.y6.n6 : org.telegram.ui.ActionBar.y6.G6;
        org.telegram.ui.ActionBar.u6 u6Var = this.a;
        int w02 = org.telegram.ui.ActionBar.y6.w0(i10, u6Var);
        int i11 = this.r;
        ImageView imageView = this.f;
        ImageView imageView2 = this.b;
        if (w02 != i11 || imageView2.getColorFilter() == null || imageView.getColorFilter() == null) {
            this.r = w02;
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            imageView2.setColorFilter(new PorterDuffColorFilter(w02, mode));
            imageView.setColorFilter(new PorterDuffColorFilter(w02, mode));
        }
        this.d.setTextColor(org.telegram.ui.ActionBar.y6.w0(this.n ? org.telegram.ui.ActionBar.y6.p7 : this.h ? org.telegram.ui.ActionBar.y6.n6 : org.telegram.ui.ActionBar.y6.G6, u6Var));
        this.e.setTextColor(org.telegram.ui.ActionBar.y6.w0(this.n ? org.telegram.ui.ActionBar.y6.p7 : this.h ? org.telegram.ui.ActionBar.y6.n6 : org.telegram.ui.ActionBar.y6.y6, u6Var));
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
