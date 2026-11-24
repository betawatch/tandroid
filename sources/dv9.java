// default package

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

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class dv9 {
    public static Paint N;
    public static Paint O;
    public long A;
    public lm B;
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
    public cv9 M;
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
    public gb2 k;
    public byte[] l;
    public k27 m;
    public gb2 n;
    public boolean o;
    public int p;
    public int q;
    public int r;
    public float s;
    public float t;
    public boolean u;
    public lm v;
    public float w;
    public Path x;
    public Path y;
    public boolean z;

    public final void a(Path path, float f, float f2) {
        float N2 = gl.N(2.0f);
        int D = ug8.D(14.0f, this.h, 2);
        float f3 = f2 * this.w;
        RectF rectF = gl.P;
        float f4 = N2 / 2.0f;
        rectF.set((gl.N(1.0f) + f) - f4, ((-f3) - f4) + gl.L(7.0f) + D, gl.N(1.0f) + f + f4, f3 + f4 + gl.L(7.0f) + D);
        path.addRoundRect(rectF, N2, N2, Path.Direction.CW);
    }

    public final float[] b(int i) {
        byte[] bArr = this.l;
        if (bArr == null || i <= 0) {
            return null;
        }
        float[] fArr = new float[i];
        int i2 = 5;
        int length = (bArr.length << 3) / 5;
        float f = length / i;
        float f2 = 0.0f;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        loop0: while (i3 < length) {
            if (i3 == i4) {
                int i6 = i4;
                int i7 = 0;
                while (i4 == i6) {
                    f2 += f;
                    i6 = (int) f2;
                    i7++;
                }
                int i8 = i3 * 5;
                int i9 = i8 / 8;
                int i10 = i8 - (i9 << 3);
                int i11 = 5 - (8 - i10);
                byte min = (byte) ((this.l[i9] >> i10) & ((2 << (Math.min(i2, r15) - 1)) - 1));
                if (i11 > 0) {
                    int i12 = i9 + 1;
                    byte[] bArr2 = this.l;
                    if (i12 < bArr2.length) {
                        min = (byte) (((byte) (min << i11)) | (bArr2[i12] & ((2 << (4 - r15)) - 1)));
                    }
                }
                int i13 = 0;
                while (i13 < i7) {
                    if (i5 >= i) {
                        break loop0;
                    }
                    fArr[i5] = Math.max(0.0f, (min * 7) / 31.0f);
                    i13++;
                    i5++;
                }
                i4 = i6;
            }
            i3++;
            i2 = 5;
        }
        return fArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0373 A[LOOP:3: B:119:0x036d->B:121:0x0373, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0282  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(Canvas canvas, gb2 gb2Var) {
        int i;
        float f;
        float f2;
        float f3;
        float f4;
        RectF rectF;
        cv9 cv9Var;
        ArrayList arrayList;
        int i2;
        int i3;
        float[] fArr;
        float[] fArr2;
        k27 k27Var;
        if (this.l == null || (i = this.g) == 0 || this.s <= 0.0f) {
            return;
        }
        float N2 = i / gl.N(3.0f);
        if (N2 > 0.1f) {
            float f5 = this.t;
            if (f5 != 1.0f) {
                float f6 = f5 + 0.10666667f;
                this.t = f6;
                if (f6 > 1.0f) {
                    this.t = 1.0f;
                } else {
                    gb2Var.invalidate();
                }
            }
            float e = this.v.e(false, 1.0f);
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
            gb2 gb2Var2 = this.k;
            boolean z = (gb2Var2 == null || (k27Var = gb2Var2.Q5) == null || !k27Var.R4()) ? false : true;
            float[] fArr3 = this.H;
            if (fArr3 == null || (fArr2 = this.I) == null) {
                f = N2;
                f2 = 3.0f;
                if (this.G != null) {
                    int i4 = 0;
                    while (true) {
                        float f7 = i4;
                        if (f7 >= f || i4 >= this.G.length) {
                            break;
                        }
                        float N3 = gl.N(3.0f) * f7;
                        float a = moe.a((e * f) - f7, 0.0f, 1.0f);
                        a(this.x, N3, ls6.B(1.0f, a, gl.N(1.0f), gl.N(this.G[z ? (r3.length - 1) - i4 : i4]) * a));
                        i4++;
                    }
                }
                f3 = 0.0f;
            } else {
                int i5 = this.g;
                int i6 = this.i;
                float f8 = (i5 - i6) / (this.j - i6);
                int max = Math.max(fArr3.length, fArr2.length);
                int min = Math.min(this.H.length, this.I.length);
                float[] fArr4 = this.H;
                int length = fArr4.length;
                float[] fArr5 = this.I;
                f2 = 3.0f;
                float[] fArr6 = length < fArr5.length ? fArr4 : fArr5;
                float[] fArr7 = fArr4.length < fArr5.length ? fArr5 : fArr4;
                if (fArr4.length >= fArr5.length) {
                    f8 = 1.0f - f8;
                }
                int i7 = -1;
                f3 = 0.0f;
                int i8 = 0;
                while (i8 < max) {
                    float f9 = i8;
                    float f10 = N2;
                    int b = moe.b((int) Math.floor((f9 / max) * min), 0, min - 1);
                    float f11 = b;
                    if (i7 < b) {
                        a(this.x, gl.N(3.0f) * gl.R1(f11, f9, f8), gl.N(gl.R1(fArr6[z ? (fArr6.length - 1) - b : b], fArr7[z ? (fArr7.length - 1) - i8 : i8], f8)));
                        i7 = b;
                    } else {
                        float N4 = gl.N(3.0f) * gl.R1(f11, f9, f8);
                        if (z) {
                            b = (fArr6.length - 1) - b;
                        }
                        a(this.y, N4, gl.N(gl.R1(fArr6[b], fArr7[z ? (fArr7.length - 1) - i8 : i8], f8)));
                        f3 = f8;
                    }
                    i8++;
                    N2 = f10;
                }
                f = N2;
            }
            if (this.J || this.L > 0.0f) {
                canvas.save();
                f4 = 0.0f;
                canvas.clipRect(0.0f, 0.0f, yjb.B(this.K, this.L, 1.0f, gl.N(f2) * f), this.h);
            } else {
                f4 = 0.0f;
            }
            if (f3 > f4) {
                canvas.save();
                canvas.clipPath(this.y);
                d(canvas, f3 * this.s);
                canvas.restore();
            }
            canvas.save();
            canvas.clipPath(this.x);
            d(canvas, this.s);
            canvas.restore();
            if (this.J || this.L > 0.0f) {
                canvas.restore();
                if (this.M == null) {
                    this.M = new cv9(new zk9(this, (byte) 18));
                }
                float f12 = this.K;
                if (f12 < 0.99f && (fArr = this.G) != null) {
                    int i9 = (int) ((1.0f - f12) * f);
                    if (z) {
                        i9 = (int) ((f - 1.0f) - i9);
                    }
                    if (i9 >= 0 && i9 < fArr.length) {
                        float N5 = gl.N(this.G[i9]) * moe.a((e * f) - i9, 0.0f, 1.0f);
                        rectF = gl.P;
                        float N6 = gl.N(f2) * (1.0f - this.K) * f;
                        float N7 = gl.N(2.0f);
                        int D = ug8.D(14.0f, this.h, 2);
                        float f13 = N5 * this.w;
                        float f14 = N7 / 2.0f;
                        rectF.set((gl.N(1.0f) + N6) - f14, ((-f13) - f14) + gl.L(7.0f) + D, gl.N(1.0f) + N6 + f14, f13 + f14 + gl.L(7.0f) + D);
                        cv9Var = this.M;
                        cv9Var.d.setColor(this.q);
                        cv9Var.e = rectF;
                        float f15 = this.L;
                        Paint paint = cv9Var.d;
                        ArrayList arrayList2 = cv9Var.c;
                        arrayList = cv9Var.b;
                        long currentTimeMillis = System.currentTimeMillis();
                        long min2 = Math.min(20L, currentTimeMillis - cv9Var.f);
                        cv9Var.f = currentTimeMillis;
                        i2 = 0;
                        while (i2 < arrayList.size()) {
                            bv9 bv9Var = (bv9) arrayList.get(i2);
                            float f16 = min2;
                            float f17 = bv9Var.f - (f16 / bv9Var.g);
                            bv9Var.f = f17;
                            if (f17 < 0.0f) {
                                arrayList2.add(bv9Var);
                                arrayList.remove(i2);
                                i2--;
                            } else {
                                float f18 = bv9Var.a;
                                float f19 = bv9Var.d;
                                float f20 = bv9Var.c;
                                bv9Var.a = (((f19 * f20) * f16) / 500.0f) + f18;
                                float f21 = bv9Var.b;
                                float f22 = bv9Var.e;
                                bv9Var.b = (((f20 * f22) * f16) / 500.0f) + f21;
                                bv9Var.e = f22 - ((gl.L(0.33f) * min2) / 500.0f);
                            }
                            i2++;
                        }
                        if (cv9Var.e != null) {
                            int min3 = Math.min(4, 250 - arrayList.size());
                            for (int i10 = 0; i10 < min3; i10++) {
                                bv9 bv9Var2 = arrayList2.isEmpty() ? new bv9() : (bv9) arrayList2.remove(0);
                                RectF rectF2 = cv9Var.e;
                                float f23 = rectF2.left;
                                float width = rectF2.width();
                                SecureRandom secureRandom = Utilities.b;
                                bv9Var2.a = (secureRandom.nextFloat() * width) + f23;
                                RectF rectF3 = cv9Var.e;
                                bv9Var2.b = (secureRandom.nextFloat() * rectF3.height()) + rectF3.top;
                                double nextInt = (secureRandom.nextInt(kk7.d3) - 125) * 0.017453292519943295d;
                                bv9Var2.d = ((float) (Math.cos(nextInt) - Math.sin(nextInt))) * 0.8f;
                                bv9Var2.e = ((float) (Math.cos(nextInt) + Math.sin(nextInt))) - 0.2f;
                                bv9Var2.f = 1.0f;
                                bv9Var2.c = gl.L((secureRandom.nextFloat() * 7.0f) + 10.0f);
                                bv9Var2.g = gl.U1(secureRandom.nextFloat(), 420, 550);
                                arrayList.add(bv9Var2);
                            }
                        }
                        for (i3 = 0; i3 < arrayList.size(); i3++) {
                            bv9 bv9Var3 = (bv9) arrayList.get(i3);
                            paint.setAlpha((int) (255.0f * f15 * bv9Var3.f));
                            canvas.drawPoint(bv9Var3.a, bv9Var3.b, paint);
                        }
                        cv9Var.a.run();
                    }
                }
                rectF = null;
                cv9Var = this.M;
                cv9Var.d.setColor(this.q);
                cv9Var.e = rectF;
                float f152 = this.L;
                Paint paint2 = cv9Var.d;
                ArrayList arrayList22 = cv9Var.c;
                arrayList = cv9Var.b;
                long currentTimeMillis2 = System.currentTimeMillis();
                long min22 = Math.min(20L, currentTimeMillis2 - cv9Var.f);
                cv9Var.f = currentTimeMillis2;
                i2 = 0;
                while (i2 < arrayList.size()) {
                }
                if (cv9Var.e != null) {
                }
                while (i3 < arrayList.size()) {
                }
                cv9Var.a.run();
            }
        }
    }

    public final void d(Canvas canvas, float f) {
        lm lmVar = this.B;
        float N2 = gl.N(2.0f);
        k27 k27Var = this.m;
        boolean z = k27Var != null && k27Var.k.media_unread && !k27Var.N3() && this.c <= 0.0f;
        this.u = z;
        N.setColor(z ? this.q : this.o ? this.r : this.p);
        O.setColor(this.q);
        lmVar.a = this.n;
        float e = lmVar.e(false, (!this.z || MediaController.w().D(this.m)) ? 0.0f : 1.0f);
        Paint paint = N;
        paint.setColor(bm2.f(e, paint.getColor(), this.p));
        float f2 = 1.0f - e;
        O.setAlpha((int) (r3.getAlpha() * f2 * f));
        N.setAlpha((int) (r3.getAlpha() * f));
        canvas.drawRect(0.0f, 0.0f, this.g + N2, this.h, N);
        if (e < 1.0f) {
            canvas.drawRect(0.0f, 0.0f, (this.g + N2) * this.c * f2, this.h, O);
        }
        if (e > 0.0f) {
            if (this.C == null || Math.abs(this.D - this.g) > gl.L(8.0f) || this.E != this.p || this.F != this.q) {
                Paint paint2 = this.C;
                if (paint2 == null) {
                    paint2 = new Paint(1);
                    this.C = paint2;
                }
                this.E = this.p;
                this.F = this.q;
                float f3 = this.g;
                this.D = f3;
                int i = this.E;
                paint2.setShader(new LinearGradient(0.0f, 0.0f, f3, 0.0f, new int[]{i, this.F, i}, new float[]{0.0f, 0.2f, 0.4f}, Shader.TileMode.CLAMP));
            }
            this.C.setAlpha((int) (e * 255.0f * f));
            canvas.save();
            float pow = ((((float) Math.pow((SystemClock.elapsedRealtime() - this.A) / 270.0f, 0.75d)) % 1.6f) - 0.6f) * this.D;
            canvas.translate(pow, 0.0f);
            canvas.drawRect(-pow, 0.0f, (this.g + 5) - pow, this.h, this.C);
            canvas.restore();
            gb2 gb2Var = this.n;
            if (gb2Var != null) {
                gb2Var.invalidate();
            }
        }
    }

    public final void e() {
        f(false, 0.0f);
    }

    public final void f(boolean z, float f) {
        if (!this.k.N2()) {
            this.c = 1.0f;
            return;
        }
        boolean z2 = this.u;
        this.c = z2 ? 1.0f : f;
        int i = z2 ? this.g : this.a;
        if (z && i != 0 && f == 0.0f) {
            this.t = 0.0f;
        } else if (!z) {
            this.t = 1.0f;
        }
        int ceil = (int) Math.ceil(this.g * f);
        this.a = ceil;
        if (ceil < 0) {
            this.a = 0;
            return;
        }
        int i2 = this.g;
        if (ceil > i2) {
            this.a = i2;
        }
    }

    public final void g(int i, int i2, int i3, int i4) {
        this.g = i;
        this.h = i2;
        float[] fArr = this.G;
        if (fArr == null || fArr.length != ((int) (i / gl.N(3.0f)))) {
            this.G = b((int) (this.g / gl.N(3.0f)));
        }
        if (i3 == i4) {
            this.I = null;
            this.H = null;
        } else {
            if (this.i == i3 && this.j == i4) {
                return;
            }
            this.i = i3;
            this.j = i4;
            this.H = b((int) (i3 / gl.N(3.0f)));
            this.I = b((int) (this.j / gl.N(3.0f)));
        }
    }
}
