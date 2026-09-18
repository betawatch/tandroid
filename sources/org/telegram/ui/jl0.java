package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class jl0 extends Drawable {
    public final /* synthetic */ org.telegram.ui.Components.h01 a;
    public final /* synthetic */ org.telegram.ui.ActionBar.f6 b;

    public jl0(org.telegram.ui.Components.h01 h01Var, org.telegram.ui.ActionBar.f6 f6Var) {
        this.a = h01Var;
        this.b = f6Var;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        this.a.c(getBounds().centerX() - (this.a.c / 2.0f), getBounds().centerY(), 1.0f, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G6, this.b), canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
