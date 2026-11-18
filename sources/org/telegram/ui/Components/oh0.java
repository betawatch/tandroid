package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class oh0 extends Drawable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ ph0 c;

    public oh0(ph0 ph0Var, int i7, int i10) {
        this.c = ph0Var;
        this.a = i7;
        this.b = i10;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect rect = org.telegram.messenger.g0.Q;
        int centerX = getBounds().centerX();
        float f10 = this.a;
        int L = centerX - (org.telegram.messenger.g0.L(f10) / 2);
        int centerY = getBounds().centerY();
        float f11 = this.b;
        rect.set(L, centerY - (org.telegram.messenger.g0.L(f11) / 2), (org.telegram.messenger.g0.L(f10) / 2) + getBounds().centerX(), (org.telegram.messenger.g0.L(f11) / 2) + getBounds().centerY());
        ph0 ph0Var = this.c;
        ph0Var.c.z0(rect);
        ph0Var.c.h(canvas, null);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i7) {
        this.c.c.setAlpha(i7 / 255.0f);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.c.c.p1 = colorFilter;
    }
}
