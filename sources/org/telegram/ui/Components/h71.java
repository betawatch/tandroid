package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.drawable.ColorDrawable;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class h71 extends ColorDrawable {
    public final int a;
    public final org.telegram.ui.ActionBar.u6 b;

    public h71(int i10, org.telegram.ui.ActionBar.u6 u6Var) {
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
