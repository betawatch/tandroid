package bg;

import ag.p2;
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
import org.telegram.messenger.i0;
import org.telegram.messenger.m5;
import org.telegram.messenger.zs;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.gr;
import org.telegram.ui.e61;
import org.telegram.ui.tj0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public abstract class i extends View implements m {
    public static final boolean A1;
    public static final boolean B1;
    public static final u1.a C1;
    public static final float k1 = i0.N(16.0f);
    public static final float l1 = i0.N(1.5f);
    public static final float m1 = i0.N(12.0f);
    public static final int n1 = i0.L(18.0f);
    public static final int o1 = i0.L(14.0f);
    public static final int p1 = i0.L(10.0f);
    public static final int q1 = i0.L(16.0f);
    public static final int r1 = i0.L(24.0f);
    public static final int s1 = i0.L(16.0f);
    public static final int t1 = i0.L(10.0f);
    public static final int u1 = i0.L(12.0f);
    public static final int v1 = i0.L(8.0f);
    public static final int w1 = i0.L(6.0f);
    public static final int x1 = i0.L(5.0f);
    public static final int y1 = i0.L(2.0f);
    public static final int z1 = i0.L(1.0f);
    public final int A0;
    public final int B0;
    public float C0;
    public float D;
    public float D0;
    public float E;
    public float E0;
    public int F;
    public float F0;
    public int G;
    public float G0;
    public boolean H;
    public final RectF H0;
    public boolean I;
    public VibrationEffect I0;
    public boolean J;
    public final d J0;
    public final Paint K;
    public final d K0;
    public final Paint L;
    public final b L0;
    public final Paint M;
    public final b M0;
    public final TextPaint N;
    public final d N0;
    public final TextPaint O;
    public final e O0;
    public final TextPaint P;
    public boolean P0;
    public final Paint Q;
    public g Q0;
    public final Paint R;
    public float R0;
    public final Paint S;
    public float S0;
    public final Paint T;
    public float T0;
    public final Paint U;
    public float U0;
    public final Rect V;
    public float V0;
    public final Path W;
    public final p6 W0;
    public int X0;
    public int Y0;
    public final Rect Z0;
    public h a;
    public AnimatorSet a0;
    public final ArrayList a1;
    public final ArrayList b;
    public ValueAnimator b0;
    public long b1;
    public final ArrayList c;
    public ValueAnimator c0;
    public int c1;
    public final ArrayList d;
    public Animator d0;
    public int d1;
    public boolean e;
    public ValueAnimator e0;
    public int e1;
    public float f;
    public boolean f0;
    public int f1;
    public final n g0;
    public long g1;
    public float h;
    public cg.b h0;
    public boolean h1;
    public dg.b i0;
    public boolean i1;
    public float j0;
    public dg.d j1;
    public float k0;
    public float l0;
    public int m0;
    public int n;
    public int n0;
    public int o0;
    public Bitmap p0;
    public Canvas q0;
    public int r;
    public boolean r0;
    public int s;
    public int s0;
    public dg.f t0;
    public boolean u0;
    public float v0;
    public float w;
    public boolean w0;
    public float x;
    public boolean x0;
    public float y;
    public int y0;
    public dg.k z0;

    static {
        A1 = Build.VERSION.SDK_INT < 28;
        B1 = true;
        C1 = new u1.a();
    }

    /* JADX WARN: Type inference failed for: r1v10, types: [bg.b] */
    /* JADX WARN: Type inference failed for: r1v9, types: [bg.b] */
    public i(Context context, p6 p6Var) {
        super(context);
        this.b = new ArrayList(10);
        this.c = new ArrayList(25);
        this.d = new ArrayList();
        final int i10 = 1;
        this.e = true;
        this.w = 250.0f;
        this.x = 0.0f;
        this.y = 0.0f;
        this.D = 0.0f;
        this.E = 0.0f;
        this.H = true;
        final int i11 = 0;
        this.I = false;
        this.J = true;
        this.K = new Paint();
        this.L = new Paint();
        this.M = new Paint();
        this.N = new TextPaint(1);
        this.O = new TextPaint(1);
        this.P = new TextPaint(1);
        this.Q = new Paint(1);
        this.R = new Paint();
        this.S = new Paint(1);
        this.T = new Paint(1);
        this.U = new Paint(1);
        this.V = new Rect();
        this.W = new Path();
        this.f0 = false;
        n nVar = new n();
        nVar.h = new Rect();
        nVar.i = new Rect();
        nVar.j = new Rect();
        nVar.k = 0.7f;
        nVar.l = 1.0f;
        nVar.m = 0.1f;
        nVar.n = new l[]{null, null};
        nVar.a = this;
        this.g0 = nVar;
        this.r0 = false;
        this.s0 = -1;
        this.u0 = false;
        this.v0 = 0.0f;
        this.w0 = false;
        this.x0 = false;
        this.y0 = 0;
        this.B0 = i0.L(46.0f);
        this.H0 = new RectF();
        this.J0 = new d(this, i11);
        this.K0 = new d(this, i10);
        this.L0 = new ValueAnimator.AnimatorUpdateListener(this) { // from class: bg.b
            public final /* synthetic */ i b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i11) {
                    case 0:
                        i iVar = this.b;
                        iVar.getClass();
                        iVar.w = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        iVar.invalidate();
                        break;
                    default:
                        i iVar2 = this.b;
                        iVar2.getClass();
                        iVar2.x = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        iVar2.invalidate();
                        break;
                }
            }
        };
        this.M0 = new ValueAnimator.AnimatorUpdateListener(this) { // from class: bg.b
            public final /* synthetic */ i b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i10) {
                    case 0:
                        i iVar = this.b;
                        iVar.getClass();
                        iVar.w = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        iVar.invalidate();
                        break;
                    default:
                        i iVar2 = this.b;
                        iVar2.getClass();
                        iVar2.x = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        iVar2.invalidate();
                        break;
                }
            }
        };
        this.N0 = new d(this, 2);
        this.O0 = new e(this, i11);
        this.P0 = false;
        this.X0 = 0;
        this.Y0 = 0;
        Rect rect = new Rect();
        this.Z0 = rect;
        ArrayList arrayList = new ArrayList();
        this.a1 = arrayList;
        arrayList.add(rect);
        this.b1 = 0L;
        this.i1 = false;
        this.W0 = p6Var;
        t();
        this.A0 = ViewConfiguration.get(context).getScaledTouchSlop();
    }

    public static void b(Path path, float f7, float f10, float f11, float f12, float f13, float f14, boolean z10, boolean z11, boolean z12, boolean z13) {
        path.reset();
        if (f13 < 0.0f) {
            f13 = 0.0f;
        }
        if (f14 < 0.0f) {
            f14 = 0.0f;
        }
        float f15 = f11 - f7;
        float f16 = f12 - f10;
        float f17 = f15 / 2.0f;
        if (f13 > f17) {
            f13 = f17;
        }
        float f18 = f16 / 2.0f;
        if (f14 > f18) {
            f14 = f18;
        }
        float f19 = f15 - (f13 * 2.0f);
        float f20 = f16 - (2.0f * f14);
        path.moveTo(f11, f10 + f14);
        if (z11) {
            float f21 = -f14;
            path.rQuadTo(0.0f, f21, -f13, f21);
        } else {
            path.rLineTo(0.0f, -f14);
            path.rLineTo(-f13, 0.0f);
        }
        path.rLineTo(-f19, 0.0f);
        if (z10) {
            float f22 = -f13;
            path.rQuadTo(f22, 0.0f, f22, f14);
        } else {
            path.rLineTo(-f13, 0.0f);
            path.rLineTo(0.0f, f14);
        }
        path.rLineTo(0.0f, f20);
        if (z13) {
            path.rQuadTo(0.0f, f14, f13, f14);
        } else {
            path.rLineTo(0.0f, f14);
            path.rLineTo(f13, 0.0f);
        }
        path.rLineTo(f19, 0.0f);
        if (z12) {
            path.rQuadTo(f13, 0.0f, f13, -f14);
        } else {
            path.rLineTo(f13, 0.0f);
            path.rLineTo(0.0f, -f14);
        }
        path.rLineTo(0.0f, -f20);
        path.close();
    }

    public static ValueAnimator e(float f7, float f10, ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f7, f10);
        ofFloat.setDuration(400L);
        ofFloat.setInterpolator(C1);
        ofFloat.addUpdateListener(animatorUpdateListener);
        return ofFloat;
    }

    public void A(boolean z10, boolean z11, boolean z12) {
        if (this.h0 == null) {
            return;
        }
        float f7 = this.F0;
        n nVar = this.g0;
        this.G0 = f7 / (nVar.l - nVar.k);
        H();
        E(r(this.F, this.G), this.P0 ? s(this.F, this.G) : 0L, z10, z11, z12);
        if (this.u0 && !z11) {
            c(false);
            x((this.G0 * nVar.k) - k1);
        }
        invalidate();
    }

    public final void B() {
        if (Build.VERSION.SDK_INT >= 26) {
            Vibrator vibrator = (Vibrator) getContext().getSystemService("vibrator");
            if (this.I0 == null) {
                this.I0 = VibrationEffect.createWaveform(new long[]{0, 2}, -1);
            }
            vibrator.cancel();
            vibrator.vibrate(this.I0);
        }
    }

    public void C(int i10, int i11) {
        int i12 = this.s0;
        cg.b bVar = this.h0;
        if (bVar == null) {
            return;
        }
        float f7 = this.G0;
        float f10 = (this.g0.k * f7) - k1;
        float f11 = (i10 + f10) / f7;
        if (f11 < 0.0f) {
            this.s0 = 0;
        } else if (f11 > 1.0f) {
            this.s0 = bVar.a.length - 1;
        } else {
            int b10 = bVar.b(f11, this.F, this.G);
            this.s0 = b10;
            int i13 = b10 + 1;
            float[] fArr = this.h0.b;
            if (i13 < fArr.length) {
                if (Math.abs(this.h0.b[this.s0 + 1] - f11) < Math.abs(fArr[b10] - f11)) {
                    this.s0++;
                }
            }
        }
        int i14 = this.s0;
        int i15 = this.G;
        if (i14 > i15) {
            this.s0 = i15;
        }
        int i16 = this.s0;
        int i17 = this.F;
        if (i16 < i17) {
            this.s0 = i17;
        }
        if (i12 != this.s0) {
            this.u0 = true;
            c(true);
            x(f10);
            g gVar = this.Q0;
            if (gVar != null) {
                getSelectedDate();
                e61 e61Var = (e61) ((tj0) gVar).b;
                e61Var.f();
                e61Var.b.t0.d(false, false);
            }
            B();
            invalidate();
        }
    }

    public boolean D(cg.b bVar) {
        boolean z10;
        cg.b bVar2 = this.h0;
        n nVar = this.g0;
        ArrayList arrayList = this.d;
        if (bVar2 != bVar) {
            invalidate();
            arrayList.clear();
            if (bVar != null && bVar.d != null) {
                for (int i10 = 0; i10 < bVar.d.size(); i10++) {
                    arrayList.add(h((cg.a) bVar.d.get(i10)));
                }
            }
            d();
            this.h0 = bVar;
            if (bVar != null) {
                if (bVar.a[0] == 0) {
                    nVar.k = 0.0f;
                    nVar.l = 1.0f;
                } else {
                    float minDistance = getMinDistance();
                    nVar.m = minDistance;
                    float f7 = nVar.l;
                    if (f7 - nVar.k < minDistance) {
                        float f10 = f7 - minDistance;
                        nVar.k = f10;
                        if (f10 < 0.0f) {
                            nVar.k = 0.0f;
                            nVar.l = 1.0f;
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
            E(r(this.F, this.G), this.P0 ? s(this.F, this.G) : 0L, false, false, false);
            this.j0 = 0.0f;
            this.k0 = 2.14748365E9f;
            u();
            int i11 = bVar.j;
            if (i11 == 1 || i11 == 2) {
                this.t0.setSize(arrayList.size() * 2);
            } else {
                this.t0.setSize(arrayList.size());
            }
            this.H = true;
            I();
            return z10;
        }
        nVar.k = 0.7f;
        nVar.l = 1.0f;
        this.k0 = 0.0f;
        this.j0 = 0.0f;
        this.b.clear();
        AnimatorSet animatorSet = this.a0;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        ValueAnimator valueAnimator = this.b0;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.b0.cancel();
        }
        return z10;
    }

    public final void E(long j10, long j11, boolean z10, boolean z11, boolean z12) {
        if ((Math.abs((((long) Math.ceil(((j10 <= 100 || ((float) (j10 / 5)) % 10.0f == 0.0f) ? j10 : ((j10 / 10) + 1) * 10) / 5.0f)) * 5) - this.y) < this.E || j10 == 0) && j10 == this.D) {
            return;
        }
        dg.e f7 = f(j10, this.h0.i, j11);
        long[] jArr = f7.a;
        int i10 = 1;
        long j12 = jArr[jArr.length - 1];
        int i11 = 0;
        long j13 = jArr[0];
        if (!z12) {
            float f10 = this.w - this.x;
            float f11 = j12 - j13;
            float f12 = f10 / f11;
            if (f12 > 1.0f) {
                f12 = f11 / f10;
            }
            double d = f12;
            float f13 = d > 0.7d ? 0.1f : d < 0.1d ? 0.03f : 0.045f;
            boolean z13 = ((float) j12) != this.y;
            if (this.P0 && j13 != this.D) {
                z13 = true;
            }
            if (z13) {
                AnimatorSet animatorSet = this.a0;
                if (animatorSet != null) {
                    animatorSet.removeAllListeners();
                    this.a0.cancel();
                }
                this.T0 = this.w;
                this.U0 = this.x;
                this.R0 = 0.0f;
                this.S0 = 0.0f;
                this.V0 = f13;
            }
        }
        float f14 = j12;
        this.y = f14;
        float f15 = j13;
        this.D = f15;
        v();
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.b1 >= 320 || z11) {
            this.b1 = currentTimeMillis;
            ValueAnimator valueAnimator = this.b0;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.b0.cancel();
            }
            ArrayList arrayList = this.b;
            if (!z10) {
                this.w = f14;
                this.x = f15;
                arrayList.clear();
                arrayList.add(f7);
                f7.f = zs.e4;
                return;
            }
            arrayList.add(f7);
            if (z12) {
                AnimatorSet animatorSet2 = this.a0;
                if (animatorSet2 != null) {
                    animatorSet2.removeAllListeners();
                    this.a0.cancel();
                }
                this.V0 = 0.0f;
                AnimatorSet animatorSet3 = new AnimatorSet();
                animatorSet3.playTogether(e(this.w, f14, this.L0));
                if (this.P0) {
                    animatorSet3.playTogether(e(this.x, f15, this.M0));
                }
                this.a0 = animatorSet3;
                animatorSet3.start();
            }
            int size = arrayList.size();
            for (int i12 = 0; i12 < size; i12++) {
                dg.e eVar = (dg.e) arrayList.get(i12);
                if (eVar != f7) {
                    eVar.g = eVar.f;
                }
            }
            ValueAnimator e = e(0.0f, 255.0f, new p2(i10, this, f7));
            this.b0 = e;
            e.addListener(new f(i11, this, f7));
            this.b0.start();
        }
    }

    public final void F() {
        float f7 = this.V0;
        if (f7 == 0.0f) {
            return;
        }
        float f10 = this.w;
        float f11 = this.y;
        if (f10 != f11) {
            float f12 = this.R0 + f7;
            this.R0 = f12;
            if (f12 > 1.0f) {
                this.R0 = 1.0f;
                this.w = f11;
            } else {
                float f13 = this.T0;
                this.w = (gr.g.getInterpolation(f12) * (f11 - f13)) + f13;
            }
            invalidate();
        }
        if (this.P0) {
            float f14 = this.x;
            float f15 = this.D;
            if (f14 != f15) {
                float f16 = this.S0 + this.V0;
                this.S0 = f16;
                if (f16 > 1.0f) {
                    this.S0 = 1.0f;
                    this.x = f15;
                } else {
                    float f17 = this.U0;
                    this.x = (gr.g.getInterpolation(f16) * (f15 - f17)) + f17;
                }
                invalidate();
            }
        }
    }

    public final void G() {
        int i10 = this.x0 ? t6.Nj : t6.Mj;
        p6 p6Var = this.W0;
        int w02 = t6.w0(i10, p6Var);
        this.N.setColor(w02);
        this.O.setColor(t6.w0(this.x0 ? t6.Nj : t6.Mj, p6Var));
        int w03 = t6.w0(t6.Mj, p6Var);
        this.P.setColor(w03);
        int w04 = t6.w0(t6.Oj, p6Var);
        Paint paint = this.L;
        paint.setColor(w04);
        int w05 = t6.w0(t6.Pj, p6Var);
        Paint paint2 = this.M;
        paint2.setColor(w05);
        this.Q.setColor(t6.w0(t6.Rj, p6Var));
        this.R.setColor(t6.w0(t6.Qj, p6Var));
        this.S.setColor(t6.w0(t6.d6, p6Var));
        this.T.setColor(t6.w0(t6.Sj, p6Var));
        this.t0.b();
        this.n = paint.getAlpha();
        this.r = paint2.getAlpha();
        this.f = r2.getAlpha() / 255.0f;
        this.h = r3.getAlpha() / 255.0f;
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            ((dg.g) obj).a();
        }
        if (this.u0) {
            int i12 = this.s0;
            cg.b bVar = this.h0;
            long[] jArr = bVar.a;
            if (i12 < jArr.length) {
                this.t0.c(i12, jArr[i12], arrayList, false, bVar.j, bVar.h);
            }
        }
        this.H = true;
    }

    public final void H() {
        cg.b bVar = this.h0;
        if (bVar == null) {
            return;
        }
        n nVar = this.g0;
        int c10 = bVar.c(Math.max(nVar.k, 0.0f));
        this.F = c10;
        int a2 = this.h0.a(Math.min(nVar.l, 1.0f), c10);
        this.G = a2;
        int i10 = this.F;
        if (a2 < i10) {
            this.G = i10;
        }
        dg.d dVar = this.j1;
        if (dVar != null) {
            long[] jArr = this.h0.a;
            dVar.b(jArr[i10], jArr[this.G]);
        }
        I();
    }

    public final void I() {
        cg.b bVar = this.h0;
        if (bVar != null) {
            float f7 = this.F0;
            if (f7 == 0.0f) {
                return;
            }
            int i10 = (int) ((f7 / (this.G0 * bVar.g)) / 6.0f);
            dg.b bVar2 = this.i0;
            if (bVar2 == null || i10 >= bVar2.b || i10 <= bVar2.c) {
                int highestOneBit = Integer.highestOneBit(i10) << 1;
                dg.b bVar3 = this.i0;
                if (bVar3 == null || bVar3.a != highestOneBit) {
                    ValueAnimator valueAnimator = this.c0;
                    if (valueAnimator != null) {
                        valueAnimator.removeAllListeners();
                        this.c0.cancel();
                    }
                    double d = highestOneBit;
                    double d10 = 0.2d * d;
                    dg.b bVar4 = new dg.b(highestOneBit, (int) (d + d10), (int) (d - d10));
                    bVar4.d = zs.e4;
                    dg.b bVar5 = this.i0;
                    ArrayList arrayList = this.c;
                    if (bVar5 == null) {
                        this.i0 = bVar4;
                        bVar4.d = zs.e4;
                        arrayList.add(bVar4);
                        return;
                    }
                    this.i0 = bVar4;
                    this.m0 = arrayList.size();
                    for (int i11 = 0; i11 < this.m0; i11++) {
                        dg.b bVar6 = (dg.b) arrayList.get(i11);
                        bVar6.e = bVar6.d;
                    }
                    arrayList.add(bVar4);
                    if (arrayList.size() > 2) {
                        arrayList.remove(0);
                    }
                    ValueAnimator duration = e(0.0f, 1.0f, new p2(2, this, bVar4)).setDuration(200L);
                    this.c0 = duration;
                    duration.addListener(new f(1, this, bVar4));
                    this.c0.start();
                }
            }
        }
    }

    public void J(cg.b bVar, long j10) {
        int length = bVar.a.length;
        long j11 = j10 - (j10 % 86400000);
        long j12 = 86399999 + j11;
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < length; i12++) {
            long j13 = bVar.a[i12];
            if (j11 > j13) {
                i10 = i12;
            }
            if (j12 > j13) {
                i11 = i12;
            }
        }
        float[] fArr = bVar.b;
        float f7 = fArr[i10];
        n nVar = this.g0;
        nVar.k = f7;
        nVar.l = fArr[i11];
    }

    public void K() {
        if (B1) {
            ArrayList arrayList = this.d;
            int size = arrayList.size();
            long j10 = Long.MAX_VALUE;
            int i10 = 0;
            long j11 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                dg.g gVar = (dg.g) obj;
                boolean z10 = gVar.n;
                cg.a aVar = gVar.a;
                if (z10) {
                    long j12 = aVar.e;
                    if (j12 > j11) {
                        j11 = j12;
                    }
                }
                if (z10) {
                    long j13 = aVar.f;
                    if (j13 < j10) {
                        j10 = j13;
                    }
                }
            }
            if ((j10 == 2147483647L || j10 == 0.0f) && (j11 <= 0 || j11 == this.l0)) {
                return;
            }
            this.l0 = j11;
            Animator animator = this.d0;
            if (animator != null) {
                animator.cancel();
            }
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(e(this.j0, this.l0, this.J0), e(this.k0, 0.0f, this.K0));
            this.d0 = animatorSet;
            animatorSet.start();
        }
    }

    @Override // bg.m
    public void a(float f7, float f10, boolean z10) {
        cg.b bVar = this.h0;
        if (bVar == null) {
            return;
        }
        if (!z10) {
            H();
            invalidate();
        } else {
            int c10 = bVar.c(Math.max(f7, 0.0f));
            int a2 = this.h0.a(Math.min(f10, 1.0f), c10);
            E(r(c10, a2), s(c10, a2), true, true, false);
            c(false);
        }
    }

    public final void c(boolean z10) {
        x((this.G0 * this.g0.k) - k1);
        if (this.i1 == z10) {
            return;
        }
        this.i1 = z10;
        ValueAnimator valueAnimator = this.e0;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.e0.cancel();
        }
        ValueAnimator duration = e(this.v0, z10 ? 1.0f : 0.0f, this.N0).setDuration(200L);
        this.e0 = duration;
        duration.addListener(this.O0);
        this.e0.start();
    }

    public final void d() {
        this.s0 = -1;
        this.u0 = false;
        this.i1 = false;
        this.t0.setVisibility(8);
        this.v0 = 0.0f;
    }

    public dg.e f(long j10, int i10, long j11) {
        return new dg.e(j10, j11, this.P0, this.h0.h, i10, this.N, this.O);
    }

    public dg.f g() {
        return new dg.f(getContext(), this.W0);
    }

    public long getEndDate() {
        return this.h0.a[this.G];
    }

    public float getMinDistance() {
        cg.b bVar = this.h0;
        if (bVar == null) {
            return 0.1f;
        }
        int length = bVar.a.length;
        if (length < 5) {
            return 1.0f;
        }
        float f7 = 5.0f / length;
        if (f7 < 0.1f) {
            return 0.1f;
        }
        return f7;
    }

    public long getSelectedDate() {
        int i10 = this.s0;
        if (i10 < 0) {
            return -1L;
        }
        return this.h0.a[i10];
    }

    public long getStartDate() {
        return this.h0.a[this.F];
    }

    public abstract dg.g h(cg.a aVar);

    public void i(Canvas canvas) {
        if (this.h0 == null) {
            return;
        }
        int i10 = this.y0;
        float f7 = 1.0f;
        if (i10 == 2) {
            f7 = 1.0f - this.z0.f;
        } else if (i10 == 1) {
            f7 = this.z0.f;
        } else if (i10 == 3) {
            f7 = this.z0.f;
        }
        Paint paint = this.L;
        paint.setAlpha((int) (this.n * f7));
        int i11 = (int) (this.f * 255.0f * f7);
        TextPaint textPaint = this.N;
        textPaint.setAlpha(i11);
        this.O.setAlpha((int) (this.f * 255.0f * f7));
        int textSize = (int) (n1 - textPaint.getTextSize());
        float measuredHeight = (getMeasuredHeight() - this.s) - 1;
        canvas.drawLine(this.D0, measuredHeight, this.E0, measuredHeight, paint);
        if (this.P0) {
            return;
        }
        canvas.drawText("0", k1, r1 - textSize, textPaint);
    }

    public void j(Canvas canvas) {
        char c10;
        int i10;
        int i11;
        if (this.h0 == null) {
            return;
        }
        ArrayList arrayList = this.c;
        this.m0 = arrayList.size();
        int i12 = this.y0;
        float f7 = 1.0f;
        int i13 = 1;
        float f10 = i12 == 2 ? 1.0f - this.z0.f : i12 == 1 ? this.z0.f : i12 == 3 ? this.z0.f : 1.0f;
        char c11 = 0;
        this.n0 = 0;
        while (true) {
            int i14 = this.n0;
            if (i14 >= this.m0) {
                return;
            }
            int i15 = ((dg.b) arrayList.get(i14)).d;
            int i16 = ((dg.b) arrayList.get(this.n0)).a;
            if (i16 == 0) {
                i16 = i13;
            }
            int i17 = this.F - this.o0;
            while (i17 % i16 != 0) {
                i17--;
            }
            int i18 = this.G - this.o0;
            while (true) {
                if (i18 % i16 == 0 && i18 >= this.h0.a.length - i13) {
                    break;
                }
                i18++;
                i13 = i13;
                i15 = i15;
                c11 = c11;
                f7 = 1.0f;
            }
            int i19 = this.o0;
            int i20 = i17 + i19;
            int i21 = i18 + i19;
            float f11 = this.G0 * this.g0.k;
            float f12 = k1;
            float f13 = f11 - f12;
            while (i20 < i21) {
                if (i20 >= 0) {
                    long[] jArr = this.h0.a;
                    if (i20 < jArr.length - i13) {
                        long j10 = jArr[i20];
                        long j11 = jArr[c11];
                        long j12 = jArr[jArr.length - i13];
                        i10 = i13;
                        i11 = i15;
                        float f14 = (((j10 - j11) / (j12 - j11)) * this.G0) - f13;
                        float f15 = f14 - t1;
                        if (f15 > 0.0f) {
                            float f16 = this.F0;
                            if (f15 <= f16 + f12) {
                                float f17 = p1;
                                c10 = c11;
                                TextPaint textPaint = this.P;
                                if (f15 < f17) {
                                    textPaint.setAlpha((int) (i11 * m5.y(f17, f15, f17, f7) * this.h * f10));
                                } else if (f15 > f16) {
                                    textPaint.setAlpha((int) (i11 * m5.y(f15, f16, f12, f7) * this.h * f10));
                                } else {
                                    textPaint.setAlpha((int) (i11 * this.h * f10));
                                }
                                cg.b bVar = this.h0;
                                String[] strArr = bVar.c;
                                long[] jArr2 = bVar.a;
                                canvas.drawText(strArr[(int) ((jArr2[i20] - jArr2[c10]) / bVar.k)], f14, i0.L(3.0f) + (getMeasuredHeight() - this.s) + o1, textPaint);
                                i20 += i16;
                                i13 = i10;
                                i15 = i11;
                                c11 = c10;
                                f7 = 1.0f;
                            }
                        }
                        c10 = c11;
                        i20 += i16;
                        i13 = i10;
                        i15 = i11;
                        c11 = c10;
                        f7 = 1.0f;
                    }
                }
                c10 = c11;
                i10 = i13;
                i11 = i15;
                i20 += i16;
                i13 = i10;
                i15 = i11;
                c11 = c10;
                f7 = 1.0f;
            }
            this.n0 += i13;
            c11 = c11;
            f7 = 1.0f;
        }
    }

    public abstract void k(Canvas canvas);

    /* JADX WARN: Removed duplicated region for block: B:11:0x007d A[LOOP:0: B:10:0x007b->B:11:0x007d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void l(Canvas canvas, dg.e eVar) {
        float f7;
        int i10;
        int i11;
        int length = eVar.a.length;
        float f10 = 1.0f;
        if (length > 2) {
            float f11 = (r0[1] - r0[0]) / (this.w - this.x);
            if (f11 < 0.1d) {
                f7 = f11 / 0.1f;
                i10 = this.y0;
                if (i10 != 2) {
                    f10 = 1.0f - this.z0.f;
                } else if (i10 == 1) {
                    f10 = this.z0.f;
                } else if (i10 == 3) {
                    f10 = this.z0.f;
                }
                Paint paint = this.L;
                paint.setAlpha((int) ((this.n / 255.0f) * eVar.f * f10 * f7));
                this.N.setAlpha((int) c3.i0.E(eVar.f, this.f, f10, f7));
                this.O.setAlpha((int) c3.i0.E(eVar.f, this.f, f10, f7));
                int measuredHeight = (getMeasuredHeight() - this.s) - n1;
                for (i11 = !this.P0 ? 1 : 0; i11 < length; i11++) {
                    float measuredHeight2 = getMeasuredHeight() - this.s;
                    float f12 = eVar.a[i11];
                    float f13 = this.x;
                    canvas.drawRect(this.D0, (int) (measuredHeight2 - (((f12 - f13) / (this.w - f13)) * measuredHeight)), this.E0, r4 + 1, paint);
                }
            }
        }
        f7 = 1.0f;
        i10 = this.y0;
        if (i10 != 2) {
        }
        Paint paint2 = this.L;
        paint2.setAlpha((int) ((this.n / 255.0f) * eVar.f * f10 * f7));
        this.N.setAlpha((int) c3.i0.E(eVar.f, this.f, f10, f7));
        this.O.setAlpha((int) c3.i0.E(eVar.f, this.f, f10, f7));
        int measuredHeight3 = (getMeasuredHeight() - this.s) - n1;
        while (i11 < length) {
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
        int i10;
        float f7;
        int i11;
        int i12;
        cg.b bVar;
        int i13;
        int i14;
        int i15;
        char c10;
        Paint paint;
        Canvas canvas2;
        float f10;
        int i16;
        l lVar;
        l lVar2;
        int i17;
        float f11;
        int i18;
        Paint paint2;
        ValueAnimator valueAnimator;
        if (this.h0 == null) {
            return;
        }
        float f12 = this.C0;
        n nVar = this.g0;
        nVar.b = f12;
        int measuredHeight = getMeasuredHeight();
        int i19 = q1;
        int i20 = measuredHeight - i19;
        int measuredHeight2 = getMeasuredHeight();
        int i21 = this.B0;
        int i22 = (measuredHeight2 - i21) - i19;
        float f13 = this.C0;
        float f14 = nVar.k * f13;
        float f15 = k1;
        int i23 = (int) (f14 + f15);
        int i24 = (int) ((nVar.l * f13) + f15);
        int i25 = this.y0;
        if (i25 == 1) {
            dg.k kVar = this.z0;
            int i26 = (int) ((kVar.a * f13) + f15);
            i10 = 1;
            int i27 = (int) ((f13 * kVar.b) + f15);
            float f16 = 1.0f - kVar.f;
            i23 = (int) (((i26 - i23) * f16) + i23);
            i24 = (int) ((f16 * (i27 - i24)) + i24);
        } else {
            i10 = 1;
            if (i25 == 3) {
                f7 = this.z0.f;
                i11 = i23;
                i12 = i24;
                bVar = this.h0;
                int i28 = u1;
                Paint paint3 = this.R;
                Paint paint4 = this.K;
                if (bVar == null) {
                    if (i25 == 0) {
                        int i29 = 0;
                        while (true) {
                            ArrayList arrayList = this.d;
                            f11 = f7;
                            if (i29 >= arrayList.size()) {
                                break;
                            }
                            dg.g gVar = (dg.g) arrayList.get(i29);
                            ValueAnimator valueAnimator2 = gVar.h;
                            if ((valueAnimator2 == null || !valueAnimator2.isRunning()) && ((valueAnimator = gVar.i) == null || !valueAnimator.isRunning())) {
                                i29++;
                                f7 = f11;
                            }
                        }
                    } else {
                        f11 = f7;
                    }
                    int i30 = 0;
                    if (i30 != 0) {
                        canvas.save();
                        i18 = i30;
                        canvas.clipRect(f15, (getMeasuredHeight() - i19) - i21, getMeasuredWidth() - f15, getMeasuredHeight() - i19);
                        canvas.translate(f15, (getMeasuredHeight() - i19) - i21);
                        n(canvas);
                        canvas.restore();
                    } else {
                        i18 = i30;
                        if (this.H) {
                            this.p0.eraseColor(0);
                            n(this.q0);
                            this.H = false;
                            if (i18 != 0) {
                                int i31 = this.y0;
                                if (i31 == 2) {
                                    float f17 = this.C0;
                                    dg.k kVar2 = this.z0;
                                    float f18 = (kVar2.c * f17) + f15;
                                    paint4.setAlpha((int) ((1.0f - kVar2.f) * 255.0f));
                                    canvas.save();
                                    paint2 = paint3;
                                    i13 = i19;
                                    canvas.clipRect(f15, i22, getMeasuredWidth() - f15, i20);
                                    canvas.scale((this.z0.f * 2.0f) + 1.0f, 1.0f, f18, ((i20 - i22) + i22) >> 1);
                                    canvas.drawBitmap(this.p0, f15, (getMeasuredHeight() - i13) - i21, paint4);
                                    canvas.restore();
                                } else {
                                    paint2 = paint3;
                                    i13 = i19;
                                    int i32 = i10;
                                    if (i31 == i32) {
                                        float f19 = ((i20 - i22) + i22) >> i32;
                                        float f20 = this.C0;
                                        dg.k kVar3 = this.z0;
                                        float f21 = kVar3.c;
                                        float f22 = f20 * f21;
                                        float f23 = f22 + f15;
                                        if (f21 <= 0.5f) {
                                            f22 = (1.0f - f21) * f20;
                                        }
                                        float f24 = f22 * kVar3.f;
                                        canvas.save();
                                        i14 = i28;
                                        canvas.clipRect(f23 - f24, i22, f24 + f23, i20);
                                        paint4.setAlpha((int) (this.z0.f * 255.0f));
                                        canvas.scale(this.z0.f, 1.0f, f23, f19);
                                        canvas.drawBitmap(this.p0, f15, (getMeasuredHeight() - i13) - i21, paint4);
                                        canvas.restore();
                                    } else {
                                        i14 = i28;
                                        paint4.setAlpha((int) (f11 * 255.0f));
                                        canvas.drawBitmap(this.p0, f15, (getMeasuredHeight() - i13) - i21, paint4);
                                    }
                                    if (this.y0 == 2) {
                                        return;
                                    }
                                    float f25 = i22;
                                    float f26 = i20;
                                    float f27 = k1;
                                    paint = paint4;
                                    i15 = 2;
                                    Paint paint5 = paint2;
                                    c10 = 0;
                                    canvas.drawRect(f27, f25, i11 + i14, f26, paint5);
                                    canvas2 = canvas;
                                    canvas2.drawRect(i12 - i14, f25, getMeasuredWidth() - f27, f26, paint5);
                                    f10 = f15;
                                }
                            } else {
                                paint2 = paint3;
                                i13 = i19;
                            }
                            i14 = i28;
                            if (this.y0 == 2) {
                            }
                        }
                    }
                    if (i18 != 0) {
                    }
                    i14 = i28;
                    if (this.y0 == 2) {
                    }
                } else {
                    i13 = i19;
                    i14 = i28;
                    i15 = 2;
                    c10 = 0;
                    paint = paint4;
                    canvas2 = canvas;
                    f10 = f15;
                    canvas2.drawRect(f10, i22, getMeasuredWidth() - f15, i20, paint3);
                }
                canvas2.drawBitmap(this.a.d(i21, (int) (getMeasuredWidth() - (f10 * 2.0f))), f10, (getMeasuredHeight() - i13) - i21, paint);
                if (this.h0 == null) {
                    Rect rect = this.V;
                    rect.set(i11, i22, i12, i20);
                    nVar.j.set(rect);
                    int i33 = rect.left;
                    int i34 = rect.top;
                    float f28 = rect.bottom + z1;
                    float f29 = v1;
                    Path path = this.W;
                    b(path, i33, i34 - r12, i33 + i14, f28, f29, f29, true, false, false, true);
                    Paint paint6 = this.Q;
                    canvas2.drawPath(path, paint6);
                    b(path, r3 - i14, rect.top - r12, rect.right, rect.bottom + r12, f29, f29, false, true, true, false);
                    canvas2.drawPath(path, paint6);
                    canvas2.drawRect(rect.left + i14, rect.bottom, rect.right - i14, r3 + r12, paint6);
                    canvas.drawRect(rect.left + i14, r1 - r12, rect.right - i14, rect.top, paint6);
                    int i35 = rect.left;
                    int i36 = w1;
                    float centerY = rect.centerY() - i36;
                    float f30 = rect.left + i36;
                    float centerY2 = rect.centerY() + i36;
                    Paint paint7 = this.U;
                    canvas.drawLine(i35 + i36, centerY, f30, centerY2, paint7);
                    canvas.drawLine(rect.right - i36, rect.centerY() - i36, rect.right - i36, rect.centerY() + i36, paint7);
                    l[] lVarArr = nVar.n;
                    l lVar3 = lVarArr[c10];
                    if (lVar3 == null || lVar3.a != 4) {
                        i16 = 1;
                        lVar = lVarArr[1];
                        if (lVar == null || lVar.a != 4) {
                            lVar = null;
                        }
                    } else {
                        lVar = lVar3;
                        i16 = 1;
                    }
                    int i37 = rect.bottom;
                    int i38 = rect.top;
                    int i39 = (i37 - i38) >> i16;
                    int i40 = i38 + i39;
                    if (lVar == null) {
                        if (lVar3 == null || lVar3.a != i16) {
                            lVar2 = lVarArr[i16];
                            if (lVar2 == null || lVar2.a != i16) {
                                lVar2 = null;
                            }
                        } else {
                            lVar2 = lVar3;
                        }
                        if ((lVar3 == null || lVar3.a != i15) && ((lVar3 = lVarArr[i16]) == null || lVar3.a != i15)) {
                            lVar3 = null;
                        }
                        Paint paint8 = this.T;
                        int i41 = y1;
                        int i42 = x1;
                        if (lVar2 != null) {
                            i17 = i42;
                            canvas.drawCircle(rect.left + i42, i40, (i39 * lVar2.f) - i41, paint8);
                        } else {
                            i17 = i42;
                        }
                        if (lVar3 != null) {
                            canvas.drawCircle(rect.right - i17, i40, (i39 * lVar3.f) - i41, paint8);
                        }
                    }
                    Rect rect2 = nVar.h;
                    int i43 = r1;
                    int i44 = i43 >> 1;
                    rect2.set(i11 - i43, i22, i11 + i44, i20);
                    nVar.i.set(i12 - i44, i22, i12 + i43, i20);
                    return;
                }
                return;
            }
        }
        i11 = i23;
        i12 = i24;
        f7 = 1.0f;
        bVar = this.h0;
        int i282 = u1;
        Paint paint32 = this.R;
        Paint paint42 = this.K;
        if (bVar == null) {
        }
        canvas2.drawBitmap(this.a.d(i21, (int) (getMeasuredWidth() - (f10 * 2.0f))), f10, (getMeasuredHeight() - i13) - i21, paint);
        if (this.h0 == null) {
        }
    }

    public abstract void n(Canvas canvas);

    public void o(Canvas canvas) {
        cg.b bVar;
        int i10 = this.s0;
        if (i10 < 0 || !this.u0 || (bVar = this.h0) == null) {
            return;
        }
        int i11 = (int) (this.r * this.v0);
        float f7 = this.F0;
        n nVar = this.g0;
        float f10 = nVar.l;
        float f11 = nVar.k;
        float f12 = f7 / (f10 - f11);
        float f13 = (f11 * f12) - k1;
        float[] fArr = bVar.b;
        if (i10 >= fArr.length) {
            return;
        }
        float f14 = (fArr[i10] * f12) - f13;
        Paint paint = this.M;
        paint.setAlpha(i11);
        canvas.drawLine(f14, 0.0f, f14, this.H0.bottom, paint);
        if (!this.e) {
            return;
        }
        ArrayList arrayList = this.d;
        this.m0 = arrayList.size();
        int i12 = 0;
        while (true) {
            this.n0 = i12;
            int i13 = this.n0;
            if (i13 >= this.m0) {
                return;
            }
            dg.g gVar = (dg.g) arrayList.get(i13);
            boolean z10 = gVar.n;
            Paint paint2 = gVar.d;
            if (z10 || gVar.o != 0.0f) {
                float f15 = gVar.a.a[this.s0];
                float f16 = this.x;
                float measuredHeight = (getMeasuredHeight() - this.s) - (((f15 - f16) / (this.w - f16)) * ((getMeasuredHeight() - this.s) - n1));
                paint2.setAlpha((int) (gVar.o * 255.0f * this.v0));
                int i14 = (int) (gVar.o * 255.0f * this.v0);
                Paint paint3 = this.S;
                paint3.setAlpha(i14);
                canvas.drawPoint(f14, measuredHeight, paint2);
                canvas.drawPoint(f14, measuredHeight, paint3);
            }
            i12 = this.n0 + 1;
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (this.w0) {
            super.onDraw(canvas);
            return;
        }
        F();
        int save = canvas.save();
        RectF rectF = this.H0;
        canvas.clipRect(0.0f, rectF.top, getMeasuredWidth(), rectF.bottom);
        i(canvas);
        ArrayList arrayList = this.b;
        this.m0 = arrayList.size();
        int i10 = 0;
        this.n0 = 0;
        while (true) {
            int i11 = this.n0;
            if (i11 >= this.m0) {
                break;
            }
            l(canvas, (dg.e) arrayList.get(i11));
            this.n0++;
        }
        k(canvas);
        while (true) {
            this.n0 = i10;
            int i12 = this.n0;
            if (i12 >= this.m0) {
                canvas.restoreToCount(save);
                j(canvas);
                m(canvas);
                o(canvas);
                super.onDraw(canvas);
                return;
            }
            p(canvas, (dg.e) arrayList.get(i12));
            i10 = this.n0 + 1;
        }
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (this.I) {
            setMeasuredDimension(View.MeasureSpec.getSize(i10), i0.q.y - i0.L(56.0f));
        } else {
            setMeasuredDimension(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i10));
        }
        int measuredWidth = getMeasuredWidth();
        int i12 = this.X0;
        int i13 = this.B0;
        if (measuredWidth != i12 || getMeasuredHeight() != this.Y0) {
            this.X0 = getMeasuredWidth();
            this.Y0 = getMeasuredHeight();
            float measuredWidth2 = getMeasuredWidth();
            float f7 = k1;
            float f10 = 2.0f * f7;
            this.p0 = Bitmap.createBitmap((int) (measuredWidth2 - f10), i13, Bitmap.Config.ARGB_4444);
            this.q0 = new Canvas(this.p0);
            this.a.d(i13, (int) (getMeasuredWidth() - f10));
            w();
            if (this.u0) {
                x((this.G0 * this.g0.k) - f7);
            }
            A(false, true, false);
        }
        if (Build.VERSION.SDK_INT >= 29) {
            int measuredHeight = getMeasuredHeight();
            int i14 = q1;
            this.Z0.set(0, measuredHeight - ((i13 + i14) + i14), getMeasuredWidth(), getMeasuredHeight());
            setSystemGestureExclusionRects(this.a1);
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ValueAnimator valueAnimator;
        ValueAnimator valueAnimator2;
        if (this.h0 != null) {
            boolean z10 = this.J;
            n nVar = this.g0;
            if (!z10) {
                nVar.c(motionEvent.getActionIndex(), motionEvent);
                getParent().requestDisallowInterceptTouchEvent(false);
                this.r0 = false;
                return false;
            }
            int x10 = (int) motionEvent.getX(motionEvent.getActionIndex());
            int y3 = (int) motionEvent.getY(motionEvent.getActionIndex());
            int actionMasked = motionEvent.getActionMasked();
            RectF rectF = this.H0;
            if (actionMasked == 0) {
                this.g1 = System.currentTimeMillis();
                getParent().requestDisallowInterceptTouchEvent(true);
                if (!nVar.a(x10, y3, motionEvent.getActionIndex())) {
                    this.c1 = x10;
                    this.e1 = x10;
                    this.d1 = y3;
                    this.f1 = y3;
                    if (rectF.contains(x10, y3)) {
                        if (this.s0 < 0 || !this.i1) {
                            this.r0 = true;
                            C(x10, y3);
                            return true;
                        }
                    }
                }
                return true;
            }
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    int i10 = x10 - this.c1;
                    int i11 = y3 - this.d1;
                    if (nVar.n[0] != null || nVar.c) {
                        boolean b10 = nVar.b(x10, motionEvent.getActionIndex());
                        if (motionEvent.getPointerCount() > 1) {
                            int x11 = (int) motionEvent.getX(1);
                            motionEvent.getY(1);
                            nVar.b(x11, 1);
                        }
                        getParent().requestDisallowInterceptTouchEvent(b10);
                        return true;
                    }
                    boolean z11 = this.r0;
                    int i12 = this.A0;
                    if (z11) {
                        boolean z12 = (this.h1 && System.currentTimeMillis() - this.g1 > 200) || Math.abs(i10) > Math.abs(i11) || Math.abs(i11) < i12;
                        this.c1 = x10;
                        this.d1 = y3;
                        getParent().requestDisallowInterceptTouchEvent(z12);
                        C(x10, y3);
                        return true;
                    }
                    if (rectF.contains(this.e1, this.f1)) {
                        int i13 = this.e1 - x10;
                        int i14 = this.f1 - y3;
                        if (Math.sqrt((i14 * i14) + (i13 * i13)) > i12 || System.currentTimeMillis() - this.g1 > 200) {
                            this.r0 = true;
                            C(x10, y3);
                            return true;
                        }
                    }
                    return true;
                }
                if (actionMasked != 3) {
                    if (actionMasked == 5) {
                        return nVar.a(x10, y3, motionEvent.getActionIndex());
                    }
                    if (actionMasked == 6) {
                        nVar.c(motionEvent.getActionIndex(), motionEvent);
                        return true;
                    }
                }
            }
            if (!nVar.c(motionEvent.getActionIndex(), motionEvent)) {
                if (rectF.contains(this.e1, this.f1) && !this.r0) {
                    c(false);
                }
                l[] lVarArr = nVar.n;
                l lVar = lVarArr[0];
                if (lVar != null && (valueAnimator2 = lVar.e) != null) {
                    valueAnimator2.cancel();
                }
                l lVar2 = lVarArr[1];
                if (lVar2 != null && (valueAnimator = lVar2.e) != null) {
                    valueAnimator.cancel();
                }
                lVarArr[0] = null;
                lVarArr[1] = null;
                I();
                getParent().requestDisallowInterceptTouchEvent(false);
                this.r0 = false;
                y();
                invalidate();
                E(r(this.F, this.G), this.P0 ? s(this.F, this.G) : 0L, true, true, false);
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
    public void p(Canvas canvas, dg.e eVar) {
        float f7;
        int i10;
        int i11;
        TextPaint textPaint;
        dg.e eVar2;
        int length = eVar.a.length;
        float f10 = 1.0f;
        if (length > 2) {
            float f11 = (r0[1] - r0[0]) / (this.w - this.x);
            if (f11 < 0.1d) {
                f7 = f11 / 0.1f;
                i10 = this.y0;
                if (i10 != 2) {
                    f10 = 1.0f - this.z0.f;
                } else if (i10 == 1) {
                    f10 = this.z0.f;
                } else if (i10 == 3) {
                    f10 = this.z0.f;
                }
                this.L.setAlpha((int) ((this.n / 255.0f) * eVar.f * f10 * f7));
                int E = (int) c3.i0.E(eVar.f, this.f, f10, f7);
                TextPaint textPaint2 = this.N;
                textPaint2.setAlpha(E);
                int E2 = (int) c3.i0.E(eVar.f, this.f, f10, f7);
                TextPaint textPaint3 = this.O;
                textPaint3.setAlpha(E2);
                int measuredHeight = getMeasuredHeight() - this.s;
                int i12 = n1;
                int i13 = measuredHeight - i12;
                int textSize = (int) (i12 - textPaint2.getTextSize());
                i11 = 1 ^ (this.P0 ? 1 : 0);
                while (i11 < length) {
                    float measuredHeight2 = getMeasuredHeight() - this.s;
                    float f12 = eVar.a[i11];
                    float f13 = this.x;
                    float f14 = ((int) (measuredHeight2 - (((f12 - f13) / (this.w - f13)) * i13))) - textSize;
                    float f15 = k1;
                    dg.e eVar3 = eVar;
                    int i14 = i11;
                    Canvas canvas2 = canvas;
                    eVar3.a(canvas2, 0, i14, f15, f14, textPaint2);
                    if (eVar3.c != null) {
                        float measuredWidth = getMeasuredWidth() - f15;
                        textPaint = textPaint3;
                        eVar2 = eVar3;
                        eVar2.a(canvas2, 1, i14, measuredWidth, f14, textPaint);
                    } else {
                        textPaint = textPaint3;
                        eVar2 = eVar3;
                    }
                    i11 = i14 + 1;
                    eVar = eVar2;
                    canvas = canvas2;
                    textPaint3 = textPaint;
                }
            }
        }
        f7 = 1.0f;
        i10 = this.y0;
        if (i10 != 2) {
        }
        this.L.setAlpha((int) ((this.n / 255.0f) * eVar.f * f10 * f7));
        int E3 = (int) c3.i0.E(eVar.f, this.f, f10, f7);
        TextPaint textPaint22 = this.N;
        textPaint22.setAlpha(E3);
        int E22 = (int) c3.i0.E(eVar.f, this.f, f10, f7);
        TextPaint textPaint32 = this.O;
        textPaint32.setAlpha(E22);
        int measuredHeight3 = getMeasuredHeight() - this.s;
        int i122 = n1;
        int i132 = measuredHeight3 - i122;
        int textSize2 = (int) (i122 - textPaint22.getTextSize());
        i11 = 1 ^ (this.P0 ? 1 : 0);
        while (i11 < length) {
        }
    }

    public long r(int i10, int i11) {
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        long j10 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            if (((dg.g) arrayList.get(i12)).n) {
                long j02 = ((dg.g) arrayList.get(i12)).a.b.j0(i10, i11);
                if (j02 > j10) {
                    j10 = j02;
                }
            }
        }
        return j10;
    }

    public long s(int i10, int i11) {
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        long j10 = Long.MAX_VALUE;
        for (int i12 = 0; i12 < size; i12++) {
            if (((dg.g) arrayList.get(i12)).n) {
                long n02 = ((dg.g) arrayList.get(i12)).a.b.n0(i10, i11);
                if (n02 < j10) {
                    j10 = n02;
                }
            }
        }
        return j10;
    }

    public void setDateSelectionListener(g gVar) {
        this.Q0 = gVar;
    }

    public void setHeader(dg.d dVar) {
        this.j1 = dVar;
    }

    public void setLandscape(boolean z10) {
        this.I = z10;
    }

    public void t() {
        this.L.setStrokeWidth(1.0f);
        this.M.setStrokeWidth(l1);
        TextPaint textPaint = this.N;
        float f7 = m1;
        textPaint.setTextSize(f7);
        TextPaint textPaint2 = this.O;
        textPaint2.setTextSize(f7);
        textPaint2.setTextAlign(Paint.Align.RIGHT);
        TextPaint textPaint3 = this.P;
        textPaint3.setTextSize(f7);
        textPaint3.setTextAlign(Paint.Align.CENTER);
        float N = i0.N(6.0f);
        Paint paint = this.S;
        paint.setStrokeWidth(N);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint.setStrokeCap(cap);
        setLayerType(2, null);
        setWillNotDraw(false);
        dg.f g10 = g();
        this.t0 = g10;
        g10.setVisibility(8);
        Paint paint2 = this.U;
        paint2.setColor(-1);
        paint2.setStrokeWidth(i0.N(3.0f));
        paint2.setStrokeCap(cap);
        G();
    }

    public void u() {
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            dg.g gVar = (dg.g) obj;
            boolean z10 = gVar.n;
            cg.a aVar = gVar.a;
            if (z10) {
                long j10 = aVar.e;
                if (j10 > this.j0) {
                    this.j0 = j10;
                }
            }
            if (z10) {
                long j11 = aVar.f;
                if (j11 < this.k0) {
                    this.k0 = j11;
                }
            }
            float f7 = this.j0;
            float f10 = this.k0;
            if (f7 == f10) {
                this.j0 = f7 + 1.0f;
                this.k0 = f10 - 1.0f;
            }
        }
    }

    public final void v() {
        int measuredHeight = getMeasuredHeight() - this.s;
        float f7 = this.y;
        if (f7 == 0.0f || measuredHeight == 0) {
            return;
        }
        this.E = (f7 / measuredHeight) * m1;
    }

    public final void w() {
        if (getMeasuredHeight() <= 0 || getMeasuredWidth() <= 0) {
            return;
        }
        float measuredWidth = getMeasuredWidth();
        float f7 = k1;
        this.C0 = measuredWidth - (2.0f * f7);
        this.D0 = f7;
        float measuredWidth2 = getMeasuredWidth() - (this.I ? s1 : f7);
        this.E0 = measuredWidth2;
        float f10 = measuredWidth2 - this.D0;
        this.F0 = f10;
        n nVar = this.g0;
        this.G0 = f10 / (nVar.l - nVar.k);
        I();
        this.s = i0.L(100.0f);
        this.H0.set(this.D0 - f7, 0.0f, this.E0 + f7, getMeasuredHeight() - this.s);
        if (this.h0 != null) {
            this.o0 = (int) (i0.L(20.0f) / (this.C0 / this.h0.a.length));
        }
        v();
    }

    public final void x(float f7) {
        int i10;
        cg.b bVar = this.h0;
        if (bVar == null || (i10 = this.s0) < 0) {
            return;
        }
        long[] jArr = bVar.a;
        if (i10 >= jArr.length || !this.u0) {
            return;
        }
        this.t0.c(i10, jArr[i10], this.d, false, bVar.j, bVar.h);
        this.t0.setVisibility(0);
        this.t0.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), TLObject.FLAG_31));
        float f10 = (this.h0.b[this.s0] * this.G0) - f7;
        float width = f10 > (this.D0 + this.F0) / 2.0f ? f10 - (this.t0.getWidth() + r1) : f10 + x1;
        if (width < 0.0f) {
            width = 0.0f;
        } else if (this.t0.getMeasuredWidth() + width > getMeasuredWidth()) {
            width = getMeasuredWidth() - this.t0.getMeasuredWidth();
        }
        this.t0.setTranslationX(width);
    }

    public void z() {
        ValueAnimator valueAnimator;
        ValueAnimator valueAnimator2;
        ValueAnimator valueAnimator3;
        A(true, true, true);
        ArrayList arrayList = this.d;
        this.m0 = arrayList.size();
        int i10 = 0;
        while (true) {
            this.n0 = i10;
            int i11 = this.n0;
            if (i11 >= this.m0) {
                break;
            }
            final dg.g gVar = (dg.g) arrayList.get(i11);
            if (gVar.n && (valueAnimator3 = gVar.i) != null) {
                valueAnimator3.cancel();
            }
            if (!gVar.n && (valueAnimator2 = gVar.h) != null) {
                valueAnimator2.cancel();
            }
            if (gVar.n && gVar.o != 1.0f) {
                ValueAnimator valueAnimator4 = gVar.h;
                if (valueAnimator4 == null || !valueAnimator4.isRunning()) {
                    final int i12 = 0;
                    ValueAnimator e = e(gVar.o, 1.0f, new ValueAnimator.AnimatorUpdateListener(this) { // from class: bg.c
                        public final /* synthetic */ i b;

                        {
                            this.b = this;
                        }

                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator5) {
                            switch (i12) {
                                case 0:
                                    i iVar = this.b;
                                    iVar.getClass();
                                    gVar.o = ((Float) valueAnimator5.getAnimatedValue()).floatValue();
                                    iVar.H = true;
                                    iVar.invalidate();
                                    break;
                                default:
                                    i iVar2 = this.b;
                                    iVar2.getClass();
                                    gVar.o = ((Float) valueAnimator5.getAnimatedValue()).floatValue();
                                    iVar2.H = true;
                                    iVar2.invalidate();
                                    break;
                            }
                        }
                    });
                    gVar.h = e;
                    e.start();
                } else {
                    i10 = this.n0 + 1;
                }
            }
            if (!gVar.n && gVar.o != 0.0f && ((valueAnimator = gVar.i) == null || !valueAnimator.isRunning())) {
                final int i13 = 1;
                ValueAnimator e7 = e(gVar.o, 0.0f, new ValueAnimator.AnimatorUpdateListener(this) { // from class: bg.c
                    public final /* synthetic */ i b;

                    {
                        this.b = this;
                    }

                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator5) {
                        switch (i13) {
                            case 0:
                                i iVar = this.b;
                                iVar.getClass();
                                gVar.o = ((Float) valueAnimator5.getAnimatedValue()).floatValue();
                                iVar.H = true;
                                iVar.invalidate();
                                break;
                            default:
                                i iVar2 = this.b;
                                iVar2.getClass();
                                gVar.o = ((Float) valueAnimator5.getAnimatedValue()).floatValue();
                                iVar2.H = true;
                                iVar2.invalidate();
                                break;
                        }
                    }
                });
                gVar.i = e7;
                e7.start();
            }
            i10 = this.n0 + 1;
        }
        K();
        if (this.u0) {
            dg.f fVar = this.t0;
            int i14 = this.s0;
            cg.b bVar = this.h0;
            fVar.c(i14, bVar.a[i14], arrayList, true, bVar.j, bVar.h);
        }
    }

    public void q(dg.k kVar) {
    }

    public void y() {
    }
}
