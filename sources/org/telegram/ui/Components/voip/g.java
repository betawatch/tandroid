package org.telegram.ui.Components.voip;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.view.View;
import org.telegram.messenger.hs;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class g {
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
    public vg.w1 o;
    public r4.u p;

    public g() {
        this(64, hs.i3, hs.q2);
    }

    public final void a(float f10, Canvas canvas, RectF rectF, View view) {
        c(view);
        canvas.drawRoundRect(rectF, f10, f10, this.a);
        if (this.k) {
            boolean z10 = this.l;
            Paint paint = this.c;
            if (z10) {
                rectF.inset(paint.getStrokeWidth() / 2.0f, paint.getStrokeWidth() / 2.0f);
            }
            canvas.drawRoundRect(rectF, f10, f10, paint);
        }
    }

    public final void b(int i3, int i10) {
        float f10 = this.e;
        int[] iArr = {0, i0.a.o(i3, i10), 0};
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.b = new LinearGradient(0.0f, 0.0f, f10, 0.0f, iArr, (float[]) null, tileMode);
        this.d = new LinearGradient(0.0f, 0.0f, f10, 0.0f, new int[]{0, i0.a.o(i3, hs.i3), 0}, (float[]) null, tileMode);
        this.a.setShader(this.b);
        this.c.setShader(this.d);
    }

    public final void c(View view) {
        if (this.j || this.g < 1.0f) {
            if (view != null) {
                view.invalidate();
            }
            long currentTimeMillis = System.currentTimeMillis();
            long j10 = this.h;
            if (j10 != 0) {
                long j11 = currentTimeMillis - j10;
                if (j11 > 10) {
                    float f10 = ((j11 / 1200.0f) * this.n) + this.g;
                    this.g = f10;
                    if (f10 > this.m) {
                        this.g = 0.0f;
                        r4.u uVar = this.p;
                        if (uVar != null) {
                            uVar.run();
                        }
                    }
                    this.h = currentTimeMillis;
                }
            } else {
                this.h = currentTimeMillis;
            }
        }
        int i3 = this.f;
        float f11 = (((r0 * 2) + i3) * this.g) - this.e;
        Matrix matrix = this.i;
        matrix.reset();
        matrix.setTranslate(f11, 0.0f);
        this.b.setLocalMatrix(matrix);
        this.d.setLocalMatrix(matrix);
    }

    public g(int i3, int i10) {
        this(i3, i10, hs.q2);
    }

    public g(int i3, int i10, int i11) {
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
        int[] iArr = {0, i0.a.o(-1, i3), 0};
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.b = new LinearGradient(0.0f, 0.0f, f10, 0.0f, iArr, (float[]) null, tileMode);
        this.d = new LinearGradient(0.0f, 0.0f, f10, 0.0f, new int[]{0, i0.a.o(-1, i10), 0}, (float[]) null, tileMode);
        paint.setShader(this.b);
        paint2.setShader(this.d);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
    }
}
