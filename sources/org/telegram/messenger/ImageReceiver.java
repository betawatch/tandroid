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
import org.telegram.ui.Components.c80;
import org.telegram.ui.Components.e51;
import org.telegram.ui.Components.jb0;
import org.telegram.ui.Components.li0;
import org.telegram.ui.Components.zg0;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public class ImageReceiver implements ls, org.telegram.ui.Components.n5 {
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
    public ab.b0 D1;
    public nc E;
    public BitmapShader E0;
    public di.k4 E1;
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
    public hc N;
    public float N0;
    public hc O;
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
    public hc W;
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
    public hc f0;
    public boolean f1;
    public String g0;
    public lc g1;
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
    public int s1 = qs.g2;
    public final ArrayList w1 = new ArrayList();
    public boolean z1 = false;
    public boolean B1 = true;
    public final Paint Z0 = new Paint(3);
    public int d = p10.s0;

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

    public final zg0 B() {
        Drawable drawable = this.j0;
        if (drawable instanceof zg0) {
            return (zg0) drawable;
        }
        Drawable drawable2 = this.S;
        if (drawable2 instanceof zg0) {
            return (zg0) drawable2;
        }
        Drawable drawable3 = this.a0;
        if (drawable3 instanceof zg0) {
            return (zg0) drawable3;
        }
        Drawable drawable4 = this.m0;
        if (drawable4 instanceof zg0) {
            return (zg0) drawable4;
        }
        return null;
    }

    public final void B0(int i7) {
        this.M0 = i7;
    }

    public final int C() {
        return this.U;
    }

    public final void C0(float f10) {
        this.K0 = f10;
    }

    public final int[] D() {
        return this.W0;
    }

    public final void D0(float f10) {
        this.L0 = f10;
    }

    public final int[] E() {
        if (this.V0) {
            return this.W0;
        }
        return null;
    }

    public final void E0(int i7) {
        this.x = i7;
        if (this.x1) {
            this.D = qs.e().p & (~this.x);
        }
    }

    public final Drawable F() {
        return this.m0;
    }

    public final void F0(long j3, long j10) {
        this.q1 = j3;
        this.r1 = j10;
        Drawable drawable = this.j0;
        if (drawable instanceof org.telegram.ui.Components.u5) {
            ((org.telegram.ui.Components.u5) drawable).C(j3, j10);
        }
    }

    public final int G(int i7) {
        return i7 == 1 ? this.Z : i7 == 3 ? this.i0 : this.R;
    }

    public final void G0(int i7, int i10, boolean z9) {
        while (i7 < 0) {
            i7 += 360;
        }
        while (i7 > 360) {
            i7 -= 360;
        }
        this.d0 = i7;
        this.U = i7;
        this.e0 = i10;
        this.V = i10;
        this.f1 = z9;
    }

    public final boolean H() {
        return this.Q0;
    }

    public final void H0(View view) {
        this.e = view;
        org.telegram.ui.Components.u5 m10 = m();
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

    public final void I0(int i7) {
        this.e1 = i7;
    }

    public final boolean J() {
        return (this.S == null && this.j0 == null) ? false : true;
    }

    public final void J0(int i7) {
        L0(new int[]{i7, i7, i7, i7});
    }

    public final boolean K() {
        return (this.S == null && this.j0 == null && this.a0 == null && this.m0 == null && this.Q == null && this.h0 == null) ? false : true;
    }

    public final void K0(int i7, int i10, int i11, int i12) {
        L0(new int[]{i7, i10, i11, i12});
    }

    public final boolean L() {
        return (this.S == null && this.j0 == null && !(this.m0 instanceof e51)) ? false : true;
    }

    public void L0(int[] iArr) {
        int i7 = iArr[0];
        this.X0 = true;
        int i10 = 0;
        boolean z9 = false;
        while (true) {
            int[] iArr2 = this.W0;
            if (i10 >= iArr2.length) {
                break;
            }
            int i11 = iArr2[i10];
            int i12 = iArr[i10];
            if (i11 != i12) {
                z9 = true;
            }
            if (i7 != i12) {
                this.X0 = false;
            }
            iArr2[i10] = i12;
            i10++;
        }
        if (z9) {
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
        org.telegram.ui.Components.u5 m10 = m();
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
        org.telegram.ui.Components.q6 q6Var;
        Drawable drawable2 = this.m0;
        if (drawable == drawable2) {
            return;
        }
        if (!(drawable2 instanceof org.telegram.ui.Components.q6)) {
            q6Var = null;
        } else if (drawable2.equals(drawable)) {
            return;
        } else {
            q6Var = (org.telegram.ui.Components.q6) this.m0;
        }
        this.m0 = drawable;
        if (this.x1 && (drawable instanceof org.telegram.ui.Components.q6)) {
            ((org.telegram.ui.Components.q6) drawable).c(this);
        }
        if (!this.x1 || q6Var == null) {
            return;
        }
        q6Var.b(this);
    }

    public final boolean O(float f10, float f11) {
        float f12 = this.K0;
        if (f10 < f12 || f10 > f12 + this.M0) {
            return false;
        }
        float f13 = this.L0;
        return f11 >= f13 && f11 <= f13 + this.N0;
    }

    public final void O0(boolean z9, boolean z10) {
        if (this.Q0 == z9) {
            return;
        }
        this.Q0 = z9;
        if (z10) {
            invalidate();
            di.k4 k4Var = this.E1;
            if (k4Var != null) {
                k4Var.run();
            }
        }
    }

    public final boolean P() {
        if (!this.x1) {
            this.x1 = true;
            this.D = qs.e().p & (~this.x);
            boolean z9 = this.y;
            int i7 = qs.j1;
            if (!z9) {
                ab.b0 b0Var = this.D1;
                if (b0Var != null) {
                    b0Var.b();
                    this.D1 = null;
                }
                ab.b0 b0Var2 = (ab.b0) new ps(qs.e(), this).b;
                b0Var2.c(qs.m4);
                b0Var2.c(i7);
                b0Var2.c(qs.k1);
                this.D1 = b0Var2;
            }
            if (Y()) {
                return true;
            }
            zg0 B = B();
            if (B != null) {
                B.I0.add(this);
                B.E = this.s0;
            }
            if (B != null && this.u0 && (!B.z() || this.D == 0)) {
                B.start();
            }
            org.telegram.ui.Components.u5 m10 = m();
            if (m10 != null) {
                m10.e(this);
            }
            if (m10 != null && this.t0 && this.D == 0) {
                m10.j();
                invalidate();
            }
            org.telegram.ui.Components.h5 l10 = l();
            if (l10 != null) {
                l10.b(this);
            }
            if (qs.e().g()) {
                didReceivedNotification(i7, this.d, 512);
            }
            Object obj = this.m0;
            if (obj instanceof org.telegram.ui.Components.q6) {
                ((org.telegram.ui.Components.q6) obj).c(this);
            }
            if (this.c != null) {
                for (int i10 = 0; i10 < this.c.size(); i10++) {
                    ((kc) this.c.get(i10)).a(this);
                }
            }
        }
        return false;
    }

    public final void P0(boolean z9) {
        org.telegram.ui.Components.u5 m10 = m();
        if (m10 != null) {
            boolean z10 = this.v0;
            if (!m10.n0) {
                m10.v0 = z10;
            }
            m10.start();
            return;
        }
        zg0 B = B();
        if (B == null || B.k0) {
            return;
        }
        B.H(z9);
    }

    public final void Q(Drawable drawable) {
        if (drawable == this.j0 && this.h0 != null) {
            gc.D().Q(this.h0);
            this.h0 = null;
        } else if (drawable == this.S && this.Q != null) {
            gc.D().Q(this.Q);
            this.Q = null;
        } else if (drawable == this.a0 && this.Y != null) {
            gc.D().Q(this.Y);
            this.Y = null;
        }
        u0(this.f0, this.g0, this.O, this.P, this.W, this.X, this.a0, this.q0, this.n0, this.h, this.r0);
    }

    public final void Q0() {
        org.telegram.ui.Components.u5 m10 = m();
        if (m10 != null) {
            m10.stop();
            return;
        }
        zg0 B = B();
        if (B != null) {
            B.stop();
        }
    }

    public final void R() {
        ab.b0 b0Var;
        if (this.x1) {
            this.x1 = false;
            hc hcVar = this.O;
            if (hcVar != null || this.f0 != null || this.W != null || this.m0 != null) {
                if (this.E == null) {
                    this.E = new nc();
                }
                nc ncVar = this.E;
                ncVar.e = this.f0;
                ncVar.f = this.g0;
                ncVar.a = hcVar;
                ncVar.b = this.P;
                ncVar.c = this.W;
                ncVar.d = this.X;
                ncVar.g = this.m0;
                ncVar.h = this.q0;
                ncVar.k = this.n0;
                ncVar.i = this.r0;
                ncVar.j = this.h;
            }
            if (!this.y && (b0Var = this.D1) != null) {
                b0Var.b();
                this.D1 = null;
            }
            Object obj = this.m0;
            if (obj instanceof org.telegram.ui.Components.q6) {
                ((org.telegram.ui.Components.q6) obj).b(this);
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
            org.telegram.ui.Components.h5 l10 = l();
            if (l10 != null) {
                l10.o(this);
            }
            org.telegram.ui.Components.u5 m10 = m();
            if (m10 != null) {
                m10.v(this);
            }
            zg0 B = B();
            if (B != null) {
                B.F(this);
            }
            if (this.c != null) {
                for (int i7 = 0; i7 < this.c.size(); i7++) {
                    ArrayList arrayList = ((di.v9) ((kc) this.c.get(i7))).a;
                    if (arrayList != null) {
                        for (int i10 = 0; i10 < arrayList.size(); i10++) {
                            ((di.r9) arrayList.get(i10)).b(false);
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
        if (!(drawable instanceof org.telegram.ui.Components.np)) {
            if (!(drawable instanceof BitmapDrawable) && !(drawable instanceof org.telegram.ui.Components.v8)) {
                f0(drawable, null);
                return;
            }
            if (drawable instanceof org.telegram.ui.Components.v8) {
                ((org.telegram.ui.Components.v8) drawable).r = E[0];
                return;
            }
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            if (bitmapDrawable instanceof zg0) {
                return;
            }
            if (bitmapDrawable instanceof org.telegram.ui.Components.u5) {
                ((org.telegram.ui.Components.u5) drawable).B(E);
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
        org.telegram.ui.Components.np npVar = (org.telegram.ui.Components.np) drawable;
        float f10 = E[0];
        float f11 = E[1];
        float f12 = E[2];
        float f13 = E[3];
        float[] fArr = npVar.f;
        float max = Math.max(0.0f, f10);
        fArr[1] = max;
        fArr[0] = max;
        float max2 = Math.max(0.0f, f11);
        fArr[3] = max2;
        fArr[2] = max2;
        float max3 = Math.max(0.0f, f12);
        fArr[5] = max3;
        fArr[4] = max3;
        float max4 = Math.max(0.0f, f13);
        fArr[7] = max4;
        fArr[6] = max4;
        npVar.e = f10 > 0.0f || f11 > 0.0f || f12 > 0.0f || f13 > 0.0f;
        npVar.a();
    }

    public final void S(int i7, String str) {
        String str2;
        Drawable drawable;
        String str3;
        if (i7 == 3) {
            str2 = this.h0;
            drawable = this.j0;
        } else if (i7 == 2) {
            str2 = this.D0;
            drawable = this.C0;
        } else if (i7 == 1) {
            str2 = this.Y;
            drawable = this.a0;
        } else {
            str2 = this.Q;
            drawable = this.S;
        }
        if (str2 != null && ((str2.startsWith("-") || str2.startsWith("strippedmessage-")) && (str3 = (String) gc.D().t.get(str2)) != null)) {
            str2 = str3;
        }
        if (drawable instanceof zg0) {
            ((zg0) drawable).F(this);
        }
        if (drawable instanceof org.telegram.ui.Components.u5) {
            ((org.telegram.ui.Components.u5) drawable).v(this);
        }
        if (drawable instanceof org.telegram.ui.Components.h5) {
            ((org.telegram.ui.Components.h5) drawable).o(this);
        }
        if (str2 != null && ((str == null || !str.equals(str2)) && drawable != null)) {
            if (drawable instanceof zg0) {
                zg0 zg0Var = (zg0) drawable;
                boolean p10 = gc.D().p(str2);
                if (!gc.D().J(str2, true) && p10) {
                    zg0Var.C(false);
                }
            } else if (drawable instanceof org.telegram.ui.Components.u5) {
                org.telegram.ui.Components.u5 u5Var = (org.telegram.ui.Components.u5) drawable;
                if (u5Var.n0) {
                    boolean p11 = gc.D().p(str2);
                    if (gc.D().J(str2, true)) {
                        if (p11) {
                            u5Var.stop();
                        }
                    } else if (p11) {
                        u5Var.u();
                    }
                } else if (u5Var.t0.isEmpty()) {
                    u5Var.u();
                }
            } else if (drawable instanceof BitmapDrawable) {
                Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
                boolean p12 = gc.D().p(str2);
                if (!gc.D().J(str2, false) && p12) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(bitmap);
                    g0.A2(arrayList);
                }
            }
        }
        if (i7 == 3) {
            this.h0 = null;
            this.j0 = null;
            this.k0 = null;
        } else if (i7 == 2) {
            this.D0 = null;
            this.C0 = null;
            this.E0 = null;
        } else if (i7 == 1) {
            this.a0 = null;
            this.Y = null;
            this.b0 = null;
        } else {
            this.S = null;
            this.Q = null;
            this.T = null;
        }
    }

    public final void T(boolean z9) {
        this.w0 = z9;
    }

    public final void U(boolean z9) {
        this.t0 = z9;
    }

    public final void V(boolean z9) {
        this.R0 = false;
    }

    public final void W(int i7) {
        this.x0 = i7;
        zg0 B = B();
        if (B != null) {
            B.K(i7);
        }
    }

    public final void X(int i7) {
        this.y0 = i7;
        if (B() != null) {
            B().L = i7;
            return;
        }
        this.C1 = i7;
        if (m() != null) {
            m().y0 = 0;
        }
    }

    public final boolean Y() {
        nc ncVar = this.E;
        if (ncVar == null) {
            return false;
        }
        if (ncVar.a == null && ncVar.c == null && ncVar.e == null && ncVar.g == null) {
            return false;
        }
        this.E = null;
        Drawable drawable = ncVar.g;
        if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            if (!(bitmapDrawable instanceof zg0) && !(bitmapDrawable instanceof org.telegram.ui.Components.u5) && bitmapDrawable.getBitmap() != null && bitmapDrawable.getBitmap().isRecycled()) {
                ncVar.g = null;
            }
        }
        u0(ncVar.e, ncVar.f, ncVar.a, ncVar.b, ncVar.c, ncVar.d, ncVar.g, ncVar.h, ncVar.k, ncVar.j, ncVar.i);
        ncVar.a = null;
        ncVar.c = null;
        ncVar.e = null;
        ncVar.g = null;
        this.E = ncVar;
        zg0 B = B();
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

    public final void a(di.v9 v9Var) {
        if (this.c == null) {
            this.c = new ArrayList();
        }
        this.c.add(v9Var);
        if (this.x1) {
            v9Var.a(this);
        }
    }

    public final void a0(ColorFilter colorFilter) {
        this.o1 = colorFilter;
    }

    public final void b() {
        gc D = gc.D();
        D.s.c(new l7(D, this, this.w, 3));
    }

    public final void b0(int i7) {
        this.s1 = i7;
    }

    public final void c() {
        this.r = false;
        gc.D().h(this, true);
        this.n = true;
    }

    public final void c0(boolean z9) {
        this.A0 = z9;
    }

    public final void d(boolean z9, ic icVar) {
        if (this.l1) {
            return;
        }
        float f10 = this.h1;
        if (f10 != 1.0f) {
            if (!z9) {
                if (icVar != null) {
                    long currentTimeMillis = System.currentTimeMillis();
                    long j3 = this.j1;
                    long j10 = currentTimeMillis - j3;
                    if (j3 == 0) {
                        j10 = 16;
                    }
                    if (j10 > 30 && g0.r > 60.0f) {
                        j10 = 30;
                    }
                    this.h1 = (j10 / this.s1) + this.h1;
                } else {
                    this.h1 = (16.0f / this.s1) + f10;
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
            if (icVar != null) {
                g0.h3(new a(this, 13));
            } else {
                invalidate();
            }
        }
    }

    public final void d0(lc lcVar) {
        this.g1 = lcVar;
    }

    @Override // org.telegram.messenger.ls
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        int i11;
        if (i7 == qs.m4) {
            String str = (String) objArr[0];
            String str2 = this.h0;
            if (str2 != null && str2.equals(str)) {
                this.h0 = (String) objArr[1];
                hc hcVar = (hc) objArr[2];
                this.f0 = hcVar;
                nc ncVar = this.E;
                if (ncVar != null) {
                    ncVar.e = hcVar;
                }
            }
            String str3 = this.Q;
            if (str3 != null && str3.equals(str)) {
                this.Q = (String) objArr[1];
                hc hcVar2 = (hc) objArr[2];
                this.O = hcVar2;
                nc ncVar2 = this.E;
                if (ncVar2 != null) {
                    ncVar2.a = hcVar2;
                }
            }
            String str4 = this.Y;
            if (str4 == null || !str4.equals(str)) {
                return;
            }
            this.Y = (String) objArr[1];
            hc hcVar3 = (hc) objArr[2];
            this.W = hcVar3;
            nc ncVar3 = this.E;
            if (ncVar3 != null) {
                ncVar3.c = hcVar3;
                return;
            }
            return;
        }
        if (i7 == qs.j1) {
            Integer num = (Integer) objArr[0];
            if (this.x >= num.intValue()) {
                return;
            }
            int intValue = num.intValue() | this.D;
            this.D = intValue;
            if (intValue != 0) {
                zg0 B = B();
                if (B != null && B.z()) {
                    B.stop();
                }
                org.telegram.ui.Components.u5 m10 = m();
                if (m10 != null) {
                    m10.stop();
                    return;
                }
                return;
            }
            return;
        }
        if (i7 == qs.k1) {
            Integer num2 = (Integer) objArr[0];
            if (this.x >= num2.intValue() || (i11 = this.D) == 0) {
                return;
            }
            int i12 = (~num2.intValue()) & i11;
            this.D = i12;
            if (i12 == 0) {
                zg0 B2 = B();
                if (B2 != null) {
                    B2.E = this.s0;
                }
                if (this.u0 && B2 != null && B2.z()) {
                    B2.start();
                }
                org.telegram.ui.Components.u5 m11 = m();
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
                for (int i7 = 0; i7 < this.c.size(); i7++) {
                    ArrayList arrayList = ((di.v9) ((kc) this.c.get(i7))).a;
                    if (arrayList != null) {
                        for (int i10 = 0; i10 < arrayList.size(); i10++) {
                            ((di.r9) arrayList.get(i10)).b(false);
                        }
                    }
                }
            }
            this.c.clear();
        }
    }

    public final ic e0(ic icVar, int i7) {
        zg0 zg0Var;
        if (icVar == null) {
            icVar = new ic();
            icVar.h = new int[4];
            icVar.y = new RectF();
        }
        icVar.d = i7;
        icVar.f = m();
        icVar.g = B();
        boolean z9 = false;
        for (int i10 = 0; i10 < 4; i10++) {
            icVar.h[i10] = this.W0[i10];
        }
        icVar.j = this.j0;
        icVar.i = this.k0;
        icVar.l = this.S;
        icVar.k = this.T;
        icVar.m = this.a0;
        icVar.n = this.b0;
        icVar.e = this.c0;
        icVar.o = this.m0;
        icVar.x = this.C0;
        icVar.z = this.o1;
        icVar.w = this.B0;
        icVar.p = this.h1;
        icVar.q = this.i1;
        icVar.r = this.E0;
        org.telegram.ui.Components.u5 u5Var = icVar.f;
        if ((u5Var != null && !u5Var.s()) || ((zg0Var = icVar.g) != null && !zg0Var.u())) {
            z9 = true;
        }
        icVar.a = z9;
        icVar.u = this.K0;
        icVar.v = this.L0;
        icVar.t = this.M0;
        icVar.s = this.N0;
        icVar.b = this.d1;
        return icVar;
    }

    public final void f() {
        for (int i7 = 0; i7 < 4; i7++) {
            S(i7, null);
        }
        gc.D().h(this, true);
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

    public final void g0(boolean z9) {
        if (this.F1 == z9) {
            return;
        }
        this.F1 = z9;
        this.u0 = !z9;
        zg0 B = B();
        if (B != null) {
            if (z9) {
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
    public final boolean h(Canvas canvas, ic icVar) {
        int[] iArr;
        boolean z9;
        boolean z10;
        Canvas canvas2;
        ImageReceiver imageReceiver;
        int i7;
        org.telegram.ui.Components.u5 m10;
        zg0 B;
        int[] iArr2;
        Drawable drawable;
        BitmapShader bitmapShader;
        Drawable drawable2;
        BitmapShader bitmapShader2;
        BitmapShader bitmapShader3;
        BitmapShader bitmapShader4;
        boolean z11;
        Drawable drawable3;
        Drawable drawable4;
        Drawable drawable5;
        float f10;
        float f11;
        BitmapShader bitmapShader5;
        float f12;
        boolean z12;
        Drawable drawable6;
        BitmapShader bitmapShader6;
        Drawable drawable7;
        boolean z13;
        BitmapShader bitmapShader7;
        Drawable drawable8;
        float f13;
        BitmapShader bitmapShader8;
        boolean z14;
        Drawable drawable9;
        boolean z15;
        Drawable drawable10;
        float f14;
        boolean z16;
        Drawable drawable11;
        int i10;
        int i11;
        BitmapShader bitmapShader9;
        int i12;
        Drawable drawable12;
        boolean z17;
        Canvas canvas3;
        ImageReceiver imageReceiver2;
        boolean z18;
        ic icVar2;
        ImageReceiver imageReceiver3;
        int[] iArr3;
        float f15;
        Drawable drawable13;
        float f16;
        boolean z19;
        Drawable drawable14;
        Canvas canvas4;
        Drawable drawable15;
        boolean z20;
        float[] fArr;
        BitmapShader bitmapShader10;
        ImageReceiver imageReceiver4 = this;
        Path path = imageReceiver4.c1;
        if (imageReceiver4.G != null && imageReceiver4.Q != null) {
            canvas.save();
            float f17 = imageReceiver4.K0;
            float f18 = imageReceiver4.L0;
            canvas.clipRect(f17, f18, imageReceiver4.M0 + f17, imageReceiver4.N0 + f18);
            canvas.drawColor(-16777216);
        }
        boolean z21 = icVar != null;
        try {
            if (z21) {
                m10 = icVar.f;
                B = icVar.g;
                iArr2 = icVar.h;
                drawable = icVar.j;
                bitmapShader = icVar.i;
                drawable2 = icVar.l;
                bitmapShader2 = icVar.k;
                bitmapShader3 = icVar.n;
                bitmapShader4 = icVar.e;
                drawable3 = icVar.x;
                z11 = icVar.w;
                drawable4 = icVar.m;
                drawable5 = icVar.o;
                f10 = icVar.p;
                f11 = icVar.q;
                bitmapShader5 = icVar.r;
                z12 = icVar.a;
                f12 = icVar.b;
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
                z11 = imageReceiver4.B0;
                drawable3 = imageReceiver4.C0;
                drawable4 = drawable16;
                drawable5 = imageReceiver4.m0;
                f10 = imageReceiver4.h1;
                f11 = imageReceiver4.i1;
                bitmapShader5 = imageReceiver4.E0;
                f12 = imageReceiver4.d1;
                z12 = ((m10 == null || m10.s()) && (B == null || B.u())) ? false : true;
            }
            zg0 zg0Var = B;
            org.telegram.ui.Components.u5 u5Var = m10;
            drawable6 = drawable5;
            bitmapShader6 = bitmapShader2;
            drawable7 = drawable;
            int[] iArr4 = iArr2;
            z13 = z12;
            bitmapShader7 = bitmapShader4;
            drawable8 = drawable3;
            f13 = f10;
            bitmapShader8 = bitmapShader3;
            z14 = z11;
            drawable9 = drawable4;
            z15 = z21;
            drawable10 = drawable2;
            f14 = f12;
            if (!imageReceiver4.V0) {
                iArr4 = null;
            }
            iArr = iArr4;
            if (u5Var != null) {
                u5Var.B(iArr);
            }
            if ((u5Var != null || zg0Var != null) && !z13 && !imageReceiver4.z0 && !z15) {
                imageReceiver4.z0 = true;
                lc lcVar = imageReceiver4.g1;
                if (lcVar != null) {
                    lcVar.O(imageReceiver4);
                }
            }
            z16 = imageReceiver4.S0;
        } catch (Exception e10) {
            e = e10;
        }
        if (z16 || imageReceiver4.T0 || drawable7 == null || z13) {
            if (!z16 && drawable10 != null && (!z13 || drawable7 != null)) {
                i10 = imageReceiver4.U;
                i11 = imageReceiver4.V;
                drawable11 = drawable10;
                z13 = false;
            } else if (drawable8 != null && !z14) {
                i10 = imageReceiver4.U;
                i11 = imageReceiver4.V;
                drawable11 = drawable8;
                bitmapShader6 = bitmapShader5;
            } else if (drawable9 != null) {
                i10 = imageReceiver4.d0;
                i11 = imageReceiver4.e0;
                drawable11 = drawable9;
                bitmapShader6 = bitmapShader8;
            } else if (drawable6 instanceof BitmapDrawable) {
                if (imageReceiver4.l0 && bitmapShader7 == null) {
                    imageReceiver4.R0(drawable6);
                    bitmapShader9 = imageReceiver4.c0;
                } else {
                    bitmapShader9 = bitmapShader7;
                }
                int i13 = imageReceiver4.d0;
                i12 = imageReceiver4.e0;
                i10 = i13;
                bitmapShader6 = bitmapShader9;
                bitmapShader7 = bitmapShader6;
                drawable11 = drawable6;
            } else {
                drawable11 = null;
                bitmapShader6 = null;
                i10 = 0;
                i11 = 0;
            }
            float f19 = imageReceiver4.n1;
            float min = f19 <= 0.0f ? Math.min((f19 * f13) + f13, 1.0f) : f13;
            if (drawable11 == null) {
                if (imageReceiver4.k1 != 0) {
                    try {
                        if (f11 != 1.0f) {
                            if (drawable11 != drawable10) {
                                if (drawable11 == drawable7) {
                                }
                            }
                            if (drawable6 != null) {
                                if (imageReceiver4.l0 && bitmapShader7 == null) {
                                    imageReceiver4.R0(drawable6);
                                    bitmapShader7 = imageReceiver4.c0;
                                }
                                f15 = f13;
                                z18 = z13;
                                drawable13 = drawable11;
                                f16 = min;
                                BitmapShader bitmapShader11 = bitmapShader7;
                                iArr3 = iArr;
                                imageReceiver4.k(canvas, drawable6, (int) (f14 * 255.0f), bitmapShader11, i10, i11, icVar);
                                bitmapShader7 = bitmapShader11;
                                z19 = imageReceiver4.m1;
                                if (z19 || !z18) {
                                    int i14 = i11;
                                    drawable14 = drawable13;
                                    int i15 = i10;
                                    if (z19 && f16 != 1.0f) {
                                        if (drawable14 != drawable10 && drawable14 != drawable7) {
                                            if (drawable14 != drawable9 && drawable14 != drawable8) {
                                                if (drawable14 == drawable6 && drawable8 != null) {
                                                    drawable6 = drawable8;
                                                    bitmapShader10 = bitmapShader5;
                                                    if (drawable6 != null) {
                                                        drawable15 = drawable14;
                                                        int A = ((drawable6 instanceof rz) || (drawable6 instanceof e6)) ? (int) k5.A(1.0f, f16, f14, 255.0f) : (int) (f11 * f14 * 255.0f);
                                                        canvas4 = canvas;
                                                        imageReceiver4.k(canvas4, drawable6, A, bitmapShader10, imageReceiver4.d0, imageReceiver4.e0, icVar);
                                                        if (A != 255 && (drawable6 instanceof e6)) {
                                                            drawable6.setAlpha(qs.e4);
                                                        }
                                                        if (imageReceiver4.n1 > 0.0f || f16 >= 1.0f || !z14) {
                                                            z20 = false;
                                                        } else {
                                                            canvas4.save();
                                                            path.rewind();
                                                            RectF rectF = g0.P;
                                                            float f20 = imageReceiver4.K0;
                                                            float f21 = imageReceiver4.L0;
                                                            rectF.set(f20, f21, imageReceiver4.M0 + f20, imageReceiver4.N0 + f21);
                                                            int i16 = 0;
                                                            while (true) {
                                                                int length = iArr3.length;
                                                                fArr = I1;
                                                                if (i16 >= length) {
                                                                    break;
                                                                }
                                                                int i17 = i16 * 2;
                                                                float f22 = iArr3[i16];
                                                                fArr[i17] = f22;
                                                                fArr[i17 + 1] = f22;
                                                                i16++;
                                                            }
                                                            path.addRoundRect(g0.P, fArr, Path.Direction.CW);
                                                            canvas4.clipPath(path);
                                                            float z22 = com.google.android.recaptcha.internal.a.z(1.0f, org.telegram.ui.Components.wq.i.getInterpolation(f15), imageReceiver4.n1, 1.0f);
                                                            canvas4.scale(z22, z22, imageReceiver4.r(), imageReceiver4.s());
                                                            z20 = true;
                                                        }
                                                        Drawable drawable17 = drawable15;
                                                        imageReceiver4.k(canvas4, drawable17, (int) (f14 * f16 * 255.0f), bitmapShader6, i15, i14, icVar);
                                                        if (z20) {
                                                            canvas.restore();
                                                        }
                                                        imageReceiver3 = this;
                                                        icVar2 = icVar;
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
                                    z20 = false;
                                    Drawable drawable172 = drawable15;
                                    imageReceiver4.k(canvas4, drawable172, (int) (f14 * f16 * 255.0f), bitmapShader6, i15, i14, icVar);
                                    if (z20) {
                                    }
                                    imageReceiver3 = this;
                                    icVar2 = icVar;
                                    drawable12 = drawable172;
                                } else {
                                    Drawable drawable18 = drawable13;
                                    imageReceiver4.k(canvas, drawable18, (int) (f14 * 255.0f), bitmapShader6, i10, i11, icVar);
                                    icVar2 = icVar;
                                    drawable12 = drawable18;
                                    imageReceiver3 = imageReceiver4;
                                }
                            }
                        }
                        z19 = imageReceiver4.m1;
                        if (z19) {
                        }
                        int i142 = i11;
                        drawable14 = drawable13;
                        int i152 = i10;
                        if (z19) {
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
                        z20 = false;
                        Drawable drawable1722 = drawable15;
                        imageReceiver4.k(canvas4, drawable1722, (int) (f14 * f16 * 255.0f), bitmapShader6, i152, i142, icVar);
                        if (z20) {
                        }
                        imageReceiver3 = this;
                        icVar2 = icVar;
                        drawable12 = drawable1722;
                    } catch (Exception e11) {
                        e = e11;
                        imageReceiver4 = this;
                        iArr = canvas;
                        z9 = true;
                        z10 = false;
                        imageReceiver = imageReceiver4;
                        canvas2 = iArr;
                        a8.g(e, z9);
                        if (imageReceiver.G != null) {
                        }
                        if (z10) {
                        }
                        return z10;
                    }
                    iArr3 = iArr;
                    f15 = f13;
                    z18 = z13;
                    drawable13 = drawable11;
                    f16 = min;
                } else {
                    Drawable drawable19 = drawable11;
                    z18 = z13;
                    ImageReceiver imageReceiver5 = this;
                    icVar2 = icVar;
                    imageReceiver5.k(canvas, drawable19, (int) (f14 * 255.0f), bitmapShader6, i10, i11, icVar2);
                    drawable12 = drawable19;
                    imageReceiver3 = imageReceiver5;
                }
                imageReceiver3.d(z18 && imageReceiver3.m1, icVar2);
                canvas3 = canvas;
                z17 = z18;
                imageReceiver2 = imageReceiver3;
            } else {
                drawable12 = drawable11;
                boolean z23 = z13;
                if (drawable6 == null) {
                    canvas2 = canvas;
                    z17 = z23;
                    imageReceiver4.d(z17, icVar);
                    z10 = false;
                    imageReceiver = imageReceiver4;
                    if (drawable12 == null && z17 && !z15) {
                        try {
                            imageReceiver.invalidate();
                        } catch (Exception e12) {
                            e = e12;
                            z9 = true;
                            imageReceiver = imageReceiver;
                            canvas2 = canvas2;
                            a8.g(e, z9);
                            if (imageReceiver.G != null) {
                            }
                            if (z10) {
                            }
                            return z10;
                        }
                    }
                    if (imageReceiver.G != null && imageReceiver.Q != null) {
                        canvas2.restore();
                    }
                    if (z10 && imageReceiver.Q0 && imageReceiver.c != null) {
                        for (i7 = 0; i7 < imageReceiver.c.size(); i7++) {
                            di.v9 v9Var = (di.v9) ((kc) imageReceiver.c.get(i7));
                            ArrayList arrayList = v9Var.a;
                            if (arrayList != null) {
                                float alpha = imageReceiver.getAlpha();
                                float r10 = imageReceiver.r();
                                float s5 = imageReceiver.s();
                                float f23 = imageReceiver.M0;
                                v9Var.d = f23;
                                float f24 = (16.0f * f23) / 9.0f;
                                v9Var.e = f24;
                                v9Var.b = r10 - (f23 / 2.0f);
                                v9Var.c = s5 - (f24 / 2.0f);
                                canvas2.save();
                                canvas2.clipRect(imageReceiver.K0, imageReceiver.L0, imageReceiver.y(), imageReceiver.A());
                                for (int i18 = 0; i18 < arrayList.size(); i18++) {
                                    ((di.r9) arrayList.get(i18)).a(canvas2, alpha);
                                }
                                canvas2.restore();
                            }
                        }
                    }
                    return z10;
                }
                if (drawable6 instanceof e51) {
                    ((e51) drawable6).e = imageReceiver4;
                }
                Canvas canvas5 = canvas;
                imageReceiver4.k(canvas5, drawable6, (int) (f14 * 255.0f), null, imageReceiver4.d0, imageReceiver4.e0, icVar);
                z17 = z23;
                imageReceiver4.d(z17, icVar);
                imageReceiver2 = imageReceiver4;
                canvas3 = canvas5;
            }
            z10 = true;
            imageReceiver = imageReceiver2;
            canvas2 = canvas3;
            if (drawable12 == null) {
                imageReceiver.invalidate();
            }
            if (imageReceiver.G != null) {
                canvas2.restore();
            }
            if (z10) {
                while (i7 < imageReceiver.c.size()) {
                }
            }
            return z10;
        }
        int i19 = imageReceiver4.U;
        i12 = imageReceiver4.V;
        i10 = i19;
        bitmapShader6 = bitmapShader;
        drawable11 = drawable7;
        i11 = i12;
        float f192 = imageReceiver4.n1;
        if (f192 <= 0.0f) {
        }
        if (drawable11 == null) {
        }
        z10 = true;
        imageReceiver = imageReceiver2;
        canvas2 = canvas3;
        if (drawable12 == null) {
        }
        if (imageReceiver.G != null) {
        }
        if (z10) {
        }
        return z10;
    }

    public final void h0(int i7) {
        if (this.w != i7) {
            this.w = i7;
            if (this.x1 && K()) {
                gc D = gc.D();
                D.s.c(new l7(D, this, this.w, 3));
            }
        }
    }

    public final void i(Canvas canvas, BitmapDrawable bitmapDrawable, ic icVar, int i7) {
        if (icVar == null) {
            bitmapDrawable.setAlpha(i7);
            if (bitmapDrawable instanceof zg0) {
                ((zg0) bitmapDrawable).q(canvas, null, false, this.s, 0);
                return;
            } else if (bitmapDrawable instanceof org.telegram.ui.Components.u5) {
                ((org.telegram.ui.Components.u5) bitmapDrawable).l(canvas, false, this.s, 0);
                return;
            } else {
                bitmapDrawable.draw(canvas);
                return;
            }
        }
        if (bitmapDrawable instanceof zg0) {
            zg0 zg0Var = (zg0) bitmapDrawable;
            float f10 = icVar.u;
            float f11 = icVar.v;
            float f12 = icVar.t;
            float f13 = icVar.s;
            ColorFilter colorFilter = icVar.z;
            int i10 = icVar.d;
            Paint[] paintArr = zg0Var.j0;
            RectF[] rectFArr = zg0Var.i0;
            if (rectFArr[i10] == null) {
                rectFArr[i10] = new RectF();
                Paint paint = new Paint(1);
                paintArr[i10] = paint;
                paint.setFilterBitmap(true);
            }
            paintArr[i10].setAlpha(i7);
            paintArr[i10].setColorFilter(colorFilter);
            rectFArr[i10].set(f10, f11, f10 + f12, f13 + f11);
            zg0Var.q(canvas, null, true, 0L, i10);
            return;
        }
        if (!(bitmapDrawable instanceof org.telegram.ui.Components.u5)) {
            Bitmap bitmap = bitmapDrawable.getBitmap();
            if (bitmap != null) {
                if (icVar.A == null) {
                    icVar.A = new Paint(1);
                }
                icVar.A.setAlpha(i7);
                icVar.A.setColorFilter(icVar.z);
                canvas.save();
                canvas.translate(icVar.u, icVar.v);
                canvas.scale(icVar.t / bitmap.getWidth(), icVar.s / bitmap.getHeight());
                canvas.drawBitmap(bitmap, 0.0f, 0.0f, icVar.A);
                canvas.restore();
                return;
            }
            return;
        }
        org.telegram.ui.Components.u5 u5Var = (org.telegram.ui.Components.u5) bitmapDrawable;
        float f14 = icVar.u;
        float f15 = icVar.v;
        float f16 = icVar.t;
        float f17 = icVar.s;
        ColorFilter colorFilter2 = icVar.z;
        int i11 = icVar.d;
        Paint[] paintArr2 = u5Var.q0;
        RectF[] rectFArr2 = u5Var.p0;
        if (rectFArr2[i11] == null) {
            rectFArr2[i11] = new RectF();
            Paint paint2 = new Paint();
            paintArr2[i11] = paint2;
            paint2.setFilterBitmap(true);
        }
        paintArr2[i11].setAlpha(i7);
        paintArr2[i11].setColorFilter(colorFilter2);
        rectFArr2[i11].set(f14, f15, f16 + f14, f17 + f15);
        u5Var.l(canvas, true, 0L, i11);
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
        float f10 = this.K0;
        float f11 = this.L0;
        view.invalidate((int) f10, (int) f11, (int) (f10 + this.M0), (int) (f11 + this.N0));
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
    
        org.telegram.messenger.a8.g(r0, r15);
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
    public final void j(Canvas canvas, Drawable drawable, int i7, BitmapShader bitmapShader, int i10, int i11, int i12, ic icVar) {
        float f10;
        float f11;
        float f12;
        float f13;
        ColorFilter colorFilter;
        RectF rectF;
        int[] iArr;
        rz rzVar;
        rz rzVar2;
        boolean z9;
        int intrinsicHeight;
        int intrinsicWidth;
        boolean z10;
        boolean z11;
        float f14;
        float f15;
        float f16;
        ic icVar2;
        float f17;
        float f18;
        ic icVar3;
        float f19;
        float f20;
        if (icVar != null) {
            f10 = icVar.u;
            f11 = icVar.v;
            f12 = icVar.s;
            f13 = icVar.t;
            rectF = icVar.y;
            colorFilter = icVar.z;
            iArr = icVar.h;
        } else {
            f10 = this.K0;
            f11 = this.L0;
            f12 = this.N0;
            f13 = this.M0;
            colorFilter = this.o1;
            rectF = this.P0;
            iArr = this.W0;
        }
        int[] iArr2 = !this.V0 ? null : iArr;
        if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            int[] iArr3 = iArr2;
            boolean z12 = drawable instanceof zg0;
            if (z12) {
                z9 = z12;
                ((zg0) drawable).a = this.A1;
            } else {
                z9 = z12;
                if (drawable instanceof org.telegram.ui.Components.u5) {
                    ((org.telegram.ui.Components.u5) drawable).a = this.A1;
                }
            }
            Paint paint = this.Z0;
            Paint paint2 = bitmapShader != null ? paint : bitmapDrawable.getPaint();
            int i13 = Build.VERSION.SDK_INT;
            if (i13 >= 29) {
                Object obj = this.F;
                if (obj == null || this.H != null) {
                    paint2.setBlendMode(null);
                } else {
                    paint2.setBlendMode(ni.a.d(obj));
                }
            }
            boolean z13 = (paint2 == null || paint2.getColorFilter() == null) ? false : true;
            if (z13 && i12 == 0) {
                if (bitmapShader != null) {
                    paint.setColorFilter(null);
                } else if (this.m0 != drawable) {
                    bitmapDrawable.setColorFilter(null);
                }
            } else if (!z13 && i12 != 0) {
                if (i12 == 1) {
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
            boolean z14 = bitmapDrawable instanceof org.telegram.ui.Components.u5;
            if (z14 || (bitmapDrawable instanceof zg0)) {
                int i14 = i10 % 360;
                if (i14 == 90 || i14 == 270) {
                    intrinsicHeight = bitmapDrawable.getIntrinsicHeight();
                    intrinsicWidth = bitmapDrawable.getIntrinsicWidth();
                } else {
                    intrinsicHeight = bitmapDrawable.getIntrinsicWidth();
                    intrinsicWidth = bitmapDrawable.getIntrinsicHeight();
                }
                z10 = z14;
                z11 = false;
            } else {
                Bitmap bitmap = bitmapDrawable.getBitmap();
                if (bitmap != null && bitmap.isRecycled()) {
                    return;
                }
                int i15 = i10 % 360;
                if (i15 == 90 || i15 == 270) {
                    intrinsicHeight = bitmap.getHeight();
                    intrinsicWidth = bitmap.getWidth();
                } else {
                    intrinsicHeight = bitmap.getWidth();
                    intrinsicWidth = bitmap.getHeight();
                }
                z11 = bitmapDrawable instanceof mc;
                z10 = z14;
            }
            int i16 = intrinsicWidth;
            float f21 = this.O0 * 2.0f;
            float f22 = f13 - f21;
            boolean z15 = z11;
            float f23 = f12 - f21;
            float f24 = f13 == 0.0f ? 1.0f : intrinsicHeight / f22;
            float f25 = f12 == 0.0f ? 1.0f : i16 / f23;
            if (z15) {
                f24 /= 1.2f;
                f25 /= 1.2f;
            }
            float f26 = f24;
            float f27 = f25;
            if (bitmapShader == null || icVar != null) {
                float f28 = f13;
                float f29 = f12;
                if (this.R0) {
                    float max = Math.max(f26, f27);
                    canvas.save();
                    int i17 = (int) (intrinsicHeight / max);
                    int i18 = (int) (i16 / max);
                    if (icVar == null) {
                        float f30 = i17;
                        f18 = f28;
                        float f31 = i18;
                        f17 = f29;
                        rectF.set(com.google.android.recaptcha.internal.a.A(f18, f30, 2.0f, f10), com.google.android.recaptcha.internal.a.A(f17, f31, 2.0f, f11), k5.a(f18, f30, 2.0f, f10), k5.a(f17, f31, 2.0f, f11));
                        bitmapDrawable.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
                        if (z10) {
                            ((org.telegram.ui.Components.u5) bitmapDrawable).z(rectF.left, rectF.top, rectF.width(), rectF.height());
                        }
                    } else {
                        f17 = f29;
                        f18 = f28;
                    }
                    if (icVar == null || iArr3 == null || iArr3[0] <= 0) {
                        icVar3 = icVar;
                    } else {
                        canvas.save();
                        icVar3 = icVar;
                        Path path = icVar3.B;
                        if (path == null) {
                            path = new Path();
                            icVar3.B = path;
                        }
                        path.rewind();
                        RectF rectF2 = g0.P;
                        rectF2.set(f10, f11, f10 + f18, f11 + f17);
                        path.addRoundRect(rectF2, iArr3[0], iArr3[2], Path.Direction.CW);
                        canvas.clipPath(path);
                    }
                    if (this.Q0) {
                        try {
                            bitmapDrawable.setAlpha(i7);
                            i(canvas, bitmapDrawable, icVar3, i7);
                        } catch (Exception e10) {
                            if (icVar3 == null) {
                                Q(bitmapDrawable);
                            }
                            a8.g(e10, true);
                        }
                    }
                    canvas.restore();
                    if (icVar3 != null && iArr3 != null && iArr3[0] > 0) {
                        canvas.restore();
                    }
                } else if (canvas != null) {
                    if (Math.abs(f26 - f27) > 1.0E-5f) {
                        canvas.save();
                        if (this.B1) {
                            f15 = f27;
                            canvas.clipRect(f10, f11, f10 + f28, f11 + f29);
                        } else {
                            f15 = f27;
                        }
                        if (i11 == 1) {
                            f16 = 2.0f;
                            canvas.scale(-1.0f, 1.0f, f28 / 2.0f, f29 / 2.0f);
                        } else {
                            f16 = 2.0f;
                            if (i11 == 2) {
                                canvas.scale(1.0f, -1.0f, f28 / 2.0f, f29 / 2.0f);
                            }
                        }
                        int i19 = i10 % 360;
                        if (i19 != 0) {
                            if (this.f1) {
                                canvas.rotate(i10, f28 / f16, f29 / f16);
                            } else {
                                canvas.rotate(i10, 0.0f, 0.0f);
                            }
                        }
                        float f32 = intrinsicHeight / f15;
                        if (f32 > f28) {
                            float f33 = (int) f32;
                            rectF.set(k5.y(f33, f28, 2.0f, f10), f11, k5.a(f33, f28, 2.0f, f10), f11 + f29);
                        } else {
                            float f34 = (int) (i16 / f26);
                            rectF.set(f10, k5.y(f34, f29, 2.0f, f11), f10 + f28, k5.a(f34, f29, 2.0f, f11));
                        }
                        if (z10) {
                            ((org.telegram.ui.Components.u5) bitmapDrawable).z(f10, f11, f28, f29);
                        }
                        if (icVar == null) {
                            if (i19 == 90 || i19 == 270) {
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
                            if (i13 >= 29) {
                                try {
                                    if (this.F != null) {
                                        bitmapDrawable.getPaint().setBlendMode(ni.a.d(this.F));
                                    } else {
                                        bitmapDrawable.getPaint().setBlendMode(null);
                                    }
                                } catch (Exception e11) {
                                    e = e11;
                                    icVar2 = icVar;
                                    if (icVar2 == null) {
                                    }
                                    a8.g(e, true);
                                    canvas.restore();
                                    if (z9) {
                                    }
                                }
                            }
                            icVar2 = icVar;
                            try {
                                i(canvas, bitmapDrawable, icVar2, i7);
                            } catch (Exception e12) {
                                e = e12;
                                if (icVar2 == null) {
                                    Q(bitmapDrawable);
                                }
                                a8.g(e, true);
                                canvas.restore();
                                if (z9) {
                                }
                            }
                        }
                        canvas.restore();
                    } else {
                        canvas.save();
                        if (i11 == 1) {
                            f14 = 2.0f;
                            canvas.scale(-1.0f, 1.0f, f28 / 2.0f, f29 / 2.0f);
                        } else {
                            f14 = 2.0f;
                            if (i11 == 2) {
                                canvas.scale(1.0f, -1.0f, f28 / 2.0f, f29 / 2.0f);
                            }
                        }
                        int i20 = i10 % 360;
                        if (i20 != 0) {
                            if (this.f1) {
                                canvas.rotate(i10, f28 / f14, f29 / f14);
                            } else {
                                canvas.rotate(i10, 0.0f, 0.0f);
                            }
                        }
                        rectF.set(f10, f11, f10 + f28, f11 + f29);
                        if (this.p1) {
                            float f35 = -g0.x;
                            rectF.inset(f35, f35);
                        }
                        if (z10) {
                            ((org.telegram.ui.Components.u5) bitmapDrawable).z(f10, f11, f28, f29);
                        }
                        if (icVar == null) {
                            if (i20 == 90 || i20 == 270) {
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
                            if (i13 >= 29) {
                                try {
                                    if (this.F != null) {
                                        bitmapDrawable.getPaint().setBlendMode(ni.a.d(this.F));
                                    } else {
                                        bitmapDrawable.getPaint().setBlendMode(null);
                                    }
                                } catch (Exception e13) {
                                    Q(bitmapDrawable);
                                    a8.g(e13, true);
                                }
                            }
                            i(canvas, bitmapDrawable, icVar, i7);
                        }
                        canvas.restore();
                    }
                }
            } else {
                boolean z16 = this.R0;
                float[] fArr = I1;
                Path path2 = this.c1;
                RectF rectF3 = this.a1;
                Matrix matrix = this.b1;
                if (z16) {
                    float max2 = Math.max(f26, f27);
                    float f36 = (int) (intrinsicHeight / max2);
                    float f37 = (int) (i16 / max2);
                    rectF.set(com.google.android.recaptcha.internal.a.A(f13, f36, 2.0f, f10), com.google.android.recaptcha.internal.a.A(f12, f37, 2.0f, f11), k5.a(f13, f36, 2.0f, f10), k5.a(f12, f37, 2.0f, f11));
                    if (this.Q0) {
                        matrix.reset();
                        matrix.setTranslate((int) rectF.left, (int) rectF.top);
                        if (i11 != 0) {
                            matrix.preScale(i11 == 1 ? -1.0f : 1.0f, i11 == 2 ? -1.0f : 1.0f, rectF.width() / 2.0f, rectF.height() / 2.0f);
                        }
                        if (i10 == 90) {
                            matrix.preRotate(90.0f);
                            matrix.preTranslate(0.0f, -rectF.width());
                        } else if (i10 == 180) {
                            matrix.preRotate(180.0f);
                            matrix.preTranslate(-rectF.width(), -rectF.height());
                        } else if (i10 == 270) {
                            matrix.preRotate(270.0f);
                            matrix.preTranslate(-rectF.height(), 0.0f);
                        }
                        float f38 = 1.0f / max2;
                        matrix.preScale(f38, f38);
                        bitmapShader.setLocalMatrix(matrix);
                        paint.setShader(bitmapShader);
                        paint.setAlpha(i7);
                        rectF3.set(rectF);
                        if (!this.X0 || !this.V0) {
                            for (int i21 = 0; i21 < iArr3.length; i21++) {
                                int i22 = i21 * 2;
                                float f39 = iArr3[i21];
                                fArr[i22] = f39;
                                fArr[i22 + 1] = f39;
                            }
                            path2.reset();
                            path2.addRoundRect(rectF3, fArr, Path.Direction.CW);
                            path2.close();
                            if (canvas != null) {
                                canvas.drawPath(path2, paint);
                            }
                        } else if (canvas != null) {
                            try {
                                int i23 = iArr3[0];
                                if (i23 == 0) {
                                    canvas.drawRect(rectF3, paint);
                                } else {
                                    float f40 = i23;
                                    canvas.drawRoundRect(rectF3, f40, f40, paint);
                                }
                            } catch (Exception e14) {
                                Q(bitmapDrawable);
                                a8.g(e14, true);
                            }
                        }
                    }
                } else {
                    float f41 = f13;
                    float f42 = f12;
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
                    float min = 1.0f / Math.min(f26, f27);
                    float f43 = this.O0;
                    rectF3.set(f10 + f43, f11 + f43, (f10 + f41) - f43, (f11 + f42) - f43);
                    if (Math.abs(f26 - f27) > 5.0E-4f) {
                        float f44 = intrinsicHeight / f27;
                        if (f44 > f22) {
                            float f45 = (int) f44;
                            f20 = f22;
                            rectF.set(k5.y(f45, f20, 2.0f, f10), f11, k5.a(f45, f20, 2.0f, f10), f11 + f23);
                            f19 = f23;
                        } else {
                            f20 = f22;
                            float f46 = (int) (i16 / f26);
                            f19 = f23;
                            rectF.set(f10, k5.y(f46, f19, 2.0f, f11), f10 + f20, k5.a(f46, f19, 2.0f, f11));
                        }
                    } else {
                        f19 = f23;
                        f20 = f22;
                        rectF.set(f10, f11, f10 + f20, f11 + f19);
                    }
                    if (this.Q0) {
                        matrix.reset();
                        if (z15) {
                            matrix.setTranslate((rectF.left + this.O0) - (((rectF.width() * 1.2f) - rectF.width()) / 2.0f), (rectF.top + this.O0) - (((rectF.height() * 1.2f) - rectF.height()) / 2.0f));
                        } else {
                            float f47 = rectF.left;
                            float f48 = this.O0;
                            matrix.setTranslate(f47 + f48, rectF.top + f48);
                        }
                        if (i11 != 0) {
                            matrix.preScale(i11 == 1 ? -1.0f : 1.0f, i11 == 2 ? -1.0f : 1.0f, rectF.width() / 2.0f, rectF.height() / 2.0f);
                        }
                        if (i10 == 90) {
                            matrix.preRotate(90.0f);
                            matrix.preTranslate(0.0f, -rectF.width());
                        } else if (i10 == 180) {
                            matrix.preRotate(180.0f);
                            matrix.preTranslate(-rectF.width(), -rectF.height());
                        } else if (i10 == 270) {
                            matrix.preRotate(270.0f);
                            matrix.preTranslate(-rectF.height(), 0.0f);
                        }
                        matrix.preScale(min, min);
                        if (this.p1) {
                            float f49 = ((g0.x * 2) + f20) / f20;
                            matrix.postScale(f49, f49, rectF.centerX(), rectF.centerY());
                        }
                        BitmapShader bitmapShader2 = this.K;
                        if (bitmapShader2 != null) {
                            bitmapShader2.setLocalMatrix(matrix);
                        }
                        bitmapShader.setLocalMatrix(matrix);
                        if (this.I != null) {
                            int width3 = this.G.getWidth();
                            int height3 = this.G.getHeight();
                            float f50 = f13 == 0.0f ? 1.0f : width3 / f20;
                            float f51 = f12 == 0.0f ? 1.0f : height3 / f19;
                            if (Math.abs(f50 - f51) > 5.0E-4f) {
                                float f52 = width3 / f51;
                                if (f52 > f20) {
                                    width3 = (int) f52;
                                    float f53 = width3;
                                    rectF.set(k5.y(f53, f20, 2.0f, f10), f11, k5.a(f53, f20, 2.0f, f10), f11 + f19);
                                } else {
                                    height3 = (int) (height3 / f50);
                                    float f54 = height3;
                                    rectF.set(f10, k5.y(f54, f19, 2.0f, f11), f10 + f20, k5.a(f54, f19, 2.0f, f11));
                                }
                            } else {
                                rectF.set(f10, f11, f10 + f20, f11 + f19);
                            }
                            float min2 = 1.0f / Math.min(f13 == 0.0f ? 1.0f : width3 / f20, f12 == 0.0f ? 1.0f : height3 / f19);
                            matrix.reset();
                            float f55 = rectF.left;
                            float f56 = this.O0;
                            matrix.setTranslate(f55 + f56, rectF.top + f56);
                            matrix.preScale(min2, min2);
                            this.H.setLocalMatrix(matrix);
                        }
                        paint.setAlpha(i7);
                        if (!this.X0 || !this.V0) {
                            for (int i24 = 0; i24 < iArr3.length; i24++) {
                                int i25 = i24 * 2;
                                float f57 = iArr3[i24];
                                fArr[i25] = f57;
                                fArr[i25 + 1] = f57;
                            }
                            path2.reset();
                            path2.addRoundRect(rectF3, fArr, Path.Direction.CW);
                            path2.close();
                            if (canvas != null) {
                                canvas.drawPath(path2, paint);
                            }
                        } else if (canvas != null) {
                            try {
                                int i26 = iArr3[0];
                                if (i26 != 0) {
                                    float f58 = i26;
                                    canvas.drawRoundRect(rectF3, f58, f58, paint);
                                } else if (z15) {
                                    RectF rectF4 = g0.P;
                                    rectF4.set(rectF3);
                                    rectF4.inset((-((rectF.width() * 1.2f) - rectF.width())) / 2.0f, (-((rectF.height() * 1.2f) - rectF.height())) / 2.0f);
                                    canvas.drawRect(rectF4, paint);
                                } else {
                                    canvas.drawRect(rectF3, paint);
                                }
                            } catch (Exception e15) {
                                if (icVar == null) {
                                    Q(bitmapDrawable);
                                }
                                a8.g(e15, true);
                            }
                        }
                    }
                }
            }
            if (z9) {
                ((zg0) drawable).a = false;
                return;
            } else {
                if (drawable instanceof org.telegram.ui.Components.u5) {
                    ((org.telegram.ui.Components.u5) drawable).a = false;
                    return;
                }
                return;
            }
        }
        float f59 = f12;
        float f60 = f13;
        boolean z17 = true;
        ?? r15 = 1;
        ?? r12 = i7;
        if (icVar == null) {
            if (this.R0) {
                int intrinsicWidth2 = drawable.getIntrinsicWidth();
                int intrinsicHeight2 = drawable.getIntrinsicHeight();
                float f61 = this.O0 * 2.0f;
                float max3 = Math.max(f60 == 0.0f ? 1.0f : intrinsicWidth2 / (f60 - f61), f59 == 0.0f ? 1.0f : intrinsicHeight2 / (f59 - f61));
                float f62 = (int) (intrinsicWidth2 / max3);
                r15 = 1073741824;
                float f63 = (int) (intrinsicHeight2 / max3);
                rectF.set(com.google.android.recaptcha.internal.a.A(f60, f62, 2.0f, f10), com.google.android.recaptcha.internal.a.A(f59, f63, 2.0f, f11), k5.a(f60, f62, 2.0f, f10), k5.a(f59, f63, 2.0f, f11));
            } else {
                rectF.set(f10, f11, f10 + f60, f11 + f59);
            }
            drawable.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            z17 = r15;
        }
        if (!this.Q0 || canvas == null) {
            return;
        }
        if (!(drawable instanceof rz)) {
            if (drawable instanceof org.telegram.ui.Components.np) {
                Drawable drawable2 = ((org.telegram.ui.Components.np) drawable).a;
                if (drawable2 instanceof rz) {
                    rzVar2 = (rz) drawable2;
                    rzVar2.k = this;
                }
            }
            rzVar = null;
            if (colorFilter != null && drawable != null) {
                drawable.setColorFilter(colorFilter);
            }
            drawable.setAlpha(i7);
            if (icVar != null) {
                r12 = 0;
                z17 = true;
                drawable.draw(canvas);
            } else if (rzVar != null) {
                long j3 = icVar.c;
                if (j3 == 0) {
                    j3 = System.currentTimeMillis();
                }
                r12 = 0;
                z17 = true;
                ((rz) drawable).c(canvas, true, icVar.d, j3, icVar.u, icVar.v, icVar.t, icVar.s);
            } else {
                r12 = 0;
                z17 = true;
                drawable.draw(canvas);
            }
            if (rzVar != null) {
                rzVar.k = r12;
                return;
            }
            return;
        }
        rzVar2 = (rz) drawable;
        rzVar2.k = this;
        rzVar = rzVar2;
        if (colorFilter != null) {
            drawable.setColorFilter(colorFilter);
        }
        drawable.setAlpha(i7);
        if (icVar != null) {
        }
        if (rzVar != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0082  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j0(TLObject tLObject, Drawable drawable, Object obj, boolean z9, int i7, boolean z10) {
        hc hcVar;
        BitmapDrawable bitmapDrawable;
        boolean z11;
        boolean z12;
        TLRPC.ChatPhoto chatPhoto;
        hc m10;
        String str;
        BitmapDrawable bitmapDrawable2;
        TLRPC.VideoSize videoSize;
        TLRPC.UserFull b22;
        ArrayList<TLRPC.VideoSize> arrayList;
        TLRPC.UserFull b23;
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
        hc hcVar2 = null;
        videoSize2 = null;
        if (tLObject instanceof TLRPC.User) {
            TLRPC.User user = (TLRPC.User) tLObject;
            z11 = user.premium;
            TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
            if (userProfilePhoto != null) {
                bitmapDrawable2 = userProfilePhoto.strippedBitmap;
                z12 = userProfilePhoto.stripped_thumb != null;
                if (i7 == 3 && (b23 = qp.s1(this.d).b2(user.id)) != null) {
                    TLRPC.Photo photo = user.photo.personal ? b23.personal_photo : b23.profile_photo;
                    if (photo != null) {
                        videoSize = w7.R(photo);
                        if (videoSize == null && z9) {
                            qp.s1(this.d);
                            if (qp.B2(user) && user.photo.has_video && sc.e(1024)) {
                                b22 = qp.s1(this.d).b2(user.id);
                                if (b22 != null) {
                                    qp.s1(this.d).W2(user, this.p0, false, null);
                                } else {
                                    TLRPC.Photo photo2 = user.photo.personal ? b22.personal_photo : b22.profile_photo;
                                    if (photo2 != null && (videoSize = w7.R(photo2)) == null && (arrayList = photo2.video_sizes) != null && !arrayList.isEmpty()) {
                                        TLRPC.VideoSize x10 = w7.x(100, arrayList);
                                        for (int i10 = 0; i10 < arrayList.size(); i10++) {
                                            TLRPC.VideoSize videoSize3 = arrayList.get(i10);
                                            if ("p".equals(videoSize3.type)) {
                                                x10 = videoSize3;
                                            }
                                            if ((videoSize3 instanceof TLRPC.TL_videoSizeEmojiMarkup) || (videoSize3 instanceof TLRPC.TL_videoSizeStickerMarkup)) {
                                                videoSize = videoSize3;
                                            }
                                        }
                                        hcVar2 = hc.j(x10, photo2);
                                    }
                                }
                            }
                        }
                    }
                }
                videoSize = null;
                if (videoSize == null) {
                    qp.s1(this.d);
                    if (qp.B2(user)) {
                        b22 = qp.s1(this.d).b2(user.id);
                        if (b22 != null) {
                        }
                    }
                }
            } else {
                bitmapDrawable2 = null;
                videoSize = null;
                z12 = false;
            }
            hcVar = hcVar2;
            bitmapDrawable = bitmapDrawable2;
            videoSize2 = videoSize;
        } else if (!(tLObject instanceof TLRPC.Chat) || (chatPhoto = ((TLRPC.Chat) tLObject).photo) == null) {
            hcVar = null;
            bitmapDrawable = null;
            z11 = false;
            z12 = false;
        } else {
            bitmapDrawable = chatPhoto.strippedBitmap;
            z12 = chatPhoto.stripped_thumb != null;
            hcVar = null;
            z11 = false;
        }
        if (videoSize2 != null && i7 != 0) {
            w0(new e51(videoSize2, z11, i7));
            return;
        }
        if (z10) {
            m10 = hc.m(this.d, 0, tLObject);
            str = "100_100";
        } else {
            m10 = hc.m(this.d, 1, tLObject);
            str = "50_50";
        }
        String str2 = str;
        hc hcVar3 = m10;
        if (hcVar != null) {
            u0(hcVar, "avatar", hcVar3, str2, null, null, bitmapDrawable, 0L, null, obj2, 0);
            this.C1 = 3;
            return;
        }
        Object obj3 = obj2;
        BitmapDrawable bitmapDrawable3 = bitmapDrawable;
        if (bitmapDrawable3 != null) {
            q0(hcVar3, str2, bitmapDrawable3, null, obj3, 0);
        } else if (z12) {
            s0(hcVar3, str2, hc.m(this.d, 2, tLObject), "50_50_b", drawable, obj3, 0);
        } else {
            q0(hcVar3, str2, drawable, null, obj3, 0);
        }
    }

    public final void k(Canvas canvas, Drawable drawable, int i7, BitmapShader bitmapShader, int i10, int i11, ic icVar) {
        if (this.e1 == 0) {
            float f10 = this.t1;
            if (f10 != 0.0f) {
                float f11 = f10 - 0.10666667f;
                this.t1 = f11;
                if (f11 < 0.0f) {
                    this.t1 = 0.0f;
                }
                invalidate();
            }
        }
        int i12 = this.e1;
        if (i12 != 0) {
            this.t1 = 1.0f;
            this.u1 = i12;
        }
        float f12 = this.t1;
        if (f12 == 0.0f || f12 == 1.0f) {
            j(canvas, drawable, i7, bitmapShader, i10, i11, i12, icVar);
        } else {
            j(canvas, drawable, i7, bitmapShader, i10, i11, i12, icVar);
            j(canvas, drawable, (int) (i7 * this.t1), bitmapShader, i10, i11, this.u1, icVar);
        }
    }

    public final void k0() {
        this.r = false;
    }

    public final org.telegram.ui.Components.h5 l() {
        Drawable drawable = this.j0;
        if (drawable instanceof org.telegram.ui.Components.h5) {
            return (org.telegram.ui.Components.h5) drawable;
        }
        Drawable drawable2 = this.S;
        if (drawable2 instanceof org.telegram.ui.Components.h5) {
            return (org.telegram.ui.Components.h5) drawable2;
        }
        Drawable drawable3 = this.a0;
        if (drawable3 instanceof org.telegram.ui.Components.h5) {
            return (org.telegram.ui.Components.h5) drawable3;
        }
        Drawable drawable4 = this.m0;
        if (drawable4 instanceof org.telegram.ui.Components.h5) {
            return (org.telegram.ui.Components.h5) drawable4;
        }
        return null;
    }

    public final void l0(boolean z9) {
        this.S0 = z9;
    }

    public final org.telegram.ui.Components.u5 m() {
        Drawable drawable = this.j0;
        if (drawable instanceof org.telegram.ui.Components.u5) {
            return (org.telegram.ui.Components.u5) drawable;
        }
        Drawable drawable2 = this.S;
        if (drawable2 instanceof org.telegram.ui.Components.u5) {
            return (org.telegram.ui.Components.u5) drawable2;
        }
        Drawable drawable3 = this.a0;
        if (drawable3 instanceof org.telegram.ui.Components.u5) {
            return (org.telegram.ui.Components.u5) drawable3;
        }
        Drawable drawable4 = this.m0;
        if (drawable4 instanceof org.telegram.ui.Components.u5) {
            return (org.telegram.ui.Components.u5) drawable4;
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
        zg0 B = B();
        if (B != null && B.u()) {
            if (B.Q != null) {
                return B.Q;
            }
            if (B.R != null) {
                return B.R;
            }
            return null;
        }
        org.telegram.ui.Components.u5 m10 = m();
        if (m10 != null && m10.s()) {
            return m10.m();
        }
        Drawable drawable = this.j0;
        if ((drawable instanceof BitmapDrawable) && !(drawable instanceof org.telegram.ui.Components.u5) && !(drawable instanceof zg0)) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        Drawable drawable2 = this.S;
        if ((drawable2 instanceof BitmapDrawable) && !(drawable2 instanceof org.telegram.ui.Components.u5) && !(drawable instanceof zg0)) {
            return ((BitmapDrawable) drawable2).getBitmap();
        }
        Drawable drawable3 = this.a0;
        if ((drawable3 instanceof BitmapDrawable) && !(drawable3 instanceof org.telegram.ui.Components.u5) && !(drawable instanceof zg0)) {
            return ((BitmapDrawable) drawable3).getBitmap();
        }
        Drawable drawable4 = this.m0;
        if (drawable4 instanceof BitmapDrawable) {
            return ((BitmapDrawable) drawable4).getBitmap();
        }
        return null;
    }

    public final void n0(int i7, long j3, Object obj, String str, String str2, String str3, hc hcVar, hc hcVar2) {
        r0(hcVar, str, hcVar2, str2, null, j3, str3, obj, i7);
    }

    public final int o() {
        org.telegram.ui.Components.u5 m10 = m();
        if (m10 != null) {
            int i7 = this.U;
            return (i7 % 360 == 0 || i7 % 360 == 180) ? m10.getIntrinsicHeight() : m10.getIntrinsicWidth();
        }
        zg0 B = B();
        if (B != null) {
            return B.c;
        }
        Bitmap n10 = n();
        if (n10 != null) {
            int i10 = this.U;
            return (i10 % 360 == 0 || i10 % 360 == 180) ? n10.getHeight() : n10.getWidth();
        }
        Drawable drawable = this.m0;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return 1;
    }

    public final void o0(String str, String str2, Drawable drawable, String str3, long j3) {
        r0(hc.g(str), str2, null, null, drawable, j3, str3, null, 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final jc p() {
        Bitmap bitmap;
        String str;
        org.telegram.ui.Components.u5 m10 = m();
        zg0 B = B();
        int i7 = 0;
        if (B != null && B.u()) {
            bitmap = B.Q != null ? B.Q : B.R != null ? B.R : null;
        } else {
            if (m10 == null || !m10.s()) {
                Drawable drawable = this.j0;
                if (!(drawable instanceof BitmapDrawable) || (drawable instanceof org.telegram.ui.Components.u5) || (drawable instanceof zg0)) {
                    Drawable drawable2 = this.S;
                    if (!(drawable2 instanceof BitmapDrawable) || (drawable2 instanceof org.telegram.ui.Components.u5) || (drawable instanceof zg0)) {
                        Drawable drawable3 = this.a0;
                        if (!(drawable3 instanceof BitmapDrawable) || (drawable3 instanceof org.telegram.ui.Components.u5) || (drawable instanceof zg0)) {
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
                    return new jc(bitmap, str, i7);
                }
                return null;
            }
            Bitmap m11 = m10.m();
            i7 = m10.d[2];
            if (i7 != 0) {
                return new jc(Bitmap.createBitmap(m11), null, i7);
            }
            bitmap = m11;
        }
        str = null;
        if (bitmap == null) {
        }
    }

    public final void p0(hc hcVar, String str, Drawable drawable, long j3, String str2, Object obj, int i7) {
        r0(hcVar, str, null, null, drawable, j3, str2, obj, i7);
    }

    public final int q() {
        org.telegram.ui.Components.u5 m10 = m();
        if (m10 != null) {
            int i7 = this.U;
            return (i7 % 360 == 0 || i7 % 360 == 180) ? m10.getIntrinsicWidth() : m10.getIntrinsicHeight();
        }
        zg0 B = B();
        if (B != null) {
            return B.b;
        }
        Bitmap n10 = n();
        if (n10 != null) {
            int i10 = this.U;
            return (i10 % 360 == 0 || i10 % 360 == 180) ? n10.getWidth() : n10.getHeight();
        }
        Drawable drawable = this.m0;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return 1;
    }

    public final void q0(hc hcVar, String str, Drawable drawable, String str2, Object obj, int i7) {
        r0(hcVar, str, null, null, drawable, 0L, str2, obj, i7);
    }

    public final float r() {
        return (this.M0 / 2.0f) + this.K0;
    }

    public final void r0(hc hcVar, String str, hc hcVar2, String str2, Drawable drawable, long j3, String str3, Object obj, int i7) {
        u0(null, null, hcVar, str, hcVar2, str2, drawable, j3, str3, obj, i7);
    }

    public final float s() {
        return (this.N0 / 2.0f) + this.L0;
    }

    public final void s0(hc hcVar, String str, hc hcVar2, String str2, Drawable drawable, Object obj, int i7) {
        u0(null, null, hcVar, str, hcVar2, str2, drawable, 0L, null, obj, i7);
    }

    public void setAlpha(float f10) {
        this.d1 = f10;
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

    public final void t0(hc hcVar, String str, hc hcVar2, String str2, String str3, Object obj, int i7) {
        r0(hcVar, str, hcVar2, str2, null, 0L, str3, obj, i7);
    }

    public final jc u() {
        String str;
        String str2;
        Drawable drawable = this.j0;
        jc jcVar = null;
        if (!(drawable instanceof BitmapDrawable) || (drawable instanceof org.telegram.ui.Components.u5) || (drawable instanceof zg0)) {
            Drawable drawable2 = this.S;
            if (!(drawable2 instanceof BitmapDrawable) || (drawable2 instanceof org.telegram.ui.Components.u5) || (drawable instanceof zg0)) {
                drawable2 = this.a0;
                if (!(drawable2 instanceof BitmapDrawable) || (drawable2 instanceof org.telegram.ui.Components.u5) || (drawable instanceof zg0)) {
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
            jcVar = new jc();
            jcVar.d = drawable;
            jcVar.a = str;
            jcVar.e = 0;
            if (str != null) {
                gc.D().H(jcVar.a);
            }
        }
        return jcVar;
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
    public final void u0(hc hcVar, String str, hc hcVar2, String str2, hc hcVar3, String str3, Drawable drawable, long j3, String str4, Object obj, int i7) {
        Paint paint;
        String str5;
        Paint paint2;
        String q10;
        String str6;
        hc hcVar4;
        String q11;
        boolean z9;
        Bitmap bitmap;
        lc lcVar;
        boolean z10;
        lc lcVar2;
        String str7;
        nc ncVar;
        hc hcVar5;
        hc hcVar6;
        hc hcVar7;
        hc hcVar8 = hcVar;
        hc hcVar9 = hcVar2;
        if (this.z1 && !this.x1) {
            if (this.E == null) {
                this.E = new nc();
            }
            nc ncVar2 = this.E;
            ncVar2.e = hcVar8;
            ncVar2.f = str;
            ncVar2.a = hcVar9;
            ncVar2.b = str2;
            ncVar2.c = hcVar3;
            ncVar2.d = str3;
            ncVar2.g = drawable;
            ncVar2.h = j3;
            ncVar2.k = str4;
            ncVar2.i = i7;
            ncVar2.j = obj;
            return;
        }
        if (this.o0) {
            return;
        }
        if (this.A0 && (ncVar = this.E) != null && (((hcVar5 = ncVar.a) != null && (hcVar5.v != null || hcVar5.g != null)) || (((hcVar6 = ncVar.c) != null && (hcVar6.v != null || hcVar6.g != null)) || ((hcVar7 = ncVar.e) != null && (hcVar7.v != null || hcVar7.g != null))))) {
            Y();
        }
        nc ncVar3 = this.E;
        if (ncVar3 != null) {
            ncVar3.a = null;
            ncVar3.c = null;
            ncVar3.e = null;
            ncVar3.g = null;
        }
        Paint paint3 = this.Z0;
        if (hcVar9 == null && hcVar3 == null && hcVar8 == null) {
            for (int i10 = 0; i10 < 4; i10++) {
                S(i10, null);
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
            gc.D().h(this, true);
            invalidate();
            lc lcVar3 = this.g1;
            if (lcVar3 != null) {
                Drawable drawable2 = this.S;
                lcVar3.f0(this, (drawable2 == null && this.a0 == null && this.m0 == null && this.j0 == null) ? false : true, drawable2 == null && this.j0 == null, false);
                return;
            }
            return;
        }
        String q12 = hcVar9 != null ? hcVar9.q(obj, null, false) : null;
        if (q12 == null && hcVar9 != null) {
            hcVar9 = null;
        }
        this.C1 = Math.max(this.y0, 0);
        this.I0 = false;
        if (q12 == null && this.F0 && ((obj instanceof ij) || this.H0 != null)) {
            TLRPC.Document document = this.H0;
            if (document == null) {
                document = ((ij) obj).F0();
            }
            if (document != null && document.dc_id != 0) {
                paint = paint3;
                if (document.id != 0) {
                    q12 = "q_" + document.dc_id + "_" + document.id;
                    this.I0 = true;
                }
                str5 = q12;
                if (str5 != null && str2 != null) {
                    str5 = a8.p0.D(str5, "@", str2);
                }
                if (this.v1 == null) {
                    paint2 = paint;
                    str5 = a8.p0.s(new StringBuilder(), this.v1, str5);
                } else {
                    paint2 = paint;
                }
                q10 = hcVar8 == null ? hcVar8.q(obj, null, false) : null;
                if (q10 == null && hcVar8 != null) {
                    hcVar8 = null;
                }
                if (q10 != null && str != null) {
                    q10 = a8.p0.D(q10, "@", str);
                }
                if (this.v1 != null) {
                    q10 = a8.p0.s(new StringBuilder(), this.v1, q10);
                }
                if ((q10 == null && (str7 = this.Q) != null && str7.equals(str5)) || ((str6 = this.h0) != null && str6.equals(q10))) {
                    lcVar2 = this.g1;
                    if (lcVar2 != null) {
                        Drawable drawable3 = this.S;
                        lcVar2.f0(this, (drawable3 == null && this.a0 == null && this.m0 == null && this.j0 == null) ? false : true, drawable3 == null && this.j0 == null, false);
                    }
                    if (!this.n) {
                        return;
                    }
                }
                hcVar4 = this.N;
                if (hcVar4 == null) {
                    hcVar4 = hcVar8 != null ? hcVar8 : hcVar9;
                }
                if (hcVar4 == null) {
                    hcVar4 = hcVar3;
                }
                q11 = hcVar3 != null ? hcVar3.q(obj, hcVar4, false) : null;
                if (q11 != null && str3 != null) {
                    q11 = a8.p0.D(q11, "@", str3);
                }
                if (this.A0) {
                    Object obj2 = this.h;
                    if (obj2 instanceof ij) {
                        ij ijVar = (ij) obj2;
                        if (ijVar.c2 != null && (ij.m1(ijVar) instanceof TLRPC.TL_messageMediaGeoLive)) {
                            ij ijVar2 = (ij) this.h;
                            ijVar2.d2 = ijVar2.c2;
                        }
                    }
                    Drawable drawable4 = this.j0;
                    if (drawable4 != null) {
                        if (drawable4 instanceof org.telegram.ui.Components.u5) {
                            ((org.telegram.ui.Components.u5) drawable4).stop();
                            ((org.telegram.ui.Components.u5) this.j0).v(this);
                        }
                        S(1, q11);
                        S(2, null);
                        S(0, q10);
                        this.C0 = this.j0;
                        this.E0 = this.k0;
                        this.D0 = this.Q;
                        this.B0 = false;
                        this.j0 = null;
                        this.h0 = null;
                    } else if (this.S != null) {
                        S(1, q11);
                        S(2, null);
                        S(3, q10);
                        this.E0 = this.T;
                        this.C0 = this.S;
                        this.D0 = this.Q;
                        this.B0 = false;
                        this.S = null;
                        this.Q = null;
                    } else if (this.a0 != null) {
                        S(0, str5);
                        S(2, null);
                        S(3, q10);
                        this.E0 = this.b0;
                        this.C0 = this.a0;
                        this.D0 = this.Y;
                        this.B0 = false;
                        this.a0 = null;
                        this.Y = null;
                    } else if (this.m0 != null) {
                        S(0, str5);
                        S(1, q11);
                        S(2, null);
                        S(3, q10);
                        this.E0 = this.c0;
                        this.C0 = this.m0;
                        this.B0 = false;
                        this.D0 = null;
                        this.a0 = null;
                        this.Y = null;
                    } else {
                        S(0, str5);
                        z9 = true;
                        S(1, q11);
                        S(2, null);
                        S(3, q10);
                        this.E0 = null;
                    }
                    z9 = true;
                } else {
                    z9 = true;
                    S(0, str5);
                    S(1, q11);
                    S(2, null);
                    S(3, q10);
                    this.E0 = null;
                }
                this.O = hcVar9;
                this.P = str2;
                this.Q = str5;
                this.f0 = hcVar8;
                this.g0 = str;
                this.h0 = q10;
                this.W = hcVar3;
                this.X = str3;
                this.Y = q11;
                this.h = obj;
                this.n0 = str4;
                this.q0 = j3;
                this.r0 = i7;
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
                lcVar = this.g1;
                if (lcVar != null) {
                    Drawable drawable5 = this.S;
                    z10 = false;
                    lcVar.f0(this, (drawable5 == null && this.a0 == null && this.m0 == null && this.j0 == null) ? false : z9, (drawable5 == null && this.j0 == null) ? z9 : false, false);
                } else {
                    z10 = false;
                }
                gc.D().M(this, this.a);
                invalidate();
                this.p1 = ((obj instanceof ij) || !((ij) obj).h4()) ? z10 : z9;
            }
        }
        paint = paint3;
        str5 = q12;
        if (str5 != null) {
            str5 = a8.p0.D(str5, "@", str2);
        }
        if (this.v1 == null) {
        }
        if (hcVar8 == null) {
        }
        if (q10 == null) {
            hcVar8 = null;
        }
        if (q10 != null) {
            q10 = a8.p0.D(q10, "@", str);
        }
        if (this.v1 != null) {
        }
        if (q10 == null) {
            lcVar2 = this.g1;
            if (lcVar2 != null) {
            }
            if (!this.n) {
            }
            hcVar4 = this.N;
            if (hcVar4 == null) {
            }
            if (hcVar4 == null) {
            }
            if (hcVar3 != null) {
            }
            if (q11 != null) {
                q11 = a8.p0.D(q11, "@", str3);
            }
            if (this.A0) {
            }
            this.O = hcVar9;
            this.P = str2;
            this.Q = str5;
            this.f0 = hcVar8;
            this.g0 = str;
            this.h0 = q10;
            this.W = hcVar3;
            this.X = str3;
            this.Y = q11;
            this.h = obj;
            this.n0 = str4;
            this.q0 = j3;
            this.r0 = i7;
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
            lcVar = this.g1;
            if (lcVar != null) {
            }
            gc.D().M(this, this.a);
            invalidate();
            this.p1 = ((obj instanceof ij) || !((ij) obj).h4()) ? z10 : z9;
        }
        lcVar2 = this.g1;
        if (lcVar2 != null) {
        }
        if (!this.n) {
        }
        hcVar4 = this.N;
        if (hcVar4 == null) {
        }
        if (hcVar4 == null) {
        }
        if (hcVar3 != null) {
        }
        if (q11 != null) {
        }
        if (this.A0) {
        }
        this.O = hcVar9;
        this.P = str2;
        this.Q = str5;
        this.f0 = hcVar8;
        this.g0 = str;
        this.h0 = q10;
        this.W = hcVar3;
        this.X = str3;
        this.Y = q11;
        this.h = obj;
        this.n0 = str4;
        this.q0 = j3;
        this.r0 = i7;
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
        lcVar = this.g1;
        if (lcVar != null) {
        }
        gc.D().M(this, this.a);
        invalidate();
        this.p1 = ((obj instanceof ij) || !((ij) obj).h4()) ? z10 : z9;
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
        boolean z9 = true;
        gc.D().h(this, true);
        if (!this.A0) {
            for (int i7 = 0; i7 < 4; i7++) {
                S(i7, null);
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
            for (int i10 = 0; i10 < 4; i10++) {
                S(i10, null);
            }
            this.E0 = null;
        }
        Drawable drawable2 = this.m0;
        if (drawable2 instanceof li0) {
            jb0 jb0Var = (jb0) ((li0) drawable2);
            z5.q(jb0Var.r.I1).v(jb0Var);
            jb0Var.n = null;
            jb0Var.r = null;
        }
        if (drawable instanceof org.telegram.ui.Components.h5) {
            org.telegram.ui.Components.h5 h5Var = (org.telegram.ui.Components.h5) drawable;
            if (this.x1) {
                h5Var.b(this);
            }
        } else if (drawable instanceof org.telegram.ui.Components.u5) {
            org.telegram.ui.Components.u5 u5Var = (org.telegram.ui.Components.u5) drawable;
            View view = this.e;
            if (u5Var.r0 == null) {
                u5Var.r0 = new WeakReference(view);
            }
            if (this.x1) {
                u5Var.e(this);
            }
            boolean z10 = this.v0 || u5Var.n0;
            if (!u5Var.n0) {
                u5Var.v0 = z10;
            }
            if (this.t0 && this.D == 0) {
                u5Var.j();
            }
            boolean z11 = this.w0;
            u5Var.D = z11;
            if (z11) {
                u5Var.x(false);
            }
        } else if (drawable instanceof zg0) {
            zg0 zg0Var = (zg0) drawable;
            if (this.x1) {
                zg0Var.I0.add(this);
            }
            zg0Var.E = this.s0;
            if (this.u0 && (!zg0Var.z() || this.D == 0)) {
                zg0Var.start();
            }
            zg0Var.J(true);
        }
        this.c0 = null;
        this.b0 = null;
        this.Z0.setShader(null);
        N0(drawable);
        R0(drawable);
        this.f0 = null;
        this.g0 = null;
        Drawable drawable3 = this.j0;
        if (drawable3 instanceof org.telegram.ui.Components.u5) {
            ((org.telegram.ui.Components.u5) drawable3).v(this);
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
        nc ncVar = this.E;
        if (ncVar != null) {
            ncVar.a = null;
            ncVar.c = null;
            ncVar.e = null;
            ncVar.g = null;
        }
        lc lcVar = this.g1;
        if (lcVar != null) {
            lcVar.f0(this, (this.a0 == null && this.m0 == null) ? false : true, true, false);
        }
        invalidate();
        if (this.U0 && this.A0 && this.C0 != null) {
            this.h1 = 0.0f;
            this.j1 = System.currentTimeMillis();
            if (this.a0 == null && this.m0 == null) {
                z9 = false;
            }
            this.m1 = z9;
        }
    }

    public final float x() {
        return this.K0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:107:0x00bb, code lost:
    
        if ((r9 instanceof org.telegram.messenger.e6) == false) goto L187;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x026a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean x0(Drawable drawable, String str, int i7, boolean z9, int i10) {
        org.telegram.ui.Components.u5 m10;
        Drawable drawable2;
        Drawable drawable3;
        Drawable drawable4;
        boolean z10;
        lc lcVar;
        boolean z11;
        if (drawable != null && str != null && this.p0 == i10) {
            if (i7 == 0) {
                if (str.equals(this.Q)) {
                    lc lcVar2 = this.g1;
                    if (lcVar2 != null) {
                        lcVar2.t0(i7, drawable);
                    }
                    if (drawable instanceof org.telegram.ui.Components.u5) {
                        org.telegram.ui.Components.u5 u5Var = (org.telegram.ui.Components.u5) drawable;
                        u5Var.C(this.q1, this.r1);
                        if (u5Var.n0) {
                            gc.D().H(this.Q);
                        }
                        if (this.y1) {
                            z11 = !u5Var.s();
                            this.S = drawable;
                            if (drawable instanceof o6) {
                            }
                            R0(drawable);
                            if (z11) {
                            }
                            this.h1 = 1.0f;
                            this.i1 = 1.0f;
                            lcVar = this.g1;
                            if (lcVar != null) {
                            }
                            if (!(drawable instanceof org.telegram.ui.Components.h5)) {
                            }
                            invalidate();
                            return true;
                        }
                        z11 = true;
                        this.S = drawable;
                        if (drawable instanceof o6) {
                        }
                        R0(drawable);
                        if (z11) {
                        }
                        this.h1 = 1.0f;
                        this.i1 = 1.0f;
                        lcVar = this.g1;
                        if (lcVar != null) {
                        }
                        if (!(drawable instanceof org.telegram.ui.Components.h5)) {
                        }
                        invalidate();
                        return true;
                    }
                    gc.D().H(this.Q);
                    if (this.y1 && (drawable == this.S || this.h1 < 1.0f)) {
                        z11 = false;
                        this.S = drawable;
                        if (drawable instanceof o6) {
                            o6 o6Var = (o6) drawable;
                            this.U = o6Var.b;
                            this.V = o6Var.a;
                        }
                        R0(drawable);
                        if (z11 || !this.Q0 || (((z9 || this.S0) && !this.U0) || this.s1 == 0)) {
                            this.h1 = 1.0f;
                            this.i1 = 1.0f;
                        } else {
                            Drawable drawable5 = this.j0;
                            if (!(drawable5 instanceof zg0) || !((zg0) drawable5).u()) {
                                Drawable drawable6 = this.j0;
                                if (!(drawable6 instanceof org.telegram.ui.Components.u5) || !((org.telegram.ui.Components.u5) drawable6).s()) {
                                    if (this.S instanceof zg0) {
                                        Drawable drawable7 = this.m0;
                                        if (!(drawable7 instanceof c80)) {
                                            if (!(drawable7 instanceof rz)) {
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
                        lcVar = this.g1;
                        if (lcVar != null) {
                            Drawable drawable9 = this.S;
                            lcVar.f0(this, (drawable9 == null && this.a0 == null && this.m0 == null && this.j0 == null) ? false : true, drawable9 == null && this.j0 == null, z9);
                        }
                        if (!(drawable instanceof org.telegram.ui.Components.h5)) {
                            org.telegram.ui.Components.h5 h5Var = (org.telegram.ui.Components.h5) drawable;
                            if (this.x1) {
                                h5Var.b(this);
                            }
                        } else if (drawable instanceof org.telegram.ui.Components.u5) {
                            org.telegram.ui.Components.u5 u5Var2 = (org.telegram.ui.Components.u5) drawable;
                            boolean z12 = this.v0;
                            if (!u5Var2.n0) {
                                u5Var2.v0 = z12;
                            }
                            if (this.x1) {
                                u5Var2.e(this);
                            }
                            if (this.t0 && this.D == 0) {
                                u5Var2.j();
                            }
                            boolean z13 = this.w0;
                            u5Var2.D = z13;
                            if (z13) {
                                u5Var2.x(false);
                            }
                            this.z0 = false;
                            View view = this.e;
                            if (view != null) {
                                view.invalidate();
                            }
                        } else if (drawable instanceof zg0) {
                            zg0 zg0Var = (zg0) drawable;
                            if (this.x1) {
                                zg0Var.I0.add(this);
                            }
                            if (this.u0 && (!zg0Var.z() || this.D == 0)) {
                                zg0Var.start();
                            }
                            zg0Var.J(true);
                            zg0Var.K(this.x0);
                            zg0Var.L = this.y0;
                            zg0Var.E0 = this.b;
                            this.z0 = false;
                        }
                        invalidate();
                        return true;
                    }
                    z11 = true;
                    this.S = drawable;
                    if (drawable instanceof o6) {
                    }
                    R0(drawable);
                    if (z11) {
                    }
                    this.h1 = 1.0f;
                    this.i1 = 1.0f;
                    lcVar = this.g1;
                    if (lcVar != null) {
                    }
                    if (!(drawable instanceof org.telegram.ui.Components.h5)) {
                    }
                    invalidate();
                    return true;
                }
            } else {
                if (i7 != 3) {
                    if (i7 == 1) {
                        if (this.a0 == null && ((this.S0 || (((m10 = m()) == null || !m10.s()) && (((drawable2 = this.S) == null || (drawable2 instanceof org.telegram.ui.Components.u5)) && ((drawable3 = this.j0) == null || (drawable3 instanceof org.telegram.ui.Components.u5))))) && str.equals(this.Y))) {
                            lc lcVar3 = this.g1;
                            if (lcVar3 != null) {
                                lcVar3.t0(i7, drawable);
                            }
                            gc.D().H(this.Y);
                            this.a0 = drawable;
                            if (drawable instanceof o6) {
                                o6 o6Var2 = (o6) drawable;
                                this.d0 = o6Var2.b;
                                this.e0 = o6Var2.a;
                            }
                            R0(drawable);
                            if (z9 || this.k1 == 2) {
                                this.h1 = 1.0f;
                                this.i1 = 1.0f;
                            } else {
                                Object obj = this.h;
                                if ((obj instanceof ij) && ((ij) obj).h4() && ((ij) this.h).o4()) {
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
                    lcVar = this.g1;
                    if (lcVar != null) {
                    }
                    if (!(drawable instanceof org.telegram.ui.Components.h5)) {
                    }
                    invalidate();
                    return true;
                }
                if (str.equals(this.h0)) {
                    lc lcVar4 = this.g1;
                    if (lcVar4 != null) {
                        lcVar4.t0(i7, drawable);
                    }
                    if (drawable instanceof org.telegram.ui.Components.u5) {
                        org.telegram.ui.Components.u5 u5Var3 = (org.telegram.ui.Components.u5) drawable;
                        u5Var3.C(this.q1, this.r1);
                        if (u5Var3.n0) {
                            gc.D().H(this.h0);
                        }
                        if (this.y1 && (((z10 = (drawable4 = this.a0) instanceof org.telegram.ui.Components.u5)) || (this.S instanceof org.telegram.ui.Components.u5))) {
                            u5Var3.y(z10 ? ((org.telegram.ui.Components.u5) drawable4).c : 0L, true, true);
                        }
                    } else {
                        gc.D().H(this.h0);
                    }
                    this.j0 = drawable;
                    R0(drawable);
                    if (this.S == null) {
                        if ((z9 || this.S0) && !this.U0) {
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
                    lcVar = this.g1;
                    if (lcVar != null) {
                    }
                    if (!(drawable instanceof org.telegram.ui.Components.h5)) {
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

    public final void y0(float f10, float f11, float f12, float f13) {
        this.K0 = f10;
        this.L0 = f11;
        this.M0 = f12;
        this.N0 = f13;
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
