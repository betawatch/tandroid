package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.drawable.ColorDrawable;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
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
