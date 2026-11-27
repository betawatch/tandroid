// default package

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.NinePatchDrawable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import org.telegram.messenger.a;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public abstract class jue {
    public static NinePatchDrawable a(Bitmap bitmap, Rect rect, int i, int i2) {
        if (bitmap == null) {
            lq5.j("bitmap == null");
            return null;
        }
        if (bitmap.isRecycled()) {
            lq5.j("bitmap is recycled");
            return null;
        }
        if (i >= 0 && i < bitmap.getWidth() && i2 >= 0 && i2 < bitmap.getHeight()) {
            return new NinePatchDrawable(a.b.getResources(), bitmap, c(i, i + 1, i2, i2 + 1, rect.left, rect.top, rect.right, rect.bottom, bitmap.getPixel(i, i2)).array(), rect, null);
        }
        StringBuilder p = bs2.p("center pixel is outside bitmap: (", i, ", ", i2, ") for ");
        p.append(bitmap.getWidth());
        p.append("x");
        p3d.f(bitmap.getHeight(), p);
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0146  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static NinePatchDrawable b(Bitmap[] bitmapArr, int i, float[] fArr, float f, int i2, float f2, int i3) {
        boolean z;
        float f3;
        Bitmap bitmap;
        Bitmap bitmap2;
        if (fArr.length != 8) {
            lq5.j("radii must have 8 values: TLx,TLy, TRx,TRy, BRx,BRy, BLx,BLy");
            return null;
        }
        float max = Math.max(0.0f, fArr[0]);
        float max2 = Math.max(0.0f, fArr[1]);
        float max3 = Math.max(0.0f, fArr[2]);
        float max4 = Math.max(0.0f, fArr[3]);
        float max5 = Math.max(0.0f, fArr[4]);
        float max6 = Math.max(0.0f, fArr[5]);
        float max7 = Math.max(0.0f, fArr[6]);
        float max8 = Math.max(0.0f, fArr[7]);
        int ceil = (int) Math.ceil(f * 2.0f);
        int ceil2 = ((int) Math.ceil(Math.max(0.0f, -f2))) + ceil;
        int ceil3 = ceil + ((int) Math.ceil(Math.max(0.0f, f2)));
        float max9 = Math.max(max + max3, max7 + max5);
        float max10 = Math.max(max2 + max8, max4 + max6);
        int ceil4 = (int) Math.ceil(max9 + 2.0f);
        int ceil5 = (int) Math.ceil(max10 + 2.0f);
        int i4 = ceil4 + ceil;
        int i5 = i4 + ceil;
        int i6 = ceil5 + ceil2;
        int i7 = i6 + ceil3;
        boolean z2 = bitmapArr.length == 1;
        if (!z2 || (bitmap2 = bitmapArr[0]) == null || bitmap2.isRecycled() || !bitmap2.isMutable()) {
            z = z2;
        } else {
            z = z2;
            if (bitmap2.getWidth() == i5 && bitmap2.getHeight() == i7) {
                f3 = max8;
                if (bitmap2.getConfig() == Bitmap.Config.ARGB_8888) {
                    bitmap2.eraseColor(0);
                    bitmap = bitmap2;
                    if (bitmap == null) {
                        bitmap = Bitmap.createBitmap(i5, i7, Bitmap.Config.ARGB_8888);
                    }
                    if (z) {
                        bitmapArr[0] = bitmap;
                    }
                    Canvas canvas = new Canvas(bitmap);
                    Bitmap bitmap3 = bitmap;
                    RectF rectF = new RectF(ceil, ceil2, i4, i6);
                    float[] fArr2 = {max, max2, max3, max4, max5, max6, max7, f3};
                    Path path = new Path();
                    path.addRoundRect(rectF, fArr2, Path.Direction.CW);
                    Paint paint = new Paint(1);
                    paint.setStyle(Paint.Style.FILL);
                    paint.setColor(i);
                    if (f > 0.0f) {
                        paint.setShadowLayer(f, 0.0f, f2, i2);
                    }
                    canvas.drawPath(path, paint);
                    if (f > 0.0f) {
                        paint.clearShadowLayer();
                        canvas.drawPath(path, paint);
                    }
                    float max11 = Math.max(max, max7);
                    float max12 = Math.max(max3, max5);
                    float max13 = Math.max(max2, max4);
                    float max14 = Math.max(f3, max6);
                    int b = ete.b(ceil + ((int) Math.ceil(max11)), 1, i5 - 2);
                    int b2 = ete.b((i5 - ceil) - ((int) Math.ceil(max12)), b + 1, i5 - 1);
                    int b3 = ete.b(((int) Math.ceil(max13)) + ceil2, 1, i7 - 2);
                    return new NinePatchDrawable(a.b.getResources(), bitmap3, c(b, b2, b3, ete.b((i7 - ceil3) - ((int) Math.ceil(max14)), b3 + 1, i7 - 1), ceil, ceil2, ceil, ceil3, i3).array(), new Rect(ceil, ceil2, ceil, ceil3), null);
                }
                bitmap = null;
                if (bitmap == null) {
                }
                if (z) {
                }
                Canvas canvas2 = new Canvas(bitmap);
                Bitmap bitmap32 = bitmap;
                RectF rectF2 = new RectF(ceil, ceil2, i4, i6);
                float[] fArr22 = {max, max2, max3, max4, max5, max6, max7, f3};
                Path path2 = new Path();
                path2.addRoundRect(rectF2, fArr22, Path.Direction.CW);
                Paint paint2 = new Paint(1);
                paint2.setStyle(Paint.Style.FILL);
                paint2.setColor(i);
                if (f > 0.0f) {
                }
                canvas2.drawPath(path2, paint2);
                if (f > 0.0f) {
                }
                float max112 = Math.max(max, max7);
                float max122 = Math.max(max3, max5);
                float max132 = Math.max(max2, max4);
                float max142 = Math.max(f3, max6);
                int b4 = ete.b(ceil + ((int) Math.ceil(max112)), 1, i5 - 2);
                int b22 = ete.b((i5 - ceil) - ((int) Math.ceil(max122)), b4 + 1, i5 - 1);
                int b32 = ete.b(((int) Math.ceil(max132)) + ceil2, 1, i7 - 2);
                return new NinePatchDrawable(a.b.getResources(), bitmap32, c(b4, b22, b32, ete.b((i7 - ceil3) - ((int) Math.ceil(max142)), b32 + 1, i7 - 1), ceil, ceil2, ceil, ceil3, i3).array(), new Rect(ceil, ceil2, ceil, ceil3), null);
            }
        }
        f3 = max8;
        bitmap = null;
        if (bitmap == null) {
        }
        if (z) {
        }
        Canvas canvas22 = new Canvas(bitmap);
        Bitmap bitmap322 = bitmap;
        RectF rectF22 = new RectF(ceil, ceil2, i4, i6);
        float[] fArr222 = {max, max2, max3, max4, max5, max6, max7, f3};
        Path path22 = new Path();
        path22.addRoundRect(rectF22, fArr222, Path.Direction.CW);
        Paint paint22 = new Paint(1);
        paint22.setStyle(Paint.Style.FILL);
        paint22.setColor(i);
        if (f > 0.0f) {
        }
        canvas22.drawPath(path22, paint22);
        if (f > 0.0f) {
        }
        float max1122 = Math.max(max, max7);
        float max1222 = Math.max(max3, max5);
        float max1322 = Math.max(max2, max4);
        float max1422 = Math.max(f3, max6);
        int b42 = ete.b(ceil + ((int) Math.ceil(max1122)), 1, i5 - 2);
        int b222 = ete.b((i5 - ceil) - ((int) Math.ceil(max1222)), b42 + 1, i5 - 1);
        int b322 = ete.b(((int) Math.ceil(max1322)) + ceil2, 1, i7 - 2);
        return new NinePatchDrawable(a.b.getResources(), bitmap322, c(b42, b222, b322, ete.b((i7 - ceil3) - ((int) Math.ceil(max1422)), b322 + 1, i7 - 1), ceil, ceil2, ceil, ceil3, i3).array(), new Rect(ceil, ceil2, ceil, ceil3), null);
    }

    public static ByteBuffer c(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        ByteBuffer order = ByteBuffer.allocate(84).order(ByteOrder.nativeOrder());
        order.put((byte) 1);
        order.put((byte) 2);
        order.put((byte) 2);
        order.put((byte) 9);
        order.putInt(0);
        order.putInt(0);
        order.putInt(i5);
        order.putInt(i7);
        order.putInt(i6);
        order.putInt(i8);
        order.putInt(0);
        order.putInt(i);
        order.putInt(i2);
        order.putInt(i3);
        order.putInt(i4);
        order.putInt(1);
        order.putInt(1);
        order.putInt(1);
        order.putInt(1);
        order.putInt(i9);
        order.putInt(1);
        order.putInt(1);
        order.putInt(1);
        order.putInt(1);
        return order;
    }
}
