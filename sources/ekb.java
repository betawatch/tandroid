// default package

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.GradientDrawable;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.HashMap;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class ekb {
    public int a;
    public int b;
    public float[] c;
    public int d;
    public int e;
    public Object f;
    public Object g;

    public ekb(byte b) {
        switch (b) {
            case 1:
                this.a = -1;
                this.b = 1;
                this.f = new float[jn7.J1];
                this.g = new byte[TLObject.FLAG_12];
                break;
            default:
                this.c = new float[8];
                break;
        }
    }

    public final Bitmap a(String str, int i, int i2, HashMap hashMap, Bitmap bitmap, float f, int i3, int i4) {
        char c;
        Bitmap bitmap2;
        char c2;
        boolean z;
        boolean z2;
        int i5;
        boolean z3;
        int i6;
        float f2;
        int i7;
        float f3;
        int i8;
        float f4;
        Bitmap bitmap3;
        Paint paint;
        int i9 = i4;
        float[] fArr = this.c;
        if (str.isEmpty()) {
            lq5.j("Found empty contents");
            return null;
        }
        if (i < 0 || i2 < 0) {
            throw new IllegalArgumentException("Requested dimensions are too small: " + i + 'x' + i2);
        }
        i34 i34Var = i34.a;
        r44 valueOf = hashMap.containsKey(i34Var) ? r44.valueOf(hashMap.get(i34Var).toString()) : r44.b;
        i34 i34Var2 = i34.c;
        int parseInt = hashMap.containsKey(i34Var2) ? Integer.parseInt(hashMap.get(i34Var2).toString()) : 4;
        sj0 sj0Var = (sj0) k34.b(str, valueOf, hashMap).f;
        this.f = sj0Var;
        if (sj0Var == null) {
            grb.g();
            return null;
        }
        int i10 = sj0Var.b;
        int i11 = sj0Var.c;
        for (int i12 = 0; i12 < i10 && b(i12, 0); i12++) {
            this.d++;
        }
        int i13 = parseInt << 1;
        int i14 = i10 + i13;
        int i15 = i13 + i11;
        int min = Math.min(Math.max(i, i14) / i14, Math.max(i2, i15) / i15);
        int i16 = min * i10;
        int i17 = i16 + 32;
        Bitmap createBitmap = (bitmap == null || bitmap.getWidth() != i17) ? Bitmap.createBitmap(i17, i17, Bitmap.Config.ARGB_8888) : bitmap;
        Canvas canvas = new Canvas(createBitmap);
        canvas.drawColor(i3);
        Paint paint2 = new Paint(1);
        paint2.setColor(i9);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadii(fArr);
        float f5 = min;
        int round = Math.round((i16 / 4.65f) / f5);
        this.a = round;
        if (round % 2 != i10 % 2) {
            round++;
            this.a = round;
        }
        this.b = (i10 - round) / 2;
        int i18 = (round * min) - 24;
        this.e = i18;
        int i19 = (i17 - i18) / 2;
        paint2.setColor(i9);
        float f6 = this.d;
        float f7 = i17;
        boolean z4 = Color.alpha(i3) == 0;
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadii(fArr);
        Path path = new Path();
        RectF rectF = new RectF();
        int i20 = 0;
        while (true) {
            float f8 = f7;
            c = 3;
            if (i20 >= 3) {
                break;
            }
            if (i20 == 0) {
                i7 = i20;
                f3 = 16.0f;
                f2 = 16.0f;
            } else if (i20 == 1) {
                f2 = (f8 - (f6 * f5)) - 16.0f;
                int i21 = i20;
                f3 = 16.0f;
                i7 = i21;
            } else {
                f2 = 16.0f;
                i7 = i20;
                f3 = (f8 - (f6 * f5)) - 16.0f;
            }
            if (z4) {
                f4 = f6;
                bitmap3 = createBitmap;
                float f9 = (f4 - 1.0f) * f5;
                paint = paint2;
                i8 = i19;
                rectF.set(f2 + f5, f3 + f5, f2 + f9, f3 + f9);
                float f10 = ((f4 * f5) / 4.0f) * f;
                path.reset();
                path.addRoundRect(rectF, f10, f10, Path.Direction.CW);
                path.close();
                canvas.save();
                canvas.clipPath(path, Region.Op.DIFFERENCE);
            } else {
                i8 = i19;
                f4 = f6;
                bitmap3 = createBitmap;
                paint = paint2;
            }
            float f11 = f4 * f5;
            Arrays.fill(fArr, (f11 / 3.0f) * f);
            gradientDrawable.setColor(i9);
            RectF rectF2 = rectF;
            gradientDrawable.setBounds((int) f2, (int) f3, (int) (f2 + f11), (int) (f3 + f11));
            gradientDrawable.draw(canvas);
            float f12 = f2 + f5;
            float f13 = f3 + f5;
            float f14 = (f4 - 1.0f) * f5;
            float f15 = f2 + f14;
            float f16 = f3 + f14;
            canvas.drawRect(f12, f13, f15, f16, paint);
            if (z4) {
                canvas.restore();
            } else {
                Arrays.fill(fArr, (f11 / 4.0f) * f);
                gradientDrawable.setColor(i3);
                gradientDrawable.setBounds((int) f12, (int) f13, (int) f15, (int) f16);
                gradientDrawable.draw(canvas);
            }
            float f17 = (f4 - 2.0f) * f5;
            Arrays.fill(fArr, (f17 / 4.0f) * f);
            gradientDrawable.setColor(i9);
            float f18 = f5 * 2.0f;
            gradientDrawable.setBounds((int) (f2 + f18), (int) (f18 + f3), (int) (f2 + f17), (int) (f3 + f17));
            gradientDrawable.draw(canvas);
            i20 = i7 + 1;
            f7 = f8;
            f6 = f4;
            rectF = rectF2;
            paint2 = paint;
            createBitmap = bitmap3;
            i19 = i8;
        }
        int i22 = i19;
        Bitmap bitmap4 = createBitmap;
        Paint paint3 = paint2;
        boolean z5 = Color.alpha(i3) == 0;
        float f19 = (f5 / 2.0f) * f;
        int i23 = 0;
        int i24 = 16;
        while (i23 < i11) {
            int i25 = 0;
            int i26 = 16;
            while (i25 < i10) {
                if (b(i25, i23)) {
                    Arrays.fill(fArr, f19);
                    c2 = c;
                    if (b(i25, i23 - 1)) {
                        fArr[1] = 0.0f;
                        fArr[0] = 0.0f;
                        fArr[c2] = 0.0f;
                        fArr[2] = 0.0f;
                    }
                    if (b(i25, i23 + 1)) {
                        fArr[7] = 0.0f;
                        fArr[6] = 0.0f;
                        fArr[5] = 0.0f;
                        fArr[4] = 0.0f;
                    }
                    if (b(i25 - 1, i23)) {
                        fArr[1] = 0.0f;
                        fArr[0] = 0.0f;
                        fArr[7] = 0.0f;
                        fArr[6] = 0.0f;
                    }
                    if (b(i25 + 1, i23)) {
                        fArr[c2] = 0.0f;
                        fArr[2] = 0.0f;
                        fArr[5] = 0.0f;
                        fArr[4] = 0.0f;
                    }
                    gradientDrawable.setColor(i9);
                    gradientDrawable.setBounds(i26, i24, i26 + min, i24 + min);
                    gradientDrawable.draw(canvas);
                    i6 = i23;
                    i5 = i11;
                } else {
                    c2 = c;
                    Arrays.fill(fArr, 0.0f);
                    int i27 = i25 - 1;
                    int i28 = i23 - 1;
                    if (b(i27, i28) && b(i27, i23) && b(i25, i28)) {
                        z = true;
                        fArr[1] = f19;
                        fArr[0] = f19;
                        z2 = true;
                    } else {
                        z = true;
                        z2 = false;
                    }
                    i5 = i11;
                    int i29 = i25 + 1;
                    if (b(i29, i28) && b(i29, i23) && b(i25, i28)) {
                        fArr[c2] = f19;
                        fArr[2] = f19;
                        z3 = z;
                    } else {
                        z3 = z2;
                    }
                    int i30 = i23 + 1;
                    if (b(i27, i30) && b(i27, i23) && b(i25, i30)) {
                        fArr[7] = f19;
                        fArr[6] = f19;
                        z3 = z;
                    }
                    if (b(i29, i30) && b(i29, i23) && b(i25, i30)) {
                        fArr[5] = f19;
                        fArr[4] = f19;
                        z3 = z;
                    }
                    if (!z3 || z5) {
                        i6 = i23;
                    } else {
                        int i31 = i26 + min;
                        int i32 = i24 + min;
                        i6 = i23;
                        canvas.drawRect(i26, i24, i31, i32, paint3);
                        gradientDrawable.setColor(i3);
                        gradientDrawable.setBounds(i26, i24, i31, i32);
                        gradientDrawable.draw(canvas);
                    }
                }
                i25++;
                i26 += min;
                i9 = i4;
                c = c2;
                i23 = i6;
                i11 = i5;
            }
            i23++;
            i24 += min;
            i9 = i4;
        }
        ColorDrawable colorDrawable = (ColorDrawable) this.g;
        if (colorDrawable != null) {
            int i33 = i22 + this.e;
            colorDrawable.setBounds(i22, i22, i33, i33);
            ((ColorDrawable) this.g).draw(canvas);
            bitmap2 = null;
        } else {
            bitmap2 = null;
            String v2 = hl.v2(null, R.raw.qr_logo);
            int i34 = this.e;
            Bitmap e = hgb.e(i34, i34, v2);
            float f20 = i22;
            canvas.drawBitmap(e, f20, f20, (Paint) null);
            e.recycle();
        }
        canvas.setBitmap(bitmap2);
        return bitmap4;
    }

    public final boolean b(int i, int i2) {
        int i3 = this.b;
        if (i >= i3) {
            int i4 = this.a;
            if (i < i3 + i4 && i2 >= i3 && i2 < i3 + i4) {
                return false;
            }
        }
        int i5 = this.d;
        if ((i < i5 || i >= ((sj0) this.f).b - i5) && i2 < i5) {
            return false;
        }
        if ((i >= i5 || i2 < ((sj0) this.f).c - i5) && i >= 0 && i2 >= 0) {
            sj0 sj0Var = (sj0) this.f;
            if (i < sj0Var.b && i2 < sj0Var.c && sj0Var.e(i, i2) == 1) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x011e, code lost:
    
        if (r5 < (-32768)) goto L44;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int c(ByteBuffer byteBuffer, int i, int i2) {
        float[] fArr = (float[]) this.f;
        double d = 0.0d;
        if (i2 != this.a) {
            this.a = i2;
            if (i2 <= 0 || i2 % oc1.AUDIO_CONTENT_SAMPLING_RATE != 0) {
                this.b = 0;
            } else {
                this.b = i2 / oc1.AUDIO_CONTENT_SAMPLING_RATE;
                this.d = 0;
                this.e = 0;
                Arrays.fill(fArr, 0.0f);
                if (this.b != 1) {
                    this.c = new float[63];
                    double d2 = 7200.0d / i2;
                    double d3 = 0.0d;
                    for (int i3 = 0; i3 < 63; i3++) {
                        double d4 = i3;
                        double d5 = d4 - 31.0d;
                        float cos = (float) (((Math.cos((d4 * 12.566370614359172d) / 62.0d) * 0.08d) + (0.42d - (Math.cos((6.283185307179586d * d4) / 62.0d) * 0.5d))) * (d5 == 0.0d ? 2.0d * d2 : Math.sin((d2 * 6.283185307179586d) * d5) / (d5 * 3.141592653589793d)));
                        this.c[i3] = cos;
                        d3 += cos;
                    }
                    for (int i4 = 0; i4 < 63; i4++) {
                        float[] fArr2 = this.c;
                        fArr2[i4] = fArr2[i4] / ((float) d3);
                    }
                }
            }
        }
        int i5 = this.b;
        if (i5 <= 0) {
            return 0;
        }
        int i6 = i / 2;
        int i7 = ((i6 / i5) + 2) << 1;
        if (((byte[]) this.g).length < i7) {
            this.g = new byte[i7];
        }
        int i8 = 0;
        int i9 = 0;
        while (i8 < i6) {
            int i10 = i8 << 1;
            short s = (short) ((byteBuffer.get(i10) & 255) | (byteBuffer.get(i10 + 1) << 8));
            int i11 = this.b;
            if (i11 == 1) {
                byte[] bArr = (byte[]) this.g;
                int i12 = i9 + 1;
                bArr[i9] = (byte) s;
                i9 += 2;
                bArr[i12] = (byte) (s >> 8);
            } else {
                float f = s;
                int i13 = this.d;
                fArr[i13] = f;
                fArr[i13 + 63] = f;
                int i14 = i13 + 1;
                this.d = i14;
                if (i14 == 63) {
                    this.d = 0;
                }
                int i15 = this.e + 1;
                this.e = i15;
                if (i15 >= i11) {
                    this.e = 0;
                    float[] fArr3 = this.c;
                    double d6 = d;
                    for (int i16 = 0; i16 < 63; i16++) {
                        d6 += fArr3[i16] * fArr[this.d + i16];
                    }
                    int round = (int) Math.round(d6);
                    int i17 = round <= 32767 ? -32768 : 32767;
                    round = i17;
                    byte[] bArr2 = (byte[]) this.g;
                    int i18 = i9 + 1;
                    bArr2[i9] = (byte) round;
                    i9 += 2;
                    bArr2[i18] = (byte) (round >> 8);
                }
            }
            i8++;
            d = 0.0d;
        }
        return i9;
    }
}
