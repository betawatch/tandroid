package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.widget.TextView;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class sx0 extends TextView {
    public final tx0 a;
    public boolean b;
    public boolean c;

    public sx0(tx0 tx0Var, CharSequence charSequence) {
        super(tx0Var.getContext());
        this.a = tx0Var;
        org.telegram.ui.ActionBar.h6 h6Var = tx0Var.a;
        setPadding(org.telegram.messenger.g0.L(12.66f), org.telegram.messenger.g0.L(9.33f), org.telegram.messenger.g0.L(12.66f), org.telegram.messenger.g0.L(9.33f));
        org.telegram.ui.ActionBar.t6.U(this, org.telegram.ui.ActionBar.m6.G6, h6Var);
        setTypeface(org.telegram.messenger.g0.o());
        setTextSize(1, 14.0f);
        setText(charSequence);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        boolean z9 = this.b;
        tx0 tx0Var = this.a;
        if (z9 || this.c) {
            canvas2 = canvas;
            float L = org.telegram.messenger.g0.L(10.0f);
            float[] fArr = tx0Var.c;
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
            tx0Var.b.rewind();
            RectF rectF = org.telegram.messenger.g0.P;
            float f11 = tx0Var.h;
            rectF.set(f11, f11, getWidth() + tx0Var.h, (tx0Var.h * (this.c ? -1 : 1)) + getHeight());
            tx0Var.b.addRoundRect(rectF, tx0Var.c, Path.Direction.CW);
            canvas2.drawPath(tx0Var.b, tx0Var.d);
            canvas2.drawPath(tx0Var.b, tx0Var.e);
        } else {
            float f12 = tx0Var.h;
            canvas2 = canvas;
            canvas2.drawRect(f12, f12, getWidth() + tx0Var.h, getHeight() + tx0Var.h, tx0Var.d);
            float f13 = tx0Var.h;
            canvas2.drawRect(f13, f13, getWidth() + tx0Var.h, getHeight() + tx0Var.h, tx0Var.e);
        }
        super.onDraw(canvas2);
    }
}
