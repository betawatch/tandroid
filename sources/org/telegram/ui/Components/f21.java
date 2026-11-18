package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.TextPaint;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class f21 extends Drawable {
    public final mh0 a;
    public int b;
    public final TextPaint c;

    public f21(TextPaint textPaint) {
        a5.b bVar = new a5.b(this, 8);
        this.c = textPaint;
        float textSize = textPaint.getTextSize() * 0.89f;
        mh0 mh0Var = new mh0(R.raw.dots_loading, (int) textSize, (int) (textSize * 1.25f));
        this.a = mh0Var;
        mh0Var.setCallback(bVar);
        mh0Var.K(1);
        mh0Var.M((int) ((SystemClock.elapsedRealtime() / 16.0f) % 60.0f));
        mh0Var.J(true);
        mh0Var.start();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int color = this.c.getColor();
        int i7 = this.b;
        mh0 mh0Var = this.a;
        if (color != i7) {
            mh0Var.a0 = true;
            mh0Var.Q(color, "Comp 1");
            mh0Var.o();
            mh0Var.J(true);
            mh0Var.V(0L);
            this.b = color;
        }
        mh0Var.draw(canvas);
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
