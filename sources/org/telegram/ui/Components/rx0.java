package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class rx0 extends FrameLayout {
    public final tx0 a;
    public boolean b;
    public boolean c;
    public boolean d;

    public rx0(tx0 tx0Var, View view, boolean z9) {
        super(tx0Var.getContext());
        this.a = tx0Var;
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
        tx0 tx0Var = this.a;
        if (z9 || this.d) {
            canvas2 = canvas;
            float L = org.telegram.messenger.g0.L(10.0f);
            float[] fArr = tx0Var.c;
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
            tx0Var.b.rewind();
            RectF rectF = org.telegram.messenger.g0.P;
            float f13 = tx0Var.h;
            rectF.set(f13, f13, getWidth() - tx0Var.h, (tx0Var.h * (this.d ? -1.0f : 1.0f)) + getHeight());
            tx0Var.b.addRoundRect(rectF, tx0Var.c, Path.Direction.CW);
            if (this.b) {
                canvas2.drawPath(tx0Var.b, tx0Var.d);
            }
            canvas2.drawPath(tx0Var.b, tx0Var.e);
        } else {
            if (this.b) {
                float f14 = tx0Var.h;
                canvas2 = canvas;
                canvas2.drawRect(f14, f14, getWidth() + tx0Var.h, getHeight() + tx0Var.h, tx0Var.d);
            } else {
                canvas2 = canvas;
            }
            float f15 = tx0Var.h;
            canvas2.drawRect(f15, f15, getWidth() - tx0Var.h, getHeight() + tx0Var.h, tx0Var.e);
        }
        super.onDraw(canvas2);
    }

    public void setFilled(boolean z9) {
        this.b = z9;
    }
}
