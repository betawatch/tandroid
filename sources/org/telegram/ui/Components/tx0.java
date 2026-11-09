package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.widget.TextView;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class tx0 extends TextView {
    public final ux0 a;
    public boolean b;
    public boolean c;

    public tx0(ux0 ux0Var, CharSequence charSequence) {
        super(ux0Var.getContext());
        this.a = ux0Var;
        org.telegram.ui.ActionBar.g6 g6Var = ux0Var.a;
        setPadding(org.telegram.messenger.g0.L(12.66f), org.telegram.messenger.g0.L(9.33f), org.telegram.messenger.g0.L(12.66f), org.telegram.messenger.g0.L(9.33f));
        org.telegram.ui.ActionBar.s6.U(this, org.telegram.ui.ActionBar.l6.G6, g6Var);
        setTypeface(org.telegram.messenger.g0.o());
        setTextSize(1, 14.0f);
        setText(charSequence);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        boolean z9 = this.b;
        ux0 ux0Var = this.a;
        if (z9 || this.c) {
            canvas2 = canvas;
            float L = org.telegram.messenger.g0.L(10.0f);
            float[] fArr = ux0Var.c;
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
            ux0Var.b.rewind();
            RectF rectF = org.telegram.messenger.g0.P;
            float f11 = ux0Var.h;
            rectF.set(f11, f11, getWidth() + ux0Var.h, (ux0Var.h * (this.c ? -1 : 1)) + getHeight());
            ux0Var.b.addRoundRect(rectF, ux0Var.c, Path.Direction.CW);
            canvas2.drawPath(ux0Var.b, ux0Var.d);
            canvas2.drawPath(ux0Var.b, ux0Var.e);
        } else {
            float f12 = ux0Var.h;
            canvas2 = canvas;
            canvas2.drawRect(f12, f12, getWidth() + ux0Var.h, getHeight() + ux0Var.h, ux0Var.d);
            float f13 = ux0Var.h;
            canvas2.drawRect(f13, f13, getWidth() + ux0Var.h, getHeight() + ux0Var.h, ux0Var.e);
        }
        super.onDraw(canvas2);
    }
}
