package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.HashSet;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class zn extends FrameLayout implements org.telegram.ui.ActionBar.a6 {
    public final org.telegram.ui.ActionBar.f6 a;
    public final ImageView b;
    public final org.telegram.ui.ActionBar.k5 c;
    public final org.telegram.ui.ActionBar.k5 d;
    public final org.telegram.ui.ActionBar.k5 e;
    public final org.telegram.ui.pk f;
    public boolean h;
    public boolean n;

    public zn(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.a = f6Var;
        ImageView imageView = new ImageView(context);
        this.b = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView, c8.ha.e(52, 46, 51));
        org.telegram.ui.ActionBar.k5 k5Var = new org.telegram.ui.ActionBar.k5(context);
        this.c = k5Var;
        k5Var.setTextSize(14);
        k5Var.setTypeface(org.telegram.messenger.g0.o());
        addView(k5Var, c8.ha.d(-1, 18.0f, 51, 52.0f, 6.0f, 0.0f, 0.0f));
        org.telegram.ui.ActionBar.k5 k5Var2 = new org.telegram.ui.ActionBar.k5(context);
        this.d = k5Var2;
        k5Var2.setTextSize(14);
        org.telegram.messenger.qs.i(k5Var2);
        addView(k5Var2, c8.ha.d(-1, 18.0f, 51, 52.0f, 24.0f, 0.0f, 0.0f));
        org.telegram.ui.ActionBar.k5 k5Var3 = new org.telegram.ui.ActionBar.k5(context);
        this.e = k5Var3;
        k5Var3.setTextSize(14);
        k5Var3.l(org.telegram.messenger.hd.M0(2131744273, null), false);
        k5Var3.setAlpha(0.0f);
        addView(k5Var3, c8.ha.d(-1, 18.0f, 51, 52.0f, 24.0f, 0.0f, 0.0f));
        org.telegram.ui.pk pkVar = new org.telegram.ui.pk(this, context, new xh.f());
        this.f = pkVar;
        pkVar.setRoundRadius(org.telegram.messenger.g0.L(6.0f));
        addView(pkVar, c8.ha.d(34, 34.0f, 51, 52.0f, 6.0f, 0.0f, 0.0f));
        updateColors();
    }

    @Override // org.telegram.ui.ActionBar.a6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.hf));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.kf));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Ll));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Uc));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.n) {
            return super.dispatchTouchEvent(motionEvent);
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.a6
    public final void updateColors() {
        int i7 = org.telegram.ui.ActionBar.k6.hf;
        org.telegram.ui.ActionBar.f6 f6Var = this.a;
        this.b.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.w0(i7, f6Var), PorterDuff.Mode.MULTIPLY));
        this.c.setTextColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.kf, f6Var));
        int i10 = org.telegram.ui.ActionBar.k6.Ll;
        int w02 = org.telegram.ui.ActionBar.k6.w0(i10, f6Var);
        org.telegram.ui.ActionBar.k5 k5Var = this.d;
        k5Var.setTextColor(w02);
        k5Var.setLinkTextColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Uc, f6Var));
        this.e.setTextColor(org.telegram.ui.ActionBar.k6.w0(i10, f6Var));
    }
}
