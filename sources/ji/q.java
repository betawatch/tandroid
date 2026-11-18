package ji;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.HashMap;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.g0;
import org.telegram.messenger.ks;
import org.telegram.messenger.mz;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public final class q {
    public float[] a;
    public int b;
    public int c;
    public int d;
    public int e;
    public Object f;
    public Object g;

    public q(int i7) {
        switch (i7) {
            case 1:
                this.a = new float[8];
                break;
            default:
                this.b = -1;
                this.c = 1;
                this.f = new float[ks.K1];
                this.g = new byte[TLObject.FLAG_12];
                break;
        }
    }

    public Bitmap a(String str, int i7, int i10, HashMap hashMap, Bitmap bitmap, float f10, int i11, int i12) {
        float f11;
        char c10;
        int i13;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        float f12;
        float f13;
        float f14;
        int i14;
        int i15;
        Bitmap bitmap2;
        Paint paint;
        float[] fArr = this.a;
        if (str.isEmpty()) {
            throw new IllegalArgumentException("Found empty contents");
        }
        if (i7 < 0 || i10 < 0) {
            throw new IllegalArgumentException("Requested dimensions are too small: " + i7 + 'x' + i10);
        }
        bc.b bVar = bc.b.a;
        gc.b valueOf = hashMap.containsKey(bVar) ? gc.b.valueOf(hashMap.get(bVar).toString()) : gc.b.b;
        bc.b bVar2 = bc.b.c;
        int parseInt = hashMap.containsKey(bVar2) ? Integer.parseInt(hashMap.get(bVar2).toString()) : 4;
        cc.c cVar = (cc.c) ic.b.b(str, valueOf, hashMap).f;
        this.f = cVar;
        if (cVar == null) {
            throw new IllegalStateException();
        }
        int i16 = cVar.b;
        int i17 = cVar.c;
        for (int i18 = 0; i18 < i16 && b(i18, 0); i18++) {
            this.d++;
        }
        int i19 = parseInt * 2;
        int i20 = i16 + i19;
        int i21 = i19 + i17;
        int min = Math.min(Math.max(i7, i20) / i20, Math.max(i10, i21) / i21);
        int i22 = min * i16;
        int i23 = i22 + 32;
        Bitmap createBitmap = (bitmap == null || bitmap.getWidth() != i23) ? Bitmap.createBitmap(i23, i23, Bitmap.Config.ARGB_8888) : bitmap;
        Canvas canvas = new Canvas(createBitmap);
        canvas.drawColor(i11);
        Paint paint2 = new Paint(1);
        paint2.setColor(i12);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadii(fArr);
        float f15 = min;
        int round = Math.round((i22 / 4.65f) / f15);
        this.b = round;
        int i24 = 1;
        if (round % 2 != i16 % 2) {
            this.b = round + 1;
        }
        int i25 = this.b;
        this.c = (i16 - i25) / 2;
        int i26 = (i25 * min) - 24;
        this.e = i26;
        int i27 = (i23 - i26) / 2;
        paint2.setColor(i12);
        float f16 = this.d;
        float f17 = i23;
        boolean z14 = Color.alpha(i11) == 0;
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadii(fArr);
        Path path = new Path();
        RectF rectF = new RectF();
        int i28 = 0;
        while (true) {
            f11 = f15;
            c10 = 3;
            boolean z15 = z14;
            i13 = 16;
            if (i28 >= 3) {
                break;
            }
            if (i28 == 0) {
                f13 = 16;
                f14 = f13;
            } else if (i28 == i24) {
                f14 = 16;
                f13 = (f17 - (f16 * f11)) - f14;
            } else {
                f13 = 16;
                f14 = (f17 - (f16 * f11)) - f13;
            }
            if (z15) {
                i15 = i28;
                bitmap2 = createBitmap;
                float f18 = (f16 - 1.0f) * f11;
                paint = paint2;
                i14 = i27;
                rectF.set(f13 + f11, f14 + f11, f13 + f18, f14 + f18);
                float f19 = ((f16 * f11) / 4.0f) * f10;
                path.reset();
                path.addRoundRect(rectF, f19, f19, Path.Direction.CW);
                path.close();
                canvas.save();
                canvas.clipPath(path, Region.Op.DIFFERENCE);
            } else {
                i14 = i27;
                i15 = i28;
                bitmap2 = createBitmap;
                paint = paint2;
            }
            float f20 = f16 * f11;
            Arrays.fill(fArr, (f20 / 3.0f) * f10);
            gradientDrawable.setColor(i12);
            Path path2 = path;
            gradientDrawable.setBounds((int) f13, (int) f14, (int) (f13 + f20), (int) (f14 + f20));
            gradientDrawable.draw(canvas);
            float f21 = f13 + f11;
            float f22 = f14 + f11;
            float f23 = (f16 - 1.0f) * f11;
            float f24 = f13 + f23;
            float f25 = f14 + f23;
            canvas.drawRect(f21, f22, f24, f25, paint);
            if (z15) {
                canvas.restore();
            }
            if (!z15) {
                Arrays.fill(fArr, (f20 / 4.0f) * f10);
                gradientDrawable.setColor(i11);
                gradientDrawable.setBounds((int) f21, (int) f22, (int) f24, (int) f25);
                gradientDrawable.draw(canvas);
            }
            float f26 = (f16 - 2.0f) * f11;
            Arrays.fill(fArr, (f26 / 4.0f) * f10);
            gradientDrawable.setColor(i12);
            float f27 = f11 * 2.0f;
            gradientDrawable.setBounds((int) (f13 + f27), (int) (f27 + f14), (int) (f13 + f26), (int) (f14 + f26));
            gradientDrawable.draw(canvas);
            i28 = i15 + 1;
            f15 = f11;
            z14 = z15;
            paint2 = paint;
            createBitmap = bitmap2;
            i27 = i14;
            path = path2;
            i24 = 1;
        }
        int i29 = i27;
        Bitmap bitmap3 = createBitmap;
        Paint paint3 = paint2;
        boolean z16 = Color.alpha(i11) == 0;
        float f28 = (f11 / 2.0f) * f10;
        int i30 = 16;
        int i31 = 0;
        while (i31 < i17) {
            int i32 = i13;
            int i33 = 0;
            while (i33 < i16) {
                char c11 = c10;
                if (b(i33, i31)) {
                    Arrays.fill(fArr, f28);
                    if (b(i33, i31 - 1)) {
                        fArr[1] = 0.0f;
                        fArr[0] = 0.0f;
                        fArr[c11] = 0.0f;
                        fArr[2] = 0.0f;
                    }
                    if (b(i33, i31 + 1)) {
                        fArr[7] = 0.0f;
                        fArr[6] = 0.0f;
                        fArr[5] = 0.0f;
                        fArr[4] = 0.0f;
                    }
                    if (b(i33 - 1, i31)) {
                        fArr[1] = 0.0f;
                        fArr[0] = 0.0f;
                        fArr[7] = 0.0f;
                        fArr[6] = 0.0f;
                    }
                    if (b(i33 + 1, i31)) {
                        fArr[c11] = 0.0f;
                        fArr[2] = 0.0f;
                        fArr[5] = 0.0f;
                        fArr[4] = 0.0f;
                    }
                    gradientDrawable.setColor(i12);
                    gradientDrawable.setBounds(i32, i30, i32 + min, i30 + min);
                    gradientDrawable.draw(canvas);
                    z12 = z16;
                    f12 = f28;
                } else {
                    Arrays.fill(fArr, 0.0f);
                    int i34 = i33 - 1;
                    int i35 = i31 - 1;
                    if (b(i34, i35) && b(i34, i31) && b(i33, i35)) {
                        z10 = true;
                        fArr[1] = f28;
                        fArr[0] = f28;
                        z11 = true;
                    } else {
                        z10 = true;
                        z11 = false;
                    }
                    z12 = z16;
                    int i36 = i33 + 1;
                    if (b(i36, i35) && b(i36, i31) && b(i33, i35)) {
                        fArr[c11] = f28;
                        fArr[2] = f28;
                        z11 = z10;
                    }
                    int i37 = i31 + 1;
                    if (b(i34, i37) && b(i34, i31) && b(i33, i37)) {
                        fArr[7] = f28;
                        fArr[6] = f28;
                        z13 = z10;
                    } else {
                        z13 = z11;
                    }
                    if (b(i36, i37) && b(i36, i31) && b(i33, i37)) {
                        fArr[5] = f28;
                        fArr[4] = f28;
                        z13 = z10;
                    }
                    if (!z13 || z12) {
                        f12 = f28;
                    } else {
                        int i38 = i32 + min;
                        int i39 = i30 + min;
                        f12 = f28;
                        canvas.drawRect(i32, i30, i38, i39, paint3);
                        gradientDrawable.setColor(i11);
                        gradientDrawable.setBounds(i32, i30, i38, i39);
                        gradientDrawable.draw(canvas);
                    }
                }
                i33++;
                i32 += min;
                f28 = f12;
                c10 = c11;
                z16 = z12;
            }
            i31++;
            i30 += min;
            i13 = 16;
        }
        Drawable drawable = (Drawable) this.g;
        if (drawable != null) {
            int i40 = i29 + this.e;
            drawable.setBounds(i29, i29, i40, i40);
            ((Drawable) this.g).draw(canvas);
        } else {
            String y22 = g0.y2(null, R.raw.qr_logo);
            int i41 = this.e;
            Bitmap e10 = mz.e(i41, i41, y22);
            float f29 = i29;
            canvas.drawBitmap(e10, f29, f29, (Paint) null);
            e10.recycle();
        }
        canvas.setBitmap(null);
        return bitmap3;
    }

    public boolean b(int i7, int i10) {
        int i11 = this.c;
        if (i7 >= i11) {
            int i12 = this.b;
            if (i7 < i11 + i12 && i10 >= i11 && i10 < i11 + i12) {
                return false;
            }
        }
        int i13 = this.d;
        if ((i7 < i13 || i7 >= ((cc.c) this.f).b - i13) && i10 < i13) {
            return false;
        }
        if ((i7 >= i13 || i10 < ((cc.c) this.f).c - i13) && i7 >= 0 && i10 >= 0) {
            cc.c cVar = (cc.c) this.f;
            if (i7 < cVar.b && i10 < cVar.c && cVar.e(i7, i10) == 1) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x0128, code lost:
    
        if (r5 < (-32768)) goto L45;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int c(ByteBuffer byteBuffer, int i7, int i10) {
        float[] fArr = (float[]) this.f;
        double d = 0.0d;
        if (i10 != this.b) {
            this.b = i10;
            if (i10 <= 0 || i10 % androidx.car.app.media.b.AUDIO_CONTENT_SAMPLING_RATE != 0) {
                this.c = 0;
            } else {
                this.c = i10 / androidx.car.app.media.b.AUDIO_CONTENT_SAMPLING_RATE;
                this.d = 0;
                this.e = 0;
                Arrays.fill(fArr, 0.0f);
                if (this.c != 1) {
                    this.a = new float[63];
                    double d2 = 7200.0d / i10;
                    double d10 = 0.0d;
                    for (int i11 = 0; i11 < 63; i11++) {
                        double d11 = i11;
                        double d12 = d11 - 31.0d;
                        float cos = (float) (((Math.cos((d11 * 12.566370614359172d) / 62.0d) * 0.08d) + (0.42d - (Math.cos((6.283185307179586d * d11) / 62.0d) * 0.5d))) * (d12 == 0.0d ? 2.0d * d2 : Math.sin((d2 * 6.283185307179586d) * d12) / (d12 * 3.141592653589793d)));
                        this.a[i11] = cos;
                        d10 += cos;
                    }
                    for (int i12 = 0; i12 < 63; i12++) {
                        float[] fArr2 = this.a;
                        fArr2[i12] = fArr2[i12] / ((float) d10);
                    }
                }
            }
        }
        int i13 = this.c;
        if (i13 <= 0) {
            return 0;
        }
        int i14 = i7 / 2;
        int i15 = ((i14 / i13) + 2) * 2;
        if (((byte[]) this.g).length < i15) {
            this.g = new byte[i15];
        }
        int i16 = 0;
        int i17 = 0;
        while (i16 < i14) {
            int i18 = i16 * 2;
            short s5 = (short) ((byteBuffer.get(i18 + 1) << 8) | (byteBuffer.get(i18) & 255));
            int i19 = this.c;
            if (i19 == 1) {
                byte[] bArr = (byte[]) this.g;
                int i20 = i17 + 1;
                bArr[i17] = (byte) s5;
                i17 += 2;
                bArr[i20] = (byte) (s5 >> 8);
            } else {
                float f10 = s5;
                int i21 = this.d;
                fArr[i21] = f10;
                fArr[i21 + 63] = f10;
                int i22 = i21 + 1;
                this.d = i22;
                if (i22 == 63) {
                    this.d = 0;
                }
                int i23 = this.e + 1;
                this.e = i23;
                if (i23 >= i19) {
                    this.e = 0;
                    float[] fArr3 = this.a;
                    double d13 = d;
                    for (int i24 = 0; i24 < 63; i24++) {
                        d13 += fArr3[i24] * fArr[this.d + i24];
                    }
                    int round = (int) Math.round(d13);
                    int i25 = round <= 32767 ? -32768 : 32767;
                    round = i25;
                    byte[] bArr2 = (byte[]) this.g;
                    int i26 = i17 + 1;
                    bArr2[i17] = (byte) round;
                    i17 += 2;
                    bArr2[i26] = (byte) (round >> 8);
                }
            }
            i16++;
            d = 0.0d;
        }
        return i17;
    }
}
