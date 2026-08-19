package org.telegram.ui.Stars;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.core.graphics.ColorUtils;
import com.google.zxing.common.detector.MathUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.BatchParticlesDrawHelper;
import org.telegram.ui.Components.CubicBezierInterpolator;

/* loaded from: classes5.dex */
public abstract class StarGiftPatterns {
    private static final BatchParticlesDrawHelper.BatchParticlesBuffer batchBuffer;
    private static final float[][] patternLocations;
    private static final float[] profileLeft;
    private static final float[] profileRight;

    static {
        float[][] fArr = {new float[]{83.33f, 24.0f, 27.33f, 0.22f, 68.66f, 75.33f, 25.33f, 0.21f, 0.0f, 86.0f, 25.33f, 0.12f, -68.66f, 75.33f, 25.33f, 0.21f, -82.66f, 13.66f, 27.33f, 0.22f, -80.0f, -33.33f, 20.0f, 0.24f, -46.5f, -63.16f, 27.0f, 0.21f, 1.0f, -82.66f, 20.0f, 0.15f, 46.5f, -63.16f, 27.0f, 0.21f, 80.0f, -33.33f, 19.33f, 0.24f, 115.66f, -63.0f, 20.0f, 0.15f, 134.0f, -10.66f, 20.0f, 0.18f, 118.66f, 55.66f, 20.0f, 0.15f, 124.33f, 98.33f, 20.0f, 0.11f, -128.0f, 98.33f, 20.0f, 0.11f, -108.0f, 55.66f, 20.0f, 0.15f, -123.33f, -10.66f, 20.0f, 0.18f, -116.0f, -63.33f, 20.0f, 0.15f}, new float[]{27.33f, -57.66f, 20.0f, 0.12f, 59.0f, -32.0f, 19.33f, 0.22f, 77.0f, 4.33f, 22.66f, 0.2f, 100.0f, 40.33f, 18.0f, 0.12f, 58.66f, 59.0f, 20.0f, 0.18f, 73.33f, 100.33f, 22.66f, 0.15f, 75.0f, 155.0f, 22.0f, 0.11f, -27.33f, -57.33f, 20.0f, 0.12f, -59.0f, -32.33f, 19.33f, 0.2f, -77.0f, 4.66f, 23.33f, 0.2f, -98.66f, 41.0f, 18.66f, 0.12f, -58.0f, 59.33f, 19.33f, 0.18f, -73.33f, 100.0f, 22.0f, 0.15f, -75.66f, 155.0f, 22.0f, 0.11f}, new float[]{-0.83f, -52.16f, 12.33f, 0.2f, 26.66f, -40.33f, 16.0f, 0.2f, 44.16f, -20.5f, 12.33f, 0.2f, 53.0f, 7.33f, 16.0f, 0.2f, 31.0f, 23.66f, 14.66f, 0.2f, 0.0f, 32.0f, 13.33f, 0.2f, -29.0f, 23.66f, 14.0f, 0.2f, -53.0f, 7.33f, 16.0f, 0.2f, -44.5f, -20.16f, 12.33f, 0.2f, -27.33f, -40.33f, 16.0f, 0.2f, 43.66f, 50.0f, 14.66f, 0.2f, -41.66f, 48.0f, 14.66f, 0.2f}, new float[]{-0.16f, -103.5f, 20.33f, 0.15f, 39.66f, -77.33f, 26.66f, 0.15f, 70.66f, -46.33f, 21.33f, 0.15f, 84.5f, -3.83f, 29.66f, 0.15f, 65.33f, 56.33f, 24.66f, 0.15f, 0.0f, 67.66f, 24.66f, 0.15f, -65.66f, 56.66f, 24.66f, 0.15f, -85.0f, -4.0f, 29.33f, 0.15f, -70.66f, -46.33f, 21.33f, 0.15f, -40.33f, -77.66f, 26.66f, 0.15f, 62.66f, -109.66f, 21.33f, 0.11f, 103.166f, -67.5f, 20.33f, 0.11f, 110.33f, 37.66f, 20.66f, 0.11f, 94.166f, 91.16f, 20.33f, 0.11f, 38.83f, 91.16f, 20.33f, 0.11f, 0.0f, 112.5f, 20.33f, 0.11f, -38.83f, 91.16f, 20.33f, 0.11f, -94.166f, 91.16f, 20.33f, 0.11f, -110.33f, 37.66f, 20.66f, 0.11f, -103.166f, -67.5f, 20.33f, 0.11f, -62.66f, -109.66f, 21.33f, 0.11f}};
        patternLocations = fArr;
        short s = 0;
        for (int i = 0; i < 4; i++) {
            s = (short) Math.max((int) s, fArr[i].length / 4);
        }
        batchBuffer = new BatchParticlesDrawHelper.BatchParticlesBuffer(s);
        profileRight = new float[]{-35.66f, -5.0f, 24.0f, 0.2388f, -14.33f, -29.33f, 20.66f, 0.32f, -15.0f, -73.66f, 19.33f, 0.32f, -2.0f, -99.66f, 18.0f, 0.1476f, -64.33f, -24.66f, 23.33f, 0.3235f, -40.66f, -53.33f, 24.0f, 0.3654f, -50.33f, -85.66f, 20.0f, 0.172f, -96.0f, -1.33f, 19.33f, 0.3343f, -136.66f, -13.0f, 18.66f, 0.2569f, -104.66f, -33.66f, 20.66f, 0.2216f, -82.0f, -62.33f, 22.66f, 0.2562f, -131.66f, -60.0f, 18.0f, 0.1316f, -105.66f, -88.33f, 18.0f, 0.1487f};
        profileLeft = new float[]{0.0f, -107.33f, 16.0f, 0.1505f, 14.33f, -84.0f, 18.0f, 0.1988f, 0.0f, -50.66f, 18.66f, 0.3225f, 13.0f, -15.0f, 18.66f, 0.37f, 43.33f, 1.0f, 18.66f, 0.3186f};
    }

