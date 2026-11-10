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

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class l31 extends LinearLayout implements org.telegram.ui.ActionBar.c6 {
    public final org.telegram.ui.ActionBar.h6 a;
    public final org.telegram.ui.Components.da0 b;
    public final FrameLayout c;
    public final ImageView d;
    public final TextView e;
    public final TextView f;
    public final TextView h;
    public boolean n;
    public boolean r;

    public l31(Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        this.n = true;
        this.a = h6Var;
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

    @Override // org.telegram.ui.ActionBar.c6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.y6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.n6));
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
        int i7 = org.telegram.ui.ActionBar.m6.G6;
        org.telegram.ui.ActionBar.h6 h6Var = this.a;
        this.e.setTextColor(org.telegram.ui.ActionBar.m6.w0(i7, h6Var));
        this.f.setTextColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.y6, h6Var));
        this.h.setTextColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.n6, h6Var));
        this.b.b = this.n && (h6Var == null ? org.telegram.ui.ActionBar.m6.I.q() : h6Var.a());
    }
}
