package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.HashSet;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class io extends FrameLayout implements org.telegram.ui.ActionBar.k6 {
    public final org.telegram.ui.ActionBar.p6 a;
    public final ImageView b;
    public final org.telegram.ui.ActionBar.u5 c;
    public final org.telegram.ui.ActionBar.u5 d;
    public final org.telegram.ui.ActionBar.u5 e;
    public final org.telegram.ui.ll f;
    public boolean h;
    public boolean n;

    public io(Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        this.a = p6Var;
        ImageView imageView = new ImageView(context);
        this.b = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView, w7.b6.e(52, 46, 51));
        org.telegram.ui.ActionBar.u5 u5Var = new org.telegram.ui.ActionBar.u5(context);
        this.c = u5Var;
        u5Var.setTextSize(14);
        u5Var.setTypeface(org.telegram.messenger.i0.o());
        addView(u5Var, w7.b6.d(-1, 18.0f, 51, 52.0f, 6.0f, 0.0f, 0.0f));
        org.telegram.ui.ActionBar.u5 u5Var2 = new org.telegram.ui.ActionBar.u5(context);
        this.d = u5Var2;
        u5Var2.setTextSize(14);
        org.telegram.messenger.zs.i(u5Var2);
        addView(u5Var2, w7.b6.d(-1, 18.0f, 51, 52.0f, 24.0f, 0.0f, 0.0f));
        org.telegram.ui.ActionBar.u5 u5Var3 = new org.telegram.ui.ActionBar.u5(context);
        this.e = u5Var3;
        u5Var3.setTextSize(14);
        u5Var3.l(org.telegram.messenger.cd.L0(2131744298, null), false);
        u5Var3.setAlpha(0.0f);
        addView(u5Var3, w7.b6.d(-1, 18.0f, 51, 52.0f, 24.0f, 0.0f, 0.0f));
        org.telegram.ui.ll llVar = new org.telegram.ui.ll(this, context, new nh.i());
        this.f = llVar;
        llVar.setRoundRadius(org.telegram.messenger.i0.L(6.0f));
        addView(llVar, w7.b6.d(34, 34.0f, 51, 52.0f, 6.0f, 0.0f, 0.0f));
        updateColors();
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.hf));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.kf));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Ll));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Uc));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.n) {
            return super.dispatchTouchEvent(motionEvent);
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void updateColors() {
        int i10 = org.telegram.ui.ActionBar.t6.hf;
        org.telegram.ui.ActionBar.p6 p6Var = this.a;
        this.b.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.t6.w0(i10, p6Var), PorterDuff.Mode.MULTIPLY));
        this.c.setTextColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.kf, p6Var));
        int i11 = org.telegram.ui.ActionBar.t6.Ll;
        int w02 = org.telegram.ui.ActionBar.t6.w0(i11, p6Var);
        org.telegram.ui.ActionBar.u5 u5Var = this.d;
        u5Var.setTextColor(w02);
        u5Var.setLinkTextColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Uc, p6Var));
        this.e.setTextColor(org.telegram.ui.ActionBar.t6.w0(i11, p6Var));
    }
}
