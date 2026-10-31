package org.telegram.ui.Cells;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.text.style.StyleSpan;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.OvershootInterpolator;
import j$.util.Comparator$-CC;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Stack;
import java.util.regex.Pattern;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.ap;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cd;
import org.telegram.messenger.d20;
import org.telegram.messenger.h20;
import org.telegram.messenger.hs;
import org.telegram.messenger.ic;
import org.telegram.messenger.jj;
import org.telegram.messenger.sc;
import org.telegram.messenger.sp;
import org.telegram.messenger.tz;
import org.telegram.messenger.ui;
import org.telegram.messenger.vp;
import org.telegram.messenger.x00;
import org.telegram.messenger.z20;
import org.telegram.messenger.zs;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.bi0;
import org.telegram.ui.Components.dc;
import org.telegram.ui.Components.dq;
import org.telegram.ui.Components.e51;
import org.telegram.ui.Components.f11;
import org.telegram.ui.Components.f51;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.jc;
import org.telegram.ui.Components.l00;
import org.telegram.ui.Components.lh0;
import org.telegram.ui.Components.mh0;
import org.telegram.ui.Components.ov0;
import org.telegram.ui.Components.qv0;
import org.telegram.ui.Components.qz0;
import org.telegram.ui.Components.t60;
import org.telegram.ui.Components.vh0;
import org.telegram.ui.Components.wd0;
import org.telegram.ui.Components.wh0;
import org.telegram.ui.Components.wr;
import org.telegram.ui.Components.wy;
import org.telegram.ui.Components.x41;
import org.telegram.ui.ay;
import org.telegram.ui.h00;
import org.telegram.ui.k01;
import org.telegram.ui.xw;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public class v2 extends z implements th.k5, org.telegram.ui.ActionBar.k6 {
    public boolean A0;
    public boolean A1;
    public boolean A2;
    public boolean A3;
    public ValueAnimator A4;
    public boolean B0;
    public float B1;
    public float B2;
    public boolean B3;
    public long B4;
    public float C0;
    public float C1;
    public boolean C2;
    public int C3;
    public int C4;
    public boolean D;
    public yg.c D0;
    public float D1;
    public boolean D2;
    public int D3;
    public final ay D4;
    public boolean E;
    public int E0;
    public boolean E1;
    public Paint E2;
    public int E3;
    public StaticLayout E4;
    public boolean F;
    public final int F0;
    public final dc F1;
    public Paint F2;
    public float F3;
    public int F4;
    public g7 G;
    public q2 G0;
    public final Paint G1;
    public boolean G2;
    public boolean G3;
    public int G4;
    public int H;
    public long H0;
    public final RectF H1;
    public int H2;
    public boolean H3;
    public int H4;
    public int I;
    public String I0;
    public qz0 I1;
    public int I2;
    public int I3;
    public final s2 I4;
    public int J;
    public int J0;
    public boolean J1;
    public int J2;
    public LayerDrawable J3;
    public final org.telegram.ui.ActionBar.p6 J4;
    public int K;
    public long K0;
    public vh.m6 K1;
    public int K2;
    public int K3;
    public int K4;
    public final int L;
    public String L0;
    public boolean L1;
    public int L2;
    public boolean L3;
    public int L4;
    public final int M;
    public int M0;
    public int M1;
    public int M2;
    public int M3;
    public int M4;
    public TLRPC.TL_forumTopic N;
    public boolean N0;
    public int N1;
    public StaticLayout N2;
    public int N3;
    public u2 N4;
    public boolean O;
    public boolean O0;
    public String O1;
    public int O2;
    public int O3;
    public GradientDrawable O4;
    public boolean P;
    public boolean P0;
    public int P1;
    public boolean P2;
    public int P3;
    public int P4;
    public boolean Q;
    public boolean Q0;
    public bi0 Q1;
    public boolean Q2;
    public int Q3;
    public int Q4;
    public boolean R;
    public int R0;
    public int R1;
    public boolean R2;
    public boolean R3;
    public Paint R4;
    public Paint S;
    public int S0;
    public boolean S1;
    public boolean S2;
    public final fe.b S3;
    public kg.k1 S4;
    public Paint T;
    public boolean T0;
    public Paint T1;
    public int T2;
    public ValueAnimator T3;
    public Drawable T4;
    public float U;
    public int U0;
    public final boolean[] U1;
    public int U2;
    public ValueAnimator U3;
    public int U4;
    public boolean V;
    public int V0;
    public final ImageReceiver[] V1;
    public int V2;
    public float V3;
    public Drawable V4;
    public boolean W;
    public int W0;
    public final boolean[] W1;
    public int W2;
    public float W3;
    public Drawable W4;
    public boolean X0;
    public final boolean[] X1;
    public int X2;
    public StaticLayout X3;
    public ColorFilter[] X4;
    public int Y0;
    public final ImageReceiver Y1;
    public int Y2;
    public StaticLayout Y3;
    public int[] Y4;
    public boolean Z0;
    public wd0 Z1;
    public int Z2;
    public StaticLayout Z3;
    public Runnable Z4;
    public TextPaint a0;
    public boolean a1;
    public final org.telegram.ui.Components.r8 a2;
    public int a3;
    public StaticLayout a4;
    public Paint b0;
    public boolean b1;
    public boolean b2;
    public int b3;
    public boolean b4;
    public jc c0;
    public float c1;
    public float c2;
    public int c3;
    public boolean c4;
    public r2 d0;
    public boolean d1;
    public final p2 d2;
    public int d3;
    public boolean d4;
    public boolean e0;
    public boolean e1;
    public mh0 e2;
    public StaticLayout e3;
    public int e4;
    public boolean f;
    public boolean f0;
    public jj f1;
    public TLRPC.User f2;
    public StaticLayout f3;
    public int f4;
    public boolean g0;
    public ArrayList g1;
    public TLRPC.Chat g2;
    public int g3;
    public int g4;
    public final boolean h;
    public Drawable[] h0;
    public boolean h1;
    public TLRPC.EncryptedChat h2;
    public StaticLayout h3;
    public int h4;
    public float i0;
    public CharSequence i1;
    public CharSequence i2;
    public final Stack i3;
    public StaticLayout i4;
    public boolean j0;
    public int j1;
    public int j2;
    public final ArrayList j3;
    public boolean j4;
    public boolean k0;
    public int k1;
    public boolean k2;
    public final Stack k3;
    public boolean k4;
    public int l0;
    public int l1;
    public TLRPC.DraftMessage l2;
    public final ArrayList l3;
    public boolean l4;
    public float m0;
    public boolean m1;
    public final org.telegram.ui.Components.t5 m2;
    public org.telegram.ui.Components.k5 m3;
    public final bi.t0 m4;
    public float n;
    public f11 n0;
    public boolean n1;
    public boolean n2;
    public org.telegram.ui.Components.k5 n3;
    public final org.telegram.ui.Components.d5 n4;
    public Paint o0;
    public float o1;
    public final org.telegram.ui.Components.t5 o2;
    public org.telegram.ui.Components.k5 o3;
    public final org.telegram.ui.Components.d5 o4;
    public Paint p0;
    public float p1;
    public long p2;
    public org.telegram.ui.Components.k5 p3;
    public int p4;
    public boolean q0;
    public float q1;
    public n2 q2;
    public int q3;
    public boolean q4;
    public boolean r;
    public boolean r0;
    public float r1;
    public final boolean r2;
    public int r3;
    public final RectF r4;
    public bi0 s;
    public boolean s0;
    public int s1;
    public boolean s2;
    public StaticLayout s3;
    public zf.j s4;
    public ji.f t0;
    public float t1;
    public boolean t2;
    public boolean t3;
    public Path t4;
    public final m2 u0;
    public int u1;
    public boolean u2;
    public int u3;
    public RectF u4;
    public Path v0;
    public int v1;
    public boolean v2;
    public int v3;
    public int v4;
    public int w;
    public nh.i w0;
    public float w1;
    public boolean w2;
    public boolean w3;
    public int w4;
    public boolean x;
    public boolean x0;
    public boolean x1;
    public int x2;
    public float x3;
    public int x4;
    public boolean y;
    public boolean y0;
    public bi0 y1;
    public int y2;
    public boolean y3;
    public float y4;
    public boolean z0;
    public boolean z1;
    public StaticLayout z2;
    public boolean z3;
    public boolean z4;

    public v2(Context context, boolean z10) {
        this(null, context, z10, d20.s0, null);
    }

    public static SpannableStringBuilder P(int i10, CharSequence charSequence, CharSequence charSequence2) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (i10 == 1) {
            spannableStringBuilder.append(charSequence2).append((CharSequence) ": \u2068").append(charSequence).append((CharSequence) "\u2069");
            return spannableStringBuilder;
        }
        if (i10 == 2) {
            spannableStringBuilder.append((CharSequence) "\u2068").append(charSequence).append((CharSequence) "\u2069");
            return spannableStringBuilder;
        }
        if (i10 == 3) {
            spannableStringBuilder.append(charSequence2).append((CharSequence) ": ").append(charSequence);
            return spannableStringBuilder;
        }
        if (i10 != 4) {
            return spannableStringBuilder;
        }
        spannableStringBuilder.append(charSequence);
        return spannableStringBuilder;
    }

    private jj getCaptionMessage() {
        CharSequence charSequence;
        if (this.g1 == null) {
            jj jjVar = this.f1;
            if (jjVar == null || jjVar.z == null) {
                return null;
            }
            return jjVar;
        }
        int i10 = 0;
        jj jjVar2 = null;
        for (int i11 = 0; i11 < this.g1.size(); i11++) {
            jj jjVar3 = (jj) this.g1.get(i11);
            if (jjVar3 != null && (charSequence = jjVar3.z) != null) {
                if (!TextUtils.isEmpty(charSequence)) {
                    i10++;
                }
                jjVar2 = jjVar3;
            }
        }
        if (i10 > 1) {
            return null;
        }
        return jjVar2;
    }

    private int getCollapsedHeight() {
        boolean z10 = this.r2;
        int L = org.telegram.messenger.i0.L((z10 || tz.p1) ? this.K : this.J) + 1;
        if (this.Q) {
            L += org.telegram.messenger.i0.L(20.0f);
        }
        if (!T() || ((z10 || tz.p1) && !X())) {
            return L;
        }
        return org.telegram.messenger.i0.L(X() ? this.M : this.L) + L;
    }

    private Paint getPaintReorderGradient() {
        int w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.d6, this.J4);
        if (this.Q4 != w02 || this.R4 == null) {
            this.Q4 = w02;
            if (this.R4 == null) {
                this.R4 = new Paint(1);
            }
            this.R4.setShader(new LinearGradient(0.0f, 0.0f, org.telegram.messenger.i0.L(24.0f), 0.0f, new int[]{0, w02}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
        }
        return this.R4;
    }

    private TextPaint getTimeTextPaint() {
        return this.G3 ? U() ? org.telegram.ui.ActionBar.t6.J0 : org.telegram.ui.ActionBar.t6.K0 : org.telegram.ui.ActionBar.t6.I0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getTopicId() {
        TLRPC.TL_forumTopic tL_forumTopic = this.N;
        if (tL_forumTopic == null) {
            return 0;
        }
        return tL_forumTopic.id;
    }

    public final void A() {
        TLRPC.Message message;
        jj jjVar = this.f1;
        if (jjVar == null || (message = jjVar.k) == null) {
            return;
        }
        TLRPC.MessageAction messageAction = message.action;
        if ((messageAction instanceof TLRPC.TL_messageActionSetChatTheme) && this.X0) {
            org.telegram.messenger.g4 f7 = org.telegram.messenger.g4.f(this.F0);
            long j10 = this.H0;
            TLRPC.ChatTheme chatTheme = ((TLRPC.TL_messageActionSetChatTheme) messageAction).theme;
            f7.s(j10, yf.b.c(chatTheme), chatTheme, false);
        }
    }

    public final void B() {
        TLRPC.Chat chat = this.g2;
        boolean z10 = chat != null && chat.call_active && chat.call_not_empty;
        this.v2 = z10;
        this.q1 = z10 ? 1.0f : 0.0f;
    }

    public final void D() {
        TLRPC.User Z1;
        if (this.f2 != null && (Z1 = vp.r1(this.F0).Z1(Long.valueOf(this.f2.id))) != null) {
            this.f2 = Z1;
        }
        this.p1 = Y() ? 1.0f : 0.0f;
    }

    public final void F() {
        n2 n2Var;
        boolean z10 = this.l0 > 0 && !this.v2 && !Y() && ((n2Var = this.q2) == null || !n2Var.a.q) && !this.u0.w;
        this.w2 = z10;
        this.m0 = z10 ? 1.0f : 0.0f;
    }

    public final int G() {
        if (!X() || this.j0 || this.f) {
            return getCollapsedHeight();
        }
        int L = org.telegram.messenger.i0.L((this.r2 || tz.p1) ? 86.0f : 91.0f);
        if (this.s2) {
            L++;
        }
        return T() ? org.telegram.messenger.i0.L(this.M) + L : L;
    }

    public final void H(int i10, int i11) {
        this.y4 = 0.0f;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.A4 = ofFloat;
        ofFloat.setDuration(220L);
        this.A4.setInterpolator(gr.f);
        this.w4 = i10;
        this.v4 = i11;
        this.A4.addUpdateListener(new j2(this, 2));
        this.A4.addListener(new o2(this, 2));
        this.z4 = true;
        this.A4.start();
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x0224, code lost:
    
        if (r3 > 0) goto L63;
     */
    /* JADX WARN: Removed duplicated region for block: B:110:0x071f  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x072c  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x063f  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x06c4  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x06d1  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x06f1  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0718  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0702  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x033e  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0325  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x026c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean I(Canvas canvas) {
        boolean z10;
        float f7;
        int L;
        int i10;
        float L2;
        float L3;
        float L4;
        float f10;
        float L5;
        float L6;
        float L7;
        float f11;
        float L8;
        float L9;
        float f12;
        float L10;
        float L11;
        float f13;
        float f14;
        float f15;
        boolean z11;
        boolean z12;
        float L12;
        ImageReceiver imageReceiver;
        Drawable drawable;
        Drawable drawable2;
        BitmapShader bitmapShader;
        n2 n2Var;
        BitmapShader bitmapShader2;
        TLRPC.Chat chat = this.g2;
        boolean z13 = false;
        if (chat == null || (chat.flags2 & 2048) == 0) {
            z10 = false;
        } else {
            float A = this.Y1.A();
            float y3 = this.Y1.y();
            n2 n2Var2 = this.q2;
            float progress = (n2Var2 == null || !n2Var2.a.q) ? 1.0f : 1.0f - n2Var2.getProgress();
            if (this.W4 == null) {
                this.W4 = getContext().getResources().getDrawable(R.drawable.star_small_outline).mutate();
            }
            int x02 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.d6, false);
            if (this.U4 != x02) {
                Drawable drawable3 = this.W4;
                this.U4 = x02;
                drawable3.setColorFilter(new PorterDuffColorFilter(x02, PorterDuff.Mode.SRC_IN));
            }
            if (this.V4 == null) {
                this.V4 = getContext().getResources().getDrawable(R.drawable.star_small_inner).mutate();
            }
            int L13 = org.telegram.messenger.i0.L(19.33f);
            Rect rect = org.telegram.messenger.i0.Q;
            int i11 = (int) y3;
            int i12 = (int) A;
            int i13 = i12 - L13;
            rect.set((org.telegram.messenger.i0.L(1.66f) + i11) - L13, i13, org.telegram.messenger.i0.L(1.66f) + i11, i12);
            rect.inset(-org.telegram.messenger.i0.L(1.0f), -org.telegram.messenger.i0.L(1.0f));
            this.W4.setBounds(rect);
            int i14 = (int) (progress * 255.0f);
            this.W4.setAlpha(i14);
            this.W4.draw(canvas);
            rect.set((org.telegram.messenger.i0.L(1.66f) + i11) - L13, i13, org.telegram.messenger.i0.L(1.66f) + i11, i12);
            this.V4.setBounds(rect);
            this.V4.setAlpha(i14);
            this.V4.draw(canvas);
            z10 = true;
        }
        float d = this.m2.d(this.n2 && !z10);
        float f16 = 10.0f;
        if (d > 0.0f) {
            float s10 = this.Y1.s() + org.telegram.messenger.i0.L(18.0f);
            float r10 = this.Y1.r() + org.telegram.messenger.i0.L(18.0f);
            canvas.save();
            org.telegram.ui.ActionBar.t6.t0.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.d6, this.J4));
            canvas.drawCircle(r10, s10, org.telegram.messenger.i0.L(11.33f) * d, org.telegram.ui.ActionBar.t6.t0);
            if (this.S4 == null) {
                this.S4 = new kg.k1(org.telegram.ui.ActionBar.t6.zk, org.telegram.ui.ActionBar.t6.Ak, -1, -1, this.J4);
            }
            this.S4.d((int) (r10 - org.telegram.messenger.i0.L(10.0f)), 0.0f, (int) (s10 - org.telegram.messenger.i0.L(10.0f)), (int) (org.telegram.messenger.i0.L(10.0f) + r10), 0.0f, (int) (org.telegram.messenger.i0.L(10.0f) + s10));
            canvas.drawCircle(r10, s10, org.telegram.messenger.i0.L(10.0f) * d, this.S4.f);
            if (this.T4 == null) {
                Drawable mutate = getContext().getResources().getDrawable(R.drawable.msg_mini_lock2).mutate();
                this.T4 = mutate;
                mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
            }
            this.T4.setBounds((int) (r10 - (((r4.getIntrinsicWidth() / 2.0f) * 0.875f) * d)), (int) (s10 - (((this.T4.getIntrinsicHeight() / 2.0f) * 0.875f) * d)), (int) (((this.T4.getIntrinsicWidth() / 2.0f) * 0.875f * d) + r10), (int) (((this.T4.getIntrinsicHeight() / 2.0f) * 0.875f * d) + s10));
            this.T4.setAlpha((int) (d * 255.0f));
            this.T4.draw(canvas);
            canvas.restore();
            return false;
        }
        if (!this.N0 || this.J0 != 0 || z10) {
            return false;
        }
        boolean z14 = (this.l0 <= 0 || Y() || this.v2 || this.u0.w) ? false : true;
        this.w2 = z14;
        if (this.i0 != 1.0f && (z14 || this.m0 > 0.0f)) {
            f11 f11Var = this.n0;
            if (f11Var != null) {
                int i15 = f11Var.f;
                int i16 = this.l0;
                if (i15 != i16) {
                }
                if (this.o0 == null) {
                    this.o0 = new Paint(1);
                    Paint paint = new Paint(1);
                    this.p0 = paint;
                    paint.setColor(838860800);
                }
                int A2 = (int) (this.Y1.A() - org.telegram.messenger.i0.L(9.0f));
                int L14 = (int) (!cd.X ? this.u0.F.left + org.telegram.messenger.i0.L(9.0f) : this.u0.F.right - org.telegram.messenger.i0.L(9.0f));
                this.n0.setBounds(0, 0, org.telegram.messenger.i0.L(22.0f), org.telegram.messenger.i0.L(22.0f));
                this.n0.b(this.l0);
                imageReceiver = this.Y1;
                drawable = imageReceiver.a0;
                if (drawable != null || (bitmapShader2 = imageReceiver.b0) == null) {
                    drawable2 = imageReceiver.m0;
                    if (drawable2 != null || (bitmapShader = imageReceiver.c0) == null) {
                        this.o0.setShader(null);
                        if (this.Y1.n() == null && !this.Y1.n().isRecycled()) {
                            this.o0.setColor(org.telegram.messenger.i0.J0(this.Y1.n()));
                        } else if (this.Y1.t() instanceof g61) {
                            this.o0.setColor(this.a2.c());
                        } else {
                            this.o0.setColor(((g61) this.Y1.t()).a.a());
                        }
                        canvas.save();
                        float f17 = (1.0f - this.i0) * this.m0;
                        n2Var = this.q2;
                        if (n2Var != null) {
                            f17 *= 1.0f - n2Var.getProgress();
                        }
                        float f18 = L14;
                        float f19 = A2;
                        canvas.scale(f17, f17, f18, f19);
                        canvas.drawCircle(f18, f19, org.telegram.messenger.i0.N(11.0f), this.o0);
                        canvas.drawCircle(f18, f19, org.telegram.messenger.i0.N(11.0f), this.p0);
                        canvas.save();
                        canvas.translate(f18 - org.telegram.messenger.i0.N(11.0f), f19 - org.telegram.messenger.i0.N(11.0f));
                        this.n0.draw(canvas);
                        canvas.restore();
                        canvas.restore();
                    } else {
                        imageReceiver.j(null, drawable2, zs.e4, bitmapShader, 0, 0, 0, null);
                    }
                } else {
                    imageReceiver.j(null, drawable, zs.e4, bitmapShader2, 0, 0, 0, null);
                }
                ImageReceiver imageReceiver2 = this.Y1;
                BitmapShader bitmapShader3 = imageReceiver2.b0;
                if (bitmapShader3 != null) {
                    this.o0.setShader(bitmapShader3);
                } else {
                    BitmapShader bitmapShader4 = imageReceiver2.c0;
                    if (bitmapShader4 != null) {
                        this.o0.setShader(bitmapShader4);
                    }
                }
                canvas.save();
                float f172 = (1.0f - this.i0) * this.m0;
                n2Var = this.q2;
                if (n2Var != null) {
                }
                float f182 = L14;
                float f192 = A2;
                canvas.scale(f172, f172, f182, f192);
                canvas.drawCircle(f182, f192, org.telegram.messenger.i0.N(11.0f), this.o0);
                canvas.drawCircle(f182, f192, org.telegram.messenger.i0.N(11.0f), this.p0);
                canvas.save();
                canvas.translate(f182 - org.telegram.messenger.i0.N(11.0f), f192 - org.telegram.messenger.i0.N(11.0f));
                this.n0.draw(canvas);
                canvas.restore();
                canvas.restore();
            }
            int i17 = this.l0;
            f11 f11Var2 = new f11(org.telegram.messenger.w0.b, null);
            f11Var2.m = true;
            f11Var2.b(i17);
            this.n0 = f11Var2;
            if (this.o0 == null) {
            }
            int A22 = (int) (this.Y1.A() - org.telegram.messenger.i0.L(9.0f));
            int L142 = (int) (!cd.X ? this.u0.F.left + org.telegram.messenger.i0.L(9.0f) : this.u0.F.right - org.telegram.messenger.i0.L(9.0f));
            this.n0.setBounds(0, 0, org.telegram.messenger.i0.L(22.0f), org.telegram.messenger.i0.L(22.0f));
            this.n0.b(this.l0);
            imageReceiver = this.Y1;
            drawable = imageReceiver.a0;
            if (drawable != null) {
            }
            drawable2 = imageReceiver.m0;
            if (drawable2 != null) {
            }
            this.o0.setShader(null);
            if (this.Y1.n() == null) {
            }
            if (this.Y1.t() instanceof g61) {
            }
            canvas.save();
            float f1722 = (1.0f - this.i0) * this.m0;
            n2Var = this.q2;
            if (n2Var != null) {
            }
            float f1822 = L142;
            float f1922 = A22;
            canvas.scale(f1722, f1722, f1822, f1922);
            canvas.drawCircle(f1822, f1922, org.telegram.messenger.i0.N(11.0f), this.o0);
            canvas.drawCircle(f1822, f1922, org.telegram.messenger.i0.N(11.0f), this.p0);
            canvas.save();
            canvas.translate(f1822 - org.telegram.messenger.i0.N(11.0f), f1922 - org.telegram.messenger.i0.N(11.0f));
            this.n0.draw(canvas);
            canvas.restore();
            canvas.restore();
        }
        TLRPC.User user = this.f2;
        if (user == null || vp.E2(user) || this.f2.bot) {
            TLRPC.Chat chat2 = this.g2;
            if (chat2 != null) {
                boolean z15 = chat2.call_active && chat2.call_not_empty;
                this.v2 = z15;
                if ((z15 || this.q1 != 0.0f) && this.i0 < 1.0f) {
                    n2 n2Var3 = this.q2;
                    float progress2 = (n2Var3 == null || !n2Var3.a.q) ? 1.0f : 1.0f - n2Var3.getProgress();
                    int L15 = (int) (this.u0.F.bottom - org.telegram.messenger.i0.L((this.r2 || tz.p1) ? 6.0f : 8.0f));
                    if (cd.X) {
                        float f20 = this.u0.F.left;
                        f7 = 0.10666667f;
                        if (!this.r2 && !tz.p1) {
                            f16 = 6.0f;
                        }
                        L = (int) (f20 + org.telegram.messenger.i0.L(f16));
                    } else {
                        f7 = 0.10666667f;
                        float f21 = this.u0.F.right;
                        if (!this.r2 && !tz.p1) {
                            f16 = 6.0f;
                        }
                        L = (int) (f21 - org.telegram.messenger.i0.L(f16));
                    }
                    if (this.i0 != 0.0f) {
                        canvas.save();
                        float f22 = 1.0f - this.i0;
                        canvas.scale(f22, f22, L, L15);
                    }
                    Paint paint2 = org.telegram.ui.ActionBar.t6.t0;
                    int i18 = org.telegram.ui.ActionBar.t6.d6;
                    paint2.setColor(org.telegram.ui.ActionBar.t6.w0(i18, this.J4));
                    float f23 = L;
                    float f24 = L15;
                    canvas.drawCircle(f23, f24, org.telegram.messenger.i0.L(11.0f) * this.q1 * progress2, org.telegram.ui.ActionBar.t6.t0);
                    org.telegram.ui.ActionBar.t6.t0.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.T8, this.J4));
                    canvas.drawCircle(f23, f24, org.telegram.messenger.i0.L(9.0f) * this.q1 * progress2, org.telegram.ui.ActionBar.t6.t0);
                    org.telegram.ui.ActionBar.t6.t0.setColor(org.telegram.ui.ActionBar.t6.w0(i18, this.J4));
                    if (!sc.e(360928)) {
                        this.r1 = 0.65f;
                    }
                    int i19 = this.s1;
                    if (i19 != 0) {
                        i10 = 360928;
                        if (i19 != 1) {
                            if (i19 != 2) {
                                if (i19 == 3) {
                                    L2 = org.telegram.messenger.i0.L(3.0f) - (org.telegram.messenger.i0.L(2.0f) * this.r1);
                                    L3 = org.telegram.messenger.i0.L(1.0f);
                                    L4 = org.telegram.messenger.i0.L(2.0f);
                                    f10 = this.r1;
                                } else if (i19 == 4) {
                                    L2 = (org.telegram.messenger.i0.L(4.0f) * this.r1) + org.telegram.messenger.i0.L(1.0f);
                                    L10 = org.telegram.messenger.i0.L(3.0f);
                                    L11 = org.telegram.messenger.i0.L(2.0f);
                                    f13 = this.r1;
                                } else if (i19 == 5) {
                                    L5 = org.telegram.messenger.i0.L(5.0f) - (org.telegram.messenger.i0.L(4.0f) * this.r1);
                                    L8 = org.telegram.messenger.i0.L(1.0f);
                                    L9 = org.telegram.messenger.i0.L(4.0f);
                                    f12 = this.r1;
                                } else if (i19 == 6) {
                                    L5 = org.telegram.messenger.i0.L(1.0f) + (org.telegram.messenger.i0.L(4.0f) * this.r1);
                                    L6 = org.telegram.messenger.i0.L(5.0f);
                                    L7 = org.telegram.messenger.i0.L(4.0f);
                                    f11 = this.r1;
                                } else {
                                    L2 = org.telegram.messenger.i0.L(5.0f) - (org.telegram.messenger.i0.L(4.0f) * this.r1);
                                    L3 = org.telegram.messenger.i0.L(1.0f);
                                    L4 = org.telegram.messenger.i0.L(2.0f);
                                    f10 = this.r1;
                                }
                                f14 = L3 + (L4 * f10);
                                if (this.q1 >= 1.0f || progress2 < 1.0f) {
                                    canvas.save();
                                    float f25 = this.q1 * progress2;
                                    canvas.scale(f25, f25, f23, f24);
                                }
                                z11 = true;
                                this.r4.set(L - org.telegram.messenger.i0.L(1.0f), f24 - L2, org.telegram.messenger.i0.L(1.0f) + L, L2 + f24);
                                canvas.drawRoundRect(this.r4, org.telegram.messenger.i0.L(1.0f), org.telegram.messenger.i0.L(1.0f), org.telegram.ui.ActionBar.t6.t0);
                                float f26 = f24 - f14;
                                float f27 = f24 + f14;
                                this.r4.set(L - org.telegram.messenger.i0.L(5.0f), f26, L - org.telegram.messenger.i0.L(3.0f), f27);
                                canvas.drawRoundRect(this.r4, org.telegram.messenger.i0.L(1.0f), org.telegram.messenger.i0.L(1.0f), org.telegram.ui.ActionBar.t6.t0);
                                this.r4.set(org.telegram.messenger.i0.L(3.0f) + L, f26, org.telegram.messenger.i0.L(5.0f) + L, f27);
                                canvas.drawRoundRect(this.r4, org.telegram.messenger.i0.L(1.0f), org.telegram.messenger.i0.L(1.0f), org.telegram.ui.ActionBar.t6.t0);
                                if (this.q1 >= 1.0f || progress2 < 1.0f) {
                                    canvas.restore();
                                }
                                if (sc.e(i10)) {
                                    float f28 = this.r1 + 0.04f;
                                    this.r1 = f28;
                                    if (f28 >= 1.0f) {
                                        this.r1 = 0.0f;
                                        int i20 = this.s1 + 1;
                                        this.s1 = i20;
                                        if (i20 >= 8) {
                                            this.s1 = 0;
                                        }
                                    }
                                    z13 = true;
                                }
                                if (this.v2) {
                                    float f29 = this.q1;
                                    if (f29 > 0.0f) {
                                        float f30 = f29 - f7;
                                        this.q1 = f30;
                                        if (f30 < 0.0f) {
                                            this.q1 = 0.0f;
                                        }
                                    }
                                } else {
                                    float f31 = this.q1;
                                    if (f31 < 1.0f) {
                                        float f32 = f31 + f7;
                                        this.q1 = f32;
                                        if (f32 > 1.0f) {
                                            this.q1 = 1.0f;
                                        }
                                    }
                                }
                                if (this.i0 != 0.0f) {
                                    canvas.restore();
                                }
                                if (this.w2) {
                                    float f33 = this.m0;
                                    if (f33 < 1.0f) {
                                        this.m0 = f33 + f7;
                                        z12 = z11;
                                    }
                                    z12 = z13;
                                } else {
                                    float f34 = this.m0;
                                    if (f34 > 0.0f) {
                                        this.m0 = f34 - f7;
                                        z12 = z11;
                                    }
                                    z12 = z13;
                                }
                                this.m0 = Utilities.i(this.m0, 1.0f, 0.0f);
                                return z12;
                            }
                            L5 = org.telegram.messenger.i0.L(1.0f) + (org.telegram.messenger.i0.L(2.0f) * this.r1);
                            L6 = org.telegram.messenger.i0.L(5.0f);
                            L7 = org.telegram.messenger.i0.L(4.0f);
                            f11 = this.r1;
                            f15 = L6 - (L7 * f11);
                            L2 = L5;
                            f14 = f15;
                            if (this.q1 >= 1.0f) {
                            }
                            canvas.save();
                            float f252 = this.q1 * progress2;
                            canvas.scale(f252, f252, f23, f24);
                            z11 = true;
                            this.r4.set(L - org.telegram.messenger.i0.L(1.0f), f24 - L2, org.telegram.messenger.i0.L(1.0f) + L, L2 + f24);
                            canvas.drawRoundRect(this.r4, org.telegram.messenger.i0.L(1.0f), org.telegram.messenger.i0.L(1.0f), org.telegram.ui.ActionBar.t6.t0);
                            float f262 = f24 - f14;
                            float f272 = f24 + f14;
                            this.r4.set(L - org.telegram.messenger.i0.L(5.0f), f262, L - org.telegram.messenger.i0.L(3.0f), f272);
                            canvas.drawRoundRect(this.r4, org.telegram.messenger.i0.L(1.0f), org.telegram.messenger.i0.L(1.0f), org.telegram.ui.ActionBar.t6.t0);
                            this.r4.set(org.telegram.messenger.i0.L(3.0f) + L, f262, org.telegram.messenger.i0.L(5.0f) + L, f272);
                            canvas.drawRoundRect(this.r4, org.telegram.messenger.i0.L(1.0f), org.telegram.messenger.i0.L(1.0f), org.telegram.ui.ActionBar.t6.t0);
                            if (this.q1 >= 1.0f) {
                            }
                            canvas.restore();
                            if (sc.e(i10)) {
                            }
                            if (this.v2) {
                            }
                            if (this.i0 != 0.0f) {
                            }
                            if (this.w2) {
                            }
                            this.m0 = Utilities.i(this.m0, 1.0f, 0.0f);
                            return z12;
                        }
                        L5 = org.telegram.messenger.i0.L(5.0f) - (org.telegram.messenger.i0.L(4.0f) * this.r1);
                        L8 = org.telegram.messenger.i0.L(1.0f);
                        L9 = org.telegram.messenger.i0.L(4.0f);
                        f12 = this.r1;
                        f15 = L8 + (L9 * f12);
                        L2 = L5;
                        f14 = f15;
                        if (this.q1 >= 1.0f) {
                        }
                        canvas.save();
                        float f2522 = this.q1 * progress2;
                        canvas.scale(f2522, f2522, f23, f24);
                        z11 = true;
                        this.r4.set(L - org.telegram.messenger.i0.L(1.0f), f24 - L2, org.telegram.messenger.i0.L(1.0f) + L, L2 + f24);
                        canvas.drawRoundRect(this.r4, org.telegram.messenger.i0.L(1.0f), org.telegram.messenger.i0.L(1.0f), org.telegram.ui.ActionBar.t6.t0);
                        float f2622 = f24 - f14;
                        float f2722 = f24 + f14;
                        this.r4.set(L - org.telegram.messenger.i0.L(5.0f), f2622, L - org.telegram.messenger.i0.L(3.0f), f2722);
                        canvas.drawRoundRect(this.r4, org.telegram.messenger.i0.L(1.0f), org.telegram.messenger.i0.L(1.0f), org.telegram.ui.ActionBar.t6.t0);
                        this.r4.set(org.telegram.messenger.i0.L(3.0f) + L, f2622, org.telegram.messenger.i0.L(5.0f) + L, f2722);
                        canvas.drawRoundRect(this.r4, org.telegram.messenger.i0.L(1.0f), org.telegram.messenger.i0.L(1.0f), org.telegram.ui.ActionBar.t6.t0);
                        if (this.q1 >= 1.0f) {
                        }
                        canvas.restore();
                        if (sc.e(i10)) {
                        }
                        if (this.v2) {
                        }
                        if (this.i0 != 0.0f) {
                        }
                        if (this.w2) {
                        }
                        this.m0 = Utilities.i(this.m0, 1.0f, 0.0f);
                        return z12;
                    }
                    i10 = 360928;
                    L2 = (org.telegram.messenger.i0.L(4.0f) * this.r1) + org.telegram.messenger.i0.L(1.0f);
                    L10 = org.telegram.messenger.i0.L(3.0f);
                    L11 = org.telegram.messenger.i0.L(2.0f);
                    f13 = this.r1;
                    f14 = L10 - (L11 * f13);
                    if (this.q1 >= 1.0f) {
                    }
                    canvas.save();
                    float f25222 = this.q1 * progress2;
                    canvas.scale(f25222, f25222, f23, f24);
                    z11 = true;
                    this.r4.set(L - org.telegram.messenger.i0.L(1.0f), f24 - L2, org.telegram.messenger.i0.L(1.0f) + L, L2 + f24);
                    canvas.drawRoundRect(this.r4, org.telegram.messenger.i0.L(1.0f), org.telegram.messenger.i0.L(1.0f), org.telegram.ui.ActionBar.t6.t0);
                    float f26222 = f24 - f14;
                    float f27222 = f24 + f14;
                    this.r4.set(L - org.telegram.messenger.i0.L(5.0f), f26222, L - org.telegram.messenger.i0.L(3.0f), f27222);
                    canvas.drawRoundRect(this.r4, org.telegram.messenger.i0.L(1.0f), org.telegram.messenger.i0.L(1.0f), org.telegram.ui.ActionBar.t6.t0);
                    this.r4.set(org.telegram.messenger.i0.L(3.0f) + L, f26222, org.telegram.messenger.i0.L(5.0f) + L, f27222);
                    canvas.drawRoundRect(this.r4, org.telegram.messenger.i0.L(1.0f), org.telegram.messenger.i0.L(1.0f), org.telegram.ui.ActionBar.t6.t0);
                    if (this.q1 >= 1.0f) {
                    }
                    canvas.restore();
                    if (sc.e(i10)) {
                    }
                    if (this.v2) {
                    }
                    if (this.i0 != 0.0f) {
                    }
                    if (this.w2) {
                    }
                    this.m0 = Utilities.i(this.m0, 1.0f, 0.0f);
                    return z12;
                }
            }
        } else {
            boolean Y = Y();
            this.B0 = Y;
            if (Y || this.p1 != 0.0f) {
                int L16 = (int) (this.u0.F.bottom - org.telegram.messenger.i0.L((this.r2 || tz.p1) ? 6.0f : 8.0f));
                if (cd.X) {
                    float f35 = this.u0.F.left;
                    if (!this.r2 && !tz.p1) {
                        f16 = 6.0f;
                    }
                    L12 = f35 + org.telegram.messenger.i0.L(f16);
                } else {
                    float f36 = this.u0.F.right;
                    if (!this.r2 && !tz.p1) {
                        f16 = 6.0f;
                    }
                    L12 = f36 - org.telegram.messenger.i0.L(f16);
                }
                int i21 = (int) L12;
                org.telegram.ui.ActionBar.t6.t0.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.d6, this.J4));
                float f37 = i21;
                float f38 = L16;
                canvas.drawCircle(f37, f38, org.telegram.messenger.i0.L(7.0f) * this.p1, org.telegram.ui.ActionBar.t6.t0);
                org.telegram.ui.ActionBar.t6.t0.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.T8, this.J4));
                canvas.drawCircle(f37, f38, org.telegram.messenger.i0.L(5.0f) * this.p1, org.telegram.ui.ActionBar.t6.t0);
                if (Y) {
                    float f39 = this.p1;
                    if (f39 < 1.0f) {
                        float f40 = f39 + 0.10666667f;
                        this.p1 = f40;
                        if (f40 > 1.0f) {
                            this.p1 = 1.0f;
                        }
                        z13 = true;
                    }
                } else {
                    float f41 = this.p1;
                    if (f41 > 0.0f) {
                        float f42 = f41 - 0.10666667f;
                        this.p1 = f42;
                        if (f42 < 0.0f) {
                            this.p1 = 0.0f;
                        }
                        z13 = true;
                    }
                }
            }
        }
        f7 = 0.10666667f;
        z11 = true;
        if (this.w2) {
        }
        this.m0 = Utilities.i(this.m0, 1.0f, 0.0f);
        return z12;
    }

    public final void J(Canvas canvas, boolean z10, boolean z11, boolean z12, boolean z13, float f7) {
        if (f7 != 0.0f || z13) {
            float f10 = (f7 * 0.5f) + 0.5f;
            if (z10) {
                z.t(this.V2, this.W2, org.telegram.ui.ActionBar.t6.X0);
                if (f7 != 1.0f) {
                    canvas.save();
                    canvas.scale(f10, f10, org.telegram.ui.ActionBar.t6.X0.getBounds().centerX(), org.telegram.ui.ActionBar.t6.W0.getBounds().centerY());
                    org.telegram.ui.ActionBar.t6.X0.setAlpha((int) (f7 * 255.0f));
                }
                org.telegram.ui.ActionBar.t6.X0.draw(canvas);
                if (f7 != 1.0f) {
                    canvas.restore();
                    org.telegram.ui.ActionBar.t6.X0.setAlpha(zs.e4);
                }
                invalidate();
                return;
            }
            if (z12) {
                if (!z11) {
                    z.t(this.U2, this.W2, org.telegram.ui.ActionBar.t6.T0);
                    if (f7 != 1.0f) {
                        canvas.save();
                        canvas.scale(f10, f10, org.telegram.ui.ActionBar.t6.T0.getBounds().centerX(), org.telegram.ui.ActionBar.t6.W0.getBounds().centerY());
                        org.telegram.ui.ActionBar.t6.T0.setAlpha((int) (f7 * 255.0f));
                    }
                    org.telegram.ui.ActionBar.t6.T0.draw(canvas);
                    if (f7 != 1.0f) {
                        canvas.restore();
                        org.telegram.ui.ActionBar.t6.T0.setAlpha(zs.e4);
                        return;
                    }
                    return;
                }
                z.t(this.X2, this.W2, org.telegram.ui.ActionBar.t6.W0);
                if (z13) {
                    canvas.save();
                    canvas.scale(f10, f10, org.telegram.ui.ActionBar.t6.W0.getBounds().centerX(), org.telegram.ui.ActionBar.t6.W0.getBounds().centerY());
                    org.telegram.ui.ActionBar.t6.W0.setAlpha((int) (f7 * 255.0f));
                }
                if (!z13 && f7 != 0.0f) {
                    canvas.save();
                    canvas.scale(f10, f10, org.telegram.ui.ActionBar.t6.W0.getBounds().centerX(), org.telegram.ui.ActionBar.t6.W0.getBounds().centerY());
                    int i10 = (int) (255.0f * f7);
                    org.telegram.ui.ActionBar.t6.W0.setAlpha(i10);
                    org.telegram.ui.ActionBar.t6.V0.setAlpha(i10);
                }
                org.telegram.ui.ActionBar.t6.W0.draw(canvas);
                if (z13) {
                    canvas.restore();
                    canvas.save();
                    canvas.translate((1.0f - f7) * org.telegram.messenger.i0.L(4.0f), 0.0f);
                }
                z.t(this.T2, this.W2, org.telegram.ui.ActionBar.t6.V0);
                org.telegram.ui.ActionBar.t6.V0.draw(canvas);
                if (z13) {
                    canvas.restore();
                    org.telegram.ui.ActionBar.t6.W0.setAlpha(zs.e4);
                }
                if (z13 || f7 == 0.0f) {
                    return;
                }
                canvas.restore();
                org.telegram.ui.ActionBar.t6.W0.setAlpha(zs.e4);
                org.telegram.ui.ActionBar.t6.V0.setAlpha(zs.e4);
            }
        }
    }

    public final void K(Canvas canvas, boolean z10, int i10, int i11, int i12, float f7, boolean z11) {
        float f10;
        Paint paint;
        boolean z12;
        RectF rectF;
        RectF rectF2;
        boolean z13 = X() || W();
        if (!(this.G3 && this.L3) && this.V3 == 1.0f) {
            return;
        }
        float f11 = (this.S0 != 0 || this.T0) ? this.V3 : 1.0f - this.V3;
        int i13 = zs.e4;
        if (z11) {
            if (this.T == null) {
                Paint paint2 = new Paint();
                this.T = paint2;
                paint2.setStyle(Paint.Style.STROKE);
                this.T.setStrokeWidth(org.telegram.messenger.i0.L(2.0f));
                this.T.setStrokeJoin(Paint.Join.ROUND);
                this.T.setStrokeCap(Paint.Cap.ROUND);
            }
            f10 = 1.0f;
            this.T.setColor(i0.b.f(Color.alpha(r14) / 255.0f, org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.d6, false), i0.b.o(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.s9, false), zs.e4)));
        } else {
            f10 = 1.0f;
        }
        if (this.P && this.N.read_inbox_max_id == 0) {
            if (this.S == null) {
                this.S = new Paint();
            }
            paint = this.S;
            int w02 = org.telegram.ui.ActionBar.t6.w0(z10 ? org.telegram.ui.ActionBar.t6.Sk : org.telegram.ui.ActionBar.t6.Rk, this.J4);
            paint.setColor(w02);
            org.telegram.ui.ActionBar.t6.M0.setColor(w02);
            i13 = z10 ? 30 : 40;
            z12 = true;
        } else {
            paint = (z10 || this.J0 != 0) ? org.telegram.ui.ActionBar.t6.y0 : org.telegram.ui.ActionBar.t6.w0;
            z12 = false;
        }
        StaticLayout staticLayout = this.Y3;
        RectF rectF3 = this.r4;
        if (staticLayout == null || this.S0 == 0) {
            if (this.S0 != 0) {
                staticLayout = this.X3;
            }
            paint.setAlpha((int) ((f10 - this.x3) * i13));
            org.telegram.ui.ActionBar.t6.M0.setAlpha((int) ((f10 - this.x3) * 255.0f));
            float f12 = i10;
            rectF3.set(i11, f12, org.telegram.messenger.i0.L(12.666f) + this.O3 + i11, org.telegram.messenger.i0.L(20.666f) + i10);
            int save = canvas.save();
            if (f7 != f10) {
                canvas.scale(f7, f7, rectF3.centerX(), rectF3.centerY());
            }
            if (f11 != f10) {
                canvas.scale(f11, f11, rectF3.centerX(), rectF3.centerY());
            }
            if (z13) {
                if (this.t4 == null || (rectF = this.u4) == null || !rectF.equals(rectF3)) {
                    RectF rectF4 = this.u4;
                    if (rectF4 == null) {
                        this.u4 = new RectF(rectF3);
                    } else {
                        rectF4.set(rectF3);
                    }
                    if (this.t4 == null) {
                        this.t4 = new Path();
                    }
                    w7.z5.a(this.t4, this.u4, org.telegram.messenger.i0.L(10.33f));
                }
                canvas.drawPath(this.t4, paint);
                if (z11) {
                    canvas.drawPath(this.t4, this.T);
                }
            } else {
                canvas.drawRoundRect(rectF3, org.telegram.messenger.i0.L(11.5f), org.telegram.messenger.i0.L(11.5f), paint);
                if (z11) {
                    canvas.drawRoundRect(rectF3, org.telegram.messenger.i0.L(11.5f), org.telegram.messenger.i0.L(11.5f), this.T);
                }
            }
            if (staticLayout != null) {
                canvas.save();
                canvas.translate(org.telegram.messenger.i0.L(6.333f) + i11, org.telegram.messenger.i0.N(3.0f) + f12);
                staticLayout.draw(canvas);
                canvas.restore();
            }
            canvas.restoreToCount(save);
        } else {
            paint.setAlpha((int) ((f10 - this.x3) * i13));
            org.telegram.ui.ActionBar.t6.M0.setAlpha((int) ((f10 - this.x3) * 255.0f));
            float f13 = f11 * 2.0f;
            float f14 = f13 > f10 ? f10 : f13;
            float f15 = f10 - f14;
            float f16 = (i12 * f15) + (i11 * f14);
            float f17 = i10;
            rectF3.set(f16, f17, (this.P3 * f15) + (this.O3 * f14) + f16 + org.telegram.messenger.i0.L(12.666f), org.telegram.messenger.i0.L(20.666f) + i10);
            float interpolation = ((f11 <= 0.5f ? gr.g.getInterpolation(f13) : gr.i.getInterpolation(f10 - ((f11 - 0.5f) * 2.0f))) * 0.1f) + f10;
            canvas.save();
            float f18 = interpolation * f7;
            canvas.scale(f18, f18, rectF3.centerX(), rectF3.centerY());
            if (z13) {
                if (this.t4 == null || (rectF2 = this.u4) == null || !rectF2.equals(rectF3)) {
                    RectF rectF5 = this.u4;
                    if (rectF5 == null) {
                        this.u4 = new RectF(rectF3);
                    } else {
                        rectF5.set(rectF3);
                    }
                    if (this.t4 == null) {
                        this.t4 = new Path();
                    }
                    w7.z5.a(this.t4, this.u4, org.telegram.messenger.i0.L(10.33f));
                }
                canvas.drawPath(this.t4, paint);
                if (z11) {
                    canvas.drawPath(this.t4, this.T);
                }
            } else {
                canvas.drawRoundRect(rectF3, org.telegram.messenger.i0.L(11.5f), org.telegram.messenger.i0.L(11.5f), paint);
                if (z11) {
                    canvas.drawRoundRect(rectF3, org.telegram.messenger.i0.L(11.5f), org.telegram.messenger.i0.L(11.5f), this.T);
                }
            }
            if (this.Z3 != null) {
                canvas.save();
                canvas.translate(org.telegram.messenger.i0.N(6.333f) + f16, org.telegram.messenger.i0.N(3.0f) + f17);
                this.Z3.draw(canvas);
                canvas.restore();
            }
            int alpha = org.telegram.ui.ActionBar.t6.M0.getAlpha();
            float f19 = alpha;
            org.telegram.ui.ActionBar.t6.M0.setAlpha((int) (f19 * f14));
            if (this.a4 != null) {
                canvas.save();
                canvas.translate(org.telegram.messenger.i0.N(6.333f) + f16, org.telegram.messenger.i0.N(3.0f) + ((this.R3 ? org.telegram.messenger.i0.L(17.0f) : -org.telegram.messenger.i0.L(17.0f)) * f15) + f17);
                this.a4.draw(canvas);
                canvas.restore();
            } else if (this.X3 != null) {
                canvas.save();
                canvas.translate(org.telegram.messenger.i0.N(6.333f) + f16, org.telegram.messenger.i0.N(3.0f) + ((this.R3 ? org.telegram.messenger.i0.L(17.0f) : -org.telegram.messenger.i0.L(17.0f)) * f15) + f17);
                this.X3.draw(canvas);
                canvas.restore();
            }
            if (this.Y3 != null) {
                org.telegram.ui.ActionBar.t6.M0.setAlpha((int) (f19 * f15));
                canvas.save();
                canvas.translate(org.telegram.messenger.i0.N(6.333f) + f16, org.telegram.messenger.i0.N(3.0f) + ((this.R3 ? -org.telegram.messenger.i0.L(17.0f) : org.telegram.messenger.i0.L(17.0f)) * f14) + f17);
                this.Y3.draw(canvas);
                canvas.restore();
            }
            org.telegram.ui.ActionBar.t6.M0.setAlpha(alpha);
            canvas.restore();
        }
        if (z12) {
            org.telegram.ui.ActionBar.t6.M0.setColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.W8, false));
        }
    }

    public boolean L() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00e4 A[EDGE_INSN: B:23:0x00e4->B:24:0x00e4 BREAK  A[LOOP:0: B:2:0x001d->B:34:0x00e0], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0088  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final CharSequence N() {
        TLRPC.Chat L0;
        TLRPC.User user;
        TLRPC.User Z1;
        String L02;
        int i10 = this.F0;
        vp r12 = vp.r1(i10);
        ArrayList V0 = r12.V0(this.J0);
        this.M0 = V0.size();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int size = V0.size();
        for (int i11 = 0; i11 < size; i11++) {
            TLRPC.Dialog dialog = (TLRPC.Dialog) V0.get(i11);
            if (!r12.v2(dialog.id)) {
                if (!org.telegram.messenger.o5.C(dialog.id)) {
                    if (!org.telegram.messenger.o5.E(dialog.id)) {
                        L0 = r12.L0(Long.valueOf(-dialog.id));
                        user = null;
                        if (L0 == null) {
                            L02 = L0.title.replace('\n', ' ');
                        } else if (user == null) {
                            continue;
                        } else {
                            L02 = h20.x(user) ? cd.L0(2131749337, null) : org.telegram.messenger.i0.U(org.telegram.messenger.i5.m(0, user.first_name, user.last_name).replace('\n', ' '));
                        }
                        if (spannableStringBuilder.length() > 0) {
                            spannableStringBuilder.append((CharSequence) ", ");
                        }
                        int length = spannableStringBuilder.length();
                        int length2 = L02.length() + length;
                        spannableStringBuilder.append((CharSequence) L02);
                        if (dialog.unread_count > 0) {
                            spannableStringBuilder.setSpan(new x41(org.telegram.messenger.i0.o(), org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Y8, this.J4)), length, length2, 33);
                        }
                        if (spannableStringBuilder.length() <= 150) {
                            break;
                        }
                    } else {
                        Z1 = r12.Z1(Long.valueOf(dialog.id));
                    }
                } else {
                    TLRPC.EncryptedChat Z0 = r12.Z0(Integer.valueOf((int) (dialog.id & 4294967295L)));
                    Z1 = Z0 != null ? r12.Z1(Long.valueOf(Z0.user_id)) : null;
                }
                user = Z1;
                L0 = null;
                if (L0 == null) {
                }
                if (spannableStringBuilder.length() > 0) {
                }
                int length3 = spannableStringBuilder.length();
                int length22 = L02.length() + length3;
                spannableStringBuilder.append((CharSequence) L02);
                if (dialog.unread_count > 0) {
                }
                if (spannableStringBuilder.length() <= 150) {
                }
            }
        }
        if (vp.r1(i10).h0.D(true) > 0) {
            int max = Math.max(1, vp.r1(i10).h0.D(true));
            if (spannableStringBuilder.length() > 0) {
                spannableStringBuilder.append((CharSequence) ", ");
            }
            spannableStringBuilder.append((CharSequence) cd.G(max, "Stories", new Object[0]));
        }
        return org.telegram.messenger.k6.m(spannableStringBuilder, org.telegram.ui.ActionBar.t6.F0[this.E0].getFontMetricsInt(), false, null, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ea A[EDGE_INSN: B:26:0x00ea->B:27:0x00ea BREAK  A[LOOP:0: B:5:0x0023->B:31:0x00e6], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00e6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final CharSequence O() {
        TLRPC.Chat L0;
        TLRPC.User user;
        TLRPC.User Z1;
        String L02;
        vp r12 = vp.r1(this.F0);
        ArrayList arrayList = (ArrayList) r12.x.f(-this.H0);
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            TLRPC.Dialog dialog = (TLRPC.Dialog) arrayList.get(i10);
            if (!r12.v2(dialog.id)) {
                if (!org.telegram.messenger.o5.C(dialog.id)) {
                    if (!org.telegram.messenger.o5.E(dialog.id)) {
                        L0 = r12.L0(Long.valueOf(-dialog.id));
                        user = null;
                        if (L0 == null) {
                            L02 = L0.title.replace('\n', ' ');
                        } else if (user == null) {
                            continue;
                        } else {
                            L02 = h20.x(user) ? cd.L0(2131749337, null) : org.telegram.messenger.i0.U(org.telegram.messenger.i5.m(0, user.first_name, user.last_name).replace('\n', ' '));
                        }
                        if (spannableStringBuilder.length() > 0) {
                            spannableStringBuilder.append((CharSequence) ", ");
                        }
                        int length = spannableStringBuilder.length();
                        int length2 = L02.length() + length;
                        spannableStringBuilder.append((CharSequence) L02);
                        if (dialog.unread_count > 0) {
                            spannableStringBuilder.setSpan(new x41(org.telegram.messenger.i0.o(), org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Y8, this.J4)), length, length2, 33);
                        }
                        if (spannableStringBuilder.length() <= 150) {
                            break;
                        }
                    } else {
                        Z1 = r12.Z1(Long.valueOf(dialog.id));
                    }
                } else {
                    TLRPC.EncryptedChat Z0 = r12.Z0(Integer.valueOf((int) (dialog.id & 4294967295L)));
                    Z1 = Z0 != null ? r12.Z1(Long.valueOf(Z0.user_id)) : null;
                }
                user = Z1;
                L0 = null;
                if (L0 == null) {
                }
                if (spannableStringBuilder.length() > 0) {
                }
                int length3 = spannableStringBuilder.length();
                int length22 = L02.length() + length3;
                spannableStringBuilder.append((CharSequence) L02);
                if (dialog.unread_count > 0) {
                }
                if (spannableStringBuilder.length() <= 150) {
                }
            }
        }
        return org.telegram.messenger.k6.m(spannableStringBuilder, org.telegram.ui.ActionBar.t6.F0[this.E0].getFontMetricsInt(), false, null, 0);
    }

    public final CharSequence Q() {
        if (this.N4 == null) {
            this.N4 = new u2(this);
        }
        u2.a(this.N4, this.F0, this.f1, this.g2);
        this.N4.getClass();
        u2 u2Var = this.N4;
        this.M4 = u2Var.c;
        this.f0 = u2Var.d;
        return u2Var.g;
    }

    public final ColorFilter R(int i10, int i11) {
        if (this.X4 == null) {
            this.Y4 = new int[4];
            this.X4 = new ColorFilter[4];
        }
        if (i11 != this.Y4[i10] || this.X4[i10] == null) {
            ColorFilter[] colorFilterArr = this.X4;
            this.Y4[i10] = i11;
            colorFilterArr[i10] = new PorterDuffColorFilter(i11, PorterDuff.Mode.SRC_IN);
        }
        return this.X4[i10];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0, types: [android.view.View, org.telegram.ui.Cells.v2] */
    /* JADX WARN: Type inference failed for: r3v6, types: [android.text.Spannable, android.text.SpannableString, java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.CharSequence] */
    public final SpannableStringBuilder S(int i10, CharSequence charSequence, String str, boolean z10) {
        CharSequence M2;
        TLRPC.Message message;
        CharSequence charSequence2;
        String G;
        CharSequence charSequence3;
        SpannableStringBuilder valueOf;
        jj captionMessage = getCaptionMessage();
        jj jjVar = this.f1;
        CharSequence charSequence4 = jjVar != null ? jjVar.v : null;
        this.e0 = true;
        if (!TextUtils.isEmpty(str)) {
            return P(i10, str, charSequence);
        }
        jj jjVar2 = this.f1;
        TLRPC.Message message2 = jjVar2.k;
        if (message2 instanceof TLRPC.TL_messageService) {
            CharSequence charSequence5 = jjVar2.w;
            if (charSequence5 == null || ((message2.action instanceof TLRPC.TL_messageActionTopicCreate) && this.P)) {
                charSequence5 = jjVar2.v;
            }
            if (jj.E4(jjVar2)) {
                valueOf = P(i10, charSequence5, charSequence);
                if (this.f1.g2[0] instanceof gg.a) {
                    int i11 = this.F0;
                    TLRPC.TL_forumTopic f7 = vp.r1(i11).r7.f(-jj.B0(this.f1.k), jj.c2(i11, this.f1.k, true, false));
                    if (f7 != null) {
                        ((gg.a) this.f1.g2[0]).b(f7.icon_color);
                    }
                }
            } else {
                this.e0 = false;
                valueOf = SpannableStringBuilder.valueOf(charSequence5);
            }
            if (z10) {
                y(valueOf);
            }
            return valueOf;
        }
        if (captionMessage != null && (charSequence3 = captionMessage.z) != null) {
            String charSequence6 = charSequence3.toString();
            String str2 = !this.V ? "" : jj.L4(captionMessage.k) ? "📹 " : jj.R4(captionMessage.k) ? "🎤 " : captionMessage.I3() ? "🎧 " : jj.S3(captionMessage.k) ? "🖼 " : "📎 ";
            if (captionMessage.s2() && !TextUtils.isEmpty(captionMessage.k.message)) {
                CharSequence charSequence7 = captionMessage.a2;
                int measuredWidth = getMeasuredWidth() - org.telegram.messenger.i0.L(this.I + 47);
                if (this.W) {
                    if (!TextUtils.isEmpty(charSequence)) {
                        measuredWidth = (int) (measuredWidth - this.a0.measureText(charSequence.toString()));
                    }
                    measuredWidth = (int) (measuredWidth - this.a0.measureText(": "));
                }
                if (measuredWidth > 0 && captionMessage.Z1) {
                    charSequence7 = org.telegram.messenger.i0.Q(charSequence7, (String) captionMessage.Y1.get(0), measuredWidth, this.a0);
                }
                return new SpannableStringBuilder(str2).append(charSequence7);
            }
            int length = charSequence6.length();
            CharSequence charSequence8 = charSequence6;
            if (length > 150) {
                charSequence8 = charSequence6.subSequence(0, zs.g2);
            }
            SpannableString spannableString = new SpannableString(charSequence8);
            captionMessage.S5();
            ui.g(captionMessage.k.entities, charSequence8, spannableString, zs.n4);
            TLRPC.Message message3 = captionMessage.k;
            if (message3 != null) {
                ArrayList<TLRPC.MessageEntity> arrayList = message3.entities;
                TextPaint textPaint = this.a0;
                ui.a(textPaint != null ? textPaint.getFontMetricsInt() : null, spannableString, arrayList);
            }
            CharSequence append = new SpannableStringBuilder(str2).append(org.telegram.messenger.i0.M2(spannableString));
            if (z10) {
                append = y(append);
            }
            return P(i10, append, charSequence);
        }
        TL_iv.RichMessage richMessage = message2.rich_message;
        org.telegram.ui.ActionBar.p6 p6Var = this.J4;
        if (richMessage != null) {
            boolean O2 = richMessage.blocks.size() == 1 ? jj.O2(this.f1.k.rich_message.blocks.get(0)) : false;
            SpannableStringBuilder P = P(i10, this.f1.v, charSequence);
            if (O2 && !X()) {
                try {
                    P.setSpan(new l00(org.telegram.ui.ActionBar.t6.p9, p6Var), this.W ? charSequence.length() + 2 : 0, P.length(), 33);
                    return P;
                } catch (Exception e) {
                    org.telegram.messenger.f8.g(e, true);
                }
            }
            return P;
        }
        if (message2.media == null || jjVar2.F3()) {
            jj jjVar3 = this.f1;
            String str3 = jjVar3.k.message;
            if (str3 == null) {
                return new SpannableStringBuilder();
            }
            if (jjVar3.s2()) {
                CharSequence charSequence9 = this.f1.a2;
                M2 = str3;
                if (charSequence9 != null) {
                    M2 = charSequence9;
                }
                int measuredWidth2 = getMeasuredWidth() - org.telegram.messenger.i0.L(this.I + 33);
                if (this.W) {
                    if (!TextUtils.isEmpty(charSequence)) {
                        measuredWidth2 = (int) (measuredWidth2 - this.a0.measureText(charSequence.toString()));
                    }
                    measuredWidth2 = (int) (measuredWidth2 - this.a0.measureText(": "));
                }
                if (measuredWidth2 > 0) {
                    M2 = org.telegram.messenger.i0.Q(M2, (String) this.f1.Y1.get(0), measuredWidth2, this.a0);
                }
            } else {
                int length2 = str3.length();
                CharSequence charSequence10 = str3;
                if (length2 > 150) {
                    charSequence10 = str3.subSequence(0, zs.g2);
                }
                M2 = org.telegram.messenger.i0.M2(charSequence10);
            }
            ?? spannableString2 = new SpannableString(M2);
            jj jjVar4 = this.f1;
            if (jjVar4 != null) {
                jjVar4.S5();
            }
            jj jjVar5 = this.f1;
            Pattern pattern = ui.R1;
            ui.g(jjVar5.k.entities, jjVar5.v, spannableString2, zs.n4);
            jj jjVar6 = this.f1;
            if (jjVar6 != null && (message = jjVar6.k) != null) {
                ArrayList<TLRPC.MessageEntity> arrayList2 = message.entities;
                TextPaint textPaint2 = this.a0;
                ui.a(textPaint2 != null ? textPaint2.getFontMetricsInt() : null, spannableString2, arrayList2);
            }
            if (z10) {
                spannableString2 = y(spannableString2);
            }
            return P(i10, spannableString2, charSequence);
        }
        this.a0 = org.telegram.ui.ActionBar.t6.H0[this.E0];
        int i12 = org.telegram.ui.ActionBar.t6.o9;
        jj jjVar7 = this.f1;
        TLRPC.MessageMedia messageMedia = jjVar7.k.media;
        if (messageMedia instanceof TLRPC.TL_messageMediaPoll) {
            TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) messageMedia;
            TLRPC.TL_textWithEntities tL_textWithEntities = tL_messageMediaPoll.poll.question;
            if (tL_textWithEntities == null || tL_textWithEntities.entities == null) {
                charSequence2 = eh.a.a(R.drawable.dialog_media_poll_20, tL_textWithEntities.text, true);
            } else {
                SpannableString spannableString3 = new SpannableString(tL_messageMediaPoll.poll.question.text.replace('\n', ' '));
                TLRPC.TL_textWithEntities tL_textWithEntities2 = tL_messageMediaPoll.poll.question;
                ui.g(tL_textWithEntities2.entities, tL_textWithEntities2.text, spannableString3, -1);
                ui.a(org.telegram.ui.ActionBar.t6.F0[this.E0].getFontMetricsInt(), spannableString3, tL_messageMediaPoll.poll.question.entities);
                charSequence2 = eh.a.a(R.drawable.dialog_media_poll_20, spannableString3, true);
            }
        } else if (messageMedia instanceof TLRPC.TL_messageMediaToDo) {
            TLRPC.TL_messageMediaToDo tL_messageMediaToDo = (TLRPC.TL_messageMediaToDo) messageMedia;
            TLRPC.TL_textWithEntities tL_textWithEntities3 = tL_messageMediaToDo.todo.title;
            if (tL_textWithEntities3 == null || tL_textWithEntities3.entities == null) {
                charSequence2 = eh.a.a(R.drawable.dialog_media_checklist_20, tL_textWithEntities3.text, true);
            } else {
                SpannableString spannableString4 = new SpannableString(tL_messageMediaToDo.todo.title.text.replace('\n', ' '));
                TLRPC.TL_textWithEntities tL_textWithEntities4 = tL_messageMediaToDo.todo.title;
                ui.g(tL_textWithEntities4.entities, tL_textWithEntities4.text, spannableString4, -1);
                ui.a(org.telegram.ui.ActionBar.t6.F0[this.E0].getFontMetricsInt(), spannableString4, tL_messageMediaToDo.todo.title.entities);
                charSequence2 = eh.a.a(R.drawable.dialog_media_checklist_20, spannableString4, true);
            }
        } else if (messageMedia instanceof TLRPC.TL_messageMediaGame) {
            charSequence2 = eh.a.a(R.drawable.dialog_media_game_20, messageMedia.game.title, true);
        } else if (messageMedia instanceof TLRPC.TL_messageMediaInvoice) {
            charSequence2 = messageMedia.title;
        } else if (jjVar7.D == 14) {
            charSequence2 = f1.o("🎧 \u2068", jjVar7.x1(true), " - ", this.f1.z1(true), "\u2069");
        } else if (messageMedia instanceof TLRPC.TL_messageMediaPaidMedia) {
            int size = ((TLRPC.TL_messageMediaPaidMedia) messageMedia).extended_media.size();
            charSequence2 = rh.h8.S0(cd.a0(null, null, 2131753949, this.S1 ? size > 1 ? cd.G(size, "Media", new Object[0]) : cd.L0(2131753933, null) : size > 1 ? cd.G(size, "Photos", new Object[0]) : cd.L0(2131753948, null)));
            i12 = org.telegram.ui.ActionBar.t6.p9;
        } else if (this.R1 > 1) {
            if (this.S1) {
                ArrayList arrayList3 = this.g1;
                G = cd.G(arrayList3 == null ? 0 : arrayList3.size(), "Media", new Object[0]);
            } else {
                ArrayList arrayList4 = this.g1;
                G = cd.G(arrayList4 == null ? 0 : arrayList4.size(), "Photos", new Object[0]);
            }
            charSequence2 = G;
            i12 = org.telegram.ui.ActionBar.t6.p9;
        } else {
            charSequence2 = charSequence4.toString();
            i12 = org.telegram.ui.ActionBar.t6.p9;
        }
        if (charSequence2 instanceof String) {
            charSequence2 = ((String) charSequence2).replace('\n', ' ');
        }
        if (z10) {
            charSequence2 = y(charSequence2);
        }
        SpannableStringBuilder P2 = P(i10, charSequence2, charSequence);
        if (!X()) {
            try {
                P2.setSpan(new l00(i12, p6Var), this.W ? charSequence.length() + 2 : 0, P2.length(), 33);
                return P2;
            } catch (Exception e7) {
                org.telegram.messenger.f8.g(e7, true);
            }
        }
        return P2;
    }

    public final boolean T() {
        ji.f fVar = this.t0;
        return (fVar == null || ((ArrayList) fVar.d).isEmpty()) ? false : true;
    }

    public final boolean U() {
        if (org.telegram.messenger.w3.Y(this.g2)) {
            return !this.e1;
        }
        if (this.P) {
            return this.a1;
        }
        TLRPC.Chat chat = this.g2;
        return (chat != null && chat.forum && this.N == null) ? !this.d1 : this.Z0;
    }

    public final boolean V() {
        return this.J0 > 0;
    }

    public final boolean W() {
        return this.J0 != 0;
    }

    public boolean X() {
        TLRPC.Chat chat;
        if (V() || this.P0 || (chat = this.g2) == null) {
            return false;
        }
        if (!chat.forum) {
            if (!org.telegram.messenger.w3.p0(chat)) {
                return false;
            }
            if (!org.telegram.messenger.w3.A(this.F0, this.g2, 24)) {
                return false;
            }
        }
        return !this.P;
    }

    public final boolean Y() {
        TLRPC.User user;
        if (X() || this.u0.w || (user = this.f2) == null || user.self) {
            return false;
        }
        TLRPC.UserStatus userStatus = user.status;
        int i10 = this.F0;
        if (userStatus != null && userStatus.expires <= 0 && vp.r1(i10).Z.containsKey(Long.valueOf(this.f2.id))) {
            return true;
        }
        TLRPC.UserStatus userStatus2 = this.f2.status;
        return userStatus2 != null && userStatus2.expires > ConnectionsManager.getInstance(i10).getCurrentTime();
    }

    public final boolean Z(float f7) {
        return !cd.X ? f7 >= 0.0f && f7 < ((float) org.telegram.messenger.i0.L(60.0f)) : f7 >= ((float) (getMeasuredWidth() - org.telegram.messenger.i0.L(60.0f))) && f7 < ((float) getMeasuredWidth());
    }

    public final void a0(boolean z10, boolean z11) {
        if ((!getIsPinned() && z10) || this.y3 == z10) {
            if (getIsPinned()) {
                return;
            }
            this.y3 = false;
        } else {
            this.y3 = z10;
            if (z11) {
                this.x3 = z10 ? 0.0f : 1.0f;
            } else {
                this.x3 = z10 ? 1.0f : 0.0f;
            }
            invalidate();
        }
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Y8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.i9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.g9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.o9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.X8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.j9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.p9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.k9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.y6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.d6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.k7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.d9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.c9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Y5));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.s9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Z8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.n9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.m9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.l9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.h9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.z9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Ci));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Gi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.V8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.U8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.zk));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Ak));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.T8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Sk));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Rk));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.W8));
    }

    public final void b0() {
        boolean z10 = tz.q1;
        this.m1 = z10;
        float f7 = z10 ? 0.0f : 1.0f;
        this.D1 = f7;
        this.a2.o = f7;
        this.t1 = 0.0f;
        this.x1 = false;
        this.x3 = (getIsPinned() && this.y3) ? 1.0f : 0.0f;
        this.w3 = true;
        this.o1 = 0.0f;
        setTranslationX(0.0f);
        setTranslationY(0.0f);
        org.telegram.ui.Components.d5 d5Var = this.n4;
        if (d5Var != null && this.w3) {
            d5Var.a();
        }
        org.telegram.ui.Components.d5 d5Var2 = this.o4;
        if (d5Var2 == null || !this.w3) {
            return;
        }
        d5Var2.a();
    }

    public final void c0(boolean z10, boolean z11) {
        n2 n2Var = this.q2;
        if (n2Var != null || z10) {
            if (n2Var == null) {
                n2 n2Var2 = new n2(this, getContext(), this.J4, 0);
                this.q2 = n2Var2;
                n2Var2.b(-1, org.telegram.ui.ActionBar.t6.d6, org.telegram.ui.ActionBar.t6.k7);
                this.q2.setDrawUnchecked(false);
                this.q2.setDrawBackgroundAsArc(3);
                addView(this.q2);
            }
            this.q2.a(z10, z11);
            F();
        }
    }

    public final void d0(long j10, jj jjVar, int i10, boolean z10, boolean z11) {
        if (this.H0 != j10) {
            this.x4 = -1;
        }
        this.H0 = j10;
        this.B4 = System.currentTimeMillis();
        this.f1 = jjVar;
        this.u2 = z10;
        this.N0 = false;
        this.R0 = i10;
        if (jjVar != null) {
            int i11 = jjVar.k.edit_date;
        }
        this.S0 = 0;
        this.T0 = false;
        this.l1 = jjVar != null ? jjVar.f1() : 0;
        this.U0 = 0;
        this.V0 = 0;
        this.W0 = 0;
        this.X0 = jjVar != null && jjVar.F4();
        jj jjVar2 = this.f1;
        if (jjVar2 != null) {
            this.Y0 = jjVar2.k.send_state;
        }
        i0(0, z11);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if ((!this.P && !this.F && motionEvent.getAction() == 1) || motionEvent.getAction() == 3) {
            this.u0.a(this, motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void e0(TLRPC.Dialog dialog, int i10, int i11) {
        if (this.H0 != dialog.id) {
            ValueAnimator valueAnimator = this.A4;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.A4.cancel();
            }
            this.z4 = false;
            this.x4 = -1;
        }
        this.H0 = dialog.id;
        this.B4 = System.currentTimeMillis();
        this.N0 = true;
        if (dialog instanceof TLRPC.TL_dialogCommunity) {
            this.K0 = dialog.community_id;
        } else {
            this.K0 = 0L;
        }
        if (dialog instanceof TLRPC.TL_dialogFolder) {
            this.J0 = ((TLRPC.TL_dialogFolder) dialog).folder.id;
            mh0 mh0Var = this.e2;
            if (mh0Var != null) {
                mh0Var.H = this;
                mh0Var.i();
            }
        } else {
            this.J0 = 0;
        }
        this.j1 = i10;
        boolean z10 = i10 == 3;
        Runnable runnable = this.Z4;
        if (z10 != (runnable != null)) {
            if (!z10 && runnable != null) {
                runnable.run();
                this.Z4 = null;
            } else if (z10) {
                this.Z4 = zs.f(this.F0).h(this, zs.i3, new l2(this, 0));
            }
        }
        if (this.t0 == null) {
            this.t0 = new ji.f(this);
        }
        this.k1 = i11;
        this.l1 = 0;
        if (i0(0, false)) {
            requestLayout();
        }
        D();
        B();
        A();
        F();
    }

    public final void f0(TLRPC.TL_forumTopic tL_forumTopic, long j10, jj jjVar, boolean z10, boolean z11) {
        mh0 mh0Var;
        this.N = tL_forumTopic;
        this.P = tL_forumTopic != null;
        if (this.H0 != j10) {
            this.x4 = -1;
        }
        Drawable drawable = jjVar.g2[0];
        if (drawable instanceof gg.a) {
            ((gg.a) drawable).b(tL_forumTopic.icon_color);
        }
        this.H0 = j10;
        this.B4 = System.currentTimeMillis();
        this.f1 = jjVar;
        this.N0 = false;
        this.g0 = z10;
        this.R0 = jjVar.k.date;
        this.T0 = false;
        this.l1 = jjVar.f1();
        this.X0 = jjVar.F4();
        jj jjVar2 = this.f1;
        if (jjVar2 != null) {
            this.Y0 = jjVar2.k.send_state;
        }
        if (!z11) {
            this.x4 = -1;
        }
        if (tL_forumTopic != null) {
            this.g1 = tL_forumTopic.groupedMessages;
        }
        TLRPC.TL_forumTopic tL_forumTopic2 = this.N;
        if (tL_forumTopic2 != null && tL_forumTopic2.id == 1 && (mh0Var = this.e2) != null) {
            mh0Var.H = this;
            mh0Var.i();
        }
        i0(0, z11);
    }

    public final void g0(int i10, jj jjVar) {
        TLRPC.MessageMedia messageMedia;
        ArrayList<TLRPC.PhotoSize> arrayList = jjVar.n0;
        TLObject tLObject = jjVar.l0;
        if (jjVar.y4()) {
            TL_stories.StoryItem storyItem = jjVar.k.media.storyItem;
            if (storyItem == null || (messageMedia = storyItem.media) == null) {
                return;
            }
            TLRPC.Document document = messageMedia.document;
            if (document != null) {
                arrayList = document.thumbs;
                tLObject = document;
            } else {
                TLRPC.Photo photo = messageMedia.photo;
                if (photo != null) {
                    arrayList = photo.sizes;
                    tLObject = photo;
                }
            }
        }
        TLRPC.PhotoSize R = org.telegram.messenger.b8.R(arrayList);
        if (R == null) {
            R = org.telegram.messenger.b8.w(arrayList, 40, false, null, false);
        }
        TLRPC.PhotoSize w9 = org.telegram.messenger.b8.w(arrayList, org.telegram.messenger.i0.Z0(false), false, null, true);
        TLRPC.PhotoSize photoSize = R != w9 ? w9 : null;
        if (photoSize == null || !org.telegram.messenger.b6.q(this.F0).d(jjVar)) {
            photoSize = R;
        }
        if (R != null) {
            this.S1 = this.S1 || jj.L4(jjVar.k) || jjVar.h4();
            int i11 = this.R1;
            if (i11 < 3) {
                this.R1 = i11 + 1;
                this.W1[i10] = (jj.L4(jjVar.k) || jjVar.h4()) && !jjVar.t2();
                this.X1[i10] = jjVar.t2();
                int i12 = (jjVar.D != 1 || photoSize == null) ? 0 : photoSize.size;
                String str = jjVar.t2() ? "5_5_b" : "20_20";
                ImageReceiver[] imageReceiverArr = this.V1;
                imageReceiverArr[i10].r0(ic.f(photoSize, tLObject), str, ic.f(R, tLObject), str, null, i12, null, jjVar, 0);
                imageReceiverArr[i10].J0(org.telegram.messenger.i0.L(jjVar.h4() ? 18.0f : 2.0f));
                this.V = false;
            }
        }
    }

    public float getClipProgress() {
        return this.t1;
    }

    public int getCurrentDialogFolderId() {
        return this.J0;
    }

    public long getDialogId() {
        return this.H0;
    }

    public boolean getHasUnread() {
        return this.S0 != 0 || this.T0;
    }

    public boolean getIsMuted() {
        return this.Z0;
    }

    public boolean getIsPinned() {
        return this.A3 || this.B3;
    }

    public jj getMessage() {
        return this.f1;
    }

    public int getMessageId() {
        return this.l1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x005a, code lost:
    
        if (r2 != r9) goto L48;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String getMessageNameString() {
        TLRPC.Chat L0;
        TLRPC.User user;
        String str;
        TLRPC.Message message;
        TLRPC.MessageFwdHeader messageFwdHeader;
        String str2;
        jj jjVar;
        TLRPC.Message message2;
        TLRPC.User Z1;
        jj jjVar2;
        TLRPC.Message message3;
        TLRPC.MessageFwdHeader messageFwdHeader2;
        TLRPC.Message message4;
        TLRPC.MessageFwdHeader messageFwdHeader3;
        TLRPC.MessageFwdHeader messageFwdHeader4;
        jj jjVar3 = this.f1;
        if (jjVar3 != null) {
            long Z0 = jjVar3.Z0();
            int i10 = this.F0;
            long e = d20.i(i10).e();
            if (!this.r0 && this.H0 == e) {
                long Q1 = this.f1.Q1();
                if (Q1 != e) {
                    if (Q1 != 2666000) {
                        TLRPC.Message message5 = this.f1.k;
                        if (message5 != null && (messageFwdHeader4 = message5.fwd_from) != null) {
                            long o10 = org.telegram.messenger.o5.o(messageFwdHeader4.saved_from_id);
                            if (o10 == 0) {
                                o10 = org.telegram.messenger.o5.o(this.f1.k.fwd_from.from_id);
                            }
                            if (o10 > 0) {
                            }
                        }
                        Z0 = Q1;
                    }
                }
            }
            if (this.r0 && (message4 = this.f1.k) != null && (messageFwdHeader3 = message4.fwd_from) != null) {
                Z0 = org.telegram.messenger.o5.o(messageFwdHeader3.saved_from_id);
                if (Z0 == 0) {
                    Z0 = org.telegram.messenger.o5.o(this.f1.k.fwd_from.from_id);
                }
            }
            if (org.telegram.messenger.o5.E(Z0)) {
                user = vp.r1(i10).Z1(Long.valueOf(Z0));
                L0 = null;
            } else {
                L0 = vp.r1(i10).L0(Long.valueOf(-Z0));
                user = null;
            }
            long j10 = this.H0;
            if (j10 != e) {
                if (j10 == 489000 && (jjVar2 = this.f1) != null && (message3 = jjVar2.k) != null && (messageFwdHeader2 = message3.fwd_from) != null) {
                    String str3 = messageFwdHeader2.from_name;
                    if (str3 != null) {
                        return org.telegram.messenger.i0.U(str3);
                    }
                    long o11 = org.telegram.messenger.o5.o(messageFwdHeader2.from_id);
                    if (org.telegram.messenger.o5.E(o11)) {
                        return h20.p(vp.r1(i10).Z1(Long.valueOf(o11)));
                    }
                    TLRPC.Chat L02 = vp.r1(i10).L0(Long.valueOf(-o11));
                    return L02 == null ? "" : L02.title;
                }
                if (this.f1.P3() && user != null) {
                    return cd.L0(2131750512, null);
                }
                if (!this.r0 && (jjVar = this.f1) != null && (message2 = jjVar.k) != null && (message2.from_id instanceof TLRPC.TL_peerUser) && (Z1 = vp.r1(i10).Z1(Long.valueOf(this.f1.k.from_id.user_id))) != null) {
                    return org.telegram.messenger.i0.U(h20.j(Z1, true).replace("\n", ""));
                }
                jj jjVar4 = this.f1;
                return (jjVar4 == null || (message = jjVar4.k) == null || (messageFwdHeader = message.fwd_from) == null || (str2 = messageFwdHeader.from_name) == null) ? user != null ? (this.r2 || tz.p1) ? h20.x(user) ? cd.L0(2131749337, null) : org.telegram.messenger.i0.U(org.telegram.messenger.i5.m(0, user.first_name, user.last_name).replace("\n", "")) : org.telegram.messenger.i0.U(h20.j(user, true).replace("\n", "")) : (L0 == null || (str = L0.title) == null) ? "DELETED" : org.telegram.messenger.i0.U(str.replace("\n", "")) : org.telegram.messenger.i0.U(str2);
            }
            if (user != null) {
                return org.telegram.messenger.i0.U(h20.j(user, true).replace("\n", ""));
            }
            if (L0 != null) {
                return org.telegram.messenger.i0.U(L0.title.replace("\n", ""));
            }
        }
        return null;
    }

    public long getStarsPrice() {
        return this.p2;
    }

    @Override // android.view.View
    public float getTranslationX() {
        return this.w1;
    }

    public final void h0() {
        mh0 mh0Var = this.e2;
        if (mh0Var != null) {
            if (this.P) {
                mh0Var.K = org.telegram.messenger.i0.L(24.0f);
                this.e2.L = org.telegram.messenger.i0.L(24.0f);
                this.e2.M = 0.0f;
            } else {
                m2 m2Var = this.u0;
                RectF rectF = m2Var.F;
                RectF rectF2 = m2Var.F;
                mh0Var.K = rectF.centerY();
                this.e2.L = rectF2.centerX();
                this.e2.M = rectF2.width() / 2.0f;
                if (!vp.r1(this.F0).O1().h.isEmpty()) {
                    this.e2.M -= org.telegram.messenger.i0.N(3.5f);
                }
                mh0 mh0Var2 = this.e2;
                this.Y1.q();
                mh0Var2.getClass();
            }
            mh0 mh0Var3 = this.e2;
            if (mh0Var3.E || mh0Var3.I == null) {
                return;
            }
            AnimatorSet animatorSet = mh0Var3.B;
            if (animatorSet != null) {
                animatorSet.removeAllListeners();
                mh0Var3.B.cancel();
            }
            mh0Var3.E = true;
            mh0Var3.F = true;
            mh0Var3.D = 0.0f;
            mh0Var3.I.getTranslationY();
            org.telegram.messenger.i0.L(100.0f);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addUpdateListener(new lh0(mh0Var3, 5));
            ofFloat.setInterpolator(gr.h);
            ofFloat.setDuration(250L);
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat2.addUpdateListener(new lh0(mh0Var3, 6));
            gr grVar = gr.j;
            ofFloat2.setInterpolator(grVar);
            ofFloat2.setDuration(150L);
            ValueAnimator ofFloat3 = ValueAnimator.ofFloat(1.0f, 0.0f);
            ofFloat3.addUpdateListener(new lh0(mh0Var3, 7));
            ofFloat3.setInterpolator(grVar);
            ofFloat3.setDuration(135L);
            AnimatorSet animatorSet2 = new AnimatorSet();
            mh0Var3.B = animatorSet2;
            animatorSet2.addListener(new t60(mh0Var3, 11));
            AnimatorSet animatorSet3 = new AnimatorSet();
            animatorSet3.playSequentially(ofFloat2, ofFloat3);
            animatorSet3.setStartDelay(180L);
            mh0Var3.B.playTogether(ofFloat, animatorSet3);
            mh0Var3.B.start();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:252:0x0539, code lost:
    
        if (org.telegram.messenger.w3.A(r8, r5, 24) != false) goto L283;
     */
    /* JADX WARN: Code restructure failed: missing block: B:389:0x098b, code lost:
    
        if ((java.lang.System.currentTimeMillis() - r41.B4) > 100) goto L522;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x03ad  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x059e  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x0681  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x0691  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x0696  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x06ad  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x06ef  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x07bb  */
    /* JADX WARN: Removed duplicated region for block: B:378:0x086c  */
    /* JADX WARN: Removed duplicated region for block: B:382:0x0969  */
    /* JADX WARN: Removed duplicated region for block: B:393:0x0ad1  */
    /* JADX WARN: Removed duplicated region for block: B:396:0x0add  */
    /* JADX WARN: Removed duplicated region for block: B:398:0x0ae2 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:408:0x0b3c  */
    /* JADX WARN: Removed duplicated region for block: B:415:0x0b4b  */
    /* JADX WARN: Removed duplicated region for block: B:417:0x0b4d  */
    /* JADX WARN: Removed duplicated region for block: B:441:0x0adf  */
    /* JADX WARN: Removed duplicated region for block: B:442:0x0ad3  */
    /* JADX WARN: Removed duplicated region for block: B:487:0x088c  */
    /* JADX WARN: Removed duplicated region for block: B:551:0x075e  */
    /* JADX WARN: Removed duplicated region for block: B:608:0x069c  */
    /* JADX WARN: Removed duplicated region for block: B:641:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:649:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01ba  */
    /* JADX WARN: Type inference failed for: r20v1 */
    /* JADX WARN: Type inference failed for: r20v2 */
    /* JADX WARN: Type inference failed for: r20v7 */
    /* JADX WARN: Type inference failed for: r20v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean i0(int i10, boolean z10) {
        boolean z11;
        int i11;
        org.telegram.ui.Components.r8 r8Var;
        int i12;
        boolean z12;
        boolean z13;
        int i13;
        ImageReceiver imageReceiver;
        boolean z14;
        boolean z15;
        boolean z16;
        int i14;
        boolean z17;
        int i15;
        long j10;
        ImageReceiver imageReceiver2;
        int i16;
        jj jjVar;
        boolean z18;
        boolean z19;
        float f7;
        boolean z20;
        int L;
        TLRPC.User user;
        TLRPC.Chat chat;
        int i17;
        TLRPC.Chat L0;
        ArrayList c42;
        jj jjVar2;
        jj jjVar3;
        boolean z21;
        jj jjVar4;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        HashMap hashMap;
        jj jjVar5;
        boolean z22;
        long j11;
        boolean z23;
        int i24;
        ap apVar;
        int i25;
        ap apVar2;
        wr wrVar;
        ap apVar3;
        String str;
        jj jjVar6;
        int i26;
        jj jjVar7;
        ImageReceiver imageReceiver3;
        boolean X = X();
        boolean z24 = false;
        this.l0 = 0;
        q2 q2Var = this.G0;
        ImageReceiver imageReceiver4 = this.Y1;
        org.telegram.ui.Components.r8 r8Var2 = this.a2;
        int i27 = this.F0;
        if (q2Var != null) {
            this.R0 = q2Var.h;
            int i28 = q2Var.d;
            this.X0 = i28 != 0;
            this.S0 = i28;
            this.A3 = q2Var.e;
            this.Z0 = q2Var.f;
            this.d1 = false;
            this.e1 = false;
            r8Var2.k(q2Var.c, q2Var.a, null, null);
            if (this.F) {
                imageReceiver3 = imageReceiver4;
                imageReceiver3.o0(null, "50_50", this.G, null, 0L);
            } else {
                imageReceiver3 = imageReceiver4;
                imageReceiver3.o0(null, "50_50", r8Var2, null, 0L);
            }
            int i29 = 0;
            while (true) {
                ImageReceiver[] imageReceiverArr = this.V1;
                if (i29 >= imageReceiverArr.length) {
                    break;
                }
                imageReceiverArr[i29].w0(null);
                i29++;
            }
            this.D = false;
            this.E = false;
            imageReceiver3.J0(org.telegram.messenger.i0.L(26.0f));
            this.b1 = false;
            i14 = i27;
            z12 = X;
            z16 = false;
            z17 = false;
            f7 = 0.0f;
        } else {
            ImageReceiver imageReceiver5 = imageReceiver4;
            int i30 = this.S0;
            boolean z25 = this.V0 != 0;
            boolean z26 = this.T0;
            this.d1 = false;
            this.e1 = false;
            this.H4 = -1;
            boolean z27 = this.N0;
            int[] iArr = x00.n;
            if (z27) {
                boolean z28 = true;
                r8Var = r8Var2;
                i12 = 2;
                TLRPC.Dialog dialog = (TLRPC.Dialog) vp.r1(i27).Q.f(this.H0);
                if (dialog != null) {
                    this.H4 = dialog.read_outbox_max_id;
                    this.l0 = dialog.ttl_period;
                    if (i10 == 0) {
                        this.h1 = vp.r1(i27).E0.f(dialog.id) != null;
                        ArrayList arrayList = (ArrayList) vp.r1(i27).R.f(dialog.id);
                        this.g1 = arrayList;
                        jj jjVar8 = (arrayList == null || arrayList.size() <= 0) ? null : (jj) this.g1.get(0);
                        this.f1 = jjVar8;
                        this.X0 = jjVar8 != null && jjVar8.F4();
                        TLRPC.Chat L02 = vp.r1(i27).L0(Long.valueOf(-dialog.id));
                        if (L02 == null || !(L02.forum || (L02.monoforum && org.telegram.messenger.w3.A(i27, L02, 24)))) {
                            i11 = i27;
                            if (dialog instanceof TLRPC.TL_dialogFolder) {
                                this.S0 = hs.a0(i11).L;
                                this.U0 = 0;
                                this.V0 = 0;
                                this.W0 = 0;
                            } else {
                                if (dialog instanceof TLRPC.TL_dialogCommunity) {
                                    imageReceiver5 = imageReceiver5;
                                    sp P0 = vp.r1(i11).P0(-dialog.id);
                                    this.S0 = P0.a;
                                    this.U0 = P0.b;
                                    this.V0 = P0.c;
                                    this.W0 = P0.d;
                                    this.e1 = P0.e;
                                } else {
                                    imageReceiver5 = imageReceiver5;
                                    this.S0 = dialog.unread_count;
                                    this.U0 = dialog.unread_mentions_count;
                                    this.V0 = dialog.unread_reactions_count;
                                    this.W0 = dialog.unread_poll_votes_count;
                                }
                                if (org.telegram.messenger.w3.p0(L02)) {
                                    this.U0 = 0;
                                }
                                this.T0 = dialog.unread_mark;
                                jjVar6 = this.f1;
                                if (jjVar6 != null) {
                                    int i31 = jjVar6.k.edit_date;
                                }
                                this.R0 = dialog.last_message_date;
                                i26 = this.j1;
                                if (i26 != 7 || i26 == 8) {
                                    ap apVar4 = vp.r1(i11).M[this.j1 != 8 ? (char) 1 : (char) 0];
                                    this.A3 = apVar4 == null && apVar4.j.indexOfKey(dialog.id) >= 0;
                                } else {
                                    this.A3 = this.J0 == 0 && dialog.pinned;
                                }
                                jjVar7 = this.f1;
                                if (jjVar7 != null) {
                                    this.Y0 = jjVar7.k.send_state;
                                }
                            }
                        } else {
                            i11 = i27;
                            vp.r1(i27).r7.h(L02.id);
                            this.S0 = iArr[0];
                            this.U0 = iArr[1];
                            this.V0 = iArr[2];
                            this.d1 = iArr[3] != 0;
                            this.W0 = iArr[4];
                        }
                        imageReceiver5 = imageReceiver5;
                        if (org.telegram.messenger.w3.p0(L02)) {
                        }
                        this.T0 = dialog.unread_mark;
                        jjVar6 = this.f1;
                        if (jjVar6 != null) {
                        }
                        this.R0 = dialog.last_message_date;
                        i26 = this.j1;
                        if (i26 != 7) {
                        }
                        ap apVar42 = vp.r1(i11).M[this.j1 != 8 ? (char) 1 : (char) 0];
                        this.A3 = apVar42 == null && apVar42.j.indexOfKey(dialog.id) >= 0;
                        jjVar7 = this.f1;
                        if (jjVar7 != null) {
                        }
                    } else {
                        i11 = i27;
                    }
                } else {
                    i11 = i27;
                    this.S0 = 0;
                    this.U0 = 0;
                    this.V0 = 0;
                    this.W0 = 0;
                    this.R0 = 0;
                    this.h1 = false;
                }
                z11 = z28;
                if (this.H0 != 0) {
                    int i32 = k01.R;
                    z11 = z28;
                }
            } else {
                z11 = 1;
                i11 = i27;
                r8Var = r8Var2;
                i12 = 2;
                this.A3 = false;
            }
            TLRPC.TL_forumTopic tL_forumTopic = this.N;
            if (tL_forumTopic != null) {
                this.S0 = tL_forumTopic.unread_count;
                this.U0 = tL_forumTopic.unread_mentions_count;
                this.V0 = tL_forumTopic.unread_reactions_count;
                this.W0 = tL_forumTopic.unread_poll_votes_count;
            }
            if (this.j1 == i12) {
                this.A3 = false;
            }
            ji.f fVar = this.t0;
            if (fVar != null) {
                boolean isEmpty = ((ArrayList) fVar.d).isEmpty();
                ji.f fVar2 = this.t0;
                int i33 = this.j1;
                i13 = i30;
                long j12 = this.H0;
                v2 v2Var = (v2) fVar2.b;
                ArrayList arrayList2 = (ArrayList) fVar2.c;
                ArrayList arrayList3 = (ArrayList) fVar2.d;
                z13 = false;
                org.telegram.messenger.c a2 = org.telegram.messenger.c.a(i11);
                vp r12 = vp.r1(i11);
                imageReceiver = imageReceiver5;
                ap[] apVarArr = r12.M;
                if (r12.B7 && d20.i(a2.a).q()) {
                    ArrayList arrayList4 = r12.P0;
                    if (i33 == 7) {
                        apVar = apVarArr[0];
                        i24 = 8;
                    } else {
                        i24 = 8;
                        apVar = i33 == 8 ? apVarArr[z11] : null;
                    }
                    arrayList2.clear();
                    z12 = X;
                    if (i33 == 0 || i33 == 7 || i33 == i24) {
                        int i34 = 0;
                        while (i34 < arrayList4.size()) {
                            ap apVar5 = (ap) arrayList4.get(i34);
                            if (apVar5 != null) {
                                apVar2 = apVar;
                                i25 = i34;
                                if (apVar5 != apVar2 && apVar5.m >= 0 && apVar5.b(a2, j12)) {
                                    arrayList2.add(apVar5);
                                }
                            } else {
                                i25 = i34;
                                apVar2 = apVar;
                            }
                            i34 = i25 + 1;
                            apVar = apVar2;
                        }
                    }
                    int i35 = 0;
                    z23 = false;
                    while (i35 < arrayList3.size()) {
                        wr wrVar2 = (wr) arrayList3.get(i35);
                        int i36 = 0;
                        while (true) {
                            if (i36 >= arrayList2.size()) {
                                apVar3 = null;
                                break;
                            }
                            if (((ap) arrayList2.get(i36)).a == wrVar2.a) {
                                apVar3 = (ap) arrayList2.get(i36);
                                break;
                            }
                            i36++;
                        }
                        if (apVar3 == null) {
                            arrayList3.remove(i35);
                            i35--;
                        } else {
                            if (apVar3.m != wrVar2.b || ((str = apVar3.b) != null && wrVar2.c != null && str.length() != wrVar2.c.j().length())) {
                                arrayList3.set(i35, wr.b(v2Var, apVar3));
                            }
                            i35++;
                        }
                        z23 = z11;
                        i35++;
                    }
                    for (int i37 = 0; i37 < arrayList2.size(); i37++) {
                        ap apVar6 = (ap) arrayList2.get(i37);
                        int i38 = 0;
                        while (true) {
                            if (i38 >= arrayList3.size()) {
                                wrVar = null;
                                break;
                            }
                            if (((wr) arrayList3.get(i38)).a == apVar6.a) {
                                wrVar = (wr) arrayList3.get(i38);
                                break;
                            }
                            i38++;
                        }
                        if (wrVar == null) {
                            arrayList3.add(i37, wr.b(v2Var, apVar6));
                            z23 = z11;
                        }
                    }
                    arrayList2.clear();
                } else {
                    z12 = X;
                    boolean isEmpty2 = arrayList3.isEmpty();
                    arrayList3.clear();
                    z23 = !isEmpty2;
                }
                if (z23) {
                    z14 = isEmpty != ((ArrayList) this.t0.d).isEmpty() ? z11 : false;
                    z16 = z14;
                    z15 = z11;
                    if (i10 == 0) {
                        TLRPC.User user2 = this.f2;
                        if (user2 != null && !vp.E2(user2) && !this.f2.bot && (i10 & 4) != 0) {
                            this.f2 = vp.r1(i11).Z1(Long.valueOf(this.f2.id));
                            if (this.B0 != Y()) {
                                z15 = z11;
                            }
                        }
                        int i39 = vp.D8;
                        if ((524288 & i10) != 0) {
                            TLRPC.User user3 = this.f2;
                            org.telegram.ui.Components.d5 d5Var = this.n4;
                            if (user3 != null) {
                                TLRPC.User Z1 = vp.r1(i11).Z1(Long.valueOf(this.f2.id));
                                this.f2 = Z1;
                                if (Z1 == null || org.telegram.messenger.o5.f(Z1.emoji_status) == 0) {
                                    this.D2 = true;
                                    d5Var.g((Drawable) ea.f.d().f, z10);
                                    d5Var.m(z13, z10);
                                } else {
                                    this.D2 = z11;
                                    d5Var.j(org.telegram.messenger.o5.f(this.f2.emoji_status), z10);
                                    d5Var.m(org.telegram.messenger.o5.B(this.f2.emoji_status), z10);
                                }
                                j11 = org.telegram.messenger.o5.c(this.f2);
                                z22 = true;
                            } else {
                                z22 = z15;
                                j11 = 0;
                            }
                            if (this.g2 != null) {
                                TLRPC.Chat L03 = vp.r1(i11).L0(Long.valueOf(this.g2.id));
                                this.g2 = L03;
                                if (L03 == null || org.telegram.messenger.o5.f(L03.emoji_status) == 0) {
                                    this.D2 = true;
                                    d5Var.g((Drawable) ea.f.d().f, z10);
                                    d5Var.m(false, z10);
                                } else {
                                    this.D2 = true;
                                    d5Var.j(org.telegram.messenger.o5.f(this.g2.emoji_status), z10);
                                    d5Var.m(org.telegram.messenger.o5.B(this.g2.emoji_status), z10);
                                }
                                j11 = org.telegram.messenger.o5.c(this.g2);
                                z22 = true;
                            }
                            org.telegram.ui.Components.d5 d5Var2 = this.o4;
                            if (j11 != 0) {
                                z21 = !this.k4;
                                d5Var2.j(j11, z10);
                            } else {
                                boolean z29 = this.k4;
                                d5Var2.g(null, z10);
                                z21 = z29;
                            }
                            z15 = z22;
                        } else {
                            z21 = false;
                        }
                        if ((this.N0 || this.P) && (i10 & 64) != 0) {
                            CharSequence C1 = vp.r1(i11).C1(this.H0, getTopicId(), true);
                            CharSequence charSequence = this.i2;
                            if ((charSequence != null && C1 == null) || ((charSequence == null && C1 != null) || (charSequence != null && !charSequence.equals(C1)))) {
                                z21 = true;
                            }
                        }
                        if (!z21 && (32768 & i10) != 0 && (jjVar5 = this.f1) != null && jjVar5.v != this.i1) {
                            z21 = true;
                        }
                        if (!z21 && (i10 & TLObject.FLAG_13) != 0 && this.g2 != null) {
                            TLRPC.Chat L04 = vp.r1(i11).L0(Long.valueOf(this.g2.id));
                            if ((L04 != null && L04.call_active && L04.call_not_empty) != this.v2) {
                                z21 = true;
                            }
                        }
                        if (!z21 && (i10 & 2) != 0) {
                            TLRPC.Chat chat2 = this.g2;
                            if (chat2 == null) {
                                i14 = i11;
                            } else if (chat2.monoforum) {
                                i14 = i11;
                            }
                            u2 u2Var = this.N4;
                            if (u2Var != null && (hashMap = u2Var.f) != null && !hashMap.isEmpty()) {
                                for (Map.Entry entry : u2Var.f.entrySet()) {
                                    ((org.telegram.ui.e5) entry.getValue()).c(((Long) entry.getKey()).longValue());
                                }
                            }
                            z21 = true;
                            if (!z21 && (i10 & 1) != 0 && this.g2 == null) {
                                z21 = true;
                            }
                            if (!z21 && (i10 & 8) != 0 && this.f2 == null) {
                                z21 = true;
                            }
                            if (!z21 && (i10 & 16) != 0 && this.f2 == null) {
                                z21 = true;
                            }
                            if (!z21) {
                                jj jjVar9 = this.f1;
                                if (jjVar9 != null && this.X0 != jjVar9.F4()) {
                                    this.X0 = this.f1.F4();
                                    z21 = true;
                                }
                                if (this.N0) {
                                    TLRPC.Dialog dialog2 = (TLRPC.Dialog) vp.r1(i14).Q.f(this.H0);
                                    TLRPC.Chat L05 = dialog2 == null ? null : vp.r1(i14).L0(Long.valueOf(-dialog2.id));
                                    if (L05 == null || !(L05.forum || (L05.monoforum && org.telegram.messenger.w3.A(i14, L05, 24)))) {
                                        if (dialog2 instanceof TLRPC.TL_dialogFolder) {
                                            i20 = hs.a0(i14).L;
                                            z17 = z14;
                                        } else if (dialog2 instanceof TLRPC.TL_dialogCommunity) {
                                            sp P02 = vp.r1(i14).P0(-dialog2.id);
                                            int i40 = P02.a;
                                            int i41 = P02.b;
                                            int i42 = P02.c;
                                            z17 = z14;
                                            int i43 = P02.d;
                                            this.e1 = P02.e;
                                            i20 = i40;
                                            i23 = i41;
                                            i22 = i42;
                                            i21 = i43;
                                        } else {
                                            z17 = z14;
                                            if (dialog2 != null) {
                                                int i44 = dialog2.unread_count;
                                                int i45 = dialog2.unread_mentions_count;
                                                int i46 = dialog2.unread_reactions_count;
                                                i21 = dialog2.unread_poll_votes_count;
                                                i22 = i46;
                                                i23 = i45;
                                                i20 = i44;
                                            } else {
                                                i20 = 0;
                                            }
                                        }
                                        i23 = 0;
                                        i22 = 0;
                                        i21 = 0;
                                    } else {
                                        vp.r1(i14).r7.h(L05.id);
                                        i20 = iArr[0];
                                        i23 = iArr[1];
                                        i22 = iArr[2];
                                        this.d1 = iArr[3] != 0;
                                        i21 = iArr[4];
                                        z17 = z14;
                                    }
                                    if (org.telegram.messenger.w3.p0(L05)) {
                                        i23 = 0;
                                    }
                                    if (dialog2 != null && (this.S0 != i20 || this.T0 != dialog2.unread_mark || this.U0 != i23 || this.V0 != i22)) {
                                        this.S0 = i20;
                                        this.U0 = i23;
                                        this.T0 = dialog2.unread_mark;
                                        this.V0 = i22;
                                        this.W0 = i21;
                                        z21 = true;
                                    }
                                    if (!z21 && (i10 & TLObject.FLAG_12) != 0 && (jjVar4 = this.f1) != null) {
                                        i18 = this.Y0;
                                        i19 = jjVar4.k.send_state;
                                        if (i18 != i19) {
                                            this.Y0 = i19;
                                            z21 = true;
                                        }
                                    }
                                    if (!z21) {
                                        invalidate();
                                        return z16;
                                    }
                                }
                            }
                            z17 = z14;
                            if (!z21) {
                                i18 = this.Y0;
                                i19 = jjVar4.k.send_state;
                                if (i18 != i19) {
                                }
                            }
                            if (!z21) {
                            }
                        }
                        i14 = i11;
                        if (!z21) {
                            z21 = true;
                        }
                        if (!z21) {
                            z21 = true;
                        }
                        if (!z21) {
                            z21 = true;
                        }
                        if (!z21) {
                        }
                        z17 = z14;
                        if (!z21) {
                        }
                        if (!z21) {
                        }
                    } else {
                        i14 = i11;
                        z17 = z14;
                    }
                    this.f2 = null;
                    this.g2 = null;
                    this.h2 = null;
                    if (this.K0 != 0) {
                        vp r13 = vp.r1(i14);
                        ArrayList arrayList5 = (ArrayList) r13.x.f(this.K0);
                        if (arrayList5 != null) {
                            int size = arrayList5.size();
                            for (int i47 = 0; i47 < size; i47++) {
                                ArrayList arrayList6 = (ArrayList) r13.R.f(((TLRPC.Dialog) arrayList5.get(i47)).id);
                                if (arrayList6 != null && !arrayList6.isEmpty()) {
                                    jjVar3 = (jj) arrayList6.get(0);
                                    break;
                                }
                            }
                        }
                        jjVar3 = null;
                        this.f1 = jjVar3;
                    }
                    i15 = this.J0;
                    if (i15 == 0) {
                        this.Z0 = false;
                        this.b1 = false;
                        ay ayVar = this.D4;
                        if (ayVar == null || (c42 = ayVar.c4(i14, this.j1, i15, false)) == null || c42.isEmpty()) {
                            jjVar2 = null;
                        } else {
                            int size2 = c42.size();
                            jjVar2 = null;
                            for (int i48 = 0; i48 < size2; i48++) {
                                TLRPC.Dialog dialog3 = (TLRPC.Dialog) c42.get(i48);
                                a0.h hVar = vp.r1(i14).R;
                                if (hVar != null) {
                                    ArrayList arrayList7 = (ArrayList) hVar.f(dialog3.id);
                                    jj jjVar10 = (arrayList7 == null || arrayList7.isEmpty()) ? null : (jj) arrayList7.get(0);
                                    if (jjVar10 != null && (jjVar2 == null || jjVar10.k.date > jjVar2.k.date)) {
                                        jjVar2 = jjVar10;
                                    }
                                    if (dialog3.pinnedNum == 0 && jjVar2 != null) {
                                        break;
                                    }
                                }
                            }
                        }
                        this.f1 = jjVar2;
                        j10 = jjVar2 != null ? jj.B0(jjVar2.k) : 0L;
                    } else {
                        this.b1 = false;
                        if (this.N != null) {
                            boolean q22 = vp.r1(i14).q2(this.H0, 0L, null);
                            boolean q23 = vp.r1(i14).q2(this.H0, this.N.id, null);
                            this.a1 = q23;
                            if (q22 == q23) {
                                this.Z0 = false;
                                this.b1 = false;
                            } else {
                                this.Z0 = q23;
                                this.b1 = !q23;
                            }
                        } else {
                            this.Z0 = this.N0 && vp.r1(i14).q2(this.H0, (long) getTopicId(), null);
                        }
                        j10 = this.H0;
                    }
                    if (j10 != 0) {
                        if (org.telegram.messenger.o5.C(j10)) {
                            TLRPC.EncryptedChat Z0 = vp.r1(i14).Z0(Integer.valueOf((int) (j10 & 4294967295L)));
                            this.h2 = Z0;
                            if (Z0 != null) {
                                this.f2 = vp.r1(i14).Z1(Long.valueOf(this.h2.user_id));
                            }
                        } else if (org.telegram.messenger.o5.E(j10)) {
                            this.f2 = vp.r1(i14).Z1(Long.valueOf(j10));
                        } else {
                            TLRPC.Chat L06 = vp.r1(i14).L0(Long.valueOf(-j10));
                            this.g2 = L06;
                            if (!this.N0 && L06 != null && L06.migrated_to != null && (L0 = vp.r1(i14).L0(Long.valueOf(this.g2.migrated_to.channel_id))) != null) {
                                this.g2 = L0;
                            }
                        }
                        if (this.u2 && this.f2 != null && this.f1.P3()) {
                            this.f2 = vp.r1(i14).Z1(Long.valueOf(d20.i(i14).n));
                        }
                    }
                    this.E = this.O0 && org.telegram.messenger.w3.Y(this.g2) && this.N0;
                    if (this.J0 == 0) {
                        org.telegram.ui.ActionBar.t6.u1.setCallback(this);
                        org.telegram.ui.Components.r8 r8Var3 = r8Var;
                        i16 = 2;
                        r8Var3.g(2);
                        imageReceiver2 = imageReceiver;
                        imageReceiver2.q0(null, null, r8Var3, null, this.f2, 0);
                    } else {
                        org.telegram.ui.Components.r8 r8Var4 = r8Var;
                        imageReceiver2 = imageReceiver;
                        i16 = 2;
                        if (!this.O || (jjVar = this.f1) == null) {
                            TLRPC.User user4 = this.f2;
                            if (user4 != null) {
                                r8Var4.r(user4);
                                if (h20.z(this.f2)) {
                                    r8Var4.g(12);
                                    imageReceiver2.q0(null, null, r8Var4, null, this.f2, 0);
                                } else if (h20.s(this.f2)) {
                                    r8Var4.g(21);
                                    imageReceiver2.q0(null, null, r8Var4, null, this.f2, 0);
                                } else if (h20.B(this.f2) && this.r0 && !this.q0) {
                                    r8Var4.g(22);
                                    imageReceiver2.q0(null, null, r8Var4, null, this.f2, 0);
                                } else if (!h20.B(this.f2) || this.u2 || this.q0) {
                                    imageReceiver2.j0(this.f2, r8Var4, null, true, 1, false);
                                } else {
                                    r8Var4.g(1);
                                    imageReceiver2.q0(null, null, r8Var4, null, this.f2, 0);
                                }
                            } else {
                                TLRPC.Chat chat3 = this.g2;
                                if (chat3 != null) {
                                    if (chat3.monoforum) {
                                        gg.e.n(i14, chat3, r8Var4, imageReceiver2);
                                        r8Var4.p = 1.0f;
                                    } else {
                                        r8Var4.q(chat3);
                                        imageReceiver2.i0(chat3, r8Var4, null);
                                    }
                                    if (z10 || ((i17 = i13) == this.S0 && z26 == this.T0)) {
                                        z18 = z15;
                                    } else {
                                        if (this.N0) {
                                            z18 = z15;
                                        } else {
                                            z18 = z15;
                                        }
                                        ValueAnimator valueAnimator = this.T3;
                                        if (valueAnimator != null) {
                                            valueAnimator.cancel();
                                        }
                                        float[] fArr = new float[i16];
                                        // fill-array-data instruction
                                        fArr[0] = 0.0f;
                                        fArr[1] = 1.0f;
                                        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
                                        this.T3 = ofFloat;
                                        ofFloat.addUpdateListener(new j2(this, 0));
                                        this.T3.addListener(new o2(this, 0));
                                        if ((i17 == 0 || this.T0) && (this.T0 || !z26)) {
                                            this.T3.setDuration(220L);
                                            this.T3.setInterpolator(new OvershootInterpolator());
                                        } else if (this.S0 == 0) {
                                            this.T3.setDuration(150L);
                                            this.T3.setInterpolator(gr.f);
                                        } else {
                                            this.T3.setDuration(430L);
                                            this.T3.setInterpolator(gr.f);
                                        }
                                        if (this.G3 && this.L3 && this.X3 != null) {
                                            String format = String.format("%d", Integer.valueOf(i17));
                                            String format2 = String.format("%d", Integer.valueOf(this.S0));
                                            if (format.length() == format2.length()) {
                                                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(format);
                                                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(format2);
                                                SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(format2);
                                                for (int i49 = 0; i49 < format.length(); i49++) {
                                                    if (format.charAt(i49) == format2.charAt(i49)) {
                                                        int i50 = 0;
                                                        int i51 = i49 + 1;
                                                        spannableStringBuilder.setSpan(new wy(i50), i49, i51, 0);
                                                        spannableStringBuilder2.setSpan(new wy(i50), i49, i51, 0);
                                                    } else {
                                                        spannableStringBuilder3.setSpan(new wy(0), i49, i49 + 1, 0);
                                                    }
                                                }
                                                z19 = false;
                                                int max = Math.max(org.telegram.messenger.i0.L(8.0f), (int) Math.ceil(org.telegram.ui.ActionBar.t6.M0.measureText(format)));
                                                TextPaint textPaint = org.telegram.ui.ActionBar.t6.M0;
                                                Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
                                                this.Y3 = new StaticLayout(spannableStringBuilder, textPaint, max, alignment, 1.0f, 0.0f, false);
                                                this.Z3 = new StaticLayout(spannableStringBuilder3, org.telegram.ui.ActionBar.t6.M0, max, alignment, 1.0f, 0.0f, false);
                                                this.a4 = new StaticLayout(spannableStringBuilder2, org.telegram.ui.ActionBar.t6.M0, max, alignment, 1.0f, 0.0f, false);
                                            } else {
                                                z19 = false;
                                                this.Y3 = this.X3;
                                            }
                                        } else {
                                            z19 = false;
                                        }
                                        this.P3 = this.O3;
                                        this.Q3 = this.N3;
                                        this.R3 = this.S0 > i17 ? true : z19;
                                        this.T3.start();
                                        this.S3.a(this.W0 == 0 ? true : z19, z10);
                                        boolean z30 = this.V0 == 0 ? true : z19;
                                        if (z10 || z30 == z25) {
                                            f7 = 0.0f;
                                        } else {
                                            ValueAnimator valueAnimator2 = this.U3;
                                            if (valueAnimator2 != null) {
                                                valueAnimator2.cancel();
                                            }
                                            f7 = 0.0f;
                                            this.W3 = 0.0f;
                                            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                                            this.U3 = ofFloat2;
                                            ofFloat2.addUpdateListener(new j2(this, 1));
                                            this.U3.addListener(new o2(this, 1));
                                            if (z30) {
                                                this.U3.setDuration(220L);
                                                this.U3.setInterpolator(new OvershootInterpolator());
                                            } else {
                                                this.U3.setDuration(150L);
                                                this.U3.setInterpolator(gr.f);
                                            }
                                            this.U3.start();
                                        }
                                        z20 = (W() && (chat = this.g2) != null && chat.monoforum) ? true : z19;
                                        this.D = z20;
                                        if (!z20) {
                                            L = 1;
                                        } else if (this.E) {
                                            L = org.telegram.messenger.i0.L(12.0f);
                                        } else {
                                            TLRPC.Chat chat4 = this.g2;
                                            L = ((chat4 == null || !chat4.forum || this.J0 != 0 || this.O) && (this.r0 || (user = this.f2) == null || !user.self || !vp.r1(i14).p6)) ? org.telegram.messenger.i0.L(28.0f) : org.telegram.messenger.i0.L(16.0f);
                                        }
                                        imageReceiver2.J0(L);
                                        z24 = z18;
                                    }
                                    z19 = false;
                                    this.S3.a(this.W0 == 0 ? true : z19, z10);
                                    if (this.V0 == 0) {
                                    }
                                    if (z10) {
                                    }
                                    f7 = 0.0f;
                                    if (W()) {
                                    }
                                    this.D = z20;
                                    if (!z20) {
                                    }
                                    imageReceiver2.J0(L);
                                    z24 = z18;
                                }
                            }
                        } else {
                            r8Var4.p(jjVar.c1());
                            imageReceiver2.i0(this.f1.c1(), r8Var4, null);
                        }
                    }
                    if (z10) {
                    }
                    z18 = z15;
                    z19 = false;
                    this.S3.a(this.W0 == 0 ? true : z19, z10);
                    if (this.V0 == 0) {
                    }
                    if (z10) {
                    }
                    f7 = 0.0f;
                    if (W()) {
                    }
                    this.D = z20;
                    if (!z20) {
                    }
                    imageReceiver2.J0(L);
                    z24 = z18;
                }
            } else {
                z12 = X;
                z13 = false;
                i13 = i30;
                imageReceiver = imageReceiver5;
            }
            z14 = z13;
            z15 = z14;
            z16 = z15;
            if (i10 == 0) {
            }
            this.f2 = null;
            this.g2 = null;
            this.h2 = null;
            if (this.K0 != 0) {
            }
            i15 = this.J0;
            if (i15 == 0) {
            }
            if (j10 != 0) {
            }
            this.E = this.O0 && org.telegram.messenger.w3.Y(this.g2) && this.N0;
            if (this.J0 == 0) {
            }
            if (z10) {
            }
            z18 = z15;
            z19 = false;
            this.S3.a(this.W0 == 0 ? true : z19, z10);
            if (this.V0 == 0) {
            }
            if (z10) {
            }
            f7 = 0.0f;
            if (W()) {
            }
            this.D = z20;
            if (!z20) {
            }
            imageReceiver2.J0(L);
            z24 = z18;
        }
        if (!this.P && (getMeasuredWidth() != 0 || getMeasuredHeight() != 0)) {
            z17 = true;
        }
        if (!z24) {
            int i52 = this.u0.y;
            th.w5.r(vp.r1(i14).O1(), getDialogId());
        }
        if (!z10) {
            this.c1 = (this.Z0 || this.b1) ? 1.0f : f7;
            ValueAnimator valueAnimator3 = this.T3;
            if (valueAnimator3 != null) {
                valueAnimator3.cancel();
            }
        }
        invalidate();
        if (X() != z12) {
            z16 = true;
        }
        if (z17) {
            if (this.w3) {
                z();
            } else {
                this.A0 = true;
            }
        }
        k0(z10);
        return z16;
    }

    @Override // org.telegram.ui.Cells.z, android.view.View, org.telegram.ui.Cells.r9
    public final void invalidate() {
        if (th.o7.x1) {
            return;
        }
        super.invalidate();
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        if (drawable == this.y1 || drawable == org.telegram.ui.ActionBar.t6.u1) {
            invalidate(drawable.getBounds());
        } else {
            super.invalidateDrawable(drawable);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00f2, code lost:
    
        if (r14.c(1, r3) == false) goto L47;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f5  */
    /* JADX WARN: Type inference failed for: r14v10, types: [java.util.ArrayList<org.telegram.tgnet.TLRPC$PhotoSize>] */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r14v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r14v9 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9, types: [int] */
    /* JADX WARN: Type inference failed for: r8v25, types: [org.telegram.tgnet.TLRPC$Document] */
    /* JADX WARN: Type inference failed for: r8v28, types: [org.telegram.tgnet.TLRPC$Photo] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j0() {
        TLRPC.Message message;
        int i10;
        ?? r14;
        boolean z10;
        TLRPC.PhotoSize photoSize;
        TLRPC.PhotoSize R;
        TLRPC.PhotoSize photoSize2;
        TLRPC.PhotoSize w9;
        boolean z11;
        int i11;
        TLRPC.PhotoSize photoSize3;
        jj jjVar = this.f1;
        if (jjVar == null) {
            return;
        }
        String E1 = vp.r1(jjVar.I1).E1(this.f1.k.restriction_reason);
        jj jjVar2 = this.f1;
        TLRPC.PhotoSize photoSize4 = null;
        int i12 = 3;
        boolean z12 = false;
        if (jjVar2 != null && (message = jjVar2.k) != null) {
            TLRPC.MessageMedia messageMedia = message.media;
            if (messageMedia instanceof TLRPC.TL_messageMediaPaidMedia) {
                this.R1 = 0;
                this.S1 = false;
                TLRPC.TL_messageMediaPaidMedia tL_messageMediaPaidMedia = (TLRPC.TL_messageMediaPaidMedia) messageMedia;
                int i13 = 0;
                int i14 = 0;
                while (i13 < tL_messageMediaPaidMedia.extended_media.size() && this.R1 < i12) {
                    TLRPC.MessageExtendedMedia messageExtendedMedia = tL_messageMediaPaidMedia.extended_media.get(i13);
                    boolean z13 = messageExtendedMedia instanceof TLRPC.TL_messageExtendedMediaPreview;
                    boolean[] zArr = this.X1;
                    boolean[] zArr2 = this.W1;
                    ImageReceiver[] imageReceiverArr = this.V1;
                    if (z13) {
                        i10 = i14 + 1;
                        TLRPC.PhotoSize photoSize5 = ((TLRPC.TL_messageExtendedMediaPreview) messageExtendedMedia).thumb;
                        if (i14 < i12 && photoSize5 != null) {
                            this.S1 = z12;
                            int i15 = this.R1;
                            if (i15 < i12) {
                                this.R1 = i15 + 1;
                                zArr2[i14] = z12;
                                zArr[i14] = true;
                                imageReceiverArr[i14].r0(ic.f(photoSize5, this.f1.k), "2_2_b", null, null, null, z12 ? 1L : 0L, null, this.f1, 0);
                                imageReceiverArr[i14].J0(org.telegram.messenger.i0.L(2.0f));
                                this.V = z12;
                            }
                        }
                    } else if (messageExtendedMedia instanceof TLRPC.TL_messageExtendedMedia) {
                        i10 = i14 + 1;
                        TLRPC.MessageMedia messageMedia2 = ((TLRPC.TL_messageExtendedMedia) messageExtendedMedia).media;
                        if (messageMedia2 instanceof TLRPC.TL_messageMediaPhoto) {
                            ?? r82 = messageMedia2.photo;
                            r14 = r82.sizes;
                            photoSize3 = r82;
                        } else if (messageMedia2 instanceof TLRPC.TL_messageMediaDocument) {
                            boolean K4 = jj.K4(messageMedia2.document);
                            ?? r83 = messageMedia2.document;
                            z10 = K4;
                            r14 = r83.thumbs;
                            photoSize = r83;
                            R = org.telegram.messenger.b8.R(r14);
                            if (R == null) {
                                R = org.telegram.messenger.b8.w(r14, 40, z12, photoSize4, z12);
                            }
                            photoSize2 = R;
                            w9 = org.telegram.messenger.b8.w(r14, org.telegram.messenger.i0.Z0(z12), z12, photoSize4, true);
                            if (photoSize2 == w9) {
                                w9 = photoSize4;
                            }
                            if (w9 == null) {
                                org.telegram.messenger.b6 q6 = org.telegram.messenger.b6.q(this.F0);
                                int i16 = w9.size;
                                z11 = z12 ? 1 : 0;
                                i11 = i14;
                            } else {
                                z11 = z12 ? 1 : 0;
                                i11 = i14;
                            }
                            w9 = photoSize2;
                            if (photoSize2 != null) {
                                this.S1 = (this.S1 || z10) ? true : z11;
                                int i17 = this.R1;
                                if (i17 < 3) {
                                    this.R1 = i17 + 1;
                                    zArr2[i11] = z10;
                                    zArr[i11] = z11;
                                    imageReceiverArr[i11].r0(ic.f(w9, photoSize), "20_20", ic.f(photoSize2, photoSize), "20_20", null, (long) ((z10 || w9 == null) ? z11 : w9.size), null, this.f1, 0);
                                    imageReceiverArr[i11].J0(org.telegram.messenger.i0.L(2.0f));
                                    this.V = z11;
                                }
                            }
                        } else {
                            TLRPC.PhotoSize photoSize6 = photoSize4;
                            r14 = photoSize6;
                            photoSize3 = photoSize6;
                        }
                        z10 = z12 ? 1 : 0;
                        photoSize = photoSize3;
                        R = org.telegram.messenger.b8.R(r14);
                        if (R == null) {
                        }
                        photoSize2 = R;
                        w9 = org.telegram.messenger.b8.w(r14, org.telegram.messenger.i0.Z0(z12), z12, photoSize4, true);
                        if (photoSize2 == w9) {
                        }
                        if (w9 == null) {
                        }
                        w9 = photoSize2;
                        if (photoSize2 != null) {
                        }
                    } else {
                        i13++;
                        photoSize4 = null;
                        i12 = 3;
                        z12 = false;
                    }
                    i14 = i10;
                    i13++;
                    photoSize4 = null;
                    i12 = 3;
                    z12 = false;
                }
                return;
            }
        }
        ArrayList arrayList = this.g1;
        if (arrayList != null && arrayList.size() > 1 && TextUtils.isEmpty(E1) && this.J0 == 0 && this.h2 == null) {
            this.R1 = 0;
            this.S1 = false;
            Collections.sort(this.g1, Comparator$-CC.comparingInt(new bi.t6(4)));
            for (int i18 = 0; i18 < Math.min(3, this.g1.size()); i18++) {
                jj jjVar3 = (jj) this.g1.get(i18);
                if (jjVar3 != null && !jjVar3.m5() && (jj.S3(jjVar3.k) || jjVar3.L3() || jj.L4(jjVar3.k) || jjVar3.h4() || jjVar3.y4())) {
                    String str = jjVar3.Z4() ? jjVar3.k.media.webpage.type : null;
                    if (!"app".equals(str) && !"profile".equals(str) && !"article".equals(str) && (str == null || !str.startsWith("telegram_"))) {
                        g0(i18, jjVar3);
                    }
                }
            }
            return;
        }
        jj jjVar4 = this.f1;
        if (jjVar4 == null || this.J0 != 0) {
            return;
        }
        this.R1 = 0;
        this.S1 = false;
        if (jjVar4.m5()) {
            return;
        }
        if (jj.S3(this.f1.k) || this.f1.L3() || jj.L4(this.f1.k) || this.f1.h4() || this.f1.y4()) {
            String str2 = this.f1.Z4() ? this.f1.k.media.webpage.type : null;
            if ("app".equals(str2) || "profile".equals(str2) || "article".equals(str2)) {
                return;
            }
            if (str2 == null || !str2.startsWith("telegram_")) {
                g0(0, this.f1);
            }
        }
    }

    public final void k0(boolean z10) {
        TL_account.RequirementToContact H2 = (this.Z4 == null || this.f2 == null) ? null : vp.r1(this.F0).H2(this.f2.id);
        boolean z11 = H2 instanceof TL_account.requirementToContactPremium;
        if (this.n2 == z11 && this.p2 == org.telegram.messenger.o5.k(H2)) {
            return;
        }
        this.n2 = z11;
        this.p2 = org.telegram.messenger.o5.k(H2);
        if (!z10) {
            this.m2.f(this.n2, true);
            this.o2.f(this.p2 > 0, true);
        }
        invalidate();
    }

    public final void l0() {
        if (this.R1 > 0) {
            StaticLayout staticLayout = X() ? this.h3 : this.e3;
            int i10 = X() ? this.c3 : this.b3;
            if (staticLayout == null) {
                return;
            }
            try {
                CharSequence text = staticLayout.getText();
                if (text instanceof Spanned) {
                    t2[] t2VarArr = (t2[]) ((Spanned) text).getSpans(0, text.length(), t2.class);
                    boolean[] zArr = this.U1;
                    if (t2VarArr == null || t2VarArr.length <= 0) {
                        for (int i11 = 0; i11 < 3; i11++) {
                            zArr[i11] = false;
                        }
                        return;
                    }
                    int spanStart = ((Spanned) text).getSpanStart(t2VarArr[0]);
                    if (spanStart < 0) {
                        spanStart = 0;
                    }
                    int ceil = (int) Math.ceil(Math.min(staticLayout.getPrimaryHorizontal(spanStart), staticLayout.getPrimaryHorizontal(spanStart + 1)));
                    if (ceil != 0 && !this.x0 && !this.y0) {
                        ceil += org.telegram.messenger.i0.L(3.0f);
                    }
                    for (int i12 = 0; i12 < this.R1; i12++) {
                        this.V1[i12].K0 = i10 + ceil + org.telegram.messenger.i0.L((this.L4 + 2) * i12);
                        zArr[i12] = true;
                    }
                }
            } catch (Exception e) {
                org.telegram.messenger.f8.g(e, true);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.Y1.P();
        int i10 = 0;
        while (true) {
            ImageReceiver[] imageReceiverArr = this.V1;
            if (i10 >= imageReceiverArr.length) {
                break;
            }
            imageReceiverArr[i10].P();
            i10++;
        }
        b0();
        this.m3 = org.telegram.ui.Components.o5.update(0, this, this.m3, this.e3);
        this.n3 = org.telegram.ui.Components.o5.update(0, this, this.n3, this.s3);
        this.o3 = org.telegram.ui.Components.o5.update(0, this, this.o3, this.h3);
        this.p3 = org.telegram.ui.Components.o5.update(0, this, this.p3, this.z2);
        org.telegram.ui.Components.d5 d5Var = this.n4;
        if (d5Var != null) {
            d5Var.a();
        }
        org.telegram.ui.Components.d5 d5Var2 = this.o4;
        if (d5Var2 != null) {
            d5Var2.a();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.x1 = false;
        this.A1 = false;
        this.B1 = 0.0f;
        this.w3 = false;
        this.x3 = (getIsPinned() && this.y3) ? 1.0f : 0.0f;
        this.Y1.R();
        int i10 = 0;
        while (true) {
            ImageReceiver[] imageReceiverArr = this.V1;
            if (i10 >= imageReceiverArr.length) {
                break;
            }
            imageReceiverArr[i10].R();
            i10++;
        }
        bi0 bi0Var = this.y1;
        if (bi0Var != null) {
            bi0Var.stop();
            this.y1.T(true, 0.0f);
            this.y1.setCallback(null);
            this.y1 = null;
            this.z1 = false;
        }
        zf.j jVar = this.s4;
        if (jVar != null) {
            jVar.d.remove(Long.valueOf(this.H0));
        }
        org.telegram.ui.Components.d5 d5Var = this.n4;
        if (d5Var != null) {
            d5Var.b();
        }
        org.telegram.ui.Components.d5 d5Var2 = this.o4;
        if (d5Var2 != null) {
            d5Var2.b();
        }
        org.telegram.ui.Components.o5.release(this, this.m3);
        org.telegram.ui.Components.o5.release(this, this.n3);
        org.telegram.ui.Components.o5.release(this, this.o3);
        org.telegram.ui.Components.o5.release(this, this.p3);
        this.u0.g();
        this.c0 = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:1013:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:1023:0x03aa  */
    /* JADX WARN: Removed duplicated region for block: B:1040:0x0500  */
    /* JADX WARN: Removed duplicated region for block: B:1046:0x053e  */
    /* JADX WARN: Removed duplicated region for block: B:1049:0x04e1  */
    /* JADX WARN: Removed duplicated region for block: B:1052:0x043a  */
    /* JADX WARN: Removed duplicated region for block: B:1053:0x0369  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0cbf  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0cd4  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0cea  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0ced  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0cff  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0d32  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0d45  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0d4d  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x0de6  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x0fe2  */
    /* JADX WARN: Removed duplicated region for block: B:372:0x1081  */
    /* JADX WARN: Removed duplicated region for block: B:375:0x1089  */
    /* JADX WARN: Removed duplicated region for block: B:379:0x109e  */
    /* JADX WARN: Removed duplicated region for block: B:395:0x1103  */
    /* JADX WARN: Removed duplicated region for block: B:402:0x1114 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:417:0x115d  */
    /* JADX WARN: Removed duplicated region for block: B:424:0x1176  */
    /* JADX WARN: Removed duplicated region for block: B:433:0x1198  */
    /* JADX WARN: Removed duplicated region for block: B:435:0x119b  */
    /* JADX WARN: Removed duplicated region for block: B:438:0x11d6  */
    /* JADX WARN: Removed duplicated region for block: B:444:0x125d  */
    /* JADX WARN: Removed duplicated region for block: B:459:0x13af  */
    /* JADX WARN: Removed duplicated region for block: B:463:0x1418  */
    /* JADX WARN: Removed duplicated region for block: B:467:0x165a  */
    /* JADX WARN: Removed duplicated region for block: B:480:0x16ce  */
    /* JADX WARN: Removed duplicated region for block: B:521:0x1832  */
    /* JADX WARN: Removed duplicated region for block: B:526:0x1863  */
    /* JADX WARN: Removed duplicated region for block: B:529:0x187e  */
    /* JADX WARN: Removed duplicated region for block: B:532:0x189d  */
    /* JADX WARN: Removed duplicated region for block: B:546:0x18bc  */
    /* JADX WARN: Removed duplicated region for block: B:564:0x199b  */
    /* JADX WARN: Removed duplicated region for block: B:570:0x18f9  */
    /* JADX WARN: Removed duplicated region for block: B:588:0x19d6  */
    /* JADX WARN: Removed duplicated region for block: B:591:0x19df  */
    /* JADX WARN: Removed duplicated region for block: B:596:0x19ef  */
    /* JADX WARN: Removed duplicated region for block: B:601:0x1a47  */
    /* JADX WARN: Removed duplicated region for block: B:604:0x1a50  */
    /* JADX WARN: Removed duplicated region for block: B:606:0x1a55  */
    /* JADX WARN: Removed duplicated region for block: B:621:0x1aa8  */
    /* JADX WARN: Removed duplicated region for block: B:641:0x1b26  */
    /* JADX WARN: Removed duplicated region for block: B:646:0x1b74  */
    /* JADX WARN: Removed duplicated region for block: B:655:0x1bd6  */
    /* JADX WARN: Removed duplicated region for block: B:660:0x1c0c  */
    /* JADX WARN: Removed duplicated region for block: B:671:0x1c5b  */
    /* JADX WARN: Removed duplicated region for block: B:677:0x1c70  */
    /* JADX WARN: Removed duplicated region for block: B:689:0x1cb9  */
    /* JADX WARN: Removed duplicated region for block: B:692:0x1cc2  */
    /* JADX WARN: Removed duplicated region for block: B:694:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:695:0x1cbb  */
    /* JADX WARN: Removed duplicated region for block: B:696:0x1c96  */
    /* JADX WARN: Removed duplicated region for block: B:704:0x1c30  */
    /* JADX WARN: Removed duplicated region for block: B:713:0x1be3  */
    /* JADX WARN: Removed duplicated region for block: B:720:0x1bf6  */
    /* JADX WARN: Removed duplicated region for block: B:730:0x1466  */
    /* JADX WARN: Removed duplicated region for block: B:793:0x13bb  */
    /* JADX WARN: Removed duplicated region for block: B:798:0x12ae  */
    /* JADX WARN: Removed duplicated region for block: B:856:0x1240  */
    /* JADX WARN: Removed duplicated region for block: B:865:0x1179  */
    /* JADX WARN: Removed duplicated region for block: B:867:0x1160  */
    /* JADX WARN: Removed duplicated region for block: B:882:0x108c  */
    /* JADX WARN: Removed duplicated region for block: B:883:0x1083  */
    /* JADX WARN: Removed duplicated region for block: B:894:0x1091  */
    /* JADX WARN: Removed duplicated region for block: B:906:0x0fdd  */
    /* JADX WARN: Removed duplicated region for block: B:909:0x0cc9  */
    /* JADX WARN: Type inference failed for: r12v59 */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r12v60 */
    /* JADX WARN: Type inference failed for: r12v7, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v173, types: [org.telegram.ui.Cells.k2] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onDraw(Canvas canvas) {
        float f7;
        boolean z10;
        int w02;
        int w03;
        int i10;
        String K0;
        String str;
        int i11;
        int i12;
        float f10;
        int i13;
        org.telegram.ui.ActionBar.p6 p6Var;
        boolean z11;
        bi.t0 t0Var;
        p2 p2Var;
        String str2;
        float f11;
        int i14;
        String str3;
        float f12;
        p2 p2Var2;
        float f13;
        p2 p2Var3;
        String str4;
        int ceil;
        int i15;
        StaticLayout staticLayout;
        float f14;
        boolean z12;
        bi0 bi0Var;
        float f15;
        float f16;
        org.telegram.ui.ActionBar.p6 p6Var2;
        float f17;
        v2 v2Var;
        int i16;
        org.telegram.ui.ActionBar.p6 p6Var3;
        p2 p2Var4;
        bi.t0 t0Var2;
        ?? r12;
        float f18;
        int i17;
        boolean z13;
        int i18;
        boolean z14;
        ImageReceiver imageReceiver;
        boolean z15;
        m2 m2Var;
        v2 v2Var2;
        float f19;
        int i19;
        Canvas canvas2;
        boolean z16;
        float f20;
        TLRPC.TL_forumTopic tL_forumTopic;
        TLRPC.Chat chat;
        TLRPC.User user;
        TLRPC.TL_forumTopic tL_forumTopic2;
        mh0 mh0Var;
        s2 s2Var;
        float f21;
        float f22;
        int i20;
        int i21;
        float f23;
        int i22;
        boolean z17;
        int i23;
        s2 s2Var2;
        int i24;
        RectF rectF;
        org.telegram.ui.ActionBar.p6 p6Var4;
        s2 s2Var3;
        float f24;
        boolean z18;
        v2 v2Var3;
        boolean z19;
        float f25;
        ji.f fVar;
        int i25;
        float L;
        float f26;
        boolean z20;
        boolean z21;
        boolean z22;
        int i26;
        float f27;
        float z23;
        StaticLayout staticLayout2;
        int i27;
        qv0 u02;
        int i28;
        q2 q2Var;
        ay ayVar;
        xw xwVar;
        TLRPC.TL_forumTopic tL_forumTopic3;
        mh0 mh0Var2;
        TLRPC.TL_forumTopic tL_forumTopic4;
        final v2 v2Var4 = this;
        Canvas canvas3 = canvas;
        if ((v2Var4.H0 == 0 && v2Var4.G0 == null) || !v2Var4.z0) {
            return;
        }
        boolean z24 = v2Var4.h;
        bi.t0 t0Var3 = v2Var4.m4;
        if (z24 && ((v2Var4.J0 != 0 || (v2Var4.P && (tL_forumTopic4 = v2Var4.N) != null && tL_forumTopic4.id == 1)) && (mh0Var2 = v2Var4.e2) != null && mh0Var2.C == 0.0f && v2Var4.w1 == 0.0f)) {
            canvas3.save();
            canvas3.translate(0.0f, (-v2Var4.E3) - v2Var4.n);
            canvas3.clipRect(0.0f, (1.0f - v2Var4.e2.J) * v2Var4.getMeasuredHeight(), v2Var4.getMeasuredWidth(), v2Var4.getMeasuredHeight());
            v2Var4.e2.c(canvas3, false);
            canvas3.restore();
            t0Var3.setVisibility(4);
            return;
        }
        boolean z25 = z24 && (v2Var4.J0 != 0 || (v2Var4.P && (tL_forumTopic3 = v2Var4.N) != null && tL_forumTopic3.id == 1)) && v2Var4.e2 != null && v2Var4.w1 == 0.0f && (ayVar = v2Var4.D4) != null && ayVar.k4() && ((xwVar = ayVar.F3) == null || !xwVar.c());
        mh0 mh0Var3 = v2Var4.e2;
        float f28 = mh0Var3 != null ? mh0Var3.J : 1.0f;
        if (z25) {
            canvas3.save();
            canvas3.clipRect(0.0f, (1.0f - f28) * v2Var4.getMeasuredHeight(), v2Var4.getMeasuredWidth(), v2Var4.getMeasuredHeight());
        }
        if (v2Var4.t1 != 0.0f && Build.VERSION.SDK_INT != 24) {
            canvas3.save();
            canvas3.clipRect(0.0f, v2Var4.u1 * v2Var4.t1, v2Var4.getMeasuredWidth(), v2Var4.getMeasuredHeight() - ((int) (v2Var4.v1 * v2Var4.t1)));
        }
        float f29 = v2Var4.w1;
        p2 p2Var5 = v2Var4.d2;
        org.telegram.ui.ActionBar.p6 p6Var5 = v2Var4.J4;
        if (f29 == 0.0f && v2Var4.o1 == 0.0f) {
            bi0 bi0Var2 = v2Var4.y1;
            if (bi0Var2 != null) {
                bi0Var2.stop();
                v2Var4.y1.T(true, 0.0f);
                v2Var4.y1.setCallback(null);
                v2Var4.y1 = null;
                v2Var4.z1 = false;
            }
            f7 = 1.0f;
            p6Var = p6Var5;
            z11 = z24;
            t0Var = t0Var3;
            f14 = 2.0f;
            p2Var3 = p2Var5;
        } else {
            canvas3.save();
            canvas3.translate(0.0f, -v2Var4.E3);
            if (v2Var4.L1) {
                w02 = org.telegram.ui.ActionBar.t6.w0(v2Var4.M1, p6Var5);
                w03 = org.telegram.ui.ActionBar.t6.w0(v2Var4.N1, p6Var5);
                String str5 = v2Var4.O1;
                f7 = 1.0f;
                i10 = v2Var4.P1;
                K0 = cd.L0(i10, str5);
                z10 = false;
                v2Var4.y1 = v2Var4.Q1;
            } else {
                f7 = 1.0f;
                z10 = false;
                if (v2Var4.J0 != 0) {
                    if (v2Var4.m1) {
                        w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.d9, p6Var5);
                        w03 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.c9, p6Var5);
                        i10 = 2131743908;
                        K0 = cd.K0(2131743908);
                        v2Var4.y1 = org.telegram.ui.ActionBar.t6.y1;
                    } else {
                        w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.c9, p6Var5);
                        w03 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.d9, p6Var5);
                        i10 = 2131749325;
                        K0 = cd.K0(2131749325);
                        v2Var4.y1 = org.telegram.ui.ActionBar.t6.x1;
                    }
                } else if (v2Var4.P2) {
                    w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.c9, p6Var5);
                    w03 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.d9, p6Var5);
                    i10 = 2131746614;
                    K0 = cd.K0(2131746614);
                    v2Var4.y1 = org.telegram.ui.ActionBar.t6.z1;
                } else if (v2Var4.k1 == 0) {
                    w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.c9, p6Var5);
                    w03 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.d9, p6Var5);
                    if (org.telegram.messenger.w3.Y(v2Var4.g2)) {
                        String K02 = cd.K0(2131744330);
                        w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Y5, p6Var5);
                        v2Var4.y1 = org.telegram.ui.ActionBar.t6.K1;
                        str = K02;
                        i11 = 2131744330;
                        i12 = w02;
                        if (v2Var4.x || (bi0Var = v2Var4.s) == null) {
                            v2Var4.s = v2Var4.y1;
                            v2Var4.w = i11;
                        } else {
                            v2Var4.y1 = bi0Var;
                            i11 = v2Var4.w;
                        }
                        if (!v2Var4.z1 && Math.abs(v2Var4.w1) > org.telegram.messenger.i0.L(43.0f)) {
                            v2Var4.z1 = true;
                            v2Var4.y1.T(true, 0.0f);
                            v2Var4.y1.setCallback(v2Var4);
                            v2Var4.y1.start();
                        }
                        float measuredWidth = v2Var4.getMeasuredWidth() + v2Var4.w1;
                        if (v2Var4.B1 >= f7) {
                            org.telegram.ui.ActionBar.t6.v0.setColor(w02);
                            i13 = i11;
                            p6Var = p6Var5;
                            z11 = z24;
                            t0Var = t0Var3;
                            p2Var = p2Var5;
                            f11 = measuredWidth;
                            str2 = "Arrow";
                            f10 = 0.0f;
                            canvas3.drawRect(measuredWidth - org.telegram.messenger.i0.L(8.0f), 0.0f, v2Var4.getMeasuredWidth(), v2Var4.getMeasuredHeight(), org.telegram.ui.ActionBar.t6.v0);
                            if (v2Var4.B1 == 0.0f) {
                                if (org.telegram.ui.ActionBar.t6.A1) {
                                    org.telegram.ui.ActionBar.t6.v1.Q(org.telegram.ui.ActionBar.t6.H0(org.telegram.ui.ActionBar.t6.c9), str2);
                                    org.telegram.ui.ActionBar.t6.A1 = z10;
                                }
                                if (org.telegram.ui.ActionBar.t6.B1) {
                                    bi0 bi0Var3 = org.telegram.ui.ActionBar.t6.z1;
                                    bi0Var3.Z = true;
                                    int i29 = org.telegram.ui.ActionBar.t6.c9;
                                    bi0Var3.Q(org.telegram.ui.ActionBar.t6.H0(i29), "Line 1");
                                    org.telegram.ui.ActionBar.t6.z1.Q(org.telegram.ui.ActionBar.t6.H0(i29), "Line 2");
                                    org.telegram.ui.ActionBar.t6.z1.Q(org.telegram.ui.ActionBar.t6.H0(i29), "Line 3");
                                    org.telegram.ui.ActionBar.t6.z1.o();
                                    org.telegram.ui.ActionBar.t6.B1 = z10;
                                }
                            }
                        } else {
                            f10 = 0.0f;
                            i13 = i11;
                            p6Var = p6Var5;
                            z11 = z24;
                            t0Var = t0Var3;
                            p2Var = p2Var5;
                            str2 = "Arrow";
                            f11 = measuredWidth;
                        }
                        int measuredWidth2 = (v2Var4.getMeasuredWidth() - org.telegram.messenger.i0.L(43.0f)) - (v2Var4.y1.getIntrinsicWidth() / 2);
                        int y3 = z20.y(52.0f, v2Var4.getMeasuredHeight(), 2);
                        int intrinsicWidth = (v2Var4.y1.getIntrinsicWidth() / 2) + measuredWidth2;
                        int intrinsicHeight = (v2Var4.y1.getIntrinsicHeight() / 2) + y3;
                        if (v2Var4.B1 <= f10) {
                            canvas3.save();
                            i14 = i13;
                            str3 = str;
                            f12 = f11;
                            canvas3.clipRect(f11 - org.telegram.messenger.i0.L(8.0f), f10, v2Var4.getMeasuredWidth(), v2Var4.getMeasuredHeight());
                            org.telegram.ui.ActionBar.t6.v0.setColor(i12);
                            p2Var2 = p2Var;
                            canvas3.drawCircle(intrinsicWidth, intrinsicHeight, org.telegram.messenger.i0.G.getInterpolation(v2Var4.B1) * ((float) Math.sqrt(((intrinsicHeight - v2Var4.getMeasuredHeight()) * (intrinsicHeight - v2Var4.getMeasuredHeight())) + (intrinsicWidth * intrinsicWidth))), org.telegram.ui.ActionBar.t6.v0);
                            canvas3.restore();
                            if (org.telegram.ui.ActionBar.t6.A1) {
                                z12 = true;
                            } else {
                                org.telegram.ui.ActionBar.t6.v1.Q(org.telegram.ui.ActionBar.t6.H0(org.telegram.ui.ActionBar.t6.d9), str2);
                                z12 = true;
                                org.telegram.ui.ActionBar.t6.A1 = true;
                            }
                            if (!org.telegram.ui.ActionBar.t6.B1) {
                                bi0 bi0Var4 = org.telegram.ui.ActionBar.t6.z1;
                                bi0Var4.Z = z12;
                                int i30 = org.telegram.ui.ActionBar.t6.d9;
                                bi0Var4.Q(org.telegram.ui.ActionBar.t6.H0(i30), "Line 1");
                                org.telegram.ui.ActionBar.t6.z1.Q(org.telegram.ui.ActionBar.t6.H0(i30), "Line 2");
                                org.telegram.ui.ActionBar.t6.z1.Q(org.telegram.ui.ActionBar.t6.H0(i30), "Line 3");
                                org.telegram.ui.ActionBar.t6.z1.o();
                                org.telegram.ui.ActionBar.t6.B1 = true;
                            }
                        } else {
                            i14 = i13;
                            str3 = str;
                            f12 = f11;
                            p2Var2 = p2Var;
                        }
                        canvas3.save();
                        canvas3.translate(measuredWidth2, y3);
                        f13 = v2Var4.C1;
                        if (f13 != 0.0f || f13 == f7) {
                            p2Var3 = p2Var2;
                        } else {
                            p2Var3 = p2Var2;
                            float interpolation = p2Var3.getInterpolation(f13) + f7;
                            canvas3.scale(interpolation, interpolation, v2Var4.y1.getIntrinsicWidth() / 2, v2Var4.y1.getIntrinsicHeight() / 2);
                        }
                        boolean z26 = z10;
                        z.t(z26 ? 1 : 0, z26 ? 1 : 0, v2Var4.y1);
                        v2Var4.y1.draw(canvas3);
                        canvas3.restore();
                        canvas3.clipRect(f12, 0.0f, v2Var4.getMeasuredWidth(), v2Var4.getMeasuredHeight());
                        str4 = str3;
                        ceil = (int) Math.ceil(org.telegram.ui.ActionBar.t6.M0.measureText(str4));
                        i15 = i14;
                        if (v2Var4.F4 == i15 || v2Var4.G4 != v2Var4.getMeasuredWidth()) {
                            v2Var4.F4 = i15;
                            v2Var4.G4 = v2Var4.getMeasuredWidth();
                            TextPaint textPaint = org.telegram.ui.ActionBar.t6.N0;
                            int min = Math.min(org.telegram.messenger.i0.L(80.0f), ceil);
                            Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
                            staticLayout = new StaticLayout(str4, textPaint, min, alignment, 1.0f, 0.0f, false);
                            v2Var4.E4 = staticLayout;
                            if (staticLayout.getLineCount() > 1) {
                                v2Var4.E4 = new StaticLayout(str4, org.telegram.ui.ActionBar.t6.O0, Math.min(org.telegram.messenger.i0.L(82.0f), ceil), alignment, 1.0f, 0.0f, false);
                            }
                        }
                        if (v2Var4.E4 == null) {
                            canvas3.save();
                            f14 = 2.0f;
                            canvas3.translate((v2Var4.getMeasuredWidth() - org.telegram.messenger.i0.L(43.0f)) - (v2Var4.E4.getWidth() / 2.0f), org.telegram.messenger.i0.L(36.0f) + y3 + (v2Var4.E4.getLineCount() > 1 ? -org.telegram.messenger.i0.L(4.0f) : 0.0f));
                            v2Var4.E4.draw(canvas3);
                            canvas3.restore();
                        } else {
                            f14 = 2.0f;
                        }
                        canvas3.restore();
                    } else {
                        int i31 = v2Var4.F0;
                        if (tz.m(i31) == 3) {
                            if (v2Var4.Z0) {
                                i10 = 2131744329;
                                K0 = cd.K0(2131744329);
                                v2Var4.y1 = org.telegram.ui.ActionBar.t6.I1;
                            } else {
                                i10 = 2131744347;
                                K0 = cd.K0(2131744347);
                                v2Var4.y1 = org.telegram.ui.ActionBar.t6.H1;
                            }
                        } else if (tz.m(i31) == 4) {
                            i10 = 2131744350;
                            K0 = cd.K0(2131744350);
                            w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Y5, p6Var5);
                            v2Var4.y1 = org.telegram.ui.ActionBar.t6.J1;
                        } else if (tz.m(i31) == 1) {
                            if (v2Var4.S0 > 0 || v2Var4.T0) {
                                i10 = 2131744349;
                                K0 = cd.K0(2131744349);
                                v2Var4.y1 = org.telegram.ui.ActionBar.t6.L1;
                            } else {
                                i10 = 2131744348;
                                K0 = cd.K0(2131744348);
                                v2Var4.y1 = org.telegram.ui.ActionBar.t6.M1;
                            }
                        } else if (tz.m(i31) != 0) {
                            i10 = 2131754172;
                            K0 = cd.K0(2131754172);
                            v2Var4.y1 = org.telegram.ui.ActionBar.t6.v1;
                        } else if (v2Var4.getIsPinned()) {
                            i10 = 2131744328;
                            K0 = cd.K0(2131744328);
                            v2Var4.y1 = org.telegram.ui.ActionBar.t6.O1;
                        } else {
                            i10 = 2131744346;
                            K0 = cd.K0(2131744346);
                            v2Var4.y1 = org.telegram.ui.ActionBar.t6.N1;
                        }
                    }
                } else {
                    w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.d9, p6Var5);
                    w03 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.c9, p6Var5);
                    i10 = 2131743940;
                    K0 = cd.K0(2131743940);
                    v2Var4.y1 = org.telegram.ui.ActionBar.t6.w1;
                }
            }
            int i32 = i10;
            i12 = w03;
            i11 = i32;
            str = K0;
            if (v2Var4.x) {
            }
            v2Var4.s = v2Var4.y1;
            v2Var4.w = i11;
            if (!v2Var4.z1) {
                v2Var4.z1 = true;
                v2Var4.y1.T(true, 0.0f);
                v2Var4.y1.setCallback(v2Var4);
                v2Var4.y1.start();
            }
            float measuredWidth3 = v2Var4.getMeasuredWidth() + v2Var4.w1;
            if (v2Var4.B1 >= f7) {
            }
            int measuredWidth22 = (v2Var4.getMeasuredWidth() - org.telegram.messenger.i0.L(43.0f)) - (v2Var4.y1.getIntrinsicWidth() / 2);
            int y32 = z20.y(52.0f, v2Var4.getMeasuredHeight(), 2);
            int intrinsicWidth2 = (v2Var4.y1.getIntrinsicWidth() / 2) + measuredWidth22;
            int intrinsicHeight2 = (v2Var4.y1.getIntrinsicHeight() / 2) + y32;
            if (v2Var4.B1 <= f10) {
            }
            canvas3.save();
            canvas3.translate(measuredWidth22, y32);
            f13 = v2Var4.C1;
            if (f13 != 0.0f) {
            }
            p2Var3 = p2Var2;
            boolean z262 = z10;
            z.t(z262 ? 1 : 0, z262 ? 1 : 0, v2Var4.y1);
            v2Var4.y1.draw(canvas3);
            canvas3.restore();
            canvas3.clipRect(f12, 0.0f, v2Var4.getMeasuredWidth(), v2Var4.getMeasuredHeight());
            str4 = str3;
            ceil = (int) Math.ceil(org.telegram.ui.ActionBar.t6.M0.measureText(str4));
            i15 = i14;
            if (v2Var4.F4 == i15) {
            }
            v2Var4.F4 = i15;
            v2Var4.G4 = v2Var4.getMeasuredWidth();
            TextPaint textPaint2 = org.telegram.ui.ActionBar.t6.N0;
            int min2 = Math.min(org.telegram.messenger.i0.L(80.0f), ceil);
            Layout.Alignment alignment2 = Layout.Alignment.ALIGN_CENTER;
            staticLayout = new StaticLayout(str4, textPaint2, min2, alignment2, 1.0f, 0.0f, false);
            v2Var4.E4 = staticLayout;
            if (staticLayout.getLineCount() > 1) {
            }
            if (v2Var4.E4 == null) {
            }
            canvas3.restore();
        }
        if (v2Var4.w1 != 0.0f) {
            canvas3.save();
            canvas3.translate(v2Var4.w1, 0.0f);
            f15 = 0.0f + v2Var4.w1;
        } else {
            f15 = 0.0f;
        }
        float L2 = org.telegram.messenger.i0.L(8.0f) * v2Var4.o1;
        boolean z27 = v2Var4.q4;
        RectF rectF2 = v2Var4.r4;
        if (z27) {
            f16 = 0.0f;
            rectF2.set(0.0f, 0.0f, v2Var4.getMeasuredWidth(), org.telegram.messenger.i0.W1(v2Var4.i0, v2Var4.getMeasuredHeight(), v2Var4.getCollapsedHeight()));
            rectF2.offset(0.0f, (-v2Var4.E3) + v2Var4.C0);
            canvas3.drawRoundRect(rectF2, L2, L2, org.telegram.ui.ActionBar.t6.u0);
        } else {
            f16 = 0.0f;
        }
        canvas3.save();
        canvas3.translate(f16, (-v2Var4.n) * v2Var4.i0);
        if (v2Var4.J0 == 0 || (tz.q1 && v2Var4.D1 == f16)) {
            p6Var2 = p6Var;
            if (v2Var4.getIsPinned() || v2Var4.z3) {
                org.telegram.ui.ActionBar.t6.v0.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.s9, p6Var2));
                org.telegram.ui.ActionBar.t6.v0.setAlpha((int) ((1.0f - v2Var4.i0) * r3.getAlpha()));
            }
        } else {
            p6Var2 = p6Var;
            float f30 = f7;
            org.telegram.ui.ActionBar.t6.v0.setColor(org.telegram.messenger.i0.S0(v2Var4.D1, f30, 0, org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.s9, p6Var2)));
            org.telegram.ui.ActionBar.t6.v0.setAlpha((int) ((f30 - v2Var4.i0) * r3.getAlpha()));
        }
        canvas3.restore();
        s2 s2Var4 = v2Var4.I4;
        s2Var4.b();
        if (v2Var4.C0 != 0.0f) {
            canvas3.save();
            canvas3.translate(0.0f, v2Var4.C0);
            f17 = v2Var4.C0 + 0.0f;
        } else {
            f17 = 0.0f;
        }
        float f31 = v2Var4.i0;
        if (f31 != 1.0f) {
            int i33 = -1;
            if (f31 != 0.0f) {
                float i34 = Utilities.i(f31 / 0.4f, 1.0f, 0.0f);
                if (tz.o() >= 2) {
                    f21 = f14;
                    i21 = -1;
                    s2Var = s2Var4;
                    f22 = 1.0f;
                    i33 = canvas3.saveLayerAlpha(sc.e.z(1.0f, i34, org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(k01.getRightPaddingSize() + 1)), 0.0f, v2Var4.getMeasuredWidth(), v2Var4.getMeasuredHeight(), (int) ((1.0f - v2Var4.i0) * 255.0f), 31);
                    i20 = 1;
                } else {
                    s2Var = s2Var4;
                    f21 = f14;
                    i21 = -1;
                    f22 = 1.0f;
                    int save = canvas3.save();
                    i20 = 1;
                    canvas3.clipRect(sc.e.z(1.0f, i34, org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(k01.getRightPaddingSize() + 1)), 0.0f, v2Var4.getMeasuredWidth(), v2Var4.getMeasuredHeight());
                    i33 = save;
                }
                canvas3.translate((-(v2Var4.getMeasuredWidth() - org.telegram.messenger.i0.L(74.0f))) * 0.7f * v2Var4.i0, 0.0f);
                f15 += (-(v2Var4.getMeasuredWidth() - org.telegram.messenger.i0.L(74.0f))) * 0.7f * v2Var4.i0;
            } else {
                s2Var = s2Var4;
                f21 = f14;
                f22 = 1.0f;
                i20 = 1;
                i21 = -1;
            }
            float f32 = f15;
            if (v2Var4.w1 != 0.0f || v2Var4.o1 != 0.0f) {
                canvas3.save();
                org.telegram.ui.ActionBar.t6.v0.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.d6, p6Var2));
                rectF2.set(v2Var4.getMeasuredWidth() - org.telegram.messenger.i0.L(64.0f), 0.0f, v2Var4.getMeasuredWidth(), v2Var4.getMeasuredHeight());
                rectF2.offset(0.0f, -v2Var4.E3);
                canvas3.drawRoundRect(rectF2, L2, L2, org.telegram.ui.ActionBar.t6.v0);
                if (v2Var4.q4) {
                    canvas3.drawRoundRect(rectF2, L2, L2, org.telegram.ui.ActionBar.t6.u0);
                }
                if (v2Var4.J0 != 0 && (!tz.q1 || v2Var4.D1 != 0.0f)) {
                    org.telegram.ui.ActionBar.t6.v0.setColor(org.telegram.messenger.i0.S0(v2Var4.D1, f22, 0, org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.s9, p6Var2)));
                    org.telegram.ui.ActionBar.t6.v0.setAlpha((int) ((f22 - v2Var4.i0) * r0.getAlpha()));
                } else if (v2Var4.getIsPinned() || v2Var4.z3) {
                    org.telegram.ui.ActionBar.t6.v0.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.s9, p6Var2));
                    org.telegram.ui.ActionBar.t6.v0.setAlpha((int) ((f22 - v2Var4.i0) * r0.getAlpha()));
                }
                canvas3.restore();
            }
            if (v2Var4.w1 != 0.0f) {
                float f33 = v2Var4.o1;
                if (f33 < f22) {
                    float f34 = f33 + 0.10666667f;
                    v2Var4.o1 = f34;
                    if (f34 > f22) {
                        v2Var4.o1 = f22;
                    }
                    i18 = i20;
                }
                i18 = 0;
            } else {
                float f35 = v2Var4.o1;
                if (f35 > 0.0f) {
                    float f36 = f35 - 0.10666667f;
                    v2Var4.o1 = f36;
                    if (f36 < 0.0f) {
                        v2Var4.o1 = 0.0f;
                    }
                    i18 = i20;
                }
                i18 = 0;
            }
            if (v2Var4.G2) {
                z.t(v2Var4.J2, v2Var4.K2, org.telegram.ui.ActionBar.t6.a1);
                org.telegram.ui.ActionBar.t6.a1.draw(canvas3);
            }
            boolean z28 = v2Var4.r2;
            int L3 = org.telegram.messenger.i0.L((z28 || tz.p1) ? 10.0f : 14.0f);
            if (((!z28 && !tz.p1) || v2Var4.X()) && v2Var4.T()) {
                L3 -= org.telegram.messenger.i0.L(v2Var4.X() ? 8.0f : 9.0f);
            }
            if (v2Var4.z2 != null) {
                if (!v2Var4.D2 || v2Var4.A2) {
                    f23 = 24.0f;
                    i22 = i33;
                } else {
                    if (v2Var4.C2 && v2Var4.E2 == null) {
                        Paint paint = new Paint();
                        v2Var4.E2 = paint;
                        paint.setShader(new LinearGradient(0.0f, 0.0f, org.telegram.messenger.i0.L(24.0f), 0.0f, new int[]{i21, 0}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
                        v2Var4.E2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                    } else if (v2Var4.F2 == null) {
                        Paint paint2 = new Paint();
                        v2Var4.F2 = paint2;
                        paint2.setShader(new LinearGradient(0.0f, 0.0f, org.telegram.messenger.i0.L(24.0f), 0.0f, new int[]{0, i21}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
                        v2Var4.F2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                    }
                    f23 = 24.0f;
                    i22 = i33;
                    canvas3.saveLayerAlpha(0.0f, 0.0f, v2Var4.getMeasuredWidth(), v2Var4.getMeasuredHeight(), zs.e4, 31);
                    int i35 = v2Var4.x2;
                    canvas3.clipRect(i35, 0, v2Var4.y2 + i35, v2Var4.getMeasuredHeight());
                }
                if (v2Var4.J0 != 0) {
                    TextPaint textPaint3 = org.telegram.ui.ActionBar.t6.B0[v2Var4.E0];
                    int w04 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Y8, p6Var2);
                    textPaint3.linkColor = w04;
                    textPaint3.setColor(w04);
                } else if (v2Var4.h2 != null || ((q2Var = v2Var4.G0) != null && q2Var.g == 2)) {
                    TextPaint textPaint4 = org.telegram.ui.ActionBar.t6.B0[v2Var4.E0];
                    int w05 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Z8, p6Var2);
                    textPaint4.linkColor = w05;
                    textPaint4.setColor(w05);
                } else {
                    TextPaint textPaint5 = org.telegram.ui.ActionBar.t6.B0[v2Var4.E0];
                    int w06 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.X8, p6Var2);
                    textPaint5.linkColor = w06;
                    textPaint5.setColor(w06);
                }
                canvas3.save();
                canvas3.translate(v2Var4.x2 + v2Var4.B2, L3);
                nh.i.f(canvas3, v2Var4.z2);
                StaticLayout staticLayout3 = v2Var4.z2;
                z17 = z28;
                i23 = i21;
                s2Var2 = s2Var;
                i24 = i20;
                org.telegram.ui.Components.o5.drawAnimatedEmojis(canvas3, staticLayout3, v2Var4.p3, -0.075f, null, 0.0f, 0.0f, 0.0f, 1.0f, v2Var4.R(0, staticLayout3.getPaint().getColor()));
                canvas3.restore();
                if (v2Var4.D2 && !v2Var4.A2) {
                    canvas3.save();
                    if (v2Var4.C2) {
                        canvas3.translate(v2Var4.x2, 0.0f);
                        canvas3.drawRect(0.0f, 0.0f, org.telegram.messenger.i0.L(f23), v2Var4.getMeasuredHeight(), v2Var4.E2);
                    } else {
                        canvas3.translate((v2Var4.x2 + v2Var4.y2) - org.telegram.messenger.i0.L(f23), 0.0f);
                        canvas3.drawRect(0.0f, 0.0f, org.telegram.messenger.i0.L(f23), v2Var4.getMeasuredHeight(), v2Var4.F2);
                    }
                    canvas3.restore();
                    canvas3.restore();
                }
            } else {
                f23 = 24.0f;
                i22 = i33;
                z17 = z28;
                i23 = i21;
                s2Var2 = s2Var;
                i24 = i20;
            }
            if (v2Var4.N2 != null && v2Var4.J0 == 0) {
                canvas3.save();
                canvas3.translate(v2Var4.L2, v2Var4.M2);
                TextPaint timeTextPaint = v2Var4.getTimeTextPaint();
                if (v2Var4.getIsPinned()) {
                    canvas3.translate(org.telegram.messenger.i0.L(20.0f), 0.0f);
                    float height = (v2Var4.N2.getHeight() / f21) - org.telegram.messenger.i0.L(8.5f);
                    float f37 = -org.telegram.messenger.i0.L(20.0f);
                    float L4 = org.telegram.messenger.i0.L(6.0f) + v2Var4.N2.getWidth();
                    Drawable drawable = (!v2Var4.G3 || v2Var4.U()) ? org.telegram.ui.ActionBar.t6.k1 : org.telegram.ui.ActionBar.t6.l1;
                    int L5 = (int) (((org.telegram.messenger.i0.L(17.0f) - drawable.getIntrinsicHeight()) / f21) + height);
                    int L6 = org.telegram.messenger.i0.L(4.0f) + ((int) f37);
                    drawable.setBounds(L6, L5, drawable.getIntrinsicWidth() + L6, drawable.getIntrinsicHeight() + L5);
                    int alpha = timeTextPaint.getAlpha();
                    timeTextPaint.setAlpha(27);
                    canvas3.drawRoundRect(f37, height, L4, height + org.telegram.messenger.i0.L(17.0f), org.telegram.messenger.i0.L(8.5f), org.telegram.messenger.i0.L(8.5f), timeTextPaint);
                    timeTextPaint.setAlpha(alpha);
                    drawable.draw(canvas3);
                }
                int color = v2Var4.N2.getPaint().getColor();
                int i36 = color != timeTextPaint.getColor() ? i24 : 0;
                if (i36 != 0) {
                    v2Var4.N2.getPaint().setColor(timeTextPaint.getColor());
                }
                nh.i.f(canvas3, v2Var4.N2);
                if (i36 != 0) {
                    v2Var4.N2.getPaint().setColor(color);
                }
                canvas3.restore();
            }
            if (v2Var4.L()) {
                org.telegram.ui.ActionBar.t6.b1.setBounds(v2Var4.O2, ((v2Var4.N2.getHeight() - org.telegram.ui.ActionBar.t6.b1.getIntrinsicHeight()) / 2) + v2Var4.M2, org.telegram.ui.ActionBar.t6.b1.getIntrinsicWidth() + v2Var4.O2, org.telegram.ui.ActionBar.t6.b1.getIntrinsicHeight() + ((v2Var4.N2.getHeight() - org.telegram.ui.ActionBar.t6.b1.getIntrinsicHeight()) / 2) + v2Var4.M2);
                org.telegram.ui.ActionBar.t6.b1.draw(canvas3);
            }
            if (v2Var4.s3 != null && !v2Var4.X()) {
                if (v2Var4.J0 != 0) {
                    TextPaint textPaint6 = org.telegram.ui.ActionBar.t6.G0;
                    int w07 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.n9, p6Var2);
                    textPaint6.linkColor = w07;
                    textPaint6.setColor(w07);
                } else if (v2Var4.l2 != null) {
                    TextPaint textPaint7 = org.telegram.ui.ActionBar.t6.G0;
                    int w08 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.j9, p6Var2);
                    textPaint7.linkColor = w08;
                    textPaint7.setColor(w08);
                } else {
                    TextPaint textPaint8 = org.telegram.ui.ActionBar.t6.G0;
                    int w09 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.m9, p6Var2);
                    textPaint8.linkColor = w09;
                    textPaint8.setColor(w09);
                }
                canvas3.save();
                canvas3.translate(v2Var4.r3, v2Var4.q3);
                try {
                    nh.i.f(canvas3, v2Var4.s3);
                    StaticLayout staticLayout4 = v2Var4.s3;
                    org.telegram.ui.Components.o5.drawAnimatedEmojis(canvas3, staticLayout4, v2Var4.n3, -0.075f, null, 0.0f, 0.0f, 0.0f, 1.0f, v2Var4.R(i24, staticLayout4.getPaint().getColor()));
                } catch (Exception e) {
                    org.telegram.messenger.f8.f(e);
                }
                canvas3.restore();
            }
            if (v2Var4.e3 != null) {
                if (v2Var4.J0 == 0) {
                    TextPaint textPaint9 = org.telegram.ui.ActionBar.t6.F0[v2Var4.E0];
                    int w010 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.g9, p6Var2);
                    textPaint9.linkColor = w010;
                    textPaint9.setColor(w010);
                } else if (v2Var4.g2 != null) {
                    TextPaint textPaint10 = org.telegram.ui.ActionBar.t6.F0[v2Var4.E0];
                    int w011 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.l9, p6Var2);
                    textPaint10.linkColor = w011;
                    textPaint10.setColor(w011);
                } else {
                    TextPaint textPaint11 = org.telegram.ui.ActionBar.t6.F0[v2Var4.E0];
                    int w012 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.h9, p6Var2);
                    textPaint11.linkColor = w012;
                    textPaint11.setColor(w012);
                }
                float L7 = org.telegram.messenger.i0.L(14.0f);
                s2 s2Var5 = s2Var2;
                float f38 = s2Var5.m ? v2Var4.a3 - (s2Var5.l * L7) : v2Var4.a3 + (s2Var5.l * L7);
                if (((!z17 && !tz.p1) || v2Var4.X()) && v2Var4.T()) {
                    f38 -= org.telegram.messenger.i0.L(v2Var4.X() ? 10.0f : 11.0f);
                }
                if (s2Var5.l != 1.0f) {
                    canvas3.save();
                    canvas3.translate(v2Var4.b3, f38);
                    int alpha2 = v2Var4.e3.getPaint().getAlpha();
                    v2Var4.e3.getPaint().setAlpha((int) ((1.0f - s2Var5.l) * alpha2));
                    ArrayList arrayList = v2Var4.j3;
                    if (arrayList.isEmpty()) {
                        f27 = L7;
                        rectF = rectF2;
                        p6Var4 = p6Var2;
                        p2Var4 = p2Var3;
                        s2Var3 = s2Var5;
                        i28 = alpha2;
                        f24 = 1.0f;
                        nh.i.f(canvas3, v2Var4.e3);
                        StaticLayout staticLayout5 = v2Var4.e3;
                        org.telegram.ui.Components.o5.drawAnimatedEmojis(canvas3, staticLayout5, v2Var4.m3, -0.075f, null, 0.0f, 0.0f, 0.0f, 1.0f, v2Var4.R(2, staticLayout5.getPaint().getColor()));
                    } else {
                        try {
                            canvas3.save();
                            nh.i.d(canvas3, arrayList);
                            nh.i.f(canvas3, v2Var4.e3);
                        } catch (Exception e7) {
                            e = e7;
                            f27 = L7;
                        }
                        try {
                            StaticLayout staticLayout6 = v2Var4.e3;
                            try {
                                p6Var4 = p6Var2;
                                f27 = L7;
                                f24 = 1.0f;
                                p2Var4 = p2Var3;
                                i28 = alpha2;
                                rectF = rectF2;
                                s2Var3 = s2Var5;
                            } catch (Exception e10) {
                                e = e10;
                                f27 = L7;
                                rectF = rectF2;
                                p6Var4 = p6Var2;
                                p2Var4 = p2Var3;
                                s2Var3 = s2Var5;
                                i28 = alpha2;
                                f24 = 1.0f;
                                org.telegram.messenger.f8.f(e);
                                v2Var4.e3.getPaint().setAlpha(i28);
                                canvas3.restore();
                                canvas3.save();
                                if (!s2Var3.m) {
                                }
                                if (!z17) {
                                    z23 -= org.telegram.messenger.i0.L(v2Var4.X() ? 10.0f : 11.0f);
                                    canvas3.translate(v2Var4.d3, z23);
                                    staticLayout2 = v2Var4.f3;
                                    if (staticLayout2 != null) {
                                        int alpha3 = staticLayout2.getPaint().getAlpha();
                                        v2Var4.f3.getPaint().setAlpha((int) (alpha3 * s2Var3.l));
                                        v2Var4.f3.draw(canvas3);
                                        v2Var4.f3.getPaint().setAlpha(alpha3);
                                    }
                                    canvas3.restore();
                                    if (v2Var4.f3 != null) {
                                        if (i27 < 0) {
                                        }
                                        u02 = org.telegram.ui.ActionBar.t6.u0(i27);
                                        if (u02 != null) {
                                        }
                                    }
                                    if (v2Var4.h3 != null) {
                                    }
                                    if (v2Var4.J0 == 0) {
                                    }
                                    float f39 = 12.5f;
                                    if (v2Var3.k4) {
                                    }
                                    p6Var3 = p6Var4;
                                    if (v2Var3.b1) {
                                    }
                                    if (v2Var3.j1 != 2) {
                                    }
                                    i16 = 17;
                                    if (!v2Var3.j4) {
                                    }
                                    z13 = z18 ? 1 : 0;
                                    if (!v2Var3.y3) {
                                    }
                                    if (!cd.X) {
                                    }
                                    org.telegram.ui.ActionBar.t6.Z0.setAlpha((int) (v2Var3.x3 * 255.0f));
                                    z.t(v2Var3.D3, v2Var3.C3, org.telegram.ui.ActionBar.t6.Z0);
                                    org.telegram.ui.ActionBar.t6.Z0.draw(canvas3);
                                    float f40 = v2Var3.S3.e;
                                    if (v2Var3.t3) {
                                    }
                                    v2Var = v2Var3;
                                    f18 = f24;
                                    if (v2Var.H3) {
                                    }
                                    if (v2Var.R1 > 0) {
                                    }
                                    fVar = v2Var.t0;
                                    if (fVar != null) {
                                    }
                                    i25 = i22;
                                    r12 = z18;
                                    if (i25 != -1) {
                                    }
                                    z14 = v2Var.b2;
                                    imageReceiver = v2Var.Y1;
                                    if (z14) {
                                    }
                                    z15 = v2Var.y;
                                    m2Var = v2Var.u0;
                                    if (z15) {
                                        if (!v2Var.D) {
                                        }
                                        if (!v2Var.O0) {
                                            float centerX = m2Var.F.centerX() + org.telegram.messenger.i0.L(20.33f);
                                            float centerY = m2Var.F.centerY() + org.telegram.messenger.i0.L(19.0f);
                                            if (v2Var.D0 == null) {
                                            }
                                            rf.o.d(v2Var.D0, centerX, centerY, i16);
                                            canvas3.drawCircle(v2Var.D0.getBounds().exactCenterX(), v2Var.D0.getBounds().exactCenterY(), org.telegram.messenger.i0.L(8.0f), org.telegram.ui.ActionBar.t6.n0(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.d6, p6Var3)));
                                            v2Var.D0.draw(canvas3);
                                        }
                                    }
                                    if (v2Var.b2) {
                                    }
                                    if (imageReceiver.H()) {
                                        i18 = 1;
                                    }
                                    if (v2Var.i0 > 0.0f) {
                                    }
                                    v2Var2 = v2Var;
                                    if (v2Var2.C0 != 0.0f) {
                                    }
                                    if (v2Var2.w1 != 0.0f) {
                                    }
                                    if (z11) {
                                        canvas3.save();
                                        canvas3.translate(0.0f, (-v2Var2.E3) - (v2Var2.n * v2Var2.i0));
                                        canvas3.clipRect(0.0f, (f18 - v2Var2.e2.J) * v2Var2.getMeasuredHeight(), v2Var2.getMeasuredWidth(), v2Var2.getMeasuredHeight());
                                        v2Var2.e2.c(canvas3, r12);
                                        canvas3.restore();
                                    }
                                    if (v2Var2.s2) {
                                    }
                                    f19 = 0.0f;
                                    i19 = 1;
                                    if (v2Var2.t1 != f19) {
                                    }
                                    canvas2 = canvas;
                                    if (z25) {
                                    }
                                    z16 = v2Var2.y3;
                                    if (!z16) {
                                    }
                                    if (z16) {
                                    }
                                    i18 = i19;
                                    if (v2Var2.m1) {
                                    }
                                }
                                z23 -= org.telegram.messenger.i0.L(v2Var4.X() ? 10.0f : 11.0f);
                                canvas3.translate(v2Var4.d3, z23);
                                staticLayout2 = v2Var4.f3;
                                if (staticLayout2 != null) {
                                }
                                canvas3.restore();
                                if (v2Var4.f3 != null) {
                                }
                                if (v2Var4.h3 != null) {
                                }
                                if (v2Var4.J0 == 0) {
                                }
                                float f392 = 12.5f;
                                if (v2Var3.k4) {
                                }
                                p6Var3 = p6Var4;
                                if (v2Var3.b1) {
                                }
                                if (v2Var3.j1 != 2) {
                                }
                                i16 = 17;
                                if (!v2Var3.j4) {
                                }
                                z13 = z18 ? 1 : 0;
                                if (!v2Var3.y3) {
                                }
                                if (!cd.X) {
                                }
                                org.telegram.ui.ActionBar.t6.Z0.setAlpha((int) (v2Var3.x3 * 255.0f));
                                z.t(v2Var3.D3, v2Var3.C3, org.telegram.ui.ActionBar.t6.Z0);
                                org.telegram.ui.ActionBar.t6.Z0.draw(canvas3);
                                float f402 = v2Var3.S3.e;
                                if (v2Var3.t3) {
                                }
                                v2Var = v2Var3;
                                f18 = f24;
                                if (v2Var.H3) {
                                }
                                if (v2Var.R1 > 0) {
                                }
                                fVar = v2Var.t0;
                                if (fVar != null) {
                                }
                                i25 = i22;
                                r12 = z18;
                                if (i25 != -1) {
                                }
                                z14 = v2Var.b2;
                                imageReceiver = v2Var.Y1;
                                if (z14) {
                                }
                                z15 = v2Var.y;
                                m2Var = v2Var.u0;
                                if (z15) {
                                }
                                if (v2Var.b2) {
                                }
                                if (imageReceiver.H()) {
                                }
                                if (v2Var.i0 > 0.0f) {
                                }
                                v2Var2 = v2Var;
                                if (v2Var2.C0 != 0.0f) {
                                }
                                if (v2Var2.w1 != 0.0f) {
                                }
                                if (z11) {
                                }
                                if (v2Var2.s2) {
                                }
                                f19 = 0.0f;
                                i19 = 1;
                                if (v2Var2.t1 != f19) {
                                }
                                canvas2 = canvas;
                                if (z25) {
                                }
                                z16 = v2Var2.y3;
                                if (!z16) {
                                }
                                if (z16) {
                                }
                                i18 = i19;
                                if (v2Var2.m1) {
                                }
                            }
                            try {
                                org.telegram.ui.Components.o5.drawAnimatedEmojis(canvas3, staticLayout6, v2Var4.m3, -0.075f, arrayList, 0.0f, 0.0f, 0.0f, 1.0f, v2Var4.R(2, staticLayout6.getPaint().getColor()));
                                canvas3.restore();
                                for (int i37 = 0; i37 < arrayList.size(); i37++) {
                                    nh.i iVar = (nh.i) arrayList.get(i37);
                                    iVar.h(v2Var4.e3.getPaint().getColor());
                                    iVar.draw(canvas3);
                                }
                            } catch (Exception e11) {
                                e = e11;
                                org.telegram.messenger.f8.f(e);
                                v2Var4.e3.getPaint().setAlpha(i28);
                                canvas3.restore();
                                canvas3.save();
                                if (!s2Var3.m) {
                                }
                                if (!z17) {
                                }
                                z23 -= org.telegram.messenger.i0.L(v2Var4.X() ? 10.0f : 11.0f);
                                canvas3.translate(v2Var4.d3, z23);
                                staticLayout2 = v2Var4.f3;
                                if (staticLayout2 != null) {
                                }
                                canvas3.restore();
                                if (v2Var4.f3 != null) {
                                }
                                if (v2Var4.h3 != null) {
                                }
                                if (v2Var4.J0 == 0) {
                                }
                                float f3922 = 12.5f;
                                if (v2Var3.k4) {
                                }
                                p6Var3 = p6Var4;
                                if (v2Var3.b1) {
                                }
                                if (v2Var3.j1 != 2) {
                                }
                                i16 = 17;
                                if (!v2Var3.j4) {
                                }
                                z13 = z18 ? 1 : 0;
                                if (!v2Var3.y3) {
                                }
                                if (!cd.X) {
                                }
                                org.telegram.ui.ActionBar.t6.Z0.setAlpha((int) (v2Var3.x3 * 255.0f));
                                z.t(v2Var3.D3, v2Var3.C3, org.telegram.ui.ActionBar.t6.Z0);
                                org.telegram.ui.ActionBar.t6.Z0.draw(canvas3);
                                float f4022 = v2Var3.S3.e;
                                if (v2Var3.t3) {
                                }
                                v2Var = v2Var3;
                                f18 = f24;
                                if (v2Var.H3) {
                                }
                                if (v2Var.R1 > 0) {
                                }
                                fVar = v2Var.t0;
                                if (fVar != null) {
                                }
                                i25 = i22;
                                r12 = z18;
                                if (i25 != -1) {
                                }
                                z14 = v2Var.b2;
                                imageReceiver = v2Var.Y1;
                                if (z14) {
                                }
                                z15 = v2Var.y;
                                m2Var = v2Var.u0;
                                if (z15) {
                                }
                                if (v2Var.b2) {
                                }
                                if (imageReceiver.H()) {
                                }
                                if (v2Var.i0 > 0.0f) {
                                }
                                v2Var2 = v2Var;
                                if (v2Var2.C0 != 0.0f) {
                                }
                                if (v2Var2.w1 != 0.0f) {
                                }
                                if (z11) {
                                }
                                if (v2Var2.s2) {
                                }
                                f19 = 0.0f;
                                i19 = 1;
                                if (v2Var2.t1 != f19) {
                                }
                                canvas2 = canvas;
                                if (z25) {
                                }
                                z16 = v2Var2.y3;
                                if (!z16) {
                                }
                                if (z16) {
                                }
                                i18 = i19;
                                if (v2Var2.m1) {
                                }
                            }
                        } catch (Exception e12) {
                            e = e12;
                            f27 = L7;
                            rectF = rectF2;
                            p6Var4 = p6Var2;
                            p2Var4 = p2Var3;
                            s2Var3 = s2Var5;
                            i28 = alpha2;
                            f24 = 1.0f;
                            org.telegram.messenger.f8.f(e);
                            v2Var4.e3.getPaint().setAlpha(i28);
                            canvas3.restore();
                            canvas3.save();
                            if (!s2Var3.m) {
                            }
                            if (!z17) {
                            }
                            z23 -= org.telegram.messenger.i0.L(v2Var4.X() ? 10.0f : 11.0f);
                            canvas3.translate(v2Var4.d3, z23);
                            staticLayout2 = v2Var4.f3;
                            if (staticLayout2 != null) {
                            }
                            canvas3.restore();
                            if (v2Var4.f3 != null) {
                            }
                            if (v2Var4.h3 != null) {
                            }
                            if (v2Var4.J0 == 0) {
                            }
                            float f39222 = 12.5f;
                            if (v2Var3.k4) {
                            }
                            p6Var3 = p6Var4;
                            if (v2Var3.b1) {
                            }
                            if (v2Var3.j1 != 2) {
                            }
                            i16 = 17;
                            if (!v2Var3.j4) {
                            }
                            z13 = z18 ? 1 : 0;
                            if (!v2Var3.y3) {
                            }
                            if (!cd.X) {
                            }
                            org.telegram.ui.ActionBar.t6.Z0.setAlpha((int) (v2Var3.x3 * 255.0f));
                            z.t(v2Var3.D3, v2Var3.C3, org.telegram.ui.ActionBar.t6.Z0);
                            org.telegram.ui.ActionBar.t6.Z0.draw(canvas3);
                            float f40222 = v2Var3.S3.e;
                            if (v2Var3.t3) {
                            }
                            v2Var = v2Var3;
                            f18 = f24;
                            if (v2Var.H3) {
                            }
                            if (v2Var.R1 > 0) {
                            }
                            fVar = v2Var.t0;
                            if (fVar != null) {
                            }
                            i25 = i22;
                            r12 = z18;
                            if (i25 != -1) {
                            }
                            z14 = v2Var.b2;
                            imageReceiver = v2Var.Y1;
                            if (z14) {
                            }
                            z15 = v2Var.y;
                            m2Var = v2Var.u0;
                            if (z15) {
                            }
                            if (v2Var.b2) {
                            }
                            if (imageReceiver.H()) {
                            }
                            if (v2Var.i0 > 0.0f) {
                            }
                            v2Var2 = v2Var;
                            if (v2Var2.C0 != 0.0f) {
                            }
                            if (v2Var2.w1 != 0.0f) {
                            }
                            if (z11) {
                            }
                            if (v2Var2.s2) {
                            }
                            f19 = 0.0f;
                            i19 = 1;
                            if (v2Var2.t1 != f19) {
                            }
                            canvas2 = canvas;
                            if (z25) {
                            }
                            z16 = v2Var2.y3;
                            if (!z16) {
                            }
                            if (z16) {
                            }
                            i18 = i19;
                            if (v2Var2.m1) {
                            }
                        }
                    }
                    v2Var4.e3.getPaint().setAlpha(i28);
                    canvas3.restore();
                } else {
                    f27 = L7;
                    rectF = rectF2;
                    p6Var4 = p6Var2;
                    p2Var4 = p2Var3;
                    s2Var3 = s2Var5;
                    f24 = 1.0f;
                }
                canvas3.save();
                z23 = !s2Var3.m ? c3.i0.z(f24, s2Var3.l, f27, v2Var4.a3) : sc.e.z(f24, s2Var3.l, f27, v2Var4.a3);
                if (((!z17 && !tz.p1) || v2Var4.X()) && v2Var4.T()) {
                    z23 -= org.telegram.messenger.i0.L(v2Var4.X() ? 10.0f : 11.0f);
                }
                canvas3.translate(v2Var4.d3, z23);
                staticLayout2 = v2Var4.f3;
                if (staticLayout2 != null && s2Var3.l > 0.0f) {
                    int alpha32 = staticLayout2.getPaint().getAlpha();
                    v2Var4.f3.getPaint().setAlpha((int) (alpha32 * s2Var3.l));
                    v2Var4.f3.draw(canvas3);
                    v2Var4.f3.getPaint().setAlpha(alpha32);
                }
                canvas3.restore();
                if (v2Var4.f3 != null && ((i27 = v2Var4.j2) >= 0 || (s2Var3.l > 0.0f && s2Var3.n >= 0))) {
                    if (i27 < 0) {
                        i27 = s2Var3.n;
                    }
                    u02 = org.telegram.ui.ActionBar.t6.u0(i27);
                    if (u02 != null) {
                        canvas3.save();
                        u02.b(i0.b.o(org.telegram.ui.ActionBar.t6.v0(org.telegram.ui.ActionBar.t6.p9), (int) (Color.alpha(r4) * s2Var3.l)));
                        float z29 = s2Var3.m ? c3.i0.z(f24, s2Var3.l, f27, v2Var4.a3) : sc.e.z(f24, s2Var3.l, f27, v2Var4.a3);
                        if (((!z17 && !tz.p1) || v2Var4.X()) && v2Var4.T()) {
                            z29 -= org.telegram.messenger.i0.L(v2Var4.X() ? 10.0f : 11.0f);
                        }
                        if (i27 == 1 || i27 == 4) {
                            canvas3.translate(v2Var4.C4, z29 + (i27 == 1 ? org.telegram.messenger.i0.L(f24) : 0));
                        } else {
                            canvas3.translate(v2Var4.C4, ((org.telegram.messenger.i0.L(18.0f) - u02.getIntrinsicHeight()) / f21) + z29);
                        }
                        u02.draw(canvas3);
                        v2Var4.invalidate();
                        canvas3.restore();
                    }
                }
            } else {
                rectF = rectF2;
                p6Var4 = p6Var2;
                p2Var4 = p2Var3;
                s2Var3 = s2Var2;
                f24 = 1.0f;
            }
            if (v2Var4.h3 != null) {
                canvas3.save();
                if (v2Var4.b0 == null) {
                    v2Var4.b0 = new Paint(1);
                }
                if (v2Var4.c0 == null) {
                    jc jcVar = new jc(v2Var4);
                    v2Var4.c0 = jcVar;
                    z22 = false;
                    final boolean z30 = false ? 1 : 0;
                    jcVar.e(new Runnable(v2Var4) { // from class: org.telegram.ui.Cells.k2
                        public final /* synthetic */ v2 b;

                        {
                            this.b = v2Var4;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (z30) {
                                case 0:
                                    v2 v2Var5 = this.b;
                                    r2 r2Var = v2Var5.d0;
                                    if (r2Var != null) {
                                        r2Var.r(v2Var5);
                                        break;
                                    }
                                    break;
                                default:
                                    v2 v2Var6 = this.b;
                                    r2 r2Var2 = v2Var6.d0;
                                    if (r2Var2 != null) {
                                        r2Var2.l(v2Var6);
                                        break;
                                    }
                                    break;
                            }
                        }
                    });
                    jc jcVar2 = v2Var4.c0;
                    final int i38 = 1;
                    Runnable runnable = new Runnable(v2Var4) { // from class: org.telegram.ui.Cells.k2
                        public final /* synthetic */ v2 b;

                        {
                            this.b = v2Var4;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i38) {
                                case 0:
                                    v2 v2Var5 = this.b;
                                    r2 r2Var = v2Var5.d0;
                                    if (r2Var != null) {
                                        r2Var.r(v2Var5);
                                        break;
                                    }
                                    break;
                                default:
                                    v2 v2Var6 = this.b;
                                    r2 r2Var2 = v2Var6.d0;
                                    if (r2Var2 != null) {
                                        r2Var2.l(v2Var6);
                                        break;
                                    }
                                    break;
                            }
                        }
                    };
                    jcVar2.l = true;
                    jcVar2.j = runnable;
                } else {
                    z22 = false;
                }
                if (v2Var4.f0 && v2Var4.M4 != 0 && ((i26 = v2Var4.j1) == 0 || i26 == 7 || i26 == 8)) {
                    v2Var4.c0.d(i0.b.o(v2Var4.a0.getColor(), org.telegram.ui.ActionBar.t6.j1() ? 36 : 26));
                    jc jcVar3 = v2Var4.c0;
                    jcVar3.i = z22;
                    jcVar3.c = z22 ? 1 : 0;
                    int i39 = v2Var4.M4;
                    if (i39 != 0 && i39 > 0) {
                        float f41 = v2Var4.a3;
                        if (((!z17 && !tz.p1) || v2Var4.X()) && v2Var4.T()) {
                            f41 -= org.telegram.messenger.i0.L(v2Var4.X() ? 10.0f : 11.0f);
                        }
                        RectF rectF3 = org.telegram.messenger.i0.P;
                        float primaryHorizontal = v2Var4.e3.getPrimaryHorizontal(z22 ? 1 : 0) + org.telegram.messenger.i0.L(f21) + v2Var4.b3;
                        float f42 = v2Var4.b3;
                        StaticLayout staticLayout7 = v2Var4.e3;
                        rectF3.set(primaryHorizontal, f41, (staticLayout7.getPrimaryHorizontal(Math.min(staticLayout7.getText().length(), v2Var4.M4)) + f42) - org.telegram.messenger.i0.L(3.0f), v2Var4.g3 - org.telegram.messenger.i0.L(4.0f));
                        rectF3.inset(-org.telegram.messenger.i0.L(8.0f), -org.telegram.messenger.i0.L(4.0f));
                        if (rectF3.right > rectF3.left) {
                            v2Var4.c0.a(rectF3);
                        }
                    }
                    float lineLeft = v2Var4.h3.getLineLeft(z22 ? 1 : 0);
                    RectF rectF4 = org.telegram.messenger.i0.P;
                    rectF4.set(v2Var4.c3 + lineLeft + org.telegram.messenger.i0.L(f21), org.telegram.messenger.i0.L(f21) + v2Var4.g3, v2Var4.h3.getLineWidth(z22 ? 1 : 0) + v2Var4.c3 + lineLeft + org.telegram.messenger.i0.L(12.0f), v2Var4.h3.getHeight() + v2Var4.g3);
                    rectF4.inset(-org.telegram.messenger.i0.L(8.0f), -org.telegram.messenger.i0.L(3.0f));
                    v2Var4.c0.a(rectF4);
                    jc jcVar4 = v2Var4.c0;
                    jcVar4.c(canvas3, jcVar4.g);
                    y yVar = jcVar4.e;
                    if (yVar != null) {
                        yVar.draw(canvas3);
                    }
                    org.telegram.ui.ActionBar.t6.t1.setAlpha(zs.J1);
                    z.u(org.telegram.ui.ActionBar.t6.t1, rectF4.right - org.telegram.messenger.i0.L(18.0f), c3.i0.B(rectF4.height(), org.telegram.ui.ActionBar.t6.t1.getIntrinsicHeight(), f21, rectF4.top));
                    org.telegram.ui.ActionBar.t6.t1.draw(canvas3);
                }
                canvas3.translate(v2Var4.c3, v2Var4.g3);
                ArrayList arrayList2 = v2Var4.l3;
                if (arrayList2.isEmpty()) {
                    nh.i.f(canvas3, v2Var4.h3);
                    StaticLayout staticLayout8 = v2Var4.h3;
                    org.telegram.ui.Components.o5.drawAnimatedEmojis(canvas3, staticLayout8, v2Var4.o3, -0.075f, null, 0.0f, 0.0f, 0.0f, 1.0f, v2Var4.R(3, staticLayout8.getPaint().getColor()));
                } else {
                    try {
                        canvas3.save();
                        nh.i.d(canvas3, arrayList2);
                        nh.i.f(canvas3, v2Var4.h3);
                        StaticLayout staticLayout9 = v2Var4.h3;
                        org.telegram.ui.Components.o5.drawAnimatedEmojis(canvas3, staticLayout9, v2Var4.o3, -0.075f, arrayList2, 0.0f, 0.0f, 0.0f, 1.0f, v2Var4.R(3, staticLayout9.getPaint().getColor()));
                        canvas3.restore();
                        for (int i40 = z22 ? 1 : 0; i40 < arrayList2.size(); i40++) {
                            nh.i iVar2 = (nh.i) arrayList2.get(i40);
                            iVar2.h(v2Var4.h3.getPaint().getColor());
                            iVar2.draw(canvas3);
                        }
                    } catch (Exception e13) {
                        org.telegram.messenger.f8.f(e13);
                    }
                }
                canvas.restore();
                z18 = z22;
            } else {
                z18 = false;
            }
            if (v2Var4.J0 == 0) {
                int i41 = (v2Var4.S2 ? 1 : 0) + (v2Var4.Q2 ? 2 : z18 ? 1 : 0) + (v2Var4.R2 ? 4 : z18 ? 1 : 0);
                int i42 = v2Var4.x4;
                if (i42 >= 0 && i42 != i41 && !v2Var4.z4) {
                    v2Var4.H(i42, i41);
                }
                boolean z31 = v2Var4.z4;
                if (z31) {
                    i41 = v2Var4.v4;
                }
                boolean z32 = (i41 & 1) != 0 ? true : z18 ? 1 : 0;
                boolean z33 = (i41 & 2) != 0 ? true : z18 ? 1 : 0;
                boolean z34 = (i41 & 4) != 0 ? true : z18 ? 1 : 0;
                if (z31) {
                    int i43 = v2Var4.w4;
                    boolean z35 = (i43 & 1) != 0 ? true : z18 ? 1 : 0;
                    boolean z36 = (i43 & 2) != 0 ? true : z18 ? 1 : 0;
                    i17 = 4;
                    if ((i43 & 4) != 0) {
                        z20 = z34;
                        z21 = true;
                    } else {
                        z20 = z34;
                        z21 = z18 ? 1 : 0;
                    }
                    if (z32 || z35 || !z21 || z36 || !z33 || !z20) {
                        boolean z37 = z33;
                        boolean z38 = z36;
                        canvas3 = canvas;
                        v2Var4.J(canvas3, z35, z38, z21, false, f24 - v2Var4.y4);
                        v2Var4.J(canvas3, z32, z37, z20, false, v2Var4.y4);
                        v2Var3 = this;
                        v2Var3.x4 = (v2Var3.S2 ? 1 : 0) + (!v2Var3.Q2 ? 2 : z18 ? 1 : 0) + (!v2Var3.R2 ? i17 : z18 ? 1 : 0);
                    } else {
                        canvas3 = canvas;
                        v2Var4.J(canvas3, z32, z33, z20, true, v2Var4.y4);
                    }
                } else {
                    i17 = 4;
                    v2Var4 = this;
                    canvas3 = canvas;
                    v2Var4.J(canvas3, z32, z33, z34, false, 1.0f);
                }
                v2Var3 = v2Var4;
                v2Var3.x4 = (v2Var3.S2 ? 1 : 0) + (!v2Var3.Q2 ? 2 : z18 ? 1 : 0) + (!v2Var3.R2 ? i17 : z18 ? 1 : 0);
            } else {
                canvas3 = canvas;
                v2Var3 = v2Var4;
                i17 = 4;
            }
            float f392222 = 12.5f;
            if (v2Var3.k4) {
                int L8 = org.telegram.messenger.i0.L((z17 || tz.p1) ? 12.5f : 15.5f);
                if (((!z17 && !tz.p1) || v2Var3.X()) && v2Var3.T()) {
                    L8 -= org.telegram.messenger.i0.L(9.0f);
                }
                org.telegram.ui.Components.d5 d5Var = v2Var3.o4;
                if (d5Var != null) {
                    d5Var.setBounds(v2Var3.x2 - org.telegram.messenger.i0.L(19.0f), org.telegram.messenger.i0.L(-1.0f) + L8, v2Var3.x2 - org.telegram.messenger.i0.L(2.0f), org.telegram.messenger.i0.L(16.0f) + L8);
                    p6Var3 = p6Var4;
                    d5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.z9, p6Var3)));
                    d5Var.draw(canvas3);
                    boolean z39 = (!v2Var3.b1 || v2Var3.Z0 || v2Var3.Q0) ? true : z18 ? 1 : 0;
                    if (v2Var3.j1 != 2 || ((!z39 && v2Var3.c1 <= 0.0f) || v2Var3.j4 || v2Var3.p4 != 0)) {
                        i16 = 17;
                    } else {
                        if (z39) {
                            float f43 = v2Var3.c1;
                            if (f43 != f24) {
                                float f44 = f43 + 0.10666667f;
                                v2Var3.c1 = f44;
                                if (f44 > f24) {
                                    v2Var3.c1 = f24;
                                } else {
                                    v2Var3.invalidate();
                                }
                                float L9 = (!v2Var3.l4 ? v2Var3.I2 : v2Var3.H2) - org.telegram.messenger.i0.L((!z17 || tz.p1) ? 0.0f : f24);
                                float L10 = org.telegram.messenger.i0.L(!tz.p1 ? 13.5f : 17.5f);
                                if (((!z17 && !tz.p1) || v2Var3.X()) && v2Var3.T()) {
                                    L10 -= org.telegram.messenger.i0.L(v2Var3.X() ? 8.0f : 9.0f);
                                }
                                z.u(org.telegram.ui.ActionBar.t6.c1, L9, L10);
                                z.u(org.telegram.ui.ActionBar.t6.d1, L9, L10);
                                i16 = 17;
                                rf.o.d(org.telegram.ui.ActionBar.t6.e1, org.telegram.ui.ActionBar.t6.c1.getBounds().exactCenterX() + org.telegram.messenger.i0.L(2.0f), org.telegram.ui.ActionBar.t6.c1.getBounds().exactCenterY(), 17);
                                if (v2Var3.c1 != f24) {
                                    canvas3.save();
                                    float f45 = v2Var3.c1;
                                    canvas3.scale(f45, f45, org.telegram.ui.ActionBar.t6.c1.getBounds().centerX(), org.telegram.ui.ActionBar.t6.c1.getBounds().centerY());
                                    if (v2Var3.Q0) {
                                        org.telegram.ui.ActionBar.t6.e1.setAlpha((int) (v2Var3.c1 * 255.0f));
                                        org.telegram.ui.ActionBar.t6.e1.draw(canvas3);
                                        org.telegram.ui.ActionBar.t6.e1.setAlpha(zs.e4);
                                    } else if (v2Var3.b1) {
                                        org.telegram.ui.ActionBar.t6.d1.setAlpha((int) (v2Var3.c1 * 255.0f));
                                        org.telegram.ui.ActionBar.t6.d1.draw(canvas3);
                                        org.telegram.ui.ActionBar.t6.d1.setAlpha(zs.e4);
                                    } else {
                                        org.telegram.ui.ActionBar.t6.c1.setAlpha((int) (v2Var3.c1 * 255.0f));
                                        org.telegram.ui.ActionBar.t6.c1.draw(canvas3);
                                        org.telegram.ui.ActionBar.t6.c1.setAlpha(zs.e4);
                                    }
                                    canvas3.restore();
                                } else if (v2Var3.Q0) {
                                    org.telegram.ui.ActionBar.t6.e1.draw(canvas3);
                                } else if (v2Var3.b1) {
                                    org.telegram.ui.ActionBar.t6.d1.draw(canvas3);
                                } else {
                                    org.telegram.ui.ActionBar.t6.c1.draw(canvas3);
                                }
                            }
                        }
                        if (!z39) {
                            float f46 = v2Var3.c1;
                            if (f46 != 0.0f) {
                                float f47 = f46 - 0.10666667f;
                                v2Var3.c1 = f47;
                                if (f47 < 0.0f) {
                                    v2Var3.c1 = 0.0f;
                                } else {
                                    v2Var3.invalidate();
                                }
                            }
                        }
                        float L92 = (!v2Var3.l4 ? v2Var3.I2 : v2Var3.H2) - org.telegram.messenger.i0.L((!z17 || tz.p1) ? 0.0f : f24);
                        float L102 = org.telegram.messenger.i0.L(!tz.p1 ? 13.5f : 17.5f);
                        if (!z17) {
                            L102 -= org.telegram.messenger.i0.L(v2Var3.X() ? 8.0f : 9.0f);
                            z.u(org.telegram.ui.ActionBar.t6.c1, L92, L102);
                            z.u(org.telegram.ui.ActionBar.t6.d1, L92, L102);
                            i16 = 17;
                            rf.o.d(org.telegram.ui.ActionBar.t6.e1, org.telegram.ui.ActionBar.t6.c1.getBounds().exactCenterX() + org.telegram.messenger.i0.L(2.0f), org.telegram.ui.ActionBar.t6.c1.getBounds().exactCenterY(), 17);
                            if (v2Var3.c1 != f24) {
                            }
                        }
                        L102 -= org.telegram.messenger.i0.L(v2Var3.X() ? 8.0f : 9.0f);
                        z.u(org.telegram.ui.ActionBar.t6.c1, L92, L102);
                        z.u(org.telegram.ui.ActionBar.t6.d1, L92, L102);
                        i16 = 17;
                        rf.o.d(org.telegram.ui.ActionBar.t6.e1, org.telegram.ui.ActionBar.t6.c1.getBounds().exactCenterX() + org.telegram.messenger.i0.L(2.0f), org.telegram.ui.ActionBar.t6.c1.getBounds().exactCenterY(), 17);
                        if (v2Var3.c1 != f24) {
                        }
                    }
                    if (!v2Var3.j4) {
                        float L11 = org.telegram.messenger.i0.L((z17 || tz.p1) ? 13.5f : 16.5f);
                        if (((!z17 && !tz.p1) || v2Var3.X()) && v2Var3.T()) {
                            L11 -= org.telegram.messenger.i0.L(9.0f);
                        }
                        z.u(org.telegram.ui.ActionBar.t6.f1, v2Var3.H2 - org.telegram.messenger.i0.L(f24), L11);
                        z.u(org.telegram.ui.ActionBar.t6.i1, v2Var3.H2 - org.telegram.messenger.i0.L(f24), L11);
                        org.telegram.ui.ActionBar.t6.f1.draw(canvas3);
                        org.telegram.ui.ActionBar.t6.i1.draw(canvas3);
                        t0Var2 = t0Var;
                    } else if (v2Var3.l4) {
                        int L12 = org.telegram.messenger.i0.L((z17 || tz.p1) ? 12.5f : 15.5f);
                        if (((!z17 && !tz.p1) || v2Var3.X()) && v2Var3.T()) {
                            L12 -= org.telegram.messenger.i0.L(9.0f);
                        }
                        org.telegram.ui.Components.d5 d5Var2 = v2Var3.n4;
                        if (d5Var2 != null) {
                            t0Var2 = t0Var;
                            t0Var2.setTranslationX((f32 + v2Var3.H2) - org.telegram.messenger.i0.L(2.0f));
                            t0Var2.setTranslationY((f17 + L12) - org.telegram.messenger.i0.L(4.0f));
                            if (v2Var3.i0 > 0.0f) {
                                d5Var2.setBounds(v2Var3.H2 - org.telegram.messenger.i0.L(2.0f), L12 - org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(20.0f) + v2Var3.H2, org.telegram.messenger.i0.L(22.0f) + (L12 - org.telegram.messenger.i0.L(4.0f)));
                                d5Var2.draw(canvas3);
                                z19 = z18 ? 1 : 0;
                            } else {
                                z19 = true;
                            }
                            d5Var2.k(Integer.valueOf(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.z9, p6Var3)));
                            z13 = z19;
                            if (!v2Var3.y3 || v2Var3.x3 != 0.0f) {
                                if (!cd.X) {
                                    Paint paintReorderGradient = v2Var3.getPaintReorderGradient();
                                    paintReorderGradient.setAlpha((int) (v2Var3.x3 * 255.0f));
                                    canvas3.save();
                                    canvas3.translate(v2Var3.D3 - org.telegram.messenger.i0.L(f23), v2Var3.C3);
                                    float f48 = f23;
                                    canvas.drawRect(0.0f, 0.0f, org.telegram.messenger.m5.B(f48, v2Var3.D3, v2Var3.getMeasuredWidth()), org.telegram.messenger.i0.L(f48), paintReorderGradient);
                                    canvas3 = canvas;
                                    canvas3.restore();
                                }
                                org.telegram.ui.ActionBar.t6.Z0.setAlpha((int) (v2Var3.x3 * 255.0f));
                                z.t(v2Var3.D3, v2Var3.C3, org.telegram.ui.ActionBar.t6.Z0);
                                org.telegram.ui.ActionBar.t6.Z0.draw(canvas3);
                            }
                            float f402222 = v2Var3.S3.e;
                            if (v2Var3.t3) {
                                org.telegram.ui.ActionBar.t6.Y0.setAlpha((int) ((f24 - v2Var3.x3) * 255.0f));
                                RectF rectF5 = rectF;
                                rectF5.set(v2Var3.v3, v2Var3.u3, org.telegram.messenger.i0.L(20.666f) + r0, org.telegram.messenger.i0.L(20.666f) + v2Var3.u3);
                                float f49 = org.telegram.messenger.i0.p * 10.5f;
                                canvas3.drawRoundRect(rectF5, f49, f49, org.telegram.ui.ActionBar.t6.x0);
                                z.t(org.telegram.messenger.i0.L(4.5f) + v2Var3.v3, org.telegram.messenger.i0.L(5.0f) + v2Var3.u3, org.telegram.ui.ActionBar.t6.Y0);
                                org.telegram.ui.ActionBar.t6.Y0.draw(canvas3);
                            } else {
                                RectF rectF6 = rectF;
                                if (((v2Var3.G3 || v2Var3.b4) && v2Var3.L3) || v2Var3.V3 != f24 || v2Var3.c4 || v2Var3.W3 != f24 || v2Var3.d4 || f402222 > 0.0f) {
                                    boolean U = v2Var3.U();
                                    canvas3 = canvas;
                                    f18 = f24;
                                    K(canvas3, U, v2Var3.M3, v2Var3.N3, v2Var3.Q3, 1.0f, false);
                                    v2Var = this;
                                    if (v2Var.b4) {
                                        org.telegram.ui.ActionBar.t6.w0.setAlpha((int) ((f18 - v2Var.x3) * 255.0f));
                                        if (v2Var.i4 != null) {
                                            rectF6.set(v2Var.e4, v2Var.M3, org.telegram.messenger.i0.L(12.666f) + r1 + v2Var.h4, org.telegram.messenger.i0.L(20.666f) + v2Var.M3);
                                            canvas3.drawRoundRect(rectF6, rectF6.height() / 2.0f, rectF6.height() / 2.0f, (!U || v2Var.k1 == 0) ? org.telegram.ui.ActionBar.t6.w0 : org.telegram.ui.ActionBar.t6.y0);
                                            org.telegram.ui.ActionBar.t6.M0.setAlpha((int) ((f18 - v2Var.x3) * 255.0f));
                                            canvas3.save();
                                            canvas3.translate(org.telegram.messenger.i0.L(6.333f) + v2Var.e4, org.telegram.messenger.i0.L(4.0f) + v2Var.M3);
                                            v2Var.i4.draw(canvas3);
                                            canvas3.restore();
                                        } else {
                                            Drawable drawable2 = org.telegram.ui.ActionBar.t6.m1;
                                            drawable2.setAlpha((int) ((f18 - v2Var.x3) * 255.0f));
                                            rf.o.d(drawable2, org.telegram.messenger.i0.L(10.333f) + v2Var.e4, org.telegram.messenger.i0.L(10.333f) + v2Var.M3, i16);
                                            drawable2.draw(canvas3);
                                        }
                                    }
                                    if (v2Var.c4 || v2Var.W3 != f18) {
                                        f25 = 10.333f;
                                        rectF6.set(v2Var.f4, v2Var.M3, org.telegram.messenger.i0.L(20.666f) + r1, org.telegram.messenger.i0.L(20.666f) + v2Var.M3);
                                        float f50 = v2Var.W3;
                                        if (f50 == f18) {
                                            f50 = f18;
                                        } else if (!v2Var.c4) {
                                            f50 = f18 - f50;
                                        }
                                        Drawable drawable3 = U ? org.telegram.ui.ActionBar.t6.q1 : org.telegram.ui.ActionBar.t6.n1;
                                        drawable3.setAlpha((int) ((f18 - v2Var.x3) * 255.0f));
                                        rf.o.d(drawable3, org.telegram.messenger.i0.L(10.333f) + r1, org.telegram.messenger.i0.L(10.333f) + v2Var.M3, i16);
                                        rf.o.b(canvas3, drawable3, f50);
                                    } else {
                                        f25 = 10.333f;
                                    }
                                    if ((v2Var.d4 || f402222 > 0.0f) && f402222 != 0.0f) {
                                        rectF6.set(v2Var.g4, v2Var.M3, org.telegram.messenger.i0.L(20.666f) + r1, org.telegram.messenger.i0.L(20.666f) + v2Var.M3);
                                        Drawable drawable4 = U ? org.telegram.ui.ActionBar.t6.r1 : org.telegram.ui.ActionBar.t6.o1;
                                        drawable4.setAlpha((int) ((f18 - v2Var.x3) * 255.0f));
                                        rf.o.d(drawable4, org.telegram.messenger.i0.L(f25) + r1, org.telegram.messenger.i0.L(f25) + v2Var.M3, i16);
                                        rf.o.b(canvas3, drawable4, f402222);
                                    }
                                    if (v2Var.H3) {
                                        if (v2Var.J3 == null) {
                                            v2Var.J3 = (LayerDrawable) f0.c.c(v2Var.getContext(), R.drawable.dialog_gram_transfer).mutate();
                                        }
                                        int w013 = org.telegram.ui.ActionBar.t6.w0(v2Var.U() ? org.telegram.ui.ActionBar.t6.V8 : org.telegram.ui.ActionBar.t6.U8, p6Var3);
                                        if (v2Var.K3 != w013) {
                                            Drawable drawable5 = v2Var.J3.getDrawable(z18 ? 1 : 0);
                                            v2Var.K3 = w013;
                                            drawable5.setColorFilter(new PorterDuffColorFilter(w013, PorterDuff.Mode.SRC_IN));
                                        }
                                        int L13 = ((org.telegram.messenger.i0.L(20.666f) - org.telegram.messenger.i0.L(28.0f)) / 2) + v2Var.M3;
                                        LayerDrawable layerDrawable = v2Var.J3;
                                        int i44 = v2Var.I3;
                                        layerDrawable.setBounds(i44, L13, org.telegram.messenger.i0.L(28.0f) + i44, org.telegram.messenger.i0.L(28.0f) + L13);
                                        v2Var.J3.setAlpha((int) ((f18 - v2Var.x3) * 255.0f));
                                        v2Var.J3.draw(canvas3);
                                    }
                                    if (v2Var.R1 > 0) {
                                        float f51 = s2Var3.l;
                                        if (f51 != f18) {
                                            if (f51 > 0.0f) {
                                                canvas.saveLayerAlpha(0.0f, 0.0f, v2Var.getWidth(), v2Var.getHeight(), (int) ((f18 - f51) * 255.0f), 31);
                                                canvas3 = canvas;
                                                if (s2Var3.m) {
                                                    L = -org.telegram.messenger.i0.L(14.0f);
                                                    f26 = s2Var3.l;
                                                } else {
                                                    L = org.telegram.messenger.i0.L(14.0f);
                                                    f26 = s2Var3.l;
                                                }
                                                canvas3.translate(0.0f, L * f26);
                                            }
                                            int i45 = z18 ? 1 : 0;
                                            while (i45 < v2Var.R1) {
                                                if (v2Var.U1[i45]) {
                                                    if (v2Var.T1 == null) {
                                                        Paint paint3 = new Paint(1);
                                                        v2Var.T1 = paint3;
                                                        paint3.setShadowLayer(org.telegram.messenger.i0.L(1.34f), 0.0f, org.telegram.messenger.i0.L(0.34f), 402653184);
                                                        v2Var.T1.setColor(z18 ? 1 : 0);
                                                    }
                                                    RectF rectF7 = org.telegram.messenger.i0.P;
                                                    ImageReceiver[] imageReceiverArr = v2Var.V1;
                                                    rectF7.set(imageReceiverArr[i45].x(), imageReceiverArr[i45].z(), imageReceiverArr[i45].y(), imageReceiverArr[i45].A());
                                                    imageReceiverArr[i45].g(canvas3);
                                                    if (v2Var.X1[i45]) {
                                                        Path path = v2Var.v0;
                                                        if (path == null) {
                                                            v2Var.v0 = new Path();
                                                        } else {
                                                            path.rewind();
                                                        }
                                                        v2Var.v0.addRoundRect(rectF7, imageReceiverArr[i45].D()[z18 ? 1 : 0], imageReceiverArr[i45].D()[1], Path.Direction.CW);
                                                        canvas3.save();
                                                        canvas3.clipPath(v2Var.v0);
                                                        if (v2Var.w0 == null) {
                                                            v2Var.w0 = new nh.i();
                                                        }
                                                        v2Var.w0.h(i0.b.o(i23, (int) (Color.alpha(i23) * 0.325f)));
                                                        v2Var.w0.setBounds((int) imageReceiverArr[i45].x(), (int) imageReceiverArr[i45].z(), (int) imageReceiverArr[i45].y(), (int) imageReceiverArr[i45].A());
                                                        v2Var.w0.draw(canvas3);
                                                        v2Var.invalidate();
                                                        canvas3.restore();
                                                    }
                                                    if (v2Var.W1[i45]) {
                                                        z.t((int) (imageReceiverArr[i45].r() - (org.telegram.ui.ActionBar.t6.U0.getIntrinsicWidth() / 2)), (int) (imageReceiverArr[i45].s() - (org.telegram.ui.ActionBar.t6.U0.getIntrinsicHeight() / 2)), org.telegram.ui.ActionBar.t6.U0);
                                                        org.telegram.ui.ActionBar.t6.U0.draw(canvas3);
                                                    }
                                                }
                                                i45++;
                                                i23 = -1;
                                            }
                                            if (s2Var3.l > 0.0f) {
                                                canvas3.restore();
                                            }
                                        }
                                    }
                                    fVar = v2Var.t0;
                                    if (fVar != null && !fVar.l()) {
                                        canvas3.save();
                                        canvas3.translate(v2Var.Y2, (v2Var.getMeasuredHeight() - org.telegram.messenger.i0.L(21.66f)) - (v2Var.s2 ? 1 : 0));
                                        v2Var.t0.g(canvas3, v2Var.Z2 - v2Var.Y2);
                                        canvas3.restore();
                                    }
                                    i25 = i22;
                                    r12 = z18;
                                    if (i25 != -1) {
                                        canvas3.restoreToCount(i25);
                                        r12 = z18;
                                    }
                                } else {
                                    if (v2Var3.E1) {
                                        canvas3.save();
                                        float a2 = v2Var3.F1.a(0.05f);
                                        RectF rectF8 = v2Var3.H1;
                                        canvas3.scale(a2, a2, rectF8.centerX(), rectF8.centerY());
                                        v2Var3.G1.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Ci, p6Var3));
                                        canvas3.drawRoundRect(rectF8, rectF8.height() / 2.0f, rectF8.height() / 2.0f, v2Var3.G1);
                                        qz0 qz0Var = v2Var3.I1;
                                        if (qz0Var != null) {
                                            qz0Var.c(rectF8.left + org.telegram.messenger.i0.L(13.0f), rectF8.centerY(), 1.0f, org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Gi, p6Var3), canvas);
                                        }
                                        canvas.restore();
                                    }
                                    canvas3 = canvas;
                                }
                            }
                            v2Var = v2Var3;
                            f18 = f24;
                            if (v2Var.H3) {
                            }
                            if (v2Var.R1 > 0) {
                            }
                            fVar = v2Var.t0;
                            if (fVar != null) {
                                canvas3.save();
                                canvas3.translate(v2Var.Y2, (v2Var.getMeasuredHeight() - org.telegram.messenger.i0.L(21.66f)) - (v2Var.s2 ? 1 : 0));
                                v2Var.t0.g(canvas3, v2Var.Z2 - v2Var.Y2);
                                canvas3.restore();
                            }
                            i25 = i22;
                            r12 = z18;
                            if (i25 != -1) {
                            }
                        } else {
                            t0Var2 = t0Var;
                            Drawable drawable6 = (Drawable) ea.f.d().f;
                            int L14 = v2Var3.H2 - org.telegram.messenger.i0.L(f24);
                            if (!z17 && !tz.p1) {
                                f392222 = 15.5f;
                            }
                            z.t(L14, org.telegram.messenger.i0.L(f392222), drawable6);
                            drawable6.draw(canvas3);
                        }
                    } else {
                        t0Var2 = t0Var;
                        if (v2Var3.p4 != 0) {
                            int L15 = org.telegram.messenger.i0.L((z17 || tz.p1) ? 12.0f : 15.0f);
                            if (((!z17 && !tz.p1) || v2Var3.X()) && v2Var3.T()) {
                                L15 -= org.telegram.messenger.i0.L(9.0f);
                            }
                            z.t(v2Var3.H2, L15, v2Var3.p4 == 1 ? org.telegram.ui.ActionBar.t6.g1 : org.telegram.ui.ActionBar.t6.h1);
                            (v2Var3.p4 == 1 ? org.telegram.ui.ActionBar.t6.g1 : org.telegram.ui.ActionBar.t6.h1).draw(canvas3);
                        }
                    }
                    z13 = z18 ? 1 : 0;
                    if (!v2Var3.y3) {
                    }
                    if (!cd.X) {
                    }
                    org.telegram.ui.ActionBar.t6.Z0.setAlpha((int) (v2Var3.x3 * 255.0f));
                    z.t(v2Var3.D3, v2Var3.C3, org.telegram.ui.ActionBar.t6.Z0);
                    org.telegram.ui.ActionBar.t6.Z0.draw(canvas3);
                    float f4022222 = v2Var3.S3.e;
                    if (v2Var3.t3) {
                    }
                    v2Var = v2Var3;
                    f18 = f24;
                    if (v2Var.H3) {
                    }
                    if (v2Var.R1 > 0) {
                    }
                    fVar = v2Var.t0;
                    if (fVar != null) {
                    }
                    i25 = i22;
                    r12 = z18;
                    if (i25 != -1) {
                    }
                }
            }
            p6Var3 = p6Var4;
            if (v2Var3.b1) {
            }
            if (v2Var3.j1 != 2) {
            }
            i16 = 17;
            if (!v2Var3.j4) {
            }
            z13 = z18 ? 1 : 0;
            if (!v2Var3.y3) {
            }
            if (!cd.X) {
            }
            org.telegram.ui.ActionBar.t6.Z0.setAlpha((int) (v2Var3.x3 * 255.0f));
            z.t(v2Var3.D3, v2Var3.C3, org.telegram.ui.ActionBar.t6.Z0);
            org.telegram.ui.ActionBar.t6.Z0.draw(canvas3);
            float f40222222 = v2Var3.S3.e;
            if (v2Var3.t3) {
            }
            v2Var = v2Var3;
            f18 = f24;
            if (v2Var.H3) {
            }
            if (v2Var.R1 > 0) {
            }
            fVar = v2Var.t0;
            if (fVar != null) {
            }
            i25 = i22;
            r12 = z18;
            if (i25 != -1) {
            }
        } else {
            v2Var = v2Var4;
            i16 = 17;
            p6Var3 = p6Var2;
            p2Var4 = p2Var3;
            t0Var2 = t0Var;
            r12 = 0;
            f18 = 1.0f;
            i17 = 4;
            z13 = false;
            i18 = 0;
        }
        z14 = v2Var.b2;
        imageReceiver = v2Var.Y1;
        if (z14) {
            canvas3.save();
            float interpolation2 = p2Var4.getInterpolation(v2Var.c2 / 170.0f) + f18;
            canvas3.scale(interpolation2, interpolation2, imageReceiver.r(), imageReceiver.s());
        }
        z15 = v2Var.y;
        m2Var = v2Var.u0;
        if (z15 && (!v2Var.P || (tL_forumTopic2 = v2Var.N) == null || tL_forumTopic2.id != 1 || (mh0Var = v2Var.e2) == null || !mh0Var.X || mh0Var.Y)) {
            if (!v2Var.D) {
                if (v2Var.Z1 == null) {
                    v2Var.Z1 = new wd0();
                }
                v2Var.Z1.a((int) m2Var.F.centerX(), (int) m2Var.F.centerY(), (int) (m2Var.F.width() / 2.0f));
                canvas3.save();
                canvas3.clipPath(v2Var.Z1);
                imageReceiver.A0(m2Var.F);
                imageReceiver.g(canvas3);
                canvas3.restore();
            } else if (v2Var.E) {
                rf.o.f(imageReceiver, org.telegram.messenger.i0.N(f18) + m2Var.F.centerX(), m2Var.F.centerY(), org.telegram.messenger.i0.L(48.0f), org.telegram.messenger.i0.L(48.0f));
                rf.o.a(canvas3, org.telegram.ui.ActionBar.t6.S0, imageReceiver.r(), imageReceiver.s(), org.telegram.messenger.i0.L(48.0f));
                imageReceiver.g(canvas3);
            } else {
                boolean z40 = v2Var.F;
                m2Var.r = (z40 || v2Var.J0 != 0) ? true : r12;
                int i46 = m2Var.z;
                if (z40) {
                    m2Var.z = 1;
                }
                th.w5.h(v2Var.H0, canvas3, imageReceiver, m2Var);
                if (m2Var.w) {
                    v2Var.F();
                }
                m2Var.z = i46;
            }
            if (!v2Var.O0 && ((((chat = v2Var.g2) != null && chat.linked_community_id != 0) || ((user = v2Var.f2) != null && user.linked_community_id != 0)) && !v2Var.E && v2Var.N0 && !v2Var.V())) {
                float centerX2 = m2Var.F.centerX() + org.telegram.messenger.i0.L(20.33f);
                float centerY2 = m2Var.F.centerY() + org.telegram.messenger.i0.L(19.0f);
                if (v2Var.D0 == null) {
                    v2Var.D0 = new yg.c();
                }
                rf.o.d(v2Var.D0, centerX2, centerY2, i16);
                canvas3.drawCircle(v2Var.D0.getBounds().exactCenterX(), v2Var.D0.getBounds().exactCenterY(), org.telegram.messenger.i0.L(8.0f), org.telegram.ui.ActionBar.t6.n0(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.d6, p6Var3)));
                v2Var.D0.draw(canvas3);
            }
        }
        if (v2Var.b2) {
            canvas3.restore();
        }
        if (imageReceiver.H() && I(canvas)) {
            i18 = 1;
        }
        if (v2Var.i0 > 0.0f || v2Var.J0 != 0) {
            v2Var2 = v2Var;
        } else {
            boolean U2 = v2Var.U();
            RectF rectF9 = m2Var.F;
            int width = (int) (((rectF9.width() + rectF9.left) - v2Var.O3) - org.telegram.messenger.i0.L(5.0f));
            RectF rectF10 = m2Var.F;
            K(canvas3, U2, (int) ((m2Var.F.height() + imageReceiver.z()) - org.telegram.messenger.i0.L(22.0f)), width, (int) (((rectF10.width() + rectF10.left) - v2Var.P3) - org.telegram.messenger.i0.L(5.0f)), v2Var.i0, true);
            v2Var2 = this;
        }
        if (v2Var2.C0 != 0.0f) {
            canvas3.restore();
        }
        if (v2Var2.w1 != 0.0f) {
            canvas3.restore();
        }
        if (z11 && ((v2Var2.J0 != 0 || (v2Var2.P && (tL_forumTopic = v2Var2.N) != null && tL_forumTopic.id == 1)) && v2Var2.w1 == 0.0f && v2Var2.e2 != null)) {
            canvas3.save();
            canvas3.translate(0.0f, (-v2Var2.E3) - (v2Var2.n * v2Var2.i0));
            canvas3.clipRect(0.0f, (f18 - v2Var2.e2.J) * v2Var2.getMeasuredHeight(), v2Var2.getMeasuredWidth(), v2Var2.getMeasuredHeight());
            v2Var2.e2.c(canvas3, r12);
            canvas3.restore();
        }
        if (v2Var2.s2) {
            int L16 = (v2Var2.t2 || (v2Var2.J0 != 0 && v2Var2.m1)) ? r12 : org.telegram.messenger.i0.L(v2Var2.I);
            if (v2Var2.i0 != f18) {
                int alpha4 = org.telegram.ui.ActionBar.t6.k0.getAlpha();
                float f52 = v2Var2.i0;
                if (f52 != 0.0f) {
                    org.telegram.ui.ActionBar.t6.k0.setAlpha((int) ((f18 - f52) * alpha4));
                }
                i19 = 1;
                float measuredHeight = (v2Var2.getMeasuredHeight() - 1) - (v2Var2.n * v2Var2.i0);
                if (cd.X) {
                    canvas.drawLine(0.0f, measuredHeight, v2Var2.getMeasuredWidth() - L16, measuredHeight, org.telegram.ui.ActionBar.t6.k0);
                } else {
                    canvas.drawLine(L16, measuredHeight, v2Var2.getMeasuredWidth(), measuredHeight, org.telegram.ui.ActionBar.t6.k0);
                }
                f19 = 0.0f;
                if (v2Var2.i0 != 0.0f) {
                    org.telegram.ui.ActionBar.t6.k0.setAlpha(alpha4);
                }
                if (v2Var2.t1 != f19) {
                    if (Build.VERSION.SDK_INT != 24) {
                        canvas.restore();
                    } else {
                        org.telegram.ui.ActionBar.t6.v0.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.d6, p6Var3));
                        canvas.drawRect(0.0f, 0.0f, v2Var2.getMeasuredWidth(), v2Var2.u1 * v2Var2.t1, org.telegram.ui.ActionBar.t6.v0);
                        canvas.drawRect(0.0f, v2Var2.getMeasuredHeight() - ((int) (v2Var2.v1 * v2Var2.t1)), v2Var2.getMeasuredWidth(), v2Var2.getMeasuredHeight(), org.telegram.ui.ActionBar.t6.v0);
                        canvas2 = canvas;
                        if (z25) {
                            float f53 = f18 - f28;
                            int measuredHeight2 = (int) (v2Var2.getMeasuredHeight() * f53);
                            int v02 = org.telegram.ui.ActionBar.t6.v0(org.telegram.ui.ActionBar.t6.d6);
                            if (v2Var2.O4 == null) {
                                v2Var2.O4 = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, null);
                            }
                            if (v2Var2.P4 != v02) {
                                v2Var2.P4 = v02;
                                v2Var2.O4.setColors(new int[]{v02, 16777215 & v02});
                            }
                            float a10 = w7.u.a((f53 - 0.05f) * 10.0f, 0.0f, f18);
                            v2Var2.O4.setBounds(r12, measuredHeight2, v2Var2.getMeasuredWidth(), org.telegram.messenger.i0.L(6.0f) + measuredHeight2);
                            v2Var2.O4.setAlpha((int) (a10 * 255.0f));
                            v2Var2.O4.draw(canvas2);
                            canvas2.restore();
                        }
                        z16 = v2Var2.y3;
                        if (!z16 || v2Var2.x3 != 0.0f) {
                            if (z16) {
                                float f54 = v2Var2.x3;
                                if (f54 < 1.0f) {
                                    float f55 = f54 + 0.09411765f;
                                    v2Var2.x3 = f55;
                                    if (f55 > 1.0f) {
                                        v2Var2.x3 = 1.0f;
                                    }
                                    f20 = 0.0f;
                                }
                            } else {
                                float f56 = v2Var2.x3;
                                f20 = 0.0f;
                                if (f56 > 0.0f) {
                                    float f57 = f56 - 0.09411765f;
                                    v2Var2.x3 = f57;
                                    if (f57 < 0.0f) {
                                        v2Var2.x3 = 0.0f;
                                    }
                                }
                                if (v2Var2.m1) {
                                    float f58 = v2Var2.D1;
                                    if (f58 > f20) {
                                        float f59 = f58 - 0.069565214f;
                                        v2Var2.D1 = f59;
                                        if (f59 < f20) {
                                            v2Var2.D1 = f20;
                                        }
                                        org.telegram.ui.Components.r8 r8Var = v2Var2.a2;
                                        if (r8Var.n == 2) {
                                            r8Var.o = gr.h.getInterpolation(v2Var2.D1);
                                        }
                                        i18 = i19;
                                    }
                                    if (v2Var2.b2) {
                                        float f60 = v2Var2.c2 + 16.0f;
                                        v2Var2.c2 = f60;
                                        if (f60 >= 170.0f) {
                                            v2Var2.c2 = 170.0f;
                                            v2Var2.b2 = r12;
                                        }
                                        i18 = i19;
                                    }
                                    if (!v2Var2.A1) {
                                        float f61 = v2Var2.C1;
                                        if (f61 < 1.0f) {
                                            float f62 = f61 + 0.09411765f;
                                            v2Var2.C1 = f62;
                                            if (f62 > 1.0f) {
                                                v2Var2.C1 = 1.0f;
                                                i18 = i19;
                                            }
                                        }
                                        float f63 = v2Var2.B1;
                                        if (f63 < 1.0f) {
                                            float f64 = f63 + 0.053333335f;
                                            v2Var2.B1 = f64;
                                            if (f64 > 1.0f) {
                                                v2Var2.B1 = 1.0f;
                                            }
                                            i18 = i19;
                                        }
                                        t0Var2.setVisibility(!z13 ? r12 : i17);
                                        if (i18 == 0) {
                                            v2Var2.invalidate();
                                            return;
                                        }
                                        return;
                                    }
                                    if (v2Var2.C1 == 1.0f) {
                                        v2Var2.C1 = 0.0f;
                                        i18 = i19;
                                    }
                                    float f65 = v2Var2.B1;
                                    if (f65 > 0.0f) {
                                        float f66 = f65 - 0.053333335f;
                                        v2Var2.B1 = f66;
                                        if (f66 < 0.0f) {
                                            v2Var2.B1 = 0.0f;
                                        }
                                        i18 = i19;
                                    }
                                    t0Var2.setVisibility(!z13 ? r12 : i17);
                                    if (i18 == 0) {
                                    }
                                } else {
                                    float f67 = v2Var2.D1;
                                    if (f67 < 1.0f) {
                                        float f68 = f67 + 0.069565214f;
                                        v2Var2.D1 = f68;
                                        if (f68 > 1.0f) {
                                            v2Var2.D1 = 1.0f;
                                        }
                                        org.telegram.ui.Components.r8 r8Var2 = v2Var2.a2;
                                        if (r8Var2.n == 2) {
                                            r8Var2.o = gr.h.getInterpolation(v2Var2.D1);
                                        }
                                        i18 = i19;
                                    }
                                    if (v2Var2.b2) {
                                    }
                                    if (!v2Var2.A1) {
                                    }
                                }
                            }
                            i18 = i19;
                            if (v2Var2.m1) {
                            }
                        }
                        f20 = 0.0f;
                        if (v2Var2.m1) {
                        }
                    }
                }
                canvas2 = canvas;
                if (z25) {
                }
                z16 = v2Var2.y3;
                if (!z16) {
                }
                if (z16) {
                }
                i18 = i19;
                if (v2Var2.m1) {
                }
            }
        }
        f19 = 0.0f;
        i19 = 1;
        if (v2Var2.t1 != f19) {
        }
        canvas2 = canvas;
        if (z25) {
        }
        z16 = v2Var2.y3;
        if (!z16) {
        }
        if (z16) {
        }
        i18 = i19;
        if (v2Var2.m1) {
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        mh0 mh0Var;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (W() && (mh0Var = this.e2) != null && tz.q1 && mh0Var.J == 0.0f) {
            accessibilityNodeInfo.setVisibleToUser(false);
        } else {
            accessibilityNodeInfo.addAction(16);
            accessibilityNodeInfo.addAction(32);
            if (!W() && this.D4 != null) {
                accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(R.id.acc_action_chat_preview, cd.L0(2131754940, null)));
            }
        }
        n2 n2Var = this.q2;
        if (n2Var == null || !n2Var.a.q) {
            return;
        }
        accessibilityNodeInfo.setClassName("android.widget.CheckBox");
        accessibilityNodeInfo.setCheckable(true);
        accessibilityNodeInfo.setChecked(true);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.i0 != 0.0f || this.P || this.F || !this.u0.a(this, motionEvent)) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int L;
        int i14;
        if (this.H0 == 0 && this.G0 == null) {
            return;
        }
        bi.t0 t0Var = this.m4;
        if (t0Var != null) {
            t0Var.layout(0, 0, org.telegram.messenger.i0.L(22.0f), org.telegram.messenger.i0.L(22.0f));
        }
        if (this.q2 != null) {
            int i15 = this.I;
            boolean z11 = this.r2;
            int L2 = org.telegram.messenger.i0.L(i15 - ((z11 || tz.p1) ? 29 : 27));
            if (this.k0) {
                i14 = org.telegram.messenger.i0.L(8.0f);
                L = (getMeasuredHeight() - this.q2.getMeasuredHeight()) >> 1;
            } else {
                if (cd.X) {
                    L2 = (i12 - i10) - L2;
                }
                int i16 = L2;
                L = org.telegram.messenger.i0.L(this.U + ((z11 || tz.p1) ? 6 : 0));
                i14 = i16;
            }
            n2 n2Var = this.q2;
            n2Var.layout(i14, L, n2Var.getMeasuredWidth() + i14, this.q2.getMeasuredHeight() + L);
        }
        int measuredWidth = (getMeasuredWidth() + getMeasuredHeight()) << 16;
        if (measuredWidth != this.K4 || this.A0) {
            this.A0 = false;
            this.K4 = measuredWidth;
            try {
                z();
            } catch (Exception e) {
                org.telegram.messenger.f8.g(e, true);
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        bi.t0 t0Var = this.m4;
        if (t0Var != null) {
            t0Var.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(22.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(22.0f), TLObject.FLAG_30));
        }
        n2 n2Var = this.q2;
        if (n2Var != null) {
            n2Var.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(24.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(24.0f), TLObject.FLAG_30));
        }
        if (this.P) {
            int size = View.MeasureSpec.getSize(i10);
            boolean z10 = this.r2;
            setMeasuredDimension(size, org.telegram.messenger.i0.L(((z10 || tz.p1) ? this.K : this.J) + ((!T() || ((z10 || tz.p1) && !X())) ? 0 : X() ? this.M : this.L)) + (this.s2 ? 1 : 0));
            this.Q = false;
            if (this.P && !T()) {
                z();
                if (this.R) {
                    this.Q = true;
                    z();
                }
            }
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i10), G());
        this.u1 = 0;
        this.v1 = getMeasuredHeight();
    }

    @Override // android.view.View
    public final void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        jj captionMessage;
        TLRPC.User Z1;
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        StringBuilder sb2 = new StringBuilder();
        String str = this.L0;
        if (str != null) {
            sb2.append(str);
            sb2.append(". ");
        } else if (this.J0 == 1) {
            z20.q(null, 2131754136, sb2, ". ");
        } else {
            if (this.h2 != null) {
                z20.q(null, 2131754777, sb2, ". ");
            }
            if (!this.P || this.N == null) {
                TLRPC.User user = this.f2;
                if (user != null) {
                    if (h20.z(user)) {
                        sb2.append(cd.L0(2131746281, null));
                    } else if (h20.s(this.f2)) {
                        sb2.append(cd.L0(2131754252, null));
                    } else {
                        if (this.f2.bot) {
                            z20.q(null, 2131753156, sb2, ". ");
                        }
                        TLRPC.User user2 = this.f2;
                        if (user2.self) {
                            sb2.append(cd.L0(2131745918, null));
                        } else {
                            sb2.append(org.telegram.messenger.i5.m(0, user2.first_name, user2.last_name));
                        }
                    }
                    sb2.append(". ");
                } else {
                    TLRPC.Chat chat = this.g2;
                    if (chat != null) {
                        if (chat.broadcast) {
                            sb2.append(cd.L0(2131754904, null));
                        } else {
                            sb2.append(cd.L0(2131754876, null));
                        }
                        sb2.append(". ");
                        sb2.append(this.g2.title);
                        sb2.append(". ");
                    }
                }
            } else {
                z20.q(null, 2131754746, sb2, ". ");
                sb2.append(this.N.title);
                sb2.append(". ");
            }
        }
        if (this.j4) {
            z20.q(null, 2131754739, sb2, ". ");
        }
        if (this.Z0) {
            z20.q(null, 2131754829, sb2, ". ");
        }
        if (Y()) {
            z20.q(null, 2131754741, sb2, ". ");
        }
        int i10 = this.S0;
        if (i10 > 0) {
            sb2.append(cd.G(i10, "NewMessages", new Object[0]));
            sb2.append(". ");
        }
        int i11 = this.U0;
        if (i11 > 0) {
            sb2.append(cd.G(i11, "AccDescrMentionCount", new Object[0]));
            sb2.append(". ");
        }
        if (this.V0 > 0) {
            z20.q(null, 2131754841, sb2, ". ");
        }
        jj jjVar = this.f1;
        if (jjVar == null || this.J0 != 0) {
            accessibilityEvent.setContentDescription(sb2);
            setContentDescription(sb2);
            return;
        }
        int i12 = this.R0;
        if (i12 == 0) {
            i12 = jjVar.k.date;
        }
        String s10 = cd.s(i12, true);
        if (this.f1.N3()) {
            sb2.append(cd.a0("AccDescrSentDate", null, 2131754765, s10));
        } else {
            sb2.append(cd.a0("AccDescrReceivedDate", null, 2131754789, s10));
        }
        sb2.append(". ");
        if (this.g2 != null && !this.f1.N3() && this.f1.p3() && this.f1.k.action == null && (Z1 = vp.r1(this.F0).Z1(Long.valueOf(this.f1.k.from_id.user_id))) != null) {
            sb2.append(org.telegram.messenger.i5.m(0, Z1.first_name, Z1.last_name));
            sb2.append(". ");
        }
        if (this.h2 == null) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(this.f1.v);
            if (!this.f1.F3() && (captionMessage = getCaptionMessage()) != null && !TextUtils.isEmpty(captionMessage.z)) {
                if (sb3.length() > 0) {
                    sb3.append(". ");
                }
                sb3.append(captionMessage.z);
            }
            StaticLayout staticLayout = this.e3;
            int length = staticLayout == null ? -1 : staticLayout.getText().length();
            if (length > 0) {
                int length2 = sb3.length();
                int indexOf = sb3.indexOf("\n", length);
                if (indexOf < length2 && indexOf >= 0) {
                    length2 = indexOf;
                }
                int indexOf2 = sb3.indexOf("\t", length);
                if (indexOf2 < length2 && indexOf2 >= 0) {
                    length2 = indexOf2;
                }
                int indexOf3 = sb3.indexOf(" ", length);
                if (indexOf3 < length2 && indexOf3 >= 0) {
                    length2 = indexOf3;
                }
                sb2.append(sb3.substring(0, length2));
            } else {
                sb2.append((CharSequence) sb3);
            }
        }
        accessibilityEvent.setContentDescription(sb2);
        setContentDescription(sb2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0070, code lost:
    
        if (r0 != false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0088, code lost:
    
        if (r2 == 8) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x008e, code lost:
    
        if (r0.b(r7) != false) goto L54;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.i0 != 0.0f || this.P || this.F || !this.u0.a(this, motionEvent)) {
            r2 r2Var = this.d0;
            if (r2Var == null || r2Var.m()) {
                if (this.E1) {
                    boolean contains = this.H1.contains(motionEvent.getX(), motionEvent.getY());
                    int action = motionEvent.getAction();
                    dc dcVar = this.F1;
                    if (action == 0 || motionEvent.getAction() == 2) {
                        dcVar.c(contains);
                    } else {
                        if (dcVar.i && motionEvent.getAction() == 1) {
                            vh.m6 m6Var = this.K1;
                            if (m6Var != null) {
                                m6Var.a(this.f2);
                            }
                            dcVar.c(false);
                            return true;
                        }
                        if (dcVar.i && motionEvent.getAction() == 3) {
                            dcVar.c(false);
                            return true;
                        }
                    }
                }
                if (this.f0) {
                    jc jcVar = this.c0;
                    if (jcVar != null) {
                        if (this.h3 != null) {
                            int i10 = this.j1;
                            if (i10 != 0) {
                                if (i10 != 7) {
                                }
                            }
                        }
                    }
                }
            }
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.view.View
    public final boolean performAccessibilityAction(int i10, Bundle bundle) {
        ay ayVar;
        if (i10 != R.id.acc_action_chat_preview || (ayVar = this.D4) == null) {
            return super.performAccessibilityAction(i10, bundle);
        }
        ayVar.S4(this);
        return true;
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (getParent() != null && getParent().isLayoutRequested()) {
            getParent().requestLayout();
        }
        super.requestLayout();
    }

    public void setArchivedPullAnimation(mh0 mh0Var) {
        this.e2 = mh0Var;
    }

    public void setBottomClip(int i10) {
        this.v1 = i10;
    }

    public void setClipProgress(float f7) {
        this.t1 = f7;
        invalidate();
    }

    public void setCurrentDialogId(long j10) {
        this.H0 = j10;
    }

    public void setCustomMessage(String str) {
        if (TextUtils.equals(this.I0, str)) {
            return;
        }
        this.I0 = str;
        z();
        requestLayout();
    }

    public void setCustomMessageWithoutRebuild(String str) {
        this.I0 = str;
    }

    public void setDialog(q2 q2Var) {
        this.G0 = q2Var;
        this.l1 = 0;
        i0(0, true);
        D();
        B();
        A();
        F();
    }

    public void setDialogCellDelegate(r2 r2Var) {
        this.d0 = r2Var;
    }

    public void setDialogSelected(boolean z10) {
        if (this.q4 != z10) {
            invalidate();
        }
        this.q4 = z10;
    }

    public void setIsTransitionSupport(boolean z10) {
        this.j0 = z10;
    }

    public void setMoving(boolean z10) {
        this.r = z10;
    }

    public void setOpenBotButton(boolean z10) {
        if (this.E1 == z10) {
            return;
        }
        if (this.I1 == null) {
            this.I1 = new qz0(cd.L0(2131753020, null), 14.0f, org.telegram.messenger.i0.o());
        }
        this.E1 = z10;
        this.F1.c(false);
    }

    public void setPinForced(boolean z10) {
        this.B3 = z10;
        if (getMeasuredWidth() > 0 && getMeasuredHeight() > 0) {
            z();
        }
        invalidate();
    }

    public void setPreloader(zf.j jVar) {
        this.s4 = jVar;
    }

    public void setRightFragmentOpenedProgress(float f7) {
        if (this.i0 != f7) {
            this.i0 = f7;
            invalidate();
        }
    }

    public void setSliding(boolean z10) {
        this.x1 = z10;
    }

    public void setTitleOverride(String str) {
        this.L0 = str;
    }

    public void setTopClip(int i10) {
        this.u1 = i10;
    }

    @Override // android.view.View
    public void setTranslationX(float f7) {
        if (f7 == this.w1) {
            return;
        }
        this.w1 = f7;
        bi0 bi0Var = this.y1;
        if (bi0Var != null && f7 == 0.0f) {
            bi0Var.T(true, 0.0f);
            this.z1 = false;
            this.m1 = tz.q1;
            this.B1 = 0.0f;
            this.x1 = false;
        }
        float f10 = this.w1;
        if (f10 != 0.0f) {
            this.x1 = true;
        } else {
            this.C1 = 0.0f;
            this.B1 = 0.0f;
            this.A1 = false;
        }
        if (this.x1 && !this.x) {
            boolean z10 = this.A1;
            boolean z11 = Math.abs(f10) >= ((float) getMeasuredWidth()) * 0.45f;
            this.A1 = z11;
            if (z10 != z11 && this.m1 == tz.q1) {
                try {
                    performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
            }
        }
        invalidate();
    }

    public void setVisible(boolean z10) {
        if (this.z0 == z10) {
            return;
        }
        this.z0 = z10;
        if (z10) {
            invalidate();
        }
    }

    @Override // org.telegram.ui.ActionBar.k6
    public void updateColors() {
        try {
            if (isAttachedToWindow()) {
                if (this.H0 == 0 && this.G0 == null) {
                    return;
                }
                i0(0, true);
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    public final CharSequence y(CharSequence charSequence) {
        if (this.R1 <= 0) {
            return charSequence;
        }
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(charSequence);
        valueOf.insert(0, (CharSequence) " ");
        valueOf.setSpan(new t2(org.telegram.messenger.i0.L(((this.L4 + 2) * this.R1) + 3)), 0, 1, 33);
        return valueOf;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:(2:686|687)|(2:691|(11:693|694|695|696|697|698|699|(1:710)(1:703)|704|(2:705|(1:707)(1:708))|709))|719|694|695|696|697|698|699|(1:701)|710|704|(3:705|(0)(0)|707)|709) */
    /* JADX WARN: Can't wrap try/catch for region: R(15:686|687|(2:691|(11:693|694|695|696|697|698|699|(1:710)(1:703)|704|(2:705|(1:707)(1:708))|709))|719|694|695|696|697|698|699|(1:701)|710|704|(3:705|(0)(0)|707)|709) */
    /* JADX WARN: Code restructure failed: missing block: B:1057:0x062a, code lost:
    
        if (r2.post_messages == false) goto L320;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1165:0x15b6, code lost:
    
        if (r4 == null) goto L1115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1589:0x0b36, code lost:
    
        if (r14.id != r11) goto L583;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1593:0x0b44, code lost:
    
        if (org.telegram.messenger.w3.n0(r55.g2) != false) goto L587;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1595:0x0b4c, code lost:
    
        if (gg.e.k(r55.f1) == false) goto L567;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1735:0x0f79, code lost:
    
        if (org.telegram.messenger.jj.O2(r55.f1.k.rich_message.blocks.get(0)) != false) goto L797;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1907:0x0636, code lost:
    
        if (r2.kicked != false) goto L320;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1911:0x0640, code lost:
    
        if (r55.P == false) goto L320;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1922:0x0604, code lost:
    
        if (r3.reply_to_msg_id == 0) goto L320;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1928:0x0610, code lost:
    
        if (r55.S0 != 0) goto L320;
     */
    /* JADX WARN: Code restructure failed: missing block: B:416:0x244c, code lost:
    
        if (org.telegram.messenger.tz.p1 == false) goto L1810;
     */
    /* JADX WARN: Code restructure failed: missing block: B:712:0x2258, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:713:0x2259, code lost:
    
        r2 = r44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:714:0x2260, code lost:
    
        org.telegram.messenger.f8.f(r0);
        r44 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:716:0x225c, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:717:0x225d, code lost:
    
        r46 = r47;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x17c1  */
    /* JADX WARN: Removed duplicated region for block: B:1033:0x056c  */
    /* JADX WARN: Removed duplicated region for block: B:1050:0x061a  */
    /* JADX WARN: Removed duplicated region for block: B:1061:0x0651  */
    /* JADX WARN: Removed duplicated region for block: B:1088:0x12eb  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x17e2  */
    /* JADX WARN: Removed duplicated region for block: B:1113:0x1390  */
    /* JADX WARN: Removed duplicated region for block: B:1137:0x151f  */
    /* JADX WARN: Removed duplicated region for block: B:1141:0x1530  */
    /* JADX WARN: Removed duplicated region for block: B:1142:0x1539  */
    /* JADX WARN: Removed duplicated region for block: B:1152:0x156e  */
    /* JADX WARN: Removed duplicated region for block: B:1154:0x1579  */
    /* JADX WARN: Removed duplicated region for block: B:1291:0x14eb  */
    /* JADX WARN: Removed duplicated region for block: B:1298:0x1369  */
    /* JADX WARN: Removed duplicated region for block: B:1311:0x06e1  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x1960  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x1974  */
    /* JADX WARN: Removed duplicated region for block: B:1398:0x0971  */
    /* JADX WARN: Removed duplicated region for block: B:1403:0x11d4  */
    /* JADX WARN: Removed duplicated region for block: B:1406:0x11e2  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x1979 A[Catch: Exception -> 0x1984, TryCatch #13 {Exception -> 0x1984, blocks: (B:135:0x196b, B:138:0x1975, B:140:0x1979, B:141:0x198b, B:143:0x198f), top: B:134:0x196b }] */
    /* JADX WARN: Removed duplicated region for block: B:1410:0x0977  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x198f A[Catch: Exception -> 0x1984, TRY_LEAVE, TryCatch #13 {Exception -> 0x1984, blocks: (B:135:0x196b, B:138:0x1975, B:140:0x1979, B:141:0x198b, B:143:0x198f), top: B:134:0x196b }] */
    /* JADX WARN: Removed duplicated region for block: B:1550:0x1161  */
    /* JADX WARN: Removed duplicated region for block: B:1555:0x1172  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x19d3  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x19dc A[Catch: Exception -> 0x19b7, TryCatch #5 {Exception -> 0x19b7, blocks: (B:149:0x199e, B:152:0x19ad, B:153:0x19c0, B:156:0x19d6, B:158:0x19dc, B:159:0x19e8, B:161:0x19fb, B:163:0x1a01, B:166:0x1a12, B:168:0x1a16, B:169:0x1a50, B:171:0x1a54, B:173:0x1a5d, B:174:0x1a66, B:897:0x1a2f), top: B:148:0x199e }] */
    /* JADX WARN: Removed duplicated region for block: B:168:0x1a16 A[Catch: Exception -> 0x19b7, TryCatch #5 {Exception -> 0x19b7, blocks: (B:149:0x199e, B:152:0x19ad, B:153:0x19c0, B:156:0x19d6, B:158:0x19dc, B:159:0x19e8, B:161:0x19fb, B:163:0x1a01, B:166:0x1a12, B:168:0x1a16, B:169:0x1a50, B:171:0x1a54, B:173:0x1a5d, B:174:0x1a66, B:897:0x1a2f), top: B:148:0x199e }] */
    /* JADX WARN: Removed duplicated region for block: B:1722:0x0d9b  */
    /* JADX WARN: Removed duplicated region for block: B:1736:0x0d9f  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x1a93  */
    /* JADX WARN: Removed duplicated region for block: B:1904:0x0630  */
    /* JADX WARN: Removed duplicated region for block: B:1910:0x063e  */
    /* JADX WARN: Removed duplicated region for block: B:1919:0x05fe  */
    /* JADX WARN: Removed duplicated region for block: B:1925:0x060a  */
    /* JADX WARN: Removed duplicated region for block: B:1931:0x05a8  */
    /* JADX WARN: Removed duplicated region for block: B:1987:0x04f3  */
    /* JADX WARN: Removed duplicated region for block: B:1994:0x0512  */
    /* JADX WARN: Removed duplicated region for block: B:1999:0x050b  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x1cc4  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x1cf0  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x1cfd  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x1d29  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x1d53  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x2086  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x20bf  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x2149  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x219e  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x21b2  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x21ca  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x21cd  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x21dc  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x22d6  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x22f5 A[Catch: Exception -> 0x2344, TryCatch #12 {Exception -> 0x2344, blocks: (B:341:0x22ef, B:343:0x22f5, B:655:0x2341), top: B:340:0x22ef }] */
    /* JADX WARN: Removed duplicated region for block: B:349:0x235a A[Catch: Exception -> 0x2366, TryCatch #11 {Exception -> 0x2366, blocks: (B:347:0x2354, B:349:0x235a, B:351:0x235e, B:355:0x2392, B:360:0x23bc, B:365:0x2368, B:367:0x236e, B:371:0x238b), top: B:346:0x2354 }] */
    /* JADX WARN: Removed duplicated region for block: B:378:0x23c9 A[Catch: Exception -> 0x23f8, TryCatch #4 {Exception -> 0x23f8, blocks: (B:376:0x23c5, B:378:0x23c9, B:380:0x23db, B:382:0x23e1, B:384:0x23e5, B:386:0x23ed, B:388:0x23f3, B:391:0x241b, B:393:0x241e, B:394:0x23fe, B:396:0x2402, B:398:0x2406, B:400:0x240a, B:402:0x240e, B:409:0x2421, B:411:0x2425, B:413:0x2446, B:415:0x244a, B:417:0x246e, B:419:0x2474, B:421:0x2478, B:423:0x248b, B:426:0x24b6, B:428:0x24bc, B:430:0x24fd, B:432:0x2501, B:616:0x24c0, B:618:0x24c6, B:621:0x24cc, B:634:0x24a6, B:635:0x244e, B:638:0x2456, B:640:0x245e, B:643:0x2429, B:645:0x242f, B:647:0x2433, B:649:0x2438), top: B:375:0x23c5 }] */
    /* JADX WARN: Removed duplicated region for block: B:411:0x2425 A[Catch: Exception -> 0x23f8, TryCatch #4 {Exception -> 0x23f8, blocks: (B:376:0x23c5, B:378:0x23c9, B:380:0x23db, B:382:0x23e1, B:384:0x23e5, B:386:0x23ed, B:388:0x23f3, B:391:0x241b, B:393:0x241e, B:394:0x23fe, B:396:0x2402, B:398:0x2406, B:400:0x240a, B:402:0x240e, B:409:0x2421, B:411:0x2425, B:413:0x2446, B:415:0x244a, B:417:0x246e, B:419:0x2474, B:421:0x2478, B:423:0x248b, B:426:0x24b6, B:428:0x24bc, B:430:0x24fd, B:432:0x2501, B:616:0x24c0, B:618:0x24c6, B:621:0x24cc, B:634:0x24a6, B:635:0x244e, B:638:0x2456, B:640:0x245e, B:643:0x2429, B:645:0x242f, B:647:0x2433, B:649:0x2438), top: B:375:0x23c5 }] */
    /* JADX WARN: Removed duplicated region for block: B:428:0x24bc A[Catch: Exception -> 0x23f8, TryCatch #4 {Exception -> 0x23f8, blocks: (B:376:0x23c5, B:378:0x23c9, B:380:0x23db, B:382:0x23e1, B:384:0x23e5, B:386:0x23ed, B:388:0x23f3, B:391:0x241b, B:393:0x241e, B:394:0x23fe, B:396:0x2402, B:398:0x2406, B:400:0x240a, B:402:0x240e, B:409:0x2421, B:411:0x2425, B:413:0x2446, B:415:0x244a, B:417:0x246e, B:419:0x2474, B:421:0x2478, B:423:0x248b, B:426:0x24b6, B:428:0x24bc, B:430:0x24fd, B:432:0x2501, B:616:0x24c0, B:618:0x24c6, B:621:0x24cc, B:634:0x24a6, B:635:0x244e, B:638:0x2456, B:640:0x245e, B:643:0x2429, B:645:0x242f, B:647:0x2433, B:649:0x2438), top: B:375:0x23c5 }] */
    /* JADX WARN: Removed duplicated region for block: B:449:0x2586  */
    /* JADX WARN: Removed duplicated region for block: B:540:0x2866  */
    /* JADX WARN: Removed duplicated region for block: B:550:0x28a3  */
    /* JADX WARN: Removed duplicated region for block: B:551:0x28ab  */
    /* JADX WARN: Removed duplicated region for block: B:555:0x2773  */
    /* JADX WARN: Removed duplicated region for block: B:620:0x24ca A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:626:0x24e4  */
    /* JADX WARN: Removed duplicated region for block: B:630:0x24e7  */
    /* JADX WARN: Removed duplicated region for block: B:655:0x2341 A[Catch: Exception -> 0x2344, TRY_LEAVE, TryCatch #12 {Exception -> 0x2344, blocks: (B:341:0x22ef, B:343:0x22f5, B:655:0x2341), top: B:340:0x22ef }] */
    /* JADX WARN: Removed duplicated region for block: B:658:0x2205  */
    /* JADX WARN: Removed duplicated region for block: B:701:0x2271  */
    /* JADX WARN: Removed duplicated region for block: B:707:0x2281 A[LOOP:12: B:705:0x227c->B:707:0x2281, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:708:0x2293 A[EDGE_INSN: B:708:0x2293->B:709:0x2293 BREAK  A[LOOP:12: B:705:0x227c->B:707:0x2281], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:727:0x1d8a  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x16fd  */
    /* JADX WARN: Removed duplicated region for block: B:863:0x1cdb  */
    /* JADX WARN: Removed duplicated region for block: B:870:0x1c0f  */
    /* JADX WARN: Removed duplicated region for block: B:875:0x1c74  */
    /* JADX WARN: Removed duplicated region for block: B:892:0x1cbd A[EDGE_INSN: B:892:0x1cbd->B:893:0x1cbd BREAK  A[LOOP:13: B:873:0x1c6f->B:888:0x1ca7], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:894:0x1c31  */
    /* JADX WARN: Removed duplicated region for block: B:897:0x1a2f A[Catch: Exception -> 0x19b7, TryCatch #5 {Exception -> 0x19b7, blocks: (B:149:0x199e, B:152:0x19ad, B:153:0x19c0, B:156:0x19d6, B:158:0x19dc, B:159:0x19e8, B:161:0x19fb, B:163:0x1a01, B:166:0x1a12, B:168:0x1a16, B:169:0x1a50, B:171:0x1a54, B:173:0x1a5d, B:174:0x1a66, B:897:0x1a2f), top: B:148:0x199e }] */
    /* JADX WARN: Removed duplicated region for block: B:899:0x19d5  */
    /* JADX WARN: Removed duplicated region for block: B:909:0x19bc  */
    /* JADX WARN: Removed duplicated region for block: B:913:0x18dd  */
    /* JADX WARN: Removed duplicated region for block: B:919:0x1900  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x1763  */
    /* JADX WARN: Removed duplicated region for block: B:944:0x1813  */
    /* JADX WARN: Removed duplicated region for block: B:956:0x17a4  */
    /* JADX WARN: Removed duplicated region for block: B:958:0x178f  */
    /* JADX WARN: Removed duplicated region for block: B:961:0x1750  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x1794  */
    /* JADX WARN: Type inference failed for: r12v30, types: [android.text.SpannableStringBuilder] */
    /* JADX WARN: Type inference failed for: r3v188, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r3v192, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r55v0, types: [android.view.View, org.telegram.ui.Cells.v2] */
    /* JADX WARN: Type inference failed for: r8v67, types: [android.text.SpannableStringBuilder] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void z() {
        int i10;
        float f7;
        float f10;
        boolean z10;
        char c10;
        int i11;
        CharSequence charSequence;
        long j10;
        boolean z11;
        boolean z12;
        int i12;
        boolean z13;
        TLRPC.DraftMessage draftMessage;
        TLRPC.DraftMessage draftMessage2;
        TLRPC.DraftMessage draftMessage3;
        boolean z14;
        CharSequence charSequence2;
        boolean z15;
        CharSequence charSequence3;
        int i13;
        boolean z16;
        CharSequence charSequence4;
        String K0;
        CharSequence charSequence5;
        boolean z17;
        ArrayList<TLRPC.MessageEntity> arrayList;
        TL_iv.RichMessage richMessage;
        int i14;
        CharSequence charSequence6;
        CharSequence charSequence7;
        CharSequence charSequence8;
        CharSequence charSequence9;
        TLRPC.Chat L0;
        CharSequence charSequence10;
        CharSequence charSequence11;
        String str;
        boolean z18;
        jj jjVar;
        CharSequence charSequence12;
        CharSequence charSequence13;
        CharSequence M2;
        CharSequence charSequence14;
        char c11;
        String str2;
        boolean z19;
        SpannableStringBuilder spannableStringBuilder;
        CharSequence charSequence15;
        boolean V;
        String G;
        char c12;
        int i15;
        String G2;
        jj jjVar2;
        TLRPC.Message message;
        String str3;
        int i16;
        CharSequence l4;
        CharSequence charSequence16;
        CharSequence x12;
        l00 l00Var;
        TLRPC.User user;
        jj jjVar3;
        TLRPC.User user2;
        CharSequence charSequence17;
        CharSequence charSequence18;
        CharSequence N;
        String str4;
        String str5;
        CharSequence charSequence19;
        String str6;
        TLRPC.TL_messageReactions tL_messageReactions;
        ArrayList<TLRPC.MessagePeerReaction> arrayList2;
        CharSequence Z;
        CharSequence charSequence20;
        CharSequence charSequence21;
        CharSequence charSequence22;
        CharSequence charSequence23;
        String a12;
        jj jjVar4;
        boolean z20;
        String str7;
        vp r12;
        String str8;
        String str9;
        CharSequence U;
        CharSequence charSequence24;
        CharSequence charSequence25;
        boolean z21;
        int i17;
        CharSequence charSequence26;
        int i18;
        boolean z22;
        String str10;
        boolean z23;
        boolean z24;
        boolean z25;
        String str11;
        jj jjVar5;
        TLRPC.Message message2;
        TLRPC.TL_textWithEntities tL_textWithEntities;
        int i19;
        TLRPC.Chat chat;
        jj jjVar6;
        CharSequence charSequence27;
        float f11;
        float f12;
        int i20;
        int i21;
        boolean z26;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        int L;
        int L2;
        int L3;
        int i22;
        int i23;
        ImageReceiver[] imageReceiverArr;
        int i24;
        int i25;
        ji.f fVar;
        boolean z27;
        int i26;
        CharSequence charSequence28;
        int L4;
        int i27;
        ImageReceiver[] imageReceiverArr2;
        jj jjVar7;
        int i28;
        int lineCount;
        int lineCount2;
        int lineCount3;
        StaticLayout staticLayout;
        float primaryHorizontal;
        float primaryHorizontal2;
        int i29;
        int lineCount4;
        int lineCount5;
        int lineCount6;
        CharSequence charSequence29;
        CharSequence charSequence30;
        int L5;
        int i30;
        int i31;
        CharSequence x13;
        jj jjVar8;
        ji.f fVar2;
        float f18;
        int L6;
        int L7;
        ji.f fVar3;
        int L8;
        CharSequence x14;
        CharSequence charSequence31;
        SpannableStringBuilder P;
        if (this.j0) {
            return;
        }
        if (this.N0 && !this.I4.a() && this.J0 == 0 && this.K0 == 0 && this.h2 == null) {
            return;
        }
        if (!this.r2) {
            int i32 = tz.a;
        }
        org.telegram.ui.ActionBar.t6.B0[0].setTextSize(org.telegram.messenger.i0.L(17.0f));
        org.telegram.ui.ActionBar.t6.C0[0].setTextSize(org.telegram.messenger.i0.L(17.0f));
        org.telegram.ui.ActionBar.t6.F0[0].setTextSize(org.telegram.messenger.i0.L(16.0f));
        org.telegram.ui.ActionBar.t6.H0[0].setTextSize(org.telegram.messenger.i0.L(16.0f));
        boolean z28 = true;
        org.telegram.ui.ActionBar.t6.B0[1].setTextSize(org.telegram.messenger.i0.L(16.0f));
        org.telegram.ui.ActionBar.t6.C0[1].setTextSize(org.telegram.messenger.i0.L(16.0f));
        org.telegram.ui.ActionBar.t6.F0[1].setTextSize(org.telegram.messenger.i0.L(15.0f));
        org.telegram.ui.ActionBar.t6.H0[1].setTextSize(org.telegram.messenger.i0.L(15.0f));
        TextPaint textPaint = org.telegram.ui.ActionBar.t6.F0[1];
        int w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.i9, this.J4);
        textPaint.linkColor = w02;
        textPaint.setColor(w02);
        this.E0 = 1;
        this.L4 = 18;
        this.M0 = 0;
        String str12 = null;
        CharSequence C1 = (X() || !(this.N0 || this.P)) ? null : vp.r1(this.F0).C1(this.H0, getTopicId(), true);
        this.a0 = org.telegram.ui.ActionBar.t6.F0[this.E0];
        this.G2 = false;
        this.j4 = false;
        this.k4 = false;
        this.l4 = false;
        this.x0 = false;
        this.y0 = false;
        this.p4 = 0;
        this.z3 = false;
        this.R1 = 0;
        this.S1 = false;
        this.D2 = false;
        boolean z29 = (h20.B(this.f2) || this.u2) ? false : true;
        this.j2 = -1;
        if (!X()) {
            this.h3 = null;
        }
        setOpenBotButton(false);
        if ((this.r2 || tz.p1) && this.J0 == 0 && !X() && !T()) {
            this.W = false;
            i10 = 2;
        } else {
            this.W = true;
            i10 = 1;
        }
        jj jjVar9 = this.f1;
        if (jjVar9 != null) {
            jjVar9.e6(false);
        }
        jj jjVar10 = this.f1;
        CharSequence charSequence32 = jjVar10 != null ? jjVar10.v : null;
        if (charSequence32 instanceof Spannable) {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(charSequence32);
            f10 = 16.0f;
            f7 = 17.0f;
            for (f51 f51Var : (f51[]) spannableStringBuilder2.getSpans(0, spannableStringBuilder2.length(), f51.class)) {
                spannableStringBuilder2.removeSpan(f51Var);
            }
            for (e51 e51Var : (e51[]) spannableStringBuilder2.getSpans(0, spannableStringBuilder2.length(), e51.class)) {
                spannableStringBuilder2.removeSpan(e51Var);
            }
            charSequence32 = spannableStringBuilder2;
        } else {
            f7 = 17.0f;
            f10 = 16.0f;
        }
        this.i1 = charSequence32;
        if (this.F) {
            this.z3 = true;
            z10 = false;
            z29 = false;
        } else {
            z10 = true;
        }
        q2 q2Var = this.G0;
        if (q2Var != null) {
            if (q2Var.g == 2) {
                this.G2 = true;
                if (this.r2 || tz.p1) {
                    this.K2 = org.telegram.messenger.i0.L(12.5f);
                    if (cd.X) {
                        this.J2 = (getMeasuredWidth() - org.telegram.messenger.i0.L(this.I + 6)) - org.telegram.ui.ActionBar.t6.a1.getIntrinsicWidth();
                        this.x2 = org.telegram.messenger.i0.L(22.0f);
                    } else {
                        this.J2 = org.telegram.messenger.i0.L(this.I + 6);
                        this.x2 = org.telegram.ui.ActionBar.t6.a1.getIntrinsicWidth() + org.telegram.messenger.i0.L(this.I + 10);
                    }
                } else {
                    this.K2 = org.telegram.messenger.i0.L(16.5f);
                    if (cd.X) {
                        this.J2 = (getMeasuredWidth() - org.telegram.messenger.i0.L(this.I + 4)) - org.telegram.ui.ActionBar.t6.a1.getIntrinsicWidth();
                        this.x2 = org.telegram.messenger.i0.L(18.0f);
                    } else {
                        this.J2 = org.telegram.messenger.i0.L(this.I + 4);
                        this.x2 = org.telegram.ui.ActionBar.t6.a1.getIntrinsicWidth() + org.telegram.messenger.i0.L(this.I + 8);
                    }
                }
            } else {
                this.j4 = !this.n1 && q2Var.i;
                if (this.r2 || tz.p1) {
                    if (cd.X) {
                        this.x2 = org.telegram.messenger.i0.L(22.0f);
                    } else {
                        this.x2 = org.telegram.messenger.i0.L(this.I + 6);
                    }
                } else if (cd.X) {
                    this.x2 = org.telegram.messenger.i0.L(18.0f);
                } else {
                    this.x2 = org.telegram.messenger.i0.L(this.I + 4);
                }
            }
            q2 q2Var2 = this.G0;
            if (q2Var2.g == 1) {
                K0 = cd.K0(2131750512);
                q2 q2Var3 = this.G0;
                if (q2Var3.j) {
                    this.a0 = org.telegram.ui.ActionBar.t6.H0[this.E0];
                    P = P(i10, this.f1.v, null);
                    P.setSpan(new l00(org.telegram.ui.ActionBar.t6.o9, this.J4), 0, P.length(), 33);
                } else {
                    String str13 = q2Var3.b;
                    if (str13.length() > 150) {
                        str13 = str13.substring(0, zs.g2);
                    }
                    P = (this.r2 || tz.p1) ? P(i10, str13, K0) : P(i10, str13.replace('\n', ' '), K0);
                }
                charSequence31 = org.telegram.messenger.k6.l(P, org.telegram.ui.ActionBar.t6.F0[this.E0].getFontMetricsInt(), false);
                z21 = false;
            } else {
                charSequence31 = q2Var2.b;
                if (q2Var2.j) {
                    this.a0 = org.telegram.ui.ActionBar.t6.H0[this.E0];
                }
                z21 = true;
                K0 = null;
            }
            c10 = '\n';
            str8 = cd.a1(this.G0.h);
            int i33 = this.G0.d;
            if (i33 != 0) {
                this.G3 = true;
                str7 = String.format("%d", Integer.valueOf(i33));
            } else {
                this.G3 = false;
                str7 = null;
            }
            q2 q2Var4 = this.G0;
            int i34 = q2Var4.k;
            if (i34 == 2) {
                this.Q2 = true;
                this.R2 = true;
                this.S2 = false;
            } else if (i34 == 1) {
                this.Q2 = false;
                this.R2 = true;
                this.S2 = false;
            } else {
                this.S2 = false;
                this.Q2 = false;
                this.R2 = false;
            }
            this.t3 = false;
            charSequence24 = q2Var4.a;
            charSequence6 = charSequence31;
            charSequence26 = null;
            charSequence25 = "";
            i17 = -1;
        } else {
            c10 = '\n';
            if (this.r2 || tz.p1) {
                if (cd.X) {
                    this.x2 = org.telegram.messenger.i0.L(22.0f);
                } else {
                    this.x2 = org.telegram.messenger.i0.L(this.I + 6);
                }
            } else if (cd.X) {
                this.x2 = org.telegram.messenger.i0.L(18.0f);
            } else {
                this.x2 = org.telegram.messenger.i0.L(this.I + 4);
            }
            if (this.h2 != null) {
                if (this.J0 == 0) {
                    this.G2 = true;
                    if (this.r2 || tz.p1) {
                        this.K2 = org.telegram.messenger.i0.L(12.5f);
                        if (cd.X) {
                            this.J2 = (getMeasuredWidth() - org.telegram.messenger.i0.L(this.I + 6)) - org.telegram.ui.ActionBar.t6.a1.getIntrinsicWidth();
                            this.x2 = org.telegram.messenger.i0.L(22.0f);
                        } else {
                            this.J2 = org.telegram.messenger.i0.L(this.I + 6);
                            this.x2 = org.telegram.ui.ActionBar.t6.a1.getIntrinsicWidth() + org.telegram.messenger.i0.L(this.I + 10);
                        }
                    } else {
                        this.K2 = org.telegram.messenger.i0.L(16.5f);
                        if (cd.X) {
                            this.J2 = (getMeasuredWidth() - org.telegram.messenger.i0.L(this.I + 4)) - org.telegram.ui.ActionBar.t6.a1.getIntrinsicWidth();
                            this.x2 = org.telegram.messenger.i0.L(18.0f);
                        } else {
                            this.J2 = org.telegram.messenger.i0.L(this.I + 4);
                            this.x2 = org.telegram.ui.ActionBar.t6.a1.getIntrinsicWidth() + org.telegram.messenger.i0.L(this.I + 8);
                        }
                    }
                }
            } else if (this.J0 == 0 && !this.P) {
                TLRPC.Chat chat2 = this.g2;
                if (chat2 != null) {
                    long c13 = org.telegram.messenger.o5.c(chat2);
                    TLRPC.Chat chat3 = this.g2;
                    if (chat3.scam) {
                        this.p4 = 1;
                        org.telegram.ui.ActionBar.t6.g1.a();
                    } else if (chat3.fake) {
                        this.p4 = 2;
                        org.telegram.ui.ActionBar.t6.h1.a();
                    } else if (org.telegram.messenger.o5.f(chat3.emoji_status) != 0) {
                        this.l4 = true;
                        this.D2 = true;
                        org.telegram.ui.Components.d5 d5Var = this.n4;
                        d5Var.a = cd.X;
                        d5Var.j(org.telegram.messenger.o5.f(this.g2.emoji_status), false);
                        this.n4.m(org.telegram.messenger.o5.B(this.g2.emoji_status), false);
                    } else {
                        boolean z30 = this.n1;
                        this.j4 = !z30 && this.g2.verified;
                        this.k4 = (z30 || this.g2.bot_verification_icon == 0) ? false : true;
                    }
                    charSequence = charSequence32;
                    j10 = c13;
                    i11 = i10;
                } else {
                    TLRPC.User user3 = this.f2;
                    if (user3 != null) {
                        j10 = org.telegram.messenger.o5.c(user3);
                        TLRPC.User user4 = this.f2;
                        if (user4.scam) {
                            this.p4 = 1;
                            org.telegram.ui.ActionBar.t6.g1.a();
                        } else if (user4.fake) {
                            this.p4 = 2;
                            org.telegram.ui.ActionBar.t6.h1.a();
                        } else {
                            boolean z31 = this.n1;
                            this.j4 = !z31 && user4.verified;
                            if (z31 || h20.B(user4)) {
                                charSequence = charSequence32;
                            } else {
                                charSequence = charSequence32;
                                if (this.f2.bot_verification_icon != 0) {
                                    z11 = true;
                                    this.k4 = z11;
                                    vp.r1(this.F0);
                                    if (vp.A2(this.f2)) {
                                        long j11 = d20.i(this.F0).n;
                                        i11 = i10;
                                        long j12 = this.f2.id;
                                        if (j11 != j12 && j12 != 0) {
                                            z12 = true;
                                            this.l4 = z12;
                                            if (z12) {
                                                Long h = h20.h(this.f2);
                                                org.telegram.ui.Components.d5 d5Var2 = this.n4;
                                                d5Var2.a = cd.X;
                                                if (h != null) {
                                                    this.D2 = true;
                                                    d5Var2.j(h.longValue(), false);
                                                    this.n4.m(org.telegram.messenger.o5.B(this.f2.emoji_status), false);
                                                } else {
                                                    this.D2 = true;
                                                    d5Var2.g((Drawable) ea.f.d().f, false);
                                                    this.n4.m(false, false);
                                                }
                                            }
                                        }
                                    } else {
                                        i11 = i10;
                                    }
                                    z12 = false;
                                    this.l4 = z12;
                                    if (z12) {
                                    }
                                }
                            }
                            z11 = false;
                            this.k4 = z11;
                            vp.r1(this.F0);
                            if (vp.A2(this.f2)) {
                            }
                            z12 = false;
                            this.l4 = z12;
                            if (z12) {
                            }
                        }
                        charSequence = charSequence32;
                        vp.r1(this.F0);
                        if (vp.A2(this.f2)) {
                        }
                        z12 = false;
                        this.l4 = z12;
                        if (z12) {
                        }
                    } else {
                        i11 = i10;
                        charSequence = charSequence32;
                        j10 = 0;
                    }
                }
                if (j10 != 0 && this.k4) {
                    this.o4.j(j10, false);
                }
                i12 = this.R0;
                if (i12 == 0 && (jjVar6 = this.f1) != null) {
                    i12 = jjVar6.k.date;
                }
                if (!this.P) {
                    boolean z32 = ui.b0(this.F0).S(this.H0, (long) getTopicId()) != null;
                    this.k2 = z32;
                    TLRPC.DraftMessage R = !z32 ? ui.b0(this.F0).R(this.H0, getTopicId()) : null;
                    this.l2 = R;
                    if (R != null && TextUtils.isEmpty(R.message)) {
                        this.l2 = null;
                    }
                } else if (this.N0 || this.s0) {
                    boolean z33 = ui.b0(this.F0).S(this.H0, (long) getTopicId()) != null;
                    this.k2 = z33;
                    this.l2 = !z33 ? ui.b0(this.F0).R(this.H0, 0L) : null;
                } else {
                    this.k2 = false;
                    this.l2 = null;
                }
                z13 = this.k2;
                if (!z13 || this.l2 != null) {
                    if (!z13 && (draftMessage2 = this.l2) != null && TextUtils.isEmpty(draftMessage2.message)) {
                        draftMessage3 = this.l2;
                        if (draftMessage3.rich_message == null) {
                            TLRPC.InputReplyTo inputReplyTo = draftMessage3.reply_to;
                            if (inputReplyTo == null) {
                            }
                            this.l2 = null;
                            this.k2 = false;
                            if (X()) {
                                this.l2 = null;
                                this.k2 = false;
                                this.V = true;
                                j0();
                                K0 = org.telegram.messenger.w3.p0(this.g2) ? null : org.telegram.messenger.i0.U(getMessageNameString());
                                if (org.telegram.messenger.w3.p0(this.g2)) {
                                    i19 = i11;
                                    if (i19 == 1) {
                                        i19 = 2;
                                    }
                                    K0 = null;
                                    if (i19 == 3) {
                                        i19 = 4;
                                    }
                                } else {
                                    i19 = i11;
                                }
                                charSequence21 = Q();
                                jj jjVar11 = this.f1;
                                String S = this.f1 != null ? S(i19, K0, jjVar11 != null ? vp.r1(jjVar11.I1).E1(this.f1.k.restriction_reason) : null, true) : "";
                                CharSequence charSequence33 = S;
                                if (this.e0) {
                                    int length = S.length();
                                    charSequence33 = S;
                                    charSequence33 = S;
                                    if (length >= 0 && K0 != null) {
                                        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(S);
                                        valueOf.setSpan(new l00(org.telegram.ui.ActionBar.t6.X8, this.J4), 0, Math.min(valueOf.length(), K0.length() + 1), 0);
                                        charSequence33 = valueOf;
                                    }
                                }
                                this.a0 = org.telegram.ui.ActionBar.t6.F0[this.E0];
                                z16 = z10;
                                charSequence22 = charSequence33;
                            } else {
                                int i35 = i11;
                                if (TextUtils.isEmpty(this.I0)) {
                                    if (C1 != null) {
                                        this.i2 = C1;
                                        z14 = z29;
                                        charSequence2 = charSequence;
                                        int intValue = vp.r1(this.F0).D1(this.H0, getTopicId()).intValue();
                                        this.j2 = intValue;
                                        qv0 u02 = org.telegram.ui.ActionBar.t6.u0(intValue);
                                        int L9 = u02 != null ? org.telegram.messenger.i0.L(3.0f) + u02.getIntrinsicWidth() : 0;
                                        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
                                        CharSequence replace = TextUtils.replace(C1, new String[]{"..."}, new String[]{""});
                                        i13 = this.j2 == 5 ? replace.toString().indexOf("**oo**") : -1;
                                        if (i13 >= 0) {
                                            spannableStringBuilder3.append(replace).setSpan(new t2(org.telegram.ui.ActionBar.t6.u0(this.j2).getIntrinsicWidth()), i13, i13 + 6, 0);
                                        } else {
                                            spannableStringBuilder3.append((CharSequence) " ").append(replace).setSpan(new t2(L9), 0, 1, 0);
                                        }
                                        z15 = false;
                                        charSequence3 = spannableStringBuilder3;
                                    } else {
                                        z14 = z29;
                                        charSequence2 = charSequence;
                                        this.i2 = null;
                                        this.j2 = -1;
                                        z15 = true;
                                        charSequence3 = "";
                                        i13 = -1;
                                    }
                                    if (this.k2 || this.l2 != null) {
                                        z16 = z10;
                                        charSequence4 = " ";
                                        CharSequence charSequence34 = charSequence3;
                                        K0 = cd.K0(2131751343);
                                        TLRPC.DraftMessage draftMessage4 = this.l2;
                                        if (draftMessage4 == null || !TextUtils.isEmpty(draftMessage4.message) || this.l2.rich_message != null) {
                                            TLRPC.DraftMessage draftMessage5 = this.l2;
                                            if (draftMessage5 != null && (richMessage = draftMessage5.rich_message) != null) {
                                                charSequence5 = jj.e0(richMessage, zs.g2);
                                            } else if (this.k2) {
                                                charSequence5 = cd.K0(2131753982);
                                            } else if (draftMessage5 != null) {
                                                String str14 = draftMessage5.message;
                                                int length2 = str14.length();
                                                charSequence5 = str14;
                                                if (length2 > 150) {
                                                    charSequence5 = str14.subSequence(0, zs.g2);
                                                }
                                            } else {
                                                charSequence5 = "";
                                            }
                                            SpannableString spannableString = new SpannableString(charSequence5);
                                            TLRPC.DraftMessage draftMessage6 = this.l2;
                                            if (draftMessage6 != null) {
                                                ui.i(draftMessage6, spannableString);
                                                TLRPC.DraftMessage draftMessage7 = this.l2;
                                                if (draftMessage7 != null && (arrayList = draftMessage7.entities) != null) {
                                                    TextPaint textPaint2 = this.a0;
                                                    ui.a(textPaint2 == null ? null : textPaint2.getFontMetricsInt(), spannableString, arrayList);
                                                }
                                            } else if (this.k2) {
                                                spannableString.setSpan(new l00(org.telegram.ui.ActionBar.t6.p9, this.J4), 0, spannableString.length(), 33);
                                            }
                                            SpannableStringBuilder P2 = P(i35, org.telegram.messenger.i0.M2(spannableString), K0);
                                            if ((this.r2 || tz.p1) && !T()) {
                                                z17 = false;
                                            } else {
                                                z17 = false;
                                                P2.setSpan(new l00(org.telegram.ui.ActionBar.t6.j9, this.J4), 0, K0.length() + 1, 33);
                                            }
                                            charSequence9 = org.telegram.messenger.k6.l(P2, org.telegram.ui.ActionBar.t6.F0[this.E0].getFontMetricsInt(), z17);
                                        } else if ((this.r2 || tz.p1) && !T()) {
                                            i14 = i13;
                                            charSequence7 = charSequence34;
                                            charSequence6 = "";
                                            z29 = z14;
                                            charSequence8 = null;
                                            z28 = false;
                                            charSequence23 = charSequence7;
                                        } else {
                                            SpannableStringBuilder valueOf2 = SpannableStringBuilder.valueOf(K0);
                                            valueOf2.setSpan(new l00(org.telegram.ui.ActionBar.t6.j9, this.J4), 0, K0.length(), 33);
                                            charSequence9 = valueOf2;
                                        }
                                        charSequence6 = charSequence9;
                                        i14 = i13;
                                        charSequence7 = charSequence34;
                                        z29 = z14;
                                        charSequence8 = null;
                                        z28 = false;
                                        charSequence23 = charSequence7;
                                    } else {
                                        if (this.h1) {
                                            this.a0 = org.telegram.ui.ActionBar.t6.H0[this.E0];
                                            Z = cd.K0(2131749303);
                                        } else {
                                            jj jjVar12 = this.f1;
                                            if (jjVar12 != null) {
                                                String E1 = vp.r1(jjVar12.I1).E1(this.f1.k.restriction_reason);
                                                long Z0 = this.f1.Z0();
                                                if (org.telegram.messenger.o5.E(Z0)) {
                                                    vp.r1(this.F0).Z1(Long.valueOf(Z0));
                                                    L0 = null;
                                                } else {
                                                    L0 = vp.r1(this.F0).L0(Long.valueOf(-Z0));
                                                }
                                                this.L3 = true;
                                                if (this.j1 == 0) {
                                                    charSequence10 = " ";
                                                    if (this.H0 > 0 && this.f1.P3() && (tL_messageReactions = this.f1.k.reactions) != null && (arrayList2 = tL_messageReactions.recent_reactions) != null && !arrayList2.isEmpty() && this.V0 > 0) {
                                                        TLRPC.MessagePeerReaction messagePeerReaction = this.f1.k.reactions.recent_reactions.get(0);
                                                        if (messagePeerReaction.unread) {
                                                            long j13 = messagePeerReaction.peer_id.user_id;
                                                            if (j13 != 0 && j13 != d20.i(this.F0).n) {
                                                                sg.o0 d = sg.o0.d(messagePeerReaction.reaction);
                                                                this.a0 = org.telegram.ui.ActionBar.t6.H0[this.E0];
                                                                String str15 = d.f;
                                                                if (str15 != null) {
                                                                    z18 = true;
                                                                    str = cd.Z(2131746418, str15);
                                                                    charSequence11 = charSequence3;
                                                                    z16 = z10;
                                                                } else {
                                                                    String Z2 = cd.Z(2131746418, "**reaction**");
                                                                    int indexOf = Z2.indexOf("**reaction**");
                                                                    ?? spannableStringBuilder4 = new SpannableStringBuilder(Z2.replace("**reaction**", "d"));
                                                                    charSequence11 = charSequence3;
                                                                    z16 = z10;
                                                                    long j14 = d.g;
                                                                    TextPaint textPaint3 = this.a0;
                                                                    spannableStringBuilder4.setSpan(new org.telegram.ui.Components.o5(j14, textPaint3 == null ? null : textPaint3.getFontMetricsInt()), indexOf, indexOf + 1, 0);
                                                                    str = spannableStringBuilder4;
                                                                    z18 = true;
                                                                }
                                                                if (z18) {
                                                                    int i36 = this.j1;
                                                                    if (i36 == 2) {
                                                                        TLRPC.Chat chat4 = this.g2;
                                                                        if (chat4 != null) {
                                                                            if (org.telegram.messenger.w3.T(chat4)) {
                                                                                TLRPC.Chat chat5 = this.g2;
                                                                                if (!chat5.megagroup) {
                                                                                    int i37 = chat5.participants_count;
                                                                                    str5 = i37 != 0 ? cd.I(i37, "Subscribers") : !org.telegram.messenger.w3.t0(chat5) ? cd.K0(2131752329).toLowerCase() : cd.K0(2131752318).toLowerCase();
                                                                                }
                                                                            }
                                                                            TLRPC.Chat chat6 = this.g2;
                                                                            int i38 = chat6.participants_count;
                                                                            str5 = i38 != 0 ? cd.I(i38, "Members") : chat6.has_geo ? cd.K0(2131748657) : !org.telegram.messenger.w3.t0(chat6) ? cd.K0(2131748656).toLowerCase() : cd.K0(2131748653).toLowerCase();
                                                                        } else {
                                                                            str5 = "";
                                                                        }
                                                                        this.L3 = false;
                                                                        str4 = str5;
                                                                    } else if (i36 == 3 && h20.B(this.f2)) {
                                                                        ay ayVar = this.D4;
                                                                        str4 = cd.K0((ayVar == null || !ayVar.O0) ? 2131745913 : 2131745912);
                                                                    } else {
                                                                        boolean z34 = this.r2;
                                                                        if (!z34 && !tz.p1 && this.K0 != 0) {
                                                                            N = O();
                                                                        } else if (z34 || tz.p1 || this.J0 == 0) {
                                                                            jj jjVar13 = this.f1;
                                                                            if (!(jjVar13.k instanceof TLRPC.TL_messageService) || (jj.E4(jjVar13) && !(this.f1.k.action instanceof TLRPC.TL_messageActionTopicCreate))) {
                                                                                CharSequence charSequence35 = charSequence2;
                                                                                this.V = true;
                                                                                j0();
                                                                                String U2 = (this.r0 || (user2 = this.f2) == null || !user2.self || this.f1.P3()) ? null : org.telegram.messenger.i0.U(getMessageNameString());
                                                                                if ((!this.r0 || (user = this.f2) == null || user.self || (jjVar3 = this.f1) == null || !jjVar3.P3()) && U2 == null && ((jjVar = this.f1) == null || (message = jjVar.k) == null || message.guestchat_via_from == null)) {
                                                                                    TLRPC.Chat chat7 = this.g2;
                                                                                    if (chat7 != null) {
                                                                                        long j15 = chat7.id;
                                                                                        if (j15 > 0) {
                                                                                            if (L0 != null) {
                                                                                            }
                                                                                            if (org.telegram.messenger.w3.T(chat7)) {
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    TLRPC.User user5 = this.f2;
                                                                                    if (user5 == null || user5.id != 489000 || (jjVar2 = this.f1) == null || jjVar2.W0() == null) {
                                                                                        boolean isEmpty = TextUtils.isEmpty(E1);
                                                                                        CharSequence charSequence36 = E1;
                                                                                        if (isEmpty) {
                                                                                            if (jj.E4(this.f1)) {
                                                                                                jj jjVar14 = this.f1;
                                                                                                CharSequence charSequence37 = jjVar14.w;
                                                                                                if (charSequence37 == null || ((jjVar14.k.action instanceof TLRPC.TL_messageActionTopicCreate) && this.P)) {
                                                                                                    charSequence37 = jjVar14.v;
                                                                                                }
                                                                                                CharSequence charSequence38 = charSequence37;
                                                                                                charSequence36 = charSequence38;
                                                                                                if (jjVar14.g2[0] instanceof gg.a) {
                                                                                                    TLRPC.TL_forumTopic f19 = vp.r1(this.F0).R1().f(-this.f1.A0(), jj.b2(this.F0, this.f1.k, true));
                                                                                                    charSequence36 = charSequence38;
                                                                                                    if (f19 != null) {
                                                                                                        ((gg.a) this.f1.g2[0]).b(f19.icon_color);
                                                                                                        charSequence36 = charSequence38;
                                                                                                    }
                                                                                                }
                                                                                            } else {
                                                                                                TLRPC.MessageMedia messageMedia = this.f1.k.media;
                                                                                                if ((messageMedia instanceof TLRPC.TL_messageMediaPhoto) && (messageMedia.photo instanceof TLRPC.TL_photoEmpty) && messageMedia.ttl_seconds != 0) {
                                                                                                    charSequence36 = cd.K0(2131753947);
                                                                                                } else {
                                                                                                    if (messageMedia instanceof TLRPC.TL_messageMediaDocument) {
                                                                                                        TLRPC.Document document = messageMedia.document;
                                                                                                        if (((document instanceof TLRPC.TL_documentEmpty) || document == null) && messageMedia.ttl_seconds != 0) {
                                                                                                            charSequence36 = messageMedia.voice ? cd.K0(2131753929) : messageMedia.round ? cd.K0(2131753940) : cd.K0(2131753932);
                                                                                                        }
                                                                                                    }
                                                                                                    String str16 = "🎧 ";
                                                                                                    if (getCaptionMessage() == null || (this.f1.k.media instanceof TLRPC.TL_messageMediaPoll)) {
                                                                                                        jj jjVar15 = this.f1;
                                                                                                        TLRPC.Message message3 = jjVar15.k;
                                                                                                        TLRPC.MessageMedia messageMedia2 = message3.media;
                                                                                                        if (messageMedia2 instanceof TLRPC.TL_messageMediaPaidMedia) {
                                                                                                            int size = ((TLRPC.TL_messageMediaPaidMedia) messageMedia2).extended_media.size();
                                                                                                            if (this.S1) {
                                                                                                                i15 = 1;
                                                                                                                if (size > 1) {
                                                                                                                    c12 = 0;
                                                                                                                    G2 = cd.G(size, "Media", new Object[0]);
                                                                                                                } else {
                                                                                                                    c12 = 0;
                                                                                                                    G2 = cd.K0(2131753933);
                                                                                                                }
                                                                                                            } else {
                                                                                                                c12 = 0;
                                                                                                                i15 = 1;
                                                                                                                G2 = size > 1 ? cd.G(size, "Photos", new Object[0]) : cd.K0(2131753948);
                                                                                                            }
                                                                                                            Object[] objArr = new Object[i15];
                                                                                                            objArr[c12] = G2;
                                                                                                            SpannableStringBuilder S0 = rh.h8.S0(cd.Z(2131753949, objArr));
                                                                                                            this.a0 = org.telegram.ui.ActionBar.t6.H0[this.E0];
                                                                                                            charSequence36 = S0;
                                                                                                        } else if (this.R1 > 1) {
                                                                                                            if (this.S1) {
                                                                                                                ArrayList arrayList3 = this.g1;
                                                                                                                G = cd.G(arrayList3 == null ? 0 : arrayList3.size(), "Media", new Object[0]);
                                                                                                            } else {
                                                                                                                ArrayList arrayList4 = this.g1;
                                                                                                                G = cd.G(arrayList4 == null ? 0 : arrayList4.size(), "Photos", new Object[0]);
                                                                                                            }
                                                                                                            charSequence36 = G;
                                                                                                            this.a0 = org.telegram.ui.ActionBar.t6.H0[this.E0];
                                                                                                        } else {
                                                                                                            if (messageMedia2 instanceof TLRPC.TL_messageMediaGiveaway) {
                                                                                                                TLRPC.MessageFwdHeader messageFwdHeader = message3.fwd_from;
                                                                                                                if (messageFwdHeader != null) {
                                                                                                                    TLRPC.Peer peer = messageFwdHeader.from_id;
                                                                                                                    if (peer instanceof TLRPC.TL_peerChannel) {
                                                                                                                        V = org.telegram.messenger.w3.U(this.F0, peer.channel_id);
                                                                                                                        charSequence15 = cd.K0(!V ? 2131753482 : 2131753476);
                                                                                                                    }
                                                                                                                }
                                                                                                                V = org.telegram.messenger.w3.V(this.g2);
                                                                                                                charSequence15 = cd.K0(!V ? 2131753482 : 2131753476);
                                                                                                            } else if (messageMedia2 instanceof TLRPC.TL_messageMediaGiveawayResults) {
                                                                                                                charSequence15 = cd.K0(2131753392);
                                                                                                            } else if (messageMedia2 instanceof TLRPC.TL_messageMediaPoll) {
                                                                                                                TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) messageMedia2;
                                                                                                                TLRPC.TL_textWithEntities tL_textWithEntities2 = tL_messageMediaPoll.poll.question;
                                                                                                                if (tL_textWithEntities2 == null || tL_textWithEntities2.entities == null) {
                                                                                                                    z19 = false;
                                                                                                                    spannableStringBuilder = eh.a.a(R.drawable.dialog_media_poll_20, tL_textWithEntities2.text, false);
                                                                                                                } else {
                                                                                                                    SpannableString spannableString2 = new SpannableString(tL_messageMediaPoll.poll.question.text);
                                                                                                                    TLRPC.TL_textWithEntities tL_textWithEntities3 = tL_messageMediaPoll.poll.question;
                                                                                                                    ui.g(tL_textWithEntities3.entities, tL_textWithEntities3.text, spannableString2, -1);
                                                                                                                    ui.a(org.telegram.ui.ActionBar.t6.F0[this.E0].getFontMetricsInt(), spannableString2, tL_messageMediaPoll.poll.question.entities);
                                                                                                                    z19 = false;
                                                                                                                    spannableStringBuilder = eh.a.a(R.drawable.dialog_media_poll_20, spannableString2, false);
                                                                                                                }
                                                                                                                charSequence15 = spannableStringBuilder;
                                                                                                            } else if (messageMedia2 instanceof TLRPC.TL_messageMediaToDo) {
                                                                                                                TLRPC.TL_messageMediaToDo tL_messageMediaToDo = (TLRPC.TL_messageMediaToDo) messageMedia2;
                                                                                                                TLRPC.TL_textWithEntities tL_textWithEntities4 = tL_messageMediaToDo.todo.title;
                                                                                                                if (tL_textWithEntities4 == null || tL_textWithEntities4.entities == null) {
                                                                                                                    charSequence15 = eh.a.a(R.drawable.dialog_media_checklist_20, tL_textWithEntities4.text, false);
                                                                                                                } else {
                                                                                                                    SpannableString spannableString3 = new SpannableString(tL_messageMediaToDo.todo.title.text);
                                                                                                                    TLRPC.TL_textWithEntities tL_textWithEntities5 = tL_messageMediaToDo.todo.title;
                                                                                                                    ui.g(tL_textWithEntities5.entities, tL_textWithEntities5.text, spannableString3, -1);
                                                                                                                    ui.a(org.telegram.ui.ActionBar.t6.F0[this.E0].getFontMetricsInt(), spannableString3, tL_messageMediaToDo.todo.title.entities);
                                                                                                                    charSequence15 = eh.a.a(R.drawable.dialog_media_checklist_20, spannableString3, false);
                                                                                                                }
                                                                                                            } else if (messageMedia2 instanceof TLRPC.TL_messageMediaGame) {
                                                                                                                charSequence15 = eh.a.a(R.drawable.dialog_media_game_20, messageMedia2.game.title, false);
                                                                                                            } else if (messageMedia2 instanceof TLRPC.TL_messageMediaInvoice) {
                                                                                                                charSequence15 = messageMedia2.title;
                                                                                                            } else if (jjVar15.D == 14) {
                                                                                                                charSequence15 = c3.i0.n("🎧 ", jjVar15.x1(true), " - ", this.f1.z1(true));
                                                                                                            } else if (!(messageMedia2 instanceof TLRPC.TL_messageMediaStory) || !messageMedia2.via_mention) {
                                                                                                                if (!jjVar15.s2() || TextUtils.isEmpty(this.f1.k.message)) {
                                                                                                                    SpannableString spannableString4 = new SpannableString(charSequence35);
                                                                                                                    jj jjVar16 = this.f1;
                                                                                                                    if (jjVar16 != null) {
                                                                                                                        jjVar16.S5();
                                                                                                                    }
                                                                                                                    jj jjVar17 = this.f1;
                                                                                                                    Pattern pattern = ui.R1;
                                                                                                                    ui.g(jjVar17.k.entities, jjVar17.v, spannableString4, zs.n4);
                                                                                                                    jj jjVar18 = this.f1;
                                                                                                                    charSequence14 = spannableString4;
                                                                                                                    if (jjVar18 != null) {
                                                                                                                        TLRPC.Message message4 = jjVar18.k;
                                                                                                                        charSequence14 = spannableString4;
                                                                                                                        if (message4 != null) {
                                                                                                                            ArrayList<TLRPC.MessageEntity> arrayList5 = message4.entities;
                                                                                                                            TextPaint textPaint4 = this.a0;
                                                                                                                            ui.a(textPaint4 == null ? null : textPaint4.getFontMetricsInt(), spannableString4, arrayList5);
                                                                                                                            charSequence14 = spannableString4;
                                                                                                                        }
                                                                                                                    }
                                                                                                                } else {
                                                                                                                    CharSequence charSequence39 = this.f1.a2;
                                                                                                                    int measuredWidth = getMeasuredWidth() - org.telegram.messenger.i0.L(this.I + 23);
                                                                                                                    jj jjVar19 = this.f1;
                                                                                                                    charSequence14 = charSequence39;
                                                                                                                    if (jjVar19.Z1) {
                                                                                                                        charSequence14 = org.telegram.messenger.i0.Q(charSequence39, (String) jjVar19.Y1.get(0), measuredWidth, this.a0);
                                                                                                                    }
                                                                                                                }
                                                                                                                org.telegram.messenger.i0.x1(charSequence14, this.f1.Y1, this.J4);
                                                                                                                charSequence15 = charSequence14;
                                                                                                            } else if (jjVar15.N3()) {
                                                                                                                TLRPC.User Z1 = vp.r1(this.F0).Z1(Long.valueOf(this.f1.A0()));
                                                                                                                if (Z1 != null) {
                                                                                                                    str2 = h20.i(Z1);
                                                                                                                    int indexOf2 = str2.indexOf(32);
                                                                                                                    c11 = 0;
                                                                                                                    if (indexOf2 >= 0) {
                                                                                                                        str2 = str2.substring(0, indexOf2);
                                                                                                                    }
                                                                                                                } else {
                                                                                                                    c11 = 0;
                                                                                                                    str2 = "";
                                                                                                                }
                                                                                                                Object[] objArr2 = new Object[1];
                                                                                                                objArr2[c11] = str2;
                                                                                                                charSequence15 = cd.Z(2131744466, objArr2);
                                                                                                            } else {
                                                                                                                charSequence15 = cd.K0(2131744635);
                                                                                                            }
                                                                                                            CharSequence charSequence40 = charSequence15;
                                                                                                            jj jjVar20 = this.f1;
                                                                                                            if (jjVar20.k.media == null || jjVar20.F3()) {
                                                                                                                TL_iv.RichMessage richMessage2 = this.f1.k.rich_message;
                                                                                                                charSequence36 = charSequence40;
                                                                                                                if (richMessage2 != null) {
                                                                                                                    charSequence36 = charSequence40;
                                                                                                                    if (richMessage2.blocks.size() == 1) {
                                                                                                                        charSequence36 = charSequence40;
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                            this.a0 = org.telegram.ui.ActionBar.t6.H0[this.E0];
                                                                                                            charSequence36 = charSequence40;
                                                                                                        }
                                                                                                    } else {
                                                                                                        jj captionMessage = getCaptionMessage();
                                                                                                        if (!this.V) {
                                                                                                            str16 = "";
                                                                                                        } else if (captionMessage.H4()) {
                                                                                                            str16 = "📹 ";
                                                                                                        } else if (captionMessage.P4()) {
                                                                                                            str16 = "🎤 ";
                                                                                                        } else if (!captionMessage.I3()) {
                                                                                                            str16 = captionMessage.R3() ? "🖼 " : "📎 ";
                                                                                                        }
                                                                                                        if (!captionMessage.s2() || TextUtils.isEmpty(captionMessage.k.message)) {
                                                                                                            SpannableString spannableString5 = new SpannableString(captionMessage.z);
                                                                                                            if (captionMessage.k != null) {
                                                                                                                captionMessage.S5();
                                                                                                                ui.g(captionMessage.k.entities, captionMessage.z, spannableString5, zs.n4);
                                                                                                                ArrayList<TLRPC.MessageEntity> arrayList6 = captionMessage.k.entities;
                                                                                                                TextPaint textPaint5 = this.a0;
                                                                                                                ui.a(textPaint5 == null ? null : textPaint5.getFontMetricsInt(), spannableString5, arrayList6);
                                                                                                            }
                                                                                                            charSequence36 = new SpannableStringBuilder(str16).append((CharSequence) spannableString5);
                                                                                                        } else {
                                                                                                            CharSequence charSequence41 = captionMessage.a2;
                                                                                                            int measuredWidth2 = getMeasuredWidth() - org.telegram.messenger.i0.L(this.I + 47);
                                                                                                            if (this.W) {
                                                                                                                if (!TextUtils.isEmpty(null)) {
                                                                                                                    throw null;
                                                                                                                }
                                                                                                                measuredWidth2 = (int) (measuredWidth2 - this.a0.measureText(": "));
                                                                                                            }
                                                                                                            if (measuredWidth2 > 0 && captionMessage.Z1) {
                                                                                                                charSequence41 = org.telegram.messenger.i0.Q(charSequence41, (String) captionMessage.Y1.get(0), measuredWidth2, this.a0);
                                                                                                            }
                                                                                                            charSequence36 = new SpannableStringBuilder(str16).append(charSequence41);
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        CharSequence charSequence42 = charSequence36;
                                                                                        if (this.f1.f4()) {
                                                                                            SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder(charSequence36);
                                                                                            spannableStringBuilder5.insert(0, (CharSequence) "d ");
                                                                                            spannableStringBuilder5.setSpan(new dq(f0.c.c(getContext(), R.drawable.msg_mini_replystory).mutate()), 0, 1, 0);
                                                                                            charSequence42 = spannableStringBuilder5;
                                                                                        }
                                                                                        if (this.R1 > 0) {
                                                                                            if (!this.f1.s2() || TextUtils.isEmpty(this.f1.k.message)) {
                                                                                                int length3 = charSequence42.length();
                                                                                                CharSequence charSequence43 = charSequence42;
                                                                                                if (length3 > 150) {
                                                                                                    charSequence43 = charSequence42.subSequence(0, zs.g2);
                                                                                                }
                                                                                                M2 = org.telegram.messenger.i0.M2(charSequence43);
                                                                                            } else {
                                                                                                M2 = this.f1.a2;
                                                                                                int measuredWidth3 = getMeasuredWidth() - org.telegram.messenger.i0.L((((this.L4 + 2) * this.R1) + (this.I + 23)) + 3);
                                                                                                jj jjVar21 = this.f1;
                                                                                                if (jjVar21.Z1) {
                                                                                                    M2 = org.telegram.messenger.i0.Q(M2, (String) jjVar21.Y1.get(0), measuredWidth3, this.a0);
                                                                                                }
                                                                                            }
                                                                                            CharSequence spannableStringBuilder6 = !(M2 instanceof SpannableStringBuilder) ? new SpannableStringBuilder(M2) : M2;
                                                                                            SpannableStringBuilder spannableStringBuilder7 = (SpannableStringBuilder) spannableStringBuilder6;
                                                                                            charSequence4 = charSequence10;
                                                                                            spannableStringBuilder7.insert(0, charSequence4);
                                                                                            spannableStringBuilder7.setSpan(new t2(org.telegram.messenger.i0.L(((this.L4 + 2) * this.R1) + 3)), 0, 1, 33);
                                                                                            org.telegram.messenger.k6.l(spannableStringBuilder7, org.telegram.ui.ActionBar.t6.F0[this.E0].getFontMetricsInt(), false);
                                                                                            CharSequence charSequence44 = spannableStringBuilder6;
                                                                                            if (this.f1.s2()) {
                                                                                                CharSequence x15 = org.telegram.messenger.i0.x1(spannableStringBuilder7, this.f1.Y1, this.J4);
                                                                                                charSequence44 = spannableStringBuilder6;
                                                                                                if (x15 != null) {
                                                                                                    charSequence44 = x15;
                                                                                                }
                                                                                            }
                                                                                            z15 = false;
                                                                                            charSequence12 = charSequence44;
                                                                                        } else {
                                                                                            charSequence4 = charSequence10;
                                                                                            charSequence12 = charSequence42;
                                                                                        }
                                                                                        if (this.f1.j3() && this.f1.n5()) {
                                                                                            this.x0 = true;
                                                                                            SpannableStringBuilder spannableStringBuilder8 = new SpannableStringBuilder(charSequence12);
                                                                                            spannableStringBuilder8.insert(0, (CharSequence) "d ");
                                                                                            dq dqVar = new dq(f0.c.c(getContext(), R.drawable.mini_forwarded).mutate());
                                                                                            dqVar.x = 0.9f;
                                                                                            spannableStringBuilder8.setSpan(dqVar, 0, 1, 0);
                                                                                            charSequence13 = spannableStringBuilder8;
                                                                                        } else {
                                                                                            charSequence13 = charSequence12;
                                                                                        }
                                                                                        str3 = null;
                                                                                        charSequence16 = charSequence13;
                                                                                        if (this.K0 == 0) {
                                                                                            str6 = O();
                                                                                        } else if (this.J0 != 0) {
                                                                                            str6 = N();
                                                                                        } else {
                                                                                            z28 = z15;
                                                                                            charSequence6 = charSequence16;
                                                                                            i14 = i13;
                                                                                            charSequence19 = charSequence11;
                                                                                            K0 = str3;
                                                                                            z29 = z14;
                                                                                            charSequence20 = charSequence19;
                                                                                            charSequence8 = null;
                                                                                            charSequence23 = charSequence20;
                                                                                        }
                                                                                        z28 = z15;
                                                                                        charSequence6 = charSequence16;
                                                                                        K0 = str6;
                                                                                        i14 = i13;
                                                                                        charSequence19 = charSequence11;
                                                                                        z29 = z14;
                                                                                        charSequence20 = charSequence19;
                                                                                        charSequence8 = null;
                                                                                        charSequence23 = charSequence20;
                                                                                    }
                                                                                }
                                                                                charSequence4 = charSequence10;
                                                                                int i39 = -1;
                                                                                if (U2 == null) {
                                                                                    U2 = getMessageNameString();
                                                                                }
                                                                                String U3 = org.telegram.messenger.i0.U(U2);
                                                                                TLRPC.Chat chat8 = this.g2;
                                                                                if (chat8 != null && chat8.forum && !this.P && !this.O) {
                                                                                    CharSequence i40 = vp.r1(this.F0).R1().i(this.g2, this.f1, this.a0);
                                                                                    if (!TextUtils.isEmpty(i40)) {
                                                                                        SpannableStringBuilder spannableStringBuilder9 = new SpannableStringBuilder("-");
                                                                                        dq dqVar2 = new dq(f0.c.c(org.telegram.messenger.w0.b, R.drawable.msg_mini_forumarrow).mutate());
                                                                                        if (!this.r2 && !tz.p1) {
                                                                                            i39 = org.telegram.ui.ActionBar.t6.k9;
                                                                                        }
                                                                                        dqVar2.a(i39);
                                                                                        spannableStringBuilder9.setSpan(dqVar2, 0, 1, 0);
                                                                                        ?? spannableStringBuilder10 = new SpannableStringBuilder();
                                                                                        spannableStringBuilder10.append(U3).append((CharSequence) spannableStringBuilder9).append(i40);
                                                                                        str3 = spannableStringBuilder10;
                                                                                        SpannableStringBuilder S2 = S(i35, str3, E1, false);
                                                                                        if (!this.O || ((this.r2 || tz.p1) && (this.J0 == 0 || S2.length() <= 0))) {
                                                                                            i16 = 0;
                                                                                        } else {
                                                                                            try {
                                                                                                l00Var = new l00(org.telegram.ui.ActionBar.t6.k9, this.J4);
                                                                                                i16 = str3.length() + 1;
                                                                                            } catch (Exception e) {
                                                                                                e = e;
                                                                                                i16 = 0;
                                                                                            }
                                                                                            try {
                                                                                                S2.setSpan(l00Var, 0, i16, 33);
                                                                                            } catch (Exception e7) {
                                                                                                e = e7;
                                                                                                org.telegram.messenger.f8.f(e);
                                                                                                l4 = org.telegram.messenger.k6.l(S2, org.telegram.ui.ActionBar.t6.F0[this.E0].getFontMetricsInt(), false);
                                                                                                if (this.f1.s2()) {
                                                                                                }
                                                                                                if (this.R1 > 0) {
                                                                                                }
                                                                                                charSequence16 = l4;
                                                                                                z15 = false;
                                                                                                if (this.K0 == 0) {
                                                                                                }
                                                                                                z28 = z15;
                                                                                                charSequence6 = charSequence16;
                                                                                                K0 = str6;
                                                                                                i14 = i13;
                                                                                                charSequence19 = charSequence11;
                                                                                                z29 = z14;
                                                                                                charSequence20 = charSequence19;
                                                                                                charSequence8 = null;
                                                                                                charSequence23 = charSequence20;
                                                                                                if (!this.x0) {
                                                                                                }
                                                                                                if (TextUtils.isEmpty(this.I0)) {
                                                                                                }
                                                                                                a12 = "";
                                                                                                jjVar4 = this.f1;
                                                                                                if (jjVar4 != null) {
                                                                                                }
                                                                                                this.Q2 = false;
                                                                                                this.R2 = false;
                                                                                                this.S2 = jjVar4 == null && jjVar4.o4() && this.H0 == d20.i(this.F0).e();
                                                                                                z20 = false;
                                                                                                this.G3 = false;
                                                                                                this.b4 = false;
                                                                                                this.c4 = false;
                                                                                                this.d4 = false;
                                                                                                this.t3 = false;
                                                                                                str7 = null;
                                                                                                str12 = null;
                                                                                                this.P2 = z20;
                                                                                                r12 = vp.r1(this.F0);
                                                                                                if (this.j1 == 0) {
                                                                                                }
                                                                                                str8 = a12;
                                                                                                str9 = this.L0;
                                                                                                if (str9 == null) {
                                                                                                }
                                                                                                z21 = z28;
                                                                                                i17 = i14;
                                                                                                z10 = z16;
                                                                                                charSequence26 = charSequence8;
                                                                                                charSequence27 = K0;
                                                                                                if (z10) {
                                                                                                }
                                                                                                if (L()) {
                                                                                                }
                                                                                                if (cd.X) {
                                                                                                }
                                                                                                if (this.G2) {
                                                                                                }
                                                                                                if (!this.S2) {
                                                                                                }
                                                                                                if (this.Z0) {
                                                                                                }
                                                                                                if (!this.l4) {
                                                                                                }
                                                                                                if (!z26) {
                                                                                                }
                                                                                                if (this.k4) {
                                                                                                }
                                                                                                L8 = this.y2 - org.telegram.messenger.i0.L(12.0f);
                                                                                                if (L8 < 0) {
                                                                                                }
                                                                                                if (charSequence24 instanceof String) {
                                                                                                }
                                                                                                if (this.D2) {
                                                                                                }
                                                                                                float f20 = L8;
                                                                                                this.R = org.telegram.ui.ActionBar.t6.B0[this.E0].measureText(charSequence24.toString()) <= f20;
                                                                                                if (!this.Q) {
                                                                                                }
                                                                                                CharSequence l10 = org.telegram.messenger.k6.l(charSequence24, org.telegram.ui.ActionBar.t6.B0[this.E0].getFontMetricsInt(), false);
                                                                                                jj jjVar22 = this.f1;
                                                                                                if (jjVar22 == null) {
                                                                                                }
                                                                                                if (this.Q) {
                                                                                                }
                                                                                                this.B2 = (this.D2 || !this.z2.isRtlCharAt(0)) ? f12 : -org.telegram.messenger.i0.L(f13);
                                                                                                this.C2 = this.z2.isRtlCharAt(0);
                                                                                                this.p3 = org.telegram.ui.Components.o5.update(0, (View) this, this.p3, this.z2);
                                                                                                if (this.r2) {
                                                                                                }
                                                                                                f15 = 39.0f;
                                                                                                f16 = f11;
                                                                                                f17 = 13.0f;
                                                                                                L = org.telegram.messenger.i0.L(11.0f);
                                                                                                this.q3 = org.telegram.messenger.i0.L(32.0f);
                                                                                                this.M2 = org.telegram.messenger.i0.L(13.0f);
                                                                                                this.u3 = org.telegram.messenger.i0.L(42.33f);
                                                                                                this.C3 = org.telegram.messenger.i0.L(43.0f);
                                                                                                this.M3 = org.telegram.messenger.i0.L(42.33f);
                                                                                                this.W2 = org.telegram.messenger.i0.L(13.0f);
                                                                                                int measuredWidth4 = getMeasuredWidth() - org.telegram.messenger.i0.L(this.I + 21);
                                                                                                if (cd.X) {
                                                                                                }
                                                                                                i22 = L3;
                                                                                                this.u0.F.set(L2, L, org.telegram.messenger.i0.L(56.0f) + L2, org.telegram.messenger.i0.L(56.0f) + L);
                                                                                                i23 = 0;
                                                                                                while (true) {
                                                                                                    imageReceiverArr = this.V1;
                                                                                                    if (i23 < imageReceiverArr.length) {
                                                                                                    }
                                                                                                    imageReceiverArr[i23].y0(((this.L4 + 2) * i23) + i22, ((org.telegram.messenger.i0.L(31.0f) + L) + (this.Q ? org.telegram.messenger.i0.L(20.0f) : 0)) - ((this.r2 || tz.p1 || (fVar = this.t0) == null || fVar.l()) ? 0 : org.telegram.messenger.i0.L(9.0f)), org.telegram.messenger.i0.L(18.0f), org.telegram.messenger.i0.L(18.0f));
                                                                                                    i23++;
                                                                                                    L = L;
                                                                                                }
                                                                                                i24 = L;
                                                                                                i25 = measuredWidth4;
                                                                                                if (cd.X) {
                                                                                                }
                                                                                                if (this.Q) {
                                                                                                }
                                                                                                if (!this.r2) {
                                                                                                }
                                                                                                this.M2 -= org.telegram.messenger.i0.L(6.0f);
                                                                                                this.W2 -= org.telegram.messenger.i0.L(6.0f);
                                                                                                if (getIsPinned()) {
                                                                                                }
                                                                                                if (this.t3) {
                                                                                                }
                                                                                                if (this.t3) {
                                                                                                }
                                                                                                this.H3 = z27;
                                                                                                if (z27) {
                                                                                                }
                                                                                                if (z21) {
                                                                                                }
                                                                                                int max = Math.max(org.telegram.messenger.i0.L(12.0f), i25);
                                                                                                this.g3 = org.telegram.messenger.i0.L((!this.r2 || tz.p1) ? 58.0f : 62.0f);
                                                                                                if (!this.r2) {
                                                                                                }
                                                                                                this.g3 -= org.telegram.messenger.i0.L(!X() ? 10.0f : 12.0f);
                                                                                                if (!X()) {
                                                                                                }
                                                                                                if (this.Q) {
                                                                                                }
                                                                                                this.n3 = org.telegram.ui.Components.o5.update(0, (View) this, this.n3, this.s3);
                                                                                                if (TextUtils.isEmpty(charSequence26)) {
                                                                                                }
                                                                                                this.o3 = org.telegram.ui.Components.o5.update(0, (View) this, this.o3, this.h3);
                                                                                                if (!TextUtils.isEmpty(charSequence25)) {
                                                                                                }
                                                                                                if (charSequence6 instanceof Spannable) {
                                                                                                }
                                                                                                if (this.r2) {
                                                                                                }
                                                                                                this.a0 = org.telegram.ui.ActionBar.t6.F0[this.E0];
                                                                                                charSequence29 = charSequence27;
                                                                                                charSequence30 = null;
                                                                                                Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
                                                                                                if (this.r2) {
                                                                                                }
                                                                                                if (this.R1 > 0) {
                                                                                                }
                                                                                                try {
                                                                                                    TextPaint textPaint6 = this.a0;
                                                                                                    float L10 = org.telegram.messenger.i0.L(1.0f);
                                                                                                    TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                                                                                                    this.e3 = ov0.b(charSequence29, textPaint6, L5, L10, L5, charSequence30 != null ? 1 : 2);
                                                                                                    i28 = L5;
                                                                                                    this.i3.addAll(this.j3);
                                                                                                    this.j3.clear();
                                                                                                    nh.i.b(this, this.e3, -2, -2, this.i3, this.j3);
                                                                                                } catch (Exception e10) {
                                                                                                    e = e10;
                                                                                                    i28 = L5;
                                                                                                    this.e3 = null;
                                                                                                    org.telegram.messenger.f8.f(e);
                                                                                                    int i41 = i28;
                                                                                                    this.m3 = org.telegram.ui.Components.o5.update(0, (View) this, this.m3, this.e3);
                                                                                                    if (cd.X) {
                                                                                                    }
                                                                                                    staticLayout = this.f3;
                                                                                                    if (staticLayout != null) {
                                                                                                    }
                                                                                                    l0();
                                                                                                }
                                                                                                int i412 = i28;
                                                                                                this.m3 = org.telegram.ui.Components.o5.update(0, (View) this, this.m3, this.e3);
                                                                                                if (cd.X) {
                                                                                                }
                                                                                                staticLayout = this.f3;
                                                                                                if (staticLayout != null) {
                                                                                                }
                                                                                                l0();
                                                                                            }
                                                                                        }
                                                                                        l4 = org.telegram.messenger.k6.l(S2, org.telegram.ui.ActionBar.t6.F0[this.E0].getFontMetricsInt(), false);
                                                                                        if (this.f1.s2() && (x12 = org.telegram.messenger.i0.x1(l4, this.f1.Y1, this.J4)) != null) {
                                                                                            l4 = x12;
                                                                                        }
                                                                                        if (this.R1 > 0) {
                                                                                            if (!(l4 instanceof SpannableStringBuilder)) {
                                                                                                l4 = new SpannableStringBuilder(l4);
                                                                                            }
                                                                                            SpannableStringBuilder spannableStringBuilder11 = (SpannableStringBuilder) l4;
                                                                                            if (i16 >= spannableStringBuilder11.length()) {
                                                                                                spannableStringBuilder11.append(charSequence4);
                                                                                                spannableStringBuilder11.setSpan(new t2(org.telegram.messenger.i0.L(((this.L4 + 2) * this.R1) + 3)), spannableStringBuilder11.length() - 1, spannableStringBuilder11.length(), 33);
                                                                                            } else {
                                                                                                spannableStringBuilder11.insert(i16, charSequence4);
                                                                                                spannableStringBuilder11.setSpan(new t2(org.telegram.messenger.i0.L(((this.L4 + 2) * this.R1) + 3)), i16, i16 + 1, 33);
                                                                                            }
                                                                                        }
                                                                                        charSequence16 = l4;
                                                                                        z15 = false;
                                                                                        if (this.K0 == 0) {
                                                                                        }
                                                                                        z28 = z15;
                                                                                        charSequence6 = charSequence16;
                                                                                        K0 = str6;
                                                                                        i14 = i13;
                                                                                        charSequence19 = charSequence11;
                                                                                        z29 = z14;
                                                                                        charSequence20 = charSequence19;
                                                                                        charSequence8 = null;
                                                                                        charSequence23 = charSequence20;
                                                                                    }
                                                                                }
                                                                                str3 = U3;
                                                                                SpannableStringBuilder S22 = S(i35, str3, E1, false);
                                                                                if (this.O) {
                                                                                }
                                                                                i16 = 0;
                                                                                l4 = org.telegram.messenger.k6.l(S22, org.telegram.ui.ActionBar.t6.F0[this.E0].getFontMetricsInt(), false);
                                                                                if (this.f1.s2()) {
                                                                                    l4 = x12;
                                                                                }
                                                                                if (this.R1 > 0) {
                                                                                }
                                                                                charSequence16 = l4;
                                                                                z15 = false;
                                                                                if (this.K0 == 0) {
                                                                                }
                                                                                z28 = z15;
                                                                                charSequence6 = charSequence16;
                                                                                K0 = str6;
                                                                                i14 = i13;
                                                                                charSequence19 = charSequence11;
                                                                                z29 = z14;
                                                                                charSequence20 = charSequence19;
                                                                                charSequence8 = null;
                                                                                charSequence23 = charSequence20;
                                                                            } else {
                                                                                jj jjVar23 = this.f1;
                                                                                TLRPC.MessageAction messageAction = jjVar23.k.action;
                                                                                if (messageAction instanceof TLRPC.TL_messageActionPhoneCall) {
                                                                                    TLRPC.TL_messageActionPhoneCall tL_messageActionPhoneCall = (TLRPC.TL_messageActionPhoneCall) messageAction;
                                                                                    charSequence17 = jjVar23.P3() ? eh.a.a(tL_messageActionPhoneCall.video ? R.drawable.dialog_media_outgoing_video_call_20 : R.drawable.dialog_media_outgoing_call_20, charSequence2, false) : eh.a.a(tL_messageActionPhoneCall.video ? R.drawable.dialog_media_incoming_video_call_20 : R.drawable.dialog_media_incoming_call_20, charSequence2, false);
                                                                                } else {
                                                                                    CharSequence charSequence45 = charSequence2;
                                                                                    if (org.telegram.messenger.w3.V(this.g2) && (this.f1.k.action instanceof TLRPC.TL_messageActionChannelMigrateFrom)) {
                                                                                        charSequence17 = "";
                                                                                        z14 = false;
                                                                                    } else {
                                                                                        CharSequence charSequence46 = this.f1.w;
                                                                                        charSequence17 = charSequence46 != null ? charSequence46 : charSequence45;
                                                                                    }
                                                                                }
                                                                                this.a0 = org.telegram.ui.ActionBar.t6.H0[this.E0];
                                                                                if (this.f1.D == 21) {
                                                                                    j0();
                                                                                    charSequence18 = y(charSequence17);
                                                                                } else {
                                                                                    charSequence18 = charSequence17;
                                                                                }
                                                                            }
                                                                        } else {
                                                                            N = N();
                                                                        }
                                                                        charSequence13 = N;
                                                                        charSequence4 = charSequence10;
                                                                        z15 = false;
                                                                        str3 = null;
                                                                        charSequence16 = charSequence13;
                                                                        if (this.K0 == 0) {
                                                                        }
                                                                        z28 = z15;
                                                                        charSequence6 = charSequence16;
                                                                        K0 = str6;
                                                                        i14 = i13;
                                                                        charSequence19 = charSequence11;
                                                                        z29 = z14;
                                                                        charSequence20 = charSequence19;
                                                                        charSequence8 = null;
                                                                        charSequence23 = charSequence20;
                                                                    }
                                                                    charSequence4 = charSequence10;
                                                                    str3 = null;
                                                                    z14 = false;
                                                                    z16 = false;
                                                                    charSequence16 = str4;
                                                                    if (this.K0 == 0) {
                                                                    }
                                                                    z28 = z15;
                                                                    charSequence6 = charSequence16;
                                                                    K0 = str6;
                                                                    i14 = i13;
                                                                    charSequence19 = charSequence11;
                                                                    z29 = z14;
                                                                    charSequence20 = charSequence19;
                                                                    charSequence8 = null;
                                                                    charSequence23 = charSequence20;
                                                                } else {
                                                                    charSequence18 = str;
                                                                }
                                                                charSequence4 = charSequence10;
                                                                charSequence13 = charSequence18;
                                                                str3 = null;
                                                                charSequence16 = charSequence13;
                                                                if (this.K0 == 0) {
                                                                }
                                                                z28 = z15;
                                                                charSequence6 = charSequence16;
                                                                K0 = str6;
                                                                i14 = i13;
                                                                charSequence19 = charSequence11;
                                                                z29 = z14;
                                                                charSequence20 = charSequence19;
                                                                charSequence8 = null;
                                                                charSequence23 = charSequence20;
                                                            }
                                                        }
                                                    }
                                                    charSequence11 = charSequence3;
                                                    z16 = z10;
                                                } else {
                                                    z16 = z10;
                                                    charSequence10 = " ";
                                                    charSequence11 = charSequence3;
                                                }
                                                str = "";
                                                z18 = false;
                                                if (z18) {
                                                }
                                                charSequence4 = charSequence10;
                                                charSequence13 = charSequence18;
                                                str3 = null;
                                                charSequence16 = charSequence13;
                                                if (this.K0 == 0) {
                                                }
                                                z28 = z15;
                                                charSequence6 = charSequence16;
                                                K0 = str6;
                                                i14 = i13;
                                                charSequence19 = charSequence11;
                                                z29 = z14;
                                                charSequence20 = charSequence19;
                                                charSequence8 = null;
                                                charSequence23 = charSequence20;
                                            } else if (this.K0 != 0) {
                                                Z = O();
                                            } else if (this.J0 != 0) {
                                                Z = N();
                                            } else {
                                                TLRPC.EncryptedChat encryptedChat = this.h2;
                                                if (encryptedChat != null) {
                                                    this.a0 = org.telegram.ui.ActionBar.t6.H0[this.E0];
                                                    if (encryptedChat instanceof TLRPC.TL_encryptedChatRequested) {
                                                        Z = cd.K0(2131751130);
                                                    } else if (encryptedChat instanceof TLRPC.TL_encryptedChatWaiting) {
                                                        Z = cd.Z(2131753757, h20.i(this.f2));
                                                    } else if (encryptedChat instanceof TLRPC.TL_encryptedChatDiscarded) {
                                                        Z = cd.K0(2131751129);
                                                    } else if (encryptedChat instanceof TLRPC.TL_encryptedChat) {
                                                        Z = encryptedChat.admin_id == d20.i(this.F0).e() ? cd.Z(2131751141, h20.i(this.f2)) : cd.K0(2131751142);
                                                    }
                                                } else if (this.j1 == 3 && h20.B(this.f2)) {
                                                    ay ayVar2 = this.D4;
                                                    int i42 = (ayVar2 == null || !ayVar2.O0) ? 2131745913 : 2131745912;
                                                    z28 = z15;
                                                    z16 = false;
                                                    i14 = i13;
                                                    charSequence4 = " ";
                                                    K0 = null;
                                                    charSequence8 = null;
                                                    z29 = false;
                                                    charSequence6 = cd.K0(i42);
                                                    charSequence23 = charSequence3;
                                                }
                                                z28 = z15;
                                                z16 = z10;
                                                i14 = i13;
                                                charSequence4 = " ";
                                                charSequence6 = "";
                                                z29 = z14;
                                                K0 = null;
                                                charSequence20 = charSequence3;
                                                charSequence8 = null;
                                                charSequence23 = charSequence20;
                                            }
                                        }
                                        z28 = z15;
                                        z16 = z10;
                                        i14 = i13;
                                        charSequence6 = Z;
                                        charSequence4 = " ";
                                        z29 = z14;
                                        K0 = null;
                                        charSequence20 = charSequence3;
                                        charSequence8 = null;
                                        charSequence23 = charSequence20;
                                    }
                                    if (!this.x0 && !W() && !X() && !V() && this.l2 == null && (jjVar5 = this.f1) != null && (message2 = jjVar5.k) != null && (message2.action instanceof TLRPC.TL_messageActionStarGift)) {
                                        this.y0 = true;
                                        SpannableStringBuilder spannableStringBuilder12 = new SpannableStringBuilder(charSequence6);
                                        spannableStringBuilder12.insert(0, (CharSequence) "d ");
                                        dq dqVar3 = new dq(f0.c.c(getContext(), R.drawable.mini_gift).mutate());
                                        dqVar3.H = 1.25f;
                                        dqVar3.I = 1.25f;
                                        dqVar3.G = 0.9f;
                                        dqVar3.x = 0.9f;
                                        spannableStringBuilder12.setSpan(dqVar3, 0, 1, 0);
                                        tL_textWithEntities = ((TLRPC.TL_messageActionStarGift) this.f1.k.action).message;
                                        if (tL_textWithEntities != null && !TextUtils.isEmpty(tL_textWithEntities.text)) {
                                            this.a0 = org.telegram.ui.ActionBar.t6.F0[this.E0];
                                        }
                                        charSequence6 = spannableStringBuilder12;
                                    }
                                    if (TextUtils.isEmpty(this.I0)) {
                                        if (this.l2 != null) {
                                            a12 = cd.a1(r5.date);
                                        } else {
                                            int i43 = this.R0;
                                            if (i43 != 0) {
                                                a12 = cd.a1(i43);
                                            } else {
                                                if (this.f1 != null) {
                                                    a12 = cd.a1(r5.k.date);
                                                }
                                            }
                                        }
                                        jjVar4 = this.f1;
                                        if (jjVar4 != null || this.r0) {
                                            this.Q2 = false;
                                            this.R2 = false;
                                            this.S2 = jjVar4 == null && jjVar4.o4() && this.H0 == d20.i(this.F0).e();
                                            z20 = false;
                                            this.G3 = false;
                                            this.b4 = false;
                                            this.c4 = false;
                                            this.d4 = false;
                                            this.t3 = false;
                                            str7 = null;
                                            str12 = null;
                                        } else {
                                            if (this.J0 != 0) {
                                                int i44 = this.S0;
                                                int i45 = this.U0;
                                                int i46 = i44 + i45;
                                                if (i46 <= 0) {
                                                    z25 = false;
                                                    this.G3 = false;
                                                    this.b4 = false;
                                                    str7 = null;
                                                } else if (i44 > i45) {
                                                    this.G3 = true;
                                                    z25 = false;
                                                    this.b4 = false;
                                                    str7 = String.format("%d", Integer.valueOf(i46));
                                                } else {
                                                    z25 = false;
                                                    this.G3 = false;
                                                    this.b4 = true;
                                                    str11 = String.format("%d", Integer.valueOf(i46));
                                                    str7 = null;
                                                    this.c4 = z25;
                                                    this.d4 = z25;
                                                    str10 = str11;
                                                }
                                                str11 = null;
                                                this.c4 = z25;
                                                this.d4 = z25;
                                                str10 = str11;
                                            } else {
                                                if (this.h1) {
                                                    this.G3 = false;
                                                    z29 = false;
                                                    str7 = null;
                                                    z22 = true;
                                                } else {
                                                    int i47 = this.S0;
                                                    if (i47 != 0) {
                                                        z22 = true;
                                                        this.G3 = true;
                                                        str7 = String.format("%d", Integer.valueOf(i47));
                                                    } else {
                                                        z22 = true;
                                                        if (this.T0) {
                                                            this.G3 = true;
                                                            str7 = "";
                                                        } else {
                                                            this.G3 = false;
                                                            str7 = null;
                                                        }
                                                    }
                                                }
                                                if (this.U0 != 0) {
                                                    this.b4 = z22;
                                                    str10 = "@";
                                                } else {
                                                    this.b4 = false;
                                                    str10 = null;
                                                }
                                                this.c4 = this.V0 > 0;
                                                this.d4 = this.W0 > 0;
                                            }
                                            if (this.f1.N3() && this.l2 == null && z29) {
                                                jj jjVar24 = this.f1;
                                                if (!(jjVar24.k.action instanceof TLRPC.TL_messageActionHistoryClear)) {
                                                    if (jjVar24.o4()) {
                                                        z24 = false;
                                                        this.Q2 = false;
                                                        this.R2 = false;
                                                        this.S2 = true;
                                                        this.t3 = false;
                                                    } else {
                                                        z24 = false;
                                                        if (this.f1.n4()) {
                                                            this.Q2 = false;
                                                            this.R2 = false;
                                                            this.S2 = false;
                                                            this.t3 = true;
                                                            this.G3 = false;
                                                            this.b4 = false;
                                                        } else {
                                                            if (this.f1.q4()) {
                                                                TLRPC.TL_forumTopic tL_forumTopic = this.N;
                                                                if (tL_forumTopic != null) {
                                                                    this.Q2 = tL_forumTopic.read_outbox_max_id >= this.f1.f1();
                                                                } else if (this.N0) {
                                                                    int i48 = this.H4;
                                                                    this.Q2 = (i48 > 0 && i48 >= this.f1.f1()) || !this.f1.F4() || (org.telegram.messenger.w3.T(this.g2) && !this.g2.megagroup);
                                                                } else {
                                                                    this.Q2 = !this.f1.F4() || (org.telegram.messenger.w3.T(this.g2) && !this.g2.megagroup);
                                                                }
                                                                this.R2 = true;
                                                                z23 = false;
                                                                this.S2 = false;
                                                                this.t3 = false;
                                                            } else {
                                                                z23 = false;
                                                            }
                                                            str12 = str10;
                                                            z20 = z23;
                                                        }
                                                    }
                                                    z23 = z24;
                                                    str12 = str10;
                                                    z20 = z23;
                                                }
                                            }
                                            z23 = false;
                                            this.Q2 = false;
                                            this.R2 = false;
                                            this.S2 = false;
                                            this.t3 = false;
                                            str12 = str10;
                                            z20 = z23;
                                        }
                                        this.P2 = z20;
                                        r12 = vp.r1(this.F0);
                                        if (this.j1 == 0 && r12.B2(this.H0, true)) {
                                            this.z3 = true;
                                            this.P2 = true;
                                            i18 = r12.A2;
                                            if (i18 != 0) {
                                                a12 = cd.K0(2131743807);
                                            } else if (i18 == 1) {
                                                a12 = cd.M0("PsaType_" + r12.C2);
                                                if (TextUtils.isEmpty(a12)) {
                                                    a12 = cd.K0(2131746608);
                                                }
                                                if (!TextUtils.isEmpty(r12.B2)) {
                                                    charSequence6 = r12.B2;
                                                    this.R1 = 0;
                                                }
                                            }
                                        }
                                        str8 = a12;
                                        str9 = this.L0;
                                        if (str9 == null) {
                                            charSequence25 = charSequence23;
                                            charSequence24 = str9;
                                        } else if (this.J0 != 0) {
                                            charSequence25 = charSequence23;
                                            charSequence24 = cd.K0(2131754136);
                                        } else {
                                            TLRPC.Chat chat9 = this.g2;
                                            if (chat9 != null) {
                                                if (this.O) {
                                                    if (this.h0 == null) {
                                                        this.h0 = new Drawable[1];
                                                    }
                                                    this.h0[0] = null;
                                                    U = vp.r1(this.F0).R1().j(this.g2, this.f1, this.a0, this.h0);
                                                } else if (this.P) {
                                                    if (this.h0 == null) {
                                                        this.h0 = new Drawable[1];
                                                    }
                                                    Drawable[] drawableArr = this.h0;
                                                    drawableArr[0] = null;
                                                    U = this.g0 ? gg.e.j(this.N, org.telegram.ui.ActionBar.t6.B0[this.E0], drawableArr) : org.telegram.messenger.i0.U(this.N.title);
                                                } else if (!chat9.monoforum || chat9.linked_monoforum_id == 0) {
                                                    U = org.telegram.messenger.i0.U(chat9.title);
                                                } else {
                                                    TLRPC.Chat L02 = vp.r1(this.F0).L0(Long.valueOf(this.g2.linked_monoforum_id));
                                                    if (L02 != null) {
                                                        SpannableStringBuilder spannableStringBuilder13 = new SpannableStringBuilder(org.telegram.messenger.i0.U(L02.title));
                                                        spannableStringBuilder13.append(charSequence4);
                                                        int length4 = spannableStringBuilder13.length();
                                                        spannableStringBuilder13.append((CharSequence) cd.K0(2131748362));
                                                        spannableStringBuilder13.setSpan(new h00(cd.K0(2131748362), org.telegram.ui.ActionBar.t6.y6, this.J4), length4, spannableStringBuilder13.length(), 33);
                                                        charSequence24 = spannableStringBuilder13;
                                                    } else {
                                                        U = org.telegram.messenger.i0.U(this.g2.title);
                                                    }
                                                }
                                                charSequence24 = U;
                                            } else {
                                                TLRPC.User user6 = this.f2;
                                                if (user6 != null) {
                                                    if (h20.z(user6)) {
                                                        U = cd.K0(2131746281);
                                                    } else if (h20.s(this.f2)) {
                                                        U = cd.K0(2131754252);
                                                    } else if (!h20.B(this.f2) || this.q0) {
                                                        if (this.P) {
                                                            if (this.h0 == null) {
                                                                this.h0 = new Drawable[1];
                                                            }
                                                            Drawable[] drawableArr2 = this.h0;
                                                            drawableArr2[0] = null;
                                                            U = this.g0 ? gg.e.j(this.N, org.telegram.ui.ActionBar.t6.B0[this.E0], drawableArr2) : org.telegram.messenger.i0.U(this.N.title);
                                                        } else {
                                                            U = org.telegram.messenger.i0.U(h20.p(this.f2));
                                                        }
                                                    } else if (this.r0) {
                                                        U = cd.K0(2131748318);
                                                    } else if (this.u2) {
                                                        U = cd.K0(2131750512);
                                                    } else {
                                                        if (this.j1 == 3) {
                                                            this.z3 = true;
                                                        }
                                                        U = cd.K0(2131745918);
                                                    }
                                                    charSequence24 = U;
                                                }
                                                charSequence24 = "";
                                            }
                                            if (charSequence24 != null && charSequence24.length() == 0) {
                                                charSequence24 = cd.K0(2131749337);
                                            }
                                            charSequence25 = charSequence23;
                                        }
                                        z21 = z28;
                                        i17 = i14;
                                        z10 = z16;
                                        charSequence26 = charSequence8;
                                    }
                                    a12 = "";
                                    jjVar4 = this.f1;
                                    if (jjVar4 != null) {
                                    }
                                    this.Q2 = false;
                                    this.R2 = false;
                                    this.S2 = jjVar4 == null && jjVar4.o4() && this.H0 == d20.i(this.F0).e();
                                    z20 = false;
                                    this.G3 = false;
                                    this.b4 = false;
                                    this.c4 = false;
                                    this.d4 = false;
                                    this.t3 = false;
                                    str7 = null;
                                    str12 = null;
                                    this.P2 = z20;
                                    r12 = vp.r1(this.F0);
                                    if (this.j1 == 0) {
                                        this.z3 = true;
                                        this.P2 = true;
                                        i18 = r12.A2;
                                        if (i18 != 0) {
                                        }
                                    }
                                    str8 = a12;
                                    str9 = this.L0;
                                    if (str9 == null) {
                                    }
                                    z21 = z28;
                                    i17 = i14;
                                    z10 = z16;
                                    charSequence26 = charSequence8;
                                } else {
                                    this.l2 = null;
                                    this.k2 = false;
                                    charSequence21 = this.I0;
                                    this.a0 = org.telegram.ui.ActionBar.t6.F0[this.E0];
                                    z16 = z10;
                                    K0 = null;
                                    charSequence22 = null;
                                }
                            }
                            charSequence6 = charSequence21;
                            charSequence4 = " ";
                            charSequence23 = "";
                            i14 = -1;
                            charSequence8 = charSequence22;
                            if (!this.x0) {
                                this.y0 = true;
                                SpannableStringBuilder spannableStringBuilder122 = new SpannableStringBuilder(charSequence6);
                                spannableStringBuilder122.insert(0, (CharSequence) "d ");
                                dq dqVar32 = new dq(f0.c.c(getContext(), R.drawable.mini_gift).mutate());
                                dqVar32.H = 1.25f;
                                dqVar32.I = 1.25f;
                                dqVar32.G = 0.9f;
                                dqVar32.x = 0.9f;
                                spannableStringBuilder122.setSpan(dqVar32, 0, 1, 0);
                                tL_textWithEntities = ((TLRPC.TL_messageActionStarGift) this.f1.k.action).message;
                                if (tL_textWithEntities != null) {
                                    this.a0 = org.telegram.ui.ActionBar.t6.F0[this.E0];
                                }
                                charSequence6 = spannableStringBuilder122;
                            }
                            if (TextUtils.isEmpty(this.I0)) {
                            }
                            a12 = "";
                            jjVar4 = this.f1;
                            if (jjVar4 != null) {
                            }
                            this.Q2 = false;
                            this.R2 = false;
                            this.S2 = jjVar4 == null && jjVar4.o4() && this.H0 == d20.i(this.F0).e();
                            z20 = false;
                            this.G3 = false;
                            this.b4 = false;
                            this.c4 = false;
                            this.d4 = false;
                            this.t3 = false;
                            str7 = null;
                            str12 = null;
                            this.P2 = z20;
                            r12 = vp.r1(this.F0);
                            if (this.j1 == 0) {
                            }
                            str8 = a12;
                            str9 = this.L0;
                            if (str9 == null) {
                            }
                            z21 = z28;
                            i17 = i14;
                            z10 = z16;
                            charSequence26 = charSequence8;
                        }
                    }
                    draftMessage = this.l2;
                    if (draftMessage != null) {
                        if (i12 > draftMessage.date) {
                        }
                    }
                }
                if (org.telegram.messenger.w3.T(this.g2)) {
                    TLRPC.Chat chat10 = this.g2;
                    if (!chat10.megagroup) {
                        if (!chat10.creator) {
                            TLRPC.TL_chatAdminRights tL_chatAdminRights = chat10.admin_rights;
                            if (tL_chatAdminRights != null) {
                            }
                            this.l2 = null;
                            this.k2 = false;
                            if (X()) {
                            }
                            charSequence6 = charSequence21;
                            charSequence4 = " ";
                            charSequence23 = "";
                            i14 = -1;
                            charSequence8 = charSequence22;
                            if (!this.x0) {
                            }
                            if (TextUtils.isEmpty(this.I0)) {
                            }
                            a12 = "";
                            jjVar4 = this.f1;
                            if (jjVar4 != null) {
                            }
                            this.Q2 = false;
                            this.R2 = false;
                            this.S2 = jjVar4 == null && jjVar4.o4() && this.H0 == d20.i(this.F0).e();
                            z20 = false;
                            this.G3 = false;
                            this.b4 = false;
                            this.c4 = false;
                            this.d4 = false;
                            this.t3 = false;
                            str7 = null;
                            str12 = null;
                            this.P2 = z20;
                            r12 = vp.r1(this.F0);
                            if (this.j1 == 0) {
                            }
                            str8 = a12;
                            str9 = this.L0;
                            if (str9 == null) {
                            }
                            z21 = z28;
                            i17 = i14;
                            z10 = z16;
                            charSequence26 = charSequence8;
                        }
                    }
                }
                chat = this.g2;
                if (chat != null) {
                    if (chat.left) {
                    }
                    this.l2 = null;
                    this.k2 = false;
                    if (X()) {
                    }
                    charSequence6 = charSequence21;
                    charSequence4 = " ";
                    charSequence23 = "";
                    i14 = -1;
                    charSequence8 = charSequence22;
                    if (!this.x0) {
                    }
                    if (TextUtils.isEmpty(this.I0)) {
                    }
                    a12 = "";
                    jjVar4 = this.f1;
                    if (jjVar4 != null) {
                    }
                    this.Q2 = false;
                    this.R2 = false;
                    this.S2 = jjVar4 == null && jjVar4.o4() && this.H0 == d20.i(this.F0).e();
                    z20 = false;
                    this.G3 = false;
                    this.b4 = false;
                    this.c4 = false;
                    this.d4 = false;
                    this.t3 = false;
                    str7 = null;
                    str12 = null;
                    this.P2 = z20;
                    r12 = vp.r1(this.F0);
                    if (this.j1 == 0) {
                    }
                    str8 = a12;
                    str9 = this.L0;
                    if (str9 == null) {
                    }
                    z21 = z28;
                    i17 = i14;
                    z10 = z16;
                    charSequence26 = charSequence8;
                }
                if (org.telegram.messenger.w3.c0(chat)) {
                }
                if (X()) {
                }
                charSequence6 = charSequence21;
                charSequence4 = " ";
                charSequence23 = "";
                i14 = -1;
                charSequence8 = charSequence22;
                if (!this.x0) {
                }
                if (TextUtils.isEmpty(this.I0)) {
                }
                a12 = "";
                jjVar4 = this.f1;
                if (jjVar4 != null) {
                }
                this.Q2 = false;
                this.R2 = false;
                this.S2 = jjVar4 == null && jjVar4.o4() && this.H0 == d20.i(this.F0).e();
                z20 = false;
                this.G3 = false;
                this.b4 = false;
                this.c4 = false;
                this.d4 = false;
                this.t3 = false;
                str7 = null;
                str12 = null;
                this.P2 = z20;
                r12 = vp.r1(this.F0);
                if (this.j1 == 0) {
                }
                str8 = a12;
                str9 = this.L0;
                if (str9 == null) {
                }
                z21 = z28;
                i17 = i14;
                z10 = z16;
                charSequence26 = charSequence8;
            }
            i11 = i10;
            charSequence = charSequence32;
            i12 = this.R0;
            if (i12 == 0) {
                i12 = jjVar6.k.date;
            }
            if (!this.P) {
            }
            z13 = this.k2;
            if (!z13) {
            }
            if (!z13) {
                draftMessage3 = this.l2;
                if (draftMessage3.rich_message == null) {
                }
            }
            draftMessage = this.l2;
            if (draftMessage != null) {
            }
            if (org.telegram.messenger.w3.T(this.g2)) {
            }
            chat = this.g2;
            if (chat != null) {
            }
            if (org.telegram.messenger.w3.c0(chat)) {
            }
            if (X()) {
            }
            charSequence6 = charSequence21;
            charSequence4 = " ";
            charSequence23 = "";
            i14 = -1;
            charSequence8 = charSequence22;
            if (!this.x0) {
            }
            if (TextUtils.isEmpty(this.I0)) {
            }
            a12 = "";
            jjVar4 = this.f1;
            if (jjVar4 != null) {
            }
            this.Q2 = false;
            this.R2 = false;
            this.S2 = jjVar4 == null && jjVar4.o4() && this.H0 == d20.i(this.F0).e();
            z20 = false;
            this.G3 = false;
            this.b4 = false;
            this.c4 = false;
            this.d4 = false;
            this.t3 = false;
            str7 = null;
            str12 = null;
            this.P2 = z20;
            r12 = vp.r1(this.F0);
            if (this.j1 == 0) {
            }
            str8 = a12;
            str9 = this.L0;
            if (str9 == null) {
            }
            z21 = z28;
            i17 = i14;
            z10 = z16;
            charSequence26 = charSequence8;
        }
        charSequence27 = K0;
        if (z10) {
            f11 = 24.0f;
            f12 = 0.0f;
            this.N2 = null;
            this.L2 = 0;
            i20 = 0;
        } else {
            TextPaint timeTextPaint = getTimeTextPaint();
            f11 = 24.0f;
            f12 = 0.0f;
            int ceil = (int) Math.ceil(timeTextPaint.measureText(str8));
            this.N2 = new StaticLayout(str8, timeTextPaint, ceil, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            i20 = org.telegram.messenger.i0.L(getIsPinned() ? 24.0f : 0.0f) + ceil;
            if (cd.X) {
                this.L2 = org.telegram.messenger.i0.L(15.0f);
            } else {
                this.L2 = org.telegram.messenger.m5.z(15.0f, getMeasuredWidth(), i20);
            }
        }
        if (L()) {
            i21 = 0;
        } else {
            if (cd.X) {
                this.O2 = org.telegram.messenger.i0.L(4.0f) + this.L2 + i20;
            } else {
                this.O2 = (this.L2 - org.telegram.ui.ActionBar.t6.b1.getIntrinsicWidth()) - org.telegram.messenger.i0.L(4.0f);
            }
            i21 = org.telegram.ui.ActionBar.t6.b1.getIntrinsicWidth() + org.telegram.messenger.i0.L(4.0f);
            i20 += i21;
        }
        if (cd.X) {
            this.y2 = org.telegram.messenger.m5.z(22.0f, getMeasuredWidth() - this.x2, i20);
        } else {
            this.y2 = org.telegram.messenger.m5.z(this.I + 13, getMeasuredWidth() - this.x2, i20);
            this.x2 += i20;
        }
        if (this.G2) {
            this.y2 -= org.telegram.ui.ActionBar.t6.a1.getIntrinsicWidth() + org.telegram.messenger.i0.L(cd.X ? 8.0f : 4.0f);
        }
        if (!this.S2) {
            int L11 = org.telegram.messenger.i0.L(5.0f) + org.telegram.ui.ActionBar.t6.X0.getIntrinsicWidth();
            this.y2 -= L11;
            if (cd.X) {
                this.V2 = org.telegram.messenger.i0.L(5.0f) + this.L2 + i20;
                this.x2 += L11;
            } else {
                this.V2 = (this.L2 - i21) - L11;
            }
        } else if (this.R2) {
            int L12 = org.telegram.messenger.i0.L(5.0f) + org.telegram.ui.ActionBar.t6.T0.getIntrinsicWidth();
            int i49 = this.y2 - L12;
            this.y2 = i49;
            if (this.Q2) {
                this.y2 = org.telegram.messenger.m5.B(8.0f, org.telegram.ui.ActionBar.t6.W0.getIntrinsicWidth(), i49);
                if (cd.X) {
                    int L13 = org.telegram.messenger.i0.L(5.0f) + this.L2 + i20;
                    this.T2 = L13;
                    this.X2 = org.telegram.messenger.i0.L(5.5f) + L13;
                    this.x2 = z20.D(8.0f, org.telegram.ui.ActionBar.t6.W0.getIntrinsicWidth() + L12, this.x2);
                } else {
                    int i50 = (this.L2 - i21) - L12;
                    this.X2 = i50;
                    this.T2 = i50 - org.telegram.messenger.i0.L(5.5f);
                }
            } else if (cd.X) {
                this.U2 = org.telegram.messenger.i0.L(5.0f) + this.L2 + i20;
                this.x2 += L12;
            } else {
                this.U2 = (this.L2 - i21) - L12;
            }
        }
        z26 = (!this.Z0 || this.Q0 || this.b1 || this.c1 > f12) && !this.j4 && this.p4 == 0;
        if (!this.l4 && this.n4.c() != null) {
            int L14 = org.telegram.messenger.i0.L(36.0f);
            if (z26) {
                L14 += org.telegram.ui.ActionBar.t6.c1.getIntrinsicWidth() + org.telegram.messenger.i0.L(6.0f);
            }
            this.y2 -= L14;
            if (cd.X) {
                this.x2 += L14;
            }
        } else if (!z26) {
            int intrinsicWidth = org.telegram.ui.ActionBar.t6.c1.getIntrinsicWidth() + org.telegram.messenger.i0.L(6.0f);
            if (this.l4) {
                intrinsicWidth += org.telegram.messenger.i0.L(36.0f);
            }
            this.y2 -= intrinsicWidth;
            if (cd.X) {
                this.x2 += intrinsicWidth;
            }
        } else if (this.j4) {
            int intrinsicWidth2 = org.telegram.ui.ActionBar.t6.f1.getIntrinsicWidth() + org.telegram.messenger.i0.L(6.0f);
            this.y2 -= intrinsicWidth2;
            if (cd.X) {
                this.x2 += intrinsicWidth2;
            }
        } else if (this.l4) {
            int L15 = org.telegram.messenger.i0.L(36.0f);
            this.y2 -= L15;
            if (cd.X) {
                this.x2 += L15;
            }
        } else if (this.p4 != 0) {
            int intrinsicWidth3 = (this.p4 == 1 ? org.telegram.ui.ActionBar.t6.g1 : org.telegram.ui.ActionBar.t6.h1).getIntrinsicWidth() + org.telegram.messenger.i0.L(6.0f);
            this.y2 -= intrinsicWidth3;
            if (cd.X) {
                this.x2 += intrinsicWidth3;
            }
        }
        if (this.k4) {
            this.y2 -= org.telegram.messenger.i0.L(21.0f);
        }
        try {
            L8 = this.y2 - org.telegram.messenger.i0.L(12.0f);
            if (L8 < 0) {
                L8 = 0;
            }
            if (charSequence24 instanceof String) {
                charSequence24 = ((String) charSequence24).replace(c10, ' ');
            }
            if (this.D2) {
                f13 = 36.0f;
                f14 = 8.0f;
            } else {
                f13 = 36.0f;
                try {
                    f14 = 8.0f;
                    try {
                        this.A2 = charSequence24.length() == TextUtils.ellipsize(charSequence24, org.telegram.ui.ActionBar.t6.B0[this.E0], (float) L8, TextUtils.TruncateAt.END).length();
                        L8 += org.telegram.messenger.i0.L(48.0f);
                    } catch (Exception e11) {
                        e = e11;
                        org.telegram.messenger.f8.f(e);
                        this.p3 = org.telegram.ui.Components.o5.update(0, (View) this, this.p3, this.z2);
                        if (this.r2) {
                        }
                        f15 = 39.0f;
                        f16 = f11;
                        f17 = 13.0f;
                        L = org.telegram.messenger.i0.L(11.0f);
                        this.q3 = org.telegram.messenger.i0.L(32.0f);
                        this.M2 = org.telegram.messenger.i0.L(13.0f);
                        this.u3 = org.telegram.messenger.i0.L(42.33f);
                        this.C3 = org.telegram.messenger.i0.L(43.0f);
                        this.M3 = org.telegram.messenger.i0.L(42.33f);
                        this.W2 = org.telegram.messenger.i0.L(13.0f);
                        int measuredWidth42 = getMeasuredWidth() - org.telegram.messenger.i0.L(this.I + 21);
                        if (cd.X) {
                        }
                        i22 = L3;
                        this.u0.F.set(L2, L, org.telegram.messenger.i0.L(56.0f) + L2, org.telegram.messenger.i0.L(56.0f) + L);
                        i23 = 0;
                        while (true) {
                            imageReceiverArr = this.V1;
                            if (i23 < imageReceiverArr.length) {
                            }
                            imageReceiverArr[i23].y0(((this.L4 + 2) * i23) + i22, ((org.telegram.messenger.i0.L(31.0f) + L) + (this.Q ? org.telegram.messenger.i0.L(20.0f) : 0)) - ((this.r2 || tz.p1 || (fVar = this.t0) == null || fVar.l()) ? 0 : org.telegram.messenger.i0.L(9.0f)), org.telegram.messenger.i0.L(18.0f), org.telegram.messenger.i0.L(18.0f));
                            i23++;
                            L = L;
                        }
                        i24 = L;
                        i25 = measuredWidth42;
                        if (cd.X) {
                        }
                        if (this.Q) {
                        }
                        if (!this.r2) {
                            this.M2 -= org.telegram.messenger.i0.L(6.0f);
                            this.W2 -= org.telegram.messenger.i0.L(6.0f);
                            if (getIsPinned()) {
                            }
                            if (this.t3) {
                            }
                            if (this.t3) {
                            }
                            this.H3 = z27;
                            if (z27) {
                            }
                            if (z21) {
                            }
                            int max2 = Math.max(org.telegram.messenger.i0.L(12.0f), i25);
                            this.g3 = org.telegram.messenger.i0.L((!this.r2 || tz.p1) ? 58.0f : 62.0f);
                            if (!this.r2) {
                                this.g3 -= org.telegram.messenger.i0.L(!X() ? 10.0f : 12.0f);
                                if (!X()) {
                                }
                                if (this.Q) {
                                }
                                this.n3 = org.telegram.ui.Components.o5.update(0, (View) this, this.n3, this.s3);
                                if (TextUtils.isEmpty(charSequence26)) {
                                }
                                this.o3 = org.telegram.ui.Components.o5.update(0, (View) this, this.o3, this.h3);
                                if (!TextUtils.isEmpty(charSequence25)) {
                                }
                                if (charSequence6 instanceof Spannable) {
                                }
                                if (this.r2) {
                                }
                                this.a0 = org.telegram.ui.ActionBar.t6.F0[this.E0];
                                charSequence29 = charSequence27;
                                charSequence30 = null;
                                Layout.Alignment alignment2 = Layout.Alignment.ALIGN_NORMAL;
                                if (this.r2) {
                                }
                                if (this.R1 > 0) {
                                }
                                TextPaint textPaint62 = this.a0;
                                float L102 = org.telegram.messenger.i0.L(1.0f);
                                TextUtils.TruncateAt truncateAt2 = TextUtils.TruncateAt.END;
                                this.e3 = ov0.b(charSequence29, textPaint62, L5, L102, L5, charSequence30 != null ? 1 : 2);
                                i28 = L5;
                                this.i3.addAll(this.j3);
                                this.j3.clear();
                                nh.i.b(this, this.e3, -2, -2, this.i3, this.j3);
                                int i4122 = i28;
                                this.m3 = org.telegram.ui.Components.o5.update(0, (View) this, this.m3, this.e3);
                                if (cd.X) {
                                }
                                staticLayout = this.f3;
                                if (staticLayout != null) {
                                }
                                l0();
                            }
                            this.g3 -= org.telegram.messenger.i0.L(!X() ? 10.0f : 12.0f);
                            if (!X()) {
                            }
                            if (this.Q) {
                            }
                            this.n3 = org.telegram.ui.Components.o5.update(0, (View) this, this.n3, this.s3);
                            if (TextUtils.isEmpty(charSequence26)) {
                            }
                            this.o3 = org.telegram.ui.Components.o5.update(0, (View) this, this.o3, this.h3);
                            if (!TextUtils.isEmpty(charSequence25)) {
                            }
                            if (charSequence6 instanceof Spannable) {
                            }
                            if (this.r2) {
                            }
                            this.a0 = org.telegram.ui.ActionBar.t6.F0[this.E0];
                            charSequence29 = charSequence27;
                            charSequence30 = null;
                            Layout.Alignment alignment22 = Layout.Alignment.ALIGN_NORMAL;
                            if (this.r2) {
                            }
                            if (this.R1 > 0) {
                            }
                            TextPaint textPaint622 = this.a0;
                            float L1022 = org.telegram.messenger.i0.L(1.0f);
                            TextUtils.TruncateAt truncateAt22 = TextUtils.TruncateAt.END;
                            this.e3 = ov0.b(charSequence29, textPaint622, L5, L1022, L5, charSequence30 != null ? 1 : 2);
                            i28 = L5;
                            this.i3.addAll(this.j3);
                            this.j3.clear();
                            nh.i.b(this, this.e3, -2, -2, this.i3, this.j3);
                            int i41222 = i28;
                            this.m3 = org.telegram.ui.Components.o5.update(0, (View) this, this.m3, this.e3);
                            if (cd.X) {
                            }
                            staticLayout = this.f3;
                            if (staticLayout != null) {
                            }
                            l0();
                        }
                        this.M2 -= org.telegram.messenger.i0.L(6.0f);
                        this.W2 -= org.telegram.messenger.i0.L(6.0f);
                        if (getIsPinned()) {
                        }
                        if (this.t3) {
                        }
                        if (this.t3) {
                        }
                        this.H3 = z27;
                        if (z27) {
                        }
                        if (z21) {
                        }
                        int max22 = Math.max(org.telegram.messenger.i0.L(12.0f), i25);
                        this.g3 = org.telegram.messenger.i0.L((!this.r2 || tz.p1) ? 58.0f : 62.0f);
                        if (!this.r2) {
                        }
                        this.g3 -= org.telegram.messenger.i0.L(!X() ? 10.0f : 12.0f);
                        if (!X()) {
                        }
                        if (this.Q) {
                        }
                        this.n3 = org.telegram.ui.Components.o5.update(0, (View) this, this.n3, this.s3);
                        if (TextUtils.isEmpty(charSequence26)) {
                        }
                        this.o3 = org.telegram.ui.Components.o5.update(0, (View) this, this.o3, this.h3);
                        if (!TextUtils.isEmpty(charSequence25)) {
                        }
                        if (charSequence6 instanceof Spannable) {
                        }
                        if (this.r2) {
                        }
                        this.a0 = org.telegram.ui.ActionBar.t6.F0[this.E0];
                        charSequence29 = charSequence27;
                        charSequence30 = null;
                        Layout.Alignment alignment222 = Layout.Alignment.ALIGN_NORMAL;
                        if (this.r2) {
                        }
                        if (this.R1 > 0) {
                        }
                        TextPaint textPaint6222 = this.a0;
                        float L10222 = org.telegram.messenger.i0.L(1.0f);
                        TextUtils.TruncateAt truncateAt222 = TextUtils.TruncateAt.END;
                        this.e3 = ov0.b(charSequence29, textPaint6222, L5, L10222, L5, charSequence30 != null ? 1 : 2);
                        i28 = L5;
                        this.i3.addAll(this.j3);
                        this.j3.clear();
                        nh.i.b(this, this.e3, -2, -2, this.i3, this.j3);
                        int i412222 = i28;
                        this.m3 = org.telegram.ui.Components.o5.update(0, (View) this, this.m3, this.e3);
                        if (cd.X) {
                        }
                        staticLayout = this.f3;
                        if (staticLayout != null) {
                        }
                        l0();
                    }
                } catch (Exception e12) {
                    e = e12;
                    f14 = 8.0f;
                    org.telegram.messenger.f8.f(e);
                    this.p3 = org.telegram.ui.Components.o5.update(0, (View) this, this.p3, this.z2);
                    if (this.r2) {
                    }
                    f15 = 39.0f;
                    f16 = f11;
                    f17 = 13.0f;
                    L = org.telegram.messenger.i0.L(11.0f);
                    this.q3 = org.telegram.messenger.i0.L(32.0f);
                    this.M2 = org.telegram.messenger.i0.L(13.0f);
                    this.u3 = org.telegram.messenger.i0.L(42.33f);
                    this.C3 = org.telegram.messenger.i0.L(43.0f);
                    this.M3 = org.telegram.messenger.i0.L(42.33f);
                    this.W2 = org.telegram.messenger.i0.L(13.0f);
                    int measuredWidth422 = getMeasuredWidth() - org.telegram.messenger.i0.L(this.I + 21);
                    if (cd.X) {
                    }
                    i22 = L3;
                    this.u0.F.set(L2, L, org.telegram.messenger.i0.L(56.0f) + L2, org.telegram.messenger.i0.L(56.0f) + L);
                    i23 = 0;
                    while (true) {
                        imageReceiverArr = this.V1;
                        if (i23 < imageReceiverArr.length) {
                        }
                        imageReceiverArr[i23].y0(((this.L4 + 2) * i23) + i22, ((org.telegram.messenger.i0.L(31.0f) + L) + (this.Q ? org.telegram.messenger.i0.L(20.0f) : 0)) - ((this.r2 || tz.p1 || (fVar = this.t0) == null || fVar.l()) ? 0 : org.telegram.messenger.i0.L(9.0f)), org.telegram.messenger.i0.L(18.0f), org.telegram.messenger.i0.L(18.0f));
                        i23++;
                        L = L;
                    }
                    i24 = L;
                    i25 = measuredWidth422;
                    if (cd.X) {
                    }
                    if (this.Q) {
                    }
                    if (!this.r2) {
                    }
                    this.M2 -= org.telegram.messenger.i0.L(6.0f);
                    this.W2 -= org.telegram.messenger.i0.L(6.0f);
                    if (getIsPinned()) {
                    }
                    if (this.t3) {
                    }
                    if (this.t3) {
                    }
                    this.H3 = z27;
                    if (z27) {
                    }
                    if (z21) {
                    }
                    int max222 = Math.max(org.telegram.messenger.i0.L(12.0f), i25);
                    this.g3 = org.telegram.messenger.i0.L((!this.r2 || tz.p1) ? 58.0f : 62.0f);
                    if (!this.r2) {
                    }
                    this.g3 -= org.telegram.messenger.i0.L(!X() ? 10.0f : 12.0f);
                    if (!X()) {
                    }
                    if (this.Q) {
                    }
                    this.n3 = org.telegram.ui.Components.o5.update(0, (View) this, this.n3, this.s3);
                    if (TextUtils.isEmpty(charSequence26)) {
                    }
                    this.o3 = org.telegram.ui.Components.o5.update(0, (View) this, this.o3, this.h3);
                    if (!TextUtils.isEmpty(charSequence25)) {
                    }
                    if (charSequence6 instanceof Spannable) {
                    }
                    if (this.r2) {
                    }
                    this.a0 = org.telegram.ui.ActionBar.t6.F0[this.E0];
                    charSequence29 = charSequence27;
                    charSequence30 = null;
                    Layout.Alignment alignment2222 = Layout.Alignment.ALIGN_NORMAL;
                    if (this.r2) {
                    }
                    if (this.R1 > 0) {
                    }
                    TextPaint textPaint62222 = this.a0;
                    float L102222 = org.telegram.messenger.i0.L(1.0f);
                    TextUtils.TruncateAt truncateAt2222 = TextUtils.TruncateAt.END;
                    this.e3 = ov0.b(charSequence29, textPaint62222, L5, L102222, L5, charSequence30 != null ? 1 : 2);
                    i28 = L5;
                    this.i3.addAll(this.j3);
                    this.j3.clear();
                    nh.i.b(this, this.e3, -2, -2, this.i3, this.j3);
                    int i4122222 = i28;
                    this.m3 = org.telegram.ui.Components.o5.update(0, (View) this, this.m3, this.e3);
                    if (cd.X) {
                    }
                    staticLayout = this.f3;
                    if (staticLayout != null) {
                    }
                    l0();
                }
            }
            float f202 = L8;
            this.R = org.telegram.ui.ActionBar.t6.B0[this.E0].measureText(charSequence24.toString()) <= f202;
            if (!this.Q) {
                charSequence24 = TextUtils.ellipsize(charSequence24, org.telegram.ui.ActionBar.t6.B0[this.E0], f202, TextUtils.TruncateAt.END);
            }
            CharSequence l102 = org.telegram.messenger.k6.l(charSequence24, org.telegram.ui.ActionBar.t6.B0[this.E0].getFontMetricsInt(), false);
            jj jjVar222 = this.f1;
            CharSequence charSequence47 = (jjVar222 == null && jjVar222.s2() && (x14 = org.telegram.messenger.i0.x1(l102, this.f1.Y1, this.J4)) != null) ? x14 : l102;
            if (this.Q) {
                this.z2 = new StaticLayout(charSequence47, org.telegram.ui.ActionBar.t6.B0[this.E0], Math.max(L8, this.y2), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            } else {
                TextPaint textPaint7 = org.telegram.ui.ActionBar.t6.B0[this.E0];
                Layout.Alignment alignment3 = Layout.Alignment.ALIGN_NORMAL;
                TextUtils.TruncateAt truncateAt3 = TextUtils.TruncateAt.END;
                this.z2 = ov0.b(charSequence47, textPaint7, L8, 0.0f, L8, 2);
            }
            this.B2 = (this.D2 || !this.z2.isRtlCharAt(0)) ? f12 : -org.telegram.messenger.i0.L(f13);
            this.C2 = this.z2.isRtlCharAt(0);
        } catch (Exception e13) {
            e = e13;
            f13 = 36.0f;
        }
        this.p3 = org.telegram.ui.Components.o5.update(0, (View) this, this.p3, this.z2);
        if (!this.r2 || tz.p1) {
            f15 = 39.0f;
            f16 = f11;
            f17 = 13.0f;
            L = org.telegram.messenger.i0.L(11.0f);
            this.q3 = org.telegram.messenger.i0.L(32.0f);
            this.M2 = org.telegram.messenger.i0.L(13.0f);
            this.u3 = org.telegram.messenger.i0.L(42.33f);
            this.C3 = org.telegram.messenger.i0.L(43.0f);
            this.M3 = org.telegram.messenger.i0.L(42.33f);
            this.W2 = org.telegram.messenger.i0.L(13.0f);
            int measuredWidth4222 = getMeasuredWidth() - org.telegram.messenger.i0.L(this.I + 21);
            if (cd.X) {
                int L16 = org.telegram.messenger.i0.L(this.I + 6);
                this.r3 = L16;
                this.b3 = L16;
                this.d3 = L16;
                this.c3 = L16;
                L2 = org.telegram.messenger.i0.L(this.H);
                L3 = org.telegram.messenger.i0.L(69.0f) + L2;
            } else {
                int L17 = org.telegram.messenger.i0.L(f10);
                this.r3 = L17;
                this.b3 = L17;
                this.d3 = L17;
                this.c3 = L17;
                L2 = getMeasuredWidth() - org.telegram.messenger.i0.L(this.H + 56);
                L3 = L2 - org.telegram.messenger.i0.L(31.0f);
            }
            i22 = L3;
            this.u0.F.set(L2, L, org.telegram.messenger.i0.L(56.0f) + L2, org.telegram.messenger.i0.L(56.0f) + L);
            i23 = 0;
            while (true) {
                imageReceiverArr = this.V1;
                if (i23 < imageReceiverArr.length) {
                    break;
                }
                imageReceiverArr[i23].y0(((this.L4 + 2) * i23) + i22, ((org.telegram.messenger.i0.L(31.0f) + L) + (this.Q ? org.telegram.messenger.i0.L(20.0f) : 0)) - ((this.r2 || tz.p1 || (fVar = this.t0) == null || fVar.l()) ? 0 : org.telegram.messenger.i0.L(9.0f)), org.telegram.messenger.i0.L(18.0f), org.telegram.messenger.i0.L(18.0f));
                i23++;
                L = L;
            }
            i24 = L;
            i25 = measuredWidth4222;
        } else {
            int L18 = org.telegram.messenger.i0.L(9.0f);
            this.q3 = org.telegram.messenger.i0.L(31.0f);
            this.M2 = org.telegram.messenger.i0.L(f10);
            this.u3 = org.telegram.messenger.i0.L(38.0f);
            this.C3 = org.telegram.messenger.i0.L(39.0f);
            this.M3 = org.telegram.messenger.i0.L(this.P ? 35.0f : 38.0f);
            this.W2 = org.telegram.messenger.i0.L(f7);
            i25 = getMeasuredWidth() - org.telegram.messenger.i0.L((this.I + 20) - (cd.X ? 0 : 12));
            if (cd.X) {
                int L19 = org.telegram.messenger.i0.L(22.0f);
                this.r3 = L19;
                this.b3 = L19;
                this.d3 = L19;
                this.c3 = L19;
                f15 = 39.0f;
                L6 = getMeasuredWidth() - org.telegram.messenger.i0.L(this.H + 52);
                f18 = 9.0f;
                L7 = L6 - org.telegram.messenger.i0.L(((this.L4 + 2) * this.R1) + 9);
            } else {
                f15 = 39.0f;
                f18 = 9.0f;
                int L20 = org.telegram.messenger.i0.L(this.I + 4);
                this.r3 = L20;
                this.b3 = L20;
                this.d3 = L20;
                this.c3 = L20;
                L6 = org.telegram.messenger.i0.L(this.H);
                L7 = org.telegram.messenger.i0.L(67.0f) + L6;
            }
            f17 = 13.0f;
            f16 = f11;
            this.u0.F.set(L6, L18, org.telegram.messenger.i0.L(52.0f) + L6, org.telegram.messenger.i0.L(52.0f) + L18);
            int i51 = 0;
            while (true) {
                ImageReceiver[] imageReceiverArr3 = this.V1;
                if (i51 >= imageReceiverArr3.length) {
                    break;
                }
                imageReceiverArr3[i51].y0(((this.L4 + 2) * i51) + L7, ((org.telegram.messenger.i0.L(30.0f) + L18) + (this.Q ? org.telegram.messenger.i0.L(20.0f) : 0)) - ((this.r2 || tz.p1 || (fVar3 = this.t0) == null || fVar3.l()) ? 0 : org.telegram.messenger.i0.L(f18)), org.telegram.messenger.i0.L(this.L4), org.telegram.messenger.i0.L(this.L4));
                i51++;
                L18 = L18;
            }
            i24 = L18;
        }
        if (cd.X) {
            this.Y2 = this.b3;
            this.Z2 = getMeasuredWidth() - org.telegram.messenger.i0.L(64.0f);
        } else {
            this.Z2 = getMeasuredWidth() - org.telegram.messenger.i0.L(this.I);
            this.Y2 = org.telegram.messenger.i0.L(64.0f);
        }
        if (this.Q) {
            this.q3 = org.telegram.messenger.i0.L(20.0f) + this.q3;
        }
        if (((!this.r2 && !tz.p1) || X()) && (fVar2 = this.t0) != null && !fVar2.l()) {
            this.M2 -= org.telegram.messenger.i0.L(6.0f);
            this.W2 -= org.telegram.messenger.i0.L(6.0f);
        }
        if (getIsPinned()) {
            if (cd.X) {
                this.D3 = org.telegram.messenger.i0.L(14.0f);
            } else {
                this.D3 = (getMeasuredWidth() - org.telegram.ui.ActionBar.t6.j1.getIntrinsicWidth()) - org.telegram.messenger.i0.L(14.0f);
            }
        }
        if (this.t3) {
            int L21 = org.telegram.messenger.i0.L(29.0f);
            i25 -= L21;
            if (cd.X) {
                this.v3 = org.telegram.messenger.i0.L(15.666f);
                this.b3 += L21;
                this.d3 += L21;
                this.c3 += L21;
                this.r3 += L21;
            } else {
                this.v3 = getMeasuredWidth() - org.telegram.messenger.i0.L(36.3333f);
            }
        } else if (str7 != null || str12 != null || this.c4 || this.d4) {
            if (str7 != null) {
                this.O3 = Math.max(org.telegram.messenger.i0.L(f14), (int) Math.ceil(org.telegram.ui.ActionBar.t6.M0.measureText(str7)));
                this.X3 = new StaticLayout(str7, org.telegram.ui.ActionBar.t6.M0, this.O3, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                int L22 = org.telegram.messenger.i0.L(f7) + this.O3;
                i25 -= L22;
                if (cd.X) {
                    this.N3 = org.telegram.messenger.i0.L(15.666f);
                    this.b3 += L22;
                    this.d3 += L22;
                    this.c3 += L22;
                    this.r3 += L22;
                } else {
                    this.N3 = z20.w(12.666f, this.O3, getMeasuredWidth() - org.telegram.messenger.i0.L(15.666f));
                }
                this.G3 = true;
            } else {
                this.O3 = 0;
            }
            if (str12 != null) {
                if (this.J0 != 0) {
                    this.h4 = Math.max(org.telegram.messenger.i0.L(f14), (int) Math.ceil(org.telegram.ui.ActionBar.t6.M0.measureText(str12)));
                    this.i4 = new StaticLayout(str12, org.telegram.ui.ActionBar.t6.M0, this.h4, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                } else {
                    this.h4 = org.telegram.messenger.i0.L(f14);
                }
                int L23 = org.telegram.messenger.i0.L(f7) + this.h4;
                i25 -= L23;
                if (cd.X) {
                    int L24 = org.telegram.messenger.i0.L(15.666f);
                    int i52 = this.O3;
                    this.e4 = L24 + (i52 != 0 ? i52 + org.telegram.messenger.i0.L(f7) : 0);
                    this.b3 += L23;
                    this.d3 += L23;
                    this.c3 += L23;
                    this.r3 += L23;
                } else {
                    int w9 = z20.w(12.666f, this.h4, getMeasuredWidth()) - org.telegram.messenger.i0.L(15.666f);
                    int i53 = this.O3;
                    this.e4 = w9 - (i53 != 0 ? i53 + org.telegram.messenger.i0.L(f7) : 0);
                }
                this.b4 = true;
            } else {
                this.h4 = 0;
            }
            if (this.c4) {
                int L25 = org.telegram.messenger.i0.L(25.0f);
                i25 -= L25;
                if (cd.X) {
                    int L26 = org.telegram.messenger.i0.L(15.666f);
                    this.f4 = L26;
                    if (this.b4) {
                        int i54 = this.h4;
                        this.f4 = L26 + (i54 != 0 ? i54 + org.telegram.messenger.i0.L(f7) : 0);
                    }
                    if (this.G3) {
                        int i55 = this.f4;
                        int i56 = this.O3;
                        this.f4 = i55 + (i56 != 0 ? i56 + org.telegram.messenger.i0.L(f7) : 0);
                    }
                    this.b3 += L25;
                    this.d3 += L25;
                    this.c3 += L25;
                    this.r3 += L25;
                } else {
                    int measuredWidth5 = getMeasuredWidth() - org.telegram.messenger.i0.L(36.332f);
                    this.f4 = measuredWidth5;
                    if (this.b4) {
                        int i57 = this.h4;
                        this.f4 = measuredWidth5 - (i57 != 0 ? i57 + org.telegram.messenger.i0.L(f7) : 0);
                    }
                    if (this.G3) {
                        int i58 = this.f4;
                        int i59 = this.O3;
                        this.f4 = i58 - (i59 != 0 ? i59 + org.telegram.messenger.i0.L(f7) : 0);
                    }
                }
            }
            if (this.d4) {
                int L27 = org.telegram.messenger.i0.L(25.0f);
                i25 -= L27;
                if (cd.X) {
                    int L28 = org.telegram.messenger.i0.L(15.666f);
                    this.g4 = L28;
                    if (this.c4) {
                        this.g4 = org.telegram.messenger.i0.L(25.0f) + L28;
                    }
                    if (this.b4) {
                        int i60 = this.g4;
                        int i61 = this.h4;
                        this.g4 = i60 + (i61 != 0 ? i61 + org.telegram.messenger.i0.L(f7) : 0);
                    }
                    if (this.G3) {
                        int i62 = this.g4;
                        int i63 = this.O3;
                        this.g4 = i62 + (i63 != 0 ? i63 + org.telegram.messenger.i0.L(f7) : 0);
                    }
                    this.b3 += L27;
                    this.d3 += L27;
                    this.c3 += L27;
                    this.r3 += L27;
                } else {
                    int measuredWidth6 = getMeasuredWidth() - org.telegram.messenger.i0.L(36.332f);
                    this.g4 = measuredWidth6;
                    if (this.c4) {
                        this.g4 = measuredWidth6 - org.telegram.messenger.i0.L(25.0f);
                    }
                    if (this.b4) {
                        int i64 = this.g4;
                        int i65 = this.h4;
                        this.g4 = i64 - (i65 != 0 ? i65 + org.telegram.messenger.i0.L(f7) : 0);
                    }
                    if (this.G3) {
                        int i66 = this.g4;
                        int i67 = this.O3;
                        this.g4 = i66 - (i67 != 0 ? i67 + org.telegram.messenger.i0.L(f7) : 0);
                    }
                }
            }
        } else if (!this.J1 || W() || X() || V() || !h20.t(this.f2) || !this.f2.bot_has_main_app) {
            this.G3 = false;
            this.b4 = false;
        } else {
            setOpenBotButton(true);
            int g10 = (int) (this.I1.g() + org.telegram.messenger.i0.L(26.0f));
            int L29 = org.telegram.messenger.i0.L(f17);
            i25 -= g10;
            int L30 = (this.r2 || tz.p1) ? org.telegram.messenger.i0.L(40.0f) : this.P ? org.telegram.messenger.i0.L(33.0f) : org.telegram.messenger.i0.L(f13);
            if (cd.X) {
                this.H1.set(org.telegram.messenger.i0.L(f17), L30, org.telegram.messenger.i0.L(f17) + g10, org.telegram.messenger.i0.L(28.0f) + L30);
                int i68 = g10 + L29;
                this.b3 += i68;
                this.d3 += i68;
                this.c3 += i68;
                this.r3 += i68;
            } else {
                this.H1.set((getMeasuredWidth() - g10) - org.telegram.messenger.i0.L(f17), L30, getMeasuredWidth() - org.telegram.messenger.i0.L(f17), org.telegram.messenger.i0.L(28.0f) + L30);
            }
            this.G3 = false;
            this.b4 = false;
        }
        z27 = this.t3 && this.G0 == null && !W() && !X() && !V() && (this.S0 > 0 || this.T0) && (jjVar8 = this.f1) != null && !jjVar8.P3() && (this.f1.k.action instanceof TLRPC.TL_messageActionGramTransfer);
        this.H3 = z27;
        if (z27) {
            int L31 = (this.G3 && this.L3) ? this.O3 + org.telegram.messenger.i0.L(f7) : 0;
            if (this.b4 && this.L3) {
                L31 = org.telegram.messenger.m5.C(f7, this.h4, L31);
            }
            if (this.c4) {
                L31 += org.telegram.messenger.i0.L(25.0f);
            }
            if (this.d4) {
                L31 += org.telegram.messenger.i0.L(25.0f);
            }
            if (this.E1) {
                L31 = org.telegram.messenger.m5.C(4.0f, (int) this.H1.width(), L31);
            }
            this.I3 = cd.X ? org.telegram.messenger.i0.L(15.666f) + L31 : org.telegram.messenger.m5.z(43.666f, getMeasuredWidth(), L31);
            i25 -= org.telegram.messenger.i0.L(32.0f);
            if (cd.X) {
                this.b3 = org.telegram.messenger.i0.L(32.0f) + this.b3;
                this.d3 = org.telegram.messenger.i0.L(32.0f) + this.d3;
                this.c3 = org.telegram.messenger.i0.L(32.0f) + this.c3;
                this.r3 = org.telegram.messenger.i0.L(32.0f) + this.r3;
            }
        }
        if (z21) {
            if (charSequence6 == null) {
                charSequence6 = "";
            }
            if (charSequence6.length() > 150) {
                charSequence6 = charSequence6.subSequence(0, zs.g2);
            }
            charSequence6 = org.telegram.messenger.k6.l(((this.r2 || tz.p1) && !T() && charSequence27 == null) ? org.telegram.messenger.i0.X2(charSequence6) : org.telegram.messenger.i0.M2(charSequence6), org.telegram.ui.ActionBar.t6.F0[this.E0].getFontMetricsInt(), false);
            jj jjVar25 = this.f1;
            if (jjVar25 != null && (x13 = org.telegram.messenger.i0.x1(charSequence6, jjVar25.Y1, this.J4)) != null) {
                charSequence6 = x13;
            }
        }
        int max2222 = Math.max(org.telegram.messenger.i0.L(12.0f), i25);
        this.g3 = org.telegram.messenger.i0.L((!this.r2 || tz.p1) ? 58.0f : 62.0f);
        if (((!this.r2 && !tz.p1) || X()) && T()) {
            this.g3 -= org.telegram.messenger.i0.L(!X() ? 10.0f : 12.0f);
        }
        if (!X()) {
            this.a3 = org.telegram.messenger.i0.L((this.r2 || tz.p1) ? 34.0f : f15);
            int i69 = 0;
            while (true) {
                ImageReceiver[] imageReceiverArr4 = this.V1;
                if (i69 >= imageReceiverArr4.length) {
                    break;
                }
                imageReceiverArr4[i69].D0(this.g3);
                i69++;
            }
            i26 = max2222;
        } else if ((this.r2 || tz.p1) && !T() && charSequence27 != null && (this.J0 == 0 || this.M0 == 1)) {
            try {
                jjVar7 = this.f1;
            } catch (Exception e14) {
                e = e14;
                i26 = max2222;
            }
            if (jjVar7 != null && jjVar7.s2()) {
                CharSequence x16 = org.telegram.messenger.i0.x1(charSequence27, this.f1.Y1, this.J4);
                if (x16 != null) {
                    charSequence28 = x16;
                    TextPaint textPaint8 = org.telegram.ui.ActionBar.t6.G0;
                    Layout.Alignment alignment4 = Layout.Alignment.ALIGN_NORMAL;
                    TextUtils.TruncateAt truncateAt4 = TextUtils.TruncateAt.END;
                    i26 = max2222;
                    this.s3 = ov0.b(charSequence28, textPaint8, i26, 0.0f, i26, 1);
                    this.a3 = org.telegram.messenger.i0.L(51.0f);
                    L4 = (this.R || !this.P) ? 0 : org.telegram.messenger.i0.L(20.0f);
                    i27 = 0;
                    while (true) {
                        imageReceiverArr2 = this.V1;
                        if (i27 >= imageReceiverArr2.length) {
                            break;
                        }
                        imageReceiverArr2[i27].D0(org.telegram.messenger.i0.L(40.0f) + i24 + L4);
                        i27++;
                    }
                    charSequence27 = charSequence28;
                }
            }
            charSequence28 = charSequence27;
            TextPaint textPaint82 = org.telegram.ui.ActionBar.t6.G0;
            Layout.Alignment alignment42 = Layout.Alignment.ALIGN_NORMAL;
            TextUtils.TruncateAt truncateAt42 = TextUtils.TruncateAt.END;
            i26 = max2222;
            this.s3 = ov0.b(charSequence28, textPaint82, i26, 0.0f, i26, 1);
            this.a3 = org.telegram.messenger.i0.L(51.0f);
            if (this.R) {
            }
            i27 = 0;
            while (true) {
                imageReceiverArr2 = this.V1;
                if (i27 >= imageReceiverArr2.length) {
                }
                imageReceiverArr2[i27].D0(org.telegram.messenger.i0.L(40.0f) + i24 + L4);
                i27++;
            }
            charSequence27 = charSequence28;
        } else {
            i26 = max2222;
            this.s3 = null;
            if (this.r2 || tz.p1) {
                this.a3 = org.telegram.messenger.i0.L(32.0f);
                int L32 = (this.R && this.P) ? org.telegram.messenger.i0.L(20.0f) : 0;
                int i70 = 0;
                while (true) {
                    ImageReceiver[] imageReceiverArr5 = this.V1;
                    if (i70 >= imageReceiverArr5.length) {
                        break;
                    }
                    imageReceiverArr5[i70].D0(org.telegram.messenger.i0.L(21.0f) + i24 + L32);
                    i70++;
                }
            } else {
                this.a3 = org.telegram.messenger.i0.L(f15);
            }
        }
        if (this.Q) {
            this.a3 = org.telegram.messenger.i0.L(20.0f) + this.a3;
        }
        this.n3 = org.telegram.ui.Components.o5.update(0, (View) this, this.n3, this.s3);
        try {
            if (TextUtils.isEmpty(charSequence26)) {
                this.h3 = null;
            } else {
                this.h3 = new StaticLayout(TextUtils.ellipsize(org.telegram.messenger.k6.l(charSequence26, this.a0.getFontMetricsInt(), false), this.a0, i26 - org.telegram.messenger.i0.L(26.0f), TextUtils.TruncateAt.END), this.a0, i26 - org.telegram.messenger.i0.L(20.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                this.k3.addAll(this.l3);
                this.l3.clear();
                nh.i.c(this, this.h3, this.k3, this.l3);
            }
        } catch (Exception unused) {
        }
        this.o3 = org.telegram.ui.Components.o5.update(0, (View) this, this.o3, this.h3);
        try {
            if (!TextUtils.isEmpty(charSequence25)) {
                try {
                    if (!this.r2) {
                        if (!tz.p1) {
                        }
                        i31 = i26;
                        StaticLayout staticLayout2 = new StaticLayout(TextUtils.ellipsize(charSequence25, this.a0, i26 - org.telegram.messenger.i0.L(12.0f), TextUtils.TruncateAt.END), org.telegram.ui.ActionBar.t6.H0[this.E0], i31, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                        i26 = i31;
                        this.f3 = staticLayout2;
                    }
                    StaticLayout staticLayout22 = new StaticLayout(TextUtils.ellipsize(charSequence25, this.a0, i26 - org.telegram.messenger.i0.L(12.0f), TextUtils.TruncateAt.END), org.telegram.ui.ActionBar.t6.H0[this.E0], i31, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                    i26 = i31;
                    this.f3 = staticLayout22;
                } catch (Exception e15) {
                    e = e15;
                    i26 = i31;
                    org.telegram.messenger.f8.f(e);
                    if (charSequence6 instanceof Spannable) {
                    }
                    if (this.r2) {
                    }
                    this.a0 = org.telegram.ui.ActionBar.t6.F0[this.E0];
                    charSequence29 = charSequence27;
                    charSequence30 = null;
                    Layout.Alignment alignment22222 = Layout.Alignment.ALIGN_NORMAL;
                    if (this.r2) {
                    }
                    if (this.R1 > 0) {
                    }
                    TextPaint textPaint622222 = this.a0;
                    float L1022222 = org.telegram.messenger.i0.L(1.0f);
                    TextUtils.TruncateAt truncateAt22222 = TextUtils.TruncateAt.END;
                    this.e3 = ov0.b(charSequence29, textPaint622222, L5, L1022222, L5, charSequence30 != null ? 1 : 2);
                    i28 = L5;
                    this.i3.addAll(this.j3);
                    this.j3.clear();
                    nh.i.b(this, this.e3, -2, -2, this.i3, this.j3);
                    int i41222222 = i28;
                    this.m3 = org.telegram.ui.Components.o5.update(0, (View) this, this.m3, this.e3);
                    if (cd.X) {
                    }
                    staticLayout = this.f3;
                    if (staticLayout != null) {
                    }
                    l0();
                }
                if (!T()) {
                    TextPaint textPaint9 = org.telegram.ui.ActionBar.t6.H0[this.E0];
                    Layout.Alignment alignment5 = Layout.Alignment.ALIGN_NORMAL;
                    float L33 = org.telegram.messenger.i0.L(1.0f);
                    TextUtils.TruncateAt truncateAt5 = TextUtils.TruncateAt.END;
                    int i71 = i26;
                    try {
                        this.f3 = ov0.b(charSequence25, textPaint9, i71, L33, i26, 1);
                    } catch (Exception e16) {
                        e = e16;
                        i26 = i71;
                        org.telegram.messenger.f8.f(e);
                        if (charSequence6 instanceof Spannable) {
                        }
                        if (this.r2) {
                        }
                        this.a0 = org.telegram.ui.ActionBar.t6.F0[this.E0];
                        charSequence29 = charSequence27;
                        charSequence30 = null;
                        Layout.Alignment alignment222222 = Layout.Alignment.ALIGN_NORMAL;
                        if (this.r2) {
                        }
                        if (this.R1 > 0) {
                        }
                        TextPaint textPaint6222222 = this.a0;
                        float L10222222 = org.telegram.messenger.i0.L(1.0f);
                        TextUtils.TruncateAt truncateAt222222 = TextUtils.TruncateAt.END;
                        this.e3 = ov0.b(charSequence29, textPaint6222222, L5, L10222222, L5, charSequence30 != null ? 1 : 2);
                        i28 = L5;
                        this.i3.addAll(this.j3);
                        this.j3.clear();
                        nh.i.b(this, this.e3, -2, -2, this.i3, this.j3);
                        int i412222222 = i28;
                        this.m3 = org.telegram.ui.Components.o5.update(0, (View) this, this.m3, this.e3);
                        if (cd.X) {
                        }
                        staticLayout = this.f3;
                        if (staticLayout != null) {
                            if (i17 >= 0) {
                            }
                            primaryHorizontal = this.f3.getPrimaryHorizontal(0);
                            primaryHorizontal2 = this.f3.getPrimaryHorizontal(1);
                            if (primaryHorizontal >= primaryHorizontal2) {
                            }
                        }
                        l0();
                    }
                }
                i31 = i26;
            }
        } catch (Exception e17) {
            e = e17;
        }
        try {
            if (charSequence6 instanceof Spannable) {
                Spannable spannable = (Spannable) charSequence6;
                for (Object obj : spannable.getSpans(0, spannable.length(), Object.class)) {
                    if (!(obj instanceof ClickableSpan) && !(obj instanceof di.i)) {
                        if (this.K0 == 0) {
                            if (!W()) {
                                if (!(obj instanceof x41)) {
                                }
                            }
                        }
                        if (!(obj instanceof di.e)) {
                            if (!(obj instanceof wh0)) {
                                if (!(obj instanceof vh0)) {
                                    if ((obj instanceof StyleSpan) && ((StyleSpan) obj).getStyle() == 1) {
                                    }
                                }
                            }
                        }
                    }
                    spannable.removeSpan(obj);
                }
            }
            if ((!this.r2 || tz.p1) && !T() && this.J0 != 0 && this.M0 > 1) {
                this.a0 = org.telegram.ui.ActionBar.t6.F0[this.E0];
                charSequence29 = charSequence27;
                charSequence30 = null;
            } else {
                if (!this.r2) {
                }
                if (!T()) {
                    if (charSequence27 == null) {
                        if (org.telegram.messenger.w3.p0(this.g2) && org.telegram.messenger.w3.g(this.F0, this.g2)) {
                        }
                        charSequence30 = charSequence27;
                        charSequence29 = charSequence6;
                    }
                }
                charSequence6 = (X() || !(charSequence6 instanceof Spanned) || ((t2[]) ((Spanned) charSequence6).getSpans(0, charSequence6.length(), t2.class)).length > 0) ? TextUtils.ellipsize(charSequence6, this.a0, i26 - org.telegram.messenger.i0.L(12.0f), TextUtils.TruncateAt.END) : TextUtils.ellipsize(charSequence6, this.a0, i26 - org.telegram.messenger.i0.L(((this.L4 + 2) * this.R1) + 15), TextUtils.TruncateAt.END);
                charSequence30 = charSequence27;
                charSequence29 = charSequence6;
            }
            Layout.Alignment alignment2222222 = Layout.Alignment.ALIGN_NORMAL;
            if ((!this.r2 || tz.p1) && !T()) {
                L5 = (this.R1 > 0 || charSequence30 == null) ? i26 : i26 + org.telegram.messenger.i0.L(5.0f);
                TextPaint textPaint62222222 = this.a0;
                float L102222222 = org.telegram.messenger.i0.L(1.0f);
                TextUtils.TruncateAt truncateAt2222222 = TextUtils.TruncateAt.END;
                this.e3 = ov0.b(charSequence29, textPaint62222222, L5, L102222222, L5, charSequence30 != null ? 1 : 2);
                i28 = L5;
            } else {
                if (this.R1 > 0) {
                    i28 = i26 + org.telegram.messenger.i0.L(((this.L4 + 2) * r0) + 3);
                    try {
                        if (cd.X && !X()) {
                            this.b3 -= org.telegram.messenger.i0.L(((this.L4 + 2) * this.R1) + 3);
                        }
                        i30 = i28;
                    } catch (Exception e18) {
                        e = e18;
                        this.e3 = null;
                        org.telegram.messenger.f8.f(e);
                        int i4122222222 = i28;
                        this.m3 = org.telegram.ui.Components.o5.update(0, (View) this, this.m3, this.e3);
                        if (cd.X) {
                        }
                        staticLayout = this.f3;
                        if (staticLayout != null) {
                        }
                        l0();
                    }
                } else {
                    i30 = i26;
                }
                try {
                    this.e3 = new StaticLayout(charSequence29, this.a0, i30, alignment2222222, 1.0f, 0.0f, false);
                    i28 = i30;
                } catch (Exception e19) {
                    e = e19;
                    i28 = i30;
                    this.e3 = null;
                    org.telegram.messenger.f8.f(e);
                    int i41222222222 = i28;
                    this.m3 = org.telegram.ui.Components.o5.update(0, (View) this, this.m3, this.e3);
                    if (cd.X) {
                    }
                    staticLayout = this.f3;
                    if (staticLayout != null) {
                    }
                    l0();
                }
            }
            this.i3.addAll(this.j3);
            this.j3.clear();
            nh.i.b(this, this.e3, -2, -2, this.i3, this.j3);
        } catch (Exception e20) {
            e = e20;
            i28 = i26;
        }
        int i412222222222 = i28;
        this.m3 = org.telegram.ui.Components.o5.update(0, (View) this, this.m3, this.e3);
        if (cd.X) {
            StaticLayout staticLayout3 = this.z2;
            if (staticLayout3 != null && staticLayout3.getLineCount() > 0) {
                float lineRight = this.z2.getLineRight(0);
                if (this.D2) {
                    lineRight = Math.min(this.y2, lineRight);
                }
                if (lineRight == this.y2) {
                    double ceil2 = Math.ceil(this.z2.getLineWidth(0));
                    if (this.D2) {
                        ceil2 = Math.min(this.y2, ceil2);
                    }
                    double d10 = this.y2;
                    if (ceil2 < d10) {
                        this.x2 = (int) (this.x2 - (d10 - ceil2));
                    }
                }
                if (this.k4) {
                    this.x2 = org.telegram.messenger.i0.L(21.0f) + this.x2;
                }
                int L34 = (int) (this.x2 + lineRight + org.telegram.messenger.i0.L(6.0f));
                this.H2 = L34;
                if (this.l4) {
                    this.I2 = org.telegram.messenger.i0.L(30.0f) + L34;
                }
            }
            StaticLayout staticLayout4 = this.e3;
            float f21 = 2.14748365E9f;
            if (staticLayout4 != null && (lineCount3 = staticLayout4.getLineCount()) > 0) {
                float f22 = 2.14748365E9f;
                for (int i72 = 0; i72 < lineCount3; i72++) {
                    f22 = Math.min(f22, this.e3.getLineLeft(i72));
                }
                this.b3 = (int) (this.b3 - f22);
            }
            StaticLayout staticLayout5 = this.h3;
            if (staticLayout5 != null && (lineCount2 = staticLayout5.getLineCount()) > 0) {
                float f23 = 2.14748365E9f;
                for (int i73 = 0; i73 < lineCount2; i73++) {
                    f23 = Math.min(f23, this.h3.getLineLeft(i73));
                }
                this.c3 = (int) (this.c3 - f23);
            }
            StaticLayout staticLayout6 = this.f3;
            if (staticLayout6 != null && (lineCount = staticLayout6.getLineCount()) > 0) {
                for (int i74 = 0; i74 < lineCount; i74++) {
                    f21 = Math.min(f21, this.f3.getLineLeft(i74));
                }
                this.d3 = (int) (this.d3 - f21);
            }
            StaticLayout staticLayout7 = this.s3;
            if (staticLayout7 != null && staticLayout7.getLineCount() > 0) {
                this.r3 = (int) (this.r3 - this.s3.getLineLeft(0));
            }
        } else {
            StaticLayout staticLayout8 = this.z2;
            if (staticLayout8 != null && staticLayout8.getLineCount() > 0) {
                float lineLeft = this.z2.getLineLeft(0);
                double ceil3 = Math.ceil(this.z2.getLineWidth(0));
                int L35 = org.telegram.messenger.i0.L(12.0f) + this.x2;
                this.x2 = L35;
                if (this.k4) {
                    this.x2 = org.telegram.messenger.i0.L(21.0f) + L35;
                }
                if (this.D2) {
                    ceil3 = Math.min(this.y2, ceil3);
                }
                if ((this.Z0 || this.b1 || this.c1 > f12) && !this.j4 && this.p4 == 0) {
                    if (this.l4) {
                        int L36 = (int) ((((this.y2 - ceil3) - lineLeft) + this.x2) - org.telegram.messenger.i0.L(f16));
                        this.H2 = L36;
                        this.I2 = (L36 - org.telegram.messenger.i0.L(6.0f)) - org.telegram.ui.ActionBar.t6.c1.getIntrinsicWidth();
                    } else {
                        this.H2 = (int) ((((this.y2 - ceil3) + this.x2) - org.telegram.messenger.i0.L(6.0f)) - org.telegram.ui.ActionBar.t6.c1.getIntrinsicWidth());
                    }
                } else if (this.j4) {
                    this.H2 = (int) ((((this.y2 - ceil3) + this.x2) - org.telegram.messenger.i0.L(6.0f)) - org.telegram.ui.ActionBar.t6.f1.getIntrinsicWidth());
                } else if (this.l4) {
                    int L37 = (int) ((((this.y2 - ceil3) - lineLeft) + this.x2) - org.telegram.messenger.i0.L(f16));
                    this.H2 = L37;
                    this.I2 = (L37 - org.telegram.messenger.i0.L(6.0f)) - org.telegram.ui.ActionBar.t6.c1.getIntrinsicWidth();
                } else if (this.p4 != 0) {
                    this.H2 = (int) ((((this.y2 - ceil3) + this.x2) - org.telegram.messenger.i0.L(6.0f)) - (this.p4 == 1 ? org.telegram.ui.ActionBar.t6.g1 : org.telegram.ui.ActionBar.t6.h1).getIntrinsicWidth());
                } else {
                    this.H2 = (int) ((((this.y2 - ceil3) + this.x2) - org.telegram.messenger.i0.L(6.0f)) - org.telegram.ui.ActionBar.t6.c1.getIntrinsicWidth());
                }
                if (lineLeft == f12) {
                    double d11 = this.y2;
                    if (ceil3 < d11) {
                        this.x2 = (int) ((d11 - ceil3) + this.x2);
                    }
                }
            }
            StaticLayout staticLayout9 = this.e3;
            int i75 = ConnectionsManager.DEFAULT_DATACENTER_ID;
            if (staticLayout9 != null && (lineCount6 = staticLayout9.getLineCount()) > 0) {
                int i76 = Integer.MAX_VALUE;
                int i77 = 0;
                while (true) {
                    if (i77 >= lineCount6) {
                        break;
                    }
                    if (this.e3.getLineLeft(i77) != f12) {
                        i76 = 0;
                        break;
                    } else {
                        i76 = Math.min(i76, (int) (i412222222222 - Math.ceil(this.e3.getLineWidth(i77))));
                        i77++;
                    }
                }
                if (i76 != Integer.MAX_VALUE) {
                    this.b3 += i76;
                }
            }
            StaticLayout staticLayout10 = this.f3;
            if (staticLayout10 != null && (lineCount5 = staticLayout10.getLineCount()) > 0) {
                int i78 = Integer.MAX_VALUE;
                int i79 = 0;
                while (true) {
                    if (i79 >= lineCount5) {
                        break;
                    }
                    if (this.f3.getLineLeft(i79) != f12) {
                        i78 = 0;
                        break;
                    } else {
                        i78 = Math.min(i78, (int) (i412222222222 - Math.ceil(this.f3.getLineWidth(i79))));
                        i79++;
                    }
                }
                if (i78 != Integer.MAX_VALUE) {
                    this.d3 += i78;
                }
            }
            StaticLayout staticLayout11 = this.s3;
            if (staticLayout11 != null && staticLayout11.getLineCount() > 0 && this.s3.getLineLeft(0) == f12) {
                double ceil4 = Math.ceil(this.s3.getLineWidth(0));
                double d12 = i412222222222;
                if (ceil4 < d12) {
                    this.r3 = (int) ((d12 - ceil4) + this.r3);
                }
            }
            StaticLayout staticLayout12 = this.h3;
            if (staticLayout12 != null && (lineCount4 = staticLayout12.getLineCount()) > 0) {
                for (int i80 = 0; i80 < lineCount4; i80++) {
                    i75 = (int) Math.min(i75, this.h3.getWidth() - this.h3.getLineRight(i80));
                }
                this.c3 += i75;
            }
        }
        staticLayout = this.f3;
        if (staticLayout != null && this.j2 >= 0 && staticLayout.getText().length() > 0) {
            if (i17 >= 0 || (i29 = i17 + 1) >= this.f3.getText().length()) {
                primaryHorizontal = this.f3.getPrimaryHorizontal(0);
                primaryHorizontal2 = this.f3.getPrimaryHorizontal(1);
            } else {
                primaryHorizontal = this.f3.getPrimaryHorizontal(i17);
                primaryHorizontal2 = this.f3.getPrimaryHorizontal(i29);
            }
            if (primaryHorizontal >= primaryHorizontal2) {
                this.C4 = (int) (this.d3 + primaryHorizontal);
            } else {
                this.C4 = (int) (this.d3 + primaryHorizontal2 + org.telegram.messenger.i0.L(3.0f));
            }
        }
        l0();
    }

    public v2(ay ayVar, Context context, boolean z10, int i10, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        this.h = true;
        this.y = true;
        int i11 = 0;
        this.D = false;
        this.H = 11;
        this.I = 72;
        this.J = 70;
        this.K = 76;
        this.L = 3;
        this.M = 11;
        this.U = 42.0f;
        m2 m2Var = new m2(this);
        this.u0 = m2Var;
        this.z0 = true;
        this.C0 = 0.0f;
        this.d1 = false;
        this.e1 = false;
        this.F1 = new dc(this);
        this.G1 = new Paint(1);
        this.H1 = new RectF();
        this.L1 = false;
        this.U1 = new boolean[3];
        this.V1 = new ImageReceiver[3];
        this.W1 = new boolean[3];
        this.X1 = new boolean[3];
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.Y1 = imageReceiver;
        this.a2 = new org.telegram.ui.Components.r8((org.telegram.ui.ActionBar.p6) null);
        this.d2 = new p2(0);
        gr grVar = gr.h;
        this.m2 = new org.telegram.ui.Components.t5(this, 0L, 350L, grVar);
        this.o2 = new org.telegram.ui.Components.t5(this, 0L, 350L, grVar);
        this.i3 = new Stack();
        this.j3 = new ArrayList();
        this.k3 = new Stack();
        this.l3 = new ArrayList();
        this.L3 = true;
        this.S3 = new fe.b(this, grVar, 320L);
        this.V3 = 1.0f;
        this.W3 = 1.0f;
        this.r4 = new RectF();
        this.x4 = -1;
        this.H4 = -1;
        this.I4 = new s2(this);
        m2Var.I = true;
        this.J4 = p6Var;
        this.D4 = ayVar;
        org.telegram.ui.ActionBar.t6.T(context);
        this.D = false;
        this.E = false;
        imageReceiver.J0(org.telegram.messenger.i0.L(26.0f));
        while (true) {
            ImageReceiver[] imageReceiverArr = this.V1;
            if (i11 >= imageReceiverArr.length) {
                this.r2 = z10;
                this.F0 = i10;
                bi.t0 t0Var = new bi.t0(this, context, 7);
                this.m4 = t0Var;
                addView(t0Var);
                this.n4 = new org.telegram.ui.Components.d5(org.telegram.messenger.i0.L(22.0f), t0Var);
                this.o4 = new org.telegram.ui.Components.d5(org.telegram.messenger.i0.L(17.0f), this);
                this.Y1.z1 = true;
                return;
            }
            imageReceiverArr[i11] = new ImageReceiver(this);
            ImageReceiver imageReceiver2 = this.V1[i11];
            imageReceiver2.y = true;
            imageReceiver2.J0(org.telegram.messenger.i0.L(2.0f));
            this.V1[i11].z1 = true;
            i11++;
        }
    }

    @Override // android.view.View
    public final void invalidate(int i10, int i11, int i12, int i13) {
        if (th.o7.x1) {
            return;
        }
        super.invalidate(i10, i11, i12, i13);
    }
}
