// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes3.dex */
public final class ksb extends View {
    public final Paint A0;
    public int A1;
    public final Paint B0;
    public final Paint C0;
    public final Paint D0;
    public final Path E;
    public final Paint E0;
    public boolean F;
    public final TextPaint F0;
    public String G;
    public final RectF G0;
    public boolean H;
    public final Path H0;
    public long I;
    public final Paint I0;
    public long J;
    public final jsb J0;
    public float K;
    public final Paint K0;
    public float L;
    public final Drawable L0;
    public float M;
    public final TextPaint M0;
    public isb N;
    public StaticLayout N0;
    public boolean O;
    public float O0;
    public String P;
    public float P0;
    public boolean Q;
    public final TextPaint Q0;
    public long R;
    public StaticLayout R0;
    public long S;
    public float S0;
    public float T;
    public float T0;
    public float U;
    public final LinearGradient U0;
    public boolean V;
    public final Matrix V0;
    public float W;
    public final Paint W0;
    public final dv9 X0;
    public boolean Y0;
    public final uwa Z0;
    public esb a;
    public boolean a0;
    public long a1;
    public Runnable b;
    public dsb b0;
    public long b1;
    public int c;
    public int c0;
    public final mm c1;
    public Runnable d;
    public final mm d0;
    public long d1;
    public long e;
    public final mm e0;
    public pqa e1;
    public long f;
    public final mm f0;
    public long f1;
    public final mm g0;
    public long g1;
    public fsb h;
    public final mm h0;
    public float h1;
    public final mm i0;
    public int i1;
    public final mm j0;
    public int j1;
    public boolean k0;
    public int k1;
    public final tl0 l0;
    public int l1;
    public final xl0 m0;
    public boolean m1;
    public int n;
    public final xl0 n0;
    public boolean n1;
    public final xl0 o0;
    public float o1;
    public final RectF p0;
    public boolean p1;
    public final Path q0;
    public VelocityTracker q1;
    public final ArrayList r;
    public final pkb r0;
    public boolean r1;
    public final ArrayList s;
    public final Drawable s0;
    public boolean s1;
    public final jsb t0;
    public int t1;
    public final RectF u0;
    public final float[] u1;
    public final Paint v0;
    public int v1;
    public fsb w;
    public final Path w0;
    public int w1;
    public final Paint x;
    public final Path x0;
    public int x1;
    public final Path y;
    public final RectF y0;
    public int y1;
    public final Path z0;
    public int z1;

    public ksb(Context context, ViewGroup viewGroup, ebb ebbVar, vnb vnbVar, tl0 tl0Var) {
        super(context);
        this.n = 0;
        this.r = new ArrayList();
        this.s = new ArrayList();
        this.x = new Paint(3);
        this.y = new Path();
        this.E = new Path();
        this.c0 = 1;
        k43 k43Var = k43.h;
        this.d0 = new mm(this, 0L, 360L, k43Var);
        this.e0 = new mm(360L, this, k43Var);
        this.f0 = new mm(this, 0L, 360L, k43Var);
        this.g0 = new mm(360L, this, k43Var);
        this.h0 = new mm(this, 0L, 360L, k43Var);
        this.i0 = new mm(this, 0L, 360L, k43Var);
        this.j0 = new mm(this, 0L, 320L, k43Var);
        this.k0 = true;
        this.p0 = new RectF();
        this.q0 = new Path();
        this.t0 = new jsb();
        this.u0 = new RectF();
        this.v0 = new Paint(3);
        this.w0 = new Path();
        this.x0 = new Path();
        this.y0 = new RectF();
        this.z0 = new Path();
        Paint paint = new Paint(1);
        this.A0 = paint;
        Paint paint2 = new Paint(1);
        this.B0 = paint2;
        Paint paint3 = new Paint(1);
        this.C0 = paint3;
        Paint paint4 = new Paint(1);
        this.D0 = paint4;
        Paint paint5 = new Paint(1);
        this.E0 = paint5;
        TextPaint textPaint = new TextPaint(1);
        this.F0 = textPaint;
        this.G0 = new RectF();
        this.H0 = new Path();
        Paint paint6 = new Paint(1);
        this.I0 = paint6;
        this.J0 = new jsb();
        Paint paint7 = new Paint(1);
        this.K0 = paint7;
        TextPaint textPaint2 = new TextPaint(1);
        this.M0 = textPaint2;
        TextPaint textPaint3 = new TextPaint(1);
        this.Q0 = textPaint3;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 16.0f, 0.0f, new int[]{16777215, -1}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        this.U0 = linearGradient;
        this.V0 = new Matrix();
        Paint paint8 = new Paint(1);
        this.W0 = paint8;
        this.X0 = new dv9(getContext(), null);
        this.a1 = -1L;
        this.b1 = -1L;
        this.c1 = new mm(0.0f, this, 0L, 340L, k43Var);
        this.d1 = -1L;
        this.i1 = -1;
        this.j1 = -1;
        this.k1 = -1;
        this.l1 = -1;
        this.o1 = 1.0f;
        this.r1 = true;
        this.s1 = false;
        this.u1 = new float[8];
        paint7.setColor(ConnectionsManager.DEFAULT_DATACENTER_ID);
        textPaint2.setTextSize(hl.L(12.0f));
        textPaint2.setTypeface(hl.o());
        textPaint2.setColor(-1);
        textPaint3.setTextSize(hl.L(12.0f));
        textPaint3.setColor(-1);
        paint6.setColor(1090519039);
        paint8.setShader(linearGradient);
        paint8.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        paint.setColor(-1);
        paint.setShadowLayer(hl.L(1.0f), 0.0f, hl.L(1.0f), 436207616);
        textPaint.setTextSize(hl.L(12.0f));
        textPaint.setColor(-1);
        textPaint.setShadowLayer(hl.L(2.0f), 0.0f, hl.L(2.0f), TLObject.FLAG_30);
        textPaint.setTypeface(hl.o());
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        paint3.setColor(-16777216);
        paint5.setColor(-1);
        paint4.setColor(637534208);
        this.r0 = new pkb(ob6.M0(2131744110, null), 12.0f, hl.o());
        Drawable mutate = getContext().getResources().getDrawable(R.drawable.timeline).mutate();
        this.s0 = mutate;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        mutate.setColorFilter(new PorterDuffColorFilter(-1, mode));
        Drawable mutate2 = getContext().getResources().getDrawable(R.drawable.filled_widget_music).mutate();
        this.L0 = mutate2;
        mutate2.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.l0 = tl0Var;
        this.m0 = new xl0(tl0Var, this, 0, false);
        this.n0 = new xl0(tl0Var, this, 3, false);
        this.o0 = new xl0(tl0Var, this, 4, false);
        this.Z0 = new uwa(this, viewGroup, vnbVar, tl0Var, ebbVar, (byte) 6);
    }

