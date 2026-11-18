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
import c8.dd;
import di.fb;
import di.pb;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Stack;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.bz;
import org.telegram.messenger.fc;
import org.telegram.messenger.fj;
import org.telegram.messenger.fs;
import org.telegram.messenger.gd;
import org.telegram.messenger.j10;
import org.telegram.messenger.kj;
import org.telegram.messenger.ks;
import org.telegram.messenger.lz;
import org.telegram.messenger.mp;
import org.telegram.messenger.n10;
import org.telegram.messenger.o10;
import org.telegram.messenger.pc;
import org.telegram.messenger.q10;
import org.telegram.messenger.ri;
import org.telegram.messenger.tr;
import org.telegram.messenger.xi;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.RadialProgress2;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.cy0;
import org.telegram.ui.Components.i41;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.lq;
import org.telegram.ui.Components.lr;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.mh0;
import org.telegram.ui.Components.o80;
import org.telegram.ui.Components.p41;
import org.telegram.ui.Components.q01;
import org.telegram.ui.Components.tw0;
import org.telegram.ui.Components.u30;
import org.telegram.ui.Components.vy0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.en;
import org.telegram.ui.jj;
import org.telegram.ui.k71;
import org.telegram.ui.lb;
import org.telegram.ui.pl;
import org.telegram.ui.rf;
import org.telegram.ui.vf;
import org.telegram.ui.xw0;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public class u0 extends z implements org.telegram.messenger.y5, fs, p4 {
    public static final HashMap B2;
    public float A0;
    public TextPaint A1;
    public final t0 A2;
    public float B0;
    public StaticLayout B1;
    public float C0;
    public float C1;
    public boolean D0;
    public StaticLayout D1;
    public xh.f E;
    public boolean E0;
    public float E1;
    public boolean F;
    public final ch.q0 F0;
    public final TextPaint F1;
    public boolean G;
    public float G0;
    public final TextPaint G1;
    public boolean H;
    public float H0;
    public final TextPaint H1;
    public final int I;
    public di.h6 I0;
    public TLRPC.Document I1;
    public final ImageReceiver J;
    public org.telegram.ui.Wallet.m4 J0;
    public TLRPC.VideoSize J1;
    public Drawable K;
    public boolean K0;
    public final RadialProgress2 K1;
    public Path L;
    public float L0;
    public int L1;
    public final org.telegram.ui.Components.b9 M;
    public float M0;
    public boolean M1;
    public StaticLayout N;
    public float N0;
    public RectF N1;
    public int O;
    public final RectF O0;
    public final da O1;
    public int P;
    public tw0 P0;
    public boolean P1;
    public StaticLayout Q;
    public fj Q0;
    public ColorMatrixColorFilter Q1;
    public int R;
    public int R0;
    public CornerPathEffect R1;
    public int S;
    public CharSequence S0;
    public Path S1;
    public int T;
    public bi.y2 T0;
    public vy0 T1;
    public int U;
    public int U0;
    public final View U1;
    public int V;
    public int V0;
    public final Path V1;
    public int W;
    public Paint W0;
    public final ug.t1 W1;
    public TextPaint X0;
    public int X1;
    public final ArrayList Y0;
    public final ArrayList Y1;
    public final ArrayList Z0;
    public b3.j Z1;
    public boolean a0;
    public final Path a1;
    public boolean a2;
    public boolean b0;
    public int b1;
    public int b2;
    public RadialProgressView c0;
    public int c1;
    public TLRPC.TL_messageActionStarGiftOnchainOffer c2;
    public float d0;
    public final RectF d1;
    public boolean d2;
    public final fi.e7 e0;
    public boolean e1;
    public int e2;
    public int f;
    public boolean f0;
    public boolean f1;
    public bi.f3 f2;
    public boolean g0;
    public r0 g1;
    public ArrayList g2;
    public int h;
    public boolean h0;
    public final org.telegram.ui.ActionBar.i6 h1;
    public final ArrayList h2;
    public boolean i0;
    public int i1;
    public int i2;
    public boolean j0;
    public int j1;
    public boolean j2;
    public int k0;
    public StaticLayout k1;
    public float k2;
    public boolean l0;
    public Paint l1;
    public final Paint l2;
    public int m0;
    public vy0 m1;
    public boolean m2;
    public final mc n;
    public boolean n0;
    public StaticLayout n1;
    public View.OnClickListener n2;
    public q01 o0;
    public boolean o1;
    public int o2;
    public final RectF p0;
    public boolean p1;
    public final Path p2;
    public final ArrayList q0;
    public int q1;
    public final float[] q2;
    public o80 r;
    public final Stack r0;
    public final org.telegram.ui.Components.c6 r1;
    public final float[] r2;
    public final boolean s;
    public org.telegram.ui.Components.t5 s0;
    public h6.m s1;
    public final Path s2;
    public TextPaint t0;
    public s0 t1;
    public final int[] t2;
    public float u0;
    public int u1;
    public int u2;
    public float v0;
    public int v1;
    public SpannableStringBuilder v2;
    public View w;
    public int w0;
    public int w1;
    public boolean w2;
    public final int x;
    public boolean x0;
    public vy0 x1;
    public Runnable x2;
    public URLSpan y;
    public fc y0;
    public StaticLayout y1;
    public PorterDuffColorFilter y2;
    public float z0;
    public boolean z1;
    public int z2;

    static {
        HashMap hashMap = new HashMap();
        B2 = hashMap;
        i5.c.u(1, hashMap, "1⃣", 3, "2⃣");
        i5.c.u(6, hashMap, "3⃣", 12, "4⃣");
        hashMap.put(24, "5⃣");
    }

    public u0(Context context) {
        this(context, null, false);
    }

    public static SpannableStringBuilder F(String str) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.g0.J2(str, false, org.telegram.messenger.g0.L(6.0f), -org.telegram.messenger.g0.L(1.3f), 0.8f, R.drawable.floating_check));
        spannableStringBuilder.insert(0, (CharSequence) "*");
        spannableStringBuilder.setSpan(new r2(org.telegram.messenger.g0.L(18.0f)), 0, 1, 33);
        if (Build.VERSION.SDK_INT >= 29) {
            android.support.v4.media.session.w.l();
            spannableStringBuilder.setSpan(android.support.v4.media.session.w.g(org.telegram.messenger.g0.L(12.0f)), 0, spannableStringBuilder.length(), 33);
        }
        spannableStringBuilder.setSpan(new AlignmentSpan.Standard(Layout.Alignment.ALIGN_NORMAL), 0, spannableStringBuilder.length(), 33);
        return spannableStringBuilder;
    }

    public static float c0(StaticLayout staticLayout) {
        float f10 = 0.0f;
        for (int i7 = 0; i7 < staticLayout.getLineCount(); i7++) {
            float ceil = (int) Math.ceil(staticLayout.getLineWidth(i7));
            if (ceil > f10) {
                f10 = ceil;
            }
        }
        return f10;
    }

    private float getWalletActionTop() {
        return org.telegram.messenger.g0.L(11.0f) + this.T + this.P;
    }

    private void setStarsPaused(boolean z10) {
        ug.t1 t1Var = this.W1;
        if (z10 == t1Var.g) {
            return;
        }
        t1Var.g = z10;
        if (z10) {
            t1Var.R = System.currentTimeMillis();
            return;
        }
        for (int i7 = 0; i7 < t1Var.n.size(); i7++) {
            ug.s1 s1Var = (ug.s1) t1Var.n.get(i7);
            s1Var.a = (System.currentTimeMillis() - t1Var.R) + s1Var.a;
        }
        invalidate();
    }

    public final void A() {
        SpannableStringBuilder spannableStringBuilder;
        int L = this.j1 - org.telegram.messenger.g0.L(16.0f);
        float L2 = org.telegram.messenger.g0.L(14.0f);
        TextPaint textPaint = this.F1;
        textPaint.setTextSize(L2);
        float L3 = org.telegram.messenger.g0.L(13.0f);
        TextPaint textPaint2 = this.G1;
        textPaint2.setTextSize(L3);
        TLRPC.TL_messageActionGiftCode tL_messageActionGiftCode = (TLRPC.TL_messageActionGiftCode) this.Q0.k.action;
        int i7 = tL_messageActionGiftCode.months;
        TLRPC.Chat O0 = mp.u1(this.I).O0(Long.valueOf(-org.telegram.messenger.n5.o(tL_messageActionGiftCode.boost_peer)));
        String str = O0 == null ? null : O0.title;
        boolean z10 = tL_messageActionGiftCode.via_giveaway;
        String M0 = tL_messageActionGiftCode.unclaimed ? gd.M0(2131753174, "BoostingUnclaimedPrize") : gd.M0(2131753540, "BoostingCongratulations");
        String G = i7 == 12 ? gd.G(1, "BoldYears", new Object[0]) : gd.G(i7, "BoldMonths", new Object[0]);
        if (!z10) {
            spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.g0.W2(str == null ? gd.M0(2131753308, null) : gd.a0("BoostingReceivedGiftFrom", null, 2131753309, str)));
            spannableStringBuilder.append((CharSequence) "\n\n");
            org.telegram.messenger.f3.p(null, null, 2131753310, new Object[]{G}, spannableStringBuilder);
        } else if (tL_messageActionGiftCode.unclaimed) {
            spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.g0.W2(gd.a0(null, null, 2131753164, str)));
            spannableStringBuilder.append((CharSequence) "\n\n");
            org.telegram.messenger.f3.p(null, null, 2131753173, new Object[]{G}, spannableStringBuilder);
        } else {
            spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.g0.W2(gd.a0(null, null, 2131753305, str)));
            spannableStringBuilder.append((CharSequence) "\n\n");
            org.telegram.messenger.f3.p(null, null, 2131753306, new Object[]{G}, spannableStringBuilder);
        }
        String M02 = gd.M0(2131753307, "BoostingReceivedGiftOpenBtn");
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(M0);
        valueOf.setSpan(new i41(org.telegram.messenger.g0.o()), 0, valueOf.length(), 33);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        this.k1 = new StaticLayout(valueOf, textPaint, L, alignment, 1.1f, 0.0f, false);
        this.n1 = null;
        this.m1 = null;
        s0 s0Var = this.t1;
        if (s0Var != null) {
            org.telegram.ui.Components.x5.release((u0) s0Var.i, (org.telegram.ui.Components.t5) s0Var.h);
        }
        s0 s0Var2 = new s0(this);
        this.t1 = s0Var2;
        s0Var2.a(spannableStringBuilder, textPaint2, L);
        SpannableStringBuilder valueOf2 = SpannableStringBuilder.valueOf(M02);
        valueOf2.setSpan(new i41(org.telegram.messenger.g0.o()), 0, valueOf2.length(), 33);
        this.p1 = false;
        this.q1 = 0;
        this.x1 = null;
        StaticLayout staticLayout = new StaticLayout(valueOf2, (TextPaint) R("paintChatActionText"), L, alignment, 1.0f, 0.0f, false);
        this.y1 = staticLayout;
        this.z1 = true;
        this.E1 = c0(staticLayout);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v7 */
    public final void B(CharSequence charSequence, SpannableStringBuilder spannableStringBuilder, CharSequence charSequence2, boolean z10, CharSequence charSequence3, int i7, String str, int i10, boolean z11) {
        ?? r42;
        int i11;
        int a10;
        CharSequence charSequence4 = charSequence2;
        int L = i10 - org.telegram.messenger.g0.L(16.0f);
        fj fjVar = this.Q0;
        if (fjVar != null && fjVar.D == 30) {
            L -= org.telegram.messenger.g0.L(16.0f);
        }
        int i12 = L;
        if (charSequence != null) {
            fj fjVar2 = this.Q0;
            TextPaint textPaint = this.F1;
            if (fjVar2 == null || fjVar2.D != 30) {
                textPaint.setTextSize(org.telegram.messenger.g0.L(16.0f));
            } else {
                textPaint.setTextSize(org.telegram.messenger.g0.L(14.0f));
            }
            SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(charSequence);
            valueOf.setSpan(new i41(org.telegram.messenger.g0.o()), 0, valueOf.length(), 33);
            r42 = 0;
            this.k1 = new StaticLayout(valueOf, textPaint, i12, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
        } else {
            r42 = 0;
            this.k1 = null;
        }
        this.n1 = null;
        if (spannableStringBuilder != null) {
            vy0 vy0Var = new vy0(spannableStringBuilder, 10.0f, null);
            this.m1 = vy0Var;
            vy0Var.a.linkColor = -1;
        } else {
            this.m1 = null;
        }
        TLRPC.TL_messageActionStarGiftOnchainOffer tL_messageActionStarGiftOnchainOffer = this.c2;
        TextPaint textPaint2 = this.G1;
        if (tL_messageActionStarGiftOnchainOffer != null) {
            textPaint2.setTextSize(R("paintChatActionText").getTextSize());
        } else {
            fj fjVar3 = this.Q0;
            if (fjVar3 != null && fjVar3.D == 35) {
                textPaint2.setTextSize(org.telegram.messenger.g0.L(14.3f));
            } else if (fjVar3 == null || !(a0() || (i11 = this.Q0.D) == 30 || i11 == 18 || i11 == 31 || i11 == 37 || i11 == 33)) {
                textPaint2.setTextSize(org.telegram.messenger.g0.L(15.0f));
            } else {
                textPaint2.setTextSize(org.telegram.messenger.g0.L(13.0f));
            }
        }
        int L2 = i12 - org.telegram.messenger.g0.L(12.0f);
        fj fjVar4 = this.Q0;
        if (fjVar4 != null && fjVar4.D == 22 && fj.B0(fjVar4.k) >= 0 && (a10 = hi.m3.a(charSequence4, textPaint2)) < L2 && a10 > L2 / 5.0f) {
            L2 = a10;
        }
        if (charSequence4 == 0) {
            s0 s0Var = this.t1;
            if (s0Var != null) {
                org.telegram.ui.Components.x5.release((u0) s0Var.i, (org.telegram.ui.Components.t5) s0Var.h);
                this.t1 = null;
            }
            this.p1 = r42;
        } else {
            if (this.t1 == null) {
                this.t1 = new s0(this);
            }
            try {
                charSequence4 = org.telegram.messenger.j6.m(charSequence4, textPaint2.getFontMetricsInt(), r42, null, r42);
            } catch (Exception unused) {
            }
            this.t1.a(charSequence4, textPaint2, L2);
            if (!z10 || ((StaticLayout) this.t1.f).getLineCount() <= 3) {
                this.p1 = r42;
                this.r1.f(true, true);
                this.q1 = r42;
            } else {
                this.p1 = !this.o1;
                this.q1 = ((StaticLayout) this.t1.f).getLineBottom(2);
                this.x1 = new vy0(gd.M0(2131750249, null), textPaint2.getTextSize() / org.telegram.messenger.g0.p, org.telegram.messenger.g0.o());
                int lineBottom = ((StaticLayout) this.t1.f).getLineBottom(2);
                this.v1 = lineBottom;
                this.w1 = lineBottom - ((StaticLayout) this.t1.f).getLineTop(2);
                this.u1 = (int) ((StaticLayout) this.t1.f).getLineRight(2);
            }
            if (this.p1) {
                int lineEnd = ((StaticLayout) this.t1.f).getLineEnd(2) - 1;
                s0 s0Var2 = this.t1;
                CharSequence charSequence5 = charSequence4;
                if (lineEnd >= 0) {
                    charSequence5 = charSequence4.subSequence(r42, lineEnd);
                }
                s0Var2.a(charSequence5, textPaint2, L2);
            }
        }
        if (charSequence3 != null) {
            SpannableStringBuilder valueOf2 = SpannableStringBuilder.valueOf(charSequence3);
            valueOf2.setSpan(new i41(org.telegram.messenger.g0.o()), r42, valueOf2.length(), 33);
            StaticLayout staticLayout = new StaticLayout(valueOf2, (TextPaint) R("paintChatActionText"), i12, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
            this.y1 = staticLayout;
            this.z1 = (!z11 || this.p1) ? r42 : true;
            this.E1 = c0(staticLayout);
        } else {
            this.y1 = null;
            this.z1 = r42;
            this.E1 = 0.0f;
        }
        if (str == null) {
            this.S1 = null;
            this.T1 = null;
            return;
        }
        if (this.R1 == null) {
            this.R1 = new CornerPathEffect(org.telegram.messenger.g0.L(5.0f));
        }
        if (this.S1 == null) {
            Path path = new Path();
            this.S1 = path;
            bi.f3.d(path, 1.35f, r42);
        }
        vy0 vy0Var2 = new vy0(str, i7, org.telegram.messenger.g0.o());
        this.T1 = vy0Var2;
        vy0Var2.p = org.telegram.messenger.g0.L(62.0f);
    }

    public final void E(int i7, CharSequence charSequence) {
        CharSequence charSequence2;
        r0 r0Var;
        TLRPC.Message message;
        fj fjVar;
        int i10;
        int L = i7 - org.telegram.messenger.g0.L(30.0f);
        if (this.j0) {
            L -= org.telegram.messenger.g0.L(64.0f);
        }
        if (Z()) {
            L = Math.min(L - org.telegram.messenger.g0.L(this.j0 ? 28.0f : 82.0f), org.telegram.messenger.g0.L(272.0f));
        }
        if (L < 0) {
            return;
        }
        int i11 = this.o2;
        if (i11 > 0) {
            L = Math.min(i11, L);
        }
        int i12 = L;
        this.e1 = true;
        TextPaint textPaint = (Z() || ((fjVar = this.Q0) != null && ((i10 = fjVar.D) == 34 || i10 == 35))) ? (TextPaint) R("paintChatActionText3") : (fjVar == null || !fjVar.s2) ? (TextPaint) R("paintChatActionText") : (TextPaint) R("paintChatActionText2");
        textPaint.linkColor = textPaint.getColor();
        if (Z()) {
            if (charSequence instanceof Spannable) {
                Spannable spannable = (Spannable) charSequence;
                for (org.telegram.messenger.g6 g6Var : (org.telegram.messenger.g6[]) spannable.getSpans(0, spannable.length(), org.telegram.messenger.g6.class)) {
                    spannable.removeSpan(g6Var);
                }
            }
            charSequence2 = org.telegram.messenger.j6.n(charSequence, textPaint.getFontMetricsInt(), false, null, 0, 0.85f, 0);
        } else {
            charSequence2 = charSequence;
        }
        TextPaint textPaint2 = textPaint;
        CharSequence charSequence3 = charSequence2;
        this.N = new StaticLayout(charSequence2, textPaint2, i12, Z() ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
        this.Q = null;
        fj fjVar2 = this.Q0;
        if (fjVar2 != null && (message = fjVar2.k) != null) {
            TLRPC.MessageAction messageAction = message.action;
            if (messageAction instanceof TLRPC.TL_messageActionSuggestedPostApproval) {
                TLRPC.TL_messageActionSuggestedPostApproval tL_messageActionSuggestedPostApproval = (TLRPC.TL_messageActionSuggestedPostApproval) messageAction;
                if (!tL_messageActionSuggestedPostApproval.rejected && !tL_messageActionSuggestedPostApproval.balance_too_low) {
                    this.Q = new StaticLayout(org.telegram.messenger.j6.n(org.telegram.messenger.g0.W2(gd.M0(2131744131, null)), textPaint2.getFontMetricsInt(), false, null, 0, 1.0f, 0), textPaint2, i12, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                }
            }
        }
        this.s0 = org.telegram.ui.Components.x5.update(0, this, (!this.s || (r0Var = this.g1) == null || r0Var.h()) ? false : true, this.s0, this.N);
        this.P = 0;
        this.O = 0;
        this.R = 0;
        StaticLayout staticLayout = this.Q;
        if (staticLayout != null) {
            int height = staticLayout.getHeight();
            this.R = height;
            this.R = org.telegram.messenger.g0.L(12.0f) + height;
        }
        fj fjVar3 = this.Q0;
        if (fjVar3 == null || !fjVar3.j2) {
            try {
                int lineCount = this.N.getLineCount();
                for (int i13 = 0; i13 < lineCount; i13++) {
                    try {
                        float lineWidth = this.N.getLineWidth(i13);
                        float f10 = i12;
                        if (lineWidth > f10) {
                            lineWidth = f10;
                        }
                        this.P = (int) Math.max(this.P, Math.ceil(this.N.getLineBottom(i13)));
                        this.O = (int) Math.max(this.O, Math.ceil(lineWidth));
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.g(e10, true);
                        return;
                    }
                }
            } catch (Exception e11) {
                org.telegram.messenger.a8.g(e11, true);
            }
        }
        this.S = (i7 - this.O) / 2;
        int L2 = org.telegram.messenger.g0.L(7.0f);
        this.T = L2;
        if (this.Q != null) {
            this.T = org.telegram.messenger.f3.C(11.0f, this.R, L2);
        }
        this.U = (i7 - (Z() ? this.O : this.N.getWidth())) / 2;
        this.V = (i7 - i12) / 2;
        Stack stack = this.r0;
        ArrayList arrayList = this.q0;
        stack.addAll(arrayList);
        arrayList.clear();
        if (charSequence3 instanceof Spannable) {
            StaticLayout staticLayout2 = this.N;
            int i14 = this.S;
            xh.f.a(this, staticLayout2, i14, i14 + this.O, (Spannable) charSequence3, stack, arrayList, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x0526  */
    /* JADX WARN: Removed duplicated region for block: B:111:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x047e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void G(Canvas canvas, boolean z10) {
        int i7;
        int i10;
        int alpha;
        int alpha2;
        fj fjVar;
        int i11;
        int i12;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        int i13;
        s0 s0Var;
        int L;
        if (this.s) {
            if (T() && !z10) {
                return;
            }
            if (!T() && z10) {
                return;
            }
        }
        Paint R = R("paintChatActionBackground");
        Paint R2 = R("paintChatActionBackgroundDarken");
        this.t0 = (TextPaint) R("paintChatActionText");
        int i14 = this.U0;
        org.telegram.ui.ActionBar.i6 i6Var = this.h1;
        if (i14 >= 0) {
            int w02 = org.telegram.ui.ActionBar.n6.w0(i14, i6Var);
            if (this.W0 == null) {
                Paint paint = new Paint(1);
                this.W0 = paint;
                paint.setColor(w02);
                TextPaint textPaint = new TextPaint(1);
                this.X0 = textPaint;
                textPaint.setTypeface(org.telegram.messenger.g0.o());
                this.X0.setTextSize(org.telegram.messenger.g0.L(Math.max(16, bz.W0) - 2));
                this.X0.setColor(org.telegram.ui.ActionBar.n6.w0(this.V0, i6Var));
            }
            R = this.W0;
            this.t0 = this.X0;
        }
        Paint paint2 = R;
        boolean z11 = this.e1;
        Path path = this.a1;
        if (z11) {
            this.e1 = false;
            this.b1 = getWidth();
            this.c1 = 0;
            int w10 = w(path, this.N, getMeasuredWidth() / 2, org.telegram.messenger.g0.L(4.0f), true);
            int measuredWidth = getMeasuredWidth() / 2;
            if (Z() && !a0()) {
                float f16 = measuredWidth;
                RectF rectF = this.d1;
                rectF.left = (f16 - (this.O / 2.0f)) - org.telegram.messenger.g0.L(17.0f);
                rectF.top = w10;
                rectF.right = (this.O / 2.0f) + f16 + org.telegram.messenger.g0.L(17.0f);
                rectF.bottom = org.telegram.messenger.g0.L(28.0f) + w10 + this.P + this.R;
                path.reset();
                path.addRoundRect(rectF, org.telegram.messenger.g0.L(15.0f), org.telegram.messenger.g0.L(15.0f), Path.Direction.CW);
                path.close();
            }
        }
        if (!this.x0) {
            this.w0 = ((ViewGroup) getParent()).getMeasuredHeight();
        }
        if (i6Var != null) {
            i6Var.e(this.v0, this.u0 + org.telegram.messenger.g0.L(4.0f), getMeasuredWidth(), this.w0);
        } else {
            org.telegram.ui.ActionBar.n6.r(this.v0, this.u0 + org.telegram.messenger.g0.L(4.0f), getMeasuredWidth(), this.w0);
        }
        boolean z12 = this instanceof jj;
        float f17 = (!z12 || org.telegram.ui.ActionBar.n6.i1(i6Var)) ? 1.0f : 0.75f;
        if (z10 && (getAlpha() != 1.0f || z12)) {
            alpha = paint2.getAlpha();
            alpha2 = R2.getAlpha();
            paint2.setAlpha((int) (getAlpha() * alpha * f17));
            R2.setAlpha((int) (getAlpha() * alpha2 * f17));
        } else if (z12) {
            alpha = paint2.getAlpha();
            alpha2 = R2.getAlpha();
            paint2.setAlpha((int) (alpha * f17));
            R2.setAlpha((int) (alpha2 * f17));
        } else {
            i7 = -1;
            i10 = -1;
            fjVar = this.Q0;
            Paint paint3 = this.l2;
            if (fjVar != null || !fjVar.j2) {
                canvas.drawPath(path, paint2);
                if (T() && R2.getAlpha() > 0) {
                    canvas.drawPath(path, R2);
                }
                if (this.k2 > 0.0f) {
                    int alpha3 = paint3.getAlpha();
                    if (z10) {
                        paint3.setAlpha((int) (alpha3 * getAlpha()));
                    }
                    canvas.drawPath(path, paint3);
                    paint3.setAlpha(alpha3);
                }
            }
            if (W()) {
                i11 = 2;
                i12 = i7;
                f10 = 2.0f;
                f11 = 4.0f;
                f12 = 140.0f;
                f13 = 20.0f;
            } else {
                int width = getWidth();
                f12 = 140.0f;
                this.J0.getClass();
                float L2 = (width - org.telegram.messenger.g0.L(206.0f)) / 2.0f;
                float walletActionTop = getWalletActionTop();
                f13 = 20.0f;
                this.J0.getClass();
                float L3 = org.telegram.messenger.g0.L(206.0f) + L2;
                f10 = 2.0f;
                f11 = 4.0f;
                if (this.J0.q0 == null) {
                    L = org.telegram.messenger.g0.L(140.0f);
                    i11 = 2;
                    i12 = i7;
                } else {
                    i11 = 2;
                    i12 = i7;
                    L = org.telegram.messenger.g0.L(150.0f) + ((int) Math.ceil(r12.q0.i()));
                }
                RectF rectF2 = this.O0;
                rectF2.set(L2, walletActionTop, L3, L + walletActionTop);
                canvas.save();
                this.J0.c(canvas, L2, walletActionTop);
                canvas.drawRoundRect(rectF2, org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(20.0f), paint2);
                if (T() && R2.getAlpha() > 0) {
                    canvas.drawRoundRect(rectF2, org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(20.0f), R2);
                }
                if (this.k2 > 0.0f) {
                    int alpha4 = paint3.getAlpha();
                    if (z10) {
                        paint3.setAlpha((int) (getAlpha() * alpha4));
                    }
                    canvas.drawRoundRect(rectF2, org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(20.0f), paint3);
                    paint3.setAlpha(alpha4);
                }
                canvas.restore();
            }
            fj fjVar2 = this.Q0;
            if (!U()) {
                float L4 = this.I0.T.f + org.telegram.messenger.g0.L(8.0f);
                float width2 = (getWidth() - L4) / f10;
                float L5 = this.I0.p ? 0.0f : org.telegram.messenger.g0.L(12.0f) + this.T + this.P;
                RectF rectF3 = org.telegram.messenger.g0.P;
                rectF3.set(width2, L5, L4 + width2, this.I0.P + L5 + org.telegram.messenger.g0.L(8.0f));
                if (this.N1 == null) {
                    this.N1 = new RectF();
                }
                this.N1.set(rectF3);
                canvas.drawRoundRect(this.N1, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), paint2);
                if (T()) {
                    canvas.drawRoundRect(this.N1, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), R2);
                }
            } else if (this.P0 != null) {
                float L6 = org.telegram.messenger.g0.L(174.0f);
                tw0 tw0Var = this.P0;
                tw0Var.getClass();
                float L7 = org.telegram.messenger.g0.L(f12) + ((int) tw0Var.f.i()) + (tw0Var.i ? org.telegram.messenger.g0.L(40.0f) : 0);
                float width3 = (getWidth() - L6) / f10;
                if (this.N1 == null) {
                    this.N1 = new RectF();
                }
                this.N1.set(width3, org.telegram.messenger.g0.L(f11), L6 + width3, org.telegram.messenger.g0.L(f11) + L7);
                canvas.drawRoundRect(this.N1, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), paint2);
                if (T()) {
                    canvas.drawRoundRect(this.N1, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), R2);
                }
            } else if (Y(fjVar2)) {
                float width4 = (getWidth() - this.j1) / f10;
                float f18 = this.T + this.P;
                if (a0()) {
                    float L8 = f18 + org.telegram.messenger.g0.L(f11);
                    f14 = 16.0f;
                    org.telegram.messenger.g0.P.set(width4, L8, this.j1 + width4, this.f + L8);
                    f15 = 0.0f;
                } else {
                    f14 = 16.0f;
                    float L9 = f18 + org.telegram.messenger.g0.L(12.0f);
                    RectF rectF4 = org.telegram.messenger.g0.P;
                    float f19 = this.j1;
                    f15 = 0.0f;
                    rectF4.set(width4, L9, width4 + f19, f19 + L9 + this.L1);
                }
                if (fjVar2 != null && fjVar2.D == 18 && !this.p1 && (s0Var = this.t1) != null && this.q1 > 0) {
                    RectF rectF5 = org.telegram.messenger.g0.P;
                    rectF5.bottom = com.google.android.gms.internal.vision.e2.t(1.0f, this.r1.c, ((StaticLayout) s0Var.f).getHeight() - this.q1, rectF5.bottom);
                }
                if (this.N1 == null) {
                    this.N1 = new RectF();
                }
                this.N1.set(org.telegram.messenger.g0.P);
                if (fjVar2 == null || (!((i13 = fjVar2.D) == 33 || i13 == 35) || this.Z1 == null)) {
                    canvas.drawRoundRect(this.N1, org.telegram.messenger.g0.L(f13), org.telegram.messenger.g0.L(f13), paint2);
                    if (T()) {
                        canvas.drawRoundRect(this.N1, org.telegram.messenger.g0.L(f13), org.telegram.messenger.g0.L(f13), R2);
                    }
                } else {
                    float L10 = org.telegram.messenger.g0.L(f14);
                    float[] fArr = this.q2;
                    Arrays.fill(fArr, L10);
                    float L11 = org.telegram.messenger.g0.L(6.0f);
                    fArr[7] = L11;
                    fArr[6] = L11;
                    fArr[5] = L11;
                    fArr[4] = L11;
                    Path path2 = this.p2;
                    path2.rewind();
                    path2.addRoundRect(this.N1, fArr, Path.Direction.CW);
                    canvas.drawPath(path2, paint2);
                    if (T()) {
                        canvas.drawPath(path2, R2);
                    }
                }
                if (this.g2 != null) {
                    boolean z13 = this.j2;
                    ArrayList arrayList = this.h2;
                    if (z13 || arrayList.size() != this.g2.size()) {
                        this.j2 = false;
                        while (arrayList.size() < this.g2.size()) {
                            arrayList.add(new Path());
                        }
                        int i15 = this.i2;
                        int i16 = 0;
                        while (i16 < this.g2.size()) {
                            StaticLayout staticLayout = (StaticLayout) this.g2.get(i16);
                            Paint paint4 = paint3;
                            int i17 = i15;
                            w((Path) arrayList.get(i16), staticLayout, getMeasuredWidth() / 2, i17, false);
                            i15 = org.telegram.messenger.f3.C(6.0f, org.telegram.messenger.f3.D(3.0f, i11, staticLayout.getHeight()), i17);
                            i16++;
                            paint3 = paint4;
                        }
                    }
                    Paint paint5 = paint3;
                    for (int i18 = 0; i18 < this.g2.size(); i18++) {
                        Path path3 = (Path) arrayList.get(i18);
                        canvas.drawPath(path3, paint2);
                        if (T() && R2.getAlpha() > 0) {
                            canvas.drawPath(path3, R2);
                        }
                        if (this.k2 > f15) {
                            int alpha5 = paint5.getAlpha();
                            if (z10) {
                                paint5.setAlpha((int) (getAlpha() * alpha5));
                            }
                            canvas.drawPath(path3, paint5);
                            paint5.setAlpha(alpha5);
                        }
                    }
                }
                if (i12 >= 0) {
                    paint2.setAlpha(i12);
                    R2.setAlpha(i10);
                    return;
                }
                return;
            }
            f15 = 0.0f;
            if (this.g2 != null) {
            }
            if (i12 >= 0) {
            }
        }
        i7 = alpha;
        i10 = alpha2;
        fjVar = this.Q0;
        Paint paint32 = this.l2;
        if (fjVar != null) {
        }
        canvas.drawPath(path, paint2);
        if (T()) {
            canvas.drawPath(path, R2);
        }
        if (this.k2 > 0.0f) {
        }
        if (W()) {
        }
        fj fjVar22 = this.Q0;
        if (!U()) {
        }
        f15 = 0.0f;
        if (this.g2 != null) {
        }
        if (i12 >= 0) {
        }
    }

    public final void I(Canvas canvas) {
        if (this.g2 == null) {
            return;
        }
        int L = org.telegram.messenger.g0.L(3.0f) + this.i2;
        ArrayList arrayList = this.g2;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            StaticLayout staticLayout = (StaticLayout) obj;
            canvas.save();
            canvas.translate((getMeasuredWidth() - staticLayout.getWidth()) / 2.0f, L);
            staticLayout.draw(canvas);
            canvas.restore();
            L = org.telegram.messenger.f3.C(6.0f, org.telegram.messenger.f3.D(3.0f, 2, staticLayout.getHeight()), L);
        }
    }

    public final void J(Canvas canvas) {
        TLRPC.TL_messageActionStarGiftOnchainOffer tL_messageActionStarGiftOnchainOffer = this.c2;
        if (tL_messageActionStarGiftOnchainOffer == null || this.f2 == null || !(tL_messageActionStarGiftOnchainOffer.gift instanceof TL_stars.TL_starGiftUnique)) {
            return;
        }
        ImageReceiver imageReceiver = this.J;
        float L = imageReceiver.L0 + imageReceiver.N0 + org.telegram.messenger.g0.L(10.0f) + org.telegram.messenger.g0.L(1.9805f);
        int L2 = (int) ((L + org.telegram.messenger.g0.L(48.0f)) - org.telegram.messenger.g0.L(40.800003f));
        int L3 = (int) ((imageReceiver.M0 - org.telegram.messenger.g0.L(10.0f)) - org.telegram.messenger.g0.L(1.7f));
        this.f2.setBounds(L2 - org.telegram.messenger.g0.L(39.0f), L3, L2, org.telegram.messenger.g0.L(42.6f) + L3);
        this.f2.draw(canvas);
    }

    public final void K(Canvas canvas) {
        float f10;
        float f11;
        Canvas canvas2 = canvas;
        canvas2.save();
        float f12 = 2.0f;
        canvas2.translate(this.k0 / 2.0f, getPaddingTop());
        canvas2.save();
        canvas2.translate(this.U, this.T);
        StaticLayout staticLayout = this.N;
        org.telegram.ui.Components.x5.drawAnimatedEmojis(canvas2, staticLayout, this.s0, 0.0f, this.q0, 0.0f, 0.0f, 0.0f, 1.0f, staticLayout != null ? P(staticLayout.getPaint().getColor()) : null);
        canvas2.restore();
        float f13 = 4.0f;
        if (U()) {
            canvas2.save();
            float width = getWidth();
            di.h6 h6Var = this.I0;
            canvas2.translate((width - h6Var.T.f) / 2.0f, h6Var.p ? org.telegram.messenger.g0.L(4.0f) : org.telegram.messenger.g0.L(16.0f) + this.T + this.P);
            this.I0.c(canvas2);
            canvas2.restore();
        }
        canvas2.restore();
        q01 q01Var = this.o0;
        org.telegram.ui.ActionBar.i6 i6Var = this.h1;
        if (q01Var != null) {
            float alpha = getAlpha();
            if (i6Var != null) {
                i6Var.e(this.v0, this.u0 + 0.0f, getMeasuredWidth(), this.w0);
            } else {
                org.telegram.ui.ActionBar.n6.r(this.v0, this.u0 + 0.0f, getMeasuredWidth(), this.w0);
            }
            this.o0.c(canvas, getWidth(), this.k0, 0.0f, 1.0f, alpha, this.n0);
            canvas2 = canvas;
        }
        ArrayList arrayList = this.Y1;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        if (i6Var != null) {
            i6Var.e(this.v0, this.u0 + org.telegram.messenger.g0.L(4.0f), getMeasuredWidth(), this.w0);
        } else {
            org.telegram.ui.ActionBar.n6.r(this.v0, this.u0 + org.telegram.messenger.g0.L(4.0f), getMeasuredWidth(), this.w0);
        }
        float width2 = (getWidth() - this.j1) / 2.0f;
        float L = org.telegram.messenger.g0.L(4.0f) + org.telegram.messenger.g0.L(4.0f) + this.T + this.P + this.f;
        float L2 = (this.j1 - org.telegram.messenger.g0.L(4.0f)) / 2.0f;
        int i7 = 0;
        while (i7 < arrayList.size()) {
            d0 d0Var = (d0) arrayList.get(i7);
            float a10 = d0Var.a();
            float L3 = ((org.telegram.messenger.g0.L(f13) + L2) * i7) + width2;
            float f14 = L3 + L2;
            RectF rectF = this.d1;
            rectF.set(L3, L, f14, d0Var.f + L);
            canvas2.save();
            if (a10 != 1.0f) {
                f10 = f13;
                canvas2.scale(a10, a10, rectF.centerX(), rectF.centerY());
            } else {
                f10 = f13;
            }
            float L4 = org.telegram.messenger.g0.L(Math.min(6.75f, bz.Y0));
            float[] fArr = this.r2;
            Arrays.fill(fArr, L4);
            if ((d0Var.g & 9) == 9) {
                float L5 = org.telegram.messenger.g0.L(bz.Y0);
                fArr[7] = L5;
                fArr[6] = L5;
            }
            if ((d0Var.g & 10) == 10) {
                float L6 = org.telegram.messenger.g0.L(bz.Y0);
                fArr[5] = L6;
                fArr[4] = L6;
            }
            Path path = this.s2;
            path.rewind();
            path.addRoundRect(rectF, fArr, Path.Direction.CW);
            canvas2.drawPath(path, R("paintChatActionBackground"));
            if (T()) {
                canvas2.drawPath(path, org.telegram.ui.ActionBar.n6.h2);
            }
            canvas2.save();
            canvas2.clipPath(path);
            y yVar = d0Var.s;
            if (yVar != null) {
                int i10 = (int) L;
                yVar.setBounds((int) L3, i10, (int) f14, d0Var.f + i10);
                d0Var.s.setAlpha(ks.e4);
                d0Var.s.draw(canvas2);
            }
            canvas2.restore();
            canvas2.save();
            float L7 = d0Var.t != null ? org.telegram.messenger.g0.L(26.0f) : 0;
            float A = com.google.android.gms.internal.vision.e2.A(L2 - (d0Var.h.k() + (d0Var.t != null ? org.telegram.messenger.g0.L(f10) : 0)), L7, f12, L3);
            Drawable drawable = d0Var.t;
            if (drawable != null) {
                int i11 = (int) A;
                f11 = f12;
                drawable.setBounds(i11, (int) (((d0Var.f - org.telegram.messenger.g0.L(24.0f)) / f12) + L), org.telegram.messenger.g0.L(24.0f) + i11, org.telegram.messenger.g0.L(24.0f) + ((int) (((d0Var.f - org.telegram.messenger.g0.L(24.0f)) / f11) + L)));
                d0Var.t.setAlpha(d0Var.m ? 128 : ks.e4);
                d0Var.t.draw(canvas2);
                A += L7;
            } else {
                f11 = f12;
            }
            d0Var.h.p = Math.max(1, (((int) L2) - org.telegram.messenger.g0.L(15.0f)) - r6);
            d0Var.h.f(canvas2, A, (org.telegram.messenger.g0.L(40.0f) / f11) + L, d0Var.m ? 0.5f : 1.0f);
            canvas2.restore();
            canvas2.restore();
            i7++;
            f13 = f10;
            f12 = f11;
        }
    }

    public final void L(Canvas canvas, boolean z10) {
        if (this.s) {
            if (T() && !z10) {
                return;
            }
            if (!T() && z10) {
                return;
            }
        }
        M(canvas, z10, null);
    }

    public final void M(Canvas canvas, boolean z10, Integer num) {
        Canvas canvas2;
        float alpha = z10 ? getAlpha() : 1.0f;
        if (alpha <= 0.0f) {
            return;
        }
        org.telegram.ui.ActionBar.i6 i6Var = this.h1;
        if (i6Var != null) {
            i6Var.e(this.v0, this.u0 + org.telegram.messenger.g0.L(4.0f), getMeasuredWidth(), this.w0);
        } else {
            org.telegram.ui.ActionBar.n6.r(this.v0, this.u0 + org.telegram.messenger.g0.L(4.0f), getMeasuredWidth(), this.w0);
        }
        fj fjVar = this.Q0;
        if (fjVar == null || !fjVar.O5()) {
            return;
        }
        ch.q0 q0Var = this.F0;
        q0Var.getClass();
        q0Var.a = 1.0f;
        if (alpha < 1.0f) {
            canvas2 = canvas;
            canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (alpha * 255.0f), 31);
        } else {
            canvas2 = canvas;
        }
        t0 t0Var = this.A2;
        q0Var.d(canvas2, t0Var.b ? t0Var.c : 1.0f, num);
        if (alpha < 1.0f) {
            canvas2.restore();
        }
    }

    @Override // org.telegram.messenger.y5
    public final void N(String str) {
        TLRPC.PhotoSize photoSize;
        fj fjVar = this.Q0;
        if (fjVar == null || fjVar.D != 11) {
            return;
        }
        int size = fjVar.p0.size();
        int i7 = 0;
        while (true) {
            if (i7 >= size) {
                photoSize = null;
                break;
            }
            photoSize = (TLRPC.PhotoSize) fjVar.p0.get(i7);
            if (photoSize instanceof TLRPC.TL_photoStrippedSize) {
                break;
            } else {
                i7++;
            }
        }
        this.J.r0(this.y0, "g", fc.f(photoSize, fjVar.n0), "50_50_b", this.M, 0L, null, fjVar, 1);
        org.telegram.messenger.a6.q(this.I).v(this);
    }

    public final void O(pl plVar, Canvas canvas, int i7, Integer num, float f10) {
        ch.q0 q0Var = this.F0;
        q0Var.getClass();
        org.telegram.ui.ActionBar.i6 i6Var = this.h1;
        if (i6Var != null) {
            i6Var.e(this.v0, this.u0 + org.telegram.messenger.g0.L(4.0f), getMeasuredWidth(), this.w0);
        } else {
            org.telegram.ui.ActionBar.n6.r(this.v0, this.u0 + org.telegram.messenger.g0.L(4.0f), getMeasuredWidth(), this.w0);
        }
        q0Var.A = f10;
        q0Var.f(plVar, canvas, i7, num);
    }

    public final ColorFilter P(int i7) {
        if (i7 != this.z2 || this.y2 == null) {
            this.z2 = i7;
            this.y2 = new PorterDuffColorFilter(i7, PorterDuff.Mode.SRC_IN);
        }
        return this.y2;
    }

    public final int Q(fj fjVar) {
        int i7;
        int i10 = this.i1;
        int i11 = fjVar.D;
        if (i11 == 37) {
            i10 = org.telegram.messenger.g0.L(52.0f);
        } else if (i11 == 21 || a0()) {
            i10 = org.telegram.messenger.g0.L(78.0f);
        }
        if (Z() || (i7 = fjVar.D) == 34 || i7 == 35) {
            return 0;
        }
        return i10;
    }

    public Paint R(String str) {
        org.telegram.ui.ActionBar.i6 i6Var = this.h1;
        Paint g10 = i6Var != null ? i6Var.g(str) : null;
        return g10 != null ? g10 : org.telegram.ui.ActionBar.n6.V0(str);
    }

    public final float S(fj fjVar) {
        mp u12;
        String str;
        if (fjVar == null) {
            return 1.0f;
        }
        try {
            if (fjVar.D == 22 && (str = (u12 = mp.u1(this.I)).T2) != null && TextUtils.equals(fjVar.k.action.wallpaper.uploadingImage, str)) {
                return u12.U2.r;
            }
            return 1.0f;
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
            return 1.0f;
        }
    }

    public final boolean T() {
        if (this.W0 != null) {
            return false;
        }
        org.telegram.ui.ActionBar.i6 i6Var = this.h1;
        return i6Var != null ? i6Var.j() : org.telegram.ui.ActionBar.n6.d1();
    }

    public final boolean U() {
        di.h6 h6Var = this.I0;
        return (h6Var == null || h6Var.Q == null) ? false : true;
    }

    public final boolean W() {
        TLRPC.Message message;
        fj fjVar = this.Q0;
        return (fjVar == null || (message = fjVar.k) == null || !(message.action instanceof TLRPC.TL_messageActionGramTransfer)) ? false : true;
    }

    public final void X() {
        r0 r0Var = this.g1;
        if (r0Var != null && r0Var.h()) {
            super.invalidate();
        } else if (getParent() instanceof View) {
            ((View) getParent()).invalidate();
        }
    }

    public final boolean Y(fj fjVar) {
        if (fjVar == null) {
            return false;
        }
        int i7 = fjVar.D;
        return i7 == 30 || i7 == 18 || i7 == 25 || a0();
    }

    public final boolean Z() {
        TLRPC.Message message;
        fj fjVar = this.Q0;
        return (fjVar == null || (message = fjVar.k) == null || !(message.action instanceof TLRPC.TL_messageActionSuggestedPostApproval)) ? false : true;
    }

    public final boolean a0() {
        fj fjVar;
        int i7;
        if (U() || this.P0 != null || (i7 = (fjVar = this.Q0).D) == 31 || i7 == 37 || i7 == 33 || i7 == 35 || i7 == 34 || i7 == 21 || i7 == 22 || fjVar.z4()) {
            return true;
        }
        TLRPC.Message message = this.Q0.k;
        if (message == null) {
            return false;
        }
        TLRPC.MessageAction messageAction = message.action;
        if (messageAction instanceof TLRPC.TL_messageActionSuggestedPostApproval) {
            return ((TLRPC.TL_messageActionSuggestedPostApproval) messageAction).balance_too_low || ((TLRPC.TL_messageActionSuggestedPostApproval) messageAction).rejected;
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.p4
    public final /* synthetic */ boolean b() {
        return false;
    }

    public final boolean b0() {
        fj fjVar = this.Q0;
        if (fjVar == null) {
            return false;
        }
        TLRPC.Message message = fjVar.k;
        TLRPC.MessageAction messageAction = message.action;
        if (((messageAction instanceof TLRPC.TL_messageActionGiftCode) || (messageAction instanceof TLRPC.TL_messageActionGiftStars)) && (message.from_id instanceof TLRPC.TL_peerUser)) {
            return o10.C(mp.u1(this.I).c2(Long.valueOf(this.Q0.k.from_id.user_id)));
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.p4
    public final void d(TLRPC.ReactionCount reactionCount, boolean z10, float f10, float f11) {
        r0 r0Var = this.g1;
        if (r0Var != null) {
            r0Var.x0(this, reactionCount, z10, f10, f11);
        }
    }

    public final CharSequence d0(SpannableStringBuilder spannableStringBuilder, TLRPC.TL_messageActionStarGiftOnchainOffer tL_messageActionStarGiftOnchainOffer) {
        HashMap hashMap = bi.f4.a;
        CharSequence charSequence = null;
        if (tL_messageActionStarGiftOnchainOffer.settled && !tL_messageActionStarGiftOnchainOffer.accepted) {
            charSequence = gd.M0(2131749559, null);
        } else if (!tL_messageActionStarGiftOnchainOffer.accepted && !tL_messageActionStarGiftOnchainOffer.declined) {
            if (tL_messageActionStarGiftOnchainOffer.cancelled) {
                charSequence = gd.M0(2131749558, null);
            } else if (tL_messageActionStarGiftOnchainOffer.cancelling) {
                charSequence = gd.M0(2131749563, null);
            } else {
                int max = Math.max(0, tL_messageActionStarGiftOnchainOffer.expires_at - ConnectionsManager.getInstance(this.I).getCurrentTime());
                charSequence = tL_messageActionStarGiftOnchainOffer.expired ? gd.M0(2131749561, null) : max == 0 ? gd.M0(2131749560, null) : org.telegram.messenger.g0.W2(gd.a0(null, null, 2131749597, String.format(Locale.US, "%02d:%02d:%02d", Integer.valueOf(max / 3600), Integer.valueOf((max / 60) % 60), Integer.valueOf(max % 60))));
            }
        }
        if (charSequence == null) {
            return spannableStringBuilder;
        }
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(spannableStringBuilder);
        spannableStringBuilder2.append((CharSequence) "\n\n");
        spannableStringBuilder2.append(charSequence);
        return spannableStringBuilder2;
    }

    @Override // org.telegram.messenger.fs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        fj fjVar;
        if (i7 == ks.m1) {
            setSpoilersSuppressed(false);
            return;
        }
        if (i7 == ks.k4) {
            invalidate();
            return;
        }
        if (i7 == ks.l1) {
            setSpoilersSuppressed(true);
            return;
        }
        if (i7 == ks.Y2 || i7 == ks.H3 || i7 == ks.Z2) {
            fj fjVar2 = this.Q0;
            if (fjVar2 != null) {
                j0(fjVar2, true);
                return;
            }
            return;
        }
        if (i7 == ks.y0) {
            if (!Objects.equals(objArr[0], j10.i(this.I).c0) || (fjVar = this.Q0) == null) {
                return;
            }
            j0(fjVar, true);
            return;
        }
        if (i7 == ks.c4 && W()) {
            this.v2 = null;
            this.W = 0;
            requestLayout();
            invalidate();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (view != this.U1) {
            return super.drawChild(canvas, view, j3);
        }
        float a10 = this.n.a(0.02f);
        canvas.save();
        canvas.scale(a10, a10, (view.getMeasuredWidth() / 2.0f) + view.getX(), (view.getMeasuredHeight() / 2.0f) + view.getY());
        boolean drawChild = super.drawChild(canvas, view, j3);
        canvas.restore();
        return drawChild;
    }

    public final void e0(CharacterStyle characterStyle) {
        if (this.g1 == null || !(characterStyle instanceof URLSpan)) {
            return;
        }
        String url = ((URLSpan) characterStyle).getURL();
        if (url.startsWith("task")) {
            this.g1.u(this, this.Q0.N1(), Integer.parseInt(url.substring(5)));
            return;
        }
        if (url.startsWith("topic")) {
            URLSpan uRLSpan = this.y;
            if (uRLSpan instanceof p41) {
                TLObject tLObject = ((p41) uRLSpan).c;
                if (tLObject instanceof TLRPC.TL_forumTopic) {
                    qg.c.n(this.g1.G(), -this.g1.a(), (TLRPC.TL_forumTopic) tLObject, 0);
                    return;
                }
                return;
            }
        }
        if (url.startsWith("invite")) {
            URLSpan uRLSpan2 = this.y;
            if (uRLSpan2 instanceof p41) {
                TLObject tLObject2 = ((p41) uRLSpan2).c;
                if (tLObject2 instanceof TLRPC.TL_chatInviteExported) {
                    this.g1.M((TLRPC.TL_chatInviteExported) tLObject2);
                    return;
                }
                return;
            }
        }
        if (url.startsWith("game")) {
            this.g1.n(this, this.Q0.N1());
        } else if (url.startsWith("http")) {
            vf.c.t(getContext(), url);
        } else {
            this.g1.V(Long.parseLong(url));
        }
    }

    public final void f0() {
        TLRPC.TL_premiumGiftOption tL_premiumGiftOption = new TLRPC.TL_premiumGiftOption();
        fj fjVar = this.Q0;
        TLRPC.MessageAction messageAction = fjVar.k.action;
        tL_premiumGiftOption.amount = messageAction.amount;
        tL_premiumGiftOption.months = messageAction.months;
        tL_premiumGiftOption.currency = messageAction.currency;
        String str = null;
        if (fjVar != null && (messageAction instanceof TLRPC.TL_messageActionGiftCode) && !b0()) {
            str = ((TLRPC.TL_messageActionGiftCode) this.Q0.k.action).slug;
        }
        if (this.g1 != null) {
            org.telegram.messenger.g0.g3(new kg.i0(this, tL_premiumGiftOption, str, 27));
        }
    }

    public final void g0() {
        TLRPC.Message message;
        fj fjVar = this.Q0;
        if (fjVar == null || (message = fjVar.k) == null) {
            return;
        }
        TLRPC.MessageAction messageAction = message.action;
        boolean z10 = messageAction instanceof TLRPC.TL_messageActionGiftStars;
        fi.e7 e7Var = this.e0;
        if (z10) {
            Context context = getContext();
            TLRPC.Message message2 = this.Q0.k;
            int i7 = message2.date;
            TLRPC.Peer peer = message2.from_id;
            TLRPC.Peer peer2 = message2.peer_id;
            TLRPC.TL_messageActionGiftStars tL_messageActionGiftStars = (TLRPC.TL_messageActionGiftStars) message2.action;
            org.telegram.ui.ActionBar.i6 i6Var = e7Var.J;
            TL_stars.StarsTransaction starsTransaction = new TL_stars.StarsTransaction();
            starsTransaction.title = null;
            starsTransaction.description = null;
            starsTransaction.photo = null;
            TL_stars.TL_starsTransactionPeer tL_starsTransactionPeer = new TL_stars.TL_starsTransactionPeer();
            starsTransaction.peer = tL_starsTransactionPeer;
            tL_starsTransactionPeer.peer = peer;
            starsTransaction.date = i7;
            starsTransaction.amount = TL_stars.StarsAmount.ofStars(tL_messageActionGiftStars.stars);
            starsTransaction.id = tL_messageActionGiftStars.transaction_id;
            starsTransaction.gift = true;
            starsTransaction.sent_by = peer;
            starsTransaction.received_by = peer2;
            pb.l1(context, false, 0L, this.I, starsTransaction, i6Var);
            return;
        }
        if (messageAction instanceof TLRPC.TL_messageActionPrizeStars) {
            Context context2 = getContext();
            TLRPC.Message message3 = this.Q0.k;
            int i10 = message3.date;
            TLRPC.Peer peer3 = message3.from_id;
            TLRPC.Peer peer4 = message3.peer_id;
            TLRPC.TL_messageActionPrizeStars tL_messageActionPrizeStars = (TLRPC.TL_messageActionPrizeStars) message3.action;
            org.telegram.ui.ActionBar.i6 i6Var2 = e7Var.J;
            TL_stars.StarsTransaction starsTransaction2 = new TL_stars.StarsTransaction();
            starsTransaction2.title = null;
            starsTransaction2.description = null;
            starsTransaction2.photo = null;
            TL_stars.TL_starsTransactionPeer tL_starsTransactionPeer2 = new TL_stars.TL_starsTransactionPeer();
            starsTransaction2.peer = tL_starsTransactionPeer2;
            tL_starsTransactionPeer2.peer = tL_messageActionPrizeStars.boost_peer;
            starsTransaction2.date = i10;
            starsTransaction2.amount = TL_stars.StarsAmount.ofStars(tL_messageActionPrizeStars.stars);
            starsTransaction2.id = tL_messageActionPrizeStars.transaction_id;
            starsTransaction2.gift = true;
            starsTransaction2.flags |= TLObject.FLAG_13;
            starsTransaction2.giveaway_post_id = tL_messageActionPrizeStars.giveaway_msg_id;
            starsTransaction2.sent_by = peer3;
            starsTransaction2.received_by = peer4;
            pb.l1(context2, false, 0L, this.I, starsTransaction2, i6Var2);
            return;
        }
        if (messageAction instanceof TLRPC.TL_messageActionGiftTon) {
            Context context3 = getContext();
            TLRPC.Message message4 = this.Q0.k;
            int i11 = message4.date;
            TLRPC.Peer peer5 = message4.from_id;
            TLRPC.Peer peer6 = message4.peer_id;
            TLRPC.TL_messageActionGiftTon tL_messageActionGiftTon = (TLRPC.TL_messageActionGiftTon) message4.action;
            org.telegram.ui.ActionBar.i6 i6Var3 = e7Var.J;
            TL_stars.StarsTransaction starsTransaction3 = new TL_stars.StarsTransaction();
            starsTransaction3.title = null;
            starsTransaction3.description = null;
            starsTransaction3.photo = null;
            TL_stars.TL_starsTransactionPeer tL_starsTransactionPeer3 = new TL_stars.TL_starsTransactionPeer();
            starsTransaction3.peer = tL_starsTransactionPeer3;
            tL_starsTransactionPeer3.peer = peer5;
            starsTransaction3.date = i11;
            TL_stars.TL_starsTonAmount tL_starsTonAmount = new TL_stars.TL_starsTonAmount();
            starsTransaction3.amount = tL_starsTonAmount;
            tL_starsTonAmount.amount = tL_messageActionGiftTon.cryptoAmount;
            starsTransaction3.id = tL_messageActionGiftTon.transaction_id;
            starsTransaction3.gift = true;
            starsTransaction3.sent_by = peer5;
            starsTransaction3.received_by = peer6;
            pb.l1(context3, false, 0L, this.I, starsTransaction3, i6Var3);
            return;
        }
        if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
            if (((TLRPC.TL_messageActionStarGift) messageAction).forceIn) {
                return;
            }
            di.f6 f6Var = new di.f6(getContext(), this.I, fj.B0(this.Q0.k), this.h1, null);
            f6Var.v2(this.Q0, null);
            f6Var.show();
            return;
        }
        if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
            if (!((TLRPC.TL_messageActionStarGiftUnique) messageAction).gift.burned) {
                di.f6 f6Var2 = new di.f6(getContext(), this.I, fj.B0(this.Q0.k), this.h1, null);
                f6Var2.v2(this.Q0, null);
                f6Var2.show();
                return;
            } else {
                org.telegram.ui.ActionBar.h2 T = LaunchActivity.T();
                if (T == null) {
                    return;
                }
                org.telegram.messenger.f3.n(null, 2131743643, lc.b0(T), R.raw.fire_on, 36);
                return;
            }
        }
        if (messageAction instanceof TLRPC.TL_messageActionSetChatTheme) {
            TLRPC.ChatTheme chatTheme = ((TLRPC.TL_messageActionSetChatTheme) messageAction).theme;
            if (chatTheme instanceof TLRPC.TL_chatThemeUniqueGift) {
                TL_stars.StarGift starGift = ((TLRPC.TL_chatThemeUniqueGift) chatTheme).gift;
                if (starGift instanceof TL_stars.TL_starGiftUnique) {
                    di.f6 f6Var3 = new di.f6(getContext(), this.I, 0L, this.h1, null);
                    f6Var3.u2(starGift.slug, (TL_stars.TL_starGiftUnique) starGift, null);
                    f6Var3.show();
                }
            }
        }
    }

    public /* bridge */ /* synthetic */ ImageReceiver getAvatarImage() {
        return null;
    }

    @Override // org.telegram.ui.Cells.z
    public int getBoundsLeft() {
        if (U()) {
            int width = ((int) (getWidth() - (this.I0.T.f + org.telegram.messenger.g0.L(8.0f)))) / 2;
            return this.I0.p ? width : Math.min(this.b1, width);
        }
        if (Y(this.Q0)) {
            return i5.c.e(getWidth(), this.j1, 2, this.k0 / 2);
        }
        int i7 = this.b1;
        ImageReceiver imageReceiver = this.J;
        if (imageReceiver != null && imageReceiver.R0) {
            i7 = Math.min((int) imageReceiver.L0, i7);
        }
        return (this.k0 / 2) + i7;
    }

    @Override // org.telegram.ui.Cells.z
    public int getBoundsRight() {
        int i7;
        int i10;
        if (U()) {
            int L = ((int) ((this.I0.T.f + org.telegram.messenger.g0.L(8.0f)) + getWidth())) / 2;
            return this.I0.p ? L : Math.max(this.c1, L);
        }
        if (Y(this.Q0)) {
            i7 = this.k0 / 2;
            i10 = (getWidth() + this.j1) / 2;
        } else {
            i7 = this.c1;
            ImageReceiver imageReceiver = this.J;
            if (imageReceiver != null && imageReceiver.R0) {
                i7 = Math.max((int) imageReceiver.y(), i7);
            }
            i10 = this.k0 / 2;
        }
        return i10 + i7;
    }

    @Override // org.telegram.ui.Cells.p4
    public /* bridge */ /* synthetic */ float getCheckBoxTranslation() {
        return 0.0f;
    }

    public /* bridge */ /* synthetic */ xi getCurrentPosition() {
        return null;
    }

    public int getCustomDate() {
        return this.R0;
    }

    public r0 getDelegate() {
        return this.g1;
    }

    @Override // org.telegram.ui.Cells.p4
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

    @Override // org.telegram.ui.Cells.p4
    public fj getMessageObject() {
        return this.Q0;
    }

    @Override // org.telegram.messenger.y5
    public int getObserverTag() {
        return this.x;
    }

    public ImageReceiver getPhotoImage() {
        return this.J;
    }

    public ch.q0 getReactionsLayout() {
        return this.F0;
    }

    @Override // org.telegram.ui.Cells.p4
    public /* bridge */ /* synthetic */ float getSlidingOffsetX() {
        return 0.0f;
    }

    public t0 getTransitionParams() {
        return this.A2;
    }

    public float getWalletSlidingOffset() {
        return this.N0;
    }

    public final boolean h0(float f10, float f11, vf vfVar) {
        if (W() && !this.Q0.P3() && !this.Q0.k.premiumEffectWasPlayed) {
            float y10 = getY() + getPaddingTop() + getWalletActionTop();
            if (y10 >= f10 && y10 + org.telegram.messenger.g0.L(140.0f) <= f11) {
                org.telegram.ui.Wallet.m4 m4Var = this.J0;
                mh0 mh0Var = m4Var.l;
                if (m4Var.i0 && m4Var.j0 == null) {
                    m4Var.i0 = false;
                    m4Var.k0 = vfVar;
                    m4Var.K.e(true, 0.0f);
                    m4Var.M = false;
                    m4Var.N = 0L;
                    m4Var.b();
                    m4Var.g();
                    m4Var.t = 18.0f;
                    m4Var.u.f();
                    mh0Var.T(true, 0.0f);
                    mh0Var.start();
                    m4Var.H = true;
                    float f12 = m4Var.R;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    m4Var.j0 = ofFloat;
                    ofFloat.setDuration(2400L);
                    m4Var.j0.setInterpolator(lr.h);
                    m4Var.j0.addUpdateListener(new rf(m4Var, f12, 7));
                    m4Var.j0.addListener(new k71(m4Var, 6));
                    m4Var.j0.start();
                    m4Var.a.invalidate();
                    this.Q0.k.premiumEffectWasPlayed = true;
                    tr.a0(this.I).X1(fj.B0(this.Q0.k), this.Q0.k);
                    return true;
                }
            }
        }
        return false;
    }

    public final void i0(int i7, boolean z10, boolean z11) {
        int i10 = this.R0;
        if (i10 == i7 || i10 / 3600 == i7 / 3600) {
            return;
        }
        String M0 = z10 ? i7 == 2147483646 ? gd.M0(2131748300, "MessageScheduledUntilOnline") : gd.a0("MessageScheduledOn", null, 2131748336, gd.u(i7, false)) : gd.u(i7, false);
        this.R0 = i7;
        CharSequence charSequence = this.S0;
        if (charSequence == null || !TextUtils.equals(M0, charSequence)) {
            this.S0 = M0;
            this.v2 = null;
            o0(z11);
        }
    }

    @Override // org.telegram.ui.Cells.z, android.view.View, org.telegram.ui.Cells.q9
    public final void invalidate() {
        super.invalidate();
        View view = this.w;
        if (view != null) {
            view.invalidate();
        }
        Runnable runnable = this.x2;
        if (runnable != null) {
            runnable.run();
        }
        if (!this.w2 || getParent() == null) {
            return;
        }
        View view2 = (View) getParent();
        if (view2.getParent() != null) {
            view2.invalidate();
            ((View) view2.getParent()).invalidate();
        }
    }

    @Override // org.telegram.ui.Cells.p4
    public final /* synthetic */ boolean j() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0b60  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0bc6  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0bcf  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0bb5  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x03e7  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x03f2  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0352  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x0600  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x0619  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x0a2e  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x0add  */
    /* JADX WARN: Removed duplicated region for block: B:355:0x0b4c  */
    /* JADX WARN: Removed duplicated region for block: B:458:0x092b  */
    /* JADX WARN: Removed duplicated region for block: B:486:0x0972 A[EDGE_INSN: B:486:0x0972->B:482:0x0972 BREAK  A[LOOP:6: B:456:0x0923->B:484:0x096e], SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r10v2, types: [org.telegram.tgnet.TLRPC$messages_StickerSet] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j0(fj fjVar, boolean z10) {
        StaticLayout staticLayout;
        TLRPC.TL_messageReactions tL_messageReactions;
        org.telegram.ui.ActionBar.i6 i6Var;
        int i7;
        int i10;
        org.telegram.ui.ActionBar.i6 i6Var2;
        String str;
        fj fjVar2;
        fj fjVar3;
        String str2;
        TLRPC.Document document;
        TLRPC.Document document2;
        String str3;
        String str4;
        ArrayList<TLRPC.TL_stickerPack> arrayList;
        fj fjVar4;
        int i11;
        TLRPC.Document document3;
        TLRPC.Document document4;
        TLRPC.Document document5;
        b3.j jVar;
        int i12;
        int i13;
        int i14;
        TLRPC.PhotoSize photoSize;
        TLRPC.VideoSize videoSize;
        TLRPC.PhotoSize photoSize2;
        boolean z11;
        float f10;
        RadialProgress2 radialProgress2;
        TLRPC.WallPaper wallPaper;
        TLRPC.MessageAction messageAction;
        ImageReceiver imageReceiver;
        String str5;
        q01 q01Var;
        int i15;
        int paddingTop;
        int i16;
        TLRPC.Message message;
        String m10;
        String str6;
        ActivityManager activityManager;
        fj fjVar5 = fjVar;
        if (fjVar5 == null) {
            return;
        }
        if (this.Q0 != fjVar5 && this.N0 != 0.0f) {
            setWalletSlidingOffset(0.0f);
        }
        TLRPC.Message message2 = fjVar5.k;
        if ((message2 == null || !(message2.action instanceof TLRPC.TL_messageActionGramTransfer) || this.b2 == message2.send_state) && this.Q0 == fjVar5 && (((staticLayout = this.N) == null || TextUtils.equals(staticLayout.getText(), fjVar5.v)) && !((!this.E0 && fjVar5.C != null) || z10 || fjVar5.D == 21 || fjVar5.M1))) {
            return;
        }
        boolean z12 = org.telegram.messenger.s2.a;
        ArrayList arrayList2 = this.Y1;
        arrayList2.clear();
        this.Z1 = null;
        this.c2 = null;
        this.g2 = null;
        this.v2 = null;
        fj fjVar6 = this.Q0;
        boolean z13 = fjVar6 == null || fjVar6.m1 != fjVar5.m1;
        if (fjVar6 != null) {
            fjVar5.o1 = fjVar6.o1;
        }
        if (!z13 && fjVar6 != null && W()) {
            fjVar5.k.premiumEffectWasPlayed |= this.Q0.k.premiumEffectWasPlayed;
        }
        this.Q0 = fjVar5;
        boolean W = W();
        int i17 = 2;
        org.telegram.ui.ActionBar.i6 i6Var3 = this.h1;
        if (W && this.J0 == null) {
            org.telegram.ui.Wallet.m4 m4Var = new org.telegram.ui.Wallet.m4(this, i6Var3);
            this.J0 = m4Var;
            m4Var.s0 = new n0(this, i17);
            m4Var.n(this.K0);
        }
        org.telegram.ui.Wallet.m4 m4Var2 = this.J0;
        if (m4Var2 != null) {
            boolean W2 = W();
            u0 u0Var = m4Var2.a;
            m4Var2.n = W2;
            if (W2 && m4Var2.m == null && !m4Var2.o && com.google.android.gms.internal.vision.e2.s(u0Var) && bz.o() != 0 && (activityManager = (ActivityManager) u0Var.getContext().getSystemService("activity")) != null && activityManager.getDeviceConfigurationInfo().reqGlEsVersion >= 196608) {
                org.telegram.ui.Wallet.l4 l4Var = new org.telegram.ui.Wallet.l4(m4Var2, u0Var.getContext(), new org.telegram.ui.Wallet.i4(m4Var2, 1));
                m4Var2.m = l4Var;
                u0Var.addView(l4Var, new ViewGroup.LayoutParams(org.telegram.messenger.g0.L(42.0f), org.telegram.messenger.g0.L(42.0f)));
            }
            org.telegram.ui.Wallet.l4 l4Var2 = m4Var2.m;
            if (l4Var2 != null) {
                l4Var2.setVisibility((!W2 || m4Var2.o) ? 8 : 0);
                m4Var2.m.setPaused(!W2 || m4Var2.o);
            }
            if (!W2) {
                m4Var2.f();
                m4Var2.k();
            }
        }
        TLRPC.Message message3 = fjVar5.k;
        int i18 = this.I;
        if (message3 != null && (message3.action instanceof TLRPC.TL_messageActionGramTransfer)) {
            mp u12 = mp.u1(i18);
            long o4 = org.telegram.messenger.n5.o(fjVar5.k.peer_id);
            if (o10.B(o4)) {
                m10 = gd.M0(2131742713, null);
            } else if (fjVar5.k.peer_id == null) {
                str6 = null;
                org.telegram.ui.Wallet.m4 m4Var3 = this.J0;
                boolean P3 = fjVar5.P3();
                TLRPC.Message message4 = fjVar5.k;
                m4Var3.m(P3, (TLRPC.TL_messageActionGramTransfer) message4.action, str6, message4.send_state, z13, !message4.premiumEffectWasPlayed);
                this.b2 = fjVar5.k.send_state;
            } else {
                m10 = org.telegram.messenger.n5.m(u12.g2(o4));
            }
            str6 = m10;
            org.telegram.ui.Wallet.m4 m4Var32 = this.J0;
            boolean P32 = fjVar5.P3();
            TLRPC.Message message42 = fjVar5.k;
            m4Var32.m(P32, (TLRPC.TL_messageActionGramTransfer) message42.action, str6, message42.send_state, z13, !message42.premiumEffectWasPlayed);
            this.b2 = fjVar5.k.send_state;
        }
        fjVar5.M1 = false;
        this.E0 = fjVar5.C != null;
        org.telegram.messenger.a6.q(i18).v(this);
        this.W = 0;
        this.H = false;
        s0 s0Var = this.t1;
        if (s0Var != null && z13) {
            org.telegram.ui.Components.x5.release((u0) s0Var.i, (org.telegram.ui.Components.t5) s0Var.h);
            this.t1 = null;
            this.o1 = false;
        }
        if (z13 || fjVar5.H) {
            fjVar5.H = false;
            TLRPC.Message message5 = fjVar5.k;
            boolean z14 = (message5 == null || (tL_messageReactions = message5.reactions) == null || !tL_messageReactions.reactions_as_tags) ? false : true;
            boolean O5 = fjVar5.O5();
            ch.q0 q0Var = this.F0;
            if (O5) {
                q0Var.r(fjVar5, z14, i6Var3);
            } else {
                q0Var.r(null, false, i6Var3);
            }
        }
        if (fjVar5.D == 32) {
            if (this.P0 == null) {
                tw0 tw0Var = new tw0(i18, this, i6Var3);
                this.P0 = tw0Var;
                if (this.m2) {
                    tw0Var.d.R(tw0Var.b);
                }
            }
            this.P0.c(fjVar5);
        } else {
            tw0 tw0Var2 = this.P0;
            if (tw0Var2 != null) {
                tw0Var2.d.R(null);
                this.P0 = null;
            }
        }
        if (this.I0 == null && (message = fjVar5.k) != null && (message.action instanceof TLRPC.TL_messageActionStarGiftUnique)) {
            di.h6 h6Var = new di.h6(i18, this, i6Var3);
            this.I0 = h6Var;
            if (this.m2) {
                h6Var.a();
            }
        }
        di.h6 h6Var2 = this.I0;
        if (h6Var2 != null) {
            h6Var2.f(fjVar5, !z13);
        }
        ImageReceiver imageReceiver2 = this.J;
        imageReceiver2.X(0);
        imageReceiver2.e();
        if (fjVar5.D != 22) {
            this.K = null;
        }
        if (fjVar5.J0 != -1) {
            c8.ra.b(this, 0.02f, 1.2f);
            this.o2 = Math.max(org.telegram.messenger.g0.L(250.0f), hi.m3.a(fjVar5.v, (TextPaint) R("paintChatActionText")));
            xw0 X0 = lb.X0(fjVar5.v);
            if (X0 != null) {
                X0.h = this;
            }
        } else {
            setStateListAnimator(null);
            this.o2 = 0;
        }
        boolean z42 = fjVar5.z4();
        org.telegram.ui.Components.b9 b9Var = this.M;
        if (z42) {
            TLRPC.User c22 = mp.u1(i18).c2(Long.valueOf(fjVar5.k.media.user_id));
            b9Var.r(c22);
            TL_stories.StoryItem storyItem = fjVar5.k.media.storyItem;
            if (storyItem == null || !storyItem.noforwards) {
                fi.i7.x(imageReceiver2, storyItem);
            } else {
                imageReceiver2.j0(c22, b9Var, null, true, 0, true);
            }
            imageReceiver2.J0((int) (this.i1 / 2.0f));
        } else {
            int i19 = fjVar5.D;
            RadialProgress2 radialProgress22 = this.K1;
            if (i19 != 22) {
                ImageReceiver imageReceiver3 = imageReceiver2;
                if (i19 == 21) {
                    imageReceiver3.J0((int) (this.i1 / 2.0f));
                    imageReceiver3.v0 = true;
                    imageReceiver3.h1 = null;
                    TLRPC.TL_messageActionSuggestProfilePhoto tL_messageActionSuggestProfilePhoto = (TLRPC.TL_messageActionSuggestProfilePhoto) fjVar5.k.action;
                    TLRPC.VideoSize x10 = org.telegram.messenger.w7.x(1000, tL_messageActionSuggestProfilePhoto.photo.video_sizes);
                    ArrayList<TLRPC.VideoSize> arrayList3 = tL_messageActionSuggestProfilePhoto.photo.video_sizes;
                    fc j3 = (arrayList3 == null || arrayList3.isEmpty()) ? null : fc.j(x10, tL_messageActionSuggestProfilePhoto.photo);
                    TLRPC.Photo photo = fjVar5.k.action.photo;
                    if (fjVar5.I1 == null) {
                        int size = fjVar5.p0.size();
                        for (int i20 = 0; i20 < size; i20++) {
                            photoSize2 = (TLRPC.PhotoSize) fjVar5.p0.get(i20);
                            if (photoSize2 instanceof TLRPC.TL_photoStrippedSize) {
                                break;
                            }
                        }
                    }
                    photoSize2 = null;
                    TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(fjVar5.p0, 1000, false, null, false);
                    if (w10 == null) {
                        i6Var = i6Var3;
                        i7 = i18;
                        z11 = false;
                        f10 = 1.0f;
                        radialProgress2 = radialProgress22;
                    } else if (x10 != null) {
                        i6Var = i6Var3;
                        z11 = false;
                        i7 = i18;
                        radialProgress2 = radialProgress22;
                        f10 = 1.0f;
                        imageReceiver3.u0(j3, "g", fc.i(w10, photo), "150_150", fc.f(photoSize2, fjVar5.n0), "50_50_b", fjVar5.I1, 0L, null, fjVar, 0);
                        fjVar5 = fjVar;
                        imageReceiver3 = imageReceiver3;
                    } else {
                        i6Var = i6Var3;
                        i7 = i18;
                        z11 = false;
                        f10 = 1.0f;
                        radialProgress2 = radialProgress22;
                        imageReceiver3.r0(fc.i(w10, photo), "150_150", fc.f(photoSize2, fjVar5.n0), "50_50_b", fjVar5.I1, 0L, null, fjVar5, 0);
                    }
                    imageReceiver3.v0 = z11;
                    u30 u30Var = (u30) mp.u1(i7).E7.get(fjVar5.k.local_id);
                    if (u30Var == null || u30Var.X == f10) {
                        boolean z15 = !z13;
                        radialProgress2.p(z15, f10);
                        radialProgress2.setIcon(4, z15, z15);
                    } else {
                        boolean z16 = !z13;
                        radialProgress2.setIcon(3, z16, z16);
                    }
                } else {
                    i6Var = i6Var3;
                    i7 = i18;
                    int i21 = 0;
                    if (i19 == 31 || i19 == 33 || i19 == 30 || i19 == 18 || i19 == 25 || i19 == 35) {
                        imageReceiver3.J0(0);
                        TLRPC.MessageAction messageAction2 = fjVar5.k.action;
                        int i22 = 7;
                        if (messageAction2 instanceof TLRPC.TL_messageActionNoForwardsRequest) {
                            TLRPC.TL_messageActionNoForwardsRequest tL_messageActionNoForwardsRequest = (TLRPC.TL_messageActionNoForwardsRequest) messageAction2;
                            this.a2 = tL_messageActionNoForwardsRequest.expired || ((long) fjVar5.k.date) + mp.u1(i7).A7.I.n2(TimeUnit.SECONDS) < ((long) ConnectionsManager.getInstance(i7).getCurrentTime());
                            if (fjVar.N3() || tL_messageActionNoForwardsRequest.expired || this.a2) {
                                i14 = 8;
                            } else {
                                ArrayList arrayList4 = new ArrayList();
                                i14 = 8;
                                arrayList4.add(new org.telegram.messenger.n2[]{new org.telegram.messenger.p2(7, 2131751403, R.drawable.filled_bot_decline_24), new org.telegram.messenger.p2(8, 2131751404, R.drawable.filled_bot_approve_24)});
                                this.Z1 = new b3.j((org.telegram.messenger.n2[][]) arrayList4.toArray(new org.telegram.messenger.n2[arrayList4.size()][]), i21, i22);
                            }
                            fjVar2 = fjVar;
                            i10 = i14;
                            i18 = i7;
                            i6Var2 = i6Var;
                            document = null;
                        } else if (messageAction2 instanceof TLRPC.TL_messageActionStarGiftPurchaseOffer) {
                            TLRPC.TL_messageActionStarGiftPurchaseOffer tL_messageActionStarGiftPurchaseOffer = (TLRPC.TL_messageActionStarGiftPurchaseOffer) messageAction2;
                            TL_stars.StarGift starGift = tL_messageActionStarGiftPurchaseOffer.gift;
                            if (starGift != null) {
                                document5 = cg.d.e(starGift);
                                i10 = 8;
                                if (this.T0 == null) {
                                    i6Var2 = i6Var;
                                    this.T0 = new bi.y2(this, i6Var2, false);
                                } else {
                                    i6Var2 = i6Var;
                                }
                                this.T0.d((TL_stars.starGiftAttributeBackdrop) di.x8.l(starGift.attributes, TL_stars.starGiftAttributeBackdrop.class));
                                this.T0.e((TL_stars.starGiftAttributePattern) di.x8.l(starGift.attributes, TL_stars.starGiftAttributePattern.class));
                            } else {
                                i10 = 8;
                                i6Var2 = i6Var;
                                document5 = null;
                            }
                            this.a2 = tL_messageActionStarGiftPurchaseOffer.expires_at < ConnectionsManager.getInstance(i7).getCurrentTime();
                            if (!fjVar.N3() && !tL_messageActionStarGiftPurchaseOffer.accepted && !tL_messageActionStarGiftPurchaseOffer.declined && !this.a2) {
                                ArrayList arrayList5 = new ArrayList();
                                arrayList5.add(new org.telegram.messenger.n2[]{new org.telegram.messenger.p2(5, 2131749714, R.drawable.filled_bot_decline_24), new org.telegram.messenger.p2(6, 2131749724, R.drawable.filled_bot_approve_24)});
                                this.Z1 = new b3.j((org.telegram.messenger.n2[][]) arrayList5.toArray(new org.telegram.messenger.n2[arrayList5.size()][]), i21, i22);
                            }
                            fjVar2 = fjVar;
                            document = document5;
                            i18 = i7;
                        } else {
                            i10 = 8;
                            i6Var2 = i6Var;
                            if (!(messageAction2 instanceof TLRPC.TL_messageActionStarGiftOnchainOffer)) {
                                i18 = i7;
                                if (!(messageAction2 instanceof TLRPC.TL_messageActionSetChatTheme)) {
                                    if (messageAction2 instanceof TLRPC.TL_messageActionStarGift) {
                                        TL_stars.StarGift starGift2 = ((TLRPC.TL_messageActionStarGift) messageAction2).gift;
                                        if (starGift2 != null) {
                                            document = starGift2.sticker;
                                            fjVar2 = fjVar;
                                            fjVar4 = fjVar2;
                                            str2 = null;
                                            fjVar3 = null;
                                        }
                                        document = null;
                                        fjVar2 = fjVar;
                                        fjVar4 = fjVar2;
                                        str2 = null;
                                        fjVar3 = null;
                                    } else {
                                        if (messageAction2 instanceof TLRPC.TL_messageActionStarGiftUnique) {
                                            TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique = (TLRPC.TL_messageActionStarGiftUnique) messageAction2;
                                            if (tL_messageActionStarGiftUnique.refunded) {
                                                TL_stars.StarGift starGift3 = tL_messageActionStarGiftUnique.gift;
                                                if (starGift3 != null) {
                                                    document = starGift3.getDocument();
                                                    fjVar2 = fjVar;
                                                    fjVar4 = fjVar2;
                                                    str2 = null;
                                                    fjVar3 = null;
                                                }
                                                document = null;
                                                fjVar2 = fjVar;
                                                fjVar4 = fjVar2;
                                                str2 = null;
                                                fjVar3 = null;
                                            }
                                        }
                                        if (messageAction2 instanceof TLRPC.TL_messageActionGiftTon) {
                                            str = j10.i(i18).d0;
                                            if (str == null) {
                                                ri.d0(i18).E();
                                                return;
                                            }
                                        } else {
                                            str = j10.i(i18).c0;
                                            if (str == null) {
                                                ri.d0(i18).B();
                                                return;
                                            }
                                        }
                                        TLRPC.TL_messages_stickerSet r02 = ri.d0(i18).r0(str);
                                        if (r02 == null) {
                                            r02 = ri.d0(i18).p0(str);
                                        }
                                        ?? r10 = r02;
                                        fjVar2 = fjVar;
                                        if (r10 != 0) {
                                            TLRPC.MessageAction messageAction3 = fjVar2.k.action;
                                            int i23 = messageAction3.months;
                                            if (fjVar2.D == 30) {
                                                String str7 = "3⃣";
                                                if (messageAction3 instanceof TLRPC.TL_messageActionGiftTon) {
                                                    long j10 = messageAction3.cryptoAmount;
                                                    if (j10 > 10000000000L) {
                                                        if (j10 <= 50000000000L) {
                                                            str7 = "1⃣";
                                                        }
                                                        i11 = 0;
                                                        while (true) {
                                                            if (i11 < r10.packs.size()) {
                                                                break;
                                                            }
                                                            TLRPC.TL_stickerPack tL_stickerPack = r10.packs.get(i11);
                                                            if (TextUtils.equals(tL_stickerPack.emoticon, str7) && !tL_stickerPack.documents.isEmpty()) {
                                                                long longValue = tL_stickerPack.documents.get(i21).longValue();
                                                                for (int i24 = i21; i24 < r10.documents.size(); i24++) {
                                                                    TLRPC.Document document6 = r10.documents.get(i24);
                                                                    if (document6 != null && document6.id == longValue) {
                                                                        document2 = document6;
                                                                        break;
                                                                    }
                                                                }
                                                            } else {
                                                                i11++;
                                                                i21 = 0;
                                                            }
                                                        }
                                                        document2 = null;
                                                    }
                                                    str7 = "2⃣";
                                                    i11 = 0;
                                                    while (true) {
                                                        if (i11 < r10.packs.size()) {
                                                        }
                                                        i11++;
                                                        i21 = 0;
                                                    }
                                                    document2 = null;
                                                } else {
                                                    long j11 = messageAction3 instanceof TLRPC.TL_messageActionGiftStars ? ((TLRPC.TL_messageActionGiftStars) messageAction3).stars : ((TLRPC.TL_messageActionPrizeStars) messageAction3).stars;
                                                    if (j11 > 1000) {
                                                        if (j11 >= 2500) {
                                                            str7 = "4⃣";
                                                        }
                                                        i11 = 0;
                                                        while (true) {
                                                            if (i11 < r10.packs.size()) {
                                                            }
                                                            i11++;
                                                            i21 = 0;
                                                        }
                                                        document2 = null;
                                                    }
                                                    str7 = "2⃣";
                                                    i11 = 0;
                                                    while (true) {
                                                        if (i11 < r10.packs.size()) {
                                                        }
                                                        i11++;
                                                        i21 = 0;
                                                    }
                                                    document2 = null;
                                                }
                                                if (document2 == null && !r10.documents.isEmpty()) {
                                                    document2 = r10.documents.get(0);
                                                }
                                                fjVar4 = r10;
                                                document = document2;
                                                str2 = str3;
                                                fjVar3 = fjVar4;
                                            } else {
                                                String str8 = (String) B2.get(Integer.valueOf(i23));
                                                ArrayList<TLRPC.TL_stickerPack> arrayList6 = r10.packs;
                                                int size2 = arrayList6.size();
                                                int i25 = 0;
                                                document2 = null;
                                                while (i25 < size2) {
                                                    TLRPC.TL_stickerPack tL_stickerPack2 = arrayList6.get(i25);
                                                    i25++;
                                                    TLRPC.TL_stickerPack tL_stickerPack3 = tL_stickerPack2;
                                                    if (Objects.equals(tL_stickerPack3.emoticon, str8)) {
                                                        ArrayList<Long> arrayList7 = tL_stickerPack3.documents;
                                                        int size3 = arrayList7.size();
                                                        TLRPC.Document document7 = document2;
                                                        int i26 = 0;
                                                        while (true) {
                                                            if (i26 >= size3) {
                                                                str3 = str;
                                                                str4 = str8;
                                                                arrayList = arrayList6;
                                                                break;
                                                            }
                                                            Long l10 = arrayList7.get(i26);
                                                            i26++;
                                                            long longValue2 = l10.longValue();
                                                            ArrayList<TLRPC.Document> arrayList8 = r10.documents;
                                                            str3 = str;
                                                            int size4 = arrayList8.size();
                                                            str4 = str8;
                                                            int i27 = 0;
                                                            while (true) {
                                                                if (i27 >= size4) {
                                                                    arrayList = arrayList6;
                                                                    break;
                                                                }
                                                                TLRPC.Document document8 = arrayList8.get(i27);
                                                                int i28 = i27 + 1;
                                                                int i29 = size4;
                                                                TLRPC.Document document9 = document8;
                                                                arrayList = arrayList6;
                                                                if (document9.id == longValue2) {
                                                                    document7 = document9;
                                                                    break;
                                                                } else {
                                                                    arrayList6 = arrayList;
                                                                    size4 = i29;
                                                                    i27 = i28;
                                                                }
                                                            }
                                                            if (document7 != null) {
                                                                break;
                                                            }
                                                            str = str3;
                                                            str8 = str4;
                                                            arrayList6 = arrayList;
                                                        }
                                                        document2 = document7;
                                                    } else {
                                                        str3 = str;
                                                        str4 = str8;
                                                        arrayList = arrayList6;
                                                    }
                                                    if (document2 != null) {
                                                        break;
                                                    }
                                                    str = str3;
                                                    str8 = str4;
                                                    arrayList6 = arrayList;
                                                }
                                            }
                                            str3 = str;
                                            if (document2 == null) {
                                                document2 = r10.documents.get(0);
                                            }
                                            fjVar4 = r10;
                                            document = document2;
                                            str2 = str3;
                                            fjVar3 = fjVar4;
                                        } else {
                                            fjVar3 = r10;
                                            str2 = str;
                                            document = null;
                                            fjVar4 = null;
                                        }
                                    }
                                    if (!this.l0 && this.f0 && this.j0 && (this.g0 || this.h0 || this.i0)) {
                                        this.m0 = org.telegram.messenger.g0.L(33.0f);
                                        if (this.o0 == null) {
                                            q01 q01Var2 = new q01(i18, this, i6Var2, true);
                                            this.o0 = q01Var2;
                                            q01Var2.s = new n0(this, 4);
                                        }
                                        if (this.o0.e(this.Q0)) {
                                            if (this.m2) {
                                                this.o0.a();
                                            }
                                            i15 = 0;
                                        } else {
                                            this.o0.b();
                                            this.o0 = null;
                                            i15 = 0;
                                            this.m0 = 0;
                                        }
                                    } else {
                                        q01Var = this.o0;
                                        if (q01Var != null) {
                                            q01Var.b();
                                            this.o0 = null;
                                        }
                                        i15 = 0;
                                        this.m0 = 0;
                                    }
                                    paddingTop = getPaddingTop();
                                    i16 = this.m0;
                                    if (paddingTop != i16) {
                                        setPadding(i15, i16, i15, i15);
                                    }
                                    if (Y(fjVar) || U()) {
                                        i15 = i10;
                                    }
                                    this.U1.setVisibility(i15);
                                    qg.c.b(fjVar2);
                                    requestLayout();
                                }
                                TL_stars.StarGift starGift4 = ((TLRPC.TL_chatThemeUniqueGift) ((TLRPC.TL_messageActionSetChatTheme) messageAction2).theme).gift;
                                if (starGift4 != null) {
                                    document3 = cg.d.e(starGift4);
                                    if (this.T0 == null) {
                                        this.T0 = new bi.y2(this, i6Var2, false);
                                    }
                                    this.T0.d((TL_stars.starGiftAttributeBackdrop) di.x8.l(starGift4.attributes, TL_stars.starGiftAttributeBackdrop.class));
                                    this.T0.e((TL_stars.starGiftAttributePattern) di.x8.l(starGift4.attributes, TL_stars.starGiftAttributePattern.class));
                                } else {
                                    document3 = null;
                                }
                                document = document3;
                                str2 = null;
                                fjVar3 = null;
                                fjVar4 = null;
                                fjVar2 = fjVar;
                                jVar = this.Z1;
                                if (jVar != null) {
                                    int length = ((org.telegram.messenger.n2[][]) jVar.c).length;
                                    int i30 = 0;
                                    while (i30 < length) {
                                        int length2 = ((org.telegram.messenger.n2[][]) this.Z1.c)[i30].length;
                                        int i31 = 0;
                                        while (i31 < length2) {
                                            org.telegram.messenger.n2 n2Var = ((org.telegram.messenger.n2[][]) this.Z1.c)[i30][i31];
                                            int i32 = length;
                                            d0 d0Var = new d0(new n0(this, 3));
                                            d0Var.j = (org.telegram.messenger.p2) n2Var;
                                            int c10 = n2Var.c();
                                            if (c10 != 0) {
                                                Drawable drawable = getResources().getDrawable(c10);
                                                d0Var.t = drawable;
                                                i12 = i30;
                                                i13 = length2;
                                                drawable.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                                            } else {
                                                i12 = i30;
                                                i13 = length2;
                                            }
                                            d0Var.f = org.telegram.messenger.g0.L(40.0f);
                                            int i33 = d0Var.g | 8;
                                            d0Var.g = i33;
                                            int b10 = dd.b(i33, 1, i31 == 0);
                                            d0Var.g = b10;
                                            d0Var.g = dd.b(b10, 2, i31 == 1);
                                            d0Var.h = new vy0(n2Var.d(), (TextPaint) R("paintChatBotButton"));
                                            arrayList2.add(d0Var);
                                            i31++;
                                            length = i32;
                                            i30 = i12;
                                            length2 = i13;
                                        }
                                        i30++;
                                    }
                                }
                                this.M1 = fjVar2.n1;
                                this.I1 = document;
                                if (document == null) {
                                    imageReceiver3.v0 = true;
                                    int i34 = fjVar2.D;
                                    if (i34 != 31 && i34 != 37 && i34 != 33) {
                                        imageReceiver3.h1 = this.O1;
                                    }
                                    this.J1 = null;
                                    int i35 = 0;
                                    while (true) {
                                        if (i35 >= document.video_thumbs.size()) {
                                            break;
                                        }
                                        if ("f".equals(document.video_thumbs.get(i35).type)) {
                                            this.J1 = document.video_thumbs.get(i35);
                                            break;
                                        }
                                        i35++;
                                    }
                                    if (z13 || fjVar2.D != 18) {
                                        lz f11 = org.telegram.messenger.u5.f(document, org.telegram.ui.ActionBar.n6.a7, 0.3f, null);
                                        imageReceiver3.W(0);
                                        fc b11 = fc.b(document);
                                        Locale locale = Locale.US;
                                        imageReceiver3.q0(b11, i5.c.i(fjVar2.m1, "160_160_nr_messageId="), f11, "tgs", fjVar4, 1);
                                    }
                                } else if (str2 != null) {
                                    ri.d0(i18).f1(str2, false, fjVar3 == null);
                                }
                                if (!this.l0) {
                                }
                                q01Var = this.o0;
                                if (q01Var != null) {
                                }
                                i15 = 0;
                                this.m0 = 0;
                                paddingTop = getPaddingTop();
                                i16 = this.m0;
                                if (paddingTop != i16) {
                                }
                                if (Y(fjVar)) {
                                }
                                i15 = i10;
                                this.U1.setVisibility(i15);
                                qg.c.b(fjVar2);
                                requestLayout();
                            }
                            TLRPC.TL_messageActionStarGiftOnchainOffer tL_messageActionStarGiftOnchainOffer = (TLRPC.TL_messageActionStarGiftOnchainOffer) messageAction2;
                            TL_stars.StarGift starGift5 = tL_messageActionStarGiftOnchainOffer.gift;
                            if (starGift5 != null) {
                                document4 = cg.d.e(starGift5);
                                if (this.T0 == null) {
                                    this.T0 = new bi.y2(this, i6Var2, false);
                                }
                                this.T0.d((TL_stars.starGiftAttributeBackdrop) di.x8.l(starGift5.attributes, TL_stars.starGiftAttributeBackdrop.class));
                                this.T0.e((TL_stars.starGiftAttributePattern) di.x8.l(starGift5.attributes, TL_stars.starGiftAttributePattern.class));
                            } else {
                                document4 = null;
                            }
                            this.c2 = tL_messageActionStarGiftOnchainOffer;
                            i18 = i7;
                            boolean h = bi.f4.h(i18, tL_messageActionStarGiftOnchainOffer);
                            this.d2 = h;
                            this.e2 = -1;
                            this.a2 = !h;
                            if (starGift5 instanceof TL_stars.TL_starGiftUnique) {
                                if (this.f2 == null) {
                                    this.f2 = new bi.f3(this, 0.85f);
                                }
                                if (tL_messageActionStarGiftOnchainOffer.buyer || !(tL_messageActionStarGiftOnchainOffer.accepted || tL_messageActionStarGiftOnchainOffer.settled)) {
                                    this.f2.e((TL_stars.starGiftAttributeBackdrop) di.x8.l(starGift5.attributes, TL_stars.starGiftAttributeBackdrop.class), false, false);
                                    this.f2.g(9, i5.c.l(((TL_stars.TL_starGiftUnique) starGift5).num, ',', new StringBuilder("#")), true);
                                } else {
                                    this.f2.f(-698031);
                                    this.f2.g(10, gd.M0(2131749577, null), false);
                                }
                            }
                            fjVar2 = fjVar;
                            document = document4;
                        }
                        str2 = null;
                        fjVar3 = null;
                        fjVar4 = null;
                        jVar = this.Z1;
                        if (jVar != null) {
                        }
                        this.M1 = fjVar2.n1;
                        this.I1 = document;
                        if (document == null) {
                        }
                        if (!this.l0) {
                        }
                        q01Var = this.o0;
                        if (q01Var != null) {
                        }
                        i15 = 0;
                        this.m0 = 0;
                        paddingTop = getPaddingTop();
                        i16 = this.m0;
                        if (paddingTop != i16) {
                        }
                        if (Y(fjVar)) {
                        }
                        i15 = i10;
                        this.U1.setVisibility(i15);
                        qg.c.b(fjVar2);
                        requestLayout();
                    }
                    if (i19 == 37) {
                        TLRPC.Chat O0 = mp.u1(i7).O0(Long.valueOf(((TLRPC.TL_messageActionChangeCommunity) fjVar5.k.action).community_id));
                        imageReceiver3.v0 = true;
                        imageReceiver3.h1 = null;
                        imageReceiver3.J0(org.telegram.messenger.g0.L(14.0f));
                        imageReceiver3.X(1);
                        b9Var.q(O0);
                        imageReceiver3.i0(O0, new fi.i0(getContext(), org.telegram.messenger.g0.L(14.0f)), O0);
                    } else if (i19 == 11) {
                        imageReceiver3.v0 = true;
                        imageReceiver3.h1 = null;
                        imageReceiver3.J0(org.telegram.messenger.g0.u / 2);
                        imageReceiver3.X(1);
                        b9Var.k(fj.B0(fjVar5.k), null, null, null);
                        if (fjVar5.k.action instanceof TLRPC.TL_messageActionUserUpdatedPhoto) {
                            imageReceiver3.q0(null, null, b9Var, null, fjVar5, 0);
                        } else {
                            if (fjVar5.I1 == null) {
                                int size5 = fjVar5.p0.size();
                                for (int i36 = 0; i36 < size5; i36++) {
                                    photoSize = (TLRPC.PhotoSize) fjVar5.p0.get(i36);
                                    if (photoSize instanceof TLRPC.TL_photoStrippedSize) {
                                        break;
                                    }
                                }
                            }
                            photoSize = null;
                            TLRPC.PhotoSize w11 = org.telegram.messenger.w7.w(fjVar5.p0, 640, false, null, false);
                            if (w11 != null) {
                                TLRPC.Photo photo2 = fjVar5.k.action.photo;
                                if (!photo2.video_sizes.isEmpty()) {
                                    int i37 = bz.a;
                                    if (pc.e(2048)) {
                                        videoSize = org.telegram.messenger.w7.x(1000, photo2.video_sizes);
                                        if (!fjVar5.z0 && !org.telegram.messenger.a6.q(i7).c(4, videoSize.size)) {
                                            this.y0 = fc.j(videoSize, photo2);
                                            org.telegram.messenger.a6.q(i7).a(org.telegram.messenger.w7.r(null, videoSize), fjVar5, this);
                                        }
                                        if (videoSize == null) {
                                            imageReceiver3.r0(fc.j(videoSize, photo2), "g", fc.f(photoSize, fjVar5.n0), "50_50_b", fjVar5.I1, 0L, null, fjVar5, 1);
                                        } else {
                                            imageReceiver3.r0(fc.f(w11, fjVar5.n0), "150_150", fc.f(photoSize, fjVar5.n0), "50_50_b", fjVar5.I1, 0L, null, fjVar5, 1);
                                        }
                                        imageReceiver3 = imageReceiver3;
                                    }
                                }
                                videoSize = null;
                                if (videoSize == null) {
                                }
                                imageReceiver3 = imageReceiver3;
                            } else {
                                imageReceiver3 = imageReceiver3;
                                imageReceiver3.w0(b9Var);
                            }
                        }
                        imageReceiver3.O0(!PhotoViewer.L1(fjVar5), false);
                    } else {
                        imageReceiver3.v0 = true;
                        imageReceiver3.h1 = null;
                        imageReceiver3.w0(null);
                    }
                }
                fjVar2 = fjVar5;
                i18 = i7;
                i6Var2 = i6Var;
                i10 = 8;
                if (!this.l0) {
                }
                q01Var = this.o0;
                if (q01Var != null) {
                }
                i15 = 0;
                this.m0 = 0;
                paddingTop = getPaddingTop();
                i16 = this.m0;
                if (paddingTop != i16) {
                }
                if (Y(fjVar)) {
                }
                i15 = i10;
                this.U1.setVisibility(i15);
                qg.c.b(fjVar2);
                requestLayout();
            }
            if (fjVar5.I1 == null) {
                int size6 = fjVar5.p0.size();
                for (int i38 = 0; i38 < size6 && !(((TLRPC.PhotoSize) fjVar5.p0.get(i38)) instanceof TLRPC.TL_photoStrippedSize); i38++) {
                }
            }
            TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent = fjVar5.L1;
            if (tL_channelAdminLogEvent != null) {
                TLRPC.ChannelAdminLogEventAction channelAdminLogEventAction = tL_channelAdminLogEvent.action;
                if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionChangeWallpaper) {
                    wallPaper = ((TLRPC.TL_channelAdminLogEventActionChangeWallpaper) channelAdminLogEventAction).new_value;
                    if (TextUtils.isEmpty(org.telegram.messenger.f4.j(wallPaper))) {
                        boolean d = i6Var3 != null ? i6Var3.d() : org.telegram.ui.ActionBar.n6.I.q();
                        imageReceiver2.f();
                        String j12 = org.telegram.messenger.f4.j(wallPaper);
                        int i39 = hi.w5.C0;
                        org.telegram.ui.ActionBar.t3 i40 = org.telegram.messenger.f4.f(i18).i(ig.b.d(j12));
                        Drawable s02 = i40 == null ? org.telegram.ui.ActionBar.n6.s0() : hi.w5.g(i18, i40, d);
                        this.K = s02;
                        if (s02 != null) {
                            s02.setCallback(this);
                        }
                        imageReceiver = imageReceiver2;
                    } else if (wallPaper == null || (str5 = wallPaper.uploadingImage) == null) {
                        TLRPC.WallPaper wallPaper2 = wallPaper;
                        if (wallPaper2 != null) {
                            TLObject tLObject = fjVar5.n0;
                            imageReceiver2.r0(fc.b(tLObject instanceof TLRPC.Document ? (TLRPC.Document) tLObject : wallPaper2.document), "150_150_wallpaper" + wallPaper2.id + en.e(wallPaper2.settings), null, null, en.b(wallPaper2), 0L, null, wallPaper2, 1);
                            imageReceiver = imageReceiver2;
                            this.K = null;
                        } else {
                            imageReceiver = imageReceiver2;
                            this.K = null;
                        }
                    } else {
                        imageReceiver2.r0(fc.g(str5), "150_150_wallpaper" + wallPaper.id + en.e(wallPaper.settings), null, null, en.b(wallPaper), 0L, null, wallPaper, 1);
                        this.K = null;
                        imageReceiver = imageReceiver2;
                    }
                    imageReceiver.J0((int) (this.i1 / 2.0f));
                    if (S(fjVar) != 1.0f) {
                        boolean z17 = !z13;
                        radialProgress22.p(z17, 1.0f);
                        radialProgress22.setIcon(4, z17, z17);
                    } else {
                        boolean z18 = !z13;
                        radialProgress22.setIcon(3, z18, z18);
                    }
                }
            }
            TLRPC.Message message6 = fjVar5.k;
            wallPaper = (message6 == null || (messageAction = message6.action) == null) ? null : messageAction.wallpaper;
            if (TextUtils.isEmpty(org.telegram.messenger.f4.j(wallPaper))) {
            }
            imageReceiver.J0((int) (this.i1 / 2.0f));
            if (S(fjVar) != 1.0f) {
            }
        }
        i6Var2 = i6Var3;
        fjVar2 = fjVar5;
        i10 = 8;
        if (!this.l0) {
        }
        q01Var = this.o0;
        if (q01Var != null) {
        }
        i15 = 0;
        this.m0 = 0;
        paddingTop = getPaddingTop();
        i16 = this.m0;
        if (paddingTop != i16) {
        }
        if (Y(fjVar)) {
        }
        i15 = i10;
        this.U1.setVisibility(i15);
        qg.c.b(fjVar2);
        requestLayout();
    }

    public final void k0(int i7, int i10) {
        this.U0 = i7;
        this.V0 = i10;
    }

    @Override // org.telegram.ui.Cells.p4
    public final /* synthetic */ boolean l() {
        return false;
    }

    public final void l0(float f10, int i7) {
        this.x0 = true;
        this.w0 = i7;
        this.u0 = f10;
        this.v0 = 0.0f;
    }

    @Override // org.telegram.ui.Cells.p4
    public final /* synthetic */ boolean m() {
        return false;
    }

    public final void n0() {
        TLRPC.TL_messageActionStarGiftOnchainOffer tL_messageActionStarGiftOnchainOffer = this.c2;
        if (tL_messageActionStarGiftOnchainOffer == null || !this.d2 || this.Q0 == null || this.t1 == null) {
            return;
        }
        HashMap hashMap = bi.f4.a;
        int i7 = tL_messageActionStarGiftOnchainOffer.expires_at;
        int i10 = this.I;
        int max = Math.max(0, i7 - ConnectionsManager.getInstance(i10).getCurrentTime());
        if (max <= 0) {
            if (this.e2 == 0) {
                return;
            }
            this.e2 = 0;
            this.d2 = bi.f4.h(i10, this.c2);
            post(new fa(5, this, this.Q0));
            return;
        }
        if (max != this.e2) {
            this.e2 = max;
            this.t1.a(d0(bi.f4.c(this.c2), this.c2), this.G1, this.t1.d);
        }
        postInvalidateDelayed(1016 - (System.currentTimeMillis() % 1000));
    }

    public final void o0(boolean z10) {
        if (getMeasuredWidth() != 0) {
            E(getMeasuredWidth(), this.S0);
            invalidate();
        }
        if (this.D0) {
            v();
        } else if (z10) {
            org.telegram.messenger.g0.g3(new n0(this, 6));
        } else {
            requestLayout();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        r0 r0Var;
        super.onAttachedToWindow();
        this.m2 = true;
        this.J.P();
        setStarsPaused(false);
        this.s0 = org.telegram.ui.Components.x5.update(0, this, (!this.s || (r0Var = this.g1) == null || r0Var.h()) ? false : true, this.s0, this.N);
        s0 s0Var = this.t1;
        if (s0Var != null) {
            s0Var.h = org.telegram.ui.Components.x5.update(0, (View) s0Var.i, false, (org.telegram.ui.Components.t5) s0Var.h, (StaticLayout) s0Var.f);
        }
        int i7 = this.I;
        ks.f(i7).c(this, ks.Y2);
        ks.f(i7).c(this, ks.Z2);
        ks.f(i7).c(this, ks.H3);
        ks.f(i7).c(this, ks.y0);
        ks.f(i7).c(this, ks.c4);
        ks.e().c(this, ks.k4);
        fj fjVar = this.Q0;
        if (fjVar != null && fjVar.D == 21) {
            j0(fjVar, true);
        }
        di.h6 h6Var = this.I0;
        if (h6Var != null) {
            h6Var.a();
        }
        ch.q0 q0Var = this.F0;
        ArrayList arrayList = q0Var.s;
        q0Var.D = true;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            ((ch.n0) arrayList.get(i10)).a();
        }
        q01 q01Var = this.o0;
        if (q01Var != null) {
            q01Var.a();
        }
        tw0 tw0Var = this.P0;
        if (tw0Var != null) {
            tw0Var.d.R(tw0Var.b);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.m2 = false;
        int i7 = this.I;
        org.telegram.messenger.a6.q(i7).v(this);
        this.J.R();
        setStarsPaused(true);
        this.D0 = false;
        org.telegram.ui.Components.x5.release(this, this.s0);
        s0 s0Var = this.t1;
        if (s0Var != null) {
            org.telegram.ui.Components.x5.release((u0) s0Var.i, (org.telegram.ui.Components.t5) s0Var.h);
        }
        ks.f(i7).n(this, ks.Y2);
        ks.f(i7).n(this, ks.Z2);
        ks.f(i7).n(this, ks.H3);
        ks.f(i7).n(this, ks.y0);
        ks.f(i7).n(this, ks.c4);
        ks.e().n(this, ks.k4);
        this.e0.g();
        this.A2.a = false;
        di.h6 h6Var = this.I0;
        if (h6Var != null) {
            h6Var.S = false;
            h6Var.d.R();
            h6Var.e.b();
            bi.h1 h1Var = h6Var.y;
            h1Var.d.R();
            org.telegram.ui.Components.x5.release((View) null, h1Var.q);
            h1Var.q = null;
        }
        this.F0.p();
        q01 q01Var = this.o0;
        if (q01Var != null) {
            q01Var.b();
        }
        tw0 tw0Var = this.P0;
        if (tw0Var != null) {
            tw0Var.d.R(null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:241:0x0e00  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0e96  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0f44  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x0f7f  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x0fe5  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x0fb1  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x0fbb  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x0fb3  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x0f84  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x0f5a  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x0ee7  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x054c  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0591 A[LOOP:1: B:87:0x058f->B:88:0x0591, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x056c  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x056e  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onDraw(Canvas canvas) {
        char c10;
        int i7;
        int i10;
        TextPaint textPaint;
        ArrayList arrayList;
        int i11;
        RadialProgress2 radialProgress2;
        u0 u0Var;
        float f10;
        float L;
        int i12;
        Canvas canvas2;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        vy0 vy0Var;
        float i13;
        Paint R;
        boolean d;
        ColorMatrix colorMatrix;
        int i14;
        float f16;
        u0 u0Var2;
        int i15;
        vy0 vy0Var2;
        r0 r0Var;
        int size;
        int i16;
        TextPaint textPaint2;
        Canvas canvas3 = canvas;
        canvas3.save();
        canvas3.translate(this.k0 / 2.0f, getPaddingTop());
        fj fjVar = this.Q0;
        float d2 = this.r1.d(!this.p1);
        int i17 = this.i1;
        boolean U = U();
        fi.e7 e7Var = this.e0;
        TextPaint textPaint3 = this.G1;
        ImageReceiver imageReceiver = this.J;
        if (!U && this.P0 == null && Y(fjVar)) {
            this.i1 = this.j1 - org.telegram.messenger.g0.L(106.0f);
            if (a0()) {
                i17 = Q(fjVar);
                float f17 = (this.W - i17) / 2.0f;
                float L2 = org.telegram.messenger.g0.L(16.0f) + org.telegram.messenger.g0.L(4.0f) + this.T + this.P;
                if (fjVar.z4()) {
                    e7Var.d = fjVar.k.media.storyItem;
                }
                float f18 = i17;
                e7Var.F.set(f17, L2, f17 + f18, f18 + L2);
                int i18 = fjVar.D;
                if (i18 == 31 || i18 == 33 || i18 == 34 || i18 == 35) {
                    f17 += org.telegram.messenger.g0.L(10.0f);
                    L2 += org.telegram.messenger.g0.L(10.0f);
                    i17 -= org.telegram.messenger.g0.L(20.0f);
                }
                if (fjVar.D == 37) {
                    f17 += org.telegram.messenger.g0.L(2.0f);
                }
                imageReceiver.y0(f17, L2, Math.max(0, i17), Math.max(0, i17));
                int i19 = fjVar.D;
                if (i19 == 31 || i19 == 33 || i19 == 34 || i19 == 35) {
                    i17 = org.telegram.messenger.g0.L(20.0f) + i17;
                }
            } else {
                int i20 = fjVar.D;
                if (i20 == 11) {
                    int i21 = this.W;
                    float f19 = this.i1;
                    imageReceiver.y0((i21 - r3) / 2.0f, (this.j1 * 0.075f) + this.T + this.P, f19, f19);
                } else {
                    if (i20 == 25) {
                        i17 = (int) (this.i1 * (org.telegram.messenger.g0.Q1() ? 1.0f : 1.2f));
                        float f20 = i17;
                        imageReceiver.y0((this.W - i17) / 2.0f, ((this.j1 * 0.075f) + (this.T + this.P)) - org.telegram.messenger.g0.L(22.0f), f20, f20);
                    } else if (fjVar.s4()) {
                        float f21 = i17;
                        imageReceiver.y0((this.W - i17) / 2.0f, (this.j1 * 0.075f) + this.T + this.P + org.telegram.messenger.g0.L(2.0f), f21, f21);
                    } else if (fjVar.D == 30) {
                        i17 = (int) (this.i1 * 1.1f);
                        TLRPC.Message message = fjVar.k;
                        if (message == null || (message.action instanceof TLRPC.TL_messageActionStarGift)) {
                            float f22 = i17;
                            imageReceiver.y0((this.W - i17) / 2.0f, ((this.j1 * 0.075f) + (this.T + this.P)) - org.telegram.messenger.g0.L(12.0f), f22, f22);
                        } else {
                            float f23 = i17;
                            imageReceiver.y0((this.W - i17) / 2.0f, ((this.j1 * 0.075f) + (this.T + this.P)) - org.telegram.messenger.g0.L(22.0f), f23, f23);
                        }
                    } else {
                        i17 = (int) (this.i1 * 1.0f);
                        float f24 = i17;
                        imageReceiver.y0((this.W - i17) / 2.0f, ((this.j1 * 0.075f) + (this.T + this.P)) - org.telegram.messenger.g0.L(4.0f), f24, f24);
                    }
                    textPaint2 = (TextPaint) R("paintChatActionText");
                    this.t0 = textPaint2;
                    if (textPaint2 != null) {
                        TextPaint textPaint4 = this.F1;
                        if (textPaint4 != null && textPaint4.getColor() != this.t0.getColor()) {
                            textPaint4.setColor(this.t0.getColor());
                        }
                        TextPaint textPaint5 = this.H1;
                        if (textPaint5 != null && textPaint5.getColor() != this.t0.getColor()) {
                            textPaint5.setColor(this.t0.getColor());
                            textPaint5.linkColor = this.t0.getColor();
                        }
                        if (textPaint3 != null && textPaint3.getColor() != this.t0.getColor()) {
                            textPaint3.setColor(this.t0.getColor());
                            textPaint3.linkColor = this.t0.getColor();
                        }
                    }
                }
            }
            textPaint2 = (TextPaint) R("paintChatActionText");
            this.t0 = textPaint2;
            if (textPaint2 != null) {
            }
        }
        int i22 = i17;
        G(canvas3, false);
        if (W()) {
            canvas3.save();
            int width = getWidth();
            this.J0.getClass();
            float h = (width - org.telegram.ui.Wallet.m4.h()) / 2.0f;
            this.L0 = h;
            float walletActionTop = getWalletActionTop();
            this.M0 = walletActionTop;
            canvas3.translate(h, walletActionTop);
            this.J0.o((this.k0 / 2.0f) + this.L0, this.M0 + getPaddingTop());
            this.J0.d(canvas3);
            canvas3.restore();
        }
        boolean U2 = U();
        RadialProgress2 radialProgress22 = this.K1;
        if (U2) {
            canvas3.save();
            float width2 = (getWidth() - this.I0.d()) / 2.0f;
            this.G0 = width2;
            float L3 = this.I0.p ? org.telegram.messenger.g0.L(4.0f) : org.telegram.messenger.g0.L(16.0f) + this.T + this.P;
            this.H0 = L3;
            canvas3.translate(width2, L3);
            this.I0.b(canvas3);
            r0 r0Var2 = this.g1;
            if (r0Var2 == null || r0Var2.h()) {
                this.I0.c(canvas3);
            }
            canvas3.restore();
        } else if (this.P0 != null) {
            canvas3.save();
            this.P0.a(canvas3);
            canvas3.restore();
        } else if (Y(fjVar) || (fjVar != null && fjVar.D == 11)) {
            bi.y2 y2Var = this.T0;
            if (y2Var != null && ((i10 = fjVar.D) == 31 || i10 == 37 || i10 == 33)) {
                y2Var.setBounds((int) (imageReceiver.x() - org.telegram.messenger.g0.L(13.33f)), (int) (imageReceiver.z() - org.telegram.messenger.g0.L(14.0f)), (int) (imageReceiver.w() + imageReceiver.x() + org.telegram.messenger.g0.L(13.33f)), (int) (imageReceiver.v() + imageReceiver.z() + org.telegram.messenger.g0.L(14.0f)));
                this.T0.draw(canvas3);
            }
            if (this.K != null) {
                canvas3.save();
                canvas3.translate(imageReceiver.x(), imageReceiver.z());
                Path path = this.L;
                if (path == null) {
                    this.L = new Path();
                } else {
                    path.rewind();
                }
                this.L.addCircle(imageReceiver.w() / 2.0f, imageReceiver.v() / 2.0f, imageReceiver.w() / 2.0f, Path.Direction.CW);
                canvas3.clipPath(this.L);
                this.K.setBounds(0, 0, (int) imageReceiver.w(), (int) imageReceiver.v());
                this.K.draw(canvas3);
                canvas3.restore();
            } else if (fjVar.z4()) {
                TLRPC.MessageMedia messageMedia = fjVar.k.media;
                long j3 = messageMedia.user_id;
                e7Var.c = messageMedia.id;
                fi.i7.h(j3, canvas3, imageReceiver, e7Var);
            } else {
                imageReceiver.g(canvas3);
            }
            J(canvas);
            n0();
            c10 = '%';
            if (fjVar.D == 37) {
                bg.t.a(canvas3, org.telegram.ui.ActionBar.n6.S0, imageReceiver.x() + org.telegram.messenger.g0.L(26.0f), imageReceiver.z() + org.telegram.messenger.g0.L(26.0f), org.telegram.messenger.g0.L(52.0f));
            }
            radialProgress22.a.set(imageReceiver.x(), imageReceiver.z(), imageReceiver.w() + imageReceiver.x(), imageReceiver.v() + imageReceiver.z());
            int i23 = fjVar.D;
            if (i23 == 21) {
                u30 u30Var = (u30) mp.u1(this.I).E7.get(fjVar.k.local_id);
                if (u30Var != null) {
                    radialProgress22.p(true, u30Var.X);
                    radialProgress22.setCircleRadius(((int) (imageReceiver.w() * 0.5f)) + 1);
                    radialProgress22.G = org.telegram.messenger.g0.L(24.0f);
                    radialProgress22.g(org.telegram.ui.ActionBar.n6.cf, org.telegram.ui.ActionBar.n6.df, org.telegram.ui.ActionBar.n6.ef, org.telegram.ui.ActionBar.n6.ff);
                    if (u30Var.X == 1.0f) {
                        radialProgress22.setIcon(4, true, true);
                    } else {
                        radialProgress22.setIcon(3, true, true);
                    }
                }
                radialProgress22.draw(canvas3);
                i7 = 22;
            } else {
                i7 = 22;
                if (i23 == 22) {
                    float S = S(fjVar);
                    radialProgress22.p(true, S);
                    radialProgress22.setCircleRadius(org.telegram.messenger.g0.L(26.0f));
                    radialProgress22.G = org.telegram.messenger.g0.L(24.0f);
                    radialProgress22.g(org.telegram.ui.ActionBar.n6.cf, org.telegram.ui.ActionBar.n6.df, org.telegram.ui.ActionBar.n6.ef, org.telegram.ui.ActionBar.n6.ff);
                    if (S == 1.0f) {
                        radialProgress22.setIcon(4, true, true);
                    } else {
                        radialProgress22.setIcon(3, true, true);
                    }
                    radialProgress22.draw(canvas3);
                }
            }
            textPaint = this.t0;
            arrayList = this.q0;
            if (textPaint != null || this.N == null) {
                i11 = i7;
                radialProgress2 = radialProgress22;
            } else {
                canvas3.save();
                canvas3.translate(this.U, this.T);
                if (this.N.getPaint() != this.t0) {
                    v();
                }
                canvas3.save();
                xh.f.d(canvas3, arrayList);
                xh.f.f(canvas3, this.N);
                r0 r0Var3 = this.g1;
                if (r0Var3 == null || r0Var3.h()) {
                    int i24 = i7;
                    StaticLayout staticLayout = this.N;
                    radialProgress2 = radialProgress22;
                    i11 = i24;
                    org.telegram.ui.Components.x5.drawAnimatedEmojis(canvas, staticLayout, this.s0, 0.0f, arrayList, 0.0f, 0.0f, 0.0f, 1.0f, staticLayout == null ? null : P(staticLayout.getPaint().getColor()));
                    canvas3 = canvas;
                } else {
                    i11 = i7;
                    radialProgress2 = radialProgress22;
                }
                canvas3.restore();
                int size2 = arrayList.size();
                int i25 = 0;
                while (i25 < size2) {
                    Object obj = arrayList.get(i25);
                    i25++;
                    xh.f fVar = (xh.f) obj;
                    fVar.h(this.N.getPaint().getColor());
                    fVar.draw(canvas3);
                }
                canvas3.restore();
            }
            if (this.t0 != null && this.Q != null) {
                canvas3.save();
                canvas3.translate(this.V, this.T - this.R);
                if (this.Q.getPaint() != this.t0) {
                    v();
                }
                canvas3.save();
                xh.f.d(canvas3, arrayList);
                xh.f.f(canvas3, this.Q);
                r0Var = this.g1;
                if (r0Var != null || r0Var.h()) {
                    StaticLayout staticLayout2 = this.Q;
                    org.telegram.ui.Components.t5 t5Var = this.s0;
                    StaticLayout staticLayout3 = this.N;
                    org.telegram.ui.Components.x5.drawAnimatedEmojis(canvas, staticLayout2, t5Var, 0.0f, arrayList, 0.0f, 0.0f, 0.0f, 1.0f, staticLayout3 != null ? null : P(staticLayout3.getPaint().getColor()));
                    canvas3 = canvas;
                }
                canvas3.restore();
                size = arrayList.size();
                i16 = 0;
                while (i16 < size) {
                    Object obj2 = arrayList.get(i16);
                    i16++;
                    xh.f fVar2 = (xh.f) obj2;
                    fVar2.h(this.Q.getPaint().getColor());
                    fVar2.draw(canvas3);
                }
                canvas3.restore();
            }
            if (U() && Y(fjVar)) {
                canvas3.save();
                float f25 = (this.W - this.j1) / 2.0f;
                if (fjVar.D != i11) {
                    f25 += org.telegram.messenger.g0.L(8.0f);
                }
                float f26 = f25;
                if (a0()) {
                    RectF rectF = this.N1;
                    f10 = (rectF != null ? rectF.top : org.telegram.messenger.g0.L(4.0f) + this.T + this.P) + (i22 > 0 ? org.telegram.messenger.f3.D(16.0f, 2, i22) : org.telegram.messenger.g0.L(16.0f));
                } else {
                    float f27 = (this.j1 * 0.075f) + this.T + this.P;
                    if (fjVar.D != 21) {
                        i22 = this.i1;
                    }
                    float L4 = f27 + i22 + org.telegram.messenger.g0.L(4.0f);
                    if (fjVar.D == 21) {
                        L4 += org.telegram.messenger.g0.L(16.0f);
                    }
                    f10 = L4;
                    if (fjVar.s4()) {
                        f10 += org.telegram.messenger.g0.L(12.0f);
                    } else if (fjVar.D == 30 && !fjVar.s4()) {
                        f10 -= org.telegram.messenger.g0.L(3.66f);
                    }
                }
                int i26 = fjVar.D;
                if (i26 == 31 || i26 == 37 || i26 == 33) {
                    f10 -= org.telegram.messenger.g0.L(3.66f);
                }
                canvas3.translate(f26, f10);
                if (this.k1 != null) {
                    canvas3.save();
                    canvas3.translate(((this.j1 - org.telegram.messenger.g0.L(16.0f)) - this.k1.getWidth()) / 2.0f, 0.0f);
                    this.k1.draw(canvas3);
                    canvas3.restore();
                    float height = this.k1.getHeight() + f10;
                    if (this.n1 != null) {
                        canvas3.save();
                        canvas3.translate(((this.j1 - org.telegram.messenger.g0.L(16.0f)) - this.n1.getWidth()) / 2.0f, org.telegram.messenger.g0.L(4.0f) + this.k1.getHeight());
                        this.n1.draw(canvas3);
                        canvas3.restore();
                        height += org.telegram.messenger.g0.L(10.0f) + this.n1.getHeight();
                    }
                    L = height + org.telegram.messenger.g0.L(fjVar.D == 25 ? 6.0f : 0.0f);
                } else {
                    L = f10 - org.telegram.messenger.g0.L(4.0f);
                }
                float f28 = L;
                canvas3.restore();
                StaticLayout staticLayout4 = this.k1;
                int i27 = TLObject.FLAG_28;
                if (staticLayout4 == null || (vy0Var2 = this.m1) == null) {
                    i12 = 33;
                    canvas2 = canvas3;
                    f11 = 0.0f;
                } else {
                    float k10 = vy0Var2.k() + org.telegram.messenger.g0.L(12.0f);
                    float A = com.google.android.gms.internal.vision.e2.A(this.j1 - org.telegram.messenger.g0.L(16.0f), k10, 2.0f, f26);
                    float height2 = f10 + this.k1.getHeight() + org.telegram.messenger.g0.L(14.0f);
                    if (this.l1 == null) {
                        this.l1 = new Paint(1);
                    }
                    this.l1.setColor(org.telegram.ui.ActionBar.n6.j1() ? 285212671 : 268435456);
                    RectF rectF2 = org.telegram.messenger.g0.P;
                    rectF2.set(A, height2 - org.telegram.messenger.g0.L(8.0f), k10 + A, org.telegram.messenger.g0.L(8.0f) + height2);
                    canvas3.drawRoundRect(rectF2, org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), this.l1);
                    Canvas canvas4 = canvas3;
                    f11 = 0.0f;
                    i12 = 33;
                    this.m1.c(A + org.telegram.messenger.g0.L(6.0f), height2, 1.0f, -855638017, canvas4);
                    canvas2 = canvas4;
                    f28 += org.telegram.messenger.g0.L(24.0f);
                }
                float L5 = f28 + org.telegram.messenger.g0.L(4.0f);
                if (fjVar.D == 18) {
                    L5 += org.telegram.messenger.g0.L(2.0f);
                }
                float f29 = L5;
                canvas2.save();
                canvas2.translate(f26, f29);
                if (fjVar.D == i11) {
                    RadialProgress2 radialProgress23 = radialProgress2;
                    if ((radialProgress23.c ? radialProgress23.j : radialProgress23.i).b() == 1.0f) {
                        i14 = 4;
                        if (radialProgress23.a() == 4) {
                            if (this.t1 != null) {
                                canvas2.save();
                                canvas2.translate((this.j1 - ((StaticLayout) this.t1.f).getWidth()) / 2.0f, f11);
                                this.t1.b = ((this.j1 - ((StaticLayout) r3.f).getWidth()) / 2.0f) + f26;
                                this.t1.e = f29;
                                int color = textPaint3.getColor();
                                s0 s0Var = this.t1;
                                f16 = f26;
                                f14 = f11;
                                f15 = 8.0f;
                                f12 = 0.2f;
                                xh.f.g(this, false, color, 0, (AtomicReference) s0Var.g, 1, (StaticLayout) s0Var.f, s0Var.c, canvas, false);
                                s0 s0Var2 = this.t1;
                                org.telegram.ui.Components.x5.drawAnimatedEmojis(canvas, (StaticLayout) s0Var2.f, (org.telegram.ui.Components.t5) s0Var2.h, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f, P(textPaint3.getColor()));
                                canvas3 = canvas;
                                canvas3.restore();
                                u0Var = this;
                                f13 = f16;
                            } else {
                                f12 = 0.2f;
                                f14 = f11;
                                f15 = 8.0f;
                                u0Var = this;
                                canvas3 = canvas2;
                                f13 = f26;
                            }
                        }
                    } else {
                        i14 = 4;
                    }
                    f12 = 0.2f;
                    f16 = f26;
                    f14 = f11;
                    f15 = 8.0f;
                    int i28 = i12;
                    canvas3 = canvas2;
                    if (this.B1 == null) {
                        TextPaint textPaint6 = new TextPaint();
                        this.A1 = textPaint6;
                        textPaint6.setTextSize(org.telegram.messenger.g0.L(13.0f));
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(gd.L0(2131754556));
                        int indexOf = spannableStringBuilder.toString().indexOf("...");
                        if (indexOf < 0) {
                            indexOf = spannableStringBuilder.toString().indexOf("…");
                            i15 = 1;
                        } else {
                            i15 = 3;
                        }
                        if (indexOf >= 0) {
                            SpannableString spannableString = new SpannableString("…");
                            fi.l9 l9Var = new fi.l9();
                            l9Var.r = true;
                            l9Var.b(this);
                            spannableString.setSpan(l9Var, 0, spannableString.length(), i28);
                            spannableStringBuilder.replace(indexOf, indexOf + i15, (CharSequence) spannableString);
                        }
                        TextPaint textPaint7 = this.A1;
                        s0 s0Var3 = this.t1;
                        this.B1 = new StaticLayout(spannableStringBuilder, textPaint7, s0Var3 == null ? 1 : s0Var3.d, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                    }
                    float S2 = S(fjVar);
                    if (this.D1 == null || this.C1 != S2) {
                        this.C1 = S2;
                        String n10 = a8.p0.n((int) (S2 * 100.0f), "%", new StringBuilder());
                        s0 s0Var4 = this.t1;
                        this.D1 = new StaticLayout(n10, textPaint3, s0Var4 == null ? 1 : s0Var4.d, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                    }
                    this.A1.setColor(textPaint3.getColor());
                    if (radialProgress23.a() == i14) {
                        float b10 = (radialProgress23.c ? radialProgress23.j : radialProgress23.i).b();
                        int color2 = textPaint3.getColor();
                        float f30 = 1.0f - b10;
                        this.A1.setAlpha((int) (Color.alpha(color2) * f30));
                        textPaint3.setAlpha((int) (Color.alpha(color2) * b10));
                        textPaint3.linkColor = textPaint3.getColor();
                        if (this.t1 != null) {
                            float f31 = (b10 * 0.2f) + 0.8f;
                            canvas3.save();
                            canvas3.scale(f31, f31, this.j1 / 2.0f, ((StaticLayout) this.t1.f).getHeight() / 2.0f);
                            canvas3.translate((this.j1 - ((StaticLayout) this.t1.f).getWidth()) / 2.0f, f14);
                            this.t1.b = ((this.j1 - ((StaticLayout) r1.f).getWidth()) / 2.0f) + f16;
                            this.t1.e = f29;
                            int color3 = textPaint3.getColor();
                            s0 s0Var5 = this.t1;
                            xh.f.g(this, false, color3, 0, (AtomicReference) s0Var5.g, 1, (StaticLayout) s0Var5.f, s0Var5.c, canvas3, false);
                            s0 s0Var6 = this.t1;
                            u0Var2 = this;
                            org.telegram.ui.Components.x5.drawAnimatedEmojis(canvas, (StaticLayout) s0Var6.f, (org.telegram.ui.Components.t5) s0Var6.h, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f, P(textPaint3.getColor()));
                            canvas3 = canvas;
                            canvas3.restore();
                        } else {
                            u0Var2 = this;
                        }
                        textPaint3.setAlpha((int) (Color.alpha(color2) * f30));
                        textPaint3.linkColor = textPaint3.getColor();
                        float f32 = (f30 * 0.2f) + 0.8f;
                        canvas3.save();
                        canvas3.scale(f32, f32, u0Var2.j1 / 2.0f, u0Var2.B1.getHeight() / 2.0f);
                        canvas3.translate((u0Var2.j1 - u0Var2.B1.getWidth()) / 2.0f, f14);
                        xh.f.f(canvas3, u0Var2.B1);
                        canvas3.restore();
                        canvas3.save();
                        canvas3.translate(f14, org.telegram.messenger.g0.L(4.0f) + u0Var2.B1.getHeight());
                        canvas3.scale(f32, f32, u0Var2.j1 / 2.0f, u0Var2.D1.getHeight() / 2.0f);
                        canvas3.translate((u0Var2.j1 - u0Var2.D1.getWidth()) / 2.0f, f14);
                        xh.f.f(canvas3, u0Var2.D1);
                        canvas3.restore();
                        textPaint3.setColor(color2);
                        textPaint3.linkColor = color2;
                    } else {
                        u0Var2 = this;
                        canvas3.save();
                        canvas3.translate((u0Var2.j1 - u0Var2.B1.getWidth()) / 2.0f, f14);
                        u0Var2.B1.draw(canvas3);
                        canvas3.restore();
                        canvas3.save();
                        canvas3.translate((u0Var2.j1 - u0Var2.D1.getWidth()) / 2.0f, org.telegram.messenger.g0.L(4.0f) + u0Var2.B1.getHeight());
                        xh.f.f(canvas3, u0Var2.D1);
                        canvas3.restore();
                    }
                    u0Var = u0Var2;
                    f13 = f16;
                } else {
                    f12 = 0.2f;
                    f13 = f26;
                    f14 = f11;
                    f15 = 8.0f;
                    canvas3 = canvas2;
                    s0 s0Var7 = this.t1;
                    if (s0Var7 != null) {
                        float height3 = ((StaticLayout) s0Var7.f).getHeight();
                        if (d2 < 1.0f) {
                            height3 = org.telegram.messenger.g0.T1(this.q1, height3, d2);
                            RectF rectF3 = org.telegram.messenger.g0.P;
                            rectF3.set(f14, -org.telegram.messenger.g0.L(20.0f), getWidth(), height3);
                            canvas3.saveLayerAlpha(rectF3, ks.e4, 31);
                        } else {
                            canvas3.save();
                        }
                        canvas3.translate(((this.j1 - org.telegram.messenger.g0.L(16.0f)) - ((StaticLayout) this.t1.f).getWidth()) / 2.0f, f14);
                        this.t1.b = (((this.j1 - org.telegram.messenger.g0.L(16.0f)) - ((StaticLayout) this.t1.f).getWidth()) / 2.0f) + f13;
                        s0 s0Var8 = this.t1;
                        s0Var8.e = f29;
                        int color4 = s0Var8.a.getColor();
                        s0 s0Var9 = this.t1;
                        float f33 = height3;
                        xh.f.g(this, false, color4, 0, (AtomicReference) s0Var9.g, 1, (StaticLayout) s0Var9.f, s0Var9.c, canvas3, false);
                        s0 s0Var10 = this.t1;
                        StaticLayout staticLayout5 = (StaticLayout) s0Var10.f;
                        org.telegram.ui.Components.t5 t5Var2 = (org.telegram.ui.Components.t5) s0Var10.h;
                        ColorFilter P = P(textPaint3.getColor());
                        u0Var = this;
                        org.telegram.ui.Components.x5.drawAnimatedEmojis(canvas, staticLayout5, t5Var2, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f, P);
                        canvas3 = canvas;
                        if (d2 < 1.0f && u0Var.x1 != null) {
                            canvas3.save();
                            if (u0Var.s1 == null) {
                                u0Var.s1 = new h6.m(29);
                            }
                            canvas3.translate((-((u0Var.j1 - org.telegram.messenger.g0.L(16.0f)) - ((StaticLayout) u0Var.t1.f).getWidth())) / 2.0f, f14);
                            RectF rectF4 = org.telegram.messenger.g0.P;
                            rectF4.set((u0Var.u1 - u0Var.x1.g()) + org.telegram.messenger.g0.L(8.0f), (u0Var.v1 - u0Var.w1) - org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f) + u0Var.u1, u0Var.v1);
                            float f34 = 1.0f - d2;
                            u0Var.s1.k(canvas3, rectF4, f34);
                            rectF4.set((u0Var.u1 - u0Var.x1.g()) - org.telegram.messenger.g0.L(16.0f), (u0Var.v1 - u0Var.w1) - org.telegram.messenger.g0.L(6.0f), (u0Var.u1 - u0Var.x1.g()) + org.telegram.messenger.g0.L(8.0f), u0Var.v1);
                            u0Var.s1.n(canvas3, rectF4, 2, f34);
                            rectF4.set(f14, f33 - org.telegram.messenger.g0.L(12.0f), u0Var.getWidth(), f33);
                            u0Var.s1.n(canvas3, rectF4, 3, (1.0f - f34) * f34 * 4.0f);
                            canvas3.restore();
                        }
                        canvas3.restore();
                        if (d2 < 1.0f && (vy0Var = u0Var.x1) != null) {
                            vy0Var.c((u0Var.u1 - vy0Var.g()) + org.telegram.messenger.g0.L(5.0f), (u0Var.v1 - (u0Var.w1 / 2.0f)) - org.telegram.messenger.g0.L(1.0f), 1.0f - d2, u0Var.t1.a.getColor(), canvas3);
                        }
                    } else {
                        u0Var = this;
                    }
                }
                canvas3.restore();
                if (u0Var.k1 == null) {
                    org.telegram.messenger.g0.L(f15);
                }
                s0 s0Var11 = u0Var.t1;
                if (s0Var11 != null) {
                    ((StaticLayout) s0Var11.f).getHeight();
                }
                StaticLayout staticLayout6 = u0Var.y1;
                if (staticLayout6 != null) {
                    staticLayout6.getHeight();
                }
                u0Var.getHeight();
                org.telegram.messenger.g0.L(f15);
                org.telegram.ui.ActionBar.i6 i6Var = u0Var.h1;
                if (i6Var != null) {
                    i6Var.e(u0Var.v0, u0Var.u0 + org.telegram.messenger.g0.L(4.0f), u0Var.getMeasuredWidth(), u0Var.w0);
                } else {
                    org.telegram.ui.ActionBar.n6.r(u0Var.v0, u0Var.u0 + org.telegram.messenger.g0.L(4.0f), u0Var.getMeasuredWidth(), u0Var.w0);
                }
                float a10 = u0Var.n.a(0.02f);
                canvas3.save();
                RectF rectF5 = u0Var.p0;
                canvas3.scale(a10, a10, rectF5.centerX(), rectF5.centerY());
                if (u0Var.y1 != null) {
                    canvas3.drawRoundRect(rectF5, org.telegram.messenger.g0.L(15.0f), org.telegram.messenger.g0.L(15.0f), u0Var.R("paintChatActionBackgroundSelected"));
                    if (u0Var.T()) {
                        canvas3.drawRoundRect(rectF5, org.telegram.messenger.g0.L(15.0f), org.telegram.messenger.g0.L(15.0f), u0Var.R("paintChatActionBackgroundDarken"));
                    }
                    float f35 = u0Var.k2;
                    Paint paint = u0Var.l2;
                    if (f35 > f14) {
                        canvas3.drawRoundRect(rectF5, org.telegram.messenger.g0.L(15.0f), org.telegram.messenger.g0.L(15.0f), paint);
                    }
                    if (u0Var.getMessageObject().D == 31 || u0Var.getMessageObject().D == 37 || u0Var.getMessageObject().D == 33) {
                        boolean d10 = i6Var != null ? i6Var.d() : org.telegram.ui.ActionBar.n6.j1();
                        int color5 = paint.getColor();
                        if (d10) {
                            i27 = 620756991;
                        }
                        paint.setColor(i27);
                        canvas3.drawRoundRect(rectF5, org.telegram.messenger.g0.L(15.0f), org.telegram.messenger.g0.L(15.0f), paint);
                        paint.setColor(color5);
                    }
                    TLRPC.TL_messageActionStarGiftOnchainOffer tL_messageActionStarGiftOnchainOffer = u0Var.c2;
                    if ((tL_messageActionStarGiftOnchainOffer == null || tL_messageActionStarGiftOnchainOffer.buyer) && (u0Var.getMessageObject().D == 31 || u0Var.getMessageObject().D == 37 || u0Var.getMessageObject().D == 33 || u0Var.getMessageObject().D == 21 || u0Var.getMessageObject().D == 22 || u0Var.getMessageObject().D == 24)) {
                        u0Var.invalidate();
                    } else {
                        Path path2 = u0Var.V1;
                        path2.rewind();
                        path2.addRoundRect(rectF5, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), Path.Direction.CW);
                        canvas3.save();
                        canvas3.clipPath(path2);
                        ug.t1 t1Var = u0Var.W1;
                        t1Var.d(canvas3);
                        if (!t1Var.g) {
                            u0Var.invalidate();
                        }
                        canvas3.restore();
                    }
                }
                boolean z10 = fjVar.q;
                if (z10) {
                    float f36 = u0Var.d0;
                    if (f36 != 1.0f) {
                        u0Var.d0 = f36 + 0.10666667f;
                        i13 = Utilities.i(u0Var.d0, 1.0f, f14);
                        u0Var.d0 = i13;
                        if (i13 != f14) {
                            if (u0Var.c0 == null) {
                                u0Var.c0 = new RadialProgressView(u0Var.getContext());
                            }
                            int L6 = org.telegram.messenger.g0.L(16.0f);
                            canvas3.save();
                            float f37 = u0Var.d0;
                            canvas3.scale(f37, f37, rectF5.centerX(), rectF5.centerY());
                            u0Var.c0.setSize(L6);
                            u0Var.c0.setProgressColor(org.telegram.ui.ActionBar.n6.v0(org.telegram.ui.ActionBar.n6.Zc));
                            u0Var.c0.a(canvas3, rectF5.centerX(), rectF5.centerY());
                            canvas3.restore();
                        }
                        if (u0Var.d0 != 1.0f && u0Var.y1 != null) {
                            canvas3.save();
                            float f38 = 1.0f - u0Var.d0;
                            canvas3.scale(f38, f38, rectF5.centerX(), rectF5.centerY());
                            canvas3.translate(f13, rectF5.top + org.telegram.messenger.g0.L(7.0f));
                            canvas3.translate(((u0Var.j1 - org.telegram.messenger.g0.L(16.0f)) - u0Var.y1.getWidth()) / 2.0f, f14);
                            u0Var.y1.draw(canvas3);
                            canvas3.restore();
                        }
                        if (fjVar.r) {
                            o80 o80Var = u0Var.r;
                            if (o80Var != null) {
                                o80Var.e(rectF5);
                                u0Var.r.k(16.0f);
                                u0Var.r.a();
                                u0Var.r.draw(canvas3);
                                if (u0Var.r.c()) {
                                    u0Var.r.b = -1L;
                                }
                            }
                        } else {
                            if (u0Var.r == null) {
                                o80 o80Var2 = new o80(i6Var);
                                u0Var.r = o80Var2;
                                o80Var2.h();
                                o80 o80Var3 = u0Var.r;
                                o80Var3.D = true;
                                float f39 = f12;
                                o80Var3.g(org.telegram.ui.ActionBar.n6.r1(0.08f, -1), org.telegram.ui.ActionBar.n6.r1(f39, -1), org.telegram.ui.ActionBar.n6.r1(f39, -1), org.telegram.ui.ActionBar.n6.r1(0.7f, -1));
                                u0Var.r.x.setStrokeWidth(org.telegram.messenger.g0.L(1.0f));
                            }
                            o80 o80Var4 = u0Var.r;
                            o80Var4.c = -1L;
                            o80Var4.e(rectF5);
                            u0Var.r.k(16.0f);
                            u0Var.r.draw(canvas3);
                        }
                        canvas3.restore();
                        if (u0Var.N1 != null && u0Var.S1 != null && u0Var.T1 != null) {
                            R = u0Var.R("paintChatActionBackground");
                            Paint R2 = u0Var.R("paintChatActionBackgroundDarken");
                            float L7 = (u0Var.N1.right - org.telegram.messenger.g0.L(65.0f)) + org.telegram.messenger.g0.L(2.0f);
                            float L8 = u0Var.N1.top - org.telegram.messenger.g0.L(2.0f);
                            if (i6Var == null) {
                                i6Var.e(u0Var.v0 + L7, u0Var.u0 + org.telegram.messenger.g0.L(4.0f) + L8, u0Var.getMeasuredWidth(), u0Var.w0);
                            } else {
                                org.telegram.ui.ActionBar.n6.r(u0Var.v0 + L7, u0Var.u0 + org.telegram.messenger.g0.L(4.0f) + L8, u0Var.getMeasuredWidth(), u0Var.w0);
                            }
                            canvas3.save();
                            canvas3.translate(L7, L8);
                            ColorFilter colorFilter = R.getColorFilter();
                            PathEffect pathEffect = R.getPathEffect();
                            d = i6Var == null ? i6Var.d() : org.telegram.ui.ActionBar.n6.j1();
                            if (u0Var.Q1 != null || u0Var.P1 != d) {
                                colorMatrix = new ColorMatrix();
                                if ((R.getColorFilter() instanceof ColorMatrixColorFilter) && Build.VERSION.SDK_INT >= 26) {
                                    ((ColorMatrixColorFilter) R.getColorFilter()).getColorMatrix(colorMatrix);
                                }
                                org.telegram.messenger.g0.h(colorMatrix, !d ? 0.1f : -0.08f);
                                org.telegram.messenger.g0.i(colorMatrix, d ? 0.15f : 0.1f);
                                u0Var.Q1 = new ColorMatrixColorFilter(colorMatrix);
                                u0Var.P1 = d;
                            }
                            R.setColorFilter(u0Var.Q1);
                            R.setPathEffect(u0Var.R1);
                            canvas3.drawPath(u0Var.S1, R);
                            R.setColorFilter(colorFilter);
                            R.setPathEffect(pathEffect);
                            if (u0Var.T()) {
                                PathEffect pathEffect2 = R2.getPathEffect();
                                R2.setPathEffect(u0Var.R1);
                                canvas3.drawPath(u0Var.S1, R2);
                                R2.setPathEffect(pathEffect2);
                            }
                            canvas3.rotate(45.0f, org.telegram.messenger.g0.L(40.43f), org.telegram.messenger.g0.L(24.56f));
                            u0Var.T1.c(org.telegram.messenger.g0.L(40.43f) - (u0Var.T1.g() / 2.0f), org.telegram.messenger.g0.L(26.0f), 1.0f, -1, canvas3);
                            canvas3.restore();
                        }
                    }
                }
                if (!z10) {
                    float f40 = u0Var.d0;
                    if (f40 != f14) {
                        u0Var.d0 = f40 - 0.10666667f;
                    }
                }
                i13 = Utilities.i(u0Var.d0, 1.0f, f14);
                u0Var.d0 = i13;
                if (i13 != f14) {
                }
                if (u0Var.d0 != 1.0f) {
                    canvas3.save();
                    float f382 = 1.0f - u0Var.d0;
                    canvas3.scale(f382, f382, rectF5.centerX(), rectF5.centerY());
                    canvas3.translate(f13, rectF5.top + org.telegram.messenger.g0.L(7.0f));
                    canvas3.translate(((u0Var.j1 - org.telegram.messenger.g0.L(16.0f)) - u0Var.y1.getWidth()) / 2.0f, f14);
                    u0Var.y1.draw(canvas3);
                    canvas3.restore();
                }
                if (fjVar.r) {
                }
                canvas3.restore();
                if (u0Var.N1 != null) {
                    R = u0Var.R("paintChatActionBackground");
                    Paint R22 = u0Var.R("paintChatActionBackgroundDarken");
                    float L72 = (u0Var.N1.right - org.telegram.messenger.g0.L(65.0f)) + org.telegram.messenger.g0.L(2.0f);
                    float L82 = u0Var.N1.top - org.telegram.messenger.g0.L(2.0f);
                    if (i6Var == null) {
                    }
                    canvas3.save();
                    canvas3.translate(L72, L82);
                    ColorFilter colorFilter2 = R.getColorFilter();
                    PathEffect pathEffect3 = R.getPathEffect();
                    if (i6Var == null) {
                    }
                    if (u0Var.Q1 != null) {
                    }
                    colorMatrix = new ColorMatrix();
                    if (R.getColorFilter() instanceof ColorMatrixColorFilter) {
                        ((ColorMatrixColorFilter) R.getColorFilter()).getColorMatrix(colorMatrix);
                    }
                    org.telegram.messenger.g0.h(colorMatrix, !d ? 0.1f : -0.08f);
                    org.telegram.messenger.g0.i(colorMatrix, d ? 0.15f : 0.1f);
                    u0Var.Q1 = new ColorMatrixColorFilter(colorMatrix);
                    u0Var.P1 = d;
                    R.setColorFilter(u0Var.Q1);
                    R.setPathEffect(u0Var.R1);
                    canvas3.drawPath(u0Var.S1, R);
                    R.setColorFilter(colorFilter2);
                    R.setPathEffect(pathEffect3);
                    if (u0Var.T()) {
                    }
                    canvas3.rotate(45.0f, org.telegram.messenger.g0.L(40.43f), org.telegram.messenger.g0.L(24.56f));
                    u0Var.T1.c(org.telegram.messenger.g0.L(40.43f) - (u0Var.T1.g() / 2.0f), org.telegram.messenger.g0.L(26.0f), 1.0f, -1, canvas3);
                    canvas3.restore();
                }
            } else {
                u0Var = this;
            }
            I(canvas);
            u0Var.L(canvas3, false);
            u0Var.A2.a();
            canvas3.restore();
        }
        i7 = 22;
        c10 = '%';
        textPaint = this.t0;
        arrayList = this.q0;
        if (textPaint != null) {
        }
        i11 = i7;
        radialProgress2 = radialProgress22;
        if (this.t0 != null) {
            canvas3.save();
            canvas3.translate(this.V, this.T - this.R);
            if (this.Q.getPaint() != this.t0) {
            }
            canvas3.save();
            xh.f.d(canvas3, arrayList);
            xh.f.f(canvas3, this.Q);
            r0Var = this.g1;
            if (r0Var != null) {
            }
            StaticLayout staticLayout22 = this.Q;
            org.telegram.ui.Components.t5 t5Var3 = this.s0;
            StaticLayout staticLayout32 = this.N;
            org.telegram.ui.Components.x5.drawAnimatedEmojis(canvas, staticLayout22, t5Var3, 0.0f, arrayList, 0.0f, 0.0f, 0.0f, 1.0f, staticLayout32 != null ? null : P(staticLayout32.getPaint().getColor()));
            canvas3 = canvas;
            canvas3.restore();
            size = arrayList.size();
            i16 = 0;
            while (i16 < size) {
            }
            canvas3.restore();
        }
        if (U()) {
        }
        u0Var = this;
        I(canvas);
        u0Var.L(canvas3, false);
        u0Var.A2.a();
        canvas3.restore();
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        fj fjVar = this.Q0;
        if (TextUtils.isEmpty(this.S0) && fjVar == null) {
            return;
        }
        if (this.v2 == null) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(!TextUtils.isEmpty(this.S0) ? this.S0 : fjVar.v);
            for (CharacterStyle characterStyle : (CharacterStyle[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), ClickableSpan.class)) {
                int spanStart = spannableStringBuilder.getSpanStart(characterStyle);
                int spanEnd = spannableStringBuilder.getSpanEnd(characterStyle);
                spannableStringBuilder.removeSpan(characterStyle);
                spannableStringBuilder.setSpan(new h(1, this, characterStyle), spanStart, spanEnd, 33);
            }
            this.v2 = spannableStringBuilder;
        }
        if (Build.VERSION.SDK_INT < 24) {
            accessibilityNodeInfo.setContentDescription(this.v2.toString());
        } else {
            accessibilityNodeInfo.setText(this.v2);
        }
        accessibilityNodeInfo.setEnabled(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        RectF rectF = this.p0;
        this.U1.layout((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        org.telegram.ui.Wallet.m4 m4Var = this.J0;
        org.telegram.ui.Wallet.l4 l4Var = m4Var == null ? null : m4Var.m;
        if (l4Var != null) {
            l4Var.layout(0, 0, org.telegram.messenger.g0.L(42.0f), org.telegram.messenger.g0.L(42.0f));
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
    /* JADX WARN: Removed duplicated region for block: B:153:0x0517  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0554  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0565  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x03de  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0581  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0597  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x05a1  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0201  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i7, int i10) {
        float f10;
        float f11;
        int i11;
        boolean U;
        ch.q0 q0Var;
        float f12;
        boolean z10;
        float f13;
        float f14;
        float L;
        float L2;
        StaticLayout staticLayout;
        float f15;
        TLRPC.Message message;
        int measuredWidth;
        int i12;
        float f16;
        int L3;
        int i13;
        int L4;
        int i14;
        org.telegram.ui.Wallet.m4 m4Var = this.J0;
        org.telegram.ui.Wallet.l4 l4Var = m4Var == null ? null : m4Var.m;
        if (l4Var != null) {
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(42.0f), TLObject.FLAG_30);
            l4Var.measure(makeMeasureSpec, makeMeasureSpec);
        }
        fj fjVar = this.Q0;
        if (fjVar == null && this.S0 == null) {
            setMeasuredDimension(View.MeasureSpec.getSize(i7), org.telegram.messenger.g0.L(14.0f) + this.m0 + this.P);
            return;
        }
        if (Y(fjVar)) {
            this.j1 = n10.D(64.0f, (org.telegram.messenger.g0.q.y - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - org.telegram.messenger.g0.m, (int) (org.telegram.messenger.g0.Q1() ? org.telegram.messenger.g0.Q0() * 0.6f : (org.telegram.messenger.g0.q.x * 0.62f) - org.telegram.messenger.g0.L(34.0f)));
            if ((!org.telegram.messenger.g0.Q1() && ((i14 = fjVar.D) == 18 || i14 == 30 || Z())) || fjVar.D == 35) {
                this.j1 = (int) (this.j1 * 1.2f);
            }
            this.i1 = this.j1 - org.telegram.messenger.g0.L(106.0f);
            if (fjVar.D == 31) {
                this.j1 = Math.min(this.j1, org.telegram.messenger.g0.L(192.0f));
                this.i1 = org.telegram.messenger.g0.L(78.0f);
            }
            if (fjVar.D == 33) {
                this.j1 = Math.min(this.j1, org.telegram.messenger.g0.L(220.0f));
                this.i1 = org.telegram.messenger.g0.L(78.0f);
            }
            int i15 = fjVar.D;
            ImageReceiver imageReceiver = this.J;
            if (i15 == 37) {
                this.i1 = org.telegram.messenger.g0.L(52.0f);
                imageReceiver.J0(org.telegram.messenger.g0.L(14.0f));
            } else if (a0()) {
                imageReceiver.J0(this.i1 / 2);
            } else {
                imageReceiver.J0(0);
            }
        }
        int max = Math.max(org.telegram.messenger.g0.L(30.0f), View.MeasureSpec.getSize(i7));
        if (this.W != max) {
            this.D0 = true;
            this.W = max;
            v();
        }
        if (fjVar != null) {
            f10 = 30.0f;
            if (fjVar.D == 11) {
                i13 = org.telegram.messenger.g0.u;
                L4 = org.telegram.messenger.g0.L(10.0f);
            } else if (Y(fjVar)) {
                i13 = this.j1;
                L4 = org.telegram.messenger.g0.L(12.0f);
            } else if (W()) {
                f11 = 140.0f;
                i11 = (this.J0.q0 == null ? org.telegram.messenger.g0.L(140.0f) : ((int) Math.ceil(r3.q0.i())) + org.telegram.messenger.g0.L(150.0f)) + org.telegram.messenger.g0.L(8.0f);
                U = U();
                q0Var = this.F0;
                if (U) {
                    r9 = org.telegram.messenger.f3.C(8.0f, this.I0.P, this.I0.p ? 0 : org.telegram.messenger.g0.L(16.0f) + this.T + this.P);
                    if (!q0Var.p) {
                        L3 = org.telegram.messenger.g0.L(8.0f) + q0Var.m;
                        q0Var.n = L3;
                        r9 += L3;
                    }
                    f14 = 24.0f;
                } else {
                    tw0 tw0Var = this.P0;
                    if (tw0Var != null) {
                        r9 = org.telegram.messenger.g0.L(12.0f) + org.telegram.messenger.g0.L(f11) + ((int) tw0Var.f.i()) + (tw0Var.i ? org.telegram.messenger.g0.L(40.0f) : 0);
                        if (!q0Var.p) {
                            L3 = org.telegram.messenger.g0.L(8.0f) + q0Var.m;
                            q0Var.n = L3;
                            r9 += L3;
                        }
                    } else if (Y(fjVar)) {
                        if (fjVar != null) {
                            f12 = 12.0f;
                            if (fjVar.D == 25) {
                                z10 = true;
                                int Q = Q(fjVar);
                                if (a0()) {
                                    f13 = 8.0f;
                                    f14 = 24.0f;
                                    L = (this.t1 == null ? 0 : org.telegram.messenger.g0.L(4.0f) + ((StaticLayout) r4.f).getHeight()) + (this.j1 * 0.075f) + this.T + this.P + Q + org.telegram.messenger.g0.L(4.0f);
                                } else {
                                    f14 = 24.0f;
                                    f13 = 8.0f;
                                    int L5 = org.telegram.messenger.g0.L(4.0f) + this.T + this.P + (Q > 0 ? org.telegram.messenger.f3.D(16.0f, 2, Q) : org.telegram.messenger.g0.L(16.0f));
                                    s0 s0Var = this.t1;
                                    L = L5 + (s0Var == null ? 0 : org.telegram.messenger.g0.L(4.0f) + ((StaticLayout) s0Var.f).getHeight());
                                }
                                this.L1 = 0;
                                if (this.k1 == null) {
                                    float height = L + r15.getHeight();
                                    if (this.k1.getLineCount() > 1) {
                                        this.L1 = (this.k1.getHeight() - this.k1.getLineTop(1)) + this.L1;
                                    }
                                    L2 = height + org.telegram.messenger.g0.L(z10 ? 6.0f : 0.0f);
                                    if (this.n1 != null) {
                                        L2 += org.telegram.messenger.g0.L(9.0f) + r5.getHeight();
                                    }
                                    if (this.m1 != null) {
                                        L2 += org.telegram.messenger.g0.L(f14);
                                    }
                                } else {
                                    L2 = L - org.telegram.messenger.g0.L(f12);
                                    this.L1 -= org.telegram.messenger.g0.L(f10);
                                }
                                s0 s0Var2 = this.t1;
                                int height2 = s0Var2 != null ? 0 : ((StaticLayout) s0Var2.f).getHeight();
                                if (this.t1 != null) {
                                    this.L1 = 0;
                                } else if (this.n1 != null) {
                                    this.L1 = org.telegram.messenger.f3.C(10.0f, height2, this.L1);
                                } else {
                                    fj fjVar2 = this.Q0;
                                    if (fjVar2.D == 18 || fjVar2.s4()) {
                                        this.L1 = c0.i(this.y1 == null ? 0.0f : 10.0f, height2, this.L1);
                                    } else if (this.Q0.D == 30) {
                                        this.L1 = c0.i(20.0f, height2, this.L1);
                                    } else if (this.p1) {
                                        this.L1 += height2;
                                    } else if (((StaticLayout) this.t1.f).getLineCount() > 2) {
                                        this.L1 = ((((StaticLayout) this.t1.f).getLineCount() * (((StaticLayout) this.t1.f).getLineBottom(0) - ((StaticLayout) this.t1.f).getLineTop(0))) - 2) + this.L1;
                                    }
                                }
                                if (this.m1 != null) {
                                    this.L1 = org.telegram.messenger.g0.L(f14) + this.L1;
                                }
                                int L6 = this.L1 - org.telegram.messenger.g0.L(z10 ? 14.0f : 0.0f);
                                this.L1 = L6;
                                i11 += L6;
                                int L7 = org.telegram.messenger.g0.L(14.0f) + this.P + i11;
                                staticLayout = this.y1;
                                RectF rectF = this.p0;
                                if (staticLayout == null) {
                                    float A = com.google.android.gms.internal.vision.e2.A((L7 - L2) - staticLayout.getHeight(), org.telegram.messenger.g0.L(f13), 2.0f, L2);
                                    if (this.Q0.s4()) {
                                        A += org.telegram.messenger.g0.L(4.0f);
                                    }
                                    float f17 = (this.W - this.E1) / 2.0f;
                                    f15 = 18.0f;
                                    rectF.set(f17 - org.telegram.messenger.g0.L(18.0f), A - org.telegram.messenger.g0.L(f13), f17 + this.E1 + org.telegram.messenger.g0.L(18.0f), A + (this.y1 != null ? r12.getHeight() : 0) + org.telegram.messenger.g0.L(f13));
                                } else {
                                    f15 = 18.0f;
                                    i11 -= org.telegram.messenger.g0.L(40.0f);
                                    this.L1 -= org.telegram.messenger.g0.L(40.0f);
                                    fj fjVar3 = this.Q0;
                                    if (fjVar3 != null && (message = fjVar3.k) != null && (message.action instanceof TLRPC.TL_messageActionStarGift)) {
                                        i11 -= org.telegram.messenger.g0.L(f13);
                                        this.L1 -= org.telegram.messenger.g0.L(f13);
                                    }
                                }
                                measuredWidth = getMeasuredWidth() << (getMeasuredHeight() + 16);
                                ug.t1 t1Var = this.W1;
                                t1Var.a.set(rectF);
                                t1Var.b.set(rectF);
                                if (this.X1 != measuredWidth) {
                                    this.X1 = measuredWidth;
                                    t1Var.f();
                                }
                                if (a0()) {
                                    int L8 = org.telegram.messenger.g0.L(4.0f) + this.T + this.P;
                                    this.f = 0;
                                    int D = Q > 0 ? org.telegram.messenger.f3.D(16.0f, 2, Q) : org.telegram.messenger.g0.L(16.0f);
                                    this.f = D;
                                    StaticLayout staticLayout2 = this.n1;
                                    if (staticLayout2 != null) {
                                        this.f = org.telegram.messenger.f3.C(10.0f, staticLayout2.getHeight(), D);
                                    }
                                    if (this.m1 != null) {
                                        this.f = org.telegram.messenger.g0.L(15.0f) + this.f;
                                    }
                                    int i16 = this.f + height2;
                                    this.f = i16;
                                    float f18 = (this.W - this.E1) / 2.0f;
                                    if (this.y1 != null) {
                                        this.h = org.telegram.messenger.g0.L(7.0f) + i16 + L8;
                                        rectF.set(f18 - org.telegram.messenger.g0.L(f15), this.h, f18 + this.E1 + org.telegram.messenger.g0.L(f15), org.telegram.messenger.f3.D(f13, 2, this.y1.getHeight() + this.h));
                                        this.f = (int) (rectF.height() + org.telegram.messenger.g0.L(4.0f) + this.f);
                                    } else if (!Z() && (i12 = fjVar.D) != 34 && i12 != 33 && i12 != 35) {
                                        f16 = 15.0f;
                                        rectF.set(f18 - org.telegram.messenger.g0.L(f15), this.h, f18 + this.E1 + org.telegram.messenger.g0.L(f15), org.telegram.messenger.f3.D(8.0f, 2, org.telegram.messenger.g0.L(17.0f) + this.h));
                                        this.f = org.telegram.messenger.g0.L(17.0f) + this.f;
                                        int L9 = org.telegram.messenger.g0.L(f16) + this.f;
                                        this.f = L9;
                                        int L10 = org.telegram.messenger.g0.L(6.0f) + L8 + L9;
                                        if (this.g2 != null) {
                                            int L11 = org.telegram.messenger.g0.L(4.0f) + L10;
                                            this.i2 = L11;
                                            int i17 = 0;
                                            while (r9 < this.g2.size()) {
                                                if (r9 > 0) {
                                                    i17 += org.telegram.messenger.g0.L(6.0f);
                                                }
                                                i17 += (org.telegram.messenger.g0.L(3.0f) * 2) + ((StaticLayout) this.g2.get(r9)).getHeight();
                                                r9++;
                                            }
                                            L10 = org.telegram.messenger.f3.C(2.0f, i17, L11);
                                            this.j2 = true;
                                        }
                                        if (!q0Var.p) {
                                            int L12 = org.telegram.messenger.g0.L(8.0f) + q0Var.m;
                                            q0Var.n = L12;
                                            L10 += L12;
                                        }
                                        r9 = L10;
                                        if (this.Z1 != null) {
                                            r9 += org.telegram.messenger.g0.L(44.0f);
                                        }
                                    }
                                    f16 = 15.0f;
                                    int L92 = org.telegram.messenger.g0.L(f16) + this.f;
                                    this.f = L92;
                                    int L102 = org.telegram.messenger.g0.L(6.0f) + L8 + L92;
                                    if (this.g2 != null) {
                                    }
                                    if (!q0Var.p) {
                                    }
                                    r9 = L102;
                                    if (this.Z1 != null) {
                                    }
                                }
                                rectF.inset(org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(1.0f));
                            }
                        } else {
                            f12 = 12.0f;
                        }
                        z10 = false;
                        int Q2 = Q(fjVar);
                        if (a0()) {
                        }
                        this.L1 = 0;
                        if (this.k1 == null) {
                        }
                        s0 s0Var22 = this.t1;
                        if (s0Var22 != null) {
                        }
                        if (this.t1 != null) {
                        }
                        if (this.m1 != null) {
                        }
                        int L62 = this.L1 - org.telegram.messenger.g0.L(z10 ? 14.0f : 0.0f);
                        this.L1 = L62;
                        i11 += L62;
                        int L72 = org.telegram.messenger.g0.L(14.0f) + this.P + i11;
                        staticLayout = this.y1;
                        RectF rectF2 = this.p0;
                        if (staticLayout == null) {
                        }
                        measuredWidth = getMeasuredWidth() << (getMeasuredHeight() + 16);
                        ug.t1 t1Var2 = this.W1;
                        t1Var2.a.set(rectF2);
                        t1Var2.b.set(rectF2);
                        if (this.X1 != measuredWidth) {
                        }
                        if (a0()) {
                        }
                        rectF2.inset(org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(1.0f));
                    }
                    f14 = 24.0f;
                }
                if (this.Q0 != null && !q0Var.p) {
                    int L13 = org.telegram.messenger.g0.L(8.0f) + q0Var.m;
                    q0Var.n = L13;
                    i11 += L13;
                }
                if (Z()) {
                    i11 = org.telegram.messenger.f3.C(f14, this.R, i11);
                }
                if (fjVar == null && a0()) {
                    setMeasuredDimension(max, this.m0 + r9);
                } else {
                    setMeasuredDimension(max, org.telegram.messenger.g0.L(14.0f) + this.m0 + this.P + i11);
                }
                q0Var.c = (getMeasuredHeight() - getPaddingTop()) - q0Var.n;
            }
            i11 = L4 + i13;
            f11 = 140.0f;
            U = U();
            q0Var = this.F0;
            if (U) {
            }
            if (this.Q0 != null) {
                int L132 = org.telegram.messenger.g0.L(8.0f) + q0Var.m;
                q0Var.n = L132;
                i11 += L132;
            }
            if (Z()) {
            }
            if (fjVar == null) {
            }
            setMeasuredDimension(max, org.telegram.messenger.g0.L(14.0f) + this.m0 + this.P + i11);
            q0Var.c = (getMeasuredHeight() - getPaddingTop()) - q0Var.n;
        }
        f10 = 30.0f;
        f11 = 140.0f;
        i11 = 0;
        U = U();
        q0Var = this.F0;
        if (U) {
        }
        if (this.Q0 != null) {
        }
        if (Z()) {
        }
        if (fjVar == null) {
        }
        setMeasuredDimension(max, org.telegram.messenger.g0.L(14.0f) + this.m0 + this.P + i11);
        q0Var.c = (getMeasuredHeight() - getPaddingTop()) - q0Var.n;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00ae, code lost:
    
        if (r11.i != false) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x08de  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x0910  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x0998  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x093a A[EDGE_INSN: B:311:0x093a->B:312:0x093a BREAK  A[LOOP:1: B:266:0x090e->B:310:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:314:0x0a13  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x0a19  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x0a1e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x02f8  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouchEvent(MotionEvent motionEvent) {
        float f10;
        float f11;
        boolean z10;
        u30 u30Var;
        TLRPC.Message message;
        TL_stars.StarGift starGift;
        s0 s0Var;
        kj kjVar;
        cg.a aVar;
        s0 s0Var2;
        TLRPC.Message message2;
        boolean z11;
        boolean z12;
        s0 s0Var3;
        boolean z13;
        StaticLayout staticLayout;
        boolean z14;
        ArrayList arrayList;
        int size;
        int i7;
        boolean z15;
        boolean z16;
        TLRPC.Message message3;
        int i10;
        u0 u0Var;
        boolean z17;
        n0 n0Var;
        fj fjVar = this.Q0;
        float x10 = motionEvent.getX() - (this.k0 / 2.0f);
        this.z0 = x10;
        float y10 = motionEvent.getY() + getPaddingTop();
        this.A0 = y10;
        boolean z18 = true;
        if (fjVar == null) {
            if (this.n2 != null) {
                if (motionEvent.getAction() == 0) {
                    if (x10 >= this.b1 && x10 <= this.c1) {
                        this.G = true;
                        return true;
                    }
                } else if (this.G) {
                    if (motionEvent.getAction() == 1) {
                        this.n2.onClick(this);
                        this.G = false;
                    } else if (motionEvent.getAction() == 3) {
                        this.G = false;
                    }
                }
            }
            return super.onTouchEvent(motionEvent);
        }
        q01 q01Var = this.o0;
        if (q01Var == null || !q01Var.d(motionEvent, false)) {
            tw0 tw0Var = this.P0;
            if (tw0Var != null) {
                mc mcVar = tw0Var.m;
                boolean contains = tw0Var.k.contains(motionEvent.getX(), motionEvent.getY());
                if (motionEvent.getAction() == 0) {
                    mcVar.c(contains);
                } else if (motionEvent.getAction() != 2) {
                    if (motionEvent.getAction() == 1) {
                        if (mcVar.i) {
                            tw0Var.b();
                        }
                        mcVar.c(false);
                    } else if (motionEvent.getAction() == 3) {
                        mcVar.c(false);
                    }
                }
            }
            if (!U() || !this.I0.e(this.G0, this.H0, motionEvent)) {
                if (W()) {
                    org.telegram.ui.Wallet.m4 m4Var = this.J0;
                    float f12 = (this.k0 / 2.0f) + this.L0;
                    float paddingTop = this.M0 + getPaddingTop();
                    ArrayList arrayList2 = m4Var.c;
                    mc mcVar2 = m4Var.Y;
                    float x11 = motionEvent.getX() - f12;
                    float y11 = motionEvent.getY() - paddingTop;
                    u0 u0Var2 = m4Var.a;
                    if (motionEvent.getActionMasked() == 0) {
                        float x12 = motionEvent.getX() - f12;
                        float y12 = motionEvent.getY() - paddingTop;
                        org.telegram.ui.Wallet.l4 l4Var = m4Var.m;
                        if (l4Var != null && l4Var.n && m4Var.w.contains((int) x12, (int) y12)) {
                            if (!m4Var.D && m4Var.C <= 1.001f) {
                                m4Var.A = m4Var.g();
                                m4Var.B = m4Var.k.F * 0.14f;
                            }
                            ValueAnimator valueAnimator = m4Var.G;
                            if (valueAnimator != null) {
                                valueAnimator.cancel();
                                m4Var.G = null;
                            }
                            m4Var.D = false;
                            m4Var.x = motionEvent.getPointerId(0);
                            m4Var.y = motionEvent.getX();
                            m4Var.z = motionEvent.getY();
                            m4Var.r0 = false;
                            mcVar2.c(false);
                            if (u0Var2.getParent() != null) {
                                u0Var2.getParent().requestDisallowInterceptTouchEvent(true);
                            }
                            m4Var.a(3.0f);
                            if (z18) {
                                if (this.J0.x != -1) {
                                    n();
                                    return true;
                                }
                                if (motionEvent.getAction() == 0) {
                                    this.B0 = motionEvent.getX();
                                    this.C0 = motionEvent.getY();
                                    u();
                                    return true;
                                }
                                if (motionEvent.getAction() != 2) {
                                    n();
                                    return true;
                                }
                                float scaledTouchSlop = ViewConfiguration.get(getContext()).getScaledTouchSlop();
                                if (Math.abs(motionEvent.getX() - this.B0) > scaledTouchSlop || Math.abs(motionEvent.getY() - this.C0) > scaledTouchSlop) {
                                    n();
                                    return true;
                                }
                            }
                        }
                        float L = org.telegram.messenger.g0.L(4.0f);
                        boolean z19 = x11 < L && x11 <= ((float) org.telegram.messenger.g0.L(206.0f)) - L && y11 >= L && y11 <= ((float) org.telegram.messenger.g0.L(140.0f)) - L;
                        if (m4Var.q0 != null) {
                            TLRPC.TL_messageActionGramTransfer tL_messageActionGramTransfer = m4Var.l0;
                            if ((tL_messageActionGramTransfer.comment_encrypted || tL_messageActionGramTransfer.comment_encrypted_preparing) && !m4Var.m0) {
                                float L2 = x11 - ((org.telegram.messenger.g0.L(206.0f) - m4Var.q0.k()) / 2.0f);
                                float L3 = y11 - org.telegram.messenger.g0.L(143.0f);
                                int size2 = arrayList2.size();
                                int i11 = 0;
                                while (i11 < size2) {
                                    Object obj = arrayList2.get(i11);
                                    i11++;
                                    u0Var = u0Var2;
                                    if (((xh.f) obj).getBounds().contains((int) L2, (int) L3)) {
                                        z17 = true;
                                        break;
                                    }
                                    u0Var2 = u0Var;
                                }
                            }
                        }
                        u0Var = u0Var2;
                        z17 = false;
                        boolean z20 = !z19 || z17;
                        if (motionEvent.getAction() != 0) {
                            m4Var.r0 = z20;
                            mcVar2.c(z20);
                        } else if (motionEvent.getAction() != 2) {
                            if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                                z18 = m4Var.r0;
                                boolean z21 = motionEvent.getAction() == 1 && z18 && z20;
                                m4Var.r0 = false;
                                mcVar2.c(false);
                                if (z21 && z17) {
                                    TLRPC.TL_messageActionGramTransfer tL_messageActionGramTransfer2 = m4Var.l0;
                                    if (tL_messageActionGramTransfer2.comment_encrypted_preparing) {
                                        m4Var.m0 = true;
                                        vy0 vy0Var = m4Var.q0;
                                        vy0Var.q(org.telegram.messenger.j6.m(tL_messageActionGramTransfer2.comment, vy0Var.a.getFontMetricsInt(), false, null, 0));
                                        m4Var.d.addAll(arrayList2);
                                        arrayList2.clear();
                                        u0Var.requestLayout();
                                        u0Var.invalidate();
                                        if (z18) {
                                        }
                                    }
                                }
                                if (z21 && (n0Var = m4Var.s0) != null) {
                                    n0Var.run();
                                }
                                if (z18) {
                                }
                            }
                            z18 = m4Var.r0;
                            if (z18) {
                            }
                        } else if (m4Var.r0) {
                            mcVar2.c(z20);
                        }
                        z18 = m4Var.r0;
                        if (z18) {
                        }
                    } else {
                        if (m4Var.x != -1) {
                            int actionMasked = motionEvent.getActionMasked();
                            if (actionMasked != 1) {
                                if (actionMasked == 2) {
                                    int findPointerIndex = motionEvent.findPointerIndex(m4Var.x);
                                    if (findPointerIndex < 0) {
                                        m4Var.j();
                                    } else {
                                        float radians = ((float) Math.toRadians(0.800000011920929d)) / org.telegram.messenger.g0.p;
                                        m4Var.A = com.google.android.gms.internal.vision.e2.z(motionEvent.getX(findPointerIndex), m4Var.y, radians, m4Var.A);
                                        m4Var.B = com.google.android.gms.internal.vision.e2.z(motionEvent.getY(findPointerIndex), m4Var.z, radians, m4Var.B);
                                        m4Var.y = motionEvent.getX(findPointerIndex);
                                        m4Var.z = motionEvent.getY(findPointerIndex);
                                        u0Var2.invalidate();
                                    }
                                } else if (actionMasked != 3) {
                                    if (actionMasked == 6 && motionEvent.getPointerId(motionEvent.getActionIndex()) == m4Var.x) {
                                        int i12 = motionEvent.getActionIndex() == 0 ? 1 : 0;
                                        m4Var.x = motionEvent.getPointerId(i12);
                                        m4Var.y = motionEvent.getX(i12);
                                        m4Var.z = motionEvent.getY(i12);
                                    }
                                }
                                if (z18) {
                                }
                            }
                            m4Var.j();
                            if (z18) {
                            }
                        }
                        float L4 = org.telegram.messenger.g0.L(4.0f);
                        if (x11 < L4) {
                        }
                        if (m4Var.q0 != null) {
                        }
                        u0Var = u0Var2;
                        z17 = false;
                        if (z19) {
                        }
                        if (motionEvent.getAction() != 0) {
                        }
                        z18 = m4Var.r0;
                        if (z18) {
                        }
                    }
                    return true;
                }
                if (!this.F0.c(motionEvent)) {
                    int action = motionEvent.getAction();
                    ImageReceiver imageReceiver = this.J;
                    RectF rectF = this.p0;
                    View view = this.U1;
                    mc mcVar3 = this.n;
                    if (action == 0) {
                        if (this.g1 != null) {
                            if ((fjVar.D == 11 || Y(fjVar)) && imageReceiver.O(x10, y10)) {
                                this.a0 = true;
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            if (fjVar.D == 33 && this.N1.contains(x10, y10) && (this.y1 == null || !rectF.contains(x10, y10))) {
                                this.a0 = true;
                                z15 = true;
                            }
                            if (this.K1.i.q == 4 && (((i10 = fjVar.D) == 21 || i10 == 22) && this.N1.contains(x10, y10))) {
                                this.a0 = true;
                                z15 = true;
                            }
                            s0 s0Var4 = this.t1;
                            if (s0Var4 != null && this.p1) {
                                RectF rectF2 = org.telegram.messenger.g0.P;
                                float f13 = s0Var4.b;
                                rectF2.set(f13, s0Var4.e, ((StaticLayout) s0Var4.f).getWidth() + f13, this.t1.e + ((StaticLayout) r12.f).getHeight());
                                if (rectF2.contains(x10, y10)) {
                                    this.F = true;
                                    z15 = true;
                                }
                            }
                            if (Y(fjVar) && this.y1 != null && (rectF.contains(x10, y10) || (this.z1 && this.N1.contains(x10, y10)))) {
                                z16 = true;
                                this.b0 = true;
                                view.setPressed(true);
                                mcVar3.c(true);
                                z15 = true;
                            } else {
                                z16 = true;
                            }
                            if (!z15 && Z()) {
                                this.F = z16;
                                z15 = true;
                            }
                            if (!z15) {
                                fj fjVar2 = this.Q0;
                                if (cg.d.g((fjVar2 == null || (message3 = fjVar2.k) == null) ? null : message3.action, TLRPC.TL_messageActionSuggestedPostRefund.class, TLRPC.TL_messageActionSuggestedPostSuccess.class)) {
                                    this.F = true;
                                    z15 = true;
                                }
                            }
                            if (z15) {
                                u();
                            }
                            f11 = x10;
                            z12 = z15;
                            if (!z12 && (motionEvent.getAction() == 0 || ((this.y != null || this.E != null) && motionEvent.getAction() == 1))) {
                                s0Var3 = this.t1;
                                if (s0Var3 != null && (arrayList = s0Var3.c) != null && !arrayList.isEmpty() && !this.H) {
                                    ArrayList arrayList3 = this.t1.c;
                                    size = arrayList3.size();
                                    i7 = 0;
                                    while (true) {
                                        if (i7 < size) {
                                            break;
                                        }
                                        Object obj2 = arrayList3.get(i7);
                                        i7++;
                                        xh.f fVar = (xh.f) obj2;
                                        Rect bounds = fVar.getBounds();
                                        s0 s0Var5 = this.t1;
                                        if (bounds.contains((int) (f11 - s0Var5.b), (int) (y10 - s0Var5.e))) {
                                            this.y = null;
                                            if (motionEvent.getAction() == 0) {
                                                this.E = fVar;
                                                z12 = true;
                                            } else {
                                                xh.f fVar2 = this.E;
                                                z13 = true;
                                                if (fVar == fVar2) {
                                                    this.H = true;
                                                    fVar2.q = new n0(this, 5);
                                                    float sqrt = (float) Math.sqrt(Math.pow(((StaticLayout) this.t1.f).getHeight(), 2.0d) + Math.pow(((StaticLayout) this.t1.f).getWidth(), 2.0d));
                                                    xh.f fVar3 = this.E;
                                                    s0 s0Var6 = this.t1;
                                                    fVar3.j((int) (f11 - s0Var6.b), (int) (y10 - s0Var6.e), sqrt, false);
                                                    invalidate();
                                                }
                                                z12 = true;
                                            }
                                        }
                                    }
                                }
                                z13 = true;
                                if (!z12 && (staticLayout = this.N) != null) {
                                    if (f11 >= this.S) {
                                        float f14 = this.T;
                                        if (y10 >= f14 && f11 <= r3 + this.O && y10 <= r5 + this.P) {
                                            float f15 = y10 - f14;
                                            float f16 = f11 - this.U;
                                            if (!z12) {
                                                int lineForVertical = staticLayout.getLineForVertical((int) f15);
                                                int offsetForHorizontal = this.N.getOffsetForHorizontal(lineForVertical, f16);
                                                float lineLeft = this.N.getLineLeft(lineForVertical);
                                                if (lineLeft <= f16 && this.N.getLineWidth(lineForVertical) + lineLeft >= f16) {
                                                    CharSequence charSequence = fjVar.v;
                                                    if (charSequence instanceof Spannable) {
                                                        URLSpan[] uRLSpanArr = (URLSpan[]) ((Spannable) charSequence).getSpans(offsetForHorizontal, offsetForHorizontal, URLSpan.class);
                                                        if (uRLSpanArr.length != 0) {
                                                            if (motionEvent.getAction() == 0) {
                                                                this.y = uRLSpanArr[0];
                                                            } else {
                                                                URLSpan uRLSpan = uRLSpanArr[0];
                                                                URLSpan uRLSpan2 = this.y;
                                                                if (uRLSpan == uRLSpan2) {
                                                                    e0(uRLSpan2);
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
                                z12 = x(motionEvent);
                            }
                            return !z12 ? super.onTouchEvent(motionEvent) : z12;
                        }
                        f11 = x10;
                    } else {
                        if (motionEvent.getAction() != 2) {
                            n();
                        }
                        if (this.G) {
                            if (motionEvent.getAction() == 2) {
                                if (x10 < this.b1 || x10 > this.c1) {
                                    z11 = false;
                                    this.G = false;
                                }
                            } else if (motionEvent.getAction() == 1) {
                                View.OnClickListener onClickListener = this.n2;
                                if (onClickListener != null) {
                                    onClickListener.onClick(this);
                                }
                                this.G = false;
                            } else if (motionEvent.getAction() == 3) {
                                this.G = false;
                            }
                            f11 = x10;
                        } else if (this.F) {
                            int action2 = motionEvent.getAction();
                            if (action2 == 1) {
                                this.F = false;
                                view.setPressed(false);
                                mcVar3.c(false);
                                if (this.g1 != null && fjVar.C != null && (message2 = fjVar.k) != null && cg.d.g(message2.action, TLRPC.TL_messageActionTodoAppendTasks.class, TLRPC.TL_messageActionTodoCompletions.class, TLRPC.TL_messageActionSuggestedPostApproval.class, TLRPC.TL_messageActionSuggestedPostRefund.class, TLRPC.TL_messageActionSuggestedPostSuccess.class)) {
                                    this.g1.n(this, this.Q0.N1());
                                } else if (this.p1 && !this.o1 && (s0Var2 = this.t1) != null) {
                                    int height = ((StaticLayout) s0Var2.f).getHeight() - this.q1;
                                    this.o1 = true;
                                    r0 r0Var = this.g1;
                                    if (r0Var != null) {
                                        r0Var.t(this);
                                        if (getParent() instanceof ck0) {
                                            ((ck0) getParent()).w0(0, org.telegram.messenger.g0.L(24.0f) + height, null);
                                            return true;
                                        }
                                    }
                                } else if (this.P0 != null && this.N1.contains(motionEvent.getX(), motionEvent.getY())) {
                                    this.P0.b();
                                    return true;
                                }
                            } else if (action2 == 2) {
                                s0 s0Var7 = this.t1;
                                if (s0Var7 == null || !this.p1) {
                                    this.F = false;
                                } else {
                                    RectF rectF3 = org.telegram.messenger.g0.P;
                                    float f17 = s0Var7.b;
                                    rectF3.set(f17, s0Var7.e, ((StaticLayout) s0Var7.f).getWidth() + f17, this.t1.e + ((StaticLayout) r8.f).getHeight());
                                    if (!rectF3.contains(x10, y10)) {
                                        this.F = false;
                                    }
                                }
                                z11 = true;
                            } else if (action2 == 3) {
                                this.F = false;
                                mcVar3.c(false);
                            }
                            z11 = false;
                        } else {
                            boolean z22 = this.b0;
                            int i13 = this.I;
                            if (z22) {
                                int action3 = motionEvent.getAction();
                                if (action3 == 1) {
                                    this.a0 = false;
                                    this.b0 = false;
                                    view.setPressed(false);
                                    mcVar3.c(false);
                                    if (this.c2 != null) {
                                        playSoundEffect(0);
                                        r0 r0Var2 = this.g1;
                                        org.telegram.ui.ActionBar.h2 G = r0Var2 != null ? r0Var2.G() : LaunchActivity.T();
                                        if (G != null && this.c2 != null && this.Q0 != null) {
                                            final lc b02 = lc.b0(G);
                                            if (this.c2.buyer) {
                                                Context context = getContext();
                                                int e12 = this.Q0.e1();
                                                TLRPC.TL_messageActionStarGiftOnchainOffer tL_messageActionStarGiftOnchainOffer = this.c2;
                                                HashMap hashMap = bi.f4.a;
                                                long j3 = tL_messageActionStarGiftOnchainOffer.offer_id;
                                                if (bi.f4.b(j3)) {
                                                    TL_stars.cancelStarGiftOnchainOffer cancelstargiftonchainoffer = new TL_stars.cancelStarGiftOnchainOffer();
                                                    cancelstargiftonchainoffer.offer_msg_id = e12;
                                                    org.telegram.ui.ActionBar.i6 i6Var = this.h1;
                                                    org.telegram.ui.ActionBar.u1 u1Var = new org.telegram.ui.ActionBar.u1(3, context, i6Var);
                                                    u1Var.r(300L);
                                                    int i14 = this.I;
                                                    f10 = x10;
                                                    ConnectionsManager.getInstance(i14).sendRequestTyped(cancelstargiftonchainoffer, new d3.b(1), new bi.c4(u1Var, j3, context, i14, i6Var, b02, tL_messageActionStarGiftOnchainOffer, 0));
                                                }
                                            } else {
                                                f10 = x10;
                                                final Context context2 = getContext();
                                                final int e13 = this.Q0.e1();
                                                final TLRPC.TL_messageActionStarGiftOnchainOffer tL_messageActionStarGiftOnchainOffer2 = this.c2;
                                                HashMap hashMap2 = bi.f4.a;
                                                final long j10 = tL_messageActionStarGiftOnchainOffer2.offer_id;
                                                final int i15 = this.I;
                                                if (bi.f4.j(i15, j10)) {
                                                    bi.f4.q(b02);
                                                } else if (bi.f4.b(j10)) {
                                                    TL_stars.acceptStarGiftOnchainOffer acceptstargiftonchainoffer = new TL_stars.acceptStarGiftOnchainOffer();
                                                    acceptstargiftonchainoffer.offer_msg_id = e13;
                                                    final org.telegram.ui.ActionBar.i6 i6Var2 = this.h1;
                                                    final org.telegram.ui.ActionBar.u1 u1Var2 = new org.telegram.ui.ActionBar.u1(3, context2, i6Var2);
                                                    u1Var2.r(500L);
                                                    ConnectionsManager.getInstance(i15).sendRequestTyped(acceptstargiftonchainoffer, new d3.b(1), new q10() { // from class: bi.b4
                                                        @Override // org.telegram.messenger.q10
                                                        public final void a(Object obj3, Object obj4) {
                                                            TL_stars.TL_payments_starGiftOnchainOfferTx tL_payments_starGiftOnchainOfferTx = (TL_stars.TL_payments_starGiftOnchainOfferTx) obj3;
                                                            TLRPC.TL_error tL_error = (TLRPC.TL_error) obj4;
                                                            org.telegram.ui.ActionBar.u1.this.dismiss();
                                                            long j11 = j10;
                                                            Context context3 = context2;
                                                            org.telegram.ui.ActionBar.i6 i6Var3 = i6Var2;
                                                            int i16 = i15;
                                                            lc lcVar = b02;
                                                            if (tL_payments_starGiftOnchainOfferTx == null || tL_payments_starGiftOnchainOfferTx.message == null) {
                                                                f4.f(j11);
                                                                if (tL_error == null || !"STARGIFT_ONCHAIN_SALE_ACTIVE".equals(tL_error.text)) {
                                                                    v4.r(context3, i16, i6Var3, lcVar, tL_error, null);
                                                                    return;
                                                                } else {
                                                                    v4.p(context3, i6Var3, gd.M0(2131749553, null), null);
                                                                    return;
                                                                }
                                                            }
                                                            org.telegram.ui.Wallet.p0 o4 = f4.o(context3, i6Var3, lcVar, i16, tL_payments_starGiftOnchainOfferTx);
                                                            if (o4 == null) {
                                                                f4.f(j11);
                                                                return;
                                                            }
                                                            TL_stars.TL_payments_starGiftOnchainOfferTxMessage tL_payments_starGiftOnchainOfferTxMessage = tL_payments_starGiftOnchainOfferTx.gasless_message;
                                                            if (tL_payments_starGiftOnchainOfferTxMessage != null) {
                                                                try {
                                                                    org.telegram.ui.Wallet.p0 b10 = org.telegram.ui.Wallet.p0.b(tL_payments_starGiftOnchainOfferTxMessage);
                                                                    List list = b10.g;
                                                                    if (list == null) {
                                                                        list = Collections.singletonList(b10);
                                                                    }
                                                                    Iterator it = list.iterator();
                                                                    while (true) {
                                                                        if (!it.hasNext()) {
                                                                            break;
                                                                        } else if (((org.telegram.ui.Wallet.p0) it.next()).e != 3) {
                                                                            b10 = null;
                                                                            break;
                                                                        }
                                                                    }
                                                                    o4.f = b10;
                                                                } catch (Exception e10) {
                                                                    org.telegram.messenger.a8.g(e10, true);
                                                                }
                                                            }
                                                            TLRPC.TL_messageActionStarGiftOnchainOffer tL_messageActionStarGiftOnchainOffer3 = tL_messageActionStarGiftOnchainOffer2;
                                                            TL_stars.StarGift starGift2 = tL_messageActionStarGiftOnchainOffer3.gift;
                                                            String h = starGift2 != null ? v4.h(starGift2) : "";
                                                            o3 o3Var = new o3(i16, context3, tL_messageActionStarGiftOnchainOffer3.gift, i6Var3);
                                                            o3Var.k1(org.telegram.messenger.g0.W2(gd.a0(null, null, 2131749569, h, v4.k(tL_messageActionStarGiftOnchainOffer3.amount))), gd.M0(2131749568, null));
                                                            String M0 = gd.M0(2131749535, null);
                                                            SpannableStringBuilder l10 = v4.l(tL_messageActionStarGiftOnchainOffer3.amount);
                                                            cy0 cy0Var = o3Var.Z1;
                                                            cy0Var.e(M0, l10, null, null);
                                                            v4.c(o3Var, tL_messageActionStarGiftOnchainOffer3.amount, tL_messageActionStarGiftOnchainOffer3.fee_bps, i6Var3);
                                                            TL_stars.StarGift starGift3 = tL_messageActionStarGiftOnchainOffer3.gift;
                                                            if (starGift3 != null) {
                                                                v4.b(o3Var, starGift3);
                                                                if (tL_messageActionStarGiftOnchainOffer3.gift.availability_total > 0) {
                                                                    cy0Var.e(gd.M0(2131750284, null), gd.H(',', "Gift2QuantityIssued1", tL_messageActionStarGiftOnchainOffer3.gift.availability_issued) + gd.H(',', "Gift2QuantityIssued2", tL_messageActionStarGiftOnchainOffer3.gift.availability_total), null, null);
                                                                }
                                                            }
                                                            TL_wallet.walletOnchainGiftActionOfferAccept walletonchaingiftactionofferaccept = new TL_wallet.walletOnchainGiftActionOfferAccept();
                                                            walletonchaingiftactionofferaccept.offer_address = tL_messageActionStarGiftOnchainOffer3.offer_address;
                                                            walletonchaingiftactionofferaccept.price = tL_messageActionStarGiftOnchainOffer3.amount;
                                                            TL_stars.StarGift starGift4 = tL_messageActionStarGiftOnchainOffer3.gift;
                                                            o4.h = walletonchaingiftactionofferaccept;
                                                            o4.i = starGift4;
                                                            long j12 = tL_messageActionStarGiftOnchainOffer3.offer_id;
                                                            boolean[] zArr = new boolean[1];
                                                            f4.i(j12, Long.MAX_VALUE);
                                                            o3Var.setOnDismissListener(new u3(zArr, j12, 1));
                                                            o3Var.v2.setVisibility(0);
                                                            String M02 = gd.M0(2131749605, null);
                                                            p3 p3Var = new p3(context3, i16, e13, tL_messageActionStarGiftOnchainOffer3, i6Var3, o3Var);
                                                            hi.d dVar = o3Var.c2;
                                                            dVar.i(M02, false, true);
                                                            dVar.setOnClickListener(new ai.v2(4, o3Var, p3Var));
                                                            int i17 = tL_messageActionStarGiftOnchainOffer3.expires_at - 10;
                                                            ai.o oVar = new ai.o(5);
                                                            o3Var.n2 = i17;
                                                            o3Var.o2 = oVar;
                                                            o3Var.h1();
                                                            o3Var.d2.i(gd.M0(2131749572, null), false, true);
                                                            o3Var.q2 = 2131749615;
                                                            o3Var.j1(o4);
                                                            String str = h;
                                                            o3Var.i1(new q3(zArr, j12, i16, str, 0), new r3(str, j12, i16, tL_messageActionStarGiftOnchainOffer3), new s3(context3, i16, i6Var3, o3Var, 0));
                                                            o3Var.show();
                                                        }
                                                    });
                                                }
                                            }
                                        }
                                    } else {
                                        f10 = x10;
                                        if (this.g1 != null) {
                                            int i16 = fjVar.D;
                                            if (i16 == 37) {
                                                playSoundEffect(0);
                                                org.telegram.ui.ActionBar.h2 T = LaunchActivity.T();
                                                if (T != null) {
                                                    new li.d0(T, ((TLRPC.TL_messageActionChangeCommunity) fjVar.k.action).community_id, null, null).show();
                                                }
                                            } else if (i16 == 31) {
                                                playSoundEffect(0);
                                                g0();
                                            } else if (i16 == 25) {
                                                playSoundEffect(0);
                                                if (this.g1 != null) {
                                                    org.telegram.messenger.g0.g3(new fa(2, this, (TLRPC.TL_messageActionGiftCode) this.Q0.k.action));
                                                }
                                            } else if (i16 == 18) {
                                                playSoundEffect(0);
                                                f0();
                                            } else if (i16 == 30) {
                                                playSoundEffect(0);
                                                g0();
                                            } else {
                                                TLRPC.Message message4 = fjVar.k;
                                                if (message4 != null) {
                                                    TLRPC.MessageAction messageAction = message4.action;
                                                    if ((messageAction instanceof TLRPC.TL_messageActionSuggestedPostApproval) && ((TLRPC.TL_messageActionSuggestedPostApproval) messageAction).balance_too_low) {
                                                        playSoundEffect(0);
                                                        TLRPC.Message message5 = this.Q0.k;
                                                        if (message5 != null) {
                                                            TLRPC.SuggestedPost suggestedPost = message5.suggested_post;
                                                            if (suggestedPost != null) {
                                                                kjVar = kj.b(suggestedPost);
                                                            } else {
                                                                TLRPC.MessageAction messageAction2 = message5.action;
                                                                if (messageAction2 instanceof TLRPC.TL_messageActionSuggestedPostApproval) {
                                                                    kjVar = new kj(cg.a.m(((TLRPC.TL_messageActionSuggestedPostApproval) messageAction2).price), r1.schedule_date);
                                                                }
                                                            }
                                                            aVar = kjVar.a;
                                                            if (aVar != null && aVar.a == cg.b.a) {
                                                                new fb(getContext(), this.h1, kjVar.a.a(), 13, qg.c.i(i13, fj.B0(this.Q0.k)), null, fj.B0(this.Q0.k)).show();
                                                            }
                                                        }
                                                        kjVar = null;
                                                        aVar = kjVar.a;
                                                        if (aVar != null) {
                                                            new fb(getContext(), this.h1, kjVar.a.a(), 13, qg.c.i(i13, fj.B0(this.Q0.k)), null, fj.B0(this.Q0.k)).show();
                                                        }
                                                    }
                                                }
                                                if (((u30) mp.u1(i13).E7.get(fjVar.k.local_id)) == null) {
                                                    if (this.z1) {
                                                        this.g1.x(this);
                                                    } else {
                                                        this.g1.D(this);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } else if (action3 != 2) {
                                    if (action3 == 3) {
                                        this.a0 = false;
                                        this.b0 = false;
                                        view.setPressed(false);
                                        mcVar3.c(false);
                                    }
                                } else if (!Y(fjVar) || (!rectF.contains(x10, y10) && !this.N1.contains(x10, y10))) {
                                    this.b0 = false;
                                    view.setPressed(false);
                                    mcVar3.c(false);
                                }
                                f10 = x10;
                            } else {
                                f10 = x10;
                                if (this.a0) {
                                    int action4 = motionEvent.getAction();
                                    if (action4 == 1) {
                                        f11 = f10;
                                        this.a0 = false;
                                        if (!this.p1 || this.o1 || (s0Var = this.t1) == null) {
                                            int i17 = fjVar.D;
                                            if (i17 == 31) {
                                                g0();
                                            } else if (i17 == 25) {
                                                if (this.g1 != null) {
                                                    org.telegram.messenger.g0.g3(new fa(2, this, (TLRPC.TL_messageActionGiftCode) this.Q0.k.action));
                                                }
                                            } else if (i17 == 18) {
                                                f0();
                                            } else if (i17 == 30) {
                                                g0();
                                            } else if (i17 == 33) {
                                                fj fjVar3 = this.Q0;
                                                if (fjVar3 != null && (message = fjVar3.k) != null) {
                                                    TLRPC.MessageAction messageAction3 = message.action;
                                                    if (messageAction3 instanceof TLRPC.TL_messageActionStarGiftOnchainOffer) {
                                                        starGift = ((TLRPC.TL_messageActionStarGiftOnchainOffer) messageAction3).gift;
                                                    } else if (messageAction3 instanceof TLRPC.TL_messageActionStarGiftPurchaseOffer) {
                                                        starGift = ((TLRPC.TL_messageActionStarGiftPurchaseOffer) messageAction3).gift;
                                                    }
                                                    if ((starGift instanceof TL_stars.TL_starGiftUnique) && !TextUtils.isEmpty(starGift.slug)) {
                                                        playSoundEffect(0);
                                                        di.f6 f6Var = new di.f6(getContext(), this.I, 0L, this.h1, null);
                                                        f6Var.u2(starGift.slug, (TL_stars.TL_starGiftUnique) starGift, null);
                                                        f6Var.show();
                                                    }
                                                }
                                            } else if (this.g1 != null) {
                                                if (i17 != 21 || (u30Var = (u30) mp.u1(i13).E7.get(fjVar.k.local_id)) == null) {
                                                    z10 = false;
                                                } else {
                                                    u30Var.b();
                                                    z10 = true;
                                                }
                                                if (!z10) {
                                                    this.g1.x(this);
                                                    playSoundEffect(0);
                                                }
                                            }
                                        } else {
                                            int height2 = ((StaticLayout) s0Var.f).getHeight() - this.q1;
                                            this.o1 = true;
                                            r0 r0Var3 = this.g1;
                                            if (r0Var3 != null) {
                                                r0Var3.t(this);
                                                if (getParent() instanceof ck0) {
                                                    ((ck0) getParent()).w0(0, org.telegram.messenger.g0.L(16.0f) + height2, null);
                                                    return true;
                                                }
                                            }
                                        }
                                    } else if (action4 != 2) {
                                        if (action4 == 3) {
                                            this.a0 = false;
                                        }
                                    } else if (a0()) {
                                        f11 = f10;
                                        if (!this.N1.contains(f11, y10)) {
                                            this.a0 = false;
                                        }
                                    } else {
                                        f11 = f10;
                                        if (!imageReceiver.O(f11, y10)) {
                                            this.a0 = false;
                                        }
                                    }
                                }
                            }
                            f11 = f10;
                        }
                        z12 = z11;
                        f11 = x10;
                        if (!z12) {
                            s0Var3 = this.t1;
                            if (s0Var3 != null) {
                                ArrayList arrayList32 = this.t1.c;
                                size = arrayList32.size();
                                i7 = 0;
                                while (true) {
                                    if (i7 < size) {
                                    }
                                }
                            }
                            z13 = true;
                            if (!z12) {
                                if (f11 >= this.S) {
                                }
                            }
                            this.y = null;
                        }
                        if (!z12) {
                        }
                        if (!z12) {
                        }
                    }
                    z12 = false;
                    if (!z12) {
                    }
                    if (!z12) {
                    }
                    if (!z12) {
                    }
                }
                return true;
            }
        }
        return true;
    }

    @Override // org.telegram.ui.Cells.z
    public final boolean q() {
        r0 r0Var = this.g1;
        if (r0Var != null) {
            return r0Var.s0(this, this.z0, this.A0);
        }
        return false;
    }

    public void setCustomText(CharSequence charSequence) {
        this.S0 = charSequence;
        if (charSequence != null) {
            o0(false);
        }
    }

    public void setDelegate(r0 r0Var) {
        this.g1 = r0Var;
    }

    public void setInvalidateColors(boolean z10) {
        if (this.f1 == z10) {
            return;
        }
        this.f1 = z10;
        invalidate();
    }

    public void setInvalidateListener(Runnable runnable) {
        this.x2 = runnable;
    }

    public void setInvalidateWithParent(View view) {
        this.w = view;
    }

    public void setInvalidatesParent(boolean z10) {
        this.w2 = z10;
    }

    public void setMessageObject(fj fjVar) {
        j0(fjVar, false);
    }

    public void setOnActionClickListener(View.OnClickListener onClickListener) {
        this.n2 = onClickListener;
    }

    public void setOverrideTextMaxWidth(int i7) {
        this.o2 = i7;
    }

    public void setScrimReaction(Integer num) {
        this.F0.z = num;
    }

    public void setShowTopic(boolean z10) {
        if (this.n0 != z10) {
            this.n0 = z10;
            X();
            invalidate();
        }
    }

    public void setSpoilersSuppressed(boolean z10) {
        this.K0 = z10;
        org.telegram.ui.Wallet.m4 m4Var = this.J0;
        if (m4Var != null) {
            m4Var.n(z10);
        }
        ArrayList arrayList = this.q0;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            ((xh.f) obj).invalidateSelf();
        }
    }

    public void setWalletSlidingOffset(float f10) {
        setTranslationX((getTranslationX() - this.N0) + f10);
        this.N0 = f10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:172:0x0677, code lost:
    
        if (r11 == false) goto L292;
     */
    /* JADX WARN: Removed duplicated region for block: B:157:0x04bf  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0673  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x04c9  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x03ff  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0430  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x07dd  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x07ee  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00b2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v() {
        CharSequence charSequence;
        CharSequence charSequence2;
        CharSequence L0;
        CharSequence charSequence3;
        boolean z10;
        CharSequence Z;
        ArrayList<TLRPC.VideoSize> arrayList;
        TLRPC.Photo photo;
        ArrayList<TLRPC.VideoSize> arrayList2;
        CharSequence charSequence4;
        int i7;
        String G;
        ArrayList arrayList3;
        boolean z11;
        long j3;
        boolean z12;
        SpannableStringBuilder spannableStringBuilder;
        long j10;
        TL_stars.StarGift starGift;
        String str;
        CharSequence W2;
        TL_stars.StarGift starGift2;
        String str2;
        CharSequence charSequence5;
        String r10;
        TLRPC.Peer peer;
        TLRPC.Message message;
        TLRPC.MessageAction messageAction;
        int i10;
        TLRPC.MessageMedia messageMedia;
        fj fjVar = this.Q0;
        int i11 = this.I;
        if (fjVar == null) {
            charSequence = this.S0;
        } else if (W()) {
            CharSequence r11 = org.telegram.ui.Wallet.u0.D(i11).r(((TLRPC.TL_messageActionGramTransfer) fjVar.k.action).amount, false);
            if (!TextUtils.isEmpty(r11)) {
                charSequence = gd.V(null, null, 2131742716, org.telegram.ui.Components.x5.cloneSpans(fjVar.v), r11);
                if (charSequence == null) {
                    TLRPC.Message message2 = fjVar.k;
                    if (message2 == null || (messageMedia = message2.media) == null || messageMedia.ttl_seconds == 0) {
                        charSequence = org.telegram.ui.Components.x5.cloneSpans(fjVar.v);
                    } else if (messageMedia.photo != null) {
                        charSequence = gd.M0(2131753945, null);
                    } else {
                        TLRPC.Document document = messageMedia.document;
                        charSequence = ((document instanceof TLRPC.TL_documentEmpty) || ((messageMedia instanceof TLRPC.TL_messageMediaDocument) && document == null)) ? messageMedia.voice ? gd.M0(2131753927, null) : messageMedia.round ? gd.M0(2131753938, null) : gd.M0(2131753930, null) : org.telegram.ui.Components.x5.cloneSpans(fjVar.v);
                    }
                }
            }
            charSequence = null;
            if (charSequence == null) {
            }
        } else {
            if (fjVar.g3()) {
                charSequence = fjVar.k.media.user_id != j10.i(i11).e() ? fi.i7.e(new Object[0], 2131750862, true) : fi.i7.e(new Object[]{mp.u1(i11).c2(Long.valueOf(fj.B0(fjVar.k))).first_name}, 2131750861, true);
            } else {
                r0 r0Var = this.g1;
                if (r0Var != null && r0Var.d() == 0 && fj.E4(fjVar)) {
                    charSequence = qg.c.c(mp.u1(i11).t7.f(-fj.B0(fjVar.k), fj.b2(i11, fjVar.k, true, false)), fjVar);
                }
                charSequence = null;
            }
            if (charSequence == null) {
            }
        }
        fj fjVar2 = this.Q0;
        if (fjVar2 != null && fjVar2.j2) {
            charSequence = "";
        }
        if (fjVar2 != null && (message = fjVar2.k) != null && (messageAction = message.action) != null) {
            if (messageAction instanceof TLRPC.TL_messageActionTodoAppendTasks) {
                i10 = R.drawable.mini_checklist_add;
            } else if (messageAction instanceof TLRPC.TL_messageActionTodoCompletions) {
                TLRPC.TL_messageActionTodoCompletions tL_messageActionTodoCompletions = (TLRPC.TL_messageActionTodoCompletions) messageAction;
                i10 = tL_messageActionTodoCompletions.incompleted.size() > tL_messageActionTodoCompletions.completed.size() ? R.drawable.mini_checklist_undone : R.drawable.mini_checklist_done;
            } else {
                i10 = 0;
            }
            if (i10 != 0) {
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(charSequence);
                spannableStringBuilder2.insert(0, (CharSequence) "i ");
                spannableStringBuilder2.setSpan(new lq(i10, 0), 0, 1, 33);
                charSequence = spannableStringBuilder2;
            }
        }
        E(this.W, charSequence);
        if (this.P0 != null) {
            this.N = null;
            this.P = 0;
            this.Q = null;
            this.R = 0;
            this.T = 0;
        }
        if (fjVar != null) {
            TLRPC.Message message3 = fjVar.k;
            if (message3 != null) {
                TLRPC.MessageAction messageAction2 = message3.action;
                if ((messageAction2 instanceof TLRPC.TL_messageActionSuggestedPostApproval) && ((TLRPC.TL_messageActionSuggestedPostApproval) messageAction2).balance_too_low) {
                    B(null, null, charSequence, false, !org.telegram.messenger.v3.z(i11, 24, fj.B0(message3)) ? gd.M0(2131744916, null) : null, 11, null, this.j1, false);
                    this.N = null;
                    this.P = 0;
                    this.Q = null;
                    this.R = 0;
                    this.T = 0;
                }
            }
            CharSequence charSequence6 = charSequence;
            if (message3 != null) {
                TLRPC.MessageAction messageAction3 = message3.action;
                if ((messageAction3 instanceof TLRPC.TL_messageActionSuggestedPostApproval) && ((TLRPC.TL_messageActionSuggestedPostApproval) messageAction3).rejected) {
                    B(null, null, charSequence6, false, null, 11, null, this.j1, false);
                    this.N = null;
                    this.P = 0;
                    this.Q = null;
                    this.R = 0;
                    this.T = 0;
                }
            }
            int i12 = fjVar.D;
            if (i12 == 11) {
                float L = org.telegram.messenger.g0.L(19.0f) + this.P;
                float f10 = org.telegram.messenger.g0.u;
                this.J.y0((this.W - org.telegram.messenger.g0.u) / 2.0f, L, f10, f10);
            } else if (i12 == 25) {
                A();
            } else {
                TextPaint textPaint = this.G1;
                if (i12 == 30) {
                    TLRPC.User c22 = mp.u1(i11).c2(Long.valueOf(fj.B0(this.Q0.k)));
                    TLRPC.MessageAction messageAction4 = fjVar.k.action;
                    if (messageAction4 instanceof TLRPC.TL_messageActionGiftStars) {
                        B(gd.H(',', "ActionGiftStarsTitle", (int) ((TLRPC.TL_messageActionGiftStars) messageAction4).stars), null, org.telegram.messenger.g0.W2(this.Q0.P3() ? gd.a0(null, null, 2131754629, o10.l(c22)) : gd.M0(2131754628, null)), false, gd.M0(2131754624, null), 11, null, this.j1, true);
                    } else if ((messageAction4 instanceof TLRPC.TL_messageActionStarGiftUnique) && ((TLRPC.TL_messageActionStarGiftUnique) messageAction4).refunded) {
                        long e10 = j10.i(i11).e();
                        TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique = (TLRPC.TL_messageActionStarGiftUnique) fjVar.k.action;
                        if (fjVar.P3() != (!tL_messageActionStarGiftUnique.upgrade)) {
                            e10 = fj.B0(fjVar.k);
                        }
                        TLRPC.User c23 = mp.u1(i11).c2(Long.valueOf(e10));
                        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
                        spannableStringBuilder3.append((CharSequence) gd.M0(tL_messageActionStarGiftUnique.prepaid_upgrade ? 2131750412 : 2131750421, null)).append((CharSequence) " ");
                        if (c23 != null && c23.photo != null) {
                            spannableStringBuilder3.append((CharSequence) "a ");
                            org.telegram.ui.f5 f5Var = new org.telegram.ui.f5(18.0f, i11, this);
                            f5Var.e(c23);
                            spannableStringBuilder3.setSpan(f5Var, spannableStringBuilder3.length() - 2, spannableStringBuilder3.length() - 1, 33);
                        }
                        spannableStringBuilder3.append((CharSequence) o10.l(c23));
                        B(spannableStringBuilder3, null, gd.M0(2131750413, null), false, gd.M0(2131754624, null), 12, gd.M0(2131749878, null), this.j1, true);
                    } else if (messageAction4 instanceof TLRPC.TL_messageActionStarGift) {
                        TLRPC.TL_messageActionStarGift tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction4;
                        long j11 = tL_messageActionStarGift.convert_stars;
                        long e11 = j10.i(i11).e();
                        TLRPC.Peer peer2 = tL_messageActionStarGift.peer;
                        boolean z13 = peer2 != null && (!tL_messageActionStarGift.prepaid_upgrade || (peer2 instanceof TLRPC.TL_peerChannel));
                        boolean z14 = fj.B0(fjVar.k) == e11 && !z13;
                        long Z0 = fjVar.Z0();
                        if (!tL_messageActionStarGift.prepaid_upgrade && (peer = tL_messageActionStarGift.from_id) != null) {
                            Z0 = org.telegram.messenger.n5.o(peer);
                        }
                        SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder();
                        TLObject g22 = mp.u1(i11).g2(Z0);
                        long o4 = org.telegram.messenger.n5.o(tL_messageActionStarGift.to_id);
                        TLObject g23 = mp.u1(i11).g2(o4);
                        if (!tL_messageActionStarGift.can_upgrade || tL_messageActionStarGift.converted) {
                            z11 = z13;
                            j3 = o4;
                        } else {
                            z11 = z13;
                            j3 = o4;
                            if (tL_messageActionStarGift.upgrade_stars > 0 && !tL_messageActionStarGift.upgraded) {
                                z12 = true;
                                if (j3 == 0 && tL_messageActionStarGift.auction_acquired && g23 != null) {
                                    spannableStringBuilder4.append((CharSequence) gd.M0(2131750418, null)).append((CharSequence) " ");
                                    if (!(g23 instanceof TLRPC.User) ? !(!(g23 instanceof TLRPC.Chat) || ((TLRPC.Chat) g23).photo == null) : ((TLRPC.User) g23).photo != null) {
                                        spannableStringBuilder4.append((CharSequence) "a ");
                                        org.telegram.ui.f5 f5Var2 = new org.telegram.ui.f5(18.0f, i11, this);
                                        org.telegram.ui.Components.b9 b9Var = f5Var2.c;
                                        b9Var.p(g23);
                                        f5Var2.b.i0(g23, b9Var, null);
                                        spannableStringBuilder4.setSpan(f5Var2, spannableStringBuilder4.length() - 2, spannableStringBuilder4.length() - 1, 33);
                                    }
                                    spannableStringBuilder = spannableStringBuilder4;
                                    spannableStringBuilder.append((CharSequence) org.telegram.messenger.n5.u(g23));
                                    j10 = j11;
                                } else {
                                    spannableStringBuilder = spannableStringBuilder4;
                                    if (z14) {
                                        j10 = j11;
                                        spannableStringBuilder.append((CharSequence) gd.M0(tL_messageActionStarGift.prepaid_upgrade ? 2131750412 : 2131750421, null)).append((CharSequence) " ");
                                        if (!(g22 instanceof TLRPC.User) ? !(!(g22 instanceof TLRPC.Chat) || ((TLRPC.Chat) g22).photo == null) : ((TLRPC.User) g22).photo != null) {
                                            spannableStringBuilder.append((CharSequence) "a ");
                                            org.telegram.ui.f5 f5Var3 = new org.telegram.ui.f5(18.0f, i11, this);
                                            org.telegram.ui.Components.b9 b9Var2 = f5Var3.c;
                                            b9Var2.p(g22);
                                            f5Var3.b.i0(g22, b9Var2, null);
                                            spannableStringBuilder.setSpan(f5Var3, spannableStringBuilder.length() - 2, spannableStringBuilder.length() - 1, 33);
                                        }
                                        spannableStringBuilder.append((CharSequence) org.telegram.messenger.n5.u(g22));
                                    } else if (tL_messageActionStarGift.gift_num <= 0 || (starGift = tL_messageActionStarGift.gift) == null || (str = starGift.title) == null) {
                                        j10 = j11;
                                        spannableStringBuilder.append((CharSequence) gd.M0(2131750423, null));
                                    } else {
                                        j10 = j11;
                                        spannableStringBuilder.append((CharSequence) str).append((CharSequence) " #").append((CharSequence) gd.E(tL_messageActionStarGift.gift_num, ','));
                                    }
                                }
                                boolean z15 = !((fjVar.P3() || z14) && tL_messageActionStarGift.converted) && tL_messageActionStarGift.convert_stars > 0 && mp.u1(i11).H6 - (ConnectionsManager.getInstance(i11).getCurrentTime() - fjVar.k.date) > 0 && !tL_messageActionStarGift.refunded;
                                if (tL_messageActionStarGift.refunded) {
                                    TLRPC.TL_textWithEntities tL_textWithEntities = tL_messageActionStarGift.message;
                                    if (tL_textWithEntities != null && !TextUtils.isEmpty(tL_textWithEntities.text)) {
                                        SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder(tL_messageActionStarGift.message.text);
                                        textPaint.setTextSize(org.telegram.messenger.g0.L(13.0f));
                                        fj.a(spannableStringBuilder5, tL_messageActionStarGift.message.entities, false, true, true);
                                        W2 = fj.z5(textPaint.getFontMetricsInt(), org.telegram.messenger.j6.m(spannableStringBuilder5, textPaint.getFontMetricsInt(), false, null, 0), tL_messageActionStarGift.message.entities);
                                    } else if (tL_messageActionStarGift.auction_acquired) {
                                        W2 = gd.Z(2131750404, gd.E(tL_messageActionStarGift.gift.stars + tL_messageActionStarGift.upgrade_stars, ','));
                                    } else if (!z11) {
                                        long j12 = j10;
                                        if (z14) {
                                            W2 = (!tL_messageActionStarGift.converted || j12 <= 0) ? tL_messageActionStarGift.can_upgrade ? org.telegram.messenger.g0.W2(gd.L0(2131750426)) : org.telegram.messenger.g0.W2(gd.L0(2131750427)) : gd.I((int) j12, "Gift2ActionConvertedInfo");
                                        } else if (z12) {
                                            W2 = org.telegram.messenger.g0.W2(fjVar.P3() ? gd.Z(2131750414, o10.l(c22)) : gd.L0(2131750415));
                                        } else {
                                            W2 = fjVar.P3() ? (!z15 || j12 <= 0) ? tL_messageActionStarGift.can_upgrade ? org.telegram.messenger.g0.W2(gd.Z(2131750435, o10.l(c22))) : org.telegram.messenger.g0.W2(gd.Z(2131750436, o10.l(c22))) : org.telegram.messenger.g0.W2(gd.J((int) j12, "Gift2ActionOutInfo", o10.l(c22))) : tL_messageActionStarGift.converted ? gd.I((int) j12, "Gift2ActionConvertedInfo") : tL_messageActionStarGift.saved ? !z15 ? gd.L0(2131750450) : gd.L0(2131750429) : !z15 ? gd.L0(2131750451) : org.telegram.messenger.g0.W2(gd.I((int) j12, "Gift2ActionInfo"));
                                        }
                                    } else if (tL_messageActionStarGift.converted) {
                                        W2 = gd.I((int) j10, "Gift2ActionConvertedInfo");
                                    } else {
                                        long j13 = j10;
                                        W2 = (!z15 || j13 <= 0) ? org.telegram.messenger.g0.W2(gd.L0(2131750442)) : org.telegram.messenger.g0.W2(gd.I((int) j13, "Gift2ActionInfoChannel"));
                                    }
                                } else {
                                    W2 = gd.L0(2131750449);
                                }
                                CharSequence charSequence7 = W2;
                                starGift2 = tL_messageActionStarGift.gift;
                                if (starGift2 == null && starGift2.limited) {
                                    int i13 = starGift2.availability_total;
                                    str2 = gd.Z(2131750119, i13 > 1500 ? org.telegram.messenger.g0.o0(i13, 0) : Integer.valueOf(i13));
                                } else {
                                    str2 = null;
                                }
                                CharSequence L02 = gd.L0(2131754624);
                                if (fjVar.P3()) {
                                    charSequence5 = L02;
                                    if (!tL_messageActionStarGift.forceIn) {
                                    }
                                }
                                charSequence5 = L02;
                                charSequence5 = L02;
                                if (!fjVar.P3() && z12) {
                                    SpannableStringBuilder spannableStringBuilder6 = new SpannableStringBuilder();
                                    spannableStringBuilder6.append("^  ");
                                    lq lqVar = new lq(R.drawable.gift_unpack);
                                    lqVar.I = 0.8f;
                                    lqVar.J = 0.8f;
                                    spannableStringBuilder6.setSpan(lqVar, 0, 1, 33);
                                    spannableStringBuilder6.append(gd.L0(2131749869));
                                    charSequence5 = spannableStringBuilder6;
                                }
                                TL_stars.StarGift starGift3 = tL_messageActionStarGift.gift;
                                B(spannableStringBuilder, (starGift3 != null || starGift3.released_by == null || (r10 = org.telegram.messenger.n5.r(mp.u1(i11).g2(org.telegram.messenger.n5.o(tL_messageActionStarGift.gift.released_by)))) == null) ? null : di.f6.s2(gd.Z(2131750431, "@".concat(r10))), charSequence7, false, charSequence5, 11, str2, this.j1, true);
                            }
                        }
                        z12 = false;
                        if (j3 == 0) {
                        }
                        spannableStringBuilder = spannableStringBuilder4;
                        if (z14) {
                        }
                        if (fjVar.P3()) {
                        }
                        if (tL_messageActionStarGift.refunded) {
                        }
                        CharSequence charSequence72 = W2;
                        starGift2 = tL_messageActionStarGift.gift;
                        if (starGift2 == null) {
                        }
                        str2 = null;
                        CharSequence L022 = gd.L0(2131754624);
                        if (fjVar.P3()) {
                        }
                        charSequence5 = L022;
                        charSequence5 = L022;
                        if (!fjVar.P3()) {
                            SpannableStringBuilder spannableStringBuilder62 = new SpannableStringBuilder();
                            spannableStringBuilder62.append("^  ");
                            lq lqVar2 = new lq(R.drawable.gift_unpack);
                            lqVar2.I = 0.8f;
                            lqVar2.J = 0.8f;
                            spannableStringBuilder62.setSpan(lqVar2, 0, 1, 33);
                            spannableStringBuilder62.append(gd.L0(2131749869));
                            charSequence5 = spannableStringBuilder62;
                        }
                        TL_stars.StarGift starGift32 = tL_messageActionStarGift.gift;
                        B(spannableStringBuilder, (starGift32 != null || starGift32.released_by == null || (r10 = org.telegram.messenger.n5.r(mp.u1(i11).g2(org.telegram.messenger.n5.o(tL_messageActionStarGift.gift.released_by)))) == null) ? null : di.f6.s2(gd.Z(2131750431, "@".concat(r10))), charSequence72, false, charSequence5, 11, str2, this.j1, true);
                    } else if (messageAction4 instanceof TLRPC.TL_messageActionGiftTon) {
                        B(gd.L0(2131754622), null, this.Q0.v, false, gd.L0(2131754624), 11, null, this.j1, true);
                        this.N = null;
                        this.P = 0;
                        this.Q = null;
                        this.R = 0;
                        this.T = 0;
                    } else {
                        B(gd.L0(2131754551), null, this.Q0.v, false, gd.L0(2131754624), 11, null, this.j1, true);
                        this.N = null;
                        this.P = 0;
                        this.Q = null;
                        this.R = 0;
                        this.T = 0;
                    }
                } else {
                    if (i12 == 33) {
                        TLRPC.MessageAction messageAction5 = message3.action;
                        if (messageAction5 instanceof TLRPC.TL_messageActionStarGiftOnchainOffer) {
                            TLRPC.TL_messageActionStarGiftOnchainOffer tL_messageActionStarGiftOnchainOffer = (TLRPC.TL_messageActionStarGiftOnchainOffer) messageAction5;
                            HashMap hashMap = bi.f4.a;
                            this.e2 = Math.max(0, tL_messageActionStarGiftOnchainOffer.expires_at - ConnectionsManager.getInstance(i11).getCurrentTime());
                            HashMap hashMap2 = bi.f4.a;
                            ArrayList n10 = (tL_messageActionStarGiftOnchainOffer.accepted || tL_messageActionStarGiftOnchainOffer.settled) ? bi.f4.n(tL_messageActionStarGiftOnchainOffer) : new ArrayList();
                            if (!n10.isEmpty()) {
                                TextPaint textPaint2 = (TextPaint) R("paintChatActionText");
                                textPaint2.linkColor = textPaint2.getColor();
                                int L2 = (this.W - org.telegram.messenger.g0.L(30.0f)) - (this.j0 ? org.telegram.messenger.g0.L(64.0f) : 0);
                                if (L2 > 0) {
                                    arrayList3 = new ArrayList(n10.size());
                                    int size = n10.size();
                                    for (int i14 = 0; i14 < size; i14++) {
                                        arrayList3.add(new StaticLayout((CharSequence) n10.get(i14), textPaint2, L2, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false));
                                    }
                                    this.g2 = arrayList3;
                                    B(null, null, d0(bi.f4.c(tL_messageActionStarGiftOnchainOffer), tL_messageActionStarGiftOnchainOffer), false, this.d2 ? null : gd.L0(tL_messageActionStarGiftOnchainOffer.buyer ? 2131749552 : 2131749578), 11, null, this.j1, (this.d2 || tL_messageActionStarGiftOnchainOffer.buyer) ? false : true);
                                    this.N = null;
                                    this.P = 0;
                                    this.Q = null;
                                    this.R = 0;
                                    this.T = 0;
                                }
                            }
                            arrayList3 = null;
                            this.g2 = arrayList3;
                            if (this.d2) {
                            }
                            B(null, null, d0(bi.f4.c(tL_messageActionStarGiftOnchainOffer), tL_messageActionStarGiftOnchainOffer), false, this.d2 ? null : gd.L0(tL_messageActionStarGiftOnchainOffer.buyer ? 2131749552 : 2131749578), 11, null, this.j1, (this.d2 || tL_messageActionStarGiftOnchainOffer.buyer) ? false : true);
                            this.N = null;
                            this.P = 0;
                            this.Q = null;
                            this.R = 0;
                            this.T = 0;
                        }
                    }
                    if (i12 == 33) {
                        TLRPC.TL_messageActionStarGiftPurchaseOffer tL_messageActionStarGiftPurchaseOffer = (TLRPC.TL_messageActionStarGiftPurchaseOffer) message3.action;
                        SpannableStringBuilder spannableStringBuilder7 = new SpannableStringBuilder(charSequence6);
                        spannableStringBuilder7.append((CharSequence) "\n\n");
                        if (tL_messageActionStarGiftPurchaseOffer.accepted) {
                            spannableStringBuilder7.append((CharSequence) org.telegram.messenger.g0.W2(gd.L0(2131749678)));
                        } else if (tL_messageActionStarGiftPurchaseOffer.declined) {
                            spannableStringBuilder7.append((CharSequence) org.telegram.messenger.g0.W2(gd.L0(2131749675)));
                        } else {
                            int max = Math.max(0, tL_messageActionStarGiftPurchaseOffer.expires_at - ConnectionsManager.getInstance(i11).getCurrentTime());
                            if (max == 0) {
                                spannableStringBuilder7.append((CharSequence) org.telegram.messenger.g0.W2(gd.L0(2131749677)));
                            } else {
                                int i15 = max / 60;
                                int i16 = max / 3600;
                                if (i16 > 0) {
                                    StringBuilder sb2 = new StringBuilder();
                                    i7 = 0;
                                    sb2.append(gd.G(i16, "ShortHoursAgo", new Object[0]));
                                    sb2.append(" ");
                                    sb2.append(gd.G(i15 % 60, "ShortMinutesAgo", new Object[0]));
                                    G = sb2.toString();
                                } else {
                                    i7 = 0;
                                    G = gd.G(i15, "ShortMinutesAgo", new Object[0]);
                                }
                                if (G.endsWith(".")) {
                                    G = com.google.android.gms.internal.vision.e2.k(G, 1, i7);
                                }
                                Object[] objArr = new Object[1];
                                objArr[i7] = G;
                                spannableStringBuilder7.append((CharSequence) org.telegram.messenger.g0.W2(gd.Z(2131749676, objArr)));
                            }
                        }
                        B(null, null, spannableStringBuilder7, false, null, 11, null, this.j1, false);
                        this.N = null;
                        this.P = 0;
                        this.Q = null;
                        this.R = 0;
                        this.T = 0;
                    } else if (i12 == 34) {
                        B(null, null, charSequence6, false, null, 11, null, this.j1, false);
                        this.N = null;
                        this.P = 0;
                        this.Q = null;
                        this.R = 0;
                        this.T = 0;
                    } else if (i12 == 35) {
                        TLRPC.TL_messageActionNoForwardsRequest tL_messageActionNoForwardsRequest = (TLRPC.TL_messageActionNoForwardsRequest) message3.action;
                        SpannableStringBuilder spannableStringBuilder8 = new SpannableStringBuilder();
                        String u10 = org.telegram.messenger.n5.u(mp.u1(i11).c2(Long.valueOf(fjVar.A0())));
                        if (tL_messageActionNoForwardsRequest.new_value) {
                            spannableStringBuilder8.append(fjVar.N3() ? gd.L0(2131745185) : org.telegram.messenger.g0.W2(gd.Z(2131745188, u10)));
                        } else {
                            spannableStringBuilder8.append(fjVar.N3() ? gd.L0(2131745174) : org.telegram.messenger.g0.W2(gd.Z(2131745177, u10)));
                        }
                        if (tL_messageActionNoForwardsRequest.new_value) {
                            spannableStringBuilder8.append((CharSequence) "\n\n");
                            spannableStringBuilder8.append((CharSequence) F(gd.L0(2131745195)));
                            spannableStringBuilder8.append((CharSequence) "\n\n");
                            spannableStringBuilder8.append((CharSequence) F(gd.L0(2131745194)));
                            spannableStringBuilder8.append((CharSequence) "\n\n");
                            spannableStringBuilder8.append((CharSequence) F(gd.L0(2131745193)));
                            spannableStringBuilder8.append((CharSequence) "\n\n");
                            spannableStringBuilder8.append((CharSequence) F(gd.L0(2131745192)));
                        } else {
                            spannableStringBuilder8.append((CharSequence) "\n\n");
                            spannableStringBuilder8.append((CharSequence) F(gd.L0(2131745184)));
                            spannableStringBuilder8.append((CharSequence) "\n\n");
                            spannableStringBuilder8.append((CharSequence) F(gd.L0(2131745183)));
                            spannableStringBuilder8.append((CharSequence) "\n\n");
                            spannableStringBuilder8.append((CharSequence) F(gd.L0(2131745182)));
                            spannableStringBuilder8.append((CharSequence) "\n\n");
                            spannableStringBuilder8.append((CharSequence) F(gd.L0(2131745181)));
                        }
                        B(null, null, spannableStringBuilder8, false, null, 11, null, this.j1, false);
                        this.N = null;
                        this.P = 0;
                        this.Q = null;
                        this.R = 0;
                        this.T = 0;
                    } else if (i12 == 31) {
                        TL_stars.StarGift starGift4 = ((TLRPC.TL_chatThemeUniqueGift) ((TLRPC.TL_messageActionSetChatTheme) message3.action).theme).gift;
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(starGift4.title);
                        sb3.append(" #");
                        String l10 = i5.c.l(starGift4.num, ',', sb3);
                        long Z02 = fjVar.Z0();
                        B(null, null, org.telegram.messenger.g0.W2(j10.i(i11).e() == Z02 ? gd.Z(2131749422, l10) : gd.Z(2131749423, org.telegram.messenger.n5.s(i11, Z02), l10)), false, gd.L0(2131749424), 11, null, this.j1, true);
                        this.N = null;
                        this.P = 0;
                        this.Q = null;
                        this.R = 0;
                        this.T = 0;
                    } else if (i12 == 37) {
                        TLRPC.TL_messageActionChangeCommunity tL_messageActionChangeCommunity = (TLRPC.TL_messageActionChangeCommunity) message3.action;
                        long o10 = org.telegram.messenger.n5.o(message3.peer_id);
                        boolean U = org.telegram.messenger.v3.U(i11, -o10);
                        boolean z16 = o10 > 0;
                        String s5 = org.telegram.messenger.n5.s(i11, org.telegram.messenger.n5.o(fjVar.k.from_id));
                        String s9 = org.telegram.messenger.n5.s(i11, -tL_messageActionChangeCommunity.community_id);
                        SpannableStringBuilder spannableStringBuilder9 = new SpannableStringBuilder();
                        spannableStringBuilder9.append((CharSequence) li.l0.a(fjVar, s9, s5, U, z16));
                        B(null, null, spannableStringBuilder9, false, gd.L0(2131749424), 11, null, this.j1, true);
                        this.N = null;
                        this.P = 0;
                        this.Q = null;
                        this.R = 0;
                        this.T = 0;
                    } else if (i12 == 18) {
                        TLRPC.MessageAction messageAction6 = message3.action;
                        TLRPC.TL_textWithEntities tL_textWithEntities2 = messageAction6 instanceof TLRPC.TL_messageActionGiftPremium ? ((TLRPC.TL_messageActionGiftPremium) messageAction6).message : messageAction6 instanceof TLRPC.TL_messageActionGiftCode ? ((TLRPC.TL_messageActionGiftCode) messageAction6).message : null;
                        if (tL_textWithEntities2 == null || TextUtils.isEmpty(tL_textWithEntities2.text)) {
                            charSequence4 = null;
                        } else {
                            SpannableStringBuilder spannableStringBuilder10 = new SpannableStringBuilder(tL_textWithEntities2.text);
                            textPaint.setTextSize(org.telegram.messenger.g0.L(13.0f));
                            fj.a(spannableStringBuilder10, tL_textWithEntities2.entities, false, true, true);
                            charSequence4 = fj.z5(textPaint.getFontMetricsInt(), org.telegram.messenger.j6.m(spannableStringBuilder10, textPaint.getFontMetricsInt(), false, null, 0), tL_textWithEntities2.entities);
                        }
                        if (charSequence4 == null) {
                            charSequence4 = gd.L0(2131754639);
                        }
                        CharSequence charSequence8 = charSequence4;
                        fj fjVar3 = this.Q0;
                        CharSequence L03 = gd.L0((fjVar3 == null || !(fjVar3.k.action instanceof TLRPC.TL_messageActionGiftCode) || b0()) ? 2131754632 : 2131749488);
                        TLRPC.MessageAction messageAction7 = fjVar.k.action;
                        int i17 = messageAction7.months;
                        if (i17 >= 1) {
                            B(gd.I(i17, "ActionGiftPremiumTitle2"), null, charSequence8, true, L03, 11, null, this.j1, false);
                        } else {
                            B(gd.I(messageAction7.days, "ActionGiftPremiumTitle2Days"), null, charSequence8, true, L03, 11, null, this.j1, false);
                        }
                    } else if (i12 == 21) {
                        TLRPC.TL_messageActionSuggestProfilePhoto tL_messageActionSuggestProfilePhoto = (TLRPC.TL_messageActionSuggestProfilePhoto) message3.action;
                        TLRPC.User c24 = mp.u1(i11).c2(Long.valueOf(fjVar.P3() ? 0L : fjVar.A0()));
                        boolean z17 = tL_messageActionSuggestProfilePhoto.video || !((photo = tL_messageActionSuggestProfilePhoto.photo) == null || (arrayList2 = photo.video_sizes) == null || arrayList2.isEmpty());
                        if (c24.id == j10.i(i11).n) {
                            TLRPC.User c25 = mp.u1(i11).c2(Long.valueOf(fjVar.A0()));
                            Z = z17 ? gd.Z(2131754542, c25.first_name) : gd.Z(2131754546, c25.first_name);
                        } else {
                            Z = z17 ? gd.Z(2131754540, c24.first_name) : gd.Z(2131754544, c24.first_name);
                        }
                        B(null, null, Z, false, (tL_messageActionSuggestProfilePhoto.video || !((arrayList = tL_messageActionSuggestProfilePhoto.photo.video_sizes) == null || arrayList.isEmpty())) ? gd.L0(2131743302) : gd.L0(2131743310), 11, null, this.j1, true);
                        this.N = null;
                        this.P = 0;
                        this.Q = null;
                        this.R = 0;
                        this.T = 0;
                    } else if (i12 == 22) {
                        TLRPC.User c26 = mp.u1(i11).c2(Long.valueOf(fjVar.P3() ? 0L : fjVar.A0()));
                        if (fjVar.A0() < 0) {
                            charSequence3 = fjVar.v;
                        } else if (!fjVar.P3() && fjVar.Y4() && fjVar.S2()) {
                            charSequence2 = fjVar.v;
                            L0 = gd.L0(2131746091);
                            z10 = false;
                            B(null, null, charSequence2, false, L0, 11, null, this.j1, z10);
                            this.N = null;
                            this.P = 0;
                            this.Q = null;
                            this.R = 0;
                            this.T = 0;
                        } else if (c26 == null || c26.id != j10.i(i11).n) {
                            charSequence2 = fjVar.v;
                            L0 = gd.L0(2131743301);
                            z10 = true;
                            B(null, null, charSequence2, false, L0, 11, null, this.j1, z10);
                            this.N = null;
                            this.P = 0;
                            this.Q = null;
                            this.R = 0;
                            this.T = 0;
                        } else {
                            charSequence3 = fjVar.v;
                        }
                        charSequence2 = charSequence3;
                        L0 = null;
                        z10 = true;
                        B(null, null, charSequence2, false, L0, 11, null, this.j1, z10);
                        this.N = null;
                        this.P = 0;
                        this.Q = null;
                        this.R = 0;
                        this.T = 0;
                    } else if (fjVar.z4()) {
                        TLRPC.User c27 = mp.u1(i11).c2(Long.valueOf(fjVar.k.media.user_id));
                        B(null, null, c27.self ? org.telegram.messenger.g0.W2(gd.Z(2131744204, mp.u1(i11).c2(Long.valueOf(fjVar.A0())).first_name)) : org.telegram.messenger.g0.W2(gd.Z(2131744379, c27.first_name)), false, gd.L0(2131744380), 11, null, this.j1, true);
                        this.N = null;
                        this.P = 0;
                        this.Q = null;
                        this.R = 0;
                        this.T = 0;
                    }
                }
            }
        }
        int L3 = org.telegram.messenger.g0.L(12.0f);
        ch.q0 q0Var = this.F0;
        q0Var.b = L3;
        q0Var.o(this.W - org.telegram.messenger.g0.L(24.0f), 1);
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.K || super.verifyDrawable(drawable);
    }

    public final int w(Path path, StaticLayout staticLayout, int i7, int i10, boolean z10) {
        RectF rectF;
        ArrayList arrayList;
        int i11;
        int i12;
        int i13;
        int i14;
        ArrayList arrayList2;
        float f10;
        float f11;
        int i15;
        u0 u0Var = this;
        StaticLayout staticLayout2 = staticLayout;
        ArrayList arrayList3 = u0Var.Y0;
        arrayList3.clear();
        int lineCount = staticLayout2 == null ? 0 : staticLayout2.getLineCount();
        int L = org.telegram.messenger.g0.L(11.0f);
        int L2 = org.telegram.messenger.g0.L(8.0f);
        int i16 = 0;
        for (int i17 = 0; i17 < lineCount; i17 = com.google.android.gms.internal.vision.e2.f(i16, i17, 1, arrayList3)) {
            int ceil = (int) Math.ceil(staticLayout2.getLineWidth(i17));
            if (i17 == 0 || (i15 = i16 - ceil) <= 0 || i15 > (L * 1.5f) + L2) {
                i16 = ceil;
            }
        }
        for (int i18 = lineCount - 2; i18 >= 0; i18--) {
            int intValue = ((Integer) arrayList3.get(i18)).intValue();
            int i19 = i16 - intValue;
            if (i19 <= 0 || i19 > (L * 1.5f) + L2) {
                i16 = intValue;
            }
            arrayList3.set(i18, Integer.valueOf(i16));
        }
        int L3 = org.telegram.messenger.g0.L(3.0f);
        int L4 = org.telegram.messenger.g0.L(6.0f);
        int i20 = L - L3;
        ArrayList arrayList4 = u0Var.Z0;
        arrayList4.clear();
        path.reset();
        float f12 = i7;
        int i21 = i10;
        path.moveTo(f12, i21);
        int i22 = 0;
        int i23 = 0;
        while (true) {
            rectF = u0Var.d1;
            if (i22 >= lineCount) {
                break;
            }
            int intValue2 = ((Integer) arrayList3.get(i22)).intValue();
            int lineBottom = staticLayout2.getLineBottom(i22);
            int i24 = lineCount;
            int i25 = i24 - 1;
            if (i22 < i25) {
                i13 = L2;
                i14 = ((Integer) arrayList3.get(i22 + 1)).intValue();
            } else {
                i13 = L2;
                i14 = 0;
            }
            int i26 = lineBottom - i23;
            if (i22 == 0 || intValue2 > i16) {
                i26 = org.telegram.messenger.g0.L(3.0f) + i26;
            }
            if (i22 == i25 || intValue2 > i14) {
                i26 = org.telegram.messenger.g0.L(3.0f) + i26;
            }
            int i27 = L4;
            float f13 = (intValue2 / 2.0f) + f12;
            int i28 = (i22 == i25 || intValue2 >= i14 || i22 == 0 || intValue2 >= i16) ? i13 : i27;
            if (i22 == 0 || intValue2 > i16) {
                arrayList2 = arrayList3;
                f10 = f13;
                f11 = f12;
                rectF.set((f10 - L3) - L, i21, f10 + i20, (L * 2) + i21);
                if (z10) {
                    y();
                }
                path.arcTo(rectF, -90.0f, 90.0f);
            } else if (intValue2 < i16) {
                f10 = f13;
                float f14 = f10 + i20;
                f11 = f12;
                arrayList2 = arrayList3;
                rectF.set(f14, i21, (i28 * 2) + f14, r2 + i21);
                if (z10) {
                    y();
                }
                path.arcTo(rectF, -90.0f, -90.0f);
            } else {
                arrayList2 = arrayList3;
                f10 = f13;
                f11 = f12;
            }
            i21 += i26;
            if (i22 != i25 && intValue2 < i14) {
                i21 -= org.telegram.messenger.g0.L(3.0f);
                i26 -= org.telegram.messenger.g0.L(3.0f);
            }
            if (i22 != 0 && intValue2 < i16) {
                i21 -= org.telegram.messenger.g0.L(3.0f);
                i26 -= org.telegram.messenger.g0.L(3.0f);
            }
            arrayList4.add(Integer.valueOf(i26));
            if (i22 == i25 || intValue2 > i14) {
                rectF.set((f10 - L3) - L, i21 - (L * 2), f10 + i20, i21);
                if (z10) {
                    y();
                }
                path.arcTo(rectF, 0.0f, 90.0f);
            } else if (intValue2 < i14) {
                float f15 = f10 + i20;
                rectF.set(f15, i21 - r2, (i28 * 2) + f15, i21);
                if (z10) {
                    y();
                }
                path.arcTo(rectF, 180.0f, -90.0f);
            }
            i22++;
            staticLayout2 = staticLayout;
            i16 = intValue2;
            i23 = lineBottom;
            lineCount = i24;
            L2 = i13;
            L4 = i27;
            f12 = f11;
            arrayList3 = arrayList2;
            u0Var = this;
        }
        ArrayList arrayList5 = arrayList3;
        int i29 = L2;
        int i30 = L4;
        int i31 = lineCount - 1;
        int i32 = i31;
        while (i32 >= 0) {
            if (i32 != 0) {
                arrayList = arrayList5;
                i11 = ((Integer) arrayList.get(i32 - 1)).intValue();
            } else {
                arrayList = arrayList5;
                i11 = 0;
            }
            int intValue3 = ((Integer) arrayList.get(i32)).intValue();
            int intValue4 = i32 != i31 ? ((Integer) arrayList.get(i32 + 1)).intValue() : 0;
            staticLayout.getLineBottom(i32);
            float f16 = i7 - (intValue3 / 2);
            int i33 = (i32 == i31 || intValue3 >= intValue4 || i32 == 0 || intValue3 >= i11) ? i29 : i30;
            if (i32 == i31 || intValue3 > intValue4) {
                arrayList5 = arrayList;
                i12 = i31;
                rectF.set(f16 - i20, i21 - (L * 2), L3 + f16 + L, i21);
                if (z10) {
                    y();
                }
                path.arcTo(rectF, 90.0f, 90.0f);
            } else if (intValue3 < intValue4) {
                float f17 = f16 - i20;
                arrayList5 = arrayList;
                i12 = i31;
                rectF.set(f17 - (i33 * 2), i21 - r4, f17, i21);
                if (z10) {
                    y();
                }
                path.arcTo(rectF, 90.0f, -90.0f);
            } else {
                arrayList5 = arrayList;
                i12 = i31;
            }
            i21 -= ((Integer) arrayList4.get(i32)).intValue();
            if (i32 == 0 || intValue3 > i11) {
                rectF.set(f16 - i20, i21, f16 + L3 + L, (L * 2) + i21);
                if (z10) {
                    y();
                }
                path.arcTo(rectF, 180.0f, 90.0f);
            } else if (intValue3 < i11) {
                float f18 = f16 - i20;
                rectF.set(f18 - (i33 * 2), i21, f18, r15 + i21);
                if (z10) {
                    y();
                }
                path.arcTo(rectF, 0.0f, -90.0f);
            }
            i32--;
            i31 = i12;
        }
        path.close();
        return i21;
    }

    /* JADX WARN: Removed duplicated region for block: B:77:0x0369  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x036c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean x(MotionEvent motionEvent) {
        int i7;
        int i10;
        org.telegram.messenger.p2 p2Var;
        fj fjVar;
        TLRPC.Message message;
        fj fjVar2;
        TLRPC.Message message2;
        TLRPC.Message message3;
        char c10;
        int i11;
        long j3;
        TLObject O0;
        String str;
        Context context;
        boolean z10;
        String a02;
        SpannableStringBuilder W2;
        boolean z11;
        ArrayList arrayList = this.Y1;
        if (!arrayList.isEmpty()) {
            int x10 = (int) motionEvent.getX();
            int y10 = (int) motionEvent.getY();
            float width = (getWidth() - this.j1) / 2.0f;
            float f10 = 4.0f;
            float L = org.telegram.messenger.g0.L(4.0f) + org.telegram.messenger.g0.L(4.0f) + this.T + this.P + this.f;
            float L2 = (this.j1 - org.telegram.messenger.g0.L(4.0f)) / 2.0f;
            int action = motionEvent.getAction();
            org.telegram.ui.ActionBar.i6 i6Var = this.h1;
            if (action == 0) {
                this.u2 = -1;
                int i12 = 0;
                while (i12 < arrayList.size()) {
                    d0 d0Var = (d0) arrayList.get(i12);
                    float L3 = ((org.telegram.messenger.g0.L(f10) + L2) * i12) + width;
                    RectF rectF = org.telegram.messenger.g0.P;
                    rectF.set(L3, L, L3 + L2, d0Var.f + L);
                    float f11 = x10;
                    float f12 = y10;
                    if (rectF.contains(f11, f12)) {
                        this.u2 = i12;
                        X();
                        if (d0Var.s == null) {
                            y a03 = org.telegram.ui.ActionBar.n6.a0(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.ed, i6Var), 6, 6);
                            d0Var.s = a03;
                            a03.setCallback(this);
                        }
                        d0Var.s.setHotspot(f11, f12);
                        d0Var.s.setState(this.t2);
                        d0Var.b(!d0Var.m);
                        return true;
                    }
                    i12++;
                    f10 = 4.0f;
                }
            } else {
                int i13 = 3;
                if (motionEvent.getAction() == 1) {
                    if (this.u2 != -1) {
                        playSoundEffect(0);
                        d0 d0Var2 = (d0) arrayList.get(this.u2);
                        y yVar = d0Var2.s;
                        if (yVar != null) {
                            yVar.setState(StateSet.NOTHING);
                        }
                        d0Var2.b(false);
                        if (this.g1 == null || d0Var2.m || (p2Var = d0Var2.j) == null) {
                            i10 = -1;
                        } else {
                            if (getMessageObject() != null) {
                                int i14 = p2Var.a;
                                if (i14 == 5) {
                                    r0 r0Var = this.g1;
                                    org.telegram.ui.ActionBar.h2 G = r0Var != null ? r0Var.G() : null;
                                    if (G != null && this.Q0 != null) {
                                        org.telegram.ui.Components.b5.s0(G, gd.M0(2131749690, null), org.telegram.messenger.g0.W2(gd.a0(null, null, 2131749691, org.telegram.messenger.n5.t(fj.B0(this.Q0.k)))), gd.M0(2131749692, null), true, new fa(i13, this, G));
                                    }
                                } else if (i14 == 6) {
                                    fj fjVar3 = this.Q0;
                                    if (fjVar3 != null && (message3 = fjVar3.k) != null) {
                                        TLRPC.MessageAction messageAction = message3.action;
                                        if (messageAction instanceof TLRPC.TL_messageActionStarGiftPurchaseOffer) {
                                            TLRPC.TL_messageActionStarGiftPurchaseOffer tL_messageActionStarGiftPurchaseOffer = (TLRPC.TL_messageActionStarGiftPurchaseOffer) messageAction;
                                            org.telegram.ui.ActionBar.h2 Q = LaunchActivity.Q();
                                            Context context2 = getContext();
                                            long B0 = fj.B0(this.Q0.k);
                                            int e12 = this.Q0.e1();
                                            int[] iArr = di.o0.H1;
                                            cg.a n10 = cg.a.n(tL_messageActionStarGiftPurchaseOffer.price);
                                            cg.b bVar = n10.a;
                                            int i15 = this.I;
                                            cg.b bVar2 = cg.b.a;
                                            if (bVar == bVar2) {
                                                c10 = 3;
                                                i11 = ((org.telegram.messenger.j0) mp.u1(i15).A7.n.b).c;
                                            } else {
                                                c10 = 3;
                                                i11 = ((org.telegram.messenger.j0) mp.u1(i15).A7.o.b).c;
                                            }
                                            cg.a j10 = cg.a.j((n10.b * i11) / 1000, bVar);
                                            TL_stars.StarGift starGift = tL_messageActionStarGiftPurchaseOffer.gift;
                                            StringBuilder sb2 = new StringBuilder();
                                            sb2.append(starGift.title);
                                            sb2.append(" #");
                                            String l10 = i5.c.l(starGift.num, ',', sb2);
                                            if (B0 >= 0) {
                                                j3 = 0;
                                                O0 = mp.u1(i15).c2(Long.valueOf(B0));
                                            } else {
                                                j3 = 0;
                                                O0 = mp.u1(i15).O0(Long.valueOf(-B0));
                                            }
                                            String d = n10.d();
                                            String d2 = j10.d();
                                            if (bVar == cg.b.b) {
                                                str = l10;
                                                context = context2;
                                                z10 = true;
                                            } else {
                                                str = l10;
                                                context = context2;
                                                z10 = false;
                                            }
                                            LinearLayout g10 = org.telegram.messenger.f3.g(context, 1);
                                            g10.addView(new di.d5(context, starGift, O0), c8.ma.t(-1, -2, 48, 0, -4, 0, 0));
                                            TextView textView = new TextView(context);
                                            org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.j5, i6Var);
                                            textView.setTextSize(1, 16.0f);
                                            if (bVar == bVar2) {
                                                String t6 = org.telegram.messenger.n5.t(B0);
                                                Object[] objArr = new Object[4];
                                                objArr[0] = d;
                                                objArr[1] = t6;
                                                objArr[2] = str;
                                                objArr[c10] = d2;
                                                a02 = gd.a0(null, null, 2131749668, objArr);
                                            } else {
                                                String t10 = org.telegram.messenger.n5.t(B0);
                                                Object[] objArr2 = new Object[4];
                                                objArr2[0] = d;
                                                objArr2[1] = t10;
                                                objArr2[2] = str;
                                                objArr2[c10] = d2;
                                                a02 = gd.a0(null, null, 2131749667, objArr2);
                                            }
                                            textView.setText(org.telegram.messenger.g0.W2(a02));
                                            g10.addView(textView, c8.ma.t(-1, -2, 48, 24, 4, 24, 4));
                                            FrameLayout frameLayout = new FrameLayout(context);
                                            frameLayout.setClipChildren(false);
                                            frameLayout.setClipToPadding(false);
                                            cy0 cy0Var = new cy0(context, i6Var);
                                            frameLayout.addView(cy0Var, c8.ma.e(-1, -1, ks.E1));
                                            di.f6.m1(cy0Var, di.x8.l(starGift.attributes, TL_stars.starGiftAttributeModel.class));
                                            di.f6.m1(cy0Var, di.x8.l(starGift.attributes, TL_stars.starGiftAttributeBackdrop.class));
                                            di.f6.m1(cy0Var, di.x8.l(starGift.attributes, TL_stars.starGiftAttributePattern.class));
                                            g10.addView(frameLayout, c8.ma.t(-1, -2, 48, 23, 16, 23, 4));
                                            cg.a k10 = cg.a.k(starGift.value_usd_amount / Math.pow(10.0d, org.telegram.messenger.r1.i().h("USD")), bVar);
                                            if (k10.c() > 0.0d && starGift.value_usd_amount > j3) {
                                                if (k10.b >= j10.b) {
                                                    int round = (int) Math.round((1.0d - (j10.c() / k10.c())) * 100.0d);
                                                    W2 = org.telegram.messenger.g0.W2(gd.a0(null, null, 2131749717, com.google.android.gms.internal.vision.e2.i(round, "%"), starGift.title));
                                                    if (round > 10) {
                                                        z11 = true;
                                                        TextView textView2 = new TextView(context);
                                                        textView2.setTextSize(1, 13.0f);
                                                        textView2.setGravity(17);
                                                        textView2.setText(W2);
                                                        org.telegram.ui.ActionBar.u6.U(textView2, !z11 ? org.telegram.ui.ActionBar.n6.p7 : org.telegram.ui.ActionBar.n6.y6, i6Var);
                                                        g10.addView(textView2, c8.ma.t(-1, -2, 49, 40, 12, 40, 9));
                                                    }
                                                } else {
                                                    W2 = org.telegram.messenger.g0.W2(gd.a0(null, null, 2131749720, com.google.android.gms.internal.vision.e2.i((int) Math.round(((j10.c() / k10.c()) - 1.0d) * 100.0d), "%"), starGift.title));
                                                }
                                                z11 = false;
                                                TextView textView22 = new TextView(context);
                                                textView22.setTextSize(1, 13.0f);
                                                textView22.setGravity(17);
                                                textView22.setText(W2);
                                                org.telegram.ui.ActionBar.u6.U(textView22, !z11 ? org.telegram.ui.ActionBar.n6.p7 : org.telegram.ui.ActionBar.n6.y6, i6Var);
                                                g10.addView(textView22, c8.ma.t(-1, -2, 49, 40, 12, 40, 9));
                                            }
                                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, i6Var);
                                            alertDialog$Builder.o(g10);
                                            alertDialog$Builder.k(pb.V0(gd.a0(null, null, 2131749685, d2), z10), new di.i0(e12, i15, Q));
                                            alertDialog$Builder.h(gd.M0(2131752578, null), null);
                                            alertDialog$Builder.a.show();
                                        }
                                    }
                                } else {
                                    if (i14 == 7) {
                                        r0 r0Var2 = this.g1;
                                        org.telegram.ui.ActionBar.h2 G2 = r0Var2 != null ? r0Var2.G() : null;
                                        if (G2 != null && (fjVar2 = this.Q0) != null && (message2 = fjVar2.k) != null) {
                                            TLRPC.MessageAction messageAction2 = message2.action;
                                            if (messageAction2 instanceof TLRPC.TL_messageActionNoForwardsRequest) {
                                                final TLRPC.TL_messageActionNoForwardsRequest tL_messageActionNoForwardsRequest = (TLRPC.TL_messageActionNoForwardsRequest) messageAction2;
                                                final int i16 = 0;
                                                org.telegram.ui.Components.b5.s0(G2, gd.M0(tL_messageActionNoForwardsRequest.prev_value ? 2131745190 : 2131745179, null), gd.M0(tL_messageActionNoForwardsRequest.prev_value ? 2131745191 : 2131745180, null), gd.M0(2131745196, null), false, new Runnable(this) { // from class: org.telegram.ui.Cells.o0
                                                    public final /* synthetic */ u0 b;

                                                    {
                                                        this.b = this;
                                                    }

                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        switch (i16) {
                                                            case 0:
                                                                u0 u0Var = this.b;
                                                                mp.u1(u0Var.I).p5(fj.B0(u0Var.Q0.k), u0Var.Q0.e1(), tL_messageActionNoForwardsRequest.prev_value, null);
                                                                break;
                                                            default:
                                                                u0 u0Var2 = this.b;
                                                                mp.u1(u0Var2.I).p5(fj.B0(u0Var2.Q0.k), u0Var2.Q0.e1(), tL_messageActionNoForwardsRequest.new_value, null);
                                                                break;
                                                        }
                                                    }
                                                });
                                            }
                                        }
                                    } else if (i14 == 8) {
                                        r0 r0Var3 = this.g1;
                                        org.telegram.ui.ActionBar.h2 G3 = r0Var3 != null ? r0Var3.G() : null;
                                        if (G3 != null && (fjVar = this.Q0) != null && (message = fjVar.k) != null) {
                                            TLRPC.MessageAction messageAction3 = message.action;
                                            if (messageAction3 instanceof TLRPC.TL_messageActionNoForwardsRequest) {
                                                final TLRPC.TL_messageActionNoForwardsRequest tL_messageActionNoForwardsRequest2 = (TLRPC.TL_messageActionNoForwardsRequest) messageAction3;
                                                final int i17 = 1;
                                                org.telegram.ui.Components.b5.s0(G3, gd.M0(tL_messageActionNoForwardsRequest2.new_value ? 2131745190 : 2131745179, null), gd.M0(tL_messageActionNoForwardsRequest2.new_value ? 2131745189 : 2131745178, null), gd.M0(2131745196, null), false, new Runnable(this) { // from class: org.telegram.ui.Cells.o0
                                                    public final /* synthetic */ u0 b;

                                                    {
                                                        this.b = this;
                                                    }

                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        switch (i17) {
                                                            case 0:
                                                                u0 u0Var = this.b;
                                                                mp.u1(u0Var.I).p5(fj.B0(u0Var.Q0.k), u0Var.Q0.e1(), tL_messageActionNoForwardsRequest2.prev_value, null);
                                                                break;
                                                            default:
                                                                u0 u0Var2 = this.b;
                                                                mp.u1(u0Var2.I).p5(fj.B0(u0Var2.Q0.k), u0Var2.Q0.e1(), tL_messageActionNoForwardsRequest2.new_value, null);
                                                                break;
                                                        }
                                                    }
                                                });
                                            }
                                        }
                                    }
                                }
                            }
                            i10 = -1;
                        }
                        this.u2 = i10;
                        X();
                        return false;
                    }
                } else if (motionEvent.getAction() == 3 && (i7 = this.u2) != -1) {
                    d0 d0Var3 = (d0) arrayList.get(i7);
                    y yVar2 = d0Var3.s;
                    if (yVar2 != null) {
                        yVar2.setState(StateSet.NOTHING);
                    }
                    d0Var3.b(false);
                    this.u2 = -1;
                    X();
                    return false;
                }
            }
        }
        return false;
    }

    public final void y() {
        float f10 = this.b1;
        RectF rectF = this.d1;
        this.b1 = (int) Math.min(f10, rectF.left);
        this.c1 = (int) Math.max(this.c1, rectF.right);
    }

    public final boolean z(float f10, int i7) {
        ch.q0 q0Var = this.F0;
        if (!q0Var.H) {
            return false;
        }
        float y10 = getY() + q0Var.c;
        return y10 > f10 && (y10 + ((float) q0Var.m)) - ((float) org.telegram.messenger.g0.L(16.0f)) < ((float) i7);
    }

    public u0(Context context, org.telegram.ui.ActionBar.i6 i6Var, boolean z10) {
        super(context);
        this.n = new mc(this);
        int i7 = j10.t0;
        this.I = i7;
        fi.e7 e7Var = new fi.e7(null, false);
        this.e0 = e7Var;
        this.n0 = true;
        this.p0 = new RectF();
        this.q0 = new ArrayList();
        this.r0 = new Stack();
        this.F0 = new ch.q0(this);
        this.O0 = new RectF();
        this.U0 = -1;
        this.V0 = -1;
        this.Y0 = new ArrayList();
        this.Z0 = new ArrayList();
        this.a1 = new Path();
        this.d1 = new RectF();
        this.e1 = true;
        this.f1 = false;
        this.o1 = false;
        this.p1 = false;
        this.r1 = new org.telegram.ui.Components.c6(this, 0L, 320L, lr.h);
        this.z1 = true;
        TextPaint textPaint = new TextPaint(1);
        this.F1 = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.G1 = textPaint2;
        TextPaint textPaint3 = new TextPaint(1);
        this.H1 = textPaint3;
        this.K1 = new RadialProgress2(this, null);
        this.O1 = new da(this, 2);
        this.V1 = new Path();
        this.Y1 = new ArrayList();
        this.b2 = -1;
        this.e2 = -1;
        this.h2 = new ArrayList();
        this.l2 = new Paint(1);
        this.p2 = new Path();
        this.q2 = new float[8];
        this.r2 = new float[8];
        this.s2 = new Path();
        this.t2 = new int[]{android.R.attr.state_enabled, android.R.attr.state_pressed};
        this.A2 = new t0(this);
        e7Var.a = false;
        this.s = z10;
        this.h1 = i6Var;
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.J = imageReceiver;
        imageReceiver.J0(org.telegram.messenger.g0.u / 2);
        this.M = new org.telegram.ui.Components.b9((org.telegram.ui.ActionBar.i6) null);
        this.x = org.telegram.messenger.a6.q(i7).k();
        textPaint.setTextSize(TypedValue.applyDimension(1, 16.0f, getResources().getDisplayMetrics()));
        textPaint3.setTextSize(TypedValue.applyDimension(1, 15.0f, getResources().getDisplayMetrics()));
        textPaint2.setTextSize(TypedValue.applyDimension(1, 15.0f, getResources().getDisplayMetrics()));
        View view = new View(context);
        this.U1 = view;
        view.setBackground(org.telegram.ui.ActionBar.n6.h0(org.telegram.ui.ActionBar.n6.r1(0.1f, -16777216), 7, org.telegram.messenger.g0.L(16.0f)));
        view.setVisibility(8);
        addView(view);
        ug.t1 t1Var = new ug.t1(10);
        this.W1 = t1Var;
        t1Var.O = 100;
        t1Var.J = false;
        t1Var.M = true;
        t1Var.G = false;
        t1Var.K = true;
        t1Var.H = true;
        t1Var.r = 1;
        t1Var.w = 0.98f;
        t1Var.v = 0.98f;
        t1Var.u = 0.98f;
        t1Var.g = false;
        t1Var.o = 0.0f;
        t1Var.x = 750L;
        t1Var.y = 750;
        t1Var.c();
    }

    @Override // android.view.View
    public final void invalidate(Rect rect) {
        super.invalidate(rect);
        View view = this.w;
        if (view != null) {
            view.invalidate();
        }
        if (!this.w2 || getParent() == null) {
            return;
        }
        View view2 = (View) getParent();
        if (view2.getParent() != null) {
            view2.invalidate();
            ((View) view2.getParent()).invalidate();
        }
    }

    @Override // android.view.View
    public final void invalidate(int i7, int i10, int i11, int i12) {
        super.invalidate(i7, i10, i11, i12);
        View view = this.w;
        if (view != null) {
            view.invalidate();
        }
        if (!this.w2 || getParent() == null) {
            return;
        }
        View view2 = (View) getParent();
        if (view2.getParent() != null) {
            view2.invalidate();
            ((View) view2.getParent()).invalidate();
        }
    }

    @Override // org.telegram.messenger.y5
    public final void C(boolean z10) {
    }

    @Override // org.telegram.ui.Cells.p4
    public final /* synthetic */ void c(boolean z10, boolean z11) {
    }

    @Override // org.telegram.messenger.y5
    public final void i(long j3, long j10) {
    }

    @Override // org.telegram.messenger.y5
    public final void o(long j3, long j10) {
    }
}
