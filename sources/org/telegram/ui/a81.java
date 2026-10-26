package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class a81 extends LinearLayout implements org.telegram.ui.ActionBar.p6 {
    public final org.telegram.ui.ActionBar.u6 a;
    public final org.telegram.ui.Components.ic0 b;
    public final FrameLayout c;
    public final ImageView d;
    public final TextView e;
    public final TextView f;
    public final TextView h;
    public boolean n;
    public boolean r;

    public a81(Context context, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context);
        this.n = true;
        this.a = u6Var;
        setOrientation(0);
        FrameLayout frameLayout = new FrameLayout(context);
        this.c = frameLayout;
        org.telegram.ui.Components.ic0 ic0Var = new org.telegram.ui.Components.ic0(1);
        this.b = ic0Var;
        frameLayout.setBackground(ic0Var);
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        frameLayout.addView(imageView, org.telegram.ui.Components.gb1.i(24, 24, 17));
        LinearLayout d = org.telegram.messenger.vh.d(context, 1);
        TextView textView = new TextView(context);
        this.e = textView;
        textView.setTextSize(1, 16.0f);
        TextView e = org.telegram.messenger.vh.e(d, textView, org.telegram.ui.Components.gb1.o(0.0f, 0.0f, 0.0f, 0.0f, -1, -2), context);
        this.f = e;
        e.setTextSize(1, 13.0f);
        TextView e10 = org.telegram.messenger.vh.e(d, e, org.telegram.ui.Components.gb1.o(0.0f, 4.0f, 0.0f, 0.0f, -1, -2), context);
        this.h = e10;
        e10.setTextSize(1, 16.0f);
        if (LocaleController.isRTL) {
            addView(e10, org.telegram.ui.Components.gb1.x(-2, -2, 16, 20, 0, 0, 0));
            addView(d, org.telegram.ui.Components.gb1.t(0, -2, 1.0f, 23, 20, 0, 18, 0));
            addView(frameLayout, org.telegram.ui.Components.gb1.x(28, 28, 21, 0, 0, 18, 0));
        } else {
            addView(frameLayout, org.telegram.ui.Components.gb1.x(28, 28, 19, 18, 0, 0, 0));
            addView(d, org.telegram.ui.Components.gb1.t(0, -2, 1.0f, 23, 18, 0, 20, 0));
            addView(e10, org.telegram.ui.Components.gb1.x(-2, -2, 16, 0, 0, 20, 0));
        }
        updateColors();
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.y6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.n6));
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(this.r ? 60.0f : 50.0f), TLObject.FLAG_30));
    }

    public void setValue(CharSequence charSequence) {
        int i10 = !TextUtils.isEmpty(charSequence) ? 0 : 8;
        TextView textView = this.h;
        textView.setVisibility(i10);
        textView.setText(charSequence);
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final void updateColors() {
        int i10 = org.telegram.ui.ActionBar.y6.G6;
        org.telegram.ui.ActionBar.u6 u6Var = this.a;
        this.e.setTextColor(org.telegram.ui.ActionBar.y6.w0(i10, u6Var));
        this.f.setTextColor(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.y6, u6Var));
        this.h.setTextColor(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.n6, u6Var));
        this.b.b = this.n && (u6Var == null ? org.telegram.ui.ActionBar.y6.I.q() : u6Var.a());
    }
}
