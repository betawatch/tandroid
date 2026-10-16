package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Typeface;
import android.widget.ImageView;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class pc extends pb {
    public final bk0 a;
    public final da0 b;
    public final da0 c;
    public final LinearLayout d;
    public final int e;

    public pc(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, c6Var);
        int i10 = org.telegram.ui.ActionBar.g6.Hi;
        this.e = getThemedColor(i10);
        setBackground(getThemedColor(org.telegram.ui.ActionBar.g6.Fi));
        bk0 bk0Var = new bk0(context);
        this.a = bk0Var;
        bk0Var.setScaleType(ImageView.ScaleType.CENTER);
        addView(bk0Var, w7.z5.h(56.0f, 48.0f, 8388627));
        int themedColor = getThemedColor(i10);
        int themedColor2 = getThemedColor(org.telegram.ui.ActionBar.g6.Gi);
        LinearLayout linearLayout = new LinearLayout(context);
        this.d = linearLayout;
        linearLayout.setOrientation(1);
        addView(linearLayout, w7.z5.i(-2.0f, -2.0f, 8388627, 52.0f, 8.0f, 8.0f, 8.0f));
        da0 da0Var = new da0(context, null);
        this.b = da0Var;
        da0Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
        da0Var.setTextColor(themedColor);
        da0Var.setTextSize(1, 14.0f);
        da0Var.setTypeface(AndroidUtilities.bold());
        linearLayout.addView(da0Var);
        da0 da0Var2 = new da0(context, null);
        this.c = da0Var2;
        da0Var2.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
        da0Var2.setTextColor(themedColor);
        da0Var2.setLinkTextColor(themedColor2);
        da0Var2.setTypeface(Typeface.SANS_SERIF);
        da0Var2.setTextSize(1, 13.0f);
        linearLayout.addView(da0Var2);
    }

    public final void c(int i10, int i11, int i12, String... strArr) {
        bk0 bk0Var = this.a;
        bk0Var.f(i10, i11, i12, null);
        for (String str : strArr) {
            bk0Var.h(this.e, str);
        }
    }

    @Override // org.telegram.ui.Components.wb
    public CharSequence getAccessibilityText() {
        return ((Object) this.b.getText()) + ".\n" + ((Object) this.c.getText());
    }

    @Override // org.telegram.ui.Components.wb
    public final void onShow() {
        super.onShow();
        this.a.d();
    }
}
