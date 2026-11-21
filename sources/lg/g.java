package lg;

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
import ch.w;
import com.google.android.gms.internal.vision.e2;
import java.util.ArrayList;
import ki.m3;
import org.telegram.messenger.f3;
import org.telegram.messenger.g0;
import org.telegram.messenger.ks;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.Components.nr;
import org.telegram.ui.m41;
import org.telegram.ui.qi0;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public abstract class g extends View implements i {
    public static final boolean B1;
    public static final boolean C1;
    public static final x1.a D1;
    public ng.j A0;
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
    public final d K0;
    public final Paint L;
    public final d L0;
    public final Paint M;
    public final b M0;
    public final Paint N;
    public final b N0;
    public final TextPaint O;
    public final d O0;
    public final TextPaint P;
    public final m3 P0;
    public final TextPaint Q;
    public boolean Q0;
    public final Paint R;
    public e R0;
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
    public final h6 X0;
    public int Y0;
    public int Z0;
    public f a;
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
    public final j h0;
    public long h1;
    public mg.b i0;
    public boolean i1;
    public ng.b j0;
    public boolean j1;
    public float k0;
    public ng.c k1;
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
    public ng.e u0;
    public boolean v0;
    public float w;
    public float w0;
    public float x;
    public boolean x0;
    public float y;
    public boolean y0;
    public int z0;
    public static final float l1 = g0.N(16.0f);
    public static final float m1 = g0.N(1.5f);
    public static final float n1 = g0.N(12.0f);
    public static final int o1 = g0.L(18.0f);
    public static final int p1 = g0.L(14.0f);
    public static final int q1 = g0.L(10.0f);
    public static final int r1 = g0.L(16.0f);
    public static final int s1 = g0.L(24.0f);
    public static final int t1 = g0.L(16.0f);
    public static final int u1 = g0.L(10.0f);
    public static final int v1 = g0.L(12.0f);
    public static final int w1 = g0.L(8.0f);
    public static final int x1 = g0.L(6.0f);
    public static final int y1 = g0.L(5.0f);
    public static final int z1 = g0.L(2.0f);
    public static final int A1 = g0.L(1.0f);

    static {
        B1 = Build.VERSION.SDK_INT < 28;
        C1 = true;
        D1 = new x1.a();
    }

    /* JADX WARN: Type inference failed for: r1v10, types: [lg.b] */
    /* JADX WARN: Type inference failed for: r1v9, types: [lg.b] */
    public g(Context context, h6 h6Var) {
        super(context);
        this.b = new ArrayList(10);
        this.c = new ArrayList(25);
        this.d = new ArrayList();
        final int i7 = 1;
        this.e = true;
        this.w = 250.0f;
        this.x = 0.0f;
        this.y = 0.0f;
        this.E = 0.0f;
        this.F = 0.0f;
        this.I = true;
        final int i10 = 0;
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
        j jVar = new j();
        jVar.h = new Rect();
        jVar.i = new Rect();
        jVar.j = new Rect();
        jVar.k = 0.7f;
        jVar.l = 1.0f;
        jVar.m = 0.1f;
        jVar.n = new h[]{null, null};
        jVar.a = this;
        this.h0 = jVar;
        this.s0 = false;
        this.t0 = -1;
        this.v0 = false;
        this.w0 = 0.0f;
        this.x0 = false;
        this.y0 = false;
        this.z0 = 0;
        this.C0 = g0.L(46.0f);
        this.I0 = new RectF();
        this.K0 = new d(this, i10);
        this.L0 = new d(this, i7);
        this.M0 = new ValueAnimator.AnimatorUpdateListener(this) { // from class: lg.b
            public final /* synthetic */ g b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i10) {
                    case 0:
                        g gVar = this.b;
                        gVar.getClass();
                        gVar.w = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        gVar.invalidate();
                        break;
                    default:
                        g gVar2 = this.b;
                        gVar2.getClass();
                        gVar2.x = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        gVar2.invalidate();
                        break;
                }
            }
        };
        this.N0 = new ValueAnimator.AnimatorUpdateListener(this) { // from class: lg.b
            public final /* synthetic */ g b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i7) {
                    case 0:
                        g gVar = this.b;
                        gVar.getClass();
                        gVar.w = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        gVar.invalidate();
                        break;
                    default:
                        g gVar2 = this.b;
                        gVar2.getClass();
                        gVar2.x = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        gVar2.invalidate();
                        break;
                }
            }
        };
        this.O0 = new d(this, 2);
        this.P0 = new m3(this, i7);
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
        this.X0 = h6Var;
        t();
        this.B0 = ViewConfiguration.get(context).getScaledTouchSlop();
    }

    public static void b(Path path, float f10, float f11, float f12, float f13, float f14, float f15, boolean z10, boolean z11, boolean z12, boolean z13) {
        path.reset();
        if (f14 < 0.0f) {
            f14 = 0.0f;
        }
        if (f15 < 0.0f) {
            f15 = 0.0f;
        }
        float f16 = f12 - f10;
        float f17 = f13 - f11;
        float f18 = f16 / 2.0f;
        if (f14 > f18) {
            f14 = f18;
        }
        float f19 = f17 / 2.0f;
        if (f15 > f19) {
            f15 = f19;
        }
        float f20 = f16 - (f14 * 2.0f);
        float f21 = f17 - (2.0f * f15);
        path.moveTo(f12, f11 + f15);
        if (z11) {
            float f22 = -f15;
            path.rQuadTo(0.0f, f22, -f14, f22);
        } else {
            path.rLineTo(0.0f, -f15);
            path.rLineTo(-f14, 0.0f);
        }
        path.rLineTo(-f20, 0.0f);
        if (z10) {
            float f23 = -f14;
            path.rQuadTo(f23, 0.0f, f23, f15);
        } else {
            path.rLineTo(-f14, 0.0f);
            path.rLineTo(0.0f, f15);
        }
        path.rLineTo(0.0f, f21);
        if (z13) {
            path.rQuadTo(0.0f, f15, f14, f15);
        } else {
            path.rLineTo(0.0f, f15);
            path.rLineTo(f14, 0.0f);
        }
        path.rLineTo(f20, 0.0f);
        if (z12) {
            path.rQuadTo(f14, 0.0f, f14, -f15);
        } else {
            path.rLineTo(f14, 0.0f);
            path.rLineTo(0.0f, -f15);
        }
        path.rLineTo(0.0f, -f21);
        path.close();
    }

    public static ValueAnimator e(float f10, float f11, ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f11);
        ofFloat.setDuration(400L);
        ofFloat.setInterpolator(D1);
        ofFloat.addUpdateListener(animatorUpdateListener);
        return ofFloat;
    }

    public void A(boolean z10, boolean z11, boolean z12) {
        if (this.i0 == null) {
            return;
        }
        float f10 = this.G0;
        j jVar = this.h0;
        this.H0 = f10 / (jVar.l - jVar.k);
        H();
        E(r(this.G, this.H), this.Q0 ? s(this.G, this.H) : 0L, z10, z11, z12);
        if (this.v0 && !z11) {
            c(false);
            x((this.H0 * jVar.k) - l1);
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

    public void C(int i7, int i10) {
        int i11 = this.t0;
        mg.b bVar = this.i0;
        if (bVar == null) {
            return;
        }
        float f10 = this.H0;
        float f11 = (this.h0.k * f10) - l1;
        float f12 = (i7 + f11) / f10;
        if (f12 < 0.0f) {
            this.t0 = 0;
        } else if (f12 > 1.0f) {
            this.t0 = bVar.a.length - 1;
        } else {
            int b10 = bVar.b(f12, this.G, this.H);
            this.t0 = b10;
            int i12 = b10 + 1;
            float[] fArr = this.i0.b;
            if (i12 < fArr.length) {
                if (Math.abs(this.i0.b[this.t0 + 1] - f12) < Math.abs(fArr[b10] - f12)) {
                    this.t0++;
                }
            }
        }
        int i13 = this.t0;
        int i14 = this.H;
        if (i13 > i14) {
            this.t0 = i14;
        }
        int i15 = this.t0;
        int i16 = this.G;
        if (i15 < i16) {
            this.t0 = i16;
        }
        if (i11 != this.t0) {
            this.v0 = true;
            c(true);
            x(f11);
            e eVar = this.R0;
            if (eVar != null) {
                getSelectedDate();
                m41 m41Var = (m41) ((qi0) eVar).b;
                m41Var.f();
                m41Var.b.u0.d(false, false);
            }
            B();
            invalidate();
        }
    }

    public boolean D(mg.b bVar) {
        boolean z10;
        mg.b bVar2 = this.i0;
        j jVar = this.h0;
        ArrayList arrayList = this.d;
        if (bVar2 != bVar) {
            invalidate();
            arrayList.clear();
            if (bVar != null && bVar.d != null) {
                for (int i7 = 0; i7 < bVar.d.size(); i7++) {
                    arrayList.add(h((mg.a) bVar.d.get(i7)));
                }
            }
            d();
            this.i0 = bVar;
            if (bVar != null) {
                if (bVar.a[0] == 0) {
                    jVar.k = 0.0f;
                    jVar.l = 1.0f;
                } else {
                    float minDistance = getMinDistance();
                    jVar.m = minDistance;
                    float f10 = jVar.l;
                    if (f10 - jVar.k < minDistance) {
                        float f11 = f10 - minDistance;
                        jVar.k = f11;
                        if (f11 < 0.0f) {
                            jVar.k = 0.0f;
                            jVar.l = 1.0f;
                        }
                    }
                }
            }
            z10 = true;
        } else {
            z10 = false;
        }
        w();
        if (bVar != null) {
            H();
            E(r(this.G, this.H), this.Q0 ? s(this.G, this.H) : 0L, false, false, false);
            this.k0 = 0.0f;
            this.l0 = 2.1474836E9f;
            u();
            int i10 = bVar.j;
            if (i10 == 1 || i10 == 2) {
                this.u0.setSize(arrayList.size() * 2);
            } else {
                this.u0.setSize(arrayList.size());
            }
            this.I = true;
            I();
            return z10;
        }
        jVar.k = 0.7f;
        jVar.l = 1.0f;
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
        return z10;
    }

    public final void E(long j3, long j10, boolean z10, boolean z11, boolean z12) {
        if ((Math.abs((((long) Math.ceil(((j3 <= 100 || ((float) (j3 / 5)) % 10.0f == 0.0f) ? j3 : ((j3 / 10) + 1) * 10) / 5.0f)) * 5) - this.y) < this.F || j3 == 0) && j3 == this.E) {
            return;
        }
        ng.d f10 = f(j3, this.i0.i, j10);
        long[] jArr = f10.a;
        long j11 = jArr[jArr.length - 1];
        long j12 = jArr[0];
        if (!z12) {
            float f11 = this.w - this.x;
            float f12 = j11 - j12;
            float f13 = f11 / f12;
            if (f13 > 1.0f) {
                f13 = f12 / f11;
            }
            double d = f13;
            float f14 = d > 0.7d ? 0.1f : d < 0.1d ? 0.03f : 0.045f;
            boolean z13 = ((float) j11) != this.y;
            if (this.Q0 && j12 != this.E) {
                z13 = true;
            }
            if (z13) {
                AnimatorSet animatorSet = this.b0;
                if (animatorSet != null) {
                    animatorSet.removeAllListeners();
                    this.b0.cancel();
                }
                this.U0 = this.w;
                this.V0 = this.x;
                this.S0 = 0.0f;
                this.T0 = 0.0f;
                this.W0 = f14;
            }
        }
        float f15 = j11;
        this.y = f15;
        float f16 = j12;
        this.E = f16;
        v();
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.c1 >= 320 || z11) {
            this.c1 = currentTimeMillis;
            ValueAnimator valueAnimator = this.c0;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.c0.cancel();
            }
            ArrayList arrayList = this.b;
            if (!z10) {
                this.w = f15;
                this.x = f16;
                arrayList.clear();
                arrayList.add(f10);
                f10.f = ks.e4;
                return;
            }
            arrayList.add(f10);
            if (z12) {
                AnimatorSet animatorSet2 = this.b0;
                if (animatorSet2 != null) {
                    animatorSet2.removeAllListeners();
                    this.b0.cancel();
                }
                this.W0 = 0.0f;
                AnimatorSet animatorSet3 = new AnimatorSet();
                animatorSet3.playTogether(e(this.w, f15, this.M0));
                if (this.Q0) {
                    animatorSet3.playTogether(e(this.x, f16, this.N0));
                }
                this.b0 = animatorSet3;
                animatorSet3.start();
            }
            int size = arrayList.size();
            for (int i7 = 0; i7 < size; i7++) {
                ng.d dVar = (ng.d) arrayList.get(i7);
                if (dVar != f10) {
                    dVar.g = dVar.f;
                }
            }
            ValueAnimator e10 = e(0.0f, 255.0f, new w(5, this, f10));
            this.c0 = e10;
            e10.addListener(new ah.l(8, this, f10));
            this.c0.start();
        }
    }

    public final void F() {
        float f10 = this.W0;
        if (f10 == 0.0f) {
            return;
        }
        float f11 = this.w;
        float f12 = this.y;
        if (f11 != f12) {
            float f13 = this.S0 + f10;
            this.S0 = f13;
            if (f13 > 1.0f) {
                this.S0 = 1.0f;
                this.w = f12;
            } else {
                float f14 = this.U0;
                this.w = (nr.g.getInterpolation(f13) * (f12 - f14)) + f14;
            }
            invalidate();
        }
        if (this.Q0) {
            float f15 = this.x;
            float f16 = this.E;
            if (f15 != f16) {
                float f17 = this.T0 + this.W0;
                this.T0 = f17;
                if (f17 > 1.0f) {
                    this.T0 = 1.0f;
                    this.x = f16;
                } else {
                    float f18 = this.V0;
                    this.x = (nr.g.getInterpolation(f17) * (f16 - f18)) + f18;
                }
                invalidate();
            }
        }
    }

    public final void G() {
        int i7 = this.y0 ? m6.Qj : m6.Pj;
        h6 h6Var = this.X0;
        int w02 = m6.w0(i7, h6Var);
        this.O.setColor(w02);
        this.P.setColor(m6.w0(this.y0 ? m6.Qj : m6.Pj, h6Var));
        int w03 = m6.w0(m6.Pj, h6Var);
        this.Q.setColor(w03);
        int w04 = m6.w0(m6.Rj, h6Var);
        Paint paint = this.M;
        paint.setColor(w04);
        int w05 = m6.w0(m6.Sj, h6Var);
        Paint paint2 = this.N;
        paint2.setColor(w05);
        this.R.setColor(m6.w0(m6.Uj, h6Var));
        this.S.setColor(m6.w0(m6.Tj, h6Var));
        this.T.setColor(m6.w0(m6.d6, h6Var));
        this.U.setColor(m6.w0(m6.Vj, h6Var));
        this.u0.b();
        this.n = paint.getAlpha();
        this.r = paint2.getAlpha();
        this.f = r2.getAlpha() / 255.0f;
        this.h = r3.getAlpha() / 255.0f;
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((ng.f) obj).a();
        }
        if (this.v0) {
            int i11 = this.t0;
            mg.b bVar = this.i0;
            long[] jArr = bVar.a;
            if (i11 < jArr.length) {
                this.u0.c(i11, jArr[i11], arrayList, false, bVar.j, bVar.h);
            }
        }
        this.I = true;
    }

    public final void H() {
        mg.b bVar = this.i0;
        if (bVar == null) {
            return;
        }
        j jVar = this.h0;
        int c10 = bVar.c(Math.max(jVar.k, 0.0f));
        this.G = c10;
        int a10 = this.i0.a(Math.min(jVar.l, 1.0f), c10);
        this.H = a10;
        int i7 = this.G;
        if (a10 < i7) {
            this.H = i7;
        }
        ng.c cVar = this.k1;
        if (cVar != null) {
            long[] jArr = this.i0.a;
            cVar.b(jArr[i7], jArr[this.H]);
        }
        I();
    }

    public final void I() {
        mg.b bVar = this.i0;
        if (bVar != null) {
            float f10 = this.G0;
            if (f10 == 0.0f) {
                return;
            }
            int i7 = (int) ((f10 / (this.H0 * bVar.g)) / 6.0f);
            ng.b bVar2 = this.j0;
            if (bVar2 == null || i7 >= bVar2.b || i7 <= bVar2.c) {
                int highestOneBit = Integer.highestOneBit(i7) << 1;
                ng.b bVar3 = this.j0;
                if (bVar3 == null || bVar3.a != highestOneBit) {
                    ValueAnimator valueAnimator = this.d0;
                    if (valueAnimator != null) {
                        valueAnimator.removeAllListeners();
                        this.d0.cancel();
                    }
                    double d = highestOneBit;
                    double d2 = 0.2d * d;
                    ng.b bVar4 = new ng.b(highestOneBit, (int) (d + d2), (int) (d - d2));
                    bVar4.d = ks.e4;
                    ng.b bVar5 = this.j0;
                    ArrayList arrayList = this.c;
                    if (bVar5 == null) {
                        this.j0 = bVar4;
                        bVar4.d = ks.e4;
                        arrayList.add(bVar4);
                        return;
                    }
                    this.j0 = bVar4;
                    this.n0 = arrayList.size();
                    for (int i10 = 0; i10 < this.n0; i10++) {
                        ng.b bVar6 = (ng.b) arrayList.get(i10);
                        bVar6.e = bVar6.d;
                    }
                    arrayList.add(bVar4);
                    if (arrayList.size() > 2) {
                        arrayList.remove(0);
                    }
                    ValueAnimator duration = e(0.0f, 1.0f, new w(6, this, bVar4)).setDuration(200L);
                    this.d0 = duration;
                    duration.addListener(new ah.l(9, this, bVar4));
                    this.d0.start();
                }
            }
        }
    }

    public void J(mg.b bVar, long j3) {
        int length = bVar.a.length;
        long j10 = j3 - (j3 % 86400000);
        long j11 = 86399999 + j10;
        int i7 = 0;
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            long j12 = bVar.a[i11];
            if (j10 > j12) {
                i7 = i11;
            }
            if (j11 > j12) {
                i10 = i11;
            }
        }
        float[] fArr = bVar.b;
        float f10 = fArr[i7];
        j jVar = this.h0;
        jVar.k = f10;
        jVar.l = fArr[i10];
    }

    public void K() {
        if (C1) {
            ArrayList arrayList = this.d;
            int size = arrayList.size();
            long j3 = Long.MAX_VALUE;
            int i7 = 0;
            long j10 = 0;
            while (i7 < size) {
                Object obj = arrayList.get(i7);
                i7++;
                ng.f fVar = (ng.f) obj;
                boolean z10 = fVar.n;
                mg.a aVar = fVar.a;
                if (z10) {
                    long j11 = aVar.e;
                    if (j11 > j10) {
                        j10 = j11;
                    }
                }
                if (z10) {
                    long j12 = aVar.f;
                    if (j12 < j3) {
                        j3 = j12;
                    }
                }
            }
            if ((j3 == 2147483647L || j3 == 0.0f) && (j10 <= 0 || j10 == this.m0)) {
                return;
            }
            this.m0 = j10;
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

    @Override // lg.i
    public void a(float f10, float f11, boolean z10) {
        mg.b bVar = this.i0;
        if (bVar == null) {
            return;
        }
        if (!z10) {
            H();
            invalidate();
        } else {
            int c10 = bVar.c(Math.max(f10, 0.0f));
            int a10 = this.i0.a(Math.min(f11, 1.0f), c10);
            E(r(c10, a10), s(c10, a10), true, true, false);
            c(false);
        }
    }

    public final void c(boolean z10) {
        x((this.H0 * this.h0.k) - l1);
        if (this.j1 == z10) {
            return;
        }
        this.j1 = z10;
        ValueAnimator valueAnimator = this.f0;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.f0.cancel();
        }
        ValueAnimator duration = e(this.w0, z10 ? 1.0f : 0.0f, this.O0).setDuration(200L);
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

    public ng.d f(long j3, int i7, long j10) {
        return new ng.d(j3, j10, this.Q0, this.i0.h, i7, this.O, this.P);
    }

    public ng.e g() {
        return new ng.e(getContext(), this.X0);
    }

    public long getEndDate() {
        return this.i0.a[this.H];
    }

    public float getMinDistance() {
        mg.b bVar = this.i0;
        if (bVar == null) {
            return 0.1f;
        }
        int length = bVar.a.length;
        if (length < 5) {
            return 1.0f;
        }
        float f10 = 5.0f / length;
        if (f10 < 0.1f) {
            return 0.1f;
        }
        return f10;
    }

    public long getSelectedDate() {
        int i7 = this.t0;
        if (i7 < 0) {
            return -1L;
        }
        return this.i0.a[i7];
    }

    public long getStartDate() {
        return this.i0.a[this.G];
    }

    public abstract ng.f h(mg.a aVar);

    public void i(Canvas canvas) {
        if (this.i0 == null) {
            return;
        }
        int i7 = this.z0;
        float f10 = 1.0f;
        if (i7 == 2) {
            f10 = 1.0f - this.A0.f;
        } else if (i7 == 1) {
            f10 = this.A0.f;
        } else if (i7 == 3) {
            f10 = this.A0.f;
        }
        Paint paint = this.M;
        paint.setAlpha((int) (this.n * f10));
        int i10 = (int) (this.f * 255.0f * f10);
        TextPaint textPaint = this.O;
        textPaint.setAlpha(i10);
        this.P.setAlpha((int) (this.f * 255.0f * f10));
        int textSize = (int) (o1 - textPaint.getTextSize());
        float measuredHeight = (getMeasuredHeight() - this.s) - 1;
        canvas.drawLine(this.E0, measuredHeight, this.F0, measuredHeight, paint);
        if (this.Q0) {
            return;
        }
        canvas.drawText("0", l1, r1 - textSize, textPaint);
    }

    public void j(Canvas canvas) {
        char c10;
        int i7;
        int i10;
        if (this.i0 == null) {
            return;
        }
        ArrayList arrayList = this.c;
        this.n0 = arrayList.size();
        int i11 = this.z0;
        float f10 = 1.0f;
        int i12 = 1;
        float f11 = i11 == 2 ? 1.0f - this.A0.f : i11 == 1 ? this.A0.f : i11 == 3 ? this.A0.f : 1.0f;
        char c11 = 0;
        this.o0 = 0;
        while (true) {
            int i13 = this.o0;
            if (i13 >= this.n0) {
                return;
            }
            int i14 = ((ng.b) arrayList.get(i13)).d;
            int i15 = ((ng.b) arrayList.get(this.o0)).a;
            if (i15 == 0) {
                i15 = i12;
            }
            int i16 = this.G - this.p0;
            while (i16 % i15 != 0) {
                i16--;
            }
            int i17 = this.H - this.p0;
            while (true) {
                if (i17 % i15 == 0 && i17 >= this.i0.a.length - i12) {
                    break;
                }
                i17++;
                i12 = i12;
                i14 = i14;
                c11 = c11;
                f10 = 1.0f;
            }
            int i18 = this.p0;
            int i19 = i16 + i18;
            int i20 = i17 + i18;
            float f12 = this.H0 * this.h0.k;
            float f13 = l1;
            float f14 = f12 - f13;
            while (i19 < i20) {
                if (i19 >= 0) {
                    long[] jArr = this.i0.a;
                    if (i19 < jArr.length - i12) {
                        long j3 = jArr[i19];
                        long j10 = jArr[c11];
                        long j11 = jArr[jArr.length - i12];
                        i7 = i12;
                        i10 = i14;
                        float f15 = (((j3 - j10) / (j11 - j10)) * this.H0) - f14;
                        float f16 = f15 - u1;
                        if (f16 > 0.0f) {
                            float f17 = this.G0;
                            if (f16 <= f17 + f13) {
                                float f18 = q1;
                                c10 = c11;
                                TextPaint textPaint = this.Q;
                                if (f16 < f18) {
                                    textPaint.setAlpha((int) (i10 * f3.y(f18, f16, f18, f10) * this.h * f11));
                                } else if (f16 > f17) {
                                    textPaint.setAlpha((int) (i10 * f3.y(f16, f17, f13, f10) * this.h * f11));
                                } else {
                                    textPaint.setAlpha((int) (i10 * this.h * f11));
                                }
                                mg.b bVar = this.i0;
                                String[] strArr = bVar.c;
                                long[] jArr2 = bVar.a;
                                canvas.drawText(strArr[(int) ((jArr2[i19] - jArr2[c10]) / bVar.k)], f15, g0.L(3.0f) + (getMeasuredHeight() - this.s) + p1, textPaint);
                                i19 += i15;
                                i12 = i7;
                                i14 = i10;
                                c11 = c10;
                                f10 = 1.0f;
                            }
                        }
                        c10 = c11;
                        i19 += i15;
                        i12 = i7;
                        i14 = i10;
                        c11 = c10;
                        f10 = 1.0f;
                    }
                }
                c10 = c11;
                i7 = i12;
                i10 = i14;
                i19 += i15;
                i12 = i7;
                i14 = i10;
                c11 = c10;
                f10 = 1.0f;
            }
            this.o0 += i12;
            c11 = c11;
            f10 = 1.0f;
        }
    }

    public abstract void k(Canvas canvas);

    /* JADX WARN: Removed duplicated region for block: B:11:0x007d A[LOOP:0: B:10:0x007b->B:11:0x007d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void l(Canvas canvas, ng.d dVar) {
        float f10;
        int i7;
        int i10;
        int length = dVar.a.length;
        float f11 = 1.0f;
        if (length > 2) {
            float f12 = (r0[1] - r0[0]) / (this.w - this.x);
            if (f12 < 0.1d) {
                f10 = f12 / 0.1f;
                i7 = this.z0;
                if (i7 != 2) {
                    f11 = 1.0f - this.A0.f;
                } else if (i7 == 1) {
                    f11 = this.A0.f;
                } else if (i7 == 3) {
                    f11 = this.A0.f;
                }
                Paint paint = this.M;
                paint.setAlpha((int) ((this.n / 255.0f) * dVar.f * f11 * f10));
                this.O.setAlpha((int) e2.D(dVar.f, this.f, f11, f10));
                this.P.setAlpha((int) e2.D(dVar.f, this.f, f11, f10));
                int measuredHeight = (getMeasuredHeight() - this.s) - o1;
                for (i10 = !this.Q0 ? 1 : 0; i10 < length; i10++) {
                    float measuredHeight2 = getMeasuredHeight() - this.s;
                    float f13 = dVar.a[i10];
                    float f14 = this.x;
                    canvas.drawRect(this.E0, (int) (measuredHeight2 - (((f13 - f14) / (this.w - f14)) * measuredHeight)), this.F0, r4 + 1, paint);
                }
            }
        }
        f10 = 1.0f;
        i7 = this.z0;
        if (i7 != 2) {
        }
        Paint paint2 = this.M;
        paint2.setAlpha((int) ((this.n / 255.0f) * dVar.f * f11 * f10));
        this.O.setAlpha((int) e2.D(dVar.f, this.f, f11, f10));
        this.P.setAlpha((int) e2.D(dVar.f, this.f, f11, f10));
        int measuredHeight3 = (getMeasuredHeight() - this.s) - o1;
        while (i10 < length) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0098, code lost:
    
        r2 = r16;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m(Canvas canvas) {
        int i7;
        float f10;
        int i10;
        int i11;
        mg.b bVar;
        int i12;
        int i13;
        int i14;
        char c10;
        Paint paint;
        Canvas canvas2;
        float f11;
        int i15;
        h hVar;
        h hVar2;
        int i16;
        float f12;
        int i17;
        Paint paint2;
        ValueAnimator valueAnimator;
        if (this.i0 == null) {
            return;
        }
        float f13 = this.D0;
        j jVar = this.h0;
        jVar.b = f13;
        int measuredHeight = getMeasuredHeight();
        int i18 = r1;
        int i19 = measuredHeight - i18;
        int measuredHeight2 = getMeasuredHeight();
        int i20 = this.C0;
        int i21 = (measuredHeight2 - i20) - i18;
        float f14 = this.D0;
        float f15 = jVar.k * f14;
        float f16 = l1;
        int i22 = (int) (f15 + f16);
        int i23 = (int) ((jVar.l * f14) + f16);
        int i24 = this.z0;
        if (i24 == 1) {
            ng.j jVar2 = this.A0;
            int i25 = (int) ((jVar2.a * f14) + f16);
            i7 = 1;
            int i26 = (int) ((f14 * jVar2.b) + f16);
            float f17 = 1.0f - jVar2.f;
            i22 = (int) (((i25 - i22) * f17) + i22);
            i23 = (int) ((f17 * (i26 - i23)) + i23);
        } else {
            i7 = 1;
            if (i24 == 3) {
                f10 = this.A0.f;
                i10 = i22;
                i11 = i23;
                bVar = this.i0;
                int i27 = v1;
                Paint paint3 = this.S;
                Paint paint4 = this.L;
                if (bVar == null) {
                    if (i24 == 0) {
                        int i28 = 0;
                        while (true) {
                            ArrayList arrayList = this.d;
                            f12 = f10;
                            if (i28 >= arrayList.size()) {
                                break;
                            }
                            ng.f fVar = (ng.f) arrayList.get(i28);
                            ValueAnimator valueAnimator2 = fVar.h;
                            if ((valueAnimator2 == null || !valueAnimator2.isRunning()) && ((valueAnimator = fVar.i) == null || !valueAnimator.isRunning())) {
                                i28++;
                                f10 = f12;
                            }
                        }
                    } else {
                        f12 = f10;
                    }
                    int i29 = 0;
                    if (i29 != 0) {
                        canvas.save();
                        i17 = i29;
                        canvas.clipRect(f16, (getMeasuredHeight() - i18) - i20, getMeasuredWidth() - f16, getMeasuredHeight() - i18);
                        canvas.translate(f16, (getMeasuredHeight() - i18) - i20);
                        n(canvas);
                        canvas.restore();
                    } else {
                        i17 = i29;
                        if (this.I) {
                            this.q0.eraseColor(0);
                            n(this.r0);
                            this.I = false;
                            if (i17 != 0) {
                                int i30 = this.z0;
                                if (i30 == 2) {
                                    float f18 = this.D0;
                                    ng.j jVar3 = this.A0;
                                    float f19 = (jVar3.c * f18) + f16;
                                    paint4.setAlpha((int) ((1.0f - jVar3.f) * 255.0f));
                                    canvas.save();
                                    paint2 = paint3;
                                    i12 = i18;
                                    canvas.clipRect(f16, i21, getMeasuredWidth() - f16, i19);
                                    canvas.scale((this.A0.f * 2.0f) + 1.0f, 1.0f, f19, ((i19 - i21) + i21) >> 1);
                                    canvas.drawBitmap(this.q0, f16, (getMeasuredHeight() - i12) - i20, paint4);
                                    canvas.restore();
                                } else {
                                    paint2 = paint3;
                                    i12 = i18;
                                    int i31 = i7;
                                    if (i30 == i31) {
                                        float f20 = ((i19 - i21) + i21) >> i31;
                                        float f21 = this.D0;
                                        ng.j jVar4 = this.A0;
                                        float f22 = jVar4.c;
                                        float f23 = f21 * f22;
                                        float f24 = f23 + f16;
                                        if (f22 <= 0.5f) {
                                            f23 = (1.0f - f22) * f21;
                                        }
                                        float f25 = f23 * jVar4.f;
                                        canvas.save();
                                        i13 = i27;
                                        canvas.clipRect(f24 - f25, i21, f25 + f24, i19);
                                        paint4.setAlpha((int) (this.A0.f * 255.0f));
                                        canvas.scale(this.A0.f, 1.0f, f24, f20);
                                        canvas.drawBitmap(this.q0, f16, (getMeasuredHeight() - i12) - i20, paint4);
                                        canvas.restore();
                                    } else {
                                        i13 = i27;
                                        paint4.setAlpha((int) (f12 * 255.0f));
                                        canvas.drawBitmap(this.q0, f16, (getMeasuredHeight() - i12) - i20, paint4);
                                    }
                                    if (this.z0 == 2) {
                                        return;
                                    }
                                    float f26 = i21;
                                    float f27 = i19;
                                    float f28 = l1;
                                    paint = paint4;
                                    i14 = 2;
                                    Paint paint5 = paint2;
                                    c10 = 0;
                                    canvas.drawRect(f28, f26, i10 + i13, f27, paint5);
                                    canvas2 = canvas;
                                    canvas2.drawRect(i11 - i13, f26, getMeasuredWidth() - f28, f27, paint5);
                                    f11 = f16;
                                }
                            } else {
                                paint2 = paint3;
                                i12 = i18;
                            }
                            i13 = i27;
                            if (this.z0 == 2) {
                            }
                        }
                    }
                    if (i17 != 0) {
                    }
                    i13 = i27;
                    if (this.z0 == 2) {
                    }
                } else {
                    i12 = i18;
                    i13 = i27;
                    i14 = 2;
                    c10 = 0;
                    paint = paint4;
                    canvas2 = canvas;
                    f11 = f16;
                    canvas2.drawRect(f11, i21, getMeasuredWidth() - f16, i19, paint3);
                }
                canvas2.drawBitmap(this.a.d(i20, (int) (getMeasuredWidth() - (f11 * 2.0f))), f11, (getMeasuredHeight() - i12) - i20, paint);
                if (this.i0 == null) {
                    Rect rect = this.W;
                    rect.set(i10, i21, i11, i19);
                    jVar.j.set(rect);
                    int i32 = rect.left;
                    int i33 = rect.top;
                    float f29 = rect.bottom + A1;
                    float f30 = w1;
                    Path path = this.a0;
                    b(path, i32, i33 - r12, i32 + i13, f29, f30, f30, true, false, false, true);
                    Paint paint6 = this.R;
                    canvas2.drawPath(path, paint6);
                    b(path, r3 - i13, rect.top - r12, rect.right, rect.bottom + r12, f30, f30, false, true, true, false);
                    canvas2.drawPath(path, paint6);
                    canvas2.drawRect(rect.left + i13, rect.bottom, rect.right - i13, r3 + r12, paint6);
                    canvas.drawRect(rect.left + i13, r1 - r12, rect.right - i13, rect.top, paint6);
                    int i34 = rect.left;
                    int i35 = x1;
                    float centerY = rect.centerY() - i35;
                    float f31 = rect.left + i35;
                    float centerY2 = rect.centerY() + i35;
                    Paint paint7 = this.V;
                    canvas.drawLine(i34 + i35, centerY, f31, centerY2, paint7);
                    canvas.drawLine(rect.right - i35, rect.centerY() - i35, rect.right - i35, rect.centerY() + i35, paint7);
                    h[] hVarArr = jVar.n;
                    h hVar3 = hVarArr[c10];
                    if (hVar3 == null || hVar3.a != 4) {
                        i15 = 1;
                        hVar = hVarArr[1];
                        if (hVar == null || hVar.a != 4) {
                            hVar = null;
                        }
                    } else {
                        hVar = hVar3;
                        i15 = 1;
                    }
                    int i36 = rect.bottom;
                    int i37 = rect.top;
                    int i38 = (i36 - i37) >> i15;
                    int i39 = i37 + i38;
                    if (hVar == null) {
                        if (hVar3 == null || hVar3.a != i15) {
                            hVar2 = hVarArr[i15];
                            if (hVar2 == null || hVar2.a != i15) {
                                hVar2 = null;
                            }
                        } else {
                            hVar2 = hVar3;
                        }
                        if ((hVar3 == null || hVar3.a != i14) && ((hVar3 = hVarArr[i15]) == null || hVar3.a != i14)) {
                            hVar3 = null;
                        }
                        Paint paint8 = this.U;
                        int i40 = z1;
                        int i41 = y1;
                        if (hVar2 != null) {
                            i16 = i41;
                            canvas.drawCircle(rect.left + i41, i39, (i38 * hVar2.f) - i40, paint8);
                        } else {
                            i16 = i41;
                        }
                        if (hVar3 != null) {
                            canvas.drawCircle(rect.right - i16, i39, (i38 * hVar3.f) - i40, paint8);
                        }
                    }
                    Rect rect2 = jVar.h;
                    int i42 = s1;
                    int i43 = i42 >> 1;
                    rect2.set(i10 - i42, i21, i10 + i43, i19);
                    jVar.i.set(i11 - i43, i21, i11 + i42, i19);
                    return;
                }
                return;
            }
        }
        i10 = i22;
        i11 = i23;
        f10 = 1.0f;
        bVar = this.i0;
        int i272 = v1;
        Paint paint32 = this.S;
        Paint paint42 = this.L;
        if (bVar == null) {
        }
        canvas2.drawBitmap(this.a.d(i20, (int) (getMeasuredWidth() - (f11 * 2.0f))), f11, (getMeasuredHeight() - i12) - i20, paint);
        if (this.i0 == null) {
        }
    }

    public abstract void n(Canvas canvas);

    public void o(Canvas canvas) {
        mg.b bVar;
        int i7 = this.t0;
        if (i7 < 0 || !this.v0 || (bVar = this.i0) == null) {
            return;
        }
        int i10 = (int) (this.r * this.w0);
        float f10 = this.G0;
        j jVar = this.h0;
        float f11 = jVar.l;
        float f12 = jVar.k;
        float f13 = f10 / (f11 - f12);
        float f14 = (f12 * f13) - l1;
        float[] fArr = bVar.b;
        if (i7 >= fArr.length) {
            return;
        }
        float f15 = (fArr[i7] * f13) - f14;
        Paint paint = this.N;
        paint.setAlpha(i10);
        canvas.drawLine(f15, 0.0f, f15, this.I0.bottom, paint);
        if (!this.e) {
            return;
        }
        ArrayList arrayList = this.d;
        this.n0 = arrayList.size();
        int i11 = 0;
        while (true) {
            this.o0 = i11;
            int i12 = this.o0;
            if (i12 >= this.n0) {
                return;
            }
            ng.f fVar = (ng.f) arrayList.get(i12);
            boolean z10 = fVar.n;
            Paint paint2 = fVar.d;
            if (z10 || fVar.o != 0.0f) {
                float f16 = fVar.a.a[this.t0];
                float f17 = this.x;
                float measuredHeight = (getMeasuredHeight() - this.s) - (((f16 - f17) / (this.w - f17)) * ((getMeasuredHeight() - this.s) - o1));
                paint2.setAlpha((int) (fVar.o * 255.0f * this.w0));
                int i13 = (int) (fVar.o * 255.0f * this.w0);
                Paint paint3 = this.T;
                paint3.setAlpha(i13);
                canvas.drawPoint(f15, measuredHeight, paint2);
                canvas.drawPoint(f15, measuredHeight, paint3);
            }
            i11 = this.o0 + 1;
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
        int i7 = 0;
        this.o0 = 0;
        while (true) {
            int i10 = this.o0;
            if (i10 >= this.n0) {
                break;
            }
            l(canvas, (ng.d) arrayList.get(i10));
            this.o0++;
        }
        k(canvas);
        while (true) {
            this.o0 = i7;
            int i11 = this.o0;
            if (i11 >= this.n0) {
                canvas.restoreToCount(save);
                j(canvas);
                m(canvas);
                o(canvas);
                super.onDraw(canvas);
                return;
            }
            p(canvas, (ng.d) arrayList.get(i11));
            i7 = this.o0 + 1;
        }
    }

    @Override // android.view.View
    public void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        if (this.J) {
            setMeasuredDimension(View.MeasureSpec.getSize(i7), g0.q.y - g0.L(56.0f));
        } else {
            setMeasuredDimension(View.MeasureSpec.getSize(i7), View.MeasureSpec.getSize(i7));
        }
        int measuredWidth = getMeasuredWidth();
        int i11 = this.Y0;
        int i12 = this.C0;
        if (measuredWidth != i11 || getMeasuredHeight() != this.Z0) {
            this.Y0 = getMeasuredWidth();
            this.Z0 = getMeasuredHeight();
            float measuredWidth2 = getMeasuredWidth();
            float f10 = l1;
            float f11 = 2.0f * f10;
            this.q0 = Bitmap.createBitmap((int) (measuredWidth2 - f11), i12, Bitmap.Config.ARGB_4444);
            this.r0 = new Canvas(this.q0);
            this.a.d(i12, (int) (getMeasuredWidth() - f11));
            w();
            if (this.v0) {
                x((this.H0 * this.h0.k) - f10);
            }
            A(false, true, false);
        }
        if (Build.VERSION.SDK_INT >= 29) {
            int measuredHeight = getMeasuredHeight();
            int i13 = r1;
            this.a1.set(0, measuredHeight - ((i12 + i13) + i13), getMeasuredWidth(), getMeasuredHeight());
            setSystemGestureExclusionRects(this.b1);
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ValueAnimator valueAnimator;
        ValueAnimator valueAnimator2;
        if (this.i0 != null) {
            boolean z10 = this.K;
            j jVar = this.h0;
            if (!z10) {
                jVar.c(motionEvent.getActionIndex(), motionEvent);
                getParent().requestDisallowInterceptTouchEvent(false);
                this.s0 = false;
                return false;
            }
            int x10 = (int) motionEvent.getX(motionEvent.getActionIndex());
            int y10 = (int) motionEvent.getY(motionEvent.getActionIndex());
            int actionMasked = motionEvent.getActionMasked();
            RectF rectF = this.I0;
            if (actionMasked == 0) {
                this.h1 = System.currentTimeMillis();
                getParent().requestDisallowInterceptTouchEvent(true);
                if (!jVar.a(x10, y10, motionEvent.getActionIndex())) {
                    this.d1 = x10;
                    this.f1 = x10;
                    this.e1 = y10;
                    this.g1 = y10;
                    if (rectF.contains(x10, y10)) {
                        if (this.t0 < 0 || !this.j1) {
                            this.s0 = true;
                            C(x10, y10);
                            return true;
                        }
                    }
                }
                return true;
            }
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    int i7 = x10 - this.d1;
                    int i10 = y10 - this.e1;
                    if (jVar.n[0] != null || jVar.c) {
                        boolean b10 = jVar.b(x10, motionEvent.getActionIndex());
                        if (motionEvent.getPointerCount() > 1) {
                            int x11 = (int) motionEvent.getX(1);
                            motionEvent.getY(1);
                            jVar.b(x11, 1);
                        }
                        getParent().requestDisallowInterceptTouchEvent(b10);
                        return true;
                    }
                    boolean z11 = this.s0;
                    int i11 = this.B0;
                    if (z11) {
                        boolean z12 = (this.i1 && System.currentTimeMillis() - this.h1 > 200) || Math.abs(i7) > Math.abs(i10) || Math.abs(i10) < i11;
                        this.d1 = x10;
                        this.e1 = y10;
                        getParent().requestDisallowInterceptTouchEvent(z12);
                        C(x10, y10);
                        return true;
                    }
                    if (rectF.contains(this.f1, this.g1)) {
                        int i12 = this.f1 - x10;
                        int i13 = this.g1 - y10;
                        if (Math.sqrt((i13 * i13) + (i12 * i12)) > i11 || System.currentTimeMillis() - this.h1 > 200) {
                            this.s0 = true;
                            C(x10, y10);
                            return true;
                        }
                    }
                    return true;
                }
                if (actionMasked != 3) {
                    if (actionMasked == 5) {
                        return jVar.a(x10, y10, motionEvent.getActionIndex());
                    }
                    if (actionMasked == 6) {
                        jVar.c(motionEvent.getActionIndex(), motionEvent);
                        return true;
                    }
                }
            }
            if (!jVar.c(motionEvent.getActionIndex(), motionEvent)) {
                if (rectF.contains(this.f1, this.g1) && !this.s0) {
                    c(false);
                }
                h[] hVarArr = jVar.n;
                h hVar = hVarArr[0];
                if (hVar != null && (valueAnimator2 = hVar.e) != null) {
                    valueAnimator2.cancel();
                }
                h hVar2 = hVarArr[1];
                if (hVar2 != null && (valueAnimator = hVar2.e) != null) {
                    valueAnimator.cancel();
                }
                hVarArr[0] = null;
                hVarArr[1] = null;
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
    public void p(Canvas canvas, ng.d dVar) {
        float f10;
        int i7;
        int i10;
        TextPaint textPaint;
        ng.d dVar2;
        int length = dVar.a.length;
        float f11 = 1.0f;
        if (length > 2) {
            float f12 = (r0[1] - r0[0]) / (this.w - this.x);
            if (f12 < 0.1d) {
                f10 = f12 / 0.1f;
                i7 = this.z0;
                if (i7 != 2) {
                    f11 = 1.0f - this.A0.f;
                } else if (i7 == 1) {
                    f11 = this.A0.f;
                } else if (i7 == 3) {
                    f11 = this.A0.f;
                }
                this.M.setAlpha((int) ((this.n / 255.0f) * dVar.f * f11 * f10));
                int D = (int) e2.D(dVar.f, this.f, f11, f10);
                TextPaint textPaint2 = this.O;
                textPaint2.setAlpha(D);
                int D2 = (int) e2.D(dVar.f, this.f, f11, f10);
                TextPaint textPaint3 = this.P;
                textPaint3.setAlpha(D2);
                int measuredHeight = getMeasuredHeight() - this.s;
                int i11 = o1;
                int i12 = measuredHeight - i11;
                int textSize = (int) (i11 - textPaint2.getTextSize());
                i10 = 1 ^ (this.Q0 ? 1 : 0);
                while (i10 < length) {
                    float measuredHeight2 = getMeasuredHeight() - this.s;
                    float f13 = dVar.a[i10];
                    float f14 = this.x;
                    float f15 = ((int) (measuredHeight2 - (((f13 - f14) / (this.w - f14)) * i12))) - textSize;
                    float f16 = l1;
                    ng.d dVar3 = dVar;
                    int i13 = i10;
                    Canvas canvas2 = canvas;
                    dVar3.a(canvas2, 0, i13, f16, f15, textPaint2);
                    if (dVar3.c != null) {
                        float measuredWidth = getMeasuredWidth() - f16;
                        textPaint = textPaint3;
                        dVar2 = dVar3;
                        dVar2.a(canvas2, 1, i13, measuredWidth, f15, textPaint);
                    } else {
                        textPaint = textPaint3;
                        dVar2 = dVar3;
                    }
                    i10 = i13 + 1;
                    dVar = dVar2;
                    canvas = canvas2;
                    textPaint3 = textPaint;
                }
            }
        }
        f10 = 1.0f;
        i7 = this.z0;
        if (i7 != 2) {
        }
        this.M.setAlpha((int) ((this.n / 255.0f) * dVar.f * f11 * f10));
        int D3 = (int) e2.D(dVar.f, this.f, f11, f10);
        TextPaint textPaint22 = this.O;
        textPaint22.setAlpha(D3);
        int D22 = (int) e2.D(dVar.f, this.f, f11, f10);
        TextPaint textPaint32 = this.P;
        textPaint32.setAlpha(D22);
        int measuredHeight3 = getMeasuredHeight() - this.s;
        int i112 = o1;
        int i122 = measuredHeight3 - i112;
        int textSize2 = (int) (i112 - textPaint22.getTextSize());
        i10 = 1 ^ (this.Q0 ? 1 : 0);
        while (i10 < length) {
        }
    }

    public long r(int i7, int i10) {
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        long j3 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            if (((ng.f) arrayList.get(i11)).n) {
                long U0 = ((ng.f) arrayList.get(i11)).a.b.U0(i7, i10);
                if (U0 > j3) {
                    j3 = U0;
                }
            }
        }
        return j3;
    }

    public long s(int i7, int i10) {
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        long j3 = Long.MAX_VALUE;
        for (int i11 = 0; i11 < size; i11++) {
            if (((ng.f) arrayList.get(i11)).n) {
                long Z0 = ((ng.f) arrayList.get(i11)).a.b.Z0(i7, i10);
                if (Z0 < j3) {
                    j3 = Z0;
                }
            }
        }
        return j3;
    }

    public void setDateSelectionListener(e eVar) {
        this.R0 = eVar;
    }

    public void setHeader(ng.c cVar) {
        this.k1 = cVar;
    }

    public void setLandscape(boolean z10) {
        this.J = z10;
    }

    public void t() {
        this.M.setStrokeWidth(1.0f);
        this.N.setStrokeWidth(m1);
        TextPaint textPaint = this.O;
        float f10 = n1;
        textPaint.setTextSize(f10);
        TextPaint textPaint2 = this.P;
        textPaint2.setTextSize(f10);
        textPaint2.setTextAlign(Paint.Align.RIGHT);
        TextPaint textPaint3 = this.Q;
        textPaint3.setTextSize(f10);
        textPaint3.setTextAlign(Paint.Align.CENTER);
        float N = g0.N(6.0f);
        Paint paint = this.T;
        paint.setStrokeWidth(N);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint.setStrokeCap(cap);
        setLayerType(2, null);
        setWillNotDraw(false);
        ng.e g10 = g();
        this.u0 = g10;
        g10.setVisibility(8);
        Paint paint2 = this.V;
        paint2.setColor(-1);
        paint2.setStrokeWidth(g0.N(3.0f));
        paint2.setStrokeCap(cap);
        G();
    }

    public void u() {
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            ng.f fVar = (ng.f) obj;
            boolean z10 = fVar.n;
            mg.a aVar = fVar.a;
            if (z10) {
                long j3 = aVar.e;
                if (j3 > this.k0) {
                    this.k0 = j3;
                }
            }
            if (z10) {
                long j10 = aVar.f;
                if (j10 < this.l0) {
                    this.l0 = j10;
                }
            }
            float f10 = this.k0;
            float f11 = this.l0;
            if (f10 == f11) {
                this.k0 = f10 + 1.0f;
                this.l0 = f11 - 1.0f;
            }
        }
    }

    public final void v() {
        int measuredHeight = getMeasuredHeight() - this.s;
        float f10 = this.y;
        if (f10 == 0.0f || measuredHeight == 0) {
            return;
        }
        this.F = (f10 / measuredHeight) * n1;
    }

    public final void w() {
        if (getMeasuredHeight() <= 0 || getMeasuredWidth() <= 0) {
            return;
        }
        float measuredWidth = getMeasuredWidth();
        float f10 = l1;
        this.D0 = measuredWidth - (2.0f * f10);
        this.E0 = f10;
        float measuredWidth2 = getMeasuredWidth() - (this.J ? t1 : f10);
        this.F0 = measuredWidth2;
        float f11 = measuredWidth2 - this.E0;
        this.G0 = f11;
        j jVar = this.h0;
        this.H0 = f11 / (jVar.l - jVar.k);
        I();
        this.s = g0.L(100.0f);
        this.I0.set(this.E0 - f10, 0.0f, this.F0 + f10, getMeasuredHeight() - this.s);
        if (this.i0 != null) {
            this.p0 = (int) (g0.L(20.0f) / (this.D0 / this.i0.a.length));
        }
        v();
    }

    public final void x(float f10) {
        int i7;
        mg.b bVar = this.i0;
        if (bVar == null || (i7 = this.t0) < 0) {
            return;
        }
        long[] jArr = bVar.a;
        if (i7 >= jArr.length || !this.v0) {
            return;
        }
        this.u0.c(i7, jArr[i7], this.d, false, bVar.j, bVar.h);
        this.u0.setVisibility(0);
        this.u0.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), TLObject.FLAG_31));
        float f11 = (this.i0.b[this.t0] * this.H0) - f10;
        float width = f11 > (this.E0 + this.G0) / 2.0f ? f11 - (this.u0.getWidth() + r1) : f11 + y1;
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
        A(true, true, true);
        ArrayList arrayList = this.d;
        this.n0 = arrayList.size();
        int i7 = 0;
        while (true) {
            this.o0 = i7;
            int i10 = this.o0;
            if (i10 >= this.n0) {
                break;
            }
            final ng.f fVar = (ng.f) arrayList.get(i10);
            if (fVar.n && (valueAnimator3 = fVar.i) != null) {
                valueAnimator3.cancel();
            }
            if (!fVar.n && (valueAnimator2 = fVar.h) != null) {
                valueAnimator2.cancel();
            }
            if (fVar.n && fVar.o != 1.0f) {
                ValueAnimator valueAnimator4 = fVar.h;
                if (valueAnimator4 == null || !valueAnimator4.isRunning()) {
                    final int i11 = 0;
                    ValueAnimator e10 = e(fVar.o, 1.0f, new ValueAnimator.AnimatorUpdateListener(this) { // from class: lg.c
                        public final /* synthetic */ g b;

                        {
                            this.b = this;
                        }

                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator5) {
                            switch (i11) {
                                case 0:
                                    g gVar = this.b;
                                    gVar.getClass();
                                    fVar.o = ((Float) valueAnimator5.getAnimatedValue()).floatValue();
                                    gVar.I = true;
                                    gVar.invalidate();
                                    break;
                                default:
                                    g gVar2 = this.b;
                                    gVar2.getClass();
                                    fVar.o = ((Float) valueAnimator5.getAnimatedValue()).floatValue();
                                    gVar2.I = true;
                                    gVar2.invalidate();
                                    break;
                            }
                        }
                    });
                    fVar.h = e10;
                    e10.start();
                } else {
                    i7 = this.o0 + 1;
                }
            }
            if (!fVar.n && fVar.o != 0.0f && ((valueAnimator = fVar.i) == null || !valueAnimator.isRunning())) {
                final int i12 = 1;
                ValueAnimator e11 = e(fVar.o, 0.0f, new ValueAnimator.AnimatorUpdateListener(this) { // from class: lg.c
                    public final /* synthetic */ g b;

                    {
                        this.b = this;
                    }

                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator5) {
                        switch (i12) {
                            case 0:
                                g gVar = this.b;
                                gVar.getClass();
                                fVar.o = ((Float) valueAnimator5.getAnimatedValue()).floatValue();
                                gVar.I = true;
                                gVar.invalidate();
                                break;
                            default:
                                g gVar2 = this.b;
                                gVar2.getClass();
                                fVar.o = ((Float) valueAnimator5.getAnimatedValue()).floatValue();
                                gVar2.I = true;
                                gVar2.invalidate();
                                break;
                        }
                    }
                });
                fVar.i = e11;
                e11.start();
            }
            i7 = this.o0 + 1;
        }
        K();
        if (this.v0) {
            ng.e eVar = this.u0;
            int i13 = this.t0;
            mg.b bVar = this.i0;
            eVar.c(i13, bVar.a[i13], arrayList, true, bVar.j, bVar.h);
        }
    }

    public void q(ng.j jVar) {
    }

    public void y() {
    }
}
