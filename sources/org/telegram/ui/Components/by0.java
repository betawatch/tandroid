package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.widget.TextView;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class by0 extends TextView {
    public final cy0 a;
    public boolean b;
    public boolean c;

    public by0(cy0 cy0Var, CharSequence charSequence) {
        super(cy0Var.getContext());
        this.a = cy0Var;
        org.telegram.ui.ActionBar.i6 i6Var = cy0Var.a;
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
        cy0 cy0Var = this.a;
        if (z10 || this.c) {
            canvas2 = canvas;
            float L = org.telegram.messenger.g0.L(10.0f);
            float[] fArr = cy0Var.c;
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
            cy0Var.b.rewind();
            RectF rectF = org.telegram.messenger.g0.P;
            float f11 = cy0Var.h;
            rectF.set(f11, f11, getWidth() + cy0Var.h, (cy0Var.h * (this.c ? -1 : 1)) + getHeight());
            cy0Var.b.addRoundRect(rectF, cy0Var.c, Path.Direction.CW);
            canvas2.drawPath(cy0Var.b, cy0Var.d);
            canvas2.drawPath(cy0Var.b, cy0Var.e);
        } else {
            float f12 = cy0Var.h;
            canvas2 = canvas;
            canvas2.drawRect(f12, f12, getWidth() + cy0Var.h, getHeight() + cy0Var.h, cy0Var.d);
            float f13 = cy0Var.h;
            canvas2.drawRect(f13, f13, getWidth() + cy0Var.h, getHeight() + cy0Var.h, cy0Var.e);
        }
        super.onDraw(canvas2);
    }
}
