package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class by0 extends FrameLayout {
    public final dy0 a;
    public boolean b;
    public boolean c;
    public boolean d;

    public by0(dy0 dy0Var, View view, boolean z10) {
        super(dy0Var.getContext());
        this.a = dy0Var;
        setWillNotDraw(false);
        if (!z10) {
            setPadding(org.telegram.messenger.g0.L(12.66f), org.telegram.messenger.g0.L(9.33f), org.telegram.messenger.g0.L(12.66f), org.telegram.messenger.g0.L(9.33f));
        }
        addView(view, c8.na.c(-1.0f, -1));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        boolean z10 = this.c;
        dy0 dy0Var = this.a;
        if (z10 || this.d) {
            canvas2 = canvas;
            float L = org.telegram.messenger.g0.L(10.0f);
            float[] fArr = dy0Var.c;
            boolean z11 = this.c;
            float f10 = z11 ? L : 0.0f;
            fArr[1] = f10;
            fArr[0] = f10;
            float f11 = z11 ? L : 0.0f;
            fArr[3] = f11;
            fArr[2] = f11;
            boolean z12 = this.d;
            float f12 = z12 ? L : 0.0f;
            fArr[5] = f12;
            fArr[4] = f12;
            if (!z12) {
                L = 0.0f;
            }
            fArr[7] = L;
            fArr[6] = L;
            dy0Var.b.rewind();
            RectF rectF = org.telegram.messenger.g0.P;
            float f13 = dy0Var.h;
            rectF.set(f13, f13, getWidth() - dy0Var.h, (dy0Var.h * (this.d ? -1.0f : 1.0f)) + getHeight());
            dy0Var.b.addRoundRect(rectF, dy0Var.c, Path.Direction.CW);
            if (this.b) {
                canvas2.drawPath(dy0Var.b, dy0Var.d);
            }
            canvas2.drawPath(dy0Var.b, dy0Var.e);
        } else {
            if (this.b) {
                float f14 = dy0Var.h;
                canvas2 = canvas;
                canvas2.drawRect(f14, f14, getWidth() + dy0Var.h, getHeight() + dy0Var.h, dy0Var.d);
            } else {
                canvas2 = canvas;
            }
            float f15 = dy0Var.h;
            canvas2.drawRect(f15, f15, getWidth() - dy0Var.h, getHeight() + dy0Var.h, dy0Var.e);
        }
        super.onDraw(canvas2);
    }

    public void setFilled(boolean z10) {
        this.b = z10;
    }
}
