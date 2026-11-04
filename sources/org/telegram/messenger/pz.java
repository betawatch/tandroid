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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class pz {
    public d4.d a;
    public final float[] b = new float[8];
    public int c;
    public int d;
    public int e;
    public int f;
    public Drawable g;

    public final Bitmap a(String str, int i3, int i10, HashMap hashMap, Bitmap bitmap, float f10, int i11, int i12) {
        float f11;
        char c2;
        int i13;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        int i14;
        float f12;
        float f13;
        int i15;
        int i16;
        Bitmap bitmap2;
        Paint paint;
        if (str.isEmpty()) {
            throw new IllegalArgumentException("Found empty contents");
        }
        if (i3 < 0 || i10 < 0) {
            throw new IllegalArgumentException("Requested dimensions are too small: " + i3 + 'x' + i10);
        }
        yb.b bVar = yb.b.a;
        dc.b valueOf = hashMap.containsKey(bVar) ? dc.b.valueOf(hashMap.get(bVar).toString()) : dc.b.b;
        yb.b bVar2 = yb.b.c;
        int parseInt = hashMap.containsKey(bVar2) ? Integer.parseInt(hashMap.get(bVar2).toString()) : 4;
        d4.d dVar = (d4.d) fc.b.b(str, valueOf, hashMap).f;
        this.a = dVar;
        if (dVar == null) {
            throw new IllegalStateException();
        }
        int i17 = dVar.b;
        int i18 = dVar.c;
        for (int i19 = 0; i19 < i17 && b(i19, 0); i19++) {
            this.e++;
        }
        int i20 = parseInt * 2;
        int i21 = i17 + i20;
        int i22 = i20 + i18;
        int min = Math.min(Math.max(i3, i21) / i21, Math.max(i10, i22) / i22);
        int i23 = min * i17;
        int i24 = i23 + 32;
        Bitmap createBitmap = (bitmap == null || bitmap.getWidth() != i24) ? Bitmap.createBitmap(i24, i24, Bitmap.Config.ARGB_8888) : bitmap;
        Canvas canvas = new Canvas(createBitmap);
        canvas.drawColor(i11);
        Paint paint2 = new Paint(1);
        paint2.setColor(i12);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        float[] fArr = this.b;
        gradientDrawable.setCornerRadii(fArr);
        float f14 = min;
        int round = Math.round((i23 / 4.65f) / f14);
        this.c = round;
        int i25 = 1;
        if (round % 2 != i17 % 2) {
            this.c = round + 1;
        }
        int i26 = this.c;
        this.d = (i17 - i26) / 2;
        int i27 = (i26 * min) - 24;
        this.f = i27;
        int i28 = (i24 - i27) / 2;
        paint2.setColor(i12);
        float f15 = this.e;
        float f16 = i24;
        boolean z14 = Color.alpha(i11) == 0;
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadii(fArr);
        Path path = new Path();
        RectF rectF = new RectF();
        int i29 = 0;
        while (true) {
            f11 = f14;
            c2 = 3;
            boolean z15 = z14;
            i13 = 16;
            if (i29 >= 3) {
                break;
            }
            if (i29 == 0) {
                f12 = 16;
                f13 = f12;
            } else if (i29 == i25) {
                f13 = 16;
                f12 = (f16 - (f15 * f11)) - f13;
            } else {
                f12 = 16;
                f13 = (f16 - (f15 * f11)) - f12;
            }
            if (z15) {
                i16 = i29;
                bitmap2 = createBitmap;
                float f17 = (f15 - 1.0f) * f11;
                paint = paint2;
                i15 = i28;
                rectF.set(f12 + f11, f13 + f11, f12 + f17, f13 + f17);
                float f18 = ((f15 * f11) / 4.0f) * f10;
                path.reset();
                path.addRoundRect(rectF, f18, f18, Path.Direction.CW);
                path.close();
                canvas.save();
                canvas.clipPath(path, Region.Op.DIFFERENCE);
            } else {
                i15 = i28;
                i16 = i29;
                bitmap2 = createBitmap;
                paint = paint2;
            }
            float f19 = f15 * f11;
            Arrays.fill(fArr, (f19 / 3.0f) * f10);
            gradientDrawable.setColor(i12);
            Path path2 = path;
            gradientDrawable.setBounds((int) f12, (int) f13, (int) (f12 + f19), (int) (f13 + f19));
            gradientDrawable.draw(canvas);
            float f20 = f12 + f11;
            GradientDrawable gradientDrawable2 = gradientDrawable;
            float f21 = f13 + f11;
            float f22 = (f15 - 1.0f) * f11;
            float f23 = f12 + f22;
            float f24 = f13 + f22;
            canvas.drawRect(f20, f21, f23, f24, paint);
            if (z15) {
                canvas.restore();
            }
            if (!z15) {
                Arrays.fill(fArr, (f19 / 4.0f) * f10);
                gradientDrawable2.setColor(i11);
                gradientDrawable2.setBounds((int) f20, (int) f21, (int) f23, (int) f24);
                gradientDrawable2.draw(canvas);
            }
            float f25 = (f15 - 2.0f) * f11;
            Arrays.fill(fArr, (f25 / 4.0f) * f10);
            gradientDrawable2.setColor(i12);
            float f26 = f11 * 2.0f;
            gradientDrawable2.setBounds((int) (f12 + f26), (int) (f26 + f13), (int) (f12 + f25), (int) (f13 + f25));
            gradientDrawable2.draw(canvas);
            i29 = i16 + 1;
            f14 = f11;
            z14 = z15;
            gradientDrawable = gradientDrawable2;
            paint2 = paint;
            createBitmap = bitmap2;
            i28 = i15;
            path = path2;
            i25 = 1;
        }
        int i30 = i28;
        Bitmap bitmap3 = createBitmap;
        Paint paint3 = paint2;
        GradientDrawable gradientDrawable3 = gradientDrawable;
        boolean z16 = Color.alpha(i11) == 0;
        float f27 = (f11 / 2.0f) * f10;
        int i31 = 16;
        int i32 = 0;
        while (i32 < i18) {
            int i33 = i13;
            int i34 = 0;
            while (i34 < i17) {
                char c10 = c2;
                if (b(i34, i32)) {
                    Arrays.fill(fArr, f27);
                    if (b(i34, i32 - 1)) {
                        fArr[1] = 0.0f;
                        fArr[0] = 0.0f;
                        fArr[c10] = 0.0f;
                        fArr[2] = 0.0f;
                    }
                    if (b(i34, i32 + 1)) {
                        fArr[7] = 0.0f;
                        fArr[6] = 0.0f;
                        fArr[5] = 0.0f;
                        fArr[4] = 0.0f;
                    }
                    if (b(i34 - 1, i32)) {
                        fArr[1] = 0.0f;
                        fArr[0] = 0.0f;
                        fArr[7] = 0.0f;
                        fArr[6] = 0.0f;
                    }
                    if (b(i34 + 1, i32)) {
                        fArr[c10] = 0.0f;
                        fArr[2] = 0.0f;
                        fArr[5] = 0.0f;
                        fArr[4] = 0.0f;
                    }
                    gradientDrawable3.setColor(i12);
                    gradientDrawable3.setBounds(i33, i31, i33 + min, i31 + min);
                    gradientDrawable3.draw(canvas);
                    z12 = z16;
                    i14 = i18;
                } else {
                    Arrays.fill(fArr, 0.0f);
                    int i35 = i34 - 1;
                    int i36 = i32 - 1;
                    if (b(i35, i36) && b(i35, i32) && b(i34, i36)) {
                        z10 = true;
                        fArr[1] = f27;
                        fArr[0] = f27;
                        z11 = true;
                    } else {
                        z10 = true;
                        z11 = false;
                    }
                    z12 = z16;
                    int i37 = i34 + 1;
                    if (b(i37, i36) && b(i37, i32) && b(i34, i36)) {
                        fArr[c10] = f27;
                        fArr[2] = f27;
                        z11 = z10;
                    }
                    int i38 = i32 + 1;
                    if (b(i35, i38) && b(i35, i32) && b(i34, i38)) {
                        fArr[7] = f27;
                        fArr[6] = f27;
                        z13 = z10;
                    } else {
                        z13 = z11;
                    }
                    if (b(i37, i38) && b(i37, i32) && b(i34, i38)) {
                        fArr[5] = f27;
                        fArr[4] = f27;
                        z13 = z10;
                    }
                    if (!z13 || z12) {
                        i14 = i18;
                    } else {
                        int i39 = i33 + min;
                        int i40 = i31 + min;
                        i14 = i18;
                        canvas.drawRect(i33, i31, i39, i40, paint3);
                        gradientDrawable3.setColor(i11);
                        gradientDrawable3.setBounds(i33, i31, i39, i40);
                        gradientDrawable3.draw(canvas);
                    }
                }
                i34++;
                i33 += min;
                i18 = i14;
                c2 = c10;
                z16 = z12;
            }
            i32++;
            i31 += min;
            i13 = 16;
        }
        Drawable drawable = this.g;
        if (drawable != null) {
            int i41 = i30 + this.f;
            drawable.setBounds(i30, i30, i41, i41);
            this.g.draw(canvas);
        } else {
            String y22 = g0.y2(null, R.raw.qr_logo);
            int i42 = this.f;
            Bitmap e10 = kz.e(i42, i42, y22);
            float f28 = i30;
            canvas.drawBitmap(e10, f28, f28, (Paint) null);
            e10.recycle();
        }
        canvas.setBitmap(null);
        return bitmap3;
    }

    public final boolean b(int i3, int i10) {
        int i11 = this.d;
        if (i3 >= i11) {
            int i12 = this.c;
            if (i3 < i11 + i12 && i10 >= i11 && i10 < i11 + i12) {
                return false;
            }
        }
        int i13 = this.e;
        if ((i3 < i13 || i3 >= this.a.b - i13) && i10 < i13) {
            return false;
        }
        if ((i3 >= i13 || i10 < this.a.c - i13) && i3 >= 0 && i10 >= 0) {
            d4.d dVar = this.a;
            if (i3 < dVar.b && i10 < dVar.c && dVar.e(i3, i10) == 1) {
                return true;
            }
        }
        return false;
    }
}
