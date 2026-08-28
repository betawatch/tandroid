package g7;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.NinePatchDrawable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import org.telegram.messenger.ApplicationLoader;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public abstract class z5 {
    public static NinePatchDrawable a(Bitmap bitmap, Rect rect, int i9, int i10) {
        if (bitmap == null) {
            throw new IllegalArgumentException("bitmap == null");
        }
        if (bitmap.isRecycled()) {
            throw new IllegalArgumentException("bitmap is recycled");
        }
        if (i9 >= 0 && i9 < bitmap.getWidth() && i10 >= 0 && i10 < bitmap.getHeight()) {
            return new NinePatchDrawable(ApplicationLoader.applicationContext.getResources(), bitmap, c(i9, i9 + 1, i10, i10 + 1, rect.left, rect.top, rect.right, rect.bottom, bitmap.getPixel(i9, i10)).array(), rect, null);
        }
        StringBuilder o6 = e2.c.o("center pixel is outside bitmap: (", i9, ", ", i10, ") for ");
        o6.append(bitmap.getWidth());
        o6.append("x");
        o6.append(bitmap.getHeight());
        throw new IllegalArgumentException(o6.toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0108  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static NinePatchDrawable b(Bitmap[] bitmapArr, float[] fArr, float f10, float f11, int i9, og.f fVar) {
        float f12;
        int i10;
        char c10;
        Bitmap bitmap;
        if (fArr == null || fArr.length != 8) {
            throw new IllegalArgumentException("radii must have 8 values: TLx,TLy, TRx,TRy, BRx,BRy, BLx,BLy");
        }
        float max = Math.max(0.0f, fArr[0]);
        float max2 = Math.max(0.0f, fArr[1]);
        float max3 = Math.max(0.0f, fArr[2]);
        float max4 = Math.max(0.0f, fArr[3]);
        float max5 = Math.max(0.0f, fArr[4]);
        float max6 = Math.max(0.0f, fArr[5]);
        float max7 = Math.max(0.0f, fArr[6]);
        float max8 = Math.max(0.0f, fArr[7]);
        int ceil = (int) Math.ceil(f10 * 2.0f);
        int ceil2 = ceil + ((int) Math.ceil(Math.max(0.0f, -0.0f)));
        int ceil3 = ceil + ((int) Math.ceil(Math.max(0.0f, 0.0f)));
        int ceil4 = ceil + ((int) Math.ceil(Math.max(0.0f, -f11)));
        int ceil5 = ceil + ((int) Math.ceil(Math.max(0.0f, f11)));
        float max9 = Math.max(max + max3, max7 + max5);
        float max10 = Math.max(max2 + max8, max4 + max6);
        int ceil6 = ((int) Math.ceil(max9 + 2.0f)) + ceil2;
        int i11 = ceil6 + ceil3;
        int ceil7 = ((int) Math.ceil(max10 + 2.0f)) + ceil4;
        int i12 = ceil7 + ceil5;
        boolean z10 = bitmapArr != null && bitmapArr.length == 1;
        if (z10) {
            c10 = 1;
            bitmap = bitmapArr[0];
            if (bitmap != null && !bitmap.isRecycled() && bitmap.isMutable() && bitmap.getWidth() == i11 && bitmap.getHeight() == i12) {
                f12 = max5;
                if (bitmap.getConfig() == Bitmap.Config.ARGB_8888) {
                    bitmap.eraseColor(0);
                    i10 = i12;
                    if (bitmap == null) {
                        bitmap = Bitmap.createBitmap(i11, i10, Bitmap.Config.ARGB_8888);
                    }
                    if (z10) {
                        bitmapArr[0] = bitmap;
                    }
                    Canvas canvas = new Canvas(bitmap);
                    int i13 = i10;
                    RectF rectF = new RectF(ceil2, ceil4, ceil6, ceil7);
                    float[] fArr2 = new float[8];
                    fArr2[0] = max;
                    fArr2[c10] = max2;
                    fArr2[2] = max3;
                    fArr2[3] = max4;
                    fArr2[4] = f12;
                    fArr2[5] = max6;
                    fArr2[6] = max7;
                    fArr2[7] = max8;
                    fVar.a(canvas, rectF, fArr2);
                    float max11 = Math.max(max, max7);
                    float max12 = Math.max(max3, f12);
                    float max13 = Math.max(max2, max4);
                    float max14 = Math.max(max8, max6);
                    int b10 = n.b(((int) Math.ceil(max11)) + ceil2, 1, i11 - 2);
                    int b11 = n.b((i11 - ceil3) - ((int) Math.ceil(max12)), b10 + 1, i11 - 1);
                    int b12 = n.b(((int) Math.ceil(max13)) + ceil4, 1, i13 - 2);
                    return new NinePatchDrawable(ApplicationLoader.applicationContext.getResources(), bitmap, c(b10, b11, b12, n.b((i13 - ceil5) - ((int) Math.ceil(max14)), b12 + 1, i13 - 1), ceil2, ceil4, ceil3, ceil5, i9).array(), new Rect(ceil2, ceil4, ceil3, ceil5), null);
                }
            } else {
                f12 = max5;
            }
            i10 = i12;
        } else {
            f12 = max5;
            i10 = i12;
            c10 = 1;
        }
        bitmap = null;
        if (bitmap == null) {
        }
        if (z10) {
        }
        Canvas canvas2 = new Canvas(bitmap);
        int i132 = i10;
        RectF rectF2 = new RectF(ceil2, ceil4, ceil6, ceil7);
        float[] fArr22 = new float[8];
        fArr22[0] = max;
        fArr22[c10] = max2;
        fArr22[2] = max3;
        fArr22[3] = max4;
        fArr22[4] = f12;
        fArr22[5] = max6;
        fArr22[6] = max7;
        fArr22[7] = max8;
        fVar.a(canvas2, rectF2, fArr22);
        float max112 = Math.max(max, max7);
        float max122 = Math.max(max3, f12);
        float max132 = Math.max(max2, max4);
        float max142 = Math.max(max8, max6);
        int b102 = n.b(((int) Math.ceil(max112)) + ceil2, 1, i11 - 2);
        int b112 = n.b((i11 - ceil3) - ((int) Math.ceil(max122)), b102 + 1, i11 - 1);
        int b122 = n.b(((int) Math.ceil(max132)) + ceil4, 1, i132 - 2);
        return new NinePatchDrawable(ApplicationLoader.applicationContext.getResources(), bitmap, c(b102, b112, b122, n.b((i132 - ceil5) - ((int) Math.ceil(max142)), b122 + 1, i132 - 1), ceil2, ceil4, ceil3, ceil5, i9).array(), new Rect(ceil2, ceil4, ceil3, ceil5), null);
    }

    public static ByteBuffer c(int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        ByteBuffer order = ByteBuffer.allocate(84).order(ByteOrder.nativeOrder());
        order.put((byte) 1);
        order.put((byte) 2);
        order.put((byte) 2);
        order.put((byte) 9);
        order.putInt(0);
        order.putInt(0);
        order.putInt(i13);
        order.putInt(i15);
        order.putInt(i14);
        order.putInt(i16);
        order.putInt(0);
        order.putInt(i9);
        order.putInt(i10);
        order.putInt(i11);
        order.putInt(i12);
        order.putInt(1);
        order.putInt(1);
        order.putInt(1);
        order.putInt(1);
        order.putInt(i17);
        order.putInt(1);
        order.putInt(1);
        order.putInt(1);
        order.putInt(1);
        return order;
    }
}
