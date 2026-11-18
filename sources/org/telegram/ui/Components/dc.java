package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Typeface;
import android.widget.ImageView;
import android.widget.LinearLayout;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class dc extends eb {
    public final ph0 a;
    public final k80 b;
    public final k80 c;
    public final LinearLayout d;
    public final int e;

    public dc(Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context, i6Var);
        int i7 = org.telegram.ui.ActionBar.n6.yj;
        this.e = getThemedColor(i7);
        setBackground(getThemedColor(org.telegram.ui.ActionBar.n6.wj));
        ph0 ph0Var = new ph0(context);
        this.a = ph0Var;
        ph0Var.setScaleType(ImageView.ScaleType.CENTER);
        addView(ph0Var, c8.ma.h(56.0f, 48.0f, 8388627));
        getThemedColor(i7);
        int i10 = org.telegram.ui.ActionBar.n6.xj;
        getThemedColor(i10);
        LinearLayout linearLayout = new LinearLayout(context);
        this.d = linearLayout;
        linearLayout.setOrientation(1);
        addView(linearLayout, c8.ma.i(-2.0f, -2.0f, 8388627, 52.0f, 8.0f, 8.0f, 8.0f));
        k80 k80Var = new k80(context, null);
        this.b = k80Var;
        k80Var.setPadding(org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f), 0);
        org.telegram.ui.ActionBar.u6.U(k80Var, i7, i6Var);
        k80Var.setTextSize(1, 14.0f);
        k80Var.setTypeface(org.telegram.messenger.g0.o());
        linearLayout.addView(k80Var);
        k80 k80Var2 = new k80(context, null);
        this.c = k80Var2;
        k80Var2.setPadding(org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f), 0);
        org.telegram.ui.ActionBar.u6.U(k80Var2, i7, i6Var);
        org.telegram.ui.ActionBar.u6.G(k80Var2, i10, i6Var);
        k80Var2.setTypeface(Typeface.SANS_SERIF);
        k80Var2.setTextSize(1, 13.0f);
        linearLayout.addView(k80Var2);
    }

    public final void c(int i7, int i10, int i11, String... strArr) {
        ph0 ph0Var = this.a;
        ph0Var.f(i7, i10, i11, null);
        for (String str : strArr) {
            ph0Var.h(this.e, str);
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
