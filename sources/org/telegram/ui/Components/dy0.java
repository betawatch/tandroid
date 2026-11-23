package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.widget.TextView;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class dy0 extends TextView {
    public final ey0 a;
    public boolean b;
    public boolean c;

    public dy0(ey0 ey0Var, CharSequence charSequence) {
        super(ey0Var.getContext());
        this.a = ey0Var;
        org.telegram.ui.ActionBar.h6 h6Var = ey0Var.a;
        setPadding(org.telegram.messenger.g0.L(12.66f), org.telegram.messenger.g0.L(9.33f), org.telegram.messenger.g0.L(12.66f), org.telegram.messenger.g0.L(9.33f));
        org.telegram.ui.ActionBar.t6.U(this, org.telegram.ui.ActionBar.m6.G6, h6Var);
        setTypeface(org.telegram.messenger.g0.o());
        setTextSize(1, 14.0f);
        setText(charSequence);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        boolean z10 = this.b;
        ey0 ey0Var = this.a;
        if (z10 || this.c) {
            canvas2 = canvas;
            float L = org.telegram.messenger.g0.L(10.0f);
            float[] fArr = ey0Var.c;
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
            ey0Var.b.rewind();
            RectF rectF = org.telegram.messenger.g0.P;
            float f11 = ey0Var.h;
            rectF.set(f11, f11, getWidth() + ey0Var.h, (ey0Var.h * (this.c ? -1 : 1)) + getHeight());
            ey0Var.b.addRoundRect(rectF, ey0Var.c, Path.Direction.CW);
            canvas2.drawPath(ey0Var.b, ey0Var.d);
            canvas2.drawPath(ey0Var.b, ey0Var.e);
        } else {
            float f12 = ey0Var.h;
            canvas2 = canvas;
            canvas2.drawRect(f12, f12, getWidth() + ey0Var.h, getHeight() + ey0Var.h, ey0Var.d);
            float f13 = ey0Var.h;
            canvas2.drawRect(f13, f13, getWidth() + ey0Var.h, getHeight() + ey0Var.h, ey0Var.e);
        }
        super.onDraw(canvas2);
    }
}
