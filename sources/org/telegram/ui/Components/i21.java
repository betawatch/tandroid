package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.TextPaint;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class i21 extends Drawable {
    public final oh0 a;
    public int b;
    public final TextPaint c;

    public i21(TextPaint textPaint) {
        a5.b bVar = new a5.b(this, 8);
        this.c = textPaint;
        float textSize = textPaint.getTextSize() * 0.89f;
        oh0 oh0Var = new oh0(R.raw.dots_loading, (int) textSize, (int) (textSize * 1.25f));
        this.a = oh0Var;
        oh0Var.setCallback(bVar);
        oh0Var.K(1);
        oh0Var.M((int) ((SystemClock.elapsedRealtime() / 16.0f) % 60.0f));
        oh0Var.J(true);
        oh0Var.start();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int color = this.c.getColor();
        int i7 = this.b;
        oh0 oh0Var = this.a;
        if (color != i7) {
            oh0Var.a0 = true;
            oh0Var.Q(color, "Comp 1");
            oh0Var.o();
            oh0Var.J(true);
            oh0Var.V(0L);
            this.b = color;
        }
        oh0Var.draw(canvas);
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
