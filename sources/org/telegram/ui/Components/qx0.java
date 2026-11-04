package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.widget.TextView;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class qx0 extends TextView {
    public final rx0 a;
    public boolean b;
    public boolean c;

    public qx0(rx0 rx0Var, CharSequence charSequence) {
        super(rx0Var.getContext());
        this.a = rx0Var;
        org.telegram.ui.ActionBar.e6 e6Var = rx0Var.a;
        setPadding(org.telegram.messenger.g0.L(12.66f), org.telegram.messenger.g0.L(9.33f), org.telegram.messenger.g0.L(12.66f), org.telegram.messenger.g0.L(9.33f));
        org.telegram.ui.ActionBar.r6.V(this, org.telegram.ui.ActionBar.k6.G6, e6Var);
        setTypeface(org.telegram.messenger.g0.o());
        setTextSize(1, 14.0f);
        setText(charSequence);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        boolean z10 = this.b;
        rx0 rx0Var = this.a;
        if (z10 || this.c) {
            canvas2 = canvas;
            float L = org.telegram.messenger.g0.L(10.0f);
            float[] fArr = rx0Var.c;
            float f10 = this.b ? L : 0.0f;
            fArr[1] = f10;
            fArr[0] = f10;
            fArr[3] = 0.0f;
            fArr[2] = 0.0f;
            fArr[5] = 0.0f;
            fArr[4] = 0.0f;
            if (!this.c) {
                L = 0.0f;
            }
            fArr[7] = L;
            fArr[6] = L;
            rx0Var.b.rewind();
            RectF rectF = org.telegram.messenger.g0.P;
            float f11 = rx0Var.h;
            rectF.set(f11, f11, getWidth() + rx0Var.h, (rx0Var.h * (this.c ? -1 : 1)) + getHeight());
            rx0Var.b.addRoundRect(rectF, rx0Var.c, Path.Direction.CW);
            canvas2.drawPath(rx0Var.b, rx0Var.d);
            canvas2.drawPath(rx0Var.b, rx0Var.e);
        } else {
            float f12 = rx0Var.h;
            canvas2 = canvas;
            canvas2.drawRect(f12, f12, getWidth() + rx0Var.h, getHeight() + rx0Var.h, rx0Var.d);
            float f13 = rx0Var.h;
            canvas2.drawRect(f13, f13, getWidth() + rx0Var.h, getHeight() + rx0Var.h, rx0Var.e);
        }
        super.onDraw(canvas2);
    }
}
