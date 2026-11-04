package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class ox0 extends FrameLayout {
    public final rx0 a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;

    public ox0(rx0 rx0Var, View view, boolean z10) {
        super(rx0Var.getContext());
        this.d = false;
        this.e = true;
        this.a = rx0Var;
        setWillNotDraw(false);
        if (!z10) {
            setPadding(org.telegram.messenger.g0.L(12.66f), org.telegram.messenger.g0.L(9.33f), org.telegram.messenger.g0.L(12.66f), org.telegram.messenger.g0.L(9.33f));
        }
        addView(view, b8.mf.c(-1.0f, -1));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        boolean z10 = this.b;
        rx0 rx0Var = this.a;
        if (z10 || this.c) {
            canvas2 = canvas;
            float L = org.telegram.messenger.g0.L(10.0f);
            float[] fArr = rx0Var.c;
            boolean z11 = this.b;
            float f10 = (z11 && this.d) ? L : 0.0f;
            fArr[1] = f10;
            fArr[0] = f10;
            float f11 = (z11 && this.e) ? L : 0.0f;
            fArr[3] = f11;
            fArr[2] = f11;
            boolean z12 = this.c;
            float f12 = (z12 && this.e) ? L : 0.0f;
            fArr[5] = f12;
            fArr[4] = f12;
            if (!z12 || !this.d) {
                L = 0.0f;
            }
            fArr[7] = L;
            fArr[6] = L;
            rx0Var.b.rewind();
            RectF rectF = org.telegram.messenger.g0.P;
            float f13 = rx0Var.h;
            rectF.set(f13, f13, getWidth() - rx0Var.h, (rx0Var.h * (this.c ? -1.0f : 1.0f)) + getHeight());
            if (!this.e) {
                rectF.right += rx0Var.f;
            }
            rx0Var.b.addRoundRect(rectF, rx0Var.c, Path.Direction.CW);
            canvas2.drawPath(rx0Var.b, rx0Var.e);
        } else {
            float f14 = rx0Var.h;
            canvas2 = canvas;
            canvas2.drawRect(f14, f14, getWidth() - rx0Var.h, getHeight() + rx0Var.h, rx0Var.e);
        }
        super.onDraw(canvas2);
    }
}
