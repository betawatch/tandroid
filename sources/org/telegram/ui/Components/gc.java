package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Typeface;
import android.widget.ImageView;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public class gc extends lb {
    public final ImageView a;
    public final c90 b;

    public gc(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, f6Var);
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.j6.Hi);
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
