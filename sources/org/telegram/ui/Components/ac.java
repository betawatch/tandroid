package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Typeface;
import android.widget.ImageView;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class ac extends eb {
    public final pi0 a;
    public final j6 b;
    public final j6 c;
    public final int d;

    public ac(Context context, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context, b6Var);
        int i9 = org.telegram.ui.ActionBar.f6.Hi;
        this.d = getThemedColor(i9);
        setBackground(getThemedColor(org.telegram.ui.ActionBar.f6.Fi));
        pi0 pi0Var = new pi0(context);
        this.a = pi0Var;
        pi0Var.setScaleType(ImageView.ScaleType.CENTER);
        addView(pi0Var, g7.e6.h(56.0f, 48.0f, 8388627));
        int themedColor = getThemedColor(i9);
        getThemedColor(org.telegram.ui.ActionBar.f6.Gi);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout, g7.e6.i(-1.0f, -2.0f, 8388627, 52.0f, 8.0f, 8.0f, 8.0f));
        j6 j6Var = new j6(context, true, true, true);
        this.b = j6Var;
        j6Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
        j6Var.setTextColor(themedColor);
        j6Var.setTextSize(AndroidUtilities.dp(14.0f));
        j6Var.setTypeface(AndroidUtilities.bold());
        j6Var.setEllipsizeByGradient(true);
        linearLayout.addView(j6Var, g7.e6.n(-1, 20));
        j6 j6Var2 = new j6(context, true, true, true);
        this.c = j6Var2;
        j6Var2.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
        j6Var2.setTextColor(themedColor);
        j6Var2.setTypeface(Typeface.SANS_SERIF);
        j6Var2.setTextSize(AndroidUtilities.dp(13.0f));
        j6Var2.setEllipsizeByGradient(true);
        linearLayout.addView(j6Var2, g7.e6.n(-1, 18));
    }

    public final void c(int i9, String... strArr) {
        pi0 pi0Var = this.a;
        pi0Var.f(i9, 32, 32, null);
        for (String str : strArr) {
            pi0Var.h(this.d, str);
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
