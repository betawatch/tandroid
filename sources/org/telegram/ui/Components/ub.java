package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Typeface;
import android.widget.ImageView;
import android.widget.LinearLayout;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class ub extends va {
    public final fh0 a;
    public final z70 b;
    public final z70 c;
    public final LinearLayout d;
    public final int e;

    public ub(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, e6Var);
        int i7 = org.telegram.ui.ActionBar.j6.yj;
        this.e = getThemedColor(i7);
        setBackground(getThemedColor(org.telegram.ui.ActionBar.j6.wj));
        fh0 fh0Var = new fh0(context);
        this.a = fh0Var;
        fh0Var.setScaleType(ImageView.ScaleType.CENTER);
        addView(fh0Var, c8.ja.h(56.0f, 48.0f, 8388627));
        getThemedColor(i7);
        int i10 = org.telegram.ui.ActionBar.j6.xj;
        getThemedColor(i10);
        LinearLayout linearLayout = new LinearLayout(context);
        this.d = linearLayout;
        linearLayout.setOrientation(1);
        addView(linearLayout, c8.ja.i(-2.0f, -2.0f, 8388627, 52.0f, 8.0f, 8.0f, 8.0f));
        z70 z70Var = new z70(context, null);
        this.b = z70Var;
        z70Var.setPadding(org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f), 0);
        org.telegram.ui.ActionBar.q6.U(z70Var, i7, e6Var);
        z70Var.setTextSize(1, 14.0f);
        z70Var.setTypeface(org.telegram.messenger.g0.o());
        linearLayout.addView(z70Var);
        z70 z70Var2 = new z70(context, null);
        this.c = z70Var2;
        z70Var2.setPadding(org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f), 0);
        org.telegram.ui.ActionBar.q6.U(z70Var2, i7, e6Var);
        org.telegram.ui.ActionBar.q6.G(z70Var2, i10, e6Var);
        z70Var2.setTypeface(Typeface.SANS_SERIF);
        z70Var2.setTextSize(1, 13.0f);
        linearLayout.addView(z70Var2);
    }

    public final void c(int i7, int i10, int i11, String... strArr) {
        fh0 fh0Var = this.a;
        fh0Var.f(i7, i10, i11, null);
        for (String str : strArr) {
            fh0Var.h(this.e, str);
        }
    }

    @Override // org.telegram.ui.Components.cb
    public CharSequence getAccessibilityText() {
        return ((Object) this.b.getText()) + ".\n" + ((Object) this.c.getText());
    }

    @Override // org.telegram.ui.Components.cb
    public final void onShow() {
        super.onShow();
        this.a.d();
    }
}
