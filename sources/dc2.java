// default package

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

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class dc2 {
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
    public hl9 M0;
    public boolean M2;
    public int N;
    public hl9 N0;
    public boolean N2;
    public int O;
    public float O0;
    public boolean O1;
    public boolean O2;
    public int P;
    public dm P0;
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
    public dm T0;
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
    public final wb2 a;
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
    public p47 c1;
    public int c2;
    public boolean c3;
    public float d;
    public boolean d0;
    public p47 d1;
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
    public dm m3;
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

    public dc2(wb2 wb2Var) {
        this.a = wb2Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:432:0x03aa, code lost:
    
        if (r6 == (r11 == null ? 0 : r11.c)) goto L212;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0187, code lost:
    
        if (android.text.TextUtils.equals(((nm9) r1).X.url, ((nm9) r3).X.url) != false) goto L95;
     */
    /* JADX WARN: Removed duplicated region for block: B:257:0x05cd  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x05d5  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x05dd  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x05e9  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x05f4  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x05ff  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x060a  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0610  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x062a  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x0635  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x063e  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x0647  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x064b  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x0655  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x0657  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x0672  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x067b  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x0682  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x06ba  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x06c3  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x06ec  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x0701  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x070c  */
    /* JADX WARN: Removed duplicated region for block: B:356:0x06ac  */
    /* JADX WARN: Removed duplicated region for block: B:358:0x064f  */
    /* JADX WARN: Removed duplicated region for block: B:360:0x060d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00e1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0104  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a() {
        boolean z;
        boolean z2;
        float f;
        int i;
        int i2;
        int i3;
        yb2 yb2Var;
        HashSet hashSet;
        HashSet hashSet2;
        int size;
        boolean z3;
        r47 r47Var;
        int i4;
        r47 r47Var2;
        StaticLayout staticLayout;
        mj1 mj1Var;
        hl9 hl9Var;
        fm fmVar;
        wb2 wb2Var = this.a;
        x49 x49Var = wb2Var.O;
        ArrayList arrayList = wb2Var.I5;
        if (!this.w0) {
            return false;
        }
        this.w1 = false;
        this.G0 = false;
        boolean z4 = this.F0;
        boolean z5 = wb2Var.Y6;
        byte b = 1;
        if (z4 != z5) {
            this.G0 = true;
            z = true;
        } else {
            z = false;
        }
        this.H0 = false;
        r47 r47Var3 = wb2Var.Q5;
        ArrayList arrayList2 = r47Var3.B2;
        ArrayList arrayList3 = this.J0;
        if (arrayList2 != arrayList3) {
            boolean z6 = r47Var3.v2 == this.K0 || z4 == z5;
            if (arrayList2 != null && arrayList3 != null && arrayList2.size() == this.J0.size()) {
                for (int i5 = 0; i5 < this.J0.size(); i5++) {
                    String charSequence = ((o47) wb2Var.Q5.B2.get(i5)).e == null ? null : ((o47) wb2Var.Q5.B2.get(i5)).e.getText().toString();
                    String charSequence2 = ((o47) this.J0.get(i5)).e == null ? null : ((o47) this.J0.get(i5)).e.getText().toString();
                    if (charSequence == null) {
                        if (charSequence2 != null) {
                        }
                        if (!charSequence.equals(charSequence2)) {
                            dm dmVar = wb2Var.Ma;
                            if (dmVar != null) {
                                StaticLayout staticLayout2 = ((o47) wb2Var.Q5.B2.get(i5)).e;
                                StaticLayout staticLayout3 = ((o47) this.J0.get(i5)).e;
                                HashMap hashMap = dmVar.b;
                                if (staticLayout3 != null && (fmVar = (fm) hashMap.remove(staticLayout3)) != null) {
                                    ArrayList arrayList4 = fmVar.b;
                                    fmVar.a = staticLayout2;
                                    for (int i6 = 0; i6 < arrayList4.size(); i6++) {
                                        ((cm) arrayList4.get(i6)).c = staticLayout2;
                                    }
                                    hashMap.put(staticLayout2, fmVar);
                                }
                            }
                        }
                    } else {
                        if (charSequence2 == null) {
                        }
                        if (!charSequence.equals(charSequence2)) {
                        }
                    }
                }
                if (z6) {
                    this.H0 = true;
                    ArrayList arrayList5 = this.J0;
                    this.I0 = arrayList5;
                    this.O0 = this.p2;
                    this.P0 = hm.update(0, (View) wb2Var, this.P0, (ArrayList<o47>) arrayList5, true);
                    wb2Var.Ma = hm.update(0, wb2Var, wb2Var.Ma, (ArrayList<o47>) wb2Var.Q5.B2);
                    z = true;
                } else {
                    wb2Var.Ma = hm.update(0, wb2Var, wb2Var.Ma, (ArrayList<o47>) wb2Var.Q5.B2);
                }
            }
            z6 = false;
            if (z6) {
            }
        }
        hl9 hl9Var2 = wb2Var.Q5.y2;
        if (hl9Var2 != null && (hl9Var2.s || hl9Var2.u)) {
            this.w1 = true;
            z = true;
        }
        this.L0 = false;
        if (hl9Var2 != this.N0) {
            ui7 ui7Var = wb2Var.Mc;
            boolean z7 = ui7Var != null && ui7Var.h;
            hl9 hl9Var3 = this.M0;
            if (hl9Var3 != null) {
                hl9Var3.f(wb2Var);
                this.M0 = null;
            }
            r47 r47Var4 = wb2Var.Q5;
            if (z7) {
                hl9 hl9Var4 = r47Var4.y2;
                if (hl9Var4 != null && (hl9Var = this.N0) != null) {
                    hl9Var4.I(hl9Var);
                }
            } else {
                hl9 hl9Var5 = r47Var4.y2;
                if (hl9Var5 != null) {
                    hl9 hl9Var6 = this.N0;
                    ArrayList arrayList6 = hl9Var5.g;
                    if (hl9Var6 != null) {
                        ArrayList arrayList7 = hl9Var6.g;
                        if (arrayList6.size() == 1 && arrayList7.size() == 1) {
                            dk9 dk9Var = (dk9) arrayList6.get(0);
                            dk9 dk9Var2 = (dk9) arrayList7.get(0);
                            if (dk9Var instanceof nm9) {
                                if (dk9Var2 instanceof nm9) {
                                }
                            }
                        }
                    }
                }
                this.L0 = true;
                hl9 hl9Var7 = this.N0;
                this.M0 = hl9Var7;
                if (hl9Var7 != null) {
                    hl9Var7.b(wb2Var);
                }
            }
        }
        this.P2 = false;
        if (wb2Var.w9 != this.N2) {
            this.P2 = true;
            z = true;
        }
        this.Q2 = false;
        if (wb2Var.x9 != this.O2) {
            this.Q2 = true;
            z = true;
        }
        StaticLayout staticLayout4 = wb2Var.R7;
        if (staticLayout4 != this.F2) {
            CharSequence text = staticLayout4 != null ? staticLayout4.getText() : null;
            StaticLayout staticLayout5 = this.F2;
            if (!TextUtils.equals(text, staticLayout5 != null ? staticLayout5.getText() : null)) {
                this.R0 = this.Q0;
                StaticLayout staticLayout6 = this.F2;
                this.S0 = staticLayout6;
                this.K2 = this.J2;
                this.T0 = hm.update(0, (View) wb2Var, false, this.T0, true, staticLayout6);
                z = true;
            }
        }
        boolean z8 = wb2Var.vb;
        if (z8 && !this.a1 && wb2Var.L9 != null) {
            String M0 = ob6.M0(2131751175, "EditedMessage");
            CharSequence text2 = wb2Var.L9.getText();
            int indexOf = text2.toString().indexOf(M0);
            if (indexOf >= 0) {
                if (indexOf == 0) {
                    TextPaint textPaint = aob.T2;
                    int L = hl.L(100.0f) + wb2Var.N9;
                    Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
                    this.V0 = new StaticLayout(M0, textPaint, L, alignment, 1.0f, 0.0f, false);
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) M0);
                    spannableStringBuilder.append(text2.subSequence(M0.length(), text2.length()));
                    spannableStringBuilder.setSpan(new fy2(b), 0, M0.length(), 0);
                    this.W0 = new StaticLayout(spannableStringBuilder, aob.T2, hl.L(100.0f) + wb2Var.N9, alignment, 1.0f, 0.0f, false);
                    this.Z0 = wb2Var.M9 - this.Y0;
                } else {
                    this.Z0 = 0;
                    this.V0 = null;
                    this.W0 = this.j2;
                }
                this.U0 = true;
                this.X0 = this.Y0;
                this.h1 = this.g1;
                this.i1 = true;
                z = true;
            }
            wb2Var.P2 = null;
        } else if (!z8 && this.a1 && wb2Var.L9 != null) {
            this.W0 = this.j2;
            int i7 = wb2Var.M9;
            int i8 = this.Y0;
            this.Z0 = i7 - i8;
            this.U0 = true;
            this.X0 = i8;
            this.h1 = this.g1;
            this.i1 = true;
            z = true;
        }
        this.m1 = false;
        if (wb2Var.I6 != this.l1) {
            this.m1 = true;
            z = true;
        }
        this.t1 = false;
        if (wb2Var.x1 != this.v) {
            this.t1 = true;
            float f2 = this.d;
            this.p1 = f2;
            float f3 = this.e;
            this.q1 = f3;
            this.r1 = (f2 / 2.0f) + this.b;
            this.s1 = (f3 / 2.0f) + this.c;
            z = true;
        }
        this.v1 = false;
        int i9 = wb2Var.g0;
        int i10 = this.w;
        if (i9 != i10) {
            this.w1 = true;
            this.u1 = i10;
            this.v1 = true;
            z = true;
        }
        this.z1 = false;
        int i11 = wb2Var.W;
        int i12 = this.x;
        if (i11 != i12) {
            this.y1 = i12;
            this.z1 = true;
            z = true;
        }
        this.x1 = false;
        if ((wb2Var.T != null) != this.z) {
            this.x1 = true;
            z = true;
        }
        this.C1 = false;
        int i13 = wb2Var.e0;
        int i14 = this.y;
        if (i13 != i14) {
            this.B1 = i14;
            this.C1 = true;
            z = true;
        }
        this.A1 = false;
        if ((wb2Var.b0 != null) != this.A) {
            this.A1 = true;
            z = true;
        }
        this.M2 = false;
        if ((wb2Var.Q5.D == 27 && (mj1Var = wb2Var.w) != null && mj1Var.d()) != this.L2) {
            this.M2 = true;
            z = true;
        }
        this.E1 = false;
        if (wb2Var.v1 != this.D1) {
            this.E1 = true;
            z = true;
        }
        this.G1 = false;
        if (wb2Var.w1 != this.F1) {
            this.G1 = true;
            z = true;
        }
        this.J1 = false;
        if (wb2Var.R1) {
            int i15 = wb2Var.W1;
            int i16 = this.H1;
            if (i15 != i16) {
                this.J1 = true;
                this.I1 = i16;
                z = true;
            }
        }
        this.o1 = false;
        if (wb2Var.I4 != this.n1) {
            this.o1 = true;
            z = true;
        }
        r47 r47Var5 = wb2Var.Q5;
        boolean z9 = r47Var5 != null ? r47Var5.M2 : false;
        p47 p47Var = wb2Var.m3;
        p47 p47Var2 = this.d1;
        if (p47Var != p47Var2) {
            String charSequence3 = p47Var2 == null ? null : p47Var2.a.toString();
            p47 p47Var3 = wb2Var.m3;
            String charSequence4 = p47Var3 == null ? null : p47Var3.a.toString();
            if (this.F0 != wb2Var.Y6 || this.e1 != z9) {
                p47 p47Var4 = wb2Var.m3;
                int i17 = p47Var4 == null ? 0 : p47Var4.c;
                p47 p47Var5 = this.d1;
            }
            if ((charSequence4 == null) == (charSequence3 == null) && (charSequence3 == null || charSequence3.equals(charSequence4))) {
                wb2Var.S3();
                float f4 = this.f;
                if (f4 != wb2Var.s3 || this.g != wb2Var.t3) {
                    this.t0 = true;
                    this.r0 = f4;
                    this.s0 = this.g;
                    z = true;
                }
            }
            this.b1 = true;
            p47 p47Var6 = this.d1;
            this.c1 = p47Var6;
            this.P0 = hm.update(0, wb2Var, (dm) null, (ArrayList<o47>) (p47Var6 == null ? null : p47Var6.e));
            dm dmVar2 = wb2Var.Ma;
            p47 p47Var7 = wb2Var.m3;
            wb2Var.Ma = hm.update(0, wb2Var, dmVar2, (ArrayList<o47>) (p47Var7 == null ? null : p47Var7.e));
            if (this.F0 != wb2Var.Y6 || this.e1 != z9) {
                this.t0 = true;
                this.r0 = this.f;
                this.s0 = this.g;
            }
            z = true;
        } else if (p47Var != null && p47Var2 != null) {
            wb2Var.S3();
            float f5 = this.f;
            if (f5 != wb2Var.s3 || this.g != wb2Var.t3) {
                this.t0 = true;
                this.r0 = f5;
                this.s0 = this.g;
                z = true;
            }
        }
        ArrayList arrayList8 = this.M1;
        if (!arrayList8.isEmpty() || !arrayList.isEmpty()) {
            if (arrayList8.size() != arrayList.size()) {
                this.E2 = true;
            }
            if (!this.E2) {
                for (int i18 = 0; i18 < arrayList.size(); i18++) {
                    wo0 wo0Var = (wo0) arrayList.get(i18);
                    wo0 wo0Var2 = (wo0) arrayList8.get(i18);
                    if (!wo0Var.b && !wo0Var2.b && (Math.abs(wo0Var.c - wo0Var2.c) > 0.01f || Math.abs(wo0Var.e - wo0Var2.e) > 0.01f || !TextUtils.equals(wo0Var.h.i(), wo0Var2.h.i()))) {
                        this.E2 = true;
                        break;
                    }
                }
            }
            if (this.E2) {
                this.N1.addAll(arrayList8);
            }
        }
        int i19 = this.Q1;
        if (i19 != wb2Var.K5) {
            this.P1 = i19;
            this.O1 = true;
        }
        byte b2 = wb2Var.M1;
        if (b2 == 5 || b2 == 3 || b2 == 1) {
            float f6 = wb2Var.K3;
            float f7 = this.T1;
            if (f6 != f7 || wb2Var.L3 != this.U1) {
                this.V1 = f7;
                this.W1 = this.U1;
                this.X1 = true;
                z = true;
            }
        }
        int i20 = wb2Var.X1;
        int i21 = this.Y1;
        if (i20 != i21) {
            this.Z1 = i21;
            this.a2 = true;
            z = true;
        }
        if (this.B != wb2Var.q6) {
            this.C = true;
            wb2Var.P2 = null;
            z2 = true;
            z = true;
        } else {
            z2 = false;
        }
        if ((this.H != null || wb2Var.sa != null) && this.F != wb2Var.getRepliesCount()) {
            this.I = this.H;
            this.G = true;
            wb2Var.P2 = null;
            z2 = true;
            z = true;
        }
        if (this.d2 != null && this.c2 != wb2Var.getMessageObject().k.views) {
            this.e2 = this.d2;
            wb2Var.P2 = null;
            z2 = true;
            z = true;
        }
        if (wb2Var.n7 != null && this.N != wb2Var.getRepliesCount()) {
            StaticLayout staticLayout7 = this.U;
            if (staticLayout7 == null || TextUtils.equals(staticLayout7.getText(), wb2Var.n7.getText())) {
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
            z = true;
        }
        if (!TextUtils.equals(this.f0, wb2Var.z5)) {
            this.d0 = true;
            this.e0 = wb2Var.t9;
            z = true;
        }
        if (this.f1 == wb2Var.S9) {
            this.K1 = true;
            this.e2 = null;
        } else {
            if (this.f2 == wb2Var.I3()) {
                if (z2 || (Math.abs(wb2Var.O9 - this.g1) > 1 && this.F0 == wb2Var.Y6)) {
                    this.i1 = true;
                    this.X0 = this.Y0;
                    this.h1 = this.g1;
                    this.L = this.M;
                    this.J = this.K;
                    this.E = this.D;
                }
                if (this.h2 != wb2Var.H3()) {
                    this.i2 = true;
                }
                if (this.k != wb2Var.h3) {
                    this.j = true;
                }
                if (this.k2 != wb2Var.Lb) {
                    this.l2 = true;
                    z = true;
                }
                f = this.n2;
                if (f != wb2Var.u0) {
                    this.m2 = true;
                    this.o2 = f;
                    z = true;
                }
                i = this.q2;
                if (i != wb2Var.q0) {
                    this.s2 = true;
                    this.r2 = i;
                    z = true;
                }
                i2 = this.W2;
                if (i2 != wb2Var.Q1) {
                    this.V2 = true;
                    this.X2 = i2;
                    z = true;
                }
                i3 = this.T2;
                yb2Var = wb2Var.s0;
                if (i3 != (yb2Var == null ? yb2Var.r : 0)) {
                    this.Y2 = true;
                    this.U2 = i3;
                    z = true;
                }
                if (this.Z2 != (wb2Var.getPrimaryMessageObject() == null && wb2Var.getPrimaryMessageObject().c3)) {
                    this.a3 = true;
                    z = true;
                }
                if (this.R2 != wb2Var.h2()) {
                    this.S2 = true;
                    z = true;
                }
                if (this.b3 != wb2Var.s8) {
                    this.c3 = true;
                    z = true;
                }
                hashSet = this.d3;
                r47 r47Var6 = wb2Var.Q5;
                hashSet2 = r47Var6 != null ? r47Var6.K0 : null;
                if (hashSet != null) {
                    if (hashSet2 != null) {
                        size = 0;
                    }
                    z3 = this.g3;
                    r47Var = wb2Var.Q5;
                    if (z3 != (r47Var == null && r47Var.L0)) {
                        this.i3 = true;
                        this.h3 = z3;
                        z = true;
                    }
                    if (r47Var != null || this.x2 == r47Var.m5()) {
                        i4 = this.I2;
                        if (i4 != wb2Var.gb) {
                            this.G2 = true;
                            this.H2 = i4;
                        }
                        wb2Var.Y3();
                        if (x49Var.a()) {
                            z = true;
                        }
                        if (wb2Var.Q5.g4()) {
                            float L2 = wb2Var.e7 - hl.L(28 - (wb2Var.K ? 2 : 0));
                            if (!x49Var.p) {
                                L2 -= x49Var.n;
                            }
                            float f8 = this.r;
                            if (L2 != f8) {
                                this.q = true;
                                this.s = f8;
                                z = true;
                            }
                        }
                        if (wb2Var.Q7 != null) {
                            float f9 = wb2Var.U7;
                            float f10 = this.t;
                            if (f9 != f10 && f10 != 0.0f) {
                                this.u = f10;
                                z = true;
                            }
                        }
                        r47Var2 = wb2Var.Q5;
                        if ((r47Var2 == null && r47Var2.L2) != this.j3 || wb2Var.o2 == null || (staticLayout = this.k3) == null) {
                            return z;
                        }
                        this.l3 = staticLayout;
                        this.m3 = hm.update(0, (View) wb2Var, false, this.m3, staticLayout);
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
                    z = true;
                    wb2Var.Y3();
                    if (x49Var.a()) {
                    }
                    if (wb2Var.Q5.g4()) {
                    }
                    if (wb2Var.Q7 != null) {
                    }
                    r47Var2 = wb2Var.Q5;
                    if ((r47Var2 == null && r47Var2.L2) != this.j3) {
                    }
                    return z;
                }
                size = hashSet.size();
                if (size == (hashSet2 != null ? 0 : hashSet2.size()) || hashSet == null || !hashSet.equals(hashSet2)) {
                    this.f3 = true;
                    this.e3 = this.d3;
                    z = true;
                }
                z3 = this.g3;
                r47Var = wb2Var.Q5;
                if (z3 != (r47Var == null && r47Var.L0)) {
                }
                if (r47Var != null) {
                }
                i4 = this.I2;
                if (i4 != wb2Var.gb) {
                }
                wb2Var.Y3();
                if (x49Var.a()) {
                }
                if (wb2Var.Q5.g4()) {
                }
                if (wb2Var.Q7 != null) {
                }
                r47Var2 = wb2Var.Q5;
                if ((r47Var2 == null && r47Var2.L2) != this.j3) {
                }
                return z;
            }
            this.U0 = false;
            this.g2 = true;
            this.h1 = this.g1;
            this.W0 = this.j2;
            this.X0 = this.Y0;
        }
        z = true;
        if (this.h2 != wb2Var.H3()) {
        }
        if (this.k != wb2Var.h3) {
        }
        if (this.k2 != wb2Var.Lb) {
        }
        f = this.n2;
        if (f != wb2Var.u0) {
        }
        i = this.q2;
        if (i != wb2Var.q0) {
        }
        i2 = this.W2;
        if (i2 != wb2Var.Q1) {
        }
        i3 = this.T2;
        yb2Var = wb2Var.s0;
        if (i3 != (yb2Var == null ? yb2Var.r : 0)) {
        }
        if (this.Z2 != (wb2Var.getPrimaryMessageObject() == null && wb2Var.getPrimaryMessageObject().c3)) {
        }
        if (this.R2 != wb2Var.h2()) {
        }
        if (this.b3 != wb2Var.s8) {
        }
        hashSet = this.d3;
        r47 r47Var62 = wb2Var.Q5;
        if (r47Var62 != null) {
        }
        if (hashSet != null) {
        }
        if (size == (hashSet2 != null ? 0 : hashSet2.size())) {
        }
        this.f3 = true;
        this.e3 = this.d3;
        z = true;
        z3 = this.g3;
        r47Var = wb2Var.Q5;
        if (z3 != (r47Var == null && r47Var.L0)) {
        }
        if (r47Var != null) {
        }
        i4 = this.I2;
        if (i4 != wb2Var.gb) {
        }
        wb2Var.Y3();
        if (x49Var.a()) {
        }
        if (wb2Var.Q5.g4()) {
        }
        if (wb2Var.Q7 != null) {
        }
        r47Var2 = wb2Var.Q5;
        if ((r47Var2 == null && r47Var2.L2) != this.j3) {
        }
        return z;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int b() {
        boolean z;
        int i;
        boolean z2;
        r47 r47Var;
        wb2 wb2Var = this.a;
        boolean O3 = wb2Var.Q5.O3();
        r47 r47Var2 = wb2Var.Q5;
        boolean z3 = true;
        if (!O3) {
            if (!r47Var2.n4() && !wb2Var.Q5.Y2()) {
                z3 = false;
            }
            return (z3 ? 4 : 0) | (wb2Var.Q5.m4() ? 8 : 0);
        }
        if (!r47Var2.n4() && !wb2Var.Q5.Y2()) {
            if (wb2Var.Q5.m4()) {
                z2 = true;
                i = 0;
                z = false;
                z3 = false;
            } else if (wb2Var.Q5.p4()) {
                r47 r47Var3 = wb2Var.Q5;
                i = (r47Var3.r1 || r47Var3.E4()) ? 0 : 1;
                z = false;
                z2 = false;
            } else {
                i = 0;
                z = false;
                z3 = false;
            }
            r47Var = wb2Var.Q5;
            if (!r47Var.w1 || r47.a4(r47Var.k)) {
                i = 0;
                z = false;
                z3 = false;
            }
            return i | (!z3 ? 2 : 0) | (z ? 4 : 0) | (z2 ? 8 : 0);
        }
        z = true;
        i = 0;
        z3 = false;
        z2 = z3;
        r47Var = wb2Var.Q5;
        if (!r47Var.w1) {
        }
        i = 0;
        z = false;
        z3 = false;
        return i | (!z3 ? 2 : 0) | (z ? 4 : 0) | (z2 ? 8 : 0);
    }

    public final void c() {
        mj1 mj1Var;
        this.w0 = true;
        wb2 wb2Var = this.a;
        ArrayList arrayList = wb2Var.I5;
        nl nlVar = wb2Var.U0;
        this.b = nlVar.L0;
        this.c = nlVar.M0;
        this.d = nlVar.N0;
        this.e = nlVar.O0;
        System.arraycopy(nlVar.X0, 0, this.u0, 0, 4);
        t37 t37Var = wb2Var.L6;
        if (t37Var != null) {
            this.E0.set(t37Var.getBounds());
        }
        this.F0 = wb2Var.Y6;
        r47 r47Var = wb2Var.Q5;
        this.J0 = r47Var != null ? r47Var.B2 : null;
        this.K0 = r47Var != null ? r47Var.v2 : 0;
        this.a1 = wb2Var.vb;
        this.N0 = r47Var != null ? r47Var.y2 : null;
        this.f = wb2Var.s3;
        this.g = wb2Var.t3;
        this.d1 = wb2Var.m3;
        this.e1 = r47Var != null ? r47Var.M2 : false;
        ArrayList arrayList2 = this.M1;
        arrayList2.clear();
        if (!arrayList.isEmpty()) {
            arrayList2.addAll(arrayList);
        }
        this.v = wb2Var.x1;
        this.w = wb2Var.g0;
        this.x = wb2Var.W;
        this.y = wb2Var.e0;
        this.z = wb2Var.T != null;
        this.A = wb2Var.b0 != null;
        this.H1 = wb2Var.W1;
        this.D1 = wb2Var.v1;
        this.F1 = wb2Var.w1;
        r47 r47Var2 = wb2Var.Q5;
        this.L2 = r47Var2 != null && r47Var2.D == 27 && (mj1Var = wb2Var.w) != null && mj1Var.d();
        if (wb2Var.n7 != null) {
            this.N = wb2Var.getRepliesCount();
            this.O = wb2Var.v7;
            this.U = wb2Var.n7;
            this.P = wb2Var.q7;
            this.Q = wb2Var.r7;
            this.R = wb2Var.s7;
            this.S = wb2Var.u7;
            this.T = wb2Var.p7;
        }
        this.F = wb2Var.getRepliesCount();
        this.c2 = wb2Var.getMessageObject().k.views;
        this.H = wb2Var.sa;
        this.d2 = wb2Var.pa;
        this.B = wb2Var.q6;
        this.f0 = wb2Var.z5;
        this.l1 = wb2Var.I6;
        this.n1 = wb2Var.I4;
        this.T1 = wb2Var.K3;
        this.U1 = wb2Var.L3;
        this.Y1 = wb2Var.X1;
        this.f1 = !wb2Var.S9;
        this.g1 = wb2Var.O9;
        this.j2 = wb2Var.L9;
        this.Y0 = wb2Var.M9;
        this.f2 = wb2Var.I3();
        this.t2 = wb2Var.getTopMediaOffset();
        this.h2 = wb2Var.H3();
        this.k = wb2Var.h3;
        this.k2 = wb2Var.Lb;
        this.n2 = wb2Var.u0;
        this.q2 = wb2Var.q0;
        this.Q1 = wb2Var.K5;
        StaticLayout[] staticLayoutArr = wb2Var.C9;
        StaticLayout staticLayout = staticLayoutArr[0];
        StaticLayout[] staticLayoutArr2 = this.y2;
        staticLayoutArr2[0] = staticLayout;
        staticLayoutArr2[1] = staticLayoutArr[1];
        r47 r47Var3 = wb2Var.Q5;
        this.x2 = r47Var3 != null && r47Var3.m5();
        this.B2 = wb2Var.F9;
        int i = wb2Var.gb;
        this.w2 = i;
        this.I2 = i;
        this.D2 = wb2Var.D9;
        this.j1 = wb2Var.getCurrentBackgroundLeft();
        t37 t37Var2 = wb2Var.L6;
        if (t37Var2 != null) {
            this.k1 = t37Var2.getBounds().right;
        }
        r47 r47Var4 = wb2Var.Q5;
        this.p2 = r47Var4 != null ? r47Var4.x2 : 0.0f;
        this.Q0 = wb2Var.a8;
        this.F2 = wb2Var.R7;
        this.J2 = wb2Var.b8;
        wb2Var.O.q();
        if (wb2Var.Q7 != null) {
            this.t = wb2Var.V7;
        } else {
            this.t = 0.0f;
        }
        this.N2 = wb2Var.w9;
        this.O2 = wb2Var.x9;
        yb2 yb2Var = wb2Var.s0;
        this.T2 = yb2Var != null ? yb2Var.r : 0;
        this.Z2 = wb2Var.getPrimaryMessageObject() != null && wb2Var.getPrimaryMessageObject().c3;
        this.R2 = wb2Var.h2();
        this.W2 = wb2Var.Q1;
        this.b3 = wb2Var.s8;
        this.d3 = wb2Var.getPrimaryMessageObject() != null ? wb2Var.getPrimaryMessageObject().K0 : null;
        r47 r47Var5 = wb2Var.Q5;
        this.g3 = r47Var5 != null && r47Var5.L0;
        this.j3 = r47Var5 != null && r47Var5.L2;
        this.k3 = wb2Var.o2;
    }

    public final void d() {
        wb2 wb2Var = this.a;
        StaticLayout[] staticLayoutArr = wb2Var.C9;
        StaticLayout staticLayout = staticLayoutArr[0];
        StaticLayout[] staticLayoutArr2 = this.y2;
        staticLayoutArr2[0] = staticLayout;
        staticLayoutArr2[1] = staticLayoutArr[1];
        this.x2 = wb2Var.Q5.m5();
        this.B2 = wb2Var.F9;
        int i = wb2Var.gb;
        this.w2 = i;
        this.I2 = i;
        this.D2 = wb2Var.D9;
    }

    public final void e() {
        wb2 wb2Var = this.a;
        nl nlVar = wb2Var.U0;
        this.h = false;
        this.C = false;
        this.x0 = false;
        this.h0 = 0.0f;
        this.i0 = 0.0f;
        this.j0 = 0.0f;
        this.k0 = 0.0f;
        this.l0 = 0.0f;
        this.m0 = 0.0f;
        if (this.g0) {
            float f = this.p0;
            if (f != 0.0f) {
                float f2 = this.q0;
                if (f2 != 0.0f) {
                    nlVar.i0(this.n0, this.o0, f, f2);
                }
            }
        }
        if (this.C0) {
            nlVar.s0(this.B0);
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
        hl9 hl9Var = this.M0;
        if (hl9Var != null) {
            hl9Var.f(wb2Var);
        }
        this.M0 = null;
        this.V0 = null;
        this.W0 = null;
        this.U0 = false;
        this.b1 = false;
        this.D0 = false;
        this.c1 = null;
        hm.release(wb2Var, this.P0);
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
        x49 x49Var = wb2Var.O;
        ArrayList arrayList = x49Var.s;
        ArrayList arrayList2 = x49Var.t;
        for (int i = 0; i < arrayList2.size(); i++) {
            ((u49) arrayList2.get(i)).b();
        }
        arrayList2.clear();
        x49Var.i = false;
        x49Var.j = false;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            ((u49) arrayList.get(i2)).b = (byte) 0;
        }
        this.l3 = null;
        hm.release(wb2Var, this.m3);
    }

    public final void f() {
        float max = Math.max(0.0f, Math.min(1.0f, this.L1));
        this.R1 = (float) Math.pow(1.0f - max, 0.5d);
        this.S1 = (float) Math.pow(max, 0.5d);
    }
}
