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
import org.telegram.ui.Components.zy;
import org.telegram.ui.gj0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
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
    public org.telegram.ui.Components.p5 O0;
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
    public org.telegram.ui.Components.p5 S0;
    public float S1;
    public int S2;
    public StaticLayout T;
    public boolean T0;
    public float T1;
    public int T2;
    public boolean U;
    public StaticLayout U0;
    public float U1;
    public boolean U2;
    public StaticLayout V;
    public StaticLayout V0;
    public float V1;
    public int V2;
    public float W;
    public int W0;
    public boolean W1;
    public int W2;
    public int X;
    public int X0;
    public int X1;
    public boolean X2;
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
    public HashSet c3;
    public float d;
    public float d0;
    public boolean d1;
    public StaticLayout d2;
    public HashSet d3;
    public float e;
    public String e0;
    public boolean e1;
    public boolean e2;
    public boolean e3;
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
    public StaticLayout j3;
    public String k;
    public float k0;
    public boolean k1;
    public boolean k2;
    public StaticLayout k3;
    public float l;
    public float l0;
    public boolean l1;
    public boolean l2;
    public org.telegram.ui.Components.p5 l3;
    public StaticLayout m;
    public float m0;
    public boolean m1;
    public float m2;
    public final /* synthetic */ s1 m3;
    public StaticLayout n;
    public float n0;
    public boolean n1;
    public float n2;
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
        this.m3 = s1Var;
    }

    public static void b(r1 r1Var) {
        float max = Math.max(0.0f, Math.min(1.0f, r1Var.K1));
        r1Var.Q1 = (float) Math.pow(1.0f - max, 0.5d);
        r1Var.R1 = (float) Math.pow(max, 0.5d);
    }

    /* JADX WARN: Code restructure failed: missing block: B:406:0x036d, code lost:
    
        if (r6 == (r11 == null ? 0 : r11.textWidth)) goto L198;
     */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0592  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x059a  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x05a2  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x05ae  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x05b9  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x05c4  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x05cf  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x05e9  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x05f2  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x05fb  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0604  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x060c  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x0622  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x0661  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x066a  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x0693  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x06a8  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x06b3  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x0653  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0106  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean f() {
        boolean z10;
        boolean z11;
        float f10;
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
        o0 o0Var;
        RichMessageLayout richMessageLayout;
        org.telegram.ui.Components.r5 r5Var;
        s1 s1Var = this.m3;
        ig.r0 r0Var = s1Var.J;
        ArrayList arrayList = s1Var.k7;
        boolean z13 = false;
        if (!this.v0) {
            return false;
        }
        this.v1 = false;
        this.F0 = false;
        boolean z14 = this.E0;
        boolean z15 = s1Var.C8;
        if (z14 != z15) {
            this.F0 = true;
            z10 = true;
        } else {
            z10 = false;
        }
        this.G0 = false;
        MessageObject messageObject4 = s1Var.u7;
        ArrayList<MessageObject.TextLayoutBlock> arrayList2 = messageObject4.textLayoutBlocks;
        ArrayList<MessageObject.TextLayoutBlock> arrayList3 = this.I0;
        if (arrayList2 != arrayList3) {
            boolean z16 = messageObject4.textWidth == this.J0 || z14 == z15;
            if (arrayList2 != null && arrayList3 != null && arrayList2.size() == this.I0.size()) {
                for (int i14 = 0; i14 < this.I0.size(); i14++) {
                    String charSequence = s1Var.u7.textLayoutBlocks.get(i14).textLayout == null ? null : s1Var.u7.textLayoutBlocks.get(i14).textLayout.getText().toString();
                    String charSequence2 = ((MessageObject.TextLayoutBlock) this.I0.get(i14)).textLayout == null ? null : ((MessageObject.TextLayoutBlock) this.I0.get(i14)).textLayout.getText().toString();
                    if ((charSequence != null || charSequence2 == null) && ((charSequence == null || charSequence2 != null) && charSequence.equals(charSequence2))) {
                        org.telegram.ui.Components.p5 p5Var = s1Var.lc;
                        if (p5Var != null) {
                            StaticLayout staticLayout2 = s1Var.u7.textLayoutBlocks.get(i14).textLayout;
                            StaticLayout staticLayout3 = ((MessageObject.TextLayoutBlock) this.I0.get(i14)).textLayout;
                            HashMap hashMap = p5Var.b;
                            if (staticLayout3 != null && (r5Var = (org.telegram.ui.Components.r5) hashMap.remove(staticLayout3)) != null) {
                                ArrayList arrayList4 = r5Var.b;
                                r5Var.a = staticLayout2;
                                for (int i15 = 0; i15 < arrayList4.size(); i15++) {
                                    ((org.telegram.ui.Components.o5) arrayList4.get(i15)).c = staticLayout2;
                                }
                                hashMap.put(staticLayout2, r5Var);
                            }
                        }
                    }
                }
                if (z16) {
                    this.G0 = true;
                    ArrayList arrayList5 = this.I0;
                    this.H0 = arrayList5;
                    this.N0 = this.o2;
                    this.O0 = org.telegram.ui.Components.t5.update(0, (View) s1Var, this.O0, (ArrayList<MessageObject.TextLayoutBlock>) arrayList5, true);
                    s1Var.lc = org.telegram.ui.Components.t5.update(0, s1Var, s1Var.lc, s1Var.u7.textLayoutBlocks);
                    z10 = true;
                } else {
                    s1Var.lc = org.telegram.ui.Components.t5.update(0, s1Var, s1Var.lc, s1Var.u7.textLayoutBlocks);
                }
            }
            z16 = false;
            if (z16) {
            }
        }
        RichMessageLayout richMessageLayout2 = s1Var.u7.richLayout;
        if (richMessageLayout2 != null && (richMessageLayout2.detailsAnimating || richMessageLayout2.blockquoteAnimating)) {
            this.v1 = true;
            z10 = true;
        }
        this.K0 = false;
        if (richMessageLayout2 != this.M0) {
            gj0 gj0Var = s1Var.de;
            boolean z17 = gj0Var != null && gj0Var.h;
            RichMessageLayout richMessageLayout3 = this.L0;
            if (richMessageLayout3 != null) {
                richMessageLayout3.detach(s1Var);
                this.L0 = null;
            }
            if (z17) {
                RichMessageLayout richMessageLayout4 = s1Var.u7.richLayout;
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
        if (s1Var.Va != this.M2) {
            this.O2 = true;
            z10 = true;
        }
        this.P2 = false;
        if (s1Var.Wa != this.N2) {
            this.P2 = true;
            z10 = true;
        }
        StaticLayout staticLayout4 = s1Var.z9;
        if (staticLayout4 != this.E2) {
            CharSequence text = staticLayout4 != null ? staticLayout4.getText() : null;
            StaticLayout staticLayout5 = this.E2;
            if (!TextUtils.equals(text, staticLayout5 != null ? staticLayout5.getText() : null)) {
                this.Q0 = this.P0;
                StaticLayout staticLayout6 = this.E2;
                this.R0 = staticLayout6;
                this.J2 = this.I2;
                this.S0 = org.telegram.ui.Components.t5.update(0, (View) s1Var, false, this.S0, true, staticLayout6);
                z10 = true;
            }
        }
        boolean z18 = s1Var.Wc;
        if (z18 && !this.Z0 && s1Var.kb != null) {
            String string = LocaleController.getString("EditedMessage", R.string.EditedMessage);
            CharSequence text2 = s1Var.kb.getText();
            int indexOf = text2.toString().indexOf(string);
            if (indexOf >= 0) {
                if (indexOf == 0) {
                    TextPaint textPaint = org.telegram.ui.ActionBar.g6.T2;
                    int dp = AndroidUtilities.dp(100.0f) + s1Var.mb;
                    Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
                    this.U0 = new StaticLayout(string, textPaint, dp, alignment, 1.0f, 0.0f, false);
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) string);
                    spannableStringBuilder.append(text2.subSequence(string.length(), text2.length()));
                    spannableStringBuilder.setSpan(new zy(z13), 0, string.length(), 0);
                    this.V0 = new StaticLayout(spannableStringBuilder, org.telegram.ui.ActionBar.g6.T2, AndroidUtilities.dp(100.0f) + s1Var.mb, alignment, 1.0f, 0.0f, false);
                    this.Y0 = s1Var.lb - this.X0;
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
            s1Var.y3 = null;
        } else if (!z18 && this.Z0 && s1Var.kb != null) {
            this.V0 = this.i2;
            int i16 = s1Var.lb;
            int i17 = this.X0;
            this.Y0 = i16 - i17;
            this.T0 = true;
            this.W0 = i17;
            this.g1 = this.f1;
            this.h1 = true;
            z10 = true;
        }
        this.l1 = false;
        if (s1Var.m8 != this.k1) {
            this.l1 = true;
            z10 = true;
        }
        this.s1 = false;
        if (s1Var.r1 != this.u) {
            this.s1 = true;
            float f11 = this.c;
            this.o1 = f11;
            float f12 = this.d;
            this.p1 = f12;
            this.q1 = (f11 / 2.0f) + this.a;
            this.r1 = (f12 / 2.0f) + this.b;
            z10 = true;
        }
        this.u1 = false;
        int i18 = s1Var.b0;
        int i19 = this.v;
        if (i18 != i19) {
            this.v1 = true;
            this.t1 = i19;
            this.u1 = true;
            z10 = true;
        }
        this.y1 = false;
        int i20 = s1Var.R;
        int i21 = this.w;
        if (i20 != i21) {
            this.x1 = i21;
            this.y1 = true;
            z10 = true;
        }
        this.w1 = false;
        if ((s1Var.O != null) != this.y) {
            this.w1 = true;
            z10 = true;
        }
        this.B1 = false;
        int i22 = s1Var.W;
        int i23 = this.x;
        if (i22 != i23) {
            this.A1 = i23;
            this.B1 = true;
            z10 = true;
        }
        this.z1 = false;
        if ((s1Var.T != null) != this.z) {
            this.z1 = true;
            z10 = true;
        }
        this.L2 = false;
        if ((s1Var.u7.type == 27 && (o0Var = s1Var.v) != null && o0Var.d()) != this.K2) {
            this.L2 = true;
            z10 = true;
        }
        this.D1 = false;
        if (s1Var.p1 != this.C1) {
            this.D1 = true;
            z10 = true;
        }
        this.F1 = false;
        if (s1Var.q1 != this.E1) {
            this.F1 = true;
            z10 = true;
        }
        this.I1 = false;
        if (s1Var.d2) {
            int i24 = s1Var.i2;
            int i25 = this.G1;
            if (i24 != i25) {
                this.I1 = true;
                this.H1 = i25;
                z10 = true;
            }
        }
        this.n1 = false;
        if (s1Var.H5 != this.m1) {
            this.n1 = true;
            z10 = true;
        }
        MessageObject messageObject5 = s1Var.u7;
        boolean z19 = messageObject5 != null ? messageObject5.summarized : false;
        MessageObject.TextLayoutBlocks textLayoutBlocks = s1Var.Y3;
        MessageObject.TextLayoutBlocks textLayoutBlocks2 = this.c1;
        if (textLayoutBlocks != textLayoutBlocks2) {
            String charSequence3 = textLayoutBlocks2 == null ? null : textLayoutBlocks2.text.toString();
            MessageObject.TextLayoutBlocks textLayoutBlocks3 = s1Var.Y3;
            String charSequence4 = textLayoutBlocks3 == null ? null : textLayoutBlocks3.text.toString();
            if (this.E0 != s1Var.C8 || this.d1 != z19) {
                MessageObject.TextLayoutBlocks textLayoutBlocks4 = s1Var.Y3;
                int i26 = textLayoutBlocks4 == null ? 0 : textLayoutBlocks4.textWidth;
                MessageObject.TextLayoutBlocks textLayoutBlocks5 = this.c1;
            }
            if ((charSequence4 == null) == (charSequence3 == null) && (charSequence3 == null || charSequence3.equals(charSequence4))) {
                s1Var.m4();
                float f13 = this.e;
                if (f13 != s1Var.l4 || this.f != s1Var.m4) {
                    this.s0 = true;
                    this.q0 = f13;
                    this.r0 = this.f;
                    z10 = true;
                }
            }
            this.a1 = true;
            MessageObject.TextLayoutBlocks textLayoutBlocks6 = this.c1;
            this.b1 = textLayoutBlocks6;
            this.O0 = org.telegram.ui.Components.t5.update(0, s1Var, (org.telegram.ui.Components.p5) null, textLayoutBlocks6 == null ? null : textLayoutBlocks6.textLayoutBlocks);
            org.telegram.ui.Components.p5 p5Var2 = s1Var.lc;
            MessageObject.TextLayoutBlocks textLayoutBlocks7 = s1Var.Y3;
            s1Var.lc = org.telegram.ui.Components.t5.update(0, s1Var, p5Var2, textLayoutBlocks7 == null ? null : textLayoutBlocks7.textLayoutBlocks);
            if (this.E0 != s1Var.C8 || this.d1 != z19) {
                this.s0 = true;
                this.q0 = this.e;
                this.r0 = this.f;
            }
            z10 = true;
        } else if (textLayoutBlocks != null && textLayoutBlocks2 != null) {
            s1Var.m4();
            float f14 = this.e;
            if (f14 != s1Var.l4 || this.f != s1Var.m4) {
                this.s0 = true;
                this.q0 = f14;
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
                for (int i27 = 0; i27 < arrayList.size(); i27++) {
                    e0 e0Var = (e0) arrayList.get(i27);
                    e0 e0Var2 = (e0) arrayList6.get(i27);
                    if (!e0Var.b && !e0Var2.b && (Math.abs(e0Var.c - e0Var2.c) > 0.01f || Math.abs(e0Var.e - e0Var2.e) > 0.01f || !TextUtils.equals(e0Var.h.k(), e0Var2.h.k()))) {
                        this.D2 = true;
                        break;
                    }
                }
            }
            if (this.D2) {
                this.M1.addAll(arrayList6);
            }
        }
        int i28 = this.P1;
        if (i28 != s1Var.o7) {
            this.O1 = i28;
            this.N1 = true;
        }
        int i29 = s1Var.G1;
        if (i29 == 5 || i29 == 3 || i29 == 1) {
            float f15 = s1Var.G4;
            float f16 = this.S1;
            if (f15 != f16 || s1Var.H4 != this.T1) {
                this.U1 = f16;
                this.V1 = this.T1;
                this.W1 = true;
                z10 = true;
            }
        }
        int i30 = s1Var.j2;
        int i31 = this.X1;
        if (i30 != i31) {
            this.Y1 = i31;
            this.Z1 = true;
            z10 = true;
        }
        if (this.A != s1Var.U7) {
            this.B = true;
            s1Var.y3 = null;
            z11 = true;
            z10 = true;
        } else {
            z11 = false;
        }
        if ((this.G != null || s1Var.Rb != null) && this.E != s1Var.getRepliesCount()) {
            this.H = this.G;
            this.F = true;
            s1Var.y3 = null;
            z11 = true;
            z10 = true;
        }
        if (this.c2 != null && this.b2 != s1Var.getMessageObject().messageOwner.views) {
            this.d2 = this.c2;
            s1Var.y3 = null;
            z11 = true;
            z10 = true;
        }
        if (s1Var.V8 != null && this.M != s1Var.getRepliesCount()) {
            StaticLayout staticLayout7 = this.T;
            if (staticLayout7 == null || TextUtils.equals(staticLayout7.getText(), s1Var.V8.getText())) {
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
        if (!TextUtils.equals(this.e0, s1Var.b7)) {
            this.c0 = true;
            this.d0 = s1Var.Sa;
            z10 = true;
        }
        if (this.e1 == s1Var.rb) {
            this.J1 = true;
            this.d2 = null;
        } else {
            if (this.e2 == s1Var.e4()) {
                if (z11 || (Math.abs(s1Var.nb - this.f1) > 1 && this.E0 == s1Var.C8)) {
                    this.h1 = true;
                    this.W0 = this.X0;
                    this.g1 = this.f1;
                    this.K = this.L;
                    this.I = this.J;
                    this.D = this.C;
                }
                if (this.g2 != s1Var.d4()) {
                    this.h2 = true;
                }
                if (this.j != s1Var.S3) {
                    this.i = true;
                }
                if (this.j2 != s1Var.nd) {
                    this.k2 = true;
                    z10 = true;
                }
                f10 = this.m2;
                if (f10 != s1Var.n0) {
                    this.l2 = true;
                    this.n2 = f10;
                    z10 = true;
                }
                i10 = this.p2;
                if (i10 != s1Var.l0) {
                    this.r2 = true;
                    this.q2 = i10;
                    z10 = true;
                }
                i11 = this.V2;
                if (i11 != s1Var.a2) {
                    this.U2 = true;
                    this.W2 = i11;
                    z10 = true;
                }
                i12 = this.S2;
                if (i12 != s1Var.b2) {
                    this.X2 = true;
                    this.T2 = i12;
                    z10 = true;
                }
                if (this.Y2 != (s1Var.getPrimaryMessageObject() == null && s1Var.getPrimaryMessageObject().factCheckExpanded)) {
                    this.Z2 = true;
                    z10 = true;
                }
                if (this.Q2 != s1Var.J1) {
                    this.R2 = true;
                    z10 = true;
                }
                if (this.a3 != s1Var.da) {
                    this.b3 = true;
                    z10 = true;
                }
                hashSet = this.c3;
                messageObject = s1Var.u7;
                if (!MessageObject.expandedQuotesEquals(hashSet, messageObject != null ? messageObject.expandedQuotes : null)) {
                    this.e3 = true;
                    this.d3 = this.c3;
                    z10 = true;
                }
                z12 = this.f3;
                messageObject2 = s1Var.u7;
                if (z12 != (messageObject2 == null && messageObject2.expandedExplanation)) {
                    this.h3 = true;
                    this.g3 = z12;
                    z10 = true;
                }
                if (messageObject2 != null || this.w2 == messageObject2.needDrawForwarded()) {
                    i13 = this.H2;
                    if (i13 != s1Var.Hc) {
                        this.F2 = true;
                        this.G2 = i13;
                    }
                    s1Var.s4();
                    if (r0Var.a()) {
                        z10 = true;
                    }
                    if (s1Var.u7.isRoundVideo()) {
                        float dp2 = s1Var.I8 - AndroidUtilities.dp(28 - (s1Var.F ? 2 : 0));
                        if (!r0Var.s) {
                            dp2 -= r0Var.p;
                        }
                        float f17 = this.q;
                        if (dp2 != f17) {
                            this.p = true;
                            this.r = f17;
                            z10 = true;
                        }
                    }
                    if (s1Var.y9 != null) {
                        float f18 = s1Var.C9;
                        float f19 = this.s;
                        if (f18 != f19 && f19 != 0.0f) {
                            this.t = f19;
                            z10 = true;
                        }
                    }
                    messageObject3 = s1Var.u7;
                    if ((messageObject3 == null && messageObject3.translated) != this.i3 || s1Var.F2 == null || (staticLayout = this.j3) == null) {
                        return z10;
                    }
                    this.k3 = staticLayout;
                    this.l3 = org.telegram.ui.Components.t5.update(0, (View) s1Var, false, this.l3, staticLayout);
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
                s1Var.s4();
                if (r0Var.a()) {
                }
                if (s1Var.u7.isRoundVideo()) {
                }
                if (s1Var.y9 != null) {
                }
                messageObject3 = s1Var.u7;
                if ((messageObject3 == null && messageObject3.translated) != this.i3) {
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
        if (this.g2 != s1Var.d4()) {
        }
        if (this.j != s1Var.S3) {
        }
        if (this.j2 != s1Var.nd) {
        }
        f10 = this.m2;
        if (f10 != s1Var.n0) {
        }
        i10 = this.p2;
        if (i10 != s1Var.l0) {
        }
        i11 = this.V2;
        if (i11 != s1Var.a2) {
        }
        i12 = this.S2;
        if (i12 != s1Var.b2) {
        }
        if (this.Y2 != (s1Var.getPrimaryMessageObject() == null && s1Var.getPrimaryMessageObject().factCheckExpanded)) {
        }
        if (this.Q2 != s1Var.J1) {
        }
        if (this.a3 != s1Var.da) {
        }
        hashSet = this.c3;
        messageObject = s1Var.u7;
        if (!MessageObject.expandedQuotesEquals(hashSet, messageObject != null ? messageObject.expandedQuotes : null)) {
        }
        z12 = this.f3;
        messageObject2 = s1Var.u7;
        if (z12 != (messageObject2 == null && messageObject2.expandedExplanation)) {
        }
        if (messageObject2 != null) {
        }
        i13 = this.H2;
        if (i13 != s1Var.Hc) {
        }
        s1Var.s4();
        if (r0Var.a()) {
        }
        if (s1Var.u7.isRoundVideo()) {
        }
        if (s1Var.y9 != null) {
        }
        messageObject3 = s1Var.u7;
        if ((messageObject3 == null && messageObject3.translated) != this.i3) {
        }
        return z10;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int g() {
        int i10;
        boolean z10;
        boolean z11;
        MessageObject messageObject;
        s1 s1Var = this.m3;
        boolean z12 = true;
        if (!s1Var.u7.isOutOwner()) {
            if (!s1Var.u7.isSending() && !s1Var.u7.isEditing()) {
                z12 = false;
            }
            return (z12 ? 4 : 0) | (s1Var.u7.isSendError() ? 8 : 0);
        }
        if (s1Var.u7.isSending() || s1Var.u7.isEditing()) {
            i10 = 0;
            z12 = false;
            z10 = true;
        } else {
            if (s1Var.u7.isSendError()) {
                i10 = 0;
                z12 = false;
                z10 = false;
                z11 = true;
                messageObject = s1Var.u7;
                if (!messageObject.notime || messageObject.isQuickReply()) {
                    i10 = 0;
                    z12 = false;
                    z10 = false;
                }
                return (!z12 ? 2 : 0) | i10 | (z10 ? 4 : 0) | (z11 ? 8 : 0);
            }
            if (s1Var.u7.isSent()) {
                MessageObject messageObject2 = s1Var.u7;
                i10 = (messageObject2.scheduled || messageObject2.isUnread()) ? 0 : 1;
            } else {
                i10 = 0;
                z12 = false;
            }
            z10 = false;
        }
        z11 = false;
        messageObject = s1Var.u7;
        if (!messageObject.notime) {
        }
        i10 = 0;
        z12 = false;
        z10 = false;
        return (!z12 ? 2 : 0) | i10 | (z10 ? 4 : 0) | (z11 ? 8 : 0);
    }

    public final void h() {
        o0 o0Var;
        this.v0 = true;
        s1 s1Var = this.m3;
        ArrayList arrayList = s1Var.k7;
        jh.y2 y2Var = s1Var.O0;
        this.a = y2Var.getImageX();
        this.b = y2Var.getImageY();
        this.c = y2Var.getImageWidth();
        this.d = y2Var.getImageHeight();
        System.arraycopy(y2Var.getRoundRadius(), 0, this.t0, 0, 4);
        org.telegram.ui.ActionBar.d5 d5Var = s1Var.p8;
        if (d5Var != null) {
            this.D0.set(d5Var.getBounds());
        }
        this.E0 = s1Var.C8;
        MessageObject messageObject = s1Var.u7;
        this.I0 = messageObject != null ? messageObject.textLayoutBlocks : null;
        this.J0 = messageObject != null ? messageObject.textWidth : 0;
        this.Z0 = s1Var.Wc;
        this.M0 = messageObject != null ? messageObject.richLayout : null;
        this.e = s1Var.l4;
        this.f = s1Var.m4;
        this.c1 = s1Var.Y3;
        this.d1 = messageObject != null ? messageObject.summarized : false;
        ArrayList arrayList2 = this.L1;
        arrayList2.clear();
        if (!arrayList.isEmpty()) {
            arrayList2.addAll(arrayList);
        }
        this.u = s1Var.r1;
        this.v = s1Var.b0;
        this.w = s1Var.R;
        this.x = s1Var.W;
        this.y = s1Var.O != null;
        this.z = s1Var.T != null;
        this.G1 = s1Var.i2;
        this.C1 = s1Var.p1;
        this.E1 = s1Var.q1;
        MessageObject messageObject2 = s1Var.u7;
        this.K2 = messageObject2 != null && messageObject2.type == 27 && (o0Var = s1Var.v) != null && o0Var.d();
        if (s1Var.V8 != null) {
            this.M = s1Var.getRepliesCount();
            this.N = s1Var.d9;
            this.T = s1Var.V8;
            this.O = s1Var.Y8;
            this.P = s1Var.Z8;
            this.Q = s1Var.a9;
            this.R = s1Var.c9;
            this.S = s1Var.X8;
        }
        this.E = s1Var.getRepliesCount();
        this.b2 = s1Var.getMessageObject().messageOwner.views;
        this.G = s1Var.Rb;
        this.c2 = s1Var.Ob;
        this.A = s1Var.U7;
        this.e0 = s1Var.b7;
        this.k1 = s1Var.m8;
        this.m1 = s1Var.H5;
        this.S1 = s1Var.G4;
        this.T1 = s1Var.H4;
        this.X1 = s1Var.j2;
        this.e1 = !s1Var.rb;
        this.f1 = s1Var.nb;
        this.i2 = s1Var.kb;
        this.X0 = s1Var.lb;
        this.e2 = s1Var.e4();
        this.s2 = s1Var.getTopMediaOffset();
        this.g2 = s1Var.d4();
        this.j = s1Var.S3;
        this.j2 = s1Var.nd;
        this.m2 = s1Var.n0;
        this.p2 = s1Var.l0;
        this.P1 = s1Var.o7;
        StaticLayout[] staticLayoutArr = s1Var.bb;
        StaticLayout staticLayout = staticLayoutArr[0];
        StaticLayout[] staticLayoutArr2 = this.x2;
        staticLayoutArr2[0] = staticLayout;
        staticLayoutArr2[1] = staticLayoutArr[1];
        MessageObject messageObject3 = s1Var.u7;
        this.w2 = messageObject3 != null && messageObject3.needDrawForwarded();
        this.A2 = s1Var.eb;
        int i10 = s1Var.Hc;
        this.v2 = i10;
        this.H2 = i10;
        this.C2 = s1Var.cb;
        this.i1 = s1Var.getCurrentBackgroundLeft();
        org.telegram.ui.ActionBar.d5 d5Var2 = s1Var.p8;
        if (d5Var2 != null) {
            this.j1 = d5Var2.getBounds().right;
        }
        MessageObject messageObject4 = s1Var.u7;
        this.o2 = messageObject4 != null ? messageObject4.textXOffset : 0.0f;
        this.P0 = s1Var.I9;
        this.E2 = s1Var.z9;
        this.I2 = s1Var.J9;
        s1Var.J.r();
        if (s1Var.y9 != null) {
            this.s = s1Var.D9;
        } else {
            this.s = 0.0f;
        }
        this.M2 = s1Var.Va;
        this.N2 = s1Var.Wa;
        this.S2 = s1Var.b2;
        this.Y2 = s1Var.getPrimaryMessageObject() != null && s1Var.getPrimaryMessageObject().factCheckExpanded;
        this.Q2 = s1Var.J1;
        this.V2 = s1Var.a2;
        this.a3 = s1Var.da;
        this.c3 = s1Var.getPrimaryMessageObject() != null ? s1Var.getPrimaryMessageObject().expandedQuotes : null;
        MessageObject messageObject5 = s1Var.u7;
        this.f3 = messageObject5 != null && messageObject5.expandedExplanation;
        this.i3 = messageObject5 != null && messageObject5.translated;
        this.j3 = s1Var.F2;
    }

    public final void i() {
        s1 s1Var = this.m3;
        StaticLayout[] staticLayoutArr = s1Var.bb;
        StaticLayout staticLayout = staticLayoutArr[0];
        StaticLayout[] staticLayoutArr2 = this.x2;
        staticLayoutArr2[0] = staticLayout;
        staticLayoutArr2[1] = staticLayoutArr[1];
        this.w2 = s1Var.u7.needDrawForwarded();
        this.A2 = s1Var.eb;
        int i10 = s1Var.Hc;
        this.v2 = i10;
        this.H2 = i10;
        this.C2 = s1Var.cb;
    }

    public final void j() {
        s1 s1Var = this.m3;
        jh.y2 y2Var = s1Var.O0;
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
            float f10 = this.o0;
            if (f10 != 0.0f) {
                float f11 = this.p0;
                if (f11 != 0.0f) {
                    y2Var.setImageCoords(this.m0, this.n0, f10, f11);
                }
            }
        }
        if (this.B0) {
            y2Var.setRoundRadius(this.A0);
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
        org.telegram.ui.Components.t5.release(s1Var, this.O0);
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
        this.X2 = false;
        this.Z2 = false;
        this.e3 = false;
        this.h3 = false;
        this.R2 = false;
        this.b3 = false;
        this.t2 = false;
        this.F2 = false;
        StaticLayout[] staticLayoutArr = this.y2;
        staticLayoutArr[0] = null;
        staticLayoutArr[1] = null;
        this.p = false;
        ig.r0 r0Var = s1Var.J;
        ArrayList arrayList = r0Var.v;
        ArrayList arrayList2 = r0Var.w;
        for (int i10 = 0; i10 < arrayList2.size(); i10++) {
            ((ig.o0) arrayList2.get(i10)).b();
        }
        arrayList2.clear();
        r0Var.j = false;
        r0Var.k = false;
        r0Var.l = false;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            ((ig.o0) arrayList.get(i11)).c = 0;
        }
        this.k3 = null;
        org.telegram.ui.Components.t5.release(s1Var, this.l3);
    }
}
