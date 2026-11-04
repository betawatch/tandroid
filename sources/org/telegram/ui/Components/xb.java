package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Typeface;
import android.widget.ImageView;
import android.widget.LinearLayout;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class xb extends ya {
    public final fh0 a;
    public final s70 b;
    public final s70 c;
    public final LinearLayout d;
    public final int e;

    public xb(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, e6Var);
        int i3 = org.telegram.ui.ActionBar.k6.vj;
        this.e = getThemedColor(i3);
        setBackground(getThemedColor(org.telegram.ui.ActionBar.k6.tj));
        fh0 fh0Var = new fh0(context);
        this.a = fh0Var;
        fh0Var.setScaleType(ImageView.ScaleType.CENTER);
        addView(fh0Var, b8.mf.h(56.0f, 48.0f, 8388627));
        getThemedColor(i3);
        int i10 = org.telegram.ui.ActionBar.k6.uj;
        getThemedColor(i10);
        LinearLayout linearLayout = new LinearLayout(context);
        this.d = linearLayout;
        linearLayout.setOrientation(1);
        addView(linearLayout, b8.mf.i(-2.0f, -2.0f, 8388627, 52.0f, 8.0f, 8.0f, 8.0f));
        s70 s70Var = new s70(context, null);
        this.b = s70Var;
        s70Var.setPadding(org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f), 0);
        org.telegram.ui.ActionBar.r6.V(s70Var, i3, e6Var);
        s70Var.setTextSize(1, 14.0f);
        s70Var.setTypeface(org.telegram.messenger.g0.o());
        linearLayout.addView(s70Var);
        s70 s70Var2 = new s70(context, null);
        this.c = s70Var2;
        s70Var2.setPadding(org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f), 0);
        org.telegram.ui.ActionBar.r6.V(s70Var2, i3, e6Var);
        org.telegram.ui.ActionBar.r6.H(s70Var2, i10, e6Var);
        s70Var2.setTypeface(Typeface.SANS_SERIF);
        s70Var2.setTextSize(1, 13.0f);
        linearLayout.addView(s70Var2);
    }

    public final void c(int i3, int i10, int i11, String... strArr) {
        fh0 fh0Var = this.a;
        fh0Var.f(i3, i10, i11, null);
        for (String str : strArr) {
            fh0Var.h(this.e, str);
        }
    }

    @Override // org.telegram.ui.Components.fb
    public CharSequence getAccessibilityText() {
        return ((Object) this.b.getText()) + ".\n" + ((Object) this.c.getText());
    }

    @Override // org.telegram.ui.Components.fb
    public final void onShow() {
        super.onShow();
        this.a.d();
    }
}
