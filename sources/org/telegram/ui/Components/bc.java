package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Typeface;
import android.widget.ImageView;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class bc extends cb {
    public final ri0 a;
    public final p80 b;
    public final p80 c;
    public final LinearLayout d;
    public final int e;

    public bc(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, c6Var);
        int i10 = org.telegram.ui.ActionBar.g6.Hi;
        this.e = getThemedColor(i10);
        setBackground(getThemedColor(org.telegram.ui.ActionBar.g6.Fi));
        ri0 ri0Var = new ri0(context);
        this.a = ri0Var;
        ri0Var.setScaleType(ImageView.ScaleType.CENTER);
        addView(ri0Var, h7.z5.h(56.0f, 48.0f, 8388627));
        int themedColor = getThemedColor(i10);
        int themedColor2 = getThemedColor(org.telegram.ui.ActionBar.g6.Gi);
        LinearLayout linearLayout = new LinearLayout(context);
        this.d = linearLayout;
        linearLayout.setOrientation(1);
        addView(linearLayout, h7.z5.i(-2.0f, -2.0f, 8388627, 52.0f, 8.0f, 8.0f, 8.0f));
        p80 p80Var = new p80(context, null);
        this.b = p80Var;
        p80Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
        p80Var.setTextColor(themedColor);
        p80Var.setTextSize(1, 14.0f);
        p80Var.setTypeface(AndroidUtilities.bold());
        linearLayout.addView(p80Var);
        p80 p80Var2 = new p80(context, null);
        this.c = p80Var2;
        p80Var2.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
        p80Var2.setTextColor(themedColor);
        p80Var2.setLinkTextColor(themedColor2);
        p80Var2.setTypeface(Typeface.SANS_SERIF);
        p80Var2.setTextSize(1, 13.0f);
        linearLayout.addView(p80Var2);
    }

    public final void c(int i10, int i11, int i12, String... strArr) {
        ri0 ri0Var = this.a;
        ri0Var.f(i10, i11, i12, null);
        for (String str : strArr) {
            ri0Var.h(this.e, str);
        }
    }

    @Override // org.telegram.ui.Components.jb
    public CharSequence getAccessibilityText() {
        return ((Object) this.b.getText()) + ".\n" + ((Object) this.c.getText());
    }

    @Override // org.telegram.ui.Components.jb
    public final void onShow() {
        super.onShow();
        this.a.d();
    }
}
