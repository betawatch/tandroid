package org.telegram.messenger;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.GradientDrawable;
import com.google.zxing.EncodeHintType;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import com.google.zxing.qrcode.encoder.ByteMatrix;
import com.google.zxing.qrcode.encoder.Encoder;
import java.util.Arrays;
import java.util.Map;

/* loaded from: classes3.dex */
public final class TelegramQRCodeWriter {
    private static final int QUIET_ZONE_SIZE = 4;
    private int imageBlockX;
    private int imageBloks;
    private int imageSize;
    private ByteMatrix input;
    private int sideQuadSize;
    private float[] radii = new float[8];
    public boolean includeSideQuads = true;

    public Bitmap encode(String str, int i, int i2, Map<EncodeHintType, ?> map, Bitmap bitmap) {
        return encode(str, i, i2, map, bitmap, 1.0f, -1, -16777216);
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Bitmap encode(String str, int i, int i2, Map<EncodeHintType, ?> map, Bitmap bitmap, float f, int i3, int i4) {
        String str2;
        int i5;
        ByteMatrix matrix;
        int i6;
        Paint paint;
        GradientDrawable gradientDrawable;
        Bitmap bitmap2;
        char c;
        Canvas canvas;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        Canvas canvas2;
        Paint paint2;
        if (str.isEmpty()) {
            throw new IllegalArgumentException("Found empty contents");
        }
        if (i < 0 || i2 < 0) {
            throw new IllegalArgumentException("Requested dimensions are too small: " + i + 'x' + i2);
        }
        ErrorCorrectionLevel errorCorrectionLevel = ErrorCorrectionLevel.L;
        if (map != null) {
            EncodeHintType encodeHintType = EncodeHintType.ERROR_CORRECTION;
            if (map.containsKey(encodeHintType)) {
                errorCorrectionLevel = ErrorCorrectionLevel.valueOf(map.get(encodeHintType).toString());
            }
            EncodeHintType encodeHintType2 = EncodeHintType.MARGIN;
            if (map.containsKey(encodeHintType2)) {
                i5 = Integer.parseInt(map.get(encodeHintType2).toString());
                str2 = str;
                matrix = Encoder.encode(str2, errorCorrectionLevel, map).getMatrix();
                this.input = matrix;
                if (matrix != null) {
                    throw new IllegalStateException();
                }
                int width = matrix.getWidth();
                int height = this.input.getHeight();
                for (int i7 = 0; i7 < width && has(i7, 0); i7++) {
                    this.sideQuadSize++;
                }
                int i8 = i5 * 2;
                int i9 = width + i8;
                int i10 = i8 + height;
                int min = Math.min(Math.max(i, i9) / i9, Math.max(i2, i10) / i10);
                int i11 = min * width;
                int i12 = i11 + 32;
                Bitmap createBitmap = (bitmap == null || bitmap.getWidth() != i12) ? Bitmap.createBitmap(i12, i12, Bitmap.Config.ARGB_8888) : bitmap;
                Canvas canvas3 = new Canvas(createBitmap);
                canvas3.drawColor(i3);
                Paint paint3 = new Paint(1);
                paint3.setColor(i4);
                GradientDrawable gradientDrawable2 = new GradientDrawable();
                gradientDrawable2.setShape(0);
                gradientDrawable2.setCornerRadii(this.radii);
                Bitmap bitmap3 = createBitmap;
                float f2 = min;
                int round = Math.round((i11 / 4.65f) / f2);
                this.imageBloks = round;
                if (round % 2 != width % 2) {
                    this.imageBloks = round + 1;
                }
                int i13 = this.imageBloks;
                this.imageBlockX = (width - i13) / 2;
                int i14 = (i13 * min) - 24;
                this.imageSize = i14;
                int i15 = (i12 - i14) / 2;
                Canvas canvas4 = canvas3;
                if (this.includeSideQuads) {
                    paint3.setColor(i4);
                    i6 = min;
                    bitmap2 = bitmap3;
                    c = 1;
                    paint = paint3;
                    gradientDrawable = gradientDrawable2;
                    drawSideQuadsGradient(canvas4, paint, gradientDrawable, this.sideQuadSize, f2, 16, i12, f, this.radii, i3, i4);
                } else {
                    i6 = min;
                    paint = paint3;
                    gradientDrawable = gradientDrawable2;
                    bitmap2 = bitmap3;
                    c = 1;
                }
                boolean z5 = Color.alpha(i3) == 0;
                float f3 = (f2 / 2.0f) * f;
                int i16 = 16;
                int i17 = 0;
                while (i17 < height) {
                    int i18 = 0;
                    int i19 = 16;
                    while (i18 < width) {
                        if (has(i18, i17)) {
                            Arrays.fill(this.radii, f3);
                            if (has(i18, i17 - 1)) {
                                float[] fArr = this.radii;
                                fArr[c] = 0.0f;
                                fArr[0] = 0.0f;
                                fArr[3] = 0.0f;
                                fArr[2] = 0.0f;
                            }
                            if (has(i18, i17 + 1)) {
                                float[] fArr2 = this.radii;
                                fArr2[7] = 0.0f;
                                fArr2[6] = 0.0f;
                                fArr2[5] = 0.0f;
                                fArr2[4] = 0.0f;
                            }
                            if (has(i18 - 1, i17)) {
                                float[] fArr3 = this.radii;
                                fArr3[c] = 0.0f;
                                fArr3[0] = 0.0f;
                                fArr3[7] = 0.0f;
                                fArr3[6] = 0.0f;
                            }
                            if (has(i18 + 1, i17)) {
                                float[] fArr4 = this.radii;
                                fArr4[3] = 0.0f;
                                fArr4[2] = 0.0f;
                                fArr4[5] = 0.0f;
                                fArr4[4] = 0.0f;
                            }
                            gradientDrawable.setColor(i4);
                            gradientDrawable.setBounds(i19, i16, i19 + i6, i16 + i6);
                            gradientDrawable.draw(canvas4);
                            paint2 = paint;
                            canvas2 = canvas4;
                            z3 = z5;
                        } else {
                            Paint paint4 = paint;
                            Arrays.fill(this.radii, 0.0f);
                            int i20 = i18 - 1;
                            int i21 = i17 - 1;
                            if (has(i20, i21) && has(i20, i17) && has(i18, i21)) {
                                canvas = canvas4;
                                float[] fArr5 = this.radii;
                                fArr5[c] = f3;
                                fArr5[0] = f3;
                                z = true;
                            } else {
                                canvas = canvas4;
                                z = false;
                            }
                            boolean z6 = z;
                            int i22 = i18 + 1;
                            if (has(i22, i21) && has(i22, i17) && has(i18, i21)) {
                                float[] fArr6 = this.radii;
                                fArr6[3] = f3;
                                fArr6[2] = f3;
                                z2 = true;
                            } else {
                                z2 = z6;
                            }
                            z3 = z5;
                            int i23 = i17 + 1;
                            if (has(i20, i23) && has(i20, i17) && has(i18, i23)) {
                                float[] fArr7 = this.radii;
                                fArr7[7] = f3;
                                fArr7[6] = f3;
                                z2 = true;
                            }
                            if (has(i22, i23) && has(i22, i17) && has(i18, i23)) {
                                float[] fArr8 = this.radii;
                                fArr8[5] = f3;
                                fArr8[4] = f3;
                                z4 = true;
                            } else {
                                z4 = z2;
                            }
                            if (!z4 || z3) {
                                canvas2 = canvas;
                                paint2 = paint4;
                            } else {
                                int i24 = i19 + i6;
                                int i25 = i16 + i6;
                                canvas.drawRect(i19, i16, i24, i25, paint4);
                                canvas2 = canvas;
                                paint2 = paint4;
                                gradientDrawable.setColor(i3);
                                gradientDrawable.setBounds(i19, i16, i24, i25);
                                gradientDrawable.draw(canvas2);
                            }
                        }
                        i18++;
                        i19 += i6;
                        canvas4 = canvas2;
                        paint = paint2;
                        z5 = z3;
                    }
                    i17++;
                    i16 += i6;
                    paint = paint;
                }
                Canvas canvas5 = canvas4;
                String readRes = AndroidUtilities.readRes(R.raw.qr_logo);
                int i26 = this.imageSize;
                Bitmap bitmap4 = SvgHelper.getBitmap(readRes, i26, i26, false);
                float f4 = i15;
                canvas5.drawBitmap(bitmap4, f4, f4, (Paint) null);
                bitmap4.recycle();
                canvas5.setBitmap(null);
                return bitmap2;
            }
        }
        str2 = str;
        i5 = 4;
        matrix = Encoder.encode(str2, errorCorrectionLevel, map).getMatrix();
        this.input = matrix;
        if (matrix != null) {
        }
    }

    public static void drawSideQuadsGradient(Canvas canvas, Paint paint, GradientDrawable gradientDrawable, float f, float f2, int i, float f3, float f4, float[] fArr, int i2, int i3) {
        float f5;
        float f6;
        float f7;
        float f8;
        boolean z = Color.alpha(i2) == 0;
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadii(fArr);
        Path path = new Path();
        RectF rectF = new RectF();
        for (int i4 = 0; i4 < 3; i4++) {
            if (i4 == 0) {
                f5 = i;
                f7 = f5;
            } else {
                if (i4 == 1) {
                    f6 = i;
                    f5 = (f3 - (f * f2)) - f6;
                } else {
                    f5 = i;
                    f6 = (f3 - (f * f2)) - f5;
                }
                f7 = f6;
            }
            if (z) {
                float f9 = (f - 1.0f) * f2;
                f8 = 1.0f;
                rectF.set(f5 + f2, f7 + f2, f5 + f9, f9 + f7);
                float f10 = ((f * f2) / 4.0f) * f4;
                path.reset();
                path.addRoundRect(rectF, f10, f10, Path.Direction.CW);
                path.close();
                canvas.save();
                canvas.clipPath(path, Region.Op.DIFFERENCE);
            } else {
                f8 = 1.0f;
            }
            float f11 = f * f2;
            Arrays.fill(fArr, (f11 / 3.0f) * f4);
            gradientDrawable.setColor(i3);
            gradientDrawable.setBounds((int) f5, (int) f7, (int) (f5 + f11), (int) (f7 + f11));
            gradientDrawable.draw(canvas);
            float f12 = f5;
            float f13 = f12 + f2;
            float f14 = f7 + f2;
            float f15 = (f - f8) * f2;
            float f16 = f12 + f15;
            float f17 = f15 + f7;
            canvas.drawRect(f13, f14, f16, f17, paint);
            if (z) {
                canvas.restore();
            }
            if (!z) {
                Arrays.fill(fArr, (f11 / 4.0f) * f4);
                gradientDrawable.setColor(i2);
                gradientDrawable.setBounds((int) f13, (int) f14, (int) f16, (int) f17);
                gradientDrawable.draw(canvas);
            }
            float f18 = (f - 2.0f) * f2;
            Arrays.fill(fArr, (f18 / 4.0f) * f4);
            gradientDrawable.setColor(i3);
            float f19 = 2.0f * f2;
            gradientDrawable.setBounds((int) (f12 + f19), (int) (f19 + f7), (int) (f12 + f18), (int) (f7 + f18));
            gradientDrawable.draw(canvas);
        }
    }

    public static void drawSideQuads(Canvas canvas, float f, float f2, Paint paint, float f3, float f4, int i, float f5, float f6, float[] fArr, boolean z) {
        float f7;
        float f8;
        float f9;
        float f10;
        Path path = new Path();
        for (int i2 = 0; i2 < 3; i2++) {
            if (i2 == 0) {
                f10 = i;
                f9 = f10;
            } else {
                if (i2 == 1) {
                    f8 = i;
                    f7 = (f5 - (f3 * f4)) - f8;
                } else {
                    f7 = i;
                    f8 = (f5 - (f3 * f4)) - f7;
                }
                float f11 = f8;
                f9 = f7;
                f10 = f11;
            }
            float f12 = f9 + f;
            float f13 = f10 + f2;
            if (z) {
                RectF rectF = AndroidUtilities.rectTmp;
                float f14 = (f3 - 1.0f) * f4;
                rectF.set(f12 + f4, f13 + f4, f12 + f14, f14 + f13);
                float f15 = ((f3 * f4) / 4.0f) * f6;
                path.reset();
                path.addRoundRect(rectF, f15, f15, Path.Direction.CW);
                path.close();
                canvas.save();
                canvas.clipPath(path, Region.Op.DIFFERENCE);
            }
            float f16 = f3 * f4;
            float f17 = (f16 / 3.0f) * f6;
            RectF rectF2 = AndroidUtilities.rectTmp;
            rectF2.set(f12, f13, f12 + f16, f16 + f13);
            canvas.drawRoundRect(rectF2, f17, f17, paint);
            if (z) {
                canvas.restore();
            }
            float f18 = (f3 - 2.0f) * f4;
            float f19 = (f18 / 4.0f) * f6;
            float f20 = 2.0f * f4;
            rectF2.set(f12 + f20, f20 + f13, f12 + f18, f13 + f18);
            canvas.drawRoundRect(rectF2, f19, f19, paint);
        }
    }

    private boolean has(int i, int i2) {
        int i3;
        int i4 = this.imageBlockX;
        if (i >= i4 && i < (i3 = this.imageBloks + i4) && i2 >= i4 && i2 < i3) {
            return false;
        }
        if ((i < this.sideQuadSize || i >= this.input.getWidth() - this.sideQuadSize) && i2 < this.sideQuadSize) {
            return false;
        }
        return (i >= this.sideQuadSize || i2 < this.input.getHeight() - this.sideQuadSize) && i >= 0 && i2 >= 0 && i < this.input.getWidth() && i2 < this.input.getHeight() && this.input.get(i, i2) == 1;
    }

    public int getImageSize() {
        return this.imageSize;
    }

    public int getSideSize() {
        return this.sideQuadSize;
    }
}
