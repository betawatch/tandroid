package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.widget.ImageView;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public class ic extends nb {
    public final ImageView a;
    public final y90 b;

    public ic(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, g6Var);
        int i10 = org.telegram.ui.ActionBar.k6.Hi;
        getThemedColor(i10);
        ImageView imageView = new ImageView(context);
        this.a = imageView;
        org.telegram.ui.ActionBar.r6.t(imageView, i10, g6Var, PorterDuff.Mode.MULTIPLY);
        addView(imageView, w7.z5.i(24.0f, 24.0f, 8388627, 16.0f, 12.0f, 16.0f, 12.0f));
        y90 y90Var = new y90(context, null);
        this.b = y90Var;
        y90Var.setDisablePaddingsOffsetY(true);
        y90Var.setSingleLine();
        org.telegram.ui.ActionBar.r6.W(y90Var, i10, g6Var);
        y90Var.setTypeface(Typeface.SANS_SERIF);
        y90Var.setTextSize(1, 15.0f);
        addView(y90Var, w7.z5.i(-2.0f, -2.0f, 8388627, 56.0f, 0.0f, 16.0f, 0.0f));
    }

    @Override // org.telegram.ui.Components.ub
    public CharSequence getAccessibilityText() {
        return this.b.getText();
    }
}
