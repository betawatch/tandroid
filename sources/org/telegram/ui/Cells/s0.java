package org.telegram.ui.Cells;

import android.animation.ValueAnimator;
import android.app.ActivityManager;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.AlignmentSpan;
import android.text.style.CharacterStyle;
import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import android.util.StateSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.Stack;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.bj;
import org.telegram.messenger.c00;
import org.telegram.messenger.cd;
import org.telegram.messenger.d20;
import org.telegram.messenger.h20;
import org.telegram.messenger.hs;
import org.telegram.messenger.ic;
import org.telegram.messenger.jj;
import org.telegram.messenger.oj;
import org.telegram.messenger.sc;
import org.telegram.messenger.tz;
import org.telegram.messenger.ui;
import org.telegram.messenger.us;
import org.telegram.messenger.vp;
import org.telegram.messenger.z20;
import org.telegram.messenger.zs;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.RadialProgress2;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.b40;
import org.telegram.ui.Components.bi0;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.dc;
import org.telegram.ui.Components.dq;
import org.telegram.ui.Components.e51;
import org.telegram.ui.Components.fq;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.ht;
import org.telegram.ui.Components.l11;
import org.telegram.ui.Components.nx0;
import org.telegram.ui.Components.qz0;
import org.telegram.ui.Components.t80;
import org.telegram.ui.Components.tk0;
import org.telegram.ui.Components.wy0;
import org.telegram.ui.Components.x41;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.dk;
import org.telegram.ui.eg;
import org.telegram.ui.iy0;
import org.telegram.ui.km;
import org.telegram.ui.lg;
import org.telegram.ui.ns0;
import org.telegram.ui.sb;
import org.telegram.ui.xn;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public class s0 extends z implements org.telegram.messenger.z5, us, r4 {
    public static final HashMap s2;
    public float A0;
    public StaticLayout A1;
    public float B0;
    public float B1;
    public boolean C0;
    public StaticLayout C1;
    public nh.i D;
    public boolean D0;
    public float D1;
    public boolean E;
    public final sg.p0 E0;
    public final TextPaint E1;
    public boolean F;
    public float F0;
    public final TextPaint F1;
    public boolean G;
    public float G0;
    public final TextPaint G1;
    public final int H;
    public rh.g4 H0;
    public TLRPC.Document H1;
    public final ImageReceiver I;
    public org.telegram.ui.Wallet.d4 I0;
    public TLRPC.VideoSize I1;
    public Drawable J;
    public boolean J0;
    public final RadialProgress2 J1;
    public Path K;
    public float K0;
    public int K1;
    public final org.telegram.ui.Components.r8 L;
    public float L0;
    public boolean L1;
    public StaticLayout M;
    public float M0;
    public RectF M1;
    public int N;
    public final RectF N0;
    public final ca N1;
    public int O;
    public nx0 O0;
    public boolean O1;
    public StaticLayout P;
    public jj P0;
    public ColorMatrixColorFilter P1;
    public int Q;
    public int Q0;
    public CornerPathEffect Q1;
    public int R;
    public CharSequence R0;
    public Path R1;
    public int S;
    public ph.z0 S0;
    public qz0 S1;
    public int T;
    public int T0;
    public final View T1;
    public int U;
    public int U0;
    public final Path U1;
    public int V;
    public Paint V0;
    public final kg.f2 V1;
    public boolean W;
    public TextPaint W0;
    public int W1;
    public final ArrayList X0;
    public final ArrayList X1;
    public final ArrayList Y0;
    public c5.x Y1;
    public final Path Z0;
    public boolean Z1;
    public boolean a0;
    public int a1;
    public int a2;
    public RadialProgressView b0;
    public int b1;
    public float b2;
    public float c0;
    public final RectF c1;
    public final Paint c2;
    public final th.t5 d0;
    public boolean d1;
    public boolean d2;
    public boolean e0;
    public boolean e1;
    public View.OnClickListener e2;
    public int f;
    public boolean f0;
    public q0 f1;
    public int f2;
    public boolean g0;
    public final org.telegram.ui.ActionBar.p6 g1;
    public final Path g2;
    public int h;
    public boolean h0;
    public int h1;
    public final float[] h2;
    public boolean i0;
    public int i1;
    public final float[] i2;
    public int j0;
    public StaticLayout j1;
    public final Path j2;
    public boolean k0;
    public Paint k1;
    public final int[] k2;
    public int l0;
    public qz0 l1;
    public int l2;
    public boolean m0;
    public StaticLayout m1;
    public SpannableStringBuilder m2;
    public final dc n;
    public l11 n0;
    public boolean n1;
    public boolean n2;
    public final RectF o0;
    public boolean o1;
    public Runnable o2;
    public final ArrayList p0;
    public int p1;
    public PorterDuffColorFilter p2;
    public final Stack q0;
    public final org.telegram.ui.Components.t5 q1;
    public int q2;
    public t80 r;
    public org.telegram.ui.Components.k5 r0;
    public li.k r1;
    public final r0 r2;
    public final boolean s;
    public TextPaint s0;
    public kg.o s1;
    public float t0;
    public int t1;
    public float u0;
    public int u1;
    public int v0;
    public int v1;
    public View w;
    public boolean w0;
    public qz0 w1;
    public final int x;
    public ic x0;
    public StaticLayout x1;
    public URLSpan y;
    public float y0;
    public boolean y1;
    public float z0;
    public TextPaint z1;

    static {
        HashMap hashMap = new HashMap();
        s2 = hashMap;
        c3.i0.w(1, hashMap, "1⃣", 3, "2⃣");
        c3.i0.w(6, hashMap, "3⃣", 12, "4⃣");
        hashMap.put(24, "5⃣");
    }

    public s0(Context context) {
        this(context, null, false);
    }

    public static SpannableStringBuilder G(String str) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.i0.I2(str, false, org.telegram.messenger.i0.L(6.0f), -org.telegram.messenger.i0.L(1.3f), 0.8f, R.drawable.floating_check));
        spannableStringBuilder.insert(0, (CharSequence) "*");
        spannableStringBuilder.setSpan(new t2(org.telegram.messenger.i0.L(18.0f)), 0, 1, 33);
        if (Build.VERSION.SDK_INT >= 29) {
            android.support.v4.media.session.w.j();
            spannableStringBuilder.setSpan(android.support.v4.media.session.w.g(org.telegram.messenger.i0.L(12.0f)), 0, spannableStringBuilder.length(), 33);
        }
        spannableStringBuilder.setSpan(new AlignmentSpan.Standard(Layout.Alignment.ALIGN_NORMAL), 0, spannableStringBuilder.length(), 33);
        return spannableStringBuilder;
    }

    public static float Z(StaticLayout staticLayout) {
        float f7 = 0.0f;
        for (int i10 = 0; i10 < staticLayout.getLineCount(); i10++) {
            float ceil = (int) Math.ceil(staticLayout.getLineWidth(i10));
            if (ceil > f7) {
                f7 = ceil;
            }
        }
        return f7;
    }

    private float getWalletActionTop() {
        return org.telegram.messenger.i0.L(11.0f) + this.S + this.O;
    }

    private void setStarsPaused(boolean z10) {
        kg.f2 f2Var = this.V1;
        if (z10 == f2Var.g) {
            return;
        }
        f2Var.g = z10;
        if (z10) {
            f2Var.R = System.currentTimeMillis();
            return;
        }
        for (int i10 = 0; i10 < f2Var.n.size(); i10++) {
            kg.e2 e2Var = (kg.e2) f2Var.n.get(i10);
            e2Var.a = (System.currentTimeMillis() - f2Var.R) + e2Var.a;
        }
        invalidate();
    }

    public final boolean A(float f7, int i10) {
        sg.p0 p0Var = this.E0;
        if (!p0Var.H) {
            return false;
        }
        float y3 = getY() + p0Var.c;
        return y3 > f7 && (y3 + ((float) p0Var.m)) - ((float) org.telegram.messenger.i0.L(16.0f)) < ((float) i10);
    }

    public final void B() {
        SpannableStringBuilder spannableStringBuilder;
        int L = this.i1 - org.telegram.messenger.i0.L(16.0f);
        float L2 = org.telegram.messenger.i0.L(14.0f);
        TextPaint textPaint = this.E1;
        textPaint.setTextSize(L2);
        float L3 = org.telegram.messenger.i0.L(13.0f);
        TextPaint textPaint2 = this.F1;
        textPaint2.setTextSize(L3);
        TLRPC.TL_messageActionGiftCode tL_messageActionGiftCode = (TLRPC.TL_messageActionGiftCode) this.P0.k.action;
        int i10 = tL_messageActionGiftCode.months;
        TLRPC.Chat L0 = vp.r1(this.H).L0(Long.valueOf(-org.telegram.messenger.o5.o(tL_messageActionGiftCode.boost_peer)));
        String str = L0 == null ? null : L0.title;
        boolean z10 = tL_messageActionGiftCode.via_giveaway;
        String L02 = tL_messageActionGiftCode.unclaimed ? cd.L0(2131753176, "BoostingUnclaimedPrize") : cd.L0(2131753542, "BoostingCongratulations");
        String G = i10 == 12 ? cd.G(1, "BoldYears", new Object[0]) : cd.G(i10, "BoldMonths", new Object[0]);
        if (!z10) {
            spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.i0.W2(str == null ? cd.L0(2131753310, null) : cd.a0("BoostingReceivedGiftFrom", null, 2131753311, str)));
            spannableStringBuilder.append((CharSequence) "\n\n");
            org.telegram.messenger.m5.p(null, null, 2131753312, new Object[]{G}, spannableStringBuilder);
        } else if (tL_messageActionGiftCode.unclaimed) {
            spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.i0.W2(cd.a0(null, null, 2131753166, str)));
            spannableStringBuilder.append((CharSequence) "\n\n");
            org.telegram.messenger.m5.p(null, null, 2131753175, new Object[]{G}, spannableStringBuilder);
        } else {
            spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.i0.W2(cd.a0(null, null, 2131753307, str)));
            spannableStringBuilder.append((CharSequence) "\n\n");
            org.telegram.messenger.m5.p(null, null, 2131753308, new Object[]{G}, spannableStringBuilder);
        }
        String L03 = cd.L0(2131753309, "BoostingReceivedGiftOpenBtn");
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(L02);
        valueOf.setSpan(new x41(org.telegram.messenger.i0.o()), 0, valueOf.length(), 33);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        this.j1 = new StaticLayout(valueOf, textPaint, L, alignment, 1.1f, 0.0f, false);
        this.m1 = null;
        this.l1 = null;
        kg.o oVar = this.s1;
        if (oVar != null) {
            org.telegram.ui.Components.o5.release((s0) oVar.i, (org.telegram.ui.Components.k5) oVar.h);
        }
        kg.o oVar2 = new kg.o(this);
        this.s1 = oVar2;
        oVar2.a(spannableStringBuilder, textPaint2, L);
        SpannableStringBuilder valueOf2 = SpannableStringBuilder.valueOf(L03);
        valueOf2.setSpan(new x41(org.telegram.messenger.i0.o()), 0, valueOf2.length(), 33);
        this.o1 = false;
        this.p1 = 0;
        this.w1 = null;
        StaticLayout staticLayout = new StaticLayout(valueOf2, (TextPaint) P("paintChatActionText"), L, alignment, 1.0f, 0.0f, false);
        this.x1 = staticLayout;
        this.y1 = true;
        this.D1 = Z(staticLayout);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v7 */
    public final void D(CharSequence charSequence, SpannableStringBuilder spannableStringBuilder, CharSequence charSequence2, boolean z10, CharSequence charSequence3, int i10, String str, int i11, boolean z11) {
        ?? r42;
        int i12;
        int a2;
        CharSequence charSequence4 = charSequence2;
        int L = i11 - org.telegram.messenger.i0.L(16.0f);
        jj jjVar = this.P0;
        if (jjVar != null && jjVar.D == 30) {
            L -= org.telegram.messenger.i0.L(16.0f);
        }
        int i13 = L;
        if (charSequence != null) {
            jj jjVar2 = this.P0;
            TextPaint textPaint = this.E1;
            if (jjVar2 == null || jjVar2.D != 30) {
                textPaint.setTextSize(org.telegram.messenger.i0.L(16.0f));
            } else {
                textPaint.setTextSize(org.telegram.messenger.i0.L(14.0f));
            }
            SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(charSequence);
            valueOf.setSpan(new x41(org.telegram.messenger.i0.o()), 0, valueOf.length(), 33);
            r42 = 0;
            this.j1 = new StaticLayout(valueOf, textPaint, i13, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
        } else {
            r42 = 0;
            this.j1 = null;
        }
        this.m1 = null;
        if (spannableStringBuilder != null) {
            qz0 qz0Var = new qz0(spannableStringBuilder, 10.0f, null);
            this.l1 = qz0Var;
            qz0Var.a.linkColor = -1;
        } else {
            this.l1 = null;
        }
        jj jjVar3 = this.P0;
        TextPaint textPaint2 = this.F1;
        if (jjVar3 != null && jjVar3.D == 35) {
            textPaint2.setTextSize(org.telegram.messenger.i0.L(14.3f));
        } else if (jjVar3 == null || !(X() || (i12 = this.P0.D) == 30 || i12 == 18 || i12 == 31 || i12 == 37 || i12 == 33)) {
            textPaint2.setTextSize(org.telegram.messenger.i0.L(15.0f));
        } else {
            textPaint2.setTextSize(org.telegram.messenger.i0.L(13.0f));
        }
        int L2 = i13 - org.telegram.messenger.i0.L(12.0f);
        jj jjVar4 = this.P0;
        if (jjVar4 != null && jjVar4.D == 22 && jj.B0(jjVar4.k) >= 0 && (a2 = vh.p2.a(charSequence4, textPaint2)) < L2 && a2 > L2 / 5.0f) {
            L2 = a2;
        }
        if (charSequence4 == 0) {
            kg.o oVar = this.s1;
            if (oVar != null) {
                org.telegram.ui.Components.o5.release((s0) oVar.i, (org.telegram.ui.Components.k5) oVar.h);
                this.s1 = null;
            }
            this.o1 = r42;
        } else {
            if (this.s1 == null) {
                this.s1 = new kg.o(this);
            }
            try {
                charSequence4 = org.telegram.messenger.k6.m(charSequence4, textPaint2.getFontMetricsInt(), r42, null, r42);
            } catch (Exception unused) {
            }
            this.s1.a(charSequence4, textPaint2, L2);
            if (!z10 || ((StaticLayout) this.s1.f).getLineCount() <= 3) {
                this.o1 = r42;
                this.q1.f(true, true);
                this.p1 = r42;
            } else {
                this.o1 = !this.n1;
                this.p1 = ((StaticLayout) this.s1.f).getLineBottom(2);
                this.w1 = new qz0(cd.L0(2131750274, null), textPaint2.getTextSize() / org.telegram.messenger.i0.p, org.telegram.messenger.i0.o());
                int lineBottom = ((StaticLayout) this.s1.f).getLineBottom(2);
                this.u1 = lineBottom;
                this.v1 = lineBottom - ((StaticLayout) this.s1.f).getLineTop(2);
                this.t1 = (int) ((StaticLayout) this.s1.f).getLineRight(2);
            }
            if (this.o1) {
                int lineEnd = ((StaticLayout) this.s1.f).getLineEnd(2) - 1;
                kg.o oVar2 = this.s1;
                CharSequence charSequence5 = charSequence4;
                if (lineEnd >= 0) {
                    charSequence5 = charSequence4.subSequence(r42, lineEnd);
                }
                oVar2.a(charSequence5, textPaint2, L2);
            }
        }
        if (charSequence3 != null) {
            SpannableStringBuilder valueOf2 = SpannableStringBuilder.valueOf(charSequence3);
            valueOf2.setSpan(new x41(org.telegram.messenger.i0.o()), r42, valueOf2.length(), 33);
            StaticLayout staticLayout = new StaticLayout(valueOf2, (TextPaint) P("paintChatActionText"), i13, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
            this.x1 = staticLayout;
            this.y1 = (!z11 || this.o1) ? r42 : true;
            this.D1 = Z(staticLayout);
        } else {
            this.x1 = null;
            this.y1 = r42;
            this.D1 = 0.0f;
        }
        if (str == null) {
            this.R1 = null;
            this.S1 = null;
            return;
        }
        if (this.Q1 == null) {
            this.Q1 = new CornerPathEffect(org.telegram.messenger.i0.L(5.0f));
        }
        if (this.R1 == null) {
            Path path = new Path();
            this.R1 = path;
            ph.f1.d(path, 1.35f, r42);
        }
        qz0 qz0Var2 = new qz0(str, i10, org.telegram.messenger.i0.o());
        this.S1 = qz0Var2;
        qz0Var2.p = org.telegram.messenger.i0.L(62.0f);
    }

    public final void F(int i10, CharSequence charSequence) {
        CharSequence charSequence2;
        q0 q0Var;
        TLRPC.Message message;
        jj jjVar;
        int i11;
        int L = i10 - org.telegram.messenger.i0.L(30.0f);
        if (this.i0) {
            L -= org.telegram.messenger.i0.L(64.0f);
        }
        if (W()) {
            L = Math.min(L - org.telegram.messenger.i0.L(this.i0 ? 28.0f : 82.0f), org.telegram.messenger.i0.L(272.0f));
        }
        if (L < 0) {
            return;
        }
        int i12 = this.f2;
        if (i12 > 0) {
            L = Math.min(i12, L);
        }
        int i13 = L;
        this.d1 = true;
        TextPaint textPaint = (W() || ((jjVar = this.P0) != null && ((i11 = jjVar.D) == 34 || i11 == 35))) ? (TextPaint) P("paintChatActionText3") : (jjVar == null || !jjVar.q2) ? (TextPaint) P("paintChatActionText") : (TextPaint) P("paintChatActionText2");
        textPaint.linkColor = textPaint.getColor();
        if (W()) {
            if (charSequence instanceof Spannable) {
                Spannable spannable = (Spannable) charSequence;
                for (org.telegram.messenger.h6 h6Var : (org.telegram.messenger.h6[]) spannable.getSpans(0, spannable.length(), org.telegram.messenger.h6.class)) {
                    spannable.removeSpan(h6Var);
                }
            }
            charSequence2 = org.telegram.messenger.k6.n(charSequence, textPaint.getFontMetricsInt(), false, null, 0, 0.85f, 0);
        } else {
            charSequence2 = charSequence;
        }
        TextPaint textPaint2 = textPaint;
        CharSequence charSequence3 = charSequence2;
        this.M = new StaticLayout(charSequence2, textPaint2, i13, W() ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
        this.P = null;
        jj jjVar2 = this.P0;
        if (jjVar2 != null && (message = jjVar2.k) != null) {
            TLRPC.MessageAction messageAction = message.action;
            if (messageAction instanceof TLRPC.TL_messageActionSuggestedPostApproval) {
                TLRPC.TL_messageActionSuggestedPostApproval tL_messageActionSuggestedPostApproval = (TLRPC.TL_messageActionSuggestedPostApproval) messageAction;
                if (!tL_messageActionSuggestedPostApproval.rejected && !tL_messageActionSuggestedPostApproval.balance_too_low) {
                    this.P = new StaticLayout(org.telegram.messenger.k6.n(org.telegram.messenger.i0.W2(cd.L0(2131744392, null)), textPaint2.getFontMetricsInt(), false, null, 0, 1.0f, 0), textPaint2, i13, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                }
            }
        }
        this.r0 = org.telegram.ui.Components.o5.update(0, this, (!this.s || (q0Var = this.f1) == null || q0Var.f()) ? false : true, this.r0, this.M);
        this.O = 0;
        this.N = 0;
        this.Q = 0;
        StaticLayout staticLayout = this.P;
        if (staticLayout != null) {
            int height = staticLayout.getHeight();
            this.Q = height;
            this.Q = org.telegram.messenger.i0.L(12.0f) + height;
        }
        jj jjVar3 = this.P0;
        if (jjVar3 == null || !jjVar3.h2) {
            try {
                int lineCount = this.M.getLineCount();
                for (int i14 = 0; i14 < lineCount; i14++) {
                    try {
                        float lineWidth = this.M.getLineWidth(i14);
                        float f7 = i13;
                        if (lineWidth > f7) {
                            lineWidth = f7;
                        }
                        this.O = (int) Math.max(this.O, Math.ceil(this.M.getLineBottom(i14)));
                        this.N = (int) Math.max(this.N, Math.ceil(lineWidth));
                    } catch (Exception e) {
                        org.telegram.messenger.f8.g(e, true);
                        return;
                    }
                }
            } catch (Exception e7) {
                org.telegram.messenger.f8.g(e7, true);
            }
        }
        this.R = (i10 - this.N) / 2;
        int L2 = org.telegram.messenger.i0.L(7.0f);
        this.S = L2;
        if (this.P != null) {
            this.S = org.telegram.messenger.m5.C(11.0f, this.Q, L2);
        }
        this.T = (i10 - (W() ? this.N : this.M.getWidth())) / 2;
        this.U = (i10 - i13) / 2;
        Stack stack = this.q0;
        ArrayList arrayList = this.p0;
        stack.addAll(arrayList);
        arrayList.clear();
        if (charSequence3 instanceof Spannable) {
            StaticLayout staticLayout2 = this.M;
            int i15 = this.R;
            nh.i.a(this, staticLayout2, i15, i15 + this.N, (Spannable) charSequence3, stack, arrayList, null);
        }
    }

    public final void H(Canvas canvas, boolean z10) {
        Paint paint;
        Paint paint2;
        org.telegram.ui.ActionBar.p6 p6Var;
        float f7;
        float f10;
        float f11;
        float f12;
        s0 s0Var;
        org.telegram.ui.ActionBar.p6 p6Var2;
        Paint paint3;
        Paint paint4;
        int i10;
        int i11;
        Canvas canvas2;
        float f13;
        float f14;
        float f15;
        int i12;
        kg.o oVar;
        int L;
        RectF rectF;
        ArrayList arrayList;
        int i13;
        float f16;
        int i14;
        Paint paint5;
        int i15;
        float f17;
        ArrayList arrayList2;
        org.telegram.ui.ActionBar.p6 p6Var3;
        int i16;
        s0 s0Var2 = this;
        if (!s0Var2.s || ((!s0Var2.R() || z10) && (s0Var2.R() || !z10))) {
            Paint P = s0Var2.P("paintChatActionBackground");
            Paint P2 = s0Var2.P("paintChatActionBackgroundDarken");
            s0Var2.s0 = (TextPaint) s0Var2.P("paintChatActionText");
            int i17 = s0Var2.T0;
            org.telegram.ui.ActionBar.p6 p6Var4 = s0Var2.g1;
            if (i17 >= 0) {
                int w02 = org.telegram.ui.ActionBar.t6.w0(i17, p6Var4);
                if (s0Var2.V0 == null) {
                    Paint paint6 = new Paint(1);
                    s0Var2.V0 = paint6;
                    paint6.setColor(w02);
                    TextPaint textPaint = new TextPaint(1);
                    s0Var2.W0 = textPaint;
                    textPaint.setTypeface(org.telegram.messenger.i0.o());
                    s0Var2.W0.setTextSize(org.telegram.messenger.i0.L(Math.max(16, tz.W0) - 2));
                    s0Var2.W0.setColor(org.telegram.ui.ActionBar.t6.w0(s0Var2.U0, p6Var4));
                }
                P = s0Var2.V0;
                s0Var2.s0 = s0Var2.W0;
            }
            boolean z11 = s0Var2.d1;
            Path path = s0Var2.Z0;
            if (z11) {
                s0Var2.d1 = false;
                s0Var2.a1 = s0Var2.getWidth();
                s0Var2.b1 = 0;
                ArrayList arrayList3 = s0Var2.X0;
                arrayList3.clear();
                StaticLayout staticLayout = s0Var2.M;
                int lineCount = staticLayout == null ? 0 : staticLayout.getLineCount();
                int L2 = org.telegram.messenger.i0.L(11.0f);
                f10 = 6.0f;
                int L3 = org.telegram.messenger.i0.L(8.0f);
                f7 = 8.0f;
                int i18 = 0;
                int i19 = 0;
                while (i18 < lineCount) {
                    int ceil = (int) Math.ceil(s0Var2.M.getLineWidth(i18));
                    if (i18 != 0 && (i16 = i19 - ceil) > 0 && i16 <= (L2 * 1.5f) + L3) {
                        ceil = i19;
                    }
                    i18 = c3.i0.j(ceil, i18, 1, arrayList3);
                    i19 = ceil;
                }
                f11 = 4.0f;
                f12 = 2.0f;
                for (int i20 = lineCount - 2; i20 >= 0; i20--) {
                    int intValue = ((Integer) arrayList3.get(i20)).intValue();
                    int i21 = i19 - intValue;
                    if (i21 <= 0 || i21 > (L2 * 1.5f) + L3) {
                        i19 = intValue;
                    }
                    arrayList3.set(i20, Integer.valueOf(i19));
                }
                int L4 = org.telegram.messenger.i0.L(4.0f);
                int measuredWidth = s0Var2.getMeasuredWidth() / 2;
                int L5 = org.telegram.messenger.i0.L(3.0f);
                int L6 = org.telegram.messenger.i0.L(6.0f);
                int i22 = L2 - L5;
                ArrayList arrayList4 = s0Var2.Y0;
                arrayList4.clear();
                path.reset();
                float f18 = measuredWidth;
                path.moveTo(f18, L4);
                int i23 = i19;
                int i24 = 0;
                int i25 = 0;
                while (true) {
                    rectF = s0Var2.c1;
                    if (i25 >= lineCount) {
                        break;
                    }
                    int i26 = lineCount;
                    int intValue2 = ((Integer) arrayList3.get(i25)).intValue();
                    int lineBottom = s0Var2.M.getLineBottom(i25);
                    int i27 = i26 - 1;
                    if (i25 < i27) {
                        paint5 = P2;
                        i15 = ((Integer) arrayList3.get(i25 + 1)).intValue();
                    } else {
                        paint5 = P2;
                        i15 = 0;
                    }
                    int i28 = lineBottom - i24;
                    if (i25 == 0 || intValue2 > i23) {
                        i28 = org.telegram.messenger.i0.L(3.0f) + i28;
                    }
                    if (i25 == i27 || intValue2 > i15) {
                        i28 = org.telegram.messenger.i0.L(3.0f) + i28;
                    }
                    Paint paint7 = P;
                    float f19 = (intValue2 / 2.0f) + f18;
                    int i29 = (i25 == i27 || intValue2 >= i15 || i25 == 0 || intValue2 >= i23) ? L3 : L6;
                    if (i25 == 0 || intValue2 > i23) {
                        f17 = f19;
                        arrayList2 = arrayList3;
                        p6Var3 = p6Var4;
                        rectF.set((f17 - L5) - L2, L4, f17 + i22, (L2 * 2) + L4);
                        z();
                        path.arcTo(rectF, -90.0f, 90.0f);
                    } else {
                        f17 = f19;
                        if (intValue2 < i23) {
                            float f20 = f17 + i22;
                            p6Var3 = p6Var4;
                            arrayList2 = arrayList3;
                            rectF.set(f20, L4, (i29 * 2) + f20, r0 + L4);
                            z();
                            path.arcTo(rectF, -90.0f, -90.0f);
                        } else {
                            arrayList2 = arrayList3;
                            p6Var3 = p6Var4;
                        }
                    }
                    L4 += i28;
                    if (i25 != i27 && intValue2 < i15) {
                        L4 -= org.telegram.messenger.i0.L(3.0f);
                        i28 -= org.telegram.messenger.i0.L(3.0f);
                    }
                    if (i25 != 0 && intValue2 < i23) {
                        L4 -= org.telegram.messenger.i0.L(3.0f);
                        i28 -= org.telegram.messenger.i0.L(3.0f);
                    }
                    arrayList4.add(Integer.valueOf(i28));
                    if (i25 == i27 || intValue2 > i15) {
                        rectF.set((f17 - L5) - L2, L4 - (L2 * 2), f17 + i22, L4);
                        z();
                        path.arcTo(rectF, 0.0f, 90.0f);
                    } else if (intValue2 < i15) {
                        float f21 = f17 + i22;
                        rectF.set(f21, L4 - r0, (i29 * 2) + f21, L4);
                        z();
                        path.arcTo(rectF, 180.0f, -90.0f);
                    }
                    i25++;
                    s0Var2 = this;
                    i23 = intValue2;
                    i24 = lineBottom;
                    lineCount = i26;
                    P2 = paint5;
                    P = paint7;
                    p6Var4 = p6Var3;
                    arrayList3 = arrayList2;
                }
                paint = P;
                paint2 = P2;
                ArrayList arrayList5 = arrayList3;
                p6Var = p6Var4;
                int i30 = lineCount - 1;
                int i31 = i30;
                while (i31 >= 0) {
                    if (i31 != 0) {
                        arrayList = arrayList5;
                        i13 = ((Integer) arrayList.get(i31 - 1)).intValue();
                    } else {
                        arrayList = arrayList5;
                        i13 = 0;
                    }
                    int intValue3 = ((Integer) arrayList.get(i31)).intValue();
                    int intValue4 = i31 != i30 ? ((Integer) arrayList.get(i31 + 1)).intValue() : 0;
                    this.M.getLineBottom(i31);
                    float f22 = measuredWidth - (intValue3 / 2);
                    int i32 = (i31 == i30 || intValue3 >= intValue4 || i31 == 0 || intValue3 >= i13) ? L3 : L6;
                    if (i31 == i30 || intValue3 > intValue4) {
                        arrayList5 = arrayList;
                        f16 = f22;
                        i14 = i32;
                        rectF.set(f16 - i22, L4 - (L2 * 2), f16 + L5 + L2, L4);
                        z();
                        path.arcTo(rectF, 90.0f, 90.0f);
                    } else if (intValue3 < intValue4) {
                        float f23 = f22 - i22;
                        arrayList5 = arrayList;
                        f16 = f22;
                        i14 = i32;
                        rectF.set(f23 - (i32 * 2), L4 - r2, f23, L4);
                        z();
                        path.arcTo(rectF, 90.0f, -90.0f);
                    } else {
                        arrayList5 = arrayList;
                        f16 = f22;
                        i14 = i32;
                    }
                    L4 -= ((Integer) arrayList4.get(i31)).intValue();
                    if (i31 == 0 || intValue3 > i13) {
                        rectF.set(f16 - i22, L4, f16 + L5 + L2, (L2 * 2) + L4);
                        z();
                        path.arcTo(rectF, 180.0f, 90.0f);
                    } else if (intValue3 < i13) {
                        float f24 = f16 - i22;
                        rectF.set(f24 - (i14 * 2), L4, f24, r9 + L4);
                        z();
                        path.arcTo(rectF, 0.0f, -90.0f);
                    }
                    i31--;
                }
                s0Var = this;
                path.close();
                if (s0Var.W() && !s0Var.X()) {
                    rectF.left = (f18 - (s0Var.N / 2.0f)) - org.telegram.messenger.i0.L(17.0f);
                    rectF.top = L4;
                    rectF.right = (s0Var.N / 2.0f) + f18 + org.telegram.messenger.i0.L(17.0f);
                    rectF.bottom = org.telegram.messenger.i0.L(28.0f) + L4 + s0Var.O + s0Var.Q;
                    path.reset();
                    path.addRoundRect(rectF, org.telegram.messenger.i0.L(15.0f), org.telegram.messenger.i0.L(15.0f), Path.Direction.CW);
                    path.close();
                }
            } else {
                paint = P;
                paint2 = P2;
                p6Var = p6Var4;
                f7 = 8.0f;
                f10 = 6.0f;
                f11 = 4.0f;
                f12 = 2.0f;
                s0Var = s0Var2;
            }
            if (!s0Var.w0) {
                s0Var.v0 = ((ViewGroup) s0Var.getParent()).getMeasuredHeight();
            }
            if (p6Var != null) {
                p6Var2 = p6Var;
                p6Var2.b(s0Var.u0, s0Var.t0 + org.telegram.messenger.i0.L(f11), s0Var.getMeasuredWidth(), s0Var.v0);
            } else {
                p6Var2 = p6Var;
                org.telegram.ui.ActionBar.t6.r(s0Var.u0, s0Var.t0 + org.telegram.messenger.i0.L(f11), s0Var.getMeasuredWidth(), s0Var.v0);
            }
            boolean z12 = s0Var instanceof dk;
            float f25 = (!z12 || org.telegram.ui.ActionBar.t6.i1(p6Var2)) ? 1.0f : 0.75f;
            if (!z10 || (s0Var.getAlpha() == 1.0f && !z12)) {
                paint3 = paint2;
                paint4 = paint;
                if (z12) {
                    i10 = paint4.getAlpha();
                    i11 = paint3.getAlpha();
                    paint4.setAlpha((int) (i10 * f25));
                    paint3.setAlpha((int) (i11 * f25));
                } else {
                    i10 = -1;
                    i11 = -1;
                }
            } else {
                i10 = paint.getAlpha();
                i11 = paint2.getAlpha();
                paint4 = paint;
                paint4.setAlpha((int) (s0Var.getAlpha() * i10 * f25));
                paint3 = paint2;
                paint3.setAlpha((int) (s0Var.getAlpha() * i11 * f25));
            }
            jj jjVar = s0Var.P0;
            Paint paint8 = s0Var.c2;
            if (jjVar == null || !jjVar.h2) {
                canvas2 = canvas;
                canvas2.drawPath(path, paint4);
                if (s0Var.R() && paint3.getAlpha() > 0) {
                    canvas2.drawPath(path, paint3);
                }
                if (s0Var.b2 > 0.0f) {
                    int alpha = paint8.getAlpha();
                    if (z10) {
                        paint8.setAlpha((int) (s0Var.getAlpha() * alpha));
                    }
                    canvas2.drawPath(path, paint8);
                    paint8.setAlpha(alpha);
                }
            } else {
                canvas2 = canvas;
            }
            if (s0Var.T()) {
                int width = s0Var.getWidth();
                s0Var.I0.getClass();
                float L7 = (width - org.telegram.messenger.i0.L(206.0f)) / f12;
                float walletActionTop = s0Var.getWalletActionTop();
                s0Var.I0.getClass();
                float L8 = org.telegram.messenger.i0.L(206.0f) + L7;
                if (s0Var.I0.q0 == null) {
                    L = org.telegram.messenger.i0.L(140.0f);
                    f13 = 140.0f;
                    f14 = 20.0f;
                } else {
                    f13 = 140.0f;
                    f14 = 20.0f;
                    L = org.telegram.messenger.i0.L(150.0f) + ((int) Math.ceil(r13.q0.i()));
                }
                RectF rectF2 = s0Var.N0;
                rectF2.set(L7, walletActionTop, L8, L + walletActionTop);
                canvas2.save();
                s0Var.I0.c(canvas2, L7, walletActionTop);
                canvas2.drawRoundRect(rectF2, org.telegram.messenger.i0.L(f14), org.telegram.messenger.i0.L(f14), paint4);
                if (s0Var.R() && paint3.getAlpha() > 0) {
                    canvas2.drawRoundRect(rectF2, org.telegram.messenger.i0.L(f14), org.telegram.messenger.i0.L(f14), paint3);
                }
                f15 = 0.0f;
                if (s0Var.b2 > 0.0f) {
                    int alpha2 = paint8.getAlpha();
                    if (z10) {
                        paint8.setAlpha((int) (s0Var.getAlpha() * alpha2));
                    }
                    canvas2.drawRoundRect(rectF2, org.telegram.messenger.i0.L(f14), org.telegram.messenger.i0.L(f14), paint8);
                    paint8.setAlpha(alpha2);
                }
                canvas2.restore();
            } else {
                f13 = 140.0f;
                f14 = 20.0f;
                f15 = 0.0f;
            }
            jj jjVar2 = s0Var.P0;
            if (s0Var.S()) {
                float L9 = s0Var.H0.T.f + org.telegram.messenger.i0.L(f7);
                float width2 = (s0Var.getWidth() - L9) / f12;
                float L10 = s0Var.H0.p ? f15 : org.telegram.messenger.i0.L(12.0f) + s0Var.S + s0Var.O;
                RectF rectF3 = org.telegram.messenger.i0.P;
                rectF3.set(width2, L10, L9 + width2, s0Var.H0.P + L10 + org.telegram.messenger.i0.L(f7));
                if (s0Var.M1 == null) {
                    s0Var.M1 = new RectF();
                }
                s0Var.M1.set(rectF3);
                canvas2.drawRoundRect(s0Var.M1, org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(16.0f), paint4);
                if (s0Var.R()) {
                    canvas2.drawRoundRect(s0Var.M1, org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(16.0f), paint3);
                }
            } else if (s0Var.O0 != null) {
                float L11 = org.telegram.messenger.i0.L(174.0f);
                nx0 nx0Var = s0Var.O0;
                nx0Var.getClass();
                float L12 = org.telegram.messenger.i0.L(f13) + ((int) nx0Var.f.i()) + (nx0Var.i ? org.telegram.messenger.i0.L(40.0f) : 0);
                float width3 = (s0Var.getWidth() - L11) / f12;
                if (s0Var.M1 == null) {
                    s0Var.M1 = new RectF();
                }
                s0Var.M1.set(width3, org.telegram.messenger.i0.L(f11), L11 + width3, org.telegram.messenger.i0.L(f11) + L12);
                canvas2.drawRoundRect(s0Var.M1, org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(16.0f), paint4);
                if (s0Var.R()) {
                    canvas2.drawRoundRect(s0Var.M1, org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(16.0f), paint3);
                }
            } else if (s0Var.V(jjVar2)) {
                float width4 = (s0Var.getWidth() - s0Var.i1) / f12;
                float f26 = s0Var.S + s0Var.O;
                if (s0Var.X()) {
                    float L13 = f26 + org.telegram.messenger.i0.L(f11);
                    org.telegram.messenger.i0.P.set(width4, L13, s0Var.i1 + width4, s0Var.f + L13);
                } else {
                    float L14 = f26 + org.telegram.messenger.i0.L(12.0f);
                    RectF rectF4 = org.telegram.messenger.i0.P;
                    float f27 = s0Var.i1;
                    rectF4.set(width4, L14, width4 + f27, f27 + L14 + s0Var.K1);
                }
                if (jjVar2 != null && jjVar2.D == 18 && !s0Var.o1 && (oVar = s0Var.s1) != null && s0Var.p1 > 0) {
                    RectF rectF5 = org.telegram.messenger.i0.P;
                    rectF5.bottom = sc.e.z(1.0f, s0Var.q1.c, ((StaticLayout) oVar.f).getHeight() - s0Var.p1, rectF5.bottom);
                }
                if (s0Var.M1 == null) {
                    s0Var.M1 = new RectF();
                }
                s0Var.M1.set(org.telegram.messenger.i0.P);
                if (jjVar2 == null || (!((i12 = jjVar2.D) == 33 || i12 == 35) || s0Var.Y1 == null)) {
                    canvas2.drawRoundRect(s0Var.M1, org.telegram.messenger.i0.L(f14), org.telegram.messenger.i0.L(f14), paint4);
                    if (s0Var.R()) {
                        canvas2.drawRoundRect(s0Var.M1, org.telegram.messenger.i0.L(f14), org.telegram.messenger.i0.L(f14), paint3);
                    }
                } else {
                    float L15 = org.telegram.messenger.i0.L(16.0f);
                    float[] fArr = s0Var.h2;
                    Arrays.fill(fArr, L15);
                    float L16 = org.telegram.messenger.i0.L(f10);
                    fArr[7] = L16;
                    fArr[6] = L16;
                    fArr[5] = L16;
                    fArr[4] = L16;
                    Path path2 = s0Var.g2;
                    path2.rewind();
                    path2.addRoundRect(s0Var.M1, fArr, Path.Direction.CW);
                    canvas2.drawPath(path2, paint4);
                    if (s0Var.R()) {
                        canvas2.drawPath(path2, paint3);
                    }
                }
            }
            if (i10 >= 0) {
                paint4.setAlpha(i10);
                paint3.setAlpha(i11);
            }
        }
    }

    public final void I(Canvas canvas) {
        float f7;
        float f10;
        Canvas canvas2 = canvas;
        canvas2.save();
        float f11 = 2.0f;
        canvas2.translate(this.j0 / 2.0f, getPaddingTop());
        canvas2.save();
        canvas2.translate(this.T, this.S);
        StaticLayout staticLayout = this.M;
        org.telegram.ui.Components.o5.drawAnimatedEmojis(canvas2, staticLayout, this.r0, 0.0f, this.p0, 0.0f, 0.0f, 0.0f, 1.0f, staticLayout != null ? N(staticLayout.getPaint().getColor()) : null);
        canvas2.restore();
        float f12 = 4.0f;
        if (S()) {
            canvas2.save();
            float width = getWidth();
            rh.g4 g4Var = this.H0;
            canvas2.translate((width - g4Var.T.f) / 2.0f, g4Var.p ? org.telegram.messenger.i0.L(4.0f) : org.telegram.messenger.i0.L(16.0f) + this.S + this.O);
            this.H0.c(canvas2);
            canvas2.restore();
        }
        canvas2.restore();
        l11 l11Var = this.n0;
        org.telegram.ui.ActionBar.p6 p6Var = this.g1;
        if (l11Var != null) {
            float alpha = getAlpha();
            if (p6Var != null) {
                p6Var.b(this.u0, this.t0 + 0.0f, getMeasuredWidth(), this.v0);
            } else {
                org.telegram.ui.ActionBar.t6.r(this.u0, this.t0 + 0.0f, getMeasuredWidth(), this.v0);
            }
            this.n0.c(canvas, getWidth(), this.j0, 0.0f, 1.0f, alpha, this.m0);
            canvas2 = canvas;
        }
        ArrayList arrayList = this.X1;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        if (p6Var != null) {
            p6Var.b(this.u0, this.t0 + org.telegram.messenger.i0.L(4.0f), getMeasuredWidth(), this.v0);
        } else {
            org.telegram.ui.ActionBar.t6.r(this.u0, this.t0 + org.telegram.messenger.i0.L(4.0f), getMeasuredWidth(), this.v0);
        }
        float width2 = (getWidth() - this.i1) / 2.0f;
        float L = org.telegram.messenger.i0.L(4.0f) + org.telegram.messenger.i0.L(4.0f) + this.S + this.O + this.f;
        float L2 = (this.i1 - org.telegram.messenger.i0.L(4.0f)) / 2.0f;
        int i10 = 0;
        while (i10 < arrayList.size()) {
            c0 c0Var = (c0) arrayList.get(i10);
            float a2 = c0Var.a();
            float L3 = ((org.telegram.messenger.i0.L(f12) + L2) * i10) + width2;
            float f13 = L3 + L2;
            RectF rectF = this.c1;
            rectF.set(L3, L, f13, c0Var.f + L);
            canvas2.save();
            if (a2 != 1.0f) {
                f7 = f12;
                canvas2.scale(a2, a2, rectF.centerX(), rectF.centerY());
            } else {
                f7 = f12;
            }
            float L4 = org.telegram.messenger.i0.L(Math.min(6.75f, tz.Y0));
            float[] fArr = this.i2;
            Arrays.fill(fArr, L4);
            if ((c0Var.g & 9) == 9) {
                float L5 = org.telegram.messenger.i0.L(tz.Y0);
                fArr[7] = L5;
                fArr[6] = L5;
            }
            if ((c0Var.g & 10) == 10) {
                float L6 = org.telegram.messenger.i0.L(tz.Y0);
                fArr[5] = L6;
                fArr[4] = L6;
            }
            Path path = this.j2;
            path.rewind();
            path.addRoundRect(rectF, fArr, Path.Direction.CW);
            canvas2.drawPath(path, P("paintChatActionBackground"));
            if (R()) {
                canvas2.drawPath(path, org.telegram.ui.ActionBar.t6.h2);
            }
            canvas2.save();
            canvas2.clipPath(path);
            y yVar = c0Var.s;
            if (yVar != null) {
                int i11 = (int) L;
                yVar.setBounds((int) L3, i11, (int) f13, c0Var.f + i11);
                c0Var.s.setAlpha(zs.e4);
                c0Var.s.draw(canvas2);
            }
            canvas2.restore();
            canvas2.save();
            float L7 = c0Var.t != null ? org.telegram.messenger.i0.L(26.0f) : 0;
            float B = c3.i0.B(L2 - (c0Var.h.k() + (c0Var.t != null ? org.telegram.messenger.i0.L(f7) : 0)), L7, f11, L3);
            Drawable drawable = c0Var.t;
            if (drawable != null) {
                int i12 = (int) B;
                f10 = f11;
                drawable.setBounds(i12, (int) (((c0Var.f - org.telegram.messenger.i0.L(24.0f)) / f11) + L), org.telegram.messenger.i0.L(24.0f) + i12, org.telegram.messenger.i0.L(24.0f) + ((int) (((c0Var.f - org.telegram.messenger.i0.L(24.0f)) / f10) + L)));
                c0Var.t.setAlpha(c0Var.m ? 128 : zs.e4);
                c0Var.t.draw(canvas2);
                B += L7;
            } else {
                f10 = f11;
            }
            c0Var.h.p = Math.max(1, (((int) L2) - org.telegram.messenger.i0.L(15.0f)) - r6);
            c0Var.h.f(canvas2, B, (org.telegram.messenger.i0.L(40.0f) / f10) + L, c0Var.m ? 0.5f : 1.0f);
            canvas2.restore();
            canvas2.restore();
            i10++;
            f12 = f7;
            f11 = f10;
        }
    }

    public final void J(Canvas canvas, boolean z10) {
        if (this.s) {
            if (R() && !z10) {
                return;
            }
            if (!R() && z10) {
                return;
            }
        }
        K(canvas, z10, null);
    }

    public final void K(Canvas canvas, boolean z10, Integer num) {
        Canvas canvas2;
        float alpha = z10 ? getAlpha() : 1.0f;
        if (alpha <= 0.0f) {
            return;
        }
        org.telegram.ui.ActionBar.p6 p6Var = this.g1;
        if (p6Var != null) {
            p6Var.b(this.u0, this.t0 + org.telegram.messenger.i0.L(4.0f), getMeasuredWidth(), this.v0);
        } else {
            org.telegram.ui.ActionBar.t6.r(this.u0, this.t0 + org.telegram.messenger.i0.L(4.0f), getMeasuredWidth(), this.v0);
        }
        jj jjVar = this.P0;
        if (jjVar == null || !jjVar.N5()) {
            return;
        }
        sg.p0 p0Var = this.E0;
        p0Var.getClass();
        p0Var.a = 1.0f;
        if (alpha < 1.0f) {
            canvas2 = canvas;
            canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (alpha * 255.0f), 31);
        } else {
            canvas2 = canvas;
        }
        r0 r0Var = this.r2;
        p0Var.d(canvas2, r0Var.b ? r0Var.c : 1.0f, num);
        if (alpha < 1.0f) {
            canvas2.restore();
        }
    }

    public final void L(km kmVar, Canvas canvas, int i10, Integer num, float f7) {
        sg.p0 p0Var = this.E0;
        p0Var.getClass();
        org.telegram.ui.ActionBar.p6 p6Var = this.g1;
        if (p6Var != null) {
            p6Var.b(this.u0, this.t0 + org.telegram.messenger.i0.L(4.0f), getMeasuredWidth(), this.v0);
        } else {
            org.telegram.ui.ActionBar.t6.r(this.u0, this.t0 + org.telegram.messenger.i0.L(4.0f), getMeasuredWidth(), this.v0);
        }
        p0Var.A = f7;
        p0Var.f(kmVar, canvas, i10, num);
    }

    @Override // org.telegram.messenger.z5
    public final void M(String str) {
        TLRPC.PhotoSize photoSize;
        jj jjVar = this.P0;
        if (jjVar == null || jjVar.D != 11) {
            return;
        }
        int size = jjVar.n0.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                photoSize = null;
                break;
            }
            photoSize = (TLRPC.PhotoSize) jjVar.n0.get(i10);
            if (photoSize instanceof TLRPC.TL_photoStrippedSize) {
                break;
            } else {
                i10++;
            }
        }
        this.I.r0(this.x0, "g", ic.f(photoSize, jjVar.l0), "50_50_b", this.L, 0L, null, jjVar, 1);
        org.telegram.messenger.b6.q(this.H).v(this);
    }

    public final ColorFilter N(int i10) {
        if (i10 != this.q2 || this.p2 == null) {
            this.q2 = i10;
            this.p2 = new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN);
        }
        return this.p2;
    }

    public final int O(jj jjVar) {
        int i10;
        int i11 = this.h1;
        int i12 = jjVar.D;
        if (i12 == 37) {
            i11 = org.telegram.messenger.i0.L(52.0f);
        } else if (i12 == 21 || X()) {
            i11 = org.telegram.messenger.i0.L(78.0f);
        }
        if (W() || (i10 = jjVar.D) == 34 || i10 == 35) {
            return 0;
        }
        return i11;
    }

    public Paint P(String str) {
        org.telegram.ui.ActionBar.p6 p6Var = this.g1;
        Paint d = p6Var != null ? p6Var.d(str) : null;
        return d != null ? d : org.telegram.ui.ActionBar.t6.V0(str);
    }

    public final float Q(jj jjVar) {
        vp r12;
        String str;
        if (jjVar == null) {
            return 1.0f;
        }
        try {
            if (jjVar.D == 22 && (str = (r12 = vp.r1(this.H)).Q2) != null && TextUtils.equals(jjVar.k.action.wallpaper.uploadingImage, str)) {
                return r12.R2.r;
            }
            return 1.0f;
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
            return 1.0f;
        }
    }

    public final boolean R() {
        if (this.V0 != null) {
            return false;
        }
        org.telegram.ui.ActionBar.p6 p6Var = this.g1;
        return p6Var != null ? p6Var.g() : org.telegram.ui.ActionBar.t6.d1();
    }

    public final boolean S() {
        rh.g4 g4Var = this.H0;
        return (g4Var == null || g4Var.Q == null) ? false : true;
    }

    public final boolean T() {
        TLRPC.Message message;
        jj jjVar = this.P0;
        return (jjVar == null || (message = jjVar.k) == null || !(message.action instanceof TLRPC.TL_messageActionGramTransfer)) ? false : true;
    }

    public final void U() {
        q0 q0Var = this.f1;
        if (q0Var != null && q0Var.f()) {
            super.invalidate();
        } else if (getParent() instanceof View) {
            ((View) getParent()).invalidate();
        }
    }

    public final boolean V(jj jjVar) {
        if (jjVar == null) {
            return false;
        }
        int i10 = jjVar.D;
        return i10 == 30 || i10 == 18 || i10 == 25 || X();
    }

    public final boolean W() {
        TLRPC.Message message;
        jj jjVar = this.P0;
        return (jjVar == null || (message = jjVar.k) == null || !(message.action instanceof TLRPC.TL_messageActionSuggestedPostApproval)) ? false : true;
    }

    public final boolean X() {
        jj jjVar;
        int i10;
        if (S() || this.O0 != null || (i10 = (jjVar = this.P0).D) == 31 || i10 == 37 || i10 == 33 || i10 == 35 || i10 == 34 || i10 == 21 || i10 == 22 || jjVar.z4()) {
            return true;
        }
        TLRPC.Message message = this.P0.k;
        if (message == null) {
            return false;
        }
        TLRPC.MessageAction messageAction = message.action;
        if (messageAction instanceof TLRPC.TL_messageActionSuggestedPostApproval) {
            return ((TLRPC.TL_messageActionSuggestedPostApproval) messageAction).balance_too_low || ((TLRPC.TL_messageActionSuggestedPostApproval) messageAction).rejected;
        }
        return false;
    }

    public final boolean Y() {
        jj jjVar = this.P0;
        if (jjVar == null) {
            return false;
        }
        TLRPC.Message message = jjVar.k;
        TLRPC.MessageAction messageAction = message.action;
        if (((messageAction instanceof TLRPC.TL_messageActionGiftCode) || (messageAction instanceof TLRPC.TL_messageActionGiftStars)) && (message.from_id instanceof TLRPC.TL_peerUser)) {
            return h20.B(vp.r1(this.H).Z1(Long.valueOf(this.P0.k.from_id.user_id)));
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.r4
    public final /* synthetic */ boolean a() {
        return false;
    }

    public final void a0(CharacterStyle characterStyle) {
        if (this.f1 == null || !(characterStyle instanceof URLSpan)) {
            return;
        }
        String url = ((URLSpan) characterStyle).getURL();
        if (url.startsWith("task")) {
            this.f1.E(this, this.P0.O1(), Integer.parseInt(url.substring(5)));
            return;
        }
        if (url.startsWith("topic")) {
            URLSpan uRLSpan = this.y;
            if (uRLSpan instanceof e51) {
                TLObject tLObject = ((e51) uRLSpan).c;
                if (tLObject instanceof TLRPC.TL_forumTopic) {
                    gg.e.m(this.f1.h0(), -this.f1.a(), (TLRPC.TL_forumTopic) tLObject, 0);
                    return;
                }
                return;
            }
        }
        if (url.startsWith("invite")) {
            URLSpan uRLSpan2 = this.y;
            if (uRLSpan2 instanceof e51) {
                TLObject tLObject2 = ((e51) uRLSpan2).c;
                if (tLObject2 instanceof TLRPC.TL_chatInviteExported) {
                    this.f1.k0((TLRPC.TL_chatInviteExported) tLObject2);
                    return;
                }
                return;
            }
        }
        if (url.startsWith("game")) {
            this.f1.r(this, this.P0.O1());
        } else if (url.startsWith("http")) {
            gf.f.r(getContext(), url);
        } else {
            this.f1.E0(Long.parseLong(url));
        }
    }

    public final void b0() {
        TLRPC.TL_premiumGiftOption tL_premiumGiftOption = new TLRPC.TL_premiumGiftOption();
        jj jjVar = this.P0;
        TLRPC.MessageAction messageAction = jjVar.k.action;
        tL_premiumGiftOption.amount = messageAction.amount;
        tL_premiumGiftOption.months = messageAction.months;
        tL_premiumGiftOption.currency = messageAction.currency;
        String str = null;
        if (jjVar != null && (messageAction instanceof TLRPC.TL_messageActionGiftCode) && !Y()) {
            str = ((TLRPC.TL_messageActionGiftCode) this.P0.k.action).slug;
        }
        if (this.f1 != null) {
            org.telegram.messenger.i0.g3(new li.s(this, tL_premiumGiftOption, str, 23));
        }
    }

    public final void c0() {
        TLRPC.Message message;
        jj jjVar = this.P0;
        if (jjVar == null || (message = jjVar.k) == null) {
            return;
        }
        TLRPC.MessageAction messageAction = message.action;
        boolean z10 = messageAction instanceof TLRPC.TL_messageActionGiftStars;
        th.t5 t5Var = this.d0;
        if (z10) {
            Context context = getContext();
            TLRPC.Message message2 = this.P0.k;
            int i10 = message2.date;
            TLRPC.Peer peer = message2.from_id;
            TLRPC.Peer peer2 = message2.peer_id;
            TLRPC.TL_messageActionGiftStars tL_messageActionGiftStars = (TLRPC.TL_messageActionGiftStars) message2.action;
            org.telegram.ui.ActionBar.p6 p6Var = t5Var.J;
            TL_stars.StarsTransaction starsTransaction = new TL_stars.StarsTransaction();
            starsTransaction.title = null;
            starsTransaction.description = null;
            starsTransaction.photo = null;
            TL_stars.TL_starsTransactionPeer tL_starsTransactionPeer = new TL_stars.TL_starsTransactionPeer();
            starsTransaction.peer = tL_starsTransactionPeer;
            tL_starsTransactionPeer.peer = peer;
            starsTransaction.date = i10;
            starsTransaction.amount = TL_stars.StarsAmount.ofStars(tL_messageActionGiftStars.stars);
            starsTransaction.id = tL_messageActionGiftStars.transaction_id;
            starsTransaction.gift = true;
            starsTransaction.sent_by = peer;
            starsTransaction.received_by = peer2;
            rh.h8.j1(context, false, 0L, this.H, starsTransaction, p6Var);
            return;
        }
        if (messageAction instanceof TLRPC.TL_messageActionPrizeStars) {
            Context context2 = getContext();
            TLRPC.Message message3 = this.P0.k;
            int i11 = message3.date;
            TLRPC.Peer peer3 = message3.from_id;
            TLRPC.Peer peer4 = message3.peer_id;
            TLRPC.TL_messageActionPrizeStars tL_messageActionPrizeStars = (TLRPC.TL_messageActionPrizeStars) message3.action;
            org.telegram.ui.ActionBar.p6 p6Var2 = t5Var.J;
            TL_stars.StarsTransaction starsTransaction2 = new TL_stars.StarsTransaction();
            starsTransaction2.title = null;
            starsTransaction2.description = null;
            starsTransaction2.photo = null;
            TL_stars.TL_starsTransactionPeer tL_starsTransactionPeer2 = new TL_stars.TL_starsTransactionPeer();
            starsTransaction2.peer = tL_starsTransactionPeer2;
            tL_starsTransactionPeer2.peer = tL_messageActionPrizeStars.boost_peer;
            starsTransaction2.date = i11;
            starsTransaction2.amount = TL_stars.StarsAmount.ofStars(tL_messageActionPrizeStars.stars);
            starsTransaction2.id = tL_messageActionPrizeStars.transaction_id;
            starsTransaction2.gift = true;
            starsTransaction2.flags |= TLObject.FLAG_13;
            starsTransaction2.giveaway_post_id = tL_messageActionPrizeStars.giveaway_msg_id;
            starsTransaction2.sent_by = peer3;
            starsTransaction2.received_by = peer4;
            rh.h8.j1(context2, false, 0L, this.H, starsTransaction2, p6Var2);
            return;
        }
        if (messageAction instanceof TLRPC.TL_messageActionGiftTon) {
            Context context3 = getContext();
            TLRPC.Message message4 = this.P0.k;
            int i12 = message4.date;
            TLRPC.Peer peer5 = message4.from_id;
            TLRPC.Peer peer6 = message4.peer_id;
            TLRPC.TL_messageActionGiftTon tL_messageActionGiftTon = (TLRPC.TL_messageActionGiftTon) message4.action;
            org.telegram.ui.ActionBar.p6 p6Var3 = t5Var.J;
            TL_stars.StarsTransaction starsTransaction3 = new TL_stars.StarsTransaction();
            starsTransaction3.title = null;
            starsTransaction3.description = null;
            starsTransaction3.photo = null;
            TL_stars.TL_starsTransactionPeer tL_starsTransactionPeer3 = new TL_stars.TL_starsTransactionPeer();
            starsTransaction3.peer = tL_starsTransactionPeer3;
            tL_starsTransactionPeer3.peer = peer5;
            starsTransaction3.date = i12;
            TL_stars.TL_starsTonAmount tL_starsTonAmount = new TL_stars.TL_starsTonAmount();
            starsTransaction3.amount = tL_starsTonAmount;
            tL_starsTonAmount.amount = tL_messageActionGiftTon.cryptoAmount;
            starsTransaction3.id = tL_messageActionGiftTon.transaction_id;
            starsTransaction3.gift = true;
            starsTransaction3.sent_by = peer5;
            starsTransaction3.received_by = peer6;
            rh.h8.j1(context3, false, 0L, this.H, starsTransaction3, p6Var3);
            return;
        }
        if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
            if (((TLRPC.TL_messageActionStarGift) messageAction).forceIn) {
                return;
            }
            rh.e4 e4Var = new rh.e4(getContext(), this.H, jj.B0(this.P0.k), this.g1, null);
            e4Var.i2(this.P0, null);
            e4Var.show();
            return;
        }
        if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
            if (!((TLRPC.TL_messageActionStarGiftUnique) messageAction).gift.burned) {
                rh.e4 e4Var2 = new rh.e4(getContext(), this.H, jj.B0(this.P0.k), this.g1, null);
                e4Var2.i2(this.P0, null);
                e4Var2.show();
                return;
            } else {
                org.telegram.ui.ActionBar.k2 T = LaunchActivity.T();
                if (T == null) {
                    return;
                }
                org.telegram.messenger.m5.n(null, 2131743905, cc.a0(T), R.raw.fire_on, 36);
                return;
            }
        }
        if (messageAction instanceof TLRPC.TL_messageActionSetChatTheme) {
            TLRPC.ChatTheme chatTheme = ((TLRPC.TL_messageActionSetChatTheme) messageAction).theme;
            if (chatTheme instanceof TLRPC.TL_chatThemeUniqueGift) {
                TL_stars.StarGift starGift = ((TLRPC.TL_chatThemeUniqueGift) chatTheme).gift;
                if (starGift instanceof TL_stars.TL_starGiftUnique) {
                    rh.e4 e4Var3 = new rh.e4(getContext(), this.H, jj.B0(this.P0.k), this.g1, null);
                    e4Var3.h2(starGift.slug, (TL_stars.TL_starGiftUnique) starGift, null);
                    e4Var3.show();
                }
            }
        }
    }

    public final boolean d0(float f7, float f10, lg lgVar) {
        if (T() && !this.P0.P3() && !this.P0.k.premiumEffectWasPlayed) {
            float y3 = getY() + getPaddingTop() + getWalletActionTop();
            if (y3 >= f7 && y3 + org.telegram.messenger.i0.L(140.0f) <= f10) {
                org.telegram.ui.Wallet.d4 d4Var = this.I0;
                bi0 bi0Var = d4Var.l;
                if (d4Var.i0 && d4Var.j0 == null) {
                    d4Var.i0 = false;
                    d4Var.k0 = lgVar;
                    d4Var.K.e(true, 0.0f);
                    d4Var.M = false;
                    d4Var.N = 0L;
                    d4Var.b();
                    d4Var.g();
                    d4Var.t = 18.0f;
                    d4Var.u.f();
                    bi0Var.T(true, 0.0f);
                    bi0Var.start();
                    d4Var.H = true;
                    float f11 = d4Var.R;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    d4Var.j0 = ofFloat;
                    ofFloat.setDuration(2400L);
                    d4Var.j0.setInterpolator(gr.h);
                    d4Var.j0.addUpdateListener(new eg(d4Var, f11, 5));
                    d4Var.j0.addListener(new ns0(d4Var, 16));
                    d4Var.j0.start();
                    d4Var.a.invalidate();
                    this.P0.k.premiumEffectWasPlayed = true;
                    hs.a0(this.H).X1(jj.B0(this.P0.k), this.P0.k);
                    return true;
                }
            }
        }
        return false;
    }

    @Override // org.telegram.messenger.us
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        jj jjVar;
        if (i10 == zs.m1) {
            setSpoilersSuppressed(false);
            return;
        }
        if (i10 == zs.i4) {
            invalidate();
            return;
        }
        if (i10 == zs.l1) {
            setSpoilersSuppressed(true);
            return;
        }
        if (i10 == zs.W2 || i10 == zs.F3 || i10 == zs.X2) {
            jj jjVar2 = this.P0;
            if (jjVar2 != null) {
                f0(jjVar2, true);
                return;
            }
            return;
        }
        if (i10 == zs.y0) {
            if (!Objects.equals(objArr[0], d20.i(this.H).b0) || (jjVar = this.P0) == null) {
                return;
            }
            f0(jjVar, true);
            return;
        }
        if (i10 == zs.a4 && T()) {
            this.m2 = null;
            this.V = 0;
            requestLayout();
            invalidate();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view != this.T1) {
            return super.drawChild(canvas, view, j10);
        }
        float a2 = this.n.a(0.02f);
        canvas.save();
        canvas.scale(a2, a2, (view.getMeasuredWidth() / 2.0f) + view.getX(), (view.getMeasuredHeight() / 2.0f) + view.getY());
        boolean drawChild = super.drawChild(canvas, view, j10);
        canvas.restore();
        return drawChild;
    }

    @Override // org.telegram.ui.Cells.r4
    public final void e(TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
        q0 q0Var = this.f1;
        if (q0Var != null) {
            q0Var.M1(this, reactionCount, z10, f7, f10);
        }
    }

    public final void e0(int i10, boolean z10, boolean z11) {
        int i11 = this.Q0;
        if (i11 == i10 || i11 / 3600 == i10 / 3600) {
            return;
        }
        String L0 = z10 ? i10 == 2147483646 ? cd.L0(2131748507, "MessageScheduledUntilOnline") : cd.a0("MessageScheduledOn", null, 2131748543, cd.u(i10, false)) : cd.u(i10, false);
        this.Q0 = i10;
        CharSequence charSequence = this.R0;
        if (charSequence == null || !TextUtils.equals(L0, charSequence)) {
            this.R0 = L0;
            this.m2 = null;
            h0(z11);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0be2  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0c4a  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0c53  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0c39  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x045a  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0524  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x052f  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0490  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x073c  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x0755  */
    /* JADX WARN: Removed duplicated region for block: B:452:0x09ad  */
    /* JADX WARN: Removed duplicated region for block: B:479:0x09f1 A[EDGE_INSN: B:479:0x09f1->B:475:0x09f1 BREAK  A[LOOP:6: B:450:0x09a5->B:477:0x09ee], SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r5v8, types: [org.telegram.tgnet.TLRPC$messages_StickerSet] */
    /* JADX WARN: Type inference failed for: r5v86 */
    /* JADX WARN: Type inference failed for: r5v87 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f0(jj jjVar, boolean z10) {
        StaticLayout staticLayout;
        TLRPC.TL_messageReactions tL_messageReactions;
        int i10;
        int i11;
        org.telegram.ui.ActionBar.p6 p6Var;
        int i12;
        int i13;
        org.telegram.ui.ActionBar.p6 p6Var2;
        String str;
        jj jjVar2;
        TLRPC.Document document;
        String str2;
        TLRPC.Document document2;
        String str3;
        ArrayList<TLRPC.TL_stickerPack> arrayList;
        jj jjVar3;
        int i14;
        TLRPC.Document document3;
        TLRPC.Document document4;
        TLRPC.Document document5;
        int i15;
        int i16;
        int i17;
        ImageReceiver imageReceiver;
        TLRPC.PhotoSize photoSize;
        ImageReceiver imageReceiver2;
        TLRPC.VideoSize videoSize;
        ImageReceiver imageReceiver3;
        ic icVar;
        TLRPC.PhotoSize photoSize2;
        ImageReceiver imageReceiver4;
        boolean z11;
        RadialProgress2 radialProgress2;
        float f7;
        int i18;
        TLRPC.WallPaper wallPaper;
        TLRPC.MessageAction messageAction;
        String str4;
        l11 l11Var;
        int i19;
        int paddingTop;
        int i20;
        TLRPC.Message message;
        String m10;
        String str5;
        ActivityManager activityManager;
        jj jjVar4 = jjVar;
        if (jjVar4 == null) {
            return;
        }
        if (this.P0 != jjVar4 && this.M0 != 0.0f) {
            setWalletSlidingOffset(0.0f);
        }
        TLRPC.Message message2 = jjVar4.k;
        if ((message2 == null || !(message2.action instanceof TLRPC.TL_messageActionGramTransfer) || this.a2 == message2.send_state) && this.P0 == jjVar4 && (((staticLayout = this.M) == null || TextUtils.equals(staticLayout.getText(), jjVar4.v)) && !((!this.D0 && jjVar4.C != null) || z10 || jjVar4.D == 21 || jjVar4.K1))) {
            return;
        }
        boolean z12 = org.telegram.messenger.v2.a;
        ArrayList arrayList2 = this.X1;
        arrayList2.clear();
        this.Y1 = null;
        this.m2 = null;
        jj jjVar5 = this.P0;
        int i21 = 1;
        boolean z13 = jjVar5 == null || jjVar5.k1 != jjVar4.k1;
        if (jjVar5 != null) {
            jjVar4.m1 = jjVar5.m1;
        }
        if (!z13 && jjVar5 != null && T()) {
            jjVar4.k.premiumEffectWasPlayed |= this.P0.k.premiumEffectWasPlayed;
        }
        this.P0 = jjVar4;
        boolean T = T();
        org.telegram.ui.ActionBar.p6 p6Var3 = this.g1;
        if (T && this.I0 == null) {
            org.telegram.ui.Wallet.d4 d4Var = new org.telegram.ui.Wallet.d4(this, p6Var3);
            this.I0 = d4Var;
            d4Var.s0 = new m0(this, i21);
            d4Var.n(this.J0);
        }
        org.telegram.ui.Wallet.d4 d4Var2 = this.I0;
        if (d4Var2 != null) {
            boolean T2 = T();
            s0 s0Var = d4Var2.a;
            d4Var2.n = T2;
            if (T2 && d4Var2.m == null && !d4Var2.o && c3.i0.t(s0Var) && tz.o() != 0 && (activityManager = (ActivityManager) s0Var.getContext().getSystemService("activity")) != null && activityManager.getDeviceConfigurationInfo().reqGlEsVersion >= 196608) {
                org.telegram.ui.Wallet.c4 c4Var = new org.telegram.ui.Wallet.c4(d4Var2, s0Var.getContext(), new org.telegram.ui.Wallet.z3(d4Var2, 1));
                d4Var2.m = c4Var;
                s0Var.addView(c4Var, new ViewGroup.LayoutParams(org.telegram.messenger.i0.L(42.0f), org.telegram.messenger.i0.L(42.0f)));
            }
            org.telegram.ui.Wallet.c4 c4Var2 = d4Var2.m;
            if (c4Var2 != null) {
                c4Var2.setVisibility((!T2 || d4Var2.o) ? 8 : 0);
                d4Var2.m.setPaused(!T2 || d4Var2.o);
            }
            if (!T2) {
                d4Var2.f();
                d4Var2.k();
            }
        }
        TLRPC.Message message3 = jjVar4.k;
        int i22 = this.H;
        if (message3 != null && (message3.action instanceof TLRPC.TL_messageActionGramTransfer)) {
            vp r12 = vp.r1(i22);
            long o10 = org.telegram.messenger.o5.o(jjVar4.k.peer_id);
            if (h20.A(o10)) {
                m10 = cd.L0(2131742997, null);
            } else if (jjVar4.k.peer_id == null) {
                str5 = null;
                org.telegram.ui.Wallet.d4 d4Var3 = this.I0;
                boolean P3 = jjVar4.P3();
                TLRPC.Message message4 = jjVar4.k;
                d4Var3.m(P3, (TLRPC.TL_messageActionGramTransfer) message4.action, str5, message4.send_state, z13, !message4.premiumEffectWasPlayed);
                this.a2 = jjVar4.k.send_state;
            } else {
                m10 = org.telegram.messenger.o5.m(r12.d2(o10));
            }
            str5 = m10;
            org.telegram.ui.Wallet.d4 d4Var32 = this.I0;
            boolean P32 = jjVar4.P3();
            TLRPC.Message message42 = jjVar4.k;
            d4Var32.m(P32, (TLRPC.TL_messageActionGramTransfer) message42.action, str5, message42.send_state, z13, !message42.premiumEffectWasPlayed);
            this.a2 = jjVar4.k.send_state;
        }
        jjVar4.K1 = false;
        this.D0 = jjVar4.C != null;
        org.telegram.messenger.b6.q(i22).v(this);
        this.V = 0;
        this.G = false;
        kg.o oVar = this.s1;
        if (oVar != null && z13) {
            org.telegram.ui.Components.o5.release((s0) oVar.i, (org.telegram.ui.Components.k5) oVar.h);
            this.s1 = null;
            this.n1 = false;
        }
        if (z13 || jjVar4.H) {
            jjVar4.H = false;
            TLRPC.Message message5 = jjVar4.k;
            boolean z14 = (message5 == null || (tL_messageReactions = message5.reactions) == null || !tL_messageReactions.reactions_as_tags) ? false : true;
            boolean N5 = jjVar4.N5();
            sg.p0 p0Var = this.E0;
            if (N5) {
                p0Var.r(jjVar4, z14, p6Var3);
            } else {
                p0Var.r(null, false, p6Var3);
            }
        }
        int i23 = 12;
        if (jjVar4.D == 32) {
            if (this.O0 == null) {
                nx0 nx0Var = new nx0(i22, this, p6Var3);
                this.O0 = nx0Var;
                if (this.d2) {
                    nx0Var.d.R(nx0Var.b);
                }
            }
            nx0 nx0Var2 = this.O0;
            nx0Var2.getClass();
            TLRPC.TL_messageActionSuggestBirthday tL_messageActionSuggestBirthday = (TLRPC.TL_messageActionSuggestBirthday) jjVar4.k.action;
            nx0Var2.e = tL_messageActionSuggestBirthday.birthday;
            i10 = 0;
            qz0 qz0Var = new qz0(TextUtils.concat(jjVar4.v, ":"), 13.0f, null);
            qz0Var.m(6);
            Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
            qz0Var.a();
            qz0Var.p(org.telegram.messenger.i0.L(174.0f) - org.telegram.messenger.i0.L(32.0f));
            nx0Var2.f = qz0Var;
            int i24 = (tL_messageActionSuggestBirthday.birthday.flags & 1) != 0 ? 3 : 2;
            qz0[] qz0VarArr = new qz0[i24];
            nx0Var2.g = qz0VarArr;
            nx0Var2.h = new qz0[i24];
            qz0VarArr[0] = new qz0(cd.L0(2131751675, null), 11.0f, null);
            i11 = 2;
            nx0Var2.h[0] = new qz0("" + tL_messageActionSuggestBirthday.birthday.day, 11.0f, org.telegram.messenger.i0.o());
            nx0Var2.g[1] = new qz0(cd.L0(2131751674, null), 11.0f, null);
            qz0[] qz0VarArr2 = nx0Var2.h;
            StringBuilder sb2 = new StringBuilder("");
            int i25 = tL_messageActionSuggestBirthday.birthday.month - 1;
            sb2.append((i25 < 0 || i25 >= 12) ? i0.a.i(i25, "") : cd.L0(new int[]{2131749096, 2131750830, 2131748698, 2131754173, 2131748677, 2131749074, 2131749076, 2131753895, 2131745582, 2131747846, 2131747851, 2131751606}[i25], null));
            qz0VarArr2[1] = new qz0(sb2.toString(), 11.0f, org.telegram.messenger.i0.o());
            if ((tL_messageActionSuggestBirthday.birthday.flags & 1) != 0) {
                nx0Var2.g[2] = new qz0(cd.L0(2131751670, null), 11.0f, null);
                nx0Var2.h[2] = new qz0("" + tL_messageActionSuggestBirthday.birthday.year, 11.0f, org.telegram.messenger.i0.o());
            }
            nx0Var2.i = !jjVar4.P3();
            org.telegram.ui.ActionBar.p6 p6Var4 = nx0Var2.c;
            nx0Var2.l.setColor(org.telegram.ui.ActionBar.t6.r1(0.12f, p6Var4 != null ? p6Var4.a() : org.telegram.ui.ActionBar.t6.I.q() ? -1 : -16777216));
            nx0Var2.j = new qz0(cd.L0(2131744421, null), 14.0f, org.telegram.messenger.i0.o());
        } else {
            i10 = 0;
            i11 = 2;
            nx0 nx0Var3 = this.O0;
            if (nx0Var3 != null) {
                nx0Var3.d.R(null);
                this.O0 = null;
            }
        }
        if (this.H0 == null && (message = jjVar4.k) != null && (message.action instanceof TLRPC.TL_messageActionStarGiftUnique)) {
            rh.g4 g4Var = new rh.g4(i22, this, p6Var3);
            this.H0 = g4Var;
            if (this.d2) {
                g4Var.a();
            }
        }
        rh.g4 g4Var2 = this.H0;
        if (g4Var2 != null) {
            g4Var2.f(jjVar4, !z13);
        }
        ImageReceiver imageReceiver5 = this.I;
        imageReceiver5.X(i10);
        imageReceiver5.e();
        if (jjVar4.D != 22) {
            this.J = null;
        }
        if (jjVar4.H0 != -1) {
            w7.e6.b(this, 0.02f, 1.2f);
            this.f2 = Math.max(org.telegram.messenger.i0.L(250.0f), vh.p2.a(jjVar4.v, (TextPaint) P("paintChatActionText")));
            iy0 W0 = sb.W0(jjVar4.v);
            if (W0 != null) {
                W0.h = this;
            }
        } else {
            setStateListAnimator(null);
            this.f2 = 0;
        }
        boolean z42 = jjVar4.z4();
        org.telegram.ui.Components.r8 r8Var = this.L;
        if (z42) {
            TLRPC.User Z1 = vp.r1(i22).Z1(Long.valueOf(jjVar4.k.media.user_id));
            r8Var.r(Z1);
            TL_stories.StoryItem storyItem = jjVar4.k.media.storyItem;
            if (storyItem == null || !storyItem.noforwards) {
                th.w5.x(imageReceiver5, storyItem);
            } else {
                imageReceiver5.j0(Z1, r8Var, null, true, 0, true);
            }
            imageReceiver5.J0((int) (this.h1 / 2.0f));
        } else {
            int i26 = jjVar4.D;
            RadialProgress2 radialProgress22 = this.J1;
            if (i26 != 22) {
                if (i26 == 21) {
                    imageReceiver5.J0((int) (this.h1 / 2.0f));
                    imageReceiver5.u0 = true;
                    imageReceiver5.g1 = null;
                    TLRPC.TL_messageActionSuggestProfilePhoto tL_messageActionSuggestProfilePhoto = (TLRPC.TL_messageActionSuggestProfilePhoto) jjVar4.k.action;
                    TLRPC.VideoSize x10 = org.telegram.messenger.b8.x(1000, tL_messageActionSuggestProfilePhoto.photo.video_sizes);
                    ArrayList<TLRPC.VideoSize> arrayList3 = tL_messageActionSuggestProfilePhoto.photo.video_sizes;
                    if (arrayList3 == null || arrayList3.isEmpty()) {
                        imageReceiver3 = imageReceiver5;
                        icVar = null;
                    } else {
                        icVar = ic.j(x10, tL_messageActionSuggestProfilePhoto.photo);
                        imageReceiver3 = imageReceiver5;
                    }
                    TLRPC.Photo photo = jjVar4.k.action.photo;
                    if (jjVar4.G1 == null) {
                        int size = jjVar4.n0.size();
                        for (int i27 = 0; i27 < size; i27++) {
                            photoSize2 = (TLRPC.PhotoSize) jjVar4.n0.get(i27);
                            if (photoSize2 instanceof TLRPC.TL_photoStrippedSize) {
                                break;
                            }
                        }
                    }
                    photoSize2 = null;
                    TLRPC.PhotoSize w9 = org.telegram.messenger.b8.w(jjVar4.n0, 1000, false, null, false);
                    if (w9 == null) {
                        imageReceiver4 = imageReceiver3;
                        p6Var = p6Var3;
                        i12 = i22;
                        z11 = false;
                        radialProgress2 = radialProgress22;
                        f7 = 1.0f;
                        i18 = 3;
                    } else if (x10 != null) {
                        radialProgress2 = radialProgress22;
                        i12 = i22;
                        f7 = 1.0f;
                        z11 = false;
                        p6Var = p6Var3;
                        i18 = 3;
                        imageReceiver3.u0(icVar, "g", ic.i(w9, photo), "150_150", ic.f(photoSize2, jjVar4.l0), "50_50_b", jjVar4.G1, 0L, null, jjVar, 0);
                        imageReceiver4 = imageReceiver3;
                        jjVar4 = jjVar;
                    } else {
                        p6Var = p6Var3;
                        i12 = i22;
                        z11 = false;
                        radialProgress2 = radialProgress22;
                        f7 = 1.0f;
                        i18 = 3;
                        imageReceiver3.r0(ic.i(w9, photo), "150_150", ic.f(photoSize2, jjVar4.l0), "50_50_b", jjVar4.G1, 0L, null, jjVar4, 0);
                        imageReceiver4 = imageReceiver3;
                    }
                    imageReceiver4.u0 = z11;
                    b40 b40Var = (b40) vp.r1(i12).C7.get(jjVar4.k.local_id);
                    if (b40Var == null || b40Var.W == f7) {
                        RadialProgress2 radialProgress23 = radialProgress2;
                        boolean z15 = !z13;
                        radialProgress23.p(z15, f7);
                        radialProgress23.setIcon(4, z15, z15);
                    } else {
                        boolean z16 = !z13;
                        radialProgress2.setIcon(i18, z16, z16);
                    }
                } else {
                    p6Var = p6Var3;
                    i12 = i22;
                    int i28 = 0;
                    if (i26 == 31 || i26 == 33 || i26 == 30 || i26 == 18 || i26 == 25 || i26 == 35) {
                        String str6 = null;
                        imageReceiver5.J0(0);
                        TLRPC.MessageAction messageAction2 = jjVar4.k.action;
                        if (messageAction2 instanceof TLRPC.TL_messageActionNoForwardsRequest) {
                            TLRPC.TL_messageActionNoForwardsRequest tL_messageActionNoForwardsRequest = (TLRPC.TL_messageActionNoForwardsRequest) messageAction2;
                            this.Z1 = tL_messageActionNoForwardsRequest.expired || ((long) jjVar4.k.date) + vp.r1(i12).y7.D.a(TimeUnit.SECONDS) < ((long) ConnectionsManager.getInstance(i12).getCurrentTime());
                            if (jjVar4.N3() || tL_messageActionNoForwardsRequest.expired || this.Z1) {
                                i17 = 8;
                            } else {
                                ArrayList arrayList4 = new ArrayList();
                                org.telegram.messenger.s2 s2Var = new org.telegram.messenger.s2(7, 2131751415, R.drawable.filled_bot_decline_24);
                                i17 = 8;
                                org.telegram.messenger.s2 s2Var2 = new org.telegram.messenger.s2(8, 2131751416, R.drawable.filled_bot_approve_24);
                                org.telegram.messenger.q2[] q2VarArr = new org.telegram.messenger.q2[i11];
                                q2VarArr[0] = s2Var;
                                q2VarArr[1] = s2Var2;
                                arrayList4.add(q2VarArr);
                                this.Y1 = new c5.x((org.telegram.messenger.q2[][]) arrayList4.toArray(new org.telegram.messenger.q2[arrayList4.size()][]), i28, i23);
                            }
                            i13 = i17;
                            document = null;
                            jjVar2 = null;
                            jjVar3 = null;
                            p6Var2 = p6Var;
                        } else {
                            i13 = 8;
                            if (messageAction2 instanceof TLRPC.TL_messageActionStarGiftPurchaseOffer) {
                                TLRPC.TL_messageActionStarGiftPurchaseOffer tL_messageActionStarGiftPurchaseOffer = (TLRPC.TL_messageActionStarGiftPurchaseOffer) messageAction2;
                                TL_stars.StarGift starGift = tL_messageActionStarGiftPurchaseOffer.gift;
                                if (starGift != null) {
                                    document5 = sf.d.e(starGift);
                                    if (this.S0 == null) {
                                        p6Var2 = p6Var;
                                        this.S0 = new ph.z0(this, p6Var2, false);
                                    } else {
                                        p6Var2 = p6Var;
                                    }
                                    this.S0.d((TL_stars.starGiftAttributeBackdrop) rh.e6.l(starGift.attributes, TL_stars.starGiftAttributeBackdrop.class));
                                    this.S0.e((TL_stars.starGiftAttributePattern) rh.e6.l(starGift.attributes, TL_stars.starGiftAttributePattern.class));
                                } else {
                                    p6Var2 = p6Var;
                                    document5 = null;
                                }
                                this.Z1 = tL_messageActionStarGiftPurchaseOffer.expires_at < ConnectionsManager.getInstance(i12).getCurrentTime();
                                if (!jjVar4.N3() && !tL_messageActionStarGiftPurchaseOffer.accepted && !tL_messageActionStarGiftPurchaseOffer.declined && !this.Z1) {
                                    ArrayList arrayList5 = new ArrayList();
                                    arrayList5.add(new org.telegram.messenger.q2[]{new org.telegram.messenger.s2(5, 2131749740, R.drawable.filled_bot_decline_24), new org.telegram.messenger.s2(6, 2131749750, R.drawable.filled_bot_approve_24)});
                                    this.Y1 = new c5.x((org.telegram.messenger.q2[][]) arrayList5.toArray(new org.telegram.messenger.q2[arrayList5.size()][]), i28, i23);
                                }
                                document = document5;
                            } else {
                                p6Var2 = p6Var;
                                if (!(messageAction2 instanceof TLRPC.TL_messageActionSetChatTheme)) {
                                    if (messageAction2 instanceof TLRPC.TL_messageActionStarGift) {
                                        TL_stars.StarGift starGift2 = ((TLRPC.TL_messageActionStarGift) messageAction2).gift;
                                        if (starGift2 != null) {
                                            document = starGift2.sticker;
                                            jjVar3 = jjVar4;
                                            jjVar2 = null;
                                            str6 = null;
                                        }
                                        document = null;
                                        jjVar3 = jjVar4;
                                        jjVar2 = null;
                                        str6 = null;
                                    } else {
                                        if (messageAction2 instanceof TLRPC.TL_messageActionStarGiftUnique) {
                                            TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique = (TLRPC.TL_messageActionStarGiftUnique) messageAction2;
                                            if (tL_messageActionStarGiftUnique.refunded) {
                                                TL_stars.StarGift starGift3 = tL_messageActionStarGiftUnique.gift;
                                                if (starGift3 != null) {
                                                    document = starGift3.getDocument();
                                                    jjVar3 = jjVar4;
                                                    jjVar2 = null;
                                                    str6 = null;
                                                }
                                                document = null;
                                                jjVar3 = jjVar4;
                                                jjVar2 = null;
                                                str6 = null;
                                            }
                                        }
                                        if (messageAction2 instanceof TLRPC.TL_messageActionGiftTon) {
                                            str = d20.i(i12).c0;
                                            if (str == null) {
                                                ui.b0(i12).C();
                                                return;
                                            }
                                        } else {
                                            str = d20.i(i12).b0;
                                            if (str == null) {
                                                ui.b0(i12).z();
                                                return;
                                            }
                                        }
                                        TLRPC.TL_messages_stickerSet p02 = ui.b0(i12).p0(str);
                                        ?? r52 = p02;
                                        if (p02 == null) {
                                            r52 = ui.b0(i12).n0(str);
                                        }
                                        if (r52 != 0) {
                                            TLRPC.MessageAction messageAction3 = jjVar4.k.action;
                                            int i29 = messageAction3.months;
                                            if (jjVar4.D == 30) {
                                                String str7 = "3⃣";
                                                if (messageAction3 instanceof TLRPC.TL_messageActionGiftTon) {
                                                    long j10 = messageAction3.cryptoAmount;
                                                    if (j10 > 10000000000L) {
                                                        if (j10 <= 50000000000L) {
                                                            str7 = "1⃣";
                                                        }
                                                        i14 = 0;
                                                        while (true) {
                                                            if (i14 < r52.packs.size()) {
                                                                break;
                                                            }
                                                            TLRPC.TL_stickerPack tL_stickerPack = r52.packs.get(i14);
                                                            if (TextUtils.equals(tL_stickerPack.emoticon, str7) && !tL_stickerPack.documents.isEmpty()) {
                                                                long longValue = tL_stickerPack.documents.get(0).longValue();
                                                                for (int i30 = 0; i30 < r52.documents.size(); i30++) {
                                                                    document3 = r52.documents.get(i30);
                                                                    if (document3 != null && document3.id == longValue) {
                                                                        break;
                                                                    }
                                                                }
                                                            } else {
                                                                i14++;
                                                            }
                                                        }
                                                        document3 = null;
                                                        str2 = str;
                                                        document2 = document3;
                                                    }
                                                    str7 = "2⃣";
                                                    i14 = 0;
                                                    while (true) {
                                                        if (i14 < r52.packs.size()) {
                                                        }
                                                        i14++;
                                                    }
                                                    document3 = null;
                                                    str2 = str;
                                                    document2 = document3;
                                                } else {
                                                    long j11 = messageAction3 instanceof TLRPC.TL_messageActionGiftStars ? ((TLRPC.TL_messageActionGiftStars) messageAction3).stars : ((TLRPC.TL_messageActionPrizeStars) messageAction3).stars;
                                                    if (j11 > 1000) {
                                                        if (j11 >= 2500) {
                                                            str7 = "4⃣";
                                                        }
                                                        i14 = 0;
                                                        while (true) {
                                                            if (i14 < r52.packs.size()) {
                                                            }
                                                            i14++;
                                                        }
                                                        document3 = null;
                                                        str2 = str;
                                                        document2 = document3;
                                                    }
                                                    str7 = "2⃣";
                                                    i14 = 0;
                                                    while (true) {
                                                        if (i14 < r52.packs.size()) {
                                                        }
                                                        i14++;
                                                    }
                                                    document3 = null;
                                                    str2 = str;
                                                    document2 = document3;
                                                }
                                            } else {
                                                String str8 = (String) s2.get(Integer.valueOf(i29));
                                                ArrayList<TLRPC.TL_stickerPack> arrayList6 = r52.packs;
                                                int size2 = arrayList6.size();
                                                int i31 = 0;
                                                TLRPC.Document document6 = null;
                                                while (true) {
                                                    if (i31 >= size2) {
                                                        str2 = str;
                                                        break;
                                                    }
                                                    TLRPC.TL_stickerPack tL_stickerPack2 = arrayList6.get(i31);
                                                    i31++;
                                                    TLRPC.TL_stickerPack tL_stickerPack3 = tL_stickerPack2;
                                                    if (Objects.equals(tL_stickerPack3.emoticon, str8)) {
                                                        ArrayList<Long> arrayList7 = tL_stickerPack3.documents;
                                                        int size3 = arrayList7.size();
                                                        TLRPC.Document document7 = document6;
                                                        int i32 = i28;
                                                        while (true) {
                                                            if (i32 >= size3) {
                                                                str2 = str;
                                                                str3 = str8;
                                                                arrayList = arrayList6;
                                                                break;
                                                            }
                                                            Long l4 = arrayList7.get(i32);
                                                            i32++;
                                                            long longValue2 = l4.longValue();
                                                            ArrayList<TLRPC.Document> arrayList8 = r52.documents;
                                                            str2 = str;
                                                            int size4 = arrayList8.size();
                                                            str3 = str8;
                                                            int i33 = 0;
                                                            while (true) {
                                                                if (i33 >= size4) {
                                                                    arrayList = arrayList6;
                                                                    break;
                                                                }
                                                                TLRPC.Document document8 = arrayList8.get(i33);
                                                                int i34 = i33 + 1;
                                                                int i35 = size4;
                                                                TLRPC.Document document9 = document8;
                                                                arrayList = arrayList6;
                                                                if (document9.id == longValue2) {
                                                                    document7 = document9;
                                                                    break;
                                                                } else {
                                                                    arrayList6 = arrayList;
                                                                    size4 = i35;
                                                                    i33 = i34;
                                                                }
                                                            }
                                                            if (document7 != null) {
                                                                break;
                                                            }
                                                            str = str2;
                                                            str8 = str3;
                                                            arrayList6 = arrayList;
                                                        }
                                                        document6 = document7;
                                                    } else {
                                                        str2 = str;
                                                        str3 = str8;
                                                        arrayList = arrayList6;
                                                    }
                                                    if (document6 != null) {
                                                        break;
                                                    }
                                                    str = str2;
                                                    str8 = str3;
                                                    arrayList6 = arrayList;
                                                    i28 = 0;
                                                }
                                                document2 = document6;
                                            }
                                            if (document2 == null && !r52.documents.isEmpty()) {
                                                document2 = r52.documents.get(0);
                                            }
                                            jjVar3 = r52;
                                            document = document2;
                                            str6 = str2;
                                            jjVar2 = jjVar3;
                                        } else {
                                            jjVar2 = r52;
                                            str6 = str;
                                            document = null;
                                            jjVar3 = null;
                                        }
                                    }
                                    if (!this.k0 && this.e0 && this.i0 && (this.f0 || this.g0 || this.h0)) {
                                        this.l0 = org.telegram.messenger.i0.L(33.0f);
                                        if (this.n0 == null) {
                                            l11 l11Var2 = new l11(i12, this, p6Var2, true);
                                            this.n0 = l11Var2;
                                            l11Var2.s = new m0(this, 3);
                                        }
                                        if (this.n0.e(this.P0)) {
                                            if (this.d2) {
                                                this.n0.a();
                                            }
                                            i19 = 0;
                                        } else {
                                            this.n0.b();
                                            this.n0 = null;
                                            i19 = 0;
                                            this.l0 = 0;
                                        }
                                    } else {
                                        l11Var = this.n0;
                                        if (l11Var != null) {
                                            l11Var.b();
                                            this.n0 = null;
                                        }
                                        i19 = 0;
                                        this.l0 = 0;
                                    }
                                    paddingTop = getPaddingTop();
                                    i20 = this.l0;
                                    if (paddingTop != i20) {
                                        setPadding(i19, i20, i19, i19);
                                    }
                                    this.T1.setVisibility((V(jjVar) || S()) ? i13 : i19);
                                    gg.e.b(jjVar4);
                                    requestLayout();
                                }
                                TL_stars.StarGift starGift4 = ((TLRPC.TL_chatThemeUniqueGift) ((TLRPC.TL_messageActionSetChatTheme) messageAction2).theme).gift;
                                if (starGift4 != null) {
                                    document4 = sf.d.e(starGift4);
                                    if (this.S0 == null) {
                                        this.S0 = new ph.z0(this, p6Var2, false);
                                    }
                                    this.S0.d((TL_stars.starGiftAttributeBackdrop) rh.e6.l(starGift4.attributes, TL_stars.starGiftAttributeBackdrop.class));
                                    this.S0.e((TL_stars.starGiftAttributePattern) rh.e6.l(starGift4.attributes, TL_stars.starGiftAttributePattern.class));
                                } else {
                                    document4 = null;
                                }
                                document = document4;
                            }
                            jjVar2 = null;
                            str6 = null;
                            jjVar3 = null;
                        }
                        c5.x xVar = this.Y1;
                        if (xVar != null) {
                            int length = ((org.telegram.messenger.q2[][]) xVar.c).length;
                            int i36 = 0;
                            while (i36 < length) {
                                int length2 = ((org.telegram.messenger.q2[][]) this.Y1.c)[i36].length;
                                int i37 = 0;
                                while (i37 < length2) {
                                    org.telegram.messenger.q2 q2Var = ((org.telegram.messenger.q2[][]) this.Y1.c)[i36][i37];
                                    c0 c0Var = new c0(new m0(this, 2));
                                    c0Var.j = (org.telegram.messenger.s2) q2Var;
                                    int c10 = q2Var.c();
                                    if (c10 != 0) {
                                        Drawable drawable = getResources().getDrawable(c10);
                                        c0Var.t = drawable;
                                        i15 = length;
                                        i16 = i36;
                                        drawable.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                                    } else {
                                        i15 = length;
                                        i16 = i36;
                                    }
                                    c0Var.f = org.telegram.messenger.i0.L(40.0f);
                                    int i38 = c0Var.g | 8;
                                    c0Var.g = i38;
                                    int b10 = v7.u7.b(i38, 1, i37 == 0);
                                    c0Var.g = b10;
                                    c0Var.g = v7.u7.b(b10, 2, i37 == 1);
                                    c0Var.h = new qz0(q2Var.d(), (TextPaint) P("paintChatBotButton"));
                                    arrayList2.add(c0Var);
                                    i37++;
                                    length = i15;
                                    i36 = i16;
                                }
                                i36++;
                                length = length;
                            }
                        }
                        this.L1 = jjVar4.l1;
                        this.H1 = document;
                        if (document != null) {
                            imageReceiver5.u0 = true;
                            int i39 = jjVar4.D;
                            if (i39 != 31 && i39 != 37 && i39 != 33) {
                                imageReceiver5.d0(this.N1);
                            }
                            this.I1 = null;
                            int i40 = 0;
                            while (true) {
                                if (i40 >= document.video_thumbs.size()) {
                                    break;
                                }
                                if ("f".equals(document.video_thumbs.get(i40).type)) {
                                    this.I1 = document.video_thumbs.get(i40);
                                    break;
                                }
                                i40++;
                            }
                            if (z13 || jjVar4.D != 18) {
                                c00 e = org.telegram.messenger.v5.e(document, org.telegram.ui.ActionBar.t6.a7, 0.3f);
                                imageReceiver5.W(0);
                                ic b11 = ic.b(document);
                                Locale locale = Locale.US;
                                imageReceiver5.q0(b11, i0.a.i(jjVar4.k1, "160_160_nr_messageId="), e, "tgs", jjVar3, 1);
                            }
                        } else if (str6 != null) {
                            ui.b0(i12).c1(str6, false, jjVar2 == null);
                        }
                        if (!this.k0) {
                        }
                        l11Var = this.n0;
                        if (l11Var != null) {
                        }
                        i19 = 0;
                        this.l0 = 0;
                        paddingTop = getPaddingTop();
                        i20 = this.l0;
                        if (paddingTop != i20) {
                        }
                        this.T1.setVisibility((V(jjVar) || S()) ? i13 : i19);
                        gg.e.b(jjVar4);
                        requestLayout();
                    }
                    if (i26 == 37) {
                        TLRPC.Chat L0 = vp.r1(i12).L0(Long.valueOf(((TLRPC.TL_messageActionChangeCommunity) jjVar4.k.action).community_id));
                        imageReceiver5.u0 = true;
                        imageReceiver5.g1 = null;
                        imageReceiver5.J0(org.telegram.messenger.i0.L(14.0f));
                        imageReceiver5.X(1);
                        r8Var.q(L0);
                        imageReceiver5.i0(L0, new fq(getContext(), org.telegram.messenger.i0.L(14.0f)), L0);
                    } else if (i26 == 11) {
                        imageReceiver5.u0 = true;
                        imageReceiver5.g1 = null;
                        imageReceiver5.J0(org.telegram.messenger.i0.u / 2);
                        imageReceiver5.X(1);
                        r8Var.k(jj.B0(jjVar4.k), null, null, null);
                        if (jjVar4.k.action instanceof TLRPC.TL_messageActionUserUpdatedPhoto) {
                            imageReceiver = imageReceiver5;
                            imageReceiver.q0(null, null, r8Var, null, jjVar4, 0);
                        } else {
                            imageReceiver = imageReceiver5;
                            if (jjVar4.G1 == null) {
                                int size5 = jjVar4.n0.size();
                                for (int i41 = 0; i41 < size5; i41++) {
                                    photoSize = (TLRPC.PhotoSize) jjVar4.n0.get(i41);
                                    if (photoSize instanceof TLRPC.TL_photoStrippedSize) {
                                        break;
                                    }
                                }
                            }
                            photoSize = null;
                            TLRPC.PhotoSize w10 = org.telegram.messenger.b8.w(jjVar4.n0, 640, false, null, false);
                            if (w10 != null) {
                                TLRPC.Photo photo2 = jjVar4.k.action.photo;
                                if (!photo2.video_sizes.isEmpty()) {
                                    int i42 = tz.a;
                                    if (sc.e(2048)) {
                                        videoSize = org.telegram.messenger.b8.x(1000, photo2.video_sizes);
                                        if (!jjVar4.x0 && !org.telegram.messenger.b6.q(i12).c(4, videoSize.size)) {
                                            this.x0 = ic.j(videoSize, photo2);
                                            org.telegram.messenger.b6.q(i12).a(org.telegram.messenger.b8.r(null, videoSize), jjVar4, this);
                                        }
                                        if (videoSize == null) {
                                            imageReceiver.r0(ic.j(videoSize, photo2), "g", ic.f(photoSize, jjVar4.l0), "50_50_b", jjVar4.G1, 0L, null, jjVar4, 1);
                                        } else {
                                            imageReceiver.r0(ic.f(w10, jjVar4.l0), "150_150", ic.f(photoSize, jjVar4.l0), "50_50_b", jjVar4.G1, 0L, null, jjVar4, 1);
                                        }
                                    }
                                }
                                videoSize = null;
                                if (videoSize == null) {
                                }
                            } else {
                                imageReceiver2 = imageReceiver;
                                imageReceiver2.w0(r8Var);
                                imageReceiver2.O0(!PhotoViewer.Q1(jjVar4), false);
                            }
                        }
                        imageReceiver2 = imageReceiver;
                        imageReceiver2.O0(!PhotoViewer.Q1(jjVar4), false);
                    } else {
                        imageReceiver5.u0 = true;
                        imageReceiver5.g1 = null;
                        imageReceiver5.v0(null);
                    }
                }
                p6Var2 = p6Var;
                i13 = 8;
                if (!this.k0) {
                }
                l11Var = this.n0;
                if (l11Var != null) {
                }
                i19 = 0;
                this.l0 = 0;
                paddingTop = getPaddingTop();
                i20 = this.l0;
                if (paddingTop != i20) {
                }
                this.T1.setVisibility((V(jjVar) || S()) ? i13 : i19);
                gg.e.b(jjVar4);
                requestLayout();
            }
            if (jjVar4.G1 == null) {
                int size6 = jjVar4.n0.size();
                for (int i43 = 0; i43 < size6 && !(((TLRPC.PhotoSize) jjVar4.n0.get(i43)) instanceof TLRPC.TL_photoStrippedSize); i43++) {
                }
            }
            TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent = jjVar4.J1;
            if (tL_channelAdminLogEvent != null) {
                TLRPC.ChannelAdminLogEventAction channelAdminLogEventAction = tL_channelAdminLogEvent.action;
                if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionChangeWallpaper) {
                    wallPaper = ((TLRPC.TL_channelAdminLogEventActionChangeWallpaper) channelAdminLogEventAction).new_value;
                    if (TextUtils.isEmpty(org.telegram.messenger.g4.j(wallPaper))) {
                        boolean a2 = p6Var3 != null ? p6Var3.a() : org.telegram.ui.ActionBar.t6.I.q();
                        imageReceiver5.f();
                        String j12 = org.telegram.messenger.g4.j(wallPaper);
                        int i44 = vh.k4.B0;
                        org.telegram.ui.ActionBar.y3 i45 = org.telegram.messenger.g4.f(i22).i(yf.b.d(j12));
                        Drawable s02 = i45 == null ? org.telegram.ui.ActionBar.t6.s0() : vh.k4.g(i22, i45, a2);
                        this.J = s02;
                        if (s02 != null) {
                            s02.setCallback(this);
                        }
                    } else if (wallPaper != null && (str4 = wallPaper.uploadingImage) != null) {
                        imageReceiver5.r0(ic.g(str4), "150_150_wallpaper" + wallPaper.id + xn.e(wallPaper.settings), null, null, xn.b(wallPaper), 0L, null, wallPaper, 1);
                        this.J = null;
                    } else if (wallPaper != null) {
                        TLObject tLObject = jjVar4.l0;
                        imageReceiver5.r0(ic.b(tLObject instanceof TLRPC.Document ? (TLRPC.Document) tLObject : wallPaper.document), "150_150_wallpaper" + wallPaper.id + xn.e(wallPaper.settings), null, null, xn.b(wallPaper), 0L, null, wallPaper, 1);
                        imageReceiver5 = imageReceiver5;
                        this.J = null;
                    } else {
                        imageReceiver5 = imageReceiver5;
                        this.J = null;
                    }
                    imageReceiver5.J0((int) (this.h1 / 2.0f));
                    if (Q(jjVar) != 1.0f) {
                        boolean z17 = !z13;
                        radialProgress22.p(z17, 1.0f);
                        radialProgress22.setIcon(4, z17, z17);
                    } else {
                        boolean z18 = !z13;
                        radialProgress22.setIcon(3, z18, z18);
                    }
                }
            }
            TLRPC.Message message6 = jjVar4.k;
            wallPaper = (message6 == null || (messageAction = message6.action) == null) ? null : messageAction.wallpaper;
            if (TextUtils.isEmpty(org.telegram.messenger.g4.j(wallPaper))) {
            }
            imageReceiver5.J0((int) (this.h1 / 2.0f));
            if (Q(jjVar) != 1.0f) {
            }
        }
        p6Var2 = p6Var3;
        i12 = i22;
        i13 = 8;
        if (!this.k0) {
        }
        l11Var = this.n0;
        if (l11Var != null) {
        }
        i19 = 0;
        this.l0 = 0;
        paddingTop = getPaddingTop();
        i20 = this.l0;
        if (paddingTop != i20) {
        }
        this.T1.setVisibility((V(jjVar) || S()) ? i13 : i19);
        gg.e.b(jjVar4);
        requestLayout();
    }

    @Override // org.telegram.ui.Cells.r4
    public final /* synthetic */ boolean g() {
        return false;
    }

    public final void g0(float f7, int i10) {
        this.w0 = true;
        this.v0 = i10;
        this.t0 = f7;
        this.u0 = 0.0f;
    }

    public /* bridge */ /* synthetic */ ImageReceiver getAvatarImage() {
        return null;
    }

    @Override // org.telegram.ui.Cells.z
    public int getBoundsLeft() {
        if (S()) {
            int width = ((int) (getWidth() - (this.H0.T.f + org.telegram.messenger.i0.L(8.0f)))) / 2;
            return this.H0.p ? width : Math.min(this.a1, width);
        }
        if (V(this.P0)) {
            return i0.a.u(getWidth(), this.i1, 2, this.j0 / 2);
        }
        int i10 = this.a1;
        ImageReceiver imageReceiver = this.I;
        if (imageReceiver != null && imageReceiver.Q0) {
            i10 = Math.min((int) imageReceiver.K0, i10);
        }
        return (this.j0 / 2) + i10;
    }

    @Override // org.telegram.ui.Cells.z
    public int getBoundsRight() {
        int i10;
        int i11;
        if (S()) {
            int L = ((int) ((this.H0.T.f + org.telegram.messenger.i0.L(8.0f)) + getWidth())) / 2;
            return this.H0.p ? L : Math.max(this.b1, L);
        }
        if (V(this.P0)) {
            i10 = this.j0 / 2;
            i11 = (getWidth() + this.i1) / 2;
        } else {
            i10 = this.b1;
            ImageReceiver imageReceiver = this.I;
            if (imageReceiver != null && imageReceiver.Q0) {
                i10 = Math.max((int) imageReceiver.y(), i10);
            }
            i11 = this.j0 / 2;
        }
        return i11 + i10;
    }

    @Override // org.telegram.ui.Cells.r4
    public /* bridge */ /* synthetic */ float getCheckBoxTranslation() {
        return 0.0f;
    }

    public /* bridge */ /* synthetic */ bj getCurrentPosition() {
        return null;
    }

    public int getCustomDate() {
        return this.Q0;
    }

    public q0 getDelegate() {
        return this.f1;
    }

    @Override // org.telegram.ui.Cells.r4
    public float getDeltaBottom() {
        return 0.0f;
    }

    public float getDeltaLeft() {
        return 0.0f;
    }

    public float getDeltaRight() {
        return 0.0f;
    }

    public float getDeltaTop() {
        return 0.0f;
    }

    public int getLayoutHeight() {
        return getMeasuredHeight();
    }

    @Override // org.telegram.ui.Cells.r4
    public jj getMessageObject() {
        return this.P0;
    }

    @Override // org.telegram.messenger.z5
    public int getObserverTag() {
        return this.x;
    }

    public ImageReceiver getPhotoImage() {
        return this.I;
    }

    public sg.p0 getReactionsLayout() {
        return this.E0;
    }

    @Override // org.telegram.ui.Cells.r4
    public /* bridge */ /* synthetic */ float getSlidingOffsetX() {
        return 0.0f;
    }

    public r0 getTransitionParams() {
        return this.r2;
    }

    public float getWalletSlidingOffset() {
        return this.M0;
    }

    public final void h0(boolean z10) {
        if (getMeasuredWidth() != 0) {
            F(getMeasuredWidth(), this.R0);
            invalidate();
        }
        if (this.C0) {
            x();
        } else if (z10) {
            org.telegram.messenger.i0.g3(new m0(this, 5));
        } else {
            requestLayout();
        }
    }

    @Override // org.telegram.ui.Cells.z, android.view.View, org.telegram.ui.Cells.r9
    public final void invalidate() {
        super.invalidate();
        View view = this.w;
        if (view != null) {
            view.invalidate();
        }
        Runnable runnable = this.o2;
        if (runnable != null) {
            runnable.run();
        }
        if (!this.n2 || getParent() == null) {
            return;
        }
        View view2 = (View) getParent();
        if (view2.getParent() != null) {
            view2.invalidate();
            ((View) view2.getParent()).invalidate();
        }
    }

    @Override // org.telegram.ui.Cells.r4
    public final /* synthetic */ boolean k() {
        return false;
    }

    @Override // org.telegram.ui.Cells.r4
    public final /* synthetic */ boolean l() {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        q0 q0Var;
        super.onAttachedToWindow();
        this.d2 = true;
        this.I.P();
        setStarsPaused(false);
        this.r0 = org.telegram.ui.Components.o5.update(0, this, (!this.s || (q0Var = this.f1) == null || q0Var.f()) ? false : true, this.r0, this.M);
        kg.o oVar = this.s1;
        if (oVar != null) {
            oVar.h = org.telegram.ui.Components.o5.update(0, (View) oVar.i, false, (org.telegram.ui.Components.k5) oVar.h, (StaticLayout) oVar.f);
        }
        int i10 = this.H;
        zs.f(i10).c(this, zs.W2);
        zs.f(i10).c(this, zs.X2);
        zs.f(i10).c(this, zs.F3);
        zs.f(i10).c(this, zs.y0);
        zs.f(i10).c(this, zs.a4);
        zs.e().c(this, zs.i4);
        jj jjVar = this.P0;
        if (jjVar != null && jjVar.D == 21) {
            f0(jjVar, true);
        }
        rh.g4 g4Var = this.H0;
        if (g4Var != null) {
            g4Var.a();
        }
        sg.p0 p0Var = this.E0;
        ArrayList arrayList = p0Var.s;
        p0Var.D = true;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            ((sg.m0) arrayList.get(i11)).a();
        }
        l11 l11Var = this.n0;
        if (l11Var != null) {
            l11Var.a();
        }
        nx0 nx0Var = this.O0;
        if (nx0Var != null) {
            nx0Var.d.R(nx0Var.b);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.d2 = false;
        int i10 = this.H;
        org.telegram.messenger.b6.q(i10).v(this);
        this.I.R();
        setStarsPaused(true);
        this.C0 = false;
        org.telegram.ui.Components.o5.release(this, this.r0);
        kg.o oVar = this.s1;
        if (oVar != null) {
            org.telegram.ui.Components.o5.release((s0) oVar.i, (org.telegram.ui.Components.k5) oVar.h);
        }
        zs.f(i10).n(this, zs.W2);
        zs.f(i10).n(this, zs.X2);
        zs.f(i10).n(this, zs.F3);
        zs.f(i10).n(this, zs.y0);
        zs.f(i10).n(this, zs.a4);
        zs.e().n(this, zs.i4);
        this.d0.g();
        this.r2.a = false;
        rh.g4 g4Var = this.H0;
        if (g4Var != null) {
            g4Var.S = false;
            g4Var.d.R();
            g4Var.e.b();
            ph.l0 l0Var = g4Var.y;
            l0Var.d.R();
            org.telegram.ui.Components.o5.release((View) null, l0Var.q);
            l0Var.q = null;
        }
        this.E0.p();
        l11 l11Var = this.n0;
        if (l11Var != null) {
            l11Var.b();
        }
        nx0 nx0Var = this.O0;
        if (nx0Var != null) {
            nx0Var.d.R(null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:237:0x0df2  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0e88  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0f36  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0f71  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0fd7  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0fa3  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x0fad  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x0fa5  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x0f76  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x0f4c  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x0ed9  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0546  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x058b A[LOOP:1: B:87:0x0589->B:88:0x058b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0566  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0568  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onDraw(Canvas canvas) {
        char c10;
        int i10;
        int i11;
        TextPaint textPaint;
        ArrayList arrayList;
        int i12;
        RadialProgress2 radialProgress2;
        s0 s0Var;
        float f7;
        float L;
        int i13;
        Canvas canvas2;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        qz0 qz0Var;
        float i14;
        Paint P;
        boolean a2;
        ColorMatrix colorMatrix;
        int i15;
        float f15;
        s0 s0Var2;
        int i16;
        qz0 qz0Var2;
        q0 q0Var;
        int size;
        int i17;
        TextPaint textPaint2;
        Canvas canvas3 = canvas;
        canvas3.save();
        canvas3.translate(this.j0 / 2.0f, getPaddingTop());
        jj jjVar = this.P0;
        float d = this.q1.d(!this.o1);
        int i18 = this.h1;
        boolean S = S();
        th.t5 t5Var = this.d0;
        TextPaint textPaint3 = this.F1;
        ImageReceiver imageReceiver = this.I;
        if (!S && this.O0 == null && V(jjVar)) {
            this.h1 = this.i1 - org.telegram.messenger.i0.L(106.0f);
            if (X()) {
                i18 = O(jjVar);
                float f16 = (this.V - i18) / 2.0f;
                float L2 = org.telegram.messenger.i0.L(16.0f) + org.telegram.messenger.i0.L(4.0f) + this.S + this.O;
                if (jjVar.z4()) {
                    t5Var.d = jjVar.k.media.storyItem;
                }
                float f17 = i18;
                t5Var.F.set(f16, L2, f16 + f17, f17 + L2);
                int i19 = jjVar.D;
                if (i19 == 31 || i19 == 33 || i19 == 34 || i19 == 35) {
                    f16 += org.telegram.messenger.i0.L(10.0f);
                    L2 += org.telegram.messenger.i0.L(10.0f);
                    i18 -= org.telegram.messenger.i0.L(20.0f);
                }
                if (jjVar.D == 37) {
                    f16 += org.telegram.messenger.i0.L(2.0f);
                }
                imageReceiver.y0(f16, L2, Math.max(0, i18), Math.max(0, i18));
                int i20 = jjVar.D;
                if (i20 == 31 || i20 == 33 || i20 == 34 || i20 == 35) {
                    i18 = org.telegram.messenger.i0.L(20.0f) + i18;
                }
            } else {
                int i21 = jjVar.D;
                if (i21 == 11) {
                    int i22 = this.V;
                    float f18 = this.h1;
                    imageReceiver.y0((i22 - r3) / 2.0f, (this.i1 * 0.075f) + this.S + this.O, f18, f18);
                } else {
                    if (i21 == 25) {
                        i18 = (int) (this.h1 * (org.telegram.messenger.i0.Q1() ? 1.0f : 1.2f));
                        float f19 = i18;
                        imageReceiver.y0((this.V - i18) / 2.0f, ((this.i1 * 0.075f) + (this.S + this.O)) - org.telegram.messenger.i0.L(22.0f), f19, f19);
                    } else if (jjVar.s4()) {
                        float f20 = i18;
                        imageReceiver.y0((this.V - i18) / 2.0f, (this.i1 * 0.075f) + this.S + this.O + org.telegram.messenger.i0.L(2.0f), f20, f20);
                    } else if (jjVar.D == 30) {
                        i18 = (int) (this.h1 * 1.1f);
                        TLRPC.Message message = jjVar.k;
                        if (message == null || (message.action instanceof TLRPC.TL_messageActionStarGift)) {
                            float f21 = i18;
                            imageReceiver.y0((this.V - i18) / 2.0f, ((this.i1 * 0.075f) + (this.S + this.O)) - org.telegram.messenger.i0.L(12.0f), f21, f21);
                        } else {
                            float f22 = i18;
                            imageReceiver.y0((this.V - i18) / 2.0f, ((this.i1 * 0.075f) + (this.S + this.O)) - org.telegram.messenger.i0.L(22.0f), f22, f22);
                        }
                    } else {
                        i18 = (int) (this.h1 * 1.0f);
                        float f23 = i18;
                        imageReceiver.y0((this.V - i18) / 2.0f, ((this.i1 * 0.075f) + (this.S + this.O)) - org.telegram.messenger.i0.L(4.0f), f23, f23);
                    }
                    textPaint2 = (TextPaint) P("paintChatActionText");
                    this.s0 = textPaint2;
                    if (textPaint2 != null) {
                        TextPaint textPaint4 = this.E1;
                        if (textPaint4 != null && textPaint4.getColor() != this.s0.getColor()) {
                            textPaint4.setColor(this.s0.getColor());
                        }
                        TextPaint textPaint5 = this.G1;
                        if (textPaint5 != null && textPaint5.getColor() != this.s0.getColor()) {
                            textPaint5.setColor(this.s0.getColor());
                            textPaint5.linkColor = this.s0.getColor();
                        }
                        if (textPaint3 != null && textPaint3.getColor() != this.s0.getColor()) {
                            textPaint3.setColor(this.s0.getColor());
                            textPaint3.linkColor = this.s0.getColor();
                        }
                    }
                }
            }
            textPaint2 = (TextPaint) P("paintChatActionText");
            this.s0 = textPaint2;
            if (textPaint2 != null) {
            }
        }
        int i23 = i18;
        H(canvas3, false);
        if (T()) {
            canvas3.save();
            int width = getWidth();
            this.I0.getClass();
            float h = (width - org.telegram.ui.Wallet.d4.h()) / 2.0f;
            this.K0 = h;
            float walletActionTop = getWalletActionTop();
            this.L0 = walletActionTop;
            canvas3.translate(h, walletActionTop);
            this.I0.o((this.j0 / 2.0f) + this.K0, this.L0 + getPaddingTop());
            this.I0.d(canvas3);
            canvas3.restore();
        }
        boolean S2 = S();
        RadialProgress2 radialProgress22 = this.J1;
        if (S2) {
            canvas3.save();
            float width2 = (getWidth() - this.H0.d()) / 2.0f;
            this.F0 = width2;
            float L3 = this.H0.p ? org.telegram.messenger.i0.L(4.0f) : org.telegram.messenger.i0.L(16.0f) + this.S + this.O;
            this.G0 = L3;
            canvas3.translate(width2, L3);
            this.H0.b(canvas3);
            q0 q0Var2 = this.f1;
            if (q0Var2 == null || q0Var2.f()) {
                this.H0.c(canvas3);
            }
            canvas3.restore();
        } else if (this.O0 != null) {
            canvas3.save();
            this.O0.a(canvas3);
            canvas3.restore();
        } else if (V(jjVar) || (jjVar != null && jjVar.D == 11)) {
            ph.z0 z0Var = this.S0;
            if (z0Var != null && ((i11 = jjVar.D) == 31 || i11 == 37 || i11 == 33)) {
                z0Var.setBounds((int) (imageReceiver.x() - org.telegram.messenger.i0.L(13.33f)), (int) (imageReceiver.z() - org.telegram.messenger.i0.L(14.0f)), (int) (imageReceiver.w() + imageReceiver.x() + org.telegram.messenger.i0.L(13.33f)), (int) (imageReceiver.v() + imageReceiver.z() + org.telegram.messenger.i0.L(14.0f)));
                this.S0.draw(canvas3);
            }
            if (this.J != null) {
                canvas3.save();
                canvas3.translate(imageReceiver.x(), imageReceiver.z());
                Path path = this.K;
                if (path == null) {
                    this.K = new Path();
                } else {
                    path.rewind();
                }
                this.K.addCircle(imageReceiver.w() / 2.0f, imageReceiver.v() / 2.0f, imageReceiver.w() / 2.0f, Path.Direction.CW);
                canvas3.clipPath(this.K);
                this.J.setBounds(0, 0, (int) imageReceiver.w(), (int) imageReceiver.v());
                this.J.draw(canvas3);
                canvas3.restore();
            } else if (jjVar.z4()) {
                TLRPC.MessageMedia messageMedia = jjVar.k.media;
                long j10 = messageMedia.user_id;
                t5Var.c = messageMedia.id;
                th.w5.h(j10, canvas3, imageReceiver, t5Var);
            } else {
                imageReceiver.g(canvas3);
            }
            c10 = '%';
            if (jjVar.D == 37) {
                rf.o.a(canvas3, org.telegram.ui.ActionBar.t6.S0, imageReceiver.x() + org.telegram.messenger.i0.L(26.0f), imageReceiver.z() + org.telegram.messenger.i0.L(26.0f), org.telegram.messenger.i0.L(52.0f));
            }
            radialProgress22.a.set(imageReceiver.x(), imageReceiver.z(), imageReceiver.w() + imageReceiver.x(), imageReceiver.v() + imageReceiver.z());
            int i24 = jjVar.D;
            if (i24 == 21) {
                b40 b40Var = (b40) vp.r1(this.H).C7.get(jjVar.k.local_id);
                if (b40Var != null) {
                    radialProgress22.p(true, b40Var.W);
                    radialProgress22.setCircleRadius(((int) (imageReceiver.w() * 0.5f)) + 1);
                    radialProgress22.G = org.telegram.messenger.i0.L(24.0f);
                    radialProgress22.g(org.telegram.ui.ActionBar.t6.Ze, org.telegram.ui.ActionBar.t6.af, org.telegram.ui.ActionBar.t6.bf, org.telegram.ui.ActionBar.t6.cf);
                    if (b40Var.W == 1.0f) {
                        radialProgress22.setIcon(4, true, true);
                    } else {
                        radialProgress22.setIcon(3, true, true);
                    }
                }
                radialProgress22.draw(canvas3);
                i10 = 22;
            } else {
                i10 = 22;
                if (i24 == 22) {
                    float Q = Q(jjVar);
                    radialProgress22.p(true, Q);
                    radialProgress22.setCircleRadius(org.telegram.messenger.i0.L(26.0f));
                    radialProgress22.G = org.telegram.messenger.i0.L(24.0f);
                    radialProgress22.g(org.telegram.ui.ActionBar.t6.Ze, org.telegram.ui.ActionBar.t6.af, org.telegram.ui.ActionBar.t6.bf, org.telegram.ui.ActionBar.t6.cf);
                    if (Q == 1.0f) {
                        radialProgress22.setIcon(4, true, true);
                    } else {
                        radialProgress22.setIcon(3, true, true);
                    }
                    radialProgress22.draw(canvas3);
                }
            }
            textPaint = this.s0;
            arrayList = this.p0;
            if (textPaint != null || this.M == null) {
                i12 = i10;
                radialProgress2 = radialProgress22;
            } else {
                canvas3.save();
                canvas3.translate(this.T, this.S);
                if (this.M.getPaint() != this.s0) {
                    x();
                }
                canvas3.save();
                nh.i.d(canvas3, arrayList);
                nh.i.f(canvas3, this.M);
                q0 q0Var3 = this.f1;
                if (q0Var3 == null || q0Var3.f()) {
                    int i25 = i10;
                    StaticLayout staticLayout = this.M;
                    radialProgress2 = radialProgress22;
                    i12 = i25;
                    org.telegram.ui.Components.o5.drawAnimatedEmojis(canvas, staticLayout, this.r0, 0.0f, arrayList, 0.0f, 0.0f, 0.0f, 1.0f, staticLayout == null ? null : N(staticLayout.getPaint().getColor()));
                    canvas3 = canvas;
                } else {
                    i12 = i10;
                    radialProgress2 = radialProgress22;
                }
                canvas3.restore();
                int size2 = arrayList.size();
                int i26 = 0;
                while (i26 < size2) {
                    Object obj = arrayList.get(i26);
                    i26++;
                    nh.i iVar = (nh.i) obj;
                    iVar.h(this.M.getPaint().getColor());
                    iVar.draw(canvas3);
                }
                canvas3.restore();
            }
            if (this.s0 != null && this.P != null) {
                canvas3.save();
                canvas3.translate(this.U, this.S - this.Q);
                if (this.P.getPaint() != this.s0) {
                    x();
                }
                canvas3.save();
                nh.i.d(canvas3, arrayList);
                nh.i.f(canvas3, this.P);
                q0Var = this.f1;
                if (q0Var != null || q0Var.f()) {
                    StaticLayout staticLayout2 = this.P;
                    org.telegram.ui.Components.k5 k5Var = this.r0;
                    StaticLayout staticLayout3 = this.M;
                    org.telegram.ui.Components.o5.drawAnimatedEmojis(canvas, staticLayout2, k5Var, 0.0f, arrayList, 0.0f, 0.0f, 0.0f, 1.0f, staticLayout3 != null ? null : N(staticLayout3.getPaint().getColor()));
                    canvas3 = canvas;
                }
                canvas3.restore();
                size = arrayList.size();
                i17 = 0;
                while (i17 < size) {
                    Object obj2 = arrayList.get(i17);
                    i17++;
                    nh.i iVar2 = (nh.i) obj2;
                    iVar2.h(this.P.getPaint().getColor());
                    iVar2.draw(canvas3);
                }
                canvas3.restore();
            }
            if (S() && V(jjVar)) {
                canvas3.save();
                float f24 = (this.V - this.i1) / 2.0f;
                if (jjVar.D != i12) {
                    f24 += org.telegram.messenger.i0.L(8.0f);
                }
                float f25 = f24;
                if (X()) {
                    RectF rectF = this.M1;
                    f7 = (rectF != null ? rectF.top : org.telegram.messenger.i0.L(4.0f) + this.S + this.O) + (i23 > 0 ? org.telegram.messenger.m5.D(16.0f, 2, i23) : org.telegram.messenger.i0.L(16.0f));
                } else {
                    float f26 = (this.i1 * 0.075f) + this.S + this.O;
                    if (jjVar.D != 21) {
                        i23 = this.h1;
                    }
                    float L4 = f26 + i23 + org.telegram.messenger.i0.L(4.0f);
                    if (jjVar.D == 21) {
                        L4 += org.telegram.messenger.i0.L(16.0f);
                    }
                    f7 = L4;
                    if (jjVar.s4()) {
                        f7 += org.telegram.messenger.i0.L(12.0f);
                    } else if (jjVar.D == 30 && !jjVar.s4()) {
                        f7 -= org.telegram.messenger.i0.L(3.66f);
                    }
                }
                int i27 = jjVar.D;
                if (i27 == 31 || i27 == 37 || i27 == 33) {
                    f7 -= org.telegram.messenger.i0.L(3.66f);
                }
                canvas3.translate(f25, f7);
                if (this.j1 != null) {
                    canvas3.save();
                    canvas3.translate(((this.i1 - org.telegram.messenger.i0.L(16.0f)) - this.j1.getWidth()) / 2.0f, 0.0f);
                    this.j1.draw(canvas3);
                    canvas3.restore();
                    float height = this.j1.getHeight() + f7;
                    if (this.m1 != null) {
                        canvas3.save();
                        canvas3.translate(((this.i1 - org.telegram.messenger.i0.L(16.0f)) - this.m1.getWidth()) / 2.0f, org.telegram.messenger.i0.L(4.0f) + this.j1.getHeight());
                        this.m1.draw(canvas3);
                        canvas3.restore();
                        height += org.telegram.messenger.i0.L(10.0f) + this.m1.getHeight();
                    }
                    L = height + org.telegram.messenger.i0.L(jjVar.D == 25 ? 6.0f : 0.0f);
                } else {
                    L = f7 - org.telegram.messenger.i0.L(4.0f);
                }
                float f27 = L;
                canvas3.restore();
                StaticLayout staticLayout4 = this.j1;
                int i28 = TLObject.FLAG_28;
                if (staticLayout4 == null || (qz0Var2 = this.l1) == null) {
                    i13 = 33;
                    canvas2 = canvas3;
                    f10 = 0.0f;
                } else {
                    float k10 = qz0Var2.k() + org.telegram.messenger.i0.L(12.0f);
                    float B = c3.i0.B(this.i1 - org.telegram.messenger.i0.L(16.0f), k10, 2.0f, f25);
                    float height2 = f7 + this.j1.getHeight() + org.telegram.messenger.i0.L(14.0f);
                    if (this.k1 == null) {
                        this.k1 = new Paint(1);
                    }
                    this.k1.setColor(org.telegram.ui.ActionBar.t6.j1() ? 285212671 : 268435456);
                    RectF rectF2 = org.telegram.messenger.i0.P;
                    rectF2.set(B, height2 - org.telegram.messenger.i0.L(8.0f), k10 + B, org.telegram.messenger.i0.L(8.0f) + height2);
                    canvas3.drawRoundRect(rectF2, org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f), this.k1);
                    Canvas canvas4 = canvas3;
                    f10 = 0.0f;
                    i13 = 33;
                    this.l1.c(B + org.telegram.messenger.i0.L(6.0f), height2, 1.0f, -855638017, canvas4);
                    canvas2 = canvas4;
                    f27 += org.telegram.messenger.i0.L(24.0f);
                }
                float L5 = f27 + org.telegram.messenger.i0.L(4.0f);
                if (jjVar.D == 18) {
                    L5 += org.telegram.messenger.i0.L(2.0f);
                }
                float f28 = L5;
                canvas2.save();
                canvas2.translate(f25, f28);
                if (jjVar.D == i12) {
                    RadialProgress2 radialProgress23 = radialProgress2;
                    if ((radialProgress23.c ? radialProgress23.j : radialProgress23.i).b() == 1.0f) {
                        i15 = 4;
                        if (radialProgress23.a() == 4) {
                            if (this.s1 != null) {
                                canvas2.save();
                                canvas2.translate((this.i1 - ((StaticLayout) this.s1.f).getWidth()) / 2.0f, f10);
                                this.s1.a = ((this.i1 - ((StaticLayout) r3.f).getWidth()) / 2.0f) + f25;
                                this.s1.b = f28;
                                int color = textPaint3.getColor();
                                kg.o oVar = this.s1;
                                f15 = f25;
                                f13 = f10;
                                f14 = 8.0f;
                                f11 = 0.2f;
                                nh.i.g(this, false, color, 0, (AtomicReference) oVar.g, 1, (StaticLayout) oVar.f, oVar.e, canvas, false);
                                kg.o oVar2 = this.s1;
                                org.telegram.ui.Components.o5.drawAnimatedEmojis(canvas, (StaticLayout) oVar2.f, (org.telegram.ui.Components.k5) oVar2.h, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f, N(textPaint3.getColor()));
                                canvas3 = canvas;
                                canvas3.restore();
                                s0Var = this;
                                f12 = f15;
                            } else {
                                f11 = 0.2f;
                                f13 = f10;
                                f14 = 8.0f;
                                s0Var = this;
                                canvas3 = canvas2;
                                f12 = f25;
                            }
                        }
                    } else {
                        i15 = 4;
                    }
                    f11 = 0.2f;
                    f15 = f25;
                    f13 = f10;
                    f14 = 8.0f;
                    int i29 = i13;
                    canvas3 = canvas2;
                    if (this.A1 == null) {
                        TextPaint textPaint6 = new TextPaint();
                        this.z1 = textPaint6;
                        textPaint6.setTextSize(org.telegram.messenger.i0.L(13.0f));
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(cd.K0(2131754558));
                        int indexOf = spannableStringBuilder.toString().indexOf("...");
                        if (indexOf < 0) {
                            indexOf = spannableStringBuilder.toString().indexOf("…");
                            i16 = 1;
                        } else {
                            i16 = 3;
                        }
                        if (indexOf >= 0) {
                            SpannableString spannableString = new SpannableString("…");
                            th.u7 u7Var = new th.u7();
                            u7Var.r = true;
                            u7Var.b(this);
                            spannableString.setSpan(u7Var, 0, spannableString.length(), i29);
                            spannableStringBuilder.replace(indexOf, indexOf + i16, (CharSequence) spannableString);
                        }
                        TextPaint textPaint7 = this.z1;
                        kg.o oVar3 = this.s1;
                        this.A1 = new StaticLayout(spannableStringBuilder, textPaint7, oVar3 == null ? 1 : oVar3.c, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                    }
                    float Q2 = Q(jjVar);
                    if (this.C1 == null || this.B1 != Q2) {
                        this.B1 = Q2;
                        String p5 = a1.g.p(new StringBuilder(), (int) (Q2 * 100.0f), "%");
                        kg.o oVar4 = this.s1;
                        this.C1 = new StaticLayout(p5, textPaint3, oVar4 == null ? 1 : oVar4.c, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                    }
                    this.z1.setColor(textPaint3.getColor());
                    if (radialProgress23.a() == i15) {
                        float b10 = (radialProgress23.c ? radialProgress23.j : radialProgress23.i).b();
                        int color2 = textPaint3.getColor();
                        float f29 = 1.0f - b10;
                        this.z1.setAlpha((int) (Color.alpha(color2) * f29));
                        textPaint3.setAlpha((int) (Color.alpha(color2) * b10));
                        textPaint3.linkColor = textPaint3.getColor();
                        if (this.s1 != null) {
                            float f30 = (b10 * 0.2f) + 0.8f;
                            canvas3.save();
                            canvas3.scale(f30, f30, this.i1 / 2.0f, ((StaticLayout) this.s1.f).getHeight() / 2.0f);
                            canvas3.translate((this.i1 - ((StaticLayout) this.s1.f).getWidth()) / 2.0f, f13);
                            this.s1.a = ((this.i1 - ((StaticLayout) r1.f).getWidth()) / 2.0f) + f15;
                            this.s1.b = f28;
                            int color3 = textPaint3.getColor();
                            kg.o oVar5 = this.s1;
                            nh.i.g(this, false, color3, 0, (AtomicReference) oVar5.g, 1, (StaticLayout) oVar5.f, oVar5.e, canvas3, false);
                            kg.o oVar6 = this.s1;
                            s0Var2 = this;
                            org.telegram.ui.Components.o5.drawAnimatedEmojis(canvas, (StaticLayout) oVar6.f, (org.telegram.ui.Components.k5) oVar6.h, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f, N(textPaint3.getColor()));
                            canvas3 = canvas;
                            canvas3.restore();
                        } else {
                            s0Var2 = this;
                        }
                        textPaint3.setAlpha((int) (Color.alpha(color2) * f29));
                        textPaint3.linkColor = textPaint3.getColor();
                        float f31 = (f29 * 0.2f) + 0.8f;
                        canvas3.save();
                        canvas3.scale(f31, f31, s0Var2.i1 / 2.0f, s0Var2.A1.getHeight() / 2.0f);
                        canvas3.translate((s0Var2.i1 - s0Var2.A1.getWidth()) / 2.0f, f13);
                        nh.i.f(canvas3, s0Var2.A1);
                        canvas3.restore();
                        canvas3.save();
                        canvas3.translate(f13, org.telegram.messenger.i0.L(4.0f) + s0Var2.A1.getHeight());
                        canvas3.scale(f31, f31, s0Var2.i1 / 2.0f, s0Var2.C1.getHeight() / 2.0f);
                        canvas3.translate((s0Var2.i1 - s0Var2.C1.getWidth()) / 2.0f, f13);
                        nh.i.f(canvas3, s0Var2.C1);
                        canvas3.restore();
                        textPaint3.setColor(color2);
                        textPaint3.linkColor = color2;
                    } else {
                        s0Var2 = this;
                        canvas3.save();
                        canvas3.translate((s0Var2.i1 - s0Var2.A1.getWidth()) / 2.0f, f13);
                        s0Var2.A1.draw(canvas3);
                        canvas3.restore();
                        canvas3.save();
                        canvas3.translate((s0Var2.i1 - s0Var2.C1.getWidth()) / 2.0f, org.telegram.messenger.i0.L(4.0f) + s0Var2.A1.getHeight());
                        nh.i.f(canvas3, s0Var2.C1);
                        canvas3.restore();
                    }
                    s0Var = s0Var2;
                    f12 = f15;
                } else {
                    f11 = 0.2f;
                    f12 = f25;
                    f13 = f10;
                    f14 = 8.0f;
                    canvas3 = canvas2;
                    kg.o oVar7 = this.s1;
                    if (oVar7 != null) {
                        float height3 = ((StaticLayout) oVar7.f).getHeight();
                        if (d < 1.0f) {
                            height3 = org.telegram.messenger.i0.T1(this.p1, height3, d);
                            RectF rectF3 = org.telegram.messenger.i0.P;
                            rectF3.set(f13, -org.telegram.messenger.i0.L(20.0f), getWidth(), height3);
                            canvas3.saveLayerAlpha(rectF3, zs.e4, 31);
                        } else {
                            canvas3.save();
                        }
                        canvas3.translate(((this.i1 - org.telegram.messenger.i0.L(16.0f)) - ((StaticLayout) this.s1.f).getWidth()) / 2.0f, f13);
                        this.s1.a = (((this.i1 - org.telegram.messenger.i0.L(16.0f)) - ((StaticLayout) this.s1.f).getWidth()) / 2.0f) + f12;
                        kg.o oVar8 = this.s1;
                        oVar8.b = f28;
                        int color4 = oVar8.d.getColor();
                        kg.o oVar9 = this.s1;
                        float f32 = height3;
                        nh.i.g(this, false, color4, 0, (AtomicReference) oVar9.g, 1, (StaticLayout) oVar9.f, oVar9.e, canvas3, false);
                        kg.o oVar10 = this.s1;
                        StaticLayout staticLayout5 = (StaticLayout) oVar10.f;
                        org.telegram.ui.Components.k5 k5Var2 = (org.telegram.ui.Components.k5) oVar10.h;
                        ColorFilter N = N(textPaint3.getColor());
                        s0Var = this;
                        org.telegram.ui.Components.o5.drawAnimatedEmojis(canvas, staticLayout5, k5Var2, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f, N);
                        canvas3 = canvas;
                        if (d < 1.0f && s0Var.w1 != null) {
                            canvas3.save();
                            if (s0Var.r1 == null) {
                                s0Var.r1 = new li.k(23);
                            }
                            canvas3.translate((-((s0Var.i1 - org.telegram.messenger.i0.L(16.0f)) - ((StaticLayout) s0Var.s1.f).getWidth())) / 2.0f, f13);
                            RectF rectF4 = org.telegram.messenger.i0.P;
                            rectF4.set((s0Var.t1 - s0Var.w1.g()) + org.telegram.messenger.i0.L(8.0f), (s0Var.u1 - s0Var.v1) - org.telegram.messenger.i0.L(6.0f), org.telegram.messenger.i0.L(6.0f) + s0Var.t1, s0Var.u1);
                            float f33 = 1.0f - d;
                            s0Var.r1.l(canvas3, rectF4, f33);
                            rectF4.set((s0Var.t1 - s0Var.w1.g()) - org.telegram.messenger.i0.L(16.0f), (s0Var.u1 - s0Var.v1) - org.telegram.messenger.i0.L(6.0f), (s0Var.t1 - s0Var.w1.g()) + org.telegram.messenger.i0.L(8.0f), s0Var.u1);
                            s0Var.r1.o(canvas3, rectF4, 2, f33);
                            rectF4.set(f13, f32 - org.telegram.messenger.i0.L(12.0f), s0Var.getWidth(), f32);
                            s0Var.r1.o(canvas3, rectF4, 3, (1.0f - f33) * f33 * 4.0f);
                            canvas3.restore();
                        }
                        canvas3.restore();
                        if (d < 1.0f && (qz0Var = s0Var.w1) != null) {
                            qz0Var.c((s0Var.t1 - qz0Var.g()) + org.telegram.messenger.i0.L(5.0f), (s0Var.u1 - (s0Var.v1 / 2.0f)) - org.telegram.messenger.i0.L(1.0f), 1.0f - d, s0Var.s1.d.getColor(), canvas3);
                        }
                    } else {
                        s0Var = this;
                    }
                }
                canvas3.restore();
                if (s0Var.j1 == null) {
                    org.telegram.messenger.i0.L(f14);
                }
                kg.o oVar11 = s0Var.s1;
                if (oVar11 != null) {
                    ((StaticLayout) oVar11.f).getHeight();
                }
                StaticLayout staticLayout6 = s0Var.x1;
                if (staticLayout6 != null) {
                    staticLayout6.getHeight();
                }
                s0Var.getHeight();
                org.telegram.messenger.i0.L(f14);
                org.telegram.ui.ActionBar.p6 p6Var = s0Var.g1;
                if (p6Var != null) {
                    p6Var.b(s0Var.u0, s0Var.t0 + org.telegram.messenger.i0.L(4.0f), s0Var.getMeasuredWidth(), s0Var.v0);
                } else {
                    org.telegram.ui.ActionBar.t6.r(s0Var.u0, s0Var.t0 + org.telegram.messenger.i0.L(4.0f), s0Var.getMeasuredWidth(), s0Var.v0);
                }
                float a10 = s0Var.n.a(0.02f);
                canvas3.save();
                RectF rectF5 = s0Var.o0;
                canvas3.scale(a10, a10, rectF5.centerX(), rectF5.centerY());
                if (s0Var.x1 != null) {
                    canvas3.drawRoundRect(rectF5, org.telegram.messenger.i0.L(15.0f), org.telegram.messenger.i0.L(15.0f), s0Var.P("paintChatActionBackgroundSelected"));
                    if (s0Var.R()) {
                        canvas3.drawRoundRect(rectF5, org.telegram.messenger.i0.L(15.0f), org.telegram.messenger.i0.L(15.0f), s0Var.P("paintChatActionBackgroundDarken"));
                    }
                    float f34 = s0Var.b2;
                    Paint paint = s0Var.c2;
                    if (f34 > f13) {
                        canvas3.drawRoundRect(rectF5, org.telegram.messenger.i0.L(15.0f), org.telegram.messenger.i0.L(15.0f), paint);
                    }
                    if (s0Var.getMessageObject().D == 31 || s0Var.getMessageObject().D == 37 || s0Var.getMessageObject().D == 33) {
                        boolean a11 = p6Var != null ? p6Var.a() : org.telegram.ui.ActionBar.t6.j1();
                        int color5 = paint.getColor();
                        if (a11) {
                            i28 = 620756991;
                        }
                        paint.setColor(i28);
                        canvas3.drawRoundRect(rectF5, org.telegram.messenger.i0.L(15.0f), org.telegram.messenger.i0.L(15.0f), paint);
                        paint.setColor(color5);
                    }
                    if (s0Var.getMessageObject().D == 31 || s0Var.getMessageObject().D == 37 || s0Var.getMessageObject().D == 33 || s0Var.getMessageObject().D == 21 || s0Var.getMessageObject().D == 22 || s0Var.getMessageObject().D == 24) {
                        s0Var.invalidate();
                    } else {
                        Path path2 = s0Var.U1;
                        path2.rewind();
                        path2.addRoundRect(rectF5, org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(16.0f), Path.Direction.CW);
                        canvas3.save();
                        canvas3.clipPath(path2);
                        kg.f2 f2Var = s0Var.V1;
                        f2Var.d(canvas3);
                        if (!f2Var.g) {
                            s0Var.invalidate();
                        }
                        canvas3.restore();
                    }
                }
                boolean z10 = jjVar.q;
                if (z10) {
                    float f35 = s0Var.c0;
                    if (f35 != 1.0f) {
                        s0Var.c0 = f35 + 0.10666667f;
                        i14 = Utilities.i(s0Var.c0, 1.0f, f13);
                        s0Var.c0 = i14;
                        if (i14 != f13) {
                            if (s0Var.b0 == null) {
                                s0Var.b0 = new RadialProgressView(s0Var.getContext());
                            }
                            int L6 = org.telegram.messenger.i0.L(16.0f);
                            canvas3.save();
                            float f36 = s0Var.c0;
                            canvas3.scale(f36, f36, rectF5.centerX(), rectF5.centerY());
                            s0Var.b0.setSize(L6);
                            s0Var.b0.setProgressColor(org.telegram.ui.ActionBar.t6.v0(org.telegram.ui.ActionBar.t6.Wc));
                            s0Var.b0.a(canvas3, rectF5.centerX(), rectF5.centerY());
                            canvas3.restore();
                        }
                        if (s0Var.c0 != 1.0f && s0Var.x1 != null) {
                            canvas3.save();
                            float f37 = 1.0f - s0Var.c0;
                            canvas3.scale(f37, f37, rectF5.centerX(), rectF5.centerY());
                            canvas3.translate(f12, rectF5.top + org.telegram.messenger.i0.L(7.0f));
                            canvas3.translate(((s0Var.i1 - org.telegram.messenger.i0.L(16.0f)) - s0Var.x1.getWidth()) / 2.0f, f13);
                            s0Var.x1.draw(canvas3);
                            canvas3.restore();
                        }
                        if (jjVar.r) {
                            t80 t80Var = s0Var.r;
                            if (t80Var != null) {
                                t80Var.e(rectF5);
                                s0Var.r.k(16.0f);
                                s0Var.r.a();
                                s0Var.r.draw(canvas3);
                                if (s0Var.r.c()) {
                                    s0Var.r.b = -1L;
                                }
                            }
                        } else {
                            if (s0Var.r == null) {
                                t80 t80Var2 = new t80(p6Var);
                                s0Var.r = t80Var2;
                                t80Var2.h();
                                t80 t80Var3 = s0Var.r;
                                t80Var3.D = true;
                                float f38 = f11;
                                t80Var3.g(org.telegram.ui.ActionBar.t6.r1(0.08f, -1), org.telegram.ui.ActionBar.t6.r1(f38, -1), org.telegram.ui.ActionBar.t6.r1(f38, -1), org.telegram.ui.ActionBar.t6.r1(0.7f, -1));
                                s0Var.r.x.setStrokeWidth(org.telegram.messenger.i0.L(1.0f));
                            }
                            t80 t80Var4 = s0Var.r;
                            t80Var4.c = -1L;
                            t80Var4.e(rectF5);
                            s0Var.r.k(16.0f);
                            s0Var.r.draw(canvas3);
                        }
                        canvas3.restore();
                        if (s0Var.M1 != null && s0Var.R1 != null && s0Var.S1 != null) {
                            P = s0Var.P("paintChatActionBackground");
                            Paint P2 = s0Var.P("paintChatActionBackgroundDarken");
                            float L7 = (s0Var.M1.right - org.telegram.messenger.i0.L(65.0f)) + org.telegram.messenger.i0.L(2.0f);
                            float L8 = s0Var.M1.top - org.telegram.messenger.i0.L(2.0f);
                            if (p6Var == null) {
                                p6Var.b(s0Var.u0 + L7, s0Var.t0 + org.telegram.messenger.i0.L(4.0f) + L8, s0Var.getMeasuredWidth(), s0Var.v0);
                            } else {
                                org.telegram.ui.ActionBar.t6.r(s0Var.u0 + L7, s0Var.t0 + org.telegram.messenger.i0.L(4.0f) + L8, s0Var.getMeasuredWidth(), s0Var.v0);
                            }
                            canvas3.save();
                            canvas3.translate(L7, L8);
                            ColorFilter colorFilter = P.getColorFilter();
                            PathEffect pathEffect = P.getPathEffect();
                            a2 = p6Var == null ? p6Var.a() : org.telegram.ui.ActionBar.t6.j1();
                            if (s0Var.P1 != null || s0Var.O1 != a2) {
                                colorMatrix = new ColorMatrix();
                                if ((P.getColorFilter() instanceof ColorMatrixColorFilter) && Build.VERSION.SDK_INT >= 26) {
                                    ((ColorMatrixColorFilter) P.getColorFilter()).getColorMatrix(colorMatrix);
                                }
                                org.telegram.messenger.i0.h(colorMatrix, !a2 ? 0.1f : -0.08f);
                                org.telegram.messenger.i0.i(colorMatrix, a2 ? 0.15f : 0.1f);
                                s0Var.P1 = new ColorMatrixColorFilter(colorMatrix);
                                s0Var.O1 = a2;
                            }
                            P.setColorFilter(s0Var.P1);
                            P.setPathEffect(s0Var.Q1);
                            canvas3.drawPath(s0Var.R1, P);
                            P.setColorFilter(colorFilter);
                            P.setPathEffect(pathEffect);
                            if (s0Var.R()) {
                                PathEffect pathEffect2 = P2.getPathEffect();
                                P2.setPathEffect(s0Var.Q1);
                                canvas3.drawPath(s0Var.R1, P2);
                                P2.setPathEffect(pathEffect2);
                            }
                            canvas3.rotate(45.0f, org.telegram.messenger.i0.L(40.43f), org.telegram.messenger.i0.L(24.56f));
                            s0Var.S1.c(org.telegram.messenger.i0.L(40.43f) - (s0Var.S1.g() / 2.0f), org.telegram.messenger.i0.L(26.0f), 1.0f, -1, canvas3);
                            canvas3.restore();
                        }
                    }
                }
                if (!z10) {
                    float f39 = s0Var.c0;
                    if (f39 != f13) {
                        s0Var.c0 = f39 - 0.10666667f;
                    }
                }
                i14 = Utilities.i(s0Var.c0, 1.0f, f13);
                s0Var.c0 = i14;
                if (i14 != f13) {
                }
                if (s0Var.c0 != 1.0f) {
                    canvas3.save();
                    float f372 = 1.0f - s0Var.c0;
                    canvas3.scale(f372, f372, rectF5.centerX(), rectF5.centerY());
                    canvas3.translate(f12, rectF5.top + org.telegram.messenger.i0.L(7.0f));
                    canvas3.translate(((s0Var.i1 - org.telegram.messenger.i0.L(16.0f)) - s0Var.x1.getWidth()) / 2.0f, f13);
                    s0Var.x1.draw(canvas3);
                    canvas3.restore();
                }
                if (jjVar.r) {
                }
                canvas3.restore();
                if (s0Var.M1 != null) {
                    P = s0Var.P("paintChatActionBackground");
                    Paint P22 = s0Var.P("paintChatActionBackgroundDarken");
                    float L72 = (s0Var.M1.right - org.telegram.messenger.i0.L(65.0f)) + org.telegram.messenger.i0.L(2.0f);
                    float L82 = s0Var.M1.top - org.telegram.messenger.i0.L(2.0f);
                    if (p6Var == null) {
                    }
                    canvas3.save();
                    canvas3.translate(L72, L82);
                    ColorFilter colorFilter2 = P.getColorFilter();
                    PathEffect pathEffect3 = P.getPathEffect();
                    if (p6Var == null) {
                    }
                    if (s0Var.P1 != null) {
                    }
                    colorMatrix = new ColorMatrix();
                    if (P.getColorFilter() instanceof ColorMatrixColorFilter) {
                        ((ColorMatrixColorFilter) P.getColorFilter()).getColorMatrix(colorMatrix);
                    }
                    org.telegram.messenger.i0.h(colorMatrix, !a2 ? 0.1f : -0.08f);
                    org.telegram.messenger.i0.i(colorMatrix, a2 ? 0.15f : 0.1f);
                    s0Var.P1 = new ColorMatrixColorFilter(colorMatrix);
                    s0Var.O1 = a2;
                    P.setColorFilter(s0Var.P1);
                    P.setPathEffect(s0Var.Q1);
                    canvas3.drawPath(s0Var.R1, P);
                    P.setColorFilter(colorFilter2);
                    P.setPathEffect(pathEffect3);
                    if (s0Var.R()) {
                    }
                    canvas3.rotate(45.0f, org.telegram.messenger.i0.L(40.43f), org.telegram.messenger.i0.L(24.56f));
                    s0Var.S1.c(org.telegram.messenger.i0.L(40.43f) - (s0Var.S1.g() / 2.0f), org.telegram.messenger.i0.L(26.0f), 1.0f, -1, canvas3);
                    canvas3.restore();
                }
            } else {
                s0Var = this;
            }
            s0Var.J(canvas3, false);
            s0Var.r2.a();
            canvas3.restore();
        }
        i10 = 22;
        c10 = '%';
        textPaint = this.s0;
        arrayList = this.p0;
        if (textPaint != null) {
        }
        i12 = i10;
        radialProgress2 = radialProgress22;
        if (this.s0 != null) {
            canvas3.save();
            canvas3.translate(this.U, this.S - this.Q);
            if (this.P.getPaint() != this.s0) {
            }
            canvas3.save();
            nh.i.d(canvas3, arrayList);
            nh.i.f(canvas3, this.P);
            q0Var = this.f1;
            if (q0Var != null) {
            }
            StaticLayout staticLayout22 = this.P;
            org.telegram.ui.Components.k5 k5Var3 = this.r0;
            StaticLayout staticLayout32 = this.M;
            org.telegram.ui.Components.o5.drawAnimatedEmojis(canvas, staticLayout22, k5Var3, 0.0f, arrayList, 0.0f, 0.0f, 0.0f, 1.0f, staticLayout32 != null ? null : N(staticLayout32.getPaint().getColor()));
            canvas3 = canvas;
            canvas3.restore();
            size = arrayList.size();
            i17 = 0;
            while (i17 < size) {
            }
            canvas3.restore();
        }
        if (S()) {
        }
        s0Var = this;
        s0Var.J(canvas3, false);
        s0Var.r2.a();
        canvas3.restore();
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        jj jjVar = this.P0;
        if (TextUtils.isEmpty(this.R0) && jjVar == null) {
            return;
        }
        if (this.m2 == null) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(!TextUtils.isEmpty(this.R0) ? this.R0 : jjVar.v);
            for (CharacterStyle characterStyle : (CharacterStyle[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), ClickableSpan.class)) {
                int spanStart = spannableStringBuilder.getSpanStart(characterStyle);
                int spanEnd = spannableStringBuilder.getSpanEnd(characterStyle);
                spannableStringBuilder.removeSpan(characterStyle);
                spannableStringBuilder.setSpan(new h(1, this, characterStyle), spanStart, spanEnd, 33);
            }
            this.m2 = spannableStringBuilder;
        }
        if (Build.VERSION.SDK_INT < 24) {
            accessibilityNodeInfo.setContentDescription(this.m2.toString());
        } else {
            accessibilityNodeInfo.setText(this.m2);
        }
        accessibilityNodeInfo.setEnabled(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        RectF rectF = this.o0;
        this.T1.layout((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        org.telegram.ui.Wallet.d4 d4Var = this.I0;
        org.telegram.ui.Wallet.c4 c4Var = d4Var == null ? null : d4Var.m;
        if (c4Var != null) {
            c4Var.layout(0, 0, org.telegram.messenger.i0.L(42.0f), org.telegram.messenger.i0.L(42.0f));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0360  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x036d  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0389  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0425  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0430  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x03de  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0541  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0557  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0561  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0201  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i10, int i11) {
        float f7;
        float f10;
        int i12;
        boolean S;
        sg.p0 p0Var;
        float f11;
        boolean z10;
        float f12;
        float f13;
        float L;
        float L2;
        StaticLayout staticLayout;
        float f14;
        TLRPC.Message message;
        int measuredWidth;
        int i13;
        int L3;
        int i14;
        int L4;
        int i15;
        org.telegram.ui.Wallet.d4 d4Var = this.I0;
        org.telegram.ui.Wallet.c4 c4Var = d4Var == null ? null : d4Var.m;
        if (c4Var != null) {
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(42.0f), TLObject.FLAG_30);
            c4Var.measure(makeMeasureSpec, makeMeasureSpec);
        }
        jj jjVar = this.P0;
        if (jjVar == null && this.R0 == null) {
            setMeasuredDimension(View.MeasureSpec.getSize(i10), org.telegram.messenger.i0.L(14.0f) + this.l0 + this.O);
            return;
        }
        if (V(jjVar)) {
            this.i1 = z20.C(64.0f, (org.telegram.messenger.i0.q.y - org.telegram.ui.ActionBar.l.getCurrentActionBarHeight()) - org.telegram.messenger.i0.m, (int) (org.telegram.messenger.i0.Q1() ? org.telegram.messenger.i0.Q0() * 0.6f : (org.telegram.messenger.i0.q.x * 0.62f) - org.telegram.messenger.i0.L(34.0f)));
            if ((!org.telegram.messenger.i0.Q1() && ((i15 = jjVar.D) == 18 || i15 == 30 || W())) || jjVar.D == 35) {
                this.i1 = (int) (this.i1 * 1.2f);
            }
            this.h1 = this.i1 - org.telegram.messenger.i0.L(106.0f);
            if (jjVar.D == 31) {
                this.i1 = Math.min(this.i1, org.telegram.messenger.i0.L(192.0f));
                this.h1 = org.telegram.messenger.i0.L(78.0f);
            }
            if (jjVar.D == 33) {
                this.i1 = Math.min(this.i1, org.telegram.messenger.i0.L(220.0f));
                this.h1 = org.telegram.messenger.i0.L(78.0f);
            }
            int i16 = jjVar.D;
            ImageReceiver imageReceiver = this.I;
            if (i16 == 37) {
                this.h1 = org.telegram.messenger.i0.L(52.0f);
                imageReceiver.J0(org.telegram.messenger.i0.L(14.0f));
            } else if (X()) {
                imageReceiver.J0(this.h1 / 2);
            } else {
                imageReceiver.J0(0);
            }
        }
        int max = Math.max(org.telegram.messenger.i0.L(30.0f), View.MeasureSpec.getSize(i10));
        if (this.V != max) {
            this.C0 = true;
            this.V = max;
            x();
        }
        if (jjVar != null) {
            f7 = 30.0f;
            if (jjVar.D == 11) {
                i14 = org.telegram.messenger.i0.u;
                L4 = org.telegram.messenger.i0.L(10.0f);
            } else if (V(jjVar)) {
                i14 = this.i1;
                L4 = org.telegram.messenger.i0.L(12.0f);
            } else if (T()) {
                f10 = 140.0f;
                i12 = (this.I0.q0 == null ? org.telegram.messenger.i0.L(140.0f) : ((int) Math.ceil(r3.q0.i())) + org.telegram.messenger.i0.L(150.0f)) + org.telegram.messenger.i0.L(8.0f);
                S = S();
                p0Var = this.E0;
                if (S) {
                    r9 = org.telegram.messenger.m5.C(8.0f, this.H0.P, this.H0.p ? 0 : org.telegram.messenger.i0.L(16.0f) + this.S + this.O);
                    if (!p0Var.p) {
                        L3 = org.telegram.messenger.i0.L(8.0f) + p0Var.m;
                        p0Var.n = L3;
                        r9 += L3;
                    }
                    f13 = 24.0f;
                } else {
                    nx0 nx0Var = this.O0;
                    if (nx0Var != null) {
                        r9 = org.telegram.messenger.i0.L(12.0f) + org.telegram.messenger.i0.L(f10) + ((int) nx0Var.f.i()) + (nx0Var.i ? org.telegram.messenger.i0.L(40.0f) : 0);
                        if (!p0Var.p) {
                            L3 = org.telegram.messenger.i0.L(8.0f) + p0Var.m;
                            p0Var.n = L3;
                            r9 += L3;
                        }
                    } else if (V(jjVar)) {
                        if (jjVar != null) {
                            f11 = 12.0f;
                            if (jjVar.D == 25) {
                                z10 = true;
                                int O = O(jjVar);
                                if (X()) {
                                    f12 = 8.0f;
                                    f13 = 24.0f;
                                    L = (this.s1 == null ? 0 : org.telegram.messenger.i0.L(4.0f) + ((StaticLayout) r4.f).getHeight()) + (this.i1 * 0.075f) + this.S + this.O + O + org.telegram.messenger.i0.L(4.0f);
                                } else {
                                    f13 = 24.0f;
                                    f12 = 8.0f;
                                    int L5 = org.telegram.messenger.i0.L(4.0f) + this.S + this.O + (O > 0 ? org.telegram.messenger.m5.D(16.0f, 2, O) : org.telegram.messenger.i0.L(16.0f));
                                    kg.o oVar = this.s1;
                                    L = L5 + (oVar == null ? 0 : org.telegram.messenger.i0.L(4.0f) + ((StaticLayout) oVar.f).getHeight());
                                }
                                this.K1 = 0;
                                if (this.j1 == null) {
                                    float height = L + r15.getHeight();
                                    if (this.j1.getLineCount() > 1) {
                                        this.K1 = (this.j1.getHeight() - this.j1.getLineTop(1)) + this.K1;
                                    }
                                    L2 = height + org.telegram.messenger.i0.L(z10 ? 6.0f : 0.0f);
                                    if (this.m1 != null) {
                                        L2 += org.telegram.messenger.i0.L(9.0f) + r5.getHeight();
                                    }
                                    if (this.l1 != null) {
                                        L2 += org.telegram.messenger.i0.L(f13);
                                    }
                                } else {
                                    L2 = L - org.telegram.messenger.i0.L(f11);
                                    this.K1 -= org.telegram.messenger.i0.L(f7);
                                }
                                kg.o oVar2 = this.s1;
                                int height2 = oVar2 != null ? 0 : ((StaticLayout) oVar2.f).getHeight();
                                if (this.s1 != null) {
                                    this.K1 = 0;
                                } else if (this.m1 != null) {
                                    this.K1 = org.telegram.messenger.m5.C(10.0f, height2, this.K1);
                                } else {
                                    jj jjVar2 = this.P0;
                                    if (jjVar2.D == 18 || jjVar2.s4()) {
                                        this.K1 = z20.D(this.x1 == null ? 0.0f : 10.0f, height2, this.K1);
                                    } else if (this.P0.D == 30) {
                                        this.K1 = z20.D(20.0f, height2, this.K1);
                                    } else if (this.o1) {
                                        this.K1 += height2;
                                    } else if (((StaticLayout) this.s1.f).getLineCount() > 2) {
                                        this.K1 = ((((StaticLayout) this.s1.f).getLineCount() * (((StaticLayout) this.s1.f).getLineBottom(0) - ((StaticLayout) this.s1.f).getLineTop(0))) - 2) + this.K1;
                                    }
                                }
                                if (this.l1 != null) {
                                    this.K1 = org.telegram.messenger.i0.L(f13) + this.K1;
                                }
                                int L6 = this.K1 - org.telegram.messenger.i0.L(z10 ? 14.0f : 0.0f);
                                this.K1 = L6;
                                i12 += L6;
                                int L7 = org.telegram.messenger.i0.L(14.0f) + this.O + i12;
                                staticLayout = this.x1;
                                RectF rectF = this.o0;
                                if (staticLayout == null) {
                                    float B = c3.i0.B((L7 - L2) - staticLayout.getHeight(), org.telegram.messenger.i0.L(f12), 2.0f, L2);
                                    if (this.P0.s4()) {
                                        B += org.telegram.messenger.i0.L(4.0f);
                                    }
                                    float f15 = (this.V - this.D1) / 2.0f;
                                    f14 = 2.0f;
                                    rectF.set(f15 - org.telegram.messenger.i0.L(18.0f), B - org.telegram.messenger.i0.L(f12), f15 + this.D1 + org.telegram.messenger.i0.L(18.0f), B + (this.x1 != null ? r7.getHeight() : 0) + org.telegram.messenger.i0.L(f12));
                                } else {
                                    f14 = 2.0f;
                                    i12 -= org.telegram.messenger.i0.L(40.0f);
                                    this.K1 -= org.telegram.messenger.i0.L(40.0f);
                                    jj jjVar3 = this.P0;
                                    if (jjVar3 != null && (message = jjVar3.k) != null && (message.action instanceof TLRPC.TL_messageActionStarGift)) {
                                        i12 -= org.telegram.messenger.i0.L(f12);
                                        this.K1 -= org.telegram.messenger.i0.L(f12);
                                    }
                                }
                                measuredWidth = getMeasuredWidth() << (getMeasuredHeight() + 16);
                                kg.f2 f2Var = this.V1;
                                f2Var.a.set(rectF);
                                f2Var.b.set(rectF);
                                if (this.W1 != measuredWidth) {
                                    this.W1 = measuredWidth;
                                    f2Var.f();
                                }
                                if (X()) {
                                    int L8 = org.telegram.messenger.i0.L(4.0f) + this.S + this.O;
                                    this.f = 0;
                                    int D = O > 0 ? org.telegram.messenger.m5.D(16.0f, 2, O) : org.telegram.messenger.i0.L(16.0f);
                                    this.f = D;
                                    StaticLayout staticLayout2 = this.m1;
                                    if (staticLayout2 != null) {
                                        this.f = org.telegram.messenger.m5.C(10.0f, staticLayout2.getHeight(), D);
                                    }
                                    if (this.l1 != null) {
                                        this.f = org.telegram.messenger.i0.L(15.0f) + this.f;
                                    }
                                    int i17 = this.f + height2;
                                    this.f = i17;
                                    float f16 = (this.V - this.D1) / f14;
                                    if (this.x1 != null) {
                                        this.h = org.telegram.messenger.i0.L(7.0f) + i17 + L8;
                                        rectF.set(f16 - org.telegram.messenger.i0.L(18.0f), this.h, f16 + this.D1 + org.telegram.messenger.i0.L(18.0f), org.telegram.messenger.m5.D(f12, 2, this.x1.getHeight() + this.h));
                                        this.f = (int) (rectF.height() + org.telegram.messenger.i0.L(4.0f) + this.f);
                                    } else if (!W() && (i13 = jjVar.D) != 34 && i13 != 33 && i13 != 35) {
                                        rectF.set(f16 - org.telegram.messenger.i0.L(18.0f), this.h, f16 + this.D1 + org.telegram.messenger.i0.L(18.0f), org.telegram.messenger.m5.D(8.0f, 2, org.telegram.messenger.i0.L(17.0f) + this.h));
                                        this.f = org.telegram.messenger.i0.L(17.0f) + this.f;
                                    }
                                    int L9 = org.telegram.messenger.i0.L(15.0f) + this.f;
                                    this.f = L9;
                                    int L10 = org.telegram.messenger.i0.L(6.0f) + L8 + L9;
                                    if (!p0Var.p) {
                                        int L11 = org.telegram.messenger.i0.L(8.0f) + p0Var.m;
                                        p0Var.n = L11;
                                        L10 += L11;
                                    }
                                    r9 = L10;
                                    if (this.Y1 != null) {
                                        r9 += org.telegram.messenger.i0.L(44.0f);
                                    }
                                }
                                rectF.inset(org.telegram.messenger.i0.L(5.0f), org.telegram.messenger.i0.L(1.0f));
                            }
                        } else {
                            f11 = 12.0f;
                        }
                        z10 = false;
                        int O2 = O(jjVar);
                        if (X()) {
                        }
                        this.K1 = 0;
                        if (this.j1 == null) {
                        }
                        kg.o oVar22 = this.s1;
                        if (oVar22 != null) {
                        }
                        if (this.s1 != null) {
                        }
                        if (this.l1 != null) {
                        }
                        int L62 = this.K1 - org.telegram.messenger.i0.L(z10 ? 14.0f : 0.0f);
                        this.K1 = L62;
                        i12 += L62;
                        int L72 = org.telegram.messenger.i0.L(14.0f) + this.O + i12;
                        staticLayout = this.x1;
                        RectF rectF2 = this.o0;
                        if (staticLayout == null) {
                        }
                        measuredWidth = getMeasuredWidth() << (getMeasuredHeight() + 16);
                        kg.f2 f2Var2 = this.V1;
                        f2Var2.a.set(rectF2);
                        f2Var2.b.set(rectF2);
                        if (this.W1 != measuredWidth) {
                        }
                        if (X()) {
                        }
                        rectF2.inset(org.telegram.messenger.i0.L(5.0f), org.telegram.messenger.i0.L(1.0f));
                    }
                    f13 = 24.0f;
                }
                if (this.P0 != null && !p0Var.p) {
                    int L12 = org.telegram.messenger.i0.L(8.0f) + p0Var.m;
                    p0Var.n = L12;
                    i12 += L12;
                }
                if (W()) {
                    i12 = org.telegram.messenger.m5.C(f13, this.Q, i12);
                }
                if (jjVar == null && X()) {
                    setMeasuredDimension(max, this.l0 + r9);
                } else {
                    setMeasuredDimension(max, org.telegram.messenger.i0.L(14.0f) + this.l0 + this.O + i12);
                }
                p0Var.c = (getMeasuredHeight() - getPaddingTop()) - p0Var.n;
            }
            i12 = L4 + i14;
            f10 = 140.0f;
            S = S();
            p0Var = this.E0;
            if (S) {
            }
            if (this.P0 != null) {
                int L122 = org.telegram.messenger.i0.L(8.0f) + p0Var.m;
                p0Var.n = L122;
                i12 += L122;
            }
            if (W()) {
            }
            if (jjVar == null) {
            }
            setMeasuredDimension(max, org.telegram.messenger.i0.L(14.0f) + this.l0 + this.O + i12);
            p0Var.c = (getMeasuredHeight() - getPaddingTop()) - p0Var.n;
        }
        f7 = 30.0f;
        f10 = 140.0f;
        i12 = 0;
        S = S();
        p0Var = this.E0;
        if (S) {
        }
        if (this.P0 != null) {
        }
        if (W()) {
        }
        if (jjVar == null) {
        }
        setMeasuredDimension(max, org.telegram.messenger.i0.L(14.0f) + this.l0 + this.O + i12);
        p0Var.c = (getMeasuredHeight() - getPaddingTop()) - p0Var.n;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00ae, code lost:
    
        if (r11.i != false) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x02f8  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int i10;
        boolean z10;
        b40 b40Var;
        kg.o oVar;
        oj ojVar;
        sf.a aVar;
        kg.o oVar2;
        TLRPC.Message message;
        boolean z11;
        boolean z12;
        boolean z13;
        StaticLayout staticLayout;
        boolean z14;
        ArrayList arrayList;
        boolean z15;
        boolean z16;
        TLRPC.Message message2;
        int i11;
        s0 s0Var;
        boolean z17;
        m0 m0Var;
        jj jjVar = this.P0;
        float x10 = motionEvent.getX() - (this.j0 / 2.0f);
        this.y0 = x10;
        float y3 = motionEvent.getY() + getPaddingTop();
        this.z0 = y3;
        boolean z18 = true;
        if (jjVar == null) {
            if (this.e2 != null) {
                if (motionEvent.getAction() == 0) {
                    if (x10 >= this.a1 && x10 <= this.b1) {
                        this.F = true;
                        return true;
                    }
                } else if (this.F) {
                    if (motionEvent.getAction() == 1) {
                        this.e2.onClick(this);
                        this.F = false;
                    } else if (motionEvent.getAction() == 3) {
                        this.F = false;
                    }
                }
            }
            return super.onTouchEvent(motionEvent);
        }
        l11 l11Var = this.n0;
        if (l11Var == null || !l11Var.d(motionEvent, false)) {
            nx0 nx0Var = this.O0;
            if (nx0Var != null) {
                dc dcVar = nx0Var.m;
                boolean contains = nx0Var.k.contains(motionEvent.getX(), motionEvent.getY());
                if (motionEvent.getAction() == 0) {
                    dcVar.c(contains);
                } else if (motionEvent.getAction() != 2) {
                    if (motionEvent.getAction() == 1) {
                        if (dcVar.i) {
                            nx0Var.b();
                        }
                        dcVar.c(false);
                    } else if (motionEvent.getAction() == 3) {
                        dcVar.c(false);
                    }
                }
            }
            if (!S() || !this.H0.e(this.F0, this.G0, motionEvent)) {
                if (T()) {
                    org.telegram.ui.Wallet.d4 d4Var = this.I0;
                    float f7 = (this.j0 / 2.0f) + this.K0;
                    float paddingTop = this.L0 + getPaddingTop();
                    ArrayList arrayList2 = d4Var.c;
                    dc dcVar2 = d4Var.Y;
                    float x11 = motionEvent.getX() - f7;
                    float y10 = motionEvent.getY() - paddingTop;
                    s0 s0Var2 = d4Var.a;
                    if (motionEvent.getActionMasked() == 0) {
                        float x12 = motionEvent.getX() - f7;
                        float y11 = motionEvent.getY() - paddingTop;
                        org.telegram.ui.Wallet.c4 c4Var = d4Var.m;
                        if (c4Var != null && c4Var.n && d4Var.w.contains((int) x12, (int) y11)) {
                            if (!d4Var.D && d4Var.C <= 1.001f) {
                                d4Var.A = d4Var.g();
                                d4Var.B = d4Var.k.E * 0.14f;
                            }
                            ValueAnimator valueAnimator = d4Var.G;
                            if (valueAnimator != null) {
                                valueAnimator.cancel();
                                d4Var.G = null;
                            }
                            d4Var.D = false;
                            d4Var.x = motionEvent.getPointerId(0);
                            d4Var.y = motionEvent.getX();
                            d4Var.z = motionEvent.getY();
                            d4Var.r0 = false;
                            dcVar2.c(false);
                            if (s0Var2.getParent() != null) {
                                s0Var2.getParent().requestDisallowInterceptTouchEvent(true);
                            }
                            d4Var.a(3.0f);
                            if (z18) {
                                if (this.I0.x != -1) {
                                    m();
                                    return true;
                                }
                                if (motionEvent.getAction() == 0) {
                                    this.A0 = motionEvent.getX();
                                    this.B0 = motionEvent.getY();
                                    w();
                                    return true;
                                }
                                if (motionEvent.getAction() != 2) {
                                    m();
                                    return true;
                                }
                                float scaledTouchSlop = ViewConfiguration.get(getContext()).getScaledTouchSlop();
                                if (Math.abs(motionEvent.getX() - this.A0) > scaledTouchSlop || Math.abs(motionEvent.getY() - this.B0) > scaledTouchSlop) {
                                    m();
                                    return true;
                                }
                            }
                        }
                        float L = org.telegram.messenger.i0.L(4.0f);
                        boolean z19 = x11 < L && x11 <= ((float) org.telegram.messenger.i0.L(206.0f)) - L && y10 >= L && y10 <= ((float) org.telegram.messenger.i0.L(140.0f)) - L;
                        if (d4Var.q0 != null) {
                            TLRPC.TL_messageActionGramTransfer tL_messageActionGramTransfer = d4Var.l0;
                            if ((tL_messageActionGramTransfer.comment_encrypted || tL_messageActionGramTransfer.comment_encrypted_preparing) && !d4Var.m0) {
                                float L2 = x11 - ((org.telegram.messenger.i0.L(206.0f) - d4Var.q0.k()) / 2.0f);
                                float L3 = y10 - org.telegram.messenger.i0.L(143.0f);
                                int size = arrayList2.size();
                                int i12 = 0;
                                while (i12 < size) {
                                    Object obj = arrayList2.get(i12);
                                    i12++;
                                    s0Var = s0Var2;
                                    if (((nh.i) obj).getBounds().contains((int) L2, (int) L3)) {
                                        z17 = true;
                                        break;
                                    }
                                    s0Var2 = s0Var;
                                }
                            }
                        }
                        s0Var = s0Var2;
                        z17 = false;
                        boolean z20 = !z19 || z17;
                        if (motionEvent.getAction() != 0) {
                            d4Var.r0 = z20;
                            dcVar2.c(z20);
                        } else if (motionEvent.getAction() != 2) {
                            if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                                z18 = d4Var.r0;
                                boolean z21 = motionEvent.getAction() == 1 && z18 && z20;
                                d4Var.r0 = false;
                                dcVar2.c(false);
                                if (z21 && z17) {
                                    TLRPC.TL_messageActionGramTransfer tL_messageActionGramTransfer2 = d4Var.l0;
                                    if (tL_messageActionGramTransfer2.comment_encrypted_preparing) {
                                        d4Var.m0 = true;
                                        qz0 qz0Var = d4Var.q0;
                                        qz0Var.q(org.telegram.messenger.k6.m(tL_messageActionGramTransfer2.comment, qz0Var.a.getFontMetricsInt(), false, null, 0));
                                        d4Var.d.addAll(arrayList2);
                                        arrayList2.clear();
                                        s0Var.requestLayout();
                                        s0Var.invalidate();
                                        if (z18) {
                                        }
                                    }
                                }
                                if (z21 && (m0Var = d4Var.s0) != null) {
                                    m0Var.run();
                                }
                                if (z18) {
                                }
                            }
                            z18 = d4Var.r0;
                            if (z18) {
                            }
                        } else if (d4Var.r0) {
                            dcVar2.c(z20);
                        }
                        z18 = d4Var.r0;
                        if (z18) {
                        }
                    } else {
                        if (d4Var.x != -1) {
                            int actionMasked = motionEvent.getActionMasked();
                            if (actionMasked != 1) {
                                if (actionMasked == 2) {
                                    int findPointerIndex = motionEvent.findPointerIndex(d4Var.x);
                                    if (findPointerIndex < 0) {
                                        d4Var.j();
                                    } else {
                                        float radians = ((float) Math.toRadians(0.800000011920929d)) / org.telegram.messenger.i0.p;
                                        d4Var.A = c3.i0.z(motionEvent.getX(findPointerIndex), d4Var.y, radians, d4Var.A);
                                        d4Var.B = c3.i0.z(motionEvent.getY(findPointerIndex), d4Var.z, radians, d4Var.B);
                                        d4Var.y = motionEvent.getX(findPointerIndex);
                                        d4Var.z = motionEvent.getY(findPointerIndex);
                                        s0Var2.invalidate();
                                    }
                                } else if (actionMasked != 3) {
                                    if (actionMasked == 6 && motionEvent.getPointerId(motionEvent.getActionIndex()) == d4Var.x) {
                                        int i13 = motionEvent.getActionIndex() == 0 ? 1 : 0;
                                        d4Var.x = motionEvent.getPointerId(i13);
                                        d4Var.y = motionEvent.getX(i13);
                                        d4Var.z = motionEvent.getY(i13);
                                    }
                                }
                                if (z18) {
                                }
                            }
                            d4Var.j();
                            if (z18) {
                            }
                        }
                        float L4 = org.telegram.messenger.i0.L(4.0f);
                        if (x11 < L4) {
                        }
                        if (d4Var.q0 != null) {
                        }
                        s0Var = s0Var2;
                        z17 = false;
                        if (z19) {
                        }
                        if (motionEvent.getAction() != 0) {
                        }
                        z18 = d4Var.r0;
                        if (z18) {
                        }
                    }
                    return true;
                }
                if (!this.E0.c(motionEvent)) {
                    int action = motionEvent.getAction();
                    RectF rectF = this.o0;
                    ImageReceiver imageReceiver = this.I;
                    View view = this.T1;
                    dc dcVar3 = this.n;
                    if (action != 0) {
                        i10 = 4;
                        if (motionEvent.getAction() != 2) {
                            m();
                        }
                        if (this.F) {
                            if (motionEvent.getAction() == 2) {
                                if (x10 < this.a1 || x10 > this.b1) {
                                    z11 = false;
                                    this.F = false;
                                    z12 = z11;
                                }
                            } else if (motionEvent.getAction() == 1) {
                                View.OnClickListener onClickListener = this.e2;
                                if (onClickListener != null) {
                                    onClickListener.onClick(this);
                                }
                                this.F = false;
                            } else if (motionEvent.getAction() == 3) {
                                this.F = false;
                            }
                            z12 = false;
                        } else if (this.E) {
                            int action2 = motionEvent.getAction();
                            if (action2 == 1) {
                                this.E = false;
                                view.setPressed(false);
                                dcVar3.c(false);
                                if (this.f1 != null && jjVar.C != null && (message = jjVar.k) != null && sf.d.g(message.action, TLRPC.TL_messageActionTodoAppendTasks.class, TLRPC.TL_messageActionTodoCompletions.class, TLRPC.TL_messageActionSuggestedPostApproval.class, TLRPC.TL_messageActionSuggestedPostRefund.class, TLRPC.TL_messageActionSuggestedPostSuccess.class)) {
                                    this.f1.r(this, this.P0.O1());
                                } else if (this.o1 && !this.n1 && (oVar2 = this.s1) != null) {
                                    int height = ((StaticLayout) oVar2.f).getHeight() - this.p1;
                                    this.n1 = true;
                                    q0 q0Var = this.f1;
                                    if (q0Var != null) {
                                        q0Var.w(this);
                                        if (getParent() instanceof tk0) {
                                            ((tk0) getParent()).w0(0, org.telegram.messenger.i0.L(24.0f) + height, null);
                                            return true;
                                        }
                                    }
                                } else if (this.O0 != null && this.M1.contains(motionEvent.getX(), motionEvent.getY())) {
                                    this.O0.b();
                                    return true;
                                }
                            } else if (action2 == 2) {
                                kg.o oVar3 = this.s1;
                                if (oVar3 == null || !this.o1) {
                                    this.E = false;
                                } else {
                                    RectF rectF2 = org.telegram.messenger.i0.P;
                                    float f10 = oVar3.a;
                                    rectF2.set(f10, oVar3.b, ((StaticLayout) oVar3.f).getWidth() + f10, this.s1.b + ((StaticLayout) r8.f).getHeight());
                                    if (!rectF2.contains(x10, y3)) {
                                        this.E = false;
                                    }
                                }
                                z11 = true;
                                z12 = z11;
                            } else if (action2 == 3) {
                                this.E = false;
                                dcVar3.c(false);
                            }
                            z11 = false;
                            z12 = z11;
                        } else {
                            boolean z22 = this.a0;
                            int i14 = this.H;
                            if (z22) {
                                int action3 = motionEvent.getAction();
                                if (action3 == 1) {
                                    this.W = false;
                                    this.a0 = false;
                                    view.setPressed(false);
                                    dcVar3.c(false);
                                    if (this.f1 != null) {
                                        int i15 = jjVar.D;
                                        if (i15 == 37) {
                                            playSoundEffect(0);
                                            org.telegram.ui.ActionBar.k2 T = LaunchActivity.T();
                                            if (T != null) {
                                                new yh.a0(T, ((TLRPC.TL_messageActionChangeCommunity) jjVar.k.action).community_id, null, null).show();
                                            }
                                        } else if (i15 == 31) {
                                            playSoundEffect(0);
                                            c0();
                                        } else if (i15 == 25) {
                                            playSoundEffect(0);
                                            if (this.f1 != null) {
                                                org.telegram.messenger.i0.g3(new ea(2, this, (TLRPC.TL_messageActionGiftCode) this.P0.k.action));
                                            }
                                        } else if (i15 == 18) {
                                            playSoundEffect(0);
                                            b0();
                                        } else if (i15 == 30) {
                                            playSoundEffect(0);
                                            c0();
                                        } else {
                                            TLRPC.Message message3 = jjVar.k;
                                            if (message3 != null) {
                                                TLRPC.MessageAction messageAction = message3.action;
                                                if ((messageAction instanceof TLRPC.TL_messageActionSuggestedPostApproval) && ((TLRPC.TL_messageActionSuggestedPostApproval) messageAction).balance_too_low) {
                                                    playSoundEffect(0);
                                                    TLRPC.Message message4 = this.P0.k;
                                                    if (message4 != null) {
                                                        TLRPC.SuggestedPost suggestedPost = message4.suggested_post;
                                                        if (suggestedPost != null) {
                                                            ojVar = oj.b(suggestedPost);
                                                        } else {
                                                            TLRPC.MessageAction messageAction2 = message4.action;
                                                            if (messageAction2 instanceof TLRPC.TL_messageActionSuggestedPostApproval) {
                                                                ojVar = new oj(sf.a.l(((TLRPC.TL_messageActionSuggestedPostApproval) messageAction2).price), r1.schedule_date);
                                                            }
                                                        }
                                                        aVar = ojVar.a;
                                                        if (aVar != null && aVar.a == sf.b.a) {
                                                            new rh.x7(getContext(), this.g1, ojVar.a.a(), 13, gg.e.h(i14, jj.B0(this.P0.k)), null, jj.B0(this.P0.k)).show();
                                                        }
                                                    }
                                                    ojVar = null;
                                                    aVar = ojVar.a;
                                                    if (aVar != null) {
                                                        new rh.x7(getContext(), this.g1, ojVar.a.a(), 13, gg.e.h(i14, jj.B0(this.P0.k)), null, jj.B0(this.P0.k)).show();
                                                    }
                                                }
                                            }
                                            if (((b40) vp.r1(i14).C7.get(jjVar.k.local_id)) == null) {
                                                if (this.y1) {
                                                    this.f1.F(this);
                                                } else {
                                                    this.f1.I(this);
                                                }
                                            }
                                        }
                                    }
                                } else if (action3 != 2) {
                                    if (action3 == 3) {
                                        this.W = false;
                                        this.a0 = false;
                                        view.setPressed(false);
                                        dcVar3.c(false);
                                    }
                                } else if (!V(jjVar) || (!rectF.contains(x10, y3) && !this.M1.contains(x10, y3))) {
                                    this.a0 = false;
                                    view.setPressed(false);
                                    dcVar3.c(false);
                                }
                            } else if (this.W) {
                                int action4 = motionEvent.getAction();
                                if (action4 == 1) {
                                    this.W = false;
                                    if (!this.o1 || this.n1 || (oVar = this.s1) == null) {
                                        int i16 = jjVar.D;
                                        if (i16 == 31) {
                                            c0();
                                        } else if (i16 == 25) {
                                            if (this.f1 != null) {
                                                org.telegram.messenger.i0.g3(new ea(2, this, (TLRPC.TL_messageActionGiftCode) this.P0.k.action));
                                            }
                                        } else if (i16 == 18) {
                                            b0();
                                        } else if (i16 == 30) {
                                            c0();
                                        } else if (this.f1 != null) {
                                            if (i16 != 21 || (b40Var = (b40) vp.r1(i14).C7.get(jjVar.k.local_id)) == null) {
                                                z10 = false;
                                            } else {
                                                b40Var.b();
                                                z10 = true;
                                            }
                                            if (!z10) {
                                                this.f1.F(this);
                                                playSoundEffect(0);
                                            }
                                        }
                                    } else {
                                        int height2 = ((StaticLayout) oVar.f).getHeight() - this.p1;
                                        this.n1 = true;
                                        q0 q0Var2 = this.f1;
                                        if (q0Var2 != null) {
                                            q0Var2.w(this);
                                            if (getParent() instanceof tk0) {
                                                ((tk0) getParent()).w0(0, org.telegram.messenger.i0.L(16.0f) + height2, null);
                                                return true;
                                            }
                                        }
                                    }
                                } else if (action4 != 2) {
                                    if (action4 == 3) {
                                        this.W = false;
                                    }
                                } else if (X()) {
                                    if (!this.M1.contains(x10, y3)) {
                                        this.W = false;
                                    }
                                } else if (!imageReceiver.O(x10, y3)) {
                                    this.W = false;
                                }
                            }
                            z12 = false;
                        }
                    } else if (this.f1 != null) {
                        if ((jjVar.D == 11 || V(jjVar)) && imageReceiver.O(x10, y3)) {
                            this.W = true;
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        if (this.J1.i.q == 4 && (((i11 = jjVar.D) == 21 || i11 == 22) && this.M1.contains(x10, y3))) {
                            this.W = true;
                            z15 = true;
                        }
                        kg.o oVar4 = this.s1;
                        if (oVar4 == null || !this.o1) {
                            i10 = 4;
                        } else {
                            RectF rectF3 = org.telegram.messenger.i0.P;
                            float f11 = oVar4.a;
                            i10 = 4;
                            rectF3.set(f11, oVar4.b, ((StaticLayout) oVar4.f).getWidth() + f11, this.s1.b + ((StaticLayout) r6.f).getHeight());
                            if (rectF3.contains(x10, y3)) {
                                this.E = true;
                                z15 = true;
                            }
                        }
                        if (V(jjVar) && this.x1 != null && (rectF.contains(x10, y3) || (this.y1 && this.M1.contains(x10, y3)))) {
                            z16 = true;
                            this.a0 = true;
                            view.setPressed(true);
                            dcVar3.c(true);
                            z15 = true;
                        } else {
                            z16 = true;
                        }
                        if (!z15 && W()) {
                            this.E = z16;
                            z15 = true;
                        }
                        if (!z15) {
                            jj jjVar2 = this.P0;
                            if (sf.d.g((jjVar2 == null || (message2 = jjVar2.k) == null) ? null : message2.action, TLRPC.TL_messageActionSuggestedPostRefund.class, TLRPC.TL_messageActionSuggestedPostSuccess.class)) {
                                this.E = true;
                                z15 = true;
                            }
                        }
                        if (z15) {
                            w();
                        }
                        z12 = z15;
                    } else {
                        i10 = 4;
                        z12 = false;
                    }
                    if (!z12 && (motionEvent.getAction() == 0 || ((this.y != null || this.D != null) && motionEvent.getAction() == 1))) {
                        kg.o oVar5 = this.s1;
                        if (oVar5 != null && (arrayList = oVar5.e) != null && !arrayList.isEmpty() && !this.G) {
                            ArrayList arrayList3 = this.s1.e;
                            int size2 = arrayList3.size();
                            int i17 = 0;
                            while (true) {
                                if (i17 >= size2) {
                                    break;
                                }
                                Object obj2 = arrayList3.get(i17);
                                i17++;
                                nh.i iVar = (nh.i) obj2;
                                Rect bounds = iVar.getBounds();
                                kg.o oVar6 = this.s1;
                                if (bounds.contains((int) (x10 - oVar6.a), (int) (y3 - oVar6.b))) {
                                    this.y = null;
                                    if (motionEvent.getAction() == 0) {
                                        this.D = iVar;
                                        z12 = true;
                                    } else {
                                        nh.i iVar2 = this.D;
                                        z13 = true;
                                        if (iVar == iVar2) {
                                            this.G = true;
                                            iVar2.q = new m0(this, i10);
                                            float sqrt = (float) Math.sqrt(Math.pow(((StaticLayout) this.s1.f).getHeight(), 2.0d) + Math.pow(((StaticLayout) this.s1.f).getWidth(), 2.0d));
                                            nh.i iVar3 = this.D;
                                            kg.o oVar7 = this.s1;
                                            iVar3.j((int) (x10 - oVar7.a), (int) (y3 - oVar7.b), sqrt, false);
                                            invalidate();
                                        }
                                        z12 = true;
                                    }
                                }
                            }
                        }
                        z13 = true;
                        if (!z12 && (staticLayout = this.M) != null) {
                            if (x10 >= this.R) {
                                float f12 = this.S;
                                if (y3 >= f12 && x10 <= r5 + this.N && y3 <= r6 + this.O) {
                                    float f13 = y3 - f12;
                                    float f14 = x10 - this.T;
                                    if (!z12) {
                                        int lineForVertical = staticLayout.getLineForVertical((int) f13);
                                        int offsetForHorizontal = this.M.getOffsetForHorizontal(lineForVertical, f14);
                                        float lineLeft = this.M.getLineLeft(lineForVertical);
                                        if (lineLeft <= f14 && this.M.getLineWidth(lineForVertical) + lineLeft >= f14) {
                                            CharSequence charSequence = jjVar.v;
                                            if (charSequence instanceof Spannable) {
                                                URLSpan[] uRLSpanArr = (URLSpan[]) ((Spannable) charSequence).getSpans(offsetForHorizontal, offsetForHorizontal, URLSpan.class);
                                                if (uRLSpanArr.length != 0) {
                                                    if (motionEvent.getAction() == 0) {
                                                        this.y = uRLSpanArr[0];
                                                    } else {
                                                        URLSpan uRLSpan = uRLSpanArr[0];
                                                        URLSpan uRLSpan2 = this.y;
                                                        if (uRLSpan == uRLSpan2) {
                                                            a0(uRLSpan2);
                                                        }
                                                    }
                                                    z14 = z13;
                                                    z12 = z14;
                                                } else {
                                                    this.y = null;
                                                }
                                                z14 = z12;
                                                z12 = z14;
                                            }
                                        }
                                        this.y = null;
                                    }
                                }
                            }
                        }
                        this.y = null;
                    }
                    if (!z12) {
                        z12 = y(motionEvent);
                    }
                    return !z12 ? super.onTouchEvent(motionEvent) : z12;
                }
                return true;
            }
        }
        return true;
    }

    @Override // org.telegram.ui.Cells.z
    public final boolean r() {
        q0 q0Var = this.f1;
        if (q0Var != null) {
            return q0Var.i1(this, this.y0, this.z0);
        }
        return false;
    }

    public void setCustomText(CharSequence charSequence) {
        this.R0 = charSequence;
        if (charSequence != null) {
            h0(false);
        }
    }

    public void setDelegate(q0 q0Var) {
        this.f1 = q0Var;
    }

    public void setInvalidateColors(boolean z10) {
        if (this.e1 == z10) {
            return;
        }
        this.e1 = z10;
        invalidate();
    }

    public void setInvalidateListener(Runnable runnable) {
        this.o2 = runnable;
    }

    public void setInvalidateWithParent(View view) {
        this.w = view;
    }

    public void setInvalidatesParent(boolean z10) {
        this.n2 = z10;
    }

    public void setMessageObject(jj jjVar) {
        f0(jjVar, false);
    }

    public void setOnActionClickListener(View.OnClickListener onClickListener) {
        this.e2 = onClickListener;
    }

    public void setOverrideTextMaxWidth(int i10) {
        this.f2 = i10;
    }

    public void setScrimReaction(Integer num) {
        this.E0.z = num;
    }

    public void setShowTopic(boolean z10) {
        if (this.m0 != z10) {
            this.m0 = z10;
            U();
            invalidate();
        }
    }

    public void setSpoilersSuppressed(boolean z10) {
        this.J0 = z10;
        org.telegram.ui.Wallet.d4 d4Var = this.I0;
        if (d4Var != null) {
            d4Var.n(z10);
        }
        ArrayList arrayList = this.p0;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((nh.i) obj).invalidateSelf();
        }
    }

    public void setWalletSlidingOffset(float f7) {
        setTranslationX((getTranslationX() - this.M0) + f7);
        this.M0 = f7;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.J || super.verifyDrawable(drawable);
    }

    /* JADX WARN: Code restructure failed: missing block: B:173:0x0762, code lost:
    
        if (r8 == false) goto L334;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x01b6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void x() {
        long j10;
        CharSequence charSequence;
        CharSequence charSequence2;
        CharSequence K0;
        CharSequence charSequence3;
        boolean z10;
        CharSequence Z;
        ArrayList<TLRPC.VideoSize> arrayList;
        TLRPC.Photo photo;
        ArrayList<TLRPC.VideoSize> arrayList2;
        CharSequence charSequence4;
        int i10;
        String G;
        TL_stars.StarGift starGift;
        String str;
        CharSequence W2;
        String str2;
        CharSequence charSequence5;
        String r10;
        TLRPC.Peer peer;
        TLRPC.Message message;
        TLRPC.MessageAction messageAction;
        int i11;
        TLRPC.Chat L0;
        TLRPC.User user;
        CharSequence J2;
        TLRPC.MessageMedia messageMedia;
        jj jjVar = this.P0;
        int i12 = this.H;
        if (jjVar == null) {
            j10 = 0;
            charSequence = this.R0;
        } else if (T()) {
            CharSequence m10 = org.telegram.ui.Wallet.k0.x(i12).m(((TLRPC.TL_messageActionGramTransfer) jjVar.k.action).amount, false);
            if (!TextUtils.isEmpty(m10)) {
                charSequence = cd.V(null, null, 2131743000, org.telegram.ui.Components.o5.cloneSpans(jjVar.v), m10);
                j10 = 0;
                if (charSequence == null) {
                    TLRPC.Message message2 = jjVar.k;
                    if (message2 == null || (messageMedia = message2.media) == null || messageMedia.ttl_seconds == 0) {
                        charSequence = org.telegram.ui.Components.o5.cloneSpans(jjVar.v);
                    } else if (messageMedia.photo != null) {
                        charSequence = cd.L0(2131753947, null);
                    } else {
                        TLRPC.Document document = messageMedia.document;
                        charSequence = ((document instanceof TLRPC.TL_documentEmpty) || ((messageMedia instanceof TLRPC.TL_messageMediaDocument) && document == null)) ? messageMedia.voice ? cd.L0(2131753929, null) : messageMedia.round ? cd.L0(2131753940, null) : cd.L0(2131753932, null) : org.telegram.ui.Components.o5.cloneSpans(jjVar.v);
                    }
                }
            }
            j10 = 0;
            charSequence = null;
            if (charSequence == null) {
            }
        } else {
            if (jjVar.g3()) {
                charSequence = jjVar.k.media.user_id != d20.i(i12).e() ? th.w5.e(new Object[0], 2131750874, true) : th.w5.e(new Object[]{vp.r1(i12).Z1(Long.valueOf(jj.B0(jjVar.k))).first_name}, 2131750873, true);
            } else {
                q0 q0Var = this.f1;
                if (q0Var != null && q0Var.b() == 0 && jj.E4(jjVar)) {
                    TLRPC.TL_forumTopic f7 = vp.r1(i12).r7.f(-jj.B0(jjVar.k), jj.c2(i12, jjVar.k, true, false));
                    int i13 = gg.e.a;
                    if (f7 != null) {
                        TLRPC.Message message3 = jjVar.k;
                        int i14 = jjVar.I1;
                        TLRPC.MessageAction messageAction2 = message3.action;
                        if (messageAction2 instanceof TLRPC.TL_messageActionTopicCreate) {
                            charSequence = org.telegram.messenger.i0.J2(cd.L0(2131744024, null), gg.e.j(f7, null, null), "%s");
                        } else if (messageAction2 instanceof TLRPC.TL_messageActionTopicEdit) {
                            TLRPC.TL_messageActionTopicEdit tL_messageActionTopicEdit = (TLRPC.TL_messageActionTopicEdit) messageAction2;
                            j10 = 0;
                            long Z0 = jjVar.Z0();
                            if (org.telegram.messenger.o5.E(Z0)) {
                                user = vp.r1(i14).Z1(Long.valueOf(Z0));
                                L0 = null;
                            } else {
                                L0 = vp.r1(i14).L0(Long.valueOf(-Z0));
                                user = null;
                            }
                            String m11 = user != null ? org.telegram.messenger.i5.m(0, user.first_name, user.last_name) : L0 != null ? L0.title : null;
                            int i15 = tL_messageActionTopicEdit.flags;
                            if ((i15 & 8) != 0) {
                                J2 = org.telegram.messenger.i0.J2(cd.L0(tL_messageActionTopicEdit.hidden ? 2131744042 : 2131744028, null), m11, "%s");
                            } else if ((i15 & 4) != 0) {
                                J2 = org.telegram.messenger.i0.J2(org.telegram.messenger.i0.J2(cd.L0(tL_messageActionTopicEdit.closed ? 2131744025 : 2131744020, null), gg.e.j(f7, null, null), "%2$s"), m11, "%1$s");
                            } else {
                                int i16 = i15 & 1;
                                if (i16 != 0 && (i15 & 2) != 0) {
                                    TLRPC.TL_forumTopic tL_forumTopic = new TLRPC.TL_forumTopic();
                                    tL_forumTopic.icon_emoji_id = tL_messageActionTopicEdit.icon_emoji_id;
                                    tL_forumTopic.title = tL_messageActionTopicEdit.title;
                                    J2 = org.telegram.messenger.i0.J2(org.telegram.messenger.i0.J2(cd.L0(2131744021, null), gg.e.j(tL_forumTopic, null, null), "%2$s"), m11, "%1$s");
                                } else if (i16 != 0) {
                                    J2 = org.telegram.messenger.i0.J2(org.telegram.messenger.i0.J2(cd.L0(2131744022, null), tL_messageActionTopicEdit.title, "%2$s"), m11, "%1$s");
                                } else {
                                    if ((i15 & 2) != 0) {
                                        TLRPC.TL_forumTopic tL_forumTopic2 = new TLRPC.TL_forumTopic();
                                        tL_forumTopic2.icon_emoji_id = tL_messageActionTopicEdit.icon_emoji_id;
                                        tL_forumTopic2.title = "";
                                        J2 = org.telegram.messenger.i0.J2(org.telegram.messenger.i0.J2(cd.L0(2131744023, null), gg.e.j(tL_forumTopic2, null, null), "%2$s"), m11, "%1$s");
                                    }
                                    charSequence = null;
                                    if (charSequence == null) {
                                    }
                                }
                            }
                            charSequence = J2;
                            if (charSequence == null) {
                            }
                        }
                    }
                }
                j10 = 0;
                charSequence = null;
                if (charSequence == null) {
                }
            }
            j10 = 0;
            if (charSequence == null) {
            }
        }
        jj jjVar2 = this.P0;
        CharSequence charSequence6 = (jjVar2 == null || !jjVar2.h2) ? charSequence : "";
        if (jjVar2 != null && (message = jjVar2.k) != null && (messageAction = message.action) != null) {
            if (messageAction instanceof TLRPC.TL_messageActionTodoAppendTasks) {
                i11 = R.drawable.mini_checklist_add;
            } else if (messageAction instanceof TLRPC.TL_messageActionTodoCompletions) {
                TLRPC.TL_messageActionTodoCompletions tL_messageActionTodoCompletions = (TLRPC.TL_messageActionTodoCompletions) messageAction;
                i11 = tL_messageActionTodoCompletions.incompleted.size() > tL_messageActionTodoCompletions.completed.size() ? R.drawable.mini_checklist_undone : R.drawable.mini_checklist_done;
            } else {
                i11 = 0;
            }
            if (i11 != 0) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence6);
                spannableStringBuilder.insert(0, (CharSequence) "i ");
                spannableStringBuilder.setSpan(new dq(i11, 0), 0, 1, 33);
                charSequence6 = spannableStringBuilder;
            }
        }
        F(this.V, charSequence6);
        if (this.O0 != null) {
            this.M = null;
            this.O = 0;
            this.P = null;
            this.Q = 0;
            this.S = 0;
        }
        if (jjVar != null) {
            TLRPC.Message message4 = jjVar.k;
            if (message4 != null) {
                TLRPC.MessageAction messageAction3 = message4.action;
                if ((messageAction3 instanceof TLRPC.TL_messageActionSuggestedPostApproval) && ((TLRPC.TL_messageActionSuggestedPostApproval) messageAction3).balance_too_low) {
                    D(null, null, charSequence6, false, !org.telegram.messenger.w3.z(i12, 24, jj.B0(message4)) ? cd.L0(2131745169, null) : null, 11, null, this.i1, false);
                    this.M = null;
                    this.O = 0;
                    this.P = null;
                    this.Q = 0;
                    this.S = 0;
                }
            }
            CharSequence charSequence7 = charSequence6;
            if (message4 != null) {
                TLRPC.MessageAction messageAction4 = message4.action;
                if ((messageAction4 instanceof TLRPC.TL_messageActionSuggestedPostApproval) && ((TLRPC.TL_messageActionSuggestedPostApproval) messageAction4).rejected) {
                    D(null, null, charSequence7, false, null, 11, null, this.i1, false);
                    this.M = null;
                    this.O = 0;
                    this.P = null;
                    this.Q = 0;
                    this.S = 0;
                }
            }
            int i17 = jjVar.D;
            if (i17 == 11) {
                float L = org.telegram.messenger.i0.L(19.0f) + this.O;
                float f10 = org.telegram.messenger.i0.u;
                this.I.y0((this.V - org.telegram.messenger.i0.u) / 2.0f, L, f10, f10);
            } else if (i17 == 25) {
                B();
            } else {
                TextPaint textPaint = this.F1;
                if (i17 == 30) {
                    TLRPC.User Z1 = vp.r1(i12).Z1(Long.valueOf(this.P0.A0()));
                    TLRPC.MessageAction messageAction5 = jjVar.k.action;
                    if (messageAction5 instanceof TLRPC.TL_messageActionGiftStars) {
                        D(cd.I((int) ((TLRPC.TL_messageActionGiftStars) messageAction5).stars, "ActionGiftStarsTitle"), null, org.telegram.messenger.i0.W2(this.P0.P3() ? cd.Z(2131754631, h20.k(Z1)) : cd.K0(2131754630)), false, cd.K0(2131754626), 11, null, this.i1, true);
                    } else {
                        if ((messageAction5 instanceof TLRPC.TL_messageActionStarGiftUnique) && ((TLRPC.TL_messageActionStarGiftUnique) messageAction5).refunded) {
                            long e = d20.i(i12).e();
                            TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique = (TLRPC.TL_messageActionStarGiftUnique) jjVar.k.action;
                            if (jjVar.P3() != (!tL_messageActionStarGiftUnique.upgrade)) {
                                e = jjVar.A0();
                            }
                            TLRPC.User Z12 = vp.r1(i12).Z1(Long.valueOf(e));
                            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                            spannableStringBuilder2.append((CharSequence) cd.K0(tL_messageActionStarGiftUnique.prepaid_upgrade ? 2131750437 : 2131750446)).append((CharSequence) " ");
                            if (Z12 != null && Z12.photo != null) {
                                spannableStringBuilder2.append((CharSequence) "a ");
                                org.telegram.ui.e5 e5Var = new org.telegram.ui.e5(18.0f, i12, this);
                                e5Var.e(Z12);
                                spannableStringBuilder2.setSpan(e5Var, spannableStringBuilder2.length() - 2, spannableStringBuilder2.length() - 1, 33);
                            }
                            spannableStringBuilder2.append((CharSequence) h20.k(Z12));
                            D(spannableStringBuilder2, null, cd.K0(2131750438), false, cd.K0(2131754626), 12, cd.K0(2131749903), this.i1, true);
                        } else if (messageAction5 instanceof TLRPC.TL_messageActionStarGift) {
                            TLRPC.TL_messageActionStarGift tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction5;
                            long j11 = tL_messageActionStarGift.convert_stars;
                            long e7 = d20.i(i12).e();
                            long j12 = j10;
                            TLRPC.Peer peer2 = tL_messageActionStarGift.peer;
                            boolean z11 = peer2 != null && (!tL_messageActionStarGift.prepaid_upgrade || (peer2 instanceof TLRPC.TL_peerChannel));
                            boolean z12 = jjVar.A0() == e7 && !z11;
                            long Z02 = jjVar.Z0();
                            if (!tL_messageActionStarGift.prepaid_upgrade && (peer = tL_messageActionStarGift.from_id) != null) {
                                Z02 = org.telegram.messenger.o5.o(peer);
                            }
                            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
                            TLObject d22 = vp.r1(i12).d2(Z02);
                            long o10 = org.telegram.messenger.o5.o(tL_messageActionStarGift.to_id);
                            TLObject d23 = vp.r1(i12).d2(o10);
                            boolean z13 = tL_messageActionStarGift.can_upgrade && !tL_messageActionStarGift.converted && tL_messageActionStarGift.upgrade_stars > j12 && !tL_messageActionStarGift.upgraded;
                            if (o10 != j12 && tL_messageActionStarGift.auction_acquired && d23 != null) {
                                spannableStringBuilder3.append((CharSequence) cd.K0(2131750443)).append((CharSequence) " ");
                                if (!(d23 instanceof TLRPC.User) ? !(!(d23 instanceof TLRPC.Chat) || ((TLRPC.Chat) d23).photo == null) : ((TLRPC.User) d23).photo != null) {
                                    spannableStringBuilder3.append((CharSequence) "a ");
                                    org.telegram.ui.e5 e5Var2 = new org.telegram.ui.e5(18.0f, i12, this);
                                    org.telegram.ui.Components.r8 r8Var = e5Var2.c;
                                    r8Var.p(d23);
                                    e5Var2.b.i0(d23, r8Var, null);
                                    spannableStringBuilder3.setSpan(e5Var2, spannableStringBuilder3.length() - 2, spannableStringBuilder3.length() - 1, 33);
                                }
                                spannableStringBuilder3.append((CharSequence) org.telegram.messenger.o5.u(d23));
                            } else if (!z12) {
                                spannableStringBuilder3.append((CharSequence) cd.K0(tL_messageActionStarGift.prepaid_upgrade ? 2131750437 : 2131750446)).append((CharSequence) " ");
                                if (!(d22 instanceof TLRPC.User) ? !(!(d22 instanceof TLRPC.Chat) || ((TLRPC.Chat) d22).photo == null) : ((TLRPC.User) d22).photo != null) {
                                    spannableStringBuilder3.append((CharSequence) "a ");
                                    org.telegram.ui.e5 e5Var3 = new org.telegram.ui.e5(18.0f, i12, this);
                                    org.telegram.ui.Components.r8 r8Var2 = e5Var3.c;
                                    r8Var2.p(d22);
                                    e5Var3.b.i0(d22, r8Var2, null);
                                    spannableStringBuilder3.setSpan(e5Var3, spannableStringBuilder3.length() - 2, spannableStringBuilder3.length() - 1, 33);
                                }
                                spannableStringBuilder3.append((CharSequence) org.telegram.messenger.o5.u(d22));
                            } else if (tL_messageActionStarGift.gift_num <= 0 || (starGift = tL_messageActionStarGift.gift) == null || (str = starGift.title) == null) {
                                spannableStringBuilder3.append((CharSequence) cd.K0(2131750448));
                            } else {
                                spannableStringBuilder3.append((CharSequence) str).append((CharSequence) " #").append((CharSequence) cd.E(tL_messageActionStarGift.gift_num, ','));
                            }
                            boolean z14 = ((jjVar.P3() && !z12) || !tL_messageActionStarGift.converted) && tL_messageActionStarGift.convert_stars > j12 && vp.r1(i12).F6 - (ConnectionsManager.getInstance(i12).getCurrentTime() - jjVar.k.date) > 0 && !tL_messageActionStarGift.refunded;
                            if (tL_messageActionStarGift.refunded) {
                                W2 = cd.K0(2131750474);
                            } else {
                                TLRPC.TL_textWithEntities tL_textWithEntities = tL_messageActionStarGift.message;
                                if (tL_textWithEntities != null && !TextUtils.isEmpty(tL_textWithEntities.text)) {
                                    SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder(tL_messageActionStarGift.message.text);
                                    textPaint.setTextSize(org.telegram.messenger.i0.L(13.0f));
                                    jj.a(spannableStringBuilder4, tL_messageActionStarGift.message.entities, false, true, true);
                                    W2 = jj.y5(textPaint.getFontMetricsInt(), org.telegram.messenger.k6.m(spannableStringBuilder4, textPaint.getFontMetricsInt(), false, null, 0), tL_messageActionStarGift.message.entities);
                                } else if (tL_messageActionStarGift.auction_acquired) {
                                    W2 = cd.Z(2131750429, cd.E(tL_messageActionStarGift.gift.stars + tL_messageActionStarGift.upgrade_stars, ','));
                                } else if (z11) {
                                    W2 = tL_messageActionStarGift.converted ? cd.I((int) j11, "Gift2ActionConvertedInfo") : (!z14 || j11 <= j12) ? org.telegram.messenger.i0.W2(cd.K0(2131750467)) : org.telegram.messenger.i0.W2(cd.I((int) j11, "Gift2ActionInfoChannel"));
                                } else if (z12) {
                                    W2 = (!tL_messageActionStarGift.converted || j11 <= j12) ? tL_messageActionStarGift.can_upgrade ? org.telegram.messenger.i0.W2(cd.K0(2131750451)) : org.telegram.messenger.i0.W2(cd.K0(2131750452)) : cd.I((int) j11, "Gift2ActionConvertedInfo");
                                } else if (z13) {
                                    W2 = org.telegram.messenger.i0.W2(jjVar.P3() ? cd.Z(2131750439, h20.k(Z1)) : cd.K0(2131750440));
                                } else {
                                    W2 = jjVar.P3() ? (!z14 || j11 <= j12) ? tL_messageActionStarGift.can_upgrade ? org.telegram.messenger.i0.W2(cd.Z(2131750460, h20.k(Z1))) : org.telegram.messenger.i0.W2(cd.Z(2131750461, h20.k(Z1))) : org.telegram.messenger.i0.W2(cd.J((int) j11, "Gift2ActionOutInfo", h20.k(Z1))) : tL_messageActionStarGift.converted ? cd.I((int) j11, "Gift2ActionConvertedInfo") : tL_messageActionStarGift.saved ? !z14 ? cd.K0(2131750475) : cd.K0(2131750454) : !z14 ? cd.K0(2131750476) : org.telegram.messenger.i0.W2(cd.I((int) j11, "Gift2ActionInfo"));
                                }
                            }
                            CharSequence charSequence8 = W2;
                            TL_stars.StarGift starGift2 = tL_messageActionStarGift.gift;
                            if (starGift2 == null || !starGift2.limited) {
                                str2 = null;
                            } else {
                                int i18 = starGift2.availability_total;
                                str2 = cd.Z(2131750144, i18 > 1500 ? org.telegram.messenger.i0.o0(i18, 0) : Integer.valueOf(i18));
                            }
                            CharSequence K02 = cd.K0(2131754626);
                            if (jjVar.P3()) {
                                charSequence5 = K02;
                                if (!tL_messageActionStarGift.forceIn) {
                                }
                            }
                            charSequence5 = K02;
                            charSequence5 = K02;
                            if (!jjVar.P3() && z13) {
                                SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder();
                                spannableStringBuilder5.append("^  ");
                                dq dqVar = new dq(R.drawable.gift_unpack);
                                dqVar.H = 0.8f;
                                dqVar.I = 0.8f;
                                spannableStringBuilder5.setSpan(dqVar, 0, 1, 33);
                                spannableStringBuilder5.append(cd.K0(2131749894));
                                charSequence5 = spannableStringBuilder5;
                            }
                            CharSequence charSequence9 = charSequence5;
                            TL_stars.StarGift starGift3 = tL_messageActionStarGift.gift;
                            D(spannableStringBuilder3, (starGift3 == null || starGift3.released_by == null || (r10 = org.telegram.messenger.o5.r(vp.r1(i12).d2(org.telegram.messenger.o5.o(tL_messageActionStarGift.gift.released_by)))) == null) ? null : rh.e4.f2(cd.Z(2131750456, "@".concat(r10))), charSequence8, false, charSequence9, 11, str2, this.i1, true);
                        } else if (messageAction5 instanceof TLRPC.TL_messageActionGiftTon) {
                            D(cd.K0(2131754624), null, this.P0.v, false, cd.K0(2131754626), 11, null, this.i1, true);
                            this.M = null;
                            this.O = 0;
                            this.P = null;
                            this.Q = 0;
                            this.S = 0;
                        } else {
                            D(cd.K0(2131754553), null, this.P0.v, false, cd.K0(2131754626), 11, null, this.i1, true);
                            this.M = null;
                            this.O = 0;
                            this.P = null;
                            this.Q = 0;
                            this.S = 0;
                        }
                    }
                } else {
                    long j13 = j10;
                    if (i17 == 33) {
                        TLRPC.TL_messageActionStarGiftPurchaseOffer tL_messageActionStarGiftPurchaseOffer = (TLRPC.TL_messageActionStarGiftPurchaseOffer) message4.action;
                        SpannableStringBuilder spannableStringBuilder6 = new SpannableStringBuilder(charSequence7);
                        spannableStringBuilder6.append((CharSequence) "\n\n");
                        if (tL_messageActionStarGiftPurchaseOffer.accepted) {
                            spannableStringBuilder6.append((CharSequence) org.telegram.messenger.i0.W2(cd.K0(2131749704)));
                        } else if (tL_messageActionStarGiftPurchaseOffer.declined) {
                            spannableStringBuilder6.append((CharSequence) org.telegram.messenger.i0.W2(cd.K0(2131749701)));
                        } else {
                            int max = Math.max(0, tL_messageActionStarGiftPurchaseOffer.expires_at - ConnectionsManager.getInstance(i12).getCurrentTime());
                            if (max == 0) {
                                spannableStringBuilder6.append((CharSequence) org.telegram.messenger.i0.W2(cd.K0(2131749703)));
                            } else {
                                int i19 = max / 60;
                                int i20 = max / 3600;
                                if (i20 > 0) {
                                    StringBuilder sb2 = new StringBuilder();
                                    i10 = 0;
                                    sb2.append(cd.G(i20, "ShortHoursAgo", new Object[0]));
                                    sb2.append(" ");
                                    sb2.append(cd.G(i19 % 60, "ShortMinutesAgo", new Object[0]));
                                    G = sb2.toString();
                                } else {
                                    i10 = 0;
                                    G = cd.G(i19, "ShortMinutesAgo", new Object[0]);
                                }
                                if (G.endsWith(".")) {
                                    G = c3.i0.m(1, i10, G);
                                }
                                Object[] objArr = new Object[1];
                                objArr[i10] = G;
                                spannableStringBuilder6.append((CharSequence) org.telegram.messenger.i0.W2(cd.Z(2131749702, objArr)));
                            }
                        }
                        D(null, null, spannableStringBuilder6, false, null, 11, null, this.i1, false);
                        this.M = null;
                        this.O = 0;
                        this.P = null;
                        this.Q = 0;
                        this.S = 0;
                    } else if (i17 == 34) {
                        D(null, null, charSequence7, false, null, 11, null, this.i1, false);
                        this.M = null;
                        this.O = 0;
                        this.P = null;
                        this.Q = 0;
                        this.S = 0;
                    } else if (i17 == 35) {
                        TLRPC.TL_messageActionNoForwardsRequest tL_messageActionNoForwardsRequest = (TLRPC.TL_messageActionNoForwardsRequest) message4.action;
                        SpannableStringBuilder spannableStringBuilder7 = new SpannableStringBuilder();
                        String u10 = org.telegram.messenger.o5.u(vp.r1(i12).Z1(Long.valueOf(jjVar.A0())));
                        if (tL_messageActionNoForwardsRequest.new_value) {
                            spannableStringBuilder7.append(jjVar.N3() ? cd.K0(2131745398) : org.telegram.messenger.i0.W2(cd.Z(2131745401, u10)));
                        } else {
                            spannableStringBuilder7.append(jjVar.N3() ? cd.K0(2131745387) : org.telegram.messenger.i0.W2(cd.Z(2131745390, u10)));
                        }
                        if (tL_messageActionNoForwardsRequest.new_value) {
                            spannableStringBuilder7.append((CharSequence) "\n\n");
                            spannableStringBuilder7.append((CharSequence) G(cd.K0(2131745408)));
                            spannableStringBuilder7.append((CharSequence) "\n\n");
                            spannableStringBuilder7.append((CharSequence) G(cd.K0(2131745407)));
                            spannableStringBuilder7.append((CharSequence) "\n\n");
                            spannableStringBuilder7.append((CharSequence) G(cd.K0(2131745406)));
                            spannableStringBuilder7.append((CharSequence) "\n\n");
                            spannableStringBuilder7.append((CharSequence) G(cd.K0(2131745405)));
                        } else {
                            spannableStringBuilder7.append((CharSequence) "\n\n");
                            spannableStringBuilder7.append((CharSequence) G(cd.K0(2131745397)));
                            spannableStringBuilder7.append((CharSequence) "\n\n");
                            spannableStringBuilder7.append((CharSequence) G(cd.K0(2131745396)));
                            spannableStringBuilder7.append((CharSequence) "\n\n");
                            spannableStringBuilder7.append((CharSequence) G(cd.K0(2131745395)));
                            spannableStringBuilder7.append((CharSequence) "\n\n");
                            spannableStringBuilder7.append((CharSequence) G(cd.K0(2131745394)));
                        }
                        D(null, null, spannableStringBuilder7, false, null, 11, null, this.i1, false);
                        this.M = null;
                        this.O = 0;
                        this.P = null;
                        this.Q = 0;
                        this.S = 0;
                    } else if (i17 == 31) {
                        TL_stars.StarGift starGift4 = ((TLRPC.TL_chatThemeUniqueGift) ((TLRPC.TL_messageActionSetChatTheme) message4.action).theme).gift;
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(starGift4.title);
                        sb3.append(" #");
                        String k10 = i0.a.k(starGift4.num, ',', sb3);
                        long Z03 = jjVar.Z0();
                        D(null, null, org.telegram.messenger.i0.W2(d20.i(i12).e() == Z03 ? cd.Z(2131749606, k10) : cd.Z(2131749607, org.telegram.messenger.o5.s(i12, Z03), k10)), false, cd.K0(2131749608), 11, null, this.i1, true);
                        this.M = null;
                        this.O = 0;
                        this.P = null;
                        this.Q = 0;
                        this.S = 0;
                    } else if (i17 == 37) {
                        TLRPC.TL_messageActionChangeCommunity tL_messageActionChangeCommunity = (TLRPC.TL_messageActionChangeCommunity) message4.action;
                        long o11 = org.telegram.messenger.o5.o(message4.peer_id);
                        boolean U = org.telegram.messenger.w3.U(i12, -o11);
                        boolean z15 = o11 > j13;
                        String s10 = org.telegram.messenger.o5.s(i12, org.telegram.messenger.o5.o(jjVar.k.from_id));
                        String s11 = org.telegram.messenger.o5.s(i12, -tL_messageActionChangeCommunity.community_id);
                        SpannableStringBuilder spannableStringBuilder8 = new SpannableStringBuilder();
                        spannableStringBuilder8.append((CharSequence) yh.f0.a(jjVar, s11, s10, U, z15));
                        D(null, null, spannableStringBuilder8, false, cd.K0(2131749608), 11, null, this.i1, true);
                        this.M = null;
                        this.O = 0;
                        this.P = null;
                        this.Q = 0;
                        this.S = 0;
                    } else if (i17 == 18) {
                        TLRPC.MessageAction messageAction6 = message4.action;
                        TLRPC.TL_textWithEntities tL_textWithEntities2 = messageAction6 instanceof TLRPC.TL_messageActionGiftPremium ? ((TLRPC.TL_messageActionGiftPremium) messageAction6).message : messageAction6 instanceof TLRPC.TL_messageActionGiftCode ? ((TLRPC.TL_messageActionGiftCode) messageAction6).message : null;
                        if (tL_textWithEntities2 == null || TextUtils.isEmpty(tL_textWithEntities2.text)) {
                            charSequence4 = null;
                        } else {
                            SpannableStringBuilder spannableStringBuilder9 = new SpannableStringBuilder(tL_textWithEntities2.text);
                            textPaint.setTextSize(org.telegram.messenger.i0.L(13.0f));
                            jj.a(spannableStringBuilder9, tL_textWithEntities2.entities, false, true, true);
                            charSequence4 = jj.y5(textPaint.getFontMetricsInt(), org.telegram.messenger.k6.m(spannableStringBuilder9, textPaint.getFontMetricsInt(), false, null, 0), tL_textWithEntities2.entities);
                        }
                        if (charSequence4 == null) {
                            charSequence4 = cd.K0(2131754641);
                        }
                        CharSequence charSequence10 = charSequence4;
                        jj jjVar3 = this.P0;
                        CharSequence K03 = cd.K0((jjVar3 == null || !(jjVar3.k.action instanceof TLRPC.TL_messageActionGiftCode) || Y()) ? 2131754634 : 2131749669);
                        TLRPC.MessageAction messageAction7 = jjVar.k.action;
                        int i21 = messageAction7.months;
                        if (i21 >= 1) {
                            D(cd.I(i21, "ActionGiftPremiumTitle2"), null, charSequence10, true, K03, 11, null, this.i1, false);
                        } else {
                            D(cd.I(messageAction7.days, "ActionGiftPremiumTitle2Days"), null, charSequence10, true, K03, 11, null, this.i1, false);
                        }
                    } else if (i17 == 21) {
                        TLRPC.TL_messageActionSuggestProfilePhoto tL_messageActionSuggestProfilePhoto = (TLRPC.TL_messageActionSuggestProfilePhoto) message4.action;
                        TLRPC.User Z13 = vp.r1(i12).Z1(Long.valueOf(jjVar.P3() ? j13 : jjVar.A0()));
                        boolean z16 = tL_messageActionSuggestProfilePhoto.video || !((photo = tL_messageActionSuggestProfilePhoto.photo) == null || (arrayList2 = photo.video_sizes) == null || arrayList2.isEmpty());
                        if (Z13.id == d20.i(i12).n) {
                            TLRPC.User Z14 = vp.r1(i12).Z1(Long.valueOf(jjVar.A0()));
                            Z = z16 ? cd.Z(2131754544, Z14.first_name) : cd.Z(2131754548, Z14.first_name);
                        } else {
                            Z = z16 ? cd.Z(2131754542, Z13.first_name) : cd.Z(2131754546, Z13.first_name);
                        }
                        D(null, null, Z, false, (tL_messageActionSuggestProfilePhoto.video || !((arrayList = tL_messageActionSuggestProfilePhoto.photo.video_sizes) == null || arrayList.isEmpty())) ? cd.K0(2131743565) : cd.K0(2131743573), 11, null, this.i1, true);
                        this.M = null;
                        this.O = 0;
                        this.P = null;
                        this.Q = 0;
                        this.S = 0;
                    } else if (i17 == 22) {
                        TLRPC.User Z15 = vp.r1(i12).Z1(Long.valueOf(jjVar.P3() ? j13 : jjVar.A0()));
                        if (jjVar.A0() < j13) {
                            charSequence3 = jjVar.v;
                        } else if (!jjVar.P3() && jjVar.Y4() && jjVar.S2()) {
                            charSequence2 = jjVar.v;
                            K0 = cd.K0(2131746301);
                            z10 = false;
                            D(null, null, charSequence2, false, K0, 11, null, this.i1, z10);
                            this.M = null;
                            this.O = 0;
                            this.P = null;
                            this.Q = 0;
                            this.S = 0;
                        } else if (Z15 == null || Z15.id != d20.i(i12).n) {
                            charSequence2 = jjVar.v;
                            K0 = cd.K0(2131743564);
                            z10 = true;
                            D(null, null, charSequence2, false, K0, 11, null, this.i1, z10);
                            this.M = null;
                            this.O = 0;
                            this.P = null;
                            this.Q = 0;
                            this.S = 0;
                        } else {
                            charSequence3 = jjVar.v;
                        }
                        charSequence2 = charSequence3;
                        K0 = null;
                        z10 = true;
                        D(null, null, charSequence2, false, K0, 11, null, this.i1, z10);
                        this.M = null;
                        this.O = 0;
                        this.P = null;
                        this.Q = 0;
                        this.S = 0;
                    } else if (jjVar.z4()) {
                        TLRPC.User Z16 = vp.r1(i12).Z1(Long.valueOf(jjVar.k.media.user_id));
                        D(null, null, Z16.self ? org.telegram.messenger.i0.W2(cd.Z(2131744465, vp.r1(i12).Z1(Long.valueOf(jjVar.A0())).first_name)) : org.telegram.messenger.i0.W2(cd.Z(2131744633, Z16.first_name)), false, cd.K0(2131744634), 11, null, this.i1, true);
                        this.M = null;
                        this.O = 0;
                        this.P = null;
                        this.Q = 0;
                        this.S = 0;
                    }
                }
            }
        }
        int L2 = org.telegram.messenger.i0.L(12.0f);
        sg.p0 p0Var = this.E0;
        p0Var.b = L2;
        p0Var.o(this.V - org.telegram.messenger.i0.L(24.0f), 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:77:0x0369  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x036c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean y(MotionEvent motionEvent) {
        int i10;
        int i11;
        org.telegram.messenger.s2 s2Var;
        jj jjVar;
        TLRPC.Message message;
        jj jjVar2;
        TLRPC.Message message2;
        TLRPC.Message message3;
        char c10;
        int i12;
        long j10;
        TLObject L0;
        String str;
        Context context;
        boolean z10;
        String a02;
        SpannableStringBuilder W2;
        boolean z11;
        ArrayList arrayList = this.X1;
        if (!arrayList.isEmpty()) {
            int x10 = (int) motionEvent.getX();
            int y3 = (int) motionEvent.getY();
            float width = (getWidth() - this.i1) / 2.0f;
            float f7 = 4.0f;
            float L = org.telegram.messenger.i0.L(4.0f) + org.telegram.messenger.i0.L(4.0f) + this.S + this.O + this.f;
            float L2 = (this.i1 - org.telegram.messenger.i0.L(4.0f)) / 2.0f;
            int action = motionEvent.getAction();
            org.telegram.ui.ActionBar.p6 p6Var = this.g1;
            if (action == 0) {
                this.l2 = -1;
                int i13 = 0;
                while (i13 < arrayList.size()) {
                    c0 c0Var = (c0) arrayList.get(i13);
                    float L3 = ((org.telegram.messenger.i0.L(f7) + L2) * i13) + width;
                    RectF rectF = org.telegram.messenger.i0.P;
                    rectF.set(L3, L, L3 + L2, c0Var.f + L);
                    float f10 = x10;
                    float f11 = y3;
                    if (rectF.contains(f10, f11)) {
                        this.l2 = i13;
                        U();
                        if (c0Var.s == null) {
                            y a03 = org.telegram.ui.ActionBar.t6.a0(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.bd, p6Var), 6, 6);
                            c0Var.s = a03;
                            a03.setCallback(this);
                        }
                        c0Var.s.setHotspot(f10, f11);
                        c0Var.s.setState(this.k2);
                        c0Var.b(!c0Var.m);
                        return true;
                    }
                    i13++;
                    f7 = 4.0f;
                }
            } else {
                int i14 = 3;
                if (motionEvent.getAction() == 1) {
                    if (this.l2 != -1) {
                        playSoundEffect(0);
                        c0 c0Var2 = (c0) arrayList.get(this.l2);
                        y yVar = c0Var2.s;
                        if (yVar != null) {
                            yVar.setState(StateSet.NOTHING);
                        }
                        c0Var2.b(false);
                        if (this.f1 == null || c0Var2.m || (s2Var = c0Var2.j) == null) {
                            i11 = -1;
                        } else {
                            if (getMessageObject() != null) {
                                int i15 = s2Var.a;
                                if (i15 == 5) {
                                    q0 q0Var = this.f1;
                                    org.telegram.ui.ActionBar.k2 h02 = q0Var != null ? q0Var.h0() : null;
                                    if (h02 != null && this.P0 != null) {
                                        org.telegram.ui.Components.s4.u0(h02, cd.L0(2131749716, null), org.telegram.messenger.i0.W2(cd.a0(null, null, 2131749717, org.telegram.messenger.o5.t(jj.B0(this.P0.k)))), cd.L0(2131749718, null), true, new ea(i14, this, h02));
                                    }
                                } else if (i15 == 6) {
                                    jj jjVar3 = this.P0;
                                    if (jjVar3 != null && (message3 = jjVar3.k) != null) {
                                        TLRPC.MessageAction messageAction = message3.action;
                                        if (messageAction instanceof TLRPC.TL_messageActionStarGiftPurchaseOffer) {
                                            TLRPC.TL_messageActionStarGiftPurchaseOffer tL_messageActionStarGiftPurchaseOffer = (TLRPC.TL_messageActionStarGiftPurchaseOffer) messageAction;
                                            org.telegram.ui.ActionBar.k2 Q = LaunchActivity.Q();
                                            Context context2 = getContext();
                                            long B0 = jj.B0(this.P0.k);
                                            int f12 = this.P0.f1();
                                            int[] iArr = rh.b0.p2;
                                            sf.a m10 = sf.a.m(tL_messageActionStarGiftPurchaseOffer.price);
                                            sf.b bVar = m10.a;
                                            int i16 = this.H;
                                            sf.b bVar2 = sf.b.a;
                                            if (bVar == bVar2) {
                                                c10 = 3;
                                                i12 = ((org.telegram.messenger.l0) vp.r1(i16).y7.n.a).c;
                                            } else {
                                                c10 = 3;
                                                i12 = ((org.telegram.messenger.l0) vp.r1(i16).y7.o.a).c;
                                            }
                                            sf.a i17 = sf.a.i((m10.b * i12) / 1000, bVar);
                                            TL_stars.StarGift starGift = tL_messageActionStarGiftPurchaseOffer.gift;
                                            StringBuilder sb2 = new StringBuilder();
                                            sb2.append(starGift.title);
                                            sb2.append(" #");
                                            String k10 = i0.a.k(starGift.num, ',', sb2);
                                            if (B0 >= 0) {
                                                j10 = 0;
                                                L0 = vp.r1(i16).Z1(Long.valueOf(B0));
                                            } else {
                                                j10 = 0;
                                                L0 = vp.r1(i16).L0(Long.valueOf(-B0));
                                            }
                                            String d = m10.d();
                                            String d10 = i17.d();
                                            if (bVar == sf.b.b) {
                                                str = k10;
                                                context = context2;
                                                z10 = true;
                                            } else {
                                                str = k10;
                                                context = context2;
                                                z10 = false;
                                            }
                                            LinearLayout f13 = org.telegram.messenger.m5.f(context, 1);
                                            f13.addView(new rh.c3(context, starGift, L0), w7.b6.t(-1, -2, 48, 0, -4, 0, 0));
                                            TextView textView = new TextView(context);
                                            org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.j5, p6Var);
                                            textView.setTextSize(1, 16.0f);
                                            if (bVar == bVar2) {
                                                String t10 = org.telegram.messenger.o5.t(B0);
                                                Object[] objArr = new Object[4];
                                                objArr[0] = d;
                                                objArr[1] = t10;
                                                objArr[2] = str;
                                                objArr[c10] = d10;
                                                a02 = cd.a0(null, null, 2131749694, objArr);
                                            } else {
                                                String t11 = org.telegram.messenger.o5.t(B0);
                                                Object[] objArr2 = new Object[4];
                                                objArr2[0] = d;
                                                objArr2[1] = t11;
                                                objArr2[2] = str;
                                                objArr2[c10] = d10;
                                                a02 = cd.a0(null, null, 2131749693, objArr2);
                                            }
                                            textView.setText(org.telegram.messenger.i0.W2(a02));
                                            f13.addView(textView, w7.b6.t(-1, -2, 48, 24, 4, 24, 4));
                                            FrameLayout frameLayout = new FrameLayout(context);
                                            frameLayout.setClipChildren(false);
                                            frameLayout.setClipToPadding(false);
                                            wy0 wy0Var = new wy0(context, p6Var);
                                            frameLayout.addView(wy0Var, w7.b6.e(-1, -1, zs.E1));
                                            rh.e4.k1(wy0Var, rh.e6.l(starGift.attributes, TL_stars.starGiftAttributeModel.class));
                                            rh.e4.k1(wy0Var, rh.e6.l(starGift.attributes, TL_stars.starGiftAttributeBackdrop.class));
                                            rh.e4.k1(wy0Var, rh.e6.l(starGift.attributes, TL_stars.starGiftAttributePattern.class));
                                            f13.addView(frameLayout, w7.b6.t(-1, -2, 48, 23, 16, 23, 4));
                                            sf.a j11 = sf.a.j(starGift.value_usd_amount / Math.pow(10.0d, org.telegram.messenger.u1.i().h("USD")), bVar);
                                            if (j11.c() > 0.0d && starGift.value_usd_amount > j10) {
                                                if (j11.b >= i17.b) {
                                                    int round = (int) Math.round((1.0d - (i17.c() / j11.c())) * 100.0d);
                                                    W2 = org.telegram.messenger.i0.W2(cd.a0(null, null, 2131749743, a1.g.k(round, "%"), starGift.title));
                                                    if (round > 10) {
                                                        z11 = true;
                                                        TextView textView2 = new TextView(context);
                                                        textView2.setTextSize(1, 13.0f);
                                                        textView2.setGravity(17);
                                                        textView2.setText(W2);
                                                        org.telegram.ui.ActionBar.a7.V(textView2, !z11 ? org.telegram.ui.ActionBar.t6.p7 : org.telegram.ui.ActionBar.t6.y6, p6Var);
                                                        f13.addView(textView2, w7.b6.t(-1, -2, 49, 40, 12, 40, 9));
                                                    }
                                                } else {
                                                    W2 = org.telegram.messenger.i0.W2(cd.a0(null, null, 2131749746, a1.g.k((int) Math.round(((i17.c() / j11.c()) - 1.0d) * 100.0d), "%"), starGift.title));
                                                }
                                                z11 = false;
                                                TextView textView22 = new TextView(context);
                                                textView22.setTextSize(1, 13.0f);
                                                textView22.setGravity(17);
                                                textView22.setText(W2);
                                                org.telegram.ui.ActionBar.a7.V(textView22, !z11 ? org.telegram.ui.ActionBar.t6.p7 : org.telegram.ui.ActionBar.t6.y6, p6Var);
                                                f13.addView(textView22, w7.b6.t(-1, -2, 49, 40, 12, 40, 9));
                                            }
                                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, p6Var);
                                            alertDialog$Builder.o(f13);
                                            alertDialog$Builder.k(rh.h8.U0(cd.a0(null, null, 2131749711, d10), z10), new ht(f12, i16, Q));
                                            alertDialog$Builder.h(cd.L0(2131752589, null), null);
                                            alertDialog$Builder.a.show();
                                        }
                                    }
                                } else {
                                    if (i15 == 7) {
                                        q0 q0Var2 = this.f1;
                                        org.telegram.ui.ActionBar.k2 h03 = q0Var2 != null ? q0Var2.h0() : null;
                                        if (h03 != null && (jjVar2 = this.P0) != null && (message2 = jjVar2.k) != null) {
                                            TLRPC.MessageAction messageAction2 = message2.action;
                                            if (messageAction2 instanceof TLRPC.TL_messageActionNoForwardsRequest) {
                                                final TLRPC.TL_messageActionNoForwardsRequest tL_messageActionNoForwardsRequest = (TLRPC.TL_messageActionNoForwardsRequest) messageAction2;
                                                final int i18 = 0;
                                                org.telegram.ui.Components.s4.u0(h03, cd.L0(tL_messageActionNoForwardsRequest.prev_value ? 2131745403 : 2131745392, null), cd.L0(tL_messageActionNoForwardsRequest.prev_value ? 2131745404 : 2131745393, null), cd.L0(2131745409, null), false, new Runnable(this) { // from class: org.telegram.ui.Cells.n0
                                                    public final /* synthetic */ s0 b;

                                                    {
                                                        this.b = this;
                                                    }

                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        switch (i18) {
                                                            case 0:
                                                                s0 s0Var = this.b;
                                                                vp.r1(s0Var.H).a5(jj.B0(s0Var.P0.k), s0Var.P0.f1(), tL_messageActionNoForwardsRequest.prev_value, null);
                                                                break;
                                                            default:
                                                                s0 s0Var2 = this.b;
                                                                vp.r1(s0Var2.H).a5(jj.B0(s0Var2.P0.k), s0Var2.P0.f1(), tL_messageActionNoForwardsRequest.new_value, null);
                                                                break;
                                                        }
                                                    }
                                                });
                                            }
                                        }
                                    } else if (i15 == 8) {
                                        q0 q0Var3 = this.f1;
                                        org.telegram.ui.ActionBar.k2 h04 = q0Var3 != null ? q0Var3.h0() : null;
                                        if (h04 != null && (jjVar = this.P0) != null && (message = jjVar.k) != null) {
                                            TLRPC.MessageAction messageAction3 = message.action;
                                            if (messageAction3 instanceof TLRPC.TL_messageActionNoForwardsRequest) {
                                                final TLRPC.TL_messageActionNoForwardsRequest tL_messageActionNoForwardsRequest2 = (TLRPC.TL_messageActionNoForwardsRequest) messageAction3;
                                                final int i19 = 1;
                                                org.telegram.ui.Components.s4.u0(h04, cd.L0(tL_messageActionNoForwardsRequest2.new_value ? 2131745403 : 2131745392, null), cd.L0(tL_messageActionNoForwardsRequest2.new_value ? 2131745402 : 2131745391, null), cd.L0(2131745409, null), false, new Runnable(this) { // from class: org.telegram.ui.Cells.n0
                                                    public final /* synthetic */ s0 b;

                                                    {
                                                        this.b = this;
                                                    }

                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        switch (i19) {
                                                            case 0:
                                                                s0 s0Var = this.b;
                                                                vp.r1(s0Var.H).a5(jj.B0(s0Var.P0.k), s0Var.P0.f1(), tL_messageActionNoForwardsRequest2.prev_value, null);
                                                                break;
                                                            default:
                                                                s0 s0Var2 = this.b;
                                                                vp.r1(s0Var2.H).a5(jj.B0(s0Var2.P0.k), s0Var2.P0.f1(), tL_messageActionNoForwardsRequest2.new_value, null);
                                                                break;
                                                        }
                                                    }
                                                });
                                            }
                                        }
                                    }
                                }
                            }
                            i11 = -1;
                        }
                        this.l2 = i11;
                        U();
                        return false;
                    }
                } else if (motionEvent.getAction() == 3 && (i10 = this.l2) != -1) {
                    c0 c0Var3 = (c0) arrayList.get(i10);
                    y yVar2 = c0Var3.s;
                    if (yVar2 != null) {
                        yVar2.setState(StateSet.NOTHING);
                    }
                    c0Var3.b(false);
                    this.l2 = -1;
                    U();
                    return false;
                }
            }
        }
        return false;
    }

    public final void z() {
        float f7 = this.a1;
        RectF rectF = this.c1;
        this.a1 = (int) Math.min(f7, rectF.left);
        this.b1 = (int) Math.max(this.b1, rectF.right);
    }

    public s0(Context context, org.telegram.ui.ActionBar.p6 p6Var, boolean z10) {
        super(context);
        this.n = new dc(this);
        int i10 = d20.s0;
        this.H = i10;
        th.t5 t5Var = new th.t5(null, false);
        this.d0 = t5Var;
        this.m0 = true;
        this.o0 = new RectF();
        this.p0 = new ArrayList();
        this.q0 = new Stack();
        this.E0 = new sg.p0(this);
        this.N0 = new RectF();
        this.T0 = -1;
        this.U0 = -1;
        this.X0 = new ArrayList();
        this.Y0 = new ArrayList();
        this.Z0 = new Path();
        this.c1 = new RectF();
        this.d1 = true;
        this.e1 = false;
        this.n1 = false;
        this.o1 = false;
        this.q1 = new org.telegram.ui.Components.t5(this, 0L, 320L, gr.h);
        this.y1 = true;
        TextPaint textPaint = new TextPaint(1);
        this.E1 = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.F1 = textPaint2;
        TextPaint textPaint3 = new TextPaint(1);
        this.G1 = textPaint3;
        this.J1 = new RadialProgress2(this, null);
        this.N1 = new ca(this, 2);
        this.U1 = new Path();
        this.X1 = new ArrayList();
        this.a2 = -1;
        this.c2 = new Paint(1);
        this.g2 = new Path();
        this.h2 = new float[8];
        this.i2 = new float[8];
        this.j2 = new Path();
        this.k2 = new int[]{android.R.attr.state_enabled, android.R.attr.state_pressed};
        this.r2 = new r0(this);
        t5Var.a = false;
        this.s = z10;
        this.g1 = p6Var;
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.I = imageReceiver;
        imageReceiver.J0(org.telegram.messenger.i0.u / 2);
        this.L = new org.telegram.ui.Components.r8((org.telegram.ui.ActionBar.p6) null);
        this.x = org.telegram.messenger.b6.q(i10).k();
        textPaint.setTextSize(TypedValue.applyDimension(1, 16.0f, getResources().getDisplayMetrics()));
        textPaint3.setTextSize(TypedValue.applyDimension(1, 15.0f, getResources().getDisplayMetrics()));
        textPaint2.setTextSize(TypedValue.applyDimension(1, 15.0f, getResources().getDisplayMetrics()));
        View view = new View(context);
        this.T1 = view;
        view.setBackground(org.telegram.ui.ActionBar.t6.h0(org.telegram.ui.ActionBar.t6.r1(0.1f, -16777216), 7, org.telegram.messenger.i0.L(16.0f)));
        view.setVisibility(8);
        addView(view);
        kg.f2 f2Var = new kg.f2(10);
        this.V1 = f2Var;
        f2Var.O = 100;
        f2Var.J = false;
        f2Var.M = true;
        f2Var.G = false;
        f2Var.K = true;
        f2Var.H = true;
        f2Var.r = 1;
        f2Var.w = 0.98f;
        f2Var.v = 0.98f;
        f2Var.u = 0.98f;
        f2Var.g = false;
        f2Var.o = 0.0f;
        f2Var.x = 750L;
        f2Var.y = 750;
        f2Var.c();
    }

    @Override // android.view.View
    public final void invalidate(Rect rect) {
        super.invalidate(rect);
        View view = this.w;
        if (view != null) {
            view.invalidate();
        }
        if (!this.n2 || getParent() == null) {
            return;
        }
        View view2 = (View) getParent();
        if (view2.getParent() != null) {
            view2.invalidate();
            ((View) view2.getParent()).invalidate();
        }
    }

    @Override // android.view.View
    public final void invalidate(int i10, int i11, int i12, int i13) {
        super.invalidate(i10, i11, i12, i13);
        View view = this.w;
        if (view != null) {
            view.invalidate();
        }
        if (!this.n2 || getParent() == null) {
            return;
        }
        View view2 = (View) getParent();
        if (view2.getParent() != null) {
            view2.invalidate();
            ((View) view2.getParent()).invalidate();
        }
    }

    @Override // org.telegram.messenger.z5
    public final void C(boolean z10) {
    }

    @Override // org.telegram.ui.Cells.r4
    public final /* synthetic */ void b(boolean z10, boolean z11) {
    }

    @Override // org.telegram.messenger.z5
    public final void i(long j10, long j11) {
    }

    @Override // org.telegram.messenger.z5
    public final void n(long j10, long j11) {
    }
}
