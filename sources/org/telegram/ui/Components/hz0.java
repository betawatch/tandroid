package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.style.ReplacementSpan;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class hz0 extends ReplacementSpan {
    public final /* synthetic */ int a;
    public int b;
    public final Object c;

    public hz0(int i10) {
        this.a = 0;
        Paint paint = new Paint(1);
        this.c = paint;
        this.b = i10;
        paint.setColor(org.telegram.ui.ActionBar.t6.r1(0.3f, org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.be, false)));
    }

    public void a(int i10) {
        org.telegram.ui.on0 on0Var = (org.telegram.ui.on0) this.c;
        if (on0Var != null) {
            on0Var.a = i10 / 2.0f;
            on0Var.d();
            this.b = i10;
        }
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
        switch (this.a) {
            case 0:
                float L = ((i12 + i14) / 2.0f) + org.telegram.messenger.i0.L(1.33f);
                float L2 = org.telegram.messenger.i0.L(6.66f);
                RectF rectF = org.telegram.messenger.i0.P;
                float f10 = L2 / 2.0f;
                rectF.set(f7, L - f10, this.b + f7, L + f10);
                Paint paint2 = (Paint) this.c;
                paint2.setColor(org.telegram.ui.ActionBar.t6.r1(0.3f, org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.be, false)));
                canvas.drawRoundRect(rectF, f10, f10, paint2);
                break;
            default:
                org.telegram.ui.on0 on0Var = (org.telegram.ui.on0) this.c;
                if (on0Var != null) {
                    int i15 = (i12 + i14) / 2;
                    int i16 = this.b;
                    on0Var.setBounds((int) (org.telegram.messenger.i0.L(3.0f) + f7), i15 - this.b, (int) (f7 + org.telegram.messenger.i0.L(5.0f) + i16), i15 + i16);
                    on0Var.draw(canvas);
                    break;
                }
                break;
        }
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        switch (this.a) {
            case 0:
                return this.b;
            default:
                return org.telegram.messenger.i0.L(3.0f) + org.telegram.messenger.i0.L(3.0f) + this.b;
        }
    }

    public hz0(boolean z10, int i10, int i11) {
        this.a = 1;
        this.b = org.telegram.messenger.i0.L(21.0f);
        this.c = z10 ? org.telegram.ui.on0.c(i10, i11) : org.telegram.ui.on0.a(i10, i11);
    }
}
