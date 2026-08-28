package ng;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import kg.f;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class b implements a {
    public final Paint a;
    public final Matrix b;
    public BitmapShader c;
    public Bitmap d;
    public final Matrix e;
    public Bitmap f;
    public int h;
    public int n;

    public b() {
        Paint paint = new Paint(3);
        this.a = paint;
        this.b = new Matrix();
        this.e = new Matrix();
        paint.setFilterBitmap(true);
    }

    @Override // ng.a
    public final void T0(Canvas canvas, float f10, float f11, float f12, float f13) {
        Bitmap bitmap = this.d;
        if (bitmap == null || bitmap.isRecycled() || this.c == null) {
            return;
        }
        Matrix matrix = this.e;
        Matrix matrix2 = this.b;
        matrix.set(matrix2);
        matrix.postTranslate(f10, f11);
        this.c.setLocalMatrix(matrix2);
        canvas.drawRect(f10, f11, f12, f13, this.a);
    }

    public final void a(Bitmap bitmap) {
        if (this.d == bitmap) {
            return;
        }
        this.d = bitmap;
        Paint paint = this.a;
        paint.setShader(null);
        this.c = null;
        if (bitmap != null) {
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
            this.c = bitmapShader;
            paint.setShader(bitmapShader);
            c();
        }
    }

    public final void b(int i9, int i10) {
        if (this.h == i9 && this.n == i10) {
            return;
        }
        this.h = i9;
        this.n = i10;
        c();
    }

    public final void c() {
        Bitmap bitmap = this.d;
        Matrix matrix = this.b;
        if (bitmap == null) {
            matrix.reset();
            return;
        }
        int width = bitmap.getWidth();
        int height = this.d.getHeight();
        int i9 = this.h;
        int i10 = this.n;
        matrix.reset();
        if (width <= 0 || height <= 0 || i9 <= 0 || i10 <= 0) {
            return;
        }
        float f10 = i9;
        float f11 = width;
        float f12 = i10;
        float f13 = height;
        float max = Math.max(f10 / f11, f12 / f13);
        matrix.setScale(max, max);
        matrix.postTranslate((f10 - (f11 * max)) * 0.5f, ((f12 - (f13 * max)) * 0.5f) + 0);
    }

    @Override // ng.a
    public final kg.d y() {
        return new f(this);
    }

    @Override // ng.a
    public final /* synthetic */ void t() {
    }
}
