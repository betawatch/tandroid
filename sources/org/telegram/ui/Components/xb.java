package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.widget.ImageView;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public class xb extends db {
    public final ImageView a;
    public final j80 b;

    public xb(Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context, i6Var);
        int i7 = org.telegram.ui.ActionBar.n6.yj;
        getThemedColor(i7);
        ImageView imageView = new ImageView(context);
        this.a = imageView;
        org.telegram.ui.ActionBar.u6.s(imageView, i7, i6Var, PorterDuff.Mode.MULTIPLY);
        addView(imageView, c8.na.i(24.0f, 24.0f, 8388627, 16.0f, 12.0f, 16.0f, 12.0f));
        j80 j80Var = new j80(context, null);
        this.b = j80Var;
        j80Var.setDisablePaddingsOffsetY(true);
        j80Var.setSingleLine();
        org.telegram.ui.ActionBar.u6.U(j80Var, i7, i6Var);
        j80Var.setTypeface(Typeface.SANS_SERIF);
        j80Var.setTextSize(1, 15.0f);
        addView(j80Var, c8.na.i(-2.0f, -2.0f, 8388627, 56.0f, 0.0f, 16.0f, 0.0f));
    }

    @Override // org.telegram.ui.Components.kb
    public CharSequence getAccessibilityText() {
        return this.b.getText();
    }
}
