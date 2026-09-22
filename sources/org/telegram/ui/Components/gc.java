package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Typeface;
import android.widget.ImageView;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public class gc extends lb {
    public final ImageView a;
    public final c90 b;

    public gc(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, e6Var);
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.i6.Hi);
        ImageView imageView = new ImageView(context);
        this.a = imageView;
        imageView.setColorFilter(new PorterDuffColorFilter(themedColor, PorterDuff.Mode.MULTIPLY));
        addView(imageView, w7.x5.i(24.0f, 24.0f, 8388627, 16.0f, 12.0f, 16.0f, 12.0f));
        c90 c90Var = new c90(context, null);
        this.b = c90Var;
        c90Var.setDisablePaddingsOffsetY(true);
        c90Var.setSingleLine();
        c90Var.setTextColor(themedColor);
        c90Var.setTypeface(Typeface.SANS_SERIF);
        c90Var.setTextSize(1, 15.0f);
        addView(c90Var, w7.x5.i(-2.0f, -2.0f, 8388627, 56.0f, 0.0f, 16.0f, 0.0f));
    }

    @Override // org.telegram.ui.Components.sb
    public CharSequence getAccessibilityText() {
        return this.b.getText();
    }
}
