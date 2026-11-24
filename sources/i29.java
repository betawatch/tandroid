// default package

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
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.l;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class i29 extends View {
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
    public final kra I0;
    public final RectF J;
    public final kra J0;
    public final RectF K;
    public final int[] K0;
    public int L;
    public final float[][] L0;
    public byte[] M;
    public final Paint M0;
    public final Path N;
    public int N0;
    public final lm O;
    public float[] O0;
    public final lm P;
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
    public jw1 W0;
    public boolean X0;
    public final Paint Y0;
    public boolean Z0;
    public final wjb a;
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
    public h29 e0;
    public int e1;
    public final xb8 f;
    public final RectF f0;
    public float f1;
    public final RectF g0;
    public boolean g1;
    public final gn h;
    public final RectF h0;
    public final Paint i0;
    public final Paint j0;
    public final Paint k0;
    public final Paint l0;
    public final lm m0;
    public lbc n;
    public final lm n0;
    public final lm o0;
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
    public final lm w0;
    public boolean x;
    public final lm x0;
    public final sr8 y;
    public final lm y0;
    public float z0;

    public i29(Context context, wjb wjbVar) {
        super(context);
        this.b = new Paint(1);
        this.c = new Paint(1);
        this.d = new Paint(1);
        this.e = new Paint(1);
        this.s = 0.0f;
        this.w = 1.0f;
        this.x = false;
        this.y = new sr8(this, (byte) 14);
        this.E = new RectF();
        this.F = new RectF();
        this.G = new RectF();
        this.H = new Path();
        this.I = new RectF();
        this.J = new RectF();
        this.K = new RectF();
        this.N = new Path();
        s33 s33Var = s33.h;
        this.O = new lm(this, 0L, 340L, s33Var);
        this.P = new lm(this, 0L, 340L, s33Var);
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
        this.m0 = new lm(this, 0L, 340L, s33Var);
        this.n0 = new lm(this, 0L, 220L, s33Var);
        this.o0 = new lm(this, 0L, 260L, s33Var);
        this.s0 = 1.0f;
        this.t0 = new Path();
        this.u0 = new Path();
        this.v0 = new float[8];
        this.w0 = new lm(this, 0L, 160L, s33.g);
        this.x0 = new lm(this, 0L, 260L, s33Var);
        this.y0 = new lm(this, 0L, 200L, s33Var);
        this.D0 = new RectF();
        this.E0 = new Paint(1);
        this.G0 = new Matrix();
        this.H0 = new float[0];
        this.I0 = new kra(2400);
        this.J0 = new kra(2200);
        this.K0 = new int[6];
        this.L0 = (float[][]) Array.newInstance((Class<?>) Float.TYPE, 6, 0);
        this.M0 = new Paint(1);
        this.N0 = 625341585;
        this.O0 = new float[0];
        this.P0 = new float[0];
        this.Q0 = -1;
        this.Y0 = new Paint(2);
        this.e1 = -1;
        this.a = wjbVar;
        xb8 xb8Var = new xb8(12);
        this.f = xb8Var;
        xb8Var.f = this;
        xb8Var.setCallback(this);
        gn gnVar = new gn(false, false, false);
        this.h = gnVar;
        gnVar.n(0.5f, 200L, s33Var);
        gnVar.setCallback(this);
        gnVar.w(gl.L(12.0f));
        gnVar.x(gl.o());
        gnVar.N = gl.q.x;
    }

    public static float c(int i) {
        int i2 = i * (-1640531535);
        int i3 = (i2 ^ (i2 >>> 15)) * (-2048144777);
        int i4 = (i3 ^ (i3 >>> 13)) * (-1028477379);
        return ((i4 ^ (i4 >>> 16)) >>> 8) / 1.6777216E7f;
    }

    public final void a(Canvas canvas, RectF rectF, float f) {
        Paint paint;
        Paint paint2;
        gn gnVar;
        xb8 xb8Var;
        Paint paint3;
        int i;
        byte b;
        byte b2;
        int i2;
        int i3;
        byte b3;
        float i4;
        if (this.d0) {
            b(canvas, rectF, f);
            return;
        }
        int i5 = bkb.ag;
        wjb wjbVar = this.a;
        int v0 = bkb.v0(i5, wjbVar);
        Paint paint4 = this.b;
        paint4.setColor(v0);
        int v02 = bkb.v0(bkb.bg, wjbVar);
        Paint paint5 = this.c;
        paint5.setColor(v02);
        int i6 = bkb.Yf;
        int v03 = bkb.v0(i6, wjbVar);
        gn gnVar2 = this.h;
        gnVar2.u(v03);
        int v04 = bkb.v0(bkb.Wf, wjbVar);
        xb8 xb8Var2 = this.f;
        xb8Var2.a.setColor(v04);
        int v05 = bkb.v0(bkb.Xf, wjbVar);
        Paint paint6 = this.d;
        paint6.setColor(v05);
        int v06 = bkb.v0(i6, wjbVar);
        Paint paint7 = this.e;
        paint7.setColor(v06);
        int R1 = (int) gl.R1(rectF.left + gl.L(11.33f), rectF.right - gl.L(11.33f), Utilities.l(this.s));
        int R12 = (int) gl.R1(rectF.left + gl.L(11.33f), rectF.right - gl.L(11.33f), Utilities.l(this.w));
        int measuredWidth = getMeasuredWidth() - gl.L(27.0f);
        int i7 = this.L;
        Path path = this.N;
        if (i7 == measuredWidth) {
            paint = paint5;
            paint2 = paint4;
            gnVar = gnVar2;
            xb8Var = xb8Var2;
            paint3 = paint7;
            i = R12;
        } else {
            int L = measuredWidth / gl.L(3.0f);
            int L2 = gl.L(2.0f);
            paint = paint5;
            int L3 = gl.L(12.0f);
            paint2 = paint4;
            byte b4 = Byte.MAX_VALUE;
            gnVar = gnVar2;
            byte b5 = Byte.MIN_VALUE;
            xb8Var = xb8Var2;
            int i8 = 0;
            while (true) {
                paint3 = paint7;
                if (i8 >= L) {
                    break;
                }
                byte[] bArr = this.M;
                if (bArr == null) {
                    i3 = i8;
                    i2 = R12;
                    b3 = 0;
                } else {
                    i2 = R12;
                    i3 = i8;
                    b3 = bArr[(int) ((i8 / L) * bArr.length)];
                }
                b4 = (byte) Math.min((int) b4, (int) b3);
                b5 = (byte) Math.max((int) b5, (int) b3);
                i8 = i3 + 1;
                paint7 = paint3;
                R12 = i2;
            }
            i = R12;
            path.rewind();
            int i9 = 0;
            while (i9 < L) {
                byte[] bArr2 = this.M;
                if (bArr2 == null) {
                    b = b4;
                    b2 = 0;
                } else {
                    b = b4;
                    b2 = bArr2[(int) ((i9 / L) * bArr2.length)];
                }
                float U1 = gl.U1(Utilities.l((b2 - b) / (b5 - b)), L2, L3);
                float L4 = gl.L(3.0f) * i9;
                RectF rectF2 = gl.P;
                rectF2.set(L4, (-U1) / 2.0f, gl.L(2.0f) + L4, U1 / 2.0f);
                path.addRoundRect(rectF2, gl.L(1.0f), gl.L(1.0f), Path.Direction.CW);
                i9++;
                b4 = b;
                L = L;
                L2 = L2;
            }
            this.L = measuredWidth;
        }
        canvas.save();
        Path path2 = this.H;
        path2.rewind();
        path2.addRoundRect(rectF, gl.L(8.0f), gl.L(8.0f), Path.Direction.CW);
        canvas.clipPath(path2);
        Paint paint8 = paint;
        canvas.drawRect(rectF.left, rectF.top, R1 - gl.L(1.33f), rectF.bottom, paint8);
        canvas.drawRect(gl.L(1.33f) + i, rectF.top, rectF.right, rectF.bottom, paint8);
        canvas.save();
        canvas.translate(rectF.left + gl.L(14.0f), rectF.centerY());
        int i10 = bkb.Xf;
        paint6.setColor(bkb.p1(0.3f, bkb.v0(i10, wjbVar)));
        canvas.drawPath(path, paint6);
        canvas.restore();
        float f2 = R1;
        float f3 = i;
        canvas.drawRect(f2, rectF.top, f3, rectF.bottom, paint2);
        if (this.a0) {
            i4 = this.c0;
        } else {
            i4 = Utilities.i(this.n != null ? r3.S() / this.n.U() : 1.0f, this.w, this.s);
        }
        float i11 = Utilities.i(gl.R1(rectF.left + gl.L(13.0f), rectF.right - gl.L(14.0f), i4), f3, f2);
        if (i11 < f3) {
            canvas.save();
            canvas.clipRect(i11, rectF.top, f3, rectF.bottom);
            canvas.translate(rectF.left + gl.L(14.0f), rectF.centerY());
            if (!this.x || i4 >= this.s || this.a0) {
                paint6.setColor(bkb.v0(i10, wjbVar));
            } else {
                paint6.setColor(bkb.v0(bkb.Yf, wjbVar));
            }
            canvas.drawPath(path, paint6);
            canvas.restore();
        }
        if (i11 > f2) {
            canvas.save();
            canvas.clipRect(f2, rectF.top, i11, rectF.bottom);
            canvas.translate(rectF.left + gl.L(14.0f), rectF.centerY());
            if (g() || this.x || this.a0) {
                paint6.setColor(bkb.v0(bkb.Yf, wjbVar));
            } else {
                paint6.setColor(bkb.v0(i10, wjbVar));
            }
            canvas.drawPath(path, paint6);
            canvas.restore();
        }
        float L5 = R1 - gl.L(7.0f);
        float centerY = rectF.centerY() - gl.L(5.33f);
        float L6 = R1 - gl.L(5.33f);
        float centerY2 = rectF.centerY() + gl.L(5.33f);
        RectF rectF3 = this.G;
        rectF3.set(L5, centerY, L6, centerY2);
        Paint paint9 = paint3;
        canvas.drawRoundRect(rectF3, rectF3.width() / 2.0f, rectF3.width() / 2.0f, paint9);
        rectF3.set(gl.L(5.33f) + i, rectF.centerY() - gl.L(5.33f), gl.L(7.0f) + i, rectF.centerY() + gl.L(5.33f));
        canvas.drawRoundRect(rectF3, rectF3.width() / 2.0f, rectF3.width() / 2.0f, paint9);
        this.J.set(R1 - gl.L(24.0f), 0.0f, gl.L(6.0f) + R1, getHeight());
        this.K.set(i - gl.L(6.0f), 0.0f, gl.L(24.0f) + i, getHeight());
        float d = this.P.d(!this.a0);
        if (d > 0.0f) {
            float c = (int) (gnVar.c() + gl.L(30.0f));
            float d2 = this.O.d(c <= ((float) ((i - R1) - gl.L(8.0f))));
            float R13 = gl.R1(gl.L(24.0f), c, d2);
            float f4 = R1 + i;
            float f5 = (f4 - R13) / 2.0f;
            float L7 = gl.L(20.0f) / 2.0f;
            float centerY3 = rectF.centerY() - L7;
            float f6 = (f4 + R13) / 2.0f;
            float centerY4 = rectF.centerY() + L7;
            RectF rectF4 = this.F;
            rectF4.set(f5, centerY3, f6, centerY4);
            int alpha = paint8.getAlpha();
            paint8.setAlpha((int) (alpha * d));
            canvas.drawRoundRect(rectF4, rectF4.height() / 2.0f, rectF4.height() / 2.0f, paint8);
            paint8.setAlpha(alpha);
            RectF rectF5 = this.I;
            rectF5.set(rectF4);
            rectF5.inset(-gl.L(6.0f), -gl.L(6.0f));
            canvas.save();
            int L8 = gl.L(12.0f);
            canvas.translate(gl.R1(rectF4.centerX() - (L8 / 2.0f), rectF4.left + gl.L(6.0f), d2), rectF4.centerY());
            xb8 xb8Var3 = xb8Var;
            xb8Var3.setBounds(0, (-L8) / 2, L8, L8 / 2);
            xb8Var3.g = (int) (d * 255.0f);
            xb8Var3.draw(canvas);
            canvas.restore();
            if (d2 > 0.0f) {
                canvas.save();
                canvas.translate(rectF4.left + gl.L(21.66f), rectF4.centerY() - gl.L(1.0f));
                gn gnVar3 = gnVar;
                gnVar3.setBounds(-1, -1, 1, 1);
                gnVar3.C = (int) (d2 * 255.0f * d);
                gnVar3.draw(canvas);
                canvas.restore();
            }
        }
        canvas.restore();
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0581  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0585  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x062c A[EDGE_INSN: B:126:0x062c->B:127:0x062c BREAK  A[LOOP:0: B:67:0x044a->B:103:0x061a], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x066d A[LOOP:2: B:128:0x0666->B:130:0x066d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0676 A[EDGE_INSN: B:131:0x0676->B:132:0x0676 BREAK  A[LOOP:2: B:128:0x0666->B:130:0x066d], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0684  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0905  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0951  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x09fd  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0a36  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0a40  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0b01  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0b12  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0b3f  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x0b04  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x0a14  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x0925  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x0439  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x03c9  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x034b  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x038c  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x03c4  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0435  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0455  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(Canvas canvas, RectF rectF, float f) {
        Paint paint;
        lm lmVar;
        float min;
        float f2;
        float f3;
        float f4;
        byte b;
        byte b2;
        int i;
        byte b3;
        int i2;
        RectF rectF2;
        float f5;
        RectF rectF3;
        float f6;
        float f7;
        int i3;
        boolean z;
        float f8;
        kra kraVar;
        float pow;
        int i4;
        int[] iArr;
        float f9;
        int i5;
        float f10;
        Paint paint2;
        float f11;
        Paint paint3;
        int i6;
        int i7;
        int i8;
        float f12;
        int i9;
        int i10;
        float d;
        float[] fArr;
        float f13;
        float f14;
        boolean z2;
        int i11;
        int i12;
        Paint paint4;
        float f15;
        float f16;
        float f17;
        float[] fArr2;
        int i13;
        boolean z3;
        float f18;
        float f19;
        int i14;
        RectF rectF4;
        int i15;
        float f20;
        float f21;
        float f22;
        float max;
        float l;
        if (this.X0) {
            return;
        }
        if (this.T0 != null) {
            float uptimeMillis = (SystemClock.uptimeMillis() - this.V0) / 760.0f;
            int width = this.T0.getWidth();
            float l2 = 1.0f - Utilities.l(uptimeMillis / 0.45f);
            float f23 = 1.0f - (l2 * l2);
            if (!this.Z0) {
                f23 = 1.0f - f23;
            }
            float f24 = f23 * width;
            canvas.save();
            if (this.Z0) {
                canvas.clipRect(f24, 0.0f, width, getHeight());
            } else {
                canvas.clipRect(0.0f, 0.0f, f24, getHeight());
            }
            Paint paint5 = this.Y0;
            paint5.setAlpha(kk7.d4);
            canvas.drawBitmap(this.T0, 0.0f, 0.0f, paint5);
            canvas.restore();
            kra kraVar2 = this.J0;
            kraVar2.b(canvas, 1.0f);
            int i16 = this.U0;
            int min2 = i16 - Math.min(i16, kraVar2.D);
            int i17 = this.U0;
            float f25 = i17 == 0 ? 1.0f : min2 / i17;
            jw1 jw1Var = this.W0;
            if (jw1Var != null) {
                ChatActivityEnterView chatActivityEnterView = jw1Var.a;
                chatActivityEnterView.D5 = f25;
                chatActivityEnterView.q();
                if (f25 < 0.98f) {
                    float sin = (((float) Math.sin(Utilities.i((f25 - 0.55f) / 0.43f, 1.0f, 0.0f) * 3.141592653589793d)) * 0.14f) + 1.0f;
                    chatActivityEnterView.h1.setScaleX(sin);
                    chatActivityEnterView.h1.setScaleY(sin);
                }
            }
            if ((uptimeMillis <= 1.0f || kraVar2.D > 0) && uptimeMillis <= 1.6f) {
                postInvalidateOnAnimation();
                return;
            }
            kraVar2.a();
            this.T0.recycle();
            this.T0 = null;
            this.W0 = null;
            this.X0 = true;
            if (jw1Var != null) {
                gl.d3(new sr8(jw1Var, (byte) 13));
                return;
            }
            return;
        }
        int v0 = bkb.v0(bkb.Tf, this.a);
        int argb = Color.argb(kk7.d4, Math.max(0, Color.red(v0) - 17), Math.max(0, Color.green(v0) - 18), Math.max(0, Color.blue(v0) - 18));
        int f26 = bm2.f(0.46f, v0, -1);
        boolean z4 = this.p0;
        lm lmVar2 = this.m0;
        lmVar2.d(z4);
        float d2 = this.n0.d(this.W);
        float d3 = this.y0.d(this.p0);
        float l3 = Utilities.l(f);
        float f27 = 0.0f;
        float min3 = Math.min(rectF.height(), gl.L(32.0f));
        float f28 = rectF.left;
        float f29 = 0.55f;
        float f30 = min3 / 2.0f;
        float centerY = rectF.centerY() - f30;
        float f31 = 2.0f;
        float f32 = rectF.right;
        float centerY2 = rectF.centerY() + f30;
        RectF rectF5 = this.g0;
        rectF5.set(f28, centerY, f32, centerY2);
        float centerY3 = rectF5.centerY();
        float R1 = gl.R1(f30, Math.min(gl.L(9.0f), f30), Utilities.l((l3 - 0.4f) / 0.6f));
        float l4 = Utilities.l((l3 - 0.35f) / 0.65f) * this.s0;
        float L = gl.L(10.0f);
        this.B0 = rectF5.left + L + gl.L(4.0f);
        float L2 = (rectF5.right - L) - gl.L(4.0f);
        this.C0 = L2;
        float max2 = Math.max(1.0f, L2 - this.B0);
        float L3 = ((this.s * max2) + this.B0) - gl.L(4.0f);
        float L4 = gl.L(4.0f) + (this.w * max2) + this.B0;
        this.z0 = L3;
        this.A0 = L4;
        this.q0 = (L3 + L4) / 2.0f;
        this.r0 = rectF5.top;
        float f33 = L3 - L;
        float f34 = L4 + L;
        int p1 = bkb.p1(this.s0, v0);
        Paint paint6 = this.i0;
        paint6.setColor(p1);
        float f35 = rectF5.top;
        float f36 = rectF5.bottom;
        RectF rectF6 = this.h0;
        rectF6.set(f33, f35, f34, f36);
        canvas.drawRoundRect(rectF6, R1, R1, paint6);
        float f37 = d3;
        if (l4 <= 0.0f) {
            this.S0 = 0L;
            return;
        }
        long uptimeMillis2 = SystemClock.uptimeMillis();
        long j = this.S0;
        if (j == 0) {
            paint = paint6;
            lmVar = lmVar2;
            min = 16.0f;
        } else {
            paint = paint6;
            lmVar = lmVar2;
            min = Math.min(64L, uptimeMillis2 - j);
        }
        this.S0 = uptimeMillis2;
        int max3 = Math.max(12, (int) (max2 / gl.L(4.0f)));
        int i18 = this.Q0;
        float[][] fArr3 = this.L0;
        if (max3 == i18) {
            f2 = 0.5f;
            if (this.R0 == this.M) {
                f3 = min;
                f4 = f33;
                float f38 = max3;
                float f39 = max2 / f38;
                float min4 = Math.min(gl.L(2.0f), f39 * f2);
                float L5 = gl.L(2.0f);
                float L6 = gl.L(13.0f);
                if (this.a0) {
                    lbc lbcVar = this.n;
                    if (lbcVar == null || lbcVar.U() <= 0) {
                        i2 = argb;
                        rectF2 = rectF5;
                        f5 = this.s;
                    } else if (g() || this.x) {
                        i2 = argb;
                        rectF2 = rectF5;
                        f5 = Utilities.i(this.n.S() / this.n.U(), this.w, this.s);
                    } else {
                        f5 = this.s;
                    }
                    float f40 = f5;
                    float e = this.o0.e(false, (!g() || this.x || this.a0) ? 1.0f : 0.0f);
                    gn gnVar = this.h;
                    float L7 = gl.L(33.0f) + gnVar.c();
                    float f41 = L4 - L3;
                    float d4 = this.x0.d(L7 <= f41 - ((float) gl.L(8.0f)));
                    float R12 = gl.R1(gl.L(24.0f), L7, d4);
                    float L8 = gl.L(22.0f);
                    float f42 = this.q0;
                    float f43 = R12 / 2.0f;
                    float f44 = L8 / 2.0f;
                    rectF3 = this.D0;
                    rectF3.set(f42 - f43, centerY3 - f44, f42 + f43, centerY3 + f44);
                    canvas.save();
                    Path path = this.u0;
                    path.rewind();
                    rectF6.set(rectF3);
                    rectF6.inset(-gl.L(3.0f), -gl.L(3.0f));
                    path.addRoundRect(rectF6, rectF6.height() / 2.0f, rectF6.height() / 2.0f, Path.Direction.CW);
                    if (Build.VERSION.SDK_INT >= 26) {
                        canvas.clipOutPath(path);
                    } else {
                        canvas.clipPath(path, Region.Op.DIFFERENCE);
                    }
                    f6 = f3 / 250.0f;
                    f7 = f3 / 300.0f;
                    i3 = 0;
                    z = false;
                    boolean z5 = false;
                    while (true) {
                        f8 = f7;
                        kraVar = this.I0;
                        if (i3 >= max3) {
                            break;
                        }
                        float f45 = f6;
                        float f46 = i3;
                        float f47 = (f46 + f2) / f38;
                        float f48 = (f47 < this.s || f47 > this.w) ? 1.0f : f27;
                        boolean z6 = z;
                        float f49 = this.P0[i3];
                        if (f49 != f48) {
                            f19 = f49;
                            f49 = f48 > f49 ? Math.min(f48, f19 + f45) : Math.max(f48, f19 - f8);
                            f18 = f48;
                            this.P0[i3] = f49;
                            z5 = true;
                        } else {
                            f18 = f48;
                            f19 = f49;
                        }
                        int i19 = (f18 > f27 ? 1 : (f18 == f27 ? 0 : -1));
                        if (i19 > 0) {
                            z6 = true;
                        }
                        if (f19 <= f27 && f49 > f27) {
                            d(i3);
                            if (i19 > 0) {
                                i14 = i19;
                                float R13 = gl.R1(L5, L6, this.O0[i3]);
                                i15 = i3;
                                float f50 = (f39 / f31) + (f46 * f39) + this.B0;
                                float f51 = f47 < (this.s + this.w) / f31 ? -1.0f : 1.0f;
                                int round = Math.round((this.O0[i15] * 44.0f) + 16.0f);
                                rectF4 = rectF3;
                                kraVar.e(f());
                                int i20 = 0;
                                while (i20 < round) {
                                    int i21 = i20;
                                    float d5 = kraVar.d() - f2;
                                    float d6 = ((kraVar.d() - f2) * f39 * 1.1f) + f50;
                                    int i22 = round;
                                    float w = b00.w(d5, R13, 1.05f, centerY3);
                                    float d7 = (kraVar.d() + 0.3f) * gl.L(13.0f) * f51;
                                    kra kraVar3 = this.I0;
                                    kraVar3.g(d6, w, ((kraVar3.d() * 0.8f) + 0.4f) * d7, (d5 * gl.L(8.0f)) + ((-gl.L(5.0f)) - (kraVar.d() * gl.L(17.0f))), (kraVar.d() * 0.45f) + f29, kraVar.d() * 0.05f);
                                    i20 = i21 + 1;
                                    round = i22;
                                    R13 = R13;
                                }
                                if (f49 < 1.0f) {
                                    f20 = f29;
                                } else {
                                    float R14 = gl.R1(L5, L6, this.O0[i15]);
                                    float z7 = oo1.z(f39, min4, f31, (f46 * f39) + this.B0);
                                    int f52 = (f47 > f40 || f47 < this.s) ? f26 : bm2.f(e, f26, -1);
                                    if (i14 > 0) {
                                        float interpolation = s33.g.getInterpolation(f49);
                                        float f53 = f29;
                                        f21 = R14;
                                        float R15 = gl.R1(1.0f, f53, interpolation);
                                        float f54 = 1.0f - interpolation;
                                        l = f54 * f54;
                                        f20 = f53;
                                        f22 = f27;
                                        max = R15;
                                    } else {
                                        f20 = f29;
                                        f21 = R14;
                                        float f55 = 1.0f - f49;
                                        float f56 = f55 - 1.0f;
                                        float f57 = (1.4f * f56 * f56) + (2.4f * f56 * f56 * f56) + 1.0f;
                                        f22 = f27;
                                        max = Math.max(f22, f57);
                                        l = Utilities.l(f55 * 2.5f);
                                    }
                                    if (l > f22 && max > f22) {
                                        float max4 = Math.max(min4, max * f21);
                                        int p12 = bkb.p1(l * l4, f52);
                                        Paint paint7 = this.j0;
                                        paint7.setColor(p12);
                                        float f58 = max4 / 2.0f;
                                        rectF6.set(z7, centerY3 - f58, z7 + min4, f58 + centerY3);
                                        float f59 = min4 / 2.0f;
                                        canvas.drawRoundRect(rectF6, f59, f59, paint7);
                                    }
                                }
                                i3 = i15 + 1;
                                f7 = f8;
                                f6 = f45;
                                f29 = f20;
                                z = z6;
                                rectF3 = rectF4;
                                f31 = 2.0f;
                                f27 = 0.0f;
                            }
                        }
                        i14 = i19;
                        rectF4 = rectF3;
                        i15 = i3;
                        if (f49 < 1.0f) {
                        }
                        i3 = i15 + 1;
                        f7 = f8;
                        f6 = f45;
                        f29 = f20;
                        z = z6;
                        rectF3 = rectF4;
                        f31 = 2.0f;
                        f27 = 0.0f;
                    }
                    RectF rectF7 = rectF3;
                    boolean z8 = z;
                    canvas.restore();
                    float f60 = f3 / 1000.0f;
                    pow = (float) Math.pow(0.2d, f60);
                    float L9 = gl.L(70.0f);
                    float L10 = gl.L(9.0f);
                    float L11 = f30 - gl.L(1.2f);
                    float L12 = gl.L(1.7f);
                    i4 = 0;
                    while (true) {
                        iArr = this.K0;
                        f9 = pow;
                        if (i4 >= 6) {
                            break;
                        }
                        iArr[i4] = 0;
                        i4++;
                        pow = f9;
                    }
                    Paint.Cap cap = Paint.Cap.ROUND;
                    Paint paint8 = this.M0;
                    paint8.setStrokeCap(cap);
                    i5 = 0;
                    while (i5 < max3) {
                        float f61 = this.P0[i5];
                        if (f61 <= 0.0f) {
                            i12 = i5;
                            i11 = max3;
                            paint4 = paint8;
                            f15 = L9;
                            f16 = min4;
                        } else {
                            i11 = max3;
                            float f62 = i5;
                            float f63 = (f62 + f2) / f38;
                            i12 = i5;
                            boolean z9 = f63 >= this.s && f63 <= this.w;
                            float R16 = gl.R1(L5, L6, this.O0[i12]);
                            float f64 = (f39 / 2.0f) + (f62 * f39) + this.B0;
                            float l5 = Utilities.l((f63 < (this.s + this.w) / 2.0f ? f4 - f64 : f64 - f34) / gl.L(52.0f));
                            paint4 = paint8;
                            float f65 = 1.0f - (l5 * 0.35f);
                            f15 = L9;
                            int max5 = Math.max(3, Math.min(18, Math.round((this.O0[i12] * 13.0f * f65) + 5.0f)));
                            float interpolation2 = (z9 ? s33.j : s33.g).getInterpolation(f61);
                            boolean z10 = f61 >= 1.0f;
                            f16 = min4;
                            int i23 = 0;
                            while (i23 < max5) {
                                int i24 = ((i12 * 18) + i23) * 10;
                                int i25 = max5;
                                float[] fArr4 = this.H0;
                                int i26 = i24 + 4;
                                float f66 = fArr4[i26] + f60;
                                fArr4[i26] = f66;
                                int i27 = i24 + 5;
                                if (f66 >= fArr4[i27]) {
                                    int i28 = i24 + 6;
                                    boolean isNaN = Float.isNaN(fArr4[i28]);
                                    fArr2 = fArr4;
                                    i13 = i23;
                                    z3 = z10;
                                    fArr2[i28] = yjb.z(l5, gl.L(10.0f), f16 + gl.L(1.0f), h() - f2);
                                    int i29 = i24 + 7;
                                    fArr2[i29] = yjb.z(l5, 0.6f, 1.0f, (h() - f2) * R16);
                                    if (isNaN) {
                                        fArr2[i24] = (h() - f2) * f16;
                                        fArr2[i24 + 1] = fArr2[i24 + 9] * R16;
                                        f17 = l5;
                                    } else {
                                        fArr2[i24] = ((h() - f2) * gl.L(2.0f)) + fArr2[i28];
                                        f17 = l5;
                                        fArr2[i24 + 1] = ((h() - f2) * gl.L(2.0f)) + fArr2[i29];
                                    }
                                    fArr2[i24 + 2] = (h() - f2) * gl.L(6.0f);
                                    fArr2[i24 + 3] = (h() - f2) * gl.L(6.0f);
                                    fArr2[i27] = (h() * 1.3f) + 0.7f;
                                    fArr2[i26] = isNaN ? h() * fArr2[i27] * f2 : 0.0f;
                                    fArr2[i24 + 8] = ((h() * 0.45f) + 0.2f) * f65;
                                } else {
                                    f17 = l5;
                                    fArr2 = fArr4;
                                    i13 = i23;
                                    z3 = z10;
                                }
                                int i30 = i24 + 2;
                                fArr2[i30] = ((((fArr2[i24 + 6] - fArr2[i24]) * 3.2f) + ((h() - f2) * f15)) * f60) + fArr2[i30];
                                int i31 = i24 + 3;
                                int i32 = i24 + 1;
                                fArr2[i31] = ((((fArr2[i24 + 7] - fArr2[i32]) * 3.2f) + ((h() - f2) * f15)) * f60) + fArr2[i31];
                                float f67 = -L10;
                                fArr2[i30] = Utilities.i(fArr2[i30] * f9, L10, f67);
                                fArr2[i31] = Utilities.i(fArr2[i31] * f9, L10, f67);
                                fArr2[i24] = (fArr2[i30] * f60) + fArr2[i24];
                                fArr2[i32] = Utilities.i((fArr2[i31] * f60) + fArr2[i32], L11, -L11);
                                float f68 = L5;
                                float sin2 = fArr2[i24 + 8] * ((float) Math.sin(Utilities.l(fArr2[i26] / fArr2[i27]) * 3.141592653589793d));
                                float R17 = gl.R1(f64, fArr2[i24] + f64, interpolation2);
                                float R18 = gl.R1((fArr2[i24 + 9] * R16) + centerY3, fArr2[i32] + centerY3, interpolation2);
                                if (z3) {
                                    float f69 = sin2 * l4;
                                    if (f69 >= 0.02f) {
                                        int min5 = Math.min(5, (int) ((f69 * 6.0f) / 0.6f));
                                        int i33 = iArr[min5];
                                        float[] fArr5 = fArr3[min5];
                                        fArr5[i33] = R17;
                                        fArr5[i33 + 1] = R18;
                                        iArr[min5] = i33 + 2;
                                    }
                                }
                                i23 = i13 + 1;
                                L5 = f68;
                                max5 = i25;
                                l5 = f17;
                                z10 = z3;
                            }
                        }
                        i5 = i12 + 1;
                        L5 = L5;
                        max3 = i11;
                        paint8 = paint4;
                        min4 = f16;
                        L9 = f15;
                    }
                    Paint paint9 = paint8;
                    canvas.save();
                    RectF rectF8 = rectF2;
                    canvas.clipRect(rectF8);
                    if (Build.VERSION.SDK_INT >= 26) {
                        canvas.clipOutRect(f4 + gl.L(2.0f), rectF8.top, f34 - gl.L(2.0f), rectF8.bottom);
                        f10 = l4;
                        paint2 = paint;
                        f11 = f4;
                        paint3 = paint9;
                    } else {
                        f10 = l4;
                        paint2 = paint;
                        f11 = f4;
                        paint3 = paint9;
                        canvas.clipRect(f4 + gl.L(2.0f), rectF8.top, f34 - gl.L(2.0f), rectF8.bottom, Region.Op.DIFFERENCE);
                    }
                    boolean f70 = f();
                    i6 = 0;
                    while (i6 < 6) {
                        if (iArr[i6] == 0) {
                            z2 = f70;
                        } else {
                            float f71 = ((i6 + f2) / 6.0f) * 0.6f;
                            if (f70) {
                                int i34 = (i6 & 1) == 0 ? -8596225 : -5708033;
                                z2 = f70;
                                paint3.setColor(bkb.p1(Math.min(1.0f, f71 * 0.45f), i34));
                                paint3.setStrokeWidth(2.6f * L12);
                                canvas.drawPoints(fArr3[i6], 0, iArr[i6], paint3);
                                if (i6 >= 4) {
                                    i34 = -1379073;
                                }
                                paint3.setColor(bkb.p1(Math.min(1.0f, f71 * 1.6f), i34));
                                paint3.setStrokeWidth(L12 * 0.8f);
                            } else {
                                z2 = f70;
                                paint3.setColor(bkb.p1(Math.min(1.0f, f71 * 1.6f), i6 >= 4 ? -11554059 : (i6 & 1) == 0 ? -15233051 : -14054705));
                                paint3.setStrokeWidth(Math.max(1.0f, gl.L(1.0f)));
                            }
                            canvas.drawPoints(fArr3[i6], 0, iArr[i6], paint3);
                        }
                        i6++;
                        f70 = z2;
                    }
                    canvas.restore();
                    canvas.save();
                    i7 = Build.VERSION.SDK_INT;
                    float f72 = rectF8.top;
                    if (i7 >= 26) {
                        canvas.clipOutRect(f11, f72 - gl.L(40.0f), f34, rectF8.bottom + gl.L(40.0f));
                        f12 = f11;
                        i8 = 4;
                    } else {
                        float f73 = f11;
                        i8 = 4;
                        canvas.clipRect(f73, f72 - gl.L(40.0f), f34, gl.L(40.0f) + rectF8.bottom, Region.Op.DIFFERENCE);
                        f12 = f73;
                    }
                    if (kraVar.b(canvas, f10)) {
                        z5 = true;
                    }
                    canvas.restore();
                    i10 = 0;
                    for (i9 = 2; i10 < i9; i9 = 2) {
                        float f74 = i10 == 0 ? f12 : L4;
                        float f75 = f74 + L;
                        int i35 = 0;
                        while (true) {
                            fArr = this.v0;
                            if (i35 >= 8) {
                                break;
                            }
                            fArr[i35] = 0.0f;
                            i35++;
                        }
                        if (i10 == 0) {
                            fArr[7] = R1;
                            fArr[6] = R1;
                            fArr[1] = R1;
                            fArr[0] = R1;
                        } else {
                            fArr[5] = R1;
                            fArr[i8] = R1;
                            fArr[3] = R1;
                            fArr[2] = R1;
                        }
                        Path path2 = this.t0;
                        path2.rewind();
                        rectF6.set(f74, rectF8.top, f75, rectF8.bottom);
                        path2.addRoundRect(rectF6, this.v0, Path.Direction.CW);
                        int i36 = i2;
                        paint2.setColor(bkb.p1(f10, i36));
                        canvas.drawPath(path2, paint2);
                        boolean z11 = this.p0 && this.e1 == i10;
                        float L13 = gl.L(10.0f);
                        if (z11) {
                            f13 = f37;
                            f14 = gl.R1(1.0f, 1.2f, f13);
                        } else {
                            f13 = f37;
                            f14 = 1.0f;
                        }
                        paint2.setColor(bkb.p1(f10 * 0.8f, -1));
                        float f76 = (f74 + f75) / 2.0f;
                        float f77 = (L13 * f14) / 2.0f;
                        rectF6.set(f76 - gl.L(0.8f), centerY3 - f77, f76 + gl.L(0.8f), f77 + centerY3);
                        canvas.drawRoundRect(rectF6, gl.L(1.0f), gl.L(1.0f), paint2);
                        i10++;
                        f37 = f13;
                        i2 = i36;
                    }
                    d = this.w0.d(f41 >= ((float) (gl.L(6.0f) + gl.L(24.0f))));
                    if (d <= 0.01f) {
                        h29 h29Var = this.e0;
                        if (h29Var != null && (lmVar.c > 0.0f || this.p0)) {
                            ChatActivityEnterView chatActivityEnterView2 = ((tw1) h29Var).a;
                            l lVar = chatActivityEnterView2.E2;
                            if (lVar != null) {
                                lVar.invalidate();
                            }
                            chatActivityEnterView2.invalidate();
                        }
                        if (z5 || z8) {
                            postInvalidateOnAnimation();
                            return;
                        } else {
                            this.S0 = 0L;
                            return;
                        }
                    }
                    lm lmVar3 = lmVar;
                    float f78 = f10 * d;
                    float R19 = gl.R1(f2, 1.0f, d) * (1.0f - (d2 * 0.06f));
                    canvas.save();
                    canvas.scale(R19, R19, rectF7.centerX(), rectF7.centerY());
                    paint2.setColor(bkb.p1(0.16f * f78, -1));
                    canvas.drawRoundRect(rectF7, f44, f44, paint2);
                    LinearGradient linearGradient = this.F0;
                    Paint paint10 = this.E0;
                    if (linearGradient == null) {
                        float[] fArr6 = new float[i8];
                        // fill-array-data instruction
                        fArr6[0] = 0.0f;
                        fArr6[1] = 0.45f;
                        fArr6[2] = 0.75f;
                        fArr6[3] = 1.0f;
                        LinearGradient linearGradient2 = new LinearGradient(0.0f, 0.0f, 0.0f, 1.0f, new int[]{-419430401, 1090519039, 352321535, 1509949439}, fArr6, Shader.TileMode.CLAMP);
                        this.F0 = linearGradient2;
                        paint10.setShader(linearGradient2);
                    }
                    float height = rectF7.height();
                    Matrix matrix = this.G0;
                    matrix.setScale(1.0f, height);
                    matrix.postTranslate(0.0f, rectF7.top);
                    this.F0.setLocalMatrix(matrix);
                    paint10.setStyle(Paint.Style.STROKE);
                    paint10.setStrokeWidth(Math.max(1.0f, gl.N(0.75f)));
                    paint10.setColor(-1);
                    float f79 = f78 * 255.0f;
                    int i37 = (int) f79;
                    paint10.setAlpha(i37);
                    rectF6.set(rectF7);
                    rectF6.inset(gl.N(0.4f), gl.N(0.4f));
                    canvas.drawRoundRect(rectF6, rectF6.height() / 2.0f, rectF6.height() / 2.0f, paint10);
                    int L14 = gl.L(12.0f);
                    canvas.save();
                    canvas.translate(gl.R1(rectF7.centerX() - (L14 / 2.0f), rectF7.left + gl.L(7.0f), d4), centerY3);
                    xb8 xb8Var = this.f;
                    xb8Var.a.setColor(-1);
                    xb8Var.setBounds(0, (-L14) / 2, L14, L14 / 2);
                    xb8Var.g = i37;
                    xb8Var.draw(canvas);
                    canvas.restore();
                    if (d4 > 0.0f) {
                        gnVar.u(-1);
                        gnVar.C = (int) (f79 * d4);
                        canvas.save();
                        canvas.translate(rectF7.left + gl.L(24.0f), centerY3 - gl.L(1.0f));
                        gnVar.setBounds(-1, -1, 1, 1);
                        gnVar.draw(canvas);
                        canvas.restore();
                    }
                    canvas.restore();
                    h29 h29Var2 = this.e0;
                    if (h29Var2 != null && (lmVar3.c > 0.0f || this.p0)) {
                        ChatActivityEnterView chatActivityEnterView3 = ((tw1) h29Var2).a;
                        l lVar2 = chatActivityEnterView3.E2;
                        if (lVar2 != null) {
                            lVar2.invalidate();
                        }
                        chatActivityEnterView3.invalidate();
                    }
                    if (z5 || z8) {
                        postInvalidateOnAnimation();
                        return;
                    } else {
                        this.S0 = 0L;
                        return;
                    }
                }
                f5 = this.c0;
                i2 = argb;
                rectF2 = rectF5;
                float f402 = f5;
                float e2 = this.o0.e(false, (!g() || this.x || this.a0) ? 1.0f : 0.0f);
                gn gnVar2 = this.h;
                float L72 = gl.L(33.0f) + gnVar2.c();
                float f412 = L4 - L3;
                float d42 = this.x0.d(L72 <= f412 - ((float) gl.L(8.0f)));
                float R122 = gl.R1(gl.L(24.0f), L72, d42);
                float L82 = gl.L(22.0f);
                float f422 = this.q0;
                float f432 = R122 / 2.0f;
                float f442 = L82 / 2.0f;
                rectF3 = this.D0;
                rectF3.set(f422 - f432, centerY3 - f442, f422 + f432, centerY3 + f442);
                canvas.save();
                Path path3 = this.u0;
                path3.rewind();
                rectF6.set(rectF3);
                rectF6.inset(-gl.L(3.0f), -gl.L(3.0f));
                path3.addRoundRect(rectF6, rectF6.height() / 2.0f, rectF6.height() / 2.0f, Path.Direction.CW);
                if (Build.VERSION.SDK_INT >= 26) {
                }
                f6 = f3 / 250.0f;
                f7 = f3 / 300.0f;
                i3 = 0;
                z = false;
                boolean z52 = false;
                while (true) {
                    f8 = f7;
                    kraVar = this.I0;
                    if (i3 >= max3) {
                    }
                    i3 = i15 + 1;
                    f7 = f8;
                    f6 = f45;
                    f29 = f20;
                    z = z6;
                    rectF3 = rectF4;
                    f31 = 2.0f;
                    f27 = 0.0f;
                }
                RectF rectF72 = rectF3;
                boolean z82 = z;
                canvas.restore();
                float f602 = f3 / 1000.0f;
                pow = (float) Math.pow(0.2d, f602);
                float L92 = gl.L(70.0f);
                float L102 = gl.L(9.0f);
                float L112 = f30 - gl.L(1.2f);
                float L122 = gl.L(1.7f);
                i4 = 0;
                while (true) {
                    iArr = this.K0;
                    f9 = pow;
                    if (i4 >= 6) {
                    }
                    iArr[i4] = 0;
                    i4++;
                    pow = f9;
                }
                Paint.Cap cap2 = Paint.Cap.ROUND;
                Paint paint82 = this.M0;
                paint82.setStrokeCap(cap2);
                i5 = 0;
                while (i5 < max3) {
                }
                Paint paint92 = paint82;
                canvas.save();
                RectF rectF82 = rectF2;
                canvas.clipRect(rectF82);
                if (Build.VERSION.SDK_INT >= 26) {
                }
                boolean f702 = f();
                i6 = 0;
                while (i6 < 6) {
                }
                canvas.restore();
                canvas.save();
                i7 = Build.VERSION.SDK_INT;
                float f722 = rectF82.top;
                if (i7 >= 26) {
                }
                if (kraVar.b(canvas, f10)) {
                }
                canvas.restore();
                i10 = 0;
                while (i10 < i9) {
                }
                d = this.w0.d(f412 >= ((float) (gl.L(6.0f) + gl.L(24.0f))));
                if (d <= 0.01f) {
                }
            }
        } else {
            f2 = 0.5f;
        }
        if (this.O0.length < max3) {
            float[] fArr7 = new float[max3];
            float[] fArr8 = this.P0;
            f3 = min;
            System.arraycopy(fArr8, 0, fArr7, 0, Math.min(fArr8.length, max3));
            this.P0 = fArr7;
            this.O0 = new float[max3];
            this.H0 = new float[max3 * kk7.J2];
            for (int i38 = 0; i38 < 6; i38++) {
                fArr3[i38] = new float[max3 * 36];
            }
            for (int i39 = 0; i39 < max3; i39++) {
                d(i39);
            }
        } else {
            f3 = min;
        }
        byte[] bArr = this.M;
        if (bArr != null && bArr.length > 0) {
            int length = bArr.length;
            b = Byte.MIN_VALUE;
            b2 = Byte.MAX_VALUE;
            int i40 = 0;
            while (true) {
                f4 = f33;
                if (i40 >= length) {
                    break;
                }
                byte b4 = bArr[i40];
                b2 = (byte) Math.min((int) b2, (int) b4);
                b = (byte) Math.max((int) b, (int) b4);
                i40++;
                f33 = f4;
            }
        } else {
            f4 = f33;
            b = 1;
            b2 = 0;
        }
        int i41 = 0;
        while (i41 < max3) {
            float f80 = (i41 + f2) / max3;
            byte[] bArr2 = this.M;
            byte b5 = b2;
            if (bArr2 == null || bArr2.length == 0) {
                i = i41;
                b3 = 0;
            } else {
                i = i41;
                b3 = bArr2[Math.min(bArr2.length - 1, (int) (bArr2.length * f80))];
            }
            float[] fArr9 = this.O0;
            Typeface typeface = gl.a;
            fArr9[i] = Utilities.l((b3 - b5) / (b - b5));
            if (this.Q0 != max3) {
                this.P0[i] = (f80 < this.s || f80 > this.w) ? 1.0f : 0.0f;
            }
            i41 = i + 1;
            b2 = b5;
        }
        this.Q0 = max3;
        this.R0 = this.M;
        float f382 = max3;
        float f392 = max2 / f382;
        float min42 = Math.min(gl.L(2.0f), f392 * f2);
        float L52 = gl.L(2.0f);
        float L62 = gl.L(13.0f);
        if (this.a0) {
        }
        i2 = argb;
        rectF2 = rectF5;
        float f4022 = f5;
        float e22 = this.o0.e(false, (!g() || this.x || this.a0) ? 1.0f : 0.0f);
        gn gnVar22 = this.h;
        float L722 = gl.L(33.0f) + gnVar22.c();
        float f4122 = L4 - L3;
        float d422 = this.x0.d(L722 <= f4122 - ((float) gl.L(8.0f)));
        float R1222 = gl.R1(gl.L(24.0f), L722, d422);
        float L822 = gl.L(22.0f);
        float f4222 = this.q0;
        float f4322 = R1222 / 2.0f;
        float f4422 = L822 / 2.0f;
        rectF3 = this.D0;
        rectF3.set(f4222 - f4322, centerY3 - f4422, f4222 + f4322, centerY3 + f4422);
        canvas.save();
        Path path32 = this.u0;
        path32.rewind();
        rectF6.set(rectF3);
        rectF6.inset(-gl.L(3.0f), -gl.L(3.0f));
        path32.addRoundRect(rectF6, rectF6.height() / 2.0f, rectF6.height() / 2.0f, Path.Direction.CW);
        if (Build.VERSION.SDK_INT >= 26) {
        }
        f6 = f3 / 250.0f;
        f7 = f3 / 300.0f;
        i3 = 0;
        z = false;
        boolean z522 = false;
        while (true) {
            f8 = f7;
            kraVar = this.I0;
            if (i3 >= max3) {
            }
            i3 = i15 + 1;
            f7 = f8;
            f6 = f45;
            f29 = f20;
            z = z6;
            rectF3 = rectF4;
            f31 = 2.0f;
            f27 = 0.0f;
        }
        RectF rectF722 = rectF3;
        boolean z822 = z;
        canvas.restore();
        float f6022 = f3 / 1000.0f;
        pow = (float) Math.pow(0.2d, f6022);
        float L922 = gl.L(70.0f);
        float L1022 = gl.L(9.0f);
        float L1122 = f30 - gl.L(1.2f);
        float L1222 = gl.L(1.7f);
        i4 = 0;
        while (true) {
            iArr = this.K0;
            f9 = pow;
            if (i4 >= 6) {
            }
            iArr[i4] = 0;
            i4++;
            pow = f9;
        }
        Paint.Cap cap22 = Paint.Cap.ROUND;
        Paint paint822 = this.M0;
        paint822.setStrokeCap(cap22);
        i5 = 0;
        while (i5 < max3) {
        }
        Paint paint922 = paint822;
        canvas.save();
        RectF rectF822 = rectF2;
        canvas.clipRect(rectF822);
        if (Build.VERSION.SDK_INT >= 26) {
        }
        boolean f7022 = f();
        i6 = 0;
        while (i6 < 6) {
        }
        canvas.restore();
        canvas.save();
        i7 = Build.VERSION.SDK_INT;
        float f7222 = rectF822.top;
        if (i7 >= 26) {
        }
        if (kraVar.b(canvas, f10)) {
        }
        canvas.restore();
        i10 = 0;
        while (i10 < i9) {
        }
        d = this.w0.d(f4122 >= ((float) (gl.L(6.0f) + gl.L(24.0f))));
        if (d <= 0.01f) {
        }
    }

    public final void d(int i) {
        for (int i2 = 0; i2 < 18; i2++) {
            int i3 = ((18 * i) + i2) * 10;
            this.H0[i3 + 9] = h() - 0.5f;
            float[] fArr = this.H0;
            fArr[i3 + 5] = 0.0f;
            fArr[i3 + 4] = 1.0f;
            fArr[i3 + 6] = Float.NaN;
        }
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        boolean z = this.d0;
        if (z && !this.S) {
            float f = this.R;
            if (f >= 0.0f) {
                a(canvas, this.Q, f);
                return;
            }
        }
        if (this.S) {
            if (!z) {
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
        lbc lbcVar;
        if (!this.d0) {
            boolean contains = this.I.contains(motionEvent.getX(), motionEvent.getY());
            RectF rectF = this.J;
            boolean z = !contains && rectF.contains(motionEvent.getX(), motionEvent.getY());
            RectF rectF2 = this.K;
            boolean z2 = !contains && rectF2.contains(motionEvent.getX(), motionEvent.getY());
            boolean z3 = (contains || z || z2 || motionEvent.getX() <= rectF.right || motionEvent.getX() >= rectF2.left) ? false : true;
            if (motionEvent.getAction() == 0) {
                this.W = contains;
                this.U = z;
                this.V = z2;
                if (z || z2) {
                    this.b0 = g();
                    setPlaying(false);
                }
                this.a0 = z3;
                if (z3) {
                    this.b0 = g();
                    this.c0 = this.n != null ? r0.S() / this.n.U() : 1.0f;
                    setPlaying(false);
                }
                if (getParent() != null && (this.W || this.U || this.V || this.a0)) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                }
            } else if (motionEvent.getAction() == 2) {
                boolean z4 = this.U;
                RectF rectF3 = this.E;
                if (z4) {
                    this.s = Utilities.i(gl.x1(motionEvent.getX(), rectF3.left + gl.L(11.33f), rectF3.right - gl.L(11.33f)), Utilities.l(this.w - Math.max(1.0f / this.r, gl.L(30.0f) / (rectF3.width() - gl.L(22.66f)))), 0.0f);
                    invalidate();
                } else if (this.V) {
                    this.w = Utilities.i(gl.x1(motionEvent.getX(), rectF3.left + gl.L(11.33f), rectF3.right - gl.L(11.33f)), 1.0f, Utilities.l(Math.max(1.0f / this.r, gl.L(30.0f) / (rectF3.width() - gl.L(22.66f))) + this.s));
                    invalidate();
                } else if (this.a0) {
                    lbc lbcVar2 = this.n;
                    if (lbcVar2 != null) {
                        float i = Utilities.i(gl.x1(motionEvent.getX(), rectF3.left + gl.L(11.33f), rectF3.right - gl.L(11.33f)), this.w, this.s);
                        this.c0 = i;
                        lbcVar2.p0((long) (i * this.n.U()), false);
                    }
                    invalidate();
                }
                this.h.t(gl.g0(Math.round(Math.max(1.0f, (this.w - this.s) * this.r)), false, false), false, true);
            } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                if (motionEvent.getAction() == 1 && this.W) {
                    setPlaying(!g());
                } else if (this.U && this.x) {
                    lbc lbcVar3 = this.n;
                    if (lbcVar3 != null) {
                        lbcVar3.p0((long) (this.s * lbcVar3.U()), false);
                    }
                    setPlaying(true);
                } else if (this.V && this.x) {
                    lbc lbcVar4 = this.n;
                    if (lbcVar4 != null) {
                        lbcVar4.p0(Math.max((long) (this.s * lbcVar4.U()), ((long) (this.w * this.n.U())) - 1500), false);
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
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        if (this.T0 != null || this.X0) {
            if (actionMasked != 0) {
                return this.c1;
            }
        } else if (actionMasked == 0) {
            RectF rectF4 = this.g0;
            if (y >= rectF4.top - gl.L(10.0f) && y <= rectF4.bottom + gl.L(10.0f) && x >= rectF4.left - gl.L(8.0f) && x <= rectF4.right + gl.L(8.0f)) {
                this.b1 = x;
                this.d1 = false;
                this.e1 = -1;
                float L = gl.L(10.0f) / 2.0f;
                float f = this.z0 - L;
                float f2 = this.A0 + L;
                float abs = Math.abs(x - f);
                float abs2 = Math.abs(x - f2);
                if (Math.min(abs, abs2) >= gl.L(22.0f) || this.D0.contains(x, y)) {
                    this.W = true;
                } else {
                    int i2 = abs <= abs2 ? 0 : 1;
                    this.e1 = i2;
                    this.f1 = x - (i2 == 0 ? this.z0 : this.A0);
                    this.p0 = true;
                    this.g1 = g();
                    setPlaying(false);
                    h29 h29Var = this.e0;
                    if (h29Var != null) {
                        ((tw1) h29Var).a(true);
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
                    float max2 = Math.max(1.0f / Math.max(1.0f, this.r), gl.L(40.0f) / max);
                    float f3 = x - this.f1;
                    if (this.e1 == 0) {
                        this.s = Utilities.i(((f3 + gl.L(4.0f)) - this.B0) / max, this.w - max2, 0.0f);
                    } else {
                        this.w = Utilities.i(((f3 - gl.L(4.0f)) - this.B0) / max, 1.0f, this.s + max2);
                    }
                    i(true);
                    invalidate();
                    return true;
                }
                float scaledTouchSlop = ViewConfiguration.get(getContext()).getScaledTouchSlop();
                if (!this.d1 && Math.abs(x - this.b1) > scaledTouchSlop) {
                    this.W = false;
                    this.d1 = true;
                    this.a0 = true;
                    this.b0 = g();
                    lbc lbcVar5 = this.n;
                    if (lbcVar5 != null) {
                        lbcVar5.t0(false);
                    }
                }
                if (this.d1) {
                    this.c0 = Utilities.i((x - this.B0) / max, this.w, this.s);
                    lbc lbcVar6 = this.n;
                    if (lbcVar6 != null && lbcVar6.U() > 0) {
                        this.n.p0((long) (this.c0 * r13.U()), false);
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
                    lbc lbcVar7 = this.n;
                    if (lbcVar7 != null && lbcVar7.U() > 0) {
                        this.n.p0((long) (this.s * r13.U()), false);
                    }
                    if (this.g1) {
                        setPlaying(true);
                    }
                    h29 h29Var2 = this.e0;
                    if (h29Var2 != null) {
                        ((tw1) h29Var2).a(false);
                    }
                } else if (this.d1) {
                    this.a0 = false;
                    if (this.b0 && (lbcVar = this.n) != null) {
                        lbcVar.t0(true);
                        sr8 sr8Var = this.y;
                        gl.r(sr8Var);
                        gl.e3(sr8Var, 16L);
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

    public final boolean e(int i) {
        int v0 = bkb.v0(bkb.Tf, this.a);
        return (Color.blue(i) + ((Color.green(i) * 6) + (Color.red(i) * 3))) / 10 > ((Color.blue(v0) + ((Color.green(v0) * 6) + (Color.red(v0) * 3))) / 10) + 40;
    }

    public final boolean f() {
        return gl.B(bkb.v0(bkb.c6, this.a)) < 0.5f;
    }

    public final boolean g() {
        lbc lbcVar = this.n;
        return lbcVar != null && lbcVar.c0();
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
        lbc lbcVar = this.n;
        if (lbcVar == null) {
            return 0L;
        }
        return lbcVar.U();
    }

    public double getNewDuration() {
        return ((this.w - this.s) * getDuration()) / 1000.0d;
    }

    public String getTrimBubbleText() {
        return gl.g0((int) Math.floor(this.s * r0), false, false) + " - " + gl.g0(Math.round(this.r * this.w), false, false);
    }

    public float getTrimHandleX() {
        float L = gl.L(10.0f);
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
        int i = this.N0;
        int i2 = i ^ (i << 13);
        int i3 = i2 ^ (i2 >>> 17);
        this.N0 = i3 ^ (i3 << 5);
        return (r0 >>> 8) / 1.6777216E7f;
    }

    public final void i(boolean z) {
        int round;
        if (this.d0) {
            if (this.n == null || (!g() && (!this.x || this.f == null || this.n.S() <= (this.s * this.n.U()) + 30.0f || this.n.S() >= (this.w * this.n.U()) - 60.0f))) {
                round = Math.round(Math.max(1.0f, (this.w - this.s) * this.r));
            } else {
                round = (int) Math.floor(Math.max(0.0f, this.n.S() - (this.s * this.n.U())) / 1000.0f);
            }
            boolean z2 = false;
            String g0 = gl.g0(round, false, false);
            if (z && !k96.a0) {
                z2 = true;
            }
            this.h.t(g0, z2, true);
        }
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        float L = gl.L(32.0f);
        this.E.set(0.0f, (getHeight() - L) / 2.0f, getWidth(), (getHeight() + L) / 2.0f);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        float L = gl.L(32.0f);
        this.E.set(0.0f, (getMeasuredHeight() - L) / 2.0f, getMeasuredWidth(), (getMeasuredHeight() + L) / 2.0f);
    }

    public void setAllowDraw(boolean z) {
        this.R = -1.0f;
        if (this.S != z) {
            this.S = z;
            invalidate();
        }
    }

    public void setNewContentAlpha(float f) {
        if (this.s0 != f) {
            this.s0 = f;
            invalidate();
        }
    }

    public void setNewStyle(boolean z) {
        if (this.d0 == z) {
            return;
        }
        this.d0 = z;
        if (z) {
            float L = gl.L(14.0f);
            gn gnVar = this.h;
            gnVar.w(L);
            gnVar.x(gl.o());
            gnVar.n(0.35f, 260L, s33.h);
            this.f.h = 260.0f;
        }
        Paint.Style style = Paint.Style.STROKE;
        Paint paint = this.k0;
        paint.setStyle(style);
        paint.setStrokeWidth(gl.L(2.0f));
        Paint paint2 = this.l0;
        paint2.setStyle(style);
        paint2.setStrokeWidth(gl.L(1.5f));
        paint2.setColor(-1);
        invalidate();
    }

    public void setNewStyleDelegate(h29 h29Var) {
        this.e0 = h29Var;
    }

    public void setPlaying(boolean z) {
        if (this.T) {
            z = false;
        }
        if (this.n != null) {
            float S = r0.S() / this.n.U();
            if (S < this.s || S > this.w || (this.d0 && z && this.n.S() >= ((long) (this.w * this.n.U())) - 60)) {
                this.n.p0((long) (this.s * r0.U()), false);
            }
            this.n.t0(z);
        }
        this.f.a(z, true);
        if (this.d0) {
            if (z) {
                this.x = true;
            }
            i(true);
        }
        sr8 sr8Var = this.y;
        gl.r(sr8Var);
        if (z) {
            gl.e3(sr8Var, 16L);
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return this.h == drawable || this.f == drawable || super.verifyDrawable(drawable);
    }
}
