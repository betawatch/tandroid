package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.style.ReplacementSpan;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class dy0 extends ReplacementSpan {
    public final /* synthetic */ int a;
    public int b;
    public final Object c;

    public dy0(int i7) {
        this.a = 0;
        Paint paint = new Paint(1);
        this.c = paint;
        this.b = i7;
        paint.setColor(org.telegram.ui.ActionBar.k6.r1(0.3f, org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.be, false)));
    }

    public void a(int i7) {
        org.telegram.ui.cm0 cm0Var = (org.telegram.ui.cm0) this.c;
        if (cm0Var != null) {
            cm0Var.a = i7 / 2.0f;
            cm0Var.d();
            this.b = i7;
        }
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i7, int i10, float f10, int i11, int i12, int i13, Paint paint) {
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
                org.telegram.ui.cm0 cm0Var = (org.telegram.ui.cm0) this.c;
                if (cm0Var != null) {
                    int i14 = (i11 + i13) / 2;
                    int i15 = this.b;
                    cm0Var.setBounds((int) (org.telegram.messenger.g0.L(3.0f) + f10), i14 - this.b, (int) (f10 + org.telegram.messenger.g0.L(5.0f) + i15), i14 + i15);
                    cm0Var.draw(canvas);
                    break;
                }
                break;
        }
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i7, int i10, Paint.FontMetricsInt fontMetricsInt) {
        switch (this.a) {
            case 0:
                return this.b;
            default:
                return org.telegram.messenger.g0.L(3.0f) + org.telegram.messenger.g0.L(3.0f) + this.b;
        }
    }

    public dy0(boolean z9, int i7, int i10) {
        this.a = 1;
        this.b = org.telegram.messenger.g0.L(21.0f);
        this.c = z9 ? org.telegram.ui.cm0.c(i7, i10) : org.telegram.ui.cm0.a(i7, i10);
    }
}
