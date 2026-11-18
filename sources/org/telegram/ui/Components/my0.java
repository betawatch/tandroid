package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.style.ReplacementSpan;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class my0 extends ReplacementSpan {
    public final /* synthetic */ int a;
    public int b;
    public final Object c;

    public my0(int i7) {
        this.a = 0;
        Paint paint = new Paint(1);
        this.c = paint;
        this.b = i7;
        paint.setColor(org.telegram.ui.ActionBar.n6.r1(0.3f, org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.ee, false)));
    }

    public void a(int i7) {
        org.telegram.ui.gm0 gm0Var = (org.telegram.ui.gm0) this.c;
        if (gm0Var != null) {
            gm0Var.a = i7 / 2.0f;
            gm0Var.d();
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
                paint2.setColor(org.telegram.ui.ActionBar.n6.r1(0.3f, org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.ee, false)));
                canvas.drawRoundRect(rectF, f11, f11, paint2);
                break;
            default:
                org.telegram.ui.gm0 gm0Var = (org.telegram.ui.gm0) this.c;
                if (gm0Var != null) {
                    int i14 = (i11 + i13) / 2;
                    int i15 = this.b;
                    gm0Var.setBounds((int) (org.telegram.messenger.g0.L(3.0f) + f10), i14 - this.b, (int) (f10 + org.telegram.messenger.g0.L(5.0f) + i15), i14 + i15);
                    gm0Var.draw(canvas);
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

    public my0(boolean z10, int i7, int i10) {
        this.a = 1;
        this.b = org.telegram.messenger.g0.L(21.0f);
        this.c = z10 ? org.telegram.ui.gm0.c(i7, i10) : org.telegram.ui.gm0.a(i7, i10);
    }
}
