// default package

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public class o15 {
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
        int i = this.d;
        int i2 = this.e;
        if (i2 != 0) {
            i = vm2.f(0.5f, i, i2);
        }
        int i3 = this.f;
        if (i3 != 0) {
            i = vm2.f(0.5f, i, i3);
        }
        int i4 = this.g;
        return i4 != 0 ? vm2.f(0.5f, i, i4) : i;
    }

    public final void b(float f, float f2, float f3, float f4) {
        RectF rectF = hl.P;
        rectF.set(f, f2, f3, f4);
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

    public final void d(int i, int i2, int i3, int i4) {
        if (this.i != null && this.d == i && this.e == i2 && this.f == i3 && this.g == i4) {
            return;
        }
        this.d = i;
        int[] iArr = this.l;
        iArr[0] = i;
        this.e = i2;
        iArr[1] = i2;
        this.f = i3;
        iArr[2] = i3;
        this.g = i4;
        iArr[3] = i4;
        Paint paint = this.c;
        if (i2 == 0) {
            this.i = null;
            paint.setShader(null);
            paint.setColor(i);
        } else if (i3 == 0) {
            if (this.a && this.b) {
                LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 80.0f, 80.0f, new int[]{i, i2}, (float[]) null, Shader.TileMode.CLAMP);
                this.i = linearGradient;
                paint.setShader(linearGradient);
            } else {
                LinearGradient linearGradient2 = new LinearGradient(this.a ? 80.0f : 0.0f, 0.0f, 0.0f, 80.0f, new int[]{i, i2}, (float[]) null, Shader.TileMode.CLAMP);
                this.i = linearGradient2;
                paint.setShader(linearGradient2);
            }
        } else if (!this.m) {
            Bitmap bitmap = this.k;
            if (bitmap == null) {
                bitmap = Bitmap.createBitmap(60, 80, Bitmap.Config.ARGB_8888);
                this.k = bitmap;
            }
            Utilities.generateGradient(bitmap, 0, 0.0f, iArr);
            Bitmap bitmap2 = this.k;
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            BitmapShader bitmapShader = new BitmapShader(bitmap2, tileMode, tileMode);
            this.i = bitmapShader;
            paint.setShader(bitmapShader);
        } else if (this.a && this.b) {
            LinearGradient linearGradient3 = new LinearGradient(0.0f, 0.0f, 80.0f, 80.0f, new int[]{i, i2, i3}, (float[]) null, Shader.TileMode.CLAMP);
            this.i = linearGradient3;
            paint.setShader(linearGradient3);
        } else {
            LinearGradient linearGradient4 = new LinearGradient(this.a ? 80.0f : 0.0f, 0.0f, 0.0f, 80.0f, new int[]{i, i2, i3}, (float[]) null, Shader.TileMode.CLAMP);
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
