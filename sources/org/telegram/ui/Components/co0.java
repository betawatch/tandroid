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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class co0 {
    public static Paint N;
    public static Paint O;
    public long A;
    public d6 B;
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
    public l4.w0 M;
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
    public org.telegram.ui.Cells.s1 k;
    public byte[] l;
    public MessageObject m;
    public org.telegram.ui.Cells.s1 n;
    public boolean o;
    public int p;
    public int q;
    public int r;
    public float s;
    public float t;
    public boolean u;
    public d6 v;
    public float w;
    public Path x;
    public Path y;
    public boolean z;

    public final void a(Path path, float f9, float f10) {
        float dpf2 = AndroidUtilities.dpf2(2.0f);
        int x4 = org.telegram.ui.b.x(14.0f, this.h, 2);
        float f11 = f10 * this.w;
        RectF rectF = AndroidUtilities.rectTmp;
        float f12 = dpf2 / 2.0f;
        rectF.set((AndroidUtilities.dpf2(1.0f) + f9) - f12, ((-f11) - f12) + AndroidUtilities.dp(7.0f) + x4, AndroidUtilities.dpf2(1.0f) + f9 + f12, f11 + f12 + AndroidUtilities.dp(7.0f) + x4);
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
        float f9 = length / i10;
        int i12 = 0;
        int i13 = 0;
        float f10 = 0.0f;
        int i14 = 0;
        loop0: while (i12 < length) {
            if (i12 == i13) {
                int i15 = i13;
                int i16 = 0;
                while (i13 == i15) {
                    f10 += f9;
                    i15 = (int) f10;
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
    public final void c(Canvas canvas, org.telegram.ui.Cells.s1 s1Var) {
        int i10;
        float f9;
        float f10;
        float f11;
        float f12;
        RectF rectF;
        l4.w0 w0Var;
        ArrayList arrayList;
        int i11;
        int i12;
        xb0 xb0Var;
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
        float f13 = this.t;
        if (f13 != 1.0f) {
            float f14 = f13 + 0.10666667f;
            this.t = f14;
            if (f14 > 1.0f) {
                this.t = 1.0f;
            } else {
                s1Var.invalidate();
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
        org.telegram.ui.Cells.s1 s1Var2 = this.k;
        boolean z10 = (s1Var2 == null || (messageObject = s1Var2.u7) == null || !messageObject.isVoiceOnce()) ? false : true;
        float[] fArr3 = this.H;
        if (fArr3 == null || (fArr2 = this.I) == null) {
            f9 = dpf2;
            f10 = 3.0f;
            if (this.G != null) {
                int i13 = 0;
                while (true) {
                    float f15 = i13;
                    if (f15 >= f9 || i13 >= this.G.length) {
                        break;
                    }
                    float dpf22 = AndroidUtilities.dpf2(3.0f) * f15;
                    float a2 = i7.w.a((d * f9) - f15, 0.0f, 1.0f);
                    a(this.x, dpf22, org.telegram.ui.th.b(1.0f, a2, AndroidUtilities.dpf2(1.0f), AndroidUtilities.dpf2(this.G[z10 ? (r3.length - 1) - i13 : i13]) * a2));
                    i13++;
                }
            }
            f11 = 0.0f;
        } else {
            int i14 = this.g;
            int i15 = this.i;
            float f16 = (i14 - i15) / (this.j - i15);
            int max = Math.max(fArr3.length, fArr2.length);
            int min = Math.min(this.H.length, this.I.length);
            float[] fArr4 = this.H;
            int length = fArr4.length;
            float[] fArr5 = this.I;
            f10 = 3.0f;
            float[] fArr6 = length < fArr5.length ? fArr4 : fArr5;
            float[] fArr7 = fArr4.length < fArr5.length ? fArr5 : fArr4;
            if (fArr4.length >= fArr5.length) {
                f16 = 1.0f - f16;
            }
            int i16 = -1;
            int i17 = 0;
            f11 = 0.0f;
            while (i17 < max) {
                float f17 = i17;
                float f18 = dpf2;
                int b10 = i7.w.b((int) Math.floor((f17 / max) * min), 0, min - 1);
                if (i16 < b10) {
                    a(this.x, AndroidUtilities.dpf2(3.0f) * AndroidUtilities.lerp(b10, f17, f16), AndroidUtilities.dpf2(AndroidUtilities.lerp(fArr6[z10 ? (fArr6.length - 1) - b10 : b10], fArr7[z10 ? (fArr7.length - 1) - i17 : i17], f16)));
                    i16 = b10;
                } else {
                    float dpf23 = AndroidUtilities.dpf2(3.0f) * AndroidUtilities.lerp(b10, f17, f16);
                    if (z10) {
                        b10 = (fArr6.length - 1) - b10;
                    }
                    a(this.y, dpf23, AndroidUtilities.dpf2(AndroidUtilities.lerp(fArr6[b10], fArr7[z10 ? (fArr7.length - 1) - i17 : i17], f16)));
                    f11 = f16;
                }
                i17++;
                dpf2 = f18;
            }
            f9 = dpf2;
        }
        if (this.J || this.L > 0.0f) {
            canvas.save();
            f12 = 0.0f;
            canvas.clipRect(0.0f, 0.0f, (1.0f - (this.K * this.L)) * AndroidUtilities.dpf2(f10) * f9, this.h);
        } else {
            f12 = 0.0f;
        }
        if (f11 > f12) {
            canvas.save();
            canvas.clipPath(this.y);
            d(canvas, f11 * this.s);
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
            this.M = new l4.w0(new xb0(this, 26));
        }
        float f19 = this.K;
        if (f19 < 0.99f && (fArr = this.G) != null) {
            int i18 = (int) ((1.0f - f19) * f9);
            if (z10) {
                i18 = (int) ((f9 - 1.0f) - i18);
            }
            if (i18 >= 0 && i18 < fArr.length) {
                float dpf24 = AndroidUtilities.dpf2(this.G[i18]) * i7.w.a((d * f9) - i18, 0.0f, 1.0f);
                rectF = AndroidUtilities.rectTmp;
                float dpf25 = AndroidUtilities.dpf2(f10) * (1.0f - this.K) * f9;
                float dpf26 = AndroidUtilities.dpf2(2.0f);
                int x4 = org.telegram.ui.b.x(14.0f, this.h, 2);
                float f20 = dpf24 * this.w;
                float f21 = dpf26 / 2.0f;
                rectF.set((AndroidUtilities.dpf2(1.0f) + dpf25) - f21, ((-f20) - f21) + AndroidUtilities.dp(7.0f) + x4, AndroidUtilities.dpf2(1.0f) + dpf25 + f21, f20 + f21 + AndroidUtilities.dp(7.0f) + x4);
                w0Var = this.M;
                ((Paint) w0Var.f).setColor(this.q);
                w0Var.g = rectF;
                float f22 = this.L;
                Paint paint = (Paint) w0Var.f;
                ArrayList arrayList2 = (ArrayList) w0Var.e;
                arrayList = (ArrayList) w0Var.d;
                long currentTimeMillis = System.currentTimeMillis();
                long min2 = Math.min(20L, currentTimeMillis - w0Var.b);
                w0Var.b = currentTimeMillis;
                i11 = 0;
                while (i11 < arrayList.size()) {
                    bo0 bo0Var = (bo0) arrayList.get(i11);
                    float f23 = min2;
                    float f24 = bo0Var.f - (f23 / bo0Var.g);
                    bo0Var.f = f24;
                    if (f24 < 0.0f) {
                        arrayList2.add(bo0Var);
                        arrayList.remove(i11);
                        i11--;
                    } else {
                        float f25 = bo0Var.a;
                        float f26 = bo0Var.d;
                        float f27 = bo0Var.c;
                        bo0Var.a = (((f26 * f27) * f23) / 500.0f) + f25;
                        float f28 = bo0Var.b;
                        float f29 = bo0Var.e;
                        bo0Var.b = (((f27 * f29) * f23) / 500.0f) + f28;
                        bo0Var.e = f29 - ((AndroidUtilities.dp(0.33f) * min2) / 500.0f);
                    }
                    i11++;
                }
                if (((RectF) w0Var.g) != null) {
                    int min3 = Math.min(4, w0Var.a - arrayList.size());
                    for (int i19 = 0; i19 < min3; i19++) {
                        bo0 bo0Var2 = arrayList2.isEmpty() ? new bo0() : (bo0) arrayList2.remove(0);
                        RectF rectF2 = (RectF) w0Var.g;
                        bo0Var2.a = (Utilities.random.nextFloat() * rectF2.width()) + rectF2.left;
                        RectF rectF3 = (RectF) w0Var.g;
                        bo0Var2.b = (Utilities.random.nextFloat() * rectF3.height()) + rectF3.top;
                        double nextInt = (Utilities.random.nextInt(200) - 125) * 0.017453292519943295d;
                        bo0Var2.d = ((float) (Math.cos(nextInt) - Math.sin(nextInt))) * 0.8f;
                        bo0Var2.e = ((float) (Math.cos(nextInt) + Math.sin(nextInt))) - 0.2f;
                        bo0Var2.f = 1.0f;
                        bo0Var2.c = AndroidUtilities.dp((Utilities.random.nextFloat() * 7.0f) + 10.0f);
                        bo0Var2.g = AndroidUtilities.lerp(420, 550, Utilities.random.nextFloat());
                        arrayList.add(bo0Var2);
                    }
                }
                for (i12 = 0; i12 < arrayList.size(); i12++) {
                    bo0 bo0Var3 = (bo0) arrayList.get(i12);
                    paint.setAlpha((int) (255.0f * f22 * bo0Var3.f));
                    canvas.drawPoint(bo0Var3.a, bo0Var3.b, paint);
                }
                xb0Var = (xb0) w0Var.c;
                if (xb0Var == null) {
                    xb0Var.run();
                    return;
                }
                return;
            }
        }
        rectF = null;
        w0Var = this.M;
        ((Paint) w0Var.f).setColor(this.q);
        w0Var.g = rectF;
        float f222 = this.L;
        Paint paint2 = (Paint) w0Var.f;
        ArrayList arrayList22 = (ArrayList) w0Var.e;
        arrayList = (ArrayList) w0Var.d;
        long currentTimeMillis2 = System.currentTimeMillis();
        long min22 = Math.min(20L, currentTimeMillis2 - w0Var.b);
        w0Var.b = currentTimeMillis2;
        i11 = 0;
        while (i11 < arrayList.size()) {
        }
        if (((RectF) w0Var.g) != null) {
        }
        while (i12 < arrayList.size()) {
        }
        xb0Var = (xb0) w0Var.c;
        if (xb0Var == null) {
        }
    }

    public final void d(Canvas canvas, float f9) {
        d6 d6Var = this.B;
        float dpf2 = AndroidUtilities.dpf2(2.0f);
        MessageObject messageObject = this.m;
        boolean z10 = messageObject != null && messageObject.isContentUnread() && !this.m.isOut() && this.c <= 0.0f;
        this.u = z10;
        N.setColor(z10 ? this.q : this.o ? this.r : this.p);
        O.setColor(this.q);
        d6Var.a = this.n;
        float d = d6Var.d((!this.z || MediaController.getInstance().isPlayingMessage(this.m)) ? 0.0f : 1.0f, false);
        Paint paint = N;
        paint.setColor(i0.a.d(d, paint.getColor(), this.p));
        float f10 = 1.0f - d;
        O.setAlpha((int) (r3.getAlpha() * f10 * f9));
        N.setAlpha((int) (r3.getAlpha() * f9));
        canvas.drawRect(0.0f, 0.0f, this.g + dpf2, this.h, N);
        if (d < 1.0f) {
            canvas.drawRect(0.0f, 0.0f, (this.g + dpf2) * this.c * f10, this.h, O);
        }
        if (d > 0.0f) {
            if (this.C == null || Math.abs(this.D - this.g) > AndroidUtilities.dp(8.0f) || this.E != this.p || this.F != this.q) {
                if (this.C == null) {
                    this.C = new Paint(1);
                }
                this.E = this.p;
                this.F = this.q;
                Paint paint2 = this.C;
                float f11 = this.g;
                this.D = f11;
                int i10 = this.E;
                paint2.setShader(new LinearGradient(0.0f, 0.0f, f11, 0.0f, new int[]{i10, this.F, i10}, new float[]{0.0f, 0.2f, 0.4f}, Shader.TileMode.CLAMP));
            }
            this.C.setAlpha((int) (d * 255.0f * f9));
            canvas.save();
            float pow = ((((float) Math.pow((SystemClock.elapsedRealtime() - this.A) / 270.0f, 0.75d)) % 1.6f) - 0.6f) * this.D;
            canvas.translate(pow, 0.0f);
            canvas.drawRect(-pow, 0.0f, (this.g + 5) - pow, this.h, this.C);
            canvas.restore();
            org.telegram.ui.Cells.s1 s1Var = this.n;
            if (s1Var != null) {
                s1Var.invalidate();
            }
        }
    }

    public final void e(float f9) {
        this.s = f9;
    }

    public final void f() {
        g(0.0f, false);
    }

    public final void g(float f9, boolean z10) {
        if (!this.k.p3()) {
            this.c = 1.0f;
            return;
        }
        boolean z11 = this.u;
        this.c = z11 ? 1.0f : f9;
        int i10 = z11 ? this.g : this.a;
        if (z10 && i10 != 0 && f9 == 0.0f) {
            this.t = 0.0f;
        } else if (!z10) {
            this.t = 1.0f;
        }
        int ceil = (int) Math.ceil(this.g * f9);
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
