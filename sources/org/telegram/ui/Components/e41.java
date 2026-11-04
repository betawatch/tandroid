package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.drawable.ColorDrawable;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class e41 extends ColorDrawable {
    public final int a;
    public final org.telegram.ui.ActionBar.e6 b;

    public e41(int i3, org.telegram.ui.ActionBar.e6 e6Var) {
        super(org.telegram.ui.ActionBar.k6.w0(i3, e6Var));
        this.a = i3;
        this.b = e6Var;
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
