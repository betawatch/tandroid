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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class lqb extends View {
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
    public final kqb J0;
    public float K;
    public final Paint K0;
    public float L;
    public final Drawable L0;
    public float M;
    public final TextPaint M0;
    public jqb N;
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
    public final mt9 X0;
    public boolean Y0;
    public final vua Z0;
    public fqb a;
    public boolean a0;
    public long a1;
    public Runnable b;
    public eqb b0;
    public long b1;
    public int c;
    public int c0;
    public final ln c1;
    public Runnable d;
    public final ln d0;
    public long d1;
    public long e;
    public final ln e0;
    public toa e1;
    public long f;
    public final ln f0;
    public long f1;
    public final ln g0;
    public long g1;
    public gqb h;
    public final ln h0;
    public float h1;
    public final ln i0;
    public int i1;
    public final ln j0;
    public int j1;
    public boolean k0;
    public int k1;
    public final sm0 l0;
    public int l1;
    public final wm0 m0;
    public boolean m1;
    public int n;
    public final wm0 n0;
    public boolean n1;
    public final wm0 o0;
    public float o1;
    public final RectF p0;
    public boolean p1;
    public final Path q0;
    public VelocityTracker q1;
    public final ArrayList r;
    public final uib r0;
    public boolean r1;
    public final ArrayList s;
    public final Drawable s0;
    public boolean s1;
    public final kqb t0;
    public int t1;
    public final RectF u0;
    public final float[] u1;
    public final Paint v0;
    public int v1;
    public gqb w;
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

    public lqb(Context context, ViewGroup viewGroup, i9b i9bVar, ylb ylbVar, sm0 sm0Var) {
        super(context);
        this.n = 0;
        this.r = new ArrayList();
        this.s = new ArrayList();
        this.x = new Paint(3);
        this.y = new Path();
        this.E = new Path();
        this.c0 = 1;
        d53 d53Var = d53.h;
        this.d0 = new ln(this, 0L, 360L, d53Var);
        this.e0 = new ln(360L, this, d53Var);
        this.f0 = new ln(this, 0L, 360L, d53Var);
        this.g0 = new ln(360L, this, d53Var);
        this.h0 = new ln(this, 0L, 360L, d53Var);
        this.i0 = new ln(this, 0L, 360L, d53Var);
        this.j0 = new ln(this, 0L, 320L, d53Var);
        this.k0 = true;
        this.p0 = new RectF();
        this.q0 = new Path();
        this.t0 = new kqb();
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
        this.J0 = new kqb();
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
        this.X0 = new mt9(getContext(), null);
        this.a1 = -1L;
        this.b1 = -1L;
        this.c1 = new ln(0.0f, this, 0L, 340L, d53Var);
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
        textPaint2.setTextSize(gm.L(12.0f));
        textPaint2.setTypeface(gm.o());
        textPaint2.setColor(-1);
        textPaint3.setTextSize(gm.L(12.0f));
        textPaint3.setColor(-1);
        paint6.setColor(1090519039);
        paint8.setShader(linearGradient);
        paint8.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        paint.setColor(-1);
        paint.setShadowLayer(gm.L(1.0f), 0.0f, gm.L(1.0f), 436207616);
        textPaint.setTextSize(gm.L(12.0f));
        textPaint.setColor(-1);
        textPaint.setShadowLayer(gm.L(2.0f), 0.0f, gm.L(2.0f), TLObject.FLAG_30);
        textPaint.setTypeface(gm.o());
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        paint3.setColor(-16777216);
        paint5.setColor(-1);
        paint4.setColor(637534208);
        this.r0 = new uib(jb6.M0(2131744142, null), 12.0f, gm.o());
        Drawable mutate = getContext().getResources().getDrawable(R.drawable.timeline).mutate();
        this.s0 = mutate;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        mutate.setColorFilter(new PorterDuffColorFilter(-1, mode));
        Drawable mutate2 = getContext().getResources().getDrawable(R.drawable.filled_widget_music).mutate();
        this.L0 = mutate2;
        mutate2.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.l0 = sm0Var;
        this.m0 = new wm0(sm0Var, this, 0, false);
        this.n0 = new wm0(sm0Var, this, 3, false);
        this.o0 = new wm0(sm0Var, this, 4, false);
        this.Z0 = new vua(this, viewGroup, ylbVar, sm0Var, i9bVar, (byte) 5);
    }

    private float getAudioHeight() {
        return gm.U1(this.g0.d(this.Q), gm.L(28.0f), gm.L(38.0f));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long getBaseDuration() {
        gqb gqbVar = this.h;
        if (gqbVar != null) {
            return Math.max(1L, gqbVar.e);
        }
        gqb gqbVar2 = this.w;
        return gqbVar2 != null ? Math.max(1L, gqbVar2.e) : this.F ? Math.max(1L, this.I) : Math.max(1L, this.S);
    }

    private float getCollageHeight() {
        ArrayList arrayList = this.s;
        if (arrayList.isEmpty()) {
            return 0.0f;
        }
        float f = 0.0f;
        for (int i = 0; i < arrayList.size(); i++) {
            if (f > 0.0f) {
                f += gm.L(4.0f);
            }
            f += gm.U1(((gqb) arrayList.get(i)).k.c, gm.L(28.0f), gm.L(38.0f));
        }
        return f;
    }

    private float getRoundHeight() {
        if (this.F) {
            return gm.U1(this.e0.d(this.H), gm.L(28.0f), gm.L(38.0f));
        }
        return 0.0f;
    }

    private float getVideoHeight() {
        if (this.h == null) {
            return 0.0f;
        }
        return gm.U1(r2.k.c, gm.L(28.0f), gm.L(38.0f));
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
        gqb gqbVar;
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        long min = Math.min(getBaseDuration(), getMaxScrollDuration());
        float k = Utilities.k(this.e, getBaseDuration(), 0L);
        gqb gqbVar2 = this.w;
        float f = min;
        float f2 = (this.v1 * (((k + (gqbVar2 != null ? (gqbVar2.g * gqbVar2.e) + gqbVar2.f : this.h == null ? this.R : 0L)) - this.f) / f)) + this.z1 + this.y1;
        if (!this.Y0 && x >= f2 - gm.L(12.0f) && x <= f2 + gm.L(12.0f)) {
            return 0;
        }
        boolean z2 = this.h != null && y > (((float) (this.x1 - this.A1)) - getVideoHeight()) - ((float) gm.L(2.0f));
        ArrayList arrayList = this.s;
        boolean z3 = !arrayList.isEmpty() && y > ((((((float) (this.x1 - this.A1)) - getVideoHeight()) - ((float) gm.L(4.0f))) - getCollageHeight()) - ((float) gm.L(4.0f))) - ((float) gm.L(2.0f)) && y < (((float) (this.x1 - this.A1)) - getVideoHeight()) - ((float) gm.L(2.0f));
        if (this.F) {
            if (y > (((((((this.x1 - this.A1) - getVideoHeight()) - gm.L(4.0f)) - getCollageHeight()) - gm.L(arrayList.isEmpty() ? 0.0f : 4.0f)) - getRoundHeight()) - gm.L(4.0f)) - gm.L(2.0f)) {
                if (y < ((((this.x1 - this.A1) - getVideoHeight()) - gm.L(2.0f)) - getCollageHeight()) - gm.L(arrayList.isEmpty() ? 0.0f : 4.0f)) {
                    z = true;
                    if (z3) {
                        i = 1;
                        if (z2) {
                            float f3 = this.z1 + this.y1;
                            gqb gqbVar3 = this.h;
                            float f4 = gqbVar3.g;
                            float f5 = gqbVar3.e;
                            float f6 = this.f;
                            float f7 = this.v1;
                            float f8 = ((((f4 * f5) - f6) / f) * f7) + f3;
                            float f9 = ((((gqbVar3.h * f5) - f6) / f) * f7) + f3;
                            if (this.Y0) {
                                if (getBaseDuration() < getMaxScrollDuration()) {
                                    return 4;
                                }
                                if (x < f8 - gm.L(15.0f) || x > f9 + gm.L(15.0f)) {
                                    return i;
                                }
                                return 4;
                            }
                            if (x >= f8 - gm.L(15.0f) && x <= gm.L(5.0f) + f8) {
                                return 2;
                            }
                            if (x >= f9 - gm.L(5.0f) && x <= gm.L(15.0f) + f9) {
                                return 3;
                            }
                            if (x >= f8 && x <= f9) {
                                gqb gqbVar4 = this.h;
                                if (gqbVar4.g > 0.01f || gqbVar4.h < 0.99f) {
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
                                if (x >= f16 - gm.L(15.0f) && x <= gm.L(5.0f) + f16) {
                                    return 10;
                                }
                                if (x >= f17 - gm.L(5.0f) && x <= gm.L(15.0f) + f17) {
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
                                f17 = b10.A((j + this.I) - j2, f, f19, f18);
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
                                if (x >= f27 - gm.L(15.0f) && x <= gm.L(5.0f) + f27) {
                                    return 6;
                                }
                                if (x >= f28 - gm.L(5.0f) && x <= gm.L(15.0f) + f28) {
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
                                f28 = b10.A((j3 + this.S) - j4, f, f30, f29);
                                f27 = f31;
                            }
                            if (x >= f27 && x <= f28) {
                                return 5;
                            }
                        }
                    } else {
                        for (int i2 = 0; i2 < arrayList.size(); i2++) {
                            gqb gqbVar5 = (gqb) arrayList.get(i2);
                            RectF rectF = gm.P;
                            rectF.set(gqbVar5.j);
                            rectF.inset(-gm.L(2.0f), -gm.L(2.0f));
                            if (rectF.contains(x, y)) {
                                float f32 = this.z1 + this.y1;
                                float f33 = gqbVar5.f;
                                float f34 = this.v1;
                                float f35 = ((f33 / f) * f34) + f32;
                                float f36 = gqbVar5.g;
                                float f37 = gqbVar5.e;
                                float f38 = ((((f36 * f37) + f33) / f) * f34) + f32;
                                float f39 = ((((gqbVar5.h * f37) + f33) / f) * f34) + f32;
                                float A = b10.A(r6 + r11, f, f34, f32);
                                this.j1 = i2;
                                if (x >= f38 - gm.L(15.0f) && x <= gm.L(5.0f) + f38) {
                                    return 13;
                                }
                                if (x >= f39 - gm.L(5.0f) && x <= gm.L(15.0f) + f39) {
                                    return 14;
                                }
                                if (x < f38 || x > f39 || (gqbVar5.g <= 0.01f && gqbVar5.h >= 0.99f)) {
                                    return (x < f35 || x > A) ? -1 : 16;
                                }
                                return 15;
                            }
                        }
                        i = 1;
                    }
                    gqbVar = this.h;
                    if (gqbVar != null || gqbVar.e <= getMaxScrollDuration() || !z2) {
                        return -1;
                    }
                }
            }
        }
        z = false;
        if (z3) {
        }
        gqbVar = this.h;
        return gqbVar != null ? -1 : -1;
    }

    public final void c(float f, float f2, float f3, long j, Canvas canvas) {
        float f4;
        if (this.Y0) {
            return;
        }
        long min = Math.min(getBaseDuration(), getMaxScrollDuration());
        float k = Utilities.k(j, getBaseDuration(), 0L);
        gqb gqbVar = this.w;
        if (gqbVar != null) {
            f4 = (gqbVar.g * gqbVar.e) + gqbVar.f;
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
        RectF rectF = gm.P;
        rectF.set(f5 - gm.N(1.5f), f7, gm.N(1.5f) + f5, f8);
        rectF.inset(-gm.N(0.66f), -gm.N(0.66f));
        canvas.drawRoundRect(rectF, gm.L(6.0f), gm.L(6.0f), paint);
        rectF.set(f5 - gm.N(1.5f), f7, gm.N(1.5f) + f5, f8);
        canvas.drawRoundRect(rectF, gm.L(6.0f), gm.L(6.0f), paint2);
    }

    @Override // android.view.View
    public final void computeScroll() {
        mt9 mt9Var = this.X0;
        if (!mt9Var.b()) {
            if (this.s1) {
                this.s1 = false;
                fqb fqbVar = this.a;
                if (fqbVar != null) {
                    fqbVar.w0(false);
                    return;
                }
                return;
            }
            return;
        }
        int i = mt9Var.j;
        long min = Math.min(getBaseDuration(), getMaxScrollDuration());
        if (this.r1) {
            this.f = (long) Math.max(0.0f, (((i - this.z1) - this.y1) / this.v1) * min);
        } else {
            if (!this.Q) {
                mt9Var.a();
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
        RectF rectF = gm.P;
        rectF.set(f3 - gm.L(10.0f), f, gm.L(10.0f) + f4, f2);
        canvas.saveLayerAlpha(0.0f, 0.0f, this.w1, this.x1, nm7.d4, 31);
        int i = (int) (255.0f * f5);
        Paint paint2 = this.A0;
        paint2.setAlpha(i);
        canvas.drawRoundRect(rectF, gm.L(6.0f), gm.L(6.0f), paint2);
        rectF.inset(gm.L(this.Y0 ? 2.5f : 10.0f), gm.L(2.0f));
        boolean z = this.Y0;
        Paint paint3 = this.B0;
        if (z) {
            canvas.drawRoundRect(rectF, gm.L(3.0f), gm.L(3.0f), paint3);
        } else {
            canvas.drawRect(rectF, paint3);
        }
        float L = gm.L(2.0f);
        float L2 = gm.L(10.0f);
        Paint paint4 = this.C0;
        Paint paint5 = paint != null ? paint : paint4;
        paint4.setAlpha(nm7.d4);
        paint5.setAlpha(i);
        float f6 = f + f2;
        float f7 = (f6 - L2) / 2.0f;
        float f8 = (f6 + L2) / 2.0f;
        rectF.set(td4.y(gm.L(this.Y0 ? 2.0f : 10.0f), L, 2.0f, f3), f7, f3 - ((gm.L(this.Y0 ? 2.0f : 10.0f) + L) / 2.0f), f8);
        if (!this.Y0) {
            canvas.drawRoundRect(rectF, gm.L(1.0f), gm.L(1.0f), paint5);
            if (paint != null && !this.Y0) {
                paint4.setAlpha((int) (f5 * 48.0f));
                canvas.drawRoundRect(rectF, gm.L(1.0f), gm.L(1.0f), paint4);
            }
        }
        rectF.set(aq1.z(gm.L(this.Y0 ? 2.5f : 10.0f), L, 2.0f, f4), f7, td4.e(gm.L(this.Y0 ? 2.5f : 10.0f), L, 2.0f, f4), f8);
        if (!this.Y0) {
            canvas.drawRoundRect(rectF, gm.L(1.0f), gm.L(1.0f), paint5);
            if (paint != null) {
                paint4.setAlpha((int) (f5 * 48.0f));
                canvas.drawRoundRect(rectF, gm.L(1.0f), gm.L(1.0f), paint4);
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
        gqb gqbVar;
        gqb gqbVar2;
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
        lqb lqbVar;
        float e;
        float f29;
        float f30;
        float f31;
        gqb gqbVar3;
        long j;
        float f32;
        float R1;
        float y;
        long j2;
        float f33;
        boolean z3;
        float f34;
        sm0 sm0Var;
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
        sm0 sm0Var2;
        lqb lqbVar2 = this;
        Paint c = lqbVar2.m0.c(1.0f);
        float d2 = lqbVar2.j0.d(lqbVar2.k0);
        long min = Math.min(lqbVar2.getBaseDuration(), lqbVar2.getMaxScrollDuration());
        if (d2 < 1.0f) {
            f2 = 1.0f;
            lqbVar2.p0.set(lqbVar2.z1, (lqbVar2.x1 - lqbVar2.A1) - gm.L(28.0f), lqbVar2.w1 - lqbVar2.z1, lqbVar2.x1 - lqbVar2.A1);
            lqbVar2.q0.rewind();
            lqbVar2.q0.addRoundRect(lqbVar2.p0, gm.L(8.0f), gm.L(8.0f), Path.Direction.CW);
            canvas.saveLayerAlpha(lqbVar2.p0, (int) ((1.0f - d2) * 255.0f), 31);
            canvas.clipPath(lqbVar2.q0);
            if (lqbVar2.l0.c()) {
                lqbVar2.m0.a(canvas);
                canvas.drawColor(855638016);
            } else if (c == null) {
                canvas.drawColor(TLObject.FLAG_30);
            } else {
                canvas.drawRect(lqbVar2.p0, c);
                canvas.drawColor(855638016);
            }
            if (!lqbVar2.r.isEmpty() && (sm0Var2 = lqbVar2.l0) != null && sm0Var2.c()) {
                float e2 = lqbVar2.i0.e(false, kqb.c(lqbVar2.r));
                kqb kqbVar = lqbVar2.t0;
                RectF rectF = lqbVar2.p0;
                kqbVar.a((((lqbVar2.R - lqbVar2.f) / min) * lqbVar2.v1) + lqbVar2.z1 + lqbVar2.y1, rectF.left, rectF.right, gm.L(28.0f), e2, lqbVar2.p0.bottom, lqbVar2.r);
                canvas.saveLayerAlpha(lqbVar2.p0, nm7.m1, 31);
                canvas.clipPath(lqbVar2.t0);
                lqbVar2.o0.a(canvas);
                canvas.restore();
            } else if (!lqbVar2.r.isEmpty()) {
                Paint c2 = lqbVar2.o0.c(0.4f);
                if (c2 == null) {
                    c2 = lqbVar2.I0;
                    c2.setAlpha(64);
                }
                float e3 = lqbVar2.i0.e(false, kqb.c(lqbVar2.r));
                f = d2;
                kqb kqbVar2 = lqbVar2.t0;
                RectF rectF2 = lqbVar2.p0;
                kqbVar2.a((((lqbVar2.R - lqbVar2.f) / min) * lqbVar2.v1) + lqbVar2.z1 + lqbVar2.y1, rectF2.left, rectF2.right, gm.L(28.0f), e3, lqbVar2.p0.bottom, lqbVar2.r);
                canvas.drawPath(lqbVar2.t0, c2);
                float L = ((lqbVar2.r0.c + gm.L(3.66f)) + lqbVar2.s0.getIntrinsicWidth()) / 2.0f;
                int centerX = (int) (lqbVar2.p0.centerX() - L);
                int centerY = (int) lqbVar2.p0.centerY();
                Drawable drawable = lqbVar2.s0;
                drawable.setBounds(centerX, aq1.y(2, centerY, drawable), lqbVar2.s0.getIntrinsicWidth() + centerX, aq1.i(2, centerY, lqbVar2.s0));
                lqbVar2.s0.setAlpha(nm7.U2);
                lqbVar2.s0.draw(canvas);
                z = false;
                lqbVar2.r0.c(gm.L(3.66f) + (lqbVar2.p0.centerX() - L) + lqbVar2.s0.getIntrinsicWidth(), centerY, 0.75f, -1, canvas);
                canvas.restore();
            }
            f = d2;
            float L2 = ((lqbVar2.r0.c + gm.L(3.66f)) + lqbVar2.s0.getIntrinsicWidth()) / 2.0f;
            int centerX2 = (int) (lqbVar2.p0.centerX() - L2);
            int centerY2 = (int) lqbVar2.p0.centerY();
            Drawable drawable2 = lqbVar2.s0;
            drawable2.setBounds(centerX2, aq1.y(2, centerY2, drawable2), lqbVar2.s0.getIntrinsicWidth() + centerX2, aq1.i(2, centerY2, lqbVar2.s0));
            lqbVar2.s0.setAlpha(nm7.U2);
            lqbVar2.s0.draw(canvas);
            z = false;
            lqbVar2.r0.c(gm.L(3.66f) + (lqbVar2.p0.centerX() - L2) + lqbVar2.s0.getIntrinsicWidth(), centerY2, 0.75f, -1, canvas);
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
                canvas2.saveLayerAlpha(0.0f, 0.0f, lqbVar2.getWidth(), lqbVar2.getHeight(), (int) (f * 255.0f), 31);
                z2 = true;
            } else {
                f4 = 0.0f;
                canvas2 = canvas;
                z2 = z;
            }
            gqb gqbVar4 = lqbVar2.h;
            float f52 = gqbVar4 != null ? f2 : f4;
            float d3 = gqbVar4 != null ? gqbVar4.k.d((lqbVar2.Q || lqbVar2.H) ? z : true) : f4;
            float f53 = lqbVar2.x1 - lqbVar2.A1;
            float L3 = gm.L(4.0f);
            if (lqbVar2.h != null) {
                canvas2.save();
                float videoHeight = lqbVar2.getVideoHeight();
                gqb gqbVar5 = lqbVar2.h;
                float f54 = gqbVar5.g;
                long j4 = gqbVar5.e;
                float f55 = j4;
                f10 = b10.w(f54, f55, d3, f4);
                float w = b10.w(gqbVar5.h, f55, d3, f4);
                if (j4 <= 0) {
                    f5 = d3;
                    f6 = f52;
                    f46 = f4;
                    f8 = f46;
                } else {
                    f8 = f4;
                    f5 = d3;
                    f6 = f52;
                    f46 = (lqbVar2.z1 + lqbVar2.y1) - ((lqbVar2.f / min) * lqbVar2.v1);
                }
                float f56 = lqbVar2.y1;
                float f57 = f46 - f56;
                if (j4 <= 0) {
                    f7 = L3;
                    f11 = w;
                    f47 = f8;
                } else {
                    f7 = L3;
                    f11 = w;
                    f47 = lqbVar2.z1 + r3 + (((j4 - lqbVar2.f) / min) * lqbVar2.v1);
                }
                lqbVar2.u0.set(f57, f53 - videoHeight, f47 + f56, f53);
                float f58 = f53 - ((f7 * f6) + videoHeight);
                RectF rectF3 = lqbVar2.u0;
                float f59 = (rectF3.top * f5) + f8;
                float f60 = (rectF3.bottom * f5) + f8;
                lqbVar2.w0.rewind();
                lqbVar2.w0.addRoundRect(lqbVar2.u0, gm.L(8.0f), gm.L(8.0f), Path.Direction.CW);
                canvas2.clipPath(lqbVar2.w0);
                jqb jqbVar = lqbVar2.h.c;
                if (jqbVar != null) {
                    int i15 = jqbVar.f;
                    float f61 = i15;
                    int max2 = (int) Math.max(0.0d, Math.floor((f57 - lqbVar2.z1) / f61));
                    int min2 = (int) Math.min(lqbVar2.h.c.c, Math.ceil(((r3 - f57) - lqbVar2.z1) / f61) + 1.0d);
                    int i16 = (int) lqbVar2.u0.top;
                    boolean z8 = lqbVar2.h.c.d.size() >= min2;
                    boolean z9 = (i15 == 0 || !z8 || lqbVar2.h.b) ? false : true;
                    f48 = f58;
                    if (z9) {
                        int i17 = max2;
                        while (true) {
                            if (i17 >= Math.min(lqbVar2.h.c.d.size(), min2)) {
                                break;
                            }
                            if (((iqb) lqbVar2.h.c.d.get(i17)).a == null) {
                                z9 = false;
                                break;
                            }
                            i17++;
                        }
                    }
                    if (!z9) {
                        if (lqbVar2.l0.c()) {
                            lqbVar2.m0.a(canvas2);
                            canvas2.drawColor(855638016);
                        } else if (c == null) {
                            canvas2.drawColor(TLObject.FLAG_30);
                        } else {
                            canvas2.drawRect(lqbVar2.u0, c);
                            canvas2.drawColor(855638016);
                        }
                    }
                    if (i15 != 0) {
                        float f62 = f57;
                        int i18 = max2;
                        while (i18 < Math.min(lqbVar2.h.c.d.size(), min2)) {
                            iqb iqbVar = (iqb) lqbVar2.h.c.d.get(i18);
                            int i19 = min2;
                            if (iqbVar.a != null) {
                                i14 = i18;
                                f50 = f60;
                                f51 = f59;
                                lqbVar2.v0.setAlpha((int) (iqbVar.b.e(false, f2) * 255.0f));
                                canvas2.drawBitmap(iqbVar.a, f62, i16 - ((int) ((r2.getHeight() - videoHeight) / 2.0f)), lqbVar2.v0);
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
                        lqbVar2.h.c.b();
                    }
                } else {
                    f48 = f58;
                    f13 = f60;
                    f14 = f59;
                    f9 = 2.0f;
                }
                lqbVar2.x0.rewind();
                if (!lqbVar2.Y0) {
                    RectF rectF4 = gm.P;
                    int i20 = lqbVar2.z1;
                    int i21 = lqbVar2.y1;
                    float f63 = i20 + i21;
                    gqb gqbVar6 = lqbVar2.h;
                    float f64 = gqbVar6.g;
                    float f65 = gqbVar6.e;
                    int i22 = i21;
                    float f66 = lqbVar2.f;
                    float f67 = (f64 * f65) - f66;
                    float f68 = min;
                    float f69 = lqbVar2.v1;
                    float f70 = ((f67 / f68) * f69) + f63;
                    if (f64 <= f8) {
                        f49 = f69;
                        i13 = i22;
                    } else {
                        f49 = f69;
                        i13 = 0;
                    }
                    float f71 = f70 - i13;
                    float f72 = lqbVar2.x1 - lqbVar2.A1;
                    float f73 = f72 - videoHeight;
                    float f74 = gqbVar6.h;
                    float f75 = ((((f65 * f74) - f66) / f68) * f49) + f63;
                    if (f74 < 1.0f) {
                        i22 = 0;
                    }
                    rectF4.set(f71, f73, f75 + i22, f72);
                    lqbVar2.x0.addRoundRect(rectF4, lqbVar2.u1, Path.Direction.CW);
                    canvas2.clipPath(lqbVar2.x0, Region.Op.DIFFERENCE);
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
            if (lqbVar2.s.isEmpty()) {
                f15 = f7;
                f16 = 0.0f;
            } else {
                lqbVar2.getCollageHeight();
                int i23 = 0;
                while (i23 < lqbVar2.s.size()) {
                    gqb gqbVar7 = (gqb) lqbVar2.s.get(i23);
                    float d4 = gqbVar7.k.d((lqbVar2.Q || lqbVar2.H || lqbVar2.n != i23) ? false : true);
                    gqb gqbVar8 = lqbVar2.w;
                    int i24 = lqbVar2.z1;
                    int i25 = lqbVar2.y1;
                    if (gqbVar7 != gqbVar8) {
                        i8 = i23;
                        float f76 = min;
                        float R12 = ((((gm.R1(gqbVar7.g, f8, d4) * gqbVar7.e) + (gqbVar7.f - lqbVar2.f)) / f76) * lqbVar2.v1) + i24 + i25;
                        paint2 = c;
                        A2 = (b10.y(gm.R1(gqbVar7.h, 1.0f, d4), gqbVar7.e, gqbVar7.f - lqbVar2.f, f76) * lqbVar2.v1) + lqbVar2.z1 + lqbVar2.y1;
                        f39 = f7;
                        f40 = R12;
                    } else {
                        i8 = i23;
                        float f77 = f7;
                        paint2 = c;
                        float f78 = i24 + i25;
                        long j5 = gqbVar7.f - lqbVar2.f;
                        float f79 = min;
                        f39 = f77;
                        float f80 = lqbVar2.v1;
                        float f81 = ((j5 / f79) * f80) + f78;
                        A2 = b10.A(j5 + gqbVar7.e, f79, f80, f78);
                        f40 = f81;
                    }
                    canvas2.save();
                    float U1 = gm.U1(d4, gm.L(28.0f), gm.L(38.0f));
                    RectF rectF5 = gqbVar7.j;
                    float f82 = lqbVar2.y1;
                    rectF5.set(f40 - f82, f53 - U1, A2 + f82, f53);
                    RectF rectF6 = gqbVar7.j;
                    f14 = (rectF6.top * d4) + f14;
                    f13 = (rectF6.bottom * d4) + f13;
                    float f83 = gqbVar7.f;
                    float f84 = gqbVar7.g;
                    float f85 = gqbVar7.e;
                    float g = aq1.g(f84, f85, f83, d4, f10);
                    f11 = aq1.g(gqbVar7.h, f85, f83, d4, f11);
                    lqbVar2.y.rewind();
                    lqbVar2.y.addRoundRect(gqbVar7.j, gm.L(8.0f), gm.L(8.0f), Path.Direction.CW);
                    canvas2.clipPath(lqbVar2.y);
                    jqb jqbVar2 = gqbVar7.c;
                    if (jqbVar2 != null) {
                        long j6 = gqbVar7.e;
                        if (j6 <= 0) {
                            f41 = f53;
                            j3 = j6;
                            f43 = 0.0f;
                        } else {
                            f41 = f53;
                            j3 = j6;
                            f43 = (((gqbVar7.f - lqbVar2.f) / min) * lqbVar2.v1) + lqbVar2.z1 + lqbVar2.y1;
                        }
                        float f86 = f43 - lqbVar2.y1;
                        if (j6 <= 0) {
                            f44 = f86;
                            f45 = 0.0f;
                        } else {
                            f44 = f86;
                            f45 = ((((gqbVar7.f + j3) - lqbVar2.f) / min) * lqbVar2.v1) + lqbVar2.z1 + r5;
                        }
                        int i26 = jqbVar2.f;
                        float f87 = i26;
                        int max3 = (int) Math.max(0.0d, Math.floor((f44 - ((((gqbVar7.f - lqbVar2.f) / min) * lqbVar2.v1) + (lqbVar2.z1 + lqbVar2.y1))) / f87));
                        f42 = g;
                        int min3 = (int) Math.min(gqbVar7.c.c, Math.ceil(((f45 + r6) - f44) / f87) + 1.0d);
                        int i27 = (int) gqbVar7.j.top;
                        boolean z10 = gqbVar7.c.d.size() >= min3;
                        if (z10) {
                            int i28 = max3;
                            i9 = i28;
                            while (i28 < Math.min(gqbVar7.c.d.size(), min3)) {
                                if (((iqb) gqbVar7.c.d.get(i28)).a == null) {
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
                            if (lqbVar2.l0.c()) {
                                lqbVar2.m0.a(canvas2);
                                canvas2.drawColor(855638016);
                            } else if (paint2 == null) {
                                canvas2.drawColor(TLObject.FLAG_30);
                            } else {
                                z7 = z10;
                                paint3 = paint2;
                                canvas2.drawRect(gqbVar7.j, paint3);
                                canvas2.drawColor(855638016);
                                if (i26 != 0) {
                                    int i29 = i9;
                                    while (i29 < Math.min(gqbVar7.c.d.size(), min3)) {
                                        iqb iqbVar2 = (iqb) gqbVar7.c.d.get(i29);
                                        if (iqbVar2.a != null) {
                                            i10 = i29;
                                            i11 = min3;
                                            i12 = i27;
                                            lqbVar2.x.setAlpha((int) (iqbVar2.b.e(false, 1.0f) * 255.0f));
                                            canvas2.drawBitmap(iqbVar2.a, f44, i12 - ((int) ((r3.getHeight() - U1) / f9)), lqbVar2.x);
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
                                    gqbVar7.c.b();
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
                    lqbVar2.E.rewind();
                    if (!lqbVar2.Y0) {
                        RectF rectF7 = gm.P;
                        int i30 = lqbVar2.z1;
                        int i31 = lqbVar2.y1;
                        float f88 = i30 + i31;
                        float f89 = gqbVar7.g;
                        int i32 = i31;
                        float f90 = gqbVar7.e;
                        float f91 = f89 * f90;
                        float f92 = lqbVar2.f;
                        float f93 = f91 - f92;
                        float f94 = gqbVar7.f;
                        float f95 = f93 + f94;
                        float f96 = min;
                        float f97 = f95 / f96;
                        float f98 = lqbVar2.v1;
                        float f99 = ((f97 * f98) + f88) - (f89 <= 0.0f ? i32 : 0);
                        RectF rectF8 = gqbVar7.j;
                        float f100 = rectF8.top;
                        float f101 = gqbVar7.h;
                        float f102 = (((((f90 * f101) - f92) + f94) / f96) * f98) + f88;
                        if (f101 < 1.0f) {
                            i32 = 0;
                        }
                        rectF7.set(f99, f100, f102 + i32, rectF8.bottom);
                        lqbVar2.E.addRoundRect(rectF7, lqbVar2.u1, Path.Direction.CW);
                        canvas2.clipPath(lqbVar2.E, Region.Op.DIFFERENCE);
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
            float d5 = lqbVar2.d0.d(lqbVar2.F);
            float d6 = lqbVar2.e0.d(lqbVar2.F && lqbVar2.H);
            float roundHeight = lqbVar2.getRoundHeight() * d5;
            float f103 = ((lqbVar2.h == null && !lqbVar2.O && lqbVar2.s.isEmpty()) ? 1.0f : d6) * d5;
            if (d5 > 0.0f) {
                long j7 = lqbVar2.J;
                float f104 = j7;
                float f105 = lqbVar2.K;
                f18 = f16;
                float f106 = lqbVar2.I;
                float g2 = aq1.g(f105, f106, f104, f103, f10);
                f11 = aq1.g(lqbVar2.L, f106, f104, f103, f11);
                gqb gqbVar9 = lqbVar2.h;
                int i33 = lqbVar2.z1;
                int i34 = lqbVar2.y1;
                if (gqbVar9 != null) {
                    float f107 = min;
                    float R13 = ((((gm.R1(f105, 0.0f, d6) * lqbVar2.I) + (j7 - lqbVar2.f)) / f107) * lqbVar2.v1) + i33 + i34;
                    f17 = d6;
                    A = (b10.y(gm.R1(lqbVar2.L, 1.0f, d6), lqbVar2.I, lqbVar2.J - lqbVar2.f, f107) * lqbVar2.v1) + lqbVar2.z1 + lqbVar2.y1;
                    f35 = R13;
                } else {
                    f17 = d6;
                    float f108 = i33 + i34;
                    long j8 = j7 - lqbVar2.f;
                    float f109 = min;
                    float f110 = lqbVar2.v1;
                    float f111 = ((j8 / f109) * f110) + f108;
                    A = b10.A(j8 + r12, f109, f110, f108);
                    f35 = f111;
                }
                RectF rectF9 = lqbVar2.y0;
                float f112 = lqbVar2.y1;
                rectF9.set(f35 - f112, f53 - roundHeight, A + f112, f53);
                float f113 = f53 - ((f15 * d5) + roundHeight);
                RectF rectF10 = lqbVar2.y0;
                f14 = (rectF10.top * f103) + f14;
                f13 = (rectF10.bottom * f103) + f13;
                lqbVar2.z0.rewind();
                lqbVar2.z0.addRoundRect(lqbVar2.y0, gm.L(8.0f), gm.L(8.0f), Path.Direction.CW);
                canvas2.save();
                canvas2.clipPath(lqbVar2.z0);
                jqb jqbVar3 = lqbVar2.N;
                if (jqbVar3 != null) {
                    int i35 = (lqbVar2.I > 0L ? 1 : (lqbVar2.I == 0L ? 0 : -1));
                    if (i35 <= 0) {
                        i6 = i35;
                        f36 = f113;
                        f38 = 0.0f;
                    } else {
                        i6 = i35;
                        f36 = f113;
                        f38 = (((lqbVar2.J - lqbVar2.f) / min) * lqbVar2.v1) + lqbVar2.z1 + lqbVar2.y1;
                    }
                    float f114 = lqbVar2.y1;
                    float f115 = f38 - f114;
                    float f116 = (i6 <= 0 ? 0.0f : lqbVar2.z1 + r4 + ((((lqbVar2.J + r7) - lqbVar2.f) / min) * lqbVar2.v1)) + f114;
                    int i36 = jqbVar3.f;
                    float f117 = f115 - (lqbVar2.h != null ? (((lqbVar2.J - lqbVar2.f) / min) * lqbVar2.v1) + (r7 + lqbVar2.y1) : lqbVar2.z1);
                    float f118 = i36;
                    int max4 = (int) Math.max(0.0d, Math.floor(f117 / f118));
                    int min4 = (int) Math.min(lqbVar2.N.c, Math.ceil((f116 - f115) / f118) + 1.0d);
                    int i37 = (int) lqbVar2.y0.top;
                    boolean z11 = lqbVar2.N.d.size() >= min4;
                    if (z11) {
                        for (int i38 = max4; i38 < Math.min(lqbVar2.N.d.size(), min4); i38++) {
                            if (((iqb) lqbVar2.N.d.get(i38)).a == null) {
                                z4 = false;
                                break;
                            }
                        }
                    }
                    z4 = z11;
                    if (!z4) {
                        if (lqbVar2.l0.c()) {
                            lqbVar2.m0.a(canvas2);
                            canvas2.drawColor(855638016);
                        } else if (paint4 == null) {
                            canvas2.drawColor(TLObject.FLAG_30);
                        } else {
                            canvas2.drawRect(lqbVar2.y0, paint4);
                            canvas2.drawColor(855638016);
                        }
                    }
                    if (i36 != 0) {
                        float f119 = f115;
                        while (max4 < Math.min(lqbVar2.N.d.size(), min4)) {
                            iqb iqbVar3 = (iqb) lqbVar2.N.d.get(max4);
                            if (iqbVar3.a != null) {
                                i7 = min4;
                                z5 = z11;
                                lqbVar2.v0.setAlpha((int) (iqbVar3.b.e(false, 1.0f) * 255.0f));
                                canvas2.drawBitmap(iqbVar3.a, f119, i37 - ((int) ((r2.getHeight() - roundHeight) / f9)), lqbVar2.v0);
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
                        lqbVar2.N.b();
                    }
                } else {
                    f36 = f113;
                }
                lqbVar2.x0.rewind();
                RectF rectF11 = gm.P;
                int i39 = lqbVar2.z1;
                int i40 = lqbVar2.y1;
                float f120 = i39 + i40;
                float f121 = lqbVar2.K;
                float f122 = lqbVar2.I;
                float f123 = lqbVar2.f;
                float f124 = lqbVar2.J;
                float f125 = ((f121 * f122) - f123) + f124;
                float f126 = min;
                float f127 = lqbVar2.v1;
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
                RectF rectF12 = lqbVar2.y0;
                float f131 = rectF12.top;
                float f132 = lqbVar2.L;
                rectF11.set(f130, f131, (((((f122 * f132) - f123) + f124) / f126) * f37) + f120 + (f132 >= 1.0f ? i40 : 0) + f129, rectF12.bottom);
                lqbVar2.x0.addRoundRect(rectF11, lqbVar2.u1, Path.Direction.CW);
                canvas2.clipPath(lqbVar2.x0, Region.Op.DIFFERENCE);
                canvas2.drawColor(1342177280);
                canvas2.restore();
                f53 = f36;
                f10 = g2;
            } else {
                f17 = d6;
                f18 = f16;
            }
            float d7 = lqbVar2.f0.d(lqbVar2.O);
            float d8 = lqbVar2.g0.d(lqbVar2.O && lqbVar2.Q);
            float audioHeight = lqbVar2.getAudioHeight() * d7;
            float f133 = ((lqbVar2.h == null && !lqbVar2.F && lqbVar2.s.isEmpty()) ? 1.0f : d8) * d7;
            if (d7 > 0.0f) {
                float f134 = lqbVar2.R;
                float f135 = lqbVar2.T;
                float f136 = lqbVar2.S;
                float g3 = aq1.g(f135, f136, f134, f133, f10);
                float g4 = aq1.g(lqbVar2.U, f136, f134, f133, f11);
                Paint c3 = lqbVar2.n0.c(d7);
                canvas2.save();
                if (lqbVar2.h == null && !lqbVar2.F && lqbVar2.s.isEmpty()) {
                    float f137 = lqbVar2.z1 + lqbVar2.y1;
                    paint = paint4;
                    long j9 = lqbVar2.R - lqbVar2.f;
                    float f138 = min;
                    float f139 = lqbVar2.v1;
                    y = b10.A(j9 + lqbVar2.S, f138, f139, f137);
                    R1 = ((j9 / f138) * f139) + f137;
                    f32 = d8;
                } else {
                    paint = paint4;
                    float f140 = min;
                    f32 = d8;
                    R1 = lqbVar2.z1 + lqbVar2.y1 + ((((gm.R1(lqbVar2.T, 0.0f, d8) * lqbVar2.S) + (lqbVar2.R - lqbVar2.f)) / f140) * lqbVar2.v1);
                    y = (b10.y(gm.R1(lqbVar2.U, 1.0f, d8), lqbVar2.S, lqbVar2.R - lqbVar2.f, f140) * lqbVar2.v1) + lqbVar2.z1 + lqbVar2.y1;
                }
                RectF rectF13 = lqbVar2.G0;
                float f141 = lqbVar2.y1;
                rectF13.set(R1 - f141, f53 - audioHeight, f141 + y, f53);
                RectF rectF14 = lqbVar2.G0;
                f14 = (rectF14.top * f133) + f14;
                f13 = (rectF14.bottom * f133) + f13;
                lqbVar2.H0.rewind();
                lqbVar2.H0.addRoundRect(lqbVar2.G0, gm.L(8.0f), gm.L(8.0f), Path.Direction.CW);
                canvas2.clipPath(lqbVar2.H0);
                sm0 sm0Var3 = lqbVar2.l0;
                if (sm0Var3 != null && sm0Var3.c()) {
                    lqbVar2.m0.a(canvas2);
                    canvas2.drawColor(cmb.p1(d7, 855638016));
                } else if (c3 == null) {
                    canvas2.drawColor(cmb.p1(d7, TLObject.FLAG_30));
                } else {
                    canvas2.drawRect(lqbVar2.G0, c3);
                    canvas2.drawColor(cmb.p1(d7, 855638016));
                }
                if (lqbVar2.b0 == null || (sm0Var = lqbVar2.l0) == null || !sm0Var.c()) {
                    j2 = min;
                    f33 = f32;
                    z3 = true;
                    if (lqbVar2.b0 != null && c3 != null) {
                        Paint c4 = lqbVar2.o0.c(d7 * 0.4f);
                        if (c4 == null) {
                            c4 = lqbVar2.I0;
                            c4.setAlpha((int) (64.0f * d7));
                        }
                        float e4 = lqbVar2.h0.e(!lqbVar2.V, lqbVar2.b0.e);
                        eqb eqbVar = lqbVar2.b0;
                        lqbVar2.V = eqbVar.c > 0;
                        lqbVar2.J0.b((((lqbVar2.R - lqbVar2.f) / j2) * lqbVar2.v1) + lqbVar2.z1 + lqbVar2.y1, R1, y, f33, j2, audioHeight, e4, lqbVar2.G0.bottom, eqbVar);
                        min = j2;
                        canvas2.drawPath(lqbVar2.J0, c4);
                        if (f33 >= 1.0f) {
                            int i41 = lqbVar2.z1;
                            float f142 = lqbVar2.y1 + i41;
                            float f143 = lqbVar2.R - lqbVar2.f;
                            float f144 = lqbVar2.T;
                            float f145 = lqbVar2.S;
                            float f146 = min;
                            float f147 = lqbVar2.v1;
                            float f148 = ((((f144 * f145) + f143) / f146) * f147) + f142;
                            float f149 = ((((lqbVar2.U * f145) + f143) / f146) * f147) + f142;
                            float min5 = (Math.min(lqbVar2.w1 - lqbVar2.z1, f149) + Math.max(i41, f148)) / f9;
                            float centerY3 = lqbVar2.G0.centerY();
                            float max5 = Math.max(0.0f, (Math.min(lqbVar2.w1 - lqbVar2.z1, f149) - Math.max(lqbVar2.z1, f148)) - gm.L(24.0f));
                            float N = gm.N(13.0f) + ((lqbVar2.N0 == null && lqbVar2.R0 == null) ? 0.0f : lqbVar2.S0 + gm.N(9.66f) + gm.N(3.11f) + lqbVar2.O0);
                            boolean z12 = N < max5 ? z3 : false;
                            float min6 = min5 - (Math.min(N, max5) / f9);
                            lqbVar2.L0.setBounds((int) min6, (int) (centerY3 - (gm.L(13.0f) / f9)), (int) (gm.L(13.0f) + min6), (int) ((gm.L(13.0f) / f9) + centerY3));
                            float f150 = 1.0f - f33;
                            float f151 = f150 * 255.0f;
                            lqbVar2.L0.setAlpha((int) f151);
                            lqbVar2.L0.draw(canvas2);
                            float N2 = gm.N(16.11f) + min6;
                            f19 = d7;
                            boolean z13 = z12;
                            f22 = f5;
                            f23 = 0.0f;
                            d = 0.0d;
                            f20 = f33;
                            f21 = f6;
                            canvas2.saveLayerAlpha(0.0f, 0.0f, lqbVar2.w1, lqbVar2.x1, nm7.d4, 31);
                            float min7 = Math.min(f149, lqbVar2.w1) - gm.L(12.0f);
                            canvas2.clipRect(N2, 0.0f, min7, lqbVar2.x1);
                            if (lqbVar2.N0 != null) {
                                canvas2.save();
                                hg9.m(lqbVar2.N0.getHeight(), 2.0f, centerY3, N2 - lqbVar2.P0, canvas2);
                                lqbVar2.M0.setAlpha((int) (f151 * f19));
                                lqbVar2.N0.draw(canvas2);
                                canvas2.restore();
                                f34 = lqbVar2.O0 + N2;
                            } else {
                                f34 = N2;
                            }
                            if (lqbVar2.N0 != null && lqbVar2.R0 != null) {
                                float N3 = gm.N(3.66f) + f34;
                                int alpha = lqbVar2.K0.getAlpha();
                                lqbVar2.K0.setAlpha((int) (alpha * f150));
                                canvas2.drawCircle(gm.L(1.0f) + N3, centerY3, gm.L(1.0f), lqbVar2.K0);
                                lqbVar2.K0.setAlpha(alpha);
                                f34 = gm.N(2.0f) + N3 + gm.N(4.0f);
                            }
                            if (lqbVar2.R0 != null) {
                                canvas2.save();
                                hg9.m(lqbVar2.R0.getHeight(), 2.0f, centerY3, f34 - lqbVar2.T0, canvas2);
                                lqbVar2.Q0.setAlpha((int) (f151 * f19));
                                lqbVar2.R0.draw(canvas2);
                                canvas2.restore();
                            }
                            if (!z13) {
                                lqbVar2.V0.reset();
                                lqbVar2.V0.postScale(gm.N(8.0f) / 16.0f, 1.0f);
                                lqbVar2.V0.postTranslate(min7 - gm.L(8.0f), 0.0f);
                                lqbVar2.U0.setLocalMatrix(lqbVar2.V0);
                                RectF rectF15 = lqbVar2.G0;
                                canvas2.drawRect(min7 - gm.L(8.0f), rectF15.top, min7, rectF15.bottom, lqbVar2.W0);
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
                    float e5 = lqbVar2.h0.e(!lqbVar2.V, lqbVar2.b0.e);
                    eqb eqbVar2 = lqbVar2.b0;
                    lqbVar2.V = eqbVar2.c > 0;
                    f33 = f32;
                    lqbVar2.J0.b((((lqbVar2.R - lqbVar2.f) / min) * lqbVar2.v1) + lqbVar2.z1 + lqbVar2.y1, R1, y, f33, min, audioHeight, e5, lqbVar2.G0.bottom, eqbVar2);
                    j2 = min;
                    canvas2.saveLayerAlpha(lqbVar2.G0, nm7.m1, 31);
                    canvas2.clipPath(lqbVar2.J0);
                    lqbVar2.o0.a(canvas2);
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
            float f154 = lqbVar2.z1 + lqbVar2.y1;
            float f155 = lqbVar2.f;
            float f156 = min;
            float f157 = lqbVar2.v1;
            float f158 = (((f10 - f155) / f156) * f157) + f154;
            float f159 = (((f11 - f155) / f156) * f157) + f154;
            if (!lqbVar2.s.isEmpty()) {
                f25 = f23;
                f26 = d5;
                f24 = f19;
                f19 = f18;
            } else if (lqbVar2.O && lqbVar2.h == null) {
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
                if (lqbVar2.h == null && !lqbVar2.F && lqbVar2.s.isEmpty()) {
                    f27 = f20;
                    f28 = f24 * gm.R1(0.6f, 1.0f, f27);
                } else {
                    f27 = f20;
                    f28 = 1.0f;
                }
                Paint paint5 = paint;
                lqbVar2.d(canvas, paint5, f153, f152, f158, f159, f28 * f19);
                gqb gqbVar10 = lqbVar2.h;
                if (gqbVar10 != null && ((lqbVar2.O || lqbVar2.F) && (f27 > f25 || f17 > f25))) {
                    float f161 = lqbVar2.x1 - lqbVar2.A1;
                    float f162 = lqbVar2.y1 + lqbVar2.z1;
                    float f163 = gqbVar10.g;
                    float f164 = gqbVar10.e;
                    float f165 = lqbVar2.f;
                    float f166 = lqbVar2.v1;
                    float f167 = ((((gqbVar10.h * f164) - f165) / f156) * f166) + f162;
                    canvas3 = canvas;
                    lqbVar2.d(canvas3, paint5, f161 - f12, f161, ((((f163 * f164) - f165) / f156) * f166) + f162, f167, 0.8f);
                } else if (lqbVar2.w != null) {
                    i4 = 1;
                    if (lqbVar2.s.size() > 1) {
                        gqb gqbVar11 = lqbVar2.w;
                        RectF rectF16 = gqbVar11.j;
                        float f168 = rectF16.top;
                        float f169 = rectF16.bottom;
                        float f170 = lqbVar2.y1 + lqbVar2.z1;
                        float f171 = gqbVar11.f;
                        float f172 = gqbVar11.g;
                        float f173 = gqbVar11.e;
                        float f174 = lqbVar2.f;
                        float f175 = lqbVar2.v1;
                        float f176 = (((((f172 * f173) + f171) - f174) / f156) * f175) + f170;
                        float f177 = (((((gqbVar11.h * f173) + f171) - f174) / f156) * f175) + f170;
                        canvas3 = canvas;
                        lqbVar2.d(canvas3, paint5, f168, f169, f176, f177, 0.8f);
                    } else {
                        canvas3 = canvas;
                    }
                    lqbVar = lqbVar2;
                    if (lqbVar.c0 > i4 && (gqbVar3 = lqbVar.h) != null) {
                        float f178 = gqbVar3.e;
                        float f179 = gqbVar3.h;
                        float f180 = gqbVar3.g;
                        j = (long) ((f179 - f180) * f178);
                        if (j > 68999) {
                            float f181 = lqbVar.z1 + lqbVar.y1;
                            i = i4;
                            float f182 = lqbVar.f;
                            float f183 = lqbVar.v1;
                            float f184 = ((((f180 * f178) - f182) / f156) * f183) + f181;
                            float f185 = ((((f179 * f178) - f182) / f156) * f183) + f181;
                            canvas3.save();
                            float f186 = lqbVar.x1 - lqbVar.A1;
                            canvas3.clipRect(f184, f186 - f12, f185, f186);
                            lqbVar.A0.setAlpha((int) (gm.R1(0.8f, 1.0f, f22) * 255.0f));
                            long j10 = 59000;
                            int min8 = (int) Math.min(lqbVar.c0 - 1, j / 59000);
                            int i42 = i;
                            while (i42 <= min8) {
                                if (Math.min(j10, j - (i42 * j10)) < 1000) {
                                    break;
                                }
                                float f187 = lqbVar.z1 + lqbVar.y1;
                                gqb gqbVar12 = lqbVar.h;
                                float f188 = ((((((long) (gqbVar12.e * gqbVar12.g)) + r2) - lqbVar.f) / f156) * lqbVar.v1) + f187;
                                Canvas canvas4 = canvas3;
                                canvas4.drawRect(f188, (lqbVar.x1 - lqbVar.A1) - f12, gm.L(1.0f) + f188, lqbVar.x1 - lqbVar.A1, lqbVar.A0);
                                canvas3 = canvas4;
                                StringBuilder sb = new StringBuilder("#");
                                i42++;
                                sb.append(i42);
                                canvas3.drawText(sb.toString(), f188 + gm.L(2.0f), ((lqbVar.x1 - lqbVar.A1) - f12) + gm.L(14.0f), lqbVar.F0);
                                j10 = 59000;
                            }
                            canvas3.restore();
                            e = lqbVar.c1.e(false, f25);
                            float contentHeight = ((lqbVar.x1 - lqbVar.getContentHeight()) + lqbVar.A1) - gm.N(2.3f);
                            float N4 = (lqbVar.x1 - lqbVar.A1) + gm.N(4.3f);
                            if (e > 0.0f) {
                                long j11 = lqbVar.d1;
                                if (j11 == -1) {
                                    gqb gqbVar13 = lqbVar.h;
                                    if (gqbVar13 != null) {
                                        j11 = (long) (gqbVar13.e * gqbVar13.h);
                                    } else {
                                        gqb gqbVar14 = lqbVar.w;
                                        if (gqbVar14 != null) {
                                            j11 = (long) ((gqbVar14.h - gqbVar14.g) * gqbVar14.e);
                                        } else {
                                            if (lqbVar.F) {
                                                f30 = lqbVar.I;
                                                f31 = lqbVar.L;
                                            } else {
                                                f30 = lqbVar.S;
                                                f31 = lqbVar.U;
                                            }
                                            j11 = (long) (f30 * f31);
                                        }
                                    }
                                }
                                Canvas canvas5 = canvas3;
                                f29 = contentHeight;
                                lqbVar2 = lqbVar;
                                lqbVar2.c(f29, N4, e * f19, j11, canvas5);
                            } else {
                                f29 = contentHeight;
                                lqbVar2 = lqbVar;
                            }
                            lqbVar2.c(f29, N4, (1.0f - e) * f19, lqbVar2.e, canvas);
                        }
                    }
                    i = i4;
                    e = lqbVar.c1.e(false, f25);
                    float contentHeight2 = ((lqbVar.x1 - lqbVar.getContentHeight()) + lqbVar.A1) - gm.N(2.3f);
                    float N42 = (lqbVar.x1 - lqbVar.A1) + gm.N(4.3f);
                    if (e > 0.0f) {
                    }
                    lqbVar2.c(f29, N42, (1.0f - e) * f19, lqbVar2.e, canvas);
                } else {
                    canvas3 = canvas;
                }
                lqbVar = lqbVar2;
                i4 = 1;
                if (lqbVar.c0 > i4) {
                    float f1782 = gqbVar3.e;
                    float f1792 = gqbVar3.h;
                    float f1802 = gqbVar3.g;
                    j = (long) ((f1792 - f1802) * f1782);
                    if (j > 68999) {
                    }
                }
                i = i4;
                e = lqbVar.c1.e(false, f25);
                float contentHeight22 = ((lqbVar.x1 - lqbVar.getContentHeight()) + lqbVar.A1) - gm.N(2.3f);
                float N422 = (lqbVar.x1 - lqbVar.A1) + gm.N(4.3f);
                if (e > 0.0f) {
                }
                lqbVar2.c(f29, N422, (1.0f - e) * f19, lqbVar2.e, canvas);
            } else {
                i = 1;
            }
            if (z2) {
                canvas.restore();
            }
        } else {
            i = 1;
        }
        if (lqbVar2.n1) {
            float f189 = 1.0f / (1000.0f / gm.r);
            float f190 = lqbVar2.o1;
            long L4 = (long) ((gm.L(32.0f) / lqbVar2.v1) * min * f189 * f190);
            if (lqbVar2.Y0) {
                lqbVar2.o1 = (f189 * 0.25f) + f190;
            }
            int i43 = lqbVar2.i1;
            if (i43 == 4 && (gqbVar2 = lqbVar2.h) != null) {
                float f191 = gqbVar2.g;
                long j12 = lqbVar2.f;
                long j13 = gqbVar2.e;
                float f192 = j13;
                if (f191 < j12 / f192) {
                    i3 = -1;
                } else if (gqbVar2.h > (j12 + min) / f192) {
                    i3 = i;
                } else {
                    lqbVar2.o1 = 1.0f;
                    i3 = 0;
                }
                long j14 = i3 * L4;
                lqbVar2.f = Utilities.k(j12 + j14, j13 - min, 0L);
                lqbVar2.e += j14;
                gqb gqbVar15 = lqbVar2.h;
                float f193 = (r3 - j12) / gqbVar15.e;
                if (f193 > 0.0f) {
                    f3 = 1.0f;
                    max = Math.min(1.0f - gqbVar15.h, f193);
                } else {
                    f3 = 1.0f;
                    max = Math.max(0.0f - gqbVar15.g, f193);
                }
                gqb gqbVar16 = lqbVar2.h;
                gqbVar16.g = Utilities.i(gqbVar16.g + max, f3, 0.0f);
                gqb gqbVar17 = lqbVar2.h;
                gqbVar17.h = Utilities.i(gqbVar17.h + max, f3, 0.0f);
                fqb fqbVar = lqbVar2.a;
                if (fqbVar != null) {
                    fqbVar.X(false, lqbVar2.h.g);
                    lqbVar2.a.S1(lqbVar2.h.h);
                }
                lqbVar2.invalidate();
            } else if (i43 == 8) {
                float f194 = lqbVar2.T;
                long j15 = lqbVar2.R;
                float f195 = (-j15) + 100;
                long j16 = lqbVar2.S;
                float f196 = j16;
                if (f194 < f195 / f196) {
                    i2 = -1;
                } else if (lqbVar2.U >= ((r8 + min) - 100) / f196) {
                    i2 = i;
                } else {
                    lqbVar2.o1 = 1.0f;
                    i2 = 0;
                }
                if (i2 != 0) {
                    if (lqbVar2.Q && (gqbVar = lqbVar2.h) != null) {
                        long j17 = j15 - (i2 * L4);
                        float f197 = gqbVar.h;
                        float f198 = gqbVar.e;
                        k = Utilities.k(j17, (long) ((f197 * f198) - (f194 * f196)), (long) ((gqbVar.g * f198) - (lqbVar2.U * f196)));
                        lqbVar2.R = k;
                    } else if (lqbVar2.H && lqbVar2.F) {
                        long j18 = j15 - (i2 * L4);
                        float f199 = lqbVar2.L;
                        float f200 = lqbVar2.I;
                        k = Utilities.k(j18, (long) ((f199 * f200) - (f194 * f196)), (long) ((lqbVar2.K * f200) - (lqbVar2.U * f196)));
                        lqbVar2.R = k;
                    } else {
                        k = Utilities.k(j15 - (i2 * L4), 0L, -(j16 - Math.min(lqbVar2.getBaseDuration(), lqbVar2.getMaxScrollDuration())));
                        lqbVar2.R = k;
                    }
                    float f201 = (-(k - j15)) / lqbVar2.S;
                    float min9 = f201 > 0.0f ? Math.min(1.0f - lqbVar2.U, f201) : Math.max(0.0f - lqbVar2.T, f201);
                    if (lqbVar2.h == null) {
                        float f202 = lqbVar2.e;
                        float f203 = lqbVar2.S;
                        lqbVar2.e = (long) Utilities.i((min9 * f203) + f202, f203, 0.0f);
                    }
                    lqbVar2.T = Utilities.i(lqbVar2.T + min9, 1.0f, 0.0f);
                    lqbVar2.U = Utilities.i(lqbVar2.U + min9, 1.0f, 0.0f);
                    fqb fqbVar2 = lqbVar2.a;
                    if (fqbVar2 != null) {
                        fqbVar2.H1(lqbVar2.T);
                        lqbVar2.a.v1(lqbVar2.U);
                        lqbVar2.a.C(lqbVar2.e, false);
                    }
                    lqbVar2.invalidate();
                } else {
                    lqbVar2.o1 = 1.0f;
                }
            } else {
                lqbVar2.o1 = 1.0f;
            }
        } else {
            lqbVar2.o1 = 1.0f;
        }
        int contentHeight3 = lqbVar2.getContentHeight();
        if (lqbVar2.c != contentHeight3) {
            lqbVar2.c = contentHeight3;
            Runnable runnable = lqbVar2.d;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public final void e(ViewGroup viewGroup, ylb ylbVar, sm0 sm0Var, i9b i9bVar) {
        int i;
        int i2 = this.k1;
        final byte b = 0;
        final byte b2 = 2;
        try {
            if (i2 == 2 && this.O) {
                mla mlaVar = new mla(getContext(), 0);
                mlaVar.b = 0.0f;
                mlaVar.c = 1.5f;
                mlaVar.c(this.W);
                mlaVar.h = new qac(this) { // from class: dqb
                    public final /* synthetic */ lqb b;

                    {
                        this.b = this;
                    }

                    @Override // qac
                    public final void a(Object obj) {
                        byte b3 = b;
                        lqb lqbVar = this.b;
                        Float f = (Float) obj;
                        switch (b3) {
                            case 0:
                                lqbVar.getClass();
                                lqbVar.W = f.floatValue();
                                fqb fqbVar = lqbVar.a;
                                if (fqbVar != null) {
                                    fqbVar.y(f.floatValue());
                                    break;
                                }
                                break;
                            case 1:
                                lqbVar.getClass();
                                lqbVar.M = f.floatValue();
                                fqb fqbVar2 = lqbVar.a;
                                if (fqbVar2 != null) {
                                    fqbVar2.s(f.floatValue());
                                    break;
                                }
                                break;
                            default:
                                lqbVar.h.i = f.floatValue();
                                fqb fqbVar3 = lqbVar.a;
                                if (fqbVar3 != null) {
                                    fqbVar3.K0(f.floatValue());
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
                float min2 = Math.min((i3 - i4) - i5, ((((gm.R1(this.U, 1.0f, this.g0.c) * this.S) + (this.R - this.f)) / min) * this.v1) + i4 + i5);
                bu5 G = bu5.G(viewGroup, ylbVar, this);
                G.p(mlaVar);
                G.n(true);
                G.b(R.drawable.msg_delete, jb6.M0(2131744409, null), new cqb(this, (byte) 1), false);
                G.W(5);
                G.X = true;
                G.b0((-(this.w1 - min2)) + gm.L(18.0f), this.G0.top);
                G.a0();
                G.S(sm0Var, -i9bVar.getX(), -i9bVar.getY());
                performHapticFeedback(0, 1);
            } else {
                final byte b3 = 1;
                if (i2 == 1 && this.F) {
                    mla mlaVar2 = new mla(getContext(), 0);
                    mlaVar2.b = 0.0f;
                    mlaVar2.c = 1.5f;
                    mlaVar2.c(this.M);
                    mlaVar2.h = new qac(this) { // from class: dqb
                        public final /* synthetic */ lqb b;

                        {
                            this.b = this;
                        }

                        @Override // qac
                        public final void a(Object obj) {
                            byte b32 = b3;
                            lqb lqbVar = this.b;
                            Float f = (Float) obj;
                            switch (b32) {
                                case 0:
                                    lqbVar.getClass();
                                    lqbVar.W = f.floatValue();
                                    fqb fqbVar = lqbVar.a;
                                    if (fqbVar != null) {
                                        fqbVar.y(f.floatValue());
                                        break;
                                    }
                                    break;
                                case 1:
                                    lqbVar.getClass();
                                    lqbVar.M = f.floatValue();
                                    fqb fqbVar2 = lqbVar.a;
                                    if (fqbVar2 != null) {
                                        fqbVar2.s(f.floatValue());
                                        break;
                                    }
                                    break;
                                default:
                                    lqbVar.h.i = f.floatValue();
                                    fqb fqbVar3 = lqbVar.a;
                                    if (fqbVar3 != null) {
                                        fqbVar3.K0(f.floatValue());
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
                    float min4 = Math.min((i6 - i7) - i8, ((((gm.R1(this.L, 1.0f, this.e0.c) * this.I) + (this.J - this.f)) / min3) * this.v1) + i7 + i8);
                    bu5 G2 = bu5.G(viewGroup, ylbVar, this);
                    G2.p(mlaVar2);
                    G2.n(true);
                    G2.b(R.drawable.msg_delete, jb6.M0(2131744173, null), new cqb(this, b2), false);
                    G2.W(5);
                    G2.X = true;
                    G2.b0((-(this.w1 - min4)) + gm.L(18.0f), this.y0.top);
                    G2.a0();
                    G2.S(sm0Var, -i9bVar.getX(), -i9bVar.getY());
                    performHapticFeedback(0, 1);
                } else if (i2 == 0 && this.h != null) {
                    mla mlaVar3 = new mla(getContext(), 0);
                    mlaVar3.b = 0.0f;
                    mlaVar3.c = 1.5f;
                    mlaVar3.c(this.h.i);
                    mlaVar3.h = new qac(this) { // from class: dqb
                        public final /* synthetic */ lqb b;

                        {
                            this.b = this;
                        }

                        @Override // qac
                        public final void a(Object obj) {
                            byte b32 = b2;
                            lqb lqbVar = this.b;
                            Float f = (Float) obj;
                            switch (b32) {
                                case 0:
                                    lqbVar.getClass();
                                    lqbVar.W = f.floatValue();
                                    fqb fqbVar = lqbVar.a;
                                    if (fqbVar != null) {
                                        fqbVar.y(f.floatValue());
                                        break;
                                    }
                                    break;
                                case 1:
                                    lqbVar.getClass();
                                    lqbVar.M = f.floatValue();
                                    fqb fqbVar2 = lqbVar.a;
                                    if (fqbVar2 != null) {
                                        fqbVar2.s(f.floatValue());
                                        break;
                                    }
                                    break;
                                default:
                                    lqbVar.h.i = f.floatValue();
                                    fqb fqbVar3 = lqbVar.a;
                                    if (fqbVar3 != null) {
                                        fqbVar3.K0(f.floatValue());
                                        break;
                                    }
                                    break;
                            }
                        }
                    };
                    bu5 G3 = bu5.G(viewGroup, ylbVar, this);
                    G3.p(mlaVar3);
                    G3.W(5);
                    G3.X = true;
                    G3.b0(gm.L(18.0f), this.u0.top);
                    G3.a0();
                    G3.S(sm0Var, -i9bVar.getX(), -i9bVar.getY());
                    performHapticFeedback(0, 1);
                } else {
                    if (i2 != 3 || (i = this.l1) < 0) {
                        return;
                    }
                    ArrayList arrayList = this.s;
                    if (i >= arrayList.size()) {
                        return;
                    }
                    gqb gqbVar = (gqb) arrayList.get(this.l1);
                    mla mlaVar4 = new mla(getContext(), 0);
                    mlaVar4.b = 0.0f;
                    mlaVar4.c = 1.5f;
                    mlaVar4.c(gqbVar.i);
                    mlaVar4.h = new ts9(this, gqbVar, (byte) 19);
                    bu5 G4 = bu5.G(viewGroup, ylbVar, this);
                    G4.p(mlaVar4);
                    G4.W(5);
                    G4.X = true;
                    G4.b0(gm.L(18.0f), gqbVar.j.top);
                    G4.a0();
                    G4.S(sm0Var, -i9bVar.getX(), -i9bVar.getY());
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
        return (int) (this.A1 + (this.h != null ? getVideoHeight() + gm.L(4.0f) : 0.0f) + (this.s.isEmpty() ? 0.0f : getCollageHeight() + gm.L(4.0f)) + (this.F ? getRoundHeight() + gm.L(4.0f) : 0.0f) + (this.O ? gm.L(4.0f) + getAudioHeight() : 0.0f) + this.A1);
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
        return gm.U1(this.j0.c, gm.L(28.0f) + this.A1 + this.A1, getContentHeight());
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
        gqb gqbVar = this.h;
        if (gqbVar == null && !this.F) {
            long j5 = this.R;
            long k3 = Utilities.k(j5 + ((long) f), 0L, -(this.S - Math.min(getBaseDuration(), getMaxScrollDuration())));
            this.R = k3;
            float f5 = k3 - j5;
            this.T = Utilities.i(this.T - (f5 / this.S), 1.0f, 0.0f);
            this.U = Utilities.i(this.U - (f5 / this.S), 1.0f, 0.0f);
            fqb fqbVar = this.a;
            if (fqbVar != null) {
                fqbVar.H1(this.T);
                this.a.v1(this.U);
            }
        } else if (this.Q) {
            if (gqbVar != null) {
                float f6 = gqbVar.g;
                long j6 = gqbVar.e;
                f2 = j6 * f6;
                float f7 = gqbVar.h;
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
                fqb fqbVar2 = this.a;
                if (fqbVar2 != null) {
                    fqbVar2.H1(this.T);
                    this.a.v1(this.U);
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
                fqb fqbVar3 = this.a;
                if (fqbVar3 != null) {
                    fqbVar3.H1(this.T);
                    this.a.v1(this.U);
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
        fqb fqbVar4 = this.a;
        if (fqbVar4 != null) {
            fqbVar4.k2(this.R + ((long) (this.T * this.S)));
        }
        if (!this.n1) {
            fqb fqbVar5 = this.a;
            if (fqbVar5 != null) {
                fqbVar5.w0(true);
                gqb gqbVar2 = this.h;
                if (gqbVar2 != null) {
                    long j18 = this.R + ((long) (this.T * this.S));
                    float f17 = gqbVar2.h;
                    float f18 = gqbVar2.e;
                    k2 = Utilities.k(j18, (long) (f17 * f18), (long) (gqbVar2.g * f18));
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
                fqb fqbVar6 = this.a;
                this.e = k2;
                fqbVar6.C(k2, false);
                return;
            }
            if (!this.s1) {
                return;
            }
        }
        gqb gqbVar3 = this.h;
        if (gqbVar3 != null) {
            long j21 = this.R + ((long) (this.T * this.S));
            float f22 = gqbVar3.h;
            float f23 = gqbVar3.e;
            k = Utilities.k(j21, (long) (f22 * f23), (long) (gqbVar3.g * f23));
            this.e = k;
        } else if (!this.F || gqbVar3 == null) {
            float f24 = this.T;
            long j22 = this.S;
            k = Utilities.k((long) (f24 * j22), j22, 0L);
            this.e = k;
        } else {
            long j23 = this.R + ((long) (this.T * this.S));
            float f25 = this.L;
            float f26 = gqbVar3.e;
            k = Utilities.k(j23, (long) (f25 * f26), (long) (this.K * f26));
            this.e = k;
        }
        fqb fqbVar7 = this.a;
        if (fqbVar7 != null) {
            fqbVar7.C(k, false);
        }
    }

    public final void i(gqb gqbVar, float f) {
        long k;
        long k2;
        long j;
        long j2;
        long j3;
        long j4;
        if (gqbVar != null) {
            gqb gqbVar2 = this.w;
            if (gqbVar2 != gqbVar && gqbVar2 != null) {
                if (this.n == this.s.indexOf(gqbVar)) {
                    gqb gqbVar3 = this.w;
                    float f2 = gqbVar3.e;
                    float f3 = gqbVar.h;
                    float f4 = gqbVar.e;
                    long j5 = (long) ((f2 * 1.0f) - (f3 * f4));
                    float f5 = gqbVar.g;
                    long j6 = (long) ((f2 * 0.0f) - (f5 * f4));
                    float min = Math.min(f3 - f5, ((gqbVar3.h - gqbVar3.g) * f2) / f4);
                    long j7 = gqbVar.f;
                    long j8 = (long) f;
                    long j9 = j7 + j8;
                    if (j9 > j5) {
                        float i = Utilities.i((((this.w.h * r2.e) - j7) - j8) / gqbVar.e, 1.0f, min);
                        gqbVar.h = i;
                        float i2 = Utilities.i(i - min, 1.0f, 0.0f);
                        gqbVar.g = i2;
                        gqb gqbVar4 = this.w;
                        float f6 = gqbVar4.h;
                        float f7 = gqbVar4.e;
                        float f8 = gqbVar.h;
                        float f9 = gqbVar.e;
                        long j10 = (long) ((f6 * f7) - (f8 * f9));
                        long j11 = (long) ((gqbVar4.g * f7) - (i2 * f9));
                        if (j10 < j11) {
                            j4 = j11;
                            j3 = j10;
                        } else {
                            j3 = j11;
                            j4 = j10;
                        }
                        gqbVar.f = Utilities.k(gqbVar.f + j8, j4, j3);
                        fqb fqbVar = this.a;
                        if (fqbVar != null) {
                            fqbVar.s1(gqbVar.g, gqbVar.a);
                            this.a.R1(gqbVar.h, gqbVar.a);
                        }
                    } else if (j9 < j6) {
                        float i3 = Utilities.i((((this.w.g * r2.e) - j7) - j8) / gqbVar.e, 1.0f - min, 0.0f);
                        gqbVar.g = i3;
                        float i4 = Utilities.i(i3 + min, 1.0f, 0.0f);
                        gqbVar.h = i4;
                        gqb gqbVar5 = this.w;
                        float f10 = gqbVar5.h;
                        float f11 = gqbVar5.e;
                        float f12 = gqbVar.e;
                        long j12 = (long) ((f10 * f11) - (i4 * f12));
                        long j13 = (long) ((gqbVar5.g * f11) - (gqbVar.g * f12));
                        if (j12 < j13) {
                            j2 = j13;
                            j = j12;
                        } else {
                            j = j13;
                            j2 = j12;
                        }
                        gqbVar.f = Utilities.k(gqbVar.f + j8, j2, j);
                        fqb fqbVar2 = this.a;
                        if (fqbVar2 != null) {
                            fqbVar2.s1(gqbVar.g, gqbVar.a);
                            this.a.R1(gqbVar.h, gqbVar.a);
                        }
                    } else {
                        gqbVar.f = j9;
                    }
                } else {
                    long j14 = gqbVar.f + ((long) f);
                    float baseDuration = getBaseDuration();
                    float f13 = gqbVar.e;
                    gqbVar.f = Utilities.k(j14, (long) (baseDuration - (gqbVar.h * f13)), (long) ((-gqbVar.g) * f13));
                }
            }
            invalidate();
            fqb fqbVar3 = this.a;
            if (fqbVar3 != null) {
                fqbVar3.e2(gqbVar.a, gqbVar.f);
            }
            if (!this.n1) {
                fqb fqbVar4 = this.a;
                if (fqbVar4 != null) {
                    fqbVar4.w0(true);
                    gqb gqbVar6 = this.w;
                    if (gqbVar6 == gqbVar || gqbVar6 == null) {
                        float f14 = gqbVar.g;
                        long j15 = gqbVar.e;
                        k2 = Utilities.k((long) (f14 * j15), j15, 0L);
                    } else {
                        long j16 = gqbVar.f + ((long) (gqbVar.g * gqbVar.e));
                        float f15 = gqbVar6.h;
                        float f16 = gqbVar6.e;
                        k2 = Utilities.k(j16, (long) (f15 * f16), (long) (gqbVar6.g * f16));
                    }
                    gqb gqbVar7 = this.w;
                    if (gqbVar7 != gqbVar && gqbVar7 != null && Math.abs(this.e - k2) > 400) {
                        this.d1 = this.e;
                        this.c1.e(true, 1.0f);
                    }
                    fqb fqbVar5 = this.a;
                    this.e = k2;
                    fqbVar5.C(k2, false);
                    return;
                }
                if (!this.s1) {
                    return;
                }
            }
            gqb gqbVar8 = this.w;
            if (gqbVar8 == gqbVar || gqbVar8 == null) {
                float f17 = gqbVar.g;
                long j17 = gqbVar.e;
                k = Utilities.k((long) (f17 * j17), j17, 0L);
                this.e = k;
            } else {
                long j18 = gqbVar.f + ((long) (gqbVar.g * gqbVar.e));
                float f18 = gqbVar8.h;
                float f19 = gqbVar8.e;
                k = Utilities.k(j18, (long) (f18 * f19), (long) (gqbVar8.g * f19));
                this.e = k;
            }
            fqb fqbVar6 = this.a;
            if (fqbVar6 != null) {
                fqbVar6.C(k, false);
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
        gqb gqbVar = this.h;
        if (gqbVar == null) {
            long j5 = this.J;
            long k3 = Utilities.k(j5 + ((long) f), 0L, -(this.I - Math.min(getBaseDuration(), getMaxScrollDuration())));
            this.J = k3;
            float f2 = k3 - j5;
            this.K = Utilities.i(this.K - (f2 / this.I), 1.0f, 0.0f);
            this.L = Utilities.i(this.L - (f2 / this.I), 1.0f, 0.0f);
            fqb fqbVar = this.a;
            if (fqbVar != null) {
                fqbVar.n0(this.K);
                this.a.c2(this.L);
            }
        } else if (this.H) {
            float f3 = gqbVar.h;
            float f4 = gqbVar.e;
            float f5 = this.L;
            float f6 = this.I;
            long j6 = (long) ((f3 * f4) - (f5 * f6));
            float f7 = gqbVar.g;
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
                gqb gqbVar2 = this.h;
                float f9 = gqbVar2.h;
                float f10 = gqbVar2.e;
                float f11 = this.L;
                float f12 = this.I;
                long j11 = (long) ((f9 * f10) - (f11 * f12));
                long j12 = (long) ((gqbVar2.g * f10) - (i2 * f12));
                if (j11 < j12) {
                    j4 = j12;
                    j3 = j11;
                } else {
                    j3 = j12;
                    j4 = j11;
                }
                this.J = Utilities.k(this.J + j9, j4, j3);
                fqb fqbVar2 = this.a;
                if (fqbVar2 != null) {
                    fqbVar2.n0(this.K);
                    this.a.c2(this.L);
                }
            } else if (j10 < j7) {
                float i3 = Utilities.i((((this.h.g * r1.e) - j8) - j9) / this.I, 1.0f - min, 0.0f);
                this.K = i3;
                float i4 = Utilities.i(i3 + min, 1.0f, 0.0f);
                this.L = i4;
                gqb gqbVar3 = this.h;
                float f13 = gqbVar3.h;
                float f14 = gqbVar3.e;
                float f15 = this.I;
                long j13 = (long) ((f13 * f14) - (i4 * f15));
                long j14 = (long) ((gqbVar3.g * f14) - (this.K * f15));
                if (j13 < j14) {
                    j2 = j14;
                    j = j13;
                } else {
                    j = j14;
                    j2 = j13;
                }
                this.J = Utilities.k(this.J + j9, j2, j);
                fqb fqbVar3 = this.a;
                if (fqbVar3 != null) {
                    fqbVar3.n0(this.K);
                    this.a.c2(this.L);
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
        fqb fqbVar4 = this.a;
        if (fqbVar4 != null) {
            fqbVar4.f1(this.J + ((long) (this.K * this.I)));
        }
        if (!this.n1) {
            fqb fqbVar5 = this.a;
            if (fqbVar5 != null) {
                fqbVar5.w0(true);
                gqb gqbVar4 = this.h;
                if (gqbVar4 != null) {
                    long j16 = this.J + ((long) (this.K * this.I));
                    float f17 = gqbVar4.h;
                    float f18 = gqbVar4.e;
                    k2 = Utilities.k(j16, (long) (f17 * f18), (long) (gqbVar4.g * f18));
                } else {
                    float f19 = this.K;
                    long j17 = this.I;
                    k2 = Utilities.k((long) (f19 * j17), j17, 0L);
                }
                if (this.h != null && Math.abs(this.e - k2) > 400) {
                    this.d1 = this.e;
                    this.c1.e(true, 1.0f);
                }
                fqb fqbVar6 = this.a;
                this.e = k2;
                fqbVar6.C(k2, false);
                return;
            }
            if (!this.s1) {
                return;
            }
        }
        gqb gqbVar5 = this.h;
        if (gqbVar5 != null) {
            long j18 = this.J + ((long) (this.K * this.I));
            float f20 = gqbVar5.h;
            float f21 = gqbVar5.e;
            k = Utilities.k(j18, (long) (f20 * f21), (long) (gqbVar5.g * f21));
            this.e = k;
        } else {
            float f22 = this.K;
            long j19 = this.I;
            k = Utilities.k((long) (f22 * j19), j19, 0L);
            this.e = k;
        }
        fqb fqbVar7 = this.a;
        if (fqbVar7 != null) {
            fqbVar7.C(k, false);
        }
    }

    public final void k() {
        long min = Math.min(getBaseDuration(), getMaxScrollDuration());
        gqb gqbVar = this.h;
        float f = (gqbVar.h + gqbVar.g) / 2.0f;
        long j = gqbVar.e;
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
        gqb gqbVar = this.h;
        ArrayList arrayList = this.s;
        if (gqbVar == null && !this.O && arrayList.isEmpty()) {
            return false;
        }
        long min = Math.min(getBaseDuration(), getMaxScrollDuration());
        float f2 = ((f - this.z1) - this.y1) / this.v1;
        gqb gqbVar2 = this.w;
        long j = gqbVar2 != null ? (long) ((gqbVar2.g * gqbVar2.e) + gqbVar2.f) : 0L;
        float f3 = f2 * min;
        if (gqbVar2 == null) {
            j = this.h == null ? this.R : 0L;
        }
        long i = (long) Utilities.i((f3 - j) + this.f, getBaseDuration(), 0.0f);
        gqb gqbVar3 = this.h;
        if (gqbVar3 != null) {
            float f4 = i / gqbVar3.e;
            if (f4 < gqbVar3.g || f4 > gqbVar3.h) {
                return false;
            }
        }
        gqb gqbVar4 = this.w;
        if (gqbVar4 != null && (i < 0 || i >= ((long) ((gqbVar4.h - gqbVar4.g) * gqbVar4.e)))) {
            return false;
        }
        if (this.O && gqbVar3 == null && arrayList.isEmpty()) {
            float f5 = i / this.S;
            if (f5 < this.T || f5 > this.U) {
                return false;
            }
        }
        this.e = i;
        invalidate();
        fqb fqbVar = this.a;
        if (fqbVar != null) {
            fqbVar.C(i, z);
        }
        toa toaVar = this.e1;
        if (toaVar != null) {
            gm.r(toaVar);
            this.e1 = null;
        }
        if (!z) {
            return true;
        }
        toa toaVar2 = new toa(this, i, (byte) 7);
        this.e1 = toaVar2;
        gm.d3(toaVar2, 150L);
        return true;
    }

    public final void n(String str, long j, long j2, float f, float f2, float f3, boolean z) {
        boolean z2;
        long j3;
        boolean z3;
        gqb gqbVar;
        if (TextUtils.equals(this.G, str)) {
            return;
        }
        jqb jqbVar = this.N;
        if (jqbVar != null) {
            jqbVar.a();
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
            if (getMeasuredWidth() <= 0 || this.N != null || ((gqbVar = this.h) != null && gqbVar.e < 1)) {
                z2 = false;
                j3 = j4;
                z3 = true;
            } else {
                String str2 = this.G;
                int i = this.w1;
                int i2 = this.z1;
                int i3 = (i - i2) - i2;
                int L = gm.L(38.0f);
                long j5 = this.I;
                Long valueOf = j5 > 2 ? Long.valueOf(j5) : null;
                gqb gqbVar2 = this.h;
                j3 = j4;
                z2 = false;
                z3 = true;
                this.N = new jqb(this, false, str2, i3, L, valueOf, gqbVar2 != null ? gqbVar2.e : getMaxScrollDuration(), -1L, -1L, new cqb(this, b));
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
        gqb gqbVar = this.h;
        if (TextUtils.equals(gqbVar == null ? null : gqbVar.d, str)) {
            return;
        }
        gqb gqbVar2 = this.h;
        if (gqbVar2 != null) {
            jqb jqbVar = gqbVar2.c;
            if (jqbVar != null) {
                jqbVar.a();
                this.h.c = null;
            }
            this.h = null;
        }
        if (str != null) {
            this.f = 0L;
            gqb gqbVar3 = new gqb(this);
            this.h = gqbVar3;
            gqbVar3.b = z;
            gqbVar3.d = str;
            gqbVar3.e = j;
            gqbVar3.i = f;
            gqbVar3.a(false);
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
        this.M0.setTextSize(gm.L(12.0f));
        this.Q0.setTextSize(gm.L(12.0f));
        int L = gm.L(12.0f);
        this.z1 = L;
        int L2 = gm.L(5.0f);
        this.A1 = L2;
        setPadding(L, L2, gm.L(12.0f), gm.L(5.0f));
        int size = View.MeasureSpec.getSize(i);
        this.w1 = size;
        int L3 = gm.L(388.0f);
        this.x1 = L3;
        setMeasuredDimension(size, L3);
        int L4 = gm.L(10.0f);
        this.y1 = L4;
        this.v1 = (this.w1 - (L4 << 1)) - (this.z1 << 1);
        gqb gqbVar = this.h;
        if (gqbVar != null && gqbVar.d != null && gqbVar.c == null) {
            gqbVar.a(false);
        }
        ArrayList arrayList = this.s;
        if (!arrayList.isEmpty()) {
            int size2 = arrayList.size();
            int i3 = 0;
            while (i3 < size2) {
                Object obj = arrayList.get(i3);
                i3++;
                gqb gqbVar2 = (gqb) obj;
                if (gqbVar2.d != null && gqbVar2.c == null) {
                    gqbVar2.a(false);
                    gqbVar2.b();
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
        toa toaVar;
        boolean z2;
        VelocityTracker velocityTracker;
        fqb fqbVar;
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
        float A;
        float x;
        float A2;
        boolean z3;
        float x2;
        boolean z4;
        fqb fqbVar2;
        int i;
        float f;
        float f2;
        boolean z5;
        float f3;
        float i2;
        fqb fqbVar3;
        fqb fqbVar4;
        float f4;
        float f5;
        gqb gqbVar = this.h;
        ArrayList arrayList = this.s;
        if (gqbVar != null || !arrayList.isEmpty() || this.O || this.F) {
            float timelineHeight = this.x1 - getTimelineHeight();
            if (motionEvent.getAction() != 0 || motionEvent.getY() >= timelineHeight) {
                long currentTimeMillis = System.currentTimeMillis();
                int action = motionEvent.getAction();
                mt9 mt9Var = this.X0;
                vua vuaVar = this.Z0;
                if (action == 0) {
                    toa toaVar2 = this.e1;
                    if (toaVar2 != null) {
                        gm.r(toaVar2);
                        this.e1 = null;
                    }
                    mt9Var.a();
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
                            if (motionEvent.getY() > (f7 - getVideoHeight()) - gm.L(2.0f)) {
                                this.k1 = 0;
                            }
                        } else {
                            f4 = 4.0f;
                        }
                        i3 = (int) (f7 - (getVideoHeight() + gm.L(f4)));
                    }
                    if (this.k1 == -1 && !arrayList.isEmpty()) {
                        int i4 = 0;
                        while (i4 < arrayList.size()) {
                            f5 = f6;
                            float U1 = gm.U1(((gqb) arrayList.get(i4)).k.c, gm.L(28.0f), gm.L(38.0f));
                            float f8 = i3;
                            if (motionEvent.getY() < f8 && motionEvent.getY() > (f8 - U1) - gm.L(f5)) {
                                this.k1 = 3;
                                this.l1 = i4;
                                break;
                            }
                            i3 = (int) (f8 - (U1 + gm.L(f4)));
                            i4++;
                            f6 = f5;
                        }
                    }
                    f5 = f6;
                    if (this.k1 == -1 && this.F) {
                        float f9 = i3;
                        if (motionEvent.getY() < f9 && motionEvent.getY() > (f9 - getRoundHeight()) - gm.L(f5)) {
                            this.k1 = 1;
                        }
                        i3 = (int) (f9 - (getRoundHeight() + gm.L(f4)));
                    }
                    if (this.k1 == -1 && this.O) {
                        float f10 = i3;
                        if (motionEvent.getY() < f10 && motionEvent.getY() > (f10 - getAudioHeight()) - gm.L(f5)) {
                            this.k1 = 2;
                        }
                        getAudioHeight();
                        Typeface typeface = gm.a;
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
                        gm.r(vuaVar);
                        gm.d3(vuaVar, ViewConfiguration.getLongPressTimeout());
                    }
                } else if (motionEvent.getAction() == 2) {
                    float x3 = motionEvent.getX() - this.h1;
                    if (this.k0 && (this.n1 || Math.abs(x3) > gm.e)) {
                        long min = Math.min(getBaseDuration(), getMaxScrollDuration());
                        gqb gqbVar2 = this.h;
                        if (gqbVar2 != null) {
                            int i6 = this.i1;
                            if (i6 == 1) {
                                this.f = (long) Utilities.i(this.f - ((x3 / this.v1) * min), gqbVar2.e - min, 0.0f);
                                invalidate();
                                if (!this.n1) {
                                    this.o1 = 1.0f;
                                }
                                this.n1 = true;
                                this.m1 = false;
                            } else if (i6 == 2 || i6 == 3 || i6 == 4) {
                                float f11 = gqbVar2.e;
                                float f12 = (min / f11) * (x3 / this.v1);
                                if (i6 == 2) {
                                    gqbVar2.g = Utilities.i(gqbVar2.g + f12, gqbVar2.h - (1000.0f / f11), 0.0f);
                                    fqb fqbVar5 = this.a;
                                    if (fqbVar5 != null) {
                                        fqbVar5.X(false, this.h.g);
                                    }
                                    gqb gqbVar3 = this.h;
                                    float f13 = gqbVar3.h - gqbVar3.g;
                                    float f14 = f();
                                    gqb gqbVar4 = this.h;
                                    if (f13 > f14 / gqbVar4.e) {
                                        gqbVar4.h = kt6.A(f(), this.h.e, gqbVar4.g, 1.0f);
                                        fqb fqbVar6 = this.a;
                                        if (fqbVar6 != null) {
                                            fqbVar6.S1(this.h.h);
                                        }
                                    }
                                } else if (i6 == 3) {
                                    gqbVar2.h = Utilities.i(gqbVar2.h + f12, 1.0f, (1000.0f / f11) + gqbVar2.g);
                                    fqb fqbVar7 = this.a;
                                    if (fqbVar7 != null) {
                                        fqbVar7.S1(this.h.h);
                                    }
                                    gqb gqbVar5 = this.h;
                                    float f15 = gqbVar5.h - gqbVar5.g;
                                    float f16 = f();
                                    gqb gqbVar6 = this.h;
                                    if (f15 > f16 / gqbVar6.e) {
                                        gqbVar6.g = aq1.x(f(), this.h.e, gqbVar6.h, 0.0f);
                                        fqb fqbVar8 = this.a;
                                        if (fqbVar8 != null) {
                                            fqbVar8.X(false, this.h.g);
                                        }
                                    }
                                } else if (i6 == 4) {
                                    float min2 = f12 > 0.0f ? Math.min(1.0f - gqbVar2.h, f12) : Math.max(-gqbVar2.g, f12);
                                    gqb gqbVar7 = this.h;
                                    float f17 = gqbVar7.g + min2;
                                    gqbVar7.g = f17;
                                    gqbVar7.h += min2;
                                    fqb fqbVar9 = this.a;
                                    if (fqbVar9 != null) {
                                        fqbVar9.X(false, f17);
                                        this.a.S1(this.h.h);
                                    }
                                }
                                float f18 = this.e;
                                gqb gqbVar8 = this.h;
                                float f19 = gqbVar8.e;
                                float f20 = f18 / f19;
                                float f21 = gqbVar8.g;
                                if (f20 < f21 || f20 > gqbVar8.h) {
                                    long j5 = (long) (f21 * f19);
                                    this.e = j5;
                                    fqb fqbVar10 = this.a;
                                    if (fqbVar10 != null) {
                                        fqbVar10.C(j5, false);
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
                                gqb gqbVar9 = this.h;
                                if (gqbVar9 != null) {
                                    x = aq1.f((gqbVar9.g * gqbVar9.e) + this.f, this.R, f23, f24);
                                } else {
                                    gqb gqbVar10 = this.w;
                                    if (gqbVar10 != null) {
                                        x = aq1.f((gqbVar10.g * gqbVar10.e) + this.f, this.R, f23, f24);
                                    } else if (this.F) {
                                        x = aq1.f((this.K * this.I) + this.f, this.R, f23, f24);
                                    } else {
                                        x = aq1.x(f(), this.S, this.U, f24);
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
                                fqb fqbVar11 = this.a;
                                if (fqbVar11 != null) {
                                    fqbVar11.k2(this.R + ((long) (this.T * this.S)));
                                }
                                fqb fqbVar12 = this.a;
                                if (fqbVar12 != null) {
                                    fqbVar12.H1(this.T);
                                }
                            } else if (i7 == 7) {
                                float min3 = Math.min(1.0f, Math.max(0L, (this.f - this.R) + min) / this.S);
                                float f26 = this.T;
                                float g2 = g();
                                float f27 = this.S;
                                float f28 = (g2 / f27) + f26;
                                gqb gqbVar11 = this.h;
                                if (gqbVar11 != null) {
                                    A = Math.min(min3, (((gqbVar11.h * gqbVar11.e) + this.f) - this.R) / f27);
                                } else {
                                    gqb gqbVar12 = this.w;
                                    if (gqbVar12 != null) {
                                        A = Math.min(min3, (((gqbVar12.h * gqbVar12.e) + this.f) - this.R) / f27);
                                    } else if (this.F) {
                                        A = Math.min(min3, (((this.L * this.I) + this.f) - this.R) / f27);
                                    } else {
                                        A = kt6.A(f(), this.S, this.T, min3);
                                        if (!this.p1 && f22 > 0.0f) {
                                            if (this.U >= (f() / this.S) + this.T) {
                                                this.i1 = 8;
                                            }
                                        }
                                    }
                                }
                                float f29 = this.U;
                                float i9 = Utilities.i(f29 + f22, A, f28);
                                this.U = i9;
                                if (Math.abs(f29 - i9) > 0.01f) {
                                    this.p1 = true;
                                }
                                fqb fqbVar13 = this.a;
                                if (fqbVar13 != null) {
                                    fqbVar13.v1(this.U);
                                }
                            }
                            if (this.i1 == 8) {
                                float min4 = f22 > 0.0f ? Math.min(Math.max(0.0f, Math.min(1.0f, Math.max(0L, (this.f - this.R) + min) / this.S) - this.U), f22) : Math.max(Math.min(0.0f, (Math.max(0L, this.f - this.R) / this.S) - this.T), f22);
                                float f30 = this.T + min4;
                                this.T = f30;
                                this.U += min4;
                                fqb fqbVar14 = this.a;
                                if (fqbVar14 != null) {
                                    fqbVar14.H1(f30);
                                    this.a.k2(this.R + ((long) (this.T * this.S)));
                                    this.a.v1(this.U);
                                }
                                fqb fqbVar15 = this.a;
                                if (fqbVar15 != null) {
                                    fqbVar15.w0(true);
                                }
                            }
                            if (this.h == null && !this.F) {
                                this.e = (long) (this.T * this.S);
                                fqb fqbVar16 = this.a;
                                if (fqbVar16 != null) {
                                    fqbVar16.w0(true);
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
                                gqb gqbVar13 = this.h;
                                if (gqbVar13 != null) {
                                    x2 = aq1.f((gqbVar13.g * gqbVar13.e) + this.f, this.J, f32, f33);
                                } else {
                                    gqb gqbVar14 = this.w;
                                    if (gqbVar14 != null) {
                                        x2 = aq1.f((gqbVar14.g * gqbVar14.e) + this.f, this.J, f32, f33);
                                    } else {
                                        x2 = aq1.x(f(), this.I, this.L, f33);
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
                                fqb fqbVar17 = this.a;
                                if (fqbVar17 != null) {
                                    fqbVar17.f1(this.J + ((long) (this.K * this.I)));
                                }
                                fqb fqbVar18 = this.a;
                                if (fqbVar18 != null) {
                                    fqbVar18.n0(this.K);
                                }
                            } else if (i7 == 11) {
                                float min5 = Math.min(1.0f, Math.max(0L, (this.f - this.J) + min) / this.I);
                                float f35 = this.K;
                                float g4 = g();
                                float f36 = this.I;
                                float f37 = (g4 / f36) + f35;
                                gqb gqbVar15 = this.h;
                                if (gqbVar15 != null) {
                                    min5 = Math.min(min5, (((gqbVar15.h * gqbVar15.e) + this.f) - this.J) / f36);
                                }
                                gqb gqbVar16 = this.w;
                                if (gqbVar16 != null) {
                                    A2 = Math.min(min5, (((gqbVar16.h * gqbVar16.e) + this.f) - this.J) / this.I);
                                } else {
                                    A2 = kt6.A(f(), this.I, this.K, min5);
                                    if (!this.p1 && f31 > 0.0f) {
                                        if (this.L >= (f() / this.I) + this.K) {
                                            this.i1 = 8;
                                        }
                                    }
                                }
                                float f38 = this.L;
                                float i11 = Utilities.i(f38 + f31, A2, f37);
                                this.L = i11;
                                if (Math.abs(f38 - i11) > 0.01f) {
                                    this.p1 = true;
                                }
                                fqb fqbVar19 = this.a;
                                if (fqbVar19 != null) {
                                    fqbVar19.c2(this.L);
                                }
                            }
                            if (this.i1 == 12) {
                                float min6 = f31 > 0.0f ? Math.min(Math.min(1.0f, Math.max(0L, (this.f - this.J) + min) / this.I) - this.L, f31) : Math.max((Math.max(0L, this.f - this.J) / this.I) - this.K, f31);
                                float f39 = this.K + min6;
                                this.K = f39;
                                this.L += min6;
                                fqb fqbVar20 = this.a;
                                if (fqbVar20 != null) {
                                    fqbVar20.n0(f39);
                                    this.a.f1(this.J + ((long) (this.K * this.I)));
                                    this.a.c2(this.L);
                                }
                                fqb fqbVar21 = this.a;
                                if (fqbVar21 != null) {
                                    fqbVar21.w0(true);
                                }
                            }
                            if (this.h == null) {
                                this.e = (long) (this.K * this.I);
                                fqb fqbVar22 = this.a;
                                if (fqbVar22 != null) {
                                    fqbVar22.w0(true);
                                    z3 = false;
                                    this.a.C(this.e, false);
                                    invalidate();
                                    if (!this.n1) {
                                        this.o1 = 1.0f;
                                    }
                                    this.n1 = true;
                                    this.m1 = z3;
                                }
                            }
                            z3 = false;
                            invalidate();
                            if (!this.n1) {
                            }
                            this.n1 = true;
                            this.m1 = z3;
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
                                        i((gqb) arrayList.get(this.j1), (x3 / this.v1) * min);
                                        if (!this.n1) {
                                            this.o1 = 1.0f;
                                        }
                                        this.n1 = true;
                                        this.m1 = false;
                                    } else if (this.m1) {
                                        m(currentTimeMillis - this.f1 < 350, motionEvent.getX());
                                        if (this.n1 || (fqbVar2 = this.a) == null) {
                                            z4 = true;
                                        } else {
                                            z4 = true;
                                            fqbVar2.w0(true);
                                        }
                                        if (!this.n1) {
                                            this.o1 = 1.0f;
                                        }
                                        this.n1 = z4;
                                    }
                                }
                            } else {
                                gqb gqbVar17 = (gqb) arrayList.get(this.j1);
                                float f40 = (min / gqbVar17.e) * (x3 / this.v1);
                                int i15 = this.i1;
                                if (i15 == 13) {
                                    float g5 = gqbVar17.h - (g() / gqbVar17.e);
                                    float max3 = Math.max(0L, this.f - gqbVar17.f) / gqbVar17.e;
                                    if (gqbVar17 == this.w) {
                                        f = f40;
                                        max3 = aq1.x(f(), gqbVar17.e, gqbVar17.h, max3);
                                        if (!this.p1 && f < 0.0f) {
                                            f2 = 0.0f;
                                            if (gqbVar17.g <= gqbVar17.h - (f() / gqbVar17.e)) {
                                                this.i1 = 15;
                                            }
                                            f3 = gqbVar17.g;
                                            i2 = Utilities.i(f3 + f, g5, max3);
                                            gqbVar17.g = i2;
                                            if (Math.abs(f3 - i2) > 0.01f) {
                                                this.p1 = true;
                                            }
                                            fqbVar3 = this.a;
                                            if (fqbVar3 != null) {
                                                fqbVar3.e2(gqbVar17.a, gqbVar17.f);
                                            }
                                            fqbVar4 = this.a;
                                            if (fqbVar4 != null) {
                                                fqbVar4.s1(gqbVar17.g, gqbVar17.a);
                                            }
                                        }
                                    } else {
                                        f = f40;
                                    }
                                    f2 = 0.0f;
                                    f3 = gqbVar17.g;
                                    i2 = Utilities.i(f3 + f, g5, max3);
                                    gqbVar17.g = i2;
                                    if (Math.abs(f3 - i2) > 0.01f) {
                                    }
                                    fqbVar3 = this.a;
                                    if (fqbVar3 != null) {
                                    }
                                    fqbVar4 = this.a;
                                    if (fqbVar4 != null) {
                                    }
                                } else {
                                    f = f40;
                                    f2 = 0.0f;
                                    if (i15 == 14) {
                                        float min7 = Math.min(1.0f, Math.max(0L, (this.f - gqbVar17.f) + min) / gqbVar17.e);
                                        float g6 = (g() / gqbVar17.e) + gqbVar17.g;
                                        if (gqbVar17 == this.w) {
                                            min7 = kt6.A(f(), gqbVar17.e, gqbVar17.g, min7);
                                            if (!this.p1 && f > 0.0f) {
                                                if (gqbVar17.h >= (f() / gqbVar17.e) + gqbVar17.g) {
                                                    this.i1 = 15;
                                                }
                                            }
                                        }
                                        float f41 = gqbVar17.h;
                                        float i16 = Utilities.i(f41 + f, min7, g6);
                                        gqbVar17.h = i16;
                                        if (Math.abs(f41 - i16) > 0.01f) {
                                            this.p1 = true;
                                        }
                                        fqb fqbVar23 = this.a;
                                        if (fqbVar23 != null) {
                                            fqbVar23.R1(gqbVar17.h, gqbVar17.a);
                                        }
                                    }
                                }
                                if (this.i1 == 15) {
                                    float min8 = f > f2 ? Math.min(Math.min(1.0f, Math.max(0L, (this.f - gqbVar17.f) + min) / gqbVar17.e) - gqbVar17.h, f) : Math.max((Math.max(0L, this.f - gqbVar17.f) / gqbVar17.e) - gqbVar17.g, f);
                                    float f42 = gqbVar17.g + min8;
                                    gqbVar17.g = f42;
                                    gqbVar17.h += min8;
                                    fqb fqbVar24 = this.a;
                                    if (fqbVar24 != null) {
                                        fqbVar24.s1(f42, gqbVar17.a);
                                        this.a.e2(gqbVar17.a, gqbVar17.f);
                                        this.a.R1(gqbVar17.h, gqbVar17.a);
                                    }
                                    fqb fqbVar25 = this.a;
                                    if (fqbVar25 != null) {
                                        z5 = true;
                                        fqbVar25.w0(true);
                                        invalidate();
                                        if (!this.n1) {
                                            this.o1 = 1.0f;
                                        }
                                        this.n1 = z5;
                                        this.m1 = false;
                                    }
                                }
                                z5 = true;
                                invalidate();
                                if (!this.n1) {
                                }
                                this.n1 = z5;
                                this.m1 = false;
                            }
                        }
                        this.h1 = motionEvent.getX();
                    }
                    if (this.n1) {
                        gm.r(vuaVar);
                    }
                    int i17 = this.i1;
                    if ((i17 == 1 || i17 == 5 || i17 == 8) && (velocityTracker6 = this.q1) != null) {
                        velocityTracker6.addMovement(motionEvent);
                    }
                } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    gm.r(vuaVar);
                    mt9Var.a();
                    if (motionEvent.getAction() == 1) {
                        if ((System.currentTimeMillis() - this.g1 > ViewConfiguration.getTapTimeout() || this.n1) && this.k0) {
                            int i18 = this.i1;
                            if (i18 == 16 && (velocityTracker5 = this.q1) != null) {
                                velocityTracker5.computeCurrentVelocity(1000);
                                int xVelocity = (int) this.q1.getXVelocity();
                                this.r1 = true;
                                if (this.h != null && Math.abs(xVelocity) > gm.L(100.0f)) {
                                    long min9 = Math.min(this.h.e, getMaxScrollDuration());
                                    int i19 = this.z1;
                                    float f43 = i19;
                                    float f44 = min9;
                                    float f45 = this.v1;
                                    int i20 = (int) (((this.f / f44) * f45) + f43);
                                    int A3 = (int) b10.A(this.h.e - min9, f44, f45, f43);
                                    this.s1 = true;
                                    this.t1 = i20;
                                    this.X0.c(i20, 0, -xVelocity, 0, i19, A3, 0, 0);
                                    z = false;
                                }
                            } else if (i18 == 1 && (velocityTracker4 = this.q1) != null) {
                                velocityTracker4.computeCurrentVelocity(1000);
                                int xVelocity2 = (int) this.q1.getXVelocity();
                                this.r1 = true;
                                if (this.h != null && Math.abs(xVelocity2) > gm.L(100.0f)) {
                                    long min10 = Math.min(this.h.e, getMaxScrollDuration());
                                    int i21 = this.z1;
                                    float f46 = i21;
                                    float f47 = min10;
                                    float f48 = this.v1;
                                    int i22 = (int) (((this.f / f47) * f48) + f46);
                                    int A4 = (int) b10.A(this.h.e - min10, f47, f48, f46);
                                    this.s1 = true;
                                    this.t1 = i22;
                                    this.X0.c(i22, 0, -xVelocity2, 0, i21, A4, 0, 0);
                                    z = false;
                                }
                            } else if ((i18 == 5 || (i18 == 8 && !this.n1)) && this.Q && (velocityTracker2 = this.q1) != null) {
                                velocityTracker2.computeCurrentVelocity(this.h == null ? 1500 : 1000);
                                int xVelocity3 = (int) this.q1.getXVelocity();
                                this.r1 = false;
                                if (Math.abs(xVelocity3) > gm.L(100.0f)) {
                                    float min11 = Math.min(getBaseDuration(), getMaxScrollDuration());
                                    int i23 = (int) (((this.R / min11) * this.v1) + this.z1 + this.y1);
                                    gqb gqbVar18 = this.h;
                                    if (gqbVar18 != null) {
                                        float f49 = gqbVar18.h;
                                        float f50 = gqbVar18.e;
                                        j = (long) ((gqbVar18.g * f50) - this.S);
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
                                    this.X0.c(i23, 0, xVelocity3, 0, (int) (((j / min11) * f54) + f53), (int) b10.A(j2, min11, f54, f53), 0, 0);
                                    z = false;
                                }
                            } else if ((i18 == 9 || (i18 == 12 && !this.n1)) && this.H && (velocityTracker3 = this.q1) != null) {
                                velocityTracker3.computeCurrentVelocity(this.h == null ? 1500 : 1000);
                                int xVelocity4 = (int) this.q1.getXVelocity();
                                this.r1 = false;
                                if (Math.abs(xVelocity4) > gm.L(100.0f)) {
                                    float min12 = Math.min(getBaseDuration(), getMaxScrollDuration());
                                    int i24 = (int) (((this.J / min12) * this.v1) + this.z1 + this.y1);
                                    gqb gqbVar19 = this.h;
                                    if (gqbVar19 != null) {
                                        float f55 = gqbVar19.h;
                                        float f56 = gqbVar19.e;
                                        j3 = (long) ((gqbVar19.g * f56) - this.I);
                                        j4 = (long) ((f55 * f56) - 0.0f);
                                    } else {
                                        j3 = -(this.I - Math.min(getBaseDuration(), getMaxScrollDuration()));
                                        j4 = 0;
                                    }
                                    this.s1 = true;
                                    this.t1 = i24;
                                    float f57 = this.z1 + this.y1;
                                    float f58 = this.v1;
                                    this.X0.c(i24, 0, xVelocity4, 0, (int) (((j3 / min12) * f58) + f57), (int) b10.A(j4, min12, f58, f57), 0, 0);
                                    z = false;
                                }
                            }
                            toaVar = this.e1;
                            if (toaVar != null) {
                                gm.r(toaVar);
                                this.e1 = null;
                            }
                            if (this.n1 || !z || (fqbVar = this.a) == null) {
                                z2 = false;
                            } else {
                                z2 = false;
                                fqbVar.w0(false);
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
                                            this.a.h(((gqb) arrayList.get(this.l1)).a);
                                        }
                                        invalidate();
                                    }
                                }
                                if (i25 == 2 && !this.Q) {
                                    this.Q = true;
                                    this.H = false;
                                    fqb fqbVar26 = this.a;
                                    if (fqbVar26 != null) {
                                        fqbVar26.h1(false);
                                    }
                                    invalidate();
                                } else if (i25 == 1 && !this.H) {
                                    this.Q = false;
                                    this.H = true;
                                    fqb fqbVar27 = this.a;
                                    if (fqbVar27 != null) {
                                        fqbVar27.h1(true);
                                    }
                                    invalidate();
                                } else if (i25 != 2 && this.Q) {
                                    this.Q = false;
                                    this.H = false;
                                    fqb fqbVar28 = this.a;
                                    if (fqbVar28 != null) {
                                        fqbVar28.h1(false);
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
                                    fqb fqbVar29 = this.a;
                                    if (fqbVar29 != null) {
                                        fqbVar29.h1(false);
                                    }
                                    invalidate();
                                }
                            } else {
                                long i28 = (long) Utilities.i(((((motionEvent.getX() - this.z1) - this.y1) / this.v1) * Math.min(getBaseDuration(), getMaxScrollDuration())) + this.f, getBaseDuration(), 0.0f);
                                gqb gqbVar20 = this.h;
                                float f59 = gqbVar20.h - gqbVar20.g;
                                gqbVar20.g = (1.0f - f59) * (i28 / getBaseDuration());
                                gqb gqbVar21 = this.h;
                                float f60 = gqbVar21.g;
                                gqbVar21.h = f59 + f60;
                                fqb fqbVar30 = this.a;
                                if (fqbVar30 != null) {
                                    fqbVar30.X(true, f60);
                                    this.a.S1(this.h.h);
                                }
                                invalidate();
                            }
                        } else if (this.k1 == 10 && (runnable = this.b) != null) {
                            runnable.run();
                        }
                    }
                    z = true;
                    toaVar = this.e1;
                    if (toaVar != null) {
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
                this.b0 = new eqb(this, this.P, (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
                this.V = false;
                this.h0.e(true, 1.0f);
            }
        }
    }

    public final void q() {
        zua zuaVar = new zua((byte) 7);
        ArrayList arrayList = this.s;
        Collections.sort(arrayList, zuaVar);
        gqb gqbVar = arrayList.isEmpty() ? null : (gqb) arrayList.get(0);
        this.w = gqbVar;
        if (gqbVar != null) {
            long j = gqbVar.f;
        }
    }

    public void setCollage(ArrayList<g6b> arrayList) {
        ArrayList arrayList2;
        ArrayList arrayList3;
        jqb jqbVar;
        int i = 0;
        while (true) {
            arrayList2 = this.s;
            if (i >= arrayList2.size()) {
                break;
            }
            gqb gqbVar = (gqb) arrayList2.get(i);
            if (gqbVar != null && (jqbVar = gqbVar.c) != null) {
                jqbVar.a();
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
            eqb eqbVar = (eqb) arrayList3.get(i2);
            if (eqbVar != null) {
                eqbVar.a();
            }
            i2++;
        }
        arrayList3.clear();
        this.i0.e(true, 1.0f);
        if (arrayList != null) {
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                arrayList3.add(null);
                g6b g6bVar = arrayList.get(i3);
                if (g6bVar.K) {
                    gqb gqbVar2 = new gqb(this);
                    gqbVar2.a = i3;
                    gqbVar2.b = false;
                    gqbVar2.d = g6bVar.L.getAbsolutePath();
                    gqbVar2.e = g6bVar.h0;
                    gqbVar2.f = g6bVar.X;
                    gqbVar2.i = g6bVar.P;
                    gqbVar2.g = g6bVar.V;
                    gqbVar2.h = g6bVar.W;
                    gqbVar2.a(false);
                    gqbVar2.b();
                    arrayList2.add(gqbVar2);
                }
            }
        }
        q();
        this.n = 0;
    }

    public void setDelegate(fqb fqbVar) {
        this.a = fqbVar;
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
        gqb gqbVar = this.h;
        if (gqbVar != null) {
            if (j < this.e) {
                float f = j;
                float f2 = gqbVar.e;
                if (f <= (gqbVar.g * f2) + 240.0f) {
                }
            }
        }
        if (this.O && !this.F && gqbVar == null) {
            if (j < this.e) {
                float f3 = j;
                float f4 = this.S;
                if (f3 <= (this.T * f4) + 240.0f) {
                }
            }
        }
        if (this.F && gqbVar == null) {
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
        gqb gqbVar = this.h;
        if (gqbVar == null) {
            return;
        }
        gqbVar.g = f;
        invalidate();
    }

    public void setVideoRight(float f) {
        gqb gqbVar = this.h;
        if (gqbVar == null) {
            return;
        }
        gqbVar.h = f;
        invalidate();
    }
}
