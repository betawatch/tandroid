package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.drawable.ColorDrawable;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class a51 extends ColorDrawable {
    public final int a;
    public final org.telegram.ui.ActionBar.i6 b;

    public a51(int i7, org.telegram.ui.ActionBar.i6 i6Var) {
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
