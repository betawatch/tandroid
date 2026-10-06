package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Typeface;
import android.widget.ImageView;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final class oc extends ob {
    public final nj0 a;
    public final q90 b;
    public final q90 c;
    public final LinearLayout d;
    public final int e;

    public oc(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, d6Var);
        int i10 = org.telegram.ui.ActionBar.i6.Hi;
        this.e = getThemedColor(i10);
        setBackground(getThemedColor(org.telegram.ui.ActionBar.i6.Fi));
        nj0 nj0Var = new nj0(context);
        this.a = nj0Var;
        nj0Var.setScaleType(ImageView.ScaleType.CENTER);
        addView(nj0Var, w7.z5.h(56.0f, 48.0f, 8388627));
        int themedColor = getThemedColor(i10);
        int themedColor2 = getThemedColor(org.telegram.ui.ActionBar.i6.Gi);
        LinearLayout linearLayout = new LinearLayout(context);
        this.d = linearLayout;
        linearLayout.setOrientation(1);
        addView(linearLayout, w7.z5.i(-2.0f, -2.0f, 8388627, 52.0f, 8.0f, 8.0f, 8.0f));
        q90 q90Var = new q90(context, null);
        this.b = q90Var;
        q90Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
        q90Var.setTextColor(themedColor);
        q90Var.setTextSize(1, 14.0f);
        q90Var.setTypeface(AndroidUtilities.bold());
        linearLayout.addView(q90Var);
        q90 q90Var2 = new q90(context, null);
        this.c = q90Var2;
        q90Var2.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
        q90Var2.setTextColor(themedColor);
        q90Var2.setLinkTextColor(themedColor2);
        q90Var2.setTypeface(Typeface.SANS_SERIF);
        q90Var2.setTextSize(1, 13.0f);
        linearLayout.addView(q90Var2);
    }

    public final void c(int i10, int i11, int i12, String... strArr) {
        nj0 nj0Var = this.a;
        nj0Var.f(i10, i11, i12, null);
        for (String str : strArr) {
            nj0Var.h(this.e, str);
        }
    }

    @Override // org.telegram.ui.Components.vb
    public CharSequence getAccessibilityText() {
        return ((Object) this.b.getText()) + ".\n" + ((Object) this.c.getText());
    }

    @Override // org.telegram.ui.Components.vb
    public final void onShow() {
        super.onShow();
        this.a.d();
    }
}
