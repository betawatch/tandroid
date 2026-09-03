package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Typeface;
import android.widget.ImageView;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public class ac extends eb {
    public final ImageView a;
    public final g90 b;

    public ac(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, g6Var);
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.k6.Hi);
        ImageView imageView = new ImageView(context);
        this.a = imageView;
        imageView.setColorFilter(new PorterDuffColorFilter(themedColor, PorterDuff.Mode.MULTIPLY));
        addView(imageView, k7.c6.i(24.0f, 24.0f, 8388627, 16.0f, 12.0f, 16.0f, 12.0f));
        g90 g90Var = new g90(context, null);
        this.b = g90Var;
        g90Var.setDisablePaddingsOffsetY(true);
        g90Var.setSingleLine();
        g90Var.setTextColor(themedColor);
        g90Var.setTypeface(Typeface.SANS_SERIF);
        g90Var.setTextSize(1, 15.0f);
        addView(g90Var, k7.c6.i(-2.0f, -2.0f, 8388627, 56.0f, 0.0f, 16.0f, 0.0f));
    }

    @Override // org.telegram.ui.Components.nb
    public CharSequence getAccessibilityText() {
        return this.b.getText();
    }
}
