package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.widget.TextView;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class cy0 extends TextView {
    public final dy0 a;
    public boolean b;
    public boolean c;

    public cy0(dy0 dy0Var, CharSequence charSequence) {
        super(dy0Var.getContext());
        this.a = dy0Var;
        org.telegram.ui.ActionBar.i6 i6Var = dy0Var.a;
        setPadding(org.telegram.messenger.g0.L(12.66f), org.telegram.messenger.g0.L(9.33f), org.telegram.messenger.g0.L(12.66f), org.telegram.messenger.g0.L(9.33f));
        org.telegram.ui.ActionBar.u6.U(this, org.telegram.ui.ActionBar.n6.G6, i6Var);
        setTypeface(org.telegram.messenger.g0.o());
        setTextSize(1, 14.0f);
        setText(charSequence);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        boolean z10 = this.b;
        dy0 dy0Var = this.a;
        if (z10 || this.c) {
            canvas2 = canvas;
            float L = org.telegram.messenger.g0.L(10.0f);
            float[] fArr = dy0Var.c;
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
            dy0Var.b.rewind();
            RectF rectF = org.telegram.messenger.g0.P;
            float f11 = dy0Var.h;
            rectF.set(f11, f11, getWidth() + dy0Var.h, (dy0Var.h * (this.c ? -1 : 1)) + getHeight());
            dy0Var.b.addRoundRect(rectF, dy0Var.c, Path.Direction.CW);
            canvas2.drawPath(dy0Var.b, dy0Var.d);
            canvas2.drawPath(dy0Var.b, dy0Var.e);
        } else {
            float f12 = dy0Var.h;
            canvas2 = canvas;
            canvas2.drawRect(f12, f12, getWidth() + dy0Var.h, getHeight() + dy0Var.h, dy0Var.d);
            float f13 = dy0Var.h;
            canvas2.drawRect(f13, f13, getWidth() + dy0Var.h, getHeight() + dy0Var.h, dy0Var.e);
        }
        super.onDraw(canvas2);
    }
}
