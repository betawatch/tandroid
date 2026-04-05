package org.telegram.ui.Components.blur3.utils;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.NinePatchDrawable;
import androidx.core.math.MathUtils;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes5.dex */
public abstract class NinePatchBuilder {
    /* JADX WARN: Removed duplicated region for block: B:25:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x012a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static NinePatchDrawable createNinePatch(Bitmap[] bitmapArr, int i, float[] fArr, float f, int i2, float f2, float f3, int i3) {
        int i4;
        boolean z;
        float f4;
        int i5;
        Bitmap bitmap;
        int i6;
        Bitmap bitmap2;
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
        int ceil = (int) Math.ceil(f * 2.0f);
        int ceil2 = ((int) Math.ceil(Math.max(0.0f, -f2))) + ceil;
        int ceil3 = ((int) Math.ceil(Math.max(0.0f, f2))) + ceil;
        int ceil4 = ((int) Math.ceil(Math.max(0.0f, -f3))) + ceil;
        int ceil5 = ceil + ((int) Math.ceil(Math.max(0.0f, f3)));
        float max9 = Math.max(max + max3, max7 + max5);
        float max10 = Math.max(max2 + max8, max4 + max6);
        int ceil6 = ((int) Math.ceil(max9 + 2.0f)) + ceil2;
        int i7 = ceil6 + ceil3;
        int ceil7 = ((int) Math.ceil(max10 + 2.0f)) + ceil4;
        int i8 = ceil7 + ceil5;
        if (bitmapArr != null) {
            i4 = ceil5;
            if (bitmapArr.length == 1) {
                z = true;
                if (z || (bitmap = bitmapArr[0]) == null || bitmap.isRecycled() || !bitmap.isMutable()) {
                    f4 = max8;
                    i5 = ceil3;
                } else {
                    i5 = ceil3;
                    if (bitmap.getWidth() == i7 && bitmap.getHeight() == i8) {
                        f4 = max8;
                        if (bitmap.getConfig() == Bitmap.Config.ARGB_8888) {
                            bitmap.eraseColor(0);
                            if (bitmap == null) {
                                bitmap = Bitmap.createBitmap(i7, i8, Bitmap.Config.ARGB_8888);
                            }
                            if (z) {
                                bitmapArr[0] = bitmap;
                            }
                            Canvas canvas = new Canvas(bitmap);
                            Paint paint = new Paint(1);
                            paint.setStyle(Paint.Style.FILL);
                            paint.setColor(i);
                            if (f > 0.0f) {
                                i6 = i8;
                                bitmap2 = bitmap;
                                paint.setShadowLayer(f, f2, f3, i2);
                            } else {
                                i6 = i8;
                                bitmap2 = bitmap;
                            }
                            RectF rectF = new RectF(ceil2, ceil4, ceil6, ceil7);
                            Path path = new Path();
                            path.addRoundRect(rectF, new float[]{max, max2, max3, max4, max5, max6, max7, f4}, Path.Direction.CW);
                            canvas.drawPath(path, paint);
                            if (f > 0.0f) {
                                paint.clearShadowLayer();
                                canvas.drawPath(path, paint);
                            }
                            float max11 = Math.max(max, max7);
                            float max12 = Math.max(max3, max5);
                            float max13 = Math.max(max2, max4);
                            float max14 = Math.max(f4, max6);
                            int clamp = MathUtils.clamp(((int) Math.ceil(max11)) + ceil2, 1, i7 - 2);
                            int clamp2 = MathUtils.clamp((i7 - i5) - ((int) Math.ceil(max12)), clamp + 1, i7 - 1);
                            int clamp3 = MathUtils.clamp(((int) Math.ceil(max13)) + ceil4, 1, i6 - 2);
                            return new NinePatchDrawable(bitmap2, createNinePatchChunk(clamp, clamp2, clamp3, MathUtils.clamp((i6 - i4) - ((int) Math.ceil(max14)), clamp3 + 1, i6 - 1), ceil2, ceil4, i5, i4, i3).array(), new Rect(ceil2, ceil4, i5, i4), null);
                        }
                    } else {
                        f4 = max8;
                    }
                }
                bitmap = null;
                if (bitmap == null) {
                }
                if (z) {
                }
                Canvas canvas2 = new Canvas(bitmap);
                Paint paint2 = new Paint(1);
                paint2.setStyle(Paint.Style.FILL);
                paint2.setColor(i);
                if (f > 0.0f) {
                }
                RectF rectF2 = new RectF(ceil2, ceil4, ceil6, ceil7);
                Path path2 = new Path();
                path2.addRoundRect(rectF2, new float[]{max, max2, max3, max4, max5, max6, max7, f4}, Path.Direction.CW);
                canvas2.drawPath(path2, paint2);
                if (f > 0.0f) {
                }
                float max112 = Math.max(max, max7);
                float max122 = Math.max(max3, max5);
                float max132 = Math.max(max2, max4);
                float max142 = Math.max(f4, max6);
                int clamp4 = MathUtils.clamp(((int) Math.ceil(max112)) + ceil2, 1, i7 - 2);
                int clamp22 = MathUtils.clamp((i7 - i5) - ((int) Math.ceil(max122)), clamp4 + 1, i7 - 1);
                int clamp32 = MathUtils.clamp(((int) Math.ceil(max132)) + ceil4, 1, i6 - 2);
                return new NinePatchDrawable(bitmap2, createNinePatchChunk(clamp4, clamp22, clamp32, MathUtils.clamp((i6 - i4) - ((int) Math.ceil(max142)), clamp32 + 1, i6 - 1), ceil2, ceil4, i5, i4, i3).array(), new Rect(ceil2, ceil4, i5, i4), null);
            }
        } else {
            i4 = ceil5;
        }
        z = false;
        if (z) {
        }
        f4 = max8;
        i5 = ceil3;
        bitmap = null;
        if (bitmap == null) {
        }
        if (z) {
        }
        Canvas canvas22 = new Canvas(bitmap);
        Paint paint22 = new Paint(1);
        paint22.setStyle(Paint.Style.FILL);
        paint22.setColor(i);
        if (f > 0.0f) {
        }
        RectF rectF22 = new RectF(ceil2, ceil4, ceil6, ceil7);
        Path path22 = new Path();
        path22.addRoundRect(rectF22, new float[]{max, max2, max3, max4, max5, max6, max7, f4}, Path.Direction.CW);
        canvas22.drawPath(path22, paint22);
        if (f > 0.0f) {
        }
        float max1122 = Math.max(max, max7);
        float max1222 = Math.max(max3, max5);
        float max1322 = Math.max(max2, max4);
        float max1422 = Math.max(f4, max6);
        int clamp42 = MathUtils.clamp(((int) Math.ceil(max1122)) + ceil2, 1, i7 - 2);
        int clamp222 = MathUtils.clamp((i7 - i5) - ((int) Math.ceil(max1222)), clamp42 + 1, i7 - 1);
        int clamp322 = MathUtils.clamp(((int) Math.ceil(max1322)) + ceil4, 1, i6 - 2);
        return new NinePatchDrawable(bitmap2, createNinePatchChunk(clamp42, clamp222, clamp322, MathUtils.clamp((i6 - i4) - ((int) Math.ceil(max1422)), clamp322 + 1, i6 - 1), ceil2, ceil4, i5, i4, i3).array(), new Rect(ceil2, ceil4, i5, i4), null);
    }

    public static ByteBuffer createNinePatchChunk(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
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
