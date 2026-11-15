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
import org.telegram.messenger.cu;
import org.telegram.messenger.dj;
import org.telegram.messenger.ej;
import org.telegram.messenger.gj;
import org.telegram.messenger.hd;
import org.telegram.messenger.iv;
import org.telegram.ui.Components.hk0;
import org.telegram.ui.Components.my;
import org.telegram.ui.tg0;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
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
    public iv M0;
    public boolean M2;
    public int N;
    public iv N0;
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
    public ej c1;
    public int c2;
    public boolean c3;
    public float d;
    public boolean d0;
    public ej d1;
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
        boolean z10;
        boolean z11;
        float f10;
        int i7;
        int i10;
        int i11;
        s1 s1Var;
        HashSet hashSet;
        HashSet hashSet2;
        boolean z12;
        boolean z13;
        gj gjVar;
        int i12;
        gj gjVar2;
        StaticLayout staticLayout;
        l0 l0Var;
        iv ivVar;
        org.telegram.ui.Components.n5 n5Var;
        boolean z14 = false;
        if (!this.w0) {
            return false;
        }
        this.w1 = false;
        this.G0 = false;
        boolean z15 = this.F0;
        q1 q1Var = this.a;
        boolean z16 = q1Var.Y6;
        ch.q0 q0Var = q1Var.O;
        ArrayList arrayList = q1Var.I5;
        if (z15 != z16) {
            this.G0 = true;
            z10 = true;
        } else {
            z10 = false;
        }
        this.H0 = false;
        gj gjVar3 = q1Var.Q5;
        ArrayList arrayList2 = gjVar3.B2;
        ArrayList arrayList3 = this.J0;
        if (arrayList2 != arrayList3) {
            boolean z17 = gjVar3.v2 == this.K0 || z15 == z16;
            if (arrayList2 != null && arrayList3 != null && arrayList2.size() == this.J0.size()) {
                for (int i13 = 0; i13 < this.J0.size(); i13++) {
                    String charSequence = ((dj) q1Var.Q5.B2.get(i13)).e == null ? null : ((dj) q1Var.Q5.B2.get(i13)).e.getText().toString();
                    String charSequence2 = ((dj) this.J0.get(i13)).e == null ? null : ((dj) this.J0.get(i13)).e.getText().toString();
                    if ((charSequence != null || charSequence2 == null) && ((charSequence == null || charSequence2 != null) && charSequence.equals(charSequence2))) {
                        org.telegram.ui.Components.l5 l5Var = q1Var.Aa;
                        if (l5Var != null) {
                            StaticLayout staticLayout2 = ((dj) q1Var.Q5.B2.get(i13)).e;
                            StaticLayout staticLayout3 = ((dj) this.J0.get(i13)).e;
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
                    this.P0 = org.telegram.ui.Components.p5.update(0, (View) q1Var, this.P0, (ArrayList<dj>) arrayList5, true);
                    q1Var.Aa = org.telegram.ui.Components.p5.update(0, q1Var, q1Var.Aa, (ArrayList<dj>) q1Var.Q5.B2);
                    z10 = true;
                } else {
                    q1Var.Aa = org.telegram.ui.Components.p5.update(0, q1Var, q1Var.Aa, (ArrayList<dj>) q1Var.Q5.B2);
                }
            }
            z17 = false;
            if (z17) {
            }
        }
        iv ivVar2 = q1Var.Q5.y2;
        if (ivVar2 != null && (ivVar2.s || ivVar2.u)) {
            this.w1 = true;
            z10 = true;
        }
        this.L0 = false;
        if (ivVar2 != this.N0) {
            tg0 tg0Var = q1Var.Ac;
            boolean z18 = tg0Var != null && tg0Var.h;
            iv ivVar3 = this.M0;
            if (ivVar3 != null) {
                ivVar3.f(q1Var);
                this.M0 = null;
            }
            if (z18) {
                iv ivVar4 = q1Var.Q5.y2;
                if (ivVar4 != null && (ivVar = this.N0) != null) {
                    ivVar4.J(ivVar);
                }
            } else {
                iv ivVar5 = q1Var.Q5.y2;
                if (ivVar5 != null) {
                    iv ivVar6 = this.N0;
                    ArrayList arrayList6 = ivVar5.g;
                    if (ivVar6 != null) {
                        ArrayList arrayList7 = ivVar6.g;
                        if (arrayList6.size() == 1 && arrayList7.size() == 1) {
                            cu cuVar = (cu) arrayList6.get(0);
                            cu cuVar2 = (cu) arrayList7.get(0);
                            boolean z19 = (cuVar instanceof hk0) && (cuVar2 instanceof hk0) && TextUtils.equals(((hk0) cuVar).X.url, ((hk0) cuVar2).X.url);
                        }
                    }
                }
                this.L0 = true;
                iv ivVar7 = this.N0;
                this.M0 = ivVar7;
                if (ivVar7 != null) {
                    ivVar7.b(q1Var);
                }
            }
        }
        this.P2 = false;
        if (q1Var.k9 != this.N2) {
            this.P2 = true;
            z10 = true;
        }
        this.Q2 = false;
        if (q1Var.l9 != this.O2) {
            this.Q2 = true;
            z10 = true;
        }
        StaticLayout staticLayout4 = q1Var.R7;
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
        boolean z20 = q1Var.jb;
        if (z20 && !this.a1 && q1Var.z9 != null) {
            String M0 = hd.M0(2131751210, "EditedMessage");
            CharSequence text2 = q1Var.z9.getText();
            int indexOf = text2.toString().indexOf(M0);
            if (indexOf >= 0) {
                if (indexOf == 0) {
                    TextPaint textPaint = org.telegram.ui.ActionBar.j6.T2;
                    int L = org.telegram.messenger.g0.L(100.0f) + q1Var.B9;
                    Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
                    this.V0 = new StaticLayout(M0, textPaint, L, alignment, 1.0f, 0.0f, false);
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) M0);
                    spannableStringBuilder.append(text2.subSequence(M0.length(), text2.length()));
                    spannableStringBuilder.setSpan(new my(z14), 0, M0.length(), 0);
                    this.W0 = new StaticLayout(spannableStringBuilder, org.telegram.ui.ActionBar.j6.T2, org.telegram.messenger.g0.L(100.0f) + q1Var.B9, alignment, 1.0f, 0.0f, false);
                    this.Z0 = q1Var.A9 - this.Y0;
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
            q1Var.P2 = null;
        } else if (!z20 && this.a1 && q1Var.z9 != null) {
            this.W0 = this.j2;
            int i15 = q1Var.A9;
            int i16 = this.Y0;
            this.Z0 = i15 - i16;
            this.U0 = true;
            this.X0 = i16;
            this.h1 = this.g1;
            this.i1 = true;
            z10 = true;
        }
        this.m1 = false;
        if (q1Var.I6 != this.l1) {
            this.m1 = true;
            z10 = true;
        }
        this.t1 = false;
        if (q1Var.x1 != this.v) {
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
        if ((q1Var.Q5.D == 27 && (l0Var = q1Var.w) != null && l0Var.d()) != this.L2) {
            this.M2 = true;
            z10 = true;
        }
        this.E1 = false;
        if (q1Var.v1 != this.D1) {
            this.E1 = true;
            z10 = true;
        }
        this.G1 = false;
        if (q1Var.w1 != this.F1) {
            this.G1 = true;
            z10 = true;
        }
        this.J1 = false;
        if (q1Var.R1) {
            int i23 = q1Var.W1;
            int i24 = this.H1;
            if (i23 != i24) {
                this.J1 = true;
                this.I1 = i24;
                z10 = true;
            }
        }
        this.o1 = false;
        if (q1Var.I4 != this.n1) {
            this.o1 = true;
            z10 = true;
        }
        gj gjVar4 = q1Var.Q5;
        boolean z21 = gjVar4 != null ? gjVar4.M2 : false;
        ej ejVar = q1Var.m3;
        ej ejVar2 = this.d1;
        if (ejVar != ejVar2) {
            String charSequence3 = ejVar2 == null ? null : ejVar2.a.toString();
            ej ejVar3 = q1Var.m3;
            String charSequence4 = ejVar3 == null ? null : ejVar3.a.toString();
            if (this.F0 != q1Var.Y6 || this.e1 != z21) {
                ej ejVar4 = q1Var.m3;
                int i25 = ejVar4 == null ? 0 : ejVar4.c;
                ej ejVar5 = this.d1;
            }
            if ((charSequence4 == null) == (charSequence3 == null) && (charSequence3 == null || charSequence3.equals(charSequence4))) {
                q1Var.Q3();
                float f13 = this.f;
                if (f13 != q1Var.s3 || this.g != q1Var.t3) {
                    this.t0 = true;
                    this.r0 = f13;
                    this.s0 = this.g;
                    z10 = true;
                }
            }
            this.b1 = true;
            ej ejVar6 = this.d1;
            this.c1 = ejVar6;
            this.P0 = org.telegram.ui.Components.p5.update(0, q1Var, (org.telegram.ui.Components.l5) null, (ArrayList<dj>) (ejVar6 == null ? null : ejVar6.e));
            org.telegram.ui.Components.l5 l5Var2 = q1Var.Aa;
            ej ejVar7 = q1Var.m3;
            q1Var.Aa = org.telegram.ui.Components.p5.update(0, q1Var, l5Var2, (ArrayList<dj>) (ejVar7 == null ? null : ejVar7.e));
            if (this.F0 != q1Var.Y6 || this.e1 != z21) {
                this.t0 = true;
                this.r0 = this.f;
                this.s0 = this.g;
            }
            z10 = true;
        } else if (ejVar != null && ejVar2 != null) {
            q1Var.Q3();
            float f14 = this.f;
            if (f14 != q1Var.s3 || this.g != q1Var.t3) {
                this.t0 = true;
                this.r0 = f14;
                this.s0 = this.g;
                z10 = true;
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
        if (i27 != q1Var.K5) {
            this.P1 = i27;
            this.O1 = true;
        }
        int i28 = q1Var.M1;
        if (i28 == 5 || i28 == 3 || i28 == 1) {
            float f15 = q1Var.K3;
            float f16 = this.T1;
            if (f15 != f16 || q1Var.L3 != this.U1) {
                this.V1 = f16;
                this.W1 = this.U1;
                this.X1 = true;
                z10 = true;
            }
        }
        int i29 = q1Var.X1;
        int i30 = this.Y1;
        if (i29 != i30) {
            this.Z1 = i30;
            this.a2 = true;
            z10 = true;
        }
        if (this.B != q1Var.q6) {
            this.C = true;
            q1Var.P2 = null;
            z11 = true;
            z10 = true;
        } else {
            z11 = false;
        }
        if ((this.H != null || q1Var.ga != null) && this.F != q1Var.getRepliesCount()) {
            this.I = this.H;
            this.G = true;
            q1Var.P2 = null;
            z11 = true;
            z10 = true;
        }
        if (this.d2 != null && this.c2 != q1Var.getMessageObject().k.views) {
            this.e2 = this.d2;
            q1Var.P2 = null;
            z11 = true;
            z10 = true;
        }
        if (q1Var.n7 != null && this.N != q1Var.getRepliesCount()) {
            StaticLayout staticLayout7 = this.U;
            if (staticLayout7 == null || TextUtils.equals(staticLayout7.getText(), q1Var.n7.getText())) {
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
        if (!TextUtils.equals(this.f0, q1Var.z5)) {
            this.d0 = true;
            this.e0 = q1Var.h9;
            z10 = true;
        }
        if (this.f1 == q1Var.G9) {
            this.K1 = true;
            this.e2 = null;
        } else {
            if (this.f2 == q1Var.G3()) {
                if (z11 || (Math.abs(q1Var.C9 - this.g1) > 1 && this.F0 == q1Var.Y6)) {
                    this.i1 = true;
                    this.X0 = this.Y0;
                    this.h1 = this.g1;
                    this.L = this.M;
                    this.J = this.K;
                    this.E = this.D;
                }
                if (this.h2 != q1Var.F3()) {
                    this.i2 = true;
                }
                if (this.k != q1Var.h3) {
                    this.j = true;
                }
                if (this.k2 != q1Var.zb) {
                    this.l2 = true;
                    z10 = true;
                }
                f10 = this.n2;
                if (f10 != q1Var.u0) {
                    this.m2 = true;
                    this.o2 = f10;
                    z10 = true;
                }
                i7 = this.q2;
                if (i7 != q1Var.q0) {
                    this.s2 = true;
                    this.r2 = i7;
                    z10 = true;
                }
                i10 = this.W2;
                if (i10 != q1Var.Q1) {
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
                if (this.Z2 != (q1Var.getPrimaryMessageObject() == null && q1Var.getPrimaryMessageObject().c3)) {
                    this.a3 = true;
                    z10 = true;
                }
                if (this.R2 != q1Var.g2()) {
                    this.S2 = true;
                    z10 = true;
                }
                if (this.b3 != q1Var.s8) {
                    this.c3 = true;
                    z10 = true;
                }
                hashSet = this.d3;
                gj gjVar5 = q1Var.Q5;
                hashSet2 = gjVar5 != null ? gjVar5.K0 : null;
                if (hashSet == null || hashSet2 != null) {
                    if ((hashSet != null ? 0 : hashSet.size()) == (hashSet2 != null ? 0 : hashSet2.size()) || hashSet == null || !hashSet.equals(hashSet2)) {
                        z12 = false;
                        if (!z12) {
                            this.f3 = true;
                            this.e3 = this.d3;
                            z10 = true;
                        }
                        z13 = this.g3;
                        gjVar = q1Var.Q5;
                        if (z13 != (gjVar == null && gjVar.L0)) {
                            this.i3 = true;
                            this.h3 = z13;
                            z10 = true;
                        }
                        if (gjVar != null || this.x2 == gjVar.n5()) {
                            i12 = this.I2;
                            if (i12 != q1Var.Ua) {
                                this.G2 = true;
                                this.H2 = i12;
                            }
                            q1Var.V3();
                            if (q0Var.a()) {
                                z10 = true;
                            }
                            if (q1Var.Q5.h4()) {
                                float L2 = q1Var.e7 - org.telegram.messenger.g0.L(28 - (q1Var.K ? 2 : 0));
                                if (!q0Var.p) {
                                    L2 -= q0Var.n;
                                }
                                float f17 = this.r;
                                if (L2 != f17) {
                                    this.q = true;
                                    this.s = f17;
                                    z10 = true;
                                }
                            }
                            if (q1Var.Q7 != null) {
                                float f18 = q1Var.U7;
                                float f19 = this.t;
                                if (f18 != f19 && f19 != 0.0f) {
                                    this.u = f19;
                                    z10 = true;
                                }
                            }
                            gjVar2 = q1Var.Q5;
                            if ((gjVar2 == null && gjVar2.L2) != this.j3 || q1Var.o2 == null || (staticLayout = this.k3) == null) {
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
                        q1Var.V3();
                        if (q0Var.a()) {
                        }
                        if (q1Var.Q5.h4()) {
                        }
                        if (q1Var.Q7 != null) {
                        }
                        gjVar2 = q1Var.Q5;
                        if ((gjVar2 == null && gjVar2.L2) != this.j3) {
                        }
                        return z10;
                    }
                }
                z12 = true;
                if (!z12) {
                }
                z13 = this.g3;
                gjVar = q1Var.Q5;
                if (z13 != (gjVar == null && gjVar.L0)) {
                }
                if (gjVar != null) {
                }
                i12 = this.I2;
                if (i12 != q1Var.Ua) {
                }
                q1Var.V3();
                if (q0Var.a()) {
                }
                if (q1Var.Q5.h4()) {
                }
                if (q1Var.Q7 != null) {
                }
                gjVar2 = q1Var.Q5;
                if ((gjVar2 == null && gjVar2.L2) != this.j3) {
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
        if (this.h2 != q1Var.F3()) {
        }
        if (this.k != q1Var.h3) {
        }
        if (this.k2 != q1Var.zb) {
        }
        f10 = this.n2;
        if (f10 != q1Var.u0) {
        }
        i7 = this.q2;
        if (i7 != q1Var.q0) {
        }
        i10 = this.W2;
        if (i10 != q1Var.Q1) {
        }
        i11 = this.T2;
        s1Var = q1Var.s0;
        if (i11 != (s1Var == null ? s1Var.r : 0)) {
        }
        if (this.Z2 != (q1Var.getPrimaryMessageObject() == null && q1Var.getPrimaryMessageObject().c3)) {
        }
        if (this.R2 != q1Var.g2()) {
        }
        if (this.b3 != q1Var.s8) {
        }
        hashSet = this.d3;
        gj gjVar52 = q1Var.Q5;
        if (gjVar52 != null) {
        }
        if (hashSet == null) {
        }
        if ((hashSet != null ? 0 : hashSet.size()) == (hashSet2 != null ? 0 : hashSet2.size())) {
        }
        z12 = false;
        if (!z12) {
        }
        z13 = this.g3;
        gjVar = q1Var.Q5;
        if (z13 != (gjVar == null && gjVar.L0)) {
        }
        if (gjVar != null) {
        }
        i12 = this.I2;
        if (i12 != q1Var.Ua) {
        }
        q1Var.V3();
        if (q0Var.a()) {
        }
        if (q1Var.Q5.h4()) {
        }
        if (q1Var.Q7 != null) {
        }
        gjVar2 = q1Var.Q5;
        if ((gjVar2 == null && gjVar2.L2) != this.j3) {
        }
        return z10;
    }

    public final int b() {
        boolean z10;
        int i7;
        boolean z11;
        q1 q1Var = this.a;
        boolean z12 = true;
        if (!q1Var.Q5.P3()) {
            if (!q1Var.Q5.o4() && !q1Var.Q5.Y2()) {
                z12 = false;
            }
            return (z12 ? 4 : 0) | (q1Var.Q5.n4() ? 8 : 0);
        }
        if (q1Var.Q5.o4() || q1Var.Q5.Y2()) {
            z10 = true;
            i7 = 0;
            z12 = false;
            z11 = false;
        } else if (q1Var.Q5.n4()) {
            z11 = true;
            i7 = 0;
            z12 = false;
            z10 = false;
        } else {
            if (q1Var.Q5.q4()) {
                gj gjVar = q1Var.Q5;
                i7 = (gjVar.r1 || gjVar.F4()) ? 0 : 1;
                z10 = false;
            } else {
                i7 = 0;
                z12 = false;
                z10 = false;
            }
            z11 = z10;
        }
        gj gjVar2 = q1Var.Q5;
        if (gjVar2.w1 || gj.b4(gjVar2.k)) {
            i7 = 0;
            z12 = false;
            z10 = false;
        }
        return (z12 ? 2 : 0) | i7 | (z10 ? 4 : 0) | (z11 ? 8 : 0);
    }

    public final void c() {
        l0 l0Var;
        this.w0 = true;
        q1 q1Var = this.a;
        fi.u2 u2Var = q1Var.U0;
        ArrayList arrayList = q1Var.I5;
        this.b = u2Var.L0;
        this.c = u2Var.M0;
        this.d = u2Var.N0;
        this.e = u2Var.O0;
        System.arraycopy(u2Var.X0, 0, this.u0, 0, 4);
        org.telegram.ui.ActionBar.r4 r4Var = q1Var.L6;
        if (r4Var != null) {
            this.E0.set(r4Var.getBounds());
        }
        this.F0 = q1Var.Y6;
        gj gjVar = q1Var.Q5;
        this.J0 = gjVar != null ? gjVar.B2 : null;
        this.K0 = gjVar != null ? gjVar.v2 : 0;
        this.a1 = q1Var.jb;
        this.N0 = gjVar != null ? gjVar.y2 : null;
        this.f = q1Var.s3;
        this.g = q1Var.t3;
        this.d1 = q1Var.m3;
        this.e1 = gjVar != null ? gjVar.M2 : false;
        ArrayList arrayList2 = this.M1;
        arrayList2.clear();
        if (!arrayList.isEmpty()) {
            arrayList2.addAll(arrayList);
        }
        this.v = q1Var.x1;
        this.w = q1Var.g0;
        this.x = q1Var.W;
        this.y = q1Var.e0;
        this.z = q1Var.T != null;
        this.A = q1Var.b0 != null;
        this.H1 = q1Var.W1;
        this.D1 = q1Var.v1;
        this.F1 = q1Var.w1;
        gj gjVar2 = q1Var.Q5;
        this.L2 = gjVar2 != null && gjVar2.D == 27 && (l0Var = q1Var.w) != null && l0Var.d();
        if (q1Var.n7 != null) {
            this.N = q1Var.getRepliesCount();
            this.O = q1Var.v7;
            this.U = q1Var.n7;
            this.P = q1Var.q7;
            this.Q = q1Var.r7;
            this.R = q1Var.s7;
            this.S = q1Var.u7;
            this.T = q1Var.p7;
        }
        this.F = q1Var.getRepliesCount();
        this.c2 = q1Var.getMessageObject().k.views;
        this.H = q1Var.ga;
        this.d2 = q1Var.da;
        this.B = q1Var.q6;
        this.f0 = q1Var.z5;
        this.l1 = q1Var.I6;
        this.n1 = q1Var.I4;
        this.T1 = q1Var.K3;
        this.U1 = q1Var.L3;
        this.Y1 = q1Var.X1;
        this.f1 = !q1Var.G9;
        this.g1 = q1Var.C9;
        this.j2 = q1Var.z9;
        this.Y0 = q1Var.A9;
        this.f2 = q1Var.G3();
        this.t2 = q1Var.getTopMediaOffset();
        this.h2 = q1Var.F3();
        this.k = q1Var.h3;
        this.k2 = q1Var.zb;
        this.n2 = q1Var.u0;
        this.q2 = q1Var.q0;
        this.Q1 = q1Var.K5;
        StaticLayout[] staticLayoutArr = q1Var.q9;
        StaticLayout staticLayout = staticLayoutArr[0];
        StaticLayout[] staticLayoutArr2 = this.y2;
        staticLayoutArr2[0] = staticLayout;
        staticLayoutArr2[1] = staticLayoutArr[1];
        gj gjVar3 = q1Var.Q5;
        this.x2 = gjVar3 != null && gjVar3.n5();
        this.B2 = q1Var.t9;
        int i7 = q1Var.Ua;
        this.w2 = i7;
        this.I2 = i7;
        this.D2 = q1Var.r9;
        this.j1 = q1Var.getCurrentBackgroundLeft();
        org.telegram.ui.ActionBar.r4 r4Var2 = q1Var.L6;
        if (r4Var2 != null) {
            this.k1 = r4Var2.getBounds().right;
        }
        gj gjVar4 = q1Var.Q5;
        this.p2 = gjVar4 != null ? gjVar4.x2 : 0.0f;
        this.Q0 = q1Var.a8;
        this.F2 = q1Var.R7;
        this.J2 = q1Var.b8;
        q1Var.O.q();
        if (q1Var.Q7 != null) {
            this.t = q1Var.V7;
        } else {
            this.t = 0.0f;
        }
        this.N2 = q1Var.k9;
        this.O2 = q1Var.l9;
        s1 s1Var = q1Var.s0;
        this.T2 = s1Var != null ? s1Var.r : 0;
        this.Z2 = q1Var.getPrimaryMessageObject() != null && q1Var.getPrimaryMessageObject().c3;
        this.R2 = q1Var.g2();
        this.W2 = q1Var.Q1;
        this.b3 = q1Var.s8;
        this.d3 = q1Var.getPrimaryMessageObject() != null ? q1Var.getPrimaryMessageObject().K0 : null;
        gj gjVar5 = q1Var.Q5;
        this.g3 = gjVar5 != null && gjVar5.L0;
        this.j3 = gjVar5 != null && gjVar5.L2;
        this.k3 = q1Var.o2;
    }

    public final void d() {
        q1 q1Var = this.a;
        StaticLayout[] staticLayoutArr = q1Var.q9;
        StaticLayout staticLayout = staticLayoutArr[0];
        StaticLayout[] staticLayoutArr2 = this.y2;
        staticLayoutArr2[0] = staticLayout;
        staticLayoutArr2[1] = staticLayoutArr[1];
        this.x2 = q1Var.Q5.n5();
        this.B2 = q1Var.t9;
        int i7 = q1Var.Ua;
        this.w2 = i7;
        this.I2 = i7;
        this.D2 = q1Var.r9;
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
        iv ivVar = this.M0;
        if (ivVar != null) {
            ivVar.f(q1Var);
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
        ch.q0 q0Var = q1Var.O;
        ArrayList arrayList = q0Var.s;
        ArrayList arrayList2 = q0Var.t;
        for (int i7 = 0; i7 < arrayList2.size(); i7++) {
            ((ch.n0) arrayList2.get(i7)).b();
        }
        arrayList2.clear();
        q0Var.i = false;
        q0Var.j = false;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            ((ch.n0) arrayList.get(i10)).b = 0;
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
