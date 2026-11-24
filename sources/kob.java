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

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes3.dex */
public final class kob extends View {
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
    public final job J0;
    public float K;
    public final Paint K0;
    public float L;
    public final Drawable L0;
    public float M;
    public final TextPaint M0;
    public iob N;
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
    public final kr9 X0;
    public boolean Y0;
    public final tsa Z0;
    public eob a;
    public boolean a0;
    public long a1;
    public Runnable b;
    public dob b0;
    public long b1;
    public int c;
    public int c0;
    public final lm c1;
    public Runnable d;
    public final lm d0;
    public long d1;
    public long e;
    public final lm e0;
    public sma e1;
    public long f;
    public final lm f0;
    public long f1;
    public final lm g0;
    public long g1;
    public fob h;
    public final lm h0;
    public float h1;
    public final lm i0;
    public int i1;
    public final lm j0;
    public int j1;
    public boolean k0;
    public int k1;
    public final sl0 l0;
    public int l1;
    public final wl0 m0;
    public boolean m1;
    public int n;
    public final wl0 n0;
    public boolean n1;
    public final wl0 o0;
    public float o1;
    public final RectF p0;
    public boolean p1;
    public final Path q0;
    public VelocityTracker q1;
    public final ArrayList r;
    public final tgb r0;
    public boolean r1;
    public final ArrayList s;
    public final Drawable s0;
    public boolean s1;
    public final job t0;
    public int t1;
    public final RectF u0;
    public final float[] u1;
    public final Paint v0;
    public int v1;
    public fob w;
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

    public kob(Context context, ViewGroup viewGroup, g7b g7bVar, wjb wjbVar, sl0 sl0Var) {
        super(context);
        this.n = 0;
        this.r = new ArrayList();
        this.s = new ArrayList();
        this.x = new Paint(3);
        this.y = new Path();
        this.E = new Path();
        this.c0 = 1;
        s33 s33Var = s33.h;
        this.d0 = new lm(this, 0L, 360L, s33Var);
        this.e0 = new lm(360L, this, s33Var);
        this.f0 = new lm(this, 0L, 360L, s33Var);
        this.g0 = new lm(360L, this, s33Var);
        this.h0 = new lm(this, 0L, 360L, s33Var);
        this.i0 = new lm(this, 0L, 360L, s33Var);
        this.j0 = new lm(this, 0L, 320L, s33Var);
        this.k0 = true;
        this.p0 = new RectF();
        this.q0 = new Path();
        this.t0 = new job();
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
        this.J0 = new job();
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
        this.X0 = new kr9(getContext(), null);
        this.a1 = -1L;
        this.b1 = -1L;
        this.c1 = new lm(0.0f, this, 0L, 340L, s33Var);
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
        textPaint2.setTextSize(gl.L(12.0f));
        textPaint2.setTypeface(gl.o());
        textPaint2.setColor(-1);
        textPaint3.setTextSize(gl.L(12.0f));
        textPaint3.setColor(-1);
        paint6.setColor(1090519039);
        paint8.setShader(linearGradient);
        paint8.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        paint.setColor(-1);
        paint.setShadowLayer(gl.L(1.0f), 0.0f, gl.L(1.0f), 436207616);
        textPaint.setTextSize(gl.L(12.0f));
        textPaint.setColor(-1);
        textPaint.setShadowLayer(gl.L(2.0f), 0.0f, gl.L(2.0f), TLObject.FLAG_30);
        textPaint.setTypeface(gl.o());
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        paint3.setColor(-16777216);
        paint5.setColor(-1);
        paint4.setColor(637534208);
        this.r0 = new tgb(k96.M0(2131744216, null), 12.0f, gl.o());
        Drawable mutate = getContext().getResources().getDrawable(R.drawable.timeline).mutate();
        this.s0 = mutate;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        mutate.setColorFilter(new PorterDuffColorFilter(-1, mode));
        Drawable mutate2 = getContext().getResources().getDrawable(R.drawable.filled_widget_music).mutate();
        this.L0 = mutate2;
        mutate2.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.l0 = sl0Var;
        this.m0 = new wl0(sl0Var, this, 0, false);
        this.n0 = new wl0(sl0Var, this, 3, false);
        this.o0 = new wl0(sl0Var, this, 4, false);
        this.Z0 = new tsa(this, viewGroup, wjbVar, sl0Var, g7bVar, (byte) 5);
    }

