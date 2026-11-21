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
import android.os.SystemClock;
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
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.ey0;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.nq;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.oh0;
import org.telegram.ui.Components.q80;
import org.telegram.ui.Components.s01;
import org.telegram.ui.Components.s41;
import org.telegram.ui.Components.vw0;
import org.telegram.ui.Components.x30;
import org.telegram.ui.Components.xy0;
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

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public class v0 extends z implements org.telegram.messenger.y5, fs, q4 {
    public static final HashMap y2;
    public float A0;
    public TextPaint A1;
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
    public final ea O1;
    public int P;
    public vw0 P0;
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
    public bi.c3 T0;
    public xy0 T1;
    public int U;
    public int U0;
    public final View U1;
    public int V;
    public int V0;
    public final Path V1;
    public int W;
    public Paint W0;
    public final ug.s1 W1;
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
    public boolean f2;
    public boolean g0;
    public s0 g1;
    public bi.j3 g2;
    public int h;
    public boolean h0;
    public final org.telegram.ui.ActionBar.h6 h1;
    public float h2;
    public boolean i0;
    public int i1;
    public final Paint i2;
    public boolean j0;
    public int j1;
    public boolean j2;
    public int k0;
    public StaticLayout k1;
    public View.OnClickListener k2;
    public boolean l0;
    public Paint l1;
    public int l2;
    public int m0;
    public xy0 m1;
    public final Path m2;
    public final mc n;
    public boolean n0;
    public StaticLayout n1;
    public final float[] n2;
    public s01 o0;
    public boolean o1;
    public final float[] o2;
    public final RectF p0;
    public boolean p1;
    public final Path p2;
    public final ArrayList q0;
    public int q1;
    public final int[] q2;
    public q80 r;
    public final Stack r0;
    public final org.telegram.ui.Components.d6 r1;
    public int r2;
    public final boolean s;
    public org.telegram.ui.Components.u5 s0;
    public h6.m s1;
    public SpannableStringBuilder s2;
    public TextPaint t0;
    public t0 t1;
    public boolean t2;
    public float u0;
    public int u1;
    public Runnable u2;
    public float v0;
    public int v1;
    public PorterDuffColorFilter v2;
    public View w;
    public int w0;
    public int w1;
    public int w2;
    public final int x;
    public boolean x0;
    public xy0 x1;
    public final u0 x2;
    public URLSpan y;
    public fc y0;
    public StaticLayout y1;
    public float z0;
    public boolean z1;

    static {
        HashMap hashMap = new HashMap();
        y2 = hashMap;
        i5.c.u(1, hashMap, "1⃣", 3, "2⃣");
        i5.c.u(6, hashMap, "3⃣", 12, "4⃣");
        hashMap.put(24, "5⃣");
    }

    public v0(Context context) {
        this(context, null, false);
    }

    public static SpannableStringBuilder E(String str) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.g0.J2(str, false, org.telegram.messenger.g0.L(6.0f), -org.telegram.messenger.g0.L(1.3f), 0.8f, R.drawable.floating_check));
        spannableStringBuilder.insert(0, (CharSequence) "*");
        spannableStringBuilder.setSpan(new s2(org.telegram.messenger.g0.L(18.0f)), 0, 1, 33);
        if (Build.VERSION.SDK_INT >= 29) {
            android.support.v4.media.session.w.l();
            spannableStringBuilder.setSpan(android.support.v4.media.session.w.g(org.telegram.messenger.g0.L(12.0f)), 0, spannableStringBuilder.length(), 33);
        }
        spannableStringBuilder.setSpan(new AlignmentSpan.Standard(Layout.Alignment.ALIGN_NORMAL), 0, spannableStringBuilder.length(), 33);
        return spannableStringBuilder;
    }

    public static float a0(StaticLayout staticLayout) {
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
        ug.s1 s1Var = this.W1;
        if (z10 == s1Var.g) {
            return;
        }
        s1Var.g = z10;
        if (z10) {
            s1Var.R = System.currentTimeMillis();
            return;
        }
        for (int i7 = 0; i7 < s1Var.n.size(); i7++) {
            ug.r1 r1Var = (ug.r1) s1Var.n.get(i7);
            r1Var.a = (System.currentTimeMillis() - s1Var.R) + r1Var.a;
        }
        invalidate();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v7 */
    public final void A(CharSequence charSequence, SpannableStringBuilder spannableStringBuilder, CharSequence charSequence2, boolean z10, CharSequence charSequence3, int i7, String str, int i10, boolean z11) {
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
            valueOf.setSpan(new l41(org.telegram.messenger.g0.o()), 0, valueOf.length(), 33);
            r42 = 0;
            this.k1 = new StaticLayout(valueOf, textPaint, i12, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
        } else {
            r42 = 0;
            this.k1 = null;
        }
        this.n1 = null;
        if (spannableStringBuilder != null) {
            xy0 xy0Var = new xy0(spannableStringBuilder, 10.0f, null);
            this.m1 = xy0Var;
            xy0Var.a.linkColor = -1;
        } else {
            this.m1 = null;
        }
        TLRPC.TL_messageActionStarGiftOnchainOffer tL_messageActionStarGiftOnchainOffer = this.c2;
        TextPaint textPaint2 = this.G1;
        if (tL_messageActionStarGiftOnchainOffer != null) {
            textPaint2.setTextSize(P("paintChatActionText").getTextSize());
        } else {
            fj fjVar3 = this.Q0;
            if (fjVar3 != null && fjVar3.D == 35) {
                textPaint2.setTextSize(org.telegram.messenger.g0.L(14.3f));
            } else if (fjVar3 == null || !(Y() || (i11 = this.Q0.D) == 30 || i11 == 18 || i11 == 31 || i11 == 37 || i11 == 33)) {
                textPaint2.setTextSize(org.telegram.messenger.g0.L(15.0f));
            } else {
                textPaint2.setTextSize(org.telegram.messenger.g0.L(13.0f));
            }
        }
        int L2 = i12 - org.telegram.messenger.g0.L(12.0f);
        fj fjVar4 = this.Q0;
        if (fjVar4 != null && fjVar4.D == 22 && fj.B0(fjVar4.k) >= 0 && (a10 = hi.l3.a(charSequence4, textPaint2)) < L2 && a10 > L2 / 5.0f) {
            L2 = a10;
        }
        if (charSequence4 == 0) {
            t0 t0Var = this.t1;
            if (t0Var != null) {
                org.telegram.ui.Components.y5.release((v0) t0Var.i, (org.telegram.ui.Components.u5) t0Var.h);
                this.t1 = null;
            }
            this.p1 = r42;
        } else {
            if (this.t1 == null) {
                this.t1 = new t0(this);
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
                this.x1 = new xy0(gd.N0(2131750248, null), textPaint2.getTextSize() / org.telegram.messenger.g0.p, org.telegram.messenger.g0.o());
                int lineBottom = ((StaticLayout) this.t1.f).getLineBottom(2);
                this.v1 = lineBottom;
                this.w1 = lineBottom - ((StaticLayout) this.t1.f).getLineTop(2);
                this.u1 = (int) ((StaticLayout) this.t1.f).getLineRight(2);
            }
            if (this.p1) {
                int lineEnd = ((StaticLayout) this.t1.f).getLineEnd(2) - 1;
                t0 t0Var2 = this.t1;
                CharSequence charSequence5 = charSequence4;
                if (lineEnd >= 0) {
                    charSequence5 = charSequence4.subSequence(r42, lineEnd);
                }
                t0Var2.a(charSequence5, textPaint2, L2);
            }
        }
        if (charSequence3 != null) {
            SpannableStringBuilder valueOf2 = SpannableStringBuilder.valueOf(charSequence3);
            valueOf2.setSpan(new l41(org.telegram.messenger.g0.o()), r42, valueOf2.length(), 33);
            StaticLayout staticLayout = new StaticLayout(valueOf2, (TextPaint) P("paintChatActionText"), i12, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
            this.y1 = staticLayout;
            this.z1 = (!z11 || this.p1) ? r42 : true;
            this.E1 = a0(staticLayout);
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
            bi.j3.d(path, 1.35f, r42);
        }
        xy0 xy0Var2 = new xy0(str, i7, org.telegram.messenger.g0.o());
        this.T1 = xy0Var2;
        xy0Var2.p = org.telegram.messenger.g0.L(62.0f);
    }

    public final void B(int i7, CharSequence charSequence) {
        CharSequence charSequence2;
        s0 s0Var;
        TLRPC.Message message;
        fj fjVar;
        int i10;
        int L = i7 - org.telegram.messenger.g0.L(30.0f);
        if (this.j0) {
            L -= org.telegram.messenger.g0.L(64.0f);
        }
        if (X()) {
            L = Math.min(L - org.telegram.messenger.g0.L(this.j0 ? 28.0f : 82.0f), org.telegram.messenger.g0.L(272.0f));
        }
        if (L < 0) {
            return;
        }
        int i11 = this.l2;
        if (i11 > 0) {
            L = Math.min(i11, L);
        }
        int i12 = L;
        this.e1 = true;
        TextPaint textPaint = (X() || ((fjVar = this.Q0) != null && ((i10 = fjVar.D) == 34 || i10 == 35))) ? (TextPaint) P("paintChatActionText3") : (fjVar == null || !fjVar.s2) ? (TextPaint) P("paintChatActionText") : (TextPaint) P("paintChatActionText2");
        textPaint.linkColor = textPaint.getColor();
        if (X()) {
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
        this.N = new StaticLayout(charSequence2, textPaint2, i12, X() ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
        this.Q = null;
        fj fjVar2 = this.Q0;
        if (fjVar2 != null && (message = fjVar2.k) != null) {
            TLRPC.MessageAction messageAction = message.action;
            if (messageAction instanceof TLRPC.TL_messageActionSuggestedPostApproval) {
                TLRPC.TL_messageActionSuggestedPostApproval tL_messageActionSuggestedPostApproval = (TLRPC.TL_messageActionSuggestedPostApproval) messageAction;
                if (!tL_messageActionSuggestedPostApproval.rejected && !tL_messageActionSuggestedPostApproval.balance_too_low) {
                    this.Q = new StaticLayout(org.telegram.messenger.j6.n(org.telegram.messenger.g0.W2(gd.N0(2131744125, null)), textPaint2.getFontMetricsInt(), false, null, 0, 1.0f, 0), textPaint2, i12, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                }
            }
        }
        this.s0 = org.telegram.ui.Components.y5.update(0, this, (!this.s || (s0Var = this.g1) == null || s0Var.h()) ? false : true, this.s0, this.N);
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
        this.U = (i7 - (X() ? this.O : this.N.getWidth())) / 2;
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

    public final void F(Canvas canvas, boolean z10) {
        v0 v0Var;
        Paint paint;
        Paint paint2;
        org.telegram.ui.ActionBar.h6 h6Var;
        float f10;
        float f11;
        float f12;
        float f13;
        org.telegram.ui.ActionBar.h6 h6Var2;
        Paint paint3;
        Paint paint4;
        int i7;
        int i10;
        Canvas canvas2;
        float f14;
        float f15;
        float f16;
        int i11;
        t0 t0Var;
        int L;
        RectF rectF;
        ArrayList arrayList;
        int i12;
        int i13;
        Paint paint5;
        int i14;
        float f17;
        StaticLayout staticLayout;
        ArrayList arrayList2;
        int i15;
        int i16;
        int i17;
        int i18;
        v0 v0Var2 = this;
        if (!v0Var2.s || ((!v0Var2.R() || z10) && (v0Var2.R() || !z10))) {
            Paint P = v0Var2.P("paintChatActionBackground");
            Paint P2 = v0Var2.P("paintChatActionBackgroundDarken");
            v0Var2.t0 = (TextPaint) v0Var2.P("paintChatActionText");
            int i19 = v0Var2.U0;
            org.telegram.ui.ActionBar.h6 h6Var3 = v0Var2.h1;
            if (i19 >= 0) {
                int w02 = org.telegram.ui.ActionBar.m6.w0(i19, h6Var3);
                if (v0Var2.W0 == null) {
                    Paint paint6 = new Paint(1);
                    v0Var2.W0 = paint6;
                    paint6.setColor(w02);
                    TextPaint textPaint = new TextPaint(1);
                    v0Var2.X0 = textPaint;
                    textPaint.setTypeface(org.telegram.messenger.g0.o());
                    v0Var2.X0.setTextSize(org.telegram.messenger.g0.L(Math.max(16, bz.W0) - 2));
                    v0Var2.X0.setColor(org.telegram.ui.ActionBar.m6.w0(v0Var2.V0, h6Var3));
                }
                P = v0Var2.W0;
                v0Var2.t0 = v0Var2.X0;
            }
            boolean z11 = v0Var2.e1;
            Path path = v0Var2.a1;
            if (z11) {
                v0Var2.e1 = false;
                v0Var2.b1 = v0Var2.getWidth();
                v0Var2.c1 = 0;
                StaticLayout staticLayout2 = v0Var2.N;
                int measuredWidth = v0Var2.getMeasuredWidth() / 2;
                int L2 = org.telegram.messenger.g0.L(4.0f);
                f11 = 6.0f;
                ArrayList arrayList3 = v0Var2.Y0;
                arrayList3.clear();
                int lineCount = staticLayout2 == null ? 0 : staticLayout2.getLineCount();
                f12 = 8.0f;
                int L3 = org.telegram.messenger.g0.L(11.0f);
                f10 = 4.0f;
                int L4 = org.telegram.messenger.g0.L(8.0f);
                int i20 = 0;
                f13 = 2.0f;
                int i21 = 0;
                while (i20 < lineCount) {
                    org.telegram.ui.ActionBar.h6 h6Var4 = h6Var3;
                    int ceil = (int) Math.ceil(staticLayout2.getLineWidth(i20));
                    if (i20 == 0 || (i18 = i21 - ceil) <= 0) {
                        i16 = ceil;
                    } else {
                        i16 = ceil;
                        if (i18 <= (L3 * 1.5f) + L4) {
                            i17 = i21;
                            i20 = com.google.android.gms.internal.vision.e2.f(i17, i20, 1, arrayList3);
                            i21 = i17;
                            h6Var3 = h6Var4;
                        }
                    }
                    i17 = i16;
                    i20 = com.google.android.gms.internal.vision.e2.f(i17, i20, 1, arrayList3);
                    i21 = i17;
                    h6Var3 = h6Var4;
                }
                h6Var = h6Var3;
                for (int i22 = lineCount - 2; i22 >= 0; i22--) {
                    int intValue = ((Integer) arrayList3.get(i22)).intValue();
                    int i23 = i21 - intValue;
                    if (i23 > 0) {
                        i15 = intValue;
                        if (i23 <= (L3 * 1.5f) + L4) {
                            arrayList3.set(i22, Integer.valueOf(i21));
                        }
                    } else {
                        i15 = intValue;
                    }
                    i21 = i15;
                    arrayList3.set(i22, Integer.valueOf(i21));
                }
                int L5 = org.telegram.messenger.g0.L(3.0f);
                int L6 = org.telegram.messenger.g0.L(6.0f);
                int i24 = L3 - L5;
                ArrayList arrayList4 = v0Var2.Z0;
                arrayList4.clear();
                path.reset();
                float f18 = measuredWidth;
                path.moveTo(f18, L2);
                int i25 = i21;
                int i26 = 0;
                int i27 = 0;
                while (true) {
                    rectF = v0Var2.d1;
                    if (i27 >= lineCount) {
                        break;
                    }
                    int intValue2 = ((Integer) arrayList3.get(i27)).intValue();
                    int lineBottom = staticLayout2.getLineBottom(i27);
                    int i28 = lineCount;
                    int i29 = i28 - 1;
                    if (i27 < i29) {
                        paint5 = P2;
                        i14 = ((Integer) arrayList3.get(i27 + 1)).intValue();
                    } else {
                        paint5 = P2;
                        i14 = 0;
                    }
                    int i30 = lineBottom - i26;
                    if (i27 == 0 || intValue2 > i25) {
                        i30 = org.telegram.messenger.g0.L(3.0f) + i30;
                    }
                    if (i27 == i29 || intValue2 > i14) {
                        i30 = org.telegram.messenger.g0.L(3.0f) + i30;
                    }
                    Paint paint7 = P;
                    float f19 = (intValue2 / 2.0f) + f18;
                    int i31 = (i27 == i29 || intValue2 >= i14 || i27 == 0 || intValue2 >= i25) ? L4 : L6;
                    if (i27 == 0 || intValue2 > i25) {
                        f17 = f19;
                        staticLayout = staticLayout2;
                        arrayList2 = arrayList3;
                        rectF.set((f17 - L5) - L3, L2, f17 + i24, (L3 * 2) + L2);
                        x();
                        path.arcTo(rectF, -90.0f, 90.0f);
                    } else {
                        f17 = f19;
                        if (intValue2 < i25) {
                            float f20 = f17 + i24;
                            staticLayout = staticLayout2;
                            arrayList2 = arrayList3;
                            rectF.set(f20, L2, (i31 * 2) + f20, r4 + L2);
                            x();
                            path.arcTo(rectF, -90.0f, -90.0f);
                        } else {
                            staticLayout = staticLayout2;
                            arrayList2 = arrayList3;
                        }
                    }
                    L2 += i30;
                    if (i27 != i29 && intValue2 < i14) {
                        L2 -= org.telegram.messenger.g0.L(3.0f);
                        i30 -= org.telegram.messenger.g0.L(3.0f);
                    }
                    if (i27 != 0 && intValue2 < i25) {
                        L2 -= org.telegram.messenger.g0.L(3.0f);
                        i30 -= org.telegram.messenger.g0.L(3.0f);
                    }
                    arrayList4.add(Integer.valueOf(i30));
                    if (i27 == i29 || intValue2 > i14) {
                        rectF.set((f17 - L5) - L3, L2 - (L3 * 2), f17 + i24, L2);
                        x();
                        path.arcTo(rectF, 0.0f, 90.0f);
                    } else if (intValue2 < i14) {
                        float f21 = f17 + i24;
                        rectF.set(f21, L2 - r0, (i31 * 2) + f21, L2);
                        x();
                        path.arcTo(rectF, 180.0f, -90.0f);
                    }
                    i27++;
                    v0Var2 = this;
                    i25 = intValue2;
                    i26 = lineBottom;
                    lineCount = i28;
                    P2 = paint5;
                    P = paint7;
                    staticLayout2 = staticLayout;
                    arrayList3 = arrayList2;
                }
                paint = P;
                paint2 = P2;
                StaticLayout staticLayout3 = staticLayout2;
                ArrayList arrayList5 = arrayList3;
                int i32 = lineCount - 1;
                int i33 = i32;
                while (i33 >= 0) {
                    if (i33 != 0) {
                        arrayList = arrayList5;
                        i12 = ((Integer) arrayList.get(i33 - 1)).intValue();
                    } else {
                        arrayList = arrayList5;
                        i12 = 0;
                    }
                    int intValue3 = ((Integer) arrayList.get(i33)).intValue();
                    int intValue4 = i33 != i32 ? ((Integer) arrayList.get(i33 + 1)).intValue() : 0;
                    StaticLayout staticLayout4 = staticLayout3;
                    staticLayout4.getLineBottom(i33);
                    float f22 = measuredWidth - (intValue3 / 2);
                    int i34 = (i33 == i32 || intValue3 >= intValue4 || i33 == 0 || intValue3 >= i12) ? L4 : L6;
                    if (i33 == i32 || intValue3 > intValue4) {
                        arrayList5 = arrayList;
                        staticLayout3 = staticLayout4;
                        i13 = i32;
                        rectF.set(f22 - i24, L2 - (L3 * 2), L5 + f22 + L3, L2);
                        x();
                        path.arcTo(rectF, 90.0f, 90.0f);
                    } else if (intValue3 < intValue4) {
                        float f23 = f22 - i24;
                        arrayList5 = arrayList;
                        staticLayout3 = staticLayout4;
                        i13 = i32;
                        rectF.set(f23 - (i34 * 2), L2 - r2, f23, L2);
                        x();
                        path.arcTo(rectF, 90.0f, -90.0f);
                    } else {
                        arrayList5 = arrayList;
                        staticLayout3 = staticLayout4;
                        i13 = i32;
                    }
                    L2 -= ((Integer) arrayList4.get(i33)).intValue();
                    if (i33 == 0 || intValue3 > i12) {
                        rectF.set(f22 - i24, L2, f22 + L5 + L3, (L3 * 2) + L2);
                        x();
                        path.arcTo(rectF, 180.0f, 90.0f);
                    } else if (intValue3 < i12) {
                        float f24 = f22 - i24;
                        rectF.set(f24 - (i34 * 2), L2, f24, r11 + L2);
                        x();
                        path.arcTo(rectF, 0.0f, -90.0f);
                    }
                    i33--;
                    i32 = i13;
                }
                path.close();
                int measuredWidth2 = getMeasuredWidth() / 2;
                if (!X() || Y()) {
                    v0Var = this;
                } else {
                    float f25 = measuredWidth2;
                    v0Var = this;
                    rectF.left = (f25 - (v0Var.O / 2.0f)) - org.telegram.messenger.g0.L(17.0f);
                    rectF.top = L2;
                    rectF.right = (v0Var.O / 2.0f) + f25 + org.telegram.messenger.g0.L(17.0f);
                    rectF.bottom = org.telegram.messenger.g0.L(28.0f) + L2 + v0Var.P + v0Var.R;
                    path.reset();
                    path.addRoundRect(rectF, org.telegram.messenger.g0.L(15.0f), org.telegram.messenger.g0.L(15.0f), Path.Direction.CW);
                    path.close();
                }
            } else {
                v0Var = v0Var2;
                paint = P;
                paint2 = P2;
                h6Var = h6Var3;
                f10 = 4.0f;
                f11 = 6.0f;
                f12 = 8.0f;
                f13 = 2.0f;
            }
            if (!v0Var.x0) {
                v0Var.w0 = ((ViewGroup) v0Var.getParent()).getMeasuredHeight();
            }
            if (h6Var != null) {
                h6Var2 = h6Var;
                h6Var2.e(v0Var.v0, v0Var.u0 + org.telegram.messenger.g0.L(f10), v0Var.getMeasuredWidth(), v0Var.w0);
            } else {
                h6Var2 = h6Var;
                org.telegram.ui.ActionBar.m6.r(v0Var.v0, v0Var.u0 + org.telegram.messenger.g0.L(f10), v0Var.getMeasuredWidth(), v0Var.w0);
            }
            boolean z12 = v0Var instanceof jj;
            float f26 = (!z12 || org.telegram.ui.ActionBar.m6.i1(h6Var2)) ? 1.0f : 0.75f;
            if (!z10 || (v0Var.getAlpha() == 1.0f && !z12)) {
                paint3 = paint2;
                paint4 = paint;
                if (z12) {
                    i7 = paint4.getAlpha();
                    i10 = paint3.getAlpha();
                    paint4.setAlpha((int) (i7 * f26));
                    paint3.setAlpha((int) (i10 * f26));
                } else {
                    i7 = -1;
                    i10 = -1;
                }
            } else {
                i7 = paint.getAlpha();
                i10 = paint2.getAlpha();
                paint4 = paint;
                paint4.setAlpha((int) (v0Var.getAlpha() * i7 * f26));
                paint3 = paint2;
                paint3.setAlpha((int) (v0Var.getAlpha() * i10 * f26));
            }
            fj fjVar = v0Var.Q0;
            Paint paint8 = v0Var.i2;
            if (fjVar == null || !fjVar.j2) {
                canvas2 = canvas;
                canvas2.drawPath(path, paint4);
                if (v0Var.R() && paint3.getAlpha() > 0) {
                    canvas2.drawPath(path, paint3);
                }
                if (v0Var.h2 > 0.0f) {
                    int alpha = paint8.getAlpha();
                    if (z10) {
                        paint8.setAlpha((int) (v0Var.getAlpha() * alpha));
                    }
                    canvas2.drawPath(path, paint8);
                    paint8.setAlpha(alpha);
                }
            } else {
                canvas2 = canvas;
            }
            if (v0Var.T()) {
                int width = v0Var.getWidth();
                v0Var.J0.getClass();
                float L7 = (width - org.telegram.messenger.g0.L(206.0f)) / f13;
                float walletActionTop = v0Var.getWalletActionTop();
                v0Var.J0.getClass();
                float L8 = org.telegram.messenger.g0.L(206.0f) + L7;
                if (v0Var.J0.q0 == null) {
                    L = org.telegram.messenger.g0.L(140.0f);
                    f14 = 140.0f;
                    f15 = 20.0f;
                } else {
                    f14 = 140.0f;
                    f15 = 20.0f;
                    L = org.telegram.messenger.g0.L(150.0f) + ((int) Math.ceil(r13.q0.i()));
                }
                RectF rectF2 = v0Var.O0;
                rectF2.set(L7, walletActionTop, L8, L + walletActionTop);
                canvas2.save();
                v0Var.J0.c(canvas2, L7, walletActionTop);
                canvas2.drawRoundRect(rectF2, org.telegram.messenger.g0.L(f15), org.telegram.messenger.g0.L(f15), paint4);
                if (v0Var.R() && paint3.getAlpha() > 0) {
                    canvas2.drawRoundRect(rectF2, org.telegram.messenger.g0.L(f15), org.telegram.messenger.g0.L(f15), paint3);
                }
                f16 = 0.0f;
                if (v0Var.h2 > 0.0f) {
                    int alpha2 = paint8.getAlpha();
                    if (z10) {
                        paint8.setAlpha((int) (v0Var.getAlpha() * alpha2));
                    }
                    canvas2.drawRoundRect(rectF2, org.telegram.messenger.g0.L(f15), org.telegram.messenger.g0.L(f15), paint8);
                    paint8.setAlpha(alpha2);
                }
                canvas2.restore();
            } else {
                f14 = 140.0f;
                f15 = 20.0f;
                f16 = 0.0f;
            }
            fj fjVar2 = v0Var.Q0;
            if (v0Var.S()) {
                float L9 = v0Var.I0.T.f + org.telegram.messenger.g0.L(f12);
                float width2 = (v0Var.getWidth() - L9) / f13;
                float L10 = v0Var.I0.p ? f16 : org.telegram.messenger.g0.L(12.0f) + v0Var.T + v0Var.P;
                RectF rectF3 = org.telegram.messenger.g0.P;
                rectF3.set(width2, L10, L9 + width2, v0Var.I0.P + L10 + org.telegram.messenger.g0.L(f12));
                if (v0Var.N1 == null) {
                    v0Var.N1 = new RectF();
                }
                v0Var.N1.set(rectF3);
                canvas2.drawRoundRect(v0Var.N1, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), paint4);
                if (v0Var.R()) {
                    canvas2.drawRoundRect(v0Var.N1, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), paint3);
                }
            } else if (v0Var.P0 != null) {
                float L11 = org.telegram.messenger.g0.L(174.0f);
                vw0 vw0Var = v0Var.P0;
                vw0Var.getClass();
                float L12 = org.telegram.messenger.g0.L(f14) + ((int) vw0Var.f.i()) + (vw0Var.i ? org.telegram.messenger.g0.L(40.0f) : 0);
                float width3 = (v0Var.getWidth() - L11) / f13;
                if (v0Var.N1 == null) {
                    v0Var.N1 = new RectF();
                }
                v0Var.N1.set(width3, org.telegram.messenger.g0.L(f10), L11 + width3, org.telegram.messenger.g0.L(f10) + L12);
                canvas2.drawRoundRect(v0Var.N1, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), paint4);
                if (v0Var.R()) {
                    canvas2.drawRoundRect(v0Var.N1, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), paint3);
                }
            } else if (v0Var.W(fjVar2)) {
                float width4 = (v0Var.getWidth() - v0Var.j1) / f13;
                float f27 = v0Var.T + v0Var.P;
                if (v0Var.Y()) {
                    float L13 = f27 + org.telegram.messenger.g0.L(f10);
                    org.telegram.messenger.g0.P.set(width4, L13, v0Var.j1 + width4, v0Var.f + L13);
                } else {
                    float L14 = f27 + org.telegram.messenger.g0.L(12.0f);
                    RectF rectF4 = org.telegram.messenger.g0.P;
                    float f28 = v0Var.j1;
                    rectF4.set(width4, L14, width4 + f28, f28 + L14 + v0Var.L1);
                }
                if (fjVar2 != null && fjVar2.D == 18 && !v0Var.p1 && (t0Var = v0Var.t1) != null && v0Var.q1 > 0) {
                    RectF rectF5 = org.telegram.messenger.g0.P;
                    rectF5.bottom = com.google.android.gms.internal.vision.e2.t(1.0f, v0Var.r1.c, ((StaticLayout) t0Var.f).getHeight() - v0Var.q1, rectF5.bottom);
                }
                if (v0Var.N1 == null) {
                    v0Var.N1 = new RectF();
                }
                v0Var.N1.set(org.telegram.messenger.g0.P);
                if (fjVar2 == null || (!((i11 = fjVar2.D) == 33 || i11 == 35) || v0Var.Z1 == null)) {
                    canvas2.drawRoundRect(v0Var.N1, org.telegram.messenger.g0.L(f15), org.telegram.messenger.g0.L(f15), paint4);
                    if (v0Var.R()) {
                        canvas2.drawRoundRect(v0Var.N1, org.telegram.messenger.g0.L(f15), org.telegram.messenger.g0.L(f15), paint3);
                    }
                } else {
                    float L15 = org.telegram.messenger.g0.L(16.0f);
                    float[] fArr = v0Var.n2;
                    Arrays.fill(fArr, L15);
                    float L16 = org.telegram.messenger.g0.L(f11);
                    fArr[7] = L16;
                    fArr[6] = L16;
                    fArr[5] = L16;
                    fArr[4] = L16;
                    Path path2 = v0Var.m2;
                    path2.rewind();
                    path2.addRoundRect(v0Var.N1, fArr, Path.Direction.CW);
                    canvas2.drawPath(path2, paint4);
                    if (v0Var.R()) {
                        canvas2.drawPath(path2, paint3);
                    }
                }
            }
            if (i7 >= 0) {
                paint4.setAlpha(i7);
                paint3.setAlpha(i10);
            }
        }
    }

    public final void G(Canvas canvas) {
        TLRPC.TL_messageActionStarGiftOnchainOffer tL_messageActionStarGiftOnchainOffer = this.c2;
        if (tL_messageActionStarGiftOnchainOffer == null || this.g2 == null || !(tL_messageActionStarGiftOnchainOffer.gift instanceof TL_stars.TL_starGiftUnique)) {
            return;
        }
        ImageReceiver imageReceiver = this.J;
        float L = imageReceiver.L0 + imageReceiver.N0 + org.telegram.messenger.g0.L(10.0f) + org.telegram.messenger.g0.L(1.9805f);
        int L2 = (int) ((L + org.telegram.messenger.g0.L(48.0f)) - org.telegram.messenger.g0.L(40.800003f));
        int L3 = (int) ((imageReceiver.M0 - org.telegram.messenger.g0.L(10.0f)) - org.telegram.messenger.g0.L(1.7f));
        this.g2.setBounds(L2 - org.telegram.messenger.g0.L(39.0f), L3, L2, org.telegram.messenger.g0.L(42.6f) + L3);
        this.g2.draw(canvas);
    }

    public final void I(Canvas canvas) {
        float f10;
        float f11;
        Canvas canvas2 = canvas;
        canvas2.save();
        float f12 = 2.0f;
        canvas2.translate(this.k0 / 2.0f, getPaddingTop());
        canvas2.save();
        canvas2.translate(this.U, this.T);
        StaticLayout staticLayout = this.N;
        org.telegram.ui.Components.y5.drawAnimatedEmojis(canvas2, staticLayout, this.s0, 0.0f, this.q0, 0.0f, 0.0f, 0.0f, 1.0f, staticLayout != null ? M(staticLayout.getPaint().getColor()) : null);
        canvas2.restore();
        float f13 = 4.0f;
        if (S()) {
            canvas2.save();
            float width = getWidth();
            di.h6 h6Var = this.I0;
            canvas2.translate((width - h6Var.T.f) / 2.0f, h6Var.p ? org.telegram.messenger.g0.L(4.0f) : org.telegram.messenger.g0.L(16.0f) + this.T + this.P);
            this.I0.c(canvas2);
            canvas2.restore();
        }
        canvas2.restore();
        s01 s01Var = this.o0;
        org.telegram.ui.ActionBar.h6 h6Var2 = this.h1;
        if (s01Var != null) {
            float alpha = getAlpha();
            if (h6Var2 != null) {
                h6Var2.e(this.v0, this.u0 + 0.0f, getMeasuredWidth(), this.w0);
            } else {
                org.telegram.ui.ActionBar.m6.r(this.v0, this.u0 + 0.0f, getMeasuredWidth(), this.w0);
            }
            this.o0.c(canvas, getWidth(), this.k0, 0.0f, 1.0f, alpha, this.n0);
            canvas2 = canvas;
        }
        ArrayList arrayList = this.Y1;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        if (h6Var2 != null) {
            h6Var2.e(this.v0, this.u0 + org.telegram.messenger.g0.L(4.0f), getMeasuredWidth(), this.w0);
        } else {
            org.telegram.ui.ActionBar.m6.r(this.v0, this.u0 + org.telegram.messenger.g0.L(4.0f), getMeasuredWidth(), this.w0);
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
            float[] fArr = this.o2;
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
            Path path = this.p2;
            path.rewind();
            path.addRoundRect(rectF, fArr, Path.Direction.CW);
            canvas2.drawPath(path, P("paintChatActionBackground"));
            if (R()) {
                canvas2.drawPath(path, org.telegram.ui.ActionBar.m6.h2);
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
        org.telegram.ui.ActionBar.h6 h6Var = this.h1;
        if (h6Var != null) {
            h6Var.e(this.v0, this.u0 + org.telegram.messenger.g0.L(4.0f), getMeasuredWidth(), this.w0);
        } else {
            org.telegram.ui.ActionBar.m6.r(this.v0, this.u0 + org.telegram.messenger.g0.L(4.0f), getMeasuredWidth(), this.w0);
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
        u0 u0Var = this.x2;
        q0Var.d(canvas2, u0Var.b ? u0Var.c : 1.0f, num);
        if (alpha < 1.0f) {
            canvas2.restore();
        }
    }

    public final void L(pl plVar, Canvas canvas, int i7, Integer num, float f10) {
        ch.q0 q0Var = this.F0;
        q0Var.getClass();
        org.telegram.ui.ActionBar.h6 h6Var = this.h1;
        if (h6Var != null) {
            h6Var.e(this.v0, this.u0 + org.telegram.messenger.g0.L(4.0f), getMeasuredWidth(), this.w0);
        } else {
            org.telegram.ui.ActionBar.m6.r(this.v0, this.u0 + org.telegram.messenger.g0.L(4.0f), getMeasuredWidth(), this.w0);
        }
        q0Var.A = f10;
        q0Var.f(plVar, canvas, i7, num);
    }

    public final ColorFilter M(int i7) {
        if (i7 != this.w2 || this.v2 == null) {
            this.w2 = i7;
            this.v2 = new PorterDuffColorFilter(i7, PorterDuff.Mode.SRC_IN);
        }
        return this.v2;
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

    public final int O(fj fjVar) {
        int i7;
        int i10 = this.i1;
        int i11 = fjVar.D;
        if (i11 == 37) {
            i10 = org.telegram.messenger.g0.L(52.0f);
        } else if (i11 == 21 || Y()) {
            i10 = org.telegram.messenger.g0.L(78.0f);
        }
        if (X() || (i7 = fjVar.D) == 34 || i7 == 35) {
            return 0;
        }
        return i10;
    }

    public Paint P(String str) {
        org.telegram.ui.ActionBar.h6 h6Var = this.h1;
        Paint g10 = h6Var != null ? h6Var.g(str) : null;
        return g10 != null ? g10 : org.telegram.ui.ActionBar.m6.V0(str);
    }

    public final float Q(fj fjVar) {
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

    public final boolean R() {
        if (this.W0 != null) {
            return false;
        }
        org.telegram.ui.ActionBar.h6 h6Var = this.h1;
        return h6Var != null ? h6Var.j() : org.telegram.ui.ActionBar.m6.d1();
    }

    public final boolean S() {
        di.h6 h6Var = this.I0;
        return (h6Var == null || h6Var.Q == null) ? false : true;
    }

    public final boolean T() {
        TLRPC.Message message;
        fj fjVar = this.Q0;
        return (fjVar == null || (message = fjVar.k) == null || !(message.action instanceof TLRPC.TL_messageActionGramTransfer)) ? false : true;
    }

    public final void U() {
        s0 s0Var = this.g1;
        if (s0Var != null && s0Var.h()) {
            super.invalidate();
        } else if (getParent() instanceof View) {
            ((View) getParent()).invalidate();
        }
    }

    public final boolean W(fj fjVar) {
        if (fjVar == null) {
            return false;
        }
        int i7 = fjVar.D;
        return i7 == 30 || i7 == 18 || i7 == 25 || Y();
    }

    public final boolean X() {
        TLRPC.Message message;
        fj fjVar = this.Q0;
        return (fjVar == null || (message = fjVar.k) == null || !(message.action instanceof TLRPC.TL_messageActionSuggestedPostApproval)) ? false : true;
    }

    public final boolean Y() {
        fj fjVar;
        int i7;
        if (S() || this.P0 != null || (i7 = (fjVar = this.Q0).D) == 31 || i7 == 37 || i7 == 33 || i7 == 35 || i7 == 34 || i7 == 21 || i7 == 22 || fjVar.z4()) {
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

    public final boolean Z() {
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

    @Override // org.telegram.ui.Cells.q4
    public final /* synthetic */ boolean b() {
        return false;
    }

    public final boolean b0() {
        TLRPC.TL_messageActionStarGiftOnchainOffer tL_messageActionStarGiftOnchainOffer = this.c2;
        if (tL_messageActionStarGiftOnchainOffer == null || !this.d2) {
            return false;
        }
        long j3 = tL_messageActionStarGiftOnchainOffer.offer_id;
        Long l10 = (Long) bi.i4.a.get(Long.valueOf(j3));
        if (l10 != null && l10.longValue() > SystemClock.elapsedRealtime() && bi.i4.b.contains(Long.valueOf(j3))) {
            return true;
        }
        int i7 = this.I;
        return bi.i4.k(i7, j3) || bi.i4.m(i7, j3);
    }

    public final CharSequence c0(SpannableStringBuilder spannableStringBuilder, TLRPC.TL_messageActionStarGiftOnchainOffer tL_messageActionStarGiftOnchainOffer) {
        HashMap hashMap = bi.i4.a;
        CharSequence charSequence = null;
        if (tL_messageActionStarGiftOnchainOffer.settled && !tL_messageActionStarGiftOnchainOffer.accepted) {
            charSequence = gd.N0(2131749558, null);
        } else if (!tL_messageActionStarGiftOnchainOffer.accepted && !tL_messageActionStarGiftOnchainOffer.declined) {
            if (tL_messageActionStarGiftOnchainOffer.cancelled) {
                charSequence = gd.N0(2131749557, null);
            } else if (tL_messageActionStarGiftOnchainOffer.cancelling) {
                charSequence = gd.N0(2131749562, null);
            } else {
                int max = Math.max(0, tL_messageActionStarGiftOnchainOffer.expires_at - ConnectionsManager.getInstance(this.I).getCurrentTime());
                charSequence = tL_messageActionStarGiftOnchainOffer.expired ? gd.N0(2131749560, null) : max == 0 ? gd.N0(2131749559, null) : org.telegram.messenger.g0.W2(gd.a0(null, null, 2131749596, String.format(Locale.US, "%02d:%02d:%02d", Integer.valueOf(max / 3600), Integer.valueOf((max / 60) % 60), Integer.valueOf(max % 60))));
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

    @Override // org.telegram.ui.Cells.q4
    public final void d(TLRPC.ReactionCount reactionCount, boolean z10, float f10, float f11) {
        s0 s0Var = this.g1;
        if (s0Var != null) {
            s0Var.x0(this, reactionCount, z10, f10, f11);
        }
    }

    public final void d0(CharacterStyle characterStyle) {
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
            if (uRLSpan instanceof s41) {
                TLObject tLObject = ((s41) uRLSpan).c;
                if (tLObject instanceof TLRPC.TL_forumTopic) {
                    qg.c.n(this.g1.G(), -this.g1.a(), (TLRPC.TL_forumTopic) tLObject, 0);
                    return;
                }
                return;
            }
        }
        if (url.startsWith("invite")) {
            URLSpan uRLSpan2 = this.y;
            if (uRLSpan2 instanceof s41) {
                TLObject tLObject2 = ((s41) uRLSpan2).c;
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

    @Override // org.telegram.messenger.fs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        fj fjVar;
        if (i7 == ks.m1) {
            setSpoilersSuppressed(false);
            return;
        }
        if (i7 == ks.l4 || i7 == ks.L3) {
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
                i0(fjVar2, true);
                return;
            }
            return;
        }
        if (i7 == ks.y0) {
            if (!Objects.equals(objArr[0], j10.i(this.I).c0) || (fjVar = this.Q0) == null) {
                return;
            }
            i0(fjVar, true);
            return;
        }
        if (i7 == ks.d4 && T()) {
            this.s2 = null;
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

    public final void e0() {
        TLRPC.TL_premiumGiftOption tL_premiumGiftOption = new TLRPC.TL_premiumGiftOption();
        fj fjVar = this.Q0;
        TLRPC.MessageAction messageAction = fjVar.k.action;
        tL_premiumGiftOption.amount = messageAction.amount;
        tL_premiumGiftOption.months = messageAction.months;
        tL_premiumGiftOption.currency = messageAction.currency;
        String str = null;
        if (fjVar != null && (messageAction instanceof TLRPC.TL_messageActionGiftCode) && !Z()) {
            str = ((TLRPC.TL_messageActionGiftCode) this.Q0.k.action).slug;
        }
        if (this.g1 != null) {
            org.telegram.messenger.g0.g3(new kg.y((ViewGroup) this, (Object) tL_premiumGiftOption, str, 28));
        }
    }

    public final void f0() {
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
            org.telegram.ui.ActionBar.h6 h6Var = e7Var.J;
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
            pb.l1(context, false, 0L, this.I, starsTransaction, h6Var);
            return;
        }
        if (messageAction instanceof TLRPC.TL_messageActionPrizeStars) {
            Context context2 = getContext();
            TLRPC.Message message3 = this.Q0.k;
            int i10 = message3.date;
            TLRPC.Peer peer3 = message3.from_id;
            TLRPC.Peer peer4 = message3.peer_id;
            TLRPC.TL_messageActionPrizeStars tL_messageActionPrizeStars = (TLRPC.TL_messageActionPrizeStars) message3.action;
            org.telegram.ui.ActionBar.h6 h6Var2 = e7Var.J;
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
            pb.l1(context2, false, 0L, this.I, starsTransaction2, h6Var2);
            return;
        }
        if (messageAction instanceof TLRPC.TL_messageActionGiftTon) {
            Context context3 = getContext();
            TLRPC.Message message4 = this.Q0.k;
            int i11 = message4.date;
            TLRPC.Peer peer5 = message4.from_id;
            TLRPC.Peer peer6 = message4.peer_id;
            TLRPC.TL_messageActionGiftTon tL_messageActionGiftTon = (TLRPC.TL_messageActionGiftTon) message4.action;
            org.telegram.ui.ActionBar.h6 h6Var3 = e7Var.J;
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
            pb.l1(context3, false, 0L, this.I, starsTransaction3, h6Var3);
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
                org.telegram.ui.ActionBar.g2 T = LaunchActivity.T();
                if (T == null) {
                    return;
                }
                org.telegram.messenger.f3.n(null, 2131743637, lc.b0(T), R.raw.fire_on, 36);
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

    public final boolean g0(float f10, float f11, vf vfVar) {
        if (T() && !this.Q0.P3() && !this.Q0.k.premiumEffectWasPlayed) {
            float y10 = getY() + getPaddingTop() + getWalletActionTop();
            if (y10 >= f10 && y10 + org.telegram.messenger.g0.L(140.0f) <= f11) {
                org.telegram.ui.Wallet.m4 m4Var = this.J0;
                oh0 oh0Var = m4Var.l;
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
                    oh0Var.T(true, 0.0f);
                    oh0Var.start();
                    m4Var.H = true;
                    float f12 = m4Var.R;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    m4Var.j0 = ofFloat;
                    ofFloat.setDuration(2400L);
                    m4Var.j0.setInterpolator(nr.h);
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

    public /* bridge */ /* synthetic */ ImageReceiver getAvatarImage() {
        return null;
    }

    @Override // org.telegram.ui.Cells.z
    public int getBoundsLeft() {
        if (S()) {
            int width = ((int) (getWidth() - (this.I0.T.f + org.telegram.messenger.g0.L(8.0f)))) / 2;
            return this.I0.p ? width : Math.min(this.b1, width);
        }
        if (W(this.Q0)) {
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
        if (S()) {
            int L = ((int) ((this.I0.T.f + org.telegram.messenger.g0.L(8.0f)) + getWidth())) / 2;
            return this.I0.p ? L : Math.max(this.c1, L);
        }
        if (W(this.Q0)) {
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

    @Override // org.telegram.ui.Cells.q4
    public /* bridge */ /* synthetic */ float getCheckBoxTranslation() {
        return 0.0f;
    }

    public /* bridge */ /* synthetic */ xi getCurrentPosition() {
        return null;
    }

    public int getCustomDate() {
        return this.R0;
    }

    public s0 getDelegate() {
        return this.g1;
    }

    @Override // org.telegram.ui.Cells.q4
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

    @Override // org.telegram.ui.Cells.q4
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

    @Override // org.telegram.ui.Cells.q4
    public /* bridge */ /* synthetic */ float getSlidingOffsetX() {
        return 0.0f;
    }

    public u0 getTransitionParams() {
        return this.x2;
    }

    public float getWalletSlidingOffset() {
        return this.N0;
    }

    public final void h0(int i7, boolean z10, boolean z11) {
        int i10 = this.R0;
        if (i10 == i7 || i10 / 3600 == i7 / 3600) {
            return;
        }
        String N0 = z10 ? i7 == 2147483646 ? gd.N0(2131748299, "MessageScheduledUntilOnline") : gd.a0("MessageScheduledOn", null, 2131748335, gd.u(i7, false)) : gd.u(i7, false);
        this.R0 = i7;
        CharSequence charSequence = this.S0;
        if (charSequence == null || !TextUtils.equals(N0, charSequence)) {
            this.S0 = N0;
            this.s2 = null;
            n0(z11);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0b6a  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0bd0  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0bd9  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0bbf  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x03ee  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x03f7  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0356  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x0603  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x061c  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x0a38  */
    /* JADX WARN: Removed duplicated region for block: B:339:0x0ae7  */
    /* JADX WARN: Removed duplicated region for block: B:359:0x0b56  */
    /* JADX WARN: Removed duplicated region for block: B:466:0x0935  */
    /* JADX WARN: Removed duplicated region for block: B:493:0x0978 A[EDGE_INSN: B:493:0x0978->B:489:0x0978 BREAK  A[LOOP:6: B:464:0x092d->B:491:0x097b], SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v162 */
    /* JADX WARN: Type inference failed for: r2v163 */
    /* JADX WARN: Type inference failed for: r2v36, types: [org.telegram.tgnet.TLRPC$messages_StickerSet] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i0(fj fjVar, boolean z10) {
        StaticLayout staticLayout;
        TLRPC.TL_messageReactions tL_messageReactions;
        int i7;
        org.telegram.ui.ActionBar.h6 h6Var;
        int i10;
        org.telegram.ui.ActionBar.h6 h6Var2;
        String str;
        fj fjVar2;
        String str2;
        TLRPC.Document document;
        TLRPC.Document document2;
        String str3;
        ArrayList<TLRPC.TL_stickerPack> arrayList;
        int i11;
        fj fjVar3;
        int i12;
        TLRPC.Document document3;
        TLRPC.Document document4;
        TLRPC.Document document5;
        TLRPC.Document document6;
        b3.j jVar;
        int i13;
        int i14;
        int i15;
        boolean z11;
        int i16;
        ImageReceiver imageReceiver;
        TLRPC.PhotoSize photoSize;
        ImageReceiver imageReceiver2;
        TLRPC.VideoSize videoSize;
        TLRPC.PhotoSize photoSize2;
        boolean z12;
        float f10;
        RadialProgress2 radialProgress2;
        ImageReceiver imageReceiver3;
        TLRPC.WallPaper wallPaper;
        TLRPC.MessageAction messageAction;
        ImageReceiver imageReceiver4;
        org.telegram.ui.ActionBar.h6 h6Var3;
        String str4;
        s01 s01Var;
        int i17;
        int paddingTop;
        int i18;
        TLRPC.Message message;
        String m10;
        String str5;
        ActivityManager activityManager;
        fj fjVar4 = fjVar;
        if (fjVar4 == null) {
            return;
        }
        if (this.Q0 != fjVar4 && this.N0 != 0.0f) {
            setWalletSlidingOffset(0.0f);
        }
        fj fjVar5 = this.Q0;
        if (fjVar5 != fjVar4) {
            this.r = null;
        }
        TLRPC.Message message2 = fjVar4.k;
        if ((message2 == null || !(message2.action instanceof TLRPC.TL_messageActionGramTransfer) || this.b2 == message2.send_state) && fjVar5 == fjVar4 && (((staticLayout = this.N) == null || TextUtils.equals(staticLayout.getText(), fjVar4.v)) && !((!this.E0 && fjVar4.C != null) || z10 || fjVar4.D == 21 || fjVar4.M1))) {
            return;
        }
        boolean z13 = org.telegram.messenger.s2.a;
        ArrayList arrayList2 = this.Y1;
        arrayList2.clear();
        this.Z1 = null;
        this.c2 = null;
        this.s2 = null;
        fj fjVar6 = this.Q0;
        boolean z14 = fjVar6 == null || fjVar6.m1 != fjVar4.m1;
        if (fjVar6 != null) {
            fjVar4.o1 = fjVar6.o1;
        }
        if (!z14 && fjVar6 != null && T()) {
            fjVar4.k.premiumEffectWasPlayed |= this.Q0.k.premiumEffectWasPlayed;
        }
        this.Q0 = fjVar4;
        boolean T = T();
        int i19 = 3;
        org.telegram.ui.ActionBar.h6 h6Var4 = this.h1;
        if (T && this.J0 == null) {
            org.telegram.ui.Wallet.m4 m4Var = new org.telegram.ui.Wallet.m4(this, h6Var4);
            this.J0 = m4Var;
            m4Var.s0 = new n0(this, i19);
            m4Var.n(this.K0);
        }
        org.telegram.ui.Wallet.m4 m4Var2 = this.J0;
        if (m4Var2 != null) {
            boolean T2 = T();
            v0 v0Var = m4Var2.a;
            m4Var2.n = T2;
            if (T2 && m4Var2.m == null && !m4Var2.o && com.google.android.gms.internal.vision.e2.s(v0Var) && bz.o() != 0 && (activityManager = (ActivityManager) v0Var.getContext().getSystemService("activity")) != null && activityManager.getDeviceConfigurationInfo().reqGlEsVersion >= 196608) {
                org.telegram.ui.Wallet.l4 l4Var = new org.telegram.ui.Wallet.l4(m4Var2, v0Var.getContext(), new org.telegram.ui.Wallet.i4(m4Var2, 1));
                m4Var2.m = l4Var;
                v0Var.addView(l4Var, new ViewGroup.LayoutParams(org.telegram.messenger.g0.L(42.0f), org.telegram.messenger.g0.L(42.0f)));
            }
            org.telegram.ui.Wallet.l4 l4Var2 = m4Var2.m;
            if (l4Var2 != null) {
                l4Var2.setVisibility((!T2 || m4Var2.o) ? 8 : 0);
                m4Var2.m.setPaused(!T2 || m4Var2.o);
            }
            if (!T2) {
                m4Var2.f();
                m4Var2.k();
            }
        }
        TLRPC.Message message3 = fjVar4.k;
        int i20 = this.I;
        if (message3 != null && (message3.action instanceof TLRPC.TL_messageActionGramTransfer)) {
            mp u12 = mp.u1(i20);
            long o4 = org.telegram.messenger.n5.o(fjVar4.k.peer_id);
            if (o10.B(o4)) {
                m10 = gd.N0(2131742707, null);
            } else if (fjVar4.k.peer_id == null) {
                str5 = null;
                org.telegram.ui.Wallet.m4 m4Var3 = this.J0;
                boolean P3 = fjVar4.P3();
                TLRPC.Message message4 = fjVar4.k;
                m4Var3.m(P3, (TLRPC.TL_messageActionGramTransfer) message4.action, str5, message4.send_state, z14, !message4.premiumEffectWasPlayed);
                this.b2 = fjVar4.k.send_state;
            } else {
                m10 = org.telegram.messenger.n5.m(u12.g2(o4));
            }
            str5 = m10;
            org.telegram.ui.Wallet.m4 m4Var32 = this.J0;
            boolean P32 = fjVar4.P3();
            TLRPC.Message message42 = fjVar4.k;
            m4Var32.m(P32, (TLRPC.TL_messageActionGramTransfer) message42.action, str5, message42.send_state, z14, !message42.premiumEffectWasPlayed);
            this.b2 = fjVar4.k.send_state;
        }
        fjVar4.M1 = false;
        this.E0 = fjVar4.C != null;
        org.telegram.messenger.a6.q(i20).v(this);
        this.W = 0;
        this.H = false;
        t0 t0Var = this.t1;
        if (t0Var != null && z14) {
            org.telegram.ui.Components.y5.release((v0) t0Var.i, (org.telegram.ui.Components.u5) t0Var.h);
            this.t1 = null;
            this.o1 = false;
        }
        if (z14 || fjVar4.H) {
            fjVar4.H = false;
            TLRPC.Message message5 = fjVar4.k;
            boolean z15 = (message5 == null || (tL_messageReactions = message5.reactions) == null || !tL_messageReactions.reactions_as_tags) ? false : true;
            boolean O5 = fjVar4.O5();
            ch.q0 q0Var = this.F0;
            if (O5) {
                q0Var.r(fjVar4, z15, h6Var4);
            } else {
                q0Var.r(null, false, h6Var4);
            }
        }
        if (fjVar4.D == 32) {
            if (this.P0 == null) {
                vw0 vw0Var = new vw0(i20, this, h6Var4);
                this.P0 = vw0Var;
                if (this.j2) {
                    vw0Var.d.R(vw0Var.b);
                }
            }
            this.P0.c(fjVar4);
        } else {
            vw0 vw0Var2 = this.P0;
            if (vw0Var2 != null) {
                vw0Var2.d.R(null);
                this.P0 = null;
            }
        }
        if (this.I0 == null && (message = fjVar4.k) != null && (message.action instanceof TLRPC.TL_messageActionStarGiftUnique)) {
            di.h6 h6Var5 = new di.h6(i20, this, h6Var4);
            this.I0 = h6Var5;
            if (this.j2) {
                h6Var5.a();
            }
        }
        di.h6 h6Var6 = this.I0;
        if (h6Var6 != null) {
            h6Var6.f(fjVar4, !z14);
        }
        ImageReceiver imageReceiver5 = this.J;
        imageReceiver5.X(0);
        imageReceiver5.e();
        if (fjVar4.D != 22) {
            this.K = null;
        }
        if (fjVar4.J0 != -1) {
            c8.ra.b(this, 0.02f, 1.2f);
            this.l2 = Math.max(org.telegram.messenger.g0.L(250.0f), hi.l3.a(fjVar4.v, (TextPaint) P("paintChatActionText")));
            xw0 X0 = lb.X0(fjVar4.v);
            if (X0 != null) {
                X0.h = this;
            }
        } else {
            setStateListAnimator(null);
            this.l2 = 0;
        }
        boolean z42 = fjVar4.z4();
        org.telegram.ui.Components.b9 b9Var = this.M;
        if (z42) {
            TLRPC.User c22 = mp.u1(i20).c2(Long.valueOf(fjVar4.k.media.user_id));
            b9Var.r(c22);
            TL_stories.StoryItem storyItem = fjVar4.k.media.storyItem;
            if (storyItem == null || !storyItem.noforwards) {
                fi.i7.x(imageReceiver5, storyItem);
            } else {
                imageReceiver5.j0(c22, b9Var, null, true, 0, true);
            }
            imageReceiver5.J0((int) (this.i1 / 2.0f));
            h6Var2 = h6Var4;
        } else {
            int i21 = fjVar4.D;
            RadialProgress2 radialProgress22 = this.K1;
            if (i21 == 22) {
                if (fjVar4.I1 == null) {
                    int size = fjVar4.p0.size();
                    for (int i22 = 0; i22 < size && !(((TLRPC.PhotoSize) fjVar4.p0.get(i22)) instanceof TLRPC.TL_photoStrippedSize); i22++) {
                    }
                }
                TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent = fjVar4.L1;
                if (tL_channelAdminLogEvent != null) {
                    TLRPC.ChannelAdminLogEventAction channelAdminLogEventAction = tL_channelAdminLogEvent.action;
                    if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionChangeWallpaper) {
                        wallPaper = ((TLRPC.TL_channelAdminLogEventActionChangeWallpaper) channelAdminLogEventAction).new_value;
                        if (TextUtils.isEmpty(org.telegram.messenger.f4.j(wallPaper))) {
                            boolean d = h6Var4 != null ? h6Var4.d() : org.telegram.ui.ActionBar.m6.I.q();
                            imageReceiver5.f();
                            String j3 = org.telegram.messenger.f4.j(wallPaper);
                            int i23 = hi.v5.C0;
                            org.telegram.ui.ActionBar.s3 i24 = org.telegram.messenger.f4.f(i20).i(ig.b.d(j3));
                            Drawable s02 = i24 == null ? org.telegram.ui.ActionBar.m6.s0() : hi.v5.g(i20, i24, d);
                            this.K = s02;
                            if (s02 != null) {
                                s02.setCallback(this);
                            }
                            h6Var3 = h6Var4;
                            imageReceiver4 = imageReceiver5;
                        } else if (wallPaper == null || (str4 = wallPaper.uploadingImage) == null) {
                            TLRPC.WallPaper wallPaper2 = wallPaper;
                            if (wallPaper2 != null) {
                                TLObject tLObject = fjVar4.n0;
                                fc b10 = fc.b(tLObject instanceof TLRPC.Document ? (TLRPC.Document) tLObject : wallPaper2.document);
                                StringBuilder sb2 = new StringBuilder("150_150_wallpaper");
                                h6Var3 = h6Var4;
                                sb2.append(wallPaper2.id);
                                sb2.append(en.e(wallPaper2.settings));
                                imageReceiver5.r0(b10, sb2.toString(), null, null, en.b(wallPaper2), 0L, null, wallPaper2, 1);
                                imageReceiver4 = imageReceiver5;
                                this.K = null;
                            } else {
                                imageReceiver4 = imageReceiver5;
                                h6Var3 = h6Var4;
                                this.K = null;
                            }
                        } else {
                            imageReceiver5.r0(fc.g(str4), "150_150_wallpaper" + wallPaper.id + en.e(wallPaper.settings), null, null, en.b(wallPaper), 0L, null, wallPaper, 1);
                            this.K = null;
                            imageReceiver4 = imageReceiver5;
                            h6Var3 = h6Var4;
                        }
                        imageReceiver4.J0((int) (this.i1 / 2.0f));
                        if (Q(fjVar) != 1.0f) {
                            boolean z16 = !z14;
                            radialProgress22.p(z16, 1.0f);
                            radialProgress22.setIcon(4, z16, z16);
                        } else {
                            boolean z17 = !z14;
                            radialProgress22.setIcon(3, z17, z17);
                        }
                        h6Var2 = h6Var3;
                    }
                }
                TLRPC.Message message6 = fjVar4.k;
                wallPaper = (message6 == null || (messageAction = message6.action) == null) ? null : messageAction.wallpaper;
                if (TextUtils.isEmpty(org.telegram.messenger.f4.j(wallPaper))) {
                }
                imageReceiver4.J0((int) (this.i1 / 2.0f));
                if (Q(fjVar) != 1.0f) {
                }
                h6Var2 = h6Var3;
            } else {
                if (i21 == 21) {
                    imageReceiver5.J0((int) (this.i1 / 2.0f));
                    imageReceiver5.v0 = true;
                    imageReceiver5.h1 = null;
                    TLRPC.TL_messageActionSuggestProfilePhoto tL_messageActionSuggestProfilePhoto = (TLRPC.TL_messageActionSuggestProfilePhoto) fjVar4.k.action;
                    TLRPC.VideoSize x10 = org.telegram.messenger.w7.x(1000, tL_messageActionSuggestProfilePhoto.photo.video_sizes);
                    ArrayList<TLRPC.VideoSize> arrayList3 = tL_messageActionSuggestProfilePhoto.photo.video_sizes;
                    fc j10 = (arrayList3 == null || arrayList3.isEmpty()) ? null : fc.j(x10, tL_messageActionSuggestProfilePhoto.photo);
                    TLRPC.Photo photo = fjVar4.k.action.photo;
                    if (fjVar4.I1 == null) {
                        int size2 = fjVar4.p0.size();
                        for (int i25 = 0; i25 < size2; i25++) {
                            photoSize2 = (TLRPC.PhotoSize) fjVar4.p0.get(i25);
                            if (photoSize2 instanceof TLRPC.TL_photoStrippedSize) {
                                break;
                            }
                        }
                    }
                    photoSize2 = null;
                    TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(fjVar4.p0, 1000, false, null, false);
                    if (w10 == null) {
                        i7 = i20;
                        z12 = false;
                        h6Var = h6Var4;
                        f10 = 1.0f;
                        radialProgress2 = radialProgress22;
                        imageReceiver3 = imageReceiver5;
                    } else if (x10 != null) {
                        i7 = i20;
                        h6Var = h6Var4;
                        f10 = 1.0f;
                        radialProgress2 = radialProgress22;
                        z12 = false;
                        imageReceiver5.u0(j10, "g", fc.i(w10, photo), "150_150", fc.f(photoSize2, fjVar4.n0), "50_50_b", fjVar4.I1, 0L, null, fjVar, 0);
                        imageReceiver3 = imageReceiver5;
                        fjVar4 = fjVar;
                    } else {
                        i7 = i20;
                        z12 = false;
                        h6Var = h6Var4;
                        f10 = 1.0f;
                        radialProgress2 = radialProgress22;
                        imageReceiver5.r0(fc.i(w10, photo), "150_150", fc.f(photoSize2, fjVar4.n0), "50_50_b", fjVar4.I1, 0L, null, fjVar4, 0);
                        imageReceiver3 = imageReceiver5;
                    }
                    imageReceiver3.v0 = z12;
                    x30 x30Var = (x30) mp.u1(i7).E7.get(fjVar4.k.local_id);
                    if (x30Var == null || x30Var.X == f10) {
                        boolean z18 = !z14;
                        radialProgress2.p(z18, f10);
                        radialProgress2.setIcon(4, z18, z18);
                    } else {
                        boolean z19 = !z14;
                        radialProgress2.setIcon(3, z19, z19);
                    }
                } else {
                    i7 = i20;
                    h6Var = h6Var4;
                    if (i21 == 31 || i21 == 33 || i21 == 30 || i21 == 18 || i21 == 25 || i21 == 35) {
                        imageReceiver5.J0(0);
                        TLRPC.MessageAction messageAction2 = fjVar4.k.action;
                        int i26 = 7;
                        if (messageAction2 instanceof TLRPC.TL_messageActionNoForwardsRequest) {
                            TLRPC.TL_messageActionNoForwardsRequest tL_messageActionNoForwardsRequest = (TLRPC.TL_messageActionNoForwardsRequest) messageAction2;
                            long n22 = mp.u1(i7).A7.I.n2(TimeUnit.SECONDS);
                            if (tL_messageActionNoForwardsRequest.expired) {
                                i15 = 0;
                            } else {
                                i15 = 0;
                                if (fjVar4.k.date + n22 >= ConnectionsManager.getInstance(i7).getCurrentTime()) {
                                    z11 = false;
                                    this.a2 = z11;
                                    if (!fjVar4.N3() || tL_messageActionNoForwardsRequest.expired || this.a2) {
                                        i16 = 8;
                                    } else {
                                        ArrayList arrayList4 = new ArrayList();
                                        org.telegram.messenger.p2 p2Var = new org.telegram.messenger.p2(7, 2131751402, R.drawable.filled_bot_decline_24);
                                        i16 = 8;
                                        org.telegram.messenger.p2 p2Var2 = new org.telegram.messenger.p2(8, 2131751403, R.drawable.filled_bot_approve_24);
                                        org.telegram.messenger.n2[] n2VarArr = new org.telegram.messenger.n2[2];
                                        n2VarArr[i15] = p2Var;
                                        n2VarArr[1] = p2Var2;
                                        arrayList4.add(n2VarArr);
                                        this.Z1 = new b3.j((org.telegram.messenger.n2[][]) arrayList4.toArray(new org.telegram.messenger.n2[arrayList4.size()][]), i15, i26);
                                    }
                                    i10 = i16;
                                    i20 = i7;
                                    h6Var2 = h6Var;
                                    str2 = null;
                                    document = null;
                                }
                            }
                            z11 = true;
                            this.a2 = z11;
                            if (fjVar4.N3()) {
                            }
                            i16 = 8;
                            i10 = i16;
                            i20 = i7;
                            h6Var2 = h6Var;
                            str2 = null;
                            document = null;
                        } else {
                            if (messageAction2 instanceof TLRPC.TL_messageActionStarGiftPurchaseOffer) {
                                TLRPC.TL_messageActionStarGiftPurchaseOffer tL_messageActionStarGiftPurchaseOffer = (TLRPC.TL_messageActionStarGiftPurchaseOffer) messageAction2;
                                TL_stars.StarGift starGift = tL_messageActionStarGiftPurchaseOffer.gift;
                                if (starGift != null) {
                                    TLRPC.Document e10 = cg.d.e(starGift);
                                    if (this.T0 == null) {
                                        i10 = 8;
                                        h6Var2 = h6Var;
                                        this.T0 = new bi.c3(this, h6Var2, false);
                                    } else {
                                        i10 = 8;
                                        h6Var2 = h6Var;
                                    }
                                    this.T0.d((TL_stars.starGiftAttributeBackdrop) di.y8.l(starGift.attributes, TL_stars.starGiftAttributeBackdrop.class));
                                    this.T0.e((TL_stars.starGiftAttributePattern) di.y8.l(starGift.attributes, TL_stars.starGiftAttributePattern.class));
                                    document6 = e10;
                                } else {
                                    i10 = 8;
                                    h6Var2 = h6Var;
                                    document6 = null;
                                }
                                this.a2 = tL_messageActionStarGiftPurchaseOffer.expires_at < ConnectionsManager.getInstance(i7).getCurrentTime();
                                if (!fjVar4.N3() && !tL_messageActionStarGiftPurchaseOffer.accepted && !tL_messageActionStarGiftPurchaseOffer.declined && !this.a2) {
                                    ArrayList arrayList5 = new ArrayList();
                                    arrayList5.add(new org.telegram.messenger.n2[]{new org.telegram.messenger.p2(5, 2131749713, R.drawable.filled_bot_decline_24), new org.telegram.messenger.p2(6, 2131749723, R.drawable.filled_bot_approve_24)});
                                    this.Z1 = new b3.j((org.telegram.messenger.n2[][]) arrayList5.toArray(new org.telegram.messenger.n2[arrayList5.size()][]), 0, i26);
                                }
                                document = document6;
                                i20 = i7;
                            } else {
                                i10 = 8;
                                h6Var2 = h6Var;
                                if (messageAction2 instanceof TLRPC.TL_messageActionStarGiftOnchainOffer) {
                                    TLRPC.TL_messageActionStarGiftOnchainOffer tL_messageActionStarGiftOnchainOffer = (TLRPC.TL_messageActionStarGiftOnchainOffer) messageAction2;
                                    TL_stars.StarGift starGift2 = tL_messageActionStarGiftOnchainOffer.gift;
                                    if (starGift2 != null) {
                                        document5 = cg.d.e(starGift2);
                                        if (this.T0 == null) {
                                            this.T0 = new bi.c3(this, h6Var2, false);
                                        }
                                        this.T0.d((TL_stars.starGiftAttributeBackdrop) di.y8.l(starGift2.attributes, TL_stars.starGiftAttributeBackdrop.class));
                                        this.T0.e((TL_stars.starGiftAttributePattern) di.y8.l(starGift2.attributes, TL_stars.starGiftAttributePattern.class));
                                    } else {
                                        document5 = null;
                                    }
                                    this.c2 = tL_messageActionStarGiftOnchainOffer;
                                    i20 = i7;
                                    boolean i27 = bi.i4.i(i20, tL_messageActionStarGiftOnchainOffer);
                                    this.d2 = i27;
                                    this.e2 = -1;
                                    this.a2 = !i27;
                                    if (starGift2 instanceof TL_stars.TL_starGiftUnique) {
                                        if (this.g2 == null) {
                                            this.g2 = new bi.j3(this, 0.85f);
                                        }
                                        if (tL_messageActionStarGiftOnchainOffer.buyer || !(tL_messageActionStarGiftOnchainOffer.accepted || tL_messageActionStarGiftOnchainOffer.settled)) {
                                            this.g2.e((TL_stars.starGiftAttributeBackdrop) di.y8.l(starGift2.attributes, TL_stars.starGiftAttributeBackdrop.class), false, false);
                                            this.g2.g(9, i5.c.l(((TL_stars.TL_starGiftUnique) starGift2).num, ',', new StringBuilder("#")), true);
                                        } else {
                                            this.g2.f(-698031);
                                            this.g2.g(10, gd.N0(2131749576, null), false);
                                        }
                                    }
                                    document = document5;
                                } else {
                                    i20 = i7;
                                    if (!(messageAction2 instanceof TLRPC.TL_messageActionSetChatTheme)) {
                                        if (messageAction2 instanceof TLRPC.TL_messageActionStarGift) {
                                            TL_stars.StarGift starGift3 = ((TLRPC.TL_messageActionStarGift) messageAction2).gift;
                                            if (starGift3 != null) {
                                                document3 = starGift3.sticker;
                                                fjVar3 = fjVar4;
                                                document = document3;
                                                str2 = null;
                                                fjVar2 = null;
                                                jVar = this.Z1;
                                                if (jVar != null) {
                                                    int length = ((org.telegram.messenger.n2[][]) jVar.c).length;
                                                    int i28 = 0;
                                                    while (i28 < length) {
                                                        int length2 = ((org.telegram.messenger.n2[][]) this.Z1.c)[i28].length;
                                                        int i29 = 0;
                                                        while (i29 < length2) {
                                                            org.telegram.messenger.n2 n2Var = ((org.telegram.messenger.n2[][]) this.Z1.c)[i28][i29];
                                                            int i30 = length;
                                                            d0 d0Var = new d0(new n0(this, 4));
                                                            d0Var.j = (org.telegram.messenger.p2) n2Var;
                                                            int c10 = n2Var.c();
                                                            if (c10 != 0) {
                                                                Drawable drawable = getResources().getDrawable(c10);
                                                                d0Var.t = drawable;
                                                                i13 = i28;
                                                                i14 = length2;
                                                                drawable.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                                                            } else {
                                                                i13 = i28;
                                                                i14 = length2;
                                                            }
                                                            d0Var.f = org.telegram.messenger.g0.L(40.0f);
                                                            int i31 = d0Var.g | 8;
                                                            d0Var.g = i31;
                                                            int b11 = dd.b(i31, 1, i29 == 0);
                                                            d0Var.g = b11;
                                                            d0Var.g = dd.b(b11, 2, i29 == 1);
                                                            d0Var.h = new xy0(n2Var.d(), (TextPaint) P("paintChatBotButton"));
                                                            arrayList2.add(d0Var);
                                                            i29++;
                                                            length = i30;
                                                            i28 = i13;
                                                            length2 = i14;
                                                        }
                                                        i28++;
                                                    }
                                                }
                                                this.M1 = fjVar4.n1;
                                                this.I1 = document;
                                                if (document == null) {
                                                    imageReceiver5.v0 = true;
                                                    int i32 = fjVar4.D;
                                                    if (i32 != 31 && i32 != 37 && i32 != 33) {
                                                        imageReceiver5.h1 = this.O1;
                                                    }
                                                    this.J1 = null;
                                                    int i33 = 0;
                                                    while (true) {
                                                        if (i33 >= document.video_thumbs.size()) {
                                                            break;
                                                        }
                                                        if ("f".equals(document.video_thumbs.get(i33).type)) {
                                                            this.J1 = document.video_thumbs.get(i33);
                                                            break;
                                                        }
                                                        i33++;
                                                    }
                                                    if (z14 || fjVar4.D != 18) {
                                                        lz f11 = org.telegram.messenger.u5.f(document, org.telegram.ui.ActionBar.m6.a7, 0.3f, null);
                                                        imageReceiver5.W(0);
                                                        fc b12 = fc.b(document);
                                                        Locale locale = Locale.US;
                                                        imageReceiver5.q0(b12, i5.c.i(fjVar4.m1, "160_160_nr_messageId="), f11, "tgs", fjVar3, 1);
                                                    }
                                                } else if (str2 != null) {
                                                    ri.d0(i20).f1(str2, false, fjVar2 == null);
                                                }
                                            }
                                            document3 = null;
                                            fjVar3 = fjVar4;
                                            document = document3;
                                            str2 = null;
                                            fjVar2 = null;
                                            jVar = this.Z1;
                                            if (jVar != null) {
                                            }
                                            this.M1 = fjVar4.n1;
                                            this.I1 = document;
                                            if (document == null) {
                                            }
                                        } else {
                                            if (messageAction2 instanceof TLRPC.TL_messageActionStarGiftUnique) {
                                                TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique = (TLRPC.TL_messageActionStarGiftUnique) messageAction2;
                                                if (tL_messageActionStarGiftUnique.refunded) {
                                                    TL_stars.StarGift starGift4 = tL_messageActionStarGiftUnique.gift;
                                                    if (starGift4 != null) {
                                                        document3 = starGift4.getDocument();
                                                        fjVar3 = fjVar4;
                                                        document = document3;
                                                        str2 = null;
                                                        fjVar2 = null;
                                                        jVar = this.Z1;
                                                        if (jVar != null) {
                                                        }
                                                        this.M1 = fjVar4.n1;
                                                        this.I1 = document;
                                                        if (document == null) {
                                                        }
                                                    }
                                                    document3 = null;
                                                    fjVar3 = fjVar4;
                                                    document = document3;
                                                    str2 = null;
                                                    fjVar2 = null;
                                                    jVar = this.Z1;
                                                    if (jVar != null) {
                                                    }
                                                    this.M1 = fjVar4.n1;
                                                    this.I1 = document;
                                                    if (document == null) {
                                                    }
                                                }
                                            }
                                            if (messageAction2 instanceof TLRPC.TL_messageActionGiftTon) {
                                                str = j10.i(i20).d0;
                                                if (str == null) {
                                                    ri.d0(i20).E();
                                                    return;
                                                }
                                            } else {
                                                str = j10.i(i20).c0;
                                                if (str == null) {
                                                    ri.d0(i20).B();
                                                    return;
                                                }
                                            }
                                            String str6 = str;
                                            TLRPC.TL_messages_stickerSet r02 = ri.d0(i20).r0(str6);
                                            ?? r22 = r02;
                                            if (r02 == null) {
                                                r22 = ri.d0(i20).p0(str6);
                                            }
                                            if (r22 != 0) {
                                                TLRPC.MessageAction messageAction3 = fjVar4.k.action;
                                                int i34 = messageAction3.months;
                                                if (fjVar4.D == 30) {
                                                    String str7 = "3⃣";
                                                    if (messageAction3 instanceof TLRPC.TL_messageActionGiftTon) {
                                                        long j11 = messageAction3.cryptoAmount;
                                                        if (j11 > 10000000000L) {
                                                            if (j11 <= 50000000000L) {
                                                                str7 = "1⃣";
                                                            }
                                                            i12 = 0;
                                                            while (true) {
                                                                if (i12 < r22.packs.size()) {
                                                                    break;
                                                                }
                                                                TLRPC.TL_stickerPack tL_stickerPack = r22.packs.get(i12);
                                                                if (TextUtils.equals(tL_stickerPack.emoticon, str7) && !tL_stickerPack.documents.isEmpty()) {
                                                                    long longValue = tL_stickerPack.documents.get(0).longValue();
                                                                    for (int i35 = 0; i35 < r22.documents.size(); i35++) {
                                                                        document2 = r22.documents.get(i35);
                                                                        if (document2 != null && document2.id == longValue) {
                                                                            break;
                                                                        }
                                                                    }
                                                                } else {
                                                                    i12++;
                                                                }
                                                            }
                                                            document2 = null;
                                                        }
                                                        str7 = "2⃣";
                                                        i12 = 0;
                                                        while (true) {
                                                            if (i12 < r22.packs.size()) {
                                                            }
                                                            i12++;
                                                        }
                                                        document2 = null;
                                                    } else {
                                                        long j12 = messageAction3 instanceof TLRPC.TL_messageActionGiftStars ? ((TLRPC.TL_messageActionGiftStars) messageAction3).stars : ((TLRPC.TL_messageActionPrizeStars) messageAction3).stars;
                                                        if (j12 > 1000) {
                                                            if (j12 >= 2500) {
                                                                str7 = "4⃣";
                                                            }
                                                            i12 = 0;
                                                            while (true) {
                                                                if (i12 < r22.packs.size()) {
                                                                }
                                                                i12++;
                                                            }
                                                            document2 = null;
                                                        }
                                                        str7 = "2⃣";
                                                        i12 = 0;
                                                        while (true) {
                                                            if (i12 < r22.packs.size()) {
                                                            }
                                                            i12++;
                                                        }
                                                        document2 = null;
                                                    }
                                                    jVar = this.Z1;
                                                    if (jVar != null) {
                                                    }
                                                    this.M1 = fjVar4.n1;
                                                    this.I1 = document;
                                                    if (document == null) {
                                                    }
                                                } else {
                                                    String str8 = (String) y2.get(Integer.valueOf(i34));
                                                    ArrayList<TLRPC.TL_stickerPack> arrayList6 = r22.packs;
                                                    int size3 = arrayList6.size();
                                                    int i36 = 0;
                                                    TLRPC.Document document7 = null;
                                                    while (i36 < size3) {
                                                        TLRPC.TL_stickerPack tL_stickerPack2 = arrayList6.get(i36);
                                                        int i37 = i36 + 1;
                                                        TLRPC.TL_stickerPack tL_stickerPack3 = tL_stickerPack2;
                                                        if (Objects.equals(tL_stickerPack3.emoticon, str8)) {
                                                            ArrayList<Long> arrayList7 = tL_stickerPack3.documents;
                                                            int size4 = arrayList7.size();
                                                            TLRPC.Document document8 = document7;
                                                            int i38 = 0;
                                                            while (true) {
                                                                if (i38 >= size4) {
                                                                    str3 = str8;
                                                                    arrayList = arrayList6;
                                                                    i11 = i37;
                                                                    break;
                                                                }
                                                                Long l10 = arrayList7.get(i38);
                                                                i38++;
                                                                long longValue2 = l10.longValue();
                                                                ArrayList<TLRPC.Document> arrayList8 = r22.documents;
                                                                str3 = str8;
                                                                int size5 = arrayList8.size();
                                                                arrayList = arrayList6;
                                                                int i39 = 0;
                                                                while (true) {
                                                                    if (i39 >= size5) {
                                                                        i11 = i37;
                                                                        break;
                                                                    }
                                                                    TLRPC.Document document9 = arrayList8.get(i39);
                                                                    i39++;
                                                                    int i40 = size5;
                                                                    TLRPC.Document document10 = document9;
                                                                    ArrayList<TLRPC.Document> arrayList9 = arrayList8;
                                                                    i11 = i37;
                                                                    if (document10.id == longValue2) {
                                                                        document8 = document10;
                                                                        break;
                                                                    } else {
                                                                        i37 = i11;
                                                                        size5 = i40;
                                                                        arrayList8 = arrayList9;
                                                                    }
                                                                }
                                                                if (document8 != null) {
                                                                    break;
                                                                }
                                                                str8 = str3;
                                                                arrayList6 = arrayList;
                                                                i37 = i11;
                                                            }
                                                            document7 = document8;
                                                        } else {
                                                            str3 = str8;
                                                            arrayList = arrayList6;
                                                            i11 = i37;
                                                        }
                                                        if (document7 != null) {
                                                            break;
                                                        }
                                                        str8 = str3;
                                                        arrayList6 = arrayList;
                                                        i36 = i11;
                                                    }
                                                    document2 = document7;
                                                }
                                                if (document2 != null || r22.documents.isEmpty()) {
                                                    fjVar3 = r22;
                                                    document = document2;
                                                } else {
                                                    document = r22.documents.get(0);
                                                    fjVar3 = r22;
                                                }
                                                str2 = str6;
                                                fjVar2 = fjVar3;
                                                jVar = this.Z1;
                                                if (jVar != null) {
                                                }
                                                this.M1 = fjVar4.n1;
                                                this.I1 = document;
                                                if (document == null) {
                                                }
                                            } else {
                                                fjVar2 = r22;
                                                str2 = str6;
                                                document = null;
                                                fjVar3 = null;
                                                jVar = this.Z1;
                                                if (jVar != null) {
                                                }
                                                this.M1 = fjVar4.n1;
                                                this.I1 = document;
                                                if (document == null) {
                                                }
                                            }
                                        }
                                        if (!this.l0 && this.f0 && this.j0 && (this.g0 || this.h0 || this.i0)) {
                                            this.m0 = org.telegram.messenger.g0.L(33.0f);
                                            if (this.o0 == null) {
                                                s01 s01Var2 = new s01(i20, this, h6Var2, true);
                                                this.o0 = s01Var2;
                                                s01Var2.s = new n0(this, 5);
                                            }
                                            if (!this.o0.e(this.Q0)) {
                                                this.o0.b();
                                                this.o0 = null;
                                                this.m0 = 0;
                                            } else if (this.j2) {
                                                this.o0.a();
                                            }
                                            i17 = 0;
                                        } else {
                                            s01Var = this.o0;
                                            if (s01Var != null) {
                                                s01Var.b();
                                                this.o0 = null;
                                            }
                                            i17 = 0;
                                            this.m0 = 0;
                                        }
                                        paddingTop = getPaddingTop();
                                        i18 = this.m0;
                                        if (paddingTop != i18) {
                                            setPadding(i17, i18, i17, i17);
                                        }
                                        this.U1.setVisibility((W(fjVar) || S()) ? i10 : i17);
                                        qg.c.b(fjVar4);
                                        requestLayout();
                                    }
                                    TL_stars.StarGift starGift5 = ((TLRPC.TL_chatThemeUniqueGift) ((TLRPC.TL_messageActionSetChatTheme) messageAction2).theme).gift;
                                    if (starGift5 != null) {
                                        TLRPC.Document e11 = cg.d.e(starGift5);
                                        if (this.T0 == null) {
                                            this.T0 = new bi.c3(this, h6Var2, false);
                                        }
                                        this.T0.d((TL_stars.starGiftAttributeBackdrop) di.y8.l(starGift5.attributes, TL_stars.starGiftAttributeBackdrop.class));
                                        this.T0.e((TL_stars.starGiftAttributePattern) di.y8.l(starGift5.attributes, TL_stars.starGiftAttributePattern.class));
                                        document4 = e11;
                                    } else {
                                        document4 = null;
                                    }
                                    document = document4;
                                }
                            }
                            str2 = null;
                        }
                        fjVar2 = null;
                        fjVar3 = null;
                        jVar = this.Z1;
                        if (jVar != null) {
                        }
                        this.M1 = fjVar4.n1;
                        this.I1 = document;
                        if (document == null) {
                        }
                        if (!this.l0) {
                        }
                        s01Var = this.o0;
                        if (s01Var != null) {
                        }
                        i17 = 0;
                        this.m0 = 0;
                        paddingTop = getPaddingTop();
                        i18 = this.m0;
                        if (paddingTop != i18) {
                        }
                        this.U1.setVisibility((W(fjVar) || S()) ? i10 : i17);
                        qg.c.b(fjVar4);
                        requestLayout();
                    }
                    if (i21 == 37) {
                        TLRPC.Chat O0 = mp.u1(i7).O0(Long.valueOf(((TLRPC.TL_messageActionChangeCommunity) fjVar4.k.action).community_id));
                        imageReceiver5.v0 = true;
                        imageReceiver5.h1 = null;
                        imageReceiver5.J0(org.telegram.messenger.g0.L(14.0f));
                        imageReceiver5.X(1);
                        b9Var.q(O0);
                        imageReceiver5.i0(O0, new fi.i0(getContext(), org.telegram.messenger.g0.L(14.0f)), O0);
                    } else if (i21 == 11) {
                        imageReceiver5.v0 = true;
                        imageReceiver5.h1 = null;
                        imageReceiver5.J0(org.telegram.messenger.g0.u / 2);
                        imageReceiver5.X(1);
                        b9Var.k(fj.B0(fjVar4.k), null, null, null);
                        if (fjVar4.k.action instanceof TLRPC.TL_messageActionUserUpdatedPhoto) {
                            imageReceiver = imageReceiver5;
                            imageReceiver.q0(null, null, b9Var, null, fjVar4, 0);
                        } else {
                            imageReceiver = imageReceiver5;
                            if (fjVar4.I1 == null) {
                                int size6 = fjVar4.p0.size();
                                for (int i41 = 0; i41 < size6; i41++) {
                                    photoSize = (TLRPC.PhotoSize) fjVar4.p0.get(i41);
                                    if (photoSize instanceof TLRPC.TL_photoStrippedSize) {
                                        break;
                                    }
                                }
                            }
                            photoSize = null;
                            TLRPC.PhotoSize w11 = org.telegram.messenger.w7.w(fjVar4.p0, 640, false, null, false);
                            if (w11 != null) {
                                TLRPC.Photo photo2 = fjVar4.k.action.photo;
                                if (!photo2.video_sizes.isEmpty()) {
                                    int i42 = bz.a;
                                    if (pc.e(2048)) {
                                        videoSize = org.telegram.messenger.w7.x(1000, photo2.video_sizes);
                                        if (!fjVar4.z0 && !org.telegram.messenger.a6.q(i7).c(4, videoSize.size)) {
                                            this.y0 = fc.j(videoSize, photo2);
                                            org.telegram.messenger.a6.q(i7).a(org.telegram.messenger.w7.r(null, videoSize), fjVar4, this);
                                        }
                                        if (videoSize == null) {
                                            imageReceiver.r0(fc.j(videoSize, photo2), "g", fc.f(photoSize, fjVar4.n0), "50_50_b", fjVar4.I1, 0L, null, fjVar4, 1);
                                        } else {
                                            imageReceiver.r0(fc.f(w11, fjVar4.n0), "150_150", fc.f(photoSize, fjVar4.n0), "50_50_b", fjVar4.I1, 0L, null, fjVar4, 1);
                                        }
                                    }
                                }
                                videoSize = null;
                                if (videoSize == null) {
                                }
                            } else {
                                imageReceiver2 = imageReceiver;
                                imageReceiver2.w0(b9Var);
                                imageReceiver2.O0(!PhotoViewer.L1(fjVar4), false);
                            }
                        }
                        imageReceiver2 = imageReceiver;
                        imageReceiver2.O0(!PhotoViewer.L1(fjVar4), false);
                    } else {
                        imageReceiver5.v0 = true;
                        imageReceiver5.h1 = null;
                        imageReceiver5.w0(null);
                    }
                }
                i20 = i7;
                h6Var2 = h6Var;
            }
        }
        i10 = 8;
        if (!this.l0) {
        }
        s01Var = this.o0;
        if (s01Var != null) {
        }
        i17 = 0;
        this.m0 = 0;
        paddingTop = getPaddingTop();
        i18 = this.m0;
        if (paddingTop != i18) {
        }
        this.U1.setVisibility((W(fjVar) || S()) ? i10 : i17);
        qg.c.b(fjVar4);
        requestLayout();
    }

    @Override // org.telegram.ui.Cells.z, android.view.View, org.telegram.ui.Cells.r9
    public final void invalidate() {
        super.invalidate();
        View view = this.w;
        if (view != null) {
            view.invalidate();
        }
        Runnable runnable = this.u2;
        if (runnable != null) {
            runnable.run();
        }
        if (!this.t2 || getParent() == null) {
            return;
        }
        View view2 = (View) getParent();
        if (view2.getParent() != null) {
            view2.invalidate();
            ((View) view2.getParent()).invalidate();
        }
    }

    @Override // org.telegram.ui.Cells.q4
    public final /* synthetic */ boolean j() {
        return false;
    }

    public final void j0(int i7, int i10) {
        this.U0 = i7;
        this.V0 = i10;
    }

    public final void k0(float f10, int i7) {
        this.x0 = true;
        this.w0 = i7;
        this.u0 = f10;
        this.v0 = 0.0f;
    }

    @Override // org.telegram.ui.Cells.q4
    public final /* synthetic */ boolean l() {
        return false;
    }

    public final void l0() {
        final int i7 = 1;
        final int i10 = 0;
        if (this.c2 != null && this.d2 && this.Q0 != null) {
            boolean b02 = b0();
            boolean z10 = this.f2;
            if (b02 != z10) {
                this.f2 = !z10;
                final fj fjVar = this.Q0;
                post(new Runnable(this) { // from class: org.telegram.ui.Cells.r0
                    public final /* synthetic */ v0 b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                v0 v0Var = this.b;
                                fj fjVar2 = v0Var.Q0;
                                fj fjVar3 = fjVar;
                                if (fjVar2 == fjVar3) {
                                    v0Var.i0(fjVar3, true);
                                    v0Var.requestLayout();
                                    break;
                                }
                                break;
                            default:
                                v0 v0Var2 = this.b;
                                fj fjVar4 = v0Var2.Q0;
                                fj fjVar5 = fjVar;
                                if (fjVar4 == fjVar5) {
                                    v0Var2.i0(fjVar5, true);
                                    v0Var2.requestLayout();
                                    break;
                                }
                                break;
                        }
                    }
                });
            }
        }
        TLRPC.TL_messageActionStarGiftOnchainOffer tL_messageActionStarGiftOnchainOffer = this.c2;
        if (tL_messageActionStarGiftOnchainOffer == null || !this.d2 || this.Q0 == null || this.t1 == null) {
            return;
        }
        HashMap hashMap = bi.i4.a;
        int i11 = tL_messageActionStarGiftOnchainOffer.expires_at;
        int i12 = this.I;
        int max = Math.max(0, i11 - ConnectionsManager.getInstance(i12).getCurrentTime());
        if (max <= 0) {
            if (this.e2 == 0) {
                return;
            }
            this.e2 = 0;
            this.d2 = bi.i4.i(i12, this.c2);
            final fj fjVar2 = this.Q0;
            post(new Runnable(this) { // from class: org.telegram.ui.Cells.r0
                public final /* synthetic */ v0 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i7) {
                        case 0:
                            v0 v0Var = this.b;
                            fj fjVar22 = v0Var.Q0;
                            fj fjVar3 = fjVar2;
                            if (fjVar22 == fjVar3) {
                                v0Var.i0(fjVar3, true);
                                v0Var.requestLayout();
                                break;
                            }
                            break;
                        default:
                            v0 v0Var2 = this.b;
                            fj fjVar4 = v0Var2.Q0;
                            fj fjVar5 = fjVar2;
                            if (fjVar4 == fjVar5) {
                                v0Var2.i0(fjVar5, true);
                                v0Var2.requestLayout();
                                break;
                            }
                            break;
                    }
                }
            });
            return;
        }
        if (max != this.e2) {
            this.e2 = max;
            this.t1.a(c0(bi.i4.d(this.c2), this.c2), this.G1, this.t1.d);
        }
        postInvalidateDelayed(1016 - (System.currentTimeMillis() % 1000));
    }

    @Override // org.telegram.ui.Cells.q4
    public final /* synthetic */ boolean m() {
        return false;
    }

    public final void n0(boolean z10) {
        if (getMeasuredWidth() != 0) {
            B(getMeasuredWidth(), this.S0);
            invalidate();
        }
        if (this.D0) {
            v();
        } else if (z10) {
            org.telegram.messenger.g0.g3(new n0(this, 0));
        } else {
            requestLayout();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        s0 s0Var;
        super.onAttachedToWindow();
        this.j2 = true;
        this.J.P();
        setStarsPaused(false);
        this.s0 = org.telegram.ui.Components.y5.update(0, this, (!this.s || (s0Var = this.g1) == null || s0Var.h()) ? false : true, this.s0, this.N);
        t0 t0Var = this.t1;
        if (t0Var != null) {
            t0Var.h = org.telegram.ui.Components.y5.update(0, (View) t0Var.i, false, (org.telegram.ui.Components.u5) t0Var.h, (StaticLayout) t0Var.f);
        }
        int i7 = this.I;
        ks.f(i7).c(this, ks.Y2);
        ks.f(i7).c(this, ks.Z2);
        ks.f(i7).c(this, ks.H3);
        ks.f(i7).c(this, ks.y0);
        ks.f(i7).c(this, ks.d4);
        ks.e().c(this, ks.l4);
        ks.e().c(this, ks.L3);
        fj fjVar = this.Q0;
        if (fjVar != null && fjVar.D == 21) {
            i0(fjVar, true);
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
        s01 s01Var = this.o0;
        if (s01Var != null) {
            s01Var.a();
        }
        vw0 vw0Var = this.P0;
        if (vw0Var != null) {
            vw0Var.d.R(vw0Var.b);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.j2 = false;
        int i7 = this.I;
        org.telegram.messenger.a6.q(i7).v(this);
        this.J.R();
        setStarsPaused(true);
        this.D0 = false;
        org.telegram.ui.Components.y5.release(this, this.s0);
        t0 t0Var = this.t1;
        if (t0Var != null) {
            org.telegram.ui.Components.y5.release((v0) t0Var.i, (org.telegram.ui.Components.u5) t0Var.h);
        }
        ks.f(i7).n(this, ks.Y2);
        ks.f(i7).n(this, ks.Z2);
        ks.f(i7).n(this, ks.H3);
        ks.f(i7).n(this, ks.y0);
        ks.f(i7).n(this, ks.d4);
        ks.e().n(this, ks.l4);
        ks.e().n(this, ks.L3);
        this.e0.g();
        this.x2.a = false;
        di.h6 h6Var = this.I0;
        if (h6Var != null) {
            h6Var.S = false;
            h6Var.d.R();
            h6Var.e.b();
            bi.l1 l1Var = h6Var.y;
            l1Var.d.R();
            org.telegram.ui.Components.y5.release((View) null, l1Var.q);
            l1Var.q = null;
        }
        this.F0.p();
        s01 s01Var = this.o0;
        if (s01Var != null) {
            s01Var.b();
        }
        vw0 vw0Var = this.P0;
        if (vw0Var != null) {
            vw0Var.d.R(null);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:257:0x0eb5, code lost:
    
        if (bi.i4.l(r37, r1.offer_id) != false) goto L408;
     */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0e0f  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0ea5  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0f39  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0f6b  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x0fa6  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x100c  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x0fd8  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x0fe2  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x0fda  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x0fab  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x0f81  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x0ee1  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x04a1  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x053e  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x055b  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x05a0 A[LOOP:1: B:87:0x059e->B:88:0x05a0, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x057b  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x057d  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x05c2  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onDraw(Canvas canvas) {
        char c10;
        int i7;
        char c11;
        int i10;
        TextPaint textPaint;
        int i11;
        ArrayList arrayList;
        int i12;
        RadialProgress2 radialProgress2;
        int i13;
        v0 v0Var;
        float f10;
        float L;
        int i14;
        Canvas canvas2;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        xy0 xy0Var;
        float i15;
        Paint P;
        boolean d;
        ColorMatrix colorMatrix;
        int i16;
        float f16;
        v0 v0Var2;
        int i17;
        xy0 xy0Var2;
        s0 s0Var;
        int size;
        int i18;
        TextPaint textPaint2;
        Canvas canvas3 = canvas;
        canvas3.save();
        canvas3.translate(this.k0 / 2.0f, getPaddingTop());
        fj fjVar = this.Q0;
        float d2 = this.r1.d(!this.p1);
        int i19 = this.i1;
        boolean S = S();
        fi.e7 e7Var = this.e0;
        TextPaint textPaint3 = this.G1;
        ImageReceiver imageReceiver = this.J;
        if (!S && this.P0 == null && W(fjVar)) {
            this.i1 = this.j1 - org.telegram.messenger.g0.L(106.0f);
            if (Y()) {
                i19 = O(fjVar);
                float f17 = (this.W - i19) / 2.0f;
                float L2 = org.telegram.messenger.g0.L(16.0f) + org.telegram.messenger.g0.L(4.0f) + this.T + this.P;
                if (fjVar.z4()) {
                    e7Var.d = fjVar.k.media.storyItem;
                }
                float f18 = i19;
                e7Var.F.set(f17, L2, f17 + f18, f18 + L2);
                int i20 = fjVar.D;
                if (i20 == 31 || i20 == 33 || i20 == 34 || i20 == 35) {
                    f17 += org.telegram.messenger.g0.L(10.0f);
                    L2 += org.telegram.messenger.g0.L(10.0f);
                    i19 -= org.telegram.messenger.g0.L(20.0f);
                }
                if (fjVar.D == 37) {
                    f17 += org.telegram.messenger.g0.L(2.0f);
                }
                imageReceiver.y0(f17, L2, Math.max(0, i19), Math.max(0, i19));
                int i21 = fjVar.D;
                if (i21 == 31 || i21 == 33 || i21 == 34 || i21 == 35) {
                    i19 = org.telegram.messenger.g0.L(20.0f) + i19;
                }
            } else {
                int i22 = fjVar.D;
                if (i22 == 11) {
                    int i23 = this.W;
                    float f19 = this.i1;
                    imageReceiver.y0((i23 - r3) / 2.0f, (this.j1 * 0.075f) + this.T + this.P, f19, f19);
                } else {
                    if (i22 == 25) {
                        i19 = (int) (this.i1 * (org.telegram.messenger.g0.Q1() ? 1.0f : 1.2f));
                        float f20 = i19;
                        imageReceiver.y0((this.W - i19) / 2.0f, ((this.j1 * 0.075f) + (this.T + this.P)) - org.telegram.messenger.g0.L(22.0f), f20, f20);
                    } else if (fjVar.s4()) {
                        float f21 = i19;
                        imageReceiver.y0((this.W - i19) / 2.0f, (this.j1 * 0.075f) + this.T + this.P + org.telegram.messenger.g0.L(2.0f), f21, f21);
                    } else if (fjVar.D == 30) {
                        i19 = (int) (this.i1 * 1.1f);
                        TLRPC.Message message = fjVar.k;
                        if (message == null || (message.action instanceof TLRPC.TL_messageActionStarGift)) {
                            float f22 = i19;
                            imageReceiver.y0((this.W - i19) / 2.0f, ((this.j1 * 0.075f) + (this.T + this.P)) - org.telegram.messenger.g0.L(12.0f), f22, f22);
                        } else {
                            float f23 = i19;
                            imageReceiver.y0((this.W - i19) / 2.0f, ((this.j1 * 0.075f) + (this.T + this.P)) - org.telegram.messenger.g0.L(22.0f), f23, f23);
                        }
                    } else {
                        i19 = (int) (this.i1 * 1.0f);
                        float f24 = i19;
                        imageReceiver.y0((this.W - i19) / 2.0f, ((this.j1 * 0.075f) + (this.T + this.P)) - org.telegram.messenger.g0.L(4.0f), f24, f24);
                    }
                    textPaint2 = (TextPaint) P("paintChatActionText");
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
            textPaint2 = (TextPaint) P("paintChatActionText");
            this.t0 = textPaint2;
            if (textPaint2 != null) {
            }
        }
        int i24 = i19;
        F(canvas3, false);
        if (T()) {
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
        boolean S2 = S();
        int i25 = this.I;
        RadialProgress2 radialProgress22 = this.K1;
        if (S2) {
            canvas3.save();
            float width2 = (getWidth() - this.I0.d()) / 2.0f;
            this.G0 = width2;
            float L3 = this.I0.p ? org.telegram.messenger.g0.L(4.0f) : org.telegram.messenger.g0.L(16.0f) + this.T + this.P;
            this.H0 = L3;
            canvas3.translate(width2, L3);
            this.I0.b(canvas3);
            s0 s0Var2 = this.g1;
            if (s0Var2 == null || s0Var2.h()) {
                this.I0.c(canvas3);
            }
            canvas3.restore();
        } else if (this.P0 != null) {
            canvas3.save();
            this.P0.a(canvas3);
            canvas3.restore();
        } else if (W(fjVar) || (fjVar != null && fjVar.D == 11)) {
            bi.c3 c3Var = this.T0;
            if (c3Var != null && ((i10 = fjVar.D) == 31 || i10 == 37 || i10 == 33)) {
                c3Var.setBounds((int) (imageReceiver.x() - org.telegram.messenger.g0.L(13.33f)), (int) (imageReceiver.z() - org.telegram.messenger.g0.L(14.0f)), (int) (imageReceiver.w() + imageReceiver.x() + org.telegram.messenger.g0.L(13.33f)), (int) (imageReceiver.v() + imageReceiver.z() + org.telegram.messenger.g0.L(14.0f)));
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
            G(canvas);
            l0();
            c10 = '%';
            if (fjVar.D == 37) {
                bg.t.a(canvas3, org.telegram.ui.ActionBar.m6.S0, imageReceiver.x() + org.telegram.messenger.g0.L(26.0f), imageReceiver.z() + org.telegram.messenger.g0.L(26.0f), org.telegram.messenger.g0.L(52.0f));
            }
            radialProgress22.a.set(imageReceiver.x(), imageReceiver.z(), imageReceiver.w() + imageReceiver.x(), imageReceiver.v() + imageReceiver.z());
            int i26 = fjVar.D;
            if (i26 == 21) {
                x30 x30Var = (x30) mp.u1(i25).E7.get(fjVar.k.local_id);
                if (x30Var != null) {
                    radialProgress22.p(true, x30Var.X);
                    radialProgress22.setCircleRadius(((int) (imageReceiver.w() * 0.5f)) + 1);
                    radialProgress22.G = org.telegram.messenger.g0.L(24.0f);
                    radialProgress22.g(org.telegram.ui.ActionBar.m6.cf, org.telegram.ui.ActionBar.m6.df, org.telegram.ui.ActionBar.m6.ef, org.telegram.ui.ActionBar.m6.ff);
                    if (x30Var.X == 1.0f) {
                        radialProgress22.setIcon(4, true, true);
                    } else {
                        radialProgress22.setIcon(3, true, true);
                    }
                }
                radialProgress22.draw(canvas3);
                i7 = 22;
            } else {
                i7 = 22;
                if (i26 == 22) {
                    float Q = Q(fjVar);
                    radialProgress22.p(true, Q);
                    radialProgress22.setCircleRadius(org.telegram.messenger.g0.L(26.0f));
                    radialProgress22.G = org.telegram.messenger.g0.L(24.0f);
                    radialProgress22.g(org.telegram.ui.ActionBar.m6.cf, org.telegram.ui.ActionBar.m6.df, org.telegram.ui.ActionBar.m6.ef, org.telegram.ui.ActionBar.m6.ff);
                    if (Q == 1.0f) {
                        radialProgress22.setIcon(4, true, true);
                        c11 = 3;
                    } else {
                        c11 = 3;
                        radialProgress22.setIcon(3, true, true);
                    }
                    radialProgress22.draw(canvas3);
                    textPaint = this.t0;
                    i11 = i7;
                    arrayList = this.q0;
                    if (textPaint != null || this.N == null) {
                        i12 = i25;
                        radialProgress2 = radialProgress22;
                        i13 = i11;
                    } else {
                        canvas3.save();
                        canvas3.translate(this.U, this.T);
                        if (this.N.getPaint() != this.t0) {
                            v();
                        }
                        canvas3.save();
                        xh.f.d(canvas3, arrayList);
                        xh.f.f(canvas3, this.N);
                        s0 s0Var3 = this.g1;
                        if (s0Var3 == null || s0Var3.h()) {
                            StaticLayout staticLayout = this.N;
                            radialProgress2 = radialProgress22;
                            i13 = i11;
                            i12 = i25;
                            org.telegram.ui.Components.y5.drawAnimatedEmojis(canvas, staticLayout, this.s0, 0.0f, arrayList, 0.0f, 0.0f, 0.0f, 1.0f, staticLayout == null ? null : M(staticLayout.getPaint().getColor()));
                            canvas3 = canvas;
                        } else {
                            i12 = i25;
                            radialProgress2 = radialProgress22;
                            i13 = i11;
                        }
                        canvas3.restore();
                        int size2 = arrayList.size();
                        int i27 = 0;
                        while (i27 < size2) {
                            Object obj = arrayList.get(i27);
                            i27++;
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
                        s0Var = this.g1;
                        if (s0Var != null || s0Var.h()) {
                            StaticLayout staticLayout2 = this.Q;
                            org.telegram.ui.Components.u5 u5Var = this.s0;
                            StaticLayout staticLayout3 = this.N;
                            org.telegram.ui.Components.y5.drawAnimatedEmojis(canvas, staticLayout2, u5Var, 0.0f, arrayList, 0.0f, 0.0f, 0.0f, 1.0f, staticLayout3 != null ? null : M(staticLayout3.getPaint().getColor()));
                            canvas3 = canvas;
                        }
                        canvas3.restore();
                        size = arrayList.size();
                        i18 = 0;
                        while (i18 < size) {
                            Object obj2 = arrayList.get(i18);
                            i18++;
                            xh.f fVar2 = (xh.f) obj2;
                            fVar2.h(this.Q.getPaint().getColor());
                            fVar2.draw(canvas3);
                        }
                        canvas3.restore();
                    }
                    if (S() && W(fjVar)) {
                        canvas3.save();
                        float f25 = (this.W - this.j1) / 2.0f;
                        if (fjVar.D != i13) {
                            f25 += org.telegram.messenger.g0.L(8.0f);
                        }
                        float f26 = f25;
                        if (Y()) {
                            RectF rectF = this.N1;
                            f10 = (rectF != null ? rectF.top : org.telegram.messenger.g0.L(4.0f) + this.T + this.P) + (i24 > 0 ? org.telegram.messenger.f3.D(16.0f, 2, i24) : org.telegram.messenger.g0.L(16.0f));
                        } else {
                            float f27 = (this.j1 * 0.075f) + this.T + this.P;
                            if (fjVar.D != 21) {
                                i24 = this.i1;
                            }
                            float L4 = f27 + i24 + org.telegram.messenger.g0.L(4.0f);
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
                        int i28 = fjVar.D;
                        if (i28 == 31 || i28 == 37 || i28 == 33) {
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
                        int i29 = TLObject.FLAG_28;
                        if (staticLayout4 == null || (xy0Var2 = this.m1) == null) {
                            i14 = 33;
                            canvas2 = canvas3;
                            f11 = 0.0f;
                        } else {
                            float k10 = xy0Var2.k() + org.telegram.messenger.g0.L(12.0f);
                            float A = com.google.android.gms.internal.vision.e2.A(this.j1 - org.telegram.messenger.g0.L(16.0f), k10, 2.0f, f26);
                            float height2 = f10 + this.k1.getHeight() + org.telegram.messenger.g0.L(14.0f);
                            if (this.l1 == null) {
                                this.l1 = new Paint(1);
                            }
                            this.l1.setColor(org.telegram.ui.ActionBar.m6.j1() ? 285212671 : 268435456);
                            RectF rectF2 = org.telegram.messenger.g0.P;
                            rectF2.set(A, height2 - org.telegram.messenger.g0.L(8.0f), k10 + A, org.telegram.messenger.g0.L(8.0f) + height2);
                            canvas3.drawRoundRect(rectF2, org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), this.l1);
                            Canvas canvas4 = canvas3;
                            f11 = 0.0f;
                            i14 = 33;
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
                        if (fjVar.D == i13) {
                            RadialProgress2 radialProgress23 = radialProgress2;
                            if ((radialProgress23.c ? radialProgress23.j : radialProgress23.i).b() == 1.0f) {
                                i16 = 4;
                                if (radialProgress23.a() == 4) {
                                    if (this.t1 != null) {
                                        canvas2.save();
                                        canvas2.translate((this.j1 - ((StaticLayout) this.t1.f).getWidth()) / 2.0f, f11);
                                        this.t1.b = ((this.j1 - ((StaticLayout) r3.f).getWidth()) / 2.0f) + f26;
                                        this.t1.e = f29;
                                        int color = textPaint3.getColor();
                                        t0 t0Var = this.t1;
                                        f16 = f26;
                                        f14 = f11;
                                        f15 = 8.0f;
                                        f12 = 0.2f;
                                        xh.f.g(this, false, color, 0, (AtomicReference) t0Var.g, 1, (StaticLayout) t0Var.f, t0Var.c, canvas, false);
                                        t0 t0Var2 = this.t1;
                                        org.telegram.ui.Components.y5.drawAnimatedEmojis(canvas, (StaticLayout) t0Var2.f, (org.telegram.ui.Components.u5) t0Var2.h, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f, M(textPaint3.getColor()));
                                        canvas3 = canvas;
                                        canvas3.restore();
                                        v0Var = this;
                                        f13 = f16;
                                    } else {
                                        f12 = 0.2f;
                                        f14 = f11;
                                        f15 = 8.0f;
                                        v0Var = this;
                                        canvas3 = canvas2;
                                        f13 = f26;
                                    }
                                }
                            } else {
                                i16 = 4;
                            }
                            f12 = 0.2f;
                            f16 = f26;
                            f14 = f11;
                            f15 = 8.0f;
                            int i30 = i14;
                            canvas3 = canvas2;
                            if (this.B1 == null) {
                                TextPaint textPaint6 = new TextPaint();
                                this.A1 = textPaint6;
                                textPaint6.setTextSize(org.telegram.messenger.g0.L(13.0f));
                                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(gd.M0(2131754555));
                                int indexOf = spannableStringBuilder.toString().indexOf("...");
                                if (indexOf < 0) {
                                    indexOf = spannableStringBuilder.toString().indexOf("…");
                                    i17 = 1;
                                } else {
                                    i17 = 3;
                                }
                                if (indexOf >= 0) {
                                    SpannableString spannableString = new SpannableString("…");
                                    fi.l9 l9Var = new fi.l9();
                                    l9Var.r = true;
                                    l9Var.b(this);
                                    spannableString.setSpan(l9Var, 0, spannableString.length(), i30);
                                    spannableStringBuilder.replace(indexOf, indexOf + i17, (CharSequence) spannableString);
                                }
                                TextPaint textPaint7 = this.A1;
                                t0 t0Var3 = this.t1;
                                this.B1 = new StaticLayout(spannableStringBuilder, textPaint7, t0Var3 == null ? 1 : t0Var3.d, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                            }
                            float Q2 = Q(fjVar);
                            if (this.D1 == null || this.C1 != Q2) {
                                this.C1 = Q2;
                                String n10 = a8.p0.n((int) (Q2 * 100.0f), "%", new StringBuilder());
                                t0 t0Var4 = this.t1;
                                this.D1 = new StaticLayout(n10, textPaint3, t0Var4 == null ? 1 : t0Var4.d, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                            }
                            this.A1.setColor(textPaint3.getColor());
                            if (radialProgress23.a() == i16) {
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
                                    t0 t0Var5 = this.t1;
                                    xh.f.g(this, false, color3, 0, (AtomicReference) t0Var5.g, 1, (StaticLayout) t0Var5.f, t0Var5.c, canvas3, false);
                                    t0 t0Var6 = this.t1;
                                    v0Var2 = this;
                                    org.telegram.ui.Components.y5.drawAnimatedEmojis(canvas, (StaticLayout) t0Var6.f, (org.telegram.ui.Components.u5) t0Var6.h, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f, M(textPaint3.getColor()));
                                    canvas3 = canvas;
                                    canvas3.restore();
                                } else {
                                    v0Var2 = this;
                                }
                                textPaint3.setAlpha((int) (Color.alpha(color2) * f30));
                                textPaint3.linkColor = textPaint3.getColor();
                                float f32 = (f30 * 0.2f) + 0.8f;
                                canvas3.save();
                                canvas3.scale(f32, f32, v0Var2.j1 / 2.0f, v0Var2.B1.getHeight() / 2.0f);
                                canvas3.translate((v0Var2.j1 - v0Var2.B1.getWidth()) / 2.0f, f14);
                                xh.f.f(canvas3, v0Var2.B1);
                                canvas3.restore();
                                canvas3.save();
                                canvas3.translate(f14, org.telegram.messenger.g0.L(4.0f) + v0Var2.B1.getHeight());
                                canvas3.scale(f32, f32, v0Var2.j1 / 2.0f, v0Var2.D1.getHeight() / 2.0f);
                                canvas3.translate((v0Var2.j1 - v0Var2.D1.getWidth()) / 2.0f, f14);
                                xh.f.f(canvas3, v0Var2.D1);
                                canvas3.restore();
                                textPaint3.setColor(color2);
                                textPaint3.linkColor = color2;
                            } else {
                                v0Var2 = this;
                                canvas3.save();
                                canvas3.translate((v0Var2.j1 - v0Var2.B1.getWidth()) / 2.0f, f14);
                                v0Var2.B1.draw(canvas3);
                                canvas3.restore();
                                canvas3.save();
                                canvas3.translate((v0Var2.j1 - v0Var2.D1.getWidth()) / 2.0f, org.telegram.messenger.g0.L(4.0f) + v0Var2.B1.getHeight());
                                xh.f.f(canvas3, v0Var2.D1);
                                canvas3.restore();
                            }
                            v0Var = v0Var2;
                            f13 = f16;
                        } else {
                            f12 = 0.2f;
                            f13 = f26;
                            f14 = f11;
                            f15 = 8.0f;
                            canvas3 = canvas2;
                            t0 t0Var7 = this.t1;
                            if (t0Var7 != null) {
                                float height3 = ((StaticLayout) t0Var7.f).getHeight();
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
                                t0 t0Var8 = this.t1;
                                t0Var8.e = f29;
                                int color4 = t0Var8.a.getColor();
                                t0 t0Var9 = this.t1;
                                float f33 = height3;
                                xh.f.g(this, false, color4, 0, (AtomicReference) t0Var9.g, 1, (StaticLayout) t0Var9.f, t0Var9.c, canvas3, false);
                                t0 t0Var10 = this.t1;
                                StaticLayout staticLayout5 = (StaticLayout) t0Var10.f;
                                org.telegram.ui.Components.u5 u5Var2 = (org.telegram.ui.Components.u5) t0Var10.h;
                                ColorFilter M = M(textPaint3.getColor());
                                v0Var = this;
                                org.telegram.ui.Components.y5.drawAnimatedEmojis(canvas, staticLayout5, u5Var2, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f, M);
                                canvas3 = canvas;
                                if (d2 < 1.0f && v0Var.x1 != null) {
                                    canvas3.save();
                                    if (v0Var.s1 == null) {
                                        v0Var.s1 = new h6.m(29);
                                    }
                                    canvas3.translate((-((v0Var.j1 - org.telegram.messenger.g0.L(16.0f)) - ((StaticLayout) v0Var.t1.f).getWidth())) / 2.0f, f14);
                                    RectF rectF4 = org.telegram.messenger.g0.P;
                                    rectF4.set((v0Var.u1 - v0Var.x1.g()) + org.telegram.messenger.g0.L(8.0f), (v0Var.v1 - v0Var.w1) - org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f) + v0Var.u1, v0Var.v1);
                                    float f34 = 1.0f - d2;
                                    v0Var.s1.k(canvas3, rectF4, f34);
                                    rectF4.set((v0Var.u1 - v0Var.x1.g()) - org.telegram.messenger.g0.L(16.0f), (v0Var.v1 - v0Var.w1) - org.telegram.messenger.g0.L(6.0f), (v0Var.u1 - v0Var.x1.g()) + org.telegram.messenger.g0.L(8.0f), v0Var.v1);
                                    v0Var.s1.n(canvas3, rectF4, 2, f34);
                                    rectF4.set(f14, f33 - org.telegram.messenger.g0.L(12.0f), v0Var.getWidth(), f33);
                                    v0Var.s1.n(canvas3, rectF4, 3, (1.0f - f34) * f34 * 4.0f);
                                    canvas3.restore();
                                }
                                canvas3.restore();
                                if (d2 < 1.0f && (xy0Var = v0Var.x1) != null) {
                                    xy0Var.c((v0Var.u1 - xy0Var.g()) + org.telegram.messenger.g0.L(5.0f), (v0Var.v1 - (v0Var.w1 / 2.0f)) - org.telegram.messenger.g0.L(1.0f), 1.0f - d2, v0Var.t1.a.getColor(), canvas3);
                                }
                            } else {
                                v0Var = this;
                            }
                        }
                        canvas3.restore();
                        if (v0Var.k1 == null) {
                            org.telegram.messenger.g0.L(f15);
                        }
                        t0 t0Var11 = v0Var.t1;
                        if (t0Var11 != null) {
                            ((StaticLayout) t0Var11.f).getHeight();
                        }
                        StaticLayout staticLayout6 = v0Var.y1;
                        if (staticLayout6 != null) {
                            staticLayout6.getHeight();
                        }
                        v0Var.getHeight();
                        org.telegram.messenger.g0.L(f15);
                        org.telegram.ui.ActionBar.h6 h6Var = v0Var.h1;
                        if (h6Var != null) {
                            h6Var.e(v0Var.v0, v0Var.u0 + org.telegram.messenger.g0.L(4.0f), v0Var.getMeasuredWidth(), v0Var.w0);
                        } else {
                            org.telegram.ui.ActionBar.m6.r(v0Var.v0, v0Var.u0 + org.telegram.messenger.g0.L(4.0f), v0Var.getMeasuredWidth(), v0Var.w0);
                        }
                        float a10 = v0Var.n.a(0.02f);
                        canvas3.save();
                        RectF rectF5 = v0Var.p0;
                        canvas3.scale(a10, a10, rectF5.centerX(), rectF5.centerY());
                        if (v0Var.y1 != null) {
                            canvas3.drawRoundRect(rectF5, org.telegram.messenger.g0.L(15.0f), org.telegram.messenger.g0.L(15.0f), v0Var.P("paintChatActionBackgroundSelected"));
                            if (v0Var.R()) {
                                canvas3.drawRoundRect(rectF5, org.telegram.messenger.g0.L(15.0f), org.telegram.messenger.g0.L(15.0f), v0Var.P("paintChatActionBackgroundDarken"));
                            }
                            float f35 = v0Var.h2;
                            Paint paint = v0Var.i2;
                            if (f35 > f14) {
                                canvas3.drawRoundRect(rectF5, org.telegram.messenger.g0.L(15.0f), org.telegram.messenger.g0.L(15.0f), paint);
                            }
                            if (v0Var.getMessageObject().D == 31 || v0Var.getMessageObject().D == 37 || v0Var.getMessageObject().D == 33) {
                                boolean d10 = h6Var != null ? h6Var.d() : org.telegram.ui.ActionBar.m6.j1();
                                int color5 = paint.getColor();
                                if (d10) {
                                    i29 = 620756991;
                                }
                                paint.setColor(i29);
                                canvas3.drawRoundRect(rectF5, org.telegram.messenger.g0.L(15.0f), org.telegram.messenger.g0.L(15.0f), paint);
                                paint.setColor(color5);
                            }
                            TLRPC.TL_messageActionStarGiftOnchainOffer tL_messageActionStarGiftOnchainOffer = v0Var.c2;
                            if ((tL_messageActionStarGiftOnchainOffer == null || tL_messageActionStarGiftOnchainOffer.buyer) && (v0Var.getMessageObject().D == 31 || v0Var.getMessageObject().D == 37 || v0Var.getMessageObject().D == 33 || v0Var.getMessageObject().D == 21 || v0Var.getMessageObject().D == 22 || v0Var.getMessageObject().D == 24)) {
                                v0Var.invalidate();
                            } else {
                                Path path2 = v0Var.V1;
                                path2.rewind();
                                path2.addRoundRect(rectF5, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), Path.Direction.CW);
                                canvas3.save();
                                canvas3.clipPath(path2);
                                ug.s1 s1Var = v0Var.W1;
                                s1Var.d(canvas3);
                                if (!s1Var.g) {
                                    v0Var.invalidate();
                                }
                                canvas3.restore();
                            }
                        }
                        boolean z10 = fjVar.q;
                        if (z10) {
                            float f36 = v0Var.d0;
                            if (f36 != 1.0f) {
                                v0Var.d0 = f36 + 0.10666667f;
                                i15 = Utilities.i(v0Var.d0, 1.0f, f14);
                                v0Var.d0 = i15;
                                if (i15 != f14) {
                                    if (v0Var.c0 == null) {
                                        v0Var.c0 = new RadialProgressView(v0Var.getContext());
                                    }
                                    int L6 = org.telegram.messenger.g0.L(16.0f);
                                    canvas3.save();
                                    float f37 = v0Var.d0;
                                    canvas3.scale(f37, f37, rectF5.centerX(), rectF5.centerY());
                                    v0Var.c0.setSize(L6);
                                    v0Var.c0.setProgressColor(org.telegram.ui.ActionBar.m6.v0(org.telegram.ui.ActionBar.m6.Zc));
                                    v0Var.c0.a(canvas3, rectF5.centerX(), rectF5.centerY());
                                    canvas3.restore();
                                }
                                if (v0Var.d0 != 1.0f && v0Var.y1 != null) {
                                    canvas3.save();
                                    float f38 = 1.0f - v0Var.d0;
                                    canvas3.scale(f38, f38, rectF5.centerX(), rectF5.centerY());
                                    canvas3.translate(f13, rectF5.top + org.telegram.messenger.g0.L(7.0f));
                                    canvas3.translate(((v0Var.j1 - org.telegram.messenger.g0.L(16.0f)) - v0Var.y1.getWidth()) / 2.0f, f14);
                                    v0Var.y1.draw(canvas3);
                                    canvas3.restore();
                                }
                                if (!fjVar.r) {
                                    TLRPC.TL_messageActionStarGiftOnchainOffer tL_messageActionStarGiftOnchainOffer2 = v0Var.c2;
                                    if (tL_messageActionStarGiftOnchainOffer2 != null && v0Var.d2) {
                                    }
                                    q80 q80Var = v0Var.r;
                                    if (q80Var != null) {
                                        q80Var.e(rectF5);
                                        v0Var.r.k(16.0f);
                                        v0Var.r.a();
                                        v0Var.r.draw(canvas3);
                                        if (v0Var.r.c()) {
                                            v0Var.r.b = -1L;
                                        }
                                    }
                                    canvas3.restore();
                                    if (v0Var.N1 != null && v0Var.S1 != null && v0Var.T1 != null) {
                                        P = v0Var.P("paintChatActionBackground");
                                        Paint P2 = v0Var.P("paintChatActionBackgroundDarken");
                                        float L7 = (v0Var.N1.right - org.telegram.messenger.g0.L(65.0f)) + org.telegram.messenger.g0.L(2.0f);
                                        float L8 = v0Var.N1.top - org.telegram.messenger.g0.L(2.0f);
                                        if (h6Var == null) {
                                            h6Var.e(v0Var.v0 + L7, v0Var.u0 + org.telegram.messenger.g0.L(4.0f) + L8, v0Var.getMeasuredWidth(), v0Var.w0);
                                        } else {
                                            org.telegram.ui.ActionBar.m6.r(v0Var.v0 + L7, v0Var.u0 + org.telegram.messenger.g0.L(4.0f) + L8, v0Var.getMeasuredWidth(), v0Var.w0);
                                        }
                                        canvas3.save();
                                        canvas3.translate(L7, L8);
                                        ColorFilter colorFilter = P.getColorFilter();
                                        PathEffect pathEffect = P.getPathEffect();
                                        d = h6Var == null ? h6Var.d() : org.telegram.ui.ActionBar.m6.j1();
                                        if (v0Var.Q1 != null || v0Var.P1 != d) {
                                            colorMatrix = new ColorMatrix();
                                            if ((P.getColorFilter() instanceof ColorMatrixColorFilter) && Build.VERSION.SDK_INT >= 26) {
                                                ((ColorMatrixColorFilter) P.getColorFilter()).getColorMatrix(colorMatrix);
                                            }
                                            org.telegram.messenger.g0.h(colorMatrix, !d ? 0.1f : -0.08f);
                                            org.telegram.messenger.g0.i(colorMatrix, d ? 0.15f : 0.1f);
                                            v0Var.Q1 = new ColorMatrixColorFilter(colorMatrix);
                                            v0Var.P1 = d;
                                        }
                                        P.setColorFilter(v0Var.Q1);
                                        P.setPathEffect(v0Var.R1);
                                        canvas3.drawPath(v0Var.S1, P);
                                        P.setColorFilter(colorFilter);
                                        P.setPathEffect(pathEffect);
                                        if (v0Var.R()) {
                                            PathEffect pathEffect2 = P2.getPathEffect();
                                            P2.setPathEffect(v0Var.R1);
                                            canvas3.drawPath(v0Var.S1, P2);
                                            P2.setPathEffect(pathEffect2);
                                        }
                                        canvas3.rotate(45.0f, org.telegram.messenger.g0.L(40.43f), org.telegram.messenger.g0.L(24.56f));
                                        v0Var.T1.c(org.telegram.messenger.g0.L(40.43f) - (v0Var.T1.g() / 2.0f), org.telegram.messenger.g0.L(26.0f), 1.0f, -1, canvas3);
                                        canvas3.restore();
                                    }
                                }
                                if (v0Var.r == null) {
                                    q80 q80Var2 = new q80(h6Var);
                                    v0Var.r = q80Var2;
                                    q80Var2.setCallback(v0Var);
                                    v0Var.r.h();
                                    q80 q80Var3 = v0Var.r;
                                    q80Var3.D = true;
                                    float f39 = f12;
                                    q80Var3.g(org.telegram.ui.ActionBar.m6.r1(0.08f, -1), org.telegram.ui.ActionBar.m6.r1(f39, -1), org.telegram.ui.ActionBar.m6.r1(f39, -1), org.telegram.ui.ActionBar.m6.r1(0.7f, -1));
                                    v0Var.r.x.setStrokeWidth(org.telegram.messenger.g0.L(1.0f));
                                }
                                q80 q80Var4 = v0Var.r;
                                q80Var4.c = -1L;
                                q80Var4.e(rectF5);
                                v0Var.r.k(16.0f);
                                v0Var.r.draw(canvas3);
                                canvas3.restore();
                                if (v0Var.N1 != null) {
                                    P = v0Var.P("paintChatActionBackground");
                                    Paint P22 = v0Var.P("paintChatActionBackgroundDarken");
                                    float L72 = (v0Var.N1.right - org.telegram.messenger.g0.L(65.0f)) + org.telegram.messenger.g0.L(2.0f);
                                    float L82 = v0Var.N1.top - org.telegram.messenger.g0.L(2.0f);
                                    if (h6Var == null) {
                                    }
                                    canvas3.save();
                                    canvas3.translate(L72, L82);
                                    ColorFilter colorFilter2 = P.getColorFilter();
                                    PathEffect pathEffect3 = P.getPathEffect();
                                    if (h6Var == null) {
                                    }
                                    if (v0Var.Q1 != null) {
                                    }
                                    colorMatrix = new ColorMatrix();
                                    if (P.getColorFilter() instanceof ColorMatrixColorFilter) {
                                        ((ColorMatrixColorFilter) P.getColorFilter()).getColorMatrix(colorMatrix);
                                    }
                                    org.telegram.messenger.g0.h(colorMatrix, !d ? 0.1f : -0.08f);
                                    org.telegram.messenger.g0.i(colorMatrix, d ? 0.15f : 0.1f);
                                    v0Var.Q1 = new ColorMatrixColorFilter(colorMatrix);
                                    v0Var.P1 = d;
                                    P.setColorFilter(v0Var.Q1);
                                    P.setPathEffect(v0Var.R1);
                                    canvas3.drawPath(v0Var.S1, P);
                                    P.setColorFilter(colorFilter2);
                                    P.setPathEffect(pathEffect3);
                                    if (v0Var.R()) {
                                    }
                                    canvas3.rotate(45.0f, org.telegram.messenger.g0.L(40.43f), org.telegram.messenger.g0.L(24.56f));
                                    v0Var.T1.c(org.telegram.messenger.g0.L(40.43f) - (v0Var.T1.g() / 2.0f), org.telegram.messenger.g0.L(26.0f), 1.0f, -1, canvas3);
                                    canvas3.restore();
                                }
                            }
                        }
                        if (!z10) {
                            float f40 = v0Var.d0;
                            if (f40 != f14) {
                                v0Var.d0 = f40 - 0.10666667f;
                            }
                        }
                        i15 = Utilities.i(v0Var.d0, 1.0f, f14);
                        v0Var.d0 = i15;
                        if (i15 != f14) {
                        }
                        if (v0Var.d0 != 1.0f) {
                            canvas3.save();
                            float f382 = 1.0f - v0Var.d0;
                            canvas3.scale(f382, f382, rectF5.centerX(), rectF5.centerY());
                            canvas3.translate(f13, rectF5.top + org.telegram.messenger.g0.L(7.0f));
                            canvas3.translate(((v0Var.j1 - org.telegram.messenger.g0.L(16.0f)) - v0Var.y1.getWidth()) / 2.0f, f14);
                            v0Var.y1.draw(canvas3);
                            canvas3.restore();
                        }
                        if (!fjVar.r) {
                        }
                        if (v0Var.r == null) {
                        }
                        q80 q80Var42 = v0Var.r;
                        q80Var42.c = -1L;
                        q80Var42.e(rectF5);
                        v0Var.r.k(16.0f);
                        v0Var.r.draw(canvas3);
                        canvas3.restore();
                        if (v0Var.N1 != null) {
                        }
                    } else {
                        v0Var = this;
                    }
                    v0Var.J(canvas3, false);
                    v0Var.x2.a();
                    canvas3.restore();
                }
            }
            c11 = 3;
            textPaint = this.t0;
            i11 = i7;
            arrayList = this.q0;
            if (textPaint != null) {
            }
            i12 = i25;
            radialProgress2 = radialProgress22;
            i13 = i11;
            if (this.t0 != null) {
                canvas3.save();
                canvas3.translate(this.V, this.T - this.R);
                if (this.Q.getPaint() != this.t0) {
                }
                canvas3.save();
                xh.f.d(canvas3, arrayList);
                xh.f.f(canvas3, this.Q);
                s0Var = this.g1;
                if (s0Var != null) {
                }
                StaticLayout staticLayout22 = this.Q;
                org.telegram.ui.Components.u5 u5Var3 = this.s0;
                StaticLayout staticLayout32 = this.N;
                org.telegram.ui.Components.y5.drawAnimatedEmojis(canvas, staticLayout22, u5Var3, 0.0f, arrayList, 0.0f, 0.0f, 0.0f, 1.0f, staticLayout32 != null ? null : M(staticLayout32.getPaint().getColor()));
                canvas3 = canvas;
                canvas3.restore();
                size = arrayList.size();
                i18 = 0;
                while (i18 < size) {
                }
                canvas3.restore();
            }
            if (S()) {
            }
            v0Var = this;
            v0Var.J(canvas3, false);
            v0Var.x2.a();
            canvas3.restore();
        }
        i7 = 22;
        c11 = 3;
        c10 = '%';
        textPaint = this.t0;
        i11 = i7;
        arrayList = this.q0;
        if (textPaint != null) {
        }
        i12 = i25;
        radialProgress2 = radialProgress22;
        i13 = i11;
        if (this.t0 != null) {
        }
        if (S()) {
        }
        v0Var = this;
        v0Var.J(canvas3, false);
        v0Var.x2.a();
        canvas3.restore();
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        fj fjVar = this.Q0;
        if (TextUtils.isEmpty(this.S0) && fjVar == null) {
            return;
        }
        if (this.s2 == null) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(!TextUtils.isEmpty(this.S0) ? this.S0 : fjVar.v);
            for (CharacterStyle characterStyle : (CharacterStyle[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), ClickableSpan.class)) {
                int spanStart = spannableStringBuilder.getSpanStart(characterStyle);
                int spanEnd = spannableStringBuilder.getSpanEnd(characterStyle);
                spannableStringBuilder.removeSpan(characterStyle);
                spannableStringBuilder.setSpan(new h(1, this, characterStyle), spanStart, spanEnd, 33);
            }
            this.s2 = spannableStringBuilder;
        }
        if (Build.VERSION.SDK_INT < 24) {
            accessibilityNodeInfo.setContentDescription(this.s2.toString());
        } else {
            accessibilityNodeInfo.setText(this.s2);
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
    public final void onMeasure(int i7, int i10) {
        float f10;
        float f11;
        int i11;
        boolean S;
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
        if (W(fjVar)) {
            this.j1 = n10.D(64.0f, (org.telegram.messenger.g0.q.y - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - org.telegram.messenger.g0.m, (int) (org.telegram.messenger.g0.Q1() ? org.telegram.messenger.g0.Q0() * 0.6f : (org.telegram.messenger.g0.q.x * 0.62f) - org.telegram.messenger.g0.L(34.0f)));
            if ((!org.telegram.messenger.g0.Q1() && ((i14 = fjVar.D) == 18 || i14 == 30 || X())) || fjVar.D == 35) {
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
            } else if (Y()) {
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
            } else if (W(fjVar)) {
                i13 = this.j1;
                L4 = org.telegram.messenger.g0.L(12.0f);
            } else if (T()) {
                f11 = 140.0f;
                i11 = (this.J0.q0 == null ? org.telegram.messenger.g0.L(140.0f) : ((int) Math.ceil(r3.q0.i())) + org.telegram.messenger.g0.L(150.0f)) + org.telegram.messenger.g0.L(8.0f);
                S = S();
                q0Var = this.F0;
                if (S) {
                    r9 = org.telegram.messenger.f3.C(8.0f, this.I0.P, this.I0.p ? 0 : org.telegram.messenger.g0.L(16.0f) + this.T + this.P);
                    if (!q0Var.p) {
                        L3 = org.telegram.messenger.g0.L(8.0f) + q0Var.m;
                        q0Var.n = L3;
                        r9 += L3;
                    }
                    f14 = 24.0f;
                } else {
                    vw0 vw0Var = this.P0;
                    if (vw0Var != null) {
                        r9 = org.telegram.messenger.g0.L(12.0f) + org.telegram.messenger.g0.L(f11) + ((int) vw0Var.f.i()) + (vw0Var.i ? org.telegram.messenger.g0.L(40.0f) : 0);
                        if (!q0Var.p) {
                            L3 = org.telegram.messenger.g0.L(8.0f) + q0Var.m;
                            q0Var.n = L3;
                            r9 += L3;
                        }
                    } else if (W(fjVar)) {
                        if (fjVar != null) {
                            f12 = 12.0f;
                            if (fjVar.D == 25) {
                                z10 = true;
                                int O = O(fjVar);
                                if (Y()) {
                                    f13 = 8.0f;
                                    f14 = 24.0f;
                                    L = (this.t1 == null ? 0 : org.telegram.messenger.g0.L(4.0f) + ((StaticLayout) r4.f).getHeight()) + (this.j1 * 0.075f) + this.T + this.P + O + org.telegram.messenger.g0.L(4.0f);
                                } else {
                                    f14 = 24.0f;
                                    f13 = 8.0f;
                                    int L5 = org.telegram.messenger.g0.L(4.0f) + this.T + this.P + (O > 0 ? org.telegram.messenger.f3.D(16.0f, 2, O) : org.telegram.messenger.g0.L(16.0f));
                                    t0 t0Var = this.t1;
                                    L = L5 + (t0Var == null ? 0 : org.telegram.messenger.g0.L(4.0f) + ((StaticLayout) t0Var.f).getHeight());
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
                                t0 t0Var2 = this.t1;
                                int height2 = t0Var2 != null ? 0 : ((StaticLayout) t0Var2.f).getHeight();
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
                                    float f16 = (this.W - this.E1) / 2.0f;
                                    f15 = 2.0f;
                                    rectF.set(f16 - org.telegram.messenger.g0.L(18.0f), A - org.telegram.messenger.g0.L(f13), f16 + this.E1 + org.telegram.messenger.g0.L(18.0f), A + (this.y1 != null ? r7.getHeight() : 0) + org.telegram.messenger.g0.L(f13));
                                } else {
                                    f15 = 2.0f;
                                    i11 -= org.telegram.messenger.g0.L(40.0f);
                                    this.L1 -= org.telegram.messenger.g0.L(40.0f);
                                    fj fjVar3 = this.Q0;
                                    if (fjVar3 != null && (message = fjVar3.k) != null && (message.action instanceof TLRPC.TL_messageActionStarGift)) {
                                        i11 -= org.telegram.messenger.g0.L(f13);
                                        this.L1 -= org.telegram.messenger.g0.L(f13);
                                    }
                                }
                                measuredWidth = getMeasuredWidth() << (getMeasuredHeight() + 16);
                                ug.s1 s1Var = this.W1;
                                s1Var.a.set(rectF);
                                s1Var.b.set(rectF);
                                if (this.X1 != measuredWidth) {
                                    this.X1 = measuredWidth;
                                    s1Var.f();
                                }
                                if (Y()) {
                                    int L8 = org.telegram.messenger.g0.L(4.0f) + this.T + this.P;
                                    this.f = 0;
                                    int D = O > 0 ? org.telegram.messenger.f3.D(16.0f, 2, O) : org.telegram.messenger.g0.L(16.0f);
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
                                    float f17 = (this.W - this.E1) / f15;
                                    if (this.y1 != null) {
                                        this.h = org.telegram.messenger.g0.L(7.0f) + i16 + L8;
                                        rectF.set(f17 - org.telegram.messenger.g0.L(18.0f), this.h, f17 + this.E1 + org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.f3.D(f13, 2, this.y1.getHeight() + this.h));
                                        this.f = (int) (rectF.height() + org.telegram.messenger.g0.L(4.0f) + this.f);
                                    } else if (!X() && (i12 = fjVar.D) != 34 && i12 != 33 && i12 != 35) {
                                        rectF.set(f17 - org.telegram.messenger.g0.L(18.0f), this.h, f17 + this.E1 + org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.f3.D(8.0f, 2, org.telegram.messenger.g0.L(17.0f) + this.h));
                                        this.f = org.telegram.messenger.g0.L(17.0f) + this.f;
                                    }
                                    int L9 = org.telegram.messenger.g0.L(15.0f) + this.f;
                                    this.f = L9;
                                    int L10 = org.telegram.messenger.g0.L(6.0f) + L8 + L9;
                                    if (!q0Var.p) {
                                        int L11 = org.telegram.messenger.g0.L(8.0f) + q0Var.m;
                                        q0Var.n = L11;
                                        L10 += L11;
                                    }
                                    r9 = L10;
                                    if (this.Z1 != null) {
                                        r9 += org.telegram.messenger.g0.L(44.0f);
                                    }
                                }
                                rectF.inset(org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(1.0f));
                            }
                        } else {
                            f12 = 12.0f;
                        }
                        z10 = false;
                        int O2 = O(fjVar);
                        if (Y()) {
                        }
                        this.L1 = 0;
                        if (this.k1 == null) {
                        }
                        t0 t0Var22 = this.t1;
                        if (t0Var22 != null) {
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
                        ug.s1 s1Var2 = this.W1;
                        s1Var2.a.set(rectF2);
                        s1Var2.b.set(rectF2);
                        if (this.X1 != measuredWidth) {
                        }
                        if (Y()) {
                        }
                        rectF2.inset(org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(1.0f));
                    }
                    f14 = 24.0f;
                }
                if (this.Q0 != null && !q0Var.p) {
                    int L12 = org.telegram.messenger.g0.L(8.0f) + q0Var.m;
                    q0Var.n = L12;
                    i11 += L12;
                }
                if (X()) {
                    i11 = org.telegram.messenger.f3.C(f14, this.R, i11);
                }
                if (fjVar == null && Y()) {
                    setMeasuredDimension(max, this.m0 + r9);
                } else {
                    setMeasuredDimension(max, org.telegram.messenger.g0.L(14.0f) + this.m0 + this.P + i11);
                }
                q0Var.c = (getMeasuredHeight() - getPaddingTop()) - q0Var.n;
            }
            i11 = L4 + i13;
            f11 = 140.0f;
            S = S();
            q0Var = this.F0;
            if (S) {
            }
            if (this.Q0 != null) {
                int L122 = org.telegram.messenger.g0.L(8.0f) + q0Var.m;
                q0Var.n = L122;
                i11 += L122;
            }
            if (X()) {
            }
            if (fjVar == null) {
            }
            setMeasuredDimension(max, org.telegram.messenger.g0.L(14.0f) + this.m0 + this.P + i11);
            q0Var.c = (getMeasuredHeight() - getPaddingTop()) - q0Var.n;
        }
        f10 = 30.0f;
        f11 = 140.0f;
        i11 = 0;
        S = S();
        q0Var = this.F0;
        if (S) {
        }
        if (this.Q0 != null) {
        }
        if (X()) {
        }
        if (fjVar == null) {
        }
        setMeasuredDimension(max, org.telegram.messenger.g0.L(14.0f) + this.m0 + this.P + i11);
        q0Var.c = (getMeasuredHeight() - getPaddingTop()) - q0Var.n;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00ae, code lost:
    
        if (r11.i != false) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:109:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0459  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x047c  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x0997  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        x30 x30Var;
        TLRPC.Message message;
        TL_stars.StarGift starGift;
        t0 t0Var;
        kj kjVar;
        cg.a aVar;
        t0 t0Var2;
        TLRPC.Message message2;
        boolean z11;
        boolean z12;
        boolean z13;
        StaticLayout staticLayout;
        boolean z14;
        ArrayList arrayList;
        boolean z15;
        boolean z16;
        boolean z17;
        TLRPC.Message message3;
        int i7;
        boolean z18;
        boolean z19;
        n0 n0Var;
        fj fjVar = this.Q0;
        float x10 = motionEvent.getX() - (this.k0 / 2.0f);
        this.z0 = x10;
        float y10 = motionEvent.getY() + getPaddingTop();
        this.A0 = y10;
        if (fjVar == null) {
            if (this.k2 != null) {
                if (motionEvent.getAction() == 0) {
                    if (x10 >= this.b1 && x10 <= this.c1) {
                        this.G = true;
                        return true;
                    }
                } else if (this.G) {
                    if (motionEvent.getAction() == 1) {
                        this.k2.onClick(this);
                        this.G = false;
                    } else if (motionEvent.getAction() == 3) {
                        this.G = false;
                    }
                }
            }
            return super.onTouchEvent(motionEvent);
        }
        s01 s01Var = this.o0;
        if (s01Var == null || !s01Var.d(motionEvent, false)) {
            vw0 vw0Var = this.P0;
            if (vw0Var != null) {
                mc mcVar = vw0Var.m;
                boolean contains = vw0Var.k.contains(motionEvent.getX(), motionEvent.getY());
                if (motionEvent.getAction() == 0) {
                    mcVar.c(contains);
                } else if (motionEvent.getAction() != 2) {
                    if (motionEvent.getAction() == 1) {
                        if (mcVar.i) {
                            vw0Var.b();
                        }
                        mcVar.c(false);
                    } else if (motionEvent.getAction() == 3) {
                        mcVar.c(false);
                    }
                }
            }
            if (!S() || !this.I0.e(this.G0, this.H0, motionEvent)) {
                if (T()) {
                    org.telegram.ui.Wallet.m4 m4Var = this.J0;
                    float f10 = (this.k0 / 2.0f) + this.L0;
                    float paddingTop = this.M0 + getPaddingTop();
                    ArrayList arrayList2 = m4Var.c;
                    mc mcVar2 = m4Var.Y;
                    float x11 = motionEvent.getX() - f10;
                    float y11 = motionEvent.getY() - paddingTop;
                    v0 v0Var = m4Var.a;
                    if (motionEvent.getActionMasked() == 0) {
                        float x12 = motionEvent.getX() - f10;
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
                            if (v0Var.getParent() != null) {
                                v0Var.getParent().requestDisallowInterceptTouchEvent(true);
                            }
                            m4Var.a(3.0f);
                            z19 = true;
                        }
                        float L = org.telegram.messenger.g0.L(4.0f);
                        boolean z20 = x11 < L && x11 <= ((float) org.telegram.messenger.g0.L(206.0f)) - L && y11 >= L && y11 <= ((float) org.telegram.messenger.g0.L(140.0f)) - L;
                        if (m4Var.q0 != null) {
                            TLRPC.TL_messageActionGramTransfer tL_messageActionGramTransfer = m4Var.l0;
                            if ((tL_messageActionGramTransfer.comment_encrypted || tL_messageActionGramTransfer.comment_encrypted_preparing) && !m4Var.m0) {
                                float L2 = x11 - ((org.telegram.messenger.g0.L(206.0f) - m4Var.q0.k()) / 2.0f);
                                float L3 = y11 - org.telegram.messenger.g0.L(143.0f);
                                int size = arrayList2.size();
                                int i10 = 0;
                                while (i10 < size) {
                                    Object obj = arrayList2.get(i10);
                                    i10++;
                                    int i11 = size;
                                    if (((xh.f) obj).getBounds().contains((int) L2, (int) L3)) {
                                        z18 = true;
                                        break;
                                    }
                                    size = i11;
                                }
                            }
                        }
                        z18 = false;
                        boolean z21 = !z20 || z18;
                        if (motionEvent.getAction() != 0) {
                            m4Var.r0 = z21;
                            mcVar2.c(z21);
                        } else if (motionEvent.getAction() != 2) {
                            if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                                z19 = m4Var.r0;
                                boolean z22 = motionEvent.getAction() == 1 && z19 && z21;
                                m4Var.r0 = false;
                                mcVar2.c(false);
                                if (z22 && z18) {
                                    TLRPC.TL_messageActionGramTransfer tL_messageActionGramTransfer2 = m4Var.l0;
                                    if (tL_messageActionGramTransfer2.comment_encrypted_preparing) {
                                        m4Var.m0 = true;
                                        xy0 xy0Var = m4Var.q0;
                                        xy0Var.q(org.telegram.messenger.j6.m(tL_messageActionGramTransfer2.comment, xy0Var.a.getFontMetricsInt(), false, null, 0));
                                        m4Var.d.addAll(arrayList2);
                                        arrayList2.clear();
                                        v0Var.requestLayout();
                                        v0Var.invalidate();
                                    }
                                }
                                if (z22 && (n0Var = m4Var.s0) != null) {
                                    n0Var.run();
                                }
                            }
                            z19 = m4Var.r0;
                        } else if (m4Var.r0) {
                            mcVar2.c(z21);
                        }
                        z19 = m4Var.r0;
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
                                        v0Var.invalidate();
                                    }
                                } else if (actionMasked != 3) {
                                    if (actionMasked == 6 && motionEvent.getPointerId(motionEvent.getActionIndex()) == m4Var.x) {
                                        int i12 = motionEvent.getActionIndex() == 0 ? 1 : 0;
                                        m4Var.x = motionEvent.getPointerId(i12);
                                        m4Var.y = motionEvent.getX(i12);
                                        m4Var.z = motionEvent.getY(i12);
                                    }
                                }
                                z19 = true;
                            }
                            m4Var.j();
                            z19 = true;
                        }
                        float L4 = org.telegram.messenger.g0.L(4.0f);
                        if (x11 < L4) {
                        }
                        if (m4Var.q0 != null) {
                        }
                        z18 = false;
                        if (z20) {
                        }
                        if (motionEvent.getAction() != 0) {
                        }
                        z19 = m4Var.r0;
                    }
                    if (z19) {
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
                        return true;
                    }
                }
                if (!this.F0.c(motionEvent)) {
                    int action = motionEvent.getAction();
                    ImageReceiver imageReceiver = this.J;
                    int i13 = this.I;
                    RectF rectF = this.p0;
                    View view = this.U1;
                    mc mcVar3 = this.n;
                    if (action == 0) {
                        if (this.g1 != null) {
                            if ((fjVar.D == 11 || W(fjVar)) && imageReceiver.O(x10, y10)) {
                                this.a0 = true;
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            if (fjVar.D == 33 && this.N1.contains(x10, y10) && (this.y1 == null || !rectF.contains(x10, y10))) {
                                this.a0 = true;
                                z15 = true;
                            }
                            if (this.K1.i.q == 4 && (((i7 = fjVar.D) == 21 || i7 == 22) && this.N1.contains(x10, y10))) {
                                this.a0 = true;
                                z15 = true;
                            }
                            t0 t0Var3 = this.t1;
                            if (t0Var3 == null || !this.p1) {
                                z16 = z15;
                            } else {
                                RectF rectF2 = org.telegram.messenger.g0.P;
                                float f11 = t0Var3.b;
                                z16 = z15;
                                rectF2.set(f11, t0Var3.e, ((StaticLayout) t0Var3.f).getWidth() + f11, this.t1.e + ((StaticLayout) r1.f).getHeight());
                                if (rectF2.contains(x10, y10)) {
                                    this.F = true;
                                    z16 = true;
                                }
                            }
                            if (W(fjVar) && this.y1 != null) {
                                TLRPC.TL_messageActionStarGiftOnchainOffer tL_messageActionStarGiftOnchainOffer = this.c2;
                                if (!(tL_messageActionStarGiftOnchainOffer != null && this.d2 && bi.i4.l(i13, tL_messageActionStarGiftOnchainOffer.offer_id)) && (rectF.contains(x10, y10) || (this.z1 && this.N1.contains(x10, y10)))) {
                                    z17 = true;
                                    this.b0 = true;
                                    view.setPressed(true);
                                    mcVar3.c(true);
                                    z16 = true;
                                    if (!z16 && X()) {
                                        this.F = z17;
                                        z16 = true;
                                    }
                                    if (!z16) {
                                        fj fjVar2 = this.Q0;
                                        if (cg.d.g((fjVar2 == null || (message3 = fjVar2.k) == null) ? null : message3.action, TLRPC.TL_messageActionSuggestedPostRefund.class, TLRPC.TL_messageActionSuggestedPostSuccess.class)) {
                                            this.F = true;
                                            z16 = true;
                                        }
                                    }
                                    if (z16) {
                                        u();
                                    }
                                    z12 = z16;
                                }
                            }
                            z17 = true;
                            if (!z16) {
                                this.F = z17;
                                z16 = true;
                            }
                            if (!z16) {
                            }
                            if (z16) {
                            }
                            z12 = z16;
                        }
                        z12 = false;
                    } else {
                        if (motionEvent.getAction() != 2) {
                            n();
                        }
                        if (this.G) {
                            if (motionEvent.getAction() == 2) {
                                if (x10 < this.b1 || x10 > this.c1) {
                                    z11 = false;
                                    this.G = false;
                                    z12 = z11;
                                }
                            } else if (motionEvent.getAction() == 1) {
                                View.OnClickListener onClickListener = this.k2;
                                if (onClickListener != null) {
                                    onClickListener.onClick(this);
                                }
                                this.G = false;
                            } else if (motionEvent.getAction() == 3) {
                                this.G = false;
                            }
                            z12 = false;
                        } else if (this.F) {
                            int action2 = motionEvent.getAction();
                            if (action2 == 1) {
                                this.F = false;
                                view.setPressed(false);
                                mcVar3.c(false);
                                if (this.g1 != null && fjVar.C != null && (message2 = fjVar.k) != null && cg.d.g(message2.action, TLRPC.TL_messageActionTodoAppendTasks.class, TLRPC.TL_messageActionTodoCompletions.class, TLRPC.TL_messageActionSuggestedPostApproval.class, TLRPC.TL_messageActionSuggestedPostRefund.class, TLRPC.TL_messageActionSuggestedPostSuccess.class)) {
                                    this.g1.n(this, this.Q0.N1());
                                } else if (this.p1 && !this.o1 && (t0Var2 = this.t1) != null) {
                                    int height = ((StaticLayout) t0Var2.f).getHeight() - this.q1;
                                    this.o1 = true;
                                    s0 s0Var = this.g1;
                                    if (s0Var != null) {
                                        s0Var.t(this);
                                        if (getParent() instanceof ek0) {
                                            ((ek0) getParent()).w0(0, org.telegram.messenger.g0.L(24.0f) + height, null);
                                            return true;
                                        }
                                    }
                                } else if (this.P0 != null && this.N1.contains(motionEvent.getX(), motionEvent.getY())) {
                                    this.P0.b();
                                    return true;
                                }
                            } else if (action2 == 2) {
                                t0 t0Var4 = this.t1;
                                if (t0Var4 == null || !this.p1) {
                                    this.F = false;
                                } else {
                                    RectF rectF3 = org.telegram.messenger.g0.P;
                                    float f12 = t0Var4.b;
                                    rectF3.set(f12, t0Var4.e, ((StaticLayout) t0Var4.f).getWidth() + f12, this.t1.e + ((StaticLayout) r8.f).getHeight());
                                    if (!rectF3.contains(x10, y10)) {
                                        this.F = false;
                                    }
                                }
                                z11 = true;
                                z12 = z11;
                            } else if (action2 == 3) {
                                this.F = false;
                                mcVar3.c(false);
                            }
                            z11 = false;
                            z12 = z11;
                        } else {
                            if (this.b0) {
                                int action3 = motionEvent.getAction();
                                if (action3 == 1) {
                                    this.a0 = false;
                                    this.b0 = false;
                                    view.setPressed(false);
                                    mcVar3.c(false);
                                    if (this.c2 != null) {
                                        playSoundEffect(0);
                                        s0 s0Var2 = this.g1;
                                        org.telegram.ui.ActionBar.g2 G = s0Var2 != null ? s0Var2.G() : LaunchActivity.T();
                                        if (G != null && this.c2 != null && this.Q0 != null) {
                                            final lc b02 = lc.b0(G);
                                            if (this.c2.buyer) {
                                                Context context = getContext();
                                                int e12 = this.Q0.e1();
                                                TLRPC.TL_messageActionStarGiftOnchainOffer tL_messageActionStarGiftOnchainOffer2 = this.c2;
                                                HashMap hashMap = bi.i4.a;
                                                long j3 = tL_messageActionStarGiftOnchainOffer2.offer_id;
                                                if (bi.i4.b(j3)) {
                                                    TL_stars.cancelStarGiftOnchainOffer cancelstargiftonchainoffer = new TL_stars.cancelStarGiftOnchainOffer();
                                                    cancelstargiftonchainoffer.offer_msg_id = e12;
                                                    int i14 = this.I;
                                                    ConnectionsManager.getInstance(i14).sendRequestTyped(cancelstargiftonchainoffer, new d3.b(1), new ai.s1(j3, context, i14, this.h1, b02, tL_messageActionStarGiftOnchainOffer2));
                                                }
                                            } else {
                                                final Context context2 = getContext();
                                                final int e13 = this.Q0.e1();
                                                final TLRPC.TL_messageActionStarGiftOnchainOffer tL_messageActionStarGiftOnchainOffer3 = this.c2;
                                                HashMap hashMap2 = bi.i4.a;
                                                final long j10 = tL_messageActionStarGiftOnchainOffer3.offer_id;
                                                final int i15 = this.I;
                                                if (bi.i4.k(i15, j10)) {
                                                    bi.i4.s(b02);
                                                } else if (bi.i4.b(j10)) {
                                                    TL_stars.acceptStarGiftOnchainOffer acceptstargiftonchainoffer = new TL_stars.acceptStarGiftOnchainOffer();
                                                    acceptstargiftonchainoffer.offer_msg_id = e13;
                                                    ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i15);
                                                    d3.b bVar = new d3.b(1);
                                                    final org.telegram.ui.ActionBar.h6 h6Var = this.h1;
                                                    connectionsManager.sendRequestTyped(acceptstargiftonchainoffer, bVar, new q10() { // from class: bi.f4
                                                        @Override // org.telegram.messenger.q10
                                                        public final void a(Object obj2, Object obj3) {
                                                            TL_stars.TL_payments_starGiftOnchainOfferTx tL_payments_starGiftOnchainOfferTx = (TL_stars.TL_payments_starGiftOnchainOfferTx) obj2;
                                                            TLRPC.TL_error tL_error = (TLRPC.TL_error) obj3;
                                                            long j11 = j10;
                                                            Context context3 = context2;
                                                            org.telegram.ui.ActionBar.h6 h6Var2 = h6Var;
                                                            int i16 = i15;
                                                            lc lcVar = b02;
                                                            if (tL_payments_starGiftOnchainOfferTx == null || tL_payments_starGiftOnchainOfferTx.message == null) {
                                                                i4.g(j11);
                                                                if (tL_error == null || !"STARGIFT_ONCHAIN_SALE_ACTIVE".equals(tL_error.text)) {
                                                                    y4.r(context3, i16, h6Var2, lcVar, tL_error, null);
                                                                    return;
                                                                } else {
                                                                    y4.p(context3, h6Var2, gd.N0(2131749552, null), null);
                                                                    return;
                                                                }
                                                            }
                                                            org.telegram.ui.Wallet.p0 q10 = i4.q(context3, h6Var2, lcVar, i16, tL_payments_starGiftOnchainOfferTx);
                                                            if (q10 == null) {
                                                                i4.g(j11);
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
                                                                    q10.f = b10;
                                                                } catch (Exception e10) {
                                                                    org.telegram.messenger.a8.g(e10, true);
                                                                }
                                                            }
                                                            TLRPC.TL_messageActionStarGiftOnchainOffer tL_messageActionStarGiftOnchainOffer4 = tL_messageActionStarGiftOnchainOffer3;
                                                            TL_stars.StarGift starGift2 = tL_messageActionStarGiftOnchainOffer4.gift;
                                                            String h = starGift2 != null ? y4.h(starGift2) : "";
                                                            s3 s3Var = new s3(i16, context3, tL_messageActionStarGiftOnchainOffer4.gift, h6Var2);
                                                            s3Var.k1(org.telegram.messenger.g0.W2(gd.a0(null, null, 2131749568, h, y4.k(tL_messageActionStarGiftOnchainOffer4.amount))), gd.N0(2131749567, null));
                                                            String N0 = gd.N0(2131749534, null);
                                                            SpannableStringBuilder l10 = y4.l(tL_messageActionStarGiftOnchainOffer4.amount);
                                                            ey0 ey0Var = s3Var.Z1;
                                                            ey0Var.e(N0, l10, null, null);
                                                            y4.c(s3Var, tL_messageActionStarGiftOnchainOffer4.amount, tL_messageActionStarGiftOnchainOffer4.fee_bps, h6Var2);
                                                            TL_stars.StarGift starGift3 = tL_messageActionStarGiftOnchainOffer4.gift;
                                                            if (starGift3 != null) {
                                                                y4.b(s3Var, starGift3);
                                                                if (tL_messageActionStarGiftOnchainOffer4.gift.availability_total > 0) {
                                                                    ey0Var.e(gd.N0(2131750283, null), gd.H(',', "Gift2QuantityIssued1", tL_messageActionStarGiftOnchainOffer4.gift.availability_issued) + gd.H(',', "Gift2QuantityIssued2", tL_messageActionStarGiftOnchainOffer4.gift.availability_total), null, null);
                                                                }
                                                            }
                                                            TL_wallet.walletOnchainGiftActionOfferAccept walletonchaingiftactionofferaccept = new TL_wallet.walletOnchainGiftActionOfferAccept();
                                                            walletonchaingiftactionofferaccept.offer_address = tL_messageActionStarGiftOnchainOffer4.offer_address;
                                                            walletonchaingiftactionofferaccept.price = tL_messageActionStarGiftOnchainOffer4.amount;
                                                            TL_stars.StarGift starGift4 = tL_messageActionStarGiftOnchainOffer4.gift;
                                                            q10.h = walletonchaingiftactionofferaccept;
                                                            q10.i = starGift4;
                                                            long j12 = tL_messageActionStarGiftOnchainOffer4.offer_id;
                                                            boolean[] zArr = new boolean[1];
                                                            i4.j(j12, Long.MAX_VALUE);
                                                            s3Var.setOnDismissListener(new y3(zArr, j12, 1));
                                                            s3Var.v2.setVisibility(0);
                                                            String N02 = gd.N0(2131749604, null);
                                                            t3 t3Var = new t3(context3, i16, e13, tL_messageActionStarGiftOnchainOffer4, h6Var2, s3Var);
                                                            hi.e eVar = s3Var.c2;
                                                            eVar.i(N02, false, true);
                                                            eVar.setOnClickListener(new ai.x2(3, s3Var, t3Var));
                                                            int i17 = tL_messageActionStarGiftOnchainOffer4.expires_at - 10;
                                                            ai.n nVar = new ai.n(5);
                                                            s3Var.n2 = i17;
                                                            s3Var.o2 = nVar;
                                                            s3Var.h1();
                                                            s3Var.d2.i(gd.N0(2131749571, null), false, true);
                                                            s3Var.q2 = 2131749614;
                                                            s3Var.j1(q10);
                                                            String str = h;
                                                            s3Var.i1(new u3(zArr, j12, i16, str, 0), new v3(str, j12, i16, tL_messageActionStarGiftOnchainOffer4), new w3(context3, i16, h6Var2, s3Var, 0));
                                                            s3Var.show();
                                                        }
                                                    });
                                                }
                                            }
                                        }
                                        invalidate();
                                    } else if (this.g1 != null) {
                                        int i16 = fjVar.D;
                                        if (i16 == 37) {
                                            playSoundEffect(0);
                                            org.telegram.ui.ActionBar.g2 T = LaunchActivity.T();
                                            if (T != null) {
                                                new li.d0(T, ((TLRPC.TL_messageActionChangeCommunity) fjVar.k.action).community_id, null, null).show();
                                            }
                                        } else if (i16 == 31) {
                                            playSoundEffect(0);
                                            f0();
                                        } else if (i16 == 25) {
                                            playSoundEffect(0);
                                            if (this.g1 != null) {
                                                org.telegram.messenger.g0.g3(new ga(2, this, (TLRPC.TL_messageActionGiftCode) this.Q0.k.action));
                                            }
                                        } else if (i16 == 18) {
                                            playSoundEffect(0);
                                            e0();
                                        } else if (i16 == 30) {
                                            playSoundEffect(0);
                                            f0();
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
                                            if (((x30) mp.u1(i13).E7.get(fjVar.k.local_id)) == null) {
                                                if (this.z1) {
                                                    this.g1.x(this);
                                                } else {
                                                    this.g1.D(this);
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
                                } else if (!W(fjVar) || (!rectF.contains(x10, y10) && !this.N1.contains(x10, y10))) {
                                    this.b0 = false;
                                    view.setPressed(false);
                                    mcVar3.c(false);
                                }
                            } else if (this.a0) {
                                int action4 = motionEvent.getAction();
                                if (action4 == 1) {
                                    this.a0 = false;
                                    if (!this.p1 || this.o1 || (t0Var = this.t1) == null) {
                                        int i17 = fjVar.D;
                                        if (i17 == 31) {
                                            f0();
                                        } else if (i17 == 25) {
                                            if (this.g1 != null) {
                                                org.telegram.messenger.g0.g3(new ga(2, this, (TLRPC.TL_messageActionGiftCode) this.Q0.k.action));
                                            }
                                        } else if (i17 == 18) {
                                            e0();
                                        } else if (i17 == 30) {
                                            f0();
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
                                            if (i17 != 21 || (x30Var = (x30) mp.u1(i13).E7.get(fjVar.k.local_id)) == null) {
                                                z10 = false;
                                            } else {
                                                x30Var.b();
                                                z10 = true;
                                            }
                                            if (!z10) {
                                                this.g1.x(this);
                                                playSoundEffect(0);
                                            }
                                        }
                                    } else {
                                        int height2 = ((StaticLayout) t0Var.f).getHeight() - this.q1;
                                        this.o1 = true;
                                        s0 s0Var3 = this.g1;
                                        if (s0Var3 != null) {
                                            s0Var3.t(this);
                                            if (getParent() instanceof ek0) {
                                                ((ek0) getParent()).w0(0, org.telegram.messenger.g0.L(16.0f) + height2, null);
                                                return true;
                                            }
                                        }
                                    }
                                } else if (action4 != 2) {
                                    if (action4 == 3) {
                                        this.a0 = false;
                                    }
                                } else if (Y()) {
                                    if (!this.N1.contains(x10, y10)) {
                                        this.a0 = false;
                                    }
                                } else if (!imageReceiver.O(x10, y10)) {
                                    this.a0 = false;
                                }
                            }
                            z12 = false;
                        }
                    }
                    if (!z12 && (motionEvent.getAction() == 0 || ((this.y != null || this.E != null) && motionEvent.getAction() == 1))) {
                        t0 t0Var5 = this.t1;
                        if (t0Var5 != null && (arrayList = t0Var5.c) != null && !arrayList.isEmpty() && !this.H) {
                            ArrayList arrayList3 = this.t1.c;
                            int size2 = arrayList3.size();
                            int i18 = 0;
                            while (i18 < size2) {
                                Object obj2 = arrayList3.get(i18);
                                i18++;
                                xh.f fVar = (xh.f) obj2;
                                Rect bounds = fVar.getBounds();
                                t0 t0Var6 = this.t1;
                                if (bounds.contains((int) (x10 - t0Var6.b), (int) (y10 - t0Var6.e))) {
                                    this.y = null;
                                    if (motionEvent.getAction() == 0) {
                                        this.E = fVar;
                                        z13 = true;
                                        z12 = true;
                                    } else {
                                        xh.f fVar2 = this.E;
                                        z13 = true;
                                        if (fVar == fVar2) {
                                            this.H = true;
                                            fVar2.q = new n0(this, 6);
                                            float sqrt = (float) Math.sqrt(Math.pow(((StaticLayout) this.t1.f).getHeight(), 2.0d) + Math.pow(((StaticLayout) this.t1.f).getWidth(), 2.0d));
                                            xh.f fVar3 = this.E;
                                            t0 t0Var7 = this.t1;
                                            fVar3.j((int) (x10 - t0Var7.b), (int) (y10 - t0Var7.e), sqrt, false);
                                            invalidate();
                                        }
                                        z12 = true;
                                    }
                                    if (!z12 && (staticLayout = this.N) != null) {
                                        if (x10 >= this.S) {
                                            float f13 = this.T;
                                            if (y10 >= f13 && x10 <= r5 + this.O && y10 <= r6 + this.P) {
                                                float f14 = y10 - f13;
                                                float f15 = x10 - this.U;
                                                if (!z12) {
                                                    int lineForVertical = staticLayout.getLineForVertical((int) f14);
                                                    int offsetForHorizontal = this.N.getOffsetForHorizontal(lineForVertical, f15);
                                                    float lineLeft = this.N.getLineLeft(lineForVertical);
                                                    if (lineLeft <= f15 && this.N.getLineWidth(lineForVertical) + lineLeft >= f15) {
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
                                                                        d0(uRLSpan2);
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
                            }
                        }
                        z13 = true;
                        if (!z12) {
                            if (x10 >= this.S) {
                            }
                        }
                        this.y = null;
                    }
                    if (!z12) {
                        z12 = w(motionEvent);
                    }
                    return !z12 ? super.onTouchEvent(motionEvent) : z12;
                }
                return true;
            }
        }
        return true;
    }

    @Override // org.telegram.ui.Cells.z
    public final boolean q() {
        s0 s0Var = this.g1;
        if (s0Var != null) {
            return s0Var.s0(this, this.z0, this.A0);
        }
        return false;
    }

    public void setCustomText(CharSequence charSequence) {
        this.S0 = charSequence;
        if (charSequence != null) {
            n0(false);
        }
    }

    public void setDelegate(s0 s0Var) {
        this.g1 = s0Var;
    }

    public void setInvalidateColors(boolean z10) {
        if (this.f1 == z10) {
            return;
        }
        this.f1 = z10;
        invalidate();
    }

    public void setInvalidateListener(Runnable runnable) {
        this.u2 = runnable;
    }

    public void setInvalidateWithParent(View view) {
        this.w = view;
    }

    public void setInvalidatesParent(boolean z10) {
        this.t2 = z10;
    }

    public void setMessageObject(fj fjVar) {
        i0(fjVar, false);
    }

    public void setOnActionClickListener(View.OnClickListener onClickListener) {
        this.k2 = onClickListener;
    }

    public void setOverrideTextMaxWidth(int i7) {
        this.l2 = i7;
    }

    public void setScrimReaction(Integer num) {
        this.F0.z = num;
    }

    public void setShowTopic(boolean z10) {
        if (this.n0 != z10) {
            this.n0 = z10;
            U();
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
    /* JADX WARN: Removed duplicated region for block: B:9:0x00b2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v() {
        CharSequence charSequence;
        CharSequence charSequence2;
        CharSequence M0;
        CharSequence charSequence3;
        boolean z10;
        CharSequence Z;
        ArrayList<TLRPC.VideoSize> arrayList;
        TLRPC.Photo photo;
        ArrayList<TLRPC.VideoSize> arrayList2;
        CharSequence charSequence4;
        int i7;
        String G;
        CharSequence M02;
        CharSequence charSequence5;
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
        CharSequence charSequence6;
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
        } else if (T()) {
            CharSequence r11 = org.telegram.ui.Wallet.u0.D(i11).r(((TLRPC.TL_messageActionGramTransfer) fjVar.k.action).amount, false);
            if (!TextUtils.isEmpty(r11)) {
                charSequence = gd.V(null, null, 2131742710, org.telegram.ui.Components.y5.cloneSpans(fjVar.v), r11);
                if (charSequence == null) {
                    TLRPC.Message message2 = fjVar.k;
                    if (message2 == null || (messageMedia = message2.media) == null || messageMedia.ttl_seconds == 0) {
                        charSequence = org.telegram.ui.Components.y5.cloneSpans(fjVar.v);
                    } else if (messageMedia.photo != null) {
                        charSequence = gd.N0(2131753944, null);
                    } else {
                        TLRPC.Document document = messageMedia.document;
                        charSequence = ((document instanceof TLRPC.TL_documentEmpty) || ((messageMedia instanceof TLRPC.TL_messageMediaDocument) && document == null)) ? messageMedia.voice ? gd.N0(2131753926, null) : messageMedia.round ? gd.N0(2131753937, null) : gd.N0(2131753929, null) : org.telegram.ui.Components.y5.cloneSpans(fjVar.v);
                    }
                }
            }
            charSequence = null;
            if (charSequence == null) {
            }
        } else {
            if (fjVar.g3()) {
                charSequence = fjVar.k.media.user_id != j10.i(i11).e() ? fi.i7.e(new Object[0], 2131750861, true) : fi.i7.e(new Object[]{mp.u1(i11).c2(Long.valueOf(fj.B0(fjVar.k))).first_name}, 2131750860, true);
            } else {
                s0 s0Var = this.g1;
                if (s0Var != null && s0Var.d() == 0 && fj.E4(fjVar)) {
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
                spannableStringBuilder2.setSpan(new nq(i10, 0), 0, 1, 33);
                charSequence = spannableStringBuilder2;
            }
        }
        B(this.W, charSequence);
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
                    A(null, null, charSequence, false, !org.telegram.messenger.v3.z(i11, 24, fj.B0(message3)) ? gd.N0(2131744910, null) : null, 11, null, this.j1, false);
                    this.N = null;
                    this.P = 0;
                    this.Q = null;
                    this.R = 0;
                    this.T = 0;
                }
            }
            CharSequence charSequence7 = charSequence;
            if (message3 != null) {
                TLRPC.MessageAction messageAction3 = message3.action;
                if ((messageAction3 instanceof TLRPC.TL_messageActionSuggestedPostApproval) && ((TLRPC.TL_messageActionSuggestedPostApproval) messageAction3).rejected) {
                    A(null, null, charSequence7, false, null, 11, null, this.j1, false);
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
                z();
            } else {
                long j11 = 0;
                TextPaint textPaint = this.G1;
                if (i12 == 30) {
                    TLRPC.User c22 = mp.u1(i11).c2(Long.valueOf(fj.B0(this.Q0.k)));
                    TLRPC.MessageAction messageAction4 = fjVar.k.action;
                    if (messageAction4 instanceof TLRPC.TL_messageActionGiftStars) {
                        A(gd.H(',', "ActionGiftStarsTitle", (int) ((TLRPC.TL_messageActionGiftStars) messageAction4).stars), null, org.telegram.messenger.g0.W2(this.Q0.P3() ? gd.a0(null, null, 2131754628, o10.l(c22)) : gd.N0(2131754627, null)), false, gd.N0(2131754623, null), 11, null, this.j1, true);
                    } else if ((messageAction4 instanceof TLRPC.TL_messageActionStarGiftUnique) && ((TLRPC.TL_messageActionStarGiftUnique) messageAction4).refunded) {
                        long e10 = j10.i(i11).e();
                        TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique = (TLRPC.TL_messageActionStarGiftUnique) fjVar.k.action;
                        if (fjVar.P3() != (!tL_messageActionStarGiftUnique.upgrade)) {
                            e10 = fj.B0(fjVar.k);
                        }
                        TLRPC.User c23 = mp.u1(i11).c2(Long.valueOf(e10));
                        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
                        spannableStringBuilder3.append((CharSequence) gd.N0(tL_messageActionStarGiftUnique.prepaid_upgrade ? 2131750411 : 2131750420, null)).append((CharSequence) " ");
                        if (c23 != null && c23.photo != null) {
                            spannableStringBuilder3.append((CharSequence) "a ");
                            org.telegram.ui.f5 f5Var = new org.telegram.ui.f5(18.0f, i11, this);
                            f5Var.e(c23);
                            spannableStringBuilder3.setSpan(f5Var, spannableStringBuilder3.length() - 2, spannableStringBuilder3.length() - 1, 33);
                        }
                        spannableStringBuilder3.append((CharSequence) o10.l(c23));
                        A(spannableStringBuilder3, null, gd.N0(2131750412, null), false, gd.N0(2131754623, null), 12, gd.N0(2131749877, null), this.j1, true);
                    } else if (messageAction4 instanceof TLRPC.TL_messageActionStarGift) {
                        TLRPC.TL_messageActionStarGift tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction4;
                        long j12 = tL_messageActionStarGift.convert_stars;
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
                                    spannableStringBuilder4.append((CharSequence) gd.N0(2131750417, null)).append((CharSequence) " ");
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
                                    j10 = j12;
                                } else {
                                    spannableStringBuilder = spannableStringBuilder4;
                                    if (z14) {
                                        j10 = j12;
                                        spannableStringBuilder.append((CharSequence) gd.N0(tL_messageActionStarGift.prepaid_upgrade ? 2131750411 : 2131750420, null)).append((CharSequence) " ");
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
                                        j10 = j12;
                                        spannableStringBuilder.append((CharSequence) gd.N0(2131750422, null));
                                    } else {
                                        j10 = j12;
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
                                        W2 = gd.Z(2131750403, gd.E(tL_messageActionStarGift.gift.stars + tL_messageActionStarGift.upgrade_stars, ','));
                                    } else if (!z11) {
                                        long j13 = j10;
                                        if (z14) {
                                            W2 = (!tL_messageActionStarGift.converted || j13 <= 0) ? tL_messageActionStarGift.can_upgrade ? org.telegram.messenger.g0.W2(gd.M0(2131750425)) : org.telegram.messenger.g0.W2(gd.M0(2131750426)) : gd.I((int) j13, "Gift2ActionConvertedInfo");
                                        } else if (z12) {
                                            W2 = org.telegram.messenger.g0.W2(fjVar.P3() ? gd.Z(2131750413, o10.l(c22)) : gd.M0(2131750414));
                                        } else {
                                            W2 = fjVar.P3() ? (!z15 || j13 <= 0) ? tL_messageActionStarGift.can_upgrade ? org.telegram.messenger.g0.W2(gd.Z(2131750434, o10.l(c22))) : org.telegram.messenger.g0.W2(gd.Z(2131750435, o10.l(c22))) : org.telegram.messenger.g0.W2(gd.J((int) j13, "Gift2ActionOutInfo", o10.l(c22))) : tL_messageActionStarGift.converted ? gd.I((int) j13, "Gift2ActionConvertedInfo") : tL_messageActionStarGift.saved ? !z15 ? gd.M0(2131750449) : gd.M0(2131750428) : !z15 ? gd.M0(2131750450) : org.telegram.messenger.g0.W2(gd.I((int) j13, "Gift2ActionInfo"));
                                        }
                                    } else if (tL_messageActionStarGift.converted) {
                                        W2 = gd.I((int) j10, "Gift2ActionConvertedInfo");
                                    } else {
                                        long j14 = j10;
                                        W2 = (!z15 || j14 <= 0) ? org.telegram.messenger.g0.W2(gd.M0(2131750441)) : org.telegram.messenger.g0.W2(gd.I((int) j14, "Gift2ActionInfoChannel"));
                                    }
                                } else {
                                    W2 = gd.M0(2131750448);
                                }
                                CharSequence charSequence8 = W2;
                                starGift2 = tL_messageActionStarGift.gift;
                                if (starGift2 == null && starGift2.limited) {
                                    int i13 = starGift2.availability_total;
                                    str2 = gd.Z(2131750118, i13 > 1500 ? org.telegram.messenger.g0.o0(i13, 0) : Integer.valueOf(i13));
                                } else {
                                    str2 = null;
                                }
                                CharSequence M03 = gd.M0(2131754623);
                                if (fjVar.P3()) {
                                    charSequence6 = M03;
                                    if (!tL_messageActionStarGift.forceIn) {
                                    }
                                }
                                charSequence6 = M03;
                                charSequence6 = M03;
                                if (!fjVar.P3() && z12) {
                                    SpannableStringBuilder spannableStringBuilder6 = new SpannableStringBuilder();
                                    spannableStringBuilder6.append("^  ");
                                    nq nqVar = new nq(R.drawable.gift_unpack);
                                    nqVar.I = 0.8f;
                                    nqVar.J = 0.8f;
                                    spannableStringBuilder6.setSpan(nqVar, 0, 1, 33);
                                    spannableStringBuilder6.append(gd.M0(2131749868));
                                    charSequence6 = spannableStringBuilder6;
                                }
                                TL_stars.StarGift starGift3 = tL_messageActionStarGift.gift;
                                A(spannableStringBuilder, (starGift3 != null || starGift3.released_by == null || (r10 = org.telegram.messenger.n5.r(mp.u1(i11).g2(org.telegram.messenger.n5.o(tL_messageActionStarGift.gift.released_by)))) == null) ? null : di.f6.s2(gd.Z(2131750430, "@".concat(r10))), charSequence8, false, charSequence6, 11, str2, this.j1, true);
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
                        CharSequence charSequence82 = W2;
                        starGift2 = tL_messageActionStarGift.gift;
                        if (starGift2 == null) {
                        }
                        str2 = null;
                        CharSequence M032 = gd.M0(2131754623);
                        if (fjVar.P3()) {
                        }
                        charSequence6 = M032;
                        charSequence6 = M032;
                        if (!fjVar.P3()) {
                            SpannableStringBuilder spannableStringBuilder62 = new SpannableStringBuilder();
                            spannableStringBuilder62.append("^  ");
                            nq nqVar2 = new nq(R.drawable.gift_unpack);
                            nqVar2.I = 0.8f;
                            nqVar2.J = 0.8f;
                            spannableStringBuilder62.setSpan(nqVar2, 0, 1, 33);
                            spannableStringBuilder62.append(gd.M0(2131749868));
                            charSequence6 = spannableStringBuilder62;
                        }
                        TL_stars.StarGift starGift32 = tL_messageActionStarGift.gift;
                        A(spannableStringBuilder, (starGift32 != null || starGift32.released_by == null || (r10 = org.telegram.messenger.n5.r(mp.u1(i11).g2(org.telegram.messenger.n5.o(tL_messageActionStarGift.gift.released_by)))) == null) ? null : di.f6.s2(gd.Z(2131750430, "@".concat(r10))), charSequence82, false, charSequence6, 11, str2, this.j1, true);
                    } else if (messageAction4 instanceof TLRPC.TL_messageActionGiftTon) {
                        A(gd.M0(2131754621), null, this.Q0.v, false, gd.M0(2131754623), 11, null, this.j1, true);
                        this.N = null;
                        this.P = 0;
                        this.Q = null;
                        this.R = 0;
                        this.T = 0;
                    } else {
                        A(gd.M0(2131754550), null, this.Q0.v, false, gd.M0(2131754623), 11, null, this.j1, true);
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
                            HashMap hashMap = bi.i4.a;
                            this.e2 = Math.max(0, tL_messageActionStarGiftOnchainOffer.expires_at - ConnectionsManager.getInstance(i11).getCurrentTime());
                            boolean b02 = b0();
                            this.f2 = b02;
                            if (this.d2) {
                                if (b02) {
                                    M02 = gd.M0(2131748586);
                                } else {
                                    M02 = gd.M0(tL_messageActionStarGiftOnchainOffer.buyer ? 2131749551 : 2131749577);
                                }
                                charSequence5 = M02;
                            } else {
                                charSequence5 = null;
                            }
                            A(null, null, c0(bi.i4.d(tL_messageActionStarGiftOnchainOffer), tL_messageActionStarGiftOnchainOffer), false, charSequence5, 11, null, this.j1, this.d2 && !tL_messageActionStarGiftOnchainOffer.buyer);
                            this.N = null;
                            this.P = 0;
                            this.Q = null;
                            this.R = 0;
                            this.T = 0;
                        }
                    }
                    if (i12 == 33) {
                        TLRPC.TL_messageActionStarGiftPurchaseOffer tL_messageActionStarGiftPurchaseOffer = (TLRPC.TL_messageActionStarGiftPurchaseOffer) message3.action;
                        SpannableStringBuilder spannableStringBuilder7 = new SpannableStringBuilder(charSequence7);
                        spannableStringBuilder7.append((CharSequence) "\n\n");
                        if (tL_messageActionStarGiftPurchaseOffer.accepted) {
                            spannableStringBuilder7.append((CharSequence) org.telegram.messenger.g0.W2(gd.M0(2131749677)));
                        } else if (tL_messageActionStarGiftPurchaseOffer.declined) {
                            spannableStringBuilder7.append((CharSequence) org.telegram.messenger.g0.W2(gd.M0(2131749674)));
                        } else {
                            int max = Math.max(0, tL_messageActionStarGiftPurchaseOffer.expires_at - ConnectionsManager.getInstance(i11).getCurrentTime());
                            if (max == 0) {
                                spannableStringBuilder7.append((CharSequence) org.telegram.messenger.g0.W2(gd.M0(2131749676)));
                            } else {
                                int i14 = max / 60;
                                int i15 = max / 3600;
                                if (i15 > 0) {
                                    StringBuilder sb2 = new StringBuilder();
                                    i7 = 0;
                                    sb2.append(gd.G(i15, "ShortHoursAgo", new Object[0]));
                                    sb2.append(" ");
                                    sb2.append(gd.G(i14 % 60, "ShortMinutesAgo", new Object[0]));
                                    G = sb2.toString();
                                } else {
                                    i7 = 0;
                                    G = gd.G(i14, "ShortMinutesAgo", new Object[0]);
                                }
                                if (G.endsWith(".")) {
                                    G = com.google.android.gms.internal.vision.e2.k(G, 1, i7);
                                }
                                Object[] objArr = new Object[1];
                                objArr[i7] = G;
                                spannableStringBuilder7.append((CharSequence) org.telegram.messenger.g0.W2(gd.Z(2131749675, objArr)));
                            }
                        }
                        A(null, null, spannableStringBuilder7, false, null, 11, null, this.j1, false);
                        this.N = null;
                        this.P = 0;
                        this.Q = null;
                        this.R = 0;
                        this.T = 0;
                    } else if (i12 == 34) {
                        A(null, null, charSequence7, false, null, 11, null, this.j1, false);
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
                            spannableStringBuilder8.append(fjVar.N3() ? gd.M0(2131745184) : org.telegram.messenger.g0.W2(gd.Z(2131745187, u10)));
                        } else {
                            spannableStringBuilder8.append(fjVar.N3() ? gd.M0(2131745173) : org.telegram.messenger.g0.W2(gd.Z(2131745176, u10)));
                        }
                        if (tL_messageActionNoForwardsRequest.new_value) {
                            spannableStringBuilder8.append((CharSequence) "\n\n");
                            spannableStringBuilder8.append((CharSequence) E(gd.M0(2131745194)));
                            spannableStringBuilder8.append((CharSequence) "\n\n");
                            spannableStringBuilder8.append((CharSequence) E(gd.M0(2131745193)));
                            spannableStringBuilder8.append((CharSequence) "\n\n");
                            spannableStringBuilder8.append((CharSequence) E(gd.M0(2131745192)));
                            spannableStringBuilder8.append((CharSequence) "\n\n");
                            spannableStringBuilder8.append((CharSequence) E(gd.M0(2131745191)));
                        } else {
                            spannableStringBuilder8.append((CharSequence) "\n\n");
                            spannableStringBuilder8.append((CharSequence) E(gd.M0(2131745183)));
                            spannableStringBuilder8.append((CharSequence) "\n\n");
                            spannableStringBuilder8.append((CharSequence) E(gd.M0(2131745182)));
                            spannableStringBuilder8.append((CharSequence) "\n\n");
                            spannableStringBuilder8.append((CharSequence) E(gd.M0(2131745181)));
                            spannableStringBuilder8.append((CharSequence) "\n\n");
                            spannableStringBuilder8.append((CharSequence) E(gd.M0(2131745180)));
                        }
                        A(null, null, spannableStringBuilder8, false, null, 11, null, this.j1, false);
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
                        A(null, null, org.telegram.messenger.g0.W2(j10.i(i11).e() == Z02 ? gd.Z(2131749421, l10) : gd.Z(2131749422, org.telegram.messenger.n5.s(i11, Z02), l10)), false, gd.M0(2131749423), 11, null, this.j1, true);
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
                        A(null, null, spannableStringBuilder9, false, gd.M0(2131749423), 11, null, this.j1, true);
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
                            charSequence4 = gd.M0(2131754638);
                        }
                        CharSequence charSequence9 = charSequence4;
                        fj fjVar3 = this.Q0;
                        CharSequence M04 = gd.M0((fjVar3 == null || !(fjVar3.k.action instanceof TLRPC.TL_messageActionGiftCode) || Z()) ? 2131754631 : 2131749487);
                        TLRPC.MessageAction messageAction7 = fjVar.k.action;
                        int i16 = messageAction7.months;
                        if (i16 >= 1) {
                            A(gd.I(i16, "ActionGiftPremiumTitle2"), null, charSequence9, true, M04, 11, null, this.j1, false);
                        } else {
                            A(gd.I(messageAction7.days, "ActionGiftPremiumTitle2Days"), null, charSequence9, true, M04, 11, null, this.j1, false);
                        }
                    } else if (i12 == 21) {
                        TLRPC.TL_messageActionSuggestProfilePhoto tL_messageActionSuggestProfilePhoto = (TLRPC.TL_messageActionSuggestProfilePhoto) message3.action;
                        mp u12 = mp.u1(i11);
                        if (!fjVar.P3()) {
                            j11 = fjVar.A0();
                        }
                        TLRPC.User c24 = u12.c2(Long.valueOf(j11));
                        boolean z17 = tL_messageActionSuggestProfilePhoto.video || !((photo = tL_messageActionSuggestProfilePhoto.photo) == null || (arrayList2 = photo.video_sizes) == null || arrayList2.isEmpty());
                        if (c24.id == j10.i(i11).n) {
                            TLRPC.User c25 = mp.u1(i11).c2(Long.valueOf(fjVar.A0()));
                            Z = z17 ? gd.Z(2131754541, c25.first_name) : gd.Z(2131754545, c25.first_name);
                        } else {
                            Z = z17 ? gd.Z(2131754539, c24.first_name) : gd.Z(2131754543, c24.first_name);
                        }
                        A(null, null, Z, false, (tL_messageActionSuggestProfilePhoto.video || !((arrayList = tL_messageActionSuggestProfilePhoto.photo.video_sizes) == null || arrayList.isEmpty())) ? gd.M0(2131743296) : gd.M0(2131743304), 11, null, this.j1, true);
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
                            M0 = gd.M0(2131746090);
                            z10 = false;
                            A(null, null, charSequence2, false, M0, 11, null, this.j1, z10);
                            this.N = null;
                            this.P = 0;
                            this.Q = null;
                            this.R = 0;
                            this.T = 0;
                        } else if (c26 == null || c26.id != j10.i(i11).n) {
                            charSequence2 = fjVar.v;
                            M0 = gd.M0(2131743295);
                            z10 = true;
                            A(null, null, charSequence2, false, M0, 11, null, this.j1, z10);
                            this.N = null;
                            this.P = 0;
                            this.Q = null;
                            this.R = 0;
                            this.T = 0;
                        } else {
                            charSequence3 = fjVar.v;
                        }
                        charSequence2 = charSequence3;
                        M0 = null;
                        z10 = true;
                        A(null, null, charSequence2, false, M0, 11, null, this.j1, z10);
                        this.N = null;
                        this.P = 0;
                        this.Q = null;
                        this.R = 0;
                        this.T = 0;
                    } else if (fjVar.z4()) {
                        TLRPC.User c27 = mp.u1(i11).c2(Long.valueOf(fjVar.k.media.user_id));
                        A(null, null, c27.self ? org.telegram.messenger.g0.W2(gd.Z(2131744198, mp.u1(i11).c2(Long.valueOf(fjVar.A0())).first_name)) : org.telegram.messenger.g0.W2(gd.Z(2131744373, c27.first_name)), false, gd.M0(2131744374), 11, null, this.j1, true);
                        this.N = null;
                        this.P = 0;
                        this.Q = null;
                        this.R = 0;
                        this.T = 0;
                    }
                }
            }
        }
        int L2 = org.telegram.messenger.g0.L(12.0f);
        ch.q0 q0Var = this.F0;
        q0Var.b = L2;
        q0Var.o(this.W - org.telegram.messenger.g0.L(24.0f), 1);
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.K || drawable == this.r || super.verifyDrawable(drawable);
    }

    /* JADX WARN: Removed duplicated region for block: B:77:0x0369  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x036c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean w(MotionEvent motionEvent) {
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
            org.telegram.ui.ActionBar.h6 h6Var = this.h1;
            if (action == 0) {
                this.r2 = -1;
                int i12 = 0;
                while (i12 < arrayList.size()) {
                    d0 d0Var = (d0) arrayList.get(i12);
                    float L3 = ((org.telegram.messenger.g0.L(f10) + L2) * i12) + width;
                    RectF rectF = org.telegram.messenger.g0.P;
                    rectF.set(L3, L, L3 + L2, d0Var.f + L);
                    float f11 = x10;
                    float f12 = y10;
                    if (rectF.contains(f11, f12)) {
                        this.r2 = i12;
                        U();
                        if (d0Var.s == null) {
                            y a03 = org.telegram.ui.ActionBar.m6.a0(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.ed, h6Var), 6, 6);
                            d0Var.s = a03;
                            a03.setCallback(this);
                        }
                        d0Var.s.setHotspot(f11, f12);
                        d0Var.s.setState(this.q2);
                        d0Var.b(!d0Var.m);
                        return true;
                    }
                    i12++;
                    f10 = 4.0f;
                }
            } else {
                int i13 = 3;
                if (motionEvent.getAction() == 1) {
                    if (this.r2 != -1) {
                        playSoundEffect(0);
                        d0 d0Var2 = (d0) arrayList.get(this.r2);
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
                                    s0 s0Var = this.g1;
                                    org.telegram.ui.ActionBar.g2 G = s0Var != null ? s0Var.G() : null;
                                    if (G != null && this.Q0 != null) {
                                        org.telegram.ui.Components.c5.s0(G, gd.N0(2131749689, null), org.telegram.messenger.g0.W2(gd.a0(null, null, 2131749690, org.telegram.messenger.n5.t(fj.B0(this.Q0.k)))), gd.N0(2131749691, null), true, new ga(i13, this, G));
                                    }
                                } else if (i14 == 6) {
                                    fj fjVar3 = this.Q0;
                                    if (fjVar3 != null && (message3 = fjVar3.k) != null) {
                                        TLRPC.MessageAction messageAction = message3.action;
                                        if (messageAction instanceof TLRPC.TL_messageActionStarGiftPurchaseOffer) {
                                            TLRPC.TL_messageActionStarGiftPurchaseOffer tL_messageActionStarGiftPurchaseOffer = (TLRPC.TL_messageActionStarGiftPurchaseOffer) messageAction;
                                            org.telegram.ui.ActionBar.g2 Q = LaunchActivity.Q();
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
                                            org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.j5, h6Var);
                                            textView.setTextSize(1, 16.0f);
                                            if (bVar == bVar2) {
                                                String t6 = org.telegram.messenger.n5.t(B0);
                                                Object[] objArr = new Object[4];
                                                objArr[0] = d;
                                                objArr[1] = t6;
                                                objArr[2] = str;
                                                objArr[c10] = d2;
                                                a02 = gd.a0(null, null, 2131749667, objArr);
                                            } else {
                                                String t10 = org.telegram.messenger.n5.t(B0);
                                                Object[] objArr2 = new Object[4];
                                                objArr2[0] = d;
                                                objArr2[1] = t10;
                                                objArr2[2] = str;
                                                objArr2[c10] = d2;
                                                a02 = gd.a0(null, null, 2131749666, objArr2);
                                            }
                                            textView.setText(org.telegram.messenger.g0.W2(a02));
                                            g10.addView(textView, c8.ma.t(-1, -2, 48, 24, 4, 24, 4));
                                            FrameLayout frameLayout = new FrameLayout(context);
                                            frameLayout.setClipChildren(false);
                                            frameLayout.setClipToPadding(false);
                                            ey0 ey0Var = new ey0(context, h6Var);
                                            frameLayout.addView(ey0Var, c8.ma.e(-1, -1, ks.E1));
                                            di.f6.m1(ey0Var, di.y8.l(starGift.attributes, TL_stars.starGiftAttributeModel.class));
                                            di.f6.m1(ey0Var, di.y8.l(starGift.attributes, TL_stars.starGiftAttributeBackdrop.class));
                                            di.f6.m1(ey0Var, di.y8.l(starGift.attributes, TL_stars.starGiftAttributePattern.class));
                                            g10.addView(frameLayout, c8.ma.t(-1, -2, 48, 23, 16, 23, 4));
                                            cg.a k10 = cg.a.k(starGift.value_usd_amount / Math.pow(10.0d, org.telegram.messenger.r1.i().h("USD")), bVar);
                                            if (k10.c() > 0.0d && starGift.value_usd_amount > j3) {
                                                if (k10.b >= j10.b) {
                                                    int round = (int) Math.round((1.0d - (j10.c() / k10.c())) * 100.0d);
                                                    W2 = org.telegram.messenger.g0.W2(gd.a0(null, null, 2131749716, com.google.android.gms.internal.vision.e2.i(round, "%"), starGift.title));
                                                    if (round > 10) {
                                                        z11 = true;
                                                        TextView textView2 = new TextView(context);
                                                        textView2.setTextSize(1, 13.0f);
                                                        textView2.setGravity(17);
                                                        textView2.setText(W2);
                                                        org.telegram.ui.ActionBar.t6.U(textView2, !z11 ? org.telegram.ui.ActionBar.m6.p7 : org.telegram.ui.ActionBar.m6.y6, h6Var);
                                                        g10.addView(textView2, c8.ma.t(-1, -2, 49, 40, 12, 40, 9));
                                                    }
                                                } else {
                                                    W2 = org.telegram.messenger.g0.W2(gd.a0(null, null, 2131749719, com.google.android.gms.internal.vision.e2.i((int) Math.round(((j10.c() / k10.c()) - 1.0d) * 100.0d), "%"), starGift.title));
                                                }
                                                z11 = false;
                                                TextView textView22 = new TextView(context);
                                                textView22.setTextSize(1, 13.0f);
                                                textView22.setGravity(17);
                                                textView22.setText(W2);
                                                org.telegram.ui.ActionBar.t6.U(textView22, !z11 ? org.telegram.ui.ActionBar.m6.p7 : org.telegram.ui.ActionBar.m6.y6, h6Var);
                                                g10.addView(textView22, c8.ma.t(-1, -2, 49, 40, 12, 40, 9));
                                            }
                                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, h6Var);
                                            alertDialog$Builder.o(g10);
                                            alertDialog$Builder.k(pb.V0(gd.a0(null, null, 2131749684, d2), z10), new di.i0(e12, i15, Q));
                                            alertDialog$Builder.h(gd.N0(2131752577, null), null);
                                            alertDialog$Builder.a.show();
                                        }
                                    }
                                } else {
                                    if (i14 == 7) {
                                        s0 s0Var2 = this.g1;
                                        org.telegram.ui.ActionBar.g2 G2 = s0Var2 != null ? s0Var2.G() : null;
                                        if (G2 != null && (fjVar2 = this.Q0) != null && (message2 = fjVar2.k) != null) {
                                            TLRPC.MessageAction messageAction2 = message2.action;
                                            if (messageAction2 instanceof TLRPC.TL_messageActionNoForwardsRequest) {
                                                final TLRPC.TL_messageActionNoForwardsRequest tL_messageActionNoForwardsRequest = (TLRPC.TL_messageActionNoForwardsRequest) messageAction2;
                                                final int i16 = 0;
                                                org.telegram.ui.Components.c5.s0(G2, gd.N0(tL_messageActionNoForwardsRequest.prev_value ? 2131745189 : 2131745178, null), gd.N0(tL_messageActionNoForwardsRequest.prev_value ? 2131745190 : 2131745179, null), gd.N0(2131745195, null), false, new Runnable(this) { // from class: org.telegram.ui.Cells.o0
                                                    public final /* synthetic */ v0 b;

                                                    {
                                                        this.b = this;
                                                    }

                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        switch (i16) {
                                                            case 0:
                                                                v0 v0Var = this.b;
                                                                mp.u1(v0Var.I).p5(fj.B0(v0Var.Q0.k), v0Var.Q0.e1(), tL_messageActionNoForwardsRequest.prev_value, null);
                                                                break;
                                                            default:
                                                                v0 v0Var2 = this.b;
                                                                mp.u1(v0Var2.I).p5(fj.B0(v0Var2.Q0.k), v0Var2.Q0.e1(), tL_messageActionNoForwardsRequest.new_value, null);
                                                                break;
                                                        }
                                                    }
                                                });
                                            }
                                        }
                                    } else if (i14 == 8) {
                                        s0 s0Var3 = this.g1;
                                        org.telegram.ui.ActionBar.g2 G3 = s0Var3 != null ? s0Var3.G() : null;
                                        if (G3 != null && (fjVar = this.Q0) != null && (message = fjVar.k) != null) {
                                            TLRPC.MessageAction messageAction3 = message.action;
                                            if (messageAction3 instanceof TLRPC.TL_messageActionNoForwardsRequest) {
                                                final TLRPC.TL_messageActionNoForwardsRequest tL_messageActionNoForwardsRequest2 = (TLRPC.TL_messageActionNoForwardsRequest) messageAction3;
                                                final int i17 = 1;
                                                org.telegram.ui.Components.c5.s0(G3, gd.N0(tL_messageActionNoForwardsRequest2.new_value ? 2131745189 : 2131745178, null), gd.N0(tL_messageActionNoForwardsRequest2.new_value ? 2131745188 : 2131745177, null), gd.N0(2131745195, null), false, new Runnable(this) { // from class: org.telegram.ui.Cells.o0
                                                    public final /* synthetic */ v0 b;

                                                    {
                                                        this.b = this;
                                                    }

                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        switch (i17) {
                                                            case 0:
                                                                v0 v0Var = this.b;
                                                                mp.u1(v0Var.I).p5(fj.B0(v0Var.Q0.k), v0Var.Q0.e1(), tL_messageActionNoForwardsRequest2.prev_value, null);
                                                                break;
                                                            default:
                                                                v0 v0Var2 = this.b;
                                                                mp.u1(v0Var2.I).p5(fj.B0(v0Var2.Q0.k), v0Var2.Q0.e1(), tL_messageActionNoForwardsRequest2.new_value, null);
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
                        this.r2 = i10;
                        U();
                        return false;
                    }
                } else if (motionEvent.getAction() == 3 && (i7 = this.r2) != -1) {
                    d0 d0Var3 = (d0) arrayList.get(i7);
                    y yVar2 = d0Var3.s;
                    if (yVar2 != null) {
                        yVar2.setState(StateSet.NOTHING);
                    }
                    d0Var3.b(false);
                    this.r2 = -1;
                    U();
                    return false;
                }
            }
        }
        return false;
    }

    public final void x() {
        float f10 = this.b1;
        RectF rectF = this.d1;
        this.b1 = (int) Math.min(f10, rectF.left);
        this.c1 = (int) Math.max(this.c1, rectF.right);
    }

    public final boolean y(float f10, int i7) {
        ch.q0 q0Var = this.F0;
        if (!q0Var.H) {
            return false;
        }
        float y10 = getY() + q0Var.c;
        return y10 > f10 && (y10 + ((float) q0Var.m)) - ((float) org.telegram.messenger.g0.L(16.0f)) < ((float) i7);
    }

    public final void z() {
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
        String N0 = tL_messageActionGiftCode.unclaimed ? gd.N0(2131753173, "BoostingUnclaimedPrize") : gd.N0(2131753539, "BoostingCongratulations");
        String G = i7 == 12 ? gd.G(1, "BoldYears", new Object[0]) : gd.G(i7, "BoldMonths", new Object[0]);
        if (!z10) {
            spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.g0.W2(str == null ? gd.N0(2131753307, null) : gd.a0("BoostingReceivedGiftFrom", null, 2131753308, str)));
            spannableStringBuilder.append((CharSequence) "\n\n");
            org.telegram.messenger.f3.p(null, null, 2131753309, new Object[]{G}, spannableStringBuilder);
        } else if (tL_messageActionGiftCode.unclaimed) {
            spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.g0.W2(gd.a0(null, null, 2131753163, str)));
            spannableStringBuilder.append((CharSequence) "\n\n");
            org.telegram.messenger.f3.p(null, null, 2131753172, new Object[]{G}, spannableStringBuilder);
        } else {
            spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.g0.W2(gd.a0(null, null, 2131753304, str)));
            spannableStringBuilder.append((CharSequence) "\n\n");
            org.telegram.messenger.f3.p(null, null, 2131753305, new Object[]{G}, spannableStringBuilder);
        }
        String N02 = gd.N0(2131753306, "BoostingReceivedGiftOpenBtn");
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(N0);
        valueOf.setSpan(new l41(org.telegram.messenger.g0.o()), 0, valueOf.length(), 33);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        this.k1 = new StaticLayout(valueOf, textPaint, L, alignment, 1.1f, 0.0f, false);
        this.n1 = null;
        this.m1 = null;
        t0 t0Var = this.t1;
        if (t0Var != null) {
            org.telegram.ui.Components.y5.release((v0) t0Var.i, (org.telegram.ui.Components.u5) t0Var.h);
        }
        t0 t0Var2 = new t0(this);
        this.t1 = t0Var2;
        t0Var2.a(spannableStringBuilder, textPaint2, L);
        SpannableStringBuilder valueOf2 = SpannableStringBuilder.valueOf(N02);
        valueOf2.setSpan(new l41(org.telegram.messenger.g0.o()), 0, valueOf2.length(), 33);
        this.p1 = false;
        this.q1 = 0;
        this.x1 = null;
        StaticLayout staticLayout = new StaticLayout(valueOf2, (TextPaint) P("paintChatActionText"), L, alignment, 1.0f, 0.0f, false);
        this.y1 = staticLayout;
        this.z1 = true;
        this.E1 = a0(staticLayout);
    }

    public v0(Context context, org.telegram.ui.ActionBar.h6 h6Var, boolean z10) {
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
        this.r1 = new org.telegram.ui.Components.d6(this, 0L, 320L, nr.h);
        this.z1 = true;
        TextPaint textPaint = new TextPaint(1);
        this.F1 = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.G1 = textPaint2;
        TextPaint textPaint3 = new TextPaint(1);
        this.H1 = textPaint3;
        this.K1 = new RadialProgress2(this, null);
        this.O1 = new ea(this, 2);
        this.V1 = new Path();
        this.Y1 = new ArrayList();
        this.b2 = -1;
        this.e2 = -1;
        this.i2 = new Paint(1);
        this.m2 = new Path();
        this.n2 = new float[8];
        this.o2 = new float[8];
        this.p2 = new Path();
        this.q2 = new int[]{android.R.attr.state_enabled, android.R.attr.state_pressed};
        this.x2 = new u0(this);
        e7Var.a = false;
        this.s = z10;
        this.h1 = h6Var;
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.J = imageReceiver;
        imageReceiver.J0(org.telegram.messenger.g0.u / 2);
        this.M = new org.telegram.ui.Components.b9((org.telegram.ui.ActionBar.h6) null);
        this.x = org.telegram.messenger.a6.q(i7).k();
        textPaint.setTextSize(TypedValue.applyDimension(1, 16.0f, getResources().getDisplayMetrics()));
        textPaint3.setTextSize(TypedValue.applyDimension(1, 15.0f, getResources().getDisplayMetrics()));
        textPaint2.setTextSize(TypedValue.applyDimension(1, 15.0f, getResources().getDisplayMetrics()));
        View view = new View(context);
        this.U1 = view;
        view.setBackground(org.telegram.ui.ActionBar.m6.h0(org.telegram.ui.ActionBar.m6.r1(0.1f, -16777216), 7, org.telegram.messenger.g0.L(16.0f)));
        view.setVisibility(8);
        addView(view);
        ug.s1 s1Var = new ug.s1(10);
        this.W1 = s1Var;
        s1Var.O = 100;
        s1Var.J = false;
        s1Var.M = true;
        s1Var.G = false;
        s1Var.K = true;
        s1Var.H = true;
        s1Var.r = 1;
        s1Var.w = 0.98f;
        s1Var.v = 0.98f;
        s1Var.u = 0.98f;
        s1Var.g = false;
        s1Var.o = 0.0f;
        s1Var.x = 750L;
        s1Var.y = 750;
        s1Var.c();
    }

    @Override // android.view.View
    public final void invalidate(Rect rect) {
        super.invalidate(rect);
        View view = this.w;
        if (view != null) {
            view.invalidate();
        }
        if (!this.t2 || getParent() == null) {
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
        if (!this.t2 || getParent() == null) {
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

    @Override // org.telegram.ui.Cells.q4
    public final /* synthetic */ void c(boolean z10, boolean z11) {
    }

    @Override // org.telegram.messenger.y5
    public final void i(long j3, long j10) {
    }

    @Override // org.telegram.messenger.y5
    public final void o(long j3, long j10) {
    }
}
