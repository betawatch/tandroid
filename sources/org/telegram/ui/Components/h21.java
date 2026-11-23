package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.TextPaint;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class h21 extends Drawable {
    public final nh0 a;
    public int b;
    public final TextPaint c;

    public h21(TextPaint textPaint) {
        a5.b bVar = new a5.b(this, 8);
        this.c = textPaint;
        float textSize = textPaint.getTextSize() * 0.89f;
        nh0 nh0Var = new nh0(R.raw.dots_loading, (int) textSize, (int) (textSize * 1.25f));
        this.a = nh0Var;
        nh0Var.setCallback(bVar);
        nh0Var.K(1);
        nh0Var.M((int) ((SystemClock.elapsedRealtime() / 16.0f) % 60.0f));
        nh0Var.J(true);
        nh0Var.start();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int color = this.c.getColor();
        int i7 = this.b;
        nh0 nh0Var = this.a;
        if (color != i7) {
            nh0Var.a0 = true;
            nh0Var.Q(color, "Comp 1");
            nh0Var.o();
            nh0Var.J(true);
            nh0Var.V(0L);
            this.b = color;
        }
        nh0Var.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i7) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
