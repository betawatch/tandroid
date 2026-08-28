package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Typeface;
import android.widget.ImageView;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class dc extends eb {
    public final pi0 a;
    public final l80 b;
    public final l80 c;
    public final LinearLayout d;
    public final int e;

    public dc(Context context, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context, b6Var);
        int i9 = org.telegram.ui.ActionBar.f6.Hi;
        this.e = getThemedColor(i9);
        setBackground(getThemedColor(org.telegram.ui.ActionBar.f6.Fi));
        pi0 pi0Var = new pi0(context);
        this.a = pi0Var;
        pi0Var.setScaleType(ImageView.ScaleType.CENTER);
        addView(pi0Var, g7.e6.h(56.0f, 48.0f, 8388627));
        int themedColor = getThemedColor(i9);
        int themedColor2 = getThemedColor(org.telegram.ui.ActionBar.f6.Gi);
        LinearLayout linearLayout = new LinearLayout(context);
        this.d = linearLayout;
        linearLayout.setOrientation(1);
        addView(linearLayout, g7.e6.i(-2.0f, -2.0f, 8388627, 52.0f, 8.0f, 8.0f, 8.0f));
        l80 l80Var = new l80(context, null);
        this.b = l80Var;
        l80Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
        l80Var.setTextColor(themedColor);
        l80Var.setTextSize(1, 14.0f);
        l80Var.setTypeface(AndroidUtilities.bold());
        linearLayout.addView(l80Var);
        l80 l80Var2 = new l80(context, null);
        this.c = l80Var2;
        l80Var2.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
        l80Var2.setTextColor(themedColor);
        l80Var2.setLinkTextColor(themedColor2);
        l80Var2.setTypeface(Typeface.SANS_SERIF);
        l80Var2.setTextSize(1, 13.0f);
        linearLayout.addView(l80Var2);
    }

    public final void c(int i9, int i10, int i11, String... strArr) {
        pi0 pi0Var = this.a;
        pi0Var.f(i9, i10, i11, null);
        for (String str : strArr) {
            pi0Var.h(this.e, str);
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
