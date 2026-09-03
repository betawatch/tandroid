package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Typeface;
import android.widget.ImageView;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class fc extends eb {
    public final kj0 a;
    public final g90 b;
    public final g90 c;
    public final LinearLayout d;
    public final int e;

    public fc(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, g6Var);
        int i10 = org.telegram.ui.ActionBar.k6.Hi;
        this.e = getThemedColor(i10);
        setBackground(getThemedColor(org.telegram.ui.ActionBar.k6.Fi));
        kj0 kj0Var = new kj0(context);
        this.a = kj0Var;
        kj0Var.setScaleType(ImageView.ScaleType.CENTER);
        addView(kj0Var, k7.c6.h(56.0f, 48.0f, 8388627));
        int themedColor = getThemedColor(i10);
        int themedColor2 = getThemedColor(org.telegram.ui.ActionBar.k6.Gi);
        LinearLayout linearLayout = new LinearLayout(context);
        this.d = linearLayout;
        linearLayout.setOrientation(1);
        addView(linearLayout, k7.c6.i(-2.0f, -2.0f, 8388627, 52.0f, 8.0f, 8.0f, 8.0f));
        g90 g90Var = new g90(context, null);
        this.b = g90Var;
        g90Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
        g90Var.setTextColor(themedColor);
        g90Var.setTextSize(1, 14.0f);
        g90Var.setTypeface(AndroidUtilities.bold());
        linearLayout.addView(g90Var);
        g90 g90Var2 = new g90(context, null);
        this.c = g90Var2;
        g90Var2.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
        g90Var2.setTextColor(themedColor);
        g90Var2.setLinkTextColor(themedColor2);
        g90Var2.setTypeface(Typeface.SANS_SERIF);
        g90Var2.setTextSize(1, 13.0f);
        linearLayout.addView(g90Var2);
    }

    public final void c(int i10, int i11, int i12, String... strArr) {
        kj0 kj0Var = this.a;
        kj0Var.f(i10, i11, i12, null);
        for (String str : strArr) {
            kj0Var.h(this.e, str);
        }
    }

    @Override // org.telegram.ui.Components.nb
    public CharSequence getAccessibilityText() {
        return ((Object) this.b.getText()) + ".\n" + ((Object) this.c.getText());
    }

    @Override // org.telegram.ui.Components.nb
    public final void onShow() {
        super.onShow();
        this.a.d();
    }
}