    private float getAudioHeight() {
        return hl.U1(this.g0.d(this.Q), hl.L(28.0f), hl.L(38.0f));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long getBaseDuration() {
        fsb fsbVar = this.h;
        if (fsbVar != null) {
            return Math.max(1L, fsbVar.e);
        }
        fsb fsbVar2 = this.w;
        return fsbVar2 != null ? Math.max(1L, fsbVar2.e) : this.F ? Math.max(1L, this.I) : Math.max(1L, this.S);
    }

    private float getCollageHeight() {
        ArrayList arrayList = this.s;
        if (arrayList.isEmpty()) {
            return 0.0f;
        }
        float f = 0.0f;
        for (int i = 0; i < arrayList.size(); i++) {
            if (f > 0.0f) {
                f += hl.L(4.0f);
            }
            f += hl.U1(((fsb) arrayList.get(i)).k.c, hl.L(28.0f), hl.L(38.0f));
        }
        return f;
    }

    private float getRoundHeight() {
        if (this.F) {
            return hl.U1(this.e0.d(this.H), hl.L(28.0f), hl.L(38.0f));
        }
        return 0.0f;
    }

    private float getVideoHeight() {
        if (this.h == null) {
            return 0.0f;
        }
        return hl.U1(r2.k.c, hl.L(28.0f), hl.L(38.0f));
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x013c A[LOOP:0: B:38:0x013c->B:42:0x01e9, LOOP_START, PHI: r5
      0x013c: PHI (r5v34 int) = (r5v7 int), (r5v35 int) binds: [B:37:0x013a, B:42:0x01e9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x03c2 A[PHI: r21
      0x03c2: PHI (r21v2 int) = (r21v1 int), (r21v1 int), (r21v3 int) binds: [B:89:0x0236, B:91:0x0240, B:77:0x03c0] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01f1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int b(MotionEvent motionEvent) {
        boolean z;
        int i;
        fsb fsbVar;
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        long min = Math.min(getBaseDuration(), getMaxScrollDuration());
        float k = Utilities.k(this.e, getBaseDuration(), 0L);
        fsb fsbVar2 = this.w;
        float f = min;
        float f2 = (this.v1 * (((k + (fsbVar2 != null ? (fsbVar2.g * fsbVar2.e) + fsbVar2.f : this.h == null ? this.R : 0L)) - this.f) / f)) + this.z1 + this.y1;
        if (!this.Y0 && x >= f2 - hl.L(12.0f) && x <= f2 + hl.L(12.0f)) {
            return 0;
        }
        boolean z2 = this.h != null && y > (((float) (this.x1 - this.A1)) - getVideoHeight()) - ((float) hl.L(2.0f));
        ArrayList arrayList = this.s;
        boolean z3 = !arrayList.isEmpty() && y > ((((((float) (this.x1 - this.A1)) - getVideoHeight()) - ((float) hl.L(4.0f))) - getCollageHeight()) - ((float) hl.L(4.0f))) - ((float) hl.L(2.0f)) && y < (((float) (this.x1 - this.A1)) - getVideoHeight()) - ((float) hl.L(2.0f));
        if (this.F) {
            if (y > (((((((this.x1 - this.A1) - getVideoHeight()) - hl.L(4.0f)) - getCollageHeight()) - hl.L(arrayList.isEmpty() ? 0.0f : 4.0f)) - getRoundHeight()) - hl.L(4.0f)) - hl.L(2.0f)) {
                if (y < ((((this.x1 - this.A1) - getVideoHeight()) - hl.L(2.0f)) - getCollageHeight()) - hl.L(arrayList.isEmpty() ? 0.0f : 4.0f)) {
                    z = true;
                    if (z3) {
                        i = 1;
                        if (z2) {
                            float f3 = this.z1 + this.y1;
                            fsb fsbVar3 = this.h;
                            float f4 = fsbVar3.g;
                            float f5 = fsbVar3.e;
                            float f6 = this.f;
                            float f7 = this.v1;
                            float f8 = ((((f4 * f5) - f6) / f) * f7) + f3;
                            float f9 = ((((fsbVar3.h * f5) - f6) / f) * f7) + f3;
                            if (this.Y0) {
                                if (getBaseDuration() < getMaxScrollDuration()) {
                                    return 4;
                                }
                                if (x < f8 - hl.L(15.0f) || x > f9 + hl.L(15.0f)) {
                                    return i;
                                }
                                return 4;
                            }
                            if (x >= f8 - hl.L(15.0f) && x <= hl.L(5.0f) + f8) {
                                return 2;
                            }
                            if (x >= f9 - hl.L(5.0f) && x <= hl.L(15.0f) + f9) {
                                return 3;
                            }
                            if (x >= f8 && x <= f9) {
                                fsb fsbVar4 = this.h;
                                if (fsbVar4.g > 0.01f || fsbVar4.h < 0.99f) {
                                    return 4;
                                }
                            }
                        } else if (z) {
                            float f10 = this.z1 + this.y1;
                            float f11 = this.J;
                            float f12 = this.K;
                            float f13 = this.I;
                            float f14 = this.f;
                            float f15 = this.v1;
                            float f16 = (((((f12 * f13) + f11) - f14) / f) * f15) + f10;
                            float f17 = (((((this.L * f13) + f11) - f14) / f) * f15) + f10;
                            if (this.H || this.h == null) {
                                if (x >= f16 - hl.L(15.0f) && x <= hl.L(5.0f) + f16) {
                                    return 10;
                                }
                                if (x >= f17 - hl.L(5.0f) && x <= hl.L(15.0f) + f17) {
                                    return 11;
                                }
                                if (x >= f16 && x <= f17) {
                                    return this.h == null ? 12 : 9;
                                }
                                float f18 = this.z1 + this.y1;
                                long j = this.J;
                                long j2 = this.f;
                                float f19 = this.v1;
                                float f20 = (((j - j2) / f) * f19) + f18;
                                f17 = c00.B((j + this.I) - j2, f, f19, f18);
                                f16 = f20;
                            }
                            if (x >= f16 && x <= f17) {
                                return 9;
                            }
                        } else if (this.O) {
                            float f21 = this.z1 + this.y1;
                            float f22 = this.R;
                            float f23 = this.T;
                            float f24 = this.S;
                            float f25 = this.f;
                            float f26 = this.v1;
                            float f27 = (((((f23 * f24) + f22) - f25) / f) * f26) + f21;
                            float f28 = (((((this.U * f24) + f22) - f25) / f) * f26) + f21;
                            if (this.Q || (this.h == null && !this.F)) {
                                if (x >= f27 - hl.L(15.0f) && x <= hl.L(5.0f) + f27) {
                                    return 6;
                                }
                                if (x >= f28 - hl.L(5.0f) && x <= hl.L(15.0f) + f28) {
                                    return 7;
                                }
                                if (x >= f27 && x <= f28) {
                                    return this.h == null ? 8 : 5;
                                }
                                float f29 = this.z1 + this.y1;
                                long j3 = this.R;
                                long j4 = this.f;
                                float f30 = this.v1;
                                float f31 = (((j3 - j4) / f) * f30) + f29;
                                f28 = c00.B((j3 + this.S) - j4, f, f30, f29);
                                f27 = f31;
                            }
                            if (x >= f27 && x <= f28) {
                                return 5;
                            }
                        }
                    } else {
                        for (int i2 = 0; i2 < arrayList.size(); i2++) {
                            fsb fsbVar5 = (fsb) arrayList.get(i2);
                            RectF rectF = hl.P;
                            rectF.set(fsbVar5.j);
                            rectF.inset(-hl.L(2.0f), -hl.L(2.0f));
                            if (rectF.contains(x, y)) {
                                float f32 = this.z1 + this.y1;
                                float f33 = fsbVar5.f;
                                float f34 = this.v1;
                                float f35 = ((f33 / f) * f34) + f32;
                                float f36 = fsbVar5.g;
                                float f37 = fsbVar5.e;
                                float f38 = ((((f36 * f37) + f33) / f) * f34) + f32;
                                float f39 = ((((fsbVar5.h * f37) + f33) / f) * f34) + f32;
                                float B = c00.B(r6 + r11, f, f34, f32);
                                this.j1 = i2;
                                if (x >= f38 - hl.L(15.0f) && x <= hl.L(5.0f) + f38) {
                                    return 13;
                                }
                                if (x >= f39 - hl.L(5.0f) && x <= hl.L(15.0f) + f39) {
                                    return 14;
                                }
                                if (x < f38 || x > f39 || (fsbVar5.g <= 0.01f && fsbVar5.h >= 0.99f)) {
                                    return (x < f35 || x > B) ? -1 : 16;
                                }
                                return 15;
                            }
                        }
                        i = 1;
                    }
                    fsbVar = this.h;
                    if (fsbVar != null || fsbVar.e <= getMaxScrollDuration() || !z2) {
                        return -1;
                    }
                }
            }
        }
        z = false;
        if (z3) {
        }
        fsbVar = this.h;
        return fsbVar != null ? -1 : -1;
    }

    public final void c(float f, float f2, float f3, long j, Canvas canvas) {
        float f4;
        if (this.Y0) {
            return;
        }
        long min = Math.min(getBaseDuration(), getMaxScrollDuration());
        float k = Utilities.k(j, getBaseDuration(), 0L);
        fsb fsbVar = this.w;
        if (fsbVar != null) {
            f4 = (fsbVar.g * fsbVar.e) + fsbVar.f;
        } else {
            f4 = this.h == null ? this.R : 0L;
        }
        float f5 = (this.v1 * (((k + f4) - this.f) / min)) + this.z1 + this.y1;
        float f6 = (1.0f - f3) * (((f2 - f) / 2.0f) / 2.0f);
        float f7 = f + f6;
        float f8 = f2 - f6;
        Paint paint = this.D0;
        paint.setAlpha((int) (38.0f * f3));
        Paint paint2 = this.E0;
        paint2.setAlpha((int) (f3 * 255.0f));
        RectF rectF = hl.P;
        rectF.set(f5 - hl.N(1.5f), f7, hl.N(1.5f) + f5, f8);
        rectF.inset(-hl.N(0.66f), -hl.N(0.66f));
        canvas.drawRoundRect(rectF, hl.L(6.0f), hl.L(6.0f), paint);
        rectF.set(f5 - hl.N(1.5f), f7, hl.N(1.5f) + f5, f8);
        canvas.drawRoundRect(rectF, hl.L(6.0f), hl.L(6.0f), paint2);
    }

    @Override // android.view.View
    public final void computeScroll() {
        dv9 dv9Var = this.X0;
        if (!dv9Var.b()) {
            if (this.s1) {
                this.s1 = false;
                esb esbVar = this.a;
                if (esbVar != null) {
                    esbVar.v0(false);
                    return;
                }
                return;
            }
            return;
        }
        int i = dv9Var.j;
        long min = Math.min(getBaseDuration(), getMaxScrollDuration());
        if (this.r1) {
            this.f = (long) Math.max(0.0f, (((i - this.z1) - this.y1) / this.v1) * min);
        } else {
            if (!this.Q) {
                dv9Var.a();
                return;
            }
            int i2 = this.z1;
            int i3 = this.y1;
            float f = this.v1;
            float f2 = min;
            h(((((i - i2) - i3) / f) * f2) - ((((this.t1 - i2) - i3) / f) * f2));
        }
        invalidate();
        this.t1 = i;
    }

    public final void d(Canvas canvas, Paint paint, float f, float f2, float f3, float f4, float f5) {
        if (f5 <= 0.0f) {
            return;
        }
        RectF rectF = hl.P;
        rectF.set(f3 - hl.L(10.0f), f, hl.L(10.0f) + f4, f2);
        canvas.saveLayerAlpha(0.0f, 0.0f, this.w1, this.x1, jn7.d4, 31);
        int i = (int) (255.0f * f5);
        Paint paint2 = this.A0;
        paint2.setAlpha(i);
        canvas.drawRoundRect(rectF, hl.L(6.0f), hl.L(6.0f), paint2);
        rectF.inset(hl.L(this.Y0 ? 2.5f : 10.0f), hl.L(2.0f));
        boolean z = this.Y0;
        Paint paint3 = this.B0;
        if (z) {
            canvas.drawRoundRect(rectF, hl.L(3.0f), hl.L(3.0f), paint3);
        } else {
            canvas.drawRect(rectF, paint3);
        }
        float L = hl.L(2.0f);
        float L2 = hl.L(10.0f);
        Paint paint4 = this.C0;
        Paint paint5 = paint != null ? paint : paint4;
        paint4.setAlpha(jn7.d4);
        paint5.setAlpha(i);
        float f6 = f + f2;
        float f7 = (f6 - L2) / 2.0f;
        float f8 = (f6 + L2) / 2.0f;
        rectF.set(qd4.x(hl.L(this.Y0 ? 2.0f : 10.0f), L, 2.0f, f3), f7, f3 - ((hl.L(this.Y0 ? 2.0f : 10.0f) + L) / 2.0f), f8);
        if (!this.Y0) {
            canvas.drawRoundRect(rectF, hl.L(1.0f), hl.L(1.0f), paint5);
            if (paint != null && !this.Y0) {
                paint4.setAlpha((int) (f5 * 48.0f));
                canvas.drawRoundRect(rectF, hl.L(1.0f), hl.L(1.0f), paint4);
            }
        }
        rectF.set(bp1.z(hl.L(this.Y0 ? 2.5f : 10.0f), L, 2.0f, f4), f7, qd4.e(hl.L(this.Y0 ? 2.5f : 10.0f), L, 2.0f, f4), f8);
        if (!this.Y0) {
            canvas.drawRoundRect(rectF, hl.L(1.0f), hl.L(1.0f), paint5);
            if (paint != null) {
                paint4.setAlpha((int) (f5 * 48.0f));
                canvas.drawRoundRect(rectF, hl.L(1.0f), hl.L(1.0f), paint4);
            }
        }
        canvas.restore();
    }

    /* JADX WARN: Removed duplicated region for block: B:136:0x0684  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x06de  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x0c4b  */
    /* JADX WARN: Removed duplicated region for block: B:417:0x0f75  */
    /* JADX WARN: Removed duplicated region for block: B:426:0x1073  */
    /* JADX WARN: Removed duplicated region for block: B:442:0x10b6  */
    /* JADX WARN: Removed duplicated region for block: B:463:0x0e1e  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        float f;
        float f2;
        boolean z;
        int i;
        int i2;
        long k;
        fsb fsbVar;
        fsb fsbVar2;
        int i3;
        float f3;
        float max;
        float f4;
        Canvas canvas2;
        boolean z2;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        Paint paint;
        float f19;
        float f20;
        float f21;
        float f22;
        float f23;
        double d;
        float f24;
        float f25;
        float f26;
        float f27;
        float f28;
        Canvas canvas3;
        int i4;
        ksb ksbVar;
        float e;
        float f29;
        float f30;
        float f31;
        fsb fsbVar3;
        long j;
        float f32;
        float R1;
        float z3;
        long j2;
        float f33;
        boolean z4;
        float f34;
        tl0 tl0Var;
        float B;
        float f35;
        float f36;
        float f37;
        int i5;
        int i6;
        float f38;
        boolean z5;
        int i7;
        boolean z6;
        int i8;
        Paint paint2;
        float f39;
        float B2;
        float f40;
        float f41;
        float f42;
        Paint paint3;
        long j3;
        float f43;
        float f44;
        float f45;
        int i9;
        boolean z7;
        boolean z8;
        int i10;
        int i11;
        int i12;
        float f46;
        float f47;
        float f48;
        float f49;
        int i13;
        int i14;
        float f50;
        float f51;
        tl0 tl0Var2;
        ksb ksbVar2 = this;
        Paint c = ksbVar2.m0.c(1.0f);
        float d2 = ksbVar2.j0.d(ksbVar2.k0);
        long min = Math.min(ksbVar2.getBaseDuration(), ksbVar2.getMaxScrollDuration());
        if (d2 < 1.0f) {
            f2 = 1.0f;
            ksbVar2.p0.set(ksbVar2.z1, (ksbVar2.x1 - ksbVar2.A1) - hl.L(28.0f), ksbVar2.w1 - ksbVar2.z1, ksbVar2.x1 - ksbVar2.A1);
            ksbVar2.q0.rewind();
            ksbVar2.q0.addRoundRect(ksbVar2.p0, hl.L(8.0f), hl.L(8.0f), Path.Direction.CW);
            canvas.saveLayerAlpha(ksbVar2.p0, (int) ((1.0f - d2) * 255.0f), 31);
            canvas.clipPath(ksbVar2.q0);
            if (ksbVar2.l0.c()) {
                ksbVar2.m0.a(canvas);
                canvas.drawColor(855638016);
            } else if (c == null) {
                canvas.drawColor(TLObject.FLAG_30);
            } else {
                canvas.drawRect(ksbVar2.p0, c);
                canvas.drawColor(855638016);
            }
            if (!ksbVar2.r.isEmpty() && (tl0Var2 = ksbVar2.l0) != null && tl0Var2.c()) {
                float e2 = ksbVar2.i0.e(false, jsb.c(ksbVar2.r));
                jsb jsbVar = ksbVar2.t0;
                RectF rectF = ksbVar2.p0;
                jsbVar.a((((ksbVar2.R - ksbVar2.f) / min) * ksbVar2.v1) + ksbVar2.z1 + ksbVar2.y1, rectF.left, rectF.right, hl.L(28.0f), e2, ksbVar2.p0.bottom, ksbVar2.r);
                canvas.saveLayerAlpha(ksbVar2.p0, jn7.m1, 31);
                canvas.clipPath(ksbVar2.t0);
                ksbVar2.o0.a(canvas);
                canvas.restore();
            } else if (!ksbVar2.r.isEmpty()) {
                Paint c2 = ksbVar2.o0.c(0.4f);
                if (c2 == null) {
                    c2 = ksbVar2.I0;
                    c2.setAlpha(64);
                }
                float e3 = ksbVar2.i0.e(false, jsb.c(ksbVar2.r));
                f = d2;
                jsb jsbVar2 = ksbVar2.t0;
                RectF rectF2 = ksbVar2.p0;
                jsbVar2.a((((ksbVar2.R - ksbVar2.f) / min) * ksbVar2.v1) + ksbVar2.z1 + ksbVar2.y1, rectF2.left, rectF2.right, hl.L(28.0f), e3, ksbVar2.p0.bottom, ksbVar2.r);
                canvas.drawPath(ksbVar2.t0, c2);
                float L = ((ksbVar2.r0.c + hl.L(3.66f)) + ksbVar2.s0.getIntrinsicWidth()) / 2.0f;
                int centerX = (int) (ksbVar2.p0.centerX() - L);
                int centerY = (int) ksbVar2.p0.centerY();
                Drawable drawable = ksbVar2.s0;
                drawable.setBounds(centerX, bp1.y(2, centerY, drawable), ksbVar2.s0.getIntrinsicWidth() + centerX, bp1.i(2, centerY, ksbVar2.s0));
                ksbVar2.s0.setAlpha(jn7.U2);
                ksbVar2.s0.draw(canvas);
                z = false;
                ksbVar2.r0.c(hl.L(3.66f) + (ksbVar2.p0.centerX() - L) + ksbVar2.s0.getIntrinsicWidth(), centerY, 0.75f, -1, canvas);
                canvas.restore();
            }
            f = d2;
            float L2 = ((ksbVar2.r0.c + hl.L(3.66f)) + ksbVar2.s0.getIntrinsicWidth()) / 2.0f;
            int centerX2 = (int) (ksbVar2.p0.centerX() - L2);
            int centerY2 = (int) ksbVar2.p0.centerY();
            Drawable drawable2 = ksbVar2.s0;
            drawable2.setBounds(centerX2, bp1.y(2, centerY2, drawable2), ksbVar2.s0.getIntrinsicWidth() + centerX2, bp1.i(2, centerY2, ksbVar2.s0));
            ksbVar2.s0.setAlpha(jn7.U2);
            ksbVar2.s0.draw(canvas);
            z = false;
            ksbVar2.r0.c(hl.L(3.66f) + (ksbVar2.p0.centerX() - L2) + ksbVar2.s0.getIntrinsicWidth(), centerY2, 0.75f, -1, canvas);
            canvas.restore();
        } else {
            f = d2;
            f2 = 1.0f;
            z = false;
        }
        if (f > 0.0f) {
            if (d2 < 1.0f) {
                f4 = 0.0f;
                canvas2 = canvas;
                canvas2.saveLayerAlpha(0.0f, 0.0f, ksbVar2.getWidth(), ksbVar2.getHeight(), (int) (f * 255.0f), 31);
                z2 = true;
            } else {
                f4 = 0.0f;
                canvas2 = canvas;
                z2 = z;
            }
            fsb fsbVar4 = ksbVar2.h;
            float f52 = fsbVar4 != null ? f2 : f4;
            float d3 = fsbVar4 != null ? fsbVar4.k.d((ksbVar2.Q || ksbVar2.H) ? z : true) : f4;
            float f53 = ksbVar2.x1 - ksbVar2.A1;
            float L3 = hl.L(4.0f);
            if (ksbVar2.h != null) {
                canvas2.save();
                float videoHeight = ksbVar2.getVideoHeight();
                fsb fsbVar5 = ksbVar2.h;
                float f54 = fsbVar5.g;
                long j4 = fsbVar5.e;
                float f55 = j4;
                f10 = c00.x(f54, f55, d3, f4);
                float x = c00.x(fsbVar5.h, f55, d3, f4);
                if (j4 <= 0) {
                    f5 = d3;
                    f6 = f52;
                    f46 = f4;
                    f8 = f46;
                } else {
                    f8 = f4;
                    f5 = d3;
                    f6 = f52;
                    f46 = (ksbVar2.z1 + ksbVar2.y1) - ((ksbVar2.f / min) * ksbVar2.v1);
                }
                float f56 = ksbVar2.y1;
                float f57 = f46 - f56;
                if (j4 <= 0) {
                    f7 = L3;
                    f11 = x;
                    f47 = f8;
                } else {
                    f7 = L3;
                    f11 = x;
                    f47 = ksbVar2.z1 + r3 + (((j4 - ksbVar2.f) / min) * ksbVar2.v1);
                }
                ksbVar2.u0.set(f57, f53 - videoHeight, f47 + f56, f53);
                float f58 = f53 - ((f7 * f6) + videoHeight);
                RectF rectF3 = ksbVar2.u0;
                float f59 = (rectF3.top * f5) + f8;
                float f60 = (rectF3.bottom * f5) + f8;
                ksbVar2.w0.rewind();
                ksbVar2.w0.addRoundRect(ksbVar2.u0, hl.L(8.0f), hl.L(8.0f), Path.Direction.CW);
                canvas2.clipPath(ksbVar2.w0);
                isb isbVar = ksbVar2.h.c;
                if (isbVar != null) {
                    int i15 = isbVar.f;
                    float f61 = i15;
                    int max2 = (int) Math.max(0.0d, Math.floor((f57 - ksbVar2.z1) / f61));
                    int min2 = (int) Math.min(ksbVar2.h.c.c, Math.ceil(((r3 - f57) - ksbVar2.z1) / f61) + 1.0d);
                    int i16 = (int) ksbVar2.u0.top;
                    boolean z9 = ksbVar2.h.c.d.size() >= min2;
                    boolean z10 = (i15 == 0 || !z9 || ksbVar2.h.b) ? false : true;
                    f48 = f58;
                    if (z10) {
                        int i17 = max2;
                        while (true) {
                            if (i17 >= Math.min(ksbVar2.h.c.d.size(), min2)) {
                                break;
                            }
                            if (((hsb) ksbVar2.h.c.d.get(i17)).a == null) {
                                z10 = false;
                                break;
                            }
                            i17++;
                        }
                    }
                    if (!z10) {
                        if (ksbVar2.l0.c()) {
                            ksbVar2.m0.a(canvas2);
                            canvas2.drawColor(855638016);
                        } else if (c == null) {
                            canvas2.drawColor(TLObject.FLAG_30);
                        } else {
                            canvas2.drawRect(ksbVar2.u0, c);
                            canvas2.drawColor(855638016);
                        }
                    }
                    if (i15 != 0) {
                        float f62 = f57;
                        int i18 = max2;
                        while (i18 < Math.min(ksbVar2.h.c.d.size(), min2)) {
                            hsb hsbVar = (hsb) ksbVar2.h.c.d.get(i18);
                            int i19 = min2;
                            if (hsbVar.a != null) {
                                i14 = i18;
                                f50 = f60;
                                f51 = f59;
                                ksbVar2.v0.setAlpha((int) (hsbVar.b.e(false, f2) * 255.0f));
                                canvas2.drawBitmap(hsbVar.a, f62, i16 - ((int) ((r2.getHeight() - videoHeight) / 2.0f)), ksbVar2.v0);
                            } else {
                                i14 = i18;
                                f50 = f60;
                                f51 = f59;
                            }
                            f62 += f61;
                            i18 = i14 + 1;
                            min2 = i19;
                            f60 = f50;
                            f59 = f51;
                            f2 = 1.0f;
                        }
                    }
                    f13 = f60;
                    f14 = f59;
                    f9 = 2.0f;
                    if (!z9) {
                        ksbVar2.h.c.b();
                    }
                } else {
                    f48 = f58;
                    f13 = f60;
                    f14 = f59;
                    f9 = 2.0f;
                }
                ksbVar2.x0.rewind();
                if (!ksbVar2.Y0) {
                    RectF rectF4 = hl.P;
                    int i20 = ksbVar2.z1;
                    int i21 = ksbVar2.y1;
                    float f63 = i20 + i21;
                    fsb fsbVar6 = ksbVar2.h;
                    float f64 = fsbVar6.g;
                    float f65 = fsbVar6.e;
                    int i22 = i21;
                    float f66 = ksbVar2.f;
                    float f67 = (f64 * f65) - f66;
                    float f68 = min;
                    float f69 = ksbVar2.v1;
                    float f70 = ((f67 / f68) * f69) + f63;
                    if (f64 <= f8) {
                        f49 = f69;
                        i13 = i22;
                    } else {
                        f49 = f69;
                        i13 = 0;
                    }
                    float f71 = f70 - i13;
                    float f72 = ksbVar2.x1 - ksbVar2.A1;
                    float f73 = f72 - videoHeight;
                    float f74 = fsbVar6.h;
                    float f75 = ((((f65 * f74) - f66) / f68) * f49) + f63;
                    if (f74 < 1.0f) {
                        i22 = 0;
                    }
                    rectF4.set(f71, f73, f75 + i22, f72);
                    ksbVar2.x0.addRoundRect(rectF4, ksbVar2.u1, Path.Direction.CW);
                    canvas2.clipPath(ksbVar2.x0, Region.Op.DIFFERENCE);
                    canvas2.drawColor(1342177280);
                }
                canvas2.restore();
                f12 = videoHeight;
                f53 = f48;
            } else {
                f5 = d3;
                f6 = f52;
                f7 = L3;
                f8 = f4;
                f9 = 2.0f;
                f10 = f8;
                f11 = f10;
                f12 = f11;
                f13 = f12;
                f14 = f13;
            }
            if (ksbVar2.s.isEmpty()) {
                f15 = f7;
                f16 = 0.0f;
            } else {
                ksbVar2.getCollageHeight();
                int i23 = 0;
                while (i23 < ksbVar2.s.size()) {
                    fsb fsbVar7 = (fsb) ksbVar2.s.get(i23);
                    float d4 = fsbVar7.k.d((ksbVar2.Q || ksbVar2.H || ksbVar2.n != i23) ? false : true);
                    fsb fsbVar8 = ksbVar2.w;
                    int i24 = ksbVar2.z1;
                    int i25 = ksbVar2.y1;
                    if (fsbVar7 != fsbVar8) {
                        i8 = i23;
                        float f76 = min;
                        float R12 = ((((hl.R1(fsbVar7.g, f8, d4) * fsbVar7.e) + (fsbVar7.f - ksbVar2.f)) / f76) * ksbVar2.v1) + i24 + i25;
                        paint2 = c;
                        B2 = (c00.z(hl.R1(fsbVar7.h, 1.0f, d4), fsbVar7.e, fsbVar7.f - ksbVar2.f, f76) * ksbVar2.v1) + ksbVar2.z1 + ksbVar2.y1;
                        f39 = f7;
                        f40 = R12;
                    } else {
                        i8 = i23;
                        float f77 = f7;
                        paint2 = c;
                        float f78 = i24 + i25;
                        long j5 = fsbVar7.f - ksbVar2.f;
                        float f79 = min;
                        f39 = f77;
                        float f80 = ksbVar2.v1;
                        float f81 = ((j5 / f79) * f80) + f78;
                        B2 = c00.B(j5 + fsbVar7.e, f79, f80, f78);
                        f40 = f81;
                    }
                    canvas2.save();
                    float U1 = hl.U1(d4, hl.L(28.0f), hl.L(38.0f));
                    RectF rectF5 = fsbVar7.j;
                    float f82 = ksbVar2.y1;
                    rectF5.set(f40 - f82, f53 - U1, B2 + f82, f53);
                    RectF rectF6 = fsbVar7.j;
                    f14 = (rectF6.top * d4) + f14;
                    f13 = (rectF6.bottom * d4) + f13;
                    float f83 = fsbVar7.f;
                    float f84 = fsbVar7.g;
                    float f85 = fsbVar7.e;
                    float g = bp1.g(f84, f85, f83, d4, f10);
                    f11 = bp1.g(fsbVar7.h, f85, f83, d4, f11);
                    ksbVar2.y.rewind();
                    ksbVar2.y.addRoundRect(fsbVar7.j, hl.L(8.0f), hl.L(8.0f), Path.Direction.CW);
                    canvas2.clipPath(ksbVar2.y);
                    isb isbVar2 = fsbVar7.c;
                    if (isbVar2 != null) {
                        long j6 = fsbVar7.e;
                        if (j6 <= 0) {
                            f41 = f53;
                            j3 = j6;
                            f43 = 0.0f;
                        } else {
                            f41 = f53;
                            j3 = j6;
                            f43 = (((fsbVar7.f - ksbVar2.f) / min) * ksbVar2.v1) + ksbVar2.z1 + ksbVar2.y1;
                        }
                        float f86 = f43 - ksbVar2.y1;
                        if (j6 <= 0) {
                            f44 = f86;
                            f45 = 0.0f;
                        } else {
                            f44 = f86;
                            f45 = ((((fsbVar7.f + j3) - ksbVar2.f) / min) * ksbVar2.v1) + ksbVar2.z1 + r5;
                        }
                        int i26 = isbVar2.f;
                        float f87 = i26;
                        int max3 = (int) Math.max(0.0d, Math.floor((f44 - ((((fsbVar7.f - ksbVar2.f) / min) * ksbVar2.v1) + (ksbVar2.z1 + ksbVar2.y1))) / f87));
                        f42 = g;
                        int min3 = (int) Math.min(fsbVar7.c.c, Math.ceil(((f45 + r6) - f44) / f87) + 1.0d);
                        int i27 = (int) fsbVar7.j.top;
                        boolean z11 = fsbVar7.c.d.size() >= min3;
                        if (z11) {
                            int i28 = max3;
                            i9 = i28;
                            while (i28 < Math.min(fsbVar7.c.d.size(), min3)) {
                                if (((hsb) fsbVar7.c.d.get(i28)).a == null) {
                                    z7 = false;
                                    break;
                                }
                                i28++;
                            }
                        } else {
                            i9 = max3;
                        }
                        z7 = z11;
                        if (!z7) {
                            if (ksbVar2.l0.c()) {
                                ksbVar2.m0.a(canvas2);
                                canvas2.drawColor(855638016);
                            } else if (paint2 == null) {
                                canvas2.drawColor(TLObject.FLAG_30);
                            } else {
                                z8 = z11;
                                paint3 = paint2;
                                canvas2.drawRect(fsbVar7.j, paint3);
                                canvas2.drawColor(855638016);
                                if (i26 != 0) {
                                    int i29 = i9;
                                    while (i29 < Math.min(fsbVar7.c.d.size(), min3)) {
                                        hsb hsbVar2 = (hsb) fsbVar7.c.d.get(i29);
                                        if (hsbVar2.a != null) {
                                            i10 = i29;
                                            i11 = min3;
                                            i12 = i27;
                                            ksbVar2.x.setAlpha((int) (hsbVar2.b.e(false, 1.0f) * 255.0f));
                                            canvas2.drawBitmap(hsbVar2.a, f44, i12 - ((int) ((r3.getHeight() - U1) / f9)), ksbVar2.x);
                                        } else {
                                            i10 = i29;
                                            i11 = min3;
                                            i12 = i27;
                                        }
                                        f44 += f87;
                                        i29 = i10 + 1;
                                        min3 = i11;
                                        i27 = i12;
                                    }
                                }
                                if (!z8) {
                                    fsbVar7.c.b();
                                }
                            }
                        }
                        z8 = z11;
                        paint3 = paint2;
                        if (i26 != 0) {
                        }
                        if (!z8) {
                        }
                    } else {
                        f41 = f53;
                        f42 = g;
                        paint3 = paint2;
                    }
                    ksbVar2.E.rewind();
                    if (!ksbVar2.Y0) {
                        RectF rectF7 = hl.P;
                        int i30 = ksbVar2.z1;
                        int i31 = ksbVar2.y1;
                        float f88 = i30 + i31;
                        float f89 = fsbVar7.g;
                        int i32 = i31;
                        float f90 = fsbVar7.e;
                        float f91 = f89 * f90;
                        float f92 = ksbVar2.f;
                        float f93 = f91 - f92;
                        float f94 = fsbVar7.f;
                        float f95 = f93 + f94;
                        float f96 = min;
                        float f97 = f95 / f96;
                        float f98 = ksbVar2.v1;
                        float f99 = ((f97 * f98) + f88) - (f89 <= 0.0f ? i32 : 0);
                        RectF rectF8 = fsbVar7.j;
                        float f100 = rectF8.top;
                        float f101 = fsbVar7.h;
                        float f102 = (((((f90 * f101) - f92) + f94) / f96) * f98) + f88;
                        if (f101 < 1.0f) {
                            i32 = 0;
                        }
                        rectF7.set(f99, f100, f102 + i32, rectF8.bottom);
                        ksbVar2.E.addRoundRect(rectF7, ksbVar2.u1, Path.Direction.CW);
                        canvas2.clipPath(ksbVar2.E, Region.Op.DIFFERENCE);
                        canvas2.drawColor(1342177280);
                    }
                    canvas2.restore();
                    f53 = f41 - ((f39 * 1.0f) + U1);
                    i23 = i8 + 1;
                    c = paint3;
                    f7 = f39;
                    f10 = f42;
                    f8 = 0.0f;
                }
                f15 = f7;
                f16 = 1.0f;
            }
            Paint paint4 = c;
            float d5 = ksbVar2.d0.d(ksbVar2.F);
            float d6 = ksbVar2.e0.d(ksbVar2.F && ksbVar2.H);
            float roundHeight = ksbVar2.getRoundHeight() * d5;
            float f103 = ((ksbVar2.h == null && !ksbVar2.O && ksbVar2.s.isEmpty()) ? 1.0f : d6) * d5;
            if (d5 > 0.0f) {
                long j7 = ksbVar2.J;
                float f104 = j7;
                float f105 = ksbVar2.K;
                f18 = f16;
                float f106 = ksbVar2.I;
                float g2 = bp1.g(f105, f106, f104, f103, f10);
                f11 = bp1.g(ksbVar2.L, f106, f104, f103, f11);
                fsb fsbVar9 = ksbVar2.h;
                int i33 = ksbVar2.z1;
                int i34 = ksbVar2.y1;
                if (fsbVar9 != null) {
                    float f107 = min;
                    float R13 = ((((hl.R1(f105, 0.0f, d6) * ksbVar2.I) + (j7 - ksbVar2.f)) / f107) * ksbVar2.v1) + i33 + i34;
                    f17 = d6;
                    B = (c00.z(hl.R1(ksbVar2.L, 1.0f, d6), ksbVar2.I, ksbVar2.J - ksbVar2.f, f107) * ksbVar2.v1) + ksbVar2.z1 + ksbVar2.y1;
                    f35 = R13;
                } else {
                    f17 = d6;
                    float f108 = i33 + i34;
                    long j8 = j7 - ksbVar2.f;
                    float f109 = min;
                    float f110 = ksbVar2.v1;
                    float f111 = ((j8 / f109) * f110) + f108;
                    B = c00.B(j8 + r12, f109, f110, f108);
                    f35 = f111;
                }
                RectF rectF9 = ksbVar2.y0;
                float f112 = ksbVar2.y1;
                rectF9.set(f35 - f112, f53 - roundHeight, B + f112, f53);
                float f113 = f53 - ((f15 * d5) + roundHeight);
                RectF rectF10 = ksbVar2.y0;
                f14 = (rectF10.top * f103) + f14;
                f13 = (rectF10.bottom * f103) + f13;
                ksbVar2.z0.rewind();
                ksbVar2.z0.addRoundRect(ksbVar2.y0, hl.L(8.0f), hl.L(8.0f), Path.Direction.CW);
                canvas2.save();
                canvas2.clipPath(ksbVar2.z0);
                isb isbVar3 = ksbVar2.N;
                if (isbVar3 != null) {
                    int i35 = (ksbVar2.I > 0L ? 1 : (ksbVar2.I == 0L ? 0 : -1));
                    if (i35 <= 0) {
                        i6 = i35;
                        f36 = f113;
                        f38 = 0.0f;
                    } else {
                        i6 = i35;
                        f36 = f113;
                        f38 = (((ksbVar2.J - ksbVar2.f) / min) * ksbVar2.v1) + ksbVar2.z1 + ksbVar2.y1;
                    }
                    float f114 = ksbVar2.y1;
                    float f115 = f38 - f114;
                    float f116 = (i6 <= 0 ? 0.0f : ksbVar2.z1 + r4 + ((((ksbVar2.J + r7) - ksbVar2.f) / min) * ksbVar2.v1)) + f114;
                    int i36 = isbVar3.f;
                    float f117 = f115 - (ksbVar2.h != null ? (((ksbVar2.J - ksbVar2.f) / min) * ksbVar2.v1) + (r7 + ksbVar2.y1) : ksbVar2.z1);
                    float f118 = i36;
                    int max4 = (int) Math.max(0.0d, Math.floor(f117 / f118));
                    int min4 = (int) Math.min(ksbVar2.N.c, Math.ceil((f116 - f115) / f118) + 1.0d);
                    int i37 = (int) ksbVar2.y0.top;
                    boolean z12 = ksbVar2.N.d.size() >= min4;
                    if (z12) {
                        for (int i38 = max4; i38 < Math.min(ksbVar2.N.d.size(), min4); i38++) {
                            if (((hsb) ksbVar2.N.d.get(i38)).a == null) {
                                z5 = false;
                                break;
                            }
                        }
                    }
                    z5 = z12;
                    if (!z5) {
                        if (ksbVar2.l0.c()) {
                            ksbVar2.m0.a(canvas2);
                            canvas2.drawColor(855638016);
                        } else if (paint4 == null) {
                            canvas2.drawColor(TLObject.FLAG_30);
                        } else {
                            canvas2.drawRect(ksbVar2.y0, paint4);
                            canvas2.drawColor(855638016);
                        }
                    }
                    if (i36 != 0) {
                        float f119 = f115;
                        while (max4 < Math.min(ksbVar2.N.d.size(), min4)) {
                            hsb hsbVar3 = (hsb) ksbVar2.N.d.get(max4);
                            if (hsbVar3.a != null) {
                                i7 = min4;
                                z6 = z12;
                                ksbVar2.v0.setAlpha((int) (hsbVar3.b.e(false, 1.0f) * 255.0f));
                                canvas2.drawBitmap(hsbVar3.a, f119, i37 - ((int) ((r2.getHeight() - roundHeight) / f9)), ksbVar2.v0);
                            } else {
                                i7 = min4;
                                z6 = z12;
                            }
                            f119 += f118;
                            max4++;
                            min4 = i7;
                            z12 = z6;
                        }
                    }
                    if (!z12) {
                        ksbVar2.N.b();
                    }
                } else {
                    f36 = f113;
                }
                ksbVar2.x0.rewind();
                RectF rectF11 = hl.P;
                int i39 = ksbVar2.z1;
                int i40 = ksbVar2.y1;
                float f120 = i39 + i40;
                float f121 = ksbVar2.K;
                float f122 = ksbVar2.I;
                float f123 = ksbVar2.f;
                float f124 = ksbVar2.J;
                float f125 = ((f121 * f122) - f123) + f124;
                float f126 = min;
                float f127 = ksbVar2.v1;
                float f128 = ((f125 / f126) * f127) + f120;
                if (f121 <= 0.0f) {
                    f37 = f127;
                    i5 = i40;
                } else {
                    f37 = f127;
                    i5 = 0;
                }
                float f129 = (1.0f - f17) * i40;
                float f130 = (f128 - i5) - f129;
                RectF rectF12 = ksbVar2.y0;
                float f131 = rectF12.top;
                float f132 = ksbVar2.L;
                rectF11.set(f130, f131, (((((f122 * f132) - f123) + f124) / f126) * f37) + f120 + (f132 >= 1.0f ? i40 : 0) + f129, rectF12.bottom);
                ksbVar2.x0.addRoundRect(rectF11, ksbVar2.u1, Path.Direction.CW);
                canvas2.clipPath(ksbVar2.x0, Region.Op.DIFFERENCE);
                canvas2.drawColor(1342177280);
                canvas2.restore();
                f53 = f36;
                f10 = g2;
            } else {
                f17 = d6;
                f18 = f16;
            }
            float d7 = ksbVar2.f0.d(ksbVar2.O);
            float d8 = ksbVar2.g0.d(ksbVar2.O && ksbVar2.Q);
            float audioHeight = ksbVar2.getAudioHeight() * d7;
            float f133 = ((ksbVar2.h == null && !ksbVar2.F && ksbVar2.s.isEmpty()) ? 1.0f : d8) * d7;
            if (d7 > 0.0f) {
                float f134 = ksbVar2.R;
                float f135 = ksbVar2.T;
                float f136 = ksbVar2.S;
                float g3 = bp1.g(f135, f136, f134, f133, f10);
                float g4 = bp1.g(ksbVar2.U, f136, f134, f133, f11);
                Paint c3 = ksbVar2.n0.c(d7);
                canvas2.save();
                if (ksbVar2.h == null && !ksbVar2.F && ksbVar2.s.isEmpty()) {
                    float f137 = ksbVar2.z1 + ksbVar2.y1;
                    paint = paint4;
                    long j9 = ksbVar2.R - ksbVar2.f;
                    float f138 = min;
                    float f139 = ksbVar2.v1;
                    z3 = c00.B(j9 + ksbVar2.S, f138, f139, f137);
                    R1 = ((j9 / f138) * f139) + f137;
                    f32 = d8;
                } else {
                    paint = paint4;
                    float f140 = min;
                    f32 = d8;
                    R1 = ksbVar2.z1 + ksbVar2.y1 + ((((hl.R1(ksbVar2.T, 0.0f, d8) * ksbVar2.S) + (ksbVar2.R - ksbVar2.f)) / f140) * ksbVar2.v1);
                    z3 = (c00.z(hl.R1(ksbVar2.U, 1.0f, d8), ksbVar2.S, ksbVar2.R - ksbVar2.f, f140) * ksbVar2.v1) + ksbVar2.z1 + ksbVar2.y1;
                }
                RectF rectF13 = ksbVar2.G0;
                float f141 = ksbVar2.y1;
                rectF13.set(R1 - f141, f53 - audioHeight, f141 + z3, f53);
                RectF rectF14 = ksbVar2.G0;
                f14 = (rectF14.top * f133) + f14;
                f13 = (rectF14.bottom * f133) + f13;
                ksbVar2.H0.rewind();
                ksbVar2.H0.addRoundRect(ksbVar2.G0, hl.L(8.0f), hl.L(8.0f), Path.Direction.CW);
                canvas2.clipPath(ksbVar2.H0);
                tl0 tl0Var3 = ksbVar2.l0;
                if (tl0Var3 != null && tl0Var3.c()) {
                    ksbVar2.m0.a(canvas2);
                    canvas2.drawColor(aob.p1(d7, 855638016));
                } else if (c3 == null) {
                    canvas2.drawColor(aob.p1(d7, TLObject.FLAG_30));
                } else {
                    canvas2.drawRect(ksbVar2.G0, c3);
                    canvas2.drawColor(aob.p1(d7, 855638016));
                }
                if (ksbVar2.b0 == null || (tl0Var = ksbVar2.l0) == null || !tl0Var.c()) {
                    j2 = min;
                    f33 = f32;
                    z4 = true;
                    if (ksbVar2.b0 != null && c3 != null) {
                        Paint c4 = ksbVar2.o0.c(d7 * 0.4f);
                        if (c4 == null) {
                            c4 = ksbVar2.I0;
                            c4.setAlpha((int) (64.0f * d7));
                        }
                        float e4 = ksbVar2.h0.e(!ksbVar2.V, ksbVar2.b0.e);
                        dsb dsbVar = ksbVar2.b0;
                        ksbVar2.V = dsbVar.c > 0;
                        ksbVar2.J0.b((((ksbVar2.R - ksbVar2.f) / j2) * ksbVar2.v1) + ksbVar2.z1 + ksbVar2.y1, R1, z3, f33, j2, audioHeight, e4, ksbVar2.G0.bottom, dsbVar);
                        min = j2;
                        canvas2.drawPath(ksbVar2.J0, c4);
                        if (f33 >= 1.0f) {
                            int i41 = ksbVar2.z1;
                            float f142 = ksbVar2.y1 + i41;
                            float f143 = ksbVar2.R - ksbVar2.f;
                            float f144 = ksbVar2.T;
                            float f145 = ksbVar2.S;
                            float f146 = min;
                            float f147 = ksbVar2.v1;
                            float f148 = ((((f144 * f145) + f143) / f146) * f147) + f142;
                            float f149 = ((((ksbVar2.U * f145) + f143) / f146) * f147) + f142;
                            float min5 = (Math.min(ksbVar2.w1 - ksbVar2.z1, f149) + Math.max(i41, f148)) / f9;
                            float centerY3 = ksbVar2.G0.centerY();
                            float max5 = Math.max(0.0f, (Math.min(ksbVar2.w1 - ksbVar2.z1, f149) - Math.max(ksbVar2.z1, f148)) - hl.L(24.0f));
                            float N = hl.N(13.0f) + ((ksbVar2.N0 == null && ksbVar2.R0 == null) ? 0.0f : ksbVar2.S0 + hl.N(9.66f) + hl.N(3.11f) + ksbVar2.O0);
                            boolean z13 = N < max5 ? z4 : false;
                            float min6 = min5 - (Math.min(N, max5) / f9);
                            ksbVar2.L0.setBounds((int) min6, (int) (centerY3 - (hl.L(13.0f) / f9)), (int) (hl.L(13.0f) + min6), (int) ((hl.L(13.0f) / f9) + centerY3));
                            float f150 = 1.0f - f33;
                            float f151 = f150 * 255.0f;
                            ksbVar2.L0.setAlpha((int) f151);
                            ksbVar2.L0.draw(canvas2);
                            float N2 = hl.N(16.11f) + min6;
                            f19 = d7;
                            boolean z14 = z13;
                            f22 = f5;
                            f23 = 0.0f;
                            d = 0.0d;
                            f20 = f33;
                            f21 = f6;
                            canvas2.saveLayerAlpha(0.0f, 0.0f, ksbVar2.w1, ksbVar2.x1, jn7.d4, 31);
                            float min7 = Math.min(f149, ksbVar2.w1) - hl.L(12.0f);
                            canvas2.clipRect(N2, 0.0f, min7, ksbVar2.x1);
                            if (ksbVar2.N0 != null) {
                                canvas2.save();
                                uh9.n(ksbVar2.N0.getHeight(), 2.0f, centerY3, N2 - ksbVar2.P0, canvas2);
                                ksbVar2.M0.setAlpha((int) (f151 * f19));
                                ksbVar2.N0.draw(canvas2);
                                canvas2.restore();
                                f34 = ksbVar2.O0 + N2;
                            } else {
                                f34 = N2;
                            }
                            if (ksbVar2.N0 != null && ksbVar2.R0 != null) {
                                float N3 = hl.N(3.66f) + f34;
                                int alpha = ksbVar2.K0.getAlpha();
                                ksbVar2.K0.setAlpha((int) (alpha * f150));
                                canvas2.drawCircle(hl.L(1.0f) + N3, centerY3, hl.L(1.0f), ksbVar2.K0);
                                ksbVar2.K0.setAlpha(alpha);
                                f34 = hl.N(2.0f) + N3 + hl.N(4.0f);
                            }
                            if (ksbVar2.R0 != null) {
                                canvas2.save();
                                uh9.n(ksbVar2.R0.getHeight(), 2.0f, centerY3, f34 - ksbVar2.T0, canvas2);
                                ksbVar2.Q0.setAlpha((int) (f151 * f19));
                                ksbVar2.R0.draw(canvas2);
                                canvas2.restore();
                            }
                            if (!z14) {
                                ksbVar2.V0.reset();
                                ksbVar2.V0.postScale(hl.N(8.0f) / 16.0f, 1.0f);
                                ksbVar2.V0.postTranslate(min7 - hl.L(8.0f), 0.0f);
                                ksbVar2.U0.setLocalMatrix(ksbVar2.V0);
                                RectF rectF15 = ksbVar2.G0;
                                canvas2.drawRect(min7 - hl.L(8.0f), rectF15.top, min7, rectF15.bottom, ksbVar2.W0);
                            }
                            canvas.restore();
                        } else {
                            f19 = d7;
                            f20 = f33;
                            f21 = f6;
                            f22 = f5;
                            f23 = 0.0f;
                            d = 0.0d;
                        }
                        canvas.restore();
                        f10 = g3;
                        f11 = g4;
                    }
                } else {
                    z4 = true;
                    float e5 = ksbVar2.h0.e(!ksbVar2.V, ksbVar2.b0.e);
                    dsb dsbVar2 = ksbVar2.b0;
                    ksbVar2.V = dsbVar2.c > 0;
                    f33 = f32;
                    ksbVar2.J0.b((((ksbVar2.R - ksbVar2.f) / min) * ksbVar2.v1) + ksbVar2.z1 + ksbVar2.y1, R1, z3, f33, min, audioHeight, e5, ksbVar2.G0.bottom, dsbVar2);
                    j2 = min;
                    canvas2.saveLayerAlpha(ksbVar2.G0, jn7.m1, 31);
                    canvas2.clipPath(ksbVar2.J0);
                    ksbVar2.o0.a(canvas2);
                    canvas2.restore();
                }
                min = j2;
                if (f33 >= 1.0f) {
                }
                canvas.restore();
                f10 = g3;
                f11 = g4;
            } else {
                paint = paint4;
                f19 = d7;
                f20 = d8;
                f21 = f6;
                f22 = f5;
                f23 = 0.0f;
                d = 0.0d;
            }
            float f152 = f13;
            float f153 = f14;
            float f154 = ksbVar2.z1 + ksbVar2.y1;
            float f155 = ksbVar2.f;
            float f156 = min;
            float f157 = ksbVar2.v1;
            float f158 = (((f10 - f155) / f156) * f157) + f154;
            float f159 = (((f11 - f155) / f156) * f157) + f154;
            if (!ksbVar2.s.isEmpty()) {
                f25 = f23;
                f26 = d5;
                f24 = f19;
                f19 = f18;
            } else if (ksbVar2.O && ksbVar2.h == null) {
                f25 = f23;
                f26 = d5;
                f24 = f19;
            } else {
                float f160 = f19;
                f19 = Math.max(f21, d5);
                f24 = f160;
                f25 = f23;
                f26 = d5;
            }
            if (f24 > d || f26 > d || f21 > d || f18 > d) {
                if (ksbVar2.h == null && !ksbVar2.F && ksbVar2.s.isEmpty()) {
                    f27 = f20;
                    f28 = f24 * hl.R1(0.6f, 1.0f, f27);
                } else {
                    f27 = f20;
                    f28 = 1.0f;
                }
                Paint paint5 = paint;
                ksbVar2.d(canvas, paint5, f153, f152, f158, f159, f28 * f19);
                fsb fsbVar10 = ksbVar2.h;
                if (fsbVar10 != null && ((ksbVar2.O || ksbVar2.F) && (f27 > f25 || f17 > f25))) {
                    float f161 = ksbVar2.x1 - ksbVar2.A1;
                    float f162 = ksbVar2.y1 + ksbVar2.z1;
                    float f163 = fsbVar10.g;
                    float f164 = fsbVar10.e;
                    float f165 = ksbVar2.f;
                    float f166 = ksbVar2.v1;
                    float f167 = ((((fsbVar10.h * f164) - f165) / f156) * f166) + f162;
                    canvas3 = canvas;
                    ksbVar2.d(canvas3, paint5, f161 - f12, f161, ((((f163 * f164) - f165) / f156) * f166) + f162, f167, 0.8f);
                } else if (ksbVar2.w != null) {
                    i4 = 1;
                    if (ksbVar2.s.size() > 1) {
                        fsb fsbVar11 = ksbVar2.w;
                        RectF rectF16 = fsbVar11.j;
                        float f168 = rectF16.top;
                        float f169 = rectF16.bottom;
                        float f170 = ksbVar2.y1 + ksbVar2.z1;
                        float f171 = fsbVar11.f;
                        float f172 = fsbVar11.g;
                        float f173 = fsbVar11.e;
                        float f174 = ksbVar2.f;
                        float f175 = ksbVar2.v1;
                        float f176 = (((((f172 * f173) + f171) - f174) / f156) * f175) + f170;
                        float f177 = (((((fsbVar11.h * f173) + f171) - f174) / f156) * f175) + f170;
                        canvas3 = canvas;
                        ksbVar2.d(canvas3, paint5, f168, f169, f176, f177, 0.8f);
                    } else {
                        canvas3 = canvas;
                    }
                    ksbVar = ksbVar2;
                    if (ksbVar.c0 > i4 && (fsbVar3 = ksbVar.h) != null) {
                        float f178 = fsbVar3.e;
                        float f179 = fsbVar3.h;
                        float f180 = fsbVar3.g;
                        j = (long) ((f179 - f180) * f178);
                        if (j > 68999) {
                            float f181 = ksbVar.z1 + ksbVar.y1;
                            i = i4;
                            float f182 = ksbVar.f;
                            float f183 = ksbVar.v1;
                            float f184 = ((((f180 * f178) - f182) / f156) * f183) + f181;
                            float f185 = ((((f179 * f178) - f182) / f156) * f183) + f181;
                            canvas3.save();
                            float f186 = ksbVar.x1 - ksbVar.A1;
                            canvas3.clipRect(f184, f186 - f12, f185, f186);
                            ksbVar.A0.setAlpha((int) (hl.R1(0.8f, 1.0f, f22) * 255.0f));
                            long j10 = 59000;
                            int min8 = (int) Math.min(ksbVar.c0 - 1, j / 59000);
                            int i42 = i;
                            while (i42 <= min8) {
                                if (Math.min(j10, j - (i42 * j10)) < 1000) {
                                    break;
                                }
                                float f187 = ksbVar.z1 + ksbVar.y1;
                                fsb fsbVar12 = ksbVar.h;
                                float f188 = ((((((long) (fsbVar12.e * fsbVar12.g)) + r2) - ksbVar.f) / f156) * ksbVar.v1) + f187;
                                Canvas canvas4 = canvas3;
                                canvas4.drawRect(f188, (ksbVar.x1 - ksbVar.A1) - f12, hl.L(1.0f) + f188, ksbVar.x1 - ksbVar.A1, ksbVar.A0);
                                canvas3 = canvas4;
                                StringBuilder sb = new StringBuilder("#");
                                i42++;
                                sb.append(i42);
                                canvas3.drawText(sb.toString(), f188 + hl.L(2.0f), ((ksbVar.x1 - ksbVar.A1) - f12) + hl.L(14.0f), ksbVar.F0);
                                j10 = 59000;
                            }
                            canvas3.restore();
                            e = ksbVar.c1.e(false, f25);
                            float contentHeight = ((ksbVar.x1 - ksbVar.getContentHeight()) + ksbVar.A1) - hl.N(2.3f);
                            float N4 = (ksbVar.x1 - ksbVar.A1) + hl.N(4.3f);
                            if (e > 0.0f) {
                                long j11 = ksbVar.d1;
                                if (j11 == -1) {
                                    fsb fsbVar13 = ksbVar.h;
                                    if (fsbVar13 != null) {
                                        j11 = (long) (fsbVar13.e * fsbVar13.h);
                                    } else {
                                        fsb fsbVar14 = ksbVar.w;
                                        if (fsbVar14 != null) {
                                            j11 = (long) ((fsbVar14.h - fsbVar14.g) * fsbVar14.e);
                                        } else {
                                            if (ksbVar.F) {
                                                f30 = ksbVar.I;
                                                f31 = ksbVar.L;
                                            } else {
                                                f30 = ksbVar.S;
                                                f31 = ksbVar.U;
                                            }
                                            j11 = (long) (f30 * f31);
                                        }
                                    }
                                }
                                Canvas canvas5 = canvas3;
                                f29 = contentHeight;
                                ksbVar2 = ksbVar;
                                ksbVar2.c(f29, N4, e * f19, j11, canvas5);
                            } else {
                                f29 = contentHeight;
                                ksbVar2 = ksbVar;
                            }
                            ksbVar2.c(f29, N4, (1.0f - e) * f19, ksbVar2.e, canvas);
                        }
                    }
                    i = i4;
                    e = ksbVar.c1.e(false, f25);
                    float contentHeight2 = ((ksbVar.x1 - ksbVar.getContentHeight()) + ksbVar.A1) - hl.N(2.3f);
                    float N42 = (ksbVar.x1 - ksbVar.A1) + hl.N(4.3f);
                    if (e > 0.0f) {
                    }
                    ksbVar2.c(f29, N42, (1.0f - e) * f19, ksbVar2.e, canvas);
                } else {
                    canvas3 = canvas;
                }
                ksbVar = ksbVar2;
                i4 = 1;
                if (ksbVar.c0 > i4) {
                    float f1782 = fsbVar3.e;
                    float f1792 = fsbVar3.h;
                    float f1802 = fsbVar3.g;
                    j = (long) ((f1792 - f1802) * f1782);
                    if (j > 68999) {
                    }
                }
                i = i4;
                e = ksbVar.c1.e(false, f25);
                float contentHeight22 = ((ksbVar.x1 - ksbVar.getContentHeight()) + ksbVar.A1) - hl.N(2.3f);
                float N422 = (ksbVar.x1 - ksbVar.A1) + hl.N(4.3f);
                if (e > 0.0f) {
                }
                ksbVar2.c(f29, N422, (1.0f - e) * f19, ksbVar2.e, canvas);
            } else {
                i = 1;
            }
            if (z2) {
                canvas.restore();
            }
        } else {
            i = 1;
        }
        if (ksbVar2.n1) {
            float f189 = 1.0f / (1000.0f / hl.r);
            float f190 = ksbVar2.o1;
            long L4 = (long) ((hl.L(32.0f) / ksbVar2.v1) * min * f189 * f190);
            if (ksbVar2.Y0) {
                ksbVar2.o1 = (f189 * 0.25f) + f190;
            }
            int i43 = ksbVar2.i1;
            if (i43 == 4 && (fsbVar2 = ksbVar2.h) != null) {
                float f191 = fsbVar2.g;
                long j12 = ksbVar2.f;
                long j13 = fsbVar2.e;
                float f192 = j13;
                if (f191 < j12 / f192) {
                    i3 = -1;
                } else if (fsbVar2.h > (j12 + min) / f192) {
                    i3 = i;
                } else {
                    ksbVar2.o1 = 1.0f;
                    i3 = 0;
                }
                long j14 = i3 * L4;
                ksbVar2.f = Utilities.k(j12 + j14, j13 - min, 0L);
                ksbVar2.e += j14;
                fsb fsbVar15 = ksbVar2.h;
                float f193 = (r3 - j12) / fsbVar15.e;
                if (f193 > 0.0f) {
                    f3 = 1.0f;
                    max = Math.min(1.0f - fsbVar15.h, f193);
                } else {
                    f3 = 1.0f;
                    max = Math.max(0.0f - fsbVar15.g, f193);
                }
                fsb fsbVar16 = ksbVar2.h;
                fsbVar16.g = Utilities.i(fsbVar16.g + max, f3, 0.0f);
                fsb fsbVar17 = ksbVar2.h;
                fsbVar17.h = Utilities.i(fsbVar17.h + max, f3, 0.0f);
                esb esbVar = ksbVar2.a;
                if (esbVar != null) {
                    esbVar.X(false, ksbVar2.h.g);
                    ksbVar2.a.P1(ksbVar2.h.h);
                }
                ksbVar2.invalidate();
            } else if (i43 == 8) {
                float f194 = ksbVar2.T;
                long j15 = ksbVar2.R;
                float f195 = (-j15) + 100;
                long j16 = ksbVar2.S;
                float f196 = j16;
                if (f194 < f195 / f196) {
                    i2 = -1;
                } else if (ksbVar2.U >= ((r8 + min) - 100) / f196) {
                    i2 = i;
                } else {
                    ksbVar2.o1 = 1.0f;
                    i2 = 0;
                }
                if (i2 != 0) {
                    if (ksbVar2.Q && (fsbVar = ksbVar2.h) != null) {
                        long j17 = j15 - (i2 * L4);
                        float f197 = fsbVar.h;
                        float f198 = fsbVar.e;
                        k = Utilities.k(j17, (long) ((f197 * f198) - (f194 * f196)), (long) ((fsbVar.g * f198) - (ksbVar2.U * f196)));
                        ksbVar2.R = k;
                    } else if (ksbVar2.H && ksbVar2.F) {
                        long j18 = j15 - (i2 * L4);
                        float f199 = ksbVar2.L;
                        float f200 = ksbVar2.I;
                        k = Utilities.k(j18, (long) ((f199 * f200) - (f194 * f196)), (long) ((ksbVar2.K * f200) - (ksbVar2.U * f196)));
                        ksbVar2.R = k;
                    } else {
                        k = Utilities.k(j15 - (i2 * L4), 0L, -(j16 - Math.min(ksbVar2.getBaseDuration(), ksbVar2.getMaxScrollDuration())));
                        ksbVar2.R = k;
                    }
                    float f201 = (-(k - j15)) / ksbVar2.S;
                    float min9 = f201 > 0.0f ? Math.min(1.0f - ksbVar2.U, f201) : Math.max(0.0f - ksbVar2.T, f201);
                    if (ksbVar2.h == null) {
                        float f202 = ksbVar2.e;
                        float f203 = ksbVar2.S;
                        ksbVar2.e = (long) Utilities.i((min9 * f203) + f202, f203, 0.0f);
                    }
                    ksbVar2.T = Utilities.i(ksbVar2.T + min9, 1.0f, 0.0f);
                    ksbVar2.U = Utilities.i(ksbVar2.U + min9, 1.0f, 0.0f);
                    esb esbVar2 = ksbVar2.a;
                    if (esbVar2 != null) {
                        esbVar2.E1(ksbVar2.T);
                        ksbVar2.a.s1(ksbVar2.U);
                        ksbVar2.a.C(ksbVar2.e, false);
                    }
                    ksbVar2.invalidate();
                } else {
                    ksbVar2.o1 = 1.0f;
                }
            } else {
                ksbVar2.o1 = 1.0f;
            }
        } else {
            ksbVar2.o1 = 1.0f;
        }
        int contentHeight3 = ksbVar2.getContentHeight();
        if (ksbVar2.c != contentHeight3) {
            ksbVar2.c = contentHeight3;
            Runnable runnable = ksbVar2.d;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public final void e(ViewGroup viewGroup, vnb vnbVar, tl0 tl0Var, ebb ebbVar) {
        int i;
        int i2 = this.k1;
        final byte b = 0;
        final byte b2 = 2;
        try {
            if (i2 == 2 && this.O) {
                ena enaVar = new ena(getContext(), 0);
                enaVar.b = 0.0f;
                enaVar.c = 1.5f;
                enaVar.c(this.W);
                enaVar.h = new pcc(this) { // from class: csb
                    public final /* synthetic */ ksb b;

                    {
                        this.b = this;
                    }

                    @Override // pcc
                    public final void a(Object obj) {
                        byte b3 = b;
                        ksb ksbVar = this.b;
                        Float f = (Float) obj;
                        switch (b3) {
                            case 0:
                                ksbVar.getClass();
                                ksbVar.W = f.floatValue();
                                esb esbVar = ksbVar.a;
                                if (esbVar != null) {
                                    esbVar.y(f.floatValue());
                                    break;
                                }
                                break;
                            case 1:
                                ksbVar.getClass();
                                ksbVar.M = f.floatValue();
                                esb esbVar2 = ksbVar.a;
                                if (esbVar2 != null) {
                                    esbVar2.t(f.floatValue());
                                    break;
                                }
                                break;
                            default:
                                ksbVar.h.i = f.floatValue();
                                esb esbVar3 = ksbVar.a;
                                if (esbVar3 != null) {
                                    esbVar3.H0(f.floatValue());
                                    break;
                                }
                                break;
                        }
                    }
                };
                long min = Math.min(getBaseDuration(), getMaxScrollDuration());
                int i3 = this.w1;
                int i4 = this.z1;
                int i5 = this.y1;
                float min2 = Math.min((i3 - i4) - i5, ((((hl.R1(this.U, 1.0f, this.g0.c) * this.S) + (this.R - this.f)) / min) * this.v1) + i4 + i5);
                fu5 G = fu5.G(viewGroup, vnbVar, this);
                G.p(enaVar);
                G.n(true);
                G.b(R.drawable.msg_delete, ob6.M0(2131744377, null), new bsb(this, (byte) 1), false);
                G.W(5);
                G.a0 = true;
                G.b0((-(this.w1 - min2)) + hl.L(18.0f), this.G0.top);
                G.a0();
                G.S(tl0Var, -ebbVar.getX(), -ebbVar.getY());
                performHapticFeedback(0, 1);
            } else {
                final byte b3 = 1;
                if (i2 == 1 && this.F) {
                    ena enaVar2 = new ena(getContext(), 0);
                    enaVar2.b = 0.0f;
                    enaVar2.c = 1.5f;
                    enaVar2.c(this.M);
                    enaVar2.h = new pcc(this) { // from class: csb
                        public final /* synthetic */ ksb b;

                        {
                            this.b = this;
                        }

                        @Override // pcc
                        public final void a(Object obj) {
                            byte b32 = b3;
                            ksb ksbVar = this.b;
                            Float f = (Float) obj;
                            switch (b32) {
                                case 0:
                                    ksbVar.getClass();
                                    ksbVar.W = f.floatValue();
                                    esb esbVar = ksbVar.a;
                                    if (esbVar != null) {
                                        esbVar.y(f.floatValue());
                                        break;
                                    }
                                    break;
                                case 1:
                                    ksbVar.getClass();
                                    ksbVar.M = f.floatValue();
                                    esb esbVar2 = ksbVar.a;
                                    if (esbVar2 != null) {
                                        esbVar2.t(f.floatValue());
                                        break;
                                    }
                                    break;
                                default:
                                    ksbVar.h.i = f.floatValue();
                                    esb esbVar3 = ksbVar.a;
                                    if (esbVar3 != null) {
                                        esbVar3.H0(f.floatValue());
                                        break;
                                    }
                                    break;
                            }
                        }
                    };
                    long min3 = Math.min(getBaseDuration(), getMaxScrollDuration());
                    int i6 = this.w1;
                    int i7 = this.z1;
                    int i8 = this.y1;
                    float min4 = Math.min((i6 - i7) - i8, ((((hl.R1(this.L, 1.0f, this.e0.c) * this.I) + (this.J - this.f)) / min3) * this.v1) + i7 + i8);
                    fu5 G2 = fu5.G(viewGroup, vnbVar, this);
                    G2.p(enaVar2);
                    G2.n(true);
                    G2.b(R.drawable.msg_delete, ob6.M0(2131744141, null), new bsb(this, b2), false);
                    G2.W(5);
                    G2.a0 = true;
                    G2.b0((-(this.w1 - min4)) + hl.L(18.0f), this.y0.top);
                    G2.a0();
                    G2.S(tl0Var, -ebbVar.getX(), -ebbVar.getY());
                    performHapticFeedback(0, 1);
                } else if (i2 == 0 && this.h != null) {
                    ena enaVar3 = new ena(getContext(), 0);
                    enaVar3.b = 0.0f;
                    enaVar3.c = 1.5f;
                    enaVar3.c(this.h.i);
                    enaVar3.h = new pcc(this) { // from class: csb
                        public final /* synthetic */ ksb b;

                        {
                            this.b = this;
                        }

                        @Override // pcc
                        public final void a(Object obj) {
                            byte b32 = b2;
                            ksb ksbVar = this.b;
                            Float f = (Float) obj;
                            switch (b32) {
                                case 0:
                                    ksbVar.getClass();
                                    ksbVar.W = f.floatValue();
                                    esb esbVar = ksbVar.a;
                                    if (esbVar != null) {
                                        esbVar.y(f.floatValue());
                                        break;
                                    }
                                    break;
                                case 1:
                                    ksbVar.getClass();
                                    ksbVar.M = f.floatValue();
                                    esb esbVar2 = ksbVar.a;
                                    if (esbVar2 != null) {
                                        esbVar2.t(f.floatValue());
                                        break;
                                    }
                                    break;
                                default:
                                    ksbVar.h.i = f.floatValue();
                                    esb esbVar3 = ksbVar.a;
                                    if (esbVar3 != null) {
                                        esbVar3.H0(f.floatValue());
                                        break;
                                    }
                                    break;
                            }
                        }
                    };
                    fu5 G3 = fu5.G(viewGroup, vnbVar, this);
                    G3.p(enaVar3);
                    G3.W(5);
                    G3.a0 = true;
                    G3.b0(hl.L(18.0f), this.u0.top);
                    G3.a0();
                    G3.S(tl0Var, -ebbVar.getX(), -ebbVar.getY());
                    performHapticFeedback(0, 1);
                } else {
                    if (i2 != 3 || (i = this.l1) < 0) {
                        return;
                    }
                    ArrayList arrayList = this.s;
                    if (i >= arrayList.size()) {
                        return;
                    }
                    fsb fsbVar = (fsb) arrayList.get(this.l1);
                    ena enaVar4 = new ena(getContext(), 0);
                    enaVar4.b = 0.0f;
                    enaVar4.c = 1.5f;
                    enaVar4.c(fsbVar.i);
                    enaVar4.h = new ku9(this, fsbVar, (byte) 18);
                    fu5 G4 = fu5.G(viewGroup, vnbVar, this);
                    G4.p(enaVar4);
                    G4.W(5);
                    G4.a0 = true;
                    G4.b0(hl.L(18.0f), fsbVar.j.top);
                    G4.a0();
                    G4.S(tl0Var, -ebbVar.getX(), -ebbVar.getY());
                    performHapticFeedback(0, 1);
                }
            }
        } catch (Exception unused) {
        }
    }

    public final long f() {
        return this.c0 * 59000;
    }

    public final long g() {
        return (long) Math.max(1000.0f, Math.min(getBaseDuration(), 59000L) * 0.15f);
    }

    public int getContentHeight() {
        return (int) (this.A1 + (this.h != null ? getVideoHeight() + hl.L(4.0f) : 0.0f) + (this.s.isEmpty() ? 0.0f : getCollageHeight() + hl.L(4.0f)) + (this.F ? getRoundHeight() + hl.L(4.0f) : 0.0f) + (this.O ? hl.L(4.0f) + getAudioHeight() : 0.0f) + this.A1);
    }

    public int getMaxCount() {
        return this.c0;
    }

    public long getMaxScrollDuration() {
        if (this.s.isEmpty()) {
            return Math.max(120000L, (long) (f() * 1.5f));
        }
        return 70000L;
    }

    public int getTimelineHeight() {
        return hl.U1(this.j0.c, hl.L(28.0f) + this.A1 + this.A1, getContentHeight());
    }

    public final void h(float f) {
        float f2;
        float f3;
        float f4;
        long j;
        long j2;
        long j3;
        long j4;
        long k;
        long k2;
        fsb fsbVar = this.h;
        if (fsbVar == null && !this.F) {
            long j5 = this.R;
            long k3 = Utilities.k(j5 + ((long) f), 0L, -(this.S - Math.min(getBaseDuration(), getMaxScrollDuration())));
            this.R = k3;
            float f5 = k3 - j5;
            this.T = Utilities.i(this.T - (f5 / this.S), 1.0f, 0.0f);
            this.U = Utilities.i(this.U - (f5 / this.S), 1.0f, 0.0f);
            esb esbVar = this.a;
            if (esbVar != null) {
                esbVar.E1(this.T);
                this.a.s1(this.U);
            }
        } else if (this.Q) {
            if (fsbVar != null) {
                float f6 = fsbVar.g;
                long j6 = fsbVar.e;
                f2 = j6 * f6;
                float f7 = fsbVar.h;
                f3 = j6 * f7;
                f4 = (f7 - f6) * j6;
            } else {
                float f8 = this.K;
                long j7 = this.I;
                f2 = f8 * j7;
                float f9 = this.L;
                f3 = j7 * f9;
                f4 = j7 * (f9 - f8);
            }
            float f10 = this.U;
            float f11 = this.S;
            long j8 = (long) (f3 - (f10 * f11));
            float f12 = this.T;
            long j9 = (long) (f2 - (f12 * f11));
            float min = Math.min(f10 - f12, f4 / f11);
            long j10 = this.R;
            long j11 = (long) f;
            long j12 = j10 + j11;
            if (j12 > j8) {
                float i = Utilities.i(((f3 - j10) - j11) / this.S, 1.0f, min);
                this.U = i;
                float i2 = Utilities.i(i - min, 1.0f, 0.0f);
                this.T = i2;
                float f13 = this.U;
                float f14 = this.S;
                long j13 = (long) (f3 - (f13 * f14));
                long j14 = (long) (f2 - (i2 * f14));
                if (j13 < j14) {
                    j4 = j14;
                    j3 = j13;
                } else {
                    j3 = j14;
                    j4 = j13;
                }
                this.R = Utilities.k(this.R + j11, j4, j3);
                esb esbVar2 = this.a;
                if (esbVar2 != null) {
                    esbVar2.E1(this.T);
                    this.a.s1(this.U);
                }
            } else if (j12 < j9) {
                float i3 = Utilities.i(((f2 - j10) - j11) / this.S, 1.0f - min, 0.0f);
                this.T = i3;
                float i4 = Utilities.i(i3 + min, 1.0f, 0.0f);
                this.U = i4;
                float f15 = this.S;
                long j15 = (long) (f3 - (i4 * f15));
                long j16 = (long) (f2 - (this.T * f15));
                if (j15 < j16) {
                    j2 = j16;
                    j = j15;
                } else {
                    j = j16;
                    j2 = j15;
                }
                this.R = Utilities.k(this.R + j11, j2, j);
                esb esbVar3 = this.a;
                if (esbVar3 != null) {
                    esbVar3.E1(this.T);
                    this.a.s1(this.U);
                }
            } else {
                this.R = j12;
            }
        } else {
            long j17 = this.R + ((long) f);
            float baseDuration = getBaseDuration();
            float f16 = this.S;
            this.R = Utilities.k(j17, (long) (baseDuration - (this.U * f16)), (long) ((-this.T) * f16));
        }
        invalidate();
        esb esbVar4 = this.a;
        if (esbVar4 != null) {
            esbVar4.g2(this.R + ((long) (this.T * this.S)));
        }
        if (!this.n1) {
            esb esbVar5 = this.a;
            if (esbVar5 != null) {
                esbVar5.v0(true);
                fsb fsbVar2 = this.h;
                if (fsbVar2 != null) {
                    long j18 = this.R + ((long) (this.T * this.S));
                    float f17 = fsbVar2.h;
                    float f18 = fsbVar2.e;
                    k2 = Utilities.k(j18, (long) (f17 * f18), (long) (fsbVar2.g * f18));
                } else if (this.F) {
                    long j19 = this.R + ((long) (this.T * this.S));
                    float f19 = this.L;
                    float f20 = this.I;
                    k2 = Utilities.k(j19, (long) (f19 * f20), (long) (this.K * f20));
                } else {
                    float f21 = this.T;
                    long j20 = this.S;
                    k2 = Utilities.k((long) (f21 * j20), j20, 0L);
                }
                if (this.h != null && Math.abs(this.e - k2) > 400) {
                    this.d1 = this.e;
                    this.c1.e(true, 1.0f);
                }
                esb esbVar6 = this.a;
                this.e = k2;
                esbVar6.C(k2, false);
                return;
            }
            if (!this.s1) {
                return;
            }
        }
        fsb fsbVar3 = this.h;
        if (fsbVar3 != null) {
            long j21 = this.R + ((long) (this.T * this.S));
            float f22 = fsbVar3.h;
            float f23 = fsbVar3.e;
            k = Utilities.k(j21, (long) (f22 * f23), (long) (fsbVar3.g * f23));
            this.e = k;
        } else if (!this.F || fsbVar3 == null) {
            float f24 = this.T;
            long j22 = this.S;
            k = Utilities.k((long) (f24 * j22), j22, 0L);
            this.e = k;
        } else {
            long j23 = this.R + ((long) (this.T * this.S));
            float f25 = this.L;
            float f26 = fsbVar3.e;
            k = Utilities.k(j23, (long) (f25 * f26), (long) (this.K * f26));
            this.e = k;
        }
        esb esbVar7 = this.a;
        if (esbVar7 != null) {
            esbVar7.C(k, false);
        }
    }

    public final void i(fsb fsbVar, float f) {
        long k;
        long k2;
        long j;
        long j2;
        long j3;
        long j4;
        if (fsbVar != null) {
            fsb fsbVar2 = this.w;
            if (fsbVar2 != fsbVar && fsbVar2 != null) {
                if (this.n == this.s.indexOf(fsbVar)) {
                    fsb fsbVar3 = this.w;
                    float f2 = fsbVar3.e;
                    float f3 = fsbVar.h;
                    float f4 = fsbVar.e;
                    long j5 = (long) ((f2 * 1.0f) - (f3 * f4));
                    float f5 = fsbVar.g;
                    long j6 = (long) ((f2 * 0.0f) - (f5 * f4));
                    float min = Math.min(f3 - f5, ((fsbVar3.h - fsbVar3.g) * f2) / f4);
                    long j7 = fsbVar.f;
                    long j8 = (long) f;
                    long j9 = j7 + j8;
                    if (j9 > j5) {
                        float i = Utilities.i((((this.w.h * r2.e) - j7) - j8) / fsbVar.e, 1.0f, min);
                        fsbVar.h = i;
                        float i2 = Utilities.i(i - min, 1.0f, 0.0f);
                        fsbVar.g = i2;
                        fsb fsbVar4 = this.w;
                        float f6 = fsbVar4.h;
                        float f7 = fsbVar4.e;
                        float f8 = fsbVar.h;
                        float f9 = fsbVar.e;
                        long j10 = (long) ((f6 * f7) - (f8 * f9));
                        long j11 = (long) ((fsbVar4.g * f7) - (i2 * f9));
                        if (j10 < j11) {
                            j4 = j11;
                            j3 = j10;
                        } else {
                            j3 = j11;
                            j4 = j10;
                        }
                        fsbVar.f = Utilities.k(fsbVar.f + j8, j4, j3);
                        esb esbVar = this.a;
                        if (esbVar != null) {
                            esbVar.p1(fsbVar.g, fsbVar.a);
                            this.a.O1(fsbVar.h, fsbVar.a);
                        }
                    } else if (j9 < j6) {
                        float i3 = Utilities.i((((this.w.g * r2.e) - j7) - j8) / fsbVar.e, 1.0f - min, 0.0f);
                        fsbVar.g = i3;
                        float i4 = Utilities.i(i3 + min, 1.0f, 0.0f);
                        fsbVar.h = i4;
                        fsb fsbVar5 = this.w;
                        float f10 = fsbVar5.h;
                        float f11 = fsbVar5.e;
                        float f12 = fsbVar.e;
                        long j12 = (long) ((f10 * f11) - (i4 * f12));
                        long j13 = (long) ((fsbVar5.g * f11) - (fsbVar.g * f12));
                        if (j12 < j13) {
                            j2 = j13;
                            j = j12;
                        } else {
                            j = j13;
                            j2 = j12;
                        }
                        fsbVar.f = Utilities.k(fsbVar.f + j8, j2, j);
                        esb esbVar2 = this.a;
                        if (esbVar2 != null) {
                            esbVar2.p1(fsbVar.g, fsbVar.a);
                            this.a.O1(fsbVar.h, fsbVar.a);
                        }
                    } else {
                        fsbVar.f = j9;
                    }
                } else {
                    long j14 = fsbVar.f + ((long) f);
                    float baseDuration = getBaseDuration();
                    float f13 = fsbVar.e;
                    fsbVar.f = Utilities.k(j14, (long) (baseDuration - (fsbVar.h * f13)), (long) ((-fsbVar.g) * f13));
                }
            }
            invalidate();
            esb esbVar3 = this.a;
            if (esbVar3 != null) {
                esbVar3.b2(fsbVar.a, fsbVar.f);
            }
            if (!this.n1) {
                esb esbVar4 = this.a;
                if (esbVar4 != null) {
                    esbVar4.v0(true);
                    fsb fsbVar6 = this.w;
                    if (fsbVar6 == fsbVar || fsbVar6 == null) {
                        float f14 = fsbVar.g;
                        long j15 = fsbVar.e;
                        k2 = Utilities.k((long) (f14 * j15), j15, 0L);
                    } else {
                        long j16 = fsbVar.f + ((long) (fsbVar.g * fsbVar.e));
                        float f15 = fsbVar6.h;
                        float f16 = fsbVar6.e;
                        k2 = Utilities.k(j16, (long) (f15 * f16), (long) (fsbVar6.g * f16));
                    }
                    fsb fsbVar7 = this.w;
                    if (fsbVar7 != fsbVar && fsbVar7 != null && Math.abs(this.e - k2) > 400) {
                        this.d1 = this.e;
                        this.c1.e(true, 1.0f);
                    }
                    esb esbVar5 = this.a;
                    this.e = k2;
                    esbVar5.C(k2, false);
                    return;
                }
                if (!this.s1) {
                    return;
                }
            }
            fsb fsbVar8 = this.w;
            if (fsbVar8 == fsbVar || fsbVar8 == null) {
                float f17 = fsbVar.g;
                long j17 = fsbVar.e;
                k = Utilities.k((long) (f17 * j17), j17, 0L);
                this.e = k;
            } else {
                long j18 = fsbVar.f + ((long) (fsbVar.g * fsbVar.e));
                float f18 = fsbVar8.h;
                float f19 = fsbVar8.e;
                k = Utilities.k(j18, (long) (f18 * f19), (long) (fsbVar8.g * f19));
                this.e = k;
            }
            esb esbVar6 = this.a;
            if (esbVar6 != null) {
                esbVar6.C(k, false);
            }
        }
    }

    public final void j(float f) {
        long j;
        long j2;
        long j3;
        long j4;
        long k;
        long k2;
        fsb fsbVar = this.h;
        if (fsbVar == null) {
            long j5 = this.J;
            long k3 = Utilities.k(j5 + ((long) f), 0L, -(this.I - Math.min(getBaseDuration(), getMaxScrollDuration())));
            this.J = k3;
            float f2 = k3 - j5;
            this.K = Utilities.i(this.K - (f2 / this.I), 1.0f, 0.0f);
            this.L = Utilities.i(this.L - (f2 / this.I), 1.0f, 0.0f);
            esb esbVar = this.a;
            if (esbVar != null) {
                esbVar.m0(this.K);
                this.a.Z1(this.L);
            }
        } else if (this.H) {
            float f3 = fsbVar.h;
            float f4 = fsbVar.e;
            float f5 = this.L;
            float f6 = this.I;
            long j6 = (long) ((f3 * f4) - (f5 * f6));
            float f7 = fsbVar.g;
            float f8 = this.K;
            long j7 = (long) ((f7 * f4) - (f8 * f6));
            float min = Math.min(f5 - f8, ((f3 - f7) * f4) / f6);
            long j8 = this.J;
            long j9 = (long) f;
            long j10 = j8 + j9;
            if (j10 > j6) {
                float i = Utilities.i((((this.h.h * r1.e) - j8) - j9) / this.I, 1.0f, min);
                this.L = i;
                float i2 = Utilities.i(i - min, 1.0f, 0.0f);
                this.K = i2;
                fsb fsbVar2 = this.h;
                float f9 = fsbVar2.h;
                float f10 = fsbVar2.e;
                float f11 = this.L;
                float f12 = this.I;
                long j11 = (long) ((f9 * f10) - (f11 * f12));
                long j12 = (long) ((fsbVar2.g * f10) - (i2 * f12));
                if (j11 < j12) {
                    j4 = j12;
                    j3 = j11;
                } else {
                    j3 = j12;
                    j4 = j11;
                }
                this.J = Utilities.k(this.J + j9, j4, j3);
                esb esbVar2 = this.a;
                if (esbVar2 != null) {
                    esbVar2.m0(this.K);
                    this.a.Z1(this.L);
                }
            } else if (j10 < j7) {
                float i3 = Utilities.i((((this.h.g * r1.e) - j8) - j9) / this.I, 1.0f - min, 0.0f);
                this.K = i3;
                float i4 = Utilities.i(i3 + min, 1.0f, 0.0f);
                this.L = i4;
                fsb fsbVar3 = this.h;
                float f13 = fsbVar3.h;
                float f14 = fsbVar3.e;
                float f15 = this.I;
                long j13 = (long) ((f13 * f14) - (i4 * f15));
                long j14 = (long) ((fsbVar3.g * f14) - (this.K * f15));
                if (j13 < j14) {
                    j2 = j14;
                    j = j13;
                } else {
                    j = j14;
                    j2 = j13;
                }
                this.J = Utilities.k(this.J + j9, j2, j);
                esb esbVar3 = this.a;
                if (esbVar3 != null) {
                    esbVar3.m0(this.K);
                    this.a.Z1(this.L);
                }
            } else {
                this.J = j10;
            }
        } else {
            long j15 = this.J + ((long) f);
            float baseDuration = getBaseDuration();
            float f16 = this.I;
            this.J = Utilities.k(j15, (long) (baseDuration - (this.L * f16)), (long) ((-this.K) * f16));
        }
        invalidate();
        esb esbVar4 = this.a;
        if (esbVar4 != null) {
            esbVar4.b1(this.J + ((long) (this.K * this.I)));
        }
        if (!this.n1) {
            esb esbVar5 = this.a;
            if (esbVar5 != null) {
                esbVar5.v0(true);
                fsb fsbVar4 = this.h;
                if (fsbVar4 != null) {
                    long j16 = this.J + ((long) (this.K * this.I));
                    float f17 = fsbVar4.h;
                    float f18 = fsbVar4.e;
                    k2 = Utilities.k(j16, (long) (f17 * f18), (long) (fsbVar4.g * f18));
                } else {
                    float f19 = this.K;
                    long j17 = this.I;
                    k2 = Utilities.k((long) (f19 * j17), j17, 0L);
                }
                if (this.h != null && Math.abs(this.e - k2) > 400) {
                    this.d1 = this.e;
                    this.c1.e(true, 1.0f);
                }
                esb esbVar6 = this.a;
                this.e = k2;
                esbVar6.C(k2, false);
                return;
            }
            if (!this.s1) {
                return;
            }
        }
        fsb fsbVar5 = this.h;
        if (fsbVar5 != null) {
            long j18 = this.J + ((long) (this.K * this.I));
            float f20 = fsbVar5.h;
            float f21 = fsbVar5.e;
            k = Utilities.k(j18, (long) (f20 * f21), (long) (fsbVar5.g * f21));
            this.e = k;
        } else {
            float f22 = this.K;
            long j19 = this.I;
            k = Utilities.k((long) (f22 * j19), j19, 0L);
            this.e = k;
        }
        esb esbVar7 = this.a;
        if (esbVar7 != null) {
            esbVar7.C(k, false);
        }
    }

    public final void k() {
        long min = Math.min(getBaseDuration(), getMaxScrollDuration());
        fsb fsbVar = this.h;
        float f = (fsbVar.h + fsbVar.g) / 2.0f;
        long j = fsbVar.e;
        this.f = Utilities.k((long) ((f * j) - (min / 2.0f)), j - min, 0L);
        invalidate();
    }

    public final void l(boolean z) {
        if (z && this.F) {
            this.H = true;
            this.Q = false;
        } else {
            this.H = false;
            this.Q = this.O && this.h == null;
        }
        invalidate();
    }

    public final boolean m(boolean z, float f) {
        fsb fsbVar = this.h;
        ArrayList arrayList = this.s;
        if (fsbVar == null && !this.O && arrayList.isEmpty()) {
            return false;
        }
        long min = Math.min(getBaseDuration(), getMaxScrollDuration());
        float f2 = ((f - this.z1) - this.y1) / this.v1;
        fsb fsbVar2 = this.w;
        long j = fsbVar2 != null ? (long) ((fsbVar2.g * fsbVar2.e) + fsbVar2.f) : 0L;
        float f3 = f2 * min;
        if (fsbVar2 == null) {
            j = this.h == null ? this.R : 0L;
        }
        long i = (long) Utilities.i((f3 - j) + this.f, getBaseDuration(), 0.0f);
        fsb fsbVar3 = this.h;
        if (fsbVar3 != null) {
            float f4 = i / fsbVar3.e;
            if (f4 < fsbVar3.g || f4 > fsbVar3.h) {
                return false;
            }
        }
        fsb fsbVar4 = this.w;
        if (fsbVar4 != null && (i < 0 || i >= ((long) ((fsbVar4.h - fsbVar4.g) * fsbVar4.e)))) {
            return false;
        }
        if (this.O && fsbVar3 == null && arrayList.isEmpty()) {
            float f5 = i / this.S;
            if (f5 < this.T || f5 > this.U) {
                return false;
            }
        }
        this.e = i;
        invalidate();
        esb esbVar = this.a;
        if (esbVar != null) {
            esbVar.C(i, z);
        }
        pqa pqaVar = this.e1;
        if (pqaVar != null) {
            hl.r(pqaVar);
            this.e1 = null;
        }
        if (!z) {
            return true;
        }
        pqa pqaVar2 = new pqa(this, i, (byte) 7);
        this.e1 = pqaVar2;
        hl.d3(pqaVar2, 150L);
        return true;
    }

    public final void n(String str, long j, long j2, float f, float f2, float f3, boolean z) {
        boolean z2;
        long j3;
        boolean z3;
        fsb fsbVar;
        if (TextUtils.equals(this.G, str)) {
            return;
        }
        isb isbVar = this.N;
        if (isbVar != null) {
            isbVar.a();
            this.N = null;
        }
        long j4 = this.I;
        byte b = 0;
        if (str != null) {
            this.G = str;
            this.I = j;
            this.J = j2 - ((long) (j * f));
            this.K = f;
            this.L = f2;
            this.M = f3;
            if (getMeasuredWidth() <= 0 || this.N != null || ((fsbVar = this.h) != null && fsbVar.e < 1)) {
                z2 = false;
                j3 = j4;
                z3 = true;
            } else {
                String str2 = this.G;
                int i = this.w1;
                int i2 = this.z1;
                int i3 = (i - i2) - i2;
                int L = hl.L(38.0f);
                long j5 = this.I;
                Long valueOf = j5 > 2 ? Long.valueOf(j5) : null;
                fsb fsbVar2 = this.h;
                j3 = j4;
                z2 = false;
                z3 = true;
                this.N = new isb(this, false, str2, i3, L, valueOf, fsbVar2 != null ? fsbVar2.e : getMaxScrollDuration(), -1L, -1L, new bsb(this, b));
            }
            if (this.h == null) {
                this.Q = z2;
                this.H = z3;
            }
        } else {
            z2 = false;
            j3 = j4;
            z3 = true;
            this.G = null;
            this.I = 1L;
            this.H = false;
        }
        this.F = this.G != null ? z3 : z2;
        if (j3 != j && this.h == null && this.b0 != null) {
            this.a0 = z3;
            p();
        }
        if (this.O && this.F && this.h == null) {
            this.T = 0.0f;
            this.U = Utilities.i(j / this.S, 1.0f, 0.0f);
        }
        if (!z) {
            this.e0.f(this.H, z3);
            this.g0.f(this.Q, z3);
            this.d0.f(this.F, z3);
        }
        invalidate();
    }

    public final void o(boolean z, String str, long j, float f) {
        fsb fsbVar = this.h;
        if (TextUtils.equals(fsbVar == null ? null : fsbVar.d, str)) {
            return;
        }
        fsb fsbVar2 = this.h;
        if (fsbVar2 != null) {
            isb isbVar = fsbVar2.c;
            if (isbVar != null) {
                isbVar.a();
                this.h.c = null;
            }
            this.h = null;
        }
        if (str != null) {
            this.f = 0L;
            fsb fsbVar3 = new fsb(this);
            this.h = fsbVar3;
            fsbVar3.b = z;
            fsbVar3.d = str;
            fsbVar3.e = j;
            fsbVar3.i = f;
            fsbVar3.a(false);
        } else {
            this.h = null;
            this.f = 0L;
        }
        if (!this.F) {
            this.H = false;
        }
        this.e = 0L;
        invalidate();
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        this.M0.setTextSize(hl.L(12.0f));
        this.Q0.setTextSize(hl.L(12.0f));
        int L = hl.L(12.0f);
        this.z1 = L;
        int L2 = hl.L(5.0f);
        this.A1 = L2;
        setPadding(L, L2, hl.L(12.0f), hl.L(5.0f));
        int size = View.MeasureSpec.getSize(i);
        this.w1 = size;
        int L3 = hl.L(388.0f);
        this.x1 = L3;
        setMeasuredDimension(size, L3);
        int L4 = hl.L(10.0f);
        this.y1 = L4;
        this.v1 = (this.w1 - (L4 << 1)) - (this.z1 << 1);
        fsb fsbVar = this.h;
        if (fsbVar != null && fsbVar.d != null && fsbVar.c == null) {
            fsbVar.a(false);
        }
        ArrayList arrayList = this.s;
        if (!arrayList.isEmpty()) {
            int size2 = arrayList.size();
            int i3 = 0;
            while (i3 < size2) {
                Object obj = arrayList.get(i3);
                i3++;
                fsb fsbVar2 = (fsb) obj;
                if (fsbVar2.d != null && fsbVar2.c == null) {
                    fsbVar2.a(false);
                    fsbVar2.b();
                }
            }
        }
        if (this.P == null || this.b0 != null) {
            return;
        }
        p();
    }

    /* JADX WARN: Removed duplicated region for block: B:187:0x03de  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x03e5  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x03f0  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x04e2  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x0775  */
    /* JADX WARN: Removed duplicated region for block: B:510:0x0d6c  */
    /* JADX WARN: Removed duplicated region for block: B:520:0x0d96  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        pqa pqaVar;
        boolean z2;
        VelocityTracker velocityTracker;
        esb esbVar;
        VelocityTracker velocityTracker2;
        long j;
        long j2;
        VelocityTracker velocityTracker3;
        long j3;
        long j4;
        VelocityTracker velocityTracker4;
        VelocityTracker velocityTracker5;
        Runnable runnable;
        VelocityTracker velocityTracker6;
        float z3;
        float x;
        float z4;
        boolean z5;
        float x2;
        boolean z6;
        esb esbVar2;
        int i;
        float f;
        float f2;
        boolean z7;
        float f3;
        float i2;
        esb esbVar3;
        esb esbVar4;
        float f4;
        float f5;
        fsb fsbVar = this.h;
        ArrayList arrayList = this.s;
        if (fsbVar != null || !arrayList.isEmpty() || this.O || this.F) {
            float timelineHeight = this.x1 - getTimelineHeight();
            if (motionEvent.getAction() != 0 || motionEvent.getY() >= timelineHeight) {
                long currentTimeMillis = System.currentTimeMillis();
                int action = motionEvent.getAction();
                dv9 dv9Var = this.X0;
                uwa uwaVar = this.Z0;
                if (action == 0) {
                    pqa pqaVar2 = this.e1;
                    if (pqaVar2 != null) {
                        hl.r(pqaVar2);
                        this.e1 = null;
                    }
                    dv9Var.a();
                    this.j1 = -1;
                    this.i1 = b(motionEvent);
                    this.k1 = -1;
                    this.l1 = -1;
                    int i3 = this.x1 - this.A1;
                    if (!this.k0) {
                        if (this.p0.contains(motionEvent.getX(), motionEvent.getY())) {
                            this.k1 = 10;
                            this.i1 = -1;
                        }
                    }
                    float f6 = 2.0f;
                    if (this.k1 != -1 || this.h == null) {
                        f4 = 4.0f;
                    } else {
                        float f7 = i3;
                        if (motionEvent.getY() < f7) {
                            f4 = 4.0f;
                            if (motionEvent.getY() > (f7 - getVideoHeight()) - hl.L(2.0f)) {
                                this.k1 = 0;
                            }
                        } else {
                            f4 = 4.0f;
                        }
                        i3 = (int) (f7 - (getVideoHeight() + hl.L(f4)));
                    }
                    if (this.k1 == -1 && !arrayList.isEmpty()) {
                        int i4 = 0;
                        while (i4 < arrayList.size()) {
                            f5 = f6;
                            float U1 = hl.U1(((fsb) arrayList.get(i4)).k.c, hl.L(28.0f), hl.L(38.0f));
                            float f8 = i3;
                            if (motionEvent.getY() < f8 && motionEvent.getY() > (f8 - U1) - hl.L(f5)) {
                                this.k1 = 3;
                                this.l1 = i4;
                                break;
                            }
                            i3 = (int) (f8 - (U1 + hl.L(f4)));
                            i4++;
                            f6 = f5;
                        }
                    }
                    f5 = f6;
                    if (this.k1 == -1 && this.F) {
                        float f9 = i3;
                        if (motionEvent.getY() < f9 && motionEvent.getY() > (f9 - getRoundHeight()) - hl.L(f5)) {
                            this.k1 = 1;
                        }
                        i3 = (int) (f9 - (getRoundHeight() + hl.L(f4)));
                    }
                    if (this.k1 == -1 && this.O) {
                        float f10 = i3;
                        if (motionEvent.getY() < f10 && motionEvent.getY() > (f10 - getAudioHeight()) - hl.L(f5)) {
                            this.k1 = 2;
                        }
                        getAudioHeight();
                        Typeface typeface = hl.a;
                    }
                    this.g1 = System.currentTimeMillis();
                    int i5 = this.i1;
                    this.m1 = i5 == 0 || i5 == -1 || i5 == 1;
                    this.p1 = false;
                    if (i5 == 1 || i5 == 5 || i5 == 8) {
                        this.q1 = VelocityTracker.obtain();
                    } else {
                        VelocityTracker velocityTracker7 = this.q1;
                        if (velocityTracker7 != null) {
                            velocityTracker7.recycle();
                            this.q1 = null;
                        }
                    }
                    this.o1 = 1.0f;
                    this.n1 = false;
                    this.h1 = motionEvent.getX();
                    if (!this.Y0) {
                        hl.r(uwaVar);
                        hl.d3(uwaVar, ViewConfiguration.getLongPressTimeout());
                    }
                } else if (motionEvent.getAction() == 2) {
                    float x3 = motionEvent.getX() - this.h1;
                    if (this.k0 && (this.n1 || Math.abs(x3) > hl.e)) {
                        long min = Math.min(getBaseDuration(), getMaxScrollDuration());
                        fsb fsbVar2 = this.h;
                        if (fsbVar2 != null) {
                            int i6 = this.i1;
                            if (i6 == 1) {
                                this.f = (long) Utilities.i(this.f - ((x3 / this.v1) * min), fsbVar2.e - min, 0.0f);
                                invalidate();
                                if (!this.n1) {
                                    this.o1 = 1.0f;
                                }
                                this.n1 = true;
                                this.m1 = false;
                            } else if (i6 == 2 || i6 == 3 || i6 == 4) {
                                float f11 = fsbVar2.e;
                                float f12 = (min / f11) * (x3 / this.v1);
                                if (i6 == 2) {
                                    fsbVar2.g = Utilities.i(fsbVar2.g + f12, fsbVar2.h - (1000.0f / f11), 0.0f);
                                    esb esbVar5 = this.a;
                                    if (esbVar5 != null) {
                                        esbVar5.X(false, this.h.g);
                                    }
                                    fsb fsbVar3 = this.h;
                                    float f13 = fsbVar3.h - fsbVar3.g;
                                    float f14 = f();
                                    fsb fsbVar4 = this.h;
                                    if (f13 > f14 / fsbVar4.e) {
                                        fsbVar4.h = qu6.z(f(), this.h.e, fsbVar4.g, 1.0f);
                                        esb esbVar6 = this.a;
                                        if (esbVar6 != null) {
                                            esbVar6.P1(this.h.h);
                                        }
                                    }
                                } else if (i6 == 3) {
                                    fsbVar2.h = Utilities.i(fsbVar2.h + f12, 1.0f, (1000.0f / f11) + fsbVar2.g);
                                    esb esbVar7 = this.a;
                                    if (esbVar7 != null) {
                                        esbVar7.P1(this.h.h);
                                    }
                                    fsb fsbVar5 = this.h;
                                    float f15 = fsbVar5.h - fsbVar5.g;
                                    float f16 = f();
                                    fsb fsbVar6 = this.h;
                                    if (f15 > f16 / fsbVar6.e) {
                                        fsbVar6.g = bp1.x(f(), this.h.e, fsbVar6.h, 0.0f);
                                        esb esbVar8 = this.a;
                                        if (esbVar8 != null) {
                                            esbVar8.X(false, this.h.g);
                                        }
                                    }
                                } else if (i6 == 4) {
                                    float min2 = f12 > 0.0f ? Math.min(1.0f - fsbVar2.h, f12) : Math.max(-fsbVar2.g, f12);
                                    fsb fsbVar7 = this.h;
                                    float f17 = fsbVar7.g + min2;
                                    fsbVar7.g = f17;
                                    fsbVar7.h += min2;
                                    esb esbVar9 = this.a;
                                    if (esbVar9 != null) {
                                        esbVar9.X(false, f17);
                                        this.a.P1(this.h.h);
                                    }
                                }
                                float f18 = this.e;
                                fsb fsbVar8 = this.h;
                                float f19 = fsbVar8.e;
                                float f20 = f18 / f19;
                                float f21 = fsbVar8.g;
                                if (f20 < f21 || f20 > fsbVar8.h) {
                                    long j5 = (long) (f21 * f19);
                                    this.e = j5;
                                    esb esbVar10 = this.a;
                                    if (esbVar10 != null) {
                                        esbVar10.C(j5, false);
                                    }
                                }
                                invalidate();
                                if (!this.n1) {
                                    this.o1 = 1.0f;
                                }
                                this.n1 = true;
                                this.m1 = false;
                            }
                            this.h1 = motionEvent.getX();
                        }
                        int i7 = this.i1;
                        if (i7 == 6 || i7 == 7 || i7 == 8) {
                            float f22 = (min / this.S) * (x3 / this.v1);
                            if (i7 == 6) {
                                float g = this.U - (g() / this.S);
                                float max = Math.max(0L, this.f - this.R);
                                float f23 = this.S;
                                float f24 = max / f23;
                                fsb fsbVar9 = this.h;
                                if (fsbVar9 != null) {
                                    x = bp1.f((fsbVar9.g * fsbVar9.e) + this.f, this.R, f23, f24);
                                } else {
                                    fsb fsbVar10 = this.w;
                                    if (fsbVar10 != null) {
                                        x = bp1.f((fsbVar10.g * fsbVar10.e) + this.f, this.R, f23, f24);
                                    } else if (this.F) {
                                        x = bp1.f((this.K * this.I) + this.f, this.R, f23, f24);
                                    } else {
                                        x = bp1.x(f(), this.S, this.U, f24);
                                        if (!this.p1 && f22 < 0.0f && this.T <= this.U - (f() / this.S)) {
                                            this.i1 = 8;
                                        }
                                    }
                                }
                                float f25 = this.T;
                                float i8 = Utilities.i(f25 + f22, g, x);
                                this.T = i8;
                                if (Math.abs(f25 - i8) > 0.01f) {
                                    this.p1 = true;
                                }
                                esb esbVar11 = this.a;
                                if (esbVar11 != null) {
                                    esbVar11.g2(this.R + ((long) (this.T * this.S)));
                                }
                                esb esbVar12 = this.a;
                                if (esbVar12 != null) {
                                    esbVar12.E1(this.T);
                                }
                            } else if (i7 == 7) {
                                float min3 = Math.min(1.0f, Math.max(0L, (this.f - this.R) + min) / this.S);
                                float f26 = this.T;
                                float g2 = g();
                                float f27 = this.S;
                                float f28 = (g2 / f27) + f26;
                                fsb fsbVar11 = this.h;
                                if (fsbVar11 != null) {
                                    z3 = Math.min(min3, (((fsbVar11.h * fsbVar11.e) + this.f) - this.R) / f27);
                                } else {
                                    fsb fsbVar12 = this.w;
                                    if (fsbVar12 != null) {
                                        z3 = Math.min(min3, (((fsbVar12.h * fsbVar12.e) + this.f) - this.R) / f27);
                                    } else if (this.F) {
                                        z3 = Math.min(min3, (((this.L * this.I) + this.f) - this.R) / f27);
                                    } else {
                                        z3 = qu6.z(f(), this.S, this.T, min3);
                                        if (!this.p1 && f22 > 0.0f) {
                                            if (this.U >= (f() / this.S) + this.T) {
                                                this.i1 = 8;
                                            }
                                        }
                                    }
                                }
                                float f29 = this.U;
                                float i9 = Utilities.i(f29 + f22, z3, f28);
                                this.U = i9;
                                if (Math.abs(f29 - i9) > 0.01f) {
                                    this.p1 = true;
                                }
                                esb esbVar13 = this.a;
                                if (esbVar13 != null) {
                                    esbVar13.s1(this.U);
                                }
                            }
                            if (this.i1 == 8) {
                                float min4 = f22 > 0.0f ? Math.min(Math.max(0.0f, Math.min(1.0f, Math.max(0L, (this.f - this.R) + min) / this.S) - this.U), f22) : Math.max(Math.min(0.0f, (Math.max(0L, this.f - this.R) / this.S) - this.T), f22);
                                float f30 = this.T + min4;
                                this.T = f30;
                                this.U += min4;
                                esb esbVar14 = this.a;
                                if (esbVar14 != null) {
                                    esbVar14.E1(f30);
                                    this.a.g2(this.R + ((long) (this.T * this.S)));
                                    this.a.s1(this.U);
                                }
                                esb esbVar15 = this.a;
                                if (esbVar15 != null) {
                                    esbVar15.v0(true);
                                }
                            }
                            if (this.h == null && !this.F) {
                                this.e = (long) (this.T * this.S);
                                esb esbVar16 = this.a;
                                if (esbVar16 != null) {
                                    esbVar16.v0(true);
                                    this.a.C(this.e, false);
                                }
                            }
                            invalidate();
                            if (!this.n1) {
                                this.o1 = 1.0f;
                            }
                            this.n1 = true;
                            this.m1 = false;
                        } else if (i7 == 10 || i7 == 11 || i7 == 12) {
                            float f31 = (min / this.I) * (x3 / this.v1);
                            if (i7 == 10) {
                                float g3 = this.L - (g() / this.I);
                                float max2 = Math.max(0L, this.f - this.J);
                                float f32 = this.I;
                                float f33 = max2 / f32;
                                fsb fsbVar13 = this.h;
                                if (fsbVar13 != null) {
                                    x2 = bp1.f((fsbVar13.g * fsbVar13.e) + this.f, this.J, f32, f33);
                                } else {
                                    fsb fsbVar14 = this.w;
                                    if (fsbVar14 != null) {
                                        x2 = bp1.f((fsbVar14.g * fsbVar14.e) + this.f, this.J, f32, f33);
                                    } else {
                                        x2 = bp1.x(f(), this.I, this.L, f33);
                                        if (!this.p1 && f31 < 0.0f && this.K <= this.L - (f() / this.I)) {
                                            this.i1 = 8;
                                        }
                                    }
                                }
                                float f34 = this.K;
                                float i10 = Utilities.i(f34 + f31, g3, x2);
                                this.K = i10;
                                if (Math.abs(f34 - i10) > 0.01f) {
                                    this.p1 = true;
                                }
                                esb esbVar17 = this.a;
                                if (esbVar17 != null) {
                                    esbVar17.b1(this.J + ((long) (this.K * this.I)));
                                }
                                esb esbVar18 = this.a;
                                if (esbVar18 != null) {
                                    esbVar18.m0(this.K);
                                }
                            } else if (i7 == 11) {
                                float min5 = Math.min(1.0f, Math.max(0L, (this.f - this.J) + min) / this.I);
                                float f35 = this.K;
                                float g4 = g();
                                float f36 = this.I;
                                float f37 = (g4 / f36) + f35;
                                fsb fsbVar15 = this.h;
                                if (fsbVar15 != null) {
                                    min5 = Math.min(min5, (((fsbVar15.h * fsbVar15.e) + this.f) - this.J) / f36);
                                }
                                fsb fsbVar16 = this.w;
                                if (fsbVar16 != null) {
                                    z4 = Math.min(min5, (((fsbVar16.h * fsbVar16.e) + this.f) - this.J) / this.I);
                                } else {
                                    z4 = qu6.z(f(), this.I, this.K, min5);
                                    if (!this.p1 && f31 > 0.0f) {
                                        if (this.L >= (f() / this.I) + this.K) {
                                            this.i1 = 8;
                                        }
                                    }
                                }
                                float f38 = this.L;
                                float i11 = Utilities.i(f38 + f31, z4, f37);
                                this.L = i11;
                                if (Math.abs(f38 - i11) > 0.01f) {
                                    this.p1 = true;
                                }
                                esb esbVar19 = this.a;
                                if (esbVar19 != null) {
                                    esbVar19.Z1(this.L);
                                }
                            }
                            if (this.i1 == 12) {
                                float min6 = f31 > 0.0f ? Math.min(Math.min(1.0f, Math.max(0L, (this.f - this.J) + min) / this.I) - this.L, f31) : Math.max((Math.max(0L, this.f - this.J) / this.I) - this.K, f31);
                                float f39 = this.K + min6;
                                this.K = f39;
                                this.L += min6;
                                esb esbVar20 = this.a;
                                if (esbVar20 != null) {
                                    esbVar20.m0(f39);
                                    this.a.b1(this.J + ((long) (this.K * this.I)));
                                    this.a.Z1(this.L);
                                }
                                esb esbVar21 = this.a;
                                if (esbVar21 != null) {
                                    esbVar21.v0(true);
                                }
                            }
                            if (this.h == null) {
                                this.e = (long) (this.K * this.I);
                                esb esbVar22 = this.a;
                                if (esbVar22 != null) {
                                    esbVar22.v0(true);
                                    z5 = false;
                                    this.a.C(this.e, false);
                                    invalidate();
                                    if (!this.n1) {
                                        this.o1 = 1.0f;
                                    }
                                    this.n1 = true;
                                    this.m1 = z5;
                                }
                            }
                            z5 = false;
                            invalidate();
                            if (!this.n1) {
                            }
                            this.n1 = true;
                            this.m1 = z5;
                        } else {
                            int i12 = this.j1;
                            if (i12 < 0 || i12 >= arrayList.size() || !((i = this.i1) == 13 || i == 14 || i == 15)) {
                                int i13 = this.i1;
                                if (i13 == 5) {
                                    h((x3 / this.v1) * min);
                                    if (!this.n1) {
                                        this.o1 = 1.0f;
                                    }
                                    this.n1 = true;
                                    this.m1 = false;
                                } else if (i13 == 9) {
                                    j((x3 / this.v1) * min);
                                    if (!this.n1) {
                                        this.o1 = 1.0f;
                                    }
                                    this.n1 = true;
                                    this.m1 = false;
                                } else {
                                    int i14 = this.j1;
                                    if (i14 >= 0 && i14 < arrayList.size() && this.i1 == 16) {
                                        i((fsb) arrayList.get(this.j1), (x3 / this.v1) * min);
                                        if (!this.n1) {
                                            this.o1 = 1.0f;
                                        }
                                        this.n1 = true;
                                        this.m1 = false;
                                    } else if (this.m1) {
                                        m(currentTimeMillis - this.f1 < 350, motionEvent.getX());
                                        if (this.n1 || (esbVar2 = this.a) == null) {
                                            z6 = true;
                                        } else {
                                            z6 = true;
                                            esbVar2.v0(true);
                                        }
                                        if (!this.n1) {
                                            this.o1 = 1.0f;
                                        }
                                        this.n1 = z6;
                                    }
                                }
                            } else {
                                fsb fsbVar17 = (fsb) arrayList.get(this.j1);
                                float f40 = (min / fsbVar17.e) * (x3 / this.v1);
                                int i15 = this.i1;
                                if (i15 == 13) {
                                    float g5 = fsbVar17.h - (g() / fsbVar17.e);
                                    float max3 = Math.max(0L, this.f - fsbVar17.f) / fsbVar17.e;
                                    if (fsbVar17 == this.w) {
                                        f = f40;
                                        max3 = bp1.x(f(), fsbVar17.e, fsbVar17.h, max3);
                                        if (!this.p1 && f < 0.0f) {
                                            f2 = 0.0f;
                                            if (fsbVar17.g <= fsbVar17.h - (f() / fsbVar17.e)) {
                                                this.i1 = 15;
                                            }
                                            f3 = fsbVar17.g;
                                            i2 = Utilities.i(f3 + f, g5, max3);
                                            fsbVar17.g = i2;
                                            if (Math.abs(f3 - i2) > 0.01f) {
                                                this.p1 = true;
                                            }
                                            esbVar3 = this.a;
                                            if (esbVar3 != null) {
                                                esbVar3.b2(fsbVar17.a, fsbVar17.f);
                                            }
                                            esbVar4 = this.a;
                                            if (esbVar4 != null) {
                                                esbVar4.p1(fsbVar17.g, fsbVar17.a);
                                            }
                                        }
                                    } else {
                                        f = f40;
                                    }
                                    f2 = 0.0f;
                                    f3 = fsbVar17.g;
                                    i2 = Utilities.i(f3 + f, g5, max3);
                                    fsbVar17.g = i2;
                                    if (Math.abs(f3 - i2) > 0.01f) {
                                    }
                                    esbVar3 = this.a;
                                    if (esbVar3 != null) {
                                    }
                                    esbVar4 = this.a;
                                    if (esbVar4 != null) {
                                    }
                                } else {
                                    f = f40;
                                    f2 = 0.0f;
                                    if (i15 == 14) {
                                        float min7 = Math.min(1.0f, Math.max(0L, (this.f - fsbVar17.f) + min) / fsbVar17.e);
                                        float g6 = (g() / fsbVar17.e) + fsbVar17.g;
                                        if (fsbVar17 == this.w) {
                                            min7 = qu6.z(f(), fsbVar17.e, fsbVar17.g, min7);
                                            if (!this.p1 && f > 0.0f) {
                                                if (fsbVar17.h >= (f() / fsbVar17.e) + fsbVar17.g) {
                                                    this.i1 = 15;
                                                }
                                            }
                                        }
                                        float f41 = fsbVar17.h;
                                        float i16 = Utilities.i(f41 + f, min7, g6);
                                        fsbVar17.h = i16;
                                        if (Math.abs(f41 - i16) > 0.01f) {
                                            this.p1 = true;
                                        }
                                        esb esbVar23 = this.a;
                                        if (esbVar23 != null) {
                                            esbVar23.O1(fsbVar17.h, fsbVar17.a);
                                        }
                                    }
                                }
                                if (this.i1 == 15) {
                                    float min8 = f > f2 ? Math.min(Math.min(1.0f, Math.max(0L, (this.f - fsbVar17.f) + min) / fsbVar17.e) - fsbVar17.h, f) : Math.max((Math.max(0L, this.f - fsbVar17.f) / fsbVar17.e) - fsbVar17.g, f);
                                    float f42 = fsbVar17.g + min8;
                                    fsbVar17.g = f42;
                                    fsbVar17.h += min8;
                                    esb esbVar24 = this.a;
                                    if (esbVar24 != null) {
                                        esbVar24.p1(f42, fsbVar17.a);
                                        this.a.b2(fsbVar17.a, fsbVar17.f);
                                        this.a.O1(fsbVar17.h, fsbVar17.a);
                                    }
                                    esb esbVar25 = this.a;
                                    if (esbVar25 != null) {
                                        z7 = true;
                                        esbVar25.v0(true);
                                        invalidate();
                                        if (!this.n1) {
                                            this.o1 = 1.0f;
                                        }
                                        this.n1 = z7;
                                        this.m1 = false;
                                    }
                                }
                                z7 = true;
                                invalidate();
                                if (!this.n1) {
                                }
                                this.n1 = z7;
                                this.m1 = false;
                            }
                        }
                        this.h1 = motionEvent.getX();
                    }
                    if (this.n1) {
                        hl.r(uwaVar);
                    }
                    int i17 = this.i1;
                    if ((i17 == 1 || i17 == 5 || i17 == 8) && (velocityTracker6 = this.q1) != null) {
                        velocityTracker6.addMovement(motionEvent);
                    }
                } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    hl.r(uwaVar);
                    dv9Var.a();
                    if (motionEvent.getAction() == 1) {
                        if ((System.currentTimeMillis() - this.g1 > ViewConfiguration.getTapTimeout() || this.n1) && this.k0) {
                            int i18 = this.i1;
                            if (i18 == 16 && (velocityTracker5 = this.q1) != null) {
                                velocityTracker5.computeCurrentVelocity(1000);
                                int xVelocity = (int) this.q1.getXVelocity();
                                this.r1 = true;
                                if (this.h != null && Math.abs(xVelocity) > hl.L(100.0f)) {
                                    long min9 = Math.min(this.h.e, getMaxScrollDuration());
                                    int i19 = this.z1;
                                    float f43 = i19;
                                    float f44 = min9;
                                    float f45 = this.v1;
                                    int i20 = (int) (((this.f / f44) * f45) + f43);
                                    int B = (int) c00.B(this.h.e - min9, f44, f45, f43);
                                    this.s1 = true;
                                    this.t1 = i20;
                                    this.X0.c(i20, 0, -xVelocity, 0, i19, B, 0, 0);
                                    z = false;
                                }
                            } else if (i18 == 1 && (velocityTracker4 = this.q1) != null) {
                                velocityTracker4.computeCurrentVelocity(1000);
                                int xVelocity2 = (int) this.q1.getXVelocity();
                                this.r1 = true;
                                if (this.h != null && Math.abs(xVelocity2) > hl.L(100.0f)) {
                                    long min10 = Math.min(this.h.e, getMaxScrollDuration());
                                    int i21 = this.z1;
                                    float f46 = i21;
                                    float f47 = min10;
                                    float f48 = this.v1;
                                    int i22 = (int) (((this.f / f47) * f48) + f46);
                                    int B2 = (int) c00.B(this.h.e - min10, f47, f48, f46);
                                    this.s1 = true;
                                    this.t1 = i22;
                                    this.X0.c(i22, 0, -xVelocity2, 0, i21, B2, 0, 0);
                                    z = false;
                                }
                            } else if ((i18 == 5 || (i18 == 8 && !this.n1)) && this.Q && (velocityTracker2 = this.q1) != null) {
                                velocityTracker2.computeCurrentVelocity(this.h == null ? 1500 : 1000);
                                int xVelocity3 = (int) this.q1.getXVelocity();
                                this.r1 = false;
                                if (Math.abs(xVelocity3) > hl.L(100.0f)) {
                                    float min11 = Math.min(getBaseDuration(), getMaxScrollDuration());
                                    int i23 = (int) (((this.R / min11) * this.v1) + this.z1 + this.y1);
                                    fsb fsbVar18 = this.h;
                                    if (fsbVar18 != null) {
                                        float f49 = fsbVar18.h;
                                        float f50 = fsbVar18.e;
                                        j = (long) ((fsbVar18.g * f50) - this.S);
                                        j2 = (long) ((f49 * f50) - 0.0f);
                                    } else if (this.F) {
                                        float f51 = this.L;
                                        float f52 = this.I;
                                        j2 = (long) ((f51 * f52) - 0.0f);
                                        j = (long) ((this.K * f52) - this.S);
                                    } else {
                                        j = -(this.S - Math.min(getBaseDuration(), getMaxScrollDuration()));
                                        j2 = 0;
                                    }
                                    this.s1 = true;
                                    this.t1 = i23;
                                    float f53 = this.z1 + this.y1;
                                    float f54 = this.v1;
                                    this.X0.c(i23, 0, xVelocity3, 0, (int) (((j / min11) * f54) + f53), (int) c00.B(j2, min11, f54, f53), 0, 0);
                                    z = false;
                                }
                            } else if ((i18 == 9 || (i18 == 12 && !this.n1)) && this.H && (velocityTracker3 = this.q1) != null) {
                                velocityTracker3.computeCurrentVelocity(this.h == null ? 1500 : 1000);
                                int xVelocity4 = (int) this.q1.getXVelocity();
                                this.r1 = false;
                                if (Math.abs(xVelocity4) > hl.L(100.0f)) {
                                    float min12 = Math.min(getBaseDuration(), getMaxScrollDuration());
                                    int i24 = (int) (((this.J / min12) * this.v1) + this.z1 + this.y1);
                                    fsb fsbVar19 = this.h;
                                    if (fsbVar19 != null) {
                                        float f55 = fsbVar19.h;
                                        float f56 = fsbVar19.e;
                                        j3 = (long) ((fsbVar19.g * f56) - this.I);
                                        j4 = (long) ((f55 * f56) - 0.0f);
                                    } else {
                                        j3 = -(this.I - Math.min(getBaseDuration(), getMaxScrollDuration()));
                                        j4 = 0;
                                    }
                                    this.s1 = true;
                                    this.t1 = i24;
                                    float f57 = this.z1 + this.y1;
                                    float f58 = this.v1;
                                    this.X0.c(i24, 0, xVelocity4, 0, (int) (((j3 / min12) * f58) + f57), (int) c00.B(j4, min12, f58, f57), 0, 0);
                                    z = false;
                                }
                            }
                            pqaVar = this.e1;
                            if (pqaVar != null) {
                                hl.r(pqaVar);
                                this.e1 = null;
                            }
                            if (this.n1 || !z || (esbVar = this.a) == null) {
                                z2 = false;
                            } else {
                                z2 = false;
                                esbVar.v0(false);
                            }
                            this.o1 = 1.0f;
                            this.n1 = z2;
                            this.m1 = z2;
                            this.g1 = -1L;
                            this.i1 = -1;
                            velocityTracker = this.q1;
                            if (velocityTracker != null) {
                                velocityTracker.recycle();
                                this.q1 = null;
                            }
                        } else if (this.k0) {
                            if (!this.Y0 || this.h == null) {
                                int i25 = this.k1;
                                if (i25 == 3) {
                                    int i26 = (this.Q || this.H) ? -1 : this.n;
                                    int i27 = this.l1;
                                    if (i26 != i27) {
                                        this.Q = false;
                                        this.H = false;
                                        this.n = i27;
                                        if (this.a != null && i27 >= 0 && i27 < arrayList.size()) {
                                            this.a.g(((fsb) arrayList.get(this.l1)).a);
                                        }
                                        invalidate();
                                    }
                                }
                                if (i25 == 2 && !this.Q) {
                                    this.Q = true;
                                    this.H = false;
                                    esb esbVar26 = this.a;
                                    if (esbVar26 != null) {
                                        esbVar26.e1(false);
                                    }
                                    invalidate();
                                } else if (i25 == 1 && !this.H) {
                                    this.Q = false;
                                    this.H = true;
                                    esb esbVar27 = this.a;
                                    if (esbVar27 != null) {
                                        esbVar27.e1(true);
                                    }
                                    invalidate();
                                } else if (i25 != 2 && this.Q) {
                                    this.Q = false;
                                    this.H = false;
                                    esb esbVar28 = this.a;
                                    if (esbVar28 != null) {
                                        esbVar28.e1(false);
                                    }
                                    invalidate();
                                } else if (i25 == 1 || !this.H) {
                                    long j6 = this.e;
                                    if (m(false, motionEvent.getX()) && Math.abs(this.e - j6) > 400) {
                                        this.d1 = j6;
                                        this.c1.e(true, 1.0f);
                                        invalidate();
                                    }
                                } else {
                                    this.Q = false;
                                    this.H = false;
                                    esb esbVar29 = this.a;
                                    if (esbVar29 != null) {
                                        esbVar29.e1(false);
                                    }
                                    invalidate();
                                }
                            } else {
                                long i28 = (long) Utilities.i(((((motionEvent.getX() - this.z1) - this.y1) / this.v1) * Math.min(getBaseDuration(), getMaxScrollDuration())) + this.f, getBaseDuration(), 0.0f);
                                fsb fsbVar20 = this.h;
                                float f59 = fsbVar20.h - fsbVar20.g;
                                fsbVar20.g = (1.0f - f59) * (i28 / getBaseDuration());
                                fsb fsbVar21 = this.h;
                                float f60 = fsbVar21.g;
                                fsbVar21.h = f59 + f60;
                                esb esbVar30 = this.a;
                                if (esbVar30 != null) {
                                    esbVar30.X(true, f60);
                                    this.a.P1(this.h.h);
                                }
                                invalidate();
                            }
                        } else if (this.k1 == 10 && (runnable = this.b) != null) {
                            runnable.run();
                        }
                    }
                    z = true;
                    pqaVar = this.e1;
                    if (pqaVar != null) {
                    }
                    if (this.n1) {
                    }
                    z2 = false;
                    this.o1 = 1.0f;
                    this.n1 = z2;
                    this.m1 = z2;
                    this.g1 = -1L;
                    this.i1 = -1;
                    velocityTracker = this.q1;
                    if (velocityTracker != null) {
                    }
                }
                this.f1 = System.currentTimeMillis();
                return true;
            }
        }
        return false;
    }

    public final void p() {
        if (getMeasuredWidth() > 0) {
            if (this.b0 == null || this.a0) {
                this.b0 = new dsb(this, this.P, (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
                this.V = false;
                this.h0.e(true, 1.0f);
            }
        }
    }

    public final void q() {
        fna fnaVar = new fna((byte) 9);
        ArrayList arrayList = this.s;
        Collections.sort(arrayList, fnaVar);
        fsb fsbVar = arrayList.isEmpty() ? null : (fsb) arrayList.get(0);
        this.w = fsbVar;
        if (fsbVar != null) {
            long j = fsbVar.f;
        }
    }

    public void setCollage(ArrayList<c8b> arrayList) {
        ArrayList arrayList2;
        ArrayList arrayList3;
        isb isbVar;
        int i = 0;
        while (true) {
            arrayList2 = this.s;
            if (i >= arrayList2.size()) {
                break;
            }
            fsb fsbVar = (fsb) arrayList2.get(i);
            if (fsbVar != null && (isbVar = fsbVar.c) != null) {
                isbVar.a();
            }
            i++;
        }
        arrayList2.clear();
        int i2 = 0;
        while (true) {
            arrayList3 = this.r;
            if (i2 >= arrayList3.size()) {
                break;
            }
            dsb dsbVar = (dsb) arrayList3.get(i2);
            if (dsbVar != null) {
                dsbVar.a();
            }
            i2++;
        }
        arrayList3.clear();
        this.i0.e(true, 1.0f);
        if (arrayList != null) {
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                arrayList3.add(null);
                c8b c8bVar = arrayList.get(i3);
                if (c8bVar.K) {
                    fsb fsbVar2 = new fsb(this);
                    fsbVar2.a = i3;
                    fsbVar2.b = false;
                    fsbVar2.d = c8bVar.L.getAbsolutePath();
                    fsbVar2.e = c8bVar.h0;
                    fsbVar2.f = c8bVar.X;
                    fsbVar2.i = c8bVar.P;
                    fsbVar2.g = c8bVar.V;
                    fsbVar2.h = c8bVar.W;
                    fsbVar2.a(false);
                    fsbVar2.b();
                    arrayList2.add(fsbVar2);
                }
            }
        }
        q();
        this.n = 0;
    }

    public void setDelegate(esb esbVar) {
        this.a = esbVar;
    }

    public void setMaxCount(int i) {
        this.c0 = i;
    }

    public void setOnHeightChange(Runnable runnable) {
        this.d = runnable;
    }

    public void setOnTimelineClick(Runnable runnable) {
        this.b = runnable;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0046, code lost:
    
        if ((r4 + 240) >= (r7 * r9.U)) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0067, code lost:
    
        if ((r4 + 240) >= (r6 * r9.U)) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0021, code lost:
    
        if ((r4 + 240) >= (r7 * r0.h)) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0069, code lost:
    
        r9.d1 = -1;
        r9.c1.e(true, 1.0f);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void setProgress(long j) {
        fsb fsbVar = this.h;
        if (fsbVar != null) {
            if (j < this.e) {
                float f = j;
                float f2 = fsbVar.e;
                if (f <= (fsbVar.g * f2) + 240.0f) {
                }
            }
        }
        if (this.O && !this.F && fsbVar == null) {
            if (j < this.e) {
                float f3 = j;
                float f4 = this.S;
                if (f3 <= (this.T * f4) + 240.0f) {
                }
            }
        }
        if (this.F && fsbVar == null) {
            if (j < this.e) {
                float f5 = j;
                float f6 = this.I;
                if (f5 <= (this.T * f6) + 240.0f) {
                }
            }
        }
        this.e = j;
        invalidate();
    }

    public void setRoundNull(boolean z) {
        n(null, 0L, 0L, 0.0f, 0.0f, 0.0f, z);
    }

    public void setVideoLeft(float f) {
        fsb fsbVar = this.h;
        if (fsbVar == null) {
            return;
        }
        fsbVar.g = f;
        invalidate();
    }

    public void setVideoRight(float f) {
        fsb fsbVar = this.h;
        if (fsbVar == null) {
            return;
        }
        fsbVar.h = f;
        invalidate();
    }
}
