package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class kl0 extends Drawable {
    public final /* synthetic */ org.telegram.ui.Components.f01 a;
    public final /* synthetic */ org.telegram.ui.ActionBar.f6 b;

    public kl0(org.telegram.ui.Components.f01 f01Var, org.telegram.ui.ActionBar.f6 f6Var) {
        this.a = f01Var;
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
