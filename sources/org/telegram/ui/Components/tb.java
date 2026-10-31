package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Typeface;
import android.widget.ImageView;
import android.widget.LinearLayout;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class tb extends ta {
    public final ei0 a;
    public final p80 b;
    public final p80 c;
    public final LinearLayout d;
    public final int e;

    public tb(Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context, p6Var);
        int i10 = org.telegram.ui.ActionBar.t6.vj;
        this.e = getThemedColor(i10);
        setBackground(getThemedColor(org.telegram.ui.ActionBar.t6.tj));
        ei0 ei0Var = new ei0(context);
        this.a = ei0Var;
        ei0Var.setScaleType(ImageView.ScaleType.CENTER);
        addView(ei0Var, w7.b6.h(56.0f, 48.0f, 8388627));
        getThemedColor(i10);
        int i11 = org.telegram.ui.ActionBar.t6.uj;
        getThemedColor(i11);
        LinearLayout linearLayout = new LinearLayout(context);
        this.d = linearLayout;
        linearLayout.setOrientation(1);
        addView(linearLayout, w7.b6.i(-2.0f, -2.0f, 8388627, 52.0f, 8.0f, 8.0f, 8.0f));
        p80 p80Var = new p80(context, null);
        this.b = p80Var;
        p80Var.setPadding(org.telegram.messenger.i0.L(4.0f), 0, org.telegram.messenger.i0.L(4.0f), 0);
        org.telegram.ui.ActionBar.a7.V(p80Var, i10, p6Var);
        p80Var.setTextSize(1, 14.0f);
        p80Var.setTypeface(org.telegram.messenger.i0.o());
        linearLayout.addView(p80Var);
        p80 p80Var2 = new p80(context, null);
        this.c = p80Var2;
        p80Var2.setPadding(org.telegram.messenger.i0.L(4.0f), 0, org.telegram.messenger.i0.L(4.0f), 0);
        org.telegram.ui.ActionBar.a7.V(p80Var2, i10, p6Var);
        org.telegram.ui.ActionBar.a7.H(p80Var2, i11, p6Var);
        p80Var2.setTypeface(Typeface.SANS_SERIF);
        p80Var2.setTextSize(1, 13.0f);
        linearLayout.addView(p80Var2);
    }

    public final void c(int i10, int i11, int i12, String... strArr) {
        ei0 ei0Var = this.a;
        ei0Var.f(i10, i11, i12, null);
        for (String str : strArr) {
            ei0Var.h(this.e, str);
        }
    }

    @Override // org.telegram.ui.Components.bb
    public CharSequence getAccessibilityText() {
        return ((Object) this.b.getText()) + ".\n" + ((Object) this.c.getText());
    }

    @Override // org.telegram.ui.Components.bb
    public final void onShow() {
        super.onShow();
        this.a.d();
    }
}
