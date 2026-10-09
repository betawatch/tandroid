package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Typeface;
import android.widget.ImageView;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class qc extends qb {
    public final fk0 a;
    public final ea0 b;
    public final ea0 c;
    public final LinearLayout d;
    public final int e;

    public qc(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, e6Var);
        int i10 = org.telegram.ui.ActionBar.i6.Hi;
        this.e = getThemedColor(i10);
        setBackground(getThemedColor(org.telegram.ui.ActionBar.i6.Fi));
        fk0 fk0Var = new fk0(context);
        this.a = fk0Var;
        fk0Var.setScaleType(ImageView.ScaleType.CENTER);
        addView(fk0Var, w7.x5.h(56.0f, 48.0f, 8388627));
        int themedColor = getThemedColor(i10);
        int themedColor2 = getThemedColor(org.telegram.ui.ActionBar.i6.Gi);
        LinearLayout linearLayout = new LinearLayout(context);
        this.d = linearLayout;
        linearLayout.setOrientation(1);
        addView(linearLayout, w7.x5.i(-2.0f, -2.0f, 8388627, 52.0f, 8.0f, 8.0f, 8.0f));
        ea0 ea0Var = new ea0(context, null);
        this.b = ea0Var;
        ea0Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
        ea0Var.setTextColor(themedColor);
        ea0Var.setTextSize(1, 14.0f);
        ea0Var.setTypeface(AndroidUtilities.bold());
        linearLayout.addView(ea0Var);
        ea0 ea0Var2 = new ea0(context, null);
        this.c = ea0Var2;
        ea0Var2.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
        ea0Var2.setTextColor(themedColor);
        ea0Var2.setLinkTextColor(themedColor2);
        ea0Var2.setTypeface(Typeface.SANS_SERIF);
        ea0Var2.setTextSize(1, 13.0f);
        linearLayout.addView(ea0Var2);
    }

    public final void c(int i10, int i11, int i12, String... strArr) {
        fk0 fk0Var = this.a;
        fk0Var.f(i10, i11, i12, null);
        for (String str : strArr) {
            fk0Var.h(this.e, str);
        }
    }

    @Override // org.telegram.ui.Components.xb
    public CharSequence getAccessibilityText() {
        return ((Object) this.b.getText()) + ".\n" + ((Object) this.c.getText());
    }

    @Override // org.telegram.ui.Components.xb
    public final void onShow() {
        super.onShow();
        this.a.d();
    }
}
