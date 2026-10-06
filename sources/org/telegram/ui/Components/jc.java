package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Typeface;
import android.widget.ImageView;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public class jc extends ob {
    public final ImageView a;
    public final q90 b;

    public jc(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, d6Var);
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.i6.Hi);
        ImageView imageView = new ImageView(context);
        this.a = imageView;
        imageView.setColorFilter(new PorterDuffColorFilter(themedColor, PorterDuff.Mode.MULTIPLY));
        addView(imageView, w7.z5.i(24.0f, 24.0f, 8388627, 16.0f, 12.0f, 16.0f, 12.0f));
        q90 q90Var = new q90(context, null);
        this.b = q90Var;
        q90Var.setDisablePaddingsOffsetY(true);
        q90Var.setSingleLine();
        q90Var.setTextColor(themedColor);
        q90Var.setTypeface(Typeface.SANS_SERIF);
        q90Var.setTextSize(1, 15.0f);
        addView(q90Var, w7.z5.i(-2.0f, -2.0f, 8388627, 56.0f, 0.0f, 16.0f, 0.0f));
    }

    @Override // org.telegram.ui.Components.vb
    public CharSequence getAccessibilityText() {
        return this.b.getText();
    }
}
