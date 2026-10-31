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
import java.util.HashMap;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class i00 {
    public b4.d a;
    public final float[] b = new float[8];
    public int c;
    public int d;
    public int e;
    public int f;
    public Drawable g;

    public final Bitmap a(String str, int i10, int i11, HashMap hashMap, Bitmap bitmap, float f7, int i12, int i13) {
        float f10;
        char c10;
        int i14;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        int i15;
        float f11;
        float f12;
        int i16;
        int i17;
        Bitmap bitmap2;
        Paint paint;
        if (str.isEmpty()) {
            throw new IllegalArgumentException("Found empty contents");
        }
        if (i10 < 0 || i11 < 0) {
            throw new IllegalArgumentException("Requested dimensions are too small: " + i10 + 'x' + i11);
        }
        vb.b bVar = vb.b.a;
        ac.d valueOf = hashMap.containsKey(bVar) ? ac.d.valueOf(hashMap.get(bVar).toString()) : ac.d.b;
        vb.b bVar2 = vb.b.c;
        int parseInt = hashMap.containsKey(bVar2) ? Integer.parseInt(hashMap.get(bVar2).toString()) : 4;
        b4.d dVar = (b4.d) cc.b.b(str, valueOf, hashMap).f;
        this.a = dVar;
        if (dVar == null) {
            throw new IllegalStateException();
        }
        int i18 = dVar.b;
        int i19 = dVar.c;
        for (int i20 = 0; i20 < i18 && b(i20, 0); i20++) {
            this.e++;
        }
        int i21 = parseInt * 2;
        int i22 = i18 + i21;
        int i23 = i21 + i19;
        int min = Math.min(Math.max(i10, i22) / i22, Math.max(i11, i23) / i23);
        int i24 = min * i18;
        int i25 = i24 + 32;
        Bitmap createBitmap = (bitmap == null || bitmap.getWidth() != i25) ? Bitmap.createBitmap(i25, i25, Bitmap.Config.ARGB_8888) : bitmap;
        Canvas canvas = new Canvas(createBitmap);
        canvas.drawColor(i12);
        Paint paint2 = new Paint(1);
        paint2.setColor(i13);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        float[] fArr = this.b;
        gradientDrawable.setCornerRadii(fArr);
        float f13 = min;
        int round = Math.round((i24 / 4.65f) / f13);
        this.c = round;
        int i26 = 1;
        if (round % 2 != i18 % 2) {
            this.c = round + 1;
        }
        int i27 = this.c;
        this.d = (i18 - i27) / 2;
        int i28 = (i27 * min) - 24;
        this.f = i28;
        int i29 = (i25 - i28) / 2;
        paint2.setColor(i13);
        float f14 = this.e;
        float f15 = i25;
        boolean z14 = Color.alpha(i12) == 0;
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadii(fArr);
        Path path = new Path();
        RectF rectF = new RectF();
        int i30 = 0;
        while (true) {
            f10 = f13;
            c10 = 3;
            boolean z15 = z14;
            i14 = 16;
            if (i30 >= 3) {
                break;
            }
            if (i30 == 0) {
                f11 = 16;
                f12 = f11;
            } else if (i30 == i26) {
                f12 = 16;
                f11 = (f15 - (f14 * f10)) - f12;
            } else {
                f11 = 16;
                f12 = (f15 - (f14 * f10)) - f11;
            }
            if (z15) {
                i17 = i30;
                bitmap2 = createBitmap;
                float f16 = (f14 - 1.0f) * f10;
                paint = paint2;
                i16 = i29;
                rectF.set(f11 + f10, f12 + f10, f11 + f16, f12 + f16);
                float f17 = ((f14 * f10) / 4.0f) * f7;
                path.reset();
                path.addRoundRect(rectF, f17, f17, Path.Direction.CW);
                path.close();
                canvas.save();
                canvas.clipPath(path, Region.Op.DIFFERENCE);
            } else {
                i16 = i29;
                i17 = i30;
                bitmap2 = createBitmap;
                paint = paint2;
            }
            float f18 = f14 * f10;
            Arrays.fill(fArr, (f18 / 3.0f) * f7);
            gradientDrawable.setColor(i13);
            Path path2 = path;
            gradientDrawable.setBounds((int) f11, (int) f12, (int) (f11 + f18), (int) (f12 + f18));
            gradientDrawable.draw(canvas);
            float f19 = f11 + f10;
            GradientDrawable gradientDrawable2 = gradientDrawable;
            float f20 = f12 + f10;
            float f21 = (f14 - 1.0f) * f10;
            float f22 = f11 + f21;
            float f23 = f12 + f21;
            canvas.drawRect(f19, f20, f22, f23, paint);
            if (z15) {
                canvas.restore();
            }
            if (!z15) {
                Arrays.fill(fArr, (f18 / 4.0f) * f7);
                gradientDrawable2.setColor(i12);
                gradientDrawable2.setBounds((int) f19, (int) f20, (int) f22, (int) f23);
                gradientDrawable2.draw(canvas);
            }
            float f24 = (f14 - 2.0f) * f10;
            Arrays.fill(fArr, (f24 / 4.0f) * f7);
            gradientDrawable2.setColor(i13);
            float f25 = f10 * 2.0f;
            gradientDrawable2.setBounds((int) (f11 + f25), (int) (f25 + f12), (int) (f11 + f24), (int) (f12 + f24));
            gradientDrawable2.draw(canvas);
            i30 = i17 + 1;
            f13 = f10;
            z14 = z15;
            gradientDrawable = gradientDrawable2;
            paint2 = paint;
            createBitmap = bitmap2;
            i29 = i16;
            path = path2;
            i26 = 1;
        }
        int i31 = i29;
        Bitmap bitmap3 = createBitmap;
        Paint paint3 = paint2;
        GradientDrawable gradientDrawable3 = gradientDrawable;
        boolean z16 = Color.alpha(i12) == 0;
        float f26 = (f10 / 2.0f) * f7;
        int i32 = 16;
        int i33 = 0;
        while (i33 < i19) {
            int i34 = i14;
            int i35 = 0;
            while (i35 < i18) {
                char c11 = c10;
                if (b(i35, i33)) {
                    Arrays.fill(fArr, f26);
                    if (b(i35, i33 - 1)) {
                        fArr[1] = 0.0f;
                        fArr[0] = 0.0f;
                        fArr[c11] = 0.0f;
                        fArr[2] = 0.0f;
                    }
                    if (b(i35, i33 + 1)) {
                        fArr[7] = 0.0f;
                        fArr[6] = 0.0f;
                        fArr[5] = 0.0f;
                        fArr[4] = 0.0f;
                    }
                    if (b(i35 - 1, i33)) {
                        fArr[1] = 0.0f;
                        fArr[0] = 0.0f;
                        fArr[7] = 0.0f;
                        fArr[6] = 0.0f;
                    }
                    if (b(i35 + 1, i33)) {
                        fArr[c11] = 0.0f;
                        fArr[2] = 0.0f;
                        fArr[5] = 0.0f;
                        fArr[4] = 0.0f;
                    }
                    gradientDrawable3.setColor(i13);
                    gradientDrawable3.setBounds(i34, i32, i34 + min, i32 + min);
                    gradientDrawable3.draw(canvas);
                    z12 = z16;
                    i15 = i19;
                } else {
                    Arrays.fill(fArr, 0.0f);
                    int i36 = i35 - 1;
                    int i37 = i33 - 1;
                    if (b(i36, i37) && b(i36, i33) && b(i35, i37)) {
                        z10 = true;
                        fArr[1] = f26;
                        fArr[0] = f26;
                        z11 = true;
                    } else {
                        z10 = true;
                        z11 = false;
                    }
                    z12 = z16;
                    int i38 = i35 + 1;
                    if (b(i38, i37) && b(i38, i33) && b(i35, i37)) {
                        fArr[c11] = f26;
                        fArr[2] = f26;
                        z11 = z10;
                    }
                    int i39 = i33 + 1;
                    if (b(i36, i39) && b(i36, i33) && b(i35, i39)) {
                        fArr[7] = f26;
                        fArr[6] = f26;
                        z13 = z10;
                    } else {
                        z13 = z11;
                    }
                    if (b(i38, i39) && b(i38, i33) && b(i35, i39)) {
                        fArr[5] = f26;
                        fArr[4] = f26;
                        z13 = z10;
                    }
                    if (!z13 || z12) {
                        i15 = i19;
                    } else {
                        int i40 = i34 + min;
                        int i41 = i32 + min;
                        i15 = i19;
                        canvas.drawRect(i34, i32, i40, i41, paint3);
                        gradientDrawable3.setColor(i12);
                        gradientDrawable3.setBounds(i34, i32, i40, i41);
                        gradientDrawable3.draw(canvas);
                    }
                }
                i35++;
                i34 += min;
                i19 = i15;
                c10 = c11;
                z16 = z12;
            }
            i33++;
            i32 += min;
            i14 = 16;
        }
        Drawable drawable = this.g;
        if (drawable != null) {
            int i42 = i31 + this.f;
            drawable.setBounds(i31, i31, i42, i42);
            this.g.draw(canvas);
        } else {
            String y22 = i0.y2(null, R.raw.qr_logo);
            int i43 = this.f;
            Bitmap e = d00.e(i43, i43, y22);
            float f27 = i31;
            canvas.drawBitmap(e, f27, f27, (Paint) null);
            e.recycle();
        }
        canvas.setBitmap(null);
        return bitmap3;
    }

    public final boolean b(int i10, int i11) {
        int i12 = this.d;
        if (i10 >= i12) {
            int i13 = this.c;
            if (i10 < i12 + i13 && i11 >= i12 && i11 < i12 + i13) {
                return false;
            }
        }
        int i14 = this.e;
        if ((i10 < i14 || i10 >= this.a.b - i14) && i11 < i14) {
            return false;
        }
        if ((i10 >= i14 || i11 < this.a.c - i14) && i10 >= 0 && i11 >= 0) {
            b4.d dVar = this.a;
            if (i10 < dVar.b && i11 < dVar.c && dVar.e(i10, i11) == 1) {
                return true;
            }
        }
        return false;
    }
}