    private float getAudioHeight() {
        return gl.U1(this.g0.d(this.Q), gl.L(28.0f), gl.L(38.0f));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long getBaseDuration() {
        fob fobVar = this.h;
        if (fobVar != null) {
            return Math.max(1L, fobVar.e);
        }
        fob fobVar2 = this.w;
        return fobVar2 != null ? Math.max(1L, fobVar2.e) : this.F ? Math.max(1L, this.I) : Math.max(1L, this.S);
    }

    private float getCollageHeight() {
        ArrayList arrayList = this.s;
        if (arrayList.isEmpty()) {
            return 0.0f;
        }
        float f = 0.0f;
        for (int i = 0; i < arrayList.size(); i++) {
            if (f > 0.0f) {
                f += gl.L(4.0f);
            }
            f += gl.U1(((fob) arrayList.get(i)).k.c, gl.L(28.0f), gl.L(38.0f));
        }
        return f;
    }

    private float getRoundHeight() {
        if (this.F) {
            return gl.U1(this.e0.d(this.H), gl.L(28.0f), gl.L(38.0f));
        }
        return 0.0f;
    }

    private float getVideoHeight() {
        if (this.h == null) {
            return 0.0f;
        }
        return gl.U1(r2.k.c, gl.L(28.0f), gl.L(38.0f));
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
        fob fobVar;
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        long min = Math.min(getBaseDuration(), getMaxScrollDuration());
        float k = Utilities.k(this.e, getBaseDuration(), 0L);
        fob fobVar2 = this.w;
        float f = min;
        float f2 = (this.v1 * (((k + (fobVar2 != null ? (fobVar2.g * fobVar2.e) + fobVar2.f : this.h == null ? this.R : 0L)) - this.f) / f)) + this.z1 + this.y1;
        if (!this.Y0 && x >= f2 - gl.L(12.0f) && x <= f2 + gl.L(12.0f)) {
            return 0;
        }
        boolean z2 = this.h != null && y > (((float) (this.x1 - this.A1)) - getVideoHeight()) - ((float) gl.L(2.0f));
        ArrayList arrayList = this.s;
        boolean z3 = !arrayList.isEmpty() && y > ((((((float) (this.x1 - this.A1)) - getVideoHeight()) - ((float) gl.L(4.0f))) - getCollageHeight()) - ((float) gl.L(4.0f))) - ((float) gl.L(2.0f)) && y < (((float) (this.x1 - this.A1)) - getVideoHeight()) - ((float) gl.L(2.0f));
        if (this.F) {
            if (y > (((((((this.x1 - this.A1) - getVideoHeight()) - gl.L(4.0f)) - getCollageHeight()) - gl.L(arrayList.isEmpty() ? 0.0f : 4.0f)) - getRoundHeight()) - gl.L(4.0f)) - gl.L(2.0f)) {
                if (y < ((((this.x1 - this.A1) - getVideoHeight()) - gl.L(2.0f)) - getCollageHeight()) - gl.L(arrayList.isEmpty() ? 0.0f : 4.0f)) {
                    z = true;
                    if (z3) {
                        i = 1;
                        if (z2) {
                            float f3 = this.z1 + this.y1;
                            fob fobVar3 = this.h;
                            float f4 = fobVar3.g;
                            float f5 = fobVar3.e;
                            float f6 = this.f;
                            float f7 = this.v1;
                            float f8 = ((((f4 * f5) - f6) / f) * f7) + f3;
                            float f9 = ((((fobVar3.h * f5) - f6) / f) * f7) + f3;
                            if (this.Y0) {
                                if (getBaseDuration() < getMaxScrollDuration()) {
                                    return 4;
                                }
                                if (x < f8 - gl.L(15.0f) || x > f9 + gl.L(15.0f)) {
                                    return i;
                                }
                                return 4;
                            }
                            if (x >= f8 - gl.L(15.0f) && x <= gl.L(5.0f) + f8) {
                                return 2;
                            }
                            if (x >= f9 - gl.L(5.0f) && x <= gl.L(15.0f) + f9) {
                                return 3;
                            }
                            if (x >= f8 && x <= f9) {
                                fob fobVar4 = this.h;
                                if (fobVar4.g > 0.01f || fobVar4.h < 0.99f) {
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
                                if (x >= f16 - gl.L(15.0f) && x <= gl.L(5.0f) + f16) {
                                    return 10;
                                }
                                if (x >= f17 - gl.L(5.0f) && x <= gl.L(15.0f) + f17) {
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
                                f17 = b00.A((j + this.I) - j2, f, f19, f18);
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
                                if (x >= f27 - gl.L(15.0f) && x <= gl.L(5.0f) + f27) {
                                    return 6;
                                }
                                if (x >= f28 - gl.L(5.0f) && x <= gl.L(15.0f) + f28) {
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
                                f28 = b00.A((j3 + this.S) - j4, f, f30, f29);
                                f27 = f31;
                            }
                            if (x >= f27 && x <= f28) {
                                return 5;
                            }
                        }
                    } else {
                        for (int i2 = 0; i2 < arrayList.size(); i2++) {
                            fob fobVar5 = (fob) arrayList.get(i2);
                            RectF rectF = gl.P;
                            rectF.set(fobVar5.j);
                            rectF.inset(-gl.L(2.0f), -gl.L(2.0f));
                            if (rectF.contains(x, y)) {
                                float f32 = this.z1 + this.y1;
                                float f33 = fobVar5.f;
                                float f34 = this.v1;
                                float f35 = ((f33 / f) * f34) + f32;
                                float f36 = fobVar5.g;
                                float f37 = fobVar5.e;
                                float f38 = ((((f36 * f37) + f33) / f) * f34) + f32;
                                float f39 = ((((fobVar5.h * f37) + f33) / f) * f34) + f32;
                                float A = b00.A(r6 + r11, f, f34, f32);
                                this.j1 = i2;
                                if (x >= f38 - gl.L(15.0f) && x <= gl.L(5.0f) + f38) {
                                    return 13;
                                }
                                if (x >= f39 - gl.L(5.0f) && x <= gl.L(15.0f) + f39) {
                                    return 14;
                                }
                                if (x < f38 || x > f39 || (fobVar5.g <= 0.01f && fobVar5.h >= 0.99f)) {
                                    return (x < f35 || x > A) ? -1 : 16;
                                }
                                return 15;
                            }
                        }
                        i = 1;
                    }
                    fobVar = this.h;
                    if (fobVar != null || fobVar.e <= getMaxScrollDuration() || !z2) {
                        return -1;
                    }
                }
            }
        }
        z = false;
        if (z3) {
        }
        fobVar = this.h;
        return fobVar != null ? -1 : -1;
    }

    public final void c(float f, float f2, float f3, long j, Canvas canvas) {
        float f4;
        if (this.Y0) {
            return;
        }
        long min = Math.min(getBaseDuration(), getMaxScrollDuration());
        float k = Utilities.k(j, getBaseDuration(), 0L);
        fob fobVar = this.w;
        if (fobVar != null) {
            f4 = (fobVar.g * fobVar.e) + fobVar.f;
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
        RectF rectF = gl.P;
        rectF.set(f5 - gl.N(1.5f), f7, gl.N(1.5f) + f5, f8);
        rectF.inset(-gl.N(0.66f), -gl.N(0.66f));
        canvas.drawRoundRect(rectF, gl.L(6.0f), gl.L(6.0f), paint);
        rectF.set(f5 - gl.N(1.5f), f7, gl.N(1.5f) + f5, f8);
        canvas.drawRoundRect(rectF, gl.L(6.0f), gl.L(6.0f), paint2);
    }

    @Override // android.view.View
    public final void computeScroll() {
        kr9 kr9Var = this.X0;
        if (!kr9Var.b()) {
            if (this.s1) {
                this.s1 = false;
                eob eobVar = this.a;
                if (eobVar != null) {
                    eobVar.m0(false);
                    return;
                }
                return;
            }
            return;
        }
        int i = kr9Var.j;
        long min = Math.min(getBaseDuration(), getMaxScrollDuration());
        if (this.r1) {
            this.f = (long) Math.max(0.0f, (((i - this.z1) - this.y1) / this.v1) * min);
        } else {
            if (!this.Q) {
                kr9Var.a();
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
        RectF rectF = gl.P;
        rectF.set(f3 - gl.L(10.0f), f, gl.L(10.0f) + f4, f2);
        canvas.saveLayerAlpha(0.0f, 0.0f, this.w1, this.x1, kk7.d4, 31);
        int i = (int) (255.0f * f5);
        Paint paint2 = this.A0;
        paint2.setAlpha(i);
        canvas.drawRoundRect(rectF, gl.L(6.0f), gl.L(6.0f), paint2);
        rectF.inset(gl.L(this.Y0 ? 2.5f : 10.0f), gl.L(2.0f));
        boolean z = this.Y0;
        Paint paint3 = this.B0;
        if (z) {
            canvas.drawRoundRect(rectF, gl.L(3.0f), gl.L(3.0f), paint3);
        } else {
            canvas.drawRect(rectF, paint3);
        }
        float L = gl.L(2.0f);
        float L2 = gl.L(10.0f);
        Paint paint4 = this.C0;
        Paint paint5 = paint != null ? paint : paint4;
        paint4.setAlpha(kk7.d4);
        paint5.setAlpha(i);
        float f6 = f + f2;
        float f7 = (f6 - L2) / 2.0f;
        float f8 = (f6 + L2) / 2.0f;
        rectF.set(tb4.x(gl.L(this.Y0 ? 2.0f : 10.0f), L, 2.0f, f3), f7, f3 - ((gl.L(this.Y0 ? 2.0f : 10.0f) + L) / 2.0f), f8);
        if (!this.Y0) {
            canvas.drawRoundRect(rectF, gl.L(1.0f), gl.L(1.0f), paint5);
            if (paint != null && !this.Y0) {
                paint4.setAlpha((int) (f5 * 48.0f));
                canvas.drawRoundRect(rectF, gl.L(1.0f), gl.L(1.0f), paint4);
            }
        }
        rectF.set(oo1.z(gl.L(this.Y0 ? 2.5f : 10.0f), L, 2.0f, f4), f7, tb4.e(gl.L(this.Y0 ? 2.5f : 10.0f), L, 2.0f, f4), f8);
        if (!this.Y0) {
            canvas.drawRoundRect(rectF, gl.L(1.0f), gl.L(1.0f), paint5);
            if (paint != null) {
                paint4.setAlpha((int) (f5 * 48.0f));
                canvas.drawRoundRect(rectF, gl.L(1.0f), gl.L(1.0f), paint4);
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
        fob fobVar;
        fob fobVar2;
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
        kob kobVar;
        float e;
        float f29;
        float f30;
        float f31;
        fob fobVar3;
        long j;
        float f32;
        float R1;
        float y;
        long j2;
        float f33;
        boolean z3;
        float f34;
        sl0 sl0Var;
        float A;
        float f35;
        float f36;
        float f37;
        int i5;
        int i6;
        float f38;
        boolean z4;
        int i7;
        boolean z5;
        int i8;
        Paint paint2;
        float f39;
        float A2;
        float f40;
        float f41;
        float f42;
        Paint paint3;
        long j3;
        float f43;
        float f44;
        float f45;
        int i9;
        boolean z6;
        boolean z7;
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
        sl0 sl0Var2;
        kob kobVar2 = this;
        Paint c = kobVar2.m0.c(1.0f);
        float d2 = kobVar2.j0.d(kobVar2.k0);
        long min = Math.min(kobVar2.getBaseDuration(), kobVar2.getMaxScrollDuration());
        if (d2 < 1.0f) {
            f2 = 1.0f;
            kobVar2.p0.set(kobVar2.z1, (kobVar2.x1 - kobVar2.A1) - gl.L(28.0f), kobVar2.w1 - kobVar2.z1, kobVar2.x1 - kobVar2.A1);
            kobVar2.q0.rewind();
            kobVar2.q0.addRoundRect(kobVar2.p0, gl.L(8.0f), gl.L(8.0f), Path.Direction.CW);
            canvas.saveLayerAlpha(kobVar2.p0, (int) ((1.0f - d2) * 255.0f), 31);
            canvas.clipPath(kobVar2.q0);
            if (kobVar2.l0.c()) {
                kobVar2.m0.a(canvas);
                canvas.drawColor(855638016);
            } else if (c == null) {
                canvas.drawColor(TLObject.FLAG_30);
            } else {
                canvas.drawRect(kobVar2.p0, c);
                canvas.drawColor(855638016);
            }
            if (!kobVar2.r.isEmpty() && (sl0Var2 = kobVar2.l0) != null && sl0Var2.c()) {
                float e2 = kobVar2.i0.e(false, job.c(kobVar2.r));
                job jobVar = kobVar2.t0;
                RectF rectF = kobVar2.p0;
                jobVar.a((((kobVar2.R - kobVar2.f) / min) * kobVar2.v1) + kobVar2.z1 + kobVar2.y1, rectF.left, rectF.right, gl.L(28.0f), e2, kobVar2.p0.bottom, kobVar2.r);
                canvas.saveLayerAlpha(kobVar2.p0, kk7.m1, 31);
                canvas.clipPath(kobVar2.t0);
                kobVar2.o0.a(canvas);
                canvas.restore();
            } else if (!kobVar2.r.isEmpty()) {
                Paint c2 = kobVar2.o0.c(0.4f);
                if (c2 == null) {
                    c2 = kobVar2.I0;
                    c2.setAlpha(64);
                }
                float e3 = kobVar2.i0.e(false, job.c(kobVar2.r));
                f = d2;
                job jobVar2 = kobVar2.t0;
                RectF rectF2 = kobVar2.p0;
                jobVar2.a((((kobVar2.R - kobVar2.f) / min) * kobVar2.v1) + kobVar2.z1 + kobVar2.y1, rectF2.left, rectF2.right, gl.L(28.0f), e3, kobVar2.p0.bottom, kobVar2.r);
                canvas.drawPath(kobVar2.t0, c2);
                float L = ((kobVar2.r0.c + gl.L(3.66f)) + kobVar2.s0.getIntrinsicWidth()) / 2.0f;
                int centerX = (int) (kobVar2.p0.centerX() - L);
                int centerY = (int) kobVar2.p0.centerY();
                Drawable drawable = kobVar2.s0;
                drawable.setBounds(centerX, oo1.y(2, centerY, drawable), kobVar2.s0.getIntrinsicWidth() + centerX, oo1.i(2, centerY, kobVar2.s0));
                kobVar2.s0.setAlpha(kk7.U2);
                kobVar2.s0.draw(canvas);
                z = false;
                kobVar2.r0.c(gl.L(3.66f) + (kobVar2.p0.centerX() - L) + kobVar2.s0.getIntrinsicWidth(), centerY, 0.75f, -1, canvas);
                canvas.restore();
            }
            f = d2;
            float L2 = ((kobVar2.r0.c + gl.L(3.66f)) + kobVar2.s0.getIntrinsicWidth()) / 2.0f;
            int centerX2 = (int) (kobVar2.p0.centerX() - L2);
            int centerY2 = (int) kobVar2.p0.centerY();
            Drawable drawable2 = kobVar2.s0;
            drawable2.setBounds(centerX2, oo1.y(2, centerY2, drawable2), kobVar2.s0.getIntrinsicWidth() + centerX2, oo1.i(2, centerY2, kobVar2.s0));
            kobVar2.s0.setAlpha(kk7.U2);
            kobVar2.s0.draw(canvas);
            z = false;
            kobVar2.r0.c(gl.L(3.66f) + (kobVar2.p0.centerX() - L2) + kobVar2.s0.getIntrinsicWidth(), centerY2, 0.75f, -1, canvas);
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
                canvas2.saveLayerAlpha(0.0f, 0.0f, kobVar2.getWidth(), kobVar2.getHeight(), (int) (f * 255.0f), 31);
                z2 = true;
            } else {
                f4 = 0.0f;
                canvas2 = canvas;
                z2 = z;
            }
            fob fobVar4 = kobVar2.h;
            float f52 = fobVar4 != null ? f2 : f4;
            float d3 = fobVar4 != null ? fobVar4.k.d((kobVar2.Q || kobVar2.H) ? z : true) : f4;
            float f53 = kobVar2.x1 - kobVar2.A1;
            float L3 = gl.L(4.0f);
            if (kobVar2.h != null) {
                canvas2.save();
                float videoHeight = kobVar2.getVideoHeight();
                fob fobVar5 = kobVar2.h;
                float f54 = fobVar5.g;
                long j4 = fobVar5.e;
                float f55 = j4;
                f10 = b00.w(f54, f55, d3, f4);
                float w = b00.w(fobVar5.h, f55, d3, f4);
                if (j4 <= 0) {
                    f5 = d3;
                    f6 = f52;
                    f46 = f4;
                    f8 = f46;
                } else {
                    f8 = f4;
                    f5 = d3;
                    f6 = f52;
                    f46 = (kobVar2.z1 + kobVar2.y1) - ((kobVar2.f / min) * kobVar2.v1);
                }
                float f56 = kobVar2.y1;
                float f57 = f46 - f56;
                if (j4 <= 0) {
                    f7 = L3;
                    f11 = w;
                    f47 = f8;
                } else {
                    f7 = L3;
                    f11 = w;
                    f47 = kobVar2.z1 + r3 + (((j4 - kobVar2.f) / min) * kobVar2.v1);
                }
                kobVar2.u0.set(f57, f53 - videoHeight, f47 + f56, f53);
                float f58 = f53 - ((f7 * f6) + videoHeight);
                RectF rectF3 = kobVar2.u0;
                float f59 = (rectF3.top * f5) + f8;
                float f60 = (rectF3.bottom * f5) + f8;
                kobVar2.w0.rewind();
                kobVar2.w0.addRoundRect(kobVar2.u0, gl.L(8.0f), gl.L(8.0f), Path.Direction.CW);
                canvas2.clipPath(kobVar2.w0);
                iob iobVar = kobVar2.h.c;
                if (iobVar != null) {
                    int i15 = iobVar.f;
                    float f61 = i15;
                    int max2 = (int) Math.max(0.0d, Math.floor((f57 - kobVar2.z1) / f61));
                    int min2 = (int) Math.min(kobVar2.h.c.c, Math.ceil(((r3 - f57) - kobVar2.z1) / f61) + 1.0d);
                    int i16 = (int) kobVar2.u0.top;
                    boolean z8 = kobVar2.h.c.d.size() >= min2;
                    boolean z9 = (i15 == 0 || !z8 || kobVar2.h.b) ? false : true;
                    f48 = f58;
                    if (z9) {
                        int i17 = max2;
                        while (true) {
                            if (i17 >= Math.min(kobVar2.h.c.d.size(), min2)) {
                                break;
                            }
                            if (((hob) kobVar2.h.c.d.get(i17)).a == null) {
                                z9 = false;
                                break;
                            }
                            i17++;
                        }
                    }
                    if (!z9) {
                        if (kobVar2.l0.c()) {
                            kobVar2.m0.a(canvas2);
                            canvas2.drawColor(855638016);
                        } else if (c == null) {
                            canvas2.drawColor(TLObject.FLAG_30);
                        } else {
                            canvas2.drawRect(kobVar2.u0, c);
                            canvas2.drawColor(855638016);
                        }
                    }
                    if (i15 != 0) {
                        float f62 = f57;
                        int i18 = max2;
                        while (i18 < Math.min(kobVar2.h.c.d.size(), min2)) {
                            hob hobVar = (hob) kobVar2.h.c.d.get(i18);
                            int i19 = min2;
                            if (hobVar.a != null) {
                                i14 = i18;
                                f50 = f60;
                                f51 = f59;
                                kobVar2.v0.setAlpha((int) (hobVar.b.e(false, f2) * 255.0f));
                                canvas2.drawBitmap(hobVar.a, f62, i16 - ((int) ((r2.getHeight() - videoHeight) / 2.0f)), kobVar2.v0);
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
                    if (!z8) {
                        kobVar2.h.c.b();
                    }
                } else {
                    f48 = f58;
                    f13 = f60;
                    f14 = f59;
                    f9 = 2.0f;
                }
                kobVar2.x0.rewind();
                if (!kobVar2.Y0) {
                    RectF rectF4 = gl.P;
                    int i20 = kobVar2.z1;
                    int i21 = kobVar2.y1;
                    float f63 = i20 + i21;
                    fob fobVar6 = kobVar2.h;
                    float f64 = fobVar6.g;
                    float f65 = fobVar6.e;
                    int i22 = i21;
                    float f66 = kobVar2.f;
                    float f67 = (f64 * f65) - f66;
                    float f68 = min;
                    float f69 = kobVar2.v1;
                    float f70 = ((f67 / f68) * f69) + f63;
                    if (f64 <= f8) {
                        f49 = f69;
                        i13 = i22;
                    } else {
                        f49 = f69;
                        i13 = 0;
                    }
                    float f71 = f70 - i13;
                    float f72 = kobVar2.x1 - kobVar2.A1;
                    float f73 = f72 - videoHeight;
                    float f74 = fobVar6.h;
                    float f75 = ((((f65 * f74) - f66) / f68) * f49) + f63;
                    if (f74 < 1.0f) {
                        i22 = 0;
                    }
                    rectF4.set(f71, f73, f75 + i22, f72);
                    kobVar2.x0.addRoundRect(rectF4, kobVar2.u1, Path.Direction.CW);
                    canvas2.clipPath(kobVar2.x0, Region.Op.DIFFERENCE);
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
            if (kobVar2.s.isEmpty()) {
                f15 = f7;
                f16 = 0.0f;
            } else {
                kobVar2.getCollageHeight();
                int i23 = 0;
                while (i23 < kobVar2.s.size()) {
                    fob fobVar7 = (fob) kobVar2.s.get(i23);
                    float d4 = fobVar7.k.d((kobVar2.Q || kobVar2.H || kobVar2.n != i23) ? false : true);
                    fob fobVar8 = kobVar2.w;
                    int i24 = kobVar2.z1;
                    int i25 = kobVar2.y1;
                    if (fobVar7 != fobVar8) {
                        i8 = i23;
                        float f76 = min;
                        float R12 = ((((gl.R1(fobVar7.g, f8, d4) * fobVar7.e) + (fobVar7.f - kobVar2.f)) / f76) * kobVar2.v1) + i24 + i25;
                        paint2 = c;
                        A2 = (b00.y(gl.R1(fobVar7.h, 1.0f, d4), fobVar7.e, fobVar7.f - kobVar2.f, f76) * kobVar2.v1) + kobVar2.z1 + kobVar2.y1;
                        f39 = f7;
                        f40 = R12;
                    } else {
                        i8 = i23;
                        float f77 = f7;
                        paint2 = c;
                        float f78 = i24 + i25;
                        long j5 = fobVar7.f - kobVar2.f;
                        float f79 = min;
                        f39 = f77;
                        float f80 = kobVar2.v1;
                        float f81 = ((j5 / f79) * f80) + f78;
                        A2 = b00.A(j5 + fobVar7.e, f79, f80, f78);
                        f40 = f81;
                    }
                    canvas2.save();
                    float U1 = gl.U1(d4, gl.L(28.0f), gl.L(38.0f));
                    RectF rectF5 = fobVar7.j;
                    float f82 = kobVar2.y1;
                    rectF5.set(f40 - f82, f53 - U1, A2 + f82, f53);
                    RectF rectF6 = fobVar7.j;
                    f14 = (rectF6.top * d4) + f14;
                    f13 = (rectF6.bottom * d4) + f13;
                    float f83 = fobVar7.f;
                    float f84 = fobVar7.g;
                    float f85 = fobVar7.e;
                    float g = oo1.g(f84, f85, f83, d4, f10);
                    f11 = oo1.g(fobVar7.h, f85, f83, d4, f11);
                    kobVar2.y.rewind();
                    kobVar2.y.addRoundRect(fobVar7.j, gl.L(8.0f), gl.L(8.0f), Path.Direction.CW);
                    canvas2.clipPath(kobVar2.y);
                    iob iobVar2 = fobVar7.c;
                    if (iobVar2 != null) {
                        long j6 = fobVar7.e;
                        if (j6 <= 0) {
                            f41 = f53;
                            j3 = j6;
                            f43 = 0.0f;
                        } else {
                            f41 = f53;
                            j3 = j6;
                            f43 = (((fobVar7.f - kobVar2.f) / min) * kobVar2.v1) + kobVar2.z1 + kobVar2.y1;
                        }
                        float f86 = f43 - kobVar2.y1;
                        if (j6 <= 0) {
                            f44 = f86;
                            f45 = 0.0f;
                        } else {
                            f44 = f86;
                            f45 = ((((fobVar7.f + j3) - kobVar2.f) / min) * kobVar2.v1) + kobVar2.z1 + r5;
                        }
                        int i26 = iobVar2.f;
                        float f87 = i26;
                        int max3 = (int) Math.max(0.0d, Math.floor((f44 - ((((fobVar7.f - kobVar2.f) / min) * kobVar2.v1) + (kobVar2.z1 + kobVar2.y1))) / f87));
                        f42 = g;
                        int min3 = (int) Math.min(fobVar7.c.c, Math.ceil(((f45 + r6) - f44) / f87) + 1.0d);
                        int i27 = (int) fobVar7.j.top;
                        boolean z10 = fobVar7.c.d.size() >= min3;
                        if (z10) {
                            int i28 = max3;
                            i9 = i28;
                            while (i28 < Math.min(fobVar7.c.d.size(), min3)) {
                                if (((hob) fobVar7.c.d.get(i28)).a == null) {
                                    z6 = false;
                                    break;
                                }
                                i28++;
                            }
                        } else {
                            i9 = max3;
                        }
                        z6 = z10;
                        if (!z6) {
                            if (kobVar2.l0.c()) {
                                kobVar2.m0.a(canvas2);
                                canvas2.drawColor(855638016);
                            } else if (paint2 == null) {
                                canvas2.drawColor(TLObject.FLAG_30);
                            } else {
                                z7 = z10;
                                paint3 = paint2;
                                canvas2.drawRect(fobVar7.j, paint3);
                                canvas2.drawColor(855638016);
                                if (i26 != 0) {
                                    int i29 = i9;
                                    while (i29 < Math.min(fobVar7.c.d.size(), min3)) {
                                        hob hobVar2 = (hob) fobVar7.c.d.get(i29);
                                        if (hobVar2.a != null) {
                                            i10 = i29;
                                            i11 = min3;
                                            i12 = i27;
                                            kobVar2.x.setAlpha((int) (hobVar2.b.e(false, 1.0f) * 255.0f));
                                            canvas2.drawBitmap(hobVar2.a, f44, i12 - ((int) ((r3.getHeight() - U1) / f9)), kobVar2.x);
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
                                if (!z7) {
                                    fobVar7.c.b();
                                }
                            }
                        }
                        z7 = z10;
                        paint3 = paint2;
                        if (i26 != 0) {
                        }
                        if (!z7) {
                        }
                    } else {
                        f41 = f53;
                        f42 = g;
                        paint3 = paint2;
                    }
                    kobVar2.E.rewind();
                    if (!kobVar2.Y0) {
                        RectF rectF7 = gl.P;
                        int i30 = kobVar2.z1;
                        int i31 = kobVar2.y1;
                        float f88 = i30 + i31;
                        float f89 = fobVar7.g;
                        int i32 = i31;
                        float f90 = fobVar7.e;
                        float f91 = f89 * f90;
                        float f92 = kobVar2.f;
                        float f93 = f91 - f92;
                        float f94 = fobVar7.f;
                        float f95 = f93 + f94;
                        float f96 = min;
                        float f97 = f95 / f96;
                        float f98 = kobVar2.v1;
                        float f99 = ((f97 * f98) + f88) - (f89 <= 0.0f ? i32 : 0);
                        RectF rectF8 = fobVar7.j;
                        float f100 = rectF8.top;
                        float f101 = fobVar7.h;
                        float f102 = (((((f90 * f101) - f92) + f94) / f96) * f98) + f88;
                        if (f101 < 1.0f) {
                            i32 = 0;
                        }
                        rectF7.set(f99, f100, f102 + i32, rectF8.bottom);
                        kobVar2.E.addRoundRect(rectF7, kobVar2.u1, Path.Direction.CW);
                        canvas2.clipPath(kobVar2.E, Region.Op.DIFFERENCE);
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
            float d5 = kobVar2.d0.d(kobVar2.F);
            float d6 = kobVar2.e0.d(kobVar2.F && kobVar2.H);
            float roundHeight = kobVar2.getRoundHeight() * d5;
            float f103 = ((kobVar2.h == null && !kobVar2.O && kobVar2.s.isEmpty()) ? 1.0f : d6) * d5;
            if (d5 > 0.0f) {
                long j7 = kobVar2.J;
                float f104 = j7;
                float f105 = kobVar2.K;
                f18 = f16;
                float f106 = kobVar2.I;
                float g2 = oo1.g(f105, f106, f104, f103, f10);
                f11 = oo1.g(kobVar2.L, f106, f104, f103, f11);
                fob fobVar9 = kobVar2.h;
                int i33 = kobVar2.z1;
                int i34 = kobVar2.y1;
                if (fobVar9 != null) {
                    float f107 = min;
                    float R13 = ((((gl.R1(f105, 0.0f, d6) * kobVar2.I) + (j7 - kobVar2.f)) / f107) * kobVar2.v1) + i33 + i34;
                    f17 = d6;
                    A = (b00.y(gl.R1(kobVar2.L, 1.0f, d6), kobVar2.I, kobVar2.J - kobVar2.f, f107) * kobVar2.v1) + kobVar2.z1 + kobVar2.y1;
                    f35 = R13;
                } else {
                    f17 = d6;
                    float f108 = i33 + i34;
                    long j8 = j7 - kobVar2.f;
                    float f109 = min;
                    float f110 = kobVar2.v1;
                    float f111 = ((j8 / f109) * f110) + f108;
                    A = b00.A(j8 + r12, f109, f110, f108);
                    f35 = f111;
                }
                RectF rectF9 = kobVar2.y0;
                float f112 = kobVar2.y1;
                rectF9.set(f35 - f112, f53 - roundHeight, A + f112, f53);
                float f113 = f53 - ((f15 * d5) + roundHeight);
                RectF rectF10 = kobVar2.y0;
                f14 = (rectF10.top * f103) + f14;
                f13 = (rectF10.bottom * f103) + f13;
                kobVar2.z0.rewind();
                kobVar2.z0.addRoundRect(kobVar2.y0, gl.L(8.0f), gl.L(8.0f), Path.Direction.CW);
                canvas2.save();
                canvas2.clipPath(kobVar2.z0);
                iob iobVar3 = kobVar2.N;
                if (iobVar3 != null) {
                    int i35 = (kobVar2.I > 0L ? 1 : (kobVar2.I == 0L ? 0 : -1));
                    if (i35 <= 0) {
                        i6 = i35;
                        f36 = f113;
                        f38 = 0.0f;
                    } else {
                        i6 = i35;
                        f36 = f113;
                        f38 = (((kobVar2.J - kobVar2.f) / min) * kobVar2.v1) + kobVar2.z1 + kobVar2.y1;
                    }
                    float f114 = kobVar2.y1;
                    float f115 = f38 - f114;
                    float f116 = (i6 <= 0 ? 0.0f : kobVar2.z1 + r4 + ((((kobVar2.J + r7) - kobVar2.f) / min) * kobVar2.v1)) + f114;
                    int i36 = iobVar3.f;
                    float f117 = f115 - (kobVar2.h != null ? (((kobVar2.J - kobVar2.f) / min) * kobVar2.v1) + (r7 + kobVar2.y1) : kobVar2.z1);
                    float f118 = i36;
                    int max4 = (int) Math.max(0.0d, Math.floor(f117 / f118));
                    int min4 = (int) Math.min(kobVar2.N.c, Math.ceil((f116 - f115) / f118) + 1.0d);
                    int i37 = (int) kobVar2.y0.top;
                    boolean z11 = kobVar2.N.d.size() >= min4;
                    if (z11) {
                        for (int i38 = max4; i38 < Math.min(kobVar2.N.d.size(), min4); i38++) {
                            if (((hob) kobVar2.N.d.get(i38)).a == null) {
                                z4 = false;
                                break;
                            }
                        }
                    }
                    z4 = z11;
                    if (!z4) {
                        if (kobVar2.l0.c()) {
                            kobVar2.m0.a(canvas2);
                            canvas2.drawColor(855638016);
                        } else if (paint4 == null) {
                            canvas2.drawColor(TLObject.FLAG_30);
                        } else {
                            canvas2.drawRect(kobVar2.y0, paint4);
                            canvas2.drawColor(855638016);
                        }
                    }
                    if (i36 != 0) {
                        float f119 = f115;
                        while (max4 < Math.min(kobVar2.N.d.size(), min4)) {
                            hob hobVar3 = (hob) kobVar2.N.d.get(max4);
                            if (hobVar3.a != null) {
                                i7 = min4;
                                z5 = z11;
                                kobVar2.v0.setAlpha((int) (hobVar3.b.e(false, 1.0f) * 255.0f));
                                canvas2.drawBitmap(hobVar3.a, f119, i37 - ((int) ((r2.getHeight() - roundHeight) / f9)), kobVar2.v0);
                            } else {
                                i7 = min4;
                                z5 = z11;
                            }
                            f119 += f118;
                            max4++;
                            min4 = i7;
                            z11 = z5;
                        }
                    }
                    if (!z11) {
                        kobVar2.N.b();
                    }
                } else {
                    f36 = f113;
                }
                kobVar2.x0.rewind();
                RectF rectF11 = gl.P;
                int i39 = kobVar2.z1;
                int i40 = kobVar2.y1;
                float f120 = i39 + i40;
                float f121 = kobVar2.K;
                float f122 = kobVar2.I;
                float f123 = kobVar2.f;
                float f124 = kobVar2.J;
                float f125 = ((f121 * f122) - f123) + f124;
                float f126 = min;
                float f127 = kobVar2.v1;
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
                RectF rectF12 = kobVar2.y0;
                float f131 = rectF12.top;
                float f132 = kobVar2.L;
                rectF11.set(f130, f131, (((((f122 * f132) - f123) + f124) / f126) * f37) + f120 + (f132 >= 1.0f ? i40 : 0) + f129, rectF12.bottom);
                kobVar2.x0.addRoundRect(rectF11, kobVar2.u1, Path.Direction.CW);
                canvas2.clipPath(kobVar2.x0, Region.Op.DIFFERENCE);
                canvas2.drawColor(1342177280);
                canvas2.restore();
                f53 = f36;
                f10 = g2;
            } else {
                f17 = d6;
                f18 = f16;
            }
            float d7 = kobVar2.f0.d(kobVar2.O);
            float d8 = kobVar2.g0.d(kobVar2.O && kobVar2.Q);
            float audioHeight = kobVar2.getAudioHeight() * d7;
            float f133 = ((kobVar2.h == null && !kobVar2.F && kobVar2.s.isEmpty()) ? 1.0f : d8) * d7;
            if (d7 > 0.0f) {
                float f134 = kobVar2.R;
                float f135 = kobVar2.T;
                float f136 = kobVar2.S;
                float g3 = oo1.g(f135, f136, f134, f133, f10);
                float g4 = oo1.g(kobVar2.U, f136, f134, f133, f11);
                Paint c3 = kobVar2.n0.c(d7);
                canvas2.save();
                if (kobVar2.h == null && !kobVar2.F && kobVar2.s.isEmpty()) {
                    float f137 = kobVar2.z1 + kobVar2.y1;
                    paint = paint4;
                    long j9 = kobVar2.R - kobVar2.f;
                    float f138 = min;
                    float f139 = kobVar2.v1;
                    y = b00.A(j9 + kobVar2.S, f138, f139, f137);
                    R1 = ((j9 / f138) * f139) + f137;
                    f32 = d8;
                } else {
                    paint = paint4;
                    float f140 = min;
                    f32 = d8;
                    R1 = kobVar2.z1 + kobVar2.y1 + ((((gl.R1(kobVar2.T, 0.0f, d8) * kobVar2.S) + (kobVar2.R - kobVar2.f)) / f140) * kobVar2.v1);
                    y = (b00.y(gl.R1(kobVar2.U, 1.0f, d8), kobVar2.S, kobVar2.R - kobVar2.f, f140) * kobVar2.v1) + kobVar2.z1 + kobVar2.y1;
                }
                RectF rectF13 = kobVar2.G0;
                float f141 = kobVar2.y1;
                rectF13.set(R1 - f141, f53 - audioHeight, f141 + y, f53);
                RectF rectF14 = kobVar2.G0;
                f14 = (rectF14.top * f133) + f14;
                f13 = (rectF14.bottom * f133) + f13;
                kobVar2.H0.rewind();
                kobVar2.H0.addRoundRect(kobVar2.G0, gl.L(8.0f), gl.L(8.0f), Path.Direction.CW);
                canvas2.clipPath(kobVar2.H0);
                sl0 sl0Var3 = kobVar2.l0;
                if (sl0Var3 != null && sl0Var3.c()) {
                    kobVar2.m0.a(canvas2);
                    canvas2.drawColor(bkb.p1(d7, 855638016));
                } else if (c3 == null) {
                    canvas2.drawColor(bkb.p1(d7, TLObject.FLAG_30));
                } else {
                    canvas2.drawRect(kobVar2.G0, c3);
                    canvas2.drawColor(bkb.p1(d7, 855638016));
                }
                if (kobVar2.b0 == null || (sl0Var = kobVar2.l0) == null || !sl0Var.c()) {
                    j2 = min;
                    f33 = f32;
                    z3 = true;
                    if (kobVar2.b0 != null && c3 != null) {
                        Paint c4 = kobVar2.o0.c(d7 * 0.4f);
                        if (c4 == null) {
                            c4 = kobVar2.I0;
                            c4.setAlpha((int) (64.0f * d7));
                        }
                        float e4 = kobVar2.h0.e(!kobVar2.V, kobVar2.b0.e);
                        dob dobVar = kobVar2.b0;
                        kobVar2.V = dobVar.c > 0;
                        kobVar2.J0.b((((kobVar2.R - kobVar2.f) / j2) * kobVar2.v1) + kobVar2.z1 + kobVar2.y1, R1, y, f33, j2, audioHeight, e4, kobVar2.G0.bottom, dobVar);
                        min = j2;
                        canvas2.drawPath(kobVar2.J0, c4);
                        if (f33 >= 1.0f) {
                            int i41 = kobVar2.z1;
                            float f142 = kobVar2.y1 + i41;
                            float f143 = kobVar2.R - kobVar2.f;
                            float f144 = kobVar2.T;
                            float f145 = kobVar2.S;
                            float f146 = min;
                            float f147 = kobVar2.v1;
                            float f148 = ((((f144 * f145) + f143) / f146) * f147) + f142;
                            float f149 = ((((kobVar2.U * f145) + f143) / f146) * f147) + f142;
                            float min5 = (Math.min(kobVar2.w1 - kobVar2.z1, f149) + Math.max(i41, f148)) / f9;
                            float centerY3 = kobVar2.G0.centerY();
                            float max5 = Math.max(0.0f, (Math.min(kobVar2.w1 - kobVar2.z1, f149) - Math.max(kobVar2.z1, f148)) - gl.L(24.0f));
                            float N = gl.N(13.0f) + ((kobVar2.N0 == null && kobVar2.R0 == null) ? 0.0f : kobVar2.S0 + gl.N(9.66f) + gl.N(3.11f) + kobVar2.O0);
                            boolean z12 = N < max5 ? z3 : false;
                            float min6 = min5 - (Math.min(N, max5) / f9);
                            kobVar2.L0.setBounds((int) min6, (int) (centerY3 - (gl.L(13.0f) / f9)), (int) (gl.L(13.0f) + min6), (int) ((gl.L(13.0f) / f9) + centerY3));
                            float f150 = 1.0f - f33;
                            float f151 = f150 * 255.0f;
                            kobVar2.L0.setAlpha((int) f151);
                            kobVar2.L0.draw(canvas2);
                            float N2 = gl.N(16.11f) + min6;
                            f19 = d7;
                            boolean z13 = z12;
                            f22 = f5;
                            f23 = 0.0f;
                            d = 0.0d;
                            f20 = f33;
                            f21 = f6;
                            canvas2.saveLayerAlpha(0.0f, 0.0f, kobVar2.w1, kobVar2.x1, kk7.d4, 31);
                            float min7 = Math.min(f149, kobVar2.w1) - gl.L(12.0f);
                            canvas2.clipRect(N2, 0.0f, min7, kobVar2.x1);
                            if (kobVar2.N0 != null) {
                                canvas2.save();
                                de9.n(kobVar2.N0.getHeight(), 2.0f, centerY3, N2 - kobVar2.P0, canvas2);
                                kobVar2.M0.setAlpha((int) (f151 * f19));
                                kobVar2.N0.draw(canvas2);
                                canvas2.restore();
                                f34 = kobVar2.O0 + N2;
                            } else {
                                f34 = N2;
                            }
                            if (kobVar2.N0 != null && kobVar2.R0 != null) {
                                float N3 = gl.N(3.66f) + f34;
                                int alpha = kobVar2.K0.getAlpha();
                                kobVar2.K0.setAlpha((int) (alpha * f150));
                                canvas2.drawCircle(gl.L(1.0f) + N3, centerY3, gl.L(1.0f), kobVar2.K0);
                                kobVar2.K0.setAlpha(alpha);
                                f34 = gl.N(2.0f) + N3 + gl.N(4.0f);
                            }
                            if (kobVar2.R0 != null) {
                                canvas2.save();
                                de9.n(kobVar2.R0.getHeight(), 2.0f, centerY3, f34 - kobVar2.T0, canvas2);
                                kobVar2.Q0.setAlpha((int) (f151 * f19));
                                kobVar2.R0.draw(canvas2);
                                canvas2.restore();
                            }
                            if (!z13) {
                                kobVar2.V0.reset();
                                kobVar2.V0.postScale(gl.N(8.0f) / 16.0f, 1.0f);
                                kobVar2.V0.postTranslate(min7 - gl.L(8.0f), 0.0f);
                                kobVar2.U0.setLocalMatrix(kobVar2.V0);
                                RectF rectF15 = kobVar2.G0;
                                canvas2.drawRect(min7 - gl.L(8.0f), rectF15.top, min7, rectF15.bottom, kobVar2.W0);
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
                    z3 = true;
                    float e5 = kobVar2.h0.e(!kobVar2.V, kobVar2.b0.e);
                    dob dobVar2 = kobVar2.b0;
                    kobVar2.V = dobVar2.c > 0;
                    f33 = f32;
                    kobVar2.J0.b((((kobVar2.R - kobVar2.f) / min) * kobVar2.v1) + kobVar2.z1 + kobVar2.y1, R1, y, f33, min, audioHeight, e5, kobVar2.G0.bottom, dobVar2);
                    j2 = min;
                    canvas2.saveLayerAlpha(kobVar2.G0, kk7.m1, 31);
                    canvas2.clipPath(kobVar2.J0);
                    kobVar2.o0.a(canvas2);
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
            float f154 = kobVar2.z1 + kobVar2.y1;
            float f155 = kobVar2.f;
            float f156 = min;
            float f157 = kobVar2.v1;
            float f158 = (((f10 - f155) / f156) * f157) + f154;
            float f159 = (((f11 - f155) / f156) * f157) + f154;
            if (!kobVar2.s.isEmpty()) {
                f25 = f23;
                f26 = d5;
                f24 = f19;
                f19 = f18;
            } else if (kobVar2.O && kobVar2.h == null) {
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
                if (kobVar2.h == null && !kobVar2.F && kobVar2.s.isEmpty()) {
                    f27 = f20;
                    f28 = f24 * gl.R1(0.6f, 1.0f, f27);
                } else {
                    f27 = f20;
                    f28 = 1.0f;
                }
                Paint paint5 = paint;
                kobVar2.d(canvas, paint5, f153, f152, f158, f159, f28 * f19);
                fob fobVar10 = kobVar2.h;
                if (fobVar10 != null && ((kobVar2.O || kobVar2.F) && (f27 > f25 || f17 > f25))) {
                    float f161 = kobVar2.x1 - kobVar2.A1;
                    float f162 = kobVar2.y1 + kobVar2.z1;
                    float f163 = fobVar10.g;
                    float f164 = fobVar10.e;
                    float f165 = kobVar2.f;
                    float f166 = kobVar2.v1;
                    float f167 = ((((fobVar10.h * f164) - f165) / f156) * f166) + f162;
                    canvas3 = canvas;
                    kobVar2.d(canvas3, paint5, f161 - f12, f161, ((((f163 * f164) - f165) / f156) * f166) + f162, f167, 0.8f);
                } else if (kobVar2.w != null) {
                    i4 = 1;
                    if (kobVar2.s.size() > 1) {
                        fob fobVar11 = kobVar2.w;
                        RectF rectF16 = fobVar11.j;
                        float f168 = rectF16.top;
                        float f169 = rectF16.bottom;
                        float f170 = kobVar2.y1 + kobVar2.z1;
                        float f171 = fobVar11.f;
                        float f172 = fobVar11.g;
                        float f173 = fobVar11.e;
                        float f174 = kobVar2.f;
                        float f175 = kobVar2.v1;
                        float f176 = (((((f172 * f173) + f171) - f174) / f156) * f175) + f170;
                        float f177 = (((((fobVar11.h * f173) + f171) - f174) / f156) * f175) + f170;
                        canvas3 = canvas;
                        kobVar2.d(canvas3, paint5, f168, f169, f176, f177, 0.8f);
                    } else {
                        canvas3 = canvas;
                    }
                    kobVar = kobVar2;
                    if (kobVar.c0 > i4 && (fobVar3 = kobVar.h) != null) {
                        float f178 = fobVar3.e;
                        float f179 = fobVar3.h;
                        float f180 = fobVar3.g;
                        j = (long) ((f179 - f180) * f178);
                        if (j > 68999) {
                            float f181 = kobVar.z1 + kobVar.y1;
                            i = i4;
                            float f182 = kobVar.f;
                            float f183 = kobVar.v1;
                            float f184 = ((((f180 * f178) - f182) / f156) * f183) + f181;
                            float f185 = ((((f179 * f178) - f182) / f156) * f183) + f181;
                            canvas3.save();
                            float f186 = kobVar.x1 - kobVar.A1;
                            canvas3.clipRect(f184, f186 - f12, f185, f186);
                            kobVar.A0.setAlpha((int) (gl.R1(0.8f, 1.0f, f22) * 255.0f));
                            long j10 = 59000;
                            int min8 = (int) Math.min(kobVar.c0 - 1, j / 59000);
                            int i42 = i;
                            while (i42 <= min8) {
                                if (Math.min(j10, j - (i42 * j10)) < 1000) {
                                    break;
                                }
                                float f187 = kobVar.z1 + kobVar.y1;
                                fob fobVar12 = kobVar.h;
                                float f188 = ((((((long) (fobVar12.e * fobVar12.g)) + r2) - kobVar.f) / f156) * kobVar.v1) + f187;
                                Canvas canvas4 = canvas3;
                                canvas4.drawRect(f188, (kobVar.x1 - kobVar.A1) - f12, gl.L(1.0f) + f188, kobVar.x1 - kobVar.A1, kobVar.A0);
                                canvas3 = canvas4;
                                StringBuilder sb = new StringBuilder("#");
                                i42++;
                                sb.append(i42);
                                canvas3.drawText(sb.toString(), f188 + gl.L(2.0f), ((kobVar.x1 - kobVar.A1) - f12) + gl.L(14.0f), kobVar.F0);
                                j10 = 59000;
                            }
                            canvas3.restore();
                            e = kobVar.c1.e(false, f25);
                            float contentHeight = ((kobVar.x1 - kobVar.getContentHeight()) + kobVar.A1) - gl.N(2.3f);
                            float N4 = (kobVar.x1 - kobVar.A1) + gl.N(4.3f);
                            if (e > 0.0f) {
                                long j11 = kobVar.d1;
                                if (j11 == -1) {
                                    fob fobVar13 = kobVar.h;
                                    if (fobVar13 != null) {
                                        j11 = (long) (fobVar13.e * fobVar13.h);
                                    } else {
                                        fob fobVar14 = kobVar.w;
                                        if (fobVar14 != null) {
                                            j11 = (long) ((fobVar14.h - fobVar14.g) * fobVar14.e);
                                        } else {
                                            if (kobVar.F) {
                                                f30 = kobVar.I;
                                                f31 = kobVar.L;
                                            } else {
                                                f30 = kobVar.S;
                                                f31 = kobVar.U;
                                            }
                                            j11 = (long) (f30 * f31);
                                        }
                                    }
                                }
                                Canvas canvas5 = canvas3;
                                f29 = contentHeight;
                                kobVar2 = kobVar;
                                kobVar2.c(f29, N4, e * f19, j11, canvas5);
                            } else {
                                f29 = contentHeight;
                                kobVar2 = kobVar;
                            }
                            kobVar2.c(f29, N4, (1.0f - e) * f19, kobVar2.e, canvas);
                        }
                    }
                    i = i4;
                    e = kobVar.c1.e(false, f25);
                    float contentHeight2 = ((kobVar.x1 - kobVar.getContentHeight()) + kobVar.A1) - gl.N(2.3f);
                    float N42 = (kobVar.x1 - kobVar.A1) + gl.N(4.3f);
                    if (e > 0.0f) {
                    }
                    kobVar2.c(f29, N42, (1.0f - e) * f19, kobVar2.e, canvas);
                } else {
                    canvas3 = canvas;
                }
                kobVar = kobVar2;
                i4 = 1;
                if (kobVar.c0 > i4) {
                    float f1782 = fobVar3.e;
                    float f1792 = fobVar3.h;
                    float f1802 = fobVar3.g;
                    j = (long) ((f1792 - f1802) * f1782);
                    if (j > 68999) {
                    }
                }
                i = i4;
                e = kobVar.c1.e(false, f25);
                float contentHeight22 = ((kobVar.x1 - kobVar.getContentHeight()) + kobVar.A1) - gl.N(2.3f);
                float N422 = (kobVar.x1 - kobVar.A1) + gl.N(4.3f);
                if (e > 0.0f) {
                }
                kobVar2.c(f29, N422, (1.0f - e) * f19, kobVar2.e, canvas);
            } else {
                i = 1;
            }
            if (z2) {
                canvas.restore();
            }
        } else {
            i = 1;
        }
        if (kobVar2.n1) {
            float f189 = 1.0f / (1000.0f / gl.r);
            float f190 = kobVar2.o1;
            long L4 = (long) ((gl.L(32.0f) / kobVar2.v1) * min * f189 * f190);
            if (kobVar2.Y0) {
                kobVar2.o1 = (f189 * 0.25f) + f190;
            }
            int i43 = kobVar2.i1;
            if (i43 == 4 && (fobVar2 = kobVar2.h) != null) {
                float f191 = fobVar2.g;
                long j12 = kobVar2.f;
                long j13 = fobVar2.e;
                float f192 = j13;
                if (f191 < j12 / f192) {
                    i3 = -1;
                } else if (fobVar2.h > (j12 + min) / f192) {
                    i3 = i;
                } else {
                    kobVar2.o1 = 1.0f;
                    i3 = 0;
                }
                long j14 = i3 * L4;
                kobVar2.f = Utilities.k(j12 + j14, j13 - min, 0L);
                kobVar2.e += j14;
                fob fobVar15 = kobVar2.h;
                float f193 = (r3 - j12) / fobVar15.e;
                if (f193 > 0.0f) {
                    f3 = 1.0f;
                    max = Math.min(1.0f - fobVar15.h, f193);
                } else {
                    f3 = 1.0f;
                    max = Math.max(0.0f - fobVar15.g, f193);
                }
                fob fobVar16 = kobVar2.h;
                fobVar16.g = Utilities.i(fobVar16.g + max, f3, 0.0f);
                fob fobVar17 = kobVar2.h;
                fobVar17.h = Utilities.i(fobVar17.h + max, f3, 0.0f);
                eob eobVar = kobVar2.a;
                if (eobVar != null) {
                    eobVar.L(false, kobVar2.h.g);
                    kobVar2.a.k1(kobVar2.h.h);
                }
                kobVar2.invalidate();
            } else if (i43 == 8) {
                float f194 = kobVar2.T;
                long j15 = kobVar2.R;
                float f195 = (-j15) + 100;
                long j16 = kobVar2.S;
                float f196 = j16;
                if (f194 < f195 / f196) {
                    i2 = -1;
                } else if (kobVar2.U >= ((r8 + min) - 100) / f196) {
                    i2 = i;
                } else {
                    kobVar2.o1 = 1.0f;
                    i2 = 0;
                }
                if (i2 != 0) {
                    if (kobVar2.Q && (fobVar = kobVar2.h) != null) {
                        long j17 = j15 - (i2 * L4);
                        float f197 = fobVar.h;
                        float f198 = fobVar.e;
                        k = Utilities.k(j17, (long) ((f197 * f198) - (f194 * f196)), (long) ((fobVar.g * f198) - (kobVar2.U * f196)));
                        kobVar2.R = k;
                    } else if (kobVar2.H && kobVar2.F) {
                        long j18 = j15 - (i2 * L4);
                        float f199 = kobVar2.L;
                        float f200 = kobVar2.I;
                        k = Utilities.k(j18, (long) ((f199 * f200) - (f194 * f196)), (long) ((kobVar2.K * f200) - (kobVar2.U * f196)));
                        kobVar2.R = k;
                    } else {
                        k = Utilities.k(j15 - (i2 * L4), 0L, -(j16 - Math.min(kobVar2.getBaseDuration(), kobVar2.getMaxScrollDuration())));
                        kobVar2.R = k;
                    }
                    float f201 = (-(k - j15)) / kobVar2.S;
                    float min9 = f201 > 0.0f ? Math.min(1.0f - kobVar2.U, f201) : Math.max(0.0f - kobVar2.T, f201);
                    if (kobVar2.h == null) {
                        float f202 = kobVar2.e;
                        float f203 = kobVar2.S;
                        kobVar2.e = (long) Utilities.i((min9 * f203) + f202, f203, 0.0f);
                    }
                    kobVar2.T = Utilities.i(kobVar2.T + min9, 1.0f, 0.0f);
                    kobVar2.U = Utilities.i(kobVar2.U + min9, 1.0f, 0.0f);
                    eob eobVar2 = kobVar2.a;
                    if (eobVar2 != null) {
                        eobVar2.e1(kobVar2.T);
                        kobVar2.a.Z0(kobVar2.U);
                        kobVar2.a.y(kobVar2.e, false);
                    }
                    kobVar2.invalidate();
                } else {
                    kobVar2.o1 = 1.0f;
                }
            } else {
                kobVar2.o1 = 1.0f;
            }
        } else {
            kobVar2.o1 = 1.0f;
        }
        int contentHeight3 = kobVar2.getContentHeight();
        if (kobVar2.c != contentHeight3) {
            kobVar2.c = contentHeight3;
            Runnable runnable = kobVar2.d;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public final void e(ViewGroup viewGroup, wjb wjbVar, sl0 sl0Var, g7b g7bVar) {
        int i;
        int i2 = this.k1;
        final byte b = 0;
        final byte b2 = 2;
        try {
            if (i2 == 2 && this.O) {
                lja ljaVar = new lja(getContext(), 0);
                ljaVar.b = 0.0f;
                ljaVar.c = 1.5f;
                ljaVar.c(this.W);
                ljaVar.h = new p8c(this) { // from class: cob
                    public final /* synthetic */ kob b;

                    {
                        this.b = this;
                    }

                    @Override // p8c
                    public final void a(Object obj) {
                        byte b3 = b;
                        kob kobVar = this.b;
                        Float f = (Float) obj;
                        switch (b3) {
                            case 0:
                                kobVar.getClass();
                                kobVar.W = f.floatValue();
                                eob eobVar = kobVar.a;
                                if (eobVar != null) {
                                    eobVar.w(f.floatValue());
                                    break;
                                }
                                break;
                            case 1:
                                kobVar.getClass();
                                kobVar.M = f.floatValue();
                                eob eobVar2 = kobVar.a;
                                if (eobVar2 != null) {
                                    eobVar2.u(f.floatValue());
                                    break;
                                }
                                break;
                            default:
                                kobVar.h.i = f.floatValue();
                                eob eobVar3 = kobVar.a;
                                if (eobVar3 != null) {
                                    eobVar3.x0(f.floatValue());
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
                float min2 = Math.min((i3 - i4) - i5, ((((gl.R1(this.U, 1.0f, this.g0.c) * this.S) + (this.R - this.f)) / min) * this.v1) + i4 + i5);
                cs5 G = cs5.G(viewGroup, wjbVar, this);
                G.p(ljaVar);
                G.n(true);
                G.b(R.drawable.msg_delete, k96.M0(2131744483, null), new bob(this, (byte) 1), false);
                G.W(5);
                G.X = true;
                G.b0((-(this.w1 - min2)) + gl.L(18.0f), this.G0.top);
                G.a0();
                G.S(sl0Var, -g7bVar.getX(), -g7bVar.getY());
                performHapticFeedback(0, 1);
            } else {
                final byte b3 = 1;
                if (i2 == 1 && this.F) {
                    lja ljaVar2 = new lja(getContext(), 0);
                    ljaVar2.b = 0.0f;
                    ljaVar2.c = 1.5f;
                    ljaVar2.c(this.M);
                    ljaVar2.h = new p8c(this) { // from class: cob
                        public final /* synthetic */ kob b;

                        {
                            this.b = this;
                        }

                        @Override // p8c
                        public final void a(Object obj) {
                            byte b32 = b3;
                            kob kobVar = this.b;
                            Float f = (Float) obj;
                            switch (b32) {
                                case 0:
                                    kobVar.getClass();
                                    kobVar.W = f.floatValue();
                                    eob eobVar = kobVar.a;
                                    if (eobVar != null) {
                                        eobVar.w(f.floatValue());
                                        break;
                                    }
                                    break;
                                case 1:
                                    kobVar.getClass();
                                    kobVar.M = f.floatValue();
                                    eob eobVar2 = kobVar.a;
                                    if (eobVar2 != null) {
                                        eobVar2.u(f.floatValue());
                                        break;
                                    }
                                    break;
                                default:
                                    kobVar.h.i = f.floatValue();
                                    eob eobVar3 = kobVar.a;
                                    if (eobVar3 != null) {
                                        eobVar3.x0(f.floatValue());
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
                    float min4 = Math.min((i6 - i7) - i8, ((((gl.R1(this.L, 1.0f, this.e0.c) * this.I) + (this.J - this.f)) / min3) * this.v1) + i7 + i8);
                    cs5 G2 = cs5.G(viewGroup, wjbVar, this);
                    G2.p(ljaVar2);
                    G2.n(true);
                    G2.b(R.drawable.msg_delete, k96.M0(2131744247, null), new bob(this, b2), false);
                    G2.W(5);
                    G2.X = true;
                    G2.b0((-(this.w1 - min4)) + gl.L(18.0f), this.y0.top);
                    G2.a0();
                    G2.S(sl0Var, -g7bVar.getX(), -g7bVar.getY());
                    performHapticFeedback(0, 1);
                } else if (i2 == 0 && this.h != null) {
                    lja ljaVar3 = new lja(getContext(), 0);
                    ljaVar3.b = 0.0f;
                    ljaVar3.c = 1.5f;
                    ljaVar3.c(this.h.i);
                    ljaVar3.h = new p8c(this) { // from class: cob
                        public final /* synthetic */ kob b;

                        {
                            this.b = this;
                        }

                        @Override // p8c
                        public final void a(Object obj) {
                            byte b32 = b2;
                            kob kobVar = this.b;
                            Float f = (Float) obj;
                            switch (b32) {
                                case 0:
                                    kobVar.getClass();
                                    kobVar.W = f.floatValue();
                                    eob eobVar = kobVar.a;
                                    if (eobVar != null) {
                                        eobVar.w(f.floatValue());
                                        break;
                                    }
                                    break;
                                case 1:
                                    kobVar.getClass();
                                    kobVar.M = f.floatValue();
                                    eob eobVar2 = kobVar.a;
                                    if (eobVar2 != null) {
                                        eobVar2.u(f.floatValue());
                                        break;
                                    }
                                    break;
                                default:
                                    kobVar.h.i = f.floatValue();
                                    eob eobVar3 = kobVar.a;
                                    if (eobVar3 != null) {
                                        eobVar3.x0(f.floatValue());
                                        break;
                                    }
                                    break;
                            }
                        }
                    };
                    cs5 G3 = cs5.G(viewGroup, wjbVar, this);
                    G3.p(ljaVar3);
                    G3.W(5);
                    G3.X = true;
                    G3.b0(gl.L(18.0f), this.u0.top);
                    G3.a0();
                    G3.S(sl0Var, -g7bVar.getX(), -g7bVar.getY());
                    performHapticFeedback(0, 1);
                } else {
                    if (i2 != 3 || (i = this.l1) < 0) {
                        return;
                    }
                    ArrayList arrayList = this.s;
                    if (i >= arrayList.size()) {
                        return;
                    }
                    fob fobVar = (fob) arrayList.get(this.l1);
                    lja ljaVar4 = new lja(getContext(), 0);
                    ljaVar4.b = 0.0f;
                    ljaVar4.c = 1.5f;
                    ljaVar4.c(fobVar.i);
                    ljaVar4.h = new nu9(this, fobVar, (byte) 18);
                    cs5 G4 = cs5.G(viewGroup, wjbVar, this);
                    G4.p(ljaVar4);
                    G4.W(5);
                    G4.X = true;
                    G4.b0(gl.L(18.0f), fobVar.j.top);
                    G4.a0();
                    G4.S(sl0Var, -g7bVar.getX(), -g7bVar.getY());
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
        return (int) (this.A1 + (this.h != null ? getVideoHeight() + gl.L(4.0f) : 0.0f) + (this.s.isEmpty() ? 0.0f : getCollageHeight() + gl.L(4.0f)) + (this.F ? getRoundHeight() + gl.L(4.0f) : 0.0f) + (this.O ? gl.L(4.0f) + getAudioHeight() : 0.0f) + this.A1);
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
        return gl.U1(this.j0.c, gl.L(28.0f) + this.A1 + this.A1, getContentHeight());
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
        fob fobVar = this.h;
        if (fobVar == null && !this.F) {
            long j5 = this.R;
            long k3 = Utilities.k(j5 + ((long) f), 0L, -(this.S - Math.min(getBaseDuration(), getMaxScrollDuration())));
            this.R = k3;
            float f5 = k3 - j5;
            this.T = Utilities.i(this.T - (f5 / this.S), 1.0f, 0.0f);
            this.U = Utilities.i(this.U - (f5 / this.S), 1.0f, 0.0f);
            eob eobVar = this.a;
            if (eobVar != null) {
                eobVar.e1(this.T);
                this.a.Z0(this.U);
            }
        } else if (this.Q) {
            if (fobVar != null) {
                float f6 = fobVar.g;
                long j6 = fobVar.e;
                f2 = j6 * f6;
                float f7 = fobVar.h;
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
                eob eobVar2 = this.a;
                if (eobVar2 != null) {
                    eobVar2.e1(this.T);
                    this.a.Z0(this.U);
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
                eob eobVar3 = this.a;
                if (eobVar3 != null) {
                    eobVar3.e1(this.T);
                    this.a.Z0(this.U);
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
        eob eobVar4 = this.a;
        if (eobVar4 != null) {
            eobVar4.H1(this.R + ((long) (this.T * this.S)));
        }
        if (!this.n1) {
            eob eobVar5 = this.a;
            if (eobVar5 != null) {
                eobVar5.m0(true);
                fob fobVar2 = this.h;
                if (fobVar2 != null) {
                    long j18 = this.R + ((long) (this.T * this.S));
                    float f17 = fobVar2.h;
                    float f18 = fobVar2.e;
                    k2 = Utilities.k(j18, (long) (f17 * f18), (long) (fobVar2.g * f18));
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
                eob eobVar6 = this.a;
                this.e = k2;
                eobVar6.y(k2, false);
                return;
            }
            if (!this.s1) {
                return;
            }
        }
        fob fobVar3 = this.h;
        if (fobVar3 != null) {
            long j21 = this.R + ((long) (this.T * this.S));
            float f22 = fobVar3.h;
            float f23 = fobVar3.e;
            k = Utilities.k(j21, (long) (f22 * f23), (long) (fobVar3.g * f23));
            this.e = k;
        } else if (!this.F || fobVar3 == null) {
            float f24 = this.T;
            long j22 = this.S;
            k = Utilities.k((long) (f24 * j22), j22, 0L);
            this.e = k;
        } else {
            long j23 = this.R + ((long) (this.T * this.S));
            float f25 = this.L;
            float f26 = fobVar3.e;
            k = Utilities.k(j23, (long) (f25 * f26), (long) (this.K * f26));
            this.e = k;
        }
        eob eobVar7 = this.a;
        if (eobVar7 != null) {
            eobVar7.y(k, false);
        }
    }

    public final void i(fob fobVar, float f) {
        long k;
        long k2;
        long j;
        long j2;
        long j3;
        long j4;
        if (fobVar != null) {
            fob fobVar2 = this.w;
            if (fobVar2 != fobVar && fobVar2 != null) {
                if (this.n == this.s.indexOf(fobVar)) {
                    fob fobVar3 = this.w;
                    float f2 = fobVar3.e;
                    float f3 = fobVar.h;
                    float f4 = fobVar.e;
                    long j5 = (long) ((f2 * 1.0f) - (f3 * f4));
                    float f5 = fobVar.g;
                    long j6 = (long) ((f2 * 0.0f) - (f5 * f4));
                    float min = Math.min(f3 - f5, ((fobVar3.h - fobVar3.g) * f2) / f4);
                    long j7 = fobVar.f;
                    long j8 = (long) f;
                    long j9 = j7 + j8;
                    if (j9 > j5) {
                        float i = Utilities.i((((this.w.h * r2.e) - j7) - j8) / fobVar.e, 1.0f, min);
                        fobVar.h = i;
                        float i2 = Utilities.i(i - min, 1.0f, 0.0f);
                        fobVar.g = i2;
                        fob fobVar4 = this.w;
                        float f6 = fobVar4.h;
                        float f7 = fobVar4.e;
                        float f8 = fobVar.h;
                        float f9 = fobVar.e;
                        long j10 = (long) ((f6 * f7) - (f8 * f9));
                        long j11 = (long) ((fobVar4.g * f7) - (i2 * f9));
                        if (j10 < j11) {
                            j4 = j11;
                            j3 = j10;
                        } else {
                            j3 = j11;
                            j4 = j10;
                        }
                        fobVar.f = Utilities.k(fobVar.f + j8, j4, j3);
                        eob eobVar = this.a;
                        if (eobVar != null) {
                            eobVar.W0(fobVar.g, fobVar.a);
                            this.a.j1(fobVar.h, fobVar.a);
                        }
                    } else if (j9 < j6) {
                        float i3 = Utilities.i((((this.w.g * r2.e) - j7) - j8) / fobVar.e, 1.0f - min, 0.0f);
                        fobVar.g = i3;
                        float i4 = Utilities.i(i3 + min, 1.0f, 0.0f);
                        fobVar.h = i4;
                        fob fobVar5 = this.w;
                        float f10 = fobVar5.h;
                        float f11 = fobVar5.e;
                        float f12 = fobVar.e;
                        long j12 = (long) ((f10 * f11) - (i4 * f12));
                        long j13 = (long) ((fobVar5.g * f11) - (fobVar.g * f12));
                        if (j12 < j13) {
                            j2 = j13;
                            j = j12;
                        } else {
                            j = j13;
                            j2 = j12;
                        }
                        fobVar.f = Utilities.k(fobVar.f + j8, j2, j);
                        eob eobVar2 = this.a;
                        if (eobVar2 != null) {
                            eobVar2.W0(fobVar.g, fobVar.a);
                            this.a.j1(fobVar.h, fobVar.a);
                        }
                    } else {
                        fobVar.f = j9;
                    }
                } else {
                    long j14 = fobVar.f + ((long) f);
                    float baseDuration = getBaseDuration();
                    float f13 = fobVar.e;
                    fobVar.f = Utilities.k(j14, (long) (baseDuration - (fobVar.h * f13)), (long) ((-fobVar.g) * f13));
                }
            }
            invalidate();
            eob eobVar3 = this.a;
            if (eobVar3 != null) {
                eobVar3.B1(fobVar.a, fobVar.f);
            }
            if (!this.n1) {
                eob eobVar4 = this.a;
                if (eobVar4 != null) {
                    eobVar4.m0(true);
                    fob fobVar6 = this.w;
                    if (fobVar6 == fobVar || fobVar6 == null) {
                        float f14 = fobVar.g;
                        long j15 = fobVar.e;
                        k2 = Utilities.k((long) (f14 * j15), j15, 0L);
                    } else {
                        long j16 = fobVar.f + ((long) (fobVar.g * fobVar.e));
                        float f15 = fobVar6.h;
                        float f16 = fobVar6.e;
                        k2 = Utilities.k(j16, (long) (f15 * f16), (long) (fobVar6.g * f16));
                    }
                    fob fobVar7 = this.w;
                    if (fobVar7 != fobVar && fobVar7 != null && Math.abs(this.e - k2) > 400) {
                        this.d1 = this.e;
                        this.c1.e(true, 1.0f);
                    }
                    eob eobVar5 = this.a;
                    this.e = k2;
                    eobVar5.y(k2, false);
                    return;
                }
                if (!this.s1) {
                    return;
                }
            }
            fob fobVar8 = this.w;
            if (fobVar8 == fobVar || fobVar8 == null) {
                float f17 = fobVar.g;
                long j17 = fobVar.e;
                k = Utilities.k((long) (f17 * j17), j17, 0L);
                this.e = k;
            } else {
                long j18 = fobVar.f + ((long) (fobVar.g * fobVar.e));
                float f18 = fobVar8.h;
                float f19 = fobVar8.e;
                k = Utilities.k(j18, (long) (f18 * f19), (long) (fobVar8.g * f19));
                this.e = k;
            }
            eob eobVar6 = this.a;
            if (eobVar6 != null) {
                eobVar6.y(k, false);
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
        fob fobVar = this.h;
        if (fobVar == null) {
            long j5 = this.J;
            long k3 = Utilities.k(j5 + ((long) f), 0L, -(this.I - Math.min(getBaseDuration(), getMaxScrollDuration())));
            this.J = k3;
            float f2 = k3 - j5;
            this.K = Utilities.i(this.K - (f2 / this.I), 1.0f, 0.0f);
            this.L = Utilities.i(this.L - (f2 / this.I), 1.0f, 0.0f);
            eob eobVar = this.a;
            if (eobVar != null) {
                eobVar.f0(this.K);
                this.a.u1(this.L);
            }
        } else if (this.H) {
            float f3 = fobVar.h;
            float f4 = fobVar.e;
            float f5 = this.L;
            float f6 = this.I;
            long j6 = (long) ((f3 * f4) - (f5 * f6));
            float f7 = fobVar.g;
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
                fob fobVar2 = this.h;
                float f9 = fobVar2.h;
                float f10 = fobVar2.e;
                float f11 = this.L;
                float f12 = this.I;
                long j11 = (long) ((f9 * f10) - (f11 * f12));
                long j12 = (long) ((fobVar2.g * f10) - (i2 * f12));
                if (j11 < j12) {
                    j4 = j12;
                    j3 = j11;
                } else {
                    j3 = j12;
                    j4 = j11;
                }
                this.J = Utilities.k(this.J + j9, j4, j3);
                eob eobVar2 = this.a;
                if (eobVar2 != null) {
                    eobVar2.f0(this.K);
                    this.a.u1(this.L);
                }
            } else if (j10 < j7) {
                float i3 = Utilities.i((((this.h.g * r1.e) - j8) - j9) / this.I, 1.0f - min, 0.0f);
                this.K = i3;
                float i4 = Utilities.i(i3 + min, 1.0f, 0.0f);
                this.L = i4;
                fob fobVar3 = this.h;
                float f13 = fobVar3.h;
                float f14 = fobVar3.e;
                float f15 = this.I;
                long j13 = (long) ((f13 * f14) - (i4 * f15));
                long j14 = (long) ((fobVar3.g * f14) - (this.K * f15));
                if (j13 < j14) {
                    j2 = j14;
                    j = j13;
                } else {
                    j = j14;
                    j2 = j13;
                }
                this.J = Utilities.k(this.J + j9, j2, j);
                eob eobVar3 = this.a;
                if (eobVar3 != null) {
                    eobVar3.f0(this.K);
                    this.a.u1(this.L);
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
        eob eobVar4 = this.a;
        if (eobVar4 != null) {
            eobVar4.L0(this.J + ((long) (this.K * this.I)));
        }
        if (!this.n1) {
            eob eobVar5 = this.a;
            if (eobVar5 != null) {
                eobVar5.m0(true);
                fob fobVar4 = this.h;
                if (fobVar4 != null) {
                    long j16 = this.J + ((long) (this.K * this.I));
                    float f17 = fobVar4.h;
                    float f18 = fobVar4.e;
                    k2 = Utilities.k(j16, (long) (f17 * f18), (long) (fobVar4.g * f18));
                } else {
                    float f19 = this.K;
                    long j17 = this.I;
                    k2 = Utilities.k((long) (f19 * j17), j17, 0L);
                }
                if (this.h != null && Math.abs(this.e - k2) > 400) {
                    this.d1 = this.e;
                    this.c1.e(true, 1.0f);
                }
                eob eobVar6 = this.a;
                this.e = k2;
                eobVar6.y(k2, false);
                return;
            }
            if (!this.s1) {
                return;
            }
        }
        fob fobVar5 = this.h;
        if (fobVar5 != null) {
            long j18 = this.J + ((long) (this.K * this.I));
            float f20 = fobVar5.h;
            float f21 = fobVar5.e;
            k = Utilities.k(j18, (long) (f20 * f21), (long) (fobVar5.g * f21));
            this.e = k;
        } else {
            float f22 = this.K;
            long j19 = this.I;
            k = Utilities.k((long) (f22 * j19), j19, 0L);
            this.e = k;
        }
        eob eobVar7 = this.a;
        if (eobVar7 != null) {
            eobVar7.y(k, false);
        }
    }

    public final void k() {
        long min = Math.min(getBaseDuration(), getMaxScrollDuration());
        fob fobVar = this.h;
        float f = (fobVar.h + fobVar.g) / 2.0f;
        long j = fobVar.e;
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
        fob fobVar = this.h;
        ArrayList arrayList = this.s;
        if (fobVar == null && !this.O && arrayList.isEmpty()) {
            return false;
        }
        long min = Math.min(getBaseDuration(), getMaxScrollDuration());
        float f2 = ((f - this.z1) - this.y1) / this.v1;
        fob fobVar2 = this.w;
        long j = fobVar2 != null ? (long) ((fobVar2.g * fobVar2.e) + fobVar2.f) : 0L;
        float f3 = f2 * min;
        if (fobVar2 == null) {
            j = this.h == null ? this.R : 0L;
        }
        long i = (long) Utilities.i((f3 - j) + this.f, getBaseDuration(), 0.0f);
        fob fobVar3 = this.h;
        if (fobVar3 != null) {
            float f4 = i / fobVar3.e;
            if (f4 < fobVar3.g || f4 > fobVar3.h) {
                return false;
            }
        }
        fob fobVar4 = this.w;
        if (fobVar4 != null && (i < 0 || i >= ((long) ((fobVar4.h - fobVar4.g) * fobVar4.e)))) {
            return false;
        }
        if (this.O && fobVar3 == null && arrayList.isEmpty()) {
            float f5 = i / this.S;
            if (f5 < this.T || f5 > this.U) {
                return false;
            }
        }
        this.e = i;
        invalidate();
        eob eobVar = this.a;
        if (eobVar != null) {
            eobVar.y(i, z);
        }
        sma smaVar = this.e1;
        if (smaVar != null) {
            gl.r(smaVar);
            this.e1 = null;
        }
        if (!z) {
            return true;
        }
        sma smaVar2 = new sma(this, i, (byte) 7);
        this.e1 = smaVar2;
        gl.e3(smaVar2, 150L);
        return true;
    }

    public final void n(String str, long j, long j2, float f, float f2, float f3, boolean z) {
        boolean z2;
        long j3;
        boolean z3;
        fob fobVar;
        if (TextUtils.equals(this.G, str)) {
            return;
        }
        iob iobVar = this.N;
        if (iobVar != null) {
            iobVar.a();
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
            if (getMeasuredWidth() <= 0 || this.N != null || ((fobVar = this.h) != null && fobVar.e < 1)) {
                z2 = false;
                j3 = j4;
                z3 = true;
            } else {
                String str2 = this.G;
                int i = this.w1;
                int i2 = this.z1;
                int i3 = (i - i2) - i2;
                int L = gl.L(38.0f);
                long j5 = this.I;
                Long valueOf = j5 > 2 ? Long.valueOf(j5) : null;
                fob fobVar2 = this.h;
                j3 = j4;
                z2 = false;
                z3 = true;
                this.N = new iob(this, false, str2, i3, L, valueOf, fobVar2 != null ? fobVar2.e : getMaxScrollDuration(), -1L, -1L, new bob(this, b));
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
        fob fobVar = this.h;
        if (TextUtils.equals(fobVar == null ? null : fobVar.d, str)) {
            return;
        }
        fob fobVar2 = this.h;
        if (fobVar2 != null) {
            iob iobVar = fobVar2.c;
            if (iobVar != null) {
                iobVar.a();
                this.h.c = null;
            }
            this.h = null;
        }
        if (str != null) {
            this.f = 0L;
            fob fobVar3 = new fob(this);
            this.h = fobVar3;
            fobVar3.b = z;
            fobVar3.d = str;
            fobVar3.e = j;
            fobVar3.i = f;
            fobVar3.a(false);
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
        this.M0.setTextSize(gl.L(12.0f));
        this.Q0.setTextSize(gl.L(12.0f));
        int L = gl.L(12.0f);
        this.z1 = L;
        int L2 = gl.L(5.0f);
        this.A1 = L2;
        setPadding(L, L2, gl.L(12.0f), gl.L(5.0f));
        int size = View.MeasureSpec.getSize(i);
        this.w1 = size;
        int L3 = gl.L(388.0f);
        this.x1 = L3;
        setMeasuredDimension(size, L3);
        int L4 = gl.L(10.0f);
        this.y1 = L4;
        this.v1 = (this.w1 - (L4 << 1)) - (this.z1 << 1);
        fob fobVar = this.h;
        if (fobVar != null && fobVar.d != null && fobVar.c == null) {
            fobVar.a(false);
        }
        ArrayList arrayList = this.s;
        if (!arrayList.isEmpty()) {
            int size2 = arrayList.size();
            int i3 = 0;
            while (i3 < size2) {
                Object obj = arrayList.get(i3);
                i3++;
                fob fobVar2 = (fob) obj;
                if (fobVar2.d != null && fobVar2.c == null) {
                    fobVar2.a(false);
                    fobVar2.b();
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
        sma smaVar;
        boolean z2;
        VelocityTracker velocityTracker;
        eob eobVar;
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
        eob eobVar2;
        int i;
        float f;
        float f2;
        boolean z7;
        float f3;
        float i2;
        eob eobVar3;
        eob eobVar4;
        float f4;
        float f5;
        fob fobVar = this.h;
        ArrayList arrayList = this.s;
        if (fobVar != null || !arrayList.isEmpty() || this.O || this.F) {
            float timelineHeight = this.x1 - getTimelineHeight();
            if (motionEvent.getAction() != 0 || motionEvent.getY() >= timelineHeight) {
                long currentTimeMillis = System.currentTimeMillis();
                int action = motionEvent.getAction();
                kr9 kr9Var = this.X0;
                tsa tsaVar = this.Z0;
                if (action == 0) {
                    sma smaVar2 = this.e1;
                    if (smaVar2 != null) {
                        gl.r(smaVar2);
                        this.e1 = null;
                    }
                    kr9Var.a();
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
                            if (motionEvent.getY() > (f7 - getVideoHeight()) - gl.L(2.0f)) {
                                this.k1 = 0;
                            }
                        } else {
                            f4 = 4.0f;
                        }
                        i3 = (int) (f7 - (getVideoHeight() + gl.L(f4)));
                    }
                    if (this.k1 == -1 && !arrayList.isEmpty()) {
                        int i4 = 0;
                        while (i4 < arrayList.size()) {
                            f5 = f6;
                            float U1 = gl.U1(((fob) arrayList.get(i4)).k.c, gl.L(28.0f), gl.L(38.0f));
                            float f8 = i3;
                            if (motionEvent.getY() < f8 && motionEvent.getY() > (f8 - U1) - gl.L(f5)) {
                                this.k1 = 3;
                                this.l1 = i4;
                                break;
                            }
                            i3 = (int) (f8 - (U1 + gl.L(f4)));
                            i4++;
                            f6 = f5;
                        }
                    }
                    f5 = f6;
                    if (this.k1 == -1 && this.F) {
                        float f9 = i3;
                        if (motionEvent.getY() < f9 && motionEvent.getY() > (f9 - getRoundHeight()) - gl.L(f5)) {
                            this.k1 = 1;
                        }
                        i3 = (int) (f9 - (getRoundHeight() + gl.L(f4)));
                    }
                    if (this.k1 == -1 && this.O) {
                        float f10 = i3;
                        if (motionEvent.getY() < f10 && motionEvent.getY() > (f10 - getAudioHeight()) - gl.L(f5)) {
                            this.k1 = 2;
                        }
                        getAudioHeight();
                        Typeface typeface = gl.a;
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
                        gl.r(tsaVar);
                        gl.e3(tsaVar, ViewConfiguration.getLongPressTimeout());
                    }
                } else if (motionEvent.getAction() == 2) {
                    float x3 = motionEvent.getX() - this.h1;
                    if (this.k0 && (this.n1 || Math.abs(x3) > gl.e)) {
                        long min = Math.min(getBaseDuration(), getMaxScrollDuration());
                        fob fobVar2 = this.h;
                        if (fobVar2 != null) {
                            int i6 = this.i1;
                            if (i6 == 1) {
                                this.f = (long) Utilities.i(this.f - ((x3 / this.v1) * min), fobVar2.e - min, 0.0f);
                                invalidate();
                                if (!this.n1) {
                                    this.o1 = 1.0f;
                                }
                                this.n1 = true;
                                this.m1 = false;
                            } else if (i6 == 2 || i6 == 3 || i6 == 4) {
                                float f11 = fobVar2.e;
                                float f12 = (min / f11) * (x3 / this.v1);
                                if (i6 == 2) {
                                    fobVar2.g = Utilities.i(fobVar2.g + f12, fobVar2.h - (1000.0f / f11), 0.0f);
                                    eob eobVar5 = this.a;
                                    if (eobVar5 != null) {
                                        eobVar5.L(false, this.h.g);
                                    }
                                    fob fobVar3 = this.h;
                                    float f13 = fobVar3.h - fobVar3.g;
                                    float f14 = f();
                                    fob fobVar4 = this.h;
                                    if (f13 > f14 / fobVar4.e) {
                                        fobVar4.h = ls6.z(f(), this.h.e, fobVar4.g, 1.0f);
                                        eob eobVar6 = this.a;
                                        if (eobVar6 != null) {
                                            eobVar6.k1(this.h.h);
                                        }
                                    }
                                } else if (i6 == 3) {
                                    fobVar2.h = Utilities.i(fobVar2.h + f12, 1.0f, (1000.0f / f11) + fobVar2.g);
                                    eob eobVar7 = this.a;
                                    if (eobVar7 != null) {
                                        eobVar7.k1(this.h.h);
                                    }
                                    fob fobVar5 = this.h;
                                    float f15 = fobVar5.h - fobVar5.g;
                                    float f16 = f();
                                    fob fobVar6 = this.h;
                                    if (f15 > f16 / fobVar6.e) {
                                        fobVar6.g = oo1.x(f(), this.h.e, fobVar6.h, 0.0f);
                                        eob eobVar8 = this.a;
                                        if (eobVar8 != null) {
                                            eobVar8.L(false, this.h.g);
                                        }
                                    }
                                } else if (i6 == 4) {
                                    float min2 = f12 > 0.0f ? Math.min(1.0f - fobVar2.h, f12) : Math.max(-fobVar2.g, f12);
                                    fob fobVar7 = this.h;
                                    float f17 = fobVar7.g + min2;
                                    fobVar7.g = f17;
                                    fobVar7.h += min2;
                                    eob eobVar9 = this.a;
                                    if (eobVar9 != null) {
                                        eobVar9.L(false, f17);
                                        this.a.k1(this.h.h);
                                    }
                                }
                                float f18 = this.e;
                                fob fobVar8 = this.h;
                                float f19 = fobVar8.e;
                                float f20 = f18 / f19;
                                float f21 = fobVar8.g;
                                if (f20 < f21 || f20 > fobVar8.h) {
                                    long j5 = (long) (f21 * f19);
                                    this.e = j5;
                                    eob eobVar10 = this.a;
                                    if (eobVar10 != null) {
                                        eobVar10.y(j5, false);
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
                                fob fobVar9 = this.h;
                                if (fobVar9 != null) {
                                    x = oo1.f((fobVar9.g * fobVar9.e) + this.f, this.R, f23, f24);
                                } else {
                                    fob fobVar10 = this.w;
                                    if (fobVar10 != null) {
                                        x = oo1.f((fobVar10.g * fobVar10.e) + this.f, this.R, f23, f24);
                                    } else if (this.F) {
                                        x = oo1.f((this.K * this.I) + this.f, this.R, f23, f24);
                                    } else {
                                        x = oo1.x(f(), this.S, this.U, f24);
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
                                eob eobVar11 = this.a;
                                if (eobVar11 != null) {
                                    eobVar11.H1(this.R + ((long) (this.T * this.S)));
                                }
                                eob eobVar12 = this.a;
                                if (eobVar12 != null) {
                                    eobVar12.e1(this.T);
                                }
                            } else if (i7 == 7) {
                                float min3 = Math.min(1.0f, Math.max(0L, (this.f - this.R) + min) / this.S);
                                float f26 = this.T;
                                float g2 = g();
                                float f27 = this.S;
                                float f28 = (g2 / f27) + f26;
                                fob fobVar11 = this.h;
                                if (fobVar11 != null) {
                                    z3 = Math.min(min3, (((fobVar11.h * fobVar11.e) + this.f) - this.R) / f27);
                                } else {
                                    fob fobVar12 = this.w;
                                    if (fobVar12 != null) {
                                        z3 = Math.min(min3, (((fobVar12.h * fobVar12.e) + this.f) - this.R) / f27);
                                    } else if (this.F) {
                                        z3 = Math.min(min3, (((this.L * this.I) + this.f) - this.R) / f27);
                                    } else {
                                        z3 = ls6.z(f(), this.S, this.T, min3);
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
                                eob eobVar13 = this.a;
                                if (eobVar13 != null) {
                                    eobVar13.Z0(this.U);
                                }
                            }
                            if (this.i1 == 8) {
                                float min4 = f22 > 0.0f ? Math.min(Math.max(0.0f, Math.min(1.0f, Math.max(0L, (this.f - this.R) + min) / this.S) - this.U), f22) : Math.max(Math.min(0.0f, (Math.max(0L, this.f - this.R) / this.S) - this.T), f22);
                                float f30 = this.T + min4;
                                this.T = f30;
                                this.U += min4;
                                eob eobVar14 = this.a;
                                if (eobVar14 != null) {
                                    eobVar14.e1(f30);
                                    this.a.H1(this.R + ((long) (this.T * this.S)));
                                    this.a.Z0(this.U);
                                }
                                eob eobVar15 = this.a;
                                if (eobVar15 != null) {
                                    eobVar15.m0(true);
                                }
                            }
                            if (this.h == null && !this.F) {
                                this.e = (long) (this.T * this.S);
                                eob eobVar16 = this.a;
                                if (eobVar16 != null) {
                                    eobVar16.m0(true);
                                    this.a.y(this.e, false);
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
                                fob fobVar13 = this.h;
                                if (fobVar13 != null) {
                                    x2 = oo1.f((fobVar13.g * fobVar13.e) + this.f, this.J, f32, f33);
                                } else {
                                    fob fobVar14 = this.w;
                                    if (fobVar14 != null) {
                                        x2 = oo1.f((fobVar14.g * fobVar14.e) + this.f, this.J, f32, f33);
                                    } else {
                                        x2 = oo1.x(f(), this.I, this.L, f33);
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
                                eob eobVar17 = this.a;
                                if (eobVar17 != null) {
                                    eobVar17.L0(this.J + ((long) (this.K * this.I)));
                                }
                                eob eobVar18 = this.a;
                                if (eobVar18 != null) {
                                    eobVar18.f0(this.K);
                                }
                            } else if (i7 == 11) {
                                float min5 = Math.min(1.0f, Math.max(0L, (this.f - this.J) + min) / this.I);
                                float f35 = this.K;
                                float g4 = g();
                                float f36 = this.I;
                                float f37 = (g4 / f36) + f35;
                                fob fobVar15 = this.h;
                                if (fobVar15 != null) {
                                    min5 = Math.min(min5, (((fobVar15.h * fobVar15.e) + this.f) - this.J) / f36);
                                }
                                fob fobVar16 = this.w;
                                if (fobVar16 != null) {
                                    z4 = Math.min(min5, (((fobVar16.h * fobVar16.e) + this.f) - this.J) / this.I);
                                } else {
                                    z4 = ls6.z(f(), this.I, this.K, min5);
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
                                eob eobVar19 = this.a;
                                if (eobVar19 != null) {
                                    eobVar19.u1(this.L);
                                }
                            }
                            if (this.i1 == 12) {
                                float min6 = f31 > 0.0f ? Math.min(Math.min(1.0f, Math.max(0L, (this.f - this.J) + min) / this.I) - this.L, f31) : Math.max((Math.max(0L, this.f - this.J) / this.I) - this.K, f31);
                                float f39 = this.K + min6;
                                this.K = f39;
                                this.L += min6;
                                eob eobVar20 = this.a;
                                if (eobVar20 != null) {
                                    eobVar20.f0(f39);
                                    this.a.L0(this.J + ((long) (this.K * this.I)));
                                    this.a.u1(this.L);
                                }
                                eob eobVar21 = this.a;
                                if (eobVar21 != null) {
                                    eobVar21.m0(true);
                                }
                            }
                            if (this.h == null) {
                                this.e = (long) (this.K * this.I);
                                eob eobVar22 = this.a;
                                if (eobVar22 != null) {
                                    eobVar22.m0(true);
                                    z5 = false;
                                    this.a.y(this.e, false);
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
                                        i((fob) arrayList.get(this.j1), (x3 / this.v1) * min);
                                        if (!this.n1) {
                                            this.o1 = 1.0f;
                                        }
                                        this.n1 = true;
                                        this.m1 = false;
                                    } else if (this.m1) {
                                        m(currentTimeMillis - this.f1 < 350, motionEvent.getX());
                                        if (this.n1 || (eobVar2 = this.a) == null) {
                                            z6 = true;
                                        } else {
                                            z6 = true;
                                            eobVar2.m0(true);
                                        }
                                        if (!this.n1) {
                                            this.o1 = 1.0f;
                                        }
                                        this.n1 = z6;
                                    }
                                }
                            } else {
                                fob fobVar17 = (fob) arrayList.get(this.j1);
                                float f40 = (min / fobVar17.e) * (x3 / this.v1);
                                int i15 = this.i1;
                                if (i15 == 13) {
                                    float g5 = fobVar17.h - (g() / fobVar17.e);
                                    float max3 = Math.max(0L, this.f - fobVar17.f) / fobVar17.e;
                                    if (fobVar17 == this.w) {
                                        f = f40;
                                        max3 = oo1.x(f(), fobVar17.e, fobVar17.h, max3);
                                        if (!this.p1 && f < 0.0f) {
                                            f2 = 0.0f;
                                            if (fobVar17.g <= fobVar17.h - (f() / fobVar17.e)) {
                                                this.i1 = 15;
                                            }
                                            f3 = fobVar17.g;
                                            i2 = Utilities.i(f3 + f, g5, max3);
                                            fobVar17.g = i2;
                                            if (Math.abs(f3 - i2) > 0.01f) {
                                                this.p1 = true;
                                            }
                                            eobVar3 = this.a;
                                            if (eobVar3 != null) {
                                                eobVar3.B1(fobVar17.a, fobVar17.f);
                                            }
                                            eobVar4 = this.a;
                                            if (eobVar4 != null) {
                                                eobVar4.W0(fobVar17.g, fobVar17.a);
                                            }
                                        }
                                    } else {
                                        f = f40;
                                    }
                                    f2 = 0.0f;
                                    f3 = fobVar17.g;
                                    i2 = Utilities.i(f3 + f, g5, max3);
                                    fobVar17.g = i2;
                                    if (Math.abs(f3 - i2) > 0.01f) {
                                    }
                                    eobVar3 = this.a;
                                    if (eobVar3 != null) {
                                    }
                                    eobVar4 = this.a;
                                    if (eobVar4 != null) {
                                    }
                                } else {
                                    f = f40;
                                    f2 = 0.0f;
                                    if (i15 == 14) {
                                        float min7 = Math.min(1.0f, Math.max(0L, (this.f - fobVar17.f) + min) / fobVar17.e);
                                        float g6 = (g() / fobVar17.e) + fobVar17.g;
                                        if (fobVar17 == this.w) {
                                            min7 = ls6.z(f(), fobVar17.e, fobVar17.g, min7);
                                            if (!this.p1 && f > 0.0f) {
                                                if (fobVar17.h >= (f() / fobVar17.e) + fobVar17.g) {
                                                    this.i1 = 15;
                                                }
                                            }
                                        }
                                        float f41 = fobVar17.h;
                                        float i16 = Utilities.i(f41 + f, min7, g6);
                                        fobVar17.h = i16;
                                        if (Math.abs(f41 - i16) > 0.01f) {
                                            this.p1 = true;
                                        }
                                        eob eobVar23 = this.a;
                                        if (eobVar23 != null) {
                                            eobVar23.j1(fobVar17.h, fobVar17.a);
                                        }
                                    }
                                }
                                if (this.i1 == 15) {
                                    float min8 = f > f2 ? Math.min(Math.min(1.0f, Math.max(0L, (this.f - fobVar17.f) + min) / fobVar17.e) - fobVar17.h, f) : Math.max((Math.max(0L, this.f - fobVar17.f) / fobVar17.e) - fobVar17.g, f);
                                    float f42 = fobVar17.g + min8;
                                    fobVar17.g = f42;
                                    fobVar17.h += min8;
                                    eob eobVar24 = this.a;
                                    if (eobVar24 != null) {
                                        eobVar24.W0(f42, fobVar17.a);
                                        this.a.B1(fobVar17.a, fobVar17.f);
                                        this.a.j1(fobVar17.h, fobVar17.a);
                                    }
                                    eob eobVar25 = this.a;
                                    if (eobVar25 != null) {
                                        z7 = true;
                                        eobVar25.m0(true);
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
                        gl.r(tsaVar);
                    }
                    int i17 = this.i1;
                    if ((i17 == 1 || i17 == 5 || i17 == 8) && (velocityTracker6 = this.q1) != null) {
                        velocityTracker6.addMovement(motionEvent);
                    }
                } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    gl.r(tsaVar);
                    kr9Var.a();
                    if (motionEvent.getAction() == 1) {
                        if ((System.currentTimeMillis() - this.g1 > ViewConfiguration.getTapTimeout() || this.n1) && this.k0) {
                            int i18 = this.i1;
                            if (i18 == 16 && (velocityTracker5 = this.q1) != null) {
                                velocityTracker5.computeCurrentVelocity(1000);
                                int xVelocity = (int) this.q1.getXVelocity();
                                this.r1 = true;
                                if (this.h != null && Math.abs(xVelocity) > gl.L(100.0f)) {
                                    long min9 = Math.min(this.h.e, getMaxScrollDuration());
                                    int i19 = this.z1;
                                    float f43 = i19;
                                    float f44 = min9;
                                    float f45 = this.v1;
                                    int i20 = (int) (((this.f / f44) * f45) + f43);
                                    int A = (int) b00.A(this.h.e - min9, f44, f45, f43);
                                    this.s1 = true;
                                    this.t1 = i20;
                                    this.X0.c(i20, 0, -xVelocity, 0, i19, A, 0, 0);
                                    z = false;
                                }
                            } else if (i18 == 1 && (velocityTracker4 = this.q1) != null) {
                                velocityTracker4.computeCurrentVelocity(1000);
                                int xVelocity2 = (int) this.q1.getXVelocity();
                                this.r1 = true;
                                if (this.h != null && Math.abs(xVelocity2) > gl.L(100.0f)) {
                                    long min10 = Math.min(this.h.e, getMaxScrollDuration());
                                    int i21 = this.z1;
                                    float f46 = i21;
                                    float f47 = min10;
                                    float f48 = this.v1;
                                    int i22 = (int) (((this.f / f47) * f48) + f46);
                                    int A2 = (int) b00.A(this.h.e - min10, f47, f48, f46);
                                    this.s1 = true;
                                    this.t1 = i22;
                                    this.X0.c(i22, 0, -xVelocity2, 0, i21, A2, 0, 0);
                                    z = false;
                                }
                            } else if ((i18 == 5 || (i18 == 8 && !this.n1)) && this.Q && (velocityTracker2 = this.q1) != null) {
                                velocityTracker2.computeCurrentVelocity(this.h == null ? 1500 : 1000);
                                int xVelocity3 = (int) this.q1.getXVelocity();
                                this.r1 = false;
                                if (Math.abs(xVelocity3) > gl.L(100.0f)) {
                                    float min11 = Math.min(getBaseDuration(), getMaxScrollDuration());
                                    int i23 = (int) (((this.R / min11) * this.v1) + this.z1 + this.y1);
                                    fob fobVar18 = this.h;
                                    if (fobVar18 != null) {
                                        float f49 = fobVar18.h;
                                        float f50 = fobVar18.e;
                                        j = (long) ((fobVar18.g * f50) - this.S);
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
                                    this.X0.c(i23, 0, xVelocity3, 0, (int) (((j / min11) * f54) + f53), (int) b00.A(j2, min11, f54, f53), 0, 0);
                                    z = false;
                                }
                            } else if ((i18 == 9 || (i18 == 12 && !this.n1)) && this.H && (velocityTracker3 = this.q1) != null) {
                                velocityTracker3.computeCurrentVelocity(this.h == null ? 1500 : 1000);
                                int xVelocity4 = (int) this.q1.getXVelocity();
                                this.r1 = false;
                                if (Math.abs(xVelocity4) > gl.L(100.0f)) {
                                    float min12 = Math.min(getBaseDuration(), getMaxScrollDuration());
                                    int i24 = (int) (((this.J / min12) * this.v1) + this.z1 + this.y1);
                                    fob fobVar19 = this.h;
                                    if (fobVar19 != null) {
                                        float f55 = fobVar19.h;
                                        float f56 = fobVar19.e;
                                        j3 = (long) ((fobVar19.g * f56) - this.I);
                                        j4 = (long) ((f55 * f56) - 0.0f);
                                    } else {
                                        j3 = -(this.I - Math.min(getBaseDuration(), getMaxScrollDuration()));
                                        j4 = 0;
                                    }
                                    this.s1 = true;
                                    this.t1 = i24;
                                    float f57 = this.z1 + this.y1;
                                    float f58 = this.v1;
                                    this.X0.c(i24, 0, xVelocity4, 0, (int) (((j3 / min12) * f58) + f57), (int) b00.A(j4, min12, f58, f57), 0, 0);
                                    z = false;
                                }
                            }
                            smaVar = this.e1;
                            if (smaVar != null) {
                                gl.r(smaVar);
                                this.e1 = null;
                            }
                            if (this.n1 || !z || (eobVar = this.a) == null) {
                                z2 = false;
                            } else {
                                z2 = false;
                                eobVar.m0(false);
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
                                            this.a.f(((fob) arrayList.get(this.l1)).a);
                                        }
                                        invalidate();
                                    }
                                }
                                if (i25 == 2 && !this.Q) {
                                    this.Q = true;
                                    this.H = false;
                                    eob eobVar26 = this.a;
                                    if (eobVar26 != null) {
                                        eobVar26.Q0(false);
                                    }
                                    invalidate();
                                } else if (i25 == 1 && !this.H) {
                                    this.Q = false;
                                    this.H = true;
                                    eob eobVar27 = this.a;
                                    if (eobVar27 != null) {
                                        eobVar27.Q0(true);
                                    }
                                    invalidate();
                                } else if (i25 != 2 && this.Q) {
                                    this.Q = false;
                                    this.H = false;
                                    eob eobVar28 = this.a;
                                    if (eobVar28 != null) {
                                        eobVar28.Q0(false);
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
                                    eob eobVar29 = this.a;
                                    if (eobVar29 != null) {
                                        eobVar29.Q0(false);
                                    }
                                    invalidate();
                                }
                            } else {
                                long i28 = (long) Utilities.i(((((motionEvent.getX() - this.z1) - this.y1) / this.v1) * Math.min(getBaseDuration(), getMaxScrollDuration())) + this.f, getBaseDuration(), 0.0f);
                                fob fobVar20 = this.h;
                                float f59 = fobVar20.h - fobVar20.g;
                                fobVar20.g = (1.0f - f59) * (i28 / getBaseDuration());
                                fob fobVar21 = this.h;
                                float f60 = fobVar21.g;
                                fobVar21.h = f59 + f60;
                                eob eobVar30 = this.a;
                                if (eobVar30 != null) {
                                    eobVar30.L(true, f60);
                                    this.a.k1(this.h.h);
                                }
                                invalidate();
                            }
                        } else if (this.k1 == 10 && (runnable = this.b) != null) {
                            runnable.run();
                        }
                    }
                    z = true;
                    smaVar = this.e1;
                    if (smaVar != null) {
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
                this.b0 = new dob(this, this.P, (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
                this.V = false;
                this.h0.e(true, 1.0f);
            }
        }
    }

    public final void q() {
        pva pvaVar = new pva((byte) 6);
        ArrayList arrayList = this.s;
        Collections.sort(arrayList, pvaVar);
        fob fobVar = arrayList.isEmpty() ? null : (fob) arrayList.get(0);
        this.w = fobVar;
        if (fobVar != null) {
            long j = fobVar.f;
        }
    }

    public void setCollage(ArrayList<f4b> arrayList) {
        ArrayList arrayList2;
        ArrayList arrayList3;
        iob iobVar;
        int i = 0;
        while (true) {
            arrayList2 = this.s;
            if (i >= arrayList2.size()) {
                break;
            }
            fob fobVar = (fob) arrayList2.get(i);
            if (fobVar != null && (iobVar = fobVar.c) != null) {
                iobVar.a();
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
            dob dobVar = (dob) arrayList3.get(i2);
            if (dobVar != null) {
                dobVar.a();
            }
            i2++;
        }
        arrayList3.clear();
        this.i0.e(true, 1.0f);
        if (arrayList != null) {
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                arrayList3.add(null);
                f4b f4bVar = arrayList.get(i3);
                if (f4bVar.K) {
                    fob fobVar2 = new fob(this);
                    fobVar2.a = i3;
                    fobVar2.b = false;
                    fobVar2.d = f4bVar.L.getAbsolutePath();
                    fobVar2.e = f4bVar.h0;
                    fobVar2.f = f4bVar.X;
                    fobVar2.i = f4bVar.P;
                    fobVar2.g = f4bVar.V;
                    fobVar2.h = f4bVar.W;
                    fobVar2.a(false);
                    fobVar2.b();
                    arrayList2.add(fobVar2);
                }
            }
        }
        q();
        this.n = 0;
    }

    public void setDelegate(eob eobVar) {
        this.a = eobVar;
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
        fob fobVar = this.h;
        if (fobVar != null) {
            if (j < this.e) {
                float f = j;
                float f2 = fobVar.e;
                if (f <= (fobVar.g * f2) + 240.0f) {
                }
            }
        }
        if (this.O && !this.F && fobVar == null) {
            if (j < this.e) {
                float f3 = j;
                float f4 = this.S;
                if (f3 <= (this.T * f4) + 240.0f) {
                }
            }
        }
        if (this.F && fobVar == null) {
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
        fob fobVar = this.h;
        if (fobVar == null) {
            return;
        }
        fobVar.g = f;
        invalidate();
    }

    public void setVideoRight(float f) {
        fob fobVar = this.h;
        if (fobVar == null) {
            return;
        }
        fobVar.h = f;
        invalidate();
    }
}
