package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class qx0 extends FrameLayout {
    public final sx0 a;
    public boolean b;
    public boolean c;
    public boolean d;

    public qx0(sx0 sx0Var, View view, boolean z9) {
        super(sx0Var.getContext());
        this.a = sx0Var;
        setWillNotDraw(false);
        if (!z9) {
            setPadding(org.telegram.messenger.g0.L(12.66f), org.telegram.messenger.g0.L(9.33f), org.telegram.messenger.g0.L(12.66f), org.telegram.messenger.g0.L(9.33f));
        }
        addView(view, c8.ha.c(-1.0f, -1));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        boolean z9 = this.c;
        sx0 sx0Var = this.a;
        if (z9 || this.d) {
            canvas2 = canvas;
            float L = org.telegram.messenger.g0.L(10.0f);
            float[] fArr = sx0Var.c;
            boolean z10 = this.c;
            float f10 = z10 ? L : 0.0f;
            fArr[1] = f10;
            fArr[0] = f10;
            float f11 = z10 ? L : 0.0f;
            fArr[3] = f11;
            fArr[2] = f11;
            boolean z11 = this.d;
            float f12 = z11 ? L : 0.0f;
            fArr[5] = f12;
            fArr[4] = f12;
            if (!z11) {
                L = 0.0f;
            }
            fArr[7] = L;
            fArr[6] = L;
            sx0Var.b.rewind();
            RectF rectF = org.telegram.messenger.g0.P;
            float f13 = sx0Var.h;
            rectF.set(f13, f13, getWidth() - sx0Var.h, (sx0Var.h * (this.d ? -1.0f : 1.0f)) + getHeight());
            sx0Var.b.addRoundRect(rectF, sx0Var.c, Path.Direction.CW);
            if (this.b) {
                canvas2.drawPath(sx0Var.b, sx0Var.d);
            }
            canvas2.drawPath(sx0Var.b, sx0Var.e);
        } else {
            if (this.b) {
                float f14 = sx0Var.h;
                canvas2 = canvas;
                canvas2.drawRect(f14, f14, getWidth() + sx0Var.h, getHeight() + sx0Var.h, sx0Var.d);
            } else {
                canvas2 = canvas;
            }
            float f15 = sx0Var.h;
            canvas2.drawRect(f15, f15, getWidth() - sx0Var.h, getHeight() + sx0Var.h, sx0Var.e);
        }
        super.onDraw(canvas2);
    }

    public void setFilled(boolean z9) {
        this.b = z9;
    }
}
