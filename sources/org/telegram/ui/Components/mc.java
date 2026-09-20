package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Typeface;
import android.widget.ImageView;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class mc extends mb {
    public final kj0 a;
    public final k90 b;
    public final k90 c;
    public final LinearLayout d;
    public final int e;

    public mc(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, f6Var);
        int i10 = org.telegram.ui.ActionBar.j6.Hi;
        this.e = getThemedColor(i10);
        setBackground(getThemedColor(org.telegram.ui.ActionBar.j6.Fi));
        kj0 kj0Var = new kj0(context);
        this.a = kj0Var;
        kj0Var.setScaleType(ImageView.ScaleType.CENTER);
        addView(kj0Var, w7.y5.h(56.0f, 48.0f, 8388627));
        int themedColor = getThemedColor(i10);
        int themedColor2 = getThemedColor(org.telegram.ui.ActionBar.j6.Gi);
        LinearLayout linearLayout = new LinearLayout(context);
        this.d = linearLayout;
        linearLayout.setOrientation(1);
        addView(linearLayout, w7.y5.i(-2.0f, -2.0f, 8388627, 52.0f, 8.0f, 8.0f, 8.0f));
        k90 k90Var = new k90(context, null);
        this.b = k90Var;
        k90Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
        k90Var.setTextColor(themedColor);
        k90Var.setTextSize(1, 14.0f);
        k90Var.setTypeface(AndroidUtilities.bold());
        linearLayout.addView(k90Var);
        k90 k90Var2 = new k90(context, null);
        this.c = k90Var2;
        k90Var2.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
        k90Var2.setTextColor(themedColor);
        k90Var2.setLinkTextColor(themedColor2);
        k90Var2.setTypeface(Typeface.SANS_SERIF);
        k90Var2.setTextSize(1, 13.0f);
        linearLayout.addView(k90Var2);
    }

    public final void c(int i10, int i11, int i12, String... strArr) {
        kj0 kj0Var = this.a;
        kj0Var.f(i10, i11, i12, null);
        for (String str : strArr) {
            kj0Var.h(this.e, str);
        }
    }

    @Override // org.telegram.ui.Components.tb
    public CharSequence getAccessibilityText() {
        return ((Object) this.b.getText()) + ".\n" + ((Object) this.c.getText());
    }

    @Override // org.telegram.ui.Components.tb
    public final void onShow() {
        super.onShow();
        this.a.d();
    }
}
