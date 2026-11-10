package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.HashSet;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class yn extends FrameLayout implements org.telegram.ui.ActionBar.c6 {
    public final org.telegram.ui.ActionBar.h6 a;
    public final ImageView b;
    public final org.telegram.ui.ActionBar.m5 c;
    public final org.telegram.ui.ActionBar.m5 d;
    public final org.telegram.ui.ActionBar.m5 e;
    public final org.telegram.ui.rk f;
    public boolean h;
    public boolean n;

    public yn(Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        this.a = h6Var;
        ImageView imageView = new ImageView(context);
        this.b = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView, c8.ha.e(52, 46, 51));
        org.telegram.ui.ActionBar.m5 m5Var = new org.telegram.ui.ActionBar.m5(context);
        this.c = m5Var;
        m5Var.setTextSize(14);
        m5Var.setTypeface(org.telegram.messenger.g0.o());
        addView(m5Var, c8.ha.d(-1, 18.0f, 51, 52.0f, 6.0f, 0.0f, 0.0f));
        org.telegram.ui.ActionBar.m5 m5Var2 = new org.telegram.ui.ActionBar.m5(context);
        this.d = m5Var2;
        m5Var2.setTextSize(14);
        org.telegram.messenger.qs.i(m5Var2);
        addView(m5Var2, c8.ha.d(-1, 18.0f, 51, 52.0f, 24.0f, 0.0f, 0.0f));
        org.telegram.ui.ActionBar.m5 m5Var3 = new org.telegram.ui.ActionBar.m5(context);
        this.e = m5Var3;
        m5Var3.setTextSize(14);
        m5Var3.l(org.telegram.messenger.id.M0(2131744272, null), false);
        m5Var3.setAlpha(0.0f);
        addView(m5Var3, c8.ha.d(-1, 18.0f, 51, 52.0f, 24.0f, 0.0f, 0.0f));
        org.telegram.ui.rk rkVar = new org.telegram.ui.rk(this, context, new xh.f());
        this.f = rkVar;
        rkVar.setRoundRadius(org.telegram.messenger.g0.L(6.0f));
        addView(rkVar, c8.ha.d(34, 34.0f, 51, 52.0f, 6.0f, 0.0f, 0.0f));
        updateColors();
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.hf));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.kf));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Ll));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Uc));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.n) {
            return super.dispatchTouchEvent(motionEvent);
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final void updateColors() {
        int i7 = org.telegram.ui.ActionBar.m6.hf;
        org.telegram.ui.ActionBar.h6 h6Var = this.a;
        this.b.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.m6.w0(i7, h6Var), PorterDuff.Mode.MULTIPLY));
        this.c.setTextColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.kf, h6Var));
        int i10 = org.telegram.ui.ActionBar.m6.Ll;
        int w02 = org.telegram.ui.ActionBar.m6.w0(i10, h6Var);
        org.telegram.ui.ActionBar.m5 m5Var = this.d;
        m5Var.setTextColor(w02);
        m5Var.setLinkTextColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Uc, h6Var));
        this.e.setTextColor(org.telegram.ui.ActionBar.m6.w0(i10, h6Var));
    }
}
