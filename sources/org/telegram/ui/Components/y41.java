package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.drawable.ColorDrawable;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class y41 extends ColorDrawable {
    public final int a;
    public final org.telegram.ui.ActionBar.i6 b;

    public y41(int i7, org.telegram.ui.ActionBar.i6 i6Var) {
        super(org.telegram.ui.ActionBar.n6.w0(i7, i6Var));
        this.a = i7;
        this.b = i6Var;
    }

    @Override // android.graphics.drawable.ColorDrawable, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int w02 = org.telegram.ui.ActionBar.n6.w0(this.a, this.b);
        if (getColor() != w02) {
            setColor(w02);
        }
        super.draw(canvas);
    }
}
