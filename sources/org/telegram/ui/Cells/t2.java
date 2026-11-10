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
import bi.dd;
import bi.ec;
import bi.sd;
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
import org.telegram.messenger.beta.R;
import org.telegram.messenger.id;
import org.telegram.messenger.ij;
import org.telegram.messenger.iz;
import org.telegram.messenger.k00;
import org.telegram.messenger.np;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.messenger.sc;
import org.telegram.messenger.t10;
import org.telegram.messenger.ui;
import org.telegram.messenger.vo;
import org.telegram.messenger.yr;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.a01;
import org.telegram.ui.Components.b41;
import org.telegram.ui.Components.bd0;
import org.telegram.ui.Components.c41;
import org.telegram.ui.Components.e51;
import org.telegram.ui.Components.e60;
import org.telegram.ui.Components.hc;
import org.telegram.ui.Components.hy;
import org.telegram.ui.Components.jg0;
import org.telegram.ui.Components.kg0;
import org.telegram.ui.Components.lr;
import org.telegram.ui.Components.my0;
import org.telegram.ui.Components.nu0;
import org.telegram.ui.Components.oc;
import org.telegram.ui.Components.pu0;
import org.telegram.ui.Components.tg0;
import org.telegram.ui.Components.u31;
import org.telegram.ui.Components.ug0;
import org.telegram.ui.Components.wp;
import org.telegram.ui.Components.wq;
import org.telegram.ui.Components.xz;
import org.telegram.ui.Components.zg0;
import org.telegram.ui.az0;
import org.telegram.ui.vv;
import org.telegram.ui.zw;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public class t2 extends z implements di.f7, org.telegram.ui.ActionBar.c6 {
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
    public ih.c D0;
    public float D1;
    public boolean D2;
    public int D3;
    public final zw D4;
    public boolean E;
    public int E0;
    public boolean E1;
    public Paint E2;
    public int E3;
    public StaticLayout E4;
    public boolean F;
    public final int F0;
    public final hc F1;
    public Paint F2;
    public float F3;
    public int F4;
    public c7 G;
    public o2 G0;
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
    public my0 I1;
    public int I2;
    public int I3;
    public final q2 I4;
    public int J;
    public int J0;
    public boolean J1;
    public int J2;
    public LayerDrawable J3;
    public final org.telegram.ui.ActionBar.h6 J4;
    public int K;
    public long K0;
    public ii.c K1;
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
    public s2 N4;
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
    public zg0 Q1;
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
    public final te.a S3;
    public ug.y0 S4;
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
    public bd0 Z1;
    public int Z2;
    public StaticLayout Z3;
    public Runnable Z4;
    public TextPaint a0;
    public boolean a1;
    public final org.telegram.ui.Components.v8 a2;
    public int a3;
    public StaticLayout a4;
    public Paint b0;
    public boolean b1;
    public boolean b2;
    public int b3;
    public boolean b4;
    public oc c0;
    public float c1;
    public float c2;
    public int c3;
    public boolean c4;
    public p2 d0;
    public boolean d1;
    public final sd d2;
    public int d3;
    public boolean d4;
    public boolean e0;
    public boolean e1;
    public kg0 e2;
    public StaticLayout e3;
    public int e4;
    public boolean f;
    public boolean f0;
    public ij f1;
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
    public final org.telegram.ui.Components.v5 m2;
    public org.telegram.ui.Components.m5 m3;
    public final ec m4;
    public float n;
    public a01 n0;
    public boolean n1;
    public boolean n2;
    public org.telegram.ui.Components.m5 n3;
    public final org.telegram.ui.Components.f5 n4;
    public Paint o0;
    public float o1;
    public final org.telegram.ui.Components.v5 o2;
    public org.telegram.ui.Components.m5 o3;
    public final org.telegram.ui.Components.f5 o4;
    public Paint p0;
    public float p1;
    public long p2;
    public org.telegram.ui.Components.m5 p3;
    public int p4;
    public boolean q0;
    public float q1;
    public fi.a3 q2;
    public int q3;
    public boolean q4;
    public boolean r;
    public boolean r0;
    public float r1;
    public final boolean r2;
    public int r3;
    public final RectF r4;
    public zg0 s;
    public boolean s0;
    public int s1;
    public boolean s2;
    public StaticLayout s3;
    public jg.k s4;
    public ui.e t0;
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
    public xh.f w0;
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
    public zg0 y1;
    public int y2;
    public boolean y3;
    public float y4;
    public boolean z0;
    public boolean z1;
    public StaticLayout z2;
    public boolean z3;
    public boolean z4;

    public t2(Context context, boolean z9) {
        this(null, context, z9, p10.s0, null);
    }

    public static SpannableStringBuilder N(int i7, CharSequence charSequence, CharSequence charSequence2) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (i7 == 1) {
            spannableStringBuilder.append(charSequence2).append((CharSequence) ": \u2068").append(charSequence).append((CharSequence) "\u2069");
            return spannableStringBuilder;
        }
        if (i7 == 2) {
            spannableStringBuilder.append((CharSequence) "\u2068").append(charSequence).append((CharSequence) "\u2069");
            return spannableStringBuilder;
        }
        if (i7 == 3) {
            spannableStringBuilder.append(charSequence2).append((CharSequence) ": ").append(charSequence);
            return spannableStringBuilder;
        }
        if (i7 != 4) {
            return spannableStringBuilder;
        }
        spannableStringBuilder.append(charSequence);
        return spannableStringBuilder;
    }

    private ij getCaptionMessage() {
        CharSequence charSequence;
        if (this.g1 == null) {
            ij ijVar = this.f1;
            if (ijVar == null || ijVar.z == null) {
                return null;
            }
            return ijVar;
        }
        int i7 = 0;
        ij ijVar2 = null;
        for (int i10 = 0; i10 < this.g1.size(); i10++) {
            ij ijVar3 = (ij) this.g1.get(i10);
            if (ijVar3 != null && (charSequence = ijVar3.z) != null) {
                if (!TextUtils.isEmpty(charSequence)) {
                    i7++;
                }
                ijVar2 = ijVar3;
            }
        }
        if (i7 > 1) {
            return null;
        }
        return ijVar2;
    }

    private int getCollapsedHeight() {
        boolean z9 = this.r2;
        int L = org.telegram.messenger.g0.L((z9 || iz.p1) ? this.K : this.J) + 1;
        if (this.Q) {
            L += org.telegram.messenger.g0.L(20.0f);
        }
        if (!S() || ((z9 || iz.p1) && !W())) {
            return L;
        }
        return org.telegram.messenger.g0.L(W() ? this.M : this.L) + L;
    }

    private Paint getPaintReorderGradient() {
        int w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.d6, this.J4);
        if (this.Q4 != w02 || this.R4 == null) {
            this.Q4 = w02;
            if (this.R4 == null) {
                this.R4 = new Paint(1);
            }
            this.R4.setShader(new LinearGradient(0.0f, 0.0f, org.telegram.messenger.g0.L(24.0f), 0.0f, new int[]{0, w02}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
        }
        return this.R4;
    }

    private TextPaint getTimeTextPaint() {
        return this.G3 ? T() ? org.telegram.ui.ActionBar.m6.J0 : org.telegram.ui.ActionBar.m6.K0 : org.telegram.ui.ActionBar.m6.I0;
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
        TLRPC.User a22;
        if (this.f2 != null && (a22 = qp.s1(this.F0).a2(Long.valueOf(this.f2.id))) != null) {
            this.f2 = a22;
        }
        this.p1 = X() ? 1.0f : 0.0f;
    }

    public final void B() {
        fi.a3 a3Var;
        boolean z9 = this.l0 > 0 && !this.v2 && !X() && ((a3Var = this.q2) == null || !a3Var.a.q) && !this.u0.w;
        this.w2 = z9;
        this.m0 = z9 ? 1.0f : 0.0f;
    }

    public final int D() {
        if (!W() || this.j0 || this.f) {
            return getCollapsedHeight();
        }
        int L = org.telegram.messenger.g0.L((this.r2 || iz.p1) ? 86.0f : 91.0f);
        if (this.s2) {
            L++;
        }
        return S() ? org.telegram.messenger.g0.L(this.M) + L : L;
    }

    public final void E(int i7, int i10) {
        this.y4 = 0.0f;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.A4 = ofFloat;
        ofFloat.setDuration(220L);
        this.A4.setInterpolator(wq.f);
        this.w4 = i7;
        this.v4 = i10;
        this.A4.addUpdateListener(new j2(this, 2));
        this.A4.addListener(new n2(this, 2));
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
    public final boolean G(Canvas canvas) {
        boolean z9;
        float f10;
        int L;
        int i7;
        float L2;
        float L3;
        float L4;
        float f11;
        float L5;
        float L6;
        float L7;
        float f12;
        float L8;
        float L9;
        float f13;
        float L10;
        float L11;
        float f14;
        float f15;
        float f16;
        boolean z10;
        boolean z11;
        float L12;
        ImageReceiver imageReceiver;
        Drawable drawable;
        Drawable drawable2;
        BitmapShader bitmapShader;
        fi.a3 a3Var;
        BitmapShader bitmapShader2;
        TLRPC.Chat chat = this.g2;
        boolean z12 = false;
        if (chat == null || (chat.flags2 & 2048) == 0) {
            z9 = false;
        } else {
            float A = this.Y1.A();
            float y10 = this.Y1.y();
            fi.a3 a3Var2 = this.q2;
            float progress = (a3Var2 == null || !a3Var2.a.q) ? 1.0f : 1.0f - a3Var2.getProgress();
            if (this.W4 == null) {
                this.W4 = getContext().getResources().getDrawable(R.drawable.star_small_outline).mutate();
            }
            int x02 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.d6, false);
            if (this.U4 != x02) {
                Drawable drawable3 = this.W4;
                this.U4 = x02;
                drawable3.setColorFilter(new PorterDuffColorFilter(x02, PorterDuff.Mode.SRC_IN));
            }
            if (this.V4 == null) {
                this.V4 = getContext().getResources().getDrawable(R.drawable.star_small_inner).mutate();
            }
            int L13 = org.telegram.messenger.g0.L(19.33f);
            Rect rect = org.telegram.messenger.g0.Q;
            int i10 = (int) y10;
            int i11 = (int) A;
            int i12 = i11 - L13;
            rect.set((org.telegram.messenger.g0.L(1.66f) + i10) - L13, i12, org.telegram.messenger.g0.L(1.66f) + i10, i11);
            rect.inset(-org.telegram.messenger.g0.L(1.0f), -org.telegram.messenger.g0.L(1.0f));
            this.W4.setBounds(rect);
            int i13 = (int) (progress * 255.0f);
            this.W4.setAlpha(i13);
            this.W4.draw(canvas);
            rect.set((org.telegram.messenger.g0.L(1.66f) + i10) - L13, i12, org.telegram.messenger.g0.L(1.66f) + i10, i11);
            this.V4.setBounds(rect);
            this.V4.setAlpha(i13);
            this.V4.draw(canvas);
            z9 = true;
        }
        float d = this.m2.d(this.n2 && !z9);
        float f17 = 10.0f;
        if (d > 0.0f) {
            float s5 = this.Y1.s() + org.telegram.messenger.g0.L(18.0f);
            float r10 = this.Y1.r() + org.telegram.messenger.g0.L(18.0f);
            canvas.save();
            org.telegram.ui.ActionBar.m6.t0.setColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.d6, this.J4));
            canvas.drawCircle(r10, s5, org.telegram.messenger.g0.L(11.33f) * d, org.telegram.ui.ActionBar.m6.t0);
            if (this.S4 == null) {
                this.S4 = new ug.y0(org.telegram.ui.ActionBar.m6.zk, org.telegram.ui.ActionBar.m6.Ak, -1, -1, this.J4);
            }
            this.S4.d((int) (r10 - org.telegram.messenger.g0.L(10.0f)), 0.0f, (int) (s5 - org.telegram.messenger.g0.L(10.0f)), (int) (org.telegram.messenger.g0.L(10.0f) + r10), 0.0f, (int) (org.telegram.messenger.g0.L(10.0f) + s5));
            canvas.drawCircle(r10, s5, org.telegram.messenger.g0.L(10.0f) * d, this.S4.f);
            if (this.T4 == null) {
                Drawable mutate = getContext().getResources().getDrawable(R.drawable.msg_mini_lock2).mutate();
                this.T4 = mutate;
                mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
            }
            this.T4.setBounds((int) (r10 - (((r4.getIntrinsicWidth() / 2.0f) * 0.875f) * d)), (int) (s5 - (((this.T4.getIntrinsicHeight() / 2.0f) * 0.875f) * d)), (int) (((this.T4.getIntrinsicWidth() / 2.0f) * 0.875f * d) + r10), (int) (((this.T4.getIntrinsicHeight() / 2.0f) * 0.875f * d) + s5));
            this.T4.setAlpha((int) (d * 255.0f));
            this.T4.draw(canvas);
            canvas.restore();
            return false;
        }
        if (!this.N0 || this.J0 != 0 || z9) {
            return false;
        }
        boolean z13 = (this.l0 <= 0 || X() || this.v2 || this.u0.w) ? false : true;
        this.w2 = z13;
        if (this.i0 != 1.0f && (z13 || this.m0 > 0.0f)) {
            a01 a01Var = this.n0;
            if (a01Var != null) {
                int i14 = a01Var.f;
                int i15 = this.l0;
                if (i14 != i15) {
                }
                if (this.o0 == null) {
                    this.o0 = new Paint(1);
                    Paint paint = new Paint(1);
                    this.p0 = paint;
                    paint.setColor(838860800);
                }
                int A2 = (int) (this.Y1.A() - org.telegram.messenger.g0.L(9.0f));
                int L14 = (int) (!id.a0 ? this.u0.F.left + org.telegram.messenger.g0.L(9.0f) : this.u0.F.right - org.telegram.messenger.g0.L(9.0f));
                this.n0.setBounds(0, 0, org.telegram.messenger.g0.L(22.0f), org.telegram.messenger.g0.L(22.0f));
                this.n0.b(this.l0);
                imageReceiver = this.Y1;
                drawable = imageReceiver.a0;
                if (drawable != null || (bitmapShader2 = imageReceiver.b0) == null) {
                    drawable2 = imageReceiver.m0;
                    if (drawable2 != null || (bitmapShader = imageReceiver.c0) == null) {
                        this.o0.setShader(null);
                        if (this.Y1.n() == null && !this.Y1.n().isRecycled()) {
                            this.o0.setColor(org.telegram.messenger.g0.J0(this.Y1.n()));
                        } else if (this.Y1.t() instanceof e51) {
                            this.o0.setColor(this.a2.c());
                        } else {
                            this.o0.setColor(((e51) this.Y1.t()).a.a());
                        }
                        canvas.save();
                        float f18 = (1.0f - this.i0) * this.m0;
                        a3Var = this.q2;
                        if (a3Var != null) {
                            f18 *= 1.0f - a3Var.getProgress();
                        }
                        float f19 = L14;
                        float f20 = A2;
                        canvas.scale(f18, f18, f19, f20);
                        canvas.drawCircle(f19, f20, org.telegram.messenger.g0.N(11.0f), this.o0);
                        canvas.drawCircle(f19, f20, org.telegram.messenger.g0.N(11.0f), this.p0);
                        canvas.save();
                        canvas.translate(f19 - org.telegram.messenger.g0.N(11.0f), f20 - org.telegram.messenger.g0.N(11.0f));
                        this.n0.draw(canvas);
                        canvas.restore();
                        canvas.restore();
                    } else {
                        imageReceiver.j(null, drawable2, qs.e4, bitmapShader, 0, 0, 0, null);
                    }
                } else {
                    imageReceiver.j(null, drawable, qs.e4, bitmapShader2, 0, 0, 0, null);
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
                float f182 = (1.0f - this.i0) * this.m0;
                a3Var = this.q2;
                if (a3Var != null) {
                }
                float f192 = L14;
                float f202 = A2;
                canvas.scale(f182, f182, f192, f202);
                canvas.drawCircle(f192, f202, org.telegram.messenger.g0.N(11.0f), this.o0);
                canvas.drawCircle(f192, f202, org.telegram.messenger.g0.N(11.0f), this.p0);
                canvas.save();
                canvas.translate(f192 - org.telegram.messenger.g0.N(11.0f), f202 - org.telegram.messenger.g0.N(11.0f));
                this.n0.draw(canvas);
                canvas.restore();
                canvas.restore();
            }
            int i16 = this.l0;
            a01 a01Var2 = new a01(org.telegram.messenger.t0.b, null);
            a01Var2.m = true;
            a01Var2.b(i16);
            this.n0 = a01Var2;
            if (this.o0 == null) {
            }
            int A22 = (int) (this.Y1.A() - org.telegram.messenger.g0.L(9.0f));
            int L142 = (int) (!id.a0 ? this.u0.F.left + org.telegram.messenger.g0.L(9.0f) : this.u0.F.right - org.telegram.messenger.g0.L(9.0f));
            this.n0.setBounds(0, 0, org.telegram.messenger.g0.L(22.0f), org.telegram.messenger.g0.L(22.0f));
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
            if (this.Y1.t() instanceof e51) {
            }
            canvas.save();
            float f1822 = (1.0f - this.i0) * this.m0;
            a3Var = this.q2;
            if (a3Var != null) {
            }
            float f1922 = L142;
            float f2022 = A22;
            canvas.scale(f1822, f1822, f1922, f2022);
            canvas.drawCircle(f1922, f2022, org.telegram.messenger.g0.N(11.0f), this.o0);
            canvas.drawCircle(f1922, f2022, org.telegram.messenger.g0.N(11.0f), this.p0);
            canvas.save();
            canvas.translate(f1922 - org.telegram.messenger.g0.N(11.0f), f2022 - org.telegram.messenger.g0.N(11.0f));
            this.n0.draw(canvas);
            canvas.restore();
            canvas.restore();
        }
        TLRPC.User user = this.f2;
        if (user == null || qp.F2(user) || this.f2.bot) {
            TLRPC.Chat chat2 = this.g2;
            if (chat2 != null) {
                boolean z14 = chat2.call_active && chat2.call_not_empty;
                this.v2 = z14;
                if ((z14 || this.q1 != 0.0f) && this.i0 < 1.0f) {
                    fi.a3 a3Var3 = this.q2;
                    float progress2 = (a3Var3 == null || !a3Var3.a.q) ? 1.0f : 1.0f - a3Var3.getProgress();
                    int L15 = (int) (this.u0.F.bottom - org.telegram.messenger.g0.L((this.r2 || iz.p1) ? 6.0f : 8.0f));
                    if (id.a0) {
                        float f21 = this.u0.F.left;
                        f10 = 0.10666667f;
                        if (!this.r2 && !iz.p1) {
                            f17 = 6.0f;
                        }
                        L = (int) (f21 + org.telegram.messenger.g0.L(f17));
                    } else {
                        f10 = 0.10666667f;
                        float f22 = this.u0.F.right;
                        if (!this.r2 && !iz.p1) {
                            f17 = 6.0f;
                        }
                        L = (int) (f22 - org.telegram.messenger.g0.L(f17));
                    }
                    if (this.i0 != 0.0f) {
                        canvas.save();
                        float f23 = 1.0f - this.i0;
                        canvas.scale(f23, f23, L, L15);
                    }
                    Paint paint2 = org.telegram.ui.ActionBar.m6.t0;
                    int i17 = org.telegram.ui.ActionBar.m6.d6;
                    paint2.setColor(org.telegram.ui.ActionBar.m6.w0(i17, this.J4));
                    float f24 = L;
                    float f25 = L15;
                    canvas.drawCircle(f24, f25, org.telegram.messenger.g0.L(11.0f) * this.q1 * progress2, org.telegram.ui.ActionBar.m6.t0);
                    org.telegram.ui.ActionBar.m6.t0.setColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.T8, this.J4));
                    canvas.drawCircle(f24, f25, org.telegram.messenger.g0.L(9.0f) * this.q1 * progress2, org.telegram.ui.ActionBar.m6.t0);
                    org.telegram.ui.ActionBar.m6.t0.setColor(org.telegram.ui.ActionBar.m6.w0(i17, this.J4));
                    if (!sc.e(360928)) {
                        this.r1 = 0.65f;
                    }
                    int i18 = this.s1;
                    if (i18 != 0) {
                        i7 = 360928;
                        if (i18 != 1) {
                            if (i18 != 2) {
                                if (i18 == 3) {
                                    L2 = org.telegram.messenger.g0.L(3.0f) - (org.telegram.messenger.g0.L(2.0f) * this.r1);
                                    L3 = org.telegram.messenger.g0.L(1.0f);
                                    L4 = org.telegram.messenger.g0.L(2.0f);
                                    f11 = this.r1;
                                } else if (i18 == 4) {
                                    L2 = (org.telegram.messenger.g0.L(4.0f) * this.r1) + org.telegram.messenger.g0.L(1.0f);
                                    L10 = org.telegram.messenger.g0.L(3.0f);
                                    L11 = org.telegram.messenger.g0.L(2.0f);
                                    f14 = this.r1;
                                } else if (i18 == 5) {
                                    L5 = org.telegram.messenger.g0.L(5.0f) - (org.telegram.messenger.g0.L(4.0f) * this.r1);
                                    L8 = org.telegram.messenger.g0.L(1.0f);
                                    L9 = org.telegram.messenger.g0.L(4.0f);
                                    f13 = this.r1;
                                } else if (i18 == 6) {
                                    L5 = org.telegram.messenger.g0.L(1.0f) + (org.telegram.messenger.g0.L(4.0f) * this.r1);
                                    L6 = org.telegram.messenger.g0.L(5.0f);
                                    L7 = org.telegram.messenger.g0.L(4.0f);
                                    f12 = this.r1;
                                } else {
                                    L2 = org.telegram.messenger.g0.L(5.0f) - (org.telegram.messenger.g0.L(4.0f) * this.r1);
                                    L3 = org.telegram.messenger.g0.L(1.0f);
                                    L4 = org.telegram.messenger.g0.L(2.0f);
                                    f11 = this.r1;
                                }
                                f15 = L3 + (L4 * f11);
                                if (this.q1 >= 1.0f || progress2 < 1.0f) {
                                    canvas.save();
                                    float f26 = this.q1 * progress2;
                                    canvas.scale(f26, f26, f24, f25);
                                }
                                z10 = true;
                                this.r4.set(L - org.telegram.messenger.g0.L(1.0f), f25 - L2, org.telegram.messenger.g0.L(1.0f) + L, L2 + f25);
                                canvas.drawRoundRect(this.r4, org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f), org.telegram.ui.ActionBar.m6.t0);
                                float f27 = f25 - f15;
                                float f28 = f25 + f15;
                                this.r4.set(L - org.telegram.messenger.g0.L(5.0f), f27, L - org.telegram.messenger.g0.L(3.0f), f28);
                                canvas.drawRoundRect(this.r4, org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f), org.telegram.ui.ActionBar.m6.t0);
                                this.r4.set(org.telegram.messenger.g0.L(3.0f) + L, f27, org.telegram.messenger.g0.L(5.0f) + L, f28);
                                canvas.drawRoundRect(this.r4, org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f), org.telegram.ui.ActionBar.m6.t0);
                                if (this.q1 >= 1.0f || progress2 < 1.0f) {
                                    canvas.restore();
                                }
                                if (sc.e(i7)) {
                                    float f29 = this.r1 + 0.04f;
                                    this.r1 = f29;
                                    if (f29 >= 1.0f) {
                                        this.r1 = 0.0f;
                                        int i19 = this.s1 + 1;
                                        this.s1 = i19;
                                        if (i19 >= 8) {
                                            this.s1 = 0;
                                        }
                                    }
                                    z12 = true;
                                }
                                if (this.v2) {
                                    float f30 = this.q1;
                                    if (f30 > 0.0f) {
                                        float f31 = f30 - f10;
                                        this.q1 = f31;
                                        if (f31 < 0.0f) {
                                            this.q1 = 0.0f;
                                        }
                                    }
                                } else {
                                    float f32 = this.q1;
                                    if (f32 < 1.0f) {
                                        float f33 = f32 + f10;
                                        this.q1 = f33;
                                        if (f33 > 1.0f) {
                                            this.q1 = 1.0f;
                                        }
                                    }
                                }
                                if (this.i0 != 0.0f) {
                                    canvas.restore();
                                }
                                if (this.w2) {
                                    float f34 = this.m0;
                                    if (f34 < 1.0f) {
                                        this.m0 = f34 + f10;
                                        z11 = z10;
                                    }
                                    z11 = z12;
                                } else {
                                    float f35 = this.m0;
                                    if (f35 > 0.0f) {
                                        this.m0 = f35 - f10;
                                        z11 = z10;
                                    }
                                    z11 = z12;
                                }
                                this.m0 = Utilities.i(this.m0, 1.0f, 0.0f);
                                return z11;
                            }
                            L5 = org.telegram.messenger.g0.L(1.0f) + (org.telegram.messenger.g0.L(2.0f) * this.r1);
                            L6 = org.telegram.messenger.g0.L(5.0f);
                            L7 = org.telegram.messenger.g0.L(4.0f);
                            f12 = this.r1;
                            f16 = L6 - (L7 * f12);
                            L2 = L5;
                            f15 = f16;
                            if (this.q1 >= 1.0f) {
                            }
                            canvas.save();
                            float f262 = this.q1 * progress2;
                            canvas.scale(f262, f262, f24, f25);
                            z10 = true;
                            this.r4.set(L - org.telegram.messenger.g0.L(1.0f), f25 - L2, org.telegram.messenger.g0.L(1.0f) + L, L2 + f25);
                            canvas.drawRoundRect(this.r4, org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f), org.telegram.ui.ActionBar.m6.t0);
                            float f272 = f25 - f15;
                            float f282 = f25 + f15;
                            this.r4.set(L - org.telegram.messenger.g0.L(5.0f), f272, L - org.telegram.messenger.g0.L(3.0f), f282);
                            canvas.drawRoundRect(this.r4, org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f), org.telegram.ui.ActionBar.m6.t0);
                            this.r4.set(org.telegram.messenger.g0.L(3.0f) + L, f272, org.telegram.messenger.g0.L(5.0f) + L, f282);
                            canvas.drawRoundRect(this.r4, org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f), org.telegram.ui.ActionBar.m6.t0);
                            if (this.q1 >= 1.0f) {
                            }
                            canvas.restore();
                            if (sc.e(i7)) {
                            }
                            if (this.v2) {
                            }
                            if (this.i0 != 0.0f) {
                            }
                            if (this.w2) {
                            }
                            this.m0 = Utilities.i(this.m0, 1.0f, 0.0f);
                            return z11;
                        }
                        L5 = org.telegram.messenger.g0.L(5.0f) - (org.telegram.messenger.g0.L(4.0f) * this.r1);
                        L8 = org.telegram.messenger.g0.L(1.0f);
                        L9 = org.telegram.messenger.g0.L(4.0f);
                        f13 = this.r1;
                        f16 = L8 + (L9 * f13);
                        L2 = L5;
                        f15 = f16;
                        if (this.q1 >= 1.0f) {
                        }
                        canvas.save();
                        float f2622 = this.q1 * progress2;
                        canvas.scale(f2622, f2622, f24, f25);
                        z10 = true;
                        this.r4.set(L - org.telegram.messenger.g0.L(1.0f), f25 - L2, org.telegram.messenger.g0.L(1.0f) + L, L2 + f25);
                        canvas.drawRoundRect(this.r4, org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f), org.telegram.ui.ActionBar.m6.t0);
                        float f2722 = f25 - f15;
                        float f2822 = f25 + f15;
                        this.r4.set(L - org.telegram.messenger.g0.L(5.0f), f2722, L - org.telegram.messenger.g0.L(3.0f), f2822);
                        canvas.drawRoundRect(this.r4, org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f), org.telegram.ui.ActionBar.m6.t0);
                        this.r4.set(org.telegram.messenger.g0.L(3.0f) + L, f2722, org.telegram.messenger.g0.L(5.0f) + L, f2822);
                        canvas.drawRoundRect(this.r4, org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f), org.telegram.ui.ActionBar.m6.t0);
                        if (this.q1 >= 1.0f) {
                        }
                        canvas.restore();
                        if (sc.e(i7)) {
                        }
                        if (this.v2) {
                        }
                        if (this.i0 != 0.0f) {
                        }
                        if (this.w2) {
                        }
                        this.m0 = Utilities.i(this.m0, 1.0f, 0.0f);
                        return z11;
                    }
                    i7 = 360928;
                    L2 = (org.telegram.messenger.g0.L(4.0f) * this.r1) + org.telegram.messenger.g0.L(1.0f);
                    L10 = org.telegram.messenger.g0.L(3.0f);
                    L11 = org.telegram.messenger.g0.L(2.0f);
                    f14 = this.r1;
                    f15 = L10 - (L11 * f14);
                    if (this.q1 >= 1.0f) {
                    }
                    canvas.save();
                    float f26222 = this.q1 * progress2;
                    canvas.scale(f26222, f26222, f24, f25);
                    z10 = true;
                    this.r4.set(L - org.telegram.messenger.g0.L(1.0f), f25 - L2, org.telegram.messenger.g0.L(1.0f) + L, L2 + f25);
                    canvas.drawRoundRect(this.r4, org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f), org.telegram.ui.ActionBar.m6.t0);
                    float f27222 = f25 - f15;
                    float f28222 = f25 + f15;
                    this.r4.set(L - org.telegram.messenger.g0.L(5.0f), f27222, L - org.telegram.messenger.g0.L(3.0f), f28222);
                    canvas.drawRoundRect(this.r4, org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f), org.telegram.ui.ActionBar.m6.t0);
                    this.r4.set(org.telegram.messenger.g0.L(3.0f) + L, f27222, org.telegram.messenger.g0.L(5.0f) + L, f28222);
                    canvas.drawRoundRect(this.r4, org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f), org.telegram.ui.ActionBar.m6.t0);
                    if (this.q1 >= 1.0f) {
                    }
                    canvas.restore();
                    if (sc.e(i7)) {
                    }
                    if (this.v2) {
                    }
                    if (this.i0 != 0.0f) {
                    }
                    if (this.w2) {
                    }
                    this.m0 = Utilities.i(this.m0, 1.0f, 0.0f);
                    return z11;
                }
            }
        } else {
            boolean X = X();
            this.B0 = X;
            if (X || this.p1 != 0.0f) {
                int L16 = (int) (this.u0.F.bottom - org.telegram.messenger.g0.L((this.r2 || iz.p1) ? 6.0f : 8.0f));
                if (id.a0) {
                    float f36 = this.u0.F.left;
                    if (!this.r2 && !iz.p1) {
                        f17 = 6.0f;
                    }
                    L12 = f36 + org.telegram.messenger.g0.L(f17);
                } else {
                    float f37 = this.u0.F.right;
                    if (!this.r2 && !iz.p1) {
                        f17 = 6.0f;
                    }
                    L12 = f37 - org.telegram.messenger.g0.L(f17);
                }
                int i20 = (int) L12;
                org.telegram.ui.ActionBar.m6.t0.setColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.d6, this.J4));
                float f38 = i20;
                float f39 = L16;
                canvas.drawCircle(f38, f39, org.telegram.messenger.g0.L(7.0f) * this.p1, org.telegram.ui.ActionBar.m6.t0);
                org.telegram.ui.ActionBar.m6.t0.setColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.T8, this.J4));
                canvas.drawCircle(f38, f39, org.telegram.messenger.g0.L(5.0f) * this.p1, org.telegram.ui.ActionBar.m6.t0);
                if (X) {
                    float f40 = this.p1;
                    if (f40 < 1.0f) {
                        float f41 = f40 + 0.10666667f;
                        this.p1 = f41;
                        if (f41 > 1.0f) {
                            this.p1 = 1.0f;
                        }
                        z12 = true;
                    }
                } else {
                    float f42 = this.p1;
                    if (f42 > 0.0f) {
                        float f43 = f42 - 0.10666667f;
                        this.p1 = f43;
                        if (f43 < 0.0f) {
                            this.p1 = 0.0f;
                        }
                        z12 = true;
                    }
                }
            }
        }
        f10 = 0.10666667f;
        z10 = true;
        if (this.w2) {
        }
        this.m0 = Utilities.i(this.m0, 1.0f, 0.0f);
        return z11;
    }

    public final void H(Canvas canvas, boolean z9, boolean z10, boolean z11, boolean z12, float f10) {
        if (f10 != 0.0f || z12) {
            float f11 = (f10 * 0.5f) + 0.5f;
            if (z9) {
                z.s(this.V2, this.W2, org.telegram.ui.ActionBar.m6.X0);
                if (f10 != 1.0f) {
                    canvas.save();
                    canvas.scale(f11, f11, org.telegram.ui.ActionBar.m6.X0.getBounds().centerX(), org.telegram.ui.ActionBar.m6.W0.getBounds().centerY());
                    org.telegram.ui.ActionBar.m6.X0.setAlpha((int) (f10 * 255.0f));
                }
                org.telegram.ui.ActionBar.m6.X0.draw(canvas);
                if (f10 != 1.0f) {
                    canvas.restore();
                    org.telegram.ui.ActionBar.m6.X0.setAlpha(qs.e4);
                }
                invalidate();
                return;
            }
            if (z11) {
                if (!z10) {
                    z.s(this.U2, this.W2, org.telegram.ui.ActionBar.m6.T0);
                    if (f10 != 1.0f) {
                        canvas.save();
                        canvas.scale(f11, f11, org.telegram.ui.ActionBar.m6.T0.getBounds().centerX(), org.telegram.ui.ActionBar.m6.W0.getBounds().centerY());
                        org.telegram.ui.ActionBar.m6.T0.setAlpha((int) (f10 * 255.0f));
                    }
                    org.telegram.ui.ActionBar.m6.T0.draw(canvas);
                    if (f10 != 1.0f) {
                        canvas.restore();
                        org.telegram.ui.ActionBar.m6.T0.setAlpha(qs.e4);
                        return;
                    }
                    return;
                }
                z.s(this.X2, this.W2, org.telegram.ui.ActionBar.m6.W0);
                if (z12) {
                    canvas.save();
                    canvas.scale(f11, f11, org.telegram.ui.ActionBar.m6.W0.getBounds().centerX(), org.telegram.ui.ActionBar.m6.W0.getBounds().centerY());
                    org.telegram.ui.ActionBar.m6.W0.setAlpha((int) (f10 * 255.0f));
                }
                if (!z12 && f10 != 0.0f) {
                    canvas.save();
                    canvas.scale(f11, f11, org.telegram.ui.ActionBar.m6.W0.getBounds().centerX(), org.telegram.ui.ActionBar.m6.W0.getBounds().centerY());
                    int i7 = (int) (255.0f * f10);
                    org.telegram.ui.ActionBar.m6.W0.setAlpha(i7);
                    org.telegram.ui.ActionBar.m6.V0.setAlpha(i7);
                }
                org.telegram.ui.ActionBar.m6.W0.draw(canvas);
                if (z12) {
                    canvas.restore();
                    canvas.save();
                    canvas.translate((1.0f - f10) * org.telegram.messenger.g0.L(4.0f), 0.0f);
                }
                z.s(this.T2, this.W2, org.telegram.ui.ActionBar.m6.V0);
                org.telegram.ui.ActionBar.m6.V0.draw(canvas);
                if (z12) {
                    canvas.restore();
                    org.telegram.ui.ActionBar.m6.W0.setAlpha(qs.e4);
                }
                if (z12 || f10 == 0.0f) {
                    return;
                }
                canvas.restore();
                org.telegram.ui.ActionBar.m6.W0.setAlpha(qs.e4);
                org.telegram.ui.ActionBar.m6.V0.setAlpha(qs.e4);
            }
        }
    }

    public final void I(Canvas canvas, boolean z9, int i7, int i10, int i11, float f10, boolean z10) {
        float f11;
        Paint paint;
        boolean z11;
        RectF rectF;
        RectF rectF2;
        boolean z12 = W() || V();
        if (!(this.G3 && this.L3) && this.V3 == 1.0f) {
            return;
        }
        float f12 = (this.S0 != 0 || this.T0) ? this.V3 : 1.0f - this.V3;
        int i12 = qs.e4;
        if (z10) {
            if (this.T == null) {
                Paint paint2 = new Paint();
                this.T = paint2;
                paint2.setStyle(Paint.Style.STROKE);
                this.T.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
                this.T.setStrokeJoin(Paint.Join.ROUND);
                this.T.setStrokeCap(Paint.Cap.ROUND);
            }
            f11 = 1.0f;
            this.T.setColor(i0.a.f(Color.alpha(r14) / 255.0f, org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.d6, false), i0.a.o(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.s9, false), qs.e4)));
        } else {
            f11 = 1.0f;
        }
        if (this.P && this.N.read_inbox_max_id == 0) {
            if (this.S == null) {
                this.S = new Paint();
            }
            paint = this.S;
            int w02 = org.telegram.ui.ActionBar.m6.w0(z9 ? org.telegram.ui.ActionBar.m6.Sk : org.telegram.ui.ActionBar.m6.Rk, this.J4);
            paint.setColor(w02);
            org.telegram.ui.ActionBar.m6.M0.setColor(w02);
            i12 = z9 ? 30 : 40;
            z11 = true;
        } else {
            paint = (z9 || this.J0 != 0) ? org.telegram.ui.ActionBar.m6.y0 : org.telegram.ui.ActionBar.m6.w0;
            z11 = false;
        }
        StaticLayout staticLayout = this.Y3;
        RectF rectF3 = this.r4;
        if (staticLayout == null || this.S0 == 0) {
            if (this.S0 != 0) {
                staticLayout = this.X3;
            }
            paint.setAlpha((int) ((f11 - this.x3) * i12));
            org.telegram.ui.ActionBar.m6.M0.setAlpha((int) ((f11 - this.x3) * 255.0f));
            float f13 = i7;
            rectF3.set(i10, f13, org.telegram.messenger.g0.L(12.666f) + this.O3 + i10, org.telegram.messenger.g0.L(20.666f) + i7);
            int save = canvas.save();
            if (f10 != f11) {
                canvas.scale(f10, f10, rectF3.centerX(), rectF3.centerY());
            }
            if (f12 != f11) {
                canvas.scale(f12, f12, rectF3.centerX(), rectF3.centerY());
            }
            if (z12) {
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
                    c8.fa.a(this.t4, this.u4, org.telegram.messenger.g0.L(10.33f));
                }
                canvas.drawPath(this.t4, paint);
                if (z10) {
                    canvas.drawPath(this.t4, this.T);
                }
            } else {
                canvas.drawRoundRect(rectF3, org.telegram.messenger.g0.L(11.5f), org.telegram.messenger.g0.L(11.5f), paint);
                if (z10) {
                    canvas.drawRoundRect(rectF3, org.telegram.messenger.g0.L(11.5f), org.telegram.messenger.g0.L(11.5f), this.T);
                }
            }
            if (staticLayout != null) {
                canvas.save();
                canvas.translate(org.telegram.messenger.g0.L(6.333f) + i10, org.telegram.messenger.g0.N(3.0f) + f13);
                staticLayout.draw(canvas);
                canvas.restore();
            }
            canvas.restoreToCount(save);
        } else {
            paint.setAlpha((int) ((f11 - this.x3) * i12));
            org.telegram.ui.ActionBar.m6.M0.setAlpha((int) ((f11 - this.x3) * 255.0f));
            float f14 = f12 * 2.0f;
            float f15 = f14 > f11 ? f11 : f14;
            float f16 = f11 - f15;
            float f17 = (i11 * f16) + (i10 * f15);
            float f18 = i7;
            rectF3.set(f17, f18, (this.P3 * f16) + (this.O3 * f15) + f17 + org.telegram.messenger.g0.L(12.666f), org.telegram.messenger.g0.L(20.666f) + i7);
            float interpolation = ((f12 <= 0.5f ? wq.g.getInterpolation(f14) : wq.i.getInterpolation(f11 - ((f12 - 0.5f) * 2.0f))) * 0.1f) + f11;
            canvas.save();
            float f19 = interpolation * f10;
            canvas.scale(f19, f19, rectF3.centerX(), rectF3.centerY());
            if (z12) {
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
                    c8.fa.a(this.t4, this.u4, org.telegram.messenger.g0.L(10.33f));
                }
                canvas.drawPath(this.t4, paint);
                if (z10) {
                    canvas.drawPath(this.t4, this.T);
                }
            } else {
                canvas.drawRoundRect(rectF3, org.telegram.messenger.g0.L(11.5f), org.telegram.messenger.g0.L(11.5f), paint);
                if (z10) {
                    canvas.drawRoundRect(rectF3, org.telegram.messenger.g0.L(11.5f), org.telegram.messenger.g0.L(11.5f), this.T);
                }
            }
            if (this.Z3 != null) {
                canvas.save();
                canvas.translate(org.telegram.messenger.g0.N(6.333f) + f17, org.telegram.messenger.g0.N(3.0f) + f18);
                this.Z3.draw(canvas);
                canvas.restore();
            }
            int alpha = org.telegram.ui.ActionBar.m6.M0.getAlpha();
            float f20 = alpha;
            org.telegram.ui.ActionBar.m6.M0.setAlpha((int) (f20 * f15));
            if (this.a4 != null) {
                canvas.save();
                canvas.translate(org.telegram.messenger.g0.N(6.333f) + f17, org.telegram.messenger.g0.N(3.0f) + ((this.R3 ? org.telegram.messenger.g0.L(17.0f) : -org.telegram.messenger.g0.L(17.0f)) * f16) + f18);
                this.a4.draw(canvas);
                canvas.restore();
            } else if (this.X3 != null) {
                canvas.save();
                canvas.translate(org.telegram.messenger.g0.N(6.333f) + f17, org.telegram.messenger.g0.N(3.0f) + ((this.R3 ? org.telegram.messenger.g0.L(17.0f) : -org.telegram.messenger.g0.L(17.0f)) * f16) + f18);
                this.X3.draw(canvas);
                canvas.restore();
            }
            if (this.Y3 != null) {
                org.telegram.ui.ActionBar.m6.M0.setAlpha((int) (f20 * f16));
                canvas.save();
                canvas.translate(org.telegram.messenger.g0.N(6.333f) + f17, org.telegram.messenger.g0.N(3.0f) + ((this.R3 ? -org.telegram.messenger.g0.L(17.0f) : org.telegram.messenger.g0.L(17.0f)) * f15) + f18);
                this.Y3.draw(canvas);
                canvas.restore();
            }
            org.telegram.ui.ActionBar.m6.M0.setAlpha(alpha);
            canvas.restore();
        }
        if (z11) {
            org.telegram.ui.ActionBar.m6.M0.setColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.W8, false));
        }
    }

    public boolean J() {
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
    public final CharSequence K() {
        TLRPC.Chat M0;
        TLRPC.User user;
        TLRPC.User a22;
        String M02;
        int i7 = this.F0;
        qp s12 = qp.s1(i7);
        ArrayList W0 = s12.W0(this.J0);
        this.M0 = W0.size();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int size = W0.size();
        for (int i10 = 0; i10 < size; i10++) {
            TLRPC.Dialog dialog = (TLRPC.Dialog) W0.get(i10);
            if (!s12.w2(dialog.id)) {
                if (!org.telegram.messenger.m5.C(dialog.id)) {
                    if (!org.telegram.messenger.m5.E(dialog.id)) {
                        M0 = s12.M0(Long.valueOf(-dialog.id));
                        user = null;
                        if (M0 == null) {
                            M02 = M0.title.replace('\n', ' ');
                        } else if (user == null) {
                            continue;
                        } else {
                            M02 = t10.x(user) ? id.M0(2131749328, null) : org.telegram.messenger.g0.U(org.telegram.messenger.g5.m(0, user.first_name, user.last_name).replace('\n', ' '));
                        }
                        if (spannableStringBuilder.length() > 0) {
                            spannableStringBuilder.append((CharSequence) ", ");
                        }
                        int length = spannableStringBuilder.length();
                        int length2 = M02.length() + length;
                        spannableStringBuilder.append((CharSequence) M02);
                        if (dialog.unread_count > 0) {
                            spannableStringBuilder.setSpan(new u31(org.telegram.messenger.g0.o(), org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Y8, this.J4)), length, length2, 33);
                        }
                        if (spannableStringBuilder.length() <= 150) {
                            break;
                        }
                    } else {
                        a22 = s12.a2(Long.valueOf(dialog.id));
                    }
                } else {
                    TLRPC.EncryptedChat a12 = s12.a1(Integer.valueOf((int) (dialog.id & 4294967295L)));
                    a22 = a12 != null ? s12.a2(Long.valueOf(a12.user_id)) : null;
                }
                user = a22;
                M0 = null;
                if (M0 == null) {
                }
                if (spannableStringBuilder.length() > 0) {
                }
                int length3 = spannableStringBuilder.length();
                int length22 = M02.length() + length3;
                spannableStringBuilder.append((CharSequence) M02);
                if (dialog.unread_count > 0) {
                }
                if (spannableStringBuilder.length() <= 150) {
                }
            }
        }
        if (qp.s1(i7).h0.D(true) > 0) {
            int max = Math.max(1, qp.s1(i7).h0.D(true));
            if (spannableStringBuilder.length() > 0) {
                spannableStringBuilder.append((CharSequence) ", ");
            }
            spannableStringBuilder.append((CharSequence) id.G(max, "Stories", new Object[0]));
        }
        return org.telegram.messenger.i6.m(spannableStringBuilder, org.telegram.ui.ActionBar.m6.F0[this.E0].getFontMetricsInt(), false, null, 0);
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
    public final CharSequence L() {
        TLRPC.Chat M0;
        TLRPC.User user;
        TLRPC.User a22;
        String M02;
        qp s12 = qp.s1(this.F0);
        ArrayList arrayList = (ArrayList) s12.x.f(-this.H0);
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            TLRPC.Dialog dialog = (TLRPC.Dialog) arrayList.get(i7);
            if (!s12.w2(dialog.id)) {
                if (!org.telegram.messenger.m5.C(dialog.id)) {
                    if (!org.telegram.messenger.m5.E(dialog.id)) {
                        M0 = s12.M0(Long.valueOf(-dialog.id));
                        user = null;
                        if (M0 == null) {
                            M02 = M0.title.replace('\n', ' ');
                        } else if (user == null) {
                            continue;
                        } else {
                            M02 = t10.x(user) ? id.M0(2131749328, null) : org.telegram.messenger.g0.U(org.telegram.messenger.g5.m(0, user.first_name, user.last_name).replace('\n', ' '));
                        }
                        if (spannableStringBuilder.length() > 0) {
                            spannableStringBuilder.append((CharSequence) ", ");
                        }
                        int length = spannableStringBuilder.length();
                        int length2 = M02.length() + length;
                        spannableStringBuilder.append((CharSequence) M02);
                        if (dialog.unread_count > 0) {
                            spannableStringBuilder.setSpan(new u31(org.telegram.messenger.g0.o(), org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Y8, this.J4)), length, length2, 33);
                        }
                        if (spannableStringBuilder.length() <= 150) {
                            break;
                        }
                    } else {
                        a22 = s12.a2(Long.valueOf(dialog.id));
                    }
                } else {
                    TLRPC.EncryptedChat a12 = s12.a1(Integer.valueOf((int) (dialog.id & 4294967295L)));
                    a22 = a12 != null ? s12.a2(Long.valueOf(a12.user_id)) : null;
                }
                user = a22;
                M0 = null;
                if (M0 == null) {
                }
                if (spannableStringBuilder.length() > 0) {
                }
                int length3 = spannableStringBuilder.length();
                int length22 = M02.length() + length3;
                spannableStringBuilder.append((CharSequence) M02);
                if (dialog.unread_count > 0) {
                }
                if (spannableStringBuilder.length() <= 150) {
                }
            }
        }
        return org.telegram.messenger.i6.m(spannableStringBuilder, org.telegram.ui.ActionBar.m6.F0[this.E0].getFontMetricsInt(), false, null, 0);
    }

    public final CharSequence P() {
        if (this.N4 == null) {
            this.N4 = new s2(this);
        }
        s2.a(this.N4, this.F0, this.f1, this.g2);
        this.N4.getClass();
        s2 s2Var = this.N4;
        this.M4 = s2Var.c;
        this.f0 = s2Var.d;
        return s2Var.g;
    }

    public final ColorFilter Q(int i7, int i10) {
        if (this.X4 == null) {
            this.Y4 = new int[4];
            this.X4 = new ColorFilter[4];
        }
        if (i10 != this.Y4[i7] || this.X4[i7] == null) {
            ColorFilter[] colorFilterArr = this.X4;
            this.Y4[i7] = i10;
            colorFilterArr[i7] = new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN);
        }
        return this.X4[i7];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0, types: [android.view.View, org.telegram.ui.Cells.t2] */
    /* JADX WARN: Type inference failed for: r3v6, types: [android.text.Spannable, android.text.SpannableString, java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.CharSequence] */
    public final SpannableStringBuilder R(int i7, CharSequence charSequence, String str, boolean z9) {
        CharSequence N2;
        TLRPC.Message message;
        CharSequence charSequence2;
        String G;
        CharSequence charSequence3;
        SpannableStringBuilder valueOf;
        ij captionMessage = getCaptionMessage();
        ij ijVar = this.f1;
        CharSequence charSequence4 = ijVar != null ? ijVar.v : null;
        this.e0 = true;
        if (!TextUtils.isEmpty(str)) {
            return N(i7, str, charSequence);
        }
        ij ijVar2 = this.f1;
        TLRPC.Message message2 = ijVar2.k;
        if (message2 instanceof TLRPC.TL_messageService) {
            CharSequence charSequence5 = ijVar2.w;
            if (charSequence5 == null || ((message2.action instanceof TLRPC.TL_messageActionTopicCreate) && this.P)) {
                charSequence5 = ijVar2.v;
            }
            if (ij.E4(ijVar2)) {
                valueOf = N(i7, charSequence5, charSequence);
                if (this.f1.g2[0] instanceof qg.a) {
                    int i10 = this.F0;
                    TLRPC.TL_forumTopic f10 = qp.s1(i10).q7.f(-ij.B0(this.f1.k), ij.b2(i10, this.f1.k, true, false));
                    if (f10 != null) {
                        ((qg.a) this.f1.g2[0]).b(f10.icon_color);
                    }
                }
            } else {
                this.e0 = false;
                valueOf = SpannableStringBuilder.valueOf(charSequence5);
            }
            if (z9) {
                w(valueOf);
            }
            return valueOf;
        }
        if (captionMessage != null && (charSequence3 = captionMessage.z) != null) {
            String charSequence6 = charSequence3.toString();
            String str2 = !this.V ? "" : ij.L4(captionMessage.k) ? "📹 " : ij.R4(captionMessage.k) ? "🎤 " : captionMessage.I3() ? "🎧 " : ij.S3(captionMessage.k) ? "🖼 " : "📎 ";
            if (captionMessage.r2() && !TextUtils.isEmpty(captionMessage.k.message)) {
                CharSequence charSequence7 = captionMessage.a2;
                int measuredWidth = getMeasuredWidth() - org.telegram.messenger.g0.L(this.I + 47);
                if (this.W) {
                    if (!TextUtils.isEmpty(charSequence)) {
                        measuredWidth = (int) (measuredWidth - this.a0.measureText(charSequence.toString()));
                    }
                    measuredWidth = (int) (measuredWidth - this.a0.measureText(": "));
                }
                if (measuredWidth > 0 && captionMessage.Z1) {
                    charSequence7 = org.telegram.messenger.g0.Q(charSequence7, (String) captionMessage.Y1.get(0), measuredWidth, this.a0);
                }
                return new SpannableStringBuilder(str2).append(charSequence7);
            }
            int length = charSequence6.length();
            CharSequence charSequence8 = charSequence6;
            if (length > 150) {
                charSequence8 = charSequence6.subSequence(0, qs.g2);
            }
            SpannableString spannableString = new SpannableString(charSequence8);
            captionMessage.U5();
            ui.g(captionMessage.k.entities, charSequence8, spannableString, qs.n4);
            TLRPC.Message message3 = captionMessage.k;
            if (message3 != null) {
                ArrayList<TLRPC.MessageEntity> arrayList = message3.entities;
                TextPaint textPaint = this.a0;
                ui.a(textPaint != null ? textPaint.getFontMetricsInt() : null, spannableString, arrayList);
            }
            CharSequence append = new SpannableStringBuilder(str2).append(org.telegram.messenger.g0.N2(spannableString));
            if (z9) {
                append = w(append);
            }
            return N(i7, append, charSequence);
        }
        TL_iv.RichMessage richMessage = message2.rich_message;
        org.telegram.ui.ActionBar.h6 h6Var = this.J4;
        if (richMessage != null) {
            boolean O2 = richMessage.blocks.size() == 1 ? ij.O2(this.f1.k.rich_message.blocks.get(0)) : false;
            SpannableStringBuilder N = N(i7, this.f1.v, charSequence);
            if (O2 && !W()) {
                try {
                    N.setSpan(new xz(org.telegram.ui.ActionBar.m6.p9, h6Var), this.W ? charSequence.length() + 2 : 0, N.length(), 33);
                    return N;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
            }
            return N;
        }
        if (message2.media == null || ijVar2.F3()) {
            ij ijVar3 = this.f1;
            String str3 = ijVar3.k.message;
            if (str3 == null) {
                return new SpannableStringBuilder();
            }
            if (ijVar3.r2()) {
                CharSequence charSequence9 = this.f1.a2;
                N2 = str3;
                if (charSequence9 != null) {
                    N2 = charSequence9;
                }
                int measuredWidth2 = getMeasuredWidth() - org.telegram.messenger.g0.L(this.I + 33);
                if (this.W) {
                    if (!TextUtils.isEmpty(charSequence)) {
                        measuredWidth2 = (int) (measuredWidth2 - this.a0.measureText(charSequence.toString()));
                    }
                    measuredWidth2 = (int) (measuredWidth2 - this.a0.measureText(": "));
                }
                if (measuredWidth2 > 0) {
                    N2 = org.telegram.messenger.g0.Q(N2, (String) this.f1.Y1.get(0), measuredWidth2, this.a0);
                }
            } else {
                int length2 = str3.length();
                CharSequence charSequence10 = str3;
                if (length2 > 150) {
                    charSequence10 = str3.subSequence(0, qs.g2);
                }
                N2 = org.telegram.messenger.g0.N2(charSequence10);
            }
            ?? spannableString2 = new SpannableString(N2);
            ij ijVar4 = this.f1;
            if (ijVar4 != null) {
                ijVar4.U5();
            }
            ij ijVar5 = this.f1;
            Pattern pattern = ui.R1;
            ui.g(ijVar5.k.entities, ijVar5.v, spannableString2, qs.n4);
            ij ijVar6 = this.f1;
            if (ijVar6 != null && (message = ijVar6.k) != null) {
                ArrayList<TLRPC.MessageEntity> arrayList2 = message.entities;
                TextPaint textPaint2 = this.a0;
                ui.a(textPaint2 != null ? textPaint2.getFontMetricsInt() : null, spannableString2, arrayList2);
            }
            if (z9) {
                spannableString2 = w(spannableString2);
            }
            return N(i7, spannableString2, charSequence);
        }
        this.a0 = org.telegram.ui.ActionBar.m6.H0[this.E0];
        int i11 = org.telegram.ui.ActionBar.m6.o9;
        ij ijVar7 = this.f1;
        TLRPC.MessageMedia messageMedia = ijVar7.k.media;
        if (messageMedia instanceof TLRPC.TL_messageMediaPoll) {
            TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) messageMedia;
            TLRPC.TL_textWithEntities tL_textWithEntities = tL_messageMediaPoll.poll.question;
            if (tL_textWithEntities == null || tL_textWithEntities.entities == null) {
                charSequence2 = oh.a.a(R.drawable.dialog_media_poll_20, tL_textWithEntities.text, true);
            } else {
                SpannableString spannableString3 = new SpannableString(tL_messageMediaPoll.poll.question.text.replace('\n', ' '));
                TLRPC.TL_textWithEntities tL_textWithEntities2 = tL_messageMediaPoll.poll.question;
                ui.g(tL_textWithEntities2.entities, tL_textWithEntities2.text, spannableString3, -1);
                ui.a(org.telegram.ui.ActionBar.m6.F0[this.E0].getFontMetricsInt(), spannableString3, tL_messageMediaPoll.poll.question.entities);
                charSequence2 = oh.a.a(R.drawable.dialog_media_poll_20, spannableString3, true);
            }
        } else if (messageMedia instanceof TLRPC.TL_messageMediaToDo) {
            TLRPC.TL_messageMediaToDo tL_messageMediaToDo = (TLRPC.TL_messageMediaToDo) messageMedia;
            TLRPC.TL_textWithEntities tL_textWithEntities3 = tL_messageMediaToDo.todo.title;
            if (tL_textWithEntities3 == null || tL_textWithEntities3.entities == null) {
                charSequence2 = oh.a.a(R.drawable.dialog_media_checklist_20, tL_textWithEntities3.text, true);
            } else {
                SpannableString spannableString4 = new SpannableString(tL_messageMediaToDo.todo.title.text.replace('\n', ' '));
                TLRPC.TL_textWithEntities tL_textWithEntities4 = tL_messageMediaToDo.todo.title;
                ui.g(tL_textWithEntities4.entities, tL_textWithEntities4.text, spannableString4, -1);
                ui.a(org.telegram.ui.ActionBar.m6.F0[this.E0].getFontMetricsInt(), spannableString4, tL_messageMediaToDo.todo.title.entities);
                charSequence2 = oh.a.a(R.drawable.dialog_media_checklist_20, spannableString4, true);
            }
        } else if (messageMedia instanceof TLRPC.TL_messageMediaGame) {
            charSequence2 = oh.a.a(R.drawable.dialog_media_game_20, messageMedia.game.title, true);
        } else if (messageMedia instanceof TLRPC.TL_messageMediaInvoice) {
            charSequence2 = messageMedia.title;
        } else if (ijVar7.D == 14) {
            charSequence2 = f1.m("🎧 \u2068", ijVar7.w1(true), " - ", this.f1.y1(true), "\u2069");
        } else if (messageMedia instanceof TLRPC.TL_messageMediaPaidMedia) {
            int size = ((TLRPC.TL_messageMediaPaidMedia) messageMedia).extended_media.size();
            charSequence2 = dd.T0(id.a0(null, null, 2131753949, this.S1 ? size > 1 ? id.G(size, "Media", new Object[0]) : id.M0(2131753933, null) : size > 1 ? id.G(size, "Photos", new Object[0]) : id.M0(2131753948, null)));
            i11 = org.telegram.ui.ActionBar.m6.p9;
        } else if (this.R1 > 1) {
            if (this.S1) {
                ArrayList arrayList3 = this.g1;
                G = id.G(arrayList3 == null ? 0 : arrayList3.size(), "Media", new Object[0]);
            } else {
                ArrayList arrayList4 = this.g1;
                G = id.G(arrayList4 == null ? 0 : arrayList4.size(), "Photos", new Object[0]);
            }
            charSequence2 = G;
            i11 = org.telegram.ui.ActionBar.m6.p9;
        } else {
            charSequence2 = charSequence4.toString();
            i11 = org.telegram.ui.ActionBar.m6.p9;
        }
        if (charSequence2 instanceof String) {
            charSequence2 = ((String) charSequence2).replace('\n', ' ');
        }
        if (z9) {
            charSequence2 = w(charSequence2);
        }
        SpannableStringBuilder N3 = N(i7, charSequence2, charSequence);
        if (!W()) {
            try {
                N3.setSpan(new xz(i11, h6Var), this.W ? charSequence.length() + 2 : 0, N3.length(), 33);
                return N3;
            } catch (Exception e11) {
                org.telegram.messenger.a8.g(e11, true);
            }
        }
        return N3;
    }

    public final boolean S() {
        ui.e eVar = this.t0;
        return (eVar == null || ((ArrayList) eVar.d).isEmpty()) ? false : true;
    }

    public final boolean T() {
        if (org.telegram.messenger.t3.Y(this.g2)) {
            return !this.e1;
        }
        if (this.P) {
            return this.a1;
        }
        TLRPC.Chat chat = this.g2;
        return (chat != null && chat.forum && this.N == null) ? !this.d1 : this.Z0;
    }

    public final boolean U() {
        return this.J0 > 0;
    }

    public final boolean V() {
        return this.J0 != 0;
    }

    public boolean W() {
        TLRPC.Chat chat;
        if (U() || this.P0 || (chat = this.g2) == null) {
            return false;
        }
        if (!chat.forum) {
            if (!org.telegram.messenger.t3.p0(chat)) {
                return false;
            }
            if (!org.telegram.messenger.t3.A(this.F0, this.g2, 24)) {
                return false;
            }
        }
        return !this.P;
    }

    public final boolean X() {
        TLRPC.User user;
        if (W() || this.u0.w || (user = this.f2) == null || user.self) {
            return false;
        }
        TLRPC.UserStatus userStatus = user.status;
        int i7 = this.F0;
        if (userStatus != null && userStatus.expires <= 0 && qp.s1(i7).Z.containsKey(Long.valueOf(this.f2.id))) {
            return true;
        }
        TLRPC.UserStatus userStatus2 = this.f2.status;
        return userStatus2 != null && userStatus2.expires > ConnectionsManager.getInstance(i7).getCurrentTime();
    }

    public final boolean Z(float f10) {
        return !id.a0 ? f10 >= 0.0f && f10 < ((float) org.telegram.messenger.g0.L(60.0f)) : f10 >= ((float) (getMeasuredWidth() - org.telegram.messenger.g0.L(60.0f))) && f10 < ((float) getMeasuredWidth());
    }

    public final void a0(boolean z9, boolean z10) {
        if ((!getIsPinned() && z9) || this.y3 == z9) {
            if (getIsPinned()) {
                return;
            }
            this.y3 = false;
        } else {
            this.y3 = z9;
            if (z10) {
                this.x3 = z9 ? 0.0f : 1.0f;
            } else {
                this.x3 = z9 ? 1.0f : 0.0f;
            }
            invalidate();
        }
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Y8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.i9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.g9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.o9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.X8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.j9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.p9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.k9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.y6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.d6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.k7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.d9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.c9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Y5));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.s9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Z8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.n9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.m9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.l9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.h9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.z9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Ci));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Gi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.V8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.U8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.zk));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Ak));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.T8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Sk));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Rk));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.W8));
    }

    public final void b0() {
        boolean z9 = iz.q1;
        this.m1 = z9;
        float f10 = z9 ? 0.0f : 1.0f;
        this.D1 = f10;
        this.a2.o = f10;
        this.t1 = 0.0f;
        this.x1 = false;
        this.x3 = (getIsPinned() && this.y3) ? 1.0f : 0.0f;
        this.w3 = true;
        this.o1 = 0.0f;
        setTranslationX(0.0f);
        setTranslationY(0.0f);
        org.telegram.ui.Components.f5 f5Var = this.n4;
        if (f5Var != null && this.w3) {
            f5Var.a();
        }
        org.telegram.ui.Components.f5 f5Var2 = this.o4;
        if (f5Var2 == null || !this.w3) {
            return;
        }
        f5Var2.a();
    }

    public final void c0(boolean z9, boolean z10) {
        fi.a3 a3Var = this.q2;
        if (a3Var != null || z9) {
            if (a3Var == null) {
                fi.a3 a3Var2 = new fi.a3(this, getContext(), this.J4, 1);
                this.q2 = a3Var2;
                a3Var2.b(-1, org.telegram.ui.ActionBar.m6.d6, org.telegram.ui.ActionBar.m6.k7);
                this.q2.setDrawUnchecked(false);
                this.q2.setDrawBackgroundAsArc(3);
                addView(this.q2);
            }
            this.q2.a(z9, z10);
            B();
        }
    }

    public final void d0(long j3, ij ijVar, int i7, boolean z9, boolean z10) {
        if (this.H0 != j3) {
            this.x4 = -1;
        }
        this.H0 = j3;
        this.B4 = System.currentTimeMillis();
        this.f1 = ijVar;
        this.u2 = z9;
        this.N0 = false;
        this.R0 = i7;
        if (ijVar != null) {
            int i10 = ijVar.k.edit_date;
        }
        this.S0 = 0;
        this.T0 = false;
        this.l1 = ijVar != null ? ijVar.e1() : 0;
        this.U0 = 0;
        this.V0 = 0;
        this.W0 = 0;
        this.X0 = ijVar != null && ijVar.F4();
        ij ijVar2 = this.f1;
        if (ijVar2 != null) {
            this.Y0 = ijVar2.k.send_state;
        }
        j0(0, z10);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if ((!this.P && !this.F && motionEvent.getAction() == 1) || motionEvent.getAction() == 3) {
            this.u0.a(this, motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void e0(TLRPC.Dialog dialog, int i7, int i10) {
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
            kg0 kg0Var = this.e2;
            if (kg0Var != null) {
                kg0Var.H = this;
                kg0Var.i();
            }
        } else {
            this.J0 = 0;
        }
        this.j1 = i7;
        boolean z9 = i7 == 3;
        Runnable runnable = this.Z4;
        if (z9 != (runnable != null)) {
            if (!z9 && runnable != null) {
                runnable.run();
                this.Z4 = null;
            } else if (z9) {
                this.Z4 = qs.f(this.F0).h(this, qs.i3, new l2(this, 0));
            }
        }
        if (this.t0 == null) {
            this.t0 = new ui.e(this);
        }
        this.k1 = i10;
        this.l1 = 0;
        if (j0(0, false)) {
            requestLayout();
        }
        A();
        z();
        y();
        B();
    }

    public final void g0(TLRPC.TL_forumTopic tL_forumTopic, long j3, ij ijVar, boolean z9, boolean z10) {
        kg0 kg0Var;
        this.N = tL_forumTopic;
        this.P = tL_forumTopic != null;
        if (this.H0 != j3) {
            this.x4 = -1;
        }
        Drawable drawable = ijVar.g2[0];
        if (drawable instanceof qg.a) {
            ((qg.a) drawable).b(tL_forumTopic.icon_color);
        }
        this.H0 = j3;
        this.B4 = System.currentTimeMillis();
        this.f1 = ijVar;
        this.N0 = false;
        this.g0 = z9;
        this.R0 = ijVar.k.date;
        this.T0 = false;
        this.l1 = ijVar.e1();
        this.X0 = ijVar.F4();
        ij ijVar2 = this.f1;
        if (ijVar2 != null) {
            this.Y0 = ijVar2.k.send_state;
        }
        if (!z10) {
            this.x4 = -1;
        }
        if (tL_forumTopic != null) {
            this.g1 = tL_forumTopic.groupedMessages;
        }
        TLRPC.TL_forumTopic tL_forumTopic2 = this.N;
        if (tL_forumTopic2 != null && tL_forumTopic2.id == 1 && (kg0Var = this.e2) != null) {
            kg0Var.H = this;
            kg0Var.i();
        }
        j0(0, z10);
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

    public ij getMessage() {
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
        TLRPC.Chat M0;
        TLRPC.User user;
        String str;
        TLRPC.Message message;
        TLRPC.MessageFwdHeader messageFwdHeader;
        String str2;
        ij ijVar;
        TLRPC.Message message2;
        TLRPC.User a22;
        ij ijVar2;
        TLRPC.Message message3;
        TLRPC.MessageFwdHeader messageFwdHeader2;
        TLRPC.Message message4;
        TLRPC.MessageFwdHeader messageFwdHeader3;
        TLRPC.MessageFwdHeader messageFwdHeader4;
        ij ijVar3 = this.f1;
        if (ijVar3 != null) {
            long Z0 = ijVar3.Z0();
            int i7 = this.F0;
            long e10 = p10.i(i7).e();
            if (!this.r0 && this.H0 == e10) {
                long P1 = this.f1.P1();
                if (P1 != e10) {
                    if (P1 != 2666000) {
                        TLRPC.Message message5 = this.f1.k;
                        if (message5 != null && (messageFwdHeader4 = message5.fwd_from) != null) {
                            long o4 = org.telegram.messenger.m5.o(messageFwdHeader4.saved_from_id);
                            if (o4 == 0) {
                                o4 = org.telegram.messenger.m5.o(this.f1.k.fwd_from.from_id);
                            }
                            if (o4 > 0) {
                            }
                        }
                        Z0 = P1;
                    }
                }
            }
            if (this.r0 && (message4 = this.f1.k) != null && (messageFwdHeader3 = message4.fwd_from) != null) {
                Z0 = org.telegram.messenger.m5.o(messageFwdHeader3.saved_from_id);
                if (Z0 == 0) {
                    Z0 = org.telegram.messenger.m5.o(this.f1.k.fwd_from.from_id);
                }
            }
            if (org.telegram.messenger.m5.E(Z0)) {
                user = qp.s1(i7).a2(Long.valueOf(Z0));
                M0 = null;
            } else {
                M0 = qp.s1(i7).M0(Long.valueOf(-Z0));
                user = null;
            }
            long j3 = this.H0;
            if (j3 != e10) {
                if (j3 == 489000 && (ijVar2 = this.f1) != null && (message3 = ijVar2.k) != null && (messageFwdHeader2 = message3.fwd_from) != null) {
                    String str3 = messageFwdHeader2.from_name;
                    if (str3 != null) {
                        return org.telegram.messenger.g0.U(str3);
                    }
                    long o10 = org.telegram.messenger.m5.o(messageFwdHeader2.from_id);
                    if (org.telegram.messenger.m5.E(o10)) {
                        return t10.p(qp.s1(i7).a2(Long.valueOf(o10)));
                    }
                    TLRPC.Chat M02 = qp.s1(i7).M0(Long.valueOf(-o10));
                    return M02 == null ? "" : M02.title;
                }
                if (this.f1.P3() && user != null) {
                    return id.M0(2131750503, null);
                }
                if (!this.r0 && (ijVar = this.f1) != null && (message2 = ijVar.k) != null && (message2.from_id instanceof TLRPC.TL_peerUser) && (a22 = qp.s1(i7).a2(Long.valueOf(this.f1.k.from_id.user_id))) != null) {
                    return org.telegram.messenger.g0.U(t10.j(a22, true).replace("\n", ""));
                }
                ij ijVar4 = this.f1;
                return (ijVar4 == null || (message = ijVar4.k) == null || (messageFwdHeader = message.fwd_from) == null || (str2 = messageFwdHeader.from_name) == null) ? user != null ? (this.r2 || iz.p1) ? t10.x(user) ? id.M0(2131749328, null) : org.telegram.messenger.g0.U(org.telegram.messenger.g5.m(0, user.first_name, user.last_name).replace("\n", "")) : org.telegram.messenger.g0.U(t10.j(user, true).replace("\n", "")) : (M0 == null || (str = M0.title) == null) ? "DELETED" : org.telegram.messenger.g0.U(str.replace("\n", "")) : org.telegram.messenger.g0.U(str2);
            }
            if (user != null) {
                return org.telegram.messenger.g0.U(t10.j(user, true).replace("\n", ""));
            }
            if (M0 != null) {
                return org.telegram.messenger.g0.U(M0.title.replace("\n", ""));
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

    public final void h0(int i7, ij ijVar) {
        TLRPC.MessageMedia messageMedia;
        ArrayList<TLRPC.PhotoSize> arrayList = ijVar.n0;
        TLObject tLObject = ijVar.l0;
        if (ijVar.y4()) {
            TL_stories.StoryItem storyItem = ijVar.k.media.storyItem;
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
        TLRPC.PhotoSize Q = org.telegram.messenger.w7.Q(arrayList);
        if (Q == null) {
            Q = org.telegram.messenger.w7.w(arrayList, 40, false, null, false);
        }
        TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(arrayList, org.telegram.messenger.g0.Z0(false), false, null, true);
        TLRPC.PhotoSize photoSize = Q != w10 ? w10 : null;
        if (photoSize == null || !org.telegram.messenger.z5.q(this.F0).d(ijVar)) {
            photoSize = Q;
        }
        if (Q != null) {
            this.S1 = this.S1 || ij.L4(ijVar.k) || ijVar.h4();
            int i10 = this.R1;
            if (i10 < 3) {
                this.R1 = i10 + 1;
                this.W1[i7] = (ij.L4(ijVar.k) || ijVar.h4()) && !ijVar.t2();
                this.X1[i7] = ijVar.t2();
                int i11 = (ijVar.D != 1 || photoSize == null) ? 0 : photoSize.size;
                String str = ijVar.t2() ? "5_5_b" : "20_20";
                ImageReceiver[] imageReceiverArr = this.V1;
                imageReceiverArr[i7].r0(org.telegram.messenger.hc.f(photoSize, tLObject), str, org.telegram.messenger.hc.f(Q, tLObject), str, null, i11, null, ijVar, 0);
                imageReceiverArr[i7].J0(org.telegram.messenger.g0.L(ijVar.h4() ? 18.0f : 2.0f));
                this.V = false;
            }
        }
    }

    public final void i0() {
        kg0 kg0Var = this.e2;
        if (kg0Var != null) {
            if (this.P) {
                kg0Var.K = org.telegram.messenger.g0.L(24.0f);
                this.e2.L = org.telegram.messenger.g0.L(24.0f);
                this.e2.M = 0.0f;
            } else {
                m2 m2Var = this.u0;
                RectF rectF = m2Var.F;
                RectF rectF2 = m2Var.F;
                kg0Var.K = rectF.centerY();
                this.e2.L = rectF2.centerX();
                this.e2.M = rectF2.width() / 2.0f;
                if (!qp.s1(this.F0).P1().h.isEmpty()) {
                    this.e2.M -= org.telegram.messenger.g0.N(3.5f);
                }
                kg0 kg0Var2 = this.e2;
                this.Y1.q();
                kg0Var2.getClass();
            }
            kg0 kg0Var3 = this.e2;
            if (kg0Var3.E || kg0Var3.I == null) {
                return;
            }
            AnimatorSet animatorSet = kg0Var3.B;
            if (animatorSet != null) {
                animatorSet.removeAllListeners();
                kg0Var3.B.cancel();
            }
            kg0Var3.E = true;
            kg0Var3.F = true;
            kg0Var3.D = 0.0f;
            kg0Var3.I.getTranslationY();
            org.telegram.messenger.g0.L(100.0f);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addUpdateListener(new jg0(kg0Var3, 5));
            ofFloat.setInterpolator(wq.h);
            ofFloat.setDuration(250L);
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat2.addUpdateListener(new jg0(kg0Var3, 6));
            wq wqVar = wq.j;
            ofFloat2.setInterpolator(wqVar);
            ofFloat2.setDuration(150L);
            ValueAnimator ofFloat3 = ValueAnimator.ofFloat(1.0f, 0.0f);
            ofFloat3.addUpdateListener(new jg0(kg0Var3, 7));
            ofFloat3.setInterpolator(wqVar);
            ofFloat3.setDuration(135L);
            AnimatorSet animatorSet2 = new AnimatorSet();
            kg0Var3.B = animatorSet2;
            animatorSet2.addListener(new e60(kg0Var3, 11));
            AnimatorSet animatorSet3 = new AnimatorSet();
            animatorSet3.playSequentially(ofFloat2, ofFloat3);
            animatorSet3.setStartDelay(180L);
            kg0Var3.B.playTogether(ofFloat, animatorSet3);
            kg0Var3.B.start();
        }
    }

    @Override // org.telegram.ui.Cells.z, android.view.View, org.telegram.ui.Cells.q9
    public final void invalidate() {
        if (di.q9.w1) {
            return;
        }
        super.invalidate();
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        if (drawable == this.y1 || drawable == org.telegram.ui.ActionBar.m6.u1) {
            invalidate(drawable.getBounds());
        } else {
            super.invalidateDrawable(drawable);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:252:0x0539, code lost:
    
        if (org.telegram.messenger.t3.A(r8, r5, 24) != false) goto L283;
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
    public final boolean j0(int i7, boolean z9) {
        boolean z10;
        int i10;
        org.telegram.ui.Components.v8 v8Var;
        int i11;
        boolean z11;
        boolean z12;
        int i12;
        ImageReceiver imageReceiver;
        boolean z13;
        boolean z14;
        boolean z15;
        int i13;
        boolean z16;
        int i14;
        long j3;
        ImageReceiver imageReceiver2;
        int i15;
        ij ijVar;
        boolean z17;
        boolean z18;
        float f10;
        boolean z19;
        int L;
        TLRPC.User user;
        TLRPC.Chat chat;
        int i16;
        TLRPC.Chat M0;
        ArrayList d42;
        ij ijVar2;
        ij ijVar3;
        boolean z20;
        ij ijVar4;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        HashMap hashMap;
        ij ijVar5;
        boolean z21;
        long j10;
        boolean z22;
        int i23;
        vo voVar;
        int i24;
        vo voVar2;
        lr lrVar;
        vo voVar3;
        String str;
        ij ijVar6;
        int i25;
        ij ijVar7;
        ImageReceiver imageReceiver3;
        boolean W = W();
        boolean z23 = false;
        this.l0 = 0;
        o2 o2Var = this.G0;
        ImageReceiver imageReceiver4 = this.Y1;
        org.telegram.ui.Components.v8 v8Var2 = this.a2;
        int i26 = this.F0;
        if (o2Var != null) {
            this.R0 = o2Var.h;
            int i27 = o2Var.d;
            this.X0 = i27 != 0;
            this.S0 = i27;
            this.A3 = o2Var.e;
            this.Z0 = o2Var.f;
            this.d1 = false;
            this.e1 = false;
            v8Var2.k(o2Var.c, o2Var.a, null, null);
            if (this.F) {
                imageReceiver3 = imageReceiver4;
                imageReceiver3.o0(null, "50_50", this.G, null, 0L);
            } else {
                imageReceiver3 = imageReceiver4;
                imageReceiver3.o0(null, "50_50", v8Var2, null, 0L);
            }
            int i28 = 0;
            while (true) {
                ImageReceiver[] imageReceiverArr = this.V1;
                if (i28 >= imageReceiverArr.length) {
                    break;
                }
                imageReceiverArr[i28].w0(null);
                i28++;
            }
            this.D = false;
            this.E = false;
            imageReceiver3.J0(org.telegram.messenger.g0.L(26.0f));
            this.b1 = false;
            i13 = i26;
            z11 = W;
            z15 = false;
            z16 = false;
            f10 = 0.0f;
        } else {
            ImageReceiver imageReceiver5 = imageReceiver4;
            int i29 = this.S0;
            boolean z24 = this.V0 != 0;
            boolean z25 = this.T0;
            this.d1 = false;
            this.e1 = false;
            this.H4 = -1;
            boolean z26 = this.N0;
            int[] iArr = k00.n;
            if (z26) {
                boolean z27 = true;
                v8Var = v8Var2;
                i11 = 2;
                TLRPC.Dialog dialog = (TLRPC.Dialog) qp.s1(i26).Q.f(this.H0);
                if (dialog != null) {
                    this.H4 = dialog.read_outbox_max_id;
                    this.l0 = dialog.ttl_period;
                    if (i7 == 0) {
                        this.h1 = qp.s1(i26).E0.f(dialog.id) != null;
                        ArrayList arrayList = (ArrayList) qp.s1(i26).R.f(dialog.id);
                        this.g1 = arrayList;
                        ij ijVar8 = (arrayList == null || arrayList.size() <= 0) ? null : (ij) this.g1.get(0);
                        this.f1 = ijVar8;
                        this.X0 = ijVar8 != null && ijVar8.F4();
                        TLRPC.Chat M02 = qp.s1(i26).M0(Long.valueOf(-dialog.id));
                        if (M02 == null || !(M02.forum || (M02.monoforum && org.telegram.messenger.t3.A(i26, M02, 24)))) {
                            i10 = i26;
                            if (dialog instanceof TLRPC.TL_dialogFolder) {
                                this.S0 = yr.a0(i10).L;
                                this.U0 = 0;
                                this.V0 = 0;
                                this.W0 = 0;
                            } else {
                                if (dialog instanceof TLRPC.TL_dialogCommunity) {
                                    imageReceiver5 = imageReceiver5;
                                    np Q0 = qp.s1(i10).Q0(-dialog.id);
                                    this.S0 = Q0.a;
                                    this.U0 = Q0.b;
                                    this.V0 = Q0.c;
                                    this.W0 = Q0.d;
                                    this.e1 = Q0.e;
                                } else {
                                    imageReceiver5 = imageReceiver5;
                                    this.S0 = dialog.unread_count;
                                    this.U0 = dialog.unread_mentions_count;
                                    this.V0 = dialog.unread_reactions_count;
                                    this.W0 = dialog.unread_poll_votes_count;
                                }
                                if (org.telegram.messenger.t3.p0(M02)) {
                                    this.U0 = 0;
                                }
                                this.T0 = dialog.unread_mark;
                                ijVar6 = this.f1;
                                if (ijVar6 != null) {
                                    int i30 = ijVar6.k.edit_date;
                                }
                                this.R0 = dialog.last_message_date;
                                i25 = this.j1;
                                if (i25 != 7 || i25 == 8) {
                                    vo voVar4 = qp.s1(i10).M[this.j1 != 8 ? (char) 1 : (char) 0];
                                    this.A3 = voVar4 == null && voVar4.j.indexOfKey(dialog.id) >= 0;
                                } else {
                                    this.A3 = this.J0 == 0 && dialog.pinned;
                                }
                                ijVar7 = this.f1;
                                if (ijVar7 != null) {
                                    this.Y0 = ijVar7.k.send_state;
                                }
                            }
                        } else {
                            i10 = i26;
                            qp.s1(i26).q7.h(M02.id);
                            this.S0 = iArr[0];
                            this.U0 = iArr[1];
                            this.V0 = iArr[2];
                            this.d1 = iArr[3] != 0;
                            this.W0 = iArr[4];
                        }
                        imageReceiver5 = imageReceiver5;
                        if (org.telegram.messenger.t3.p0(M02)) {
                        }
                        this.T0 = dialog.unread_mark;
                        ijVar6 = this.f1;
                        if (ijVar6 != null) {
                        }
                        this.R0 = dialog.last_message_date;
                        i25 = this.j1;
                        if (i25 != 7) {
                        }
                        vo voVar42 = qp.s1(i10).M[this.j1 != 8 ? (char) 1 : (char) 0];
                        this.A3 = voVar42 == null && voVar42.j.indexOfKey(dialog.id) >= 0;
                        ijVar7 = this.f1;
                        if (ijVar7 != null) {
                        }
                    } else {
                        i10 = i26;
                    }
                } else {
                    i10 = i26;
                    this.S0 = 0;
                    this.U0 = 0;
                    this.V0 = 0;
                    this.W0 = 0;
                    this.R0 = 0;
                    this.h1 = false;
                }
                z10 = z27;
                if (this.H0 != 0) {
                    int i31 = az0.R;
                    z10 = z27;
                }
            } else {
                z10 = 1;
                i10 = i26;
                v8Var = v8Var2;
                i11 = 2;
                this.A3 = false;
            }
            TLRPC.TL_forumTopic tL_forumTopic = this.N;
            if (tL_forumTopic != null) {
                this.S0 = tL_forumTopic.unread_count;
                this.U0 = tL_forumTopic.unread_mentions_count;
                this.V0 = tL_forumTopic.unread_reactions_count;
                this.W0 = tL_forumTopic.unread_poll_votes_count;
            }
            if (this.j1 == i11) {
                this.A3 = false;
            }
            ui.e eVar = this.t0;
            if (eVar != null) {
                boolean isEmpty = ((ArrayList) eVar.d).isEmpty();
                ui.e eVar2 = this.t0;
                int i32 = this.j1;
                i12 = i29;
                long j11 = this.H0;
                t2 t2Var = (t2) eVar2.b;
                ArrayList arrayList2 = (ArrayList) eVar2.c;
                ArrayList arrayList3 = (ArrayList) eVar2.d;
                z12 = false;
                org.telegram.messenger.c a10 = org.telegram.messenger.c.a(i10);
                qp s12 = qp.s1(i10);
                imageReceiver = imageReceiver5;
                vo[] voVarArr = s12.M;
                if (s12.A7 && p10.i(a10.a).q()) {
                    ArrayList arrayList4 = s12.P0;
                    if (i32 == 7) {
                        voVar = voVarArr[0];
                        i23 = 8;
                    } else {
                        i23 = 8;
                        voVar = i32 == 8 ? voVarArr[z10] : null;
                    }
                    arrayList2.clear();
                    z11 = W;
                    if (i32 == 0 || i32 == 7 || i32 == i23) {
                        int i33 = 0;
                        while (i33 < arrayList4.size()) {
                            vo voVar5 = (vo) arrayList4.get(i33);
                            if (voVar5 != null) {
                                voVar2 = voVar;
                                i24 = i33;
                                if (voVar5 != voVar2 && voVar5.m >= 0 && voVar5.b(a10, j11)) {
                                    arrayList2.add(voVar5);
                                }
                            } else {
                                i24 = i33;
                                voVar2 = voVar;
                            }
                            i33 = i24 + 1;
                            voVar = voVar2;
                        }
                    }
                    int i34 = 0;
                    z22 = false;
                    while (i34 < arrayList3.size()) {
                        lr lrVar2 = (lr) arrayList3.get(i34);
                        int i35 = 0;
                        while (true) {
                            if (i35 >= arrayList2.size()) {
                                voVar3 = null;
                                break;
                            }
                            if (((vo) arrayList2.get(i35)).a == lrVar2.a) {
                                voVar3 = (vo) arrayList2.get(i35);
                                break;
                            }
                            i35++;
                        }
                        if (voVar3 == null) {
                            arrayList3.remove(i34);
                            i34--;
                        } else {
                            if (voVar3.m != lrVar2.b || ((str = voVar3.b) != null && lrVar2.c != null && str.length() != lrVar2.c.j().length())) {
                                arrayList3.set(i34, lr.b(t2Var, voVar3));
                            }
                            i34++;
                        }
                        z22 = z10;
                        i34++;
                    }
                    for (int i36 = 0; i36 < arrayList2.size(); i36++) {
                        vo voVar6 = (vo) arrayList2.get(i36);
                        int i37 = 0;
                        while (true) {
                            if (i37 >= arrayList3.size()) {
                                lrVar = null;
                                break;
                            }
                            if (((lr) arrayList3.get(i37)).a == voVar6.a) {
                                lrVar = (lr) arrayList3.get(i37);
                                break;
                            }
                            i37++;
                        }
                        if (lrVar == null) {
                            arrayList3.add(i36, lr.b(t2Var, voVar6));
                            z22 = z10;
                        }
                    }
                    arrayList2.clear();
                } else {
                    z11 = W;
                    boolean isEmpty2 = arrayList3.isEmpty();
                    arrayList3.clear();
                    z22 = !isEmpty2;
                }
                if (z22) {
                    z13 = isEmpty != ((ArrayList) this.t0.d).isEmpty() ? z10 : false;
                    z15 = z13;
                    z14 = z10;
                    if (i7 == 0) {
                        TLRPC.User user2 = this.f2;
                        if (user2 != null && !qp.F2(user2) && !this.f2.bot && (i7 & 4) != 0) {
                            this.f2 = qp.s1(i10).a2(Long.valueOf(this.f2.id));
                            if (this.B0 != X()) {
                                z14 = z10;
                            }
                        }
                        int i38 = qp.C8;
                        if ((524288 & i7) != 0) {
                            TLRPC.User user3 = this.f2;
                            org.telegram.ui.Components.f5 f5Var = this.n4;
                            if (user3 != null) {
                                TLRPC.User a22 = qp.s1(i10).a2(Long.valueOf(this.f2.id));
                                this.f2 = a22;
                                if (a22 == null || org.telegram.messenger.m5.f(a22.emoji_status) == 0) {
                                    this.D2 = true;
                                    f5Var.g((Drawable) ia.e.d().f, z9);
                                    f5Var.m(z12, z9);
                                } else {
                                    this.D2 = z10;
                                    f5Var.j(org.telegram.messenger.m5.f(this.f2.emoji_status), z9);
                                    f5Var.m(org.telegram.messenger.m5.B(this.f2.emoji_status), z9);
                                }
                                j10 = org.telegram.messenger.m5.c(this.f2);
                                z21 = true;
                            } else {
                                z21 = z14;
                                j10 = 0;
                            }
                            if (this.g2 != null) {
                                TLRPC.Chat M03 = qp.s1(i10).M0(Long.valueOf(this.g2.id));
                                this.g2 = M03;
                                if (M03 == null || org.telegram.messenger.m5.f(M03.emoji_status) == 0) {
                                    this.D2 = true;
                                    f5Var.g((Drawable) ia.e.d().f, z9);
                                    f5Var.m(false, z9);
                                } else {
                                    this.D2 = true;
                                    f5Var.j(org.telegram.messenger.m5.f(this.g2.emoji_status), z9);
                                    f5Var.m(org.telegram.messenger.m5.B(this.g2.emoji_status), z9);
                                }
                                j10 = org.telegram.messenger.m5.c(this.g2);
                                z21 = true;
                            }
                            org.telegram.ui.Components.f5 f5Var2 = this.o4;
                            if (j10 != 0) {
                                z20 = !this.k4;
                                f5Var2.j(j10, z9);
                            } else {
                                boolean z28 = this.k4;
                                f5Var2.g(null, z9);
                                z20 = z28;
                            }
                            z14 = z21;
                        } else {
                            z20 = false;
                        }
                        if ((this.N0 || this.P) && (i7 & 64) != 0) {
                            CharSequence D1 = qp.s1(i10).D1(this.H0, getTopicId(), true);
                            CharSequence charSequence = this.i2;
                            if ((charSequence != null && D1 == null) || ((charSequence == null && D1 != null) || (charSequence != null && !charSequence.equals(D1)))) {
                                z20 = true;
                            }
                        }
                        if (!z20 && (32768 & i7) != 0 && (ijVar5 = this.f1) != null && ijVar5.v != this.i1) {
                            z20 = true;
                        }
                        if (!z20 && (i7 & TLObject.FLAG_13) != 0 && this.g2 != null) {
                            TLRPC.Chat M04 = qp.s1(i10).M0(Long.valueOf(this.g2.id));
                            if ((M04 != null && M04.call_active && M04.call_not_empty) != this.v2) {
                                z20 = true;
                            }
                        }
                        if (!z20 && (i7 & 2) != 0) {
                            TLRPC.Chat chat2 = this.g2;
                            if (chat2 == null) {
                                i13 = i10;
                            } else if (chat2.monoforum) {
                                i13 = i10;
                            }
                            s2 s2Var = this.N4;
                            if (s2Var != null && (hashMap = s2Var.f) != null && !hashMap.isEmpty()) {
                                for (Map.Entry entry : s2Var.f.entrySet()) {
                                    ((org.telegram.ui.f5) entry.getValue()).c(((Long) entry.getKey()).longValue());
                                }
                            }
                            z20 = true;
                            if (!z20 && (i7 & 1) != 0 && this.g2 == null) {
                                z20 = true;
                            }
                            if (!z20 && (i7 & 8) != 0 && this.f2 == null) {
                                z20 = true;
                            }
                            if (!z20 && (i7 & 16) != 0 && this.f2 == null) {
                                z20 = true;
                            }
                            if (!z20) {
                                ij ijVar9 = this.f1;
                                if (ijVar9 != null && this.X0 != ijVar9.F4()) {
                                    this.X0 = this.f1.F4();
                                    z20 = true;
                                }
                                if (this.N0) {
                                    TLRPC.Dialog dialog2 = (TLRPC.Dialog) qp.s1(i13).Q.f(this.H0);
                                    TLRPC.Chat M05 = dialog2 == null ? null : qp.s1(i13).M0(Long.valueOf(-dialog2.id));
                                    if (M05 == null || !(M05.forum || (M05.monoforum && org.telegram.messenger.t3.A(i13, M05, 24)))) {
                                        if (dialog2 instanceof TLRPC.TL_dialogFolder) {
                                            i19 = yr.a0(i13).L;
                                            z16 = z13;
                                        } else if (dialog2 instanceof TLRPC.TL_dialogCommunity) {
                                            np Q02 = qp.s1(i13).Q0(-dialog2.id);
                                            int i39 = Q02.a;
                                            int i40 = Q02.b;
                                            int i41 = Q02.c;
                                            z16 = z13;
                                            int i42 = Q02.d;
                                            this.e1 = Q02.e;
                                            i19 = i39;
                                            i22 = i40;
                                            i21 = i41;
                                            i20 = i42;
                                        } else {
                                            z16 = z13;
                                            if (dialog2 != null) {
                                                int i43 = dialog2.unread_count;
                                                int i44 = dialog2.unread_mentions_count;
                                                int i45 = dialog2.unread_reactions_count;
                                                i20 = dialog2.unread_poll_votes_count;
                                                i21 = i45;
                                                i22 = i44;
                                                i19 = i43;
                                            } else {
                                                i19 = 0;
                                            }
                                        }
                                        i22 = 0;
                                        i21 = 0;
                                        i20 = 0;
                                    } else {
                                        qp.s1(i13).q7.h(M05.id);
                                        i19 = iArr[0];
                                        i22 = iArr[1];
                                        i21 = iArr[2];
                                        this.d1 = iArr[3] != 0;
                                        i20 = iArr[4];
                                        z16 = z13;
                                    }
                                    if (org.telegram.messenger.t3.p0(M05)) {
                                        i22 = 0;
                                    }
                                    if (dialog2 != null && (this.S0 != i19 || this.T0 != dialog2.unread_mark || this.U0 != i22 || this.V0 != i21)) {
                                        this.S0 = i19;
                                        this.U0 = i22;
                                        this.T0 = dialog2.unread_mark;
                                        this.V0 = i21;
                                        this.W0 = i20;
                                        z20 = true;
                                    }
                                    if (!z20 && (i7 & TLObject.FLAG_12) != 0 && (ijVar4 = this.f1) != null) {
                                        i17 = this.Y0;
                                        i18 = ijVar4.k.send_state;
                                        if (i17 != i18) {
                                            this.Y0 = i18;
                                            z20 = true;
                                        }
                                    }
                                    if (!z20) {
                                        invalidate();
                                        return z15;
                                    }
                                }
                            }
                            z16 = z13;
                            if (!z20) {
                                i17 = this.Y0;
                                i18 = ijVar4.k.send_state;
                                if (i17 != i18) {
                                }
                            }
                            if (!z20) {
                            }
                        }
                        i13 = i10;
                        if (!z20) {
                            z20 = true;
                        }
                        if (!z20) {
                            z20 = true;
                        }
                        if (!z20) {
                            z20 = true;
                        }
                        if (!z20) {
                        }
                        z16 = z13;
                        if (!z20) {
                        }
                        if (!z20) {
                        }
                    } else {
                        i13 = i10;
                        z16 = z13;
                    }
                    this.f2 = null;
                    this.g2 = null;
                    this.h2 = null;
                    if (this.K0 != 0) {
                        qp s13 = qp.s1(i13);
                        ArrayList arrayList5 = (ArrayList) s13.x.f(this.K0);
                        if (arrayList5 != null) {
                            int size = arrayList5.size();
                            for (int i46 = 0; i46 < size; i46++) {
                                ArrayList arrayList6 = (ArrayList) s13.R.f(((TLRPC.Dialog) arrayList5.get(i46)).id);
                                if (arrayList6 != null && !arrayList6.isEmpty()) {
                                    ijVar3 = (ij) arrayList6.get(0);
                                    break;
                                }
                            }
                        }
                        ijVar3 = null;
                        this.f1 = ijVar3;
                    }
                    i14 = this.J0;
                    if (i14 == 0) {
                        this.Z0 = false;
                        this.b1 = false;
                        zw zwVar = this.D4;
                        if (zwVar == null || (d42 = zwVar.d4(i13, this.j1, i14, false)) == null || d42.isEmpty()) {
                            ijVar2 = null;
                        } else {
                            int size2 = d42.size();
                            ijVar2 = null;
                            for (int i47 = 0; i47 < size2; i47++) {
                                TLRPC.Dialog dialog3 = (TLRPC.Dialog) d42.get(i47);
                                a0.h hVar = qp.s1(i13).R;
                                if (hVar != null) {
                                    ArrayList arrayList7 = (ArrayList) hVar.f(dialog3.id);
                                    ij ijVar10 = (arrayList7 == null || arrayList7.isEmpty()) ? null : (ij) arrayList7.get(0);
                                    if (ijVar10 != null && (ijVar2 == null || ijVar10.k.date > ijVar2.k.date)) {
                                        ijVar2 = ijVar10;
                                    }
                                    if (dialog3.pinnedNum == 0 && ijVar2 != null) {
                                        break;
                                    }
                                }
                            }
                        }
                        this.f1 = ijVar2;
                        j3 = ijVar2 != null ? ij.B0(ijVar2.k) : 0L;
                    } else {
                        this.b1 = false;
                        if (this.N != null) {
                            boolean r22 = qp.s1(i13).r2(this.H0, 0L, null);
                            boolean r23 = qp.s1(i13).r2(this.H0, this.N.id, null);
                            this.a1 = r23;
                            if (r22 == r23) {
                                this.Z0 = false;
                                this.b1 = false;
                            } else {
                                this.Z0 = r23;
                                this.b1 = !r23;
                            }
                        } else {
                            this.Z0 = this.N0 && qp.s1(i13).r2(this.H0, (long) getTopicId(), null);
                        }
                        j3 = this.H0;
                    }
                    if (j3 != 0) {
                        if (org.telegram.messenger.m5.C(j3)) {
                            TLRPC.EncryptedChat a12 = qp.s1(i13).a1(Integer.valueOf((int) (j3 & 4294967295L)));
                            this.h2 = a12;
                            if (a12 != null) {
                                this.f2 = qp.s1(i13).a2(Long.valueOf(this.h2.user_id));
                            }
                        } else if (org.telegram.messenger.m5.E(j3)) {
                            this.f2 = qp.s1(i13).a2(Long.valueOf(j3));
                        } else {
                            TLRPC.Chat M06 = qp.s1(i13).M0(Long.valueOf(-j3));
                            this.g2 = M06;
                            if (!this.N0 && M06 != null && M06.migrated_to != null && (M0 = qp.s1(i13).M0(Long.valueOf(this.g2.migrated_to.channel_id))) != null) {
                                this.g2 = M0;
                            }
                        }
                        if (this.u2 && this.f2 != null && this.f1.P3()) {
                            this.f2 = qp.s1(i13).a2(Long.valueOf(p10.i(i13).n));
                        }
                    }
                    this.E = this.O0 && org.telegram.messenger.t3.Y(this.g2) && this.N0;
                    if (this.J0 == 0) {
                        org.telegram.ui.ActionBar.m6.u1.setCallback(this);
                        org.telegram.ui.Components.v8 v8Var3 = v8Var;
                        i15 = 2;
                        v8Var3.g(2);
                        imageReceiver2 = imageReceiver;
                        imageReceiver2.q0(null, null, v8Var3, null, this.f2, 0);
                    } else {
                        org.telegram.ui.Components.v8 v8Var4 = v8Var;
                        imageReceiver2 = imageReceiver;
                        i15 = 2;
                        if (!this.O || (ijVar = this.f1) == null) {
                            TLRPC.User user4 = this.f2;
                            if (user4 != null) {
                                v8Var4.r(user4);
                                if (t10.z(this.f2)) {
                                    v8Var4.g(12);
                                    imageReceiver2.q0(null, null, v8Var4, null, this.f2, 0);
                                } else if (t10.s(this.f2)) {
                                    v8Var4.g(21);
                                    imageReceiver2.q0(null, null, v8Var4, null, this.f2, 0);
                                } else if (t10.B(this.f2) && this.r0 && !this.q0) {
                                    v8Var4.g(22);
                                    imageReceiver2.q0(null, null, v8Var4, null, this.f2, 0);
                                } else if (!t10.B(this.f2) || this.u2 || this.q0) {
                                    imageReceiver2.j0(this.f2, v8Var4, null, true, 1, false);
                                } else {
                                    v8Var4.g(1);
                                    imageReceiver2.q0(null, null, v8Var4, null, this.f2, 0);
                                }
                            } else {
                                TLRPC.Chat chat3 = this.g2;
                                if (chat3 != null) {
                                    if (chat3.monoforum) {
                                        qg.d.n(i13, chat3, v8Var4, imageReceiver2);
                                        v8Var4.p = 1.0f;
                                    } else {
                                        v8Var4.q(chat3);
                                        imageReceiver2.i0(chat3, v8Var4, null);
                                    }
                                    if (z9 || ((i16 = i12) == this.S0 && z25 == this.T0)) {
                                        z17 = z14;
                                    } else {
                                        if (this.N0) {
                                            z17 = z14;
                                        } else {
                                            z17 = z14;
                                        }
                                        ValueAnimator valueAnimator = this.T3;
                                        if (valueAnimator != null) {
                                            valueAnimator.cancel();
                                        }
                                        float[] fArr = new float[i15];
                                        // fill-array-data instruction
                                        fArr[0] = 0.0f;
                                        fArr[1] = 1.0f;
                                        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
                                        this.T3 = ofFloat;
                                        ofFloat.addUpdateListener(new j2(this, 0));
                                        this.T3.addListener(new n2(this, 0));
                                        if ((i16 == 0 || this.T0) && (this.T0 || !z25)) {
                                            this.T3.setDuration(220L);
                                            this.T3.setInterpolator(new OvershootInterpolator());
                                        } else if (this.S0 == 0) {
                                            this.T3.setDuration(150L);
                                            this.T3.setInterpolator(wq.f);
                                        } else {
                                            this.T3.setDuration(430L);
                                            this.T3.setInterpolator(wq.f);
                                        }
                                        if (this.G3 && this.L3 && this.X3 != null) {
                                            String format = String.format("%d", Integer.valueOf(i16));
                                            String format2 = String.format("%d", Integer.valueOf(this.S0));
                                            if (format.length() == format2.length()) {
                                                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(format);
                                                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(format2);
                                                SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(format2);
                                                for (int i48 = 0; i48 < format.length(); i48++) {
                                                    if (format.charAt(i48) == format2.charAt(i48)) {
                                                        int i49 = 0;
                                                        int i50 = i48 + 1;
                                                        spannableStringBuilder.setSpan(new hy(i49), i48, i50, 0);
                                                        spannableStringBuilder2.setSpan(new hy(i49), i48, i50, 0);
                                                    } else {
                                                        spannableStringBuilder3.setSpan(new hy(0), i48, i48 + 1, 0);
                                                    }
                                                }
                                                z18 = false;
                                                int max = Math.max(org.telegram.messenger.g0.L(8.0f), (int) Math.ceil(org.telegram.ui.ActionBar.m6.M0.measureText(format)));
                                                TextPaint textPaint = org.telegram.ui.ActionBar.m6.M0;
                                                Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
                                                this.Y3 = new StaticLayout(spannableStringBuilder, textPaint, max, alignment, 1.0f, 0.0f, false);
                                                this.Z3 = new StaticLayout(spannableStringBuilder3, org.telegram.ui.ActionBar.m6.M0, max, alignment, 1.0f, 0.0f, false);
                                                this.a4 = new StaticLayout(spannableStringBuilder2, org.telegram.ui.ActionBar.m6.M0, max, alignment, 1.0f, 0.0f, false);
                                            } else {
                                                z18 = false;
                                                this.Y3 = this.X3;
                                            }
                                        } else {
                                            z18 = false;
                                        }
                                        this.P3 = this.O3;
                                        this.Q3 = this.N3;
                                        this.R3 = this.S0 > i16 ? true : z18;
                                        this.T3.start();
                                        this.S3.a(this.W0 == 0 ? true : z18, z9);
                                        boolean z29 = this.V0 == 0 ? true : z18;
                                        if (z9 || z29 == z24) {
                                            f10 = 0.0f;
                                        } else {
                                            ValueAnimator valueAnimator2 = this.U3;
                                            if (valueAnimator2 != null) {
                                                valueAnimator2.cancel();
                                            }
                                            f10 = 0.0f;
                                            this.W3 = 0.0f;
                                            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                                            this.U3 = ofFloat2;
                                            ofFloat2.addUpdateListener(new j2(this, 1));
                                            this.U3.addListener(new n2(this, 1));
                                            if (z29) {
                                                this.U3.setDuration(220L);
                                                this.U3.setInterpolator(new OvershootInterpolator());
                                            } else {
                                                this.U3.setDuration(150L);
                                                this.U3.setInterpolator(wq.f);
                                            }
                                            this.U3.start();
                                        }
                                        z19 = (V() && (chat = this.g2) != null && chat.monoforum) ? true : z18;
                                        this.D = z19;
                                        if (!z19) {
                                            L = 1;
                                        } else if (this.E) {
                                            L = org.telegram.messenger.g0.L(12.0f);
                                        } else {
                                            TLRPC.Chat chat4 = this.g2;
                                            L = ((chat4 == null || !chat4.forum || this.J0 != 0 || this.O) && (this.r0 || (user = this.f2) == null || !user.self || !qp.s1(i13).o6)) ? org.telegram.messenger.g0.L(28.0f) : org.telegram.messenger.g0.L(16.0f);
                                        }
                                        imageReceiver2.J0(L);
                                        z23 = z17;
                                    }
                                    z18 = false;
                                    this.S3.a(this.W0 == 0 ? true : z18, z9);
                                    if (this.V0 == 0) {
                                    }
                                    if (z9) {
                                    }
                                    f10 = 0.0f;
                                    if (V()) {
                                    }
                                    this.D = z19;
                                    if (!z19) {
                                    }
                                    imageReceiver2.J0(L);
                                    z23 = z17;
                                }
                            }
                        } else {
                            v8Var4.p(ijVar.b1());
                            imageReceiver2.i0(this.f1.b1(), v8Var4, null);
                        }
                    }
                    if (z9) {
                    }
                    z17 = z14;
                    z18 = false;
                    this.S3.a(this.W0 == 0 ? true : z18, z9);
                    if (this.V0 == 0) {
                    }
                    if (z9) {
                    }
                    f10 = 0.0f;
                    if (V()) {
                    }
                    this.D = z19;
                    if (!z19) {
                    }
                    imageReceiver2.J0(L);
                    z23 = z17;
                }
            } else {
                z11 = W;
                z12 = false;
                i12 = i29;
                imageReceiver = imageReceiver5;
            }
            z13 = z12;
            z14 = z13;
            z15 = z14;
            if (i7 == 0) {
            }
            this.f2 = null;
            this.g2 = null;
            this.h2 = null;
            if (this.K0 != 0) {
            }
            i14 = this.J0;
            if (i14 == 0) {
            }
            if (j3 != 0) {
            }
            this.E = this.O0 && org.telegram.messenger.t3.Y(this.g2) && this.N0;
            if (this.J0 == 0) {
            }
            if (z9) {
            }
            z17 = z14;
            z18 = false;
            this.S3.a(this.W0 == 0 ? true : z18, z9);
            if (this.V0 == 0) {
            }
            if (z9) {
            }
            f10 = 0.0f;
            if (V()) {
            }
            this.D = z19;
            if (!z19) {
            }
            imageReceiver2.J0(L);
            z23 = z17;
        }
        if (!this.P && (getMeasuredWidth() != 0 || getMeasuredHeight() != 0)) {
            z16 = true;
        }
        if (!z23) {
            int i51 = this.u0.y;
            di.s7.r(qp.s1(i13).P1(), getDialogId());
        }
        if (!z9) {
            this.c1 = (this.Z0 || this.b1) ? 1.0f : f10;
            ValueAnimator valueAnimator3 = this.T3;
            if (valueAnimator3 != null) {
                valueAnimator3.cancel();
            }
        }
        invalidate();
        if (W() != z11) {
            z15 = true;
        }
        if (z16) {
            if (this.w3) {
                x();
            } else {
                this.A0 = true;
            }
        }
        l0(z9);
        return z15;
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
    public final void k0() {
        TLRPC.Message message;
        int i7;
        ?? r14;
        boolean z9;
        TLRPC.PhotoSize photoSize;
        TLRPC.PhotoSize Q;
        TLRPC.PhotoSize photoSize2;
        TLRPC.PhotoSize w10;
        boolean z10;
        int i10;
        TLRPC.PhotoSize photoSize3;
        ij ijVar = this.f1;
        if (ijVar == null) {
            return;
        }
        String F1 = qp.s1(ijVar.I1).F1(this.f1.k.restriction_reason);
        ij ijVar2 = this.f1;
        TLRPC.PhotoSize photoSize4 = null;
        int i11 = 3;
        boolean z11 = false;
        if (ijVar2 != null && (message = ijVar2.k) != null) {
            TLRPC.MessageMedia messageMedia = message.media;
            if (messageMedia instanceof TLRPC.TL_messageMediaPaidMedia) {
                this.R1 = 0;
                this.S1 = false;
                TLRPC.TL_messageMediaPaidMedia tL_messageMediaPaidMedia = (TLRPC.TL_messageMediaPaidMedia) messageMedia;
                int i12 = 0;
                int i13 = 0;
                while (i12 < tL_messageMediaPaidMedia.extended_media.size() && this.R1 < i11) {
                    TLRPC.MessageExtendedMedia messageExtendedMedia = tL_messageMediaPaidMedia.extended_media.get(i12);
                    boolean z12 = messageExtendedMedia instanceof TLRPC.TL_messageExtendedMediaPreview;
                    boolean[] zArr = this.X1;
                    boolean[] zArr2 = this.W1;
                    ImageReceiver[] imageReceiverArr = this.V1;
                    if (z12) {
                        i7 = i13 + 1;
                        TLRPC.PhotoSize photoSize5 = ((TLRPC.TL_messageExtendedMediaPreview) messageExtendedMedia).thumb;
                        if (i13 < i11 && photoSize5 != null) {
                            this.S1 = z11;
                            int i14 = this.R1;
                            if (i14 < i11) {
                                this.R1 = i14 + 1;
                                zArr2[i13] = z11;
                                zArr[i13] = true;
                                imageReceiverArr[i13].r0(org.telegram.messenger.hc.f(photoSize5, this.f1.k), "2_2_b", null, null, null, z11 ? 1L : 0L, null, this.f1, 0);
                                imageReceiverArr[i13].J0(org.telegram.messenger.g0.L(2.0f));
                                this.V = z11;
                            }
                        }
                    } else if (messageExtendedMedia instanceof TLRPC.TL_messageExtendedMedia) {
                        i7 = i13 + 1;
                        TLRPC.MessageMedia messageMedia2 = ((TLRPC.TL_messageExtendedMedia) messageExtendedMedia).media;
                        if (messageMedia2 instanceof TLRPC.TL_messageMediaPhoto) {
                            ?? r82 = messageMedia2.photo;
                            r14 = r82.sizes;
                            photoSize3 = r82;
                        } else if (messageMedia2 instanceof TLRPC.TL_messageMediaDocument) {
                            boolean K4 = ij.K4(messageMedia2.document);
                            ?? r83 = messageMedia2.document;
                            z9 = K4;
                            r14 = r83.thumbs;
                            photoSize = r83;
                            Q = org.telegram.messenger.w7.Q(r14);
                            if (Q == null) {
                                Q = org.telegram.messenger.w7.w(r14, 40, z11, photoSize4, z11);
                            }
                            photoSize2 = Q;
                            w10 = org.telegram.messenger.w7.w(r14, org.telegram.messenger.g0.Z0(z11), z11, photoSize4, true);
                            if (photoSize2 == w10) {
                                w10 = photoSize4;
                            }
                            if (w10 == null) {
                                org.telegram.messenger.z5 q10 = org.telegram.messenger.z5.q(this.F0);
                                int i15 = w10.size;
                                z10 = z11 ? 1 : 0;
                                i10 = i13;
                            } else {
                                z10 = z11 ? 1 : 0;
                                i10 = i13;
                            }
                            w10 = photoSize2;
                            if (photoSize2 != null) {
                                this.S1 = (this.S1 || z9) ? true : z10;
                                int i16 = this.R1;
                                if (i16 < 3) {
                                    this.R1 = i16 + 1;
                                    zArr2[i10] = z9;
                                    zArr[i10] = z10;
                                    imageReceiverArr[i10].r0(org.telegram.messenger.hc.f(w10, photoSize), "20_20", org.telegram.messenger.hc.f(photoSize2, photoSize), "20_20", null, (long) ((z9 || w10 == null) ? z10 : w10.size), null, this.f1, 0);
                                    imageReceiverArr[i10].J0(org.telegram.messenger.g0.L(2.0f));
                                    this.V = z10;
                                }
                            }
                        } else {
                            TLRPC.PhotoSize photoSize6 = photoSize4;
                            r14 = photoSize6;
                            photoSize3 = photoSize6;
                        }
                        z9 = z11 ? 1 : 0;
                        photoSize = photoSize3;
                        Q = org.telegram.messenger.w7.Q(r14);
                        if (Q == null) {
                        }
                        photoSize2 = Q;
                        w10 = org.telegram.messenger.w7.w(r14, org.telegram.messenger.g0.Z0(z11), z11, photoSize4, true);
                        if (photoSize2 == w10) {
                        }
                        if (w10 == null) {
                        }
                        w10 = photoSize2;
                        if (photoSize2 != null) {
                        }
                    } else {
                        i12++;
                        photoSize4 = null;
                        i11 = 3;
                        z11 = false;
                    }
                    i13 = i7;
                    i12++;
                    photoSize4 = null;
                    i11 = 3;
                    z11 = false;
                }
                return;
            }
        }
        ArrayList arrayList = this.g1;
        if (arrayList != null && arrayList.size() > 1 && TextUtils.isEmpty(F1) && this.J0 == 0 && this.h2 == null) {
            this.R1 = 0;
            this.S1 = false;
            Collections.sort(this.g1, Comparator$-CC.comparingInt(new bg.d(13)));
            for (int i17 = 0; i17 < Math.min(3, this.g1.size()); i17++) {
                ij ijVar3 = (ij) this.g1.get(i17);
                if (ijVar3 != null && !ijVar3.m5() && (ij.S3(ijVar3.k) || ijVar3.L3() || ij.L4(ijVar3.k) || ijVar3.h4() || ijVar3.y4())) {
                    String str = ijVar3.Z4() ? ijVar3.k.media.webpage.type : null;
                    if (!"app".equals(str) && !"profile".equals(str) && !"article".equals(str) && (str == null || !str.startsWith("telegram_"))) {
                        h0(i17, ijVar3);
                    }
                }
            }
            return;
        }
        ij ijVar4 = this.f1;
        if (ijVar4 == null || this.J0 != 0) {
            return;
        }
        this.R1 = 0;
        this.S1 = false;
        if (ijVar4.m5()) {
            return;
        }
        if (ij.S3(this.f1.k) || this.f1.L3() || ij.L4(this.f1.k) || this.f1.h4() || this.f1.y4()) {
            String str2 = this.f1.Z4() ? this.f1.k.media.webpage.type : null;
            if ("app".equals(str2) || "profile".equals(str2) || "article".equals(str2)) {
                return;
            }
            if (str2 == null || !str2.startsWith("telegram_")) {
                h0(0, this.f1);
            }
        }
    }

    public final void l0(boolean z9) {
        TL_account.RequirementToContact J2 = (this.Z4 == null || this.f2 == null) ? null : qp.s1(this.F0).J2(this.f2.id);
        boolean z10 = J2 instanceof TL_account.requirementToContactPremium;
        if (this.n2 == z10 && this.p2 == org.telegram.messenger.m5.k(J2)) {
            return;
        }
        this.n2 = z10;
        this.p2 = org.telegram.messenger.m5.k(J2);
        if (!z9) {
            this.m2.f(this.n2, true);
            this.o2.f(this.p2 > 0, true);
        }
        invalidate();
    }

    public final void m0() {
        if (this.R1 > 0) {
            StaticLayout staticLayout = W() ? this.h3 : this.e3;
            int i7 = W() ? this.c3 : this.b3;
            if (staticLayout == null) {
                return;
            }
            try {
                CharSequence text = staticLayout.getText();
                if (text instanceof Spanned) {
                    r2[] r2VarArr = (r2[]) ((Spanned) text).getSpans(0, text.length(), r2.class);
                    boolean[] zArr = this.U1;
                    if (r2VarArr == null || r2VarArr.length <= 0) {
                        for (int i10 = 0; i10 < 3; i10++) {
                            zArr[i10] = false;
                        }
                        return;
                    }
                    int spanStart = ((Spanned) text).getSpanStart(r2VarArr[0]);
                    if (spanStart < 0) {
                        spanStart = 0;
                    }
                    int ceil = (int) Math.ceil(Math.min(staticLayout.getPrimaryHorizontal(spanStart), staticLayout.getPrimaryHorizontal(spanStart + 1)));
                    if (ceil != 0 && !this.x0 && !this.y0) {
                        ceil += org.telegram.messenger.g0.L(3.0f);
                    }
                    for (int i11 = 0; i11 < this.R1; i11++) {
                        this.V1[i11].K0 = i7 + ceil + org.telegram.messenger.g0.L((this.L4 + 2) * i11);
                        zArr[i11] = true;
                    }
                }
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.Y1.P();
        int i7 = 0;
        while (true) {
            ImageReceiver[] imageReceiverArr = this.V1;
            if (i7 >= imageReceiverArr.length) {
                break;
            }
            imageReceiverArr[i7].P();
            i7++;
        }
        b0();
        this.m3 = org.telegram.ui.Components.q5.update(0, this, this.m3, this.e3);
        this.n3 = org.telegram.ui.Components.q5.update(0, this, this.n3, this.s3);
        this.o3 = org.telegram.ui.Components.q5.update(0, this, this.o3, this.h3);
        this.p3 = org.telegram.ui.Components.q5.update(0, this, this.p3, this.z2);
        org.telegram.ui.Components.f5 f5Var = this.n4;
        if (f5Var != null) {
            f5Var.a();
        }
        org.telegram.ui.Components.f5 f5Var2 = this.o4;
        if (f5Var2 != null) {
            f5Var2.a();
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
        int i7 = 0;
        while (true) {
            ImageReceiver[] imageReceiverArr = this.V1;
            if (i7 >= imageReceiverArr.length) {
                break;
            }
            imageReceiverArr[i7].R();
            i7++;
        }
        zg0 zg0Var = this.y1;
        if (zg0Var != null) {
            zg0Var.stop();
            this.y1.T(true, 0.0f);
            this.y1.setCallback(null);
            this.y1 = null;
            this.z1 = false;
        }
        jg.k kVar = this.s4;
        if (kVar != null) {
            kVar.d.remove(Long.valueOf(this.H0));
        }
        org.telegram.ui.Components.f5 f5Var = this.n4;
        if (f5Var != null) {
            f5Var.b();
        }
        org.telegram.ui.Components.f5 f5Var2 = this.o4;
        if (f5Var2 != null) {
            f5Var2.b();
        }
        org.telegram.ui.Components.q5.release(this, this.m3);
        org.telegram.ui.Components.q5.release(this, this.n3);
        org.telegram.ui.Components.q5.release(this, this.o3);
        org.telegram.ui.Components.q5.release(this, this.p3);
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
        float f10;
        boolean z9;
        int w02;
        int w03;
        int i7;
        String L0;
        String str;
        int i10;
        int i11;
        float f11;
        int i12;
        org.telegram.ui.ActionBar.h6 h6Var;
        boolean z10;
        ec ecVar;
        sd sdVar;
        String str2;
        float f12;
        int i13;
        String str3;
        float f13;
        sd sdVar2;
        float f14;
        sd sdVar3;
        String str4;
        int ceil;
        int i14;
        StaticLayout staticLayout;
        float f15;
        boolean z11;
        zg0 zg0Var;
        float f16;
        float f17;
        org.telegram.ui.ActionBar.h6 h6Var2;
        float f18;
        t2 t2Var;
        int i15;
        org.telegram.ui.ActionBar.h6 h6Var3;
        sd sdVar4;
        ec ecVar2;
        ?? r12;
        float f19;
        int i16;
        boolean z12;
        int i17;
        boolean z13;
        ImageReceiver imageReceiver;
        boolean z14;
        m2 m2Var;
        t2 t2Var2;
        float f20;
        int i18;
        Canvas canvas2;
        boolean z15;
        float f21;
        TLRPC.TL_forumTopic tL_forumTopic;
        TLRPC.Chat chat;
        TLRPC.User user;
        TLRPC.TL_forumTopic tL_forumTopic2;
        kg0 kg0Var;
        q2 q2Var;
        float f22;
        float f23;
        int i19;
        int i20;
        float f24;
        int i21;
        boolean z16;
        int i22;
        q2 q2Var2;
        int i23;
        RectF rectF;
        org.telegram.ui.ActionBar.h6 h6Var4;
        q2 q2Var3;
        float f25;
        boolean z17;
        t2 t2Var3;
        boolean z18;
        float f26;
        ui.e eVar;
        int i24;
        float L;
        float f27;
        boolean z19;
        boolean z20;
        boolean z21;
        int i25;
        float f28;
        float z22;
        StaticLayout staticLayout2;
        int i26;
        pu0 u02;
        int i27;
        o2 o2Var;
        zw zwVar;
        vv vvVar;
        TLRPC.TL_forumTopic tL_forumTopic3;
        kg0 kg0Var2;
        TLRPC.TL_forumTopic tL_forumTopic4;
        final t2 t2Var4 = this;
        Canvas canvas3 = canvas;
        if ((t2Var4.H0 == 0 && t2Var4.G0 == null) || !t2Var4.z0) {
            return;
        }
        boolean z23 = t2Var4.h;
        ec ecVar3 = t2Var4.m4;
        if (z23 && ((t2Var4.J0 != 0 || (t2Var4.P && (tL_forumTopic4 = t2Var4.N) != null && tL_forumTopic4.id == 1)) && (kg0Var2 = t2Var4.e2) != null && kg0Var2.C == 0.0f && t2Var4.w1 == 0.0f)) {
            canvas3.save();
            canvas3.translate(0.0f, (-t2Var4.E3) - t2Var4.n);
            canvas3.clipRect(0.0f, (1.0f - t2Var4.e2.J) * t2Var4.getMeasuredHeight(), t2Var4.getMeasuredWidth(), t2Var4.getMeasuredHeight());
            t2Var4.e2.c(canvas3, false);
            canvas3.restore();
            ecVar3.setVisibility(4);
            return;
        }
        boolean z24 = z23 && (t2Var4.J0 != 0 || (t2Var4.P && (tL_forumTopic3 = t2Var4.N) != null && tL_forumTopic3.id == 1)) && t2Var4.e2 != null && t2Var4.w1 == 0.0f && (zwVar = t2Var4.D4) != null && zwVar.l4() && ((vvVar = zwVar.G3) == null || !vvVar.c());
        kg0 kg0Var3 = t2Var4.e2;
        float f29 = kg0Var3 != null ? kg0Var3.J : 1.0f;
        if (z24) {
            canvas3.save();
            canvas3.clipRect(0.0f, (1.0f - f29) * t2Var4.getMeasuredHeight(), t2Var4.getMeasuredWidth(), t2Var4.getMeasuredHeight());
        }
        if (t2Var4.t1 != 0.0f && Build.VERSION.SDK_INT != 24) {
            canvas3.save();
            canvas3.clipRect(0.0f, t2Var4.u1 * t2Var4.t1, t2Var4.getMeasuredWidth(), t2Var4.getMeasuredHeight() - ((int) (t2Var4.v1 * t2Var4.t1)));
        }
        float f30 = t2Var4.w1;
        sd sdVar5 = t2Var4.d2;
        org.telegram.ui.ActionBar.h6 h6Var5 = t2Var4.J4;
        if (f30 == 0.0f && t2Var4.o1 == 0.0f) {
            zg0 zg0Var2 = t2Var4.y1;
            if (zg0Var2 != null) {
                zg0Var2.stop();
                t2Var4.y1.T(true, 0.0f);
                t2Var4.y1.setCallback(null);
                t2Var4.y1 = null;
                t2Var4.z1 = false;
            }
            f10 = 1.0f;
            h6Var = h6Var5;
            z10 = z23;
            ecVar = ecVar3;
            f15 = 2.0f;
            sdVar3 = sdVar5;
        } else {
            canvas3.save();
            canvas3.translate(0.0f, -t2Var4.E3);
            if (t2Var4.L1) {
                w02 = org.telegram.ui.ActionBar.m6.w0(t2Var4.M1, h6Var5);
                w03 = org.telegram.ui.ActionBar.m6.w0(t2Var4.N1, h6Var5);
                String str5 = t2Var4.O1;
                f10 = 1.0f;
                i7 = t2Var4.P1;
                L0 = id.M0(i7, str5);
                z9 = false;
                t2Var4.y1 = t2Var4.Q1;
            } else {
                f10 = 1.0f;
                z9 = false;
                if (t2Var4.J0 != 0) {
                    if (t2Var4.m1) {
                        w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.d9, h6Var5);
                        w03 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.c9, h6Var5);
                        i7 = 2131743883;
                        L0 = id.L0(2131743883);
                        t2Var4.y1 = org.telegram.ui.ActionBar.m6.y1;
                    } else {
                        w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.c9, h6Var5);
                        w03 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.d9, h6Var5);
                        i7 = 2131749316;
                        L0 = id.L0(2131749316);
                        t2Var4.y1 = org.telegram.ui.ActionBar.m6.x1;
                    }
                } else if (t2Var4.P2) {
                    w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.c9, h6Var5);
                    w03 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.d9, h6Var5);
                    i7 = 2131746599;
                    L0 = id.L0(2131746599);
                    t2Var4.y1 = org.telegram.ui.ActionBar.m6.z1;
                } else if (t2Var4.k1 == 0) {
                    w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.c9, h6Var5);
                    w03 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.d9, h6Var5);
                    if (org.telegram.messenger.t3.Y(t2Var4.g2)) {
                        String L02 = id.L0(2131744304);
                        w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Y5, h6Var5);
                        t2Var4.y1 = org.telegram.ui.ActionBar.m6.K1;
                        str = L02;
                        i10 = 2131744304;
                        i11 = w02;
                        if (t2Var4.x || (zg0Var = t2Var4.s) == null) {
                            t2Var4.s = t2Var4.y1;
                            t2Var4.w = i10;
                        } else {
                            t2Var4.y1 = zg0Var;
                            i10 = t2Var4.w;
                        }
                        if (!t2Var4.z1 && Math.abs(t2Var4.w1) > org.telegram.messenger.g0.L(43.0f)) {
                            t2Var4.z1 = true;
                            t2Var4.y1.T(true, 0.0f);
                            t2Var4.y1.setCallback(t2Var4);
                            t2Var4.y1.start();
                        }
                        float measuredWidth = t2Var4.getMeasuredWidth() + t2Var4.w1;
                        if (t2Var4.B1 >= f10) {
                            org.telegram.ui.ActionBar.m6.v0.setColor(w02);
                            i12 = i10;
                            h6Var = h6Var5;
                            z10 = z23;
                            ecVar = ecVar3;
                            sdVar = sdVar5;
                            f12 = measuredWidth;
                            str2 = "Arrow";
                            f11 = 0.0f;
                            canvas3.drawRect(measuredWidth - org.telegram.messenger.g0.L(8.0f), 0.0f, t2Var4.getMeasuredWidth(), t2Var4.getMeasuredHeight(), org.telegram.ui.ActionBar.m6.v0);
                            if (t2Var4.B1 == 0.0f) {
                                if (org.telegram.ui.ActionBar.m6.A1) {
                                    org.telegram.ui.ActionBar.m6.v1.Q(org.telegram.ui.ActionBar.m6.H0(org.telegram.ui.ActionBar.m6.c9), str2);
                                    org.telegram.ui.ActionBar.m6.A1 = z9;
                                }
                                if (org.telegram.ui.ActionBar.m6.B1) {
                                    zg0 zg0Var3 = org.telegram.ui.ActionBar.m6.z1;
                                    zg0Var3.Z = true;
                                    int i28 = org.telegram.ui.ActionBar.m6.c9;
                                    zg0Var3.Q(org.telegram.ui.ActionBar.m6.H0(i28), "Line 1");
                                    org.telegram.ui.ActionBar.m6.z1.Q(org.telegram.ui.ActionBar.m6.H0(i28), "Line 2");
                                    org.telegram.ui.ActionBar.m6.z1.Q(org.telegram.ui.ActionBar.m6.H0(i28), "Line 3");
                                    org.telegram.ui.ActionBar.m6.z1.o();
                                    org.telegram.ui.ActionBar.m6.B1 = z9;
                                }
                            }
                        } else {
                            f11 = 0.0f;
                            i12 = i10;
                            h6Var = h6Var5;
                            z10 = z23;
                            ecVar = ecVar3;
                            sdVar = sdVar5;
                            str2 = "Arrow";
                            f12 = measuredWidth;
                        }
                        int measuredWidth2 = (t2Var4.getMeasuredWidth() - org.telegram.messenger.g0.L(43.0f)) - (t2Var4.y1.getIntrinsicWidth() / 2);
                        int y10 = org.telegram.messenger.camera.q.y(52.0f, t2Var4.getMeasuredHeight(), 2);
                        int intrinsicWidth = (t2Var4.y1.getIntrinsicWidth() / 2) + measuredWidth2;
                        int intrinsicHeight = (t2Var4.y1.getIntrinsicHeight() / 2) + y10;
                        if (t2Var4.B1 <= f11) {
                            canvas3.save();
                            i13 = i12;
                            str3 = str;
                            f13 = f12;
                            canvas3.clipRect(f12 - org.telegram.messenger.g0.L(8.0f), f11, t2Var4.getMeasuredWidth(), t2Var4.getMeasuredHeight());
                            org.telegram.ui.ActionBar.m6.v0.setColor(i11);
                            sdVar2 = sdVar;
                            canvas3.drawCircle(intrinsicWidth, intrinsicHeight, org.telegram.messenger.g0.G.getInterpolation(t2Var4.B1) * ((float) Math.sqrt(((intrinsicHeight - t2Var4.getMeasuredHeight()) * (intrinsicHeight - t2Var4.getMeasuredHeight())) + (intrinsicWidth * intrinsicWidth))), org.telegram.ui.ActionBar.m6.v0);
                            canvas3.restore();
                            if (org.telegram.ui.ActionBar.m6.A1) {
                                z11 = true;
                            } else {
                                org.telegram.ui.ActionBar.m6.v1.Q(org.telegram.ui.ActionBar.m6.H0(org.telegram.ui.ActionBar.m6.d9), str2);
                                z11 = true;
                                org.telegram.ui.ActionBar.m6.A1 = true;
                            }
                            if (!org.telegram.ui.ActionBar.m6.B1) {
                                zg0 zg0Var4 = org.telegram.ui.ActionBar.m6.z1;
                                zg0Var4.Z = z11;
                                int i29 = org.telegram.ui.ActionBar.m6.d9;
                                zg0Var4.Q(org.telegram.ui.ActionBar.m6.H0(i29), "Line 1");
                                org.telegram.ui.ActionBar.m6.z1.Q(org.telegram.ui.ActionBar.m6.H0(i29), "Line 2");
                                org.telegram.ui.ActionBar.m6.z1.Q(org.telegram.ui.ActionBar.m6.H0(i29), "Line 3");
                                org.telegram.ui.ActionBar.m6.z1.o();
                                org.telegram.ui.ActionBar.m6.B1 = true;
                            }
                        } else {
                            i13 = i12;
                            str3 = str;
                            f13 = f12;
                            sdVar2 = sdVar;
                        }
                        canvas3.save();
                        canvas3.translate(measuredWidth2, y10);
                        f14 = t2Var4.C1;
                        if (f14 != 0.0f || f14 == f10) {
                            sdVar3 = sdVar2;
                        } else {
                            sdVar3 = sdVar2;
                            float interpolation = sdVar3.getInterpolation(f14) + f10;
                            canvas3.scale(interpolation, interpolation, t2Var4.y1.getIntrinsicWidth() / 2, t2Var4.y1.getIntrinsicHeight() / 2);
                        }
                        boolean z25 = z9;
                        z.s(z25 ? 1 : 0, z25 ? 1 : 0, t2Var4.y1);
                        t2Var4.y1.draw(canvas3);
                        canvas3.restore();
                        canvas3.clipRect(f13, 0.0f, t2Var4.getMeasuredWidth(), t2Var4.getMeasuredHeight());
                        str4 = str3;
                        ceil = (int) Math.ceil(org.telegram.ui.ActionBar.m6.M0.measureText(str4));
                        i14 = i13;
                        if (t2Var4.F4 == i14 || t2Var4.G4 != t2Var4.getMeasuredWidth()) {
                            t2Var4.F4 = i14;
                            t2Var4.G4 = t2Var4.getMeasuredWidth();
                            TextPaint textPaint = org.telegram.ui.ActionBar.m6.N0;
                            int min = Math.min(org.telegram.messenger.g0.L(80.0f), ceil);
                            Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
                            staticLayout = new StaticLayout(str4, textPaint, min, alignment, 1.0f, 0.0f, false);
                            t2Var4.E4 = staticLayout;
                            if (staticLayout.getLineCount() > 1) {
                                t2Var4.E4 = new StaticLayout(str4, org.telegram.ui.ActionBar.m6.O0, Math.min(org.telegram.messenger.g0.L(82.0f), ceil), alignment, 1.0f, 0.0f, false);
                            }
                        }
                        if (t2Var4.E4 == null) {
                            canvas3.save();
                            f15 = 2.0f;
                            canvas3.translate((t2Var4.getMeasuredWidth() - org.telegram.messenger.g0.L(43.0f)) - (t2Var4.E4.getWidth() / 2.0f), org.telegram.messenger.g0.L(36.0f) + y10 + (t2Var4.E4.getLineCount() > 1 ? -org.telegram.messenger.g0.L(4.0f) : 0.0f));
                            t2Var4.E4.draw(canvas3);
                            canvas3.restore();
                        } else {
                            f15 = 2.0f;
                        }
                        canvas3.restore();
                    } else {
                        int i30 = t2Var4.F0;
                        if (iz.m(i30) == 3) {
                            if (t2Var4.Z0) {
                                i7 = 2131744303;
                                L0 = id.L0(2131744303);
                                t2Var4.y1 = org.telegram.ui.ActionBar.m6.I1;
                            } else {
                                i7 = 2131744321;
                                L0 = id.L0(2131744321);
                                t2Var4.y1 = org.telegram.ui.ActionBar.m6.H1;
                            }
                        } else if (iz.m(i30) == 4) {
                            i7 = 2131744324;
                            L0 = id.L0(2131744324);
                            w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Y5, h6Var5);
                            t2Var4.y1 = org.telegram.ui.ActionBar.m6.J1;
                        } else if (iz.m(i30) == 1) {
                            if (t2Var4.S0 > 0 || t2Var4.T0) {
                                i7 = 2131744323;
                                L0 = id.L0(2131744323);
                                t2Var4.y1 = org.telegram.ui.ActionBar.m6.L1;
                            } else {
                                i7 = 2131744322;
                                L0 = id.L0(2131744322);
                                t2Var4.y1 = org.telegram.ui.ActionBar.m6.M1;
                            }
                        } else if (iz.m(i30) != 0) {
                            i7 = 2131754172;
                            L0 = id.L0(2131754172);
                            t2Var4.y1 = org.telegram.ui.ActionBar.m6.v1;
                        } else if (t2Var4.getIsPinned()) {
                            i7 = 2131744302;
                            L0 = id.L0(2131744302);
                            t2Var4.y1 = org.telegram.ui.ActionBar.m6.O1;
                        } else {
                            i7 = 2131744320;
                            L0 = id.L0(2131744320);
                            t2Var4.y1 = org.telegram.ui.ActionBar.m6.N1;
                        }
                    }
                } else {
                    w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.d9, h6Var5);
                    w03 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.c9, h6Var5);
                    i7 = 2131743915;
                    L0 = id.L0(2131743915);
                    t2Var4.y1 = org.telegram.ui.ActionBar.m6.w1;
                }
            }
            int i31 = i7;
            i11 = w03;
            i10 = i31;
            str = L0;
            if (t2Var4.x) {
            }
            t2Var4.s = t2Var4.y1;
            t2Var4.w = i10;
            if (!t2Var4.z1) {
                t2Var4.z1 = true;
                t2Var4.y1.T(true, 0.0f);
                t2Var4.y1.setCallback(t2Var4);
                t2Var4.y1.start();
            }
            float measuredWidth3 = t2Var4.getMeasuredWidth() + t2Var4.w1;
            if (t2Var4.B1 >= f10) {
            }
            int measuredWidth22 = (t2Var4.getMeasuredWidth() - org.telegram.messenger.g0.L(43.0f)) - (t2Var4.y1.getIntrinsicWidth() / 2);
            int y102 = org.telegram.messenger.camera.q.y(52.0f, t2Var4.getMeasuredHeight(), 2);
            int intrinsicWidth2 = (t2Var4.y1.getIntrinsicWidth() / 2) + measuredWidth22;
            int intrinsicHeight2 = (t2Var4.y1.getIntrinsicHeight() / 2) + y102;
            if (t2Var4.B1 <= f11) {
            }
            canvas3.save();
            canvas3.translate(measuredWidth22, y102);
            f14 = t2Var4.C1;
            if (f14 != 0.0f) {
            }
            sdVar3 = sdVar2;
            boolean z252 = z9;
            z.s(z252 ? 1 : 0, z252 ? 1 : 0, t2Var4.y1);
            t2Var4.y1.draw(canvas3);
            canvas3.restore();
            canvas3.clipRect(f13, 0.0f, t2Var4.getMeasuredWidth(), t2Var4.getMeasuredHeight());
            str4 = str3;
            ceil = (int) Math.ceil(org.telegram.ui.ActionBar.m6.M0.measureText(str4));
            i14 = i13;
            if (t2Var4.F4 == i14) {
            }
            t2Var4.F4 = i14;
            t2Var4.G4 = t2Var4.getMeasuredWidth();
            TextPaint textPaint2 = org.telegram.ui.ActionBar.m6.N0;
            int min2 = Math.min(org.telegram.messenger.g0.L(80.0f), ceil);
            Layout.Alignment alignment2 = Layout.Alignment.ALIGN_CENTER;
            staticLayout = new StaticLayout(str4, textPaint2, min2, alignment2, 1.0f, 0.0f, false);
            t2Var4.E4 = staticLayout;
            if (staticLayout.getLineCount() > 1) {
            }
            if (t2Var4.E4 == null) {
            }
            canvas3.restore();
        }
        if (t2Var4.w1 != 0.0f) {
            canvas3.save();
            canvas3.translate(t2Var4.w1, 0.0f);
            f16 = 0.0f + t2Var4.w1;
        } else {
            f16 = 0.0f;
        }
        float L2 = org.telegram.messenger.g0.L(8.0f) * t2Var4.o1;
        boolean z26 = t2Var4.q4;
        RectF rectF2 = t2Var4.r4;
        if (z26) {
            f17 = 0.0f;
            rectF2.set(0.0f, 0.0f, t2Var4.getMeasuredWidth(), org.telegram.messenger.g0.W1(t2Var4.i0, t2Var4.getMeasuredHeight(), t2Var4.getCollapsedHeight()));
            rectF2.offset(0.0f, (-t2Var4.E3) + t2Var4.C0);
            canvas3.drawRoundRect(rectF2, L2, L2, org.telegram.ui.ActionBar.m6.u0);
        } else {
            f17 = 0.0f;
        }
        canvas3.save();
        canvas3.translate(f17, (-t2Var4.n) * t2Var4.i0);
        if (t2Var4.J0 == 0 || (iz.q1 && t2Var4.D1 == f17)) {
            h6Var2 = h6Var;
            if (t2Var4.getIsPinned() || t2Var4.z3) {
                org.telegram.ui.ActionBar.m6.v0.setColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.s9, h6Var2));
                org.telegram.ui.ActionBar.m6.v0.setAlpha((int) ((1.0f - t2Var4.i0) * r3.getAlpha()));
            }
        } else {
            h6Var2 = h6Var;
            float f31 = f10;
            org.telegram.ui.ActionBar.m6.v0.setColor(org.telegram.messenger.g0.S0(t2Var4.D1, f31, 0, org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.s9, h6Var2)));
            org.telegram.ui.ActionBar.m6.v0.setAlpha((int) ((f31 - t2Var4.i0) * r3.getAlpha()));
        }
        canvas3.restore();
        q2 q2Var4 = t2Var4.I4;
        q2Var4.b();
        if (t2Var4.C0 != 0.0f) {
            canvas3.save();
            canvas3.translate(0.0f, t2Var4.C0);
            f18 = t2Var4.C0 + 0.0f;
        } else {
            f18 = 0.0f;
        }
        float f32 = t2Var4.i0;
        if (f32 != 1.0f) {
            int i32 = -1;
            if (f32 != 0.0f) {
                float i33 = Utilities.i(f32 / 0.4f, 1.0f, 0.0f);
                if (iz.o() >= 2) {
                    f22 = f15;
                    i20 = -1;
                    q2Var = q2Var4;
                    f23 = 1.0f;
                    i32 = canvas3.saveLayerAlpha(com.google.android.recaptcha.internal.a.v(1.0f, i33, org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(az0.getRightPaddingSize() + 1)), 0.0f, t2Var4.getMeasuredWidth(), t2Var4.getMeasuredHeight(), (int) ((1.0f - t2Var4.i0) * 255.0f), 31);
                    i19 = 1;
                } else {
                    q2Var = q2Var4;
                    f22 = f15;
                    i20 = -1;
                    f23 = 1.0f;
                    int save = canvas3.save();
                    i19 = 1;
                    canvas3.clipRect(com.google.android.recaptcha.internal.a.v(1.0f, i33, org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(az0.getRightPaddingSize() + 1)), 0.0f, t2Var4.getMeasuredWidth(), t2Var4.getMeasuredHeight());
                    i32 = save;
                }
                canvas3.translate((-(t2Var4.getMeasuredWidth() - org.telegram.messenger.g0.L(74.0f))) * 0.7f * t2Var4.i0, 0.0f);
                f16 += (-(t2Var4.getMeasuredWidth() - org.telegram.messenger.g0.L(74.0f))) * 0.7f * t2Var4.i0;
            } else {
                q2Var = q2Var4;
                f22 = f15;
                f23 = 1.0f;
                i19 = 1;
                i20 = -1;
            }
            float f33 = f16;
            if (t2Var4.w1 != 0.0f || t2Var4.o1 != 0.0f) {
                canvas3.save();
                org.telegram.ui.ActionBar.m6.v0.setColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.d6, h6Var2));
                rectF2.set(t2Var4.getMeasuredWidth() - org.telegram.messenger.g0.L(64.0f), 0.0f, t2Var4.getMeasuredWidth(), t2Var4.getMeasuredHeight());
                rectF2.offset(0.0f, -t2Var4.E3);
                canvas3.drawRoundRect(rectF2, L2, L2, org.telegram.ui.ActionBar.m6.v0);
                if (t2Var4.q4) {
                    canvas3.drawRoundRect(rectF2, L2, L2, org.telegram.ui.ActionBar.m6.u0);
                }
                if (t2Var4.J0 != 0 && (!iz.q1 || t2Var4.D1 != 0.0f)) {
                    org.telegram.ui.ActionBar.m6.v0.setColor(org.telegram.messenger.g0.S0(t2Var4.D1, f23, 0, org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.s9, h6Var2)));
                    org.telegram.ui.ActionBar.m6.v0.setAlpha((int) ((f23 - t2Var4.i0) * r0.getAlpha()));
                } else if (t2Var4.getIsPinned() || t2Var4.z3) {
                    org.telegram.ui.ActionBar.m6.v0.setColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.s9, h6Var2));
                    org.telegram.ui.ActionBar.m6.v0.setAlpha((int) ((f23 - t2Var4.i0) * r0.getAlpha()));
                }
                canvas3.restore();
            }
            if (t2Var4.w1 != 0.0f) {
                float f34 = t2Var4.o1;
                if (f34 < f23) {
                    float f35 = f34 + 0.10666667f;
                    t2Var4.o1 = f35;
                    if (f35 > f23) {
                        t2Var4.o1 = f23;
                    }
                    i17 = i19;
                }
                i17 = 0;
            } else {
                float f36 = t2Var4.o1;
                if (f36 > 0.0f) {
                    float f37 = f36 - 0.10666667f;
                    t2Var4.o1 = f37;
                    if (f37 < 0.0f) {
                        t2Var4.o1 = 0.0f;
                    }
                    i17 = i19;
                }
                i17 = 0;
            }
            if (t2Var4.G2) {
                z.s(t2Var4.J2, t2Var4.K2, org.telegram.ui.ActionBar.m6.a1);
                org.telegram.ui.ActionBar.m6.a1.draw(canvas3);
            }
            boolean z27 = t2Var4.r2;
            int L3 = org.telegram.messenger.g0.L((z27 || iz.p1) ? 10.0f : 14.0f);
            if (((!z27 && !iz.p1) || t2Var4.W()) && t2Var4.S()) {
                L3 -= org.telegram.messenger.g0.L(t2Var4.W() ? 8.0f : 9.0f);
            }
            if (t2Var4.z2 != null) {
                if (!t2Var4.D2 || t2Var4.A2) {
                    f24 = 24.0f;
                    i21 = i32;
                } else {
                    if (t2Var4.C2 && t2Var4.E2 == null) {
                        Paint paint = new Paint();
                        t2Var4.E2 = paint;
                        paint.setShader(new LinearGradient(0.0f, 0.0f, org.telegram.messenger.g0.L(24.0f), 0.0f, new int[]{i20, 0}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
                        t2Var4.E2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                    } else if (t2Var4.F2 == null) {
                        Paint paint2 = new Paint();
                        t2Var4.F2 = paint2;
                        paint2.setShader(new LinearGradient(0.0f, 0.0f, org.telegram.messenger.g0.L(24.0f), 0.0f, new int[]{0, i20}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
                        t2Var4.F2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                    }
                    f24 = 24.0f;
                    i21 = i32;
                    canvas3.saveLayerAlpha(0.0f, 0.0f, t2Var4.getMeasuredWidth(), t2Var4.getMeasuredHeight(), qs.e4, 31);
                    int i34 = t2Var4.x2;
                    canvas3.clipRect(i34, 0, t2Var4.y2 + i34, t2Var4.getMeasuredHeight());
                }
                if (t2Var4.J0 != 0) {
                    TextPaint textPaint3 = org.telegram.ui.ActionBar.m6.B0[t2Var4.E0];
                    int w04 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Y8, h6Var2);
                    textPaint3.linkColor = w04;
                    textPaint3.setColor(w04);
                } else if (t2Var4.h2 != null || ((o2Var = t2Var4.G0) != null && o2Var.g == 2)) {
                    TextPaint textPaint4 = org.telegram.ui.ActionBar.m6.B0[t2Var4.E0];
                    int w05 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Z8, h6Var2);
                    textPaint4.linkColor = w05;
                    textPaint4.setColor(w05);
                } else {
                    TextPaint textPaint5 = org.telegram.ui.ActionBar.m6.B0[t2Var4.E0];
                    int w06 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.X8, h6Var2);
                    textPaint5.linkColor = w06;
                    textPaint5.setColor(w06);
                }
                canvas3.save();
                canvas3.translate(t2Var4.x2 + t2Var4.B2, L3);
                xh.f.f(canvas3, t2Var4.z2);
                StaticLayout staticLayout3 = t2Var4.z2;
                z16 = z27;
                i22 = i20;
                q2Var2 = q2Var;
                i23 = i19;
                org.telegram.ui.Components.q5.drawAnimatedEmojis(canvas3, staticLayout3, t2Var4.p3, -0.075f, null, 0.0f, 0.0f, 0.0f, 1.0f, t2Var4.Q(0, staticLayout3.getPaint().getColor()));
                canvas3.restore();
                if (t2Var4.D2 && !t2Var4.A2) {
                    canvas3.save();
                    if (t2Var4.C2) {
                        canvas3.translate(t2Var4.x2, 0.0f);
                        canvas3.drawRect(0.0f, 0.0f, org.telegram.messenger.g0.L(f24), t2Var4.getMeasuredHeight(), t2Var4.E2);
                    } else {
                        canvas3.translate((t2Var4.x2 + t2Var4.y2) - org.telegram.messenger.g0.L(f24), 0.0f);
                        canvas3.drawRect(0.0f, 0.0f, org.telegram.messenger.g0.L(f24), t2Var4.getMeasuredHeight(), t2Var4.F2);
                    }
                    canvas3.restore();
                    canvas3.restore();
                }
            } else {
                f24 = 24.0f;
                i21 = i32;
                z16 = z27;
                i22 = i20;
                q2Var2 = q2Var;
                i23 = i19;
            }
            if (t2Var4.N2 != null && t2Var4.J0 == 0) {
                canvas3.save();
                canvas3.translate(t2Var4.L2, t2Var4.M2);
                TextPaint timeTextPaint = t2Var4.getTimeTextPaint();
                if (t2Var4.getIsPinned()) {
                    canvas3.translate(org.telegram.messenger.g0.L(20.0f), 0.0f);
                    float height = (t2Var4.N2.getHeight() / f22) - org.telegram.messenger.g0.L(8.5f);
                    float f38 = -org.telegram.messenger.g0.L(20.0f);
                    float L4 = org.telegram.messenger.g0.L(6.0f) + t2Var4.N2.getWidth();
                    Drawable drawable = (!t2Var4.G3 || t2Var4.T()) ? org.telegram.ui.ActionBar.m6.k1 : org.telegram.ui.ActionBar.m6.l1;
                    int L5 = (int) (((org.telegram.messenger.g0.L(17.0f) - drawable.getIntrinsicHeight()) / f22) + height);
                    int L6 = org.telegram.messenger.g0.L(4.0f) + ((int) f38);
                    drawable.setBounds(L6, L5, drawable.getIntrinsicWidth() + L6, drawable.getIntrinsicHeight() + L5);
                    int alpha = timeTextPaint.getAlpha();
                    timeTextPaint.setAlpha(27);
                    canvas3.drawRoundRect(f38, height, L4, height + org.telegram.messenger.g0.L(17.0f), org.telegram.messenger.g0.L(8.5f), org.telegram.messenger.g0.L(8.5f), timeTextPaint);
                    timeTextPaint.setAlpha(alpha);
                    drawable.draw(canvas3);
                }
                int color = t2Var4.N2.getPaint().getColor();
                int i35 = color != timeTextPaint.getColor() ? i23 : 0;
                if (i35 != 0) {
                    t2Var4.N2.getPaint().setColor(timeTextPaint.getColor());
                }
                xh.f.f(canvas3, t2Var4.N2);
                if (i35 != 0) {
                    t2Var4.N2.getPaint().setColor(color);
                }
                canvas3.restore();
            }
            if (t2Var4.J()) {
                org.telegram.ui.ActionBar.m6.b1.setBounds(t2Var4.O2, ((t2Var4.N2.getHeight() - org.telegram.ui.ActionBar.m6.b1.getIntrinsicHeight()) / 2) + t2Var4.M2, org.telegram.ui.ActionBar.m6.b1.getIntrinsicWidth() + t2Var4.O2, org.telegram.ui.ActionBar.m6.b1.getIntrinsicHeight() + ((t2Var4.N2.getHeight() - org.telegram.ui.ActionBar.m6.b1.getIntrinsicHeight()) / 2) + t2Var4.M2);
                org.telegram.ui.ActionBar.m6.b1.draw(canvas3);
            }
            if (t2Var4.s3 != null && !t2Var4.W()) {
                if (t2Var4.J0 != 0) {
                    TextPaint textPaint6 = org.telegram.ui.ActionBar.m6.G0;
                    int w07 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.n9, h6Var2);
                    textPaint6.linkColor = w07;
                    textPaint6.setColor(w07);
                } else if (t2Var4.l2 != null) {
                    TextPaint textPaint7 = org.telegram.ui.ActionBar.m6.G0;
                    int w08 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.j9, h6Var2);
                    textPaint7.linkColor = w08;
                    textPaint7.setColor(w08);
                } else {
                    TextPaint textPaint8 = org.telegram.ui.ActionBar.m6.G0;
                    int w09 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.m9, h6Var2);
                    textPaint8.linkColor = w09;
                    textPaint8.setColor(w09);
                }
                canvas3.save();
                canvas3.translate(t2Var4.r3, t2Var4.q3);
                try {
                    xh.f.f(canvas3, t2Var4.s3);
                    StaticLayout staticLayout4 = t2Var4.s3;
                    org.telegram.ui.Components.q5.drawAnimatedEmojis(canvas3, staticLayout4, t2Var4.n3, -0.075f, null, 0.0f, 0.0f, 0.0f, 1.0f, t2Var4.Q(i23, staticLayout4.getPaint().getColor()));
                } catch (Exception e10) {
                    org.telegram.messenger.a8.f(e10);
                }
                canvas3.restore();
            }
            if (t2Var4.e3 != null) {
                if (t2Var4.J0 == 0) {
                    TextPaint textPaint9 = org.telegram.ui.ActionBar.m6.F0[t2Var4.E0];
                    int w010 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.g9, h6Var2);
                    textPaint9.linkColor = w010;
                    textPaint9.setColor(w010);
                } else if (t2Var4.g2 != null) {
                    TextPaint textPaint10 = org.telegram.ui.ActionBar.m6.F0[t2Var4.E0];
                    int w011 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.l9, h6Var2);
                    textPaint10.linkColor = w011;
                    textPaint10.setColor(w011);
                } else {
                    TextPaint textPaint11 = org.telegram.ui.ActionBar.m6.F0[t2Var4.E0];
                    int w012 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.h9, h6Var2);
                    textPaint11.linkColor = w012;
                    textPaint11.setColor(w012);
                }
                float L7 = org.telegram.messenger.g0.L(14.0f);
                q2 q2Var5 = q2Var2;
                float f39 = q2Var5.m ? t2Var4.a3 - (q2Var5.l * L7) : t2Var4.a3 + (q2Var5.l * L7);
                if (((!z16 && !iz.p1) || t2Var4.W()) && t2Var4.S()) {
                    f39 -= org.telegram.messenger.g0.L(t2Var4.W() ? 10.0f : 11.0f);
                }
                if (q2Var5.l != 1.0f) {
                    canvas3.save();
                    canvas3.translate(t2Var4.b3, f39);
                    int alpha2 = t2Var4.e3.getPaint().getAlpha();
                    t2Var4.e3.getPaint().setAlpha((int) ((1.0f - q2Var5.l) * alpha2));
                    ArrayList arrayList = t2Var4.j3;
                    if (arrayList.isEmpty()) {
                        f28 = L7;
                        rectF = rectF2;
                        h6Var4 = h6Var2;
                        sdVar4 = sdVar3;
                        q2Var3 = q2Var5;
                        i27 = alpha2;
                        f25 = 1.0f;
                        xh.f.f(canvas3, t2Var4.e3);
                        StaticLayout staticLayout5 = t2Var4.e3;
                        org.telegram.ui.Components.q5.drawAnimatedEmojis(canvas3, staticLayout5, t2Var4.m3, -0.075f, null, 0.0f, 0.0f, 0.0f, 1.0f, t2Var4.Q(2, staticLayout5.getPaint().getColor()));
                    } else {
                        try {
                            canvas3.save();
                            xh.f.d(canvas3, arrayList);
                            xh.f.f(canvas3, t2Var4.e3);
                        } catch (Exception e11) {
                            e = e11;
                            f28 = L7;
                        }
                        try {
                            StaticLayout staticLayout6 = t2Var4.e3;
                            try {
                                h6Var4 = h6Var2;
                                f28 = L7;
                                f25 = 1.0f;
                                sdVar4 = sdVar3;
                                i27 = alpha2;
                                rectF = rectF2;
                                q2Var3 = q2Var5;
                            } catch (Exception e12) {
                                e = e12;
                                f28 = L7;
                                rectF = rectF2;
                                h6Var4 = h6Var2;
                                sdVar4 = sdVar3;
                                q2Var3 = q2Var5;
                                i27 = alpha2;
                                f25 = 1.0f;
                                org.telegram.messenger.a8.f(e);
                                t2Var4.e3.getPaint().setAlpha(i27);
                                canvas3.restore();
                                canvas3.save();
                                if (!q2Var3.m) {
                                }
                                if (!z16) {
                                    z22 -= org.telegram.messenger.g0.L(t2Var4.W() ? 10.0f : 11.0f);
                                    canvas3.translate(t2Var4.d3, z22);
                                    staticLayout2 = t2Var4.f3;
                                    if (staticLayout2 != null) {
                                        int alpha3 = staticLayout2.getPaint().getAlpha();
                                        t2Var4.f3.getPaint().setAlpha((int) (alpha3 * q2Var3.l));
                                        t2Var4.f3.draw(canvas3);
                                        t2Var4.f3.getPaint().setAlpha(alpha3);
                                    }
                                    canvas3.restore();
                                    if (t2Var4.f3 != null) {
                                        if (i26 < 0) {
                                        }
                                        u02 = org.telegram.ui.ActionBar.m6.u0(i26);
                                        if (u02 != null) {
                                        }
                                    }
                                    if (t2Var4.h3 != null) {
                                    }
                                    if (t2Var4.J0 == 0) {
                                    }
                                    float f40 = 12.5f;
                                    if (t2Var3.k4) {
                                    }
                                    h6Var3 = h6Var4;
                                    if (t2Var3.b1) {
                                    }
                                    if (t2Var3.j1 != 2) {
                                    }
                                    i15 = 17;
                                    if (!t2Var3.j4) {
                                    }
                                    z12 = z17 ? 1 : 0;
                                    if (!t2Var3.y3) {
                                    }
                                    if (!id.a0) {
                                    }
                                    org.telegram.ui.ActionBar.m6.Z0.setAlpha((int) (t2Var3.x3 * 255.0f));
                                    z.s(t2Var3.D3, t2Var3.C3, org.telegram.ui.ActionBar.m6.Z0);
                                    org.telegram.ui.ActionBar.m6.Z0.draw(canvas3);
                                    float f41 = t2Var3.S3.e;
                                    if (t2Var3.t3) {
                                    }
                                    t2Var = t2Var3;
                                    f19 = f25;
                                    if (t2Var.H3) {
                                    }
                                    if (t2Var.R1 > 0) {
                                    }
                                    eVar = t2Var.t0;
                                    if (eVar != null) {
                                    }
                                    i24 = i21;
                                    r12 = z17;
                                    if (i24 != -1) {
                                    }
                                    z13 = t2Var.b2;
                                    imageReceiver = t2Var.Y1;
                                    if (z13) {
                                    }
                                    z14 = t2Var.y;
                                    m2Var = t2Var.u0;
                                    if (z14) {
                                        if (!t2Var.D) {
                                        }
                                        if (!t2Var.O0) {
                                            float centerX = m2Var.F.centerX() + org.telegram.messenger.g0.L(20.33f);
                                            float centerY = m2Var.F.centerY() + org.telegram.messenger.g0.L(19.0f);
                                            if (t2Var.D0 == null) {
                                            }
                                            bg.s.d(t2Var.D0, centerX, centerY, i15);
                                            canvas3.drawCircle(t2Var.D0.getBounds().exactCenterX(), t2Var.D0.getBounds().exactCenterY(), org.telegram.messenger.g0.L(8.0f), org.telegram.ui.ActionBar.m6.n0(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.d6, h6Var3)));
                                            t2Var.D0.draw(canvas3);
                                        }
                                    }
                                    if (t2Var.b2) {
                                    }
                                    if (imageReceiver.H()) {
                                        i17 = 1;
                                    }
                                    if (t2Var.i0 > 0.0f) {
                                    }
                                    t2Var2 = t2Var;
                                    if (t2Var2.C0 != 0.0f) {
                                    }
                                    if (t2Var2.w1 != 0.0f) {
                                    }
                                    if (z10) {
                                        canvas3.save();
                                        canvas3.translate(0.0f, (-t2Var2.E3) - (t2Var2.n * t2Var2.i0));
                                        canvas3.clipRect(0.0f, (f19 - t2Var2.e2.J) * t2Var2.getMeasuredHeight(), t2Var2.getMeasuredWidth(), t2Var2.getMeasuredHeight());
                                        t2Var2.e2.c(canvas3, r12);
                                        canvas3.restore();
                                    }
                                    if (t2Var2.s2) {
                                    }
                                    f20 = 0.0f;
                                    i18 = 1;
                                    if (t2Var2.t1 != f20) {
                                    }
                                    canvas2 = canvas;
                                    if (z24) {
                                    }
                                    z15 = t2Var2.y3;
                                    if (!z15) {
                                    }
                                    if (z15) {
                                    }
                                    i17 = i18;
                                    if (t2Var2.m1) {
                                    }
                                }
                                z22 -= org.telegram.messenger.g0.L(t2Var4.W() ? 10.0f : 11.0f);
                                canvas3.translate(t2Var4.d3, z22);
                                staticLayout2 = t2Var4.f3;
                                if (staticLayout2 != null) {
                                }
                                canvas3.restore();
                                if (t2Var4.f3 != null) {
                                }
                                if (t2Var4.h3 != null) {
                                }
                                if (t2Var4.J0 == 0) {
                                }
                                float f402 = 12.5f;
                                if (t2Var3.k4) {
                                }
                                h6Var3 = h6Var4;
                                if (t2Var3.b1) {
                                }
                                if (t2Var3.j1 != 2) {
                                }
                                i15 = 17;
                                if (!t2Var3.j4) {
                                }
                                z12 = z17 ? 1 : 0;
                                if (!t2Var3.y3) {
                                }
                                if (!id.a0) {
                                }
                                org.telegram.ui.ActionBar.m6.Z0.setAlpha((int) (t2Var3.x3 * 255.0f));
                                z.s(t2Var3.D3, t2Var3.C3, org.telegram.ui.ActionBar.m6.Z0);
                                org.telegram.ui.ActionBar.m6.Z0.draw(canvas3);
                                float f412 = t2Var3.S3.e;
                                if (t2Var3.t3) {
                                }
                                t2Var = t2Var3;
                                f19 = f25;
                                if (t2Var.H3) {
                                }
                                if (t2Var.R1 > 0) {
                                }
                                eVar = t2Var.t0;
                                if (eVar != null) {
                                }
                                i24 = i21;
                                r12 = z17;
                                if (i24 != -1) {
                                }
                                z13 = t2Var.b2;
                                imageReceiver = t2Var.Y1;
                                if (z13) {
                                }
                                z14 = t2Var.y;
                                m2Var = t2Var.u0;
                                if (z14) {
                                }
                                if (t2Var.b2) {
                                }
                                if (imageReceiver.H()) {
                                }
                                if (t2Var.i0 > 0.0f) {
                                }
                                t2Var2 = t2Var;
                                if (t2Var2.C0 != 0.0f) {
                                }
                                if (t2Var2.w1 != 0.0f) {
                                }
                                if (z10) {
                                }
                                if (t2Var2.s2) {
                                }
                                f20 = 0.0f;
                                i18 = 1;
                                if (t2Var2.t1 != f20) {
                                }
                                canvas2 = canvas;
                                if (z24) {
                                }
                                z15 = t2Var2.y3;
                                if (!z15) {
                                }
                                if (z15) {
                                }
                                i17 = i18;
                                if (t2Var2.m1) {
                                }
                            }
                            try {
                                org.telegram.ui.Components.q5.drawAnimatedEmojis(canvas3, staticLayout6, t2Var4.m3, -0.075f, arrayList, 0.0f, 0.0f, 0.0f, 1.0f, t2Var4.Q(2, staticLayout6.getPaint().getColor()));
                                canvas3.restore();
                                for (int i36 = 0; i36 < arrayList.size(); i36++) {
                                    xh.f fVar = (xh.f) arrayList.get(i36);
                                    fVar.h(t2Var4.e3.getPaint().getColor());
                                    fVar.draw(canvas3);
                                }
                            } catch (Exception e13) {
                                e = e13;
                                org.telegram.messenger.a8.f(e);
                                t2Var4.e3.getPaint().setAlpha(i27);
                                canvas3.restore();
                                canvas3.save();
                                if (!q2Var3.m) {
                                }
                                if (!z16) {
                                }
                                z22 -= org.telegram.messenger.g0.L(t2Var4.W() ? 10.0f : 11.0f);
                                canvas3.translate(t2Var4.d3, z22);
                                staticLayout2 = t2Var4.f3;
                                if (staticLayout2 != null) {
                                }
                                canvas3.restore();
                                if (t2Var4.f3 != null) {
                                }
                                if (t2Var4.h3 != null) {
                                }
                                if (t2Var4.J0 == 0) {
                                }
                                float f4022 = 12.5f;
                                if (t2Var3.k4) {
                                }
                                h6Var3 = h6Var4;
                                if (t2Var3.b1) {
                                }
                                if (t2Var3.j1 != 2) {
                                }
                                i15 = 17;
                                if (!t2Var3.j4) {
                                }
                                z12 = z17 ? 1 : 0;
                                if (!t2Var3.y3) {
                                }
                                if (!id.a0) {
                                }
                                org.telegram.ui.ActionBar.m6.Z0.setAlpha((int) (t2Var3.x3 * 255.0f));
                                z.s(t2Var3.D3, t2Var3.C3, org.telegram.ui.ActionBar.m6.Z0);
                                org.telegram.ui.ActionBar.m6.Z0.draw(canvas3);
                                float f4122 = t2Var3.S3.e;
                                if (t2Var3.t3) {
                                }
                                t2Var = t2Var3;
                                f19 = f25;
                                if (t2Var.H3) {
                                }
                                if (t2Var.R1 > 0) {
                                }
                                eVar = t2Var.t0;
                                if (eVar != null) {
                                }
                                i24 = i21;
                                r12 = z17;
                                if (i24 != -1) {
                                }
                                z13 = t2Var.b2;
                                imageReceiver = t2Var.Y1;
                                if (z13) {
                                }
                                z14 = t2Var.y;
                                m2Var = t2Var.u0;
                                if (z14) {
                                }
                                if (t2Var.b2) {
                                }
                                if (imageReceiver.H()) {
                                }
                                if (t2Var.i0 > 0.0f) {
                                }
                                t2Var2 = t2Var;
                                if (t2Var2.C0 != 0.0f) {
                                }
                                if (t2Var2.w1 != 0.0f) {
                                }
                                if (z10) {
                                }
                                if (t2Var2.s2) {
                                }
                                f20 = 0.0f;
                                i18 = 1;
                                if (t2Var2.t1 != f20) {
                                }
                                canvas2 = canvas;
                                if (z24) {
                                }
                                z15 = t2Var2.y3;
                                if (!z15) {
                                }
                                if (z15) {
                                }
                                i17 = i18;
                                if (t2Var2.m1) {
                                }
                            }
                        } catch (Exception e14) {
                            e = e14;
                            f28 = L7;
                            rectF = rectF2;
                            h6Var4 = h6Var2;
                            sdVar4 = sdVar3;
                            q2Var3 = q2Var5;
                            i27 = alpha2;
                            f25 = 1.0f;
                            org.telegram.messenger.a8.f(e);
                            t2Var4.e3.getPaint().setAlpha(i27);
                            canvas3.restore();
                            canvas3.save();
                            if (!q2Var3.m) {
                            }
                            if (!z16) {
                            }
                            z22 -= org.telegram.messenger.g0.L(t2Var4.W() ? 10.0f : 11.0f);
                            canvas3.translate(t2Var4.d3, z22);
                            staticLayout2 = t2Var4.f3;
                            if (staticLayout2 != null) {
                            }
                            canvas3.restore();
                            if (t2Var4.f3 != null) {
                            }
                            if (t2Var4.h3 != null) {
                            }
                            if (t2Var4.J0 == 0) {
                            }
                            float f40222 = 12.5f;
                            if (t2Var3.k4) {
                            }
                            h6Var3 = h6Var4;
                            if (t2Var3.b1) {
                            }
                            if (t2Var3.j1 != 2) {
                            }
                            i15 = 17;
                            if (!t2Var3.j4) {
                            }
                            z12 = z17 ? 1 : 0;
                            if (!t2Var3.y3) {
                            }
                            if (!id.a0) {
                            }
                            org.telegram.ui.ActionBar.m6.Z0.setAlpha((int) (t2Var3.x3 * 255.0f));
                            z.s(t2Var3.D3, t2Var3.C3, org.telegram.ui.ActionBar.m6.Z0);
                            org.telegram.ui.ActionBar.m6.Z0.draw(canvas3);
                            float f41222 = t2Var3.S3.e;
                            if (t2Var3.t3) {
                            }
                            t2Var = t2Var3;
                            f19 = f25;
                            if (t2Var.H3) {
                            }
                            if (t2Var.R1 > 0) {
                            }
                            eVar = t2Var.t0;
                            if (eVar != null) {
                            }
                            i24 = i21;
                            r12 = z17;
                            if (i24 != -1) {
                            }
                            z13 = t2Var.b2;
                            imageReceiver = t2Var.Y1;
                            if (z13) {
                            }
                            z14 = t2Var.y;
                            m2Var = t2Var.u0;
                            if (z14) {
                            }
                            if (t2Var.b2) {
                            }
                            if (imageReceiver.H()) {
                            }
                            if (t2Var.i0 > 0.0f) {
                            }
                            t2Var2 = t2Var;
                            if (t2Var2.C0 != 0.0f) {
                            }
                            if (t2Var2.w1 != 0.0f) {
                            }
                            if (z10) {
                            }
                            if (t2Var2.s2) {
                            }
                            f20 = 0.0f;
                            i18 = 1;
                            if (t2Var2.t1 != f20) {
                            }
                            canvas2 = canvas;
                            if (z24) {
                            }
                            z15 = t2Var2.y3;
                            if (!z15) {
                            }
                            if (z15) {
                            }
                            i17 = i18;
                            if (t2Var2.m1) {
                            }
                        }
                    }
                    t2Var4.e3.getPaint().setAlpha(i27);
                    canvas3.restore();
                } else {
                    f28 = L7;
                    rectF = rectF2;
                    h6Var4 = h6Var2;
                    sdVar4 = sdVar3;
                    q2Var3 = q2Var5;
                    f25 = 1.0f;
                }
                canvas3.save();
                z22 = !q2Var3.m ? com.google.android.recaptcha.internal.a.z(f25, q2Var3.l, f28, t2Var4.a3) : com.google.android.recaptcha.internal.a.v(f25, q2Var3.l, f28, t2Var4.a3);
                if (((!z16 && !iz.p1) || t2Var4.W()) && t2Var4.S()) {
                    z22 -= org.telegram.messenger.g0.L(t2Var4.W() ? 10.0f : 11.0f);
                }
                canvas3.translate(t2Var4.d3, z22);
                staticLayout2 = t2Var4.f3;
                if (staticLayout2 != null && q2Var3.l > 0.0f) {
                    int alpha32 = staticLayout2.getPaint().getAlpha();
                    t2Var4.f3.getPaint().setAlpha((int) (alpha32 * q2Var3.l));
                    t2Var4.f3.draw(canvas3);
                    t2Var4.f3.getPaint().setAlpha(alpha32);
                }
                canvas3.restore();
                if (t2Var4.f3 != null && ((i26 = t2Var4.j2) >= 0 || (q2Var3.l > 0.0f && q2Var3.n >= 0))) {
                    if (i26 < 0) {
                        i26 = q2Var3.n;
                    }
                    u02 = org.telegram.ui.ActionBar.m6.u0(i26);
                    if (u02 != null) {
                        canvas3.save();
                        u02.b(i0.a.o(org.telegram.ui.ActionBar.m6.v0(org.telegram.ui.ActionBar.m6.p9), (int) (Color.alpha(r4) * q2Var3.l)));
                        float z28 = q2Var3.m ? com.google.android.recaptcha.internal.a.z(f25, q2Var3.l, f28, t2Var4.a3) : com.google.android.recaptcha.internal.a.v(f25, q2Var3.l, f28, t2Var4.a3);
                        if (((!z16 && !iz.p1) || t2Var4.W()) && t2Var4.S()) {
                            z28 -= org.telegram.messenger.g0.L(t2Var4.W() ? 10.0f : 11.0f);
                        }
                        if (i26 == 1 || i26 == 4) {
                            canvas3.translate(t2Var4.C4, z28 + (i26 == 1 ? org.telegram.messenger.g0.L(f25) : 0));
                        } else {
                            canvas3.translate(t2Var4.C4, ((org.telegram.messenger.g0.L(18.0f) - u02.getIntrinsicHeight()) / f22) + z28);
                        }
                        u02.draw(canvas3);
                        t2Var4.invalidate();
                        canvas3.restore();
                    }
                }
            } else {
                rectF = rectF2;
                h6Var4 = h6Var2;
                sdVar4 = sdVar3;
                q2Var3 = q2Var2;
                f25 = 1.0f;
            }
            if (t2Var4.h3 != null) {
                canvas3.save();
                if (t2Var4.b0 == null) {
                    t2Var4.b0 = new Paint(1);
                }
                if (t2Var4.c0 == null) {
                    oc ocVar = new oc(t2Var4);
                    t2Var4.c0 = ocVar;
                    z21 = false;
                    final boolean z29 = false ? 1 : 0;
                    ocVar.e(new Runnable(t2Var4) { // from class: org.telegram.ui.Cells.k2
                        public final /* synthetic */ t2 b;

                        {
                            this.b = t2Var4;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (z29) {
                                case 0:
                                    t2 t2Var5 = this.b;
                                    p2 p2Var = t2Var5.d0;
                                    if (p2Var != null) {
                                        p2Var.r(t2Var5);
                                        break;
                                    }
                                    break;
                                default:
                                    t2 t2Var6 = this.b;
                                    p2 p2Var2 = t2Var6.d0;
                                    if (p2Var2 != null) {
                                        p2Var2.l(t2Var6);
                                        break;
                                    }
                                    break;
                            }
                        }
                    });
                    oc ocVar2 = t2Var4.c0;
                    final int i37 = 1;
                    Runnable runnable = new Runnable(t2Var4) { // from class: org.telegram.ui.Cells.k2
                        public final /* synthetic */ t2 b;

                        {
                            this.b = t2Var4;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i37) {
                                case 0:
                                    t2 t2Var5 = this.b;
                                    p2 p2Var = t2Var5.d0;
                                    if (p2Var != null) {
                                        p2Var.r(t2Var5);
                                        break;
                                    }
                                    break;
                                default:
                                    t2 t2Var6 = this.b;
                                    p2 p2Var2 = t2Var6.d0;
                                    if (p2Var2 != null) {
                                        p2Var2.l(t2Var6);
                                        break;
                                    }
                                    break;
                            }
                        }
                    };
                    ocVar2.l = true;
                    ocVar2.j = runnable;
                } else {
                    z21 = false;
                }
                if (t2Var4.f0 && t2Var4.M4 != 0 && ((i25 = t2Var4.j1) == 0 || i25 == 7 || i25 == 8)) {
                    t2Var4.c0.d(i0.a.o(t2Var4.a0.getColor(), org.telegram.ui.ActionBar.m6.j1() ? 36 : 26));
                    oc ocVar3 = t2Var4.c0;
                    ocVar3.i = z21;
                    ocVar3.c = z21 ? 1 : 0;
                    int i38 = t2Var4.M4;
                    if (i38 != 0 && i38 > 0) {
                        float f42 = t2Var4.a3;
                        if (((!z16 && !iz.p1) || t2Var4.W()) && t2Var4.S()) {
                            f42 -= org.telegram.messenger.g0.L(t2Var4.W() ? 10.0f : 11.0f);
                        }
                        RectF rectF3 = org.telegram.messenger.g0.P;
                        float primaryHorizontal = t2Var4.e3.getPrimaryHorizontal(z21 ? 1 : 0) + org.telegram.messenger.g0.L(f22) + t2Var4.b3;
                        float f43 = t2Var4.b3;
                        StaticLayout staticLayout7 = t2Var4.e3;
                        rectF3.set(primaryHorizontal, f42, (staticLayout7.getPrimaryHorizontal(Math.min(staticLayout7.getText().length(), t2Var4.M4)) + f43) - org.telegram.messenger.g0.L(3.0f), t2Var4.g3 - org.telegram.messenger.g0.L(4.0f));
                        rectF3.inset(-org.telegram.messenger.g0.L(8.0f), -org.telegram.messenger.g0.L(4.0f));
                        if (rectF3.right > rectF3.left) {
                            t2Var4.c0.a(rectF3);
                        }
                    }
                    float lineLeft = t2Var4.h3.getLineLeft(z21 ? 1 : 0);
                    RectF rectF4 = org.telegram.messenger.g0.P;
                    rectF4.set(t2Var4.c3 + lineLeft + org.telegram.messenger.g0.L(f22), org.telegram.messenger.g0.L(f22) + t2Var4.g3, t2Var4.h3.getLineWidth(z21 ? 1 : 0) + t2Var4.c3 + lineLeft + org.telegram.messenger.g0.L(12.0f), t2Var4.h3.getHeight() + t2Var4.g3);
                    rectF4.inset(-org.telegram.messenger.g0.L(8.0f), -org.telegram.messenger.g0.L(3.0f));
                    t2Var4.c0.a(rectF4);
                    oc ocVar4 = t2Var4.c0;
                    ocVar4.c(canvas3, ocVar4.g);
                    y yVar = ocVar4.e;
                    if (yVar != null) {
                        yVar.draw(canvas3);
                    }
                    org.telegram.ui.ActionBar.m6.t1.setAlpha(qs.J1);
                    z.t(org.telegram.ui.ActionBar.m6.t1, rectF4.right - org.telegram.messenger.g0.L(18.0f), com.google.android.recaptcha.internal.a.A(rectF4.height(), org.telegram.ui.ActionBar.m6.t1.getIntrinsicHeight(), f22, rectF4.top));
                    org.telegram.ui.ActionBar.m6.t1.draw(canvas3);
                }
                canvas3.translate(t2Var4.c3, t2Var4.g3);
                ArrayList arrayList2 = t2Var4.l3;
                if (arrayList2.isEmpty()) {
                    xh.f.f(canvas3, t2Var4.h3);
                    StaticLayout staticLayout8 = t2Var4.h3;
                    org.telegram.ui.Components.q5.drawAnimatedEmojis(canvas3, staticLayout8, t2Var4.o3, -0.075f, null, 0.0f, 0.0f, 0.0f, 1.0f, t2Var4.Q(3, staticLayout8.getPaint().getColor()));
                } else {
                    try {
                        canvas3.save();
                        xh.f.d(canvas3, arrayList2);
                        xh.f.f(canvas3, t2Var4.h3);
                        StaticLayout staticLayout9 = t2Var4.h3;
                        org.telegram.ui.Components.q5.drawAnimatedEmojis(canvas3, staticLayout9, t2Var4.o3, -0.075f, arrayList2, 0.0f, 0.0f, 0.0f, 1.0f, t2Var4.Q(3, staticLayout9.getPaint().getColor()));
                        canvas3.restore();
                        for (int i39 = z21 ? 1 : 0; i39 < arrayList2.size(); i39++) {
                            xh.f fVar2 = (xh.f) arrayList2.get(i39);
                            fVar2.h(t2Var4.h3.getPaint().getColor());
                            fVar2.draw(canvas3);
                        }
                    } catch (Exception e15) {
                        org.telegram.messenger.a8.f(e15);
                    }
                }
                canvas.restore();
                z17 = z21;
            } else {
                z17 = false;
            }
            if (t2Var4.J0 == 0) {
                int i40 = (t2Var4.S2 ? 1 : 0) + (t2Var4.Q2 ? 2 : z17 ? 1 : 0) + (t2Var4.R2 ? 4 : z17 ? 1 : 0);
                int i41 = t2Var4.x4;
                if (i41 >= 0 && i41 != i40 && !t2Var4.z4) {
                    t2Var4.E(i41, i40);
                }
                boolean z30 = t2Var4.z4;
                if (z30) {
                    i40 = t2Var4.v4;
                }
                boolean z31 = (i40 & 1) != 0 ? true : z17 ? 1 : 0;
                boolean z32 = (i40 & 2) != 0 ? true : z17 ? 1 : 0;
                boolean z33 = (i40 & 4) != 0 ? true : z17 ? 1 : 0;
                if (z30) {
                    int i42 = t2Var4.w4;
                    boolean z34 = (i42 & 1) != 0 ? true : z17 ? 1 : 0;
                    boolean z35 = (i42 & 2) != 0 ? true : z17 ? 1 : 0;
                    i16 = 4;
                    if ((i42 & 4) != 0) {
                        z19 = z33;
                        z20 = true;
                    } else {
                        z19 = z33;
                        z20 = z17 ? 1 : 0;
                    }
                    if (z31 || z34 || !z20 || z35 || !z32 || !z19) {
                        boolean z36 = z32;
                        boolean z37 = z35;
                        canvas3 = canvas;
                        t2Var4.H(canvas3, z34, z37, z20, false, f25 - t2Var4.y4);
                        t2Var4.H(canvas3, z31, z36, z19, false, t2Var4.y4);
                        t2Var3 = this;
                        t2Var3.x4 = (t2Var3.S2 ? 1 : 0) + (!t2Var3.Q2 ? 2 : z17 ? 1 : 0) + (!t2Var3.R2 ? i16 : z17 ? 1 : 0);
                    } else {
                        canvas3 = canvas;
                        t2Var4.H(canvas3, z31, z32, z19, true, t2Var4.y4);
                    }
                } else {
                    i16 = 4;
                    t2Var4 = this;
                    canvas3 = canvas;
                    t2Var4.H(canvas3, z31, z32, z33, false, 1.0f);
                }
                t2Var3 = t2Var4;
                t2Var3.x4 = (t2Var3.S2 ? 1 : 0) + (!t2Var3.Q2 ? 2 : z17 ? 1 : 0) + (!t2Var3.R2 ? i16 : z17 ? 1 : 0);
            } else {
                canvas3 = canvas;
                t2Var3 = t2Var4;
                i16 = 4;
            }
            float f402222 = 12.5f;
            if (t2Var3.k4) {
                int L8 = org.telegram.messenger.g0.L((z16 || iz.p1) ? 12.5f : 15.5f);
                if (((!z16 && !iz.p1) || t2Var3.W()) && t2Var3.S()) {
                    L8 -= org.telegram.messenger.g0.L(9.0f);
                }
                org.telegram.ui.Components.f5 f5Var = t2Var3.o4;
                if (f5Var != null) {
                    f5Var.setBounds(t2Var3.x2 - org.telegram.messenger.g0.L(19.0f), org.telegram.messenger.g0.L(-1.0f) + L8, t2Var3.x2 - org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(16.0f) + L8);
                    h6Var3 = h6Var4;
                    f5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.z9, h6Var3)));
                    f5Var.draw(canvas3);
                    boolean z38 = (!t2Var3.b1 || t2Var3.Z0 || t2Var3.Q0) ? true : z17 ? 1 : 0;
                    if (t2Var3.j1 != 2 || ((!z38 && t2Var3.c1 <= 0.0f) || t2Var3.j4 || t2Var3.p4 != 0)) {
                        i15 = 17;
                    } else {
                        if (z38) {
                            float f44 = t2Var3.c1;
                            if (f44 != f25) {
                                float f45 = f44 + 0.10666667f;
                                t2Var3.c1 = f45;
                                if (f45 > f25) {
                                    t2Var3.c1 = f25;
                                } else {
                                    t2Var3.invalidate();
                                }
                                float L9 = (!t2Var3.l4 ? t2Var3.I2 : t2Var3.H2) - org.telegram.messenger.g0.L((!z16 || iz.p1) ? 0.0f : f25);
                                float L10 = org.telegram.messenger.g0.L(!iz.p1 ? 13.5f : 17.5f);
                                if (((!z16 && !iz.p1) || t2Var3.W()) && t2Var3.S()) {
                                    L10 -= org.telegram.messenger.g0.L(t2Var3.W() ? 8.0f : 9.0f);
                                }
                                z.t(org.telegram.ui.ActionBar.m6.c1, L9, L10);
                                z.t(org.telegram.ui.ActionBar.m6.d1, L9, L10);
                                i15 = 17;
                                bg.s.d(org.telegram.ui.ActionBar.m6.e1, org.telegram.ui.ActionBar.m6.c1.getBounds().exactCenterX() + org.telegram.messenger.g0.L(2.0f), org.telegram.ui.ActionBar.m6.c1.getBounds().exactCenterY(), 17);
                                if (t2Var3.c1 != f25) {
                                    canvas3.save();
                                    float f46 = t2Var3.c1;
                                    canvas3.scale(f46, f46, org.telegram.ui.ActionBar.m6.c1.getBounds().centerX(), org.telegram.ui.ActionBar.m6.c1.getBounds().centerY());
                                    if (t2Var3.Q0) {
                                        org.telegram.ui.ActionBar.m6.e1.setAlpha((int) (t2Var3.c1 * 255.0f));
                                        org.telegram.ui.ActionBar.m6.e1.draw(canvas3);
                                        org.telegram.ui.ActionBar.m6.e1.setAlpha(qs.e4);
                                    } else if (t2Var3.b1) {
                                        org.telegram.ui.ActionBar.m6.d1.setAlpha((int) (t2Var3.c1 * 255.0f));
                                        org.telegram.ui.ActionBar.m6.d1.draw(canvas3);
                                        org.telegram.ui.ActionBar.m6.d1.setAlpha(qs.e4);
                                    } else {
                                        org.telegram.ui.ActionBar.m6.c1.setAlpha((int) (t2Var3.c1 * 255.0f));
                                        org.telegram.ui.ActionBar.m6.c1.draw(canvas3);
                                        org.telegram.ui.ActionBar.m6.c1.setAlpha(qs.e4);
                                    }
                                    canvas3.restore();
                                } else if (t2Var3.Q0) {
                                    org.telegram.ui.ActionBar.m6.e1.draw(canvas3);
                                } else if (t2Var3.b1) {
                                    org.telegram.ui.ActionBar.m6.d1.draw(canvas3);
                                } else {
                                    org.telegram.ui.ActionBar.m6.c1.draw(canvas3);
                                }
                            }
                        }
                        if (!z38) {
                            float f47 = t2Var3.c1;
                            if (f47 != 0.0f) {
                                float f48 = f47 - 0.10666667f;
                                t2Var3.c1 = f48;
                                if (f48 < 0.0f) {
                                    t2Var3.c1 = 0.0f;
                                } else {
                                    t2Var3.invalidate();
                                }
                            }
                        }
                        float L92 = (!t2Var3.l4 ? t2Var3.I2 : t2Var3.H2) - org.telegram.messenger.g0.L((!z16 || iz.p1) ? 0.0f : f25);
                        float L102 = org.telegram.messenger.g0.L(!iz.p1 ? 13.5f : 17.5f);
                        if (!z16) {
                            L102 -= org.telegram.messenger.g0.L(t2Var3.W() ? 8.0f : 9.0f);
                            z.t(org.telegram.ui.ActionBar.m6.c1, L92, L102);
                            z.t(org.telegram.ui.ActionBar.m6.d1, L92, L102);
                            i15 = 17;
                            bg.s.d(org.telegram.ui.ActionBar.m6.e1, org.telegram.ui.ActionBar.m6.c1.getBounds().exactCenterX() + org.telegram.messenger.g0.L(2.0f), org.telegram.ui.ActionBar.m6.c1.getBounds().exactCenterY(), 17);
                            if (t2Var3.c1 != f25) {
                            }
                        }
                        L102 -= org.telegram.messenger.g0.L(t2Var3.W() ? 8.0f : 9.0f);
                        z.t(org.telegram.ui.ActionBar.m6.c1, L92, L102);
                        z.t(org.telegram.ui.ActionBar.m6.d1, L92, L102);
                        i15 = 17;
                        bg.s.d(org.telegram.ui.ActionBar.m6.e1, org.telegram.ui.ActionBar.m6.c1.getBounds().exactCenterX() + org.telegram.messenger.g0.L(2.0f), org.telegram.ui.ActionBar.m6.c1.getBounds().exactCenterY(), 17);
                        if (t2Var3.c1 != f25) {
                        }
                    }
                    if (!t2Var3.j4) {
                        float L11 = org.telegram.messenger.g0.L((z16 || iz.p1) ? 13.5f : 16.5f);
                        if (((!z16 && !iz.p1) || t2Var3.W()) && t2Var3.S()) {
                            L11 -= org.telegram.messenger.g0.L(9.0f);
                        }
                        z.t(org.telegram.ui.ActionBar.m6.f1, t2Var3.H2 - org.telegram.messenger.g0.L(f25), L11);
                        z.t(org.telegram.ui.ActionBar.m6.i1, t2Var3.H2 - org.telegram.messenger.g0.L(f25), L11);
                        org.telegram.ui.ActionBar.m6.f1.draw(canvas3);
                        org.telegram.ui.ActionBar.m6.i1.draw(canvas3);
                        ecVar2 = ecVar;
                    } else if (t2Var3.l4) {
                        int L12 = org.telegram.messenger.g0.L((z16 || iz.p1) ? 12.5f : 15.5f);
                        if (((!z16 && !iz.p1) || t2Var3.W()) && t2Var3.S()) {
                            L12 -= org.telegram.messenger.g0.L(9.0f);
                        }
                        org.telegram.ui.Components.f5 f5Var2 = t2Var3.n4;
                        if (f5Var2 != null) {
                            ecVar2 = ecVar;
                            ecVar2.setTranslationX((f33 + t2Var3.H2) - org.telegram.messenger.g0.L(2.0f));
                            ecVar2.setTranslationY((f18 + L12) - org.telegram.messenger.g0.L(4.0f));
                            if (t2Var3.i0 > 0.0f) {
                                f5Var2.setBounds(t2Var3.H2 - org.telegram.messenger.g0.L(2.0f), L12 - org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(20.0f) + t2Var3.H2, org.telegram.messenger.g0.L(22.0f) + (L12 - org.telegram.messenger.g0.L(4.0f)));
                                f5Var2.draw(canvas3);
                                z18 = z17 ? 1 : 0;
                            } else {
                                z18 = true;
                            }
                            f5Var2.k(Integer.valueOf(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.z9, h6Var3)));
                            z12 = z18;
                            if (!t2Var3.y3 || t2Var3.x3 != 0.0f) {
                                if (!id.a0) {
                                    Paint paintReorderGradient = t2Var3.getPaintReorderGradient();
                                    paintReorderGradient.setAlpha((int) (t2Var3.x3 * 255.0f));
                                    canvas3.save();
                                    canvas3.translate(t2Var3.D3 - org.telegram.messenger.g0.L(f24), t2Var3.C3);
                                    float f49 = f24;
                                    canvas.drawRect(0.0f, 0.0f, org.telegram.messenger.k5.B(f49, t2Var3.D3, t2Var3.getMeasuredWidth()), org.telegram.messenger.g0.L(f49), paintReorderGradient);
                                    canvas3 = canvas;
                                    canvas3.restore();
                                }
                                org.telegram.ui.ActionBar.m6.Z0.setAlpha((int) (t2Var3.x3 * 255.0f));
                                z.s(t2Var3.D3, t2Var3.C3, org.telegram.ui.ActionBar.m6.Z0);
                                org.telegram.ui.ActionBar.m6.Z0.draw(canvas3);
                            }
                            float f412222 = t2Var3.S3.e;
                            if (t2Var3.t3) {
                                org.telegram.ui.ActionBar.m6.Y0.setAlpha((int) ((f25 - t2Var3.x3) * 255.0f));
                                RectF rectF5 = rectF;
                                rectF5.set(t2Var3.v3, t2Var3.u3, org.telegram.messenger.g0.L(20.666f) + r0, org.telegram.messenger.g0.L(20.666f) + t2Var3.u3);
                                float f50 = org.telegram.messenger.g0.p * 10.5f;
                                canvas3.drawRoundRect(rectF5, f50, f50, org.telegram.ui.ActionBar.m6.x0);
                                z.s(org.telegram.messenger.g0.L(4.5f) + t2Var3.v3, org.telegram.messenger.g0.L(5.0f) + t2Var3.u3, org.telegram.ui.ActionBar.m6.Y0);
                                org.telegram.ui.ActionBar.m6.Y0.draw(canvas3);
                            } else {
                                RectF rectF6 = rectF;
                                if (((t2Var3.G3 || t2Var3.b4) && t2Var3.L3) || t2Var3.V3 != f25 || t2Var3.c4 || t2Var3.W3 != f25 || t2Var3.d4 || f412222 > 0.0f) {
                                    boolean T = t2Var3.T();
                                    canvas3 = canvas;
                                    f19 = f25;
                                    I(canvas3, T, t2Var3.M3, t2Var3.N3, t2Var3.Q3, 1.0f, false);
                                    t2Var = this;
                                    if (t2Var.b4) {
                                        org.telegram.ui.ActionBar.m6.w0.setAlpha((int) ((f19 - t2Var.x3) * 255.0f));
                                        if (t2Var.i4 != null) {
                                            rectF6.set(t2Var.e4, t2Var.M3, org.telegram.messenger.g0.L(12.666f) + r1 + t2Var.h4, org.telegram.messenger.g0.L(20.666f) + t2Var.M3);
                                            canvas3.drawRoundRect(rectF6, rectF6.height() / 2.0f, rectF6.height() / 2.0f, (!T || t2Var.k1 == 0) ? org.telegram.ui.ActionBar.m6.w0 : org.telegram.ui.ActionBar.m6.y0);
                                            org.telegram.ui.ActionBar.m6.M0.setAlpha((int) ((f19 - t2Var.x3) * 255.0f));
                                            canvas3.save();
                                            canvas3.translate(org.telegram.messenger.g0.L(6.333f) + t2Var.e4, org.telegram.messenger.g0.L(4.0f) + t2Var.M3);
                                            t2Var.i4.draw(canvas3);
                                            canvas3.restore();
                                        } else {
                                            Drawable drawable2 = org.telegram.ui.ActionBar.m6.m1;
                                            drawable2.setAlpha((int) ((f19 - t2Var.x3) * 255.0f));
                                            bg.s.d(drawable2, org.telegram.messenger.g0.L(10.333f) + t2Var.e4, org.telegram.messenger.g0.L(10.333f) + t2Var.M3, i15);
                                            drawable2.draw(canvas3);
                                        }
                                    }
                                    if (t2Var.c4 || t2Var.W3 != f19) {
                                        f26 = 10.333f;
                                        rectF6.set(t2Var.f4, t2Var.M3, org.telegram.messenger.g0.L(20.666f) + r1, org.telegram.messenger.g0.L(20.666f) + t2Var.M3);
                                        float f51 = t2Var.W3;
                                        if (f51 == f19) {
                                            f51 = f19;
                                        } else if (!t2Var.c4) {
                                            f51 = f19 - f51;
                                        }
                                        Drawable drawable3 = T ? org.telegram.ui.ActionBar.m6.q1 : org.telegram.ui.ActionBar.m6.n1;
                                        drawable3.setAlpha((int) ((f19 - t2Var.x3) * 255.0f));
                                        bg.s.d(drawable3, org.telegram.messenger.g0.L(10.333f) + r1, org.telegram.messenger.g0.L(10.333f) + t2Var.M3, i15);
                                        bg.s.b(canvas3, drawable3, f51);
                                    } else {
                                        f26 = 10.333f;
                                    }
                                    if ((t2Var.d4 || f412222 > 0.0f) && f412222 != 0.0f) {
                                        rectF6.set(t2Var.g4, t2Var.M3, org.telegram.messenger.g0.L(20.666f) + r1, org.telegram.messenger.g0.L(20.666f) + t2Var.M3);
                                        Drawable drawable4 = T ? org.telegram.ui.ActionBar.m6.r1 : org.telegram.ui.ActionBar.m6.o1;
                                        drawable4.setAlpha((int) ((f19 - t2Var.x3) * 255.0f));
                                        bg.s.d(drawable4, org.telegram.messenger.g0.L(f26) + r1, org.telegram.messenger.g0.L(f26) + t2Var.M3, i15);
                                        bg.s.b(canvas3, drawable4, f412222);
                                    }
                                    if (t2Var.H3) {
                                        if (t2Var.J3 == null) {
                                            t2Var.J3 = (LayerDrawable) f0.d.d(t2Var.getContext(), R.drawable.dialog_gram_transfer).mutate();
                                        }
                                        int w013 = org.telegram.ui.ActionBar.m6.w0(t2Var.T() ? org.telegram.ui.ActionBar.m6.V8 : org.telegram.ui.ActionBar.m6.U8, h6Var3);
                                        if (t2Var.K3 != w013) {
                                            Drawable drawable5 = t2Var.J3.getDrawable(z17 ? 1 : 0);
                                            t2Var.K3 = w013;
                                            drawable5.setColorFilter(new PorterDuffColorFilter(w013, PorterDuff.Mode.SRC_IN));
                                        }
                                        int L13 = ((org.telegram.messenger.g0.L(20.666f) - org.telegram.messenger.g0.L(28.0f)) / 2) + t2Var.M3;
                                        LayerDrawable layerDrawable = t2Var.J3;
                                        int i43 = t2Var.I3;
                                        layerDrawable.setBounds(i43, L13, org.telegram.messenger.g0.L(28.0f) + i43, org.telegram.messenger.g0.L(28.0f) + L13);
                                        t2Var.J3.setAlpha((int) ((f19 - t2Var.x3) * 255.0f));
                                        t2Var.J3.draw(canvas3);
                                    }
                                    if (t2Var.R1 > 0) {
                                        float f52 = q2Var3.l;
                                        if (f52 != f19) {
                                            if (f52 > 0.0f) {
                                                canvas.saveLayerAlpha(0.0f, 0.0f, t2Var.getWidth(), t2Var.getHeight(), (int) ((f19 - f52) * 255.0f), 31);
                                                canvas3 = canvas;
                                                if (q2Var3.m) {
                                                    L = -org.telegram.messenger.g0.L(14.0f);
                                                    f27 = q2Var3.l;
                                                } else {
                                                    L = org.telegram.messenger.g0.L(14.0f);
                                                    f27 = q2Var3.l;
                                                }
                                                canvas3.translate(0.0f, L * f27);
                                            }
                                            int i44 = z17 ? 1 : 0;
                                            while (i44 < t2Var.R1) {
                                                if (t2Var.U1[i44]) {
                                                    if (t2Var.T1 == null) {
                                                        Paint paint3 = new Paint(1);
                                                        t2Var.T1 = paint3;
                                                        paint3.setShadowLayer(org.telegram.messenger.g0.L(1.34f), 0.0f, org.telegram.messenger.g0.L(0.34f), 402653184);
                                                        t2Var.T1.setColor(z17 ? 1 : 0);
                                                    }
                                                    RectF rectF7 = org.telegram.messenger.g0.P;
                                                    ImageReceiver[] imageReceiverArr = t2Var.V1;
                                                    rectF7.set(imageReceiverArr[i44].x(), imageReceiverArr[i44].z(), imageReceiverArr[i44].y(), imageReceiverArr[i44].A());
                                                    imageReceiverArr[i44].g(canvas3);
                                                    if (t2Var.X1[i44]) {
                                                        Path path = t2Var.v0;
                                                        if (path == null) {
                                                            t2Var.v0 = new Path();
                                                        } else {
                                                            path.rewind();
                                                        }
                                                        t2Var.v0.addRoundRect(rectF7, imageReceiverArr[i44].D()[z17 ? 1 : 0], imageReceiverArr[i44].D()[1], Path.Direction.CW);
                                                        canvas3.save();
                                                        canvas3.clipPath(t2Var.v0);
                                                        if (t2Var.w0 == null) {
                                                            t2Var.w0 = new xh.f();
                                                        }
                                                        t2Var.w0.h(i0.a.o(i22, (int) (Color.alpha(i22) * 0.325f)));
                                                        t2Var.w0.setBounds((int) imageReceiverArr[i44].x(), (int) imageReceiverArr[i44].z(), (int) imageReceiverArr[i44].y(), (int) imageReceiverArr[i44].A());
                                                        t2Var.w0.draw(canvas3);
                                                        t2Var.invalidate();
                                                        canvas3.restore();
                                                    }
                                                    if (t2Var.W1[i44]) {
                                                        z.s((int) (imageReceiverArr[i44].r() - (org.telegram.ui.ActionBar.m6.U0.getIntrinsicWidth() / 2)), (int) (imageReceiverArr[i44].s() - (org.telegram.ui.ActionBar.m6.U0.getIntrinsicHeight() / 2)), org.telegram.ui.ActionBar.m6.U0);
                                                        org.telegram.ui.ActionBar.m6.U0.draw(canvas3);
                                                    }
                                                }
                                                i44++;
                                                i22 = -1;
                                            }
                                            if (q2Var3.l > 0.0f) {
                                                canvas3.restore();
                                            }
                                        }
                                    }
                                    eVar = t2Var.t0;
                                    if (eVar != null && !eVar.F()) {
                                        canvas3.save();
                                        canvas3.translate(t2Var.Y2, (t2Var.getMeasuredHeight() - org.telegram.messenger.g0.L(21.66f)) - (t2Var.s2 ? 1 : 0));
                                        t2Var.t0.j(canvas3, t2Var.Z2 - t2Var.Y2);
                                        canvas3.restore();
                                    }
                                    i24 = i21;
                                    r12 = z17;
                                    if (i24 != -1) {
                                        canvas3.restoreToCount(i24);
                                        r12 = z17;
                                    }
                                } else {
                                    if (t2Var3.E1) {
                                        canvas3.save();
                                        float a10 = t2Var3.F1.a(0.05f);
                                        RectF rectF8 = t2Var3.H1;
                                        canvas3.scale(a10, a10, rectF8.centerX(), rectF8.centerY());
                                        t2Var3.G1.setColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Ci, h6Var3));
                                        canvas3.drawRoundRect(rectF8, rectF8.height() / 2.0f, rectF8.height() / 2.0f, t2Var3.G1);
                                        my0 my0Var = t2Var3.I1;
                                        if (my0Var != null) {
                                            my0Var.c(rectF8.left + org.telegram.messenger.g0.L(13.0f), rectF8.centerY(), 1.0f, org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Gi, h6Var3), canvas);
                                        }
                                        canvas.restore();
                                    }
                                    canvas3 = canvas;
                                }
                            }
                            t2Var = t2Var3;
                            f19 = f25;
                            if (t2Var.H3) {
                            }
                            if (t2Var.R1 > 0) {
                            }
                            eVar = t2Var.t0;
                            if (eVar != null) {
                                canvas3.save();
                                canvas3.translate(t2Var.Y2, (t2Var.getMeasuredHeight() - org.telegram.messenger.g0.L(21.66f)) - (t2Var.s2 ? 1 : 0));
                                t2Var.t0.j(canvas3, t2Var.Z2 - t2Var.Y2);
                                canvas3.restore();
                            }
                            i24 = i21;
                            r12 = z17;
                            if (i24 != -1) {
                            }
                        } else {
                            ecVar2 = ecVar;
                            Drawable drawable6 = (Drawable) ia.e.d().f;
                            int L14 = t2Var3.H2 - org.telegram.messenger.g0.L(f25);
                            if (!z16 && !iz.p1) {
                                f402222 = 15.5f;
                            }
                            z.s(L14, org.telegram.messenger.g0.L(f402222), drawable6);
                            drawable6.draw(canvas3);
                        }
                    } else {
                        ecVar2 = ecVar;
                        if (t2Var3.p4 != 0) {
                            int L15 = org.telegram.messenger.g0.L((z16 || iz.p1) ? 12.0f : 15.0f);
                            if (((!z16 && !iz.p1) || t2Var3.W()) && t2Var3.S()) {
                                L15 -= org.telegram.messenger.g0.L(9.0f);
                            }
                            z.s(t2Var3.H2, L15, t2Var3.p4 == 1 ? org.telegram.ui.ActionBar.m6.g1 : org.telegram.ui.ActionBar.m6.h1);
                            (t2Var3.p4 == 1 ? org.telegram.ui.ActionBar.m6.g1 : org.telegram.ui.ActionBar.m6.h1).draw(canvas3);
                        }
                    }
                    z12 = z17 ? 1 : 0;
                    if (!t2Var3.y3) {
                    }
                    if (!id.a0) {
                    }
                    org.telegram.ui.ActionBar.m6.Z0.setAlpha((int) (t2Var3.x3 * 255.0f));
                    z.s(t2Var3.D3, t2Var3.C3, org.telegram.ui.ActionBar.m6.Z0);
                    org.telegram.ui.ActionBar.m6.Z0.draw(canvas3);
                    float f4122222 = t2Var3.S3.e;
                    if (t2Var3.t3) {
                    }
                    t2Var = t2Var3;
                    f19 = f25;
                    if (t2Var.H3) {
                    }
                    if (t2Var.R1 > 0) {
                    }
                    eVar = t2Var.t0;
                    if (eVar != null) {
                    }
                    i24 = i21;
                    r12 = z17;
                    if (i24 != -1) {
                    }
                }
            }
            h6Var3 = h6Var4;
            if (t2Var3.b1) {
            }
            if (t2Var3.j1 != 2) {
            }
            i15 = 17;
            if (!t2Var3.j4) {
            }
            z12 = z17 ? 1 : 0;
            if (!t2Var3.y3) {
            }
            if (!id.a0) {
            }
            org.telegram.ui.ActionBar.m6.Z0.setAlpha((int) (t2Var3.x3 * 255.0f));
            z.s(t2Var3.D3, t2Var3.C3, org.telegram.ui.ActionBar.m6.Z0);
            org.telegram.ui.ActionBar.m6.Z0.draw(canvas3);
            float f41222222 = t2Var3.S3.e;
            if (t2Var3.t3) {
            }
            t2Var = t2Var3;
            f19 = f25;
            if (t2Var.H3) {
            }
            if (t2Var.R1 > 0) {
            }
            eVar = t2Var.t0;
            if (eVar != null) {
            }
            i24 = i21;
            r12 = z17;
            if (i24 != -1) {
            }
        } else {
            t2Var = t2Var4;
            i15 = 17;
            h6Var3 = h6Var2;
            sdVar4 = sdVar3;
            ecVar2 = ecVar;
            r12 = 0;
            f19 = 1.0f;
            i16 = 4;
            z12 = false;
            i17 = 0;
        }
        z13 = t2Var.b2;
        imageReceiver = t2Var.Y1;
        if (z13) {
            canvas3.save();
            float interpolation2 = sdVar4.getInterpolation(t2Var.c2 / 170.0f) + f19;
            canvas3.scale(interpolation2, interpolation2, imageReceiver.r(), imageReceiver.s());
        }
        z14 = t2Var.y;
        m2Var = t2Var.u0;
        if (z14 && (!t2Var.P || (tL_forumTopic2 = t2Var.N) == null || tL_forumTopic2.id != 1 || (kg0Var = t2Var.e2) == null || !kg0Var.X || kg0Var.Y)) {
            if (!t2Var.D) {
                if (t2Var.Z1 == null) {
                    t2Var.Z1 = new bd0();
                }
                t2Var.Z1.a((int) m2Var.F.centerX(), (int) m2Var.F.centerY(), (int) (m2Var.F.width() / 2.0f));
                canvas3.save();
                canvas3.clipPath(t2Var.Z1);
                imageReceiver.A0(m2Var.F);
                imageReceiver.g(canvas3);
                canvas3.restore();
            } else if (t2Var.E) {
                bg.s.f(imageReceiver, org.telegram.messenger.g0.N(f19) + m2Var.F.centerX(), m2Var.F.centerY(), org.telegram.messenger.g0.L(48.0f), org.telegram.messenger.g0.L(48.0f));
                bg.s.a(canvas3, org.telegram.ui.ActionBar.m6.S0, imageReceiver.r(), imageReceiver.s(), org.telegram.messenger.g0.L(48.0f));
                imageReceiver.g(canvas3);
            } else {
                boolean z39 = t2Var.F;
                m2Var.r = (z39 || t2Var.J0 != 0) ? true : r12;
                int i45 = m2Var.z;
                if (z39) {
                    m2Var.z = 1;
                }
                di.s7.h(t2Var.H0, canvas3, imageReceiver, m2Var);
                if (m2Var.w) {
                    t2Var.B();
                }
                m2Var.z = i45;
            }
            if (!t2Var.O0 && ((((chat = t2Var.g2) != null && chat.linked_community_id != 0) || ((user = t2Var.f2) != null && user.linked_community_id != 0)) && !t2Var.E && t2Var.N0 && !t2Var.U())) {
                float centerX2 = m2Var.F.centerX() + org.telegram.messenger.g0.L(20.33f);
                float centerY2 = m2Var.F.centerY() + org.telegram.messenger.g0.L(19.0f);
                if (t2Var.D0 == null) {
                    t2Var.D0 = new ih.c();
                }
                bg.s.d(t2Var.D0, centerX2, centerY2, i15);
                canvas3.drawCircle(t2Var.D0.getBounds().exactCenterX(), t2Var.D0.getBounds().exactCenterY(), org.telegram.messenger.g0.L(8.0f), org.telegram.ui.ActionBar.m6.n0(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.d6, h6Var3)));
                t2Var.D0.draw(canvas3);
            }
        }
        if (t2Var.b2) {
            canvas3.restore();
        }
        if (imageReceiver.H() && G(canvas)) {
            i17 = 1;
        }
        if (t2Var.i0 > 0.0f || t2Var.J0 != 0) {
            t2Var2 = t2Var;
        } else {
            boolean T2 = t2Var.T();
            RectF rectF9 = m2Var.F;
            int width = (int) (((rectF9.width() + rectF9.left) - t2Var.O3) - org.telegram.messenger.g0.L(5.0f));
            RectF rectF10 = m2Var.F;
            I(canvas3, T2, (int) ((m2Var.F.height() + imageReceiver.z()) - org.telegram.messenger.g0.L(22.0f)), width, (int) (((rectF10.width() + rectF10.left) - t2Var.P3) - org.telegram.messenger.g0.L(5.0f)), t2Var.i0, true);
            t2Var2 = this;
        }
        if (t2Var2.C0 != 0.0f) {
            canvas3.restore();
        }
        if (t2Var2.w1 != 0.0f) {
            canvas3.restore();
        }
        if (z10 && ((t2Var2.J0 != 0 || (t2Var2.P && (tL_forumTopic = t2Var2.N) != null && tL_forumTopic.id == 1)) && t2Var2.w1 == 0.0f && t2Var2.e2 != null)) {
            canvas3.save();
            canvas3.translate(0.0f, (-t2Var2.E3) - (t2Var2.n * t2Var2.i0));
            canvas3.clipRect(0.0f, (f19 - t2Var2.e2.J) * t2Var2.getMeasuredHeight(), t2Var2.getMeasuredWidth(), t2Var2.getMeasuredHeight());
            t2Var2.e2.c(canvas3, r12);
            canvas3.restore();
        }
        if (t2Var2.s2) {
            int L16 = (t2Var2.t2 || (t2Var2.J0 != 0 && t2Var2.m1)) ? r12 : org.telegram.messenger.g0.L(t2Var2.I);
            if (t2Var2.i0 != f19) {
                int alpha4 = org.telegram.ui.ActionBar.m6.k0.getAlpha();
                float f53 = t2Var2.i0;
                if (f53 != 0.0f) {
                    org.telegram.ui.ActionBar.m6.k0.setAlpha((int) ((f19 - f53) * alpha4));
                }
                i18 = 1;
                float measuredHeight = (t2Var2.getMeasuredHeight() - 1) - (t2Var2.n * t2Var2.i0);
                if (id.a0) {
                    canvas.drawLine(0.0f, measuredHeight, t2Var2.getMeasuredWidth() - L16, measuredHeight, org.telegram.ui.ActionBar.m6.k0);
                } else {
                    canvas.drawLine(L16, measuredHeight, t2Var2.getMeasuredWidth(), measuredHeight, org.telegram.ui.ActionBar.m6.k0);
                }
                f20 = 0.0f;
                if (t2Var2.i0 != 0.0f) {
                    org.telegram.ui.ActionBar.m6.k0.setAlpha(alpha4);
                }
                if (t2Var2.t1 != f20) {
                    if (Build.VERSION.SDK_INT != 24) {
                        canvas.restore();
                    } else {
                        org.telegram.ui.ActionBar.m6.v0.setColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.d6, h6Var3));
                        canvas.drawRect(0.0f, 0.0f, t2Var2.getMeasuredWidth(), t2Var2.u1 * t2Var2.t1, org.telegram.ui.ActionBar.m6.v0);
                        canvas.drawRect(0.0f, t2Var2.getMeasuredHeight() - ((int) (t2Var2.v1 * t2Var2.t1)), t2Var2.getMeasuredWidth(), t2Var2.getMeasuredHeight(), org.telegram.ui.ActionBar.m6.v0);
                        canvas2 = canvas;
                        if (z24) {
                            float f54 = f19 - f29;
                            int measuredHeight2 = (int) (t2Var2.getMeasuredHeight() * f54);
                            int v02 = org.telegram.ui.ActionBar.m6.v0(org.telegram.ui.ActionBar.m6.d6);
                            if (t2Var2.O4 == null) {
                                t2Var2.O4 = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, null);
                            }
                            if (t2Var2.P4 != v02) {
                                t2Var2.P4 = v02;
                                t2Var2.O4.setColors(new int[]{v02, 16777215 & v02});
                            }
                            float a11 = c8.j9.a((f54 - 0.05f) * 10.0f, 0.0f, f19);
                            t2Var2.O4.setBounds(r12, measuredHeight2, t2Var2.getMeasuredWidth(), org.telegram.messenger.g0.L(6.0f) + measuredHeight2);
                            t2Var2.O4.setAlpha((int) (a11 * 255.0f));
                            t2Var2.O4.draw(canvas2);
                            canvas2.restore();
                        }
                        z15 = t2Var2.y3;
                        if (!z15 || t2Var2.x3 != 0.0f) {
                            if (z15) {
                                float f55 = t2Var2.x3;
                                if (f55 < 1.0f) {
                                    float f56 = f55 + 0.09411765f;
                                    t2Var2.x3 = f56;
                                    if (f56 > 1.0f) {
                                        t2Var2.x3 = 1.0f;
                                    }
                                    f21 = 0.0f;
                                }
                            } else {
                                float f57 = t2Var2.x3;
                                f21 = 0.0f;
                                if (f57 > 0.0f) {
                                    float f58 = f57 - 0.09411765f;
                                    t2Var2.x3 = f58;
                                    if (f58 < 0.0f) {
                                        t2Var2.x3 = 0.0f;
                                    }
                                }
                                if (t2Var2.m1) {
                                    float f59 = t2Var2.D1;
                                    if (f59 > f21) {
                                        float f60 = f59 - 0.069565214f;
                                        t2Var2.D1 = f60;
                                        if (f60 < f21) {
                                            t2Var2.D1 = f21;
                                        }
                                        org.telegram.ui.Components.v8 v8Var = t2Var2.a2;
                                        if (v8Var.n == 2) {
                                            v8Var.o = wq.h.getInterpolation(t2Var2.D1);
                                        }
                                        i17 = i18;
                                    }
                                    if (t2Var2.b2) {
                                        float f61 = t2Var2.c2 + 16.0f;
                                        t2Var2.c2 = f61;
                                        if (f61 >= 170.0f) {
                                            t2Var2.c2 = 170.0f;
                                            t2Var2.b2 = r12;
                                        }
                                        i17 = i18;
                                    }
                                    if (!t2Var2.A1) {
                                        float f62 = t2Var2.C1;
                                        if (f62 < 1.0f) {
                                            float f63 = f62 + 0.09411765f;
                                            t2Var2.C1 = f63;
                                            if (f63 > 1.0f) {
                                                t2Var2.C1 = 1.0f;
                                                i17 = i18;
                                            }
                                        }
                                        float f64 = t2Var2.B1;
                                        if (f64 < 1.0f) {
                                            float f65 = f64 + 0.053333335f;
                                            t2Var2.B1 = f65;
                                            if (f65 > 1.0f) {
                                                t2Var2.B1 = 1.0f;
                                            }
                                            i17 = i18;
                                        }
                                        ecVar2.setVisibility(!z12 ? r12 : i16);
                                        if (i17 == 0) {
                                            t2Var2.invalidate();
                                            return;
                                        }
                                        return;
                                    }
                                    if (t2Var2.C1 == 1.0f) {
                                        t2Var2.C1 = 0.0f;
                                        i17 = i18;
                                    }
                                    float f66 = t2Var2.B1;
                                    if (f66 > 0.0f) {
                                        float f67 = f66 - 0.053333335f;
                                        t2Var2.B1 = f67;
                                        if (f67 < 0.0f) {
                                            t2Var2.B1 = 0.0f;
                                        }
                                        i17 = i18;
                                    }
                                    ecVar2.setVisibility(!z12 ? r12 : i16);
                                    if (i17 == 0) {
                                    }
                                } else {
                                    float f68 = t2Var2.D1;
                                    if (f68 < 1.0f) {
                                        float f69 = f68 + 0.069565214f;
                                        t2Var2.D1 = f69;
                                        if (f69 > 1.0f) {
                                            t2Var2.D1 = 1.0f;
                                        }
                                        org.telegram.ui.Components.v8 v8Var2 = t2Var2.a2;
                                        if (v8Var2.n == 2) {
                                            v8Var2.o = wq.h.getInterpolation(t2Var2.D1);
                                        }
                                        i17 = i18;
                                    }
                                    if (t2Var2.b2) {
                                    }
                                    if (!t2Var2.A1) {
                                    }
                                }
                            }
                            i17 = i18;
                            if (t2Var2.m1) {
                            }
                        }
                        f21 = 0.0f;
                        if (t2Var2.m1) {
                        }
                    }
                }
                canvas2 = canvas;
                if (z24) {
                }
                z15 = t2Var2.y3;
                if (!z15) {
                }
                if (z15) {
                }
                i17 = i18;
                if (t2Var2.m1) {
                }
            }
        }
        f20 = 0.0f;
        i18 = 1;
        if (t2Var2.t1 != f20) {
        }
        canvas2 = canvas;
        if (z24) {
        }
        z15 = t2Var2.y3;
        if (!z15) {
        }
        if (z15) {
        }
        i17 = i18;
        if (t2Var2.m1) {
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        kg0 kg0Var;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (V() && (kg0Var = this.e2) != null && iz.q1 && kg0Var.J == 0.0f) {
            accessibilityNodeInfo.setVisibleToUser(false);
        } else {
            accessibilityNodeInfo.addAction(16);
            accessibilityNodeInfo.addAction(32);
            if (!V() && this.D4 != null) {
                accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(R.id.acc_action_chat_preview, id.M0(2131754940, null)));
            }
        }
        fi.a3 a3Var = this.q2;
        if (a3Var == null || !a3Var.a.q) {
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
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        int L;
        int i13;
        if (this.H0 == 0 && this.G0 == null) {
            return;
        }
        ec ecVar = this.m4;
        if (ecVar != null) {
            ecVar.layout(0, 0, org.telegram.messenger.g0.L(22.0f), org.telegram.messenger.g0.L(22.0f));
        }
        if (this.q2 != null) {
            int i14 = this.I;
            boolean z10 = this.r2;
            int L2 = org.telegram.messenger.g0.L(i14 - ((z10 || iz.p1) ? 29 : 27));
            if (this.k0) {
                i13 = org.telegram.messenger.g0.L(8.0f);
                L = (getMeasuredHeight() - this.q2.getMeasuredHeight()) >> 1;
            } else {
                if (id.a0) {
                    L2 = (i11 - i7) - L2;
                }
                int i15 = L2;
                L = org.telegram.messenger.g0.L(this.U + ((z10 || iz.p1) ? 6 : 0));
                i13 = i15;
            }
            fi.a3 a3Var = this.q2;
            a3Var.layout(i13, L, a3Var.getMeasuredWidth() + i13, this.q2.getMeasuredHeight() + L);
        }
        int measuredWidth = (getMeasuredWidth() + getMeasuredHeight()) << 16;
        if (measuredWidth != this.K4 || this.A0) {
            this.A0 = false;
            this.K4 = measuredWidth;
            try {
                x();
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i10) {
        ec ecVar = this.m4;
        if (ecVar != null) {
            ecVar.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(22.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(22.0f), TLObject.FLAG_30));
        }
        fi.a3 a3Var = this.q2;
        if (a3Var != null) {
            a3Var.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(24.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(24.0f), TLObject.FLAG_30));
        }
        if (this.P) {
            int size = View.MeasureSpec.getSize(i7);
            boolean z9 = this.r2;
            setMeasuredDimension(size, org.telegram.messenger.g0.L(((z9 || iz.p1) ? this.K : this.J) + ((!S() || ((z9 || iz.p1) && !W())) ? 0 : W() ? this.M : this.L)) + (this.s2 ? 1 : 0));
            this.Q = false;
            if (this.P && !S()) {
                x();
                if (this.R) {
                    this.Q = true;
                    x();
                }
            }
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i7), D());
        this.u1 = 0;
        this.v1 = getMeasuredHeight();
    }

    @Override // android.view.View
    public final void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        ij captionMessage;
        TLRPC.User a22;
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        StringBuilder sb2 = new StringBuilder();
        String str = this.L0;
        if (str != null) {
            sb2.append(str);
            sb2.append(". ");
        } else if (this.J0 == 1) {
            org.telegram.messenger.camera.q.q(null, 2131754136, sb2, ". ");
        } else {
            if (this.h2 != null) {
                org.telegram.messenger.camera.q.q(null, 2131754777, sb2, ". ");
            }
            if (!this.P || this.N == null) {
                TLRPC.User user = this.f2;
                if (user != null) {
                    if (t10.z(user)) {
                        sb2.append(id.M0(2131746266, null));
                    } else if (t10.s(this.f2)) {
                        sb2.append(id.M0(2131754252, null));
                    } else {
                        if (this.f2.bot) {
                            org.telegram.messenger.camera.q.q(null, 2131753156, sb2, ". ");
                        }
                        TLRPC.User user2 = this.f2;
                        if (user2.self) {
                            sb2.append(id.M0(2131745901, null));
                        } else {
                            sb2.append(org.telegram.messenger.g5.m(0, user2.first_name, user2.last_name));
                        }
                    }
                    sb2.append(". ");
                } else {
                    TLRPC.Chat chat = this.g2;
                    if (chat != null) {
                        if (chat.broadcast) {
                            sb2.append(id.M0(2131754904, null));
                        } else {
                            sb2.append(id.M0(2131754876, null));
                        }
                        sb2.append(". ");
                        sb2.append(this.g2.title);
                        sb2.append(". ");
                    }
                }
            } else {
                org.telegram.messenger.camera.q.q(null, 2131754746, sb2, ". ");
                sb2.append(this.N.title);
                sb2.append(". ");
            }
        }
        if (this.j4) {
            org.telegram.messenger.camera.q.q(null, 2131754739, sb2, ". ");
        }
        if (this.Z0) {
            org.telegram.messenger.camera.q.q(null, 2131754829, sb2, ". ");
        }
        if (X()) {
            org.telegram.messenger.camera.q.q(null, 2131754741, sb2, ". ");
        }
        int i7 = this.S0;
        if (i7 > 0) {
            sb2.append(id.G(i7, "NewMessages", new Object[0]));
            sb2.append(". ");
        }
        int i10 = this.U0;
        if (i10 > 0) {
            sb2.append(id.G(i10, "AccDescrMentionCount", new Object[0]));
            sb2.append(". ");
        }
        if (this.V0 > 0) {
            org.telegram.messenger.camera.q.q(null, 2131754841, sb2, ". ");
        }
        ij ijVar = this.f1;
        if (ijVar == null || this.J0 != 0) {
            accessibilityEvent.setContentDescription(sb2);
            setContentDescription(sb2);
            return;
        }
        int i11 = this.R0;
        if (i11 == 0) {
            i11 = ijVar.k.date;
        }
        String s5 = id.s(i11, true);
        if (this.f1.N3()) {
            sb2.append(id.a0("AccDescrSentDate", null, 2131754765, s5));
        } else {
            sb2.append(id.a0("AccDescrReceivedDate", null, 2131754789, s5));
        }
        sb2.append(". ");
        if (this.g2 != null && !this.f1.N3() && this.f1.p3() && this.f1.k.action == null && (a22 = qp.s1(this.F0).a2(Long.valueOf(this.f1.k.from_id.user_id))) != null) {
            sb2.append(org.telegram.messenger.g5.m(0, a22.first_name, a22.last_name));
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
            p2 p2Var = this.d0;
            if (p2Var == null || p2Var.m()) {
                if (this.E1) {
                    boolean contains = this.H1.contains(motionEvent.getX(), motionEvent.getY());
                    int action = motionEvent.getAction();
                    hc hcVar = this.F1;
                    if (action == 0 || motionEvent.getAction() == 2) {
                        hcVar.c(contains);
                    } else {
                        if (hcVar.i && motionEvent.getAction() == 1) {
                            ii.c cVar = this.K1;
                            if (cVar != null) {
                                cVar.a(this.f2);
                            }
                            hcVar.c(false);
                            return true;
                        }
                        if (hcVar.i && motionEvent.getAction() == 3) {
                            hcVar.c(false);
                            return true;
                        }
                    }
                }
                if (this.f0) {
                    oc ocVar = this.c0;
                    if (ocVar != null) {
                        if (this.h3 != null) {
                            int i7 = this.j1;
                            if (i7 != 0) {
                                if (i7 != 7) {
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
    public final boolean performAccessibilityAction(int i7, Bundle bundle) {
        zw zwVar;
        if (i7 != R.id.acc_action_chat_preview || (zwVar = this.D4) == null) {
            return super.performAccessibilityAction(i7, bundle);
        }
        zwVar.T4(this);
        return true;
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (getParent() != null && getParent().isLayoutRequested()) {
            getParent().requestLayout();
        }
        super.requestLayout();
    }

    public void setArchivedPullAnimation(kg0 kg0Var) {
        this.e2 = kg0Var;
    }

    public void setBottomClip(int i7) {
        this.v1 = i7;
    }

    public void setClipProgress(float f10) {
        this.t1 = f10;
        invalidate();
    }

    public void setCurrentDialogId(long j3) {
        this.H0 = j3;
    }

    public void setCustomMessage(String str) {
        if (TextUtils.equals(this.I0, str)) {
            return;
        }
        this.I0 = str;
        x();
        requestLayout();
    }

    public void setCustomMessageWithoutRebuild(String str) {
        this.I0 = str;
    }

    public void setDialog(o2 o2Var) {
        this.G0 = o2Var;
        this.l1 = 0;
        j0(0, true);
        A();
        z();
        y();
        B();
    }

    public void setDialogCellDelegate(p2 p2Var) {
        this.d0 = p2Var;
    }

    public void setDialogSelected(boolean z9) {
        if (this.q4 != z9) {
            invalidate();
        }
        this.q4 = z9;
    }

    public void setIsTransitionSupport(boolean z9) {
        this.j0 = z9;
    }

    public void setMoving(boolean z9) {
        this.r = z9;
    }

    public void setOpenBotButton(boolean z9) {
        if (this.E1 == z9) {
            return;
        }
        if (this.I1 == null) {
            this.I1 = new my0(id.M0(2131753020, null), 14.0f, org.telegram.messenger.g0.o());
        }
        this.E1 = z9;
        this.F1.c(false);
    }

    public void setPinForced(boolean z9) {
        this.B3 = z9;
        if (getMeasuredWidth() > 0 && getMeasuredHeight() > 0) {
            x();
        }
        invalidate();
    }

    public void setPreloader(jg.k kVar) {
        this.s4 = kVar;
    }

    public void setRightFragmentOpenedProgress(float f10) {
        if (this.i0 != f10) {
            this.i0 = f10;
            invalidate();
        }
    }

    public void setSliding(boolean z9) {
        this.x1 = z9;
    }

    public void setTitleOverride(String str) {
        this.L0 = str;
    }

    public void setTopClip(int i7) {
        this.u1 = i7;
    }

    @Override // android.view.View
    public void setTranslationX(float f10) {
        if (f10 == this.w1) {
            return;
        }
        this.w1 = f10;
        zg0 zg0Var = this.y1;
        if (zg0Var != null && f10 == 0.0f) {
            zg0Var.T(true, 0.0f);
            this.z1 = false;
            this.m1 = iz.q1;
            this.B1 = 0.0f;
            this.x1 = false;
        }
        float f11 = this.w1;
        if (f11 != 0.0f) {
            this.x1 = true;
        } else {
            this.C1 = 0.0f;
            this.B1 = 0.0f;
            this.A1 = false;
        }
        if (this.x1 && !this.x) {
            boolean z9 = this.A1;
            boolean z10 = Math.abs(f11) >= ((float) getMeasuredWidth()) * 0.45f;
            this.A1 = z10;
            if (z9 != z10 && this.m1 == iz.q1) {
                try {
                    performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
            }
        }
        invalidate();
    }

    public void setVisible(boolean z9) {
        if (this.z0 == z9) {
            return;
        }
        this.z0 = z9;
        if (z9) {
            invalidate();
        }
    }

    @Override // org.telegram.ui.ActionBar.c6
    public void updateColors() {
        try {
            if (isAttachedToWindow()) {
                if (this.H0 == 0 && this.G0 == null) {
                    return;
                }
                j0(0, true);
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final CharSequence w(CharSequence charSequence) {
        if (this.R1 <= 0) {
            return charSequence;
        }
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(charSequence);
        valueOf.insert(0, (CharSequence) " ");
        valueOf.setSpan(new r2(org.telegram.messenger.g0.L(((this.L4 + 2) * this.R1) + 3)), 0, 1, 33);
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
    
        if (org.telegram.messenger.t3.n0(r55.g2) != false) goto L587;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1595:0x0b4c, code lost:
    
        if (qg.d.k(r55.f1) == false) goto L567;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1735:0x0f79, code lost:
    
        if (org.telegram.messenger.ij.O2(r55.f1.k.rich_message.blocks.get(0)) != false) goto L797;
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
    
        if (org.telegram.messenger.iz.p1 == false) goto L1810;
     */
    /* JADX WARN: Code restructure failed: missing block: B:712:0x2258, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:713:0x2259, code lost:
    
        r2 = r44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:714:0x2260, code lost:
    
        org.telegram.messenger.a8.f(r0);
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
    /* JADX WARN: Type inference failed for: r55v0, types: [android.view.View, org.telegram.ui.Cells.t2] */
    /* JADX WARN: Type inference failed for: r8v67, types: [android.text.SpannableStringBuilder] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void x() {
        int i7;
        float f10;
        float f11;
        boolean z9;
        char c10;
        int i10;
        CharSequence charSequence;
        long j3;
        boolean z10;
        boolean z11;
        int i11;
        boolean z12;
        TLRPC.DraftMessage draftMessage;
        TLRPC.DraftMessage draftMessage2;
        TLRPC.DraftMessage draftMessage3;
        boolean z13;
        CharSequence charSequence2;
        boolean z14;
        CharSequence charSequence3;
        int i12;
        boolean z15;
        CharSequence charSequence4;
        String L0;
        CharSequence charSequence5;
        boolean z16;
        ArrayList<TLRPC.MessageEntity> arrayList;
        TL_iv.RichMessage richMessage;
        int i13;
        CharSequence charSequence6;
        CharSequence charSequence7;
        CharSequence charSequence8;
        CharSequence charSequence9;
        TLRPC.Chat M0;
        CharSequence charSequence10;
        CharSequence charSequence11;
        String str;
        boolean z17;
        ij ijVar;
        CharSequence charSequence12;
        CharSequence charSequence13;
        CharSequence N2;
        CharSequence charSequence14;
        char c11;
        String str2;
        boolean z18;
        SpannableStringBuilder spannableStringBuilder;
        CharSequence charSequence15;
        boolean V;
        String G;
        char c12;
        int i14;
        String G2;
        ij ijVar2;
        TLRPC.Message message;
        String str3;
        int i15;
        CharSequence l10;
        CharSequence charSequence16;
        CharSequence x12;
        xz xzVar;
        TLRPC.User user;
        ij ijVar3;
        TLRPC.User user2;
        CharSequence charSequence17;
        CharSequence charSequence18;
        CharSequence K;
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
        String e12;
        ij ijVar4;
        boolean z19;
        String str7;
        qp s12;
        String str8;
        String str9;
        CharSequence U;
        CharSequence charSequence24;
        CharSequence charSequence25;
        boolean z20;
        int i16;
        CharSequence charSequence26;
        int i17;
        boolean z21;
        String str10;
        boolean z22;
        boolean z23;
        boolean z24;
        String str11;
        ij ijVar5;
        TLRPC.Message message2;
        TLRPC.TL_textWithEntities tL_textWithEntities;
        int i18;
        TLRPC.Chat chat;
        ij ijVar6;
        CharSequence charSequence27;
        float f12;
        float f13;
        int i19;
        int i20;
        boolean z25;
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        int L;
        int L2;
        int L3;
        int i21;
        int i22;
        ImageReceiver[] imageReceiverArr;
        int i23;
        int i24;
        ui.e eVar;
        boolean z26;
        int i25;
        CharSequence charSequence28;
        int L4;
        int i26;
        ImageReceiver[] imageReceiverArr2;
        ij ijVar7;
        int i27;
        int lineCount;
        int lineCount2;
        int lineCount3;
        StaticLayout staticLayout;
        float primaryHorizontal;
        float primaryHorizontal2;
        int i28;
        int lineCount4;
        int lineCount5;
        int lineCount6;
        CharSequence charSequence29;
        CharSequence charSequence30;
        int L5;
        int i29;
        int i30;
        CharSequence x13;
        ij ijVar8;
        ui.e eVar2;
        float f19;
        int L6;
        int L7;
        ui.e eVar3;
        int L8;
        CharSequence x14;
        CharSequence charSequence31;
        SpannableStringBuilder N;
        if (this.j0) {
            return;
        }
        if (this.N0 && !this.I4.a() && this.J0 == 0 && this.K0 == 0 && this.h2 == null) {
            return;
        }
        if (!this.r2) {
            int i31 = iz.a;
        }
        org.telegram.ui.ActionBar.m6.B0[0].setTextSize(org.telegram.messenger.g0.L(17.0f));
        org.telegram.ui.ActionBar.m6.C0[0].setTextSize(org.telegram.messenger.g0.L(17.0f));
        org.telegram.ui.ActionBar.m6.F0[0].setTextSize(org.telegram.messenger.g0.L(16.0f));
        org.telegram.ui.ActionBar.m6.H0[0].setTextSize(org.telegram.messenger.g0.L(16.0f));
        boolean z27 = true;
        org.telegram.ui.ActionBar.m6.B0[1].setTextSize(org.telegram.messenger.g0.L(16.0f));
        org.telegram.ui.ActionBar.m6.C0[1].setTextSize(org.telegram.messenger.g0.L(16.0f));
        org.telegram.ui.ActionBar.m6.F0[1].setTextSize(org.telegram.messenger.g0.L(15.0f));
        org.telegram.ui.ActionBar.m6.H0[1].setTextSize(org.telegram.messenger.g0.L(15.0f));
        TextPaint textPaint = org.telegram.ui.ActionBar.m6.F0[1];
        int w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.i9, this.J4);
        textPaint.linkColor = w02;
        textPaint.setColor(w02);
        this.E0 = 1;
        this.L4 = 18;
        this.M0 = 0;
        String str12 = null;
        CharSequence D1 = (W() || !(this.N0 || this.P)) ? null : qp.s1(this.F0).D1(this.H0, getTopicId(), true);
        this.a0 = org.telegram.ui.ActionBar.m6.F0[this.E0];
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
        boolean z28 = (t10.B(this.f2) || this.u2) ? false : true;
        this.j2 = -1;
        if (!W()) {
            this.h3 = null;
        }
        setOpenBotButton(false);
        if ((this.r2 || iz.p1) && this.J0 == 0 && !W() && !S()) {
            this.W = false;
            i7 = 2;
        } else {
            this.W = true;
            i7 = 1;
        }
        ij ijVar9 = this.f1;
        if (ijVar9 != null) {
            ijVar9.g6(false);
        }
        ij ijVar10 = this.f1;
        CharSequence charSequence32 = ijVar10 != null ? ijVar10.v : null;
        if (charSequence32 instanceof Spannable) {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(charSequence32);
            f11 = 16.0f;
            f10 = 17.0f;
            for (c41 c41Var : (c41[]) spannableStringBuilder2.getSpans(0, spannableStringBuilder2.length(), c41.class)) {
                spannableStringBuilder2.removeSpan(c41Var);
            }
            for (b41 b41Var : (b41[]) spannableStringBuilder2.getSpans(0, spannableStringBuilder2.length(), b41.class)) {
                spannableStringBuilder2.removeSpan(b41Var);
            }
            charSequence32 = spannableStringBuilder2;
        } else {
            f10 = 17.0f;
            f11 = 16.0f;
        }
        this.i1 = charSequence32;
        if (this.F) {
            this.z3 = true;
            z9 = false;
            z28 = false;
        } else {
            z9 = true;
        }
        o2 o2Var = this.G0;
        if (o2Var != null) {
            if (o2Var.g == 2) {
                this.G2 = true;
                if (this.r2 || iz.p1) {
                    this.K2 = org.telegram.messenger.g0.L(12.5f);
                    if (id.a0) {
                        this.J2 = (getMeasuredWidth() - org.telegram.messenger.g0.L(this.I + 6)) - org.telegram.ui.ActionBar.m6.a1.getIntrinsicWidth();
                        this.x2 = org.telegram.messenger.g0.L(22.0f);
                    } else {
                        this.J2 = org.telegram.messenger.g0.L(this.I + 6);
                        this.x2 = org.telegram.ui.ActionBar.m6.a1.getIntrinsicWidth() + org.telegram.messenger.g0.L(this.I + 10);
                    }
                } else {
                    this.K2 = org.telegram.messenger.g0.L(16.5f);
                    if (id.a0) {
                        this.J2 = (getMeasuredWidth() - org.telegram.messenger.g0.L(this.I + 4)) - org.telegram.ui.ActionBar.m6.a1.getIntrinsicWidth();
                        this.x2 = org.telegram.messenger.g0.L(18.0f);
                    } else {
                        this.J2 = org.telegram.messenger.g0.L(this.I + 4);
                        this.x2 = org.telegram.ui.ActionBar.m6.a1.getIntrinsicWidth() + org.telegram.messenger.g0.L(this.I + 8);
                    }
                }
            } else {
                this.j4 = !this.n1 && o2Var.i;
                if (this.r2 || iz.p1) {
                    if (id.a0) {
                        this.x2 = org.telegram.messenger.g0.L(22.0f);
                    } else {
                        this.x2 = org.telegram.messenger.g0.L(this.I + 6);
                    }
                } else if (id.a0) {
                    this.x2 = org.telegram.messenger.g0.L(18.0f);
                } else {
                    this.x2 = org.telegram.messenger.g0.L(this.I + 4);
                }
            }
            o2 o2Var2 = this.G0;
            if (o2Var2.g == 1) {
                L0 = id.L0(2131750503);
                o2 o2Var3 = this.G0;
                if (o2Var3.j) {
                    this.a0 = org.telegram.ui.ActionBar.m6.H0[this.E0];
                    N = N(i7, this.f1.v, null);
                    N.setSpan(new xz(org.telegram.ui.ActionBar.m6.o9, this.J4), 0, N.length(), 33);
                } else {
                    String str13 = o2Var3.b;
                    if (str13.length() > 150) {
                        str13 = str13.substring(0, qs.g2);
                    }
                    N = (this.r2 || iz.p1) ? N(i7, str13, L0) : N(i7, str13.replace('\n', ' '), L0);
                }
                charSequence31 = org.telegram.messenger.i6.l(N, org.telegram.ui.ActionBar.m6.F0[this.E0].getFontMetricsInt(), false);
                z20 = false;
            } else {
                charSequence31 = o2Var2.b;
                if (o2Var2.j) {
                    this.a0 = org.telegram.ui.ActionBar.m6.H0[this.E0];
                }
                z20 = true;
                L0 = null;
            }
            c10 = '\n';
            str8 = id.e1(this.G0.h);
            int i32 = this.G0.d;
            if (i32 != 0) {
                this.G3 = true;
                str7 = String.format("%d", Integer.valueOf(i32));
            } else {
                this.G3 = false;
                str7 = null;
            }
            o2 o2Var4 = this.G0;
            int i33 = o2Var4.k;
            if (i33 == 2) {
                this.Q2 = true;
                this.R2 = true;
                this.S2 = false;
            } else if (i33 == 1) {
                this.Q2 = false;
                this.R2 = true;
                this.S2 = false;
            } else {
                this.S2 = false;
                this.Q2 = false;
                this.R2 = false;
            }
            this.t3 = false;
            charSequence24 = o2Var4.a;
            charSequence6 = charSequence31;
            charSequence26 = null;
            charSequence25 = "";
            i16 = -1;
        } else {
            c10 = '\n';
            if (this.r2 || iz.p1) {
                if (id.a0) {
                    this.x2 = org.telegram.messenger.g0.L(22.0f);
                } else {
                    this.x2 = org.telegram.messenger.g0.L(this.I + 6);
                }
            } else if (id.a0) {
                this.x2 = org.telegram.messenger.g0.L(18.0f);
            } else {
                this.x2 = org.telegram.messenger.g0.L(this.I + 4);
            }
            if (this.h2 != null) {
                if (this.J0 == 0) {
                    this.G2 = true;
                    if (this.r2 || iz.p1) {
                        this.K2 = org.telegram.messenger.g0.L(12.5f);
                        if (id.a0) {
                            this.J2 = (getMeasuredWidth() - org.telegram.messenger.g0.L(this.I + 6)) - org.telegram.ui.ActionBar.m6.a1.getIntrinsicWidth();
                            this.x2 = org.telegram.messenger.g0.L(22.0f);
                        } else {
                            this.J2 = org.telegram.messenger.g0.L(this.I + 6);
                            this.x2 = org.telegram.ui.ActionBar.m6.a1.getIntrinsicWidth() + org.telegram.messenger.g0.L(this.I + 10);
                        }
                    } else {
                        this.K2 = org.telegram.messenger.g0.L(16.5f);
                        if (id.a0) {
                            this.J2 = (getMeasuredWidth() - org.telegram.messenger.g0.L(this.I + 4)) - org.telegram.ui.ActionBar.m6.a1.getIntrinsicWidth();
                            this.x2 = org.telegram.messenger.g0.L(18.0f);
                        } else {
                            this.J2 = org.telegram.messenger.g0.L(this.I + 4);
                            this.x2 = org.telegram.ui.ActionBar.m6.a1.getIntrinsicWidth() + org.telegram.messenger.g0.L(this.I + 8);
                        }
                    }
                }
            } else if (this.J0 == 0 && !this.P) {
                TLRPC.Chat chat2 = this.g2;
                if (chat2 != null) {
                    long c13 = org.telegram.messenger.m5.c(chat2);
                    TLRPC.Chat chat3 = this.g2;
                    if (chat3.scam) {
                        this.p4 = 1;
                        org.telegram.ui.ActionBar.m6.g1.a();
                    } else if (chat3.fake) {
                        this.p4 = 2;
                        org.telegram.ui.ActionBar.m6.h1.a();
                    } else if (org.telegram.messenger.m5.f(chat3.emoji_status) != 0) {
                        this.l4 = true;
                        this.D2 = true;
                        org.telegram.ui.Components.f5 f5Var = this.n4;
                        f5Var.a = id.a0;
                        f5Var.j(org.telegram.messenger.m5.f(this.g2.emoji_status), false);
                        this.n4.m(org.telegram.messenger.m5.B(this.g2.emoji_status), false);
                    } else {
                        boolean z29 = this.n1;
                        this.j4 = !z29 && this.g2.verified;
                        this.k4 = (z29 || this.g2.bot_verification_icon == 0) ? false : true;
                    }
                    charSequence = charSequence32;
                    j3 = c13;
                    i10 = i7;
                } else {
                    TLRPC.User user3 = this.f2;
                    if (user3 != null) {
                        j3 = org.telegram.messenger.m5.c(user3);
                        TLRPC.User user4 = this.f2;
                        if (user4.scam) {
                            this.p4 = 1;
                            org.telegram.ui.ActionBar.m6.g1.a();
                        } else if (user4.fake) {
                            this.p4 = 2;
                            org.telegram.ui.ActionBar.m6.h1.a();
                        } else {
                            boolean z30 = this.n1;
                            this.j4 = !z30 && user4.verified;
                            if (z30 || t10.B(user4)) {
                                charSequence = charSequence32;
                            } else {
                                charSequence = charSequence32;
                                if (this.f2.bot_verification_icon != 0) {
                                    z10 = true;
                                    this.k4 = z10;
                                    qp.s1(this.F0);
                                    if (qp.B2(this.f2)) {
                                        long j10 = p10.i(this.F0).n;
                                        i10 = i7;
                                        long j11 = this.f2.id;
                                        if (j10 != j11 && j11 != 0) {
                                            z11 = true;
                                            this.l4 = z11;
                                            if (z11) {
                                                Long h = t10.h(this.f2);
                                                org.telegram.ui.Components.f5 f5Var2 = this.n4;
                                                f5Var2.a = id.a0;
                                                if (h != null) {
                                                    this.D2 = true;
                                                    f5Var2.j(h.longValue(), false);
                                                    this.n4.m(org.telegram.messenger.m5.B(this.f2.emoji_status), false);
                                                } else {
                                                    this.D2 = true;
                                                    f5Var2.g((Drawable) ia.e.d().f, false);
                                                    this.n4.m(false, false);
                                                }
                                            }
                                        }
                                    } else {
                                        i10 = i7;
                                    }
                                    z11 = false;
                                    this.l4 = z11;
                                    if (z11) {
                                    }
                                }
                            }
                            z10 = false;
                            this.k4 = z10;
                            qp.s1(this.F0);
                            if (qp.B2(this.f2)) {
                            }
                            z11 = false;
                            this.l4 = z11;
                            if (z11) {
                            }
                        }
                        charSequence = charSequence32;
                        qp.s1(this.F0);
                        if (qp.B2(this.f2)) {
                        }
                        z11 = false;
                        this.l4 = z11;
                        if (z11) {
                        }
                    } else {
                        i10 = i7;
                        charSequence = charSequence32;
                        j3 = 0;
                    }
                }
                if (j3 != 0 && this.k4) {
                    this.o4.j(j3, false);
                }
                i11 = this.R0;
                if (i11 == 0 && (ijVar6 = this.f1) != null) {
                    i11 = ijVar6.k.date;
                }
                if (!this.P) {
                    boolean z31 = ui.b0(this.F0).S(this.H0, (long) getTopicId()) != null;
                    this.k2 = z31;
                    TLRPC.DraftMessage R = !z31 ? ui.b0(this.F0).R(this.H0, getTopicId()) : null;
                    this.l2 = R;
                    if (R != null && TextUtils.isEmpty(R.message)) {
                        this.l2 = null;
                    }
                } else if (this.N0 || this.s0) {
                    boolean z32 = ui.b0(this.F0).S(this.H0, (long) getTopicId()) != null;
                    this.k2 = z32;
                    this.l2 = !z32 ? ui.b0(this.F0).R(this.H0, 0L) : null;
                } else {
                    this.k2 = false;
                    this.l2 = null;
                }
                z12 = this.k2;
                if (!z12 || this.l2 != null) {
                    if (!z12 && (draftMessage2 = this.l2) != null && TextUtils.isEmpty(draftMessage2.message)) {
                        draftMessage3 = this.l2;
                        if (draftMessage3.rich_message == null) {
                            TLRPC.InputReplyTo inputReplyTo = draftMessage3.reply_to;
                            if (inputReplyTo == null) {
                            }
                            this.l2 = null;
                            this.k2 = false;
                            if (W()) {
                                this.l2 = null;
                                this.k2 = false;
                                this.V = true;
                                k0();
                                L0 = org.telegram.messenger.t3.p0(this.g2) ? null : org.telegram.messenger.g0.U(getMessageNameString());
                                if (org.telegram.messenger.t3.p0(this.g2)) {
                                    i18 = i10;
                                    if (i18 == 1) {
                                        i18 = 2;
                                    }
                                    L0 = null;
                                    if (i18 == 3) {
                                        i18 = 4;
                                    }
                                } else {
                                    i18 = i10;
                                }
                                charSequence21 = P();
                                ij ijVar11 = this.f1;
                                String R2 = this.f1 != null ? R(i18, L0, ijVar11 != null ? qp.s1(ijVar11.I1).F1(this.f1.k.restriction_reason) : null, true) : "";
                                CharSequence charSequence33 = R2;
                                if (this.e0) {
                                    int length = R2.length();
                                    charSequence33 = R2;
                                    charSequence33 = R2;
                                    if (length >= 0 && L0 != null) {
                                        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(R2);
                                        valueOf.setSpan(new xz(org.telegram.ui.ActionBar.m6.X8, this.J4), 0, Math.min(valueOf.length(), L0.length() + 1), 0);
                                        charSequence33 = valueOf;
                                    }
                                }
                                this.a0 = org.telegram.ui.ActionBar.m6.F0[this.E0];
                                z15 = z9;
                                charSequence22 = charSequence33;
                            } else {
                                int i34 = i10;
                                if (TextUtils.isEmpty(this.I0)) {
                                    if (D1 != null) {
                                        this.i2 = D1;
                                        z13 = z28;
                                        charSequence2 = charSequence;
                                        int intValue = qp.s1(this.F0).E1(this.H0, getTopicId()).intValue();
                                        this.j2 = intValue;
                                        pu0 u02 = org.telegram.ui.ActionBar.m6.u0(intValue);
                                        int L9 = u02 != null ? org.telegram.messenger.g0.L(3.0f) + u02.getIntrinsicWidth() : 0;
                                        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
                                        CharSequence replace = TextUtils.replace(D1, new String[]{"..."}, new String[]{""});
                                        i12 = this.j2 == 5 ? replace.toString().indexOf("**oo**") : -1;
                                        if (i12 >= 0) {
                                            spannableStringBuilder3.append(replace).setSpan(new r2(org.telegram.ui.ActionBar.m6.u0(this.j2).getIntrinsicWidth()), i12, i12 + 6, 0);
                                        } else {
                                            spannableStringBuilder3.append((CharSequence) " ").append(replace).setSpan(new r2(L9), 0, 1, 0);
                                        }
                                        z14 = false;
                                        charSequence3 = spannableStringBuilder3;
                                    } else {
                                        z13 = z28;
                                        charSequence2 = charSequence;
                                        this.i2 = null;
                                        this.j2 = -1;
                                        z14 = true;
                                        charSequence3 = "";
                                        i12 = -1;
                                    }
                                    if (this.k2 || this.l2 != null) {
                                        z15 = z9;
                                        charSequence4 = " ";
                                        CharSequence charSequence34 = charSequence3;
                                        L0 = id.L0(2131751342);
                                        TLRPC.DraftMessage draftMessage4 = this.l2;
                                        if (draftMessage4 == null || !TextUtils.isEmpty(draftMessage4.message) || this.l2.rich_message != null) {
                                            TLRPC.DraftMessage draftMessage5 = this.l2;
                                            if (draftMessage5 != null && (richMessage = draftMessage5.rich_message) != null) {
                                                charSequence5 = ij.e0(richMessage, qs.g2);
                                            } else if (this.k2) {
                                                charSequence5 = id.L0(2131753982);
                                            } else if (draftMessage5 != null) {
                                                String str14 = draftMessage5.message;
                                                int length2 = str14.length();
                                                charSequence5 = str14;
                                                if (length2 > 150) {
                                                    charSequence5 = str14.subSequence(0, qs.g2);
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
                                                spannableString.setSpan(new xz(org.telegram.ui.ActionBar.m6.p9, this.J4), 0, spannableString.length(), 33);
                                            }
                                            SpannableStringBuilder N3 = N(i34, org.telegram.messenger.g0.N2(spannableString), L0);
                                            if ((this.r2 || iz.p1) && !S()) {
                                                z16 = false;
                                            } else {
                                                z16 = false;
                                                N3.setSpan(new xz(org.telegram.ui.ActionBar.m6.j9, this.J4), 0, L0.length() + 1, 33);
                                            }
                                            charSequence9 = org.telegram.messenger.i6.l(N3, org.telegram.ui.ActionBar.m6.F0[this.E0].getFontMetricsInt(), z16);
                                        } else if ((this.r2 || iz.p1) && !S()) {
                                            i13 = i12;
                                            charSequence7 = charSequence34;
                                            charSequence6 = "";
                                            z28 = z13;
                                            charSequence8 = null;
                                            z27 = false;
                                            charSequence23 = charSequence7;
                                        } else {
                                            SpannableStringBuilder valueOf2 = SpannableStringBuilder.valueOf(L0);
                                            valueOf2.setSpan(new xz(org.telegram.ui.ActionBar.m6.j9, this.J4), 0, L0.length(), 33);
                                            charSequence9 = valueOf2;
                                        }
                                        charSequence6 = charSequence9;
                                        i13 = i12;
                                        charSequence7 = charSequence34;
                                        z28 = z13;
                                        charSequence8 = null;
                                        z27 = false;
                                        charSequence23 = charSequence7;
                                    } else {
                                        if (this.h1) {
                                            this.a0 = org.telegram.ui.ActionBar.m6.H0[this.E0];
                                            Z = id.L0(2131749294);
                                        } else {
                                            ij ijVar12 = this.f1;
                                            if (ijVar12 != null) {
                                                String F1 = qp.s1(ijVar12.I1).F1(this.f1.k.restriction_reason);
                                                long Z0 = this.f1.Z0();
                                                if (org.telegram.messenger.m5.E(Z0)) {
                                                    qp.s1(this.F0).a2(Long.valueOf(Z0));
                                                    M0 = null;
                                                } else {
                                                    M0 = qp.s1(this.F0).M0(Long.valueOf(-Z0));
                                                }
                                                this.L3 = true;
                                                if (this.j1 == 0) {
                                                    charSequence10 = " ";
                                                    if (this.H0 > 0 && this.f1.P3() && (tL_messageReactions = this.f1.k.reactions) != null && (arrayList2 = tL_messageReactions.recent_reactions) != null && !arrayList2.isEmpty() && this.V0 > 0) {
                                                        TLRPC.MessagePeerReaction messagePeerReaction = this.f1.k.reactions.recent_reactions.get(0);
                                                        if (messagePeerReaction.unread) {
                                                            long j12 = messagePeerReaction.peer_id.user_id;
                                                            if (j12 != 0 && j12 != p10.i(this.F0).n) {
                                                                ch.o0 d = ch.o0.d(messagePeerReaction.reaction);
                                                                this.a0 = org.telegram.ui.ActionBar.m6.H0[this.E0];
                                                                String str15 = d.f;
                                                                if (str15 != null) {
                                                                    z17 = true;
                                                                    str = id.Z(2131746403, str15);
                                                                    charSequence11 = charSequence3;
                                                                    z15 = z9;
                                                                } else {
                                                                    String Z2 = id.Z(2131746403, "**reaction**");
                                                                    int indexOf = Z2.indexOf("**reaction**");
                                                                    ?? spannableStringBuilder4 = new SpannableStringBuilder(Z2.replace("**reaction**", "d"));
                                                                    charSequence11 = charSequence3;
                                                                    z15 = z9;
                                                                    long j13 = d.g;
                                                                    TextPaint textPaint3 = this.a0;
                                                                    spannableStringBuilder4.setSpan(new org.telegram.ui.Components.q5(j13, textPaint3 == null ? null : textPaint3.getFontMetricsInt()), indexOf, indexOf + 1, 0);
                                                                    str = spannableStringBuilder4;
                                                                    z17 = true;
                                                                }
                                                                if (z17) {
                                                                    int i35 = this.j1;
                                                                    if (i35 == 2) {
                                                                        TLRPC.Chat chat4 = this.g2;
                                                                        if (chat4 != null) {
                                                                            if (org.telegram.messenger.t3.T(chat4)) {
                                                                                TLRPC.Chat chat5 = this.g2;
                                                                                if (!chat5.megagroup) {
                                                                                    int i36 = chat5.participants_count;
                                                                                    str5 = i36 != 0 ? id.I(i36, "Subscribers") : !org.telegram.messenger.t3.t0(chat5) ? id.L0(2131752329).toLowerCase() : id.L0(2131752318).toLowerCase();
                                                                                }
                                                                            }
                                                                            TLRPC.Chat chat6 = this.g2;
                                                                            int i37 = chat6.participants_count;
                                                                            str5 = i37 != 0 ? id.I(i37, "Members") : chat6.has_geo ? id.L0(2131748642) : !org.telegram.messenger.t3.t0(chat6) ? id.L0(2131748641).toLowerCase() : id.L0(2131748638).toLowerCase();
                                                                        } else {
                                                                            str5 = "";
                                                                        }
                                                                        this.L3 = false;
                                                                        str4 = str5;
                                                                    } else if (i35 == 3 && t10.B(this.f2)) {
                                                                        zw zwVar = this.D4;
                                                                        str4 = id.L0((zwVar == null || !zwVar.O0) ? 2131745896 : 2131745895);
                                                                    } else {
                                                                        boolean z33 = this.r2;
                                                                        if (!z33 && !iz.p1 && this.K0 != 0) {
                                                                            K = L();
                                                                        } else if (z33 || iz.p1 || this.J0 == 0) {
                                                                            ij ijVar13 = this.f1;
                                                                            if (!(ijVar13.k instanceof TLRPC.TL_messageService) || (ij.E4(ijVar13) && !(this.f1.k.action instanceof TLRPC.TL_messageActionTopicCreate))) {
                                                                                CharSequence charSequence35 = charSequence2;
                                                                                this.V = true;
                                                                                k0();
                                                                                String U2 = (this.r0 || (user2 = this.f2) == null || !user2.self || this.f1.P3()) ? null : org.telegram.messenger.g0.U(getMessageNameString());
                                                                                if ((!this.r0 || (user = this.f2) == null || user.self || (ijVar3 = this.f1) == null || !ijVar3.P3()) && U2 == null && ((ijVar = this.f1) == null || (message = ijVar.k) == null || message.guestchat_via_from == null)) {
                                                                                    TLRPC.Chat chat7 = this.g2;
                                                                                    if (chat7 != null) {
                                                                                        long j14 = chat7.id;
                                                                                        if (j14 > 0) {
                                                                                            if (M0 != null) {
                                                                                            }
                                                                                            if (org.telegram.messenger.t3.T(chat7)) {
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    TLRPC.User user5 = this.f2;
                                                                                    if (user5 == null || user5.id != 489000 || (ijVar2 = this.f1) == null || ijVar2.W0() == null) {
                                                                                        boolean isEmpty = TextUtils.isEmpty(F1);
                                                                                        CharSequence charSequence36 = F1;
                                                                                        if (isEmpty) {
                                                                                            if (ij.E4(this.f1)) {
                                                                                                ij ijVar14 = this.f1;
                                                                                                CharSequence charSequence37 = ijVar14.w;
                                                                                                if (charSequence37 == null || ((ijVar14.k.action instanceof TLRPC.TL_messageActionTopicCreate) && this.P)) {
                                                                                                    charSequence37 = ijVar14.v;
                                                                                                }
                                                                                                CharSequence charSequence38 = charSequence37;
                                                                                                charSequence36 = charSequence38;
                                                                                                if (ijVar14.g2[0] instanceof qg.a) {
                                                                                                    TLRPC.TL_forumTopic f20 = qp.s1(this.F0).S1().f(-this.f1.A0(), ij.a2(this.F0, this.f1.k, true));
                                                                                                    charSequence36 = charSequence38;
                                                                                                    if (f20 != null) {
                                                                                                        ((qg.a) this.f1.g2[0]).b(f20.icon_color);
                                                                                                        charSequence36 = charSequence38;
                                                                                                    }
                                                                                                }
                                                                                            } else {
                                                                                                TLRPC.MessageMedia messageMedia = this.f1.k.media;
                                                                                                if ((messageMedia instanceof TLRPC.TL_messageMediaPhoto) && (messageMedia.photo instanceof TLRPC.TL_photoEmpty) && messageMedia.ttl_seconds != 0) {
                                                                                                    charSequence36 = id.L0(2131753947);
                                                                                                } else {
                                                                                                    if (messageMedia instanceof TLRPC.TL_messageMediaDocument) {
                                                                                                        TLRPC.Document document = messageMedia.document;
                                                                                                        if (((document instanceof TLRPC.TL_documentEmpty) || document == null) && messageMedia.ttl_seconds != 0) {
                                                                                                            charSequence36 = messageMedia.voice ? id.L0(2131753929) : messageMedia.round ? id.L0(2131753940) : id.L0(2131753932);
                                                                                                        }
                                                                                                    }
                                                                                                    String str16 = "🎧 ";
                                                                                                    if (getCaptionMessage() == null || (this.f1.k.media instanceof TLRPC.TL_messageMediaPoll)) {
                                                                                                        ij ijVar15 = this.f1;
                                                                                                        TLRPC.Message message3 = ijVar15.k;
                                                                                                        TLRPC.MessageMedia messageMedia2 = message3.media;
                                                                                                        if (messageMedia2 instanceof TLRPC.TL_messageMediaPaidMedia) {
                                                                                                            int size = ((TLRPC.TL_messageMediaPaidMedia) messageMedia2).extended_media.size();
                                                                                                            if (this.S1) {
                                                                                                                i14 = 1;
                                                                                                                if (size > 1) {
                                                                                                                    c12 = 0;
                                                                                                                    G2 = id.G(size, "Media", new Object[0]);
                                                                                                                } else {
                                                                                                                    c12 = 0;
                                                                                                                    G2 = id.L0(2131753933);
                                                                                                                }
                                                                                                            } else {
                                                                                                                c12 = 0;
                                                                                                                i14 = 1;
                                                                                                                G2 = size > 1 ? id.G(size, "Photos", new Object[0]) : id.L0(2131753948);
                                                                                                            }
                                                                                                            Object[] objArr = new Object[i14];
                                                                                                            objArr[c12] = G2;
                                                                                                            SpannableStringBuilder T0 = dd.T0(id.Z(2131753949, objArr));
                                                                                                            this.a0 = org.telegram.ui.ActionBar.m6.H0[this.E0];
                                                                                                            charSequence36 = T0;
                                                                                                        } else if (this.R1 > 1) {
                                                                                                            if (this.S1) {
                                                                                                                ArrayList arrayList3 = this.g1;
                                                                                                                G = id.G(arrayList3 == null ? 0 : arrayList3.size(), "Media", new Object[0]);
                                                                                                            } else {
                                                                                                                ArrayList arrayList4 = this.g1;
                                                                                                                G = id.G(arrayList4 == null ? 0 : arrayList4.size(), "Photos", new Object[0]);
                                                                                                            }
                                                                                                            charSequence36 = G;
                                                                                                            this.a0 = org.telegram.ui.ActionBar.m6.H0[this.E0];
                                                                                                        } else {
                                                                                                            if (messageMedia2 instanceof TLRPC.TL_messageMediaGiveaway) {
                                                                                                                TLRPC.MessageFwdHeader messageFwdHeader = message3.fwd_from;
                                                                                                                if (messageFwdHeader != null) {
                                                                                                                    TLRPC.Peer peer = messageFwdHeader.from_id;
                                                                                                                    if (peer instanceof TLRPC.TL_peerChannel) {
                                                                                                                        V = org.telegram.messenger.t3.U(this.F0, peer.channel_id);
                                                                                                                        charSequence15 = id.L0(!V ? 2131753482 : 2131753476);
                                                                                                                    }
                                                                                                                }
                                                                                                                V = org.telegram.messenger.t3.V(this.g2);
                                                                                                                charSequence15 = id.L0(!V ? 2131753482 : 2131753476);
                                                                                                            } else if (messageMedia2 instanceof TLRPC.TL_messageMediaGiveawayResults) {
                                                                                                                charSequence15 = id.L0(2131753392);
                                                                                                            } else if (messageMedia2 instanceof TLRPC.TL_messageMediaPoll) {
                                                                                                                TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) messageMedia2;
                                                                                                                TLRPC.TL_textWithEntities tL_textWithEntities2 = tL_messageMediaPoll.poll.question;
                                                                                                                if (tL_textWithEntities2 == null || tL_textWithEntities2.entities == null) {
                                                                                                                    z18 = false;
                                                                                                                    spannableStringBuilder = oh.a.a(R.drawable.dialog_media_poll_20, tL_textWithEntities2.text, false);
                                                                                                                } else {
                                                                                                                    SpannableString spannableString2 = new SpannableString(tL_messageMediaPoll.poll.question.text);
                                                                                                                    TLRPC.TL_textWithEntities tL_textWithEntities3 = tL_messageMediaPoll.poll.question;
                                                                                                                    ui.g(tL_textWithEntities3.entities, tL_textWithEntities3.text, spannableString2, -1);
                                                                                                                    ui.a(org.telegram.ui.ActionBar.m6.F0[this.E0].getFontMetricsInt(), spannableString2, tL_messageMediaPoll.poll.question.entities);
                                                                                                                    z18 = false;
                                                                                                                    spannableStringBuilder = oh.a.a(R.drawable.dialog_media_poll_20, spannableString2, false);
                                                                                                                }
                                                                                                                charSequence15 = spannableStringBuilder;
                                                                                                            } else if (messageMedia2 instanceof TLRPC.TL_messageMediaToDo) {
                                                                                                                TLRPC.TL_messageMediaToDo tL_messageMediaToDo = (TLRPC.TL_messageMediaToDo) messageMedia2;
                                                                                                                TLRPC.TL_textWithEntities tL_textWithEntities4 = tL_messageMediaToDo.todo.title;
                                                                                                                if (tL_textWithEntities4 == null || tL_textWithEntities4.entities == null) {
                                                                                                                    charSequence15 = oh.a.a(R.drawable.dialog_media_checklist_20, tL_textWithEntities4.text, false);
                                                                                                                } else {
                                                                                                                    SpannableString spannableString3 = new SpannableString(tL_messageMediaToDo.todo.title.text);
                                                                                                                    TLRPC.TL_textWithEntities tL_textWithEntities5 = tL_messageMediaToDo.todo.title;
                                                                                                                    ui.g(tL_textWithEntities5.entities, tL_textWithEntities5.text, spannableString3, -1);
                                                                                                                    ui.a(org.telegram.ui.ActionBar.m6.F0[this.E0].getFontMetricsInt(), spannableString3, tL_messageMediaToDo.todo.title.entities);
                                                                                                                    charSequence15 = oh.a.a(R.drawable.dialog_media_checklist_20, spannableString3, false);
                                                                                                                }
                                                                                                            } else if (messageMedia2 instanceof TLRPC.TL_messageMediaGame) {
                                                                                                                charSequence15 = oh.a.a(R.drawable.dialog_media_game_20, messageMedia2.game.title, false);
                                                                                                            } else if (messageMedia2 instanceof TLRPC.TL_messageMediaInvoice) {
                                                                                                                charSequence15 = messageMedia2.title;
                                                                                                            } else if (ijVar15.D == 14) {
                                                                                                                charSequence15 = com.google.android.recaptcha.internal.a.l("🎧 ", ijVar15.w1(true), " - ", this.f1.y1(true));
                                                                                                            } else if (!(messageMedia2 instanceof TLRPC.TL_messageMediaStory) || !messageMedia2.via_mention) {
                                                                                                                if (!ijVar15.r2() || TextUtils.isEmpty(this.f1.k.message)) {
                                                                                                                    SpannableString spannableString4 = new SpannableString(charSequence35);
                                                                                                                    ij ijVar16 = this.f1;
                                                                                                                    if (ijVar16 != null) {
                                                                                                                        ijVar16.U5();
                                                                                                                    }
                                                                                                                    ij ijVar17 = this.f1;
                                                                                                                    Pattern pattern = ui.R1;
                                                                                                                    ui.g(ijVar17.k.entities, ijVar17.v, spannableString4, qs.n4);
                                                                                                                    ij ijVar18 = this.f1;
                                                                                                                    charSequence14 = spannableString4;
                                                                                                                    if (ijVar18 != null) {
                                                                                                                        TLRPC.Message message4 = ijVar18.k;
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
                                                                                                                    int measuredWidth = getMeasuredWidth() - org.telegram.messenger.g0.L(this.I + 23);
                                                                                                                    ij ijVar19 = this.f1;
                                                                                                                    charSequence14 = charSequence39;
                                                                                                                    if (ijVar19.Z1) {
                                                                                                                        charSequence14 = org.telegram.messenger.g0.Q(charSequence39, (String) ijVar19.Y1.get(0), measuredWidth, this.a0);
                                                                                                                    }
                                                                                                                }
                                                                                                                org.telegram.messenger.g0.x1(charSequence14, this.f1.Y1, this.J4);
                                                                                                                charSequence15 = charSequence14;
                                                                                                            } else if (ijVar15.N3()) {
                                                                                                                TLRPC.User a22 = qp.s1(this.F0).a2(Long.valueOf(this.f1.A0()));
                                                                                                                if (a22 != null) {
                                                                                                                    str2 = t10.i(a22);
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
                                                                                                                charSequence15 = id.Z(2131744440, objArr2);
                                                                                                            } else {
                                                                                                                charSequence15 = id.L0(2131744616);
                                                                                                            }
                                                                                                            CharSequence charSequence40 = charSequence15;
                                                                                                            ij ijVar20 = this.f1;
                                                                                                            if (ijVar20.k.media == null || ijVar20.F3()) {
                                                                                                                TL_iv.RichMessage richMessage2 = this.f1.k.rich_message;
                                                                                                                charSequence36 = charSequence40;
                                                                                                                if (richMessage2 != null) {
                                                                                                                    charSequence36 = charSequence40;
                                                                                                                    if (richMessage2.blocks.size() == 1) {
                                                                                                                        charSequence36 = charSequence40;
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                            this.a0 = org.telegram.ui.ActionBar.m6.H0[this.E0];
                                                                                                            charSequence36 = charSequence40;
                                                                                                        }
                                                                                                    } else {
                                                                                                        ij captionMessage = getCaptionMessage();
                                                                                                        if (!this.V) {
                                                                                                            str16 = "";
                                                                                                        } else if (captionMessage.H4()) {
                                                                                                            str16 = "📹 ";
                                                                                                        } else if (captionMessage.P4()) {
                                                                                                            str16 = "🎤 ";
                                                                                                        } else if (!captionMessage.I3()) {
                                                                                                            str16 = captionMessage.R3() ? "🖼 " : "📎 ";
                                                                                                        }
                                                                                                        if (!captionMessage.r2() || TextUtils.isEmpty(captionMessage.k.message)) {
                                                                                                            SpannableString spannableString5 = new SpannableString(captionMessage.z);
                                                                                                            if (captionMessage.k != null) {
                                                                                                                captionMessage.U5();
                                                                                                                ui.g(captionMessage.k.entities, captionMessage.z, spannableString5, qs.n4);
                                                                                                                ArrayList<TLRPC.MessageEntity> arrayList6 = captionMessage.k.entities;
                                                                                                                TextPaint textPaint5 = this.a0;
                                                                                                                ui.a(textPaint5 == null ? null : textPaint5.getFontMetricsInt(), spannableString5, arrayList6);
                                                                                                            }
                                                                                                            charSequence36 = new SpannableStringBuilder(str16).append((CharSequence) spannableString5);
                                                                                                        } else {
                                                                                                            CharSequence charSequence41 = captionMessage.a2;
                                                                                                            int measuredWidth2 = getMeasuredWidth() - org.telegram.messenger.g0.L(this.I + 47);
                                                                                                            if (this.W) {
                                                                                                                if (!TextUtils.isEmpty(null)) {
                                                                                                                    throw null;
                                                                                                                }
                                                                                                                measuredWidth2 = (int) (measuredWidth2 - this.a0.measureText(": "));
                                                                                                            }
                                                                                                            if (measuredWidth2 > 0 && captionMessage.Z1) {
                                                                                                                charSequence41 = org.telegram.messenger.g0.Q(charSequence41, (String) captionMessage.Y1.get(0), measuredWidth2, this.a0);
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
                                                                                            spannableStringBuilder5.setSpan(new wp(f0.d.d(getContext(), R.drawable.msg_mini_replystory).mutate()), 0, 1, 0);
                                                                                            charSequence42 = spannableStringBuilder5;
                                                                                        }
                                                                                        if (this.R1 > 0) {
                                                                                            if (!this.f1.r2() || TextUtils.isEmpty(this.f1.k.message)) {
                                                                                                int length3 = charSequence42.length();
                                                                                                CharSequence charSequence43 = charSequence42;
                                                                                                if (length3 > 150) {
                                                                                                    charSequence43 = charSequence42.subSequence(0, qs.g2);
                                                                                                }
                                                                                                N2 = org.telegram.messenger.g0.N2(charSequence43);
                                                                                            } else {
                                                                                                N2 = this.f1.a2;
                                                                                                int measuredWidth3 = getMeasuredWidth() - org.telegram.messenger.g0.L((((this.L4 + 2) * this.R1) + (this.I + 23)) + 3);
                                                                                                ij ijVar21 = this.f1;
                                                                                                if (ijVar21.Z1) {
                                                                                                    N2 = org.telegram.messenger.g0.Q(N2, (String) ijVar21.Y1.get(0), measuredWidth3, this.a0);
                                                                                                }
                                                                                            }
                                                                                            CharSequence spannableStringBuilder6 = !(N2 instanceof SpannableStringBuilder) ? new SpannableStringBuilder(N2) : N2;
                                                                                            SpannableStringBuilder spannableStringBuilder7 = (SpannableStringBuilder) spannableStringBuilder6;
                                                                                            charSequence4 = charSequence10;
                                                                                            spannableStringBuilder7.insert(0, charSequence4);
                                                                                            spannableStringBuilder7.setSpan(new r2(org.telegram.messenger.g0.L(((this.L4 + 2) * this.R1) + 3)), 0, 1, 33);
                                                                                            org.telegram.messenger.i6.l(spannableStringBuilder7, org.telegram.ui.ActionBar.m6.F0[this.E0].getFontMetricsInt(), false);
                                                                                            CharSequence charSequence44 = spannableStringBuilder6;
                                                                                            if (this.f1.r2()) {
                                                                                                CharSequence x15 = org.telegram.messenger.g0.x1(spannableStringBuilder7, this.f1.Y1, this.J4);
                                                                                                charSequence44 = spannableStringBuilder6;
                                                                                                if (x15 != null) {
                                                                                                    charSequence44 = x15;
                                                                                                }
                                                                                            }
                                                                                            z14 = false;
                                                                                            charSequence12 = charSequence44;
                                                                                        } else {
                                                                                            charSequence4 = charSequence10;
                                                                                            charSequence12 = charSequence42;
                                                                                        }
                                                                                        if (this.f1.j3() && this.f1.n5()) {
                                                                                            this.x0 = true;
                                                                                            SpannableStringBuilder spannableStringBuilder8 = new SpannableStringBuilder(charSequence12);
                                                                                            spannableStringBuilder8.insert(0, (CharSequence) "d ");
                                                                                            wp wpVar = new wp(f0.d.d(getContext(), R.drawable.mini_forwarded).mutate());
                                                                                            wpVar.x = 0.9f;
                                                                                            spannableStringBuilder8.setSpan(wpVar, 0, 1, 0);
                                                                                            charSequence13 = spannableStringBuilder8;
                                                                                        } else {
                                                                                            charSequence13 = charSequence12;
                                                                                        }
                                                                                        str3 = null;
                                                                                        charSequence16 = charSequence13;
                                                                                        if (this.K0 == 0) {
                                                                                            str6 = L();
                                                                                        } else if (this.J0 != 0) {
                                                                                            str6 = K();
                                                                                        } else {
                                                                                            z27 = z14;
                                                                                            charSequence6 = charSequence16;
                                                                                            i13 = i12;
                                                                                            charSequence19 = charSequence11;
                                                                                            L0 = str3;
                                                                                            z28 = z13;
                                                                                            charSequence20 = charSequence19;
                                                                                            charSequence8 = null;
                                                                                            charSequence23 = charSequence20;
                                                                                        }
                                                                                        z27 = z14;
                                                                                        charSequence6 = charSequence16;
                                                                                        L0 = str6;
                                                                                        i13 = i12;
                                                                                        charSequence19 = charSequence11;
                                                                                        z28 = z13;
                                                                                        charSequence20 = charSequence19;
                                                                                        charSequence8 = null;
                                                                                        charSequence23 = charSequence20;
                                                                                    }
                                                                                }
                                                                                charSequence4 = charSequence10;
                                                                                int i38 = -1;
                                                                                if (U2 == null) {
                                                                                    U2 = getMessageNameString();
                                                                                }
                                                                                String U3 = org.telegram.messenger.g0.U(U2);
                                                                                TLRPC.Chat chat8 = this.g2;
                                                                                if (chat8 != null && chat8.forum && !this.P && !this.O) {
                                                                                    CharSequence i39 = qp.s1(this.F0).S1().i(this.g2, this.f1, this.a0);
                                                                                    if (!TextUtils.isEmpty(i39)) {
                                                                                        SpannableStringBuilder spannableStringBuilder9 = new SpannableStringBuilder("-");
                                                                                        wp wpVar2 = new wp(f0.d.d(org.telegram.messenger.t0.b, R.drawable.msg_mini_forumarrow).mutate());
                                                                                        if (!this.r2 && !iz.p1) {
                                                                                            i38 = org.telegram.ui.ActionBar.m6.k9;
                                                                                        }
                                                                                        wpVar2.a(i38);
                                                                                        spannableStringBuilder9.setSpan(wpVar2, 0, 1, 0);
                                                                                        ?? spannableStringBuilder10 = new SpannableStringBuilder();
                                                                                        spannableStringBuilder10.append(U3).append((CharSequence) spannableStringBuilder9).append(i39);
                                                                                        str3 = spannableStringBuilder10;
                                                                                        SpannableStringBuilder R3 = R(i34, str3, F1, false);
                                                                                        if (!this.O || ((this.r2 || iz.p1) && (this.J0 == 0 || R3.length() <= 0))) {
                                                                                            i15 = 0;
                                                                                        } else {
                                                                                            try {
                                                                                                xzVar = new xz(org.telegram.ui.ActionBar.m6.k9, this.J4);
                                                                                                i15 = str3.length() + 1;
                                                                                            } catch (Exception e10) {
                                                                                                e = e10;
                                                                                                i15 = 0;
                                                                                            }
                                                                                            try {
                                                                                                R3.setSpan(xzVar, 0, i15, 33);
                                                                                            } catch (Exception e11) {
                                                                                                e = e11;
                                                                                                org.telegram.messenger.a8.f(e);
                                                                                                l10 = org.telegram.messenger.i6.l(R3, org.telegram.ui.ActionBar.m6.F0[this.E0].getFontMetricsInt(), false);
                                                                                                if (this.f1.r2()) {
                                                                                                }
                                                                                                if (this.R1 > 0) {
                                                                                                }
                                                                                                charSequence16 = l10;
                                                                                                z14 = false;
                                                                                                if (this.K0 == 0) {
                                                                                                }
                                                                                                z27 = z14;
                                                                                                charSequence6 = charSequence16;
                                                                                                L0 = str6;
                                                                                                i13 = i12;
                                                                                                charSequence19 = charSequence11;
                                                                                                z28 = z13;
                                                                                                charSequence20 = charSequence19;
                                                                                                charSequence8 = null;
                                                                                                charSequence23 = charSequence20;
                                                                                                if (!this.x0) {
                                                                                                }
                                                                                                if (TextUtils.isEmpty(this.I0)) {
                                                                                                }
                                                                                                e12 = "";
                                                                                                ijVar4 = this.f1;
                                                                                                if (ijVar4 != null) {
                                                                                                }
                                                                                                this.Q2 = false;
                                                                                                this.R2 = false;
                                                                                                this.S2 = ijVar4 == null && ijVar4.o4() && this.H0 == p10.i(this.F0).e();
                                                                                                z19 = false;
                                                                                                this.G3 = false;
                                                                                                this.b4 = false;
                                                                                                this.c4 = false;
                                                                                                this.d4 = false;
                                                                                                this.t3 = false;
                                                                                                str7 = null;
                                                                                                str12 = null;
                                                                                                this.P2 = z19;
                                                                                                s12 = qp.s1(this.F0);
                                                                                                if (this.j1 == 0) {
                                                                                                }
                                                                                                str8 = e12;
                                                                                                str9 = this.L0;
                                                                                                if (str9 == null) {
                                                                                                }
                                                                                                z20 = z27;
                                                                                                i16 = i13;
                                                                                                z9 = z15;
                                                                                                charSequence26 = charSequence8;
                                                                                                charSequence27 = L0;
                                                                                                if (z9) {
                                                                                                }
                                                                                                if (J()) {
                                                                                                }
                                                                                                if (id.a0) {
                                                                                                }
                                                                                                if (this.G2) {
                                                                                                }
                                                                                                if (!this.S2) {
                                                                                                }
                                                                                                if (this.Z0) {
                                                                                                }
                                                                                                if (!this.l4) {
                                                                                                }
                                                                                                if (!z25) {
                                                                                                }
                                                                                                if (this.k4) {
                                                                                                }
                                                                                                L8 = this.y2 - org.telegram.messenger.g0.L(12.0f);
                                                                                                if (L8 < 0) {
                                                                                                }
                                                                                                if (charSequence24 instanceof String) {
                                                                                                }
                                                                                                if (this.D2) {
                                                                                                }
                                                                                                float f21 = L8;
                                                                                                this.R = org.telegram.ui.ActionBar.m6.B0[this.E0].measureText(charSequence24.toString()) <= f21;
                                                                                                if (!this.Q) {
                                                                                                }
                                                                                                CharSequence l11 = org.telegram.messenger.i6.l(charSequence24, org.telegram.ui.ActionBar.m6.B0[this.E0].getFontMetricsInt(), false);
                                                                                                ij ijVar22 = this.f1;
                                                                                                if (ijVar22 == null) {
                                                                                                }
                                                                                                if (this.Q) {
                                                                                                }
                                                                                                this.B2 = (this.D2 || !this.z2.isRtlCharAt(0)) ? f13 : -org.telegram.messenger.g0.L(f14);
                                                                                                this.C2 = this.z2.isRtlCharAt(0);
                                                                                                this.p3 = org.telegram.ui.Components.q5.update(0, (View) this, this.p3, this.z2);
                                                                                                if (this.r2) {
                                                                                                }
                                                                                                f16 = 39.0f;
                                                                                                f17 = f12;
                                                                                                f18 = 13.0f;
                                                                                                L = org.telegram.messenger.g0.L(11.0f);
                                                                                                this.q3 = org.telegram.messenger.g0.L(32.0f);
                                                                                                this.M2 = org.telegram.messenger.g0.L(13.0f);
                                                                                                this.u3 = org.telegram.messenger.g0.L(42.33f);
                                                                                                this.C3 = org.telegram.messenger.g0.L(43.0f);
                                                                                                this.M3 = org.telegram.messenger.g0.L(42.33f);
                                                                                                this.W2 = org.telegram.messenger.g0.L(13.0f);
                                                                                                int measuredWidth4 = getMeasuredWidth() - org.telegram.messenger.g0.L(this.I + 21);
                                                                                                if (id.a0) {
                                                                                                }
                                                                                                i21 = L3;
                                                                                                this.u0.F.set(L2, L, org.telegram.messenger.g0.L(56.0f) + L2, org.telegram.messenger.g0.L(56.0f) + L);
                                                                                                i22 = 0;
                                                                                                while (true) {
                                                                                                    imageReceiverArr = this.V1;
                                                                                                    if (i22 < imageReceiverArr.length) {
                                                                                                    }
                                                                                                    imageReceiverArr[i22].y0(((this.L4 + 2) * i22) + i21, ((org.telegram.messenger.g0.L(31.0f) + L) + (this.Q ? org.telegram.messenger.g0.L(20.0f) : 0)) - ((this.r2 || iz.p1 || (eVar = this.t0) == null || eVar.F()) ? 0 : org.telegram.messenger.g0.L(9.0f)), org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(18.0f));
                                                                                                    i22++;
                                                                                                    L = L;
                                                                                                }
                                                                                                i23 = L;
                                                                                                i24 = measuredWidth4;
                                                                                                if (id.a0) {
                                                                                                }
                                                                                                if (this.Q) {
                                                                                                }
                                                                                                if (!this.r2) {
                                                                                                }
                                                                                                this.M2 -= org.telegram.messenger.g0.L(6.0f);
                                                                                                this.W2 -= org.telegram.messenger.g0.L(6.0f);
                                                                                                if (getIsPinned()) {
                                                                                                }
                                                                                                if (this.t3) {
                                                                                                }
                                                                                                if (this.t3) {
                                                                                                }
                                                                                                this.H3 = z26;
                                                                                                if (z26) {
                                                                                                }
                                                                                                if (z20) {
                                                                                                }
                                                                                                int max = Math.max(org.telegram.messenger.g0.L(12.0f), i24);
                                                                                                this.g3 = org.telegram.messenger.g0.L((!this.r2 || iz.p1) ? 58.0f : 62.0f);
                                                                                                if (!this.r2) {
                                                                                                }
                                                                                                this.g3 -= org.telegram.messenger.g0.L(!W() ? 10.0f : 12.0f);
                                                                                                if (!W()) {
                                                                                                }
                                                                                                if (this.Q) {
                                                                                                }
                                                                                                this.n3 = org.telegram.ui.Components.q5.update(0, (View) this, this.n3, this.s3);
                                                                                                if (TextUtils.isEmpty(charSequence26)) {
                                                                                                }
                                                                                                this.o3 = org.telegram.ui.Components.q5.update(0, (View) this, this.o3, this.h3);
                                                                                                if (!TextUtils.isEmpty(charSequence25)) {
                                                                                                }
                                                                                                if (charSequence6 instanceof Spannable) {
                                                                                                }
                                                                                                if (this.r2) {
                                                                                                }
                                                                                                this.a0 = org.telegram.ui.ActionBar.m6.F0[this.E0];
                                                                                                charSequence29 = charSequence27;
                                                                                                charSequence30 = null;
                                                                                                Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
                                                                                                if (this.r2) {
                                                                                                }
                                                                                                if (this.R1 > 0) {
                                                                                                }
                                                                                                try {
                                                                                                    TextPaint textPaint6 = this.a0;
                                                                                                    float L10 = org.telegram.messenger.g0.L(1.0f);
                                                                                                    TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                                                                                                    this.e3 = nu0.b(charSequence29, textPaint6, L5, L10, L5, charSequence30 != null ? 1 : 2);
                                                                                                    i27 = L5;
                                                                                                    this.i3.addAll(this.j3);
                                                                                                    this.j3.clear();
                                                                                                    xh.f.b(this, this.e3, -2, -2, this.i3, this.j3);
                                                                                                } catch (Exception e13) {
                                                                                                    e = e13;
                                                                                                    i27 = L5;
                                                                                                    this.e3 = null;
                                                                                                    org.telegram.messenger.a8.f(e);
                                                                                                    int i40 = i27;
                                                                                                    this.m3 = org.telegram.ui.Components.q5.update(0, (View) this, this.m3, this.e3);
                                                                                                    if (id.a0) {
                                                                                                    }
                                                                                                    staticLayout = this.f3;
                                                                                                    if (staticLayout != null) {
                                                                                                    }
                                                                                                    m0();
                                                                                                }
                                                                                                int i402 = i27;
                                                                                                this.m3 = org.telegram.ui.Components.q5.update(0, (View) this, this.m3, this.e3);
                                                                                                if (id.a0) {
                                                                                                }
                                                                                                staticLayout = this.f3;
                                                                                                if (staticLayout != null) {
                                                                                                }
                                                                                                m0();
                                                                                            }
                                                                                        }
                                                                                        l10 = org.telegram.messenger.i6.l(R3, org.telegram.ui.ActionBar.m6.F0[this.E0].getFontMetricsInt(), false);
                                                                                        if (this.f1.r2() && (x12 = org.telegram.messenger.g0.x1(l10, this.f1.Y1, this.J4)) != null) {
                                                                                            l10 = x12;
                                                                                        }
                                                                                        if (this.R1 > 0) {
                                                                                            if (!(l10 instanceof SpannableStringBuilder)) {
                                                                                                l10 = new SpannableStringBuilder(l10);
                                                                                            }
                                                                                            SpannableStringBuilder spannableStringBuilder11 = (SpannableStringBuilder) l10;
                                                                                            if (i15 >= spannableStringBuilder11.length()) {
                                                                                                spannableStringBuilder11.append(charSequence4);
                                                                                                spannableStringBuilder11.setSpan(new r2(org.telegram.messenger.g0.L(((this.L4 + 2) * this.R1) + 3)), spannableStringBuilder11.length() - 1, spannableStringBuilder11.length(), 33);
                                                                                            } else {
                                                                                                spannableStringBuilder11.insert(i15, charSequence4);
                                                                                                spannableStringBuilder11.setSpan(new r2(org.telegram.messenger.g0.L(((this.L4 + 2) * this.R1) + 3)), i15, i15 + 1, 33);
                                                                                            }
                                                                                        }
                                                                                        charSequence16 = l10;
                                                                                        z14 = false;
                                                                                        if (this.K0 == 0) {
                                                                                        }
                                                                                        z27 = z14;
                                                                                        charSequence6 = charSequence16;
                                                                                        L0 = str6;
                                                                                        i13 = i12;
                                                                                        charSequence19 = charSequence11;
                                                                                        z28 = z13;
                                                                                        charSequence20 = charSequence19;
                                                                                        charSequence8 = null;
                                                                                        charSequence23 = charSequence20;
                                                                                    }
                                                                                }
                                                                                str3 = U3;
                                                                                SpannableStringBuilder R32 = R(i34, str3, F1, false);
                                                                                if (this.O) {
                                                                                }
                                                                                i15 = 0;
                                                                                l10 = org.telegram.messenger.i6.l(R32, org.telegram.ui.ActionBar.m6.F0[this.E0].getFontMetricsInt(), false);
                                                                                if (this.f1.r2()) {
                                                                                    l10 = x12;
                                                                                }
                                                                                if (this.R1 > 0) {
                                                                                }
                                                                                charSequence16 = l10;
                                                                                z14 = false;
                                                                                if (this.K0 == 0) {
                                                                                }
                                                                                z27 = z14;
                                                                                charSequence6 = charSequence16;
                                                                                L0 = str6;
                                                                                i13 = i12;
                                                                                charSequence19 = charSequence11;
                                                                                z28 = z13;
                                                                                charSequence20 = charSequence19;
                                                                                charSequence8 = null;
                                                                                charSequence23 = charSequence20;
                                                                            } else {
                                                                                ij ijVar23 = this.f1;
                                                                                TLRPC.MessageAction messageAction = ijVar23.k.action;
                                                                                if (messageAction instanceof TLRPC.TL_messageActionPhoneCall) {
                                                                                    TLRPC.TL_messageActionPhoneCall tL_messageActionPhoneCall = (TLRPC.TL_messageActionPhoneCall) messageAction;
                                                                                    charSequence17 = ijVar23.P3() ? oh.a.a(tL_messageActionPhoneCall.video ? R.drawable.dialog_media_outgoing_video_call_20 : R.drawable.dialog_media_outgoing_call_20, charSequence2, false) : oh.a.a(tL_messageActionPhoneCall.video ? R.drawable.dialog_media_incoming_video_call_20 : R.drawable.dialog_media_incoming_call_20, charSequence2, false);
                                                                                } else {
                                                                                    CharSequence charSequence45 = charSequence2;
                                                                                    if (org.telegram.messenger.t3.V(this.g2) && (this.f1.k.action instanceof TLRPC.TL_messageActionChannelMigrateFrom)) {
                                                                                        charSequence17 = "";
                                                                                        z13 = false;
                                                                                    } else {
                                                                                        CharSequence charSequence46 = this.f1.w;
                                                                                        charSequence17 = charSequence46 != null ? charSequence46 : charSequence45;
                                                                                    }
                                                                                }
                                                                                this.a0 = org.telegram.ui.ActionBar.m6.H0[this.E0];
                                                                                if (this.f1.D == 21) {
                                                                                    k0();
                                                                                    charSequence18 = w(charSequence17);
                                                                                } else {
                                                                                    charSequence18 = charSequence17;
                                                                                }
                                                                            }
                                                                        } else {
                                                                            K = K();
                                                                        }
                                                                        charSequence13 = K;
                                                                        charSequence4 = charSequence10;
                                                                        z14 = false;
                                                                        str3 = null;
                                                                        charSequence16 = charSequence13;
                                                                        if (this.K0 == 0) {
                                                                        }
                                                                        z27 = z14;
                                                                        charSequence6 = charSequence16;
                                                                        L0 = str6;
                                                                        i13 = i12;
                                                                        charSequence19 = charSequence11;
                                                                        z28 = z13;
                                                                        charSequence20 = charSequence19;
                                                                        charSequence8 = null;
                                                                        charSequence23 = charSequence20;
                                                                    }
                                                                    charSequence4 = charSequence10;
                                                                    str3 = null;
                                                                    z13 = false;
                                                                    z15 = false;
                                                                    charSequence16 = str4;
                                                                    if (this.K0 == 0) {
                                                                    }
                                                                    z27 = z14;
                                                                    charSequence6 = charSequence16;
                                                                    L0 = str6;
                                                                    i13 = i12;
                                                                    charSequence19 = charSequence11;
                                                                    z28 = z13;
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
                                                                z27 = z14;
                                                                charSequence6 = charSequence16;
                                                                L0 = str6;
                                                                i13 = i12;
                                                                charSequence19 = charSequence11;
                                                                z28 = z13;
                                                                charSequence20 = charSequence19;
                                                                charSequence8 = null;
                                                                charSequence23 = charSequence20;
                                                            }
                                                        }
                                                    }
                                                    charSequence11 = charSequence3;
                                                    z15 = z9;
                                                } else {
                                                    z15 = z9;
                                                    charSequence10 = " ";
                                                    charSequence11 = charSequence3;
                                                }
                                                str = "";
                                                z17 = false;
                                                if (z17) {
                                                }
                                                charSequence4 = charSequence10;
                                                charSequence13 = charSequence18;
                                                str3 = null;
                                                charSequence16 = charSequence13;
                                                if (this.K0 == 0) {
                                                }
                                                z27 = z14;
                                                charSequence6 = charSequence16;
                                                L0 = str6;
                                                i13 = i12;
                                                charSequence19 = charSequence11;
                                                z28 = z13;
                                                charSequence20 = charSequence19;
                                                charSequence8 = null;
                                                charSequence23 = charSequence20;
                                            } else if (this.K0 != 0) {
                                                Z = L();
                                            } else if (this.J0 != 0) {
                                                Z = K();
                                            } else {
                                                TLRPC.EncryptedChat encryptedChat = this.h2;
                                                if (encryptedChat != null) {
                                                    this.a0 = org.telegram.ui.ActionBar.m6.H0[this.E0];
                                                    if (encryptedChat instanceof TLRPC.TL_encryptedChatRequested) {
                                                        Z = id.L0(2131751129);
                                                    } else if (encryptedChat instanceof TLRPC.TL_encryptedChatWaiting) {
                                                        Z = id.Z(2131753757, t10.i(this.f2));
                                                    } else if (encryptedChat instanceof TLRPC.TL_encryptedChatDiscarded) {
                                                        Z = id.L0(2131751128);
                                                    } else if (encryptedChat instanceof TLRPC.TL_encryptedChat) {
                                                        Z = encryptedChat.admin_id == p10.i(this.F0).e() ? id.Z(2131751140, t10.i(this.f2)) : id.L0(2131751141);
                                                    }
                                                } else if (this.j1 == 3 && t10.B(this.f2)) {
                                                    zw zwVar2 = this.D4;
                                                    int i41 = (zwVar2 == null || !zwVar2.O0) ? 2131745896 : 2131745895;
                                                    z27 = z14;
                                                    z15 = false;
                                                    i13 = i12;
                                                    charSequence4 = " ";
                                                    L0 = null;
                                                    charSequence8 = null;
                                                    z28 = false;
                                                    charSequence6 = id.L0(i41);
                                                    charSequence23 = charSequence3;
                                                }
                                                z27 = z14;
                                                z15 = z9;
                                                i13 = i12;
                                                charSequence4 = " ";
                                                charSequence6 = "";
                                                z28 = z13;
                                                L0 = null;
                                                charSequence20 = charSequence3;
                                                charSequence8 = null;
                                                charSequence23 = charSequence20;
                                            }
                                        }
                                        z27 = z14;
                                        z15 = z9;
                                        i13 = i12;
                                        charSequence6 = Z;
                                        charSequence4 = " ";
                                        z28 = z13;
                                        L0 = null;
                                        charSequence20 = charSequence3;
                                        charSequence8 = null;
                                        charSequence23 = charSequence20;
                                    }
                                    if (!this.x0 && !V() && !W() && !U() && this.l2 == null && (ijVar5 = this.f1) != null && (message2 = ijVar5.k) != null && (message2.action instanceof TLRPC.TL_messageActionStarGift)) {
                                        this.y0 = true;
                                        SpannableStringBuilder spannableStringBuilder12 = new SpannableStringBuilder(charSequence6);
                                        spannableStringBuilder12.insert(0, (CharSequence) "d ");
                                        wp wpVar3 = new wp(f0.d.d(getContext(), R.drawable.mini_gift).mutate());
                                        wpVar3.H = 1.25f;
                                        wpVar3.I = 1.25f;
                                        wpVar3.G = 0.9f;
                                        wpVar3.x = 0.9f;
                                        spannableStringBuilder12.setSpan(wpVar3, 0, 1, 0);
                                        tL_textWithEntities = ((TLRPC.TL_messageActionStarGift) this.f1.k.action).message;
                                        if (tL_textWithEntities != null && !TextUtils.isEmpty(tL_textWithEntities.text)) {
                                            this.a0 = org.telegram.ui.ActionBar.m6.F0[this.E0];
                                        }
                                        charSequence6 = spannableStringBuilder12;
                                    }
                                    if (TextUtils.isEmpty(this.I0)) {
                                        if (this.l2 != null) {
                                            e12 = id.e1(r5.date);
                                        } else {
                                            int i42 = this.R0;
                                            if (i42 != 0) {
                                                e12 = id.e1(i42);
                                            } else {
                                                if (this.f1 != null) {
                                                    e12 = id.e1(r5.k.date);
                                                }
                                            }
                                        }
                                        ijVar4 = this.f1;
                                        if (ijVar4 != null || this.r0) {
                                            this.Q2 = false;
                                            this.R2 = false;
                                            this.S2 = ijVar4 == null && ijVar4.o4() && this.H0 == p10.i(this.F0).e();
                                            z19 = false;
                                            this.G3 = false;
                                            this.b4 = false;
                                            this.c4 = false;
                                            this.d4 = false;
                                            this.t3 = false;
                                            str7 = null;
                                            str12 = null;
                                        } else {
                                            if (this.J0 != 0) {
                                                int i43 = this.S0;
                                                int i44 = this.U0;
                                                int i45 = i43 + i44;
                                                if (i45 <= 0) {
                                                    z24 = false;
                                                    this.G3 = false;
                                                    this.b4 = false;
                                                    str7 = null;
                                                } else if (i43 > i44) {
                                                    this.G3 = true;
                                                    z24 = false;
                                                    this.b4 = false;
                                                    str7 = String.format("%d", Integer.valueOf(i45));
                                                } else {
                                                    z24 = false;
                                                    this.G3 = false;
                                                    this.b4 = true;
                                                    str11 = String.format("%d", Integer.valueOf(i45));
                                                    str7 = null;
                                                    this.c4 = z24;
                                                    this.d4 = z24;
                                                    str10 = str11;
                                                }
                                                str11 = null;
                                                this.c4 = z24;
                                                this.d4 = z24;
                                                str10 = str11;
                                            } else {
                                                if (this.h1) {
                                                    this.G3 = false;
                                                    z28 = false;
                                                    str7 = null;
                                                    z21 = true;
                                                } else {
                                                    int i46 = this.S0;
                                                    if (i46 != 0) {
                                                        z21 = true;
                                                        this.G3 = true;
                                                        str7 = String.format("%d", Integer.valueOf(i46));
                                                    } else {
                                                        z21 = true;
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
                                                    this.b4 = z21;
                                                    str10 = "@";
                                                } else {
                                                    this.b4 = false;
                                                    str10 = null;
                                                }
                                                this.c4 = this.V0 > 0;
                                                this.d4 = this.W0 > 0;
                                            }
                                            if (this.f1.N3() && this.l2 == null && z28) {
                                                ij ijVar24 = this.f1;
                                                if (!(ijVar24.k.action instanceof TLRPC.TL_messageActionHistoryClear)) {
                                                    if (ijVar24.o4()) {
                                                        z23 = false;
                                                        this.Q2 = false;
                                                        this.R2 = false;
                                                        this.S2 = true;
                                                        this.t3 = false;
                                                    } else {
                                                        z23 = false;
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
                                                                    this.Q2 = tL_forumTopic.read_outbox_max_id >= this.f1.e1();
                                                                } else if (this.N0) {
                                                                    int i47 = this.H4;
                                                                    this.Q2 = (i47 > 0 && i47 >= this.f1.e1()) || !this.f1.F4() || (org.telegram.messenger.t3.T(this.g2) && !this.g2.megagroup);
                                                                } else {
                                                                    this.Q2 = !this.f1.F4() || (org.telegram.messenger.t3.T(this.g2) && !this.g2.megagroup);
                                                                }
                                                                this.R2 = true;
                                                                z22 = false;
                                                                this.S2 = false;
                                                                this.t3 = false;
                                                            } else {
                                                                z22 = false;
                                                            }
                                                            str12 = str10;
                                                            z19 = z22;
                                                        }
                                                    }
                                                    z22 = z23;
                                                    str12 = str10;
                                                    z19 = z22;
                                                }
                                            }
                                            z22 = false;
                                            this.Q2 = false;
                                            this.R2 = false;
                                            this.S2 = false;
                                            this.t3 = false;
                                            str12 = str10;
                                            z19 = z22;
                                        }
                                        this.P2 = z19;
                                        s12 = qp.s1(this.F0);
                                        if (this.j1 == 0 && s12.C2(this.H0, true)) {
                                            this.z3 = true;
                                            this.P2 = true;
                                            i17 = s12.A2;
                                            if (i17 != 0) {
                                                e12 = id.L0(2131743781);
                                            } else if (i17 == 1) {
                                                e12 = id.N0("PsaType_" + s12.C2);
                                                if (TextUtils.isEmpty(e12)) {
                                                    e12 = id.L0(2131746593);
                                                }
                                                if (!TextUtils.isEmpty(s12.B2)) {
                                                    charSequence6 = s12.B2;
                                                    this.R1 = 0;
                                                }
                                            }
                                        }
                                        str8 = e12;
                                        str9 = this.L0;
                                        if (str9 == null) {
                                            charSequence25 = charSequence23;
                                            charSequence24 = str9;
                                        } else if (this.J0 != 0) {
                                            charSequence25 = charSequence23;
                                            charSequence24 = id.L0(2131754136);
                                        } else {
                                            TLRPC.Chat chat9 = this.g2;
                                            if (chat9 != null) {
                                                if (this.O) {
                                                    if (this.h0 == null) {
                                                        this.h0 = new Drawable[1];
                                                    }
                                                    this.h0[0] = null;
                                                    U = qp.s1(this.F0).S1().j(this.g2, this.f1, this.a0, this.h0);
                                                } else if (this.P) {
                                                    if (this.h0 == null) {
                                                        this.h0 = new Drawable[1];
                                                    }
                                                    Drawable[] drawableArr = this.h0;
                                                    drawableArr[0] = null;
                                                    U = this.g0 ? qg.d.j(this.N, org.telegram.ui.ActionBar.m6.B0[this.E0], drawableArr) : org.telegram.messenger.g0.U(this.N.title);
                                                } else if (!chat9.monoforum || chat9.linked_monoforum_id == 0) {
                                                    U = org.telegram.messenger.g0.U(chat9.title);
                                                } else {
                                                    TLRPC.Chat M02 = qp.s1(this.F0).M0(Long.valueOf(this.g2.linked_monoforum_id));
                                                    if (M02 != null) {
                                                        SpannableStringBuilder spannableStringBuilder13 = new SpannableStringBuilder(org.telegram.messenger.g0.U(M02.title));
                                                        spannableStringBuilder13.append(charSequence4);
                                                        int length4 = spannableStringBuilder13.length();
                                                        spannableStringBuilder13.append((CharSequence) id.L0(2131748347));
                                                        spannableStringBuilder13.setSpan(new org.telegram.ui.iz(id.L0(2131748347), org.telegram.ui.ActionBar.m6.y6, this.J4), length4, spannableStringBuilder13.length(), 33);
                                                        charSequence24 = spannableStringBuilder13;
                                                    } else {
                                                        U = org.telegram.messenger.g0.U(this.g2.title);
                                                    }
                                                }
                                                charSequence24 = U;
                                            } else {
                                                TLRPC.User user6 = this.f2;
                                                if (user6 != null) {
                                                    if (t10.z(user6)) {
                                                        U = id.L0(2131746266);
                                                    } else if (t10.s(this.f2)) {
                                                        U = id.L0(2131754252);
                                                    } else if (!t10.B(this.f2) || this.q0) {
                                                        if (this.P) {
                                                            if (this.h0 == null) {
                                                                this.h0 = new Drawable[1];
                                                            }
                                                            Drawable[] drawableArr2 = this.h0;
                                                            drawableArr2[0] = null;
                                                            U = this.g0 ? qg.d.j(this.N, org.telegram.ui.ActionBar.m6.B0[this.E0], drawableArr2) : org.telegram.messenger.g0.U(this.N.title);
                                                        } else {
                                                            U = org.telegram.messenger.g0.U(t10.p(this.f2));
                                                        }
                                                    } else if (this.r0) {
                                                        U = id.L0(2131748303);
                                                    } else if (this.u2) {
                                                        U = id.L0(2131750503);
                                                    } else {
                                                        if (this.j1 == 3) {
                                                            this.z3 = true;
                                                        }
                                                        U = id.L0(2131745901);
                                                    }
                                                    charSequence24 = U;
                                                }
                                                charSequence24 = "";
                                            }
                                            if (charSequence24 != null && charSequence24.length() == 0) {
                                                charSequence24 = id.L0(2131749328);
                                            }
                                            charSequence25 = charSequence23;
                                        }
                                        z20 = z27;
                                        i16 = i13;
                                        z9 = z15;
                                        charSequence26 = charSequence8;
                                    }
                                    e12 = "";
                                    ijVar4 = this.f1;
                                    if (ijVar4 != null) {
                                    }
                                    this.Q2 = false;
                                    this.R2 = false;
                                    this.S2 = ijVar4 == null && ijVar4.o4() && this.H0 == p10.i(this.F0).e();
                                    z19 = false;
                                    this.G3 = false;
                                    this.b4 = false;
                                    this.c4 = false;
                                    this.d4 = false;
                                    this.t3 = false;
                                    str7 = null;
                                    str12 = null;
                                    this.P2 = z19;
                                    s12 = qp.s1(this.F0);
                                    if (this.j1 == 0) {
                                        this.z3 = true;
                                        this.P2 = true;
                                        i17 = s12.A2;
                                        if (i17 != 0) {
                                        }
                                    }
                                    str8 = e12;
                                    str9 = this.L0;
                                    if (str9 == null) {
                                    }
                                    z20 = z27;
                                    i16 = i13;
                                    z9 = z15;
                                    charSequence26 = charSequence8;
                                } else {
                                    this.l2 = null;
                                    this.k2 = false;
                                    charSequence21 = this.I0;
                                    this.a0 = org.telegram.ui.ActionBar.m6.F0[this.E0];
                                    z15 = z9;
                                    L0 = null;
                                    charSequence22 = null;
                                }
                            }
                            charSequence6 = charSequence21;
                            charSequence4 = " ";
                            charSequence23 = "";
                            i13 = -1;
                            charSequence8 = charSequence22;
                            if (!this.x0) {
                                this.y0 = true;
                                SpannableStringBuilder spannableStringBuilder122 = new SpannableStringBuilder(charSequence6);
                                spannableStringBuilder122.insert(0, (CharSequence) "d ");
                                wp wpVar32 = new wp(f0.d.d(getContext(), R.drawable.mini_gift).mutate());
                                wpVar32.H = 1.25f;
                                wpVar32.I = 1.25f;
                                wpVar32.G = 0.9f;
                                wpVar32.x = 0.9f;
                                spannableStringBuilder122.setSpan(wpVar32, 0, 1, 0);
                                tL_textWithEntities = ((TLRPC.TL_messageActionStarGift) this.f1.k.action).message;
                                if (tL_textWithEntities != null) {
                                    this.a0 = org.telegram.ui.ActionBar.m6.F0[this.E0];
                                }
                                charSequence6 = spannableStringBuilder122;
                            }
                            if (TextUtils.isEmpty(this.I0)) {
                            }
                            e12 = "";
                            ijVar4 = this.f1;
                            if (ijVar4 != null) {
                            }
                            this.Q2 = false;
                            this.R2 = false;
                            this.S2 = ijVar4 == null && ijVar4.o4() && this.H0 == p10.i(this.F0).e();
                            z19 = false;
                            this.G3 = false;
                            this.b4 = false;
                            this.c4 = false;
                            this.d4 = false;
                            this.t3 = false;
                            str7 = null;
                            str12 = null;
                            this.P2 = z19;
                            s12 = qp.s1(this.F0);
                            if (this.j1 == 0) {
                            }
                            str8 = e12;
                            str9 = this.L0;
                            if (str9 == null) {
                            }
                            z20 = z27;
                            i16 = i13;
                            z9 = z15;
                            charSequence26 = charSequence8;
                        }
                    }
                    draftMessage = this.l2;
                    if (draftMessage != null) {
                        if (i11 > draftMessage.date) {
                        }
                    }
                }
                if (org.telegram.messenger.t3.T(this.g2)) {
                    TLRPC.Chat chat10 = this.g2;
                    if (!chat10.megagroup) {
                        if (!chat10.creator) {
                            TLRPC.TL_chatAdminRights tL_chatAdminRights = chat10.admin_rights;
                            if (tL_chatAdminRights != null) {
                            }
                            this.l2 = null;
                            this.k2 = false;
                            if (W()) {
                            }
                            charSequence6 = charSequence21;
                            charSequence4 = " ";
                            charSequence23 = "";
                            i13 = -1;
                            charSequence8 = charSequence22;
                            if (!this.x0) {
                            }
                            if (TextUtils.isEmpty(this.I0)) {
                            }
                            e12 = "";
                            ijVar4 = this.f1;
                            if (ijVar4 != null) {
                            }
                            this.Q2 = false;
                            this.R2 = false;
                            this.S2 = ijVar4 == null && ijVar4.o4() && this.H0 == p10.i(this.F0).e();
                            z19 = false;
                            this.G3 = false;
                            this.b4 = false;
                            this.c4 = false;
                            this.d4 = false;
                            this.t3 = false;
                            str7 = null;
                            str12 = null;
                            this.P2 = z19;
                            s12 = qp.s1(this.F0);
                            if (this.j1 == 0) {
                            }
                            str8 = e12;
                            str9 = this.L0;
                            if (str9 == null) {
                            }
                            z20 = z27;
                            i16 = i13;
                            z9 = z15;
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
                    if (W()) {
                    }
                    charSequence6 = charSequence21;
                    charSequence4 = " ";
                    charSequence23 = "";
                    i13 = -1;
                    charSequence8 = charSequence22;
                    if (!this.x0) {
                    }
                    if (TextUtils.isEmpty(this.I0)) {
                    }
                    e12 = "";
                    ijVar4 = this.f1;
                    if (ijVar4 != null) {
                    }
                    this.Q2 = false;
                    this.R2 = false;
                    this.S2 = ijVar4 == null && ijVar4.o4() && this.H0 == p10.i(this.F0).e();
                    z19 = false;
                    this.G3 = false;
                    this.b4 = false;
                    this.c4 = false;
                    this.d4 = false;
                    this.t3 = false;
                    str7 = null;
                    str12 = null;
                    this.P2 = z19;
                    s12 = qp.s1(this.F0);
                    if (this.j1 == 0) {
                    }
                    str8 = e12;
                    str9 = this.L0;
                    if (str9 == null) {
                    }
                    z20 = z27;
                    i16 = i13;
                    z9 = z15;
                    charSequence26 = charSequence8;
                }
                if (org.telegram.messenger.t3.c0(chat)) {
                }
                if (W()) {
                }
                charSequence6 = charSequence21;
                charSequence4 = " ";
                charSequence23 = "";
                i13 = -1;
                charSequence8 = charSequence22;
                if (!this.x0) {
                }
                if (TextUtils.isEmpty(this.I0)) {
                }
                e12 = "";
                ijVar4 = this.f1;
                if (ijVar4 != null) {
                }
                this.Q2 = false;
                this.R2 = false;
                this.S2 = ijVar4 == null && ijVar4.o4() && this.H0 == p10.i(this.F0).e();
                z19 = false;
                this.G3 = false;
                this.b4 = false;
                this.c4 = false;
                this.d4 = false;
                this.t3 = false;
                str7 = null;
                str12 = null;
                this.P2 = z19;
                s12 = qp.s1(this.F0);
                if (this.j1 == 0) {
                }
                str8 = e12;
                str9 = this.L0;
                if (str9 == null) {
                }
                z20 = z27;
                i16 = i13;
                z9 = z15;
                charSequence26 = charSequence8;
            }
            i10 = i7;
            charSequence = charSequence32;
            i11 = this.R0;
            if (i11 == 0) {
                i11 = ijVar6.k.date;
            }
            if (!this.P) {
            }
            z12 = this.k2;
            if (!z12) {
            }
            if (!z12) {
                draftMessage3 = this.l2;
                if (draftMessage3.rich_message == null) {
                }
            }
            draftMessage = this.l2;
            if (draftMessage != null) {
            }
            if (org.telegram.messenger.t3.T(this.g2)) {
            }
            chat = this.g2;
            if (chat != null) {
            }
            if (org.telegram.messenger.t3.c0(chat)) {
            }
            if (W()) {
            }
            charSequence6 = charSequence21;
            charSequence4 = " ";
            charSequence23 = "";
            i13 = -1;
            charSequence8 = charSequence22;
            if (!this.x0) {
            }
            if (TextUtils.isEmpty(this.I0)) {
            }
            e12 = "";
            ijVar4 = this.f1;
            if (ijVar4 != null) {
            }
            this.Q2 = false;
            this.R2 = false;
            this.S2 = ijVar4 == null && ijVar4.o4() && this.H0 == p10.i(this.F0).e();
            z19 = false;
            this.G3 = false;
            this.b4 = false;
            this.c4 = false;
            this.d4 = false;
            this.t3 = false;
            str7 = null;
            str12 = null;
            this.P2 = z19;
            s12 = qp.s1(this.F0);
            if (this.j1 == 0) {
            }
            str8 = e12;
            str9 = this.L0;
            if (str9 == null) {
            }
            z20 = z27;
            i16 = i13;
            z9 = z15;
            charSequence26 = charSequence8;
        }
        charSequence27 = L0;
        if (z9) {
            f12 = 24.0f;
            f13 = 0.0f;
            this.N2 = null;
            this.L2 = 0;
            i19 = 0;
        } else {
            TextPaint timeTextPaint = getTimeTextPaint();
            f12 = 24.0f;
            f13 = 0.0f;
            int ceil = (int) Math.ceil(timeTextPaint.measureText(str8));
            this.N2 = new StaticLayout(str8, timeTextPaint, ceil, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            i19 = org.telegram.messenger.g0.L(getIsPinned() ? 24.0f : 0.0f) + ceil;
            if (id.a0) {
                this.L2 = org.telegram.messenger.g0.L(15.0f);
            } else {
                this.L2 = org.telegram.messenger.k5.z(15.0f, getMeasuredWidth(), i19);
            }
        }
        if (J()) {
            i20 = 0;
        } else {
            if (id.a0) {
                this.O2 = org.telegram.messenger.g0.L(4.0f) + this.L2 + i19;
            } else {
                this.O2 = (this.L2 - org.telegram.ui.ActionBar.m6.b1.getIntrinsicWidth()) - org.telegram.messenger.g0.L(4.0f);
            }
            i20 = org.telegram.ui.ActionBar.m6.b1.getIntrinsicWidth() + org.telegram.messenger.g0.L(4.0f);
            i19 += i20;
        }
        if (id.a0) {
            this.y2 = org.telegram.messenger.k5.z(22.0f, getMeasuredWidth() - this.x2, i19);
        } else {
            this.y2 = org.telegram.messenger.k5.z(this.I + 13, getMeasuredWidth() - this.x2, i19);
            this.x2 += i19;
        }
        if (this.G2) {
            this.y2 -= org.telegram.ui.ActionBar.m6.a1.getIntrinsicWidth() + org.telegram.messenger.g0.L(id.a0 ? 8.0f : 4.0f);
        }
        if (!this.S2) {
            int L11 = org.telegram.messenger.g0.L(5.0f) + org.telegram.ui.ActionBar.m6.X0.getIntrinsicWidth();
            this.y2 -= L11;
            if (id.a0) {
                this.V2 = org.telegram.messenger.g0.L(5.0f) + this.L2 + i19;
                this.x2 += L11;
            } else {
                this.V2 = (this.L2 - i20) - L11;
            }
        } else if (this.R2) {
            int L12 = org.telegram.messenger.g0.L(5.0f) + org.telegram.ui.ActionBar.m6.T0.getIntrinsicWidth();
            int i48 = this.y2 - L12;
            this.y2 = i48;
            if (this.Q2) {
                this.y2 = org.telegram.messenger.k5.B(8.0f, org.telegram.ui.ActionBar.m6.W0.getIntrinsicWidth(), i48);
                if (id.a0) {
                    int L13 = org.telegram.messenger.g0.L(5.0f) + this.L2 + i19;
                    this.T2 = L13;
                    this.X2 = org.telegram.messenger.g0.L(5.5f) + L13;
                    this.x2 = org.telegram.messenger.camera.q.D(8.0f, org.telegram.ui.ActionBar.m6.W0.getIntrinsicWidth() + L12, this.x2);
                } else {
                    int i49 = (this.L2 - i20) - L12;
                    this.X2 = i49;
                    this.T2 = i49 - org.telegram.messenger.g0.L(5.5f);
                }
            } else if (id.a0) {
                this.U2 = org.telegram.messenger.g0.L(5.0f) + this.L2 + i19;
                this.x2 += L12;
            } else {
                this.U2 = (this.L2 - i20) - L12;
            }
        }
        z25 = (!this.Z0 || this.Q0 || this.b1 || this.c1 > f13) && !this.j4 && this.p4 == 0;
        if (!this.l4 && this.n4.c() != null) {
            int L14 = org.telegram.messenger.g0.L(36.0f);
            if (z25) {
                L14 += org.telegram.ui.ActionBar.m6.c1.getIntrinsicWidth() + org.telegram.messenger.g0.L(6.0f);
            }
            this.y2 -= L14;
            if (id.a0) {
                this.x2 += L14;
            }
        } else if (!z25) {
            int intrinsicWidth = org.telegram.ui.ActionBar.m6.c1.getIntrinsicWidth() + org.telegram.messenger.g0.L(6.0f);
            if (this.l4) {
                intrinsicWidth += org.telegram.messenger.g0.L(36.0f);
            }
            this.y2 -= intrinsicWidth;
            if (id.a0) {
                this.x2 += intrinsicWidth;
            }
        } else if (this.j4) {
            int intrinsicWidth2 = org.telegram.ui.ActionBar.m6.f1.getIntrinsicWidth() + org.telegram.messenger.g0.L(6.0f);
            this.y2 -= intrinsicWidth2;
            if (id.a0) {
                this.x2 += intrinsicWidth2;
            }
        } else if (this.l4) {
            int L15 = org.telegram.messenger.g0.L(36.0f);
            this.y2 -= L15;
            if (id.a0) {
                this.x2 += L15;
            }
        } else if (this.p4 != 0) {
            int intrinsicWidth3 = (this.p4 == 1 ? org.telegram.ui.ActionBar.m6.g1 : org.telegram.ui.ActionBar.m6.h1).getIntrinsicWidth() + org.telegram.messenger.g0.L(6.0f);
            this.y2 -= intrinsicWidth3;
            if (id.a0) {
                this.x2 += intrinsicWidth3;
            }
        }
        if (this.k4) {
            this.y2 -= org.telegram.messenger.g0.L(21.0f);
        }
        try {
            L8 = this.y2 - org.telegram.messenger.g0.L(12.0f);
            if (L8 < 0) {
                L8 = 0;
            }
            if (charSequence24 instanceof String) {
                charSequence24 = ((String) charSequence24).replace(c10, ' ');
            }
            if (this.D2) {
                f14 = 36.0f;
                f15 = 8.0f;
            } else {
                f14 = 36.0f;
                try {
                    f15 = 8.0f;
                    try {
                        this.A2 = charSequence24.length() == TextUtils.ellipsize(charSequence24, org.telegram.ui.ActionBar.m6.B0[this.E0], (float) L8, TextUtils.TruncateAt.END).length();
                        L8 += org.telegram.messenger.g0.L(48.0f);
                    } catch (Exception e14) {
                        e = e14;
                        org.telegram.messenger.a8.f(e);
                        this.p3 = org.telegram.ui.Components.q5.update(0, (View) this, this.p3, this.z2);
                        if (this.r2) {
                        }
                        f16 = 39.0f;
                        f17 = f12;
                        f18 = 13.0f;
                        L = org.telegram.messenger.g0.L(11.0f);
                        this.q3 = org.telegram.messenger.g0.L(32.0f);
                        this.M2 = org.telegram.messenger.g0.L(13.0f);
                        this.u3 = org.telegram.messenger.g0.L(42.33f);
                        this.C3 = org.telegram.messenger.g0.L(43.0f);
                        this.M3 = org.telegram.messenger.g0.L(42.33f);
                        this.W2 = org.telegram.messenger.g0.L(13.0f);
                        int measuredWidth42 = getMeasuredWidth() - org.telegram.messenger.g0.L(this.I + 21);
                        if (id.a0) {
                        }
                        i21 = L3;
                        this.u0.F.set(L2, L, org.telegram.messenger.g0.L(56.0f) + L2, org.telegram.messenger.g0.L(56.0f) + L);
                        i22 = 0;
                        while (true) {
                            imageReceiverArr = this.V1;
                            if (i22 < imageReceiverArr.length) {
                            }
                            imageReceiverArr[i22].y0(((this.L4 + 2) * i22) + i21, ((org.telegram.messenger.g0.L(31.0f) + L) + (this.Q ? org.telegram.messenger.g0.L(20.0f) : 0)) - ((this.r2 || iz.p1 || (eVar = this.t0) == null || eVar.F()) ? 0 : org.telegram.messenger.g0.L(9.0f)), org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(18.0f));
                            i22++;
                            L = L;
                        }
                        i23 = L;
                        i24 = measuredWidth42;
                        if (id.a0) {
                        }
                        if (this.Q) {
                        }
                        if (!this.r2) {
                            this.M2 -= org.telegram.messenger.g0.L(6.0f);
                            this.W2 -= org.telegram.messenger.g0.L(6.0f);
                            if (getIsPinned()) {
                            }
                            if (this.t3) {
                            }
                            if (this.t3) {
                            }
                            this.H3 = z26;
                            if (z26) {
                            }
                            if (z20) {
                            }
                            int max2 = Math.max(org.telegram.messenger.g0.L(12.0f), i24);
                            this.g3 = org.telegram.messenger.g0.L((!this.r2 || iz.p1) ? 58.0f : 62.0f);
                            if (!this.r2) {
                                this.g3 -= org.telegram.messenger.g0.L(!W() ? 10.0f : 12.0f);
                                if (!W()) {
                                }
                                if (this.Q) {
                                }
                                this.n3 = org.telegram.ui.Components.q5.update(0, (View) this, this.n3, this.s3);
                                if (TextUtils.isEmpty(charSequence26)) {
                                }
                                this.o3 = org.telegram.ui.Components.q5.update(0, (View) this, this.o3, this.h3);
                                if (!TextUtils.isEmpty(charSequence25)) {
                                }
                                if (charSequence6 instanceof Spannable) {
                                }
                                if (this.r2) {
                                }
                                this.a0 = org.telegram.ui.ActionBar.m6.F0[this.E0];
                                charSequence29 = charSequence27;
                                charSequence30 = null;
                                Layout.Alignment alignment2 = Layout.Alignment.ALIGN_NORMAL;
                                if (this.r2) {
                                }
                                if (this.R1 > 0) {
                                }
                                TextPaint textPaint62 = this.a0;
                                float L102 = org.telegram.messenger.g0.L(1.0f);
                                TextUtils.TruncateAt truncateAt2 = TextUtils.TruncateAt.END;
                                this.e3 = nu0.b(charSequence29, textPaint62, L5, L102, L5, charSequence30 != null ? 1 : 2);
                                i27 = L5;
                                this.i3.addAll(this.j3);
                                this.j3.clear();
                                xh.f.b(this, this.e3, -2, -2, this.i3, this.j3);
                                int i4022 = i27;
                                this.m3 = org.telegram.ui.Components.q5.update(0, (View) this, this.m3, this.e3);
                                if (id.a0) {
                                }
                                staticLayout = this.f3;
                                if (staticLayout != null) {
                                }
                                m0();
                            }
                            this.g3 -= org.telegram.messenger.g0.L(!W() ? 10.0f : 12.0f);
                            if (!W()) {
                            }
                            if (this.Q) {
                            }
                            this.n3 = org.telegram.ui.Components.q5.update(0, (View) this, this.n3, this.s3);
                            if (TextUtils.isEmpty(charSequence26)) {
                            }
                            this.o3 = org.telegram.ui.Components.q5.update(0, (View) this, this.o3, this.h3);
                            if (!TextUtils.isEmpty(charSequence25)) {
                            }
                            if (charSequence6 instanceof Spannable) {
                            }
                            if (this.r2) {
                            }
                            this.a0 = org.telegram.ui.ActionBar.m6.F0[this.E0];
                            charSequence29 = charSequence27;
                            charSequence30 = null;
                            Layout.Alignment alignment22 = Layout.Alignment.ALIGN_NORMAL;
                            if (this.r2) {
                            }
                            if (this.R1 > 0) {
                            }
                            TextPaint textPaint622 = this.a0;
                            float L1022 = org.telegram.messenger.g0.L(1.0f);
                            TextUtils.TruncateAt truncateAt22 = TextUtils.TruncateAt.END;
                            this.e3 = nu0.b(charSequence29, textPaint622, L5, L1022, L5, charSequence30 != null ? 1 : 2);
                            i27 = L5;
                            this.i3.addAll(this.j3);
                            this.j3.clear();
                            xh.f.b(this, this.e3, -2, -2, this.i3, this.j3);
                            int i40222 = i27;
                            this.m3 = org.telegram.ui.Components.q5.update(0, (View) this, this.m3, this.e3);
                            if (id.a0) {
                            }
                            staticLayout = this.f3;
                            if (staticLayout != null) {
                            }
                            m0();
                        }
                        this.M2 -= org.telegram.messenger.g0.L(6.0f);
                        this.W2 -= org.telegram.messenger.g0.L(6.0f);
                        if (getIsPinned()) {
                        }
                        if (this.t3) {
                        }
                        if (this.t3) {
                        }
                        this.H3 = z26;
                        if (z26) {
                        }
                        if (z20) {
                        }
                        int max22 = Math.max(org.telegram.messenger.g0.L(12.0f), i24);
                        this.g3 = org.telegram.messenger.g0.L((!this.r2 || iz.p1) ? 58.0f : 62.0f);
                        if (!this.r2) {
                        }
                        this.g3 -= org.telegram.messenger.g0.L(!W() ? 10.0f : 12.0f);
                        if (!W()) {
                        }
                        if (this.Q) {
                        }
                        this.n3 = org.telegram.ui.Components.q5.update(0, (View) this, this.n3, this.s3);
                        if (TextUtils.isEmpty(charSequence26)) {
                        }
                        this.o3 = org.telegram.ui.Components.q5.update(0, (View) this, this.o3, this.h3);
                        if (!TextUtils.isEmpty(charSequence25)) {
                        }
                        if (charSequence6 instanceof Spannable) {
                        }
                        if (this.r2) {
                        }
                        this.a0 = org.telegram.ui.ActionBar.m6.F0[this.E0];
                        charSequence29 = charSequence27;
                        charSequence30 = null;
                        Layout.Alignment alignment222 = Layout.Alignment.ALIGN_NORMAL;
                        if (this.r2) {
                        }
                        if (this.R1 > 0) {
                        }
                        TextPaint textPaint6222 = this.a0;
                        float L10222 = org.telegram.messenger.g0.L(1.0f);
                        TextUtils.TruncateAt truncateAt222 = TextUtils.TruncateAt.END;
                        this.e3 = nu0.b(charSequence29, textPaint6222, L5, L10222, L5, charSequence30 != null ? 1 : 2);
                        i27 = L5;
                        this.i3.addAll(this.j3);
                        this.j3.clear();
                        xh.f.b(this, this.e3, -2, -2, this.i3, this.j3);
                        int i402222 = i27;
                        this.m3 = org.telegram.ui.Components.q5.update(0, (View) this, this.m3, this.e3);
                        if (id.a0) {
                        }
                        staticLayout = this.f3;
                        if (staticLayout != null) {
                        }
                        m0();
                    }
                } catch (Exception e15) {
                    e = e15;
                    f15 = 8.0f;
                    org.telegram.messenger.a8.f(e);
                    this.p3 = org.telegram.ui.Components.q5.update(0, (View) this, this.p3, this.z2);
                    if (this.r2) {
                    }
                    f16 = 39.0f;
                    f17 = f12;
                    f18 = 13.0f;
                    L = org.telegram.messenger.g0.L(11.0f);
                    this.q3 = org.telegram.messenger.g0.L(32.0f);
                    this.M2 = org.telegram.messenger.g0.L(13.0f);
                    this.u3 = org.telegram.messenger.g0.L(42.33f);
                    this.C3 = org.telegram.messenger.g0.L(43.0f);
                    this.M3 = org.telegram.messenger.g0.L(42.33f);
                    this.W2 = org.telegram.messenger.g0.L(13.0f);
                    int measuredWidth422 = getMeasuredWidth() - org.telegram.messenger.g0.L(this.I + 21);
                    if (id.a0) {
                    }
                    i21 = L3;
                    this.u0.F.set(L2, L, org.telegram.messenger.g0.L(56.0f) + L2, org.telegram.messenger.g0.L(56.0f) + L);
                    i22 = 0;
                    while (true) {
                        imageReceiverArr = this.V1;
                        if (i22 < imageReceiverArr.length) {
                        }
                        imageReceiverArr[i22].y0(((this.L4 + 2) * i22) + i21, ((org.telegram.messenger.g0.L(31.0f) + L) + (this.Q ? org.telegram.messenger.g0.L(20.0f) : 0)) - ((this.r2 || iz.p1 || (eVar = this.t0) == null || eVar.F()) ? 0 : org.telegram.messenger.g0.L(9.0f)), org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(18.0f));
                        i22++;
                        L = L;
                    }
                    i23 = L;
                    i24 = measuredWidth422;
                    if (id.a0) {
                    }
                    if (this.Q) {
                    }
                    if (!this.r2) {
                    }
                    this.M2 -= org.telegram.messenger.g0.L(6.0f);
                    this.W2 -= org.telegram.messenger.g0.L(6.0f);
                    if (getIsPinned()) {
                    }
                    if (this.t3) {
                    }
                    if (this.t3) {
                    }
                    this.H3 = z26;
                    if (z26) {
                    }
                    if (z20) {
                    }
                    int max222 = Math.max(org.telegram.messenger.g0.L(12.0f), i24);
                    this.g3 = org.telegram.messenger.g0.L((!this.r2 || iz.p1) ? 58.0f : 62.0f);
                    if (!this.r2) {
                    }
                    this.g3 -= org.telegram.messenger.g0.L(!W() ? 10.0f : 12.0f);
                    if (!W()) {
                    }
                    if (this.Q) {
                    }
                    this.n3 = org.telegram.ui.Components.q5.update(0, (View) this, this.n3, this.s3);
                    if (TextUtils.isEmpty(charSequence26)) {
                    }
                    this.o3 = org.telegram.ui.Components.q5.update(0, (View) this, this.o3, this.h3);
                    if (!TextUtils.isEmpty(charSequence25)) {
                    }
                    if (charSequence6 instanceof Spannable) {
                    }
                    if (this.r2) {
                    }
                    this.a0 = org.telegram.ui.ActionBar.m6.F0[this.E0];
                    charSequence29 = charSequence27;
                    charSequence30 = null;
                    Layout.Alignment alignment2222 = Layout.Alignment.ALIGN_NORMAL;
                    if (this.r2) {
                    }
                    if (this.R1 > 0) {
                    }
                    TextPaint textPaint62222 = this.a0;
                    float L102222 = org.telegram.messenger.g0.L(1.0f);
                    TextUtils.TruncateAt truncateAt2222 = TextUtils.TruncateAt.END;
                    this.e3 = nu0.b(charSequence29, textPaint62222, L5, L102222, L5, charSequence30 != null ? 1 : 2);
                    i27 = L5;
                    this.i3.addAll(this.j3);
                    this.j3.clear();
                    xh.f.b(this, this.e3, -2, -2, this.i3, this.j3);
                    int i4022222 = i27;
                    this.m3 = org.telegram.ui.Components.q5.update(0, (View) this, this.m3, this.e3);
                    if (id.a0) {
                    }
                    staticLayout = this.f3;
                    if (staticLayout != null) {
                    }
                    m0();
                }
            }
            float f212 = L8;
            this.R = org.telegram.ui.ActionBar.m6.B0[this.E0].measureText(charSequence24.toString()) <= f212;
            if (!this.Q) {
                charSequence24 = TextUtils.ellipsize(charSequence24, org.telegram.ui.ActionBar.m6.B0[this.E0], f212, TextUtils.TruncateAt.END);
            }
            CharSequence l112 = org.telegram.messenger.i6.l(charSequence24, org.telegram.ui.ActionBar.m6.B0[this.E0].getFontMetricsInt(), false);
            ij ijVar222 = this.f1;
            CharSequence charSequence47 = (ijVar222 == null && ijVar222.r2() && (x14 = org.telegram.messenger.g0.x1(l112, this.f1.Y1, this.J4)) != null) ? x14 : l112;
            if (this.Q) {
                this.z2 = new StaticLayout(charSequence47, org.telegram.ui.ActionBar.m6.B0[this.E0], Math.max(L8, this.y2), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            } else {
                TextPaint textPaint7 = org.telegram.ui.ActionBar.m6.B0[this.E0];
                Layout.Alignment alignment3 = Layout.Alignment.ALIGN_NORMAL;
                TextUtils.TruncateAt truncateAt3 = TextUtils.TruncateAt.END;
                this.z2 = nu0.b(charSequence47, textPaint7, L8, 0.0f, L8, 2);
            }
            this.B2 = (this.D2 || !this.z2.isRtlCharAt(0)) ? f13 : -org.telegram.messenger.g0.L(f14);
            this.C2 = this.z2.isRtlCharAt(0);
        } catch (Exception e16) {
            e = e16;
            f14 = 36.0f;
        }
        this.p3 = org.telegram.ui.Components.q5.update(0, (View) this, this.p3, this.z2);
        if (!this.r2 || iz.p1) {
            f16 = 39.0f;
            f17 = f12;
            f18 = 13.0f;
            L = org.telegram.messenger.g0.L(11.0f);
            this.q3 = org.telegram.messenger.g0.L(32.0f);
            this.M2 = org.telegram.messenger.g0.L(13.0f);
            this.u3 = org.telegram.messenger.g0.L(42.33f);
            this.C3 = org.telegram.messenger.g0.L(43.0f);
            this.M3 = org.telegram.messenger.g0.L(42.33f);
            this.W2 = org.telegram.messenger.g0.L(13.0f);
            int measuredWidth4222 = getMeasuredWidth() - org.telegram.messenger.g0.L(this.I + 21);
            if (id.a0) {
                int L16 = org.telegram.messenger.g0.L(this.I + 6);
                this.r3 = L16;
                this.b3 = L16;
                this.d3 = L16;
                this.c3 = L16;
                L2 = org.telegram.messenger.g0.L(this.H);
                L3 = org.telegram.messenger.g0.L(69.0f) + L2;
            } else {
                int L17 = org.telegram.messenger.g0.L(f11);
                this.r3 = L17;
                this.b3 = L17;
                this.d3 = L17;
                this.c3 = L17;
                L2 = getMeasuredWidth() - org.telegram.messenger.g0.L(this.H + 56);
                L3 = L2 - org.telegram.messenger.g0.L(31.0f);
            }
            i21 = L3;
            this.u0.F.set(L2, L, org.telegram.messenger.g0.L(56.0f) + L2, org.telegram.messenger.g0.L(56.0f) + L);
            i22 = 0;
            while (true) {
                imageReceiverArr = this.V1;
                if (i22 < imageReceiverArr.length) {
                    break;
                }
                imageReceiverArr[i22].y0(((this.L4 + 2) * i22) + i21, ((org.telegram.messenger.g0.L(31.0f) + L) + (this.Q ? org.telegram.messenger.g0.L(20.0f) : 0)) - ((this.r2 || iz.p1 || (eVar = this.t0) == null || eVar.F()) ? 0 : org.telegram.messenger.g0.L(9.0f)), org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(18.0f));
                i22++;
                L = L;
            }
            i23 = L;
            i24 = measuredWidth4222;
        } else {
            int L18 = org.telegram.messenger.g0.L(9.0f);
            this.q3 = org.telegram.messenger.g0.L(31.0f);
            this.M2 = org.telegram.messenger.g0.L(f11);
            this.u3 = org.telegram.messenger.g0.L(38.0f);
            this.C3 = org.telegram.messenger.g0.L(39.0f);
            this.M3 = org.telegram.messenger.g0.L(this.P ? 35.0f : 38.0f);
            this.W2 = org.telegram.messenger.g0.L(f10);
            i24 = getMeasuredWidth() - org.telegram.messenger.g0.L((this.I + 20) - (id.a0 ? 0 : 12));
            if (id.a0) {
                int L19 = org.telegram.messenger.g0.L(22.0f);
                this.r3 = L19;
                this.b3 = L19;
                this.d3 = L19;
                this.c3 = L19;
                f16 = 39.0f;
                L6 = getMeasuredWidth() - org.telegram.messenger.g0.L(this.H + 52);
                f19 = 9.0f;
                L7 = L6 - org.telegram.messenger.g0.L(((this.L4 + 2) * this.R1) + 9);
            } else {
                f16 = 39.0f;
                f19 = 9.0f;
                int L20 = org.telegram.messenger.g0.L(this.I + 4);
                this.r3 = L20;
                this.b3 = L20;
                this.d3 = L20;
                this.c3 = L20;
                L6 = org.telegram.messenger.g0.L(this.H);
                L7 = org.telegram.messenger.g0.L(67.0f) + L6;
            }
            f18 = 13.0f;
            f17 = f12;
            this.u0.F.set(L6, L18, org.telegram.messenger.g0.L(52.0f) + L6, org.telegram.messenger.g0.L(52.0f) + L18);
            int i50 = 0;
            while (true) {
                ImageReceiver[] imageReceiverArr3 = this.V1;
                if (i50 >= imageReceiverArr3.length) {
                    break;
                }
                imageReceiverArr3[i50].y0(((this.L4 + 2) * i50) + L7, ((org.telegram.messenger.g0.L(30.0f) + L18) + (this.Q ? org.telegram.messenger.g0.L(20.0f) : 0)) - ((this.r2 || iz.p1 || (eVar3 = this.t0) == null || eVar3.F()) ? 0 : org.telegram.messenger.g0.L(f19)), org.telegram.messenger.g0.L(this.L4), org.telegram.messenger.g0.L(this.L4));
                i50++;
                L18 = L18;
            }
            i23 = L18;
        }
        if (id.a0) {
            this.Y2 = this.b3;
            this.Z2 = getMeasuredWidth() - org.telegram.messenger.g0.L(64.0f);
        } else {
            this.Z2 = getMeasuredWidth() - org.telegram.messenger.g0.L(this.I);
            this.Y2 = org.telegram.messenger.g0.L(64.0f);
        }
        if (this.Q) {
            this.q3 = org.telegram.messenger.g0.L(20.0f) + this.q3;
        }
        if (((!this.r2 && !iz.p1) || W()) && (eVar2 = this.t0) != null && !eVar2.F()) {
            this.M2 -= org.telegram.messenger.g0.L(6.0f);
            this.W2 -= org.telegram.messenger.g0.L(6.0f);
        }
        if (getIsPinned()) {
            if (id.a0) {
                this.D3 = org.telegram.messenger.g0.L(14.0f);
            } else {
                this.D3 = (getMeasuredWidth() - org.telegram.ui.ActionBar.m6.j1.getIntrinsicWidth()) - org.telegram.messenger.g0.L(14.0f);
            }
        }
        if (this.t3) {
            int L21 = org.telegram.messenger.g0.L(29.0f);
            i24 -= L21;
            if (id.a0) {
                this.v3 = org.telegram.messenger.g0.L(15.666f);
                this.b3 += L21;
                this.d3 += L21;
                this.c3 += L21;
                this.r3 += L21;
            } else {
                this.v3 = getMeasuredWidth() - org.telegram.messenger.g0.L(36.3333f);
            }
        } else if (str7 != null || str12 != null || this.c4 || this.d4) {
            if (str7 != null) {
                this.O3 = Math.max(org.telegram.messenger.g0.L(f15), (int) Math.ceil(org.telegram.ui.ActionBar.m6.M0.measureText(str7)));
                this.X3 = new StaticLayout(str7, org.telegram.ui.ActionBar.m6.M0, this.O3, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                int L22 = org.telegram.messenger.g0.L(f10) + this.O3;
                i24 -= L22;
                if (id.a0) {
                    this.N3 = org.telegram.messenger.g0.L(15.666f);
                    this.b3 += L22;
                    this.d3 += L22;
                    this.c3 += L22;
                    this.r3 += L22;
                } else {
                    this.N3 = org.telegram.messenger.camera.q.w(12.666f, this.O3, getMeasuredWidth() - org.telegram.messenger.g0.L(15.666f));
                }
                this.G3 = true;
            } else {
                this.O3 = 0;
            }
            if (str12 != null) {
                if (this.J0 != 0) {
                    this.h4 = Math.max(org.telegram.messenger.g0.L(f15), (int) Math.ceil(org.telegram.ui.ActionBar.m6.M0.measureText(str12)));
                    this.i4 = new StaticLayout(str12, org.telegram.ui.ActionBar.m6.M0, this.h4, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                } else {
                    this.h4 = org.telegram.messenger.g0.L(f15);
                }
                int L23 = org.telegram.messenger.g0.L(f10) + this.h4;
                i24 -= L23;
                if (id.a0) {
                    int L24 = org.telegram.messenger.g0.L(15.666f);
                    int i51 = this.O3;
                    this.e4 = L24 + (i51 != 0 ? i51 + org.telegram.messenger.g0.L(f10) : 0);
                    this.b3 += L23;
                    this.d3 += L23;
                    this.c3 += L23;
                    this.r3 += L23;
                } else {
                    int w10 = org.telegram.messenger.camera.q.w(12.666f, this.h4, getMeasuredWidth()) - org.telegram.messenger.g0.L(15.666f);
                    int i52 = this.O3;
                    this.e4 = w10 - (i52 != 0 ? i52 + org.telegram.messenger.g0.L(f10) : 0);
                }
                this.b4 = true;
            } else {
                this.h4 = 0;
            }
            if (this.c4) {
                int L25 = org.telegram.messenger.g0.L(25.0f);
                i24 -= L25;
                if (id.a0) {
                    int L26 = org.telegram.messenger.g0.L(15.666f);
                    this.f4 = L26;
                    if (this.b4) {
                        int i53 = this.h4;
                        this.f4 = L26 + (i53 != 0 ? i53 + org.telegram.messenger.g0.L(f10) : 0);
                    }
                    if (this.G3) {
                        int i54 = this.f4;
                        int i55 = this.O3;
                        this.f4 = i54 + (i55 != 0 ? i55 + org.telegram.messenger.g0.L(f10) : 0);
                    }
                    this.b3 += L25;
                    this.d3 += L25;
                    this.c3 += L25;
                    this.r3 += L25;
                } else {
                    int measuredWidth5 = getMeasuredWidth() - org.telegram.messenger.g0.L(36.332f);
                    this.f4 = measuredWidth5;
                    if (this.b4) {
                        int i56 = this.h4;
                        this.f4 = measuredWidth5 - (i56 != 0 ? i56 + org.telegram.messenger.g0.L(f10) : 0);
                    }
                    if (this.G3) {
                        int i57 = this.f4;
                        int i58 = this.O3;
                        this.f4 = i57 - (i58 != 0 ? i58 + org.telegram.messenger.g0.L(f10) : 0);
                    }
                }
            }
            if (this.d4) {
                int L27 = org.telegram.messenger.g0.L(25.0f);
                i24 -= L27;
                if (id.a0) {
                    int L28 = org.telegram.messenger.g0.L(15.666f);
                    this.g4 = L28;
                    if (this.c4) {
                        this.g4 = org.telegram.messenger.g0.L(25.0f) + L28;
                    }
                    if (this.b4) {
                        int i59 = this.g4;
                        int i60 = this.h4;
                        this.g4 = i59 + (i60 != 0 ? i60 + org.telegram.messenger.g0.L(f10) : 0);
                    }
                    if (this.G3) {
                        int i61 = this.g4;
                        int i62 = this.O3;
                        this.g4 = i61 + (i62 != 0 ? i62 + org.telegram.messenger.g0.L(f10) : 0);
                    }
                    this.b3 += L27;
                    this.d3 += L27;
                    this.c3 += L27;
                    this.r3 += L27;
                } else {
                    int measuredWidth6 = getMeasuredWidth() - org.telegram.messenger.g0.L(36.332f);
                    this.g4 = measuredWidth6;
                    if (this.c4) {
                        this.g4 = measuredWidth6 - org.telegram.messenger.g0.L(25.0f);
                    }
                    if (this.b4) {
                        int i63 = this.g4;
                        int i64 = this.h4;
                        this.g4 = i63 - (i64 != 0 ? i64 + org.telegram.messenger.g0.L(f10) : 0);
                    }
                    if (this.G3) {
                        int i65 = this.g4;
                        int i66 = this.O3;
                        this.g4 = i65 - (i66 != 0 ? i66 + org.telegram.messenger.g0.L(f10) : 0);
                    }
                }
            }
        } else if (!this.J1 || V() || W() || U() || !t10.t(this.f2) || !this.f2.bot_has_main_app) {
            this.G3 = false;
            this.b4 = false;
        } else {
            setOpenBotButton(true);
            int g10 = (int) (this.I1.g() + org.telegram.messenger.g0.L(26.0f));
            int L29 = org.telegram.messenger.g0.L(f18);
            i24 -= g10;
            int L30 = (this.r2 || iz.p1) ? org.telegram.messenger.g0.L(40.0f) : this.P ? org.telegram.messenger.g0.L(33.0f) : org.telegram.messenger.g0.L(f14);
            if (id.a0) {
                this.H1.set(org.telegram.messenger.g0.L(f18), L30, org.telegram.messenger.g0.L(f18) + g10, org.telegram.messenger.g0.L(28.0f) + L30);
                int i67 = g10 + L29;
                this.b3 += i67;
                this.d3 += i67;
                this.c3 += i67;
                this.r3 += i67;
            } else {
                this.H1.set((getMeasuredWidth() - g10) - org.telegram.messenger.g0.L(f18), L30, getMeasuredWidth() - org.telegram.messenger.g0.L(f18), org.telegram.messenger.g0.L(28.0f) + L30);
            }
            this.G3 = false;
            this.b4 = false;
        }
        z26 = this.t3 && this.G0 == null && !V() && !W() && !U() && (this.S0 > 0 || this.T0) && (ijVar8 = this.f1) != null && !ijVar8.P3() && (this.f1.k.action instanceof TLRPC.TL_messageActionGramTransfer);
        this.H3 = z26;
        if (z26) {
            int L31 = (this.G3 && this.L3) ? this.O3 + org.telegram.messenger.g0.L(f10) : 0;
            if (this.b4 && this.L3) {
                L31 = org.telegram.messenger.k5.C(f10, this.h4, L31);
            }
            if (this.c4) {
                L31 += org.telegram.messenger.g0.L(25.0f);
            }
            if (this.d4) {
                L31 += org.telegram.messenger.g0.L(25.0f);
            }
            if (this.E1) {
                L31 = org.telegram.messenger.k5.C(4.0f, (int) this.H1.width(), L31);
            }
            this.I3 = id.a0 ? org.telegram.messenger.g0.L(15.666f) + L31 : org.telegram.messenger.k5.z(43.666f, getMeasuredWidth(), L31);
            i24 -= org.telegram.messenger.g0.L(32.0f);
            if (id.a0) {
                this.b3 = org.telegram.messenger.g0.L(32.0f) + this.b3;
                this.d3 = org.telegram.messenger.g0.L(32.0f) + this.d3;
                this.c3 = org.telegram.messenger.g0.L(32.0f) + this.c3;
                this.r3 = org.telegram.messenger.g0.L(32.0f) + this.r3;
            }
        }
        if (z20) {
            if (charSequence6 == null) {
                charSequence6 = "";
            }
            if (charSequence6.length() > 150) {
                charSequence6 = charSequence6.subSequence(0, qs.g2);
            }
            charSequence6 = org.telegram.messenger.i6.l(((this.r2 || iz.p1) && !S() && charSequence27 == null) ? org.telegram.messenger.g0.Y2(charSequence6) : org.telegram.messenger.g0.N2(charSequence6), org.telegram.ui.ActionBar.m6.F0[this.E0].getFontMetricsInt(), false);
            ij ijVar25 = this.f1;
            if (ijVar25 != null && (x13 = org.telegram.messenger.g0.x1(charSequence6, ijVar25.Y1, this.J4)) != null) {
                charSequence6 = x13;
            }
        }
        int max2222 = Math.max(org.telegram.messenger.g0.L(12.0f), i24);
        this.g3 = org.telegram.messenger.g0.L((!this.r2 || iz.p1) ? 58.0f : 62.0f);
        if (((!this.r2 && !iz.p1) || W()) && S()) {
            this.g3 -= org.telegram.messenger.g0.L(!W() ? 10.0f : 12.0f);
        }
        if (!W()) {
            this.a3 = org.telegram.messenger.g0.L((this.r2 || iz.p1) ? 34.0f : f16);
            int i68 = 0;
            while (true) {
                ImageReceiver[] imageReceiverArr4 = this.V1;
                if (i68 >= imageReceiverArr4.length) {
                    break;
                }
                imageReceiverArr4[i68].D0(this.g3);
                i68++;
            }
            i25 = max2222;
        } else if ((this.r2 || iz.p1) && !S() && charSequence27 != null && (this.J0 == 0 || this.M0 == 1)) {
            try {
                ijVar7 = this.f1;
            } catch (Exception e17) {
                e = e17;
                i25 = max2222;
            }
            if (ijVar7 != null && ijVar7.r2()) {
                CharSequence x16 = org.telegram.messenger.g0.x1(charSequence27, this.f1.Y1, this.J4);
                if (x16 != null) {
                    charSequence28 = x16;
                    TextPaint textPaint8 = org.telegram.ui.ActionBar.m6.G0;
                    Layout.Alignment alignment4 = Layout.Alignment.ALIGN_NORMAL;
                    TextUtils.TruncateAt truncateAt4 = TextUtils.TruncateAt.END;
                    i25 = max2222;
                    this.s3 = nu0.b(charSequence28, textPaint8, i25, 0.0f, i25, 1);
                    this.a3 = org.telegram.messenger.g0.L(51.0f);
                    L4 = (this.R || !this.P) ? 0 : org.telegram.messenger.g0.L(20.0f);
                    i26 = 0;
                    while (true) {
                        imageReceiverArr2 = this.V1;
                        if (i26 >= imageReceiverArr2.length) {
                            break;
                        }
                        imageReceiverArr2[i26].D0(org.telegram.messenger.g0.L(40.0f) + i23 + L4);
                        i26++;
                    }
                    charSequence27 = charSequence28;
                }
            }
            charSequence28 = charSequence27;
            TextPaint textPaint82 = org.telegram.ui.ActionBar.m6.G0;
            Layout.Alignment alignment42 = Layout.Alignment.ALIGN_NORMAL;
            TextUtils.TruncateAt truncateAt42 = TextUtils.TruncateAt.END;
            i25 = max2222;
            this.s3 = nu0.b(charSequence28, textPaint82, i25, 0.0f, i25, 1);
            this.a3 = org.telegram.messenger.g0.L(51.0f);
            if (this.R) {
            }
            i26 = 0;
            while (true) {
                imageReceiverArr2 = this.V1;
                if (i26 >= imageReceiverArr2.length) {
                }
                imageReceiverArr2[i26].D0(org.telegram.messenger.g0.L(40.0f) + i23 + L4);
                i26++;
            }
            charSequence27 = charSequence28;
        } else {
            i25 = max2222;
            this.s3 = null;
            if (this.r2 || iz.p1) {
                this.a3 = org.telegram.messenger.g0.L(32.0f);
                int L32 = (this.R && this.P) ? org.telegram.messenger.g0.L(20.0f) : 0;
                int i69 = 0;
                while (true) {
                    ImageReceiver[] imageReceiverArr5 = this.V1;
                    if (i69 >= imageReceiverArr5.length) {
                        break;
                    }
                    imageReceiverArr5[i69].D0(org.telegram.messenger.g0.L(21.0f) + i23 + L32);
                    i69++;
                }
            } else {
                this.a3 = org.telegram.messenger.g0.L(f16);
            }
        }
        if (this.Q) {
            this.a3 = org.telegram.messenger.g0.L(20.0f) + this.a3;
        }
        this.n3 = org.telegram.ui.Components.q5.update(0, (View) this, this.n3, this.s3);
        try {
            if (TextUtils.isEmpty(charSequence26)) {
                this.h3 = null;
            } else {
                this.h3 = new StaticLayout(TextUtils.ellipsize(org.telegram.messenger.i6.l(charSequence26, this.a0.getFontMetricsInt(), false), this.a0, i25 - org.telegram.messenger.g0.L(26.0f), TextUtils.TruncateAt.END), this.a0, i25 - org.telegram.messenger.g0.L(20.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                this.k3.addAll(this.l3);
                this.l3.clear();
                xh.f.c(this, this.h3, this.k3, this.l3);
            }
        } catch (Exception unused) {
        }
        this.o3 = org.telegram.ui.Components.q5.update(0, (View) this, this.o3, this.h3);
        try {
            if (!TextUtils.isEmpty(charSequence25)) {
                try {
                    if (!this.r2) {
                        if (!iz.p1) {
                        }
                        i30 = i25;
                        StaticLayout staticLayout2 = new StaticLayout(TextUtils.ellipsize(charSequence25, this.a0, i25 - org.telegram.messenger.g0.L(12.0f), TextUtils.TruncateAt.END), org.telegram.ui.ActionBar.m6.H0[this.E0], i30, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                        i25 = i30;
                        this.f3 = staticLayout2;
                    }
                    StaticLayout staticLayout22 = new StaticLayout(TextUtils.ellipsize(charSequence25, this.a0, i25 - org.telegram.messenger.g0.L(12.0f), TextUtils.TruncateAt.END), org.telegram.ui.ActionBar.m6.H0[this.E0], i30, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                    i25 = i30;
                    this.f3 = staticLayout22;
                } catch (Exception e18) {
                    e = e18;
                    i25 = i30;
                    org.telegram.messenger.a8.f(e);
                    if (charSequence6 instanceof Spannable) {
                    }
                    if (this.r2) {
                    }
                    this.a0 = org.telegram.ui.ActionBar.m6.F0[this.E0];
                    charSequence29 = charSequence27;
                    charSequence30 = null;
                    Layout.Alignment alignment22222 = Layout.Alignment.ALIGN_NORMAL;
                    if (this.r2) {
                    }
                    if (this.R1 > 0) {
                    }
                    TextPaint textPaint622222 = this.a0;
                    float L1022222 = org.telegram.messenger.g0.L(1.0f);
                    TextUtils.TruncateAt truncateAt22222 = TextUtils.TruncateAt.END;
                    this.e3 = nu0.b(charSequence29, textPaint622222, L5, L1022222, L5, charSequence30 != null ? 1 : 2);
                    i27 = L5;
                    this.i3.addAll(this.j3);
                    this.j3.clear();
                    xh.f.b(this, this.e3, -2, -2, this.i3, this.j3);
                    int i40222222 = i27;
                    this.m3 = org.telegram.ui.Components.q5.update(0, (View) this, this.m3, this.e3);
                    if (id.a0) {
                    }
                    staticLayout = this.f3;
                    if (staticLayout != null) {
                    }
                    m0();
                }
                if (!S()) {
                    TextPaint textPaint9 = org.telegram.ui.ActionBar.m6.H0[this.E0];
                    Layout.Alignment alignment5 = Layout.Alignment.ALIGN_NORMAL;
                    float L33 = org.telegram.messenger.g0.L(1.0f);
                    TextUtils.TruncateAt truncateAt5 = TextUtils.TruncateAt.END;
                    int i70 = i25;
                    try {
                        this.f3 = nu0.b(charSequence25, textPaint9, i70, L33, i25, 1);
                    } catch (Exception e19) {
                        e = e19;
                        i25 = i70;
                        org.telegram.messenger.a8.f(e);
                        if (charSequence6 instanceof Spannable) {
                        }
                        if (this.r2) {
                        }
                        this.a0 = org.telegram.ui.ActionBar.m6.F0[this.E0];
                        charSequence29 = charSequence27;
                        charSequence30 = null;
                        Layout.Alignment alignment222222 = Layout.Alignment.ALIGN_NORMAL;
                        if (this.r2) {
                        }
                        if (this.R1 > 0) {
                        }
                        TextPaint textPaint6222222 = this.a0;
                        float L10222222 = org.telegram.messenger.g0.L(1.0f);
                        TextUtils.TruncateAt truncateAt222222 = TextUtils.TruncateAt.END;
                        this.e3 = nu0.b(charSequence29, textPaint6222222, L5, L10222222, L5, charSequence30 != null ? 1 : 2);
                        i27 = L5;
                        this.i3.addAll(this.j3);
                        this.j3.clear();
                        xh.f.b(this, this.e3, -2, -2, this.i3, this.j3);
                        int i402222222 = i27;
                        this.m3 = org.telegram.ui.Components.q5.update(0, (View) this, this.m3, this.e3);
                        if (id.a0) {
                        }
                        staticLayout = this.f3;
                        if (staticLayout != null) {
                            if (i16 >= 0) {
                            }
                            primaryHorizontal = this.f3.getPrimaryHorizontal(0);
                            primaryHorizontal2 = this.f3.getPrimaryHorizontal(1);
                            if (primaryHorizontal >= primaryHorizontal2) {
                            }
                        }
                        m0();
                    }
                }
                i30 = i25;
            }
        } catch (Exception e20) {
            e = e20;
        }
        try {
            if (charSequence6 instanceof Spannable) {
                Spannable spannable = (Spannable) charSequence6;
                for (Object obj : spannable.getSpans(0, spannable.length(), Object.class)) {
                    if (!(obj instanceof ClickableSpan) && !(obj instanceof ni.j)) {
                        if (this.K0 == 0) {
                            if (!V()) {
                                if (!(obj instanceof u31)) {
                                }
                            }
                        }
                        if (!(obj instanceof ni.f)) {
                            if (!(obj instanceof ug0)) {
                                if (!(obj instanceof tg0)) {
                                    if ((obj instanceof StyleSpan) && ((StyleSpan) obj).getStyle() == 1) {
                                    }
                                }
                            }
                        }
                    }
                    spannable.removeSpan(obj);
                }
            }
            if ((!this.r2 || iz.p1) && !S() && this.J0 != 0 && this.M0 > 1) {
                this.a0 = org.telegram.ui.ActionBar.m6.F0[this.E0];
                charSequence29 = charSequence27;
                charSequence30 = null;
            } else {
                if (!this.r2) {
                }
                if (!S()) {
                    if (charSequence27 == null) {
                        if (org.telegram.messenger.t3.p0(this.g2) && org.telegram.messenger.t3.g(this.F0, this.g2)) {
                        }
                        charSequence30 = charSequence27;
                        charSequence29 = charSequence6;
                    }
                }
                charSequence6 = (W() || !(charSequence6 instanceof Spanned) || ((r2[]) ((Spanned) charSequence6).getSpans(0, charSequence6.length(), r2.class)).length > 0) ? TextUtils.ellipsize(charSequence6, this.a0, i25 - org.telegram.messenger.g0.L(12.0f), TextUtils.TruncateAt.END) : TextUtils.ellipsize(charSequence6, this.a0, i25 - org.telegram.messenger.g0.L(((this.L4 + 2) * this.R1) + 15), TextUtils.TruncateAt.END);
                charSequence30 = charSequence27;
                charSequence29 = charSequence6;
            }
            Layout.Alignment alignment2222222 = Layout.Alignment.ALIGN_NORMAL;
            if ((!this.r2 || iz.p1) && !S()) {
                L5 = (this.R1 > 0 || charSequence30 == null) ? i25 : i25 + org.telegram.messenger.g0.L(5.0f);
                TextPaint textPaint62222222 = this.a0;
                float L102222222 = org.telegram.messenger.g0.L(1.0f);
                TextUtils.TruncateAt truncateAt2222222 = TextUtils.TruncateAt.END;
                this.e3 = nu0.b(charSequence29, textPaint62222222, L5, L102222222, L5, charSequence30 != null ? 1 : 2);
                i27 = L5;
            } else {
                if (this.R1 > 0) {
                    i27 = i25 + org.telegram.messenger.g0.L(((this.L4 + 2) * r0) + 3);
                    try {
                        if (id.a0 && !W()) {
                            this.b3 -= org.telegram.messenger.g0.L(((this.L4 + 2) * this.R1) + 3);
                        }
                        i29 = i27;
                    } catch (Exception e21) {
                        e = e21;
                        this.e3 = null;
                        org.telegram.messenger.a8.f(e);
                        int i4022222222 = i27;
                        this.m3 = org.telegram.ui.Components.q5.update(0, (View) this, this.m3, this.e3);
                        if (id.a0) {
                        }
                        staticLayout = this.f3;
                        if (staticLayout != null) {
                        }
                        m0();
                    }
                } else {
                    i29 = i25;
                }
                try {
                    this.e3 = new StaticLayout(charSequence29, this.a0, i29, alignment2222222, 1.0f, 0.0f, false);
                    i27 = i29;
                } catch (Exception e22) {
                    e = e22;
                    i27 = i29;
                    this.e3 = null;
                    org.telegram.messenger.a8.f(e);
                    int i40222222222 = i27;
                    this.m3 = org.telegram.ui.Components.q5.update(0, (View) this, this.m3, this.e3);
                    if (id.a0) {
                    }
                    staticLayout = this.f3;
                    if (staticLayout != null) {
                    }
                    m0();
                }
            }
            this.i3.addAll(this.j3);
            this.j3.clear();
            xh.f.b(this, this.e3, -2, -2, this.i3, this.j3);
        } catch (Exception e23) {
            e = e23;
            i27 = i25;
        }
        int i402222222222 = i27;
        this.m3 = org.telegram.ui.Components.q5.update(0, (View) this, this.m3, this.e3);
        if (id.a0) {
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
                    double d2 = this.y2;
                    if (ceil2 < d2) {
                        this.x2 = (int) (this.x2 - (d2 - ceil2));
                    }
                }
                if (this.k4) {
                    this.x2 = org.telegram.messenger.g0.L(21.0f) + this.x2;
                }
                int L34 = (int) (this.x2 + lineRight + org.telegram.messenger.g0.L(6.0f));
                this.H2 = L34;
                if (this.l4) {
                    this.I2 = org.telegram.messenger.g0.L(30.0f) + L34;
                }
            }
            StaticLayout staticLayout4 = this.e3;
            float f22 = 2.14748365E9f;
            if (staticLayout4 != null && (lineCount3 = staticLayout4.getLineCount()) > 0) {
                float f23 = 2.14748365E9f;
                for (int i71 = 0; i71 < lineCount3; i71++) {
                    f23 = Math.min(f23, this.e3.getLineLeft(i71));
                }
                this.b3 = (int) (this.b3 - f23);
            }
            StaticLayout staticLayout5 = this.h3;
            if (staticLayout5 != null && (lineCount2 = staticLayout5.getLineCount()) > 0) {
                float f24 = 2.14748365E9f;
                for (int i72 = 0; i72 < lineCount2; i72++) {
                    f24 = Math.min(f24, this.h3.getLineLeft(i72));
                }
                this.c3 = (int) (this.c3 - f24);
            }
            StaticLayout staticLayout6 = this.f3;
            if (staticLayout6 != null && (lineCount = staticLayout6.getLineCount()) > 0) {
                for (int i73 = 0; i73 < lineCount; i73++) {
                    f22 = Math.min(f22, this.f3.getLineLeft(i73));
                }
                this.d3 = (int) (this.d3 - f22);
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
                int L35 = org.telegram.messenger.g0.L(12.0f) + this.x2;
                this.x2 = L35;
                if (this.k4) {
                    this.x2 = org.telegram.messenger.g0.L(21.0f) + L35;
                }
                if (this.D2) {
                    ceil3 = Math.min(this.y2, ceil3);
                }
                if ((this.Z0 || this.b1 || this.c1 > f13) && !this.j4 && this.p4 == 0) {
                    if (this.l4) {
                        int L36 = (int) ((((this.y2 - ceil3) - lineLeft) + this.x2) - org.telegram.messenger.g0.L(f17));
                        this.H2 = L36;
                        this.I2 = (L36 - org.telegram.messenger.g0.L(6.0f)) - org.telegram.ui.ActionBar.m6.c1.getIntrinsicWidth();
                    } else {
                        this.H2 = (int) ((((this.y2 - ceil3) + this.x2) - org.telegram.messenger.g0.L(6.0f)) - org.telegram.ui.ActionBar.m6.c1.getIntrinsicWidth());
                    }
                } else if (this.j4) {
                    this.H2 = (int) ((((this.y2 - ceil3) + this.x2) - org.telegram.messenger.g0.L(6.0f)) - org.telegram.ui.ActionBar.m6.f1.getIntrinsicWidth());
                } else if (this.l4) {
                    int L37 = (int) ((((this.y2 - ceil3) - lineLeft) + this.x2) - org.telegram.messenger.g0.L(f17));
                    this.H2 = L37;
                    this.I2 = (L37 - org.telegram.messenger.g0.L(6.0f)) - org.telegram.ui.ActionBar.m6.c1.getIntrinsicWidth();
                } else if (this.p4 != 0) {
                    this.H2 = (int) ((((this.y2 - ceil3) + this.x2) - org.telegram.messenger.g0.L(6.0f)) - (this.p4 == 1 ? org.telegram.ui.ActionBar.m6.g1 : org.telegram.ui.ActionBar.m6.h1).getIntrinsicWidth());
                } else {
                    this.H2 = (int) ((((this.y2 - ceil3) + this.x2) - org.telegram.messenger.g0.L(6.0f)) - org.telegram.ui.ActionBar.m6.c1.getIntrinsicWidth());
                }
                if (lineLeft == f13) {
                    double d10 = this.y2;
                    if (ceil3 < d10) {
                        this.x2 = (int) ((d10 - ceil3) + this.x2);
                    }
                }
            }
            StaticLayout staticLayout9 = this.e3;
            int i74 = ConnectionsManager.DEFAULT_DATACENTER_ID;
            if (staticLayout9 != null && (lineCount6 = staticLayout9.getLineCount()) > 0) {
                int i75 = Integer.MAX_VALUE;
                int i76 = 0;
                while (true) {
                    if (i76 >= lineCount6) {
                        break;
                    }
                    if (this.e3.getLineLeft(i76) != f13) {
                        i75 = 0;
                        break;
                    } else {
                        i75 = Math.min(i75, (int) (i402222222222 - Math.ceil(this.e3.getLineWidth(i76))));
                        i76++;
                    }
                }
                if (i75 != Integer.MAX_VALUE) {
                    this.b3 += i75;
                }
            }
            StaticLayout staticLayout10 = this.f3;
            if (staticLayout10 != null && (lineCount5 = staticLayout10.getLineCount()) > 0) {
                int i77 = Integer.MAX_VALUE;
                int i78 = 0;
                while (true) {
                    if (i78 >= lineCount5) {
                        break;
                    }
                    if (this.f3.getLineLeft(i78) != f13) {
                        i77 = 0;
                        break;
                    } else {
                        i77 = Math.min(i77, (int) (i402222222222 - Math.ceil(this.f3.getLineWidth(i78))));
                        i78++;
                    }
                }
                if (i77 != Integer.MAX_VALUE) {
                    this.d3 += i77;
                }
            }
            StaticLayout staticLayout11 = this.s3;
            if (staticLayout11 != null && staticLayout11.getLineCount() > 0 && this.s3.getLineLeft(0) == f13) {
                double ceil4 = Math.ceil(this.s3.getLineWidth(0));
                double d11 = i402222222222;
                if (ceil4 < d11) {
                    this.r3 = (int) ((d11 - ceil4) + this.r3);
                }
            }
            StaticLayout staticLayout12 = this.h3;
            if (staticLayout12 != null && (lineCount4 = staticLayout12.getLineCount()) > 0) {
                for (int i79 = 0; i79 < lineCount4; i79++) {
                    i74 = (int) Math.min(i74, this.h3.getWidth() - this.h3.getLineRight(i79));
                }
                this.c3 += i74;
            }
        }
        staticLayout = this.f3;
        if (staticLayout != null && this.j2 >= 0 && staticLayout.getText().length() > 0) {
            if (i16 >= 0 || (i28 = i16 + 1) >= this.f3.getText().length()) {
                primaryHorizontal = this.f3.getPrimaryHorizontal(0);
                primaryHorizontal2 = this.f3.getPrimaryHorizontal(1);
            } else {
                primaryHorizontal = this.f3.getPrimaryHorizontal(i16);
                primaryHorizontal2 = this.f3.getPrimaryHorizontal(i28);
            }
            if (primaryHorizontal >= primaryHorizontal2) {
                this.C4 = (int) (this.d3 + primaryHorizontal);
            } else {
                this.C4 = (int) (this.d3 + primaryHorizontal2 + org.telegram.messenger.g0.L(3.0f));
            }
        }
        m0();
    }

    public final void y() {
        TLRPC.Message message;
        ij ijVar = this.f1;
        if (ijVar == null || (message = ijVar.k) == null) {
            return;
        }
        TLRPC.MessageAction messageAction = message.action;
        if ((messageAction instanceof TLRPC.TL_messageActionSetChatTheme) && this.X0) {
            org.telegram.messenger.d4 f10 = org.telegram.messenger.d4.f(this.F0);
            long j3 = this.H0;
            TLRPC.ChatTheme chatTheme = ((TLRPC.TL_messageActionSetChatTheme) messageAction).theme;
            f10.s(j3, ig.b.c(chatTheme), chatTheme, false);
        }
    }

    public final void z() {
        TLRPC.Chat chat = this.g2;
        boolean z9 = chat != null && chat.call_active && chat.call_not_empty;
        this.v2 = z9;
        this.q1 = z9 ? 1.0f : 0.0f;
    }

    public t2(zw zwVar, Context context, boolean z9, int i7, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        this.h = true;
        this.y = true;
        int i10 = 0;
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
        this.F1 = new hc(this);
        this.G1 = new Paint(1);
        this.H1 = new RectF();
        this.L1 = false;
        this.U1 = new boolean[3];
        this.V1 = new ImageReceiver[3];
        this.W1 = new boolean[3];
        this.X1 = new boolean[3];
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.Y1 = imageReceiver;
        this.a2 = new org.telegram.ui.Components.v8((org.telegram.ui.ActionBar.h6) null);
        this.d2 = new sd(2);
        wq wqVar = wq.h;
        this.m2 = new org.telegram.ui.Components.v5(this, 0L, 350L, wqVar);
        this.o2 = new org.telegram.ui.Components.v5(this, 0L, 350L, wqVar);
        this.i3 = new Stack();
        this.j3 = new ArrayList();
        this.k3 = new Stack();
        this.l3 = new ArrayList();
        this.L3 = true;
        this.S3 = new te.a(this, wqVar, 320L);
        this.V3 = 1.0f;
        this.W3 = 1.0f;
        this.r4 = new RectF();
        this.x4 = -1;
        this.H4 = -1;
        this.I4 = new q2(this);
        m2Var.I = true;
        this.J4 = h6Var;
        this.D4 = zwVar;
        org.telegram.ui.ActionBar.m6.T(context);
        this.D = false;
        this.E = false;
        imageReceiver.J0(org.telegram.messenger.g0.L(26.0f));
        while (true) {
            ImageReceiver[] imageReceiverArr = this.V1;
            if (i10 >= imageReceiverArr.length) {
                this.r2 = z9;
                this.F0 = i7;
                ec ecVar = new ec(12, context, this);
                this.m4 = ecVar;
                addView(ecVar);
                this.n4 = new org.telegram.ui.Components.f5(org.telegram.messenger.g0.L(22.0f), ecVar);
                this.o4 = new org.telegram.ui.Components.f5(org.telegram.messenger.g0.L(17.0f), this);
                this.Y1.z1 = true;
                return;
            }
            imageReceiverArr[i10] = new ImageReceiver(this);
            ImageReceiver imageReceiver2 = this.V1[i10];
            imageReceiver2.y = true;
            imageReceiver2.J0(org.telegram.messenger.g0.L(2.0f));
            this.V1[i10].z1 = true;
            i10++;
        }
    }

    @Override // android.view.View
    public final void invalidate(int i7, int i10, int i11, int i12) {
        if (di.q9.w1) {
            return;
        }
        super.invalidate(i7, i10, i11, i12);
    }
}
