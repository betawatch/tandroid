package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.drawable.ColorDrawable;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class i71 extends ColorDrawable {
    public final int a;
    public final org.telegram.ui.ActionBar.u6 b;

    public i71(int i10, org.telegram.ui.ActionBar.u6 u6Var) {
        super(org.telegram.ui.ActionBar.y6.w0(i10, u6Var));
        this.a = i10;
        this.b = u6Var;
    }

    @Override // android.graphics.drawable.ColorDrawable, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int w02 = org.telegram.ui.ActionBar.y6.w0(this.a, this.b);
        if (getColor() != w02) {
            setColor(w02);
        }
        super.draw(canvas);
    }
}
