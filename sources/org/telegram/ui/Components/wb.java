package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Typeface;
import android.widget.ImageView;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public class wb extends cb {
    public final ImageView a;
    public final p80 b;

    public wb(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, c6Var);
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.g6.Hi);
        ImageView imageView = new ImageView(context);
        this.a = imageView;
        imageView.setColorFilter(new PorterDuffColorFilter(themedColor, PorterDuff.Mode.MULTIPLY));
        addView(imageView, h7.z5.i(24.0f, 24.0f, 8388627, 16.0f, 12.0f, 16.0f, 12.0f));
        p80 p80Var = new p80(context, null);
        this.b = p80Var;
        p80Var.setDisablePaddingsOffsetY(true);
        p80Var.setSingleLine();
        p80Var.setTextColor(themedColor);
        p80Var.setTypeface(Typeface.SANS_SERIF);
        p80Var.setTextSize(1, 15.0f);
        addView(p80Var, h7.z5.i(-2.0f, -2.0f, 8388627, 56.0f, 0.0f, 16.0f, 0.0f));
    }

    @Override // org.telegram.ui.Components.jb
    public CharSequence getAccessibilityText() {
        return this.b.getText();
    }
}
