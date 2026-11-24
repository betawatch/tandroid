// default package

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import j$.util.Objects;
import java.util.Arrays;
import java.util.HashSet;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public class im0 extends hy4 implements vlb {
    public static Path i0 = new Path();
    public int E;
    public int F;
    public int G;
    public int H;
    public float I;
    public float K;
    public int L;
    public int M;
    public dz4 P;
    public dz4 Q;
    public boolean R;
    public final hm0 S;
    public cm0 T;
    public boolean U;
    public float V;
    public float W;
    public float X;
    public boolean Y;
    public int Z;
    public pqd a0;
    public boolean b0;
    public iz4 c0;
    public boolean d0;
    public final fm0 e0;
    public final iz4 f;
    public dm0 f0;
    public em0 g0;
    public final iz4 h;
    public gm0 h0;
    public final iz4 n;
    public iz4 r;
    public am0 w;
    public int x;
    public int y;
    public boolean s = true;
    public float J = -1.0f;
    public int N = anb.b;
    public final gz4 O = new gz4();

    public im0(iz4 iz4Var, iz4 iz4Var2, iz4 iz4Var3) {
        hm0 hm0Var = new hm0();
        this.S = hm0Var;
        this.X = 1.0f;
        this.Z = sy4.G;
        this.b0 = true;
        this.e0 = new fm0(this);
        this.f = iz4Var;
        this.h = iz4Var2;
        this.n = iz4Var3;
        hz4 hz4Var = this.b;
        if (!hz4Var.a) {
            iz4Var = iz4Var3;
        } else if (!this.Y || !hz4Var.b || Build.VERSION.SDK_INT < 33) {
            iz4Var = iz4Var2;
        }
        this.r = iz4Var;
        hm0Var.i = gm.N(1.0f);
        hm0Var.j = gm.N(0.6666667f);
        this.V = gm.N(1.0f);
        this.W = gm.N(0.33333334f);
    }

    public static void l(Outline outline, Rect rect, float[] fArr) {
        if (kue.a(fArr)) {
            outline.setRoundRect(rect, Math.min(fArr[0], Math.min(rect.width(), rect.height()) / 2.0f));
            return;
        }
        Path path = i0;
        if (path == null) {
            i0 = new Path();
        } else {
            path.rewind();
        }
        i0.addRoundRect(rect.left, rect.top, rect.right, rect.bottom, fArr, Path.Direction.CW);
        outline.setConvexPath(i0);
    }

    public static iz4 v(iz4 iz4Var) {
        while (iz4Var instanceof oz4) {
            iz4Var = ((oz4) iz4Var).a;
        }
        return iz4Var;
    }

    @Override // hy4
    public final void a() {
        pqd o = o();
        gm0 gm0Var = this.h0;
        if (o != gm0Var || gm0Var == null) {
            return;
        }
        gm0Var.e();
    }

    @Override // hy4
    public final void b(Rect rect) {
        rect.set(this.S.m);
    }

    @Override // hy4
    public final int c() {
        return this.L;
    }

    @Override // hy4
    public final int d() {
        return this.M;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        iz4 iz4Var;
        int i = anb.b;
        if (this.N != i) {
            this.N = i;
            try {
                updateColors();
            } catch (Exception e) {
                fc4.g(e, true);
            }
        }
        int i2 = sy4.G;
        if (this.Z != i2) {
            this.Z = i2;
            hz4 f = sy4.f();
            if (!Objects.equals(this.b, f)) {
                this.b = f;
                g(f);
            }
        }
        hm0 hm0Var = this.S;
        if (hm0Var.m.isEmpty()) {
            return;
        }
        pqd o = o();
        iz4 iz4Var2 = this.r;
        if (o == this.h0 && !canvas.isHardwareAccelerated()) {
            iz4 v = v(v(this.r));
            if (Build.VERSION.SDK_INT >= 29 && (v instanceof nz4) && (iz4Var = ((nz4) v).a) != null) {
                v = v(iz4Var);
            }
            iz4Var2 = v;
            o = k(iz4Var2);
        }
        o.b(canvas, iz4Var2);
        float f2 = this.c / 255.0f;
        Rect rect = hm0Var.m;
        boolean e2 = hm0Var.e();
        gz4 gz4Var = this.O;
        if (!e2) {
            gz4Var.a(canvas, rect.left, rect.top, rect.right, rect.bottom, hm0Var.b, m(), f2);
            return;
        }
        Path path = hm0Var.k;
        long j = hm0Var.x;
        float f3 = rect.left;
        float f4 = rect.top;
        float f5 = rect.right;
        float f6 = rect.bottom;
        dz4 m = m();
        gz4Var.getClass();
        float f7 = f6 - f4;
        if (f5 - f3 < 1.0f || f7 < 1.0f || f2 <= 0.0f) {
            return;
        }
        if (m.a()) {
            gz4Var.d(canvas, 2, path, j, f3, f4, f5, f6, m, m.f, f2);
        }
        if (m.a > 0.05f) {
            int i3 = m.b;
            if ((i3 >>> 24) != 0) {
                gz4Var.d(canvas, 0, path, j, f3, f4, f5, f6, m, i3, f2);
            }
        }
        if (m.c > 0.05f) {
            int i4 = m.d;
            if ((i4 >>> 24) != 0) {
                gz4Var.d(canvas, 1, path, j, f3, f4, f5, f6, m, i4, f2);
            }
        }
        if (m.k > 0.05f) {
            int i5 = m.l;
            if ((i5 >>> 24) != 0) {
                gz4Var.d(canvas, 3, path, j, f3, f4, f5, f6, m, i5, f2);
            }
        }
    }

    @Override // hy4
    public final boolean e() {
        pqd o = o();
        gm0 gm0Var = this.h0;
        return o != gm0Var || gm0Var == null || gm0Var.c();
    }

    @Override // hy4
    public final void f(int i) {
        gm0 gm0Var = this.h0;
        if (gm0Var != null) {
            gm0Var.f(i / 255.0f);
        }
    }

    @Override // hy4
    public final void g(hz4 hz4Var) {
        this.b0 = true;
        updateColors();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        hm0 hm0Var = this.S;
        boolean e = hm0Var.e();
        float[] fArr = hm0Var.b;
        if (!e) {
            l(outline, hm0Var.m, fArr);
        } else if (Build.VERSION.SDK_INT >= 30) {
            outline.setPath(hm0Var.k);
        } else {
            RectF rectF = hm0Var.s;
            outline.setRoundRect((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom, fArr[0]);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        hm0 hm0Var = this.S;
        int i = hm0Var.d;
        rect.set(i, i, i, i);
        return hm0Var.e;
    }

    @Override // hy4
    public final void h() {
        gm0 gm0Var = this.h0;
        if (gm0Var != null) {
            gm0Var.h = true;
        }
    }

    @Override // hy4
    public final boolean j() {
        pqd o = o();
        gm0 gm0Var = this.h0;
        return o == gm0Var && gm0Var != null;
    }

    public final pqd k(iz4 iz4Var) {
        iz4 v = v(iz4Var);
        if (Color.alpha(this.y) == 255 || (v instanceof kz4)) {
            return this.e0;
        }
        if (v instanceof jz4) {
            dm0 dm0Var = this.f0;
            if (dm0Var != null) {
                return dm0Var;
            }
            dm0 dm0Var2 = new dm0(this);
            this.f0 = dm0Var2;
            return dm0Var2;
        }
        em0 em0Var = this.g0;
        if (em0Var != null) {
            return em0Var;
        }
        em0 em0Var2 = new em0(this);
        this.g0 = em0Var2;
        return em0Var2;
    }

    public final dz4 m() {
        dz4 dz4Var;
        dz4 dz4Var2 = this.P;
        if (dz4Var2 != null) {
            return dz4Var2;
        }
        dz4 dz4Var3 = this.Q;
        if (dz4Var3 != null) {
            return dz4Var3;
        }
        boolean z = this.R;
        hm0 hm0Var = this.S;
        if (z) {
            float f = hm0Var.i;
            int i = this.E;
            dz4Var = new dz4(0.0f, 0, 0.0f, 0, this.I, this.H, 1.0f, 1.0f, 1.0f, 0.0f, (f + hm0Var.j) / 2.0f, on2.f(0.5f, i, this.F));
        } else {
            dz4Var = new dz4(hm0Var.i, this.E, hm0Var.j, this.F, this.I, this.H, 1.0f, 1.0f, 1.0f, 0.0f);
        }
        this.Q = dz4Var;
        return dz4Var;
    }

    public final void n() {
        gm0 gm0Var = this.h0;
        if (gm0Var != null) {
            gm0Var.d();
        }
    }

    public final pqd o() {
        pqd pqdVar;
        if (this.b0) {
            hz4 hz4Var = this.b;
            iz4 iz4Var = !hz4Var.a ? this.n : (this.Y && hz4Var.b && Build.VERSION.SDK_INT >= 33) ? this.f : this.h;
            if (this.r != iz4Var) {
                this.r = iz4Var;
                gm0 gm0Var = this.h0;
                if (gm0Var != null) {
                    gm0Var.h = true;
                }
            }
        }
        iz4 v = v(this.r);
        boolean z = Color.alpha(this.y) == 255;
        pqd pqdVar2 = this.a0;
        if (pqdVar2 != null && !this.b0 && this.c0 == v && this.d0 == z) {
            return pqdVar2;
        }
        this.b0 = false;
        this.c0 = v;
        this.d0 = z;
        int i = Build.VERSION.SDK_INT;
        if (i < 29 || !(this.r instanceof jm0) || (v instanceof kz4) || (v instanceof jz4)) {
            pqdVar = k(v);
        } else {
            gm0 gm0Var2 = this.h0;
            pqdVar = gm0Var2;
            if (gm0Var2 == null) {
                gm0 gm0Var3 = new gm0(this);
                gm0Var3.g(this.s);
                gm0Var3.f(this.c / 255.0f);
                gm0Var3.d();
                this.h0 = gm0Var3;
                pqdVar = gm0Var3;
            }
        }
        gm0 gm0Var4 = this.h0;
        if (gm0Var4 != null) {
            gm0Var4.h(pqdVar == gm0Var4 && this.Y && this.b.b && i >= 33);
        }
        pqd pqdVar3 = this.a0;
        if (pqdVar3 != pqdVar && pqdVar3 != null) {
            pqdVar3.a();
        }
        this.a0 = pqdVar;
        return pqdVar;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        hm0 hm0Var = this.S;
        hm0Var.a.set(rect);
        hm0Var.a();
        n();
    }

    public final void p(am0 am0Var) {
        this.w = am0Var;
        if (this.J < 0.0f) {
            this.J = this.V;
            this.K = this.W;
        }
        updateColors();
        if (am0Var instanceof nm0) {
            nm0 nm0Var = (nm0) am0Var;
            float f = nm0Var.f;
            float f2 = nm0Var.h;
            hm0 hm0Var = this.S;
            hm0Var.i = f;
            hm0Var.j = f2;
            this.Q = null;
            float c = nm0Var.c();
            float b = nm0Var.b();
            this.V = c;
            this.W = b;
        }
    }

    public final void q(int i) {
        hm0 hm0Var = this.S;
        if (hm0Var.d != i) {
            hm0Var.d = i;
            hm0Var.a();
            n();
        }
    }

    public final void r(float f) {
        hm0 hm0Var = this.S;
        Arrays.fill(hm0Var.b, f);
        Arrays.fill(hm0Var.c, f);
        hm0Var.a();
        n();
    }

    public final void s(float f, float f2, float f3, float f4) {
        hm0 hm0Var = this.S;
        float[] fArr = hm0Var.b;
        fArr[1] = f;
        fArr[0] = f;
        fArr[3] = f2;
        fArr[2] = f2;
        fArr[5] = f3;
        fArr[4] = f3;
        fArr[7] = f4;
        fArr[6] = f4;
        hm0Var.a();
        n();
    }

    public final void t(float f, float f2, float f3, float f4, boolean z) {
        hm0 hm0Var = this.S;
        float[] fArr = hm0Var.b;
        fArr[1] = f;
        fArr[0] = f;
        fArr[3] = f2;
        fArr[2] = f2;
        float f5 = z ? 0.0f : f3;
        fArr[5] = f5;
        fArr[4] = f5;
        float f6 = z ? 0.0f : f4;
        fArr[7] = f6;
        fArr[6] = f6;
        float[] fArr2 = hm0Var.c;
        fArr2[1] = f;
        fArr2[0] = f;
        fArr2[3] = f2;
        fArr2[2] = f2;
        fArr2[5] = f3;
        fArr2[4] = f3;
        fArr2[7] = f4;
        fArr2[6] = f4;
        hm0Var.a();
        n();
    }

    public final void u(int i) {
        this.S.f = i;
        n();
    }

    @Override // hy4, vlb
    public final void updateColors() {
        this.N = anb.b;
        am0 am0Var = this.w;
        if (am0Var != null) {
            if (am0Var instanceof bm0) {
                ((bm0) am0Var).d();
            }
            this.y = this.w.K1();
            this.x = this.w.r1();
            this.E = this.w.V();
            this.F = this.w.u0();
            this.G = this.w.h1();
            this.H = this.w.g0();
            this.I = this.w.g1();
            am0 am0Var2 = this.w;
            if (am0Var2 instanceof nm0) {
                nm0 nm0Var = (nm0) am0Var2;
                float c = nm0Var.c();
                float b = nm0Var.b();
                this.V = c;
                this.W = b;
            } else if (am0Var2.y0() >= 0.0f) {
                float y0 = this.w.y0();
                float w0 = this.w.w0();
                this.V = y0;
                this.W = w0;
            } else {
                float f = this.J;
                if (f >= 0.0f) {
                    float f2 = this.K;
                    this.V = f;
                    this.W = f2;
                }
            }
            this.Q = null;
            gm0 gm0Var = this.h0;
            if (gm0Var != null) {
                gm0Var.h = true;
            }
        }
    }

    @Override // vlb
    public final void addColorKeys(HashSet hashSet) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
