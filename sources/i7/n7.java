package i7;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.NinePatchDrawable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import org.telegram.messenger.ApplicationLoader;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public abstract class n7 {
    public static NinePatchDrawable a(Bitmap bitmap, Rect rect, int i10, int i11) {
        if (bitmap == null) {
            throw new IllegalArgumentException("bitmap == null");
        }
        if (bitmap.isRecycled()) {
            throw new IllegalArgumentException("bitmap is recycled");
        }
        if (i10 >= 0 && i10 < bitmap.getWidth() && i11 >= 0 && i11 < bitmap.getHeight()) {
            return new NinePatchDrawable(ApplicationLoader.applicationContext.getResources(), bitmap, c(i10, i10 + 1, i11, i11 + 1, rect.left, rect.top, rect.right, rect.bottom, bitmap.getPixel(i10, i11)).array(), rect, null);
        }
        StringBuilder o10 = com.google.android.recaptcha.internal.a.o("center pixel is outside bitmap: (", i10, ", ", i11, ") for ");
        o10.append(bitmap.getWidth());
        o10.append("x");
        o10.append(bitmap.getHeight());
        throw new IllegalArgumentException(o10.toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0108  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static NinePatchDrawable b(Bitmap[] bitmapArr, float[] fArr, float f9, float f10, int i10, rg.e eVar) {
        float f11;
        int i11;
        char c3;
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
        int ceil = (int) Math.ceil(f9 * 2.0f);
        int ceil2 = ceil + ((int) Math.ceil(Math.max(0.0f, -0.0f)));
        int ceil3 = ceil + ((int) Math.ceil(Math.max(0.0f, 0.0f)));
        int ceil4 = ceil + ((int) Math.ceil(Math.max(0.0f, -f10)));
        int ceil5 = ceil + ((int) Math.ceil(Math.max(0.0f, f10)));
        float max9 = Math.max(max + max3, max7 + max5);
        float max10 = Math.max(max2 + max8, max4 + max6);
        int ceil6 = ((int) Math.ceil(max9 + 2.0f)) + ceil2;
        int i12 = ceil6 + ceil3;
        int ceil7 = ((int) Math.ceil(max10 + 2.0f)) + ceil4;
        int i13 = ceil7 + ceil5;
        boolean z10 = bitmapArr != null && bitmapArr.length == 1;
        if (z10) {
            c3 = 1;
            bitmap = bitmapArr[0];
            if (bitmap != null && !bitmap.isRecycled() && bitmap.isMutable() && bitmap.getWidth() == i12 && bitmap.getHeight() == i13) {
                f11 = max5;
                if (bitmap.getConfig() == Bitmap.Config.ARGB_8888) {
                    bitmap.eraseColor(0);
                    i11 = i13;
                    if (bitmap == null) {
                        bitmap = Bitmap.createBitmap(i12, i11, Bitmap.Config.ARGB_8888);
                    }
                    if (z10) {
                        bitmapArr[0] = bitmap;
                    }
                    Canvas canvas = new Canvas(bitmap);
                    int i14 = i11;
                    RectF rectF = new RectF(ceil2, ceil4, ceil6, ceil7);
                    float[] fArr2 = new float[8];
                    fArr2[0] = max;
                    fArr2[c3] = max2;
                    fArr2[2] = max3;
                    fArr2[3] = max4;
                    fArr2[4] = f11;
                    fArr2[5] = max6;
                    fArr2[6] = max7;
                    fArr2[7] = max8;
                    eVar.a(canvas, rectF, fArr2);
                    float max11 = Math.max(max, max7);
                    float max12 = Math.max(max3, f11);
                    float max13 = Math.max(max2, max4);
                    float max14 = Math.max(max8, max6);
                    int b10 = w.b(((int) Math.ceil(max11)) + ceil2, 1, i12 - 2);
                    int b11 = w.b((i12 - ceil3) - ((int) Math.ceil(max12)), b10 + 1, i12 - 1);
                    int b12 = w.b(((int) Math.ceil(max13)) + ceil4, 1, i14 - 2);
                    return new NinePatchDrawable(ApplicationLoader.applicationContext.getResources(), bitmap, c(b10, b11, b12, w.b((i14 - ceil5) - ((int) Math.ceil(max14)), b12 + 1, i14 - 1), ceil2, ceil4, ceil3, ceil5, i10).array(), new Rect(ceil2, ceil4, ceil3, ceil5), null);
                }
            } else {
                f11 = max5;
            }
            i11 = i13;
        } else {
            f11 = max5;
            i11 = i13;
            c3 = 1;
        }
        bitmap = null;
        if (bitmap == null) {
        }
        if (z10) {
        }
        Canvas canvas2 = new Canvas(bitmap);
        int i142 = i11;
        RectF rectF2 = new RectF(ceil2, ceil4, ceil6, ceil7);
        float[] fArr22 = new float[8];
        fArr22[0] = max;
        fArr22[c3] = max2;
        fArr22[2] = max3;
        fArr22[3] = max4;
        fArr22[4] = f11;
        fArr22[5] = max6;
        fArr22[6] = max7;
        fArr22[7] = max8;
        eVar.a(canvas2, rectF2, fArr22);
        float max112 = Math.max(max, max7);
        float max122 = Math.max(max3, f11);
        float max132 = Math.max(max2, max4);
        float max142 = Math.max(max8, max6);
        int b102 = w.b(((int) Math.ceil(max112)) + ceil2, 1, i12 - 2);
        int b112 = w.b((i12 - ceil3) - ((int) Math.ceil(max122)), b102 + 1, i12 - 1);
        int b122 = w.b(((int) Math.ceil(max132)) + ceil4, 1, i142 - 2);
        return new NinePatchDrawable(ApplicationLoader.applicationContext.getResources(), bitmap, c(b102, b112, b122, w.b((i142 - ceil5) - ((int) Math.ceil(max142)), b122 + 1, i142 - 1), ceil2, ceil4, ceil3, ceil5, i10).array(), new Rect(ceil2, ceil4, ceil3, ceil5), null);
    }

    public static ByteBuffer c(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        ByteBuffer order = ByteBuffer.allocate(84).order(ByteOrder.nativeOrder());
        order.put((byte) 1);
        order.put((byte) 2);
        order.put((byte) 2);
        order.put((byte) 9);
        order.putInt(0);
        order.putInt(0);
        order.putInt(i14);
        order.putInt(i16);
        order.putInt(i15);
        order.putInt(i17);
        order.putInt(0);
        order.putInt(i10);
        order.putInt(i11);
        order.putInt(i12);
        order.putInt(i13);
        order.putInt(1);
        order.putInt(1);
        order.putInt(1);
        order.putInt(1);
        order.putInt(i18);
        order.putInt(1);
        order.putInt(1);
        order.putInt(1);
        order.putInt(1);
        return order;
    }
}
