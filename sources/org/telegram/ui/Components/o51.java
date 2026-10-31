package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.drawable.ColorDrawable;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class o51 extends ColorDrawable {
    public final int a;
    public final org.telegram.ui.ActionBar.p6 b;

    public o51(int i10, org.telegram.ui.ActionBar.p6 p6Var) {
        super(org.telegram.ui.ActionBar.t6.w0(i10, p6Var));
        this.a = i10;
        this.b = p6Var;
    }

    @Override // android.graphics.drawable.ColorDrawable, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int w02 = org.telegram.ui.ActionBar.t6.w0(this.a, this.b);
        if (getColor() != w02) {
            setColor(w02);
        }
        super.draw(canvas);
    }
}
