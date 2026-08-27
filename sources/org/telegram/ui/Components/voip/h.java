package org.telegram.ui.Components.voip;

import ag.p3;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
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
    public p3 o;
    public af.e p;

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

    public final void b(int i10, int i11) {
        float f10 = this.e;
        int[] iArr = {0, i0.b.k(i10, i11), 0};
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.b = new LinearGradient(0.0f, 0.0f, f10, 0.0f, iArr, (float[]) null, tileMode);
        this.d = new LinearGradient(0.0f, 0.0f, f10, 0.0f, new int[]{0, i0.b.k(i10, 204), 0}, (float[]) null, tileMode);
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
                        af.e eVar = this.p;
                        if (eVar != null) {
                            eVar.run();
                        }
                    }
                    this.h = currentTimeMillis;
                }
            } else {
                this.h = currentTimeMillis;
            }
        }
        int i10 = this.f;
        float f11 = (((r0 * 2) + i10) * this.g) - this.e;
        Matrix matrix = this.i;
        matrix.reset();
        matrix.setTranslate(f11, 0.0f);
        this.b.setLocalMatrix(matrix);
        this.d.setLocalMatrix(matrix);
    }

    public h(int i10, int i11) {
        this(i10, i11, 160);
    }

    public h(int i10, int i11, int i12) {
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
        int dp = AndroidUtilities.dp(i12);
        this.e = dp;
        float f10 = dp;
        int[] iArr = {0, i0.b.k(-1, i10), 0};
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.b = new LinearGradient(0.0f, 0.0f, f10, 0.0f, iArr, (float[]) null, tileMode);
        this.d = new LinearGradient(0.0f, 0.0f, f10, 0.0f, new int[]{0, i0.b.k(-1, i11), 0}, (float[]) null, tileMode);
        paint.setShader(this.b);
        paint2.setShader(this.d);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(AndroidUtilities.dp(2.0f));
    }
}
