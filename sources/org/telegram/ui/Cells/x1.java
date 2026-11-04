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
import org.telegram.messenger.bd;
import org.telegram.messenger.cv;
import org.telegram.messenger.wi;
import org.telegram.messenger.xi;
import org.telegram.messenger.zi;
import org.telegram.ui.Components.fy;
import org.telegram.ui.ng0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
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
    public cv M0;
    public boolean M2;
    public int N;
    public cv N0;
    public boolean N2;
    public int O;
    public float O0;
    public boolean O1;
    public boolean O2;
    public int P;
    public org.telegram.ui.Components.l5 P0;
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
    public org.telegram.ui.Components.l5 T0;
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
    public xi c1;
    public int c2;
    public boolean c3;
    public float d;
    public boolean d0;
    public xi d1;
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
    public org.telegram.ui.Components.l5 m3;
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
        float f10;
        int i3;
        int i10;
        int i11;
        s1 s1Var;
        HashSet hashSet;
        HashSet hashSet2;
        boolean z12;
        boolean z13;
        zi ziVar;
        int i12;
        zi ziVar2;
        StaticLayout staticLayout;
        l0 l0Var;
        cv cvVar;
        org.telegram.ui.Components.n5 n5Var;
        boolean z14 = false;
        if (!this.w0) {
            return false;
        }
        this.w1 = false;
        this.G0 = false;
        boolean z15 = this.F0;
        q1 q1Var = this.a;
        boolean z16 = q1Var.X6;
        dh.o0 o0Var = q1Var.O;
        ArrayList arrayList = q1Var.H5;
        if (z15 != z16) {
            this.G0 = true;
            z10 = true;
        } else {
            z10 = false;
        }
        this.H0 = false;
        zi ziVar3 = q1Var.P5;
        ArrayList arrayList2 = ziVar3.z2;
        ArrayList arrayList3 = this.J0;
        if (arrayList2 != arrayList3) {
            boolean z17 = ziVar3.t2 == this.K0 || z15 == z16;
            if (arrayList2 != null && arrayList3 != null && arrayList2.size() == this.J0.size()) {
                for (int i13 = 0; i13 < this.J0.size(); i13++) {
                    String charSequence = ((wi) q1Var.P5.z2.get(i13)).e == null ? null : ((wi) q1Var.P5.z2.get(i13)).e.getText().toString();
                    String charSequence2 = ((wi) this.J0.get(i13)).e == null ? null : ((wi) this.J0.get(i13)).e.getText().toString();
                    if ((charSequence != null || charSequence2 == null) && ((charSequence == null || charSequence2 != null) && charSequence.equals(charSequence2))) {
                        org.telegram.ui.Components.l5 l5Var = q1Var.za;
                        if (l5Var != null) {
                            StaticLayout staticLayout2 = ((wi) q1Var.P5.z2.get(i13)).e;
                            StaticLayout staticLayout3 = ((wi) this.J0.get(i13)).e;
                            HashMap hashMap = l5Var.b;
                            if (staticLayout3 != null && (n5Var = (org.telegram.ui.Components.n5) hashMap.remove(staticLayout3)) != null) {
                                ArrayList arrayList4 = n5Var.b;
                                n5Var.a = staticLayout2;
                                for (int i14 = 0; i14 < arrayList4.size(); i14++) {
                                    ((org.telegram.ui.Components.k5) arrayList4.get(i14)).c = staticLayout2;
                                }
                                hashMap.put(staticLayout2, n5Var);
                            }
                        }
                    }
                }
                if (z17) {
                    this.H0 = true;
                    ArrayList arrayList5 = this.J0;
                    this.I0 = arrayList5;
                    this.O0 = this.p2;
                    this.P0 = org.telegram.ui.Components.p5.update(0, (View) q1Var, this.P0, (ArrayList<wi>) arrayList5, true);
                    q1Var.za = org.telegram.ui.Components.p5.update(0, q1Var, q1Var.za, (ArrayList<wi>) q1Var.P5.z2);
                    z10 = true;
                } else {
                    q1Var.za = org.telegram.ui.Components.p5.update(0, q1Var, q1Var.za, (ArrayList<wi>) q1Var.P5.z2);
                }
            }
            z17 = false;
            if (z17) {
            }
        }
        cv cvVar2 = q1Var.P5.w2;
        if (cvVar2 != null && (cvVar2.s || cvVar2.u)) {
            this.w1 = true;
            z10 = true;
        }
        this.L0 = false;
        if (cvVar2 != this.N0) {
            ng0 ng0Var = q1Var.yc;
            boolean z18 = ng0Var != null && ng0Var.h;
            cv cvVar3 = this.M0;
            if (cvVar3 != null) {
                cvVar3.f(q1Var);
                this.M0 = null;
            }
            if (z18) {
                cv cvVar4 = q1Var.P5.w2;
                if (cvVar4 != null && (cvVar = this.N0) != null) {
                    cvVar4.J(cvVar);
                }
            } else {
                this.L0 = true;
                cv cvVar5 = this.N0;
                this.M0 = cvVar5;
                if (cvVar5 != null) {
                    cvVar5.b(q1Var);
                }
            }
        }
        this.P2 = false;
        if (q1Var.j9 != this.N2) {
            this.P2 = true;
            z10 = true;
        }
        this.Q2 = false;
        if (q1Var.k9 != this.O2) {
            this.Q2 = true;
            z10 = true;
        }
        StaticLayout staticLayout4 = q1Var.Q7;
        if (staticLayout4 != this.F2) {
            CharSequence text = staticLayout4 != null ? staticLayout4.getText() : null;
            StaticLayout staticLayout5 = this.F2;
            if (!TextUtils.equals(text, staticLayout5 != null ? staticLayout5.getText() : null)) {
                this.R0 = this.Q0;
                StaticLayout staticLayout6 = this.F2;
                this.S0 = staticLayout6;
                this.K2 = this.J2;
                this.T0 = org.telegram.ui.Components.p5.update(0, (View) this.a, false, this.T0, true, staticLayout6);
                z10 = true;
            }
        }
        boolean z19 = q1Var.ib;
        if (z19 && !this.a1 && q1Var.y9 != null) {
            String M0 = bd.M0(2131751211, "EditedMessage");
            CharSequence text2 = q1Var.y9.getText();
            int indexOf = text2.toString().indexOf(M0);
            if (indexOf >= 0) {
                if (indexOf == 0) {
                    TextPaint textPaint = org.telegram.ui.ActionBar.k6.T2;
                    int L = org.telegram.messenger.g0.L(100.0f) + q1Var.A9;
                    Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
                    this.V0 = new StaticLayout(M0, textPaint, L, alignment, 1.0f, 0.0f, false);
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) M0);
                    spannableStringBuilder.append(text2.subSequence(M0.length(), text2.length()));
                    spannableStringBuilder.setSpan(new fy(z14), 0, M0.length(), 0);
                    this.W0 = new StaticLayout(spannableStringBuilder, org.telegram.ui.ActionBar.k6.T2, org.telegram.messenger.g0.L(100.0f) + q1Var.A9, alignment, 1.0f, 0.0f, false);
                    this.Z0 = q1Var.z9 - this.Y0;
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
            q1Var.O2 = null;
        } else if (!z19 && this.a1 && q1Var.y9 != null) {
            this.W0 = this.j2;
            int i15 = q1Var.z9;
            int i16 = this.Y0;
            this.Z0 = i15 - i16;
            this.U0 = true;
            this.X0 = i16;
            this.h1 = this.g1;
            this.i1 = true;
            z10 = true;
        }
        this.m1 = false;
        if (q1Var.H6 != this.l1) {
            this.m1 = true;
            z10 = true;
        }
        this.t1 = false;
        if (q1Var.w1 != this.v) {
            this.t1 = true;
            float f11 = this.d;
            this.p1 = f11;
            float f12 = this.e;
            this.q1 = f12;
            this.r1 = (f11 / 2.0f) + this.b;
            this.s1 = (f12 / 2.0f) + this.c;
            z10 = true;
        }
        this.v1 = false;
        int i17 = q1Var.g0;
        int i18 = this.w;
        if (i17 != i18) {
            this.w1 = true;
            this.u1 = i18;
            this.v1 = true;
            z10 = true;
        }
        this.z1 = false;
        int i19 = q1Var.W;
        int i20 = this.x;
        if (i19 != i20) {
            this.y1 = i20;
            this.z1 = true;
            z10 = true;
        }
        this.x1 = false;
        if ((q1Var.T != null) != this.z) {
            this.x1 = true;
            z10 = true;
        }
        this.C1 = false;
        int i21 = q1Var.e0;
        int i22 = this.y;
        if (i21 != i22) {
            this.B1 = i22;
            this.C1 = true;
            z10 = true;
        }
        this.A1 = false;
        if ((q1Var.b0 != null) != this.A) {
            this.A1 = true;
            z10 = true;
        }
        this.M2 = false;
        if ((q1Var.P5.D == 27 && (l0Var = q1Var.w) != null && l0Var.d()) != this.L2) {
            this.M2 = true;
            z10 = true;
        }
        this.E1 = false;
        if (q1Var.u1 != this.D1) {
            this.E1 = true;
            z10 = true;
        }
        this.G1 = false;
        if (q1Var.v1 != this.F1) {
            this.G1 = true;
            z10 = true;
        }
        this.J1 = false;
        if (q1Var.Q1) {
            int i23 = q1Var.V1;
            int i24 = this.H1;
            if (i23 != i24) {
                this.J1 = true;
                this.I1 = i24;
                z10 = true;
            }
        }
        this.o1 = false;
        if (q1Var.H4 != this.n1) {
            this.o1 = true;
            z10 = true;
        }
        zi ziVar4 = q1Var.P5;
        boolean z20 = ziVar4 != null ? ziVar4.K2 : false;
        xi xiVar = q1Var.l3;
        xi xiVar2 = this.d1;
        if (xiVar != xiVar2) {
            String charSequence3 = xiVar2 == null ? null : xiVar2.a.toString();
            xi xiVar3 = q1Var.l3;
            String charSequence4 = xiVar3 == null ? null : xiVar3.a.toString();
            if (this.F0 != q1Var.X6 || this.e1 != z20) {
                xi xiVar4 = q1Var.l3;
                int i25 = xiVar4 == null ? 0 : xiVar4.c;
                xi xiVar5 = this.d1;
            }
            if ((charSequence4 == null) == (charSequence3 == null) && (charSequence3 == null || charSequence3.equals(charSequence4))) {
                q1Var.N3();
                float f13 = this.f;
                if (f13 != q1Var.r3 || this.g != q1Var.s3) {
                    this.t0 = true;
                    this.r0 = f13;
                    this.s0 = this.g;
                    z10 = true;
                }
            }
            this.b1 = true;
            xi xiVar6 = this.d1;
            this.c1 = xiVar6;
            this.P0 = org.telegram.ui.Components.p5.update(0, q1Var, (org.telegram.ui.Components.l5) null, (ArrayList<wi>) (xiVar6 == null ? null : xiVar6.e));
            org.telegram.ui.Components.l5 l5Var2 = q1Var.za;
            xi xiVar7 = q1Var.l3;
            q1Var.za = org.telegram.ui.Components.p5.update(0, q1Var, l5Var2, (ArrayList<wi>) (xiVar7 == null ? null : xiVar7.e));
            if (this.F0 != q1Var.X6 || this.e1 != z20) {
                this.t0 = true;
                this.r0 = this.f;
                this.s0 = this.g;
            }
            z10 = true;
        } else if (xiVar != null && xiVar2 != null) {
            q1Var.N3();
            float f14 = this.f;
            if (f14 != q1Var.r3 || this.g != q1Var.s3) {
                this.t0 = true;
                this.r0 = f14;
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
                for (int i26 = 0; i26 < arrayList.size(); i26++) {
                    c0 c0Var = (c0) arrayList.get(i26);
                    c0 c0Var2 = (c0) arrayList6.get(i26);
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
        int i27 = this.Q1;
        if (i27 != q1Var.J5) {
            this.P1 = i27;
            this.O1 = true;
        }
        int i28 = q1Var.L1;
        if (i28 == 5 || i28 == 3 || i28 == 1) {
            float f15 = q1Var.J3;
            float f16 = this.T1;
            if (f15 != f16 || q1Var.K3 != this.U1) {
                this.V1 = f16;
                this.W1 = this.U1;
                this.X1 = true;
                z10 = true;
            }
        }
        int i29 = q1Var.W1;
        int i30 = this.Y1;
        if (i29 != i30) {
            this.Z1 = i30;
            this.a2 = true;
            z10 = true;
        }
        if (this.B != q1Var.p6) {
            this.C = true;
            q1Var.O2 = null;
            z11 = true;
            z10 = true;
        } else {
            z11 = false;
        }
        if ((this.H != null || q1Var.fa != null) && this.F != q1Var.getRepliesCount()) {
            this.I = this.H;
            this.G = true;
            q1Var.O2 = null;
            z11 = true;
            z10 = true;
        }
        if (this.d2 != null && this.c2 != q1Var.getMessageObject().k.views) {
            this.e2 = this.d2;
            q1Var.O2 = null;
            z11 = true;
            z10 = true;
        }
        if (q1Var.m7 != null && this.N != q1Var.getRepliesCount()) {
            StaticLayout staticLayout7 = this.U;
            if (staticLayout7 == null || TextUtils.equals(staticLayout7.getText(), q1Var.m7.getText())) {
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
        if (!TextUtils.equals(this.f0, q1Var.y5)) {
            this.d0 = true;
            this.e0 = q1Var.g9;
            z10 = true;
        }
        if (this.f1 == q1Var.F9) {
            this.K1 = true;
            this.e2 = null;
        } else {
            if (this.f2 == q1Var.D3()) {
                if (z11 || (Math.abs(q1Var.B9 - this.g1) > 1 && this.F0 == q1Var.X6)) {
                    this.i1 = true;
                    this.X0 = this.Y0;
                    this.h1 = this.g1;
                    this.L = this.M;
                    this.J = this.K;
                    this.E = this.D;
                }
                if (this.h2 != q1Var.C3()) {
                    this.i2 = true;
                }
                if (this.k != q1Var.g3) {
                    this.j = true;
                }
                if (this.k2 != q1Var.yb) {
                    this.l2 = true;
                    z10 = true;
                }
                f10 = this.n2;
                if (f10 != q1Var.u0) {
                    this.m2 = true;
                    this.o2 = f10;
                    z10 = true;
                }
                i3 = this.q2;
                if (i3 != q1Var.q0) {
                    this.s2 = true;
                    this.r2 = i3;
                    z10 = true;
                }
                i10 = this.W2;
                if (i10 != q1Var.P1) {
                    this.V2 = true;
                    this.X2 = i10;
                    z10 = true;
                }
                i11 = this.T2;
                s1Var = q1Var.s0;
                if (i11 != (s1Var == null ? s1Var.r : 0)) {
                    this.Y2 = true;
                    this.U2 = i11;
                    z10 = true;
                }
                if (this.Z2 != (q1Var.getPrimaryMessageObject() == null && q1Var.getPrimaryMessageObject().a3)) {
                    this.a3 = true;
                    z10 = true;
                }
                if (this.R2 != q1Var.f2()) {
                    this.S2 = true;
                    z10 = true;
                }
                if (this.b3 != q1Var.r8) {
                    this.c3 = true;
                    z10 = true;
                }
                hashSet = this.d3;
                zi ziVar5 = q1Var.P5;
                hashSet2 = ziVar5 != null ? ziVar5.I0 : null;
                if (hashSet == null || hashSet2 != null) {
                    if ((hashSet != null ? 0 : hashSet.size()) == (hashSet2 != null ? 0 : hashSet2.size()) || hashSet == null || !hashSet.equals(hashSet2)) {
                        z12 = false;
                        if (!z12) {
                            this.f3 = true;
                            this.e3 = this.d3;
                            z10 = true;
                        }
                        z13 = this.g3;
                        ziVar = q1Var.P5;
                        if (z13 != (ziVar == null && ziVar.J0)) {
                            this.i3 = true;
                            this.h3 = z13;
                            z10 = true;
                        }
                        if (ziVar != null || this.x2 == ziVar.o5()) {
                            i12 = this.I2;
                            if (i12 != q1Var.Ta) {
                                this.G2 = true;
                                this.H2 = i12;
                            }
                            q1Var.S3();
                            if (o0Var.a()) {
                                z10 = true;
                            }
                            if (q1Var.P5.i4()) {
                                float L2 = q1Var.d7 - org.telegram.messenger.g0.L(28 - (q1Var.K ? 2 : 0));
                                if (!o0Var.p) {
                                    L2 -= o0Var.n;
                                }
                                float f17 = this.r;
                                if (L2 != f17) {
                                    this.q = true;
                                    this.s = f17;
                                    z10 = true;
                                }
                            }
                            if (q1Var.P7 != null) {
                                float f18 = q1Var.T7;
                                float f19 = this.t;
                                if (f18 != f19 && f19 != 0.0f) {
                                    this.u = f19;
                                    z10 = true;
                                }
                            }
                            ziVar2 = q1Var.P5;
                            if ((ziVar2 == null && ziVar2.J2) != this.j3 || q1Var.n2 == null || (staticLayout = this.k3) == null) {
                                return z10;
                            }
                            this.l3 = staticLayout;
                            this.m3 = org.telegram.ui.Components.p5.update(0, (View) q1Var, false, this.m3, staticLayout);
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
                        q1Var.S3();
                        if (o0Var.a()) {
                        }
                        if (q1Var.P5.i4()) {
                        }
                        if (q1Var.P7 != null) {
                        }
                        ziVar2 = q1Var.P5;
                        if ((ziVar2 == null && ziVar2.J2) != this.j3) {
                        }
                        return z10;
                    }
                }
                z12 = true;
                if (!z12) {
                }
                z13 = this.g3;
                ziVar = q1Var.P5;
                if (z13 != (ziVar == null && ziVar.J0)) {
                }
                if (ziVar != null) {
                }
                i12 = this.I2;
                if (i12 != q1Var.Ta) {
                }
                q1Var.S3();
                if (o0Var.a()) {
                }
                if (q1Var.P5.i4()) {
                }
                if (q1Var.P7 != null) {
                }
                ziVar2 = q1Var.P5;
                if ((ziVar2 == null && ziVar2.J2) != this.j3) {
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
        if (this.h2 != q1Var.C3()) {
        }
        if (this.k != q1Var.g3) {
        }
        if (this.k2 != q1Var.yb) {
        }
        f10 = this.n2;
        if (f10 != q1Var.u0) {
        }
        i3 = this.q2;
        if (i3 != q1Var.q0) {
        }
        i10 = this.W2;
        if (i10 != q1Var.P1) {
        }
        i11 = this.T2;
        s1Var = q1Var.s0;
        if (i11 != (s1Var == null ? s1Var.r : 0)) {
        }
        if (this.Z2 != (q1Var.getPrimaryMessageObject() == null && q1Var.getPrimaryMessageObject().a3)) {
        }
        if (this.R2 != q1Var.f2()) {
        }
        if (this.b3 != q1Var.r8) {
        }
        hashSet = this.d3;
        zi ziVar52 = q1Var.P5;
        if (ziVar52 != null) {
        }
        if (hashSet == null) {
        }
        if ((hashSet != null ? 0 : hashSet.size()) == (hashSet2 != null ? 0 : hashSet2.size())) {
        }
        z12 = false;
        if (!z12) {
        }
        z13 = this.g3;
        ziVar = q1Var.P5;
        if (z13 != (ziVar == null && ziVar.J0)) {
        }
        if (ziVar != null) {
        }
        i12 = this.I2;
        if (i12 != q1Var.Ta) {
        }
        q1Var.S3();
        if (o0Var.a()) {
        }
        if (q1Var.P5.i4()) {
        }
        if (q1Var.P7 != null) {
        }
        ziVar2 = q1Var.P5;
        if ((ziVar2 == null && ziVar2.J2) != this.j3) {
        }
        return z10;
    }

    public final int b() {
        boolean z10;
        int i3;
        boolean z11;
        q1 q1Var = this.a;
        boolean z12 = true;
        if (!q1Var.P5.Q3()) {
            if (!q1Var.P5.p4() && !q1Var.P5.Z2()) {
                z12 = false;
            }
            return (z12 ? 4 : 0) | (q1Var.P5.o4() ? 8 : 0);
        }
        if (q1Var.P5.p4() || q1Var.P5.Z2()) {
            z10 = true;
            i3 = 0;
            z12 = false;
            z11 = false;
        } else if (q1Var.P5.o4()) {
            z11 = true;
            i3 = 0;
            z12 = false;
            z10 = false;
        } else {
            if (q1Var.P5.r4()) {
                zi ziVar = q1Var.P5;
                i3 = (ziVar.p1 || ziVar.G4()) ? 0 : 1;
                z10 = false;
            } else {
                i3 = 0;
                z12 = false;
                z10 = false;
            }
            z11 = z10;
        }
        zi ziVar2 = q1Var.P5;
        if (ziVar2.u1 || zi.c4(ziVar2.k)) {
            i3 = 0;
            z12 = false;
            z10 = false;
        }
        return (z12 ? 2 : 0) | i3 | (z10 ? 4 : 0) | (z11 ? 8 : 0);
    }

    public final void c() {
        l0 l0Var;
        this.w0 = true;
        q1 q1Var = this.a;
        ei.c3 c3Var = q1Var.U0;
        ArrayList arrayList = q1Var.H5;
        this.b = c3Var.L0;
        this.c = c3Var.M0;
        this.d = c3Var.N0;
        this.e = c3Var.O0;
        System.arraycopy(c3Var.X0, 0, this.u0, 0, 4);
        org.telegram.ui.ActionBar.t4 t4Var = q1Var.K6;
        if (t4Var != null) {
            this.E0.set(t4Var.getBounds());
        }
        this.F0 = q1Var.X6;
        zi ziVar = q1Var.P5;
        this.J0 = ziVar != null ? ziVar.z2 : null;
        this.K0 = ziVar != null ? ziVar.t2 : 0;
        this.a1 = q1Var.ib;
        this.N0 = ziVar != null ? ziVar.w2 : null;
        this.f = q1Var.r3;
        this.g = q1Var.s3;
        this.d1 = q1Var.l3;
        this.e1 = ziVar != null ? ziVar.K2 : false;
        ArrayList arrayList2 = this.M1;
        arrayList2.clear();
        if (!arrayList.isEmpty()) {
            arrayList2.addAll(arrayList);
        }
        this.v = q1Var.w1;
        this.w = q1Var.g0;
        this.x = q1Var.W;
        this.y = q1Var.e0;
        this.z = q1Var.T != null;
        this.A = q1Var.b0 != null;
        this.H1 = q1Var.V1;
        this.D1 = q1Var.u1;
        this.F1 = q1Var.v1;
        zi ziVar2 = q1Var.P5;
        this.L2 = ziVar2 != null && ziVar2.D == 27 && (l0Var = q1Var.w) != null && l0Var.d();
        if (q1Var.m7 != null) {
            this.N = q1Var.getRepliesCount();
            this.O = q1Var.u7;
            this.U = q1Var.m7;
            this.P = q1Var.p7;
            this.Q = q1Var.q7;
            this.R = q1Var.r7;
            this.S = q1Var.t7;
            this.T = q1Var.o7;
        }
        this.F = q1Var.getRepliesCount();
        this.c2 = q1Var.getMessageObject().k.views;
        this.H = q1Var.fa;
        this.d2 = q1Var.ca;
        this.B = q1Var.p6;
        this.f0 = q1Var.y5;
        this.l1 = q1Var.H6;
        this.n1 = q1Var.H4;
        this.T1 = q1Var.J3;
        this.U1 = q1Var.K3;
        this.Y1 = q1Var.W1;
        this.f1 = !q1Var.F9;
        this.g1 = q1Var.B9;
        this.j2 = q1Var.y9;
        this.Y0 = q1Var.z9;
        this.f2 = q1Var.D3();
        this.t2 = q1Var.getTopMediaOffset();
        this.h2 = q1Var.C3();
        this.k = q1Var.g3;
        this.k2 = q1Var.yb;
        this.n2 = q1Var.u0;
        this.q2 = q1Var.q0;
        this.Q1 = q1Var.J5;
        StaticLayout[] staticLayoutArr = q1Var.p9;
        StaticLayout staticLayout = staticLayoutArr[0];
        StaticLayout[] staticLayoutArr2 = this.y2;
        staticLayoutArr2[0] = staticLayout;
        staticLayoutArr2[1] = staticLayoutArr[1];
        zi ziVar3 = q1Var.P5;
        this.x2 = ziVar3 != null && ziVar3.o5();
        this.B2 = q1Var.s9;
        int i3 = q1Var.Ta;
        this.w2 = i3;
        this.I2 = i3;
        this.D2 = q1Var.q9;
        this.j1 = q1Var.getCurrentBackgroundLeft();
        org.telegram.ui.ActionBar.t4 t4Var2 = q1Var.K6;
        if (t4Var2 != null) {
            this.k1 = t4Var2.getBounds().right;
        }
        zi ziVar4 = q1Var.P5;
        this.p2 = ziVar4 != null ? ziVar4.v2 : 0.0f;
        this.Q0 = q1Var.Z7;
        this.F2 = q1Var.Q7;
        this.J2 = q1Var.a8;
        q1Var.O.q();
        if (q1Var.P7 != null) {
            this.t = q1Var.U7;
        } else {
            this.t = 0.0f;
        }
        this.N2 = q1Var.j9;
        this.O2 = q1Var.k9;
        s1 s1Var = q1Var.s0;
        this.T2 = s1Var != null ? s1Var.r : 0;
        this.Z2 = q1Var.getPrimaryMessageObject() != null && q1Var.getPrimaryMessageObject().a3;
        this.R2 = q1Var.f2();
        this.W2 = q1Var.P1;
        this.b3 = q1Var.r8;
        this.d3 = q1Var.getPrimaryMessageObject() != null ? q1Var.getPrimaryMessageObject().I0 : null;
        zi ziVar5 = q1Var.P5;
        this.g3 = ziVar5 != null && ziVar5.J0;
        this.j3 = ziVar5 != null && ziVar5.J2;
        this.k3 = q1Var.n2;
    }

    public final void d() {
        q1 q1Var = this.a;
        StaticLayout[] staticLayoutArr = q1Var.p9;
        StaticLayout staticLayout = staticLayoutArr[0];
        StaticLayout[] staticLayoutArr2 = this.y2;
        staticLayoutArr2[0] = staticLayout;
        staticLayoutArr2[1] = staticLayoutArr[1];
        this.x2 = q1Var.P5.o5();
        this.B2 = q1Var.s9;
        int i3 = q1Var.Ta;
        this.w2 = i3;
        this.I2 = i3;
        this.D2 = q1Var.q9;
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
            float f10 = this.p0;
            if (f10 != 0.0f) {
                float f11 = this.q0;
                if (f11 != 0.0f) {
                    q1Var.U0.y0(this.n0, this.o0, f10, f11);
                }
            }
        }
        if (this.C0) {
            q1Var.U0.L0(this.B0);
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
        cv cvVar = this.M0;
        if (cvVar != null) {
            cvVar.f(q1Var);
        }
        this.M0 = null;
        this.V0 = null;
        this.W0 = null;
        this.U0 = false;
        this.b1 = false;
        this.D0 = false;
        this.c1 = null;
        org.telegram.ui.Components.p5.release(q1Var, this.P0);
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
        dh.o0 o0Var = q1Var.O;
        ArrayList arrayList = o0Var.s;
        ArrayList arrayList2 = o0Var.t;
        for (int i3 = 0; i3 < arrayList2.size(); i3++) {
            ((dh.l0) arrayList2.get(i3)).b();
        }
        arrayList2.clear();
        o0Var.i = false;
        o0Var.j = false;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            ((dh.l0) arrayList.get(i10)).b = 0;
        }
        this.l3 = null;
        org.telegram.ui.Components.p5.release(q1Var, this.m3);
    }

    public final void f() {
        float max = Math.max(0.0f, Math.min(1.0f, this.L1));
        this.R1 = (float) Math.pow(1.0f - max, 0.5d);
        this.S1 = (float) Math.pow(max, 0.5d);
    }
}
