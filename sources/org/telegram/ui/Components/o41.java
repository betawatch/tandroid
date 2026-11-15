package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.drawable.ColorDrawable;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class o41 extends ColorDrawable {
    public final int a;
    public final org.telegram.ui.ActionBar.e6 b;

    public o41(int i7, org.telegram.ui.ActionBar.e6 e6Var) {
        super(org.telegram.ui.ActionBar.j6.w0(i7, e6Var));
        this.a = i7;
        this.b = e6Var;
    }

    @Override // android.graphics.drawable.ColorDrawable, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int w02 = org.telegram.ui.ActionBar.j6.w0(this.a, this.b);
        if (getColor() != w02) {
            setColor(w02);
        }
        super.draw(canvas);
    }
}
