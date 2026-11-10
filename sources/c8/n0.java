package c8;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.NinePatchDrawable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public abstract class n0 {
    public static NinePatchDrawable a(Bitmap bitmap, Rect rect, int i7, int i10) {
        if (bitmap == null) {
            throw new IllegalArgumentException("bitmap == null");
        }
        if (bitmap.isRecycled()) {
            throw new IllegalArgumentException("bitmap is recycled");
        }
        if (i7 >= 0 && i7 < bitmap.getWidth() && i10 >= 0 && i10 < bitmap.getHeight()) {
            return new NinePatchDrawable(org.telegram.messenger.t0.b.getResources(), bitmap, c(i7, i7 + 1, i10, i10 + 1, rect.left, rect.top, rect.right, rect.bottom, bitmap.getPixel(i7, i10)).array(), rect, null);
        }
        StringBuilder o4 = jg.g.o("center pixel is outside bitmap: (", i7, ", ", i10, ") for ");
        o4.append(bitmap.getWidth());
        o4.append("x");
        o4.append(bitmap.getHeight());
        throw new IllegalArgumentException(o4.toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0167  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static NinePatchDrawable b(Bitmap[] bitmapArr, int i7, float[] fArr, float f10, int i10, float f11, int i11) {
        boolean z9;
        float f12;
        int i12;
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
        int i13 = ceil6 + ceil3;
        int ceil7 = ((int) Math.ceil(max10 + 2.0f)) + ceil4;
        int i14 = ceil7 + ceil5;
        boolean z10 = bitmapArr != null && bitmapArr.length == 1;
        if (!z10 || (bitmap = bitmapArr[0]) == null || bitmap.isRecycled() || !bitmap.isMutable()) {
            z9 = z10;
        } else {
            z9 = z10;
            if (bitmap.getWidth() == i13 && bitmap.getHeight() == i14) {
                f12 = max5;
                if (bitmap.getConfig() == Bitmap.Config.ARGB_8888) {
                    bitmap.eraseColor(0);
                    i12 = i14;
                    if (bitmap == null) {
                        bitmap = Bitmap.createBitmap(i13, i12, Bitmap.Config.ARGB_8888);
                    }
                    Bitmap bitmap2 = bitmap;
                    if (z9) {
                        bitmapArr[0] = bitmap2;
                    }
                    Canvas canvas = new Canvas(bitmap2);
                    int i15 = i12;
                    Path path = new Path();
                    path.addRoundRect(new RectF(ceil2, ceil4, ceil6, ceil7), new float[]{max, max2, max3, max4, f12, max6, max7, max8}, Path.Direction.CW);
                    Paint paint = new Paint(1);
                    paint.setStyle(Paint.Style.FILL);
                    paint.setColor(i7);
                    if (f10 > 0.0f) {
                        paint.setShadowLayer(f10, 0.0f, f11, i10);
                    }
                    canvas.drawPath(path, paint);
                    if (f10 > 0.0f) {
                        paint.clearShadowLayer();
                        canvas.drawPath(path, paint);
                    }
                    float max11 = Math.max(max, max7);
                    float max12 = Math.max(max3, f12);
                    float max13 = Math.max(max2, max4);
                    float max14 = Math.max(max8, max6);
                    int b10 = j9.b(ceil2 + ((int) Math.ceil(max11)), 1, i13 - 2);
                    int b11 = j9.b((i13 - ceil3) - ((int) Math.ceil(max12)), b10 + 1, i13 - 1);
                    int b12 = j9.b(((int) Math.ceil(max13)) + ceil4, 1, i15 - 2);
                    return new NinePatchDrawable(org.telegram.messenger.t0.b.getResources(), bitmap2, c(b10, b11, b12, j9.b((i15 - ceil5) - ((int) Math.ceil(max14)), b12 + 1, i15 - 1), ceil2, ceil4, ceil3, ceil5, i11).array(), new Rect(ceil2, ceil4, ceil3, ceil5), null);
                }
                i12 = i14;
                bitmap = null;
                if (bitmap == null) {
                }
                Bitmap bitmap22 = bitmap;
                if (z9) {
                }
                Canvas canvas2 = new Canvas(bitmap22);
                int i152 = i12;
                Path path2 = new Path();
                path2.addRoundRect(new RectF(ceil2, ceil4, ceil6, ceil7), new float[]{max, max2, max3, max4, f12, max6, max7, max8}, Path.Direction.CW);
                Paint paint2 = new Paint(1);
                paint2.setStyle(Paint.Style.FILL);
                paint2.setColor(i7);
                if (f10 > 0.0f) {
                }
                canvas2.drawPath(path2, paint2);
                if (f10 > 0.0f) {
                }
                float max112 = Math.max(max, max7);
                float max122 = Math.max(max3, f12);
                float max132 = Math.max(max2, max4);
                float max142 = Math.max(max8, max6);
                int b102 = j9.b(ceil2 + ((int) Math.ceil(max112)), 1, i13 - 2);
                int b112 = j9.b((i13 - ceil3) - ((int) Math.ceil(max122)), b102 + 1, i13 - 1);
                int b122 = j9.b(((int) Math.ceil(max132)) + ceil4, 1, i152 - 2);
                return new NinePatchDrawable(org.telegram.messenger.t0.b.getResources(), bitmap22, c(b102, b112, b122, j9.b((i152 - ceil5) - ((int) Math.ceil(max142)), b122 + 1, i152 - 1), ceil2, ceil4, ceil3, ceil5, i11).array(), new Rect(ceil2, ceil4, ceil3, ceil5), null);
            }
        }
        f12 = max5;
        i12 = i14;
        bitmap = null;
        if (bitmap == null) {
        }
        Bitmap bitmap222 = bitmap;
        if (z9) {
        }
        Canvas canvas22 = new Canvas(bitmap222);
        int i1522 = i12;
        Path path22 = new Path();
        path22.addRoundRect(new RectF(ceil2, ceil4, ceil6, ceil7), new float[]{max, max2, max3, max4, f12, max6, max7, max8}, Path.Direction.CW);
        Paint paint22 = new Paint(1);
        paint22.setStyle(Paint.Style.FILL);
        paint22.setColor(i7);
        if (f10 > 0.0f) {
        }
        canvas22.drawPath(path22, paint22);
        if (f10 > 0.0f) {
        }
        float max1122 = Math.max(max, max7);
        float max1222 = Math.max(max3, f12);
        float max1322 = Math.max(max2, max4);
        float max1422 = Math.max(max8, max6);
        int b1022 = j9.b(ceil2 + ((int) Math.ceil(max1122)), 1, i13 - 2);
        int b1122 = j9.b((i13 - ceil3) - ((int) Math.ceil(max1222)), b1022 + 1, i13 - 1);
        int b1222 = j9.b(((int) Math.ceil(max1322)) + ceil4, 1, i1522 - 2);
        return new NinePatchDrawable(org.telegram.messenger.t0.b.getResources(), bitmap222, c(b1022, b1122, b1222, j9.b((i1522 - ceil5) - ((int) Math.ceil(max1422)), b1222 + 1, i1522 - 1), ceil2, ceil4, ceil3, ceil5, i11).array(), new Rect(ceil2, ceil4, ceil3, ceil5), null);
    }

    public static ByteBuffer c(int i7, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
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
        order.putInt(i7);
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
