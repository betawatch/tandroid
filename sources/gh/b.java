package gh;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import dh.f;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes4.dex */
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
            e();
        }
    }

    public final void c(int i10, int i11) {
        if (this.h == i10 && this.n == i11) {
            return;
        }
        this.h = i10;
        this.n = i11;
        e();
    }

    @Override // gh.a
    public final dh.d d() {
        return new f(this);
    }

    public final void e() {
        Bitmap bitmap = this.d;
        Matrix matrix = this.b;
        if (bitmap == null) {
            matrix.reset();
            return;
        }
        int width = bitmap.getWidth();
        int height = this.d.getHeight();
        int i10 = this.h;
        int i11 = this.n;
        matrix.reset();
        if (width <= 0 || height <= 0 || i10 <= 0 || i11 <= 0) {
            return;
        }
        float f7 = i10;
        float f10 = width;
        float f11 = i11;
        float f12 = height;
        float max = Math.max(f7 / f10, f11 / f12);
        matrix.setScale(max, max);
        matrix.postTranslate((f7 - (f10 * max)) * 0.5f, ((f11 - (f12 * max)) * 0.5f) + 0);
    }

    @Override // gh.a
    public final void y(Canvas canvas, float f7, float f10, float f11, float f12) {
        Bitmap bitmap = this.d;
        if (bitmap == null || bitmap.isRecycled() || this.c == null) {
            return;
        }
        Matrix matrix = this.e;
        Matrix matrix2 = this.b;
        matrix.set(matrix2);
        matrix.postTranslate(f7, f10);
        this.c.setLocalMatrix(matrix2);
        canvas.drawRect(f7, f10, f11, f12, this.a);
    }

    @Override // gh.a
    public final /* synthetic */ void b() {
    }
}
