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
import org.telegram.ui.Components.lz;
import org.telegram.ui.xj0;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class t1 {
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
    public org.telegram.ui.Components.u5 O0;
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
    public org.telegram.ui.Components.u5 S0;
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
    public org.telegram.ui.Components.u5 l3;
    public StaticLayout m;
    public float m0;
    public boolean m1;
    public float m2;
    public final /* synthetic */ u1 m3;
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

    public t1(u1 u1Var) {
        this.m3 = u1Var;
    }

    public static void b(t1 t1Var) {
        float max = Math.max(0.0f, Math.min(1.0f, t1Var.K1));
        t1Var.Q1 = (float) Math.pow(1.0f - max, 0.5d);
        t1Var.R1 = (float) Math.pow(max, 0.5d);
    }

    /* JADX WARN: Code restructure failed: missing block: B:406:0x036d, code lost:
    
        if (r6 == (r11 == null ? 0 : r11.textWidth)) goto L198;
     */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0593  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x059b  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x05a3  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x05af  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x05ba  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x05c5  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x05d0  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x05ea  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x05f3  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x05fc  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0605  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x060d  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x0623  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x0662  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x066b  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x0694  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x06a9  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x06b4  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x0654  */
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
        o0 o0Var;
        RichMessageLayout richMessageLayout;
        org.telegram.ui.Components.w5 w5Var;
        u1 u1Var = this.m3;
        zg.p0 p0Var = u1Var.N;
        ArrayList arrayList = u1Var.o7;
        boolean z13 = false;
        if (!this.v0) {
            return false;
        }
        this.v1 = false;
        this.F0 = false;
        boolean z14 = this.E0;
        boolean z15 = u1Var.G8;
        if (z14 != z15) {
            this.F0 = true;
            z10 = true;
        } else {
            z10 = false;
        }
        this.G0 = false;
        MessageObject messageObject4 = u1Var.y7;
        ArrayList<MessageObject.TextLayoutBlock> arrayList2 = messageObject4.textLayoutBlocks;
        ArrayList<MessageObject.TextLayoutBlock> arrayList3 = this.I0;
        if (arrayList2 != arrayList3) {
            boolean z16 = messageObject4.textWidth == this.J0 || z14 == z15;
            if (arrayList2 != null && arrayList3 != null && arrayList2.size() == this.I0.size()) {
                for (int i14 = 0; i14 < this.I0.size(); i14++) {
                    String charSequence = u1Var.y7.textLayoutBlocks.get(i14).textLayout == null ? null : u1Var.y7.textLayoutBlocks.get(i14).textLayout.getText().toString();
                    String charSequence2 = ((MessageObject.TextLayoutBlock) this.I0.get(i14)).textLayout == null ? null : ((MessageObject.TextLayoutBlock) this.I0.get(i14)).textLayout.getText().toString();
                    if ((charSequence != null || charSequence2 == null) && ((charSequence == null || charSequence2 != null) && charSequence.equals(charSequence2))) {
                        org.telegram.ui.Components.u5 u5Var = u1Var.pc;
                        if (u5Var != null) {
                            StaticLayout staticLayout2 = u1Var.y7.textLayoutBlocks.get(i14).textLayout;
                            StaticLayout staticLayout3 = ((MessageObject.TextLayoutBlock) this.I0.get(i14)).textLayout;
                            HashMap hashMap = u5Var.b;
                            if (staticLayout3 != null && (w5Var = (org.telegram.ui.Components.w5) hashMap.remove(staticLayout3)) != null) {
                                ArrayList arrayList4 = w5Var.b;
                                w5Var.a = staticLayout2;
                                for (int i15 = 0; i15 < arrayList4.size(); i15++) {
                                    ((org.telegram.ui.Components.t5) arrayList4.get(i15)).c = staticLayout2;
                                }
                                hashMap.put(staticLayout2, w5Var);
                            }
                        }
                    }
                }
                if (z16) {
                    this.G0 = true;
                    ArrayList arrayList5 = this.I0;
                    this.H0 = arrayList5;
                    this.N0 = this.o2;
                    this.O0 = org.telegram.ui.Components.y5.update(0, (View) u1Var, this.O0, (ArrayList<MessageObject.TextLayoutBlock>) arrayList5, true);
                    u1Var.pc = org.telegram.ui.Components.y5.update(0, u1Var, u1Var.pc, u1Var.y7.textLayoutBlocks);
                    z10 = true;
                } else {
                    u1Var.pc = org.telegram.ui.Components.y5.update(0, u1Var, u1Var.pc, u1Var.y7.textLayoutBlocks);
                }
            }
            z16 = false;
            if (z16) {
            }
        }
        RichMessageLayout richMessageLayout2 = u1Var.y7.richLayout;
        if (richMessageLayout2 != null && (richMessageLayout2.detailsAnimating || richMessageLayout2.blockquoteAnimating)) {
            this.v1 = true;
            z10 = true;
        }
        this.K0 = false;
        if (richMessageLayout2 != this.M0) {
            xj0 xj0Var = u1Var.ie;
            boolean z17 = xj0Var != null && xj0Var.h;
            RichMessageLayout richMessageLayout3 = this.L0;
            if (richMessageLayout3 != null) {
                richMessageLayout3.detach(u1Var);
                this.L0 = null;
            }
            if (z17) {
                RichMessageLayout richMessageLayout4 = u1Var.y7.richLayout;
                if (richMessageLayout4 != null && (richMessageLayout = this.M0) != null) {
                    richMessageLayout4.layout(richMessageLayout);
                }
            } else {
                this.K0 = true;
                RichMessageLayout richMessageLayout5 = this.M0;
                this.L0 = richMessageLayout5;
                if (richMessageLayout5 != null) {
                    richMessageLayout5.attach(u1Var);
                }
            }
        }
        this.O2 = false;
        if (u1Var.Za != this.M2) {
            this.O2 = true;
            z10 = true;
        }
        this.P2 = false;
        if (u1Var.ab != this.N2) {
            this.P2 = true;
            z10 = true;
        }
        StaticLayout staticLayout4 = u1Var.D9;
        if (staticLayout4 != this.E2) {
            CharSequence text = staticLayout4 != null ? staticLayout4.getText() : null;
            StaticLayout staticLayout5 = this.E2;
            if (!TextUtils.equals(text, staticLayout5 != null ? staticLayout5.getText() : null)) {
                this.Q0 = this.P0;
                StaticLayout staticLayout6 = this.E2;
                this.R0 = staticLayout6;
                this.J2 = this.I2;
                this.S0 = org.telegram.ui.Components.y5.update(0, (View) u1Var, false, this.S0, true, staticLayout6);
                z10 = true;
            }
        }
        boolean z18 = u1Var.ad;
        if (z18 && !this.Z0 && u1Var.ob != null) {
            String string = LocaleController.getString("EditedMessage", R.string.EditedMessage);
            CharSequence text2 = u1Var.ob.getText();
            int indexOf = text2.toString().indexOf(string);
            if (indexOf >= 0) {
                if (indexOf == 0) {
                    TextPaint textPaint = org.telegram.ui.ActionBar.j6.T2;
                    int dp = AndroidUtilities.dp(100.0f) + u1Var.qb;
                    Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
                    this.U0 = new StaticLayout(string, textPaint, dp, alignment, 1.0f, 0.0f, false);
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) string);
                    spannableStringBuilder.append(text2.subSequence(string.length(), text2.length()));
                    spannableStringBuilder.setSpan(new lz(z13), 0, string.length(), 0);
                    this.V0 = new StaticLayout(spannableStringBuilder, org.telegram.ui.ActionBar.j6.T2, AndroidUtilities.dp(100.0f) + u1Var.qb, alignment, 1.0f, 0.0f, false);
                    this.Y0 = u1Var.pb - this.X0;
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
            u1Var.C3 = null;
        } else if (!z18 && this.Z0 && u1Var.ob != null) {
            this.V0 = this.i2;
            int i16 = u1Var.pb;
            int i17 = this.X0;
            this.Y0 = i16 - i17;
            this.T0 = true;
            this.W0 = i17;
            this.g1 = this.f1;
            this.h1 = true;
            z10 = true;
        }
        this.l1 = false;
        if (u1Var.q8 != this.k1) {
            this.l1 = true;
            z10 = true;
        }
        this.s1 = false;
        if (u1Var.v1 != this.u) {
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
        int i18 = u1Var.f0;
        int i19 = this.v;
        if (i18 != i19) {
            this.v1 = true;
            this.t1 = i19;
            this.u1 = true;
            z10 = true;
        }
        this.y1 = false;
        int i20 = u1Var.V;
        int i21 = this.w;
        if (i20 != i21) {
            this.x1 = i21;
            this.y1 = true;
            z10 = true;
        }
        this.w1 = false;
        if ((u1Var.S != null) != this.y) {
            this.w1 = true;
            z10 = true;
        }
        this.B1 = false;
        int i22 = u1Var.d0;
        int i23 = this.x;
        if (i22 != i23) {
            this.A1 = i23;
            this.B1 = true;
            z10 = true;
        }
        this.z1 = false;
        if ((u1Var.a0 != null) != this.z) {
            this.z1 = true;
            z10 = true;
        }
        this.L2 = false;
        if ((u1Var.y7.type == 27 && (o0Var = u1Var.v) != null && o0Var.d()) != this.K2) {
            this.L2 = true;
            z10 = true;
        }
        this.D1 = false;
        if (u1Var.t1 != this.C1) {
            this.D1 = true;
            z10 = true;
        }
        this.F1 = false;
        if (u1Var.u1 != this.E1) {
            this.F1 = true;
            z10 = true;
        }
        this.I1 = false;
        if (u1Var.h2) {
            int i24 = u1Var.m2;
            int i25 = this.G1;
            if (i24 != i25) {
                this.I1 = true;
                this.H1 = i25;
                z10 = true;
            }
        }
        this.n1 = false;
        if (u1Var.L5 != this.m1) {
            this.n1 = true;
            z10 = true;
        }
        MessageObject messageObject5 = u1Var.y7;
        boolean z19 = messageObject5 != null ? messageObject5.summarized : false;
        MessageObject.TextLayoutBlocks textLayoutBlocks = u1Var.c4;
        MessageObject.TextLayoutBlocks textLayoutBlocks2 = this.c1;
        if (textLayoutBlocks != textLayoutBlocks2) {
            String charSequence3 = textLayoutBlocks2 == null ? null : textLayoutBlocks2.text.toString();
            MessageObject.TextLayoutBlocks textLayoutBlocks3 = u1Var.c4;
            String charSequence4 = textLayoutBlocks3 == null ? null : textLayoutBlocks3.text.toString();
            if (this.E0 != u1Var.G8 || this.d1 != z19) {
                MessageObject.TextLayoutBlocks textLayoutBlocks4 = u1Var.c4;
                int i26 = textLayoutBlocks4 == null ? 0 : textLayoutBlocks4.textWidth;
                MessageObject.TextLayoutBlocks textLayoutBlocks5 = this.c1;
            }
            if ((charSequence4 == null) == (charSequence3 == null) && (charSequence3 == null || charSequence3.equals(charSequence4))) {
                u1Var.n4();
                float f12 = this.e;
                if (f12 != u1Var.p4 || this.f != u1Var.q4) {
                    this.s0 = true;
                    this.q0 = f12;
                    this.r0 = this.f;
                    z10 = true;
                }
            }
            this.a1 = true;
            MessageObject.TextLayoutBlocks textLayoutBlocks6 = this.c1;
            this.b1 = textLayoutBlocks6;
            this.O0 = org.telegram.ui.Components.y5.update(0, u1Var, (org.telegram.ui.Components.u5) null, textLayoutBlocks6 == null ? null : textLayoutBlocks6.textLayoutBlocks);
            org.telegram.ui.Components.u5 u5Var2 = u1Var.pc;
            MessageObject.TextLayoutBlocks textLayoutBlocks7 = u1Var.c4;
            u1Var.pc = org.telegram.ui.Components.y5.update(0, u1Var, u5Var2, textLayoutBlocks7 == null ? null : textLayoutBlocks7.textLayoutBlocks);
            if (this.E0 != u1Var.G8 || this.d1 != z19) {
                this.s0 = true;
                this.q0 = this.e;
                this.r0 = this.f;
            }
            z10 = true;
        } else if (textLayoutBlocks != null && textLayoutBlocks2 != null) {
            u1Var.n4();
            float f13 = this.e;
            if (f13 != u1Var.p4 || this.f != u1Var.q4) {
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
        if (i28 != u1Var.s7) {
            this.O1 = i28;
            this.N1 = true;
        }
        int i29 = u1Var.K1;
        if (i29 == 5 || i29 == 3 || i29 == 1) {
            float f14 = u1Var.K4;
            float f15 = this.S1;
            if (f14 != f15 || u1Var.L4 != this.T1) {
                this.U1 = f15;
                this.V1 = this.T1;
                this.W1 = true;
                z10 = true;
            }
        }
        int i30 = u1Var.n2;
        int i31 = this.X1;
        if (i30 != i31) {
            this.Y1 = i31;
            this.Z1 = true;
            z10 = true;
        }
        if (this.A != u1Var.Y7) {
            this.B = true;
            u1Var.C3 = null;
            z11 = true;
            z10 = true;
        } else {
            z11 = false;
        }
        if ((this.G != null || u1Var.Vb != null) && this.E != u1Var.getRepliesCount()) {
            this.H = this.G;
            this.F = true;
            u1Var.C3 = null;
            z11 = true;
            z10 = true;
        }
        if (this.c2 != null && this.b2 != u1Var.getMessageObject().messageOwner.views) {
            this.d2 = this.c2;
            u1Var.C3 = null;
            z11 = true;
            z10 = true;
        }
        if (u1Var.Z8 != null && this.M != u1Var.getRepliesCount()) {
            StaticLayout staticLayout7 = this.T;
            if (staticLayout7 == null || TextUtils.equals(staticLayout7.getText(), u1Var.Z8.getText())) {
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
        if (!TextUtils.equals(this.e0, u1Var.f7)) {
            this.c0 = true;
            this.d0 = u1Var.Wa;
            z10 = true;
        }
        if (this.e1 == u1Var.vb) {
            this.J1 = true;
            this.d2 = null;
        } else {
            if (this.e2 == u1Var.f4()) {
                if (z11 || (Math.abs(u1Var.rb - this.f1) > 1 && this.E0 == u1Var.G8)) {
                    this.h1 = true;
                    this.W0 = this.X0;
                    this.g1 = this.f1;
                    this.K = this.L;
                    this.I = this.J;
                    this.D = this.C;
                }
                if (this.g2 != u1Var.e4()) {
                    this.h2 = true;
                }
                if (this.j != u1Var.W3) {
                    this.i = true;
                }
                if (this.j2 != u1Var.rd) {
                    this.k2 = true;
                    z10 = true;
                }
                f7 = this.m2;
                if (f7 != u1Var.r0) {
                    this.l2 = true;
                    this.n2 = f7;
                    z10 = true;
                }
                i10 = this.p2;
                if (i10 != u1Var.p0) {
                    this.r2 = true;
                    this.q2 = i10;
                    z10 = true;
                }
                i11 = this.V2;
                if (i11 != u1Var.e2) {
                    this.U2 = true;
                    this.W2 = i11;
                    z10 = true;
                }
                i12 = this.S2;
                if (i12 != u1Var.f2) {
                    this.X2 = true;
                    this.T2 = i12;
                    z10 = true;
                }
                if (this.Y2 != (u1Var.getPrimaryMessageObject() == null && u1Var.getPrimaryMessageObject().factCheckExpanded)) {
                    this.Z2 = true;
                    z10 = true;
                }
                if (this.Q2 != u1Var.N1) {
                    this.R2 = true;
                    z10 = true;
                }
                if (this.a3 != u1Var.ha) {
                    this.b3 = true;
                    z10 = true;
                }
                hashSet = this.c3;
                messageObject = u1Var.y7;
                if (!MessageObject.expandedQuotesEquals(hashSet, messageObject != null ? messageObject.expandedQuotes : null)) {
                    this.e3 = true;
                    this.d3 = this.c3;
                    z10 = true;
                }
                z12 = this.f3;
                messageObject2 = u1Var.y7;
                if (z12 != (messageObject2 == null && messageObject2.expandedExplanation)) {
                    this.h3 = true;
                    this.g3 = z12;
                    z10 = true;
                }
                if (messageObject2 != null || this.w2 == messageObject2.needDrawForwarded()) {
                    i13 = this.H2;
                    if (i13 != u1Var.Lc) {
                        this.F2 = true;
                        this.G2 = i13;
                    }
                    u1Var.t4();
                    if (p0Var.a()) {
                        z10 = true;
                    }
                    if (u1Var.y7.isRoundVideo()) {
                        float dp2 = u1Var.M8 - AndroidUtilities.dp(28 - (u1Var.J ? 2 : 0));
                        if (!p0Var.s) {
                            dp2 -= p0Var.p;
                        }
                        float f16 = this.q;
                        if (dp2 != f16) {
                            this.p = true;
                            this.r = f16;
                            z10 = true;
                        }
                    }
                    if (u1Var.C9 != null) {
                        float f17 = u1Var.G9;
                        float f18 = this.s;
                        if (f17 != f18 && f18 != 0.0f) {
                            this.t = f18;
                            z10 = true;
                        }
                    }
                    messageObject3 = u1Var.y7;
                    if ((messageObject3 == null && messageObject3.translated) != this.i3 || u1Var.J2 == null || (staticLayout = this.j3) == null) {
                        return z10;
                    }
                    this.k3 = staticLayout;
                    this.l3 = org.telegram.ui.Components.y5.update(0, (View) u1Var, false, this.l3, staticLayout);
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
                u1Var.t4();
                if (p0Var.a()) {
                }
                if (u1Var.y7.isRoundVideo()) {
                }
                if (u1Var.C9 != null) {
                }
                messageObject3 = u1Var.y7;
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
        if (this.g2 != u1Var.e4()) {
        }
        if (this.j != u1Var.W3) {
        }
        if (this.j2 != u1Var.rd) {
        }
        f7 = this.m2;
        if (f7 != u1Var.r0) {
        }
        i10 = this.p2;
        if (i10 != u1Var.p0) {
        }
        i11 = this.V2;
        if (i11 != u1Var.e2) {
        }
        i12 = this.S2;
        if (i12 != u1Var.f2) {
        }
        if (this.Y2 != (u1Var.getPrimaryMessageObject() == null && u1Var.getPrimaryMessageObject().factCheckExpanded)) {
        }
        if (this.Q2 != u1Var.N1) {
        }
        if (this.a3 != u1Var.ha) {
        }
        hashSet = this.c3;
        messageObject = u1Var.y7;
        if (!MessageObject.expandedQuotesEquals(hashSet, messageObject != null ? messageObject.expandedQuotes : null)) {
        }
        z12 = this.f3;
        messageObject2 = u1Var.y7;
        if (z12 != (messageObject2 == null && messageObject2.expandedExplanation)) {
        }
        if (messageObject2 != null) {
        }
        i13 = this.H2;
        if (i13 != u1Var.Lc) {
        }
        u1Var.t4();
        if (p0Var.a()) {
        }
        if (u1Var.y7.isRoundVideo()) {
        }
        if (u1Var.C9 != null) {
        }
        messageObject3 = u1Var.y7;
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
        u1 u1Var = this.m3;
        boolean z12 = true;
        if (!u1Var.y7.isOutOwner()) {
            if (!u1Var.y7.isSending() && !u1Var.y7.isEditing()) {
                z12 = false;
            }
            return (z12 ? 4 : 0) | (u1Var.y7.isSendError() ? 8 : 0);
        }
        if (u1Var.y7.isSending() || u1Var.y7.isEditing()) {
            i10 = 0;
            z12 = false;
            z10 = true;
        } else {
            if (u1Var.y7.isSendError()) {
                i10 = 0;
                z12 = false;
                z10 = false;
                z11 = true;
                messageObject = u1Var.y7;
                if (!messageObject.notime || messageObject.isQuickReply()) {
                    i10 = 0;
                    z12 = false;
                    z10 = false;
                }
                return (!z12 ? 2 : 0) | i10 | (z10 ? 4 : 0) | (z11 ? 8 : 0);
            }
            if (u1Var.y7.isSent()) {
                MessageObject messageObject2 = u1Var.y7;
                i10 = (messageObject2.scheduled || messageObject2.isUnread()) ? 0 : 1;
            } else {
                i10 = 0;
                z12 = false;
            }
            z10 = false;
        }
        z11 = false;
        messageObject = u1Var.y7;
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
        u1 u1Var = this.m3;
        ArrayList arrayList = u1Var.o7;
        ai.l4 l4Var = u1Var.S0;
        this.a = l4Var.getImageX();
        this.b = l4Var.getImageY();
        this.c = l4Var.getImageWidth();
        this.d = l4Var.getImageHeight();
        System.arraycopy(l4Var.getRoundRadius(), 0, this.t0, 0, 4);
        org.telegram.ui.ActionBar.f5 f5Var = u1Var.t8;
        if (f5Var != null) {
            this.D0.set(f5Var.getBounds());
        }
        this.E0 = u1Var.G8;
        MessageObject messageObject = u1Var.y7;
        this.I0 = messageObject != null ? messageObject.textLayoutBlocks : null;
        this.J0 = messageObject != null ? messageObject.textWidth : 0;
        this.Z0 = u1Var.ad;
        this.M0 = messageObject != null ? messageObject.richLayout : null;
        this.e = u1Var.p4;
        this.f = u1Var.q4;
        this.c1 = u1Var.c4;
        this.d1 = messageObject != null ? messageObject.summarized : false;
        ArrayList arrayList2 = this.L1;
        arrayList2.clear();
        if (!arrayList.isEmpty()) {
            arrayList2.addAll(arrayList);
        }
        this.u = u1Var.v1;
        this.v = u1Var.f0;
        this.w = u1Var.V;
        this.x = u1Var.d0;
        this.y = u1Var.S != null;
        this.z = u1Var.a0 != null;
        this.G1 = u1Var.m2;
        this.C1 = u1Var.t1;
        this.E1 = u1Var.u1;
        MessageObject messageObject2 = u1Var.y7;
        this.K2 = messageObject2 != null && messageObject2.type == 27 && (o0Var = u1Var.v) != null && o0Var.d();
        if (u1Var.Z8 != null) {
            this.M = u1Var.getRepliesCount();
            this.N = u1Var.h9;
            this.T = u1Var.Z8;
            this.O = u1Var.c9;
            this.P = u1Var.d9;
            this.Q = u1Var.e9;
            this.R = u1Var.g9;
            this.S = u1Var.b9;
        }
        this.E = u1Var.getRepliesCount();
        this.b2 = u1Var.getMessageObject().messageOwner.views;
        this.G = u1Var.Vb;
        this.c2 = u1Var.Sb;
        this.A = u1Var.Y7;
        this.e0 = u1Var.f7;
        this.k1 = u1Var.q8;
        this.m1 = u1Var.L5;
        this.S1 = u1Var.K4;
        this.T1 = u1Var.L4;
        this.X1 = u1Var.n2;
        this.e1 = !u1Var.vb;
        this.f1 = u1Var.rb;
        this.i2 = u1Var.ob;
        this.X0 = u1Var.pb;
        this.e2 = u1Var.f4();
        this.s2 = u1Var.getTopMediaOffset();
        this.g2 = u1Var.e4();
        this.j = u1Var.W3;
        this.j2 = u1Var.rd;
        this.m2 = u1Var.r0;
        this.p2 = u1Var.p0;
        this.P1 = u1Var.s7;
        StaticLayout[] staticLayoutArr = u1Var.fb;
        StaticLayout staticLayout = staticLayoutArr[0];
        StaticLayout[] staticLayoutArr2 = this.x2;
        staticLayoutArr2[0] = staticLayout;
        staticLayoutArr2[1] = staticLayoutArr[1];
        MessageObject messageObject3 = u1Var.y7;
        this.w2 = messageObject3 != null && messageObject3.needDrawForwarded();
        this.A2 = u1Var.ib;
        int i10 = u1Var.Lc;
        this.v2 = i10;
        this.H2 = i10;
        this.C2 = u1Var.gb;
        this.i1 = u1Var.getCurrentBackgroundLeft();
        org.telegram.ui.ActionBar.f5 f5Var2 = u1Var.t8;
        if (f5Var2 != null) {
            this.j1 = f5Var2.getBounds().right;
        }
        MessageObject messageObject4 = u1Var.y7;
        this.o2 = messageObject4 != null ? messageObject4.textXOffset : 0.0f;
        this.P0 = u1Var.M9;
        this.E2 = u1Var.D9;
        this.I2 = u1Var.N9;
        u1Var.N.r();
        if (u1Var.C9 != null) {
            this.s = u1Var.H9;
        } else {
            this.s = 0.0f;
        }
        this.M2 = u1Var.Za;
        this.N2 = u1Var.ab;
        this.S2 = u1Var.f2;
        this.Y2 = u1Var.getPrimaryMessageObject() != null && u1Var.getPrimaryMessageObject().factCheckExpanded;
        this.Q2 = u1Var.N1;
        this.V2 = u1Var.e2;
        this.a3 = u1Var.ha;
        this.c3 = u1Var.getPrimaryMessageObject() != null ? u1Var.getPrimaryMessageObject().expandedQuotes : null;
        MessageObject messageObject5 = u1Var.y7;
        this.f3 = messageObject5 != null && messageObject5.expandedExplanation;
        this.i3 = messageObject5 != null && messageObject5.translated;
        this.j3 = u1Var.J2;
    }

    public final void i() {
        u1 u1Var = this.m3;
        StaticLayout[] staticLayoutArr = u1Var.fb;
        StaticLayout staticLayout = staticLayoutArr[0];
        StaticLayout[] staticLayoutArr2 = this.x2;
        staticLayoutArr2[0] = staticLayout;
        staticLayoutArr2[1] = staticLayoutArr[1];
        this.w2 = u1Var.y7.needDrawForwarded();
        this.A2 = u1Var.ib;
        int i10 = u1Var.Lc;
        this.v2 = i10;
        this.H2 = i10;
        this.C2 = u1Var.gb;
    }

    public final void j() {
        u1 u1Var = this.m3;
        ai.l4 l4Var = u1Var.S0;
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
                    l4Var.setImageCoords(this.m0, this.n0, f7, f10);
                }
            }
        }
        if (this.B0) {
            l4Var.setRoundRadius(this.A0);
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
            richMessageLayout.detach(u1Var);
        }
        this.L0 = null;
        this.U0 = null;
        this.V0 = null;
        this.T0 = false;
        this.a1 = false;
        this.C0 = false;
        this.b1 = null;
        org.telegram.ui.Components.y5.release(u1Var, this.O0);
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
        zg.p0 p0Var = u1Var.N;
        ArrayList arrayList = p0Var.v;
        ArrayList arrayList2 = p0Var.w;
        for (int i10 = 0; i10 < arrayList2.size(); i10++) {
            ((zg.m0) arrayList2.get(i10)).b();
        }
        arrayList2.clear();
        p0Var.j = false;
        p0Var.k = false;
        p0Var.l = false;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            ((zg.m0) arrayList.get(i11)).c = 0;
        }
        this.k3 = null;
        org.telegram.ui.Components.y5.release(u1Var, this.l3);
    }
}
