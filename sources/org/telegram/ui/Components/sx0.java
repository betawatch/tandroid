package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class sx0 extends FrameLayout {
    public final vx0 a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;

    public sx0(vx0 vx0Var, View view, boolean z10) {
        super(vx0Var.getContext());
        this.d = false;
        this.e = true;
        this.a = vx0Var;
        setWillNotDraw(false);
        if (!z10) {
            setPadding(org.telegram.messenger.g0.L(12.66f), org.telegram.messenger.g0.L(9.33f), org.telegram.messenger.g0.L(12.66f), org.telegram.messenger.g0.L(9.33f));
        }
        addView(view, c8.ja.c(-1.0f, -1));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        boolean z10 = this.b;
        vx0 vx0Var = this.a;
        if (z10 || this.c) {
            canvas2 = canvas;
            float L = org.telegram.messenger.g0.L(10.0f);
            float[] fArr = vx0Var.c;
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
            vx0Var.b.rewind();
            RectF rectF = org.telegram.messenger.g0.P;
            float f13 = vx0Var.h;
            rectF.set(f13, f13, getWidth() - vx0Var.h, (vx0Var.h * (this.c ? -1.0f : 1.0f)) + getHeight());
            if (!this.e) {
                rectF.right += vx0Var.f;
            }
            vx0Var.b.addRoundRect(rectF, vx0Var.c, Path.Direction.CW);
            canvas2.drawPath(vx0Var.b, vx0Var.e);
        } else {
            float f14 = vx0Var.h;
            canvas2 = canvas;
            canvas2.drawRect(f14, f14, getWidth() - vx0Var.h, getHeight() + vx0Var.h, vx0Var.e);
        }
        super.onDraw(canvas2);
    }
}
