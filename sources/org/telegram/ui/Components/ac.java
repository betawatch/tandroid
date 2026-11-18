package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Typeface;
import android.widget.ImageView;
import android.widget.LinearLayout;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class ac extends eb {
    public final ph0 a;
    public final n6 b;
    public final n6 c;
    public final int d;

    public ac(Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context, i6Var);
        int i7 = org.telegram.ui.ActionBar.n6.yj;
        this.d = getThemedColor(i7);
        setBackground(getThemedColor(org.telegram.ui.ActionBar.n6.wj));
        ph0 ph0Var = new ph0(context);
        this.a = ph0Var;
        ph0Var.setScaleType(ImageView.ScaleType.CENTER);
        addView(ph0Var, c8.ma.h(56.0f, 48.0f, 8388627));
        getThemedColor(i7);
        getThemedColor(org.telegram.ui.ActionBar.n6.xj);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout, c8.ma.i(-1.0f, -2.0f, 8388627, 52.0f, 8.0f, 8.0f, 8.0f));
        n6 n6Var = new n6(context, true, true, true);
        this.b = n6Var;
        n6Var.setPadding(org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f), 0);
        org.telegram.ui.ActionBar.u6.Y(n6Var, i7, i6Var);
        n6Var.setTextSize(org.telegram.messenger.g0.L(14.0f));
        n6Var.setTypeface(org.telegram.messenger.g0.o());
        n6Var.setEllipsizeByGradient(true);
        linearLayout.addView(n6Var, c8.ma.o(-1, 20));
        n6 n6Var2 = new n6(context, true, true, true);
        this.c = n6Var2;
        n6Var2.setPadding(org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f), 0);
        org.telegram.ui.ActionBar.u6.Y(n6Var2, i7, i6Var);
        n6Var2.setTypeface(Typeface.SANS_SERIF);
        n6Var2.setTextSize(org.telegram.messenger.g0.L(13.0f));
        n6Var2.setEllipsizeByGradient(true);
        linearLayout.addView(n6Var2, c8.ma.o(-1, 18));
    }

    public final void c(int i7, String... strArr) {
        ph0 ph0Var = this.a;
        ph0Var.f(R.raw.stars_topup, 32, 32, null);
        for (String str : strArr) {
            ph0Var.h(this.d, str);
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
