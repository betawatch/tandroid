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
import bi.dd;
import bi.tc;
import c8.zc;
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
import org.telegram.messenger.aj;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hc;
import org.telegram.messenger.id;
import org.telegram.messenger.ij;
import org.telegram.messenger.iz;
import org.telegram.messenger.ls;
import org.telegram.messenger.nj;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.messenger.rz;
import org.telegram.messenger.sc;
import org.telegram.messenger.t10;
import org.telegram.messenger.ui;
import org.telegram.messenger.yr;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.RadialProgress2;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.ah0;
import org.telegram.ui.Components.b80;
import org.telegram.ui.Components.c41;
import org.telegram.ui.Components.h01;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.k30;
import org.telegram.ui.Components.kw0;
import org.telegram.ui.Components.ny0;
import org.telegram.ui.Components.qj0;
import org.telegram.ui.Components.ux0;
import org.telegram.ui.Components.v31;
import org.telegram.ui.Components.wp;
import org.telegram.ui.Components.xq;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.fn;
import org.telegram.ui.kj;
import org.telegram.ui.mb;
import org.telegram.ui.ql;
import org.telegram.ui.sf;
import org.telegram.ui.t81;
import org.telegram.ui.xf;
import org.telegram.ui.xw0;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public class t0 extends z implements org.telegram.messenger.x5, ls, p4 {
    public static final HashMap s2;
    public float A0;
    public StaticLayout A1;
    public float B0;
    public float B1;
    public boolean C0;
    public StaticLayout C1;
    public xh.f D;
    public boolean D0;
    public float D1;
    public boolean E;
    public final ch.p0 E0;
    public final TextPaint E1;
    public boolean F;
    public float F0;
    public final TextPaint F1;
    public boolean G;
    public float G0;
    public final TextPaint G1;
    public final int H;
    public bi.m7 H0;
    public TLRPC.Document H1;
    public final ImageReceiver I;
    public org.telegram.ui.Wallet.b4 I0;
    public TLRPC.VideoSize I1;
    public Drawable J;
    public boolean J0;
    public final RadialProgress2 J1;
    public Path K;
    public float K0;
    public int K1;
    public final org.telegram.ui.Components.w8 L;
    public float L0;
    public boolean L1;
    public StaticLayout M;
    public float M0;
    public RectF M1;
    public int N;
    public final RectF N0;
    public final ca N1;
    public int O;
    public kw0 O0;
    public boolean O1;
    public StaticLayout P;
    public ij P0;
    public ColorMatrixColorFilter P1;
    public int Q;
    public int Q0;
    public CornerPathEffect Q1;
    public int R;
    public CharSequence R0;
    public Path R1;
    public int S;
    public zh.v0 S0;
    public ny0 S1;
    public int T;
    public int T0;
    public final View T1;
    public int U;
    public int U0;
    public final Path U1;
    public int V;
    public Paint V0;
    public final ug.p1 V1;
    public boolean W;
    public TextPaint W0;
    public int W1;
    public final ArrayList X0;
    public final ArrayList X1;
    public final ArrayList Y0;
    public f5.u Y1;
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
    public final di.o7 d0;
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
    public final org.telegram.ui.ActionBar.g6 g1;
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
    public ny0 l1;
    public int l2;
    public boolean m0;
    public StaticLayout m1;
    public SpannableStringBuilder m2;
    public final ic n;
    public h01 n0;
    public boolean n1;
    public boolean n2;
    public final RectF o0;
    public boolean o1;
    public Runnable o2;
    public final ArrayList p0;
    public int p1;
    public PorterDuffColorFilter p2;
    public final Stack q0;
    public final org.telegram.ui.Components.w5 q1;
    public int q2;
    public b80 r;
    public org.telegram.ui.Components.n5 r0;
    public h6.m r1;
    public final s0 r2;
    public final boolean s;
    public TextPaint s0;
    public r0 s1;
    public float t0;
    public int t1;
    public float u0;
    public int u1;
    public int v0;
    public int v1;
    public View w;
    public boolean w0;
    public ny0 w1;
    public final int x;
    public hc x0;
    public StaticLayout x1;
    public URLSpan y;
    public float y0;
    public boolean y1;
    public float z0;
    public TextPaint z1;

    static {
        HashMap hashMap = new HashMap();
        s2 = hashMap;
        jg.g.t(1, hashMap, "1⃣", 3, "2⃣");
        jg.g.t(6, hashMap, "3⃣", 12, "4⃣");
        hashMap.put(24, "5⃣");
    }

    public t0(Context context) {
        this(context, null, false);
    }

    public static SpannableStringBuilder D(String str) {
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

    public static float Z(StaticLayout staticLayout) {
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
        return org.telegram.messenger.g0.L(11.0f) + this.S + this.O;
    }

    private void setStarsPaused(boolean z9) {
        ug.p1 p1Var = this.V1;
        if (z9 == p1Var.g) {
            return;
        }
        p1Var.g = z9;
        if (z9) {
            p1Var.R = System.currentTimeMillis();
            return;
        }
        for (int i7 = 0; i7 < p1Var.n.size(); i7++) {
            ug.o1 o1Var = (ug.o1) p1Var.n.get(i7);
            o1Var.a = (System.currentTimeMillis() - p1Var.R) + o1Var.a;
        }
        invalidate();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v7 */
    public final void A(CharSequence charSequence, SpannableStringBuilder spannableStringBuilder, CharSequence charSequence2, boolean z9, CharSequence charSequence3, int i7, String str, int i10, boolean z10) {
        ?? r42;
        int i11;
        int a10;
        CharSequence charSequence4 = charSequence2;
        int L = i10 - org.telegram.messenger.g0.L(16.0f);
        ij ijVar = this.P0;
        if (ijVar != null && ijVar.D == 30) {
            L -= org.telegram.messenger.g0.L(16.0f);
        }
        int i12 = L;
        if (charSequence != null) {
            ij ijVar2 = this.P0;
            TextPaint textPaint = this.E1;
            if (ijVar2 == null || ijVar2.D != 30) {
                textPaint.setTextSize(org.telegram.messenger.g0.L(16.0f));
            } else {
                textPaint.setTextSize(org.telegram.messenger.g0.L(14.0f));
            }
            SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(charSequence);
            valueOf.setSpan(new v31(org.telegram.messenger.g0.o()), 0, valueOf.length(), 33);
            r42 = 0;
            this.j1 = new StaticLayout(valueOf, textPaint, i12, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
        } else {
            r42 = 0;
            this.j1 = null;
        }
        this.m1 = null;
        if (spannableStringBuilder != null) {
            ny0 ny0Var = new ny0(spannableStringBuilder, 10.0f, null);
            this.l1 = ny0Var;
            ny0Var.a.linkColor = -1;
        } else {
            this.l1 = null;
        }
        ij ijVar3 = this.P0;
        TextPaint textPaint2 = this.F1;
        if (ijVar3 != null && ijVar3.D == 35) {
            textPaint2.setTextSize(org.telegram.messenger.g0.L(14.3f));
        } else if (ijVar3 == null || !(W() || (i11 = this.P0.D) == 30 || i11 == 18 || i11 == 31 || i11 == 37 || i11 == 33)) {
            textPaint2.setTextSize(org.telegram.messenger.g0.L(15.0f));
        } else {
            textPaint2.setTextSize(org.telegram.messenger.g0.L(13.0f));
        }
        int L2 = i12 - org.telegram.messenger.g0.L(12.0f);
        ij ijVar4 = this.P0;
        if (ijVar4 != null && ijVar4.D == 22 && ij.B0(ijVar4.k) >= 0 && (a10 = fi.m3.a(charSequence4, textPaint2)) < L2 && a10 > L2 / 5.0f) {
            L2 = a10;
        }
        if (charSequence4 == 0) {
            r0 r0Var = this.s1;
            if (r0Var != null) {
                org.telegram.ui.Components.r5.release((t0) r0Var.i, (org.telegram.ui.Components.n5) r0Var.h);
                this.s1 = null;
            }
            this.o1 = r42;
        } else {
            if (this.s1 == null) {
                this.s1 = new r0(this);
            }
            try {
                charSequence4 = org.telegram.messenger.i6.m(charSequence4, textPaint2.getFontMetricsInt(), r42, null, r42);
            } catch (Exception unused) {
            }
            this.s1.a(charSequence4, textPaint2, L2);
            if (!z9 || ((StaticLayout) this.s1.f).getLineCount() <= 3) {
                this.o1 = r42;
                this.q1.f(true, true);
                this.p1 = r42;
            } else {
                this.o1 = !this.n1;
                this.p1 = ((StaticLayout) this.s1.f).getLineBottom(2);
                this.w1 = new ny0(id.M0(2131750265, null), textPaint2.getTextSize() / org.telegram.messenger.g0.p, org.telegram.messenger.g0.o());
                int lineBottom = ((StaticLayout) this.s1.f).getLineBottom(2);
                this.u1 = lineBottom;
                this.v1 = lineBottom - ((StaticLayout) this.s1.f).getLineTop(2);
                this.t1 = (int) ((StaticLayout) this.s1.f).getLineRight(2);
            }
            if (this.o1) {
                int lineEnd = ((StaticLayout) this.s1.f).getLineEnd(2) - 1;
                r0 r0Var2 = this.s1;
                CharSequence charSequence5 = charSequence4;
                if (lineEnd >= 0) {
                    charSequence5 = charSequence4.subSequence(r42, lineEnd);
                }
                r0Var2.a(charSequence5, textPaint2, L2);
            }
        }
        if (charSequence3 != null) {
            SpannableStringBuilder valueOf2 = SpannableStringBuilder.valueOf(charSequence3);
            valueOf2.setSpan(new v31(org.telegram.messenger.g0.o()), r42, valueOf2.length(), 33);
            StaticLayout staticLayout = new StaticLayout(valueOf2, (TextPaint) N("paintChatActionText"), i12, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
            this.x1 = staticLayout;
            this.y1 = (!z10 || this.o1) ? r42 : true;
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
            this.Q1 = new CornerPathEffect(org.telegram.messenger.g0.L(5.0f));
        }
        if (this.R1 == null) {
            Path path = new Path();
            this.R1 = path;
            zh.b1.d(path, 1.35f, r42);
        }
        ny0 ny0Var2 = new ny0(str, i7, org.telegram.messenger.g0.o());
        this.S1 = ny0Var2;
        ny0Var2.p = org.telegram.messenger.g0.L(62.0f);
    }

    public final void B(int i7, CharSequence charSequence) {
        CharSequence charSequence2;
        q0 q0Var;
        TLRPC.Message message;
        ij ijVar;
        int i10;
        int L = i7 - org.telegram.messenger.g0.L(30.0f);
        if (this.i0) {
            L -= org.telegram.messenger.g0.L(64.0f);
        }
        if (V()) {
            L = Math.min(L - org.telegram.messenger.g0.L(this.i0 ? 28.0f : 82.0f), org.telegram.messenger.g0.L(272.0f));
        }
        if (L < 0) {
            return;
        }
        int i11 = this.f2;
        if (i11 > 0) {
            L = Math.min(i11, L);
        }
        int i12 = L;
        this.d1 = true;
        TextPaint textPaint = (V() || ((ijVar = this.P0) != null && ((i10 = ijVar.D) == 34 || i10 == 35))) ? (TextPaint) N("paintChatActionText3") : (ijVar == null || !ijVar.q2) ? (TextPaint) N("paintChatActionText") : (TextPaint) N("paintChatActionText2");
        textPaint.linkColor = textPaint.getColor();
        if (V()) {
            if (charSequence instanceof Spannable) {
                Spannable spannable = (Spannable) charSequence;
                for (org.telegram.messenger.f6 f6Var : (org.telegram.messenger.f6[]) spannable.getSpans(0, spannable.length(), org.telegram.messenger.f6.class)) {
                    spannable.removeSpan(f6Var);
                }
            }
            charSequence2 = org.telegram.messenger.i6.n(charSequence, textPaint.getFontMetricsInt(), false, null, 0, 0.85f, 0);
        } else {
            charSequence2 = charSequence;
        }
        TextPaint textPaint2 = textPaint;
        CharSequence charSequence3 = charSequence2;
        this.M = new StaticLayout(charSequence2, textPaint2, i12, V() ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
        this.P = null;
        ij ijVar2 = this.P0;
        if (ijVar2 != null && (message = ijVar2.k) != null) {
            TLRPC.MessageAction messageAction = message.action;
            if (messageAction instanceof TLRPC.TL_messageActionSuggestedPostApproval) {
                TLRPC.TL_messageActionSuggestedPostApproval tL_messageActionSuggestedPostApproval = (TLRPC.TL_messageActionSuggestedPostApproval) messageAction;
                if (!tL_messageActionSuggestedPostApproval.rejected && !tL_messageActionSuggestedPostApproval.balance_too_low) {
                    this.P = new StaticLayout(org.telegram.messenger.i6.n(org.telegram.messenger.g0.X2(id.M0(2131744366, null)), textPaint2.getFontMetricsInt(), false, null, 0, 1.0f, 0), textPaint2, i12, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                }
            }
        }
        this.r0 = org.telegram.ui.Components.r5.update(0, this, (!this.s || (q0Var = this.f1) == null || q0Var.g()) ? false : true, this.r0, this.M);
        this.O = 0;
        this.N = 0;
        this.Q = 0;
        StaticLayout staticLayout = this.P;
        if (staticLayout != null) {
            int height = staticLayout.getHeight();
            this.Q = height;
            this.Q = org.telegram.messenger.g0.L(12.0f) + height;
        }
        ij ijVar3 = this.P0;
        if (ijVar3 == null || !ijVar3.h2) {
            try {
                int lineCount = this.M.getLineCount();
                for (int i13 = 0; i13 < lineCount; i13++) {
                    try {
                        float lineWidth = this.M.getLineWidth(i13);
                        float f10 = i12;
                        if (lineWidth > f10) {
                            lineWidth = f10;
                        }
                        this.O = (int) Math.max(this.O, Math.ceil(this.M.getLineBottom(i13)));
                        this.N = (int) Math.max(this.N, Math.ceil(lineWidth));
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.g(e10, true);
                        return;
                    }
                }
            } catch (Exception e11) {
                org.telegram.messenger.a8.g(e11, true);
            }
        }
        this.R = (i7 - this.N) / 2;
        int L2 = org.telegram.messenger.g0.L(7.0f);
        this.S = L2;
        if (this.P != null) {
            this.S = org.telegram.messenger.k5.C(11.0f, this.Q, L2);
        }
        this.T = (i7 - (V() ? this.N : this.M.getWidth())) / 2;
        this.U = (i7 - i12) / 2;
        Stack stack = this.q0;
        ArrayList arrayList = this.p0;
        stack.addAll(arrayList);
        arrayList.clear();
        if (charSequence3 instanceof Spannable) {
            StaticLayout staticLayout2 = this.M;
            int i14 = this.R;
            xh.f.a(this, staticLayout2, i14, i14 + this.N, (Spannable) charSequence3, stack, arrayList, null);
        }
    }

    public final void E(Canvas canvas, boolean z9) {
        Paint paint;
        Paint paint2;
        org.telegram.ui.ActionBar.g6 g6Var;
        float f10;
        float f11;
        float f12;
        float f13;
        t0 t0Var;
        org.telegram.ui.ActionBar.g6 g6Var2;
        Paint paint3;
        Paint paint4;
        int i7;
        int i10;
        Canvas canvas2;
        float f14;
        float f15;
        float f16;
        int i11;
        r0 r0Var;
        int L;
        RectF rectF;
        ArrayList arrayList;
        int i12;
        float f17;
        int i13;
        Paint paint5;
        int i14;
        float f18;
        ArrayList arrayList2;
        org.telegram.ui.ActionBar.g6 g6Var3;
        int i15;
        t0 t0Var2 = this;
        if (!t0Var2.s || ((!t0Var2.Q() || z9) && (t0Var2.Q() || !z9))) {
            Paint N = t0Var2.N("paintChatActionBackground");
            Paint N2 = t0Var2.N("paintChatActionBackgroundDarken");
            t0Var2.s0 = (TextPaint) t0Var2.N("paintChatActionText");
            int i16 = t0Var2.T0;
            org.telegram.ui.ActionBar.g6 g6Var4 = t0Var2.g1;
            if (i16 >= 0) {
                int w02 = org.telegram.ui.ActionBar.l6.w0(i16, g6Var4);
                if (t0Var2.V0 == null) {
                    Paint paint6 = new Paint(1);
                    t0Var2.V0 = paint6;
                    paint6.setColor(w02);
                    TextPaint textPaint = new TextPaint(1);
                    t0Var2.W0 = textPaint;
                    textPaint.setTypeface(org.telegram.messenger.g0.o());
                    t0Var2.W0.setTextSize(org.telegram.messenger.g0.L(Math.max(16, iz.W0) - 2));
                    t0Var2.W0.setColor(org.telegram.ui.ActionBar.l6.w0(t0Var2.U0, g6Var4));
                }
                N = t0Var2.V0;
                t0Var2.s0 = t0Var2.W0;
            }
            boolean z10 = t0Var2.d1;
            Path path = t0Var2.Z0;
            if (z10) {
                t0Var2.d1 = false;
                t0Var2.a1 = t0Var2.getWidth();
                t0Var2.b1 = 0;
                ArrayList arrayList3 = t0Var2.X0;
                arrayList3.clear();
                StaticLayout staticLayout = t0Var2.M;
                int lineCount = staticLayout == null ? 0 : staticLayout.getLineCount();
                int L2 = org.telegram.messenger.g0.L(11.0f);
                f11 = 6.0f;
                int L3 = org.telegram.messenger.g0.L(8.0f);
                f10 = 8.0f;
                int i17 = 0;
                int i18 = 0;
                while (i17 < lineCount) {
                    int ceil = (int) Math.ceil(t0Var2.M.getLineWidth(i17));
                    if (i17 != 0 && (i15 = i18 - ceil) > 0 && i15 <= (L2 * 1.5f) + L3) {
                        ceil = i18;
                    }
                    i17 = com.google.android.recaptcha.internal.a.f(ceil, i17, 1, arrayList3);
                    i18 = ceil;
                }
                f12 = 4.0f;
                f13 = 2.0f;
                for (int i19 = lineCount - 2; i19 >= 0; i19--) {
                    int intValue = ((Integer) arrayList3.get(i19)).intValue();
                    int i20 = i18 - intValue;
                    if (i20 <= 0 || i20 > (L2 * 1.5f) + L3) {
                        i18 = intValue;
                    }
                    arrayList3.set(i19, Integer.valueOf(i18));
                }
                int L4 = org.telegram.messenger.g0.L(4.0f);
                int measuredWidth = t0Var2.getMeasuredWidth() / 2;
                int L5 = org.telegram.messenger.g0.L(3.0f);
                int L6 = org.telegram.messenger.g0.L(6.0f);
                int i21 = L2 - L5;
                ArrayList arrayList4 = t0Var2.Y0;
                arrayList4.clear();
                path.reset();
                float f19 = measuredWidth;
                path.moveTo(f19, L4);
                int i22 = i18;
                int i23 = 0;
                int i24 = 0;
                while (true) {
                    rectF = t0Var2.c1;
                    if (i24 >= lineCount) {
                        break;
                    }
                    int i25 = lineCount;
                    int intValue2 = ((Integer) arrayList3.get(i24)).intValue();
                    int lineBottom = t0Var2.M.getLineBottom(i24);
                    int i26 = i25 - 1;
                    if (i24 < i26) {
                        paint5 = N2;
                        i14 = ((Integer) arrayList3.get(i24 + 1)).intValue();
                    } else {
                        paint5 = N2;
                        i14 = 0;
                    }
                    int i27 = lineBottom - i23;
                    if (i24 == 0 || intValue2 > i22) {
                        i27 = org.telegram.messenger.g0.L(3.0f) + i27;
                    }
                    if (i24 == i26 || intValue2 > i14) {
                        i27 = org.telegram.messenger.g0.L(3.0f) + i27;
                    }
                    Paint paint7 = N;
                    float f20 = (intValue2 / 2.0f) + f19;
                    int i28 = (i24 == i26 || intValue2 >= i14 || i24 == 0 || intValue2 >= i22) ? L3 : L6;
                    if (i24 == 0 || intValue2 > i22) {
                        f18 = f20;
                        arrayList2 = arrayList3;
                        g6Var3 = g6Var4;
                        rectF.set((f18 - L5) - L2, L4, f18 + i21, (L2 * 2) + L4);
                        x();
                        path.arcTo(rectF, -90.0f, 90.0f);
                    } else {
                        f18 = f20;
                        if (intValue2 < i22) {
                            float f21 = f18 + i21;
                            g6Var3 = g6Var4;
                            arrayList2 = arrayList3;
                            rectF.set(f21, L4, (i28 * 2) + f21, r0 + L4);
                            x();
                            path.arcTo(rectF, -90.0f, -90.0f);
                        } else {
                            arrayList2 = arrayList3;
                            g6Var3 = g6Var4;
                        }
                    }
                    L4 += i27;
                    if (i24 != i26 && intValue2 < i14) {
                        L4 -= org.telegram.messenger.g0.L(3.0f);
                        i27 -= org.telegram.messenger.g0.L(3.0f);
                    }
                    if (i24 != 0 && intValue2 < i22) {
                        L4 -= org.telegram.messenger.g0.L(3.0f);
                        i27 -= org.telegram.messenger.g0.L(3.0f);
                    }
                    arrayList4.add(Integer.valueOf(i27));
                    if (i24 == i26 || intValue2 > i14) {
                        rectF.set((f18 - L5) - L2, L4 - (L2 * 2), f18 + i21, L4);
                        x();
                        path.arcTo(rectF, 0.0f, 90.0f);
                    } else if (intValue2 < i14) {
                        float f22 = f18 + i21;
                        rectF.set(f22, L4 - r0, (i28 * 2) + f22, L4);
                        x();
                        path.arcTo(rectF, 180.0f, -90.0f);
                    }
                    i24++;
                    t0Var2 = this;
                    i22 = intValue2;
                    i23 = lineBottom;
                    lineCount = i25;
                    N2 = paint5;
                    N = paint7;
                    g6Var4 = g6Var3;
                    arrayList3 = arrayList2;
                }
                paint = N;
                paint2 = N2;
                ArrayList arrayList5 = arrayList3;
                g6Var = g6Var4;
                int i29 = lineCount - 1;
                int i30 = i29;
                while (i30 >= 0) {
                    if (i30 != 0) {
                        arrayList = arrayList5;
                        i12 = ((Integer) arrayList.get(i30 - 1)).intValue();
                    } else {
                        arrayList = arrayList5;
                        i12 = 0;
                    }
                    int intValue3 = ((Integer) arrayList.get(i30)).intValue();
                    int intValue4 = i30 != i29 ? ((Integer) arrayList.get(i30 + 1)).intValue() : 0;
                    this.M.getLineBottom(i30);
                    float f23 = measuredWidth - (intValue3 / 2);
                    int i31 = (i30 == i29 || intValue3 >= intValue4 || i30 == 0 || intValue3 >= i12) ? L3 : L6;
                    if (i30 == i29 || intValue3 > intValue4) {
                        arrayList5 = arrayList;
                        f17 = f23;
                        i13 = i31;
                        rectF.set(f17 - i21, L4 - (L2 * 2), f17 + L5 + L2, L4);
                        x();
                        path.arcTo(rectF, 90.0f, 90.0f);
                    } else if (intValue3 < intValue4) {
                        float f24 = f23 - i21;
                        arrayList5 = arrayList;
                        f17 = f23;
                        i13 = i31;
                        rectF.set(f24 - (i31 * 2), L4 - r2, f24, L4);
                        x();
                        path.arcTo(rectF, 90.0f, -90.0f);
                    } else {
                        arrayList5 = arrayList;
                        f17 = f23;
                        i13 = i31;
                    }
                    L4 -= ((Integer) arrayList4.get(i30)).intValue();
                    if (i30 == 0 || intValue3 > i12) {
                        rectF.set(f17 - i21, L4, f17 + L5 + L2, (L2 * 2) + L4);
                        x();
                        path.arcTo(rectF, 180.0f, 90.0f);
                    } else if (intValue3 < i12) {
                        float f25 = f17 - i21;
                        rectF.set(f25 - (i13 * 2), L4, f25, r9 + L4);
                        x();
                        path.arcTo(rectF, 0.0f, -90.0f);
                    }
                    i30--;
                }
                t0Var = this;
                path.close();
                if (t0Var.V() && !t0Var.W()) {
                    rectF.left = (f19 - (t0Var.N / 2.0f)) - org.telegram.messenger.g0.L(17.0f);
                    rectF.top = L4;
                    rectF.right = (t0Var.N / 2.0f) + f19 + org.telegram.messenger.g0.L(17.0f);
                    rectF.bottom = org.telegram.messenger.g0.L(28.0f) + L4 + t0Var.O + t0Var.Q;
                    path.reset();
                    path.addRoundRect(rectF, org.telegram.messenger.g0.L(15.0f), org.telegram.messenger.g0.L(15.0f), Path.Direction.CW);
                    path.close();
                }
            } else {
                paint = N;
                paint2 = N2;
                g6Var = g6Var4;
                f10 = 8.0f;
                f11 = 6.0f;
                f12 = 4.0f;
                f13 = 2.0f;
                t0Var = t0Var2;
            }
            if (!t0Var.w0) {
                t0Var.v0 = ((ViewGroup) t0Var.getParent()).getMeasuredHeight();
            }
            if (g6Var != null) {
                g6Var2 = g6Var;
                g6Var2.b(t0Var.u0, t0Var.t0 + org.telegram.messenger.g0.L(f12), t0Var.getMeasuredWidth(), t0Var.v0);
            } else {
                g6Var2 = g6Var;
                org.telegram.ui.ActionBar.l6.r(t0Var.u0, t0Var.t0 + org.telegram.messenger.g0.L(f12), t0Var.getMeasuredWidth(), t0Var.v0);
            }
            boolean z11 = t0Var instanceof kj;
            float f26 = (!z11 || org.telegram.ui.ActionBar.l6.i1(g6Var2)) ? 1.0f : 0.75f;
            if (!z9 || (t0Var.getAlpha() == 1.0f && !z11)) {
                paint3 = paint2;
                paint4 = paint;
                if (z11) {
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
                paint4.setAlpha((int) (t0Var.getAlpha() * i7 * f26));
                paint3 = paint2;
                paint3.setAlpha((int) (t0Var.getAlpha() * i10 * f26));
            }
            ij ijVar = t0Var.P0;
            Paint paint8 = t0Var.c2;
            if (ijVar == null || !ijVar.h2) {
                canvas2 = canvas;
                canvas2.drawPath(path, paint4);
                if (t0Var.Q() && paint3.getAlpha() > 0) {
                    canvas2.drawPath(path, paint3);
                }
                if (t0Var.b2 > 0.0f) {
                    int alpha = paint8.getAlpha();
                    if (z9) {
                        paint8.setAlpha((int) (t0Var.getAlpha() * alpha));
                    }
                    canvas2.drawPath(path, paint8);
                    paint8.setAlpha(alpha);
                }
            } else {
                canvas2 = canvas;
            }
            if (t0Var.S()) {
                int width = t0Var.getWidth();
                t0Var.I0.getClass();
                float L7 = (width - org.telegram.messenger.g0.L(206.0f)) / f13;
                float walletActionTop = t0Var.getWalletActionTop();
                t0Var.I0.getClass();
                float L8 = org.telegram.messenger.g0.L(206.0f) + L7;
                if (t0Var.I0.q0 == null) {
                    L = org.telegram.messenger.g0.L(140.0f);
                    f14 = 140.0f;
                    f15 = 20.0f;
                } else {
                    f14 = 140.0f;
                    f15 = 20.0f;
                    L = org.telegram.messenger.g0.L(150.0f) + ((int) Math.ceil(r13.q0.i()));
                }
                RectF rectF2 = t0Var.N0;
                rectF2.set(L7, walletActionTop, L8, L + walletActionTop);
                canvas2.save();
                t0Var.I0.c(canvas2, L7, walletActionTop);
                canvas2.drawRoundRect(rectF2, org.telegram.messenger.g0.L(f15), org.telegram.messenger.g0.L(f15), paint4);
                if (t0Var.Q() && paint3.getAlpha() > 0) {
                    canvas2.drawRoundRect(rectF2, org.telegram.messenger.g0.L(f15), org.telegram.messenger.g0.L(f15), paint3);
                }
                f16 = 0.0f;
                if (t0Var.b2 > 0.0f) {
                    int alpha2 = paint8.getAlpha();
                    if (z9) {
                        paint8.setAlpha((int) (t0Var.getAlpha() * alpha2));
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
            ij ijVar2 = t0Var.P0;
            if (t0Var.R()) {
                float L9 = t0Var.H0.T.f + org.telegram.messenger.g0.L(f10);
                float width2 = (t0Var.getWidth() - L9) / f13;
                float L10 = t0Var.H0.p ? f16 : org.telegram.messenger.g0.L(12.0f) + t0Var.S + t0Var.O;
                RectF rectF3 = org.telegram.messenger.g0.P;
                rectF3.set(width2, L10, L9 + width2, t0Var.H0.P + L10 + org.telegram.messenger.g0.L(f10));
                if (t0Var.M1 == null) {
                    t0Var.M1 = new RectF();
                }
                t0Var.M1.set(rectF3);
                canvas2.drawRoundRect(t0Var.M1, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), paint4);
                if (t0Var.Q()) {
                    canvas2.drawRoundRect(t0Var.M1, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), paint3);
                }
            } else if (t0Var.O0 != null) {
                float L11 = org.telegram.messenger.g0.L(174.0f);
                kw0 kw0Var = t0Var.O0;
                kw0Var.getClass();
                float L12 = org.telegram.messenger.g0.L(f14) + ((int) kw0Var.f.i()) + (kw0Var.i ? org.telegram.messenger.g0.L(40.0f) : 0);
                float width3 = (t0Var.getWidth() - L11) / f13;
                if (t0Var.M1 == null) {
                    t0Var.M1 = new RectF();
                }
                t0Var.M1.set(width3, org.telegram.messenger.g0.L(f12), L11 + width3, org.telegram.messenger.g0.L(f12) + L12);
                canvas2.drawRoundRect(t0Var.M1, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), paint4);
                if (t0Var.Q()) {
                    canvas2.drawRoundRect(t0Var.M1, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), paint3);
                }
            } else if (t0Var.U(ijVar2)) {
                float width4 = (t0Var.getWidth() - t0Var.i1) / f13;
                float f27 = t0Var.S + t0Var.O;
                if (t0Var.W()) {
                    float L13 = f27 + org.telegram.messenger.g0.L(f12);
                    org.telegram.messenger.g0.P.set(width4, L13, t0Var.i1 + width4, t0Var.f + L13);
                } else {
                    float L14 = f27 + org.telegram.messenger.g0.L(12.0f);
                    RectF rectF4 = org.telegram.messenger.g0.P;
                    float f28 = t0Var.i1;
                    rectF4.set(width4, L14, width4 + f28, f28 + L14 + t0Var.K1);
                }
                if (ijVar2 != null && ijVar2.D == 18 && !t0Var.o1 && (r0Var = t0Var.s1) != null && t0Var.p1 > 0) {
                    RectF rectF5 = org.telegram.messenger.g0.P;
                    rectF5.bottom = com.google.android.recaptcha.internal.a.v(1.0f, t0Var.q1.c, ((StaticLayout) r0Var.f).getHeight() - t0Var.p1, rectF5.bottom);
                }
                if (t0Var.M1 == null) {
                    t0Var.M1 = new RectF();
                }
                t0Var.M1.set(org.telegram.messenger.g0.P);
                if (ijVar2 == null || (!((i11 = ijVar2.D) == 33 || i11 == 35) || t0Var.Y1 == null)) {
                    canvas2.drawRoundRect(t0Var.M1, org.telegram.messenger.g0.L(f15), org.telegram.messenger.g0.L(f15), paint4);
                    if (t0Var.Q()) {
                        canvas2.drawRoundRect(t0Var.M1, org.telegram.messenger.g0.L(f15), org.telegram.messenger.g0.L(f15), paint3);
                    }
                } else {
                    float L15 = org.telegram.messenger.g0.L(16.0f);
                    float[] fArr = t0Var.h2;
                    Arrays.fill(fArr, L15);
                    float L16 = org.telegram.messenger.g0.L(f11);
                    fArr[7] = L16;
                    fArr[6] = L16;
                    fArr[5] = L16;
                    fArr[4] = L16;
                    Path path2 = t0Var.g2;
                    path2.rewind();
                    path2.addRoundRect(t0Var.M1, fArr, Path.Direction.CW);
                    canvas2.drawPath(path2, paint4);
                    if (t0Var.Q()) {
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
        float f10;
        float f11;
        Canvas canvas2 = canvas;
        canvas2.save();
        float f12 = 2.0f;
        canvas2.translate(this.j0 / 2.0f, getPaddingTop());
        canvas2.save();
        canvas2.translate(this.T, this.S);
        StaticLayout staticLayout = this.M;
        org.telegram.ui.Components.r5.drawAnimatedEmojis(canvas2, staticLayout, this.r0, 0.0f, this.p0, 0.0f, 0.0f, 0.0f, 1.0f, staticLayout != null ? K(staticLayout.getPaint().getColor()) : null);
        canvas2.restore();
        float f13 = 4.0f;
        if (R()) {
            canvas2.save();
            float width = getWidth();
            bi.m7 m7Var = this.H0;
            canvas2.translate((width - m7Var.T.f) / 2.0f, m7Var.p ? org.telegram.messenger.g0.L(4.0f) : org.telegram.messenger.g0.L(16.0f) + this.S + this.O);
            this.H0.c(canvas2);
            canvas2.restore();
        }
        canvas2.restore();
        h01 h01Var = this.n0;
        org.telegram.ui.ActionBar.g6 g6Var = this.g1;
        if (h01Var != null) {
            float alpha = getAlpha();
            if (g6Var != null) {
                g6Var.b(this.u0, this.t0 + 0.0f, getMeasuredWidth(), this.v0);
            } else {
                org.telegram.ui.ActionBar.l6.r(this.u0, this.t0 + 0.0f, getMeasuredWidth(), this.v0);
            }
            this.n0.c(canvas, getWidth(), this.j0, 0.0f, 1.0f, alpha, this.m0);
            canvas2 = canvas;
        }
        ArrayList arrayList = this.X1;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        if (g6Var != null) {
            g6Var.b(this.u0, this.t0 + org.telegram.messenger.g0.L(4.0f), getMeasuredWidth(), this.v0);
        } else {
            org.telegram.ui.ActionBar.l6.r(this.u0, this.t0 + org.telegram.messenger.g0.L(4.0f), getMeasuredWidth(), this.v0);
        }
        float width2 = (getWidth() - this.i1) / 2.0f;
        float L = org.telegram.messenger.g0.L(4.0f) + org.telegram.messenger.g0.L(4.0f) + this.S + this.O + this.f;
        float L2 = (this.i1 - org.telegram.messenger.g0.L(4.0f)) / 2.0f;
        int i7 = 0;
        while (i7 < arrayList.size()) {
            c0 c0Var = (c0) arrayList.get(i7);
            float a10 = c0Var.a();
            float L3 = ((org.telegram.messenger.g0.L(f13) + L2) * i7) + width2;
            float f14 = L3 + L2;
            RectF rectF = this.c1;
            rectF.set(L3, L, f14, c0Var.f + L);
            canvas2.save();
            if (a10 != 1.0f) {
                f10 = f13;
                canvas2.scale(a10, a10, rectF.centerX(), rectF.centerY());
            } else {
                f10 = f13;
            }
            float L4 = org.telegram.messenger.g0.L(Math.min(6.75f, iz.Y0));
            float[] fArr = this.i2;
            Arrays.fill(fArr, L4);
            if ((c0Var.g & 9) == 9) {
                float L5 = org.telegram.messenger.g0.L(iz.Y0);
                fArr[7] = L5;
                fArr[6] = L5;
            }
            if ((c0Var.g & 10) == 10) {
                float L6 = org.telegram.messenger.g0.L(iz.Y0);
                fArr[5] = L6;
                fArr[4] = L6;
            }
            Path path = this.j2;
            path.rewind();
            path.addRoundRect(rectF, fArr, Path.Direction.CW);
            canvas2.drawPath(path, N("paintChatActionBackground"));
            if (Q()) {
                canvas2.drawPath(path, org.telegram.ui.ActionBar.l6.h2);
            }
            canvas2.save();
            canvas2.clipPath(path);
            y yVar = c0Var.s;
            if (yVar != null) {
                int i10 = (int) L;
                yVar.setBounds((int) L3, i10, (int) f14, c0Var.f + i10);
                c0Var.s.setAlpha(qs.e4);
                c0Var.s.draw(canvas2);
            }
            canvas2.restore();
            canvas2.save();
            float L7 = c0Var.t != null ? org.telegram.messenger.g0.L(26.0f) : 0;
            float A = com.google.android.recaptcha.internal.a.A(L2 - (c0Var.h.k() + (c0Var.t != null ? org.telegram.messenger.g0.L(f10) : 0)), L7, f12, L3);
            Drawable drawable = c0Var.t;
            if (drawable != null) {
                int i11 = (int) A;
                f11 = f12;
                drawable.setBounds(i11, (int) (((c0Var.f - org.telegram.messenger.g0.L(24.0f)) / f12) + L), org.telegram.messenger.g0.L(24.0f) + i11, org.telegram.messenger.g0.L(24.0f) + ((int) (((c0Var.f - org.telegram.messenger.g0.L(24.0f)) / f11) + L)));
                c0Var.t.setAlpha(c0Var.m ? 128 : qs.e4);
                c0Var.t.draw(canvas2);
                A += L7;
            } else {
                f11 = f12;
            }
            c0Var.h.p = Math.max(1, (((int) L2) - org.telegram.messenger.g0.L(15.0f)) - r6);
            c0Var.h.f(canvas2, A, (org.telegram.messenger.g0.L(40.0f) / f11) + L, c0Var.m ? 0.5f : 1.0f);
            canvas2.restore();
            canvas2.restore();
            i7++;
            f13 = f10;
            f12 = f11;
        }
    }

    public final void H(Canvas canvas, boolean z9) {
        if (this.s) {
            if (Q() && !z9) {
                return;
            }
            if (!Q() && z9) {
                return;
            }
        }
        I(canvas, z9, null);
    }

    public final void I(Canvas canvas, boolean z9, Integer num) {
        Canvas canvas2;
        float alpha = z9 ? getAlpha() : 1.0f;
        if (alpha <= 0.0f) {
            return;
        }
        org.telegram.ui.ActionBar.g6 g6Var = this.g1;
        if (g6Var != null) {
            g6Var.b(this.u0, this.t0 + org.telegram.messenger.g0.L(4.0f), getMeasuredWidth(), this.v0);
        } else {
            org.telegram.ui.ActionBar.l6.r(this.u0, this.t0 + org.telegram.messenger.g0.L(4.0f), getMeasuredWidth(), this.v0);
        }
        ij ijVar = this.P0;
        if (ijVar == null || !ijVar.O5()) {
            return;
        }
        ch.p0 p0Var = this.E0;
        p0Var.getClass();
        p0Var.a = 1.0f;
        if (alpha < 1.0f) {
            canvas2 = canvas;
            canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (alpha * 255.0f), 31);
        } else {
            canvas2 = canvas;
        }
        s0 s0Var = this.r2;
        p0Var.d(canvas2, s0Var.b ? s0Var.c : 1.0f, num);
        if (alpha < 1.0f) {
            canvas2.restore();
        }
    }

    public final void J(ql qlVar, Canvas canvas, int i7, Integer num, float f10) {
        ch.p0 p0Var = this.E0;
        p0Var.getClass();
        org.telegram.ui.ActionBar.g6 g6Var = this.g1;
        if (g6Var != null) {
            g6Var.b(this.u0, this.t0 + org.telegram.messenger.g0.L(4.0f), getMeasuredWidth(), this.v0);
        } else {
            org.telegram.ui.ActionBar.l6.r(this.u0, this.t0 + org.telegram.messenger.g0.L(4.0f), getMeasuredWidth(), this.v0);
        }
        p0Var.A = f10;
        p0Var.f(qlVar, canvas, i7, num);
    }

    public final ColorFilter K(int i7) {
        if (i7 != this.q2 || this.p2 == null) {
            this.q2 = i7;
            this.p2 = new PorterDuffColorFilter(i7, PorterDuff.Mode.SRC_IN);
        }
        return this.p2;
    }

    public final int L(ij ijVar) {
        int i7;
        int i10 = this.h1;
        int i11 = ijVar.D;
        if (i11 == 37) {
            i10 = org.telegram.messenger.g0.L(52.0f);
        } else if (i11 == 21 || W()) {
            i10 = org.telegram.messenger.g0.L(78.0f);
        }
        if (V() || (i7 = ijVar.D) == 34 || i7 == 35) {
            return 0;
        }
        return i10;
    }

    @Override // org.telegram.messenger.x5
    public final void M(String str) {
        TLRPC.PhotoSize photoSize;
        ij ijVar = this.P0;
        if (ijVar == null || ijVar.D != 11) {
            return;
        }
        int size = ijVar.n0.size();
        int i7 = 0;
        while (true) {
            if (i7 >= size) {
                photoSize = null;
                break;
            }
            photoSize = (TLRPC.PhotoSize) ijVar.n0.get(i7);
            if (photoSize instanceof TLRPC.TL_photoStrippedSize) {
                break;
            } else {
                i7++;
            }
        }
        this.I.r0(this.x0, "g", hc.f(photoSize, ijVar.l0), "50_50_b", this.L, 0L, null, ijVar, 1);
        org.telegram.messenger.z5.q(this.H).v(this);
    }

    public Paint N(String str) {
        org.telegram.ui.ActionBar.g6 g6Var = this.g1;
        Paint d = g6Var != null ? g6Var.d(str) : null;
        return d != null ? d : org.telegram.ui.ActionBar.l6.V0(str);
    }

    public final float P(ij ijVar) {
        qp s12;
        String str;
        if (ijVar == null) {
            return 1.0f;
        }
        try {
            if (ijVar.D == 22 && (str = (s12 = qp.s1(this.H)).Q2) != null && TextUtils.equals(ijVar.k.action.wallpaper.uploadingImage, str)) {
                return s12.R2.r;
            }
            return 1.0f;
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
            return 1.0f;
        }
    }

    public final boolean Q() {
        if (this.V0 != null) {
            return false;
        }
        org.telegram.ui.ActionBar.g6 g6Var = this.g1;
        return g6Var != null ? g6Var.g() : org.telegram.ui.ActionBar.l6.d1();
    }

    public final boolean R() {
        bi.m7 m7Var = this.H0;
        return (m7Var == null || m7Var.Q == null) ? false : true;
    }

    public final boolean S() {
        TLRPC.Message message;
        ij ijVar = this.P0;
        return (ijVar == null || (message = ijVar.k) == null || !(message.action instanceof TLRPC.TL_messageActionGramTransfer)) ? false : true;
    }

    public final void T() {
        q0 q0Var = this.f1;
        if (q0Var != null && q0Var.g()) {
            super.invalidate();
        } else if (getParent() instanceof View) {
            ((View) getParent()).invalidate();
        }
    }

    public final boolean U(ij ijVar) {
        if (ijVar == null) {
            return false;
        }
        int i7 = ijVar.D;
        return i7 == 30 || i7 == 18 || i7 == 25 || W();
    }

    public final boolean V() {
        TLRPC.Message message;
        ij ijVar = this.P0;
        return (ijVar == null || (message = ijVar.k) == null || !(message.action instanceof TLRPC.TL_messageActionSuggestedPostApproval)) ? false : true;
    }

    public final boolean W() {
        ij ijVar;
        int i7;
        if (R() || this.O0 != null || (i7 = (ijVar = this.P0).D) == 31 || i7 == 37 || i7 == 33 || i7 == 35 || i7 == 34 || i7 == 21 || i7 == 22 || ijVar.z4()) {
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

    public final boolean X() {
        ij ijVar = this.P0;
        if (ijVar == null) {
            return false;
        }
        TLRPC.Message message = ijVar.k;
        TLRPC.MessageAction messageAction = message.action;
        if (((messageAction instanceof TLRPC.TL_messageActionGiftCode) || (messageAction instanceof TLRPC.TL_messageActionGiftStars)) && (message.from_id instanceof TLRPC.TL_peerUser)) {
            return t10.B(qp.s1(this.H).a2(Long.valueOf(this.P0.k.from_id.user_id)));
        }
        return false;
    }

    public final void a0(CharacterStyle characterStyle) {
        if (this.f1 == null || !(characterStyle instanceof URLSpan)) {
            return;
        }
        String url = ((URLSpan) characterStyle).getURL();
        if (url.startsWith("task")) {
            this.f1.m(this, this.P0.N1(), Integer.parseInt(url.substring(5)));
            return;
        }
        if (url.startsWith("topic")) {
            URLSpan uRLSpan = this.y;
            if (uRLSpan instanceof c41) {
                TLObject tLObject = ((c41) uRLSpan).c;
                if (tLObject instanceof TLRPC.TL_forumTopic) {
                    qg.d.m(this.f1.t(), -this.f1.a(), (TLRPC.TL_forumTopic) tLObject, 0);
                    return;
                }
                return;
            }
        }
        if (url.startsWith("invite")) {
            URLSpan uRLSpan2 = this.y;
            if (uRLSpan2 instanceof c41) {
                TLObject tLObject2 = ((c41) uRLSpan2).c;
                if (tLObject2 instanceof TLRPC.TL_chatInviteExported) {
                    this.f1.w((TLRPC.TL_chatInviteExported) tLObject2);
                    return;
                }
                return;
            }
        }
        if (url.startsWith("game")) {
            this.f1.i(this, this.P0.N1());
        } else if (url.startsWith("http")) {
            vf.c.t(getContext(), url);
        } else {
            this.f1.E(Long.parseLong(url));
        }
    }

    @Override // org.telegram.ui.Cells.p4
    public final /* synthetic */ boolean b() {
        return false;
    }

    public final void b0() {
        TLRPC.TL_premiumGiftOption tL_premiumGiftOption = new TLRPC.TL_premiumGiftOption();
        ij ijVar = this.P0;
        TLRPC.MessageAction messageAction = ijVar.k.action;
        tL_premiumGiftOption.amount = messageAction.amount;
        tL_premiumGiftOption.months = messageAction.months;
        tL_premiumGiftOption.currency = messageAction.currency;
        String str = null;
        if (ijVar != null && (messageAction instanceof TLRPC.TL_messageActionGiftCode) && !X()) {
            str = ((TLRPC.TL_messageActionGiftCode) this.P0.k.action).slug;
        }
        if (this.f1 != null) {
            org.telegram.messenger.g0.h3(new l2.z0(this, tL_premiumGiftOption, str, 23));
        }
    }

    public final void c0() {
        TLRPC.Message message;
        ij ijVar = this.P0;
        if (ijVar == null || (message = ijVar.k) == null) {
            return;
        }
        TLRPC.MessageAction messageAction = message.action;
        boolean z9 = messageAction instanceof TLRPC.TL_messageActionGiftStars;
        di.o7 o7Var = this.d0;
        if (z9) {
            Context context = getContext();
            TLRPC.Message message2 = this.P0.k;
            int i7 = message2.date;
            TLRPC.Peer peer = message2.from_id;
            TLRPC.Peer peer2 = message2.peer_id;
            TLRPC.TL_messageActionGiftStars tL_messageActionGiftStars = (TLRPC.TL_messageActionGiftStars) message2.action;
            org.telegram.ui.ActionBar.g6 g6Var = o7Var.J;
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
            dd.k1(context, false, 0L, this.H, starsTransaction, g6Var);
            return;
        }
        if (messageAction instanceof TLRPC.TL_messageActionPrizeStars) {
            Context context2 = getContext();
            TLRPC.Message message3 = this.P0.k;
            int i10 = message3.date;
            TLRPC.Peer peer3 = message3.from_id;
            TLRPC.Peer peer4 = message3.peer_id;
            TLRPC.TL_messageActionPrizeStars tL_messageActionPrizeStars = (TLRPC.TL_messageActionPrizeStars) message3.action;
            org.telegram.ui.ActionBar.g6 g6Var2 = o7Var.J;
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
            dd.k1(context2, false, 0L, this.H, starsTransaction2, g6Var2);
            return;
        }
        if (messageAction instanceof TLRPC.TL_messageActionGiftTon) {
            Context context3 = getContext();
            TLRPC.Message message4 = this.P0.k;
            int i11 = message4.date;
            TLRPC.Peer peer5 = message4.from_id;
            TLRPC.Peer peer6 = message4.peer_id;
            TLRPC.TL_messageActionGiftTon tL_messageActionGiftTon = (TLRPC.TL_messageActionGiftTon) message4.action;
            org.telegram.ui.ActionBar.g6 g6Var3 = o7Var.J;
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
            dd.k1(context3, false, 0L, this.H, starsTransaction3, g6Var3);
            return;
        }
        if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
            if (((TLRPC.TL_messageActionStarGift) messageAction).forceIn) {
                return;
            }
            bi.k7 k7Var = new bi.k7(getContext(), this.H, ij.B0(this.P0.k), this.g1, null);
            k7Var.h2(this.P0, null);
            k7Var.show();
            return;
        }
        if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
            if (!((TLRPC.TL_messageActionStarGiftUnique) messageAction).gift.burned) {
                bi.k7 k7Var2 = new bi.k7(getContext(), this.H, ij.B0(this.P0.k), this.g1, null);
                k7Var2.h2(this.P0, null);
                k7Var2.show();
                return;
            } else {
                org.telegram.ui.ActionBar.f2 T = LaunchActivity.T();
                if (T == null) {
                    return;
                }
                org.telegram.messenger.k5.o(null, 2131743880, org.telegram.ui.Components.hc.a0(T), R.raw.fire_on, 36);
                return;
            }
        }
        if (messageAction instanceof TLRPC.TL_messageActionSetChatTheme) {
            TLRPC.ChatTheme chatTheme = ((TLRPC.TL_messageActionSetChatTheme) messageAction).theme;
            if (chatTheme instanceof TLRPC.TL_chatThemeUniqueGift) {
                TL_stars.StarGift starGift = ((TLRPC.TL_chatThemeUniqueGift) chatTheme).gift;
                if (starGift instanceof TL_stars.TL_starGiftUnique) {
                    bi.k7 k7Var3 = new bi.k7(getContext(), this.H, ij.B0(this.P0.k), this.g1, null);
                    k7Var3.g2(starGift.slug, (TL_stars.TL_starGiftUnique) starGift, null);
                    k7Var3.show();
                }
            }
        }
    }

    public final boolean d0(float f10, float f11, xf xfVar) {
        if (S() && !this.P0.P3() && !this.P0.k.premiumEffectWasPlayed) {
            float y10 = getY() + getPaddingTop() + getWalletActionTop();
            if (y10 >= f10 && y10 + org.telegram.messenger.g0.L(140.0f) <= f11) {
                org.telegram.ui.Wallet.b4 b4Var = this.I0;
                ah0 ah0Var = b4Var.l;
                if (b4Var.i0 && b4Var.j0 == null) {
                    b4Var.i0 = false;
                    b4Var.k0 = xfVar;
                    b4Var.K.e(true, 0.0f);
                    b4Var.M = false;
                    b4Var.N = 0L;
                    b4Var.b();
                    b4Var.g();
                    b4Var.t = 18.0f;
                    b4Var.u.f();
                    ah0Var.T(true, 0.0f);
                    ah0Var.start();
                    b4Var.H = true;
                    float f12 = b4Var.R;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    b4Var.j0 = ofFloat;
                    ofFloat.setDuration(2400L);
                    b4Var.j0.setInterpolator(xq.h);
                    int i7 = 5;
                    b4Var.j0.addUpdateListener(new sf(b4Var, f12, i7));
                    b4Var.j0.addListener(new t81(b4Var, i7));
                    b4Var.j0.start();
                    b4Var.a.invalidate();
                    this.P0.k.premiumEffectWasPlayed = true;
                    yr.a0(this.H).X1(ij.B0(this.P0.k), this.P0.k);
                    return true;
                }
            }
        }
        return false;
    }

    @Override // org.telegram.messenger.ls
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        ij ijVar;
        if (i7 == qs.m1) {
            setSpoilersSuppressed(false);
            return;
        }
        if (i7 == qs.i4) {
            invalidate();
            return;
        }
        if (i7 == qs.l1) {
            setSpoilersSuppressed(true);
            return;
        }
        if (i7 == qs.W2 || i7 == qs.F3 || i7 == qs.X2) {
            ij ijVar2 = this.P0;
            if (ijVar2 != null) {
                g0(ijVar2, true);
                return;
            }
            return;
        }
        if (i7 == qs.y0) {
            if (!Objects.equals(objArr[0], p10.i(this.H).b0) || (ijVar = this.P0) == null) {
                return;
            }
            g0(ijVar, true);
            return;
        }
        if (i7 == qs.a4 && S()) {
            this.m2 = null;
            this.V = 0;
            requestLayout();
            invalidate();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (view != this.T1) {
            return super.drawChild(canvas, view, j3);
        }
        float a10 = this.n.a(0.02f);
        canvas.save();
        canvas.scale(a10, a10, (view.getMeasuredWidth() / 2.0f) + view.getX(), (view.getMeasuredHeight() / 2.0f) + view.getY());
        boolean drawChild = super.drawChild(canvas, view, j3);
        canvas.restore();
        return drawChild;
    }

    @Override // org.telegram.ui.Cells.p4
    public final void e(TLRPC.ReactionCount reactionCount, boolean z9, float f10, float f11) {
        q0 q0Var = this.f1;
        if (q0Var != null) {
            q0Var.t0(this, reactionCount, z9, f10, f11);
        }
    }

    public final void e0(int i7, boolean z9, boolean z10) {
        int i10 = this.Q0;
        if (i10 == i7 || i10 / 3600 == i7 / 3600) {
            return;
        }
        String M0 = z9 ? i7 == 2147483646 ? id.M0(2131748492, "MessageScheduledUntilOnline") : id.a0("MessageScheduledOn", null, 2131748528, id.u(i7, false)) : id.u(i7, false);
        this.Q0 = i7;
        CharSequence charSequence = this.R0;
        if (charSequence == null || !TextUtils.equals(M0, charSequence)) {
            this.R0 = M0;
            this.m2 = null;
            j0(z10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0bdd  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0c45  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0c4e  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0c34  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x045a  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0524  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x052e  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0490  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x0735  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x074e  */
    /* JADX WARN: Removed duplicated region for block: B:452:0x09a8  */
    /* JADX WARN: Removed duplicated region for block: B:479:0x09ec A[EDGE_INSN: B:479:0x09ec->B:475:0x09ec BREAK  A[LOOP:6: B:450:0x09a0->B:477:0x09e9], SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r5v8, types: [org.telegram.tgnet.TLRPC$messages_StickerSet] */
    /* JADX WARN: Type inference failed for: r5v86 */
    /* JADX WARN: Type inference failed for: r5v87 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g0(ij ijVar, boolean z9) {
        StaticLayout staticLayout;
        TLRPC.TL_messageReactions tL_messageReactions;
        int i7;
        int i10;
        org.telegram.ui.ActionBar.g6 g6Var;
        int i11;
        int i12;
        org.telegram.ui.ActionBar.g6 g6Var2;
        String str;
        ij ijVar2;
        TLRPC.Document document;
        String str2;
        TLRPC.Document document2;
        String str3;
        ArrayList<TLRPC.TL_stickerPack> arrayList;
        ij ijVar3;
        int i13;
        TLRPC.Document document3;
        TLRPC.Document document4;
        TLRPC.Document document5;
        int i14;
        int i15;
        int i16;
        ImageReceiver imageReceiver;
        TLRPC.PhotoSize photoSize;
        ImageReceiver imageReceiver2;
        TLRPC.VideoSize videoSize;
        ImageReceiver imageReceiver3;
        hc hcVar;
        TLRPC.PhotoSize photoSize2;
        ImageReceiver imageReceiver4;
        boolean z10;
        float f10;
        RadialProgress2 radialProgress2;
        TLRPC.WallPaper wallPaper;
        TLRPC.MessageAction messageAction;
        String str4;
        h01 h01Var;
        int i17;
        int paddingTop;
        int i18;
        TLRPC.Message message;
        String m10;
        String str5;
        ActivityManager activityManager;
        ij ijVar4 = ijVar;
        if (ijVar4 == null) {
            return;
        }
        if (this.P0 != ijVar4 && this.M0 != 0.0f) {
            setWalletSlidingOffset(0.0f);
        }
        TLRPC.Message message2 = ijVar4.k;
        if ((message2 == null || !(message2.action instanceof TLRPC.TL_messageActionGramTransfer) || this.a2 == message2.send_state) && this.P0 == ijVar4 && (((staticLayout = this.M) == null || TextUtils.equals(staticLayout.getText(), ijVar4.v)) && !((!this.D0 && ijVar4.C != null) || z9 || ijVar4.D == 21 || ijVar4.K1))) {
            return;
        }
        boolean z11 = org.telegram.messenger.r2.a;
        ArrayList arrayList2 = this.X1;
        arrayList2.clear();
        this.Y1 = null;
        this.m2 = null;
        ij ijVar5 = this.P0;
        int i19 = 1;
        boolean z12 = ijVar5 == null || ijVar5.k1 != ijVar4.k1;
        if (ijVar5 != null) {
            ijVar4.m1 = ijVar5.m1;
        }
        if (!z12 && ijVar5 != null && S()) {
            ijVar4.k.premiumEffectWasPlayed |= this.P0.k.premiumEffectWasPlayed;
        }
        this.P0 = ijVar4;
        boolean S = S();
        org.telegram.ui.ActionBar.g6 g6Var3 = this.g1;
        if (S && this.I0 == null) {
            org.telegram.ui.Wallet.b4 b4Var = new org.telegram.ui.Wallet.b4(this, g6Var3);
            this.I0 = b4Var;
            b4Var.s0 = new m0(this, i19);
            b4Var.n(this.J0);
        }
        org.telegram.ui.Wallet.b4 b4Var2 = this.I0;
        if (b4Var2 != null) {
            boolean S2 = S();
            t0 t0Var = b4Var2.a;
            b4Var2.n = S2;
            if (S2 && b4Var2.m == null && !b4Var2.o && com.google.android.recaptcha.internal.a.u(t0Var) && iz.o() != 0 && (activityManager = (ActivityManager) t0Var.getContext().getSystemService("activity")) != null && activityManager.getDeviceConfigurationInfo().reqGlEsVersion >= 196608) {
                org.telegram.ui.Wallet.a4 a4Var = new org.telegram.ui.Wallet.a4(b4Var2, t0Var.getContext(), new org.telegram.ui.Wallet.x3(b4Var2, 1));
                b4Var2.m = a4Var;
                t0Var.addView(a4Var, new ViewGroup.LayoutParams(org.telegram.messenger.g0.L(42.0f), org.telegram.messenger.g0.L(42.0f)));
            }
            org.telegram.ui.Wallet.a4 a4Var2 = b4Var2.m;
            if (a4Var2 != null) {
                a4Var2.setVisibility((!S2 || b4Var2.o) ? 8 : 0);
                b4Var2.m.setPaused(!S2 || b4Var2.o);
            }
            if (!S2) {
                b4Var2.f();
                b4Var2.k();
            }
        }
        TLRPC.Message message3 = ijVar4.k;
        int i20 = this.H;
        if (message3 != null && (message3.action instanceof TLRPC.TL_messageActionGramTransfer)) {
            qp s12 = qp.s1(i20);
            long o4 = org.telegram.messenger.m5.o(ijVar4.k.peer_id);
            if (t10.A(o4)) {
                m10 = id.M0(2131742971, null);
            } else if (ijVar4.k.peer_id == null) {
                str5 = null;
                org.telegram.ui.Wallet.b4 b4Var3 = this.I0;
                boolean P3 = ijVar4.P3();
                TLRPC.Message message4 = ijVar4.k;
                b4Var3.m(P3, (TLRPC.TL_messageActionGramTransfer) message4.action, str5, message4.send_state, z12, !message4.premiumEffectWasPlayed);
                this.a2 = ijVar4.k.send_state;
            } else {
                m10 = org.telegram.messenger.m5.m(s12.e2(o4));
            }
            str5 = m10;
            org.telegram.ui.Wallet.b4 b4Var32 = this.I0;
            boolean P32 = ijVar4.P3();
            TLRPC.Message message42 = ijVar4.k;
            b4Var32.m(P32, (TLRPC.TL_messageActionGramTransfer) message42.action, str5, message42.send_state, z12, !message42.premiumEffectWasPlayed);
            this.a2 = ijVar4.k.send_state;
        }
        ijVar4.K1 = false;
        this.D0 = ijVar4.C != null;
        org.telegram.messenger.z5.q(i20).v(this);
        this.V = 0;
        this.G = false;
        r0 r0Var = this.s1;
        if (r0Var != null && z12) {
            org.telegram.ui.Components.r5.release((t0) r0Var.i, (org.telegram.ui.Components.n5) r0Var.h);
            this.s1 = null;
            this.n1 = false;
        }
        if (z12 || ijVar4.H) {
            ijVar4.H = false;
            TLRPC.Message message5 = ijVar4.k;
            boolean z13 = (message5 == null || (tL_messageReactions = message5.reactions) == null || !tL_messageReactions.reactions_as_tags) ? false : true;
            boolean O5 = ijVar4.O5();
            ch.p0 p0Var = this.E0;
            if (O5) {
                p0Var.r(ijVar4, z13, g6Var3);
            } else {
                p0Var.r(null, false, g6Var3);
            }
        }
        if (ijVar4.D == 32) {
            if (this.O0 == null) {
                kw0 kw0Var = new kw0(i20, this, g6Var3);
                this.O0 = kw0Var;
                if (this.d2) {
                    kw0Var.d.R(kw0Var.b);
                }
            }
            kw0 kw0Var2 = this.O0;
            kw0Var2.getClass();
            TLRPC.TL_messageActionSuggestBirthday tL_messageActionSuggestBirthday = (TLRPC.TL_messageActionSuggestBirthday) ijVar4.k.action;
            kw0Var2.e = tL_messageActionSuggestBirthday.birthday;
            i7 = 0;
            ny0 ny0Var = new ny0(TextUtils.concat(ijVar4.v, ":"), 13.0f, null);
            ny0Var.m(6);
            Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
            ny0Var.a();
            ny0Var.p(org.telegram.messenger.g0.L(174.0f) - org.telegram.messenger.g0.L(32.0f));
            kw0Var2.f = ny0Var;
            int i21 = (tL_messageActionSuggestBirthday.birthday.flags & 1) != 0 ? 3 : 2;
            ny0[] ny0VarArr = new ny0[i21];
            kw0Var2.g = ny0VarArr;
            kw0Var2.h = new ny0[i21];
            ny0VarArr[0] = new ny0(id.M0(2131751674, null), 11.0f, null);
            i10 = 2;
            kw0Var2.h[0] = new ny0("" + tL_messageActionSuggestBirthday.birthday.day, 11.0f, org.telegram.messenger.g0.o());
            kw0Var2.g[1] = new ny0(id.M0(2131751673, null), 11.0f, null);
            ny0[] ny0VarArr2 = kw0Var2.h;
            StringBuilder sb2 = new StringBuilder("");
            int i22 = tL_messageActionSuggestBirthday.birthday.month - 1;
            sb2.append((i22 < 0 || i22 >= 12) ? jg.g.j(i22, "") : id.M0(new int[]{2131749086, 2131750829, 2131748683, 2131754173, 2131748662, 2131749064, 2131749066, 2131753895, 2131745565, 2131747830, 2131747835, 2131751605}[i22], null));
            ny0VarArr2[1] = new ny0(sb2.toString(), 11.0f, org.telegram.messenger.g0.o());
            if ((tL_messageActionSuggestBirthday.birthday.flags & 1) != 0) {
                kw0Var2.g[2] = new ny0(id.M0(2131751669, null), 11.0f, null);
                kw0Var2.h[2] = new ny0("" + tL_messageActionSuggestBirthday.birthday.year, 11.0f, org.telegram.messenger.g0.o());
            }
            kw0Var2.i = !ijVar4.P3();
            org.telegram.ui.ActionBar.g6 g6Var4 = kw0Var2.c;
            kw0Var2.l.setColor(org.telegram.ui.ActionBar.l6.r1(0.12f, g6Var4 != null ? g6Var4.a() : org.telegram.ui.ActionBar.l6.I.q() ? -1 : -16777216));
            kw0Var2.j = new ny0(id.M0(2131744395, null), 14.0f, org.telegram.messenger.g0.o());
        } else {
            i7 = 0;
            i10 = 2;
            kw0 kw0Var3 = this.O0;
            if (kw0Var3 != null) {
                kw0Var3.d.R(null);
                this.O0 = null;
            }
        }
        if (this.H0 == null && (message = ijVar4.k) != null && (message.action instanceof TLRPC.TL_messageActionStarGiftUnique)) {
            bi.m7 m7Var = new bi.m7(i20, this, g6Var3);
            this.H0 = m7Var;
            if (this.d2) {
                m7Var.a();
            }
        }
        bi.m7 m7Var2 = this.H0;
        if (m7Var2 != null) {
            m7Var2.f(ijVar4, !z12);
        }
        ImageReceiver imageReceiver5 = this.I;
        imageReceiver5.X(i7);
        imageReceiver5.e();
        if (ijVar4.D != 22) {
            this.J = null;
        }
        if (ijVar4.H0 != -1) {
            c8.ka.b(this, 0.02f, 1.2f);
            this.f2 = Math.max(org.telegram.messenger.g0.L(250.0f), fi.m3.a(ijVar4.v, (TextPaint) N("paintChatActionText")));
            xw0 X0 = mb.X0(ijVar4.v);
            if (X0 != null) {
                X0.h = this;
            }
        } else {
            setStateListAnimator(null);
            this.f2 = 0;
        }
        boolean z42 = ijVar4.z4();
        org.telegram.ui.Components.w8 w8Var = this.L;
        if (z42) {
            TLRPC.User a22 = qp.s1(i20).a2(Long.valueOf(ijVar4.k.media.user_id));
            w8Var.r(a22);
            TL_stories.StoryItem storyItem = ijVar4.k.media.storyItem;
            if (storyItem == null || !storyItem.noforwards) {
                di.s7.x(imageReceiver5, storyItem);
            } else {
                imageReceiver5.j0(a22, w8Var, null, true, 0, true);
            }
            imageReceiver5.J0((int) (this.h1 / 2.0f));
        } else {
            int i23 = ijVar4.D;
            RadialProgress2 radialProgress22 = this.J1;
            if (i23 != 22) {
                if (i23 == 21) {
                    imageReceiver5.J0((int) (this.h1 / 2.0f));
                    imageReceiver5.u0 = true;
                    imageReceiver5.g1 = null;
                    TLRPC.TL_messageActionSuggestProfilePhoto tL_messageActionSuggestProfilePhoto = (TLRPC.TL_messageActionSuggestProfilePhoto) ijVar4.k.action;
                    TLRPC.VideoSize x10 = org.telegram.messenger.w7.x(1000, tL_messageActionSuggestProfilePhoto.photo.video_sizes);
                    ArrayList<TLRPC.VideoSize> arrayList3 = tL_messageActionSuggestProfilePhoto.photo.video_sizes;
                    if (arrayList3 == null || arrayList3.isEmpty()) {
                        imageReceiver3 = imageReceiver5;
                        hcVar = null;
                    } else {
                        hcVar = hc.j(x10, tL_messageActionSuggestProfilePhoto.photo);
                        imageReceiver3 = imageReceiver5;
                    }
                    TLRPC.Photo photo = ijVar4.k.action.photo;
                    if (ijVar4.G1 == null) {
                        int size = ijVar4.n0.size();
                        for (int i24 = 0; i24 < size; i24++) {
                            photoSize2 = (TLRPC.PhotoSize) ijVar4.n0.get(i24);
                            if (photoSize2 instanceof TLRPC.TL_photoStrippedSize) {
                                break;
                            }
                        }
                    }
                    photoSize2 = null;
                    TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(ijVar4.n0, 1000, false, null, false);
                    if (w10 == null) {
                        imageReceiver4 = imageReceiver3;
                        g6Var = g6Var3;
                        i11 = i20;
                        z10 = false;
                        f10 = 1.0f;
                        radialProgress2 = radialProgress22;
                    } else if (x10 != null) {
                        i11 = i20;
                        z10 = false;
                        g6Var = g6Var3;
                        f10 = 1.0f;
                        radialProgress2 = radialProgress22;
                        imageReceiver3.u0(hcVar, "g", hc.i(w10, photo), "150_150", hc.f(photoSize2, ijVar4.l0), "50_50_b", ijVar4.G1, 0L, null, ijVar, 0);
                        imageReceiver4 = imageReceiver3;
                        ijVar4 = ijVar;
                    } else {
                        g6Var = g6Var3;
                        i11 = i20;
                        z10 = false;
                        f10 = 1.0f;
                        radialProgress2 = radialProgress22;
                        imageReceiver3.r0(hc.i(w10, photo), "150_150", hc.f(photoSize2, ijVar4.l0), "50_50_b", ijVar4.G1, 0L, null, ijVar4, 0);
                        imageReceiver4 = imageReceiver3;
                    }
                    imageReceiver4.u0 = z10;
                    k30 k30Var = (k30) qp.s1(i11).B7.get(ijVar4.k.local_id);
                    if (k30Var == null || k30Var.W == f10) {
                        boolean z14 = !z12;
                        radialProgress2.p(z14, f10);
                        radialProgress2.setIcon(4, z14, z14);
                    } else {
                        boolean z15 = !z12;
                        radialProgress2.setIcon(3, z15, z15);
                    }
                } else {
                    g6Var = g6Var3;
                    i11 = i20;
                    int i25 = 0;
                    if (i23 == 31 || i23 == 33 || i23 == 30 || i23 == 18 || i23 == 25 || i23 == 35) {
                        String str6 = null;
                        imageReceiver5.J0(0);
                        TLRPC.MessageAction messageAction2 = ijVar4.k.action;
                        int i26 = 9;
                        if (messageAction2 instanceof TLRPC.TL_messageActionNoForwardsRequest) {
                            TLRPC.TL_messageActionNoForwardsRequest tL_messageActionNoForwardsRequest = (TLRPC.TL_messageActionNoForwardsRequest) messageAction2;
                            this.Z1 = tL_messageActionNoForwardsRequest.expired || ((long) ijVar4.k.date) + qp.s1(i11).x7.D.M1(TimeUnit.SECONDS) < ((long) ConnectionsManager.getInstance(i11).getCurrentTime());
                            if (ijVar4.N3() || tL_messageActionNoForwardsRequest.expired || this.Z1) {
                                i16 = 8;
                            } else {
                                ArrayList arrayList4 = new ArrayList();
                                org.telegram.messenger.o2 o2Var = new org.telegram.messenger.o2(7, 2131751414, R.drawable.filled_bot_decline_24);
                                i16 = 8;
                                org.telegram.messenger.o2 o2Var2 = new org.telegram.messenger.o2(8, 2131751415, R.drawable.filled_bot_approve_24);
                                org.telegram.messenger.m2[] m2VarArr = new org.telegram.messenger.m2[i10];
                                m2VarArr[0] = o2Var;
                                m2VarArr[1] = o2Var2;
                                arrayList4.add(m2VarArr);
                                this.Y1 = new f5.u((org.telegram.messenger.m2[][]) arrayList4.toArray(new org.telegram.messenger.m2[arrayList4.size()][]), i25, i26);
                            }
                            i12 = i16;
                            document = null;
                            ijVar2 = null;
                            ijVar3 = null;
                            g6Var2 = g6Var;
                        } else {
                            i12 = 8;
                            if (messageAction2 instanceof TLRPC.TL_messageActionStarGiftPurchaseOffer) {
                                TLRPC.TL_messageActionStarGiftPurchaseOffer tL_messageActionStarGiftPurchaseOffer = (TLRPC.TL_messageActionStarGiftPurchaseOffer) messageAction2;
                                TL_stars.StarGift starGift = tL_messageActionStarGiftPurchaseOffer.gift;
                                if (starGift != null) {
                                    document5 = cg.d.e(starGift);
                                    if (this.S0 == null) {
                                        g6Var2 = g6Var;
                                        this.S0 = new zh.v0(this, g6Var2, false);
                                    } else {
                                        g6Var2 = g6Var;
                                    }
                                    this.S0.d((TL_stars.starGiftAttributeBackdrop) bi.ea.l(starGift.attributes, TL_stars.starGiftAttributeBackdrop.class));
                                    this.S0.e((TL_stars.starGiftAttributePattern) bi.ea.l(starGift.attributes, TL_stars.starGiftAttributePattern.class));
                                } else {
                                    g6Var2 = g6Var;
                                    document5 = null;
                                }
                                this.Z1 = tL_messageActionStarGiftPurchaseOffer.expires_at < ConnectionsManager.getInstance(i11).getCurrentTime();
                                if (!ijVar4.N3() && !tL_messageActionStarGiftPurchaseOffer.accepted && !tL_messageActionStarGiftPurchaseOffer.declined && !this.Z1) {
                                    ArrayList arrayList5 = new ArrayList();
                                    arrayList5.add(new org.telegram.messenger.m2[]{new org.telegram.messenger.o2(5, 2131749731, R.drawable.filled_bot_decline_24), new org.telegram.messenger.o2(6, 2131749741, R.drawable.filled_bot_approve_24)});
                                    this.Y1 = new f5.u((org.telegram.messenger.m2[][]) arrayList5.toArray(new org.telegram.messenger.m2[arrayList5.size()][]), i25, i26);
                                }
                                document = document5;
                            } else {
                                g6Var2 = g6Var;
                                if (!(messageAction2 instanceof TLRPC.TL_messageActionSetChatTheme)) {
                                    if (messageAction2 instanceof TLRPC.TL_messageActionStarGift) {
                                        TL_stars.StarGift starGift2 = ((TLRPC.TL_messageActionStarGift) messageAction2).gift;
                                        if (starGift2 != null) {
                                            document = starGift2.sticker;
                                            ijVar3 = ijVar4;
                                            str6 = null;
                                            ijVar2 = null;
                                        }
                                        document = null;
                                        ijVar3 = ijVar4;
                                        str6 = null;
                                        ijVar2 = null;
                                    } else {
                                        if (messageAction2 instanceof TLRPC.TL_messageActionStarGiftUnique) {
                                            TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique = (TLRPC.TL_messageActionStarGiftUnique) messageAction2;
                                            if (tL_messageActionStarGiftUnique.refunded) {
                                                TL_stars.StarGift starGift3 = tL_messageActionStarGiftUnique.gift;
                                                if (starGift3 != null) {
                                                    document = starGift3.getDocument();
                                                    ijVar3 = ijVar4;
                                                    str6 = null;
                                                    ijVar2 = null;
                                                }
                                                document = null;
                                                ijVar3 = ijVar4;
                                                str6 = null;
                                                ijVar2 = null;
                                            }
                                        }
                                        if (messageAction2 instanceof TLRPC.TL_messageActionGiftTon) {
                                            str = p10.i(i11).c0;
                                            if (str == null) {
                                                ui.b0(i11).C();
                                                return;
                                            }
                                        } else {
                                            str = p10.i(i11).b0;
                                            if (str == null) {
                                                ui.b0(i11).z();
                                                return;
                                            }
                                        }
                                        TLRPC.TL_messages_stickerSet p02 = ui.b0(i11).p0(str);
                                        ?? r52 = p02;
                                        if (p02 == null) {
                                            r52 = ui.b0(i11).n0(str);
                                        }
                                        if (r52 != 0) {
                                            TLRPC.MessageAction messageAction3 = ijVar4.k.action;
                                            int i27 = messageAction3.months;
                                            if (ijVar4.D == 30) {
                                                String str7 = "3⃣";
                                                if (messageAction3 instanceof TLRPC.TL_messageActionGiftTon) {
                                                    long j3 = messageAction3.cryptoAmount;
                                                    if (j3 > 10000000000L) {
                                                        if (j3 <= 50000000000L) {
                                                            str7 = "1⃣";
                                                        }
                                                        i13 = 0;
                                                        while (true) {
                                                            if (i13 < r52.packs.size()) {
                                                                break;
                                                            }
                                                            TLRPC.TL_stickerPack tL_stickerPack = r52.packs.get(i13);
                                                            if (TextUtils.equals(tL_stickerPack.emoticon, str7) && !tL_stickerPack.documents.isEmpty()) {
                                                                long longValue = tL_stickerPack.documents.get(0).longValue();
                                                                for (int i28 = 0; i28 < r52.documents.size(); i28++) {
                                                                    document3 = r52.documents.get(i28);
                                                                    if (document3 != null && document3.id == longValue) {
                                                                        break;
                                                                    }
                                                                }
                                                            } else {
                                                                i13++;
                                                            }
                                                        }
                                                        document3 = null;
                                                        str2 = str;
                                                        document2 = document3;
                                                    }
                                                    str7 = "2⃣";
                                                    i13 = 0;
                                                    while (true) {
                                                        if (i13 < r52.packs.size()) {
                                                        }
                                                        i13++;
                                                    }
                                                    document3 = null;
                                                    str2 = str;
                                                    document2 = document3;
                                                } else {
                                                    long j10 = messageAction3 instanceof TLRPC.TL_messageActionGiftStars ? ((TLRPC.TL_messageActionGiftStars) messageAction3).stars : ((TLRPC.TL_messageActionPrizeStars) messageAction3).stars;
                                                    if (j10 > 1000) {
                                                        if (j10 >= 2500) {
                                                            str7 = "4⃣";
                                                        }
                                                        i13 = 0;
                                                        while (true) {
                                                            if (i13 < r52.packs.size()) {
                                                            }
                                                            i13++;
                                                        }
                                                        document3 = null;
                                                        str2 = str;
                                                        document2 = document3;
                                                    }
                                                    str7 = "2⃣";
                                                    i13 = 0;
                                                    while (true) {
                                                        if (i13 < r52.packs.size()) {
                                                        }
                                                        i13++;
                                                    }
                                                    document3 = null;
                                                    str2 = str;
                                                    document2 = document3;
                                                }
                                            } else {
                                                String str8 = (String) s2.get(Integer.valueOf(i27));
                                                ArrayList<TLRPC.TL_stickerPack> arrayList6 = r52.packs;
                                                int size2 = arrayList6.size();
                                                int i29 = 0;
                                                TLRPC.Document document6 = null;
                                                while (true) {
                                                    if (i29 >= size2) {
                                                        str2 = str;
                                                        break;
                                                    }
                                                    TLRPC.TL_stickerPack tL_stickerPack2 = arrayList6.get(i29);
                                                    i29++;
                                                    TLRPC.TL_stickerPack tL_stickerPack3 = tL_stickerPack2;
                                                    if (Objects.equals(tL_stickerPack3.emoticon, str8)) {
                                                        ArrayList<Long> arrayList7 = tL_stickerPack3.documents;
                                                        int size3 = arrayList7.size();
                                                        TLRPC.Document document7 = document6;
                                                        int i30 = i25;
                                                        while (true) {
                                                            if (i30 >= size3) {
                                                                str2 = str;
                                                                str3 = str8;
                                                                arrayList = arrayList6;
                                                                break;
                                                            }
                                                            Long l10 = arrayList7.get(i30);
                                                            i30++;
                                                            long longValue2 = l10.longValue();
                                                            ArrayList<TLRPC.Document> arrayList8 = r52.documents;
                                                            str2 = str;
                                                            int size4 = arrayList8.size();
                                                            str3 = str8;
                                                            int i31 = 0;
                                                            while (true) {
                                                                if (i31 >= size4) {
                                                                    arrayList = arrayList6;
                                                                    break;
                                                                }
                                                                TLRPC.Document document8 = arrayList8.get(i31);
                                                                int i32 = i31 + 1;
                                                                int i33 = size4;
                                                                TLRPC.Document document9 = document8;
                                                                arrayList = arrayList6;
                                                                if (document9.id == longValue2) {
                                                                    document7 = document9;
                                                                    break;
                                                                } else {
                                                                    arrayList6 = arrayList;
                                                                    size4 = i33;
                                                                    i31 = i32;
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
                                                    i25 = 0;
                                                }
                                                document2 = document6;
                                            }
                                            if (document2 == null && !r52.documents.isEmpty()) {
                                                document2 = r52.documents.get(0);
                                            }
                                            ijVar3 = r52;
                                            document = document2;
                                            str6 = str2;
                                            ijVar2 = ijVar3;
                                        } else {
                                            ijVar2 = r52;
                                            str6 = str;
                                            document = null;
                                            ijVar3 = null;
                                        }
                                    }
                                    if (!this.k0 && this.e0 && this.i0 && (this.f0 || this.g0 || this.h0)) {
                                        this.l0 = org.telegram.messenger.g0.L(33.0f);
                                        if (this.n0 == null) {
                                            h01 h01Var2 = new h01(i11, this, g6Var2, true);
                                            this.n0 = h01Var2;
                                            h01Var2.s = new m0(this, 3);
                                        }
                                        if (this.n0.e(this.P0)) {
                                            if (this.d2) {
                                                this.n0.a();
                                            }
                                            i17 = 0;
                                        } else {
                                            this.n0.b();
                                            this.n0 = null;
                                            i17 = 0;
                                            this.l0 = 0;
                                        }
                                    } else {
                                        h01Var = this.n0;
                                        if (h01Var != null) {
                                            h01Var.b();
                                            this.n0 = null;
                                        }
                                        i17 = 0;
                                        this.l0 = 0;
                                    }
                                    paddingTop = getPaddingTop();
                                    i18 = this.l0;
                                    if (paddingTop != i18) {
                                        setPadding(i17, i18, i17, i17);
                                    }
                                    this.T1.setVisibility((U(ijVar) || R()) ? i12 : i17);
                                    qg.d.b(ijVar4);
                                    requestLayout();
                                }
                                TL_stars.StarGift starGift4 = ((TLRPC.TL_chatThemeUniqueGift) ((TLRPC.TL_messageActionSetChatTheme) messageAction2).theme).gift;
                                if (starGift4 != null) {
                                    document4 = cg.d.e(starGift4);
                                    if (this.S0 == null) {
                                        this.S0 = new zh.v0(this, g6Var2, false);
                                    }
                                    this.S0.d((TL_stars.starGiftAttributeBackdrop) bi.ea.l(starGift4.attributes, TL_stars.starGiftAttributeBackdrop.class));
                                    this.S0.e((TL_stars.starGiftAttributePattern) bi.ea.l(starGift4.attributes, TL_stars.starGiftAttributePattern.class));
                                } else {
                                    document4 = null;
                                }
                                document = document4;
                            }
                            str6 = null;
                            ijVar2 = null;
                            ijVar3 = null;
                        }
                        f5.u uVar = this.Y1;
                        if (uVar != null) {
                            int length = ((org.telegram.messenger.m2[][]) uVar.c).length;
                            int i34 = 0;
                            while (i34 < length) {
                                int length2 = ((org.telegram.messenger.m2[][]) this.Y1.c)[i34].length;
                                int i35 = 0;
                                while (i35 < length2) {
                                    org.telegram.messenger.m2 m2Var = ((org.telegram.messenger.m2[][]) this.Y1.c)[i34][i35];
                                    c0 c0Var = new c0(new m0(this, 2));
                                    c0Var.j = (org.telegram.messenger.o2) m2Var;
                                    int c10 = m2Var.c();
                                    if (c10 != 0) {
                                        Drawable drawable = getResources().getDrawable(c10);
                                        c0Var.t = drawable;
                                        i14 = length;
                                        i15 = i34;
                                        drawable.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                                    } else {
                                        i14 = length;
                                        i15 = i34;
                                    }
                                    c0Var.f = org.telegram.messenger.g0.L(40.0f);
                                    int i36 = c0Var.g | 8;
                                    c0Var.g = i36;
                                    int b10 = zc.b(i36, 1, i35 == 0);
                                    c0Var.g = b10;
                                    c0Var.g = zc.b(b10, 2, i35 == 1);
                                    c0Var.h = new ny0(m2Var.d(), (TextPaint) N("paintChatBotButton"));
                                    arrayList2.add(c0Var);
                                    i35++;
                                    length = i14;
                                    i34 = i15;
                                }
                                i34++;
                                length = length;
                            }
                        }
                        this.L1 = ijVar4.l1;
                        this.H1 = document;
                        if (document != null) {
                            imageReceiver5.u0 = true;
                            int i37 = ijVar4.D;
                            if (i37 != 31 && i37 != 37 && i37 != 33) {
                                imageReceiver5.d0(this.N1);
                            }
                            this.I1 = null;
                            int i38 = 0;
                            while (true) {
                                if (i38 >= document.video_thumbs.size()) {
                                    break;
                                }
                                if ("f".equals(document.video_thumbs.get(i38).type)) {
                                    this.I1 = document.video_thumbs.get(i38);
                                    break;
                                }
                                i38++;
                            }
                            if (z12 || ijVar4.D != 18) {
                                rz e10 = org.telegram.messenger.t5.e(document, org.telegram.ui.ActionBar.l6.a7, 0.3f);
                                imageReceiver5.W(0);
                                hc b11 = hc.b(document);
                                Locale locale = Locale.US;
                                imageReceiver5.q0(b11, jg.g.j(ijVar4.k1, "160_160_nr_messageId="), e10, "tgs", ijVar3, 1);
                            }
                        } else if (str6 != null) {
                            ui.b0(i11).c1(str6, false, ijVar2 == null);
                        }
                        if (!this.k0) {
                        }
                        h01Var = this.n0;
                        if (h01Var != null) {
                        }
                        i17 = 0;
                        this.l0 = 0;
                        paddingTop = getPaddingTop();
                        i18 = this.l0;
                        if (paddingTop != i18) {
                        }
                        this.T1.setVisibility((U(ijVar) || R()) ? i12 : i17);
                        qg.d.b(ijVar4);
                        requestLayout();
                    }
                    if (i23 == 37) {
                        TLRPC.Chat M0 = qp.s1(i11).M0(Long.valueOf(((TLRPC.TL_messageActionChangeCommunity) ijVar4.k.action).community_id));
                        imageReceiver5.u0 = true;
                        imageReceiver5.g1 = null;
                        imageReceiver5.J0(org.telegram.messenger.g0.L(14.0f));
                        imageReceiver5.X(1);
                        w8Var.q(M0);
                        imageReceiver5.i0(M0, new di.j0(getContext(), org.telegram.messenger.g0.L(14.0f)), M0);
                    } else if (i23 == 11) {
                        imageReceiver5.u0 = true;
                        imageReceiver5.g1 = null;
                        imageReceiver5.J0(org.telegram.messenger.g0.u / 2);
                        imageReceiver5.X(1);
                        w8Var.k(ij.B0(ijVar4.k), null, null, null);
                        if (ijVar4.k.action instanceof TLRPC.TL_messageActionUserUpdatedPhoto) {
                            imageReceiver = imageReceiver5;
                            imageReceiver.q0(null, null, w8Var, null, ijVar4, 0);
                        } else {
                            imageReceiver = imageReceiver5;
                            if (ijVar4.G1 == null) {
                                int size5 = ijVar4.n0.size();
                                for (int i39 = 0; i39 < size5; i39++) {
                                    photoSize = (TLRPC.PhotoSize) ijVar4.n0.get(i39);
                                    if (photoSize instanceof TLRPC.TL_photoStrippedSize) {
                                        break;
                                    }
                                }
                            }
                            photoSize = null;
                            TLRPC.PhotoSize w11 = org.telegram.messenger.w7.w(ijVar4.n0, 640, false, null, false);
                            if (w11 != null) {
                                TLRPC.Photo photo2 = ijVar4.k.action.photo;
                                if (!photo2.video_sizes.isEmpty()) {
                                    int i40 = iz.a;
                                    if (sc.e(2048)) {
                                        videoSize = org.telegram.messenger.w7.x(1000, photo2.video_sizes);
                                        if (!ijVar4.x0 && !org.telegram.messenger.z5.q(i11).c(4, videoSize.size)) {
                                            this.x0 = hc.j(videoSize, photo2);
                                            org.telegram.messenger.z5.q(i11).a(org.telegram.messenger.w7.r(null, videoSize), ijVar4, this);
                                        }
                                        if (videoSize == null) {
                                            imageReceiver.r0(hc.j(videoSize, photo2), "g", hc.f(photoSize, ijVar4.l0), "50_50_b", ijVar4.G1, 0L, null, ijVar4, 1);
                                        } else {
                                            imageReceiver.r0(hc.f(w11, ijVar4.l0), "150_150", hc.f(photoSize, ijVar4.l0), "50_50_b", ijVar4.G1, 0L, null, ijVar4, 1);
                                        }
                                    }
                                }
                                videoSize = null;
                                if (videoSize == null) {
                                }
                            } else {
                                imageReceiver2 = imageReceiver;
                                imageReceiver2.w0(w8Var);
                                imageReceiver2.O0(!PhotoViewer.L1(ijVar4), false);
                            }
                        }
                        imageReceiver2 = imageReceiver;
                        imageReceiver2.O0(!PhotoViewer.L1(ijVar4), false);
                    } else {
                        imageReceiver5.u0 = true;
                        imageReceiver5.g1 = null;
                        imageReceiver5.v0(null);
                    }
                }
                g6Var2 = g6Var;
                i12 = 8;
                if (!this.k0) {
                }
                h01Var = this.n0;
                if (h01Var != null) {
                }
                i17 = 0;
                this.l0 = 0;
                paddingTop = getPaddingTop();
                i18 = this.l0;
                if (paddingTop != i18) {
                }
                this.T1.setVisibility((U(ijVar) || R()) ? i12 : i17);
                qg.d.b(ijVar4);
                requestLayout();
            }
            if (ijVar4.G1 == null) {
                int size6 = ijVar4.n0.size();
                for (int i41 = 0; i41 < size6 && !(((TLRPC.PhotoSize) ijVar4.n0.get(i41)) instanceof TLRPC.TL_photoStrippedSize); i41++) {
                }
            }
            TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent = ijVar4.J1;
            if (tL_channelAdminLogEvent != null) {
                TLRPC.ChannelAdminLogEventAction channelAdminLogEventAction = tL_channelAdminLogEvent.action;
                if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionChangeWallpaper) {
                    wallPaper = ((TLRPC.TL_channelAdminLogEventActionChangeWallpaper) channelAdminLogEventAction).new_value;
                    if (TextUtils.isEmpty(org.telegram.messenger.d4.j(wallPaper))) {
                        boolean a10 = g6Var3 != null ? g6Var3.a() : org.telegram.ui.ActionBar.l6.I.q();
                        imageReceiver5.f();
                        String j11 = org.telegram.messenger.d4.j(wallPaper);
                        int i42 = fi.y5.B0;
                        org.telegram.ui.ActionBar.r3 i43 = org.telegram.messenger.d4.f(i20).i(ig.b.d(j11));
                        Drawable s02 = i43 == null ? org.telegram.ui.ActionBar.l6.s0() : fi.y5.g(i20, i43, a10);
                        this.J = s02;
                        if (s02 != null) {
                            s02.setCallback(this);
                        }
                    } else if (wallPaper != null && (str4 = wallPaper.uploadingImage) != null) {
                        imageReceiver5.r0(hc.g(str4), "150_150_wallpaper" + wallPaper.id + fn.e(wallPaper.settings), null, null, fn.b(wallPaper), 0L, null, wallPaper, 1);
                        this.J = null;
                    } else if (wallPaper != null) {
                        TLObject tLObject = ijVar4.l0;
                        imageReceiver5.r0(hc.b(tLObject instanceof TLRPC.Document ? (TLRPC.Document) tLObject : wallPaper.document), "150_150_wallpaper" + wallPaper.id + fn.e(wallPaper.settings), null, null, fn.b(wallPaper), 0L, null, wallPaper, 1);
                        imageReceiver5 = imageReceiver5;
                        this.J = null;
                    } else {
                        imageReceiver5 = imageReceiver5;
                        this.J = null;
                    }
                    imageReceiver5.J0((int) (this.h1 / 2.0f));
                    if (P(ijVar) != 1.0f) {
                        boolean z16 = !z12;
                        radialProgress22.p(z16, 1.0f);
                        radialProgress22.setIcon(4, z16, z16);
                    } else {
                        boolean z17 = !z12;
                        radialProgress22.setIcon(3, z17, z17);
                    }
                }
            }
            TLRPC.Message message6 = ijVar4.k;
            wallPaper = (message6 == null || (messageAction = message6.action) == null) ? null : messageAction.wallpaper;
            if (TextUtils.isEmpty(org.telegram.messenger.d4.j(wallPaper))) {
            }
            imageReceiver5.J0((int) (this.h1 / 2.0f));
            if (P(ijVar) != 1.0f) {
            }
        }
        g6Var2 = g6Var3;
        i11 = i20;
        i12 = 8;
        if (!this.k0) {
        }
        h01Var = this.n0;
        if (h01Var != null) {
        }
        i17 = 0;
        this.l0 = 0;
        paddingTop = getPaddingTop();
        i18 = this.l0;
        if (paddingTop != i18) {
        }
        this.T1.setVisibility((U(ijVar) || R()) ? i12 : i17);
        qg.d.b(ijVar4);
        requestLayout();
    }

    public /* bridge */ /* synthetic */ ImageReceiver getAvatarImage() {
        return null;
    }

    @Override // org.telegram.ui.Cells.z
    public int getBoundsLeft() {
        if (R()) {
            int width = ((int) (getWidth() - (this.H0.T.f + org.telegram.messenger.g0.L(8.0f)))) / 2;
            return this.H0.p ? width : Math.min(this.a1, width);
        }
        if (U(this.P0)) {
            return jg.g.D(getWidth(), this.i1, 2, this.j0 / 2);
        }
        int i7 = this.a1;
        ImageReceiver imageReceiver = this.I;
        if (imageReceiver != null && imageReceiver.Q0) {
            i7 = Math.min((int) imageReceiver.K0, i7);
        }
        return (this.j0 / 2) + i7;
    }

    @Override // org.telegram.ui.Cells.z
    public int getBoundsRight() {
        int i7;
        int i10;
        if (R()) {
            int L = ((int) ((this.H0.T.f + org.telegram.messenger.g0.L(8.0f)) + getWidth())) / 2;
            return this.H0.p ? L : Math.max(this.b1, L);
        }
        if (U(this.P0)) {
            i7 = this.j0 / 2;
            i10 = (getWidth() + this.i1) / 2;
        } else {
            i7 = this.b1;
            ImageReceiver imageReceiver = this.I;
            if (imageReceiver != null && imageReceiver.Q0) {
                i7 = Math.max((int) imageReceiver.y(), i7);
            }
            i10 = this.j0 / 2;
        }
        return i10 + i7;
    }

    @Override // org.telegram.ui.Cells.p4
    public /* bridge */ /* synthetic */ float getCheckBoxTranslation() {
        return 0.0f;
    }

    public /* bridge */ /* synthetic */ aj getCurrentPosition() {
        return null;
    }

    public int getCustomDate() {
        return this.Q0;
    }

    public q0 getDelegate() {
        return this.f1;
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
    public ij getMessageObject() {
        return this.P0;
    }

    @Override // org.telegram.messenger.x5
    public int getObserverTag() {
        return this.x;
    }

    public ImageReceiver getPhotoImage() {
        return this.I;
    }

    public ch.p0 getReactionsLayout() {
        return this.E0;
    }

    @Override // org.telegram.ui.Cells.p4
    public /* bridge */ /* synthetic */ float getSlidingOffsetX() {
        return 0.0f;
    }

    public s0 getTransitionParams() {
        return this.r2;
    }

    public float getWalletSlidingOffset() {
        return this.M0;
    }

    public final void h0(int i7, int i10) {
        this.T0 = i7;
        this.U0 = i10;
    }

    public final void i0(float f10, int i7) {
        this.w0 = true;
        this.v0 = i7;
        this.t0 = f10;
        this.u0 = 0.0f;
    }

    @Override // org.telegram.ui.Cells.z, android.view.View, org.telegram.ui.Cells.q9
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

    @Override // org.telegram.ui.Cells.p4
    public final /* synthetic */ boolean j() {
        return false;
    }

    public final void j0(boolean z9) {
        if (getMeasuredWidth() != 0) {
            B(getMeasuredWidth(), this.R0);
            invalidate();
        }
        if (this.C0) {
            v();
        } else if (z9) {
            org.telegram.messenger.g0.h3(new m0(this, 5));
        } else {
            requestLayout();
        }
    }

    @Override // org.telegram.ui.Cells.p4
    public final /* synthetic */ boolean l() {
        return false;
    }

    @Override // org.telegram.ui.Cells.p4
    public final /* synthetic */ boolean m() {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        q0 q0Var;
        super.onAttachedToWindow();
        this.d2 = true;
        this.I.P();
        setStarsPaused(false);
        this.r0 = org.telegram.ui.Components.r5.update(0, this, (!this.s || (q0Var = this.f1) == null || q0Var.g()) ? false : true, this.r0, this.M);
        r0 r0Var = this.s1;
        if (r0Var != null) {
            r0Var.h = org.telegram.ui.Components.r5.update(0, (View) r0Var.i, false, (org.telegram.ui.Components.n5) r0Var.h, (StaticLayout) r0Var.f);
        }
        int i7 = this.H;
        qs.f(i7).c(this, qs.W2);
        qs.f(i7).c(this, qs.X2);
        qs.f(i7).c(this, qs.F3);
        qs.f(i7).c(this, qs.y0);
        qs.f(i7).c(this, qs.a4);
        qs.e().c(this, qs.i4);
        ij ijVar = this.P0;
        if (ijVar != null && ijVar.D == 21) {
            g0(ijVar, true);
        }
        bi.m7 m7Var = this.H0;
        if (m7Var != null) {
            m7Var.a();
        }
        ch.p0 p0Var = this.E0;
        ArrayList arrayList = p0Var.s;
        p0Var.D = true;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            ((ch.m0) arrayList.get(i10)).a();
        }
        h01 h01Var = this.n0;
        if (h01Var != null) {
            h01Var.a();
        }
        kw0 kw0Var = this.O0;
        if (kw0Var != null) {
            kw0Var.d.R(kw0Var.b);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.d2 = false;
        int i7 = this.H;
        org.telegram.messenger.z5.q(i7).v(this);
        this.I.R();
        setStarsPaused(true);
        this.C0 = false;
        org.telegram.ui.Components.r5.release(this, this.r0);
        r0 r0Var = this.s1;
        if (r0Var != null) {
            org.telegram.ui.Components.r5.release((t0) r0Var.i, (org.telegram.ui.Components.n5) r0Var.h);
        }
        qs.f(i7).n(this, qs.W2);
        qs.f(i7).n(this, qs.X2);
        qs.f(i7).n(this, qs.F3);
        qs.f(i7).n(this, qs.y0);
        qs.f(i7).n(this, qs.a4);
        qs.e().n(this, qs.i4);
        this.d0.g();
        this.r2.a = false;
        bi.m7 m7Var = this.H0;
        if (m7Var != null) {
            m7Var.S = false;
            m7Var.d.R();
            m7Var.e.b();
            zh.i0 i0Var = m7Var.y;
            i0Var.d.R();
            org.telegram.ui.Components.r5.release((View) null, i0Var.q);
            i0Var.q = null;
        }
        this.E0.p();
        h01 h01Var = this.n0;
        if (h01Var != null) {
            h01Var.b();
        }
        kw0 kw0Var = this.O0;
        if (kw0Var != null) {
            kw0Var.d.R(null);
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
        int i7;
        int i10;
        TextPaint textPaint;
        ArrayList arrayList;
        int i11;
        RadialProgress2 radialProgress2;
        t0 t0Var;
        float f10;
        float L;
        int i12;
        Canvas canvas2;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        ny0 ny0Var;
        float i13;
        Paint N;
        boolean a10;
        ColorMatrix colorMatrix;
        int i14;
        float f16;
        t0 t0Var2;
        int i15;
        ny0 ny0Var2;
        q0 q0Var;
        int size;
        int i16;
        TextPaint textPaint2;
        Canvas canvas3 = canvas;
        canvas3.save();
        canvas3.translate(this.j0 / 2.0f, getPaddingTop());
        ij ijVar = this.P0;
        float d = this.q1.d(!this.o1);
        int i17 = this.h1;
        boolean R = R();
        di.o7 o7Var = this.d0;
        TextPaint textPaint3 = this.F1;
        ImageReceiver imageReceiver = this.I;
        if (!R && this.O0 == null && U(ijVar)) {
            this.h1 = this.i1 - org.telegram.messenger.g0.L(106.0f);
            if (W()) {
                i17 = L(ijVar);
                float f17 = (this.V - i17) / 2.0f;
                float L2 = org.telegram.messenger.g0.L(16.0f) + org.telegram.messenger.g0.L(4.0f) + this.S + this.O;
                if (ijVar.z4()) {
                    o7Var.d = ijVar.k.media.storyItem;
                }
                float f18 = i17;
                o7Var.F.set(f17, L2, f17 + f18, f18 + L2);
                int i18 = ijVar.D;
                if (i18 == 31 || i18 == 33 || i18 == 34 || i18 == 35) {
                    f17 += org.telegram.messenger.g0.L(10.0f);
                    L2 += org.telegram.messenger.g0.L(10.0f);
                    i17 -= org.telegram.messenger.g0.L(20.0f);
                }
                if (ijVar.D == 37) {
                    f17 += org.telegram.messenger.g0.L(2.0f);
                }
                imageReceiver.y0(f17, L2, Math.max(0, i17), Math.max(0, i17));
                int i19 = ijVar.D;
                if (i19 == 31 || i19 == 33 || i19 == 34 || i19 == 35) {
                    i17 = org.telegram.messenger.g0.L(20.0f) + i17;
                }
            } else {
                int i20 = ijVar.D;
                if (i20 == 11) {
                    int i21 = this.V;
                    float f19 = this.h1;
                    imageReceiver.y0((i21 - r3) / 2.0f, (this.i1 * 0.075f) + this.S + this.O, f19, f19);
                } else {
                    if (i20 == 25) {
                        i17 = (int) (this.h1 * (org.telegram.messenger.g0.Q1() ? 1.0f : 1.2f));
                        float f20 = i17;
                        imageReceiver.y0((this.V - i17) / 2.0f, ((this.i1 * 0.075f) + (this.S + this.O)) - org.telegram.messenger.g0.L(22.0f), f20, f20);
                    } else if (ijVar.s4()) {
                        float f21 = i17;
                        imageReceiver.y0((this.V - i17) / 2.0f, (this.i1 * 0.075f) + this.S + this.O + org.telegram.messenger.g0.L(2.0f), f21, f21);
                    } else if (ijVar.D == 30) {
                        i17 = (int) (this.h1 * 1.1f);
                        TLRPC.Message message = ijVar.k;
                        if (message == null || (message.action instanceof TLRPC.TL_messageActionStarGift)) {
                            float f22 = i17;
                            imageReceiver.y0((this.V - i17) / 2.0f, ((this.i1 * 0.075f) + (this.S + this.O)) - org.telegram.messenger.g0.L(12.0f), f22, f22);
                        } else {
                            float f23 = i17;
                            imageReceiver.y0((this.V - i17) / 2.0f, ((this.i1 * 0.075f) + (this.S + this.O)) - org.telegram.messenger.g0.L(22.0f), f23, f23);
                        }
                    } else {
                        i17 = (int) (this.h1 * 1.0f);
                        float f24 = i17;
                        imageReceiver.y0((this.V - i17) / 2.0f, ((this.i1 * 0.075f) + (this.S + this.O)) - org.telegram.messenger.g0.L(4.0f), f24, f24);
                    }
                    textPaint2 = (TextPaint) N("paintChatActionText");
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
            textPaint2 = (TextPaint) N("paintChatActionText");
            this.s0 = textPaint2;
            if (textPaint2 != null) {
            }
        }
        int i22 = i17;
        E(canvas3, false);
        if (S()) {
            canvas3.save();
            int width = getWidth();
            this.I0.getClass();
            float h = (width - org.telegram.ui.Wallet.b4.h()) / 2.0f;
            this.K0 = h;
            float walletActionTop = getWalletActionTop();
            this.L0 = walletActionTop;
            canvas3.translate(h, walletActionTop);
            this.I0.o((this.j0 / 2.0f) + this.K0, this.L0 + getPaddingTop());
            this.I0.d(canvas3);
            canvas3.restore();
        }
        boolean R2 = R();
        RadialProgress2 radialProgress22 = this.J1;
        if (R2) {
            canvas3.save();
            float width2 = (getWidth() - this.H0.d()) / 2.0f;
            this.F0 = width2;
            float L3 = this.H0.p ? org.telegram.messenger.g0.L(4.0f) : org.telegram.messenger.g0.L(16.0f) + this.S + this.O;
            this.G0 = L3;
            canvas3.translate(width2, L3);
            this.H0.b(canvas3);
            q0 q0Var2 = this.f1;
            if (q0Var2 == null || q0Var2.g()) {
                this.H0.c(canvas3);
            }
            canvas3.restore();
        } else if (this.O0 != null) {
            canvas3.save();
            this.O0.a(canvas3);
            canvas3.restore();
        } else if (U(ijVar) || (ijVar != null && ijVar.D == 11)) {
            zh.v0 v0Var = this.S0;
            if (v0Var != null && ((i10 = ijVar.D) == 31 || i10 == 37 || i10 == 33)) {
                v0Var.setBounds((int) (imageReceiver.x() - org.telegram.messenger.g0.L(13.33f)), (int) (imageReceiver.z() - org.telegram.messenger.g0.L(14.0f)), (int) (imageReceiver.w() + imageReceiver.x() + org.telegram.messenger.g0.L(13.33f)), (int) (imageReceiver.v() + imageReceiver.z() + org.telegram.messenger.g0.L(14.0f)));
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
            } else if (ijVar.z4()) {
                TLRPC.MessageMedia messageMedia = ijVar.k.media;
                long j3 = messageMedia.user_id;
                o7Var.c = messageMedia.id;
                di.s7.h(j3, canvas3, imageReceiver, o7Var);
            } else {
                imageReceiver.g(canvas3);
            }
            c10 = '%';
            if (ijVar.D == 37) {
                bg.s.a(canvas3, org.telegram.ui.ActionBar.l6.S0, imageReceiver.x() + org.telegram.messenger.g0.L(26.0f), imageReceiver.z() + org.telegram.messenger.g0.L(26.0f), org.telegram.messenger.g0.L(52.0f));
            }
            radialProgress22.a.set(imageReceiver.x(), imageReceiver.z(), imageReceiver.w() + imageReceiver.x(), imageReceiver.v() + imageReceiver.z());
            int i23 = ijVar.D;
            if (i23 == 21) {
                k30 k30Var = (k30) qp.s1(this.H).B7.get(ijVar.k.local_id);
                if (k30Var != null) {
                    radialProgress22.p(true, k30Var.W);
                    radialProgress22.setCircleRadius(((int) (imageReceiver.w() * 0.5f)) + 1);
                    radialProgress22.G = org.telegram.messenger.g0.L(24.0f);
                    radialProgress22.g(org.telegram.ui.ActionBar.l6.Ze, org.telegram.ui.ActionBar.l6.af, org.telegram.ui.ActionBar.l6.bf, org.telegram.ui.ActionBar.l6.cf);
                    if (k30Var.W == 1.0f) {
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
                    float P = P(ijVar);
                    radialProgress22.p(true, P);
                    radialProgress22.setCircleRadius(org.telegram.messenger.g0.L(26.0f));
                    radialProgress22.G = org.telegram.messenger.g0.L(24.0f);
                    radialProgress22.g(org.telegram.ui.ActionBar.l6.Ze, org.telegram.ui.ActionBar.l6.af, org.telegram.ui.ActionBar.l6.bf, org.telegram.ui.ActionBar.l6.cf);
                    if (P == 1.0f) {
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
                i11 = i7;
                radialProgress2 = radialProgress22;
            } else {
                canvas3.save();
                canvas3.translate(this.T, this.S);
                if (this.M.getPaint() != this.s0) {
                    v();
                }
                canvas3.save();
                xh.f.d(canvas3, arrayList);
                xh.f.f(canvas3, this.M);
                q0 q0Var3 = this.f1;
                if (q0Var3 == null || q0Var3.g()) {
                    int i24 = i7;
                    StaticLayout staticLayout = this.M;
                    radialProgress2 = radialProgress22;
                    i11 = i24;
                    org.telegram.ui.Components.r5.drawAnimatedEmojis(canvas, staticLayout, this.r0, 0.0f, arrayList, 0.0f, 0.0f, 0.0f, 1.0f, staticLayout == null ? null : K(staticLayout.getPaint().getColor()));
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
                    fVar.h(this.M.getPaint().getColor());
                    fVar.draw(canvas3);
                }
                canvas3.restore();
            }
            if (this.s0 != null && this.P != null) {
                canvas3.save();
                canvas3.translate(this.U, this.S - this.Q);
                if (this.P.getPaint() != this.s0) {
                    v();
                }
                canvas3.save();
                xh.f.d(canvas3, arrayList);
                xh.f.f(canvas3, this.P);
                q0Var = this.f1;
                if (q0Var != null || q0Var.g()) {
                    StaticLayout staticLayout2 = this.P;
                    org.telegram.ui.Components.n5 n5Var = this.r0;
                    StaticLayout staticLayout3 = this.M;
                    org.telegram.ui.Components.r5.drawAnimatedEmojis(canvas, staticLayout2, n5Var, 0.0f, arrayList, 0.0f, 0.0f, 0.0f, 1.0f, staticLayout3 != null ? null : K(staticLayout3.getPaint().getColor()));
                    canvas3 = canvas;
                }
                canvas3.restore();
                size = arrayList.size();
                i16 = 0;
                while (i16 < size) {
                    Object obj2 = arrayList.get(i16);
                    i16++;
                    xh.f fVar2 = (xh.f) obj2;
                    fVar2.h(this.P.getPaint().getColor());
                    fVar2.draw(canvas3);
                }
                canvas3.restore();
            }
            if (R() && U(ijVar)) {
                canvas3.save();
                float f25 = (this.V - this.i1) / 2.0f;
                if (ijVar.D != i11) {
                    f25 += org.telegram.messenger.g0.L(8.0f);
                }
                float f26 = f25;
                if (W()) {
                    RectF rectF = this.M1;
                    f10 = (rectF != null ? rectF.top : org.telegram.messenger.g0.L(4.0f) + this.S + this.O) + (i22 > 0 ? org.telegram.messenger.k5.D(16.0f, 2, i22) : org.telegram.messenger.g0.L(16.0f));
                } else {
                    float f27 = (this.i1 * 0.075f) + this.S + this.O;
                    if (ijVar.D != 21) {
                        i22 = this.h1;
                    }
                    float L4 = f27 + i22 + org.telegram.messenger.g0.L(4.0f);
                    if (ijVar.D == 21) {
                        L4 += org.telegram.messenger.g0.L(16.0f);
                    }
                    f10 = L4;
                    if (ijVar.s4()) {
                        f10 += org.telegram.messenger.g0.L(12.0f);
                    } else if (ijVar.D == 30 && !ijVar.s4()) {
                        f10 -= org.telegram.messenger.g0.L(3.66f);
                    }
                }
                int i26 = ijVar.D;
                if (i26 == 31 || i26 == 37 || i26 == 33) {
                    f10 -= org.telegram.messenger.g0.L(3.66f);
                }
                canvas3.translate(f26, f10);
                if (this.j1 != null) {
                    canvas3.save();
                    canvas3.translate(((this.i1 - org.telegram.messenger.g0.L(16.0f)) - this.j1.getWidth()) / 2.0f, 0.0f);
                    this.j1.draw(canvas3);
                    canvas3.restore();
                    float height = this.j1.getHeight() + f10;
                    if (this.m1 != null) {
                        canvas3.save();
                        canvas3.translate(((this.i1 - org.telegram.messenger.g0.L(16.0f)) - this.m1.getWidth()) / 2.0f, org.telegram.messenger.g0.L(4.0f) + this.j1.getHeight());
                        this.m1.draw(canvas3);
                        canvas3.restore();
                        height += org.telegram.messenger.g0.L(10.0f) + this.m1.getHeight();
                    }
                    L = height + org.telegram.messenger.g0.L(ijVar.D == 25 ? 6.0f : 0.0f);
                } else {
                    L = f10 - org.telegram.messenger.g0.L(4.0f);
                }
                float f28 = L;
                canvas3.restore();
                StaticLayout staticLayout4 = this.j1;
                int i27 = TLObject.FLAG_28;
                if (staticLayout4 == null || (ny0Var2 = this.l1) == null) {
                    i12 = 33;
                    canvas2 = canvas3;
                    f11 = 0.0f;
                } else {
                    float k10 = ny0Var2.k() + org.telegram.messenger.g0.L(12.0f);
                    float A = com.google.android.recaptcha.internal.a.A(this.i1 - org.telegram.messenger.g0.L(16.0f), k10, 2.0f, f26);
                    float height2 = f10 + this.j1.getHeight() + org.telegram.messenger.g0.L(14.0f);
                    if (this.k1 == null) {
                        this.k1 = new Paint(1);
                    }
                    this.k1.setColor(org.telegram.ui.ActionBar.l6.j1() ? 285212671 : 268435456);
                    RectF rectF2 = org.telegram.messenger.g0.P;
                    rectF2.set(A, height2 - org.telegram.messenger.g0.L(8.0f), k10 + A, org.telegram.messenger.g0.L(8.0f) + height2);
                    canvas3.drawRoundRect(rectF2, org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), this.k1);
                    Canvas canvas4 = canvas3;
                    f11 = 0.0f;
                    i12 = 33;
                    this.l1.c(A + org.telegram.messenger.g0.L(6.0f), height2, 1.0f, -855638017, canvas4);
                    canvas2 = canvas4;
                    f28 += org.telegram.messenger.g0.L(24.0f);
                }
                float L5 = f28 + org.telegram.messenger.g0.L(4.0f);
                if (ijVar.D == 18) {
                    L5 += org.telegram.messenger.g0.L(2.0f);
                }
                float f29 = L5;
                canvas2.save();
                canvas2.translate(f26, f29);
                if (ijVar.D == i11) {
                    RadialProgress2 radialProgress23 = radialProgress2;
                    if ((radialProgress23.c ? radialProgress23.j : radialProgress23.i).b() == 1.0f) {
                        i14 = 4;
                        if (radialProgress23.a() == 4) {
                            if (this.s1 != null) {
                                canvas2.save();
                                canvas2.translate((this.i1 - ((StaticLayout) this.s1.f).getWidth()) / 2.0f, f11);
                                this.s1.b = ((this.i1 - ((StaticLayout) r3.f).getWidth()) / 2.0f) + f26;
                                this.s1.e = f29;
                                int color = textPaint3.getColor();
                                r0 r0Var = this.s1;
                                f16 = f26;
                                f14 = f11;
                                f15 = 8.0f;
                                f12 = 0.2f;
                                xh.f.g(this, false, color, 0, (AtomicReference) r0Var.g, 1, (StaticLayout) r0Var.f, r0Var.c, canvas, false);
                                r0 r0Var2 = this.s1;
                                org.telegram.ui.Components.r5.drawAnimatedEmojis(canvas, (StaticLayout) r0Var2.f, (org.telegram.ui.Components.n5) r0Var2.h, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f, K(textPaint3.getColor()));
                                canvas3 = canvas;
                                canvas3.restore();
                                t0Var = this;
                                f13 = f16;
                            } else {
                                f12 = 0.2f;
                                f14 = f11;
                                f15 = 8.0f;
                                t0Var = this;
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
                    if (this.A1 == null) {
                        TextPaint textPaint6 = new TextPaint();
                        this.z1 = textPaint6;
                        textPaint6.setTextSize(org.telegram.messenger.g0.L(13.0f));
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(id.L0(2131754558));
                        int indexOf = spannableStringBuilder.toString().indexOf("...");
                        if (indexOf < 0) {
                            indexOf = spannableStringBuilder.toString().indexOf("…");
                            i15 = 1;
                        } else {
                            i15 = 3;
                        }
                        if (indexOf >= 0) {
                            SpannableString spannableString = new SpannableString("…");
                            di.w9 w9Var = new di.w9();
                            w9Var.r = true;
                            w9Var.b(this);
                            spannableString.setSpan(w9Var, 0, spannableString.length(), i28);
                            spannableStringBuilder.replace(indexOf, indexOf + i15, (CharSequence) spannableString);
                        }
                        TextPaint textPaint7 = this.z1;
                        r0 r0Var3 = this.s1;
                        this.A1 = new StaticLayout(spannableStringBuilder, textPaint7, r0Var3 == null ? 1 : r0Var3.d, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                    }
                    float P2 = P(ijVar);
                    if (this.C1 == null || this.B1 != P2) {
                        this.B1 = P2;
                        String n10 = a8.p0.n((int) (P2 * 100.0f), "%", new StringBuilder());
                        r0 r0Var4 = this.s1;
                        this.C1 = new StaticLayout(n10, textPaint3, r0Var4 == null ? 1 : r0Var4.d, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                    }
                    this.z1.setColor(textPaint3.getColor());
                    if (radialProgress23.a() == i14) {
                        float b10 = (radialProgress23.c ? radialProgress23.j : radialProgress23.i).b();
                        int color2 = textPaint3.getColor();
                        float f30 = 1.0f - b10;
                        this.z1.setAlpha((int) (Color.alpha(color2) * f30));
                        textPaint3.setAlpha((int) (Color.alpha(color2) * b10));
                        textPaint3.linkColor = textPaint3.getColor();
                        if (this.s1 != null) {
                            float f31 = (b10 * 0.2f) + 0.8f;
                            canvas3.save();
                            canvas3.scale(f31, f31, this.i1 / 2.0f, ((StaticLayout) this.s1.f).getHeight() / 2.0f);
                            canvas3.translate((this.i1 - ((StaticLayout) this.s1.f).getWidth()) / 2.0f, f14);
                            this.s1.b = ((this.i1 - ((StaticLayout) r1.f).getWidth()) / 2.0f) + f16;
                            this.s1.e = f29;
                            int color3 = textPaint3.getColor();
                            r0 r0Var5 = this.s1;
                            xh.f.g(this, false, color3, 0, (AtomicReference) r0Var5.g, 1, (StaticLayout) r0Var5.f, r0Var5.c, canvas3, false);
                            r0 r0Var6 = this.s1;
                            t0Var2 = this;
                            org.telegram.ui.Components.r5.drawAnimatedEmojis(canvas, (StaticLayout) r0Var6.f, (org.telegram.ui.Components.n5) r0Var6.h, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f, K(textPaint3.getColor()));
                            canvas3 = canvas;
                            canvas3.restore();
                        } else {
                            t0Var2 = this;
                        }
                        textPaint3.setAlpha((int) (Color.alpha(color2) * f30));
                        textPaint3.linkColor = textPaint3.getColor();
                        float f32 = (f30 * 0.2f) + 0.8f;
                        canvas3.save();
                        canvas3.scale(f32, f32, t0Var2.i1 / 2.0f, t0Var2.A1.getHeight() / 2.0f);
                        canvas3.translate((t0Var2.i1 - t0Var2.A1.getWidth()) / 2.0f, f14);
                        xh.f.f(canvas3, t0Var2.A1);
                        canvas3.restore();
                        canvas3.save();
                        canvas3.translate(f14, org.telegram.messenger.g0.L(4.0f) + t0Var2.A1.getHeight());
                        canvas3.scale(f32, f32, t0Var2.i1 / 2.0f, t0Var2.C1.getHeight() / 2.0f);
                        canvas3.translate((t0Var2.i1 - t0Var2.C1.getWidth()) / 2.0f, f14);
                        xh.f.f(canvas3, t0Var2.C1);
                        canvas3.restore();
                        textPaint3.setColor(color2);
                        textPaint3.linkColor = color2;
                    } else {
                        t0Var2 = this;
                        canvas3.save();
                        canvas3.translate((t0Var2.i1 - t0Var2.A1.getWidth()) / 2.0f, f14);
                        t0Var2.A1.draw(canvas3);
                        canvas3.restore();
                        canvas3.save();
                        canvas3.translate((t0Var2.i1 - t0Var2.C1.getWidth()) / 2.0f, org.telegram.messenger.g0.L(4.0f) + t0Var2.A1.getHeight());
                        xh.f.f(canvas3, t0Var2.C1);
                        canvas3.restore();
                    }
                    t0Var = t0Var2;
                    f13 = f16;
                } else {
                    f12 = 0.2f;
                    f13 = f26;
                    f14 = f11;
                    f15 = 8.0f;
                    canvas3 = canvas2;
                    r0 r0Var7 = this.s1;
                    if (r0Var7 != null) {
                        float height3 = ((StaticLayout) r0Var7.f).getHeight();
                        if (d < 1.0f) {
                            height3 = org.telegram.messenger.g0.T1(this.p1, height3, d);
                            RectF rectF3 = org.telegram.messenger.g0.P;
                            rectF3.set(f14, -org.telegram.messenger.g0.L(20.0f), getWidth(), height3);
                            canvas3.saveLayerAlpha(rectF3, qs.e4, 31);
                        } else {
                            canvas3.save();
                        }
                        canvas3.translate(((this.i1 - org.telegram.messenger.g0.L(16.0f)) - ((StaticLayout) this.s1.f).getWidth()) / 2.0f, f14);
                        this.s1.b = (((this.i1 - org.telegram.messenger.g0.L(16.0f)) - ((StaticLayout) this.s1.f).getWidth()) / 2.0f) + f13;
                        r0 r0Var8 = this.s1;
                        r0Var8.e = f29;
                        int color4 = r0Var8.a.getColor();
                        r0 r0Var9 = this.s1;
                        float f33 = height3;
                        xh.f.g(this, false, color4, 0, (AtomicReference) r0Var9.g, 1, (StaticLayout) r0Var9.f, r0Var9.c, canvas3, false);
                        r0 r0Var10 = this.s1;
                        StaticLayout staticLayout5 = (StaticLayout) r0Var10.f;
                        org.telegram.ui.Components.n5 n5Var2 = (org.telegram.ui.Components.n5) r0Var10.h;
                        ColorFilter K = K(textPaint3.getColor());
                        t0Var = this;
                        org.telegram.ui.Components.r5.drawAnimatedEmojis(canvas, staticLayout5, n5Var2, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f, K);
                        canvas3 = canvas;
                        if (d < 1.0f && t0Var.w1 != null) {
                            canvas3.save();
                            if (t0Var.r1 == null) {
                                t0Var.r1 = new h6.m(28);
                            }
                            canvas3.translate((-((t0Var.i1 - org.telegram.messenger.g0.L(16.0f)) - ((StaticLayout) t0Var.s1.f).getWidth())) / 2.0f, f14);
                            RectF rectF4 = org.telegram.messenger.g0.P;
                            rectF4.set((t0Var.t1 - t0Var.w1.g()) + org.telegram.messenger.g0.L(8.0f), (t0Var.u1 - t0Var.v1) - org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f) + t0Var.t1, t0Var.u1);
                            float f34 = 1.0f - d;
                            t0Var.r1.j(canvas3, rectF4, f34);
                            rectF4.set((t0Var.t1 - t0Var.w1.g()) - org.telegram.messenger.g0.L(16.0f), (t0Var.u1 - t0Var.v1) - org.telegram.messenger.g0.L(6.0f), (t0Var.t1 - t0Var.w1.g()) + org.telegram.messenger.g0.L(8.0f), t0Var.u1);
                            t0Var.r1.m(canvas3, rectF4, 2, f34);
                            rectF4.set(f14, f33 - org.telegram.messenger.g0.L(12.0f), t0Var.getWidth(), f33);
                            t0Var.r1.m(canvas3, rectF4, 3, (1.0f - f34) * f34 * 4.0f);
                            canvas3.restore();
                        }
                        canvas3.restore();
                        if (d < 1.0f && (ny0Var = t0Var.w1) != null) {
                            ny0Var.c((t0Var.t1 - ny0Var.g()) + org.telegram.messenger.g0.L(5.0f), (t0Var.u1 - (t0Var.v1 / 2.0f)) - org.telegram.messenger.g0.L(1.0f), 1.0f - d, t0Var.s1.a.getColor(), canvas3);
                        }
                    } else {
                        t0Var = this;
                    }
                }
                canvas3.restore();
                if (t0Var.j1 == null) {
                    org.telegram.messenger.g0.L(f15);
                }
                r0 r0Var11 = t0Var.s1;
                if (r0Var11 != null) {
                    ((StaticLayout) r0Var11.f).getHeight();
                }
                StaticLayout staticLayout6 = t0Var.x1;
                if (staticLayout6 != null) {
                    staticLayout6.getHeight();
                }
                t0Var.getHeight();
                org.telegram.messenger.g0.L(f15);
                org.telegram.ui.ActionBar.g6 g6Var = t0Var.g1;
                if (g6Var != null) {
                    g6Var.b(t0Var.u0, t0Var.t0 + org.telegram.messenger.g0.L(4.0f), t0Var.getMeasuredWidth(), t0Var.v0);
                } else {
                    org.telegram.ui.ActionBar.l6.r(t0Var.u0, t0Var.t0 + org.telegram.messenger.g0.L(4.0f), t0Var.getMeasuredWidth(), t0Var.v0);
                }
                float a11 = t0Var.n.a(0.02f);
                canvas3.save();
                RectF rectF5 = t0Var.o0;
                canvas3.scale(a11, a11, rectF5.centerX(), rectF5.centerY());
                if (t0Var.x1 != null) {
                    canvas3.drawRoundRect(rectF5, org.telegram.messenger.g0.L(15.0f), org.telegram.messenger.g0.L(15.0f), t0Var.N("paintChatActionBackgroundSelected"));
                    if (t0Var.Q()) {
                        canvas3.drawRoundRect(rectF5, org.telegram.messenger.g0.L(15.0f), org.telegram.messenger.g0.L(15.0f), t0Var.N("paintChatActionBackgroundDarken"));
                    }
                    float f35 = t0Var.b2;
                    Paint paint = t0Var.c2;
                    if (f35 > f14) {
                        canvas3.drawRoundRect(rectF5, org.telegram.messenger.g0.L(15.0f), org.telegram.messenger.g0.L(15.0f), paint);
                    }
                    if (t0Var.getMessageObject().D == 31 || t0Var.getMessageObject().D == 37 || t0Var.getMessageObject().D == 33) {
                        boolean a12 = g6Var != null ? g6Var.a() : org.telegram.ui.ActionBar.l6.j1();
                        int color5 = paint.getColor();
                        if (a12) {
                            i27 = 620756991;
                        }
                        paint.setColor(i27);
                        canvas3.drawRoundRect(rectF5, org.telegram.messenger.g0.L(15.0f), org.telegram.messenger.g0.L(15.0f), paint);
                        paint.setColor(color5);
                    }
                    if (t0Var.getMessageObject().D == 31 || t0Var.getMessageObject().D == 37 || t0Var.getMessageObject().D == 33 || t0Var.getMessageObject().D == 21 || t0Var.getMessageObject().D == 22 || t0Var.getMessageObject().D == 24) {
                        t0Var.invalidate();
                    } else {
                        Path path2 = t0Var.U1;
                        path2.rewind();
                        path2.addRoundRect(rectF5, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), Path.Direction.CW);
                        canvas3.save();
                        canvas3.clipPath(path2);
                        ug.p1 p1Var = t0Var.V1;
                        p1Var.d(canvas3);
                        if (!p1Var.g) {
                            t0Var.invalidate();
                        }
                        canvas3.restore();
                    }
                }
                boolean z9 = ijVar.q;
                if (z9) {
                    float f36 = t0Var.c0;
                    if (f36 != 1.0f) {
                        t0Var.c0 = f36 + 0.10666667f;
                        i13 = Utilities.i(t0Var.c0, 1.0f, f14);
                        t0Var.c0 = i13;
                        if (i13 != f14) {
                            if (t0Var.b0 == null) {
                                t0Var.b0 = new RadialProgressView(t0Var.getContext());
                            }
                            int L6 = org.telegram.messenger.g0.L(16.0f);
                            canvas3.save();
                            float f37 = t0Var.c0;
                            canvas3.scale(f37, f37, rectF5.centerX(), rectF5.centerY());
                            t0Var.b0.setSize(L6);
                            t0Var.b0.setProgressColor(org.telegram.ui.ActionBar.l6.v0(org.telegram.ui.ActionBar.l6.Wc));
                            t0Var.b0.a(canvas3, rectF5.centerX(), rectF5.centerY());
                            canvas3.restore();
                        }
                        if (t0Var.c0 != 1.0f && t0Var.x1 != null) {
                            canvas3.save();
                            float f38 = 1.0f - t0Var.c0;
                            canvas3.scale(f38, f38, rectF5.centerX(), rectF5.centerY());
                            canvas3.translate(f13, rectF5.top + org.telegram.messenger.g0.L(7.0f));
                            canvas3.translate(((t0Var.i1 - org.telegram.messenger.g0.L(16.0f)) - t0Var.x1.getWidth()) / 2.0f, f14);
                            t0Var.x1.draw(canvas3);
                            canvas3.restore();
                        }
                        if (ijVar.r) {
                            b80 b80Var = t0Var.r;
                            if (b80Var != null) {
                                b80Var.e(rectF5);
                                t0Var.r.k(16.0f);
                                t0Var.r.a();
                                t0Var.r.draw(canvas3);
                                if (t0Var.r.c()) {
                                    t0Var.r.b = -1L;
                                }
                            }
                        } else {
                            if (t0Var.r == null) {
                                b80 b80Var2 = new b80(g6Var);
                                t0Var.r = b80Var2;
                                b80Var2.h();
                                b80 b80Var3 = t0Var.r;
                                b80Var3.D = true;
                                float f39 = f12;
                                b80Var3.g(org.telegram.ui.ActionBar.l6.r1(0.08f, -1), org.telegram.ui.ActionBar.l6.r1(f39, -1), org.telegram.ui.ActionBar.l6.r1(f39, -1), org.telegram.ui.ActionBar.l6.r1(0.7f, -1));
                                t0Var.r.x.setStrokeWidth(org.telegram.messenger.g0.L(1.0f));
                            }
                            b80 b80Var4 = t0Var.r;
                            b80Var4.c = -1L;
                            b80Var4.e(rectF5);
                            t0Var.r.k(16.0f);
                            t0Var.r.draw(canvas3);
                        }
                        canvas3.restore();
                        if (t0Var.M1 != null && t0Var.R1 != null && t0Var.S1 != null) {
                            N = t0Var.N("paintChatActionBackground");
                            Paint N2 = t0Var.N("paintChatActionBackgroundDarken");
                            float L7 = (t0Var.M1.right - org.telegram.messenger.g0.L(65.0f)) + org.telegram.messenger.g0.L(2.0f);
                            float L8 = t0Var.M1.top - org.telegram.messenger.g0.L(2.0f);
                            if (g6Var == null) {
                                g6Var.b(t0Var.u0 + L7, t0Var.t0 + org.telegram.messenger.g0.L(4.0f) + L8, t0Var.getMeasuredWidth(), t0Var.v0);
                            } else {
                                org.telegram.ui.ActionBar.l6.r(t0Var.u0 + L7, t0Var.t0 + org.telegram.messenger.g0.L(4.0f) + L8, t0Var.getMeasuredWidth(), t0Var.v0);
                            }
                            canvas3.save();
                            canvas3.translate(L7, L8);
                            ColorFilter colorFilter = N.getColorFilter();
                            PathEffect pathEffect = N.getPathEffect();
                            a10 = g6Var == null ? g6Var.a() : org.telegram.ui.ActionBar.l6.j1();
                            if (t0Var.P1 != null || t0Var.O1 != a10) {
                                colorMatrix = new ColorMatrix();
                                if ((N.getColorFilter() instanceof ColorMatrixColorFilter) && Build.VERSION.SDK_INT >= 26) {
                                    ((ColorMatrixColorFilter) N.getColorFilter()).getColorMatrix(colorMatrix);
                                }
                                org.telegram.messenger.g0.h(colorMatrix, !a10 ? 0.1f : -0.08f);
                                org.telegram.messenger.g0.i(colorMatrix, a10 ? 0.15f : 0.1f);
                                t0Var.P1 = new ColorMatrixColorFilter(colorMatrix);
                                t0Var.O1 = a10;
                            }
                            N.setColorFilter(t0Var.P1);
                            N.setPathEffect(t0Var.Q1);
                            canvas3.drawPath(t0Var.R1, N);
                            N.setColorFilter(colorFilter);
                            N.setPathEffect(pathEffect);
                            if (t0Var.Q()) {
                                PathEffect pathEffect2 = N2.getPathEffect();
                                N2.setPathEffect(t0Var.Q1);
                                canvas3.drawPath(t0Var.R1, N2);
                                N2.setPathEffect(pathEffect2);
                            }
                            canvas3.rotate(45.0f, org.telegram.messenger.g0.L(40.43f), org.telegram.messenger.g0.L(24.56f));
                            t0Var.S1.c(org.telegram.messenger.g0.L(40.43f) - (t0Var.S1.g() / 2.0f), org.telegram.messenger.g0.L(26.0f), 1.0f, -1, canvas3);
                            canvas3.restore();
                        }
                    }
                }
                if (!z9) {
                    float f40 = t0Var.c0;
                    if (f40 != f14) {
                        t0Var.c0 = f40 - 0.10666667f;
                    }
                }
                i13 = Utilities.i(t0Var.c0, 1.0f, f14);
                t0Var.c0 = i13;
                if (i13 != f14) {
                }
                if (t0Var.c0 != 1.0f) {
                    canvas3.save();
                    float f382 = 1.0f - t0Var.c0;
                    canvas3.scale(f382, f382, rectF5.centerX(), rectF5.centerY());
                    canvas3.translate(f13, rectF5.top + org.telegram.messenger.g0.L(7.0f));
                    canvas3.translate(((t0Var.i1 - org.telegram.messenger.g0.L(16.0f)) - t0Var.x1.getWidth()) / 2.0f, f14);
                    t0Var.x1.draw(canvas3);
                    canvas3.restore();
                }
                if (ijVar.r) {
                }
                canvas3.restore();
                if (t0Var.M1 != null) {
                    N = t0Var.N("paintChatActionBackground");
                    Paint N22 = t0Var.N("paintChatActionBackgroundDarken");
                    float L72 = (t0Var.M1.right - org.telegram.messenger.g0.L(65.0f)) + org.telegram.messenger.g0.L(2.0f);
                    float L82 = t0Var.M1.top - org.telegram.messenger.g0.L(2.0f);
                    if (g6Var == null) {
                    }
                    canvas3.save();
                    canvas3.translate(L72, L82);
                    ColorFilter colorFilter2 = N.getColorFilter();
                    PathEffect pathEffect3 = N.getPathEffect();
                    if (g6Var == null) {
                    }
                    if (t0Var.P1 != null) {
                    }
                    colorMatrix = new ColorMatrix();
                    if (N.getColorFilter() instanceof ColorMatrixColorFilter) {
                        ((ColorMatrixColorFilter) N.getColorFilter()).getColorMatrix(colorMatrix);
                    }
                    org.telegram.messenger.g0.h(colorMatrix, !a10 ? 0.1f : -0.08f);
                    org.telegram.messenger.g0.i(colorMatrix, a10 ? 0.15f : 0.1f);
                    t0Var.P1 = new ColorMatrixColorFilter(colorMatrix);
                    t0Var.O1 = a10;
                    N.setColorFilter(t0Var.P1);
                    N.setPathEffect(t0Var.Q1);
                    canvas3.drawPath(t0Var.R1, N);
                    N.setColorFilter(colorFilter2);
                    N.setPathEffect(pathEffect3);
                    if (t0Var.Q()) {
                    }
                    canvas3.rotate(45.0f, org.telegram.messenger.g0.L(40.43f), org.telegram.messenger.g0.L(24.56f));
                    t0Var.S1.c(org.telegram.messenger.g0.L(40.43f) - (t0Var.S1.g() / 2.0f), org.telegram.messenger.g0.L(26.0f), 1.0f, -1, canvas3);
                    canvas3.restore();
                }
            } else {
                t0Var = this;
            }
            t0Var.H(canvas3, false);
            t0Var.r2.a();
            canvas3.restore();
        }
        i7 = 22;
        c10 = '%';
        textPaint = this.s0;
        arrayList = this.p0;
        if (textPaint != null) {
        }
        i11 = i7;
        radialProgress2 = radialProgress22;
        if (this.s0 != null) {
            canvas3.save();
            canvas3.translate(this.U, this.S - this.Q);
            if (this.P.getPaint() != this.s0) {
            }
            canvas3.save();
            xh.f.d(canvas3, arrayList);
            xh.f.f(canvas3, this.P);
            q0Var = this.f1;
            if (q0Var != null) {
            }
            StaticLayout staticLayout22 = this.P;
            org.telegram.ui.Components.n5 n5Var3 = this.r0;
            StaticLayout staticLayout32 = this.M;
            org.telegram.ui.Components.r5.drawAnimatedEmojis(canvas, staticLayout22, n5Var3, 0.0f, arrayList, 0.0f, 0.0f, 0.0f, 1.0f, staticLayout32 != null ? null : K(staticLayout32.getPaint().getColor()));
            canvas3 = canvas;
            canvas3.restore();
            size = arrayList.size();
            i16 = 0;
            while (i16 < size) {
            }
            canvas3.restore();
        }
        if (R()) {
        }
        t0Var = this;
        t0Var.H(canvas3, false);
        t0Var.r2.a();
        canvas3.restore();
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        ij ijVar = this.P0;
        if (TextUtils.isEmpty(this.R0) && ijVar == null) {
            return;
        }
        if (this.m2 == null) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(!TextUtils.isEmpty(this.R0) ? this.R0 : ijVar.v);
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
    public void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        RectF rectF = this.o0;
        this.T1.layout((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        org.telegram.ui.Wallet.b4 b4Var = this.I0;
        org.telegram.ui.Wallet.a4 a4Var = b4Var == null ? null : b4Var.m;
        if (a4Var != null) {
            a4Var.layout(0, 0, org.telegram.messenger.g0.L(42.0f), org.telegram.messenger.g0.L(42.0f));
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
        boolean R;
        ch.p0 p0Var;
        float f12;
        boolean z9;
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
        org.telegram.ui.Wallet.b4 b4Var = this.I0;
        org.telegram.ui.Wallet.a4 a4Var = b4Var == null ? null : b4Var.m;
        if (a4Var != null) {
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(42.0f), TLObject.FLAG_30);
            a4Var.measure(makeMeasureSpec, makeMeasureSpec);
        }
        ij ijVar = this.P0;
        if (ijVar == null && this.R0 == null) {
            setMeasuredDimension(View.MeasureSpec.getSize(i7), org.telegram.messenger.g0.L(14.0f) + this.l0 + this.O);
            return;
        }
        if (U(ijVar)) {
            this.i1 = org.telegram.messenger.camera.q.C(64.0f, (org.telegram.messenger.g0.q.y - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - org.telegram.messenger.g0.m, (int) (org.telegram.messenger.g0.Q1() ? org.telegram.messenger.g0.Q0() * 0.6f : (org.telegram.messenger.g0.q.x * 0.62f) - org.telegram.messenger.g0.L(34.0f)));
            if ((!org.telegram.messenger.g0.Q1() && ((i14 = ijVar.D) == 18 || i14 == 30 || V())) || ijVar.D == 35) {
                this.i1 = (int) (this.i1 * 1.2f);
            }
            this.h1 = this.i1 - org.telegram.messenger.g0.L(106.0f);
            if (ijVar.D == 31) {
                this.i1 = Math.min(this.i1, org.telegram.messenger.g0.L(192.0f));
                this.h1 = org.telegram.messenger.g0.L(78.0f);
            }
            if (ijVar.D == 33) {
                this.i1 = Math.min(this.i1, org.telegram.messenger.g0.L(220.0f));
                this.h1 = org.telegram.messenger.g0.L(78.0f);
            }
            int i15 = ijVar.D;
            ImageReceiver imageReceiver = this.I;
            if (i15 == 37) {
                this.h1 = org.telegram.messenger.g0.L(52.0f);
                imageReceiver.J0(org.telegram.messenger.g0.L(14.0f));
            } else if (W()) {
                imageReceiver.J0(this.h1 / 2);
            } else {
                imageReceiver.J0(0);
            }
        }
        int max = Math.max(org.telegram.messenger.g0.L(30.0f), View.MeasureSpec.getSize(i7));
        if (this.V != max) {
            this.C0 = true;
            this.V = max;
            v();
        }
        if (ijVar != null) {
            f10 = 30.0f;
            if (ijVar.D == 11) {
                i13 = org.telegram.messenger.g0.u;
                L4 = org.telegram.messenger.g0.L(10.0f);
            } else if (U(ijVar)) {
                i13 = this.i1;
                L4 = org.telegram.messenger.g0.L(12.0f);
            } else if (S()) {
                f11 = 140.0f;
                i11 = (this.I0.q0 == null ? org.telegram.messenger.g0.L(140.0f) : ((int) Math.ceil(r3.q0.i())) + org.telegram.messenger.g0.L(150.0f)) + org.telegram.messenger.g0.L(8.0f);
                R = R();
                p0Var = this.E0;
                if (R) {
                    r9 = org.telegram.messenger.k5.C(8.0f, this.H0.P, this.H0.p ? 0 : org.telegram.messenger.g0.L(16.0f) + this.S + this.O);
                    if (!p0Var.p) {
                        L3 = org.telegram.messenger.g0.L(8.0f) + p0Var.m;
                        p0Var.n = L3;
                        r9 += L3;
                    }
                    f14 = 24.0f;
                } else {
                    kw0 kw0Var = this.O0;
                    if (kw0Var != null) {
                        r9 = org.telegram.messenger.g0.L(12.0f) + org.telegram.messenger.g0.L(f11) + ((int) kw0Var.f.i()) + (kw0Var.i ? org.telegram.messenger.g0.L(40.0f) : 0);
                        if (!p0Var.p) {
                            L3 = org.telegram.messenger.g0.L(8.0f) + p0Var.m;
                            p0Var.n = L3;
                            r9 += L3;
                        }
                    } else if (U(ijVar)) {
                        if (ijVar != null) {
                            f12 = 12.0f;
                            if (ijVar.D == 25) {
                                z9 = true;
                                int L5 = L(ijVar);
                                if (W()) {
                                    f13 = 8.0f;
                                    f14 = 24.0f;
                                    L = (this.s1 == null ? 0 : org.telegram.messenger.g0.L(4.0f) + ((StaticLayout) r4.f).getHeight()) + (this.i1 * 0.075f) + this.S + this.O + L5 + org.telegram.messenger.g0.L(4.0f);
                                } else {
                                    f14 = 24.0f;
                                    f13 = 8.0f;
                                    int L6 = org.telegram.messenger.g0.L(4.0f) + this.S + this.O + (L5 > 0 ? org.telegram.messenger.k5.D(16.0f, 2, L5) : org.telegram.messenger.g0.L(16.0f));
                                    r0 r0Var = this.s1;
                                    L = L6 + (r0Var == null ? 0 : org.telegram.messenger.g0.L(4.0f) + ((StaticLayout) r0Var.f).getHeight());
                                }
                                this.K1 = 0;
                                if (this.j1 == null) {
                                    float height = L + r15.getHeight();
                                    if (this.j1.getLineCount() > 1) {
                                        this.K1 = (this.j1.getHeight() - this.j1.getLineTop(1)) + this.K1;
                                    }
                                    L2 = height + org.telegram.messenger.g0.L(z9 ? 6.0f : 0.0f);
                                    if (this.m1 != null) {
                                        L2 += org.telegram.messenger.g0.L(9.0f) + r5.getHeight();
                                    }
                                    if (this.l1 != null) {
                                        L2 += org.telegram.messenger.g0.L(f14);
                                    }
                                } else {
                                    L2 = L - org.telegram.messenger.g0.L(f12);
                                    this.K1 -= org.telegram.messenger.g0.L(f10);
                                }
                                r0 r0Var2 = this.s1;
                                int height2 = r0Var2 != null ? 0 : ((StaticLayout) r0Var2.f).getHeight();
                                if (this.s1 != null) {
                                    this.K1 = 0;
                                } else if (this.m1 != null) {
                                    this.K1 = org.telegram.messenger.k5.C(10.0f, height2, this.K1);
                                } else {
                                    ij ijVar2 = this.P0;
                                    if (ijVar2.D == 18 || ijVar2.s4()) {
                                        this.K1 = org.telegram.messenger.camera.q.D(this.x1 == null ? 0.0f : 10.0f, height2, this.K1);
                                    } else if (this.P0.D == 30) {
                                        this.K1 = org.telegram.messenger.camera.q.D(20.0f, height2, this.K1);
                                    } else if (this.o1) {
                                        this.K1 += height2;
                                    } else if (((StaticLayout) this.s1.f).getLineCount() > 2) {
                                        this.K1 = ((((StaticLayout) this.s1.f).getLineCount() * (((StaticLayout) this.s1.f).getLineBottom(0) - ((StaticLayout) this.s1.f).getLineTop(0))) - 2) + this.K1;
                                    }
                                }
                                if (this.l1 != null) {
                                    this.K1 = org.telegram.messenger.g0.L(f14) + this.K1;
                                }
                                int L7 = this.K1 - org.telegram.messenger.g0.L(z9 ? 14.0f : 0.0f);
                                this.K1 = L7;
                                i11 += L7;
                                int L8 = org.telegram.messenger.g0.L(14.0f) + this.O + i11;
                                staticLayout = this.x1;
                                RectF rectF = this.o0;
                                if (staticLayout == null) {
                                    float A = com.google.android.recaptcha.internal.a.A((L8 - L2) - staticLayout.getHeight(), org.telegram.messenger.g0.L(f13), 2.0f, L2);
                                    if (this.P0.s4()) {
                                        A += org.telegram.messenger.g0.L(4.0f);
                                    }
                                    float f16 = (this.V - this.D1) / 2.0f;
                                    f15 = 2.0f;
                                    rectF.set(f16 - org.telegram.messenger.g0.L(18.0f), A - org.telegram.messenger.g0.L(f13), f16 + this.D1 + org.telegram.messenger.g0.L(18.0f), A + (this.x1 != null ? r7.getHeight() : 0) + org.telegram.messenger.g0.L(f13));
                                } else {
                                    f15 = 2.0f;
                                    i11 -= org.telegram.messenger.g0.L(40.0f);
                                    this.K1 -= org.telegram.messenger.g0.L(40.0f);
                                    ij ijVar3 = this.P0;
                                    if (ijVar3 != null && (message = ijVar3.k) != null && (message.action instanceof TLRPC.TL_messageActionStarGift)) {
                                        i11 -= org.telegram.messenger.g0.L(f13);
                                        this.K1 -= org.telegram.messenger.g0.L(f13);
                                    }
                                }
                                measuredWidth = getMeasuredWidth() << (getMeasuredHeight() + 16);
                                ug.p1 p1Var = this.V1;
                                p1Var.a.set(rectF);
                                p1Var.b.set(rectF);
                                if (this.W1 != measuredWidth) {
                                    this.W1 = measuredWidth;
                                    p1Var.f();
                                }
                                if (W()) {
                                    int L9 = org.telegram.messenger.g0.L(4.0f) + this.S + this.O;
                                    this.f = 0;
                                    int D = L5 > 0 ? org.telegram.messenger.k5.D(16.0f, 2, L5) : org.telegram.messenger.g0.L(16.0f);
                                    this.f = D;
                                    StaticLayout staticLayout2 = this.m1;
                                    if (staticLayout2 != null) {
                                        this.f = org.telegram.messenger.k5.C(10.0f, staticLayout2.getHeight(), D);
                                    }
                                    if (this.l1 != null) {
                                        this.f = org.telegram.messenger.g0.L(15.0f) + this.f;
                                    }
                                    int i16 = this.f + height2;
                                    this.f = i16;
                                    float f17 = (this.V - this.D1) / f15;
                                    if (this.x1 != null) {
                                        this.h = org.telegram.messenger.g0.L(7.0f) + i16 + L9;
                                        rectF.set(f17 - org.telegram.messenger.g0.L(18.0f), this.h, f17 + this.D1 + org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.k5.D(f13, 2, this.x1.getHeight() + this.h));
                                        this.f = (int) (rectF.height() + org.telegram.messenger.g0.L(4.0f) + this.f);
                                    } else if (!V() && (i12 = ijVar.D) != 34 && i12 != 33 && i12 != 35) {
                                        rectF.set(f17 - org.telegram.messenger.g0.L(18.0f), this.h, f17 + this.D1 + org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.k5.D(8.0f, 2, org.telegram.messenger.g0.L(17.0f) + this.h));
                                        this.f = org.telegram.messenger.g0.L(17.0f) + this.f;
                                    }
                                    int L10 = org.telegram.messenger.g0.L(15.0f) + this.f;
                                    this.f = L10;
                                    int L11 = org.telegram.messenger.g0.L(6.0f) + L9 + L10;
                                    if (!p0Var.p) {
                                        int L12 = org.telegram.messenger.g0.L(8.0f) + p0Var.m;
                                        p0Var.n = L12;
                                        L11 += L12;
                                    }
                                    r9 = L11;
                                    if (this.Y1 != null) {
                                        r9 += org.telegram.messenger.g0.L(44.0f);
                                    }
                                }
                                rectF.inset(org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(1.0f));
                            }
                        } else {
                            f12 = 12.0f;
                        }
                        z9 = false;
                        int L52 = L(ijVar);
                        if (W()) {
                        }
                        this.K1 = 0;
                        if (this.j1 == null) {
                        }
                        r0 r0Var22 = this.s1;
                        if (r0Var22 != null) {
                        }
                        if (this.s1 != null) {
                        }
                        if (this.l1 != null) {
                        }
                        int L72 = this.K1 - org.telegram.messenger.g0.L(z9 ? 14.0f : 0.0f);
                        this.K1 = L72;
                        i11 += L72;
                        int L82 = org.telegram.messenger.g0.L(14.0f) + this.O + i11;
                        staticLayout = this.x1;
                        RectF rectF2 = this.o0;
                        if (staticLayout == null) {
                        }
                        measuredWidth = getMeasuredWidth() << (getMeasuredHeight() + 16);
                        ug.p1 p1Var2 = this.V1;
                        p1Var2.a.set(rectF2);
                        p1Var2.b.set(rectF2);
                        if (this.W1 != measuredWidth) {
                        }
                        if (W()) {
                        }
                        rectF2.inset(org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(1.0f));
                    }
                    f14 = 24.0f;
                }
                if (this.P0 != null && !p0Var.p) {
                    int L13 = org.telegram.messenger.g0.L(8.0f) + p0Var.m;
                    p0Var.n = L13;
                    i11 += L13;
                }
                if (V()) {
                    i11 = org.telegram.messenger.k5.C(f14, this.Q, i11);
                }
                if (ijVar == null && W()) {
                    setMeasuredDimension(max, this.l0 + r9);
                } else {
                    setMeasuredDimension(max, org.telegram.messenger.g0.L(14.0f) + this.l0 + this.O + i11);
                }
                p0Var.c = (getMeasuredHeight() - getPaddingTop()) - p0Var.n;
            }
            i11 = L4 + i13;
            f11 = 140.0f;
            R = R();
            p0Var = this.E0;
            if (R) {
            }
            if (this.P0 != null) {
                int L132 = org.telegram.messenger.g0.L(8.0f) + p0Var.m;
                p0Var.n = L132;
                i11 += L132;
            }
            if (V()) {
            }
            if (ijVar == null) {
            }
            setMeasuredDimension(max, org.telegram.messenger.g0.L(14.0f) + this.l0 + this.O + i11);
            p0Var.c = (getMeasuredHeight() - getPaddingTop()) - p0Var.n;
        }
        f10 = 30.0f;
        f11 = 140.0f;
        i11 = 0;
        R = R();
        p0Var = this.E0;
        if (R) {
        }
        if (this.P0 != null) {
        }
        if (V()) {
        }
        if (ijVar == null) {
        }
        setMeasuredDimension(max, org.telegram.messenger.g0.L(14.0f) + this.l0 + this.O + i11);
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
        int i7;
        boolean z9;
        k30 k30Var;
        r0 r0Var;
        nj njVar;
        cg.a aVar;
        r0 r0Var2;
        TLRPC.Message message;
        boolean z10;
        boolean z11;
        boolean z12;
        StaticLayout staticLayout;
        boolean z13;
        ArrayList arrayList;
        boolean z14;
        boolean z15;
        TLRPC.Message message2;
        int i10;
        t0 t0Var;
        boolean z16;
        m0 m0Var;
        ij ijVar = this.P0;
        float x10 = motionEvent.getX() - (this.j0 / 2.0f);
        this.y0 = x10;
        float y10 = motionEvent.getY() + getPaddingTop();
        this.z0 = y10;
        boolean z17 = true;
        if (ijVar == null) {
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
        h01 h01Var = this.n0;
        if (h01Var == null || !h01Var.d(motionEvent, false)) {
            kw0 kw0Var = this.O0;
            if (kw0Var != null) {
                ic icVar = kw0Var.m;
                boolean contains = kw0Var.k.contains(motionEvent.getX(), motionEvent.getY());
                if (motionEvent.getAction() == 0) {
                    icVar.c(contains);
                } else if (motionEvent.getAction() != 2) {
                    if (motionEvent.getAction() == 1) {
                        if (icVar.i) {
                            kw0Var.b();
                        }
                        icVar.c(false);
                    } else if (motionEvent.getAction() == 3) {
                        icVar.c(false);
                    }
                }
            }
            if (!R() || !this.H0.e(this.F0, this.G0, motionEvent)) {
                if (S()) {
                    org.telegram.ui.Wallet.b4 b4Var = this.I0;
                    float f10 = (this.j0 / 2.0f) + this.K0;
                    float paddingTop = this.L0 + getPaddingTop();
                    ArrayList arrayList2 = b4Var.c;
                    ic icVar2 = b4Var.Y;
                    float x11 = motionEvent.getX() - f10;
                    float y11 = motionEvent.getY() - paddingTop;
                    t0 t0Var2 = b4Var.a;
                    if (motionEvent.getActionMasked() == 0) {
                        float x12 = motionEvent.getX() - f10;
                        float y12 = motionEvent.getY() - paddingTop;
                        org.telegram.ui.Wallet.a4 a4Var = b4Var.m;
                        if (a4Var != null && a4Var.n && b4Var.w.contains((int) x12, (int) y12)) {
                            if (!b4Var.D && b4Var.C <= 1.001f) {
                                b4Var.A = b4Var.g();
                                b4Var.B = b4Var.k.E * 0.14f;
                            }
                            ValueAnimator valueAnimator = b4Var.G;
                            if (valueAnimator != null) {
                                valueAnimator.cancel();
                                b4Var.G = null;
                            }
                            b4Var.D = false;
                            b4Var.x = motionEvent.getPointerId(0);
                            b4Var.y = motionEvent.getX();
                            b4Var.z = motionEvent.getY();
                            b4Var.r0 = false;
                            icVar2.c(false);
                            if (t0Var2.getParent() != null) {
                                t0Var2.getParent().requestDisallowInterceptTouchEvent(true);
                            }
                            b4Var.a(3.0f);
                            if (z17) {
                                if (this.I0.x != -1) {
                                    n();
                                    return true;
                                }
                                if (motionEvent.getAction() == 0) {
                                    this.A0 = motionEvent.getX();
                                    this.B0 = motionEvent.getY();
                                    u();
                                    return true;
                                }
                                if (motionEvent.getAction() != 2) {
                                    n();
                                    return true;
                                }
                                float scaledTouchSlop = ViewConfiguration.get(getContext()).getScaledTouchSlop();
                                if (Math.abs(motionEvent.getX() - this.A0) > scaledTouchSlop || Math.abs(motionEvent.getY() - this.B0) > scaledTouchSlop) {
                                    n();
                                    return true;
                                }
                            }
                        }
                        float L = org.telegram.messenger.g0.L(4.0f);
                        boolean z18 = x11 < L && x11 <= ((float) org.telegram.messenger.g0.L(206.0f)) - L && y11 >= L && y11 <= ((float) org.telegram.messenger.g0.L(140.0f)) - L;
                        if (b4Var.q0 != null) {
                            TLRPC.TL_messageActionGramTransfer tL_messageActionGramTransfer = b4Var.l0;
                            if ((tL_messageActionGramTransfer.comment_encrypted || tL_messageActionGramTransfer.comment_encrypted_preparing) && !b4Var.m0) {
                                float L2 = x11 - ((org.telegram.messenger.g0.L(206.0f) - b4Var.q0.k()) / 2.0f);
                                float L3 = y11 - org.telegram.messenger.g0.L(143.0f);
                                int size = arrayList2.size();
                                int i11 = 0;
                                while (i11 < size) {
                                    Object obj = arrayList2.get(i11);
                                    i11++;
                                    t0Var = t0Var2;
                                    if (((xh.f) obj).getBounds().contains((int) L2, (int) L3)) {
                                        z16 = true;
                                        break;
                                    }
                                    t0Var2 = t0Var;
                                }
                            }
                        }
                        t0Var = t0Var2;
                        z16 = false;
                        boolean z19 = !z18 || z16;
                        if (motionEvent.getAction() != 0) {
                            b4Var.r0 = z19;
                            icVar2.c(z19);
                        } else if (motionEvent.getAction() != 2) {
                            if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                                z17 = b4Var.r0;
                                boolean z20 = motionEvent.getAction() == 1 && z17 && z19;
                                b4Var.r0 = false;
                                icVar2.c(false);
                                if (z20 && z16) {
                                    TLRPC.TL_messageActionGramTransfer tL_messageActionGramTransfer2 = b4Var.l0;
                                    if (tL_messageActionGramTransfer2.comment_encrypted_preparing) {
                                        b4Var.m0 = true;
                                        ny0 ny0Var = b4Var.q0;
                                        ny0Var.q(org.telegram.messenger.i6.m(tL_messageActionGramTransfer2.comment, ny0Var.a.getFontMetricsInt(), false, null, 0));
                                        b4Var.d.addAll(arrayList2);
                                        arrayList2.clear();
                                        t0Var.requestLayout();
                                        t0Var.invalidate();
                                        if (z17) {
                                        }
                                    }
                                }
                                if (z20 && (m0Var = b4Var.s0) != null) {
                                    m0Var.run();
                                }
                                if (z17) {
                                }
                            }
                            z17 = b4Var.r0;
                            if (z17) {
                            }
                        } else if (b4Var.r0) {
                            icVar2.c(z19);
                        }
                        z17 = b4Var.r0;
                        if (z17) {
                        }
                    } else {
                        if (b4Var.x != -1) {
                            int actionMasked = motionEvent.getActionMasked();
                            if (actionMasked != 1) {
                                if (actionMasked == 2) {
                                    int findPointerIndex = motionEvent.findPointerIndex(b4Var.x);
                                    if (findPointerIndex < 0) {
                                        b4Var.j();
                                    } else {
                                        float radians = ((float) Math.toRadians(0.800000011920929d)) / org.telegram.messenger.g0.p;
                                        b4Var.A = com.google.android.recaptcha.internal.a.z(motionEvent.getX(findPointerIndex), b4Var.y, radians, b4Var.A);
                                        b4Var.B = com.google.android.recaptcha.internal.a.z(motionEvent.getY(findPointerIndex), b4Var.z, radians, b4Var.B);
                                        b4Var.y = motionEvent.getX(findPointerIndex);
                                        b4Var.z = motionEvent.getY(findPointerIndex);
                                        t0Var2.invalidate();
                                    }
                                } else if (actionMasked != 3) {
                                    if (actionMasked == 6 && motionEvent.getPointerId(motionEvent.getActionIndex()) == b4Var.x) {
                                        int i12 = motionEvent.getActionIndex() == 0 ? 1 : 0;
                                        b4Var.x = motionEvent.getPointerId(i12);
                                        b4Var.y = motionEvent.getX(i12);
                                        b4Var.z = motionEvent.getY(i12);
                                    }
                                }
                                if (z17) {
                                }
                            }
                            b4Var.j();
                            if (z17) {
                            }
                        }
                        float L4 = org.telegram.messenger.g0.L(4.0f);
                        if (x11 < L4) {
                        }
                        if (b4Var.q0 != null) {
                        }
                        t0Var = t0Var2;
                        z16 = false;
                        if (z18) {
                        }
                        if (motionEvent.getAction() != 0) {
                        }
                        z17 = b4Var.r0;
                        if (z17) {
                        }
                    }
                    return true;
                }
                if (!this.E0.c(motionEvent)) {
                    int action = motionEvent.getAction();
                    RectF rectF = this.o0;
                    ImageReceiver imageReceiver = this.I;
                    View view = this.T1;
                    ic icVar3 = this.n;
                    if (action != 0) {
                        i7 = 4;
                        if (motionEvent.getAction() != 2) {
                            n();
                        }
                        if (this.F) {
                            if (motionEvent.getAction() == 2) {
                                if (x10 < this.a1 || x10 > this.b1) {
                                    z10 = false;
                                    this.F = false;
                                    z11 = z10;
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
                            z11 = false;
                        } else if (this.E) {
                            int action2 = motionEvent.getAction();
                            if (action2 == 1) {
                                this.E = false;
                                view.setPressed(false);
                                icVar3.c(false);
                                if (this.f1 != null && ijVar.C != null && (message = ijVar.k) != null && cg.d.g(message.action, TLRPC.TL_messageActionTodoAppendTasks.class, TLRPC.TL_messageActionTodoCompletions.class, TLRPC.TL_messageActionSuggestedPostApproval.class, TLRPC.TL_messageActionSuggestedPostRefund.class, TLRPC.TL_messageActionSuggestedPostSuccess.class)) {
                                    this.f1.i(this, this.P0.N1());
                                } else if (this.o1 && !this.n1 && (r0Var2 = this.s1) != null) {
                                    int height = ((StaticLayout) r0Var2.f).getHeight() - this.p1;
                                    this.n1 = true;
                                    q0 q0Var = this.f1;
                                    if (q0Var != null) {
                                        q0Var.l(this);
                                        if (getParent() instanceof qj0) {
                                            ((qj0) getParent()).w0(0, org.telegram.messenger.g0.L(24.0f) + height, null);
                                            return true;
                                        }
                                    }
                                } else if (this.O0 != null && this.M1.contains(motionEvent.getX(), motionEvent.getY())) {
                                    this.O0.b();
                                    return true;
                                }
                            } else if (action2 == 2) {
                                r0 r0Var3 = this.s1;
                                if (r0Var3 == null || !this.o1) {
                                    this.E = false;
                                } else {
                                    RectF rectF2 = org.telegram.messenger.g0.P;
                                    float f11 = r0Var3.b;
                                    rectF2.set(f11, r0Var3.e, ((StaticLayout) r0Var3.f).getWidth() + f11, this.s1.e + ((StaticLayout) r8.f).getHeight());
                                    if (!rectF2.contains(x10, y10)) {
                                        this.E = false;
                                    }
                                }
                                z10 = true;
                                z11 = z10;
                            } else if (action2 == 3) {
                                this.E = false;
                                icVar3.c(false);
                            }
                            z10 = false;
                            z11 = z10;
                        } else {
                            boolean z21 = this.a0;
                            int i13 = this.H;
                            if (z21) {
                                int action3 = motionEvent.getAction();
                                if (action3 == 1) {
                                    this.W = false;
                                    this.a0 = false;
                                    view.setPressed(false);
                                    icVar3.c(false);
                                    if (this.f1 != null) {
                                        int i14 = ijVar.D;
                                        if (i14 == 37) {
                                            playSoundEffect(0);
                                            org.telegram.ui.ActionBar.f2 T = LaunchActivity.T();
                                            if (T != null) {
                                                new ii.d0(T, ((TLRPC.TL_messageActionChangeCommunity) ijVar.k.action).community_id, null, null).show();
                                            }
                                        } else if (i14 == 31) {
                                            playSoundEffect(0);
                                            c0();
                                        } else if (i14 == 25) {
                                            playSoundEffect(0);
                                            if (this.f1 != null) {
                                                org.telegram.messenger.g0.h3(new ea(2, this, (TLRPC.TL_messageActionGiftCode) this.P0.k.action));
                                            }
                                        } else if (i14 == 18) {
                                            playSoundEffect(0);
                                            b0();
                                        } else if (i14 == 30) {
                                            playSoundEffect(0);
                                            c0();
                                        } else {
                                            TLRPC.Message message3 = ijVar.k;
                                            if (message3 != null) {
                                                TLRPC.MessageAction messageAction = message3.action;
                                                if ((messageAction instanceof TLRPC.TL_messageActionSuggestedPostApproval) && ((TLRPC.TL_messageActionSuggestedPostApproval) messageAction).balance_too_low) {
                                                    playSoundEffect(0);
                                                    TLRPC.Message message4 = this.P0.k;
                                                    if (message4 != null) {
                                                        TLRPC.SuggestedPost suggestedPost = message4.suggested_post;
                                                        if (suggestedPost != null) {
                                                            njVar = nj.b(suggestedPost);
                                                        } else {
                                                            TLRPC.MessageAction messageAction2 = message4.action;
                                                            if (messageAction2 instanceof TLRPC.TL_messageActionSuggestedPostApproval) {
                                                                njVar = new nj(cg.a.l(((TLRPC.TL_messageActionSuggestedPostApproval) messageAction2).price), r1.schedule_date);
                                                            }
                                                        }
                                                        aVar = njVar.a;
                                                        if (aVar != null && aVar.a == cg.b.a) {
                                                            new tc(getContext(), this.g1, njVar.a.a(), 13, qg.d.h(i13, ij.B0(this.P0.k)), null, ij.B0(this.P0.k)).show();
                                                        }
                                                    }
                                                    njVar = null;
                                                    aVar = njVar.a;
                                                    if (aVar != null) {
                                                        new tc(getContext(), this.g1, njVar.a.a(), 13, qg.d.h(i13, ij.B0(this.P0.k)), null, ij.B0(this.P0.k)).show();
                                                    }
                                                }
                                            }
                                            if (((k30) qp.s1(i13).B7.get(ijVar.k.local_id)) == null) {
                                                if (this.y1) {
                                                    this.f1.q(this);
                                                } else {
                                                    this.f1.s(this);
                                                }
                                            }
                                        }
                                    }
                                } else if (action3 != 2) {
                                    if (action3 == 3) {
                                        this.W = false;
                                        this.a0 = false;
                                        view.setPressed(false);
                                        icVar3.c(false);
                                    }
                                } else if (!U(ijVar) || (!rectF.contains(x10, y10) && !this.M1.contains(x10, y10))) {
                                    this.a0 = false;
                                    view.setPressed(false);
                                    icVar3.c(false);
                                }
                            } else if (this.W) {
                                int action4 = motionEvent.getAction();
                                if (action4 == 1) {
                                    this.W = false;
                                    if (!this.o1 || this.n1 || (r0Var = this.s1) == null) {
                                        int i15 = ijVar.D;
                                        if (i15 == 31) {
                                            c0();
                                        } else if (i15 == 25) {
                                            if (this.f1 != null) {
                                                org.telegram.messenger.g0.h3(new ea(2, this, (TLRPC.TL_messageActionGiftCode) this.P0.k.action));
                                            }
                                        } else if (i15 == 18) {
                                            b0();
                                        } else if (i15 == 30) {
                                            c0();
                                        } else if (this.f1 != null) {
                                            if (i15 != 21 || (k30Var = (k30) qp.s1(i13).B7.get(ijVar.k.local_id)) == null) {
                                                z9 = false;
                                            } else {
                                                k30Var.b();
                                                z9 = true;
                                            }
                                            if (!z9) {
                                                this.f1.q(this);
                                                playSoundEffect(0);
                                            }
                                        }
                                    } else {
                                        int height2 = ((StaticLayout) r0Var.f).getHeight() - this.p1;
                                        this.n1 = true;
                                        q0 q0Var2 = this.f1;
                                        if (q0Var2 != null) {
                                            q0Var2.l(this);
                                            if (getParent() instanceof qj0) {
                                                ((qj0) getParent()).w0(0, org.telegram.messenger.g0.L(16.0f) + height2, null);
                                                return true;
                                            }
                                        }
                                    }
                                } else if (action4 != 2) {
                                    if (action4 == 3) {
                                        this.W = false;
                                    }
                                } else if (W()) {
                                    if (!this.M1.contains(x10, y10)) {
                                        this.W = false;
                                    }
                                } else if (!imageReceiver.O(x10, y10)) {
                                    this.W = false;
                                }
                            }
                            z11 = false;
                        }
                    } else if (this.f1 != null) {
                        if ((ijVar.D == 11 || U(ijVar)) && imageReceiver.O(x10, y10)) {
                            this.W = true;
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        if (this.J1.i.q == 4 && (((i10 = ijVar.D) == 21 || i10 == 22) && this.M1.contains(x10, y10))) {
                            this.W = true;
                            z14 = true;
                        }
                        r0 r0Var4 = this.s1;
                        if (r0Var4 == null || !this.o1) {
                            i7 = 4;
                        } else {
                            RectF rectF3 = org.telegram.messenger.g0.P;
                            float f12 = r0Var4.b;
                            i7 = 4;
                            rectF3.set(f12, r0Var4.e, ((StaticLayout) r0Var4.f).getWidth() + f12, this.s1.e + ((StaticLayout) r6.f).getHeight());
                            if (rectF3.contains(x10, y10)) {
                                this.E = true;
                                z14 = true;
                            }
                        }
                        if (U(ijVar) && this.x1 != null && (rectF.contains(x10, y10) || (this.y1 && this.M1.contains(x10, y10)))) {
                            z15 = true;
                            this.a0 = true;
                            view.setPressed(true);
                            icVar3.c(true);
                            z14 = true;
                        } else {
                            z15 = true;
                        }
                        if (!z14 && V()) {
                            this.E = z15;
                            z14 = true;
                        }
                        if (!z14) {
                            ij ijVar2 = this.P0;
                            if (cg.d.g((ijVar2 == null || (message2 = ijVar2.k) == null) ? null : message2.action, TLRPC.TL_messageActionSuggestedPostRefund.class, TLRPC.TL_messageActionSuggestedPostSuccess.class)) {
                                this.E = true;
                                z14 = true;
                            }
                        }
                        if (z14) {
                            u();
                        }
                        z11 = z14;
                    } else {
                        i7 = 4;
                        z11 = false;
                    }
                    if (!z11 && (motionEvent.getAction() == 0 || ((this.y != null || this.D != null) && motionEvent.getAction() == 1))) {
                        r0 r0Var5 = this.s1;
                        if (r0Var5 != null && (arrayList = r0Var5.c) != null && !arrayList.isEmpty() && !this.G) {
                            ArrayList arrayList3 = this.s1.c;
                            int size2 = arrayList3.size();
                            int i16 = 0;
                            while (true) {
                                if (i16 >= size2) {
                                    break;
                                }
                                Object obj2 = arrayList3.get(i16);
                                i16++;
                                xh.f fVar = (xh.f) obj2;
                                Rect bounds = fVar.getBounds();
                                r0 r0Var6 = this.s1;
                                if (bounds.contains((int) (x10 - r0Var6.b), (int) (y10 - r0Var6.e))) {
                                    this.y = null;
                                    if (motionEvent.getAction() == 0) {
                                        this.D = fVar;
                                        z11 = true;
                                    } else {
                                        xh.f fVar2 = this.D;
                                        z12 = true;
                                        if (fVar == fVar2) {
                                            this.G = true;
                                            fVar2.q = new m0(this, i7);
                                            float sqrt = (float) Math.sqrt(Math.pow(((StaticLayout) this.s1.f).getHeight(), 2.0d) + Math.pow(((StaticLayout) this.s1.f).getWidth(), 2.0d));
                                            xh.f fVar3 = this.D;
                                            r0 r0Var7 = this.s1;
                                            fVar3.j((int) (x10 - r0Var7.b), (int) (y10 - r0Var7.e), sqrt, false);
                                            invalidate();
                                        }
                                        z11 = true;
                                    }
                                }
                            }
                        }
                        z12 = true;
                        if (!z11 && (staticLayout = this.M) != null) {
                            if (x10 >= this.R) {
                                float f13 = this.S;
                                if (y10 >= f13 && x10 <= r5 + this.N && y10 <= r6 + this.O) {
                                    float f14 = y10 - f13;
                                    float f15 = x10 - this.T;
                                    if (!z11) {
                                        int lineForVertical = staticLayout.getLineForVertical((int) f14);
                                        int offsetForHorizontal = this.M.getOffsetForHorizontal(lineForVertical, f15);
                                        float lineLeft = this.M.getLineLeft(lineForVertical);
                                        if (lineLeft <= f15 && this.M.getLineWidth(lineForVertical) + lineLeft >= f15) {
                                            CharSequence charSequence = ijVar.v;
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
                                                    z13 = z12;
                                                    z11 = z13;
                                                } else {
                                                    this.y = null;
                                                }
                                                z13 = z11;
                                                z11 = z13;
                                            }
                                        }
                                        this.y = null;
                                    }
                                }
                            }
                        }
                        this.y = null;
                    }
                    if (!z11) {
                        z11 = w(motionEvent);
                    }
                    return !z11 ? super.onTouchEvent(motionEvent) : z11;
                }
                return true;
            }
        }
        return true;
    }

    @Override // org.telegram.ui.Cells.z
    public final boolean q() {
        q0 q0Var = this.f1;
        if (q0Var != null) {
            return q0Var.r0(this, this.y0, this.z0);
        }
        return false;
    }

    public void setCustomText(CharSequence charSequence) {
        this.R0 = charSequence;
        if (charSequence != null) {
            j0(false);
        }
    }

    public void setDelegate(q0 q0Var) {
        this.f1 = q0Var;
    }

    public void setInvalidateColors(boolean z9) {
        if (this.e1 == z9) {
            return;
        }
        this.e1 = z9;
        invalidate();
    }

    public void setInvalidateListener(Runnable runnable) {
        this.o2 = runnable;
    }

    public void setInvalidateWithParent(View view) {
        this.w = view;
    }

    public void setInvalidatesParent(boolean z9) {
        this.n2 = z9;
    }

    public void setMessageObject(ij ijVar) {
        g0(ijVar, false);
    }

    public void setOnActionClickListener(View.OnClickListener onClickListener) {
        this.e2 = onClickListener;
    }

    public void setOverrideTextMaxWidth(int i7) {
        this.f2 = i7;
    }

    public void setScrimReaction(Integer num) {
        this.E0.z = num;
    }

    public void setShowTopic(boolean z9) {
        if (this.m0 != z9) {
            this.m0 = z9;
            T();
            invalidate();
        }
    }

    public void setSpoilersSuppressed(boolean z9) {
        this.J0 = z9;
        org.telegram.ui.Wallet.b4 b4Var = this.I0;
        if (b4Var != null) {
            b4Var.n(z9);
        }
        ArrayList arrayList = this.p0;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            ((xh.f) obj).invalidateSelf();
        }
    }

    public void setWalletSlidingOffset(float f10) {
        setTranslationX((getTranslationX() - this.M0) + f10);
        this.M0 = f10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:173:0x0762, code lost:
    
        if (r8 == false) goto L334;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x01b6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v() {
        long j3;
        CharSequence charSequence;
        CharSequence charSequence2;
        CharSequence L0;
        CharSequence charSequence3;
        boolean z9;
        CharSequence Z;
        ArrayList<TLRPC.VideoSize> arrayList;
        TLRPC.Photo photo;
        ArrayList<TLRPC.VideoSize> arrayList2;
        CharSequence charSequence4;
        int i7;
        String G;
        TL_stars.StarGift starGift;
        String str;
        CharSequence X2;
        String str2;
        CharSequence charSequence5;
        String r10;
        TLRPC.Peer peer;
        TLRPC.Message message;
        TLRPC.MessageAction messageAction;
        int i10;
        TLRPC.Chat M0;
        TLRPC.User user;
        CharSequence K2;
        TLRPC.MessageMedia messageMedia;
        ij ijVar = this.P0;
        int i11 = this.H;
        if (ijVar == null) {
            j3 = 0;
            charSequence = this.R0;
        } else if (S()) {
            CharSequence m10 = org.telegram.ui.Wallet.l0.x(i11).m(((TLRPC.TL_messageActionGramTransfer) ijVar.k.action).amount, false);
            if (!TextUtils.isEmpty(m10)) {
                charSequence = id.V(null, null, 2131742974, org.telegram.ui.Components.r5.cloneSpans(ijVar.v), m10);
                j3 = 0;
                if (charSequence == null) {
                    TLRPC.Message message2 = ijVar.k;
                    if (message2 == null || (messageMedia = message2.media) == null || messageMedia.ttl_seconds == 0) {
                        charSequence = org.telegram.ui.Components.r5.cloneSpans(ijVar.v);
                    } else if (messageMedia.photo != null) {
                        charSequence = id.M0(2131753947, null);
                    } else {
                        TLRPC.Document document = messageMedia.document;
                        charSequence = ((document instanceof TLRPC.TL_documentEmpty) || ((messageMedia instanceof TLRPC.TL_messageMediaDocument) && document == null)) ? messageMedia.voice ? id.M0(2131753929, null) : messageMedia.round ? id.M0(2131753940, null) : id.M0(2131753932, null) : org.telegram.ui.Components.r5.cloneSpans(ijVar.v);
                    }
                }
            }
            j3 = 0;
            charSequence = null;
            if (charSequence == null) {
            }
        } else {
            if (ijVar.g3()) {
                charSequence = ijVar.k.media.user_id != p10.i(i11).e() ? di.s7.e(new Object[0], 2131750873, true) : di.s7.e(new Object[]{qp.s1(i11).a2(Long.valueOf(ij.B0(ijVar.k))).first_name}, 2131750872, true);
            } else {
                q0 q0Var = this.f1;
                if (q0Var != null && q0Var.b() == 0 && ij.E4(ijVar)) {
                    TLRPC.TL_forumTopic f10 = qp.s1(i11).q7.f(-ij.B0(ijVar.k), ij.b2(i11, ijVar.k, true, false));
                    int i12 = qg.d.a;
                    if (f10 != null) {
                        TLRPC.Message message3 = ijVar.k;
                        int i13 = ijVar.I1;
                        TLRPC.MessageAction messageAction2 = message3.action;
                        if (messageAction2 instanceof TLRPC.TL_messageActionTopicCreate) {
                            charSequence = org.telegram.messenger.g0.K2(id.M0(2131743999, null), qg.d.j(f10, null, null), "%s");
                        } else if (messageAction2 instanceof TLRPC.TL_messageActionTopicEdit) {
                            TLRPC.TL_messageActionTopicEdit tL_messageActionTopicEdit = (TLRPC.TL_messageActionTopicEdit) messageAction2;
                            j3 = 0;
                            long Z0 = ijVar.Z0();
                            if (org.telegram.messenger.m5.E(Z0)) {
                                user = qp.s1(i13).a2(Long.valueOf(Z0));
                                M0 = null;
                            } else {
                                M0 = qp.s1(i13).M0(Long.valueOf(-Z0));
                                user = null;
                            }
                            String m11 = user != null ? org.telegram.messenger.g5.m(0, user.first_name, user.last_name) : M0 != null ? M0.title : null;
                            int i14 = tL_messageActionTopicEdit.flags;
                            if ((i14 & 8) != 0) {
                                K2 = org.telegram.messenger.g0.K2(id.M0(tL_messageActionTopicEdit.hidden ? 2131744017 : 2131744003, null), m11, "%s");
                            } else if ((i14 & 4) != 0) {
                                K2 = org.telegram.messenger.g0.K2(org.telegram.messenger.g0.K2(id.M0(tL_messageActionTopicEdit.closed ? 2131744000 : 2131743995, null), qg.d.j(f10, null, null), "%2$s"), m11, "%1$s");
                            } else {
                                int i15 = i14 & 1;
                                if (i15 != 0 && (i14 & 2) != 0) {
                                    TLRPC.TL_forumTopic tL_forumTopic = new TLRPC.TL_forumTopic();
                                    tL_forumTopic.icon_emoji_id = tL_messageActionTopicEdit.icon_emoji_id;
                                    tL_forumTopic.title = tL_messageActionTopicEdit.title;
                                    K2 = org.telegram.messenger.g0.K2(org.telegram.messenger.g0.K2(id.M0(2131743996, null), qg.d.j(tL_forumTopic, null, null), "%2$s"), m11, "%1$s");
                                } else if (i15 != 0) {
                                    K2 = org.telegram.messenger.g0.K2(org.telegram.messenger.g0.K2(id.M0(2131743997, null), tL_messageActionTopicEdit.title, "%2$s"), m11, "%1$s");
                                } else {
                                    if ((i14 & 2) != 0) {
                                        TLRPC.TL_forumTopic tL_forumTopic2 = new TLRPC.TL_forumTopic();
                                        tL_forumTopic2.icon_emoji_id = tL_messageActionTopicEdit.icon_emoji_id;
                                        tL_forumTopic2.title = "";
                                        K2 = org.telegram.messenger.g0.K2(org.telegram.messenger.g0.K2(id.M0(2131743998, null), qg.d.j(tL_forumTopic2, null, null), "%2$s"), m11, "%1$s");
                                    }
                                    charSequence = null;
                                    if (charSequence == null) {
                                    }
                                }
                            }
                            charSequence = K2;
                            if (charSequence == null) {
                            }
                        }
                    }
                }
                j3 = 0;
                charSequence = null;
                if (charSequence == null) {
                }
            }
            j3 = 0;
            if (charSequence == null) {
            }
        }
        ij ijVar2 = this.P0;
        CharSequence charSequence6 = (ijVar2 == null || !ijVar2.h2) ? charSequence : "";
        if (ijVar2 != null && (message = ijVar2.k) != null && (messageAction = message.action) != null) {
            if (messageAction instanceof TLRPC.TL_messageActionTodoAppendTasks) {
                i10 = R.drawable.mini_checklist_add;
            } else if (messageAction instanceof TLRPC.TL_messageActionTodoCompletions) {
                TLRPC.TL_messageActionTodoCompletions tL_messageActionTodoCompletions = (TLRPC.TL_messageActionTodoCompletions) messageAction;
                i10 = tL_messageActionTodoCompletions.incompleted.size() > tL_messageActionTodoCompletions.completed.size() ? R.drawable.mini_checklist_undone : R.drawable.mini_checklist_done;
            } else {
                i10 = 0;
            }
            if (i10 != 0) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence6);
                spannableStringBuilder.insert(0, (CharSequence) "i ");
                spannableStringBuilder.setSpan(new wp(i10, 0), 0, 1, 33);
                charSequence6 = spannableStringBuilder;
            }
        }
        B(this.V, charSequence6);
        if (this.O0 != null) {
            this.M = null;
            this.O = 0;
            this.P = null;
            this.Q = 0;
            this.S = 0;
        }
        if (ijVar != null) {
            TLRPC.Message message4 = ijVar.k;
            if (message4 != null) {
                TLRPC.MessageAction messageAction3 = message4.action;
                if ((messageAction3 instanceof TLRPC.TL_messageActionSuggestedPostApproval) && ((TLRPC.TL_messageActionSuggestedPostApproval) messageAction3).balance_too_low) {
                    A(null, null, charSequence6, false, !org.telegram.messenger.t3.z(i11, 24, ij.B0(message4)) ? id.M0(2131745151, null) : null, 11, null, this.i1, false);
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
                    A(null, null, charSequence7, false, null, 11, null, this.i1, false);
                    this.M = null;
                    this.O = 0;
                    this.P = null;
                    this.Q = 0;
                    this.S = 0;
                }
            }
            int i16 = ijVar.D;
            if (i16 == 11) {
                float L = org.telegram.messenger.g0.L(19.0f) + this.O;
                float f11 = org.telegram.messenger.g0.u;
                this.I.y0((this.V - org.telegram.messenger.g0.u) / 2.0f, L, f11, f11);
            } else if (i16 == 25) {
                z();
            } else {
                TextPaint textPaint = this.F1;
                if (i16 == 30) {
                    TLRPC.User a22 = qp.s1(i11).a2(Long.valueOf(this.P0.A0()));
                    TLRPC.MessageAction messageAction5 = ijVar.k.action;
                    if (messageAction5 instanceof TLRPC.TL_messageActionGiftStars) {
                        A(id.I((int) ((TLRPC.TL_messageActionGiftStars) messageAction5).stars, "ActionGiftStarsTitle"), null, org.telegram.messenger.g0.X2(this.P0.P3() ? id.Z(2131754631, t10.k(a22)) : id.L0(2131754630)), false, id.L0(2131754626), 11, null, this.i1, true);
                    } else {
                        if ((messageAction5 instanceof TLRPC.TL_messageActionStarGiftUnique) && ((TLRPC.TL_messageActionStarGiftUnique) messageAction5).refunded) {
                            long e10 = p10.i(i11).e();
                            TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique = (TLRPC.TL_messageActionStarGiftUnique) ijVar.k.action;
                            if (ijVar.P3() != (!tL_messageActionStarGiftUnique.upgrade)) {
                                e10 = ijVar.A0();
                            }
                            TLRPC.User a23 = qp.s1(i11).a2(Long.valueOf(e10));
                            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                            spannableStringBuilder2.append((CharSequence) id.L0(tL_messageActionStarGiftUnique.prepaid_upgrade ? 2131750428 : 2131750437)).append((CharSequence) " ");
                            if (a23 != null && a23.photo != null) {
                                spannableStringBuilder2.append((CharSequence) "a ");
                                org.telegram.ui.f5 f5Var = new org.telegram.ui.f5(18.0f, i11, this);
                                f5Var.e(a23);
                                spannableStringBuilder2.setSpan(f5Var, spannableStringBuilder2.length() - 2, spannableStringBuilder2.length() - 1, 33);
                            }
                            spannableStringBuilder2.append((CharSequence) t10.k(a23));
                            A(spannableStringBuilder2, null, id.L0(2131750429), false, id.L0(2131754626), 12, id.L0(2131749894), this.i1, true);
                        } else if (messageAction5 instanceof TLRPC.TL_messageActionStarGift) {
                            TLRPC.TL_messageActionStarGift tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction5;
                            long j10 = tL_messageActionStarGift.convert_stars;
                            long e11 = p10.i(i11).e();
                            long j11 = j3;
                            TLRPC.Peer peer2 = tL_messageActionStarGift.peer;
                            boolean z10 = peer2 != null && (!tL_messageActionStarGift.prepaid_upgrade || (peer2 instanceof TLRPC.TL_peerChannel));
                            boolean z11 = ijVar.A0() == e11 && !z10;
                            long Z02 = ijVar.Z0();
                            if (!tL_messageActionStarGift.prepaid_upgrade && (peer = tL_messageActionStarGift.from_id) != null) {
                                Z02 = org.telegram.messenger.m5.o(peer);
                            }
                            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
                            TLObject e22 = qp.s1(i11).e2(Z02);
                            long o4 = org.telegram.messenger.m5.o(tL_messageActionStarGift.to_id);
                            TLObject e23 = qp.s1(i11).e2(o4);
                            boolean z12 = tL_messageActionStarGift.can_upgrade && !tL_messageActionStarGift.converted && tL_messageActionStarGift.upgrade_stars > j11 && !tL_messageActionStarGift.upgraded;
                            if (o4 != j11 && tL_messageActionStarGift.auction_acquired && e23 != null) {
                                spannableStringBuilder3.append((CharSequence) id.L0(2131750434)).append((CharSequence) " ");
                                if (!(e23 instanceof TLRPC.User) ? !(!(e23 instanceof TLRPC.Chat) || ((TLRPC.Chat) e23).photo == null) : ((TLRPC.User) e23).photo != null) {
                                    spannableStringBuilder3.append((CharSequence) "a ");
                                    org.telegram.ui.f5 f5Var2 = new org.telegram.ui.f5(18.0f, i11, this);
                                    org.telegram.ui.Components.w8 w8Var = f5Var2.c;
                                    w8Var.p(e23);
                                    f5Var2.b.i0(e23, w8Var, null);
                                    spannableStringBuilder3.setSpan(f5Var2, spannableStringBuilder3.length() - 2, spannableStringBuilder3.length() - 1, 33);
                                }
                                spannableStringBuilder3.append((CharSequence) org.telegram.messenger.m5.u(e23));
                            } else if (!z11) {
                                spannableStringBuilder3.append((CharSequence) id.L0(tL_messageActionStarGift.prepaid_upgrade ? 2131750428 : 2131750437)).append((CharSequence) " ");
                                if (!(e22 instanceof TLRPC.User) ? !(!(e22 instanceof TLRPC.Chat) || ((TLRPC.Chat) e22).photo == null) : ((TLRPC.User) e22).photo != null) {
                                    spannableStringBuilder3.append((CharSequence) "a ");
                                    org.telegram.ui.f5 f5Var3 = new org.telegram.ui.f5(18.0f, i11, this);
                                    org.telegram.ui.Components.w8 w8Var2 = f5Var3.c;
                                    w8Var2.p(e22);
                                    f5Var3.b.i0(e22, w8Var2, null);
                                    spannableStringBuilder3.setSpan(f5Var3, spannableStringBuilder3.length() - 2, spannableStringBuilder3.length() - 1, 33);
                                }
                                spannableStringBuilder3.append((CharSequence) org.telegram.messenger.m5.u(e22));
                            } else if (tL_messageActionStarGift.gift_num <= 0 || (starGift = tL_messageActionStarGift.gift) == null || (str = starGift.title) == null) {
                                spannableStringBuilder3.append((CharSequence) id.L0(2131750439));
                            } else {
                                spannableStringBuilder3.append((CharSequence) str).append((CharSequence) " #").append((CharSequence) id.E(tL_messageActionStarGift.gift_num, ','));
                            }
                            boolean z13 = ((ijVar.P3() && !z11) || !tL_messageActionStarGift.converted) && tL_messageActionStarGift.convert_stars > j11 && qp.s1(i11).E6 - (ConnectionsManager.getInstance(i11).getCurrentTime() - ijVar.k.date) > 0 && !tL_messageActionStarGift.refunded;
                            if (tL_messageActionStarGift.refunded) {
                                X2 = id.L0(2131750465);
                            } else {
                                TLRPC.TL_textWithEntities tL_textWithEntities = tL_messageActionStarGift.message;
                                if (tL_textWithEntities != null && !TextUtils.isEmpty(tL_textWithEntities.text)) {
                                    SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder(tL_messageActionStarGift.message.text);
                                    textPaint.setTextSize(org.telegram.messenger.g0.L(13.0f));
                                    ij.a(spannableStringBuilder4, tL_messageActionStarGift.message.entities, false, true, true);
                                    X2 = ij.z5(textPaint.getFontMetricsInt(), org.telegram.messenger.i6.m(spannableStringBuilder4, textPaint.getFontMetricsInt(), false, null, 0), tL_messageActionStarGift.message.entities);
                                } else if (tL_messageActionStarGift.auction_acquired) {
                                    X2 = id.Z(2131750420, id.E(tL_messageActionStarGift.gift.stars + tL_messageActionStarGift.upgrade_stars, ','));
                                } else if (z10) {
                                    X2 = tL_messageActionStarGift.converted ? id.I((int) j10, "Gift2ActionConvertedInfo") : (!z13 || j10 <= j11) ? org.telegram.messenger.g0.X2(id.L0(2131750458)) : org.telegram.messenger.g0.X2(id.I((int) j10, "Gift2ActionInfoChannel"));
                                } else if (z11) {
                                    X2 = (!tL_messageActionStarGift.converted || j10 <= j11) ? tL_messageActionStarGift.can_upgrade ? org.telegram.messenger.g0.X2(id.L0(2131750442)) : org.telegram.messenger.g0.X2(id.L0(2131750443)) : id.I((int) j10, "Gift2ActionConvertedInfo");
                                } else if (z12) {
                                    X2 = org.telegram.messenger.g0.X2(ijVar.P3() ? id.Z(2131750430, t10.k(a22)) : id.L0(2131750431));
                                } else {
                                    X2 = ijVar.P3() ? (!z13 || j10 <= j11) ? tL_messageActionStarGift.can_upgrade ? org.telegram.messenger.g0.X2(id.Z(2131750451, t10.k(a22))) : org.telegram.messenger.g0.X2(id.Z(2131750452, t10.k(a22))) : org.telegram.messenger.g0.X2(id.J((int) j10, "Gift2ActionOutInfo", t10.k(a22))) : tL_messageActionStarGift.converted ? id.I((int) j10, "Gift2ActionConvertedInfo") : tL_messageActionStarGift.saved ? !z13 ? id.L0(2131750466) : id.L0(2131750445) : !z13 ? id.L0(2131750467) : org.telegram.messenger.g0.X2(id.I((int) j10, "Gift2ActionInfo"));
                                }
                            }
                            CharSequence charSequence8 = X2;
                            TL_stars.StarGift starGift2 = tL_messageActionStarGift.gift;
                            if (starGift2 == null || !starGift2.limited) {
                                str2 = null;
                            } else {
                                int i17 = starGift2.availability_total;
                                str2 = id.Z(2131750135, i17 > 1500 ? org.telegram.messenger.g0.o0(i17, 0) : Integer.valueOf(i17));
                            }
                            CharSequence L02 = id.L0(2131754626);
                            if (ijVar.P3()) {
                                charSequence5 = L02;
                                if (!tL_messageActionStarGift.forceIn) {
                                }
                            }
                            charSequence5 = L02;
                            charSequence5 = L02;
                            if (!ijVar.P3() && z12) {
                                SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder();
                                spannableStringBuilder5.append("^  ");
                                wp wpVar = new wp(R.drawable.gift_unpack);
                                wpVar.H = 0.8f;
                                wpVar.I = 0.8f;
                                spannableStringBuilder5.setSpan(wpVar, 0, 1, 33);
                                spannableStringBuilder5.append(id.L0(2131749885));
                                charSequence5 = spannableStringBuilder5;
                            }
                            CharSequence charSequence9 = charSequence5;
                            TL_stars.StarGift starGift3 = tL_messageActionStarGift.gift;
                            A(spannableStringBuilder3, (starGift3 == null || starGift3.released_by == null || (r10 = org.telegram.messenger.m5.r(qp.s1(i11).e2(org.telegram.messenger.m5.o(tL_messageActionStarGift.gift.released_by)))) == null) ? null : bi.k7.e2(id.Z(2131750447, "@".concat(r10))), charSequence8, false, charSequence9, 11, str2, this.i1, true);
                        } else if (messageAction5 instanceof TLRPC.TL_messageActionGiftTon) {
                            A(id.L0(2131754624), null, this.P0.v, false, id.L0(2131754626), 11, null, this.i1, true);
                            this.M = null;
                            this.O = 0;
                            this.P = null;
                            this.Q = 0;
                            this.S = 0;
                        } else {
                            A(id.L0(2131754553), null, this.P0.v, false, id.L0(2131754626), 11, null, this.i1, true);
                            this.M = null;
                            this.O = 0;
                            this.P = null;
                            this.Q = 0;
                            this.S = 0;
                        }
                    }
                } else {
                    long j12 = j3;
                    if (i16 == 33) {
                        TLRPC.TL_messageActionStarGiftPurchaseOffer tL_messageActionStarGiftPurchaseOffer = (TLRPC.TL_messageActionStarGiftPurchaseOffer) message4.action;
                        SpannableStringBuilder spannableStringBuilder6 = new SpannableStringBuilder(charSequence7);
                        spannableStringBuilder6.append((CharSequence) "\n\n");
                        if (tL_messageActionStarGiftPurchaseOffer.accepted) {
                            spannableStringBuilder6.append((CharSequence) org.telegram.messenger.g0.X2(id.L0(2131749695)));
                        } else if (tL_messageActionStarGiftPurchaseOffer.declined) {
                            spannableStringBuilder6.append((CharSequence) org.telegram.messenger.g0.X2(id.L0(2131749692)));
                        } else {
                            int max = Math.max(0, tL_messageActionStarGiftPurchaseOffer.expires_at - ConnectionsManager.getInstance(i11).getCurrentTime());
                            if (max == 0) {
                                spannableStringBuilder6.append((CharSequence) org.telegram.messenger.g0.X2(id.L0(2131749694)));
                            } else {
                                int i18 = max / 60;
                                int i19 = max / 3600;
                                if (i19 > 0) {
                                    StringBuilder sb2 = new StringBuilder();
                                    i7 = 0;
                                    sb2.append(id.G(i19, "ShortHoursAgo", new Object[0]));
                                    sb2.append(" ");
                                    sb2.append(id.G(i18 % 60, "ShortMinutesAgo", new Object[0]));
                                    G = sb2.toString();
                                } else {
                                    i7 = 0;
                                    G = id.G(i18, "ShortMinutesAgo", new Object[0]);
                                }
                                if (G.endsWith(".")) {
                                    G = com.google.android.recaptcha.internal.a.k(G, 1, i7);
                                }
                                Object[] objArr = new Object[1];
                                objArr[i7] = G;
                                spannableStringBuilder6.append((CharSequence) org.telegram.messenger.g0.X2(id.Z(2131749693, objArr)));
                            }
                        }
                        A(null, null, spannableStringBuilder6, false, null, 11, null, this.i1, false);
                        this.M = null;
                        this.O = 0;
                        this.P = null;
                        this.Q = 0;
                        this.S = 0;
                    } else if (i16 == 34) {
                        A(null, null, charSequence7, false, null, 11, null, this.i1, false);
                        this.M = null;
                        this.O = 0;
                        this.P = null;
                        this.Q = 0;
                        this.S = 0;
                    } else if (i16 == 35) {
                        TLRPC.TL_messageActionNoForwardsRequest tL_messageActionNoForwardsRequest = (TLRPC.TL_messageActionNoForwardsRequest) message4.action;
                        SpannableStringBuilder spannableStringBuilder7 = new SpannableStringBuilder();
                        String u10 = org.telegram.messenger.m5.u(qp.s1(i11).a2(Long.valueOf(ijVar.A0())));
                        if (tL_messageActionNoForwardsRequest.new_value) {
                            spannableStringBuilder7.append(ijVar.N3() ? id.L0(2131745380) : org.telegram.messenger.g0.X2(id.Z(2131745383, u10)));
                        } else {
                            spannableStringBuilder7.append(ijVar.N3() ? id.L0(2131745369) : org.telegram.messenger.g0.X2(id.Z(2131745372, u10)));
                        }
                        if (tL_messageActionNoForwardsRequest.new_value) {
                            spannableStringBuilder7.append((CharSequence) "\n\n");
                            spannableStringBuilder7.append((CharSequence) D(id.L0(2131745390)));
                            spannableStringBuilder7.append((CharSequence) "\n\n");
                            spannableStringBuilder7.append((CharSequence) D(id.L0(2131745389)));
                            spannableStringBuilder7.append((CharSequence) "\n\n");
                            spannableStringBuilder7.append((CharSequence) D(id.L0(2131745388)));
                            spannableStringBuilder7.append((CharSequence) "\n\n");
                            spannableStringBuilder7.append((CharSequence) D(id.L0(2131745387)));
                        } else {
                            spannableStringBuilder7.append((CharSequence) "\n\n");
                            spannableStringBuilder7.append((CharSequence) D(id.L0(2131745379)));
                            spannableStringBuilder7.append((CharSequence) "\n\n");
                            spannableStringBuilder7.append((CharSequence) D(id.L0(2131745378)));
                            spannableStringBuilder7.append((CharSequence) "\n\n");
                            spannableStringBuilder7.append((CharSequence) D(id.L0(2131745377)));
                            spannableStringBuilder7.append((CharSequence) "\n\n");
                            spannableStringBuilder7.append((CharSequence) D(id.L0(2131745376)));
                        }
                        A(null, null, spannableStringBuilder7, false, null, 11, null, this.i1, false);
                        this.M = null;
                        this.O = 0;
                        this.P = null;
                        this.Q = 0;
                        this.S = 0;
                    } else if (i16 == 31) {
                        TL_stars.StarGift starGift4 = ((TLRPC.TL_chatThemeUniqueGift) ((TLRPC.TL_messageActionSetChatTheme) message4.action).theme).gift;
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(starGift4.title);
                        sb3.append(" #");
                        String m12 = jg.g.m(starGift4.num, ',', sb3);
                        long Z03 = ijVar.Z0();
                        A(null, null, org.telegram.messenger.g0.X2(p10.i(i11).e() == Z03 ? id.Z(2131749597, m12) : id.Z(2131749598, org.telegram.messenger.m5.s(i11, Z03), m12)), false, id.L0(2131749599), 11, null, this.i1, true);
                        this.M = null;
                        this.O = 0;
                        this.P = null;
                        this.Q = 0;
                        this.S = 0;
                    } else if (i16 == 37) {
                        TLRPC.TL_messageActionChangeCommunity tL_messageActionChangeCommunity = (TLRPC.TL_messageActionChangeCommunity) message4.action;
                        long o10 = org.telegram.messenger.m5.o(message4.peer_id);
                        boolean U = org.telegram.messenger.t3.U(i11, -o10);
                        boolean z14 = o10 > j12;
                        String s5 = org.telegram.messenger.m5.s(i11, org.telegram.messenger.m5.o(ijVar.k.from_id));
                        String s9 = org.telegram.messenger.m5.s(i11, -tL_messageActionChangeCommunity.community_id);
                        SpannableStringBuilder spannableStringBuilder8 = new SpannableStringBuilder();
                        spannableStringBuilder8.append((CharSequence) ii.m0.a(ijVar, s9, s5, U, z14));
                        A(null, null, spannableStringBuilder8, false, id.L0(2131749599), 11, null, this.i1, true);
                        this.M = null;
                        this.O = 0;
                        this.P = null;
                        this.Q = 0;
                        this.S = 0;
                    } else if (i16 == 18) {
                        TLRPC.MessageAction messageAction6 = message4.action;
                        TLRPC.TL_textWithEntities tL_textWithEntities2 = messageAction6 instanceof TLRPC.TL_messageActionGiftPremium ? ((TLRPC.TL_messageActionGiftPremium) messageAction6).message : messageAction6 instanceof TLRPC.TL_messageActionGiftCode ? ((TLRPC.TL_messageActionGiftCode) messageAction6).message : null;
                        if (tL_textWithEntities2 == null || TextUtils.isEmpty(tL_textWithEntities2.text)) {
                            charSequence4 = null;
                        } else {
                            SpannableStringBuilder spannableStringBuilder9 = new SpannableStringBuilder(tL_textWithEntities2.text);
                            textPaint.setTextSize(org.telegram.messenger.g0.L(13.0f));
                            ij.a(spannableStringBuilder9, tL_textWithEntities2.entities, false, true, true);
                            charSequence4 = ij.z5(textPaint.getFontMetricsInt(), org.telegram.messenger.i6.m(spannableStringBuilder9, textPaint.getFontMetricsInt(), false, null, 0), tL_textWithEntities2.entities);
                        }
                        if (charSequence4 == null) {
                            charSequence4 = id.L0(2131754641);
                        }
                        CharSequence charSequence10 = charSequence4;
                        ij ijVar3 = this.P0;
                        CharSequence L03 = id.L0((ijVar3 == null || !(ijVar3.k.action instanceof TLRPC.TL_messageActionGiftCode) || X()) ? 2131754634 : 2131749660);
                        TLRPC.MessageAction messageAction7 = ijVar.k.action;
                        int i20 = messageAction7.months;
                        if (i20 >= 1) {
                            A(id.I(i20, "ActionGiftPremiumTitle2"), null, charSequence10, true, L03, 11, null, this.i1, false);
                        } else {
                            A(id.I(messageAction7.days, "ActionGiftPremiumTitle2Days"), null, charSequence10, true, L03, 11, null, this.i1, false);
                        }
                    } else if (i16 == 21) {
                        TLRPC.TL_messageActionSuggestProfilePhoto tL_messageActionSuggestProfilePhoto = (TLRPC.TL_messageActionSuggestProfilePhoto) message4.action;
                        TLRPC.User a24 = qp.s1(i11).a2(Long.valueOf(ijVar.P3() ? j12 : ijVar.A0()));
                        boolean z15 = tL_messageActionSuggestProfilePhoto.video || !((photo = tL_messageActionSuggestProfilePhoto.photo) == null || (arrayList2 = photo.video_sizes) == null || arrayList2.isEmpty());
                        if (a24.id == p10.i(i11).n) {
                            TLRPC.User a25 = qp.s1(i11).a2(Long.valueOf(ijVar.A0()));
                            Z = z15 ? id.Z(2131754544, a25.first_name) : id.Z(2131754548, a25.first_name);
                        } else {
                            Z = z15 ? id.Z(2131754542, a24.first_name) : id.Z(2131754546, a24.first_name);
                        }
                        A(null, null, Z, false, (tL_messageActionSuggestProfilePhoto.video || !((arrayList = tL_messageActionSuggestProfilePhoto.photo.video_sizes) == null || arrayList.isEmpty())) ? id.L0(2131743539) : id.L0(2131743547), 11, null, this.i1, true);
                        this.M = null;
                        this.O = 0;
                        this.P = null;
                        this.Q = 0;
                        this.S = 0;
                    } else if (i16 == 22) {
                        TLRPC.User a26 = qp.s1(i11).a2(Long.valueOf(ijVar.P3() ? j12 : ijVar.A0()));
                        if (ijVar.A0() < j12) {
                            charSequence3 = ijVar.v;
                        } else if (!ijVar.P3() && ijVar.Y4() && ijVar.S2()) {
                            charSequence2 = ijVar.v;
                            L0 = id.L0(2131746286);
                            z9 = false;
                            A(null, null, charSequence2, false, L0, 11, null, this.i1, z9);
                            this.M = null;
                            this.O = 0;
                            this.P = null;
                            this.Q = 0;
                            this.S = 0;
                        } else if (a26 == null || a26.id != p10.i(i11).n) {
                            charSequence2 = ijVar.v;
                            L0 = id.L0(2131743538);
                            z9 = true;
                            A(null, null, charSequence2, false, L0, 11, null, this.i1, z9);
                            this.M = null;
                            this.O = 0;
                            this.P = null;
                            this.Q = 0;
                            this.S = 0;
                        } else {
                            charSequence3 = ijVar.v;
                        }
                        charSequence2 = charSequence3;
                        L0 = null;
                        z9 = true;
                        A(null, null, charSequence2, false, L0, 11, null, this.i1, z9);
                        this.M = null;
                        this.O = 0;
                        this.P = null;
                        this.Q = 0;
                        this.S = 0;
                    } else if (ijVar.z4()) {
                        TLRPC.User a27 = qp.s1(i11).a2(Long.valueOf(ijVar.k.media.user_id));
                        A(null, null, a27.self ? org.telegram.messenger.g0.X2(id.Z(2131744439, qp.s1(i11).a2(Long.valueOf(ijVar.A0())).first_name)) : org.telegram.messenger.g0.X2(id.Z(2131744614, a27.first_name)), false, id.L0(2131744615), 11, null, this.i1, true);
                        this.M = null;
                        this.O = 0;
                        this.P = null;
                        this.Q = 0;
                        this.S = 0;
                    }
                }
            }
        }
        int L2 = org.telegram.messenger.g0.L(12.0f);
        ch.p0 p0Var = this.E0;
        p0Var.b = L2;
        p0Var.o(this.V - org.telegram.messenger.g0.L(24.0f), 1);
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.J || super.verifyDrawable(drawable);
    }

    /* JADX WARN: Removed duplicated region for block: B:77:0x0369  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x036c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean w(MotionEvent motionEvent) {
        int i7;
        int i10;
        org.telegram.messenger.o2 o2Var;
        ij ijVar;
        TLRPC.Message message;
        ij ijVar2;
        TLRPC.Message message2;
        TLRPC.Message message3;
        char c10;
        int i11;
        long j3;
        TLObject M0;
        String str;
        Context context;
        boolean z9;
        String a02;
        SpannableStringBuilder X2;
        boolean z10;
        ArrayList arrayList = this.X1;
        if (!arrayList.isEmpty()) {
            int x10 = (int) motionEvent.getX();
            int y10 = (int) motionEvent.getY();
            float width = (getWidth() - this.i1) / 2.0f;
            float f10 = 4.0f;
            float L = org.telegram.messenger.g0.L(4.0f) + org.telegram.messenger.g0.L(4.0f) + this.S + this.O + this.f;
            float L2 = (this.i1 - org.telegram.messenger.g0.L(4.0f)) / 2.0f;
            int action = motionEvent.getAction();
            org.telegram.ui.ActionBar.g6 g6Var = this.g1;
            if (action == 0) {
                this.l2 = -1;
                int i12 = 0;
                while (i12 < arrayList.size()) {
                    c0 c0Var = (c0) arrayList.get(i12);
                    float L3 = ((org.telegram.messenger.g0.L(f10) + L2) * i12) + width;
                    RectF rectF = org.telegram.messenger.g0.P;
                    rectF.set(L3, L, L3 + L2, c0Var.f + L);
                    float f11 = x10;
                    float f12 = y10;
                    if (rectF.contains(f11, f12)) {
                        this.l2 = i12;
                        T();
                        if (c0Var.s == null) {
                            y a03 = org.telegram.ui.ActionBar.l6.a0(org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.bd, g6Var), 6, 6);
                            c0Var.s = a03;
                            a03.setCallback(this);
                        }
                        c0Var.s.setHotspot(f11, f12);
                        c0Var.s.setState(this.k2);
                        c0Var.b(!c0Var.m);
                        return true;
                    }
                    i12++;
                    f10 = 4.0f;
                }
            } else {
                int i13 = 3;
                if (motionEvent.getAction() == 1) {
                    if (this.l2 != -1) {
                        playSoundEffect(0);
                        c0 c0Var2 = (c0) arrayList.get(this.l2);
                        y yVar = c0Var2.s;
                        if (yVar != null) {
                            yVar.setState(StateSet.NOTHING);
                        }
                        c0Var2.b(false);
                        if (this.f1 == null || c0Var2.m || (o2Var = c0Var2.j) == null) {
                            i10 = -1;
                        } else {
                            if (getMessageObject() != null) {
                                int i14 = o2Var.a;
                                if (i14 == 5) {
                                    q0 q0Var = this.f1;
                                    org.telegram.ui.ActionBar.f2 t6 = q0Var != null ? q0Var.t() : null;
                                    if (t6 != null && this.P0 != null) {
                                        org.telegram.ui.Components.v4.s0(t6, id.M0(2131749707, null), org.telegram.messenger.g0.X2(id.a0(null, null, 2131749708, org.telegram.messenger.m5.t(ij.B0(this.P0.k)))), id.M0(2131749709, null), true, new ea(i13, this, t6));
                                    }
                                } else if (i14 == 6) {
                                    ij ijVar3 = this.P0;
                                    if (ijVar3 != null && (message3 = ijVar3.k) != null) {
                                        TLRPC.MessageAction messageAction = message3.action;
                                        if (messageAction instanceof TLRPC.TL_messageActionStarGiftPurchaseOffer) {
                                            TLRPC.TL_messageActionStarGiftPurchaseOffer tL_messageActionStarGiftPurchaseOffer = (TLRPC.TL_messageActionStarGiftPurchaseOffer) messageAction;
                                            org.telegram.ui.ActionBar.f2 Q = LaunchActivity.Q();
                                            Context context2 = getContext();
                                            long B0 = ij.B0(this.P0.k);
                                            int e12 = this.P0.e1();
                                            int[] iArr = bi.a1.p2;
                                            cg.a m10 = cg.a.m(tL_messageActionStarGiftPurchaseOffer.price);
                                            cg.b bVar = m10.a;
                                            int i15 = this.H;
                                            cg.b bVar2 = cg.b.a;
                                            if (bVar == bVar2) {
                                                c10 = 3;
                                                i11 = ((org.telegram.messenger.j0) qp.s1(i15).x7.n.b).c;
                                            } else {
                                                c10 = 3;
                                                i11 = ((org.telegram.messenger.j0) qp.s1(i15).x7.o.b).c;
                                            }
                                            cg.a i16 = cg.a.i((m10.b * i11) / 1000, bVar);
                                            TL_stars.StarGift starGift = tL_messageActionStarGiftPurchaseOffer.gift;
                                            StringBuilder sb2 = new StringBuilder();
                                            sb2.append(starGift.title);
                                            sb2.append(" #");
                                            String m11 = jg.g.m(starGift.num, ',', sb2);
                                            if (B0 >= 0) {
                                                j3 = 0;
                                                M0 = qp.s1(i15).a2(Long.valueOf(B0));
                                            } else {
                                                j3 = 0;
                                                M0 = qp.s1(i15).M0(Long.valueOf(-B0));
                                            }
                                            String d = m10.d();
                                            String d2 = i16.d();
                                            if (bVar == cg.b.b) {
                                                str = m11;
                                                context = context2;
                                                z9 = true;
                                            } else {
                                                str = m11;
                                                context = context2;
                                                z9 = false;
                                            }
                                            LinearLayout f13 = org.telegram.messenger.k5.f(context, 1);
                                            f13.addView(new bi.f6(context, starGift, M0), c8.ha.t(-1, -2, 48, 0, -4, 0, 0));
                                            TextView textView = new TextView(context);
                                            org.telegram.ui.ActionBar.s6.U(textView, org.telegram.ui.ActionBar.l6.j5, g6Var);
                                            textView.setTextSize(1, 16.0f);
                                            if (bVar == bVar2) {
                                                String t10 = org.telegram.messenger.m5.t(B0);
                                                Object[] objArr = new Object[4];
                                                objArr[0] = d;
                                                objArr[1] = t10;
                                                objArr[2] = str;
                                                objArr[c10] = d2;
                                                a02 = id.a0(null, null, 2131749685, objArr);
                                            } else {
                                                String t11 = org.telegram.messenger.m5.t(B0);
                                                Object[] objArr2 = new Object[4];
                                                objArr2[0] = d;
                                                objArr2[1] = t11;
                                                objArr2[2] = str;
                                                objArr2[c10] = d2;
                                                a02 = id.a0(null, null, 2131749684, objArr2);
                                            }
                                            textView.setText(org.telegram.messenger.g0.X2(a02));
                                            f13.addView(textView, c8.ha.t(-1, -2, 48, 24, 4, 24, 4));
                                            FrameLayout frameLayout = new FrameLayout(context);
                                            frameLayout.setClipChildren(false);
                                            frameLayout.setClipToPadding(false);
                                            ux0 ux0Var = new ux0(context, g6Var);
                                            frameLayout.addView(ux0Var, c8.ha.e(-1, -1, qs.E1));
                                            bi.k7.j1(ux0Var, bi.ea.l(starGift.attributes, TL_stars.starGiftAttributeModel.class));
                                            bi.k7.j1(ux0Var, bi.ea.l(starGift.attributes, TL_stars.starGiftAttributeBackdrop.class));
                                            bi.k7.j1(ux0Var, bi.ea.l(starGift.attributes, TL_stars.starGiftAttributePattern.class));
                                            f13.addView(frameLayout, c8.ha.t(-1, -2, 48, 23, 16, 23, 4));
                                            cg.a j10 = cg.a.j(starGift.value_usd_amount / Math.pow(10.0d, org.telegram.messenger.r1.i().h("USD")), bVar);
                                            if (j10.c() > 0.0d && starGift.value_usd_amount > j3) {
                                                if (j10.b >= i16.b) {
                                                    int round = (int) Math.round((1.0d - (i16.c() / j10.c())) * 100.0d);
                                                    X2 = org.telegram.messenger.g0.X2(id.a0(null, null, 2131749734, com.google.android.recaptcha.internal.a.i(round, "%"), starGift.title));
                                                    if (round > 10) {
                                                        z10 = true;
                                                        TextView textView2 = new TextView(context);
                                                        textView2.setTextSize(1, 13.0f);
                                                        textView2.setGravity(17);
                                                        textView2.setText(X2);
                                                        org.telegram.ui.ActionBar.s6.U(textView2, !z10 ? org.telegram.ui.ActionBar.l6.p7 : org.telegram.ui.ActionBar.l6.y6, g6Var);
                                                        f13.addView(textView2, c8.ha.t(-1, -2, 49, 40, 12, 40, 9));
                                                    }
                                                } else {
                                                    X2 = org.telegram.messenger.g0.X2(id.a0(null, null, 2131749737, com.google.android.recaptcha.internal.a.i((int) Math.round(((i16.c() / j10.c()) - 1.0d) * 100.0d), "%"), starGift.title));
                                                }
                                                z10 = false;
                                                TextView textView22 = new TextView(context);
                                                textView22.setTextSize(1, 13.0f);
                                                textView22.setGravity(17);
                                                textView22.setText(X2);
                                                org.telegram.ui.ActionBar.s6.U(textView22, !z10 ? org.telegram.ui.ActionBar.l6.p7 : org.telegram.ui.ActionBar.l6.y6, g6Var);
                                                f13.addView(textView22, c8.ha.t(-1, -2, 49, 40, 12, 40, 9));
                                            }
                                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, g6Var);
                                            alertDialog$Builder.o(f13);
                                            alertDialog$Builder.k(dd.V0(id.a0(null, null, 2131749702, d2), z9), new bi.r0(e12, i15, Q));
                                            alertDialog$Builder.h(id.M0(2131752589, null), null);
                                            alertDialog$Builder.a.show();
                                        }
                                    }
                                } else {
                                    if (i14 == 7) {
                                        q0 q0Var2 = this.f1;
                                        org.telegram.ui.ActionBar.f2 t12 = q0Var2 != null ? q0Var2.t() : null;
                                        if (t12 != null && (ijVar2 = this.P0) != null && (message2 = ijVar2.k) != null) {
                                            TLRPC.MessageAction messageAction2 = message2.action;
                                            if (messageAction2 instanceof TLRPC.TL_messageActionNoForwardsRequest) {
                                                final TLRPC.TL_messageActionNoForwardsRequest tL_messageActionNoForwardsRequest = (TLRPC.TL_messageActionNoForwardsRequest) messageAction2;
                                                final int i17 = 0;
                                                org.telegram.ui.Components.v4.s0(t12, id.M0(tL_messageActionNoForwardsRequest.prev_value ? 2131745385 : 2131745374, null), id.M0(tL_messageActionNoForwardsRequest.prev_value ? 2131745386 : 2131745375, null), id.M0(2131745391, null), false, new Runnable(this) { // from class: org.telegram.ui.Cells.n0
                                                    public final /* synthetic */ t0 b;

                                                    {
                                                        this.b = this;
                                                    }

                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        switch (i17) {
                                                            case 0:
                                                                t0 t0Var = this.b;
                                                                qp.s1(t0Var.H).d5(ij.B0(t0Var.P0.k), t0Var.P0.e1(), tL_messageActionNoForwardsRequest.prev_value, null);
                                                                break;
                                                            default:
                                                                t0 t0Var2 = this.b;
                                                                qp.s1(t0Var2.H).d5(ij.B0(t0Var2.P0.k), t0Var2.P0.e1(), tL_messageActionNoForwardsRequest.new_value, null);
                                                                break;
                                                        }
                                                    }
                                                });
                                            }
                                        }
                                    } else if (i14 == 8) {
                                        q0 q0Var3 = this.f1;
                                        org.telegram.ui.ActionBar.f2 t13 = q0Var3 != null ? q0Var3.t() : null;
                                        if (t13 != null && (ijVar = this.P0) != null && (message = ijVar.k) != null) {
                                            TLRPC.MessageAction messageAction3 = message.action;
                                            if (messageAction3 instanceof TLRPC.TL_messageActionNoForwardsRequest) {
                                                final TLRPC.TL_messageActionNoForwardsRequest tL_messageActionNoForwardsRequest2 = (TLRPC.TL_messageActionNoForwardsRequest) messageAction3;
                                                final int i18 = 1;
                                                org.telegram.ui.Components.v4.s0(t13, id.M0(tL_messageActionNoForwardsRequest2.new_value ? 2131745385 : 2131745374, null), id.M0(tL_messageActionNoForwardsRequest2.new_value ? 2131745384 : 2131745373, null), id.M0(2131745391, null), false, new Runnable(this) { // from class: org.telegram.ui.Cells.n0
                                                    public final /* synthetic */ t0 b;

                                                    {
                                                        this.b = this;
                                                    }

                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        switch (i18) {
                                                            case 0:
                                                                t0 t0Var = this.b;
                                                                qp.s1(t0Var.H).d5(ij.B0(t0Var.P0.k), t0Var.P0.e1(), tL_messageActionNoForwardsRequest2.prev_value, null);
                                                                break;
                                                            default:
                                                                t0 t0Var2 = this.b;
                                                                qp.s1(t0Var2.H).d5(ij.B0(t0Var2.P0.k), t0Var2.P0.e1(), tL_messageActionNoForwardsRequest2.new_value, null);
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
                        this.l2 = i10;
                        T();
                        return false;
                    }
                } else if (motionEvent.getAction() == 3 && (i7 = this.l2) != -1) {
                    c0 c0Var3 = (c0) arrayList.get(i7);
                    y yVar2 = c0Var3.s;
                    if (yVar2 != null) {
                        yVar2.setState(StateSet.NOTHING);
                    }
                    c0Var3.b(false);
                    this.l2 = -1;
                    T();
                    return false;
                }
            }
        }
        return false;
    }

    public final void x() {
        float f10 = this.a1;
        RectF rectF = this.c1;
        this.a1 = (int) Math.min(f10, rectF.left);
        this.b1 = (int) Math.max(this.b1, rectF.right);
    }

    public final boolean y(float f10, int i7) {
        ch.p0 p0Var = this.E0;
        if (!p0Var.H) {
            return false;
        }
        float y10 = getY() + p0Var.c;
        return y10 > f10 && (y10 + ((float) p0Var.m)) - ((float) org.telegram.messenger.g0.L(16.0f)) < ((float) i7);
    }

    public final void z() {
        SpannableStringBuilder spannableStringBuilder;
        int L = this.i1 - org.telegram.messenger.g0.L(16.0f);
        float L2 = org.telegram.messenger.g0.L(14.0f);
        TextPaint textPaint = this.E1;
        textPaint.setTextSize(L2);
        float L3 = org.telegram.messenger.g0.L(13.0f);
        TextPaint textPaint2 = this.F1;
        textPaint2.setTextSize(L3);
        TLRPC.TL_messageActionGiftCode tL_messageActionGiftCode = (TLRPC.TL_messageActionGiftCode) this.P0.k.action;
        int i7 = tL_messageActionGiftCode.months;
        TLRPC.Chat M0 = qp.s1(this.H).M0(Long.valueOf(-org.telegram.messenger.m5.o(tL_messageActionGiftCode.boost_peer)));
        String str = M0 == null ? null : M0.title;
        boolean z9 = tL_messageActionGiftCode.via_giveaway;
        String M02 = tL_messageActionGiftCode.unclaimed ? id.M0(2131753176, "BoostingUnclaimedPrize") : id.M0(2131753542, "BoostingCongratulations");
        String G = i7 == 12 ? id.G(1, "BoldYears", new Object[0]) : id.G(i7, "BoldMonths", new Object[0]);
        if (!z9) {
            spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.g0.X2(str == null ? id.M0(2131753310, null) : id.a0("BoostingReceivedGiftFrom", null, 2131753311, str)));
            spannableStringBuilder.append((CharSequence) "\n\n");
            org.telegram.messenger.k5.q(null, null, 2131753312, new Object[]{G}, spannableStringBuilder);
        } else if (tL_messageActionGiftCode.unclaimed) {
            spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.g0.X2(id.a0(null, null, 2131753166, str)));
            spannableStringBuilder.append((CharSequence) "\n\n");
            org.telegram.messenger.k5.q(null, null, 2131753175, new Object[]{G}, spannableStringBuilder);
        } else {
            spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.g0.X2(id.a0(null, null, 2131753307, str)));
            spannableStringBuilder.append((CharSequence) "\n\n");
            org.telegram.messenger.k5.q(null, null, 2131753308, new Object[]{G}, spannableStringBuilder);
        }
        String M03 = id.M0(2131753309, "BoostingReceivedGiftOpenBtn");
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(M02);
        valueOf.setSpan(new v31(org.telegram.messenger.g0.o()), 0, valueOf.length(), 33);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        this.j1 = new StaticLayout(valueOf, textPaint, L, alignment, 1.1f, 0.0f, false);
        this.m1 = null;
        this.l1 = null;
        r0 r0Var = this.s1;
        if (r0Var != null) {
            org.telegram.ui.Components.r5.release((t0) r0Var.i, (org.telegram.ui.Components.n5) r0Var.h);
        }
        r0 r0Var2 = new r0(this);
        this.s1 = r0Var2;
        r0Var2.a(spannableStringBuilder, textPaint2, L);
        SpannableStringBuilder valueOf2 = SpannableStringBuilder.valueOf(M03);
        valueOf2.setSpan(new v31(org.telegram.messenger.g0.o()), 0, valueOf2.length(), 33);
        this.o1 = false;
        this.p1 = 0;
        this.w1 = null;
        StaticLayout staticLayout = new StaticLayout(valueOf2, (TextPaint) N("paintChatActionText"), L, alignment, 1.0f, 0.0f, false);
        this.x1 = staticLayout;
        this.y1 = true;
        this.D1 = Z(staticLayout);
    }

    public t0(Context context, org.telegram.ui.ActionBar.g6 g6Var, boolean z9) {
        super(context);
        this.n = new ic(this);
        int i7 = p10.s0;
        this.H = i7;
        di.o7 o7Var = new di.o7(null, false);
        this.d0 = o7Var;
        this.m0 = true;
        this.o0 = new RectF();
        this.p0 = new ArrayList();
        this.q0 = new Stack();
        this.E0 = new ch.p0(this);
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
        this.q1 = new org.telegram.ui.Components.w5(this, 0L, 320L, xq.h);
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
        this.r2 = new s0(this);
        o7Var.a = false;
        this.s = z9;
        this.g1 = g6Var;
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.I = imageReceiver;
        imageReceiver.J0(org.telegram.messenger.g0.u / 2);
        this.L = new org.telegram.ui.Components.w8((org.telegram.ui.ActionBar.g6) null);
        this.x = org.telegram.messenger.z5.q(i7).k();
        textPaint.setTextSize(TypedValue.applyDimension(1, 16.0f, getResources().getDisplayMetrics()));
        textPaint3.setTextSize(TypedValue.applyDimension(1, 15.0f, getResources().getDisplayMetrics()));
        textPaint2.setTextSize(TypedValue.applyDimension(1, 15.0f, getResources().getDisplayMetrics()));
        View view = new View(context);
        this.T1 = view;
        view.setBackground(org.telegram.ui.ActionBar.l6.h0(org.telegram.ui.ActionBar.l6.r1(0.1f, -16777216), 7, org.telegram.messenger.g0.L(16.0f)));
        view.setVisibility(8);
        addView(view);
        ug.p1 p1Var = new ug.p1(10);
        this.V1 = p1Var;
        p1Var.O = 100;
        p1Var.J = false;
        p1Var.M = true;
        p1Var.G = false;
        p1Var.K = true;
        p1Var.H = true;
        p1Var.r = 1;
        p1Var.w = 0.98f;
        p1Var.v = 0.98f;
        p1Var.u = 0.98f;
        p1Var.g = false;
        p1Var.o = 0.0f;
        p1Var.x = 750L;
        p1Var.y = 750;
        p1Var.c();
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
    public final void invalidate(int i7, int i10, int i11, int i12) {
        super.invalidate(i7, i10, i11, i12);
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

    @Override // org.telegram.messenger.x5
    public final void C(boolean z9) {
    }

    @Override // org.telegram.ui.Cells.p4
    public final /* synthetic */ void c(boolean z9, boolean z10) {
    }

    @Override // org.telegram.messenger.x5
    public final void i(long j3, long j10) {
    }

    @Override // org.telegram.messenger.x5
    public final void o(long j3, long j10) {
    }
}
