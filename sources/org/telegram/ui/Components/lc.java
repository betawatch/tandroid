package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Typeface;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class lc extends nb {
    public final y9 a;
    public final aa0 b;
    public final aa0 c;

    public lc(Context context, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context, u6Var);
        int i10 = org.telegram.ui.ActionBar.y6.Hi;
        getThemedColor(i10);
        setBackground(getThemedColor(org.telegram.ui.ActionBar.y6.Fi));
        y9 y9Var = new y9(context);
        this.a = y9Var;
        addView(y9Var, kb1.m(32.0f, 32.0f, 8388627, 12.0f, 0.0f, 12.0f, 0.0f));
        getThemedColor(i10);
        int i11 = org.telegram.ui.ActionBar.y6.Gi;
        getThemedColor(i11);
        LinearLayout linearLayout = new LinearLayout(context);
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

    @Override // org.telegram.ui.Components.ub
    public CharSequence getAccessibilityText() {
        return ((Object) this.b.getText()) + ".\n" + ((Object) this.c.getText());
    }
}
