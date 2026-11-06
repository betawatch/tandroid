package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.drawable.ColorDrawable;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class k41 extends ColorDrawable {
    public final int a;
    public final org.telegram.ui.ActionBar.f6 b;

    public k41(int i7, org.telegram.ui.ActionBar.f6 f6Var) {
        super(org.telegram.ui.ActionBar.k6.w0(i7, f6Var));
        this.a = i7;
        this.b = f6Var;
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
