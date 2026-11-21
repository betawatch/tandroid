package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.drawable.ColorDrawable;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class b51 extends ColorDrawable {
    public final int a;
    public final org.telegram.ui.ActionBar.h6 b;

    public b51(int i7, org.telegram.ui.ActionBar.h6 h6Var) {
        super(org.telegram.ui.ActionBar.m6.w0(i7, h6Var));
        this.a = i7;
        this.b = h6Var;
    }

    @Override // android.graphics.drawable.ColorDrawable, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int w02 = org.telegram.ui.ActionBar.m6.w0(this.a, this.b);
        if (getColor() != w02) {
            setColor(w02);
        }
        super.draw(canvas);
    }
}
