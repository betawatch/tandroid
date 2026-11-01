package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class ei0 extends Drawable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ fi0 c;

    public ei0(fi0 fi0Var, int i10, int i11) {
        this.c = fi0Var;
        this.a = i10;
        this.b = i11;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect rect = org.telegram.messenger.i0.Q;
        int centerX = getBounds().centerX();
        float f7 = this.a;
        int L = centerX - (org.telegram.messenger.i0.L(f7) / 2);
        int centerY = getBounds().centerY();
        float f10 = this.b;
        rect.set(L, centerY - (org.telegram.messenger.i0.L(f10) / 2), (org.telegram.messenger.i0.L(f7) / 2) + getBounds().centerX(), (org.telegram.messenger.i0.L(f10) / 2) + getBounds().centerY());
        fi0 fi0Var = this.c;
        fi0Var.c.z0(rect);
        fi0Var.c.h(canvas, null);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        this.c.c.setAlpha(i10 / 255.0f);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.c.c.o1 = colorFilter;
    }
}
