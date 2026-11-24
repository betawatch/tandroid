// default package

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public abstract class ng0 extends View implements sl1 {
    public static final boolean B1;
    public static final boolean C1;
    public static final l94 D1;
    public a1c A0;
    public final int B0;
    public final int C0;
    public float D0;
    public float E;
    public float E0;
    public float F;
    public float F0;
    public int G;
    public float G0;
    public int H;
    public float H0;
    public boolean I;
    public final RectF I0;
    public boolean J;
    public VibrationEffect J0;
    public boolean K;
    public final kg0 K0;
    public final Paint L;
    public final kg0 L0;
    public final Paint M;
    public final ig0 M0;
    public final Paint N;
    public final ig0 N0;
    public final TextPaint O;
    public final kg0 O0;
    public final TextPaint P;
    public final g0 P0;
    public final TextPaint Q;
    public boolean Q0;
    public final Paint R;
    public lg0 R0;
    public final Paint S;
    public float S0;
    public final Paint T;
    public float T0;
    public final Paint U;
    public float U0;
    public final Paint V;
    public float V0;
    public final Rect W;
    public float W0;
    public final ylb X0;
    public int Y0;
    public int Z0;
    public mg0 a;
    public final Path a0;
    public final Rect a1;
    public final ArrayList b;
    public AnimatorSet b0;
    public final ArrayList b1;
    public final ArrayList c;
    public ValueAnimator c0;
    public long c1;
    public final ArrayList d;
    public ValueAnimator d0;
    public int d1;
    public boolean e;
    public Animator e0;
    public int e1;
    public float f;
    public ValueAnimator f0;
    public int f1;
    public boolean g0;
    public int g1;
    public float h;
    public final tl1 h0;
    public long h1;
    public nl1 i0;
    public boolean i1;
    public ll1 j0;
    public boolean j1;
    public float k0;
    public pl1 k1;
    public float l0;
    public float m0;
    public int n;
    public int n0;
    public int o0;
    public int p0;
    public Bitmap q0;
    public int r;
    public Canvas r0;
    public int s;
    public boolean s0;
    public int t0;
    public m26 u0;
    public boolean v0;
    public float w;
    public float w0;
    public float x;
    public boolean x0;
    public float y;
    public boolean y0;
    public byte z0;
    public static final float l1 = gm.N(16.0f);
    public static final float m1 = gm.N(1.5f);
    public static final float n1 = gm.N(12.0f);
    public static final int o1 = gm.L(18.0f);
    public static final int p1 = gm.L(14.0f);
    public static final int q1 = gm.L(10.0f);
    public static final int r1 = gm.L(16.0f);
    public static final int s1 = gm.L(24.0f);
    public static final int t1 = gm.L(16.0f);
    public static final int u1 = gm.L(10.0f);
    public static final int v1 = gm.L(12.0f);
    public static final int w1 = gm.L(8.0f);
    public static final int x1 = gm.L(6.0f);
    public static final int y1 = gm.L(5.0f);
    public static final int z1 = gm.L(2.0f);
    public static final int A1 = gm.L(1.0f);

    static {
        B1 = Build.VERSION.SDK_INT < 28;
        C1 = true;
        D1 = new l94();
    }

    /* JADX WARN: Type inference failed for: r1v10, types: [ig0] */
    /* JADX WARN: Type inference failed for: r1v9, types: [ig0] */
    public ng0(Context context, ylb ylbVar) {
        super(context);
        this.b = new ArrayList(10);
        this.c = new ArrayList(25);
        this.d = new ArrayList();
        final byte b = 1;
        this.e = true;
        this.w = 250.0f;
        this.x = 0.0f;
        this.y = 0.0f;
        this.E = 0.0f;
        this.F = 0.0f;
        this.I = true;
        final byte b2 = 0;
        this.J = false;
        this.K = true;
        this.L = new Paint();
        this.M = new Paint();
        this.N = new Paint();
        this.O = new TextPaint(1);
        this.P = new TextPaint(1);
        this.Q = new TextPaint(1);
        this.R = new Paint(1);
        this.S = new Paint();
        this.T = new Paint(1);
        this.U = new Paint(1);
        this.V = new Paint(1);
        this.W = new Rect();
        this.a0 = new Path();
        this.g0 = false;
        tl1 tl1Var = new tl1();
        tl1Var.h = new Rect();
        tl1Var.i = new Rect();
        tl1Var.j = new Rect();
        tl1Var.k = 0.7f;
        tl1Var.l = 1.0f;
        tl1Var.m = 0.1f;
        tl1Var.n = new rl1[]{null, null};
        tl1Var.a = this;
        this.h0 = tl1Var;
        this.s0 = false;
        this.t0 = -1;
        this.v0 = false;
        this.w0 = 0.0f;
        this.x0 = false;
        this.y0 = false;
        this.z0 = (byte) 0;
        this.C0 = gm.L(46.0f);
        this.I0 = new RectF();
        this.K0 = new kg0(this, b2);
        this.L0 = new kg0(this, b);
        this.M0 = new ValueAnimator.AnimatorUpdateListener(this) { // from class: ig0
            public final /* synthetic */ ng0 b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                byte b3 = b2;
                ng0 ng0Var = this.b;
                switch (b3) {
                    case 0:
                        ng0Var.w = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        ng0Var.invalidate();
                        break;
                    default:
                        ng0Var.x = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        ng0Var.invalidate();
                        break;
                }
            }
        };
        this.N0 = new ValueAnimator.AnimatorUpdateListener(this) { // from class: ig0
            public final /* synthetic */ ng0 b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                byte b3 = b;
                ng0 ng0Var = this.b;
                switch (b3) {
                    case 0:
                        ng0Var.w = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        ng0Var.invalidate();
                        break;
                    default:
                        ng0Var.x = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        ng0Var.invalidate();
                        break;
                }
            }
        };
        this.O0 = new kg0(this, (byte) 2);
        this.P0 = new g0(this, (byte) 21);
        this.Q0 = false;
        this.Y0 = 0;
        this.Z0 = 0;
        Rect rect = new Rect();
        this.a1 = rect;
        ArrayList arrayList = new ArrayList();
        this.b1 = arrayList;
        arrayList.add(rect);
        this.c1 = 0L;
        this.j1 = false;
        this.X0 = ylbVar;
        t();
        this.B0 = ViewConfiguration.get(context).getScaledTouchSlop();
    }

    public static void b(Path path, float f, float f2, float f3, float f4, float f5, float f6, boolean z, boolean z2, boolean z3, boolean z4) {
        path.reset();
        if (f5 < 0.0f) {
            f5 = 0.0f;
        }
        if (f6 < 0.0f) {
            f6 = 0.0f;
        }
        float f7 = f3 - f;
        float f8 = f4 - f2;
        float f9 = f7 / 2.0f;
        if (f5 > f9) {
            f5 = f9;
        }
        float f10 = f8 / 2.0f;
        if (f6 > f10) {
            f6 = f10;
        }
        float f11 = f7 - (f5 * 2.0f);
        float f12 = f8 - (2.0f * f6);
        path.moveTo(f3, f2 + f6);
        float f13 = -f6;
        if (z2) {
            path.rQuadTo(0.0f, f13, -f5, f13);
        } else {
            path.rLineTo(0.0f, f13);
            path.rLineTo(-f5, 0.0f);
        }
        path.rLineTo(-f11, 0.0f);
        float f14 = -f5;
        if (z) {
            path.rQuadTo(f14, 0.0f, f14, f6);
        } else {
            path.rLineTo(f14, 0.0f);
            path.rLineTo(0.0f, f6);
        }
        path.rLineTo(0.0f, f12);
        if (z4) {
            path.rQuadTo(0.0f, f6, f5, f6);
        } else {
            path.rLineTo(0.0f, f6);
            path.rLineTo(f5, 0.0f);
        }
        path.rLineTo(f11, 0.0f);
        if (z3) {
            path.rQuadTo(f5, 0.0f, f5, -f6);
        } else {
            path.rLineTo(f5, 0.0f);
            path.rLineTo(0.0f, -f6);
        }
        path.rLineTo(0.0f, -f12);
        path.close();
    }

    public static ValueAnimator e(float f, float f2, ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f, f2);
        ofFloat.setDuration(400L);
        ofFloat.setInterpolator(D1);
        ofFloat.addUpdateListener(animatorUpdateListener);
        return ofFloat;
    }

    public void A(boolean z, boolean z2, boolean z3) {
        if (this.i0 == null) {
            return;
        }
        float f = this.G0;
        tl1 tl1Var = this.h0;
        this.H0 = f / (tl1Var.l - tl1Var.k);
        H();
        E(r(this.G, this.H), this.Q0 ? s(this.G, this.H) : 0L, z, z2, z3);
        if (this.v0 && !z2) {
            c(false);
            x((this.H0 * tl1Var.k) - l1);
        }
        invalidate();
    }

    public final void B() {
        if (Build.VERSION.SDK_INT >= 26) {
            Vibrator vibrator = (Vibrator) getContext().getSystemService("vibrator");
            if (this.J0 == null) {
                this.J0 = VibrationEffect.createWaveform(new long[]{0, 2}, -1);
            }
            vibrator.cancel();
            vibrator.vibrate(this.J0);
        }
    }

    public void C(int i, int i2) {
        int i3 = this.t0;
        nl1 nl1Var = this.i0;
        if (nl1Var != null) {
            float f = this.H0;
            float f2 = (this.h0.k * f) - l1;
            float f3 = (i + f2) / f;
            if (f3 < 0.0f) {
                this.t0 = 0;
            } else if (f3 > 1.0f) {
                this.t0 = nl1Var.a.length - 1;
            } else {
                int b = nl1Var.b(f3, this.G, this.H);
                this.t0 = b;
                int i4 = b + 1;
                float[] fArr = this.i0.b;
                if (i4 < fArr.length) {
                    if (Math.abs(this.i0.b[this.t0 + 1] - f3) < Math.abs(fArr[b] - f3)) {
                        this.t0++;
                    }
                }
            }
            int i5 = this.t0;
            int i6 = this.H;
            if (i5 > i6) {
                this.t0 = i6;
                i5 = i6;
            }
            int i7 = this.G;
            if (i5 < i7) {
                this.t0 = i7;
                i5 = i7;
            }
            if (i3 != i5) {
                this.v0 = true;
                c(true);
                x(f2);
                lg0 lg0Var = this.R0;
                if (lg0Var != null) {
                    getSelectedDate();
                    gza gzaVar = (gza) ((wta) lg0Var).b;
                    gzaVar.f();
                    gzaVar.b.u0.d(false, false);
                }
                B();
                invalidate();
            }
        }
    }

    public boolean D(nl1 nl1Var) {
        boolean z;
        nl1 nl1Var2 = this.i0;
        tl1 tl1Var = this.h0;
        ArrayList arrayList = this.d;
        if (nl1Var2 != nl1Var) {
            invalidate();
            arrayList.clear();
            if (nl1Var != null && nl1Var.d != null) {
                for (int i = 0; i < nl1Var.d.size(); i++) {
                    arrayList.add(h((ml1) nl1Var.d.get(i)));
                }
            }
            d();
            this.i0 = nl1Var;
            if (nl1Var != null) {
                if (nl1Var.a[0] == 0) {
                    tl1Var.k = 0.0f;
                    tl1Var.l = 1.0f;
                } else {
                    float minDistance = getMinDistance();
                    tl1Var.m = minDistance;
                    float f = tl1Var.l;
                    if (f - tl1Var.k < minDistance) {
                        float f2 = f - minDistance;
                        tl1Var.k = f2;
                        if (f2 < 0.0f) {
                            tl1Var.k = 0.0f;
                            tl1Var.l = 1.0f;
                        }
                    }
                }
            }
            z = true;
        } else {
            z = false;
        }
        w();
        if (nl1Var != null) {
            H();
            E(r(this.G, this.H), this.Q0 ? s(this.G, this.H) : 0L, false, false, false);
            this.k0 = 0.0f;
            this.l0 = 2.1474836E9f;
            u();
            int i2 = nl1Var.j;
            if (i2 == 1 || i2 == 2) {
                this.u0.setSize(arrayList.size() << 1);
            } else {
                this.u0.setSize(arrayList.size());
            }
            this.I = true;
            I();
            return z;
        }
        tl1Var.k = 0.7f;
        tl1Var.l = 1.0f;
        this.l0 = 0.0f;
        this.k0 = 0.0f;
        this.b.clear();
        AnimatorSet animatorSet = this.b0;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        ValueAnimator valueAnimator = this.c0;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.c0.cancel();
        }
        return z;
    }

    public final void E(long j, long j2, boolean z, boolean z2, boolean z3) {
        if ((Math.abs((((long) Math.ceil(((j <= 100 || ((float) (j / 5)) % 10.0f == 0.0f) ? j : ((j / 10) + 1) * 10) / 5.0f)) * 5) - this.y) < this.F || j == 0) && j == this.E) {
            return;
        }
        ql1 f = f(j, this.i0.i, j2);
        long[] jArr = f.a;
        long j3 = jArr[jArr.length - 1];
        long j4 = jArr[0];
        if (!z3) {
            float f2 = this.w - this.x;
            float f3 = j3 - j4;
            float f4 = f2 / f3;
            if (f4 > 1.0f) {
                f4 = f3 / f2;
            }
            double d = f4;
            float f5 = d > 0.7d ? 0.1f : d < 0.1d ? 0.03f : 0.045f;
            boolean z4 = ((float) j3) != this.y;
            if (this.Q0 && j4 != this.E) {
                z4 = true;
            }
            if (z4) {
                AnimatorSet animatorSet = this.b0;
                if (animatorSet != null) {
                    animatorSet.removeAllListeners();
                    this.b0.cancel();
                }
                this.U0 = this.w;
                this.V0 = this.x;
                this.S0 = 0.0f;
                this.T0 = 0.0f;
                this.W0 = f5;
            }
        }
        float f6 = j3;
        this.y = f6;
        float f7 = j4;
        this.E = f7;
        v();
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.c1 >= 320 || z2) {
            this.c1 = currentTimeMillis;
            ValueAnimator valueAnimator = this.c0;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.c0.cancel();
            }
            ArrayList arrayList = this.b;
            if (!z) {
                this.w = f6;
                this.x = f7;
                arrayList.clear();
                arrayList.add(f);
                f.f = nm7.d4;
                return;
            }
            arrayList.add(f);
            if (z3) {
                AnimatorSet animatorSet2 = this.b0;
                if (animatorSet2 != null) {
                    animatorSet2.removeAllListeners();
                    this.b0.cancel();
                }
                this.W0 = 0.0f;
                AnimatorSet animatorSet3 = new AnimatorSet();
                animatorSet3.playTogether(e(this.w, f6, this.M0));
                if (this.Q0) {
                    animatorSet3.playTogether(e(this.x, f7, this.N0));
                }
                this.b0 = animatorSet3;
                animatorSet3.start();
            }
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ql1 ql1Var = (ql1) arrayList.get(i);
                if (ql1Var != f) {
                    ql1Var.g = ql1Var.f;
                }
            }
            ValueAnimator e = e(0.0f, 255.0f, new pl(this, f, (byte) 2));
            this.c0 = e;
            e.addListener(new u5(this, f, (byte) 3));
            this.c0.start();
        }
    }

    public final void F() {
        float f = this.W0;
        if (f != 0.0f) {
            float f2 = this.w;
            float f3 = this.y;
            if (f2 != f3) {
                float f4 = this.S0 + f;
                this.S0 = f4;
                if (f4 > 1.0f) {
                    this.S0 = 1.0f;
                    this.w = f3;
                } else {
                    float f5 = this.U0;
                    this.w = (d53.g.getInterpolation(f4) * (f3 - f5)) + f5;
                }
                invalidate();
            }
            if (this.Q0) {
                float f6 = this.x;
                float f7 = this.E;
                if (f6 != f7) {
                    float f8 = this.T0 + this.W0;
                    this.T0 = f8;
                    if (f8 > 1.0f) {
                        this.T0 = 1.0f;
                        this.x = f7;
                    } else {
                        float f9 = this.V0;
                        this.x = (d53.g.getInterpolation(f8) * (f7 - f9)) + f9;
                    }
                    invalidate();
                }
            }
        }
    }

    public final void G() {
        int i = this.y0 ? cmb.Pj : cmb.Oj;
        ylb ylbVar = this.X0;
        int v0 = cmb.v0(i, ylbVar);
        this.O.setColor(v0);
        this.P.setColor(cmb.v0(this.y0 ? cmb.Pj : cmb.Oj, ylbVar));
        int v02 = cmb.v0(cmb.Oj, ylbVar);
        this.Q.setColor(v02);
        int v03 = cmb.v0(cmb.Qj, ylbVar);
        Paint paint = this.M;
        paint.setColor(v03);
        int v04 = cmb.v0(cmb.Rj, ylbVar);
        Paint paint2 = this.N;
        paint2.setColor(v04);
        this.R.setColor(cmb.v0(cmb.Tj, ylbVar));
        this.S.setColor(cmb.v0(cmb.Sj, ylbVar));
        this.T.setColor(cmb.v0(cmb.c6, ylbVar));
        this.U.setColor(cmb.v0(cmb.Uj, ylbVar));
        this.u0.b();
        this.n = paint.getAlpha();
        this.r = paint2.getAlpha();
        this.f = r2.getAlpha() / 255.0f;
        this.h = r3.getAlpha() / 255.0f;
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            ((l46) obj).a();
        }
        if (this.v0) {
            int i3 = this.t0;
            nl1 nl1Var = this.i0;
            long[] jArr = nl1Var.a;
            if (i3 < jArr.length) {
                this.u0.c(i3, jArr[i3], arrayList, false, nl1Var.j, nl1Var.h);
            }
        }
        this.I = true;
    }

    public final void H() {
        nl1 nl1Var = this.i0;
        if (nl1Var == null) {
            return;
        }
        tl1 tl1Var = this.h0;
        int c = nl1Var.c(Math.max(tl1Var.k, 0.0f));
        this.G = c;
        int a = this.i0.a(Math.min(tl1Var.l, 1.0f), c);
        this.H = a;
        int i = this.G;
        if (a < i) {
            this.H = i;
            a = i;
        }
        pl1 pl1Var = this.k1;
        if (pl1Var != null) {
            long[] jArr = this.i0.a;
            pl1Var.b(jArr[i], jArr[a]);
        }
        I();
    }

    public final void I() {
        nl1 nl1Var = this.i0;
        if (nl1Var != null) {
            float f = this.G0;
            if (f != 0.0f) {
                int i = (int) ((f / (this.H0 * nl1Var.g)) / 6.0f);
                ll1 ll1Var = this.j0;
                if (ll1Var == null || i >= ll1Var.b || i <= ll1Var.c) {
                    int highestOneBit = Integer.highestOneBit(i) << 1;
                    ll1 ll1Var2 = this.j0;
                    if (ll1Var2 == null || ll1Var2.a != highestOneBit) {
                        ValueAnimator valueAnimator = this.d0;
                        if (valueAnimator != null) {
                            valueAnimator.removeAllListeners();
                            this.d0.cancel();
                        }
                        double d = highestOneBit;
                        double d2 = 0.2d * d;
                        ll1 ll1Var3 = new ll1(highestOneBit, (int) (d + d2), (int) (d - d2));
                        ll1Var3.d = nm7.d4;
                        ll1 ll1Var4 = this.j0;
                        ArrayList arrayList = this.c;
                        if (ll1Var4 == null) {
                            this.j0 = ll1Var3;
                            ll1Var3.d = nm7.d4;
                            arrayList.add(ll1Var3);
                            return;
                        }
                        this.j0 = ll1Var3;
                        this.n0 = arrayList.size();
                        for (int i2 = 0; i2 < this.n0; i2++) {
                            ll1 ll1Var5 = (ll1) arrayList.get(i2);
                            ll1Var5.e = ll1Var5.d;
                        }
                        arrayList.add(ll1Var3);
                        if (arrayList.size() > 2) {
                            arrayList.remove(0);
                        }
                        ValueAnimator duration = e(0.0f, 1.0f, new pl(this, ll1Var3, (byte) 3)).setDuration(200L);
                        this.d0 = duration;
                        duration.addListener(new u5(this, ll1Var3, (byte) 4));
                        this.d0.start();
                    }
                }
            }
        }
    }

    public void J(nl1 nl1Var, long j) {
        int length = nl1Var.a.length;
        long j2 = j - (j % 86400000);
        long j3 = 86399999 + j2;
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            long j4 = nl1Var.a[i3];
            if (j2 > j4) {
                i = i3;
            }
            if (j3 > j4) {
                i2 = i3;
            }
        }
        float[] fArr = nl1Var.b;
        float f = fArr[i];
        tl1 tl1Var = this.h0;
        tl1Var.k = f;
        tl1Var.l = fArr[i2];
    }

    public void K() {
        if (C1) {
            ArrayList arrayList = this.d;
            int size = arrayList.size();
            long j = Long.MAX_VALUE;
            int i = 0;
            long j2 = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                l46 l46Var = (l46) obj;
                boolean z = l46Var.n;
                ml1 ml1Var = l46Var.a;
                if (z) {
                    long j3 = ml1Var.e;
                    if (j3 > j2) {
                        j2 = j3;
                    }
                }
                if (z) {
                    long j4 = ml1Var.f;
                    if (j4 < j) {
                        j = j4;
                    }
                }
            }
            if ((j == 2147483647L || j == 0.0f) && (j2 <= 0 || j2 == this.m0)) {
                return;
            }
            this.m0 = j2;
            Animator animator = this.e0;
            if (animator != null) {
                animator.cancel();
            }
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(e(this.k0, this.m0, this.K0), e(this.l0, 0.0f, this.L0));
            this.e0 = animatorSet;
            animatorSet.start();
        }
    }

    public void a(float f, float f2, boolean z) {
        nl1 nl1Var = this.i0;
        if (nl1Var == null) {
            return;
        }
        if (!z) {
            H();
            invalidate();
        } else {
            int c = nl1Var.c(Math.max(f, 0.0f));
            int a = this.i0.a(Math.min(f2, 1.0f), c);
            E(r(c, a), s(c, a), true, true, false);
            c(false);
        }
    }

    public final void c(boolean z) {
        x((this.H0 * this.h0.k) - l1);
        if (this.j1 == z) {
            return;
        }
        this.j1 = z;
        ValueAnimator valueAnimator = this.f0;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.f0.cancel();
        }
        ValueAnimator duration = e(this.w0, z ? 1.0f : 0.0f, this.O0).setDuration(200L);
        this.f0 = duration;
        duration.addListener(this.P0);
        this.f0.start();
    }

    public final void d() {
        this.t0 = -1;
        this.v0 = false;
        this.j1 = false;
        this.u0.setVisibility(8);
        this.w0 = 0.0f;
    }

    public ql1 f(long j, int i, long j2) {
        return new ql1(j, j2, this.Q0, this.i0.h, i, this.O, this.P);
    }

    public m26 g() {
        return new m26(getContext(), this.X0);
    }

    public long getEndDate() {
        return this.i0.a[this.H];
    }

    public float getMinDistance() {
        nl1 nl1Var = this.i0;
        if (nl1Var == null) {
            return 0.1f;
        }
        int length = nl1Var.a.length;
        if (length < 5) {
            return 1.0f;
        }
        float f = 5.0f / length;
        if (f < 0.1f) {
            return 0.1f;
        }
        return f;
    }

    public long getSelectedDate() {
        int i = this.t0;
        if (i < 0) {
            return -1L;
        }
        return this.i0.a[i];
    }

    public long getStartDate() {
        return this.i0.a[this.G];
    }

    public l46 h(ml1 ml1Var) {
        return new kf0(ml1Var, this.X0);
    }

    public void i(Canvas canvas) {
        if (this.i0 != null) {
            byte b = this.z0;
            float f = 1.0f;
            if (b == 2) {
                f = 1.0f - this.A0.f;
            } else if (b == 1) {
                f = this.A0.f;
            } else if (b == 3) {
                f = this.A0.f;
            }
            Paint paint = this.M;
            paint.setAlpha((int) (this.n * f));
            int i = (int) (this.f * 255.0f * f);
            TextPaint textPaint = this.O;
            textPaint.setAlpha(i);
            this.P.setAlpha((int) (this.f * 255.0f * f));
            int textSize = (int) (o1 - textPaint.getTextSize());
            float measuredHeight = (getMeasuredHeight() - this.s) - 1;
            canvas.drawLine(this.E0, measuredHeight, this.F0, measuredHeight, paint);
            if (this.Q0) {
                return;
            }
            canvas.drawText("0", l1, r1 - textSize, textPaint);
        }
    }

    public void j(Canvas canvas) {
        char c;
        int i;
        int i2;
        if (this.i0 == null) {
            return;
        }
        ArrayList arrayList = this.c;
        this.n0 = arrayList.size();
        byte b = this.z0;
        float f = 1.0f;
        int i3 = 1;
        float f2 = b == 2 ? 1.0f - this.A0.f : b == 1 ? this.A0.f : b == 3 ? this.A0.f : 1.0f;
        char c2 = 0;
        this.o0 = 0;
        while (true) {
            int i4 = this.o0;
            if (i4 >= this.n0) {
                return;
            }
            int i5 = ((ll1) arrayList.get(i4)).d;
            int i6 = ((ll1) arrayList.get(this.o0)).a;
            if (i6 == 0) {
                i6 = i3;
            }
            int i7 = this.G - this.p0;
            while (i7 % i6 != 0) {
                i7--;
            }
            int i8 = this.H - this.p0;
            while (true) {
                if (i8 % i6 == 0 && i8 >= this.i0.a.length - i3) {
                    break;
                }
                i8++;
                i5 = i5;
                i3 = i3;
                c2 = c2;
                f = 1.0f;
            }
            int i9 = this.p0;
            int i10 = i7 + i9;
            int i11 = i8 + i9;
            float f3 = this.H0 * this.h0.k;
            float f4 = l1;
            float f5 = f3 - f4;
            while (i10 < i11) {
                if (i10 >= 0) {
                    long[] jArr = this.i0.a;
                    if (i10 < jArr.length - i3) {
                        long j = jArr[i10];
                        long j2 = jArr[c2];
                        long j3 = jArr[jArr.length - i3];
                        int i12 = i3;
                        i2 = i5;
                        float f6 = (((j - j2) / (j3 - j2)) * this.H0) - f5;
                        float f7 = f6 - u1;
                        if (f7 > 0.0f) {
                            float f8 = this.G0;
                            if (f7 <= f8 + f4) {
                                float f9 = q1;
                                c = c2;
                                TextPaint textPaint = this.Q;
                                if (f7 < f9) {
                                    textPaint.setAlpha((int) (i2 * td4.y(f9, f7, f9, f) * this.h * f2));
                                    i = i12;
                                } else {
                                    i = i12;
                                    float f10 = this.h;
                                    if (f7 > f8) {
                                        textPaint.setAlpha((int) mlb.C(i2, td4.y(f7, f8, f4, f), f10, f2));
                                    } else {
                                        textPaint.setAlpha((int) (i2 * f10 * f2));
                                    }
                                }
                                nl1 nl1Var = this.i0;
                                String[] strArr = nl1Var.c;
                                long[] jArr2 = nl1Var.a;
                                canvas.drawText(strArr[(int) ((jArr2[i10] - jArr2[c]) / nl1Var.k)], f6, gm.L(3.0f) + (getMeasuredHeight() - this.s) + p1, textPaint);
                                i10 += i6;
                                i5 = i2;
                                i3 = i;
                                c2 = c;
                                f = 1.0f;
                            }
                        }
                        c = c2;
                        i = i12;
                        i10 += i6;
                        i5 = i2;
                        i3 = i;
                        c2 = c;
                        f = 1.0f;
                    }
                }
                c = c2;
                i = i3;
                i2 = i5;
                i10 += i6;
                i5 = i2;
                i3 = i;
                c2 = c;
                f = 1.0f;
            }
            this.o0++;
            c2 = c2;
            f = 1.0f;
        }
    }

    public void k(Canvas canvas) {
        float f;
        boolean z;
        boolean z2;
        float f2;
        float f3;
        float f4;
        int i;
        float f5;
        int i2;
        boolean z3;
        if (this.i0 == null) {
            return;
        }
        float f6 = this.G0;
        tl1 tl1Var = this.h0;
        float f7 = tl1Var.l;
        float f8 = tl1Var.k;
        float f9 = f6 / (f7 - f8);
        float f10 = l1;
        float f11 = (f8 * f9) - f10;
        canvas.save();
        byte b = this.z0;
        float f12 = 2.0f;
        int i3 = 2;
        boolean z4 = true;
        if (b == 2) {
            a1c a1cVar = this.A0;
            float f13 = a1cVar.f;
            f = f13 > 0.5f ? 0.0f : 1.0f - (f13 * 2.0f);
            canvas.scale((f13 * 2.0f) + 1.0f, 1.0f, a1cVar.d, a1cVar.e);
        } else if (b == 1) {
            float f14 = this.A0.f;
            f = f14 < 0.3f ? 0.0f : f14;
            canvas.save();
            a1c a1cVar2 = this.A0;
            float f15 = a1cVar2.f;
            canvas.scale(f15, f15, a1cVar2.d, a1cVar2.e);
        } else {
            f = b == 3 ? this.A0.f : 1.0f;
        }
        int i4 = 0;
        int i5 = 0;
        while (true) {
            ArrayList arrayList = this.d;
            if (i5 >= arrayList.size()) {
                canvas.restore();
                return;
            }
            l46 l46Var = (l46) arrayList.get(i5);
            boolean z5 = l46Var.n;
            float[] fArr = l46Var.k;
            float f16 = f12;
            Path path = l46Var.f;
            Paint paint = l46Var.c;
            if (z5 || l46Var.o != 0.0f) {
                long[] jArr = l46Var.a.a;
                path.reset();
                float[] fArr2 = ((lq3) this.i0).b;
                z = z4;
                int i6 = ((int) (f10 / (fArr2.length < i3 ? 1.0f : fArr2[z ? 1 : 0] * f9))) + 1;
                int max = Math.max(i4, this.G - i6);
                int min = Math.min(((lq3) this.i0).b.length - 1, this.H + i6);
                boolean z6 = z ? 1 : 0;
                int i7 = 0;
                while (true) {
                    z2 = B1;
                    f2 = f9;
                    f3 = f11;
                    if (max > min) {
                        break;
                    }
                    long j = jArr[max];
                    if (j < 0) {
                        f5 = f10;
                        i2 = min;
                        z3 = z6;
                    } else {
                        f5 = f10;
                        lq3 lq3Var = (lq3) this.i0;
                        i2 = min;
                        float f17 = (lq3Var.b[max] * f2) - f3;
                        float f18 = j * lq3Var.l[i5];
                        float f19 = this.x;
                        float f20 = (f18 - f19) / (this.w - f19);
                        float strokeWidth = paint.getStrokeWidth() / f16;
                        z3 = z6;
                        float B = kt6.B((getMeasuredHeight() - this.s) - o1, strokeWidth, f20, (getMeasuredHeight() - this.s) - strokeWidth);
                        if (z2) {
                            int i8 = i7 + 1;
                            if (i7 == 0) {
                                fArr[i7] = f17;
                                i7 += 2;
                                fArr[i8] = B;
                            } else {
                                fArr[i7] = f17;
                                fArr[i8] = B;
                                int i9 = i7 + 3;
                                fArr[i7 + 2] = f17;
                                i7 += 4;
                                fArr[i9] = B;
                            }
                        } else if (z3) {
                            path.moveTo(f17, B);
                            z6 = false;
                            max++;
                            f9 = f2;
                            f11 = f3;
                            f10 = f5;
                            min = i2;
                        } else {
                            path.lineTo(f17, B);
                        }
                    }
                    z6 = z3;
                    max++;
                    f9 = f2;
                    f11 = f3;
                    f10 = f5;
                    min = i2;
                }
                f4 = f10;
                if (this.H - this.G > 100) {
                    paint.setStrokeCap(Paint.Cap.SQUARE);
                } else {
                    paint.setStrokeCap(Paint.Cap.ROUND);
                }
                paint.setAlpha((int) (l46Var.o * 255.0f * f));
                if (z2) {
                    i = 0;
                    canvas.drawLines(fArr, 0, i7, paint);
                } else {
                    canvas.drawPath(path, paint);
                    i = 0;
                }
            } else {
                f2 = f9;
                f3 = f11;
                f4 = f10;
                i = i4;
                z = z4;
            }
            i5++;
            i4 = i;
            f12 = f16;
            z4 = z;
            f9 = f2;
            f11 = f3;
            f10 = f4;
            i3 = 2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x007d A[LOOP:0: B:10:0x007b->B:11:0x007d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void l(Canvas canvas, ql1 ql1Var) {
        float f;
        byte b;
        int i;
        int length = ql1Var.a.length;
        float f2 = 1.0f;
        if (length > 2) {
            float f3 = (r0[1] - r0[0]) / (this.w - this.x);
            if (f3 < 0.1d) {
                f = f3 / 0.1f;
                b = this.z0;
                if (b != 2) {
                    f2 = 1.0f - this.A0.f;
                } else if (b == 1) {
                    f2 = this.A0.f;
                } else if (b == 3) {
                    f2 = this.A0.f;
                }
                Paint paint = this.M;
                paint.setAlpha((int) ((this.n / 255.0f) * ql1Var.f * f2 * f));
                this.O.setAlpha((int) mlb.C(ql1Var.f, this.f, f2, f));
                this.P.setAlpha((int) mlb.C(ql1Var.f, this.f, f2, f));
                int measuredHeight = (getMeasuredHeight() - this.s) - o1;
                for (i = !this.Q0 ? 1 : 0; i < length; i++) {
                    float measuredHeight2 = getMeasuredHeight() - this.s;
                    float f4 = ql1Var.a[i];
                    float f5 = this.x;
                    canvas.drawRect(this.E0, (int) (measuredHeight2 - (((f4 - f5) / (this.w - f5)) * measuredHeight)), this.F0, r4 + 1, paint);
                }
            }
        }
        f = 1.0f;
        b = this.z0;
        if (b != 2) {
        }
        Paint paint2 = this.M;
        paint2.setAlpha((int) ((this.n / 255.0f) * ql1Var.f * f2 * f));
        this.O.setAlpha((int) mlb.C(ql1Var.f, this.f, f2, f));
        this.P.setAlpha((int) mlb.C(ql1Var.f, this.f, f2, f));
        int measuredHeight3 = (getMeasuredHeight() - this.s) - o1;
        while (i < length) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0098, code lost:
    
        r3 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0307, code lost:
    
        if (r3.a == 2) goto L84;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m(Canvas canvas) {
        byte b;
        float f;
        int i;
        int i2;
        nl1 nl1Var;
        int i3;
        int i4;
        Canvas canvas2;
        byte b2;
        rl1 rl1Var;
        rl1 rl1Var2;
        int i5;
        float f2;
        byte b3;
        Paint paint;
        ValueAnimator valueAnimator;
        if (this.i0 == null) {
            return;
        }
        float f3 = this.D0;
        tl1 tl1Var = this.h0;
        tl1Var.b = f3;
        int measuredHeight = getMeasuredHeight();
        int i6 = r1;
        int i7 = measuredHeight - i6;
        int measuredHeight2 = getMeasuredHeight();
        int i8 = this.C0;
        int i9 = (measuredHeight2 - i8) - i6;
        float f4 = this.D0;
        float f5 = tl1Var.k * f4;
        float f6 = l1;
        int i10 = (int) (f5 + f6);
        int i11 = (int) ((tl1Var.l * f4) + f6);
        byte b4 = this.z0;
        if (b4 == 1) {
            a1c a1cVar = this.A0;
            int i12 = (int) ((a1cVar.a * f4) + f6);
            b = 1;
            int i13 = (int) ((f4 * a1cVar.b) + f6);
            float f7 = 1.0f - a1cVar.f;
            i10 = (int) (((i12 - i10) * f7) + i10);
            i11 = (int) ((f7 * (i13 - i11)) + i11);
        } else {
            b = 1;
            if (b4 == 3) {
                f = this.A0.f;
                i = i10;
                i2 = i11;
                nl1Var = this.i0;
                int i14 = v1;
                Paint paint2 = this.S;
                Paint paint3 = this.L;
                if (nl1Var == null) {
                    if (b4 == 0) {
                        int i15 = 0;
                        while (true) {
                            ArrayList arrayList = this.d;
                            f2 = f;
                            if (i15 >= arrayList.size()) {
                                break;
                            }
                            l46 l46Var = (l46) arrayList.get(i15);
                            ValueAnimator valueAnimator2 = l46Var.h;
                            if ((valueAnimator2 == null || !valueAnimator2.isRunning()) && ((valueAnimator = l46Var.i) == null || !valueAnimator.isRunning())) {
                                i15++;
                                f = f2;
                            }
                        }
                    } else {
                        f2 = f;
                    }
                    byte b5 = 0;
                    if (b5 != 0) {
                        canvas.save();
                        b3 = b5;
                        canvas.clipRect(f6, (getMeasuredHeight() - i6) - i8, getMeasuredWidth() - f6, getMeasuredHeight() - i6);
                        canvas.translate(f6, (getMeasuredHeight() - i6) - i8);
                        n(canvas);
                        canvas.restore();
                    } else {
                        b3 = b5;
                        if (this.I) {
                            this.q0.eraseColor(0);
                            n(this.r0);
                            this.I = false;
                        }
                    }
                    if (b3 == 0) {
                        byte b6 = this.z0;
                        if (b6 == 2) {
                            float f8 = this.D0;
                            a1c a1cVar2 = this.A0;
                            float f9 = (a1cVar2.c * f8) + f6;
                            paint3.setAlpha((int) ((1.0f - a1cVar2.f) * 255.0f));
                            canvas.save();
                            paint = paint2;
                            i3 = i6;
                            canvas.clipRect(f6, i9, getMeasuredWidth() - f6, i7);
                            canvas.scale((this.A0.f * 2.0f) + 1.0f, 1.0f, f9, ((i7 - i9) + i9) >> 1);
                            canvas.drawBitmap(this.q0, f6, (getMeasuredHeight() - i3) - i8, paint3);
                            canvas.restore();
                        } else {
                            paint = paint2;
                            i3 = i6;
                            byte b7 = b;
                            if (b6 == b7) {
                                float f10 = ((i7 - i9) + i9) >> b7;
                                float f11 = this.D0;
                                a1c a1cVar3 = this.A0;
                                float f12 = a1cVar3.c;
                                float f13 = f11 * f12;
                                float f14 = f13 + f6;
                                if (f12 <= 0.5f) {
                                    f13 = (1.0f - f12) * f11;
                                }
                                float f15 = f13 * a1cVar3.f;
                                canvas.save();
                                i4 = i14;
                                canvas.clipRect(f14 - f15, i9, f15 + f14, i7);
                                paint3.setAlpha((int) (this.A0.f * 255.0f));
                                canvas.scale(this.A0.f, 1.0f, f14, f10);
                                canvas.drawBitmap(this.q0, f6, (getMeasuredHeight() - i3) - i8, paint3);
                                canvas.restore();
                            } else {
                                i4 = i14;
                                paint3.setAlpha((int) (f2 * 255.0f));
                                canvas.drawBitmap(this.q0, f6, (getMeasuredHeight() - i3) - i8, paint3);
                            }
                            if (this.z0 != 2) {
                                return;
                            }
                            float f16 = i9;
                            float f17 = i7;
                            float f18 = l1;
                            Paint paint4 = paint;
                            canvas.drawRect(f18, f16, i + i4, f17, paint4);
                            canvas2 = canvas;
                            canvas2.drawRect(i2 - i4, f16, getMeasuredWidth() - f18, f17, paint4);
                            f6 = f18;
                        }
                    } else {
                        paint = paint2;
                        i3 = i6;
                    }
                    i4 = i14;
                    if (this.z0 != 2) {
                    }
                } else {
                    i3 = i6;
                    i4 = i14;
                    canvas2 = canvas;
                    canvas2.drawRect(f6, i9, getMeasuredWidth() - f6, i7, paint2);
                }
                canvas2.drawBitmap(this.a.b(i8, (int) (getMeasuredWidth() - (2.0f * f6))), f6, (getMeasuredHeight() - i3) - i8, paint3);
                if (this.i0 == null) {
                    Rect rect = this.W;
                    rect.set(i, i9, i2, i7);
                    tl1Var.j.set(rect);
                    int i16 = rect.left;
                    int i17 = rect.top;
                    float f19 = rect.bottom + A1;
                    float f20 = w1;
                    Path path = this.a0;
                    b(path, i16, i17 - r10, i16 + i4, f19, f20, f20, true, false, false, true);
                    Paint paint5 = this.R;
                    canvas2.drawPath(path, paint5);
                    b(path, r3 - i4, rect.top - r10, rect.right, rect.bottom + r10, f20, f20, false, true, true, false);
                    canvas2.drawPath(path, paint5);
                    canvas2.drawRect(rect.left + i4, rect.bottom, rect.right - i4, r3 + r10, paint5);
                    canvas.drawRect(rect.left + i4, r1 - r10, rect.right - i4, rect.top, paint5);
                    int i18 = rect.left;
                    int i19 = x1;
                    float centerY = rect.centerY() - i19;
                    float f21 = rect.left + i19;
                    float centerY2 = rect.centerY() + i19;
                    Paint paint6 = this.V;
                    canvas.drawLine(i18 + i19, centerY, f21, centerY2, paint6);
                    canvas.drawLine(rect.right - i19, rect.centerY() - i19, rect.right - i19, rect.centerY() + i19, paint6);
                    rl1[] rl1VarArr = tl1Var.n;
                    rl1 rl1Var3 = rl1VarArr[0];
                    if (rl1Var3 == null || rl1Var3.a != 4) {
                        b2 = 1;
                        rl1Var = rl1VarArr[1];
                        if (rl1Var == null || rl1Var.a != 4) {
                            rl1Var = null;
                        }
                    } else {
                        rl1Var = rl1Var3;
                        b2 = 1;
                    }
                    int i20 = rect.bottom;
                    int i21 = rect.top;
                    int i22 = (i20 - i21) >> b2;
                    int i23 = i21 + i22;
                    if (rl1Var == null) {
                        if (rl1Var3 == null || rl1Var3.a != b2) {
                            rl1Var2 = rl1VarArr[b2];
                            if (rl1Var2 == null || rl1Var2.a != b2) {
                                rl1Var2 = null;
                            }
                        } else {
                            rl1Var2 = rl1Var3;
                        }
                        byte b8 = rl1Var3 != null ? (byte) 2 : (byte) 2;
                        rl1Var3 = rl1VarArr[b2];
                        if (rl1Var3 == null || rl1Var3.a != b8) {
                            rl1Var3 = null;
                        }
                        Paint paint7 = this.U;
                        int i24 = z1;
                        int i25 = y1;
                        if (rl1Var2 != null) {
                            i5 = i25;
                            canvas.drawCircle(rect.left + i25, i23, (i22 * rl1Var2.f) - i24, paint7);
                        } else {
                            i5 = i25;
                        }
                        if (rl1Var3 != null) {
                            canvas.drawCircle(rect.right - i5, i23, (i22 * rl1Var3.f) - i24, paint7);
                        }
                    }
                    Rect rect2 = tl1Var.h;
                    int i26 = s1;
                    int i27 = i26 >> 1;
                    rect2.set(i - i26, i9, i + i27, i7);
                    tl1Var.i.set(i2 - i27, i9, i2 + i26, i7);
                    return;
                }
                return;
            }
        }
        i = i10;
        i2 = i11;
        f = 1.0f;
        nl1Var = this.i0;
        int i142 = v1;
        Paint paint22 = this.S;
        Paint paint32 = this.L;
        if (nl1Var == null) {
        }
        canvas2.drawBitmap(this.a.b(i8, (int) (getMeasuredWidth() - (2.0f * f6))), f6, (getMeasuredHeight() - i3) - i8, paint32);
        if (this.i0 == null) {
        }
    }

    public void n(Canvas canvas) {
        int i;
        ArrayList arrayList;
        int i2;
        int i3;
        float f;
        ArrayList arrayList2;
        float f2;
        int measuredHeight = getMeasuredHeight();
        int i4 = r1;
        int i5 = measuredHeight - i4;
        int measuredHeight2 = (getMeasuredHeight() - this.C0) - i4;
        ArrayList arrayList3 = this.d;
        int size = arrayList3.size();
        if (this.i0 != null) {
            int i6 = 0;
            while (i6 < size) {
                kf0 kf0Var = (kf0) arrayList3.get(i6);
                boolean z = kf0Var.n;
                Paint paint = kf0Var.c;
                float[] fArr = kf0Var.k;
                if (z || kf0Var.o != 0.0f) {
                    kf0Var.e.reset();
                    float[] fArr2 = this.i0.b;
                    int length = fArr2.length;
                    float f3 = fArr2.length < 2 ? 1.0f : fArr2[1] * this.D0;
                    long[] jArr = kf0Var.a.a;
                    float f4 = kf0Var.o;
                    int i7 = 0;
                    int i8 = 0;
                    while (i7 < length) {
                        int i9 = i6;
                        long j = jArr[i7];
                        if (j < 0) {
                            i3 = i5;
                            arrayList2 = arrayList3;
                        } else {
                            nl1 nl1Var = this.i0;
                            i3 = i5;
                            float f5 = this.D0 * nl1Var.b[i7];
                            if (C1) {
                                f2 = this.k0;
                                f = f5;
                                arrayList2 = arrayList3;
                            } else {
                                f = f5;
                                arrayList2 = arrayList3;
                                f2 = nl1Var.e;
                            }
                            float x = hg9.x(j, f2, f4, 1.0f) * (i3 - measuredHeight2);
                            fArr[i8] = f;
                            fArr[i8 + 1] = x;
                            int i10 = i8 + 3;
                            fArr[i8 + 2] = f;
                            i8 += 4;
                            fArr[i10] = getMeasuredHeight() - this.s;
                        }
                        i7++;
                        i6 = i9;
                        i5 = i3;
                        arrayList3 = arrayList2;
                    }
                    i = i5;
                    arrayList = arrayList3;
                    i2 = i6;
                    paint.setStrokeWidth(f3 + 2.0f);
                    canvas.drawLines(fArr, 0, i8, paint);
                } else {
                    i = i5;
                    arrayList = arrayList3;
                    i2 = i6;
                }
                i6 = i2 + 1;
                i5 = i;
                arrayList3 = arrayList;
            }
        }
    }

    public void o(Canvas canvas) {
        nl1 nl1Var;
        int i = this.t0;
        if (i < 0 || !this.v0 || (nl1Var = this.i0) == null) {
            return;
        }
        int i2 = (int) (this.r * this.w0);
        float f = this.G0;
        tl1 tl1Var = this.h0;
        float f2 = tl1Var.l;
        float f3 = tl1Var.k;
        float f4 = f / (f2 - f3);
        float f5 = (f3 * f4) - l1;
        float[] fArr = nl1Var.b;
        if (i >= fArr.length) {
            return;
        }
        float f6 = (fArr[i] * f4) - f5;
        Paint paint = this.N;
        paint.setAlpha(i2);
        canvas.drawLine(f6, 0.0f, f6, this.I0.bottom, paint);
        if (!this.e) {
            return;
        }
        ArrayList arrayList = this.d;
        this.n0 = arrayList.size();
        int i3 = 0;
        while (true) {
            this.o0 = i3;
            int i4 = this.o0;
            if (i4 >= this.n0) {
                return;
            }
            l46 l46Var = (l46) arrayList.get(i4);
            boolean z = l46Var.n;
            Paint paint2 = l46Var.d;
            if (z || l46Var.o != 0.0f) {
                float f7 = l46Var.a.a[this.t0];
                float f8 = this.x;
                float measuredHeight = (getMeasuredHeight() - this.s) - (((f7 - f8) / (this.w - f8)) * ((getMeasuredHeight() - this.s) - o1));
                paint2.setAlpha((int) (l46Var.o * 255.0f * this.w0));
                int i5 = (int) (l46Var.o * 255.0f * this.w0);
                Paint paint3 = this.T;
                paint3.setAlpha(i5);
                canvas.drawPoint(f6, measuredHeight, paint2);
                canvas.drawPoint(f6, measuredHeight, paint3);
            }
            i3 = this.o0 + 1;
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (this.x0) {
            super.onDraw(canvas);
            return;
        }
        F();
        int save = canvas.save();
        RectF rectF = this.I0;
        canvas.clipRect(0.0f, rectF.top, getMeasuredWidth(), rectF.bottom);
        i(canvas);
        ArrayList arrayList = this.b;
        this.n0 = arrayList.size();
        int i = 0;
        this.o0 = 0;
        while (true) {
            int i2 = this.o0;
            if (i2 >= this.n0) {
                break;
            }
            l(canvas, (ql1) arrayList.get(i2));
            this.o0++;
        }
        k(canvas);
        while (true) {
            this.o0 = i;
            int i3 = this.o0;
            if (i3 >= this.n0) {
                canvas.restoreToCount(save);
                j(canvas);
                m(canvas);
                o(canvas);
                super.onDraw(canvas);
                return;
            }
            p(canvas, (ql1) arrayList.get(i3));
            i = this.o0 + 1;
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.J) {
            setMeasuredDimension(View.MeasureSpec.getSize(i), gm.q.y - gm.L(56.0f));
        } else {
            setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i));
        }
        int measuredWidth = getMeasuredWidth();
        int i3 = this.Y0;
        int i4 = this.C0;
        if (measuredWidth != i3 || getMeasuredHeight() != this.Z0) {
            this.Y0 = getMeasuredWidth();
            this.Z0 = getMeasuredHeight();
            float measuredWidth2 = getMeasuredWidth();
            float f = l1;
            float f2 = 2.0f * f;
            this.q0 = Bitmap.createBitmap((int) (measuredWidth2 - f2), i4, Bitmap.Config.ARGB_4444);
            this.r0 = new Canvas(this.q0);
            this.a.b(i4, (int) (getMeasuredWidth() - f2));
            w();
            if (this.v0) {
                x((this.H0 * this.h0.k) - f);
            }
            A(false, true, false);
        }
        if (Build.VERSION.SDK_INT >= 29) {
            int measuredHeight = getMeasuredHeight();
            int i5 = r1;
            this.a1.set(0, measuredHeight - ((i4 + i5) + i5), getMeasuredWidth(), getMeasuredHeight());
            setSystemGestureExclusionRects(this.b1);
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ValueAnimator valueAnimator;
        ValueAnimator valueAnimator2;
        if (this.i0 != null) {
            boolean z = this.K;
            tl1 tl1Var = this.h0;
            if (!z) {
                tl1Var.c(motionEvent.getActionIndex(), motionEvent);
                getParent().requestDisallowInterceptTouchEvent(false);
                this.s0 = false;
                return false;
            }
            int x = (int) motionEvent.getX(motionEvent.getActionIndex());
            int y = (int) motionEvent.getY(motionEvent.getActionIndex());
            int actionMasked = motionEvent.getActionMasked();
            RectF rectF = this.I0;
            if (actionMasked == 0) {
                this.h1 = System.currentTimeMillis();
                getParent().requestDisallowInterceptTouchEvent(true);
                if (!tl1Var.a(x, y, motionEvent.getActionIndex())) {
                    this.d1 = x;
                    this.f1 = x;
                    this.e1 = y;
                    this.g1 = y;
                    if (rectF.contains(x, y)) {
                        if (this.t0 < 0 || !this.j1) {
                            this.s0 = true;
                            C(x, y);
                            return true;
                        }
                    }
                }
                return true;
            }
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    int i = x - this.d1;
                    int i2 = y - this.e1;
                    if (tl1Var.n[0] != null || tl1Var.c) {
                        boolean b = tl1Var.b(x, motionEvent.getActionIndex());
                        if (motionEvent.getPointerCount() > 1) {
                            int x2 = (int) motionEvent.getX(1);
                            motionEvent.getY(1);
                            tl1Var.b(x2, 1);
                        }
                        getParent().requestDisallowInterceptTouchEvent(b);
                        return true;
                    }
                    boolean z2 = this.s0;
                    int i3 = this.B0;
                    if (z2) {
                        boolean z3 = (this.i1 && System.currentTimeMillis() - this.h1 > 200) || Math.abs(i) > Math.abs(i2) || Math.abs(i2) < i3;
                        this.d1 = x;
                        this.e1 = y;
                        getParent().requestDisallowInterceptTouchEvent(z3);
                        C(x, y);
                        return true;
                    }
                    if (rectF.contains(this.f1, this.g1)) {
                        int i4 = this.f1 - x;
                        int i5 = this.g1 - y;
                        if (Math.sqrt((i5 * i5) + (i4 * i4)) > i3 || System.currentTimeMillis() - this.h1 > 200) {
                            this.s0 = true;
                            C(x, y);
                            return true;
                        }
                    }
                    return true;
                }
                if (actionMasked != 3) {
                    if (actionMasked == 5) {
                        return tl1Var.a(x, y, motionEvent.getActionIndex());
                    }
                    if (actionMasked == 6) {
                        tl1Var.c(motionEvent.getActionIndex(), motionEvent);
                        return true;
                    }
                }
            }
            if (!tl1Var.c(motionEvent.getActionIndex(), motionEvent)) {
                if (rectF.contains(this.f1, this.g1) && !this.s0) {
                    c(false);
                }
                rl1[] rl1VarArr = tl1Var.n;
                rl1 rl1Var = rl1VarArr[0];
                if (rl1Var != null && (valueAnimator2 = rl1Var.e) != null) {
                    valueAnimator2.cancel();
                }
                rl1 rl1Var2 = rl1VarArr[1];
                if (rl1Var2 != null && (valueAnimator = rl1Var2.e) != null) {
                    valueAnimator.cancel();
                }
                rl1VarArr[0] = null;
                rl1VarArr[1] = null;
                I();
                getParent().requestDisallowInterceptTouchEvent(false);
                this.s0 = false;
                y();
                invalidate();
                E(r(this.G, this.H), this.Q0 ? s(this.G, this.H) : 0L, true, true, false);
                return true;
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void p(Canvas canvas, ql1 ql1Var) {
        float f;
        byte b;
        int i;
        TextPaint textPaint;
        ql1 ql1Var2;
        int length = ql1Var.a.length;
        float f2 = 1.0f;
        if (length > 2) {
            float f3 = (r0[1] - r0[0]) / (this.w - this.x);
            if (f3 < 0.1d) {
                f = f3 / 0.1f;
                b = this.z0;
                if (b != 2) {
                    f2 = 1.0f - this.A0.f;
                } else if (b == 1) {
                    f2 = this.A0.f;
                } else if (b == 3) {
                    f2 = this.A0.f;
                }
                this.M.setAlpha((int) ((this.n / 255.0f) * ql1Var.f * f2 * f));
                int C = (int) mlb.C(ql1Var.f, this.f, f2, f);
                TextPaint textPaint2 = this.O;
                textPaint2.setAlpha(C);
                int C2 = (int) mlb.C(ql1Var.f, this.f, f2, f);
                TextPaint textPaint3 = this.P;
                textPaint3.setAlpha(C2);
                int measuredHeight = getMeasuredHeight() - this.s;
                int i2 = o1;
                int i3 = measuredHeight - i2;
                int textSize = (int) (i2 - textPaint2.getTextSize());
                i = !this.Q0 ? 1 : 0;
                while (i < length) {
                    float measuredHeight2 = getMeasuredHeight() - this.s;
                    float f4 = ql1Var.a[i];
                    float f5 = this.x;
                    float f6 = ((int) (measuredHeight2 - (((f4 - f5) / (this.w - f5)) * i3))) - textSize;
                    float f7 = l1;
                    ql1 ql1Var3 = ql1Var;
                    int i4 = i;
                    Canvas canvas2 = canvas;
                    ql1Var3.a(canvas2, 0, i4, f7, f6, textPaint2);
                    if (ql1Var3.c != null) {
                        float measuredWidth = getMeasuredWidth() - f7;
                        textPaint = textPaint3;
                        ql1Var2 = ql1Var3;
                        ql1Var2.a(canvas2, 1, i4, measuredWidth, f6, textPaint);
                    } else {
                        textPaint = textPaint3;
                        ql1Var2 = ql1Var3;
                    }
                    i = i4 + 1;
                    ql1Var = ql1Var2;
                    canvas = canvas2;
                    textPaint3 = textPaint;
                }
            }
        }
        f = 1.0f;
        b = this.z0;
        if (b != 2) {
        }
        this.M.setAlpha((int) ((this.n / 255.0f) * ql1Var.f * f2 * f));
        int C3 = (int) mlb.C(ql1Var.f, this.f, f2, f);
        TextPaint textPaint22 = this.O;
        textPaint22.setAlpha(C3);
        int C22 = (int) mlb.C(ql1Var.f, this.f, f2, f);
        TextPaint textPaint32 = this.P;
        textPaint32.setAlpha(C22);
        int measuredHeight3 = getMeasuredHeight() - this.s;
        int i22 = o1;
        int i32 = measuredHeight3 - i22;
        int textSize2 = (int) (i22 - textPaint22.getTextSize());
        i = !this.Q0 ? 1 : 0;
        while (i < length) {
        }
    }

    public long r(int i, int i2) {
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        long j = 0;
        for (int i3 = 0; i3 < size; i3++) {
            if (((l46) arrayList.get(i3)).n) {
                long t = ((l46) arrayList.get(i3)).a.b.t(i, i2);
                if (t > j) {
                    j = t;
                }
            }
        }
        return j;
    }

    public long s(int i, int i2) {
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        long j = Long.MAX_VALUE;
        for (int i3 = 0; i3 < size; i3++) {
            if (((l46) arrayList.get(i3)).n) {
                long v = ((l46) arrayList.get(i3)).a.b.v(i, i2);
                if (v < j) {
                    j = v;
                }
            }
        }
        return j;
    }

    public void setDateSelectionListener(lg0 lg0Var) {
        this.R0 = lg0Var;
    }

    public void setHeader(pl1 pl1Var) {
        this.k1 = pl1Var;
    }

    public void setLandscape(boolean z) {
        this.J = z;
    }

    public void t() {
        this.M.setStrokeWidth(1.0f);
        this.N.setStrokeWidth(m1);
        TextPaint textPaint = this.O;
        float f = n1;
        textPaint.setTextSize(f);
        TextPaint textPaint2 = this.P;
        textPaint2.setTextSize(f);
        textPaint2.setTextAlign(Paint.Align.RIGHT);
        TextPaint textPaint3 = this.Q;
        textPaint3.setTextSize(f);
        textPaint3.setTextAlign(Paint.Align.CENTER);
        float N = gm.N(6.0f);
        Paint paint = this.T;
        paint.setStrokeWidth(N);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint.setStrokeCap(cap);
        setLayerType(2, null);
        setWillNotDraw(false);
        m26 g = g();
        this.u0 = g;
        g.setVisibility(8);
        Paint paint2 = this.V;
        paint2.setColor(-1);
        paint2.setStrokeWidth(gm.N(3.0f));
        paint2.setStrokeCap(cap);
        G();
    }

    public void u() {
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            l46 l46Var = (l46) obj;
            boolean z = l46Var.n;
            ml1 ml1Var = l46Var.a;
            if (z) {
                long j = ml1Var.e;
                if (j > this.k0) {
                    this.k0 = j;
                }
            }
            if (z) {
                long j2 = ml1Var.f;
                if (j2 < this.l0) {
                    this.l0 = j2;
                }
            }
            float f = this.k0;
            float f2 = this.l0;
            if (f == f2) {
                this.k0 = f + 1.0f;
                this.l0 = f2 - 1.0f;
            }
        }
    }

    public final void v() {
        int measuredHeight = getMeasuredHeight() - this.s;
        float f = this.y;
        if (f == 0.0f || measuredHeight == 0) {
            return;
        }
        this.F = (f / measuredHeight) * n1;
    }

    public final void w() {
        if (getMeasuredHeight() <= 0 || getMeasuredWidth() <= 0) {
            return;
        }
        float measuredWidth = getMeasuredWidth();
        float f = l1;
        this.D0 = measuredWidth - (2.0f * f);
        this.E0 = f;
        float measuredWidth2 = getMeasuredWidth() - (this.J ? t1 : f);
        this.F0 = measuredWidth2;
        float f2 = measuredWidth2 - this.E0;
        this.G0 = f2;
        tl1 tl1Var = this.h0;
        this.H0 = f2 / (tl1Var.l - tl1Var.k);
        I();
        this.s = gm.L(100.0f);
        this.I0.set(this.E0 - f, 0.0f, this.F0 + f, getMeasuredHeight() - this.s);
        if (this.i0 != null) {
            this.p0 = (int) (gm.L(20.0f) / (this.D0 / this.i0.a.length));
        }
        v();
    }

    public final void x(float f) {
        int i;
        nl1 nl1Var = this.i0;
        if (nl1Var == null || (i = this.t0) < 0) {
            return;
        }
        long[] jArr = nl1Var.a;
        if (i >= jArr.length || !this.v0) {
            return;
        }
        this.u0.c(i, jArr[i], this.d, false, nl1Var.j, nl1Var.h);
        this.u0.setVisibility(0);
        this.u0.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), TLObject.FLAG_31));
        float f2 = (this.i0.b[this.t0] * this.H0) - f;
        float width = f2 > (this.E0 + this.G0) / 2.0f ? f2 - (this.u0.getWidth() + r1) : f2 + y1;
        if (width < 0.0f) {
            width = 0.0f;
        } else if (this.u0.getMeasuredWidth() + width > getMeasuredWidth()) {
            width = getMeasuredWidth() - this.u0.getMeasuredWidth();
        }
        this.u0.setTranslationX(width);
    }

    public void z() {
        ValueAnimator valueAnimator;
        ValueAnimator valueAnimator2;
        ValueAnimator valueAnimator3;
        final byte b = 1;
        A(true, true, true);
        ArrayList arrayList = this.d;
        this.n0 = arrayList.size();
        final byte b2 = 0;
        this.o0 = 0;
        while (true) {
            int i = this.o0;
            if (i >= this.n0) {
                break;
            }
            final l46 l46Var = (l46) arrayList.get(i);
            if (l46Var.n && (valueAnimator3 = l46Var.i) != null) {
                valueAnimator3.cancel();
            }
            if (!l46Var.n && (valueAnimator2 = l46Var.h) != null) {
                valueAnimator2.cancel();
            }
            if (l46Var.n && l46Var.o != 1.0f) {
                ValueAnimator valueAnimator4 = l46Var.h;
                if (valueAnimator4 == null || !valueAnimator4.isRunning()) {
                    ValueAnimator e = e(l46Var.o, 1.0f, new ValueAnimator.AnimatorUpdateListener(this) { // from class: jg0
                        public final /* synthetic */ ng0 b;

                        {
                            this.b = this;
                        }

                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator5) {
                            byte b3 = b2;
                            l46 l46Var2 = l46Var;
                            ng0 ng0Var = this.b;
                            switch (b3) {
                                case 0:
                                    l46Var2.o = ((Float) valueAnimator5.getAnimatedValue()).floatValue();
                                    ng0Var.I = true;
                                    ng0Var.invalidate();
                                    break;
                                default:
                                    l46Var2.o = ((Float) valueAnimator5.getAnimatedValue()).floatValue();
                                    ng0Var.I = true;
                                    ng0Var.invalidate();
                                    break;
                            }
                        }
                    });
                    l46Var.h = e;
                    e.start();
                } else {
                    this.o0++;
                }
            }
            if (!l46Var.n && l46Var.o != 0.0f && ((valueAnimator = l46Var.i) == null || !valueAnimator.isRunning())) {
                ValueAnimator e2 = e(l46Var.o, 0.0f, new ValueAnimator.AnimatorUpdateListener(this) { // from class: jg0
                    public final /* synthetic */ ng0 b;

                    {
                        this.b = this;
                    }

                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator5) {
                        byte b3 = b;
                        l46 l46Var2 = l46Var;
                        ng0 ng0Var = this.b;
                        switch (b3) {
                            case 0:
                                l46Var2.o = ((Float) valueAnimator5.getAnimatedValue()).floatValue();
                                ng0Var.I = true;
                                ng0Var.invalidate();
                                break;
                            default:
                                l46Var2.o = ((Float) valueAnimator5.getAnimatedValue()).floatValue();
                                ng0Var.I = true;
                                ng0Var.invalidate();
                                break;
                        }
                    }
                });
                l46Var.i = e2;
                e2.start();
            }
            this.o0++;
        }
        K();
        if (this.v0) {
            m26 m26Var = this.u0;
            int i2 = this.t0;
            nl1 nl1Var = this.i0;
            m26Var.c(i2, nl1Var.a[i2], arrayList, true, nl1Var.j, nl1Var.h);
        }
    }

    public void q(a1c a1cVar) {
    }

    public void y() {
    }
}
