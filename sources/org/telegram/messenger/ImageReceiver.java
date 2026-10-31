package org.telegram.messenger;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.ComposeShader;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.bi0;
import org.telegram.ui.Components.cc0;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.v80;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public class ImageReceiver implements us, org.telegram.ui.Components.l5 {
    public static final PorterDuffColorFilter G1;
    public static final PorterDuffColorFilter H1;
    public static final float[] I1;
    public boolean A0;
    public boolean A1;
    public boolean B0;
    public Drawable C0;
    public int C1;
    public int D;
    public String D0;
    public xa.n D1;
    public oc E;
    public BitmapShader E0;
    public th.b3 E1;
    public Object F;
    public boolean F0;
    public boolean F1;
    public Bitmap G;
    public boolean G0;
    public BitmapShader H;
    public TLRPC.Document H0;
    public ComposeShader I;
    public boolean I0;
    public Bitmap J;
    public boolean J0;
    public BitmapShader K;
    public float K0;
    public Canvas L;
    public float L0;
    public Paint M;
    public float M0;
    public ic N;
    public float N0;
    public ic O;
    public float O0;
    public String P;
    public String Q;
    public int R;
    public boolean R0;
    public Drawable S;
    public boolean S0;
    public BitmapShader T;
    public boolean T0;
    public int U;
    public boolean U0;
    public int V;
    public ic W;
    public String X;
    public String Y;
    public Integer Y0;
    public int Z;
    public List a;
    public Drawable a0;
    public boolean b;
    public BitmapShader b0;
    public ArrayList c;
    public BitmapShader c0;
    public int d0;
    public View e;
    public int e0;
    public int e1;
    public int f;
    public ic f0;
    public boolean f1;
    public String g0;
    public mc g1;
    public Object h;
    public String h0;
    public float h1;
    public int i0;
    public Drawable j0;
    public long j1;
    public BitmapShader k0;
    public boolean l1;
    public Drawable m0;
    public boolean m1;
    public boolean n;
    public String n0;
    public boolean o0;
    public ColorFilter o1;
    public int p0;
    public boolean p1;
    public long q0;
    public long q1;
    public boolean r;
    public int r0;
    public long r1;
    public long s;
    public float t1;
    public int u1;
    public boolean v0;
    public String v1;
    public boolean w0;
    public int x;
    public boolean x1;
    public boolean y;
    public boolean y1;
    public boolean z0;
    public int w = 1;
    public boolean l0 = true;
    public boolean s0 = true;
    public boolean t0 = true;
    public boolean u0 = true;
    public int x0 = 1;
    public int y0 = -1;
    public final RectF P0 = new RectF();
    public boolean Q0 = true;
    public boolean V0 = true;
    public final int[] W0 = new int[4];
    public boolean X0 = true;
    public final RectF a1 = new RectF();
    public final Matrix b1 = new Matrix();
    public final Path c1 = new Path();
    public float d1 = 1.0f;
    public float i1 = 1.0f;
    public byte k1 = 1;
    public float n1 = 0.05f;
    public int s1 = zs.g2;
    public final ArrayList w1 = new ArrayList();
    public boolean z1 = false;
    public boolean B1 = true;
    public final Paint Z0 = new Paint(3);
    public int d = d20.s0;

    static {
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        G1 = new PorterDuffColorFilter(-2236963, mode);
        H1 = new PorterDuffColorFilter(-4473925, mode);
        I1 = new float[8];
    }

    public ImageReceiver(View view) {
        this.e = view;
    }

    public final float A() {
        return this.L0 + this.N0;
    }

    public final void A0(RectF rectF) {
        if (rectF != null) {
            this.K0 = rectF.left;
            this.L0 = rectF.top;
            this.M0 = rectF.width();
            this.N0 = rectF.height();
        }
    }

    public final bi0 B() {
        Drawable drawable = this.j0;
        if (drawable instanceof bi0) {
            return (bi0) drawable;
        }
        Drawable drawable2 = this.S;
        if (drawable2 instanceof bi0) {
            return (bi0) drawable2;
        }
        Drawable drawable3 = this.a0;
        if (drawable3 instanceof bi0) {
            return (bi0) drawable3;
        }
        Drawable drawable4 = this.m0;
        if (drawable4 instanceof bi0) {
            return (bi0) drawable4;
        }
        return null;
    }

    public final void B0(int i10) {
        this.M0 = i10;
    }

    public final int C() {
        return this.U;
    }

    public final void C0(float f7) {
        this.K0 = f7;
    }

    public final int[] D() {
        return this.W0;
    }

    public final void D0(float f7) {
        this.L0 = f7;
    }

    public final int[] E() {
        if (this.V0) {
            return this.W0;
        }
        return null;
    }

    public final void E0(int i10) {
        this.x = i10;
        if (this.x1) {
            this.D = zs.e().p & (~this.x);
        }
    }

    public final Drawable F() {
        return this.m0;
    }

    public final void F0(long j10, long j11) {
        this.q1 = j10;
        this.r1 = j11;
        Drawable drawable = this.j0;
        if (drawable instanceof org.telegram.ui.Components.s5) {
            ((org.telegram.ui.Components.s5) drawable).C(j10, j11);
        }
    }

    public final int G(int i10) {
        return i10 == 1 ? this.Z : i10 == 3 ? this.i0 : this.R;
    }

    public final void G0(int i10, int i11, boolean z10) {
        while (i10 < 0) {
            i10 += 360;
        }
        while (i10 > 360) {
            i10 -= 360;
        }
        this.d0 = i10;
        this.U = i10;
        this.e0 = i11;
        this.V = i11;
        this.f1 = z10;
    }

    public final boolean H() {
        return this.Q0;
    }

    public final void H0(View view) {
        this.e = view;
        org.telegram.ui.Components.s5 m10 = m();
        if (m10 == null || !this.x1) {
            return;
        }
        View view2 = this.e;
        if (m10.r0 != null) {
            return;
        }
        m10.r0 = new WeakReference(view2);
    }

    public final boolean I() {
        return (this.S == null && this.a0 == null && this.m0 == null && this.j0 == null) ? false : true;
    }

    public final void I0(int i10) {
        this.e1 = i10;
    }

    public final boolean J() {
        return (this.S == null && this.j0 == null) ? false : true;
    }

    public final void J0(int i10) {
        L0(new int[]{i10, i10, i10, i10});
    }

    public final boolean K() {
        return (this.S == null && this.j0 == null && this.a0 == null && this.m0 == null && this.Q == null && this.h0 == null) ? false : true;
    }

    public final void K0(int i10, int i11, int i12, int i13) {
        L0(new int[]{i10, i11, i12, i13});
    }

    public final boolean L() {
        return (this.S == null && this.j0 == null && !(this.m0 instanceof g61)) ? false : true;
    }

    public void L0(int[] iArr) {
        int i10 = iArr[0];
        this.X0 = true;
        int i11 = 0;
        boolean z10 = false;
        while (true) {
            int[] iArr2 = this.W0;
            if (i11 >= iArr2.length) {
                break;
            }
            int i12 = iArr2[i11];
            int i13 = iArr[i11];
            if (i12 != i13) {
                z10 = true;
            }
            if (i10 != i13) {
                this.X0 = false;
            }
            iArr2[i11] = i13;
            i11++;
        }
        if (z10) {
            Drawable drawable = this.S;
            if (drawable != null && this.T == null) {
                R0(drawable);
            }
            Drawable drawable2 = this.j0;
            if (drawable2 != null && this.k0 == null) {
                R0(drawable2);
            }
            Drawable drawable3 = this.a0;
            if (drawable3 != null) {
                R0(drawable3);
            }
            Drawable drawable4 = this.m0;
            if (drawable4 != null) {
                R0(drawable4);
            }
        }
    }

    public final boolean M() {
        org.telegram.ui.Components.s5 m10 = m();
        return m10 != null && m10.b0;
    }

    public final void M0() {
        if (!this.V0) {
            this.V0 = true;
            Drawable drawable = this.S;
            if (drawable != null && this.T == null) {
                R0(drawable);
            }
            Drawable drawable2 = this.j0;
            if (drawable2 != null && this.k0 == null) {
                R0(drawable2);
            }
            Drawable drawable3 = this.a0;
            if (drawable3 != null) {
                R0(drawable3);
            }
            Drawable drawable4 = this.m0;
            if (drawable4 != null) {
                R0(drawable4);
            }
        }
    }

    public final boolean N() {
        return (!this.A0 || this.C0 == null || this.B0) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void N0(Drawable drawable) {
        org.telegram.ui.Components.n6 n6Var;
        Drawable drawable2 = this.m0;
        if (drawable == drawable2) {
            return;
        }
        if (!(drawable2 instanceof org.telegram.ui.Components.n6)) {
            n6Var = null;
        } else if (drawable2.equals(drawable)) {
            return;
        } else {
            n6Var = (org.telegram.ui.Components.n6) this.m0;
        }
        this.m0 = drawable;
        if (this.x1 && (drawable instanceof org.telegram.ui.Components.n6)) {
            ((org.telegram.ui.Components.n6) drawable).c(this);
        }
        if (!this.x1 || n6Var == null) {
            return;
        }
        n6Var.b(this);
    }

    public final boolean O(float f7, float f10) {
        float f11 = this.K0;
        if (f7 < f11 || f7 > f11 + this.M0) {
            return false;
        }
        float f12 = this.L0;
        return f10 >= f12 && f10 <= f12 + this.N0;
    }

    public final void O0(boolean z10, boolean z11) {
        if (this.Q0 == z10) {
            return;
        }
        this.Q0 = z10;
        if (z11) {
            invalidate();
            th.b3 b3Var = this.E1;
            if (b3Var != null) {
                b3Var.run();
            }
        }
    }

    public final boolean P() {
        if (!this.x1) {
            this.x1 = true;
            this.D = zs.e().p & (~this.x);
            boolean z10 = this.y;
            int i10 = zs.j1;
            if (!z10) {
                xa.n nVar = this.D1;
                if (nVar != null) {
                    nVar.a();
                    this.D1 = null;
                }
                xa.n nVar2 = (xa.n) new ys(zs.e(), this).b;
                nVar2.e(zs.m4);
                nVar2.e(i10);
                nVar2.e(zs.k1);
                this.D1 = nVar2;
            }
            if (Y()) {
                return true;
            }
            bi0 B = B();
            if (B != null) {
                B.I0.add(this);
                B.E = this.s0;
            }
            if (B != null && this.u0 && (!B.z() || this.D == 0)) {
                B.start();
            }
            org.telegram.ui.Components.s5 m10 = m();
            if (m10 != null) {
                m10.e(this);
            }
            if (m10 != null && this.t0 && this.D == 0) {
                m10.j();
                invalidate();
            }
            org.telegram.ui.Components.f5 l4 = l();
            if (l4 != null) {
                l4.b(this);
            }
            if (zs.e().g()) {
                didReceivedNotification(i10, this.d, 512);
            }
            Object obj = this.m0;
            if (obj instanceof org.telegram.ui.Components.n6) {
                ((org.telegram.ui.Components.n6) obj).c(this);
            }
            if (this.c != null) {
                for (int i11 = 0; i11 < this.c.size(); i11++) {
                    ((lc) this.c.get(i11)).a(this);
                }
            }
        }
        return false;
    }

    public final void P0(boolean z10) {
        org.telegram.ui.Components.s5 m10 = m();
        if (m10 != null) {
            boolean z11 = this.v0;
            if (!m10.n0) {
                m10.v0 = z11;
            }
            m10.start();
            return;
        }
        bi0 B = B();
        if (B == null || B.k0) {
            return;
        }
        B.H(z10);
    }

    public final void Q(Drawable drawable) {
        if (drawable == this.j0 && this.h0 != null) {
            hc.D().Q(this.h0);
            this.h0 = null;
        } else if (drawable == this.S && this.Q != null) {
            hc.D().Q(this.Q);
            this.Q = null;
        } else if (drawable == this.a0 && this.Y != null) {
            hc.D().Q(this.Y);
            this.Y = null;
        }
        u0(this.f0, this.g0, this.O, this.P, this.W, this.X, this.a0, this.q0, this.n0, this.h, this.r0);
    }

    public final void Q0() {
        org.telegram.ui.Components.s5 m10 = m();
        if (m10 != null) {
            m10.stop();
            return;
        }
        bi0 B = B();
        if (B != null) {
            B.stop();
        }
    }

    public final void R() {
        xa.n nVar;
        if (this.x1) {
            this.x1 = false;
            ic icVar = this.O;
            if (icVar != null || this.f0 != null || this.W != null || this.m0 != null) {
                if (this.E == null) {
                    this.E = new oc();
                }
                oc ocVar = this.E;
                ocVar.e = this.f0;
                ocVar.f = this.g0;
                ocVar.a = icVar;
                ocVar.b = this.P;
                ocVar.c = this.W;
                ocVar.d = this.X;
                ocVar.g = this.m0;
                ocVar.h = this.q0;
                ocVar.k = this.n0;
                ocVar.i = this.r0;
                ocVar.j = this.h;
            }
            if (!this.y && (nVar = this.D1) != null) {
                nVar.a();
                this.D1 = null;
            }
            Object obj = this.m0;
            if (obj instanceof org.telegram.ui.Components.n6) {
                ((org.telegram.ui.Components.n6) obj).b(this);
            }
            if (this.m0 != null) {
                N0(null);
                this.c0 = null;
            }
            f();
            this.Z0.setShader(null);
            if (this.e1 == 0) {
                this.t1 = 0.0f;
            }
            org.telegram.ui.Components.f5 l4 = l();
            if (l4 != null) {
                l4.o(this);
            }
            org.telegram.ui.Components.s5 m10 = m();
            if (m10 != null) {
                m10.v(this);
            }
            bi0 B = B();
            if (B != null) {
                B.F(this);
            }
            if (this.c != null) {
                for (int i10 = 0; i10 < this.c.size(); i10++) {
                    ArrayList arrayList = ((th.t7) ((lc) this.c.get(i10))).a;
                    if (arrayList != null) {
                        for (int i11 = 0; i11 < arrayList.size(); i11++) {
                            ((th.p7) arrayList.get(i11)).b(false);
                        }
                    }
                }
            }
        }
    }

    public final void R0(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        int[] E = E();
        if (!(drawable instanceof org.telegram.ui.Components.up)) {
            if (!(drawable instanceof BitmapDrawable) && !(drawable instanceof org.telegram.ui.Components.r8)) {
                f0(drawable, null);
                return;
            }
            if (drawable instanceof org.telegram.ui.Components.r8) {
                ((org.telegram.ui.Components.r8) drawable).r = E[0];
                return;
            }
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            if (bitmapDrawable instanceof bi0) {
                return;
            }
            if (bitmapDrawable instanceof org.telegram.ui.Components.s5) {
                ((org.telegram.ui.Components.s5) drawable).B(E);
                return;
            } else {
                if (bitmapDrawable.getBitmap() == null || bitmapDrawable.getBitmap().isRecycled()) {
                    return;
                }
                Bitmap bitmap = bitmapDrawable.getBitmap();
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                f0(drawable, new BitmapShader(bitmap, tileMode, tileMode));
                return;
            }
        }
        org.telegram.ui.Components.up upVar = (org.telegram.ui.Components.up) drawable;
        float f7 = E[0];
        float f10 = E[1];
        float f11 = E[2];
        float f12 = E[3];
        float[] fArr = upVar.f;
        float max = Math.max(0.0f, f7);
        fArr[1] = max;
        fArr[0] = max;
        float max2 = Math.max(0.0f, f10);
        fArr[3] = max2;
        fArr[2] = max2;
        float max3 = Math.max(0.0f, f11);
        fArr[5] = max3;
        fArr[4] = max3;
        float max4 = Math.max(0.0f, f12);
        fArr[7] = max4;
        fArr[6] = max4;
        upVar.e = f7 > 0.0f || f10 > 0.0f || f11 > 0.0f || f12 > 0.0f;
        upVar.a();
    }

    public final void S(int i10, String str) {
        String str2;
        Drawable drawable;
        String str3;
        if (i10 == 3) {
            str2 = this.h0;
            drawable = this.j0;
        } else if (i10 == 2) {
            str2 = this.D0;
            drawable = this.C0;
        } else if (i10 == 1) {
            str2 = this.Y;
            drawable = this.a0;
        } else {
            str2 = this.Q;
            drawable = this.S;
        }
        if (str2 != null && ((str2.startsWith("-") || str2.startsWith("strippedmessage-")) && (str3 = (String) hc.D().t.get(str2)) != null)) {
            str2 = str3;
        }
        if (drawable instanceof bi0) {
            ((bi0) drawable).F(this);
        }
        if (drawable instanceof org.telegram.ui.Components.s5) {
            ((org.telegram.ui.Components.s5) drawable).v(this);
        }
        if (drawable instanceof org.telegram.ui.Components.f5) {
            ((org.telegram.ui.Components.f5) drawable).o(this);
        }
        if (str2 != null && ((str == null || !str.equals(str2)) && drawable != null)) {
            if (drawable instanceof bi0) {
                bi0 bi0Var = (bi0) drawable;
                boolean p5 = hc.D().p(str2);
                if (!hc.D().J(str2, true) && p5) {
                    bi0Var.C(false);
                }
            } else if (drawable instanceof org.telegram.ui.Components.s5) {
                org.telegram.ui.Components.s5 s5Var = (org.telegram.ui.Components.s5) drawable;
                if (s5Var.n0) {
                    boolean p9 = hc.D().p(str2);
                    if (hc.D().J(str2, true)) {
                        if (p9) {
                            s5Var.stop();
                        }
                    } else if (p9) {
                        s5Var.u();
                    }
                } else if (s5Var.t0.isEmpty()) {
                    s5Var.u();
                }
            } else if (drawable instanceof BitmapDrawable) {
                Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
                boolean p10 = hc.D().p(str2);
                if (!hc.D().J(str2, false) && p10) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(bitmap);
                    i0.A2(arrayList);
                }
            }
        }
        if (i10 == 3) {
            this.h0 = null;
            this.j0 = null;
            this.k0 = null;
        } else if (i10 == 2) {
            this.D0 = null;
            this.C0 = null;
            this.E0 = null;
        } else if (i10 == 1) {
            this.a0 = null;
            this.Y = null;
            this.b0 = null;
        } else {
            this.S = null;
            this.Q = null;
            this.T = null;
        }
    }

    public final void T(boolean z10) {
        this.w0 = z10;
    }

    public final void U(boolean z10) {
        this.t0 = z10;
    }

    public final void V(boolean z10) {
        this.R0 = false;
    }

    public final void W(int i10) {
        this.x0 = i10;
        bi0 B = B();
        if (B != null) {
            B.K(i10);
        }
    }

    public final void X(int i10) {
        this.y0 = i10;
        if (B() != null) {
            B().L = i10;
            return;
        }
        this.C1 = i10;
        if (m() != null) {
            m().y0 = 0;
        }
    }

    public final boolean Y() {
        oc ocVar = this.E;
        if (ocVar == null) {
            return false;
        }
        if (ocVar.a == null && ocVar.c == null && ocVar.e == null && ocVar.g == null) {
            return false;
        }
        this.E = null;
        Drawable drawable = ocVar.g;
        if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            if (!(bitmapDrawable instanceof bi0) && !(bitmapDrawable instanceof org.telegram.ui.Components.s5) && bitmapDrawable.getBitmap() != null && bitmapDrawable.getBitmap().isRecycled()) {
                ocVar.g = null;
            }
        }
        u0(ocVar.e, ocVar.f, ocVar.a, ocVar.b, ocVar.c, ocVar.d, ocVar.g, ocVar.h, ocVar.k, ocVar.j, ocVar.i);
        ocVar.a = null;
        ocVar.c = null;
        ocVar.e = null;
        ocVar.g = null;
        this.E = ocVar;
        bi0 B = B();
        if (B != null) {
            B.E = this.s0;
        }
        if (B == null || !this.u0) {
            return true;
        }
        if (B.z() && this.D != 0) {
            return true;
        }
        B.start();
        return true;
    }

    public final void Z(Object obj) {
        this.F = obj;
        invalidate();
    }

    public final void a(th.t7 t7Var) {
        if (this.c == null) {
            this.c = new ArrayList();
        }
        this.c.add(t7Var);
        if (this.x1) {
            t7Var.a(this);
        }
    }

    public final void a0(ColorFilter colorFilter) {
        this.o1 = colorFilter;
    }

    public final void b() {
        hc D = hc.D();
        D.s.c(new o7(D, this, this.w, 3));
    }

    public final void b0(int i10) {
        this.s1 = i10;
    }

    public final void c() {
        this.r = false;
        hc.D().h(this, true);
        this.n = true;
    }

    public final void c0(boolean z10) {
        this.A0 = z10;
    }

    public final void d(boolean z10, jc jcVar) {
        if (this.l1) {
            return;
        }
        float f7 = this.h1;
        if (f7 != 1.0f) {
            if (!z10) {
                if (jcVar != null) {
                    long currentTimeMillis = System.currentTimeMillis();
                    long j10 = this.j1;
                    long j11 = currentTimeMillis - j10;
                    if (j10 == 0) {
                        j11 = 16;
                    }
                    if (j11 > 30 && i0.r > 60.0f) {
                        j11 = 30;
                    }
                    this.h1 = (j11 / this.s1) + this.h1;
                } else {
                    this.h1 = (16.0f / this.s1) + f7;
                }
                if (this.h1 > 1.0f) {
                    this.h1 = 1.0f;
                    this.i1 = 1.0f;
                    if (this.C0 != null) {
                        S(2, null);
                        this.E0 = null;
                    }
                }
            }
            if (jcVar != null) {
                i0.g3(new a(this, 12));
            } else {
                invalidate();
            }
        }
    }

    public final void d0(mc mcVar) {
        this.g1 = mcVar;
    }

    @Override // org.telegram.messenger.us
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12;
        if (i10 == zs.m4) {
            String str = (String) objArr[0];
            String str2 = this.h0;
            if (str2 != null && str2.equals(str)) {
                this.h0 = (String) objArr[1];
                ic icVar = (ic) objArr[2];
                this.f0 = icVar;
                oc ocVar = this.E;
                if (ocVar != null) {
                    ocVar.e = icVar;
                }
            }
            String str3 = this.Q;
            if (str3 != null && str3.equals(str)) {
                this.Q = (String) objArr[1];
                ic icVar2 = (ic) objArr[2];
                this.O = icVar2;
                oc ocVar2 = this.E;
                if (ocVar2 != null) {
                    ocVar2.a = icVar2;
                }
            }
            String str4 = this.Y;
            if (str4 == null || !str4.equals(str)) {
                return;
            }
            this.Y = (String) objArr[1];
            ic icVar3 = (ic) objArr[2];
            this.W = icVar3;
            oc ocVar3 = this.E;
            if (ocVar3 != null) {
                ocVar3.c = icVar3;
                return;
            }
            return;
        }
        if (i10 == zs.j1) {
            Integer num = (Integer) objArr[0];
            if (this.x >= num.intValue()) {
                return;
            }
            int intValue = num.intValue() | this.D;
            this.D = intValue;
            if (intValue != 0) {
                bi0 B = B();
                if (B != null && B.z()) {
                    B.stop();
                }
                org.telegram.ui.Components.s5 m10 = m();
                if (m10 != null) {
                    m10.stop();
                    return;
                }
                return;
            }
            return;
        }
        if (i10 == zs.k1) {
            Integer num2 = (Integer) objArr[0];
            if (this.x >= num2.intValue() || (i12 = this.D) == 0) {
                return;
            }
            int i13 = (~num2.intValue()) & i12;
            this.D = i13;
            if (i13 == 0) {
                bi0 B2 = B();
                if (B2 != null) {
                    B2.E = this.s0;
                }
                if (this.u0 && B2 != null && B2.z()) {
                    B2.start();
                }
                org.telegram.ui.Components.s5 m11 = m();
                if (!this.t0 || m11 == null) {
                    return;
                }
                m11.j();
                invalidate();
            }
        }
    }

    public final void e() {
        if (this.c != null) {
            if (this.x1) {
                for (int i10 = 0; i10 < this.c.size(); i10++) {
                    ArrayList arrayList = ((th.t7) ((lc) this.c.get(i10))).a;
                    if (arrayList != null) {
                        for (int i11 = 0; i11 < arrayList.size(); i11++) {
                            ((th.p7) arrayList.get(i11)).b(false);
                        }
                    }
                }
            }
            this.c.clear();
        }
    }

    public final jc e0(jc jcVar, int i10) {
        bi0 bi0Var;
        if (jcVar == null) {
            jcVar = new jc();
            jcVar.h = new int[4];
            jcVar.y = new RectF();
        }
        jcVar.d = i10;
        jcVar.f = m();
        jcVar.g = B();
        boolean z10 = false;
        for (int i11 = 0; i11 < 4; i11++) {
            jcVar.h[i11] = this.W0[i11];
        }
        jcVar.j = this.j0;
        jcVar.i = this.k0;
        jcVar.l = this.S;
        jcVar.k = this.T;
        jcVar.m = this.a0;
        jcVar.n = this.b0;
        jcVar.e = this.c0;
        jcVar.o = this.m0;
        jcVar.x = this.C0;
        jcVar.z = this.o1;
        jcVar.w = this.B0;
        jcVar.p = this.h1;
        jcVar.q = this.i1;
        jcVar.r = this.E0;
        org.telegram.ui.Components.s5 s5Var = jcVar.f;
        if ((s5Var != null && !s5Var.s()) || ((bi0Var = jcVar.g) != null && !bi0Var.u())) {
            z10 = true;
        }
        jcVar.a = z10;
        jcVar.u = this.K0;
        jcVar.v = this.L0;
        jcVar.t = this.M0;
        jcVar.s = this.N0;
        jcVar.b = this.d1;
        return jcVar;
    }

    public final void f() {
        for (int i10 = 0; i10 < 4; i10++) {
            S(i10, null);
        }
        hc.D().h(this, true);
    }

    public final void f0(Drawable drawable, BitmapShader bitmapShader) {
        if (drawable == this.a0) {
            this.b0 = bitmapShader;
            return;
        }
        if (drawable == this.m0) {
            this.c0 = bitmapShader;
            return;
        }
        if (drawable == this.j0) {
            this.k0 = bitmapShader;
            return;
        }
        if (drawable == this.S) {
            this.T = bitmapShader;
            if (this.H == null || !(drawable instanceof BitmapDrawable)) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 28) {
                this.I = new ComposeShader(this.H, this.T, PorterDuff.Mode.DST_IN);
                return;
            }
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            int width = bitmapDrawable.getBitmap().getWidth();
            int height = bitmapDrawable.getBitmap().getHeight();
            Bitmap bitmap = this.J;
            if (bitmap != null && bitmap.getWidth() == width && this.J.getHeight() == height) {
                return;
            }
            Bitmap bitmap2 = this.J;
            if (bitmap2 != null) {
                bitmap2.recycle();
            }
            this.J = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
            this.L = new Canvas(this.J);
            Bitmap bitmap3 = this.J;
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            this.K = new BitmapShader(bitmap3, tileMode, tileMode);
            if (this.M == null) {
                Paint paint = new Paint();
                this.M = paint;
                paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
            }
        }
    }

    public final boolean g(Canvas canvas) {
        return h(canvas, null);
    }

    public final void g0(boolean z10) {
        if (this.F1 == z10) {
            return;
        }
        this.F1 = z10;
        this.u0 = !z10;
        bi0 B = B();
        if (B != null) {
            if (z10) {
                B.stop();
            } else {
                if (B.k0) {
                    return;
                }
                B.start();
            }
        }
    }

    public float getAlpha() {
        return this.d1;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(19:0|1|(1:5)|(1:7)(1:221)|(9:8|(1:10)(2:211|(1:219)(1:215))|11|12|(1:14)|15|(1:17)|(2:208|(1:210))|20)|(12:(1:(1:(1:194)(2:195|(3:197|(1:202)(1:200)|201)(1:203)))(1:192))(1:189)|28|(1:30)(1:184)|31|32|(4:34|(17:36|(2:(1:(1:40))|(7:42|(1:45)|46|47|48|49|(11:97|(2:(3:(3:(4:109|110|111|(13:113|(2:147|148)(1:117)|118|119|120|(1:124)|125|126|(1:146)(4:131|(3:132|133|(2:135|136)(1:137))|138|139)|140|141|(1:143)|145))|149|(0))|149|(0))|(2:159|(0))(3:(5:161|(4:164|155|111|(0))|156|111|(0))|149|(0)))|165|125|126|(1:128)|146|140|141|(0)|145)(2:52|53)))|170|48|49|(0)|97|(3:99|(3:(3:(4:109|110|111|(0))|149|(0))|149|(0))|(0)(0))|165|125|126|(0)|146|140|141|(0)|145)(2:171|172)|(1:96)(1:57)|58)(2:173|(5:175|(1:177)|178|179|180)(7:181|182|(2:63|64)|69|(1:73)|(3:79|(4:82|(1:92)(5:84|(2:87|85)|88|89|90)|91|80)|93)|94))|59|(2:63|64)|69|(2:71|73)|(5:75|77|79|(1:80)|93)|94)(1:26)|27|28|(0)(0)|31|32|(0)(0)|59|(0)|69|(0)|(0)|94|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x01dd, code lost:
    
        if (r1.l0 == false) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x01df, code lost:
    
        if (r21 != null) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x01e1, code lost:
    
        r1.R0(r3);
        r2 = r1.c0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x023c, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:113:0x020b A[Catch: Exception -> 0x0078, TryCatch #3 {Exception -> 0x0078, blocks: (B:10:0x002c, B:12:0x00c5, B:17:0x00cd, B:20:0x00e6, B:22:0x00ec, B:26:0x00f4, B:28:0x014f, B:30:0x015b, B:34:0x0168, B:42:0x0182, B:45:0x0188, B:46:0x018f, B:53:0x01b5, B:55:0x02d8, B:58:0x02df, B:113:0x020b, B:115:0x020f, B:118:0x0223, B:151:0x01db, B:154:0x01e1, B:161:0x01fa, B:164:0x0200, B:172:0x02d2, B:175:0x02ed, B:177:0x02f1, B:178:0x02f6, B:189:0x0107, B:192:0x0115, B:194:0x0121, B:195:0x012b, B:197:0x012f, B:200:0x0135, B:201:0x013e, B:205:0x00d6, B:208:0x00dc, B:210:0x00e3, B:211:0x007f, B:213:0x00b1, B:217:0x00b9), top: B:8:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02b5 A[Catch: Exception -> 0x02b9, TRY_LEAVE, TryCatch #2 {Exception -> 0x02b9, blocks: (B:49:0x01a4, B:125:0x0242, B:141:0x02b0, B:143:0x02b5), top: B:48:0x01a4 }] */
    /* JADX WARN: Removed duplicated region for block: B:159:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x015b A[Catch: Exception -> 0x0078, TryCatch #3 {Exception -> 0x0078, blocks: (B:10:0x002c, B:12:0x00c5, B:17:0x00cd, B:20:0x00e6, B:22:0x00ec, B:26:0x00f4, B:28:0x014f, B:30:0x015b, B:34:0x0168, B:42:0x0182, B:45:0x0188, B:46:0x018f, B:53:0x01b5, B:55:0x02d8, B:58:0x02df, B:113:0x020b, B:115:0x020f, B:118:0x0223, B:151:0x01db, B:154:0x01e1, B:161:0x01fa, B:164:0x0200, B:172:0x02d2, B:175:0x02ed, B:177:0x02f1, B:178:0x02f6, B:189:0x0107, B:192:0x0115, B:194:0x0121, B:195:0x012b, B:197:0x012f, B:200:0x0135, B:201:0x013e, B:205:0x00d6, B:208:0x00dc, B:210:0x00e3, B:211:0x007f, B:213:0x00b1, B:217:0x00b9), top: B:8:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0168 A[Catch: Exception -> 0x0078, TryCatch #3 {Exception -> 0x0078, blocks: (B:10:0x002c, B:12:0x00c5, B:17:0x00cd, B:20:0x00e6, B:22:0x00ec, B:26:0x00f4, B:28:0x014f, B:30:0x015b, B:34:0x0168, B:42:0x0182, B:45:0x0188, B:46:0x018f, B:53:0x01b5, B:55:0x02d8, B:58:0x02df, B:113:0x020b, B:115:0x020f, B:118:0x0223, B:151:0x01db, B:154:0x01e1, B:161:0x01fa, B:164:0x0200, B:172:0x02d2, B:175:0x02ed, B:177:0x02f1, B:178:0x02f6, B:189:0x0107, B:192:0x0115, B:194:0x0121, B:195:0x012b, B:197:0x012f, B:200:0x0135, B:201:0x013e, B:205:0x00d6, B:208:0x00dc, B:210:0x00e3, B:211:0x007f, B:213:0x00b1, B:217:0x00b9), top: B:8:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0315 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x032f  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0340  */
    /* JADX WARN: Type inference failed for: r2v1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean h(Canvas canvas, jc jcVar) {
        int[] iArr;
        boolean z10;
        boolean z11;
        Canvas canvas2;
        ImageReceiver imageReceiver;
        int i10;
        org.telegram.ui.Components.s5 m10;
        bi0 B;
        int[] iArr2;
        Drawable drawable;
        BitmapShader bitmapShader;
        Drawable drawable2;
        BitmapShader bitmapShader2;
        BitmapShader bitmapShader3;
        BitmapShader bitmapShader4;
        boolean z12;
        Drawable drawable3;
        Drawable drawable4;
        Drawable drawable5;
        float f7;
        float f10;
        BitmapShader bitmapShader5;
        float f11;
        boolean z13;
        Drawable drawable6;
        BitmapShader bitmapShader6;
        Drawable drawable7;
        boolean z14;
        BitmapShader bitmapShader7;
        Drawable drawable8;
        float f12;
        BitmapShader bitmapShader8;
        boolean z15;
        Drawable drawable9;
        boolean z16;
        Drawable drawable10;
        float f13;
        boolean z17;
        Drawable drawable11;
        int i11;
        int i12;
        BitmapShader bitmapShader9;
        int i13;
        Drawable drawable12;
        boolean z18;
        Canvas canvas3;
        ImageReceiver imageReceiver2;
        boolean z19;
        jc jcVar2;
        ImageReceiver imageReceiver3;
        int[] iArr3;
        float f14;
        Drawable drawable13;
        float f15;
        boolean z20;
        Drawable drawable14;
        Canvas canvas4;
        Drawable drawable15;
        boolean z21;
        float[] fArr;
        BitmapShader bitmapShader10;
        ImageReceiver imageReceiver4 = this;
        Path path = imageReceiver4.c1;
        if (imageReceiver4.G != null && imageReceiver4.Q != null) {
            canvas.save();
            float f16 = imageReceiver4.K0;
            float f17 = imageReceiver4.L0;
            canvas.clipRect(f16, f17, imageReceiver4.M0 + f16, imageReceiver4.N0 + f17);
            canvas.drawColor(-16777216);
        }
        boolean z22 = jcVar != null;
        try {
            if (z22) {
                m10 = jcVar.f;
                B = jcVar.g;
                iArr2 = jcVar.h;
                drawable = jcVar.j;
                bitmapShader = jcVar.i;
                drawable2 = jcVar.l;
                bitmapShader2 = jcVar.k;
                bitmapShader3 = jcVar.n;
                bitmapShader4 = jcVar.e;
                drawable3 = jcVar.x;
                z12 = jcVar.w;
                drawable4 = jcVar.m;
                drawable5 = jcVar.o;
                f7 = jcVar.p;
                f10 = jcVar.q;
                bitmapShader5 = jcVar.r;
                z13 = jcVar.a;
                f11 = jcVar.b;
            } else {
                m10 = imageReceiver4.m();
                B = imageReceiver4.B();
                iArr2 = imageReceiver4.W0;
                drawable = imageReceiver4.j0;
                bitmapShader = imageReceiver4.k0;
                drawable2 = imageReceiver4.S;
                bitmapShader2 = imageReceiver4.T;
                Drawable drawable16 = imageReceiver4.a0;
                bitmapShader3 = imageReceiver4.b0;
                bitmapShader4 = imageReceiver4.c0;
                z12 = imageReceiver4.B0;
                drawable3 = imageReceiver4.C0;
                drawable4 = drawable16;
                drawable5 = imageReceiver4.m0;
                f7 = imageReceiver4.h1;
                f10 = imageReceiver4.i1;
                bitmapShader5 = imageReceiver4.E0;
                f11 = imageReceiver4.d1;
                z13 = ((m10 == null || m10.s()) && (B == null || B.u())) ? false : true;
            }
            bi0 bi0Var = B;
            org.telegram.ui.Components.s5 s5Var = m10;
            drawable6 = drawable5;
            bitmapShader6 = bitmapShader2;
            drawable7 = drawable;
            int[] iArr4 = iArr2;
            z14 = z13;
            bitmapShader7 = bitmapShader4;
            drawable8 = drawable3;
            f12 = f7;
            bitmapShader8 = bitmapShader3;
            z15 = z12;
            drawable9 = drawable4;
            z16 = z22;
            drawable10 = drawable2;
            f13 = f11;
            if (!imageReceiver4.V0) {
                iArr4 = null;
            }
            iArr = iArr4;
            if (s5Var != null) {
                s5Var.B(iArr);
            }
            if ((s5Var != null || bi0Var != null) && !z14 && !imageReceiver4.z0 && !z16) {
                imageReceiver4.z0 = true;
                mc mcVar = imageReceiver4.g1;
                if (mcVar != null) {
                    mcVar.j(imageReceiver4);
                }
            }
            z17 = imageReceiver4.S0;
        } catch (Exception e) {
            e = e;
        }
        if (z17 || imageReceiver4.T0 || drawable7 == null || z14) {
            if (!z17 && drawable10 != null && (!z14 || drawable7 != null)) {
                i11 = imageReceiver4.U;
                i12 = imageReceiver4.V;
                drawable11 = drawable10;
                z14 = false;
            } else if (drawable8 != null && !z15) {
                i11 = imageReceiver4.U;
                i12 = imageReceiver4.V;
                drawable11 = drawable8;
                bitmapShader6 = bitmapShader5;
            } else if (drawable9 != null) {
                i11 = imageReceiver4.d0;
                i12 = imageReceiver4.e0;
                drawable11 = drawable9;
                bitmapShader6 = bitmapShader8;
            } else if (drawable6 instanceof BitmapDrawable) {
                if (imageReceiver4.l0 && bitmapShader7 == null) {
                    imageReceiver4.R0(drawable6);
                    bitmapShader9 = imageReceiver4.c0;
                } else {
                    bitmapShader9 = bitmapShader7;
                }
                int i14 = imageReceiver4.d0;
                i13 = imageReceiver4.e0;
                i11 = i14;
                bitmapShader6 = bitmapShader9;
                bitmapShader7 = bitmapShader6;
                drawable11 = drawable6;
            } else {
                drawable11 = null;
                bitmapShader6 = null;
                i11 = 0;
                i12 = 0;
            }
            float f18 = imageReceiver4.n1;
            float min = f18 <= 0.0f ? Math.min((f18 * f12) + f12, 1.0f) : f12;
            if (drawable11 == null) {
                if (imageReceiver4.k1 != 0) {
                    try {
                        if (f10 != 1.0f) {
                            if (drawable11 != drawable10) {
                                if (drawable11 == drawable7) {
                                }
                            }
                            if (drawable6 != null) {
                                if (imageReceiver4.l0 && bitmapShader7 == null) {
                                    imageReceiver4.R0(drawable6);
                                    bitmapShader7 = imageReceiver4.c0;
                                }
                                f14 = f12;
                                z19 = z14;
                                drawable13 = drawable11;
                                f15 = min;
                                BitmapShader bitmapShader11 = bitmapShader7;
                                iArr3 = iArr;
                                imageReceiver4.k(canvas, drawable6, (int) (f13 * 255.0f), bitmapShader11, i11, i12, jcVar);
                                bitmapShader7 = bitmapShader11;
                                z20 = imageReceiver4.m1;
                                if (z20 || !z19) {
                                    int i15 = i12;
                                    drawable14 = drawable13;
                                    int i16 = i11;
                                    if (z20 && f15 != 1.0f) {
                                        if (drawable14 != drawable10 && drawable14 != drawable7) {
                                            if (drawable14 != drawable9 && drawable14 != drawable8) {
                                                if (drawable14 == drawable6 && drawable8 != null) {
                                                    drawable6 = drawable8;
                                                    bitmapShader10 = bitmapShader5;
                                                    if (drawable6 != null) {
                                                        drawable15 = drawable14;
                                                        int A = ((drawable6 instanceof c00) || (drawable6 instanceof g6)) ? (int) m5.A(1.0f, f15, f13, 255.0f) : (int) (f10 * f13 * 255.0f);
                                                        canvas4 = canvas;
                                                        imageReceiver4.k(canvas4, drawable6, A, bitmapShader10, imageReceiver4.d0, imageReceiver4.e0, jcVar);
                                                        if (A != 255 && (drawable6 instanceof g6)) {
                                                            drawable6.setAlpha(zs.e4);
                                                        }
                                                        if (imageReceiver4.n1 > 0.0f || f15 >= 1.0f || !z15) {
                                                            z21 = false;
                                                        } else {
                                                            canvas4.save();
                                                            path.rewind();
                                                            RectF rectF = i0.P;
                                                            float f19 = imageReceiver4.K0;
                                                            float f20 = imageReceiver4.L0;
                                                            rectF.set(f19, f20, imageReceiver4.M0 + f19, imageReceiver4.N0 + f20);
                                                            int i17 = 0;
                                                            while (true) {
                                                                int length = iArr3.length;
                                                                fArr = I1;
                                                                if (i17 >= length) {
                                                                    break;
                                                                }
                                                                int i18 = i17 * 2;
                                                                float f21 = iArr3[i17];
                                                                fArr[i18] = f21;
                                                                fArr[i18 + 1] = f21;
                                                                i17++;
                                                            }
                                                            path.addRoundRect(i0.P, fArr, Path.Direction.CW);
                                                            canvas4.clipPath(path);
                                                            float z23 = c3.i0.z(1.0f, org.telegram.ui.Components.gr.i.getInterpolation(f14), imageReceiver4.n1, 1.0f);
                                                            canvas4.scale(z23, z23, imageReceiver4.r(), imageReceiver4.s());
                                                            z21 = true;
                                                        }
                                                        Drawable drawable17 = drawable15;
                                                        imageReceiver4.k(canvas4, drawable17, (int) (f13 * f15 * 255.0f), bitmapShader6, i16, i15, jcVar);
                                                        if (z21) {
                                                            canvas.restore();
                                                        }
                                                        imageReceiver3 = this;
                                                        jcVar2 = jcVar;
                                                        drawable12 = drawable17;
                                                    }
                                                }
                                                drawable6 = null;
                                                bitmapShader10 = null;
                                                if (drawable6 != null) {
                                                }
                                            }
                                            drawable6 = null;
                                            bitmapShader10 = null;
                                            if (drawable6 != null) {
                                            }
                                        }
                                        if (drawable9 == null) {
                                            drawable6 = drawable9;
                                            bitmapShader10 = bitmapShader8;
                                            if (drawable6 != null) {
                                            }
                                        } else {
                                            if (drawable6 != null) {
                                                if (imageReceiver4.l0 && bitmapShader7 == null) {
                                                    imageReceiver4.R0(drawable6);
                                                    BitmapShader bitmapShader12 = imageReceiver4.c0;
                                                    bitmapShader5 = bitmapShader12;
                                                    bitmapShader10 = bitmapShader5;
                                                    if (drawable6 != null) {
                                                    }
                                                }
                                                bitmapShader5 = bitmapShader7;
                                                bitmapShader10 = bitmapShader5;
                                                if (drawable6 != null) {
                                                }
                                            }
                                            drawable6 = null;
                                            bitmapShader10 = null;
                                            if (drawable6 != null) {
                                            }
                                        }
                                    }
                                    canvas4 = canvas;
                                    drawable15 = drawable14;
                                    if (imageReceiver4.n1 > 0.0f) {
                                    }
                                    z21 = false;
                                    Drawable drawable172 = drawable15;
                                    imageReceiver4.k(canvas4, drawable172, (int) (f13 * f15 * 255.0f), bitmapShader6, i16, i15, jcVar);
                                    if (z21) {
                                    }
                                    imageReceiver3 = this;
                                    jcVar2 = jcVar;
                                    drawable12 = drawable172;
                                } else {
                                    Drawable drawable18 = drawable13;
                                    imageReceiver4.k(canvas, drawable18, (int) (f13 * 255.0f), bitmapShader6, i11, i12, jcVar);
                                    jcVar2 = jcVar;
                                    drawable12 = drawable18;
                                    imageReceiver3 = imageReceiver4;
                                }
                            }
                        }
                        z20 = imageReceiver4.m1;
                        if (z20) {
                        }
                        int i152 = i12;
                        drawable14 = drawable13;
                        int i162 = i11;
                        if (z20) {
                            if (drawable14 != drawable10) {
                                if (drawable14 != drawable9) {
                                    if (drawable14 == drawable6) {
                                        drawable6 = drawable8;
                                        bitmapShader10 = bitmapShader5;
                                        if (drawable6 != null) {
                                        }
                                    }
                                    drawable6 = null;
                                    bitmapShader10 = null;
                                    if (drawable6 != null) {
                                    }
                                }
                                drawable6 = null;
                                bitmapShader10 = null;
                                if (drawable6 != null) {
                                }
                            }
                            if (drawable9 == null) {
                            }
                        }
                        canvas4 = canvas;
                        drawable15 = drawable14;
                        if (imageReceiver4.n1 > 0.0f) {
                        }
                        z21 = false;
                        Drawable drawable1722 = drawable15;
                        imageReceiver4.k(canvas4, drawable1722, (int) (f13 * f15 * 255.0f), bitmapShader6, i162, i152, jcVar);
                        if (z21) {
                        }
                        imageReceiver3 = this;
                        jcVar2 = jcVar;
                        drawable12 = drawable1722;
                    } catch (Exception e7) {
                        e = e7;
                        imageReceiver4 = this;
                        iArr = canvas;
                        z10 = true;
                        z11 = false;
                        imageReceiver = imageReceiver4;
                        canvas2 = iArr;
                        f8.g(e, z10);
                        if (imageReceiver.G != null) {
                        }
                        if (z11) {
                        }
                        return z11;
                    }
                    iArr3 = iArr;
                    f14 = f12;
                    z19 = z14;
                    drawable13 = drawable11;
                    f15 = min;
                } else {
                    Drawable drawable19 = drawable11;
                    z19 = z14;
                    ImageReceiver imageReceiver5 = this;
                    jcVar2 = jcVar;
                    imageReceiver5.k(canvas, drawable19, (int) (f13 * 255.0f), bitmapShader6, i11, i12, jcVar2);
                    drawable12 = drawable19;
                    imageReceiver3 = imageReceiver5;
                }
                imageReceiver3.d(z19 && imageReceiver3.m1, jcVar2);
                canvas3 = canvas;
                z18 = z19;
                imageReceiver2 = imageReceiver3;
            } else {
                drawable12 = drawable11;
                boolean z24 = z14;
                if (drawable6 == null) {
                    canvas2 = canvas;
                    z18 = z24;
                    imageReceiver4.d(z18, jcVar);
                    z11 = false;
                    imageReceiver = imageReceiver4;
                    if (drawable12 == null && z18 && !z16) {
                        try {
                            imageReceiver.invalidate();
                        } catch (Exception e10) {
                            e = e10;
                            z10 = true;
                            imageReceiver = imageReceiver;
                            canvas2 = canvas2;
                            f8.g(e, z10);
                            if (imageReceiver.G != null) {
                            }
                            if (z11) {
                            }
                            return z11;
                        }
                    }
                    if (imageReceiver.G != null && imageReceiver.Q != null) {
                        canvas2.restore();
                    }
                    if (z11 && imageReceiver.Q0 && imageReceiver.c != null) {
                        for (i10 = 0; i10 < imageReceiver.c.size(); i10++) {
                            th.t7 t7Var = (th.t7) ((lc) imageReceiver.c.get(i10));
                            ArrayList arrayList = t7Var.a;
                            if (arrayList != null) {
                                float alpha = imageReceiver.getAlpha();
                                float r10 = imageReceiver.r();
                                float s10 = imageReceiver.s();
                                float f22 = imageReceiver.M0;
                                t7Var.d = f22;
                                float f23 = (16.0f * f22) / 9.0f;
                                t7Var.e = f23;
                                t7Var.b = r10 - (f22 / 2.0f);
                                t7Var.c = s10 - (f23 / 2.0f);
                                canvas2.save();
                                canvas2.clipRect(imageReceiver.K0, imageReceiver.L0, imageReceiver.y(), imageReceiver.A());
                                for (int i19 = 0; i19 < arrayList.size(); i19++) {
                                    ((th.p7) arrayList.get(i19)).a(canvas2, alpha);
                                }
                                canvas2.restore();
                            }
                        }
                    }
                    return z11;
                }
                if (drawable6 instanceof g61) {
                    ((g61) drawable6).e = imageReceiver4;
                }
                Canvas canvas5 = canvas;
                imageReceiver4.k(canvas5, drawable6, (int) (f13 * 255.0f), null, imageReceiver4.d0, imageReceiver4.e0, jcVar);
                z18 = z24;
                imageReceiver4.d(z18, jcVar);
                imageReceiver2 = imageReceiver4;
                canvas3 = canvas5;
            }
            z11 = true;
            imageReceiver = imageReceiver2;
            canvas2 = canvas3;
            if (drawable12 == null) {
                imageReceiver.invalidate();
            }
            if (imageReceiver.G != null) {
                canvas2.restore();
            }
            if (z11) {
                while (i10 < imageReceiver.c.size()) {
                }
            }
            return z11;
        }
        int i20 = imageReceiver4.U;
        i13 = imageReceiver4.V;
        i11 = i20;
        bitmapShader6 = bitmapShader;
        drawable11 = drawable7;
        i12 = i13;
        float f182 = imageReceiver4.n1;
        if (f182 <= 0.0f) {
        }
        if (drawable11 == null) {
        }
        z11 = true;
        imageReceiver = imageReceiver2;
        canvas2 = canvas3;
        if (drawable12 == null) {
        }
        if (imageReceiver.G != null) {
        }
        if (z11) {
        }
        return z11;
    }

    public final void h0(int i10) {
        if (this.w != i10) {
            this.w = i10;
            if (this.x1 && K()) {
                hc D = hc.D();
                D.s.c(new o7(D, this, this.w, 3));
            }
        }
    }

    public final void i(Canvas canvas, BitmapDrawable bitmapDrawable, jc jcVar, int i10) {
        if (jcVar == null) {
            bitmapDrawable.setAlpha(i10);
            if (bitmapDrawable instanceof bi0) {
                ((bi0) bitmapDrawable).q(canvas, null, false, this.s, 0);
                return;
            } else if (bitmapDrawable instanceof org.telegram.ui.Components.s5) {
                ((org.telegram.ui.Components.s5) bitmapDrawable).l(canvas, false, this.s, 0);
                return;
            } else {
                bitmapDrawable.draw(canvas);
                return;
            }
        }
        if (bitmapDrawable instanceof bi0) {
            bi0 bi0Var = (bi0) bitmapDrawable;
            float f7 = jcVar.u;
            float f10 = jcVar.v;
            float f11 = jcVar.t;
            float f12 = jcVar.s;
            ColorFilter colorFilter = jcVar.z;
            int i11 = jcVar.d;
            Paint[] paintArr = bi0Var.j0;
            RectF[] rectFArr = bi0Var.i0;
            if (rectFArr[i11] == null) {
                rectFArr[i11] = new RectF();
                Paint paint = new Paint(1);
                paintArr[i11] = paint;
                paint.setFilterBitmap(true);
            }
            paintArr[i11].setAlpha(i10);
            paintArr[i11].setColorFilter(colorFilter);
            rectFArr[i11].set(f7, f10, f7 + f11, f12 + f10);
            bi0Var.q(canvas, null, true, 0L, i11);
            return;
        }
        if (!(bitmapDrawable instanceof org.telegram.ui.Components.s5)) {
            Bitmap bitmap = bitmapDrawable.getBitmap();
            if (bitmap != null) {
                if (jcVar.A == null) {
                    jcVar.A = new Paint(1);
                }
                jcVar.A.setAlpha(i10);
                jcVar.A.setColorFilter(jcVar.z);
                canvas.save();
                canvas.translate(jcVar.u, jcVar.v);
                canvas.scale(jcVar.t / bitmap.getWidth(), jcVar.s / bitmap.getHeight());
                canvas.drawBitmap(bitmap, 0.0f, 0.0f, jcVar.A);
                canvas.restore();
                return;
            }
            return;
        }
        org.telegram.ui.Components.s5 s5Var = (org.telegram.ui.Components.s5) bitmapDrawable;
        float f13 = jcVar.u;
        float f14 = jcVar.v;
        float f15 = jcVar.t;
        float f16 = jcVar.s;
        ColorFilter colorFilter2 = jcVar.z;
        int i12 = jcVar.d;
        Paint[] paintArr2 = s5Var.q0;
        RectF[] rectFArr2 = s5Var.p0;
        if (rectFArr2[i12] == null) {
            rectFArr2[i12] = new RectF();
            Paint paint2 = new Paint();
            paintArr2[i12] = paint2;
            paint2.setFilterBitmap(true);
        }
        paintArr2[i12].setAlpha(i10);
        paintArr2[i12].setColorFilter(colorFilter2);
        rectFArr2[i12].set(f13, f14, f15 + f13, f16 + f14);
        s5Var.l(canvas, true, 0L, i12);
    }

    public final void i0(TLObject tLObject, Drawable drawable, Object obj) {
        j0(tLObject, drawable, obj, false, 0, false);
    }

    public void invalidate() {
        View view = this.e;
        if (view == null) {
            return;
        }
        if (this.J0) {
            view.invalidate();
            return;
        }
        float f7 = this.K0;
        float f10 = this.L0;
        view.invalidate((int) f7, (int) f10, (int) (f7 + this.M0), (int) (f10 + this.N0));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:395|(1:397)(10:427|(2:429|(1:431))|432|(1:401)|402|403|404|(1:(5:407|(1:409)|410|411|412)(1:420))(1:421)|413|(2:415|416)(1:417))|398|(1:401)|402|403|404|(0)(0)|413|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:422:0x089f, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:423:0x08a0, code lost:
    
        r12 = r12;
        r15 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:424:0x08af, code lost:
    
        org.telegram.messenger.f8.g(r0, r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:425:0x0884, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:426:0x0885, code lost:
    
        r12 = 0;
        r15 = true;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:114:0x07b8  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x07c2  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x06e2  */
    /* JADX WARN: Removed duplicated region for block: B:406:0x0875  */
    /* JADX WARN: Removed duplicated region for block: B:415:0x08b4  */
    /* JADX WARN: Removed duplicated region for block: B:417:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:421:0x08a8 A[Catch: Exception -> 0x089f, TRY_LEAVE, TryCatch #0 {Exception -> 0x089f, blocks: (B:412:0x089b, B:420:0x08a1, B:421:0x08a8), top: B:404:0x0873 }] */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v23 */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v5, types: [org.telegram.messenger.ImageReceiver] */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r12v9 */
    /* JADX WARN: Type inference failed for: r15v14 */
    /* JADX WARN: Type inference failed for: r15v16 */
    /* JADX WARN: Type inference failed for: r15v52 */
    /* JADX WARN: Type inference failed for: r41v0, types: [org.telegram.messenger.ImageReceiver] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j(Canvas canvas, Drawable drawable, int i10, BitmapShader bitmapShader, int i11, int i12, int i13, jc jcVar) {
        float f7;
        float f10;
        float f11;
        float f12;
        ColorFilter colorFilter;
        RectF rectF;
        int[] iArr;
        c00 c00Var;
        c00 c00Var2;
        boolean z10;
        int intrinsicHeight;
        int intrinsicWidth;
        boolean z11;
        boolean z12;
        float f13;
        float f14;
        float f15;
        jc jcVar2;
        float f16;
        float f17;
        jc jcVar3;
        float f18;
        float f19;
        if (jcVar != null) {
            f7 = jcVar.u;
            f10 = jcVar.v;
            f11 = jcVar.s;
            f12 = jcVar.t;
            rectF = jcVar.y;
            colorFilter = jcVar.z;
            iArr = jcVar.h;
        } else {
            f7 = this.K0;
            f10 = this.L0;
            f11 = this.N0;
            f12 = this.M0;
            colorFilter = this.o1;
            rectF = this.P0;
            iArr = this.W0;
        }
        int[] iArr2 = !this.V0 ? null : iArr;
        if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            int[] iArr3 = iArr2;
            boolean z13 = drawable instanceof bi0;
            if (z13) {
                z10 = z13;
                ((bi0) drawable).a = this.A1;
            } else {
                z10 = z13;
                if (drawable instanceof org.telegram.ui.Components.s5) {
                    ((org.telegram.ui.Components.s5) drawable).a = this.A1;
                }
            }
            Paint paint = this.Z0;
            Paint paint2 = bitmapShader != null ? paint : bitmapDrawable.getPaint();
            int i14 = Build.VERSION.SDK_INT;
            if (i14 >= 29) {
                Object obj = this.F;
                if (obj == null || this.H != null) {
                    paint2.setBlendMode(null);
                } else {
                    paint2.setBlendMode(e9.b(obj));
                }
            }
            boolean z14 = (paint2 == null || paint2.getColorFilter() == null) ? false : true;
            if (z14 && i13 == 0) {
                if (bitmapShader != null) {
                    paint.setColorFilter(null);
                } else if (this.m0 != drawable) {
                    bitmapDrawable.setColorFilter(null);
                }
            } else if (!z14 && i13 != 0) {
                if (i13 == 1) {
                    PorterDuffColorFilter porterDuffColorFilter = G1;
                    if (bitmapShader != null) {
                        paint.setColorFilter(porterDuffColorFilter);
                    } else {
                        bitmapDrawable.setColorFilter(porterDuffColorFilter);
                    }
                } else {
                    PorterDuffColorFilter porterDuffColorFilter2 = H1;
                    if (bitmapShader != null) {
                        paint.setColorFilter(porterDuffColorFilter2);
                    } else {
                        bitmapDrawable.setColorFilter(porterDuffColorFilter2);
                    }
                }
            }
            if (colorFilter != null && this.H == null) {
                if (bitmapShader != null) {
                    paint.setColorFilter(colorFilter);
                } else {
                    bitmapDrawable.setColorFilter(colorFilter);
                }
            }
            boolean z15 = bitmapDrawable instanceof org.telegram.ui.Components.s5;
            if (z15 || (bitmapDrawable instanceof bi0)) {
                int i15 = i11 % 360;
                if (i15 == 90 || i15 == 270) {
                    intrinsicHeight = bitmapDrawable.getIntrinsicHeight();
                    intrinsicWidth = bitmapDrawable.getIntrinsicWidth();
                } else {
                    intrinsicHeight = bitmapDrawable.getIntrinsicWidth();
                    intrinsicWidth = bitmapDrawable.getIntrinsicHeight();
                }
                z11 = z15;
                z12 = false;
            } else {
                Bitmap bitmap = bitmapDrawable.getBitmap();
                if (bitmap != null && bitmap.isRecycled()) {
                    return;
                }
                int i16 = i11 % 360;
                if (i16 == 90 || i16 == 270) {
                    intrinsicHeight = bitmap.getHeight();
                    intrinsicWidth = bitmap.getWidth();
                } else {
                    intrinsicHeight = bitmap.getWidth();
                    intrinsicWidth = bitmap.getHeight();
                }
                z12 = bitmapDrawable instanceof nc;
                z11 = z15;
            }
            int i17 = intrinsicWidth;
            float f20 = this.O0 * 2.0f;
            float f21 = f12 - f20;
            boolean z16 = z12;
            float f22 = f11 - f20;
            float f23 = f12 == 0.0f ? 1.0f : intrinsicHeight / f21;
            float f24 = f11 == 0.0f ? 1.0f : i17 / f22;
            if (z16) {
                f23 /= 1.2f;
                f24 /= 1.2f;
            }
            float f25 = f23;
            float f26 = f24;
            if (bitmapShader == null || jcVar != null) {
                float f27 = f12;
                float f28 = f11;
                if (this.R0) {
                    float max = Math.max(f25, f26);
                    canvas.save();
                    int i18 = (int) (intrinsicHeight / max);
                    int i19 = (int) (i17 / max);
                    if (jcVar == null) {
                        float f29 = i18;
                        f17 = f27;
                        float f30 = i19;
                        f16 = f28;
                        rectF.set(c3.i0.B(f17, f29, 2.0f, f7), c3.i0.B(f16, f30, 2.0f, f10), m5.a(f17, f29, 2.0f, f7), m5.a(f16, f30, 2.0f, f10));
                        bitmapDrawable.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
                        if (z11) {
                            ((org.telegram.ui.Components.s5) bitmapDrawable).z(rectF.left, rectF.top, rectF.width(), rectF.height());
                        }
                    } else {
                        f16 = f28;
                        f17 = f27;
                    }
                    if (jcVar == null || iArr3 == null || iArr3[0] <= 0) {
                        jcVar3 = jcVar;
                    } else {
                        canvas.save();
                        jcVar3 = jcVar;
                        Path path = jcVar3.B;
                        if (path == null) {
                            path = new Path();
                            jcVar3.B = path;
                        }
                        path.rewind();
                        RectF rectF2 = i0.P;
                        rectF2.set(f7, f10, f7 + f17, f10 + f16);
                        path.addRoundRect(rectF2, iArr3[0], iArr3[2], Path.Direction.CW);
                        canvas.clipPath(path);
                    }
                    if (this.Q0) {
                        try {
                            bitmapDrawable.setAlpha(i10);
                            i(canvas, bitmapDrawable, jcVar3, i10);
                        } catch (Exception e) {
                            if (jcVar3 == null) {
                                Q(bitmapDrawable);
                            }
                            f8.g(e, true);
                        }
                    }
                    canvas.restore();
                    if (jcVar3 != null && iArr3 != null && iArr3[0] > 0) {
                        canvas.restore();
                    }
                } else if (canvas != null) {
                    if (Math.abs(f25 - f26) > 1.0E-5f) {
                        canvas.save();
                        if (this.B1) {
                            f14 = f26;
                            canvas.clipRect(f7, f10, f7 + f27, f10 + f28);
                        } else {
                            f14 = f26;
                        }
                        if (i12 == 1) {
                            f15 = 2.0f;
                            canvas.scale(-1.0f, 1.0f, f27 / 2.0f, f28 / 2.0f);
                        } else {
                            f15 = 2.0f;
                            if (i12 == 2) {
                                canvas.scale(1.0f, -1.0f, f27 / 2.0f, f28 / 2.0f);
                            }
                        }
                        int i20 = i11 % 360;
                        if (i20 != 0) {
                            if (this.f1) {
                                canvas.rotate(i11, f27 / f15, f28 / f15);
                            } else {
                                canvas.rotate(i11, 0.0f, 0.0f);
                            }
                        }
                        float f31 = intrinsicHeight / f14;
                        if (f31 > f27) {
                            float f32 = (int) f31;
                            rectF.set(m5.y(f32, f27, 2.0f, f7), f10, m5.a(f32, f27, 2.0f, f7), f10 + f28);
                        } else {
                            float f33 = (int) (i17 / f25);
                            rectF.set(f7, m5.y(f33, f28, 2.0f, f10), f7 + f27, m5.a(f33, f28, 2.0f, f10));
                        }
                        if (z11) {
                            ((org.telegram.ui.Components.s5) bitmapDrawable).z(f7, f10, f27, f28);
                        }
                        if (jcVar == null) {
                            if (i20 == 90 || i20 == 270) {
                                float width = rectF.width() / 2.0f;
                                float height = rectF.height() / 2.0f;
                                float centerX = rectF.centerX();
                                float centerY = rectF.centerY();
                                bitmapDrawable.setBounds((int) (centerX - height), (int) (centerY - width), (int) (centerX + height), (int) (centerY + width));
                            } else {
                                bitmapDrawable.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
                            }
                        }
                        if (this.Q0) {
                            if (i14 >= 29) {
                                try {
                                    if (this.F != null) {
                                        bitmapDrawable.getPaint().setBlendMode(e9.b(this.F));
                                    } else {
                                        bitmapDrawable.getPaint().setBlendMode(null);
                                    }
                                } catch (Exception e7) {
                                    e = e7;
                                    jcVar2 = jcVar;
                                    if (jcVar2 == null) {
                                    }
                                    f8.g(e, true);
                                    canvas.restore();
                                    if (z10) {
                                    }
                                }
                            }
                            jcVar2 = jcVar;
                            try {
                                i(canvas, bitmapDrawable, jcVar2, i10);
                            } catch (Exception e10) {
                                e = e10;
                                if (jcVar2 == null) {
                                    Q(bitmapDrawable);
                                }
                                f8.g(e, true);
                                canvas.restore();
                                if (z10) {
                                }
                            }
                        }
                        canvas.restore();
                    } else {
                        canvas.save();
                        if (i12 == 1) {
                            f13 = 2.0f;
                            canvas.scale(-1.0f, 1.0f, f27 / 2.0f, f28 / 2.0f);
                        } else {
                            f13 = 2.0f;
                            if (i12 == 2) {
                                canvas.scale(1.0f, -1.0f, f27 / 2.0f, f28 / 2.0f);
                            }
                        }
                        int i21 = i11 % 360;
                        if (i21 != 0) {
                            if (this.f1) {
                                canvas.rotate(i11, f27 / f13, f28 / f13);
                            } else {
                                canvas.rotate(i11, 0.0f, 0.0f);
                            }
                        }
                        rectF.set(f7, f10, f7 + f27, f10 + f28);
                        if (this.p1) {
                            float f34 = -i0.x;
                            rectF.inset(f34, f34);
                        }
                        if (z11) {
                            ((org.telegram.ui.Components.s5) bitmapDrawable).z(f7, f10, f27, f28);
                        }
                        if (jcVar == null) {
                            if (i21 == 90 || i21 == 270) {
                                float width2 = rectF.width() / 2.0f;
                                float height2 = rectF.height() / 2.0f;
                                float centerX2 = rectF.centerX();
                                float centerY2 = rectF.centerY();
                                bitmapDrawable.setBounds((int) (centerX2 - height2), (int) (centerY2 - width2), (int) (centerX2 + height2), (int) (centerY2 + width2));
                            } else {
                                bitmapDrawable.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
                            }
                        }
                        if (this.Q0) {
                            if (i14 >= 29) {
                                try {
                                    if (this.F != null) {
                                        bitmapDrawable.getPaint().setBlendMode(e9.b(this.F));
                                    } else {
                                        bitmapDrawable.getPaint().setBlendMode(null);
                                    }
                                } catch (Exception e11) {
                                    Q(bitmapDrawable);
                                    f8.g(e11, true);
                                }
                            }
                            i(canvas, bitmapDrawable, jcVar, i10);
                        }
                        canvas.restore();
                    }
                }
            } else {
                boolean z17 = this.R0;
                float[] fArr = I1;
                Path path2 = this.c1;
                RectF rectF3 = this.a1;
                Matrix matrix = this.b1;
                if (z17) {
                    float max2 = Math.max(f25, f26);
                    float f35 = (int) (intrinsicHeight / max2);
                    float f36 = (int) (i17 / max2);
                    rectF.set(c3.i0.B(f12, f35, 2.0f, f7), c3.i0.B(f11, f36, 2.0f, f10), m5.a(f12, f35, 2.0f, f7), m5.a(f11, f36, 2.0f, f10));
                    if (this.Q0) {
                        matrix.reset();
                        matrix.setTranslate((int) rectF.left, (int) rectF.top);
                        if (i12 != 0) {
                            matrix.preScale(i12 == 1 ? -1.0f : 1.0f, i12 == 2 ? -1.0f : 1.0f, rectF.width() / 2.0f, rectF.height() / 2.0f);
                        }
                        if (i11 == 90) {
                            matrix.preRotate(90.0f);
                            matrix.preTranslate(0.0f, -rectF.width());
                        } else if (i11 == 180) {
                            matrix.preRotate(180.0f);
                            matrix.preTranslate(-rectF.width(), -rectF.height());
                        } else if (i11 == 270) {
                            matrix.preRotate(270.0f);
                            matrix.preTranslate(-rectF.height(), 0.0f);
                        }
                        float f37 = 1.0f / max2;
                        matrix.preScale(f37, f37);
                        bitmapShader.setLocalMatrix(matrix);
                        paint.setShader(bitmapShader);
                        paint.setAlpha(i10);
                        rectF3.set(rectF);
                        if (!this.X0 || !this.V0) {
                            for (int i22 = 0; i22 < iArr3.length; i22++) {
                                int i23 = i22 * 2;
                                float f38 = iArr3[i22];
                                fArr[i23] = f38;
                                fArr[i23 + 1] = f38;
                            }
                            path2.reset();
                            path2.addRoundRect(rectF3, fArr, Path.Direction.CW);
                            path2.close();
                            if (canvas != null) {
                                canvas.drawPath(path2, paint);
                            }
                        } else if (canvas != null) {
                            try {
                                int i24 = iArr3[0];
                                if (i24 == 0) {
                                    canvas.drawRect(rectF3, paint);
                                } else {
                                    float f39 = i24;
                                    canvas.drawRoundRect(rectF3, f39, f39, paint);
                                }
                            } catch (Exception e12) {
                                Q(bitmapDrawable);
                                f8.g(e12, true);
                            }
                        }
                    }
                } else {
                    float f40 = f12;
                    float f41 = f11;
                    if (this.L != null) {
                        rectF3.set(0.0f, 0.0f, this.J.getWidth(), this.J.getHeight());
                        this.L.drawBitmap(this.G, (Rect) null, rectF3, (Paint) null);
                        this.L.drawBitmap(bitmapDrawable.getBitmap(), (Rect) null, rectF3, this.M);
                    }
                    if (bitmapShader != this.T || this.H == null) {
                        paint.setShader(bitmapShader);
                    } else {
                        ComposeShader composeShader = this.I;
                        if (composeShader != null) {
                            paint.setShader(composeShader);
                        } else {
                            paint.setShader(this.K);
                        }
                    }
                    float min = 1.0f / Math.min(f25, f26);
                    float f42 = this.O0;
                    rectF3.set(f7 + f42, f10 + f42, (f7 + f40) - f42, (f10 + f41) - f42);
                    if (Math.abs(f25 - f26) > 5.0E-4f) {
                        float f43 = intrinsicHeight / f26;
                        if (f43 > f21) {
                            float f44 = (int) f43;
                            f19 = f21;
                            rectF.set(m5.y(f44, f19, 2.0f, f7), f10, m5.a(f44, f19, 2.0f, f7), f10 + f22);
                            f18 = f22;
                        } else {
                            f19 = f21;
                            float f45 = (int) (i17 / f25);
                            f18 = f22;
                            rectF.set(f7, m5.y(f45, f18, 2.0f, f10), f7 + f19, m5.a(f45, f18, 2.0f, f10));
                        }
                    } else {
                        f18 = f22;
                        f19 = f21;
                        rectF.set(f7, f10, f7 + f19, f10 + f18);
                    }
                    if (this.Q0) {
                        matrix.reset();
                        if (z16) {
                            matrix.setTranslate((rectF.left + this.O0) - (((rectF.width() * 1.2f) - rectF.width()) / 2.0f), (rectF.top + this.O0) - (((rectF.height() * 1.2f) - rectF.height()) / 2.0f));
                        } else {
                            float f46 = rectF.left;
                            float f47 = this.O0;
                            matrix.setTranslate(f46 + f47, rectF.top + f47);
                        }
                        if (i12 != 0) {
                            matrix.preScale(i12 == 1 ? -1.0f : 1.0f, i12 == 2 ? -1.0f : 1.0f, rectF.width() / 2.0f, rectF.height() / 2.0f);
                        }
                        if (i11 == 90) {
                            matrix.preRotate(90.0f);
                            matrix.preTranslate(0.0f, -rectF.width());
                        } else if (i11 == 180) {
                            matrix.preRotate(180.0f);
                            matrix.preTranslate(-rectF.width(), -rectF.height());
                        } else if (i11 == 270) {
                            matrix.preRotate(270.0f);
                            matrix.preTranslate(-rectF.height(), 0.0f);
                        }
                        matrix.preScale(min, min);
                        if (this.p1) {
                            float f48 = ((i0.x * 2) + f19) / f19;
                            matrix.postScale(f48, f48, rectF.centerX(), rectF.centerY());
                        }
                        BitmapShader bitmapShader2 = this.K;
                        if (bitmapShader2 != null) {
                            bitmapShader2.setLocalMatrix(matrix);
                        }
                        bitmapShader.setLocalMatrix(matrix);
                        if (this.I != null) {
                            int width3 = this.G.getWidth();
                            int height3 = this.G.getHeight();
                            float f49 = f12 == 0.0f ? 1.0f : width3 / f19;
                            float f50 = f11 == 0.0f ? 1.0f : height3 / f18;
                            if (Math.abs(f49 - f50) > 5.0E-4f) {
                                float f51 = width3 / f50;
                                if (f51 > f19) {
                                    width3 = (int) f51;
                                    float f52 = width3;
                                    rectF.set(m5.y(f52, f19, 2.0f, f7), f10, m5.a(f52, f19, 2.0f, f7), f10 + f18);
                                } else {
                                    height3 = (int) (height3 / f49);
                                    float f53 = height3;
                                    rectF.set(f7, m5.y(f53, f18, 2.0f, f10), f7 + f19, m5.a(f53, f18, 2.0f, f10));
                                }
                            } else {
                                rectF.set(f7, f10, f7 + f19, f10 + f18);
                            }
                            float min2 = 1.0f / Math.min(f12 == 0.0f ? 1.0f : width3 / f19, f11 == 0.0f ? 1.0f : height3 / f18);
                            matrix.reset();
                            float f54 = rectF.left;
                            float f55 = this.O0;
                            matrix.setTranslate(f54 + f55, rectF.top + f55);
                            matrix.preScale(min2, min2);
                            this.H.setLocalMatrix(matrix);
                        }
                        paint.setAlpha(i10);
                        if (!this.X0 || !this.V0) {
                            for (int i25 = 0; i25 < iArr3.length; i25++) {
                                int i26 = i25 * 2;
                                float f56 = iArr3[i25];
                                fArr[i26] = f56;
                                fArr[i26 + 1] = f56;
                            }
                            path2.reset();
                            path2.addRoundRect(rectF3, fArr, Path.Direction.CW);
                            path2.close();
                            if (canvas != null) {
                                canvas.drawPath(path2, paint);
                            }
                        } else if (canvas != null) {
                            try {
                                int i27 = iArr3[0];
                                if (i27 != 0) {
                                    float f57 = i27;
                                    canvas.drawRoundRect(rectF3, f57, f57, paint);
                                } else if (z16) {
                                    RectF rectF4 = i0.P;
                                    rectF4.set(rectF3);
                                    rectF4.inset((-((rectF.width() * 1.2f) - rectF.width())) / 2.0f, (-((rectF.height() * 1.2f) - rectF.height())) / 2.0f);
                                    canvas.drawRect(rectF4, paint);
                                } else {
                                    canvas.drawRect(rectF3, paint);
                                }
                            } catch (Exception e13) {
                                if (jcVar == null) {
                                    Q(bitmapDrawable);
                                }
                                f8.g(e13, true);
                            }
                        }
                    }
                }
            }
            if (z10) {
                ((bi0) drawable).a = false;
                return;
            } else {
                if (drawable instanceof org.telegram.ui.Components.s5) {
                    ((org.telegram.ui.Components.s5) drawable).a = false;
                    return;
                }
                return;
            }
        }
        float f58 = f11;
        float f59 = f12;
        boolean z18 = true;
        ?? r15 = 1;
        ?? r12 = i10;
        if (jcVar == null) {
            if (this.R0) {
                int intrinsicWidth2 = drawable.getIntrinsicWidth();
                int intrinsicHeight2 = drawable.getIntrinsicHeight();
                float f60 = this.O0 * 2.0f;
                float max3 = Math.max(f59 == 0.0f ? 1.0f : intrinsicWidth2 / (f59 - f60), f58 == 0.0f ? 1.0f : intrinsicHeight2 / (f58 - f60));
                float f61 = (int) (intrinsicWidth2 / max3);
                r15 = 1073741824;
                float f62 = (int) (intrinsicHeight2 / max3);
                rectF.set(c3.i0.B(f59, f61, 2.0f, f7), c3.i0.B(f58, f62, 2.0f, f10), m5.a(f59, f61, 2.0f, f7), m5.a(f58, f62, 2.0f, f10));
            } else {
                rectF.set(f7, f10, f7 + f59, f10 + f58);
            }
            drawable.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            z18 = r15;
        }
        if (!this.Q0 || canvas == null) {
            return;
        }
        if (!(drawable instanceof c00)) {
            if (drawable instanceof org.telegram.ui.Components.up) {
                Drawable drawable2 = ((org.telegram.ui.Components.up) drawable).a;
                if (drawable2 instanceof c00) {
                    c00Var2 = (c00) drawable2;
                    c00Var2.k = this;
                }
            }
            c00Var = null;
            if (colorFilter != null && drawable != null) {
                drawable.setColorFilter(colorFilter);
            }
            drawable.setAlpha(i10);
            if (jcVar != null) {
                r12 = 0;
                z18 = true;
                drawable.draw(canvas);
            } else if (c00Var != null) {
                long j10 = jcVar.c;
                if (j10 == 0) {
                    j10 = System.currentTimeMillis();
                }
                r12 = 0;
                z18 = true;
                ((c00) drawable).c(canvas, true, jcVar.d, j10, jcVar.u, jcVar.v, jcVar.t, jcVar.s);
            } else {
                r12 = 0;
                z18 = true;
                drawable.draw(canvas);
            }
            if (c00Var != null) {
                c00Var.k = r12;
                return;
            }
            return;
        }
        c00Var2 = (c00) drawable;
        c00Var2.k = this;
        c00Var = c00Var2;
        if (colorFilter != null) {
            drawable.setColorFilter(colorFilter);
        }
        drawable.setAlpha(i10);
        if (jcVar != null) {
        }
        if (c00Var != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0082  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j0(TLObject tLObject, Drawable drawable, Object obj, boolean z10, int i10, boolean z11) {
        ic icVar;
        BitmapDrawable bitmapDrawable;
        boolean z12;
        boolean z13;
        TLRPC.ChatPhoto chatPhoto;
        ic m10;
        String str;
        BitmapDrawable bitmapDrawable2;
        TLRPC.VideoSize videoSize;
        TLRPC.UserFull a2;
        ArrayList<TLRPC.VideoSize> arrayList;
        TLRPC.UserFull a22;
        Object obj2 = obj == null ? tLObject : obj;
        this.l0 = true;
        TLRPC.VideoSize videoSize2 = null;
        r6 = null;
        r6 = null;
        r6 = null;
        r6 = null;
        r6 = null;
        r6 = null;
        r6 = null;
        r6 = null;
        r6 = null;
        r6 = null;
        ic icVar2 = null;
        videoSize2 = null;
        if (tLObject instanceof TLRPC.User) {
            TLRPC.User user = (TLRPC.User) tLObject;
            z12 = user.premium;
            TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
            if (userProfilePhoto != null) {
                bitmapDrawable2 = userProfilePhoto.strippedBitmap;
                z13 = userProfilePhoto.stripped_thumb != null;
                if (i10 == 3 && (a22 = vp.r1(this.d).a2(user.id)) != null) {
                    TLRPC.Photo photo = user.photo.personal ? a22.personal_photo : a22.profile_photo;
                    if (photo != null) {
                        videoSize = b8.S(photo);
                        if (videoSize == null && z10) {
                            vp.r1(this.d);
                            if (vp.A2(user) && user.photo.has_video && sc.e(1024)) {
                                a2 = vp.r1(this.d).a2(user.id);
                                if (a2 != null) {
                                    vp.r1(this.d).U2(user, this.p0, false, null);
                                } else {
                                    TLRPC.Photo photo2 = user.photo.personal ? a2.personal_photo : a2.profile_photo;
                                    if (photo2 != null && (videoSize = b8.S(photo2)) == null && (arrayList = photo2.video_sizes) != null && !arrayList.isEmpty()) {
                                        TLRPC.VideoSize x10 = b8.x(100, arrayList);
                                        for (int i11 = 0; i11 < arrayList.size(); i11++) {
                                            TLRPC.VideoSize videoSize3 = arrayList.get(i11);
                                            if ("p".equals(videoSize3.type)) {
                                                x10 = videoSize3;
                                            }
                                            if ((videoSize3 instanceof TLRPC.TL_videoSizeEmojiMarkup) || (videoSize3 instanceof TLRPC.TL_videoSizeStickerMarkup)) {
                                                videoSize = videoSize3;
                                            }
                                        }
                                        icVar2 = ic.j(x10, photo2);
                                    }
                                }
                            }
                        }
                    }
                }
                videoSize = null;
                if (videoSize == null) {
                    vp.r1(this.d);
                    if (vp.A2(user)) {
                        a2 = vp.r1(this.d).a2(user.id);
                        if (a2 != null) {
                        }
                    }
                }
            } else {
                bitmapDrawable2 = null;
                videoSize = null;
                z13 = false;
            }
            icVar = icVar2;
            bitmapDrawable = bitmapDrawable2;
            videoSize2 = videoSize;
        } else if (!(tLObject instanceof TLRPC.Chat) || (chatPhoto = ((TLRPC.Chat) tLObject).photo) == null) {
            icVar = null;
            bitmapDrawable = null;
            z12 = false;
            z13 = false;
        } else {
            bitmapDrawable = chatPhoto.strippedBitmap;
            z13 = chatPhoto.stripped_thumb != null;
            icVar = null;
            z12 = false;
        }
        if (videoSize2 != null && i10 != 0) {
            w0(new g61(videoSize2, z12, i10));
            return;
        }
        if (z11) {
            m10 = ic.m(this.d, 0, tLObject);
            str = "100_100";
        } else {
            m10 = ic.m(this.d, 1, tLObject);
            str = "50_50";
        }
        String str2 = str;
        ic icVar3 = m10;
        if (icVar != null) {
            u0(icVar, "avatar", icVar3, str2, null, null, bitmapDrawable, 0L, null, obj2, 0);
            this.C1 = 3;
            return;
        }
        Object obj3 = obj2;
        BitmapDrawable bitmapDrawable3 = bitmapDrawable;
        if (bitmapDrawable3 != null) {
            q0(icVar3, str2, bitmapDrawable3, null, obj3, 0);
        } else if (z13) {
            s0(icVar3, str2, ic.m(this.d, 2, tLObject), "50_50_b", drawable, obj3, 0);
        } else {
            q0(icVar3, str2, drawable, null, obj3, 0);
        }
    }

    public final void k(Canvas canvas, Drawable drawable, int i10, BitmapShader bitmapShader, int i11, int i12, jc jcVar) {
        if (this.e1 == 0) {
            float f7 = this.t1;
            if (f7 != 0.0f) {
                float f10 = f7 - 0.10666667f;
                this.t1 = f10;
                if (f10 < 0.0f) {
                    this.t1 = 0.0f;
                }
                invalidate();
            }
        }
        int i13 = this.e1;
        if (i13 != 0) {
            this.t1 = 1.0f;
            this.u1 = i13;
        }
        float f11 = this.t1;
        if (f11 == 0.0f || f11 == 1.0f) {
            j(canvas, drawable, i10, bitmapShader, i11, i12, i13, jcVar);
        } else {
            j(canvas, drawable, i10, bitmapShader, i11, i12, i13, jcVar);
            j(canvas, drawable, (int) (i10 * this.t1), bitmapShader, i11, i12, this.u1, jcVar);
        }
    }

    public final void k0() {
        this.r = false;
    }

    public final org.telegram.ui.Components.f5 l() {
        Drawable drawable = this.j0;
        if (drawable instanceof org.telegram.ui.Components.f5) {
            return (org.telegram.ui.Components.f5) drawable;
        }
        Drawable drawable2 = this.S;
        if (drawable2 instanceof org.telegram.ui.Components.f5) {
            return (org.telegram.ui.Components.f5) drawable2;
        }
        Drawable drawable3 = this.a0;
        if (drawable3 instanceof org.telegram.ui.Components.f5) {
            return (org.telegram.ui.Components.f5) drawable3;
        }
        Drawable drawable4 = this.m0;
        if (drawable4 instanceof org.telegram.ui.Components.f5) {
            return (org.telegram.ui.Components.f5) drawable4;
        }
        return null;
    }

    public final void l0(boolean z10) {
        this.S0 = z10;
    }

    public final org.telegram.ui.Components.s5 m() {
        Drawable drawable = this.j0;
        if (drawable instanceof org.telegram.ui.Components.s5) {
            return (org.telegram.ui.Components.s5) drawable;
        }
        Drawable drawable2 = this.S;
        if (drawable2 instanceof org.telegram.ui.Components.s5) {
            return (org.telegram.ui.Components.s5) drawable2;
        }
        Drawable drawable3 = this.a0;
        if (drawable3 instanceof org.telegram.ui.Components.s5) {
            return (org.telegram.ui.Components.s5) drawable3;
        }
        Drawable drawable4 = this.m0;
        if (drawable4 instanceof org.telegram.ui.Components.s5) {
            return (org.telegram.ui.Components.s5) drawable4;
        }
        return null;
    }

    public final void m0(Bitmap bitmap) {
        if (bitmap != null) {
            if (this.H == null || this.G != bitmap) {
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                this.H = new BitmapShader(bitmap, tileMode, tileMode);
                R0(this.S);
            }
            this.X0 = true;
        } else {
            this.H = null;
            this.I = null;
            this.K = null;
            this.L = null;
            Bitmap bitmap2 = this.J;
            if (bitmap2 != null) {
                bitmap2.recycle();
                this.J = null;
            }
        }
        this.G = bitmap;
    }

    public final Bitmap n() {
        bi0 B = B();
        if (B != null && B.u()) {
            if (B.Q != null) {
                return B.Q;
            }
            if (B.R != null) {
                return B.R;
            }
            return null;
        }
        org.telegram.ui.Components.s5 m10 = m();
        if (m10 != null && m10.s()) {
            return m10.m();
        }
        Drawable drawable = this.j0;
        if ((drawable instanceof BitmapDrawable) && !(drawable instanceof org.telegram.ui.Components.s5) && !(drawable instanceof bi0)) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        Drawable drawable2 = this.S;
        if ((drawable2 instanceof BitmapDrawable) && !(drawable2 instanceof org.telegram.ui.Components.s5) && !(drawable instanceof bi0)) {
            return ((BitmapDrawable) drawable2).getBitmap();
        }
        Drawable drawable3 = this.a0;
        if ((drawable3 instanceof BitmapDrawable) && !(drawable3 instanceof org.telegram.ui.Components.s5) && !(drawable instanceof bi0)) {
            return ((BitmapDrawable) drawable3).getBitmap();
        }
        Drawable drawable4 = this.m0;
        if (drawable4 instanceof BitmapDrawable) {
            return ((BitmapDrawable) drawable4).getBitmap();
        }
        return null;
    }

    public final void n0(int i10, long j10, Object obj, String str, String str2, String str3, ic icVar, ic icVar2) {
        r0(icVar, str, icVar2, str2, null, j10, str3, obj, i10);
    }

    public final int o() {
        org.telegram.ui.Components.s5 m10 = m();
        if (m10 != null) {
            int i10 = this.U;
            return (i10 % 360 == 0 || i10 % 360 == 180) ? m10.getIntrinsicHeight() : m10.getIntrinsicWidth();
        }
        bi0 B = B();
        if (B != null) {
            return B.c;
        }
        Bitmap n10 = n();
        if (n10 != null) {
            int i11 = this.U;
            return (i11 % 360 == 0 || i11 % 360 == 180) ? n10.getHeight() : n10.getWidth();
        }
        Drawable drawable = this.m0;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return 1;
    }

    public final void o0(String str, String str2, Drawable drawable, String str3, long j10) {
        r0(ic.g(str), str2, null, null, drawable, j10, str3, null, 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final kc p() {
        Bitmap bitmap;
        String str;
        org.telegram.ui.Components.s5 m10 = m();
        bi0 B = B();
        int i10 = 0;
        if (B != null && B.u()) {
            bitmap = B.Q != null ? B.Q : B.R != null ? B.R : null;
        } else {
            if (m10 == null || !m10.s()) {
                Drawable drawable = this.j0;
                if (!(drawable instanceof BitmapDrawable) || (drawable instanceof org.telegram.ui.Components.s5) || (drawable instanceof bi0)) {
                    Drawable drawable2 = this.S;
                    if (!(drawable2 instanceof BitmapDrawable) || (drawable2 instanceof org.telegram.ui.Components.s5) || (drawable instanceof bi0)) {
                        Drawable drawable3 = this.a0;
                        if (!(drawable3 instanceof BitmapDrawable) || (drawable3 instanceof org.telegram.ui.Components.s5) || (drawable instanceof bi0)) {
                            Drawable drawable4 = this.m0;
                            if (drawable4 instanceof BitmapDrawable) {
                                bitmap = ((BitmapDrawable) drawable4).getBitmap();
                            } else {
                                bitmap = null;
                                str = null;
                            }
                        } else {
                            bitmap = ((BitmapDrawable) drawable3).getBitmap();
                            str = this.Y;
                        }
                    } else {
                        bitmap = ((BitmapDrawable) drawable2).getBitmap();
                        str = this.Q;
                    }
                } else {
                    bitmap = ((BitmapDrawable) drawable).getBitmap();
                    str = this.h0;
                }
                if (bitmap == null) {
                    return new kc(bitmap, str, i10);
                }
                return null;
            }
            Bitmap m11 = m10.m();
            i10 = m10.d[2];
            if (i10 != 0) {
                return new kc(Bitmap.createBitmap(m11), null, i10);
            }
            bitmap = m11;
        }
        str = null;
        if (bitmap == null) {
        }
    }

    public final void p0(ic icVar, String str, Drawable drawable, long j10, String str2, Object obj, int i10) {
        r0(icVar, str, null, null, drawable, j10, str2, obj, i10);
    }

    public final int q() {
        org.telegram.ui.Components.s5 m10 = m();
        if (m10 != null) {
            int i10 = this.U;
            return (i10 % 360 == 0 || i10 % 360 == 180) ? m10.getIntrinsicWidth() : m10.getIntrinsicHeight();
        }
        bi0 B = B();
        if (B != null) {
            return B.b;
        }
        Bitmap n10 = n();
        if (n10 != null) {
            int i11 = this.U;
            return (i11 % 360 == 0 || i11 % 360 == 180) ? n10.getWidth() : n10.getHeight();
        }
        Drawable drawable = this.m0;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return 1;
    }

    public final void q0(ic icVar, String str, Drawable drawable, String str2, Object obj, int i10) {
        r0(icVar, str, null, null, drawable, 0L, str2, obj, i10);
    }

    public final float r() {
        return (this.M0 / 2.0f) + this.K0;
    }

    public final void r0(ic icVar, String str, ic icVar2, String str2, Drawable drawable, long j10, String str3, Object obj, int i10) {
        u0(null, null, icVar, str, icVar2, str2, drawable, j10, str3, obj, i10);
    }

    public final float s() {
        return (this.N0 / 2.0f) + this.L0;
    }

    public final void s0(ic icVar, String str, ic icVar2, String str2, Drawable drawable, Object obj, int i10) {
        u0(null, null, icVar, str, icVar2, str2, drawable, 0L, null, obj, i10);
    }

    public void setAlpha(float f7) {
        this.d1 = f7;
    }

    public final Drawable t() {
        Drawable drawable = this.j0;
        if (drawable != null) {
            return drawable;
        }
        Drawable drawable2 = this.S;
        if (drawable2 != null) {
            return drawable2;
        }
        Drawable drawable3 = this.a0;
        if (drawable3 != null) {
            return drawable3;
        }
        Drawable drawable4 = this.m0;
        if (drawable4 != null) {
            return drawable4;
        }
        return null;
    }

    public final void t0(ic icVar, String str, ic icVar2, String str2, String str3, Object obj, int i10) {
        r0(icVar, str, icVar2, str2, null, 0L, str3, obj, i10);
    }

    public final kc u() {
        String str;
        String str2;
        Drawable drawable = this.j0;
        kc kcVar = null;
        if (!(drawable instanceof BitmapDrawable) || (drawable instanceof org.telegram.ui.Components.s5) || (drawable instanceof bi0)) {
            Drawable drawable2 = this.S;
            if (!(drawable2 instanceof BitmapDrawable) || (drawable2 instanceof org.telegram.ui.Components.s5) || (drawable instanceof bi0)) {
                drawable2 = this.a0;
                if (!(drawable2 instanceof BitmapDrawable) || (drawable2 instanceof org.telegram.ui.Components.s5) || (drawable instanceof bi0)) {
                    drawable = this.m0;
                    if (drawable instanceof BitmapDrawable) {
                        str = null;
                    } else {
                        drawable = null;
                        str = null;
                    }
                } else {
                    str2 = this.Y;
                }
            } else {
                str2 = this.Q;
            }
            Drawable drawable3 = drawable2;
            str = str2;
            drawable = drawable3;
        } else {
            str = this.h0;
        }
        if (drawable != null) {
            kcVar = new kc();
            kcVar.d = drawable;
            kcVar.a = str;
            kcVar.e = 0;
            if (str != null) {
                hc.D().H(kcVar.a);
            }
        }
        return kcVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0218 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0383  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0372  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:208:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:213:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0185  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void u0(ic icVar, String str, ic icVar2, String str2, ic icVar3, String str3, Drawable drawable, long j10, String str4, Object obj, int i10) {
        Paint paint;
        String str5;
        Paint paint2;
        String q6;
        String str6;
        ic icVar4;
        String q10;
        boolean z10;
        Bitmap bitmap;
        mc mcVar;
        boolean z11;
        mc mcVar2;
        String str7;
        oc ocVar;
        ic icVar5;
        ic icVar6;
        ic icVar7;
        ic icVar8 = icVar;
        ic icVar9 = icVar2;
        if (this.z1 && !this.x1) {
            if (this.E == null) {
                this.E = new oc();
            }
            oc ocVar2 = this.E;
            ocVar2.e = icVar8;
            ocVar2.f = str;
            ocVar2.a = icVar9;
            ocVar2.b = str2;
            ocVar2.c = icVar3;
            ocVar2.d = str3;
            ocVar2.g = drawable;
            ocVar2.h = j10;
            ocVar2.k = str4;
            ocVar2.i = i10;
            ocVar2.j = obj;
            return;
        }
        if (this.o0) {
            return;
        }
        if (this.A0 && (ocVar = this.E) != null && (((icVar5 = ocVar.a) != null && (icVar5.v != null || icVar5.g != null)) || (((icVar6 = ocVar.c) != null && (icVar6.v != null || icVar6.g != null)) || ((icVar7 = ocVar.e) != null && (icVar7.v != null || icVar7.g != null))))) {
            Y();
        }
        oc ocVar3 = this.E;
        if (ocVar3 != null) {
            ocVar3.a = null;
            ocVar3.c = null;
            ocVar3.e = null;
            ocVar3.g = null;
        }
        Paint paint3 = this.Z0;
        if (icVar9 == null && icVar3 == null && icVar8 == null) {
            for (int i11 = 0; i11 < 4; i11++) {
                S(i11, null);
            }
            this.O = null;
            this.P = null;
            this.Q = null;
            this.f0 = null;
            this.g0 = null;
            this.h0 = null;
            this.W = null;
            this.X = null;
            this.Y = null;
            this.j0 = null;
            this.k0 = null;
            this.S = null;
            this.T = null;
            this.I = null;
            this.b0 = null;
            this.E0 = null;
            this.K = null;
            this.L = null;
            Bitmap bitmap2 = this.J;
            if (bitmap2 != null) {
                bitmap2.recycle();
                this.J = null;
            }
            this.n0 = str4;
            this.h = null;
            this.r0 = 0;
            paint3.setShader(null);
            N0(drawable);
            this.h1 = 1.0f;
            this.i1 = 1.0f;
            this.q0 = 0L;
            R0(this.m0);
            hc.D().h(this, true);
            invalidate();
            mc mcVar3 = this.g1;
            if (mcVar3 != null) {
                Drawable drawable2 = this.S;
                mcVar3.o(this, (drawable2 == null && this.a0 == null && this.m0 == null && this.j0 == null) ? false : true, drawable2 == null && this.j0 == null, false);
                return;
            }
            return;
        }
        String q11 = icVar9 != null ? icVar9.q(obj, null, false) : null;
        if (q11 == null && icVar9 != null) {
            icVar9 = null;
        }
        this.C1 = Math.max(this.y0, 0);
        this.I0 = false;
        if (q11 == null && this.F0 && ((obj instanceof jj) || this.H0 != null)) {
            TLRPC.Document document = this.H0;
            if (document == null) {
                document = ((jj) obj).F0();
            }
            if (document != null && document.dc_id != 0) {
                paint = paint3;
                if (document.id != 0) {
                    q11 = "q_" + document.dc_id + "_" + document.id;
                    this.I0 = true;
                }
                str5 = q11;
                if (str5 != null && str2 != null) {
                    str5 = a1.g.C(str5, "@", str2);
                }
                if (this.v1 == null) {
                    paint2 = paint;
                    str5 = a1.g.r(new StringBuilder(), this.v1, str5);
                } else {
                    paint2 = paint;
                }
                q6 = icVar8 == null ? icVar8.q(obj, null, false) : null;
                if (q6 == null && icVar8 != null) {
                    icVar8 = null;
                }
                if (q6 != null && str != null) {
                    q6 = a1.g.C(q6, "@", str);
                }
                if (this.v1 != null) {
                    q6 = a1.g.r(new StringBuilder(), this.v1, q6);
                }
                if ((q6 == null && (str7 = this.Q) != null && str7.equals(str5)) || ((str6 = this.h0) != null && str6.equals(q6))) {
                    mcVar2 = this.g1;
                    if (mcVar2 != null) {
                        Drawable drawable3 = this.S;
                        mcVar2.o(this, (drawable3 == null && this.a0 == null && this.m0 == null && this.j0 == null) ? false : true, drawable3 == null && this.j0 == null, false);
                    }
                    if (!this.n) {
                        return;
                    }
                }
                icVar4 = this.N;
                if (icVar4 == null) {
                    icVar4 = icVar8 != null ? icVar8 : icVar9;
                }
                if (icVar4 == null) {
                    icVar4 = icVar3;
                }
                q10 = icVar3 != null ? icVar3.q(obj, icVar4, false) : null;
                if (q10 != null && str3 != null) {
                    q10 = a1.g.C(q10, "@", str3);
                }
                if (this.A0) {
                    Object obj2 = this.h;
                    if (obj2 instanceof jj) {
                        jj jjVar = (jj) obj2;
                        if (jjVar.c2 != null && (jj.n1(jjVar) instanceof TLRPC.TL_messageMediaGeoLive)) {
                            jj jjVar2 = (jj) this.h;
                            jjVar2.d2 = jjVar2.c2;
                        }
                    }
                    Drawable drawable4 = this.j0;
                    if (drawable4 != null) {
                        if (drawable4 instanceof org.telegram.ui.Components.s5) {
                            ((org.telegram.ui.Components.s5) drawable4).stop();
                            ((org.telegram.ui.Components.s5) this.j0).v(this);
                        }
                        S(1, q10);
                        S(2, null);
                        S(0, q6);
                        this.C0 = this.j0;
                        this.E0 = this.k0;
                        this.D0 = this.Q;
                        this.B0 = false;
                        this.j0 = null;
                        this.h0 = null;
                    } else if (this.S != null) {
                        S(1, q10);
                        S(2, null);
                        S(3, q6);
                        this.E0 = this.T;
                        this.C0 = this.S;
                        this.D0 = this.Q;
                        this.B0 = false;
                        this.S = null;
                        this.Q = null;
                    } else if (this.a0 != null) {
                        S(0, str5);
                        S(2, null);
                        S(3, q6);
                        this.E0 = this.b0;
                        this.C0 = this.a0;
                        this.D0 = this.Y;
                        this.B0 = false;
                        this.a0 = null;
                        this.Y = null;
                    } else if (this.m0 != null) {
                        S(0, str5);
                        S(1, q10);
                        S(2, null);
                        S(3, q6);
                        this.E0 = this.c0;
                        this.C0 = this.m0;
                        this.B0 = false;
                        this.D0 = null;
                        this.a0 = null;
                        this.Y = null;
                    } else {
                        S(0, str5);
                        z10 = true;
                        S(1, q10);
                        S(2, null);
                        S(3, q6);
                        this.E0 = null;
                    }
                    z10 = true;
                } else {
                    z10 = true;
                    S(0, str5);
                    S(1, q10);
                    S(2, null);
                    S(3, q6);
                    this.E0 = null;
                }
                this.O = icVar9;
                this.P = str2;
                this.Q = str5;
                this.f0 = icVar8;
                this.g0 = str;
                this.h0 = q6;
                this.W = icVar3;
                this.X = str3;
                this.Y = q10;
                this.h = obj;
                this.n0 = str4;
                this.q0 = j10;
                this.r0 = i10;
                N0(drawable);
                this.T = null;
                this.I = null;
                this.b0 = null;
                this.c0 = null;
                this.k0 = null;
                this.K = null;
                this.L = null;
                paint2.setShader(null);
                bitmap = this.J;
                if (bitmap != null) {
                    bitmap.recycle();
                    this.J = null;
                }
                this.h1 = 1.0f;
                this.i1 = 1.0f;
                R0(this.m0);
                mcVar = this.g1;
                if (mcVar != null) {
                    Drawable drawable5 = this.S;
                    z11 = false;
                    mcVar.o(this, (drawable5 == null && this.a0 == null && this.m0 == null && this.j0 == null) ? false : z10, (drawable5 == null && this.j0 == null) ? z10 : false, false);
                } else {
                    z11 = false;
                }
                hc.D().M(this, this.a);
                invalidate();
                this.p1 = ((obj instanceof jj) || !((jj) obj).h4()) ? z11 : z10;
            }
        }
        paint = paint3;
        str5 = q11;
        if (str5 != null) {
            str5 = a1.g.C(str5, "@", str2);
        }
        if (this.v1 == null) {
        }
        if (icVar8 == null) {
        }
        if (q6 == null) {
            icVar8 = null;
        }
        if (q6 != null) {
            q6 = a1.g.C(q6, "@", str);
        }
        if (this.v1 != null) {
        }
        if (q6 == null) {
            mcVar2 = this.g1;
            if (mcVar2 != null) {
            }
            if (!this.n) {
            }
            icVar4 = this.N;
            if (icVar4 == null) {
            }
            if (icVar4 == null) {
            }
            if (icVar3 != null) {
            }
            if (q10 != null) {
                q10 = a1.g.C(q10, "@", str3);
            }
            if (this.A0) {
            }
            this.O = icVar9;
            this.P = str2;
            this.Q = str5;
            this.f0 = icVar8;
            this.g0 = str;
            this.h0 = q6;
            this.W = icVar3;
            this.X = str3;
            this.Y = q10;
            this.h = obj;
            this.n0 = str4;
            this.q0 = j10;
            this.r0 = i10;
            N0(drawable);
            this.T = null;
            this.I = null;
            this.b0 = null;
            this.c0 = null;
            this.k0 = null;
            this.K = null;
            this.L = null;
            paint2.setShader(null);
            bitmap = this.J;
            if (bitmap != null) {
            }
            this.h1 = 1.0f;
            this.i1 = 1.0f;
            R0(this.m0);
            mcVar = this.g1;
            if (mcVar != null) {
            }
            hc.D().M(this, this.a);
            invalidate();
            this.p1 = ((obj instanceof jj) || !((jj) obj).h4()) ? z11 : z10;
        }
        mcVar2 = this.g1;
        if (mcVar2 != null) {
        }
        if (!this.n) {
        }
        icVar4 = this.N;
        if (icVar4 == null) {
        }
        if (icVar4 == null) {
        }
        if (icVar3 != null) {
        }
        if (q10 != null) {
        }
        if (this.A0) {
        }
        this.O = icVar9;
        this.P = str2;
        this.Q = str5;
        this.f0 = icVar8;
        this.g0 = str;
        this.h0 = q6;
        this.W = icVar3;
        this.X = str3;
        this.Y = q10;
        this.h = obj;
        this.n0 = str4;
        this.q0 = j10;
        this.r0 = i10;
        N0(drawable);
        this.T = null;
        this.I = null;
        this.b0 = null;
        this.c0 = null;
        this.k0 = null;
        this.K = null;
        this.L = null;
        paint2.setShader(null);
        bitmap = this.J;
        if (bitmap != null) {
        }
        this.h1 = 1.0f;
        this.i1 = 1.0f;
        R0(this.m0);
        mcVar = this.g1;
        if (mcVar != null) {
        }
        hc.D().M(this, this.a);
        invalidate();
        this.p1 = ((obj instanceof jj) || !((jj) obj).h4()) ? z11 : z10;
    }

    public final float v() {
        return this.N0;
    }

    public final void v0(Bitmap bitmap) {
        w0(bitmap != null ? new BitmapDrawable((Resources) null, bitmap) : null);
    }

    public final float w() {
        return this.M0;
    }

    public final void w0(Drawable drawable) {
        boolean z10 = true;
        hc.D().h(this, true);
        if (!this.A0) {
            for (int i10 = 0; i10 < 4; i10++) {
                S(i10, null);
            }
        } else if (this.S != null) {
            S(1, null);
            S(2, null);
            S(3, null);
            this.E0 = this.T;
            this.C0 = this.S;
            this.D0 = this.Q;
            this.B0 = true;
        } else if (this.a0 != null) {
            S(0, null);
            S(2, null);
            S(3, null);
            this.E0 = this.b0;
            this.C0 = this.a0;
            this.D0 = this.Y;
            this.B0 = true;
        } else if (this.m0 != null) {
            S(0, null);
            S(1, null);
            S(2, null);
            S(3, null);
            this.E0 = this.c0;
            this.C0 = this.m0;
            this.B0 = true;
            this.D0 = null;
        } else {
            for (int i11 = 0; i11 < 4; i11++) {
                S(i11, null);
            }
            this.E0 = null;
        }
        Drawable drawable2 = this.m0;
        if (drawable2 instanceof pj0) {
            cc0 cc0Var = (cc0) ((pj0) drawable2);
            b6.q(cc0Var.r.I1).v(cc0Var);
            cc0Var.n = null;
            cc0Var.r = null;
        }
        if (drawable instanceof org.telegram.ui.Components.f5) {
            org.telegram.ui.Components.f5 f5Var = (org.telegram.ui.Components.f5) drawable;
            if (this.x1) {
                f5Var.b(this);
            }
        } else if (drawable instanceof org.telegram.ui.Components.s5) {
            org.telegram.ui.Components.s5 s5Var = (org.telegram.ui.Components.s5) drawable;
            View view = this.e;
            if (s5Var.r0 == null) {
                s5Var.r0 = new WeakReference(view);
            }
            if (this.x1) {
                s5Var.e(this);
            }
            boolean z11 = this.v0 || s5Var.n0;
            if (!s5Var.n0) {
                s5Var.v0 = z11;
            }
            if (this.t0 && this.D == 0) {
                s5Var.j();
            }
            boolean z12 = this.w0;
            s5Var.D = z12;
            if (z12) {
                s5Var.x(false);
            }
        } else if (drawable instanceof bi0) {
            bi0 bi0Var = (bi0) drawable;
            if (this.x1) {
                bi0Var.I0.add(this);
            }
            bi0Var.E = this.s0;
            if (this.u0 && (!bi0Var.z() || this.D == 0)) {
                bi0Var.start();
            }
            bi0Var.J(true);
        }
        this.c0 = null;
        this.b0 = null;
        this.Z0.setShader(null);
        N0(drawable);
        R0(drawable);
        this.f0 = null;
        this.g0 = null;
        Drawable drawable3 = this.j0;
        if (drawable3 instanceof org.telegram.ui.Components.s5) {
            ((org.telegram.ui.Components.s5) drawable3).v(this);
        }
        this.j0 = null;
        this.h0 = null;
        this.k0 = null;
        this.O = null;
        this.P = null;
        this.S = null;
        this.Q = null;
        this.T = null;
        this.I = null;
        this.K = null;
        this.L = null;
        Bitmap bitmap = this.J;
        if (bitmap != null) {
            bitmap.recycle();
            this.J = null;
        }
        this.W = null;
        this.X = null;
        this.Y = null;
        this.I0 = false;
        this.n0 = null;
        this.q0 = 0L;
        this.r0 = 0;
        this.h1 = 1.0f;
        this.i1 = 1.0f;
        oc ocVar = this.E;
        if (ocVar != null) {
            ocVar.a = null;
            ocVar.c = null;
            ocVar.e = null;
            ocVar.g = null;
        }
        mc mcVar = this.g1;
        if (mcVar != null) {
            mcVar.o(this, (this.a0 == null && this.m0 == null) ? false : true, true, false);
        }
        invalidate();
        if (this.U0 && this.A0 && this.C0 != null) {
            this.h1 = 0.0f;
            this.j1 = System.currentTimeMillis();
            if (this.a0 == null && this.m0 == null) {
                z10 = false;
            }
            this.m1 = z10;
        }
    }

    public final float x() {
        return this.K0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:107:0x00bb, code lost:
    
        if ((r9 instanceof org.telegram.messenger.g6) == false) goto L187;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x026a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean x0(Drawable drawable, String str, int i10, boolean z10, int i11) {
        org.telegram.ui.Components.s5 m10;
        Drawable drawable2;
        Drawable drawable3;
        Drawable drawable4;
        boolean z11;
        mc mcVar;
        boolean z12;
        if (drawable != null && str != null && this.p0 == i11) {
            if (i10 == 0) {
                if (str.equals(this.Q)) {
                    mc mcVar2 = this.g1;
                    if (mcVar2 != null) {
                        mcVar2.q(i10, drawable);
                    }
                    if (drawable instanceof org.telegram.ui.Components.s5) {
                        org.telegram.ui.Components.s5 s5Var = (org.telegram.ui.Components.s5) drawable;
                        s5Var.C(this.q1, this.r1);
                        if (s5Var.n0) {
                            hc.D().H(this.Q);
                        }
                        if (this.y1) {
                            z12 = !s5Var.s();
                            this.S = drawable;
                            if (drawable instanceof p6) {
                            }
                            R0(drawable);
                            if (z12) {
                            }
                            this.h1 = 1.0f;
                            this.i1 = 1.0f;
                            mcVar = this.g1;
                            if (mcVar != null) {
                            }
                            if (!(drawable instanceof org.telegram.ui.Components.f5)) {
                            }
                            invalidate();
                            return true;
                        }
                        z12 = true;
                        this.S = drawable;
                        if (drawable instanceof p6) {
                        }
                        R0(drawable);
                        if (z12) {
                        }
                        this.h1 = 1.0f;
                        this.i1 = 1.0f;
                        mcVar = this.g1;
                        if (mcVar != null) {
                        }
                        if (!(drawable instanceof org.telegram.ui.Components.f5)) {
                        }
                        invalidate();
                        return true;
                    }
                    hc.D().H(this.Q);
                    if (this.y1 && (drawable == this.S || this.h1 < 1.0f)) {
                        z12 = false;
                        this.S = drawable;
                        if (drawable instanceof p6) {
                            p6 p6Var = (p6) drawable;
                            this.U = p6Var.b;
                            this.V = p6Var.a;
                        }
                        R0(drawable);
                        if (z12 || !this.Q0 || (((z10 || this.S0) && !this.U0) || this.s1 == 0)) {
                            this.h1 = 1.0f;
                            this.i1 = 1.0f;
                        } else {
                            Drawable drawable5 = this.j0;
                            if (!(drawable5 instanceof bi0) || !((bi0) drawable5).u()) {
                                Drawable drawable6 = this.j0;
                                if (!(drawable6 instanceof org.telegram.ui.Components.s5) || !((org.telegram.ui.Components.s5) drawable6).s()) {
                                    if (this.S instanceof bi0) {
                                        Drawable drawable7 = this.m0;
                                        if (!(drawable7 instanceof v80)) {
                                            if (!(drawable7 instanceof c00)) {
                                            }
                                        }
                                    }
                                    Drawable drawable8 = this.a0;
                                    if (drawable8 != null || this.m0 != null || this.U0) {
                                        if (drawable8 == null || this.m0 == null) {
                                            this.i1 = 1.0f;
                                        } else {
                                            this.i1 = this.h1;
                                        }
                                        this.h1 = 0.0f;
                                        this.j1 = System.currentTimeMillis();
                                        this.m1 = (this.C0 == null && this.a0 == null && this.m0 == null) ? false : true;
                                    }
                                }
                            }
                        }
                        mcVar = this.g1;
                        if (mcVar != null) {
                            Drawable drawable9 = this.S;
                            mcVar.o(this, (drawable9 == null && this.a0 == null && this.m0 == null && this.j0 == null) ? false : true, drawable9 == null && this.j0 == null, z10);
                        }
                        if (!(drawable instanceof org.telegram.ui.Components.f5)) {
                            org.telegram.ui.Components.f5 f5Var = (org.telegram.ui.Components.f5) drawable;
                            if (this.x1) {
                                f5Var.b(this);
                            }
                        } else if (drawable instanceof org.telegram.ui.Components.s5) {
                            org.telegram.ui.Components.s5 s5Var2 = (org.telegram.ui.Components.s5) drawable;
                            boolean z13 = this.v0;
                            if (!s5Var2.n0) {
                                s5Var2.v0 = z13;
                            }
                            if (this.x1) {
                                s5Var2.e(this);
                            }
                            if (this.t0 && this.D == 0) {
                                s5Var2.j();
                            }
                            boolean z14 = this.w0;
                            s5Var2.D = z14;
                            if (z14) {
                                s5Var2.x(false);
                            }
                            this.z0 = false;
                            View view = this.e;
                            if (view != null) {
                                view.invalidate();
                            }
                        } else if (drawable instanceof bi0) {
                            bi0 bi0Var = (bi0) drawable;
                            if (this.x1) {
                                bi0Var.I0.add(this);
                            }
                            if (this.u0 && (!bi0Var.z() || this.D == 0)) {
                                bi0Var.start();
                            }
                            bi0Var.J(true);
                            bi0Var.K(this.x0);
                            bi0Var.L = this.y0;
                            bi0Var.E0 = this.b;
                            this.z0 = false;
                        }
                        invalidate();
                        return true;
                    }
                    z12 = true;
                    this.S = drawable;
                    if (drawable instanceof p6) {
                    }
                    R0(drawable);
                    if (z12) {
                    }
                    this.h1 = 1.0f;
                    this.i1 = 1.0f;
                    mcVar = this.g1;
                    if (mcVar != null) {
                    }
                    if (!(drawable instanceof org.telegram.ui.Components.f5)) {
                    }
                    invalidate();
                    return true;
                }
            } else {
                if (i10 != 3) {
                    if (i10 == 1) {
                        if (this.a0 == null && ((this.S0 || (((m10 = m()) == null || !m10.s()) && (((drawable2 = this.S) == null || (drawable2 instanceof org.telegram.ui.Components.s5)) && ((drawable3 = this.j0) == null || (drawable3 instanceof org.telegram.ui.Components.s5))))) && str.equals(this.Y))) {
                            mc mcVar3 = this.g1;
                            if (mcVar3 != null) {
                                mcVar3.q(i10, drawable);
                            }
                            hc.D().H(this.Y);
                            this.a0 = drawable;
                            if (drawable instanceof p6) {
                                p6 p6Var2 = (p6) drawable;
                                this.d0 = p6Var2.b;
                                this.e0 = p6Var2.a;
                            }
                            R0(drawable);
                            if (z10 || this.k1 == 2) {
                                this.h1 = 1.0f;
                                this.i1 = 1.0f;
                            } else {
                                Object obj = this.h;
                                if ((obj instanceof jj) && ((jj) obj).h4() && ((jj) this.h).o4()) {
                                    this.h1 = 1.0f;
                                    this.i1 = 1.0f;
                                } else {
                                    this.h1 = 0.0f;
                                    this.i1 = 1.0f;
                                    this.j1 = System.currentTimeMillis();
                                    this.m1 = this.m0 != null;
                                }
                            }
                        }
                    }
                    mcVar = this.g1;
                    if (mcVar != null) {
                    }
                    if (!(drawable instanceof org.telegram.ui.Components.f5)) {
                    }
                    invalidate();
                    return true;
                }
                if (str.equals(this.h0)) {
                    mc mcVar4 = this.g1;
                    if (mcVar4 != null) {
                        mcVar4.q(i10, drawable);
                    }
                    if (drawable instanceof org.telegram.ui.Components.s5) {
                        org.telegram.ui.Components.s5 s5Var3 = (org.telegram.ui.Components.s5) drawable;
                        s5Var3.C(this.q1, this.r1);
                        if (s5Var3.n0) {
                            hc.D().H(this.h0);
                        }
                        if (this.y1 && (((z11 = (drawable4 = this.a0) instanceof org.telegram.ui.Components.s5)) || (this.S instanceof org.telegram.ui.Components.s5))) {
                            s5Var3.y(z11 ? ((org.telegram.ui.Components.s5) drawable4).c : 0L, true, true);
                        }
                    } else {
                        hc.D().H(this.h0);
                    }
                    this.j0 = drawable;
                    R0(drawable);
                    if (this.S == null) {
                        if ((z10 || this.S0) && !this.U0) {
                            this.h1 = 1.0f;
                            this.i1 = 1.0f;
                        } else {
                            Drawable drawable10 = this.a0;
                            if ((drawable10 == null && this.m0 == null) || this.h1 == 1.0f || this.U0) {
                                if (drawable10 == null || this.m0 == null) {
                                    this.i1 = 1.0f;
                                } else {
                                    this.i1 = this.h1;
                                }
                                this.h1 = 0.0f;
                                this.j1 = System.currentTimeMillis();
                                this.m1 = (this.C0 == null && this.a0 == null && this.m0 == null) ? false : true;
                            }
                        }
                    }
                    mcVar = this.g1;
                    if (mcVar != null) {
                    }
                    if (!(drawable instanceof org.telegram.ui.Components.f5)) {
                    }
                    invalidate();
                    return true;
                }
            }
        }
        return false;
    }

    public final float y() {
        return this.K0 + this.M0;
    }

    public final void y0(float f7, float f10, float f11, float f12) {
        this.K0 = f7;
        this.L0 = f10;
        this.M0 = f11;
        this.N0 = f12;
    }

    public final float z() {
        return this.L0;
    }

    public final void z0(Rect rect) {
        if (rect != null) {
            this.K0 = rect.left;
            this.L0 = rect.top;
            this.M0 = rect.width();
            this.N0 = rect.height();
        }
    }
}
