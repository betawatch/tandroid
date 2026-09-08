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

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class io0 {
    public static Paint N;
    public static Paint O;
    public long A;
    public e6 B;
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
    public ho0 M;
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
    public e6 v;
    public float w;
    public Path x;
    public Path y;
    public boolean z;

    public final void a(Path path, float f7, float f10) {
        float dpf2 = AndroidUtilities.dpf2(2.0f);
        int y3 = org.telegram.messenger.wl.y(14.0f, this.h, 2);
        float f11 = f10 * this.w;
        RectF rectF = AndroidUtilities.rectTmp;
        float f12 = dpf2 / 2.0f;
        rectF.set((AndroidUtilities.dpf2(1.0f) + f7) - f12, ((-f11) - f12) + AndroidUtilities.dp(7.0f) + y3, AndroidUtilities.dpf2(1.0f) + f7 + f12, f11 + f12 + AndroidUtilities.dp(7.0f) + y3);
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
        float f7 = length / i10;
        int i12 = 0;
        int i13 = 0;
        float f10 = 0.0f;
        int i14 = 0;
        loop0: while (i12 < length) {
            if (i12 == i13) {
                int i15 = i13;
                int i16 = 0;
                while (i13 == i15) {
                    f10 += f7;
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
    public final void c(Canvas canvas, org.telegram.ui.Cells.t1 t1Var) {
        int i10;
        float f7;
        float f10;
        float f11;
        float f12;
        RectF rectF;
        ho0 ho0Var;
        ArrayList arrayList;
        int i11;
        int i12;
        cc0 cc0Var;
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
        boolean z10 = (t1Var2 == null || (messageObject = t1Var2.y7) == null || !messageObject.isVoiceOnce()) ? false : true;
        float[] fArr3 = this.H;
        if (fArr3 == null || (fArr2 = this.I) == null) {
            f7 = dpf2;
            f10 = 3.0f;
            if (this.G != null) {
                int i13 = 0;
                while (true) {
                    float f15 = i13;
                    if (f15 >= f7 || i13 >= this.G.length) {
                        break;
                    }
                    float dpf22 = AndroidUtilities.dpf2(3.0f) * f15;
                    float a2 = w7.p.a((d * f7) - f15, 0.0f, 1.0f);
                    a(this.x, dpf22, com.google.android.gms.internal.vision.e2.b(1.0f, a2, AndroidUtilities.dpf2(1.0f), AndroidUtilities.dpf2(this.G[z10 ? (r3.length - 1) - i13 : i13]) * a2));
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
                int b10 = w7.p.b((int) Math.floor((f17 / max) * min), 0, min - 1);
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
            f7 = dpf2;
        }
        if (this.J || this.L > 0.0f) {
            canvas.save();
            f12 = 0.0f;
            canvas.clipRect(0.0f, 0.0f, (1.0f - (this.K * this.L)) * AndroidUtilities.dpf2(f10) * f7, this.h);
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
            this.M = new ho0(new cc0(this, 26));
        }
        float f19 = this.K;
        if (f19 < 0.99f && (fArr = this.G) != null) {
            int i18 = (int) ((1.0f - f19) * f7);
            if (z10) {
                i18 = (int) ((f7 - 1.0f) - i18);
            }
            if (i18 >= 0 && i18 < fArr.length) {
                float dpf24 = AndroidUtilities.dpf2(this.G[i18]) * w7.p.a((d * f7) - i18, 0.0f, 1.0f);
                rectF = AndroidUtilities.rectTmp;
                float dpf25 = AndroidUtilities.dpf2(f10) * (1.0f - this.K) * f7;
                float dpf26 = AndroidUtilities.dpf2(2.0f);
                int y3 = org.telegram.messenger.wl.y(14.0f, this.h, 2);
                float f20 = dpf24 * this.w;
                float f21 = dpf26 / 2.0f;
                rectF.set((AndroidUtilities.dpf2(1.0f) + dpf25) - f21, ((-f20) - f21) + AndroidUtilities.dp(7.0f) + y3, AndroidUtilities.dpf2(1.0f) + dpf25 + f21, f20 + f21 + AndroidUtilities.dp(7.0f) + y3);
                ho0Var = this.M;
                ((Paint) ho0Var.f).setColor(this.q);
                ho0Var.g = rectF;
                float f22 = this.L;
                Paint paint = (Paint) ho0Var.f;
                ArrayList arrayList2 = (ArrayList) ho0Var.e;
                arrayList = (ArrayList) ho0Var.d;
                long currentTimeMillis = System.currentTimeMillis();
                long min2 = Math.min(20L, currentTimeMillis - ho0Var.b);
                ho0Var.b = currentTimeMillis;
                i11 = 0;
                while (i11 < arrayList.size()) {
                    go0 go0Var = (go0) arrayList.get(i11);
                    float f23 = min2;
                    float f24 = go0Var.f - (f23 / go0Var.g);
                    go0Var.f = f24;
                    if (f24 < 0.0f) {
                        arrayList2.add(go0Var);
                        arrayList.remove(i11);
                        i11--;
                    } else {
                        float f25 = go0Var.a;
                        float f26 = go0Var.d;
                        float f27 = go0Var.c;
                        go0Var.a = (((f26 * f27) * f23) / 500.0f) + f25;
                        float f28 = go0Var.b;
                        float f29 = go0Var.e;
                        go0Var.b = (((f27 * f29) * f23) / 500.0f) + f28;
                        go0Var.e = f29 - ((AndroidUtilities.dp(0.33f) * min2) / 500.0f);
                    }
                    i11++;
                }
                if (((RectF) ho0Var.g) != null) {
                    int min3 = Math.min(4, ho0Var.a - arrayList.size());
                    for (int i19 = 0; i19 < min3; i19++) {
                        go0 go0Var2 = arrayList2.isEmpty() ? new go0() : (go0) arrayList2.remove(0);
                        RectF rectF2 = (RectF) ho0Var.g;
                        go0Var2.a = (Utilities.random.nextFloat() * rectF2.width()) + rectF2.left;
                        RectF rectF3 = (RectF) ho0Var.g;
                        go0Var2.b = (Utilities.random.nextFloat() * rectF3.height()) + rectF3.top;
                        double nextInt = (Utilities.random.nextInt(200) - 125) * 0.017453292519943295d;
                        go0Var2.d = ((float) (Math.cos(nextInt) - Math.sin(nextInt))) * 0.8f;
                        go0Var2.e = ((float) (Math.cos(nextInt) + Math.sin(nextInt))) - 0.2f;
                        go0Var2.f = 1.0f;
                        go0Var2.c = AndroidUtilities.dp((Utilities.random.nextFloat() * 7.0f) + 10.0f);
                        go0Var2.g = AndroidUtilities.lerp(420, 550, Utilities.random.nextFloat());
                        arrayList.add(go0Var2);
                    }
                }
                for (i12 = 0; i12 < arrayList.size(); i12++) {
                    go0 go0Var3 = (go0) arrayList.get(i12);
                    paint.setAlpha((int) (255.0f * f22 * go0Var3.f));
                    canvas.drawPoint(go0Var3.a, go0Var3.b, paint);
                }
                cc0Var = (cc0) ho0Var.c;
                if (cc0Var == null) {
                    cc0Var.run();
                    return;
                }
                return;
            }
        }
        rectF = null;
        ho0Var = this.M;
        ((Paint) ho0Var.f).setColor(this.q);
        ho0Var.g = rectF;
        float f222 = this.L;
        Paint paint2 = (Paint) ho0Var.f;
        ArrayList arrayList22 = (ArrayList) ho0Var.e;
        arrayList = (ArrayList) ho0Var.d;
        long currentTimeMillis2 = System.currentTimeMillis();
        long min22 = Math.min(20L, currentTimeMillis2 - ho0Var.b);
        ho0Var.b = currentTimeMillis2;
        i11 = 0;
        while (i11 < arrayList.size()) {
        }
        if (((RectF) ho0Var.g) != null) {
        }
        while (i12 < arrayList.size()) {
        }
        cc0Var = (cc0) ho0Var.c;
        if (cc0Var == null) {
        }
    }

    public final void d(Canvas canvas, float f7) {
        e6 e6Var = this.B;
        float dpf2 = AndroidUtilities.dpf2(2.0f);
        MessageObject messageObject = this.m;
        boolean z10 = messageObject != null && messageObject.isContentUnread() && !this.m.isOut() && this.c <= 0.0f;
        this.u = z10;
        N.setColor(z10 ? this.q : this.o ? this.r : this.p);
        O.setColor(this.q);
        e6Var.a = this.n;
        float d = e6Var.d((!this.z || MediaController.getInstance().isPlayingMessage(this.m)) ? 0.0f : 1.0f, false);
        Paint paint = N;
        paint.setColor(i0.a.d(d, paint.getColor(), this.p));
        float f10 = 1.0f - d;
        O.setAlpha((int) (r3.getAlpha() * f10 * f7));
        N.setAlpha((int) (r3.getAlpha() * f7));
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
            this.C.setAlpha((int) (d * 255.0f * f7));
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

    public final void e(float f7) {
        this.s = f7;
    }

    public final void f() {
        g(0.0f, false);
    }

    public final void g(float f7, boolean z10) {
        if (!this.k.p3()) {
            this.c = 1.0f;
            return;
        }
        boolean z11 = this.u;
        this.c = z11 ? 1.0f : f7;
        int i10 = z11 ? this.g : this.a;
        if (z10 && i10 != 0 && f7 == 0.0f) {
            this.t = 0.0f;
        } else if (!z10) {
            this.t = 1.0f;
        }
        int ceil = (int) Math.ceil(this.g * f7);
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
