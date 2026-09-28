package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Typeface;
import android.widget.ImageView;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes3.dex */
public final class nc extends nb {
    public final nj0 a;
    public final p90 b;
    public final p90 c;
    public final LinearLayout d;
    public final int e;

    public nc(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, d6Var);
        int i10 = org.telegram.ui.ActionBar.h6.Hi;
        this.e = getThemedColor(i10);
        setBackground(getThemedColor(org.telegram.ui.ActionBar.h6.Fi));
        nj0 nj0Var = new nj0(context);
        this.a = nj0Var;
        nj0Var.setScaleType(ImageView.ScaleType.CENTER);
        addView(nj0Var, w7.y5.h(56.0f, 48.0f, 8388627));
        int themedColor = getThemedColor(i10);
        int themedColor2 = getThemedColor(org.telegram.ui.ActionBar.h6.Gi);
        LinearLayout linearLayout = new LinearLayout(context);
        this.d = linearLayout;
        linearLayout.setOrientation(1);
        addView(linearLayout, w7.y5.i(-2.0f, -2.0f, 8388627, 52.0f, 8.0f, 8.0f, 8.0f));
        p90 p90Var = new p90(context, null);
        this.b = p90Var;
        p90Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
        p90Var.setTextColor(themedColor);
        p90Var.setTextSize(1, 14.0f);
        p90Var.setTypeface(AndroidUtilities.bold());
        linearLayout.addView(p90Var);
        p90 p90Var2 = new p90(context, null);
        this.c = p90Var2;
        p90Var2.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
        p90Var2.setTextColor(themedColor);
        p90Var2.setLinkTextColor(themedColor2);
        p90Var2.setTypeface(Typeface.SANS_SERIF);
        p90Var2.setTextSize(1, 13.0f);
        linearLayout.addView(p90Var2);
    }

    public final void c(int i10, int i11, int i12, String... strArr) {
        nj0 nj0Var = this.a;
        nj0Var.f(i10, i11, i12, null);
        for (String str : strArr) {
            nj0Var.h(this.e, str);
        }
    }

    @Override // org.telegram.ui.Components.ub
    public CharSequence getAccessibilityText() {
        return ((Object) this.b.getText()) + ".\n" + ((Object) this.c.getText());
    }

    @Override // org.telegram.ui.Components.ub
    public final void onShow() {
        super.onShow();
        this.a.d();
    }
}
