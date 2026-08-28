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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class rn0 {
    public static Paint N;
    public static Paint O;
    public long A;
    public y5 B;
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
    public j4.w0 M;
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
    public y5 v;
    public float w;
    public Path x;
    public Path y;
    public boolean z;

    public final void a(Path path, float f10, float f11) {
        float dpf2 = AndroidUtilities.dpf2(2.0f);
        int y10 = org.telegram.messenger.ll.y(14.0f, this.h, 2);
        float f12 = f11 * this.w;
        RectF rectF = AndroidUtilities.rectTmp;
        float f13 = dpf2 / 2.0f;
        rectF.set((AndroidUtilities.dpf2(1.0f) + f10) - f13, ((-f12) - f13) + AndroidUtilities.dp(7.0f) + y10, AndroidUtilities.dpf2(1.0f) + f10 + f13, f12 + f13 + AndroidUtilities.dp(7.0f) + y10);
        path.addRoundRect(rectF, dpf2, dpf2, Path.Direction.CW);
    }

    public final float[] b(int i9) {
        byte[] bArr = this.l;
        if (bArr == null || i9 <= 0) {
            return null;
        }
        float[] fArr = new float[i9];
        int i10 = 5;
        int length = (bArr.length * 8) / 5;
        float f10 = length / i9;
        int i11 = 0;
        int i12 = 0;
        float f11 = 0.0f;
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
                    if (i13 >= i9) {
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

    /* JADX WARN: Removed duplicated region for block: B:108:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x03ae A[LOOP:3: B:119:0x03a8->B:121:0x03ae, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:125:0x03d0  */
    /* JADX WARN: Removed duplicated region for block: B:127:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x02a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(Canvas canvas, org.telegram.ui.Cells.t1 t1Var) {
        int i9;
        float f10;
        float f11;
        float f12;
        float f13;
        RectF rectF;
        j4.w0 w0Var;
        ArrayList arrayList;
        int i10;
        int i11;
        ib0 ib0Var;
        float[] fArr;
        float[] fArr2;
        MessageObject messageObject;
        if (this.l == null || (i9 = this.g) == 0 || this.s <= 0.0f) {
            return;
        }
        float dpf2 = i9 / AndroidUtilities.dpf2(3.0f);
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
        boolean z10 = (t1Var2 == null || (messageObject = t1Var2.u7) == null || !messageObject.isVoiceOnce()) ? false : true;
        float[] fArr3 = this.H;
        if (fArr3 == null || (fArr2 = this.I) == null) {
            f10 = dpf2;
            f11 = 3.0f;
            if (this.G != null) {
                int i12 = 0;
                while (true) {
                    float f16 = i12;
                    if (f16 >= f10 || i12 >= this.G.length) {
                        break;
                    }
                    float dpf22 = AndroidUtilities.dpf2(3.0f) * f16;
                    float a2 = g7.n.a((d * f10) - f16, 0.0f, 1.0f);
                    a(this.x, dpf22, j3.r0.C(1.0f, a2, AndroidUtilities.dpf2(1.0f), AndroidUtilities.dpf2(this.G[z10 ? (r3.length - 1) - i12 : i12]) * a2));
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
            int i16 = 0;
            f12 = 0.0f;
            while (i16 < max) {
                float f18 = i16;
                float f19 = dpf2;
                int b10 = g7.n.b((int) Math.floor((f18 / max) * min), 0, min - 1);
                if (i15 < b10) {
                    a(this.x, AndroidUtilities.dpf2(3.0f) * AndroidUtilities.lerp(b10, f18, f17), AndroidUtilities.dpf2(AndroidUtilities.lerp(fArr6[z10 ? (fArr6.length - 1) - b10 : b10], fArr7[z10 ? (fArr7.length - 1) - i16 : i16], f17)));
                    i15 = b10;
                } else {
                    float dpf23 = AndroidUtilities.dpf2(3.0f) * AndroidUtilities.lerp(b10, f18, f17);
                    if (z10) {
                        b10 = (fArr6.length - 1) - b10;
                    }
                    a(this.y, dpf23, AndroidUtilities.dpf2(AndroidUtilities.lerp(fArr6[b10], fArr7[z10 ? (fArr7.length - 1) - i16 : i16], f17)));
                    f12 = f17;
                }
                i16++;
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
            this.M = new j4.w0(new ib0(this, 26));
        }
        float f20 = this.K;
        if (f20 < 0.99f && (fArr = this.G) != null) {
            int i17 = (int) ((1.0f - f20) * f10);
            if (z10) {
                i17 = (int) ((f10 - 1.0f) - i17);
            }
            if (i17 >= 0 && i17 < fArr.length) {
                float dpf24 = AndroidUtilities.dpf2(this.G[i17]) * g7.n.a((d * f10) - i17, 0.0f, 1.0f);
                rectF = AndroidUtilities.rectTmp;
                float dpf25 = AndroidUtilities.dpf2(f11) * (1.0f - this.K) * f10;
                float dpf26 = AndroidUtilities.dpf2(2.0f);
                int y10 = org.telegram.messenger.ll.y(14.0f, this.h, 2);
                float f21 = dpf24 * this.w;
                float f22 = dpf26 / 2.0f;
                rectF.set((AndroidUtilities.dpf2(1.0f) + dpf25) - f22, ((-f21) - f22) + AndroidUtilities.dp(7.0f) + y10, AndroidUtilities.dpf2(1.0f) + dpf25 + f22, f21 + f22 + AndroidUtilities.dp(7.0f) + y10);
                w0Var = this.M;
                ((Paint) w0Var.f).setColor(this.q);
                w0Var.g = rectF;
                float f23 = this.L;
                Paint paint = (Paint) w0Var.f;
                ArrayList arrayList2 = (ArrayList) w0Var.e;
                arrayList = (ArrayList) w0Var.d;
                long currentTimeMillis = System.currentTimeMillis();
                long min2 = Math.min(20L, currentTimeMillis - w0Var.b);
                w0Var.b = currentTimeMillis;
                i10 = 0;
                while (i10 < arrayList.size()) {
                    qn0 qn0Var = (qn0) arrayList.get(i10);
                    float f24 = min2;
                    float f25 = qn0Var.f - (f24 / qn0Var.g);
                    qn0Var.f = f25;
                    if (f25 < 0.0f) {
                        arrayList2.add(qn0Var);
                        arrayList.remove(i10);
                        i10--;
                    } else {
                        float f26 = qn0Var.a;
                        float f27 = qn0Var.d;
                        float f28 = qn0Var.c;
                        qn0Var.a = (((f27 * f28) * f24) / 500.0f) + f26;
                        float f29 = qn0Var.b;
                        float f30 = qn0Var.e;
                        qn0Var.b = (((f28 * f30) * f24) / 500.0f) + f29;
                        qn0Var.e = f30 - ((AndroidUtilities.dp(0.33f) * min2) / 500.0f);
                    }
                    i10++;
                }
                if (((RectF) w0Var.g) != null) {
                    int min3 = Math.min(4, w0Var.a - arrayList.size());
                    for (int i18 = 0; i18 < min3; i18++) {
                        qn0 qn0Var2 = arrayList2.isEmpty() ? new qn0() : (qn0) arrayList2.remove(0);
                        RectF rectF2 = (RectF) w0Var.g;
                        qn0Var2.a = (Utilities.random.nextFloat() * rectF2.width()) + rectF2.left;
                        RectF rectF3 = (RectF) w0Var.g;
                        qn0Var2.b = (Utilities.random.nextFloat() * rectF3.height()) + rectF3.top;
                        double nextInt = (Utilities.random.nextInt(200) - 125) * 0.017453292519943295d;
                        qn0Var2.d = ((float) (Math.cos(nextInt) - Math.sin(nextInt))) * 0.8f;
                        qn0Var2.e = ((float) (Math.cos(nextInt) + Math.sin(nextInt))) - 0.2f;
                        qn0Var2.f = 1.0f;
                        qn0Var2.c = AndroidUtilities.dp((Utilities.random.nextFloat() * 7.0f) + 10.0f);
                        qn0Var2.g = AndroidUtilities.lerp(420, 550, Utilities.random.nextFloat());
                        arrayList.add(qn0Var2);
                    }
                }
                for (i11 = 0; i11 < arrayList.size(); i11++) {
                    qn0 qn0Var3 = (qn0) arrayList.get(i11);
                    paint.setAlpha((int) (255.0f * f23 * qn0Var3.f));
                    canvas.drawPoint(qn0Var3.a, qn0Var3.b, paint);
                }
                ib0Var = (ib0) w0Var.c;
                if (ib0Var == null) {
                    ib0Var.run();
                    return;
                }
                return;
            }
        }
        rectF = null;
        w0Var = this.M;
        ((Paint) w0Var.f).setColor(this.q);
        w0Var.g = rectF;
        float f232 = this.L;
        Paint paint2 = (Paint) w0Var.f;
        ArrayList arrayList22 = (ArrayList) w0Var.e;
        arrayList = (ArrayList) w0Var.d;
        long currentTimeMillis2 = System.currentTimeMillis();
        long min22 = Math.min(20L, currentTimeMillis2 - w0Var.b);
        w0Var.b = currentTimeMillis2;
        i10 = 0;
        while (i10 < arrayList.size()) {
        }
        if (((RectF) w0Var.g) != null) {
        }
        while (i11 < arrayList.size()) {
        }
        ib0Var = (ib0) w0Var.c;
        if (ib0Var == null) {
        }
    }

    public final void d(Canvas canvas, float f10) {
        y5 y5Var = this.B;
        float dpf2 = AndroidUtilities.dpf2(2.0f);
        MessageObject messageObject = this.m;
        boolean z10 = messageObject != null && messageObject.isContentUnread() && !this.m.isOut() && this.c <= 0.0f;
        this.u = z10;
        N.setColor(z10 ? this.q : this.o ? this.r : this.p);
        O.setColor(this.q);
        y5Var.a = this.n;
        float d = y5Var.d((!this.z || MediaController.getInstance().isPlayingMessage(this.m)) ? 0.0f : 1.0f, false);
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
                int i9 = this.E;
                paint2.setShader(new LinearGradient(0.0f, 0.0f, f12, 0.0f, new int[]{i9, this.F, i9}, new float[]{0.0f, 0.2f, 0.4f}, Shader.TileMode.CLAMP));
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

    public final void g(float f10, boolean z10) {
        if (!this.k.p3()) {
            this.c = 1.0f;
            return;
        }
        boolean z11 = this.u;
        this.c = z11 ? 1.0f : f10;
        int i9 = z11 ? this.g : this.a;
        if (z10 && i9 != 0 && f10 == 0.0f) {
            this.t = 0.0f;
        } else if (!z10) {
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

    public final void h(int i9, int i10, int i11, int i12) {
        this.g = i9;
        this.h = i10;
        float[] fArr = this.G;
        if (fArr == null || fArr.length != ((int) (i9 / AndroidUtilities.dpf2(3.0f)))) {
            this.G = b((int) (this.g / AndroidUtilities.dpf2(3.0f)));
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
        this.H = b((int) (i11 / AndroidUtilities.dpf2(3.0f)));
        this.I = b((int) (this.j / AndroidUtilities.dpf2(3.0f)));
    }
}
