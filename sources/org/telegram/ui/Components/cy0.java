package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.style.ReplacementSpan;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class cy0 extends ReplacementSpan {
    public final /* synthetic */ int a;
    public int b;
    public final Object c;

    public cy0(int i3) {
        this.a = 0;
        Paint paint = new Paint(1);
        this.c = paint;
        this.b = i3;
        paint.setColor(org.telegram.ui.ActionBar.k6.r1(0.3f, org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.be, false)));
    }

    public void a(int i3) {
        org.telegram.ui.xl0 xl0Var = (org.telegram.ui.xl0) this.c;
        if (xl0Var != null) {
            xl0Var.a = i3 / 2.0f;
            xl0Var.d();
            this.b = i3;
        }
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i3, int i10, float f10, int i11, int i12, int i13, Paint paint) {
        switch (this.a) {
            case 0:
                float L = ((i11 + i13) / 2.0f) + org.telegram.messenger.g0.L(1.33f);
                float L2 = org.telegram.messenger.g0.L(6.66f);
                RectF rectF = org.telegram.messenger.g0.P;
                float f11 = L2 / 2.0f;
                rectF.set(f10, L - f11, this.b + f10, L + f11);
                Paint paint2 = (Paint) this.c;
                paint2.setColor(org.telegram.ui.ActionBar.k6.r1(0.3f, org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.be, false)));
                canvas.drawRoundRect(rectF, f11, f11, paint2);
                break;
            default:
                org.telegram.ui.xl0 xl0Var = (org.telegram.ui.xl0) this.c;
                if (xl0Var != null) {
                    int i14 = (i11 + i13) / 2;
                    int i15 = this.b;
                    xl0Var.setBounds((int) (org.telegram.messenger.g0.L(3.0f) + f10), i14 - this.b, (int) (f10 + org.telegram.messenger.g0.L(5.0f) + i15), i14 + i15);
                    xl0Var.draw(canvas);
                    break;
                }
                break;
        }
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i3, int i10, Paint.FontMetricsInt fontMetricsInt) {
        switch (this.a) {
            case 0:
                return this.b;
            default:
                return org.telegram.messenger.g0.L(3.0f) + org.telegram.messenger.g0.L(3.0f) + this.b;
        }
    }

    public cy0(boolean z10, int i3, int i10) {
        this.a = 1;
        this.b = org.telegram.messenger.g0.L(21.0f);
        this.c = z10 ? org.telegram.ui.xl0.c(i3, i10) : org.telegram.ui.xl0.a(i3, i10);
    }
}
