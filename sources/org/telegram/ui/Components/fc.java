package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Typeface;
import android.widget.ImageView;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class fc extends eb {
    public final jj0 a;
    public final e90 b;
    public final e90 c;
    public final LinearLayout d;
    public final int e;

    public fc(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, f6Var);
        int i10 = org.telegram.ui.ActionBar.j6.Hi;
        this.e = getThemedColor(i10);
        setBackground(getThemedColor(org.telegram.ui.ActionBar.j6.Fi));
        jj0 jj0Var = new jj0(context);
        this.a = jj0Var;
        jj0Var.setScaleType(ImageView.ScaleType.CENTER);
        addView(jj0Var, k7.b6.h(56.0f, 48.0f, 8388627));
        int themedColor = getThemedColor(i10);
        int themedColor2 = getThemedColor(org.telegram.ui.ActionBar.j6.Gi);
        LinearLayout linearLayout = new LinearLayout(context);
        this.d = linearLayout;
        linearLayout.setOrientation(1);
        addView(linearLayout, k7.b6.i(-2.0f, -2.0f, 8388627, 52.0f, 8.0f, 8.0f, 8.0f));
        e90 e90Var = new e90(context, null);
        this.b = e90Var;
        e90Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
        e90Var.setTextColor(themedColor);
        e90Var.setTextSize(1, 14.0f);
        e90Var.setTypeface(AndroidUtilities.bold());
        linearLayout.addView(e90Var);
        e90 e90Var2 = new e90(context, null);
        this.c = e90Var2;
        e90Var2.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
        e90Var2.setTextColor(themedColor);
        e90Var2.setLinkTextColor(themedColor2);
        e90Var2.setTypeface(Typeface.SANS_SERIF);
        e90Var2.setTextSize(1, 13.0f);
        linearLayout.addView(e90Var2);
    }

    public final void c(int i10, int i11, int i12, String... strArr) {
        jj0 jj0Var = this.a;
        jj0Var.f(i10, i11, i12, null);
        for (String str : strArr) {
            jj0Var.h(this.e, str);
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
