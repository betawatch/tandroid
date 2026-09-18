package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Typeface;
import android.widget.ImageView;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final class nc extends nb {
    public final lj0 a;
    public final l90 b;
    public final l90 c;
    public final LinearLayout d;
    public final int e;

    public nc(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, e6Var);
        int i10 = org.telegram.ui.ActionBar.j6.Hi;
        this.e = getThemedColor(i10);
        setBackground(getThemedColor(org.telegram.ui.ActionBar.j6.Fi));
        lj0 lj0Var = new lj0(context);
        this.a = lj0Var;
        lj0Var.setScaleType(ImageView.ScaleType.CENTER);
        addView(lj0Var, w7.y5.h(56.0f, 48.0f, 8388627));
        int themedColor = getThemedColor(i10);
        int themedColor2 = getThemedColor(org.telegram.ui.ActionBar.j6.Gi);
        LinearLayout linearLayout = new LinearLayout(context);
        this.d = linearLayout;
        linearLayout.setOrientation(1);
        addView(linearLayout, w7.y5.i(-2.0f, -2.0f, 8388627, 52.0f, 8.0f, 8.0f, 8.0f));
        l90 l90Var = new l90(context, null);
        this.b = l90Var;
        l90Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
        l90Var.setTextColor(themedColor);
        l90Var.setTextSize(1, 14.0f);
        l90Var.setTypeface(AndroidUtilities.bold());
        linearLayout.addView(l90Var);
        l90 l90Var2 = new l90(context, null);
        this.c = l90Var2;
        l90Var2.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
        l90Var2.setTextColor(themedColor);
        l90Var2.setLinkTextColor(themedColor2);
        l90Var2.setTypeface(Typeface.SANS_SERIF);
        l90Var2.setTextSize(1, 13.0f);
        linearLayout.addView(l90Var2);
    }

    public final void c(int i10, int i11, int i12, String... strArr) {
        lj0 lj0Var = this.a;
        lj0Var.f(i10, i11, i12, null);
        for (String str : strArr) {
            lj0Var.h(this.e, str);
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
