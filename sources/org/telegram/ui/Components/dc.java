package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Typeface;
import android.widget.ImageView;
import android.widget.LinearLayout;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class dc extends eb {
    public final rh0 a;
    public final m80 b;
    public final m80 c;
    public final LinearLayout d;
    public final int e;

    public dc(Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context, h6Var);
        int i7 = org.telegram.ui.ActionBar.m6.yj;
        this.e = getThemedColor(i7);
        setBackground(getThemedColor(org.telegram.ui.ActionBar.m6.wj));
        rh0 rh0Var = new rh0(context);
        this.a = rh0Var;
        rh0Var.setScaleType(ImageView.ScaleType.CENTER);
        addView(rh0Var, c8.ma.h(56.0f, 48.0f, 8388627));
        getThemedColor(i7);
        int i10 = org.telegram.ui.ActionBar.m6.xj;
        getThemedColor(i10);
        LinearLayout linearLayout = new LinearLayout(context);
        this.d = linearLayout;
        linearLayout.setOrientation(1);
        addView(linearLayout, c8.ma.i(-2.0f, -2.0f, 8388627, 52.0f, 8.0f, 8.0f, 8.0f));
        m80 m80Var = new m80(context, null);
        this.b = m80Var;
        m80Var.setPadding(org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f), 0);
        org.telegram.ui.ActionBar.t6.U(m80Var, i7, h6Var);
        m80Var.setTextSize(1, 14.0f);
        m80Var.setTypeface(org.telegram.messenger.g0.o());
        linearLayout.addView(m80Var);
        m80 m80Var2 = new m80(context, null);
        this.c = m80Var2;
        m80Var2.setPadding(org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f), 0);
        org.telegram.ui.ActionBar.t6.U(m80Var2, i7, h6Var);
        org.telegram.ui.ActionBar.t6.G(m80Var2, i10, h6Var);
        m80Var2.setTypeface(Typeface.SANS_SERIF);
        m80Var2.setTextSize(1, 13.0f);
        linearLayout.addView(m80Var2);
    }

    public final void c(int i7, int i10, int i11, String... strArr) {
        rh0 rh0Var = this.a;
        rh0Var.f(i7, i10, i11, null);
        for (String str : strArr) {
            rh0Var.h(this.e, str);
        }
    }

    @Override // org.telegram.ui.Components.lb
    public CharSequence getAccessibilityText() {
        return ((Object) this.b.getText()) + ".\n" + ((Object) this.c.getText());
    }

    @Override // org.telegram.ui.Components.lb
    public final void onShow() {
        super.onShow();
        this.a.d();
    }
}