    public static void drawPattern(Canvas canvas, Drawable drawable, float f, float f2, float f3, float f4) {
        drawPattern(canvas, 0, drawable, f, f2, f3, f4);
    }

    public static void drawPattern(Canvas canvas, int i, Drawable drawable, float f, float f2, float f3, float f4) {
        if (f3 <= 0.0f) {
            return;
        }
        int i2 = 0;
        while (true) {
            float[] fArr = patternLocations[i];
            if (i2 >= fArr.length) {
                return;
            }
            float f5 = fArr[i2];
            float f6 = fArr[i2 + 1];
            float f7 = fArr[i2 + 2];
            float f8 = fArr[i2 + 3];
            if (f >= f2 || i != 0) {
                f6 = f5;
                f5 = f6;
            }
            float f9 = f6 * f4;
            float f10 = f5 * f4;
            float f11 = f7 * f4;
            drawable.setBounds((int) (AndroidUtilities.dp(f9) - (AndroidUtilities.dp(f11) / 2.0f)), (int) (AndroidUtilities.dp(f10) - (AndroidUtilities.dp(f11) / 2.0f)), (int) (AndroidUtilities.dp(f9) + (AndroidUtilities.dp(f11) / 2.0f)), (int) (AndroidUtilities.dp(f10) + (AndroidUtilities.dp(f11) / 2.0f)));
            drawable.setAlpha((int) Utilities.clamp(f3 * 255.0f * f8, 255.0f, 0.0f));
            drawable.draw(canvas);
            i2 += 4;
        }
    }

