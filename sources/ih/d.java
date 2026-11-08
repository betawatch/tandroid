package ih;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import fh.g;
import jh.k;
import org.telegram.messenger.qs;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public abstract class d {
    public static final Matrix a = new Matrix();
    public static final RectF b = new RectF();
    public static final RectF c = new RectF();

    public static void a(eh.a aVar, Canvas canvas, RectF rectF, View view, ViewGroup viewGroup) {
        b(aVar, canvas, rectF, view, viewGroup, qs.e4);
    }

    public static void b(eh.a aVar, Canvas canvas, RectF rectF, View view, ViewGroup viewGroup, int i7) {
        if (i7 <= 0 || aVar == null) {
            return;
        }
        RectF rectF2 = c;
        if (k.c(view, viewGroup, rectF2)) {
            float f10 = rectF2.left;
            float f11 = rectF2.top;
            RectF rectF3 = b;
            rectF3.set(rectF);
            rectF3.offset(-f10, -f11);
            boolean z9 = (f10 == 0.0f && f11 == 0.0f) ? false : true;
            boolean z10 = i7 != 255;
            if (z9) {
                canvas.save();
                canvas.translate(f10, f11);
            }
            if (z10) {
                canvas.saveLayerAlpha(rectF3, i7);
            }
            aVar.d(canvas, rectF3);
            if (z10) {
                canvas.restore();
            }
            if (z9) {
                canvas.restore();
            }
        }
    }

    public static void c(ri.b bVar, View view) {
        Bitmap bitmap;
        if (bVar == null || view == null || view.getWidth() == 0 || view.getHeight() == 0 || (bitmap = bVar.d) == null || bitmap.isRecycled() || bitmap.getWidth() == 0 || bitmap.getHeight() == 0) {
            return;
        }
        Matrix matrix = a;
        matrix.reset();
        matrix.setScale(view.getWidth() / bitmap.getWidth(), view.getHeight() / bitmap.getHeight());
        bVar.b.set(matrix);
    }

    public static c d(g gVar, int i7, int i10) {
        return new c(i7, i10, gVar);
    }
}
