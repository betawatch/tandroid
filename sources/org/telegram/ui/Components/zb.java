package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Typeface;
import android.widget.ImageView;
import android.widget.LinearLayout;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class zb extends za {
    public final ch0 a;
    public final w70 b;
    public final w70 c;
    public final LinearLayout d;
    public final int e;

    public zb(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, f6Var);
        int i7 = org.telegram.ui.ActionBar.k6.vj;
        this.e = getThemedColor(i7);
        setBackground(getThemedColor(org.telegram.ui.ActionBar.k6.tj));
        ch0 ch0Var = new ch0(context);
        this.a = ch0Var;
        ch0Var.setScaleType(ImageView.ScaleType.CENTER);
        addView(ch0Var, c8.ha.h(56.0f, 48.0f, 8388627));
        getThemedColor(i7);
        int i10 = org.telegram.ui.ActionBar.k6.uj;
        getThemedColor(i10);
        LinearLayout linearLayout = new LinearLayout(context);
        this.d = linearLayout;
        linearLayout.setOrientation(1);
        addView(linearLayout, c8.ha.i(-2.0f, -2.0f, 8388627, 52.0f, 8.0f, 8.0f, 8.0f));
        w70 w70Var = new w70(context, null);
        this.b = w70Var;
        w70Var.setPadding(org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f), 0);
        org.telegram.ui.ActionBar.r6.V(w70Var, i7, f6Var);
        w70Var.setTextSize(1, 14.0f);
        w70Var.setTypeface(org.telegram.messenger.g0.o());
        linearLayout.addView(w70Var);
        w70 w70Var2 = new w70(context, null);
        this.c = w70Var2;
        w70Var2.setPadding(org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f), 0);
        org.telegram.ui.ActionBar.r6.V(w70Var2, i7, f6Var);
        org.telegram.ui.ActionBar.r6.H(w70Var2, i10, f6Var);
        w70Var2.setTypeface(Typeface.SANS_SERIF);
        w70Var2.setTextSize(1, 13.0f);
        linearLayout.addView(w70Var2);
    }

    public final void c(int i7, int i10, int i11, String... strArr) {
        ch0 ch0Var = this.a;
        ch0Var.f(i7, i10, i11, null);
        for (String str : strArr) {
            ch0Var.h(this.e, str);
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
