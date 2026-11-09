package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.drawable.ColorDrawable;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class l41 extends ColorDrawable {
    public final int a;
    public final org.telegram.ui.ActionBar.g6 b;

    public l41(int i7, org.telegram.ui.ActionBar.g6 g6Var) {
        super(org.telegram.ui.ActionBar.l6.w0(i7, g6Var));
        this.a = i7;
        this.b = g6Var;
    }

    @Override // android.graphics.drawable.ColorDrawable, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int w02 = org.telegram.ui.ActionBar.l6.w0(this.a, this.b);
        if (getColor() != w02) {
            setColor(w02);
        }
        super.draw(canvas);
    }
}
