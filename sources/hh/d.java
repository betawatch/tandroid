package hh;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import ih.k;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes4.dex */
public abstract class d {
    public static final Matrix a = new Matrix();
    public static final RectF b = new RectF();
    public static final RectF c = new RectF();

    public static void a(ch.a aVar, Canvas canvas, RectF rectF, View view, ViewGroup viewGroup) {
        b(aVar, canvas, rectF, view, viewGroup, 255);
    }

    public static void b(ch.a aVar, Canvas canvas, RectF rectF, View view, ViewGroup viewGroup, int i10) {
        if (i10 <= 0 || aVar == null) {
            return;
        }
        RectF rectF2 = c;
        if (k.c(view, viewGroup, rectF2)) {
            float f7 = rectF2.left;
            float f10 = rectF2.top;
            RectF rectF3 = b;
            rectF3.set(rectF);
            rectF3.offset(-f7, -f10);
            boolean z10 = (f7 == 0.0f && f10 == 0.0f) ? false : true;
            boolean z11 = i10 != 255;
            if (z10) {
                canvas.save();
                canvas.translate(f7, f10);
            }
            if (z11) {
                canvas.saveLayerAlpha(rectF3, i10);
            }
            aVar.f(canvas, rectF3);
            if (z11) {
                canvas.restore();
            }
            if (z10) {
                canvas.restore();
            }
        }
    }

    public static void c(gh.b bVar, View view) {
        Bitmap bitmap;
        if (bVar == null || view == null || view.getWidth() == 0 || view.getHeight() == 0 || (bitmap = bVar.d) == null || bitmap.isRecycled() || bitmap.getWidth() == 0 || bitmap.getHeight() == 0) {
            return;
        }
        Matrix matrix = a;
        matrix.reset();
        matrix.setScale(view.getWidth() / bitmap.getWidth(), view.getHeight() / bitmap.getHeight());
        bVar.b.set(matrix);
    }

    public static c d(dh.d dVar, int i10, int i11) {
        return new c(i10, i11, dVar);
    }
}
