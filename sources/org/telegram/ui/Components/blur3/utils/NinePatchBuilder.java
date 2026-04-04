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
    public static NinePatchDrawable createNinePatch(int i, float[] fArr, float f, int i2, float f2, float f3) {
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
        int i3 = ceil6 + ceil3;
        int ceil7 = ((int) Math.ceil(max10 + 2.0f)) + ceil4;
        int i4 = ceil7 + ceil5;
        Bitmap createBitmap = Bitmap.createBitmap(i3, i4, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(i);
        if (f > 0.0f) {
            paint.setShadowLayer(f, f2, f3, i2);
        }
        RectF rectF = new RectF(ceil2, ceil4, ceil6, ceil7);
        Path path = new Path();
        path.addRoundRect(rectF, new float[]{max, max2, max3, max4, max5, max6, max7, max8}, Path.Direction.CW);
        canvas.drawPath(path, paint);
        if (f > 0.0f) {
            paint.clearShadowLayer();
            canvas.drawPath(path, paint);
        }
        float max11 = Math.max(max, max7);
        float max12 = Math.max(max3, max5);
        float max13 = Math.max(max2, max4);
        float max14 = Math.max(max8, max6);
        int clamp = MathUtils.clamp(((int) Math.ceil(max11)) + ceil2, 1, i3 - 2);
        int clamp2 = MathUtils.clamp((i3 - ceil3) - ((int) Math.ceil(max12)), clamp + 1, i3 - 1);
        int clamp3 = MathUtils.clamp(((int) Math.ceil(max13)) + ceil4, 1, i4 - 2);
        return new NinePatchDrawable(createBitmap, createNinePatchChunk(clamp, clamp2, clamp3, MathUtils.clamp((i4 - ceil5) - ((int) Math.ceil(max14)), clamp3 + 1, i4 - 1), ceil2, ceil4, ceil3, ceil5, 1).array(), new Rect(ceil2, ceil4, ceil3, ceil5), null);
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
