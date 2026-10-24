package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.drawable.ColorDrawable;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class z61 extends ColorDrawable {
    public final int a;
    public final org.telegram.ui.ActionBar.g6 b;

    public z61(int i10, org.telegram.ui.ActionBar.g6 g6Var) {
        super(org.telegram.ui.ActionBar.k6.w0(i10, g6Var));
        this.a = i10;
        this.b = g6Var;
    }

    @Override // android.graphics.drawable.ColorDrawable, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int w02 = org.telegram.ui.ActionBar.k6.w0(this.a, this.b);
        if (getColor() != w02) {
            setColor(w02);
        }
        super.draw(canvas);
    }
}
