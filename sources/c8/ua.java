package c8;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public abstract class ua {
    public static int a(w7.s sVar) {
        sVar.getClass();
        return Math.max(1, (int) Math.ceil(0.5f * org.telegram.messenger.g0.p)) + (((int) Math.ceil(1.9f * org.telegram.messenger.g0.p)) * 2);
    }

    public static void b(Canvas canvas, Bitmap bitmap, int i7, float f10, float f11, int i10, int i11, Paint paint) {
        int min = Math.min(i7, bitmap.getWidth());
        int i12 = (int) f10;
        int i13 = (int) f11;
        canvas.drawBitmap(bitmap, new Rect(0, i10, min, i10 + i11), new Rect(i12, i13, min + i12, i11 + i13), paint);
    }
}
