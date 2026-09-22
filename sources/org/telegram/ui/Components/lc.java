package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Typeface;
import android.widget.ImageView;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class lc extends lb {
    public final aj0 a;
    public final c90 b;
    public final c90 c;
    public final LinearLayout d;
    public final int e;

    public lc(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, e6Var);
        int i10 = org.telegram.ui.ActionBar.i6.Hi;
        this.e = getThemedColor(i10);
        setBackground(getThemedColor(org.telegram.ui.ActionBar.i6.Fi));
        aj0 aj0Var = new aj0(context);
        this.a = aj0Var;
        aj0Var.setScaleType(ImageView.ScaleType.CENTER);
        addView(aj0Var, w7.x5.h(56.0f, 48.0f, 8388627));
        int themedColor = getThemedColor(i10);
        int themedColor2 = getThemedColor(org.telegram.ui.ActionBar.i6.Gi);
        LinearLayout linearLayout = new LinearLayout(context);
        this.d = linearLayout;
        linearLayout.setOrientation(1);
        addView(linearLayout, w7.x5.i(-2.0f, -2.0f, 8388627, 52.0f, 8.0f, 8.0f, 8.0f));
        c90 c90Var = new c90(context, null);
        this.b = c90Var;
        c90Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
        c90Var.setTextColor(themedColor);
        c90Var.setTextSize(1, 14.0f);
        c90Var.setTypeface(AndroidUtilities.bold());
        linearLayout.addView(c90Var);
        c90 c90Var2 = new c90(context, null);
        this.c = c90Var2;
        c90Var2.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
        c90Var2.setTextColor(themedColor);
        c90Var2.setLinkTextColor(themedColor2);
        c90Var2.setTypeface(Typeface.SANS_SERIF);
        c90Var2.setTextSize(1, 13.0f);
        linearLayout.addView(c90Var2);
    }

    public final void c(int i10, int i11, int i12, String... strArr) {
        aj0 aj0Var = this.a;
        aj0Var.f(i10, i11, i12, null);
        for (String str : strArr) {
            aj0Var.h(this.e, str);
        }
    }

    @Override // org.telegram.ui.Components.sb
    public CharSequence getAccessibilityText() {
        return ((Object) this.b.getText()) + ".\n" + ((Object) this.c.getText());
    }

    @Override // org.telegram.ui.Components.sb
    public final void onShow() {
        super.onShow();
        this.a.d();
    }
}
