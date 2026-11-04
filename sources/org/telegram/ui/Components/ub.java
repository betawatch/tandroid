package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Typeface;
import android.widget.ImageView;
import android.widget.LinearLayout;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class ub extends ya {
    public final fh0 a;
    public final h6 b;
    public final h6 c;
    public final int d;

    public ub(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, e6Var);
        int i3 = org.telegram.ui.ActionBar.k6.vj;
        this.d = getThemedColor(i3);
        setBackground(getThemedColor(org.telegram.ui.ActionBar.k6.tj));
        fh0 fh0Var = new fh0(context);
        this.a = fh0Var;
        fh0Var.setScaleType(ImageView.ScaleType.CENTER);
        addView(fh0Var, b8.mf.h(56.0f, 48.0f, 8388627));
        getThemedColor(i3);
        getThemedColor(org.telegram.ui.ActionBar.k6.uj);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout, b8.mf.i(-1.0f, -2.0f, 8388627, 52.0f, 8.0f, 8.0f, 8.0f));
        h6 h6Var = new h6(context, true, true, true);
        this.b = h6Var;
        h6Var.setPadding(org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f), 0);
        org.telegram.ui.ActionBar.r6.Z(h6Var, i3, e6Var);
        h6Var.setTextSize(org.telegram.messenger.g0.L(14.0f));
        h6Var.setTypeface(org.telegram.messenger.g0.o());
        h6Var.setEllipsizeByGradient(true);
        linearLayout.addView(h6Var, b8.mf.o(-1, 20));
        h6 h6Var2 = new h6(context, true, true, true);
        this.c = h6Var2;
        h6Var2.setPadding(org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f), 0);
        org.telegram.ui.ActionBar.r6.Z(h6Var2, i3, e6Var);
        h6Var2.setTypeface(Typeface.SANS_SERIF);
        h6Var2.setTextSize(org.telegram.messenger.g0.L(13.0f));
        h6Var2.setEllipsizeByGradient(true);
        linearLayout.addView(h6Var2, b8.mf.o(-1, 18));
    }

    public final void c(int i3, String... strArr) {
        fh0 fh0Var = this.a;
        fh0Var.f(R.raw.stars_topup, 32, 32, null);
        for (String str : strArr) {
            fh0Var.h(this.d, str);
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
