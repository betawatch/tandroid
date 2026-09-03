package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.SystemClock;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class mo0 {
    public static Paint N;
    public static Paint O;
    public long A;
    public z5 B;
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
    public o4.g0 M;
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
    public org.telegram.ui.Cells.t1 k;
    public byte[] l;
    public MessageObject m;
    public org.telegram.ui.Cells.t1 n;
    public boolean o;
    public int p;
    public int q;
    public int r;
    public float s;
    public float t;
    public boolean u;
    public z5 v;
    public float w;
    public Path x;
    public Path y;
    public boolean z;

    public final void a(Path path, float f10, float f11) {
        float dpf2 = AndroidUtilities.dpf2(2.0f);
        int x10 = org.telegram.ui.b.x(14.0f, this.h, 2);
        float f12 = f11 * this.w;
        RectF rectF = AndroidUtilities.rectTmp;
        float f13 = dpf2 / 2.0f;
        rectF.set((AndroidUtilities.dpf2(1.0f) + f10) - f13, ((-f12) - f13) + AndroidUtilities.dp(7.0f) + x10, AndroidUtilities.dpf2(1.0f) + f10 + f13, f12 + f13 + AndroidUtilities.dp(7.0f) + x10);
        path.addRoundRect(rectF, dpf2, dpf2, Path.Direction.CW);
    }

    public final float[] b(int i10) {
        byte[] bArr = this.l;
        if (bArr == null || i10 <= 0) {
            return null;
        }
        float[] fArr = new float[i10];
        int i11 = 5;
        int length = (bArr.length * 8) / 5;
        float f10 = length / i10;
        int i12 = 0;
        int i13 = 0;
        float f11 = 0.0f;
        int i14 = 0;
        loop0: while (i12 < length) {
            if (i12 == i13) {
                int i15 = i13;
                int i16 = 0;
                while (i13 == i15) {
                    f11 += f10;
                    i15 = (int) f11;
                    i16++;
                }
                int i17 = i12 * 5;
                int i18 = i17 / 8;
                int i19 = i17 - (i18 * 8);
                int i20 = 5 - (8 - i19);
                byte min = (byte) ((this.l[i18] >> i19) & ((2 << (Math.min(i11, r15) - 1)) - 1));
                if (i20 > 0) {
                    int i21 = i18 + 1;
                    byte[] bArr2 = this.l;
                    if (i21 < bArr2.length) {
                        min = (byte) (((byte) (min << i20)) | (bArr2[i21] & ((2 << (4 - r15)) - 1)));
                    }
                }
                int i22 = 0;
                while (i22 < i16) {
                    if (i14 >= i10) {
                        break loop0;
                    }
                    fArr[i14] = Math.max(0.0f, (min * 7) / 31.0f);
                    i22++;
                    i14++;
                }
                i13 = i15;
            }
            i12++;
            i11 = 5;
        }
        return fArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x03ae A[LOOP:3: B:119:0x03a8->B:121:0x03ae, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:125:0x03d0  */
    /* JADX WARN: Removed duplicated region for block: B:127:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x02a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(Canvas canvas, org.telegram.ui.Cells.t1 t1Var) {
        int i10;
        float f10;
        float f11;
        float f12;
        float f13;
        RectF rectF;
        o4.g0 g0Var;
        ArrayList arrayList;
        int i11;
        int i12;
        ec0 ec0Var;
        float[] fArr;
        float[] fArr2;
        MessageObject messageObject;
        if (this.l == null || (i10 = this.g) == 0 || this.s <= 0.0f) {
            return;
        }
        float dpf2 = i10 / AndroidUtilities.dpf2(3.0f);
        if (dpf2 <= 0.1f) {
            return;
        }
        float f14 = this.t;
        if (f14 != 1.0f) {
            float f15 = f14 + 0.10666667f;
            this.t = f15;
            if (f15 > 1.0f) {
                this.t = 1.0f;
            } else {
                t1Var.invalidate();
            }
        }
        float d = this.v.d(1.0f, false);
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
        org.telegram.ui.Cells.t1 t1Var2 = this.k;
        boolean z4 = (t1Var2 == null || (messageObject = t1Var2.v7) == null || !messageObject.isVoiceOnce()) ? false : true;
        float[] fArr3 = this.H;
        if (fArr3 == null || (fArr2 = this.I) == null) {
            f10 = dpf2;
            f11 = 3.0f;
            if (this.G != null) {
                int i13 = 0;
                while (true) {
                    float f16 = i13;
                    if (f16 >= f10 || i13 >= this.G.length) {
                        break;
                    }
                    float dpf22 = AndroidUtilities.dpf2(3.0f) * f16;
                    float a2 = k7.o.a((d * f10) - f16, 0.0f, 1.0f);
                    a(this.x, dpf22, org.telegram.ui.yh.c(1.0f, a2, AndroidUtilities.dpf2(1.0f), AndroidUtilities.dpf2(this.G[z4 ? (r3.length - 1) - i13 : i13]) * a2));
                    i13++;
                }
            }
            f12 = 0.0f;
        } else {
            int i14 = this.g;
            int i15 = this.i;
            float f17 = (i14 - i15) / (this.j - i15);
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
            int i16 = -1;
            int i17 = 0;
            f12 = 0.0f;
            while (i17 < max) {
                float f18 = i17;
                float f19 = dpf2;
                int b10 = k7.o.b((int) Math.floor((f18 / max) * min), 0, min - 1);
                if (i16 < b10) {
                    a(this.x, AndroidUtilities.dpf2(3.0f) * AndroidUtilities.lerp(b10, f18, f17), AndroidUtilities.dpf2(AndroidUtilities.lerp(fArr6[z4 ? (fArr6.length - 1) - b10 : b10], fArr7[z4 ? (fArr7.length - 1) - i17 : i17], f17)));
                    i16 = b10;
                } else {
                    float dpf23 = AndroidUtilities.dpf2(3.0f) * AndroidUtilities.lerp(b10, f18, f17);
                    if (z4) {
                        b10 = (fArr6.length - 1) - b10;
                    }
                    a(this.y, dpf23, AndroidUtilities.dpf2(AndroidUtilities.lerp(fArr6[b10], fArr7[z4 ? (fArr7.length - 1) - i17 : i17], f17)));
                    f12 = f17;
                }
                i17++;
                dpf2 = f19;
            }
            f10 = dpf2;
        }
        if (this.J || this.L > 0.0f) {
            canvas.save();
            f13 = 0.0f;
            canvas.clipRect(0.0f, 0.0f, (1.0f - (this.K * this.L)) * AndroidUtilities.dpf2(f11) * f10, this.h);
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
            this.M = new o4.g0(new ec0(this, 26));
        }
        float f20 = this.K;
        if (f20 < 0.99f && (fArr = this.G) != null) {
            int i18 = (int) ((1.0f - f20) * f10);
            if (z4) {
                i18 = (int) ((f10 - 1.0f) - i18);
            }
            if (i18 >= 0 && i18 < fArr.length) {
                float dpf24 = AndroidUtilities.dpf2(this.G[i18]) * k7.o.a((d * f10) - i18, 0.0f, 1.0f);
                rectF = AndroidUtilities.rectTmp;
                float dpf25 = AndroidUtilities.dpf2(f11) * (1.0f - this.K) * f10;
                float dpf26 = AndroidUtilities.dpf2(2.0f);
                int x10 = org.telegram.ui.b.x(14.0f, this.h, 2);
                float f21 = dpf24 * this.w;
                float f22 = dpf26 / 2.0f;
                rectF.set((AndroidUtilities.dpf2(1.0f) + dpf25) - f22, ((-f21) - f22) + AndroidUtilities.dp(7.0f) + x10, AndroidUtilities.dpf2(1.0f) + dpf25 + f22, f21 + f22 + AndroidUtilities.dp(7.0f) + x10);
                g0Var = this.M;
                ((Paint) g0Var.f).setColor(this.q);
                g0Var.g = rectF;
                float f23 = this.L;
                Paint paint = (Paint) g0Var.f;
                ArrayList arrayList2 = (ArrayList) g0Var.e;
                arrayList = (ArrayList) g0Var.d;
                long currentTimeMillis = System.currentTimeMillis();
                long min2 = Math.min(20L, currentTimeMillis - g0Var.b);
                g0Var.b = currentTimeMillis;
                i11 = 0;
                while (i11 < arrayList.size()) {
                    lo0 lo0Var = (lo0) arrayList.get(i11);
                    float f24 = min2;
                    float f25 = lo0Var.f - (f24 / lo0Var.g);
                    lo0Var.f = f25;
                    if (f25 < 0.0f) {
                        arrayList2.add(lo0Var);
                        arrayList.remove(i11);
                        i11--;
                    } else {
                        float f26 = lo0Var.a;
                        float f27 = lo0Var.d;
                        float f28 = lo0Var.c;
                        lo0Var.a = (((f27 * f28) * f24) / 500.0f) + f26;
                        float f29 = lo0Var.b;
                        float f30 = lo0Var.e;
                        lo0Var.b = (((f28 * f30) * f24) / 500.0f) + f29;
                        lo0Var.e = f30 - ((AndroidUtilities.dp(0.33f) * min2) / 500.0f);
                    }
                    i11++;
                }
                if (((RectF) g0Var.g) != null) {
                    int min3 = Math.min(4, g0Var.a - arrayList.size());
                    for (int i19 = 0; i19 < min3; i19++) {
                        lo0 lo0Var2 = arrayList2.isEmpty() ? new lo0() : (lo0) arrayList2.remove(0);
                        RectF rectF2 = (RectF) g0Var.g;
                        lo0Var2.a = (Utilities.random.nextFloat() * rectF2.width()) + rectF2.left;
                        RectF rectF3 = (RectF) g0Var.g;
                        lo0Var2.b = (Utilities.random.nextFloat() * rectF3.height()) + rectF3.top;
                        double nextInt = (Utilities.random.nextInt(200) - 125) * 0.017453292519943295d;
                        lo0Var2.d = ((float) (Math.cos(nextInt) - Math.sin(nextInt))) * 0.8f;
                        lo0Var2.e = ((float) (Math.cos(nextInt) + Math.sin(nextInt))) - 0.2f;
                        lo0Var2.f = 1.0f;
                        lo0Var2.c = AndroidUtilities.dp((Utilities.random.nextFloat() * 7.0f) + 10.0f);
                        lo0Var2.g = AndroidUtilities.lerp(420, 550, Utilities.random.nextFloat());
                        arrayList.add(lo0Var2);
                    }
                }
                for (i12 = 0; i12 < arrayList.size(); i12++) {
                    lo0 lo0Var3 = (lo0) arrayList.get(i12);
                    paint.setAlpha((int) (255.0f * f23 * lo0Var3.f));
                    canvas.drawPoint(lo0Var3.a, lo0Var3.b, paint);
                }
                ec0Var = (ec0) g0Var.c;
                if (ec0Var == null) {
                    ec0Var.run();
                    return;
                }
                return;
            }
        }
        rectF = null;
        g0Var = this.M;
        ((Paint) g0Var.f).setColor(this.q);
        g0Var.g = rectF;
        float f232 = this.L;
        Paint paint2 = (Paint) g0Var.f;
        ArrayList arrayList22 = (ArrayList) g0Var.e;
        arrayList = (ArrayList) g0Var.d;
        long currentTimeMillis2 = System.currentTimeMillis();
        long min22 = Math.min(20L, currentTimeMillis2 - g0Var.b);
        g0Var.b = currentTimeMillis2;
        i11 = 0;
        while (i11 < arrayList.size()) {
        }
        if (((RectF) g0Var.g) != null) {
        }
        while (i12 < arrayList.size()) {
        }
        ec0Var = (ec0) g0Var.c;
        if (ec0Var == null) {
        }
    }

    public final void d(Canvas canvas, float f10) {
        z5 z5Var = this.B;
        float dpf2 = AndroidUtilities.dpf2(2.0f);
        MessageObject messageObject = this.m;
        boolean z4 = messageObject != null && messageObject.isContentUnread() && !this.m.isOut() && this.c <= 0.0f;
        this.u = z4;
        N.setColor(z4 ? this.q : this.o ? this.r : this.p);
        O.setColor(this.q);
        z5Var.a = this.n;
        float d = z5Var.d((!this.z || MediaController.getInstance().isPlayingMessage(this.m)) ? 0.0f : 1.0f, false);
        Paint paint = N;
        paint.setColor(i0.a.d(d, paint.getColor(), this.p));
        float f11 = 1.0f - d;
        O.setAlpha((int) (r3.getAlpha() * f11 * f10));
        N.setAlpha((int) (r3.getAlpha() * f10));
        canvas.drawRect(0.0f, 0.0f, this.g + dpf2, this.h, N);
        if (d < 1.0f) {
            canvas.drawRect(0.0f, 0.0f, (this.g + dpf2) * this.c * f11, this.h, O);
        }
        if (d > 0.0f) {
            if (this.C == null || Math.abs(this.D - this.g) > AndroidUtilities.dp(8.0f) || this.E != this.p || this.F != this.q) {
                if (this.C == null) {
                    this.C = new Paint(1);
                }
                this.E = this.p;
                this.F = this.q;
                Paint paint2 = this.C;
                float f12 = this.g;
                this.D = f12;
                int i10 = this.E;
                paint2.setShader(new LinearGradient(0.0f, 0.0f, f12, 0.0f, new int[]{i10, this.F, i10}, new float[]{0.0f, 0.2f, 0.4f}, Shader.TileMode.CLAMP));
            }
            this.C.setAlpha((int) (d * 255.0f * f10));
            canvas.save();
            float pow = ((((float) Math.pow((SystemClock.elapsedRealtime() - this.A) / 270.0f, 0.75d)) % 1.6f) - 0.6f) * this.D;
            canvas.translate(pow, 0.0f);
            canvas.drawRect(-pow, 0.0f, (this.g + 5) - pow, this.h, this.C);
            canvas.restore();
            org.telegram.ui.Cells.t1 t1Var = this.n;
            if (t1Var != null) {
                t1Var.invalidate();
            }
        }
    }

    public final void e(float f10) {
        this.s = f10;
    }

    public final void f() {
        g(0.0f, false);
    }

    public final void g(float f10, boolean z4) {
        if (!this.k.p3()) {
            this.c = 1.0f;
            return;
        }
        boolean z10 = this.u;
        this.c = z10 ? 1.0f : f10;
        int i10 = z10 ? this.g : this.a;
        if (z4 && i10 != 0 && f10 == 0.0f) {
            this.t = 0.0f;
        } else if (!z4) {
            this.t = 1.0f;
        }
        int ceil = (int) Math.ceil(this.g * f10);
        this.a = ceil;
        if (ceil < 0) {
            this.a = 0;
            return;
        }
        int i11 = this.g;
        if (ceil > i11) {
            this.a = i11;
        }
    }

    public final void h(int i10, int i11, int i12, int i13) {
        this.g = i10;
        this.h = i11;
        float[] fArr = this.G;
        if (fArr == null || fArr.length != ((int) (i10 / AndroidUtilities.dpf2(3.0f)))) {
            this.G = b((int) (this.g / AndroidUtilities.dpf2(3.0f)));
        }
        if (i12 == i13 || (this.i == i12 && this.j == i13)) {
            if (i12 == i13) {
                this.I = null;
                this.H = null;
                return;
            }
            return;
        }
        this.i = i12;
        this.j = i13;
        this.H = b((int) (i12 / AndroidUtilities.dpf2(3.0f)));
        this.I = b((int) (this.j / AndroidUtilities.dpf2(3.0f)));
    }
}
