package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Typeface;
import android.widget.ImageView;
import android.widget.LinearLayout;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class zb extends za {
    public final dh0 a;
    public final x70 b;
    public final x70 c;
    public final LinearLayout d;
    public final int e;

    public zb(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, g6Var);
        int i7 = org.telegram.ui.ActionBar.l6.vj;
        this.e = getThemedColor(i7);
        setBackground(getThemedColor(org.telegram.ui.ActionBar.l6.tj));
        dh0 dh0Var = new dh0(context);
        this.a = dh0Var;
        dh0Var.setScaleType(ImageView.ScaleType.CENTER);
        addView(dh0Var, c8.ha.h(56.0f, 48.0f, 8388627));
        getThemedColor(i7);
        int i10 = org.telegram.ui.ActionBar.l6.uj;
        getThemedColor(i10);
        LinearLayout linearLayout = new LinearLayout(context);
        this.d = linearLayout;
        linearLayout.setOrientation(1);
        addView(linearLayout, c8.ha.i(-2.0f, -2.0f, 8388627, 52.0f, 8.0f, 8.0f, 8.0f));
        x70 x70Var = new x70(context, null);
        this.b = x70Var;
        x70Var.setPadding(org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f), 0);
        org.telegram.ui.ActionBar.s6.U(x70Var, i7, g6Var);
        x70Var.setTextSize(1, 14.0f);
        x70Var.setTypeface(org.telegram.messenger.g0.o());
        linearLayout.addView(x70Var);
        x70 x70Var2 = new x70(context, null);
        this.c = x70Var2;
        x70Var2.setPadding(org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f), 0);
        org.telegram.ui.ActionBar.s6.U(x70Var2, i7, g6Var);
        org.telegram.ui.ActionBar.s6.G(x70Var2, i10, g6Var);
        x70Var2.setTypeface(Typeface.SANS_SERIF);
        x70Var2.setTextSize(1, 13.0f);
        linearLayout.addView(x70Var2);
    }

    public final void c(int i7, int i10, int i11, String... strArr) {
        dh0 dh0Var = this.a;
        dh0Var.f(i7, i10, i11, null);
        for (String str : strArr) {
            dh0Var.h(this.e, str);
        }
    }

    @Override // org.telegram.ui.Components.gb
    public CharSequence getAccessibilityText() {
        return ((Object) this.b.getText()) + ".\n" + ((Object) this.c.getText());
    }

    @Override // org.telegram.ui.Components.gb
    public final void onShow() {
        super.onShow();
        this.a.d();
    }
}
