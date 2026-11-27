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

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public class jl0 extends ky4 implements snb {
    public static Path i0 = new Path();
    public int E;
    public int F;
    public int G;
    public int H;
    public float I;
    public float K;
    public int L;
    public int M;
    public hz4 P;
    public hz4 Q;
    public boolean R;
    public final il0 S;
    public dl0 T;
    public boolean U;
    public float V;
    public float W;
    public float X;
    public boolean Y;
    public int Z;
    public ctd a0;
    public boolean b0;
    public mz4 c0;
    public boolean d0;
    public final gl0 e0;
    public final mz4 f;
    public el0 f0;
    public fl0 g0;
    public final mz4 h;
    public hl0 h0;
    public final mz4 n;
    public mz4 r;
    public bl0 w;
    public int x;
    public int y;
    public boolean s = true;
    public float J = -1.0f;
    public int N = yob.b;
    public final kz4 O = new kz4();

    public jl0(mz4 mz4Var, mz4 mz4Var2, mz4 mz4Var3) {
        il0 il0Var = new il0();
        this.S = il0Var;
        this.X = 1.0f;
        this.Z = vy4.G;
        this.b0 = true;
        this.e0 = new gl0(this);
        this.f = mz4Var;
        this.h = mz4Var2;
        this.n = mz4Var3;
        lz4 lz4Var = this.b;
        if (!lz4Var.a) {
            mz4Var = mz4Var3;
        } else if (!this.Y || !lz4Var.b || Build.VERSION.SDK_INT < 33) {
            mz4Var = mz4Var2;
        }
        this.r = mz4Var;
        il0Var.i = hl.N(1.0f);
        il0Var.j = hl.N(0.6666667f);
        this.V = hl.N(1.0f);
        this.W = hl.N(0.33333334f);
    }

    public static void l(Outline outline, Rect rect, float[] fArr) {
        if (zwe.a(fArr)) {
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

    public static mz4 v(mz4 mz4Var) {
        while (mz4Var instanceof sz4) {
            mz4Var = ((sz4) mz4Var).a;
        }
        return mz4Var;
    }

    @Override // ky4
    public final void a() {
        ctd o = o();
        hl0 hl0Var = this.h0;
        if (o != hl0Var || hl0Var == null) {
            return;
        }
        hl0Var.e();
    }

    @Override // ky4
    public final void b(Rect rect) {
        rect.set(this.S.m);
    }

    @Override // ky4
    public final int c() {
        return this.L;
    }

    @Override // ky4
    public final int d() {
        return this.M;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        mz4 mz4Var;
        int i = yob.b;
        if (this.N != i) {
            this.N = i;
            try {
                updateColors();
            } catch (Exception e) {
                cc4.g(e, true);
            }
        }
        int i2 = vy4.G;
        if (this.Z != i2) {
            this.Z = i2;
            lz4 f = vy4.f();
            if (!Objects.equals(this.b, f)) {
                this.b = f;
                g(f);
            }
        }
        il0 il0Var = this.S;
        if (il0Var.m.isEmpty()) {
            return;
        }
        ctd o = o();
        mz4 mz4Var2 = this.r;
        if (o == this.h0 && !canvas.isHardwareAccelerated()) {
            mz4 v = v(v(this.r));
            if (Build.VERSION.SDK_INT >= 29 && (v instanceof rz4) && (mz4Var = ((rz4) v).a) != null) {
                v = v(mz4Var);
            }
            mz4Var2 = v;
            o = k(mz4Var2);
        }
        o.b(canvas, mz4Var2);
        float f2 = this.c / 255.0f;
        Rect rect = il0Var.m;
        boolean e2 = il0Var.e();
        kz4 kz4Var = this.O;
        if (!e2) {
            kz4Var.a(canvas, rect.left, rect.top, rect.right, rect.bottom, il0Var.b, m(), f2);
            return;
        }
        Path path = il0Var.k;
        long j = il0Var.x;
        float f3 = rect.left;
        float f4 = rect.top;
        float f5 = rect.right;
        float f6 = rect.bottom;
        hz4 m = m();
        kz4Var.getClass();
        float f7 = f6 - f4;
        if (f5 - f3 < 1.0f || f7 < 1.0f || f2 <= 0.0f) {
            return;
        }
        if (m.a()) {
            kz4Var.d(canvas, 2, path, j, f3, f4, f5, f6, m, m.f, f2);
        }
        if (m.a > 0.05f) {
            int i3 = m.b;
            if ((i3 >>> 24) != 0) {
                kz4Var.d(canvas, 0, path, j, f3, f4, f5, f6, m, i3, f2);
            }
        }
        if (m.c > 0.05f) {
            int i4 = m.d;
            if ((i4 >>> 24) != 0) {
                kz4Var.d(canvas, 1, path, j, f3, f4, f5, f6, m, i4, f2);
            }
        }
        if (m.k > 0.05f) {
            int i5 = m.l;
            if ((i5 >>> 24) != 0) {
                kz4Var.d(canvas, 3, path, j, f3, f4, f5, f6, m, i5, f2);
            }
        }
    }

    @Override // ky4
    public final boolean e() {
        ctd o = o();
        hl0 hl0Var = this.h0;
        return o != hl0Var || hl0Var == null || hl0Var.c();
    }

    @Override // ky4
    public final void f(int i) {
        hl0 hl0Var = this.h0;
        if (hl0Var != null) {
            hl0Var.f(i / 255.0f);
        }
    }

    @Override // ky4
    public final void g(lz4 lz4Var) {
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
        il0 il0Var = this.S;
        boolean e = il0Var.e();
        float[] fArr = il0Var.b;
        if (!e) {
            l(outline, il0Var.m, fArr);
        } else if (Build.VERSION.SDK_INT >= 30) {
            outline.setPath(il0Var.k);
        } else {
            RectF rectF = il0Var.s;
            outline.setRoundRect((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom, fArr[0]);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        il0 il0Var = this.S;
        int i = il0Var.d;
        rect.set(i, i, i, i);
        return il0Var.e;
    }

    @Override // ky4
    public final void h() {
        hl0 hl0Var = this.h0;
        if (hl0Var != null) {
            hl0Var.h = true;
        }
    }

    @Override // ky4
    public final boolean j() {
        ctd o = o();
        hl0 hl0Var = this.h0;
        return o == hl0Var && hl0Var != null;
    }

    public final ctd k(mz4 mz4Var) {
        mz4 v = v(mz4Var);
        if (Color.alpha(this.y) == 255 || (v instanceof oz4)) {
            return this.e0;
        }
        if (v instanceof nz4) {
            el0 el0Var = this.f0;
            if (el0Var != null) {
                return el0Var;
            }
            el0 el0Var2 = new el0(this);
            this.f0 = el0Var2;
            return el0Var2;
        }
        fl0 fl0Var = this.g0;
        if (fl0Var != null) {
            return fl0Var;
        }
        fl0 fl0Var2 = new fl0(this);
        this.g0 = fl0Var2;
        return fl0Var2;
    }

    public final hz4 m() {
        hz4 hz4Var;
        hz4 hz4Var2 = this.P;
        if (hz4Var2 != null) {
            return hz4Var2;
        }
        hz4 hz4Var3 = this.Q;
        if (hz4Var3 != null) {
            return hz4Var3;
        }
        boolean z = this.R;
        il0 il0Var = this.S;
        if (z) {
            float f = il0Var.i;
            int i = this.E;
            hz4Var = new hz4(0.0f, 0, 0.0f, 0, this.I, this.H, 1.0f, 1.0f, 1.0f, 0.0f, (f + il0Var.j) / 2.0f, vm2.f(0.5f, i, this.F));
        } else {
            hz4Var = new hz4(il0Var.i, this.E, il0Var.j, this.F, this.I, this.H, 1.0f, 1.0f, 1.0f, 0.0f);
        }
        this.Q = hz4Var;
        return hz4Var;
    }

    public final void n() {
        hl0 hl0Var = this.h0;
        if (hl0Var != null) {
            hl0Var.d();
        }
    }

    public final ctd o() {
        ctd ctdVar;
        if (this.b0) {
            lz4 lz4Var = this.b;
            mz4 mz4Var = !lz4Var.a ? this.n : (this.Y && lz4Var.b && Build.VERSION.SDK_INT >= 33) ? this.f : this.h;
            if (this.r != mz4Var) {
                this.r = mz4Var;
                hl0 hl0Var = this.h0;
                if (hl0Var != null) {
                    hl0Var.h = true;
                }
            }
        }
        mz4 v = v(this.r);
        boolean z = Color.alpha(this.y) == 255;
        ctd ctdVar2 = this.a0;
        if (ctdVar2 != null && !this.b0 && this.c0 == v && this.d0 == z) {
            return ctdVar2;
        }
        this.b0 = false;
        this.c0 = v;
        this.d0 = z;
        int i = Build.VERSION.SDK_INT;
        if (i < 29 || !(this.r instanceof kl0) || (v instanceof oz4) || (v instanceof nz4)) {
            ctdVar = k(v);
        } else {
            hl0 hl0Var2 = this.h0;
            ctdVar = hl0Var2;
            if (hl0Var2 == null) {
                hl0 hl0Var3 = new hl0(this);
                hl0Var3.g(this.s);
                hl0Var3.f(this.c / 255.0f);
                hl0Var3.d();
                this.h0 = hl0Var3;
                ctdVar = hl0Var3;
            }
        }
        hl0 hl0Var4 = this.h0;
        if (hl0Var4 != null) {
            hl0Var4.h(ctdVar == hl0Var4 && this.Y && this.b.b && i >= 33);
        }
        ctd ctdVar3 = this.a0;
        if (ctdVar3 != ctdVar && ctdVar3 != null) {
            ctdVar3.a();
        }
        this.a0 = ctdVar;
        return ctdVar;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        il0 il0Var = this.S;
        il0Var.a.set(rect);
        il0Var.a();
        n();
    }

    public final void p(bl0 bl0Var) {
        this.w = bl0Var;
        if (this.J < 0.0f) {
            this.J = this.V;
            this.K = this.W;
        }
        updateColors();
        if (bl0Var instanceof ol0) {
            ol0 ol0Var = (ol0) bl0Var;
            float f = ol0Var.f;
            float f2 = ol0Var.h;
            il0 il0Var = this.S;
            il0Var.i = f;
            il0Var.j = f2;
            this.Q = null;
            float c = ol0Var.c();
            float b = ol0Var.b();
            this.V = c;
            this.W = b;
        }
    }

    public final void q(int i) {
        il0 il0Var = this.S;
        if (il0Var.d != i) {
            il0Var.d = i;
            il0Var.a();
            n();
        }
    }

    public final void r(float f) {
        il0 il0Var = this.S;
        Arrays.fill(il0Var.b, f);
        Arrays.fill(il0Var.c, f);
        il0Var.a();
        n();
    }

    public final void s(float f, float f2, float f3, float f4) {
        il0 il0Var = this.S;
        float[] fArr = il0Var.b;
        fArr[1] = f;
        fArr[0] = f;
        fArr[3] = f2;
        fArr[2] = f2;
        fArr[5] = f3;
        fArr[4] = f3;
        fArr[7] = f4;
        fArr[6] = f4;
        il0Var.a();
        n();
    }

    public final void t(float f, float f2, float f3, float f4, boolean z) {
        il0 il0Var = this.S;
        float[] fArr = il0Var.b;
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
        float[] fArr2 = il0Var.c;
        fArr2[1] = f;
        fArr2[0] = f;
        fArr2[3] = f2;
        fArr2[2] = f2;
        fArr2[5] = f3;
        fArr2[4] = f3;
        fArr2[7] = f4;
        fArr2[6] = f4;
        il0Var.a();
        n();
    }

    public final void u(int i) {
        this.S.f = i;
        n();
    }

    @Override // ky4
    public final void updateColors() {
        this.N = yob.b;
        bl0 bl0Var = this.w;
        if (bl0Var != null) {
            if (bl0Var instanceof cl0) {
                ((cl0) bl0Var).d();
            }
            this.y = this.w.Q1();
            this.x = this.w.x1();
            this.E = this.w.X();
            this.F = this.w.x0();
            this.G = this.w.o1();
            this.H = this.w.m0();
            this.I = this.w.m1();
            bl0 bl0Var2 = this.w;
            if (bl0Var2 instanceof ol0) {
                ol0 ol0Var = (ol0) bl0Var2;
                float c = ol0Var.c();
                float b = ol0Var.b();
                this.V = c;
                this.W = b;
            } else if (bl0Var2.D0() >= 0.0f) {
                float D0 = this.w.D0();
                float B0 = this.w.B0();
                this.V = D0;
                this.W = B0;
            } else {
                float f = this.J;
                if (f >= 0.0f) {
                    float f2 = this.K;
                    this.V = f;
                    this.W = f2;
                }
            }
            this.Q = null;
            hl0 hl0Var = this.h0;
            if (hl0Var != null) {
                hl0Var.h = true;
            }
        }
    }

    @Override // snb
    public final void addColorKeys(HashSet hashSet) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
