package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class rx0 extends FrameLayout {
    public final ux0 a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;

    public rx0(ux0 ux0Var, View view, boolean z9) {
        super(ux0Var.getContext());
        this.d = false;
        this.e = true;
        this.a = ux0Var;
        setWillNotDraw(false);
        if (!z9) {
            setPadding(org.telegram.messenger.g0.L(12.66f), org.telegram.messenger.g0.L(9.33f), org.telegram.messenger.g0.L(12.66f), org.telegram.messenger.g0.L(9.33f));
        }
        addView(view, c8.ha.c(-1.0f, -1));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        boolean z9 = this.b;
        ux0 ux0Var = this.a;
        if (z9 || this.c) {
            canvas2 = canvas;
            float L = org.telegram.messenger.g0.L(10.0f);
            float[] fArr = ux0Var.c;
            boolean z10 = this.b;
            float f10 = (z10 && this.d) ? L : 0.0f;
            fArr[1] = f10;
            fArr[0] = f10;
            float f11 = (z10 && this.e) ? L : 0.0f;
            fArr[3] = f11;
            fArr[2] = f11;
            boolean z11 = this.c;
            float f12 = (z11 && this.e) ? L : 0.0f;
            fArr[5] = f12;
            fArr[4] = f12;
            if (!z11 || !this.d) {
                L = 0.0f;
            }
            fArr[7] = L;
            fArr[6] = L;
            ux0Var.b.rewind();
            RectF rectF = org.telegram.messenger.g0.P;
            float f13 = ux0Var.h;
            rectF.set(f13, f13, getWidth() - ux0Var.h, (ux0Var.h * (this.c ? -1.0f : 1.0f)) + getHeight());
            if (!this.e) {
                rectF.right += ux0Var.f;
            }
            ux0Var.b.addRoundRect(rectF, ux0Var.c, Path.Direction.CW);
            canvas2.drawPath(ux0Var.b, ux0Var.e);
        } else {
            float f14 = ux0Var.h;
            canvas2 = canvas;
            canvas2.drawRect(f14, f14, getWidth() - ux0Var.h, getHeight() + ux0Var.h, ux0Var.e);
        }
        super.onDraw(canvas2);
    }
}
