package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Typeface;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class dc extends eb {
    public final p9 a;
    public final g90 b;
    public final g90 c;

    public dc(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, g6Var);
        int i10 = org.telegram.ui.ActionBar.k6.Hi;
        getThemedColor(i10);
        setBackground(getThemedColor(org.telegram.ui.ActionBar.k6.Fi));
        p9 p9Var = new p9(context);
        this.a = p9Var;
        addView(p9Var, k7.c6.i(32.0f, 32.0f, 8388627, 12.0f, 0.0f, 12.0f, 0.0f));
        int themedColor = getThemedColor(i10);
        int themedColor2 = getThemedColor(org.telegram.ui.ActionBar.k6.Gi);
        LinearLayout f10 = org.telegram.messenger.y3.f(context, 1);
        addView(f10, k7.c6.i(-2.0f, -2.0f, 8388627, 52.0f, 8.0f, 8.0f, 8.0f));
        g90 g90Var = new g90(context, null);
        this.b = g90Var;
        g90Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
        g90Var.setTextColor(themedColor);
        g90Var.setTextSize(1, 14.0f);
        g90Var.setTypeface(AndroidUtilities.bold());
        f10.addView(g90Var);
        g90 g90Var2 = new g90(context, null);
        this.c = g90Var2;
        g90Var2.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
        g90Var2.setTextColor(themedColor);
        g90Var2.setLinkTextColor(themedColor2);
        g90Var2.setTypeface(Typeface.SANS_SERIF);
        g90Var2.setTextSize(1, 13.0f);
        f10.addView(g90Var2);
    }

    @Override // org.telegram.ui.Components.nb
    public CharSequence getAccessibilityText() {
        return ((Object) this.b.getText()) + ".\n" + ((Object) this.c.getText());
    }
}
