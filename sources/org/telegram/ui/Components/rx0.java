package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.widget.TextView;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class rx0 extends TextView {
    public final sx0 a;
    public boolean b;
    public boolean c;

    public rx0(sx0 sx0Var, CharSequence charSequence) {
        super(sx0Var.getContext());
        this.a = sx0Var;
        org.telegram.ui.ActionBar.f6 f6Var = sx0Var.a;
        setPadding(org.telegram.messenger.g0.L(12.66f), org.telegram.messenger.g0.L(9.33f), org.telegram.messenger.g0.L(12.66f), org.telegram.messenger.g0.L(9.33f));
        org.telegram.ui.ActionBar.r6.V(this, org.telegram.ui.ActionBar.k6.G6, f6Var);
        setTypeface(org.telegram.messenger.g0.o());
        setTextSize(1, 14.0f);
        setText(charSequence);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        boolean z9 = this.b;
        sx0 sx0Var = this.a;
        if (z9 || this.c) {
            canvas2 = canvas;
            float L = org.telegram.messenger.g0.L(10.0f);
            float[] fArr = sx0Var.c;
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
            sx0Var.b.rewind();
            RectF rectF = org.telegram.messenger.g0.P;
            float f11 = sx0Var.h;
            rectF.set(f11, f11, getWidth() + sx0Var.h, (sx0Var.h * (this.c ? -1 : 1)) + getHeight());
            sx0Var.b.addRoundRect(rectF, sx0Var.c, Path.Direction.CW);
            canvas2.drawPath(sx0Var.b, sx0Var.d);
            canvas2.drawPath(sx0Var.b, sx0Var.e);
        } else {
            float f12 = sx0Var.h;
            canvas2 = canvas;
            canvas2.drawRect(f12, f12, getWidth() + sx0Var.h, getHeight() + sx0Var.h, sx0Var.d);
            float f13 = sx0Var.h;
            canvas2.drawRect(f13, f13, getWidth() + sx0Var.h, getHeight() + sx0Var.h, sx0Var.e);
        }
        super.onDraw(canvas2);
    }
}
