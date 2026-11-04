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
import b8.be;
import b8.kf;
import ci.wb;
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
import org.telegram.messenger.ac;
import org.telegram.messenger.az;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.c00;
import org.telegram.messenger.ep;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.messenger.l10;
import org.telegram.messenger.lc;
import org.telegram.messenger.li;
import org.telegram.messenger.mo;
import org.telegram.messenger.qr;
import org.telegram.messenger.zi;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.a60;
import org.telegram.ui.Components.ch0;
import org.telegram.ui.Components.fy;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.lu0;
import org.telegram.ui.Components.ly0;
import org.telegram.ui.Components.mg0;
import org.telegram.ui.Components.mr;
import org.telegram.ui.Components.nc;
import org.telegram.ui.Components.ng0;
import org.telegram.ui.Components.nu0;
import org.telegram.ui.Components.o31;
import org.telegram.ui.Components.tz;
import org.telegram.ui.Components.v31;
import org.telegram.ui.Components.w31;
import org.telegram.ui.Components.wc0;
import org.telegram.ui.Components.wg0;
import org.telegram.ui.Components.wp;
import org.telegram.ui.Components.x41;
import org.telegram.ui.Components.xg0;
import org.telegram.ui.Components.xq;
import org.telegram.ui.Components.zz0;
import org.telegram.ui.dz;
import org.telegram.ui.my0;
import org.telegram.ui.pv;
import org.telegram.ui.uw;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public class t2 extends z implements ei.f7, org.telegram.ui.ActionBar.z5 {
    public boolean A0;
    public boolean A1;
    public StaticLayout A2;
    public boolean A3;
    public boolean A4;
    public boolean B0;
    public boolean B1;
    public boolean B2;
    public boolean B3;
    public ValueAnimator B4;
    public boolean C0;
    public float C1;
    public float C2;
    public boolean C3;
    public long C4;
    public float D0;
    public float D1;
    public boolean D2;
    public int D3;
    public int D4;
    public boolean E;
    public jh.c E0;
    public float E1;
    public boolean E2;
    public int E3;
    public final uw E4;
    public boolean F;
    public int F0;
    public boolean F1;
    public Paint F2;
    public int F3;
    public StaticLayout F4;
    public boolean G;
    public final int G0;
    public final gc G1;
    public Paint G2;
    public float G3;
    public int G4;
    public b7 H;
    public o2 H0;
    public final Paint H1;
    public boolean H2;
    public boolean H3;
    public int H4;
    public int I;
    public long I0;
    public final RectF I1;
    public int I2;
    public boolean I3;
    public int I4;
    public int J;
    public String J0;
    public ly0 J1;
    public int J2;
    public int J3;
    public final q2 J4;
    public int K;
    public int K0;
    public boolean K1;
    public int K2;
    public LayerDrawable K3;
    public final org.telegram.ui.ActionBar.e6 K4;
    public int L;
    public long L0;
    public gi.j8 L1;
    public int L2;
    public int L3;
    public int L4;
    public final int M;
    public String M0;
    public boolean M1;
    public int M2;
    public boolean M3;
    public int M4;
    public final int N;
    public int N0;
    public int N1;
    public int N2;
    public int N3;
    public int N4;
    public TLRPC.TL_forumTopic O;
    public boolean O0;
    public int O1;
    public StaticLayout O2;
    public int O3;
    public s2 O4;
    public boolean P;
    public boolean P0;
    public String P1;
    public int P2;
    public int P3;
    public GradientDrawable P4;
    public boolean Q;
    public boolean Q0;
    public int Q1;
    public boolean Q2;
    public int Q3;
    public int Q4;
    public boolean R;
    public boolean R0;
    public ch0 R1;
    public boolean R2;
    public int R3;
    public int R4;
    public boolean S;
    public int S0;
    public int S1;
    public boolean S2;
    public boolean S3;
    public Paint S4;
    public Paint T;
    public int T0;
    public boolean T1;
    public boolean T2;
    public final qe.a T3;
    public vg.x0 T4;
    public Paint U;
    public boolean U0;
    public Paint U1;
    public int U2;
    public ValueAnimator U3;
    public Drawable U4;
    public float V;
    public int V0;
    public final boolean[] V1;
    public int V2;
    public ValueAnimator V3;
    public int V4;
    public boolean W;
    public int W0;
    public final ImageReceiver[] W1;
    public int W2;
    public float W3;
    public Drawable W4;
    public int X0;
    public final boolean[] X1;
    public int X2;
    public float X3;
    public Drawable X4;
    public boolean Y0;
    public final boolean[] Y1;
    public int Y2;
    public StaticLayout Y3;
    public ColorFilter[] Y4;
    public int Z0;
    public final ImageReceiver Z1;
    public int Z2;
    public StaticLayout Z3;
    public int[] Z4;
    public boolean a0;
    public boolean a1;
    public wc0 a2;
    public int a3;
    public StaticLayout a4;
    public Runnable a5;
    public TextPaint b0;
    public boolean b1;
    public final org.telegram.ui.Components.u8 b2;
    public int b3;
    public StaticLayout b4;
    public Paint c0;
    public boolean c1;
    public boolean c2;
    public int c3;
    public boolean c4;
    public nc d0;
    public float d1;
    public float d2;
    public int d3;
    public boolean d4;
    public p2 e0;
    public boolean e1;
    public final b5.c e2;
    public int e3;
    public boolean e4;
    public boolean f;
    public boolean f0;
    public boolean f1;
    public ng0 f2;
    public StaticLayout f3;
    public int f4;
    public boolean g0;
    public zi g1;
    public TLRPC.User g2;
    public StaticLayout g3;
    public int g4;
    public final boolean h;
    public boolean h0;
    public ArrayList h1;
    public TLRPC.Chat h2;
    public int h3;
    public int h4;
    public Drawable[] i0;
    public boolean i1;
    public TLRPC.EncryptedChat i2;
    public StaticLayout i3;
    public int i4;
    public float j0;
    public CharSequence j1;
    public CharSequence j2;
    public final Stack j3;
    public StaticLayout j4;
    public boolean k0;
    public int k1;
    public int k2;
    public final ArrayList k3;
    public boolean k4;
    public boolean l0;
    public int l1;
    public boolean l2;
    public final Stack l3;
    public boolean l4;
    public int m0;
    public int m1;
    public TLRPC.DraftMessage m2;
    public final ArrayList m3;
    public boolean m4;
    public float n;
    public float n0;
    public boolean n1;
    public final org.telegram.ui.Components.u5 n2;
    public org.telegram.ui.Components.l5 n3;
    public final ai.x2 n4;
    public zz0 o0;
    public boolean o1;
    public boolean o2;
    public org.telegram.ui.Components.l5 o3;
    public final org.telegram.ui.Components.e5 o4;
    public Paint p0;
    public float p1;
    public final org.telegram.ui.Components.u5 p2;
    public org.telegram.ui.Components.l5 p3;
    public final org.telegram.ui.Components.e5 p4;
    public Paint q0;
    public float q1;
    public long q2;
    public org.telegram.ui.Components.l5 q3;
    public int q4;
    public boolean r;
    public boolean r0;
    public float r1;
    public gi.y2 r2;
    public int r3;
    public boolean r4;
    public ch0 s;
    public boolean s0;
    public float s1;
    public final boolean s2;
    public int s3;
    public final RectF s4;
    public boolean t0;
    public int t1;
    public boolean t2;
    public StaticLayout t3;
    public kg.j t4;
    public ui.f u0;
    public float u1;
    public boolean u2;
    public boolean u3;
    public Path u4;
    public final m2 v0;
    public int v1;
    public boolean v2;
    public int v3;
    public RectF v4;
    public int w;
    public Path w0;
    public int w1;
    public boolean w2;
    public int w3;
    public int w4;
    public boolean x;
    public yh.f x0;
    public float x1;
    public boolean x2;
    public boolean x3;
    public int x4;
    public boolean y;
    public boolean y0;
    public boolean y1;
    public int y2;
    public float y3;
    public int y4;
    public boolean z0;
    public ch0 z1;
    public int z2;
    public boolean z3;
    public float z4;

    public t2(Context context, boolean z10) {
        this(null, context, z10, h10.t0, null);
    }

    public static SpannableStringBuilder O(int i3, CharSequence charSequence, CharSequence charSequence2) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (i3 == 1) {
            spannableStringBuilder.append(charSequence2).append((CharSequence) ": \u2068").append(charSequence).append((CharSequence) "\u2069");
            return spannableStringBuilder;
        }
        if (i3 == 2) {
            spannableStringBuilder.append((CharSequence) "\u2068").append(charSequence).append((CharSequence) "\u2069");
            return spannableStringBuilder;
        }
        if (i3 == 3) {
            spannableStringBuilder.append(charSequence2).append((CharSequence) ": ").append(charSequence);
            return spannableStringBuilder;
        }
        if (i3 != 4) {
            return spannableStringBuilder;
        }
        spannableStringBuilder.append(charSequence);
        return spannableStringBuilder;
    }

    private zi getCaptionMessage() {
        CharSequence charSequence;
        if (this.h1 == null) {
            zi ziVar = this.g1;
            if (ziVar == null || ziVar.z == null) {
                return null;
            }
            return ziVar;
        }
        int i3 = 0;
        zi ziVar2 = null;
        for (int i10 = 0; i10 < this.h1.size(); i10++) {
            zi ziVar3 = (zi) this.h1.get(i10);
            if (ziVar3 != null && (charSequence = ziVar3.z) != null) {
                if (!TextUtils.isEmpty(charSequence)) {
                    i3++;
                }
                ziVar2 = ziVar3;
            }
        }
        if (i3 > 1) {
            return null;
        }
        return ziVar2;
    }

    private int getCollapsedHeight() {
        boolean z10 = this.s2;
        int L = org.telegram.messenger.g0.L((z10 || az.p1) ? this.L : this.K) + 1;
        if (this.R) {
            L += org.telegram.messenger.g0.L(20.0f);
        }
        if (!S() || ((z10 || az.p1) && !W())) {
            return L;
        }
        return org.telegram.messenger.g0.L(W() ? this.N : this.M) + L;
    }

    private Paint getPaintReorderGradient() {
        int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.d6, this.K4);
        if (this.R4 != w02 || this.S4 == null) {
            this.R4 = w02;
            if (this.S4 == null) {
                this.S4 = new Paint(1);
            }
            this.S4.setShader(new LinearGradient(0.0f, 0.0f, org.telegram.messenger.g0.L(24.0f), 0.0f, new int[]{0, w02}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
        }
        return this.S4;
    }

    private TextPaint getTimeTextPaint() {
        return this.H3 ? T() ? org.telegram.ui.ActionBar.k6.J0 : org.telegram.ui.ActionBar.k6.K0 : org.telegram.ui.ActionBar.k6.I0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getTopicId() {
        TLRPC.TL_forumTopic tL_forumTopic = this.O;
        if (tL_forumTopic == null) {
            return 0;
        }
        return tL_forumTopic.id;
    }

    public final void A() {
        TLRPC.User a22;
        if (this.g2 != null && (a22 = hp.s1(this.G0).a2(Long.valueOf(this.g2.id))) != null) {
            this.g2 = a22;
        }
        this.q1 = X() ? 1.0f : 0.0f;
    }

    public final void B() {
        gi.y2 y2Var;
        boolean z10 = this.m0 > 0 && !this.w2 && !X() && ((y2Var = this.r2) == null || !y2Var.a.q) && !this.v0.w;
        this.x2 = z10;
        this.n0 = z10 ? 1.0f : 0.0f;
    }

    public final int E() {
        if (!W() || this.k0 || this.f) {
            return getCollapsedHeight();
        }
        int L = org.telegram.messenger.g0.L((this.s2 || az.p1) ? 86.0f : 91.0f);
        if (this.t2) {
            L++;
        }
        return S() ? org.telegram.messenger.g0.L(this.N) + L : L;
    }

    public final void G(int i3, int i10) {
        this.z4 = 0.0f;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.B4 = ofFloat;
        ofFloat.setDuration(220L);
        this.B4.setInterpolator(xq.f);
        this.x4 = i3;
        this.w4 = i10;
        this.B4.addUpdateListener(new j2(this, 2));
        this.B4.addListener(new n2(this, 2));
        this.A4 = true;
        this.B4.start();
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
    public final boolean H(Canvas canvas) {
        boolean z10;
        float f10;
        int L;
        int i3;
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
        boolean z11;
        boolean z12;
        float L12;
        ImageReceiver imageReceiver;
        Drawable drawable;
        Drawable drawable2;
        BitmapShader bitmapShader;
        gi.y2 y2Var;
        BitmapShader bitmapShader2;
        TLRPC.Chat chat = this.h2;
        boolean z13 = false;
        if (chat == null || (chat.flags2 & 2048) == 0) {
            z10 = false;
        } else {
            float A = this.Z1.A();
            float y9 = this.Z1.y();
            gi.y2 y2Var2 = this.r2;
            float progress = (y2Var2 == null || !y2Var2.a.q) ? 1.0f : 1.0f - y2Var2.getProgress();
            if (this.X4 == null) {
                this.X4 = getContext().getResources().getDrawable(R.drawable.star_small_outline).mutate();
            }
            int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.d6, false);
            if (this.V4 != x02) {
                Drawable drawable3 = this.X4;
                this.V4 = x02;
                drawable3.setColorFilter(new PorterDuffColorFilter(x02, PorterDuff.Mode.SRC_IN));
            }
            if (this.W4 == null) {
                this.W4 = getContext().getResources().getDrawable(R.drawable.star_small_inner).mutate();
            }
            int L13 = org.telegram.messenger.g0.L(19.33f);
            Rect rect = org.telegram.messenger.g0.Q;
            int i10 = (int) y9;
            int i11 = (int) A;
            int i12 = i11 - L13;
            rect.set((org.telegram.messenger.g0.L(1.66f) + i10) - L13, i12, org.telegram.messenger.g0.L(1.66f) + i10, i11);
            rect.inset(-org.telegram.messenger.g0.L(1.0f), -org.telegram.messenger.g0.L(1.0f));
            this.X4.setBounds(rect);
            int i13 = (int) (progress * 255.0f);
            this.X4.setAlpha(i13);
            this.X4.draw(canvas);
            rect.set((org.telegram.messenger.g0.L(1.66f) + i10) - L13, i12, org.telegram.messenger.g0.L(1.66f) + i10, i11);
            this.W4.setBounds(rect);
            this.W4.setAlpha(i13);
            this.W4.draw(canvas);
            z10 = true;
        }
        float d = this.n2.d(this.o2 && !z10);
        float f17 = 10.0f;
        if (d > 0.0f) {
            float s6 = this.Z1.s() + org.telegram.messenger.g0.L(18.0f);
            float r5 = this.Z1.r() + org.telegram.messenger.g0.L(18.0f);
            canvas.save();
            org.telegram.ui.ActionBar.k6.t0.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.d6, this.K4));
            canvas.drawCircle(r5, s6, org.telegram.messenger.g0.L(11.33f) * d, org.telegram.ui.ActionBar.k6.t0);
            if (this.T4 == null) {
                this.T4 = new vg.x0(org.telegram.ui.ActionBar.k6.zk, org.telegram.ui.ActionBar.k6.Ak, -1, -1, this.K4);
            }
            this.T4.d((int) (r5 - org.telegram.messenger.g0.L(10.0f)), 0.0f, (int) (s6 - org.telegram.messenger.g0.L(10.0f)), (int) (org.telegram.messenger.g0.L(10.0f) + r5), 0.0f, (int) (org.telegram.messenger.g0.L(10.0f) + s6));
            canvas.drawCircle(r5, s6, org.telegram.messenger.g0.L(10.0f) * d, this.T4.f);
            if (this.U4 == null) {
                Drawable mutate = getContext().getResources().getDrawable(R.drawable.msg_mini_lock2).mutate();
                this.U4 = mutate;
                mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
            }
            this.U4.setBounds((int) (r5 - (((r4.getIntrinsicWidth() / 2.0f) * 0.875f) * d)), (int) (s6 - (((this.U4.getIntrinsicHeight() / 2.0f) * 0.875f) * d)), (int) (((this.U4.getIntrinsicWidth() / 2.0f) * 0.875f * d) + r5), (int) (((this.U4.getIntrinsicHeight() / 2.0f) * 0.875f * d) + s6));
            this.U4.setAlpha((int) (d * 255.0f));
            this.U4.draw(canvas);
            canvas.restore();
            return false;
        }
        if (!this.O0 || this.K0 != 0 || z10) {
            return false;
        }
        boolean z14 = (this.m0 <= 0 || X() || this.w2 || this.v0.w) ? false : true;
        this.x2 = z14;
        if (this.j0 != 1.0f && (z14 || this.n0 > 0.0f)) {
            zz0 zz0Var = this.o0;
            if (zz0Var != null) {
                int i14 = zz0Var.f;
                int i15 = this.m0;
                if (i14 != i15) {
                }
                if (this.p0 == null) {
                    this.p0 = new Paint(1);
                    Paint paint = new Paint(1);
                    this.q0 = paint;
                    paint.setColor(838860800);
                }
                int A2 = (int) (this.Z1.A() - org.telegram.messenger.g0.L(9.0f));
                int L14 = (int) (!bd.a0 ? this.v0.F.left + org.telegram.messenger.g0.L(9.0f) : this.v0.F.right - org.telegram.messenger.g0.L(9.0f));
                this.o0.setBounds(0, 0, org.telegram.messenger.g0.L(22.0f), org.telegram.messenger.g0.L(22.0f));
                this.o0.b(this.m0);
                imageReceiver = this.Z1;
                drawable = imageReceiver.b0;
                if (drawable != null || (bitmapShader2 = imageReceiver.c0) == null) {
                    drawable2 = imageReceiver.n0;
                    if (drawable2 != null || (bitmapShader = imageReceiver.d0) == null) {
                        this.p0.setShader(null);
                        if (this.Z1.n() == null && !this.Z1.n().isRecycled()) {
                            this.p0.setColor(org.telegram.messenger.g0.J0(this.Z1.n()));
                        } else if (this.Z1.t() instanceof x41) {
                            this.p0.setColor(this.b2.c());
                        } else {
                            this.p0.setColor(((x41) this.Z1.t()).a.a());
                        }
                        canvas.save();
                        float f18 = (1.0f - this.j0) * this.n0;
                        y2Var = this.r2;
                        if (y2Var != null) {
                            f18 *= 1.0f - y2Var.getProgress();
                        }
                        float f19 = L14;
                        float f20 = A2;
                        canvas.scale(f18, f18, f19, f20);
                        canvas.drawCircle(f19, f20, org.telegram.messenger.g0.N(11.0f), this.p0);
                        canvas.drawCircle(f19, f20, org.telegram.messenger.g0.N(11.0f), this.q0);
                        canvas.save();
                        canvas.translate(f19 - org.telegram.messenger.g0.N(11.0f), f20 - org.telegram.messenger.g0.N(11.0f));
                        this.o0.draw(canvas);
                        canvas.restore();
                        canvas.restore();
                    } else {
                        imageReceiver.j(null, drawable2, hs.e4, bitmapShader, 0, 0, 0, null);
                    }
                } else {
                    imageReceiver.j(null, drawable, hs.e4, bitmapShader2, 0, 0, 0, null);
                }
                ImageReceiver imageReceiver2 = this.Z1;
                BitmapShader bitmapShader3 = imageReceiver2.c0;
                if (bitmapShader3 != null) {
                    this.p0.setShader(bitmapShader3);
                } else {
                    BitmapShader bitmapShader4 = imageReceiver2.d0;
                    if (bitmapShader4 != null) {
                        this.p0.setShader(bitmapShader4);
                    }
                }
                canvas.save();
                float f182 = (1.0f - this.j0) * this.n0;
                y2Var = this.r2;
                if (y2Var != null) {
                }
                float f192 = L14;
                float f202 = A2;
                canvas.scale(f182, f182, f192, f202);
                canvas.drawCircle(f192, f202, org.telegram.messenger.g0.N(11.0f), this.p0);
                canvas.drawCircle(f192, f202, org.telegram.messenger.g0.N(11.0f), this.q0);
                canvas.save();
                canvas.translate(f192 - org.telegram.messenger.g0.N(11.0f), f202 - org.telegram.messenger.g0.N(11.0f));
                this.o0.draw(canvas);
                canvas.restore();
                canvas.restore();
            }
            int i16 = this.m0;
            zz0 zz0Var2 = new zz0(org.telegram.messenger.t0.b, null);
            zz0Var2.m = true;
            zz0Var2.b(i16);
            this.o0 = zz0Var2;
            if (this.p0 == null) {
            }
            int A22 = (int) (this.Z1.A() - org.telegram.messenger.g0.L(9.0f));
            int L142 = (int) (!bd.a0 ? this.v0.F.left + org.telegram.messenger.g0.L(9.0f) : this.v0.F.right - org.telegram.messenger.g0.L(9.0f));
            this.o0.setBounds(0, 0, org.telegram.messenger.g0.L(22.0f), org.telegram.messenger.g0.L(22.0f));
            this.o0.b(this.m0);
            imageReceiver = this.Z1;
            drawable = imageReceiver.b0;
            if (drawable != null) {
            }
            drawable2 = imageReceiver.n0;
            if (drawable2 != null) {
            }
            this.p0.setShader(null);
            if (this.Z1.n() == null) {
            }
            if (this.Z1.t() instanceof x41) {
            }
            canvas.save();
            float f1822 = (1.0f - this.j0) * this.n0;
            y2Var = this.r2;
            if (y2Var != null) {
            }
            float f1922 = L142;
            float f2022 = A22;
            canvas.scale(f1822, f1822, f1922, f2022);
            canvas.drawCircle(f1922, f2022, org.telegram.messenger.g0.N(11.0f), this.p0);
            canvas.drawCircle(f1922, f2022, org.telegram.messenger.g0.N(11.0f), this.q0);
            canvas.save();
            canvas.translate(f1922 - org.telegram.messenger.g0.N(11.0f), f2022 - org.telegram.messenger.g0.N(11.0f));
            this.o0.draw(canvas);
            canvas.restore();
            canvas.restore();
        }
        TLRPC.User user = this.g2;
        if (user == null || hp.F2(user) || this.g2.bot) {
            TLRPC.Chat chat2 = this.h2;
            if (chat2 != null) {
                boolean z15 = chat2.call_active && chat2.call_not_empty;
                this.w2 = z15;
                if ((z15 || this.r1 != 0.0f) && this.j0 < 1.0f) {
                    gi.y2 y2Var3 = this.r2;
                    float progress2 = (y2Var3 == null || !y2Var3.a.q) ? 1.0f : 1.0f - y2Var3.getProgress();
                    int L15 = (int) (this.v0.F.bottom - org.telegram.messenger.g0.L((this.s2 || az.p1) ? 6.0f : 8.0f));
                    if (bd.a0) {
                        float f21 = this.v0.F.left;
                        f10 = 0.10666667f;
                        if (!this.s2 && !az.p1) {
                            f17 = 6.0f;
                        }
                        L = (int) (f21 + org.telegram.messenger.g0.L(f17));
                    } else {
                        f10 = 0.10666667f;
                        float f22 = this.v0.F.right;
                        if (!this.s2 && !az.p1) {
                            f17 = 6.0f;
                        }
                        L = (int) (f22 - org.telegram.messenger.g0.L(f17));
                    }
                    if (this.j0 != 0.0f) {
                        canvas.save();
                        float f23 = 1.0f - this.j0;
                        canvas.scale(f23, f23, L, L15);
                    }
                    Paint paint2 = org.telegram.ui.ActionBar.k6.t0;
                    int i17 = org.telegram.ui.ActionBar.k6.d6;
                    paint2.setColor(org.telegram.ui.ActionBar.k6.w0(i17, this.K4));
                    float f24 = L;
                    float f25 = L15;
                    canvas.drawCircle(f24, f25, org.telegram.messenger.g0.L(11.0f) * this.r1 * progress2, org.telegram.ui.ActionBar.k6.t0);
                    org.telegram.ui.ActionBar.k6.t0.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.T8, this.K4));
                    canvas.drawCircle(f24, f25, org.telegram.messenger.g0.L(9.0f) * this.r1 * progress2, org.telegram.ui.ActionBar.k6.t0);
                    org.telegram.ui.ActionBar.k6.t0.setColor(org.telegram.ui.ActionBar.k6.w0(i17, this.K4));
                    if (!lc.e(360928)) {
                        this.s1 = 0.65f;
                    }
                    int i18 = this.t1;
                    if (i18 != 0) {
                        i3 = 360928;
                        if (i18 != 1) {
                            if (i18 != 2) {
                                if (i18 == 3) {
                                    L2 = org.telegram.messenger.g0.L(3.0f) - (org.telegram.messenger.g0.L(2.0f) * this.s1);
                                    L3 = org.telegram.messenger.g0.L(1.0f);
                                    L4 = org.telegram.messenger.g0.L(2.0f);
                                    f11 = this.s1;
                                } else if (i18 == 4) {
                                    L2 = (org.telegram.messenger.g0.L(4.0f) * this.s1) + org.telegram.messenger.g0.L(1.0f);
                                    L10 = org.telegram.messenger.g0.L(3.0f);
                                    L11 = org.telegram.messenger.g0.L(2.0f);
                                    f14 = this.s1;
                                } else if (i18 == 5) {
                                    L5 = org.telegram.messenger.g0.L(5.0f) - (org.telegram.messenger.g0.L(4.0f) * this.s1);
                                    L8 = org.telegram.messenger.g0.L(1.0f);
                                    L9 = org.telegram.messenger.g0.L(4.0f);
                                    f13 = this.s1;
                                } else if (i18 == 6) {
                                    L5 = org.telegram.messenger.g0.L(1.0f) + (org.telegram.messenger.g0.L(4.0f) * this.s1);
                                    L6 = org.telegram.messenger.g0.L(5.0f);
                                    L7 = org.telegram.messenger.g0.L(4.0f);
                                    f12 = this.s1;
                                } else {
                                    L2 = org.telegram.messenger.g0.L(5.0f) - (org.telegram.messenger.g0.L(4.0f) * this.s1);
                                    L3 = org.telegram.messenger.g0.L(1.0f);
                                    L4 = org.telegram.messenger.g0.L(2.0f);
                                    f11 = this.s1;
                                }
                                f15 = L3 + (L4 * f11);
                                if (this.r1 >= 1.0f || progress2 < 1.0f) {
                                    canvas.save();
                                    float f26 = this.r1 * progress2;
                                    canvas.scale(f26, f26, f24, f25);
                                }
                                z11 = true;
                                this.s4.set(L - org.telegram.messenger.g0.L(1.0f), f25 - L2, org.telegram.messenger.g0.L(1.0f) + L, L2 + f25);
                                canvas.drawRoundRect(this.s4, org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f), org.telegram.ui.ActionBar.k6.t0);
                                float f27 = f25 - f15;
                                float f28 = f25 + f15;
                                this.s4.set(L - org.telegram.messenger.g0.L(5.0f), f27, L - org.telegram.messenger.g0.L(3.0f), f28);
                                canvas.drawRoundRect(this.s4, org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f), org.telegram.ui.ActionBar.k6.t0);
                                this.s4.set(org.telegram.messenger.g0.L(3.0f) + L, f27, org.telegram.messenger.g0.L(5.0f) + L, f28);
                                canvas.drawRoundRect(this.s4, org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f), org.telegram.ui.ActionBar.k6.t0);
                                if (this.r1 >= 1.0f || progress2 < 1.0f) {
                                    canvas.restore();
                                }
                                if (lc.e(i3)) {
                                    float f29 = this.s1 + 0.04f;
                                    this.s1 = f29;
                                    if (f29 >= 1.0f) {
                                        this.s1 = 0.0f;
                                        int i19 = this.t1 + 1;
                                        this.t1 = i19;
                                        if (i19 >= 8) {
                                            this.t1 = 0;
                                        }
                                    }
                                    z13 = true;
                                }
                                if (this.w2) {
                                    float f30 = this.r1;
                                    if (f30 > 0.0f) {
                                        float f31 = f30 - f10;
                                        this.r1 = f31;
                                        if (f31 < 0.0f) {
                                            this.r1 = 0.0f;
                                        }
                                    }
                                } else {
                                    float f32 = this.r1;
                                    if (f32 < 1.0f) {
                                        float f33 = f32 + f10;
                                        this.r1 = f33;
                                        if (f33 > 1.0f) {
                                            this.r1 = 1.0f;
                                        }
                                    }
                                }
                                if (this.j0 != 0.0f) {
                                    canvas.restore();
                                }
                                if (this.x2) {
                                    float f34 = this.n0;
                                    if (f34 < 1.0f) {
                                        this.n0 = f34 + f10;
                                        z12 = z11;
                                    }
                                    z12 = z13;
                                } else {
                                    float f35 = this.n0;
                                    if (f35 > 0.0f) {
                                        this.n0 = f35 - f10;
                                        z12 = z11;
                                    }
                                    z12 = z13;
                                }
                                this.n0 = Utilities.i(this.n0, 1.0f, 0.0f);
                                return z12;
                            }
                            L5 = org.telegram.messenger.g0.L(1.0f) + (org.telegram.messenger.g0.L(2.0f) * this.s1);
                            L6 = org.telegram.messenger.g0.L(5.0f);
                            L7 = org.telegram.messenger.g0.L(4.0f);
                            f12 = this.s1;
                            f16 = L6 - (L7 * f12);
                            L2 = L5;
                            f15 = f16;
                            if (this.r1 >= 1.0f) {
                            }
                            canvas.save();
                            float f262 = this.r1 * progress2;
                            canvas.scale(f262, f262, f24, f25);
                            z11 = true;
                            this.s4.set(L - org.telegram.messenger.g0.L(1.0f), f25 - L2, org.telegram.messenger.g0.L(1.0f) + L, L2 + f25);
                            canvas.drawRoundRect(this.s4, org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f), org.telegram.ui.ActionBar.k6.t0);
                            float f272 = f25 - f15;
                            float f282 = f25 + f15;
                            this.s4.set(L - org.telegram.messenger.g0.L(5.0f), f272, L - org.telegram.messenger.g0.L(3.0f), f282);
                            canvas.drawRoundRect(this.s4, org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f), org.telegram.ui.ActionBar.k6.t0);
                            this.s4.set(org.telegram.messenger.g0.L(3.0f) + L, f272, org.telegram.messenger.g0.L(5.0f) + L, f282);
                            canvas.drawRoundRect(this.s4, org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f), org.telegram.ui.ActionBar.k6.t0);
                            if (this.r1 >= 1.0f) {
                            }
                            canvas.restore();
                            if (lc.e(i3)) {
                            }
                            if (this.w2) {
                            }
                            if (this.j0 != 0.0f) {
                            }
                            if (this.x2) {
                            }
                            this.n0 = Utilities.i(this.n0, 1.0f, 0.0f);
                            return z12;
                        }
                        L5 = org.telegram.messenger.g0.L(5.0f) - (org.telegram.messenger.g0.L(4.0f) * this.s1);
                        L8 = org.telegram.messenger.g0.L(1.0f);
                        L9 = org.telegram.messenger.g0.L(4.0f);
                        f13 = this.s1;
                        f16 = L8 + (L9 * f13);
                        L2 = L5;
                        f15 = f16;
                        if (this.r1 >= 1.0f) {
                        }
                        canvas.save();
                        float f2622 = this.r1 * progress2;
                        canvas.scale(f2622, f2622, f24, f25);
                        z11 = true;
                        this.s4.set(L - org.telegram.messenger.g0.L(1.0f), f25 - L2, org.telegram.messenger.g0.L(1.0f) + L, L2 + f25);
                        canvas.drawRoundRect(this.s4, org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f), org.telegram.ui.ActionBar.k6.t0);
                        float f2722 = f25 - f15;
                        float f2822 = f25 + f15;
                        this.s4.set(L - org.telegram.messenger.g0.L(5.0f), f2722, L - org.telegram.messenger.g0.L(3.0f), f2822);
                        canvas.drawRoundRect(this.s4, org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f), org.telegram.ui.ActionBar.k6.t0);
                        this.s4.set(org.telegram.messenger.g0.L(3.0f) + L, f2722, org.telegram.messenger.g0.L(5.0f) + L, f2822);
                        canvas.drawRoundRect(this.s4, org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f), org.telegram.ui.ActionBar.k6.t0);
                        if (this.r1 >= 1.0f) {
                        }
                        canvas.restore();
                        if (lc.e(i3)) {
                        }
                        if (this.w2) {
                        }
                        if (this.j0 != 0.0f) {
                        }
                        if (this.x2) {
                        }
                        this.n0 = Utilities.i(this.n0, 1.0f, 0.0f);
                        return z12;
                    }
                    i3 = 360928;
                    L2 = (org.telegram.messenger.g0.L(4.0f) * this.s1) + org.telegram.messenger.g0.L(1.0f);
                    L10 = org.telegram.messenger.g0.L(3.0f);
                    L11 = org.telegram.messenger.g0.L(2.0f);
                    f14 = this.s1;
                    f15 = L10 - (L11 * f14);
                    if (this.r1 >= 1.0f) {
                    }
                    canvas.save();
                    float f26222 = this.r1 * progress2;
                    canvas.scale(f26222, f26222, f24, f25);
                    z11 = true;
                    this.s4.set(L - org.telegram.messenger.g0.L(1.0f), f25 - L2, org.telegram.messenger.g0.L(1.0f) + L, L2 + f25);
                    canvas.drawRoundRect(this.s4, org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f), org.telegram.ui.ActionBar.k6.t0);
                    float f27222 = f25 - f15;
                    float f28222 = f25 + f15;
                    this.s4.set(L - org.telegram.messenger.g0.L(5.0f), f27222, L - org.telegram.messenger.g0.L(3.0f), f28222);
                    canvas.drawRoundRect(this.s4, org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f), org.telegram.ui.ActionBar.k6.t0);
                    this.s4.set(org.telegram.messenger.g0.L(3.0f) + L, f27222, org.telegram.messenger.g0.L(5.0f) + L, f28222);
                    canvas.drawRoundRect(this.s4, org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f), org.telegram.ui.ActionBar.k6.t0);
                    if (this.r1 >= 1.0f) {
                    }
                    canvas.restore();
                    if (lc.e(i3)) {
                    }
                    if (this.w2) {
                    }
                    if (this.j0 != 0.0f) {
                    }
                    if (this.x2) {
                    }
                    this.n0 = Utilities.i(this.n0, 1.0f, 0.0f);
                    return z12;
                }
            }
        } else {
            boolean X = X();
            this.C0 = X;
            if (X || this.q1 != 0.0f) {
                int L16 = (int) (this.v0.F.bottom - org.telegram.messenger.g0.L((this.s2 || az.p1) ? 6.0f : 8.0f));
                if (bd.a0) {
                    float f36 = this.v0.F.left;
                    if (!this.s2 && !az.p1) {
                        f17 = 6.0f;
                    }
                    L12 = f36 + org.telegram.messenger.g0.L(f17);
                } else {
                    float f37 = this.v0.F.right;
                    if (!this.s2 && !az.p1) {
                        f17 = 6.0f;
                    }
                    L12 = f37 - org.telegram.messenger.g0.L(f17);
                }
                int i20 = (int) L12;
                org.telegram.ui.ActionBar.k6.t0.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.d6, this.K4));
                float f38 = i20;
                float f39 = L16;
                canvas.drawCircle(f38, f39, org.telegram.messenger.g0.L(7.0f) * this.q1, org.telegram.ui.ActionBar.k6.t0);
                org.telegram.ui.ActionBar.k6.t0.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.T8, this.K4));
                canvas.drawCircle(f38, f39, org.telegram.messenger.g0.L(5.0f) * this.q1, org.telegram.ui.ActionBar.k6.t0);
                if (X) {
                    float f40 = this.q1;
                    if (f40 < 1.0f) {
                        float f41 = f40 + 0.10666667f;
                        this.q1 = f41;
                        if (f41 > 1.0f) {
                            this.q1 = 1.0f;
                        }
                        z13 = true;
                    }
                } else {
                    float f42 = this.q1;
                    if (f42 > 0.0f) {
                        float f43 = f42 - 0.10666667f;
                        this.q1 = f43;
                        if (f43 < 0.0f) {
                            this.q1 = 0.0f;
                        }
                        z13 = true;
                    }
                }
            }
        }
        f10 = 0.10666667f;
        z11 = true;
        if (this.x2) {
        }
        this.n0 = Utilities.i(this.n0, 1.0f, 0.0f);
        return z12;
    }

    public final void I(Canvas canvas, boolean z10, boolean z11, boolean z12, boolean z13, float f10) {
        if (f10 != 0.0f || z13) {
            float f11 = (f10 * 0.5f) + 0.5f;
            if (z10) {
                z.s(this.W2, this.X2, org.telegram.ui.ActionBar.k6.X0);
                if (f10 != 1.0f) {
                    canvas.save();
                    canvas.scale(f11, f11, org.telegram.ui.ActionBar.k6.X0.getBounds().centerX(), org.telegram.ui.ActionBar.k6.W0.getBounds().centerY());
                    org.telegram.ui.ActionBar.k6.X0.setAlpha((int) (f10 * 255.0f));
                }
                org.telegram.ui.ActionBar.k6.X0.draw(canvas);
                if (f10 != 1.0f) {
                    canvas.restore();
                    org.telegram.ui.ActionBar.k6.X0.setAlpha(hs.e4);
                }
                invalidate();
                return;
            }
            if (z12) {
                if (!z11) {
                    z.s(this.V2, this.X2, org.telegram.ui.ActionBar.k6.T0);
                    if (f10 != 1.0f) {
                        canvas.save();
                        canvas.scale(f11, f11, org.telegram.ui.ActionBar.k6.T0.getBounds().centerX(), org.telegram.ui.ActionBar.k6.W0.getBounds().centerY());
                        org.telegram.ui.ActionBar.k6.T0.setAlpha((int) (f10 * 255.0f));
                    }
                    org.telegram.ui.ActionBar.k6.T0.draw(canvas);
                    if (f10 != 1.0f) {
                        canvas.restore();
                        org.telegram.ui.ActionBar.k6.T0.setAlpha(hs.e4);
                        return;
                    }
                    return;
                }
                z.s(this.Y2, this.X2, org.telegram.ui.ActionBar.k6.W0);
                if (z13) {
                    canvas.save();
                    canvas.scale(f11, f11, org.telegram.ui.ActionBar.k6.W0.getBounds().centerX(), org.telegram.ui.ActionBar.k6.W0.getBounds().centerY());
                    org.telegram.ui.ActionBar.k6.W0.setAlpha((int) (f10 * 255.0f));
                }
                if (!z13 && f10 != 0.0f) {
                    canvas.save();
                    canvas.scale(f11, f11, org.telegram.ui.ActionBar.k6.W0.getBounds().centerX(), org.telegram.ui.ActionBar.k6.W0.getBounds().centerY());
                    int i3 = (int) (255.0f * f10);
                    org.telegram.ui.ActionBar.k6.W0.setAlpha(i3);
                    org.telegram.ui.ActionBar.k6.V0.setAlpha(i3);
                }
                org.telegram.ui.ActionBar.k6.W0.draw(canvas);
                if (z13) {
                    canvas.restore();
                    canvas.save();
                    canvas.translate((1.0f - f10) * org.telegram.messenger.g0.L(4.0f), 0.0f);
                }
                z.s(this.U2, this.X2, org.telegram.ui.ActionBar.k6.V0);
                org.telegram.ui.ActionBar.k6.V0.draw(canvas);
                if (z13) {
                    canvas.restore();
                    org.telegram.ui.ActionBar.k6.W0.setAlpha(hs.e4);
                }
                if (z13 || f10 == 0.0f) {
                    return;
                }
                canvas.restore();
                org.telegram.ui.ActionBar.k6.W0.setAlpha(hs.e4);
                org.telegram.ui.ActionBar.k6.V0.setAlpha(hs.e4);
            }
        }
    }

    public final void J(Canvas canvas, boolean z10, int i3, int i10, int i11, float f10, boolean z11) {
        float f11;
        Paint paint;
        boolean z12;
        RectF rectF;
        RectF rectF2;
        boolean z13 = W() || V();
        if (!(this.H3 && this.M3) && this.W3 == 1.0f) {
            return;
        }
        float f12 = (this.T0 != 0 || this.U0) ? this.W3 : 1.0f - this.W3;
        int i12 = hs.e4;
        if (z11) {
            if (this.U == null) {
                Paint paint2 = new Paint();
                this.U = paint2;
                paint2.setStyle(Paint.Style.STROKE);
                this.U.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
                this.U.setStrokeJoin(Paint.Join.ROUND);
                this.U.setStrokeCap(Paint.Cap.ROUND);
            }
            f11 = 1.0f;
            this.U.setColor(i0.a.f(Color.alpha(r14) / 255.0f, org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.d6, false), i0.a.o(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.s9, false), hs.e4)));
        } else {
            f11 = 1.0f;
        }
        if (this.Q && this.O.read_inbox_max_id == 0) {
            if (this.T == null) {
                this.T = new Paint();
            }
            paint = this.T;
            int w02 = org.telegram.ui.ActionBar.k6.w0(z10 ? org.telegram.ui.ActionBar.k6.Sk : org.telegram.ui.ActionBar.k6.Rk, this.K4);
            paint.setColor(w02);
            org.telegram.ui.ActionBar.k6.M0.setColor(w02);
            i12 = z10 ? 30 : 40;
            z12 = true;
        } else {
            paint = (z10 || this.K0 != 0) ? org.telegram.ui.ActionBar.k6.y0 : org.telegram.ui.ActionBar.k6.w0;
            z12 = false;
        }
        StaticLayout staticLayout = this.Z3;
        RectF rectF3 = this.s4;
        if (staticLayout == null || this.T0 == 0) {
            if (this.T0 != 0) {
                staticLayout = this.Y3;
            }
            paint.setAlpha((int) ((f11 - this.y3) * i12));
            org.telegram.ui.ActionBar.k6.M0.setAlpha((int) ((f11 - this.y3) * 255.0f));
            float f13 = i3;
            rectF3.set(i10, f13, org.telegram.messenger.g0.L(12.666f) + this.P3 + i10, org.telegram.messenger.g0.L(20.666f) + i3);
            int save = canvas.save();
            if (f10 != f11) {
                canvas.scale(f10, f10, rectF3.centerX(), rectF3.centerY());
            }
            if (f12 != f11) {
                canvas.scale(f12, f12, rectF3.centerX(), rectF3.centerY());
            }
            if (z13) {
                if (this.u4 == null || (rectF = this.v4) == null || !rectF.equals(rectF3)) {
                    RectF rectF4 = this.v4;
                    if (rectF4 == null) {
                        this.v4 = new RectF(rectF3);
                    } else {
                        rectF4.set(rectF3);
                    }
                    if (this.u4 == null) {
                        this.u4 = new Path();
                    }
                    kf.a(this.u4, this.v4, org.telegram.messenger.g0.L(10.33f));
                }
                canvas.drawPath(this.u4, paint);
                if (z11) {
                    canvas.drawPath(this.u4, this.U);
                }
            } else {
                canvas.drawRoundRect(rectF3, org.telegram.messenger.g0.L(11.5f), org.telegram.messenger.g0.L(11.5f), paint);
                if (z11) {
                    canvas.drawRoundRect(rectF3, org.telegram.messenger.g0.L(11.5f), org.telegram.messenger.g0.L(11.5f), this.U);
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
            paint.setAlpha((int) ((f11 - this.y3) * i12));
            org.telegram.ui.ActionBar.k6.M0.setAlpha((int) ((f11 - this.y3) * 255.0f));
            float f14 = f12 * 2.0f;
            float f15 = f14 > f11 ? f11 : f14;
            float f16 = f11 - f15;
            float f17 = (i11 * f16) + (i10 * f15);
            float f18 = i3;
            rectF3.set(f17, f18, (this.Q3 * f16) + (this.P3 * f15) + f17 + org.telegram.messenger.g0.L(12.666f), org.telegram.messenger.g0.L(20.666f) + i3);
            float interpolation = ((f12 <= 0.5f ? xq.g.getInterpolation(f14) : xq.i.getInterpolation(f11 - ((f12 - 0.5f) * 2.0f))) * 0.1f) + f11;
            canvas.save();
            float f19 = interpolation * f10;
            canvas.scale(f19, f19, rectF3.centerX(), rectF3.centerY());
            if (z13) {
                if (this.u4 == null || (rectF2 = this.v4) == null || !rectF2.equals(rectF3)) {
                    RectF rectF5 = this.v4;
                    if (rectF5 == null) {
                        this.v4 = new RectF(rectF3);
                    } else {
                        rectF5.set(rectF3);
                    }
                    if (this.u4 == null) {
                        this.u4 = new Path();
                    }
                    kf.a(this.u4, this.v4, org.telegram.messenger.g0.L(10.33f));
                }
                canvas.drawPath(this.u4, paint);
                if (z11) {
                    canvas.drawPath(this.u4, this.U);
                }
            } else {
                canvas.drawRoundRect(rectF3, org.telegram.messenger.g0.L(11.5f), org.telegram.messenger.g0.L(11.5f), paint);
                if (z11) {
                    canvas.drawRoundRect(rectF3, org.telegram.messenger.g0.L(11.5f), org.telegram.messenger.g0.L(11.5f), this.U);
                }
            }
            if (this.a4 != null) {
                canvas.save();
                canvas.translate(org.telegram.messenger.g0.N(6.333f) + f17, org.telegram.messenger.g0.N(3.0f) + f18);
                this.a4.draw(canvas);
                canvas.restore();
            }
            int alpha = org.telegram.ui.ActionBar.k6.M0.getAlpha();
            float f20 = alpha;
            org.telegram.ui.ActionBar.k6.M0.setAlpha((int) (f20 * f15));
            if (this.b4 != null) {
                canvas.save();
                canvas.translate(org.telegram.messenger.g0.N(6.333f) + f17, org.telegram.messenger.g0.N(3.0f) + ((this.S3 ? org.telegram.messenger.g0.L(17.0f) : -org.telegram.messenger.g0.L(17.0f)) * f16) + f18);
                this.b4.draw(canvas);
                canvas.restore();
            } else if (this.Y3 != null) {
                canvas.save();
                canvas.translate(org.telegram.messenger.g0.N(6.333f) + f17, org.telegram.messenger.g0.N(3.0f) + ((this.S3 ? org.telegram.messenger.g0.L(17.0f) : -org.telegram.messenger.g0.L(17.0f)) * f16) + f18);
                this.Y3.draw(canvas);
                canvas.restore();
            }
            if (this.Z3 != null) {
                org.telegram.ui.ActionBar.k6.M0.setAlpha((int) (f20 * f16));
                canvas.save();
                canvas.translate(org.telegram.messenger.g0.N(6.333f) + f17, org.telegram.messenger.g0.N(3.0f) + ((this.S3 ? -org.telegram.messenger.g0.L(17.0f) : org.telegram.messenger.g0.L(17.0f)) * f15) + f18);
                this.Z3.draw(canvas);
                canvas.restore();
            }
            org.telegram.ui.ActionBar.k6.M0.setAlpha(alpha);
            canvas.restore();
        }
        if (z12) {
            org.telegram.ui.ActionBar.k6.M0.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.W8, false));
        }
    }

    public boolean K() {
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
    public final CharSequence L() {
        TLRPC.Chat M0;
        TLRPC.User user;
        TLRPC.User a22;
        String M02;
        int i3 = this.G0;
        hp s12 = hp.s1(i3);
        ArrayList W0 = s12.W0(this.K0);
        this.N0 = W0.size();
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
                            M02 = l10.x(user) ? bd.M0(2131749336, null) : org.telegram.messenger.g0.U(org.telegram.messenger.g5.m(0, user.first_name, user.last_name).replace('\n', ' '));
                        }
                        if (spannableStringBuilder.length() > 0) {
                            spannableStringBuilder.append((CharSequence) ", ");
                        }
                        int length = spannableStringBuilder.length();
                        int length2 = M02.length() + length;
                        spannableStringBuilder.append((CharSequence) M02);
                        if (dialog.unread_count > 0) {
                            spannableStringBuilder.setSpan(new o31(org.telegram.messenger.g0.o(), org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Y8, this.K4)), length, length2, 33);
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
        if (hp.s1(i3).i0.D(true) > 0) {
            int max = Math.max(1, hp.s1(i3).i0.D(true));
            if (spannableStringBuilder.length() > 0) {
                spannableStringBuilder.append((CharSequence) ", ");
            }
            spannableStringBuilder.append((CharSequence) bd.G(max, "Stories", new Object[0]));
        }
        return org.telegram.messenger.i6.m(spannableStringBuilder, org.telegram.ui.ActionBar.k6.F0[this.F0].getFontMetricsInt(), false, null, 0);
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
    public final CharSequence N() {
        TLRPC.Chat M0;
        TLRPC.User user;
        TLRPC.User a22;
        String M02;
        hp s12 = hp.s1(this.G0);
        ArrayList arrayList = (ArrayList) s12.x.f(-this.I0);
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            TLRPC.Dialog dialog = (TLRPC.Dialog) arrayList.get(i3);
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
                            M02 = l10.x(user) ? bd.M0(2131749336, null) : org.telegram.messenger.g0.U(org.telegram.messenger.g5.m(0, user.first_name, user.last_name).replace('\n', ' '));
                        }
                        if (spannableStringBuilder.length() > 0) {
                            spannableStringBuilder.append((CharSequence) ", ");
                        }
                        int length = spannableStringBuilder.length();
                        int length2 = M02.length() + length;
                        spannableStringBuilder.append((CharSequence) M02);
                        if (dialog.unread_count > 0) {
                            spannableStringBuilder.setSpan(new o31(org.telegram.messenger.g0.o(), org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Y8, this.K4)), length, length2, 33);
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
        return org.telegram.messenger.i6.m(spannableStringBuilder, org.telegram.ui.ActionBar.k6.F0[this.F0].getFontMetricsInt(), false, null, 0);
    }

    public final CharSequence P() {
        if (this.O4 == null) {
            this.O4 = new s2(this);
        }
        s2.a(this.O4, this.G0, this.g1, this.h2);
        this.O4.getClass();
        s2 s2Var = this.O4;
        this.N4 = s2Var.c;
        this.g0 = s2Var.d;
        return s2Var.g;
    }

    public final ColorFilter Q(int i3, int i10) {
        if (this.Y4 == null) {
            this.Z4 = new int[4];
            this.Y4 = new ColorFilter[4];
        }
        if (i10 != this.Z4[i3] || this.Y4[i3] == null) {
            ColorFilter[] colorFilterArr = this.Y4;
            this.Z4[i3] = i10;
            colorFilterArr[i3] = new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN);
        }
        return this.Y4[i3];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0, types: [android.view.View, org.telegram.ui.Cells.t2] */
    /* JADX WARN: Type inference failed for: r3v6, types: [android.text.Spannable, android.text.SpannableString, java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.CharSequence] */
    public final SpannableStringBuilder R(int i3, CharSequence charSequence, String str, boolean z10) {
        CharSequence N2;
        TLRPC.Message message;
        CharSequence charSequence2;
        String G;
        CharSequence charSequence3;
        SpannableStringBuilder valueOf;
        zi captionMessage = getCaptionMessage();
        zi ziVar = this.g1;
        CharSequence charSequence4 = ziVar != null ? ziVar.v : null;
        this.f0 = true;
        if (!TextUtils.isEmpty(str)) {
            return O(i3, str, charSequence);
        }
        zi ziVar2 = this.g1;
        TLRPC.Message message2 = ziVar2.k;
        if (message2 instanceof TLRPC.TL_messageService) {
            CharSequence charSequence5 = ziVar2.w;
            if (charSequence5 == null || ((message2.action instanceof TLRPC.TL_messageActionTopicCreate) && this.Q)) {
                charSequence5 = ziVar2.v;
            }
            if (zi.F4(ziVar2)) {
                valueOf = O(i3, charSequence5, charSequence);
                if (this.g1.g2[0] instanceof rg.a) {
                    int i10 = this.G0;
                    TLRPC.TL_forumTopic f10 = hp.s1(i10).q7.f(-zi.B0(this.g1.k), zi.c2(i10, this.g1.k, true, false));
                    if (f10 != null) {
                        ((rg.a) this.g1.g2[0]).b(f10.icon_color);
                    }
                }
            } else {
                this.f0 = false;
                valueOf = SpannableStringBuilder.valueOf(charSequence5);
            }
            if (z10) {
                w(valueOf);
            }
            return valueOf;
        }
        if (captionMessage != null && (charSequence3 = captionMessage.z) != null) {
            String charSequence6 = charSequence3.toString();
            String str2 = !this.W ? "" : zi.M4(captionMessage.k) ? "📹 " : zi.S4(captionMessage.k) ? "🎤 " : captionMessage.J3() ? "🎧 " : zi.T3(captionMessage.k) ? "🖼 " : "📎 ";
            if (captionMessage.s2() && !TextUtils.isEmpty(captionMessage.k.message)) {
                CharSequence charSequence7 = captionMessage.a2;
                int measuredWidth = getMeasuredWidth() - org.telegram.messenger.g0.L(this.J + 47);
                if (this.a0) {
                    if (!TextUtils.isEmpty(charSequence)) {
                        measuredWidth = (int) (measuredWidth - this.b0.measureText(charSequence.toString()));
                    }
                    measuredWidth = (int) (measuredWidth - this.b0.measureText(": "));
                }
                if (measuredWidth > 0 && captionMessage.Z1) {
                    charSequence7 = org.telegram.messenger.g0.Q(charSequence7, (String) captionMessage.Y1.get(0), measuredWidth, this.b0);
                }
                return new SpannableStringBuilder(str2).append(charSequence7);
            }
            int length = charSequence6.length();
            CharSequence charSequence8 = charSequence6;
            if (length > 150) {
                charSequence8 = charSequence6.subSequence(0, hs.g2);
            }
            SpannableString spannableString = new SpannableString(charSequence8);
            captionMessage.V5();
            li.g(captionMessage.k.entities, charSequence8, spannableString, hs.n4);
            TLRPC.Message message3 = captionMessage.k;
            if (message3 != null) {
                ArrayList<TLRPC.MessageEntity> arrayList = message3.entities;
                TextPaint textPaint = this.b0;
                li.a(textPaint != null ? textPaint.getFontMetricsInt() : null, spannableString, arrayList);
            }
            CharSequence append = new SpannableStringBuilder(str2).append(org.telegram.messenger.g0.N2(spannableString));
            if (z10) {
                append = w(append);
            }
            return O(i3, append, charSequence);
        }
        TL_iv.RichMessage richMessage = message2.rich_message;
        org.telegram.ui.ActionBar.e6 e6Var = this.K4;
        if (richMessage != null) {
            boolean P2 = richMessage.blocks.size() == 1 ? zi.P2(this.g1.k.rich_message.blocks.get(0)) : false;
            SpannableStringBuilder O = O(i3, this.g1.v, charSequence);
            if (P2 && !W()) {
                try {
                    O.setSpan(new tz(org.telegram.ui.ActionBar.k6.p9, e6Var), this.a0 ? charSequence.length() + 2 : 0, O.length(), 33);
                    return O;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
            }
            return O;
        }
        if (message2.media == null || ziVar2.G3()) {
            zi ziVar3 = this.g1;
            String str3 = ziVar3.k.message;
            if (str3 == null) {
                return new SpannableStringBuilder();
            }
            if (ziVar3.s2()) {
                CharSequence charSequence9 = this.g1.a2;
                N2 = str3;
                if (charSequence9 != null) {
                    N2 = charSequence9;
                }
                int measuredWidth2 = getMeasuredWidth() - org.telegram.messenger.g0.L(this.J + 33);
                if (this.a0) {
                    if (!TextUtils.isEmpty(charSequence)) {
                        measuredWidth2 = (int) (measuredWidth2 - this.b0.measureText(charSequence.toString()));
                    }
                    measuredWidth2 = (int) (measuredWidth2 - this.b0.measureText(": "));
                }
                if (measuredWidth2 > 0) {
                    N2 = org.telegram.messenger.g0.Q(N2, (String) this.g1.Y1.get(0), measuredWidth2, this.b0);
                }
            } else {
                int length2 = str3.length();
                CharSequence charSequence10 = str3;
                if (length2 > 150) {
                    charSequence10 = str3.subSequence(0, hs.g2);
                }
                N2 = org.telegram.messenger.g0.N2(charSequence10);
            }
            ?? spannableString2 = new SpannableString(N2);
            zi ziVar4 = this.g1;
            if (ziVar4 != null) {
                ziVar4.V5();
            }
            zi ziVar5 = this.g1;
            Pattern pattern = li.S1;
            li.g(ziVar5.k.entities, ziVar5.v, spannableString2, hs.n4);
            zi ziVar6 = this.g1;
            if (ziVar6 != null && (message = ziVar6.k) != null) {
                ArrayList<TLRPC.MessageEntity> arrayList2 = message.entities;
                TextPaint textPaint2 = this.b0;
                li.a(textPaint2 != null ? textPaint2.getFontMetricsInt() : null, spannableString2, arrayList2);
            }
            if (z10) {
                spannableString2 = w(spannableString2);
            }
            return O(i3, spannableString2, charSequence);
        }
        this.b0 = org.telegram.ui.ActionBar.k6.H0[this.F0];
        int i11 = org.telegram.ui.ActionBar.k6.o9;
        zi ziVar7 = this.g1;
        TLRPC.MessageMedia messageMedia = ziVar7.k.media;
        if (messageMedia instanceof TLRPC.TL_messageMediaPoll) {
            TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) messageMedia;
            TLRPC.TL_textWithEntities tL_textWithEntities = tL_messageMediaPoll.poll.question;
            if (tL_textWithEntities == null || tL_textWithEntities.entities == null) {
                charSequence2 = ph.a.a(R.drawable.dialog_media_poll_20, tL_textWithEntities.text, true);
            } else {
                SpannableString spannableString3 = new SpannableString(tL_messageMediaPoll.poll.question.text.replace('\n', ' '));
                TLRPC.TL_textWithEntities tL_textWithEntities2 = tL_messageMediaPoll.poll.question;
                li.g(tL_textWithEntities2.entities, tL_textWithEntities2.text, spannableString3, -1);
                li.a(org.telegram.ui.ActionBar.k6.F0[this.F0].getFontMetricsInt(), spannableString3, tL_messageMediaPoll.poll.question.entities);
                charSequence2 = ph.a.a(R.drawable.dialog_media_poll_20, spannableString3, true);
            }
        } else if (messageMedia instanceof TLRPC.TL_messageMediaToDo) {
            TLRPC.TL_messageMediaToDo tL_messageMediaToDo = (TLRPC.TL_messageMediaToDo) messageMedia;
            TLRPC.TL_textWithEntities tL_textWithEntities3 = tL_messageMediaToDo.todo.title;
            if (tL_textWithEntities3 == null || tL_textWithEntities3.entities == null) {
                charSequence2 = ph.a.a(R.drawable.dialog_media_checklist_20, tL_textWithEntities3.text, true);
            } else {
                SpannableString spannableString4 = new SpannableString(tL_messageMediaToDo.todo.title.text.replace('\n', ' '));
                TLRPC.TL_textWithEntities tL_textWithEntities4 = tL_messageMediaToDo.todo.title;
                li.g(tL_textWithEntities4.entities, tL_textWithEntities4.text, spannableString4, -1);
                li.a(org.telegram.ui.ActionBar.k6.F0[this.F0].getFontMetricsInt(), spannableString4, tL_messageMediaToDo.todo.title.entities);
                charSequence2 = ph.a.a(R.drawable.dialog_media_checklist_20, spannableString4, true);
            }
        } else if (messageMedia instanceof TLRPC.TL_messageMediaGame) {
            charSequence2 = ph.a.a(R.drawable.dialog_media_game_20, messageMedia.game.title, true);
        } else if (messageMedia instanceof TLRPC.TL_messageMediaInvoice) {
            charSequence2 = messageMedia.title;
        } else if (ziVar7.D == 14) {
            charSequence2 = f1.q("🎧 \u2068", ziVar7.x1(true), " - ", this.g1.z1(true), "\u2069");
        } else if (messageMedia instanceof TLRPC.TL_messageMediaPaidMedia) {
            int size = ((TLRPC.TL_messageMediaPaidMedia) messageMedia).extended_media.size();
            charSequence2 = wb.T0(bd.a0(null, null, 2131753949, this.T1 ? size > 1 ? bd.G(size, "Media", new Object[0]) : bd.M0(2131753933, null) : size > 1 ? bd.G(size, "Photos", new Object[0]) : bd.M0(2131753948, null)));
            i11 = org.telegram.ui.ActionBar.k6.p9;
        } else if (this.S1 > 1) {
            if (this.T1) {
                ArrayList arrayList3 = this.h1;
                G = bd.G(arrayList3 == null ? 0 : arrayList3.size(), "Media", new Object[0]);
            } else {
                ArrayList arrayList4 = this.h1;
                G = bd.G(arrayList4 == null ? 0 : arrayList4.size(), "Photos", new Object[0]);
            }
            charSequence2 = G;
            i11 = org.telegram.ui.ActionBar.k6.p9;
        } else {
            charSequence2 = charSequence4.toString();
            i11 = org.telegram.ui.ActionBar.k6.p9;
        }
        if (charSequence2 instanceof String) {
            charSequence2 = ((String) charSequence2).replace('\n', ' ');
        }
        if (z10) {
            charSequence2 = w(charSequence2);
        }
        SpannableStringBuilder O2 = O(i3, charSequence2, charSequence);
        if (!W()) {
            try {
                O2.setSpan(new tz(i11, e6Var), this.a0 ? charSequence.length() + 2 : 0, O2.length(), 33);
                return O2;
            } catch (Exception e11) {
                org.telegram.messenger.a8.g(e11, true);
            }
        }
        return O2;
    }

    public final boolean S() {
        ui.f fVar = this.u0;
        return (fVar == null || ((ArrayList) fVar.d).isEmpty()) ? false : true;
    }

    public final boolean T() {
        if (org.telegram.messenger.t3.Y(this.h2)) {
            return !this.f1;
        }
        if (this.Q) {
            return this.b1;
        }
        TLRPC.Chat chat = this.h2;
        return (chat != null && chat.forum && this.O == null) ? !this.e1 : this.a1;
    }

    public final boolean U() {
        return this.K0 > 0;
    }

    public final boolean V() {
        return this.K0 != 0;
    }

    public boolean W() {
        TLRPC.Chat chat;
        if (U() || this.Q0 || (chat = this.h2) == null) {
            return false;
        }
        if (!chat.forum) {
            if (!org.telegram.messenger.t3.p0(chat)) {
                return false;
            }
            if (!org.telegram.messenger.t3.A(this.G0, this.h2, 24)) {
                return false;
            }
        }
        return !this.Q;
    }

    public final boolean X() {
        TLRPC.User user;
        if (W() || this.v0.w || (user = this.g2) == null || user.self) {
            return false;
        }
        TLRPC.UserStatus userStatus = user.status;
        int i3 = this.G0;
        if (userStatus != null && userStatus.expires <= 0 && hp.s1(i3).a0.containsKey(Long.valueOf(this.g2.id))) {
            return true;
        }
        TLRPC.UserStatus userStatus2 = this.g2.status;
        return userStatus2 != null && userStatus2.expires > ConnectionsManager.getInstance(i3).getCurrentTime();
    }

    public final boolean Z(float f10) {
        return !bd.a0 ? f10 >= 0.0f && f10 < ((float) org.telegram.messenger.g0.L(60.0f)) : f10 >= ((float) (getMeasuredWidth() - org.telegram.messenger.g0.L(60.0f))) && f10 < ((float) getMeasuredWidth());
    }

    public final void a0(boolean z10, boolean z11) {
        if ((!getIsPinned() && z10) || this.z3 == z10) {
            if (getIsPinned()) {
                return;
            }
            this.z3 = false;
        } else {
            this.z3 = z10;
            if (z11) {
                this.y3 = z10 ? 0.0f : 1.0f;
            } else {
                this.y3 = z10 ? 1.0f : 0.0f;
            }
            invalidate();
        }
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Y8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.i9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.g9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.o9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.X8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.j9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.p9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.k9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.y6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.d6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.k7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.d9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.c9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Y5));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.s9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Z8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.n9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.m9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.l9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.h9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.z9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Ci));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Gi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.V8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.U8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.zk));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Ak));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.T8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Sk));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Rk));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.W8));
    }

    public final void b0() {
        boolean z10 = az.q1;
        this.n1 = z10;
        float f10 = z10 ? 0.0f : 1.0f;
        this.E1 = f10;
        this.b2.o = f10;
        this.u1 = 0.0f;
        this.y1 = false;
        this.y3 = (getIsPinned() && this.z3) ? 1.0f : 0.0f;
        this.x3 = true;
        this.p1 = 0.0f;
        setTranslationX(0.0f);
        setTranslationY(0.0f);
        org.telegram.ui.Components.e5 e5Var = this.o4;
        if (e5Var != null && this.x3) {
            e5Var.a();
        }
        org.telegram.ui.Components.e5 e5Var2 = this.p4;
        if (e5Var2 == null || !this.x3) {
            return;
        }
        e5Var2.a();
    }

    public final void c0(boolean z10, boolean z11) {
        gi.y2 y2Var = this.r2;
        if (y2Var != null || z10) {
            if (y2Var == null) {
                gi.y2 y2Var2 = new gi.y2(this, getContext(), this.K4, 1);
                this.r2 = y2Var2;
                y2Var2.b(-1, org.telegram.ui.ActionBar.k6.d6, org.telegram.ui.ActionBar.k6.k7);
                this.r2.setDrawUnchecked(false);
                this.r2.setDrawBackgroundAsArc(3);
                addView(this.r2);
            }
            this.r2.a(z10, z11);
            B();
        }
    }

    public final void d0(long j10, zi ziVar, int i3, boolean z10, boolean z11) {
        if (this.I0 != j10) {
            this.y4 = -1;
        }
        this.I0 = j10;
        this.C4 = System.currentTimeMillis();
        this.g1 = ziVar;
        this.v2 = z10;
        this.O0 = false;
        this.S0 = i3;
        if (ziVar != null) {
            int i10 = ziVar.k.edit_date;
        }
        this.T0 = 0;
        this.U0 = false;
        this.m1 = ziVar != null ? ziVar.f1() : 0;
        this.V0 = 0;
        this.W0 = 0;
        this.X0 = 0;
        this.Y0 = ziVar != null && ziVar.G4();
        zi ziVar2 = this.g1;
        if (ziVar2 != null) {
            this.Z0 = ziVar2.k.send_state;
        }
        i0(0, z11);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if ((!this.Q && !this.G && motionEvent.getAction() == 1) || motionEvent.getAction() == 3) {
            this.v0.a(this, motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void e0(TLRPC.Dialog dialog, int i3, int i10) {
        if (this.I0 != dialog.id) {
            ValueAnimator valueAnimator = this.B4;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.B4.cancel();
            }
            this.A4 = false;
            this.y4 = -1;
        }
        this.I0 = dialog.id;
        this.C4 = System.currentTimeMillis();
        this.O0 = true;
        if (dialog instanceof TLRPC.TL_dialogCommunity) {
            this.L0 = dialog.community_id;
        } else {
            this.L0 = 0L;
        }
        if (dialog instanceof TLRPC.TL_dialogFolder) {
            this.K0 = ((TLRPC.TL_dialogFolder) dialog).folder.id;
            ng0 ng0Var = this.f2;
            if (ng0Var != null) {
                ng0Var.H = this;
                ng0Var.i();
            }
        } else {
            this.K0 = 0;
        }
        this.k1 = i3;
        boolean z10 = i3 == 3;
        Runnable runnable = this.a5;
        if (z10 != (runnable != null)) {
            if (!z10 && runnable != null) {
                runnable.run();
                this.a5 = null;
            } else if (z10) {
                this.a5 = hs.f(this.G0).h(this, hs.i3, new l2(this, 0));
            }
        }
        if (this.u0 == null) {
            this.u0 = new ui.f(this);
        }
        this.l1 = i10;
        this.m1 = 0;
        if (i0(0, false)) {
            requestLayout();
        }
        A();
        z();
        y();
        B();
    }

    public final void f0(TLRPC.TL_forumTopic tL_forumTopic, long j10, zi ziVar, boolean z10, boolean z11) {
        ng0 ng0Var;
        this.O = tL_forumTopic;
        this.Q = tL_forumTopic != null;
        if (this.I0 != j10) {
            this.y4 = -1;
        }
        Drawable drawable = ziVar.g2[0];
        if (drawable instanceof rg.a) {
            ((rg.a) drawable).b(tL_forumTopic.icon_color);
        }
        this.I0 = j10;
        this.C4 = System.currentTimeMillis();
        this.g1 = ziVar;
        this.O0 = false;
        this.h0 = z10;
        this.S0 = ziVar.k.date;
        this.U0 = false;
        this.m1 = ziVar.f1();
        this.Y0 = ziVar.G4();
        zi ziVar2 = this.g1;
        if (ziVar2 != null) {
            this.Z0 = ziVar2.k.send_state;
        }
        if (!z11) {
            this.y4 = -1;
        }
        if (tL_forumTopic != null) {
            this.h1 = tL_forumTopic.groupedMessages;
        }
        TLRPC.TL_forumTopic tL_forumTopic2 = this.O;
        if (tL_forumTopic2 != null && tL_forumTopic2.id == 1 && (ng0Var = this.f2) != null) {
            ng0Var.H = this;
            ng0Var.i();
        }
        i0(0, z11);
    }

    public final void g0(int i3, zi ziVar) {
        TLRPC.MessageMedia messageMedia;
        ArrayList<TLRPC.PhotoSize> arrayList = ziVar.n0;
        TLObject tLObject = ziVar.l0;
        if (ziVar.z4()) {
            TL_stories.StoryItem storyItem = ziVar.k.media.storyItem;
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
        TLRPC.PhotoSize R = org.telegram.messenger.w7.R(arrayList);
        if (R == null) {
            R = org.telegram.messenger.w7.w(arrayList, 40, false, null, false);
        }
        TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(arrayList, org.telegram.messenger.g0.Z0(false), false, null, true);
        TLRPC.PhotoSize photoSize = R != w10 ? w10 : null;
        if (photoSize == null || !org.telegram.messenger.z5.q(this.G0).d(ziVar)) {
            photoSize = R;
        }
        if (R != null) {
            this.T1 = this.T1 || zi.M4(ziVar.k) || ziVar.i4();
            int i10 = this.S1;
            if (i10 < 3) {
                this.S1 = i10 + 1;
                this.X1[i3] = (zi.M4(ziVar.k) || ziVar.i4()) && !ziVar.u2();
                this.Y1[i3] = ziVar.u2();
                int i11 = (ziVar.D != 1 || photoSize == null) ? 0 : photoSize.size;
                String str = ziVar.u2() ? "5_5_b" : "20_20";
                ImageReceiver[] imageReceiverArr = this.W1;
                imageReceiverArr[i3].r0(ac.f(photoSize, tLObject), str, ac.f(R, tLObject), str, null, i11, null, ziVar, 0);
                imageReceiverArr[i3].J0(org.telegram.messenger.g0.L(ziVar.i4() ? 18.0f : 2.0f));
                this.W = false;
            }
        }
    }

    public float getClipProgress() {
        return this.u1;
    }

    public int getCurrentDialogFolderId() {
        return this.K0;
    }

    public long getDialogId() {
        return this.I0;
    }

    public boolean getHasUnread() {
        return this.T0 != 0 || this.U0;
    }

    public boolean getIsMuted() {
        return this.a1;
    }

    public boolean getIsPinned() {
        return this.B3 || this.C3;
    }

    public zi getMessage() {
        return this.g1;
    }

    public int getMessageId() {
        return this.m1;
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
        zi ziVar;
        TLRPC.Message message2;
        TLRPC.User a22;
        zi ziVar2;
        TLRPC.Message message3;
        TLRPC.MessageFwdHeader messageFwdHeader2;
        TLRPC.Message message4;
        TLRPC.MessageFwdHeader messageFwdHeader3;
        TLRPC.MessageFwdHeader messageFwdHeader4;
        zi ziVar3 = this.g1;
        if (ziVar3 != null) {
            long Z0 = ziVar3.Z0();
            int i3 = this.G0;
            long e10 = h10.i(i3).e();
            if (!this.s0 && this.I0 == e10) {
                long Q1 = this.g1.Q1();
                if (Q1 != e10) {
                    if (Q1 != 2666000) {
                        TLRPC.Message message5 = this.g1.k;
                        if (message5 != null && (messageFwdHeader4 = message5.fwd_from) != null) {
                            long o10 = org.telegram.messenger.m5.o(messageFwdHeader4.saved_from_id);
                            if (o10 == 0) {
                                o10 = org.telegram.messenger.m5.o(this.g1.k.fwd_from.from_id);
                            }
                            if (o10 > 0) {
                            }
                        }
                        Z0 = Q1;
                    }
                }
            }
            if (this.s0 && (message4 = this.g1.k) != null && (messageFwdHeader3 = message4.fwd_from) != null) {
                Z0 = org.telegram.messenger.m5.o(messageFwdHeader3.saved_from_id);
                if (Z0 == 0) {
                    Z0 = org.telegram.messenger.m5.o(this.g1.k.fwd_from.from_id);
                }
            }
            if (org.telegram.messenger.m5.E(Z0)) {
                user = hp.s1(i3).a2(Long.valueOf(Z0));
                M0 = null;
            } else {
                M0 = hp.s1(i3).M0(Long.valueOf(-Z0));
                user = null;
            }
            long j10 = this.I0;
            if (j10 != e10) {
                if (j10 == 489000 && (ziVar2 = this.g1) != null && (message3 = ziVar2.k) != null && (messageFwdHeader2 = message3.fwd_from) != null) {
                    String str3 = messageFwdHeader2.from_name;
                    if (str3 != null) {
                        return org.telegram.messenger.g0.U(str3);
                    }
                    long o11 = org.telegram.messenger.m5.o(messageFwdHeader2.from_id);
                    if (org.telegram.messenger.m5.E(o11)) {
                        return l10.p(hp.s1(i3).a2(Long.valueOf(o11)));
                    }
                    TLRPC.Chat M02 = hp.s1(i3).M0(Long.valueOf(-o11));
                    return M02 == null ? "" : M02.title;
                }
                if (this.g1.Q3() && user != null) {
                    return bd.M0(2131750511, null);
                }
                if (!this.s0 && (ziVar = this.g1) != null && (message2 = ziVar.k) != null && (message2.from_id instanceof TLRPC.TL_peerUser) && (a22 = hp.s1(i3).a2(Long.valueOf(this.g1.k.from_id.user_id))) != null) {
                    return org.telegram.messenger.g0.U(l10.j(a22, true).replace("\n", ""));
                }
                zi ziVar4 = this.g1;
                return (ziVar4 == null || (message = ziVar4.k) == null || (messageFwdHeader = message.fwd_from) == null || (str2 = messageFwdHeader.from_name) == null) ? user != null ? (this.s2 || az.p1) ? l10.x(user) ? bd.M0(2131749336, null) : org.telegram.messenger.g0.U(org.telegram.messenger.g5.m(0, user.first_name, user.last_name).replace("\n", "")) : org.telegram.messenger.g0.U(l10.j(user, true).replace("\n", "")) : (M0 == null || (str = M0.title) == null) ? "DELETED" : org.telegram.messenger.g0.U(str.replace("\n", "")) : org.telegram.messenger.g0.U(str2);
            }
            if (user != null) {
                return org.telegram.messenger.g0.U(l10.j(user, true).replace("\n", ""));
            }
            if (M0 != null) {
                return org.telegram.messenger.g0.U(M0.title.replace("\n", ""));
            }
        }
        return null;
    }

    public long getStarsPrice() {
        return this.q2;
    }

    @Override // android.view.View
    public float getTranslationX() {
        return this.x1;
    }

    public final void h0() {
        ng0 ng0Var = this.f2;
        if (ng0Var != null) {
            if (this.Q) {
                ng0Var.K = org.telegram.messenger.g0.L(24.0f);
                this.f2.L = org.telegram.messenger.g0.L(24.0f);
                this.f2.M = 0.0f;
            } else {
                m2 m2Var = this.v0;
                RectF rectF = m2Var.F;
                RectF rectF2 = m2Var.F;
                ng0Var.K = rectF.centerY();
                this.f2.L = rectF2.centerX();
                this.f2.M = rectF2.width() / 2.0f;
                if (!hp.s1(this.G0).P1().h.isEmpty()) {
                    this.f2.M -= org.telegram.messenger.g0.N(3.5f);
                }
                ng0 ng0Var2 = this.f2;
                this.Z1.q();
                ng0Var2.getClass();
            }
            ng0 ng0Var3 = this.f2;
            if (ng0Var3.E || ng0Var3.I == null) {
                return;
            }
            AnimatorSet animatorSet = ng0Var3.B;
            if (animatorSet != null) {
                animatorSet.removeAllListeners();
                ng0Var3.B.cancel();
            }
            ng0Var3.E = true;
            ng0Var3.F = true;
            ng0Var3.D = 0.0f;
            ng0Var3.I.getTranslationY();
            org.telegram.messenger.g0.L(100.0f);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addUpdateListener(new mg0(ng0Var3, 5));
            ofFloat.setInterpolator(xq.h);
            ofFloat.setDuration(250L);
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat2.addUpdateListener(new mg0(ng0Var3, 6));
            xq xqVar = xq.j;
            ofFloat2.setInterpolator(xqVar);
            ofFloat2.setDuration(150L);
            ValueAnimator ofFloat3 = ValueAnimator.ofFloat(1.0f, 0.0f);
            ofFloat3.addUpdateListener(new mg0(ng0Var3, 7));
            ofFloat3.setInterpolator(xqVar);
            ofFloat3.setDuration(135L);
            AnimatorSet animatorSet2 = new AnimatorSet();
            ng0Var3.B = animatorSet2;
            animatorSet2.addListener(new a60(ng0Var3, 11));
            AnimatorSet animatorSet3 = new AnimatorSet();
            animatorSet3.playSequentially(ofFloat2, ofFloat3);
            animatorSet3.setStartDelay(180L);
            ng0Var3.B.playTogether(ofFloat, animatorSet3);
            ng0Var3.B.start();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:252:0x0539, code lost:
    
        if (org.telegram.messenger.t3.A(r8, r5, 24) != false) goto L283;
     */
    /* JADX WARN: Code restructure failed: missing block: B:389:0x098b, code lost:
    
        if ((java.lang.System.currentTimeMillis() - r41.C4) > 100) goto L522;
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
    public final boolean i0(int i3, boolean z10) {
        boolean z11;
        int i10;
        org.telegram.ui.Components.u8 u8Var;
        int i11;
        boolean z12;
        boolean z13;
        int i12;
        ImageReceiver imageReceiver;
        boolean z14;
        boolean z15;
        boolean z16;
        int i13;
        boolean z17;
        int i14;
        long j10;
        ImageReceiver imageReceiver2;
        int i15;
        zi ziVar;
        boolean z18;
        boolean z19;
        float f10;
        boolean z20;
        int L;
        TLRPC.User user;
        TLRPC.Chat chat;
        int i16;
        TLRPC.Chat M0;
        ArrayList d42;
        zi ziVar2;
        zi ziVar3;
        boolean z21;
        zi ziVar4;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        HashMap hashMap;
        zi ziVar5;
        boolean z22;
        long j11;
        boolean z23;
        int i23;
        mo moVar;
        int i24;
        mo moVar2;
        mr mrVar;
        mo moVar3;
        String str;
        zi ziVar6;
        int i25;
        zi ziVar7;
        ImageReceiver imageReceiver3;
        boolean W = W();
        boolean z24 = false;
        this.m0 = 0;
        o2 o2Var = this.H0;
        ImageReceiver imageReceiver4 = this.Z1;
        org.telegram.ui.Components.u8 u8Var2 = this.b2;
        int i26 = this.G0;
        if (o2Var != null) {
            this.S0 = o2Var.h;
            int i27 = o2Var.d;
            this.Y0 = i27 != 0;
            this.T0 = i27;
            this.B3 = o2Var.e;
            this.a1 = o2Var.f;
            this.e1 = false;
            this.f1 = false;
            u8Var2.k(o2Var.c, o2Var.a, null, null);
            if (this.G) {
                imageReceiver3 = imageReceiver4;
                imageReceiver3.o0(null, "50_50", this.H, null, 0L);
            } else {
                imageReceiver3 = imageReceiver4;
                imageReceiver3.o0(null, "50_50", u8Var2, null, 0L);
            }
            int i28 = 0;
            while (true) {
                ImageReceiver[] imageReceiverArr = this.W1;
                if (i28 >= imageReceiverArr.length) {
                    break;
                }
                imageReceiverArr[i28].w0(null);
                i28++;
            }
            this.E = false;
            this.F = false;
            imageReceiver3.J0(org.telegram.messenger.g0.L(26.0f));
            this.c1 = false;
            i13 = i26;
            z12 = W;
            z16 = false;
            z17 = false;
            f10 = 0.0f;
        } else {
            ImageReceiver imageReceiver5 = imageReceiver4;
            int i29 = this.T0;
            boolean z25 = this.W0 != 0;
            boolean z26 = this.U0;
            this.e1 = false;
            this.f1 = false;
            this.I4 = -1;
            boolean z27 = this.O0;
            int[] iArr = c00.n;
            if (z27) {
                boolean z28 = true;
                u8Var = u8Var2;
                i11 = 2;
                TLRPC.Dialog dialog = (TLRPC.Dialog) hp.s1(i26).R.f(this.I0);
                if (dialog != null) {
                    this.I4 = dialog.read_outbox_max_id;
                    this.m0 = dialog.ttl_period;
                    if (i3 == 0) {
                        this.i1 = hp.s1(i26).F0.f(dialog.id) != null;
                        ArrayList arrayList = (ArrayList) hp.s1(i26).S.f(dialog.id);
                        this.h1 = arrayList;
                        zi ziVar8 = (arrayList == null || arrayList.size() <= 0) ? null : (zi) this.h1.get(0);
                        this.g1 = ziVar8;
                        this.Y0 = ziVar8 != null && ziVar8.G4();
                        TLRPC.Chat M02 = hp.s1(i26).M0(Long.valueOf(-dialog.id));
                        if (M02 == null || !(M02.forum || (M02.monoforum && org.telegram.messenger.t3.A(i26, M02, 24)))) {
                            i10 = i26;
                            if (dialog instanceof TLRPC.TL_dialogFolder) {
                                this.T0 = qr.a0(i10).M;
                                this.V0 = 0;
                                this.W0 = 0;
                                this.X0 = 0;
                            } else {
                                if (dialog instanceof TLRPC.TL_dialogCommunity) {
                                    imageReceiver5 = imageReceiver5;
                                    ep Q0 = hp.s1(i10).Q0(-dialog.id);
                                    this.T0 = Q0.a;
                                    this.V0 = Q0.b;
                                    this.W0 = Q0.c;
                                    this.X0 = Q0.d;
                                    this.f1 = Q0.e;
                                } else {
                                    imageReceiver5 = imageReceiver5;
                                    this.T0 = dialog.unread_count;
                                    this.V0 = dialog.unread_mentions_count;
                                    this.W0 = dialog.unread_reactions_count;
                                    this.X0 = dialog.unread_poll_votes_count;
                                }
                                if (org.telegram.messenger.t3.p0(M02)) {
                                    this.V0 = 0;
                                }
                                this.U0 = dialog.unread_mark;
                                ziVar6 = this.g1;
                                if (ziVar6 != null) {
                                    int i30 = ziVar6.k.edit_date;
                                }
                                this.S0 = dialog.last_message_date;
                                i25 = this.k1;
                                if (i25 != 7 || i25 == 8) {
                                    mo moVar4 = hp.s1(i10).N[this.k1 != 8 ? (char) 1 : (char) 0];
                                    this.B3 = moVar4 == null && moVar4.j.indexOfKey(dialog.id) >= 0;
                                } else {
                                    this.B3 = this.K0 == 0 && dialog.pinned;
                                }
                                ziVar7 = this.g1;
                                if (ziVar7 != null) {
                                    this.Z0 = ziVar7.k.send_state;
                                }
                            }
                        } else {
                            i10 = i26;
                            hp.s1(i26).q7.h(M02.id);
                            this.T0 = iArr[0];
                            this.V0 = iArr[1];
                            this.W0 = iArr[2];
                            this.e1 = iArr[3] != 0;
                            this.X0 = iArr[4];
                        }
                        imageReceiver5 = imageReceiver5;
                        if (org.telegram.messenger.t3.p0(M02)) {
                        }
                        this.U0 = dialog.unread_mark;
                        ziVar6 = this.g1;
                        if (ziVar6 != null) {
                        }
                        this.S0 = dialog.last_message_date;
                        i25 = this.k1;
                        if (i25 != 7) {
                        }
                        mo moVar42 = hp.s1(i10).N[this.k1 != 8 ? (char) 1 : (char) 0];
                        this.B3 = moVar42 == null && moVar42.j.indexOfKey(dialog.id) >= 0;
                        ziVar7 = this.g1;
                        if (ziVar7 != null) {
                        }
                    } else {
                        i10 = i26;
                    }
                } else {
                    i10 = i26;
                    this.T0 = 0;
                    this.V0 = 0;
                    this.W0 = 0;
                    this.X0 = 0;
                    this.S0 = 0;
                    this.i1 = false;
                }
                z11 = z28;
                if (this.I0 != 0) {
                    int i31 = my0.S;
                    z11 = z28;
                }
            } else {
                z11 = 1;
                i10 = i26;
                u8Var = u8Var2;
                i11 = 2;
                this.B3 = false;
            }
            TLRPC.TL_forumTopic tL_forumTopic = this.O;
            if (tL_forumTopic != null) {
                this.T0 = tL_forumTopic.unread_count;
                this.V0 = tL_forumTopic.unread_mentions_count;
                this.W0 = tL_forumTopic.unread_reactions_count;
                this.X0 = tL_forumTopic.unread_poll_votes_count;
            }
            if (this.k1 == i11) {
                this.B3 = false;
            }
            ui.f fVar = this.u0;
            if (fVar != null) {
                boolean isEmpty = ((ArrayList) fVar.d).isEmpty();
                ui.f fVar2 = this.u0;
                int i32 = this.k1;
                i12 = i29;
                long j12 = this.I0;
                t2 t2Var = (t2) fVar2.b;
                ArrayList arrayList2 = (ArrayList) fVar2.c;
                ArrayList arrayList3 = (ArrayList) fVar2.d;
                z13 = false;
                org.telegram.messenger.c a10 = org.telegram.messenger.c.a(i10);
                hp s12 = hp.s1(i10);
                imageReceiver = imageReceiver5;
                mo[] moVarArr = s12.N;
                if (s12.A7 && h10.i(a10.a).q()) {
                    ArrayList arrayList4 = s12.Q0;
                    if (i32 == 7) {
                        moVar = moVarArr[0];
                        i23 = 8;
                    } else {
                        i23 = 8;
                        moVar = i32 == 8 ? moVarArr[z11] : null;
                    }
                    arrayList2.clear();
                    z12 = W;
                    if (i32 == 0 || i32 == 7 || i32 == i23) {
                        int i33 = 0;
                        while (i33 < arrayList4.size()) {
                            mo moVar5 = (mo) arrayList4.get(i33);
                            if (moVar5 != null) {
                                moVar2 = moVar;
                                i24 = i33;
                                if (moVar5 != moVar2 && moVar5.m >= 0 && moVar5.b(a10, j12)) {
                                    arrayList2.add(moVar5);
                                }
                            } else {
                                i24 = i33;
                                moVar2 = moVar;
                            }
                            i33 = i24 + 1;
                            moVar = moVar2;
                        }
                    }
                    int i34 = 0;
                    z23 = false;
                    while (i34 < arrayList3.size()) {
                        mr mrVar2 = (mr) arrayList3.get(i34);
                        int i35 = 0;
                        while (true) {
                            if (i35 >= arrayList2.size()) {
                                moVar3 = null;
                                break;
                            }
                            if (((mo) arrayList2.get(i35)).a == mrVar2.a) {
                                moVar3 = (mo) arrayList2.get(i35);
                                break;
                            }
                            i35++;
                        }
                        if (moVar3 == null) {
                            arrayList3.remove(i34);
                            i34--;
                        } else {
                            if (moVar3.m != mrVar2.b || ((str = moVar3.b) != null && mrVar2.c != null && str.length() != mrVar2.c.j().length())) {
                                arrayList3.set(i34, mr.b(t2Var, moVar3));
                            }
                            i34++;
                        }
                        z23 = z11;
                        i34++;
                    }
                    for (int i36 = 0; i36 < arrayList2.size(); i36++) {
                        mo moVar6 = (mo) arrayList2.get(i36);
                        int i37 = 0;
                        while (true) {
                            if (i37 >= arrayList3.size()) {
                                mrVar = null;
                                break;
                            }
                            if (((mr) arrayList3.get(i37)).a == moVar6.a) {
                                mrVar = (mr) arrayList3.get(i37);
                                break;
                            }
                            i37++;
                        }
                        if (mrVar == null) {
                            arrayList3.add(i36, mr.b(t2Var, moVar6));
                            z23 = z11;
                        }
                    }
                    arrayList2.clear();
                } else {
                    z12 = W;
                    boolean isEmpty2 = arrayList3.isEmpty();
                    arrayList3.clear();
                    z23 = !isEmpty2;
                }
                if (z23) {
                    z14 = isEmpty != ((ArrayList) this.u0.d).isEmpty() ? z11 : false;
                    z16 = z14;
                    z15 = z11;
                    if (i3 == 0) {
                        TLRPC.User user2 = this.g2;
                        if (user2 != null && !hp.F2(user2) && !this.g2.bot && (i3 & 4) != 0) {
                            this.g2 = hp.s1(i10).a2(Long.valueOf(this.g2.id));
                            if (this.C0 != X()) {
                                z15 = z11;
                            }
                        }
                        int i38 = hp.C8;
                        if ((524288 & i3) != 0) {
                            TLRPC.User user3 = this.g2;
                            org.telegram.ui.Components.e5 e5Var = this.o4;
                            if (user3 != null) {
                                TLRPC.User a22 = hp.s1(i10).a2(Long.valueOf(this.g2.id));
                                this.g2 = a22;
                                if (a22 == null || org.telegram.messenger.m5.f(a22.emoji_status) == 0) {
                                    this.E2 = true;
                                    e5Var.g((Drawable) ha.e.d().f, z10);
                                    e5Var.m(z13, z10);
                                } else {
                                    this.E2 = z11;
                                    e5Var.j(org.telegram.messenger.m5.f(this.g2.emoji_status), z10);
                                    e5Var.m(org.telegram.messenger.m5.B(this.g2.emoji_status), z10);
                                }
                                j11 = org.telegram.messenger.m5.c(this.g2);
                                z22 = true;
                            } else {
                                z22 = z15;
                                j11 = 0;
                            }
                            if (this.h2 != null) {
                                TLRPC.Chat M03 = hp.s1(i10).M0(Long.valueOf(this.h2.id));
                                this.h2 = M03;
                                if (M03 == null || org.telegram.messenger.m5.f(M03.emoji_status) == 0) {
                                    this.E2 = true;
                                    e5Var.g((Drawable) ha.e.d().f, z10);
                                    e5Var.m(false, z10);
                                } else {
                                    this.E2 = true;
                                    e5Var.j(org.telegram.messenger.m5.f(this.h2.emoji_status), z10);
                                    e5Var.m(org.telegram.messenger.m5.B(this.h2.emoji_status), z10);
                                }
                                j11 = org.telegram.messenger.m5.c(this.h2);
                                z22 = true;
                            }
                            org.telegram.ui.Components.e5 e5Var2 = this.p4;
                            if (j11 != 0) {
                                z21 = !this.l4;
                                e5Var2.j(j11, z10);
                            } else {
                                boolean z29 = this.l4;
                                e5Var2.g(null, z10);
                                z21 = z29;
                            }
                            z15 = z22;
                        } else {
                            z21 = false;
                        }
                        if ((this.O0 || this.Q) && (i3 & 64) != 0) {
                            CharSequence D1 = hp.s1(i10).D1(this.I0, getTopicId(), true);
                            CharSequence charSequence = this.j2;
                            if ((charSequence != null && D1 == null) || ((charSequence == null && D1 != null) || (charSequence != null && !charSequence.equals(D1)))) {
                                z21 = true;
                            }
                        }
                        if (!z21 && (32768 & i3) != 0 && (ziVar5 = this.g1) != null && ziVar5.v != this.j1) {
                            z21 = true;
                        }
                        if (!z21 && (i3 & TLObject.FLAG_13) != 0 && this.h2 != null) {
                            TLRPC.Chat M04 = hp.s1(i10).M0(Long.valueOf(this.h2.id));
                            if ((M04 != null && M04.call_active && M04.call_not_empty) != this.w2) {
                                z21 = true;
                            }
                        }
                        if (!z21 && (i3 & 2) != 0) {
                            TLRPC.Chat chat2 = this.h2;
                            if (chat2 == null) {
                                i13 = i10;
                            } else if (chat2.monoforum) {
                                i13 = i10;
                            }
                            s2 s2Var = this.O4;
                            if (s2Var != null && (hashMap = s2Var.f) != null && !hashMap.isEmpty()) {
                                for (Map.Entry entry : s2Var.f.entrySet()) {
                                    ((org.telegram.ui.h5) entry.getValue()).c(((Long) entry.getKey()).longValue());
                                }
                            }
                            z21 = true;
                            if (!z21 && (i3 & 1) != 0 && this.h2 == null) {
                                z21 = true;
                            }
                            if (!z21 && (i3 & 8) != 0 && this.g2 == null) {
                                z21 = true;
                            }
                            if (!z21 && (i3 & 16) != 0 && this.g2 == null) {
                                z21 = true;
                            }
                            if (!z21) {
                                zi ziVar9 = this.g1;
                                if (ziVar9 != null && this.Y0 != ziVar9.G4()) {
                                    this.Y0 = this.g1.G4();
                                    z21 = true;
                                }
                                if (this.O0) {
                                    TLRPC.Dialog dialog2 = (TLRPC.Dialog) hp.s1(i13).R.f(this.I0);
                                    TLRPC.Chat M05 = dialog2 == null ? null : hp.s1(i13).M0(Long.valueOf(-dialog2.id));
                                    if (M05 == null || !(M05.forum || (M05.monoforum && org.telegram.messenger.t3.A(i13, M05, 24)))) {
                                        if (dialog2 instanceof TLRPC.TL_dialogFolder) {
                                            i19 = qr.a0(i13).M;
                                            z17 = z14;
                                        } else if (dialog2 instanceof TLRPC.TL_dialogCommunity) {
                                            ep Q02 = hp.s1(i13).Q0(-dialog2.id);
                                            int i39 = Q02.a;
                                            int i40 = Q02.b;
                                            int i41 = Q02.c;
                                            z17 = z14;
                                            int i42 = Q02.d;
                                            this.f1 = Q02.e;
                                            i19 = i39;
                                            i22 = i40;
                                            i21 = i41;
                                            i20 = i42;
                                        } else {
                                            z17 = z14;
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
                                        hp.s1(i13).q7.h(M05.id);
                                        i19 = iArr[0];
                                        i22 = iArr[1];
                                        i21 = iArr[2];
                                        this.e1 = iArr[3] != 0;
                                        i20 = iArr[4];
                                        z17 = z14;
                                    }
                                    if (org.telegram.messenger.t3.p0(M05)) {
                                        i22 = 0;
                                    }
                                    if (dialog2 != null && (this.T0 != i19 || this.U0 != dialog2.unread_mark || this.V0 != i22 || this.W0 != i21)) {
                                        this.T0 = i19;
                                        this.V0 = i22;
                                        this.U0 = dialog2.unread_mark;
                                        this.W0 = i21;
                                        this.X0 = i20;
                                        z21 = true;
                                    }
                                    if (!z21 && (i3 & TLObject.FLAG_12) != 0 && (ziVar4 = this.g1) != null) {
                                        i17 = this.Z0;
                                        i18 = ziVar4.k.send_state;
                                        if (i17 != i18) {
                                            this.Z0 = i18;
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
                                i17 = this.Z0;
                                i18 = ziVar4.k.send_state;
                                if (i17 != i18) {
                                }
                            }
                            if (!z21) {
                            }
                        }
                        i13 = i10;
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
                        i13 = i10;
                        z17 = z14;
                    }
                    this.g2 = null;
                    this.h2 = null;
                    this.i2 = null;
                    if (this.L0 != 0) {
                        hp s13 = hp.s1(i13);
                        ArrayList arrayList5 = (ArrayList) s13.x.f(this.L0);
                        if (arrayList5 != null) {
                            int size = arrayList5.size();
                            for (int i46 = 0; i46 < size; i46++) {
                                ArrayList arrayList6 = (ArrayList) s13.S.f(((TLRPC.Dialog) arrayList5.get(i46)).id);
                                if (arrayList6 != null && !arrayList6.isEmpty()) {
                                    ziVar3 = (zi) arrayList6.get(0);
                                    break;
                                }
                            }
                        }
                        ziVar3 = null;
                        this.g1 = ziVar3;
                    }
                    i14 = this.K0;
                    if (i14 == 0) {
                        this.a1 = false;
                        this.c1 = false;
                        uw uwVar = this.E4;
                        if (uwVar == null || (d42 = uwVar.d4(i13, this.k1, i14, false)) == null || d42.isEmpty()) {
                            ziVar2 = null;
                        } else {
                            int size2 = d42.size();
                            ziVar2 = null;
                            for (int i47 = 0; i47 < size2; i47++) {
                                TLRPC.Dialog dialog3 = (TLRPC.Dialog) d42.get(i47);
                                a0.h hVar = hp.s1(i13).S;
                                if (hVar != null) {
                                    ArrayList arrayList7 = (ArrayList) hVar.f(dialog3.id);
                                    zi ziVar10 = (arrayList7 == null || arrayList7.isEmpty()) ? null : (zi) arrayList7.get(0);
                                    if (ziVar10 != null && (ziVar2 == null || ziVar10.k.date > ziVar2.k.date)) {
                                        ziVar2 = ziVar10;
                                    }
                                    if (dialog3.pinnedNum == 0 && ziVar2 != null) {
                                        break;
                                    }
                                }
                            }
                        }
                        this.g1 = ziVar2;
                        j10 = ziVar2 != null ? zi.B0(ziVar2.k) : 0L;
                    } else {
                        this.c1 = false;
                        if (this.O != null) {
                            boolean r22 = hp.s1(i13).r2(this.I0, 0L, null);
                            boolean r23 = hp.s1(i13).r2(this.I0, this.O.id, null);
                            this.b1 = r23;
                            if (r22 == r23) {
                                this.a1 = false;
                                this.c1 = false;
                            } else {
                                this.a1 = r23;
                                this.c1 = !r23;
                            }
                        } else {
                            this.a1 = this.O0 && hp.s1(i13).r2(this.I0, (long) getTopicId(), null);
                        }
                        j10 = this.I0;
                    }
                    if (j10 != 0) {
                        if (org.telegram.messenger.m5.C(j10)) {
                            TLRPC.EncryptedChat a12 = hp.s1(i13).a1(Integer.valueOf((int) (j10 & 4294967295L)));
                            this.i2 = a12;
                            if (a12 != null) {
                                this.g2 = hp.s1(i13).a2(Long.valueOf(this.i2.user_id));
                            }
                        } else if (org.telegram.messenger.m5.E(j10)) {
                            this.g2 = hp.s1(i13).a2(Long.valueOf(j10));
                        } else {
                            TLRPC.Chat M06 = hp.s1(i13).M0(Long.valueOf(-j10));
                            this.h2 = M06;
                            if (!this.O0 && M06 != null && M06.migrated_to != null && (M0 = hp.s1(i13).M0(Long.valueOf(this.h2.migrated_to.channel_id))) != null) {
                                this.h2 = M0;
                            }
                        }
                        if (this.v2 && this.g2 != null && this.g1.Q3()) {
                            this.g2 = hp.s1(i13).a2(Long.valueOf(h10.i(i13).n));
                        }
                    }
                    this.F = this.P0 && org.telegram.messenger.t3.Y(this.h2) && this.O0;
                    if (this.K0 == 0) {
                        org.telegram.ui.ActionBar.k6.u1.setCallback(this);
                        org.telegram.ui.Components.u8 u8Var3 = u8Var;
                        i15 = 2;
                        u8Var3.g(2);
                        imageReceiver2 = imageReceiver;
                        imageReceiver2.q0(null, null, u8Var3, null, this.g2, 0);
                    } else {
                        org.telegram.ui.Components.u8 u8Var4 = u8Var;
                        imageReceiver2 = imageReceiver;
                        i15 = 2;
                        if (!this.P || (ziVar = this.g1) == null) {
                            TLRPC.User user4 = this.g2;
                            if (user4 != null) {
                                u8Var4.r(user4);
                                if (l10.z(this.g2)) {
                                    u8Var4.g(12);
                                    imageReceiver2.q0(null, null, u8Var4, null, this.g2, 0);
                                } else if (l10.s(this.g2)) {
                                    u8Var4.g(21);
                                    imageReceiver2.q0(null, null, u8Var4, null, this.g2, 0);
                                } else if (l10.B(this.g2) && this.s0 && !this.r0) {
                                    u8Var4.g(22);
                                    imageReceiver2.q0(null, null, u8Var4, null, this.g2, 0);
                                } else if (!l10.B(this.g2) || this.v2 || this.r0) {
                                    imageReceiver2.j0(this.g2, u8Var4, null, true, 1, false);
                                } else {
                                    u8Var4.g(1);
                                    imageReceiver2.q0(null, null, u8Var4, null, this.g2, 0);
                                }
                            } else {
                                TLRPC.Chat chat3 = this.h2;
                                if (chat3 != null) {
                                    if (chat3.monoforum) {
                                        rg.c.n(i13, chat3, u8Var4, imageReceiver2);
                                        u8Var4.p = 1.0f;
                                    } else {
                                        u8Var4.q(chat3);
                                        imageReceiver2.i0(chat3, u8Var4, null);
                                    }
                                    if (z10 || ((i16 = i12) == this.T0 && z26 == this.U0)) {
                                        z18 = z15;
                                    } else {
                                        if (this.O0) {
                                            z18 = z15;
                                        } else {
                                            z18 = z15;
                                        }
                                        ValueAnimator valueAnimator = this.U3;
                                        if (valueAnimator != null) {
                                            valueAnimator.cancel();
                                        }
                                        float[] fArr = new float[i15];
                                        // fill-array-data instruction
                                        fArr[0] = 0.0f;
                                        fArr[1] = 1.0f;
                                        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
                                        this.U3 = ofFloat;
                                        ofFloat.addUpdateListener(new j2(this, 0));
                                        this.U3.addListener(new n2(this, 0));
                                        if ((i16 == 0 || this.U0) && (this.U0 || !z26)) {
                                            this.U3.setDuration(220L);
                                            this.U3.setInterpolator(new OvershootInterpolator());
                                        } else if (this.T0 == 0) {
                                            this.U3.setDuration(150L);
                                            this.U3.setInterpolator(xq.f);
                                        } else {
                                            this.U3.setDuration(430L);
                                            this.U3.setInterpolator(xq.f);
                                        }
                                        if (this.H3 && this.M3 && this.Y3 != null) {
                                            String format = String.format("%d", Integer.valueOf(i16));
                                            String format2 = String.format("%d", Integer.valueOf(this.T0));
                                            if (format.length() == format2.length()) {
                                                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(format);
                                                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(format2);
                                                SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(format2);
                                                for (int i48 = 0; i48 < format.length(); i48++) {
                                                    if (format.charAt(i48) == format2.charAt(i48)) {
                                                        int i49 = 0;
                                                        int i50 = i48 + 1;
                                                        spannableStringBuilder.setSpan(new fy(i49), i48, i50, 0);
                                                        spannableStringBuilder2.setSpan(new fy(i49), i48, i50, 0);
                                                    } else {
                                                        spannableStringBuilder3.setSpan(new fy(0), i48, i48 + 1, 0);
                                                    }
                                                }
                                                z19 = false;
                                                int max = Math.max(org.telegram.messenger.g0.L(8.0f), (int) Math.ceil(org.telegram.ui.ActionBar.k6.M0.measureText(format)));
                                                TextPaint textPaint = org.telegram.ui.ActionBar.k6.M0;
                                                Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
                                                this.Z3 = new StaticLayout(spannableStringBuilder, textPaint, max, alignment, 1.0f, 0.0f, false);
                                                this.a4 = new StaticLayout(spannableStringBuilder3, org.telegram.ui.ActionBar.k6.M0, max, alignment, 1.0f, 0.0f, false);
                                                this.b4 = new StaticLayout(spannableStringBuilder2, org.telegram.ui.ActionBar.k6.M0, max, alignment, 1.0f, 0.0f, false);
                                            } else {
                                                z19 = false;
                                                this.Z3 = this.Y3;
                                            }
                                        } else {
                                            z19 = false;
                                        }
                                        this.Q3 = this.P3;
                                        this.R3 = this.O3;
                                        this.S3 = this.T0 > i16 ? true : z19;
                                        this.U3.start();
                                        this.T3.a(this.X0 == 0 ? true : z19, z10);
                                        boolean z30 = this.W0 == 0 ? true : z19;
                                        if (z10 || z30 == z25) {
                                            f10 = 0.0f;
                                        } else {
                                            ValueAnimator valueAnimator2 = this.V3;
                                            if (valueAnimator2 != null) {
                                                valueAnimator2.cancel();
                                            }
                                            f10 = 0.0f;
                                            this.X3 = 0.0f;
                                            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                                            this.V3 = ofFloat2;
                                            ofFloat2.addUpdateListener(new j2(this, 1));
                                            this.V3.addListener(new n2(this, 1));
                                            if (z30) {
                                                this.V3.setDuration(220L);
                                                this.V3.setInterpolator(new OvershootInterpolator());
                                            } else {
                                                this.V3.setDuration(150L);
                                                this.V3.setInterpolator(xq.f);
                                            }
                                            this.V3.start();
                                        }
                                        z20 = (V() && (chat = this.h2) != null && chat.monoforum) ? true : z19;
                                        this.E = z20;
                                        if (!z20) {
                                            L = 1;
                                        } else if (this.F) {
                                            L = org.telegram.messenger.g0.L(12.0f);
                                        } else {
                                            TLRPC.Chat chat4 = this.h2;
                                            L = ((chat4 == null || !chat4.forum || this.K0 != 0 || this.P) && (this.s0 || (user = this.g2) == null || !user.self || !hp.s1(i13).o6)) ? org.telegram.messenger.g0.L(28.0f) : org.telegram.messenger.g0.L(16.0f);
                                        }
                                        imageReceiver2.J0(L);
                                        z24 = z18;
                                    }
                                    z19 = false;
                                    this.T3.a(this.X0 == 0 ? true : z19, z10);
                                    if (this.W0 == 0) {
                                    }
                                    if (z10) {
                                    }
                                    f10 = 0.0f;
                                    if (V()) {
                                    }
                                    this.E = z20;
                                    if (!z20) {
                                    }
                                    imageReceiver2.J0(L);
                                    z24 = z18;
                                }
                            }
                        } else {
                            u8Var4.p(ziVar.c1());
                            imageReceiver2.i0(this.g1.c1(), u8Var4, null);
                        }
                    }
                    if (z10) {
                    }
                    z18 = z15;
                    z19 = false;
                    this.T3.a(this.X0 == 0 ? true : z19, z10);
                    if (this.W0 == 0) {
                    }
                    if (z10) {
                    }
                    f10 = 0.0f;
                    if (V()) {
                    }
                    this.E = z20;
                    if (!z20) {
                    }
                    imageReceiver2.J0(L);
                    z24 = z18;
                }
            } else {
                z12 = W;
                z13 = false;
                i12 = i29;
                imageReceiver = imageReceiver5;
            }
            z14 = z13;
            z15 = z14;
            z16 = z15;
            if (i3 == 0) {
            }
            this.g2 = null;
            this.h2 = null;
            this.i2 = null;
            if (this.L0 != 0) {
            }
            i14 = this.K0;
            if (i14 == 0) {
            }
            if (j10 != 0) {
            }
            this.F = this.P0 && org.telegram.messenger.t3.Y(this.h2) && this.O0;
            if (this.K0 == 0) {
            }
            if (z10) {
            }
            z18 = z15;
            z19 = false;
            this.T3.a(this.X0 == 0 ? true : z19, z10);
            if (this.W0 == 0) {
            }
            if (z10) {
            }
            f10 = 0.0f;
            if (V()) {
            }
            this.E = z20;
            if (!z20) {
            }
            imageReceiver2.J0(L);
            z24 = z18;
        }
        if (!this.Q && (getMeasuredWidth() != 0 || getMeasuredHeight() != 0)) {
            z17 = true;
        }
        if (!z24) {
            int i51 = this.v0.y;
            ei.s7.r(hp.s1(i13).P1(), getDialogId());
        }
        if (!z10) {
            this.d1 = (this.a1 || this.c1) ? 1.0f : f10;
            ValueAnimator valueAnimator3 = this.U3;
            if (valueAnimator3 != null) {
                valueAnimator3.cancel();
            }
        }
        invalidate();
        if (W() != z12) {
            z16 = true;
        }
        if (z17) {
            if (this.x3) {
                x();
            } else {
                this.B0 = true;
            }
        }
        k0(z10);
        return z16;
    }

    @Override // org.telegram.ui.Cells.z, android.view.View, org.telegram.ui.Cells.p9
    public final void invalidate() {
        if (ei.r9.y1) {
            return;
        }
        super.invalidate();
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        if (drawable == this.z1 || drawable == org.telegram.ui.ActionBar.k6.u1) {
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
        int i3;
        ?? r14;
        boolean z10;
        TLRPC.PhotoSize photoSize;
        TLRPC.PhotoSize R;
        TLRPC.PhotoSize photoSize2;
        TLRPC.PhotoSize w10;
        boolean z11;
        int i10;
        TLRPC.PhotoSize photoSize3;
        zi ziVar = this.g1;
        if (ziVar == null) {
            return;
        }
        String F1 = hp.s1(ziVar.I1).F1(this.g1.k.restriction_reason);
        zi ziVar2 = this.g1;
        TLRPC.PhotoSize photoSize4 = null;
        int i11 = 3;
        boolean z12 = false;
        if (ziVar2 != null && (message = ziVar2.k) != null) {
            TLRPC.MessageMedia messageMedia = message.media;
            if (messageMedia instanceof TLRPC.TL_messageMediaPaidMedia) {
                this.S1 = 0;
                this.T1 = false;
                TLRPC.TL_messageMediaPaidMedia tL_messageMediaPaidMedia = (TLRPC.TL_messageMediaPaidMedia) messageMedia;
                int i12 = 0;
                int i13 = 0;
                while (i12 < tL_messageMediaPaidMedia.extended_media.size() && this.S1 < i11) {
                    TLRPC.MessageExtendedMedia messageExtendedMedia = tL_messageMediaPaidMedia.extended_media.get(i12);
                    boolean z13 = messageExtendedMedia instanceof TLRPC.TL_messageExtendedMediaPreview;
                    boolean[] zArr = this.Y1;
                    boolean[] zArr2 = this.X1;
                    ImageReceiver[] imageReceiverArr = this.W1;
                    if (z13) {
                        i3 = i13 + 1;
                        TLRPC.PhotoSize photoSize5 = ((TLRPC.TL_messageExtendedMediaPreview) messageExtendedMedia).thumb;
                        if (i13 < i11 && photoSize5 != null) {
                            this.T1 = z12;
                            int i14 = this.S1;
                            if (i14 < i11) {
                                this.S1 = i14 + 1;
                                zArr2[i13] = z12;
                                zArr[i13] = true;
                                imageReceiverArr[i13].r0(ac.f(photoSize5, this.g1.k), "2_2_b", null, null, null, z12 ? 1L : 0L, null, this.g1, 0);
                                imageReceiverArr[i13].J0(org.telegram.messenger.g0.L(2.0f));
                                this.W = z12;
                            }
                        }
                    } else if (messageExtendedMedia instanceof TLRPC.TL_messageExtendedMedia) {
                        i3 = i13 + 1;
                        TLRPC.MessageMedia messageMedia2 = ((TLRPC.TL_messageExtendedMedia) messageExtendedMedia).media;
                        if (messageMedia2 instanceof TLRPC.TL_messageMediaPhoto) {
                            ?? r82 = messageMedia2.photo;
                            r14 = r82.sizes;
                            photoSize3 = r82;
                        } else if (messageMedia2 instanceof TLRPC.TL_messageMediaDocument) {
                            boolean L4 = zi.L4(messageMedia2.document);
                            ?? r83 = messageMedia2.document;
                            z10 = L4;
                            r14 = r83.thumbs;
                            photoSize = r83;
                            R = org.telegram.messenger.w7.R(r14);
                            if (R == null) {
                                R = org.telegram.messenger.w7.w(r14, 40, z12, photoSize4, z12);
                            }
                            photoSize2 = R;
                            w10 = org.telegram.messenger.w7.w(r14, org.telegram.messenger.g0.Z0(z12), z12, photoSize4, true);
                            if (photoSize2 == w10) {
                                w10 = photoSize4;
                            }
                            if (w10 == null) {
                                org.telegram.messenger.z5 q10 = org.telegram.messenger.z5.q(this.G0);
                                int i15 = w10.size;
                                z11 = z12 ? 1 : 0;
                                i10 = i13;
                            } else {
                                z11 = z12 ? 1 : 0;
                                i10 = i13;
                            }
                            w10 = photoSize2;
                            if (photoSize2 != null) {
                                this.T1 = (this.T1 || z10) ? true : z11;
                                int i16 = this.S1;
                                if (i16 < 3) {
                                    this.S1 = i16 + 1;
                                    zArr2[i10] = z10;
                                    zArr[i10] = z11;
                                    imageReceiverArr[i10].r0(ac.f(w10, photoSize), "20_20", ac.f(photoSize2, photoSize), "20_20", null, (long) ((z10 || w10 == null) ? z11 : w10.size), null, this.g1, 0);
                                    imageReceiverArr[i10].J0(org.telegram.messenger.g0.L(2.0f));
                                    this.W = z11;
                                }
                            }
                        } else {
                            TLRPC.PhotoSize photoSize6 = photoSize4;
                            r14 = photoSize6;
                            photoSize3 = photoSize6;
                        }
                        z10 = z12 ? 1 : 0;
                        photoSize = photoSize3;
                        R = org.telegram.messenger.w7.R(r14);
                        if (R == null) {
                        }
                        photoSize2 = R;
                        w10 = org.telegram.messenger.w7.w(r14, org.telegram.messenger.g0.Z0(z12), z12, photoSize4, true);
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
                        z12 = false;
                    }
                    i13 = i3;
                    i12++;
                    photoSize4 = null;
                    i11 = 3;
                    z12 = false;
                }
                return;
            }
        }
        ArrayList arrayList = this.h1;
        if (arrayList != null && arrayList.size() > 1 && TextUtils.isEmpty(F1) && this.K0 == 0 && this.i2 == null) {
            this.S1 = 0;
            this.T1 = false;
            Collections.sort(this.h1, Comparator$-CC.comparingInt(new cg.d(13)));
            for (int i17 = 0; i17 < Math.min(3, this.h1.size()); i17++) {
                zi ziVar3 = (zi) this.h1.get(i17);
                if (ziVar3 != null && !ziVar3.n5() && (zi.T3(ziVar3.k) || ziVar3.M3() || zi.M4(ziVar3.k) || ziVar3.i4() || ziVar3.z4())) {
                    String str = ziVar3.a5() ? ziVar3.k.media.webpage.type : null;
                    if (!"app".equals(str) && !"profile".equals(str) && !"article".equals(str) && (str == null || !str.startsWith("telegram_"))) {
                        g0(i17, ziVar3);
                    }
                }
            }
            return;
        }
        zi ziVar4 = this.g1;
        if (ziVar4 == null || this.K0 != 0) {
            return;
        }
        this.S1 = 0;
        this.T1 = false;
        if (ziVar4.n5()) {
            return;
        }
        if (zi.T3(this.g1.k) || this.g1.M3() || zi.M4(this.g1.k) || this.g1.i4() || this.g1.z4()) {
            String str2 = this.g1.a5() ? this.g1.k.media.webpage.type : null;
            if ("app".equals(str2) || "profile".equals(str2) || "article".equals(str2)) {
                return;
            }
            if (str2 == null || !str2.startsWith("telegram_")) {
                g0(0, this.g1);
            }
        }
    }

    public final void k0(boolean z10) {
        TL_account.RequirementToContact J2 = (this.a5 == null || this.g2 == null) ? null : hp.s1(this.G0).J2(this.g2.id);
        boolean z11 = J2 instanceof TL_account.requirementToContactPremium;
        if (this.o2 == z11 && this.q2 == org.telegram.messenger.m5.k(J2)) {
            return;
        }
        this.o2 = z11;
        this.q2 = org.telegram.messenger.m5.k(J2);
        if (!z10) {
            this.n2.f(this.o2, true);
            this.p2.f(this.q2 > 0, true);
        }
        invalidate();
    }

    public final void m0() {
        if (this.S1 > 0) {
            StaticLayout staticLayout = W() ? this.i3 : this.f3;
            int i3 = W() ? this.d3 : this.c3;
            if (staticLayout == null) {
                return;
            }
            try {
                CharSequence text = staticLayout.getText();
                if (text instanceof Spanned) {
                    r2[] r2VarArr = (r2[]) ((Spanned) text).getSpans(0, text.length(), r2.class);
                    boolean[] zArr = this.V1;
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
                    if (ceil != 0 && !this.y0 && !this.z0) {
                        ceil += org.telegram.messenger.g0.L(3.0f);
                    }
                    for (int i11 = 0; i11 < this.S1; i11++) {
                        this.W1[i11].L0 = i3 + ceil + org.telegram.messenger.g0.L((this.M4 + 2) * i11);
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
        this.Z1.P();
        int i3 = 0;
        while (true) {
            ImageReceiver[] imageReceiverArr = this.W1;
            if (i3 >= imageReceiverArr.length) {
                break;
            }
            imageReceiverArr[i3].P();
            i3++;
        }
        b0();
        this.n3 = org.telegram.ui.Components.p5.update(0, this, this.n3, this.f3);
        this.o3 = org.telegram.ui.Components.p5.update(0, this, this.o3, this.t3);
        this.p3 = org.telegram.ui.Components.p5.update(0, this, this.p3, this.i3);
        this.q3 = org.telegram.ui.Components.p5.update(0, this, this.q3, this.A2);
        org.telegram.ui.Components.e5 e5Var = this.o4;
        if (e5Var != null) {
            e5Var.a();
        }
        org.telegram.ui.Components.e5 e5Var2 = this.p4;
        if (e5Var2 != null) {
            e5Var2.a();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.y1 = false;
        this.B1 = false;
        this.C1 = 0.0f;
        this.x3 = false;
        this.y3 = (getIsPinned() && this.z3) ? 1.0f : 0.0f;
        this.Z1.R();
        int i3 = 0;
        while (true) {
            ImageReceiver[] imageReceiverArr = this.W1;
            if (i3 >= imageReceiverArr.length) {
                break;
            }
            imageReceiverArr[i3].R();
            i3++;
        }
        ch0 ch0Var = this.z1;
        if (ch0Var != null) {
            ch0Var.stop();
            this.z1.T(true, 0.0f);
            this.z1.setCallback(null);
            this.z1 = null;
            this.A1 = false;
        }
        kg.j jVar = this.t4;
        if (jVar != null) {
            jVar.d.remove(Long.valueOf(this.I0));
        }
        org.telegram.ui.Components.e5 e5Var = this.o4;
        if (e5Var != null) {
            e5Var.b();
        }
        org.telegram.ui.Components.e5 e5Var2 = this.p4;
        if (e5Var2 != null) {
            e5Var2.b();
        }
        org.telegram.ui.Components.p5.release(this, this.n3);
        org.telegram.ui.Components.p5.release(this, this.o3);
        org.telegram.ui.Components.p5.release(this, this.p3);
        org.telegram.ui.Components.p5.release(this, this.q3);
        this.v0.g();
        this.d0 = null;
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
        boolean z10;
        int w02;
        int w03;
        int i3;
        String L0;
        String str;
        int i10;
        int i11;
        float f11;
        int i12;
        org.telegram.ui.ActionBar.e6 e6Var;
        boolean z11;
        ai.x2 x2Var;
        b5.c cVar;
        String str2;
        float f12;
        int i13;
        String str3;
        float f13;
        b5.c cVar2;
        float f14;
        b5.c cVar3;
        String str4;
        int ceil;
        int i14;
        StaticLayout staticLayout;
        float f15;
        boolean z12;
        ch0 ch0Var;
        float f16;
        float f17;
        org.telegram.ui.ActionBar.e6 e6Var2;
        float f18;
        t2 t2Var;
        int i15;
        org.telegram.ui.ActionBar.e6 e6Var3;
        b5.c cVar4;
        ai.x2 x2Var2;
        ?? r12;
        float f19;
        int i16;
        boolean z13;
        int i17;
        boolean z14;
        ImageReceiver imageReceiver;
        boolean z15;
        m2 m2Var;
        t2 t2Var2;
        float f20;
        int i18;
        Canvas canvas2;
        boolean z16;
        float f21;
        TLRPC.TL_forumTopic tL_forumTopic;
        TLRPC.Chat chat;
        TLRPC.User user;
        TLRPC.TL_forumTopic tL_forumTopic2;
        ng0 ng0Var;
        q2 q2Var;
        float f22;
        float f23;
        int i19;
        int i20;
        float f24;
        int i21;
        boolean z17;
        int i22;
        q2 q2Var2;
        int i23;
        RectF rectF;
        org.telegram.ui.ActionBar.e6 e6Var4;
        q2 q2Var3;
        float f25;
        boolean z18;
        t2 t2Var3;
        boolean z19;
        float f26;
        ui.f fVar;
        int i24;
        float L;
        float f27;
        boolean z20;
        boolean z21;
        boolean z22;
        int i25;
        float f28;
        float y9;
        StaticLayout staticLayout2;
        int i26;
        nu0 u02;
        int i27;
        o2 o2Var;
        uw uwVar;
        pv pvVar;
        TLRPC.TL_forumTopic tL_forumTopic3;
        ng0 ng0Var2;
        TLRPC.TL_forumTopic tL_forumTopic4;
        final t2 t2Var4 = this;
        Canvas canvas3 = canvas;
        if ((t2Var4.I0 == 0 && t2Var4.H0 == null) || !t2Var4.A0) {
            return;
        }
        boolean z23 = t2Var4.h;
        ai.x2 x2Var3 = t2Var4.n4;
        if (z23 && ((t2Var4.K0 != 0 || (t2Var4.Q && (tL_forumTopic4 = t2Var4.O) != null && tL_forumTopic4.id == 1)) && (ng0Var2 = t2Var4.f2) != null && ng0Var2.C == 0.0f && t2Var4.x1 == 0.0f)) {
            canvas3.save();
            canvas3.translate(0.0f, (-t2Var4.F3) - t2Var4.n);
            canvas3.clipRect(0.0f, (1.0f - t2Var4.f2.J) * t2Var4.getMeasuredHeight(), t2Var4.getMeasuredWidth(), t2Var4.getMeasuredHeight());
            t2Var4.f2.c(canvas3, false);
            canvas3.restore();
            x2Var3.setVisibility(4);
            return;
        }
        boolean z24 = z23 && (t2Var4.K0 != 0 || (t2Var4.Q && (tL_forumTopic3 = t2Var4.O) != null && tL_forumTopic3.id == 1)) && t2Var4.f2 != null && t2Var4.x1 == 0.0f && (uwVar = t2Var4.E4) != null && uwVar.l4() && ((pvVar = uwVar.G3) == null || !pvVar.c());
        ng0 ng0Var3 = t2Var4.f2;
        float f29 = ng0Var3 != null ? ng0Var3.J : 1.0f;
        if (z24) {
            canvas3.save();
            canvas3.clipRect(0.0f, (1.0f - f29) * t2Var4.getMeasuredHeight(), t2Var4.getMeasuredWidth(), t2Var4.getMeasuredHeight());
        }
        if (t2Var4.u1 != 0.0f && Build.VERSION.SDK_INT != 24) {
            canvas3.save();
            canvas3.clipRect(0.0f, t2Var4.v1 * t2Var4.u1, t2Var4.getMeasuredWidth(), t2Var4.getMeasuredHeight() - ((int) (t2Var4.w1 * t2Var4.u1)));
        }
        float f30 = t2Var4.x1;
        b5.c cVar5 = t2Var4.e2;
        org.telegram.ui.ActionBar.e6 e6Var5 = t2Var4.K4;
        if (f30 == 0.0f && t2Var4.p1 == 0.0f) {
            ch0 ch0Var2 = t2Var4.z1;
            if (ch0Var2 != null) {
                ch0Var2.stop();
                t2Var4.z1.T(true, 0.0f);
                t2Var4.z1.setCallback(null);
                t2Var4.z1 = null;
                t2Var4.A1 = false;
            }
            f10 = 1.0f;
            e6Var = e6Var5;
            z11 = z23;
            x2Var = x2Var3;
            f15 = 2.0f;
            cVar3 = cVar5;
        } else {
            canvas3.save();
            canvas3.translate(0.0f, -t2Var4.F3);
            if (t2Var4.M1) {
                w02 = org.telegram.ui.ActionBar.k6.w0(t2Var4.N1, e6Var5);
                w03 = org.telegram.ui.ActionBar.k6.w0(t2Var4.O1, e6Var5);
                String str5 = t2Var4.P1;
                f10 = 1.0f;
                i3 = t2Var4.Q1;
                L0 = bd.M0(i3, str5);
                z10 = false;
                t2Var4.z1 = t2Var4.R1;
            } else {
                f10 = 1.0f;
                z10 = false;
                if (t2Var4.K0 != 0) {
                    if (t2Var4.n1) {
                        w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.d9, e6Var5);
                        w03 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.c9, e6Var5);
                        i3 = 2131743893;
                        L0 = bd.L0(2131743893);
                        t2Var4.z1 = org.telegram.ui.ActionBar.k6.y1;
                    } else {
                        w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.c9, e6Var5);
                        w03 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.d9, e6Var5);
                        i3 = 2131749324;
                        L0 = bd.L0(2131749324);
                        t2Var4.z1 = org.telegram.ui.ActionBar.k6.x1;
                    }
                } else if (t2Var4.Q2) {
                    w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.c9, e6Var5);
                    w03 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.d9, e6Var5);
                    i3 = 2131746607;
                    L0 = bd.L0(2131746607);
                    t2Var4.z1 = org.telegram.ui.ActionBar.k6.z1;
                } else if (t2Var4.l1 == 0) {
                    w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.c9, e6Var5);
                    w03 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.d9, e6Var5);
                    if (org.telegram.messenger.t3.Y(t2Var4.h2)) {
                        String L02 = bd.L0(2131744314);
                        w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Y5, e6Var5);
                        t2Var4.z1 = org.telegram.ui.ActionBar.k6.K1;
                        str = L02;
                        i10 = 2131744314;
                        i11 = w02;
                        if (t2Var4.x || (ch0Var = t2Var4.s) == null) {
                            t2Var4.s = t2Var4.z1;
                            t2Var4.w = i10;
                        } else {
                            t2Var4.z1 = ch0Var;
                            i10 = t2Var4.w;
                        }
                        if (!t2Var4.A1 && Math.abs(t2Var4.x1) > org.telegram.messenger.g0.L(43.0f)) {
                            t2Var4.A1 = true;
                            t2Var4.z1.T(true, 0.0f);
                            t2Var4.z1.setCallback(t2Var4);
                            t2Var4.z1.start();
                        }
                        float measuredWidth = t2Var4.getMeasuredWidth() + t2Var4.x1;
                        if (t2Var4.C1 >= f10) {
                            org.telegram.ui.ActionBar.k6.v0.setColor(w02);
                            i12 = i10;
                            e6Var = e6Var5;
                            z11 = z23;
                            x2Var = x2Var3;
                            cVar = cVar5;
                            f12 = measuredWidth;
                            str2 = "Arrow";
                            f11 = 0.0f;
                            canvas3.drawRect(measuredWidth - org.telegram.messenger.g0.L(8.0f), 0.0f, t2Var4.getMeasuredWidth(), t2Var4.getMeasuredHeight(), org.telegram.ui.ActionBar.k6.v0);
                            if (t2Var4.C1 == 0.0f) {
                                if (org.telegram.ui.ActionBar.k6.A1) {
                                    org.telegram.ui.ActionBar.k6.v1.Q(org.telegram.ui.ActionBar.k6.H0(org.telegram.ui.ActionBar.k6.c9), str2);
                                    org.telegram.ui.ActionBar.k6.A1 = z10;
                                }
                                if (org.telegram.ui.ActionBar.k6.B1) {
                                    ch0 ch0Var3 = org.telegram.ui.ActionBar.k6.z1;
                                    ch0Var3.a0 = true;
                                    int i28 = org.telegram.ui.ActionBar.k6.c9;
                                    ch0Var3.Q(org.telegram.ui.ActionBar.k6.H0(i28), "Line 1");
                                    org.telegram.ui.ActionBar.k6.z1.Q(org.telegram.ui.ActionBar.k6.H0(i28), "Line 2");
                                    org.telegram.ui.ActionBar.k6.z1.Q(org.telegram.ui.ActionBar.k6.H0(i28), "Line 3");
                                    org.telegram.ui.ActionBar.k6.z1.o();
                                    org.telegram.ui.ActionBar.k6.B1 = z10;
                                }
                            }
                        } else {
                            f11 = 0.0f;
                            i12 = i10;
                            e6Var = e6Var5;
                            z11 = z23;
                            x2Var = x2Var3;
                            cVar = cVar5;
                            str2 = "Arrow";
                            f12 = measuredWidth;
                        }
                        int measuredWidth2 = (t2Var4.getMeasuredWidth() - org.telegram.messenger.g0.L(43.0f)) - (t2Var4.z1.getIntrinsicWidth() / 2);
                        int y10 = org.telegram.messenger.camera.q.y(52.0f, t2Var4.getMeasuredHeight(), 2);
                        int intrinsicWidth = (t2Var4.z1.getIntrinsicWidth() / 2) + measuredWidth2;
                        int intrinsicHeight = (t2Var4.z1.getIntrinsicHeight() / 2) + y10;
                        if (t2Var4.C1 <= f11) {
                            canvas3.save();
                            i13 = i12;
                            str3 = str;
                            f13 = f12;
                            canvas3.clipRect(f12 - org.telegram.messenger.g0.L(8.0f), f11, t2Var4.getMeasuredWidth(), t2Var4.getMeasuredHeight());
                            org.telegram.ui.ActionBar.k6.v0.setColor(i11);
                            cVar2 = cVar;
                            canvas3.drawCircle(intrinsicWidth, intrinsicHeight, org.telegram.messenger.g0.G.getInterpolation(t2Var4.C1) * ((float) Math.sqrt(((intrinsicHeight - t2Var4.getMeasuredHeight()) * (intrinsicHeight - t2Var4.getMeasuredHeight())) + (intrinsicWidth * intrinsicWidth))), org.telegram.ui.ActionBar.k6.v0);
                            canvas3.restore();
                            if (org.telegram.ui.ActionBar.k6.A1) {
                                z12 = true;
                            } else {
                                org.telegram.ui.ActionBar.k6.v1.Q(org.telegram.ui.ActionBar.k6.H0(org.telegram.ui.ActionBar.k6.d9), str2);
                                z12 = true;
                                org.telegram.ui.ActionBar.k6.A1 = true;
                            }
                            if (!org.telegram.ui.ActionBar.k6.B1) {
                                ch0 ch0Var4 = org.telegram.ui.ActionBar.k6.z1;
                                ch0Var4.a0 = z12;
                                int i29 = org.telegram.ui.ActionBar.k6.d9;
                                ch0Var4.Q(org.telegram.ui.ActionBar.k6.H0(i29), "Line 1");
                                org.telegram.ui.ActionBar.k6.z1.Q(org.telegram.ui.ActionBar.k6.H0(i29), "Line 2");
                                org.telegram.ui.ActionBar.k6.z1.Q(org.telegram.ui.ActionBar.k6.H0(i29), "Line 3");
                                org.telegram.ui.ActionBar.k6.z1.o();
                                org.telegram.ui.ActionBar.k6.B1 = true;
                            }
                        } else {
                            i13 = i12;
                            str3 = str;
                            f13 = f12;
                            cVar2 = cVar;
                        }
                        canvas3.save();
                        canvas3.translate(measuredWidth2, y10);
                        f14 = t2Var4.D1;
                        if (f14 != 0.0f || f14 == f10) {
                            cVar3 = cVar2;
                        } else {
                            cVar3 = cVar2;
                            float interpolation = cVar3.getInterpolation(f14) + f10;
                            canvas3.scale(interpolation, interpolation, t2Var4.z1.getIntrinsicWidth() / 2, t2Var4.z1.getIntrinsicHeight() / 2);
                        }
                        boolean z25 = z10;
                        z.s(z25 ? 1 : 0, z25 ? 1 : 0, t2Var4.z1);
                        t2Var4.z1.draw(canvas3);
                        canvas3.restore();
                        canvas3.clipRect(f13, 0.0f, t2Var4.getMeasuredWidth(), t2Var4.getMeasuredHeight());
                        str4 = str3;
                        ceil = (int) Math.ceil(org.telegram.ui.ActionBar.k6.M0.measureText(str4));
                        i14 = i13;
                        if (t2Var4.G4 == i14 || t2Var4.H4 != t2Var4.getMeasuredWidth()) {
                            t2Var4.G4 = i14;
                            t2Var4.H4 = t2Var4.getMeasuredWidth();
                            TextPaint textPaint = org.telegram.ui.ActionBar.k6.N0;
                            int min = Math.min(org.telegram.messenger.g0.L(80.0f), ceil);
                            Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
                            staticLayout = new StaticLayout(str4, textPaint, min, alignment, 1.0f, 0.0f, false);
                            t2Var4.F4 = staticLayout;
                            if (staticLayout.getLineCount() > 1) {
                                t2Var4.F4 = new StaticLayout(str4, org.telegram.ui.ActionBar.k6.O0, Math.min(org.telegram.messenger.g0.L(82.0f), ceil), alignment, 1.0f, 0.0f, false);
                            }
                        }
                        if (t2Var4.F4 == null) {
                            canvas3.save();
                            f15 = 2.0f;
                            canvas3.translate((t2Var4.getMeasuredWidth() - org.telegram.messenger.g0.L(43.0f)) - (t2Var4.F4.getWidth() / 2.0f), org.telegram.messenger.g0.L(36.0f) + y10 + (t2Var4.F4.getLineCount() > 1 ? -org.telegram.messenger.g0.L(4.0f) : 0.0f));
                            t2Var4.F4.draw(canvas3);
                            canvas3.restore();
                        } else {
                            f15 = 2.0f;
                        }
                        canvas3.restore();
                    } else {
                        int i30 = t2Var4.G0;
                        if (az.m(i30) == 3) {
                            if (t2Var4.a1) {
                                i3 = 2131744313;
                                L0 = bd.L0(2131744313);
                                t2Var4.z1 = org.telegram.ui.ActionBar.k6.I1;
                            } else {
                                i3 = 2131744331;
                                L0 = bd.L0(2131744331);
                                t2Var4.z1 = org.telegram.ui.ActionBar.k6.H1;
                            }
                        } else if (az.m(i30) == 4) {
                            i3 = 2131744334;
                            L0 = bd.L0(2131744334);
                            w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Y5, e6Var5);
                            t2Var4.z1 = org.telegram.ui.ActionBar.k6.J1;
                        } else if (az.m(i30) == 1) {
                            if (t2Var4.T0 > 0 || t2Var4.U0) {
                                i3 = 2131744333;
                                L0 = bd.L0(2131744333);
                                t2Var4.z1 = org.telegram.ui.ActionBar.k6.L1;
                            } else {
                                i3 = 2131744332;
                                L0 = bd.L0(2131744332);
                                t2Var4.z1 = org.telegram.ui.ActionBar.k6.M1;
                            }
                        } else if (az.m(i30) != 0) {
                            i3 = 2131754172;
                            L0 = bd.L0(2131754172);
                            t2Var4.z1 = org.telegram.ui.ActionBar.k6.v1;
                        } else if (t2Var4.getIsPinned()) {
                            i3 = 2131744312;
                            L0 = bd.L0(2131744312);
                            t2Var4.z1 = org.telegram.ui.ActionBar.k6.O1;
                        } else {
                            i3 = 2131744330;
                            L0 = bd.L0(2131744330);
                            t2Var4.z1 = org.telegram.ui.ActionBar.k6.N1;
                        }
                    }
                } else {
                    w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.d9, e6Var5);
                    w03 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.c9, e6Var5);
                    i3 = 2131743925;
                    L0 = bd.L0(2131743925);
                    t2Var4.z1 = org.telegram.ui.ActionBar.k6.w1;
                }
            }
            int i31 = i3;
            i11 = w03;
            i10 = i31;
            str = L0;
            if (t2Var4.x) {
            }
            t2Var4.s = t2Var4.z1;
            t2Var4.w = i10;
            if (!t2Var4.A1) {
                t2Var4.A1 = true;
                t2Var4.z1.T(true, 0.0f);
                t2Var4.z1.setCallback(t2Var4);
                t2Var4.z1.start();
            }
            float measuredWidth3 = t2Var4.getMeasuredWidth() + t2Var4.x1;
            if (t2Var4.C1 >= f10) {
            }
            int measuredWidth22 = (t2Var4.getMeasuredWidth() - org.telegram.messenger.g0.L(43.0f)) - (t2Var4.z1.getIntrinsicWidth() / 2);
            int y102 = org.telegram.messenger.camera.q.y(52.0f, t2Var4.getMeasuredHeight(), 2);
            int intrinsicWidth2 = (t2Var4.z1.getIntrinsicWidth() / 2) + measuredWidth22;
            int intrinsicHeight2 = (t2Var4.z1.getIntrinsicHeight() / 2) + y102;
            if (t2Var4.C1 <= f11) {
            }
            canvas3.save();
            canvas3.translate(measuredWidth22, y102);
            f14 = t2Var4.D1;
            if (f14 != 0.0f) {
            }
            cVar3 = cVar2;
            boolean z252 = z10;
            z.s(z252 ? 1 : 0, z252 ? 1 : 0, t2Var4.z1);
            t2Var4.z1.draw(canvas3);
            canvas3.restore();
            canvas3.clipRect(f13, 0.0f, t2Var4.getMeasuredWidth(), t2Var4.getMeasuredHeight());
            str4 = str3;
            ceil = (int) Math.ceil(org.telegram.ui.ActionBar.k6.M0.measureText(str4));
            i14 = i13;
            if (t2Var4.G4 == i14) {
            }
            t2Var4.G4 = i14;
            t2Var4.H4 = t2Var4.getMeasuredWidth();
            TextPaint textPaint2 = org.telegram.ui.ActionBar.k6.N0;
            int min2 = Math.min(org.telegram.messenger.g0.L(80.0f), ceil);
            Layout.Alignment alignment2 = Layout.Alignment.ALIGN_CENTER;
            staticLayout = new StaticLayout(str4, textPaint2, min2, alignment2, 1.0f, 0.0f, false);
            t2Var4.F4 = staticLayout;
            if (staticLayout.getLineCount() > 1) {
            }
            if (t2Var4.F4 == null) {
            }
            canvas3.restore();
        }
        if (t2Var4.x1 != 0.0f) {
            canvas3.save();
            canvas3.translate(t2Var4.x1, 0.0f);
            f16 = 0.0f + t2Var4.x1;
        } else {
            f16 = 0.0f;
        }
        float L2 = org.telegram.messenger.g0.L(8.0f) * t2Var4.p1;
        boolean z26 = t2Var4.r4;
        RectF rectF2 = t2Var4.s4;
        if (z26) {
            f17 = 0.0f;
            rectF2.set(0.0f, 0.0f, t2Var4.getMeasuredWidth(), org.telegram.messenger.g0.W1(t2Var4.j0, t2Var4.getMeasuredHeight(), t2Var4.getCollapsedHeight()));
            rectF2.offset(0.0f, (-t2Var4.F3) + t2Var4.D0);
            canvas3.drawRoundRect(rectF2, L2, L2, org.telegram.ui.ActionBar.k6.u0);
        } else {
            f17 = 0.0f;
        }
        canvas3.save();
        canvas3.translate(f17, (-t2Var4.n) * t2Var4.j0);
        if (t2Var4.K0 == 0 || (az.q1 && t2Var4.E1 == f17)) {
            e6Var2 = e6Var;
            if (t2Var4.getIsPinned() || t2Var4.A3) {
                org.telegram.ui.ActionBar.k6.v0.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.s9, e6Var2));
                org.telegram.ui.ActionBar.k6.v0.setAlpha((int) ((1.0f - t2Var4.j0) * r3.getAlpha()));
            }
        } else {
            e6Var2 = e6Var;
            float f31 = f10;
            org.telegram.ui.ActionBar.k6.v0.setColor(org.telegram.messenger.g0.S0(t2Var4.E1, f31, 0, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.s9, e6Var2)));
            org.telegram.ui.ActionBar.k6.v0.setAlpha((int) ((f31 - t2Var4.j0) * r3.getAlpha()));
        }
        canvas3.restore();
        q2 q2Var4 = t2Var4.J4;
        q2Var4.b();
        if (t2Var4.D0 != 0.0f) {
            canvas3.save();
            canvas3.translate(0.0f, t2Var4.D0);
            f18 = t2Var4.D0 + 0.0f;
        } else {
            f18 = 0.0f;
        }
        float f32 = t2Var4.j0;
        if (f32 != 1.0f) {
            int i32 = -1;
            if (f32 != 0.0f) {
                float i33 = Utilities.i(f32 / 0.4f, 1.0f, 0.0f);
                if (az.o() >= 2) {
                    f22 = f15;
                    i20 = -1;
                    q2Var = q2Var4;
                    f23 = 1.0f;
                    i32 = canvas3.saveLayerAlpha(a1.g.D(1.0f, i33, org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(my0.getRightPaddingSize() + 1)), 0.0f, t2Var4.getMeasuredWidth(), t2Var4.getMeasuredHeight(), (int) ((1.0f - t2Var4.j0) * 255.0f), 31);
                    i19 = 1;
                } else {
                    q2Var = q2Var4;
                    f22 = f15;
                    i20 = -1;
                    f23 = 1.0f;
                    int save = canvas3.save();
                    i19 = 1;
                    canvas3.clipRect(a1.g.D(1.0f, i33, org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(my0.getRightPaddingSize() + 1)), 0.0f, t2Var4.getMeasuredWidth(), t2Var4.getMeasuredHeight());
                    i32 = save;
                }
                canvas3.translate((-(t2Var4.getMeasuredWidth() - org.telegram.messenger.g0.L(74.0f))) * 0.7f * t2Var4.j0, 0.0f);
                f16 += (-(t2Var4.getMeasuredWidth() - org.telegram.messenger.g0.L(74.0f))) * 0.7f * t2Var4.j0;
            } else {
                q2Var = q2Var4;
                f22 = f15;
                f23 = 1.0f;
                i19 = 1;
                i20 = -1;
            }
            float f33 = f16;
            if (t2Var4.x1 != 0.0f || t2Var4.p1 != 0.0f) {
                canvas3.save();
                org.telegram.ui.ActionBar.k6.v0.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.d6, e6Var2));
                rectF2.set(t2Var4.getMeasuredWidth() - org.telegram.messenger.g0.L(64.0f), 0.0f, t2Var4.getMeasuredWidth(), t2Var4.getMeasuredHeight());
                rectF2.offset(0.0f, -t2Var4.F3);
                canvas3.drawRoundRect(rectF2, L2, L2, org.telegram.ui.ActionBar.k6.v0);
                if (t2Var4.r4) {
                    canvas3.drawRoundRect(rectF2, L2, L2, org.telegram.ui.ActionBar.k6.u0);
                }
                if (t2Var4.K0 != 0 && (!az.q1 || t2Var4.E1 != 0.0f)) {
                    org.telegram.ui.ActionBar.k6.v0.setColor(org.telegram.messenger.g0.S0(t2Var4.E1, f23, 0, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.s9, e6Var2)));
                    org.telegram.ui.ActionBar.k6.v0.setAlpha((int) ((f23 - t2Var4.j0) * r0.getAlpha()));
                } else if (t2Var4.getIsPinned() || t2Var4.A3) {
                    org.telegram.ui.ActionBar.k6.v0.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.s9, e6Var2));
                    org.telegram.ui.ActionBar.k6.v0.setAlpha((int) ((f23 - t2Var4.j0) * r0.getAlpha()));
                }
                canvas3.restore();
            }
            if (t2Var4.x1 != 0.0f) {
                float f34 = t2Var4.p1;
                if (f34 < f23) {
                    float f35 = f34 + 0.10666667f;
                    t2Var4.p1 = f35;
                    if (f35 > f23) {
                        t2Var4.p1 = f23;
                    }
                    i17 = i19;
                }
                i17 = 0;
            } else {
                float f36 = t2Var4.p1;
                if (f36 > 0.0f) {
                    float f37 = f36 - 0.10666667f;
                    t2Var4.p1 = f37;
                    if (f37 < 0.0f) {
                        t2Var4.p1 = 0.0f;
                    }
                    i17 = i19;
                }
                i17 = 0;
            }
            if (t2Var4.H2) {
                z.s(t2Var4.K2, t2Var4.L2, org.telegram.ui.ActionBar.k6.a1);
                org.telegram.ui.ActionBar.k6.a1.draw(canvas3);
            }
            boolean z27 = t2Var4.s2;
            int L3 = org.telegram.messenger.g0.L((z27 || az.p1) ? 10.0f : 14.0f);
            if (((!z27 && !az.p1) || t2Var4.W()) && t2Var4.S()) {
                L3 -= org.telegram.messenger.g0.L(t2Var4.W() ? 8.0f : 9.0f);
            }
            if (t2Var4.A2 != null) {
                if (!t2Var4.E2 || t2Var4.B2) {
                    f24 = 24.0f;
                    i21 = i32;
                } else {
                    if (t2Var4.D2 && t2Var4.F2 == null) {
                        Paint paint = new Paint();
                        t2Var4.F2 = paint;
                        paint.setShader(new LinearGradient(0.0f, 0.0f, org.telegram.messenger.g0.L(24.0f), 0.0f, new int[]{i20, 0}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
                        t2Var4.F2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                    } else if (t2Var4.G2 == null) {
                        Paint paint2 = new Paint();
                        t2Var4.G2 = paint2;
                        paint2.setShader(new LinearGradient(0.0f, 0.0f, org.telegram.messenger.g0.L(24.0f), 0.0f, new int[]{0, i20}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
                        t2Var4.G2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                    }
                    f24 = 24.0f;
                    i21 = i32;
                    canvas3.saveLayerAlpha(0.0f, 0.0f, t2Var4.getMeasuredWidth(), t2Var4.getMeasuredHeight(), hs.e4, 31);
                    int i34 = t2Var4.y2;
                    canvas3.clipRect(i34, 0, t2Var4.z2 + i34, t2Var4.getMeasuredHeight());
                }
                if (t2Var4.K0 != 0) {
                    TextPaint textPaint3 = org.telegram.ui.ActionBar.k6.B0[t2Var4.F0];
                    int w04 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Y8, e6Var2);
                    textPaint3.linkColor = w04;
                    textPaint3.setColor(w04);
                } else if (t2Var4.i2 != null || ((o2Var = t2Var4.H0) != null && o2Var.g == 2)) {
                    TextPaint textPaint4 = org.telegram.ui.ActionBar.k6.B0[t2Var4.F0];
                    int w05 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Z8, e6Var2);
                    textPaint4.linkColor = w05;
                    textPaint4.setColor(w05);
                } else {
                    TextPaint textPaint5 = org.telegram.ui.ActionBar.k6.B0[t2Var4.F0];
                    int w06 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.X8, e6Var2);
                    textPaint5.linkColor = w06;
                    textPaint5.setColor(w06);
                }
                canvas3.save();
                canvas3.translate(t2Var4.y2 + t2Var4.C2, L3);
                yh.f.f(canvas3, t2Var4.A2);
                StaticLayout staticLayout3 = t2Var4.A2;
                z17 = z27;
                i22 = i20;
                q2Var2 = q2Var;
                i23 = i19;
                org.telegram.ui.Components.p5.drawAnimatedEmojis(canvas3, staticLayout3, t2Var4.q3, -0.075f, null, 0.0f, 0.0f, 0.0f, 1.0f, t2Var4.Q(0, staticLayout3.getPaint().getColor()));
                canvas3.restore();
                if (t2Var4.E2 && !t2Var4.B2) {
                    canvas3.save();
                    if (t2Var4.D2) {
                        canvas3.translate(t2Var4.y2, 0.0f);
                        canvas3.drawRect(0.0f, 0.0f, org.telegram.messenger.g0.L(f24), t2Var4.getMeasuredHeight(), t2Var4.F2);
                    } else {
                        canvas3.translate((t2Var4.y2 + t2Var4.z2) - org.telegram.messenger.g0.L(f24), 0.0f);
                        canvas3.drawRect(0.0f, 0.0f, org.telegram.messenger.g0.L(f24), t2Var4.getMeasuredHeight(), t2Var4.G2);
                    }
                    canvas3.restore();
                    canvas3.restore();
                }
            } else {
                f24 = 24.0f;
                i21 = i32;
                z17 = z27;
                i22 = i20;
                q2Var2 = q2Var;
                i23 = i19;
            }
            if (t2Var4.O2 != null && t2Var4.K0 == 0) {
                canvas3.save();
                canvas3.translate(t2Var4.M2, t2Var4.N2);
                TextPaint timeTextPaint = t2Var4.getTimeTextPaint();
                if (t2Var4.getIsPinned()) {
                    canvas3.translate(org.telegram.messenger.g0.L(20.0f), 0.0f);
                    float height = (t2Var4.O2.getHeight() / f22) - org.telegram.messenger.g0.L(8.5f);
                    float f38 = -org.telegram.messenger.g0.L(20.0f);
                    float L4 = org.telegram.messenger.g0.L(6.0f) + t2Var4.O2.getWidth();
                    Drawable drawable = (!t2Var4.H3 || t2Var4.T()) ? org.telegram.ui.ActionBar.k6.k1 : org.telegram.ui.ActionBar.k6.l1;
                    int L5 = (int) (((org.telegram.messenger.g0.L(17.0f) - drawable.getIntrinsicHeight()) / f22) + height);
                    int L6 = org.telegram.messenger.g0.L(4.0f) + ((int) f38);
                    drawable.setBounds(L6, L5, drawable.getIntrinsicWidth() + L6, drawable.getIntrinsicHeight() + L5);
                    int alpha = timeTextPaint.getAlpha();
                    timeTextPaint.setAlpha(27);
                    canvas3.drawRoundRect(f38, height, L4, height + org.telegram.messenger.g0.L(17.0f), org.telegram.messenger.g0.L(8.5f), org.telegram.messenger.g0.L(8.5f), timeTextPaint);
                    timeTextPaint.setAlpha(alpha);
                    drawable.draw(canvas3);
                }
                int color = t2Var4.O2.getPaint().getColor();
                int i35 = color != timeTextPaint.getColor() ? i23 : 0;
                if (i35 != 0) {
                    t2Var4.O2.getPaint().setColor(timeTextPaint.getColor());
                }
                yh.f.f(canvas3, t2Var4.O2);
                if (i35 != 0) {
                    t2Var4.O2.getPaint().setColor(color);
                }
                canvas3.restore();
            }
            if (t2Var4.K()) {
                org.telegram.ui.ActionBar.k6.b1.setBounds(t2Var4.P2, ((t2Var4.O2.getHeight() - org.telegram.ui.ActionBar.k6.b1.getIntrinsicHeight()) / 2) + t2Var4.N2, org.telegram.ui.ActionBar.k6.b1.getIntrinsicWidth() + t2Var4.P2, org.telegram.ui.ActionBar.k6.b1.getIntrinsicHeight() + ((t2Var4.O2.getHeight() - org.telegram.ui.ActionBar.k6.b1.getIntrinsicHeight()) / 2) + t2Var4.N2);
                org.telegram.ui.ActionBar.k6.b1.draw(canvas3);
            }
            if (t2Var4.t3 != null && !t2Var4.W()) {
                if (t2Var4.K0 != 0) {
                    TextPaint textPaint6 = org.telegram.ui.ActionBar.k6.G0;
                    int w07 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.n9, e6Var2);
                    textPaint6.linkColor = w07;
                    textPaint6.setColor(w07);
                } else if (t2Var4.m2 != null) {
                    TextPaint textPaint7 = org.telegram.ui.ActionBar.k6.G0;
                    int w08 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.j9, e6Var2);
                    textPaint7.linkColor = w08;
                    textPaint7.setColor(w08);
                } else {
                    TextPaint textPaint8 = org.telegram.ui.ActionBar.k6.G0;
                    int w09 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.m9, e6Var2);
                    textPaint8.linkColor = w09;
                    textPaint8.setColor(w09);
                }
                canvas3.save();
                canvas3.translate(t2Var4.s3, t2Var4.r3);
                try {
                    yh.f.f(canvas3, t2Var4.t3);
                    StaticLayout staticLayout4 = t2Var4.t3;
                    org.telegram.ui.Components.p5.drawAnimatedEmojis(canvas3, staticLayout4, t2Var4.o3, -0.075f, null, 0.0f, 0.0f, 0.0f, 1.0f, t2Var4.Q(i23, staticLayout4.getPaint().getColor()));
                } catch (Exception e10) {
                    org.telegram.messenger.a8.f(e10);
                }
                canvas3.restore();
            }
            if (t2Var4.f3 != null) {
                if (t2Var4.K0 == 0) {
                    TextPaint textPaint9 = org.telegram.ui.ActionBar.k6.F0[t2Var4.F0];
                    int w010 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.g9, e6Var2);
                    textPaint9.linkColor = w010;
                    textPaint9.setColor(w010);
                } else if (t2Var4.h2 != null) {
                    TextPaint textPaint10 = org.telegram.ui.ActionBar.k6.F0[t2Var4.F0];
                    int w011 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.l9, e6Var2);
                    textPaint10.linkColor = w011;
                    textPaint10.setColor(w011);
                } else {
                    TextPaint textPaint11 = org.telegram.ui.ActionBar.k6.F0[t2Var4.F0];
                    int w012 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.h9, e6Var2);
                    textPaint11.linkColor = w012;
                    textPaint11.setColor(w012);
                }
                float L7 = org.telegram.messenger.g0.L(14.0f);
                q2 q2Var5 = q2Var2;
                float f39 = q2Var5.m ? t2Var4.b3 - (q2Var5.l * L7) : t2Var4.b3 + (q2Var5.l * L7);
                if (((!z17 && !az.p1) || t2Var4.W()) && t2Var4.S()) {
                    f39 -= org.telegram.messenger.g0.L(t2Var4.W() ? 10.0f : 11.0f);
                }
                if (q2Var5.l != 1.0f) {
                    canvas3.save();
                    canvas3.translate(t2Var4.c3, f39);
                    int alpha2 = t2Var4.f3.getPaint().getAlpha();
                    t2Var4.f3.getPaint().setAlpha((int) ((1.0f - q2Var5.l) * alpha2));
                    ArrayList arrayList = t2Var4.k3;
                    if (arrayList.isEmpty()) {
                        f28 = L7;
                        rectF = rectF2;
                        e6Var4 = e6Var2;
                        cVar4 = cVar3;
                        q2Var3 = q2Var5;
                        i27 = alpha2;
                        f25 = 1.0f;
                        yh.f.f(canvas3, t2Var4.f3);
                        StaticLayout staticLayout5 = t2Var4.f3;
                        org.telegram.ui.Components.p5.drawAnimatedEmojis(canvas3, staticLayout5, t2Var4.n3, -0.075f, null, 0.0f, 0.0f, 0.0f, 1.0f, t2Var4.Q(2, staticLayout5.getPaint().getColor()));
                    } else {
                        try {
                            canvas3.save();
                            yh.f.d(canvas3, arrayList);
                            yh.f.f(canvas3, t2Var4.f3);
                        } catch (Exception e11) {
                            e = e11;
                            f28 = L7;
                        }
                        try {
                            StaticLayout staticLayout6 = t2Var4.f3;
                            try {
                                e6Var4 = e6Var2;
                                f28 = L7;
                                f25 = 1.0f;
                                cVar4 = cVar3;
                                i27 = alpha2;
                                rectF = rectF2;
                                q2Var3 = q2Var5;
                            } catch (Exception e12) {
                                e = e12;
                                f28 = L7;
                                rectF = rectF2;
                                e6Var4 = e6Var2;
                                cVar4 = cVar3;
                                q2Var3 = q2Var5;
                                i27 = alpha2;
                                f25 = 1.0f;
                                org.telegram.messenger.a8.f(e);
                                t2Var4.f3.getPaint().setAlpha(i27);
                                canvas3.restore();
                                canvas3.save();
                                if (!q2Var3.m) {
                                }
                                if (!z17) {
                                    y9 -= org.telegram.messenger.g0.L(t2Var4.W() ? 10.0f : 11.0f);
                                    canvas3.translate(t2Var4.e3, y9);
                                    staticLayout2 = t2Var4.g3;
                                    if (staticLayout2 != null) {
                                        int alpha3 = staticLayout2.getPaint().getAlpha();
                                        t2Var4.g3.getPaint().setAlpha((int) (alpha3 * q2Var3.l));
                                        t2Var4.g3.draw(canvas3);
                                        t2Var4.g3.getPaint().setAlpha(alpha3);
                                    }
                                    canvas3.restore();
                                    if (t2Var4.g3 != null) {
                                        if (i26 < 0) {
                                        }
                                        u02 = org.telegram.ui.ActionBar.k6.u0(i26);
                                        if (u02 != null) {
                                        }
                                    }
                                    if (t2Var4.i3 != null) {
                                    }
                                    if (t2Var4.K0 == 0) {
                                    }
                                    float f40 = 12.5f;
                                    if (t2Var3.l4) {
                                    }
                                    e6Var3 = e6Var4;
                                    if (t2Var3.c1) {
                                    }
                                    if (t2Var3.k1 != 2) {
                                    }
                                    i15 = 17;
                                    if (!t2Var3.k4) {
                                    }
                                    z13 = z18 ? 1 : 0;
                                    if (!t2Var3.z3) {
                                    }
                                    if (!bd.a0) {
                                    }
                                    org.telegram.ui.ActionBar.k6.Z0.setAlpha((int) (t2Var3.y3 * 255.0f));
                                    z.s(t2Var3.E3, t2Var3.D3, org.telegram.ui.ActionBar.k6.Z0);
                                    org.telegram.ui.ActionBar.k6.Z0.draw(canvas3);
                                    float f41 = t2Var3.T3.e;
                                    if (t2Var3.u3) {
                                    }
                                    t2Var = t2Var3;
                                    f19 = f25;
                                    if (t2Var.I3) {
                                    }
                                    if (t2Var.S1 > 0) {
                                    }
                                    fVar = t2Var.u0;
                                    if (fVar != null) {
                                    }
                                    i24 = i21;
                                    r12 = z18;
                                    if (i24 != -1) {
                                    }
                                    z14 = t2Var.c2;
                                    imageReceiver = t2Var.Z1;
                                    if (z14) {
                                    }
                                    z15 = t2Var.y;
                                    m2Var = t2Var.v0;
                                    if (z15) {
                                        if (!t2Var.E) {
                                        }
                                        if (!t2Var.P0) {
                                            float centerX = m2Var.F.centerX() + org.telegram.messenger.g0.L(20.33f);
                                            float centerY = m2Var.F.centerY() + org.telegram.messenger.g0.L(19.0f);
                                            if (t2Var.E0 == null) {
                                            }
                                            cg.r.d(t2Var.E0, centerX, centerY, i15);
                                            canvas3.drawCircle(t2Var.E0.getBounds().exactCenterX(), t2Var.E0.getBounds().exactCenterY(), org.telegram.messenger.g0.L(8.0f), org.telegram.ui.ActionBar.k6.n0(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.d6, e6Var3)));
                                            t2Var.E0.draw(canvas3);
                                        }
                                    }
                                    if (t2Var.c2) {
                                    }
                                    if (imageReceiver.H()) {
                                        i17 = 1;
                                    }
                                    if (t2Var.j0 > 0.0f) {
                                    }
                                    t2Var2 = t2Var;
                                    if (t2Var2.D0 != 0.0f) {
                                    }
                                    if (t2Var2.x1 != 0.0f) {
                                    }
                                    if (z11) {
                                        canvas3.save();
                                        canvas3.translate(0.0f, (-t2Var2.F3) - (t2Var2.n * t2Var2.j0));
                                        canvas3.clipRect(0.0f, (f19 - t2Var2.f2.J) * t2Var2.getMeasuredHeight(), t2Var2.getMeasuredWidth(), t2Var2.getMeasuredHeight());
                                        t2Var2.f2.c(canvas3, r12);
                                        canvas3.restore();
                                    }
                                    if (t2Var2.t2) {
                                    }
                                    f20 = 0.0f;
                                    i18 = 1;
                                    if (t2Var2.u1 != f20) {
                                    }
                                    canvas2 = canvas;
                                    if (z24) {
                                    }
                                    z16 = t2Var2.z3;
                                    if (!z16) {
                                    }
                                    if (z16) {
                                    }
                                    i17 = i18;
                                    if (t2Var2.n1) {
                                    }
                                }
                                y9 -= org.telegram.messenger.g0.L(t2Var4.W() ? 10.0f : 11.0f);
                                canvas3.translate(t2Var4.e3, y9);
                                staticLayout2 = t2Var4.g3;
                                if (staticLayout2 != null) {
                                }
                                canvas3.restore();
                                if (t2Var4.g3 != null) {
                                }
                                if (t2Var4.i3 != null) {
                                }
                                if (t2Var4.K0 == 0) {
                                }
                                float f402 = 12.5f;
                                if (t2Var3.l4) {
                                }
                                e6Var3 = e6Var4;
                                if (t2Var3.c1) {
                                }
                                if (t2Var3.k1 != 2) {
                                }
                                i15 = 17;
                                if (!t2Var3.k4) {
                                }
                                z13 = z18 ? 1 : 0;
                                if (!t2Var3.z3) {
                                }
                                if (!bd.a0) {
                                }
                                org.telegram.ui.ActionBar.k6.Z0.setAlpha((int) (t2Var3.y3 * 255.0f));
                                z.s(t2Var3.E3, t2Var3.D3, org.telegram.ui.ActionBar.k6.Z0);
                                org.telegram.ui.ActionBar.k6.Z0.draw(canvas3);
                                float f412 = t2Var3.T3.e;
                                if (t2Var3.u3) {
                                }
                                t2Var = t2Var3;
                                f19 = f25;
                                if (t2Var.I3) {
                                }
                                if (t2Var.S1 > 0) {
                                }
                                fVar = t2Var.u0;
                                if (fVar != null) {
                                }
                                i24 = i21;
                                r12 = z18;
                                if (i24 != -1) {
                                }
                                z14 = t2Var.c2;
                                imageReceiver = t2Var.Z1;
                                if (z14) {
                                }
                                z15 = t2Var.y;
                                m2Var = t2Var.v0;
                                if (z15) {
                                }
                                if (t2Var.c2) {
                                }
                                if (imageReceiver.H()) {
                                }
                                if (t2Var.j0 > 0.0f) {
                                }
                                t2Var2 = t2Var;
                                if (t2Var2.D0 != 0.0f) {
                                }
                                if (t2Var2.x1 != 0.0f) {
                                }
                                if (z11) {
                                }
                                if (t2Var2.t2) {
                                }
                                f20 = 0.0f;
                                i18 = 1;
                                if (t2Var2.u1 != f20) {
                                }
                                canvas2 = canvas;
                                if (z24) {
                                }
                                z16 = t2Var2.z3;
                                if (!z16) {
                                }
                                if (z16) {
                                }
                                i17 = i18;
                                if (t2Var2.n1) {
                                }
                            }
                            try {
                                org.telegram.ui.Components.p5.drawAnimatedEmojis(canvas3, staticLayout6, t2Var4.n3, -0.075f, arrayList, 0.0f, 0.0f, 0.0f, 1.0f, t2Var4.Q(2, staticLayout6.getPaint().getColor()));
                                canvas3.restore();
                                for (int i36 = 0; i36 < arrayList.size(); i36++) {
                                    yh.f fVar2 = (yh.f) arrayList.get(i36);
                                    fVar2.h(t2Var4.f3.getPaint().getColor());
                                    fVar2.draw(canvas3);
                                }
                            } catch (Exception e13) {
                                e = e13;
                                org.telegram.messenger.a8.f(e);
                                t2Var4.f3.getPaint().setAlpha(i27);
                                canvas3.restore();
                                canvas3.save();
                                if (!q2Var3.m) {
                                }
                                if (!z17) {
                                }
                                y9 -= org.telegram.messenger.g0.L(t2Var4.W() ? 10.0f : 11.0f);
                                canvas3.translate(t2Var4.e3, y9);
                                staticLayout2 = t2Var4.g3;
                                if (staticLayout2 != null) {
                                }
                                canvas3.restore();
                                if (t2Var4.g3 != null) {
                                }
                                if (t2Var4.i3 != null) {
                                }
                                if (t2Var4.K0 == 0) {
                                }
                                float f4022 = 12.5f;
                                if (t2Var3.l4) {
                                }
                                e6Var3 = e6Var4;
                                if (t2Var3.c1) {
                                }
                                if (t2Var3.k1 != 2) {
                                }
                                i15 = 17;
                                if (!t2Var3.k4) {
                                }
                                z13 = z18 ? 1 : 0;
                                if (!t2Var3.z3) {
                                }
                                if (!bd.a0) {
                                }
                                org.telegram.ui.ActionBar.k6.Z0.setAlpha((int) (t2Var3.y3 * 255.0f));
                                z.s(t2Var3.E3, t2Var3.D3, org.telegram.ui.ActionBar.k6.Z0);
                                org.telegram.ui.ActionBar.k6.Z0.draw(canvas3);
                                float f4122 = t2Var3.T3.e;
                                if (t2Var3.u3) {
                                }
                                t2Var = t2Var3;
                                f19 = f25;
                                if (t2Var.I3) {
                                }
                                if (t2Var.S1 > 0) {
                                }
                                fVar = t2Var.u0;
                                if (fVar != null) {
                                }
                                i24 = i21;
                                r12 = z18;
                                if (i24 != -1) {
                                }
                                z14 = t2Var.c2;
                                imageReceiver = t2Var.Z1;
                                if (z14) {
                                }
                                z15 = t2Var.y;
                                m2Var = t2Var.v0;
                                if (z15) {
                                }
                                if (t2Var.c2) {
                                }
                                if (imageReceiver.H()) {
                                }
                                if (t2Var.j0 > 0.0f) {
                                }
                                t2Var2 = t2Var;
                                if (t2Var2.D0 != 0.0f) {
                                }
                                if (t2Var2.x1 != 0.0f) {
                                }
                                if (z11) {
                                }
                                if (t2Var2.t2) {
                                }
                                f20 = 0.0f;
                                i18 = 1;
                                if (t2Var2.u1 != f20) {
                                }
                                canvas2 = canvas;
                                if (z24) {
                                }
                                z16 = t2Var2.z3;
                                if (!z16) {
                                }
                                if (z16) {
                                }
                                i17 = i18;
                                if (t2Var2.n1) {
                                }
                            }
                        } catch (Exception e14) {
                            e = e14;
                            f28 = L7;
                            rectF = rectF2;
                            e6Var4 = e6Var2;
                            cVar4 = cVar3;
                            q2Var3 = q2Var5;
                            i27 = alpha2;
                            f25 = 1.0f;
                            org.telegram.messenger.a8.f(e);
                            t2Var4.f3.getPaint().setAlpha(i27);
                            canvas3.restore();
                            canvas3.save();
                            if (!q2Var3.m) {
                            }
                            if (!z17) {
                            }
                            y9 -= org.telegram.messenger.g0.L(t2Var4.W() ? 10.0f : 11.0f);
                            canvas3.translate(t2Var4.e3, y9);
                            staticLayout2 = t2Var4.g3;
                            if (staticLayout2 != null) {
                            }
                            canvas3.restore();
                            if (t2Var4.g3 != null) {
                            }
                            if (t2Var4.i3 != null) {
                            }
                            if (t2Var4.K0 == 0) {
                            }
                            float f40222 = 12.5f;
                            if (t2Var3.l4) {
                            }
                            e6Var3 = e6Var4;
                            if (t2Var3.c1) {
                            }
                            if (t2Var3.k1 != 2) {
                            }
                            i15 = 17;
                            if (!t2Var3.k4) {
                            }
                            z13 = z18 ? 1 : 0;
                            if (!t2Var3.z3) {
                            }
                            if (!bd.a0) {
                            }
                            org.telegram.ui.ActionBar.k6.Z0.setAlpha((int) (t2Var3.y3 * 255.0f));
                            z.s(t2Var3.E3, t2Var3.D3, org.telegram.ui.ActionBar.k6.Z0);
                            org.telegram.ui.ActionBar.k6.Z0.draw(canvas3);
                            float f41222 = t2Var3.T3.e;
                            if (t2Var3.u3) {
                            }
                            t2Var = t2Var3;
                            f19 = f25;
                            if (t2Var.I3) {
                            }
                            if (t2Var.S1 > 0) {
                            }
                            fVar = t2Var.u0;
                            if (fVar != null) {
                            }
                            i24 = i21;
                            r12 = z18;
                            if (i24 != -1) {
                            }
                            z14 = t2Var.c2;
                            imageReceiver = t2Var.Z1;
                            if (z14) {
                            }
                            z15 = t2Var.y;
                            m2Var = t2Var.v0;
                            if (z15) {
                            }
                            if (t2Var.c2) {
                            }
                            if (imageReceiver.H()) {
                            }
                            if (t2Var.j0 > 0.0f) {
                            }
                            t2Var2 = t2Var;
                            if (t2Var2.D0 != 0.0f) {
                            }
                            if (t2Var2.x1 != 0.0f) {
                            }
                            if (z11) {
                            }
                            if (t2Var2.t2) {
                            }
                            f20 = 0.0f;
                            i18 = 1;
                            if (t2Var2.u1 != f20) {
                            }
                            canvas2 = canvas;
                            if (z24) {
                            }
                            z16 = t2Var2.z3;
                            if (!z16) {
                            }
                            if (z16) {
                            }
                            i17 = i18;
                            if (t2Var2.n1) {
                            }
                        }
                    }
                    t2Var4.f3.getPaint().setAlpha(i27);
                    canvas3.restore();
                } else {
                    f28 = L7;
                    rectF = rectF2;
                    e6Var4 = e6Var2;
                    cVar4 = cVar3;
                    q2Var3 = q2Var5;
                    f25 = 1.0f;
                }
                canvas3.save();
                y9 = !q2Var3.m ? com.google.android.recaptcha.internal.a.y(f25, q2Var3.l, f28, t2Var4.b3) : a1.g.D(f25, q2Var3.l, f28, t2Var4.b3);
                if (((!z17 && !az.p1) || t2Var4.W()) && t2Var4.S()) {
                    y9 -= org.telegram.messenger.g0.L(t2Var4.W() ? 10.0f : 11.0f);
                }
                canvas3.translate(t2Var4.e3, y9);
                staticLayout2 = t2Var4.g3;
                if (staticLayout2 != null && q2Var3.l > 0.0f) {
                    int alpha32 = staticLayout2.getPaint().getAlpha();
                    t2Var4.g3.getPaint().setAlpha((int) (alpha32 * q2Var3.l));
                    t2Var4.g3.draw(canvas3);
                    t2Var4.g3.getPaint().setAlpha(alpha32);
                }
                canvas3.restore();
                if (t2Var4.g3 != null && ((i26 = t2Var4.k2) >= 0 || (q2Var3.l > 0.0f && q2Var3.n >= 0))) {
                    if (i26 < 0) {
                        i26 = q2Var3.n;
                    }
                    u02 = org.telegram.ui.ActionBar.k6.u0(i26);
                    if (u02 != null) {
                        canvas3.save();
                        u02.b(i0.a.o(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.p9), (int) (Color.alpha(r4) * q2Var3.l)));
                        float y11 = q2Var3.m ? com.google.android.recaptcha.internal.a.y(f25, q2Var3.l, f28, t2Var4.b3) : a1.g.D(f25, q2Var3.l, f28, t2Var4.b3);
                        if (((!z17 && !az.p1) || t2Var4.W()) && t2Var4.S()) {
                            y11 -= org.telegram.messenger.g0.L(t2Var4.W() ? 10.0f : 11.0f);
                        }
                        if (i26 == 1 || i26 == 4) {
                            canvas3.translate(t2Var4.D4, y11 + (i26 == 1 ? org.telegram.messenger.g0.L(f25) : 0));
                        } else {
                            canvas3.translate(t2Var4.D4, ((org.telegram.messenger.g0.L(18.0f) - u02.getIntrinsicHeight()) / f22) + y11);
                        }
                        u02.draw(canvas3);
                        t2Var4.invalidate();
                        canvas3.restore();
                    }
                }
            } else {
                rectF = rectF2;
                e6Var4 = e6Var2;
                cVar4 = cVar3;
                q2Var3 = q2Var2;
                f25 = 1.0f;
            }
            if (t2Var4.i3 != null) {
                canvas3.save();
                if (t2Var4.c0 == null) {
                    t2Var4.c0 = new Paint(1);
                }
                if (t2Var4.d0 == null) {
                    nc ncVar = new nc(t2Var4);
                    t2Var4.d0 = ncVar;
                    z22 = false;
                    final boolean z28 = false ? 1 : 0;
                    ncVar.e(new Runnable(t2Var4) { // from class: org.telegram.ui.Cells.k2
                        public final /* synthetic */ t2 b;

                        {
                            this.b = t2Var4;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (z28) {
                                case 0:
                                    t2 t2Var5 = this.b;
                                    p2 p2Var = t2Var5.e0;
                                    if (p2Var != null) {
                                        p2Var.r(t2Var5);
                                        break;
                                    }
                                    break;
                                default:
                                    t2 t2Var6 = this.b;
                                    p2 p2Var2 = t2Var6.e0;
                                    if (p2Var2 != null) {
                                        p2Var2.l(t2Var6);
                                        break;
                                    }
                                    break;
                            }
                        }
                    });
                    nc ncVar2 = t2Var4.d0;
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
                                    p2 p2Var = t2Var5.e0;
                                    if (p2Var != null) {
                                        p2Var.r(t2Var5);
                                        break;
                                    }
                                    break;
                                default:
                                    t2 t2Var6 = this.b;
                                    p2 p2Var2 = t2Var6.e0;
                                    if (p2Var2 != null) {
                                        p2Var2.l(t2Var6);
                                        break;
                                    }
                                    break;
                            }
                        }
                    };
                    ncVar2.l = true;
                    ncVar2.j = runnable;
                } else {
                    z22 = false;
                }
                if (t2Var4.g0 && t2Var4.N4 != 0 && ((i25 = t2Var4.k1) == 0 || i25 == 7 || i25 == 8)) {
                    t2Var4.d0.d(i0.a.o(t2Var4.b0.getColor(), org.telegram.ui.ActionBar.k6.j1() ? 36 : 26));
                    nc ncVar3 = t2Var4.d0;
                    ncVar3.i = z22;
                    ncVar3.c = z22 ? 1 : 0;
                    int i38 = t2Var4.N4;
                    if (i38 != 0 && i38 > 0) {
                        float f42 = t2Var4.b3;
                        if (((!z17 && !az.p1) || t2Var4.W()) && t2Var4.S()) {
                            f42 -= org.telegram.messenger.g0.L(t2Var4.W() ? 10.0f : 11.0f);
                        }
                        RectF rectF3 = org.telegram.messenger.g0.P;
                        float primaryHorizontal = t2Var4.f3.getPrimaryHorizontal(z22 ? 1 : 0) + org.telegram.messenger.g0.L(f22) + t2Var4.c3;
                        float f43 = t2Var4.c3;
                        StaticLayout staticLayout7 = t2Var4.f3;
                        rectF3.set(primaryHorizontal, f42, (staticLayout7.getPrimaryHorizontal(Math.min(staticLayout7.getText().length(), t2Var4.N4)) + f43) - org.telegram.messenger.g0.L(3.0f), t2Var4.h3 - org.telegram.messenger.g0.L(4.0f));
                        rectF3.inset(-org.telegram.messenger.g0.L(8.0f), -org.telegram.messenger.g0.L(4.0f));
                        if (rectF3.right > rectF3.left) {
                            t2Var4.d0.a(rectF3);
                        }
                    }
                    float lineLeft = t2Var4.i3.getLineLeft(z22 ? 1 : 0);
                    RectF rectF4 = org.telegram.messenger.g0.P;
                    rectF4.set(t2Var4.d3 + lineLeft + org.telegram.messenger.g0.L(f22), org.telegram.messenger.g0.L(f22) + t2Var4.h3, t2Var4.i3.getLineWidth(z22 ? 1 : 0) + t2Var4.d3 + lineLeft + org.telegram.messenger.g0.L(12.0f), t2Var4.i3.getHeight() + t2Var4.h3);
                    rectF4.inset(-org.telegram.messenger.g0.L(8.0f), -org.telegram.messenger.g0.L(3.0f));
                    t2Var4.d0.a(rectF4);
                    nc ncVar4 = t2Var4.d0;
                    ncVar4.c(canvas3, ncVar4.g);
                    y yVar = ncVar4.e;
                    if (yVar != null) {
                        yVar.draw(canvas3);
                    }
                    org.telegram.ui.ActionBar.k6.t1.setAlpha(hs.J1);
                    z.t(org.telegram.ui.ActionBar.k6.t1, rectF4.right - org.telegram.messenger.g0.L(18.0f), com.google.android.recaptcha.internal.a.z(rectF4.height(), org.telegram.ui.ActionBar.k6.t1.getIntrinsicHeight(), f22, rectF4.top));
                    org.telegram.ui.ActionBar.k6.t1.draw(canvas3);
                }
                canvas3.translate(t2Var4.d3, t2Var4.h3);
                ArrayList arrayList2 = t2Var4.m3;
                if (arrayList2.isEmpty()) {
                    yh.f.f(canvas3, t2Var4.i3);
                    StaticLayout staticLayout8 = t2Var4.i3;
                    org.telegram.ui.Components.p5.drawAnimatedEmojis(canvas3, staticLayout8, t2Var4.p3, -0.075f, null, 0.0f, 0.0f, 0.0f, 1.0f, t2Var4.Q(3, staticLayout8.getPaint().getColor()));
                } else {
                    try {
                        canvas3.save();
                        yh.f.d(canvas3, arrayList2);
                        yh.f.f(canvas3, t2Var4.i3);
                        StaticLayout staticLayout9 = t2Var4.i3;
                        org.telegram.ui.Components.p5.drawAnimatedEmojis(canvas3, staticLayout9, t2Var4.p3, -0.075f, arrayList2, 0.0f, 0.0f, 0.0f, 1.0f, t2Var4.Q(3, staticLayout9.getPaint().getColor()));
                        canvas3.restore();
                        for (int i39 = z22 ? 1 : 0; i39 < arrayList2.size(); i39++) {
                            yh.f fVar3 = (yh.f) arrayList2.get(i39);
                            fVar3.h(t2Var4.i3.getPaint().getColor());
                            fVar3.draw(canvas3);
                        }
                    } catch (Exception e15) {
                        org.telegram.messenger.a8.f(e15);
                    }
                }
                canvas.restore();
                z18 = z22;
            } else {
                z18 = false;
            }
            if (t2Var4.K0 == 0) {
                int i40 = (t2Var4.T2 ? 1 : 0) + (t2Var4.R2 ? 2 : z18 ? 1 : 0) + (t2Var4.S2 ? 4 : z18 ? 1 : 0);
                int i41 = t2Var4.y4;
                if (i41 >= 0 && i41 != i40 && !t2Var4.A4) {
                    t2Var4.G(i41, i40);
                }
                boolean z29 = t2Var4.A4;
                if (z29) {
                    i40 = t2Var4.w4;
                }
                boolean z30 = (i40 & 1) != 0 ? true : z18 ? 1 : 0;
                boolean z31 = (i40 & 2) != 0 ? true : z18 ? 1 : 0;
                boolean z32 = (i40 & 4) != 0 ? true : z18 ? 1 : 0;
                if (z29) {
                    int i42 = t2Var4.x4;
                    boolean z33 = (i42 & 1) != 0 ? true : z18 ? 1 : 0;
                    boolean z34 = (i42 & 2) != 0 ? true : z18 ? 1 : 0;
                    i16 = 4;
                    if ((i42 & 4) != 0) {
                        z20 = z32;
                        z21 = true;
                    } else {
                        z20 = z32;
                        z21 = z18 ? 1 : 0;
                    }
                    if (z30 || z33 || !z21 || z34 || !z31 || !z20) {
                        boolean z35 = z31;
                        boolean z36 = z34;
                        canvas3 = canvas;
                        t2Var4.I(canvas3, z33, z36, z21, false, f25 - t2Var4.z4);
                        t2Var4.I(canvas3, z30, z35, z20, false, t2Var4.z4);
                        t2Var3 = this;
                        t2Var3.y4 = (t2Var3.T2 ? 1 : 0) + (!t2Var3.R2 ? 2 : z18 ? 1 : 0) + (!t2Var3.S2 ? i16 : z18 ? 1 : 0);
                    } else {
                        canvas3 = canvas;
                        t2Var4.I(canvas3, z30, z31, z20, true, t2Var4.z4);
                    }
                } else {
                    i16 = 4;
                    t2Var4 = this;
                    canvas3 = canvas;
                    t2Var4.I(canvas3, z30, z31, z32, false, 1.0f);
                }
                t2Var3 = t2Var4;
                t2Var3.y4 = (t2Var3.T2 ? 1 : 0) + (!t2Var3.R2 ? 2 : z18 ? 1 : 0) + (!t2Var3.S2 ? i16 : z18 ? 1 : 0);
            } else {
                canvas3 = canvas;
                t2Var3 = t2Var4;
                i16 = 4;
            }
            float f402222 = 12.5f;
            if (t2Var3.l4) {
                int L8 = org.telegram.messenger.g0.L((z17 || az.p1) ? 12.5f : 15.5f);
                if (((!z17 && !az.p1) || t2Var3.W()) && t2Var3.S()) {
                    L8 -= org.telegram.messenger.g0.L(9.0f);
                }
                org.telegram.ui.Components.e5 e5Var = t2Var3.p4;
                if (e5Var != null) {
                    e5Var.setBounds(t2Var3.y2 - org.telegram.messenger.g0.L(19.0f), org.telegram.messenger.g0.L(-1.0f) + L8, t2Var3.y2 - org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(16.0f) + L8);
                    e6Var3 = e6Var4;
                    e5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.z9, e6Var3)));
                    e5Var.draw(canvas3);
                    boolean z37 = (!t2Var3.c1 || t2Var3.a1 || t2Var3.R0) ? true : z18 ? 1 : 0;
                    if (t2Var3.k1 != 2 || ((!z37 && t2Var3.d1 <= 0.0f) || t2Var3.k4 || t2Var3.q4 != 0)) {
                        i15 = 17;
                    } else {
                        if (z37) {
                            float f44 = t2Var3.d1;
                            if (f44 != f25) {
                                float f45 = f44 + 0.10666667f;
                                t2Var3.d1 = f45;
                                if (f45 > f25) {
                                    t2Var3.d1 = f25;
                                } else {
                                    t2Var3.invalidate();
                                }
                                float L9 = (!t2Var3.m4 ? t2Var3.J2 : t2Var3.I2) - org.telegram.messenger.g0.L((!z17 || az.p1) ? 0.0f : f25);
                                float L10 = org.telegram.messenger.g0.L(!az.p1 ? 13.5f : 17.5f);
                                if (((!z17 && !az.p1) || t2Var3.W()) && t2Var3.S()) {
                                    L10 -= org.telegram.messenger.g0.L(t2Var3.W() ? 8.0f : 9.0f);
                                }
                                z.t(org.telegram.ui.ActionBar.k6.c1, L9, L10);
                                z.t(org.telegram.ui.ActionBar.k6.d1, L9, L10);
                                i15 = 17;
                                cg.r.d(org.telegram.ui.ActionBar.k6.e1, org.telegram.ui.ActionBar.k6.c1.getBounds().exactCenterX() + org.telegram.messenger.g0.L(2.0f), org.telegram.ui.ActionBar.k6.c1.getBounds().exactCenterY(), 17);
                                if (t2Var3.d1 != f25) {
                                    canvas3.save();
                                    float f46 = t2Var3.d1;
                                    canvas3.scale(f46, f46, org.telegram.ui.ActionBar.k6.c1.getBounds().centerX(), org.telegram.ui.ActionBar.k6.c1.getBounds().centerY());
                                    if (t2Var3.R0) {
                                        org.telegram.ui.ActionBar.k6.e1.setAlpha((int) (t2Var3.d1 * 255.0f));
                                        org.telegram.ui.ActionBar.k6.e1.draw(canvas3);
                                        org.telegram.ui.ActionBar.k6.e1.setAlpha(hs.e4);
                                    } else if (t2Var3.c1) {
                                        org.telegram.ui.ActionBar.k6.d1.setAlpha((int) (t2Var3.d1 * 255.0f));
                                        org.telegram.ui.ActionBar.k6.d1.draw(canvas3);
                                        org.telegram.ui.ActionBar.k6.d1.setAlpha(hs.e4);
                                    } else {
                                        org.telegram.ui.ActionBar.k6.c1.setAlpha((int) (t2Var3.d1 * 255.0f));
                                        org.telegram.ui.ActionBar.k6.c1.draw(canvas3);
                                        org.telegram.ui.ActionBar.k6.c1.setAlpha(hs.e4);
                                    }
                                    canvas3.restore();
                                } else if (t2Var3.R0) {
                                    org.telegram.ui.ActionBar.k6.e1.draw(canvas3);
                                } else if (t2Var3.c1) {
                                    org.telegram.ui.ActionBar.k6.d1.draw(canvas3);
                                } else {
                                    org.telegram.ui.ActionBar.k6.c1.draw(canvas3);
                                }
                            }
                        }
                        if (!z37) {
                            float f47 = t2Var3.d1;
                            if (f47 != 0.0f) {
                                float f48 = f47 - 0.10666667f;
                                t2Var3.d1 = f48;
                                if (f48 < 0.0f) {
                                    t2Var3.d1 = 0.0f;
                                } else {
                                    t2Var3.invalidate();
                                }
                            }
                        }
                        float L92 = (!t2Var3.m4 ? t2Var3.J2 : t2Var3.I2) - org.telegram.messenger.g0.L((!z17 || az.p1) ? 0.0f : f25);
                        float L102 = org.telegram.messenger.g0.L(!az.p1 ? 13.5f : 17.5f);
                        if (!z17) {
                            L102 -= org.telegram.messenger.g0.L(t2Var3.W() ? 8.0f : 9.0f);
                            z.t(org.telegram.ui.ActionBar.k6.c1, L92, L102);
                            z.t(org.telegram.ui.ActionBar.k6.d1, L92, L102);
                            i15 = 17;
                            cg.r.d(org.telegram.ui.ActionBar.k6.e1, org.telegram.ui.ActionBar.k6.c1.getBounds().exactCenterX() + org.telegram.messenger.g0.L(2.0f), org.telegram.ui.ActionBar.k6.c1.getBounds().exactCenterY(), 17);
                            if (t2Var3.d1 != f25) {
                            }
                        }
                        L102 -= org.telegram.messenger.g0.L(t2Var3.W() ? 8.0f : 9.0f);
                        z.t(org.telegram.ui.ActionBar.k6.c1, L92, L102);
                        z.t(org.telegram.ui.ActionBar.k6.d1, L92, L102);
                        i15 = 17;
                        cg.r.d(org.telegram.ui.ActionBar.k6.e1, org.telegram.ui.ActionBar.k6.c1.getBounds().exactCenterX() + org.telegram.messenger.g0.L(2.0f), org.telegram.ui.ActionBar.k6.c1.getBounds().exactCenterY(), 17);
                        if (t2Var3.d1 != f25) {
                        }
                    }
                    if (!t2Var3.k4) {
                        float L11 = org.telegram.messenger.g0.L((z17 || az.p1) ? 13.5f : 16.5f);
                        if (((!z17 && !az.p1) || t2Var3.W()) && t2Var3.S()) {
                            L11 -= org.telegram.messenger.g0.L(9.0f);
                        }
                        z.t(org.telegram.ui.ActionBar.k6.f1, t2Var3.I2 - org.telegram.messenger.g0.L(f25), L11);
                        z.t(org.telegram.ui.ActionBar.k6.i1, t2Var3.I2 - org.telegram.messenger.g0.L(f25), L11);
                        org.telegram.ui.ActionBar.k6.f1.draw(canvas3);
                        org.telegram.ui.ActionBar.k6.i1.draw(canvas3);
                        x2Var2 = x2Var;
                    } else if (t2Var3.m4) {
                        int L12 = org.telegram.messenger.g0.L((z17 || az.p1) ? 12.5f : 15.5f);
                        if (((!z17 && !az.p1) || t2Var3.W()) && t2Var3.S()) {
                            L12 -= org.telegram.messenger.g0.L(9.0f);
                        }
                        org.telegram.ui.Components.e5 e5Var2 = t2Var3.o4;
                        if (e5Var2 != null) {
                            x2Var2 = x2Var;
                            x2Var2.setTranslationX((f33 + t2Var3.I2) - org.telegram.messenger.g0.L(2.0f));
                            x2Var2.setTranslationY((f18 + L12) - org.telegram.messenger.g0.L(4.0f));
                            if (t2Var3.j0 > 0.0f) {
                                e5Var2.setBounds(t2Var3.I2 - org.telegram.messenger.g0.L(2.0f), L12 - org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(20.0f) + t2Var3.I2, org.telegram.messenger.g0.L(22.0f) + (L12 - org.telegram.messenger.g0.L(4.0f)));
                                e5Var2.draw(canvas3);
                                z19 = z18 ? 1 : 0;
                            } else {
                                z19 = true;
                            }
                            e5Var2.k(Integer.valueOf(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.z9, e6Var3)));
                            z13 = z19;
                            if (!t2Var3.z3 || t2Var3.y3 != 0.0f) {
                                if (!bd.a0) {
                                    Paint paintReorderGradient = t2Var3.getPaintReorderGradient();
                                    paintReorderGradient.setAlpha((int) (t2Var3.y3 * 255.0f));
                                    canvas3.save();
                                    canvas3.translate(t2Var3.E3 - org.telegram.messenger.g0.L(f24), t2Var3.D3);
                                    float f49 = f24;
                                    canvas.drawRect(0.0f, 0.0f, org.telegram.messenger.k5.B(f49, t2Var3.E3, t2Var3.getMeasuredWidth()), org.telegram.messenger.g0.L(f49), paintReorderGradient);
                                    canvas3 = canvas;
                                    canvas3.restore();
                                }
                                org.telegram.ui.ActionBar.k6.Z0.setAlpha((int) (t2Var3.y3 * 255.0f));
                                z.s(t2Var3.E3, t2Var3.D3, org.telegram.ui.ActionBar.k6.Z0);
                                org.telegram.ui.ActionBar.k6.Z0.draw(canvas3);
                            }
                            float f412222 = t2Var3.T3.e;
                            if (t2Var3.u3) {
                                org.telegram.ui.ActionBar.k6.Y0.setAlpha((int) ((f25 - t2Var3.y3) * 255.0f));
                                RectF rectF5 = rectF;
                                rectF5.set(t2Var3.w3, t2Var3.v3, org.telegram.messenger.g0.L(20.666f) + r0, org.telegram.messenger.g0.L(20.666f) + t2Var3.v3);
                                float f50 = org.telegram.messenger.g0.p * 10.5f;
                                canvas3.drawRoundRect(rectF5, f50, f50, org.telegram.ui.ActionBar.k6.x0);
                                z.s(org.telegram.messenger.g0.L(4.5f) + t2Var3.w3, org.telegram.messenger.g0.L(5.0f) + t2Var3.v3, org.telegram.ui.ActionBar.k6.Y0);
                                org.telegram.ui.ActionBar.k6.Y0.draw(canvas3);
                            } else {
                                RectF rectF6 = rectF;
                                if (((t2Var3.H3 || t2Var3.c4) && t2Var3.M3) || t2Var3.W3 != f25 || t2Var3.d4 || t2Var3.X3 != f25 || t2Var3.e4 || f412222 > 0.0f) {
                                    boolean T = t2Var3.T();
                                    canvas3 = canvas;
                                    f19 = f25;
                                    J(canvas3, T, t2Var3.N3, t2Var3.O3, t2Var3.R3, 1.0f, false);
                                    t2Var = this;
                                    if (t2Var.c4) {
                                        org.telegram.ui.ActionBar.k6.w0.setAlpha((int) ((f19 - t2Var.y3) * 255.0f));
                                        if (t2Var.j4 != null) {
                                            rectF6.set(t2Var.f4, t2Var.N3, org.telegram.messenger.g0.L(12.666f) + r1 + t2Var.i4, org.telegram.messenger.g0.L(20.666f) + t2Var.N3);
                                            canvas3.drawRoundRect(rectF6, rectF6.height() / 2.0f, rectF6.height() / 2.0f, (!T || t2Var.l1 == 0) ? org.telegram.ui.ActionBar.k6.w0 : org.telegram.ui.ActionBar.k6.y0);
                                            org.telegram.ui.ActionBar.k6.M0.setAlpha((int) ((f19 - t2Var.y3) * 255.0f));
                                            canvas3.save();
                                            canvas3.translate(org.telegram.messenger.g0.L(6.333f) + t2Var.f4, org.telegram.messenger.g0.L(4.0f) + t2Var.N3);
                                            t2Var.j4.draw(canvas3);
                                            canvas3.restore();
                                        } else {
                                            Drawable drawable2 = org.telegram.ui.ActionBar.k6.m1;
                                            drawable2.setAlpha((int) ((f19 - t2Var.y3) * 255.0f));
                                            cg.r.d(drawable2, org.telegram.messenger.g0.L(10.333f) + t2Var.f4, org.telegram.messenger.g0.L(10.333f) + t2Var.N3, i15);
                                            drawable2.draw(canvas3);
                                        }
                                    }
                                    if (t2Var.d4 || t2Var.X3 != f19) {
                                        f26 = 10.333f;
                                        rectF6.set(t2Var.g4, t2Var.N3, org.telegram.messenger.g0.L(20.666f) + r1, org.telegram.messenger.g0.L(20.666f) + t2Var.N3);
                                        float f51 = t2Var.X3;
                                        if (f51 == f19) {
                                            f51 = f19;
                                        } else if (!t2Var.d4) {
                                            f51 = f19 - f51;
                                        }
                                        Drawable drawable3 = T ? org.telegram.ui.ActionBar.k6.q1 : org.telegram.ui.ActionBar.k6.n1;
                                        drawable3.setAlpha((int) ((f19 - t2Var.y3) * 255.0f));
                                        cg.r.d(drawable3, org.telegram.messenger.g0.L(10.333f) + r1, org.telegram.messenger.g0.L(10.333f) + t2Var.N3, i15);
                                        cg.r.b(canvas3, drawable3, f51);
                                    } else {
                                        f26 = 10.333f;
                                    }
                                    if ((t2Var.e4 || f412222 > 0.0f) && f412222 != 0.0f) {
                                        rectF6.set(t2Var.h4, t2Var.N3, org.telegram.messenger.g0.L(20.666f) + r1, org.telegram.messenger.g0.L(20.666f) + t2Var.N3);
                                        Drawable drawable4 = T ? org.telegram.ui.ActionBar.k6.r1 : org.telegram.ui.ActionBar.k6.o1;
                                        drawable4.setAlpha((int) ((f19 - t2Var.y3) * 255.0f));
                                        cg.r.d(drawable4, org.telegram.messenger.g0.L(f26) + r1, org.telegram.messenger.g0.L(f26) + t2Var.N3, i15);
                                        cg.r.b(canvas3, drawable4, f412222);
                                    }
                                    if (t2Var.I3) {
                                        if (t2Var.K3 == null) {
                                            t2Var.K3 = (LayerDrawable) f0.d.d(t2Var.getContext(), R.drawable.dialog_gram_transfer).mutate();
                                        }
                                        int w013 = org.telegram.ui.ActionBar.k6.w0(t2Var.T() ? org.telegram.ui.ActionBar.k6.V8 : org.telegram.ui.ActionBar.k6.U8, e6Var3);
                                        if (t2Var.L3 != w013) {
                                            Drawable drawable5 = t2Var.K3.getDrawable(z18 ? 1 : 0);
                                            t2Var.L3 = w013;
                                            drawable5.setColorFilter(new PorterDuffColorFilter(w013, PorterDuff.Mode.SRC_IN));
                                        }
                                        int L13 = ((org.telegram.messenger.g0.L(20.666f) - org.telegram.messenger.g0.L(28.0f)) / 2) + t2Var.N3;
                                        LayerDrawable layerDrawable = t2Var.K3;
                                        int i43 = t2Var.J3;
                                        layerDrawable.setBounds(i43, L13, org.telegram.messenger.g0.L(28.0f) + i43, org.telegram.messenger.g0.L(28.0f) + L13);
                                        t2Var.K3.setAlpha((int) ((f19 - t2Var.y3) * 255.0f));
                                        t2Var.K3.draw(canvas3);
                                    }
                                    if (t2Var.S1 > 0) {
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
                                            int i44 = z18 ? 1 : 0;
                                            while (i44 < t2Var.S1) {
                                                if (t2Var.V1[i44]) {
                                                    if (t2Var.U1 == null) {
                                                        Paint paint3 = new Paint(1);
                                                        t2Var.U1 = paint3;
                                                        paint3.setShadowLayer(org.telegram.messenger.g0.L(1.34f), 0.0f, org.telegram.messenger.g0.L(0.34f), 402653184);
                                                        t2Var.U1.setColor(z18 ? 1 : 0);
                                                    }
                                                    RectF rectF7 = org.telegram.messenger.g0.P;
                                                    ImageReceiver[] imageReceiverArr = t2Var.W1;
                                                    rectF7.set(imageReceiverArr[i44].x(), imageReceiverArr[i44].z(), imageReceiverArr[i44].y(), imageReceiverArr[i44].A());
                                                    imageReceiverArr[i44].g(canvas3);
                                                    if (t2Var.Y1[i44]) {
                                                        Path path = t2Var.w0;
                                                        if (path == null) {
                                                            t2Var.w0 = new Path();
                                                        } else {
                                                            path.rewind();
                                                        }
                                                        t2Var.w0.addRoundRect(rectF7, imageReceiverArr[i44].D()[z18 ? 1 : 0], imageReceiverArr[i44].D()[1], Path.Direction.CW);
                                                        canvas3.save();
                                                        canvas3.clipPath(t2Var.w0);
                                                        if (t2Var.x0 == null) {
                                                            t2Var.x0 = new yh.f();
                                                        }
                                                        t2Var.x0.h(i0.a.o(i22, (int) (Color.alpha(i22) * 0.325f)));
                                                        t2Var.x0.setBounds((int) imageReceiverArr[i44].x(), (int) imageReceiverArr[i44].z(), (int) imageReceiverArr[i44].y(), (int) imageReceiverArr[i44].A());
                                                        t2Var.x0.draw(canvas3);
                                                        t2Var.invalidate();
                                                        canvas3.restore();
                                                    }
                                                    if (t2Var.X1[i44]) {
                                                        z.s((int) (imageReceiverArr[i44].r() - (org.telegram.ui.ActionBar.k6.U0.getIntrinsicWidth() / 2)), (int) (imageReceiverArr[i44].s() - (org.telegram.ui.ActionBar.k6.U0.getIntrinsicHeight() / 2)), org.telegram.ui.ActionBar.k6.U0);
                                                        org.telegram.ui.ActionBar.k6.U0.draw(canvas3);
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
                                    fVar = t2Var.u0;
                                    if (fVar != null && !fVar.u()) {
                                        canvas3.save();
                                        canvas3.translate(t2Var.Z2, (t2Var.getMeasuredHeight() - org.telegram.messenger.g0.L(21.66f)) - (t2Var.t2 ? 1 : 0));
                                        t2Var.u0.c(canvas3, t2Var.a3 - t2Var.Z2);
                                        canvas3.restore();
                                    }
                                    i24 = i21;
                                    r12 = z18;
                                    if (i24 != -1) {
                                        canvas3.restoreToCount(i24);
                                        r12 = z18;
                                    }
                                } else {
                                    if (t2Var3.F1) {
                                        canvas3.save();
                                        float a10 = t2Var3.G1.a(0.05f);
                                        RectF rectF8 = t2Var3.I1;
                                        canvas3.scale(a10, a10, rectF8.centerX(), rectF8.centerY());
                                        t2Var3.H1.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Ci, e6Var3));
                                        canvas3.drawRoundRect(rectF8, rectF8.height() / 2.0f, rectF8.height() / 2.0f, t2Var3.H1);
                                        ly0 ly0Var = t2Var3.J1;
                                        if (ly0Var != null) {
                                            ly0Var.c(rectF8.left + org.telegram.messenger.g0.L(13.0f), rectF8.centerY(), 1.0f, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Gi, e6Var3), canvas);
                                        }
                                        canvas.restore();
                                    }
                                    canvas3 = canvas;
                                }
                            }
                            t2Var = t2Var3;
                            f19 = f25;
                            if (t2Var.I3) {
                            }
                            if (t2Var.S1 > 0) {
                            }
                            fVar = t2Var.u0;
                            if (fVar != null) {
                                canvas3.save();
                                canvas3.translate(t2Var.Z2, (t2Var.getMeasuredHeight() - org.telegram.messenger.g0.L(21.66f)) - (t2Var.t2 ? 1 : 0));
                                t2Var.u0.c(canvas3, t2Var.a3 - t2Var.Z2);
                                canvas3.restore();
                            }
                            i24 = i21;
                            r12 = z18;
                            if (i24 != -1) {
                            }
                        } else {
                            x2Var2 = x2Var;
                            Drawable drawable6 = (Drawable) ha.e.d().f;
                            int L14 = t2Var3.I2 - org.telegram.messenger.g0.L(f25);
                            if (!z17 && !az.p1) {
                                f402222 = 15.5f;
                            }
                            z.s(L14, org.telegram.messenger.g0.L(f402222), drawable6);
                            drawable6.draw(canvas3);
                        }
                    } else {
                        x2Var2 = x2Var;
                        if (t2Var3.q4 != 0) {
                            int L15 = org.telegram.messenger.g0.L((z17 || az.p1) ? 12.0f : 15.0f);
                            if (((!z17 && !az.p1) || t2Var3.W()) && t2Var3.S()) {
                                L15 -= org.telegram.messenger.g0.L(9.0f);
                            }
                            z.s(t2Var3.I2, L15, t2Var3.q4 == 1 ? org.telegram.ui.ActionBar.k6.g1 : org.telegram.ui.ActionBar.k6.h1);
                            (t2Var3.q4 == 1 ? org.telegram.ui.ActionBar.k6.g1 : org.telegram.ui.ActionBar.k6.h1).draw(canvas3);
                        }
                    }
                    z13 = z18 ? 1 : 0;
                    if (!t2Var3.z3) {
                    }
                    if (!bd.a0) {
                    }
                    org.telegram.ui.ActionBar.k6.Z0.setAlpha((int) (t2Var3.y3 * 255.0f));
                    z.s(t2Var3.E3, t2Var3.D3, org.telegram.ui.ActionBar.k6.Z0);
                    org.telegram.ui.ActionBar.k6.Z0.draw(canvas3);
                    float f4122222 = t2Var3.T3.e;
                    if (t2Var3.u3) {
                    }
                    t2Var = t2Var3;
                    f19 = f25;
                    if (t2Var.I3) {
                    }
                    if (t2Var.S1 > 0) {
                    }
                    fVar = t2Var.u0;
                    if (fVar != null) {
                    }
                    i24 = i21;
                    r12 = z18;
                    if (i24 != -1) {
                    }
                }
            }
            e6Var3 = e6Var4;
            if (t2Var3.c1) {
            }
            if (t2Var3.k1 != 2) {
            }
            i15 = 17;
            if (!t2Var3.k4) {
            }
            z13 = z18 ? 1 : 0;
            if (!t2Var3.z3) {
            }
            if (!bd.a0) {
            }
            org.telegram.ui.ActionBar.k6.Z0.setAlpha((int) (t2Var3.y3 * 255.0f));
            z.s(t2Var3.E3, t2Var3.D3, org.telegram.ui.ActionBar.k6.Z0);
            org.telegram.ui.ActionBar.k6.Z0.draw(canvas3);
            float f41222222 = t2Var3.T3.e;
            if (t2Var3.u3) {
            }
            t2Var = t2Var3;
            f19 = f25;
            if (t2Var.I3) {
            }
            if (t2Var.S1 > 0) {
            }
            fVar = t2Var.u0;
            if (fVar != null) {
            }
            i24 = i21;
            r12 = z18;
            if (i24 != -1) {
            }
        } else {
            t2Var = t2Var4;
            i15 = 17;
            e6Var3 = e6Var2;
            cVar4 = cVar3;
            x2Var2 = x2Var;
            r12 = 0;
            f19 = 1.0f;
            i16 = 4;
            z13 = false;
            i17 = 0;
        }
        z14 = t2Var.c2;
        imageReceiver = t2Var.Z1;
        if (z14) {
            canvas3.save();
            float interpolation2 = cVar4.getInterpolation(t2Var.d2 / 170.0f) + f19;
            canvas3.scale(interpolation2, interpolation2, imageReceiver.r(), imageReceiver.s());
        }
        z15 = t2Var.y;
        m2Var = t2Var.v0;
        if (z15 && (!t2Var.Q || (tL_forumTopic2 = t2Var.O) == null || tL_forumTopic2.id != 1 || (ng0Var = t2Var.f2) == null || !ng0Var.X || ng0Var.Y)) {
            if (!t2Var.E) {
                if (t2Var.a2 == null) {
                    t2Var.a2 = new wc0();
                }
                t2Var.a2.a((int) m2Var.F.centerX(), (int) m2Var.F.centerY(), (int) (m2Var.F.width() / 2.0f));
                canvas3.save();
                canvas3.clipPath(t2Var.a2);
                imageReceiver.A0(m2Var.F);
                imageReceiver.g(canvas3);
                canvas3.restore();
            } else if (t2Var.F) {
                cg.r.f(imageReceiver, org.telegram.messenger.g0.N(f19) + m2Var.F.centerX(), m2Var.F.centerY(), org.telegram.messenger.g0.L(48.0f), org.telegram.messenger.g0.L(48.0f));
                cg.r.a(canvas3, org.telegram.ui.ActionBar.k6.S0, imageReceiver.r(), imageReceiver.s(), org.telegram.messenger.g0.L(48.0f));
                imageReceiver.g(canvas3);
            } else {
                boolean z38 = t2Var.G;
                m2Var.r = (z38 || t2Var.K0 != 0) ? true : r12;
                int i45 = m2Var.z;
                if (z38) {
                    m2Var.z = 1;
                }
                ei.s7.h(t2Var.I0, canvas3, imageReceiver, m2Var);
                if (m2Var.w) {
                    t2Var.B();
                }
                m2Var.z = i45;
            }
            if (!t2Var.P0 && ((((chat = t2Var.h2) != null && chat.linked_community_id != 0) || ((user = t2Var.g2) != null && user.linked_community_id != 0)) && !t2Var.F && t2Var.O0 && !t2Var.U())) {
                float centerX2 = m2Var.F.centerX() + org.telegram.messenger.g0.L(20.33f);
                float centerY2 = m2Var.F.centerY() + org.telegram.messenger.g0.L(19.0f);
                if (t2Var.E0 == null) {
                    t2Var.E0 = new jh.c();
                }
                cg.r.d(t2Var.E0, centerX2, centerY2, i15);
                canvas3.drawCircle(t2Var.E0.getBounds().exactCenterX(), t2Var.E0.getBounds().exactCenterY(), org.telegram.messenger.g0.L(8.0f), org.telegram.ui.ActionBar.k6.n0(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.d6, e6Var3)));
                t2Var.E0.draw(canvas3);
            }
        }
        if (t2Var.c2) {
            canvas3.restore();
        }
        if (imageReceiver.H() && H(canvas)) {
            i17 = 1;
        }
        if (t2Var.j0 > 0.0f || t2Var.K0 != 0) {
            t2Var2 = t2Var;
        } else {
            boolean T2 = t2Var.T();
            RectF rectF9 = m2Var.F;
            int width = (int) (((rectF9.width() + rectF9.left) - t2Var.P3) - org.telegram.messenger.g0.L(5.0f));
            RectF rectF10 = m2Var.F;
            J(canvas3, T2, (int) ((m2Var.F.height() + imageReceiver.z()) - org.telegram.messenger.g0.L(22.0f)), width, (int) (((rectF10.width() + rectF10.left) - t2Var.Q3) - org.telegram.messenger.g0.L(5.0f)), t2Var.j0, true);
            t2Var2 = this;
        }
        if (t2Var2.D0 != 0.0f) {
            canvas3.restore();
        }
        if (t2Var2.x1 != 0.0f) {
            canvas3.restore();
        }
        if (z11 && ((t2Var2.K0 != 0 || (t2Var2.Q && (tL_forumTopic = t2Var2.O) != null && tL_forumTopic.id == 1)) && t2Var2.x1 == 0.0f && t2Var2.f2 != null)) {
            canvas3.save();
            canvas3.translate(0.0f, (-t2Var2.F3) - (t2Var2.n * t2Var2.j0));
            canvas3.clipRect(0.0f, (f19 - t2Var2.f2.J) * t2Var2.getMeasuredHeight(), t2Var2.getMeasuredWidth(), t2Var2.getMeasuredHeight());
            t2Var2.f2.c(canvas3, r12);
            canvas3.restore();
        }
        if (t2Var2.t2) {
            int L16 = (t2Var2.u2 || (t2Var2.K0 != 0 && t2Var2.n1)) ? r12 : org.telegram.messenger.g0.L(t2Var2.J);
            if (t2Var2.j0 != f19) {
                int alpha4 = org.telegram.ui.ActionBar.k6.k0.getAlpha();
                float f53 = t2Var2.j0;
                if (f53 != 0.0f) {
                    org.telegram.ui.ActionBar.k6.k0.setAlpha((int) ((f19 - f53) * alpha4));
                }
                i18 = 1;
                float measuredHeight = (t2Var2.getMeasuredHeight() - 1) - (t2Var2.n * t2Var2.j0);
                if (bd.a0) {
                    canvas.drawLine(0.0f, measuredHeight, t2Var2.getMeasuredWidth() - L16, measuredHeight, org.telegram.ui.ActionBar.k6.k0);
                } else {
                    canvas.drawLine(L16, measuredHeight, t2Var2.getMeasuredWidth(), measuredHeight, org.telegram.ui.ActionBar.k6.k0);
                }
                f20 = 0.0f;
                if (t2Var2.j0 != 0.0f) {
                    org.telegram.ui.ActionBar.k6.k0.setAlpha(alpha4);
                }
                if (t2Var2.u1 != f20) {
                    if (Build.VERSION.SDK_INT != 24) {
                        canvas.restore();
                    } else {
                        org.telegram.ui.ActionBar.k6.v0.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.d6, e6Var3));
                        canvas.drawRect(0.0f, 0.0f, t2Var2.getMeasuredWidth(), t2Var2.v1 * t2Var2.u1, org.telegram.ui.ActionBar.k6.v0);
                        canvas.drawRect(0.0f, t2Var2.getMeasuredHeight() - ((int) (t2Var2.w1 * t2Var2.u1)), t2Var2.getMeasuredWidth(), t2Var2.getMeasuredHeight(), org.telegram.ui.ActionBar.k6.v0);
                        canvas2 = canvas;
                        if (z24) {
                            float f54 = f19 - f29;
                            int measuredHeight2 = (int) (t2Var2.getMeasuredHeight() * f54);
                            int v02 = org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.d6);
                            if (t2Var2.P4 == null) {
                                t2Var2.P4 = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, null);
                            }
                            if (t2Var2.Q4 != v02) {
                                t2Var2.Q4 = v02;
                                t2Var2.P4.setColors(new int[]{v02, 16777215 & v02});
                            }
                            float a11 = be.a((f54 - 0.05f) * 10.0f, 0.0f, f19);
                            t2Var2.P4.setBounds(r12, measuredHeight2, t2Var2.getMeasuredWidth(), org.telegram.messenger.g0.L(6.0f) + measuredHeight2);
                            t2Var2.P4.setAlpha((int) (a11 * 255.0f));
                            t2Var2.P4.draw(canvas2);
                            canvas2.restore();
                        }
                        z16 = t2Var2.z3;
                        if (!z16 || t2Var2.y3 != 0.0f) {
                            if (z16) {
                                float f55 = t2Var2.y3;
                                if (f55 < 1.0f) {
                                    float f56 = f55 + 0.09411765f;
                                    t2Var2.y3 = f56;
                                    if (f56 > 1.0f) {
                                        t2Var2.y3 = 1.0f;
                                    }
                                    f21 = 0.0f;
                                }
                            } else {
                                float f57 = t2Var2.y3;
                                f21 = 0.0f;
                                if (f57 > 0.0f) {
                                    float f58 = f57 - 0.09411765f;
                                    t2Var2.y3 = f58;
                                    if (f58 < 0.0f) {
                                        t2Var2.y3 = 0.0f;
                                    }
                                }
                                if (t2Var2.n1) {
                                    float f59 = t2Var2.E1;
                                    if (f59 > f21) {
                                        float f60 = f59 - 0.069565214f;
                                        t2Var2.E1 = f60;
                                        if (f60 < f21) {
                                            t2Var2.E1 = f21;
                                        }
                                        org.telegram.ui.Components.u8 u8Var = t2Var2.b2;
                                        if (u8Var.n == 2) {
                                            u8Var.o = xq.h.getInterpolation(t2Var2.E1);
                                        }
                                        i17 = i18;
                                    }
                                    if (t2Var2.c2) {
                                        float f61 = t2Var2.d2 + 16.0f;
                                        t2Var2.d2 = f61;
                                        if (f61 >= 170.0f) {
                                            t2Var2.d2 = 170.0f;
                                            t2Var2.c2 = r12;
                                        }
                                        i17 = i18;
                                    }
                                    if (!t2Var2.B1) {
                                        float f62 = t2Var2.D1;
                                        if (f62 < 1.0f) {
                                            float f63 = f62 + 0.09411765f;
                                            t2Var2.D1 = f63;
                                            if (f63 > 1.0f) {
                                                t2Var2.D1 = 1.0f;
                                                i17 = i18;
                                            }
                                        }
                                        float f64 = t2Var2.C1;
                                        if (f64 < 1.0f) {
                                            float f65 = f64 + 0.053333335f;
                                            t2Var2.C1 = f65;
                                            if (f65 > 1.0f) {
                                                t2Var2.C1 = 1.0f;
                                            }
                                            i17 = i18;
                                        }
                                        x2Var2.setVisibility(!z13 ? r12 : i16);
                                        if (i17 == 0) {
                                            t2Var2.invalidate();
                                            return;
                                        }
                                        return;
                                    }
                                    if (t2Var2.D1 == 1.0f) {
                                        t2Var2.D1 = 0.0f;
                                        i17 = i18;
                                    }
                                    float f66 = t2Var2.C1;
                                    if (f66 > 0.0f) {
                                        float f67 = f66 - 0.053333335f;
                                        t2Var2.C1 = f67;
                                        if (f67 < 0.0f) {
                                            t2Var2.C1 = 0.0f;
                                        }
                                        i17 = i18;
                                    }
                                    x2Var2.setVisibility(!z13 ? r12 : i16);
                                    if (i17 == 0) {
                                    }
                                } else {
                                    float f68 = t2Var2.E1;
                                    if (f68 < 1.0f) {
                                        float f69 = f68 + 0.069565214f;
                                        t2Var2.E1 = f69;
                                        if (f69 > 1.0f) {
                                            t2Var2.E1 = 1.0f;
                                        }
                                        org.telegram.ui.Components.u8 u8Var2 = t2Var2.b2;
                                        if (u8Var2.n == 2) {
                                            u8Var2.o = xq.h.getInterpolation(t2Var2.E1);
                                        }
                                        i17 = i18;
                                    }
                                    if (t2Var2.c2) {
                                    }
                                    if (!t2Var2.B1) {
                                    }
                                }
                            }
                            i17 = i18;
                            if (t2Var2.n1) {
                            }
                        }
                        f21 = 0.0f;
                        if (t2Var2.n1) {
                        }
                    }
                }
                canvas2 = canvas;
                if (z24) {
                }
                z16 = t2Var2.z3;
                if (!z16) {
                }
                if (z16) {
                }
                i17 = i18;
                if (t2Var2.n1) {
                }
            }
        }
        f20 = 0.0f;
        i18 = 1;
        if (t2Var2.u1 != f20) {
        }
        canvas2 = canvas;
        if (z24) {
        }
        z16 = t2Var2.z3;
        if (!z16) {
        }
        if (z16) {
        }
        i17 = i18;
        if (t2Var2.n1) {
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        ng0 ng0Var;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (V() && (ng0Var = this.f2) != null && az.q1 && ng0Var.J == 0.0f) {
            accessibilityNodeInfo.setVisibleToUser(false);
        } else {
            accessibilityNodeInfo.addAction(16);
            accessibilityNodeInfo.addAction(32);
            if (!V() && this.E4 != null) {
                accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(R.id.acc_action_chat_preview, bd.M0(2131754940, null)));
            }
        }
        gi.y2 y2Var = this.r2;
        if (y2Var == null || !y2Var.a.q) {
            return;
        }
        accessibilityNodeInfo.setClassName("android.widget.CheckBox");
        accessibilityNodeInfo.setCheckable(true);
        accessibilityNodeInfo.setChecked(true);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.j0 != 0.0f || this.Q || this.G || !this.v0.a(this, motionEvent)) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        int L;
        int i13;
        if (this.I0 == 0 && this.H0 == null) {
            return;
        }
        ai.x2 x2Var = this.n4;
        if (x2Var != null) {
            x2Var.layout(0, 0, org.telegram.messenger.g0.L(22.0f), org.telegram.messenger.g0.L(22.0f));
        }
        if (this.r2 != null) {
            int i14 = this.J;
            boolean z11 = this.s2;
            int L2 = org.telegram.messenger.g0.L(i14 - ((z11 || az.p1) ? 29 : 27));
            if (this.l0) {
                i13 = org.telegram.messenger.g0.L(8.0f);
                L = (getMeasuredHeight() - this.r2.getMeasuredHeight()) >> 1;
            } else {
                if (bd.a0) {
                    L2 = (i11 - i3) - L2;
                }
                int i15 = L2;
                L = org.telegram.messenger.g0.L(this.V + ((z11 || az.p1) ? 6 : 0));
                i13 = i15;
            }
            gi.y2 y2Var = this.r2;
            y2Var.layout(i13, L, y2Var.getMeasuredWidth() + i13, this.r2.getMeasuredHeight() + L);
        }
        int measuredWidth = (getMeasuredWidth() + getMeasuredHeight()) << 16;
        if (measuredWidth != this.L4 || this.B0) {
            this.B0 = false;
            this.L4 = measuredWidth;
            try {
                x();
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i3, int i10) {
        ai.x2 x2Var = this.n4;
        if (x2Var != null) {
            x2Var.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(22.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(22.0f), TLObject.FLAG_30));
        }
        gi.y2 y2Var = this.r2;
        if (y2Var != null) {
            y2Var.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(24.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(24.0f), TLObject.FLAG_30));
        }
        if (this.Q) {
            int size = View.MeasureSpec.getSize(i3);
            boolean z10 = this.s2;
            setMeasuredDimension(size, org.telegram.messenger.g0.L(((z10 || az.p1) ? this.L : this.K) + ((!S() || ((z10 || az.p1) && !W())) ? 0 : W() ? this.N : this.M)) + (this.t2 ? 1 : 0));
            this.R = false;
            if (this.Q && !S()) {
                x();
                if (this.S) {
                    this.R = true;
                    x();
                }
            }
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i3), E());
        this.v1 = 0;
        this.w1 = getMeasuredHeight();
    }

    @Override // android.view.View
    public final void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        zi captionMessage;
        TLRPC.User a22;
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        StringBuilder sb2 = new StringBuilder();
        String str = this.M0;
        if (str != null) {
            sb2.append(str);
            sb2.append(". ");
        } else if (this.K0 == 1) {
            org.telegram.messenger.camera.q.q(null, 2131754136, sb2, ". ");
        } else {
            if (this.i2 != null) {
                org.telegram.messenger.camera.q.q(null, 2131754777, sb2, ". ");
            }
            if (!this.Q || this.O == null) {
                TLRPC.User user = this.g2;
                if (user != null) {
                    if (l10.z(user)) {
                        sb2.append(bd.M0(2131746274, null));
                    } else if (l10.s(this.g2)) {
                        sb2.append(bd.M0(2131754252, null));
                    } else {
                        if (this.g2.bot) {
                            org.telegram.messenger.camera.q.q(null, 2131753156, sb2, ". ");
                        }
                        TLRPC.User user2 = this.g2;
                        if (user2.self) {
                            sb2.append(bd.M0(2131745911, null));
                        } else {
                            sb2.append(org.telegram.messenger.g5.m(0, user2.first_name, user2.last_name));
                        }
                    }
                    sb2.append(". ");
                } else {
                    TLRPC.Chat chat = this.h2;
                    if (chat != null) {
                        if (chat.broadcast) {
                            sb2.append(bd.M0(2131754904, null));
                        } else {
                            sb2.append(bd.M0(2131754876, null));
                        }
                        sb2.append(". ");
                        sb2.append(this.h2.title);
                        sb2.append(". ");
                    }
                }
            } else {
                org.telegram.messenger.camera.q.q(null, 2131754746, sb2, ". ");
                sb2.append(this.O.title);
                sb2.append(". ");
            }
        }
        if (this.k4) {
            org.telegram.messenger.camera.q.q(null, 2131754739, sb2, ". ");
        }
        if (this.a1) {
            org.telegram.messenger.camera.q.q(null, 2131754829, sb2, ". ");
        }
        if (X()) {
            org.telegram.messenger.camera.q.q(null, 2131754741, sb2, ". ");
        }
        int i3 = this.T0;
        if (i3 > 0) {
            sb2.append(bd.G(i3, "NewMessages", new Object[0]));
            sb2.append(". ");
        }
        int i10 = this.V0;
        if (i10 > 0) {
            sb2.append(bd.G(i10, "AccDescrMentionCount", new Object[0]));
            sb2.append(". ");
        }
        if (this.W0 > 0) {
            org.telegram.messenger.camera.q.q(null, 2131754841, sb2, ". ");
        }
        zi ziVar = this.g1;
        if (ziVar == null || this.K0 != 0) {
            accessibilityEvent.setContentDescription(sb2);
            setContentDescription(sb2);
            return;
        }
        int i11 = this.S0;
        if (i11 == 0) {
            i11 = ziVar.k.date;
        }
        String s6 = bd.s(i11, true);
        if (this.g1.O3()) {
            sb2.append(bd.a0("AccDescrSentDate", null, 2131754765, s6));
        } else {
            sb2.append(bd.a0("AccDescrReceivedDate", null, 2131754789, s6));
        }
        sb2.append(". ");
        if (this.h2 != null && !this.g1.O3() && this.g1.q3() && this.g1.k.action == null && (a22 = hp.s1(this.G0).a2(Long.valueOf(this.g1.k.from_id.user_id))) != null) {
            sb2.append(org.telegram.messenger.g5.m(0, a22.first_name, a22.last_name));
            sb2.append(". ");
        }
        if (this.i2 == null) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(this.g1.v);
            if (!this.g1.G3() && (captionMessage = getCaptionMessage()) != null && !TextUtils.isEmpty(captionMessage.z)) {
                if (sb3.length() > 0) {
                    sb3.append(". ");
                }
                sb3.append(captionMessage.z);
            }
            StaticLayout staticLayout = this.f3;
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
        if (this.j0 != 0.0f || this.Q || this.G || !this.v0.a(this, motionEvent)) {
            p2 p2Var = this.e0;
            if (p2Var == null || p2Var.m()) {
                if (this.F1) {
                    boolean contains = this.I1.contains(motionEvent.getX(), motionEvent.getY());
                    int action = motionEvent.getAction();
                    gc gcVar = this.G1;
                    if (action == 0 || motionEvent.getAction() == 2) {
                        gcVar.c(contains);
                    } else {
                        if (gcVar.i && motionEvent.getAction() == 1) {
                            gi.j8 j8Var = this.L1;
                            if (j8Var != null) {
                                j8Var.a(this.g2);
                            }
                            gcVar.c(false);
                            return true;
                        }
                        if (gcVar.i && motionEvent.getAction() == 3) {
                            gcVar.c(false);
                            return true;
                        }
                    }
                }
                if (this.g0) {
                    nc ncVar = this.d0;
                    if (ncVar != null) {
                        if (this.i3 != null) {
                            int i3 = this.k1;
                            if (i3 != 0) {
                                if (i3 != 7) {
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
    public final boolean performAccessibilityAction(int i3, Bundle bundle) {
        uw uwVar;
        if (i3 != R.id.acc_action_chat_preview || (uwVar = this.E4) == null) {
            return super.performAccessibilityAction(i3, bundle);
        }
        uwVar.T4(this);
        return true;
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (getParent() != null && getParent().isLayoutRequested()) {
            getParent().requestLayout();
        }
        super.requestLayout();
    }

    public void setArchivedPullAnimation(ng0 ng0Var) {
        this.f2 = ng0Var;
    }

    public void setBottomClip(int i3) {
        this.w1 = i3;
    }

    public void setClipProgress(float f10) {
        this.u1 = f10;
        invalidate();
    }

    public void setCurrentDialogId(long j10) {
        this.I0 = j10;
    }

    public void setCustomMessage(String str) {
        if (TextUtils.equals(this.J0, str)) {
            return;
        }
        this.J0 = str;
        x();
        requestLayout();
    }

    public void setCustomMessageWithoutRebuild(String str) {
        this.J0 = str;
    }

    public void setDialog(o2 o2Var) {
        this.H0 = o2Var;
        this.m1 = 0;
        i0(0, true);
        A();
        z();
        y();
        B();
    }

    public void setDialogCellDelegate(p2 p2Var) {
        this.e0 = p2Var;
    }

    public void setDialogSelected(boolean z10) {
        if (this.r4 != z10) {
            invalidate();
        }
        this.r4 = z10;
    }

    public void setIsTransitionSupport(boolean z10) {
        this.k0 = z10;
    }

    public void setMoving(boolean z10) {
        this.r = z10;
    }

    public void setOpenBotButton(boolean z10) {
        if (this.F1 == z10) {
            return;
        }
        if (this.J1 == null) {
            this.J1 = new ly0(bd.M0(2131753020, null), 14.0f, org.telegram.messenger.g0.o());
        }
        this.F1 = z10;
        this.G1.c(false);
    }

    public void setPinForced(boolean z10) {
        this.C3 = z10;
        if (getMeasuredWidth() > 0 && getMeasuredHeight() > 0) {
            x();
        }
        invalidate();
    }

    public void setPreloader(kg.j jVar) {
        this.t4 = jVar;
    }

    public void setRightFragmentOpenedProgress(float f10) {
        if (this.j0 != f10) {
            this.j0 = f10;
            invalidate();
        }
    }

    public void setSliding(boolean z10) {
        this.y1 = z10;
    }

    public void setTitleOverride(String str) {
        this.M0 = str;
    }

    public void setTopClip(int i3) {
        this.v1 = i3;
    }

    @Override // android.view.View
    public void setTranslationX(float f10) {
        if (f10 == this.x1) {
            return;
        }
        this.x1 = f10;
        ch0 ch0Var = this.z1;
        if (ch0Var != null && f10 == 0.0f) {
            ch0Var.T(true, 0.0f);
            this.A1 = false;
            this.n1 = az.q1;
            this.C1 = 0.0f;
            this.y1 = false;
        }
        float f11 = this.x1;
        if (f11 != 0.0f) {
            this.y1 = true;
        } else {
            this.D1 = 0.0f;
            this.C1 = 0.0f;
            this.B1 = false;
        }
        if (this.y1 && !this.x) {
            boolean z10 = this.B1;
            boolean z11 = Math.abs(f11) >= ((float) getMeasuredWidth()) * 0.45f;
            this.B1 = z11;
            if (z10 != z11 && this.n1 == az.q1) {
                try {
                    performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
            }
        }
        invalidate();
    }

    public void setVisible(boolean z10) {
        if (this.A0 == z10) {
            return;
        }
        this.A0 = z10;
        if (z10) {
            invalidate();
        }
    }

    @Override // org.telegram.ui.ActionBar.z5
    public void updateColors() {
        try {
            if (isAttachedToWindow()) {
                if (this.I0 == 0 && this.H0 == null) {
                    return;
                }
                i0(0, true);
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final CharSequence w(CharSequence charSequence) {
        if (this.S1 <= 0) {
            return charSequence;
        }
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(charSequence);
        valueOf.insert(0, (CharSequence) " ");
        valueOf.setSpan(new r2(org.telegram.messenger.g0.L(((this.M4 + 2) * this.S1) + 3)), 0, 1, 33);
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
    
        if (org.telegram.messenger.t3.n0(r55.h2) != false) goto L587;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1595:0x0b4c, code lost:
    
        if (rg.c.k(r55.g1) == false) goto L567;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1735:0x0f79, code lost:
    
        if (org.telegram.messenger.zi.P2(r55.g1.k.rich_message.blocks.get(0)) != false) goto L797;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1907:0x0636, code lost:
    
        if (r2.kicked != false) goto L320;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1911:0x0640, code lost:
    
        if (r55.Q == false) goto L320;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1922:0x0604, code lost:
    
        if (r3.reply_to_msg_id == 0) goto L320;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1928:0x0610, code lost:
    
        if (r55.T0 != 0) goto L320;
     */
    /* JADX WARN: Code restructure failed: missing block: B:416:0x244c, code lost:
    
        if (org.telegram.messenger.az.p1 == false) goto L1810;
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
        int i3;
        float f10;
        float f11;
        boolean z10;
        char c2;
        int i10;
        CharSequence charSequence;
        long j10;
        boolean z11;
        boolean z12;
        int i11;
        boolean z13;
        TLRPC.DraftMessage draftMessage;
        TLRPC.DraftMessage draftMessage2;
        TLRPC.DraftMessage draftMessage3;
        boolean z14;
        CharSequence charSequence2;
        boolean z15;
        CharSequence charSequence3;
        int i12;
        boolean z16;
        CharSequence charSequence4;
        String L0;
        CharSequence charSequence5;
        boolean z17;
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
        boolean z18;
        zi ziVar;
        CharSequence charSequence12;
        CharSequence charSequence13;
        CharSequence N2;
        CharSequence charSequence14;
        char c10;
        String str2;
        boolean z19;
        SpannableStringBuilder spannableStringBuilder;
        CharSequence charSequence15;
        boolean V;
        String G;
        char c11;
        int i14;
        String G2;
        zi ziVar2;
        TLRPC.Message message;
        String str3;
        int i15;
        CharSequence l10;
        CharSequence charSequence16;
        CharSequence x12;
        tz tzVar;
        TLRPC.User user;
        zi ziVar3;
        TLRPC.User user2;
        CharSequence charSequence17;
        CharSequence charSequence18;
        CharSequence L;
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
        zi ziVar4;
        boolean z20;
        String str7;
        hp s12;
        String str8;
        String str9;
        CharSequence U;
        CharSequence charSequence24;
        CharSequence charSequence25;
        boolean z21;
        int i16;
        CharSequence charSequence26;
        int i17;
        boolean z22;
        String str10;
        boolean z23;
        boolean z24;
        boolean z25;
        String str11;
        zi ziVar5;
        TLRPC.Message message2;
        TLRPC.TL_textWithEntities tL_textWithEntities;
        int i18;
        TLRPC.Chat chat;
        zi ziVar6;
        CharSequence charSequence27;
        float f12;
        float f13;
        int i19;
        int i20;
        boolean z26;
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        int L2;
        int L3;
        int L4;
        int i21;
        int i22;
        ImageReceiver[] imageReceiverArr;
        int i23;
        int i24;
        ui.f fVar;
        boolean z27;
        int i25;
        CharSequence charSequence28;
        int L5;
        int i26;
        ImageReceiver[] imageReceiverArr2;
        zi ziVar7;
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
        int L6;
        int i29;
        int i30;
        CharSequence x13;
        zi ziVar8;
        ui.f fVar2;
        float f19;
        int L7;
        int L8;
        ui.f fVar3;
        int L9;
        CharSequence x14;
        CharSequence charSequence31;
        SpannableStringBuilder O;
        if (this.k0) {
            return;
        }
        if (this.O0 && !this.J4.a() && this.K0 == 0 && this.L0 == 0 && this.i2 == null) {
            return;
        }
        if (!this.s2) {
            int i31 = az.a;
        }
        org.telegram.ui.ActionBar.k6.B0[0].setTextSize(org.telegram.messenger.g0.L(17.0f));
        org.telegram.ui.ActionBar.k6.C0[0].setTextSize(org.telegram.messenger.g0.L(17.0f));
        org.telegram.ui.ActionBar.k6.F0[0].setTextSize(org.telegram.messenger.g0.L(16.0f));
        org.telegram.ui.ActionBar.k6.H0[0].setTextSize(org.telegram.messenger.g0.L(16.0f));
        boolean z28 = true;
        org.telegram.ui.ActionBar.k6.B0[1].setTextSize(org.telegram.messenger.g0.L(16.0f));
        org.telegram.ui.ActionBar.k6.C0[1].setTextSize(org.telegram.messenger.g0.L(16.0f));
        org.telegram.ui.ActionBar.k6.F0[1].setTextSize(org.telegram.messenger.g0.L(15.0f));
        org.telegram.ui.ActionBar.k6.H0[1].setTextSize(org.telegram.messenger.g0.L(15.0f));
        TextPaint textPaint = org.telegram.ui.ActionBar.k6.F0[1];
        int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.i9, this.K4);
        textPaint.linkColor = w02;
        textPaint.setColor(w02);
        this.F0 = 1;
        this.M4 = 18;
        this.N0 = 0;
        String str12 = null;
        CharSequence D1 = (W() || !(this.O0 || this.Q)) ? null : hp.s1(this.G0).D1(this.I0, getTopicId(), true);
        this.b0 = org.telegram.ui.ActionBar.k6.F0[this.F0];
        this.H2 = false;
        this.k4 = false;
        this.l4 = false;
        this.m4 = false;
        this.y0 = false;
        this.z0 = false;
        this.q4 = 0;
        this.A3 = false;
        this.S1 = 0;
        this.T1 = false;
        this.E2 = false;
        boolean z29 = (l10.B(this.g2) || this.v2) ? false : true;
        this.k2 = -1;
        if (!W()) {
            this.i3 = null;
        }
        setOpenBotButton(false);
        if ((this.s2 || az.p1) && this.K0 == 0 && !W() && !S()) {
            this.a0 = false;
            i3 = 2;
        } else {
            this.a0 = true;
            i3 = 1;
        }
        zi ziVar9 = this.g1;
        if (ziVar9 != null) {
            ziVar9.h6(false);
        }
        zi ziVar10 = this.g1;
        CharSequence charSequence32 = ziVar10 != null ? ziVar10.v : null;
        if (charSequence32 instanceof Spannable) {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(charSequence32);
            f11 = 16.0f;
            f10 = 17.0f;
            for (w31 w31Var : (w31[]) spannableStringBuilder2.getSpans(0, spannableStringBuilder2.length(), w31.class)) {
                spannableStringBuilder2.removeSpan(w31Var);
            }
            for (v31 v31Var : (v31[]) spannableStringBuilder2.getSpans(0, spannableStringBuilder2.length(), v31.class)) {
                spannableStringBuilder2.removeSpan(v31Var);
            }
            charSequence32 = spannableStringBuilder2;
        } else {
            f10 = 17.0f;
            f11 = 16.0f;
        }
        this.j1 = charSequence32;
        if (this.G) {
            this.A3 = true;
            z10 = false;
            z29 = false;
        } else {
            z10 = true;
        }
        o2 o2Var = this.H0;
        if (o2Var != null) {
            if (o2Var.g == 2) {
                this.H2 = true;
                if (this.s2 || az.p1) {
                    this.L2 = org.telegram.messenger.g0.L(12.5f);
                    if (bd.a0) {
                        this.K2 = (getMeasuredWidth() - org.telegram.messenger.g0.L(this.J + 6)) - org.telegram.ui.ActionBar.k6.a1.getIntrinsicWidth();
                        this.y2 = org.telegram.messenger.g0.L(22.0f);
                    } else {
                        this.K2 = org.telegram.messenger.g0.L(this.J + 6);
                        this.y2 = org.telegram.ui.ActionBar.k6.a1.getIntrinsicWidth() + org.telegram.messenger.g0.L(this.J + 10);
                    }
                } else {
                    this.L2 = org.telegram.messenger.g0.L(16.5f);
                    if (bd.a0) {
                        this.K2 = (getMeasuredWidth() - org.telegram.messenger.g0.L(this.J + 4)) - org.telegram.ui.ActionBar.k6.a1.getIntrinsicWidth();
                        this.y2 = org.telegram.messenger.g0.L(18.0f);
                    } else {
                        this.K2 = org.telegram.messenger.g0.L(this.J + 4);
                        this.y2 = org.telegram.ui.ActionBar.k6.a1.getIntrinsicWidth() + org.telegram.messenger.g0.L(this.J + 8);
                    }
                }
            } else {
                this.k4 = !this.o1 && o2Var.i;
                if (this.s2 || az.p1) {
                    if (bd.a0) {
                        this.y2 = org.telegram.messenger.g0.L(22.0f);
                    } else {
                        this.y2 = org.telegram.messenger.g0.L(this.J + 6);
                    }
                } else if (bd.a0) {
                    this.y2 = org.telegram.messenger.g0.L(18.0f);
                } else {
                    this.y2 = org.telegram.messenger.g0.L(this.J + 4);
                }
            }
            o2 o2Var2 = this.H0;
            if (o2Var2.g == 1) {
                L0 = bd.L0(2131750511);
                o2 o2Var3 = this.H0;
                if (o2Var3.j) {
                    this.b0 = org.telegram.ui.ActionBar.k6.H0[this.F0];
                    O = O(i3, this.g1.v, null);
                    O.setSpan(new tz(org.telegram.ui.ActionBar.k6.o9, this.K4), 0, O.length(), 33);
                } else {
                    String str13 = o2Var3.b;
                    if (str13.length() > 150) {
                        str13 = str13.substring(0, hs.g2);
                    }
                    O = (this.s2 || az.p1) ? O(i3, str13, L0) : O(i3, str13.replace('\n', ' '), L0);
                }
                charSequence31 = org.telegram.messenger.i6.l(O, org.telegram.ui.ActionBar.k6.F0[this.F0].getFontMetricsInt(), false);
                z21 = false;
            } else {
                charSequence31 = o2Var2.b;
                if (o2Var2.j) {
                    this.b0 = org.telegram.ui.ActionBar.k6.H0[this.F0];
                }
                z21 = true;
                L0 = null;
            }
            c2 = '\n';
            str8 = bd.e1(this.H0.h);
            int i32 = this.H0.d;
            if (i32 != 0) {
                this.H3 = true;
                str7 = String.format("%d", Integer.valueOf(i32));
            } else {
                this.H3 = false;
                str7 = null;
            }
            o2 o2Var4 = this.H0;
            int i33 = o2Var4.k;
            if (i33 == 2) {
                this.R2 = true;
                this.S2 = true;
                this.T2 = false;
            } else if (i33 == 1) {
                this.R2 = false;
                this.S2 = true;
                this.T2 = false;
            } else {
                this.T2 = false;
                this.R2 = false;
                this.S2 = false;
            }
            this.u3 = false;
            charSequence24 = o2Var4.a;
            charSequence6 = charSequence31;
            charSequence26 = null;
            charSequence25 = "";
            i16 = -1;
        } else {
            c2 = '\n';
            if (this.s2 || az.p1) {
                if (bd.a0) {
                    this.y2 = org.telegram.messenger.g0.L(22.0f);
                } else {
                    this.y2 = org.telegram.messenger.g0.L(this.J + 6);
                }
            } else if (bd.a0) {
                this.y2 = org.telegram.messenger.g0.L(18.0f);
            } else {
                this.y2 = org.telegram.messenger.g0.L(this.J + 4);
            }
            if (this.i2 != null) {
                if (this.K0 == 0) {
                    this.H2 = true;
                    if (this.s2 || az.p1) {
                        this.L2 = org.telegram.messenger.g0.L(12.5f);
                        if (bd.a0) {
                            this.K2 = (getMeasuredWidth() - org.telegram.messenger.g0.L(this.J + 6)) - org.telegram.ui.ActionBar.k6.a1.getIntrinsicWidth();
                            this.y2 = org.telegram.messenger.g0.L(22.0f);
                        } else {
                            this.K2 = org.telegram.messenger.g0.L(this.J + 6);
                            this.y2 = org.telegram.ui.ActionBar.k6.a1.getIntrinsicWidth() + org.telegram.messenger.g0.L(this.J + 10);
                        }
                    } else {
                        this.L2 = org.telegram.messenger.g0.L(16.5f);
                        if (bd.a0) {
                            this.K2 = (getMeasuredWidth() - org.telegram.messenger.g0.L(this.J + 4)) - org.telegram.ui.ActionBar.k6.a1.getIntrinsicWidth();
                            this.y2 = org.telegram.messenger.g0.L(18.0f);
                        } else {
                            this.K2 = org.telegram.messenger.g0.L(this.J + 4);
                            this.y2 = org.telegram.ui.ActionBar.k6.a1.getIntrinsicWidth() + org.telegram.messenger.g0.L(this.J + 8);
                        }
                    }
                }
            } else if (this.K0 == 0 && !this.Q) {
                TLRPC.Chat chat2 = this.h2;
                if (chat2 != null) {
                    long c12 = org.telegram.messenger.m5.c(chat2);
                    TLRPC.Chat chat3 = this.h2;
                    if (chat3.scam) {
                        this.q4 = 1;
                        org.telegram.ui.ActionBar.k6.g1.a();
                    } else if (chat3.fake) {
                        this.q4 = 2;
                        org.telegram.ui.ActionBar.k6.h1.a();
                    } else if (org.telegram.messenger.m5.f(chat3.emoji_status) != 0) {
                        this.m4 = true;
                        this.E2 = true;
                        org.telegram.ui.Components.e5 e5Var = this.o4;
                        e5Var.a = bd.a0;
                        e5Var.j(org.telegram.messenger.m5.f(this.h2.emoji_status), false);
                        this.o4.m(org.telegram.messenger.m5.B(this.h2.emoji_status), false);
                    } else {
                        boolean z30 = this.o1;
                        this.k4 = !z30 && this.h2.verified;
                        this.l4 = (z30 || this.h2.bot_verification_icon == 0) ? false : true;
                    }
                    charSequence = charSequence32;
                    j10 = c12;
                    i10 = i3;
                } else {
                    TLRPC.User user3 = this.g2;
                    if (user3 != null) {
                        j10 = org.telegram.messenger.m5.c(user3);
                        TLRPC.User user4 = this.g2;
                        if (user4.scam) {
                            this.q4 = 1;
                            org.telegram.ui.ActionBar.k6.g1.a();
                        } else if (user4.fake) {
                            this.q4 = 2;
                            org.telegram.ui.ActionBar.k6.h1.a();
                        } else {
                            boolean z31 = this.o1;
                            this.k4 = !z31 && user4.verified;
                            if (z31 || l10.B(user4)) {
                                charSequence = charSequence32;
                            } else {
                                charSequence = charSequence32;
                                if (this.g2.bot_verification_icon != 0) {
                                    z11 = true;
                                    this.l4 = z11;
                                    hp.s1(this.G0);
                                    if (hp.B2(this.g2)) {
                                        long j11 = h10.i(this.G0).n;
                                        i10 = i3;
                                        long j12 = this.g2.id;
                                        if (j11 != j12 && j12 != 0) {
                                            z12 = true;
                                            this.m4 = z12;
                                            if (z12) {
                                                Long h = l10.h(this.g2);
                                                org.telegram.ui.Components.e5 e5Var2 = this.o4;
                                                e5Var2.a = bd.a0;
                                                if (h != null) {
                                                    this.E2 = true;
                                                    e5Var2.j(h.longValue(), false);
                                                    this.o4.m(org.telegram.messenger.m5.B(this.g2.emoji_status), false);
                                                } else {
                                                    this.E2 = true;
                                                    e5Var2.g((Drawable) ha.e.d().f, false);
                                                    this.o4.m(false, false);
                                                }
                                            }
                                        }
                                    } else {
                                        i10 = i3;
                                    }
                                    z12 = false;
                                    this.m4 = z12;
                                    if (z12) {
                                    }
                                }
                            }
                            z11 = false;
                            this.l4 = z11;
                            hp.s1(this.G0);
                            if (hp.B2(this.g2)) {
                            }
                            z12 = false;
                            this.m4 = z12;
                            if (z12) {
                            }
                        }
                        charSequence = charSequence32;
                        hp.s1(this.G0);
                        if (hp.B2(this.g2)) {
                        }
                        z12 = false;
                        this.m4 = z12;
                        if (z12) {
                        }
                    } else {
                        i10 = i3;
                        charSequence = charSequence32;
                        j10 = 0;
                    }
                }
                if (j10 != 0 && this.l4) {
                    this.p4.j(j10, false);
                }
                i11 = this.S0;
                if (i11 == 0 && (ziVar6 = this.g1) != null) {
                    i11 = ziVar6.k.date;
                }
                if (!this.Q) {
                    boolean z32 = li.b0(this.G0).S(this.I0, (long) getTopicId()) != null;
                    this.l2 = z32;
                    TLRPC.DraftMessage R = !z32 ? li.b0(this.G0).R(this.I0, getTopicId()) : null;
                    this.m2 = R;
                    if (R != null && TextUtils.isEmpty(R.message)) {
                        this.m2 = null;
                    }
                } else if (this.O0 || this.t0) {
                    boolean z33 = li.b0(this.G0).S(this.I0, (long) getTopicId()) != null;
                    this.l2 = z33;
                    this.m2 = !z33 ? li.b0(this.G0).R(this.I0, 0L) : null;
                } else {
                    this.l2 = false;
                    this.m2 = null;
                }
                z13 = this.l2;
                if (!z13 || this.m2 != null) {
                    if (!z13 && (draftMessage2 = this.m2) != null && TextUtils.isEmpty(draftMessage2.message)) {
                        draftMessage3 = this.m2;
                        if (draftMessage3.rich_message == null) {
                            TLRPC.InputReplyTo inputReplyTo = draftMessage3.reply_to;
                            if (inputReplyTo == null) {
                            }
                            this.m2 = null;
                            this.l2 = false;
                            if (W()) {
                                this.m2 = null;
                                this.l2 = false;
                                this.W = true;
                                j0();
                                L0 = org.telegram.messenger.t3.p0(this.h2) ? null : org.telegram.messenger.g0.U(getMessageNameString());
                                if (org.telegram.messenger.t3.p0(this.h2)) {
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
                                zi ziVar11 = this.g1;
                                String R2 = this.g1 != null ? R(i18, L0, ziVar11 != null ? hp.s1(ziVar11.I1).F1(this.g1.k.restriction_reason) : null, true) : "";
                                CharSequence charSequence33 = R2;
                                if (this.f0) {
                                    int length = R2.length();
                                    charSequence33 = R2;
                                    charSequence33 = R2;
                                    if (length >= 0 && L0 != null) {
                                        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(R2);
                                        valueOf.setSpan(new tz(org.telegram.ui.ActionBar.k6.X8, this.K4), 0, Math.min(valueOf.length(), L0.length() + 1), 0);
                                        charSequence33 = valueOf;
                                    }
                                }
                                this.b0 = org.telegram.ui.ActionBar.k6.F0[this.F0];
                                z16 = z10;
                                charSequence22 = charSequence33;
                            } else {
                                int i34 = i10;
                                if (TextUtils.isEmpty(this.J0)) {
                                    if (D1 != null) {
                                        this.j2 = D1;
                                        z14 = z29;
                                        charSequence2 = charSequence;
                                        int intValue = hp.s1(this.G0).E1(this.I0, getTopicId()).intValue();
                                        this.k2 = intValue;
                                        nu0 u02 = org.telegram.ui.ActionBar.k6.u0(intValue);
                                        int L10 = u02 != null ? org.telegram.messenger.g0.L(3.0f) + u02.getIntrinsicWidth() : 0;
                                        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
                                        CharSequence replace = TextUtils.replace(D1, new String[]{"..."}, new String[]{""});
                                        i12 = this.k2 == 5 ? replace.toString().indexOf("**oo**") : -1;
                                        if (i12 >= 0) {
                                            spannableStringBuilder3.append(replace).setSpan(new r2(org.telegram.ui.ActionBar.k6.u0(this.k2).getIntrinsicWidth()), i12, i12 + 6, 0);
                                        } else {
                                            spannableStringBuilder3.append((CharSequence) " ").append(replace).setSpan(new r2(L10), 0, 1, 0);
                                        }
                                        z15 = false;
                                        charSequence3 = spannableStringBuilder3;
                                    } else {
                                        z14 = z29;
                                        charSequence2 = charSequence;
                                        this.j2 = null;
                                        this.k2 = -1;
                                        z15 = true;
                                        charSequence3 = "";
                                        i12 = -1;
                                    }
                                    if (this.l2 || this.m2 != null) {
                                        z16 = z10;
                                        charSequence4 = " ";
                                        CharSequence charSequence34 = charSequence3;
                                        L0 = bd.L0(2131751343);
                                        TLRPC.DraftMessage draftMessage4 = this.m2;
                                        if (draftMessage4 == null || !TextUtils.isEmpty(draftMessage4.message) || this.m2.rich_message != null) {
                                            TLRPC.DraftMessage draftMessage5 = this.m2;
                                            if (draftMessage5 != null && (richMessage = draftMessage5.rich_message) != null) {
                                                charSequence5 = zi.e0(richMessage, hs.g2);
                                            } else if (this.l2) {
                                                charSequence5 = bd.L0(2131753982);
                                            } else if (draftMessage5 != null) {
                                                String str14 = draftMessage5.message;
                                                int length2 = str14.length();
                                                charSequence5 = str14;
                                                if (length2 > 150) {
                                                    charSequence5 = str14.subSequence(0, hs.g2);
                                                }
                                            } else {
                                                charSequence5 = "";
                                            }
                                            SpannableString spannableString = new SpannableString(charSequence5);
                                            TLRPC.DraftMessage draftMessage6 = this.m2;
                                            if (draftMessage6 != null) {
                                                li.i(draftMessage6, spannableString);
                                                TLRPC.DraftMessage draftMessage7 = this.m2;
                                                if (draftMessage7 != null && (arrayList = draftMessage7.entities) != null) {
                                                    TextPaint textPaint2 = this.b0;
                                                    li.a(textPaint2 == null ? null : textPaint2.getFontMetricsInt(), spannableString, arrayList);
                                                }
                                            } else if (this.l2) {
                                                spannableString.setSpan(new tz(org.telegram.ui.ActionBar.k6.p9, this.K4), 0, spannableString.length(), 33);
                                            }
                                            SpannableStringBuilder O2 = O(i34, org.telegram.messenger.g0.N2(spannableString), L0);
                                            if ((this.s2 || az.p1) && !S()) {
                                                z17 = false;
                                            } else {
                                                z17 = false;
                                                O2.setSpan(new tz(org.telegram.ui.ActionBar.k6.j9, this.K4), 0, L0.length() + 1, 33);
                                            }
                                            charSequence9 = org.telegram.messenger.i6.l(O2, org.telegram.ui.ActionBar.k6.F0[this.F0].getFontMetricsInt(), z17);
                                        } else if ((this.s2 || az.p1) && !S()) {
                                            i13 = i12;
                                            charSequence7 = charSequence34;
                                            charSequence6 = "";
                                            z29 = z14;
                                            charSequence8 = null;
                                            z28 = false;
                                            charSequence23 = charSequence7;
                                        } else {
                                            SpannableStringBuilder valueOf2 = SpannableStringBuilder.valueOf(L0);
                                            valueOf2.setSpan(new tz(org.telegram.ui.ActionBar.k6.j9, this.K4), 0, L0.length(), 33);
                                            charSequence9 = valueOf2;
                                        }
                                        charSequence6 = charSequence9;
                                        i13 = i12;
                                        charSequence7 = charSequence34;
                                        z29 = z14;
                                        charSequence8 = null;
                                        z28 = false;
                                        charSequence23 = charSequence7;
                                    } else {
                                        if (this.i1) {
                                            this.b0 = org.telegram.ui.ActionBar.k6.H0[this.F0];
                                            Z = bd.L0(2131749302);
                                        } else {
                                            zi ziVar12 = this.g1;
                                            if (ziVar12 != null) {
                                                String F1 = hp.s1(ziVar12.I1).F1(this.g1.k.restriction_reason);
                                                long Z0 = this.g1.Z0();
                                                if (org.telegram.messenger.m5.E(Z0)) {
                                                    hp.s1(this.G0).a2(Long.valueOf(Z0));
                                                    M0 = null;
                                                } else {
                                                    M0 = hp.s1(this.G0).M0(Long.valueOf(-Z0));
                                                }
                                                this.M3 = true;
                                                if (this.k1 == 0) {
                                                    charSequence10 = " ";
                                                    if (this.I0 > 0 && this.g1.Q3() && (tL_messageReactions = this.g1.k.reactions) != null && (arrayList2 = tL_messageReactions.recent_reactions) != null && !arrayList2.isEmpty() && this.W0 > 0) {
                                                        TLRPC.MessagePeerReaction messagePeerReaction = this.g1.k.reactions.recent_reactions.get(0);
                                                        if (messagePeerReaction.unread) {
                                                            long j13 = messagePeerReaction.peer_id.user_id;
                                                            if (j13 != 0 && j13 != h10.i(this.G0).n) {
                                                                dh.n0 d = dh.n0.d(messagePeerReaction.reaction);
                                                                this.b0 = org.telegram.ui.ActionBar.k6.H0[this.F0];
                                                                String str15 = d.f;
                                                                if (str15 != null) {
                                                                    z18 = true;
                                                                    str = bd.Z(2131746411, str15);
                                                                    charSequence11 = charSequence3;
                                                                    z16 = z10;
                                                                } else {
                                                                    String Z2 = bd.Z(2131746411, "**reaction**");
                                                                    int indexOf = Z2.indexOf("**reaction**");
                                                                    ?? spannableStringBuilder4 = new SpannableStringBuilder(Z2.replace("**reaction**", "d"));
                                                                    charSequence11 = charSequence3;
                                                                    z16 = z10;
                                                                    long j14 = d.g;
                                                                    TextPaint textPaint3 = this.b0;
                                                                    spannableStringBuilder4.setSpan(new org.telegram.ui.Components.p5(j14, textPaint3 == null ? null : textPaint3.getFontMetricsInt()), indexOf, indexOf + 1, 0);
                                                                    str = spannableStringBuilder4;
                                                                    z18 = true;
                                                                }
                                                                if (z18) {
                                                                    int i35 = this.k1;
                                                                    if (i35 == 2) {
                                                                        TLRPC.Chat chat4 = this.h2;
                                                                        if (chat4 != null) {
                                                                            if (org.telegram.messenger.t3.T(chat4)) {
                                                                                TLRPC.Chat chat5 = this.h2;
                                                                                if (!chat5.megagroup) {
                                                                                    int i36 = chat5.participants_count;
                                                                                    str5 = i36 != 0 ? bd.I(i36, "Subscribers") : !org.telegram.messenger.t3.t0(chat5) ? bd.L0(2131752329).toLowerCase() : bd.L0(2131752318).toLowerCase();
                                                                                }
                                                                            }
                                                                            TLRPC.Chat chat6 = this.h2;
                                                                            int i37 = chat6.participants_count;
                                                                            str5 = i37 != 0 ? bd.I(i37, "Members") : chat6.has_geo ? bd.L0(2131748650) : !org.telegram.messenger.t3.t0(chat6) ? bd.L0(2131748649).toLowerCase() : bd.L0(2131748646).toLowerCase();
                                                                        } else {
                                                                            str5 = "";
                                                                        }
                                                                        this.M3 = false;
                                                                        str4 = str5;
                                                                    } else if (i35 == 3 && l10.B(this.g2)) {
                                                                        uw uwVar = this.E4;
                                                                        str4 = bd.L0((uwVar == null || !uwVar.P0) ? 2131745906 : 2131745905);
                                                                    } else {
                                                                        boolean z34 = this.s2;
                                                                        if (!z34 && !az.p1 && this.L0 != 0) {
                                                                            L = N();
                                                                        } else if (z34 || az.p1 || this.K0 == 0) {
                                                                            zi ziVar13 = this.g1;
                                                                            if (!(ziVar13.k instanceof TLRPC.TL_messageService) || (zi.F4(ziVar13) && !(this.g1.k.action instanceof TLRPC.TL_messageActionTopicCreate))) {
                                                                                CharSequence charSequence35 = charSequence2;
                                                                                this.W = true;
                                                                                j0();
                                                                                String U2 = (this.s0 || (user2 = this.g2) == null || !user2.self || this.g1.Q3()) ? null : org.telegram.messenger.g0.U(getMessageNameString());
                                                                                if ((!this.s0 || (user = this.g2) == null || user.self || (ziVar3 = this.g1) == null || !ziVar3.Q3()) && U2 == null && ((ziVar = this.g1) == null || (message = ziVar.k) == null || message.guestchat_via_from == null)) {
                                                                                    TLRPC.Chat chat7 = this.h2;
                                                                                    if (chat7 != null) {
                                                                                        long j15 = chat7.id;
                                                                                        if (j15 > 0) {
                                                                                            if (M0 != null) {
                                                                                            }
                                                                                            if (org.telegram.messenger.t3.T(chat7)) {
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    TLRPC.User user5 = this.g2;
                                                                                    if (user5 == null || user5.id != 489000 || (ziVar2 = this.g1) == null || ziVar2.W0() == null) {
                                                                                        boolean isEmpty = TextUtils.isEmpty(F1);
                                                                                        CharSequence charSequence36 = F1;
                                                                                        if (isEmpty) {
                                                                                            if (zi.F4(this.g1)) {
                                                                                                zi ziVar14 = this.g1;
                                                                                                CharSequence charSequence37 = ziVar14.w;
                                                                                                if (charSequence37 == null || ((ziVar14.k.action instanceof TLRPC.TL_messageActionTopicCreate) && this.Q)) {
                                                                                                    charSequence37 = ziVar14.v;
                                                                                                }
                                                                                                CharSequence charSequence38 = charSequence37;
                                                                                                charSequence36 = charSequence38;
                                                                                                if (ziVar14.g2[0] instanceof rg.a) {
                                                                                                    TLRPC.TL_forumTopic f20 = hp.s1(this.G0).S1().f(-this.g1.A0(), zi.b2(this.G0, this.g1.k, true));
                                                                                                    charSequence36 = charSequence38;
                                                                                                    if (f20 != null) {
                                                                                                        ((rg.a) this.g1.g2[0]).b(f20.icon_color);
                                                                                                        charSequence36 = charSequence38;
                                                                                                    }
                                                                                                }
                                                                                            } else {
                                                                                                TLRPC.MessageMedia messageMedia = this.g1.k.media;
                                                                                                if ((messageMedia instanceof TLRPC.TL_messageMediaPhoto) && (messageMedia.photo instanceof TLRPC.TL_photoEmpty) && messageMedia.ttl_seconds != 0) {
                                                                                                    charSequence36 = bd.L0(2131753947);
                                                                                                } else {
                                                                                                    if (messageMedia instanceof TLRPC.TL_messageMediaDocument) {
                                                                                                        TLRPC.Document document = messageMedia.document;
                                                                                                        if (((document instanceof TLRPC.TL_documentEmpty) || document == null) && messageMedia.ttl_seconds != 0) {
                                                                                                            charSequence36 = messageMedia.voice ? bd.L0(2131753929) : messageMedia.round ? bd.L0(2131753940) : bd.L0(2131753932);
                                                                                                        }
                                                                                                    }
                                                                                                    String str16 = "🎧 ";
                                                                                                    if (getCaptionMessage() == null || (this.g1.k.media instanceof TLRPC.TL_messageMediaPoll)) {
                                                                                                        zi ziVar15 = this.g1;
                                                                                                        TLRPC.Message message3 = ziVar15.k;
                                                                                                        TLRPC.MessageMedia messageMedia2 = message3.media;
                                                                                                        if (messageMedia2 instanceof TLRPC.TL_messageMediaPaidMedia) {
                                                                                                            int size = ((TLRPC.TL_messageMediaPaidMedia) messageMedia2).extended_media.size();
                                                                                                            if (this.T1) {
                                                                                                                i14 = 1;
                                                                                                                if (size > 1) {
                                                                                                                    c11 = 0;
                                                                                                                    G2 = bd.G(size, "Media", new Object[0]);
                                                                                                                } else {
                                                                                                                    c11 = 0;
                                                                                                                    G2 = bd.L0(2131753933);
                                                                                                                }
                                                                                                            } else {
                                                                                                                c11 = 0;
                                                                                                                i14 = 1;
                                                                                                                G2 = size > 1 ? bd.G(size, "Photos", new Object[0]) : bd.L0(2131753948);
                                                                                                            }
                                                                                                            Object[] objArr = new Object[i14];
                                                                                                            objArr[c11] = G2;
                                                                                                            SpannableStringBuilder T0 = wb.T0(bd.Z(2131753949, objArr));
                                                                                                            this.b0 = org.telegram.ui.ActionBar.k6.H0[this.F0];
                                                                                                            charSequence36 = T0;
                                                                                                        } else if (this.S1 > 1) {
                                                                                                            if (this.T1) {
                                                                                                                ArrayList arrayList3 = this.h1;
                                                                                                                G = bd.G(arrayList3 == null ? 0 : arrayList3.size(), "Media", new Object[0]);
                                                                                                            } else {
                                                                                                                ArrayList arrayList4 = this.h1;
                                                                                                                G = bd.G(arrayList4 == null ? 0 : arrayList4.size(), "Photos", new Object[0]);
                                                                                                            }
                                                                                                            charSequence36 = G;
                                                                                                            this.b0 = org.telegram.ui.ActionBar.k6.H0[this.F0];
                                                                                                        } else {
                                                                                                            if (messageMedia2 instanceof TLRPC.TL_messageMediaGiveaway) {
                                                                                                                TLRPC.MessageFwdHeader messageFwdHeader = message3.fwd_from;
                                                                                                                if (messageFwdHeader != null) {
                                                                                                                    TLRPC.Peer peer = messageFwdHeader.from_id;
                                                                                                                    if (peer instanceof TLRPC.TL_peerChannel) {
                                                                                                                        V = org.telegram.messenger.t3.U(this.G0, peer.channel_id);
                                                                                                                        charSequence15 = bd.L0(!V ? 2131753482 : 2131753476);
                                                                                                                    }
                                                                                                                }
                                                                                                                V = org.telegram.messenger.t3.V(this.h2);
                                                                                                                charSequence15 = bd.L0(!V ? 2131753482 : 2131753476);
                                                                                                            } else if (messageMedia2 instanceof TLRPC.TL_messageMediaGiveawayResults) {
                                                                                                                charSequence15 = bd.L0(2131753392);
                                                                                                            } else if (messageMedia2 instanceof TLRPC.TL_messageMediaPoll) {
                                                                                                                TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) messageMedia2;
                                                                                                                TLRPC.TL_textWithEntities tL_textWithEntities2 = tL_messageMediaPoll.poll.question;
                                                                                                                if (tL_textWithEntities2 == null || tL_textWithEntities2.entities == null) {
                                                                                                                    z19 = false;
                                                                                                                    spannableStringBuilder = ph.a.a(R.drawable.dialog_media_poll_20, tL_textWithEntities2.text, false);
                                                                                                                } else {
                                                                                                                    SpannableString spannableString2 = new SpannableString(tL_messageMediaPoll.poll.question.text);
                                                                                                                    TLRPC.TL_textWithEntities tL_textWithEntities3 = tL_messageMediaPoll.poll.question;
                                                                                                                    li.g(tL_textWithEntities3.entities, tL_textWithEntities3.text, spannableString2, -1);
                                                                                                                    li.a(org.telegram.ui.ActionBar.k6.F0[this.F0].getFontMetricsInt(), spannableString2, tL_messageMediaPoll.poll.question.entities);
                                                                                                                    z19 = false;
                                                                                                                    spannableStringBuilder = ph.a.a(R.drawable.dialog_media_poll_20, spannableString2, false);
                                                                                                                }
                                                                                                                charSequence15 = spannableStringBuilder;
                                                                                                            } else if (messageMedia2 instanceof TLRPC.TL_messageMediaToDo) {
                                                                                                                TLRPC.TL_messageMediaToDo tL_messageMediaToDo = (TLRPC.TL_messageMediaToDo) messageMedia2;
                                                                                                                TLRPC.TL_textWithEntities tL_textWithEntities4 = tL_messageMediaToDo.todo.title;
                                                                                                                if (tL_textWithEntities4 == null || tL_textWithEntities4.entities == null) {
                                                                                                                    charSequence15 = ph.a.a(R.drawable.dialog_media_checklist_20, tL_textWithEntities4.text, false);
                                                                                                                } else {
                                                                                                                    SpannableString spannableString3 = new SpannableString(tL_messageMediaToDo.todo.title.text);
                                                                                                                    TLRPC.TL_textWithEntities tL_textWithEntities5 = tL_messageMediaToDo.todo.title;
                                                                                                                    li.g(tL_textWithEntities5.entities, tL_textWithEntities5.text, spannableString3, -1);
                                                                                                                    li.a(org.telegram.ui.ActionBar.k6.F0[this.F0].getFontMetricsInt(), spannableString3, tL_messageMediaToDo.todo.title.entities);
                                                                                                                    charSequence15 = ph.a.a(R.drawable.dialog_media_checklist_20, spannableString3, false);
                                                                                                                }
                                                                                                            } else if (messageMedia2 instanceof TLRPC.TL_messageMediaGame) {
                                                                                                                charSequence15 = ph.a.a(R.drawable.dialog_media_game_20, messageMedia2.game.title, false);
                                                                                                            } else if (messageMedia2 instanceof TLRPC.TL_messageMediaInvoice) {
                                                                                                                charSequence15 = messageMedia2.title;
                                                                                                            } else if (ziVar15.D == 14) {
                                                                                                                charSequence15 = com.google.android.recaptcha.internal.a.k("🎧 ", ziVar15.x1(true), " - ", this.g1.z1(true));
                                                                                                            } else if (!(messageMedia2 instanceof TLRPC.TL_messageMediaStory) || !messageMedia2.via_mention) {
                                                                                                                if (!ziVar15.s2() || TextUtils.isEmpty(this.g1.k.message)) {
                                                                                                                    SpannableString spannableString4 = new SpannableString(charSequence35);
                                                                                                                    zi ziVar16 = this.g1;
                                                                                                                    if (ziVar16 != null) {
                                                                                                                        ziVar16.V5();
                                                                                                                    }
                                                                                                                    zi ziVar17 = this.g1;
                                                                                                                    Pattern pattern = li.S1;
                                                                                                                    li.g(ziVar17.k.entities, ziVar17.v, spannableString4, hs.n4);
                                                                                                                    zi ziVar18 = this.g1;
                                                                                                                    charSequence14 = spannableString4;
                                                                                                                    if (ziVar18 != null) {
                                                                                                                        TLRPC.Message message4 = ziVar18.k;
                                                                                                                        charSequence14 = spannableString4;
                                                                                                                        if (message4 != null) {
                                                                                                                            ArrayList<TLRPC.MessageEntity> arrayList5 = message4.entities;
                                                                                                                            TextPaint textPaint4 = this.b0;
                                                                                                                            li.a(textPaint4 == null ? null : textPaint4.getFontMetricsInt(), spannableString4, arrayList5);
                                                                                                                            charSequence14 = spannableString4;
                                                                                                                        }
                                                                                                                    }
                                                                                                                } else {
                                                                                                                    CharSequence charSequence39 = this.g1.a2;
                                                                                                                    int measuredWidth = getMeasuredWidth() - org.telegram.messenger.g0.L(this.J + 23);
                                                                                                                    zi ziVar19 = this.g1;
                                                                                                                    charSequence14 = charSequence39;
                                                                                                                    if (ziVar19.Z1) {
                                                                                                                        charSequence14 = org.telegram.messenger.g0.Q(charSequence39, (String) ziVar19.Y1.get(0), measuredWidth, this.b0);
                                                                                                                    }
                                                                                                                }
                                                                                                                org.telegram.messenger.g0.x1(charSequence14, this.g1.Y1, this.K4);
                                                                                                                charSequence15 = charSequence14;
                                                                                                            } else if (ziVar15.O3()) {
                                                                                                                TLRPC.User a22 = hp.s1(this.G0).a2(Long.valueOf(this.g1.A0()));
                                                                                                                if (a22 != null) {
                                                                                                                    str2 = l10.i(a22);
                                                                                                                    int indexOf2 = str2.indexOf(32);
                                                                                                                    c10 = 0;
                                                                                                                    if (indexOf2 >= 0) {
                                                                                                                        str2 = str2.substring(0, indexOf2);
                                                                                                                    }
                                                                                                                } else {
                                                                                                                    c10 = 0;
                                                                                                                    str2 = "";
                                                                                                                }
                                                                                                                Object[] objArr2 = new Object[1];
                                                                                                                objArr2[c10] = str2;
                                                                                                                charSequence15 = bd.Z(2131744450, objArr2);
                                                                                                            } else {
                                                                                                                charSequence15 = bd.L0(2131744626);
                                                                                                            }
                                                                                                            CharSequence charSequence40 = charSequence15;
                                                                                                            zi ziVar20 = this.g1;
                                                                                                            if (ziVar20.k.media == null || ziVar20.G3()) {
                                                                                                                TL_iv.RichMessage richMessage2 = this.g1.k.rich_message;
                                                                                                                charSequence36 = charSequence40;
                                                                                                                if (richMessage2 != null) {
                                                                                                                    charSequence36 = charSequence40;
                                                                                                                    if (richMessage2.blocks.size() == 1) {
                                                                                                                        charSequence36 = charSequence40;
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                            this.b0 = org.telegram.ui.ActionBar.k6.H0[this.F0];
                                                                                                            charSequence36 = charSequence40;
                                                                                                        }
                                                                                                    } else {
                                                                                                        zi captionMessage = getCaptionMessage();
                                                                                                        if (!this.W) {
                                                                                                            str16 = "";
                                                                                                        } else if (captionMessage.I4()) {
                                                                                                            str16 = "📹 ";
                                                                                                        } else if (captionMessage.Q4()) {
                                                                                                            str16 = "🎤 ";
                                                                                                        } else if (!captionMessage.J3()) {
                                                                                                            str16 = captionMessage.S3() ? "🖼 " : "📎 ";
                                                                                                        }
                                                                                                        if (!captionMessage.s2() || TextUtils.isEmpty(captionMessage.k.message)) {
                                                                                                            SpannableString spannableString5 = new SpannableString(captionMessage.z);
                                                                                                            if (captionMessage.k != null) {
                                                                                                                captionMessage.V5();
                                                                                                                li.g(captionMessage.k.entities, captionMessage.z, spannableString5, hs.n4);
                                                                                                                ArrayList<TLRPC.MessageEntity> arrayList6 = captionMessage.k.entities;
                                                                                                                TextPaint textPaint5 = this.b0;
                                                                                                                li.a(textPaint5 == null ? null : textPaint5.getFontMetricsInt(), spannableString5, arrayList6);
                                                                                                            }
                                                                                                            charSequence36 = new SpannableStringBuilder(str16).append((CharSequence) spannableString5);
                                                                                                        } else {
                                                                                                            CharSequence charSequence41 = captionMessage.a2;
                                                                                                            int measuredWidth2 = getMeasuredWidth() - org.telegram.messenger.g0.L(this.J + 47);
                                                                                                            if (this.a0) {
                                                                                                                if (!TextUtils.isEmpty(null)) {
                                                                                                                    throw null;
                                                                                                                }
                                                                                                                measuredWidth2 = (int) (measuredWidth2 - this.b0.measureText(": "));
                                                                                                            }
                                                                                                            if (measuredWidth2 > 0 && captionMessage.Z1) {
                                                                                                                charSequence41 = org.telegram.messenger.g0.Q(charSequence41, (String) captionMessage.Y1.get(0), measuredWidth2, this.b0);
                                                                                                            }
                                                                                                            charSequence36 = new SpannableStringBuilder(str16).append(charSequence41);
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        CharSequence charSequence42 = charSequence36;
                                                                                        if (this.g1.g4()) {
                                                                                            SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder(charSequence36);
                                                                                            spannableStringBuilder5.insert(0, (CharSequence) "d ");
                                                                                            spannableStringBuilder5.setSpan(new wp(f0.d.d(getContext(), R.drawable.msg_mini_replystory).mutate()), 0, 1, 0);
                                                                                            charSequence42 = spannableStringBuilder5;
                                                                                        }
                                                                                        if (this.S1 > 0) {
                                                                                            if (!this.g1.s2() || TextUtils.isEmpty(this.g1.k.message)) {
                                                                                                int length3 = charSequence42.length();
                                                                                                CharSequence charSequence43 = charSequence42;
                                                                                                if (length3 > 150) {
                                                                                                    charSequence43 = charSequence42.subSequence(0, hs.g2);
                                                                                                }
                                                                                                N2 = org.telegram.messenger.g0.N2(charSequence43);
                                                                                            } else {
                                                                                                N2 = this.g1.a2;
                                                                                                int measuredWidth3 = getMeasuredWidth() - org.telegram.messenger.g0.L((((this.M4 + 2) * this.S1) + (this.J + 23)) + 3);
                                                                                                zi ziVar21 = this.g1;
                                                                                                if (ziVar21.Z1) {
                                                                                                    N2 = org.telegram.messenger.g0.Q(N2, (String) ziVar21.Y1.get(0), measuredWidth3, this.b0);
                                                                                                }
                                                                                            }
                                                                                            CharSequence spannableStringBuilder6 = !(N2 instanceof SpannableStringBuilder) ? new SpannableStringBuilder(N2) : N2;
                                                                                            SpannableStringBuilder spannableStringBuilder7 = (SpannableStringBuilder) spannableStringBuilder6;
                                                                                            charSequence4 = charSequence10;
                                                                                            spannableStringBuilder7.insert(0, charSequence4);
                                                                                            spannableStringBuilder7.setSpan(new r2(org.telegram.messenger.g0.L(((this.M4 + 2) * this.S1) + 3)), 0, 1, 33);
                                                                                            org.telegram.messenger.i6.l(spannableStringBuilder7, org.telegram.ui.ActionBar.k6.F0[this.F0].getFontMetricsInt(), false);
                                                                                            CharSequence charSequence44 = spannableStringBuilder6;
                                                                                            if (this.g1.s2()) {
                                                                                                CharSequence x15 = org.telegram.messenger.g0.x1(spannableStringBuilder7, this.g1.Y1, this.K4);
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
                                                                                        if (this.g1.k3() && this.g1.o5()) {
                                                                                            this.y0 = true;
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
                                                                                        if (this.L0 == 0) {
                                                                                            str6 = N();
                                                                                        } else if (this.K0 != 0) {
                                                                                            str6 = L();
                                                                                        } else {
                                                                                            z28 = z15;
                                                                                            charSequence6 = charSequence16;
                                                                                            i13 = i12;
                                                                                            charSequence19 = charSequence11;
                                                                                            L0 = str3;
                                                                                            z29 = z14;
                                                                                            charSequence20 = charSequence19;
                                                                                            charSequence8 = null;
                                                                                            charSequence23 = charSequence20;
                                                                                        }
                                                                                        z28 = z15;
                                                                                        charSequence6 = charSequence16;
                                                                                        L0 = str6;
                                                                                        i13 = i12;
                                                                                        charSequence19 = charSequence11;
                                                                                        z29 = z14;
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
                                                                                TLRPC.Chat chat8 = this.h2;
                                                                                if (chat8 != null && chat8.forum && !this.Q && !this.P) {
                                                                                    CharSequence i39 = hp.s1(this.G0).S1().i(this.h2, this.g1, this.b0);
                                                                                    if (!TextUtils.isEmpty(i39)) {
                                                                                        SpannableStringBuilder spannableStringBuilder9 = new SpannableStringBuilder("-");
                                                                                        wp wpVar2 = new wp(f0.d.d(org.telegram.messenger.t0.b, R.drawable.msg_mini_forumarrow).mutate());
                                                                                        if (!this.s2 && !az.p1) {
                                                                                            i38 = org.telegram.ui.ActionBar.k6.k9;
                                                                                        }
                                                                                        wpVar2.a(i38);
                                                                                        spannableStringBuilder9.setSpan(wpVar2, 0, 1, 0);
                                                                                        ?? spannableStringBuilder10 = new SpannableStringBuilder();
                                                                                        spannableStringBuilder10.append(U3).append((CharSequence) spannableStringBuilder9).append(i39);
                                                                                        str3 = spannableStringBuilder10;
                                                                                        SpannableStringBuilder R3 = R(i34, str3, F1, false);
                                                                                        if (!this.P || ((this.s2 || az.p1) && (this.K0 == 0 || R3.length() <= 0))) {
                                                                                            i15 = 0;
                                                                                        } else {
                                                                                            try {
                                                                                                tzVar = new tz(org.telegram.ui.ActionBar.k6.k9, this.K4);
                                                                                                i15 = str3.length() + 1;
                                                                                            } catch (Exception e10) {
                                                                                                e = e10;
                                                                                                i15 = 0;
                                                                                            }
                                                                                            try {
                                                                                                R3.setSpan(tzVar, 0, i15, 33);
                                                                                            } catch (Exception e11) {
                                                                                                e = e11;
                                                                                                org.telegram.messenger.a8.f(e);
                                                                                                l10 = org.telegram.messenger.i6.l(R3, org.telegram.ui.ActionBar.k6.F0[this.F0].getFontMetricsInt(), false);
                                                                                                if (this.g1.s2()) {
                                                                                                }
                                                                                                if (this.S1 > 0) {
                                                                                                }
                                                                                                charSequence16 = l10;
                                                                                                z15 = false;
                                                                                                if (this.L0 == 0) {
                                                                                                }
                                                                                                z28 = z15;
                                                                                                charSequence6 = charSequence16;
                                                                                                L0 = str6;
                                                                                                i13 = i12;
                                                                                                charSequence19 = charSequence11;
                                                                                                z29 = z14;
                                                                                                charSequence20 = charSequence19;
                                                                                                charSequence8 = null;
                                                                                                charSequence23 = charSequence20;
                                                                                                if (!this.y0) {
                                                                                                }
                                                                                                if (TextUtils.isEmpty(this.J0)) {
                                                                                                }
                                                                                                e12 = "";
                                                                                                ziVar4 = this.g1;
                                                                                                if (ziVar4 != null) {
                                                                                                }
                                                                                                this.R2 = false;
                                                                                                this.S2 = false;
                                                                                                this.T2 = ziVar4 == null && ziVar4.p4() && this.I0 == h10.i(this.G0).e();
                                                                                                z20 = false;
                                                                                                this.H3 = false;
                                                                                                this.c4 = false;
                                                                                                this.d4 = false;
                                                                                                this.e4 = false;
                                                                                                this.u3 = false;
                                                                                                str7 = null;
                                                                                                str12 = null;
                                                                                                this.Q2 = z20;
                                                                                                s12 = hp.s1(this.G0);
                                                                                                if (this.k1 == 0) {
                                                                                                }
                                                                                                str8 = e12;
                                                                                                str9 = this.M0;
                                                                                                if (str9 == null) {
                                                                                                }
                                                                                                z21 = z28;
                                                                                                i16 = i13;
                                                                                                z10 = z16;
                                                                                                charSequence26 = charSequence8;
                                                                                                charSequence27 = L0;
                                                                                                if (z10) {
                                                                                                }
                                                                                                if (K()) {
                                                                                                }
                                                                                                if (bd.a0) {
                                                                                                }
                                                                                                if (this.H2) {
                                                                                                }
                                                                                                if (!this.T2) {
                                                                                                }
                                                                                                if (this.a1) {
                                                                                                }
                                                                                                if (!this.m4) {
                                                                                                }
                                                                                                if (!z26) {
                                                                                                }
                                                                                                if (this.l4) {
                                                                                                }
                                                                                                L9 = this.z2 - org.telegram.messenger.g0.L(12.0f);
                                                                                                if (L9 < 0) {
                                                                                                }
                                                                                                if (charSequence24 instanceof String) {
                                                                                                }
                                                                                                if (this.E2) {
                                                                                                }
                                                                                                float f21 = L9;
                                                                                                this.S = org.telegram.ui.ActionBar.k6.B0[this.F0].measureText(charSequence24.toString()) <= f21;
                                                                                                if (!this.R) {
                                                                                                }
                                                                                                CharSequence l11 = org.telegram.messenger.i6.l(charSequence24, org.telegram.ui.ActionBar.k6.B0[this.F0].getFontMetricsInt(), false);
                                                                                                zi ziVar22 = this.g1;
                                                                                                if (ziVar22 == null) {
                                                                                                }
                                                                                                if (this.R) {
                                                                                                }
                                                                                                this.C2 = (this.E2 || !this.A2.isRtlCharAt(0)) ? f13 : -org.telegram.messenger.g0.L(f14);
                                                                                                this.D2 = this.A2.isRtlCharAt(0);
                                                                                                this.q3 = org.telegram.ui.Components.p5.update(0, (View) this, this.q3, this.A2);
                                                                                                if (this.s2) {
                                                                                                }
                                                                                                f16 = 39.0f;
                                                                                                f17 = f12;
                                                                                                f18 = 13.0f;
                                                                                                L2 = org.telegram.messenger.g0.L(11.0f);
                                                                                                this.r3 = org.telegram.messenger.g0.L(32.0f);
                                                                                                this.N2 = org.telegram.messenger.g0.L(13.0f);
                                                                                                this.v3 = org.telegram.messenger.g0.L(42.33f);
                                                                                                this.D3 = org.telegram.messenger.g0.L(43.0f);
                                                                                                this.N3 = org.telegram.messenger.g0.L(42.33f);
                                                                                                this.X2 = org.telegram.messenger.g0.L(13.0f);
                                                                                                int measuredWidth4 = getMeasuredWidth() - org.telegram.messenger.g0.L(this.J + 21);
                                                                                                if (bd.a0) {
                                                                                                }
                                                                                                i21 = L4;
                                                                                                this.v0.F.set(L3, L2, org.telegram.messenger.g0.L(56.0f) + L3, org.telegram.messenger.g0.L(56.0f) + L2);
                                                                                                i22 = 0;
                                                                                                while (true) {
                                                                                                    imageReceiverArr = this.W1;
                                                                                                    if (i22 < imageReceiverArr.length) {
                                                                                                    }
                                                                                                    imageReceiverArr[i22].y0(((this.M4 + 2) * i22) + i21, ((org.telegram.messenger.g0.L(31.0f) + L2) + (this.R ? org.telegram.messenger.g0.L(20.0f) : 0)) - ((this.s2 || az.p1 || (fVar = this.u0) == null || fVar.u()) ? 0 : org.telegram.messenger.g0.L(9.0f)), org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(18.0f));
                                                                                                    i22++;
                                                                                                    L2 = L2;
                                                                                                }
                                                                                                i23 = L2;
                                                                                                i24 = measuredWidth4;
                                                                                                if (bd.a0) {
                                                                                                }
                                                                                                if (this.R) {
                                                                                                }
                                                                                                if (!this.s2) {
                                                                                                }
                                                                                                this.N2 -= org.telegram.messenger.g0.L(6.0f);
                                                                                                this.X2 -= org.telegram.messenger.g0.L(6.0f);
                                                                                                if (getIsPinned()) {
                                                                                                }
                                                                                                if (this.u3) {
                                                                                                }
                                                                                                if (this.u3) {
                                                                                                }
                                                                                                this.I3 = z27;
                                                                                                if (z27) {
                                                                                                }
                                                                                                if (z21) {
                                                                                                }
                                                                                                int max = Math.max(org.telegram.messenger.g0.L(12.0f), i24);
                                                                                                this.h3 = org.telegram.messenger.g0.L((!this.s2 || az.p1) ? 58.0f : 62.0f);
                                                                                                if (!this.s2) {
                                                                                                }
                                                                                                this.h3 -= org.telegram.messenger.g0.L(!W() ? 10.0f : 12.0f);
                                                                                                if (!W()) {
                                                                                                }
                                                                                                if (this.R) {
                                                                                                }
                                                                                                this.o3 = org.telegram.ui.Components.p5.update(0, (View) this, this.o3, this.t3);
                                                                                                if (TextUtils.isEmpty(charSequence26)) {
                                                                                                }
                                                                                                this.p3 = org.telegram.ui.Components.p5.update(0, (View) this, this.p3, this.i3);
                                                                                                if (!TextUtils.isEmpty(charSequence25)) {
                                                                                                }
                                                                                                if (charSequence6 instanceof Spannable) {
                                                                                                }
                                                                                                if (this.s2) {
                                                                                                }
                                                                                                this.b0 = org.telegram.ui.ActionBar.k6.F0[this.F0];
                                                                                                charSequence29 = charSequence27;
                                                                                                charSequence30 = null;
                                                                                                Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
                                                                                                if (this.s2) {
                                                                                                }
                                                                                                if (this.S1 > 0) {
                                                                                                }
                                                                                                try {
                                                                                                    TextPaint textPaint6 = this.b0;
                                                                                                    float L11 = org.telegram.messenger.g0.L(1.0f);
                                                                                                    TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                                                                                                    this.f3 = lu0.b(charSequence29, textPaint6, L6, L11, L6, charSequence30 != null ? 1 : 2);
                                                                                                    i27 = L6;
                                                                                                    this.j3.addAll(this.k3);
                                                                                                    this.k3.clear();
                                                                                                    yh.f.b(this, this.f3, -2, -2, this.j3, this.k3);
                                                                                                } catch (Exception e13) {
                                                                                                    e = e13;
                                                                                                    i27 = L6;
                                                                                                    this.f3 = null;
                                                                                                    org.telegram.messenger.a8.f(e);
                                                                                                    int i40 = i27;
                                                                                                    this.n3 = org.telegram.ui.Components.p5.update(0, (View) this, this.n3, this.f3);
                                                                                                    if (bd.a0) {
                                                                                                    }
                                                                                                    staticLayout = this.g3;
                                                                                                    if (staticLayout != null) {
                                                                                                    }
                                                                                                    m0();
                                                                                                }
                                                                                                int i402 = i27;
                                                                                                this.n3 = org.telegram.ui.Components.p5.update(0, (View) this, this.n3, this.f3);
                                                                                                if (bd.a0) {
                                                                                                }
                                                                                                staticLayout = this.g3;
                                                                                                if (staticLayout != null) {
                                                                                                }
                                                                                                m0();
                                                                                            }
                                                                                        }
                                                                                        l10 = org.telegram.messenger.i6.l(R3, org.telegram.ui.ActionBar.k6.F0[this.F0].getFontMetricsInt(), false);
                                                                                        if (this.g1.s2() && (x12 = org.telegram.messenger.g0.x1(l10, this.g1.Y1, this.K4)) != null) {
                                                                                            l10 = x12;
                                                                                        }
                                                                                        if (this.S1 > 0) {
                                                                                            if (!(l10 instanceof SpannableStringBuilder)) {
                                                                                                l10 = new SpannableStringBuilder(l10);
                                                                                            }
                                                                                            SpannableStringBuilder spannableStringBuilder11 = (SpannableStringBuilder) l10;
                                                                                            if (i15 >= spannableStringBuilder11.length()) {
                                                                                                spannableStringBuilder11.append(charSequence4);
                                                                                                spannableStringBuilder11.setSpan(new r2(org.telegram.messenger.g0.L(((this.M4 + 2) * this.S1) + 3)), spannableStringBuilder11.length() - 1, spannableStringBuilder11.length(), 33);
                                                                                            } else {
                                                                                                spannableStringBuilder11.insert(i15, charSequence4);
                                                                                                spannableStringBuilder11.setSpan(new r2(org.telegram.messenger.g0.L(((this.M4 + 2) * this.S1) + 3)), i15, i15 + 1, 33);
                                                                                            }
                                                                                        }
                                                                                        charSequence16 = l10;
                                                                                        z15 = false;
                                                                                        if (this.L0 == 0) {
                                                                                        }
                                                                                        z28 = z15;
                                                                                        charSequence6 = charSequence16;
                                                                                        L0 = str6;
                                                                                        i13 = i12;
                                                                                        charSequence19 = charSequence11;
                                                                                        z29 = z14;
                                                                                        charSequence20 = charSequence19;
                                                                                        charSequence8 = null;
                                                                                        charSequence23 = charSequence20;
                                                                                    }
                                                                                }
                                                                                str3 = U3;
                                                                                SpannableStringBuilder R32 = R(i34, str3, F1, false);
                                                                                if (this.P) {
                                                                                }
                                                                                i15 = 0;
                                                                                l10 = org.telegram.messenger.i6.l(R32, org.telegram.ui.ActionBar.k6.F0[this.F0].getFontMetricsInt(), false);
                                                                                if (this.g1.s2()) {
                                                                                    l10 = x12;
                                                                                }
                                                                                if (this.S1 > 0) {
                                                                                }
                                                                                charSequence16 = l10;
                                                                                z15 = false;
                                                                                if (this.L0 == 0) {
                                                                                }
                                                                                z28 = z15;
                                                                                charSequence6 = charSequence16;
                                                                                L0 = str6;
                                                                                i13 = i12;
                                                                                charSequence19 = charSequence11;
                                                                                z29 = z14;
                                                                                charSequence20 = charSequence19;
                                                                                charSequence8 = null;
                                                                                charSequence23 = charSequence20;
                                                                            } else {
                                                                                zi ziVar23 = this.g1;
                                                                                TLRPC.MessageAction messageAction = ziVar23.k.action;
                                                                                if (messageAction instanceof TLRPC.TL_messageActionPhoneCall) {
                                                                                    TLRPC.TL_messageActionPhoneCall tL_messageActionPhoneCall = (TLRPC.TL_messageActionPhoneCall) messageAction;
                                                                                    charSequence17 = ziVar23.Q3() ? ph.a.a(tL_messageActionPhoneCall.video ? R.drawable.dialog_media_outgoing_video_call_20 : R.drawable.dialog_media_outgoing_call_20, charSequence2, false) : ph.a.a(tL_messageActionPhoneCall.video ? R.drawable.dialog_media_incoming_video_call_20 : R.drawable.dialog_media_incoming_call_20, charSequence2, false);
                                                                                } else {
                                                                                    CharSequence charSequence45 = charSequence2;
                                                                                    if (org.telegram.messenger.t3.V(this.h2) && (this.g1.k.action instanceof TLRPC.TL_messageActionChannelMigrateFrom)) {
                                                                                        charSequence17 = "";
                                                                                        z14 = false;
                                                                                    } else {
                                                                                        CharSequence charSequence46 = this.g1.w;
                                                                                        charSequence17 = charSequence46 != null ? charSequence46 : charSequence45;
                                                                                    }
                                                                                }
                                                                                this.b0 = org.telegram.ui.ActionBar.k6.H0[this.F0];
                                                                                if (this.g1.D == 21) {
                                                                                    j0();
                                                                                    charSequence18 = w(charSequence17);
                                                                                } else {
                                                                                    charSequence18 = charSequence17;
                                                                                }
                                                                            }
                                                                        } else {
                                                                            L = L();
                                                                        }
                                                                        charSequence13 = L;
                                                                        charSequence4 = charSequence10;
                                                                        z15 = false;
                                                                        str3 = null;
                                                                        charSequence16 = charSequence13;
                                                                        if (this.L0 == 0) {
                                                                        }
                                                                        z28 = z15;
                                                                        charSequence6 = charSequence16;
                                                                        L0 = str6;
                                                                        i13 = i12;
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
                                                                    if (this.L0 == 0) {
                                                                    }
                                                                    z28 = z15;
                                                                    charSequence6 = charSequence16;
                                                                    L0 = str6;
                                                                    i13 = i12;
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
                                                                if (this.L0 == 0) {
                                                                }
                                                                z28 = z15;
                                                                charSequence6 = charSequence16;
                                                                L0 = str6;
                                                                i13 = i12;
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
                                                if (this.L0 == 0) {
                                                }
                                                z28 = z15;
                                                charSequence6 = charSequence16;
                                                L0 = str6;
                                                i13 = i12;
                                                charSequence19 = charSequence11;
                                                z29 = z14;
                                                charSequence20 = charSequence19;
                                                charSequence8 = null;
                                                charSequence23 = charSequence20;
                                            } else if (this.L0 != 0) {
                                                Z = N();
                                            } else if (this.K0 != 0) {
                                                Z = L();
                                            } else {
                                                TLRPC.EncryptedChat encryptedChat = this.i2;
                                                if (encryptedChat != null) {
                                                    this.b0 = org.telegram.ui.ActionBar.k6.H0[this.F0];
                                                    if (encryptedChat instanceof TLRPC.TL_encryptedChatRequested) {
                                                        Z = bd.L0(2131751130);
                                                    } else if (encryptedChat instanceof TLRPC.TL_encryptedChatWaiting) {
                                                        Z = bd.Z(2131753757, l10.i(this.g2));
                                                    } else if (encryptedChat instanceof TLRPC.TL_encryptedChatDiscarded) {
                                                        Z = bd.L0(2131751129);
                                                    } else if (encryptedChat instanceof TLRPC.TL_encryptedChat) {
                                                        Z = encryptedChat.admin_id == h10.i(this.G0).e() ? bd.Z(2131751141, l10.i(this.g2)) : bd.L0(2131751142);
                                                    }
                                                } else if (this.k1 == 3 && l10.B(this.g2)) {
                                                    uw uwVar2 = this.E4;
                                                    int i41 = (uwVar2 == null || !uwVar2.P0) ? 2131745906 : 2131745905;
                                                    z28 = z15;
                                                    z16 = false;
                                                    i13 = i12;
                                                    charSequence4 = " ";
                                                    L0 = null;
                                                    charSequence8 = null;
                                                    z29 = false;
                                                    charSequence6 = bd.L0(i41);
                                                    charSequence23 = charSequence3;
                                                }
                                                z28 = z15;
                                                z16 = z10;
                                                i13 = i12;
                                                charSequence4 = " ";
                                                charSequence6 = "";
                                                z29 = z14;
                                                L0 = null;
                                                charSequence20 = charSequence3;
                                                charSequence8 = null;
                                                charSequence23 = charSequence20;
                                            }
                                        }
                                        z28 = z15;
                                        z16 = z10;
                                        i13 = i12;
                                        charSequence6 = Z;
                                        charSequence4 = " ";
                                        z29 = z14;
                                        L0 = null;
                                        charSequence20 = charSequence3;
                                        charSequence8 = null;
                                        charSequence23 = charSequence20;
                                    }
                                    if (!this.y0 && !V() && !W() && !U() && this.m2 == null && (ziVar5 = this.g1) != null && (message2 = ziVar5.k) != null && (message2.action instanceof TLRPC.TL_messageActionStarGift)) {
                                        this.z0 = true;
                                        SpannableStringBuilder spannableStringBuilder12 = new SpannableStringBuilder(charSequence6);
                                        spannableStringBuilder12.insert(0, (CharSequence) "d ");
                                        wp wpVar3 = new wp(f0.d.d(getContext(), R.drawable.mini_gift).mutate());
                                        wpVar3.I = 1.25f;
                                        wpVar3.J = 1.25f;
                                        wpVar3.H = 0.9f;
                                        wpVar3.x = 0.9f;
                                        spannableStringBuilder12.setSpan(wpVar3, 0, 1, 0);
                                        tL_textWithEntities = ((TLRPC.TL_messageActionStarGift) this.g1.k.action).message;
                                        if (tL_textWithEntities != null && !TextUtils.isEmpty(tL_textWithEntities.text)) {
                                            this.b0 = org.telegram.ui.ActionBar.k6.F0[this.F0];
                                        }
                                        charSequence6 = spannableStringBuilder12;
                                    }
                                    if (TextUtils.isEmpty(this.J0)) {
                                        if (this.m2 != null) {
                                            e12 = bd.e1(r5.date);
                                        } else {
                                            int i42 = this.S0;
                                            if (i42 != 0) {
                                                e12 = bd.e1(i42);
                                            } else {
                                                if (this.g1 != null) {
                                                    e12 = bd.e1(r5.k.date);
                                                }
                                            }
                                        }
                                        ziVar4 = this.g1;
                                        if (ziVar4 != null || this.s0) {
                                            this.R2 = false;
                                            this.S2 = false;
                                            this.T2 = ziVar4 == null && ziVar4.p4() && this.I0 == h10.i(this.G0).e();
                                            z20 = false;
                                            this.H3 = false;
                                            this.c4 = false;
                                            this.d4 = false;
                                            this.e4 = false;
                                            this.u3 = false;
                                            str7 = null;
                                            str12 = null;
                                        } else {
                                            if (this.K0 != 0) {
                                                int i43 = this.T0;
                                                int i44 = this.V0;
                                                int i45 = i43 + i44;
                                                if (i45 <= 0) {
                                                    z25 = false;
                                                    this.H3 = false;
                                                    this.c4 = false;
                                                    str7 = null;
                                                } else if (i43 > i44) {
                                                    this.H3 = true;
                                                    z25 = false;
                                                    this.c4 = false;
                                                    str7 = String.format("%d", Integer.valueOf(i45));
                                                } else {
                                                    z25 = false;
                                                    this.H3 = false;
                                                    this.c4 = true;
                                                    str11 = String.format("%d", Integer.valueOf(i45));
                                                    str7 = null;
                                                    this.d4 = z25;
                                                    this.e4 = z25;
                                                    str10 = str11;
                                                }
                                                str11 = null;
                                                this.d4 = z25;
                                                this.e4 = z25;
                                                str10 = str11;
                                            } else {
                                                if (this.i1) {
                                                    this.H3 = false;
                                                    z29 = false;
                                                    str7 = null;
                                                    z22 = true;
                                                } else {
                                                    int i46 = this.T0;
                                                    if (i46 != 0) {
                                                        z22 = true;
                                                        this.H3 = true;
                                                        str7 = String.format("%d", Integer.valueOf(i46));
                                                    } else {
                                                        z22 = true;
                                                        if (this.U0) {
                                                            this.H3 = true;
                                                            str7 = "";
                                                        } else {
                                                            this.H3 = false;
                                                            str7 = null;
                                                        }
                                                    }
                                                }
                                                if (this.V0 != 0) {
                                                    this.c4 = z22;
                                                    str10 = "@";
                                                } else {
                                                    this.c4 = false;
                                                    str10 = null;
                                                }
                                                this.d4 = this.W0 > 0;
                                                this.e4 = this.X0 > 0;
                                            }
                                            if (this.g1.O3() && this.m2 == null && z29) {
                                                zi ziVar24 = this.g1;
                                                if (!(ziVar24.k.action instanceof TLRPC.TL_messageActionHistoryClear)) {
                                                    if (ziVar24.p4()) {
                                                        z24 = false;
                                                        this.R2 = false;
                                                        this.S2 = false;
                                                        this.T2 = true;
                                                        this.u3 = false;
                                                    } else {
                                                        z24 = false;
                                                        if (this.g1.o4()) {
                                                            this.R2 = false;
                                                            this.S2 = false;
                                                            this.T2 = false;
                                                            this.u3 = true;
                                                            this.H3 = false;
                                                            this.c4 = false;
                                                        } else {
                                                            if (this.g1.r4()) {
                                                                TLRPC.TL_forumTopic tL_forumTopic = this.O;
                                                                if (tL_forumTopic != null) {
                                                                    this.R2 = tL_forumTopic.read_outbox_max_id >= this.g1.f1();
                                                                } else if (this.O0) {
                                                                    int i47 = this.I4;
                                                                    this.R2 = (i47 > 0 && i47 >= this.g1.f1()) || !this.g1.G4() || (org.telegram.messenger.t3.T(this.h2) && !this.h2.megagroup);
                                                                } else {
                                                                    this.R2 = !this.g1.G4() || (org.telegram.messenger.t3.T(this.h2) && !this.h2.megagroup);
                                                                }
                                                                this.S2 = true;
                                                                z23 = false;
                                                                this.T2 = false;
                                                                this.u3 = false;
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
                                            this.R2 = false;
                                            this.S2 = false;
                                            this.T2 = false;
                                            this.u3 = false;
                                            str12 = str10;
                                            z20 = z23;
                                        }
                                        this.Q2 = z20;
                                        s12 = hp.s1(this.G0);
                                        if (this.k1 == 0 && s12.C2(this.I0, true)) {
                                            this.A3 = true;
                                            this.Q2 = true;
                                            i17 = s12.B2;
                                            if (i17 != 0) {
                                                e12 = bd.L0(2131743791);
                                            } else if (i17 == 1) {
                                                e12 = bd.N0("PsaType_" + s12.D2);
                                                if (TextUtils.isEmpty(e12)) {
                                                    e12 = bd.L0(2131746601);
                                                }
                                                if (!TextUtils.isEmpty(s12.C2)) {
                                                    charSequence6 = s12.C2;
                                                    this.S1 = 0;
                                                }
                                            }
                                        }
                                        str8 = e12;
                                        str9 = this.M0;
                                        if (str9 == null) {
                                            charSequence25 = charSequence23;
                                            charSequence24 = str9;
                                        } else if (this.K0 != 0) {
                                            charSequence25 = charSequence23;
                                            charSequence24 = bd.L0(2131754136);
                                        } else {
                                            TLRPC.Chat chat9 = this.h2;
                                            if (chat9 != null) {
                                                if (this.P) {
                                                    if (this.i0 == null) {
                                                        this.i0 = new Drawable[1];
                                                    }
                                                    this.i0[0] = null;
                                                    U = hp.s1(this.G0).S1().j(this.h2, this.g1, this.b0, this.i0);
                                                } else if (this.Q) {
                                                    if (this.i0 == null) {
                                                        this.i0 = new Drawable[1];
                                                    }
                                                    Drawable[] drawableArr = this.i0;
                                                    drawableArr[0] = null;
                                                    U = this.h0 ? rg.c.j(this.O, org.telegram.ui.ActionBar.k6.B0[this.F0], drawableArr) : org.telegram.messenger.g0.U(this.O.title);
                                                } else if (!chat9.monoforum || chat9.linked_monoforum_id == 0) {
                                                    U = org.telegram.messenger.g0.U(chat9.title);
                                                } else {
                                                    TLRPC.Chat M02 = hp.s1(this.G0).M0(Long.valueOf(this.h2.linked_monoforum_id));
                                                    if (M02 != null) {
                                                        SpannableStringBuilder spannableStringBuilder13 = new SpannableStringBuilder(org.telegram.messenger.g0.U(M02.title));
                                                        spannableStringBuilder13.append(charSequence4);
                                                        int length4 = spannableStringBuilder13.length();
                                                        spannableStringBuilder13.append((CharSequence) bd.L0(2131748355));
                                                        spannableStringBuilder13.setSpan(new dz(bd.L0(2131748355), org.telegram.ui.ActionBar.k6.y6, this.K4), length4, spannableStringBuilder13.length(), 33);
                                                        charSequence24 = spannableStringBuilder13;
                                                    } else {
                                                        U = org.telegram.messenger.g0.U(this.h2.title);
                                                    }
                                                }
                                                charSequence24 = U;
                                            } else {
                                                TLRPC.User user6 = this.g2;
                                                if (user6 != null) {
                                                    if (l10.z(user6)) {
                                                        U = bd.L0(2131746274);
                                                    } else if (l10.s(this.g2)) {
                                                        U = bd.L0(2131754252);
                                                    } else if (!l10.B(this.g2) || this.r0) {
                                                        if (this.Q) {
                                                            if (this.i0 == null) {
                                                                this.i0 = new Drawable[1];
                                                            }
                                                            Drawable[] drawableArr2 = this.i0;
                                                            drawableArr2[0] = null;
                                                            U = this.h0 ? rg.c.j(this.O, org.telegram.ui.ActionBar.k6.B0[this.F0], drawableArr2) : org.telegram.messenger.g0.U(this.O.title);
                                                        } else {
                                                            U = org.telegram.messenger.g0.U(l10.p(this.g2));
                                                        }
                                                    } else if (this.s0) {
                                                        U = bd.L0(2131748311);
                                                    } else if (this.v2) {
                                                        U = bd.L0(2131750511);
                                                    } else {
                                                        if (this.k1 == 3) {
                                                            this.A3 = true;
                                                        }
                                                        U = bd.L0(2131745911);
                                                    }
                                                    charSequence24 = U;
                                                }
                                                charSequence24 = "";
                                            }
                                            if (charSequence24 != null && charSequence24.length() == 0) {
                                                charSequence24 = bd.L0(2131749336);
                                            }
                                            charSequence25 = charSequence23;
                                        }
                                        z21 = z28;
                                        i16 = i13;
                                        z10 = z16;
                                        charSequence26 = charSequence8;
                                    }
                                    e12 = "";
                                    ziVar4 = this.g1;
                                    if (ziVar4 != null) {
                                    }
                                    this.R2 = false;
                                    this.S2 = false;
                                    this.T2 = ziVar4 == null && ziVar4.p4() && this.I0 == h10.i(this.G0).e();
                                    z20 = false;
                                    this.H3 = false;
                                    this.c4 = false;
                                    this.d4 = false;
                                    this.e4 = false;
                                    this.u3 = false;
                                    str7 = null;
                                    str12 = null;
                                    this.Q2 = z20;
                                    s12 = hp.s1(this.G0);
                                    if (this.k1 == 0) {
                                        this.A3 = true;
                                        this.Q2 = true;
                                        i17 = s12.B2;
                                        if (i17 != 0) {
                                        }
                                    }
                                    str8 = e12;
                                    str9 = this.M0;
                                    if (str9 == null) {
                                    }
                                    z21 = z28;
                                    i16 = i13;
                                    z10 = z16;
                                    charSequence26 = charSequence8;
                                } else {
                                    this.m2 = null;
                                    this.l2 = false;
                                    charSequence21 = this.J0;
                                    this.b0 = org.telegram.ui.ActionBar.k6.F0[this.F0];
                                    z16 = z10;
                                    L0 = null;
                                    charSequence22 = null;
                                }
                            }
                            charSequence6 = charSequence21;
                            charSequence4 = " ";
                            charSequence23 = "";
                            i13 = -1;
                            charSequence8 = charSequence22;
                            if (!this.y0) {
                                this.z0 = true;
                                SpannableStringBuilder spannableStringBuilder122 = new SpannableStringBuilder(charSequence6);
                                spannableStringBuilder122.insert(0, (CharSequence) "d ");
                                wp wpVar32 = new wp(f0.d.d(getContext(), R.drawable.mini_gift).mutate());
                                wpVar32.I = 1.25f;
                                wpVar32.J = 1.25f;
                                wpVar32.H = 0.9f;
                                wpVar32.x = 0.9f;
                                spannableStringBuilder122.setSpan(wpVar32, 0, 1, 0);
                                tL_textWithEntities = ((TLRPC.TL_messageActionStarGift) this.g1.k.action).message;
                                if (tL_textWithEntities != null) {
                                    this.b0 = org.telegram.ui.ActionBar.k6.F0[this.F0];
                                }
                                charSequence6 = spannableStringBuilder122;
                            }
                            if (TextUtils.isEmpty(this.J0)) {
                            }
                            e12 = "";
                            ziVar4 = this.g1;
                            if (ziVar4 != null) {
                            }
                            this.R2 = false;
                            this.S2 = false;
                            this.T2 = ziVar4 == null && ziVar4.p4() && this.I0 == h10.i(this.G0).e();
                            z20 = false;
                            this.H3 = false;
                            this.c4 = false;
                            this.d4 = false;
                            this.e4 = false;
                            this.u3 = false;
                            str7 = null;
                            str12 = null;
                            this.Q2 = z20;
                            s12 = hp.s1(this.G0);
                            if (this.k1 == 0) {
                            }
                            str8 = e12;
                            str9 = this.M0;
                            if (str9 == null) {
                            }
                            z21 = z28;
                            i16 = i13;
                            z10 = z16;
                            charSequence26 = charSequence8;
                        }
                    }
                    draftMessage = this.m2;
                    if (draftMessage != null) {
                        if (i11 > draftMessage.date) {
                        }
                    }
                }
                if (org.telegram.messenger.t3.T(this.h2)) {
                    TLRPC.Chat chat10 = this.h2;
                    if (!chat10.megagroup) {
                        if (!chat10.creator) {
                            TLRPC.TL_chatAdminRights tL_chatAdminRights = chat10.admin_rights;
                            if (tL_chatAdminRights != null) {
                            }
                            this.m2 = null;
                            this.l2 = false;
                            if (W()) {
                            }
                            charSequence6 = charSequence21;
                            charSequence4 = " ";
                            charSequence23 = "";
                            i13 = -1;
                            charSequence8 = charSequence22;
                            if (!this.y0) {
                            }
                            if (TextUtils.isEmpty(this.J0)) {
                            }
                            e12 = "";
                            ziVar4 = this.g1;
                            if (ziVar4 != null) {
                            }
                            this.R2 = false;
                            this.S2 = false;
                            this.T2 = ziVar4 == null && ziVar4.p4() && this.I0 == h10.i(this.G0).e();
                            z20 = false;
                            this.H3 = false;
                            this.c4 = false;
                            this.d4 = false;
                            this.e4 = false;
                            this.u3 = false;
                            str7 = null;
                            str12 = null;
                            this.Q2 = z20;
                            s12 = hp.s1(this.G0);
                            if (this.k1 == 0) {
                            }
                            str8 = e12;
                            str9 = this.M0;
                            if (str9 == null) {
                            }
                            z21 = z28;
                            i16 = i13;
                            z10 = z16;
                            charSequence26 = charSequence8;
                        }
                    }
                }
                chat = this.h2;
                if (chat != null) {
                    if (chat.left) {
                    }
                    this.m2 = null;
                    this.l2 = false;
                    if (W()) {
                    }
                    charSequence6 = charSequence21;
                    charSequence4 = " ";
                    charSequence23 = "";
                    i13 = -1;
                    charSequence8 = charSequence22;
                    if (!this.y0) {
                    }
                    if (TextUtils.isEmpty(this.J0)) {
                    }
                    e12 = "";
                    ziVar4 = this.g1;
                    if (ziVar4 != null) {
                    }
                    this.R2 = false;
                    this.S2 = false;
                    this.T2 = ziVar4 == null && ziVar4.p4() && this.I0 == h10.i(this.G0).e();
                    z20 = false;
                    this.H3 = false;
                    this.c4 = false;
                    this.d4 = false;
                    this.e4 = false;
                    this.u3 = false;
                    str7 = null;
                    str12 = null;
                    this.Q2 = z20;
                    s12 = hp.s1(this.G0);
                    if (this.k1 == 0) {
                    }
                    str8 = e12;
                    str9 = this.M0;
                    if (str9 == null) {
                    }
                    z21 = z28;
                    i16 = i13;
                    z10 = z16;
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
                if (!this.y0) {
                }
                if (TextUtils.isEmpty(this.J0)) {
                }
                e12 = "";
                ziVar4 = this.g1;
                if (ziVar4 != null) {
                }
                this.R2 = false;
                this.S2 = false;
                this.T2 = ziVar4 == null && ziVar4.p4() && this.I0 == h10.i(this.G0).e();
                z20 = false;
                this.H3 = false;
                this.c4 = false;
                this.d4 = false;
                this.e4 = false;
                this.u3 = false;
                str7 = null;
                str12 = null;
                this.Q2 = z20;
                s12 = hp.s1(this.G0);
                if (this.k1 == 0) {
                }
                str8 = e12;
                str9 = this.M0;
                if (str9 == null) {
                }
                z21 = z28;
                i16 = i13;
                z10 = z16;
                charSequence26 = charSequence8;
            }
            i10 = i3;
            charSequence = charSequence32;
            i11 = this.S0;
            if (i11 == 0) {
                i11 = ziVar6.k.date;
            }
            if (!this.Q) {
            }
            z13 = this.l2;
            if (!z13) {
            }
            if (!z13) {
                draftMessage3 = this.m2;
                if (draftMessage3.rich_message == null) {
                }
            }
            draftMessage = this.m2;
            if (draftMessage != null) {
            }
            if (org.telegram.messenger.t3.T(this.h2)) {
            }
            chat = this.h2;
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
            if (!this.y0) {
            }
            if (TextUtils.isEmpty(this.J0)) {
            }
            e12 = "";
            ziVar4 = this.g1;
            if (ziVar4 != null) {
            }
            this.R2 = false;
            this.S2 = false;
            this.T2 = ziVar4 == null && ziVar4.p4() && this.I0 == h10.i(this.G0).e();
            z20 = false;
            this.H3 = false;
            this.c4 = false;
            this.d4 = false;
            this.e4 = false;
            this.u3 = false;
            str7 = null;
            str12 = null;
            this.Q2 = z20;
            s12 = hp.s1(this.G0);
            if (this.k1 == 0) {
            }
            str8 = e12;
            str9 = this.M0;
            if (str9 == null) {
            }
            z21 = z28;
            i16 = i13;
            z10 = z16;
            charSequence26 = charSequence8;
        }
        charSequence27 = L0;
        if (z10) {
            f12 = 24.0f;
            f13 = 0.0f;
            this.O2 = null;
            this.M2 = 0;
            i19 = 0;
        } else {
            TextPaint timeTextPaint = getTimeTextPaint();
            f12 = 24.0f;
            f13 = 0.0f;
            int ceil = (int) Math.ceil(timeTextPaint.measureText(str8));
            this.O2 = new StaticLayout(str8, timeTextPaint, ceil, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            i19 = org.telegram.messenger.g0.L(getIsPinned() ? 24.0f : 0.0f) + ceil;
            if (bd.a0) {
                this.M2 = org.telegram.messenger.g0.L(15.0f);
            } else {
                this.M2 = org.telegram.messenger.k5.z(15.0f, getMeasuredWidth(), i19);
            }
        }
        if (K()) {
            i20 = 0;
        } else {
            if (bd.a0) {
                this.P2 = org.telegram.messenger.g0.L(4.0f) + this.M2 + i19;
            } else {
                this.P2 = (this.M2 - org.telegram.ui.ActionBar.k6.b1.getIntrinsicWidth()) - org.telegram.messenger.g0.L(4.0f);
            }
            i20 = org.telegram.ui.ActionBar.k6.b1.getIntrinsicWidth() + org.telegram.messenger.g0.L(4.0f);
            i19 += i20;
        }
        if (bd.a0) {
            this.z2 = org.telegram.messenger.k5.z(22.0f, getMeasuredWidth() - this.y2, i19);
        } else {
            this.z2 = org.telegram.messenger.k5.z(this.J + 13, getMeasuredWidth() - this.y2, i19);
            this.y2 += i19;
        }
        if (this.H2) {
            this.z2 -= org.telegram.ui.ActionBar.k6.a1.getIntrinsicWidth() + org.telegram.messenger.g0.L(bd.a0 ? 8.0f : 4.0f);
        }
        if (!this.T2) {
            int L12 = org.telegram.messenger.g0.L(5.0f) + org.telegram.ui.ActionBar.k6.X0.getIntrinsicWidth();
            this.z2 -= L12;
            if (bd.a0) {
                this.W2 = org.telegram.messenger.g0.L(5.0f) + this.M2 + i19;
                this.y2 += L12;
            } else {
                this.W2 = (this.M2 - i20) - L12;
            }
        } else if (this.S2) {
            int L13 = org.telegram.messenger.g0.L(5.0f) + org.telegram.ui.ActionBar.k6.T0.getIntrinsicWidth();
            int i48 = this.z2 - L13;
            this.z2 = i48;
            if (this.R2) {
                this.z2 = org.telegram.messenger.k5.B(8.0f, org.telegram.ui.ActionBar.k6.W0.getIntrinsicWidth(), i48);
                if (bd.a0) {
                    int L14 = org.telegram.messenger.g0.L(5.0f) + this.M2 + i19;
                    this.U2 = L14;
                    this.Y2 = org.telegram.messenger.g0.L(5.5f) + L14;
                    this.y2 = org.telegram.messenger.camera.q.D(8.0f, org.telegram.ui.ActionBar.k6.W0.getIntrinsicWidth() + L13, this.y2);
                } else {
                    int i49 = (this.M2 - i20) - L13;
                    this.Y2 = i49;
                    this.U2 = i49 - org.telegram.messenger.g0.L(5.5f);
                }
            } else if (bd.a0) {
                this.V2 = org.telegram.messenger.g0.L(5.0f) + this.M2 + i19;
                this.y2 += L13;
            } else {
                this.V2 = (this.M2 - i20) - L13;
            }
        }
        z26 = (!this.a1 || this.R0 || this.c1 || this.d1 > f13) && !this.k4 && this.q4 == 0;
        if (!this.m4 && this.o4.c() != null) {
            int L15 = org.telegram.messenger.g0.L(36.0f);
            if (z26) {
                L15 += org.telegram.ui.ActionBar.k6.c1.getIntrinsicWidth() + org.telegram.messenger.g0.L(6.0f);
            }
            this.z2 -= L15;
            if (bd.a0) {
                this.y2 += L15;
            }
        } else if (!z26) {
            int intrinsicWidth = org.telegram.ui.ActionBar.k6.c1.getIntrinsicWidth() + org.telegram.messenger.g0.L(6.0f);
            if (this.m4) {
                intrinsicWidth += org.telegram.messenger.g0.L(36.0f);
            }
            this.z2 -= intrinsicWidth;
            if (bd.a0) {
                this.y2 += intrinsicWidth;
            }
        } else if (this.k4) {
            int intrinsicWidth2 = org.telegram.ui.ActionBar.k6.f1.getIntrinsicWidth() + org.telegram.messenger.g0.L(6.0f);
            this.z2 -= intrinsicWidth2;
            if (bd.a0) {
                this.y2 += intrinsicWidth2;
            }
        } else if (this.m4) {
            int L16 = org.telegram.messenger.g0.L(36.0f);
            this.z2 -= L16;
            if (bd.a0) {
                this.y2 += L16;
            }
        } else if (this.q4 != 0) {
            int intrinsicWidth3 = (this.q4 == 1 ? org.telegram.ui.ActionBar.k6.g1 : org.telegram.ui.ActionBar.k6.h1).getIntrinsicWidth() + org.telegram.messenger.g0.L(6.0f);
            this.z2 -= intrinsicWidth3;
            if (bd.a0) {
                this.y2 += intrinsicWidth3;
            }
        }
        if (this.l4) {
            this.z2 -= org.telegram.messenger.g0.L(21.0f);
        }
        try {
            L9 = this.z2 - org.telegram.messenger.g0.L(12.0f);
            if (L9 < 0) {
                L9 = 0;
            }
            if (charSequence24 instanceof String) {
                charSequence24 = ((String) charSequence24).replace(c2, ' ');
            }
            if (this.E2) {
                f14 = 36.0f;
                f15 = 8.0f;
            } else {
                f14 = 36.0f;
                try {
                    f15 = 8.0f;
                    try {
                        this.B2 = charSequence24.length() == TextUtils.ellipsize(charSequence24, org.telegram.ui.ActionBar.k6.B0[this.F0], (float) L9, TextUtils.TruncateAt.END).length();
                        L9 += org.telegram.messenger.g0.L(48.0f);
                    } catch (Exception e14) {
                        e = e14;
                        org.telegram.messenger.a8.f(e);
                        this.q3 = org.telegram.ui.Components.p5.update(0, (View) this, this.q3, this.A2);
                        if (this.s2) {
                        }
                        f16 = 39.0f;
                        f17 = f12;
                        f18 = 13.0f;
                        L2 = org.telegram.messenger.g0.L(11.0f);
                        this.r3 = org.telegram.messenger.g0.L(32.0f);
                        this.N2 = org.telegram.messenger.g0.L(13.0f);
                        this.v3 = org.telegram.messenger.g0.L(42.33f);
                        this.D3 = org.telegram.messenger.g0.L(43.0f);
                        this.N3 = org.telegram.messenger.g0.L(42.33f);
                        this.X2 = org.telegram.messenger.g0.L(13.0f);
                        int measuredWidth42 = getMeasuredWidth() - org.telegram.messenger.g0.L(this.J + 21);
                        if (bd.a0) {
                        }
                        i21 = L4;
                        this.v0.F.set(L3, L2, org.telegram.messenger.g0.L(56.0f) + L3, org.telegram.messenger.g0.L(56.0f) + L2);
                        i22 = 0;
                        while (true) {
                            imageReceiverArr = this.W1;
                            if (i22 < imageReceiverArr.length) {
                            }
                            imageReceiverArr[i22].y0(((this.M4 + 2) * i22) + i21, ((org.telegram.messenger.g0.L(31.0f) + L2) + (this.R ? org.telegram.messenger.g0.L(20.0f) : 0)) - ((this.s2 || az.p1 || (fVar = this.u0) == null || fVar.u()) ? 0 : org.telegram.messenger.g0.L(9.0f)), org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(18.0f));
                            i22++;
                            L2 = L2;
                        }
                        i23 = L2;
                        i24 = measuredWidth42;
                        if (bd.a0) {
                        }
                        if (this.R) {
                        }
                        if (!this.s2) {
                            this.N2 -= org.telegram.messenger.g0.L(6.0f);
                            this.X2 -= org.telegram.messenger.g0.L(6.0f);
                            if (getIsPinned()) {
                            }
                            if (this.u3) {
                            }
                            if (this.u3) {
                            }
                            this.I3 = z27;
                            if (z27) {
                            }
                            if (z21) {
                            }
                            int max2 = Math.max(org.telegram.messenger.g0.L(12.0f), i24);
                            this.h3 = org.telegram.messenger.g0.L((!this.s2 || az.p1) ? 58.0f : 62.0f);
                            if (!this.s2) {
                                this.h3 -= org.telegram.messenger.g0.L(!W() ? 10.0f : 12.0f);
                                if (!W()) {
                                }
                                if (this.R) {
                                }
                                this.o3 = org.telegram.ui.Components.p5.update(0, (View) this, this.o3, this.t3);
                                if (TextUtils.isEmpty(charSequence26)) {
                                }
                                this.p3 = org.telegram.ui.Components.p5.update(0, (View) this, this.p3, this.i3);
                                if (!TextUtils.isEmpty(charSequence25)) {
                                }
                                if (charSequence6 instanceof Spannable) {
                                }
                                if (this.s2) {
                                }
                                this.b0 = org.telegram.ui.ActionBar.k6.F0[this.F0];
                                charSequence29 = charSequence27;
                                charSequence30 = null;
                                Layout.Alignment alignment2 = Layout.Alignment.ALIGN_NORMAL;
                                if (this.s2) {
                                }
                                if (this.S1 > 0) {
                                }
                                TextPaint textPaint62 = this.b0;
                                float L112 = org.telegram.messenger.g0.L(1.0f);
                                TextUtils.TruncateAt truncateAt2 = TextUtils.TruncateAt.END;
                                this.f3 = lu0.b(charSequence29, textPaint62, L6, L112, L6, charSequence30 != null ? 1 : 2);
                                i27 = L6;
                                this.j3.addAll(this.k3);
                                this.k3.clear();
                                yh.f.b(this, this.f3, -2, -2, this.j3, this.k3);
                                int i4022 = i27;
                                this.n3 = org.telegram.ui.Components.p5.update(0, (View) this, this.n3, this.f3);
                                if (bd.a0) {
                                }
                                staticLayout = this.g3;
                                if (staticLayout != null) {
                                }
                                m0();
                            }
                            this.h3 -= org.telegram.messenger.g0.L(!W() ? 10.0f : 12.0f);
                            if (!W()) {
                            }
                            if (this.R) {
                            }
                            this.o3 = org.telegram.ui.Components.p5.update(0, (View) this, this.o3, this.t3);
                            if (TextUtils.isEmpty(charSequence26)) {
                            }
                            this.p3 = org.telegram.ui.Components.p5.update(0, (View) this, this.p3, this.i3);
                            if (!TextUtils.isEmpty(charSequence25)) {
                            }
                            if (charSequence6 instanceof Spannable) {
                            }
                            if (this.s2) {
                            }
                            this.b0 = org.telegram.ui.ActionBar.k6.F0[this.F0];
                            charSequence29 = charSequence27;
                            charSequence30 = null;
                            Layout.Alignment alignment22 = Layout.Alignment.ALIGN_NORMAL;
                            if (this.s2) {
                            }
                            if (this.S1 > 0) {
                            }
                            TextPaint textPaint622 = this.b0;
                            float L1122 = org.telegram.messenger.g0.L(1.0f);
                            TextUtils.TruncateAt truncateAt22 = TextUtils.TruncateAt.END;
                            this.f3 = lu0.b(charSequence29, textPaint622, L6, L1122, L6, charSequence30 != null ? 1 : 2);
                            i27 = L6;
                            this.j3.addAll(this.k3);
                            this.k3.clear();
                            yh.f.b(this, this.f3, -2, -2, this.j3, this.k3);
                            int i40222 = i27;
                            this.n3 = org.telegram.ui.Components.p5.update(0, (View) this, this.n3, this.f3);
                            if (bd.a0) {
                            }
                            staticLayout = this.g3;
                            if (staticLayout != null) {
                            }
                            m0();
                        }
                        this.N2 -= org.telegram.messenger.g0.L(6.0f);
                        this.X2 -= org.telegram.messenger.g0.L(6.0f);
                        if (getIsPinned()) {
                        }
                        if (this.u3) {
                        }
                        if (this.u3) {
                        }
                        this.I3 = z27;
                        if (z27) {
                        }
                        if (z21) {
                        }
                        int max22 = Math.max(org.telegram.messenger.g0.L(12.0f), i24);
                        this.h3 = org.telegram.messenger.g0.L((!this.s2 || az.p1) ? 58.0f : 62.0f);
                        if (!this.s2) {
                        }
                        this.h3 -= org.telegram.messenger.g0.L(!W() ? 10.0f : 12.0f);
                        if (!W()) {
                        }
                        if (this.R) {
                        }
                        this.o3 = org.telegram.ui.Components.p5.update(0, (View) this, this.o3, this.t3);
                        if (TextUtils.isEmpty(charSequence26)) {
                        }
                        this.p3 = org.telegram.ui.Components.p5.update(0, (View) this, this.p3, this.i3);
                        if (!TextUtils.isEmpty(charSequence25)) {
                        }
                        if (charSequence6 instanceof Spannable) {
                        }
                        if (this.s2) {
                        }
                        this.b0 = org.telegram.ui.ActionBar.k6.F0[this.F0];
                        charSequence29 = charSequence27;
                        charSequence30 = null;
                        Layout.Alignment alignment222 = Layout.Alignment.ALIGN_NORMAL;
                        if (this.s2) {
                        }
                        if (this.S1 > 0) {
                        }
                        TextPaint textPaint6222 = this.b0;
                        float L11222 = org.telegram.messenger.g0.L(1.0f);
                        TextUtils.TruncateAt truncateAt222 = TextUtils.TruncateAt.END;
                        this.f3 = lu0.b(charSequence29, textPaint6222, L6, L11222, L6, charSequence30 != null ? 1 : 2);
                        i27 = L6;
                        this.j3.addAll(this.k3);
                        this.k3.clear();
                        yh.f.b(this, this.f3, -2, -2, this.j3, this.k3);
                        int i402222 = i27;
                        this.n3 = org.telegram.ui.Components.p5.update(0, (View) this, this.n3, this.f3);
                        if (bd.a0) {
                        }
                        staticLayout = this.g3;
                        if (staticLayout != null) {
                        }
                        m0();
                    }
                } catch (Exception e15) {
                    e = e15;
                    f15 = 8.0f;
                    org.telegram.messenger.a8.f(e);
                    this.q3 = org.telegram.ui.Components.p5.update(0, (View) this, this.q3, this.A2);
                    if (this.s2) {
                    }
                    f16 = 39.0f;
                    f17 = f12;
                    f18 = 13.0f;
                    L2 = org.telegram.messenger.g0.L(11.0f);
                    this.r3 = org.telegram.messenger.g0.L(32.0f);
                    this.N2 = org.telegram.messenger.g0.L(13.0f);
                    this.v3 = org.telegram.messenger.g0.L(42.33f);
                    this.D3 = org.telegram.messenger.g0.L(43.0f);
                    this.N3 = org.telegram.messenger.g0.L(42.33f);
                    this.X2 = org.telegram.messenger.g0.L(13.0f);
                    int measuredWidth422 = getMeasuredWidth() - org.telegram.messenger.g0.L(this.J + 21);
                    if (bd.a0) {
                    }
                    i21 = L4;
                    this.v0.F.set(L3, L2, org.telegram.messenger.g0.L(56.0f) + L3, org.telegram.messenger.g0.L(56.0f) + L2);
                    i22 = 0;
                    while (true) {
                        imageReceiverArr = this.W1;
                        if (i22 < imageReceiverArr.length) {
                        }
                        imageReceiverArr[i22].y0(((this.M4 + 2) * i22) + i21, ((org.telegram.messenger.g0.L(31.0f) + L2) + (this.R ? org.telegram.messenger.g0.L(20.0f) : 0)) - ((this.s2 || az.p1 || (fVar = this.u0) == null || fVar.u()) ? 0 : org.telegram.messenger.g0.L(9.0f)), org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(18.0f));
                        i22++;
                        L2 = L2;
                    }
                    i23 = L2;
                    i24 = measuredWidth422;
                    if (bd.a0) {
                    }
                    if (this.R) {
                    }
                    if (!this.s2) {
                    }
                    this.N2 -= org.telegram.messenger.g0.L(6.0f);
                    this.X2 -= org.telegram.messenger.g0.L(6.0f);
                    if (getIsPinned()) {
                    }
                    if (this.u3) {
                    }
                    if (this.u3) {
                    }
                    this.I3 = z27;
                    if (z27) {
                    }
                    if (z21) {
                    }
                    int max222 = Math.max(org.telegram.messenger.g0.L(12.0f), i24);
                    this.h3 = org.telegram.messenger.g0.L((!this.s2 || az.p1) ? 58.0f : 62.0f);
                    if (!this.s2) {
                    }
                    this.h3 -= org.telegram.messenger.g0.L(!W() ? 10.0f : 12.0f);
                    if (!W()) {
                    }
                    if (this.R) {
                    }
                    this.o3 = org.telegram.ui.Components.p5.update(0, (View) this, this.o3, this.t3);
                    if (TextUtils.isEmpty(charSequence26)) {
                    }
                    this.p3 = org.telegram.ui.Components.p5.update(0, (View) this, this.p3, this.i3);
                    if (!TextUtils.isEmpty(charSequence25)) {
                    }
                    if (charSequence6 instanceof Spannable) {
                    }
                    if (this.s2) {
                    }
                    this.b0 = org.telegram.ui.ActionBar.k6.F0[this.F0];
                    charSequence29 = charSequence27;
                    charSequence30 = null;
                    Layout.Alignment alignment2222 = Layout.Alignment.ALIGN_NORMAL;
                    if (this.s2) {
                    }
                    if (this.S1 > 0) {
                    }
                    TextPaint textPaint62222 = this.b0;
                    float L112222 = org.telegram.messenger.g0.L(1.0f);
                    TextUtils.TruncateAt truncateAt2222 = TextUtils.TruncateAt.END;
                    this.f3 = lu0.b(charSequence29, textPaint62222, L6, L112222, L6, charSequence30 != null ? 1 : 2);
                    i27 = L6;
                    this.j3.addAll(this.k3);
                    this.k3.clear();
                    yh.f.b(this, this.f3, -2, -2, this.j3, this.k3);
                    int i4022222 = i27;
                    this.n3 = org.telegram.ui.Components.p5.update(0, (View) this, this.n3, this.f3);
                    if (bd.a0) {
                    }
                    staticLayout = this.g3;
                    if (staticLayout != null) {
                    }
                    m0();
                }
            }
            float f212 = L9;
            this.S = org.telegram.ui.ActionBar.k6.B0[this.F0].measureText(charSequence24.toString()) <= f212;
            if (!this.R) {
                charSequence24 = TextUtils.ellipsize(charSequence24, org.telegram.ui.ActionBar.k6.B0[this.F0], f212, TextUtils.TruncateAt.END);
            }
            CharSequence l112 = org.telegram.messenger.i6.l(charSequence24, org.telegram.ui.ActionBar.k6.B0[this.F0].getFontMetricsInt(), false);
            zi ziVar222 = this.g1;
            CharSequence charSequence47 = (ziVar222 == null && ziVar222.s2() && (x14 = org.telegram.messenger.g0.x1(l112, this.g1.Y1, this.K4)) != null) ? x14 : l112;
            if (this.R) {
                this.A2 = new StaticLayout(charSequence47, org.telegram.ui.ActionBar.k6.B0[this.F0], Math.max(L9, this.z2), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            } else {
                TextPaint textPaint7 = org.telegram.ui.ActionBar.k6.B0[this.F0];
                Layout.Alignment alignment3 = Layout.Alignment.ALIGN_NORMAL;
                TextUtils.TruncateAt truncateAt3 = TextUtils.TruncateAt.END;
                this.A2 = lu0.b(charSequence47, textPaint7, L9, 0.0f, L9, 2);
            }
            this.C2 = (this.E2 || !this.A2.isRtlCharAt(0)) ? f13 : -org.telegram.messenger.g0.L(f14);
            this.D2 = this.A2.isRtlCharAt(0);
        } catch (Exception e16) {
            e = e16;
            f14 = 36.0f;
        }
        this.q3 = org.telegram.ui.Components.p5.update(0, (View) this, this.q3, this.A2);
        if (!this.s2 || az.p1) {
            f16 = 39.0f;
            f17 = f12;
            f18 = 13.0f;
            L2 = org.telegram.messenger.g0.L(11.0f);
            this.r3 = org.telegram.messenger.g0.L(32.0f);
            this.N2 = org.telegram.messenger.g0.L(13.0f);
            this.v3 = org.telegram.messenger.g0.L(42.33f);
            this.D3 = org.telegram.messenger.g0.L(43.0f);
            this.N3 = org.telegram.messenger.g0.L(42.33f);
            this.X2 = org.telegram.messenger.g0.L(13.0f);
            int measuredWidth4222 = getMeasuredWidth() - org.telegram.messenger.g0.L(this.J + 21);
            if (bd.a0) {
                int L17 = org.telegram.messenger.g0.L(this.J + 6);
                this.s3 = L17;
                this.c3 = L17;
                this.e3 = L17;
                this.d3 = L17;
                L3 = org.telegram.messenger.g0.L(this.I);
                L4 = org.telegram.messenger.g0.L(69.0f) + L3;
            } else {
                int L18 = org.telegram.messenger.g0.L(f11);
                this.s3 = L18;
                this.c3 = L18;
                this.e3 = L18;
                this.d3 = L18;
                L3 = getMeasuredWidth() - org.telegram.messenger.g0.L(this.I + 56);
                L4 = L3 - org.telegram.messenger.g0.L(31.0f);
            }
            i21 = L4;
            this.v0.F.set(L3, L2, org.telegram.messenger.g0.L(56.0f) + L3, org.telegram.messenger.g0.L(56.0f) + L2);
            i22 = 0;
            while (true) {
                imageReceiverArr = this.W1;
                if (i22 < imageReceiverArr.length) {
                    break;
                }
                imageReceiverArr[i22].y0(((this.M4 + 2) * i22) + i21, ((org.telegram.messenger.g0.L(31.0f) + L2) + (this.R ? org.telegram.messenger.g0.L(20.0f) : 0)) - ((this.s2 || az.p1 || (fVar = this.u0) == null || fVar.u()) ? 0 : org.telegram.messenger.g0.L(9.0f)), org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(18.0f));
                i22++;
                L2 = L2;
            }
            i23 = L2;
            i24 = measuredWidth4222;
        } else {
            int L19 = org.telegram.messenger.g0.L(9.0f);
            this.r3 = org.telegram.messenger.g0.L(31.0f);
            this.N2 = org.telegram.messenger.g0.L(f11);
            this.v3 = org.telegram.messenger.g0.L(38.0f);
            this.D3 = org.telegram.messenger.g0.L(39.0f);
            this.N3 = org.telegram.messenger.g0.L(this.Q ? 35.0f : 38.0f);
            this.X2 = org.telegram.messenger.g0.L(f10);
            i24 = getMeasuredWidth() - org.telegram.messenger.g0.L((this.J + 20) - (bd.a0 ? 0 : 12));
            if (bd.a0) {
                int L20 = org.telegram.messenger.g0.L(22.0f);
                this.s3 = L20;
                this.c3 = L20;
                this.e3 = L20;
                this.d3 = L20;
                f16 = 39.0f;
                L7 = getMeasuredWidth() - org.telegram.messenger.g0.L(this.I + 52);
                f19 = 9.0f;
                L8 = L7 - org.telegram.messenger.g0.L(((this.M4 + 2) * this.S1) + 9);
            } else {
                f16 = 39.0f;
                f19 = 9.0f;
                int L21 = org.telegram.messenger.g0.L(this.J + 4);
                this.s3 = L21;
                this.c3 = L21;
                this.e3 = L21;
                this.d3 = L21;
                L7 = org.telegram.messenger.g0.L(this.I);
                L8 = org.telegram.messenger.g0.L(67.0f) + L7;
            }
            f18 = 13.0f;
            f17 = f12;
            this.v0.F.set(L7, L19, org.telegram.messenger.g0.L(52.0f) + L7, org.telegram.messenger.g0.L(52.0f) + L19);
            int i50 = 0;
            while (true) {
                ImageReceiver[] imageReceiverArr3 = this.W1;
                if (i50 >= imageReceiverArr3.length) {
                    break;
                }
                imageReceiverArr3[i50].y0(((this.M4 + 2) * i50) + L8, ((org.telegram.messenger.g0.L(30.0f) + L19) + (this.R ? org.telegram.messenger.g0.L(20.0f) : 0)) - ((this.s2 || az.p1 || (fVar3 = this.u0) == null || fVar3.u()) ? 0 : org.telegram.messenger.g0.L(f19)), org.telegram.messenger.g0.L(this.M4), org.telegram.messenger.g0.L(this.M4));
                i50++;
                L19 = L19;
            }
            i23 = L19;
        }
        if (bd.a0) {
            this.Z2 = this.c3;
            this.a3 = getMeasuredWidth() - org.telegram.messenger.g0.L(64.0f);
        } else {
            this.a3 = getMeasuredWidth() - org.telegram.messenger.g0.L(this.J);
            this.Z2 = org.telegram.messenger.g0.L(64.0f);
        }
        if (this.R) {
            this.r3 = org.telegram.messenger.g0.L(20.0f) + this.r3;
        }
        if (((!this.s2 && !az.p1) || W()) && (fVar2 = this.u0) != null && !fVar2.u()) {
            this.N2 -= org.telegram.messenger.g0.L(6.0f);
            this.X2 -= org.telegram.messenger.g0.L(6.0f);
        }
        if (getIsPinned()) {
            if (bd.a0) {
                this.E3 = org.telegram.messenger.g0.L(14.0f);
            } else {
                this.E3 = (getMeasuredWidth() - org.telegram.ui.ActionBar.k6.j1.getIntrinsicWidth()) - org.telegram.messenger.g0.L(14.0f);
            }
        }
        if (this.u3) {
            int L22 = org.telegram.messenger.g0.L(29.0f);
            i24 -= L22;
            if (bd.a0) {
                this.w3 = org.telegram.messenger.g0.L(15.666f);
                this.c3 += L22;
                this.e3 += L22;
                this.d3 += L22;
                this.s3 += L22;
            } else {
                this.w3 = getMeasuredWidth() - org.telegram.messenger.g0.L(36.3333f);
            }
        } else if (str7 != null || str12 != null || this.d4 || this.e4) {
            if (str7 != null) {
                this.P3 = Math.max(org.telegram.messenger.g0.L(f15), (int) Math.ceil(org.telegram.ui.ActionBar.k6.M0.measureText(str7)));
                this.Y3 = new StaticLayout(str7, org.telegram.ui.ActionBar.k6.M0, this.P3, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                int L23 = org.telegram.messenger.g0.L(f10) + this.P3;
                i24 -= L23;
                if (bd.a0) {
                    this.O3 = org.telegram.messenger.g0.L(15.666f);
                    this.c3 += L23;
                    this.e3 += L23;
                    this.d3 += L23;
                    this.s3 += L23;
                } else {
                    this.O3 = org.telegram.messenger.camera.q.w(12.666f, this.P3, getMeasuredWidth() - org.telegram.messenger.g0.L(15.666f));
                }
                this.H3 = true;
            } else {
                this.P3 = 0;
            }
            if (str12 != null) {
                if (this.K0 != 0) {
                    this.i4 = Math.max(org.telegram.messenger.g0.L(f15), (int) Math.ceil(org.telegram.ui.ActionBar.k6.M0.measureText(str12)));
                    this.j4 = new StaticLayout(str12, org.telegram.ui.ActionBar.k6.M0, this.i4, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                } else {
                    this.i4 = org.telegram.messenger.g0.L(f15);
                }
                int L24 = org.telegram.messenger.g0.L(f10) + this.i4;
                i24 -= L24;
                if (bd.a0) {
                    int L25 = org.telegram.messenger.g0.L(15.666f);
                    int i51 = this.P3;
                    this.f4 = L25 + (i51 != 0 ? i51 + org.telegram.messenger.g0.L(f10) : 0);
                    this.c3 += L24;
                    this.e3 += L24;
                    this.d3 += L24;
                    this.s3 += L24;
                } else {
                    int w10 = org.telegram.messenger.camera.q.w(12.666f, this.i4, getMeasuredWidth()) - org.telegram.messenger.g0.L(15.666f);
                    int i52 = this.P3;
                    this.f4 = w10 - (i52 != 0 ? i52 + org.telegram.messenger.g0.L(f10) : 0);
                }
                this.c4 = true;
            } else {
                this.i4 = 0;
            }
            if (this.d4) {
                int L26 = org.telegram.messenger.g0.L(25.0f);
                i24 -= L26;
                if (bd.a0) {
                    int L27 = org.telegram.messenger.g0.L(15.666f);
                    this.g4 = L27;
                    if (this.c4) {
                        int i53 = this.i4;
                        this.g4 = L27 + (i53 != 0 ? i53 + org.telegram.messenger.g0.L(f10) : 0);
                    }
                    if (this.H3) {
                        int i54 = this.g4;
                        int i55 = this.P3;
                        this.g4 = i54 + (i55 != 0 ? i55 + org.telegram.messenger.g0.L(f10) : 0);
                    }
                    this.c3 += L26;
                    this.e3 += L26;
                    this.d3 += L26;
                    this.s3 += L26;
                } else {
                    int measuredWidth5 = getMeasuredWidth() - org.telegram.messenger.g0.L(36.332f);
                    this.g4 = measuredWidth5;
                    if (this.c4) {
                        int i56 = this.i4;
                        this.g4 = measuredWidth5 - (i56 != 0 ? i56 + org.telegram.messenger.g0.L(f10) : 0);
                    }
                    if (this.H3) {
                        int i57 = this.g4;
                        int i58 = this.P3;
                        this.g4 = i57 - (i58 != 0 ? i58 + org.telegram.messenger.g0.L(f10) : 0);
                    }
                }
            }
            if (this.e4) {
                int L28 = org.telegram.messenger.g0.L(25.0f);
                i24 -= L28;
                if (bd.a0) {
                    int L29 = org.telegram.messenger.g0.L(15.666f);
                    this.h4 = L29;
                    if (this.d4) {
                        this.h4 = org.telegram.messenger.g0.L(25.0f) + L29;
                    }
                    if (this.c4) {
                        int i59 = this.h4;
                        int i60 = this.i4;
                        this.h4 = i59 + (i60 != 0 ? i60 + org.telegram.messenger.g0.L(f10) : 0);
                    }
                    if (this.H3) {
                        int i61 = this.h4;
                        int i62 = this.P3;
                        this.h4 = i61 + (i62 != 0 ? i62 + org.telegram.messenger.g0.L(f10) : 0);
                    }
                    this.c3 += L28;
                    this.e3 += L28;
                    this.d3 += L28;
                    this.s3 += L28;
                } else {
                    int measuredWidth6 = getMeasuredWidth() - org.telegram.messenger.g0.L(36.332f);
                    this.h4 = measuredWidth6;
                    if (this.d4) {
                        this.h4 = measuredWidth6 - org.telegram.messenger.g0.L(25.0f);
                    }
                    if (this.c4) {
                        int i63 = this.h4;
                        int i64 = this.i4;
                        this.h4 = i63 - (i64 != 0 ? i64 + org.telegram.messenger.g0.L(f10) : 0);
                    }
                    if (this.H3) {
                        int i65 = this.h4;
                        int i66 = this.P3;
                        this.h4 = i65 - (i66 != 0 ? i66 + org.telegram.messenger.g0.L(f10) : 0);
                    }
                }
            }
        } else if (!this.K1 || V() || W() || U() || !l10.t(this.g2) || !this.g2.bot_has_main_app) {
            this.H3 = false;
            this.c4 = false;
        } else {
            setOpenBotButton(true);
            int g7 = (int) (this.J1.g() + org.telegram.messenger.g0.L(26.0f));
            int L30 = org.telegram.messenger.g0.L(f18);
            i24 -= g7;
            int L31 = (this.s2 || az.p1) ? org.telegram.messenger.g0.L(40.0f) : this.Q ? org.telegram.messenger.g0.L(33.0f) : org.telegram.messenger.g0.L(f14);
            if (bd.a0) {
                this.I1.set(org.telegram.messenger.g0.L(f18), L31, org.telegram.messenger.g0.L(f18) + g7, org.telegram.messenger.g0.L(28.0f) + L31);
                int i67 = g7 + L30;
                this.c3 += i67;
                this.e3 += i67;
                this.d3 += i67;
                this.s3 += i67;
            } else {
                this.I1.set((getMeasuredWidth() - g7) - org.telegram.messenger.g0.L(f18), L31, getMeasuredWidth() - org.telegram.messenger.g0.L(f18), org.telegram.messenger.g0.L(28.0f) + L31);
            }
            this.H3 = false;
            this.c4 = false;
        }
        z27 = this.u3 && this.H0 == null && !V() && !W() && !U() && (this.T0 > 0 || this.U0) && (ziVar8 = this.g1) != null && !ziVar8.Q3() && (this.g1.k.action instanceof TLRPC.TL_messageActionGramTransfer);
        this.I3 = z27;
        if (z27) {
            int L32 = (this.H3 && this.M3) ? this.P3 + org.telegram.messenger.g0.L(f10) : 0;
            if (this.c4 && this.M3) {
                L32 = org.telegram.messenger.k5.C(f10, this.i4, L32);
            }
            if (this.d4) {
                L32 += org.telegram.messenger.g0.L(25.0f);
            }
            if (this.e4) {
                L32 += org.telegram.messenger.g0.L(25.0f);
            }
            if (this.F1) {
                L32 = org.telegram.messenger.k5.C(4.0f, (int) this.I1.width(), L32);
            }
            this.J3 = bd.a0 ? org.telegram.messenger.g0.L(15.666f) + L32 : org.telegram.messenger.k5.z(43.666f, getMeasuredWidth(), L32);
            i24 -= org.telegram.messenger.g0.L(32.0f);
            if (bd.a0) {
                this.c3 = org.telegram.messenger.g0.L(32.0f) + this.c3;
                this.e3 = org.telegram.messenger.g0.L(32.0f) + this.e3;
                this.d3 = org.telegram.messenger.g0.L(32.0f) + this.d3;
                this.s3 = org.telegram.messenger.g0.L(32.0f) + this.s3;
            }
        }
        if (z21) {
            if (charSequence6 == null) {
                charSequence6 = "";
            }
            if (charSequence6.length() > 150) {
                charSequence6 = charSequence6.subSequence(0, hs.g2);
            }
            charSequence6 = org.telegram.messenger.i6.l(((this.s2 || az.p1) && !S() && charSequence27 == null) ? org.telegram.messenger.g0.Y2(charSequence6) : org.telegram.messenger.g0.N2(charSequence6), org.telegram.ui.ActionBar.k6.F0[this.F0].getFontMetricsInt(), false);
            zi ziVar25 = this.g1;
            if (ziVar25 != null && (x13 = org.telegram.messenger.g0.x1(charSequence6, ziVar25.Y1, this.K4)) != null) {
                charSequence6 = x13;
            }
        }
        int max2222 = Math.max(org.telegram.messenger.g0.L(12.0f), i24);
        this.h3 = org.telegram.messenger.g0.L((!this.s2 || az.p1) ? 58.0f : 62.0f);
        if (((!this.s2 && !az.p1) || W()) && S()) {
            this.h3 -= org.telegram.messenger.g0.L(!W() ? 10.0f : 12.0f);
        }
        if (!W()) {
            this.b3 = org.telegram.messenger.g0.L((this.s2 || az.p1) ? 34.0f : f16);
            int i68 = 0;
            while (true) {
                ImageReceiver[] imageReceiverArr4 = this.W1;
                if (i68 >= imageReceiverArr4.length) {
                    break;
                }
                imageReceiverArr4[i68].D0(this.h3);
                i68++;
            }
            i25 = max2222;
        } else if ((this.s2 || az.p1) && !S() && charSequence27 != null && (this.K0 == 0 || this.N0 == 1)) {
            try {
                ziVar7 = this.g1;
            } catch (Exception e17) {
                e = e17;
                i25 = max2222;
            }
            if (ziVar7 != null && ziVar7.s2()) {
                CharSequence x16 = org.telegram.messenger.g0.x1(charSequence27, this.g1.Y1, this.K4);
                if (x16 != null) {
                    charSequence28 = x16;
                    TextPaint textPaint8 = org.telegram.ui.ActionBar.k6.G0;
                    Layout.Alignment alignment4 = Layout.Alignment.ALIGN_NORMAL;
                    TextUtils.TruncateAt truncateAt4 = TextUtils.TruncateAt.END;
                    i25 = max2222;
                    this.t3 = lu0.b(charSequence28, textPaint8, i25, 0.0f, i25, 1);
                    this.b3 = org.telegram.messenger.g0.L(51.0f);
                    L5 = (this.S || !this.Q) ? 0 : org.telegram.messenger.g0.L(20.0f);
                    i26 = 0;
                    while (true) {
                        imageReceiverArr2 = this.W1;
                        if (i26 >= imageReceiverArr2.length) {
                            break;
                        }
                        imageReceiverArr2[i26].D0(org.telegram.messenger.g0.L(40.0f) + i23 + L5);
                        i26++;
                    }
                    charSequence27 = charSequence28;
                }
            }
            charSequence28 = charSequence27;
            TextPaint textPaint82 = org.telegram.ui.ActionBar.k6.G0;
            Layout.Alignment alignment42 = Layout.Alignment.ALIGN_NORMAL;
            TextUtils.TruncateAt truncateAt42 = TextUtils.TruncateAt.END;
            i25 = max2222;
            this.t3 = lu0.b(charSequence28, textPaint82, i25, 0.0f, i25, 1);
            this.b3 = org.telegram.messenger.g0.L(51.0f);
            if (this.S) {
            }
            i26 = 0;
            while (true) {
                imageReceiverArr2 = this.W1;
                if (i26 >= imageReceiverArr2.length) {
                }
                imageReceiverArr2[i26].D0(org.telegram.messenger.g0.L(40.0f) + i23 + L5);
                i26++;
            }
            charSequence27 = charSequence28;
        } else {
            i25 = max2222;
            this.t3 = null;
            if (this.s2 || az.p1) {
                this.b3 = org.telegram.messenger.g0.L(32.0f);
                int L33 = (this.S && this.Q) ? org.telegram.messenger.g0.L(20.0f) : 0;
                int i69 = 0;
                while (true) {
                    ImageReceiver[] imageReceiverArr5 = this.W1;
                    if (i69 >= imageReceiverArr5.length) {
                        break;
                    }
                    imageReceiverArr5[i69].D0(org.telegram.messenger.g0.L(21.0f) + i23 + L33);
                    i69++;
                }
            } else {
                this.b3 = org.telegram.messenger.g0.L(f16);
            }
        }
        if (this.R) {
            this.b3 = org.telegram.messenger.g0.L(20.0f) + this.b3;
        }
        this.o3 = org.telegram.ui.Components.p5.update(0, (View) this, this.o3, this.t3);
        try {
            if (TextUtils.isEmpty(charSequence26)) {
                this.i3 = null;
            } else {
                this.i3 = new StaticLayout(TextUtils.ellipsize(org.telegram.messenger.i6.l(charSequence26, this.b0.getFontMetricsInt(), false), this.b0, i25 - org.telegram.messenger.g0.L(26.0f), TextUtils.TruncateAt.END), this.b0, i25 - org.telegram.messenger.g0.L(20.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                this.l3.addAll(this.m3);
                this.m3.clear();
                yh.f.c(this, this.i3, this.l3, this.m3);
            }
        } catch (Exception unused) {
        }
        this.p3 = org.telegram.ui.Components.p5.update(0, (View) this, this.p3, this.i3);
        try {
            if (!TextUtils.isEmpty(charSequence25)) {
                try {
                    if (!this.s2) {
                        if (!az.p1) {
                        }
                        i30 = i25;
                        StaticLayout staticLayout2 = new StaticLayout(TextUtils.ellipsize(charSequence25, this.b0, i25 - org.telegram.messenger.g0.L(12.0f), TextUtils.TruncateAt.END), org.telegram.ui.ActionBar.k6.H0[this.F0], i30, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                        i25 = i30;
                        this.g3 = staticLayout2;
                    }
                    StaticLayout staticLayout22 = new StaticLayout(TextUtils.ellipsize(charSequence25, this.b0, i25 - org.telegram.messenger.g0.L(12.0f), TextUtils.TruncateAt.END), org.telegram.ui.ActionBar.k6.H0[this.F0], i30, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                    i25 = i30;
                    this.g3 = staticLayout22;
                } catch (Exception e18) {
                    e = e18;
                    i25 = i30;
                    org.telegram.messenger.a8.f(e);
                    if (charSequence6 instanceof Spannable) {
                    }
                    if (this.s2) {
                    }
                    this.b0 = org.telegram.ui.ActionBar.k6.F0[this.F0];
                    charSequence29 = charSequence27;
                    charSequence30 = null;
                    Layout.Alignment alignment22222 = Layout.Alignment.ALIGN_NORMAL;
                    if (this.s2) {
                    }
                    if (this.S1 > 0) {
                    }
                    TextPaint textPaint622222 = this.b0;
                    float L1122222 = org.telegram.messenger.g0.L(1.0f);
                    TextUtils.TruncateAt truncateAt22222 = TextUtils.TruncateAt.END;
                    this.f3 = lu0.b(charSequence29, textPaint622222, L6, L1122222, L6, charSequence30 != null ? 1 : 2);
                    i27 = L6;
                    this.j3.addAll(this.k3);
                    this.k3.clear();
                    yh.f.b(this, this.f3, -2, -2, this.j3, this.k3);
                    int i40222222 = i27;
                    this.n3 = org.telegram.ui.Components.p5.update(0, (View) this, this.n3, this.f3);
                    if (bd.a0) {
                    }
                    staticLayout = this.g3;
                    if (staticLayout != null) {
                    }
                    m0();
                }
                if (!S()) {
                    TextPaint textPaint9 = org.telegram.ui.ActionBar.k6.H0[this.F0];
                    Layout.Alignment alignment5 = Layout.Alignment.ALIGN_NORMAL;
                    float L34 = org.telegram.messenger.g0.L(1.0f);
                    TextUtils.TruncateAt truncateAt5 = TextUtils.TruncateAt.END;
                    int i70 = i25;
                    try {
                        this.g3 = lu0.b(charSequence25, textPaint9, i70, L34, i25, 1);
                    } catch (Exception e19) {
                        e = e19;
                        i25 = i70;
                        org.telegram.messenger.a8.f(e);
                        if (charSequence6 instanceof Spannable) {
                        }
                        if (this.s2) {
                        }
                        this.b0 = org.telegram.ui.ActionBar.k6.F0[this.F0];
                        charSequence29 = charSequence27;
                        charSequence30 = null;
                        Layout.Alignment alignment222222 = Layout.Alignment.ALIGN_NORMAL;
                        if (this.s2) {
                        }
                        if (this.S1 > 0) {
                        }
                        TextPaint textPaint6222222 = this.b0;
                        float L11222222 = org.telegram.messenger.g0.L(1.0f);
                        TextUtils.TruncateAt truncateAt222222 = TextUtils.TruncateAt.END;
                        this.f3 = lu0.b(charSequence29, textPaint6222222, L6, L11222222, L6, charSequence30 != null ? 1 : 2);
                        i27 = L6;
                        this.j3.addAll(this.k3);
                        this.k3.clear();
                        yh.f.b(this, this.f3, -2, -2, this.j3, this.k3);
                        int i402222222 = i27;
                        this.n3 = org.telegram.ui.Components.p5.update(0, (View) this, this.n3, this.f3);
                        if (bd.a0) {
                        }
                        staticLayout = this.g3;
                        if (staticLayout != null) {
                            if (i16 >= 0) {
                            }
                            primaryHorizontal = this.g3.getPrimaryHorizontal(0);
                            primaryHorizontal2 = this.g3.getPrimaryHorizontal(1);
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
                    if (!(obj instanceof ClickableSpan) && !(obj instanceof oi.h)) {
                        if (this.L0 == 0) {
                            if (!V()) {
                                if (!(obj instanceof o31)) {
                                }
                            }
                        }
                        if (!(obj instanceof oi.d)) {
                            if (!(obj instanceof xg0)) {
                                if (!(obj instanceof wg0)) {
                                    if ((obj instanceof StyleSpan) && ((StyleSpan) obj).getStyle() == 1) {
                                    }
                                }
                            }
                        }
                    }
                    spannable.removeSpan(obj);
                }
            }
            if ((!this.s2 || az.p1) && !S() && this.K0 != 0 && this.N0 > 1) {
                this.b0 = org.telegram.ui.ActionBar.k6.F0[this.F0];
                charSequence29 = charSequence27;
                charSequence30 = null;
            } else {
                if (!this.s2) {
                }
                if (!S()) {
                    if (charSequence27 == null) {
                        if (org.telegram.messenger.t3.p0(this.h2) && org.telegram.messenger.t3.g(this.G0, this.h2)) {
                        }
                        charSequence30 = charSequence27;
                        charSequence29 = charSequence6;
                    }
                }
                charSequence6 = (W() || !(charSequence6 instanceof Spanned) || ((r2[]) ((Spanned) charSequence6).getSpans(0, charSequence6.length(), r2.class)).length > 0) ? TextUtils.ellipsize(charSequence6, this.b0, i25 - org.telegram.messenger.g0.L(12.0f), TextUtils.TruncateAt.END) : TextUtils.ellipsize(charSequence6, this.b0, i25 - org.telegram.messenger.g0.L(((this.M4 + 2) * this.S1) + 15), TextUtils.TruncateAt.END);
                charSequence30 = charSequence27;
                charSequence29 = charSequence6;
            }
            Layout.Alignment alignment2222222 = Layout.Alignment.ALIGN_NORMAL;
            if ((!this.s2 || az.p1) && !S()) {
                L6 = (this.S1 > 0 || charSequence30 == null) ? i25 : i25 + org.telegram.messenger.g0.L(5.0f);
                TextPaint textPaint62222222 = this.b0;
                float L112222222 = org.telegram.messenger.g0.L(1.0f);
                TextUtils.TruncateAt truncateAt2222222 = TextUtils.TruncateAt.END;
                this.f3 = lu0.b(charSequence29, textPaint62222222, L6, L112222222, L6, charSequence30 != null ? 1 : 2);
                i27 = L6;
            } else {
                if (this.S1 > 0) {
                    i27 = i25 + org.telegram.messenger.g0.L(((this.M4 + 2) * r0) + 3);
                    try {
                        if (bd.a0 && !W()) {
                            this.c3 -= org.telegram.messenger.g0.L(((this.M4 + 2) * this.S1) + 3);
                        }
                        i29 = i27;
                    } catch (Exception e21) {
                        e = e21;
                        this.f3 = null;
                        org.telegram.messenger.a8.f(e);
                        int i4022222222 = i27;
                        this.n3 = org.telegram.ui.Components.p5.update(0, (View) this, this.n3, this.f3);
                        if (bd.a0) {
                        }
                        staticLayout = this.g3;
                        if (staticLayout != null) {
                        }
                        m0();
                    }
                } else {
                    i29 = i25;
                }
                try {
                    this.f3 = new StaticLayout(charSequence29, this.b0, i29, alignment2222222, 1.0f, 0.0f, false);
                    i27 = i29;
                } catch (Exception e22) {
                    e = e22;
                    i27 = i29;
                    this.f3 = null;
                    org.telegram.messenger.a8.f(e);
                    int i40222222222 = i27;
                    this.n3 = org.telegram.ui.Components.p5.update(0, (View) this, this.n3, this.f3);
                    if (bd.a0) {
                    }
                    staticLayout = this.g3;
                    if (staticLayout != null) {
                    }
                    m0();
                }
            }
            this.j3.addAll(this.k3);
            this.k3.clear();
            yh.f.b(this, this.f3, -2, -2, this.j3, this.k3);
        } catch (Exception e23) {
            e = e23;
            i27 = i25;
        }
        int i402222222222 = i27;
        this.n3 = org.telegram.ui.Components.p5.update(0, (View) this, this.n3, this.f3);
        if (bd.a0) {
            StaticLayout staticLayout3 = this.A2;
            if (staticLayout3 != null && staticLayout3.getLineCount() > 0) {
                float lineRight = this.A2.getLineRight(0);
                if (this.E2) {
                    lineRight = Math.min(this.z2, lineRight);
                }
                if (lineRight == this.z2) {
                    double ceil2 = Math.ceil(this.A2.getLineWidth(0));
                    if (this.E2) {
                        ceil2 = Math.min(this.z2, ceil2);
                    }
                    double d10 = this.z2;
                    if (ceil2 < d10) {
                        this.y2 = (int) (this.y2 - (d10 - ceil2));
                    }
                }
                if (this.l4) {
                    this.y2 = org.telegram.messenger.g0.L(21.0f) + this.y2;
                }
                int L35 = (int) (this.y2 + lineRight + org.telegram.messenger.g0.L(6.0f));
                this.I2 = L35;
                if (this.m4) {
                    this.J2 = org.telegram.messenger.g0.L(30.0f) + L35;
                }
            }
            StaticLayout staticLayout4 = this.f3;
            float f22 = 2.14748365E9f;
            if (staticLayout4 != null && (lineCount3 = staticLayout4.getLineCount()) > 0) {
                float f23 = 2.14748365E9f;
                for (int i71 = 0; i71 < lineCount3; i71++) {
                    f23 = Math.min(f23, this.f3.getLineLeft(i71));
                }
                this.c3 = (int) (this.c3 - f23);
            }
            StaticLayout staticLayout5 = this.i3;
            if (staticLayout5 != null && (lineCount2 = staticLayout5.getLineCount()) > 0) {
                float f24 = 2.14748365E9f;
                for (int i72 = 0; i72 < lineCount2; i72++) {
                    f24 = Math.min(f24, this.i3.getLineLeft(i72));
                }
                this.d3 = (int) (this.d3 - f24);
            }
            StaticLayout staticLayout6 = this.g3;
            if (staticLayout6 != null && (lineCount = staticLayout6.getLineCount()) > 0) {
                for (int i73 = 0; i73 < lineCount; i73++) {
                    f22 = Math.min(f22, this.g3.getLineLeft(i73));
                }
                this.e3 = (int) (this.e3 - f22);
            }
            StaticLayout staticLayout7 = this.t3;
            if (staticLayout7 != null && staticLayout7.getLineCount() > 0) {
                this.s3 = (int) (this.s3 - this.t3.getLineLeft(0));
            }
        } else {
            StaticLayout staticLayout8 = this.A2;
            if (staticLayout8 != null && staticLayout8.getLineCount() > 0) {
                float lineLeft = this.A2.getLineLeft(0);
                double ceil3 = Math.ceil(this.A2.getLineWidth(0));
                int L36 = org.telegram.messenger.g0.L(12.0f) + this.y2;
                this.y2 = L36;
                if (this.l4) {
                    this.y2 = org.telegram.messenger.g0.L(21.0f) + L36;
                }
                if (this.E2) {
                    ceil3 = Math.min(this.z2, ceil3);
                }
                if ((this.a1 || this.c1 || this.d1 > f13) && !this.k4 && this.q4 == 0) {
                    if (this.m4) {
                        int L37 = (int) ((((this.z2 - ceil3) - lineLeft) + this.y2) - org.telegram.messenger.g0.L(f17));
                        this.I2 = L37;
                        this.J2 = (L37 - org.telegram.messenger.g0.L(6.0f)) - org.telegram.ui.ActionBar.k6.c1.getIntrinsicWidth();
                    } else {
                        this.I2 = (int) ((((this.z2 - ceil3) + this.y2) - org.telegram.messenger.g0.L(6.0f)) - org.telegram.ui.ActionBar.k6.c1.getIntrinsicWidth());
                    }
                } else if (this.k4) {
                    this.I2 = (int) ((((this.z2 - ceil3) + this.y2) - org.telegram.messenger.g0.L(6.0f)) - org.telegram.ui.ActionBar.k6.f1.getIntrinsicWidth());
                } else if (this.m4) {
                    int L38 = (int) ((((this.z2 - ceil3) - lineLeft) + this.y2) - org.telegram.messenger.g0.L(f17));
                    this.I2 = L38;
                    this.J2 = (L38 - org.telegram.messenger.g0.L(6.0f)) - org.telegram.ui.ActionBar.k6.c1.getIntrinsicWidth();
                } else if (this.q4 != 0) {
                    this.I2 = (int) ((((this.z2 - ceil3) + this.y2) - org.telegram.messenger.g0.L(6.0f)) - (this.q4 == 1 ? org.telegram.ui.ActionBar.k6.g1 : org.telegram.ui.ActionBar.k6.h1).getIntrinsicWidth());
                } else {
                    this.I2 = (int) ((((this.z2 - ceil3) + this.y2) - org.telegram.messenger.g0.L(6.0f)) - org.telegram.ui.ActionBar.k6.c1.getIntrinsicWidth());
                }
                if (lineLeft == f13) {
                    double d11 = this.z2;
                    if (ceil3 < d11) {
                        this.y2 = (int) ((d11 - ceil3) + this.y2);
                    }
                }
            }
            StaticLayout staticLayout9 = this.f3;
            int i74 = ConnectionsManager.DEFAULT_DATACENTER_ID;
            if (staticLayout9 != null && (lineCount6 = staticLayout9.getLineCount()) > 0) {
                int i75 = Integer.MAX_VALUE;
                int i76 = 0;
                while (true) {
                    if (i76 >= lineCount6) {
                        break;
                    }
                    if (this.f3.getLineLeft(i76) != f13) {
                        i75 = 0;
                        break;
                    } else {
                        i75 = Math.min(i75, (int) (i402222222222 - Math.ceil(this.f3.getLineWidth(i76))));
                        i76++;
                    }
                }
                if (i75 != Integer.MAX_VALUE) {
                    this.c3 += i75;
                }
            }
            StaticLayout staticLayout10 = this.g3;
            if (staticLayout10 != null && (lineCount5 = staticLayout10.getLineCount()) > 0) {
                int i77 = Integer.MAX_VALUE;
                int i78 = 0;
                while (true) {
                    if (i78 >= lineCount5) {
                        break;
                    }
                    if (this.g3.getLineLeft(i78) != f13) {
                        i77 = 0;
                        break;
                    } else {
                        i77 = Math.min(i77, (int) (i402222222222 - Math.ceil(this.g3.getLineWidth(i78))));
                        i78++;
                    }
                }
                if (i77 != Integer.MAX_VALUE) {
                    this.e3 += i77;
                }
            }
            StaticLayout staticLayout11 = this.t3;
            if (staticLayout11 != null && staticLayout11.getLineCount() > 0 && this.t3.getLineLeft(0) == f13) {
                double ceil4 = Math.ceil(this.t3.getLineWidth(0));
                double d12 = i402222222222;
                if (ceil4 < d12) {
                    this.s3 = (int) ((d12 - ceil4) + this.s3);
                }
            }
            StaticLayout staticLayout12 = this.i3;
            if (staticLayout12 != null && (lineCount4 = staticLayout12.getLineCount()) > 0) {
                for (int i79 = 0; i79 < lineCount4; i79++) {
                    i74 = (int) Math.min(i74, this.i3.getWidth() - this.i3.getLineRight(i79));
                }
                this.d3 += i74;
            }
        }
        staticLayout = this.g3;
        if (staticLayout != null && this.k2 >= 0 && staticLayout.getText().length() > 0) {
            if (i16 >= 0 || (i28 = i16 + 1) >= this.g3.getText().length()) {
                primaryHorizontal = this.g3.getPrimaryHorizontal(0);
                primaryHorizontal2 = this.g3.getPrimaryHorizontal(1);
            } else {
                primaryHorizontal = this.g3.getPrimaryHorizontal(i16);
                primaryHorizontal2 = this.g3.getPrimaryHorizontal(i28);
            }
            if (primaryHorizontal >= primaryHorizontal2) {
                this.D4 = (int) (this.e3 + primaryHorizontal);
            } else {
                this.D4 = (int) (this.e3 + primaryHorizontal2 + org.telegram.messenger.g0.L(3.0f));
            }
        }
        m0();
    }

    public final void y() {
        TLRPC.Message message;
        zi ziVar = this.g1;
        if (ziVar == null || (message = ziVar.k) == null) {
            return;
        }
        TLRPC.MessageAction messageAction = message.action;
        if ((messageAction instanceof TLRPC.TL_messageActionSetChatTheme) && this.Y0) {
            org.telegram.messenger.d4 f10 = org.telegram.messenger.d4.f(this.G0);
            long j10 = this.I0;
            TLRPC.ChatTheme chatTheme = ((TLRPC.TL_messageActionSetChatTheme) messageAction).theme;
            f10.s(j10, jg.b.c(chatTheme), chatTheme, false);
        }
    }

    public final void z() {
        TLRPC.Chat chat = this.h2;
        boolean z10 = chat != null && chat.call_active && chat.call_not_empty;
        this.w2 = z10;
        this.r1 = z10 ? 1.0f : 0.0f;
    }

    public t2(uw uwVar, Context context, boolean z10, int i3, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.h = true;
        this.y = true;
        int i10 = 0;
        this.E = false;
        this.I = 11;
        this.J = 72;
        this.K = 70;
        this.L = 76;
        this.M = 3;
        this.N = 11;
        this.V = 42.0f;
        m2 m2Var = new m2(this);
        this.v0 = m2Var;
        this.A0 = true;
        this.D0 = 0.0f;
        this.e1 = false;
        this.f1 = false;
        this.G1 = new gc(this);
        this.H1 = new Paint(1);
        this.I1 = new RectF();
        this.M1 = false;
        this.V1 = new boolean[3];
        this.W1 = new ImageReceiver[3];
        this.X1 = new boolean[3];
        this.Y1 = new boolean[3];
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.Z1 = imageReceiver;
        this.b2 = new org.telegram.ui.Components.u8((org.telegram.ui.ActionBar.e6) null);
        this.e2 = new b5.c(2);
        xq xqVar = xq.h;
        this.n2 = new org.telegram.ui.Components.u5(this, 0L, 350L, xqVar);
        this.p2 = new org.telegram.ui.Components.u5(this, 0L, 350L, xqVar);
        this.j3 = new Stack();
        this.k3 = new ArrayList();
        this.l3 = new Stack();
        this.m3 = new ArrayList();
        this.M3 = true;
        this.T3 = new qe.a(this, xqVar, 320L);
        this.W3 = 1.0f;
        this.X3 = 1.0f;
        this.s4 = new RectF();
        this.y4 = -1;
        this.I4 = -1;
        this.J4 = new q2(this);
        m2Var.I = true;
        this.K4 = e6Var;
        this.E4 = uwVar;
        org.telegram.ui.ActionBar.k6.T(context);
        this.E = false;
        this.F = false;
        imageReceiver.J0(org.telegram.messenger.g0.L(26.0f));
        while (true) {
            ImageReceiver[] imageReceiverArr = this.W1;
            if (i10 >= imageReceiverArr.length) {
                this.s2 = z10;
                this.G0 = i3;
                ai.x2 x2Var = new ai.x2(13, context, this);
                this.n4 = x2Var;
                addView(x2Var);
                this.o4 = new org.telegram.ui.Components.e5(org.telegram.messenger.g0.L(22.0f), x2Var);
                this.p4 = new org.telegram.ui.Components.e5(org.telegram.messenger.g0.L(17.0f), this);
                this.Z1.A1 = true;
                return;
            }
            imageReceiverArr[i10] = new ImageReceiver(this);
            ImageReceiver imageReceiver2 = this.W1[i10];
            imageReceiver2.y = true;
            imageReceiver2.J0(org.telegram.messenger.g0.L(2.0f));
            this.W1[i10].A1 = true;
            i10++;
        }
    }

    @Override // android.view.View
    public final void invalidate(int i3, int i10, int i11, int i12) {
        if (ei.r9.y1) {
            return;
        }
        super.invalidate(i3, i10, i11, i12);
    }
}
