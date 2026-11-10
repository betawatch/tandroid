package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.widget.ImageView;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public class tb extends ya {
    public final ImageView a;
    public final w70 b;

    public tb(Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context, h6Var);
        int i7 = org.telegram.ui.ActionBar.m6.vj;
        getThemedColor(i7);
        ImageView imageView = new ImageView(context);
        this.a = imageView;
        org.telegram.ui.ActionBar.t6.s(imageView, i7, h6Var, PorterDuff.Mode.MULTIPLY);
        addView(imageView, c8.ha.i(24.0f, 24.0f, 8388627, 16.0f, 12.0f, 16.0f, 12.0f));
        w70 w70Var = new w70(context, null);
        this.b = w70Var;
        w70Var.setDisablePaddingsOffsetY(true);
        w70Var.setSingleLine();
        org.telegram.ui.ActionBar.t6.U(w70Var, i7, h6Var);
        w70Var.setTypeface(Typeface.SANS_SERIF);
        w70Var.setTextSize(1, 15.0f);
        addView(w70Var, c8.ha.i(-2.0f, -2.0f, 8388627, 56.0f, 0.0f, 16.0f, 0.0f));
    }

    @Override // org.telegram.ui.Components.fb
    public CharSequence getAccessibilityText() {
        return this.b.getText();
    }
}
