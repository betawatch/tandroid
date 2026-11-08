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

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class j31 extends LinearLayout implements org.telegram.ui.ActionBar.a6 {
    public final org.telegram.ui.ActionBar.f6 a;
    public final org.telegram.ui.Components.da0 b;
    public final FrameLayout c;
    public final ImageView d;
    public final TextView e;
    public final TextView f;
    public final TextView h;
    public boolean n;
    public boolean r;

    public j31(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.n = true;
        this.a = f6Var;
        setOrientation(0);
        FrameLayout frameLayout = new FrameLayout(context);
        this.c = frameLayout;
        org.telegram.ui.Components.da0 da0Var = new org.telegram.ui.Components.da0(1);
        this.b = da0Var;
        frameLayout.setBackground(da0Var);
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        frameLayout.addView(imageView, c8.ha.e(24, 24, 17));
        LinearLayout f10 = org.telegram.messenger.k5.f(context, 1);
        TextView textView = new TextView(context);
        this.e = textView;
        textView.setTextSize(1, 16.0f);
        TextView f11 = org.telegram.messenger.camera.q.f(f10, textView, c8.ha.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2), context);
        this.f = f11;
        f11.setTextSize(1, 13.0f);
        TextView f12 = org.telegram.messenger.camera.q.f(f10, f11, c8.ha.k(0.0f, 4.0f, 0.0f, 0.0f, -1, -2), context);
        this.h = f12;
        f12.setTextSize(1, 16.0f);
        if (org.telegram.messenger.id.a0) {
            addView(f12, c8.ha.t(-2, -2, 16, 20, 0, 0, 0));
            addView(f10, c8.ha.q(0, -2, 1.0f, 23, 20, 0, 18, 0));
            addView(frameLayout, c8.ha.t(28, 28, 21, 0, 0, 18, 0));
        } else {
            addView(frameLayout, c8.ha.t(28, 28, 19, 18, 0, 0, 0));
            addView(f10, c8.ha.q(0, -2, 1.0f, 23, 18, 0, 20, 0));
            addView(f12, c8.ha.t(-2, -2, 16, 0, 0, 20, 0));
        }
        updateColors();
    }

    @Override // org.telegram.ui.ActionBar.a6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.y6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.n6));
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

    @Override // org.telegram.ui.ActionBar.a6
    public final void updateColors() {
        int i7 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.f6 f6Var = this.a;
        this.e.setTextColor(org.telegram.ui.ActionBar.k6.w0(i7, f6Var));
        this.f.setTextColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.y6, f6Var));
        this.h.setTextColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.n6, f6Var));
        this.b.b = this.n && (f6Var == null ? org.telegram.ui.ActionBar.k6.I.q() : f6Var.a());
    }
}
