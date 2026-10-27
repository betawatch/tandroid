package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Typeface;
import android.widget.ImageView;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class nc extends nb {
    public final bk0 a;
    public final aa0 b;
    public final aa0 c;
    public final LinearLayout d;
    public final int e;

    public nc(Context context, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context, u6Var);
        int i10 = org.telegram.ui.ActionBar.y6.Hi;
        this.e = getThemedColor(i10);
        setBackground(getThemedColor(org.telegram.ui.ActionBar.y6.Fi));
        bk0 bk0Var = new bk0(context);
        this.a = bk0Var;
        bk0Var.setScaleType(ImageView.ScaleType.CENTER);
        addView(bk0Var, kb1.l(56.0f, 48.0f, 8388627));
        getThemedColor(i10);
        int i11 = org.telegram.ui.ActionBar.y6.Gi;
        getThemedColor(i11);
        LinearLayout linearLayout = new LinearLayout(context);
        this.d = linearLayout;
        linearLayout.setOrientation(1);
        addView(linearLayout, kb1.m(-2.0f, -2.0f, 8388627, 52.0f, 8.0f, 8.0f, 8.0f));
        aa0 aa0Var = new aa0(context, null);
        this.b = aa0Var;
        aa0Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
        org.telegram.ui.ActionBar.f7.V(aa0Var, i10, u6Var);
        aa0Var.setTextSize(1, 14.0f);
        aa0Var.setTypeface(AndroidUtilities.bold());
        linearLayout.addView(aa0Var);
        aa0 aa0Var2 = new aa0(context, null);
        this.c = aa0Var2;
        aa0Var2.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
        org.telegram.ui.ActionBar.f7.V(aa0Var2, i10, u6Var);
        org.telegram.ui.ActionBar.f7.H(aa0Var2, i11, u6Var);
        aa0Var2.setTypeface(Typeface.SANS_SERIF);
        aa0Var2.setTextSize(1, 13.0f);
        linearLayout.addView(aa0Var2);
    }

    public final void c(int i10, int i11, int i12, String... strArr) {
        bk0 bk0Var = this.a;
        bk0Var.f(i10, i11, i12, null);
        for (String str : strArr) {
            bk0Var.h(this.e, str);
        }
    }

    @Override // org.telegram.ui.Components.ub
    public CharSequence getAccessibilityText() {
        return ((Object) this.b.getText()) + ".\n" + ((Object) this.c.getText());
    }

    @Override // org.telegram.ui.Components.ub
    public final void onShow() {
        super.onShow();
        this.a.d();
    }
}
