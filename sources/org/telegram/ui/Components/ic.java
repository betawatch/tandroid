package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Typeface;
import android.widget.ImageView;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class ic extends lb {
    public final aj0 a;
    public final n6 b;
    public final n6 c;
    public final int d;

    public ic(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, e6Var);
        int i10 = org.telegram.ui.ActionBar.i6.Hi;
        this.d = getThemedColor(i10);
        setBackground(getThemedColor(org.telegram.ui.ActionBar.i6.Fi));
        aj0 aj0Var = new aj0(context);
        this.a = aj0Var;
        aj0Var.setScaleType(ImageView.ScaleType.CENTER);
        addView(aj0Var, w7.x5.h(56.0f, 48.0f, 8388627));
        int themedColor = getThemedColor(i10);
        getThemedColor(org.telegram.ui.ActionBar.i6.Gi);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout, w7.x5.i(-1.0f, -2.0f, 8388627, 52.0f, 8.0f, 8.0f, 8.0f));
        n6 n6Var = new n6(context, true, true, true);
        this.b = n6Var;
        n6Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
        n6Var.setTextColor(themedColor);
        n6Var.setTextSize(AndroidUtilities.dp(14.0f));
        n6Var.setTypeface(AndroidUtilities.bold());
        n6Var.setEllipsizeByGradient(true);
        linearLayout.addView(n6Var, w7.x5.n(-1, 20));
        n6 n6Var2 = new n6(context, true, true, true);
        this.c = n6Var2;
        n6Var2.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
        n6Var2.setTextColor(themedColor);
        n6Var2.setTypeface(Typeface.SANS_SERIF);
        n6Var2.setTextSize(AndroidUtilities.dp(13.0f));
        n6Var2.setEllipsizeByGradient(true);
        linearLayout.addView(n6Var2, w7.x5.n(-1, 18));
    }

    public final void c(int i10, String... strArr) {
        aj0 aj0Var = this.a;
        aj0Var.f(i10, 32, 32, null);
        for (String str : strArr) {
            aj0Var.h(this.d, str);
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
