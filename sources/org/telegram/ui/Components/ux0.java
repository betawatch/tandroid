package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.widget.TextView;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class ux0 extends TextView {
    public final vx0 a;
    public boolean b;
    public boolean c;

    public ux0(vx0 vx0Var, CharSequence charSequence) {
        super(vx0Var.getContext());
        this.a = vx0Var;
        org.telegram.ui.ActionBar.e6 e6Var = vx0Var.a;
        setPadding(org.telegram.messenger.g0.L(12.66f), org.telegram.messenger.g0.L(9.33f), org.telegram.messenger.g0.L(12.66f), org.telegram.messenger.g0.L(9.33f));
        org.telegram.ui.ActionBar.q6.U(this, org.telegram.ui.ActionBar.j6.G6, e6Var);
        setTypeface(org.telegram.messenger.g0.o());
        setTextSize(1, 14.0f);
        setText(charSequence);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        boolean z10 = this.b;
        vx0 vx0Var = this.a;
        if (z10 || this.c) {
            canvas2 = canvas;
            float L = org.telegram.messenger.g0.L(10.0f);
            float[] fArr = vx0Var.c;
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
            vx0Var.b.rewind();
            RectF rectF = org.telegram.messenger.g0.P;
            float f11 = vx0Var.h;
            rectF.set(f11, f11, getWidth() + vx0Var.h, (vx0Var.h * (this.c ? -1 : 1)) + getHeight());
            vx0Var.b.addRoundRect(rectF, vx0Var.c, Path.Direction.CW);
            canvas2.drawPath(vx0Var.b, vx0Var.d);
            canvas2.drawPath(vx0Var.b, vx0Var.e);
        } else {
            float f12 = vx0Var.h;
            canvas2 = canvas;
            canvas2.drawRect(f12, f12, getWidth() + vx0Var.h, getHeight() + vx0Var.h, vx0Var.d);
            float f13 = vx0Var.h;
            canvas2.drawRect(f13, f13, getWidth() + vx0Var.h, getHeight() + vx0Var.h, vx0Var.e);
        }
        super.onDraw(canvas2);
    }
}
