package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class vy0 extends FrameLayout {
    public final xy0 a;
    public boolean b;
    public boolean c;
    public boolean d;

    public vy0(xy0 xy0Var, View view, boolean z10) {
        super(xy0Var.getContext());
        this.a = xy0Var;
        setWillNotDraw(false);
        if (!z10) {
            setPadding(org.telegram.messenger.i0.L(12.66f), org.telegram.messenger.i0.L(9.33f), org.telegram.messenger.i0.L(12.66f), org.telegram.messenger.i0.L(9.33f));
        }
        addView(view, w7.b6.c(-1.0f, -1));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        boolean z10 = this.c;
        xy0 xy0Var = this.a;
        if (z10 || this.d) {
            canvas2 = canvas;
            float L = org.telegram.messenger.i0.L(10.0f);
            float[] fArr = xy0Var.c;
            boolean z11 = this.c;
            float f7 = z11 ? L : 0.0f;
            fArr[1] = f7;
            fArr[0] = f7;
            float f10 = z11 ? L : 0.0f;
            fArr[3] = f10;
            fArr[2] = f10;
            boolean z12 = this.d;
            float f11 = z12 ? L : 0.0f;
            fArr[5] = f11;
            fArr[4] = f11;
            if (!z12) {
                L = 0.0f;
            }
            fArr[7] = L;
            fArr[6] = L;
            xy0Var.b.rewind();
            RectF rectF = org.telegram.messenger.i0.P;
            float f12 = xy0Var.h;
            rectF.set(f12, f12, getWidth() - xy0Var.h, (xy0Var.h * (this.d ? -1.0f : 1.0f)) + getHeight());
            xy0Var.b.addRoundRect(rectF, xy0Var.c, Path.Direction.CW);
            if (this.b) {
                canvas2.drawPath(xy0Var.b, xy0Var.d);
            }
            canvas2.drawPath(xy0Var.b, xy0Var.e);
        } else {
            if (this.b) {
                float f13 = xy0Var.h;
                canvas2 = canvas;
                canvas2.drawRect(f13, f13, getWidth() + xy0Var.h, getHeight() + xy0Var.h, xy0Var.d);
            } else {
                canvas2 = canvas;
            }
            float f14 = xy0Var.h;
            canvas2.drawRect(f14, f14, getWidth() - xy0Var.h, getHeight() + xy0Var.h, xy0Var.e);
        }
        super.onDraw(canvas2);
    }

    public void setFilled(boolean z10) {
        this.b = z10;
    }
}
