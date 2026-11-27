// default package

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public abstract class n0f {
    public static int a(sjf sjfVar) {
        sjfVar.getClass();
        return Math.max(1, (int) Math.ceil(0.5f * hl.p)) + (((int) Math.ceil(1.9f * hl.p)) << 1);
    }

    public static void b(Canvas canvas, Bitmap bitmap, int i, float f, float f2, int i2, int i3, Paint paint) {
        int min = Math.min(i, bitmap.getWidth());
        int i4 = (int) f;
        int i5 = (int) f2;
        canvas.drawBitmap(bitmap, new Rect(0, i2, min, i2 + i3), new Rect(i4, i5, min + i4, i3 + i5), paint);
    }
}
