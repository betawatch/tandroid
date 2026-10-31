package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.widget.TextView;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class vy0 extends TextView {
    public final wy0 a;
    public boolean b;
    public boolean c;

    public vy0(wy0 wy0Var, CharSequence charSequence) {
        super(wy0Var.getContext());
        this.a = wy0Var;
        org.telegram.ui.ActionBar.p6 p6Var = wy0Var.a;
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
        wy0 wy0Var = this.a;
        if (z10 || this.c) {
            canvas2 = canvas;
            float L = org.telegram.messenger.i0.L(10.0f);
            float[] fArr = wy0Var.c;
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
            wy0Var.b.rewind();
            RectF rectF = org.telegram.messenger.i0.P;
            float f10 = wy0Var.h;
            rectF.set(f10, f10, getWidth() + wy0Var.h, (wy0Var.h * (this.c ? -1 : 1)) + getHeight());
            wy0Var.b.addRoundRect(rectF, wy0Var.c, Path.Direction.CW);
            canvas2.drawPath(wy0Var.b, wy0Var.d);
            canvas2.drawPath(wy0Var.b, wy0Var.e);
        } else {
            float f11 = wy0Var.h;
            canvas2 = canvas;
            canvas2.drawRect(f11, f11, getWidth() + wy0Var.h, getHeight() + wy0Var.h, wy0Var.d);
            float f12 = wy0Var.h;
            canvas2.drawRect(f12, f12, getWidth() + wy0Var.h, getHeight() + wy0Var.h, wy0Var.e);
        }
        super.onDraw(canvas2);
    }
}