    public static void drawPatternBatch(Canvas canvas, int i, Paint paint, Bitmap bitmap, float f, float f2, float f3, float f4) {
        if (f3 <= 0.0f) {
            return;
        }
        batchBuffer.fillParticleTextureCords(0.0f, 0.0f, bitmap.getWidth(), bitmap.getHeight());
        int i2 = 0;
        while (true) {
            float[] fArr = patternLocations[i];
            if (i2 < fArr.length) {
                float f5 = fArr[i2];
                float f6 = fArr[i2 + 1];
                float f7 = fArr[i2 + 2];
                float f8 = fArr[i2 + 3];
                if (f >= f2 || i != 0) {
                    f6 = f5;
                    f5 = f6;
                }
                float f9 = f6 * f4;
                float f10 = f5 * f4;
                float f11 = f7 * f4;
                BatchParticlesDrawHelper.BatchParticlesBuffer batchParticlesBuffer = batchBuffer;
                int i3 = i2 / 4;
                batchParticlesBuffer.setParticleVertexCords(i3, AndroidUtilities.dp(f9) - (AndroidUtilities.dp(f11) / 2.0f), AndroidUtilities.dp(f10) - (AndroidUtilities.dp(f11) / 2.0f), AndroidUtilities.dp(f9) + (AndroidUtilities.dp(f11) / 2.0f), AndroidUtilities.dp(f10) + (AndroidUtilities.dp(f11) / 2.0f));
                batchParticlesBuffer.setParticleColor(i3, ColorUtils.setAlphaComponent(-1, (int) (255.0f * f3 * f8)));
                i2 += 4;
            } else {
                BatchParticlesDrawHelper.draw(canvas, batchBuffer, fArr.length / 4, paint);
                return;
            }
        }
    }

    public static void drawProfileAnimatedPattern(Canvas canvas, Drawable drawable, int i, float f, float f2, View view, float f3) {
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(view.getX(), view.getY(), view.getX() + (view.getWidth() * view.getScaleX()), view.getY() + (view.getHeight() * view.getScaleY()));
        drawProfileAnimatedPattern(canvas, drawable, i, f, f2, rectF, f3);
    }

