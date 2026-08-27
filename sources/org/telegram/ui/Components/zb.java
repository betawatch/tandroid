package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Typeface;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class zb extends cb {
    public final n9 a;
    public final p80 b;
    public final p80 c;

    public zb(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, c6Var);
        int i10 = org.telegram.ui.ActionBar.g6.Hi;
        getThemedColor(i10);
        setBackground(getThemedColor(org.telegram.ui.ActionBar.g6.Fi));
        n9 n9Var = new n9(context);
        this.a = n9Var;
        addView(n9Var, h7.z5.i(32.0f, 32.0f, 8388627, 12.0f, 0.0f, 12.0f, 0.0f));
        int themedColor = getThemedColor(i10);
        int themedColor2 = getThemedColor(org.telegram.ui.ActionBar.g6.Gi);
        LinearLayout g10 = org.telegram.messenger.y1.g(context, 1);
        addView(g10, h7.z5.i(-2.0f, -2.0f, 8388627, 52.0f, 8.0f, 8.0f, 8.0f));
        p80 p80Var = new p80(context, null);
        this.b = p80Var;
        p80Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
        p80Var.setTextColor(themedColor);
        p80Var.setTextSize(1, 14.0f);
        p80Var.setTypeface(AndroidUtilities.bold());
        g10.addView(p80Var);
        p80 p80Var2 = new p80(context, null);
        this.c = p80Var2;
        p80Var2.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
        p80Var2.setTextColor(themedColor);
        p80Var2.setLinkTextColor(themedColor2);
        p80Var2.setTypeface(Typeface.SANS_SERIF);
        p80Var2.setTextSize(1, 13.0f);
        g10.addView(p80Var2);
    }

    @Override // org.telegram.ui.Components.jb
    public CharSequence getAccessibilityText() {
        return ((Object) this.b.getText()) + ".\n" + ((Object) this.c.getText());
    }
}
