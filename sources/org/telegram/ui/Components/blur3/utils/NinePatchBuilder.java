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
import org.telegram.messenger.ApplicationLoader;

/* loaded from: classes5.dex */
public abstract class NinePatchBuilder {

    public interface NinePathRenderer {
        void draw(Canvas canvas, RectF rectF, float[] fArr);
    }

    public static NinePatchDrawable createNinePatch(Bitmap[] bitmapArr, final int i, float[] fArr, final float f, final int i2, final float f2, final float f3, int i3) {
        return createNinePatch(bitmapArr, fArr, f, f2, f3, i3, new NinePathRenderer() { // from class: org.telegram.ui.Components.blur3.utils.NinePatchBuilder$$ExternalSyntheticLambda0
            @Override // org.telegram.ui.Components.blur3.utils.NinePatchBuilder.NinePathRenderer
            public final void draw(Canvas canvas, RectF rectF, float[] fArr2) {
                NinePatchBuilder.lambda$createNinePatch$0(i, f, f2, f3, i2, canvas, rectF, fArr2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$createNinePatch$0(int i, float f, float f2, float f3, int i2, Canvas canvas, RectF rectF, float[] fArr) {
        Path path = new Path();
        path.addRoundRect(rectF, fArr, Path.Direction.CW);
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(i);
        if (f > 0.0f) {
            paint.setShadowLayer(f, f2, f3, i2);
        }
        canvas.drawPath(path, paint);
        if (f > 0.0f) {
            paint.clearShadowLayer();
            canvas.drawPath(path, paint);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00f6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static NinePatchDrawable createNinePatch(Bitmap[] bitmapArr, float[] fArr, float f, float f2, float f3, int i, NinePathRenderer ninePathRenderer) {
        int i2;
        boolean z;
        int i3;
        int i4;
        int i5;
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
        int ceil = (int) Math.ceil(f * 2.0f);
        int ceil2 = ((int) Math.ceil(Math.max(0.0f, -f2))) + ceil;
        int ceil3 = ((int) Math.ceil(Math.max(0.0f, f2))) + ceil;
        int ceil4 = ((int) Math.ceil(Math.max(0.0f, -f3))) + ceil;
        int ceil5 = ceil + ((int) Math.ceil(Math.max(0.0f, f3)));
        float max9 = Math.max(max + max3, max7 + max5);
        float max10 = Math.max(max2 + max8, max4 + max6);
        int ceil6 = ((int) Math.ceil(max9 + 2.0f)) + ceil2;
        int i6 = ceil6 + ceil3;
        int ceil7 = ((int) Math.ceil(max10 + 2.0f)) + ceil4;
        int i7 = ceil7 + ceil5;
        if (bitmapArr != null) {
            i2 = i7;
            if (bitmapArr.length == 1) {
                z = true;
                if (z) {
                    i3 = i2;
                } else {
                    bitmap = bitmapArr[0];
                    i3 = i2;
                    if (bitmap != null && !bitmap.isRecycled() && bitmap.isMutable()) {
                        i5 = ceil5;
                        if (bitmap.getWidth() == i6 && bitmap.getHeight() == i3) {
                            i4 = ceil3;
                            if (bitmap.getConfig() == Bitmap.Config.ARGB_8888) {
                                bitmap.eraseColor(0);
                                if (bitmap == null) {
                                    bitmap = Bitmap.createBitmap(i6, i3, Bitmap.Config.ARGB_8888);
                                }
                                Bitmap bitmap2 = bitmap;
                                if (z) {
                                    bitmapArr[0] = bitmap2;
                                }
                                ninePathRenderer.draw(new Canvas(bitmap2), new RectF(ceil2, ceil4, ceil6, ceil7), new float[]{max, max2, max3, max4, max5, max6, max7, max8});
                                float max11 = Math.max(max, max7);
                                float max12 = Math.max(max3, max5);
                                float max13 = Math.max(max2, max4);
                                float max14 = Math.max(max8, max6);
                                int clamp = MathUtils.clamp(((int) Math.ceil(max11)) + ceil2, 1, i6 - 2);
                                int clamp2 = MathUtils.clamp((i6 - i4) - ((int) Math.ceil(max12)), clamp + 1, i6 - 1);
                                int clamp3 = MathUtils.clamp(((int) Math.ceil(max13)) + ceil4, 1, i3 - 2);
                                return new NinePatchDrawable(ApplicationLoader.applicationContext.getResources(), bitmap2, createNinePatchChunk(clamp, clamp2, clamp3, MathUtils.clamp((i3 - i5) - ((int) Math.ceil(max14)), clamp3 + 1, i3 - 1), ceil2, ceil4, i4, i5, i).array(), new Rect(ceil2, ceil4, i4, i5), null);
                            }
                        } else {
                            i4 = ceil3;
                        }
                        bitmap = null;
                        if (bitmap == null) {
                        }
                        Bitmap bitmap22 = bitmap;
                        if (z) {
                        }
                        ninePathRenderer.draw(new Canvas(bitmap22), new RectF(ceil2, ceil4, ceil6, ceil7), new float[]{max, max2, max3, max4, max5, max6, max7, max8});
                        float max112 = Math.max(max, max7);
                        float max122 = Math.max(max3, max5);
                        float max132 = Math.max(max2, max4);
                        float max142 = Math.max(max8, max6);
                        int clamp4 = MathUtils.clamp(((int) Math.ceil(max112)) + ceil2, 1, i6 - 2);
                        int clamp22 = MathUtils.clamp((i6 - i4) - ((int) Math.ceil(max122)), clamp4 + 1, i6 - 1);
                        int clamp32 = MathUtils.clamp(((int) Math.ceil(max132)) + ceil4, 1, i3 - 2);
                        return new NinePatchDrawable(ApplicationLoader.applicationContext.getResources(), bitmap22, createNinePatchChunk(clamp4, clamp22, clamp32, MathUtils.clamp((i3 - i5) - ((int) Math.ceil(max142)), clamp32 + 1, i3 - 1), ceil2, ceil4, i4, i5, i).array(), new Rect(ceil2, ceil4, i4, i5), null);
                    }
                }
                i4 = ceil3;
                i5 = ceil5;
                bitmap = null;
                if (bitmap == null) {
                }
                Bitmap bitmap222 = bitmap;
                if (z) {
                }
                ninePathRenderer.draw(new Canvas(bitmap222), new RectF(ceil2, ceil4, ceil6, ceil7), new float[]{max, max2, max3, max4, max5, max6, max7, max8});
                float max1122 = Math.max(max, max7);
                float max1222 = Math.max(max3, max5);
                float max1322 = Math.max(max2, max4);
                float max1422 = Math.max(max8, max6);
                int clamp42 = MathUtils.clamp(((int) Math.ceil(max1122)) + ceil2, 1, i6 - 2);
                int clamp222 = MathUtils.clamp((i6 - i4) - ((int) Math.ceil(max1222)), clamp42 + 1, i6 - 1);
                int clamp322 = MathUtils.clamp(((int) Math.ceil(max1322)) + ceil4, 1, i3 - 2);
                return new NinePatchDrawable(ApplicationLoader.applicationContext.getResources(), bitmap222, createNinePatchChunk(clamp42, clamp222, clamp322, MathUtils.clamp((i3 - i5) - ((int) Math.ceil(max1422)), clamp322 + 1, i3 - 1), ceil2, ceil4, i4, i5, i).array(), new Rect(ceil2, ceil4, i4, i5), null);
            }
        } else {
            i2 = i7;
        }
        z = false;
        if (z) {
        }
        i4 = ceil3;
        i5 = ceil5;
        bitmap = null;
        if (bitmap == null) {
        }
        Bitmap bitmap2222 = bitmap;
        if (z) {
        }
        ninePathRenderer.draw(new Canvas(bitmap2222), new RectF(ceil2, ceil4, ceil6, ceil7), new float[]{max, max2, max3, max4, max5, max6, max7, max8});
        float max11222 = Math.max(max, max7);
        float max12222 = Math.max(max3, max5);
        float max13222 = Math.max(max2, max4);
        float max14222 = Math.max(max8, max6);
        int clamp422 = MathUtils.clamp(((int) Math.ceil(max11222)) + ceil2, 1, i6 - 2);
        int clamp2222 = MathUtils.clamp((i6 - i4) - ((int) Math.ceil(max12222)), clamp422 + 1, i6 - 1);
        int clamp3222 = MathUtils.clamp(((int) Math.ceil(max13222)) + ceil4, 1, i3 - 2);
        return new NinePatchDrawable(ApplicationLoader.applicationContext.getResources(), bitmap2222, createNinePatchChunk(clamp422, clamp2222, clamp3222, MathUtils.clamp((i3 - i5) - ((int) Math.ceil(max14222)), clamp3222 + 1, i3 - 1), ceil2, ceil4, i4, i5, i).array(), new Rect(ceil2, ceil4, i4, i5), null);
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
