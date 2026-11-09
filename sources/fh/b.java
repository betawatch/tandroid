package fh;

import a8.aa;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import java.lang.ref.WeakReference;
import org.telegram.ui.ActionBar.l6;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class b extends aa {
    public final Paint a;
    public final Paint b;
    public final Matrix c;
    public WeakReference d;
    public BitmapShader e;
    public final /* synthetic */ g f;

    public b(g gVar) {
        this.f = gVar;
        Paint paint = new Paint(1);
        this.a = paint;
        this.b = new Paint(1);
        this.c = new Matrix();
        this.d = new WeakReference(null);
        paint.setFilterBitmap(true);
    }

    @Override // a8.aa
    public final void b(Canvas canvas, ri.a aVar) {
        ri.b bVar = (ri.b) g.v(aVar);
        g gVar = this.f;
        int i7 = gVar.c;
        Bitmap bitmap = bVar.d;
        Object obj = this.d.get();
        Paint paint = this.a;
        if (bitmap != obj) {
            this.d = new WeakReference(bitmap);
            if (bitmap == null || bitmap.isRecycled()) {
                this.e = null;
                paint.setShader(null);
            } else {
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
                this.e = bitmapShader;
                paint.setShader(bitmapShader);
            }
        }
        if (Color.alpha(gVar.x) > 0) {
            gVar.c0.c(canvas, 0);
        }
        if (this.e != null && bitmap != null && !bitmap.isRecycled() && i7 > 0) {
            Matrix matrix = bVar.b;
            Matrix matrix2 = this.c;
            matrix2.set(matrix);
            matrix2.postTranslate(-gVar.d, -gVar.e);
            this.e.setLocalMatrix(matrix2);
            paint.setAlpha(i7);
            gVar.Q.c(canvas, paint);
        }
        int r12 = l6.r1(i7 / 255.0f, gVar.y);
        if (Color.alpha(r12) > 0) {
            Paint paint2 = this.b;
            paint2.setColor(r12);
            gVar.Q.c(canvas, paint2);
        }
    }
}
