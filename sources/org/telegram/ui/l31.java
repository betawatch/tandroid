package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class l31 extends LinearLayout implements org.telegram.ui.ActionBar.c6 {
    public final org.telegram.ui.ActionBar.i6 a;
    public final org.telegram.ui.Components.pa0 b;
    public final FrameLayout c;
    public final ImageView d;
    public final TextView e;
    public final TextView f;
    public final TextView h;
    public boolean n;
    public boolean r;

    public l31(Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context);
        this.n = true;
        this.a = i6Var;
        setOrientation(0);
        FrameLayout frameLayout = new FrameLayout(context);
        this.c = frameLayout;
        org.telegram.ui.Components.pa0 pa0Var = new org.telegram.ui.Components.pa0(1);
        this.b = pa0Var;
        frameLayout.setBackground(pa0Var);
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        frameLayout.addView(imageView, c8.ma.e(24, 24, 17));
        LinearLayout g10 = org.telegram.messenger.f3.g(context, 1);
        TextView textView = new TextView(context);
        this.e = textView;
        textView.setTextSize(1, 16.0f);
        TextView f10 = org.telegram.messenger.n10.f(g10, textView, c8.ma.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2), context);
        this.f = f10;
        f10.setTextSize(1, 13.0f);
        TextView f11 = org.telegram.messenger.n10.f(g10, f10, c8.ma.k(0.0f, 4.0f, 0.0f, 0.0f, -1, -2), context);
        this.h = f11;
        f11.setTextSize(1, 16.0f);
        if (org.telegram.messenger.gd.a0) {
            addView(f11, c8.ma.t(-2, -2, 16, 20, 0, 0, 0));
            addView(g10, c8.ma.q(0, -2, 1.0f, 23, 20, 0, 18, 0));
            addView(frameLayout, c8.ma.t(28, 28, 21, 0, 0, 18, 0));
        } else {
            addView(frameLayout, c8.ma.t(28, 28, 19, 18, 0, 0, 0));
            addView(g10, c8.ma.q(0, -2, 1.0f, 23, 18, 0, 20, 0));
            addView(f11, c8.ma.t(-2, -2, 16, 0, 0, 20, 0));
        }
        updateColors();
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.y6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.n6));
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(this.r ? 60.0f : 50.0f), TLObject.FLAG_30));
    }

    public void setValue(CharSequence charSequence) {
        int i7 = !TextUtils.isEmpty(charSequence) ? 0 : 8;
        TextView textView = this.h;
        textView.setVisibility(i7);
        textView.setText(charSequence);
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final void updateColors() {
        int i7 = org.telegram.ui.ActionBar.n6.G6;
        org.telegram.ui.ActionBar.i6 i6Var = this.a;
        this.e.setTextColor(org.telegram.ui.ActionBar.n6.w0(i7, i6Var));
        this.f.setTextColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.y6, i6Var));
        this.h.setTextColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.n6, i6Var));
        this.b.b = this.n && (i6Var == null ? org.telegram.ui.ActionBar.n6.I.q() : i6Var.d());
    }
}
