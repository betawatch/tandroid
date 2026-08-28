package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Typeface;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class bc extends eb {
    public final o9 a;
    public final l80 b;
    public final l80 c;

    public bc(Context context, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context, b6Var);
        int i9 = org.telegram.ui.ActionBar.f6.Hi;
        getThemedColor(i9);
        setBackground(getThemedColor(org.telegram.ui.ActionBar.f6.Fi));
        o9 o9Var = new o9(context);
        this.a = o9Var;
        addView(o9Var, g7.e6.i(32.0f, 32.0f, 8388627, 12.0f, 0.0f, 12.0f, 0.0f));
        int themedColor = getThemedColor(i9);
        int themedColor2 = getThemedColor(org.telegram.ui.ActionBar.f6.Gi);
        LinearLayout f10 = org.telegram.messenger.ll.f(context, 1);
        addView(f10, g7.e6.i(-2.0f, -2.0f, 8388627, 52.0f, 8.0f, 8.0f, 8.0f));
        l80 l80Var = new l80(context, null);
        this.b = l80Var;
        l80Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
        l80Var.setTextColor(themedColor);
        l80Var.setTextSize(1, 14.0f);
        l80Var.setTypeface(AndroidUtilities.bold());
        f10.addView(l80Var);
        l80 l80Var2 = new l80(context, null);
        this.c = l80Var2;
        l80Var2.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
        l80Var2.setTextColor(themedColor);
        l80Var2.setLinkTextColor(themedColor2);
        l80Var2.setTypeface(Typeface.SANS_SERIF);
        l80Var2.setTextSize(1, 13.0f);
        f10.addView(l80Var2);
    }

    @Override // org.telegram.ui.Components.lb
    public CharSequence getAccessibilityText() {
        return ((Object) this.b.getText()) + ".\n" + ((Object) this.c.getText());
    }
}
