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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.ui.Components.tz;
import org.telegram.ui.fj0;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class r1 {
    public boolean A;
    public int[] A0;
    public int A1;
    public float A2;
    public boolean B;
    public boolean B0;
    public boolean B1;
    public int B2;
    public float C;
    public boolean C0;
    public boolean C1;
    public int C2;
    public float D;
    public boolean D1;
    public boolean D2;
    public int E;
    public boolean E0;
    public boolean E1;
    public StaticLayout E2;
    public boolean F;
    public boolean F0;
    public boolean F1;
    public boolean F2;
    public StaticLayout G;
    public boolean G0;
    public int G1;
    public int G2;
    public StaticLayout H;
    public ArrayList H0;
    public int H1;
    public int H2;
    public float I;
    public ArrayList I0;
    public boolean I1;
    public int I2;
    public float J;
    public int J0;
    public boolean J1;
    public float J2;
    public float K;
    public boolean K0;
    public boolean K2;
    public float L;
    public RichMessageLayout L0;
    public boolean L2;
    public int M;
    public RichMessageLayout M0;
    public boolean M2;
    public int N;
    public float N0;
    public boolean N1;
    public boolean N2;
    public int O;
    public org.telegram.ui.Components.y5 O0;
    public int O1;
    public boolean O2;
    public int P;
    public float P0;
    public int P1;
    public boolean P2;
    public boolean Q;
    public float Q0;
    public boolean Q2;
    public float R;
    public StaticLayout R0;
    public boolean R2;
    public boolean S;
    public org.telegram.ui.Components.y5 S0;
    public float S1;
    public boolean S2;
    public StaticLayout T;
    public boolean T0;
    public float T1;
    public int T2;
    public boolean U;
    public StaticLayout U0;
    public float U1;
    public int U2;
    public StaticLayout V;
    public StaticLayout V0;
    public float V1;
    public boolean V2;
    public float W;
    public int W0;
    public boolean W1;
    public int W2;
    public int X;
    public int X0;
    public int X1;
    public int X2;
    public int Y;
    public int Y0;
    public int Y1;
    public boolean Y2;
    public int Z;
    public boolean Z0;
    public boolean Z1;
    public boolean Z2;
    public float a;
    public boolean a0;
    public boolean a1;
    public boolean a3;
    public float b;
    public boolean b0;
    public MessageObject.TextLayoutBlocks b1;
    public int b2;
    public boolean b3;
    public float c;
    public boolean c0;
    public MessageObject.TextLayoutBlocks c1;
    public StaticLayout c2;
    public boolean c3;
    public float d;
    public float d0;
    public boolean d1;
    public StaticLayout d2;
    public HashSet d3;
    public float e;
    public String e0;
    public boolean e1;
    public boolean e2;
    public HashSet e3;
    public float f;
    public boolean f0;
    public int f1;
    public boolean f2;
    public boolean f3;
    public boolean g;
    public float g0;
    public int g1;
    public boolean g2;
    public boolean g3;
    public boolean h;
    public float h0;
    public boolean h1;
    public boolean h2;
    public boolean h3;
    public boolean i;
    public float i0;
    public int i1;
    public StaticLayout i2;
    public boolean i3;
    public boolean j;
    public float j0;
    public int j1;
    public boolean j2;
    public boolean j3;
    public String k;
    public float k0;
    public boolean k1;
    public boolean k2;
    public StaticLayout k3;
    public float l;
    public float l0;
    public boolean l1;
    public boolean l2;
    public StaticLayout l3;
    public StaticLayout m;
    public float m0;
    public boolean m1;
    public float m2;
    public org.telegram.ui.Components.y5 m3;
    public StaticLayout n;
    public float n0;
    public boolean n1;
    public float n2;
    public final /* synthetic */ s1 n3;
    public boolean o;
    public float o0;
    public float o1;
    public float o2;
    public boolean p;
    public float p0;
    public float p1;
    public int p2;
    public float q;
    public float q0;
    public float q1;
    public int q2;
    public float r;
    public float r0;
    public float r1;
    public boolean r2;
    public float s;
    public boolean s0;
    public boolean s1;
    public int s2;
    public float t;
    public int t1;
    public boolean t2;
    public boolean u;
    public boolean u1;
    public int u2;
    public int v;
    public boolean v0;
    public boolean v1;
    public int v2;
    public int w;
    public boolean w0;
    public boolean w1;
    public boolean w2;
    public int x;
    public boolean x0;
    public int x1;
    public boolean y;
    public boolean y0;
    public boolean y1;
    public boolean z;
    public boolean z1;
    public float z2;
    public final int[] t0 = new int[4];
    public float u0 = 1.0f;
    public float z0 = 1.0f;
    public final Rect D0 = new Rect();
    public float K1 = 1.0f;
    public final ArrayList L1 = new ArrayList();
    public final ArrayList M1 = new ArrayList();
    public float Q1 = 0.0f;
    public float R1 = 1.0f;
    public int a2 = -1;
    public final StaticLayout[] x2 = new StaticLayout[2];
    public final StaticLayout[] y2 = new StaticLayout[2];

    public r1(s1 s1Var) {
        this.n3 = s1Var;
    }

    public static void b(r1 r1Var) {
        float max = Math.max(0.0f, Math.min(1.0f, r1Var.K1));
        r1Var.Q1 = (float) Math.pow(1.0f - max, 0.5d);
        r1Var.R1 = (float) Math.pow(max, 0.5d);
    }

    /* JADX WARN: Code restructure failed: missing block: B:406:0x036f, code lost:
    
        if (r6 == (r11 == null ? 0 : r11.textWidth)) goto L198;
     */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0595  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x059d  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x05a5  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x05b1  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x05bc  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x05c7  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x05d2  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x05ec  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x05f5  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x05fe  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0607  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x060f  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x0625  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x0664  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x066d  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x0696  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x06ab  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x06b6  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x0656  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0106  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean f() {
        boolean z10;
        boolean z11;
        float f7;
        int i10;
        int i11;
        int i12;
        HashSet hashSet;
        MessageObject messageObject;
        boolean z12;
        MessageObject messageObject2;
        int i13;
        MessageObject messageObject3;
        StaticLayout staticLayout;
        n0 n0Var;
        RichMessageLayout richMessageLayout;
        org.telegram.ui.Components.a6 a6Var;
        s1 s1Var = this.n3;
        bh.y0 y0Var = s1Var.N;
        ArrayList arrayList = s1Var.o7;
        int i14 = 0;
        if (!this.v0) {
            return false;
        }
        this.v1 = false;
        this.F0 = false;
        boolean z13 = this.E0;
        boolean z14 = s1Var.G8;
        if (z13 != z14) {
            this.F0 = true;
            z10 = true;
        } else {
            z10 = false;
        }
        this.G0 = false;
        MessageObject messageObject4 = s1Var.y7;
        ArrayList<MessageObject.TextLayoutBlock> arrayList2 = messageObject4.textLayoutBlocks;
        ArrayList<MessageObject.TextLayoutBlock> arrayList3 = this.I0;
        if (arrayList2 != arrayList3) {
            boolean z15 = messageObject4.textWidth == this.J0 || z13 == z14;
            if (arrayList2 != null && arrayList3 != null && arrayList2.size() == this.I0.size()) {
                for (int i15 = 0; i15 < this.I0.size(); i15++) {
                    String charSequence = s1Var.y7.textLayoutBlocks.get(i15).textLayout == null ? null : s1Var.y7.textLayoutBlocks.get(i15).textLayout.getText().toString();
                    String charSequence2 = ((MessageObject.TextLayoutBlock) this.I0.get(i15)).textLayout == null ? null : ((MessageObject.TextLayoutBlock) this.I0.get(i15)).textLayout.getText().toString();
                    if ((charSequence != null || charSequence2 == null) && ((charSequence == null || charSequence2 != null) && charSequence.equals(charSequence2))) {
                        org.telegram.ui.Components.y5 y5Var = s1Var.pc;
                        if (y5Var != null) {
                            StaticLayout staticLayout2 = s1Var.y7.textLayoutBlocks.get(i15).textLayout;
                            StaticLayout staticLayout3 = ((MessageObject.TextLayoutBlock) this.I0.get(i15)).textLayout;
                            HashMap hashMap = y5Var.b;
                            if (staticLayout3 != null && (a6Var = (org.telegram.ui.Components.a6) hashMap.remove(staticLayout3)) != null) {
                                ArrayList arrayList4 = a6Var.b;
                                a6Var.a = staticLayout2;
                                for (int i16 = 0; i16 < arrayList4.size(); i16++) {
                                    ((org.telegram.ui.Components.x5) arrayList4.get(i16)).c = staticLayout2;
                                }
                                hashMap.put(staticLayout2, a6Var);
                            }
                        }
                    }
                }
                if (z15) {
                    this.G0 = true;
                    ArrayList arrayList5 = this.I0;
                    this.H0 = arrayList5;
                    this.N0 = this.o2;
                    this.O0 = org.telegram.ui.Components.c6.update(0, (View) s1Var, this.O0, (ArrayList<MessageObject.TextLayoutBlock>) arrayList5, true);
                    s1Var.pc = org.telegram.ui.Components.c6.update(0, s1Var, s1Var.pc, s1Var.y7.textLayoutBlocks);
                    z10 = true;
                } else {
                    s1Var.pc = org.telegram.ui.Components.c6.update(0, s1Var, s1Var.pc, s1Var.y7.textLayoutBlocks);
                }
            }
            z15 = false;
            if (z15) {
            }
        }
        RichMessageLayout richMessageLayout2 = s1Var.y7.richLayout;
        if (richMessageLayout2 != null && (richMessageLayout2.detailsAnimating || richMessageLayout2.blockquoteAnimating)) {
            this.v1 = true;
            z10 = true;
        }
        this.K0 = false;
        if (richMessageLayout2 != this.M0) {
            fj0 fj0Var = s1Var.je;
            boolean z16 = fj0Var != null && fj0Var.h;
            RichMessageLayout richMessageLayout3 = this.L0;
            if (richMessageLayout3 != null) {
                richMessageLayout3.detach(s1Var);
                this.L0 = null;
            }
            if (z16) {
                RichMessageLayout richMessageLayout4 = s1Var.y7.richLayout;
                if (richMessageLayout4 != null && (richMessageLayout = this.M0) != null) {
                    richMessageLayout4.layout(richMessageLayout);
                }
            } else {
                this.K0 = true;
                RichMessageLayout richMessageLayout5 = this.M0;
                this.L0 = richMessageLayout5;
                if (richMessageLayout5 != null) {
                    richMessageLayout5.attach(s1Var);
                }
            }
        }
        this.O2 = false;
        if (s1Var.Za != this.M2) {
            this.O2 = true;
            z10 = true;
        }
        this.P2 = false;
        if (s1Var.ab != this.N2) {
            this.P2 = true;
            z10 = true;
        }
        this.Q2 = false;
        StaticLayout staticLayout4 = s1Var.D9;
        if (staticLayout4 != this.E2) {
            CharSequence text = staticLayout4 != null ? staticLayout4.getText() : null;
            StaticLayout staticLayout5 = this.E2;
            if (!TextUtils.equals(text, staticLayout5 != null ? staticLayout5.getText() : null)) {
                this.Q0 = this.P0;
                StaticLayout staticLayout6 = this.E2;
                this.R0 = staticLayout6;
                this.J2 = this.I2;
                this.S0 = org.telegram.ui.Components.c6.update(0, (View) s1Var, false, this.S0, true, staticLayout6);
                z10 = true;
            }
        }
        boolean z17 = s1Var.ad;
        if (z17 && !this.Z0 && s1Var.ob != null) {
            String string = LocaleController.getString("EditedMessage", R.string.EditedMessage);
            CharSequence text2 = s1Var.ob.getText();
            int indexOf = text2.toString().indexOf(string);
            if (indexOf >= 0) {
                if (indexOf == 0) {
                    TextPaint textPaint = org.telegram.ui.ActionBar.y6.T2;
                    int dp = AndroidUtilities.dp(100.0f) + s1Var.qb;
                    Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
                    this.U0 = new StaticLayout(string, textPaint, dp, alignment, 1.0f, 0.0f, false);
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) string);
                    spannableStringBuilder.append(text2.subSequence(string.length(), text2.length()));
                    spannableStringBuilder.setSpan(new tz(i14), 0, string.length(), 0);
                    this.V0 = new StaticLayout(spannableStringBuilder, org.telegram.ui.ActionBar.y6.T2, AndroidUtilities.dp(100.0f) + s1Var.qb, alignment, 1.0f, 0.0f, false);
                    this.Y0 = s1Var.pb - this.X0;
                } else {
                    this.Y0 = 0;
                    this.U0 = null;
                    this.V0 = this.i2;
                }
                this.T0 = true;
                this.W0 = this.X0;
                this.g1 = this.f1;
                this.h1 = true;
                z10 = true;
            }
            s1Var.C3 = null;
        } else if (!z17 && this.Z0 && s1Var.ob != null) {
            this.V0 = this.i2;
            int i17 = s1Var.pb;
            int i18 = this.X0;
            this.Y0 = i17 - i18;
            this.T0 = true;
            this.W0 = i18;
            this.g1 = this.f1;
            this.h1 = true;
            z10 = true;
        }
        this.l1 = false;
        if (s1Var.q8 != this.k1) {
            this.l1 = true;
            z10 = true;
        }
        this.s1 = false;
        if (s1Var.v1 != this.u) {
            this.s1 = true;
            float f10 = this.c;
            this.o1 = f10;
            float f11 = this.d;
            this.p1 = f11;
            this.q1 = (f10 / 2.0f) + this.a;
            this.r1 = (f11 / 2.0f) + this.b;
            z10 = true;
        }
        this.u1 = false;
        int i19 = s1Var.f0;
        int i20 = this.v;
        if (i19 != i20) {
            this.v1 = true;
            this.t1 = i20;
            this.u1 = true;
            z10 = true;
        }
        this.y1 = false;
        int i21 = s1Var.V;
        int i22 = this.w;
        if (i21 != i22) {
            this.x1 = i22;
            this.y1 = true;
            z10 = true;
        }
        this.w1 = false;
        if ((s1Var.S != null) != this.y) {
            this.w1 = true;
            z10 = true;
        }
        this.B1 = false;
        int i23 = s1Var.d0;
        int i24 = this.x;
        if (i23 != i24) {
            this.A1 = i24;
            this.B1 = true;
            z10 = true;
        }
        this.z1 = false;
        if ((s1Var.a0 != null) != this.z) {
            this.z1 = true;
            z10 = true;
        }
        this.L2 = false;
        if ((s1Var.y7.type == 27 && (n0Var = s1Var.v) != null && n0Var.d()) != this.K2) {
            this.L2 = true;
            z10 = true;
        }
        this.D1 = false;
        if (s1Var.t1 != this.C1) {
            this.D1 = true;
            z10 = true;
        }
        this.F1 = false;
        if (s1Var.u1 != this.E1) {
            this.F1 = true;
            z10 = true;
        }
        this.I1 = false;
        if (s1Var.h2) {
            int i25 = s1Var.m2;
            int i26 = this.G1;
            if (i25 != i26) {
                this.I1 = true;
                this.H1 = i26;
                z10 = true;
            }
        }
        this.n1 = false;
        if (s1Var.L5 != this.m1) {
            this.n1 = true;
            z10 = true;
        }
        MessageObject messageObject5 = s1Var.y7;
        boolean z18 = messageObject5 != null ? messageObject5.summarized : false;
        MessageObject.TextLayoutBlocks textLayoutBlocks = s1Var.c4;
        MessageObject.TextLayoutBlocks textLayoutBlocks2 = this.c1;
        if (textLayoutBlocks != textLayoutBlocks2) {
            String charSequence3 = textLayoutBlocks2 == null ? null : textLayoutBlocks2.text.toString();
            MessageObject.TextLayoutBlocks textLayoutBlocks3 = s1Var.c4;
            String charSequence4 = textLayoutBlocks3 == null ? null : textLayoutBlocks3.text.toString();
            if (this.E0 != s1Var.G8 || this.d1 != z18) {
                MessageObject.TextLayoutBlocks textLayoutBlocks4 = s1Var.c4;
                int i27 = textLayoutBlocks4 == null ? 0 : textLayoutBlocks4.textWidth;
                MessageObject.TextLayoutBlocks textLayoutBlocks5 = this.c1;
            }
            if ((charSequence4 == null) == (charSequence3 == null) && (charSequence3 == null || charSequence3.equals(charSequence4))) {
                s1Var.p4();
                float f12 = this.e;
                if (f12 != s1Var.p4 || this.f != s1Var.q4) {
                    this.s0 = true;
                    this.q0 = f12;
                    this.r0 = this.f;
                    z10 = true;
                }
            }
            this.a1 = true;
            MessageObject.TextLayoutBlocks textLayoutBlocks6 = this.c1;
            this.b1 = textLayoutBlocks6;
            this.O0 = org.telegram.ui.Components.c6.update(0, s1Var, (org.telegram.ui.Components.y5) null, textLayoutBlocks6 == null ? null : textLayoutBlocks6.textLayoutBlocks);
            org.telegram.ui.Components.y5 y5Var2 = s1Var.pc;
            MessageObject.TextLayoutBlocks textLayoutBlocks7 = s1Var.c4;
            s1Var.pc = org.telegram.ui.Components.c6.update(0, s1Var, y5Var2, textLayoutBlocks7 == null ? null : textLayoutBlocks7.textLayoutBlocks);
            if (this.E0 != s1Var.G8 || this.d1 != z18) {
                this.s0 = true;
                this.q0 = this.e;
                this.r0 = this.f;
            }
            z10 = true;
        } else if (textLayoutBlocks != null && textLayoutBlocks2 != null) {
            s1Var.p4();
            float f13 = this.e;
            if (f13 != s1Var.p4 || this.f != s1Var.q4) {
                this.s0 = true;
                this.q0 = f13;
                this.r0 = this.f;
                z10 = true;
            }
        }
        ArrayList arrayList6 = this.L1;
        if (!arrayList6.isEmpty() || !arrayList.isEmpty()) {
            if (arrayList6.size() != arrayList.size()) {
                this.D2 = true;
            }
            if (!this.D2) {
                for (int i28 = 0; i28 < arrayList.size(); i28++) {
                    d0 d0Var = (d0) arrayList.get(i28);
                    d0 d0Var2 = (d0) arrayList6.get(i28);
                    if (!d0Var.b && !d0Var2.b && (Math.abs(d0Var.c - d0Var2.c) > 0.01f || Math.abs(d0Var.e - d0Var2.e) > 0.01f || !TextUtils.equals(d0Var.h.k(), d0Var2.h.k()))) {
                        this.D2 = true;
                        break;
                    }
                }
            }
            if (this.D2) {
                this.M1.addAll(arrayList6);
            }
        }
        int i29 = this.P1;
        if (i29 != s1Var.s7) {
            this.O1 = i29;
            this.N1 = true;
        }
        int i30 = s1Var.K1;
        if (i30 == 5 || i30 == 3 || i30 == 1) {
            float f14 = s1Var.K4;
            float f15 = this.S1;
            if (f14 != f15 || s1Var.L4 != this.T1) {
                this.U1 = f15;
                this.V1 = this.T1;
                this.W1 = true;
                z10 = true;
            }
        }
        int i31 = s1Var.n2;
        int i32 = this.X1;
        if (i31 != i32) {
            this.Y1 = i32;
            this.Z1 = true;
            z10 = true;
        }
        if (this.A != s1Var.Y7) {
            this.B = true;
            s1Var.C3 = null;
            z11 = true;
            z10 = true;
        } else {
            z11 = false;
        }
        if ((this.G != null || s1Var.Vb != null) && this.E != s1Var.getRepliesCount()) {
            this.H = this.G;
            this.F = true;
            s1Var.C3 = null;
            z11 = true;
            z10 = true;
        }
        if (this.c2 != null && this.b2 != s1Var.getMessageObject().messageOwner.views) {
            this.d2 = this.c2;
            s1Var.C3 = null;
            z11 = true;
            z10 = true;
        }
        if (s1Var.Z8 != null && this.M != s1Var.getRepliesCount()) {
            StaticLayout staticLayout7 = this.T;
            if (staticLayout7 == null || TextUtils.equals(staticLayout7.getText(), s1Var.Z8.getText())) {
                this.V = null;
            } else {
                this.V = this.T;
            }
            this.X = this.N;
            this.W = this.R;
            this.Y = this.O;
            this.Z = this.P;
            this.a0 = this.Q;
            this.b0 = this.S;
            this.U = true;
            z10 = true;
        }
        if (!TextUtils.equals(this.e0, s1Var.f7)) {
            this.c0 = true;
            this.d0 = s1Var.Wa;
            z10 = true;
        }
        if (this.e1 == s1Var.vb) {
            this.J1 = true;
            this.d2 = null;
        } else {
            if (this.e2 == s1Var.h4()) {
                if (z11 || (Math.abs(s1Var.rb - this.f1) > 1 && this.E0 == s1Var.G8)) {
                    this.h1 = true;
                    this.W0 = this.X0;
                    this.g1 = this.f1;
                    this.K = this.L;
                    this.I = this.J;
                    this.D = this.C;
                }
                if (this.g2 != s1Var.g4()) {
                    this.h2 = true;
                }
                if (this.j != s1Var.W3) {
                    this.i = true;
                }
                if (this.j2 != s1Var.rd) {
                    this.k2 = true;
                    z10 = true;
                }
                f7 = this.m2;
                if (f7 != s1Var.r0) {
                    this.l2 = true;
                    this.n2 = f7;
                    z10 = true;
                }
                i10 = this.p2;
                if (i10 != s1Var.p0) {
                    this.r2 = true;
                    this.q2 = i10;
                    z10 = true;
                }
                i11 = this.W2;
                if (i11 != s1Var.e2) {
                    this.V2 = true;
                    this.X2 = i11;
                    z10 = true;
                }
                i12 = this.T2;
                if (i12 != s1Var.f2) {
                    this.Y2 = true;
                    this.U2 = i12;
                    z10 = true;
                }
                if (this.Z2 != (s1Var.getPrimaryMessageObject() == null && s1Var.getPrimaryMessageObject().factCheckExpanded)) {
                    this.a3 = true;
                    z10 = true;
                }
                if (this.R2 != s1Var.N1) {
                    this.S2 = true;
                    z10 = true;
                }
                if (this.b3 != s1Var.ha) {
                    this.c3 = true;
                    z10 = true;
                }
                hashSet = this.d3;
                messageObject = s1Var.y7;
                if (!MessageObject.expandedQuotesEquals(hashSet, messageObject != null ? messageObject.expandedQuotes : null)) {
                    this.f3 = true;
                    this.e3 = this.d3;
                    z10 = true;
                }
                z12 = this.g3;
                messageObject2 = s1Var.y7;
                if (z12 != (messageObject2 == null && messageObject2.expandedExplanation)) {
                    this.i3 = true;
                    this.h3 = z12;
                    z10 = true;
                }
                if (messageObject2 != null || this.w2 == messageObject2.needDrawForwarded()) {
                    i13 = this.H2;
                    if (i13 != s1Var.Lc) {
                        this.F2 = true;
                        this.G2 = i13;
                    }
                    s1Var.v4();
                    if (y0Var.a()) {
                        z10 = true;
                    }
                    if (s1Var.y7.isRoundVideo()) {
                        float dp2 = s1Var.M8 - AndroidUtilities.dp(28 - (s1Var.J ? 2 : 0));
                        if (!y0Var.s) {
                            dp2 -= y0Var.p;
                        }
                        float f16 = this.q;
                        if (dp2 != f16) {
                            this.p = true;
                            this.r = f16;
                            z10 = true;
                        }
                    }
                    if (s1Var.C9 != null) {
                        float f17 = s1Var.G9;
                        float f18 = this.s;
                        if (f17 != f18 && f18 != 0.0f) {
                            this.t = f18;
                            z10 = true;
                        }
                    }
                    messageObject3 = s1Var.y7;
                    if ((messageObject3 == null && messageObject3.translated) != this.j3 || s1Var.J2 == null || (staticLayout = this.k3) == null) {
                        return z10;
                    }
                    this.l3 = staticLayout;
                    this.m3 = org.telegram.ui.Components.c6.update(0, (View) s1Var, false, this.m3, staticLayout);
                    return true;
                }
                this.t2 = true;
                StaticLayout[] staticLayoutArr = this.x2;
                StaticLayout staticLayout8 = staticLayoutArr[0];
                StaticLayout[] staticLayoutArr2 = this.y2;
                staticLayoutArr2[0] = staticLayout8;
                staticLayoutArr2[1] = staticLayoutArr[1];
                this.z2 = this.A2;
                this.u2 = this.v2;
                this.B2 = this.C2;
                z10 = true;
                s1Var.v4();
                if (y0Var.a()) {
                }
                if (s1Var.y7.isRoundVideo()) {
                }
                if (s1Var.C9 != null) {
                }
                messageObject3 = s1Var.y7;
                if ((messageObject3 == null && messageObject3.translated) != this.j3) {
                }
                return z10;
            }
            this.T0 = false;
            this.f2 = true;
            this.g1 = this.f1;
            this.V0 = this.i2;
            this.W0 = this.X0;
        }
        z10 = true;
        if (this.g2 != s1Var.g4()) {
        }
        if (this.j != s1Var.W3) {
        }
        if (this.j2 != s1Var.rd) {
        }
        f7 = this.m2;
        if (f7 != s1Var.r0) {
        }
        i10 = this.p2;
        if (i10 != s1Var.p0) {
        }
        i11 = this.W2;
        if (i11 != s1Var.e2) {
        }
        i12 = this.T2;
        if (i12 != s1Var.f2) {
        }
        if (this.Z2 != (s1Var.getPrimaryMessageObject() == null && s1Var.getPrimaryMessageObject().factCheckExpanded)) {
        }
        if (this.R2 != s1Var.N1) {
        }
        if (this.b3 != s1Var.ha) {
        }
        hashSet = this.d3;
        messageObject = s1Var.y7;
        if (!MessageObject.expandedQuotesEquals(hashSet, messageObject != null ? messageObject.expandedQuotes : null)) {
        }
        z12 = this.g3;
        messageObject2 = s1Var.y7;
        if (z12 != (messageObject2 == null && messageObject2.expandedExplanation)) {
        }
        if (messageObject2 != null) {
        }
        i13 = this.H2;
        if (i13 != s1Var.Lc) {
        }
        s1Var.v4();
        if (y0Var.a()) {
        }
        if (s1Var.y7.isRoundVideo()) {
        }
        if (s1Var.C9 != null) {
        }
        messageObject3 = s1Var.y7;
        if ((messageObject3 == null && messageObject3.translated) != this.j3) {
        }
        return z10;
    }

    public final int g() {
        boolean z10;
        int i10;
        boolean z11;
        s1 s1Var = this.n3;
        boolean z12 = true;
        if (!s1Var.y7.isOutOwner()) {
            if (!s1Var.y7.isSending() && !s1Var.y7.isEditing()) {
                z12 = false;
            }
            return (z12 ? 4 : 0) | (s1Var.y7.isSendError() ? 8 : 0);
        }
        if (s1Var.y7.isSending() || s1Var.y7.isEditing()) {
            z10 = true;
            i10 = 0;
            z12 = false;
            z11 = false;
        } else if (s1Var.y7.isSendError()) {
            z11 = true;
            i10 = 0;
            z12 = false;
            z10 = false;
        } else {
            if (s1Var.y7.isSent()) {
                MessageObject messageObject = s1Var.y7;
                i10 = (messageObject.scheduled || messageObject.isUnread()) ? 0 : 1;
                z10 = false;
            } else {
                i10 = 0;
                z12 = false;
                z10 = false;
            }
            z11 = z10;
        }
        MessageObject messageObject2 = s1Var.y7;
        if (messageObject2.notime || messageObject2.isQuickReply()) {
            i10 = 0;
            z12 = false;
            z10 = false;
        }
        return (z12 ? 2 : 0) | i10 | (z10 ? 4 : 0) | (z11 ? 8 : 0);
    }

    public final void h() {
        n0 n0Var;
        this.v0 = true;
        s1 s1Var = this.n3;
        ArrayList arrayList = s1Var.o7;
        di.f3 f3Var = s1Var.S0;
        this.a = f3Var.getImageX();
        this.b = f3Var.getImageY();
        this.c = f3Var.getImageWidth();
        this.d = f3Var.getImageHeight();
        System.arraycopy(f3Var.getRoundRadius(), 0, this.t0, 0, 4);
        org.telegram.ui.ActionBar.l5 l5Var = s1Var.t8;
        if (l5Var != null) {
            this.D0.set(l5Var.getBounds());
        }
        this.E0 = s1Var.G8;
        MessageObject messageObject = s1Var.y7;
        this.I0 = messageObject != null ? messageObject.textLayoutBlocks : null;
        this.J0 = messageObject != null ? messageObject.textWidth : 0;
        this.Z0 = s1Var.ad;
        this.M0 = messageObject != null ? messageObject.richLayout : null;
        this.e = s1Var.p4;
        this.f = s1Var.q4;
        this.c1 = s1Var.c4;
        this.d1 = messageObject != null ? messageObject.summarized : false;
        ArrayList arrayList2 = this.L1;
        arrayList2.clear();
        if (!arrayList.isEmpty()) {
            arrayList2.addAll(arrayList);
        }
        this.u = s1Var.v1;
        this.v = s1Var.f0;
        this.w = s1Var.V;
        this.x = s1Var.d0;
        this.y = s1Var.S != null;
        this.z = s1Var.a0 != null;
        this.G1 = s1Var.m2;
        this.C1 = s1Var.t1;
        this.E1 = s1Var.u1;
        MessageObject messageObject2 = s1Var.y7;
        this.K2 = messageObject2 != null && messageObject2.type == 27 && (n0Var = s1Var.v) != null && n0Var.d();
        if (s1Var.Z8 != null) {
            this.M = s1Var.getRepliesCount();
            this.N = s1Var.h9;
            this.T = s1Var.Z8;
            this.O = s1Var.c9;
            this.P = s1Var.d9;
            this.Q = s1Var.e9;
            this.R = s1Var.g9;
            this.S = s1Var.b9;
        }
        this.E = s1Var.getRepliesCount();
        this.b2 = s1Var.getMessageObject().messageOwner.views;
        this.G = s1Var.Vb;
        this.c2 = s1Var.Sb;
        this.A = s1Var.Y7;
        this.e0 = s1Var.f7;
        this.k1 = s1Var.q8;
        this.m1 = s1Var.L5;
        this.S1 = s1Var.K4;
        this.T1 = s1Var.L4;
        this.X1 = s1Var.n2;
        this.e1 = !s1Var.vb;
        this.f1 = s1Var.rb;
        this.i2 = s1Var.ob;
        this.X0 = s1Var.pb;
        this.e2 = s1Var.h4();
        this.s2 = s1Var.getTopMediaOffset();
        this.g2 = s1Var.g4();
        this.j = s1Var.W3;
        this.j2 = s1Var.rd;
        this.m2 = s1Var.r0;
        this.p2 = s1Var.p0;
        this.P1 = s1Var.s7;
        StaticLayout[] staticLayoutArr = s1Var.fb;
        StaticLayout staticLayout = staticLayoutArr[0];
        StaticLayout[] staticLayoutArr2 = this.x2;
        staticLayoutArr2[0] = staticLayout;
        staticLayoutArr2[1] = staticLayoutArr[1];
        MessageObject messageObject3 = s1Var.y7;
        this.w2 = messageObject3 != null && messageObject3.needDrawForwarded();
        this.A2 = s1Var.ib;
        int i10 = s1Var.Lc;
        this.v2 = i10;
        this.H2 = i10;
        this.C2 = s1Var.gb;
        this.i1 = s1Var.getCurrentBackgroundLeft();
        org.telegram.ui.ActionBar.l5 l5Var2 = s1Var.t8;
        if (l5Var2 != null) {
            this.j1 = l5Var2.getBounds().right;
        }
        MessageObject messageObject4 = s1Var.y7;
        this.o2 = messageObject4 != null ? messageObject4.textXOffset : 0.0f;
        this.P0 = s1Var.M9;
        this.E2 = s1Var.D9;
        this.I2 = s1Var.N9;
        s1Var.N.r();
        if (s1Var.C9 != null) {
            this.s = s1Var.H9;
        } else {
            this.s = 0.0f;
        }
        this.M2 = s1Var.Za;
        this.N2 = s1Var.ab;
        this.T2 = s1Var.f2;
        this.Z2 = s1Var.getPrimaryMessageObject() != null && s1Var.getPrimaryMessageObject().factCheckExpanded;
        this.R2 = s1Var.N1;
        this.W2 = s1Var.e2;
        this.b3 = s1Var.ha;
        this.d3 = s1Var.getPrimaryMessageObject() != null ? s1Var.getPrimaryMessageObject().expandedQuotes : null;
        MessageObject messageObject5 = s1Var.y7;
        this.g3 = messageObject5 != null && messageObject5.expandedExplanation;
        this.j3 = messageObject5 != null && messageObject5.translated;
        this.k3 = s1Var.J2;
    }

    public final void i() {
        s1 s1Var = this.n3;
        StaticLayout[] staticLayoutArr = s1Var.fb;
        StaticLayout staticLayout = staticLayoutArr[0];
        StaticLayout[] staticLayoutArr2 = this.x2;
        staticLayoutArr2[0] = staticLayout;
        staticLayoutArr2[1] = staticLayoutArr[1];
        this.w2 = s1Var.y7.needDrawForwarded();
        this.A2 = s1Var.ib;
        int i10 = s1Var.Lc;
        this.v2 = i10;
        this.H2 = i10;
        this.C2 = s1Var.gb;
    }

    public final void j() {
        s1 s1Var = this.n3;
        di.f3 f3Var = s1Var.S0;
        this.g = false;
        this.B = false;
        this.w0 = false;
        this.g0 = 0.0f;
        this.h0 = 0.0f;
        this.i0 = 0.0f;
        this.j0 = 0.0f;
        this.k0 = 0.0f;
        this.l0 = 0.0f;
        if (this.f0) {
            float f7 = this.o0;
            if (f7 != 0.0f) {
                float f10 = this.p0;
                if (f10 != 0.0f) {
                    f3Var.setImageCoords(this.m0, this.n0, f7, f10);
                }
            }
        }
        if (this.B0) {
            f3Var.setRoundRadius(this.A0);
        }
        this.m0 = 0.0f;
        this.n0 = 0.0f;
        this.o0 = 0.0f;
        this.p0 = 0.0f;
        this.f0 = false;
        this.z0 = 1.0f;
        this.u0 = 1.0f;
        this.B0 = false;
        this.K1 = 1.0f;
        this.Q1 = 0.0f;
        this.R1 = 1.0f;
        this.G0 = false;
        this.K0 = false;
        this.F0 = false;
        this.O2 = false;
        this.P2 = false;
        this.Q2 = false;
        this.H0 = null;
        RichMessageLayout richMessageLayout = this.L0;
        if (richMessageLayout != null) {
            richMessageLayout.detach(s1Var);
        }
        this.L0 = null;
        this.U0 = null;
        this.V0 = null;
        this.T0 = false;
        this.a1 = false;
        this.C0 = false;
        this.b1 = null;
        org.telegram.ui.Components.c6.release(s1Var, this.O0);
        this.O0 = null;
        this.s0 = false;
        this.J1 = false;
        this.M1.clear();
        this.W1 = false;
        this.D2 = false;
        this.N1 = false;
        this.Z1 = false;
        this.R0 = null;
        this.F = false;
        this.H = null;
        this.U = false;
        this.V = null;
        this.d2 = null;
        this.f2 = false;
        this.h2 = false;
        this.h1 = false;
        this.l1 = false;
        this.c0 = false;
        this.s1 = false;
        this.u1 = false;
        this.y1 = false;
        this.w1 = false;
        this.z1 = false;
        this.B1 = false;
        this.v1 = false;
        this.D1 = false;
        this.F1 = false;
        this.L2 = false;
        this.J1 = false;
        this.i = false;
        this.k2 = false;
        this.l2 = false;
        this.r2 = false;
        this.Y2 = false;
        this.a3 = false;
        this.f3 = false;
        this.i3 = false;
        this.S2 = false;
        this.c3 = false;
        this.t2 = false;
        this.F2 = false;
        StaticLayout[] staticLayoutArr = this.y2;
        staticLayoutArr[0] = null;
        staticLayoutArr[1] = null;
        this.p = false;
        bh.y0 y0Var = s1Var.N;
        ArrayList arrayList = y0Var.v;
        ArrayList arrayList2 = y0Var.w;
        for (int i10 = 0; i10 < arrayList2.size(); i10++) {
            ((bh.v0) arrayList2.get(i10)).b();
        }
        arrayList2.clear();
        y0Var.j = false;
        y0Var.k = false;
        y0Var.l = false;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            ((bh.v0) arrayList.get(i11)).c = 0;
        }
        this.l3 = null;
        org.telegram.ui.Components.c6.release(s1Var, this.m3);
    }
}
