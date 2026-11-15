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
import c8.zc;
import di.cb;
import di.mb;
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
import org.telegram.messenger.gc;
import org.telegram.messenger.gj;
import org.telegram.messenger.gz;
import org.telegram.messenger.hd;
import org.telegram.messenger.i20;
import org.telegram.messenger.is;
import org.telegram.messenger.lj;
import org.telegram.messenger.m10;
import org.telegram.messenger.np;
import org.telegram.messenger.ns;
import org.telegram.messenger.pz;
import org.telegram.messenger.q10;
import org.telegram.messenger.qc;
import org.telegram.messenger.si;
import org.telegram.messenger.vr;
import org.telegram.messenger.yi;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.RadialProgress2;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.ch0;
import org.telegram.ui.Components.d80;
import org.telegram.ui.Components.dc;
import org.telegram.ui.Components.eq;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.i01;
import org.telegram.ui.Components.m30;
import org.telegram.ui.Components.mw0;
import org.telegram.ui.Components.oy0;
import org.telegram.ui.Components.uj0;
import org.telegram.ui.Components.vx0;
import org.telegram.ui.Components.y31;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.dn;
import org.telegram.ui.g71;
import org.telegram.ui.ij;
import org.telegram.ui.lb;
import org.telegram.ui.ol;
import org.telegram.ui.pf;
import org.telegram.ui.tw0;
import org.telegram.ui.uf;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public class t0 extends z implements org.telegram.messenger.x5, is, p4 {
    public static final HashMap t2;
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
    public di.e6 I0;
    public TLRPC.Document I1;
    public final ImageReceiver J;
    public org.telegram.ui.Wallet.c4 J0;
    public TLRPC.VideoSize J1;
    public Drawable K;
    public boolean K0;
    public final RadialProgress2 K1;
    public Path L;
    public float L0;
    public int L1;
    public final org.telegram.ui.Components.t8 M;
    public float M0;
    public boolean M1;
    public StaticLayout N;
    public float N0;
    public RectF N1;
    public int O;
    public final RectF O0;
    public final ca O1;
    public int P;
    public mw0 P0;
    public boolean P1;
    public StaticLayout Q;
    public gj Q0;
    public ColorMatrixColorFilter Q1;
    public int R;
    public int R0;
    public CornerPathEffect R1;
    public int S;
    public CharSequence S0;
    public Path S1;
    public int T;
    public bi.e2 T0;
    public oy0 T1;
    public int U;
    public int U0;
    public final View U1;
    public int V;
    public int V0;
    public final Path V1;
    public int W;
    public Paint W0;
    public final ug.r1 W1;
    public TextPaint X0;
    public int X1;
    public final ArrayList Y0;
    public final ArrayList Y1;
    public final ArrayList Z0;
    public f5.v Z1;
    public boolean a0;
    public final Path a1;
    public boolean a2;
    public boolean b0;
    public int b1;
    public int b2;
    public RadialProgressView c0;
    public int c1;
    public float c2;
    public float d0;
    public final RectF d1;
    public final Paint d2;
    public final fi.h7 e0;
    public boolean e1;
    public boolean e2;
    public int f;
    public boolean f0;
    public boolean f1;
    public View.OnClickListener f2;
    public boolean g0;
    public q0 g1;
    public int g2;
    public int h;
    public boolean h0;
    public final org.telegram.ui.ActionBar.e6 h1;
    public final Path h2;
    public boolean i0;
    public int i1;
    public final float[] i2;
    public boolean j0;
    public int j1;
    public final float[] j2;
    public int k0;
    public StaticLayout k1;
    public final Path k2;
    public boolean l0;
    public Paint l1;
    public final int[] l2;
    public int m0;
    public oy0 m1;
    public int m2;
    public final dc n;
    public boolean n0;
    public StaticLayout n1;
    public SpannableStringBuilder n2;
    public i01 o0;
    public boolean o1;
    public boolean o2;
    public final RectF p0;
    public boolean p1;
    public Runnable p2;
    public final ArrayList q0;
    public int q1;
    public PorterDuffColorFilter q2;
    public d80 r;
    public final Stack r0;
    public final org.telegram.ui.Components.u5 r1;
    public int r2;
    public final boolean s;
    public org.telegram.ui.Components.l5 s0;
    public h6.m s1;
    public final s0 s2;
    public TextPaint t0;
    public r0 t1;
    public float u0;
    public int u1;
    public float v0;
    public int v1;
    public View w;
    public int w0;
    public int w1;
    public final int x;
    public boolean x0;
    public oy0 x1;
    public URLSpan y;
    public gc y0;
    public StaticLayout y1;
    public float z0;
    public boolean z1;

    static {
        HashMap hashMap = new HashMap();
        t2 = hashMap;
        i5.c.s(1, hashMap, "1⃣", 3, "2⃣");
        i5.c.s(6, hashMap, "3⃣", 12, "4⃣");
        hashMap.put(24, "5⃣");
    }

    public t0(Context context) {
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

    public static float b0(StaticLayout staticLayout) {
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
        ug.r1 r1Var = this.W1;
        if (z10 == r1Var.g) {
            return;
        }
        r1Var.g = z10;
        if (z10) {
            r1Var.R = System.currentTimeMillis();
            return;
        }
        for (int i7 = 0; i7 < r1Var.n.size(); i7++) {
            ug.q1 q1Var = (ug.q1) r1Var.n.get(i7);
            q1Var.a = (System.currentTimeMillis() - r1Var.R) + q1Var.a;
        }
        invalidate();
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
        gj gjVar = this.Q0;
        if (gjVar != null && gjVar.D == 30) {
            L -= org.telegram.messenger.g0.L(16.0f);
        }
        int i12 = L;
        if (charSequence != null) {
            gj gjVar2 = this.Q0;
            TextPaint textPaint = this.F1;
            if (gjVar2 == null || gjVar2.D != 30) {
                textPaint.setTextSize(org.telegram.messenger.g0.L(16.0f));
            } else {
                textPaint.setTextSize(org.telegram.messenger.g0.L(14.0f));
            }
            SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(charSequence);
            valueOf.setSpan(new y31(org.telegram.messenger.g0.o()), 0, valueOf.length(), 33);
            r42 = 0;
            this.k1 = new StaticLayout(valueOf, textPaint, i12, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
        } else {
            r42 = 0;
            this.k1 = null;
        }
        this.n1 = null;
        if (spannableStringBuilder != null) {
            oy0 oy0Var = new oy0(spannableStringBuilder, 10.0f, null);
            this.m1 = oy0Var;
            oy0Var.a.linkColor = -1;
        } else {
            this.m1 = null;
        }
        gj gjVar3 = this.Q0;
        TextPaint textPaint2 = this.G1;
        if (gjVar3 != null && gjVar3.D == 35) {
            textPaint2.setTextSize(org.telegram.messenger.g0.L(14.3f));
        } else if (gjVar3 == null || !(Z() || (i11 = this.Q0.D) == 30 || i11 == 18 || i11 == 31 || i11 == 37 || i11 == 33)) {
            textPaint2.setTextSize(org.telegram.messenger.g0.L(15.0f));
        } else {
            textPaint2.setTextSize(org.telegram.messenger.g0.L(13.0f));
        }
        int L2 = i12 - org.telegram.messenger.g0.L(12.0f);
        gj gjVar4 = this.Q0;
        if (gjVar4 != null && gjVar4.D == 22 && gj.B0(gjVar4.k) >= 0 && (a10 = hi.l3.a(charSequence4, textPaint2)) < L2 && a10 > L2 / 5.0f) {
            L2 = a10;
        }
        if (charSequence4 == 0) {
            r0 r0Var = this.t1;
            if (r0Var != null) {
                org.telegram.ui.Components.p5.release((t0) r0Var.i, (org.telegram.ui.Components.l5) r0Var.h);
                this.t1 = null;
            }
            this.p1 = r42;
        } else {
            if (this.t1 == null) {
                this.t1 = new r0(this);
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
                this.x1 = new oy0(hd.M0(2131750265, null), textPaint2.getTextSize() / org.telegram.messenger.g0.p, org.telegram.messenger.g0.o());
                int lineBottom = ((StaticLayout) this.t1.f).getLineBottom(2);
                this.v1 = lineBottom;
                this.w1 = lineBottom - ((StaticLayout) this.t1.f).getLineTop(2);
                this.u1 = (int) ((StaticLayout) this.t1.f).getLineRight(2);
            }
            if (this.p1) {
                int lineEnd = ((StaticLayout) this.t1.f).getLineEnd(2) - 1;
                r0 r0Var2 = this.t1;
                CharSequence charSequence5 = charSequence4;
                if (lineEnd >= 0) {
                    charSequence5 = charSequence4.subSequence(r42, lineEnd);
                }
                r0Var2.a(charSequence5, textPaint2, L2);
            }
        }
        if (charSequence3 != null) {
            SpannableStringBuilder valueOf2 = SpannableStringBuilder.valueOf(charSequence3);
            valueOf2.setSpan(new y31(org.telegram.messenger.g0.o()), r42, valueOf2.length(), 33);
            StaticLayout staticLayout = new StaticLayout(valueOf2, (TextPaint) R("paintChatActionText"), i12, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
            this.y1 = staticLayout;
            this.z1 = (!z11 || this.p1) ? r42 : true;
            this.E1 = b0(staticLayout);
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
            bi.l2.d(path, 1.35f, r42);
        }
        oy0 oy0Var2 = new oy0(str, i7, org.telegram.messenger.g0.o());
        this.T1 = oy0Var2;
        oy0Var2.p = org.telegram.messenger.g0.L(62.0f);
    }

    public final void D(int i7, CharSequence charSequence) {
        CharSequence charSequence2;
        q0 q0Var;
        TLRPC.Message message;
        gj gjVar;
        int i10;
        int L = i7 - org.telegram.messenger.g0.L(30.0f);
        if (this.j0) {
            L -= org.telegram.messenger.g0.L(64.0f);
        }
        if (Y()) {
            L = Math.min(L - org.telegram.messenger.g0.L(this.j0 ? 28.0f : 82.0f), org.telegram.messenger.g0.L(272.0f));
        }
        if (L < 0) {
            return;
        }
        int i11 = this.g2;
        if (i11 > 0) {
            L = Math.min(i11, L);
        }
        int i12 = L;
        this.e1 = true;
        TextPaint textPaint = (Y() || ((gjVar = this.Q0) != null && ((i10 = gjVar.D) == 34 || i10 == 35))) ? (TextPaint) R("paintChatActionText3") : (gjVar == null || !gjVar.s2) ? (TextPaint) R("paintChatActionText") : (TextPaint) R("paintChatActionText2");
        textPaint.linkColor = textPaint.getColor();
        if (Y()) {
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
        this.N = new StaticLayout(charSequence2, textPaint2, i12, Y() ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
        this.Q = null;
        gj gjVar2 = this.Q0;
        if (gjVar2 != null && (message = gjVar2.k) != null) {
            TLRPC.MessageAction messageAction = message.action;
            if (messageAction instanceof TLRPC.TL_messageActionSuggestedPostApproval) {
                TLRPC.TL_messageActionSuggestedPostApproval tL_messageActionSuggestedPostApproval = (TLRPC.TL_messageActionSuggestedPostApproval) messageAction;
                if (!tL_messageActionSuggestedPostApproval.rejected && !tL_messageActionSuggestedPostApproval.balance_too_low) {
                    this.Q = new StaticLayout(org.telegram.messenger.j6.n(org.telegram.messenger.g0.X2(hd.M0(2131744366, null)), textPaint2.getFontMetricsInt(), false, null, 0, 1.0f, 0), textPaint2, i12, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                }
            }
        }
        this.s0 = org.telegram.ui.Components.p5.update(0, this, (!this.s || (q0Var = this.g1) == null || q0Var.g()) ? false : true, this.s0, this.N);
        this.P = 0;
        this.O = 0;
        this.R = 0;
        StaticLayout staticLayout = this.Q;
        if (staticLayout != null) {
            int height = staticLayout.getHeight();
            this.R = height;
            this.R = org.telegram.messenger.g0.L(12.0f) + height;
        }
        gj gjVar3 = this.Q0;
        if (gjVar3 == null || !gjVar3.j2) {
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
            this.T = org.telegram.messenger.k5.C(11.0f, this.R, L2);
        }
        this.U = (i7 - (Y() ? this.O : this.N.getWidth())) / 2;
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

    public final void H(Canvas canvas, boolean z10) {
        Paint paint;
        Paint paint2;
        org.telegram.ui.ActionBar.e6 e6Var;
        float f10;
        float f11;
        float f12;
        float f13;
        t0 t0Var;
        org.telegram.ui.ActionBar.e6 e6Var2;
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
        org.telegram.ui.ActionBar.e6 e6Var3;
        int i15;
        t0 t0Var2 = this;
        if (!t0Var2.s || ((!t0Var2.T() || z10) && (t0Var2.T() || !z10))) {
            Paint R = t0Var2.R("paintChatActionBackground");
            Paint R2 = t0Var2.R("paintChatActionBackgroundDarken");
            t0Var2.t0 = (TextPaint) t0Var2.R("paintChatActionText");
            int i16 = t0Var2.U0;
            org.telegram.ui.ActionBar.e6 e6Var4 = t0Var2.h1;
            if (i16 >= 0) {
                int w02 = org.telegram.ui.ActionBar.j6.w0(i16, e6Var4);
                if (t0Var2.W0 == null) {
                    Paint paint6 = new Paint(1);
                    t0Var2.W0 = paint6;
                    paint6.setColor(w02);
                    TextPaint textPaint = new TextPaint(1);
                    t0Var2.X0 = textPaint;
                    textPaint.setTypeface(org.telegram.messenger.g0.o());
                    t0Var2.X0.setTextSize(org.telegram.messenger.g0.L(Math.max(16, gz.W0) - 2));
                    t0Var2.X0.setColor(org.telegram.ui.ActionBar.j6.w0(t0Var2.V0, e6Var4));
                }
                R = t0Var2.W0;
                t0Var2.t0 = t0Var2.X0;
            }
            boolean z11 = t0Var2.e1;
            Path path = t0Var2.a1;
            if (z11) {
                t0Var2.e1 = false;
                t0Var2.b1 = t0Var2.getWidth();
                t0Var2.c1 = 0;
                ArrayList arrayList3 = t0Var2.Y0;
                arrayList3.clear();
                StaticLayout staticLayout = t0Var2.N;
                int lineCount = staticLayout == null ? 0 : staticLayout.getLineCount();
                int L2 = org.telegram.messenger.g0.L(11.0f);
                f11 = 6.0f;
                int L3 = org.telegram.messenger.g0.L(8.0f);
                f10 = 8.0f;
                int i17 = 0;
                int i18 = 0;
                while (i17 < lineCount) {
                    int ceil = (int) Math.ceil(t0Var2.N.getLineWidth(i17));
                    if (i17 != 0 && (i15 = i18 - ceil) > 0 && i15 <= (L2 * 1.5f) + L3) {
                        ceil = i18;
                    }
                    i17 = com.google.android.gms.internal.vision.e2.f(ceil, i17, 1, arrayList3);
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
                ArrayList arrayList4 = t0Var2.Z0;
                arrayList4.clear();
                path.reset();
                float f19 = measuredWidth;
                path.moveTo(f19, L4);
                int i22 = i18;
                int i23 = 0;
                int i24 = 0;
                while (true) {
                    rectF = t0Var2.d1;
                    if (i24 >= lineCount) {
                        break;
                    }
                    int i25 = lineCount;
                    int intValue2 = ((Integer) arrayList3.get(i24)).intValue();
                    int lineBottom = t0Var2.N.getLineBottom(i24);
                    int i26 = i25 - 1;
                    if (i24 < i26) {
                        paint5 = R2;
                        i14 = ((Integer) arrayList3.get(i24 + 1)).intValue();
                    } else {
                        paint5 = R2;
                        i14 = 0;
                    }
                    int i27 = lineBottom - i23;
                    if (i24 == 0 || intValue2 > i22) {
                        i27 = org.telegram.messenger.g0.L(3.0f) + i27;
                    }
                    if (i24 == i26 || intValue2 > i14) {
                        i27 = org.telegram.messenger.g0.L(3.0f) + i27;
                    }
                    Paint paint7 = R;
                    float f20 = (intValue2 / 2.0f) + f19;
                    int i28 = (i24 == i26 || intValue2 >= i14 || i24 == 0 || intValue2 >= i22) ? L3 : L6;
                    if (i24 == 0 || intValue2 > i22) {
                        f18 = f20;
                        arrayList2 = arrayList3;
                        e6Var3 = e6Var4;
                        rectF.set((f18 - L5) - L2, L4, f18 + i21, (L2 * 2) + L4);
                        x();
                        path.arcTo(rectF, -90.0f, 90.0f);
                    } else {
                        f18 = f20;
                        if (intValue2 < i22) {
                            float f21 = f18 + i21;
                            e6Var3 = e6Var4;
                            arrayList2 = arrayList3;
                            rectF.set(f21, L4, (i28 * 2) + f21, r0 + L4);
                            x();
                            path.arcTo(rectF, -90.0f, -90.0f);
                        } else {
                            arrayList2 = arrayList3;
                            e6Var3 = e6Var4;
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
                    R2 = paint5;
                    R = paint7;
                    e6Var4 = e6Var3;
                    arrayList3 = arrayList2;
                }
                paint = R;
                paint2 = R2;
                ArrayList arrayList5 = arrayList3;
                e6Var = e6Var4;
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
                    this.N.getLineBottom(i30);
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
                if (t0Var.Y() && !t0Var.Z()) {
                    rectF.left = (f19 - (t0Var.O / 2.0f)) - org.telegram.messenger.g0.L(17.0f);
                    rectF.top = L4;
                    rectF.right = (t0Var.O / 2.0f) + f19 + org.telegram.messenger.g0.L(17.0f);
                    rectF.bottom = org.telegram.messenger.g0.L(28.0f) + L4 + t0Var.P + t0Var.R;
                    path.reset();
                    path.addRoundRect(rectF, org.telegram.messenger.g0.L(15.0f), org.telegram.messenger.g0.L(15.0f), Path.Direction.CW);
                    path.close();
                }
            } else {
                paint = R;
                paint2 = R2;
                e6Var = e6Var4;
                f10 = 8.0f;
                f11 = 6.0f;
                f12 = 4.0f;
                f13 = 2.0f;
                t0Var = t0Var2;
            }
            if (!t0Var.x0) {
                t0Var.w0 = ((ViewGroup) t0Var.getParent()).getMeasuredHeight();
            }
            if (e6Var != null) {
                e6Var2 = e6Var;
                e6Var2.b(t0Var.v0, t0Var.u0 + org.telegram.messenger.g0.L(f12), t0Var.getMeasuredWidth(), t0Var.w0);
            } else {
                e6Var2 = e6Var;
                org.telegram.ui.ActionBar.j6.r(t0Var.v0, t0Var.u0 + org.telegram.messenger.g0.L(f12), t0Var.getMeasuredWidth(), t0Var.w0);
            }
            boolean z12 = t0Var instanceof ij;
            float f26 = (!z12 || org.telegram.ui.ActionBar.j6.i1(e6Var2)) ? 1.0f : 0.75f;
            if (!z10 || (t0Var.getAlpha() == 1.0f && !z12)) {
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
                paint4.setAlpha((int) (t0Var.getAlpha() * i7 * f26));
                paint3 = paint2;
                paint3.setAlpha((int) (t0Var.getAlpha() * i10 * f26));
            }
            gj gjVar = t0Var.Q0;
            Paint paint8 = t0Var.d2;
            if (gjVar == null || !gjVar.j2) {
                canvas2 = canvas;
                canvas2.drawPath(path, paint4);
                if (t0Var.T() && paint3.getAlpha() > 0) {
                    canvas2.drawPath(path, paint3);
                }
                if (t0Var.c2 > 0.0f) {
                    int alpha = paint8.getAlpha();
                    if (z10) {
                        paint8.setAlpha((int) (t0Var.getAlpha() * alpha));
                    }
                    canvas2.drawPath(path, paint8);
                    paint8.setAlpha(alpha);
                }
            } else {
                canvas2 = canvas;
            }
            if (t0Var.V()) {
                int width = t0Var.getWidth();
                t0Var.J0.getClass();
                float L7 = (width - org.telegram.messenger.g0.L(206.0f)) / f13;
                float walletActionTop = t0Var.getWalletActionTop();
                t0Var.J0.getClass();
                float L8 = org.telegram.messenger.g0.L(206.0f) + L7;
                if (t0Var.J0.q0 == null) {
                    L = org.telegram.messenger.g0.L(140.0f);
                    f14 = 140.0f;
                    f15 = 20.0f;
                } else {
                    f14 = 140.0f;
                    f15 = 20.0f;
                    L = org.telegram.messenger.g0.L(150.0f) + ((int) Math.ceil(r13.q0.i()));
                }
                RectF rectF2 = t0Var.O0;
                rectF2.set(L7, walletActionTop, L8, L + walletActionTop);
                canvas2.save();
                t0Var.J0.c(canvas2, L7, walletActionTop);
                canvas2.drawRoundRect(rectF2, org.telegram.messenger.g0.L(f15), org.telegram.messenger.g0.L(f15), paint4);
                if (t0Var.T() && paint3.getAlpha() > 0) {
                    canvas2.drawRoundRect(rectF2, org.telegram.messenger.g0.L(f15), org.telegram.messenger.g0.L(f15), paint3);
                }
                f16 = 0.0f;
                if (t0Var.c2 > 0.0f) {
                    int alpha2 = paint8.getAlpha();
                    if (z10) {
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
            gj gjVar2 = t0Var.Q0;
            if (t0Var.U()) {
                float L9 = t0Var.I0.T.f + org.telegram.messenger.g0.L(f10);
                float width2 = (t0Var.getWidth() - L9) / f13;
                float L10 = t0Var.I0.p ? f16 : org.telegram.messenger.g0.L(12.0f) + t0Var.T + t0Var.P;
                RectF rectF3 = org.telegram.messenger.g0.P;
                rectF3.set(width2, L10, L9 + width2, t0Var.I0.P + L10 + org.telegram.messenger.g0.L(f10));
                if (t0Var.N1 == null) {
                    t0Var.N1 = new RectF();
                }
                t0Var.N1.set(rectF3);
                canvas2.drawRoundRect(t0Var.N1, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), paint4);
                if (t0Var.T()) {
                    canvas2.drawRoundRect(t0Var.N1, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), paint3);
                }
            } else if (t0Var.P0 != null) {
                float L11 = org.telegram.messenger.g0.L(174.0f);
                mw0 mw0Var = t0Var.P0;
                mw0Var.getClass();
                float L12 = org.telegram.messenger.g0.L(f14) + ((int) mw0Var.f.i()) + (mw0Var.i ? org.telegram.messenger.g0.L(40.0f) : 0);
                float width3 = (t0Var.getWidth() - L11) / f13;
                if (t0Var.N1 == null) {
                    t0Var.N1 = new RectF();
                }
                t0Var.N1.set(width3, org.telegram.messenger.g0.L(f12), L11 + width3, org.telegram.messenger.g0.L(f12) + L12);
                canvas2.drawRoundRect(t0Var.N1, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), paint4);
                if (t0Var.T()) {
                    canvas2.drawRoundRect(t0Var.N1, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), paint3);
                }
            } else if (t0Var.X(gjVar2)) {
                float width4 = (t0Var.getWidth() - t0Var.j1) / f13;
                float f27 = t0Var.T + t0Var.P;
                if (t0Var.Z()) {
                    float L13 = f27 + org.telegram.messenger.g0.L(f12);
                    org.telegram.messenger.g0.P.set(width4, L13, t0Var.j1 + width4, t0Var.f + L13);
                } else {
                    float L14 = f27 + org.telegram.messenger.g0.L(12.0f);
                    RectF rectF4 = org.telegram.messenger.g0.P;
                    float f28 = t0Var.j1;
                    rectF4.set(width4, L14, width4 + f28, f28 + L14 + t0Var.L1);
                }
                if (gjVar2 != null && gjVar2.D == 18 && !t0Var.p1 && (r0Var = t0Var.t1) != null && t0Var.q1 > 0) {
                    RectF rectF5 = org.telegram.messenger.g0.P;
                    rectF5.bottom = com.google.android.gms.internal.vision.e2.t(1.0f, t0Var.r1.c, ((StaticLayout) r0Var.f).getHeight() - t0Var.q1, rectF5.bottom);
                }
                if (t0Var.N1 == null) {
                    t0Var.N1 = new RectF();
                }
                t0Var.N1.set(org.telegram.messenger.g0.P);
                if (gjVar2 == null || (!((i11 = gjVar2.D) == 33 || i11 == 35) || t0Var.Z1 == null)) {
                    canvas2.drawRoundRect(t0Var.N1, org.telegram.messenger.g0.L(f15), org.telegram.messenger.g0.L(f15), paint4);
                    if (t0Var.T()) {
                        canvas2.drawRoundRect(t0Var.N1, org.telegram.messenger.g0.L(f15), org.telegram.messenger.g0.L(f15), paint3);
                    }
                } else {
                    float L15 = org.telegram.messenger.g0.L(16.0f);
                    float[] fArr = t0Var.i2;
                    Arrays.fill(fArr, L15);
                    float L16 = org.telegram.messenger.g0.L(f11);
                    fArr[7] = L16;
                    fArr[6] = L16;
                    fArr[5] = L16;
                    fArr[4] = L16;
                    Path path2 = t0Var.h2;
                    path2.rewind();
                    path2.addRoundRect(t0Var.N1, fArr, Path.Direction.CW);
                    canvas2.drawPath(path2, paint4);
                    if (t0Var.T()) {
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

    public final void J(Canvas canvas) {
        float f10;
        float f11;
        Canvas canvas2 = canvas;
        canvas2.save();
        float f12 = 2.0f;
        canvas2.translate(this.k0 / 2.0f, getPaddingTop());
        canvas2.save();
        canvas2.translate(this.U, this.T);
        StaticLayout staticLayout = this.N;
        org.telegram.ui.Components.p5.drawAnimatedEmojis(canvas2, staticLayout, this.s0, 0.0f, this.q0, 0.0f, 0.0f, 0.0f, 1.0f, staticLayout != null ? P(staticLayout.getPaint().getColor()) : null);
        canvas2.restore();
        float f13 = 4.0f;
        if (U()) {
            canvas2.save();
            float width = getWidth();
            di.e6 e6Var = this.I0;
            canvas2.translate((width - e6Var.T.f) / 2.0f, e6Var.p ? org.telegram.messenger.g0.L(4.0f) : org.telegram.messenger.g0.L(16.0f) + this.T + this.P);
            this.I0.c(canvas2);
            canvas2.restore();
        }
        canvas2.restore();
        i01 i01Var = this.o0;
        org.telegram.ui.ActionBar.e6 e6Var2 = this.h1;
        if (i01Var != null) {
            float alpha = getAlpha();
            if (e6Var2 != null) {
                e6Var2.b(this.v0, this.u0 + 0.0f, getMeasuredWidth(), this.w0);
            } else {
                org.telegram.ui.ActionBar.j6.r(this.v0, this.u0 + 0.0f, getMeasuredWidth(), this.w0);
            }
            this.o0.c(canvas, getWidth(), this.k0, 0.0f, 1.0f, alpha, this.n0);
            canvas2 = canvas;
        }
        ArrayList arrayList = this.Y1;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        if (e6Var2 != null) {
            e6Var2.b(this.v0, this.u0 + org.telegram.messenger.g0.L(4.0f), getMeasuredWidth(), this.w0);
        } else {
            org.telegram.ui.ActionBar.j6.r(this.v0, this.u0 + org.telegram.messenger.g0.L(4.0f), getMeasuredWidth(), this.w0);
        }
        float width2 = (getWidth() - this.j1) / 2.0f;
        float L = org.telegram.messenger.g0.L(4.0f) + org.telegram.messenger.g0.L(4.0f) + this.T + this.P + this.f;
        float L2 = (this.j1 - org.telegram.messenger.g0.L(4.0f)) / 2.0f;
        int i7 = 0;
        while (i7 < arrayList.size()) {
            c0 c0Var = (c0) arrayList.get(i7);
            float a10 = c0Var.a();
            float L3 = ((org.telegram.messenger.g0.L(f13) + L2) * i7) + width2;
            float f14 = L3 + L2;
            RectF rectF = this.d1;
            rectF.set(L3, L, f14, c0Var.f + L);
            canvas2.save();
            if (a10 != 1.0f) {
                f10 = f13;
                canvas2.scale(a10, a10, rectF.centerX(), rectF.centerY());
            } else {
                f10 = f13;
            }
            float L4 = org.telegram.messenger.g0.L(Math.min(6.75f, gz.Y0));
            float[] fArr = this.j2;
            Arrays.fill(fArr, L4);
            if ((c0Var.g & 9) == 9) {
                float L5 = org.telegram.messenger.g0.L(gz.Y0);
                fArr[7] = L5;
                fArr[6] = L5;
            }
            if ((c0Var.g & 10) == 10) {
                float L6 = org.telegram.messenger.g0.L(gz.Y0);
                fArr[5] = L6;
                fArr[4] = L6;
            }
            Path path = this.k2;
            path.rewind();
            path.addRoundRect(rectF, fArr, Path.Direction.CW);
            canvas2.drawPath(path, R("paintChatActionBackground"));
            if (T()) {
                canvas2.drawPath(path, org.telegram.ui.ActionBar.j6.h2);
            }
            canvas2.save();
            canvas2.clipPath(path);
            y yVar = c0Var.s;
            if (yVar != null) {
                int i10 = (int) L;
                yVar.setBounds((int) L3, i10, (int) f14, c0Var.f + i10);
                c0Var.s.setAlpha(ns.e4);
                c0Var.s.draw(canvas2);
            }
            canvas2.restore();
            canvas2.save();
            float L7 = c0Var.t != null ? org.telegram.messenger.g0.L(26.0f) : 0;
            float A = com.google.android.gms.internal.vision.e2.A(L2 - (c0Var.h.k() + (c0Var.t != null ? org.telegram.messenger.g0.L(f10) : 0)), L7, f12, L3);
            Drawable drawable = c0Var.t;
            if (drawable != null) {
                int i11 = (int) A;
                f11 = f12;
                drawable.setBounds(i11, (int) (((c0Var.f - org.telegram.messenger.g0.L(24.0f)) / f12) + L), org.telegram.messenger.g0.L(24.0f) + i11, org.telegram.messenger.g0.L(24.0f) + ((int) (((c0Var.f - org.telegram.messenger.g0.L(24.0f)) / f11) + L)));
                c0Var.t.setAlpha(c0Var.m ? 128 : ns.e4);
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

    public final void K(Canvas canvas, boolean z10) {
        if (this.s) {
            if (T() && !z10) {
                return;
            }
            if (!T() && z10) {
                return;
            }
        }
        L(canvas, z10, null);
    }

    public final void L(Canvas canvas, boolean z10, Integer num) {
        Canvas canvas2;
        float alpha = z10 ? getAlpha() : 1.0f;
        if (alpha <= 0.0f) {
            return;
        }
        org.telegram.ui.ActionBar.e6 e6Var = this.h1;
        if (e6Var != null) {
            e6Var.b(this.v0, this.u0 + org.telegram.messenger.g0.L(4.0f), getMeasuredWidth(), this.w0);
        } else {
            org.telegram.ui.ActionBar.j6.r(this.v0, this.u0 + org.telegram.messenger.g0.L(4.0f), getMeasuredWidth(), this.w0);
        }
        gj gjVar = this.Q0;
        if (gjVar == null || !gjVar.O5()) {
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
        s0 s0Var = this.s2;
        q0Var.d(canvas2, s0Var.b ? s0Var.c : 1.0f, num);
        if (alpha < 1.0f) {
            canvas2.restore();
        }
    }

    public final void M(ol olVar, Canvas canvas, int i7, Integer num, float f10) {
        ch.q0 q0Var = this.F0;
        q0Var.getClass();
        org.telegram.ui.ActionBar.e6 e6Var = this.h1;
        if (e6Var != null) {
            e6Var.b(this.v0, this.u0 + org.telegram.messenger.g0.L(4.0f), getMeasuredWidth(), this.w0);
        } else {
            org.telegram.ui.ActionBar.j6.r(this.v0, this.u0 + org.telegram.messenger.g0.L(4.0f), getMeasuredWidth(), this.w0);
        }
        q0Var.A = f10;
        q0Var.f(olVar, canvas, i7, num);
    }

    @Override // org.telegram.messenger.x5
    public final void N(String str) {
        TLRPC.PhotoSize photoSize;
        gj gjVar = this.Q0;
        if (gjVar == null || gjVar.D != 11) {
            return;
        }
        int size = gjVar.p0.size();
        int i7 = 0;
        while (true) {
            if (i7 >= size) {
                photoSize = null;
                break;
            }
            photoSize = (TLRPC.PhotoSize) gjVar.p0.get(i7);
            if (photoSize instanceof TLRPC.TL_photoStrippedSize) {
                break;
            } else {
                i7++;
            }
        }
        this.J.r0(this.y0, "g", gc.f(photoSize, gjVar.n0), "50_50_b", this.M, 0L, null, gjVar, 1);
        org.telegram.messenger.z5.q(this.I).v(this);
    }

    public final ColorFilter P(int i7) {
        if (i7 != this.r2 || this.q2 == null) {
            this.r2 = i7;
            this.q2 = new PorterDuffColorFilter(i7, PorterDuff.Mode.SRC_IN);
        }
        return this.q2;
    }

    public final int Q(gj gjVar) {
        int i7;
        int i10 = this.i1;
        int i11 = gjVar.D;
        if (i11 == 37) {
            i10 = org.telegram.messenger.g0.L(52.0f);
        } else if (i11 == 21 || Z()) {
            i10 = org.telegram.messenger.g0.L(78.0f);
        }
        if (Y() || (i7 = gjVar.D) == 34 || i7 == 35) {
            return 0;
        }
        return i10;
    }

    public Paint R(String str) {
        org.telegram.ui.ActionBar.e6 e6Var = this.h1;
        Paint d = e6Var != null ? e6Var.d(str) : null;
        return d != null ? d : org.telegram.ui.ActionBar.j6.V0(str);
    }

    public final float S(gj gjVar) {
        np s12;
        String str;
        if (gjVar == null) {
            return 1.0f;
        }
        try {
            if (gjVar.D == 22 && (str = (s12 = np.s1(this.I)).R2) != null && TextUtils.equals(gjVar.k.action.wallpaper.uploadingImage, str)) {
                return s12.S2.r;
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
        org.telegram.ui.ActionBar.e6 e6Var = this.h1;
        return e6Var != null ? e6Var.g() : org.telegram.ui.ActionBar.j6.d1();
    }

    public final boolean U() {
        di.e6 e6Var = this.I0;
        return (e6Var == null || e6Var.Q == null) ? false : true;
    }

    public final boolean V() {
        TLRPC.Message message;
        gj gjVar = this.Q0;
        return (gjVar == null || (message = gjVar.k) == null || !(message.action instanceof TLRPC.TL_messageActionGramTransfer)) ? false : true;
    }

    public final void W() {
        q0 q0Var = this.g1;
        if (q0Var != null && q0Var.g()) {
            super.invalidate();
        } else if (getParent() instanceof View) {
            ((View) getParent()).invalidate();
        }
    }

    public final boolean X(gj gjVar) {
        if (gjVar == null) {
            return false;
        }
        int i7 = gjVar.D;
        return i7 == 30 || i7 == 18 || i7 == 25 || Z();
    }

    public final boolean Y() {
        TLRPC.Message message;
        gj gjVar = this.Q0;
        return (gjVar == null || (message = gjVar.k) == null || !(message.action instanceof TLRPC.TL_messageActionSuggestedPostApproval)) ? false : true;
    }

    public final boolean Z() {
        gj gjVar;
        int i7;
        if (U() || this.P0 != null || (i7 = (gjVar = this.Q0).D) == 31 || i7 == 37 || i7 == 33 || i7 == 35 || i7 == 34 || i7 == 21 || i7 == 22 || gjVar.z4()) {
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
    public final /* synthetic */ boolean a() {
        return false;
    }

    public final boolean a0() {
        gj gjVar = this.Q0;
        if (gjVar == null) {
            return false;
        }
        TLRPC.Message message = gjVar.k;
        TLRPC.MessageAction messageAction = message.action;
        if (((messageAction instanceof TLRPC.TL_messageActionGiftCode) || (messageAction instanceof TLRPC.TL_messageActionGiftStars)) && (message.from_id instanceof TLRPC.TL_peerUser)) {
            return q10.B(np.s1(this.I).a2(Long.valueOf(this.Q0.k.from_id.user_id)));
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.p4
    public final void c(TLRPC.ReactionCount reactionCount, boolean z10, float f10, float f11) {
        q0 q0Var = this.g1;
        if (q0Var != null) {
            q0Var.x0(this, reactionCount, z10, f10, f11);
        }
    }

    public final void c0(CharacterStyle characterStyle) {
        if (this.g1 == null || !(characterStyle instanceof URLSpan)) {
            return;
        }
        String url = ((URLSpan) characterStyle).getURL();
        if (url.startsWith("task")) {
            this.g1.v(this, this.Q0.N1(), Integer.parseInt(url.substring(5)));
            return;
        }
        if (url.startsWith("topic")) {
            URLSpan uRLSpan = this.y;
            if (uRLSpan instanceof f41) {
                TLObject tLObject = ((f41) uRLSpan).c;
                if (tLObject instanceof TLRPC.TL_forumTopic) {
                    qg.c.m(this.g1.F(), -this.g1.a(), (TLRPC.TL_forumTopic) tLObject, 0);
                    return;
                }
                return;
            }
        }
        if (url.startsWith("invite")) {
            URLSpan uRLSpan2 = this.y;
            if (uRLSpan2 instanceof f41) {
                TLObject tLObject2 = ((f41) uRLSpan2).c;
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
            this.g1.b0(Long.parseLong(url));
        }
    }

    public final void d0() {
        TLRPC.TL_premiumGiftOption tL_premiumGiftOption = new TLRPC.TL_premiumGiftOption();
        gj gjVar = this.Q0;
        TLRPC.MessageAction messageAction = gjVar.k.action;
        tL_premiumGiftOption.amount = messageAction.amount;
        tL_premiumGiftOption.months = messageAction.months;
        tL_premiumGiftOption.currency = messageAction.currency;
        String str = null;
        if (gjVar != null && (messageAction instanceof TLRPC.TL_messageActionGiftCode) && !a0()) {
            str = ((TLRPC.TL_messageActionGiftCode) this.Q0.k.action).slug;
        }
        if (this.g1 != null) {
            org.telegram.messenger.g0.h3(new ki.n(this, tL_premiumGiftOption, str, 24));
        }
    }

    @Override // org.telegram.messenger.is
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        gj gjVar;
        if (i7 == ns.m1) {
            setSpoilersSuppressed(false);
            return;
        }
        if (i7 == ns.i4) {
            invalidate();
            return;
        }
        if (i7 == ns.l1) {
            setSpoilersSuppressed(true);
            return;
        }
        if (i7 == ns.W2 || i7 == ns.F3 || i7 == ns.X2) {
            gj gjVar2 = this.Q0;
            if (gjVar2 != null) {
                h0(gjVar2, true);
                return;
            }
            return;
        }
        if (i7 == ns.y0) {
            if (!Objects.equals(objArr[0], m10.i(this.I).c0) || (gjVar = this.Q0) == null) {
                return;
            }
            h0(gjVar, true);
            return;
        }
        if (i7 == ns.a4 && V()) {
            this.n2 = null;
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
        TLRPC.Message message;
        gj gjVar = this.Q0;
        if (gjVar == null || (message = gjVar.k) == null) {
            return;
        }
        TLRPC.MessageAction messageAction = message.action;
        boolean z10 = messageAction instanceof TLRPC.TL_messageActionGiftStars;
        fi.h7 h7Var = this.e0;
        if (z10) {
            Context context = getContext();
            TLRPC.Message message2 = this.Q0.k;
            int i7 = message2.date;
            TLRPC.Peer peer = message2.from_id;
            TLRPC.Peer peer2 = message2.peer_id;
            TLRPC.TL_messageActionGiftStars tL_messageActionGiftStars = (TLRPC.TL_messageActionGiftStars) message2.action;
            org.telegram.ui.ActionBar.e6 e6Var = h7Var.J;
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
            mb.k1(context, false, 0L, this.I, starsTransaction, e6Var);
            return;
        }
        if (messageAction instanceof TLRPC.TL_messageActionPrizeStars) {
            Context context2 = getContext();
            TLRPC.Message message3 = this.Q0.k;
            int i10 = message3.date;
            TLRPC.Peer peer3 = message3.from_id;
            TLRPC.Peer peer4 = message3.peer_id;
            TLRPC.TL_messageActionPrizeStars tL_messageActionPrizeStars = (TLRPC.TL_messageActionPrizeStars) message3.action;
            org.telegram.ui.ActionBar.e6 e6Var2 = h7Var.J;
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
            mb.k1(context2, false, 0L, this.I, starsTransaction2, e6Var2);
            return;
        }
        if (messageAction instanceof TLRPC.TL_messageActionGiftTon) {
            Context context3 = getContext();
            TLRPC.Message message4 = this.Q0.k;
            int i11 = message4.date;
            TLRPC.Peer peer5 = message4.from_id;
            TLRPC.Peer peer6 = message4.peer_id;
            TLRPC.TL_messageActionGiftTon tL_messageActionGiftTon = (TLRPC.TL_messageActionGiftTon) message4.action;
            org.telegram.ui.ActionBar.e6 e6Var3 = h7Var.J;
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
            mb.k1(context3, false, 0L, this.I, starsTransaction3, e6Var3);
            return;
        }
        if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
            if (((TLRPC.TL_messageActionStarGift) messageAction).forceIn) {
                return;
            }
            di.c6 c6Var = new di.c6(getContext(), this.I, gj.B0(this.Q0.k), this.h1, null);
            c6Var.j2(this.Q0, null);
            c6Var.show();
            return;
        }
        if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
            if (!((TLRPC.TL_messageActionStarGiftUnique) messageAction).gift.burned) {
                di.c6 c6Var2 = new di.c6(getContext(), this.I, gj.B0(this.Q0.k), this.h1, null);
                c6Var2.j2(this.Q0, null);
                c6Var2.show();
                return;
            } else {
                org.telegram.ui.ActionBar.e2 T = LaunchActivity.T();
                if (T == null) {
                    return;
                }
                org.telegram.messenger.k5.n(null, 2131743880, cc.a0(T), R.raw.fire_on, 36);
                return;
            }
        }
        if (messageAction instanceof TLRPC.TL_messageActionSetChatTheme) {
            TLRPC.ChatTheme chatTheme = ((TLRPC.TL_messageActionSetChatTheme) messageAction).theme;
            if (chatTheme instanceof TLRPC.TL_chatThemeUniqueGift) {
                TL_stars.StarGift starGift = ((TLRPC.TL_chatThemeUniqueGift) chatTheme).gift;
                if (starGift instanceof TL_stars.TL_starGiftUnique) {
                    di.c6 c6Var3 = new di.c6(getContext(), this.I, gj.B0(this.Q0.k), this.h1, null);
                    c6Var3.i2(starGift.slug, (TL_stars.TL_starGiftUnique) starGift, null);
                    c6Var3.show();
                }
            }
        }
    }

    public final boolean f0(float f10, float f11, uf ufVar) {
        if (V() && !this.Q0.P3() && !this.Q0.k.premiumEffectWasPlayed) {
            float y10 = getY() + getPaddingTop() + getWalletActionTop();
            if (y10 >= f10 && y10 + org.telegram.messenger.g0.L(140.0f) <= f11) {
                org.telegram.ui.Wallet.c4 c4Var = this.J0;
                ch0 ch0Var = c4Var.l;
                if (c4Var.i0 && c4Var.j0 == null) {
                    c4Var.i0 = false;
                    c4Var.k0 = ufVar;
                    c4Var.K.e(true, 0.0f);
                    c4Var.M = false;
                    c4Var.N = 0L;
                    c4Var.b();
                    c4Var.g();
                    c4Var.t = 18.0f;
                    c4Var.u.f();
                    ch0Var.T(true, 0.0f);
                    ch0Var.start();
                    c4Var.H = true;
                    float f12 = c4Var.R;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    c4Var.j0 = ofFloat;
                    ofFloat.setDuration(2400L);
                    c4Var.j0.setInterpolator(er.h);
                    c4Var.j0.addUpdateListener(new pf(c4Var, f12, 5));
                    c4Var.j0.addListener(new g71(c4Var, 6));
                    c4Var.j0.start();
                    c4Var.a.invalidate();
                    this.Q0.k.premiumEffectWasPlayed = true;
                    vr.a0(this.I).X1(gj.B0(this.Q0.k), this.Q0.k);
                    return true;
                }
            }
        }
        return false;
    }

    public final void g0(int i7, boolean z10, boolean z11) {
        int i10 = this.R0;
        if (i10 == i7 || i10 / 3600 == i7 / 3600) {
            return;
        }
        String M0 = z10 ? i7 == 2147483646 ? hd.M0(2131748492, "MessageScheduledUntilOnline") : hd.a0("MessageScheduledOn", null, 2131748528, hd.u(i7, false)) : hd.u(i7, false);
        this.R0 = i7;
        CharSequence charSequence = this.S0;
        if (charSequence == null || !TextUtils.equals(M0, charSequence)) {
            this.S0 = M0;
            this.n2 = null;
            k0(z11);
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
        if (X(this.Q0)) {
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
        if (X(this.Q0)) {
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

    public /* bridge */ /* synthetic */ yi getCurrentPosition() {
        return null;
    }

    public int getCustomDate() {
        return this.R0;
    }

    public q0 getDelegate() {
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
    public gj getMessageObject() {
        return this.Q0;
    }

    @Override // org.telegram.messenger.x5
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

    public s0 getTransitionParams() {
        return this.s2;
    }

    public float getWalletSlidingOffset() {
        return this.N0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0bf1  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0c59  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0c62  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0c48  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x045a  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0524  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x052e  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0490  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x0735  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x074e  */
    /* JADX WARN: Removed duplicated region for block: B:452:0x09a8  */
    /* JADX WARN: Removed duplicated region for block: B:479:0x09ec A[EDGE_INSN: B:479:0x09ec->B:475:0x09ec BREAK  A[LOOP:6: B:450:0x09a0->B:477:0x09e9], SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r5v8, types: [org.telegram.tgnet.TLRPC$messages_StickerSet] */
    /* JADX WARN: Type inference failed for: r5v85 */
    /* JADX WARN: Type inference failed for: r5v86 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h0(gj gjVar, boolean z10) {
        StaticLayout staticLayout;
        TLRPC.TL_messageReactions tL_messageReactions;
        int i7;
        int i10;
        org.telegram.ui.ActionBar.e6 e6Var;
        int i11;
        org.telegram.ui.ActionBar.e6 e6Var2;
        String str;
        int i12;
        gj gjVar2;
        TLRPC.Document document;
        String str2;
        TLRPC.Document document2;
        String str3;
        ArrayList<TLRPC.TL_stickerPack> arrayList;
        gj gjVar3;
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
        gc gcVar;
        TLRPC.PhotoSize photoSize2;
        ImageReceiver imageReceiver4;
        boolean z11;
        float f10;
        RadialProgress2 radialProgress2;
        TLRPC.WallPaper wallPaper;
        TLRPC.MessageAction messageAction;
        String str4;
        i01 i01Var;
        int i17;
        int paddingTop;
        int i18;
        TLRPC.Message message;
        String m10;
        String str5;
        ActivityManager activityManager;
        gj gjVar4 = gjVar;
        if (gjVar4 == null) {
            return;
        }
        if (this.Q0 != gjVar4 && this.N0 != 0.0f) {
            setWalletSlidingOffset(0.0f);
        }
        TLRPC.Message message2 = gjVar4.k;
        if ((message2 == null || !(message2.action instanceof TLRPC.TL_messageActionGramTransfer) || this.b2 == message2.send_state) && this.Q0 == gjVar4 && (((staticLayout = this.N) == null || TextUtils.equals(staticLayout.getText(), gjVar4.v)) && !((!this.E0 && gjVar4.C != null) || z10 || gjVar4.D == 21 || gjVar4.M1))) {
            return;
        }
        boolean z12 = org.telegram.messenger.r2.a;
        ArrayList arrayList2 = this.Y1;
        arrayList2.clear();
        this.Z1 = null;
        this.n2 = null;
        gj gjVar5 = this.Q0;
        int i19 = 1;
        boolean z13 = gjVar5 == null || gjVar5.m1 != gjVar4.m1;
        if (gjVar5 != null) {
            gjVar4.o1 = gjVar5.o1;
        }
        if (!z13 && gjVar5 != null && V()) {
            gjVar4.k.premiumEffectWasPlayed |= this.Q0.k.premiumEffectWasPlayed;
        }
        this.Q0 = gjVar4;
        boolean V = V();
        org.telegram.ui.ActionBar.e6 e6Var3 = this.h1;
        if (V && this.J0 == null) {
            org.telegram.ui.Wallet.c4 c4Var = new org.telegram.ui.Wallet.c4(this, e6Var3);
            this.J0 = c4Var;
            c4Var.s0 = new m0(this, i19);
            c4Var.n(this.K0);
        }
        org.telegram.ui.Wallet.c4 c4Var2 = this.J0;
        if (c4Var2 != null) {
            boolean V2 = V();
            t0 t0Var = c4Var2.a;
            c4Var2.n = V2;
            if (V2 && c4Var2.m == null && !c4Var2.o && com.google.android.gms.internal.vision.e2.s(t0Var) && gz.o() != 0 && (activityManager = (ActivityManager) t0Var.getContext().getSystemService("activity")) != null && activityManager.getDeviceConfigurationInfo().reqGlEsVersion >= 196608) {
                org.telegram.ui.Wallet.b4 b4Var = new org.telegram.ui.Wallet.b4(c4Var2, t0Var.getContext(), new org.telegram.ui.Wallet.y3(c4Var2, 1));
                c4Var2.m = b4Var;
                t0Var.addView(b4Var, new ViewGroup.LayoutParams(org.telegram.messenger.g0.L(42.0f), org.telegram.messenger.g0.L(42.0f)));
            }
            org.telegram.ui.Wallet.b4 b4Var2 = c4Var2.m;
            if (b4Var2 != null) {
                b4Var2.setVisibility((!V2 || c4Var2.o) ? 8 : 0);
                c4Var2.m.setPaused(!V2 || c4Var2.o);
            }
            if (!V2) {
                c4Var2.f();
                c4Var2.k();
            }
        }
        TLRPC.Message message3 = gjVar4.k;
        int i20 = this.I;
        if (message3 != null && (message3.action instanceof TLRPC.TL_messageActionGramTransfer)) {
            np s12 = np.s1(i20);
            long o4 = org.telegram.messenger.m5.o(gjVar4.k.peer_id);
            if (q10.A(o4)) {
                m10 = hd.M0(2131742971, null);
            } else if (gjVar4.k.peer_id == null) {
                str5 = null;
                org.telegram.ui.Wallet.c4 c4Var3 = this.J0;
                boolean P3 = gjVar4.P3();
                TLRPC.Message message4 = gjVar4.k;
                c4Var3.m(P3, (TLRPC.TL_messageActionGramTransfer) message4.action, str5, message4.send_state, z13, !message4.premiumEffectWasPlayed);
                this.b2 = gjVar4.k.send_state;
            } else {
                m10 = org.telegram.messenger.m5.m(s12.e2(o4));
            }
            str5 = m10;
            org.telegram.ui.Wallet.c4 c4Var32 = this.J0;
            boolean P32 = gjVar4.P3();
            TLRPC.Message message42 = gjVar4.k;
            c4Var32.m(P32, (TLRPC.TL_messageActionGramTransfer) message42.action, str5, message42.send_state, z13, !message42.premiumEffectWasPlayed);
            this.b2 = gjVar4.k.send_state;
        }
        gjVar4.M1 = false;
        this.E0 = gjVar4.C != null;
        org.telegram.messenger.z5.q(i20).v(this);
        this.W = 0;
        this.H = false;
        r0 r0Var = this.t1;
        if (r0Var != null && z13) {
            org.telegram.ui.Components.p5.release((t0) r0Var.i, (org.telegram.ui.Components.l5) r0Var.h);
            this.t1 = null;
            this.o1 = false;
        }
        if (z13 || gjVar4.H) {
            gjVar4.H = false;
            TLRPC.Message message5 = gjVar4.k;
            boolean z14 = (message5 == null || (tL_messageReactions = message5.reactions) == null || !tL_messageReactions.reactions_as_tags) ? false : true;
            boolean O5 = gjVar4.O5();
            ch.q0 q0Var = this.F0;
            if (O5) {
                q0Var.r(gjVar4, z14, e6Var3);
            } else {
                q0Var.r(null, false, e6Var3);
            }
        }
        if (gjVar4.D == 32) {
            if (this.P0 == null) {
                mw0 mw0Var = new mw0(i20, this, e6Var3);
                this.P0 = mw0Var;
                if (this.e2) {
                    mw0Var.d.R(mw0Var.b);
                }
            }
            mw0 mw0Var2 = this.P0;
            mw0Var2.getClass();
            TLRPC.TL_messageActionSuggestBirthday tL_messageActionSuggestBirthday = (TLRPC.TL_messageActionSuggestBirthday) gjVar4.k.action;
            mw0Var2.e = tL_messageActionSuggestBirthday.birthday;
            i7 = 0;
            oy0 oy0Var = new oy0(TextUtils.concat(gjVar4.v, ":"), 13.0f, null);
            oy0Var.m(6);
            Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
            oy0Var.a();
            oy0Var.p(org.telegram.messenger.g0.L(174.0f) - org.telegram.messenger.g0.L(32.0f));
            mw0Var2.f = oy0Var;
            int i21 = (tL_messageActionSuggestBirthday.birthday.flags & 1) != 0 ? 3 : 2;
            oy0[] oy0VarArr = new oy0[i21];
            mw0Var2.g = oy0VarArr;
            mw0Var2.h = new oy0[i21];
            oy0VarArr[0] = new oy0(hd.M0(2131751674, null), 11.0f, null);
            i10 = 2;
            mw0Var2.h[0] = new oy0("" + tL_messageActionSuggestBirthday.birthday.day, 11.0f, org.telegram.messenger.g0.o());
            mw0Var2.g[1] = new oy0(hd.M0(2131751673, null), 11.0f, null);
            oy0[] oy0VarArr2 = mw0Var2.h;
            StringBuilder sb2 = new StringBuilder("");
            int i22 = tL_messageActionSuggestBirthday.birthday.month - 1;
            sb2.append((i22 < 0 || i22 >= 12) ? i5.c.i(i22, "") : hd.M0(new int[]{2131749086, 2131750829, 2131748683, 2131754173, 2131748662, 2131749064, 2131749066, 2131753895, 2131745565, 2131747830, 2131747835, 2131751605}[i22], null));
            oy0VarArr2[1] = new oy0(sb2.toString(), 11.0f, org.telegram.messenger.g0.o());
            if ((tL_messageActionSuggestBirthday.birthday.flags & 1) != 0) {
                mw0Var2.g[2] = new oy0(hd.M0(2131751669, null), 11.0f, null);
                mw0Var2.h[2] = new oy0("" + tL_messageActionSuggestBirthday.birthday.year, 11.0f, org.telegram.messenger.g0.o());
            }
            mw0Var2.i = !gjVar4.P3();
            org.telegram.ui.ActionBar.e6 e6Var4 = mw0Var2.c;
            mw0Var2.l.setColor(org.telegram.ui.ActionBar.j6.r1(0.12f, e6Var4 != null ? e6Var4.a() : org.telegram.ui.ActionBar.j6.I.q() ? -1 : -16777216));
            mw0Var2.j = new oy0(hd.M0(2131744395, null), 14.0f, org.telegram.messenger.g0.o());
        } else {
            i7 = 0;
            i10 = 2;
            mw0 mw0Var3 = this.P0;
            if (mw0Var3 != null) {
                mw0Var3.d.R(null);
                this.P0 = null;
            }
        }
        if (this.I0 == null && (message = gjVar4.k) != null && (message.action instanceof TLRPC.TL_messageActionStarGiftUnique)) {
            di.e6 e6Var5 = new di.e6(i20, this, e6Var3);
            this.I0 = e6Var5;
            if (this.e2) {
                e6Var5.a();
            }
        }
        di.e6 e6Var6 = this.I0;
        if (e6Var6 != null) {
            e6Var6.f(gjVar4, !z13);
        }
        ImageReceiver imageReceiver5 = this.J;
        imageReceiver5.X(i7);
        imageReceiver5.e();
        if (gjVar4.D != 22) {
            this.K = null;
        }
        if (gjVar4.J0 != -1) {
            c8.na.b(this, 0.02f, 1.2f);
            this.g2 = Math.max(org.telegram.messenger.g0.L(250.0f), hi.l3.a(gjVar4.v, (TextPaint) R("paintChatActionText")));
            tw0 X0 = lb.X0(gjVar4.v);
            if (X0 != null) {
                X0.h = this;
            }
        } else {
            setStateListAnimator(null);
            this.g2 = 0;
        }
        boolean z42 = gjVar4.z4();
        org.telegram.ui.Components.t8 t8Var = this.M;
        if (z42) {
            TLRPC.User a22 = np.s1(i20).a2(Long.valueOf(gjVar4.k.media.user_id));
            t8Var.r(a22);
            TL_stories.StoryItem storyItem = gjVar4.k.media.storyItem;
            if (storyItem == null || !storyItem.noforwards) {
                fi.l7.x(imageReceiver5, storyItem);
            } else {
                imageReceiver5.j0(a22, t8Var, null, true, 0, true);
            }
            imageReceiver5.J0((int) (this.i1 / 2.0f));
        } else {
            int i23 = gjVar4.D;
            RadialProgress2 radialProgress22 = this.K1;
            if (i23 != 22) {
                if (i23 == 21) {
                    imageReceiver5.J0((int) (this.i1 / 2.0f));
                    imageReceiver5.v0 = true;
                    imageReceiver5.h1 = null;
                    TLRPC.TL_messageActionSuggestProfilePhoto tL_messageActionSuggestProfilePhoto = (TLRPC.TL_messageActionSuggestProfilePhoto) gjVar4.k.action;
                    TLRPC.VideoSize x10 = org.telegram.messenger.w7.x(1000, tL_messageActionSuggestProfilePhoto.photo.video_sizes);
                    ArrayList<TLRPC.VideoSize> arrayList3 = tL_messageActionSuggestProfilePhoto.photo.video_sizes;
                    if (arrayList3 == null || arrayList3.isEmpty()) {
                        imageReceiver3 = imageReceiver5;
                        gcVar = null;
                    } else {
                        gcVar = gc.j(x10, tL_messageActionSuggestProfilePhoto.photo);
                        imageReceiver3 = imageReceiver5;
                    }
                    TLRPC.Photo photo = gjVar4.k.action.photo;
                    if (gjVar4.I1 == null) {
                        int size = gjVar4.p0.size();
                        for (int i24 = 0; i24 < size; i24++) {
                            photoSize2 = (TLRPC.PhotoSize) gjVar4.p0.get(i24);
                            if (photoSize2 instanceof TLRPC.TL_photoStrippedSize) {
                                break;
                            }
                        }
                    }
                    photoSize2 = null;
                    TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(gjVar4.p0, 1000, false, null, false);
                    if (w10 == null) {
                        imageReceiver4 = imageReceiver3;
                        e6Var = e6Var3;
                        i11 = i20;
                        z11 = false;
                        f10 = 1.0f;
                        radialProgress2 = radialProgress22;
                    } else if (x10 != null) {
                        i11 = i20;
                        z11 = false;
                        e6Var = e6Var3;
                        f10 = 1.0f;
                        radialProgress2 = radialProgress22;
                        imageReceiver3.u0(gcVar, "g", gc.i(w10, photo), "150_150", gc.f(photoSize2, gjVar4.n0), "50_50_b", gjVar4.I1, 0L, null, gjVar, 0);
                        imageReceiver4 = imageReceiver3;
                        gjVar4 = gjVar;
                    } else {
                        e6Var = e6Var3;
                        i11 = i20;
                        z11 = false;
                        f10 = 1.0f;
                        radialProgress2 = radialProgress22;
                        imageReceiver3.r0(gc.i(w10, photo), "150_150", gc.f(photoSize2, gjVar4.n0), "50_50_b", gjVar4.I1, 0L, null, gjVar4, 0);
                        imageReceiver4 = imageReceiver3;
                    }
                    imageReceiver4.v0 = z11;
                    m30 m30Var = (m30) np.s1(i11).C7.get(gjVar4.k.local_id);
                    if (m30Var == null || m30Var.X == f10) {
                        boolean z15 = !z13;
                        radialProgress2.p(z15, f10);
                        radialProgress2.setIcon(4, z15, z15);
                    } else {
                        boolean z16 = !z13;
                        radialProgress2.setIcon(3, z16, z16);
                    }
                } else {
                    e6Var = e6Var3;
                    i11 = i20;
                    int i25 = 0;
                    if (i23 == 31 || i23 == 33 || i23 == 30 || i23 == 18 || i23 == 25 || i23 == 35) {
                        String str6 = null;
                        imageReceiver5.J0(0);
                        TLRPC.MessageAction messageAction2 = gjVar4.k.action;
                        if (messageAction2 instanceof TLRPC.TL_messageActionNoForwardsRequest) {
                            TLRPC.TL_messageActionNoForwardsRequest tL_messageActionNoForwardsRequest = (TLRPC.TL_messageActionNoForwardsRequest) messageAction2;
                            this.a2 = tL_messageActionNoForwardsRequest.expired || ((long) gjVar4.k.date) + np.s1(i11).y7.D.z0(TimeUnit.SECONDS) < ((long) ConnectionsManager.getInstance(i11).getCurrentTime());
                            if (gjVar4.N3() || tL_messageActionNoForwardsRequest.expired || this.a2) {
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
                                this.Z1 = new f5.v((org.telegram.messenger.m2[][]) arrayList4.toArray(new org.telegram.messenger.m2[arrayList4.size()][]), i25, i16);
                            }
                            i12 = i16;
                            document = null;
                            gjVar2 = null;
                            gjVar3 = null;
                            e6Var2 = e6Var;
                        } else {
                            int i26 = 8;
                            if (messageAction2 instanceof TLRPC.TL_messageActionStarGiftPurchaseOffer) {
                                TLRPC.TL_messageActionStarGiftPurchaseOffer tL_messageActionStarGiftPurchaseOffer = (TLRPC.TL_messageActionStarGiftPurchaseOffer) messageAction2;
                                TL_stars.StarGift starGift = tL_messageActionStarGiftPurchaseOffer.gift;
                                if (starGift != null) {
                                    document5 = cg.d.e(starGift);
                                    if (this.T0 == null) {
                                        e6Var2 = e6Var;
                                        this.T0 = new bi.e2(this, e6Var2, false);
                                    } else {
                                        e6Var2 = e6Var;
                                    }
                                    this.T0.d((TL_stars.starGiftAttributeBackdrop) di.v8.l(starGift.attributes, TL_stars.starGiftAttributeBackdrop.class));
                                    this.T0.e((TL_stars.starGiftAttributePattern) di.v8.l(starGift.attributes, TL_stars.starGiftAttributePattern.class));
                                } else {
                                    e6Var2 = e6Var;
                                    document5 = null;
                                }
                                this.a2 = tL_messageActionStarGiftPurchaseOffer.expires_at < ConnectionsManager.getInstance(i11).getCurrentTime();
                                if (!gjVar4.N3() && !tL_messageActionStarGiftPurchaseOffer.accepted && !tL_messageActionStarGiftPurchaseOffer.declined && !this.a2) {
                                    ArrayList arrayList5 = new ArrayList();
                                    arrayList5.add(new org.telegram.messenger.m2[]{new org.telegram.messenger.o2(5, 2131749731, R.drawable.filled_bot_decline_24), new org.telegram.messenger.o2(6, 2131749741, R.drawable.filled_bot_approve_24)});
                                    this.Z1 = new f5.v((org.telegram.messenger.m2[][]) arrayList5.toArray(new org.telegram.messenger.m2[arrayList5.size()][]), i25, i26);
                                }
                                document = document5;
                            } else {
                                e6Var2 = e6Var;
                                if (!(messageAction2 instanceof TLRPC.TL_messageActionSetChatTheme)) {
                                    if (messageAction2 instanceof TLRPC.TL_messageActionStarGift) {
                                        TL_stars.StarGift starGift2 = ((TLRPC.TL_messageActionStarGift) messageAction2).gift;
                                        if (starGift2 != null) {
                                            document = starGift2.sticker;
                                            i12 = 8;
                                            gjVar3 = gjVar4;
                                            str6 = null;
                                            gjVar2 = null;
                                        }
                                        document = null;
                                        i12 = 8;
                                        gjVar3 = gjVar4;
                                        str6 = null;
                                        gjVar2 = null;
                                    } else {
                                        if (messageAction2 instanceof TLRPC.TL_messageActionStarGiftUnique) {
                                            TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique = (TLRPC.TL_messageActionStarGiftUnique) messageAction2;
                                            if (tL_messageActionStarGiftUnique.refunded) {
                                                TL_stars.StarGift starGift3 = tL_messageActionStarGiftUnique.gift;
                                                if (starGift3 != null) {
                                                    document = starGift3.getDocument();
                                                    i12 = 8;
                                                    gjVar3 = gjVar4;
                                                    str6 = null;
                                                    gjVar2 = null;
                                                }
                                                document = null;
                                                i12 = 8;
                                                gjVar3 = gjVar4;
                                                str6 = null;
                                                gjVar2 = null;
                                            }
                                        }
                                        if (messageAction2 instanceof TLRPC.TL_messageActionGiftTon) {
                                            str = m10.i(i11).d0;
                                            if (str == null) {
                                                si.b0(i11).C();
                                                return;
                                            }
                                        } else {
                                            str = m10.i(i11).c0;
                                            if (str == null) {
                                                si.b0(i11).z();
                                                return;
                                            }
                                        }
                                        TLRPC.TL_messages_stickerSet p02 = si.b0(i11).p0(str);
                                        ?? r52 = p02;
                                        if (p02 == null) {
                                            r52 = si.b0(i11).n0(str);
                                        }
                                        if (r52 != 0) {
                                            TLRPC.MessageAction messageAction3 = gjVar4.k.action;
                                            int i27 = messageAction3.months;
                                            if (gjVar4.D == 30) {
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
                                                        i12 = 8;
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
                                                    i12 = 8;
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
                                                        i12 = 8;
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
                                                    i12 = 8;
                                                    document2 = document3;
                                                }
                                            } else {
                                                String str8 = (String) t2.get(Integer.valueOf(i27));
                                                ArrayList<TLRPC.TL_stickerPack> arrayList6 = r52.packs;
                                                int size2 = arrayList6.size();
                                                int i29 = 0;
                                                TLRPC.Document document6 = null;
                                                while (true) {
                                                    if (i29 >= size2) {
                                                        str2 = str;
                                                        i12 = i26;
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
                                                                i12 = i26;
                                                                break;
                                                            }
                                                            Long l10 = arrayList7.get(i30);
                                                            i30++;
                                                            long longValue2 = l10.longValue();
                                                            i12 = i26;
                                                            ArrayList<TLRPC.Document> arrayList8 = r52.documents;
                                                            int size4 = arrayList8.size();
                                                            str2 = str;
                                                            int i31 = 0;
                                                            while (true) {
                                                                if (i31 >= size4) {
                                                                    str3 = str8;
                                                                    arrayList = arrayList6;
                                                                    break;
                                                                }
                                                                TLRPC.Document document8 = arrayList8.get(i31);
                                                                int i32 = i31 + 1;
                                                                TLRPC.Document document9 = document8;
                                                                str3 = str8;
                                                                arrayList = arrayList6;
                                                                if (document9.id == longValue2) {
                                                                    document7 = document9;
                                                                    break;
                                                                } else {
                                                                    str8 = str3;
                                                                    i31 = i32;
                                                                    arrayList6 = arrayList;
                                                                }
                                                            }
                                                            if (document7 != null) {
                                                                break;
                                                            }
                                                            str = str2;
                                                            str8 = str3;
                                                            arrayList6 = arrayList;
                                                            i26 = i12;
                                                        }
                                                        document6 = document7;
                                                    } else {
                                                        str2 = str;
                                                        str3 = str8;
                                                        arrayList = arrayList6;
                                                        i12 = i26;
                                                    }
                                                    if (document6 != null) {
                                                        break;
                                                    }
                                                    str = str2;
                                                    str8 = str3;
                                                    arrayList6 = arrayList;
                                                    i26 = i12;
                                                    i25 = 0;
                                                }
                                                document2 = document6;
                                            }
                                            if (document2 == null && !r52.documents.isEmpty()) {
                                                document2 = r52.documents.get(0);
                                            }
                                            gjVar3 = r52;
                                            document = document2;
                                            str6 = str2;
                                            gjVar2 = gjVar3;
                                        } else {
                                            i12 = 8;
                                            gjVar2 = r52;
                                            str6 = str;
                                            document = null;
                                            gjVar3 = null;
                                        }
                                    }
                                    if (!this.l0 && this.f0 && this.j0 && (this.g0 || this.h0 || this.i0)) {
                                        this.m0 = org.telegram.messenger.g0.L(33.0f);
                                        if (this.o0 == null) {
                                            i01 i01Var2 = new i01(i11, this, e6Var2, true);
                                            this.o0 = i01Var2;
                                            i01Var2.s = new m0(this, 3);
                                        }
                                        if (this.o0.e(this.Q0)) {
                                            if (this.e2) {
                                                this.o0.a();
                                            }
                                            i17 = 0;
                                        } else {
                                            this.o0.b();
                                            this.o0 = null;
                                            i17 = 0;
                                            this.m0 = 0;
                                        }
                                    } else {
                                        i01Var = this.o0;
                                        if (i01Var != null) {
                                            i01Var.b();
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
                                    this.U1.setVisibility((X(gjVar) || U()) ? i12 : i17);
                                    qg.c.b(gjVar4);
                                    requestLayout();
                                }
                                TL_stars.StarGift starGift4 = ((TLRPC.TL_chatThemeUniqueGift) ((TLRPC.TL_messageActionSetChatTheme) messageAction2).theme).gift;
                                if (starGift4 != null) {
                                    document4 = cg.d.e(starGift4);
                                    if (this.T0 == null) {
                                        this.T0 = new bi.e2(this, e6Var2, false);
                                    }
                                    this.T0.d((TL_stars.starGiftAttributeBackdrop) di.v8.l(starGift4.attributes, TL_stars.starGiftAttributeBackdrop.class));
                                    this.T0.e((TL_stars.starGiftAttributePattern) di.v8.l(starGift4.attributes, TL_stars.starGiftAttributePattern.class));
                                } else {
                                    document4 = null;
                                }
                                document = document4;
                            }
                            i12 = 8;
                            str6 = null;
                            gjVar2 = null;
                            gjVar3 = null;
                        }
                        f5.v vVar = this.Z1;
                        if (vVar != null) {
                            int length = ((org.telegram.messenger.m2[][]) vVar.c).length;
                            int i33 = 0;
                            while (i33 < length) {
                                int length2 = ((org.telegram.messenger.m2[][]) this.Z1.c)[i33].length;
                                int i34 = 0;
                                while (i34 < length2) {
                                    org.telegram.messenger.m2 m2Var = ((org.telegram.messenger.m2[][]) this.Z1.c)[i33][i34];
                                    c0 c0Var = new c0(new m0(this, 2));
                                    c0Var.j = (org.telegram.messenger.o2) m2Var;
                                    int c10 = m2Var.c();
                                    if (c10 != 0) {
                                        Drawable drawable = getResources().getDrawable(c10);
                                        c0Var.t = drawable;
                                        i14 = length;
                                        i15 = i33;
                                        drawable.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                                    } else {
                                        i14 = length;
                                        i15 = i33;
                                    }
                                    c0Var.f = org.telegram.messenger.g0.L(40.0f);
                                    int i35 = c0Var.g | 8;
                                    c0Var.g = i35;
                                    int b10 = zc.b(i35, 1, i34 == 0);
                                    c0Var.g = b10;
                                    c0Var.g = zc.b(b10, 2, i34 == 1);
                                    c0Var.h = new oy0(m2Var.d(), (TextPaint) R("paintChatBotButton"));
                                    arrayList2.add(c0Var);
                                    i34++;
                                    length = i14;
                                    i33 = i15;
                                }
                                i33++;
                                length = length;
                            }
                        }
                        this.M1 = gjVar4.n1;
                        this.I1 = document;
                        if (document != null) {
                            imageReceiver5.v0 = true;
                            int i36 = gjVar4.D;
                            if (i36 != 31 && i36 != 37 && i36 != 33) {
                                imageReceiver5.d0(this.O1);
                            }
                            this.J1 = null;
                            int i37 = 0;
                            while (true) {
                                if (i37 >= document.video_thumbs.size()) {
                                    break;
                                }
                                if ("f".equals(document.video_thumbs.get(i37).type)) {
                                    this.J1 = document.video_thumbs.get(i37);
                                    break;
                                }
                                i37++;
                            }
                            if (z13 || gjVar4.D != 18) {
                                pz e10 = org.telegram.messenger.t5.e(document, org.telegram.ui.ActionBar.j6.a7, 0.3f);
                                imageReceiver5.W(0);
                                gc b11 = gc.b(document);
                                Locale locale = Locale.US;
                                imageReceiver5.q0(b11, i5.c.i(gjVar4.m1, "160_160_nr_messageId="), e10, "tgs", gjVar3, 1);
                            }
                        } else if (str6 != null) {
                            si.b0(i11).c1(str6, false, gjVar2 == null);
                        }
                        if (!this.l0) {
                        }
                        i01Var = this.o0;
                        if (i01Var != null) {
                        }
                        i17 = 0;
                        this.m0 = 0;
                        paddingTop = getPaddingTop();
                        i18 = this.m0;
                        if (paddingTop != i18) {
                        }
                        this.U1.setVisibility((X(gjVar) || U()) ? i12 : i17);
                        qg.c.b(gjVar4);
                        requestLayout();
                    }
                    if (i23 == 37) {
                        TLRPC.Chat M0 = np.s1(i11).M0(Long.valueOf(((TLRPC.TL_messageActionChangeCommunity) gjVar4.k.action).community_id));
                        imageReceiver5.v0 = true;
                        imageReceiver5.h1 = null;
                        imageReceiver5.J0(org.telegram.messenger.g0.L(14.0f));
                        imageReceiver5.X(1);
                        t8Var.q(M0);
                        imageReceiver5.i0(M0, new fi.j0(getContext(), org.telegram.messenger.g0.L(14.0f)), M0);
                    } else if (i23 == 11) {
                        imageReceiver5.v0 = true;
                        imageReceiver5.h1 = null;
                        imageReceiver5.J0(org.telegram.messenger.g0.u / 2);
                        imageReceiver5.X(1);
                        t8Var.k(gj.B0(gjVar4.k), null, null, null);
                        if (gjVar4.k.action instanceof TLRPC.TL_messageActionUserUpdatedPhoto) {
                            imageReceiver = imageReceiver5;
                            imageReceiver.q0(null, null, t8Var, null, gjVar4, 0);
                        } else {
                            imageReceiver = imageReceiver5;
                            if (gjVar4.I1 == null) {
                                int size5 = gjVar4.p0.size();
                                for (int i38 = 0; i38 < size5; i38++) {
                                    photoSize = (TLRPC.PhotoSize) gjVar4.p0.get(i38);
                                    if (photoSize instanceof TLRPC.TL_photoStrippedSize) {
                                        break;
                                    }
                                }
                            }
                            photoSize = null;
                            TLRPC.PhotoSize w11 = org.telegram.messenger.w7.w(gjVar4.p0, 640, false, null, false);
                            if (w11 != null) {
                                TLRPC.Photo photo2 = gjVar4.k.action.photo;
                                if (!photo2.video_sizes.isEmpty()) {
                                    int i39 = gz.a;
                                    if (qc.e(2048)) {
                                        videoSize = org.telegram.messenger.w7.x(1000, photo2.video_sizes);
                                        if (!gjVar4.z0 && !org.telegram.messenger.z5.q(i11).c(4, videoSize.size)) {
                                            this.y0 = gc.j(videoSize, photo2);
                                            org.telegram.messenger.z5.q(i11).a(org.telegram.messenger.w7.r(null, videoSize), gjVar4, this);
                                        }
                                        if (videoSize == null) {
                                            imageReceiver.r0(gc.j(videoSize, photo2), "g", gc.f(photoSize, gjVar4.n0), "50_50_b", gjVar4.I1, 0L, null, gjVar4, 1);
                                        } else {
                                            imageReceiver.r0(gc.f(w11, gjVar4.n0), "150_150", gc.f(photoSize, gjVar4.n0), "50_50_b", gjVar4.I1, 0L, null, gjVar4, 1);
                                        }
                                    }
                                }
                                videoSize = null;
                                if (videoSize == null) {
                                }
                            } else {
                                imageReceiver2 = imageReceiver;
                                imageReceiver2.w0(t8Var);
                                imageReceiver2.O0(!PhotoViewer.L1(gjVar4), false);
                            }
                        }
                        imageReceiver2 = imageReceiver;
                        imageReceiver2.O0(!PhotoViewer.L1(gjVar4), false);
                    } else {
                        imageReceiver5.v0 = true;
                        imageReceiver5.h1 = null;
                        imageReceiver5.v0(null);
                    }
                }
                e6Var2 = e6Var;
                i12 = 8;
                if (!this.l0) {
                }
                i01Var = this.o0;
                if (i01Var != null) {
                }
                i17 = 0;
                this.m0 = 0;
                paddingTop = getPaddingTop();
                i18 = this.m0;
                if (paddingTop != i18) {
                }
                this.U1.setVisibility((X(gjVar) || U()) ? i12 : i17);
                qg.c.b(gjVar4);
                requestLayout();
            }
            if (gjVar4.I1 == null) {
                int size6 = gjVar4.p0.size();
                for (int i40 = 0; i40 < size6 && !(((TLRPC.PhotoSize) gjVar4.p0.get(i40)) instanceof TLRPC.TL_photoStrippedSize); i40++) {
                }
            }
            TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent = gjVar4.L1;
            if (tL_channelAdminLogEvent != null) {
                TLRPC.ChannelAdminLogEventAction channelAdminLogEventAction = tL_channelAdminLogEvent.action;
                if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionChangeWallpaper) {
                    wallPaper = ((TLRPC.TL_channelAdminLogEventActionChangeWallpaper) channelAdminLogEventAction).new_value;
                    if (TextUtils.isEmpty(org.telegram.messenger.d4.j(wallPaper))) {
                        boolean a10 = e6Var3 != null ? e6Var3.a() : org.telegram.ui.ActionBar.j6.I.q();
                        imageReceiver5.f();
                        String j11 = org.telegram.messenger.d4.j(wallPaper);
                        int i41 = hi.x5.C0;
                        org.telegram.ui.ActionBar.p3 i42 = org.telegram.messenger.d4.f(i20).i(ig.b.d(j11));
                        Drawable s02 = i42 == null ? org.telegram.ui.ActionBar.j6.s0() : hi.x5.g(i20, i42, a10);
                        this.K = s02;
                        if (s02 != null) {
                            s02.setCallback(this);
                        }
                    } else if (wallPaper != null && (str4 = wallPaper.uploadingImage) != null) {
                        imageReceiver5.r0(gc.g(str4), "150_150_wallpaper" + wallPaper.id + dn.e(wallPaper.settings), null, null, dn.b(wallPaper), 0L, null, wallPaper, 1);
                        this.K = null;
                    } else if (wallPaper != null) {
                        TLObject tLObject = gjVar4.n0;
                        imageReceiver5.r0(gc.b(tLObject instanceof TLRPC.Document ? (TLRPC.Document) tLObject : wallPaper.document), "150_150_wallpaper" + wallPaper.id + dn.e(wallPaper.settings), null, null, dn.b(wallPaper), 0L, null, wallPaper, 1);
                        imageReceiver5 = imageReceiver5;
                        this.K = null;
                    } else {
                        imageReceiver5 = imageReceiver5;
                        this.K = null;
                    }
                    imageReceiver5.J0((int) (this.i1 / 2.0f));
                    if (S(gjVar) != 1.0f) {
                        boolean z17 = !z13;
                        radialProgress22.p(z17, 1.0f);
                        radialProgress22.setIcon(4, z17, z17);
                    } else {
                        boolean z18 = !z13;
                        radialProgress22.setIcon(3, z18, z18);
                    }
                }
            }
            TLRPC.Message message6 = gjVar4.k;
            wallPaper = (message6 == null || (messageAction = message6.action) == null) ? null : messageAction.wallpaper;
            if (TextUtils.isEmpty(org.telegram.messenger.d4.j(wallPaper))) {
            }
            imageReceiver5.J0((int) (this.i1 / 2.0f));
            if (S(gjVar) != 1.0f) {
            }
        }
        e6Var2 = e6Var3;
        i11 = i20;
        i12 = 8;
        if (!this.l0) {
        }
        i01Var = this.o0;
        if (i01Var != null) {
        }
        i17 = 0;
        this.m0 = 0;
        paddingTop = getPaddingTop();
        i18 = this.m0;
        if (paddingTop != i18) {
        }
        this.U1.setVisibility((X(gjVar) || U()) ? i12 : i17);
        qg.c.b(gjVar4);
        requestLayout();
    }

    public final void i0(int i7, int i10) {
        this.U0 = i7;
        this.V0 = i10;
    }

    @Override // org.telegram.ui.Cells.z, android.view.View, org.telegram.ui.Cells.p9
    public final void invalidate() {
        super.invalidate();
        View view = this.w;
        if (view != null) {
            view.invalidate();
        }
        Runnable runnable = this.p2;
        if (runnable != null) {
            runnable.run();
        }
        if (!this.o2 || getParent() == null) {
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

    public final void j0(float f10, int i7) {
        this.x0 = true;
        this.w0 = i7;
        this.u0 = f10;
        this.v0 = 0.0f;
    }

    public final void k0(boolean z10) {
        if (getMeasuredWidth() != 0) {
            D(getMeasuredWidth(), this.S0);
            invalidate();
        }
        if (this.D0) {
            v();
        } else if (z10) {
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
        this.e2 = true;
        this.J.P();
        setStarsPaused(false);
        this.s0 = org.telegram.ui.Components.p5.update(0, this, (!this.s || (q0Var = this.g1) == null || q0Var.g()) ? false : true, this.s0, this.N);
        r0 r0Var = this.t1;
        if (r0Var != null) {
            r0Var.h = org.telegram.ui.Components.p5.update(0, (View) r0Var.i, false, (org.telegram.ui.Components.l5) r0Var.h, (StaticLayout) r0Var.f);
        }
        int i7 = this.I;
        ns.f(i7).c(this, ns.W2);
        ns.f(i7).c(this, ns.X2);
        ns.f(i7).c(this, ns.F3);
        ns.f(i7).c(this, ns.y0);
        ns.f(i7).c(this, ns.a4);
        ns.e().c(this, ns.i4);
        gj gjVar = this.Q0;
        if (gjVar != null && gjVar.D == 21) {
            h0(gjVar, true);
        }
        di.e6 e6Var = this.I0;
        if (e6Var != null) {
            e6Var.a();
        }
        ch.q0 q0Var2 = this.F0;
        ArrayList arrayList = q0Var2.s;
        q0Var2.D = true;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            ((ch.n0) arrayList.get(i10)).a();
        }
        i01 i01Var = this.o0;
        if (i01Var != null) {
            i01Var.a();
        }
        mw0 mw0Var = this.P0;
        if (mw0Var != null) {
            mw0Var.d.R(mw0Var.b);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.e2 = false;
        int i7 = this.I;
        org.telegram.messenger.z5.q(i7).v(this);
        this.J.R();
        setStarsPaused(true);
        this.D0 = false;
        org.telegram.ui.Components.p5.release(this, this.s0);
        r0 r0Var = this.t1;
        if (r0Var != null) {
            org.telegram.ui.Components.p5.release((t0) r0Var.i, (org.telegram.ui.Components.l5) r0Var.h);
        }
        ns.f(i7).n(this, ns.W2);
        ns.f(i7).n(this, ns.X2);
        ns.f(i7).n(this, ns.F3);
        ns.f(i7).n(this, ns.y0);
        ns.f(i7).n(this, ns.a4);
        ns.e().n(this, ns.i4);
        this.e0.g();
        this.s2.a = false;
        di.e6 e6Var = this.I0;
        if (e6Var != null) {
            e6Var.S = false;
            e6Var.d.R();
            e6Var.e.b();
            bi.g1 g1Var = e6Var.y;
            g1Var.d.R();
            org.telegram.ui.Components.p5.release((View) null, g1Var.q);
            g1Var.q = null;
        }
        this.F0.p();
        i01 i01Var = this.o0;
        if (i01Var != null) {
            i01Var.b();
        }
        mw0 mw0Var = this.P0;
        if (mw0Var != null) {
            mw0Var.d.R(null);
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
        oy0 oy0Var;
        float i13;
        Paint R;
        boolean a10;
        ColorMatrix colorMatrix;
        int i14;
        float f16;
        t0 t0Var2;
        int i15;
        oy0 oy0Var2;
        q0 q0Var;
        int size;
        int i16;
        TextPaint textPaint2;
        Canvas canvas3 = canvas;
        canvas3.save();
        canvas3.translate(this.k0 / 2.0f, getPaddingTop());
        gj gjVar = this.Q0;
        float d = this.r1.d(!this.p1);
        int i17 = this.i1;
        boolean U = U();
        fi.h7 h7Var = this.e0;
        TextPaint textPaint3 = this.G1;
        ImageReceiver imageReceiver = this.J;
        if (!U && this.P0 == null && X(gjVar)) {
            this.i1 = this.j1 - org.telegram.messenger.g0.L(106.0f);
            if (Z()) {
                i17 = Q(gjVar);
                float f17 = (this.W - i17) / 2.0f;
                float L2 = org.telegram.messenger.g0.L(16.0f) + org.telegram.messenger.g0.L(4.0f) + this.T + this.P;
                if (gjVar.z4()) {
                    h7Var.d = gjVar.k.media.storyItem;
                }
                float f18 = i17;
                h7Var.F.set(f17, L2, f17 + f18, f18 + L2);
                int i18 = gjVar.D;
                if (i18 == 31 || i18 == 33 || i18 == 34 || i18 == 35) {
                    f17 += org.telegram.messenger.g0.L(10.0f);
                    L2 += org.telegram.messenger.g0.L(10.0f);
                    i17 -= org.telegram.messenger.g0.L(20.0f);
                }
                if (gjVar.D == 37) {
                    f17 += org.telegram.messenger.g0.L(2.0f);
                }
                imageReceiver.y0(f17, L2, Math.max(0, i17), Math.max(0, i17));
                int i19 = gjVar.D;
                if (i19 == 31 || i19 == 33 || i19 == 34 || i19 == 35) {
                    i17 = org.telegram.messenger.g0.L(20.0f) + i17;
                }
            } else {
                int i20 = gjVar.D;
                if (i20 == 11) {
                    int i21 = this.W;
                    float f19 = this.i1;
                    imageReceiver.y0((i21 - r3) / 2.0f, (this.j1 * 0.075f) + this.T + this.P, f19, f19);
                } else {
                    if (i20 == 25) {
                        i17 = (int) (this.i1 * (org.telegram.messenger.g0.Q1() ? 1.0f : 1.2f));
                        float f20 = i17;
                        imageReceiver.y0((this.W - i17) / 2.0f, ((this.j1 * 0.075f) + (this.T + this.P)) - org.telegram.messenger.g0.L(22.0f), f20, f20);
                    } else if (gjVar.s4()) {
                        float f21 = i17;
                        imageReceiver.y0((this.W - i17) / 2.0f, (this.j1 * 0.075f) + this.T + this.P + org.telegram.messenger.g0.L(2.0f), f21, f21);
                    } else if (gjVar.D == 30) {
                        i17 = (int) (this.i1 * 1.1f);
                        TLRPC.Message message = gjVar.k;
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
        H(canvas3, false);
        if (V()) {
            canvas3.save();
            int width = getWidth();
            this.J0.getClass();
            float h = (width - org.telegram.ui.Wallet.c4.h()) / 2.0f;
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
            q0 q0Var2 = this.g1;
            if (q0Var2 == null || q0Var2.g()) {
                this.I0.c(canvas3);
            }
            canvas3.restore();
        } else if (this.P0 != null) {
            canvas3.save();
            this.P0.a(canvas3);
            canvas3.restore();
        } else if (X(gjVar) || (gjVar != null && gjVar.D == 11)) {
            bi.e2 e2Var = this.T0;
            if (e2Var != null && ((i10 = gjVar.D) == 31 || i10 == 37 || i10 == 33)) {
                e2Var.setBounds((int) (imageReceiver.x() - org.telegram.messenger.g0.L(13.33f)), (int) (imageReceiver.z() - org.telegram.messenger.g0.L(14.0f)), (int) (imageReceiver.w() + imageReceiver.x() + org.telegram.messenger.g0.L(13.33f)), (int) (imageReceiver.v() + imageReceiver.z() + org.telegram.messenger.g0.L(14.0f)));
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
            } else if (gjVar.z4()) {
                TLRPC.MessageMedia messageMedia = gjVar.k.media;
                long j3 = messageMedia.user_id;
                h7Var.c = messageMedia.id;
                fi.l7.h(j3, canvas3, imageReceiver, h7Var);
            } else {
                imageReceiver.g(canvas3);
            }
            c10 = '%';
            if (gjVar.D == 37) {
                bg.s.a(canvas3, org.telegram.ui.ActionBar.j6.S0, imageReceiver.x() + org.telegram.messenger.g0.L(26.0f), imageReceiver.z() + org.telegram.messenger.g0.L(26.0f), org.telegram.messenger.g0.L(52.0f));
            }
            radialProgress22.a.set(imageReceiver.x(), imageReceiver.z(), imageReceiver.w() + imageReceiver.x(), imageReceiver.v() + imageReceiver.z());
            int i23 = gjVar.D;
            if (i23 == 21) {
                m30 m30Var = (m30) np.s1(this.I).C7.get(gjVar.k.local_id);
                if (m30Var != null) {
                    radialProgress22.p(true, m30Var.X);
                    radialProgress22.setCircleRadius(((int) (imageReceiver.w() * 0.5f)) + 1);
                    radialProgress22.G = org.telegram.messenger.g0.L(24.0f);
                    radialProgress22.g(org.telegram.ui.ActionBar.j6.cf, org.telegram.ui.ActionBar.j6.df, org.telegram.ui.ActionBar.j6.ef, org.telegram.ui.ActionBar.j6.ff);
                    if (m30Var.X == 1.0f) {
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
                    float S = S(gjVar);
                    radialProgress22.p(true, S);
                    radialProgress22.setCircleRadius(org.telegram.messenger.g0.L(26.0f));
                    radialProgress22.G = org.telegram.messenger.g0.L(24.0f);
                    radialProgress22.g(org.telegram.ui.ActionBar.j6.cf, org.telegram.ui.ActionBar.j6.df, org.telegram.ui.ActionBar.j6.ef, org.telegram.ui.ActionBar.j6.ff);
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
                q0 q0Var3 = this.g1;
                if (q0Var3 == null || q0Var3.g()) {
                    int i24 = i7;
                    StaticLayout staticLayout = this.N;
                    radialProgress2 = radialProgress22;
                    i11 = i24;
                    org.telegram.ui.Components.p5.drawAnimatedEmojis(canvas, staticLayout, this.s0, 0.0f, arrayList, 0.0f, 0.0f, 0.0f, 1.0f, staticLayout == null ? null : P(staticLayout.getPaint().getColor()));
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
                q0Var = this.g1;
                if (q0Var != null || q0Var.g()) {
                    StaticLayout staticLayout2 = this.Q;
                    org.telegram.ui.Components.l5 l5Var = this.s0;
                    StaticLayout staticLayout3 = this.N;
                    org.telegram.ui.Components.p5.drawAnimatedEmojis(canvas, staticLayout2, l5Var, 0.0f, arrayList, 0.0f, 0.0f, 0.0f, 1.0f, staticLayout3 != null ? null : P(staticLayout3.getPaint().getColor()));
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
            if (U() && X(gjVar)) {
                canvas3.save();
                float f25 = (this.W - this.j1) / 2.0f;
                if (gjVar.D != i11) {
                    f25 += org.telegram.messenger.g0.L(8.0f);
                }
                float f26 = f25;
                if (Z()) {
                    RectF rectF = this.N1;
                    f10 = (rectF != null ? rectF.top : org.telegram.messenger.g0.L(4.0f) + this.T + this.P) + (i22 > 0 ? org.telegram.messenger.k5.D(16.0f, 2, i22) : org.telegram.messenger.g0.L(16.0f));
                } else {
                    float f27 = (this.j1 * 0.075f) + this.T + this.P;
                    if (gjVar.D != 21) {
                        i22 = this.i1;
                    }
                    float L4 = f27 + i22 + org.telegram.messenger.g0.L(4.0f);
                    if (gjVar.D == 21) {
                        L4 += org.telegram.messenger.g0.L(16.0f);
                    }
                    f10 = L4;
                    if (gjVar.s4()) {
                        f10 += org.telegram.messenger.g0.L(12.0f);
                    } else if (gjVar.D == 30 && !gjVar.s4()) {
                        f10 -= org.telegram.messenger.g0.L(3.66f);
                    }
                }
                int i26 = gjVar.D;
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
                    L = height + org.telegram.messenger.g0.L(gjVar.D == 25 ? 6.0f : 0.0f);
                } else {
                    L = f10 - org.telegram.messenger.g0.L(4.0f);
                }
                float f28 = L;
                canvas3.restore();
                StaticLayout staticLayout4 = this.k1;
                int i27 = TLObject.FLAG_28;
                if (staticLayout4 == null || (oy0Var2 = this.m1) == null) {
                    i12 = 33;
                    canvas2 = canvas3;
                    f11 = 0.0f;
                } else {
                    float k10 = oy0Var2.k() + org.telegram.messenger.g0.L(12.0f);
                    float A = com.google.android.gms.internal.vision.e2.A(this.j1 - org.telegram.messenger.g0.L(16.0f), k10, 2.0f, f26);
                    float height2 = f10 + this.k1.getHeight() + org.telegram.messenger.g0.L(14.0f);
                    if (this.l1 == null) {
                        this.l1 = new Paint(1);
                    }
                    this.l1.setColor(org.telegram.ui.ActionBar.j6.j1() ? 285212671 : 268435456);
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
                if (gjVar.D == 18) {
                    L5 += org.telegram.messenger.g0.L(2.0f);
                }
                float f29 = L5;
                canvas2.save();
                canvas2.translate(f26, f29);
                if (gjVar.D == i11) {
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
                                r0 r0Var = this.t1;
                                f16 = f26;
                                f14 = f11;
                                f15 = 8.0f;
                                f12 = 0.2f;
                                xh.f.g(this, false, color, 0, (AtomicReference) r0Var.g, 1, (StaticLayout) r0Var.f, r0Var.c, canvas, false);
                                r0 r0Var2 = this.t1;
                                org.telegram.ui.Components.p5.drawAnimatedEmojis(canvas, (StaticLayout) r0Var2.f, (org.telegram.ui.Components.l5) r0Var2.h, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f, P(textPaint3.getColor()));
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
                    if (this.B1 == null) {
                        TextPaint textPaint6 = new TextPaint();
                        this.A1 = textPaint6;
                        textPaint6.setTextSize(org.telegram.messenger.g0.L(13.0f));
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(hd.L0(2131754558));
                        int indexOf = spannableStringBuilder.toString().indexOf("...");
                        if (indexOf < 0) {
                            indexOf = spannableStringBuilder.toString().indexOf("…");
                            i15 = 1;
                        } else {
                            i15 = 3;
                        }
                        if (indexOf >= 0) {
                            SpannableString spannableString = new SpannableString("…");
                            fi.o9 o9Var = new fi.o9();
                            o9Var.r = true;
                            o9Var.b(this);
                            spannableString.setSpan(o9Var, 0, spannableString.length(), i28);
                            spannableStringBuilder.replace(indexOf, indexOf + i15, (CharSequence) spannableString);
                        }
                        TextPaint textPaint7 = this.A1;
                        r0 r0Var3 = this.t1;
                        this.B1 = new StaticLayout(spannableStringBuilder, textPaint7, r0Var3 == null ? 1 : r0Var3.d, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                    }
                    float S2 = S(gjVar);
                    if (this.D1 == null || this.C1 != S2) {
                        this.C1 = S2;
                        String n10 = a8.p0.n((int) (S2 * 100.0f), "%", new StringBuilder());
                        r0 r0Var4 = this.t1;
                        this.D1 = new StaticLayout(n10, textPaint3, r0Var4 == null ? 1 : r0Var4.d, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
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
                            r0 r0Var5 = this.t1;
                            xh.f.g(this, false, color3, 0, (AtomicReference) r0Var5.g, 1, (StaticLayout) r0Var5.f, r0Var5.c, canvas3, false);
                            r0 r0Var6 = this.t1;
                            t0Var2 = this;
                            org.telegram.ui.Components.p5.drawAnimatedEmojis(canvas, (StaticLayout) r0Var6.f, (org.telegram.ui.Components.l5) r0Var6.h, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f, P(textPaint3.getColor()));
                            canvas3 = canvas;
                            canvas3.restore();
                        } else {
                            t0Var2 = this;
                        }
                        textPaint3.setAlpha((int) (Color.alpha(color2) * f30));
                        textPaint3.linkColor = textPaint3.getColor();
                        float f32 = (f30 * 0.2f) + 0.8f;
                        canvas3.save();
                        canvas3.scale(f32, f32, t0Var2.j1 / 2.0f, t0Var2.B1.getHeight() / 2.0f);
                        canvas3.translate((t0Var2.j1 - t0Var2.B1.getWidth()) / 2.0f, f14);
                        xh.f.f(canvas3, t0Var2.B1);
                        canvas3.restore();
                        canvas3.save();
                        canvas3.translate(f14, org.telegram.messenger.g0.L(4.0f) + t0Var2.B1.getHeight());
                        canvas3.scale(f32, f32, t0Var2.j1 / 2.0f, t0Var2.D1.getHeight() / 2.0f);
                        canvas3.translate((t0Var2.j1 - t0Var2.D1.getWidth()) / 2.0f, f14);
                        xh.f.f(canvas3, t0Var2.D1);
                        canvas3.restore();
                        textPaint3.setColor(color2);
                        textPaint3.linkColor = color2;
                    } else {
                        t0Var2 = this;
                        canvas3.save();
                        canvas3.translate((t0Var2.j1 - t0Var2.B1.getWidth()) / 2.0f, f14);
                        t0Var2.B1.draw(canvas3);
                        canvas3.restore();
                        canvas3.save();
                        canvas3.translate((t0Var2.j1 - t0Var2.D1.getWidth()) / 2.0f, org.telegram.messenger.g0.L(4.0f) + t0Var2.B1.getHeight());
                        xh.f.f(canvas3, t0Var2.D1);
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
                    r0 r0Var7 = this.t1;
                    if (r0Var7 != null) {
                        float height3 = ((StaticLayout) r0Var7.f).getHeight();
                        if (d < 1.0f) {
                            height3 = org.telegram.messenger.g0.T1(this.q1, height3, d);
                            RectF rectF3 = org.telegram.messenger.g0.P;
                            rectF3.set(f14, -org.telegram.messenger.g0.L(20.0f), getWidth(), height3);
                            canvas3.saveLayerAlpha(rectF3, ns.e4, 31);
                        } else {
                            canvas3.save();
                        }
                        canvas3.translate(((this.j1 - org.telegram.messenger.g0.L(16.0f)) - ((StaticLayout) this.t1.f).getWidth()) / 2.0f, f14);
                        this.t1.b = (((this.j1 - org.telegram.messenger.g0.L(16.0f)) - ((StaticLayout) this.t1.f).getWidth()) / 2.0f) + f13;
                        r0 r0Var8 = this.t1;
                        r0Var8.e = f29;
                        int color4 = r0Var8.a.getColor();
                        r0 r0Var9 = this.t1;
                        float f33 = height3;
                        xh.f.g(this, false, color4, 0, (AtomicReference) r0Var9.g, 1, (StaticLayout) r0Var9.f, r0Var9.c, canvas3, false);
                        r0 r0Var10 = this.t1;
                        StaticLayout staticLayout5 = (StaticLayout) r0Var10.f;
                        org.telegram.ui.Components.l5 l5Var2 = (org.telegram.ui.Components.l5) r0Var10.h;
                        ColorFilter P = P(textPaint3.getColor());
                        t0Var = this;
                        org.telegram.ui.Components.p5.drawAnimatedEmojis(canvas, staticLayout5, l5Var2, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f, P);
                        canvas3 = canvas;
                        if (d < 1.0f && t0Var.x1 != null) {
                            canvas3.save();
                            if (t0Var.s1 == null) {
                                t0Var.s1 = new h6.m(29);
                            }
                            canvas3.translate((-((t0Var.j1 - org.telegram.messenger.g0.L(16.0f)) - ((StaticLayout) t0Var.t1.f).getWidth())) / 2.0f, f14);
                            RectF rectF4 = org.telegram.messenger.g0.P;
                            rectF4.set((t0Var.u1 - t0Var.x1.g()) + org.telegram.messenger.g0.L(8.0f), (t0Var.v1 - t0Var.w1) - org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f) + t0Var.u1, t0Var.v1);
                            float f34 = 1.0f - d;
                            t0Var.s1.k(canvas3, rectF4, f34);
                            rectF4.set((t0Var.u1 - t0Var.x1.g()) - org.telegram.messenger.g0.L(16.0f), (t0Var.v1 - t0Var.w1) - org.telegram.messenger.g0.L(6.0f), (t0Var.u1 - t0Var.x1.g()) + org.telegram.messenger.g0.L(8.0f), t0Var.v1);
                            t0Var.s1.m(canvas3, rectF4, 2, f34);
                            rectF4.set(f14, f33 - org.telegram.messenger.g0.L(12.0f), t0Var.getWidth(), f33);
                            t0Var.s1.m(canvas3, rectF4, 3, (1.0f - f34) * f34 * 4.0f);
                            canvas3.restore();
                        }
                        canvas3.restore();
                        if (d < 1.0f && (oy0Var = t0Var.x1) != null) {
                            oy0Var.c((t0Var.u1 - oy0Var.g()) + org.telegram.messenger.g0.L(5.0f), (t0Var.v1 - (t0Var.w1 / 2.0f)) - org.telegram.messenger.g0.L(1.0f), 1.0f - d, t0Var.t1.a.getColor(), canvas3);
                        }
                    } else {
                        t0Var = this;
                    }
                }
                canvas3.restore();
                if (t0Var.k1 == null) {
                    org.telegram.messenger.g0.L(f15);
                }
                r0 r0Var11 = t0Var.t1;
                if (r0Var11 != null) {
                    ((StaticLayout) r0Var11.f).getHeight();
                }
                StaticLayout staticLayout6 = t0Var.y1;
                if (staticLayout6 != null) {
                    staticLayout6.getHeight();
                }
                t0Var.getHeight();
                org.telegram.messenger.g0.L(f15);
                org.telegram.ui.ActionBar.e6 e6Var = t0Var.h1;
                if (e6Var != null) {
                    e6Var.b(t0Var.v0, t0Var.u0 + org.telegram.messenger.g0.L(4.0f), t0Var.getMeasuredWidth(), t0Var.w0);
                } else {
                    org.telegram.ui.ActionBar.j6.r(t0Var.v0, t0Var.u0 + org.telegram.messenger.g0.L(4.0f), t0Var.getMeasuredWidth(), t0Var.w0);
                }
                float a11 = t0Var.n.a(0.02f);
                canvas3.save();
                RectF rectF5 = t0Var.p0;
                canvas3.scale(a11, a11, rectF5.centerX(), rectF5.centerY());
                if (t0Var.y1 != null) {
                    canvas3.drawRoundRect(rectF5, org.telegram.messenger.g0.L(15.0f), org.telegram.messenger.g0.L(15.0f), t0Var.R("paintChatActionBackgroundSelected"));
                    if (t0Var.T()) {
                        canvas3.drawRoundRect(rectF5, org.telegram.messenger.g0.L(15.0f), org.telegram.messenger.g0.L(15.0f), t0Var.R("paintChatActionBackgroundDarken"));
                    }
                    float f35 = t0Var.c2;
                    Paint paint = t0Var.d2;
                    if (f35 > f14) {
                        canvas3.drawRoundRect(rectF5, org.telegram.messenger.g0.L(15.0f), org.telegram.messenger.g0.L(15.0f), paint);
                    }
                    if (t0Var.getMessageObject().D == 31 || t0Var.getMessageObject().D == 37 || t0Var.getMessageObject().D == 33) {
                        boolean a12 = e6Var != null ? e6Var.a() : org.telegram.ui.ActionBar.j6.j1();
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
                        Path path2 = t0Var.V1;
                        path2.rewind();
                        path2.addRoundRect(rectF5, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), Path.Direction.CW);
                        canvas3.save();
                        canvas3.clipPath(path2);
                        ug.r1 r1Var = t0Var.W1;
                        r1Var.d(canvas3);
                        if (!r1Var.g) {
                            t0Var.invalidate();
                        }
                        canvas3.restore();
                    }
                }
                boolean z10 = gjVar.q;
                if (z10) {
                    float f36 = t0Var.d0;
                    if (f36 != 1.0f) {
                        t0Var.d0 = f36 + 0.10666667f;
                        i13 = Utilities.i(t0Var.d0, 1.0f, f14);
                        t0Var.d0 = i13;
                        if (i13 != f14) {
                            if (t0Var.c0 == null) {
                                t0Var.c0 = new RadialProgressView(t0Var.getContext());
                            }
                            int L6 = org.telegram.messenger.g0.L(16.0f);
                            canvas3.save();
                            float f37 = t0Var.d0;
                            canvas3.scale(f37, f37, rectF5.centerX(), rectF5.centerY());
                            t0Var.c0.setSize(L6);
                            t0Var.c0.setProgressColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Zc));
                            t0Var.c0.a(canvas3, rectF5.centerX(), rectF5.centerY());
                            canvas3.restore();
                        }
                        if (t0Var.d0 != 1.0f && t0Var.y1 != null) {
                            canvas3.save();
                            float f38 = 1.0f - t0Var.d0;
                            canvas3.scale(f38, f38, rectF5.centerX(), rectF5.centerY());
                            canvas3.translate(f13, rectF5.top + org.telegram.messenger.g0.L(7.0f));
                            canvas3.translate(((t0Var.j1 - org.telegram.messenger.g0.L(16.0f)) - t0Var.y1.getWidth()) / 2.0f, f14);
                            t0Var.y1.draw(canvas3);
                            canvas3.restore();
                        }
                        if (gjVar.r) {
                            d80 d80Var = t0Var.r;
                            if (d80Var != null) {
                                d80Var.e(rectF5);
                                t0Var.r.k(16.0f);
                                t0Var.r.a();
                                t0Var.r.draw(canvas3);
                                if (t0Var.r.c()) {
                                    t0Var.r.b = -1L;
                                }
                            }
                        } else {
                            if (t0Var.r == null) {
                                d80 d80Var2 = new d80(e6Var);
                                t0Var.r = d80Var2;
                                d80Var2.h();
                                d80 d80Var3 = t0Var.r;
                                d80Var3.D = true;
                                float f39 = f12;
                                d80Var3.g(org.telegram.ui.ActionBar.j6.r1(0.08f, -1), org.telegram.ui.ActionBar.j6.r1(f39, -1), org.telegram.ui.ActionBar.j6.r1(f39, -1), org.telegram.ui.ActionBar.j6.r1(0.7f, -1));
                                t0Var.r.x.setStrokeWidth(org.telegram.messenger.g0.L(1.0f));
                            }
                            d80 d80Var4 = t0Var.r;
                            d80Var4.c = -1L;
                            d80Var4.e(rectF5);
                            t0Var.r.k(16.0f);
                            t0Var.r.draw(canvas3);
                        }
                        canvas3.restore();
                        if (t0Var.N1 != null && t0Var.S1 != null && t0Var.T1 != null) {
                            R = t0Var.R("paintChatActionBackground");
                            Paint R2 = t0Var.R("paintChatActionBackgroundDarken");
                            float L7 = (t0Var.N1.right - org.telegram.messenger.g0.L(65.0f)) + org.telegram.messenger.g0.L(2.0f);
                            float L8 = t0Var.N1.top - org.telegram.messenger.g0.L(2.0f);
                            if (e6Var == null) {
                                e6Var.b(t0Var.v0 + L7, t0Var.u0 + org.telegram.messenger.g0.L(4.0f) + L8, t0Var.getMeasuredWidth(), t0Var.w0);
                            } else {
                                org.telegram.ui.ActionBar.j6.r(t0Var.v0 + L7, t0Var.u0 + org.telegram.messenger.g0.L(4.0f) + L8, t0Var.getMeasuredWidth(), t0Var.w0);
                            }
                            canvas3.save();
                            canvas3.translate(L7, L8);
                            ColorFilter colorFilter = R.getColorFilter();
                            PathEffect pathEffect = R.getPathEffect();
                            a10 = e6Var == null ? e6Var.a() : org.telegram.ui.ActionBar.j6.j1();
                            if (t0Var.Q1 != null || t0Var.P1 != a10) {
                                colorMatrix = new ColorMatrix();
                                if ((R.getColorFilter() instanceof ColorMatrixColorFilter) && Build.VERSION.SDK_INT >= 26) {
                                    ((ColorMatrixColorFilter) R.getColorFilter()).getColorMatrix(colorMatrix);
                                }
                                org.telegram.messenger.g0.h(colorMatrix, !a10 ? 0.1f : -0.08f);
                                org.telegram.messenger.g0.i(colorMatrix, a10 ? 0.15f : 0.1f);
                                t0Var.Q1 = new ColorMatrixColorFilter(colorMatrix);
                                t0Var.P1 = a10;
                            }
                            R.setColorFilter(t0Var.Q1);
                            R.setPathEffect(t0Var.R1);
                            canvas3.drawPath(t0Var.S1, R);
                            R.setColorFilter(colorFilter);
                            R.setPathEffect(pathEffect);
                            if (t0Var.T()) {
                                PathEffect pathEffect2 = R2.getPathEffect();
                                R2.setPathEffect(t0Var.R1);
                                canvas3.drawPath(t0Var.S1, R2);
                                R2.setPathEffect(pathEffect2);
                            }
                            canvas3.rotate(45.0f, org.telegram.messenger.g0.L(40.43f), org.telegram.messenger.g0.L(24.56f));
                            t0Var.T1.c(org.telegram.messenger.g0.L(40.43f) - (t0Var.T1.g() / 2.0f), org.telegram.messenger.g0.L(26.0f), 1.0f, -1, canvas3);
                            canvas3.restore();
                        }
                    }
                }
                if (!z10) {
                    float f40 = t0Var.d0;
                    if (f40 != f14) {
                        t0Var.d0 = f40 - 0.10666667f;
                    }
                }
                i13 = Utilities.i(t0Var.d0, 1.0f, f14);
                t0Var.d0 = i13;
                if (i13 != f14) {
                }
                if (t0Var.d0 != 1.0f) {
                    canvas3.save();
                    float f382 = 1.0f - t0Var.d0;
                    canvas3.scale(f382, f382, rectF5.centerX(), rectF5.centerY());
                    canvas3.translate(f13, rectF5.top + org.telegram.messenger.g0.L(7.0f));
                    canvas3.translate(((t0Var.j1 - org.telegram.messenger.g0.L(16.0f)) - t0Var.y1.getWidth()) / 2.0f, f14);
                    t0Var.y1.draw(canvas3);
                    canvas3.restore();
                }
                if (gjVar.r) {
                }
                canvas3.restore();
                if (t0Var.N1 != null) {
                    R = t0Var.R("paintChatActionBackground");
                    Paint R22 = t0Var.R("paintChatActionBackgroundDarken");
                    float L72 = (t0Var.N1.right - org.telegram.messenger.g0.L(65.0f)) + org.telegram.messenger.g0.L(2.0f);
                    float L82 = t0Var.N1.top - org.telegram.messenger.g0.L(2.0f);
                    if (e6Var == null) {
                    }
                    canvas3.save();
                    canvas3.translate(L72, L82);
                    ColorFilter colorFilter2 = R.getColorFilter();
                    PathEffect pathEffect3 = R.getPathEffect();
                    if (e6Var == null) {
                    }
                    if (t0Var.Q1 != null) {
                    }
                    colorMatrix = new ColorMatrix();
                    if (R.getColorFilter() instanceof ColorMatrixColorFilter) {
                        ((ColorMatrixColorFilter) R.getColorFilter()).getColorMatrix(colorMatrix);
                    }
                    org.telegram.messenger.g0.h(colorMatrix, !a10 ? 0.1f : -0.08f);
                    org.telegram.messenger.g0.i(colorMatrix, a10 ? 0.15f : 0.1f);
                    t0Var.Q1 = new ColorMatrixColorFilter(colorMatrix);
                    t0Var.P1 = a10;
                    R.setColorFilter(t0Var.Q1);
                    R.setPathEffect(t0Var.R1);
                    canvas3.drawPath(t0Var.S1, R);
                    R.setColorFilter(colorFilter2);
                    R.setPathEffect(pathEffect3);
                    if (t0Var.T()) {
                    }
                    canvas3.rotate(45.0f, org.telegram.messenger.g0.L(40.43f), org.telegram.messenger.g0.L(24.56f));
                    t0Var.T1.c(org.telegram.messenger.g0.L(40.43f) - (t0Var.T1.g() / 2.0f), org.telegram.messenger.g0.L(26.0f), 1.0f, -1, canvas3);
                    canvas3.restore();
                }
            } else {
                t0Var = this;
            }
            t0Var.K(canvas3, false);
            t0Var.s2.a();
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
            q0Var = this.g1;
            if (q0Var != null) {
            }
            StaticLayout staticLayout22 = this.Q;
            org.telegram.ui.Components.l5 l5Var3 = this.s0;
            StaticLayout staticLayout32 = this.N;
            org.telegram.ui.Components.p5.drawAnimatedEmojis(canvas, staticLayout22, l5Var3, 0.0f, arrayList, 0.0f, 0.0f, 0.0f, 1.0f, staticLayout32 != null ? null : P(staticLayout32.getPaint().getColor()));
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
        t0Var = this;
        t0Var.K(canvas3, false);
        t0Var.s2.a();
        canvas3.restore();
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        gj gjVar = this.Q0;
        if (TextUtils.isEmpty(this.S0) && gjVar == null) {
            return;
        }
        if (this.n2 == null) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(!TextUtils.isEmpty(this.S0) ? this.S0 : gjVar.v);
            for (CharacterStyle characterStyle : (CharacterStyle[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), ClickableSpan.class)) {
                int spanStart = spannableStringBuilder.getSpanStart(characterStyle);
                int spanEnd = spannableStringBuilder.getSpanEnd(characterStyle);
                spannableStringBuilder.removeSpan(characterStyle);
                spannableStringBuilder.setSpan(new h(1, this, characterStyle), spanStart, spanEnd, 33);
            }
            this.n2 = spannableStringBuilder;
        }
        if (Build.VERSION.SDK_INT < 24) {
            accessibilityNodeInfo.setContentDescription(this.n2.toString());
        } else {
            accessibilityNodeInfo.setText(this.n2);
        }
        accessibilityNodeInfo.setEnabled(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        RectF rectF = this.p0;
        this.U1.layout((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        org.telegram.ui.Wallet.c4 c4Var = this.J0;
        org.telegram.ui.Wallet.b4 b4Var = c4Var == null ? null : c4Var.m;
        if (b4Var != null) {
            b4Var.layout(0, 0, org.telegram.messenger.g0.L(42.0f), org.telegram.messenger.g0.L(42.0f));
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
        int L3;
        int i13;
        int L4;
        int i14;
        org.telegram.ui.Wallet.c4 c4Var = this.J0;
        org.telegram.ui.Wallet.b4 b4Var = c4Var == null ? null : c4Var.m;
        if (b4Var != null) {
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(42.0f), TLObject.FLAG_30);
            b4Var.measure(makeMeasureSpec, makeMeasureSpec);
        }
        gj gjVar = this.Q0;
        if (gjVar == null && this.S0 == null) {
            setMeasuredDimension(View.MeasureSpec.getSize(i7), org.telegram.messenger.g0.L(14.0f) + this.m0 + this.P);
            return;
        }
        if (X(gjVar)) {
            this.j1 = i20.C(64.0f, (org.telegram.messenger.g0.q.y - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - org.telegram.messenger.g0.m, (int) (org.telegram.messenger.g0.Q1() ? org.telegram.messenger.g0.Q0() * 0.6f : (org.telegram.messenger.g0.q.x * 0.62f) - org.telegram.messenger.g0.L(34.0f)));
            if ((!org.telegram.messenger.g0.Q1() && ((i14 = gjVar.D) == 18 || i14 == 30 || Y())) || gjVar.D == 35) {
                this.j1 = (int) (this.j1 * 1.2f);
            }
            this.i1 = this.j1 - org.telegram.messenger.g0.L(106.0f);
            if (gjVar.D == 31) {
                this.j1 = Math.min(this.j1, org.telegram.messenger.g0.L(192.0f));
                this.i1 = org.telegram.messenger.g0.L(78.0f);
            }
            if (gjVar.D == 33) {
                this.j1 = Math.min(this.j1, org.telegram.messenger.g0.L(220.0f));
                this.i1 = org.telegram.messenger.g0.L(78.0f);
            }
            int i15 = gjVar.D;
            ImageReceiver imageReceiver = this.J;
            if (i15 == 37) {
                this.i1 = org.telegram.messenger.g0.L(52.0f);
                imageReceiver.J0(org.telegram.messenger.g0.L(14.0f));
            } else if (Z()) {
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
        if (gjVar != null) {
            f10 = 30.0f;
            if (gjVar.D == 11) {
                i13 = org.telegram.messenger.g0.u;
                L4 = org.telegram.messenger.g0.L(10.0f);
            } else if (X(gjVar)) {
                i13 = this.j1;
                L4 = org.telegram.messenger.g0.L(12.0f);
            } else if (V()) {
                f11 = 140.0f;
                i11 = (this.J0.q0 == null ? org.telegram.messenger.g0.L(140.0f) : ((int) Math.ceil(r3.q0.i())) + org.telegram.messenger.g0.L(150.0f)) + org.telegram.messenger.g0.L(8.0f);
                U = U();
                q0Var = this.F0;
                if (U) {
                    r9 = org.telegram.messenger.k5.C(8.0f, this.I0.P, this.I0.p ? 0 : org.telegram.messenger.g0.L(16.0f) + this.T + this.P);
                    if (!q0Var.p) {
                        L3 = org.telegram.messenger.g0.L(8.0f) + q0Var.m;
                        q0Var.n = L3;
                        r9 += L3;
                    }
                    f14 = 24.0f;
                } else {
                    mw0 mw0Var = this.P0;
                    if (mw0Var != null) {
                        r9 = org.telegram.messenger.g0.L(12.0f) + org.telegram.messenger.g0.L(f11) + ((int) mw0Var.f.i()) + (mw0Var.i ? org.telegram.messenger.g0.L(40.0f) : 0);
                        if (!q0Var.p) {
                            L3 = org.telegram.messenger.g0.L(8.0f) + q0Var.m;
                            q0Var.n = L3;
                            r9 += L3;
                        }
                    } else if (X(gjVar)) {
                        if (gjVar != null) {
                            f12 = 12.0f;
                            if (gjVar.D == 25) {
                                z10 = true;
                                int Q = Q(gjVar);
                                if (Z()) {
                                    f13 = 8.0f;
                                    f14 = 24.0f;
                                    L = (this.t1 == null ? 0 : org.telegram.messenger.g0.L(4.0f) + ((StaticLayout) r4.f).getHeight()) + (this.j1 * 0.075f) + this.T + this.P + Q + org.telegram.messenger.g0.L(4.0f);
                                } else {
                                    f14 = 24.0f;
                                    f13 = 8.0f;
                                    int L5 = org.telegram.messenger.g0.L(4.0f) + this.T + this.P + (Q > 0 ? org.telegram.messenger.k5.D(16.0f, 2, Q) : org.telegram.messenger.g0.L(16.0f));
                                    r0 r0Var = this.t1;
                                    L = L5 + (r0Var == null ? 0 : org.telegram.messenger.g0.L(4.0f) + ((StaticLayout) r0Var.f).getHeight());
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
                                r0 r0Var2 = this.t1;
                                int height2 = r0Var2 != null ? 0 : ((StaticLayout) r0Var2.f).getHeight();
                                if (this.t1 != null) {
                                    this.L1 = 0;
                                } else if (this.n1 != null) {
                                    this.L1 = org.telegram.messenger.k5.C(10.0f, height2, this.L1);
                                } else {
                                    gj gjVar2 = this.Q0;
                                    if (gjVar2.D == 18 || gjVar2.s4()) {
                                        this.L1 = i20.D(this.y1 == null ? 0.0f : 10.0f, height2, this.L1);
                                    } else if (this.Q0.D == 30) {
                                        this.L1 = i20.D(20.0f, height2, this.L1);
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
                                    gj gjVar3 = this.Q0;
                                    if (gjVar3 != null && (message = gjVar3.k) != null && (message.action instanceof TLRPC.TL_messageActionStarGift)) {
                                        i11 -= org.telegram.messenger.g0.L(f13);
                                        this.L1 -= org.telegram.messenger.g0.L(f13);
                                    }
                                }
                                measuredWidth = getMeasuredWidth() << (getMeasuredHeight() + 16);
                                ug.r1 r1Var = this.W1;
                                r1Var.a.set(rectF);
                                r1Var.b.set(rectF);
                                if (this.X1 != measuredWidth) {
                                    this.X1 = measuredWidth;
                                    r1Var.f();
                                }
                                if (Z()) {
                                    int L8 = org.telegram.messenger.g0.L(4.0f) + this.T + this.P;
                                    this.f = 0;
                                    int D = Q > 0 ? org.telegram.messenger.k5.D(16.0f, 2, Q) : org.telegram.messenger.g0.L(16.0f);
                                    this.f = D;
                                    StaticLayout staticLayout2 = this.n1;
                                    if (staticLayout2 != null) {
                                        this.f = org.telegram.messenger.k5.C(10.0f, staticLayout2.getHeight(), D);
                                    }
                                    if (this.m1 != null) {
                                        this.f = org.telegram.messenger.g0.L(15.0f) + this.f;
                                    }
                                    int i16 = this.f + height2;
                                    this.f = i16;
                                    float f17 = (this.W - this.E1) / f15;
                                    if (this.y1 != null) {
                                        this.h = org.telegram.messenger.g0.L(7.0f) + i16 + L8;
                                        rectF.set(f17 - org.telegram.messenger.g0.L(18.0f), this.h, f17 + this.E1 + org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.k5.D(f13, 2, this.y1.getHeight() + this.h));
                                        this.f = (int) (rectF.height() + org.telegram.messenger.g0.L(4.0f) + this.f);
                                    } else if (!Y() && (i12 = gjVar.D) != 34 && i12 != 33 && i12 != 35) {
                                        rectF.set(f17 - org.telegram.messenger.g0.L(18.0f), this.h, f17 + this.E1 + org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.k5.D(8.0f, 2, org.telegram.messenger.g0.L(17.0f) + this.h));
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
                        int Q2 = Q(gjVar);
                        if (Z()) {
                        }
                        this.L1 = 0;
                        if (this.k1 == null) {
                        }
                        r0 r0Var22 = this.t1;
                        if (r0Var22 != null) {
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
                        ug.r1 r1Var2 = this.W1;
                        r1Var2.a.set(rectF2);
                        r1Var2.b.set(rectF2);
                        if (this.X1 != measuredWidth) {
                        }
                        if (Z()) {
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
                if (Y()) {
                    i11 = org.telegram.messenger.k5.C(f14, this.R, i11);
                }
                if (gjVar == null && Z()) {
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
                int L122 = org.telegram.messenger.g0.L(8.0f) + q0Var.m;
                q0Var.n = L122;
                i11 += L122;
            }
            if (Y()) {
            }
            if (gjVar == null) {
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
        if (Y()) {
        }
        if (gjVar == null) {
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
    /* JADX WARN: Removed duplicated region for block: B:75:0x02f8  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int i7;
        boolean z10;
        m30 m30Var;
        r0 r0Var;
        lj ljVar;
        cg.a aVar;
        r0 r0Var2;
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
        int i10;
        t0 t0Var;
        boolean z17;
        m0 m0Var;
        gj gjVar = this.Q0;
        float x10 = motionEvent.getX() - (this.k0 / 2.0f);
        this.z0 = x10;
        float y10 = motionEvent.getY() + getPaddingTop();
        this.A0 = y10;
        boolean z18 = true;
        if (gjVar == null) {
            if (this.f2 != null) {
                if (motionEvent.getAction() == 0) {
                    if (x10 >= this.b1 && x10 <= this.c1) {
                        this.G = true;
                        return true;
                    }
                } else if (this.G) {
                    if (motionEvent.getAction() == 1) {
                        this.f2.onClick(this);
                        this.G = false;
                    } else if (motionEvent.getAction() == 3) {
                        this.G = false;
                    }
                }
            }
            return super.onTouchEvent(motionEvent);
        }
        i01 i01Var = this.o0;
        if (i01Var == null || !i01Var.d(motionEvent, false)) {
            mw0 mw0Var = this.P0;
            if (mw0Var != null) {
                dc dcVar = mw0Var.m;
                boolean contains = mw0Var.k.contains(motionEvent.getX(), motionEvent.getY());
                if (motionEvent.getAction() == 0) {
                    dcVar.c(contains);
                } else if (motionEvent.getAction() != 2) {
                    if (motionEvent.getAction() == 1) {
                        if (dcVar.i) {
                            mw0Var.b();
                        }
                        dcVar.c(false);
                    } else if (motionEvent.getAction() == 3) {
                        dcVar.c(false);
                    }
                }
            }
            if (!U() || !this.I0.e(this.G0, this.H0, motionEvent)) {
                if (V()) {
                    org.telegram.ui.Wallet.c4 c4Var = this.J0;
                    float f10 = (this.k0 / 2.0f) + this.L0;
                    float paddingTop = this.M0 + getPaddingTop();
                    ArrayList arrayList2 = c4Var.c;
                    dc dcVar2 = c4Var.Y;
                    float x11 = motionEvent.getX() - f10;
                    float y11 = motionEvent.getY() - paddingTop;
                    t0 t0Var2 = c4Var.a;
                    if (motionEvent.getActionMasked() == 0) {
                        float x12 = motionEvent.getX() - f10;
                        float y12 = motionEvent.getY() - paddingTop;
                        org.telegram.ui.Wallet.b4 b4Var = c4Var.m;
                        if (b4Var != null && b4Var.n && c4Var.w.contains((int) x12, (int) y12)) {
                            if (!c4Var.D && c4Var.C <= 1.001f) {
                                c4Var.A = c4Var.g();
                                c4Var.B = c4Var.k.F * 0.14f;
                            }
                            ValueAnimator valueAnimator = c4Var.G;
                            if (valueAnimator != null) {
                                valueAnimator.cancel();
                                c4Var.G = null;
                            }
                            c4Var.D = false;
                            c4Var.x = motionEvent.getPointerId(0);
                            c4Var.y = motionEvent.getX();
                            c4Var.z = motionEvent.getY();
                            c4Var.r0 = false;
                            dcVar2.c(false);
                            if (t0Var2.getParent() != null) {
                                t0Var2.getParent().requestDisallowInterceptTouchEvent(true);
                            }
                            c4Var.a(3.0f);
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
                        if (c4Var.q0 != null) {
                            TLRPC.TL_messageActionGramTransfer tL_messageActionGramTransfer = c4Var.l0;
                            if ((tL_messageActionGramTransfer.comment_encrypted || tL_messageActionGramTransfer.comment_encrypted_preparing) && !c4Var.m0) {
                                float L2 = x11 - ((org.telegram.messenger.g0.L(206.0f) - c4Var.q0.k()) / 2.0f);
                                float L3 = y11 - org.telegram.messenger.g0.L(143.0f);
                                int size = arrayList2.size();
                                int i11 = 0;
                                while (i11 < size) {
                                    Object obj = arrayList2.get(i11);
                                    i11++;
                                    t0Var = t0Var2;
                                    if (((xh.f) obj).getBounds().contains((int) L2, (int) L3)) {
                                        z17 = true;
                                        break;
                                    }
                                    t0Var2 = t0Var;
                                }
                            }
                        }
                        t0Var = t0Var2;
                        z17 = false;
                        boolean z20 = !z19 || z17;
                        if (motionEvent.getAction() != 0) {
                            c4Var.r0 = z20;
                            dcVar2.c(z20);
                        } else if (motionEvent.getAction() != 2) {
                            if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                                z18 = c4Var.r0;
                                boolean z21 = motionEvent.getAction() == 1 && z18 && z20;
                                c4Var.r0 = false;
                                dcVar2.c(false);
                                if (z21 && z17) {
                                    TLRPC.TL_messageActionGramTransfer tL_messageActionGramTransfer2 = c4Var.l0;
                                    if (tL_messageActionGramTransfer2.comment_encrypted_preparing) {
                                        c4Var.m0 = true;
                                        oy0 oy0Var = c4Var.q0;
                                        oy0Var.q(org.telegram.messenger.j6.m(tL_messageActionGramTransfer2.comment, oy0Var.a.getFontMetricsInt(), false, null, 0));
                                        c4Var.d.addAll(arrayList2);
                                        arrayList2.clear();
                                        t0Var.requestLayout();
                                        t0Var.invalidate();
                                        if (z18) {
                                        }
                                    }
                                }
                                if (z21 && (m0Var = c4Var.s0) != null) {
                                    m0Var.run();
                                }
                                if (z18) {
                                }
                            }
                            z18 = c4Var.r0;
                            if (z18) {
                            }
                        } else if (c4Var.r0) {
                            dcVar2.c(z20);
                        }
                        z18 = c4Var.r0;
                        if (z18) {
                        }
                    } else {
                        if (c4Var.x != -1) {
                            int actionMasked = motionEvent.getActionMasked();
                            if (actionMasked != 1) {
                                if (actionMasked == 2) {
                                    int findPointerIndex = motionEvent.findPointerIndex(c4Var.x);
                                    if (findPointerIndex < 0) {
                                        c4Var.j();
                                    } else {
                                        float radians = ((float) Math.toRadians(0.800000011920929d)) / org.telegram.messenger.g0.p;
                                        c4Var.A = com.google.android.gms.internal.vision.e2.z(motionEvent.getX(findPointerIndex), c4Var.y, radians, c4Var.A);
                                        c4Var.B = com.google.android.gms.internal.vision.e2.z(motionEvent.getY(findPointerIndex), c4Var.z, radians, c4Var.B);
                                        c4Var.y = motionEvent.getX(findPointerIndex);
                                        c4Var.z = motionEvent.getY(findPointerIndex);
                                        t0Var2.invalidate();
                                    }
                                } else if (actionMasked != 3) {
                                    if (actionMasked == 6 && motionEvent.getPointerId(motionEvent.getActionIndex()) == c4Var.x) {
                                        int i12 = motionEvent.getActionIndex() == 0 ? 1 : 0;
                                        c4Var.x = motionEvent.getPointerId(i12);
                                        c4Var.y = motionEvent.getX(i12);
                                        c4Var.z = motionEvent.getY(i12);
                                    }
                                }
                                if (z18) {
                                }
                            }
                            c4Var.j();
                            if (z18) {
                            }
                        }
                        float L4 = org.telegram.messenger.g0.L(4.0f);
                        if (x11 < L4) {
                        }
                        if (c4Var.q0 != null) {
                        }
                        t0Var = t0Var2;
                        z17 = false;
                        if (z19) {
                        }
                        if (motionEvent.getAction() != 0) {
                        }
                        z18 = c4Var.r0;
                        if (z18) {
                        }
                    }
                    return true;
                }
                if (!this.F0.c(motionEvent)) {
                    int action = motionEvent.getAction();
                    RectF rectF = this.p0;
                    ImageReceiver imageReceiver = this.J;
                    View view = this.U1;
                    dc dcVar3 = this.n;
                    if (action != 0) {
                        i7 = 4;
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
                                View.OnClickListener onClickListener = this.f2;
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
                                dcVar3.c(false);
                                if (this.g1 != null && gjVar.C != null && (message = gjVar.k) != null && cg.d.g(message.action, TLRPC.TL_messageActionTodoAppendTasks.class, TLRPC.TL_messageActionTodoCompletions.class, TLRPC.TL_messageActionSuggestedPostApproval.class, TLRPC.TL_messageActionSuggestedPostRefund.class, TLRPC.TL_messageActionSuggestedPostSuccess.class)) {
                                    this.g1.n(this, this.Q0.N1());
                                } else if (this.p1 && !this.o1 && (r0Var2 = this.t1) != null) {
                                    int height = ((StaticLayout) r0Var2.f).getHeight() - this.q1;
                                    this.o1 = true;
                                    q0 q0Var = this.g1;
                                    if (q0Var != null) {
                                        q0Var.q(this);
                                        if (getParent() instanceof uj0) {
                                            ((uj0) getParent()).w0(0, org.telegram.messenger.g0.L(24.0f) + height, null);
                                            return true;
                                        }
                                    }
                                } else if (this.P0 != null && this.N1.contains(motionEvent.getX(), motionEvent.getY())) {
                                    this.P0.b();
                                    return true;
                                }
                            } else if (action2 == 2) {
                                r0 r0Var3 = this.t1;
                                if (r0Var3 == null || !this.p1) {
                                    this.F = false;
                                } else {
                                    RectF rectF2 = org.telegram.messenger.g0.P;
                                    float f11 = r0Var3.b;
                                    rectF2.set(f11, r0Var3.e, ((StaticLayout) r0Var3.f).getWidth() + f11, this.t1.e + ((StaticLayout) r8.f).getHeight());
                                    if (!rectF2.contains(x10, y10)) {
                                        this.F = false;
                                    }
                                }
                                z11 = true;
                                z12 = z11;
                            } else if (action2 == 3) {
                                this.F = false;
                                dcVar3.c(false);
                            }
                            z11 = false;
                            z12 = z11;
                        } else {
                            boolean z22 = this.b0;
                            int i13 = this.I;
                            if (z22) {
                                int action3 = motionEvent.getAction();
                                if (action3 == 1) {
                                    this.a0 = false;
                                    this.b0 = false;
                                    view.setPressed(false);
                                    dcVar3.c(false);
                                    if (this.g1 != null) {
                                        int i14 = gjVar.D;
                                        if (i14 == 37) {
                                            playSoundEffect(0);
                                            org.telegram.ui.ActionBar.e2 T = LaunchActivity.T();
                                            if (T != null) {
                                                new li.d0(T, ((TLRPC.TL_messageActionChangeCommunity) gjVar.k.action).community_id, null, null).show();
                                            }
                                        } else if (i14 == 31) {
                                            playSoundEffect(0);
                                            e0();
                                        } else if (i14 == 25) {
                                            playSoundEffect(0);
                                            if (this.g1 != null) {
                                                org.telegram.messenger.g0.h3(new ea(2, this, (TLRPC.TL_messageActionGiftCode) this.Q0.k.action));
                                            }
                                        } else if (i14 == 18) {
                                            playSoundEffect(0);
                                            d0();
                                        } else if (i14 == 30) {
                                            playSoundEffect(0);
                                            e0();
                                        } else {
                                            TLRPC.Message message3 = gjVar.k;
                                            if (message3 != null) {
                                                TLRPC.MessageAction messageAction = message3.action;
                                                if ((messageAction instanceof TLRPC.TL_messageActionSuggestedPostApproval) && ((TLRPC.TL_messageActionSuggestedPostApproval) messageAction).balance_too_low) {
                                                    playSoundEffect(0);
                                                    TLRPC.Message message4 = this.Q0.k;
                                                    if (message4 != null) {
                                                        TLRPC.SuggestedPost suggestedPost = message4.suggested_post;
                                                        if (suggestedPost != null) {
                                                            ljVar = lj.b(suggestedPost);
                                                        } else {
                                                            TLRPC.MessageAction messageAction2 = message4.action;
                                                            if (messageAction2 instanceof TLRPC.TL_messageActionSuggestedPostApproval) {
                                                                ljVar = new lj(cg.a.l(((TLRPC.TL_messageActionSuggestedPostApproval) messageAction2).price), r1.schedule_date);
                                                            }
                                                        }
                                                        aVar = ljVar.a;
                                                        if (aVar != null && aVar.a == cg.b.a) {
                                                            new cb(getContext(), this.h1, ljVar.a.a(), 13, qg.c.h(i13, gj.B0(this.Q0.k)), null, gj.B0(this.Q0.k)).show();
                                                        }
                                                    }
                                                    ljVar = null;
                                                    aVar = ljVar.a;
                                                    if (aVar != null) {
                                                        new cb(getContext(), this.h1, ljVar.a.a(), 13, qg.c.h(i13, gj.B0(this.Q0.k)), null, gj.B0(this.Q0.k)).show();
                                                    }
                                                }
                                            }
                                            if (((m30) np.s1(i13).C7.get(gjVar.k.local_id)) == null) {
                                                if (this.z1) {
                                                    this.g1.C(this);
                                                } else {
                                                    this.g1.E(this);
                                                }
                                            }
                                        }
                                    }
                                } else if (action3 != 2) {
                                    if (action3 == 3) {
                                        this.a0 = false;
                                        this.b0 = false;
                                        view.setPressed(false);
                                        dcVar3.c(false);
                                    }
                                } else if (!X(gjVar) || (!rectF.contains(x10, y10) && !this.N1.contains(x10, y10))) {
                                    this.b0 = false;
                                    view.setPressed(false);
                                    dcVar3.c(false);
                                }
                            } else if (this.a0) {
                                int action4 = motionEvent.getAction();
                                if (action4 == 1) {
                                    this.a0 = false;
                                    if (!this.p1 || this.o1 || (r0Var = this.t1) == null) {
                                        int i15 = gjVar.D;
                                        if (i15 == 31) {
                                            e0();
                                        } else if (i15 == 25) {
                                            if (this.g1 != null) {
                                                org.telegram.messenger.g0.h3(new ea(2, this, (TLRPC.TL_messageActionGiftCode) this.Q0.k.action));
                                            }
                                        } else if (i15 == 18) {
                                            d0();
                                        } else if (i15 == 30) {
                                            e0();
                                        } else if (this.g1 != null) {
                                            if (i15 != 21 || (m30Var = (m30) np.s1(i13).C7.get(gjVar.k.local_id)) == null) {
                                                z10 = false;
                                            } else {
                                                m30Var.b();
                                                z10 = true;
                                            }
                                            if (!z10) {
                                                this.g1.C(this);
                                                playSoundEffect(0);
                                            }
                                        }
                                    } else {
                                        int height2 = ((StaticLayout) r0Var.f).getHeight() - this.q1;
                                        this.o1 = true;
                                        q0 q0Var2 = this.g1;
                                        if (q0Var2 != null) {
                                            q0Var2.q(this);
                                            if (getParent() instanceof uj0) {
                                                ((uj0) getParent()).w0(0, org.telegram.messenger.g0.L(16.0f) + height2, null);
                                                return true;
                                            }
                                        }
                                    }
                                } else if (action4 != 2) {
                                    if (action4 == 3) {
                                        this.a0 = false;
                                    }
                                } else if (Z()) {
                                    if (!this.N1.contains(x10, y10)) {
                                        this.a0 = false;
                                    }
                                } else if (!imageReceiver.O(x10, y10)) {
                                    this.a0 = false;
                                }
                            }
                            z12 = false;
                        }
                    } else if (this.g1 != null) {
                        if ((gjVar.D == 11 || X(gjVar)) && imageReceiver.O(x10, y10)) {
                            this.a0 = true;
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        if (this.K1.i.q == 4 && (((i10 = gjVar.D) == 21 || i10 == 22) && this.N1.contains(x10, y10))) {
                            this.a0 = true;
                            z15 = true;
                        }
                        r0 r0Var4 = this.t1;
                        if (r0Var4 == null || !this.p1) {
                            i7 = 4;
                        } else {
                            RectF rectF3 = org.telegram.messenger.g0.P;
                            float f12 = r0Var4.b;
                            i7 = 4;
                            rectF3.set(f12, r0Var4.e, ((StaticLayout) r0Var4.f).getWidth() + f12, this.t1.e + ((StaticLayout) r6.f).getHeight());
                            if (rectF3.contains(x10, y10)) {
                                this.F = true;
                                z15 = true;
                            }
                        }
                        if (X(gjVar) && this.y1 != null && (rectF.contains(x10, y10) || (this.z1 && this.N1.contains(x10, y10)))) {
                            z16 = true;
                            this.b0 = true;
                            view.setPressed(true);
                            dcVar3.c(true);
                            z15 = true;
                        } else {
                            z16 = true;
                        }
                        if (!z15 && Y()) {
                            this.F = z16;
                            z15 = true;
                        }
                        if (!z15) {
                            gj gjVar2 = this.Q0;
                            if (cg.d.g((gjVar2 == null || (message2 = gjVar2.k) == null) ? null : message2.action, TLRPC.TL_messageActionSuggestedPostRefund.class, TLRPC.TL_messageActionSuggestedPostSuccess.class)) {
                                this.F = true;
                                z15 = true;
                            }
                        }
                        if (z15) {
                            u();
                        }
                        z12 = z15;
                    } else {
                        i7 = 4;
                        z12 = false;
                    }
                    if (!z12 && (motionEvent.getAction() == 0 || ((this.y != null || this.E != null) && motionEvent.getAction() == 1))) {
                        r0 r0Var5 = this.t1;
                        if (r0Var5 != null && (arrayList = r0Var5.c) != null && !arrayList.isEmpty() && !this.H) {
                            ArrayList arrayList3 = this.t1.c;
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
                                r0 r0Var6 = this.t1;
                                if (bounds.contains((int) (x10 - r0Var6.b), (int) (y10 - r0Var6.e))) {
                                    this.y = null;
                                    if (motionEvent.getAction() == 0) {
                                        this.E = fVar;
                                        z12 = true;
                                    } else {
                                        xh.f fVar2 = this.E;
                                        z13 = true;
                                        if (fVar == fVar2) {
                                            this.H = true;
                                            fVar2.q = new m0(this, i7);
                                            float sqrt = (float) Math.sqrt(Math.pow(((StaticLayout) this.t1.f).getHeight(), 2.0d) + Math.pow(((StaticLayout) this.t1.f).getWidth(), 2.0d));
                                            xh.f fVar3 = this.E;
                                            r0 r0Var7 = this.t1;
                                            fVar3.j((int) (x10 - r0Var7.b), (int) (y10 - r0Var7.e), sqrt, false);
                                            invalidate();
                                        }
                                        z12 = true;
                                    }
                                }
                            }
                        }
                        z13 = true;
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
                                            CharSequence charSequence = gjVar.v;
                                            if (charSequence instanceof Spannable) {
                                                URLSpan[] uRLSpanArr = (URLSpan[]) ((Spannable) charSequence).getSpans(offsetForHorizontal, offsetForHorizontal, URLSpan.class);
                                                if (uRLSpanArr.length != 0) {
                                                    if (motionEvent.getAction() == 0) {
                                                        this.y = uRLSpanArr[0];
                                                    } else {
                                                        URLSpan uRLSpan = uRLSpanArr[0];
                                                        URLSpan uRLSpan2 = this.y;
                                                        if (uRLSpan == uRLSpan2) {
                                                            c0(uRLSpan2);
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
        q0 q0Var = this.g1;
        if (q0Var != null) {
            return q0Var.p0(this, this.z0, this.A0);
        }
        return false;
    }

    public void setCustomText(CharSequence charSequence) {
        this.S0 = charSequence;
        if (charSequence != null) {
            k0(false);
        }
    }

    public void setDelegate(q0 q0Var) {
        this.g1 = q0Var;
    }

    public void setInvalidateColors(boolean z10) {
        if (this.f1 == z10) {
            return;
        }
        this.f1 = z10;
        invalidate();
    }

    public void setInvalidateListener(Runnable runnable) {
        this.p2 = runnable;
    }

    public void setInvalidateWithParent(View view) {
        this.w = view;
    }

    public void setInvalidatesParent(boolean z10) {
        this.o2 = z10;
    }

    public void setMessageObject(gj gjVar) {
        h0(gjVar, false);
    }

    public void setOnActionClickListener(View.OnClickListener onClickListener) {
        this.f2 = onClickListener;
    }

    public void setOverrideTextMaxWidth(int i7) {
        this.g2 = i7;
    }

    public void setScrimReaction(Integer num) {
        this.F0.z = num;
    }

    public void setShowTopic(boolean z10) {
        if (this.n0 != z10) {
            this.n0 = z10;
            W();
            invalidate();
        }
    }

    public void setSpoilersSuppressed(boolean z10) {
        this.K0 = z10;
        org.telegram.ui.Wallet.c4 c4Var = this.J0;
        if (c4Var != null) {
            c4Var.n(z10);
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
        boolean z10;
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
        gj gjVar = this.Q0;
        int i11 = this.I;
        if (gjVar == null) {
            j3 = 0;
            charSequence = this.S0;
        } else if (V()) {
            CharSequence m10 = org.telegram.ui.Wallet.l0.x(i11).m(((TLRPC.TL_messageActionGramTransfer) gjVar.k.action).amount, false);
            if (!TextUtils.isEmpty(m10)) {
                charSequence = hd.V(null, null, 2131742974, org.telegram.ui.Components.p5.cloneSpans(gjVar.v), m10);
                j3 = 0;
                if (charSequence == null) {
                    TLRPC.Message message2 = gjVar.k;
                    if (message2 == null || (messageMedia = message2.media) == null || messageMedia.ttl_seconds == 0) {
                        charSequence = org.telegram.ui.Components.p5.cloneSpans(gjVar.v);
                    } else if (messageMedia.photo != null) {
                        charSequence = hd.M0(2131753947, null);
                    } else {
                        TLRPC.Document document = messageMedia.document;
                        charSequence = ((document instanceof TLRPC.TL_documentEmpty) || ((messageMedia instanceof TLRPC.TL_messageMediaDocument) && document == null)) ? messageMedia.voice ? hd.M0(2131753929, null) : messageMedia.round ? hd.M0(2131753940, null) : hd.M0(2131753932, null) : org.telegram.ui.Components.p5.cloneSpans(gjVar.v);
                    }
                }
            }
            j3 = 0;
            charSequence = null;
            if (charSequence == null) {
            }
        } else {
            if (gjVar.g3()) {
                charSequence = gjVar.k.media.user_id != m10.i(i11).e() ? fi.l7.e(new Object[0], 2131750873, true) : fi.l7.e(new Object[]{np.s1(i11).a2(Long.valueOf(gj.B0(gjVar.k))).first_name}, 2131750872, true);
            } else {
                q0 q0Var = this.g1;
                if (q0Var != null && q0Var.b() == 0 && gj.E4(gjVar)) {
                    TLRPC.TL_forumTopic f10 = np.s1(i11).r7.f(-gj.B0(gjVar.k), gj.b2(i11, gjVar.k, true, false));
                    int i12 = qg.c.a;
                    if (f10 != null) {
                        TLRPC.Message message3 = gjVar.k;
                        int i13 = gjVar.K1;
                        TLRPC.MessageAction messageAction2 = message3.action;
                        if (messageAction2 instanceof TLRPC.TL_messageActionTopicCreate) {
                            charSequence = org.telegram.messenger.g0.K2(hd.M0(2131743999, null), qg.c.j(f10, null, null), "%s");
                        } else if (messageAction2 instanceof TLRPC.TL_messageActionTopicEdit) {
                            TLRPC.TL_messageActionTopicEdit tL_messageActionTopicEdit = (TLRPC.TL_messageActionTopicEdit) messageAction2;
                            j3 = 0;
                            long Z0 = gjVar.Z0();
                            if (org.telegram.messenger.m5.E(Z0)) {
                                user = np.s1(i13).a2(Long.valueOf(Z0));
                                M0 = null;
                            } else {
                                M0 = np.s1(i13).M0(Long.valueOf(-Z0));
                                user = null;
                            }
                            String m11 = user != null ? org.telegram.messenger.g5.m(0, user.first_name, user.last_name) : M0 != null ? M0.title : null;
                            int i14 = tL_messageActionTopicEdit.flags;
                            if ((i14 & 8) != 0) {
                                K2 = org.telegram.messenger.g0.K2(hd.M0(tL_messageActionTopicEdit.hidden ? 2131744017 : 2131744003, null), m11, "%s");
                            } else if ((i14 & 4) != 0) {
                                K2 = org.telegram.messenger.g0.K2(org.telegram.messenger.g0.K2(hd.M0(tL_messageActionTopicEdit.closed ? 2131744000 : 2131743995, null), qg.c.j(f10, null, null), "%2$s"), m11, "%1$s");
                            } else {
                                int i15 = i14 & 1;
                                if (i15 != 0 && (i14 & 2) != 0) {
                                    TLRPC.TL_forumTopic tL_forumTopic = new TLRPC.TL_forumTopic();
                                    tL_forumTopic.icon_emoji_id = tL_messageActionTopicEdit.icon_emoji_id;
                                    tL_forumTopic.title = tL_messageActionTopicEdit.title;
                                    K2 = org.telegram.messenger.g0.K2(org.telegram.messenger.g0.K2(hd.M0(2131743996, null), qg.c.j(tL_forumTopic, null, null), "%2$s"), m11, "%1$s");
                                } else if (i15 != 0) {
                                    K2 = org.telegram.messenger.g0.K2(org.telegram.messenger.g0.K2(hd.M0(2131743997, null), tL_messageActionTopicEdit.title, "%2$s"), m11, "%1$s");
                                } else {
                                    if ((i14 & 2) != 0) {
                                        TLRPC.TL_forumTopic tL_forumTopic2 = new TLRPC.TL_forumTopic();
                                        tL_forumTopic2.icon_emoji_id = tL_messageActionTopicEdit.icon_emoji_id;
                                        tL_forumTopic2.title = "";
                                        K2 = org.telegram.messenger.g0.K2(org.telegram.messenger.g0.K2(hd.M0(2131743998, null), qg.c.j(tL_forumTopic2, null, null), "%2$s"), m11, "%1$s");
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
        gj gjVar2 = this.Q0;
        CharSequence charSequence6 = (gjVar2 == null || !gjVar2.j2) ? charSequence : "";
        if (gjVar2 != null && (message = gjVar2.k) != null && (messageAction = message.action) != null) {
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
                spannableStringBuilder.setSpan(new eq(i10, 0), 0, 1, 33);
                charSequence6 = spannableStringBuilder;
            }
        }
        D(this.W, charSequence6);
        if (this.P0 != null) {
            this.N = null;
            this.P = 0;
            this.Q = null;
            this.R = 0;
            this.T = 0;
        }
        if (gjVar != null) {
            TLRPC.Message message4 = gjVar.k;
            if (message4 != null) {
                TLRPC.MessageAction messageAction3 = message4.action;
                if ((messageAction3 instanceof TLRPC.TL_messageActionSuggestedPostApproval) && ((TLRPC.TL_messageActionSuggestedPostApproval) messageAction3).balance_too_low) {
                    B(null, null, charSequence6, false, !org.telegram.messenger.t3.z(i11, 24, gj.B0(message4)) ? hd.M0(2131745151, null) : null, 11, null, this.j1, false);
                    this.N = null;
                    this.P = 0;
                    this.Q = null;
                    this.R = 0;
                    this.T = 0;
                }
            }
            CharSequence charSequence7 = charSequence6;
            if (message4 != null) {
                TLRPC.MessageAction messageAction4 = message4.action;
                if ((messageAction4 instanceof TLRPC.TL_messageActionSuggestedPostApproval) && ((TLRPC.TL_messageActionSuggestedPostApproval) messageAction4).rejected) {
                    B(null, null, charSequence7, false, null, 11, null, this.j1, false);
                    this.N = null;
                    this.P = 0;
                    this.Q = null;
                    this.R = 0;
                    this.T = 0;
                }
            }
            int i16 = gjVar.D;
            if (i16 == 11) {
                float L = org.telegram.messenger.g0.L(19.0f) + this.P;
                float f11 = org.telegram.messenger.g0.u;
                this.J.y0((this.W - org.telegram.messenger.g0.u) / 2.0f, L, f11, f11);
            } else if (i16 == 25) {
                z();
            } else {
                TextPaint textPaint = this.G1;
                if (i16 == 30) {
                    TLRPC.User a22 = np.s1(i11).a2(Long.valueOf(this.Q0.A0()));
                    TLRPC.MessageAction messageAction5 = gjVar.k.action;
                    if (messageAction5 instanceof TLRPC.TL_messageActionGiftStars) {
                        B(hd.I((int) ((TLRPC.TL_messageActionGiftStars) messageAction5).stars, "ActionGiftStarsTitle"), null, org.telegram.messenger.g0.X2(this.Q0.P3() ? hd.Z(2131754631, q10.k(a22)) : hd.L0(2131754630)), false, hd.L0(2131754626), 11, null, this.j1, true);
                    } else {
                        if ((messageAction5 instanceof TLRPC.TL_messageActionStarGiftUnique) && ((TLRPC.TL_messageActionStarGiftUnique) messageAction5).refunded) {
                            long e10 = m10.i(i11).e();
                            TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique = (TLRPC.TL_messageActionStarGiftUnique) gjVar.k.action;
                            if (gjVar.P3() != (!tL_messageActionStarGiftUnique.upgrade)) {
                                e10 = gjVar.A0();
                            }
                            TLRPC.User a23 = np.s1(i11).a2(Long.valueOf(e10));
                            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                            spannableStringBuilder2.append((CharSequence) hd.L0(tL_messageActionStarGiftUnique.prepaid_upgrade ? 2131750428 : 2131750437)).append((CharSequence) " ");
                            if (a23 != null && a23.photo != null) {
                                spannableStringBuilder2.append((CharSequence) "a ");
                                org.telegram.ui.f5 f5Var = new org.telegram.ui.f5(18.0f, i11, this);
                                f5Var.e(a23);
                                spannableStringBuilder2.setSpan(f5Var, spannableStringBuilder2.length() - 2, spannableStringBuilder2.length() - 1, 33);
                            }
                            spannableStringBuilder2.append((CharSequence) q10.k(a23));
                            B(spannableStringBuilder2, null, hd.L0(2131750429), false, hd.L0(2131754626), 12, hd.L0(2131749894), this.j1, true);
                        } else if (messageAction5 instanceof TLRPC.TL_messageActionStarGift) {
                            TLRPC.TL_messageActionStarGift tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction5;
                            long j10 = tL_messageActionStarGift.convert_stars;
                            long e11 = m10.i(i11).e();
                            long j11 = j3;
                            TLRPC.Peer peer2 = tL_messageActionStarGift.peer;
                            boolean z11 = peer2 != null && (!tL_messageActionStarGift.prepaid_upgrade || (peer2 instanceof TLRPC.TL_peerChannel));
                            boolean z12 = gjVar.A0() == e11 && !z11;
                            long Z02 = gjVar.Z0();
                            if (!tL_messageActionStarGift.prepaid_upgrade && (peer = tL_messageActionStarGift.from_id) != null) {
                                Z02 = org.telegram.messenger.m5.o(peer);
                            }
                            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
                            TLObject e22 = np.s1(i11).e2(Z02);
                            long o4 = org.telegram.messenger.m5.o(tL_messageActionStarGift.to_id);
                            TLObject e23 = np.s1(i11).e2(o4);
                            boolean z13 = tL_messageActionStarGift.can_upgrade && !tL_messageActionStarGift.converted && tL_messageActionStarGift.upgrade_stars > j11 && !tL_messageActionStarGift.upgraded;
                            if (o4 != j11 && tL_messageActionStarGift.auction_acquired && e23 != null) {
                                spannableStringBuilder3.append((CharSequence) hd.L0(2131750434)).append((CharSequence) " ");
                                if (!(e23 instanceof TLRPC.User) ? !(!(e23 instanceof TLRPC.Chat) || ((TLRPC.Chat) e23).photo == null) : ((TLRPC.User) e23).photo != null) {
                                    spannableStringBuilder3.append((CharSequence) "a ");
                                    org.telegram.ui.f5 f5Var2 = new org.telegram.ui.f5(18.0f, i11, this);
                                    org.telegram.ui.Components.t8 t8Var = f5Var2.c;
                                    t8Var.p(e23);
                                    f5Var2.b.i0(e23, t8Var, null);
                                    spannableStringBuilder3.setSpan(f5Var2, spannableStringBuilder3.length() - 2, spannableStringBuilder3.length() - 1, 33);
                                }
                                spannableStringBuilder3.append((CharSequence) org.telegram.messenger.m5.u(e23));
                            } else if (!z12) {
                                spannableStringBuilder3.append((CharSequence) hd.L0(tL_messageActionStarGift.prepaid_upgrade ? 2131750428 : 2131750437)).append((CharSequence) " ");
                                if (!(e22 instanceof TLRPC.User) ? !(!(e22 instanceof TLRPC.Chat) || ((TLRPC.Chat) e22).photo == null) : ((TLRPC.User) e22).photo != null) {
                                    spannableStringBuilder3.append((CharSequence) "a ");
                                    org.telegram.ui.f5 f5Var3 = new org.telegram.ui.f5(18.0f, i11, this);
                                    org.telegram.ui.Components.t8 t8Var2 = f5Var3.c;
                                    t8Var2.p(e22);
                                    f5Var3.b.i0(e22, t8Var2, null);
                                    spannableStringBuilder3.setSpan(f5Var3, spannableStringBuilder3.length() - 2, spannableStringBuilder3.length() - 1, 33);
                                }
                                spannableStringBuilder3.append((CharSequence) org.telegram.messenger.m5.u(e22));
                            } else if (tL_messageActionStarGift.gift_num <= 0 || (starGift = tL_messageActionStarGift.gift) == null || (str = starGift.title) == null) {
                                spannableStringBuilder3.append((CharSequence) hd.L0(2131750439));
                            } else {
                                spannableStringBuilder3.append((CharSequence) str).append((CharSequence) " #").append((CharSequence) hd.E(tL_messageActionStarGift.gift_num, ','));
                            }
                            boolean z14 = ((gjVar.P3() && !z12) || !tL_messageActionStarGift.converted) && tL_messageActionStarGift.convert_stars > j11 && np.s1(i11).F6 - (ConnectionsManager.getInstance(i11).getCurrentTime() - gjVar.k.date) > 0 && !tL_messageActionStarGift.refunded;
                            if (tL_messageActionStarGift.refunded) {
                                X2 = hd.L0(2131750465);
                            } else {
                                TLRPC.TL_textWithEntities tL_textWithEntities = tL_messageActionStarGift.message;
                                if (tL_textWithEntities != null && !TextUtils.isEmpty(tL_textWithEntities.text)) {
                                    SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder(tL_messageActionStarGift.message.text);
                                    textPaint.setTextSize(org.telegram.messenger.g0.L(13.0f));
                                    gj.a(spannableStringBuilder4, tL_messageActionStarGift.message.entities, false, true, true);
                                    X2 = gj.z5(textPaint.getFontMetricsInt(), org.telegram.messenger.j6.m(spannableStringBuilder4, textPaint.getFontMetricsInt(), false, null, 0), tL_messageActionStarGift.message.entities);
                                } else if (tL_messageActionStarGift.auction_acquired) {
                                    X2 = hd.Z(2131750420, hd.E(tL_messageActionStarGift.gift.stars + tL_messageActionStarGift.upgrade_stars, ','));
                                } else if (z11) {
                                    X2 = tL_messageActionStarGift.converted ? hd.I((int) j10, "Gift2ActionConvertedInfo") : (!z14 || j10 <= j11) ? org.telegram.messenger.g0.X2(hd.L0(2131750458)) : org.telegram.messenger.g0.X2(hd.I((int) j10, "Gift2ActionInfoChannel"));
                                } else if (z12) {
                                    X2 = (!tL_messageActionStarGift.converted || j10 <= j11) ? tL_messageActionStarGift.can_upgrade ? org.telegram.messenger.g0.X2(hd.L0(2131750442)) : org.telegram.messenger.g0.X2(hd.L0(2131750443)) : hd.I((int) j10, "Gift2ActionConvertedInfo");
                                } else if (z13) {
                                    X2 = org.telegram.messenger.g0.X2(gjVar.P3() ? hd.Z(2131750430, q10.k(a22)) : hd.L0(2131750431));
                                } else {
                                    X2 = gjVar.P3() ? (!z14 || j10 <= j11) ? tL_messageActionStarGift.can_upgrade ? org.telegram.messenger.g0.X2(hd.Z(2131750451, q10.k(a22))) : org.telegram.messenger.g0.X2(hd.Z(2131750452, q10.k(a22))) : org.telegram.messenger.g0.X2(hd.J((int) j10, "Gift2ActionOutInfo", q10.k(a22))) : tL_messageActionStarGift.converted ? hd.I((int) j10, "Gift2ActionConvertedInfo") : tL_messageActionStarGift.saved ? !z14 ? hd.L0(2131750466) : hd.L0(2131750445) : !z14 ? hd.L0(2131750467) : org.telegram.messenger.g0.X2(hd.I((int) j10, "Gift2ActionInfo"));
                                }
                            }
                            CharSequence charSequence8 = X2;
                            TL_stars.StarGift starGift2 = tL_messageActionStarGift.gift;
                            if (starGift2 == null || !starGift2.limited) {
                                str2 = null;
                            } else {
                                int i17 = starGift2.availability_total;
                                str2 = hd.Z(2131750135, i17 > 1500 ? org.telegram.messenger.g0.o0(i17, 0) : Integer.valueOf(i17));
                            }
                            CharSequence L02 = hd.L0(2131754626);
                            if (gjVar.P3()) {
                                charSequence5 = L02;
                                if (!tL_messageActionStarGift.forceIn) {
                                }
                            }
                            charSequence5 = L02;
                            charSequence5 = L02;
                            if (!gjVar.P3() && z13) {
                                SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder();
                                spannableStringBuilder5.append("^  ");
                                eq eqVar = new eq(R.drawable.gift_unpack);
                                eqVar.I = 0.8f;
                                eqVar.J = 0.8f;
                                spannableStringBuilder5.setSpan(eqVar, 0, 1, 33);
                                spannableStringBuilder5.append(hd.L0(2131749885));
                                charSequence5 = spannableStringBuilder5;
                            }
                            CharSequence charSequence9 = charSequence5;
                            TL_stars.StarGift starGift3 = tL_messageActionStarGift.gift;
                            B(spannableStringBuilder3, (starGift3 == null || starGift3.released_by == null || (r10 = org.telegram.messenger.m5.r(np.s1(i11).e2(org.telegram.messenger.m5.o(tL_messageActionStarGift.gift.released_by)))) == null) ? null : di.c6.g2(hd.Z(2131750447, "@".concat(r10))), charSequence8, false, charSequence9, 11, str2, this.j1, true);
                        } else if (messageAction5 instanceof TLRPC.TL_messageActionGiftTon) {
                            B(hd.L0(2131754624), null, this.Q0.v, false, hd.L0(2131754626), 11, null, this.j1, true);
                            this.N = null;
                            this.P = 0;
                            this.Q = null;
                            this.R = 0;
                            this.T = 0;
                        } else {
                            B(hd.L0(2131754553), null, this.Q0.v, false, hd.L0(2131754626), 11, null, this.j1, true);
                            this.N = null;
                            this.P = 0;
                            this.Q = null;
                            this.R = 0;
                            this.T = 0;
                        }
                    }
                } else {
                    long j12 = j3;
                    if (i16 == 33) {
                        TLRPC.TL_messageActionStarGiftPurchaseOffer tL_messageActionStarGiftPurchaseOffer = (TLRPC.TL_messageActionStarGiftPurchaseOffer) message4.action;
                        SpannableStringBuilder spannableStringBuilder6 = new SpannableStringBuilder(charSequence7);
                        spannableStringBuilder6.append((CharSequence) "\n\n");
                        if (tL_messageActionStarGiftPurchaseOffer.accepted) {
                            spannableStringBuilder6.append((CharSequence) org.telegram.messenger.g0.X2(hd.L0(2131749695)));
                        } else if (tL_messageActionStarGiftPurchaseOffer.declined) {
                            spannableStringBuilder6.append((CharSequence) org.telegram.messenger.g0.X2(hd.L0(2131749692)));
                        } else {
                            int max = Math.max(0, tL_messageActionStarGiftPurchaseOffer.expires_at - ConnectionsManager.getInstance(i11).getCurrentTime());
                            if (max == 0) {
                                spannableStringBuilder6.append((CharSequence) org.telegram.messenger.g0.X2(hd.L0(2131749694)));
                            } else {
                                int i18 = max / 60;
                                int i19 = max / 3600;
                                if (i19 > 0) {
                                    StringBuilder sb2 = new StringBuilder();
                                    i7 = 0;
                                    sb2.append(hd.G(i19, "ShortHoursAgo", new Object[0]));
                                    sb2.append(" ");
                                    sb2.append(hd.G(i18 % 60, "ShortMinutesAgo", new Object[0]));
                                    G = sb2.toString();
                                } else {
                                    i7 = 0;
                                    G = hd.G(i18, "ShortMinutesAgo", new Object[0]);
                                }
                                if (G.endsWith(".")) {
                                    G = com.google.android.gms.internal.vision.e2.k(G, 1, i7);
                                }
                                Object[] objArr = new Object[1];
                                objArr[i7] = G;
                                spannableStringBuilder6.append((CharSequence) org.telegram.messenger.g0.X2(hd.Z(2131749693, objArr)));
                            }
                        }
                        B(null, null, spannableStringBuilder6, false, null, 11, null, this.j1, false);
                        this.N = null;
                        this.P = 0;
                        this.Q = null;
                        this.R = 0;
                        this.T = 0;
                    } else if (i16 == 34) {
                        B(null, null, charSequence7, false, null, 11, null, this.j1, false);
                        this.N = null;
                        this.P = 0;
                        this.Q = null;
                        this.R = 0;
                        this.T = 0;
                    } else if (i16 == 35) {
                        TLRPC.TL_messageActionNoForwardsRequest tL_messageActionNoForwardsRequest = (TLRPC.TL_messageActionNoForwardsRequest) message4.action;
                        SpannableStringBuilder spannableStringBuilder7 = new SpannableStringBuilder();
                        String u10 = org.telegram.messenger.m5.u(np.s1(i11).a2(Long.valueOf(gjVar.A0())));
                        if (tL_messageActionNoForwardsRequest.new_value) {
                            spannableStringBuilder7.append(gjVar.N3() ? hd.L0(2131745380) : org.telegram.messenger.g0.X2(hd.Z(2131745383, u10)));
                        } else {
                            spannableStringBuilder7.append(gjVar.N3() ? hd.L0(2131745369) : org.telegram.messenger.g0.X2(hd.Z(2131745372, u10)));
                        }
                        if (tL_messageActionNoForwardsRequest.new_value) {
                            spannableStringBuilder7.append((CharSequence) "\n\n");
                            spannableStringBuilder7.append((CharSequence) F(hd.L0(2131745390)));
                            spannableStringBuilder7.append((CharSequence) "\n\n");
                            spannableStringBuilder7.append((CharSequence) F(hd.L0(2131745389)));
                            spannableStringBuilder7.append((CharSequence) "\n\n");
                            spannableStringBuilder7.append((CharSequence) F(hd.L0(2131745388)));
                            spannableStringBuilder7.append((CharSequence) "\n\n");
                            spannableStringBuilder7.append((CharSequence) F(hd.L0(2131745387)));
                        } else {
                            spannableStringBuilder7.append((CharSequence) "\n\n");
                            spannableStringBuilder7.append((CharSequence) F(hd.L0(2131745379)));
                            spannableStringBuilder7.append((CharSequence) "\n\n");
                            spannableStringBuilder7.append((CharSequence) F(hd.L0(2131745378)));
                            spannableStringBuilder7.append((CharSequence) "\n\n");
                            spannableStringBuilder7.append((CharSequence) F(hd.L0(2131745377)));
                            spannableStringBuilder7.append((CharSequence) "\n\n");
                            spannableStringBuilder7.append((CharSequence) F(hd.L0(2131745376)));
                        }
                        B(null, null, spannableStringBuilder7, false, null, 11, null, this.j1, false);
                        this.N = null;
                        this.P = 0;
                        this.Q = null;
                        this.R = 0;
                        this.T = 0;
                    } else if (i16 == 31) {
                        TL_stars.StarGift starGift4 = ((TLRPC.TL_chatThemeUniqueGift) ((TLRPC.TL_messageActionSetChatTheme) message4.action).theme).gift;
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(starGift4.title);
                        sb3.append(" #");
                        String l10 = i5.c.l(starGift4.num, ',', sb3);
                        long Z03 = gjVar.Z0();
                        B(null, null, org.telegram.messenger.g0.X2(m10.i(i11).e() == Z03 ? hd.Z(2131749597, l10) : hd.Z(2131749598, org.telegram.messenger.m5.s(i11, Z03), l10)), false, hd.L0(2131749599), 11, null, this.j1, true);
                        this.N = null;
                        this.P = 0;
                        this.Q = null;
                        this.R = 0;
                        this.T = 0;
                    } else if (i16 == 37) {
                        TLRPC.TL_messageActionChangeCommunity tL_messageActionChangeCommunity = (TLRPC.TL_messageActionChangeCommunity) message4.action;
                        long o10 = org.telegram.messenger.m5.o(message4.peer_id);
                        boolean U = org.telegram.messenger.t3.U(i11, -o10);
                        boolean z15 = o10 > j12;
                        String s5 = org.telegram.messenger.m5.s(i11, org.telegram.messenger.m5.o(gjVar.k.from_id));
                        String s9 = org.telegram.messenger.m5.s(i11, -tL_messageActionChangeCommunity.community_id);
                        SpannableStringBuilder spannableStringBuilder8 = new SpannableStringBuilder();
                        spannableStringBuilder8.append((CharSequence) li.l0.a(gjVar, s9, s5, U, z15));
                        B(null, null, spannableStringBuilder8, false, hd.L0(2131749599), 11, null, this.j1, true);
                        this.N = null;
                        this.P = 0;
                        this.Q = null;
                        this.R = 0;
                        this.T = 0;
                    } else if (i16 == 18) {
                        TLRPC.MessageAction messageAction6 = message4.action;
                        TLRPC.TL_textWithEntities tL_textWithEntities2 = messageAction6 instanceof TLRPC.TL_messageActionGiftPremium ? ((TLRPC.TL_messageActionGiftPremium) messageAction6).message : messageAction6 instanceof TLRPC.TL_messageActionGiftCode ? ((TLRPC.TL_messageActionGiftCode) messageAction6).message : null;
                        if (tL_textWithEntities2 == null || TextUtils.isEmpty(tL_textWithEntities2.text)) {
                            charSequence4 = null;
                        } else {
                            SpannableStringBuilder spannableStringBuilder9 = new SpannableStringBuilder(tL_textWithEntities2.text);
                            textPaint.setTextSize(org.telegram.messenger.g0.L(13.0f));
                            gj.a(spannableStringBuilder9, tL_textWithEntities2.entities, false, true, true);
                            charSequence4 = gj.z5(textPaint.getFontMetricsInt(), org.telegram.messenger.j6.m(spannableStringBuilder9, textPaint.getFontMetricsInt(), false, null, 0), tL_textWithEntities2.entities);
                        }
                        if (charSequence4 == null) {
                            charSequence4 = hd.L0(2131754641);
                        }
                        CharSequence charSequence10 = charSequence4;
                        gj gjVar3 = this.Q0;
                        CharSequence L03 = hd.L0((gjVar3 == null || !(gjVar3.k.action instanceof TLRPC.TL_messageActionGiftCode) || a0()) ? 2131754634 : 2131749660);
                        TLRPC.MessageAction messageAction7 = gjVar.k.action;
                        int i20 = messageAction7.months;
                        if (i20 >= 1) {
                            B(hd.I(i20, "ActionGiftPremiumTitle2"), null, charSequence10, true, L03, 11, null, this.j1, false);
                        } else {
                            B(hd.I(messageAction7.days, "ActionGiftPremiumTitle2Days"), null, charSequence10, true, L03, 11, null, this.j1, false);
                        }
                    } else if (i16 == 21) {
                        TLRPC.TL_messageActionSuggestProfilePhoto tL_messageActionSuggestProfilePhoto = (TLRPC.TL_messageActionSuggestProfilePhoto) message4.action;
                        TLRPC.User a24 = np.s1(i11).a2(Long.valueOf(gjVar.P3() ? j12 : gjVar.A0()));
                        boolean z16 = tL_messageActionSuggestProfilePhoto.video || !((photo = tL_messageActionSuggestProfilePhoto.photo) == null || (arrayList2 = photo.video_sizes) == null || arrayList2.isEmpty());
                        if (a24.id == m10.i(i11).n) {
                            TLRPC.User a25 = np.s1(i11).a2(Long.valueOf(gjVar.A0()));
                            Z = z16 ? hd.Z(2131754544, a25.first_name) : hd.Z(2131754548, a25.first_name);
                        } else {
                            Z = z16 ? hd.Z(2131754542, a24.first_name) : hd.Z(2131754546, a24.first_name);
                        }
                        B(null, null, Z, false, (tL_messageActionSuggestProfilePhoto.video || !((arrayList = tL_messageActionSuggestProfilePhoto.photo.video_sizes) == null || arrayList.isEmpty())) ? hd.L0(2131743539) : hd.L0(2131743547), 11, null, this.j1, true);
                        this.N = null;
                        this.P = 0;
                        this.Q = null;
                        this.R = 0;
                        this.T = 0;
                    } else if (i16 == 22) {
                        TLRPC.User a26 = np.s1(i11).a2(Long.valueOf(gjVar.P3() ? j12 : gjVar.A0()));
                        if (gjVar.A0() < j12) {
                            charSequence3 = gjVar.v;
                        } else if (!gjVar.P3() && gjVar.Y4() && gjVar.S2()) {
                            charSequence2 = gjVar.v;
                            L0 = hd.L0(2131746286);
                            z10 = false;
                            B(null, null, charSequence2, false, L0, 11, null, this.j1, z10);
                            this.N = null;
                            this.P = 0;
                            this.Q = null;
                            this.R = 0;
                            this.T = 0;
                        } else if (a26 == null || a26.id != m10.i(i11).n) {
                            charSequence2 = gjVar.v;
                            L0 = hd.L0(2131743538);
                            z10 = true;
                            B(null, null, charSequence2, false, L0, 11, null, this.j1, z10);
                            this.N = null;
                            this.P = 0;
                            this.Q = null;
                            this.R = 0;
                            this.T = 0;
                        } else {
                            charSequence3 = gjVar.v;
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
                    } else if (gjVar.z4()) {
                        TLRPC.User a27 = np.s1(i11).a2(Long.valueOf(gjVar.k.media.user_id));
                        B(null, null, a27.self ? org.telegram.messenger.g0.X2(hd.Z(2131744439, np.s1(i11).a2(Long.valueOf(gjVar.A0())).first_name)) : org.telegram.messenger.g0.X2(hd.Z(2131744614, a27.first_name)), false, hd.L0(2131744615), 11, null, this.j1, true);
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
        ch.q0 q0Var2 = this.F0;
        q0Var2.b = L2;
        q0Var2.o(this.W - org.telegram.messenger.g0.L(24.0f), 1);
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.K || super.verifyDrawable(drawable);
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
        gj gjVar;
        TLRPC.Message message;
        gj gjVar2;
        TLRPC.Message message2;
        TLRPC.Message message3;
        char c10;
        int i11;
        long j3;
        TLObject M0;
        String str;
        Context context;
        boolean z10;
        String a02;
        SpannableStringBuilder X2;
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
            org.telegram.ui.ActionBar.e6 e6Var = this.h1;
            if (action == 0) {
                this.m2 = -1;
                int i12 = 0;
                while (i12 < arrayList.size()) {
                    c0 c0Var = (c0) arrayList.get(i12);
                    float L3 = ((org.telegram.messenger.g0.L(f10) + L2) * i12) + width;
                    RectF rectF = org.telegram.messenger.g0.P;
                    rectF.set(L3, L, L3 + L2, c0Var.f + L);
                    float f11 = x10;
                    float f12 = y10;
                    if (rectF.contains(f11, f12)) {
                        this.m2 = i12;
                        W();
                        if (c0Var.s == null) {
                            y a03 = org.telegram.ui.ActionBar.j6.a0(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.ed, e6Var), 6, 6);
                            c0Var.s = a03;
                            a03.setCallback(this);
                        }
                        c0Var.s.setHotspot(f11, f12);
                        c0Var.s.setState(this.l2);
                        c0Var.b(!c0Var.m);
                        return true;
                    }
                    i12++;
                    f10 = 4.0f;
                }
            } else {
                int i13 = 3;
                if (motionEvent.getAction() == 1) {
                    if (this.m2 != -1) {
                        playSoundEffect(0);
                        c0 c0Var2 = (c0) arrayList.get(this.m2);
                        y yVar = c0Var2.s;
                        if (yVar != null) {
                            yVar.setState(StateSet.NOTHING);
                        }
                        c0Var2.b(false);
                        if (this.g1 == null || c0Var2.m || (o2Var = c0Var2.j) == null) {
                            i10 = -1;
                        } else {
                            if (getMessageObject() != null) {
                                int i14 = o2Var.a;
                                if (i14 == 5) {
                                    q0 q0Var = this.g1;
                                    org.telegram.ui.ActionBar.e2 F = q0Var != null ? q0Var.F() : null;
                                    if (F != null && this.Q0 != null) {
                                        org.telegram.ui.Components.t4.s0(F, hd.M0(2131749707, null), org.telegram.messenger.g0.X2(hd.a0(null, null, 2131749708, org.telegram.messenger.m5.t(gj.B0(this.Q0.k)))), hd.M0(2131749709, null), true, new ea(i13, this, F));
                                    }
                                } else if (i14 == 6) {
                                    gj gjVar3 = this.Q0;
                                    if (gjVar3 != null && (message3 = gjVar3.k) != null) {
                                        TLRPC.MessageAction messageAction = message3.action;
                                        if (messageAction instanceof TLRPC.TL_messageActionStarGiftPurchaseOffer) {
                                            TLRPC.TL_messageActionStarGiftPurchaseOffer tL_messageActionStarGiftPurchaseOffer = (TLRPC.TL_messageActionStarGiftPurchaseOffer) messageAction;
                                            org.telegram.ui.ActionBar.e2 Q = LaunchActivity.Q();
                                            Context context2 = getContext();
                                            long B0 = gj.B0(this.Q0.k);
                                            int e12 = this.Q0.e1();
                                            int[] iArr = di.p0.t2;
                                            cg.a m10 = cg.a.m(tL_messageActionStarGiftPurchaseOffer.price);
                                            cg.b bVar = m10.a;
                                            int i15 = this.I;
                                            cg.b bVar2 = cg.b.a;
                                            if (bVar == bVar2) {
                                                c10 = 3;
                                                i11 = ((org.telegram.messenger.j0) np.s1(i15).y7.n.b).c;
                                            } else {
                                                c10 = 3;
                                                i11 = ((org.telegram.messenger.j0) np.s1(i15).y7.o.b).c;
                                            }
                                            cg.a i16 = cg.a.i((m10.b * i11) / 1000, bVar);
                                            TL_stars.StarGift starGift = tL_messageActionStarGiftPurchaseOffer.gift;
                                            StringBuilder sb2 = new StringBuilder();
                                            sb2.append(starGift.title);
                                            sb2.append(" #");
                                            String l10 = i5.c.l(starGift.num, ',', sb2);
                                            if (B0 >= 0) {
                                                j3 = 0;
                                                M0 = np.s1(i15).a2(Long.valueOf(B0));
                                            } else {
                                                j3 = 0;
                                                M0 = np.s1(i15).M0(Long.valueOf(-B0));
                                            }
                                            String d = m10.d();
                                            String d2 = i16.d();
                                            if (bVar == cg.b.b) {
                                                str = l10;
                                                context = context2;
                                                z10 = true;
                                            } else {
                                                str = l10;
                                                context = context2;
                                                z10 = false;
                                            }
                                            LinearLayout f13 = org.telegram.messenger.k5.f(context, 1);
                                            f13.addView(new di.a5(context, starGift, M0), c8.ja.t(-1, -2, 48, 0, -4, 0, 0));
                                            TextView textView = new TextView(context);
                                            org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.j5, e6Var);
                                            textView.setTextSize(1, 16.0f);
                                            if (bVar == bVar2) {
                                                String t6 = org.telegram.messenger.m5.t(B0);
                                                Object[] objArr = new Object[4];
                                                objArr[0] = d;
                                                objArr[1] = t6;
                                                objArr[2] = str;
                                                objArr[c10] = d2;
                                                a02 = hd.a0(null, null, 2131749685, objArr);
                                            } else {
                                                String t10 = org.telegram.messenger.m5.t(B0);
                                                Object[] objArr2 = new Object[4];
                                                objArr2[0] = d;
                                                objArr2[1] = t10;
                                                objArr2[2] = str;
                                                objArr2[c10] = d2;
                                                a02 = hd.a0(null, null, 2131749684, objArr2);
                                            }
                                            textView.setText(org.telegram.messenger.g0.X2(a02));
                                            f13.addView(textView, c8.ja.t(-1, -2, 48, 24, 4, 24, 4));
                                            FrameLayout frameLayout = new FrameLayout(context);
                                            frameLayout.setClipChildren(false);
                                            frameLayout.setClipToPadding(false);
                                            vx0 vx0Var = new vx0(context, e6Var);
                                            frameLayout.addView(vx0Var, c8.ja.e(-1, -1, ns.E1));
                                            di.c6.k1(vx0Var, di.v8.l(starGift.attributes, TL_stars.starGiftAttributeModel.class));
                                            di.c6.k1(vx0Var, di.v8.l(starGift.attributes, TL_stars.starGiftAttributeBackdrop.class));
                                            di.c6.k1(vx0Var, di.v8.l(starGift.attributes, TL_stars.starGiftAttributePattern.class));
                                            f13.addView(frameLayout, c8.ja.t(-1, -2, 48, 23, 16, 23, 4));
                                            cg.a j10 = cg.a.j(starGift.value_usd_amount / Math.pow(10.0d, org.telegram.messenger.r1.i().h("USD")), bVar);
                                            if (j10.c() > 0.0d && starGift.value_usd_amount > j3) {
                                                if (j10.b >= i16.b) {
                                                    int round = (int) Math.round((1.0d - (i16.c() / j10.c())) * 100.0d);
                                                    X2 = org.telegram.messenger.g0.X2(hd.a0(null, null, 2131749734, com.google.android.gms.internal.vision.e2.i(round, "%"), starGift.title));
                                                    if (round > 10) {
                                                        z11 = true;
                                                        TextView textView2 = new TextView(context);
                                                        textView2.setTextSize(1, 13.0f);
                                                        textView2.setGravity(17);
                                                        textView2.setText(X2);
                                                        org.telegram.ui.ActionBar.q6.U(textView2, !z11 ? org.telegram.ui.ActionBar.j6.p7 : org.telegram.ui.ActionBar.j6.y6, e6Var);
                                                        f13.addView(textView2, c8.ja.t(-1, -2, 49, 40, 12, 40, 9));
                                                    }
                                                } else {
                                                    X2 = org.telegram.messenger.g0.X2(hd.a0(null, null, 2131749737, com.google.android.gms.internal.vision.e2.i((int) Math.round(((i16.c() / j10.c()) - 1.0d) * 100.0d), "%"), starGift.title));
                                                }
                                                z11 = false;
                                                TextView textView22 = new TextView(context);
                                                textView22.setTextSize(1, 13.0f);
                                                textView22.setGravity(17);
                                                textView22.setText(X2);
                                                org.telegram.ui.ActionBar.q6.U(textView22, !z11 ? org.telegram.ui.ActionBar.j6.p7 : org.telegram.ui.ActionBar.j6.y6, e6Var);
                                                f13.addView(textView22, c8.ja.t(-1, -2, 49, 40, 12, 40, 9));
                                            }
                                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, e6Var);
                                            alertDialog$Builder.o(f13);
                                            alertDialog$Builder.k(mb.V0(hd.a0(null, null, 2131749702, d2), z10), new di.i0(e12, i15, Q));
                                            alertDialog$Builder.h(hd.M0(2131752589, null), null);
                                            alertDialog$Builder.a.show();
                                        }
                                    }
                                } else {
                                    if (i14 == 7) {
                                        q0 q0Var2 = this.g1;
                                        org.telegram.ui.ActionBar.e2 F2 = q0Var2 != null ? q0Var2.F() : null;
                                        if (F2 != null && (gjVar2 = this.Q0) != null && (message2 = gjVar2.k) != null) {
                                            TLRPC.MessageAction messageAction2 = message2.action;
                                            if (messageAction2 instanceof TLRPC.TL_messageActionNoForwardsRequest) {
                                                final TLRPC.TL_messageActionNoForwardsRequest tL_messageActionNoForwardsRequest = (TLRPC.TL_messageActionNoForwardsRequest) messageAction2;
                                                final int i17 = 0;
                                                org.telegram.ui.Components.t4.s0(F2, hd.M0(tL_messageActionNoForwardsRequest.prev_value ? 2131745385 : 2131745374, null), hd.M0(tL_messageActionNoForwardsRequest.prev_value ? 2131745386 : 2131745375, null), hd.M0(2131745391, null), false, new Runnable(this) { // from class: org.telegram.ui.Cells.n0
                                                    public final /* synthetic */ t0 b;

                                                    {
                                                        this.b = this;
                                                    }

                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        switch (i17) {
                                                            case 0:
                                                                t0 t0Var = this.b;
                                                                np.s1(t0Var.I).e5(gj.B0(t0Var.Q0.k), t0Var.Q0.e1(), tL_messageActionNoForwardsRequest.prev_value, null);
                                                                break;
                                                            default:
                                                                t0 t0Var2 = this.b;
                                                                np.s1(t0Var2.I).e5(gj.B0(t0Var2.Q0.k), t0Var2.Q0.e1(), tL_messageActionNoForwardsRequest.new_value, null);
                                                                break;
                                                        }
                                                    }
                                                });
                                            }
                                        }
                                    } else if (i14 == 8) {
                                        q0 q0Var3 = this.g1;
                                        org.telegram.ui.ActionBar.e2 F3 = q0Var3 != null ? q0Var3.F() : null;
                                        if (F3 != null && (gjVar = this.Q0) != null && (message = gjVar.k) != null) {
                                            TLRPC.MessageAction messageAction3 = message.action;
                                            if (messageAction3 instanceof TLRPC.TL_messageActionNoForwardsRequest) {
                                                final TLRPC.TL_messageActionNoForwardsRequest tL_messageActionNoForwardsRequest2 = (TLRPC.TL_messageActionNoForwardsRequest) messageAction3;
                                                final int i18 = 1;
                                                org.telegram.ui.Components.t4.s0(F3, hd.M0(tL_messageActionNoForwardsRequest2.new_value ? 2131745385 : 2131745374, null), hd.M0(tL_messageActionNoForwardsRequest2.new_value ? 2131745384 : 2131745373, null), hd.M0(2131745391, null), false, new Runnable(this) { // from class: org.telegram.ui.Cells.n0
                                                    public final /* synthetic */ t0 b;

                                                    {
                                                        this.b = this;
                                                    }

                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        switch (i18) {
                                                            case 0:
                                                                t0 t0Var = this.b;
                                                                np.s1(t0Var.I).e5(gj.B0(t0Var.Q0.k), t0Var.Q0.e1(), tL_messageActionNoForwardsRequest2.prev_value, null);
                                                                break;
                                                            default:
                                                                t0 t0Var2 = this.b;
                                                                np.s1(t0Var2.I).e5(gj.B0(t0Var2.Q0.k), t0Var2.Q0.e1(), tL_messageActionNoForwardsRequest2.new_value, null);
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
                        this.m2 = i10;
                        W();
                        return false;
                    }
                } else if (motionEvent.getAction() == 3 && (i7 = this.m2) != -1) {
                    c0 c0Var3 = (c0) arrayList.get(i7);
                    y yVar2 = c0Var3.s;
                    if (yVar2 != null) {
                        yVar2.setState(StateSet.NOTHING);
                    }
                    c0Var3.b(false);
                    this.m2 = -1;
                    W();
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
        TLRPC.Chat M0 = np.s1(this.I).M0(Long.valueOf(-org.telegram.messenger.m5.o(tL_messageActionGiftCode.boost_peer)));
        String str = M0 == null ? null : M0.title;
        boolean z10 = tL_messageActionGiftCode.via_giveaway;
        String M02 = tL_messageActionGiftCode.unclaimed ? hd.M0(2131753176, "BoostingUnclaimedPrize") : hd.M0(2131753542, "BoostingCongratulations");
        String G = i7 == 12 ? hd.G(1, "BoldYears", new Object[0]) : hd.G(i7, "BoldMonths", new Object[0]);
        if (!z10) {
            spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.g0.X2(str == null ? hd.M0(2131753310, null) : hd.a0("BoostingReceivedGiftFrom", null, 2131753311, str)));
            spannableStringBuilder.append((CharSequence) "\n\n");
            org.telegram.messenger.k5.p(null, null, 2131753312, new Object[]{G}, spannableStringBuilder);
        } else if (tL_messageActionGiftCode.unclaimed) {
            spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.g0.X2(hd.a0(null, null, 2131753166, str)));
            spannableStringBuilder.append((CharSequence) "\n\n");
            org.telegram.messenger.k5.p(null, null, 2131753175, new Object[]{G}, spannableStringBuilder);
        } else {
            spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.g0.X2(hd.a0(null, null, 2131753307, str)));
            spannableStringBuilder.append((CharSequence) "\n\n");
            org.telegram.messenger.k5.p(null, null, 2131753308, new Object[]{G}, spannableStringBuilder);
        }
        String M03 = hd.M0(2131753309, "BoostingReceivedGiftOpenBtn");
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(M02);
        valueOf.setSpan(new y31(org.telegram.messenger.g0.o()), 0, valueOf.length(), 33);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        this.k1 = new StaticLayout(valueOf, textPaint, L, alignment, 1.1f, 0.0f, false);
        this.n1 = null;
        this.m1 = null;
        r0 r0Var = this.t1;
        if (r0Var != null) {
            org.telegram.ui.Components.p5.release((t0) r0Var.i, (org.telegram.ui.Components.l5) r0Var.h);
        }
        r0 r0Var2 = new r0(this);
        this.t1 = r0Var2;
        r0Var2.a(spannableStringBuilder, textPaint2, L);
        SpannableStringBuilder valueOf2 = SpannableStringBuilder.valueOf(M03);
        valueOf2.setSpan(new y31(org.telegram.messenger.g0.o()), 0, valueOf2.length(), 33);
        this.p1 = false;
        this.q1 = 0;
        this.x1 = null;
        StaticLayout staticLayout = new StaticLayout(valueOf2, (TextPaint) R("paintChatActionText"), L, alignment, 1.0f, 0.0f, false);
        this.y1 = staticLayout;
        this.z1 = true;
        this.E1 = b0(staticLayout);
    }

    public t0(Context context, org.telegram.ui.ActionBar.e6 e6Var, boolean z10) {
        super(context);
        this.n = new dc(this);
        int i7 = m10.t0;
        this.I = i7;
        fi.h7 h7Var = new fi.h7(null, false);
        this.e0 = h7Var;
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
        this.r1 = new org.telegram.ui.Components.u5(this, 0L, 320L, er.h);
        this.z1 = true;
        TextPaint textPaint = new TextPaint(1);
        this.F1 = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.G1 = textPaint2;
        TextPaint textPaint3 = new TextPaint(1);
        this.H1 = textPaint3;
        this.K1 = new RadialProgress2(this, null);
        this.O1 = new ca(this, 2);
        this.V1 = new Path();
        this.Y1 = new ArrayList();
        this.b2 = -1;
        this.d2 = new Paint(1);
        this.h2 = new Path();
        this.i2 = new float[8];
        this.j2 = new float[8];
        this.k2 = new Path();
        this.l2 = new int[]{android.R.attr.state_enabled, android.R.attr.state_pressed};
        this.s2 = new s0(this);
        h7Var.a = false;
        this.s = z10;
        this.h1 = e6Var;
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.J = imageReceiver;
        imageReceiver.J0(org.telegram.messenger.g0.u / 2);
        this.M = new org.telegram.ui.Components.t8((org.telegram.ui.ActionBar.e6) null);
        this.x = org.telegram.messenger.z5.q(i7).k();
        textPaint.setTextSize(TypedValue.applyDimension(1, 16.0f, getResources().getDisplayMetrics()));
        textPaint3.setTextSize(TypedValue.applyDimension(1, 15.0f, getResources().getDisplayMetrics()));
        textPaint2.setTextSize(TypedValue.applyDimension(1, 15.0f, getResources().getDisplayMetrics()));
        View view = new View(context);
        this.U1 = view;
        view.setBackground(org.telegram.ui.ActionBar.j6.h0(org.telegram.ui.ActionBar.j6.r1(0.1f, -16777216), 7, org.telegram.messenger.g0.L(16.0f)));
        view.setVisibility(8);
        addView(view);
        ug.r1 r1Var = new ug.r1(10);
        this.W1 = r1Var;
        r1Var.O = 100;
        r1Var.J = false;
        r1Var.M = true;
        r1Var.G = false;
        r1Var.K = true;
        r1Var.H = true;
        r1Var.r = 1;
        r1Var.w = 0.98f;
        r1Var.v = 0.98f;
        r1Var.u = 0.98f;
        r1Var.g = false;
        r1Var.o = 0.0f;
        r1Var.x = 750L;
        r1Var.y = 750;
        r1Var.c();
    }

    @Override // android.view.View
    public final void invalidate(Rect rect) {
        super.invalidate(rect);
        View view = this.w;
        if (view != null) {
            view.invalidate();
        }
        if (!this.o2 || getParent() == null) {
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
        if (!this.o2 || getParent() == null) {
            return;
        }
        View view2 = (View) getParent();
        if (view2.getParent() != null) {
            view2.invalidate();
            ((View) view2.getParent()).invalidate();
        }
    }

    @Override // org.telegram.messenger.x5
    public final void C(boolean z10) {
    }

    @Override // org.telegram.ui.Cells.p4
    public final /* synthetic */ void b(boolean z10, boolean z11) {
    }

    @Override // org.telegram.messenger.x5
    public final void i(long j3, long j10) {
    }

    @Override // org.telegram.messenger.x5
    public final void o(long j3, long j10) {
    }
}
