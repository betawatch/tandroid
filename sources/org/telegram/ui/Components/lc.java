package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Typeface;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class lc extends nb {
    public final w9 a;
    public final n90 b;
    public final n90 c;

    public lc(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, d6Var);
        int i10 = org.telegram.ui.ActionBar.h6.Hi;
        getThemedColor(i10);
        setBackground(getThemedColor(org.telegram.ui.ActionBar.h6.Fi));
        w9 w9Var = new w9(context);
        this.a = w9Var;
        addView(w9Var, w7.y5.i(32.0f, 32.0f, 8388627, 12.0f, 0.0f, 12.0f, 0.0f));
        int themedColor = getThemedColor(i10);
        int themedColor2 = getThemedColor(org.telegram.ui.ActionBar.h6.Gi);
        LinearLayout f7 = org.telegram.messenger.ok.f(context, 1);
        addView(f7, w7.y5.i(-2.0f, -2.0f, 8388627, 52.0f, 8.0f, 8.0f, 8.0f));
        n90 n90Var = new n90(context, null);
        this.b = n90Var;
        n90Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
        n90Var.setTextColor(themedColor);
        n90Var.setTextSize(1, 14.0f);
        n90Var.setTypeface(AndroidUtilities.bold());
        f7.addView(n90Var);
        n90 n90Var2 = new n90(context, null);
        this.c = n90Var2;
        n90Var2.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
        n90Var2.setTextColor(themedColor);
        n90Var2.setLinkTextColor(themedColor2);
        n90Var2.setTypeface(Typeface.SANS_SERIF);
        n90Var2.setTextSize(1, 13.0f);
        f7.addView(n90Var2);
    }

    @Override // org.telegram.ui.Components.ub
    public CharSequence getAccessibilityText() {
        return ((Object) this.b.getText()) + ".\n" + ((Object) this.c.getText());
    }
}
