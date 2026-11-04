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
import org.telegram.ui.Components.ch0;
import org.telegram.ui.Components.eb0;
import org.telegram.ui.Components.oi0;
import org.telegram.ui.Components.x41;
import org.telegram.ui.Components.y70;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public class ImageReceiver implements cs, org.telegram.ui.Components.m5 {
    public static final PorterDuffColorFilter H1;
    public static final PorterDuffColorFilter I1;
    public static final float[] J1;
    public boolean A0;
    public boolean B0;
    public boolean B1;
    public boolean C0;
    public Drawable D0;
    public int D1;
    public int E;
    public String E0;
    public za.p E1;
    public gc F;
    public BitmapShader F0;
    public ei.k4 F1;
    public Object G;
    public boolean G0;
    public boolean G1;
    public Bitmap H;
    public boolean H0;
    public BitmapShader I;
    public TLRPC.Document I0;
    public ComposeShader J;
    public boolean J0;
    public Bitmap K;
    public boolean K0;
    public BitmapShader L;
    public float L0;
    public Canvas M;
    public float M0;
    public Paint N;
    public float N0;
    public ac O;
    public float O0;
    public ac P;
    public float P0;
    public String Q;
    public String R;
    public int S;
    public boolean S0;
    public Drawable T;
    public boolean T0;
    public BitmapShader U;
    public boolean U0;
    public int V;
    public boolean V0;
    public int W;
    public ac X;
    public String Y;
    public String Z;
    public Integer Z0;
    public List a;
    public int a0;
    public boolean b;
    public Drawable b0;
    public ArrayList c;
    public BitmapShader c0;
    public BitmapShader d0;
    public View e;
    public int e0;
    public int f;
    public int f0;
    public int f1;
    public ac g0;
    public boolean g1;
    public Object h;
    public String h0;
    public ec h1;
    public String i0;
    public float i1;
    public int j0;
    public Drawable k0;
    public long k1;
    public BitmapShader l0;
    public boolean m1;
    public boolean n;
    public Drawable n0;
    public boolean n1;
    public String o0;
    public boolean p0;
    public ColorFilter p1;
    public int q0;
    public boolean q1;
    public boolean r;
    public long r0;
    public long r1;
    public long s;
    public int s0;
    public long s1;
    public float u1;
    public int v1;
    public boolean w0;
    public String w1;
    public int x;
    public boolean x0;
    public boolean y;
    public boolean y1;
    public boolean z1;
    public int w = 1;
    public boolean m0 = true;
    public boolean t0 = true;
    public boolean u0 = true;
    public boolean v0 = true;
    public int y0 = 1;
    public int z0 = -1;
    public final RectF Q0 = new RectF();
    public boolean R0 = true;
    public boolean W0 = true;
    public final int[] X0 = new int[4];
    public boolean Y0 = true;
    public final RectF b1 = new RectF();
    public final Matrix c1 = new Matrix();
    public final Path d1 = new Path();
    public float e1 = 1.0f;
    public float j1 = 1.0f;
    public byte l1 = 1;
    public float o1 = 0.05f;
    public int t1 = hs.g2;
    public final ArrayList x1 = new ArrayList();
    public boolean A1 = false;
    public boolean C1 = true;
    public final Paint a1 = new Paint(3);
    public int d = h10.t0;

    static {
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        H1 = new PorterDuffColorFilter(-2236963, mode);
        I1 = new PorterDuffColorFilter(-4473925, mode);
        J1 = new float[8];
    }

    public ImageReceiver(View view) {
        this.e = view;
    }

    public final float A() {
        return this.M0 + this.O0;
    }

    public final void A0(RectF rectF) {
        if (rectF != null) {
            this.L0 = rectF.left;
            this.M0 = rectF.top;
            this.N0 = rectF.width();
            this.O0 = rectF.height();
        }
    }

    public final ch0 B() {
        Drawable drawable = this.k0;
        if (drawable instanceof ch0) {
            return (ch0) drawable;
        }
        Drawable drawable2 = this.T;
        if (drawable2 instanceof ch0) {
            return (ch0) drawable2;
        }
        Drawable drawable3 = this.b0;
        if (drawable3 instanceof ch0) {
            return (ch0) drawable3;
        }
        Drawable drawable4 = this.n0;
        if (drawable4 instanceof ch0) {
            return (ch0) drawable4;
        }
        return null;
    }

    public final void B0(int i3) {
        this.N0 = i3;
    }

    public final int C() {
        return this.V;
    }

    public final void C0(float f10) {
        this.L0 = f10;
    }

    public final int[] D() {
        return this.X0;
    }

    public final void D0(float f10) {
        this.M0 = f10;
    }

    public final int[] E() {
        if (this.W0) {
            return this.X0;
        }
        return null;
    }

    public final void E0(int i3) {
        this.x = i3;
        if (this.y1) {
            this.E = hs.e().p & (~this.x);
        }
    }

    public final Drawable F() {
        return this.n0;
    }

    public final void F0(long j10, long j11) {
        this.r1 = j10;
        this.s1 = j11;
        Drawable drawable = this.k0;
        if (drawable instanceof org.telegram.ui.Components.t5) {
            ((org.telegram.ui.Components.t5) drawable).C(j10, j11);
        }
    }

    public final int G(int i3) {
        return i3 == 1 ? this.a0 : i3 == 3 ? this.j0 : this.S;
    }

    public final void G0(int i3, int i10, boolean z10) {
        while (i3 < 0) {
            i3 += 360;
        }
        while (i3 > 360) {
            i3 -= 360;
        }
        this.e0 = i3;
        this.V = i3;
        this.f0 = i10;
        this.W = i10;
        this.g1 = z10;
    }

    public final boolean H() {
        return this.R0;
    }

    public final void H0(View view) {
        this.e = view;
        org.telegram.ui.Components.t5 m10 = m();
        if (m10 == null || !this.y1) {
            return;
        }
        View view2 = this.e;
        if (m10.s0 != null) {
            return;
        }
        m10.s0 = new WeakReference(view2);
    }

    public final boolean I() {
        return (this.T == null && this.b0 == null && this.n0 == null && this.k0 == null) ? false : true;
    }

    public final void I0(int i3) {
        this.f1 = i3;
    }

    public final boolean J() {
        return (this.T == null && this.k0 == null) ? false : true;
    }

    public final void J0(int i3) {
        L0(new int[]{i3, i3, i3, i3});
    }

    public final boolean K() {
        return (this.T == null && this.k0 == null && this.b0 == null && this.n0 == null && this.R == null && this.i0 == null) ? false : true;
    }

    public final void K0(int i3, int i10, int i11, int i12) {
        L0(new int[]{i3, i10, i11, i12});
    }

    public final boolean L() {
        return (this.T == null && this.k0 == null && !(this.n0 instanceof x41)) ? false : true;
    }

    public void L0(int[] iArr) {
        int i3 = iArr[0];
        this.Y0 = true;
        int i10 = 0;
        boolean z10 = false;
        while (true) {
            int[] iArr2 = this.X0;
            if (i10 >= iArr2.length) {
                break;
            }
            int i11 = iArr2[i10];
            int i12 = iArr[i10];
            if (i11 != i12) {
                z10 = true;
            }
            if (i3 != i12) {
                this.Y0 = false;
            }
            iArr2[i10] = i12;
            i10++;
        }
        if (z10) {
            Drawable drawable = this.T;
            if (drawable != null && this.U == null) {
                R0(drawable);
            }
            Drawable drawable2 = this.k0;
            if (drawable2 != null && this.l0 == null) {
                R0(drawable2);
            }
            Drawable drawable3 = this.b0;
            if (drawable3 != null) {
                R0(drawable3);
            }
            Drawable drawable4 = this.n0;
            if (drawable4 != null) {
                R0(drawable4);
            }
        }
    }

    public final boolean M() {
        org.telegram.ui.Components.t5 m10 = m();
        return m10 != null && m10.c0;
    }

    public final void M0() {
        if (!this.W0) {
            this.W0 = true;
            Drawable drawable = this.T;
            if (drawable != null && this.U == null) {
                R0(drawable);
            }
            Drawable drawable2 = this.k0;
            if (drawable2 != null && this.l0 == null) {
                R0(drawable2);
            }
            Drawable drawable3 = this.b0;
            if (drawable3 != null) {
                R0(drawable3);
            }
            Drawable drawable4 = this.n0;
            if (drawable4 != null) {
                R0(drawable4);
            }
        }
    }

    public final boolean N() {
        return (!this.B0 || this.D0 == null || this.C0) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void N0(Drawable drawable) {
        org.telegram.ui.Components.p6 p6Var;
        Drawable drawable2 = this.n0;
        if (drawable == drawable2) {
            return;
        }
        if (!(drawable2 instanceof org.telegram.ui.Components.p6)) {
            p6Var = null;
        } else if (drawable2.equals(drawable)) {
            return;
        } else {
            p6Var = (org.telegram.ui.Components.p6) this.n0;
        }
        this.n0 = drawable;
        if (this.y1 && (drawable instanceof org.telegram.ui.Components.p6)) {
            ((org.telegram.ui.Components.p6) drawable).c(this);
        }
        if (!this.y1 || p6Var == null) {
            return;
        }
        p6Var.b(this);
    }

    public final boolean O(float f10, float f11) {
        float f12 = this.L0;
        if (f10 < f12 || f10 > f12 + this.N0) {
            return false;
        }
        float f13 = this.M0;
        return f11 >= f13 && f11 <= f13 + this.O0;
    }

    public final void O0(boolean z10, boolean z11) {
        if (this.R0 == z10) {
            return;
        }
        this.R0 = z10;
        if (z11) {
            invalidate();
            ei.k4 k4Var = this.F1;
            if (k4Var != null) {
                k4Var.run();
            }
        }
    }

    public final boolean P() {
        if (!this.y1) {
            this.y1 = true;
            this.E = hs.e().p & (~this.x);
            boolean z10 = this.y;
            int i3 = hs.j1;
            if (!z10) {
                za.p pVar = this.E1;
                if (pVar != null) {
                    pVar.a();
                    this.E1 = null;
                }
                za.p pVar2 = (za.p) new gs(hs.e(), this).b;
                pVar2.b(hs.m4);
                pVar2.b(i3);
                pVar2.b(hs.k1);
                this.E1 = pVar2;
            }
            if (Y()) {
                return true;
            }
            ch0 B = B();
            if (B != null) {
                B.J0.add(this);
                B.F = this.t0;
            }
            if (B != null && this.v0 && (!B.z() || this.E == 0)) {
                B.start();
            }
            org.telegram.ui.Components.t5 m10 = m();
            if (m10 != null) {
                m10.e(this);
            }
            if (m10 != null && this.u0 && this.E == 0) {
                m10.j();
                invalidate();
            }
            org.telegram.ui.Components.g5 l10 = l();
            if (l10 != null) {
                l10.b(this);
            }
            if (hs.e().g()) {
                didReceivedNotification(i3, this.d, 512);
            }
            Object obj = this.n0;
            if (obj instanceof org.telegram.ui.Components.p6) {
                ((org.telegram.ui.Components.p6) obj).c(this);
            }
            if (this.c != null) {
                for (int i10 = 0; i10 < this.c.size(); i10++) {
                    ((dc) this.c.get(i10)).a(this);
                }
            }
        }
        return false;
    }

    public final void P0(boolean z10) {
        org.telegram.ui.Components.t5 m10 = m();
        if (m10 != null) {
            boolean z11 = this.w0;
            if (!m10.o0) {
                m10.w0 = z11;
            }
            m10.start();
            return;
        }
        ch0 B = B();
        if (B == null || B.l0) {
            return;
        }
        B.H(z10);
    }

    public final void Q(Drawable drawable) {
        if (drawable == this.k0 && this.i0 != null) {
            zb.D().Q(this.i0);
            this.i0 = null;
        } else if (drawable == this.T && this.R != null) {
            zb.D().Q(this.R);
            this.R = null;
        } else if (drawable == this.b0 && this.Z != null) {
            zb.D().Q(this.Z);
            this.Z = null;
        }
        u0(this.g0, this.h0, this.P, this.Q, this.X, this.Y, this.b0, this.r0, this.o0, this.h, this.s0);
    }

    public final void Q0() {
        org.telegram.ui.Components.t5 m10 = m();
        if (m10 != null) {
            m10.stop();
            return;
        }
        ch0 B = B();
        if (B != null) {
            B.stop();
        }
    }

    public final void R() {
        za.p pVar;
        if (this.y1) {
            this.y1 = false;
            ac acVar = this.P;
            if (acVar != null || this.g0 != null || this.X != null || this.n0 != null) {
                if (this.F == null) {
                    this.F = new gc();
                }
                gc gcVar = this.F;
                gcVar.e = this.g0;
                gcVar.f = this.h0;
                gcVar.a = acVar;
                gcVar.b = this.Q;
                gcVar.c = this.X;
                gcVar.d = this.Y;
                gcVar.g = this.n0;
                gcVar.h = this.r0;
                gcVar.k = this.o0;
                gcVar.i = this.s0;
                gcVar.j = this.h;
            }
            if (!this.y && (pVar = this.E1) != null) {
                pVar.a();
                this.E1 = null;
            }
            Object obj = this.n0;
            if (obj instanceof org.telegram.ui.Components.p6) {
                ((org.telegram.ui.Components.p6) obj).b(this);
            }
            if (this.n0 != null) {
                N0(null);
                this.d0 = null;
            }
            f();
            this.a1.setShader(null);
            if (this.f1 == 0) {
                this.u1 = 0.0f;
            }
            org.telegram.ui.Components.g5 l10 = l();
            if (l10 != null) {
                l10.o(this);
            }
            org.telegram.ui.Components.t5 m10 = m();
            if (m10 != null) {
                m10.v(this);
            }
            ch0 B = B();
            if (B != null) {
                B.F(this);
            }
            if (this.c != null) {
                for (int i3 = 0; i3 < this.c.size(); i3++) {
                    ArrayList arrayList = ((ei.w9) ((dc) this.c.get(i3))).a;
                    if (arrayList != null) {
                        for (int i10 = 0; i10 < arrayList.size(); i10++) {
                            ((ei.s9) arrayList.get(i10)).b(false);
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
            if (!(drawable instanceof BitmapDrawable) && !(drawable instanceof org.telegram.ui.Components.u8)) {
                f0(drawable, null);
                return;
            }
            if (drawable instanceof org.telegram.ui.Components.u8) {
                ((org.telegram.ui.Components.u8) drawable).r = E[0];
                return;
            }
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            if (bitmapDrawable instanceof ch0) {
                return;
            }
            if (bitmapDrawable instanceof org.telegram.ui.Components.t5) {
                ((org.telegram.ui.Components.t5) drawable).B(E);
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

    public final void S(int i3, String str) {
        String str2;
        Drawable drawable;
        String str3;
        if (i3 == 3) {
            str2 = this.i0;
            drawable = this.k0;
        } else if (i3 == 2) {
            str2 = this.E0;
            drawable = this.D0;
        } else if (i3 == 1) {
            str2 = this.Z;
            drawable = this.b0;
        } else {
            str2 = this.R;
            drawable = this.T;
        }
        if (str2 != null && ((str2.startsWith("-") || str2.startsWith("strippedmessage-")) && (str3 = (String) zb.D().t.get(str2)) != null)) {
            str2 = str3;
        }
        if (drawable instanceof ch0) {
            ((ch0) drawable).F(this);
        }
        if (drawable instanceof org.telegram.ui.Components.t5) {
            ((org.telegram.ui.Components.t5) drawable).v(this);
        }
        if (drawable instanceof org.telegram.ui.Components.g5) {
            ((org.telegram.ui.Components.g5) drawable).o(this);
        }
        if (str2 != null && ((str == null || !str.equals(str2)) && drawable != null)) {
            if (drawable instanceof ch0) {
                ch0 ch0Var = (ch0) drawable;
                boolean p10 = zb.D().p(str2);
                if (!zb.D().J(str2, true) && p10) {
                    ch0Var.C(false);
                }
            } else if (drawable instanceof org.telegram.ui.Components.t5) {
                org.telegram.ui.Components.t5 t5Var = (org.telegram.ui.Components.t5) drawable;
                if (t5Var.o0) {
                    boolean p11 = zb.D().p(str2);
                    if (zb.D().J(str2, true)) {
                        if (p11) {
                            t5Var.stop();
                        }
                    } else if (p11) {
                        t5Var.u();
                    }
                } else if (t5Var.u0.isEmpty()) {
                    t5Var.u();
                }
            } else if (drawable instanceof BitmapDrawable) {
                Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
                boolean p12 = zb.D().p(str2);
                if (!zb.D().J(str2, false) && p12) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(bitmap);
                    g0.A2(arrayList);
                }
            }
        }
        if (i3 == 3) {
            this.i0 = null;
            this.k0 = null;
            this.l0 = null;
        } else if (i3 == 2) {
            this.E0 = null;
            this.D0 = null;
            this.F0 = null;
        } else if (i3 == 1) {
            this.b0 = null;
            this.Z = null;
            this.c0 = null;
        } else {
            this.T = null;
            this.R = null;
            this.U = null;
        }
    }

    public final void T(boolean z10) {
        this.x0 = z10;
    }

    public final void U(boolean z10) {
        this.u0 = z10;
    }

    public final void V(boolean z10) {
        this.S0 = false;
    }

    public final void W(int i3) {
        this.y0 = i3;
        ch0 B = B();
        if (B != null) {
            B.K(i3);
        }
    }

    public final void X(int i3) {
        this.z0 = i3;
        if (B() != null) {
            B().M = i3;
            return;
        }
        this.D1 = i3;
        if (m() != null) {
            m().z0 = 0;
        }
    }

    public final boolean Y() {
        gc gcVar = this.F;
        if (gcVar == null) {
            return false;
        }
        if (gcVar.a == null && gcVar.c == null && gcVar.e == null && gcVar.g == null) {
            return false;
        }
        this.F = null;
        Drawable drawable = gcVar.g;
        if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            if (!(bitmapDrawable instanceof ch0) && !(bitmapDrawable instanceof org.telegram.ui.Components.t5) && bitmapDrawable.getBitmap() != null && bitmapDrawable.getBitmap().isRecycled()) {
                gcVar.g = null;
            }
        }
        u0(gcVar.e, gcVar.f, gcVar.a, gcVar.b, gcVar.c, gcVar.d, gcVar.g, gcVar.h, gcVar.k, gcVar.j, gcVar.i);
        gcVar.a = null;
        gcVar.c = null;
        gcVar.e = null;
        gcVar.g = null;
        this.F = gcVar;
        ch0 B = B();
        if (B != null) {
            B.F = this.t0;
        }
        if (B == null || !this.v0) {
            return true;
        }
        if (B.z() && this.E != 0) {
            return true;
        }
        B.start();
        return true;
    }

    public final void Z(Object obj) {
        this.G = obj;
        invalidate();
    }

    public final void a(ei.w9 w9Var) {
        if (this.c == null) {
            this.c = new ArrayList();
        }
        this.c.add(w9Var);
        if (this.y1) {
            w9Var.a(this);
        }
    }

    public final void a0(ColorFilter colorFilter) {
        this.p1 = colorFilter;
    }

    public final void b() {
        zb D = zb.D();
        D.s.c(new k7(D, this, this.w, 3));
    }

    public final void b0(int i3) {
        this.t1 = i3;
    }

    public final void c() {
        this.r = false;
        zb.D().h(this, true);
        this.n = true;
    }

    public final void c0(boolean z10) {
        this.B0 = z10;
    }

    public final void d(boolean z10, bc bcVar) {
        if (this.m1) {
            return;
        }
        float f10 = this.i1;
        if (f10 != 1.0f) {
            if (!z10) {
                if (bcVar != null) {
                    long currentTimeMillis = System.currentTimeMillis();
                    long j10 = this.k1;
                    long j11 = currentTimeMillis - j10;
                    if (j10 == 0) {
                        j11 = 16;
                    }
                    if (j11 > 30 && g0.r > 60.0f) {
                        j11 = 30;
                    }
                    this.i1 = (j11 / this.t1) + this.i1;
                } else {
                    this.i1 = (16.0f / this.t1) + f10;
                }
                if (this.i1 > 1.0f) {
                    this.i1 = 1.0f;
                    this.j1 = 1.0f;
                    if (this.D0 != null) {
                        S(2, null);
                        this.F0 = null;
                    }
                }
            }
            if (bcVar != null) {
                g0.h3(new a(this, 12));
            } else {
                invalidate();
            }
        }
    }

    public final void d0(ec ecVar) {
        this.h1 = ecVar;
    }

    @Override // org.telegram.messenger.cs
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        int i11;
        if (i3 == hs.m4) {
            String str = (String) objArr[0];
            String str2 = this.i0;
            if (str2 != null && str2.equals(str)) {
                this.i0 = (String) objArr[1];
                ac acVar = (ac) objArr[2];
                this.g0 = acVar;
                gc gcVar = this.F;
                if (gcVar != null) {
                    gcVar.e = acVar;
                }
            }
            String str3 = this.R;
            if (str3 != null && str3.equals(str)) {
                this.R = (String) objArr[1];
                ac acVar2 = (ac) objArr[2];
                this.P = acVar2;
                gc gcVar2 = this.F;
                if (gcVar2 != null) {
                    gcVar2.a = acVar2;
                }
            }
            String str4 = this.Z;
            if (str4 == null || !str4.equals(str)) {
                return;
            }
            this.Z = (String) objArr[1];
            ac acVar3 = (ac) objArr[2];
            this.X = acVar3;
            gc gcVar3 = this.F;
            if (gcVar3 != null) {
                gcVar3.c = acVar3;
                return;
            }
            return;
        }
        if (i3 == hs.j1) {
            Integer num = (Integer) objArr[0];
            if (this.x >= num.intValue()) {
                return;
            }
            int intValue = num.intValue() | this.E;
            this.E = intValue;
            if (intValue != 0) {
                ch0 B = B();
                if (B != null && B.z()) {
                    B.stop();
                }
                org.telegram.ui.Components.t5 m10 = m();
                if (m10 != null) {
                    m10.stop();
                    return;
                }
                return;
            }
            return;
        }
        if (i3 == hs.k1) {
            Integer num2 = (Integer) objArr[0];
            if (this.x >= num2.intValue() || (i11 = this.E) == 0) {
                return;
            }
            int i12 = (~num2.intValue()) & i11;
            this.E = i12;
            if (i12 == 0) {
                ch0 B2 = B();
                if (B2 != null) {
                    B2.F = this.t0;
                }
                if (this.v0 && B2 != null && B2.z()) {
                    B2.start();
                }
                org.telegram.ui.Components.t5 m11 = m();
                if (!this.u0 || m11 == null) {
                    return;
                }
                m11.j();
                invalidate();
            }
        }
    }

    public final void e() {
        if (this.c != null) {
            if (this.y1) {
                for (int i3 = 0; i3 < this.c.size(); i3++) {
                    ArrayList arrayList = ((ei.w9) ((dc) this.c.get(i3))).a;
                    if (arrayList != null) {
                        for (int i10 = 0; i10 < arrayList.size(); i10++) {
                            ((ei.s9) arrayList.get(i10)).b(false);
                        }
                    }
                }
            }
            this.c.clear();
        }
    }

    public final bc e0(bc bcVar, int i3) {
        ch0 ch0Var;
        if (bcVar == null) {
            bcVar = new bc();
            bcVar.h = new int[4];
            bcVar.y = new RectF();
        }
        bcVar.d = i3;
        bcVar.f = m();
        bcVar.g = B();
        boolean z10 = false;
        for (int i10 = 0; i10 < 4; i10++) {
            bcVar.h[i10] = this.X0[i10];
        }
        bcVar.j = this.k0;
        bcVar.i = this.l0;
        bcVar.l = this.T;
        bcVar.k = this.U;
        bcVar.m = this.b0;
        bcVar.n = this.c0;
        bcVar.e = this.d0;
        bcVar.o = this.n0;
        bcVar.x = this.D0;
        bcVar.z = this.p1;
        bcVar.w = this.C0;
        bcVar.p = this.i1;
        bcVar.q = this.j1;
        bcVar.r = this.F0;
        org.telegram.ui.Components.t5 t5Var = bcVar.f;
        if ((t5Var != null && !t5Var.s()) || ((ch0Var = bcVar.g) != null && !ch0Var.u())) {
            z10 = true;
        }
        bcVar.a = z10;
        bcVar.u = this.L0;
        bcVar.v = this.M0;
        bcVar.t = this.N0;
        bcVar.s = this.O0;
        bcVar.b = this.e1;
        return bcVar;
    }

    public final void f() {
        for (int i3 = 0; i3 < 4; i3++) {
            S(i3, null);
        }
        zb.D().h(this, true);
    }

    public final void f0(Drawable drawable, BitmapShader bitmapShader) {
        if (drawable == this.b0) {
            this.c0 = bitmapShader;
            return;
        }
        if (drawable == this.n0) {
            this.d0 = bitmapShader;
            return;
        }
        if (drawable == this.k0) {
            this.l0 = bitmapShader;
            return;
        }
        if (drawable == this.T) {
            this.U = bitmapShader;
            if (this.I == null || !(drawable instanceof BitmapDrawable)) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 28) {
                this.J = new ComposeShader(this.I, this.U, PorterDuff.Mode.DST_IN);
                return;
            }
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            int width = bitmapDrawable.getBitmap().getWidth();
            int height = bitmapDrawable.getBitmap().getHeight();
            Bitmap bitmap = this.K;
            if (bitmap != null && bitmap.getWidth() == width && this.K.getHeight() == height) {
                return;
            }
            Bitmap bitmap2 = this.K;
            if (bitmap2 != null) {
                bitmap2.recycle();
            }
            this.K = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
            this.M = new Canvas(this.K);
            Bitmap bitmap3 = this.K;
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            this.L = new BitmapShader(bitmap3, tileMode, tileMode);
            if (this.N == null) {
                Paint paint = new Paint();
                this.N = paint;
                paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
            }
        }
    }

    public final boolean g(Canvas canvas) {
        return h(canvas, null);
    }

    public final void g0(boolean z10) {
        if (this.G1 == z10) {
            return;
        }
        this.G1 = z10;
        this.v0 = !z10;
        ch0 B = B();
        if (B != null) {
            if (z10) {
                B.stop();
            } else {
                if (B.l0) {
                    return;
                }
                B.start();
            }
        }
    }

    public float getAlpha() {
        return this.e1;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(19:0|1|(1:5)|(1:7)(1:221)|(9:8|(1:10)(2:211|(1:219)(1:215))|11|12|(1:14)|15|(1:17)|(2:208|(1:210))|20)|(12:(1:(1:(1:194)(2:195|(3:197|(1:202)(1:200)|201)(1:203)))(1:192))(1:189)|28|(1:30)(1:184)|31|32|(4:34|(17:36|(2:(1:(1:40))|(7:42|(1:45)|46|47|48|49|(11:97|(2:(3:(3:(4:109|110|111|(13:113|(2:147|148)(1:117)|118|119|120|(1:124)|125|126|(1:146)(4:131|(3:132|133|(2:135|136)(1:137))|138|139)|140|141|(1:143)|145))|149|(0))|149|(0))|(2:159|(0))(3:(5:161|(4:164|155|111|(0))|156|111|(0))|149|(0)))|165|125|126|(1:128)|146|140|141|(0)|145)(2:52|53)))|170|48|49|(0)|97|(3:99|(3:(3:(4:109|110|111|(0))|149|(0))|149|(0))|(0)(0))|165|125|126|(0)|146|140|141|(0)|145)(2:171|172)|(1:96)(1:57)|58)(2:173|(5:175|(1:177)|178|179|180)(7:181|182|(2:63|64)|69|(1:73)|(3:79|(4:82|(1:92)(5:84|(2:87|85)|88|89|90)|91|80)|93)|94))|59|(2:63|64)|69|(2:71|73)|(5:75|77|79|(1:80)|93)|94)(1:26)|27|28|(0)(0)|31|32|(0)(0)|59|(0)|69|(0)|(0)|94|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x01dd, code lost:
    
        if (r1.m0 == false) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x01df, code lost:
    
        if (r21 != null) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x01e1, code lost:
    
        r1.R0(r3);
        r2 = r1.d0;
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
    public final boolean h(Canvas canvas, bc bcVar) {
        int[] iArr;
        boolean z10;
        boolean z11;
        Canvas canvas2;
        ImageReceiver imageReceiver;
        int i3;
        org.telegram.ui.Components.t5 m10;
        ch0 B;
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
        float f10;
        float f11;
        BitmapShader bitmapShader5;
        float f12;
        boolean z13;
        Drawable drawable6;
        BitmapShader bitmapShader6;
        Drawable drawable7;
        boolean z14;
        BitmapShader bitmapShader7;
        Drawable drawable8;
        float f13;
        BitmapShader bitmapShader8;
        boolean z15;
        Drawable drawable9;
        boolean z16;
        Drawable drawable10;
        float f14;
        boolean z17;
        Drawable drawable11;
        int i10;
        int i11;
        BitmapShader bitmapShader9;
        int i12;
        Drawable drawable12;
        boolean z18;
        Canvas canvas3;
        ImageReceiver imageReceiver2;
        boolean z19;
        bc bcVar2;
        ImageReceiver imageReceiver3;
        int[] iArr3;
        float f15;
        Drawable drawable13;
        float f16;
        boolean z20;
        Drawable drawable14;
        Canvas canvas4;
        Drawable drawable15;
        boolean z21;
        float[] fArr;
        BitmapShader bitmapShader10;
        ImageReceiver imageReceiver4 = this;
        Path path = imageReceiver4.d1;
        if (imageReceiver4.H != null && imageReceiver4.R != null) {
            canvas.save();
            float f17 = imageReceiver4.L0;
            float f18 = imageReceiver4.M0;
            canvas.clipRect(f17, f18, imageReceiver4.N0 + f17, imageReceiver4.O0 + f18);
            canvas.drawColor(-16777216);
        }
        boolean z22 = bcVar != null;
        try {
            if (z22) {
                m10 = bcVar.f;
                B = bcVar.g;
                iArr2 = bcVar.h;
                drawable = bcVar.j;
                bitmapShader = bcVar.i;
                drawable2 = bcVar.l;
                bitmapShader2 = bcVar.k;
                bitmapShader3 = bcVar.n;
                bitmapShader4 = bcVar.e;
                drawable3 = bcVar.x;
                z12 = bcVar.w;
                drawable4 = bcVar.m;
                drawable5 = bcVar.o;
                f10 = bcVar.p;
                f11 = bcVar.q;
                bitmapShader5 = bcVar.r;
                z13 = bcVar.a;
                f12 = bcVar.b;
            } else {
                m10 = imageReceiver4.m();
                B = imageReceiver4.B();
                iArr2 = imageReceiver4.X0;
                drawable = imageReceiver4.k0;
                bitmapShader = imageReceiver4.l0;
                drawable2 = imageReceiver4.T;
                bitmapShader2 = imageReceiver4.U;
                Drawable drawable16 = imageReceiver4.b0;
                bitmapShader3 = imageReceiver4.c0;
                bitmapShader4 = imageReceiver4.d0;
                z12 = imageReceiver4.C0;
                drawable3 = imageReceiver4.D0;
                drawable4 = drawable16;
                drawable5 = imageReceiver4.n0;
                f10 = imageReceiver4.i1;
                f11 = imageReceiver4.j1;
                bitmapShader5 = imageReceiver4.F0;
                f12 = imageReceiver4.e1;
                z13 = ((m10 == null || m10.s()) && (B == null || B.u())) ? false : true;
            }
            ch0 ch0Var = B;
            org.telegram.ui.Components.t5 t5Var = m10;
            drawable6 = drawable5;
            bitmapShader6 = bitmapShader2;
            drawable7 = drawable;
            int[] iArr4 = iArr2;
            z14 = z13;
            bitmapShader7 = bitmapShader4;
            drawable8 = drawable3;
            f13 = f10;
            bitmapShader8 = bitmapShader3;
            z15 = z12;
            drawable9 = drawable4;
            z16 = z22;
            drawable10 = drawable2;
            f14 = f12;
            if (!imageReceiver4.W0) {
                iArr4 = null;
            }
            iArr = iArr4;
            if (t5Var != null) {
                t5Var.B(iArr);
            }
            if ((t5Var != null || ch0Var != null) && !z14 && !imageReceiver4.A0 && !z16) {
                imageReceiver4.A0 = true;
                ec ecVar = imageReceiver4.h1;
                if (ecVar != null) {
                    ecVar.D(imageReceiver4);
                }
            }
            z17 = imageReceiver4.T0;
        } catch (Exception e10) {
            e = e10;
        }
        if (z17 || imageReceiver4.U0 || drawable7 == null || z14) {
            if (!z17 && drawable10 != null && (!z14 || drawable7 != null)) {
                i10 = imageReceiver4.V;
                i11 = imageReceiver4.W;
                drawable11 = drawable10;
                z14 = false;
            } else if (drawable8 != null && !z15) {
                i10 = imageReceiver4.V;
                i11 = imageReceiver4.W;
                drawable11 = drawable8;
                bitmapShader6 = bitmapShader5;
            } else if (drawable9 != null) {
                i10 = imageReceiver4.e0;
                i11 = imageReceiver4.f0;
                drawable11 = drawable9;
                bitmapShader6 = bitmapShader8;
            } else if (drawable6 instanceof BitmapDrawable) {
                if (imageReceiver4.m0 && bitmapShader7 == null) {
                    imageReceiver4.R0(drawable6);
                    bitmapShader9 = imageReceiver4.d0;
                } else {
                    bitmapShader9 = bitmapShader7;
                }
                int i13 = imageReceiver4.e0;
                i12 = imageReceiver4.f0;
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
            float f19 = imageReceiver4.o1;
            float min = f19 <= 0.0f ? Math.min((f19 * f13) + f13, 1.0f) : f13;
            if (drawable11 == null) {
                if (imageReceiver4.l1 != 0) {
                    try {
                        if (f11 != 1.0f) {
                            if (drawable11 != drawable10) {
                                if (drawable11 == drawable7) {
                                }
                            }
                            if (drawable6 != null) {
                                if (imageReceiver4.m0 && bitmapShader7 == null) {
                                    imageReceiver4.R0(drawable6);
                                    bitmapShader7 = imageReceiver4.d0;
                                }
                                f15 = f13;
                                z19 = z14;
                                drawable13 = drawable11;
                                f16 = min;
                                BitmapShader bitmapShader11 = bitmapShader7;
                                iArr3 = iArr;
                                imageReceiver4.k(canvas, drawable6, (int) (f14 * 255.0f), bitmapShader11, i10, i11, bcVar);
                                bitmapShader7 = bitmapShader11;
                                z20 = imageReceiver4.n1;
                                if (z20 || !z19) {
                                    int i14 = i11;
                                    drawable14 = drawable13;
                                    int i15 = i10;
                                    if (z20 && f16 != 1.0f) {
                                        if (drawable14 != drawable10 && drawable14 != drawable7) {
                                            if (drawable14 != drawable9 && drawable14 != drawable8) {
                                                if (drawable14 == drawable6 && drawable8 != null) {
                                                    drawable6 = drawable8;
                                                    bitmapShader10 = bitmapShader5;
                                                    if (drawable6 != null) {
                                                        drawable15 = drawable14;
                                                        int A = ((drawable6 instanceof jz) || (drawable6 instanceof e6)) ? (int) k5.A(1.0f, f16, f14, 255.0f) : (int) (f11 * f14 * 255.0f);
                                                        canvas4 = canvas;
                                                        imageReceiver4.k(canvas4, drawable6, A, bitmapShader10, imageReceiver4.e0, imageReceiver4.f0, bcVar);
                                                        if (A != 255 && (drawable6 instanceof e6)) {
                                                            drawable6.setAlpha(hs.e4);
                                                        }
                                                        if (imageReceiver4.o1 > 0.0f || f16 >= 1.0f || !z15) {
                                                            z21 = false;
                                                        } else {
                                                            canvas4.save();
                                                            path.rewind();
                                                            RectF rectF = g0.P;
                                                            float f20 = imageReceiver4.L0;
                                                            float f21 = imageReceiver4.M0;
                                                            rectF.set(f20, f21, imageReceiver4.N0 + f20, imageReceiver4.O0 + f21);
                                                            int i16 = 0;
                                                            while (true) {
                                                                int length = iArr3.length;
                                                                fArr = J1;
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
                                                            float y9 = com.google.android.recaptcha.internal.a.y(1.0f, org.telegram.ui.Components.xq.i.getInterpolation(f15), imageReceiver4.o1, 1.0f);
                                                            canvas4.scale(y9, y9, imageReceiver4.r(), imageReceiver4.s());
                                                            z21 = true;
                                                        }
                                                        Drawable drawable17 = drawable15;
                                                        imageReceiver4.k(canvas4, drawable17, (int) (f14 * f16 * 255.0f), bitmapShader6, i15, i14, bcVar);
                                                        if (z21) {
                                                            canvas.restore();
                                                        }
                                                        imageReceiver3 = this;
                                                        bcVar2 = bcVar;
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
                                                if (imageReceiver4.m0 && bitmapShader7 == null) {
                                                    imageReceiver4.R0(drawable6);
                                                    BitmapShader bitmapShader12 = imageReceiver4.d0;
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
                                    if (imageReceiver4.o1 > 0.0f) {
                                    }
                                    z21 = false;
                                    Drawable drawable172 = drawable15;
                                    imageReceiver4.k(canvas4, drawable172, (int) (f14 * f16 * 255.0f), bitmapShader6, i15, i14, bcVar);
                                    if (z21) {
                                    }
                                    imageReceiver3 = this;
                                    bcVar2 = bcVar;
                                    drawable12 = drawable172;
                                } else {
                                    Drawable drawable18 = drawable13;
                                    imageReceiver4.k(canvas, drawable18, (int) (f14 * 255.0f), bitmapShader6, i10, i11, bcVar);
                                    bcVar2 = bcVar;
                                    drawable12 = drawable18;
                                    imageReceiver3 = imageReceiver4;
                                }
                            }
                        }
                        z20 = imageReceiver4.n1;
                        if (z20) {
                        }
                        int i142 = i11;
                        drawable14 = drawable13;
                        int i152 = i10;
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
                        if (imageReceiver4.o1 > 0.0f) {
                        }
                        z21 = false;
                        Drawable drawable1722 = drawable15;
                        imageReceiver4.k(canvas4, drawable1722, (int) (f14 * f16 * 255.0f), bitmapShader6, i152, i142, bcVar);
                        if (z21) {
                        }
                        imageReceiver3 = this;
                        bcVar2 = bcVar;
                        drawable12 = drawable1722;
                    } catch (Exception e11) {
                        e = e11;
                        imageReceiver4 = this;
                        iArr = canvas;
                        z10 = true;
                        z11 = false;
                        imageReceiver = imageReceiver4;
                        canvas2 = iArr;
                        a8.g(e, z10);
                        if (imageReceiver.H != null) {
                        }
                        if (z11) {
                        }
                        return z11;
                    }
                    iArr3 = iArr;
                    f15 = f13;
                    z19 = z14;
                    drawable13 = drawable11;
                    f16 = min;
                } else {
                    Drawable drawable19 = drawable11;
                    z19 = z14;
                    ImageReceiver imageReceiver5 = this;
                    bcVar2 = bcVar;
                    imageReceiver5.k(canvas, drawable19, (int) (f14 * 255.0f), bitmapShader6, i10, i11, bcVar2);
                    drawable12 = drawable19;
                    imageReceiver3 = imageReceiver5;
                }
                imageReceiver3.d(z19 && imageReceiver3.n1, bcVar2);
                canvas3 = canvas;
                z18 = z19;
                imageReceiver2 = imageReceiver3;
            } else {
                drawable12 = drawable11;
                boolean z23 = z14;
                if (drawable6 == null) {
                    canvas2 = canvas;
                    z18 = z23;
                    imageReceiver4.d(z18, bcVar);
                    z11 = false;
                    imageReceiver = imageReceiver4;
                    if (drawable12 == null && z18 && !z16) {
                        try {
                            imageReceiver.invalidate();
                        } catch (Exception e12) {
                            e = e12;
                            z10 = true;
                            imageReceiver = imageReceiver;
                            canvas2 = canvas2;
                            a8.g(e, z10);
                            if (imageReceiver.H != null) {
                            }
                            if (z11) {
                            }
                            return z11;
                        }
                    }
                    if (imageReceiver.H != null && imageReceiver.R != null) {
                        canvas2.restore();
                    }
                    if (z11 && imageReceiver.R0 && imageReceiver.c != null) {
                        for (i3 = 0; i3 < imageReceiver.c.size(); i3++) {
                            ei.w9 w9Var = (ei.w9) ((dc) imageReceiver.c.get(i3));
                            ArrayList arrayList = w9Var.a;
                            if (arrayList != null) {
                                float alpha = imageReceiver.getAlpha();
                                float r5 = imageReceiver.r();
                                float s6 = imageReceiver.s();
                                float f23 = imageReceiver.N0;
                                w9Var.d = f23;
                                float f24 = (16.0f * f23) / 9.0f;
                                w9Var.e = f24;
                                w9Var.b = r5 - (f23 / 2.0f);
                                w9Var.c = s6 - (f24 / 2.0f);
                                canvas2.save();
                                canvas2.clipRect(imageReceiver.L0, imageReceiver.M0, imageReceiver.y(), imageReceiver.A());
                                for (int i18 = 0; i18 < arrayList.size(); i18++) {
                                    ((ei.s9) arrayList.get(i18)).a(canvas2, alpha);
                                }
                                canvas2.restore();
                            }
                        }
                    }
                    return z11;
                }
                if (drawable6 instanceof x41) {
                    ((x41) drawable6).e = imageReceiver4;
                }
                Canvas canvas5 = canvas;
                imageReceiver4.k(canvas5, drawable6, (int) (f14 * 255.0f), null, imageReceiver4.e0, imageReceiver4.f0, bcVar);
                z18 = z23;
                imageReceiver4.d(z18, bcVar);
                imageReceiver2 = imageReceiver4;
                canvas3 = canvas5;
            }
            z11 = true;
            imageReceiver = imageReceiver2;
            canvas2 = canvas3;
            if (drawable12 == null) {
                imageReceiver.invalidate();
            }
            if (imageReceiver.H != null) {
                canvas2.restore();
            }
            if (z11) {
                while (i3 < imageReceiver.c.size()) {
                }
            }
            return z11;
        }
        int i19 = imageReceiver4.V;
        i12 = imageReceiver4.W;
        i10 = i19;
        bitmapShader6 = bitmapShader;
        drawable11 = drawable7;
        i11 = i12;
        float f192 = imageReceiver4.o1;
        if (f192 <= 0.0f) {
        }
        if (drawable11 == null) {
        }
        z11 = true;
        imageReceiver = imageReceiver2;
        canvas2 = canvas3;
        if (drawable12 == null) {
        }
        if (imageReceiver.H != null) {
        }
        if (z11) {
        }
        return z11;
    }

    public final void h0(int i3) {
        if (this.w != i3) {
            this.w = i3;
            if (this.y1 && K()) {
                zb D = zb.D();
                D.s.c(new k7(D, this, this.w, 3));
            }
        }
    }

    public final void i(Canvas canvas, BitmapDrawable bitmapDrawable, bc bcVar, int i3) {
        if (bcVar == null) {
            bitmapDrawable.setAlpha(i3);
            if (bitmapDrawable instanceof ch0) {
                ((ch0) bitmapDrawable).q(canvas, null, false, this.s, 0);
                return;
            } else if (bitmapDrawable instanceof org.telegram.ui.Components.t5) {
                ((org.telegram.ui.Components.t5) bitmapDrawable).l(canvas, false, this.s, 0);
                return;
            } else {
                bitmapDrawable.draw(canvas);
                return;
            }
        }
        if (bitmapDrawable instanceof ch0) {
            ch0 ch0Var = (ch0) bitmapDrawable;
            float f10 = bcVar.u;
            float f11 = bcVar.v;
            float f12 = bcVar.t;
            float f13 = bcVar.s;
            ColorFilter colorFilter = bcVar.z;
            int i10 = bcVar.d;
            Paint[] paintArr = ch0Var.k0;
            RectF[] rectFArr = ch0Var.j0;
            if (rectFArr[i10] == null) {
                rectFArr[i10] = new RectF();
                Paint paint = new Paint(1);
                paintArr[i10] = paint;
                paint.setFilterBitmap(true);
            }
            paintArr[i10].setAlpha(i3);
            paintArr[i10].setColorFilter(colorFilter);
            rectFArr[i10].set(f10, f11, f10 + f12, f13 + f11);
            ch0Var.q(canvas, null, true, 0L, i10);
            return;
        }
        if (!(bitmapDrawable instanceof org.telegram.ui.Components.t5)) {
            Bitmap bitmap = bitmapDrawable.getBitmap();
            if (bitmap != null) {
                if (bcVar.A == null) {
                    bcVar.A = new Paint(1);
                }
                bcVar.A.setAlpha(i3);
                bcVar.A.setColorFilter(bcVar.z);
                canvas.save();
                canvas.translate(bcVar.u, bcVar.v);
                canvas.scale(bcVar.t / bitmap.getWidth(), bcVar.s / bitmap.getHeight());
                canvas.drawBitmap(bitmap, 0.0f, 0.0f, bcVar.A);
                canvas.restore();
                return;
            }
            return;
        }
        org.telegram.ui.Components.t5 t5Var = (org.telegram.ui.Components.t5) bitmapDrawable;
        float f14 = bcVar.u;
        float f15 = bcVar.v;
        float f16 = bcVar.t;
        float f17 = bcVar.s;
        ColorFilter colorFilter2 = bcVar.z;
        int i11 = bcVar.d;
        Paint[] paintArr2 = t5Var.r0;
        RectF[] rectFArr2 = t5Var.q0;
        if (rectFArr2[i11] == null) {
            rectFArr2[i11] = new RectF();
            Paint paint2 = new Paint();
            paintArr2[i11] = paint2;
            paint2.setFilterBitmap(true);
        }
        paintArr2[i11].setAlpha(i3);
        paintArr2[i11].setColorFilter(colorFilter2);
        rectFArr2[i11].set(f14, f15, f16 + f14, f17 + f15);
        t5Var.l(canvas, true, 0L, i11);
    }

    public final void i0(TLObject tLObject, Drawable drawable, Object obj) {
        j0(tLObject, drawable, obj, false, 0, false);
    }

    public void invalidate() {
        View view = this.e;
        if (view == null) {
            return;
        }
        if (this.K0) {
            view.invalidate();
            return;
        }
        float f10 = this.L0;
        float f11 = this.M0;
        view.invalidate((int) f10, (int) f11, (int) (f10 + this.N0), (int) (f11 + this.O0));
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
    public final void j(Canvas canvas, Drawable drawable, int i3, BitmapShader bitmapShader, int i10, int i11, int i12, bc bcVar) {
        float f10;
        float f11;
        float f12;
        float f13;
        ColorFilter colorFilter;
        RectF rectF;
        int[] iArr;
        jz jzVar;
        jz jzVar2;
        boolean z10;
        int intrinsicHeight;
        int intrinsicWidth;
        boolean z11;
        boolean z12;
        float f14;
        float f15;
        float f16;
        bc bcVar2;
        float f17;
        float f18;
        bc bcVar3;
        float f19;
        float f20;
        if (bcVar != null) {
            f10 = bcVar.u;
            f11 = bcVar.v;
            f12 = bcVar.s;
            f13 = bcVar.t;
            rectF = bcVar.y;
            colorFilter = bcVar.z;
            iArr = bcVar.h;
        } else {
            f10 = this.L0;
            f11 = this.M0;
            f12 = this.O0;
            f13 = this.N0;
            colorFilter = this.p1;
            rectF = this.Q0;
            iArr = this.X0;
        }
        int[] iArr2 = !this.W0 ? null : iArr;
        if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            int[] iArr3 = iArr2;
            boolean z13 = drawable instanceof ch0;
            if (z13) {
                z10 = z13;
                ((ch0) drawable).a = this.B1;
            } else {
                z10 = z13;
                if (drawable instanceof org.telegram.ui.Components.t5) {
                    ((org.telegram.ui.Components.t5) drawable).a = this.B1;
                }
            }
            Paint paint = this.a1;
            Paint paint2 = bitmapShader != null ? paint : bitmapDrawable.getPaint();
            int i13 = Build.VERSION.SDK_INT;
            if (i13 >= 29) {
                Object obj = this.G;
                if (obj == null || this.I != null) {
                    paint2.setBlendMode(null);
                } else {
                    paint2.setBlendMode(o4.v0.c(obj));
                }
            }
            boolean z14 = (paint2 == null || paint2.getColorFilter() == null) ? false : true;
            if (z14 && i12 == 0) {
                if (bitmapShader != null) {
                    paint.setColorFilter(null);
                } else if (this.n0 != drawable) {
                    bitmapDrawable.setColorFilter(null);
                }
            } else if (!z14 && i12 != 0) {
                if (i12 == 1) {
                    PorterDuffColorFilter porterDuffColorFilter = H1;
                    if (bitmapShader != null) {
                        paint.setColorFilter(porterDuffColorFilter);
                    } else {
                        bitmapDrawable.setColorFilter(porterDuffColorFilter);
                    }
                } else {
                    PorterDuffColorFilter porterDuffColorFilter2 = I1;
                    if (bitmapShader != null) {
                        paint.setColorFilter(porterDuffColorFilter2);
                    } else {
                        bitmapDrawable.setColorFilter(porterDuffColorFilter2);
                    }
                }
            }
            if (colorFilter != null && this.I == null) {
                if (bitmapShader != null) {
                    paint.setColorFilter(colorFilter);
                } else {
                    bitmapDrawable.setColorFilter(colorFilter);
                }
            }
            boolean z15 = bitmapDrawable instanceof org.telegram.ui.Components.t5;
            if (z15 || (bitmapDrawable instanceof ch0)) {
                int i14 = i10 % 360;
                if (i14 == 90 || i14 == 270) {
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
                int i15 = i10 % 360;
                if (i15 == 90 || i15 == 270) {
                    intrinsicHeight = bitmap.getHeight();
                    intrinsicWidth = bitmap.getWidth();
                } else {
                    intrinsicHeight = bitmap.getWidth();
                    intrinsicWidth = bitmap.getHeight();
                }
                z12 = bitmapDrawable instanceof fc;
                z11 = z15;
            }
            int i16 = intrinsicWidth;
            float f21 = this.P0 * 2.0f;
            float f22 = f13 - f21;
            boolean z16 = z12;
            float f23 = f12 - f21;
            float f24 = f13 == 0.0f ? 1.0f : intrinsicHeight / f22;
            float f25 = f12 == 0.0f ? 1.0f : i16 / f23;
            if (z16) {
                f24 /= 1.2f;
                f25 /= 1.2f;
            }
            float f26 = f24;
            float f27 = f25;
            if (bitmapShader == null || bcVar != null) {
                float f28 = f13;
                float f29 = f12;
                if (this.S0) {
                    float max = Math.max(f26, f27);
                    canvas.save();
                    int i17 = (int) (intrinsicHeight / max);
                    int i18 = (int) (i16 / max);
                    if (bcVar == null) {
                        float f30 = i17;
                        f18 = f28;
                        float f31 = i18;
                        f17 = f29;
                        rectF.set(com.google.android.recaptcha.internal.a.z(f18, f30, 2.0f, f10), com.google.android.recaptcha.internal.a.z(f17, f31, 2.0f, f11), k5.a(f18, f30, 2.0f, f10), k5.a(f17, f31, 2.0f, f11));
                        bitmapDrawable.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
                        if (z11) {
                            ((org.telegram.ui.Components.t5) bitmapDrawable).z(rectF.left, rectF.top, rectF.width(), rectF.height());
                        }
                    } else {
                        f17 = f29;
                        f18 = f28;
                    }
                    if (bcVar == null || iArr3 == null || iArr3[0] <= 0) {
                        bcVar3 = bcVar;
                    } else {
                        canvas.save();
                        bcVar3 = bcVar;
                        Path path = bcVar3.B;
                        if (path == null) {
                            path = new Path();
                            bcVar3.B = path;
                        }
                        path.rewind();
                        RectF rectF2 = g0.P;
                        rectF2.set(f10, f11, f10 + f18, f11 + f17);
                        path.addRoundRect(rectF2, iArr3[0], iArr3[2], Path.Direction.CW);
                        canvas.clipPath(path);
                    }
                    if (this.R0) {
                        try {
                            bitmapDrawable.setAlpha(i3);
                            i(canvas, bitmapDrawable, bcVar3, i3);
                        } catch (Exception e10) {
                            if (bcVar3 == null) {
                                Q(bitmapDrawable);
                            }
                            a8.g(e10, true);
                        }
                    }
                    canvas.restore();
                    if (bcVar3 != null && iArr3 != null && iArr3[0] > 0) {
                        canvas.restore();
                    }
                } else if (canvas != null) {
                    if (Math.abs(f26 - f27) > 1.0E-5f) {
                        canvas.save();
                        if (this.C1) {
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
                            if (this.g1) {
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
                        if (z11) {
                            ((org.telegram.ui.Components.t5) bitmapDrawable).z(f10, f11, f28, f29);
                        }
                        if (bcVar == null) {
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
                        if (this.R0) {
                            if (i13 >= 29) {
                                try {
                                    if (this.G != null) {
                                        bitmapDrawable.getPaint().setBlendMode(o4.v0.c(this.G));
                                    } else {
                                        bitmapDrawable.getPaint().setBlendMode(null);
                                    }
                                } catch (Exception e11) {
                                    e = e11;
                                    bcVar2 = bcVar;
                                    if (bcVar2 == null) {
                                    }
                                    a8.g(e, true);
                                    canvas.restore();
                                    if (z10) {
                                    }
                                }
                            }
                            bcVar2 = bcVar;
                            try {
                                i(canvas, bitmapDrawable, bcVar2, i3);
                            } catch (Exception e12) {
                                e = e12;
                                if (bcVar2 == null) {
                                    Q(bitmapDrawable);
                                }
                                a8.g(e, true);
                                canvas.restore();
                                if (z10) {
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
                            if (this.g1) {
                                canvas.rotate(i10, f28 / f14, f29 / f14);
                            } else {
                                canvas.rotate(i10, 0.0f, 0.0f);
                            }
                        }
                        rectF.set(f10, f11, f10 + f28, f11 + f29);
                        if (this.q1) {
                            float f35 = -g0.x;
                            rectF.inset(f35, f35);
                        }
                        if (z11) {
                            ((org.telegram.ui.Components.t5) bitmapDrawable).z(f10, f11, f28, f29);
                        }
                        if (bcVar == null) {
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
                        if (this.R0) {
                            if (i13 >= 29) {
                                try {
                                    if (this.G != null) {
                                        bitmapDrawable.getPaint().setBlendMode(o4.v0.c(this.G));
                                    } else {
                                        bitmapDrawable.getPaint().setBlendMode(null);
                                    }
                                } catch (Exception e13) {
                                    Q(bitmapDrawable);
                                    a8.g(e13, true);
                                }
                            }
                            i(canvas, bitmapDrawable, bcVar, i3);
                        }
                        canvas.restore();
                    }
                }
            } else {
                boolean z17 = this.S0;
                float[] fArr = J1;
                Path path2 = this.d1;
                RectF rectF3 = this.b1;
                Matrix matrix = this.c1;
                if (z17) {
                    float max2 = Math.max(f26, f27);
                    float f36 = (int) (intrinsicHeight / max2);
                    float f37 = (int) (i16 / max2);
                    rectF.set(com.google.android.recaptcha.internal.a.z(f13, f36, 2.0f, f10), com.google.android.recaptcha.internal.a.z(f12, f37, 2.0f, f11), k5.a(f13, f36, 2.0f, f10), k5.a(f12, f37, 2.0f, f11));
                    if (this.R0) {
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
                        paint.setAlpha(i3);
                        rectF3.set(rectF);
                        if (!this.Y0 || !this.W0) {
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
                    if (this.M != null) {
                        rectF3.set(0.0f, 0.0f, this.K.getWidth(), this.K.getHeight());
                        this.M.drawBitmap(this.H, (Rect) null, rectF3, (Paint) null);
                        this.M.drawBitmap(bitmapDrawable.getBitmap(), (Rect) null, rectF3, this.N);
                    }
                    if (bitmapShader != this.U || this.I == null) {
                        paint.setShader(bitmapShader);
                    } else {
                        ComposeShader composeShader = this.J;
                        if (composeShader != null) {
                            paint.setShader(composeShader);
                        } else {
                            paint.setShader(this.L);
                        }
                    }
                    float min = 1.0f / Math.min(f26, f27);
                    float f43 = this.P0;
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
                    if (this.R0) {
                        matrix.reset();
                        if (z16) {
                            matrix.setTranslate((rectF.left + this.P0) - (((rectF.width() * 1.2f) - rectF.width()) / 2.0f), (rectF.top + this.P0) - (((rectF.height() * 1.2f) - rectF.height()) / 2.0f));
                        } else {
                            float f47 = rectF.left;
                            float f48 = this.P0;
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
                        if (this.q1) {
                            float f49 = ((g0.x * 2) + f20) / f20;
                            matrix.postScale(f49, f49, rectF.centerX(), rectF.centerY());
                        }
                        BitmapShader bitmapShader2 = this.L;
                        if (bitmapShader2 != null) {
                            bitmapShader2.setLocalMatrix(matrix);
                        }
                        bitmapShader.setLocalMatrix(matrix);
                        if (this.J != null) {
                            int width3 = this.H.getWidth();
                            int height3 = this.H.getHeight();
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
                            float f56 = this.P0;
                            matrix.setTranslate(f55 + f56, rectF.top + f56);
                            matrix.preScale(min2, min2);
                            this.I.setLocalMatrix(matrix);
                        }
                        paint.setAlpha(i3);
                        if (!this.Y0 || !this.W0) {
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
                                } else if (z16) {
                                    RectF rectF4 = g0.P;
                                    rectF4.set(rectF3);
                                    rectF4.inset((-((rectF.width() * 1.2f) - rectF.width())) / 2.0f, (-((rectF.height() * 1.2f) - rectF.height())) / 2.0f);
                                    canvas.drawRect(rectF4, paint);
                                } else {
                                    canvas.drawRect(rectF3, paint);
                                }
                            } catch (Exception e15) {
                                if (bcVar == null) {
                                    Q(bitmapDrawable);
                                }
                                a8.g(e15, true);
                            }
                        }
                    }
                }
            }
            if (z10) {
                ((ch0) drawable).a = false;
                return;
            } else {
                if (drawable instanceof org.telegram.ui.Components.t5) {
                    ((org.telegram.ui.Components.t5) drawable).a = false;
                    return;
                }
                return;
            }
        }
        float f59 = f12;
        float f60 = f13;
        boolean z18 = true;
        ?? r15 = 1;
        ?? r12 = i3;
        if (bcVar == null) {
            if (this.S0) {
                int intrinsicWidth2 = drawable.getIntrinsicWidth();
                int intrinsicHeight2 = drawable.getIntrinsicHeight();
                float f61 = this.P0 * 2.0f;
                float max3 = Math.max(f60 == 0.0f ? 1.0f : intrinsicWidth2 / (f60 - f61), f59 == 0.0f ? 1.0f : intrinsicHeight2 / (f59 - f61));
                float f62 = (int) (intrinsicWidth2 / max3);
                r15 = 1073741824;
                float f63 = (int) (intrinsicHeight2 / max3);
                rectF.set(com.google.android.recaptcha.internal.a.z(f60, f62, 2.0f, f10), com.google.android.recaptcha.internal.a.z(f59, f63, 2.0f, f11), k5.a(f60, f62, 2.0f, f10), k5.a(f59, f63, 2.0f, f11));
            } else {
                rectF.set(f10, f11, f10 + f60, f11 + f59);
            }
            drawable.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            z18 = r15;
        }
        if (!this.R0 || canvas == null) {
            return;
        }
        if (!(drawable instanceof jz)) {
            if (drawable instanceof org.telegram.ui.Components.np) {
                Drawable drawable2 = ((org.telegram.ui.Components.np) drawable).a;
                if (drawable2 instanceof jz) {
                    jzVar2 = (jz) drawable2;
                    jzVar2.k = this;
                }
            }
            jzVar = null;
            if (colorFilter != null && drawable != null) {
                drawable.setColorFilter(colorFilter);
            }
            drawable.setAlpha(i3);
            if (bcVar != null) {
                r12 = 0;
                z18 = true;
                drawable.draw(canvas);
            } else if (jzVar != null) {
                long j10 = bcVar.c;
                if (j10 == 0) {
                    j10 = System.currentTimeMillis();
                }
                r12 = 0;
                z18 = true;
                ((jz) drawable).c(canvas, true, bcVar.d, j10, bcVar.u, bcVar.v, bcVar.t, bcVar.s);
            } else {
                r12 = 0;
                z18 = true;
                drawable.draw(canvas);
            }
            if (jzVar != null) {
                jzVar.k = r12;
                return;
            }
            return;
        }
        jzVar2 = (jz) drawable;
        jzVar2.k = this;
        jzVar = jzVar2;
        if (colorFilter != null) {
            drawable.setColorFilter(colorFilter);
        }
        drawable.setAlpha(i3);
        if (bcVar != null) {
        }
        if (jzVar != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0082  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j0(TLObject tLObject, Drawable drawable, Object obj, boolean z10, int i3, boolean z11) {
        ac acVar;
        BitmapDrawable bitmapDrawable;
        boolean z12;
        boolean z13;
        TLRPC.ChatPhoto chatPhoto;
        ac m10;
        String str;
        BitmapDrawable bitmapDrawable2;
        TLRPC.VideoSize videoSize;
        TLRPC.UserFull b22;
        ArrayList<TLRPC.VideoSize> arrayList;
        TLRPC.UserFull b23;
        Object obj2 = obj == null ? tLObject : obj;
        this.m0 = true;
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
        ac acVar2 = null;
        videoSize2 = null;
        if (tLObject instanceof TLRPC.User) {
            TLRPC.User user = (TLRPC.User) tLObject;
            z12 = user.premium;
            TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
            if (userProfilePhoto != null) {
                bitmapDrawable2 = userProfilePhoto.strippedBitmap;
                z13 = userProfilePhoto.stripped_thumb != null;
                if (i3 == 3 && (b23 = hp.s1(this.d).b2(user.id)) != null) {
                    TLRPC.Photo photo = user.photo.personal ? b23.personal_photo : b23.profile_photo;
                    if (photo != null) {
                        videoSize = w7.S(photo);
                        if (videoSize == null && z10) {
                            hp.s1(this.d);
                            if (hp.B2(user) && user.photo.has_video && lc.e(1024)) {
                                b22 = hp.s1(this.d).b2(user.id);
                                if (b22 != null) {
                                    hp.s1(this.d).W2(user, this.q0, false, null);
                                } else {
                                    TLRPC.Photo photo2 = user.photo.personal ? b22.personal_photo : b22.profile_photo;
                                    if (photo2 != null && (videoSize = w7.S(photo2)) == null && (arrayList = photo2.video_sizes) != null && !arrayList.isEmpty()) {
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
                                        acVar2 = ac.j(x10, photo2);
                                    }
                                }
                            }
                        }
                    }
                }
                videoSize = null;
                if (videoSize == null) {
                    hp.s1(this.d);
                    if (hp.B2(user)) {
                        b22 = hp.s1(this.d).b2(user.id);
                        if (b22 != null) {
                        }
                    }
                }
            } else {
                bitmapDrawable2 = null;
                videoSize = null;
                z13 = false;
            }
            acVar = acVar2;
            bitmapDrawable = bitmapDrawable2;
            videoSize2 = videoSize;
        } else if (!(tLObject instanceof TLRPC.Chat) || (chatPhoto = ((TLRPC.Chat) tLObject).photo) == null) {
            acVar = null;
            bitmapDrawable = null;
            z12 = false;
            z13 = false;
        } else {
            bitmapDrawable = chatPhoto.strippedBitmap;
            z13 = chatPhoto.stripped_thumb != null;
            acVar = null;
            z12 = false;
        }
        if (videoSize2 != null && i3 != 0) {
            w0(new x41(videoSize2, z12, i3));
            return;
        }
        if (z11) {
            m10 = ac.m(this.d, 0, tLObject);
            str = "100_100";
        } else {
            m10 = ac.m(this.d, 1, tLObject);
            str = "50_50";
        }
        String str2 = str;
        ac acVar3 = m10;
        if (acVar != null) {
            u0(acVar, "avatar", acVar3, str2, null, null, bitmapDrawable, 0L, null, obj2, 0);
            this.D1 = 3;
            return;
        }
        Object obj3 = obj2;
        BitmapDrawable bitmapDrawable3 = bitmapDrawable;
        if (bitmapDrawable3 != null) {
            q0(acVar3, str2, bitmapDrawable3, null, obj3, 0);
        } else if (z13) {
            s0(acVar3, str2, ac.m(this.d, 2, tLObject), "50_50_b", drawable, obj3, 0);
        } else {
            q0(acVar3, str2, drawable, null, obj3, 0);
        }
    }

    public final void k(Canvas canvas, Drawable drawable, int i3, BitmapShader bitmapShader, int i10, int i11, bc bcVar) {
        if (this.f1 == 0) {
            float f10 = this.u1;
            if (f10 != 0.0f) {
                float f11 = f10 - 0.10666667f;
                this.u1 = f11;
                if (f11 < 0.0f) {
                    this.u1 = 0.0f;
                }
                invalidate();
            }
        }
        int i12 = this.f1;
        if (i12 != 0) {
            this.u1 = 1.0f;
            this.v1 = i12;
        }
        float f12 = this.u1;
        if (f12 == 0.0f || f12 == 1.0f) {
            j(canvas, drawable, i3, bitmapShader, i10, i11, i12, bcVar);
        } else {
            j(canvas, drawable, i3, bitmapShader, i10, i11, i12, bcVar);
            j(canvas, drawable, (int) (i3 * this.u1), bitmapShader, i10, i11, this.v1, bcVar);
        }
    }

    public final void k0() {
        this.r = false;
    }

    public final org.telegram.ui.Components.g5 l() {
        Drawable drawable = this.k0;
        if (drawable instanceof org.telegram.ui.Components.g5) {
            return (org.telegram.ui.Components.g5) drawable;
        }
        Drawable drawable2 = this.T;
        if (drawable2 instanceof org.telegram.ui.Components.g5) {
            return (org.telegram.ui.Components.g5) drawable2;
        }
        Drawable drawable3 = this.b0;
        if (drawable3 instanceof org.telegram.ui.Components.g5) {
            return (org.telegram.ui.Components.g5) drawable3;
        }
        Drawable drawable4 = this.n0;
        if (drawable4 instanceof org.telegram.ui.Components.g5) {
            return (org.telegram.ui.Components.g5) drawable4;
        }
        return null;
    }

    public final void l0(boolean z10) {
        this.T0 = z10;
    }

    public final org.telegram.ui.Components.t5 m() {
        Drawable drawable = this.k0;
        if (drawable instanceof org.telegram.ui.Components.t5) {
            return (org.telegram.ui.Components.t5) drawable;
        }
        Drawable drawable2 = this.T;
        if (drawable2 instanceof org.telegram.ui.Components.t5) {
            return (org.telegram.ui.Components.t5) drawable2;
        }
        Drawable drawable3 = this.b0;
        if (drawable3 instanceof org.telegram.ui.Components.t5) {
            return (org.telegram.ui.Components.t5) drawable3;
        }
        Drawable drawable4 = this.n0;
        if (drawable4 instanceof org.telegram.ui.Components.t5) {
            return (org.telegram.ui.Components.t5) drawable4;
        }
        return null;
    }

    public final void m0(Bitmap bitmap) {
        if (bitmap != null) {
            if (this.I == null || this.H != bitmap) {
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                this.I = new BitmapShader(bitmap, tileMode, tileMode);
                R0(this.T);
            }
            this.Y0 = true;
        } else {
            this.I = null;
            this.J = null;
            this.L = null;
            this.M = null;
            Bitmap bitmap2 = this.K;
            if (bitmap2 != null) {
                bitmap2.recycle();
                this.K = null;
            }
        }
        this.H = bitmap;
    }

    public final Bitmap n() {
        ch0 B = B();
        if (B != null && B.u()) {
            if (B.R != null) {
                return B.R;
            }
            if (B.S != null) {
                return B.S;
            }
            return null;
        }
        org.telegram.ui.Components.t5 m10 = m();
        if (m10 != null && m10.s()) {
            return m10.m();
        }
        Drawable drawable = this.k0;
        if ((drawable instanceof BitmapDrawable) && !(drawable instanceof org.telegram.ui.Components.t5) && !(drawable instanceof ch0)) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        Drawable drawable2 = this.T;
        if ((drawable2 instanceof BitmapDrawable) && !(drawable2 instanceof org.telegram.ui.Components.t5) && !(drawable instanceof ch0)) {
            return ((BitmapDrawable) drawable2).getBitmap();
        }
        Drawable drawable3 = this.b0;
        if ((drawable3 instanceof BitmapDrawable) && !(drawable3 instanceof org.telegram.ui.Components.t5) && !(drawable instanceof ch0)) {
            return ((BitmapDrawable) drawable3).getBitmap();
        }
        Drawable drawable4 = this.n0;
        if (drawable4 instanceof BitmapDrawable) {
            return ((BitmapDrawable) drawable4).getBitmap();
        }
        return null;
    }

    public final void n0(int i3, long j10, Object obj, String str, String str2, String str3, ac acVar, ac acVar2) {
        r0(acVar, str, acVar2, str2, null, j10, str3, obj, i3);
    }

    public final int o() {
        org.telegram.ui.Components.t5 m10 = m();
        if (m10 != null) {
            int i3 = this.V;
            return (i3 % 360 == 0 || i3 % 360 == 180) ? m10.getIntrinsicHeight() : m10.getIntrinsicWidth();
        }
        ch0 B = B();
        if (B != null) {
            return B.c;
        }
        Bitmap n4 = n();
        if (n4 != null) {
            int i10 = this.V;
            return (i10 % 360 == 0 || i10 % 360 == 180) ? n4.getHeight() : n4.getWidth();
        }
        Drawable drawable = this.n0;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return 1;
    }

    public final void o0(String str, String str2, Drawable drawable, String str3, long j10) {
        r0(ac.g(str), str2, null, null, drawable, j10, str3, null, 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final cc p() {
        Bitmap bitmap;
        String str;
        org.telegram.ui.Components.t5 m10 = m();
        ch0 B = B();
        int i3 = 0;
        if (B != null && B.u()) {
            bitmap = B.R != null ? B.R : B.S != null ? B.S : null;
        } else {
            if (m10 == null || !m10.s()) {
                Drawable drawable = this.k0;
                if (!(drawable instanceof BitmapDrawable) || (drawable instanceof org.telegram.ui.Components.t5) || (drawable instanceof ch0)) {
                    Drawable drawable2 = this.T;
                    if (!(drawable2 instanceof BitmapDrawable) || (drawable2 instanceof org.telegram.ui.Components.t5) || (drawable instanceof ch0)) {
                        Drawable drawable3 = this.b0;
                        if (!(drawable3 instanceof BitmapDrawable) || (drawable3 instanceof org.telegram.ui.Components.t5) || (drawable instanceof ch0)) {
                            Drawable drawable4 = this.n0;
                            if (drawable4 instanceof BitmapDrawable) {
                                bitmap = ((BitmapDrawable) drawable4).getBitmap();
                            } else {
                                bitmap = null;
                                str = null;
                            }
                        } else {
                            bitmap = ((BitmapDrawable) drawable3).getBitmap();
                            str = this.Z;
                        }
                    } else {
                        bitmap = ((BitmapDrawable) drawable2).getBitmap();
                        str = this.R;
                    }
                } else {
                    bitmap = ((BitmapDrawable) drawable).getBitmap();
                    str = this.i0;
                }
                if (bitmap == null) {
                    return new cc(bitmap, str, i3);
                }
                return null;
            }
            Bitmap m11 = m10.m();
            i3 = m10.d[2];
            if (i3 != 0) {
                return new cc(Bitmap.createBitmap(m11), null, i3);
            }
            bitmap = m11;
        }
        str = null;
        if (bitmap == null) {
        }
    }

    public final void p0(ac acVar, String str, Drawable drawable, long j10, String str2, Object obj, int i3) {
        r0(acVar, str, null, null, drawable, j10, str2, obj, i3);
    }

    public final int q() {
        org.telegram.ui.Components.t5 m10 = m();
        if (m10 != null) {
            int i3 = this.V;
            return (i3 % 360 == 0 || i3 % 360 == 180) ? m10.getIntrinsicWidth() : m10.getIntrinsicHeight();
        }
        ch0 B = B();
        if (B != null) {
            return B.b;
        }
        Bitmap n4 = n();
        if (n4 != null) {
            int i10 = this.V;
            return (i10 % 360 == 0 || i10 % 360 == 180) ? n4.getWidth() : n4.getHeight();
        }
        Drawable drawable = this.n0;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return 1;
    }

    public final void q0(ac acVar, String str, Drawable drawable, String str2, Object obj, int i3) {
        r0(acVar, str, null, null, drawable, 0L, str2, obj, i3);
    }

    public final float r() {
        return (this.N0 / 2.0f) + this.L0;
    }

    public final void r0(ac acVar, String str, ac acVar2, String str2, Drawable drawable, long j10, String str3, Object obj, int i3) {
        u0(null, null, acVar, str, acVar2, str2, drawable, j10, str3, obj, i3);
    }

    public final float s() {
        return (this.O0 / 2.0f) + this.M0;
    }

    public final void s0(ac acVar, String str, ac acVar2, String str2, Drawable drawable, Object obj, int i3) {
        u0(null, null, acVar, str, acVar2, str2, drawable, 0L, null, obj, i3);
    }

    public void setAlpha(float f10) {
        this.e1 = f10;
    }

    public final Drawable t() {
        Drawable drawable = this.k0;
        if (drawable != null) {
            return drawable;
        }
        Drawable drawable2 = this.T;
        if (drawable2 != null) {
            return drawable2;
        }
        Drawable drawable3 = this.b0;
        if (drawable3 != null) {
            return drawable3;
        }
        Drawable drawable4 = this.n0;
        if (drawable4 != null) {
            return drawable4;
        }
        return null;
    }

    public final void t0(ac acVar, String str, ac acVar2, String str2, String str3, Object obj, int i3) {
        r0(acVar, str, acVar2, str2, null, 0L, str3, obj, i3);
    }

    public final cc u() {
        String str;
        String str2;
        Drawable drawable = this.k0;
        cc ccVar = null;
        if (!(drawable instanceof BitmapDrawable) || (drawable instanceof org.telegram.ui.Components.t5) || (drawable instanceof ch0)) {
            Drawable drawable2 = this.T;
            if (!(drawable2 instanceof BitmapDrawable) || (drawable2 instanceof org.telegram.ui.Components.t5) || (drawable instanceof ch0)) {
                drawable2 = this.b0;
                if (!(drawable2 instanceof BitmapDrawable) || (drawable2 instanceof org.telegram.ui.Components.t5) || (drawable instanceof ch0)) {
                    drawable = this.n0;
                    if (drawable instanceof BitmapDrawable) {
                        str = null;
                    } else {
                        drawable = null;
                        str = null;
                    }
                } else {
                    str2 = this.Z;
                }
            } else {
                str2 = this.R;
            }
            Drawable drawable3 = drawable2;
            str = str2;
            drawable = drawable3;
        } else {
            str = this.i0;
        }
        if (drawable != null) {
            ccVar = new cc();
            ccVar.d = drawable;
            ccVar.a = str;
            ccVar.e = 0;
            if (str != null) {
                zb.D().H(ccVar.a);
            }
        }
        return ccVar;
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
    public final void u0(ac acVar, String str, ac acVar2, String str2, ac acVar3, String str3, Drawable drawable, long j10, String str4, Object obj, int i3) {
        Paint paint;
        String str5;
        Paint paint2;
        String q10;
        String str6;
        ac acVar4;
        String q11;
        boolean z10;
        Bitmap bitmap;
        ec ecVar;
        boolean z11;
        ec ecVar2;
        String str7;
        gc gcVar;
        ac acVar5;
        ac acVar6;
        ac acVar7;
        ac acVar8 = acVar;
        ac acVar9 = acVar2;
        if (this.A1 && !this.y1) {
            if (this.F == null) {
                this.F = new gc();
            }
            gc gcVar2 = this.F;
            gcVar2.e = acVar8;
            gcVar2.f = str;
            gcVar2.a = acVar9;
            gcVar2.b = str2;
            gcVar2.c = acVar3;
            gcVar2.d = str3;
            gcVar2.g = drawable;
            gcVar2.h = j10;
            gcVar2.k = str4;
            gcVar2.i = i3;
            gcVar2.j = obj;
            return;
        }
        if (this.p0) {
            return;
        }
        if (this.B0 && (gcVar = this.F) != null && (((acVar5 = gcVar.a) != null && (acVar5.v != null || acVar5.g != null)) || (((acVar6 = gcVar.c) != null && (acVar6.v != null || acVar6.g != null)) || ((acVar7 = gcVar.e) != null && (acVar7.v != null || acVar7.g != null))))) {
            Y();
        }
        gc gcVar3 = this.F;
        if (gcVar3 != null) {
            gcVar3.a = null;
            gcVar3.c = null;
            gcVar3.e = null;
            gcVar3.g = null;
        }
        Paint paint3 = this.a1;
        if (acVar9 == null && acVar3 == null && acVar8 == null) {
            for (int i10 = 0; i10 < 4; i10++) {
                S(i10, null);
            }
            this.P = null;
            this.Q = null;
            this.R = null;
            this.g0 = null;
            this.h0 = null;
            this.i0 = null;
            this.X = null;
            this.Y = null;
            this.Z = null;
            this.k0 = null;
            this.l0 = null;
            this.T = null;
            this.U = null;
            this.J = null;
            this.c0 = null;
            this.F0 = null;
            this.L = null;
            this.M = null;
            Bitmap bitmap2 = this.K;
            if (bitmap2 != null) {
                bitmap2.recycle();
                this.K = null;
            }
            this.o0 = str4;
            this.h = null;
            this.s0 = 0;
            paint3.setShader(null);
            N0(drawable);
            this.i1 = 1.0f;
            this.j1 = 1.0f;
            this.r0 = 0L;
            R0(this.n0);
            zb.D().h(this, true);
            invalidate();
            ec ecVar3 = this.h1;
            if (ecVar3 != null) {
                Drawable drawable2 = this.T;
                ecVar3.l0(this, (drawable2 == null && this.b0 == null && this.n0 == null && this.k0 == null) ? false : true, drawable2 == null && this.k0 == null, false);
                return;
            }
            return;
        }
        String q12 = acVar9 != null ? acVar9.q(obj, null, false) : null;
        if (q12 == null && acVar9 != null) {
            acVar9 = null;
        }
        this.D1 = Math.max(this.z0, 0);
        this.J0 = false;
        if (q12 == null && this.G0 && ((obj instanceof zi) || this.I0 != null)) {
            TLRPC.Document document = this.I0;
            if (document == null) {
                document = ((zi) obj).F0();
            }
            if (document != null && document.dc_id != 0) {
                paint = paint3;
                if (document.id != 0) {
                    q12 = "q_" + document.dc_id + "_" + document.id;
                    this.J0 = true;
                }
                str5 = q12;
                if (str5 != null && str2 != null) {
                    str5 = a1.g.C(str5, "@", str2);
                }
                if (this.w1 == null) {
                    paint2 = paint;
                    str5 = a1.g.s(new StringBuilder(), this.w1, str5);
                } else {
                    paint2 = paint;
                }
                q10 = acVar8 == null ? acVar8.q(obj, null, false) : null;
                if (q10 == null && acVar8 != null) {
                    acVar8 = null;
                }
                if (q10 != null && str != null) {
                    q10 = a1.g.C(q10, "@", str);
                }
                if (this.w1 != null) {
                    q10 = a1.g.s(new StringBuilder(), this.w1, q10);
                }
                if ((q10 == null && (str7 = this.R) != null && str7.equals(str5)) || ((str6 = this.i0) != null && str6.equals(q10))) {
                    ecVar2 = this.h1;
                    if (ecVar2 != null) {
                        Drawable drawable3 = this.T;
                        ecVar2.l0(this, (drawable3 == null && this.b0 == null && this.n0 == null && this.k0 == null) ? false : true, drawable3 == null && this.k0 == null, false);
                    }
                    if (!this.n) {
                        return;
                    }
                }
                acVar4 = this.O;
                if (acVar4 == null) {
                    acVar4 = acVar8 != null ? acVar8 : acVar9;
                }
                if (acVar4 == null) {
                    acVar4 = acVar3;
                }
                q11 = acVar3 != null ? acVar3.q(obj, acVar4, false) : null;
                if (q11 != null && str3 != null) {
                    q11 = a1.g.C(q11, "@", str3);
                }
                if (this.B0) {
                    Object obj2 = this.h;
                    if (obj2 instanceof zi) {
                        zi ziVar = (zi) obj2;
                        if (ziVar.c2 != null && (zi.n1(ziVar) instanceof TLRPC.TL_messageMediaGeoLive)) {
                            zi ziVar2 = (zi) this.h;
                            ziVar2.d2 = ziVar2.c2;
                        }
                    }
                    Drawable drawable4 = this.k0;
                    if (drawable4 != null) {
                        if (drawable4 instanceof org.telegram.ui.Components.t5) {
                            ((org.telegram.ui.Components.t5) drawable4).stop();
                            ((org.telegram.ui.Components.t5) this.k0).v(this);
                        }
                        S(1, q11);
                        S(2, null);
                        S(0, q10);
                        this.D0 = this.k0;
                        this.F0 = this.l0;
                        this.E0 = this.R;
                        this.C0 = false;
                        this.k0 = null;
                        this.i0 = null;
                    } else if (this.T != null) {
                        S(1, q11);
                        S(2, null);
                        S(3, q10);
                        this.F0 = this.U;
                        this.D0 = this.T;
                        this.E0 = this.R;
                        this.C0 = false;
                        this.T = null;
                        this.R = null;
                    } else if (this.b0 != null) {
                        S(0, str5);
                        S(2, null);
                        S(3, q10);
                        this.F0 = this.c0;
                        this.D0 = this.b0;
                        this.E0 = this.Z;
                        this.C0 = false;
                        this.b0 = null;
                        this.Z = null;
                    } else if (this.n0 != null) {
                        S(0, str5);
                        S(1, q11);
                        S(2, null);
                        S(3, q10);
                        this.F0 = this.d0;
                        this.D0 = this.n0;
                        this.C0 = false;
                        this.E0 = null;
                        this.b0 = null;
                        this.Z = null;
                    } else {
                        S(0, str5);
                        z10 = true;
                        S(1, q11);
                        S(2, null);
                        S(3, q10);
                        this.F0 = null;
                    }
                    z10 = true;
                } else {
                    z10 = true;
                    S(0, str5);
                    S(1, q11);
                    S(2, null);
                    S(3, q10);
                    this.F0 = null;
                }
                this.P = acVar9;
                this.Q = str2;
                this.R = str5;
                this.g0 = acVar8;
                this.h0 = str;
                this.i0 = q10;
                this.X = acVar3;
                this.Y = str3;
                this.Z = q11;
                this.h = obj;
                this.o0 = str4;
                this.r0 = j10;
                this.s0 = i3;
                N0(drawable);
                this.U = null;
                this.J = null;
                this.c0 = null;
                this.d0 = null;
                this.l0 = null;
                this.L = null;
                this.M = null;
                paint2.setShader(null);
                bitmap = this.K;
                if (bitmap != null) {
                    bitmap.recycle();
                    this.K = null;
                }
                this.i1 = 1.0f;
                this.j1 = 1.0f;
                R0(this.n0);
                ecVar = this.h1;
                if (ecVar != null) {
                    Drawable drawable5 = this.T;
                    z11 = false;
                    ecVar.l0(this, (drawable5 == null && this.b0 == null && this.n0 == null && this.k0 == null) ? false : z10, (drawable5 == null && this.k0 == null) ? z10 : false, false);
                } else {
                    z11 = false;
                }
                zb.D().M(this, this.a);
                invalidate();
                this.q1 = ((obj instanceof zi) || !((zi) obj).i4()) ? z11 : z10;
            }
        }
        paint = paint3;
        str5 = q12;
        if (str5 != null) {
            str5 = a1.g.C(str5, "@", str2);
        }
        if (this.w1 == null) {
        }
        if (acVar8 == null) {
        }
        if (q10 == null) {
            acVar8 = null;
        }
        if (q10 != null) {
            q10 = a1.g.C(q10, "@", str);
        }
        if (this.w1 != null) {
        }
        if (q10 == null) {
            ecVar2 = this.h1;
            if (ecVar2 != null) {
            }
            if (!this.n) {
            }
            acVar4 = this.O;
            if (acVar4 == null) {
            }
            if (acVar4 == null) {
            }
            if (acVar3 != null) {
            }
            if (q11 != null) {
                q11 = a1.g.C(q11, "@", str3);
            }
            if (this.B0) {
            }
            this.P = acVar9;
            this.Q = str2;
            this.R = str5;
            this.g0 = acVar8;
            this.h0 = str;
            this.i0 = q10;
            this.X = acVar3;
            this.Y = str3;
            this.Z = q11;
            this.h = obj;
            this.o0 = str4;
            this.r0 = j10;
            this.s0 = i3;
            N0(drawable);
            this.U = null;
            this.J = null;
            this.c0 = null;
            this.d0 = null;
            this.l0 = null;
            this.L = null;
            this.M = null;
            paint2.setShader(null);
            bitmap = this.K;
            if (bitmap != null) {
            }
            this.i1 = 1.0f;
            this.j1 = 1.0f;
            R0(this.n0);
            ecVar = this.h1;
            if (ecVar != null) {
            }
            zb.D().M(this, this.a);
            invalidate();
            this.q1 = ((obj instanceof zi) || !((zi) obj).i4()) ? z11 : z10;
        }
        ecVar2 = this.h1;
        if (ecVar2 != null) {
        }
        if (!this.n) {
        }
        acVar4 = this.O;
        if (acVar4 == null) {
        }
        if (acVar4 == null) {
        }
        if (acVar3 != null) {
        }
        if (q11 != null) {
        }
        if (this.B0) {
        }
        this.P = acVar9;
        this.Q = str2;
        this.R = str5;
        this.g0 = acVar8;
        this.h0 = str;
        this.i0 = q10;
        this.X = acVar3;
        this.Y = str3;
        this.Z = q11;
        this.h = obj;
        this.o0 = str4;
        this.r0 = j10;
        this.s0 = i3;
        N0(drawable);
        this.U = null;
        this.J = null;
        this.c0 = null;
        this.d0 = null;
        this.l0 = null;
        this.L = null;
        this.M = null;
        paint2.setShader(null);
        bitmap = this.K;
        if (bitmap != null) {
        }
        this.i1 = 1.0f;
        this.j1 = 1.0f;
        R0(this.n0);
        ecVar = this.h1;
        if (ecVar != null) {
        }
        zb.D().M(this, this.a);
        invalidate();
        this.q1 = ((obj instanceof zi) || !((zi) obj).i4()) ? z11 : z10;
    }

    public final float v() {
        return this.O0;
    }

    public final void v0(Bitmap bitmap) {
        w0(bitmap != null ? new BitmapDrawable((Resources) null, bitmap) : null);
    }

    public final float w() {
        return this.N0;
    }

    public final void w0(Drawable drawable) {
        boolean z10 = true;
        zb.D().h(this, true);
        if (!this.B0) {
            for (int i3 = 0; i3 < 4; i3++) {
                S(i3, null);
            }
        } else if (this.T != null) {
            S(1, null);
            S(2, null);
            S(3, null);
            this.F0 = this.U;
            this.D0 = this.T;
            this.E0 = this.R;
            this.C0 = true;
        } else if (this.b0 != null) {
            S(0, null);
            S(2, null);
            S(3, null);
            this.F0 = this.c0;
            this.D0 = this.b0;
            this.E0 = this.Z;
            this.C0 = true;
        } else if (this.n0 != null) {
            S(0, null);
            S(1, null);
            S(2, null);
            S(3, null);
            this.F0 = this.d0;
            this.D0 = this.n0;
            this.C0 = true;
            this.E0 = null;
        } else {
            for (int i10 = 0; i10 < 4; i10++) {
                S(i10, null);
            }
            this.F0 = null;
        }
        Drawable drawable2 = this.n0;
        if (drawable2 instanceof oi0) {
            eb0 eb0Var = (eb0) ((oi0) drawable2);
            z5.q(eb0Var.r.I1).v(eb0Var);
            eb0Var.n = null;
            eb0Var.r = null;
        }
        if (drawable instanceof org.telegram.ui.Components.g5) {
            org.telegram.ui.Components.g5 g5Var = (org.telegram.ui.Components.g5) drawable;
            if (this.y1) {
                g5Var.b(this);
            }
        } else if (drawable instanceof org.telegram.ui.Components.t5) {
            org.telegram.ui.Components.t5 t5Var = (org.telegram.ui.Components.t5) drawable;
            View view = this.e;
            if (t5Var.s0 == null) {
                t5Var.s0 = new WeakReference(view);
            }
            if (this.y1) {
                t5Var.e(this);
            }
            boolean z11 = this.w0 || t5Var.o0;
            if (!t5Var.o0) {
                t5Var.w0 = z11;
            }
            if (this.u0 && this.E == 0) {
                t5Var.j();
            }
            boolean z12 = this.x0;
            t5Var.E = z12;
            if (z12) {
                t5Var.x(false);
            }
        } else if (drawable instanceof ch0) {
            ch0 ch0Var = (ch0) drawable;
            if (this.y1) {
                ch0Var.J0.add(this);
            }
            ch0Var.F = this.t0;
            if (this.v0 && (!ch0Var.z() || this.E == 0)) {
                ch0Var.start();
            }
            ch0Var.J(true);
        }
        this.d0 = null;
        this.c0 = null;
        this.a1.setShader(null);
        N0(drawable);
        R0(drawable);
        this.g0 = null;
        this.h0 = null;
        Drawable drawable3 = this.k0;
        if (drawable3 instanceof org.telegram.ui.Components.t5) {
            ((org.telegram.ui.Components.t5) drawable3).v(this);
        }
        this.k0 = null;
        this.i0 = null;
        this.l0 = null;
        this.P = null;
        this.Q = null;
        this.T = null;
        this.R = null;
        this.U = null;
        this.J = null;
        this.L = null;
        this.M = null;
        Bitmap bitmap = this.K;
        if (bitmap != null) {
            bitmap.recycle();
            this.K = null;
        }
        this.X = null;
        this.Y = null;
        this.Z = null;
        this.J0 = false;
        this.o0 = null;
        this.r0 = 0L;
        this.s0 = 0;
        this.i1 = 1.0f;
        this.j1 = 1.0f;
        gc gcVar = this.F;
        if (gcVar != null) {
            gcVar.a = null;
            gcVar.c = null;
            gcVar.e = null;
            gcVar.g = null;
        }
        ec ecVar = this.h1;
        if (ecVar != null) {
            ecVar.l0(this, (this.b0 == null && this.n0 == null) ? false : true, true, false);
        }
        invalidate();
        if (this.V0 && this.B0 && this.D0 != null) {
            this.i1 = 0.0f;
            this.k1 = System.currentTimeMillis();
            if (this.b0 == null && this.n0 == null) {
                z10 = false;
            }
            this.n1 = z10;
        }
    }

    public final float x() {
        return this.L0;
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
    public boolean x0(Drawable drawable, String str, int i3, boolean z10, int i10) {
        org.telegram.ui.Components.t5 m10;
        Drawable drawable2;
        Drawable drawable3;
        Drawable drawable4;
        boolean z11;
        ec ecVar;
        boolean z12;
        if (drawable != null && str != null && this.q0 == i10) {
            if (i3 == 0) {
                if (str.equals(this.R)) {
                    ec ecVar2 = this.h1;
                    if (ecVar2 != null) {
                        ecVar2.F0(i3, drawable);
                    }
                    if (drawable instanceof org.telegram.ui.Components.t5) {
                        org.telegram.ui.Components.t5 t5Var = (org.telegram.ui.Components.t5) drawable;
                        t5Var.C(this.r1, this.s1);
                        if (t5Var.o0) {
                            zb.D().H(this.R);
                        }
                        if (this.z1) {
                            z12 = !t5Var.s();
                            this.T = drawable;
                            if (drawable instanceof o6) {
                            }
                            R0(drawable);
                            if (z12) {
                            }
                            this.i1 = 1.0f;
                            this.j1 = 1.0f;
                            ecVar = this.h1;
                            if (ecVar != null) {
                            }
                            if (!(drawable instanceof org.telegram.ui.Components.g5)) {
                            }
                            invalidate();
                            return true;
                        }
                        z12 = true;
                        this.T = drawable;
                        if (drawable instanceof o6) {
                        }
                        R0(drawable);
                        if (z12) {
                        }
                        this.i1 = 1.0f;
                        this.j1 = 1.0f;
                        ecVar = this.h1;
                        if (ecVar != null) {
                        }
                        if (!(drawable instanceof org.telegram.ui.Components.g5)) {
                        }
                        invalidate();
                        return true;
                    }
                    zb.D().H(this.R);
                    if (this.z1 && (drawable == this.T || this.i1 < 1.0f)) {
                        z12 = false;
                        this.T = drawable;
                        if (drawable instanceof o6) {
                            o6 o6Var = (o6) drawable;
                            this.V = o6Var.b;
                            this.W = o6Var.a;
                        }
                        R0(drawable);
                        if (z12 || !this.R0 || (((z10 || this.T0) && !this.V0) || this.t1 == 0)) {
                            this.i1 = 1.0f;
                            this.j1 = 1.0f;
                        } else {
                            Drawable drawable5 = this.k0;
                            if (!(drawable5 instanceof ch0) || !((ch0) drawable5).u()) {
                                Drawable drawable6 = this.k0;
                                if (!(drawable6 instanceof org.telegram.ui.Components.t5) || !((org.telegram.ui.Components.t5) drawable6).s()) {
                                    if (this.T instanceof ch0) {
                                        Drawable drawable7 = this.n0;
                                        if (!(drawable7 instanceof y70)) {
                                            if (!(drawable7 instanceof jz)) {
                                            }
                                        }
                                    }
                                    Drawable drawable8 = this.b0;
                                    if (drawable8 != null || this.n0 != null || this.V0) {
                                        if (drawable8 == null || this.n0 == null) {
                                            this.j1 = 1.0f;
                                        } else {
                                            this.j1 = this.i1;
                                        }
                                        this.i1 = 0.0f;
                                        this.k1 = System.currentTimeMillis();
                                        this.n1 = (this.D0 == null && this.b0 == null && this.n0 == null) ? false : true;
                                    }
                                }
                            }
                        }
                        ecVar = this.h1;
                        if (ecVar != null) {
                            Drawable drawable9 = this.T;
                            ecVar.l0(this, (drawable9 == null && this.b0 == null && this.n0 == null && this.k0 == null) ? false : true, drawable9 == null && this.k0 == null, z10);
                        }
                        if (!(drawable instanceof org.telegram.ui.Components.g5)) {
                            org.telegram.ui.Components.g5 g5Var = (org.telegram.ui.Components.g5) drawable;
                            if (this.y1) {
                                g5Var.b(this);
                            }
                        } else if (drawable instanceof org.telegram.ui.Components.t5) {
                            org.telegram.ui.Components.t5 t5Var2 = (org.telegram.ui.Components.t5) drawable;
                            boolean z13 = this.w0;
                            if (!t5Var2.o0) {
                                t5Var2.w0 = z13;
                            }
                            if (this.y1) {
                                t5Var2.e(this);
                            }
                            if (this.u0 && this.E == 0) {
                                t5Var2.j();
                            }
                            boolean z14 = this.x0;
                            t5Var2.E = z14;
                            if (z14) {
                                t5Var2.x(false);
                            }
                            this.A0 = false;
                            View view = this.e;
                            if (view != null) {
                                view.invalidate();
                            }
                        } else if (drawable instanceof ch0) {
                            ch0 ch0Var = (ch0) drawable;
                            if (this.y1) {
                                ch0Var.J0.add(this);
                            }
                            if (this.v0 && (!ch0Var.z() || this.E == 0)) {
                                ch0Var.start();
                            }
                            ch0Var.J(true);
                            ch0Var.K(this.y0);
                            ch0Var.M = this.z0;
                            ch0Var.F0 = this.b;
                            this.A0 = false;
                        }
                        invalidate();
                        return true;
                    }
                    z12 = true;
                    this.T = drawable;
                    if (drawable instanceof o6) {
                    }
                    R0(drawable);
                    if (z12) {
                    }
                    this.i1 = 1.0f;
                    this.j1 = 1.0f;
                    ecVar = this.h1;
                    if (ecVar != null) {
                    }
                    if (!(drawable instanceof org.telegram.ui.Components.g5)) {
                    }
                    invalidate();
                    return true;
                }
            } else {
                if (i3 != 3) {
                    if (i3 == 1) {
                        if (this.b0 == null && ((this.T0 || (((m10 = m()) == null || !m10.s()) && (((drawable2 = this.T) == null || (drawable2 instanceof org.telegram.ui.Components.t5)) && ((drawable3 = this.k0) == null || (drawable3 instanceof org.telegram.ui.Components.t5))))) && str.equals(this.Z))) {
                            ec ecVar3 = this.h1;
                            if (ecVar3 != null) {
                                ecVar3.F0(i3, drawable);
                            }
                            zb.D().H(this.Z);
                            this.b0 = drawable;
                            if (drawable instanceof o6) {
                                o6 o6Var2 = (o6) drawable;
                                this.e0 = o6Var2.b;
                                this.f0 = o6Var2.a;
                            }
                            R0(drawable);
                            if (z10 || this.l1 == 2) {
                                this.i1 = 1.0f;
                                this.j1 = 1.0f;
                            } else {
                                Object obj = this.h;
                                if ((obj instanceof zi) && ((zi) obj).i4() && ((zi) this.h).p4()) {
                                    this.i1 = 1.0f;
                                    this.j1 = 1.0f;
                                } else {
                                    this.i1 = 0.0f;
                                    this.j1 = 1.0f;
                                    this.k1 = System.currentTimeMillis();
                                    this.n1 = this.n0 != null;
                                }
                            }
                        }
                    }
                    ecVar = this.h1;
                    if (ecVar != null) {
                    }
                    if (!(drawable instanceof org.telegram.ui.Components.g5)) {
                    }
                    invalidate();
                    return true;
                }
                if (str.equals(this.i0)) {
                    ec ecVar4 = this.h1;
                    if (ecVar4 != null) {
                        ecVar4.F0(i3, drawable);
                    }
                    if (drawable instanceof org.telegram.ui.Components.t5) {
                        org.telegram.ui.Components.t5 t5Var3 = (org.telegram.ui.Components.t5) drawable;
                        t5Var3.C(this.r1, this.s1);
                        if (t5Var3.o0) {
                            zb.D().H(this.i0);
                        }
                        if (this.z1 && (((z11 = (drawable4 = this.b0) instanceof org.telegram.ui.Components.t5)) || (this.T instanceof org.telegram.ui.Components.t5))) {
                            t5Var3.y(z11 ? ((org.telegram.ui.Components.t5) drawable4).c : 0L, true, true);
                        }
                    } else {
                        zb.D().H(this.i0);
                    }
                    this.k0 = drawable;
                    R0(drawable);
                    if (this.T == null) {
                        if ((z10 || this.T0) && !this.V0) {
                            this.i1 = 1.0f;
                            this.j1 = 1.0f;
                        } else {
                            Drawable drawable10 = this.b0;
                            if ((drawable10 == null && this.n0 == null) || this.i1 == 1.0f || this.V0) {
                                if (drawable10 == null || this.n0 == null) {
                                    this.j1 = 1.0f;
                                } else {
                                    this.j1 = this.i1;
                                }
                                this.i1 = 0.0f;
                                this.k1 = System.currentTimeMillis();
                                this.n1 = (this.D0 == null && this.b0 == null && this.n0 == null) ? false : true;
                            }
                        }
                    }
                    ecVar = this.h1;
                    if (ecVar != null) {
                    }
                    if (!(drawable instanceof org.telegram.ui.Components.g5)) {
                    }
                    invalidate();
                    return true;
                }
            }
        }
        return false;
    }

    public final float y() {
        return this.L0 + this.N0;
    }

    public final void y0(float f10, float f11, float f12, float f13) {
        this.L0 = f10;
        this.M0 = f11;
        this.N0 = f12;
        this.O0 = f13;
    }

    public final float z() {
        return this.M0;
    }

    public final void z0(Rect rect) {
        if (rect != null) {
            this.L0 = rect.left;
            this.M0 = rect.top;
            this.N0 = rect.width();
            this.O0 = rect.height();
        }
    }
}
