package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Typeface;
import android.widget.ImageView;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public class hc extends mb {
    public final ImageView a;
    public final k90 b;

    public hc(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, f6Var);
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.j6.Hi);
        ImageView imageView = new ImageView(context);
        this.a = imageView;
        imageView.setColorFilter(new PorterDuffColorFilter(themedColor, PorterDuff.Mode.MULTIPLY));
        addView(imageView, w7.y5.i(24.0f, 24.0f, 8388627, 16.0f, 12.0f, 16.0f, 12.0f));
        k90 k90Var = new k90(context, null);
        this.b = k90Var;
        k90Var.setDisablePaddingsOffsetY(true);
        k90Var.setSingleLine();
        k90Var.setTextColor(themedColor);
        k90Var.setTypeface(Typeface.SANS_SERIF);
        k90Var.setTextSize(1, 15.0f);
        addView(k90Var, w7.y5.i(-2.0f, -2.0f, 8388627, 56.0f, 0.0f, 16.0f, 0.0f));
    }

    @Override // org.telegram.ui.Components.tb
    public CharSequence getAccessibilityText() {
        return this.b.getText();
    }
}
