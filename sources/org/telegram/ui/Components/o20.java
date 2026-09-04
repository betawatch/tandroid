package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public class o20 {
    public boolean a;
    public boolean b;
    public int d;
    public int e;
    public int f;
    public int g;
    public Shader i;
    public boolean m;
    public final Paint c = new Paint(1);
    public final RectF h = new RectF();
    public final Matrix j = new Matrix();
    public Bitmap k = null;
    public final int[] l = new int[4];

    public final int a() {
        int i10 = this.d;
        int i11 = this.e;
        if (i11 != 0) {
            i10 = i0.a.d(0.5f, i10, i11);
        }
        int i12 = this.f;
        if (i12 != 0) {
            i10 = i0.a.d(0.5f, i10, i12);
        }
        int i13 = this.g;
        return i13 != 0 ? i0.a.d(0.5f, i10, i13) : i10;
    }

    public final void b(float f7, float f10, float f11, float f12) {
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(f7, f10, f11, f12);
        c(rectF);
    }

    public final void c(RectF rectF) {
        RectF rectF2 = this.h;
        if (rectF2.top == rectF.top && rectF2.bottom == rectF.bottom && rectF2.left == rectF.left && rectF2.right == rectF.right) {
            return;
        }
        rectF2.set(rectF);
        e();
    }

    public final void d(int i10, int i11, int i12, int i13) {
        if (this.i != null && this.d == i10 && this.e == i11 && this.f == i12 && this.g == i13) {
            return;
        }
        this.d = i10;
        int[] iArr = this.l;
        iArr[0] = i10;
        this.e = i11;
        iArr[1] = i11;
        this.f = i12;
        iArr[2] = i12;
        this.g = i13;
        iArr[3] = i13;
        Paint paint = this.c;
        if (i11 == 0) {
            this.i = null;
            paint.setShader(null);
            paint.setColor(i10);
        } else if (i12 == 0) {
            if (this.a && this.b) {
                LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 80.0f, 80.0f, new int[]{i10, i11}, (float[]) null, Shader.TileMode.CLAMP);
                this.i = linearGradient;
                paint.setShader(linearGradient);
            } else {
                LinearGradient linearGradient2 = new LinearGradient(this.a ? 80.0f : 0.0f, 0.0f, 0.0f, 80.0f, new int[]{i10, i11}, (float[]) null, Shader.TileMode.CLAMP);
                this.i = linearGradient2;
                paint.setShader(linearGradient2);
            }
        } else if (!this.m) {
            if (this.k == null) {
                this.k = Bitmap.createBitmap(60, 80, Bitmap.Config.ARGB_8888);
            }
            Utilities.generateGradient(this.k, 0, 0.0f, iArr);
            Bitmap bitmap = this.k;
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
            this.i = bitmapShader;
            paint.setShader(bitmapShader);
        } else if (this.a && this.b) {
            LinearGradient linearGradient3 = new LinearGradient(0.0f, 0.0f, 80.0f, 80.0f, new int[]{i10, i11, i12}, (float[]) null, Shader.TileMode.CLAMP);
            this.i = linearGradient3;
            paint.setShader(linearGradient3);
        } else {
            LinearGradient linearGradient4 = new LinearGradient(this.a ? 80.0f : 0.0f, 0.0f, 0.0f, 80.0f, new int[]{i10, i11, i12}, (float[]) null, Shader.TileMode.CLAMP);
            this.i = linearGradient4;
            paint.setShader(linearGradient4);
        }
        e();
    }

    public void e() {
        if (this.i == null) {
            return;
        }
        RectF rectF = this.h;
        float width = rectF.width() / 60.0f;
        float height = rectF.height() / 80.0f;
        Matrix matrix = this.j;
        matrix.reset();
        matrix.postTranslate(rectF.left, rectF.top);
        matrix.preScale(width, height);
        this.i.setLocalMatrix(matrix);
    }
}
