package b8;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public abstract class sf {
    public static int a(nb.a aVar) {
        aVar.getClass();
        return Math.max(1, (int) Math.ceil(0.5f * org.telegram.messenger.g0.p)) + (((int) Math.ceil(1.9f * org.telegram.messenger.g0.p)) * 2);
    }

    public static void b(Canvas canvas, Bitmap bitmap, int i3, float f10, float f11, int i10, int i11, Paint paint) {
        int min = Math.min(i3, bitmap.getWidth());
        int i12 = (int) f10;
        int i13 = (int) f11;
        canvas.drawBitmap(bitmap, new Rect(0, i10, min, i10 + i11), new Rect(i12, i13, min + i12, i11 + i13), paint);
    }
}
