package gh;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import b8.mc;
import java.lang.ref.WeakReference;
import org.telegram.ui.ActionBar.k6;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class b extends mc {
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

    @Override // b8.mc
    public final void b(Canvas canvas, si.a aVar) {
        si.b bVar = (si.b) g.v(aVar);
        g gVar = this.f;
        int i3 = gVar.c;
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
            gVar.d0.c(canvas, 0);
        }
        if (this.e != null && bitmap != null && !bitmap.isRecycled() && i3 > 0) {
            Matrix matrix = bVar.b;
            Matrix matrix2 = this.c;
            matrix2.set(matrix);
            matrix2.postTranslate(-gVar.d, -gVar.e);
            this.e.setLocalMatrix(matrix2);
            paint.setAlpha(i3);
            gVar.R.c(canvas, paint);
        }
        int r12 = k6.r1(i3 / 255.0f, gVar.y);
        if (Color.alpha(r12) > 0) {
            Paint paint2 = this.b;
            paint2.setColor(r12);
            gVar.R.c(canvas, paint2);
        }
    }
}
