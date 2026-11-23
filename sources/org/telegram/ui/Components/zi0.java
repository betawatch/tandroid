package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.reflect.Array;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class zi0 extends View {
    public float A0;
    public float B0;
    public float C0;
    public final RectF D0;
    public final RectF E;
    public final Paint E0;
    public final RectF F;
    public LinearGradient F0;
    public final RectF G;
    public final Matrix G0;
    public final Path H;
    public float[] H0;
    public final RectF I;
    public final yu0 I0;
    public final RectF J;
    public final yu0 J0;
    public final RectF K;
    public final int[] K0;
    public int L;
    public final float[][] L0;
    public byte[] M;
    public final Paint M0;
    public final Path N;
    public int N0;
    public final d6 O;
    public float[] O0;
    public final d6 P;
    public float[] P0;
    public final RectF Q;
    public int Q0;
    public float R;
    public byte[] R0;
    public boolean S;
    public long S0;
    public boolean T;
    public Bitmap T0;
    public boolean U;
    public int U0;
    public boolean V;
    public long V0;
    public boolean W;
    public ve W0;
    public boolean X0;
    public final Paint Y0;
    public boolean Z0;
    public final org.telegram.ui.ActionBar.h6 a;
    public boolean a0;
    public boolean a1;
    public final Paint b;
    public boolean b0;
    public float b1;
    public final Paint c;
    public float c0;
    public boolean c1;
    public final Paint d;
    public boolean d0;
    public boolean d1;
    public final Paint e;
    public yi0 e0;
    public int e1;
    public final we0 f;
    public final RectF f0;
    public float f1;
    public final RectF g0;
    public boolean g1;
    public final n6 h;
    public final RectF h0;
    public final Paint i0;
    public final Paint j0;
    public final Paint k0;
    public final Paint l0;
    public final d6 m0;
    public i61 n;
    public final d6 n0;
    public final d6 o0;
    public boolean p0;
    public float q0;
    public float r;
    public float r0;
    public float s;
    public float s0;
    public final Path t0;
    public final Path u0;
    public final float[] v0;
    public float w;
    public final d6 w0;
    public boolean x;
    public final d6 x0;
    public final hb0 y;
    public final d6 y0;
    public float z0;

    public zi0(Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        this.b = new Paint(1);
        this.c = new Paint(1);
        this.d = new Paint(1);
        this.e = new Paint(1);
        this.s = 0.0f;
        this.w = 1.0f;
        this.x = false;
        this.y = new hb0(this, 16);
        this.E = new RectF();
        this.F = new RectF();
        this.G = new RectF();
        this.H = new Path();
        this.I = new RectF();
        this.J = new RectF();
        this.K = new RectF();
        this.N = new Path();
        nr nrVar = nr.h;
        this.O = new d6(this, 0L, 340L, nrVar);
        this.P = new d6(this, 0L, 340L, nrVar);
        this.Q = new RectF();
        this.R = -1.0f;
        this.S = true;
        this.f0 = new RectF();
        this.g0 = new RectF();
        this.h0 = new RectF();
        this.i0 = new Paint(1);
        this.j0 = new Paint(1);
        this.k0 = new Paint(1);
        this.l0 = new Paint(1);
        this.m0 = new d6(this, 0L, 340L, nrVar);
        this.n0 = new d6(this, 0L, 220L, nrVar);
        this.o0 = new d6(this, 0L, 260L, nrVar);
        this.s0 = 1.0f;
        this.t0 = new Path();
        this.u0 = new Path();
        this.v0 = new float[8];
        this.w0 = new d6(this, 0L, 160L, nr.g);
        this.x0 = new d6(this, 0L, 260L, nrVar);
        this.y0 = new d6(this, 0L, 200L, nrVar);
        this.D0 = new RectF();
        this.E0 = new Paint(1);
        this.G0 = new Matrix();
        this.H0 = new float[0];
        this.I0 = new yu0(2400);
        this.J0 = new yu0(2200);
        this.K0 = new int[6];
        this.L0 = (float[][]) Array.newInstance((Class<?>) Float.TYPE, 6, 0);
        this.M0 = new Paint(1);
        this.N0 = 625341585;
        this.O0 = new float[0];
        this.P0 = new float[0];
        this.Q0 = -1;
        this.Y0 = new Paint(2);
        this.e1 = -1;
        this.a = h6Var;
        we0 we0Var = new we0(12);
        this.f = we0Var;
        we0Var.f = this;
        we0Var.setCallback(this);
        n6 n6Var = new n6(false, false, false);
        this.h = n6Var;
        n6Var.n(0.5f, 200L, nrVar);
        n6Var.setCallback(this);
        n6Var.w(org.telegram.messenger.g0.L(12.0f));
        n6Var.x(org.telegram.messenger.g0.o());
        n6Var.N = org.telegram.messenger.g0.q.x;
    }

    public static float c(int i7) {
        int i10 = i7 * (-1640531535);
        int i11 = (i10 ^ (i10 >>> 15)) * (-2048144777);
        int i12 = (i11 ^ (i11 >>> 13)) * (-1028477379);
        return ((i12 ^ (i12 >>> 16)) >>> 8) / 1.6777216E7f;
    }

    public final void a(Canvas canvas, RectF rectF, float f10) {
        Paint paint;
        Paint paint2;
        n6 n6Var;
        we0 we0Var;
        Paint paint3;
        int i7;
        byte b10;
        byte b11;
        int i10;
        int i11;
        byte b12;
        float i12;
        if (this.d0) {
            b(canvas, rectF, f10);
            return;
        }
        int i13 = org.telegram.ui.ActionBar.m6.bg;
        org.telegram.ui.ActionBar.h6 h6Var = this.a;
        int w02 = org.telegram.ui.ActionBar.m6.w0(i13, h6Var);
        Paint paint4 = this.b;
        paint4.setColor(w02);
        int w03 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.cg, h6Var);
        Paint paint5 = this.c;
        paint5.setColor(w03);
        int i14 = org.telegram.ui.ActionBar.m6.Zf;
        int w04 = org.telegram.ui.ActionBar.m6.w0(i14, h6Var);
        n6 n6Var2 = this.h;
        n6Var2.u(w04);
        int w05 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Xf, h6Var);
        we0 we0Var2 = this.f;
        we0Var2.a.setColor(w05);
        int w06 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Yf, h6Var);
        Paint paint6 = this.d;
        paint6.setColor(w06);
        int w07 = org.telegram.ui.ActionBar.m6.w0(i14, h6Var);
        Paint paint7 = this.e;
        paint7.setColor(w07);
        int T1 = (int) org.telegram.messenger.g0.T1(rectF.left + org.telegram.messenger.g0.L(11.33f), rectF.right - org.telegram.messenger.g0.L(11.33f), Utilities.l(this.s));
        int T12 = (int) org.telegram.messenger.g0.T1(rectF.left + org.telegram.messenger.g0.L(11.33f), rectF.right - org.telegram.messenger.g0.L(11.33f), Utilities.l(this.w));
        int measuredWidth = getMeasuredWidth() - org.telegram.messenger.g0.L(27.0f);
        int i15 = this.L;
        Path path = this.N;
        if (i15 == measuredWidth) {
            paint = paint5;
            paint2 = paint4;
            n6Var = n6Var2;
            we0Var = we0Var2;
            paint3 = paint7;
            i7 = T12;
        } else {
            int L = measuredWidth / org.telegram.messenger.g0.L(3.0f);
            int L2 = org.telegram.messenger.g0.L(2.0f);
            paint = paint5;
            int L3 = org.telegram.messenger.g0.L(12.0f);
            paint2 = paint4;
            byte b13 = Byte.MAX_VALUE;
            n6Var = n6Var2;
            byte b14 = Byte.MIN_VALUE;
            we0Var = we0Var2;
            int i16 = 0;
            while (i16 < L) {
                Paint paint8 = paint7;
                byte[] bArr = this.M;
                if (bArr == null) {
                    i11 = i16;
                    i10 = T12;
                    b12 = 0;
                } else {
                    i10 = T12;
                    i11 = i16;
                    b12 = bArr[(int) ((i16 / L) * bArr.length)];
                }
                b13 = (byte) Math.min((int) b13, (int) b12);
                b14 = (byte) Math.max((int) b14, (int) b12);
                i16 = i11 + 1;
                paint7 = paint8;
                T12 = i10;
            }
            paint3 = paint7;
            i7 = T12;
            path.rewind();
            int i17 = 0;
            while (i17 < L) {
                byte[] bArr2 = this.M;
                if (bArr2 == null) {
                    b10 = b13;
                    b11 = 0;
                } else {
                    b10 = b13;
                    b11 = bArr2[(int) ((i17 / L) * bArr2.length)];
                }
                float W1 = org.telegram.messenger.g0.W1(Utilities.l((b11 - b10) / (b14 - b10)), L2, L3);
                float L4 = org.telegram.messenger.g0.L(3.0f) * i17;
                RectF rectF2 = org.telegram.messenger.g0.P;
                rectF2.set(L4, (-W1) / 2.0f, org.telegram.messenger.g0.L(2.0f) + L4, W1 / 2.0f);
                path.addRoundRect(rectF2, org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f), Path.Direction.CW);
                i17++;
                b13 = b10;
                L = L;
                L2 = L2;
            }
            this.L = measuredWidth;
        }
        canvas.save();
        Path path2 = this.H;
        path2.rewind();
        path2.addRoundRect(rectF, org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), Path.Direction.CW);
        canvas.clipPath(path2);
        Paint paint9 = paint;
        canvas.drawRect(rectF.left, rectF.top, T1 - org.telegram.messenger.g0.L(1.33f), rectF.bottom, paint9);
        canvas.drawRect(org.telegram.messenger.g0.L(1.33f) + i7, rectF.top, rectF.right, rectF.bottom, paint9);
        canvas.save();
        canvas.translate(rectF.left + org.telegram.messenger.g0.L(14.0f), rectF.centerY());
        int i18 = org.telegram.ui.ActionBar.m6.Yf;
        paint6.setColor(org.telegram.ui.ActionBar.m6.r1(0.3f, org.telegram.ui.ActionBar.m6.w0(i18, h6Var)));
        canvas.drawPath(path, paint6);
        canvas.restore();
        float f11 = T1;
        float f12 = i7;
        canvas.drawRect(f11, rectF.top, f12, rectF.bottom, paint2);
        if (this.a0) {
            i12 = this.c0;
        } else {
            i12 = Utilities.i(this.n != null ? r3.S() / this.n.U() : 1.0f, this.w, this.s);
        }
        float i19 = Utilities.i(org.telegram.messenger.g0.T1(rectF.left + org.telegram.messenger.g0.L(13.0f), rectF.right - org.telegram.messenger.g0.L(14.0f), i12), f12, f11);
        if (i19 < f12) {
            canvas.save();
            canvas.clipRect(i19, rectF.top, f12, rectF.bottom);
            canvas.translate(rectF.left + org.telegram.messenger.g0.L(14.0f), rectF.centerY());
            if (!this.x || i12 >= this.s || this.a0) {
                paint6.setColor(org.telegram.ui.ActionBar.m6.w0(i18, h6Var));
            } else {
                paint6.setColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Zf, h6Var));
            }
            canvas.drawPath(path, paint6);
            canvas.restore();
        }
        if (i19 > f11) {
            canvas.save();
            canvas.clipRect(f11, rectF.top, i19, rectF.bottom);
            canvas.translate(rectF.left + org.telegram.messenger.g0.L(14.0f), rectF.centerY());
            if (g() || this.x || this.a0) {
                paint6.setColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Zf, h6Var));
            } else {
                paint6.setColor(org.telegram.ui.ActionBar.m6.w0(i18, h6Var));
            }
            canvas.drawPath(path, paint6);
            canvas.restore();
        }
        float L5 = T1 - org.telegram.messenger.g0.L(7.0f);
        float centerY = rectF.centerY() - org.telegram.messenger.g0.L(5.33f);
        float L6 = T1 - org.telegram.messenger.g0.L(5.33f);
        float centerY2 = rectF.centerY() + org.telegram.messenger.g0.L(5.33f);
        RectF rectF3 = this.G;
        rectF3.set(L5, centerY, L6, centerY2);
        Paint paint10 = paint3;
        canvas.drawRoundRect(rectF3, rectF3.width() / 2.0f, rectF3.width() / 2.0f, paint10);
        rectF3.set(org.telegram.messenger.g0.L(5.33f) + i7, rectF.centerY() - org.telegram.messenger.g0.L(5.33f), org.telegram.messenger.g0.L(7.0f) + i7, rectF.centerY() + org.telegram.messenger.g0.L(5.33f));
        canvas.drawRoundRect(rectF3, rectF3.width() / 2.0f, rectF3.width() / 2.0f, paint10);
        this.J.set(T1 - org.telegram.messenger.g0.L(24.0f), 0.0f, org.telegram.messenger.g0.L(6.0f) + T1, getHeight());
        this.K.set(i7 - org.telegram.messenger.g0.L(6.0f), 0.0f, org.telegram.messenger.g0.L(24.0f) + i7, getHeight());
        float d = this.P.d(!this.a0);
        if (d > 0.0f) {
            float c10 = (int) (n6Var.c() + org.telegram.messenger.g0.L(30.0f));
            float d2 = this.O.d(c10 <= ((float) ((i7 - T1) - org.telegram.messenger.g0.L(8.0f))));
            float T13 = org.telegram.messenger.g0.T1(org.telegram.messenger.g0.L(24.0f), c10, d2);
            float f13 = T1 + i7;
            float f14 = (f13 - T13) / 2.0f;
            float L7 = org.telegram.messenger.g0.L(20.0f) / 2.0f;
            float centerY3 = rectF.centerY() - L7;
            float f15 = (f13 + T13) / 2.0f;
            float centerY4 = rectF.centerY() + L7;
            RectF rectF4 = this.F;
            rectF4.set(f14, centerY3, f15, centerY4);
            int alpha = paint9.getAlpha();
            paint9.setAlpha((int) (alpha * d));
            canvas.drawRoundRect(rectF4, rectF4.height() / 2.0f, rectF4.height() / 2.0f, paint9);
            paint9.setAlpha(alpha);
            RectF rectF5 = this.I;
            rectF5.set(rectF4);
            rectF5.inset(-org.telegram.messenger.g0.L(6.0f), -org.telegram.messenger.g0.L(6.0f));
            canvas.save();
            int L8 = org.telegram.messenger.g0.L(12.0f);
            canvas.translate(org.telegram.messenger.g0.T1(rectF4.centerX() - (L8 / 2.0f), rectF4.left + org.telegram.messenger.g0.L(6.0f), d2), rectF4.centerY());
            we0 we0Var3 = we0Var;
            we0Var3.setBounds(0, (-L8) / 2, L8, L8 / 2);
            we0Var3.g = (int) (d * 255.0f);
            we0Var3.draw(canvas);
            canvas.restore();
            if (d2 > 0.0f) {
                canvas.save();
                canvas.translate(rectF4.left + org.telegram.messenger.g0.L(21.66f), rectF4.centerY() - org.telegram.messenger.g0.L(1.0f));
                n6 n6Var3 = n6Var;
                n6Var3.setBounds(-1, -1, 1, 1);
                n6Var3.C = (int) (d2 * 255.0f * d);
                n6Var3.draw(canvas);
                canvas.restore();
            }
        }
        canvas.restore();
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0592  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0628 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:125:0x063b A[EDGE_INSN: B:125:0x063b->B:126:0x063b BREAK  A[LOOP:0: B:67:0x045a->B:114:0x0628], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x067b A[LOOP:2: B:127:0x0674->B:129:0x067b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0684 A[EDGE_INSN: B:130:0x0684->B:131:0x0684 BREAK  A[LOOP:2: B:127:0x0674->B:129:0x067b], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0692  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0917  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0962  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0a0f  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0a4b  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0a55  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0b1d  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0b2e  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0b5c  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x0b20  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x0a28  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x0937  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x044d  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x03dd  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0356  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x039f  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x03d8  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0449  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0463  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(Canvas canvas, RectF rectF, float f10) {
        Paint paint;
        d6 d6Var;
        float min;
        float f11;
        float f12;
        float f13;
        byte b10;
        byte b11;
        float f14;
        float f15;
        byte b12;
        float f16;
        float f17;
        float[][] fArr;
        float f18;
        RectF rectF2;
        float f19;
        boolean z10;
        int i7;
        yu0 yu0Var;
        int i10;
        int[] iArr;
        float f20;
        int i11;
        float f21;
        Paint paint2;
        float f22;
        Paint paint3;
        int i12;
        int i13;
        float f23;
        int i14;
        int i15;
        float d;
        float[] fArr2;
        float f24;
        float f25;
        boolean z11;
        Paint paint4;
        int i16;
        float f26;
        float f27;
        int i17;
        float f28;
        float[] fArr3;
        int i18;
        float f29;
        float f30;
        float f31;
        int i19;
        RectF rectF3;
        int i20;
        float f32;
        float f33;
        float max;
        float l10;
        if (this.X0) {
            return;
        }
        if (this.T0 != null) {
            float uptimeMillis = (SystemClock.uptimeMillis() - this.V0) / 760.0f;
            int width = this.T0.getWidth();
            float l11 = 1.0f - Utilities.l(uptimeMillis / 0.45f);
            float f34 = 1.0f - (l11 * l11);
            if (!this.Z0) {
                f34 = 1.0f - f34;
            }
            float f35 = f34 * width;
            canvas.save();
            if (this.Z0) {
                canvas.clipRect(f35, 0.0f, width, getHeight());
            } else {
                canvas.clipRect(0.0f, 0.0f, f35, getHeight());
            }
            Paint paint5 = this.Y0;
            paint5.setAlpha(org.telegram.messenger.ls.e4);
            canvas.drawBitmap(this.T0, 0.0f, 0.0f, paint5);
            canvas.restore();
            yu0 yu0Var2 = this.J0;
            yu0Var2.b(canvas, 1.0f);
            int i21 = this.U0;
            int min2 = i21 - Math.min(i21, yu0Var2.D);
            int i22 = this.U0;
            float f36 = i22 == 0 ? 1.0f : min2 / i22;
            ve veVar = this.W0;
            if (veVar != null) {
                ChatActivityEnterView chatActivityEnterView = veVar.a;
                chatActivityEnterView.E5 = f36;
                chatActivityEnterView.r();
                if (f36 < 0.98f) {
                    float sin = (((float) Math.sin(Utilities.i((f36 - 0.55f) / 0.43f, 1.0f, 0.0f) * 3.141592653589793d)) * 0.14f) + 1.0f;
                    chatActivityEnterView.h1.setScaleX(sin);
                    chatActivityEnterView.h1.setScaleY(sin);
                }
            }
            if ((uptimeMillis <= 1.0f || yu0Var2.D > 0) && uptimeMillis <= 1.6f) {
                postInvalidateOnAnimation();
                return;
            }
            yu0Var2.a();
            this.T0.recycle();
            this.T0 = null;
            this.W0 = null;
            this.X0 = true;
            if (veVar != null) {
                org.telegram.messenger.g0.g3(new hb0(veVar, 15));
                return;
            }
            return;
        }
        int w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Uf, this.a);
        int argb = Color.argb(org.telegram.messenger.ls.e4, Math.max(0, Color.red(w02) - 17), Math.max(0, Color.green(w02) - 18), Math.max(0, Color.blue(w02) - 18));
        int f37 = i0.a.f(0.46f, w02, -1);
        boolean z12 = this.p0;
        d6 d6Var2 = this.m0;
        d6Var2.d(z12);
        float d2 = this.n0.d(this.W);
        float d10 = this.y0.d(this.p0);
        float l12 = Utilities.l(f10);
        float f38 = 0.0f;
        float min3 = Math.min(rectF.height(), org.telegram.messenger.g0.L(32.0f));
        float f39 = rectF.left;
        float f40 = 0.55f;
        float f41 = min3 / 2.0f;
        float centerY = rectF.centerY() - f41;
        float f42 = 2.0f;
        float f43 = rectF.right;
        float centerY2 = rectF.centerY() + f41;
        RectF rectF4 = this.g0;
        rectF4.set(f39, centerY, f43, centerY2);
        float centerY3 = rectF4.centerY();
        float T1 = org.telegram.messenger.g0.T1(f41, Math.min(org.telegram.messenger.g0.L(9.0f), f41), Utilities.l((l12 - 0.4f) / 0.6f));
        float l13 = Utilities.l((l12 - 0.35f) / 0.65f) * this.s0;
        float L = org.telegram.messenger.g0.L(10.0f);
        this.B0 = rectF4.left + L + org.telegram.messenger.g0.L(4.0f);
        float L2 = (rectF4.right - L) - org.telegram.messenger.g0.L(4.0f);
        this.C0 = L2;
        float max2 = Math.max(1.0f, L2 - this.B0);
        float L3 = ((this.s * max2) + this.B0) - org.telegram.messenger.g0.L(4.0f);
        float L4 = org.telegram.messenger.g0.L(4.0f) + (this.w * max2) + this.B0;
        this.z0 = L3;
        this.A0 = L4;
        this.q0 = (L3 + L4) / 2.0f;
        this.r0 = rectF4.top;
        float f44 = L3 - L;
        float f45 = L4 + L;
        int r12 = org.telegram.ui.ActionBar.m6.r1(this.s0, w02);
        Paint paint6 = this.i0;
        paint6.setColor(r12);
        float f46 = rectF4.top;
        float f47 = rectF4.bottom;
        RectF rectF5 = this.h0;
        rectF5.set(f44, f46, f45, f47);
        canvas.drawRoundRect(rectF5, T1, T1, paint6);
        float f48 = d10;
        if (l13 <= 0.0f) {
            this.S0 = 0L;
            return;
        }
        long uptimeMillis2 = SystemClock.uptimeMillis();
        long j3 = this.S0;
        if (j3 == 0) {
            paint = paint6;
            d6Var = d6Var2;
            min = 16.0f;
        } else {
            paint = paint6;
            d6Var = d6Var2;
            min = Math.min(64L, uptimeMillis2 - j3);
        }
        this.S0 = uptimeMillis2;
        float f49 = min / 250.0f;
        int max3 = Math.max(12, (int) (max2 / org.telegram.messenger.g0.L(4.0f)));
        int i23 = this.Q0;
        float[][] fArr4 = this.L0;
        if (max3 == i23) {
            f11 = 0.5f;
            if (this.R0 == this.M) {
                f12 = min;
                f13 = f49;
                f14 = f44;
                float f50 = max3;
                f16 = max2 / f50;
                float min4 = Math.min(org.telegram.messenger.g0.L(2.0f), f16 * f11);
                float L5 = org.telegram.messenger.g0.L(2.0f);
                float L6 = org.telegram.messenger.g0.L(13.0f);
                if (this.a0) {
                    i61 i61Var = this.n;
                    if (i61Var == null || i61Var.U() <= 0) {
                        f17 = f45;
                        fArr = fArr4;
                        f18 = this.s;
                    } else if (g() || this.x) {
                        f17 = f45;
                        fArr = fArr4;
                        f18 = Utilities.i(this.n.S() / this.n.U(), this.w, this.s);
                    } else {
                        f18 = this.s;
                    }
                    float f51 = f18;
                    float e10 = this.o0.e(false, (!g() || this.x || this.a0) ? 1.0f : 0.0f);
                    n6 n6Var = this.h;
                    float L7 = org.telegram.messenger.g0.L(33.0f) + n6Var.c();
                    float f52 = L4 - L3;
                    float d11 = this.x0.d(L7 <= f52 - ((float) org.telegram.messenger.g0.L(8.0f)));
                    float T12 = org.telegram.messenger.g0.T1(org.telegram.messenger.g0.L(24.0f), L7, d11);
                    float L8 = org.telegram.messenger.g0.L(22.0f);
                    float f53 = this.q0;
                    float f54 = T12 / 2.0f;
                    float f55 = f53 - f54;
                    float f56 = L8 / 2.0f;
                    float f57 = centerY3 - f56;
                    float f58 = f53 + f54;
                    int i24 = argb;
                    rectF2 = this.D0;
                    rectF2.set(f55, f57, f58, centerY3 + f56);
                    canvas.save();
                    Path path = this.u0;
                    path.rewind();
                    rectF5.set(rectF2);
                    rectF5.inset(-org.telegram.messenger.g0.L(3.0f), -org.telegram.messenger.g0.L(3.0f));
                    path.addRoundRect(rectF5, rectF5.height() / 2.0f, rectF5.height() / 2.0f, Path.Direction.CW);
                    if (Build.VERSION.SDK_INT >= 26) {
                        canvas.clipOutPath(path);
                    } else {
                        canvas.clipPath(path, Region.Op.DIFFERENCE);
                    }
                    f19 = f12 / 300.0f;
                    z10 = false;
                    i7 = 0;
                    boolean z13 = false;
                    while (true) {
                        yu0Var = this.I0;
                        if (i7 >= max3) {
                            break;
                        }
                        float f59 = f19;
                        float f60 = i7;
                        float f61 = (f60 + f11) / f50;
                        float f62 = (f61 < this.s || f61 > this.w) ? 1.0f : f38;
                        boolean z14 = z10;
                        float f63 = this.P0[i7];
                        if (f63 != f62) {
                            f31 = f63;
                            f63 = f62 > f63 ? Math.min(f62, f31 + f13) : Math.max(f62, f31 - f59);
                            f30 = f62;
                            this.P0[i7] = f63;
                            z13 = true;
                        } else {
                            f30 = f62;
                            f31 = f63;
                        }
                        int i25 = (f30 > f38 ? 1 : (f30 == f38 ? 0 : -1));
                        if (i25 > 0) {
                            z14 = true;
                        }
                        if (f31 <= f38 && f63 > f38) {
                            d(i7);
                            if (i25 > 0) {
                                i19 = i25;
                                float T13 = org.telegram.messenger.g0.T1(L5, L6, this.O0[i7]);
                                i20 = i7;
                                float f64 = (f16 / f42) + (f60 * f16) + this.B0;
                                float f65 = f61 < (this.s + this.w) / f42 ? -1.0f : 1.0f;
                                int round = Math.round((this.O0[i20] * 44.0f) + 16.0f);
                                rectF3 = rectF2;
                                yu0Var.e(f());
                                int i26 = 0;
                                while (i26 < round) {
                                    int i27 = i26;
                                    float d12 = yu0Var.d() - f11;
                                    float d13 = ((yu0Var.d() - f11) * f16 * 1.1f) + f64;
                                    int i28 = round;
                                    float x10 = com.google.android.gms.internal.vision.e2.x(d12, T13, 1.05f, centerY3);
                                    float d14 = (yu0Var.d() + 0.3f) * org.telegram.messenger.g0.L(13.0f) * f65;
                                    yu0 yu0Var3 = this.I0;
                                    yu0Var3.g(d13, x10, ((yu0Var3.d() * 0.8f) + 0.4f) * d14, (d12 * org.telegram.messenger.g0.L(8.0f)) + ((-org.telegram.messenger.g0.L(5.0f)) - (yu0Var.d() * org.telegram.messenger.g0.L(17.0f))), (yu0Var.d() * 0.45f) + f40, yu0Var.d() * 0.05f);
                                    i26 = i27 + 1;
                                    round = i28;
                                    T13 = T13;
                                }
                                if (f63 >= 1.0f) {
                                    float T14 = org.telegram.messenger.g0.T1(L5, L6, this.O0[i20]);
                                    float A = com.google.android.gms.internal.vision.e2.A(f16, min4, f42, (f60 * f16) + this.B0);
                                    int f66 = (f61 > f51 || f61 < this.s) ? f37 : i0.a.f(e10, f37, -1);
                                    if (i19 > 0) {
                                        float interpolation = nr.g.getInterpolation(f63);
                                        float f67 = f40;
                                        f32 = T14;
                                        float T15 = org.telegram.messenger.g0.T1(1.0f, f67, interpolation);
                                        float f68 = 1.0f - interpolation;
                                        l10 = f68 * f68;
                                        f33 = f38;
                                        max = T15;
                                    } else {
                                        f32 = T14;
                                        float f69 = 1.0f - f63;
                                        float f70 = f69 - 1.0f;
                                        f33 = f38;
                                        max = Math.max(f33, (1.4f * f70 * f70) + (2.4f * f70 * f70 * f70) + 1.0f);
                                        l10 = Utilities.l(f69 * 2.5f);
                                    }
                                    if (l10 > f33 && max > f33) {
                                        float max4 = Math.max(min4, max * f32);
                                        int r13 = org.telegram.ui.ActionBar.m6.r1(l10 * l13, f66);
                                        Paint paint7 = this.j0;
                                        paint7.setColor(r13);
                                        float f71 = max4 / 2.0f;
                                        rectF5.set(A, centerY3 - f71, A + min4, f71 + centerY3);
                                        float f72 = min4 / 2.0f;
                                        canvas.drawRoundRect(rectF5, f72, f72, paint7);
                                    }
                                }
                                i7 = i20 + 1;
                                f19 = f59;
                                z10 = z14;
                                rectF2 = rectF3;
                                f42 = 2.0f;
                                f38 = 0.0f;
                                f40 = 0.55f;
                            }
                        }
                        i19 = i25;
                        rectF3 = rectF2;
                        i20 = i7;
                        if (f63 >= 1.0f) {
                        }
                        i7 = i20 + 1;
                        f19 = f59;
                        z10 = z14;
                        rectF2 = rectF3;
                        f42 = 2.0f;
                        f38 = 0.0f;
                        f40 = 0.55f;
                    }
                    boolean z15 = z10;
                    RectF rectF6 = rectF2;
                    canvas.restore();
                    float f73 = f12 / 1000.0f;
                    float pow = (float) Math.pow(0.2d, f73);
                    float L9 = org.telegram.messenger.g0.L(70.0f);
                    float L10 = org.telegram.messenger.g0.L(9.0f);
                    float L11 = f41 - org.telegram.messenger.g0.L(1.2f);
                    float L12 = org.telegram.messenger.g0.L(1.7f);
                    i10 = 0;
                    while (true) {
                        iArr = this.K0;
                        f20 = f16;
                        if (i10 >= 6) {
                            break;
                        }
                        iArr[i10] = 0;
                        i10++;
                        f16 = f20;
                    }
                    Paint.Cap cap = Paint.Cap.ROUND;
                    Paint paint8 = this.M0;
                    paint8.setStrokeCap(cap);
                    i11 = 0;
                    while (i11 < max3) {
                        float f74 = this.P0[i11];
                        if (f74 <= 0.0f) {
                            i16 = i11;
                            paint4 = paint8;
                            f26 = min4;
                            f27 = pow;
                            i17 = max3;
                        } else {
                            paint4 = paint8;
                            float f75 = i11;
                            float f76 = (f75 + f11) / f50;
                            i16 = i11;
                            boolean z16 = f76 >= this.s && f76 <= this.w;
                            float T16 = org.telegram.messenger.g0.T1(L5, L6, this.O0[i16]);
                            float f77 = (f20 / 2.0f) + (f75 * f20) + this.B0;
                            float l14 = Utilities.l((f76 < (this.s + this.w) / 2.0f ? f14 - f77 : f77 - f17) / org.telegram.messenger.g0.L(52.0f));
                            f26 = min4;
                            float f78 = 1.0f - (l14 * 0.35f);
                            f27 = pow;
                            int max5 = Math.max(3, Math.min(18, Math.round((this.O0[i16] * 13.0f * f78) + 5.0f)));
                            float interpolation2 = (z16 ? nr.j : nr.g).getInterpolation(f74);
                            boolean z17 = f74 >= 1.0f;
                            i17 = max3;
                            int i29 = 0;
                            while (i29 < max5) {
                                int i30 = ((i16 * 18) + i29) * 10;
                                int i31 = max5;
                                float[] fArr5 = this.H0;
                                int i32 = i30 + 4;
                                float f79 = fArr5[i32] + f73;
                                fArr5[i32] = f79;
                                int i33 = i30 + 5;
                                if (f79 >= fArr5[i33]) {
                                    int i34 = i30 + 6;
                                    boolean isNaN = Float.isNaN(fArr5[i34]);
                                    fArr3 = fArr5;
                                    i18 = i29;
                                    f29 = L5;
                                    fArr3[i34] = com.google.android.gms.internal.vision.e2.B(l14, org.telegram.messenger.g0.L(10.0f), f26 + org.telegram.messenger.g0.L(1.0f), h() - f11);
                                    int i35 = i30 + 7;
                                    fArr3[i35] = com.google.android.gms.internal.vision.e2.B(l14, 0.6f, 1.0f, (h() - f11) * T16);
                                    if (isNaN) {
                                        fArr3[i30] = (h() - f11) * f26;
                                        fArr3[i30 + 1] = fArr3[i30 + 9] * T16;
                                        f28 = l14;
                                    } else {
                                        fArr3[i30] = ((h() - f11) * org.telegram.messenger.g0.L(2.0f)) + fArr3[i34];
                                        f28 = l14;
                                        fArr3[i30 + 1] = ((h() - f11) * org.telegram.messenger.g0.L(2.0f)) + fArr3[i35];
                                    }
                                    fArr3[i30 + 2] = (h() - f11) * org.telegram.messenger.g0.L(6.0f);
                                    fArr3[i30 + 3] = (h() - f11) * org.telegram.messenger.g0.L(6.0f);
                                    fArr3[i33] = (h() * 1.3f) + 0.7f;
                                    fArr3[i32] = isNaN ? h() * fArr3[i33] * f11 : 0.0f;
                                    fArr3[i30 + 8] = ((h() * 0.45f) + 0.2f) * f78;
                                } else {
                                    f28 = l14;
                                    fArr3 = fArr5;
                                    i18 = i29;
                                    f29 = L5;
                                }
                                int i36 = i30 + 2;
                                fArr3[i36] = ((((fArr3[i30 + 6] - fArr3[i30]) * 3.2f) + ((h() - f11) * L9)) * f73) + fArr3[i36];
                                int i37 = i30 + 3;
                                int i38 = i30 + 1;
                                fArr3[i37] = ((((fArr3[i30 + 7] - fArr3[i38]) * 3.2f) + ((h() - f11) * L9)) * f73) + fArr3[i37];
                                float f80 = -L10;
                                fArr3[i36] = Utilities.i(fArr3[i36] * f27, L10, f80);
                                fArr3[i37] = Utilities.i(fArr3[i37] * f27, L10, f80);
                                fArr3[i30] = (fArr3[i36] * f73) + fArr3[i30];
                                fArr3[i38] = Utilities.i((fArr3[i37] * f73) + fArr3[i38], L11, -L11);
                                float sin2 = fArr3[i30 + 8] * ((float) Math.sin(Utilities.l(fArr3[i32] / fArr3[i33]) * 3.141592653589793d));
                                float T17 = org.telegram.messenger.g0.T1(f77, fArr3[i30] + f77, interpolation2);
                                float T18 = org.telegram.messenger.g0.T1((fArr3[i30 + 9] * T16) + centerY3, fArr3[i38] + centerY3, interpolation2);
                                if (z17) {
                                    float f81 = sin2 * l13;
                                    if (f81 >= 0.02f) {
                                        int min5 = Math.min(5, (int) ((f81 * 6.0f) / 0.6f));
                                        int i39 = iArr[min5];
                                        float[] fArr6 = fArr[min5];
                                        fArr6[i39] = T17;
                                        fArr6[i39 + 1] = T18;
                                        iArr[min5] = i39 + 2;
                                    }
                                }
                                i29 = i18 + 1;
                                max5 = i31;
                                l14 = f28;
                                L5 = f29;
                            }
                        }
                        i11 = i16 + 1;
                        paint8 = paint4;
                        min4 = f26;
                        max3 = i17;
                        pow = f27;
                        L5 = L5;
                    }
                    Paint paint9 = paint8;
                    canvas.save();
                    canvas.clipRect(rectF4);
                    if (Build.VERSION.SDK_INT >= 26) {
                        canvas.clipOutRect(f14 + org.telegram.messenger.g0.L(2.0f), rectF4.top, f17 - org.telegram.messenger.g0.L(2.0f), rectF4.bottom);
                        f21 = l13;
                        paint2 = paint;
                        f22 = f14;
                        paint3 = paint9;
                    } else {
                        f21 = l13;
                        paint2 = paint;
                        f22 = f14;
                        paint3 = paint9;
                        canvas.clipRect(f14 + org.telegram.messenger.g0.L(2.0f), rectF4.top, f17 - org.telegram.messenger.g0.L(2.0f), rectF4.bottom, Region.Op.DIFFERENCE);
                    }
                    boolean f82 = f();
                    i12 = 0;
                    while (i12 < 6) {
                        if (iArr[i12] == 0) {
                            z11 = f82;
                        } else {
                            float f83 = ((i12 + f11) / 6.0f) * 0.6f;
                            if (f82) {
                                int i40 = (i12 & 1) == 0 ? -8596225 : -5708033;
                                z11 = f82;
                                paint3.setColor(org.telegram.ui.ActionBar.m6.r1(Math.min(1.0f, f83 * 0.45f), i40));
                                paint3.setStrokeWidth(2.6f * L12);
                                canvas.drawPoints(fArr[i12], 0, iArr[i12], paint3);
                                if (i12 >= 4) {
                                    i40 = -1379073;
                                }
                                paint3.setColor(org.telegram.ui.ActionBar.m6.r1(Math.min(1.0f, f83 * 1.6f), i40));
                                paint3.setStrokeWidth(L12 * 0.8f);
                            } else {
                                z11 = f82;
                                paint3.setColor(org.telegram.ui.ActionBar.m6.r1(Math.min(1.0f, f83 * 1.6f), i12 >= 4 ? -11554059 : (i12 & 1) == 0 ? -15233051 : -14054705));
                                paint3.setStrokeWidth(Math.max(1.0f, org.telegram.messenger.g0.L(1.0f)));
                            }
                            canvas.drawPoints(fArr[i12], 0, iArr[i12], paint3);
                        }
                        i12++;
                        f82 = z11;
                    }
                    canvas.restore();
                    canvas.save();
                    if (Build.VERSION.SDK_INT >= 26) {
                        canvas.clipOutRect(f22, rectF4.top - org.telegram.messenger.g0.L(40.0f), f17, rectF4.bottom + org.telegram.messenger.g0.L(40.0f));
                        f23 = f22;
                        i13 = 4;
                    } else {
                        float f84 = f22;
                        i13 = 4;
                        canvas.clipRect(f84, rectF4.top - org.telegram.messenger.g0.L(40.0f), f17, rectF4.bottom + org.telegram.messenger.g0.L(40.0f), Region.Op.DIFFERENCE);
                        f23 = f84;
                    }
                    if (yu0Var.b(canvas, f21)) {
                        z13 = true;
                    }
                    canvas.restore();
                    i15 = 0;
                    for (i14 = 2; i15 < i14; i14 = 2) {
                        float f85 = i15 == 0 ? f23 : L4;
                        float f86 = f85 + L;
                        int i41 = 0;
                        while (true) {
                            fArr2 = this.v0;
                            if (i41 >= 8) {
                                break;
                            }
                            fArr2[i41] = 0.0f;
                            i41++;
                        }
                        if (i15 == 0) {
                            fArr2[7] = T1;
                            fArr2[6] = T1;
                            fArr2[1] = T1;
                            fArr2[0] = T1;
                        } else {
                            fArr2[5] = T1;
                            fArr2[i13] = T1;
                            fArr2[3] = T1;
                            fArr2[2] = T1;
                        }
                        Path path2 = this.t0;
                        path2.rewind();
                        rectF5.set(f85, rectF4.top, f86, rectF4.bottom);
                        path2.addRoundRect(rectF5, fArr2, Path.Direction.CW);
                        int i42 = i24;
                        paint2.setColor(org.telegram.ui.ActionBar.m6.r1(f21, i42));
                        canvas.drawPath(path2, paint2);
                        boolean z18 = this.p0 && this.e1 == i15;
                        float L13 = org.telegram.messenger.g0.L(10.0f);
                        if (z18) {
                            f24 = f48;
                            f25 = org.telegram.messenger.g0.T1(1.0f, 1.2f, f24);
                        } else {
                            f24 = f48;
                            f25 = 1.0f;
                        }
                        paint2.setColor(org.telegram.ui.ActionBar.m6.r1(f21 * 0.8f, -1));
                        float f87 = (f85 + f86) / 2.0f;
                        float f88 = (L13 * f25) / 2.0f;
                        rectF5.set(f87 - org.telegram.messenger.g0.L(0.8f), centerY3 - f88, f87 + org.telegram.messenger.g0.L(0.8f), f88 + centerY3);
                        canvas.drawRoundRect(rectF5, org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f), paint2);
                        i15++;
                        f48 = f24;
                        i24 = i42;
                    }
                    d = this.w0.d(f52 >= ((float) (org.telegram.messenger.g0.L(6.0f) + org.telegram.messenger.g0.L(24.0f))));
                    if (d <= 0.01f) {
                        yi0 yi0Var = this.e0;
                        if (yi0Var != null && (d6Var.c > 0.0f || this.p0)) {
                            ChatActivityEnterView chatActivityEnterView2 = ((je) yi0Var).b;
                            rg rgVar = chatActivityEnterView2.E2;
                            if (rgVar != null) {
                                rgVar.invalidate();
                            }
                            chatActivityEnterView2.invalidate();
                        }
                        if (z13 || z15) {
                            postInvalidateOnAnimation();
                            return;
                        } else {
                            this.S0 = 0L;
                            return;
                        }
                    }
                    d6 d6Var3 = d6Var;
                    float f89 = f21 * d;
                    float T19 = org.telegram.messenger.g0.T1(f11, 1.0f, d) * (1.0f - (d2 * 0.06f));
                    canvas.save();
                    canvas.scale(T19, T19, rectF6.centerX(), rectF6.centerY());
                    paint2.setColor(org.telegram.ui.ActionBar.m6.r1(0.16f * f89, -1));
                    canvas.drawRoundRect(rectF6, f56, f56, paint2);
                    LinearGradient linearGradient = this.F0;
                    Paint paint10 = this.E0;
                    if (linearGradient == null) {
                        float[] fArr7 = new float[i13];
                        // fill-array-data instruction
                        fArr7[0] = 0.0f;
                        fArr7[1] = 0.45f;
                        fArr7[2] = 0.75f;
                        fArr7[3] = 1.0f;
                        LinearGradient linearGradient2 = new LinearGradient(0.0f, 0.0f, 0.0f, 1.0f, new int[]{-419430401, 1090519039, 352321535, 1509949439}, fArr7, Shader.TileMode.CLAMP);
                        this.F0 = linearGradient2;
                        paint10.setShader(linearGradient2);
                    }
                    float height = rectF6.height();
                    Matrix matrix = this.G0;
                    matrix.setScale(1.0f, height);
                    matrix.postTranslate(0.0f, rectF6.top);
                    this.F0.setLocalMatrix(matrix);
                    paint10.setStyle(Paint.Style.STROKE);
                    paint10.setStrokeWidth(Math.max(1.0f, org.telegram.messenger.g0.N(0.75f)));
                    paint10.setColor(-1);
                    float f90 = f89 * 255.0f;
                    int i43 = (int) f90;
                    paint10.setAlpha(i43);
                    rectF5.set(rectF6);
                    rectF5.inset(org.telegram.messenger.g0.N(0.4f), org.telegram.messenger.g0.N(0.4f));
                    canvas.drawRoundRect(rectF5, rectF5.height() / 2.0f, rectF5.height() / 2.0f, paint10);
                    int L14 = org.telegram.messenger.g0.L(12.0f);
                    canvas.save();
                    canvas.translate(org.telegram.messenger.g0.T1(rectF6.centerX() - (L14 / 2.0f), rectF6.left + org.telegram.messenger.g0.L(7.0f), d11), centerY3);
                    we0 we0Var = this.f;
                    we0Var.a.setColor(-1);
                    we0Var.setBounds(0, (-L14) / 2, L14, L14 / 2);
                    we0Var.g = i43;
                    we0Var.draw(canvas);
                    canvas.restore();
                    if (d11 > 0.0f) {
                        n6Var.u(-1);
                        n6Var.C = (int) (f90 * d11);
                        canvas.save();
                        canvas.translate(rectF6.left + org.telegram.messenger.g0.L(24.0f), centerY3 - org.telegram.messenger.g0.L(1.0f));
                        n6Var.setBounds(-1, -1, 1, 1);
                        n6Var.draw(canvas);
                        canvas.restore();
                    }
                    canvas.restore();
                    yi0 yi0Var2 = this.e0;
                    if (yi0Var2 != null && (d6Var3.c > 0.0f || this.p0)) {
                        ChatActivityEnterView chatActivityEnterView3 = ((je) yi0Var2).b;
                        rg rgVar2 = chatActivityEnterView3.E2;
                        if (rgVar2 != null) {
                            rgVar2.invalidate();
                        }
                        chatActivityEnterView3.invalidate();
                    }
                    if (z13 || z15) {
                        postInvalidateOnAnimation();
                        return;
                    } else {
                        this.S0 = 0L;
                        return;
                    }
                }
                f18 = this.c0;
                f17 = f45;
                fArr = fArr4;
                float f512 = f18;
                float e102 = this.o0.e(false, (!g() || this.x || this.a0) ? 1.0f : 0.0f);
                n6 n6Var2 = this.h;
                float L72 = org.telegram.messenger.g0.L(33.0f) + n6Var2.c();
                float f522 = L4 - L3;
                float d112 = this.x0.d(L72 <= f522 - ((float) org.telegram.messenger.g0.L(8.0f)));
                float T122 = org.telegram.messenger.g0.T1(org.telegram.messenger.g0.L(24.0f), L72, d112);
                float L82 = org.telegram.messenger.g0.L(22.0f);
                float f532 = this.q0;
                float f542 = T122 / 2.0f;
                float f552 = f532 - f542;
                float f562 = L82 / 2.0f;
                float f572 = centerY3 - f562;
                float f582 = f532 + f542;
                int i242 = argb;
                rectF2 = this.D0;
                rectF2.set(f552, f572, f582, centerY3 + f562);
                canvas.save();
                Path path3 = this.u0;
                path3.rewind();
                rectF5.set(rectF2);
                rectF5.inset(-org.telegram.messenger.g0.L(3.0f), -org.telegram.messenger.g0.L(3.0f));
                path3.addRoundRect(rectF5, rectF5.height() / 2.0f, rectF5.height() / 2.0f, Path.Direction.CW);
                if (Build.VERSION.SDK_INT >= 26) {
                }
                f19 = f12 / 300.0f;
                z10 = false;
                i7 = 0;
                boolean z132 = false;
                while (true) {
                    yu0Var = this.I0;
                    if (i7 >= max3) {
                    }
                    i7 = i20 + 1;
                    f19 = f59;
                    z10 = z14;
                    rectF2 = rectF3;
                    f42 = 2.0f;
                    f38 = 0.0f;
                    f40 = 0.55f;
                }
                boolean z152 = z10;
                RectF rectF62 = rectF2;
                canvas.restore();
                float f732 = f12 / 1000.0f;
                float pow2 = (float) Math.pow(0.2d, f732);
                float L92 = org.telegram.messenger.g0.L(70.0f);
                float L102 = org.telegram.messenger.g0.L(9.0f);
                float L112 = f41 - org.telegram.messenger.g0.L(1.2f);
                float L122 = org.telegram.messenger.g0.L(1.7f);
                i10 = 0;
                while (true) {
                    iArr = this.K0;
                    f20 = f16;
                    if (i10 >= 6) {
                    }
                    iArr[i10] = 0;
                    i10++;
                    f16 = f20;
                }
                Paint.Cap cap2 = Paint.Cap.ROUND;
                Paint paint82 = this.M0;
                paint82.setStrokeCap(cap2);
                i11 = 0;
                while (i11 < max3) {
                }
                Paint paint92 = paint82;
                canvas.save();
                canvas.clipRect(rectF4);
                if (Build.VERSION.SDK_INT >= 26) {
                }
                boolean f822 = f();
                i12 = 0;
                while (i12 < 6) {
                }
                canvas.restore();
                canvas.save();
                if (Build.VERSION.SDK_INT >= 26) {
                }
                if (yu0Var.b(canvas, f21)) {
                }
                canvas.restore();
                i15 = 0;
                while (i15 < i14) {
                }
                d = this.w0.d(f522 >= ((float) (org.telegram.messenger.g0.L(6.0f) + org.telegram.messenger.g0.L(24.0f))));
                if (d <= 0.01f) {
                }
            }
        } else {
            f11 = 0.5f;
        }
        if (this.O0.length < max3) {
            float[] fArr8 = new float[max3];
            float[] fArr9 = this.P0;
            f12 = min;
            f13 = f49;
            System.arraycopy(fArr9, 0, fArr8, 0, Math.min(fArr9.length, max3));
            this.P0 = fArr8;
            this.O0 = new float[max3];
            this.H0 = new float[max3 * org.telegram.messenger.ls.K2];
            for (int i44 = 0; i44 < 6; i44++) {
                fArr4[i44] = new float[max3 * 36];
            }
            for (int i45 = 0; i45 < max3; i45++) {
                d(i45);
            }
        } else {
            f12 = min;
            f13 = f49;
        }
        byte[] bArr = this.M;
        if (bArr == null || bArr.length <= 0) {
            b10 = 1;
            b11 = 0;
        } else {
            int length = bArr.length;
            b10 = Byte.MIN_VALUE;
            b11 = Byte.MAX_VALUE;
            int i46 = 0;
            while (i46 < length) {
                int i47 = length;
                byte b13 = bArr[i46];
                b11 = (byte) Math.min((int) b11, (int) b13);
                b10 = (byte) Math.max((int) b10, (int) b13);
                i46++;
                length = i47;
            }
        }
        int i48 = 0;
        while (i48 < max3) {
            byte b14 = b11;
            float f91 = (i48 + f11) / max3;
            byte[] bArr2 = this.M;
            int i49 = i48;
            if (bArr2 == null || bArr2.length == 0) {
                f15 = f44;
                b12 = 0;
            } else {
                f15 = f44;
                b12 = bArr2[Math.min(bArr2.length - 1, (int) (bArr2.length * f91))];
            }
            float[] fArr10 = this.O0;
            Typeface typeface = org.telegram.messenger.g0.a;
            fArr10[i49] = Utilities.l((b12 - b14) / (b10 - b14));
            if (this.Q0 != max3) {
                this.P0[i49] = (f91 < this.s || f91 > this.w) ? 1.0f : 0.0f;
            }
            i48 = i49 + 1;
            b11 = b14;
            f44 = f15;
        }
        f14 = f44;
        this.Q0 = max3;
        this.R0 = this.M;
        float f502 = max3;
        f16 = max2 / f502;
        float min42 = Math.min(org.telegram.messenger.g0.L(2.0f), f16 * f11);
        float L52 = org.telegram.messenger.g0.L(2.0f);
        float L62 = org.telegram.messenger.g0.L(13.0f);
        if (this.a0) {
        }
        f17 = f45;
        fArr = fArr4;
        float f5122 = f18;
        float e1022 = this.o0.e(false, (!g() || this.x || this.a0) ? 1.0f : 0.0f);
        n6 n6Var22 = this.h;
        float L722 = org.telegram.messenger.g0.L(33.0f) + n6Var22.c();
        float f5222 = L4 - L3;
        float d1122 = this.x0.d(L722 <= f5222 - ((float) org.telegram.messenger.g0.L(8.0f)));
        float T1222 = org.telegram.messenger.g0.T1(org.telegram.messenger.g0.L(24.0f), L722, d1122);
        float L822 = org.telegram.messenger.g0.L(22.0f);
        float f5322 = this.q0;
        float f5422 = T1222 / 2.0f;
        float f5522 = f5322 - f5422;
        float f5622 = L822 / 2.0f;
        float f5722 = centerY3 - f5622;
        float f5822 = f5322 + f5422;
        int i2422 = argb;
        rectF2 = this.D0;
        rectF2.set(f5522, f5722, f5822, centerY3 + f5622);
        canvas.save();
        Path path32 = this.u0;
        path32.rewind();
        rectF5.set(rectF2);
        rectF5.inset(-org.telegram.messenger.g0.L(3.0f), -org.telegram.messenger.g0.L(3.0f));
        path32.addRoundRect(rectF5, rectF5.height() / 2.0f, rectF5.height() / 2.0f, Path.Direction.CW);
        if (Build.VERSION.SDK_INT >= 26) {
        }
        f19 = f12 / 300.0f;
        z10 = false;
        i7 = 0;
        boolean z1322 = false;
        while (true) {
            yu0Var = this.I0;
            if (i7 >= max3) {
            }
            i7 = i20 + 1;
            f19 = f59;
            z10 = z14;
            rectF2 = rectF3;
            f42 = 2.0f;
            f38 = 0.0f;
            f40 = 0.55f;
        }
        boolean z1522 = z10;
        RectF rectF622 = rectF2;
        canvas.restore();
        float f7322 = f12 / 1000.0f;
        float pow22 = (float) Math.pow(0.2d, f7322);
        float L922 = org.telegram.messenger.g0.L(70.0f);
        float L1022 = org.telegram.messenger.g0.L(9.0f);
        float L1122 = f41 - org.telegram.messenger.g0.L(1.2f);
        float L1222 = org.telegram.messenger.g0.L(1.7f);
        i10 = 0;
        while (true) {
            iArr = this.K0;
            f20 = f16;
            if (i10 >= 6) {
            }
            iArr[i10] = 0;
            i10++;
            f16 = f20;
        }
        Paint.Cap cap22 = Paint.Cap.ROUND;
        Paint paint822 = this.M0;
        paint822.setStrokeCap(cap22);
        i11 = 0;
        while (i11 < max3) {
        }
        Paint paint922 = paint822;
        canvas.save();
        canvas.clipRect(rectF4);
        if (Build.VERSION.SDK_INT >= 26) {
        }
        boolean f8222 = f();
        i12 = 0;
        while (i12 < 6) {
        }
        canvas.restore();
        canvas.save();
        if (Build.VERSION.SDK_INT >= 26) {
        }
        if (yu0Var.b(canvas, f21)) {
        }
        canvas.restore();
        i15 = 0;
        while (i15 < i14) {
        }
        d = this.w0.d(f5222 >= ((float) (org.telegram.messenger.g0.L(6.0f) + org.telegram.messenger.g0.L(24.0f))));
        if (d <= 0.01f) {
        }
    }

    public final void d(int i7) {
        for (int i10 = 0; i10 < 18; i10++) {
            int i11 = ((18 * i7) + i10) * 10;
            this.H0[i11 + 9] = h() - 0.5f;
            float[] fArr = this.H0;
            fArr[i11 + 5] = 0.0f;
            fArr[i11 + 4] = 1.0f;
            fArr[i11 + 6] = Float.NaN;
        }
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        boolean z10 = this.d0;
        if (z10 && !this.S) {
            float f10 = this.R;
            if (f10 >= 0.0f) {
                a(canvas, this.Q, f10);
                return;
            }
        }
        if (this.S) {
            if (!z10) {
                a(canvas, this.E, 1.0f);
                return;
            }
            float width = getWidth();
            float height = getHeight();
            RectF rectF = this.f0;
            rectF.set(0.0f, 0.0f, width, height);
            a(canvas, rectF, 1.0f);
        }
    }

    @Override // android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        i61 i61Var;
        if (!this.d0) {
            boolean contains = this.I.contains(motionEvent.getX(), motionEvent.getY());
            RectF rectF = this.J;
            boolean z10 = !contains && rectF.contains(motionEvent.getX(), motionEvent.getY());
            RectF rectF2 = this.K;
            boolean z11 = !contains && rectF2.contains(motionEvent.getX(), motionEvent.getY());
            boolean z12 = (contains || z10 || z11 || motionEvent.getX() <= rectF.right || motionEvent.getX() >= rectF2.left) ? false : true;
            if (motionEvent.getAction() == 0) {
                this.W = contains;
                this.U = z10;
                this.V = z11;
                if (z10 || z11) {
                    this.b0 = g();
                    setPlaying(false);
                }
                this.a0 = z12;
                if (z12) {
                    this.b0 = g();
                    this.c0 = this.n != null ? r0.S() / this.n.U() : 1.0f;
                    setPlaying(false);
                }
                if (getParent() != null && (this.W || this.U || this.V || this.a0)) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                }
            } else if (motionEvent.getAction() == 2) {
                boolean z13 = this.U;
                RectF rectF3 = this.E;
                if (z13) {
                    this.s = Utilities.i(org.telegram.messenger.g0.z1(motionEvent.getX(), rectF3.left + org.telegram.messenger.g0.L(11.33f), rectF3.right - org.telegram.messenger.g0.L(11.33f)), Utilities.l(this.w - Math.max(1.0f / this.r, org.telegram.messenger.g0.L(30.0f) / (rectF3.width() - org.telegram.messenger.g0.L(22.66f)))), 0.0f);
                    invalidate();
                } else if (this.V) {
                    this.w = Utilities.i(org.telegram.messenger.g0.z1(motionEvent.getX(), rectF3.left + org.telegram.messenger.g0.L(11.33f), rectF3.right - org.telegram.messenger.g0.L(11.33f)), 1.0f, Utilities.l(Math.max(1.0f / this.r, org.telegram.messenger.g0.L(30.0f) / (rectF3.width() - org.telegram.messenger.g0.L(22.66f))) + this.s));
                    invalidate();
                } else if (this.a0) {
                    i61 i61Var2 = this.n;
                    if (i61Var2 != null) {
                        float i7 = Utilities.i(org.telegram.messenger.g0.z1(motionEvent.getX(), rectF3.left + org.telegram.messenger.g0.L(11.33f), rectF3.right - org.telegram.messenger.g0.L(11.33f)), this.w, this.s);
                        this.c0 = i7;
                        i61Var2.q0((long) (i7 * this.n.U()), false);
                    }
                    invalidate();
                }
                this.h.t(org.telegram.messenger.g0.g0(Math.round(Math.max(1.0f, (this.w - this.s) * this.r)), false, false), false, true);
            } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                if (motionEvent.getAction() == 1 && this.W) {
                    setPlaying(!g());
                } else if (this.U && this.x) {
                    i61 i61Var3 = this.n;
                    if (i61Var3 != null) {
                        i61Var3.q0((long) (this.s * i61Var3.U()), false);
                    }
                    setPlaying(true);
                } else if (this.V && this.x) {
                    i61 i61Var4 = this.n;
                    if (i61Var4 != null) {
                        i61Var4.q0(Math.max((long) (this.s * i61Var4.U()), ((long) (this.w * this.n.U())) - 1500), false);
                    }
                    setPlaying(true);
                } else if (this.a0 && !g()) {
                    setPlaying(true);
                }
                this.W = false;
                this.U = false;
                this.V = false;
                this.a0 = false;
            }
            return this.W || this.U || this.V || this.a0 || super.dispatchTouchEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        if (this.T0 != null || this.X0) {
            if (actionMasked != 0) {
                return this.c1;
            }
        } else if (actionMasked == 0) {
            RectF rectF4 = this.g0;
            if (y10 >= rectF4.top - org.telegram.messenger.g0.L(10.0f) && y10 <= rectF4.bottom + org.telegram.messenger.g0.L(10.0f) && x10 >= rectF4.left - org.telegram.messenger.g0.L(8.0f) && x10 <= rectF4.right + org.telegram.messenger.g0.L(8.0f)) {
                this.b1 = x10;
                this.d1 = false;
                this.e1 = -1;
                float L = org.telegram.messenger.g0.L(10.0f) / 2.0f;
                float f10 = this.z0 - L;
                float f11 = this.A0 + L;
                float abs = Math.abs(x10 - f10);
                float abs2 = Math.abs(x10 - f11);
                if (Math.min(abs, abs2) >= org.telegram.messenger.g0.L(22.0f) || this.D0.contains(x10, y10)) {
                    this.W = true;
                } else {
                    int i10 = abs <= abs2 ? 0 : 1;
                    this.e1 = i10;
                    this.f1 = x10 - (i10 == 0 ? this.z0 : this.A0);
                    this.p0 = true;
                    this.g1 = g();
                    setPlaying(false);
                    yi0 yi0Var = this.e0;
                    if (yi0Var != null) {
                        ((je) yi0Var).a(true);
                    }
                    try {
                        performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                }
                this.c1 = true;
                if (getParent() != null) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                }
                invalidate();
                return true;
            }
        } else if (actionMasked == 2) {
            if (this.c1) {
                float max = Math.max(1.0f, this.C0 - this.B0);
                if (this.p0) {
                    float max2 = Math.max(1.0f / Math.max(1.0f, this.r), org.telegram.messenger.g0.L(40.0f) / max);
                    float f12 = x10 - this.f1;
                    if (this.e1 == 0) {
                        this.s = Utilities.i(((f12 + org.telegram.messenger.g0.L(4.0f)) - this.B0) / max, this.w - max2, 0.0f);
                    } else {
                        this.w = Utilities.i(((f12 - org.telegram.messenger.g0.L(4.0f)) - this.B0) / max, 1.0f, this.s + max2);
                    }
                    i(true);
                    invalidate();
                    return true;
                }
                float scaledTouchSlop = ViewConfiguration.get(getContext()).getScaledTouchSlop();
                if (!this.d1 && Math.abs(x10 - this.b1) > scaledTouchSlop) {
                    this.W = false;
                    this.d1 = true;
                    this.a0 = true;
                    this.b0 = g();
                    i61 i61Var5 = this.n;
                    if (i61Var5 != null) {
                        i61Var5.u0(false);
                    }
                }
                if (this.d1) {
                    this.c0 = Utilities.i((x10 - this.B0) / max, this.w, this.s);
                    i61 i61Var6 = this.n;
                    if (i61Var6 != null && i61Var6.U() > 0) {
                        this.n.q0((long) (this.c0 * r13.U()), false);
                    }
                    this.x = true;
                    invalidate();
                    return true;
                }
            }
        } else {
            if (actionMasked != 1 && actionMasked != 3) {
                return this.c1;
            }
            if (this.c1) {
                if (this.p0) {
                    this.p0 = false;
                    i61 i61Var7 = this.n;
                    if (i61Var7 != null && i61Var7.U() > 0) {
                        this.n.q0((long) (this.s * r13.U()), false);
                    }
                    if (this.g1) {
                        setPlaying(true);
                    }
                    yi0 yi0Var2 = this.e0;
                    if (yi0Var2 != null) {
                        ((je) yi0Var2).a(false);
                    }
                } else if (this.d1) {
                    this.a0 = false;
                    if (this.b0 && (i61Var = this.n) != null) {
                        i61Var.u0(true);
                        hb0 hb0Var = this.y;
                        org.telegram.messenger.g0.r(hb0Var);
                        org.telegram.messenger.g0.h3(hb0Var, 16L);
                    }
                } else if (actionMasked == 1) {
                    setPlaying(!g());
                }
                i(true);
                this.c1 = false;
                this.d1 = false;
                this.W = false;
                invalidate();
                return true;
            }
        }
    }

    public final boolean e(int i7) {
        int w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Uf, this.a);
        return (Color.blue(i7) + ((Color.green(i7) * 6) + (Color.red(i7) * 3))) / 10 > ((Color.blue(w02) + ((Color.green(w02) * 6) + (Color.red(w02) * 3))) / 10) + 40;
    }

    public final boolean f() {
        return org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.d6, this.a)) < 0.5f;
    }

    public final boolean g() {
        i61 i61Var = this.n;
        return i61Var != null && i61Var.d0();
    }

    public float getAudioLeft() {
        return this.s;
    }

    public long getAudioLeftMs() {
        return (long) (this.s * getDuration());
    }

    public float getAudioRight() {
        return this.w;
    }

    public long getAudioRightMs() {
        return (long) (this.w * getDuration());
    }

    public long getDuration() {
        i61 i61Var = this.n;
        if (i61Var == null) {
            return 0L;
        }
        return i61Var.U();
    }

    public double getNewDuration() {
        return ((this.w - this.s) * getDuration()) / 1000.0d;
    }

    public String getTrimBubbleText() {
        return org.telegram.messenger.g0.g0((int) Math.floor(this.s * r0), false, false) + " - " + org.telegram.messenger.g0.g0(Math.round(this.r * this.w), false, false);
    }

    public float getTrimHandleX() {
        float L = org.telegram.messenger.g0.L(10.0f);
        if (this.e1 != 1) {
            return this.z0 - (L / 2.0f);
        }
        return (L / 2.0f) + this.A0;
    }

    public float getTrimProgress() {
        return this.m0.c;
    }

    public float getTrimWindowCenterX() {
        return this.q0;
    }

    public float getTrimWindowTop() {
        return this.r0;
    }

    public final float h() {
        int i7 = this.N0;
        int i10 = i7 ^ (i7 << 13);
        int i11 = i10 ^ (i10 >>> 17);
        this.N0 = i11 ^ (i11 << 5);
        return (r0 >>> 8) / 1.6777216E7f;
    }

    public final void i(boolean z10) {
        int round;
        if (this.d0) {
            if (this.n == null || (!g() && (!this.x || this.f == null || this.n.S() <= (this.s * this.n.U()) + 30.0f || this.n.S() >= (this.w * this.n.U()) - 60.0f))) {
                round = Math.round(Math.max(1.0f, (this.w - this.s) * this.r));
            } else {
                round = (int) Math.floor(Math.max(0.0f, this.n.S() - (this.s * this.n.U())) / 1000.0f);
            }
            boolean z11 = false;
            String g02 = org.telegram.messenger.g0.g0(round, false, false);
            if (z10 && !org.telegram.messenger.hd.a0) {
                z11 = true;
            }
            this.h.t(g02, z11, true);
        }
    }

    @Override // android.view.View
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        float L = org.telegram.messenger.g0.L(32.0f);
        this.E.set(0.0f, (getHeight() - L) / 2.0f, getWidth(), (getHeight() + L) / 2.0f);
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        float L = org.telegram.messenger.g0.L(32.0f);
        this.E.set(0.0f, (getMeasuredHeight() - L) / 2.0f, getMeasuredWidth(), (getMeasuredHeight() + L) / 2.0f);
    }

    public void setAllowDraw(boolean z10) {
        this.R = -1.0f;
        if (this.S != z10) {
            this.S = z10;
            invalidate();
        }
    }

    public void setNewContentAlpha(float f10) {
        if (this.s0 != f10) {
            this.s0 = f10;
            invalidate();
        }
    }

    public void setNewStyle(boolean z10) {
        if (this.d0 == z10) {
            return;
        }
        this.d0 = z10;
        if (z10) {
            float L = org.telegram.messenger.g0.L(14.0f);
            n6 n6Var = this.h;
            n6Var.w(L);
            n6Var.x(org.telegram.messenger.g0.o());
            n6Var.n(0.35f, 260L, nr.h);
            this.f.h = org.telegram.messenger.ls.j4;
        }
        Paint.Style style = Paint.Style.STROKE;
        Paint paint = this.k0;
        paint.setStyle(style);
        paint.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
        Paint paint2 = this.l0;
        paint2.setStyle(style);
        paint2.setStrokeWidth(org.telegram.messenger.g0.L(1.5f));
        paint2.setColor(-1);
        invalidate();
    }

    public void setNewStyleDelegate(yi0 yi0Var) {
        this.e0 = yi0Var;
    }

    public void setPlaying(boolean z10) {
        if (this.T) {
            z10 = false;
        }
        if (this.n != null) {
            float S = r0.S() / this.n.U();
            if (S < this.s || S > this.w || (this.d0 && z10 && this.n.S() >= ((long) (this.w * this.n.U())) - 60)) {
                this.n.q0((long) (this.s * r0.U()), false);
            }
            this.n.u0(z10);
        }
        this.f.a(z10, true);
        if (this.d0) {
            if (z10) {
                this.x = true;
            }
            i(true);
        }
        hb0 hb0Var = this.y;
        org.telegram.messenger.g0.r(hb0Var);
        if (z10) {
            org.telegram.messenger.g0.h3(hb0Var, 16L);
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return this.h == drawable || this.f == drawable || super.verifyDrawable(drawable);
    }
}
