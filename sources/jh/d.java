package jh;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import gh.g;
import kh.k;
import org.telegram.messenger.hs;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public abstract class d {
    public static final Matrix a = new Matrix();
    public static final RectF b = new RectF();
    public static final RectF c = new RectF();

    public static void a(fh.a aVar, Canvas canvas, RectF rectF, View view, ViewGroup viewGroup) {
        b(aVar, canvas, rectF, view, viewGroup, hs.e4);
    }

    public static void b(fh.a aVar, Canvas canvas, RectF rectF, View view, ViewGroup viewGroup, int i3) {
        if (i3 <= 0 || aVar == null) {
            return;
        }
        RectF rectF2 = c;
        if (k.c(view, viewGroup, rectF2)) {
            float f10 = rectF2.left;
            float f11 = rectF2.top;
            RectF rectF3 = b;
            rectF3.set(rectF);
            rectF3.offset(-f10, -f11);
            boolean z10 = (f10 == 0.0f && f11 == 0.0f) ? false : true;
            boolean z11 = i3 != 255;
            if (z10) {
                canvas.save();
                canvas.translate(f10, f11);
            }
            if (z11) {
                canvas.saveLayerAlpha(rectF3, i3);
            }
            aVar.d(canvas, rectF3);
            if (z11) {
                canvas.restore();
            }
            if (z10) {
                canvas.restore();
            }
        }
    }

    public static void c(si.b bVar, View view) {
        Bitmap bitmap;
        if (bVar == null || view == null || view.getWidth() == 0 || view.getHeight() == 0 || (bitmap = bVar.d) == null || bitmap.isRecycled() || bitmap.getWidth() == 0 || bitmap.getHeight() == 0) {
            return;
        }
        Matrix matrix = a;
        matrix.reset();
        matrix.setScale(view.getWidth() / bitmap.getWidth(), view.getHeight() / bitmap.getHeight());
        bVar.b.set(matrix);
    }

    public static c d(g gVar, int i3, int i10) {
        return new c(i3, i10, gVar);
    }
}
