package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class ay0 extends FrameLayout {
    public final cy0 a;
    public boolean b;
    public boolean c;
    public boolean d;

    public ay0(cy0 cy0Var, View view, boolean z10) {
        super(cy0Var.getContext());
        this.a = cy0Var;
        setWillNotDraw(false);
        if (!z10) {
            setPadding(org.telegram.messenger.g0.L(12.66f), org.telegram.messenger.g0.L(9.33f), org.telegram.messenger.g0.L(12.66f), org.telegram.messenger.g0.L(9.33f));
        }
        addView(view, c8.ma.c(-1.0f, -1));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        boolean z10 = this.c;
        cy0 cy0Var = this.a;
        if (z10 || this.d) {
            canvas2 = canvas;
            float L = org.telegram.messenger.g0.L(10.0f);
            float[] fArr = cy0Var.c;
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
            cy0Var.b.rewind();
            RectF rectF = org.telegram.messenger.g0.P;
            float f13 = cy0Var.h;
            rectF.set(f13, f13, getWidth() - cy0Var.h, (cy0Var.h * (this.d ? -1.0f : 1.0f)) + getHeight());
            cy0Var.b.addRoundRect(rectF, cy0Var.c, Path.Direction.CW);
            if (this.b) {
                canvas2.drawPath(cy0Var.b, cy0Var.d);
            }
            canvas2.drawPath(cy0Var.b, cy0Var.e);
        } else {
            if (this.b) {
                float f14 = cy0Var.h;
                canvas2 = canvas;
                canvas2.drawRect(f14, f14, getWidth() + cy0Var.h, getHeight() + cy0Var.h, cy0Var.d);
            } else {
                canvas2 = canvas;
            }
            float f15 = cy0Var.h;
            canvas2.drawRect(f15, f15, getWidth() - cy0Var.h, getHeight() + cy0Var.h, cy0Var.e);
        }
        super.onDraw(canvas2);
    }

    public void setFilled(boolean z10) {
        this.b = z10;
    }
}
