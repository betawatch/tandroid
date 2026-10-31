package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class uy0 extends FrameLayout {
    public final wy0 a;
    public boolean b;
    public boolean c;
    public boolean d;

    public uy0(wy0 wy0Var, View view, boolean z10) {
        super(wy0Var.getContext());
        this.a = wy0Var;
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
        wy0 wy0Var = this.a;
        if (z10 || this.d) {
            canvas2 = canvas;
            float L = org.telegram.messenger.i0.L(10.0f);
            float[] fArr = wy0Var.c;
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
            wy0Var.b.rewind();
            RectF rectF = org.telegram.messenger.i0.P;
            float f12 = wy0Var.h;
            rectF.set(f12, f12, getWidth() - wy0Var.h, (wy0Var.h * (this.d ? -1.0f : 1.0f)) + getHeight());
            wy0Var.b.addRoundRect(rectF, wy0Var.c, Path.Direction.CW);
            if (this.b) {
                canvas2.drawPath(wy0Var.b, wy0Var.d);
            }
            canvas2.drawPath(wy0Var.b, wy0Var.e);
        } else {
            if (this.b) {
                float f13 = wy0Var.h;
                canvas2 = canvas;
                canvas2.drawRect(f13, f13, getWidth() + wy0Var.h, getHeight() + wy0Var.h, wy0Var.d);
            } else {
                canvas2 = canvas;
            }
            float f14 = wy0Var.h;
            canvas2.drawRect(f14, f14, getWidth() - wy0Var.h, getHeight() + wy0Var.h, wy0Var.e);
        }
        super.onDraw(canvas2);
    }

    public void setFilled(boolean z10) {
        this.b = z10;
    }
}
