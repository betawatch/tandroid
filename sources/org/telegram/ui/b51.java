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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class b51 extends LinearLayout implements org.telegram.ui.ActionBar.k6 {
    public final org.telegram.ui.ActionBar.p6 a;
    public final org.telegram.ui.Components.va0 b;
    public final FrameLayout c;
    public final ImageView d;
    public final TextView e;
    public final TextView f;
    public final TextView h;
    public boolean n;
    public boolean r;

    public b51(Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        this.n = true;
        this.a = p6Var;
        setOrientation(0);
        FrameLayout frameLayout = new FrameLayout(context);
        this.c = frameLayout;
        org.telegram.ui.Components.va0 va0Var = new org.telegram.ui.Components.va0(1);
        this.b = va0Var;
        frameLayout.setBackground(va0Var);
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        frameLayout.addView(imageView, w7.b6.e(24, 24, 17));
        LinearLayout f7 = org.telegram.messenger.m5.f(context, 1);
        TextView textView = new TextView(context);
        this.e = textView;
        textView.setTextSize(1, 16.0f);
        TextView f10 = org.telegram.messenger.z20.f(f7, textView, w7.b6.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2), context);
        this.f = f10;
        f10.setTextSize(1, 13.0f);
        TextView f11 = org.telegram.messenger.z20.f(f7, f10, w7.b6.k(0.0f, 4.0f, 0.0f, 0.0f, -1, -2), context);
        this.h = f11;
        f11.setTextSize(1, 16.0f);
        if (org.telegram.messenger.cd.X) {
            addView(f11, w7.b6.t(-2, -2, 16, 20, 0, 0, 0));
            addView(f7, w7.b6.q(0, -2, 1.0f, 23, 20, 0, 18, 0));
            addView(frameLayout, w7.b6.t(28, 28, 21, 0, 0, 18, 0));
        } else {
            addView(frameLayout, w7.b6.t(28, 28, 19, 18, 0, 0, 0));
            addView(f7, w7.b6.q(0, -2, 1.0f, 23, 18, 0, 20, 0));
            addView(f11, w7.b6.t(-2, -2, 16, 0, 0, 20, 0));
        }
        updateColors();
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.y6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.n6));
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(this.r ? 60.0f : 50.0f), TLObject.FLAG_30));
    }

    public void setValue(CharSequence charSequence) {
        int i10 = !TextUtils.isEmpty(charSequence) ? 0 : 8;
        TextView textView = this.h;
        textView.setVisibility(i10);
        textView.setText(charSequence);
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void updateColors() {
        int i10 = org.telegram.ui.ActionBar.t6.G6;
        org.telegram.ui.ActionBar.p6 p6Var = this.a;
        this.e.setTextColor(org.telegram.ui.ActionBar.t6.w0(i10, p6Var));
        this.f.setTextColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.y6, p6Var));
        this.h.setTextColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.n6, p6Var));
        this.b.b = this.n && (p6Var == null ? org.telegram.ui.ActionBar.t6.I.q() : p6Var.a());
    }
}
