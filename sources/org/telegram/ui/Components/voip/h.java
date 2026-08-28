package org.telegram.ui.Components.voip;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class h {
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
    public zf.z1 o;
    public pf.o1 p;

    public h() {
        this(64, 204, 160);
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

    public final void b(int i9, int i10) {
        float f10 = this.e;
        int[] iArr = {0, i0.a.k(i9, i10), 0};
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.b = new LinearGradient(0.0f, 0.0f, f10, 0.0f, iArr, (float[]) null, tileMode);
        this.d = new LinearGradient(0.0f, 0.0f, f10, 0.0f, new int[]{0, i0.a.k(i9, 204), 0}, (float[]) null, tileMode);
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
                        pf.o1 o1Var = this.p;
                        if (o1Var != null) {
                            o1Var.run();
                        }
                    }
                    this.h = currentTimeMillis;
                }
            } else {
                this.h = currentTimeMillis;
            }
        }
        int i9 = this.f;
        float f11 = (((r0 * 2) + i9) * this.g) - this.e;
        Matrix matrix = this.i;
        matrix.reset();
        matrix.setTranslate(f11, 0.0f);
        this.b.setLocalMatrix(matrix);
        this.d.setLocalMatrix(matrix);
    }

    public h(int i9, int i10) {
        this(i9, i10, 160);
    }

    public h(int i9, int i10, int i11) {
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
        int dp = AndroidUtilities.dp(i11);
        this.e = dp;
        float f10 = dp;
        int[] iArr = {0, i0.a.k(-1, i9), 0};
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.b = new LinearGradient(0.0f, 0.0f, f10, 0.0f, iArr, (float[]) null, tileMode);
        this.d = new LinearGradient(0.0f, 0.0f, f10, 0.0f, new int[]{0, i0.a.k(-1, i10), 0}, (float[]) null, tileMode);
        paint.setShader(this.b);
        paint2.setShader(this.d);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(AndroidUtilities.dp(2.0f));
    }
}
