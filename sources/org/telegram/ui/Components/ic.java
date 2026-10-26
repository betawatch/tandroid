package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.widget.ImageView;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public class ic extends nb {
    public final ImageView a;
    public final z90 b;

    public ic(Context context, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context, u6Var);
        int i10 = org.telegram.ui.ActionBar.y6.Hi;
        getThemedColor(i10);
        ImageView imageView = new ImageView(context);
        this.a = imageView;
        org.telegram.ui.ActionBar.f7.t(imageView, i10, u6Var, PorterDuff.Mode.MULTIPLY);
        addView(imageView, gb1.m(24.0f, 24.0f, 8388627, 16.0f, 12.0f, 16.0f, 12.0f));
        z90 z90Var = new z90(context, null);
        this.b = z90Var;
        z90Var.setDisablePaddingsOffsetY(true);
        z90Var.setSingleLine();
        org.telegram.ui.ActionBar.f7.V(z90Var, i10, u6Var);
        z90Var.setTypeface(Typeface.SANS_SERIF);
        z90Var.setTextSize(1, 15.0f);
        addView(z90Var, gb1.m(-2.0f, -2.0f, 8388627, 56.0f, 0.0f, 16.0f, 0.0f));
    }

    @Override // org.telegram.ui.Components.ub
    public CharSequence getAccessibilityText() {
        return this.b.getText();
    }
}
