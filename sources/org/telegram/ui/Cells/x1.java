package org.telegram.ui.Cells;

import android.graphics.Rect;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.messenger.cd;
import org.telegram.messenger.gj;
import org.telegram.messenger.hj;
import org.telegram.messenger.jj;
import org.telegram.messenger.vv;
import org.telegram.ui.Components.wy;
import org.telegram.ui.zh0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class x1 {
    public boolean A;
    public boolean A1;
    public float A2;
    public boolean B;
    public int[] B0;
    public int B1;
    public float B2;
    public boolean C;
    public boolean C0;
    public boolean C1;
    public int C2;
    public float D;
    public boolean D0;
    public boolean D1;
    public int D2;
    public float E;
    public boolean E1;
    public boolean E2;
    public int F;
    public boolean F0;
    public boolean F1;
    public StaticLayout F2;
    public boolean G;
    public boolean G0;
    public boolean G1;
    public boolean G2;
    public StaticLayout H;
    public boolean H0;
    public int H1;
    public int H2;
    public StaticLayout I;
    public ArrayList I0;
    public int I1;
    public int I2;
    public float J;
    public ArrayList J0;
    public boolean J1;
    public int J2;
    public float K;
    public int K0;
    public boolean K1;
    public float K2;
    public float L;
    public boolean L0;
    public boolean L2;
    public float M;
    public vv M0;
    public boolean M2;
    public int N;
    public vv N0;
    public boolean N2;
    public int O;
    public float O0;
    public boolean O1;
    public boolean O2;
    public int P;
    public org.telegram.ui.Components.k5 P0;
    public int P1;
    public boolean P2;
    public int Q;
    public float Q0;
    public int Q1;
    public boolean Q2;
    public boolean R;
    public float R0;
    public boolean R2;
    public float S;
    public StaticLayout S0;
    public boolean S2;
    public boolean T;
    public org.telegram.ui.Components.k5 T0;
    public float T1;
    public int T2;
    public StaticLayout U;
    public boolean U0;
    public float U1;
    public int U2;
    public boolean V;
    public StaticLayout V0;
    public float V1;
    public boolean V2;
    public StaticLayout W;
    public StaticLayout W0;
    public float W1;
    public int W2;
    public float X;
    public int X0;
    public boolean X1;
    public int X2;
    public int Y;
    public int Y0;
    public int Y1;
    public boolean Y2;
    public int Z;
    public int Z0;
    public int Z1;
    public boolean Z2;
    public final q1 a;
    public int a0;
    public boolean a1;
    public boolean a2;
    public boolean a3;
    public float b;
    public boolean b0;
    public boolean b1;
    public boolean b3;
    public float c;
    public boolean c0;
    public hj c1;
    public int c2;
    public boolean c3;
    public float d;
    public boolean d0;
    public hj d1;
    public StaticLayout d2;
    public HashSet d3;
    public float e;
    public float e0;
    public boolean e1;
    public StaticLayout e2;
    public HashSet e3;
    public float f;
    public String f0;
    public boolean f1;
    public boolean f2;
    public boolean f3;
    public float g;
    public boolean g0;
    public int g1;
    public boolean g2;
    public boolean g3;
    public boolean h;
    public float h0;
    public int h1;
    public boolean h2;
    public boolean h3;
    public boolean i;
    public float i0;
    public boolean i1;
    public boolean i2;
    public boolean i3;
    public boolean j;
    public float j0;
    public int j1;
    public StaticLayout j2;
    public boolean j3;
    public boolean k;
    public float k0;
    public int k1;
    public boolean k2;
    public StaticLayout k3;
    public String l;
    public float l0;
    public boolean l1;
    public boolean l2;
    public StaticLayout l3;
    public float m;
    public float m0;
    public boolean m1;
    public boolean m2;
    public org.telegram.ui.Components.k5 m3;
    public StaticLayout n;
    public float n0;
    public boolean n1;
    public float n2;
    public StaticLayout o;
    public float o0;
    public boolean o1;
    public float o2;
    public boolean p;
    public float p0;
    public float p1;
    public float p2;
    public boolean q;
    public float q0;
    public float q1;
    public int q2;
    public float r;
    public float r0;
    public float r1;
    public int r2;
    public float s;
    public float s0;
    public float s1;
    public boolean s2;
    public float t;
    public boolean t0;
    public boolean t1;
    public int t2;
    public float u;
    public int u1;
    public boolean u2;
    public boolean v;
    public boolean v1;
    public int v2;
    public int w;
    public boolean w0;
    public boolean w1;
    public int w2;
    public int x;
    public boolean x0;
    public boolean x1;
    public boolean x2;
    public int y;
    public boolean y0;
    public int y1;
    public boolean z;
    public boolean z0;
    public boolean z1;
    public final int[] u0 = new int[4];
    public float v0 = 1.0f;
    public float A0 = 1.0f;
    public final Rect E0 = new Rect();
    public float L1 = 1.0f;
    public final ArrayList M1 = new ArrayList();
    public final ArrayList N1 = new ArrayList();
    public float R1 = 0.0f;
    public float S1 = 1.0f;
    public int b2 = -1;
    public final StaticLayout[] y2 = new StaticLayout[2];
    public final StaticLayout[] z2 = new StaticLayout[2];

    public x1(q1 q1Var) {
        this.a = q1Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:422:0x0375, code lost:
    
        if (r10 == (r11 == null ? 0 : r11.c)) goto L198;
     */
    /* JADX WARN: Removed duplicated region for block: B:243:0x059b  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x05a3  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x05ab  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x05b7  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x05c2  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x05cd  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x05d8  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x05de  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x05f8  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x0603  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x060c  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0615  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x063c  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x0649  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x0652  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x0659  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x0691  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x069a  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x06c3  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x06d8  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x06e3  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x0683  */
    /* JADX WARN: Removed duplicated region for block: B:339:0x061f  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x0627  */
    /* JADX WARN: Removed duplicated region for block: B:347:0x0629  */
    /* JADX WARN: Removed duplicated region for block: B:348:0x0621  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x05db  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0106  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a() {
        boolean z10;
        boolean z11;
        float f7;
        int i10;
        int i11;
        int i12;
        s1 s1Var;
        HashSet hashSet;
        HashSet hashSet2;
        boolean z12;
        boolean z13;
        jj jjVar;
        int i13;
        jj jjVar2;
        StaticLayout staticLayout;
        l0 l0Var;
        vv vvVar;
        org.telegram.ui.Components.m5 m5Var;
        boolean z14 = false;
        if (!this.w0) {
            return false;
        }
        this.w1 = false;
        this.G0 = false;
        boolean z15 = this.F0;
        q1 q1Var = this.a;
        boolean z16 = q1Var.W6;
        sg.p0 p0Var = q1Var.N;
        ArrayList arrayList = q1Var.G5;
        if (z15 != z16) {
            this.G0 = true;
            z10 = true;
        } else {
            z10 = false;
        }
        this.H0 = false;
        jj jjVar3 = q1Var.O5;
        ArrayList arrayList2 = jjVar3.z2;
        ArrayList arrayList3 = this.J0;
        if (arrayList2 != arrayList3) {
            boolean z17 = jjVar3.t2 == this.K0 || z15 == z16;
            if (arrayList2 != null && arrayList3 != null && arrayList2.size() == this.J0.size()) {
                for (int i14 = 0; i14 < this.J0.size(); i14++) {
                    String charSequence = ((gj) q1Var.O5.z2.get(i14)).e == null ? null : ((gj) q1Var.O5.z2.get(i14)).e.getText().toString();
                    String charSequence2 = ((gj) this.J0.get(i14)).e == null ? null : ((gj) this.J0.get(i14)).e.getText().toString();
                    if ((charSequence != null || charSequence2 == null) && ((charSequence == null || charSequence2 != null) && charSequence.equals(charSequence2))) {
                        org.telegram.ui.Components.k5 k5Var = q1Var.ya;
                        if (k5Var != null) {
                            StaticLayout staticLayout2 = ((gj) q1Var.O5.z2.get(i14)).e;
                            StaticLayout staticLayout3 = ((gj) this.J0.get(i14)).e;
                            HashMap hashMap = k5Var.b;
                            if (staticLayout3 != null && (m5Var = (org.telegram.ui.Components.m5) hashMap.remove(staticLayout3)) != null) {
                                ArrayList arrayList4 = m5Var.b;
                                m5Var.a = staticLayout2;
                                for (int i15 = 0; i15 < arrayList4.size(); i15++) {
                                    ((org.telegram.ui.Components.j5) arrayList4.get(i15)).c = staticLayout2;
                                }
                                hashMap.put(staticLayout2, m5Var);
                            }
                        }
                    }
                }
                if (z17) {
                    this.H0 = true;
                    ArrayList arrayList5 = this.J0;
                    this.I0 = arrayList5;
                    this.O0 = this.p2;
                    this.P0 = org.telegram.ui.Components.o5.update(0, (View) q1Var, this.P0, (ArrayList<gj>) arrayList5, true);
                    q1Var.ya = org.telegram.ui.Components.o5.update(0, q1Var, q1Var.ya, (ArrayList<gj>) q1Var.O5.z2);
                    z10 = true;
                } else {
                    q1Var.ya = org.telegram.ui.Components.o5.update(0, q1Var, q1Var.ya, (ArrayList<gj>) q1Var.O5.z2);
                }
            }
            z17 = false;
            if (z17) {
            }
        }
        vv vvVar2 = q1Var.O5.w2;
        if (vvVar2 != null && (vvVar2.s || vvVar2.u)) {
            this.w1 = true;
            z10 = true;
        }
        this.L0 = false;
        if (vvVar2 != this.N0) {
            zh0 zh0Var = q1Var.xc;
            boolean z18 = zh0Var != null && zh0Var.h;
            vv vvVar3 = this.M0;
            if (vvVar3 != null) {
                vvVar3.f(q1Var);
                this.M0 = null;
            }
            if (z18) {
                vv vvVar4 = q1Var.O5.w2;
                if (vvVar4 != null && (vvVar = this.N0) != null) {
                    vvVar4.J(vvVar);
                }
            } else {
                this.L0 = true;
                vv vvVar5 = this.N0;
                this.M0 = vvVar5;
                if (vvVar5 != null) {
                    vvVar5.b(q1Var);
                }
            }
        }
        this.P2 = false;
        if (q1Var.i9 != this.N2) {
            this.P2 = true;
            z10 = true;
        }
        this.Q2 = false;
        if (q1Var.j9 != this.O2) {
            this.Q2 = true;
            z10 = true;
        }
        StaticLayout staticLayout4 = q1Var.P7;
        if (staticLayout4 != this.F2) {
            CharSequence text = staticLayout4 != null ? staticLayout4.getText() : null;
            StaticLayout staticLayout5 = this.F2;
            if (!TextUtils.equals(text, staticLayout5 != null ? staticLayout5.getText() : null)) {
                this.R0 = this.Q0;
                StaticLayout staticLayout6 = this.F2;
                this.S0 = staticLayout6;
                this.K2 = this.J2;
                this.T0 = org.telegram.ui.Components.o5.update(0, (View) this.a, false, this.T0, true, staticLayout6);
                z10 = true;
            }
        }
        boolean z19 = q1Var.hb;
        if (z19 && !this.a1 && q1Var.x9 != null) {
            String L0 = cd.L0(2131751211, "EditedMessage");
            CharSequence text2 = q1Var.x9.getText();
            int indexOf = text2.toString().indexOf(L0);
            if (indexOf >= 0) {
                if (indexOf == 0) {
                    TextPaint textPaint = org.telegram.ui.ActionBar.t6.T2;
                    int L = org.telegram.messenger.i0.L(100.0f) + q1Var.z9;
                    Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
                    this.V0 = new StaticLayout(L0, textPaint, L, alignment, 1.0f, 0.0f, false);
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) L0);
                    spannableStringBuilder.append(text2.subSequence(L0.length(), text2.length()));
                    spannableStringBuilder.setSpan(new wy(z14), 0, L0.length(), 0);
                    this.W0 = new StaticLayout(spannableStringBuilder, org.telegram.ui.ActionBar.t6.T2, org.telegram.messenger.i0.L(100.0f) + q1Var.z9, alignment, 1.0f, 0.0f, false);
                    this.Z0 = q1Var.y9 - this.Y0;
                } else {
                    this.Z0 = 0;
                    this.V0 = null;
                    this.W0 = this.j2;
                }
                this.U0 = true;
                this.X0 = this.Y0;
                this.h1 = this.g1;
                this.i1 = true;
                z10 = true;
            }
            q1Var.N2 = null;
        } else if (!z19 && this.a1 && q1Var.x9 != null) {
            this.W0 = this.j2;
            int i16 = q1Var.y9;
            int i17 = this.Y0;
            this.Z0 = i16 - i17;
            this.U0 = true;
            this.X0 = i17;
            this.h1 = this.g1;
            this.i1 = true;
            z10 = true;
        }
        this.m1 = false;
        if (q1Var.G6 != this.l1) {
            this.m1 = true;
            z10 = true;
        }
        this.t1 = false;
        if (q1Var.v1 != this.v) {
            this.t1 = true;
            float f10 = this.d;
            this.p1 = f10;
            float f11 = this.e;
            this.q1 = f11;
            this.r1 = (f10 / 2.0f) + this.b;
            this.s1 = (f11 / 2.0f) + this.c;
            z10 = true;
        }
        this.v1 = false;
        int i18 = q1Var.f0;
        int i19 = this.w;
        if (i18 != i19) {
            this.w1 = true;
            this.u1 = i19;
            this.v1 = true;
            z10 = true;
        }
        this.z1 = false;
        int i20 = q1Var.V;
        int i21 = this.x;
        if (i20 != i21) {
            this.y1 = i21;
            this.z1 = true;
            z10 = true;
        }
        this.x1 = false;
        if ((q1Var.S != null) != this.z) {
            this.x1 = true;
            z10 = true;
        }
        this.C1 = false;
        int i22 = q1Var.d0;
        int i23 = this.y;
        if (i22 != i23) {
            this.B1 = i23;
            this.C1 = true;
            z10 = true;
        }
        this.A1 = false;
        if ((q1Var.a0 != null) != this.A) {
            this.A1 = true;
            z10 = true;
        }
        this.M2 = false;
        if ((q1Var.O5.D == 27 && (l0Var = q1Var.w) != null && l0Var.d()) != this.L2) {
            this.M2 = true;
            z10 = true;
        }
        this.E1 = false;
        if (q1Var.t1 != this.D1) {
            this.E1 = true;
            z10 = true;
        }
        this.G1 = false;
        if (q1Var.u1 != this.F1) {
            this.G1 = true;
            z10 = true;
        }
        this.J1 = false;
        if (q1Var.P1) {
            int i24 = q1Var.U1;
            int i25 = this.H1;
            if (i24 != i25) {
                this.J1 = true;
                this.I1 = i25;
                z10 = true;
            }
        }
        this.o1 = false;
        if (q1Var.G4 != this.n1) {
            this.o1 = true;
            z10 = true;
        }
        jj jjVar4 = q1Var.O5;
        boolean z20 = jjVar4 != null ? jjVar4.K2 : false;
        hj hjVar = q1Var.k3;
        hj hjVar2 = this.d1;
        if (hjVar != hjVar2) {
            String charSequence3 = hjVar2 == null ? null : hjVar2.a.toString();
            hj hjVar3 = q1Var.k3;
            String charSequence4 = hjVar3 == null ? null : hjVar3.a.toString();
            if (this.F0 != q1Var.W6 || this.e1 != z20) {
                hj hjVar4 = q1Var.k3;
                int i26 = hjVar4 == null ? 0 : hjVar4.c;
                hj hjVar5 = this.d1;
            }
            if ((charSequence4 == null) == (charSequence3 == null) && (charSequence3 == null || charSequence3.equals(charSequence4))) {
                q1Var.L3();
                float f12 = this.f;
                if (f12 != q1Var.q3 || this.g != q1Var.r3) {
                    this.t0 = true;
                    this.r0 = f12;
                    this.s0 = this.g;
                    z10 = true;
                }
            }
            this.b1 = true;
            hj hjVar6 = this.d1;
            this.c1 = hjVar6;
            this.P0 = org.telegram.ui.Components.o5.update(0, q1Var, (org.telegram.ui.Components.k5) null, (ArrayList<gj>) (hjVar6 == null ? null : hjVar6.e));
            org.telegram.ui.Components.k5 k5Var2 = q1Var.ya;
            hj hjVar7 = q1Var.k3;
            q1Var.ya = org.telegram.ui.Components.o5.update(0, q1Var, k5Var2, (ArrayList<gj>) (hjVar7 == null ? null : hjVar7.e));
            if (this.F0 != q1Var.W6 || this.e1 != z20) {
                this.t0 = true;
                this.r0 = this.f;
                this.s0 = this.g;
            }
            z10 = true;
        } else if (hjVar != null && hjVar2 != null) {
            q1Var.L3();
            float f13 = this.f;
            if (f13 != q1Var.q3 || this.g != q1Var.r3) {
                this.t0 = true;
                this.r0 = f13;
                this.s0 = this.g;
                z10 = true;
            }
        }
        ArrayList arrayList6 = this.M1;
        if (!arrayList6.isEmpty() || !arrayList.isEmpty()) {
            if (arrayList6.size() != arrayList.size()) {
                this.E2 = true;
            }
            if (!this.E2) {
                for (int i27 = 0; i27 < arrayList.size(); i27++) {
                    c0 c0Var = (c0) arrayList.get(i27);
                    c0 c0Var2 = (c0) arrayList6.get(i27);
                    if (!c0Var.b && !c0Var2.b && (Math.abs(c0Var.c - c0Var2.c) > 0.01f || Math.abs(c0Var.e - c0Var2.e) > 0.01f || !TextUtils.equals(c0Var.h.j(), c0Var2.h.j()))) {
                        this.E2 = true;
                        break;
                    }
                }
            }
            if (this.E2) {
                this.N1.addAll(arrayList6);
            }
        }
        int i28 = this.Q1;
        if (i28 != q1Var.I5) {
            this.P1 = i28;
            this.O1 = true;
        }
        int i29 = q1Var.K1;
        if (i29 == 5 || i29 == 3 || i29 == 1) {
            float f14 = q1Var.I3;
            float f15 = this.T1;
            if (f14 != f15 || q1Var.J3 != this.U1) {
                this.V1 = f15;
                this.W1 = this.U1;
                this.X1 = true;
                z10 = true;
            }
        }
        int i30 = q1Var.V1;
        int i31 = this.Y1;
        if (i30 != i31) {
            this.Z1 = i31;
            this.a2 = true;
            z10 = true;
        }
        if (this.B != q1Var.o6) {
            this.C = true;
            q1Var.N2 = null;
            z11 = true;
            z10 = true;
        } else {
            z11 = false;
        }
        if ((this.H != null || q1Var.ea != null) && this.F != q1Var.getRepliesCount()) {
            this.I = this.H;
            this.G = true;
            q1Var.N2 = null;
            z11 = true;
            z10 = true;
        }
        if (this.d2 != null && this.c2 != q1Var.getMessageObject().k.views) {
            this.e2 = this.d2;
            q1Var.N2 = null;
            z11 = true;
            z10 = true;
        }
        if (q1Var.l7 != null && this.N != q1Var.getRepliesCount()) {
            StaticLayout staticLayout7 = this.U;
            if (staticLayout7 == null || TextUtils.equals(staticLayout7.getText(), q1Var.l7.getText())) {
                this.W = null;
            } else {
                this.W = this.U;
            }
            this.Y = this.O;
            this.X = this.S;
            this.Z = this.P;
            this.a0 = this.Q;
            this.b0 = this.R;
            this.c0 = this.T;
            this.V = true;
            z10 = true;
        }
        if (!TextUtils.equals(this.f0, q1Var.x5)) {
            this.d0 = true;
            this.e0 = q1Var.f9;
            z10 = true;
        }
        if (this.f1 == q1Var.E9) {
            this.K1 = true;
            this.e2 = null;
        } else {
            if (this.f2 == q1Var.B3()) {
                if (z11 || (Math.abs(q1Var.A9 - this.g1) > 1 && this.F0 == q1Var.W6)) {
                    this.i1 = true;
                    this.X0 = this.Y0;
                    this.h1 = this.g1;
                    this.L = this.M;
                    this.J = this.K;
                    this.E = this.D;
                }
                if (this.h2 != q1Var.A3()) {
                    this.i2 = true;
                }
                if (this.k != q1Var.f3) {
                    this.j = true;
                }
                if (this.k2 != q1Var.xb) {
                    this.l2 = true;
                    z10 = true;
                }
                f7 = this.n2;
                if (f7 != q1Var.t0) {
                    this.m2 = true;
                    this.o2 = f7;
                    z10 = true;
                }
                i10 = this.q2;
                if (i10 != q1Var.p0) {
                    this.s2 = true;
                    this.r2 = i10;
                    z10 = true;
                }
                i11 = this.W2;
                if (i11 != q1Var.O1) {
                    this.V2 = true;
                    this.X2 = i11;
                    z10 = true;
                }
                i12 = this.T2;
                s1Var = q1Var.r0;
                if (i12 != (s1Var == null ? s1Var.r : 0)) {
                    this.Y2 = true;
                    this.U2 = i12;
                    z10 = true;
                }
                if (this.Z2 != (q1Var.getPrimaryMessageObject() == null && q1Var.getPrimaryMessageObject().X2)) {
                    this.a3 = true;
                    z10 = true;
                }
                if (this.R2 != q1Var.d2()) {
                    this.S2 = true;
                    z10 = true;
                }
                if (this.b3 != q1Var.q8) {
                    this.c3 = true;
                    z10 = true;
                }
                hashSet = this.d3;
                jj jjVar5 = q1Var.O5;
                hashSet2 = jjVar5 != null ? jjVar5.I0 : null;
                if (hashSet == null || hashSet2 != null) {
                    if ((hashSet != null ? 0 : hashSet.size()) == (hashSet2 != null ? 0 : hashSet2.size()) || hashSet == null || !hashSet.equals(hashSet2)) {
                        z12 = false;
                        if (!z12) {
                            this.f3 = true;
                            this.e3 = this.d3;
                            z10 = true;
                        }
                        z13 = this.g3;
                        jjVar = q1Var.O5;
                        if (z13 != (jjVar == null && jjVar.J0)) {
                            this.i3 = true;
                            this.h3 = z13;
                            z10 = true;
                        }
                        if (jjVar != null || this.x2 == jjVar.n5()) {
                            i13 = this.I2;
                            if (i13 != q1Var.Sa) {
                                this.G2 = true;
                                this.H2 = i13;
                            }
                            q1Var.Q3();
                            if (p0Var.a()) {
                                z10 = true;
                            }
                            if (q1Var.O5.h4()) {
                                float L2 = q1Var.c7 - org.telegram.messenger.i0.L(28 - (q1Var.J ? 2 : 0));
                                if (!p0Var.p) {
                                    L2 -= p0Var.n;
                                }
                                float f16 = this.r;
                                if (L2 != f16) {
                                    this.q = true;
                                    this.s = f16;
                                    z10 = true;
                                }
                            }
                            if (q1Var.O7 != null) {
                                float f17 = q1Var.S7;
                                float f18 = this.t;
                                if (f17 != f18 && f18 != 0.0f) {
                                    this.u = f18;
                                    z10 = true;
                                }
                            }
                            jjVar2 = q1Var.O5;
                            if ((jjVar2 == null && jjVar2.J2) != this.j3 || q1Var.m2 == null || (staticLayout = this.k3) == null) {
                                return z10;
                            }
                            this.l3 = staticLayout;
                            this.m3 = org.telegram.ui.Components.o5.update(0, (View) q1Var, false, this.m3, staticLayout);
                            return true;
                        }
                        this.u2 = true;
                        StaticLayout[] staticLayoutArr = this.y2;
                        StaticLayout staticLayout8 = staticLayoutArr[0];
                        StaticLayout[] staticLayoutArr2 = this.z2;
                        staticLayoutArr2[0] = staticLayout8;
                        staticLayoutArr2[1] = staticLayoutArr[1];
                        this.A2 = this.B2;
                        this.v2 = this.w2;
                        this.C2 = this.D2;
                        z10 = true;
                        q1Var.Q3();
                        if (p0Var.a()) {
                        }
                        if (q1Var.O5.h4()) {
                        }
                        if (q1Var.O7 != null) {
                        }
                        jjVar2 = q1Var.O5;
                        if ((jjVar2 == null && jjVar2.J2) != this.j3) {
                        }
                        return z10;
                    }
                }
                z12 = true;
                if (!z12) {
                }
                z13 = this.g3;
                jjVar = q1Var.O5;
                if (z13 != (jjVar == null && jjVar.J0)) {
                }
                if (jjVar != null) {
                }
                i13 = this.I2;
                if (i13 != q1Var.Sa) {
                }
                q1Var.Q3();
                if (p0Var.a()) {
                }
                if (q1Var.O5.h4()) {
                }
                if (q1Var.O7 != null) {
                }
                jjVar2 = q1Var.O5;
                if ((jjVar2 == null && jjVar2.J2) != this.j3) {
                }
                return z10;
            }
            this.U0 = false;
            this.g2 = true;
            this.h1 = this.g1;
            this.W0 = this.j2;
            this.X0 = this.Y0;
        }
        z10 = true;
        if (this.h2 != q1Var.A3()) {
        }
        if (this.k != q1Var.f3) {
        }
        if (this.k2 != q1Var.xb) {
        }
        f7 = this.n2;
        if (f7 != q1Var.t0) {
        }
        i10 = this.q2;
        if (i10 != q1Var.p0) {
        }
        i11 = this.W2;
        if (i11 != q1Var.O1) {
        }
        i12 = this.T2;
        s1Var = q1Var.r0;
        if (i12 != (s1Var == null ? s1Var.r : 0)) {
        }
        if (this.Z2 != (q1Var.getPrimaryMessageObject() == null && q1Var.getPrimaryMessageObject().X2)) {
        }
        if (this.R2 != q1Var.d2()) {
        }
        if (this.b3 != q1Var.q8) {
        }
        hashSet = this.d3;
        jj jjVar52 = q1Var.O5;
        if (jjVar52 != null) {
        }
        if (hashSet == null) {
        }
        if ((hashSet != null ? 0 : hashSet.size()) == (hashSet2 != null ? 0 : hashSet2.size())) {
        }
        z12 = false;
        if (!z12) {
        }
        z13 = this.g3;
        jjVar = q1Var.O5;
        if (z13 != (jjVar == null && jjVar.J0)) {
        }
        if (jjVar != null) {
        }
        i13 = this.I2;
        if (i13 != q1Var.Sa) {
        }
        q1Var.Q3();
        if (p0Var.a()) {
        }
        if (q1Var.O5.h4()) {
        }
        if (q1Var.O7 != null) {
        }
        jjVar2 = q1Var.O5;
        if ((jjVar2 == null && jjVar2.J2) != this.j3) {
        }
        return z10;
    }

    public final int b() {
        boolean z10;
        int i10;
        boolean z11;
        q1 q1Var = this.a;
        boolean z12 = true;
        if (!q1Var.O5.P3()) {
            if (!q1Var.O5.o4() && !q1Var.O5.Y2()) {
                z12 = false;
            }
            return (z12 ? 4 : 0) | (q1Var.O5.n4() ? 8 : 0);
        }
        if (q1Var.O5.o4() || q1Var.O5.Y2()) {
            z10 = true;
            i10 = 0;
            z12 = false;
            z11 = false;
        } else if (q1Var.O5.n4()) {
            z11 = true;
            i10 = 0;
            z12 = false;
            z10 = false;
        } else {
            if (q1Var.O5.q4()) {
                jj jjVar = q1Var.O5;
                i10 = (jjVar.p1 || jjVar.F4()) ? 0 : 1;
                z10 = false;
            } else {
                i10 = 0;
                z12 = false;
                z10 = false;
            }
            z11 = z10;
        }
        jj jjVar2 = q1Var.O5;
        if (jjVar2.u1 || jj.b4(jjVar2.k)) {
            i10 = 0;
            z12 = false;
            z10 = false;
        }
        return (z12 ? 2 : 0) | i10 | (z10 ? 4 : 0) | (z11 ? 8 : 0);
    }

    public final void c() {
        l0 l0Var;
        this.w0 = true;
        q1 q1Var = this.a;
        ag.c2 c2Var = q1Var.T0;
        ArrayList arrayList = q1Var.G5;
        this.b = c2Var.K0;
        this.c = c2Var.L0;
        this.d = c2Var.M0;
        this.e = c2Var.N0;
        System.arraycopy(c2Var.W0, 0, this.u0, 0, 4);
        org.telegram.ui.ActionBar.c5 c5Var = q1Var.J6;
        if (c5Var != null) {
            this.E0.set(c5Var.getBounds());
        }
        this.F0 = q1Var.W6;
        jj jjVar = q1Var.O5;
        this.J0 = jjVar != null ? jjVar.z2 : null;
        this.K0 = jjVar != null ? jjVar.t2 : 0;
        this.a1 = q1Var.hb;
        this.N0 = jjVar != null ? jjVar.w2 : null;
        this.f = q1Var.q3;
        this.g = q1Var.r3;
        this.d1 = q1Var.k3;
        this.e1 = jjVar != null ? jjVar.K2 : false;
        ArrayList arrayList2 = this.M1;
        arrayList2.clear();
        if (!arrayList.isEmpty()) {
            arrayList2.addAll(arrayList);
        }
        this.v = q1Var.v1;
        this.w = q1Var.f0;
        this.x = q1Var.V;
        this.y = q1Var.d0;
        this.z = q1Var.S != null;
        this.A = q1Var.a0 != null;
        this.H1 = q1Var.U1;
        this.D1 = q1Var.t1;
        this.F1 = q1Var.u1;
        jj jjVar2 = q1Var.O5;
        this.L2 = jjVar2 != null && jjVar2.D == 27 && (l0Var = q1Var.w) != null && l0Var.d();
        if (q1Var.l7 != null) {
            this.N = q1Var.getRepliesCount();
            this.O = q1Var.t7;
            this.U = q1Var.l7;
            this.P = q1Var.o7;
            this.Q = q1Var.p7;
            this.R = q1Var.q7;
            this.S = q1Var.s7;
            this.T = q1Var.n7;
        }
        this.F = q1Var.getRepliesCount();
        this.c2 = q1Var.getMessageObject().k.views;
        this.H = q1Var.ea;
        this.d2 = q1Var.ba;
        this.B = q1Var.o6;
        this.f0 = q1Var.x5;
        this.l1 = q1Var.G6;
        this.n1 = q1Var.G4;
        this.T1 = q1Var.I3;
        this.U1 = q1Var.J3;
        this.Y1 = q1Var.V1;
        this.f1 = !q1Var.E9;
        this.g1 = q1Var.A9;
        this.j2 = q1Var.x9;
        this.Y0 = q1Var.y9;
        this.f2 = q1Var.B3();
        this.t2 = q1Var.getTopMediaOffset();
        this.h2 = q1Var.A3();
        this.k = q1Var.f3;
        this.k2 = q1Var.xb;
        this.n2 = q1Var.t0;
        this.q2 = q1Var.p0;
        this.Q1 = q1Var.I5;
        StaticLayout[] staticLayoutArr = q1Var.o9;
        StaticLayout staticLayout = staticLayoutArr[0];
        StaticLayout[] staticLayoutArr2 = this.y2;
        staticLayoutArr2[0] = staticLayout;
        staticLayoutArr2[1] = staticLayoutArr[1];
        jj jjVar3 = q1Var.O5;
        this.x2 = jjVar3 != null && jjVar3.n5();
        this.B2 = q1Var.r9;
        int i10 = q1Var.Sa;
        this.w2 = i10;
        this.I2 = i10;
        this.D2 = q1Var.p9;
        this.j1 = q1Var.getCurrentBackgroundLeft();
        org.telegram.ui.ActionBar.c5 c5Var2 = q1Var.J6;
        if (c5Var2 != null) {
            this.k1 = c5Var2.getBounds().right;
        }
        jj jjVar4 = q1Var.O5;
        this.p2 = jjVar4 != null ? jjVar4.v2 : 0.0f;
        this.Q0 = q1Var.Y7;
        this.F2 = q1Var.P7;
        this.J2 = q1Var.Z7;
        q1Var.N.q();
        if (q1Var.O7 != null) {
            this.t = q1Var.T7;
        } else {
            this.t = 0.0f;
        }
        this.N2 = q1Var.i9;
        this.O2 = q1Var.j9;
        s1 s1Var = q1Var.r0;
        this.T2 = s1Var != null ? s1Var.r : 0;
        this.Z2 = q1Var.getPrimaryMessageObject() != null && q1Var.getPrimaryMessageObject().X2;
        this.R2 = q1Var.d2();
        this.W2 = q1Var.O1;
        this.b3 = q1Var.q8;
        this.d3 = q1Var.getPrimaryMessageObject() != null ? q1Var.getPrimaryMessageObject().I0 : null;
        jj jjVar5 = q1Var.O5;
        this.g3 = jjVar5 != null && jjVar5.J0;
        this.j3 = jjVar5 != null && jjVar5.J2;
        this.k3 = q1Var.m2;
    }

    public final void d() {
        q1 q1Var = this.a;
        StaticLayout[] staticLayoutArr = q1Var.o9;
        StaticLayout staticLayout = staticLayoutArr[0];
        StaticLayout[] staticLayoutArr2 = this.y2;
        staticLayoutArr2[0] = staticLayout;
        staticLayoutArr2[1] = staticLayoutArr[1];
        this.x2 = q1Var.O5.n5();
        this.B2 = q1Var.r9;
        int i10 = q1Var.Sa;
        this.w2 = i10;
        this.I2 = i10;
        this.D2 = q1Var.p9;
    }

    public final void e() {
        this.h = false;
        this.C = false;
        this.x0 = false;
        this.h0 = 0.0f;
        this.i0 = 0.0f;
        this.j0 = 0.0f;
        this.k0 = 0.0f;
        this.l0 = 0.0f;
        this.m0 = 0.0f;
        boolean z10 = this.g0;
        q1 q1Var = this.a;
        if (z10) {
            float f7 = this.p0;
            if (f7 != 0.0f) {
                float f10 = this.q0;
                if (f10 != 0.0f) {
                    q1Var.T0.y0(this.n0, this.o0, f7, f10);
                }
            }
        }
        if (this.C0) {
            q1Var.T0.L0(this.B0);
        }
        this.n0 = 0.0f;
        this.o0 = 0.0f;
        this.p0 = 0.0f;
        this.q0 = 0.0f;
        this.g0 = false;
        this.A0 = 1.0f;
        this.v0 = 1.0f;
        this.C0 = false;
        this.L1 = 1.0f;
        this.R1 = 0.0f;
        this.S1 = 1.0f;
        this.H0 = false;
        this.L0 = false;
        this.G0 = false;
        this.P2 = false;
        this.Q2 = false;
        this.I0 = null;
        vv vvVar = this.M0;
        if (vvVar != null) {
            vvVar.f(q1Var);
        }
        this.M0 = null;
        this.V0 = null;
        this.W0 = null;
        this.U0 = false;
        this.b1 = false;
        this.D0 = false;
        this.c1 = null;
        org.telegram.ui.Components.o5.release(q1Var, this.P0);
        this.P0 = null;
        this.t0 = false;
        this.K1 = false;
        this.N1.clear();
        this.X1 = false;
        this.E2 = false;
        this.O1 = false;
        this.a2 = false;
        this.S0 = null;
        this.G = false;
        this.I = null;
        this.V = false;
        this.W = null;
        this.e2 = null;
        this.g2 = false;
        this.i2 = false;
        this.i1 = false;
        this.m1 = false;
        this.d0 = false;
        this.t1 = false;
        this.v1 = false;
        this.z1 = false;
        this.x1 = false;
        this.A1 = false;
        this.C1 = false;
        this.w1 = false;
        this.E1 = false;
        this.G1 = false;
        this.M2 = false;
        this.K1 = false;
        this.j = false;
        this.l2 = false;
        this.m2 = false;
        this.s2 = false;
        this.Y2 = false;
        this.a3 = false;
        this.f3 = false;
        this.i3 = false;
        this.S2 = false;
        this.c3 = false;
        this.u2 = false;
        this.G2 = false;
        StaticLayout[] staticLayoutArr = this.z2;
        staticLayoutArr[0] = null;
        staticLayoutArr[1] = null;
        this.q = false;
        sg.p0 p0Var = q1Var.N;
        ArrayList arrayList = p0Var.s;
        ArrayList arrayList2 = p0Var.t;
        for (int i10 = 0; i10 < arrayList2.size(); i10++) {
            ((sg.m0) arrayList2.get(i10)).b();
        }
        arrayList2.clear();
        p0Var.i = false;
        p0Var.j = false;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            ((sg.m0) arrayList.get(i11)).b = 0;
        }
        this.l3 = null;
        org.telegram.ui.Components.o5.release(q1Var, this.m3);
    }

    public final void f() {
        float max = Math.max(0.0f, Math.min(1.0f, this.L1));
        this.R1 = (float) Math.pow(1.0f - max, 0.5d);
        this.S1 = (float) Math.pow(max, 0.5d);
    }
}
