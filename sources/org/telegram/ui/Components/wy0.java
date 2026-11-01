package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.widget.TextView;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class wy0 extends TextView {
    public final xy0 a;
    public boolean b;
    public boolean c;

    public wy0(xy0 xy0Var, CharSequence charSequence) {
        super(xy0Var.getContext());
        this.a = xy0Var;
        org.telegram.ui.ActionBar.p6 p6Var = xy0Var.a;
        setPadding(org.telegram.messenger.i0.L(12.66f), org.telegram.messenger.i0.L(9.33f), org.telegram.messenger.i0.L(12.66f), org.telegram.messenger.i0.L(9.33f));
        org.telegram.ui.ActionBar.a7.V(this, org.telegram.ui.ActionBar.t6.G6, p6Var);
        setTypeface(org.telegram.messenger.i0.o());
        setTextSize(1, 14.0f);
        setText(charSequence);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        boolean z10 = this.b;
        xy0 xy0Var = this.a;
        if (z10 || this.c) {
            canvas2 = canvas;
            float L = org.telegram.messenger.i0.L(10.0f);
            float[] fArr = xy0Var.c;
            float f7 = this.b ? L : 0.0f;
            fArr[1] = f7;
            fArr[0] = f7;
            fArr[3] = 0.0f;
            fArr[2] = 0.0f;
            fArr[5] = 0.0f;
            fArr[4] = 0.0f;
            if (!this.c) {
                L = 0.0f;
            }
            fArr[7] = L;
            fArr[6] = L;
            xy0Var.b.rewind();
            RectF rectF = org.telegram.messenger.i0.P;
            float f10 = xy0Var.h;
            rectF.set(f10, f10, getWidth() + xy0Var.h, (xy0Var.h * (this.c ? -1 : 1)) + getHeight());
            xy0Var.b.addRoundRect(rectF, xy0Var.c, Path.Direction.CW);
            canvas2.drawPath(xy0Var.b, xy0Var.d);
            canvas2.drawPath(xy0Var.b, xy0Var.e);
        } else {
            float f11 = xy0Var.h;
            canvas2 = canvas;
            canvas2.drawRect(f11, f11, getWidth() + xy0Var.h, getHeight() + xy0Var.h, xy0Var.d);
            float f12 = xy0Var.h;
            canvas2.drawRect(f12, f12, getWidth() + xy0Var.h, getHeight() + xy0Var.h, xy0Var.e);
        }
        super.onDraw(canvas2);
    }
}
