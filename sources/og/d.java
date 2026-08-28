package og;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import pg.i;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public abstract class d {
    public static final Matrix a = new Matrix();
    public static final RectF b = new RectF();
    public static final RectF c = new RectF();

    public static void a(jg.a aVar, Canvas canvas, RectF rectF, View view, ViewGroup viewGroup, int i9) {
        if (i9 <= 0) {
            return;
        }
        RectF rectF2 = c;
        if (i.c(view, viewGroup, rectF2)) {
            float f10 = rectF2.left;
            float f11 = rectF2.top;
            RectF rectF3 = b;
            rectF3.set(rectF);
            rectF3.offset(-f10, -f11);
            boolean z10 = (f10 == 0.0f && f11 == 0.0f) ? false : true;
            boolean z11 = i9 != 255;
            if (z10) {
                canvas.save();
                canvas.translate(f10, f11);
            }
            if (z11) {
                canvas.saveLayerAlpha(rectF3, i9);
            }
            aVar.e(canvas, rectF3);
            if (z11) {
                canvas.restore();
            }
            if (z10) {
                canvas.restore();
            }
        }
    }

    public static void b(jg.a aVar, Canvas canvas, RectF rectF, View view, FrameLayout frameLayout) {
        a(aVar, canvas, rectF, view, frameLayout, 255);
    }

    public static void c(ng.b bVar, View view) {
        Bitmap bitmap;
        if (bVar == null || view == null || view.getWidth() == 0 || view.getHeight() == 0 || (bitmap = bVar.d) == null || bitmap.isRecycled() || bitmap.getWidth() == 0 || bitmap.getHeight() == 0) {
            return;
        }
        Matrix matrix = a;
        matrix.reset();
        matrix.setScale(view.getWidth() / bitmap.getWidth(), view.getHeight() / bitmap.getHeight());
        bVar.b.set(matrix);
    }

    public static c d(kg.d dVar, int i9, int i10) {
        return new c(i9, i10, dVar);
    }
}
