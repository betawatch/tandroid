package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.TextPaint;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class i41 extends Drawable {
    public final ck0 a;
    public int b;
    public final TextPaint c;

    public i41(TextPaint textPaint) {
        i.f fVar = new i.f(this, 5);
        this.c = textPaint;
        float textSize = textPaint.getTextSize() * 0.89f;
        ck0 ck0Var = new ck0(R.raw.dots_loading, (int) textSize, (int) (textSize * 1.25f));
        this.a = ck0Var;
        ck0Var.setCallback(fVar);
        ck0Var.K(1);
        ck0Var.M((int) ((SystemClock.elapsedRealtime() / 16.0f) % 60.0f));
        ck0Var.J(true);
        ck0Var.start();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int color = this.c.getColor();
        int i10 = this.b;
        ck0 ck0Var = this.a;
        if (color != i10) {
            ck0Var.Z = true;
            ck0Var.Q(color, "Comp 1");
            ck0Var.o();
            ck0Var.J(true);
            ck0Var.V(0L);
            this.b = color;
        }
        ck0Var.draw(canvas);
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
