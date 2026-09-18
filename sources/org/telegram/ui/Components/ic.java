package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Typeface;
import android.widget.ImageView;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public class ic extends nb {
    public final ImageView a;
    public final l90 b;

    public ic(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, e6Var);
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.j6.Hi);
        ImageView imageView = new ImageView(context);
        this.a = imageView;
        imageView.setColorFilter(new PorterDuffColorFilter(themedColor, PorterDuff.Mode.MULTIPLY));
        addView(imageView, w7.y5.i(24.0f, 24.0f, 8388627, 16.0f, 12.0f, 16.0f, 12.0f));
        l90 l90Var = new l90(context, null);
        this.b = l90Var;
        l90Var.setDisablePaddingsOffsetY(true);
        l90Var.setSingleLine();
        l90Var.setTextColor(themedColor);
        l90Var.setTypeface(Typeface.SANS_SERIF);
        l90Var.setTextSize(1, 15.0f);
        addView(l90Var, w7.y5.i(-2.0f, -2.0f, 8388627, 56.0f, 0.0f, 16.0f, 0.0f));
    }

    @Override // org.telegram.ui.Components.ub
    public CharSequence getAccessibilityText() {
        return this.b.getText();
    }
}