    public static void drawProfileAnimatedPattern(Canvas canvas, Drawable drawable, int i, float f, float f2, RectF rectF, float f3) {
        int i2 = 6;
        if (f2 <= 0.0f) {
            return;
        }
        float clamp01 = Utilities.clamp01(((f2 >= 0.85f ? 1.0f : f2 / 0.85f) - 0.2f) / 0.8f);
        float f4 = rectF.left;
        float f5 = rectF.top;
        int i3 = 0;
        float width = rectF.width();
        float height = rectF.height();
        float f6 = f4 + (width / 2.0f);
        float f7 = f5 + (height / 2.0f);
        float dpf2 = AndroidUtilities.dpf2(96.0f);
        float min = Math.min(f4, (i - dpf2) / 2.0f);
        float max = Math.max(f5, (f - dpf2) / 2.0f);
        float max2 = Math.max(width, dpf2);
        float max3 = Math.max(height, dpf2);
        float f8 = max2 / 2.0f;
        float f9 = min + f8;
        float f10 = max3 / 2.0f;
        float f11 = max + f10;
        float dpf22 = AndroidUtilities.dpf2(24.0f);
        float dpf23 = AndroidUtilities.dpf2(16.0f);
        float dpf24 = AndroidUtilities.dpf2(12.0f);
        float dpf25 = AndroidUtilities.dpf2(8.0f);
        float dpf26 = AndroidUtilities.dpf2(4.0f);
        float f12 = dpf22 * 2.0f;
        float f13 = f12 * 2.0f;
        float cos = (f12 + f8) * ((float) Math.cos(Math.toRadians(120.0d)));
        float cos2 = (dpf23 + f10) * ((float) Math.cos(Math.toRadians(160.0d)));
        float f14 = max + max3;
        float f15 = min - dpf23;
        float f16 = max3 / 4.0f;
        float f17 = (f11 - f16) - dpf25;
        float f18 = min + max2;
        float f19 = f18 + dpf23;
        float f20 = f11 + f16 + dpf25;
        float f21 = min - f12;
        float f22 = f18 + f12;
        float f23 = f9 + cos;
        float f24 = (max - f12) + dpf24;
        float f25 = f9 - cos;
        float f26 = (f14 + f12) - dpf24;
        float f27 = f21 - dpf25;
        float f28 = f11 + cos2;
        float f29 = f22 + dpf25;
        float f30 = f11 - cos2;
        float[] fArr = {f9, max - dpf22, 20.0f, f9, f14 + dpf22, 20.0f, f15, f17, 23.0f, f19, f17, 18.0f, f15, f20, 24.0f, f19 - dpf26, f20, 24.0f, f21, f11, 19.0f, f22, f11, 19.0f, f23, f24, 17.0f, f25, f24, 17.0f, f23, f26, 20.0f, f25, f26, 20.0f, f27, f28, 20.0f, f29, f28, 19.0f, f27, f30, 21.0f, f29, f30, 18.0f, min - f13, f11, 19.0f, f18 + f13, f11, 19.0f};
        float[] fArr2 = {0.02f, 0.42f, 0.0f, 0.32f, 0.0f, 0.4f, 0.0f, 0.4f, 0.0f, 0.4f, 0.0f, 0.4f, 0.14f, 0.6f, 0.16f, 0.64f, 0.14f, 0.7f, 0.14f, 0.9f, 0.2f, 0.75f, 0.2f, 0.85f, 0.09f, 0.45f, 0.09f, 0.45f, 0.09f, 0.45f, 0.11f, 0.45f, 0.14f, 0.75f, 0.2f, 0.8f};
        int i4 = 0;
        for (int i5 = 54; i4 < i5; i5 = 54) {
            float f31 = fArr[i4];
            float f32 = fArr[i4 + 1];
            float dpf27 = AndroidUtilities.dpf2(fArr[i4 + 2]) * 0.5f;
            float f33 = fArr2[i3];
            float f34 = 1.0f - clamp01;
            float clamp012 = f34 < f33 ? 1.0f : 1.0f - Utilities.clamp01((f34 - f33) / (fArr2[i3 + 1] - f33));
            if (i4 == 18 || i4 == 19 || i4 == i2 || i4 == 7) {
                clamp012 = CubicBezierInterpolator.EASE_IN.getInterpolation(clamp012);
            }
            float f35 = clamp012;
            float dp = f32 - (AndroidUtilities.dp(12.0f) * (1.0f - f2));
            float f36 = max3;
            if (f35 < 1.0f) {
                f31 = AndroidUtilities.lerp(f6, f31, CubicBezierInterpolator.EASE_IN.getInterpolation(f35));
                dp = AndroidUtilities.lerp(f7, dp, f35);
                dpf27 = AndroidUtilities.lerp(AndroidUtilities.dpf2(8.0f), dpf27, f35);
            }
            float clamp013 = (dp > ((float) AndroidUtilities.dp(8.0f)) + f14 ? 1.0f - Utilities.clamp01((((dp - max) - f36) - AndroidUtilities.dp(8.0f)) / AndroidUtilities.dp(56.0f)) : 1.0f) * (1.0f - Utilities.clamp01(MathUtils.distance(f9, f11, f31, dp) / (max2 * 2.0f))) * f3 * 0.5f;
            float f37 = dp;
            if (f35 < 1.0f) {
                clamp013 = AndroidUtilities.lerp(0.0f, clamp013, f35);
            }
            drawable.setBounds((int) (f31 - dpf27), (int) (f37 - dpf27), (int) (f31 + dpf27), (int) (f37 + dpf27));
            drawable.setAlpha((int) (clamp013 * 255.0f));
            drawable.draw(canvas);
            i4 += 3;
            i3 += 2;
            max3 = f36;
            i2 = 6;
        }
    }
}
