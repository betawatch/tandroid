package org.telegram.messenger;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import java.util.Arrays;
import java.util.Map;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class TelegramQRCodeWriter {
    private static final int QUIET_ZONE_SIZE = 4;
    private Drawable centerDrawable;
    private int imageBlockX;
    private int imageBloks;
    private int imageSize;
    private lc.b input;
    private int sideQuadSize;
    private float[] radii = new float[8];
    public boolean includeSideQuads = true;

    public static void drawSideQuads(Canvas canvas, float f7, float f10, Paint paint, float f11, float f12, int i10, float f13, float f14, float[] fArr, boolean z10) {
        float f15;
        float f16;
        Path path = new Path();
        for (int i11 = 0; i11 < 3; i11++) {
            if (i11 == 0) {
                f15 = i10;
                f16 = f15;
            } else if (i11 == 1) {
                f16 = i10;
                f15 = (f13 - (f11 * f12)) - f16;
            } else {
                f15 = i10;
                f16 = (f13 - (f11 * f12)) - f15;
            }
            float f17 = f15 + f7;
            float f18 = f16 + f10;
            if (z10) {
                RectF rectF = AndroidUtilities.rectTmp;
                float f19 = (f11 - 1.0f) * f12;
                rectF.set(f17 + f12, f18 + f12, f17 + f19, f19 + f18);
                float f20 = ((f11 * f12) / 4.0f) * f14;
                path.reset();
                path.addRoundRect(rectF, f20, f20, Path.Direction.CW);
                path.close();
                canvas.save();
                canvas.clipPath(path, Region.Op.DIFFERENCE);
            }
            float f21 = f11 * f12;
            float f22 = (f21 / 3.0f) * f14;
            RectF rectF2 = AndroidUtilities.rectTmp;
            rectF2.set(f17, f18, f17 + f21, f21 + f18);
            canvas.drawRoundRect(rectF2, f22, f22, paint);
            if (z10) {
                canvas.restore();
            }
            float f23 = (f11 - 2.0f) * f12;
            float f24 = (f23 / 4.0f) * f14;
            float f25 = 2.0f * f12;
            rectF2.set(f17 + f25, f25 + f18, f17 + f23, f18 + f23);
            canvas.drawRoundRect(rectF2, f24, f24, paint);
        }
    }

    public static void drawSideQuadsGradient(Canvas canvas, Paint paint, GradientDrawable gradientDrawable, float f7, float f10, int i10, float f11, float f12, float[] fArr, int i11, int i12) {
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        boolean z10 = Color.alpha(i11) == 0;
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadii(fArr);
        Path path = new Path();
        RectF rectF = new RectF();
        for (int i13 = 0; i13 < 3; i13++) {
            if (i13 == 0) {
                f16 = i10;
                f15 = f16;
            } else {
                if (i13 == 1) {
                    f14 = i10;
                    f13 = (f11 - (f7 * f10)) - f14;
                } else {
                    f13 = i10;
                    f14 = (f11 - (f7 * f10)) - f13;
                }
                f15 = f13;
                f16 = f14;
            }
            if (z10) {
                float f18 = (f7 - 1.0f) * f10;
                f17 = 1.0f;
                rectF.set(f15 + f10, f16 + f10, f15 + f18, f18 + f16);
                float f19 = ((f7 * f10) / 4.0f) * f12;
                path.reset();
                path.addRoundRect(rectF, f19, f19, Path.Direction.CW);
                path.close();
                canvas.save();
                canvas.clipPath(path, Region.Op.DIFFERENCE);
            } else {
                f17 = 1.0f;
            }
            float f20 = f7 * f10;
            Arrays.fill(fArr, (f20 / 3.0f) * f12);
            gradientDrawable.setColor(i12);
            gradientDrawable.setBounds((int) f15, (int) f16, (int) (f15 + f20), (int) (f16 + f20));
            gradientDrawable.draw(canvas);
            float f21 = f16;
            float f22 = f15 + f10;
            float f23 = f21 + f10;
            float f24 = (f7 - f17) * f10;
            float f25 = f15 + f24;
            float f26 = f24 + f21;
            canvas.drawRect(f22, f23, f25, f26, paint);
            if (z10) {
                canvas.restore();
            }
            if (!z10) {
                Arrays.fill(fArr, (f20 / 4.0f) * f12);
                gradientDrawable.setColor(i11);
                gradientDrawable.setBounds((int) f22, (int) f23, (int) f25, (int) f26);
                gradientDrawable.draw(canvas);
            }
            float f27 = (f7 - 2.0f) * f10;
            Arrays.fill(fArr, (f27 / 4.0f) * f12);
            gradientDrawable.setColor(i12);
            float f28 = 2.0f * f10;
            gradientDrawable.setBounds((int) (f15 + f28), (int) (f21 + f28), (int) (f15 + f27), (int) (f21 + f27));
            gradientDrawable.draw(canvas);
        }
    }

    private boolean has(int i10, int i11) {
        int i12 = this.imageBlockX;
        if (i10 >= i12) {
            int i13 = this.imageBloks;
            if (i10 < i12 + i13 && i11 >= i12 && i11 < i12 + i13) {
                return false;
            }
        }
        int i14 = this.sideQuadSize;
        if ((i10 < i14 || i10 >= this.input.b - i14) && i11 < i14) {
            return false;
        }
        if ((i10 >= i14 || i11 < this.input.c - i14) && i10 >= 0 && i11 >= 0) {
            lc.b bVar = this.input;
            if (i10 < bVar.b && i11 < bVar.c && bVar.a(i10, i11) == 1) {
                return true;
            }
        }
        return false;
    }

    public Bitmap encode(String str, int i10, int i11, Map<ec.b, ?> map, Bitmap bitmap) {
        return encode(str, i10, i11, map, bitmap, 1.0f, -1, -16777216);
    }

    public int getImageSize() {
        return this.imageSize;
    }

    public int getSideSize() {
        return this.sideQuadSize;
    }

    public void setCenterDrawable(Drawable drawable) {
        this.centerDrawable = drawable;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:108:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Bitmap encode(String str, int i10, int i11, Map<ec.b, ?> map, Bitmap bitmap, float f7, int i12, int i13) {
        String str2;
        int i14;
        lc.b bVar;
        int i15;
        int i16;
        Paint paint;
        GradientDrawable gradientDrawable;
        Bitmap bitmap2;
        Canvas canvas;
        int i17;
        int i18;
        int i19;
        int i20;
        Canvas canvas2;
        Paint paint2;
        if (str.isEmpty()) {
            throw new IllegalArgumentException("Found empty contents");
        }
        if (i10 < 0 || i11 < 0) {
            throw new IllegalArgumentException("Requested dimensions are too small: " + i10 + 'x' + i11);
        }
        jc.c cVar = jc.c.b;
        if (map != null) {
            ec.b bVar2 = ec.b.a;
            if (map.containsKey(bVar2)) {
                cVar = jc.c.valueOf(map.get(bVar2).toString());
            }
            ec.b bVar3 = ec.b.c;
            if (map.containsKey(bVar3)) {
                i14 = Integer.parseInt(map.get(bVar3).toString());
                str2 = str;
                bVar = (lc.b) lc.c.b(str2, cVar, map).f;
                this.input = bVar;
                if (bVar != null) {
                    throw new IllegalStateException();
                }
                int i21 = bVar.b;
                int i22 = bVar.c;
                int i23 = 0;
                for (int i24 = 0; i24 < i21 && has(i24, 0); i24++) {
                    this.sideQuadSize++;
                }
                int i25 = i14 * 2;
                int i26 = i21 + i25;
                int i27 = i25 + i22;
                int min = Math.min(Math.max(i10, i26) / i26, Math.max(i11, i27) / i27);
                int i28 = min * i21;
                int i29 = i28 + 32;
                Bitmap createBitmap = (bitmap == null || bitmap.getWidth() != i29) ? Bitmap.createBitmap(i29, i29, Bitmap.Config.ARGB_8888) : bitmap;
                Canvas canvas3 = new Canvas(createBitmap);
                canvas3.drawColor(i12);
                Paint paint3 = new Paint(1);
                paint3.setColor(i13);
                GradientDrawable gradientDrawable2 = new GradientDrawable();
                gradientDrawable2.setShape(0);
                gradientDrawable2.setCornerRadii(this.radii);
                Bitmap bitmap3 = createBitmap;
                float f10 = min;
                int round = Math.round((i28 / 4.65f) / f10);
                this.imageBloks = round;
                if (round % 2 != i21 % 2) {
                    this.imageBloks = round + 1;
                }
                int i30 = this.imageBloks;
                this.imageBlockX = (i21 - i30) / 2;
                int i31 = (i30 * min) - 24;
                this.imageSize = i31;
                int i32 = (i29 - i31) / 2;
                Canvas canvas4 = canvas3;
                int i33 = 16;
                if (this.includeSideQuads) {
                    paint3.setColor(i13);
                    i16 = min;
                    bitmap2 = bitmap3;
                    i15 = 1;
                    paint = paint3;
                    gradientDrawable = gradientDrawable2;
                    drawSideQuadsGradient(canvas4, paint, gradientDrawable, this.sideQuadSize, f10, 16, i29, f7, this.radii, i12, i13);
                } else {
                    i15 = 1;
                    i16 = min;
                    paint = paint3;
                    gradientDrawable = gradientDrawable2;
                    bitmap2 = bitmap3;
                }
                int i34 = Color.alpha(i12) == 0 ? i15 : 0;
                float f11 = (f10 / 2.0f) * f7;
                int i35 = 16;
                int i36 = 0;
                while (i36 < i22) {
                    int i37 = i33;
                    int i38 = i23;
                    while (i38 < i21) {
                        int i39 = i23;
                        if (has(i38, i36)) {
                            Arrays.fill(this.radii, f11);
                            if (has(i38, i36 - 1)) {
                                float[] fArr = this.radii;
                                fArr[i15] = 0.0f;
                                fArr[i39] = 0.0f;
                                fArr[3] = 0.0f;
                                fArr[2] = 0.0f;
                            }
                            if (has(i38, i36 + 1)) {
                                float[] fArr2 = this.radii;
                                fArr2[7] = 0.0f;
                                fArr2[6] = 0.0f;
                                fArr2[5] = 0.0f;
                                fArr2[4] = 0.0f;
                            }
                            if (has(i38 - 1, i36)) {
                                float[] fArr3 = this.radii;
                                fArr3[i15] = 0.0f;
                                fArr3[i39] = 0.0f;
                                fArr3[7] = 0.0f;
                                fArr3[6] = 0.0f;
                            }
                            if (has(i38 + 1, i36)) {
                                float[] fArr4 = this.radii;
                                fArr4[3] = 0.0f;
                                fArr4[2] = 0.0f;
                                fArr4[5] = 0.0f;
                                fArr4[4] = 0.0f;
                            }
                            gradientDrawable.setColor(i13);
                            gradientDrawable.setBounds(i37, i35, i37 + i16, i35 + i16);
                            gradientDrawable.draw(canvas4);
                            paint2 = paint;
                            canvas2 = canvas4;
                            i19 = i34;
                        } else {
                            Paint paint4 = paint;
                            Arrays.fill(this.radii, 0.0f);
                            int i40 = i38 - 1;
                            int i41 = i36 - 1;
                            if (has(i40, i41) && has(i40, i36) && has(i38, i41)) {
                                canvas = canvas4;
                                float[] fArr5 = this.radii;
                                fArr5[i15] = f11;
                                fArr5[i39] = f11;
                                i17 = i15;
                            } else {
                                canvas = canvas4;
                                i17 = i39;
                            }
                            int i42 = i17;
                            int i43 = i38 + 1;
                            if (has(i43, i41) && has(i43, i36) && has(i38, i41)) {
                                float[] fArr6 = this.radii;
                                fArr6[3] = f11;
                                fArr6[2] = f11;
                                i18 = i15;
                            } else {
                                i18 = i42;
                            }
                            i19 = i34;
                            int i44 = i36 + 1;
                            if (has(i40, i44) && has(i40, i36) && has(i38, i44)) {
                                float[] fArr7 = this.radii;
                                fArr7[7] = f11;
                                fArr7[6] = f11;
                                i18 = i15;
                            }
                            if (has(i43, i44) && has(i43, i36) && has(i38, i44)) {
                                float[] fArr8 = this.radii;
                                fArr8[5] = f11;
                                fArr8[4] = f11;
                                i20 = i15;
                            } else {
                                i20 = i18;
                            }
                            if (i20 == 0 || i19 != 0) {
                                canvas2 = canvas;
                                paint2 = paint4;
                            } else {
                                int i45 = i37 + i16;
                                int i46 = i35 + i16;
                                canvas.drawRect(i37, i35, i45, i46, paint4);
                                canvas2 = canvas;
                                paint2 = paint4;
                                gradientDrawable.setColor(i12);
                                gradientDrawable.setBounds(i37, i35, i45, i46);
                                gradientDrawable.draw(canvas2);
                            }
                        }
                        i38++;
                        i37 += i16;
                        canvas4 = canvas2;
                        paint = paint2;
                        i34 = i19;
                        i23 = i39;
                    }
                    i36++;
                    i35 += i16;
                    paint = paint;
                    i23 = i23;
                    i33 = 16;
                }
                Canvas canvas5 = canvas4;
                boolean z10 = i23;
                Drawable drawable = this.centerDrawable;
                if (drawable != null) {
                    int i47 = this.imageSize;
                    drawable.setBounds(i32, i32, i32 + i47, i47 + i32);
                    this.centerDrawable.draw(canvas5);
                } else {
                    String readRes = AndroidUtilities.readRes(R.raw.qr_logo);
                    int i48 = this.imageSize;
                    Bitmap bitmap4 = SvgHelper.getBitmap(readRes, i48, i48, z10);
                    float f12 = i32;
                    canvas5.drawBitmap(bitmap4, f12, f12, (Paint) null);
                    bitmap4.recycle();
                }
                canvas5.setBitmap(null);
                return bitmap2;
            }
        }
        str2 = str;
        i14 = 4;
        bVar = (lc.b) lc.c.b(str2, cVar, map).f;
        this.input = bVar;
        if (bVar != null) {
        }
    }
}
