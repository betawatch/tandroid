package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Typeface;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class lc extends nb {
    public final w9 a;
    public final d90 b;
    public final d90 c;

    public lc(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, d6Var);
        int i10 = org.telegram.ui.ActionBar.h6.Hi;
        getThemedColor(i10);
        setBackground(getThemedColor(org.telegram.ui.ActionBar.h6.Fi));
        w9 w9Var = new w9(context);
        this.a = w9Var;
        addView(w9Var, w7.x5.i(32.0f, 32.0f, 8388627, 12.0f, 0.0f, 12.0f, 0.0f));
        int themedColor = getThemedColor(i10);
        int themedColor2 = getThemedColor(org.telegram.ui.ActionBar.h6.Gi);
        LinearLayout f7 = org.telegram.messenger.ul.f(context, 1);
        addView(f7, w7.x5.i(-2.0f, -2.0f, 8388627, 52.0f, 8.0f, 8.0f, 8.0f));
        d90 d90Var = new d90(context, null);
        this.b = d90Var;
        d90Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
        d90Var.setTextColor(themedColor);
        d90Var.setTextSize(1, 14.0f);
        d90Var.setTypeface(AndroidUtilities.bold());
        f7.addView(d90Var);
        d90 d90Var2 = new d90(context, null);
        this.c = d90Var2;
        d90Var2.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
        d90Var2.setTextColor(themedColor);
        d90Var2.setLinkTextColor(themedColor2);
        d90Var2.setTypeface(Typeface.SANS_SERIF);
        d90Var2.setTextSize(1, 13.0f);
        f7.addView(d90Var2);
    }

    @Override // org.telegram.ui.Components.ub
    public CharSequence getAccessibilityText() {
        return ((Object) this.b.getText()) + ".\n" + ((Object) this.c.getText());
    }
}
