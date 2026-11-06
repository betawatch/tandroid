package org.telegram.ui.Components.voip;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.view.View;
import org.telegram.messenger.qs;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class n {
    public final Paint a;
    public LinearGradient b;
    public final Paint c;
    public LinearGradient d;
    public final int e;
    public int f;
    public float g;
    public long h;
    public final Matrix i;
    public boolean j;
    public boolean k;
    public boolean l;
    public float m;
    public float n;
    public ug.t1 o;
    public sg.t0 p;

    public n() {
        this(64, qs.i3, qs.q2);
    }

    public final void a(float f10, Canvas canvas, RectF rectF, View view) {
        c(view);
        canvas.drawRoundRect(rectF, f10, f10, this.a);
        if (this.k) {
            boolean z9 = this.l;
            Paint paint = this.c;
            if (z9) {
                rectF.inset(paint.getStrokeWidth() / 2.0f, paint.getStrokeWidth() / 2.0f);
            }
            canvas.drawRoundRect(rectF, f10, f10, paint);
        }
    }

    public final void b(int i7, int i10) {
        float f10 = this.e;
        int[] iArr = {0, i0.a.o(i7, i10), 0};
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.b = new LinearGradient(0.0f, 0.0f, f10, 0.0f, iArr, (float[]) null, tileMode);
        this.d = new LinearGradient(0.0f, 0.0f, f10, 0.0f, new int[]{0, i0.a.o(i7, qs.i3), 0}, (float[]) null, tileMode);
        this.a.setShader(this.b);
        this.c.setShader(this.d);
    }

    public final void c(View view) {
        if (this.j || this.g < 1.0f) {
            if (view != null) {
                view.invalidate();
            }
            long currentTimeMillis = System.currentTimeMillis();
            long j3 = this.h;
            if (j3 != 0) {
                long j10 = currentTimeMillis - j3;
                if (j10 > 10) {
                    float f10 = ((j10 / 1200.0f) * this.n) + this.g;
                    this.g = f10;
                    if (f10 > this.m) {
                        this.g = 0.0f;
                        sg.t0 t0Var = this.p;
                        if (t0Var != null) {
                            t0Var.run();
                        }
                    }
                    this.h = currentTimeMillis;
                }
            } else {
                this.h = currentTimeMillis;
            }
        }
        int i7 = this.f;
        float f11 = (((r0 * 2) + i7) * this.g) - this.e;
        Matrix matrix = this.i;
        matrix.reset();
        matrix.setTranslate(f11, 0.0f);
        this.b.setLocalMatrix(matrix);
        this.d.setLocalMatrix(matrix);
    }

    public n(int i7, int i10) {
        this(i7, i10, qs.q2);
    }

    public n(int i7, int i10, int i11) {
        Paint paint = new Paint(1);
        this.a = paint;
        Paint paint2 = new Paint(1);
        this.c = paint2;
        this.i = new Matrix();
        this.j = true;
        this.k = true;
        this.l = false;
        this.m = 1.2f;
        this.n = 1.0f;
        int L = org.telegram.messenger.g0.L(i11);
        this.e = L;
        float f10 = L;
        int[] iArr = {0, i0.a.o(-1, i7), 0};
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.b = new LinearGradient(0.0f, 0.0f, f10, 0.0f, iArr, (float[]) null, tileMode);
        this.d = new LinearGradient(0.0f, 0.0f, f10, 0.0f, new int[]{0, i0.a.o(-1, i10), 0}, (float[]) null, tileMode);
        paint.setShader(this.b);
        paint2.setShader(this.d);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
    }
}
