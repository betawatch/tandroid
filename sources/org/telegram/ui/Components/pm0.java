package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.SystemClock;
import java.security.SecureRandom;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class pm0 {
    public static Paint N;
    public static Paint O;
    public long A;
    public w5 B;
    public Paint C;
    public float D;
    public int E;
    public int F;
    public float[] G;
    public float[] H;
    public float[] I;
    public boolean J;
    public float K;
    public float L;
    public om0 M;
    public int a;
    public int b;
    public float c;
    public float d;
    public boolean e;
    public boolean f;
    public int g;
    public int h;
    public int i;
    public int j;
    public org.telegram.ui.Cells.q1 k;
    public byte[] l;
    public org.telegram.messenger.ij m;
    public org.telegram.ui.Cells.q1 n;
    public boolean o;
    public int p;
    public int q;
    public int r;
    public float s;
    public float t;
    public boolean u;
    public w5 v;
    public float w;
    public Path x;
    public Path y;
    public boolean z;

    public final void a(Path path, float f10, float f11) {
        float N2 = org.telegram.messenger.g0.N(2.0f);
        int y10 = org.telegram.messenger.camera.q.y(14.0f, this.h, 2);
        float f12 = f11 * this.w;
        RectF rectF = org.telegram.messenger.g0.P;
        float f13 = N2 / 2.0f;
        rectF.set((org.telegram.messenger.g0.N(1.0f) + f10) - f13, ((-f12) - f13) + org.telegram.messenger.g0.L(7.0f) + y10, org.telegram.messenger.g0.N(1.0f) + f10 + f13, f12 + f13 + org.telegram.messenger.g0.L(7.0f) + y10);
        path.addRoundRect(rectF, N2, N2, Path.Direction.CW);
    }

    public final float[] b(int i7) {
        byte[] bArr = this.l;
        if (bArr == null || i7 <= 0) {
            return null;
        }
        float[] fArr = new float[i7];
        int i10 = 5;
        int length = (bArr.length * 8) / 5;
        float f10 = length / i7;
        float f11 = 0.0f;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        loop0: while (i11 < length) {
            if (i11 == i12) {
                int i14 = i12;
                int i15 = 0;
                while (i12 == i14) {
                    f11 += f10;
                    i14 = (int) f11;
                    i15++;
                }
                int i16 = i11 * 5;
                int i17 = i16 / 8;
                int i18 = i16 - (i17 * 8);
                int i19 = 5 - (8 - i18);
                byte min = (byte) ((this.l[i17] >> i18) & ((2 << (Math.min(i10, r15) - 1)) - 1));
                if (i19 > 0) {
                    int i20 = i17 + 1;
                    byte[] bArr2 = this.l;
                    if (i20 < bArr2.length) {
                        min = (byte) (((byte) (min << i19)) | (bArr2[i20] & ((2 << (4 - r15)) - 1)));
                    }
                }
                int i21 = 0;
                while (i21 < i15) {
                    if (i13 >= i7) {
                        break loop0;
                    }
                    fArr[i13] = Math.max(0.0f, (min * 7) / 31.0f);
                    i21++;
                    i13++;
                }
                i12 = i14;
            }
            i11++;
            i10 = 5;
        }
        return fArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x039c A[LOOP:3: B:119:0x0396->B:121:0x039c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:125:0x03be  */
    /* JADX WARN: Removed duplicated region for block: B:127:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0296  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(Canvas canvas, org.telegram.ui.Cells.q1 q1Var) {
        int i7;
        float f10;
        float f11;
        float f12;
        float f13;
        RectF rectF;
        om0 om0Var;
        ArrayList arrayList;
        int i10;
        int i11;
        ob0 ob0Var;
        float[] fArr;
        float[] fArr2;
        org.telegram.messenger.ij ijVar;
        if (this.l == null || (i7 = this.g) == 0 || this.s <= 0.0f) {
            return;
        }
        float N2 = i7 / org.telegram.messenger.g0.N(3.0f);
        if (N2 <= 0.1f) {
            return;
        }
        float f14 = this.t;
        if (f14 != 1.0f) {
            float f15 = f14 + 0.10666667f;
            this.t = f15;
            if (f15 > 1.0f) {
                this.t = 1.0f;
            } else {
                q1Var.invalidate();
            }
        }
        float e10 = this.v.e(false, 1.0f);
        Path path = this.x;
        if (path == null) {
            this.x = new Path();
        } else {
            path.reset();
        }
        Path path2 = this.y;
        if (path2 == null) {
            this.y = new Path();
        } else {
            path2.reset();
        }
        org.telegram.ui.Cells.q1 q1Var2 = this.k;
        boolean z9 = (q1Var2 == null || (ijVar = q1Var2.P5) == null || !ijVar.T4()) ? false : true;
        float[] fArr3 = this.H;
        if (fArr3 == null || (fArr2 = this.I) == null) {
            f10 = N2;
            f11 = 3.0f;
            if (this.G != null) {
                int i12 = 0;
                while (true) {
                    float f16 = i12;
                    if (f16 >= f10 || i12 >= this.G.length) {
                        break;
                    }
                    float N3 = org.telegram.messenger.g0.N(3.0f) * f16;
                    float a10 = c8.j9.a((e10 * f10) - f16, 0.0f, 1.0f);
                    a(this.x, N3, com.google.android.recaptcha.internal.a.v(1.0f, a10, org.telegram.messenger.g0.N(1.0f), org.telegram.messenger.g0.N(this.G[z9 ? (r3.length - 1) - i12 : i12]) * a10));
                    i12++;
                }
            }
            f12 = 0.0f;
        } else {
            int i13 = this.g;
            int i14 = this.i;
            float f17 = (i13 - i14) / (this.j - i14);
            int max = Math.max(fArr3.length, fArr2.length);
            int min = Math.min(this.H.length, this.I.length);
            float[] fArr4 = this.H;
            int length = fArr4.length;
            float[] fArr5 = this.I;
            f11 = 3.0f;
            float[] fArr6 = length < fArr5.length ? fArr4 : fArr5;
            float[] fArr7 = fArr4.length < fArr5.length ? fArr5 : fArr4;
            if (fArr4.length >= fArr5.length) {
                f17 = 1.0f - f17;
            }
            int i15 = -1;
            f12 = 0.0f;
            int i16 = 0;
            while (i16 < max) {
                float f18 = i16;
                float f19 = N2;
                int b10 = c8.j9.b((int) Math.floor((f18 / max) * min), 0, min - 1);
                if (i15 < b10) {
                    a(this.x, org.telegram.messenger.g0.N(3.0f) * org.telegram.messenger.g0.T1(b10, f18, f17), org.telegram.messenger.g0.N(org.telegram.messenger.g0.T1(fArr6[z9 ? (fArr6.length - 1) - b10 : b10], fArr7[z9 ? (fArr7.length - 1) - i16 : i16], f17)));
                    i15 = b10;
                } else {
                    float N4 = org.telegram.messenger.g0.N(3.0f) * org.telegram.messenger.g0.T1(b10, f18, f17);
                    if (z9) {
                        b10 = (fArr6.length - 1) - b10;
                    }
                    a(this.y, N4, org.telegram.messenger.g0.N(org.telegram.messenger.g0.T1(fArr6[b10], fArr7[z9 ? (fArr7.length - 1) - i16 : i16], f17)));
                    f12 = f17;
                }
                i16++;
                N2 = f19;
            }
            f10 = N2;
        }
        if (this.J || this.L > 0.0f) {
            canvas.save();
            f13 = 0.0f;
            canvas.clipRect(0.0f, 0.0f, com.google.android.recaptcha.internal.a.C(this.K, this.L, 1.0f, org.telegram.messenger.g0.N(f11) * f10), this.h);
        } else {
            f13 = 0.0f;
        }
        if (f12 > f13) {
            canvas.save();
            canvas.clipPath(this.y);
            d(canvas, f12 * this.s);
            canvas.restore();
        }
        canvas.save();
        canvas.clipPath(this.x);
        d(canvas, this.s);
        canvas.restore();
        if (!this.J && this.L <= 0.0f) {
            return;
        }
        canvas.restore();
        if (this.M == null) {
            this.M = new om0(new ob0(this, 23));
        }
        float f20 = this.K;
        float f21 = 7.0f;
        if (f20 < 0.99f && (fArr = this.G) != null) {
            int i17 = (int) ((1.0f - f20) * f10);
            if (z9) {
                i17 = (int) ((f10 - 1.0f) - i17);
            }
            if (i17 >= 0 && i17 < fArr.length) {
                float N5 = org.telegram.messenger.g0.N(this.G[i17]) * c8.j9.a((e10 * f10) - i17, 0.0f, 1.0f);
                rectF = org.telegram.messenger.g0.P;
                float N6 = org.telegram.messenger.g0.N(f11) * (1.0f - this.K) * f10;
                float N7 = org.telegram.messenger.g0.N(2.0f);
                int y10 = org.telegram.messenger.camera.q.y(14.0f, this.h, 2);
                float f22 = N5 * this.w;
                float f23 = N7 / 2.0f;
                rectF.set((org.telegram.messenger.g0.N(1.0f) + N6) - f23, ((-f22) - f23) + org.telegram.messenger.g0.L(7.0f) + y10, org.telegram.messenger.g0.N(1.0f) + N6 + f23, f22 + f23 + org.telegram.messenger.g0.L(7.0f) + y10);
                om0Var = this.M;
                ((Paint) om0Var.f).setColor(this.q);
                om0Var.g = rectF;
                float f24 = this.L;
                Paint paint = (Paint) om0Var.f;
                ArrayList arrayList2 = (ArrayList) om0Var.e;
                arrayList = (ArrayList) om0Var.d;
                long currentTimeMillis = System.currentTimeMillis();
                long min2 = Math.min(20L, currentTimeMillis - om0Var.b);
                om0Var.b = currentTimeMillis;
                i10 = 0;
                while (i10 < arrayList.size()) {
                    nm0 nm0Var = (nm0) arrayList.get(i10);
                    float f25 = min2;
                    float f26 = nm0Var.f - (f25 / nm0Var.g);
                    nm0Var.f = f26;
                    if (f26 < 0.0f) {
                        arrayList2.add(nm0Var);
                        arrayList.remove(i10);
                        i10--;
                    } else {
                        float f27 = nm0Var.a;
                        float f28 = nm0Var.d;
                        float f29 = nm0Var.c;
                        nm0Var.a = (((f28 * f29) * f25) / 500.0f) + f27;
                        float f30 = nm0Var.b;
                        float f31 = nm0Var.e;
                        nm0Var.b = (((f29 * f31) * f25) / 500.0f) + f30;
                        nm0Var.e = f31 - ((org.telegram.messenger.g0.L(0.33f) * min2) / 500.0f);
                    }
                    i10++;
                }
                if (((RectF) om0Var.g) != null) {
                    int min3 = Math.min(4, om0Var.a - arrayList.size());
                    int i18 = 0;
                    while (i18 < min3) {
                        nm0 nm0Var2 = arrayList2.isEmpty() ? new nm0() : (nm0) arrayList2.remove(0);
                        RectF rectF2 = (RectF) om0Var.g;
                        float f32 = rectF2.left;
                        float width = rectF2.width();
                        SecureRandom secureRandom = Utilities.b;
                        nm0Var2.a = (secureRandom.nextFloat() * width) + f32;
                        RectF rectF3 = (RectF) om0Var.g;
                        nm0Var2.b = (secureRandom.nextFloat() * rectF3.height()) + rectF3.top;
                        double nextInt = (secureRandom.nextInt(org.telegram.messenger.qs.e3) - 125) * 0.017453292519943295d;
                        nm0Var2.d = ((float) (Math.cos(nextInt) - Math.sin(nextInt))) * 0.8f;
                        nm0Var2.e = ((float) (Math.cos(nextInt) + Math.sin(nextInt))) - 0.2f;
                        nm0Var2.f = 1.0f;
                        nm0Var2.c = org.telegram.messenger.g0.L((secureRandom.nextFloat() * r23) + 10.0f);
                        nm0Var2.g = org.telegram.messenger.g0.W1(secureRandom.nextFloat(), 420, 550);
                        arrayList.add(nm0Var2);
                        i18++;
                        f21 = f21;
                        paint = paint;
                    }
                }
                Paint paint2 = paint;
                for (i11 = 0; i11 < arrayList.size(); i11++) {
                    nm0 nm0Var3 = (nm0) arrayList.get(i11);
                    paint2.setAlpha((int) (255.0f * f24 * nm0Var3.f));
                    canvas.drawPoint(nm0Var3.a, nm0Var3.b, paint2);
                }
                ob0Var = (ob0) om0Var.c;
                if (ob0Var == null) {
                    ob0Var.run();
                    return;
                }
                return;
            }
        }
        rectF = null;
        om0Var = this.M;
        ((Paint) om0Var.f).setColor(this.q);
        om0Var.g = rectF;
        float f242 = this.L;
        Paint paint3 = (Paint) om0Var.f;
        ArrayList arrayList22 = (ArrayList) om0Var.e;
        arrayList = (ArrayList) om0Var.d;
        long currentTimeMillis2 = System.currentTimeMillis();
        long min22 = Math.min(20L, currentTimeMillis2 - om0Var.b);
        om0Var.b = currentTimeMillis2;
        i10 = 0;
        while (i10 < arrayList.size()) {
        }
        if (((RectF) om0Var.g) != null) {
        }
        Paint paint22 = paint3;
        while (i11 < arrayList.size()) {
        }
        ob0Var = (ob0) om0Var.c;
        if (ob0Var == null) {
        }
    }

    public final void d(Canvas canvas, float f10) {
        w5 w5Var = this.B;
        float N2 = org.telegram.messenger.g0.N(2.0f);
        org.telegram.messenger.ij ijVar = this.m;
        boolean z9 = ijVar != null && ijVar.k.media_unread && !ijVar.O3() && this.c <= 0.0f;
        this.u = z9;
        N.setColor(z9 ? this.q : this.o ? this.r : this.p);
        O.setColor(this.q);
        w5Var.a = this.n;
        float e10 = w5Var.e(false, (!this.z || MediaController.B().I(this.m)) ? 0.0f : 1.0f);
        Paint paint = N;
        paint.setColor(i0.a.f(e10, paint.getColor(), this.p));
        float f11 = 1.0f - e10;
        O.setAlpha((int) (r3.getAlpha() * f11 * f10));
        N.setAlpha((int) (r3.getAlpha() * f10));
        canvas.drawRect(0.0f, 0.0f, this.g + N2, this.h, N);
        if (e10 < 1.0f) {
            canvas.drawRect(0.0f, 0.0f, (this.g + N2) * this.c * f11, this.h, O);
        }
        if (e10 > 0.0f) {
            if (this.C == null || Math.abs(this.D - this.g) > org.telegram.messenger.g0.L(8.0f) || this.E != this.p || this.F != this.q) {
                if (this.C == null) {
                    this.C = new Paint(1);
                }
                this.E = this.p;
                this.F = this.q;
                Paint paint2 = this.C;
                float f12 = this.g;
                this.D = f12;
                int i7 = this.E;
                paint2.setShader(new LinearGradient(0.0f, 0.0f, f12, 0.0f, new int[]{i7, this.F, i7}, new float[]{0.0f, 0.2f, 0.4f}, Shader.TileMode.CLAMP));
            }
            this.C.setAlpha((int) (e10 * 255.0f * f10));
            canvas.save();
            float pow = ((((float) Math.pow((SystemClock.elapsedRealtime() - this.A) / 270.0f, 0.75d)) % 1.6f) - 0.6f) * this.D;
            canvas.translate(pow, 0.0f);
            canvas.drawRect(-pow, 0.0f, (this.g + 5) - pow, this.h, this.C);
            canvas.restore();
            org.telegram.ui.Cells.q1 q1Var = this.n;
            if (q1Var != null) {
                q1Var.invalidate();
            }
        }
    }

    public final void e(float f10) {
        this.s = f10;
    }

    public final void f() {
        g(false, 0.0f);
    }

    public final void g(boolean z9, float f10) {
        if (!this.k.K2()) {
            this.c = 1.0f;
            return;
        }
        boolean z10 = this.u;
        this.c = z10 ? 1.0f : f10;
        int i7 = z10 ? this.g : this.a;
        if (z9 && i7 != 0 && f10 == 0.0f) {
            this.t = 0.0f;
        } else if (!z9) {
            this.t = 1.0f;
        }
        int ceil = (int) Math.ceil(this.g * f10);
        this.a = ceil;
        if (ceil < 0) {
            this.a = 0;
            return;
        }
        int i10 = this.g;
        if (ceil > i10) {
            this.a = i10;
        }
    }

    public final void h(int i7, int i10, int i11, int i12) {
        this.g = i7;
        this.h = i10;
        float[] fArr = this.G;
        if (fArr == null || fArr.length != ((int) (i7 / org.telegram.messenger.g0.N(3.0f)))) {
            this.G = b((int) (this.g / org.telegram.messenger.g0.N(3.0f)));
        }
        if (i11 == i12 || (this.i == i11 && this.j == i12)) {
            if (i11 == i12) {
                this.I = null;
                this.H = null;
                return;
            }
            return;
        }
        this.i = i11;
        this.j = i12;
        this.H = b((int) (i11 / org.telegram.messenger.g0.N(3.0f)));
        this.I = b((int) (this.j / org.telegram.messenger.g0.N(3.0f)));
    }
}
