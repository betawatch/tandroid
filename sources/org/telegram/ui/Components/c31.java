package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.TextPaint;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class c31 extends Drawable {
    public final yi0 a;
    public int b;
    public final TextPaint c;

    public c31(TextPaint textPaint) {
        i.f fVar = new i.f(this, 5);
        this.c = textPaint;
        float textSize = textPaint.getTextSize() * 0.89f;
        yi0 yi0Var = new yi0(R.raw.dots_loading, (int) textSize, (int) (textSize * 1.25f));
        this.a = yi0Var;
        yi0Var.setCallback(fVar);
        yi0Var.K(1);
        yi0Var.M((int) ((SystemClock.elapsedRealtime() / 16.0f) % 60.0f));
        yi0Var.J(true);
        yi0Var.start();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int color = this.c.getColor();
        int i10 = this.b;
        yi0 yi0Var = this.a;
        if (color != i10) {
            yi0Var.Z = true;
            yi0Var.Q(color, "Comp 1");
            yi0Var.o();
            yi0Var.J(true);
            yi0Var.V(0L);
            this.b = color;
        }
        yi0Var.draw(canvas);
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
