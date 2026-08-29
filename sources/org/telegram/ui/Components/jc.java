package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Typeface;
import android.widget.ImageView;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class jc extends jb {
    public final aj0 a;
    public final y80 b;
    public final y80 c;
    public final LinearLayout d;
    public final int e;

    public jc(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, c6Var);
        int i10 = org.telegram.ui.ActionBar.g6.Hi;
        this.e = getThemedColor(i10);
        setBackground(getThemedColor(org.telegram.ui.ActionBar.g6.Fi));
        aj0 aj0Var = new aj0(context);
        this.a = aj0Var;
        aj0Var.setScaleType(ImageView.ScaleType.CENTER);
        addView(aj0Var, i7.f6.h(56.0f, 48.0f, 8388627));
        int themedColor = getThemedColor(i10);
        int themedColor2 = getThemedColor(org.telegram.ui.ActionBar.g6.Gi);
        LinearLayout linearLayout = new LinearLayout(context);
        this.d = linearLayout;
        linearLayout.setOrientation(1);
        addView(linearLayout, i7.f6.i(-2.0f, -2.0f, 8388627, 52.0f, 8.0f, 8.0f, 8.0f));
        y80 y80Var = new y80(context, null);
        this.b = y80Var;
        y80Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
        y80Var.setTextColor(themedColor);
        y80Var.setTextSize(1, 14.0f);
        y80Var.setTypeface(AndroidUtilities.bold());
        linearLayout.addView(y80Var);
        y80 y80Var2 = new y80(context, null);
        this.c = y80Var2;
        y80Var2.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
        y80Var2.setTextColor(themedColor);
        y80Var2.setLinkTextColor(themedColor2);
        y80Var2.setTypeface(Typeface.SANS_SERIF);
        y80Var2.setTextSize(1, 13.0f);
        linearLayout.addView(y80Var2);
    }

    public final void c(int i10, int i11, int i12, String... strArr) {
        aj0 aj0Var = this.a;
        aj0Var.f(i10, i11, i12, null);
        for (String str : strArr) {
            aj0Var.h(this.e, str);
        }
    }

    @Override // org.telegram.ui.Components.rb
    public CharSequence getAccessibilityText() {
        return ((Object) this.b.getText()) + ".\n" + ((Object) this.c.getText());
    }

    @Override // org.telegram.ui.Components.rb
    public final void onShow() {
        super.onShow();
        this.a.d();
    }
}
