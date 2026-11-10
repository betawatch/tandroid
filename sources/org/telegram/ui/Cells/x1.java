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
import org.telegram.messenger.fj;
import org.telegram.messenger.fu;
import org.telegram.messenger.gj;
import org.telegram.messenger.id;
import org.telegram.messenger.ij;
import org.telegram.messenger.kv;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.hy;
import org.telegram.ui.wg0;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
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
    public kv M0;
    public boolean M2;
    public int N;
    public kv N0;
    public boolean N2;
    public int O;
    public float O0;
    public boolean O1;
    public boolean O2;
    public int P;
    public org.telegram.ui.Components.m5 P0;
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
    public org.telegram.ui.Components.m5 T0;
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
    public gj c1;
    public int c2;
    public boolean c3;
    public float d;
    public boolean d0;
    public gj d1;
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
    public org.telegram.ui.Components.m5 m3;
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

    /* JADX WARN: Code restructure failed: missing block: B:439:0x03bc, code lost:
    
        if (r10 == (r11 == null ? 0 : r11.c)) goto L217;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0191, code lost:
    
        if (r1 == false) goto L97;
     */
    /* JADX WARN: Removed duplicated region for block: B:260:0x05e2  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x05ea  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x05f2  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x05fe  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x0609  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x0614  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x061f  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x0625  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x063f  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x064a  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x0653  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x065c  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x0683  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x0690  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x0699  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x06a0  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x06d8  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x06e1  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x070a  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x071f  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x072a  */
    /* JADX WARN: Removed duplicated region for block: B:353:0x06ca  */
    /* JADX WARN: Removed duplicated region for block: B:356:0x0666  */
    /* JADX WARN: Removed duplicated region for block: B:358:0x066e  */
    /* JADX WARN: Removed duplicated region for block: B:364:0x0670  */
    /* JADX WARN: Removed duplicated region for block: B:365:0x0668  */
    /* JADX WARN: Removed duplicated region for block: B:367:0x0622  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0106  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a() {
        boolean z9;
        boolean z10;
        float f10;
        int i7;
        int i10;
        int i11;
        s1 s1Var;
        HashSet hashSet;
        HashSet hashSet2;
        boolean z11;
        boolean z12;
        ij ijVar;
        int i12;
        ij ijVar2;
        StaticLayout staticLayout;
        l0 l0Var;
        kv kvVar;
        org.telegram.ui.Components.o5 o5Var;
        boolean z13 = false;
        if (!this.w0) {
            return false;
        }
        this.w1 = false;
        this.G0 = false;
        boolean z14 = this.F0;
        q1 q1Var = this.a;
        boolean z15 = q1Var.X6;
        ch.p0 p0Var = q1Var.N;
        ArrayList arrayList = q1Var.H5;
        if (z14 != z15) {
            this.G0 = true;
            z9 = true;
        } else {
            z9 = false;
        }
        this.H0 = false;
        ij ijVar3 = q1Var.P5;
        ArrayList arrayList2 = ijVar3.z2;
        ArrayList arrayList3 = this.J0;
        if (arrayList2 != arrayList3) {
            boolean z16 = ijVar3.t2 == this.K0 || z14 == z15;
            if (arrayList2 != null && arrayList3 != null && arrayList2.size() == this.J0.size()) {
                for (int i13 = 0; i13 < this.J0.size(); i13++) {
                    String charSequence = ((fj) q1Var.P5.z2.get(i13)).e == null ? null : ((fj) q1Var.P5.z2.get(i13)).e.getText().toString();
                    String charSequence2 = ((fj) this.J0.get(i13)).e == null ? null : ((fj) this.J0.get(i13)).e.getText().toString();
                    if ((charSequence != null || charSequence2 == null) && ((charSequence == null || charSequence2 != null) && charSequence.equals(charSequence2))) {
                        org.telegram.ui.Components.m5 m5Var = q1Var.za;
                        if (m5Var != null) {
                            StaticLayout staticLayout2 = ((fj) q1Var.P5.z2.get(i13)).e;
                            StaticLayout staticLayout3 = ((fj) this.J0.get(i13)).e;
                            HashMap hashMap = m5Var.b;
                            if (staticLayout3 != null && (o5Var = (org.telegram.ui.Components.o5) hashMap.remove(staticLayout3)) != null) {
                                ArrayList arrayList4 = o5Var.b;
                                o5Var.a = staticLayout2;
                                for (int i14 = 0; i14 < arrayList4.size(); i14++) {
                                    ((org.telegram.ui.Components.l5) arrayList4.get(i14)).c = staticLayout2;
                                }
                                hashMap.put(staticLayout2, o5Var);
                            }
                        }
                    }
                }
                if (z16) {
                    this.H0 = true;
                    ArrayList arrayList5 = this.J0;
                    this.I0 = arrayList5;
                    this.O0 = this.p2;
                    this.P0 = org.telegram.ui.Components.q5.update(0, (View) q1Var, this.P0, (ArrayList<fj>) arrayList5, true);
                    q1Var.za = org.telegram.ui.Components.q5.update(0, q1Var, q1Var.za, (ArrayList<fj>) q1Var.P5.z2);
                    z9 = true;
                } else {
                    q1Var.za = org.telegram.ui.Components.q5.update(0, q1Var, q1Var.za, (ArrayList<fj>) q1Var.P5.z2);
                }
            }
            z16 = false;
            if (z16) {
            }
        }
        kv kvVar2 = q1Var.P5.w2;
        if (kvVar2 != null && (kvVar2.s || kvVar2.u)) {
            this.w1 = true;
            z9 = true;
        }
        this.L0 = false;
        if (kvVar2 != this.N0) {
            wg0 wg0Var = q1Var.zc;
            boolean z17 = wg0Var != null && wg0Var.h;
            kv kvVar3 = this.M0;
            if (kvVar3 != null) {
                kvVar3.f(q1Var);
                this.M0 = null;
            }
            if (z17) {
                kv kvVar4 = q1Var.P5.w2;
                if (kvVar4 != null && (kvVar = this.N0) != null) {
                    kvVar4.J(kvVar);
                }
            } else {
                kv kvVar5 = q1Var.P5.w2;
                if (kvVar5 != null) {
                    kv kvVar6 = this.N0;
                    ArrayList arrayList6 = kvVar5.g;
                    if (kvVar6 != null) {
                        ArrayList arrayList7 = kvVar6.g;
                        if (arrayList6.size() == 1 && arrayList7.size() == 1) {
                            fu fuVar = (fu) arrayList6.get(0);
                            fu fuVar2 = (fu) arrayList7.get(0);
                            boolean z18 = (fuVar instanceof ck0) && (fuVar2 instanceof ck0) && TextUtils.equals(((ck0) fuVar).W.url, ((ck0) fuVar2).W.url);
                        }
                    }
                }
                this.L0 = true;
                kv kvVar7 = this.N0;
                this.M0 = kvVar7;
                if (kvVar7 != null) {
                    kvVar7.b(q1Var);
                }
            }
        }
        this.P2 = false;
        if (q1Var.j9 != this.N2) {
            this.P2 = true;
            z9 = true;
        }
        this.Q2 = false;
        if (q1Var.k9 != this.O2) {
            this.Q2 = true;
            z9 = true;
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
                this.T0 = org.telegram.ui.Components.q5.update(0, (View) this.a, false, this.T0, true, staticLayout6);
                z9 = true;
            }
        }
        boolean z19 = q1Var.ib;
        if (z19 && !this.a1 && q1Var.y9 != null) {
            String M0 = id.M0(2131751210, "EditedMessage");
            CharSequence text2 = q1Var.y9.getText();
            int indexOf = text2.toString().indexOf(M0);
            if (indexOf >= 0) {
                if (indexOf == 0) {
                    TextPaint textPaint = org.telegram.ui.ActionBar.m6.T2;
                    int L = org.telegram.messenger.g0.L(100.0f) + q1Var.A9;
                    Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
                    this.V0 = new StaticLayout(M0, textPaint, L, alignment, 1.0f, 0.0f, false);
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) M0);
                    spannableStringBuilder.append(text2.subSequence(M0.length(), text2.length()));
                    spannableStringBuilder.setSpan(new hy(z13), 0, M0.length(), 0);
                    this.W0 = new StaticLayout(spannableStringBuilder, org.telegram.ui.ActionBar.m6.T2, org.telegram.messenger.g0.L(100.0f) + q1Var.A9, alignment, 1.0f, 0.0f, false);
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
                z9 = true;
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
            z9 = true;
        }
        this.m1 = false;
        if (q1Var.H6 != this.l1) {
            this.m1 = true;
            z9 = true;
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
            z9 = true;
        }
        this.v1 = false;
        int i17 = q1Var.f0;
        int i18 = this.w;
        if (i17 != i18) {
            this.w1 = true;
            this.u1 = i18;
            this.v1 = true;
            z9 = true;
        }
        this.z1 = false;
        int i19 = q1Var.V;
        int i20 = this.x;
        if (i19 != i20) {
            this.y1 = i20;
            this.z1 = true;
            z9 = true;
        }
        this.x1 = false;
        if ((q1Var.S != null) != this.z) {
            this.x1 = true;
            z9 = true;
        }
        this.C1 = false;
        int i21 = q1Var.d0;
        int i22 = this.y;
        if (i21 != i22) {
            this.B1 = i22;
            this.C1 = true;
            z9 = true;
        }
        this.A1 = false;
        if ((q1Var.a0 != null) != this.A) {
            this.A1 = true;
            z9 = true;
        }
        this.M2 = false;
        if ((q1Var.P5.D == 27 && (l0Var = q1Var.w) != null && l0Var.d()) != this.L2) {
            this.M2 = true;
            z9 = true;
        }
        this.E1 = false;
        if (q1Var.u1 != this.D1) {
            this.E1 = true;
            z9 = true;
        }
        this.G1 = false;
        if (q1Var.v1 != this.F1) {
            this.G1 = true;
            z9 = true;
        }
        this.J1 = false;
        if (q1Var.Q1) {
            int i23 = q1Var.V1;
            int i24 = this.H1;
            if (i23 != i24) {
                this.J1 = true;
                this.I1 = i24;
                z9 = true;
            }
        }
        this.o1 = false;
        if (q1Var.H4 != this.n1) {
            this.o1 = true;
            z9 = true;
        }
        ij ijVar4 = q1Var.P5;
        boolean z20 = ijVar4 != null ? ijVar4.K2 : false;
        gj gjVar = q1Var.l3;
        gj gjVar2 = this.d1;
        if (gjVar != gjVar2) {
            String charSequence3 = gjVar2 == null ? null : gjVar2.a.toString();
            gj gjVar3 = q1Var.l3;
            String charSequence4 = gjVar3 == null ? null : gjVar3.a.toString();
            if (this.F0 != q1Var.X6 || this.e1 != z20) {
                gj gjVar4 = q1Var.l3;
                int i25 = gjVar4 == null ? 0 : gjVar4.c;
                gj gjVar5 = this.d1;
            }
            if ((charSequence4 == null) == (charSequence3 == null) && (charSequence3 == null || charSequence3.equals(charSequence4))) {
                q1Var.P3();
                float f13 = this.f;
                if (f13 != q1Var.r3 || this.g != q1Var.s3) {
                    this.t0 = true;
                    this.r0 = f13;
                    this.s0 = this.g;
                    z9 = true;
                }
            }
            this.b1 = true;
            gj gjVar6 = this.d1;
            this.c1 = gjVar6;
            this.P0 = org.telegram.ui.Components.q5.update(0, q1Var, (org.telegram.ui.Components.m5) null, (ArrayList<fj>) (gjVar6 == null ? null : gjVar6.e));
            org.telegram.ui.Components.m5 m5Var2 = q1Var.za;
            gj gjVar7 = q1Var.l3;
            q1Var.za = org.telegram.ui.Components.q5.update(0, q1Var, m5Var2, (ArrayList<fj>) (gjVar7 == null ? null : gjVar7.e));
            if (this.F0 != q1Var.X6 || this.e1 != z20) {
                this.t0 = true;
                this.r0 = this.f;
                this.s0 = this.g;
            }
            z9 = true;
        } else if (gjVar != null && gjVar2 != null) {
            q1Var.P3();
            float f14 = this.f;
            if (f14 != q1Var.r3 || this.g != q1Var.s3) {
                this.t0 = true;
                this.r0 = f14;
                this.s0 = this.g;
                z9 = true;
            }
        }
        ArrayList arrayList8 = this.M1;
        if (!arrayList8.isEmpty() || !arrayList.isEmpty()) {
            if (arrayList8.size() != arrayList.size()) {
                this.E2 = true;
            }
            if (!this.E2) {
                for (int i26 = 0; i26 < arrayList.size(); i26++) {
                    c0 c0Var = (c0) arrayList.get(i26);
                    c0 c0Var2 = (c0) arrayList8.get(i26);
                    if (!c0Var.b && !c0Var2.b && (Math.abs(c0Var.c - c0Var2.c) > 0.01f || Math.abs(c0Var.e - c0Var2.e) > 0.01f || !TextUtils.equals(c0Var.h.j(), c0Var2.h.j()))) {
                        this.E2 = true;
                        break;
                    }
                }
            }
            if (this.E2) {
                this.N1.addAll(arrayList8);
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
                z9 = true;
            }
        }
        int i29 = q1Var.W1;
        int i30 = this.Y1;
        if (i29 != i30) {
            this.Z1 = i30;
            this.a2 = true;
            z9 = true;
        }
        if (this.B != q1Var.p6) {
            this.C = true;
            q1Var.O2 = null;
            z10 = true;
            z9 = true;
        } else {
            z10 = false;
        }
        if ((this.H != null || q1Var.fa != null) && this.F != q1Var.getRepliesCount()) {
            this.I = this.H;
            this.G = true;
            q1Var.O2 = null;
            z10 = true;
            z9 = true;
        }
        if (this.d2 != null && this.c2 != q1Var.getMessageObject().k.views) {
            this.e2 = this.d2;
            q1Var.O2 = null;
            z10 = true;
            z9 = true;
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
            z9 = true;
        }
        if (!TextUtils.equals(this.f0, q1Var.y5)) {
            this.d0 = true;
            this.e0 = q1Var.g9;
            z9 = true;
        }
        if (this.f1 == q1Var.F9) {
            this.K1 = true;
            this.e2 = null;
        } else {
            if (this.f2 == q1Var.F3()) {
                if (z10 || (Math.abs(q1Var.B9 - this.g1) > 1 && this.F0 == q1Var.X6)) {
                    this.i1 = true;
                    this.X0 = this.Y0;
                    this.h1 = this.g1;
                    this.L = this.M;
                    this.J = this.K;
                    this.E = this.D;
                }
                if (this.h2 != q1Var.E3()) {
                    this.i2 = true;
                }
                if (this.k != q1Var.g3) {
                    this.j = true;
                }
                if (this.k2 != q1Var.yb) {
                    this.l2 = true;
                    z9 = true;
                }
                f10 = this.n2;
                if (f10 != q1Var.t0) {
                    this.m2 = true;
                    this.o2 = f10;
                    z9 = true;
                }
                i7 = this.q2;
                if (i7 != q1Var.p0) {
                    this.s2 = true;
                    this.r2 = i7;
                    z9 = true;
                }
                i10 = this.W2;
                if (i10 != q1Var.P1) {
                    this.V2 = true;
                    this.X2 = i10;
                    z9 = true;
                }
                i11 = this.T2;
                s1Var = q1Var.r0;
                if (i11 != (s1Var == null ? s1Var.r : 0)) {
                    this.Y2 = true;
                    this.U2 = i11;
                    z9 = true;
                }
                if (this.Z2 != (q1Var.getPrimaryMessageObject() == null && q1Var.getPrimaryMessageObject().a3)) {
                    this.a3 = true;
                    z9 = true;
                }
                if (this.R2 != q1Var.f2()) {
                    this.S2 = true;
                    z9 = true;
                }
                if (this.b3 != q1Var.r8) {
                    this.c3 = true;
                    z9 = true;
                }
                hashSet = this.d3;
                ij ijVar5 = q1Var.P5;
                hashSet2 = ijVar5 != null ? ijVar5.I0 : null;
                if (hashSet == null || hashSet2 != null) {
                    if ((hashSet != null ? 0 : hashSet.size()) == (hashSet2 != null ? 0 : hashSet2.size()) || hashSet == null || !hashSet.equals(hashSet2)) {
                        z11 = false;
                        if (!z11) {
                            this.f3 = true;
                            this.e3 = this.d3;
                            z9 = true;
                        }
                        z12 = this.g3;
                        ijVar = q1Var.P5;
                        if (z12 != (ijVar == null && ijVar.J0)) {
                            this.i3 = true;
                            this.h3 = z12;
                            z9 = true;
                        }
                        if (ijVar != null || this.x2 == ijVar.n5()) {
                            i12 = this.I2;
                            if (i12 != q1Var.Ta) {
                                this.G2 = true;
                                this.H2 = i12;
                            }
                            q1Var.U3();
                            if (p0Var.a()) {
                                z9 = true;
                            }
                            if (q1Var.P5.h4()) {
                                float L2 = q1Var.d7 - org.telegram.messenger.g0.L(28 - (q1Var.J ? 2 : 0));
                                if (!p0Var.p) {
                                    L2 -= p0Var.n;
                                }
                                float f17 = this.r;
                                if (L2 != f17) {
                                    this.q = true;
                                    this.s = f17;
                                    z9 = true;
                                }
                            }
                            if (q1Var.P7 != null) {
                                float f18 = q1Var.T7;
                                float f19 = this.t;
                                if (f18 != f19 && f19 != 0.0f) {
                                    this.u = f19;
                                    z9 = true;
                                }
                            }
                            ijVar2 = q1Var.P5;
                            if ((ijVar2 == null && ijVar2.J2) != this.j3 || q1Var.n2 == null || (staticLayout = this.k3) == null) {
                                return z9;
                            }
                            this.l3 = staticLayout;
                            this.m3 = org.telegram.ui.Components.q5.update(0, (View) q1Var, false, this.m3, staticLayout);
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
                        z9 = true;
                        q1Var.U3();
                        if (p0Var.a()) {
                        }
                        if (q1Var.P5.h4()) {
                        }
                        if (q1Var.P7 != null) {
                        }
                        ijVar2 = q1Var.P5;
                        if ((ijVar2 == null && ijVar2.J2) != this.j3) {
                        }
                        return z9;
                    }
                }
                z11 = true;
                if (!z11) {
                }
                z12 = this.g3;
                ijVar = q1Var.P5;
                if (z12 != (ijVar == null && ijVar.J0)) {
                }
                if (ijVar != null) {
                }
                i12 = this.I2;
                if (i12 != q1Var.Ta) {
                }
                q1Var.U3();
                if (p0Var.a()) {
                }
                if (q1Var.P5.h4()) {
                }
                if (q1Var.P7 != null) {
                }
                ijVar2 = q1Var.P5;
                if ((ijVar2 == null && ijVar2.J2) != this.j3) {
                }
                return z9;
            }
            this.U0 = false;
            this.g2 = true;
            this.h1 = this.g1;
            this.W0 = this.j2;
            this.X0 = this.Y0;
        }
        z9 = true;
        if (this.h2 != q1Var.E3()) {
        }
        if (this.k != q1Var.g3) {
        }
        if (this.k2 != q1Var.yb) {
        }
        f10 = this.n2;
        if (f10 != q1Var.t0) {
        }
        i7 = this.q2;
        if (i7 != q1Var.p0) {
        }
        i10 = this.W2;
        if (i10 != q1Var.P1) {
        }
        i11 = this.T2;
        s1Var = q1Var.r0;
        if (i11 != (s1Var == null ? s1Var.r : 0)) {
        }
        if (this.Z2 != (q1Var.getPrimaryMessageObject() == null && q1Var.getPrimaryMessageObject().a3)) {
        }
        if (this.R2 != q1Var.f2()) {
        }
        if (this.b3 != q1Var.r8) {
        }
        hashSet = this.d3;
        ij ijVar52 = q1Var.P5;
        if (ijVar52 != null) {
        }
        if (hashSet == null) {
        }
        if ((hashSet != null ? 0 : hashSet.size()) == (hashSet2 != null ? 0 : hashSet2.size())) {
        }
        z11 = false;
        if (!z11) {
        }
        z12 = this.g3;
        ijVar = q1Var.P5;
        if (z12 != (ijVar == null && ijVar.J0)) {
        }
        if (ijVar != null) {
        }
        i12 = this.I2;
        if (i12 != q1Var.Ta) {
        }
        q1Var.U3();
        if (p0Var.a()) {
        }
        if (q1Var.P5.h4()) {
        }
        if (q1Var.P7 != null) {
        }
        ijVar2 = q1Var.P5;
        if ((ijVar2 == null && ijVar2.J2) != this.j3) {
        }
        return z9;
    }

    public final int b() {
        boolean z9;
        int i7;
        boolean z10;
        q1 q1Var = this.a;
        boolean z11 = true;
        if (!q1Var.P5.P3()) {
            if (!q1Var.P5.o4() && !q1Var.P5.Y2()) {
                z11 = false;
            }
            return (z11 ? 4 : 0) | (q1Var.P5.n4() ? 8 : 0);
        }
        if (q1Var.P5.o4() || q1Var.P5.Y2()) {
            z9 = true;
            i7 = 0;
            z11 = false;
            z10 = false;
        } else if (q1Var.P5.n4()) {
            z10 = true;
            i7 = 0;
            z11 = false;
            z9 = false;
        } else {
            if (q1Var.P5.q4()) {
                ij ijVar = q1Var.P5;
                i7 = (ijVar.p1 || ijVar.F4()) ? 0 : 1;
                z9 = false;
            } else {
                i7 = 0;
                z11 = false;
                z9 = false;
            }
            z10 = z9;
        }
        ij ijVar2 = q1Var.P5;
        if (ijVar2.u1 || ij.b4(ijVar2.k)) {
            i7 = 0;
            z11 = false;
            z9 = false;
        }
        return (z11 ? 2 : 0) | i7 | (z9 ? 4 : 0) | (z10 ? 8 : 0);
    }

    public final void c() {
        l0 l0Var;
        this.w0 = true;
        q1 q1Var = this.a;
        di.z2 z2Var = q1Var.T0;
        ArrayList arrayList = q1Var.H5;
        this.b = z2Var.K0;
        this.c = z2Var.L0;
        this.d = z2Var.M0;
        this.e = z2Var.N0;
        System.arraycopy(z2Var.W0, 0, this.u0, 0, 4);
        org.telegram.ui.ActionBar.u4 u4Var = q1Var.K6;
        if (u4Var != null) {
            this.E0.set(u4Var.getBounds());
        }
        this.F0 = q1Var.X6;
        ij ijVar = q1Var.P5;
        this.J0 = ijVar != null ? ijVar.z2 : null;
        this.K0 = ijVar != null ? ijVar.t2 : 0;
        this.a1 = q1Var.ib;
        this.N0 = ijVar != null ? ijVar.w2 : null;
        this.f = q1Var.r3;
        this.g = q1Var.s3;
        this.d1 = q1Var.l3;
        this.e1 = ijVar != null ? ijVar.K2 : false;
        ArrayList arrayList2 = this.M1;
        arrayList2.clear();
        if (!arrayList.isEmpty()) {
            arrayList2.addAll(arrayList);
        }
        this.v = q1Var.w1;
        this.w = q1Var.f0;
        this.x = q1Var.V;
        this.y = q1Var.d0;
        this.z = q1Var.S != null;
        this.A = q1Var.a0 != null;
        this.H1 = q1Var.V1;
        this.D1 = q1Var.u1;
        this.F1 = q1Var.v1;
        ij ijVar2 = q1Var.P5;
        this.L2 = ijVar2 != null && ijVar2.D == 27 && (l0Var = q1Var.w) != null && l0Var.d();
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
        this.f2 = q1Var.F3();
        this.t2 = q1Var.getTopMediaOffset();
        this.h2 = q1Var.E3();
        this.k = q1Var.g3;
        this.k2 = q1Var.yb;
        this.n2 = q1Var.t0;
        this.q2 = q1Var.p0;
        this.Q1 = q1Var.J5;
        StaticLayout[] staticLayoutArr = q1Var.p9;
        StaticLayout staticLayout = staticLayoutArr[0];
        StaticLayout[] staticLayoutArr2 = this.y2;
        staticLayoutArr2[0] = staticLayout;
        staticLayoutArr2[1] = staticLayoutArr[1];
        ij ijVar3 = q1Var.P5;
        this.x2 = ijVar3 != null && ijVar3.n5();
        this.B2 = q1Var.s9;
        int i7 = q1Var.Ta;
        this.w2 = i7;
        this.I2 = i7;
        this.D2 = q1Var.q9;
        this.j1 = q1Var.getCurrentBackgroundLeft();
        org.telegram.ui.ActionBar.u4 u4Var2 = q1Var.K6;
        if (u4Var2 != null) {
            this.k1 = u4Var2.getBounds().right;
        }
        ij ijVar4 = q1Var.P5;
        this.p2 = ijVar4 != null ? ijVar4.v2 : 0.0f;
        this.Q0 = q1Var.Z7;
        this.F2 = q1Var.Q7;
        this.J2 = q1Var.a8;
        q1Var.N.q();
        if (q1Var.P7 != null) {
            this.t = q1Var.U7;
        } else {
            this.t = 0.0f;
        }
        this.N2 = q1Var.j9;
        this.O2 = q1Var.k9;
        s1 s1Var = q1Var.r0;
        this.T2 = s1Var != null ? s1Var.r : 0;
        this.Z2 = q1Var.getPrimaryMessageObject() != null && q1Var.getPrimaryMessageObject().a3;
        this.R2 = q1Var.f2();
        this.W2 = q1Var.P1;
        this.b3 = q1Var.r8;
        this.d3 = q1Var.getPrimaryMessageObject() != null ? q1Var.getPrimaryMessageObject().I0 : null;
        ij ijVar5 = q1Var.P5;
        this.g3 = ijVar5 != null && ijVar5.J0;
        this.j3 = ijVar5 != null && ijVar5.J2;
        this.k3 = q1Var.n2;
    }

    public final void d() {
        q1 q1Var = this.a;
        StaticLayout[] staticLayoutArr = q1Var.p9;
        StaticLayout staticLayout = staticLayoutArr[0];
        StaticLayout[] staticLayoutArr2 = this.y2;
        staticLayoutArr2[0] = staticLayout;
        staticLayoutArr2[1] = staticLayoutArr[1];
        this.x2 = q1Var.P5.n5();
        this.B2 = q1Var.s9;
        int i7 = q1Var.Ta;
        this.w2 = i7;
        this.I2 = i7;
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
        boolean z9 = this.g0;
        q1 q1Var = this.a;
        if (z9) {
            float f10 = this.p0;
            if (f10 != 0.0f) {
                float f11 = this.q0;
                if (f11 != 0.0f) {
                    q1Var.T0.y0(this.n0, this.o0, f10, f11);
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
        kv kvVar = this.M0;
        if (kvVar != null) {
            kvVar.f(q1Var);
        }
        this.M0 = null;
        this.V0 = null;
        this.W0 = null;
        this.U0 = false;
        this.b1 = false;
        this.D0 = false;
        this.c1 = null;
        org.telegram.ui.Components.q5.release(q1Var, this.P0);
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
        ch.p0 p0Var = q1Var.N;
        ArrayList arrayList = p0Var.s;
        ArrayList arrayList2 = p0Var.t;
        for (int i7 = 0; i7 < arrayList2.size(); i7++) {
            ((ch.m0) arrayList2.get(i7)).b();
        }
        arrayList2.clear();
        p0Var.i = false;
        p0Var.j = false;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            ((ch.m0) arrayList.get(i10)).b = 0;
        }
        this.l3 = null;
        org.telegram.ui.Components.q5.release(q1Var, this.m3);
    }

    public final void f() {
        float max = Math.max(0.0f, Math.min(1.0f, this.L1));
        this.R1 = (float) Math.pow(1.0f - max, 0.5d);
        this.S1 = (float) Math.pow(max, 0.5d);
    }
}
