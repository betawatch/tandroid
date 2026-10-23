package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.TextPaint;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final class z31 extends Drawable {
    public final vj0 a;
    public int b;
    public final TextPaint c;

    public z31(TextPaint textPaint) {
        ah.f1 f1Var = new ah.f1(this, 7);
        this.c = textPaint;
        float textSize = textPaint.getTextSize() * 0.89f;
        vj0 vj0Var = new vj0(R.raw.dots_loading, (int) textSize, (int) (textSize * 1.25f));
        this.a = vj0Var;
        vj0Var.setCallback(f1Var);
        vj0Var.K(1);
        vj0Var.M((int) ((SystemClock.elapsedRealtime() / 16.0f) % 60.0f));
        vj0Var.J(true);
        vj0Var.start();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int color = this.c.getColor();
        int i10 = this.b;
        vj0 vj0Var = this.a;
        if (color != i10) {
            vj0Var.Z = true;
            vj0Var.Q(color, "Comp 1");
            vj0Var.o();
            vj0Var.J(true);
            vj0Var.V(0L);
            this.b = color;
        }
        vj0Var.draw(canvas);
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
