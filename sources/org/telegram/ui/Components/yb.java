package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Typeface;
import android.widget.ImageView;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public class yb extends eb {
    public final ImageView a;
    public final l80 b;

    public yb(Context context, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context, b6Var);
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.f6.Hi);
        ImageView imageView = new ImageView(context);
        this.a = imageView;
        imageView.setColorFilter(new PorterDuffColorFilter(themedColor, PorterDuff.Mode.MULTIPLY));
        addView(imageView, g7.e6.i(24.0f, 24.0f, 8388627, 16.0f, 12.0f, 16.0f, 12.0f));
        l80 l80Var = new l80(context, null);
        this.b = l80Var;
        l80Var.setDisablePaddingsOffsetY(true);
        l80Var.setSingleLine();
        l80Var.setTextColor(themedColor);
        l80Var.setTypeface(Typeface.SANS_SERIF);
        l80Var.setTextSize(1, 15.0f);
        addView(l80Var, g7.e6.i(-2.0f, -2.0f, 8388627, 56.0f, 0.0f, 16.0f, 0.0f));
    }

    @Override // org.telegram.ui.Components.lb
    public CharSequence getAccessibilityText() {
        return this.b.getText();
    }
}
