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
import b8.mf;
import b8.pf;
import ci.mb;
import ci.wb;
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
import org.telegram.messenger.ac;
import org.telegram.messenger.az;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cs;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.messenger.jz;
import org.telegram.messenger.l10;
import org.telegram.messenger.lc;
import org.telegram.messenger.li;
import org.telegram.messenger.qr;
import org.telegram.messenger.ri;
import org.telegram.messenger.zi;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.RadialProgress2;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.ch0;
import org.telegram.ui.Components.f01;
import org.telegram.ui.Components.f30;
import org.telegram.ui.Components.fc;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.iw0;
import org.telegram.ui.Components.ly0;
import org.telegram.ui.Components.o31;
import org.telegram.ui.Components.rx0;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.Components.v31;
import org.telegram.ui.Components.w70;
import org.telegram.ui.Components.wp;
import org.telegram.ui.Components.xq;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ej;
import org.telegram.ui.i81;
import org.telegram.ui.kb;
import org.telegram.ui.kl;
import org.telegram.ui.mw0;
import org.telegram.ui.of;
import org.telegram.ui.tf;
import org.telegram.ui.zm;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public class t0 extends z implements org.telegram.messenger.x5, cs, p4 {
    public static final HashMap t2;
    public float A0;
    public TextPaint A1;
    public float B0;
    public StaticLayout B1;
    public float C0;
    public float C1;
    public boolean D0;
    public StaticLayout D1;
    public yh.f E;
    public boolean E0;
    public float E1;
    public boolean F;
    public final dh.o0 F0;
    public final TextPaint F1;
    public boolean G;
    public float G0;
    public final TextPaint G1;
    public boolean H;
    public float H0;
    public final TextPaint H1;
    public final int I;
    public ci.n6 I0;
    public TLRPC.Document I1;
    public final ImageReceiver J;
    public org.telegram.ui.Wallet.b4 J0;
    public TLRPC.VideoSize J1;
    public Drawable K;
    public boolean K0;
    public final RadialProgress2 K1;
    public Path L;
    public float L0;
    public int L1;
    public final org.telegram.ui.Components.u8 M;
    public float M0;
    public boolean M1;
    public StaticLayout N;
    public float N0;
    public RectF N1;
    public int O;
    public final RectF O0;
    public final ca O1;
    public int P;
    public iw0 P0;
    public boolean P1;
    public StaticLayout Q;
    public zi Q0;
    public ColorMatrixColorFilter Q1;
    public int R;
    public int R0;
    public CornerPathEffect R1;
    public int S;
    public CharSequence S0;
    public Path S1;
    public int T;
    public ai.m2 T0;
    public ly0 T1;
    public int U;
    public int U0;
    public final View U1;
    public int V;
    public int V0;
    public final Path V1;
    public int W;
    public Paint W0;
    public final vg.s1 W1;
    public TextPaint X0;
    public int X1;
    public final ArrayList Y0;
    public final ArrayList Y1;
    public final ArrayList Z0;
    public e5.u Z1;
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
    public final ei.o7 e0;
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
    public ly0 m1;
    public int m2;
    public final gc n;
    public boolean n0;
    public StaticLayout n1;
    public SpannableStringBuilder n2;
    public f01 o0;
    public boolean o1;
    public boolean o2;
    public final RectF p0;
    public boolean p1;
    public Runnable p2;
    public final ArrayList q0;
    public int q1;
    public PorterDuffColorFilter q2;
    public w70 r;
    public final Stack r0;
    public final org.telegram.ui.Components.u5 r1;
    public int r2;
    public final boolean s;
    public org.telegram.ui.Components.l5 s0;
    public k4.j s1;
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
    public ly0 x1;
    public URLSpan y;
    public ac y0;
    public StaticLayout y1;
    public float z0;
    public boolean z1;

    static {
        HashMap hashMap = new HashMap();
        t2 = hashMap;
        com.google.android.recaptcha.internal.a.w(1, hashMap, "1⃣", 3, "2⃣");
        com.google.android.recaptcha.internal.a.w(6, hashMap, "3⃣", 12, "4⃣");
        hashMap.put(24, "5⃣");
    }

    public t0(Context context) {
        this(context, null, false);
    }

    public static SpannableStringBuilder E(String str) {
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
        for (int i3 = 0; i3 < staticLayout.getLineCount(); i3++) {
            float ceil = (int) Math.ceil(staticLayout.getLineWidth(i3));
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
        vg.s1 s1Var = this.W1;
        if (z10 == s1Var.g) {
            return;
        }
        s1Var.g = z10;
        if (z10) {
            s1Var.R = System.currentTimeMillis();
            return;
        }
        for (int i3 = 0; i3 < s1Var.n.size(); i3++) {
            vg.r1 r1Var = (vg.r1) s1Var.n.get(i3);
            r1Var.a = (System.currentTimeMillis() - s1Var.R) + r1Var.a;
        }
        invalidate();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v7 */
    public final void A(CharSequence charSequence, SpannableStringBuilder spannableStringBuilder, CharSequence charSequence2, boolean z10, CharSequence charSequence3, int i3, String str, int i10, boolean z11) {
        ?? r42;
        int i11;
        int a10;
        CharSequence charSequence4 = charSequence2;
        int L = i10 - org.telegram.messenger.g0.L(16.0f);
        zi ziVar = this.Q0;
        if (ziVar != null && ziVar.D == 30) {
            L -= org.telegram.messenger.g0.L(16.0f);
        }
        int i12 = L;
        if (charSequence != null) {
            zi ziVar2 = this.Q0;
            TextPaint textPaint = this.F1;
            if (ziVar2 == null || ziVar2.D != 30) {
                textPaint.setTextSize(org.telegram.messenger.g0.L(16.0f));
            } else {
                textPaint.setTextSize(org.telegram.messenger.g0.L(14.0f));
            }
            SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(charSequence);
            valueOf.setSpan(new o31(org.telegram.messenger.g0.o()), 0, valueOf.length(), 33);
            r42 = 0;
            this.k1 = new StaticLayout(valueOf, textPaint, i12, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
        } else {
            r42 = 0;
            this.k1 = null;
        }
        this.n1 = null;
        if (spannableStringBuilder != null) {
            ly0 ly0Var = new ly0(spannableStringBuilder, 10.0f, null);
            this.m1 = ly0Var;
            ly0Var.a.linkColor = -1;
        } else {
            this.m1 = null;
        }
        zi ziVar3 = this.Q0;
        TextPaint textPaint2 = this.G1;
        if (ziVar3 != null && ziVar3.D == 35) {
            textPaint2.setTextSize(org.telegram.messenger.g0.L(14.3f));
        } else if (ziVar3 == null || !(W() || (i11 = this.Q0.D) == 30 || i11 == 18 || i11 == 31 || i11 == 37 || i11 == 33)) {
            textPaint2.setTextSize(org.telegram.messenger.g0.L(15.0f));
        } else {
            textPaint2.setTextSize(org.telegram.messenger.g0.L(13.0f));
        }
        int L2 = i12 - org.telegram.messenger.g0.L(12.0f);
        zi ziVar4 = this.Q0;
        if (ziVar4 != null && ziVar4.D == 22 && zi.B0(ziVar4.k) >= 0 && (a10 = gi.l3.a(charSequence4, textPaint2)) < L2 && a10 > L2 / 5.0f) {
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
                charSequence4 = org.telegram.messenger.i6.m(charSequence4, textPaint2.getFontMetricsInt(), r42, null, r42);
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
                this.x1 = new ly0(bd.M0(2131750273, null), textPaint2.getTextSize() / org.telegram.messenger.g0.p, org.telegram.messenger.g0.o());
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
            valueOf2.setSpan(new o31(org.telegram.messenger.g0.o()), r42, valueOf2.length(), 33);
            StaticLayout staticLayout = new StaticLayout(valueOf2, (TextPaint) O("paintChatActionText"), i12, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
            this.y1 = staticLayout;
            this.z1 = (!z11 || this.p1) ? r42 : true;
            this.E1 = Z(staticLayout);
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
            ai.t2.d(path, 1.35f, r42);
        }
        ly0 ly0Var2 = new ly0(str, i3, org.telegram.messenger.g0.o());
        this.T1 = ly0Var2;
        ly0Var2.p = org.telegram.messenger.g0.L(62.0f);
    }

    public final void B(int i3, CharSequence charSequence) {
        CharSequence charSequence2;
        q0 q0Var;
        TLRPC.Message message;
        zi ziVar;
        int i10;
        int L = i3 - org.telegram.messenger.g0.L(30.0f);
        if (this.j0) {
            L -= org.telegram.messenger.g0.L(64.0f);
        }
        if (V()) {
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
        TextPaint textPaint = (V() || ((ziVar = this.Q0) != null && ((i10 = ziVar.D) == 34 || i10 == 35))) ? (TextPaint) O("paintChatActionText3") : (ziVar == null || !ziVar.q2) ? (TextPaint) O("paintChatActionText") : (TextPaint) O("paintChatActionText2");
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
        this.N = new StaticLayout(charSequence2, textPaint2, i12, V() ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
        this.Q = null;
        zi ziVar2 = this.Q0;
        if (ziVar2 != null && (message = ziVar2.k) != null) {
            TLRPC.MessageAction messageAction = message.action;
            if (messageAction instanceof TLRPC.TL_messageActionSuggestedPostApproval) {
                TLRPC.TL_messageActionSuggestedPostApproval tL_messageActionSuggestedPostApproval = (TLRPC.TL_messageActionSuggestedPostApproval) messageAction;
                if (!tL_messageActionSuggestedPostApproval.rejected && !tL_messageActionSuggestedPostApproval.balance_too_low) {
                    this.Q = new StaticLayout(org.telegram.messenger.i6.n(org.telegram.messenger.g0.X2(bd.M0(2131744376, null)), textPaint2.getFontMetricsInt(), false, null, 0, 1.0f, 0), textPaint2, i12, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                }
            }
        }
        this.s0 = org.telegram.ui.Components.p5.update(0, this, (!this.s || (q0Var = this.g1) == null || q0Var.d()) ? false : true, this.s0, this.N);
        this.P = 0;
        this.O = 0;
        this.R = 0;
        StaticLayout staticLayout = this.Q;
        if (staticLayout != null) {
            int height = staticLayout.getHeight();
            this.R = height;
            this.R = org.telegram.messenger.g0.L(12.0f) + height;
        }
        zi ziVar3 = this.Q0;
        if (ziVar3 == null || !ziVar3.h2) {
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
        this.S = (i3 - this.O) / 2;
        int L2 = org.telegram.messenger.g0.L(7.0f);
        this.T = L2;
        if (this.Q != null) {
            this.T = org.telegram.messenger.k5.C(11.0f, this.R, L2);
        }
        this.U = (i3 - (V() ? this.O : this.N.getWidth())) / 2;
        this.V = (i3 - i12) / 2;
        Stack stack = this.r0;
        ArrayList arrayList = this.q0;
        stack.addAll(arrayList);
        arrayList.clear();
        if (charSequence3 instanceof Spannable) {
            StaticLayout staticLayout2 = this.N;
            int i14 = this.S;
            yh.f.a(this, staticLayout2, i14, i14 + this.O, (Spannable) charSequence3, stack, arrayList, null);
        }
    }

    public final void G(Canvas canvas, boolean z10) {
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
        int i3;
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
        if (!t0Var2.s || ((!t0Var2.Q() || z10) && (t0Var2.Q() || !z10))) {
            Paint O = t0Var2.O("paintChatActionBackground");
            Paint O2 = t0Var2.O("paintChatActionBackgroundDarken");
            t0Var2.t0 = (TextPaint) t0Var2.O("paintChatActionText");
            int i16 = t0Var2.U0;
            org.telegram.ui.ActionBar.e6 e6Var4 = t0Var2.h1;
            if (i16 >= 0) {
                int w02 = org.telegram.ui.ActionBar.k6.w0(i16, e6Var4);
                if (t0Var2.W0 == null) {
                    Paint paint6 = new Paint(1);
                    t0Var2.W0 = paint6;
                    paint6.setColor(w02);
                    TextPaint textPaint = new TextPaint(1);
                    t0Var2.X0 = textPaint;
                    textPaint.setTypeface(org.telegram.messenger.g0.o());
                    t0Var2.X0.setTextSize(org.telegram.messenger.g0.L(Math.max(16, az.W0) - 2));
                    t0Var2.X0.setColor(org.telegram.ui.ActionBar.k6.w0(t0Var2.V0, e6Var4));
                }
                O = t0Var2.W0;
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
                        paint5 = O2;
                        i14 = ((Integer) arrayList3.get(i24 + 1)).intValue();
                    } else {
                        paint5 = O2;
                        i14 = 0;
                    }
                    int i27 = lineBottom - i23;
                    if (i24 == 0 || intValue2 > i22) {
                        i27 = org.telegram.messenger.g0.L(3.0f) + i27;
                    }
                    if (i24 == i26 || intValue2 > i14) {
                        i27 = org.telegram.messenger.g0.L(3.0f) + i27;
                    }
                    Paint paint7 = O;
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
                    O2 = paint5;
                    O = paint7;
                    e6Var4 = e6Var3;
                    arrayList3 = arrayList2;
                }
                paint = O;
                paint2 = O2;
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
                if (t0Var.V() && !t0Var.W()) {
                    rectF.left = (f19 - (t0Var.O / 2.0f)) - org.telegram.messenger.g0.L(17.0f);
                    rectF.top = L4;
                    rectF.right = (t0Var.O / 2.0f) + f19 + org.telegram.messenger.g0.L(17.0f);
                    rectF.bottom = org.telegram.messenger.g0.L(28.0f) + L4 + t0Var.P + t0Var.R;
                    path.reset();
                    path.addRoundRect(rectF, org.telegram.messenger.g0.L(15.0f), org.telegram.messenger.g0.L(15.0f), Path.Direction.CW);
                    path.close();
                }
            } else {
                paint = O;
                paint2 = O2;
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
                org.telegram.ui.ActionBar.k6.r(t0Var.v0, t0Var.u0 + org.telegram.messenger.g0.L(f12), t0Var.getMeasuredWidth(), t0Var.w0);
            }
            boolean z12 = t0Var instanceof ej;
            float f26 = (!z12 || org.telegram.ui.ActionBar.k6.i1(e6Var2)) ? 1.0f : 0.75f;
            if (!z10 || (t0Var.getAlpha() == 1.0f && !z12)) {
                paint3 = paint2;
                paint4 = paint;
                if (z12) {
                    i3 = paint4.getAlpha();
                    i10 = paint3.getAlpha();
                    paint4.setAlpha((int) (i3 * f26));
                    paint3.setAlpha((int) (i10 * f26));
                } else {
                    i3 = -1;
                    i10 = -1;
                }
            } else {
                i3 = paint.getAlpha();
                i10 = paint2.getAlpha();
                paint4 = paint;
                paint4.setAlpha((int) (t0Var.getAlpha() * i3 * f26));
                paint3 = paint2;
                paint3.setAlpha((int) (t0Var.getAlpha() * i10 * f26));
            }
            zi ziVar = t0Var.Q0;
            Paint paint8 = t0Var.d2;
            if (ziVar == null || !ziVar.h2) {
                canvas2 = canvas;
                canvas2.drawPath(path, paint4);
                if (t0Var.Q() && paint3.getAlpha() > 0) {
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
            if (t0Var.S()) {
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
                if (t0Var.Q() && paint3.getAlpha() > 0) {
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
            zi ziVar2 = t0Var.Q0;
            if (t0Var.R()) {
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
                if (t0Var.Q()) {
                    canvas2.drawRoundRect(t0Var.N1, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), paint3);
                }
            } else if (t0Var.P0 != null) {
                float L11 = org.telegram.messenger.g0.L(174.0f);
                iw0 iw0Var = t0Var.P0;
                iw0Var.getClass();
                float L12 = org.telegram.messenger.g0.L(f14) + ((int) iw0Var.f.i()) + (iw0Var.i ? org.telegram.messenger.g0.L(40.0f) : 0);
                float width3 = (t0Var.getWidth() - L11) / f13;
                if (t0Var.N1 == null) {
                    t0Var.N1 = new RectF();
                }
                t0Var.N1.set(width3, org.telegram.messenger.g0.L(f12), L11 + width3, org.telegram.messenger.g0.L(f12) + L12);
                canvas2.drawRoundRect(t0Var.N1, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), paint4);
                if (t0Var.Q()) {
                    canvas2.drawRoundRect(t0Var.N1, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), paint3);
                }
            } else if (t0Var.U(ziVar2)) {
                float width4 = (t0Var.getWidth() - t0Var.j1) / f13;
                float f27 = t0Var.T + t0Var.P;
                if (t0Var.W()) {
                    float L13 = f27 + org.telegram.messenger.g0.L(f12);
                    org.telegram.messenger.g0.P.set(width4, L13, t0Var.j1 + width4, t0Var.f + L13);
                } else {
                    float L14 = f27 + org.telegram.messenger.g0.L(12.0f);
                    RectF rectF4 = org.telegram.messenger.g0.P;
                    float f28 = t0Var.j1;
                    rectF4.set(width4, L14, width4 + f28, f28 + L14 + t0Var.L1);
                }
                if (ziVar2 != null && ziVar2.D == 18 && !t0Var.p1 && (r0Var = t0Var.t1) != null && t0Var.q1 > 0) {
                    RectF rectF5 = org.telegram.messenger.g0.P;
                    rectF5.bottom = a1.g.D(1.0f, t0Var.r1.c, ((StaticLayout) r0Var.f).getHeight() - t0Var.q1, rectF5.bottom);
                }
                if (t0Var.N1 == null) {
                    t0Var.N1 = new RectF();
                }
                t0Var.N1.set(org.telegram.messenger.g0.P);
                if (ziVar2 == null || (!((i11 = ziVar2.D) == 33 || i11 == 35) || t0Var.Z1 == null)) {
                    canvas2.drawRoundRect(t0Var.N1, org.telegram.messenger.g0.L(f15), org.telegram.messenger.g0.L(f15), paint4);
                    if (t0Var.Q()) {
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
                    if (t0Var.Q()) {
                        canvas2.drawPath(path2, paint3);
                    }
                }
            }
            if (i3 >= 0) {
                paint4.setAlpha(i3);
                paint3.setAlpha(i10);
            }
        }
    }

    public final void H(Canvas canvas) {
        float f10;
        float f11;
        Canvas canvas2 = canvas;
        canvas2.save();
        float f12 = 2.0f;
        canvas2.translate(this.k0 / 2.0f, getPaddingTop());
        canvas2.save();
        canvas2.translate(this.U, this.T);
        StaticLayout staticLayout = this.N;
        org.telegram.ui.Components.p5.drawAnimatedEmojis(canvas2, staticLayout, this.s0, 0.0f, this.q0, 0.0f, 0.0f, 0.0f, 1.0f, staticLayout != null ? L(staticLayout.getPaint().getColor()) : null);
        canvas2.restore();
        float f13 = 4.0f;
        if (R()) {
            canvas2.save();
            float width = getWidth();
            ci.n6 n6Var = this.I0;
            canvas2.translate((width - n6Var.T.f) / 2.0f, n6Var.p ? org.telegram.messenger.g0.L(4.0f) : org.telegram.messenger.g0.L(16.0f) + this.T + this.P);
            this.I0.c(canvas2);
            canvas2.restore();
        }
        canvas2.restore();
        f01 f01Var = this.o0;
        org.telegram.ui.ActionBar.e6 e6Var = this.h1;
        if (f01Var != null) {
            float alpha = getAlpha();
            if (e6Var != null) {
                e6Var.b(this.v0, this.u0 + 0.0f, getMeasuredWidth(), this.w0);
            } else {
                org.telegram.ui.ActionBar.k6.r(this.v0, this.u0 + 0.0f, getMeasuredWidth(), this.w0);
            }
            this.o0.c(canvas, getWidth(), this.k0, 0.0f, 1.0f, alpha, this.n0);
            canvas2 = canvas;
        }
        ArrayList arrayList = this.Y1;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        if (e6Var != null) {
            e6Var.b(this.v0, this.u0 + org.telegram.messenger.g0.L(4.0f), getMeasuredWidth(), this.w0);
        } else {
            org.telegram.ui.ActionBar.k6.r(this.v0, this.u0 + org.telegram.messenger.g0.L(4.0f), getMeasuredWidth(), this.w0);
        }
        float width2 = (getWidth() - this.j1) / 2.0f;
        float L = org.telegram.messenger.g0.L(4.0f) + org.telegram.messenger.g0.L(4.0f) + this.T + this.P + this.f;
        float L2 = (this.j1 - org.telegram.messenger.g0.L(4.0f)) / 2.0f;
        int i3 = 0;
        while (i3 < arrayList.size()) {
            c0 c0Var = (c0) arrayList.get(i3);
            float a10 = c0Var.a();
            float L3 = ((org.telegram.messenger.g0.L(f13) + L2) * i3) + width2;
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
            float L4 = org.telegram.messenger.g0.L(Math.min(6.75f, az.Y0));
            float[] fArr = this.j2;
            Arrays.fill(fArr, L4);
            if ((c0Var.g & 9) == 9) {
                float L5 = org.telegram.messenger.g0.L(az.Y0);
                fArr[7] = L5;
                fArr[6] = L5;
            }
            if ((c0Var.g & 10) == 10) {
                float L6 = org.telegram.messenger.g0.L(az.Y0);
                fArr[5] = L6;
                fArr[4] = L6;
            }
            Path path = this.k2;
            path.rewind();
            path.addRoundRect(rectF, fArr, Path.Direction.CW);
            canvas2.drawPath(path, O("paintChatActionBackground"));
            if (Q()) {
                canvas2.drawPath(path, org.telegram.ui.ActionBar.k6.h2);
            }
            canvas2.save();
            canvas2.clipPath(path);
            y yVar = c0Var.s;
            if (yVar != null) {
                int i10 = (int) L;
                yVar.setBounds((int) L3, i10, (int) f14, c0Var.f + i10);
                c0Var.s.setAlpha(hs.e4);
                c0Var.s.draw(canvas2);
            }
            canvas2.restore();
            canvas2.save();
            float L7 = c0Var.t != null ? org.telegram.messenger.g0.L(26.0f) : 0;
            float z10 = com.google.android.recaptcha.internal.a.z(L2 - (c0Var.h.k() + (c0Var.t != null ? org.telegram.messenger.g0.L(f10) : 0)), L7, f12, L3);
            Drawable drawable = c0Var.t;
            if (drawable != null) {
                int i11 = (int) z10;
                f11 = f12;
                drawable.setBounds(i11, (int) (((c0Var.f - org.telegram.messenger.g0.L(24.0f)) / f12) + L), org.telegram.messenger.g0.L(24.0f) + i11, org.telegram.messenger.g0.L(24.0f) + ((int) (((c0Var.f - org.telegram.messenger.g0.L(24.0f)) / f11) + L)));
                c0Var.t.setAlpha(c0Var.m ? 128 : hs.e4);
                c0Var.t.draw(canvas2);
                z10 += L7;
            } else {
                f11 = f12;
            }
            c0Var.h.p = Math.max(1, (((int) L2) - org.telegram.messenger.g0.L(15.0f)) - r6);
            c0Var.h.f(canvas2, z10, (org.telegram.messenger.g0.L(40.0f) / f11) + L, c0Var.m ? 0.5f : 1.0f);
            canvas2.restore();
            canvas2.restore();
            i3++;
            f13 = f10;
            f12 = f11;
        }
    }

    public final void I(Canvas canvas, boolean z10) {
        if (this.s) {
            if (Q() && !z10) {
                return;
            }
            if (!Q() && z10) {
                return;
            }
        }
        J(canvas, z10, null);
    }

    public final void J(Canvas canvas, boolean z10, Integer num) {
        Canvas canvas2;
        float alpha = z10 ? getAlpha() : 1.0f;
        if (alpha <= 0.0f) {
            return;
        }
        org.telegram.ui.ActionBar.e6 e6Var = this.h1;
        if (e6Var != null) {
            e6Var.b(this.v0, this.u0 + org.telegram.messenger.g0.L(4.0f), getMeasuredWidth(), this.w0);
        } else {
            org.telegram.ui.ActionBar.k6.r(this.v0, this.u0 + org.telegram.messenger.g0.L(4.0f), getMeasuredWidth(), this.w0);
        }
        zi ziVar = this.Q0;
        if (ziVar == null || !ziVar.P5()) {
            return;
        }
        dh.o0 o0Var = this.F0;
        o0Var.getClass();
        o0Var.a = 1.0f;
        if (alpha < 1.0f) {
            canvas2 = canvas;
            canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (alpha * 255.0f), 31);
        } else {
            canvas2 = canvas;
        }
        s0 s0Var = this.s2;
        o0Var.d(canvas2, s0Var.b ? s0Var.c : 1.0f, num);
        if (alpha < 1.0f) {
            canvas2.restore();
        }
    }

    public final void K(kl klVar, Canvas canvas, int i3, Integer num, float f10) {
        dh.o0 o0Var = this.F0;
        o0Var.getClass();
        org.telegram.ui.ActionBar.e6 e6Var = this.h1;
        if (e6Var != null) {
            e6Var.b(this.v0, this.u0 + org.telegram.messenger.g0.L(4.0f), getMeasuredWidth(), this.w0);
        } else {
            org.telegram.ui.ActionBar.k6.r(this.v0, this.u0 + org.telegram.messenger.g0.L(4.0f), getMeasuredWidth(), this.w0);
        }
        o0Var.A = f10;
        o0Var.f(klVar, canvas, i3, num);
    }

    public final ColorFilter L(int i3) {
        if (i3 != this.r2 || this.q2 == null) {
            this.r2 = i3;
            this.q2 = new PorterDuffColorFilter(i3, PorterDuff.Mode.SRC_IN);
        }
        return this.q2;
    }

    @Override // org.telegram.messenger.x5
    public final void M(String str) {
        TLRPC.PhotoSize photoSize;
        zi ziVar = this.Q0;
        if (ziVar == null || ziVar.D != 11) {
            return;
        }
        int size = ziVar.n0.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                photoSize = null;
                break;
            }
            photoSize = (TLRPC.PhotoSize) ziVar.n0.get(i3);
            if (photoSize instanceof TLRPC.TL_photoStrippedSize) {
                break;
            } else {
                i3++;
            }
        }
        this.J.r0(this.y0, "g", ac.f(photoSize, ziVar.l0), "50_50_b", this.M, 0L, null, ziVar, 1);
        org.telegram.messenger.z5.q(this.I).v(this);
    }

    public final int N(zi ziVar) {
        int i3;
        int i10 = this.i1;
        int i11 = ziVar.D;
        if (i11 == 37) {
            i10 = org.telegram.messenger.g0.L(52.0f);
        } else if (i11 == 21 || W()) {
            i10 = org.telegram.messenger.g0.L(78.0f);
        }
        if (V() || (i3 = ziVar.D) == 34 || i3 == 35) {
            return 0;
        }
        return i10;
    }

    public Paint O(String str) {
        org.telegram.ui.ActionBar.e6 e6Var = this.h1;
        Paint d = e6Var != null ? e6Var.d(str) : null;
        return d != null ? d : org.telegram.ui.ActionBar.k6.V0(str);
    }

    public final float P(zi ziVar) {
        hp s12;
        String str;
        if (ziVar == null) {
            return 1.0f;
        }
        try {
            if (ziVar.D == 22 && (str = (s12 = hp.s1(this.I)).R2) != null && TextUtils.equals(ziVar.k.action.wallpaper.uploadingImage, str)) {
                return s12.S2.r;
            }
            return 1.0f;
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
            return 1.0f;
        }
    }

    public final boolean Q() {
        if (this.W0 != null) {
            return false;
        }
        org.telegram.ui.ActionBar.e6 e6Var = this.h1;
        return e6Var != null ? e6Var.g() : org.telegram.ui.ActionBar.k6.d1();
    }

    public final boolean R() {
        ci.n6 n6Var = this.I0;
        return (n6Var == null || n6Var.Q == null) ? false : true;
    }

    public final boolean S() {
        TLRPC.Message message;
        zi ziVar = this.Q0;
        return (ziVar == null || (message = ziVar.k) == null || !(message.action instanceof TLRPC.TL_messageActionGramTransfer)) ? false : true;
    }

    public final void T() {
        q0 q0Var = this.g1;
        if (q0Var != null && q0Var.d()) {
            super.invalidate();
        } else if (getParent() instanceof View) {
            ((View) getParent()).invalidate();
        }
    }

    public final boolean U(zi ziVar) {
        if (ziVar == null) {
            return false;
        }
        int i3 = ziVar.D;
        return i3 == 30 || i3 == 18 || i3 == 25 || W();
    }

    public final boolean V() {
        TLRPC.Message message;
        zi ziVar = this.Q0;
        return (ziVar == null || (message = ziVar.k) == null || !(message.action instanceof TLRPC.TL_messageActionSuggestedPostApproval)) ? false : true;
    }

    public final boolean W() {
        zi ziVar;
        int i3;
        if (R() || this.P0 != null || (i3 = (ziVar = this.Q0).D) == 31 || i3 == 37 || i3 == 33 || i3 == 35 || i3 == 34 || i3 == 21 || i3 == 22 || ziVar.A4()) {
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

    public final boolean X() {
        zi ziVar = this.Q0;
        if (ziVar == null) {
            return false;
        }
        TLRPC.Message message = ziVar.k;
        TLRPC.MessageAction messageAction = message.action;
        if (((messageAction instanceof TLRPC.TL_messageActionGiftCode) || (messageAction instanceof TLRPC.TL_messageActionGiftStars)) && (message.from_id instanceof TLRPC.TL_peerUser)) {
            return l10.B(hp.s1(this.I).a2(Long.valueOf(this.Q0.k.from_id.user_id)));
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.p4
    public final /* synthetic */ boolean a() {
        return false;
    }

    public final void a0(CharacterStyle characterStyle) {
        if (this.g1 == null || !(characterStyle instanceof URLSpan)) {
            return;
        }
        String url = ((URLSpan) characterStyle).getURL();
        if (url.startsWith("task")) {
            this.g1.t(this, this.Q0.O1(), Integer.parseInt(url.substring(5)));
            return;
        }
        if (url.startsWith("topic")) {
            URLSpan uRLSpan = this.y;
            if (uRLSpan instanceof v31) {
                TLObject tLObject = ((v31) uRLSpan).c;
                if (tLObject instanceof TLRPC.TL_forumTopic) {
                    rg.c.m(this.g1.E(), -this.g1.a(), (TLRPC.TL_forumTopic) tLObject, 0);
                    return;
                }
                return;
            }
        }
        if (url.startsWith("invite")) {
            URLSpan uRLSpan2 = this.y;
            if (uRLSpan2 instanceof v31) {
                TLObject tLObject2 = ((v31) uRLSpan2).c;
                if (tLObject2 instanceof TLRPC.TL_chatInviteExported) {
                    this.g1.F((TLRPC.TL_chatInviteExported) tLObject2);
                    return;
                }
                return;
            }
        }
        if (url.startsWith("game")) {
            this.g1.h(this, this.Q0.O1());
        } else if (url.startsWith("http")) {
            sf.c.t(getContext(), url);
        } else {
            this.g1.W(Long.parseLong(url));
        }
    }

    public final void b0() {
        TLRPC.TL_premiumGiftOption tL_premiumGiftOption = new TLRPC.TL_premiumGiftOption();
        zi ziVar = this.Q0;
        TLRPC.MessageAction messageAction = ziVar.k.action;
        tL_premiumGiftOption.amount = messageAction.amount;
        tL_premiumGiftOption.months = messageAction.months;
        tL_premiumGiftOption.currency = messageAction.currency;
        String str = null;
        if (ziVar != null && (messageAction instanceof TLRPC.TL_messageActionGiftCode) && !X()) {
            str = ((TLRPC.TL_messageActionGiftCode) this.Q0.k.action).slug;
        }
        if (this.g1 != null) {
            org.telegram.messenger.g0.h3(new lg.y((ViewGroup) this, (Object) tL_premiumGiftOption, str, 27));
        }
    }

    public final void c0() {
        TLRPC.Message message;
        zi ziVar = this.Q0;
        if (ziVar == null || (message = ziVar.k) == null) {
            return;
        }
        TLRPC.MessageAction messageAction = message.action;
        boolean z10 = messageAction instanceof TLRPC.TL_messageActionGiftStars;
        ei.o7 o7Var = this.e0;
        if (z10) {
            Context context = getContext();
            TLRPC.Message message2 = this.Q0.k;
            int i3 = message2.date;
            TLRPC.Peer peer = message2.from_id;
            TLRPC.Peer peer2 = message2.peer_id;
            TLRPC.TL_messageActionGiftStars tL_messageActionGiftStars = (TLRPC.TL_messageActionGiftStars) message2.action;
            org.telegram.ui.ActionBar.e6 e6Var = o7Var.J;
            TL_stars.StarsTransaction starsTransaction = new TL_stars.StarsTransaction();
            starsTransaction.title = null;
            starsTransaction.description = null;
            starsTransaction.photo = null;
            TL_stars.TL_starsTransactionPeer tL_starsTransactionPeer = new TL_stars.TL_starsTransactionPeer();
            starsTransaction.peer = tL_starsTransactionPeer;
            tL_starsTransactionPeer.peer = peer;
            starsTransaction.date = i3;
            starsTransaction.amount = TL_stars.StarsAmount.ofStars(tL_messageActionGiftStars.stars);
            starsTransaction.id = tL_messageActionGiftStars.transaction_id;
            starsTransaction.gift = true;
            starsTransaction.sent_by = peer;
            starsTransaction.received_by = peer2;
            wb.k1(context, false, 0L, this.I, starsTransaction, e6Var);
            return;
        }
        if (messageAction instanceof TLRPC.TL_messageActionPrizeStars) {
            Context context2 = getContext();
            TLRPC.Message message3 = this.Q0.k;
            int i10 = message3.date;
            TLRPC.Peer peer3 = message3.from_id;
            TLRPC.Peer peer4 = message3.peer_id;
            TLRPC.TL_messageActionPrizeStars tL_messageActionPrizeStars = (TLRPC.TL_messageActionPrizeStars) message3.action;
            org.telegram.ui.ActionBar.e6 e6Var2 = o7Var.J;
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
            wb.k1(context2, false, 0L, this.I, starsTransaction2, e6Var2);
            return;
        }
        if (messageAction instanceof TLRPC.TL_messageActionGiftTon) {
            Context context3 = getContext();
            TLRPC.Message message4 = this.Q0.k;
            int i11 = message4.date;
            TLRPC.Peer peer5 = message4.from_id;
            TLRPC.Peer peer6 = message4.peer_id;
            TLRPC.TL_messageActionGiftTon tL_messageActionGiftTon = (TLRPC.TL_messageActionGiftTon) message4.action;
            org.telegram.ui.ActionBar.e6 e6Var3 = o7Var.J;
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
            wb.k1(context3, false, 0L, this.I, starsTransaction3, e6Var3);
            return;
        }
        if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
            if (((TLRPC.TL_messageActionStarGift) messageAction).forceIn) {
                return;
            }
            ci.l6 l6Var = new ci.l6(getContext(), this.I, zi.B0(this.Q0.k), this.h1, null);
            l6Var.i2(this.Q0, null);
            l6Var.show();
            return;
        }
        if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
            if (!((TLRPC.TL_messageActionStarGiftUnique) messageAction).gift.burned) {
                ci.l6 l6Var2 = new ci.l6(getContext(), this.I, zi.B0(this.Q0.k), this.h1, null);
                l6Var2.i2(this.Q0, null);
                l6Var2.show();
                return;
            } else {
                org.telegram.ui.ActionBar.d2 T = LaunchActivity.T();
                if (T == null) {
                    return;
                }
                org.telegram.messenger.k5.o(null, 2131743890, fc.a0(T), R.raw.fire_on, 36);
                return;
            }
        }
        if (messageAction instanceof TLRPC.TL_messageActionSetChatTheme) {
            TLRPC.ChatTheme chatTheme = ((TLRPC.TL_messageActionSetChatTheme) messageAction).theme;
            if (chatTheme instanceof TLRPC.TL_chatThemeUniqueGift) {
                TL_stars.StarGift starGift = ((TLRPC.TL_chatThemeUniqueGift) chatTheme).gift;
                if (starGift instanceof TL_stars.TL_starGiftUnique) {
                    ci.l6 l6Var3 = new ci.l6(getContext(), this.I, zi.B0(this.Q0.k), this.h1, null);
                    l6Var3.h2(starGift.slug, (TL_stars.TL_starGiftUnique) starGift, null);
                    l6Var3.show();
                }
            }
        }
    }

    public final boolean d0(float f10, float f11, tf tfVar) {
        if (S() && !this.Q0.Q3() && !this.Q0.k.premiumEffectWasPlayed) {
            float y9 = getY() + getPaddingTop() + getWalletActionTop();
            if (y9 >= f10 && y9 + org.telegram.messenger.g0.L(140.0f) <= f11) {
                org.telegram.ui.Wallet.b4 b4Var = this.J0;
                ch0 ch0Var = b4Var.l;
                if (b4Var.i0 && b4Var.j0 == null) {
                    b4Var.i0 = false;
                    b4Var.k0 = tfVar;
                    b4Var.K.e(true, 0.0f);
                    b4Var.M = false;
                    b4Var.N = 0L;
                    b4Var.b();
                    b4Var.g();
                    b4Var.t = 18.0f;
                    b4Var.u.f();
                    ch0Var.T(true, 0.0f);
                    ch0Var.start();
                    b4Var.H = true;
                    float f12 = b4Var.R;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    b4Var.j0 = ofFloat;
                    ofFloat.setDuration(2400L);
                    b4Var.j0.setInterpolator(xq.h);
                    int i3 = 5;
                    b4Var.j0.addUpdateListener(new of(b4Var, f12, i3));
                    b4Var.j0.addListener(new i81(b4Var, i3));
                    b4Var.j0.start();
                    b4Var.a.invalidate();
                    this.Q0.k.premiumEffectWasPlayed = true;
                    qr.a0(this.I).X1(zi.B0(this.Q0.k), this.Q0.k);
                    return true;
                }
            }
        }
        return false;
    }

    @Override // org.telegram.messenger.cs
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        zi ziVar;
        if (i3 == hs.m1) {
            setSpoilersSuppressed(false);
            return;
        }
        if (i3 == hs.i4) {
            invalidate();
            return;
        }
        if (i3 == hs.l1) {
            setSpoilersSuppressed(true);
            return;
        }
        if (i3 == hs.W2 || i3 == hs.F3 || i3 == hs.X2) {
            zi ziVar2 = this.Q0;
            if (ziVar2 != null) {
                f0(ziVar2, true);
                return;
            }
            return;
        }
        if (i3 == hs.y0) {
            if (!Objects.equals(objArr[0], h10.i(this.I).c0) || (ziVar = this.Q0) == null) {
                return;
            }
            f0(ziVar, true);
            return;
        }
        if (i3 == hs.a4 && S()) {
            this.n2 = null;
            this.W = 0;
            requestLayout();
            invalidate();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view != this.U1) {
            return super.drawChild(canvas, view, j10);
        }
        float a10 = this.n.a(0.02f);
        canvas.save();
        canvas.scale(a10, a10, (view.getMeasuredWidth() / 2.0f) + view.getX(), (view.getMeasuredHeight() / 2.0f) + view.getY());
        boolean drawChild = super.drawChild(canvas, view, j10);
        canvas.restore();
        return drawChild;
    }

    @Override // org.telegram.ui.Cells.p4
    public final void e(TLRPC.ReactionCount reactionCount, boolean z10, float f10, float f11) {
        q0 q0Var = this.g1;
        if (q0Var != null) {
            q0Var.v0(this, reactionCount, z10, f10, f11);
        }
    }

    public final void e0(int i3, boolean z10, boolean z11) {
        int i10 = this.R0;
        if (i10 == i3 || i10 / 3600 == i3 / 3600) {
            return;
        }
        String M0 = z10 ? i3 == 2147483646 ? bd.M0(2131748500, "MessageScheduledUntilOnline") : bd.a0("MessageScheduledOn", null, 2131748536, bd.u(i3, false)) : bd.u(i3, false);
        this.R0 = i3;
        CharSequence charSequence = this.S0;
        if (charSequence == null || !TextUtils.equals(M0, charSequence)) {
            this.S0 = M0;
            this.n2 = null;
            i0(z11);
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
    public final void f0(zi ziVar, boolean z10) {
        StaticLayout staticLayout;
        TLRPC.TL_messageReactions tL_messageReactions;
        int i3;
        int i10;
        org.telegram.ui.ActionBar.e6 e6Var;
        int i11;
        int i12;
        org.telegram.ui.ActionBar.e6 e6Var2;
        String str;
        zi ziVar2;
        TLRPC.Document document;
        String str2;
        TLRPC.Document document2;
        String str3;
        ArrayList<TLRPC.TL_stickerPack> arrayList;
        zi ziVar3;
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
        ac acVar;
        TLRPC.PhotoSize photoSize2;
        ImageReceiver imageReceiver4;
        boolean z11;
        float f10;
        RadialProgress2 radialProgress2;
        TLRPC.WallPaper wallPaper;
        TLRPC.MessageAction messageAction;
        String str4;
        f01 f01Var;
        int i17;
        int paddingTop;
        int i18;
        TLRPC.Message message;
        String m10;
        String str5;
        ActivityManager activityManager;
        zi ziVar4 = ziVar;
        if (ziVar4 == null) {
            return;
        }
        if (this.Q0 != ziVar4 && this.N0 != 0.0f) {
            setWalletSlidingOffset(0.0f);
        }
        TLRPC.Message message2 = ziVar4.k;
        if ((message2 == null || !(message2.action instanceof TLRPC.TL_messageActionGramTransfer) || this.b2 == message2.send_state) && this.Q0 == ziVar4 && (((staticLayout = this.N) == null || TextUtils.equals(staticLayout.getText(), ziVar4.v)) && !((!this.E0 && ziVar4.C != null) || z10 || ziVar4.D == 21 || ziVar4.K1))) {
            return;
        }
        boolean z12 = org.telegram.messenger.r2.a;
        ArrayList arrayList2 = this.Y1;
        arrayList2.clear();
        this.Z1 = null;
        this.n2 = null;
        zi ziVar5 = this.Q0;
        int i19 = 1;
        boolean z13 = ziVar5 == null || ziVar5.k1 != ziVar4.k1;
        if (ziVar5 != null) {
            ziVar4.m1 = ziVar5.m1;
        }
        if (!z13 && ziVar5 != null && S()) {
            ziVar4.k.premiumEffectWasPlayed |= this.Q0.k.premiumEffectWasPlayed;
        }
        this.Q0 = ziVar4;
        boolean S = S();
        org.telegram.ui.ActionBar.e6 e6Var3 = this.h1;
        if (S && this.J0 == null) {
            org.telegram.ui.Wallet.b4 b4Var = new org.telegram.ui.Wallet.b4(this, e6Var3);
            this.J0 = b4Var;
            b4Var.s0 = new m0(this, i19);
            b4Var.n(this.K0);
        }
        org.telegram.ui.Wallet.b4 b4Var2 = this.J0;
        if (b4Var2 != null) {
            boolean S2 = S();
            t0 t0Var = b4Var2.a;
            b4Var2.n = S2;
            if (S2 && b4Var2.m == null && !b4Var2.o && com.google.android.recaptcha.internal.a.u(t0Var) && az.o() != 0 && (activityManager = (ActivityManager) t0Var.getContext().getSystemService("activity")) != null && activityManager.getDeviceConfigurationInfo().reqGlEsVersion >= 196608) {
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
        TLRPC.Message message3 = ziVar4.k;
        int i20 = this.I;
        if (message3 != null && (message3.action instanceof TLRPC.TL_messageActionGramTransfer)) {
            hp s12 = hp.s1(i20);
            long o10 = org.telegram.messenger.m5.o(ziVar4.k.peer_id);
            if (l10.A(o10)) {
                m10 = bd.M0(2131742981, null);
            } else if (ziVar4.k.peer_id == null) {
                str5 = null;
                org.telegram.ui.Wallet.b4 b4Var3 = this.J0;
                boolean Q3 = ziVar4.Q3();
                TLRPC.Message message4 = ziVar4.k;
                b4Var3.m(Q3, (TLRPC.TL_messageActionGramTransfer) message4.action, str5, message4.send_state, z13, !message4.premiumEffectWasPlayed);
                this.b2 = ziVar4.k.send_state;
            } else {
                m10 = org.telegram.messenger.m5.m(s12.e2(o10));
            }
            str5 = m10;
            org.telegram.ui.Wallet.b4 b4Var32 = this.J0;
            boolean Q32 = ziVar4.Q3();
            TLRPC.Message message42 = ziVar4.k;
            b4Var32.m(Q32, (TLRPC.TL_messageActionGramTransfer) message42.action, str5, message42.send_state, z13, !message42.premiumEffectWasPlayed);
            this.b2 = ziVar4.k.send_state;
        }
        ziVar4.K1 = false;
        this.E0 = ziVar4.C != null;
        org.telegram.messenger.z5.q(i20).v(this);
        this.W = 0;
        this.H = false;
        r0 r0Var = this.t1;
        if (r0Var != null && z13) {
            org.telegram.ui.Components.p5.release((t0) r0Var.i, (org.telegram.ui.Components.l5) r0Var.h);
            this.t1 = null;
            this.o1 = false;
        }
        if (z13 || ziVar4.H) {
            ziVar4.H = false;
            TLRPC.Message message5 = ziVar4.k;
            boolean z14 = (message5 == null || (tL_messageReactions = message5.reactions) == null || !tL_messageReactions.reactions_as_tags) ? false : true;
            boolean P5 = ziVar4.P5();
            dh.o0 o0Var = this.F0;
            if (P5) {
                o0Var.r(ziVar4, z14, e6Var3);
            } else {
                o0Var.r(null, false, e6Var3);
            }
        }
        if (ziVar4.D == 32) {
            if (this.P0 == null) {
                iw0 iw0Var = new iw0(i20, this, e6Var3);
                this.P0 = iw0Var;
                if (this.e2) {
                    iw0Var.d.R(iw0Var.b);
                }
            }
            iw0 iw0Var2 = this.P0;
            iw0Var2.getClass();
            TLRPC.TL_messageActionSuggestBirthday tL_messageActionSuggestBirthday = (TLRPC.TL_messageActionSuggestBirthday) ziVar4.k.action;
            iw0Var2.e = tL_messageActionSuggestBirthday.birthday;
            i3 = 0;
            ly0 ly0Var = new ly0(TextUtils.concat(ziVar4.v, ":"), 13.0f, null);
            ly0Var.m(6);
            Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
            ly0Var.a();
            ly0Var.p(org.telegram.messenger.g0.L(174.0f) - org.telegram.messenger.g0.L(32.0f));
            iw0Var2.f = ly0Var;
            int i21 = (tL_messageActionSuggestBirthday.birthday.flags & 1) != 0 ? 3 : 2;
            ly0[] ly0VarArr = new ly0[i21];
            iw0Var2.g = ly0VarArr;
            iw0Var2.h = new ly0[i21];
            ly0VarArr[0] = new ly0(bd.M0(2131751675, null), 11.0f, null);
            i10 = 2;
            iw0Var2.h[0] = new ly0("" + tL_messageActionSuggestBirthday.birthday.day, 11.0f, org.telegram.messenger.g0.o());
            iw0Var2.g[1] = new ly0(bd.M0(2131751674, null), 11.0f, null);
            ly0[] ly0VarArr2 = iw0Var2.h;
            StringBuilder sb2 = new StringBuilder("");
            int i22 = tL_messageActionSuggestBirthday.birthday.month - 1;
            sb2.append((i22 < 0 || i22 >= 12) ? k2.p1.i(i22, "") : bd.M0(new int[]{2131749094, 2131750830, 2131748691, 2131754173, 2131748670, 2131749072, 2131749074, 2131753895, 2131745575, 2131747838, 2131747843, 2131751606}[i22], null));
            ly0VarArr2[1] = new ly0(sb2.toString(), 11.0f, org.telegram.messenger.g0.o());
            if ((tL_messageActionSuggestBirthday.birthday.flags & 1) != 0) {
                iw0Var2.g[2] = new ly0(bd.M0(2131751670, null), 11.0f, null);
                iw0Var2.h[2] = new ly0("" + tL_messageActionSuggestBirthday.birthday.year, 11.0f, org.telegram.messenger.g0.o());
            }
            iw0Var2.i = !ziVar4.Q3();
            org.telegram.ui.ActionBar.e6 e6Var4 = iw0Var2.c;
            iw0Var2.l.setColor(org.telegram.ui.ActionBar.k6.r1(0.12f, e6Var4 != null ? e6Var4.a() : org.telegram.ui.ActionBar.k6.I.q() ? -1 : -16777216));
            iw0Var2.j = new ly0(bd.M0(2131744405, null), 14.0f, org.telegram.messenger.g0.o());
        } else {
            i3 = 0;
            i10 = 2;
            iw0 iw0Var3 = this.P0;
            if (iw0Var3 != null) {
                iw0Var3.d.R(null);
                this.P0 = null;
            }
        }
        if (this.I0 == null && (message = ziVar4.k) != null && (message.action instanceof TLRPC.TL_messageActionStarGiftUnique)) {
            ci.n6 n6Var = new ci.n6(i20, this, e6Var3);
            this.I0 = n6Var;
            if (this.e2) {
                n6Var.a();
            }
        }
        ci.n6 n6Var2 = this.I0;
        if (n6Var2 != null) {
            n6Var2.f(ziVar4, !z13);
        }
        ImageReceiver imageReceiver5 = this.J;
        imageReceiver5.X(i3);
        imageReceiver5.e();
        if (ziVar4.D != 22) {
            this.K = null;
        }
        if (ziVar4.H0 != -1) {
            pf.b(this, 0.02f, 1.2f);
            this.g2 = Math.max(org.telegram.messenger.g0.L(250.0f), gi.l3.a(ziVar4.v, (TextPaint) O("paintChatActionText")));
            mw0 X0 = kb.X0(ziVar4.v);
            if (X0 != null) {
                X0.h = this;
            }
        } else {
            setStateListAnimator(null);
            this.g2 = 0;
        }
        boolean A4 = ziVar4.A4();
        org.telegram.ui.Components.u8 u8Var = this.M;
        if (A4) {
            TLRPC.User a22 = hp.s1(i20).a2(Long.valueOf(ziVar4.k.media.user_id));
            u8Var.r(a22);
            TL_stories.StoryItem storyItem = ziVar4.k.media.storyItem;
            if (storyItem == null || !storyItem.noforwards) {
                ei.s7.x(imageReceiver5, storyItem);
            } else {
                imageReceiver5.j0(a22, u8Var, null, true, 0, true);
            }
            imageReceiver5.J0((int) (this.i1 / 2.0f));
        } else {
            int i23 = ziVar4.D;
            RadialProgress2 radialProgress22 = this.K1;
            if (i23 != 22) {
                if (i23 == 21) {
                    imageReceiver5.J0((int) (this.i1 / 2.0f));
                    imageReceiver5.v0 = true;
                    imageReceiver5.h1 = null;
                    TLRPC.TL_messageActionSuggestProfilePhoto tL_messageActionSuggestProfilePhoto = (TLRPC.TL_messageActionSuggestProfilePhoto) ziVar4.k.action;
                    TLRPC.VideoSize x10 = org.telegram.messenger.w7.x(1000, tL_messageActionSuggestProfilePhoto.photo.video_sizes);
                    ArrayList<TLRPC.VideoSize> arrayList3 = tL_messageActionSuggestProfilePhoto.photo.video_sizes;
                    if (arrayList3 == null || arrayList3.isEmpty()) {
                        imageReceiver3 = imageReceiver5;
                        acVar = null;
                    } else {
                        acVar = ac.j(x10, tL_messageActionSuggestProfilePhoto.photo);
                        imageReceiver3 = imageReceiver5;
                    }
                    TLRPC.Photo photo = ziVar4.k.action.photo;
                    if (ziVar4.G1 == null) {
                        int size = ziVar4.n0.size();
                        for (int i24 = 0; i24 < size; i24++) {
                            photoSize2 = (TLRPC.PhotoSize) ziVar4.n0.get(i24);
                            if (photoSize2 instanceof TLRPC.TL_photoStrippedSize) {
                                break;
                            }
                        }
                    }
                    photoSize2 = null;
                    TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(ziVar4.n0, 1000, false, null, false);
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
                        imageReceiver3.u0(acVar, "g", ac.i(w10, photo), "150_150", ac.f(photoSize2, ziVar4.l0), "50_50_b", ziVar4.G1, 0L, null, ziVar, 0);
                        imageReceiver4 = imageReceiver3;
                        ziVar4 = ziVar;
                    } else {
                        e6Var = e6Var3;
                        i11 = i20;
                        z11 = false;
                        f10 = 1.0f;
                        radialProgress2 = radialProgress22;
                        imageReceiver3.r0(ac.i(w10, photo), "150_150", ac.f(photoSize2, ziVar4.l0), "50_50_b", ziVar4.G1, 0L, null, ziVar4, 0);
                        imageReceiver4 = imageReceiver3;
                    }
                    imageReceiver4.v0 = z11;
                    f30 f30Var = (f30) hp.s1(i11).B7.get(ziVar4.k.local_id);
                    if (f30Var == null || f30Var.X == f10) {
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
                        TLRPC.MessageAction messageAction2 = ziVar4.k.action;
                        int i26 = 13;
                        if (messageAction2 instanceof TLRPC.TL_messageActionNoForwardsRequest) {
                            TLRPC.TL_messageActionNoForwardsRequest tL_messageActionNoForwardsRequest = (TLRPC.TL_messageActionNoForwardsRequest) messageAction2;
                            this.a2 = tL_messageActionNoForwardsRequest.expired || ((long) ziVar4.k.date) + hp.s1(i11).x7.D.g2(TimeUnit.SECONDS) < ((long) ConnectionsManager.getInstance(i11).getCurrentTime());
                            if (ziVar4.O3() || tL_messageActionNoForwardsRequest.expired || this.a2) {
                                i16 = 8;
                            } else {
                                ArrayList arrayList4 = new ArrayList();
                                org.telegram.messenger.o2 o2Var = new org.telegram.messenger.o2(7, 2131751415, R.drawable.filled_bot_decline_24);
                                i16 = 8;
                                org.telegram.messenger.o2 o2Var2 = new org.telegram.messenger.o2(8, 2131751416, R.drawable.filled_bot_approve_24);
                                org.telegram.messenger.m2[] m2VarArr = new org.telegram.messenger.m2[i10];
                                m2VarArr[0] = o2Var;
                                m2VarArr[1] = o2Var2;
                                arrayList4.add(m2VarArr);
                                this.Z1 = new e5.u((org.telegram.messenger.m2[][]) arrayList4.toArray(new org.telegram.messenger.m2[arrayList4.size()][]), i25, i26);
                            }
                            i12 = i16;
                            document = null;
                            ziVar2 = null;
                            ziVar3 = null;
                            e6Var2 = e6Var;
                        } else {
                            i12 = 8;
                            if (messageAction2 instanceof TLRPC.TL_messageActionStarGiftPurchaseOffer) {
                                TLRPC.TL_messageActionStarGiftPurchaseOffer tL_messageActionStarGiftPurchaseOffer = (TLRPC.TL_messageActionStarGiftPurchaseOffer) messageAction2;
                                TL_stars.StarGift starGift = tL_messageActionStarGiftPurchaseOffer.gift;
                                if (starGift != null) {
                                    document5 = dg.d.e(starGift);
                                    if (this.T0 == null) {
                                        e6Var2 = e6Var;
                                        this.T0 = new ai.m2(this, e6Var2, false);
                                    } else {
                                        e6Var2 = e6Var;
                                    }
                                    this.T0.d((TL_stars.starGiftAttributeBackdrop) ci.e9.l(starGift.attributes, TL_stars.starGiftAttributeBackdrop.class));
                                    this.T0.e((TL_stars.starGiftAttributePattern) ci.e9.l(starGift.attributes, TL_stars.starGiftAttributePattern.class));
                                } else {
                                    e6Var2 = e6Var;
                                    document5 = null;
                                }
                                this.a2 = tL_messageActionStarGiftPurchaseOffer.expires_at < ConnectionsManager.getInstance(i11).getCurrentTime();
                                if (!ziVar4.O3() && !tL_messageActionStarGiftPurchaseOffer.accepted && !tL_messageActionStarGiftPurchaseOffer.declined && !this.a2) {
                                    ArrayList arrayList5 = new ArrayList();
                                    arrayList5.add(new org.telegram.messenger.m2[]{new org.telegram.messenger.o2(5, 2131749739, R.drawable.filled_bot_decline_24), new org.telegram.messenger.o2(6, 2131749749, R.drawable.filled_bot_approve_24)});
                                    this.Z1 = new e5.u((org.telegram.messenger.m2[][]) arrayList5.toArray(new org.telegram.messenger.m2[arrayList5.size()][]), i25, i26);
                                }
                                document = document5;
                            } else {
                                e6Var2 = e6Var;
                                if (!(messageAction2 instanceof TLRPC.TL_messageActionSetChatTheme)) {
                                    if (messageAction2 instanceof TLRPC.TL_messageActionStarGift) {
                                        TL_stars.StarGift starGift2 = ((TLRPC.TL_messageActionStarGift) messageAction2).gift;
                                        if (starGift2 != null) {
                                            document = starGift2.sticker;
                                            ziVar3 = ziVar4;
                                            str6 = null;
                                            ziVar2 = null;
                                        }
                                        document = null;
                                        ziVar3 = ziVar4;
                                        str6 = null;
                                        ziVar2 = null;
                                    } else {
                                        if (messageAction2 instanceof TLRPC.TL_messageActionStarGiftUnique) {
                                            TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique = (TLRPC.TL_messageActionStarGiftUnique) messageAction2;
                                            if (tL_messageActionStarGiftUnique.refunded) {
                                                TL_stars.StarGift starGift3 = tL_messageActionStarGiftUnique.gift;
                                                if (starGift3 != null) {
                                                    document = starGift3.getDocument();
                                                    ziVar3 = ziVar4;
                                                    str6 = null;
                                                    ziVar2 = null;
                                                }
                                                document = null;
                                                ziVar3 = ziVar4;
                                                str6 = null;
                                                ziVar2 = null;
                                            }
                                        }
                                        if (messageAction2 instanceof TLRPC.TL_messageActionGiftTon) {
                                            str = h10.i(i11).d0;
                                            if (str == null) {
                                                li.b0(i11).C();
                                                return;
                                            }
                                        } else {
                                            str = h10.i(i11).c0;
                                            if (str == null) {
                                                li.b0(i11).z();
                                                return;
                                            }
                                        }
                                        TLRPC.TL_messages_stickerSet p02 = li.b0(i11).p0(str);
                                        ?? r5 = p02;
                                        if (p02 == null) {
                                            r5 = li.b0(i11).n0(str);
                                        }
                                        if (r5 != 0) {
                                            TLRPC.MessageAction messageAction3 = ziVar4.k.action;
                                            int i27 = messageAction3.months;
                                            if (ziVar4.D == 30) {
                                                String str7 = "3⃣";
                                                if (messageAction3 instanceof TLRPC.TL_messageActionGiftTon) {
                                                    long j10 = messageAction3.cryptoAmount;
                                                    if (j10 > 10000000000L) {
                                                        if (j10 <= 50000000000L) {
                                                            str7 = "1⃣";
                                                        }
                                                        i13 = 0;
                                                        while (true) {
                                                            if (i13 < r5.packs.size()) {
                                                                break;
                                                            }
                                                            TLRPC.TL_stickerPack tL_stickerPack = r5.packs.get(i13);
                                                            if (TextUtils.equals(tL_stickerPack.emoticon, str7) && !tL_stickerPack.documents.isEmpty()) {
                                                                long longValue = tL_stickerPack.documents.get(0).longValue();
                                                                for (int i28 = 0; i28 < r5.documents.size(); i28++) {
                                                                    document3 = r5.documents.get(i28);
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
                                                        if (i13 < r5.packs.size()) {
                                                        }
                                                        i13++;
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
                                                        i13 = 0;
                                                        while (true) {
                                                            if (i13 < r5.packs.size()) {
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
                                                        if (i13 < r5.packs.size()) {
                                                        }
                                                        i13++;
                                                    }
                                                    document3 = null;
                                                    str2 = str;
                                                    document2 = document3;
                                                }
                                            } else {
                                                String str8 = (String) t2.get(Integer.valueOf(i27));
                                                ArrayList<TLRPC.TL_stickerPack> arrayList6 = r5.packs;
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
                                                            ArrayList<TLRPC.Document> arrayList8 = r5.documents;
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
                                            if (document2 == null && !r5.documents.isEmpty()) {
                                                document2 = r5.documents.get(0);
                                            }
                                            ziVar3 = r5;
                                            document = document2;
                                            str6 = str2;
                                            ziVar2 = ziVar3;
                                        } else {
                                            ziVar2 = r5;
                                            str6 = str;
                                            document = null;
                                            ziVar3 = null;
                                        }
                                    }
                                    if (!this.l0 && this.f0 && this.j0 && (this.g0 || this.h0 || this.i0)) {
                                        this.m0 = org.telegram.messenger.g0.L(33.0f);
                                        if (this.o0 == null) {
                                            f01 f01Var2 = new f01(i11, this, e6Var2, true);
                                            this.o0 = f01Var2;
                                            f01Var2.s = new m0(this, 3);
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
                                        f01Var = this.o0;
                                        if (f01Var != null) {
                                            f01Var.b();
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
                                    this.U1.setVisibility((U(ziVar) || R()) ? i12 : i17);
                                    rg.c.b(ziVar4);
                                    requestLayout();
                                }
                                TL_stars.StarGift starGift4 = ((TLRPC.TL_chatThemeUniqueGift) ((TLRPC.TL_messageActionSetChatTheme) messageAction2).theme).gift;
                                if (starGift4 != null) {
                                    document4 = dg.d.e(starGift4);
                                    if (this.T0 == null) {
                                        this.T0 = new ai.m2(this, e6Var2, false);
                                    }
                                    this.T0.d((TL_stars.starGiftAttributeBackdrop) ci.e9.l(starGift4.attributes, TL_stars.starGiftAttributeBackdrop.class));
                                    this.T0.e((TL_stars.starGiftAttributePattern) ci.e9.l(starGift4.attributes, TL_stars.starGiftAttributePattern.class));
                                } else {
                                    document4 = null;
                                }
                                document = document4;
                            }
                            str6 = null;
                            ziVar2 = null;
                            ziVar3 = null;
                        }
                        e5.u uVar = this.Z1;
                        if (uVar != null) {
                            int length = ((org.telegram.messenger.m2[][]) uVar.c).length;
                            int i34 = 0;
                            while (i34 < length) {
                                int length2 = ((org.telegram.messenger.m2[][]) this.Z1.c)[i34].length;
                                int i35 = 0;
                                while (i35 < length2) {
                                    org.telegram.messenger.m2 m2Var = ((org.telegram.messenger.m2[][]) this.Z1.c)[i34][i35];
                                    c0 c0Var = new c0(new m0(this, 2));
                                    c0Var.j = (org.telegram.messenger.o2) m2Var;
                                    int c2 = m2Var.c();
                                    if (c2 != 0) {
                                        Drawable drawable = getResources().getDrawable(c2);
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
                                    int b10 = x7.u.b(i36, 1, i35 == 0);
                                    c0Var.g = b10;
                                    c0Var.g = x7.u.b(b10, 2, i35 == 1);
                                    c0Var.h = new ly0(m2Var.d(), (TextPaint) O("paintChatBotButton"));
                                    arrayList2.add(c0Var);
                                    i35++;
                                    length = i14;
                                    i34 = i15;
                                }
                                i34++;
                                length = length;
                            }
                        }
                        this.M1 = ziVar4.l1;
                        this.I1 = document;
                        if (document != null) {
                            imageReceiver5.v0 = true;
                            int i37 = ziVar4.D;
                            if (i37 != 31 && i37 != 37 && i37 != 33) {
                                imageReceiver5.d0(this.O1);
                            }
                            this.J1 = null;
                            int i38 = 0;
                            while (true) {
                                if (i38 >= document.video_thumbs.size()) {
                                    break;
                                }
                                if ("f".equals(document.video_thumbs.get(i38).type)) {
                                    this.J1 = document.video_thumbs.get(i38);
                                    break;
                                }
                                i38++;
                            }
                            if (z13 || ziVar4.D != 18) {
                                jz e10 = org.telegram.messenger.t5.e(document, org.telegram.ui.ActionBar.k6.a7, 0.3f);
                                imageReceiver5.W(0);
                                ac b11 = ac.b(document);
                                Locale locale = Locale.US;
                                imageReceiver5.q0(b11, k2.p1.i(ziVar4.k1, "160_160_nr_messageId="), e10, "tgs", ziVar3, 1);
                            }
                        } else if (str6 != null) {
                            li.b0(i11).c1(str6, false, ziVar2 == null);
                        }
                        if (!this.l0) {
                        }
                        f01Var = this.o0;
                        if (f01Var != null) {
                        }
                        i17 = 0;
                        this.m0 = 0;
                        paddingTop = getPaddingTop();
                        i18 = this.m0;
                        if (paddingTop != i18) {
                        }
                        this.U1.setVisibility((U(ziVar) || R()) ? i12 : i17);
                        rg.c.b(ziVar4);
                        requestLayout();
                    }
                    if (i23 == 37) {
                        TLRPC.Chat M0 = hp.s1(i11).M0(Long.valueOf(((TLRPC.TL_messageActionChangeCommunity) ziVar4.k.action).community_id));
                        imageReceiver5.v0 = true;
                        imageReceiver5.h1 = null;
                        imageReceiver5.J0(org.telegram.messenger.g0.L(14.0f));
                        imageReceiver5.X(1);
                        u8Var.q(M0);
                        imageReceiver5.i0(M0, new ei.l0(getContext(), org.telegram.messenger.g0.L(14.0f)), M0);
                    } else if (i23 == 11) {
                        imageReceiver5.v0 = true;
                        imageReceiver5.h1 = null;
                        imageReceiver5.J0(org.telegram.messenger.g0.u / 2);
                        imageReceiver5.X(1);
                        u8Var.k(zi.B0(ziVar4.k), null, null, null);
                        if (ziVar4.k.action instanceof TLRPC.TL_messageActionUserUpdatedPhoto) {
                            imageReceiver = imageReceiver5;
                            imageReceiver.q0(null, null, u8Var, null, ziVar4, 0);
                        } else {
                            imageReceiver = imageReceiver5;
                            if (ziVar4.G1 == null) {
                                int size5 = ziVar4.n0.size();
                                for (int i39 = 0; i39 < size5; i39++) {
                                    photoSize = (TLRPC.PhotoSize) ziVar4.n0.get(i39);
                                    if (photoSize instanceof TLRPC.TL_photoStrippedSize) {
                                        break;
                                    }
                                }
                            }
                            photoSize = null;
                            TLRPC.PhotoSize w11 = org.telegram.messenger.w7.w(ziVar4.n0, 640, false, null, false);
                            if (w11 != null) {
                                TLRPC.Photo photo2 = ziVar4.k.action.photo;
                                if (!photo2.video_sizes.isEmpty()) {
                                    int i40 = az.a;
                                    if (lc.e(2048)) {
                                        videoSize = org.telegram.messenger.w7.x(1000, photo2.video_sizes);
                                        if (!ziVar4.x0 && !org.telegram.messenger.z5.q(i11).c(4, videoSize.size)) {
                                            this.y0 = ac.j(videoSize, photo2);
                                            org.telegram.messenger.z5.q(i11).a(org.telegram.messenger.w7.r(null, videoSize), ziVar4, this);
                                        }
                                        if (videoSize == null) {
                                            imageReceiver.r0(ac.j(videoSize, photo2), "g", ac.f(photoSize, ziVar4.l0), "50_50_b", ziVar4.G1, 0L, null, ziVar4, 1);
                                        } else {
                                            imageReceiver.r0(ac.f(w11, ziVar4.l0), "150_150", ac.f(photoSize, ziVar4.l0), "50_50_b", ziVar4.G1, 0L, null, ziVar4, 1);
                                        }
                                    }
                                }
                                videoSize = null;
                                if (videoSize == null) {
                                }
                            } else {
                                imageReceiver2 = imageReceiver;
                                imageReceiver2.w0(u8Var);
                                imageReceiver2.O0(!PhotoViewer.Q1(ziVar4), false);
                            }
                        }
                        imageReceiver2 = imageReceiver;
                        imageReceiver2.O0(!PhotoViewer.Q1(ziVar4), false);
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
                f01Var = this.o0;
                if (f01Var != null) {
                }
                i17 = 0;
                this.m0 = 0;
                paddingTop = getPaddingTop();
                i18 = this.m0;
                if (paddingTop != i18) {
                }
                this.U1.setVisibility((U(ziVar) || R()) ? i12 : i17);
                rg.c.b(ziVar4);
                requestLayout();
            }
            if (ziVar4.G1 == null) {
                int size6 = ziVar4.n0.size();
                for (int i41 = 0; i41 < size6 && !(((TLRPC.PhotoSize) ziVar4.n0.get(i41)) instanceof TLRPC.TL_photoStrippedSize); i41++) {
                }
            }
            TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent = ziVar4.J1;
            if (tL_channelAdminLogEvent != null) {
                TLRPC.ChannelAdminLogEventAction channelAdminLogEventAction = tL_channelAdminLogEvent.action;
                if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionChangeWallpaper) {
                    wallPaper = ((TLRPC.TL_channelAdminLogEventActionChangeWallpaper) channelAdminLogEventAction).new_value;
                    if (TextUtils.isEmpty(org.telegram.messenger.d4.j(wallPaper))) {
                        boolean a10 = e6Var3 != null ? e6Var3.a() : org.telegram.ui.ActionBar.k6.I.q();
                        imageReceiver5.f();
                        String j12 = org.telegram.messenger.d4.j(wallPaper);
                        int i42 = gi.y5.C0;
                        org.telegram.ui.ActionBar.p3 i43 = org.telegram.messenger.d4.f(i20).i(jg.b.d(j12));
                        Drawable s02 = i43 == null ? org.telegram.ui.ActionBar.k6.s0() : gi.y5.g(i20, i43, a10);
                        this.K = s02;
                        if (s02 != null) {
                            s02.setCallback(this);
                        }
                    } else if (wallPaper != null && (str4 = wallPaper.uploadingImage) != null) {
                        imageReceiver5.r0(ac.g(str4), "150_150_wallpaper" + wallPaper.id + zm.e(wallPaper.settings), null, null, zm.b(wallPaper), 0L, null, wallPaper, 1);
                        this.K = null;
                    } else if (wallPaper != null) {
                        TLObject tLObject = ziVar4.l0;
                        imageReceiver5.r0(ac.b(tLObject instanceof TLRPC.Document ? (TLRPC.Document) tLObject : wallPaper.document), "150_150_wallpaper" + wallPaper.id + zm.e(wallPaper.settings), null, null, zm.b(wallPaper), 0L, null, wallPaper, 1);
                        imageReceiver5 = imageReceiver5;
                        this.K = null;
                    } else {
                        imageReceiver5 = imageReceiver5;
                        this.K = null;
                    }
                    imageReceiver5.J0((int) (this.i1 / 2.0f));
                    if (P(ziVar) != 1.0f) {
                        boolean z17 = !z13;
                        radialProgress22.p(z17, 1.0f);
                        radialProgress22.setIcon(4, z17, z17);
                    } else {
                        boolean z18 = !z13;
                        radialProgress22.setIcon(3, z18, z18);
                    }
                }
            }
            TLRPC.Message message6 = ziVar4.k;
            wallPaper = (message6 == null || (messageAction = message6.action) == null) ? null : messageAction.wallpaper;
            if (TextUtils.isEmpty(org.telegram.messenger.d4.j(wallPaper))) {
            }
            imageReceiver5.J0((int) (this.i1 / 2.0f));
            if (P(ziVar) != 1.0f) {
            }
        }
        e6Var2 = e6Var3;
        i11 = i20;
        i12 = 8;
        if (!this.l0) {
        }
        f01Var = this.o0;
        if (f01Var != null) {
        }
        i17 = 0;
        this.m0 = 0;
        paddingTop = getPaddingTop();
        i18 = this.m0;
        if (paddingTop != i18) {
        }
        this.U1.setVisibility((U(ziVar) || R()) ? i12 : i17);
        rg.c.b(ziVar4);
        requestLayout();
    }

    public final void g0(int i3, int i10) {
        this.U0 = i3;
        this.V0 = i10;
    }

    public /* bridge */ /* synthetic */ ImageReceiver getAvatarImage() {
        return null;
    }

    @Override // org.telegram.ui.Cells.z
    public int getBoundsLeft() {
        if (R()) {
            int width = ((int) (getWidth() - (this.I0.T.f + org.telegram.messenger.g0.L(8.0f)))) / 2;
            return this.I0.p ? width : Math.min(this.b1, width);
        }
        if (U(this.Q0)) {
            return k2.p1.e(getWidth(), this.j1, 2, this.k0 / 2);
        }
        int i3 = this.b1;
        ImageReceiver imageReceiver = this.J;
        if (imageReceiver != null && imageReceiver.R0) {
            i3 = Math.min((int) imageReceiver.L0, i3);
        }
        return (this.k0 / 2) + i3;
    }

    @Override // org.telegram.ui.Cells.z
    public int getBoundsRight() {
        int i3;
        int i10;
        if (R()) {
            int L = ((int) ((this.I0.T.f + org.telegram.messenger.g0.L(8.0f)) + getWidth())) / 2;
            return this.I0.p ? L : Math.max(this.c1, L);
        }
        if (U(this.Q0)) {
            i3 = this.k0 / 2;
            i10 = (getWidth() + this.j1) / 2;
        } else {
            i3 = this.c1;
            ImageReceiver imageReceiver = this.J;
            if (imageReceiver != null && imageReceiver.R0) {
                i3 = Math.max((int) imageReceiver.y(), i3);
            }
            i10 = this.k0 / 2;
        }
        return i10 + i3;
    }

    @Override // org.telegram.ui.Cells.p4
    public /* bridge */ /* synthetic */ float getCheckBoxTranslation() {
        return 0.0f;
    }

    public /* bridge */ /* synthetic */ ri getCurrentPosition() {
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
    public zi getMessageObject() {
        return this.Q0;
    }

    @Override // org.telegram.messenger.x5
    public int getObserverTag() {
        return this.x;
    }

    public ImageReceiver getPhotoImage() {
        return this.J;
    }

    public dh.o0 getReactionsLayout() {
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

    public final void h0(float f10, int i3) {
        this.x0 = true;
        this.w0 = i3;
        this.u0 = f10;
        this.v0 = 0.0f;
    }

    public final void i0(boolean z10) {
        if (getMeasuredWidth() != 0) {
            B(getMeasuredWidth(), this.S0);
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
        this.s0 = org.telegram.ui.Components.p5.update(0, this, (!this.s || (q0Var = this.g1) == null || q0Var.d()) ? false : true, this.s0, this.N);
        r0 r0Var = this.t1;
        if (r0Var != null) {
            r0Var.h = org.telegram.ui.Components.p5.update(0, (View) r0Var.i, false, (org.telegram.ui.Components.l5) r0Var.h, (StaticLayout) r0Var.f);
        }
        int i3 = this.I;
        hs.f(i3).c(this, hs.W2);
        hs.f(i3).c(this, hs.X2);
        hs.f(i3).c(this, hs.F3);
        hs.f(i3).c(this, hs.y0);
        hs.f(i3).c(this, hs.a4);
        hs.e().c(this, hs.i4);
        zi ziVar = this.Q0;
        if (ziVar != null && ziVar.D == 21) {
            f0(ziVar, true);
        }
        ci.n6 n6Var = this.I0;
        if (n6Var != null) {
            n6Var.a();
        }
        dh.o0 o0Var = this.F0;
        ArrayList arrayList = o0Var.s;
        o0Var.D = true;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            ((dh.l0) arrayList.get(i10)).a();
        }
        f01 f01Var = this.o0;
        if (f01Var != null) {
            f01Var.a();
        }
        iw0 iw0Var = this.P0;
        if (iw0Var != null) {
            iw0Var.d.R(iw0Var.b);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.e2 = false;
        int i3 = this.I;
        org.telegram.messenger.z5.q(i3).v(this);
        this.J.R();
        setStarsPaused(true);
        this.D0 = false;
        org.telegram.ui.Components.p5.release(this, this.s0);
        r0 r0Var = this.t1;
        if (r0Var != null) {
            org.telegram.ui.Components.p5.release((t0) r0Var.i, (org.telegram.ui.Components.l5) r0Var.h);
        }
        hs.f(i3).n(this, hs.W2);
        hs.f(i3).n(this, hs.X2);
        hs.f(i3).n(this, hs.F3);
        hs.f(i3).n(this, hs.y0);
        hs.f(i3).n(this, hs.a4);
        hs.e().n(this, hs.i4);
        this.e0.g();
        this.s2.a = false;
        ci.n6 n6Var = this.I0;
        if (n6Var != null) {
            n6Var.S = false;
            n6Var.d.R();
            n6Var.e.b();
            ai.j1 j1Var = n6Var.y;
            j1Var.d.R();
            org.telegram.ui.Components.p5.release((View) null, j1Var.q);
            j1Var.q = null;
        }
        this.F0.p();
        f01 f01Var = this.o0;
        if (f01Var != null) {
            f01Var.b();
        }
        iw0 iw0Var = this.P0;
        if (iw0Var != null) {
            iw0Var.d.R(null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:237:0x0e05  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0e52  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0e9c  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0f18  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0f4a  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0f85  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0feb  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0fb7  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x0fc1  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x0fb9  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x0f8a  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x0f60  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x0eed  */
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
        char c2;
        int i3;
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
        int i13;
        float f14;
        ly0 ly0Var;
        float f15;
        float i14;
        Paint O;
        boolean a10;
        ColorMatrix colorMatrix;
        int i15;
        t0 t0Var2;
        int i16;
        ly0 ly0Var2;
        q0 q0Var;
        int size;
        int i17;
        TextPaint textPaint2;
        Canvas canvas3 = canvas;
        canvas3.save();
        canvas3.translate(this.k0 / 2.0f, getPaddingTop());
        zi ziVar = this.Q0;
        float d = this.r1.d(!this.p1);
        int i18 = this.i1;
        boolean R = R();
        ei.o7 o7Var = this.e0;
        TextPaint textPaint3 = this.G1;
        ImageReceiver imageReceiver = this.J;
        if (!R && this.P0 == null && U(ziVar)) {
            this.i1 = this.j1 - org.telegram.messenger.g0.L(106.0f);
            if (W()) {
                i18 = N(ziVar);
                float f16 = (this.W - i18) / 2.0f;
                float L2 = org.telegram.messenger.g0.L(16.0f) + org.telegram.messenger.g0.L(4.0f) + this.T + this.P;
                if (ziVar.A4()) {
                    o7Var.d = ziVar.k.media.storyItem;
                }
                float f17 = i18;
                o7Var.F.set(f16, L2, f16 + f17, f17 + L2);
                int i19 = ziVar.D;
                if (i19 == 31 || i19 == 33 || i19 == 34 || i19 == 35) {
                    f16 += org.telegram.messenger.g0.L(10.0f);
                    L2 += org.telegram.messenger.g0.L(10.0f);
                    i18 -= org.telegram.messenger.g0.L(20.0f);
                }
                if (ziVar.D == 37) {
                    f16 += org.telegram.messenger.g0.L(2.0f);
                }
                imageReceiver.y0(f16, L2, Math.max(0, i18), Math.max(0, i18));
                int i20 = ziVar.D;
                if (i20 == 31 || i20 == 33 || i20 == 34 || i20 == 35) {
                    i18 = org.telegram.messenger.g0.L(20.0f) + i18;
                }
            } else {
                int i21 = ziVar.D;
                if (i21 == 11) {
                    int i22 = this.W;
                    float f18 = this.i1;
                    imageReceiver.y0((i22 - r3) / 2.0f, (this.j1 * 0.075f) + this.T + this.P, f18, f18);
                } else {
                    if (i21 == 25) {
                        i18 = (int) (this.i1 * (org.telegram.messenger.g0.Q1() ? 1.0f : 1.2f));
                        float f19 = i18;
                        imageReceiver.y0((this.W - i18) / 2.0f, ((this.j1 * 0.075f) + (this.T + this.P)) - org.telegram.messenger.g0.L(22.0f), f19, f19);
                    } else if (ziVar.t4()) {
                        float f20 = i18;
                        imageReceiver.y0((this.W - i18) / 2.0f, (this.j1 * 0.075f) + this.T + this.P + org.telegram.messenger.g0.L(2.0f), f20, f20);
                    } else if (ziVar.D == 30) {
                        i18 = (int) (this.i1 * 1.1f);
                        TLRPC.Message message = ziVar.k;
                        if (message == null || (message.action instanceof TLRPC.TL_messageActionStarGift)) {
                            float f21 = i18;
                            imageReceiver.y0((this.W - i18) / 2.0f, ((this.j1 * 0.075f) + (this.T + this.P)) - org.telegram.messenger.g0.L(12.0f), f21, f21);
                        } else {
                            float f22 = i18;
                            imageReceiver.y0((this.W - i18) / 2.0f, ((this.j1 * 0.075f) + (this.T + this.P)) - org.telegram.messenger.g0.L(22.0f), f22, f22);
                        }
                    } else {
                        i18 = (int) (this.i1 * 1.0f);
                        float f23 = i18;
                        imageReceiver.y0((this.W - i18) / 2.0f, ((this.j1 * 0.075f) + (this.T + this.P)) - org.telegram.messenger.g0.L(4.0f), f23, f23);
                    }
                    textPaint2 = (TextPaint) O("paintChatActionText");
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
            textPaint2 = (TextPaint) O("paintChatActionText");
            this.t0 = textPaint2;
            if (textPaint2 != null) {
            }
        }
        int i23 = i18;
        G(canvas3, false);
        if (S()) {
            canvas3.save();
            int width = getWidth();
            this.J0.getClass();
            float h = (width - org.telegram.ui.Wallet.b4.h()) / 2.0f;
            this.L0 = h;
            float walletActionTop = getWalletActionTop();
            this.M0 = walletActionTop;
            canvas3.translate(h, walletActionTop);
            this.J0.o((this.k0 / 2.0f) + this.L0, this.M0 + getPaddingTop());
            this.J0.d(canvas3);
            canvas3.restore();
        }
        boolean R2 = R();
        RadialProgress2 radialProgress22 = this.K1;
        if (R2) {
            canvas3.save();
            float width2 = (getWidth() - this.I0.d()) / 2.0f;
            this.G0 = width2;
            float L3 = this.I0.p ? org.telegram.messenger.g0.L(4.0f) : org.telegram.messenger.g0.L(16.0f) + this.T + this.P;
            this.H0 = L3;
            canvas3.translate(width2, L3);
            this.I0.b(canvas3);
            q0 q0Var2 = this.g1;
            if (q0Var2 == null || q0Var2.d()) {
                this.I0.c(canvas3);
            }
            canvas3.restore();
        } else if (this.P0 != null) {
            canvas3.save();
            this.P0.a(canvas3);
            canvas3.restore();
        } else if (U(ziVar) || (ziVar != null && ziVar.D == 11)) {
            ai.m2 m2Var = this.T0;
            if (m2Var != null && ((i10 = ziVar.D) == 31 || i10 == 37 || i10 == 33)) {
                m2Var.setBounds((int) (imageReceiver.x() - org.telegram.messenger.g0.L(13.33f)), (int) (imageReceiver.z() - org.telegram.messenger.g0.L(14.0f)), (int) (imageReceiver.w() + imageReceiver.x() + org.telegram.messenger.g0.L(13.33f)), (int) (imageReceiver.v() + imageReceiver.z() + org.telegram.messenger.g0.L(14.0f)));
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
            } else if (ziVar.A4()) {
                TLRPC.MessageMedia messageMedia = ziVar.k.media;
                long j10 = messageMedia.user_id;
                o7Var.c = messageMedia.id;
                ei.s7.h(j10, canvas3, imageReceiver, o7Var);
            } else {
                imageReceiver.g(canvas3);
            }
            c2 = '%';
            if (ziVar.D == 37) {
                cg.r.a(canvas3, org.telegram.ui.ActionBar.k6.S0, imageReceiver.x() + org.telegram.messenger.g0.L(26.0f), imageReceiver.z() + org.telegram.messenger.g0.L(26.0f), org.telegram.messenger.g0.L(52.0f));
            }
            radialProgress22.a.set(imageReceiver.x(), imageReceiver.z(), imageReceiver.w() + imageReceiver.x(), imageReceiver.v() + imageReceiver.z());
            int i24 = ziVar.D;
            if (i24 == 21) {
                f30 f30Var = (f30) hp.s1(this.I).B7.get(ziVar.k.local_id);
                if (f30Var != null) {
                    radialProgress22.p(true, f30Var.X);
                    radialProgress22.setCircleRadius(((int) (imageReceiver.w() * 0.5f)) + 1);
                    radialProgress22.G = org.telegram.messenger.g0.L(24.0f);
                    radialProgress22.g(org.telegram.ui.ActionBar.k6.Ze, org.telegram.ui.ActionBar.k6.af, org.telegram.ui.ActionBar.k6.bf, org.telegram.ui.ActionBar.k6.cf);
                    if (f30Var.X == 1.0f) {
                        radialProgress22.setIcon(4, true, true);
                    } else {
                        radialProgress22.setIcon(3, true, true);
                    }
                }
                radialProgress22.draw(canvas3);
                i3 = 22;
            } else {
                i3 = 22;
                if (i24 == 22) {
                    float P = P(ziVar);
                    radialProgress22.p(true, P);
                    radialProgress22.setCircleRadius(org.telegram.messenger.g0.L(26.0f));
                    radialProgress22.G = org.telegram.messenger.g0.L(24.0f);
                    radialProgress22.g(org.telegram.ui.ActionBar.k6.Ze, org.telegram.ui.ActionBar.k6.af, org.telegram.ui.ActionBar.k6.bf, org.telegram.ui.ActionBar.k6.cf);
                    if (P == 1.0f) {
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
                i11 = i3;
                radialProgress2 = radialProgress22;
            } else {
                canvas3.save();
                canvas3.translate(this.U, this.T);
                if (this.N.getPaint() != this.t0) {
                    v();
                }
                canvas3.save();
                yh.f.d(canvas3, arrayList);
                yh.f.f(canvas3, this.N);
                q0 q0Var3 = this.g1;
                if (q0Var3 == null || q0Var3.d()) {
                    int i25 = i3;
                    StaticLayout staticLayout = this.N;
                    radialProgress2 = radialProgress22;
                    i11 = i25;
                    org.telegram.ui.Components.p5.drawAnimatedEmojis(canvas, staticLayout, this.s0, 0.0f, arrayList, 0.0f, 0.0f, 0.0f, 1.0f, staticLayout == null ? null : L(staticLayout.getPaint().getColor()));
                    canvas3 = canvas;
                } else {
                    i11 = i3;
                    radialProgress2 = radialProgress22;
                }
                canvas3.restore();
                int size2 = arrayList.size();
                int i26 = 0;
                while (i26 < size2) {
                    Object obj = arrayList.get(i26);
                    i26++;
                    yh.f fVar = (yh.f) obj;
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
                yh.f.d(canvas3, arrayList);
                yh.f.f(canvas3, this.Q);
                q0Var = this.g1;
                if (q0Var != null || q0Var.d()) {
                    StaticLayout staticLayout2 = this.Q;
                    org.telegram.ui.Components.l5 l5Var = this.s0;
                    StaticLayout staticLayout3 = this.N;
                    org.telegram.ui.Components.p5.drawAnimatedEmojis(canvas, staticLayout2, l5Var, 0.0f, arrayList, 0.0f, 0.0f, 0.0f, 1.0f, staticLayout3 != null ? null : L(staticLayout3.getPaint().getColor()));
                    canvas3 = canvas;
                }
                canvas3.restore();
                size = arrayList.size();
                i17 = 0;
                while (i17 < size) {
                    Object obj2 = arrayList.get(i17);
                    i17++;
                    yh.f fVar2 = (yh.f) obj2;
                    fVar2.h(this.Q.getPaint().getColor());
                    fVar2.draw(canvas3);
                }
                canvas3.restore();
            }
            if (R() && U(ziVar)) {
                canvas3.save();
                float f24 = (this.W - this.j1) / 2.0f;
                if (ziVar.D != i11) {
                    f24 += org.telegram.messenger.g0.L(8.0f);
                }
                float f25 = f24;
                if (W()) {
                    RectF rectF = this.N1;
                    f10 = (rectF != null ? rectF.top : org.telegram.messenger.g0.L(4.0f) + this.T + this.P) + (i23 > 0 ? org.telegram.messenger.k5.D(16.0f, 2, i23) : org.telegram.messenger.g0.L(16.0f));
                } else {
                    float f26 = (this.j1 * 0.075f) + this.T + this.P;
                    if (ziVar.D != 21) {
                        i23 = this.i1;
                    }
                    float L4 = f26 + i23 + org.telegram.messenger.g0.L(4.0f);
                    if (ziVar.D == 21) {
                        L4 += org.telegram.messenger.g0.L(16.0f);
                    }
                    f10 = L4;
                    if (ziVar.t4()) {
                        f10 += org.telegram.messenger.g0.L(12.0f);
                    } else if (ziVar.D == 30 && !ziVar.t4()) {
                        f10 -= org.telegram.messenger.g0.L(3.66f);
                    }
                }
                int i27 = ziVar.D;
                if (i27 == 31 || i27 == 37 || i27 == 33) {
                    f10 -= org.telegram.messenger.g0.L(3.66f);
                }
                canvas3.translate(f25, f10);
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
                    L = height + org.telegram.messenger.g0.L(ziVar.D == 25 ? 6.0f : 0.0f);
                } else {
                    L = f10 - org.telegram.messenger.g0.L(4.0f);
                }
                float f27 = L;
                canvas3.restore();
                StaticLayout staticLayout4 = this.k1;
                int i28 = TLObject.FLAG_28;
                if (staticLayout4 == null || (ly0Var2 = this.m1) == null) {
                    i12 = 33;
                    canvas2 = canvas3;
                    f11 = 0.0f;
                } else {
                    float k10 = ly0Var2.k() + org.telegram.messenger.g0.L(12.0f);
                    float z10 = com.google.android.recaptcha.internal.a.z(this.j1 - org.telegram.messenger.g0.L(16.0f), k10, 2.0f, f25);
                    float height2 = f10 + this.k1.getHeight() + org.telegram.messenger.g0.L(14.0f);
                    if (this.l1 == null) {
                        this.l1 = new Paint(1);
                    }
                    this.l1.setColor(org.telegram.ui.ActionBar.k6.j1() ? 285212671 : 268435456);
                    RectF rectF2 = org.telegram.messenger.g0.P;
                    rectF2.set(z10, height2 - org.telegram.messenger.g0.L(8.0f), k10 + z10, org.telegram.messenger.g0.L(8.0f) + height2);
                    canvas3.drawRoundRect(rectF2, org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), this.l1);
                    Canvas canvas4 = canvas3;
                    f11 = 0.0f;
                    i12 = 33;
                    this.m1.c(z10 + org.telegram.messenger.g0.L(6.0f), height2, 1.0f, -855638017, canvas4);
                    canvas2 = canvas4;
                    f27 += org.telegram.messenger.g0.L(24.0f);
                }
                float L5 = f27 + org.telegram.messenger.g0.L(4.0f);
                if (ziVar.D == 18) {
                    L5 += org.telegram.messenger.g0.L(2.0f);
                }
                float f28 = L5;
                canvas2.save();
                canvas2.translate(f25, f28);
                if (ziVar.D == i11) {
                    RadialProgress2 radialProgress23 = radialProgress2;
                    if ((radialProgress23.c ? radialProgress23.j : radialProgress23.i).b() == 1.0f) {
                        i15 = 4;
                        if (radialProgress23.a() == 4) {
                            if (this.t1 != null) {
                                canvas2.save();
                                canvas2.translate((this.j1 - ((StaticLayout) this.t1.f).getWidth()) / 2.0f, f11);
                                this.t1.b = ((this.j1 - ((StaticLayout) r3.f).getWidth()) / 2.0f) + f25;
                                this.t1.e = f28;
                                int color = textPaint3.getColor();
                                r0 r0Var = this.t1;
                                f12 = 0.2f;
                                f13 = 8.0f;
                                yh.f.g(this, false, color, 0, (AtomicReference) r0Var.g, 1, (StaticLayout) r0Var.f, r0Var.c, canvas, false);
                                r0 r0Var2 = this.t1;
                                org.telegram.ui.Components.p5.drawAnimatedEmojis(canvas, (StaticLayout) r0Var2.f, (org.telegram.ui.Components.l5) r0Var2.h, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f, L(textPaint3.getColor()));
                                canvas3 = canvas;
                                canvas3.restore();
                                t0Var = this;
                                i13 = 24;
                                f14 = f25;
                            } else {
                                f12 = 0.2f;
                                f13 = 8.0f;
                                t0Var = this;
                                canvas3 = canvas2;
                                i13 = 24;
                                f14 = f25;
                            }
                        }
                    } else {
                        i15 = 4;
                    }
                    f12 = 0.2f;
                    float f29 = f11;
                    f13 = 8.0f;
                    int i29 = i12;
                    canvas3 = canvas2;
                    if (this.B1 == null) {
                        TextPaint textPaint6 = new TextPaint();
                        this.A1 = textPaint6;
                        textPaint6.setTextSize(org.telegram.messenger.g0.L(13.0f));
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(bd.L0(2131754558));
                        int indexOf = spannableStringBuilder.toString().indexOf("...");
                        if (indexOf < 0) {
                            indexOf = spannableStringBuilder.toString().indexOf("…");
                            i16 = 1;
                        } else {
                            i16 = 3;
                        }
                        if (indexOf >= 0) {
                            SpannableString spannableString = new SpannableString("…");
                            ei.x9 x9Var = new ei.x9();
                            x9Var.r = true;
                            x9Var.b(this);
                            spannableString.setSpan(x9Var, 0, spannableString.length(), i29);
                            spannableStringBuilder.replace(indexOf, indexOf + i16, (CharSequence) spannableString);
                        }
                        TextPaint textPaint7 = this.A1;
                        r0 r0Var3 = this.t1;
                        this.B1 = new StaticLayout(spannableStringBuilder, textPaint7, r0Var3 == null ? 1 : r0Var3.d, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                    }
                    float P2 = P(ziVar);
                    if (this.D1 == null || this.C1 != P2) {
                        this.C1 = P2;
                        String o10 = a1.g.o((int) (P2 * 100.0f), "%", new StringBuilder());
                        r0 r0Var4 = this.t1;
                        this.D1 = new StaticLayout(o10, textPaint3, r0Var4 == null ? 1 : r0Var4.d, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                    }
                    this.A1.setColor(textPaint3.getColor());
                    if (radialProgress23.a() == i15) {
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
                            canvas3.translate((this.j1 - ((StaticLayout) this.t1.f).getWidth()) / 2.0f, f29);
                            this.t1.b = ((this.j1 - ((StaticLayout) r1.f).getWidth()) / 2.0f) + f25;
                            this.t1.e = f28;
                            int color3 = textPaint3.getColor();
                            r0 r0Var5 = this.t1;
                            yh.f.g(this, false, color3, 0, (AtomicReference) r0Var5.g, 1, (StaticLayout) r0Var5.f, r0Var5.c, canvas3, false);
                            r0 r0Var6 = this.t1;
                            t0Var2 = this;
                            org.telegram.ui.Components.p5.drawAnimatedEmojis(canvas, (StaticLayout) r0Var6.f, (org.telegram.ui.Components.l5) r0Var6.h, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f, L(textPaint3.getColor()));
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
                        canvas3.translate((t0Var2.j1 - t0Var2.B1.getWidth()) / 2.0f, f29);
                        yh.f.f(canvas3, t0Var2.B1);
                        canvas3.restore();
                        canvas3.save();
                        canvas3.translate(f29, org.telegram.messenger.g0.L(4.0f) + t0Var2.B1.getHeight());
                        canvas3.scale(f32, f32, t0Var2.j1 / 2.0f, t0Var2.D1.getHeight() / 2.0f);
                        canvas3.translate((t0Var2.j1 - t0Var2.D1.getWidth()) / 2.0f, f29);
                        yh.f.f(canvas3, t0Var2.D1);
                        canvas3.restore();
                        textPaint3.setColor(color2);
                        textPaint3.linkColor = color2;
                    } else {
                        t0Var2 = this;
                        canvas3.save();
                        canvas3.translate((t0Var2.j1 - t0Var2.B1.getWidth()) / 2.0f, f29);
                        t0Var2.B1.draw(canvas3);
                        canvas3.restore();
                        canvas3.save();
                        canvas3.translate((t0Var2.j1 - t0Var2.D1.getWidth()) / 2.0f, org.telegram.messenger.g0.L(4.0f) + t0Var2.B1.getHeight());
                        yh.f.f(canvas3, t0Var2.D1);
                        canvas3.restore();
                    }
                    t0Var = t0Var2;
                    f14 = f25;
                    i13 = 24;
                } else {
                    f12 = 0.2f;
                    float f33 = f11;
                    f13 = 8.0f;
                    canvas3 = canvas2;
                    r0 r0Var7 = this.t1;
                    if (r0Var7 != null) {
                        float height3 = ((StaticLayout) r0Var7.f).getHeight();
                        if (d < 1.0f) {
                            height3 = org.telegram.messenger.g0.T1(this.q1, height3, d);
                            RectF rectF3 = org.telegram.messenger.g0.P;
                            rectF3.set(f33, -org.telegram.messenger.g0.L(20.0f), getWidth(), height3);
                            canvas3.saveLayerAlpha(rectF3, hs.e4, 31);
                        } else {
                            canvas3.save();
                        }
                        canvas3.translate(((this.j1 - org.telegram.messenger.g0.L(16.0f)) - ((StaticLayout) this.t1.f).getWidth()) / 2.0f, f33);
                        this.t1.b = (((this.j1 - org.telegram.messenger.g0.L(16.0f)) - ((StaticLayout) this.t1.f).getWidth()) / 2.0f) + f25;
                        r0 r0Var8 = this.t1;
                        r0Var8.e = f28;
                        int color4 = r0Var8.a.getColor();
                        r0 r0Var9 = this.t1;
                        float f34 = height3;
                        i13 = 24;
                        f14 = f25;
                        yh.f.g(this, false, color4, 0, (AtomicReference) r0Var9.g, 1, (StaticLayout) r0Var9.f, r0Var9.c, canvas3, false);
                        r0 r0Var10 = this.t1;
                        StaticLayout staticLayout5 = (StaticLayout) r0Var10.f;
                        org.telegram.ui.Components.l5 l5Var2 = (org.telegram.ui.Components.l5) r0Var10.h;
                        ColorFilter L6 = L(textPaint3.getColor());
                        t0Var = this;
                        org.telegram.ui.Components.p5.drawAnimatedEmojis(canvas, staticLayout5, l5Var2, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f, L6);
                        canvas3 = canvas;
                        if (d < 1.0f && t0Var.x1 != null) {
                            canvas3.save();
                            if (t0Var.s1 == null) {
                                t0Var.s1 = new k4.j(24);
                            }
                            canvas3.translate((-((t0Var.j1 - org.telegram.messenger.g0.L(16.0f)) - ((StaticLayout) t0Var.t1.f).getWidth())) / 2.0f, 0.0f);
                            RectF rectF4 = org.telegram.messenger.g0.P;
                            rectF4.set((t0Var.u1 - t0Var.x1.g()) + org.telegram.messenger.g0.L(8.0f), (t0Var.v1 - t0Var.w1) - org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f) + t0Var.u1, t0Var.v1);
                            float f35 = 1.0f - d;
                            t0Var.s1.o(canvas3, rectF4, f35);
                            rectF4.set((t0Var.u1 - t0Var.x1.g()) - org.telegram.messenger.g0.L(16.0f), (t0Var.v1 - t0Var.w1) - org.telegram.messenger.g0.L(6.0f), (t0Var.u1 - t0Var.x1.g()) + org.telegram.messenger.g0.L(8.0f), t0Var.v1);
                            t0Var.s1.w(canvas3, rectF4, 2, f35);
                            rectF4.set(0.0f, f34 - org.telegram.messenger.g0.L(12.0f), t0Var.getWidth(), f34);
                            t0Var.s1.w(canvas3, rectF4, 3, (1.0f - f35) * f35 * 4.0f);
                            canvas3.restore();
                        }
                        canvas3.restore();
                        if (d < 1.0f && (ly0Var = t0Var.x1) != null) {
                            ly0Var.c((t0Var.u1 - ly0Var.g()) + org.telegram.messenger.g0.L(5.0f), (t0Var.v1 - (t0Var.w1 / 2.0f)) - org.telegram.messenger.g0.L(1.0f), 1.0f - d, t0Var.t1.a.getColor(), canvas3);
                        }
                    } else {
                        i13 = 24;
                        t0Var = this;
                        f14 = f25;
                    }
                }
                canvas3.restore();
                if (t0Var.k1 == null) {
                    org.telegram.messenger.g0.L(f13);
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
                org.telegram.messenger.g0.L(f13);
                org.telegram.ui.ActionBar.e6 e6Var = t0Var.h1;
                if (e6Var != null) {
                    e6Var.b(t0Var.v0, t0Var.u0 + org.telegram.messenger.g0.L(4.0f), t0Var.getMeasuredWidth(), t0Var.w0);
                } else {
                    org.telegram.ui.ActionBar.k6.r(t0Var.v0, t0Var.u0 + org.telegram.messenger.g0.L(4.0f), t0Var.getMeasuredWidth(), t0Var.w0);
                }
                float a11 = t0Var.n.a(0.02f);
                canvas3.save();
                RectF rectF5 = t0Var.p0;
                canvas3.scale(a11, a11, rectF5.centerX(), rectF5.centerY());
                if (t0Var.y1 != null) {
                    canvas3.drawRoundRect(rectF5, org.telegram.messenger.g0.L(15.0f), org.telegram.messenger.g0.L(15.0f), t0Var.O("paintChatActionBackgroundSelected"));
                    if (t0Var.Q()) {
                        canvas3.drawRoundRect(rectF5, org.telegram.messenger.g0.L(15.0f), org.telegram.messenger.g0.L(15.0f), t0Var.O("paintChatActionBackgroundDarken"));
                    }
                    float f36 = t0Var.c2;
                    Paint paint = t0Var.d2;
                    if (f36 > 0.0f) {
                        canvas3.drawRoundRect(rectF5, org.telegram.messenger.g0.L(15.0f), org.telegram.messenger.g0.L(15.0f), paint);
                    }
                    if (t0Var.getMessageObject().D == 31 || t0Var.getMessageObject().D == 37 || t0Var.getMessageObject().D == 33) {
                        boolean a12 = e6Var != null ? e6Var.a() : org.telegram.ui.ActionBar.k6.j1();
                        int color5 = paint.getColor();
                        if (a12) {
                            i28 = 620756991;
                        }
                        paint.setColor(i28);
                        canvas3.drawRoundRect(rectF5, org.telegram.messenger.g0.L(15.0f), org.telegram.messenger.g0.L(15.0f), paint);
                        paint.setColor(color5);
                    }
                    if (t0Var.getMessageObject().D == 31 || t0Var.getMessageObject().D == 37 || t0Var.getMessageObject().D == 33 || t0Var.getMessageObject().D == 21 || t0Var.getMessageObject().D == 22 || t0Var.getMessageObject().D == i13) {
                        t0Var.invalidate();
                    } else {
                        Path path2 = t0Var.V1;
                        path2.rewind();
                        path2.addRoundRect(rectF5, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), Path.Direction.CW);
                        canvas3.save();
                        canvas3.clipPath(path2);
                        vg.s1 s1Var = t0Var.W1;
                        s1Var.d(canvas3);
                        if (!s1Var.g) {
                            t0Var.invalidate();
                        }
                        canvas3.restore();
                    }
                }
                boolean z11 = ziVar.q;
                if (z11) {
                    float f37 = t0Var.d0;
                    if (f37 != 1.0f) {
                        t0Var.d0 = f37 + 0.10666667f;
                        f15 = 0.0f;
                        i14 = Utilities.i(t0Var.d0, 1.0f, f15);
                        t0Var.d0 = i14;
                        if (i14 != f15) {
                            if (t0Var.c0 == null) {
                                t0Var.c0 = new RadialProgressView(t0Var.getContext());
                            }
                            int L7 = org.telegram.messenger.g0.L(16.0f);
                            canvas3.save();
                            float f38 = t0Var.d0;
                            canvas3.scale(f38, f38, rectF5.centerX(), rectF5.centerY());
                            t0Var.c0.setSize(L7);
                            t0Var.c0.setProgressColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.Wc));
                            t0Var.c0.a(canvas3, rectF5.centerX(), rectF5.centerY());
                            canvas3.restore();
                        }
                        if (t0Var.d0 != 1.0f && t0Var.y1 != null) {
                            canvas3.save();
                            float f39 = 1.0f - t0Var.d0;
                            canvas3.scale(f39, f39, rectF5.centerX(), rectF5.centerY());
                            canvas3.translate(f14, rectF5.top + org.telegram.messenger.g0.L(7.0f));
                            canvas3.translate(((t0Var.j1 - org.telegram.messenger.g0.L(16.0f)) - t0Var.y1.getWidth()) / 2.0f, 0.0f);
                            t0Var.y1.draw(canvas3);
                            canvas3.restore();
                        }
                        if (ziVar.r) {
                            if (t0Var.r == null) {
                                w70 w70Var = new w70(e6Var);
                                t0Var.r = w70Var;
                                w70Var.h();
                                w70 w70Var2 = t0Var.r;
                                w70Var2.D = true;
                                float f40 = f12;
                                w70Var2.g(org.telegram.ui.ActionBar.k6.r1(0.08f, -1), org.telegram.ui.ActionBar.k6.r1(f40, -1), org.telegram.ui.ActionBar.k6.r1(f40, -1), org.telegram.ui.ActionBar.k6.r1(0.7f, -1));
                                t0Var.r.x.setStrokeWidth(org.telegram.messenger.g0.L(1.0f));
                            }
                            w70 w70Var3 = t0Var.r;
                            w70Var3.c = -1L;
                            w70Var3.e(rectF5);
                            t0Var.r.k(16.0f);
                            t0Var.r.draw(canvas3);
                        } else {
                            w70 w70Var4 = t0Var.r;
                            if (w70Var4 != null) {
                                w70Var4.e(rectF5);
                                t0Var.r.k(16.0f);
                                t0Var.r.a();
                                t0Var.r.draw(canvas3);
                                if (t0Var.r.c()) {
                                    t0Var.r.b = -1L;
                                }
                            }
                        }
                        canvas3.restore();
                        if (t0Var.N1 != null && t0Var.S1 != null && t0Var.T1 != null) {
                            O = t0Var.O("paintChatActionBackground");
                            Paint O2 = t0Var.O("paintChatActionBackgroundDarken");
                            float L8 = (t0Var.N1.right - org.telegram.messenger.g0.L(65.0f)) + org.telegram.messenger.g0.L(2.0f);
                            float L9 = t0Var.N1.top - org.telegram.messenger.g0.L(2.0f);
                            if (e6Var == null) {
                                e6Var.b(t0Var.v0 + L8, t0Var.u0 + org.telegram.messenger.g0.L(4.0f) + L9, t0Var.getMeasuredWidth(), t0Var.w0);
                            } else {
                                org.telegram.ui.ActionBar.k6.r(t0Var.v0 + L8, t0Var.u0 + org.telegram.messenger.g0.L(4.0f) + L9, t0Var.getMeasuredWidth(), t0Var.w0);
                            }
                            canvas3.save();
                            canvas3.translate(L8, L9);
                            ColorFilter colorFilter = O.getColorFilter();
                            PathEffect pathEffect = O.getPathEffect();
                            a10 = e6Var == null ? e6Var.a() : org.telegram.ui.ActionBar.k6.j1();
                            if (t0Var.Q1 != null || t0Var.P1 != a10) {
                                colorMatrix = new ColorMatrix();
                                if ((O.getColorFilter() instanceof ColorMatrixColorFilter) && Build.VERSION.SDK_INT >= 26) {
                                    ((ColorMatrixColorFilter) O.getColorFilter()).getColorMatrix(colorMatrix);
                                }
                                org.telegram.messenger.g0.h(colorMatrix, !a10 ? 0.1f : -0.08f);
                                org.telegram.messenger.g0.i(colorMatrix, a10 ? 0.15f : 0.1f);
                                t0Var.Q1 = new ColorMatrixColorFilter(colorMatrix);
                                t0Var.P1 = a10;
                            }
                            O.setColorFilter(t0Var.Q1);
                            O.setPathEffect(t0Var.R1);
                            canvas3.drawPath(t0Var.S1, O);
                            O.setColorFilter(colorFilter);
                            O.setPathEffect(pathEffect);
                            if (t0Var.Q()) {
                                PathEffect pathEffect2 = O2.getPathEffect();
                                O2.setPathEffect(t0Var.R1);
                                canvas3.drawPath(t0Var.S1, O2);
                                O2.setPathEffect(pathEffect2);
                            }
                            canvas3.rotate(45.0f, org.telegram.messenger.g0.L(40.43f), org.telegram.messenger.g0.L(24.56f));
                            t0Var.T1.c(org.telegram.messenger.g0.L(40.43f) - (t0Var.T1.g() / 2.0f), org.telegram.messenger.g0.L(26.0f), 1.0f, -1, canvas3);
                            canvas3.restore();
                        }
                    }
                }
                if (!z11) {
                    float f41 = t0Var.d0;
                    f15 = 0.0f;
                    if (f41 != 0.0f) {
                        t0Var.d0 = f41 - 0.10666667f;
                    }
                    i14 = Utilities.i(t0Var.d0, 1.0f, f15);
                    t0Var.d0 = i14;
                    if (i14 != f15) {
                    }
                    if (t0Var.d0 != 1.0f) {
                        canvas3.save();
                        float f392 = 1.0f - t0Var.d0;
                        canvas3.scale(f392, f392, rectF5.centerX(), rectF5.centerY());
                        canvas3.translate(f14, rectF5.top + org.telegram.messenger.g0.L(7.0f));
                        canvas3.translate(((t0Var.j1 - org.telegram.messenger.g0.L(16.0f)) - t0Var.y1.getWidth()) / 2.0f, 0.0f);
                        t0Var.y1.draw(canvas3);
                        canvas3.restore();
                    }
                    if (ziVar.r) {
                    }
                    canvas3.restore();
                    if (t0Var.N1 != null) {
                        O = t0Var.O("paintChatActionBackground");
                        Paint O22 = t0Var.O("paintChatActionBackgroundDarken");
                        float L82 = (t0Var.N1.right - org.telegram.messenger.g0.L(65.0f)) + org.telegram.messenger.g0.L(2.0f);
                        float L92 = t0Var.N1.top - org.telegram.messenger.g0.L(2.0f);
                        if (e6Var == null) {
                        }
                        canvas3.save();
                        canvas3.translate(L82, L92);
                        ColorFilter colorFilter2 = O.getColorFilter();
                        PathEffect pathEffect3 = O.getPathEffect();
                        if (e6Var == null) {
                        }
                        if (t0Var.Q1 != null) {
                        }
                        colorMatrix = new ColorMatrix();
                        if (O.getColorFilter() instanceof ColorMatrixColorFilter) {
                            ((ColorMatrixColorFilter) O.getColorFilter()).getColorMatrix(colorMatrix);
                        }
                        org.telegram.messenger.g0.h(colorMatrix, !a10 ? 0.1f : -0.08f);
                        org.telegram.messenger.g0.i(colorMatrix, a10 ? 0.15f : 0.1f);
                        t0Var.Q1 = new ColorMatrixColorFilter(colorMatrix);
                        t0Var.P1 = a10;
                        O.setColorFilter(t0Var.Q1);
                        O.setPathEffect(t0Var.R1);
                        canvas3.drawPath(t0Var.S1, O);
                        O.setColorFilter(colorFilter2);
                        O.setPathEffect(pathEffect3);
                        if (t0Var.Q()) {
                        }
                        canvas3.rotate(45.0f, org.telegram.messenger.g0.L(40.43f), org.telegram.messenger.g0.L(24.56f));
                        t0Var.T1.c(org.telegram.messenger.g0.L(40.43f) - (t0Var.T1.g() / 2.0f), org.telegram.messenger.g0.L(26.0f), 1.0f, -1, canvas3);
                        canvas3.restore();
                    }
                }
                f15 = 0.0f;
                i14 = Utilities.i(t0Var.d0, 1.0f, f15);
                t0Var.d0 = i14;
                if (i14 != f15) {
                }
                if (t0Var.d0 != 1.0f) {
                }
                if (ziVar.r) {
                }
                canvas3.restore();
                if (t0Var.N1 != null) {
                }
            } else {
                t0Var = this;
            }
            t0Var.I(canvas3, false);
            t0Var.s2.a();
            canvas3.restore();
        }
        i3 = 22;
        c2 = '%';
        textPaint = this.t0;
        arrayList = this.q0;
        if (textPaint != null) {
        }
        i11 = i3;
        radialProgress2 = radialProgress22;
        if (this.t0 != null) {
            canvas3.save();
            canvas3.translate(this.V, this.T - this.R);
            if (this.Q.getPaint() != this.t0) {
            }
            canvas3.save();
            yh.f.d(canvas3, arrayList);
            yh.f.f(canvas3, this.Q);
            q0Var = this.g1;
            if (q0Var != null) {
            }
            StaticLayout staticLayout22 = this.Q;
            org.telegram.ui.Components.l5 l5Var3 = this.s0;
            StaticLayout staticLayout32 = this.N;
            org.telegram.ui.Components.p5.drawAnimatedEmojis(canvas, staticLayout22, l5Var3, 0.0f, arrayList, 0.0f, 0.0f, 0.0f, 1.0f, staticLayout32 != null ? null : L(staticLayout32.getPaint().getColor()));
            canvas3 = canvas;
            canvas3.restore();
            size = arrayList.size();
            i17 = 0;
            while (i17 < size) {
            }
            canvas3.restore();
        }
        if (R()) {
        }
        t0Var = this;
        t0Var.I(canvas3, false);
        t0Var.s2.a();
        canvas3.restore();
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        zi ziVar = this.Q0;
        if (TextUtils.isEmpty(this.S0) && ziVar == null) {
            return;
        }
        if (this.n2 == null) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(!TextUtils.isEmpty(this.S0) ? this.S0 : ziVar.v);
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
    public void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        RectF rectF = this.p0;
        this.U1.layout((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        org.telegram.ui.Wallet.b4 b4Var = this.J0;
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
    public final void onMeasure(int i3, int i10) {
        float f10;
        float f11;
        int i11;
        boolean R;
        dh.o0 o0Var;
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
        org.telegram.ui.Wallet.b4 b4Var = this.J0;
        org.telegram.ui.Wallet.a4 a4Var = b4Var == null ? null : b4Var.m;
        if (a4Var != null) {
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(42.0f), TLObject.FLAG_30);
            a4Var.measure(makeMeasureSpec, makeMeasureSpec);
        }
        zi ziVar = this.Q0;
        if (ziVar == null && this.S0 == null) {
            setMeasuredDimension(View.MeasureSpec.getSize(i3), org.telegram.messenger.g0.L(14.0f) + this.m0 + this.P);
            return;
        }
        if (U(ziVar)) {
            this.j1 = org.telegram.messenger.camera.q.C(64.0f, (org.telegram.messenger.g0.q.y - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - org.telegram.messenger.g0.m, (int) (org.telegram.messenger.g0.Q1() ? org.telegram.messenger.g0.Q0() * 0.6f : (org.telegram.messenger.g0.q.x * 0.62f) - org.telegram.messenger.g0.L(34.0f)));
            if ((!org.telegram.messenger.g0.Q1() && ((i14 = ziVar.D) == 18 || i14 == 30 || V())) || ziVar.D == 35) {
                this.j1 = (int) (this.j1 * 1.2f);
            }
            this.i1 = this.j1 - org.telegram.messenger.g0.L(106.0f);
            if (ziVar.D == 31) {
                this.j1 = Math.min(this.j1, org.telegram.messenger.g0.L(192.0f));
                this.i1 = org.telegram.messenger.g0.L(78.0f);
            }
            if (ziVar.D == 33) {
                this.j1 = Math.min(this.j1, org.telegram.messenger.g0.L(220.0f));
                this.i1 = org.telegram.messenger.g0.L(78.0f);
            }
            int i15 = ziVar.D;
            ImageReceiver imageReceiver = this.J;
            if (i15 == 37) {
                this.i1 = org.telegram.messenger.g0.L(52.0f);
                imageReceiver.J0(org.telegram.messenger.g0.L(14.0f));
            } else if (W()) {
                imageReceiver.J0(this.i1 / 2);
            } else {
                imageReceiver.J0(0);
            }
        }
        int max = Math.max(org.telegram.messenger.g0.L(30.0f), View.MeasureSpec.getSize(i3));
        if (this.W != max) {
            this.D0 = true;
            this.W = max;
            v();
        }
        if (ziVar != null) {
            f10 = 30.0f;
            if (ziVar.D == 11) {
                i13 = org.telegram.messenger.g0.u;
                L4 = org.telegram.messenger.g0.L(10.0f);
            } else if (U(ziVar)) {
                i13 = this.j1;
                L4 = org.telegram.messenger.g0.L(12.0f);
            } else if (S()) {
                f11 = 140.0f;
                i11 = (this.J0.q0 == null ? org.telegram.messenger.g0.L(140.0f) : ((int) Math.ceil(r3.q0.i())) + org.telegram.messenger.g0.L(150.0f)) + org.telegram.messenger.g0.L(8.0f);
                R = R();
                o0Var = this.F0;
                if (R) {
                    r9 = org.telegram.messenger.k5.C(8.0f, this.I0.P, this.I0.p ? 0 : org.telegram.messenger.g0.L(16.0f) + this.T + this.P);
                    if (!o0Var.p) {
                        L3 = org.telegram.messenger.g0.L(8.0f) + o0Var.m;
                        o0Var.n = L3;
                        r9 += L3;
                    }
                    f14 = 24.0f;
                } else {
                    iw0 iw0Var = this.P0;
                    if (iw0Var != null) {
                        r9 = org.telegram.messenger.g0.L(12.0f) + org.telegram.messenger.g0.L(f11) + ((int) iw0Var.f.i()) + (iw0Var.i ? org.telegram.messenger.g0.L(40.0f) : 0);
                        if (!o0Var.p) {
                            L3 = org.telegram.messenger.g0.L(8.0f) + o0Var.m;
                            o0Var.n = L3;
                            r9 += L3;
                        }
                    } else if (U(ziVar)) {
                        if (ziVar != null) {
                            f12 = 12.0f;
                            if (ziVar.D == 25) {
                                z10 = true;
                                int N = N(ziVar);
                                if (W()) {
                                    f13 = 8.0f;
                                    f14 = 24.0f;
                                    L = (this.t1 == null ? 0 : org.telegram.messenger.g0.L(4.0f) + ((StaticLayout) r4.f).getHeight()) + (this.j1 * 0.075f) + this.T + this.P + N + org.telegram.messenger.g0.L(4.0f);
                                } else {
                                    f14 = 24.0f;
                                    f13 = 8.0f;
                                    int L5 = org.telegram.messenger.g0.L(4.0f) + this.T + this.P + (N > 0 ? org.telegram.messenger.k5.D(16.0f, 2, N) : org.telegram.messenger.g0.L(16.0f));
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
                                    zi ziVar2 = this.Q0;
                                    if (ziVar2.D == 18 || ziVar2.t4()) {
                                        this.L1 = org.telegram.messenger.camera.q.D(this.y1 == null ? 0.0f : 10.0f, height2, this.L1);
                                    } else if (this.Q0.D == 30) {
                                        this.L1 = org.telegram.messenger.camera.q.D(20.0f, height2, this.L1);
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
                                    float z11 = com.google.android.recaptcha.internal.a.z((L7 - L2) - staticLayout.getHeight(), org.telegram.messenger.g0.L(f13), 2.0f, L2);
                                    if (this.Q0.t4()) {
                                        z11 += org.telegram.messenger.g0.L(4.0f);
                                    }
                                    float f16 = (this.W - this.E1) / 2.0f;
                                    f15 = 2.0f;
                                    rectF.set(f16 - org.telegram.messenger.g0.L(18.0f), z11 - org.telegram.messenger.g0.L(f13), f16 + this.E1 + org.telegram.messenger.g0.L(18.0f), z11 + (this.y1 != null ? r7.getHeight() : 0) + org.telegram.messenger.g0.L(f13));
                                } else {
                                    f15 = 2.0f;
                                    i11 -= org.telegram.messenger.g0.L(40.0f);
                                    this.L1 -= org.telegram.messenger.g0.L(40.0f);
                                    zi ziVar3 = this.Q0;
                                    if (ziVar3 != null && (message = ziVar3.k) != null && (message.action instanceof TLRPC.TL_messageActionStarGift)) {
                                        i11 -= org.telegram.messenger.g0.L(f13);
                                        this.L1 -= org.telegram.messenger.g0.L(f13);
                                    }
                                }
                                measuredWidth = getMeasuredWidth() << (getMeasuredHeight() + 16);
                                vg.s1 s1Var = this.W1;
                                s1Var.a.set(rectF);
                                s1Var.b.set(rectF);
                                if (this.X1 != measuredWidth) {
                                    this.X1 = measuredWidth;
                                    s1Var.f();
                                }
                                if (W()) {
                                    int L8 = org.telegram.messenger.g0.L(4.0f) + this.T + this.P;
                                    this.f = 0;
                                    int D = N > 0 ? org.telegram.messenger.k5.D(16.0f, 2, N) : org.telegram.messenger.g0.L(16.0f);
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
                                    } else if (!V() && (i12 = ziVar.D) != 34 && i12 != 33 && i12 != 35) {
                                        rectF.set(f17 - org.telegram.messenger.g0.L(18.0f), this.h, f17 + this.E1 + org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.k5.D(8.0f, 2, org.telegram.messenger.g0.L(17.0f) + this.h));
                                        this.f = org.telegram.messenger.g0.L(17.0f) + this.f;
                                    }
                                    int L9 = org.telegram.messenger.g0.L(15.0f) + this.f;
                                    this.f = L9;
                                    int L10 = org.telegram.messenger.g0.L(6.0f) + L8 + L9;
                                    if (!o0Var.p) {
                                        int L11 = org.telegram.messenger.g0.L(8.0f) + o0Var.m;
                                        o0Var.n = L11;
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
                        int N2 = N(ziVar);
                        if (W()) {
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
                        vg.s1 s1Var2 = this.W1;
                        s1Var2.a.set(rectF2);
                        s1Var2.b.set(rectF2);
                        if (this.X1 != measuredWidth) {
                        }
                        if (W()) {
                        }
                        rectF2.inset(org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(1.0f));
                    }
                    f14 = 24.0f;
                }
                if (this.Q0 != null && !o0Var.p) {
                    int L12 = org.telegram.messenger.g0.L(8.0f) + o0Var.m;
                    o0Var.n = L12;
                    i11 += L12;
                }
                if (V()) {
                    i11 = org.telegram.messenger.k5.C(f14, this.R, i11);
                }
                if (ziVar == null && W()) {
                    setMeasuredDimension(max, this.m0 + r9);
                } else {
                    setMeasuredDimension(max, org.telegram.messenger.g0.L(14.0f) + this.m0 + this.P + i11);
                }
                o0Var.c = (getMeasuredHeight() - getPaddingTop()) - o0Var.n;
            }
            i11 = L4 + i13;
            f11 = 140.0f;
            R = R();
            o0Var = this.F0;
            if (R) {
            }
            if (this.Q0 != null) {
                int L122 = org.telegram.messenger.g0.L(8.0f) + o0Var.m;
                o0Var.n = L122;
                i11 += L122;
            }
            if (V()) {
            }
            if (ziVar == null) {
            }
            setMeasuredDimension(max, org.telegram.messenger.g0.L(14.0f) + this.m0 + this.P + i11);
            o0Var.c = (getMeasuredHeight() - getPaddingTop()) - o0Var.n;
        }
        f10 = 30.0f;
        f11 = 140.0f;
        i11 = 0;
        R = R();
        o0Var = this.F0;
        if (R) {
        }
        if (this.Q0 != null) {
        }
        if (V()) {
        }
        if (ziVar == null) {
        }
        setMeasuredDimension(max, org.telegram.messenger.g0.L(14.0f) + this.m0 + this.P + i11);
        o0Var.c = (getMeasuredHeight() - getPaddingTop()) - o0Var.n;
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
        int i3;
        boolean z10;
        f30 f30Var;
        r0 r0Var;
        org.telegram.messenger.ej ejVar;
        dg.a aVar;
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
        zi ziVar = this.Q0;
        float x10 = motionEvent.getX() - (this.k0 / 2.0f);
        this.z0 = x10;
        float y9 = motionEvent.getY() + getPaddingTop();
        this.A0 = y9;
        boolean z18 = true;
        if (ziVar == null) {
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
        f01 f01Var = this.o0;
        if (f01Var == null || !f01Var.d(motionEvent, false)) {
            iw0 iw0Var = this.P0;
            if (iw0Var != null) {
                gc gcVar = iw0Var.m;
                boolean contains = iw0Var.k.contains(motionEvent.getX(), motionEvent.getY());
                if (motionEvent.getAction() == 0) {
                    gcVar.c(contains);
                } else if (motionEvent.getAction() != 2) {
                    if (motionEvent.getAction() == 1) {
                        if (gcVar.i) {
                            iw0Var.b();
                        }
                        gcVar.c(false);
                    } else if (motionEvent.getAction() == 3) {
                        gcVar.c(false);
                    }
                }
            }
            if (!R() || !this.I0.e(this.G0, this.H0, motionEvent)) {
                if (S()) {
                    org.telegram.ui.Wallet.b4 b4Var = this.J0;
                    float f10 = (this.k0 / 2.0f) + this.L0;
                    float paddingTop = this.M0 + getPaddingTop();
                    ArrayList arrayList2 = b4Var.c;
                    gc gcVar2 = b4Var.Y;
                    float x11 = motionEvent.getX() - f10;
                    float y10 = motionEvent.getY() - paddingTop;
                    t0 t0Var2 = b4Var.a;
                    if (motionEvent.getActionMasked() == 0) {
                        float x12 = motionEvent.getX() - f10;
                        float y11 = motionEvent.getY() - paddingTop;
                        org.telegram.ui.Wallet.a4 a4Var = b4Var.m;
                        if (a4Var != null && a4Var.n && b4Var.w.contains((int) x12, (int) y11)) {
                            if (!b4Var.D && b4Var.C <= 1.001f) {
                                b4Var.A = b4Var.g();
                                b4Var.B = b4Var.k.F * 0.14f;
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
                            gcVar2.c(false);
                            if (t0Var2.getParent() != null) {
                                t0Var2.getParent().requestDisallowInterceptTouchEvent(true);
                            }
                            b4Var.a(3.0f);
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
                        boolean z19 = x11 < L && x11 <= ((float) org.telegram.messenger.g0.L(206.0f)) - L && y10 >= L && y10 <= ((float) org.telegram.messenger.g0.L(140.0f)) - L;
                        if (b4Var.q0 != null) {
                            TLRPC.TL_messageActionGramTransfer tL_messageActionGramTransfer = b4Var.l0;
                            if ((tL_messageActionGramTransfer.comment_encrypted || tL_messageActionGramTransfer.comment_encrypted_preparing) && !b4Var.m0) {
                                float L2 = x11 - ((org.telegram.messenger.g0.L(206.0f) - b4Var.q0.k()) / 2.0f);
                                float L3 = y10 - org.telegram.messenger.g0.L(143.0f);
                                int size = arrayList2.size();
                                int i11 = 0;
                                while (i11 < size) {
                                    Object obj = arrayList2.get(i11);
                                    i11++;
                                    t0Var = t0Var2;
                                    if (((yh.f) obj).getBounds().contains((int) L2, (int) L3)) {
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
                            b4Var.r0 = z20;
                            gcVar2.c(z20);
                        } else if (motionEvent.getAction() != 2) {
                            if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                                z18 = b4Var.r0;
                                boolean z21 = motionEvent.getAction() == 1 && z18 && z20;
                                b4Var.r0 = false;
                                gcVar2.c(false);
                                if (z21 && z17) {
                                    TLRPC.TL_messageActionGramTransfer tL_messageActionGramTransfer2 = b4Var.l0;
                                    if (tL_messageActionGramTransfer2.comment_encrypted_preparing) {
                                        b4Var.m0 = true;
                                        ly0 ly0Var = b4Var.q0;
                                        ly0Var.q(org.telegram.messenger.i6.m(tL_messageActionGramTransfer2.comment, ly0Var.a.getFontMetricsInt(), false, null, 0));
                                        b4Var.d.addAll(arrayList2);
                                        arrayList2.clear();
                                        t0Var.requestLayout();
                                        t0Var.invalidate();
                                        if (z18) {
                                        }
                                    }
                                }
                                if (z21 && (m0Var = b4Var.s0) != null) {
                                    m0Var.run();
                                }
                                if (z18) {
                                }
                            }
                            z18 = b4Var.r0;
                            if (z18) {
                            }
                        } else if (b4Var.r0) {
                            gcVar2.c(z20);
                        }
                        z18 = b4Var.r0;
                        if (z18) {
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
                                        b4Var.A = com.google.android.recaptcha.internal.a.y(motionEvent.getX(findPointerIndex), b4Var.y, radians, b4Var.A);
                                        b4Var.B = com.google.android.recaptcha.internal.a.y(motionEvent.getY(findPointerIndex), b4Var.z, radians, b4Var.B);
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
                                if (z18) {
                                }
                            }
                            b4Var.j();
                            if (z18) {
                            }
                        }
                        float L4 = org.telegram.messenger.g0.L(4.0f);
                        if (x11 < L4) {
                        }
                        if (b4Var.q0 != null) {
                        }
                        t0Var = t0Var2;
                        z17 = false;
                        if (z19) {
                        }
                        if (motionEvent.getAction() != 0) {
                        }
                        z18 = b4Var.r0;
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
                    gc gcVar3 = this.n;
                    if (action != 0) {
                        i3 = 4;
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
                                gcVar3.c(false);
                                if (this.g1 != null && ziVar.C != null && (message = ziVar.k) != null && dg.d.g(message.action, TLRPC.TL_messageActionTodoAppendTasks.class, TLRPC.TL_messageActionTodoCompletions.class, TLRPC.TL_messageActionSuggestedPostApproval.class, TLRPC.TL_messageActionSuggestedPostRefund.class, TLRPC.TL_messageActionSuggestedPostSuccess.class)) {
                                    this.g1.h(this, this.Q0.O1());
                                } else if (this.p1 && !this.o1 && (r0Var2 = this.t1) != null) {
                                    int height = ((StaticLayout) r0Var2.f).getHeight() - this.q1;
                                    this.o1 = true;
                                    q0 q0Var = this.g1;
                                    if (q0Var != null) {
                                        q0Var.r(this);
                                        if (getParent() instanceof tj0) {
                                            ((tj0) getParent()).w0(0, org.telegram.messenger.g0.L(24.0f) + height, null);
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
                                    if (!rectF2.contains(x10, y9)) {
                                        this.F = false;
                                    }
                                }
                                z11 = true;
                                z12 = z11;
                            } else if (action2 == 3) {
                                this.F = false;
                                gcVar3.c(false);
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
                                    gcVar3.c(false);
                                    if (this.g1 != null) {
                                        int i14 = ziVar.D;
                                        if (i14 == 37) {
                                            playSoundEffect(0);
                                            org.telegram.ui.ActionBar.d2 T = LaunchActivity.T();
                                            if (T != null) {
                                                new ji.b0(T, ((TLRPC.TL_messageActionChangeCommunity) ziVar.k.action).community_id, null, null).show();
                                            }
                                        } else if (i14 == 31) {
                                            playSoundEffect(0);
                                            c0();
                                        } else if (i14 == 25) {
                                            playSoundEffect(0);
                                            if (this.g1 != null) {
                                                org.telegram.messenger.g0.h3(new ea(2, this, (TLRPC.TL_messageActionGiftCode) this.Q0.k.action));
                                            }
                                        } else if (i14 == 18) {
                                            playSoundEffect(0);
                                            b0();
                                        } else if (i14 == 30) {
                                            playSoundEffect(0);
                                            c0();
                                        } else {
                                            TLRPC.Message message3 = ziVar.k;
                                            if (message3 != null) {
                                                TLRPC.MessageAction messageAction = message3.action;
                                                if ((messageAction instanceof TLRPC.TL_messageActionSuggestedPostApproval) && ((TLRPC.TL_messageActionSuggestedPostApproval) messageAction).balance_too_low) {
                                                    playSoundEffect(0);
                                                    TLRPC.Message message4 = this.Q0.k;
                                                    if (message4 != null) {
                                                        TLRPC.SuggestedPost suggestedPost = message4.suggested_post;
                                                        if (suggestedPost != null) {
                                                            ejVar = org.telegram.messenger.ej.b(suggestedPost);
                                                        } else {
                                                            TLRPC.MessageAction messageAction2 = message4.action;
                                                            if (messageAction2 instanceof TLRPC.TL_messageActionSuggestedPostApproval) {
                                                                ejVar = new org.telegram.messenger.ej(dg.a.l(((TLRPC.TL_messageActionSuggestedPostApproval) messageAction2).price), r1.schedule_date);
                                                            }
                                                        }
                                                        aVar = ejVar.a;
                                                        if (aVar != null && aVar.a == dg.b.a) {
                                                            new mb(getContext(), this.h1, ejVar.a.a(), 13, rg.c.h(i13, zi.B0(this.Q0.k)), null, zi.B0(this.Q0.k)).show();
                                                        }
                                                    }
                                                    ejVar = null;
                                                    aVar = ejVar.a;
                                                    if (aVar != null) {
                                                        new mb(getContext(), this.h1, ejVar.a.a(), 13, rg.c.h(i13, zi.B0(this.Q0.k)), null, zi.B0(this.Q0.k)).show();
                                                    }
                                                }
                                            }
                                            if (((f30) hp.s1(i13).B7.get(ziVar.k.local_id)) == null) {
                                                if (this.z1) {
                                                    this.g1.u(this);
                                                } else {
                                                    this.g1.x(this);
                                                }
                                            }
                                        }
                                    }
                                } else if (action3 != 2) {
                                    if (action3 == 3) {
                                        this.a0 = false;
                                        this.b0 = false;
                                        view.setPressed(false);
                                        gcVar3.c(false);
                                    }
                                } else if (!U(ziVar) || (!rectF.contains(x10, y9) && !this.N1.contains(x10, y9))) {
                                    this.b0 = false;
                                    view.setPressed(false);
                                    gcVar3.c(false);
                                }
                            } else if (this.a0) {
                                int action4 = motionEvent.getAction();
                                if (action4 == 1) {
                                    this.a0 = false;
                                    if (!this.p1 || this.o1 || (r0Var = this.t1) == null) {
                                        int i15 = ziVar.D;
                                        if (i15 == 31) {
                                            c0();
                                        } else if (i15 == 25) {
                                            if (this.g1 != null) {
                                                org.telegram.messenger.g0.h3(new ea(2, this, (TLRPC.TL_messageActionGiftCode) this.Q0.k.action));
                                            }
                                        } else if (i15 == 18) {
                                            b0();
                                        } else if (i15 == 30) {
                                            c0();
                                        } else if (this.g1 != null) {
                                            if (i15 != 21 || (f30Var = (f30) hp.s1(i13).B7.get(ziVar.k.local_id)) == null) {
                                                z10 = false;
                                            } else {
                                                f30Var.b();
                                                z10 = true;
                                            }
                                            if (!z10) {
                                                this.g1.u(this);
                                                playSoundEffect(0);
                                            }
                                        }
                                    } else {
                                        int height2 = ((StaticLayout) r0Var.f).getHeight() - this.q1;
                                        this.o1 = true;
                                        q0 q0Var2 = this.g1;
                                        if (q0Var2 != null) {
                                            q0Var2.r(this);
                                            if (getParent() instanceof tj0) {
                                                ((tj0) getParent()).w0(0, org.telegram.messenger.g0.L(16.0f) + height2, null);
                                                return true;
                                            }
                                        }
                                    }
                                } else if (action4 != 2) {
                                    if (action4 == 3) {
                                        this.a0 = false;
                                    }
                                } else if (W()) {
                                    if (!this.N1.contains(x10, y9)) {
                                        this.a0 = false;
                                    }
                                } else if (!imageReceiver.O(x10, y9)) {
                                    this.a0 = false;
                                }
                            }
                            z12 = false;
                        }
                    } else if (this.g1 != null) {
                        if ((ziVar.D == 11 || U(ziVar)) && imageReceiver.O(x10, y9)) {
                            this.a0 = true;
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        if (this.K1.i.q == 4 && (((i10 = ziVar.D) == 21 || i10 == 22) && this.N1.contains(x10, y9))) {
                            this.a0 = true;
                            z15 = true;
                        }
                        r0 r0Var4 = this.t1;
                        if (r0Var4 == null || !this.p1) {
                            i3 = 4;
                        } else {
                            RectF rectF3 = org.telegram.messenger.g0.P;
                            float f12 = r0Var4.b;
                            i3 = 4;
                            rectF3.set(f12, r0Var4.e, ((StaticLayout) r0Var4.f).getWidth() + f12, this.t1.e + ((StaticLayout) r6.f).getHeight());
                            if (rectF3.contains(x10, y9)) {
                                this.F = true;
                                z15 = true;
                            }
                        }
                        if (U(ziVar) && this.y1 != null && (rectF.contains(x10, y9) || (this.z1 && this.N1.contains(x10, y9)))) {
                            z16 = true;
                            this.b0 = true;
                            view.setPressed(true);
                            gcVar3.c(true);
                            z15 = true;
                        } else {
                            z16 = true;
                        }
                        if (!z15 && V()) {
                            this.F = z16;
                            z15 = true;
                        }
                        if (!z15) {
                            zi ziVar2 = this.Q0;
                            if (dg.d.g((ziVar2 == null || (message2 = ziVar2.k) == null) ? null : message2.action, TLRPC.TL_messageActionSuggestedPostRefund.class, TLRPC.TL_messageActionSuggestedPostSuccess.class)) {
                                this.F = true;
                                z15 = true;
                            }
                        }
                        if (z15) {
                            u();
                        }
                        z12 = z15;
                    } else {
                        i3 = 4;
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
                                yh.f fVar = (yh.f) obj2;
                                Rect bounds = fVar.getBounds();
                                r0 r0Var6 = this.t1;
                                if (bounds.contains((int) (x10 - r0Var6.b), (int) (y9 - r0Var6.e))) {
                                    this.y = null;
                                    if (motionEvent.getAction() == 0) {
                                        this.E = fVar;
                                        z12 = true;
                                    } else {
                                        yh.f fVar2 = this.E;
                                        z13 = true;
                                        if (fVar == fVar2) {
                                            this.H = true;
                                            fVar2.q = new m0(this, i3);
                                            float sqrt = (float) Math.sqrt(Math.pow(((StaticLayout) this.t1.f).getHeight(), 2.0d) + Math.pow(((StaticLayout) this.t1.f).getWidth(), 2.0d));
                                            yh.f fVar3 = this.E;
                                            r0 r0Var7 = this.t1;
                                            fVar3.j((int) (x10 - r0Var7.b), (int) (y9 - r0Var7.e), sqrt, false);
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
                                if (y9 >= f13 && x10 <= r5 + this.O && y9 <= r6 + this.P) {
                                    float f14 = y9 - f13;
                                    float f15 = x10 - this.U;
                                    if (!z12) {
                                        int lineForVertical = staticLayout.getLineForVertical((int) f14);
                                        int offsetForHorizontal = this.N.getOffsetForHorizontal(lineForVertical, f15);
                                        float lineLeft = this.N.getLineLeft(lineForVertical);
                                        if (lineLeft <= f15 && this.N.getLineWidth(lineForVertical) + lineLeft >= f15) {
                                            CharSequence charSequence = ziVar.v;
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
            return q0Var.r0(this, this.z0, this.A0);
        }
        return false;
    }

    public void setCustomText(CharSequence charSequence) {
        this.S0 = charSequence;
        if (charSequence != null) {
            i0(false);
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

    public void setMessageObject(zi ziVar) {
        f0(ziVar, false);
    }

    public void setOnActionClickListener(View.OnClickListener onClickListener) {
        this.f2 = onClickListener;
    }

    public void setOverrideTextMaxWidth(int i3) {
        this.g2 = i3;
    }

    public void setScrimReaction(Integer num) {
        this.F0.z = num;
    }

    public void setShowTopic(boolean z10) {
        if (this.n0 != z10) {
            this.n0 = z10;
            T();
            invalidate();
        }
    }

    public void setSpoilersSuppressed(boolean z10) {
        this.K0 = z10;
        org.telegram.ui.Wallet.b4 b4Var = this.J0;
        if (b4Var != null) {
            b4Var.n(z10);
        }
        ArrayList arrayList = this.q0;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            ((yh.f) obj).invalidateSelf();
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
        long j10;
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
        int i3;
        String G;
        TL_stars.StarGift starGift;
        String str;
        CharSequence X2;
        String str2;
        CharSequence charSequence5;
        String r5;
        TLRPC.Peer peer;
        TLRPC.Message message;
        TLRPC.MessageAction messageAction;
        int i10;
        TLRPC.Chat M0;
        TLRPC.User user;
        CharSequence K2;
        TLRPC.MessageMedia messageMedia;
        zi ziVar = this.Q0;
        int i11 = this.I;
        if (ziVar == null) {
            j10 = 0;
            charSequence = this.S0;
        } else if (S()) {
            CharSequence m10 = org.telegram.ui.Wallet.k0.x(i11).m(((TLRPC.TL_messageActionGramTransfer) ziVar.k.action).amount, false);
            if (!TextUtils.isEmpty(m10)) {
                charSequence = bd.V(null, null, 2131742984, org.telegram.ui.Components.p5.cloneSpans(ziVar.v), m10);
                j10 = 0;
                if (charSequence == null) {
                    TLRPC.Message message2 = ziVar.k;
                    if (message2 == null || (messageMedia = message2.media) == null || messageMedia.ttl_seconds == 0) {
                        charSequence = org.telegram.ui.Components.p5.cloneSpans(ziVar.v);
                    } else if (messageMedia.photo != null) {
                        charSequence = bd.M0(2131753947, null);
                    } else {
                        TLRPC.Document document = messageMedia.document;
                        charSequence = ((document instanceof TLRPC.TL_documentEmpty) || ((messageMedia instanceof TLRPC.TL_messageMediaDocument) && document == null)) ? messageMedia.voice ? bd.M0(2131753929, null) : messageMedia.round ? bd.M0(2131753940, null) : bd.M0(2131753932, null) : org.telegram.ui.Components.p5.cloneSpans(ziVar.v);
                    }
                }
            }
            j10 = 0;
            charSequence = null;
            if (charSequence == null) {
            }
        } else {
            if (ziVar.h3()) {
                charSequence = ziVar.k.media.user_id != h10.i(i11).e() ? ei.s7.e(new Object[0], 2131750874, true) : ei.s7.e(new Object[]{hp.s1(i11).a2(Long.valueOf(zi.B0(ziVar.k))).first_name}, 2131750873, true);
            } else {
                q0 q0Var = this.g1;
                if (q0Var != null && q0Var.b() == 0 && zi.F4(ziVar)) {
                    TLRPC.TL_forumTopic f10 = hp.s1(i11).q7.f(-zi.B0(ziVar.k), zi.c2(i11, ziVar.k, true, false));
                    int i12 = rg.c.a;
                    if (f10 != null) {
                        TLRPC.Message message3 = ziVar.k;
                        int i13 = ziVar.I1;
                        TLRPC.MessageAction messageAction2 = message3.action;
                        if (messageAction2 instanceof TLRPC.TL_messageActionTopicCreate) {
                            charSequence = org.telegram.messenger.g0.K2(bd.M0(2131744009, null), rg.c.j(f10, null, null), "%s");
                        } else if (messageAction2 instanceof TLRPC.TL_messageActionTopicEdit) {
                            TLRPC.TL_messageActionTopicEdit tL_messageActionTopicEdit = (TLRPC.TL_messageActionTopicEdit) messageAction2;
                            j10 = 0;
                            long Z0 = ziVar.Z0();
                            if (org.telegram.messenger.m5.E(Z0)) {
                                user = hp.s1(i13).a2(Long.valueOf(Z0));
                                M0 = null;
                            } else {
                                M0 = hp.s1(i13).M0(Long.valueOf(-Z0));
                                user = null;
                            }
                            String m11 = user != null ? org.telegram.messenger.g5.m(0, user.first_name, user.last_name) : M0 != null ? M0.title : null;
                            int i14 = tL_messageActionTopicEdit.flags;
                            if ((i14 & 8) != 0) {
                                K2 = org.telegram.messenger.g0.K2(bd.M0(tL_messageActionTopicEdit.hidden ? 2131744027 : 2131744013, null), m11, "%s");
                            } else if ((i14 & 4) != 0) {
                                K2 = org.telegram.messenger.g0.K2(org.telegram.messenger.g0.K2(bd.M0(tL_messageActionTopicEdit.closed ? 2131744010 : 2131744005, null), rg.c.j(f10, null, null), "%2$s"), m11, "%1$s");
                            } else {
                                int i15 = i14 & 1;
                                if (i15 != 0 && (i14 & 2) != 0) {
                                    TLRPC.TL_forumTopic tL_forumTopic = new TLRPC.TL_forumTopic();
                                    tL_forumTopic.icon_emoji_id = tL_messageActionTopicEdit.icon_emoji_id;
                                    tL_forumTopic.title = tL_messageActionTopicEdit.title;
                                    K2 = org.telegram.messenger.g0.K2(org.telegram.messenger.g0.K2(bd.M0(2131744006, null), rg.c.j(tL_forumTopic, null, null), "%2$s"), m11, "%1$s");
                                } else if (i15 != 0) {
                                    K2 = org.telegram.messenger.g0.K2(org.telegram.messenger.g0.K2(bd.M0(2131744007, null), tL_messageActionTopicEdit.title, "%2$s"), m11, "%1$s");
                                } else {
                                    if ((i14 & 2) != 0) {
                                        TLRPC.TL_forumTopic tL_forumTopic2 = new TLRPC.TL_forumTopic();
                                        tL_forumTopic2.icon_emoji_id = tL_messageActionTopicEdit.icon_emoji_id;
                                        tL_forumTopic2.title = "";
                                        K2 = org.telegram.messenger.g0.K2(org.telegram.messenger.g0.K2(bd.M0(2131744008, null), rg.c.j(tL_forumTopic2, null, null), "%2$s"), m11, "%1$s");
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
                j10 = 0;
                charSequence = null;
                if (charSequence == null) {
                }
            }
            j10 = 0;
            if (charSequence == null) {
            }
        }
        zi ziVar2 = this.Q0;
        CharSequence charSequence6 = (ziVar2 == null || !ziVar2.h2) ? charSequence : "";
        if (ziVar2 != null && (message = ziVar2.k) != null && (messageAction = message.action) != null) {
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
        B(this.W, charSequence6);
        if (this.P0 != null) {
            this.N = null;
            this.P = 0;
            this.Q = null;
            this.R = 0;
            this.T = 0;
        }
        if (ziVar != null) {
            TLRPC.Message message4 = ziVar.k;
            if (message4 != null) {
                TLRPC.MessageAction messageAction3 = message4.action;
                if ((messageAction3 instanceof TLRPC.TL_messageActionSuggestedPostApproval) && ((TLRPC.TL_messageActionSuggestedPostApproval) messageAction3).balance_too_low) {
                    A(null, null, charSequence6, false, !org.telegram.messenger.t3.z(i11, 24, zi.B0(message4)) ? bd.M0(2131745161, null) : null, 11, null, this.j1, false);
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
                    A(null, null, charSequence7, false, null, 11, null, this.j1, false);
                    this.N = null;
                    this.P = 0;
                    this.Q = null;
                    this.R = 0;
                    this.T = 0;
                }
            }
            int i16 = ziVar.D;
            if (i16 == 11) {
                float L = org.telegram.messenger.g0.L(19.0f) + this.P;
                float f11 = org.telegram.messenger.g0.u;
                this.J.y0((this.W - org.telegram.messenger.g0.u) / 2.0f, L, f11, f11);
            } else if (i16 == 25) {
                z();
            } else {
                TextPaint textPaint = this.G1;
                if (i16 == 30) {
                    TLRPC.User a22 = hp.s1(i11).a2(Long.valueOf(this.Q0.A0()));
                    TLRPC.MessageAction messageAction5 = ziVar.k.action;
                    if (messageAction5 instanceof TLRPC.TL_messageActionGiftStars) {
                        A(bd.I((int) ((TLRPC.TL_messageActionGiftStars) messageAction5).stars, "ActionGiftStarsTitle"), null, org.telegram.messenger.g0.X2(this.Q0.Q3() ? bd.Z(2131754631, l10.k(a22)) : bd.L0(2131754630)), false, bd.L0(2131754626), 11, null, this.j1, true);
                    } else {
                        if ((messageAction5 instanceof TLRPC.TL_messageActionStarGiftUnique) && ((TLRPC.TL_messageActionStarGiftUnique) messageAction5).refunded) {
                            long e10 = h10.i(i11).e();
                            TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique = (TLRPC.TL_messageActionStarGiftUnique) ziVar.k.action;
                            if (ziVar.Q3() != (!tL_messageActionStarGiftUnique.upgrade)) {
                                e10 = ziVar.A0();
                            }
                            TLRPC.User a23 = hp.s1(i11).a2(Long.valueOf(e10));
                            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                            spannableStringBuilder2.append((CharSequence) bd.L0(tL_messageActionStarGiftUnique.prepaid_upgrade ? 2131750436 : 2131750445)).append((CharSequence) " ");
                            if (a23 != null && a23.photo != null) {
                                spannableStringBuilder2.append((CharSequence) "a ");
                                org.telegram.ui.h5 h5Var = new org.telegram.ui.h5(18.0f, i11, this);
                                h5Var.e(a23);
                                spannableStringBuilder2.setSpan(h5Var, spannableStringBuilder2.length() - 2, spannableStringBuilder2.length() - 1, 33);
                            }
                            spannableStringBuilder2.append((CharSequence) l10.k(a23));
                            A(spannableStringBuilder2, null, bd.L0(2131750437), false, bd.L0(2131754626), 12, bd.L0(2131749902), this.j1, true);
                        } else if (messageAction5 instanceof TLRPC.TL_messageActionStarGift) {
                            TLRPC.TL_messageActionStarGift tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction5;
                            long j11 = tL_messageActionStarGift.convert_stars;
                            long e11 = h10.i(i11).e();
                            long j12 = j10;
                            TLRPC.Peer peer2 = tL_messageActionStarGift.peer;
                            boolean z11 = peer2 != null && (!tL_messageActionStarGift.prepaid_upgrade || (peer2 instanceof TLRPC.TL_peerChannel));
                            boolean z12 = ziVar.A0() == e11 && !z11;
                            long Z02 = ziVar.Z0();
                            if (!tL_messageActionStarGift.prepaid_upgrade && (peer = tL_messageActionStarGift.from_id) != null) {
                                Z02 = org.telegram.messenger.m5.o(peer);
                            }
                            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
                            TLObject e22 = hp.s1(i11).e2(Z02);
                            long o10 = org.telegram.messenger.m5.o(tL_messageActionStarGift.to_id);
                            TLObject e23 = hp.s1(i11).e2(o10);
                            boolean z13 = tL_messageActionStarGift.can_upgrade && !tL_messageActionStarGift.converted && tL_messageActionStarGift.upgrade_stars > j12 && !tL_messageActionStarGift.upgraded;
                            if (o10 != j12 && tL_messageActionStarGift.auction_acquired && e23 != null) {
                                spannableStringBuilder3.append((CharSequence) bd.L0(2131750442)).append((CharSequence) " ");
                                if (!(e23 instanceof TLRPC.User) ? !(!(e23 instanceof TLRPC.Chat) || ((TLRPC.Chat) e23).photo == null) : ((TLRPC.User) e23).photo != null) {
                                    spannableStringBuilder3.append((CharSequence) "a ");
                                    org.telegram.ui.h5 h5Var2 = new org.telegram.ui.h5(18.0f, i11, this);
                                    org.telegram.ui.Components.u8 u8Var = h5Var2.c;
                                    u8Var.p(e23);
                                    h5Var2.b.i0(e23, u8Var, null);
                                    spannableStringBuilder3.setSpan(h5Var2, spannableStringBuilder3.length() - 2, spannableStringBuilder3.length() - 1, 33);
                                }
                                spannableStringBuilder3.append((CharSequence) org.telegram.messenger.m5.u(e23));
                            } else if (!z12) {
                                spannableStringBuilder3.append((CharSequence) bd.L0(tL_messageActionStarGift.prepaid_upgrade ? 2131750436 : 2131750445)).append((CharSequence) " ");
                                if (!(e22 instanceof TLRPC.User) ? !(!(e22 instanceof TLRPC.Chat) || ((TLRPC.Chat) e22).photo == null) : ((TLRPC.User) e22).photo != null) {
                                    spannableStringBuilder3.append((CharSequence) "a ");
                                    org.telegram.ui.h5 h5Var3 = new org.telegram.ui.h5(18.0f, i11, this);
                                    org.telegram.ui.Components.u8 u8Var2 = h5Var3.c;
                                    u8Var2.p(e22);
                                    h5Var3.b.i0(e22, u8Var2, null);
                                    spannableStringBuilder3.setSpan(h5Var3, spannableStringBuilder3.length() - 2, spannableStringBuilder3.length() - 1, 33);
                                }
                                spannableStringBuilder3.append((CharSequence) org.telegram.messenger.m5.u(e22));
                            } else if (tL_messageActionStarGift.gift_num <= 0 || (starGift = tL_messageActionStarGift.gift) == null || (str = starGift.title) == null) {
                                spannableStringBuilder3.append((CharSequence) bd.L0(2131750447));
                            } else {
                                spannableStringBuilder3.append((CharSequence) str).append((CharSequence) " #").append((CharSequence) bd.E(tL_messageActionStarGift.gift_num, ','));
                            }
                            boolean z14 = ((ziVar.Q3() && !z12) || !tL_messageActionStarGift.converted) && tL_messageActionStarGift.convert_stars > j12 && hp.s1(i11).E6 - (ConnectionsManager.getInstance(i11).getCurrentTime() - ziVar.k.date) > 0 && !tL_messageActionStarGift.refunded;
                            if (tL_messageActionStarGift.refunded) {
                                X2 = bd.L0(2131750473);
                            } else {
                                TLRPC.TL_textWithEntities tL_textWithEntities = tL_messageActionStarGift.message;
                                if (tL_textWithEntities != null && !TextUtils.isEmpty(tL_textWithEntities.text)) {
                                    SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder(tL_messageActionStarGift.message.text);
                                    textPaint.setTextSize(org.telegram.messenger.g0.L(13.0f));
                                    zi.a(spannableStringBuilder4, tL_messageActionStarGift.message.entities, false, true, true);
                                    X2 = zi.A5(textPaint.getFontMetricsInt(), org.telegram.messenger.i6.m(spannableStringBuilder4, textPaint.getFontMetricsInt(), false, null, 0), tL_messageActionStarGift.message.entities);
                                } else if (tL_messageActionStarGift.auction_acquired) {
                                    X2 = bd.Z(2131750428, bd.E(tL_messageActionStarGift.gift.stars + tL_messageActionStarGift.upgrade_stars, ','));
                                } else if (z11) {
                                    X2 = tL_messageActionStarGift.converted ? bd.I((int) j11, "Gift2ActionConvertedInfo") : (!z14 || j11 <= j12) ? org.telegram.messenger.g0.X2(bd.L0(2131750466)) : org.telegram.messenger.g0.X2(bd.I((int) j11, "Gift2ActionInfoChannel"));
                                } else if (z12) {
                                    X2 = (!tL_messageActionStarGift.converted || j11 <= j12) ? tL_messageActionStarGift.can_upgrade ? org.telegram.messenger.g0.X2(bd.L0(2131750450)) : org.telegram.messenger.g0.X2(bd.L0(2131750451)) : bd.I((int) j11, "Gift2ActionConvertedInfo");
                                } else if (z13) {
                                    X2 = org.telegram.messenger.g0.X2(ziVar.Q3() ? bd.Z(2131750438, l10.k(a22)) : bd.L0(2131750439));
                                } else {
                                    X2 = ziVar.Q3() ? (!z14 || j11 <= j12) ? tL_messageActionStarGift.can_upgrade ? org.telegram.messenger.g0.X2(bd.Z(2131750459, l10.k(a22))) : org.telegram.messenger.g0.X2(bd.Z(2131750460, l10.k(a22))) : org.telegram.messenger.g0.X2(bd.J((int) j11, "Gift2ActionOutInfo", l10.k(a22))) : tL_messageActionStarGift.converted ? bd.I((int) j11, "Gift2ActionConvertedInfo") : tL_messageActionStarGift.saved ? !z14 ? bd.L0(2131750474) : bd.L0(2131750453) : !z14 ? bd.L0(2131750475) : org.telegram.messenger.g0.X2(bd.I((int) j11, "Gift2ActionInfo"));
                                }
                            }
                            CharSequence charSequence8 = X2;
                            TL_stars.StarGift starGift2 = tL_messageActionStarGift.gift;
                            if (starGift2 == null || !starGift2.limited) {
                                str2 = null;
                            } else {
                                int i17 = starGift2.availability_total;
                                str2 = bd.Z(2131750143, i17 > 1500 ? org.telegram.messenger.g0.o0(i17, 0) : Integer.valueOf(i17));
                            }
                            CharSequence L02 = bd.L0(2131754626);
                            if (ziVar.Q3()) {
                                charSequence5 = L02;
                                if (!tL_messageActionStarGift.forceIn) {
                                }
                            }
                            charSequence5 = L02;
                            charSequence5 = L02;
                            if (!ziVar.Q3() && z13) {
                                SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder();
                                spannableStringBuilder5.append("^  ");
                                wp wpVar = new wp(R.drawable.gift_unpack);
                                wpVar.I = 0.8f;
                                wpVar.J = 0.8f;
                                spannableStringBuilder5.setSpan(wpVar, 0, 1, 33);
                                spannableStringBuilder5.append(bd.L0(2131749893));
                                charSequence5 = spannableStringBuilder5;
                            }
                            CharSequence charSequence9 = charSequence5;
                            TL_stars.StarGift starGift3 = tL_messageActionStarGift.gift;
                            A(spannableStringBuilder3, (starGift3 == null || starGift3.released_by == null || (r5 = org.telegram.messenger.m5.r(hp.s1(i11).e2(org.telegram.messenger.m5.o(tL_messageActionStarGift.gift.released_by)))) == null) ? null : ci.l6.f2(bd.Z(2131750455, "@".concat(r5))), charSequence8, false, charSequence9, 11, str2, this.j1, true);
                        } else if (messageAction5 instanceof TLRPC.TL_messageActionGiftTon) {
                            A(bd.L0(2131754624), null, this.Q0.v, false, bd.L0(2131754626), 11, null, this.j1, true);
                            this.N = null;
                            this.P = 0;
                            this.Q = null;
                            this.R = 0;
                            this.T = 0;
                        } else {
                            A(bd.L0(2131754553), null, this.Q0.v, false, bd.L0(2131754626), 11, null, this.j1, true);
                            this.N = null;
                            this.P = 0;
                            this.Q = null;
                            this.R = 0;
                            this.T = 0;
                        }
                    }
                } else {
                    long j13 = j10;
                    if (i16 == 33) {
                        TLRPC.TL_messageActionStarGiftPurchaseOffer tL_messageActionStarGiftPurchaseOffer = (TLRPC.TL_messageActionStarGiftPurchaseOffer) message4.action;
                        SpannableStringBuilder spannableStringBuilder6 = new SpannableStringBuilder(charSequence7);
                        spannableStringBuilder6.append((CharSequence) "\n\n");
                        if (tL_messageActionStarGiftPurchaseOffer.accepted) {
                            spannableStringBuilder6.append((CharSequence) org.telegram.messenger.g0.X2(bd.L0(2131749703)));
                        } else if (tL_messageActionStarGiftPurchaseOffer.declined) {
                            spannableStringBuilder6.append((CharSequence) org.telegram.messenger.g0.X2(bd.L0(2131749700)));
                        } else {
                            int max = Math.max(0, tL_messageActionStarGiftPurchaseOffer.expires_at - ConnectionsManager.getInstance(i11).getCurrentTime());
                            if (max == 0) {
                                spannableStringBuilder6.append((CharSequence) org.telegram.messenger.g0.X2(bd.L0(2131749702)));
                            } else {
                                int i18 = max / 60;
                                int i19 = max / 3600;
                                if (i19 > 0) {
                                    StringBuilder sb2 = new StringBuilder();
                                    i3 = 0;
                                    sb2.append(bd.G(i19, "ShortHoursAgo", new Object[0]));
                                    sb2.append(" ");
                                    sb2.append(bd.G(i18 % 60, "ShortMinutesAgo", new Object[0]));
                                    G = sb2.toString();
                                } else {
                                    i3 = 0;
                                    G = bd.G(i18, "ShortMinutesAgo", new Object[0]);
                                }
                                if (G.endsWith(".")) {
                                    G = com.google.android.recaptcha.internal.a.j(G, 1, i3);
                                }
                                Object[] objArr = new Object[1];
                                objArr[i3] = G;
                                spannableStringBuilder6.append((CharSequence) org.telegram.messenger.g0.X2(bd.Z(2131749701, objArr)));
                            }
                        }
                        A(null, null, spannableStringBuilder6, false, null, 11, null, this.j1, false);
                        this.N = null;
                        this.P = 0;
                        this.Q = null;
                        this.R = 0;
                        this.T = 0;
                    } else if (i16 == 34) {
                        A(null, null, charSequence7, false, null, 11, null, this.j1, false);
                        this.N = null;
                        this.P = 0;
                        this.Q = null;
                        this.R = 0;
                        this.T = 0;
                    } else if (i16 == 35) {
                        TLRPC.TL_messageActionNoForwardsRequest tL_messageActionNoForwardsRequest = (TLRPC.TL_messageActionNoForwardsRequest) message4.action;
                        SpannableStringBuilder spannableStringBuilder7 = new SpannableStringBuilder();
                        String u10 = org.telegram.messenger.m5.u(hp.s1(i11).a2(Long.valueOf(ziVar.A0())));
                        if (tL_messageActionNoForwardsRequest.new_value) {
                            spannableStringBuilder7.append(ziVar.O3() ? bd.L0(2131745390) : org.telegram.messenger.g0.X2(bd.Z(2131745393, u10)));
                        } else {
                            spannableStringBuilder7.append(ziVar.O3() ? bd.L0(2131745379) : org.telegram.messenger.g0.X2(bd.Z(2131745382, u10)));
                        }
                        if (tL_messageActionNoForwardsRequest.new_value) {
                            spannableStringBuilder7.append((CharSequence) "\n\n");
                            spannableStringBuilder7.append((CharSequence) E(bd.L0(2131745400)));
                            spannableStringBuilder7.append((CharSequence) "\n\n");
                            spannableStringBuilder7.append((CharSequence) E(bd.L0(2131745399)));
                            spannableStringBuilder7.append((CharSequence) "\n\n");
                            spannableStringBuilder7.append((CharSequence) E(bd.L0(2131745398)));
                            spannableStringBuilder7.append((CharSequence) "\n\n");
                            spannableStringBuilder7.append((CharSequence) E(bd.L0(2131745397)));
                        } else {
                            spannableStringBuilder7.append((CharSequence) "\n\n");
                            spannableStringBuilder7.append((CharSequence) E(bd.L0(2131745389)));
                            spannableStringBuilder7.append((CharSequence) "\n\n");
                            spannableStringBuilder7.append((CharSequence) E(bd.L0(2131745388)));
                            spannableStringBuilder7.append((CharSequence) "\n\n");
                            spannableStringBuilder7.append((CharSequence) E(bd.L0(2131745387)));
                            spannableStringBuilder7.append((CharSequence) "\n\n");
                            spannableStringBuilder7.append((CharSequence) E(bd.L0(2131745386)));
                        }
                        A(null, null, spannableStringBuilder7, false, null, 11, null, this.j1, false);
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
                        String l10 = k2.p1.l(starGift4.num, ',', sb3);
                        long Z03 = ziVar.Z0();
                        A(null, null, org.telegram.messenger.g0.X2(h10.i(i11).e() == Z03 ? bd.Z(2131749605, l10) : bd.Z(2131749606, org.telegram.messenger.m5.s(i11, Z03), l10)), false, bd.L0(2131749607), 11, null, this.j1, true);
                        this.N = null;
                        this.P = 0;
                        this.Q = null;
                        this.R = 0;
                        this.T = 0;
                    } else if (i16 == 37) {
                        TLRPC.TL_messageActionChangeCommunity tL_messageActionChangeCommunity = (TLRPC.TL_messageActionChangeCommunity) message4.action;
                        long o11 = org.telegram.messenger.m5.o(message4.peer_id);
                        boolean U = org.telegram.messenger.t3.U(i11, -o11);
                        boolean z15 = o11 > j13;
                        String s6 = org.telegram.messenger.m5.s(i11, org.telegram.messenger.m5.o(ziVar.k.from_id));
                        String s10 = org.telegram.messenger.m5.s(i11, -tL_messageActionChangeCommunity.community_id);
                        SpannableStringBuilder spannableStringBuilder8 = new SpannableStringBuilder();
                        spannableStringBuilder8.append((CharSequence) ji.j0.a(ziVar, s10, s6, U, z15));
                        A(null, null, spannableStringBuilder8, false, bd.L0(2131749607), 11, null, this.j1, true);
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
                            zi.a(spannableStringBuilder9, tL_textWithEntities2.entities, false, true, true);
                            charSequence4 = zi.A5(textPaint.getFontMetricsInt(), org.telegram.messenger.i6.m(spannableStringBuilder9, textPaint.getFontMetricsInt(), false, null, 0), tL_textWithEntities2.entities);
                        }
                        if (charSequence4 == null) {
                            charSequence4 = bd.L0(2131754641);
                        }
                        CharSequence charSequence10 = charSequence4;
                        zi ziVar3 = this.Q0;
                        CharSequence L03 = bd.L0((ziVar3 == null || !(ziVar3.k.action instanceof TLRPC.TL_messageActionGiftCode) || X()) ? 2131754634 : 2131749668);
                        TLRPC.MessageAction messageAction7 = ziVar.k.action;
                        int i20 = messageAction7.months;
                        if (i20 >= 1) {
                            A(bd.I(i20, "ActionGiftPremiumTitle2"), null, charSequence10, true, L03, 11, null, this.j1, false);
                        } else {
                            A(bd.I(messageAction7.days, "ActionGiftPremiumTitle2Days"), null, charSequence10, true, L03, 11, null, this.j1, false);
                        }
                    } else if (i16 == 21) {
                        TLRPC.TL_messageActionSuggestProfilePhoto tL_messageActionSuggestProfilePhoto = (TLRPC.TL_messageActionSuggestProfilePhoto) message4.action;
                        TLRPC.User a24 = hp.s1(i11).a2(Long.valueOf(ziVar.Q3() ? j13 : ziVar.A0()));
                        boolean z16 = tL_messageActionSuggestProfilePhoto.video || !((photo = tL_messageActionSuggestProfilePhoto.photo) == null || (arrayList2 = photo.video_sizes) == null || arrayList2.isEmpty());
                        if (a24.id == h10.i(i11).n) {
                            TLRPC.User a25 = hp.s1(i11).a2(Long.valueOf(ziVar.A0()));
                            Z = z16 ? bd.Z(2131754544, a25.first_name) : bd.Z(2131754548, a25.first_name);
                        } else {
                            Z = z16 ? bd.Z(2131754542, a24.first_name) : bd.Z(2131754546, a24.first_name);
                        }
                        A(null, null, Z, false, (tL_messageActionSuggestProfilePhoto.video || !((arrayList = tL_messageActionSuggestProfilePhoto.photo.video_sizes) == null || arrayList.isEmpty())) ? bd.L0(2131743549) : bd.L0(2131743557), 11, null, this.j1, true);
                        this.N = null;
                        this.P = 0;
                        this.Q = null;
                        this.R = 0;
                        this.T = 0;
                    } else if (i16 == 22) {
                        TLRPC.User a26 = hp.s1(i11).a2(Long.valueOf(ziVar.Q3() ? j13 : ziVar.A0()));
                        if (ziVar.A0() < j13) {
                            charSequence3 = ziVar.v;
                        } else if (!ziVar.Q3() && ziVar.Z4() && ziVar.T2()) {
                            charSequence2 = ziVar.v;
                            L0 = bd.L0(2131746294);
                            z10 = false;
                            A(null, null, charSequence2, false, L0, 11, null, this.j1, z10);
                            this.N = null;
                            this.P = 0;
                            this.Q = null;
                            this.R = 0;
                            this.T = 0;
                        } else if (a26 == null || a26.id != h10.i(i11).n) {
                            charSequence2 = ziVar.v;
                            L0 = bd.L0(2131743548);
                            z10 = true;
                            A(null, null, charSequence2, false, L0, 11, null, this.j1, z10);
                            this.N = null;
                            this.P = 0;
                            this.Q = null;
                            this.R = 0;
                            this.T = 0;
                        } else {
                            charSequence3 = ziVar.v;
                        }
                        charSequence2 = charSequence3;
                        L0 = null;
                        z10 = true;
                        A(null, null, charSequence2, false, L0, 11, null, this.j1, z10);
                        this.N = null;
                        this.P = 0;
                        this.Q = null;
                        this.R = 0;
                        this.T = 0;
                    } else if (ziVar.A4()) {
                        TLRPC.User a27 = hp.s1(i11).a2(Long.valueOf(ziVar.k.media.user_id));
                        A(null, null, a27.self ? org.telegram.messenger.g0.X2(bd.Z(2131744449, hp.s1(i11).a2(Long.valueOf(ziVar.A0())).first_name)) : org.telegram.messenger.g0.X2(bd.Z(2131744624, a27.first_name)), false, bd.L0(2131744625), 11, null, this.j1, true);
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
        dh.o0 o0Var = this.F0;
        o0Var.b = L2;
        o0Var.o(this.W - org.telegram.messenger.g0.L(24.0f), 1);
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
        int i3;
        int i10;
        org.telegram.messenger.o2 o2Var;
        zi ziVar;
        TLRPC.Message message;
        zi ziVar2;
        TLRPC.Message message2;
        TLRPC.Message message3;
        char c2;
        int i11;
        long j10;
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
            int y9 = (int) motionEvent.getY();
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
                    float f12 = y9;
                    if (rectF.contains(f11, f12)) {
                        this.m2 = i12;
                        T();
                        if (c0Var.s == null) {
                            y a03 = org.telegram.ui.ActionBar.k6.a0(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.bd, e6Var), 6, 6);
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
                                    org.telegram.ui.ActionBar.d2 E = q0Var != null ? q0Var.E() : null;
                                    if (E != null && this.Q0 != null) {
                                        org.telegram.ui.Components.t4.u0(E, bd.M0(2131749715, null), org.telegram.messenger.g0.X2(bd.a0(null, null, 2131749716, org.telegram.messenger.m5.t(zi.B0(this.Q0.k)))), bd.M0(2131749717, null), true, new ea(i13, this, E));
                                    }
                                } else if (i14 == 6) {
                                    zi ziVar3 = this.Q0;
                                    if (ziVar3 != null && (message3 = ziVar3.k) != null) {
                                        TLRPC.MessageAction messageAction = message3.action;
                                        if (messageAction instanceof TLRPC.TL_messageActionStarGiftPurchaseOffer) {
                                            TLRPC.TL_messageActionStarGiftPurchaseOffer tL_messageActionStarGiftPurchaseOffer = (TLRPC.TL_messageActionStarGiftPurchaseOffer) messageAction;
                                            org.telegram.ui.ActionBar.d2 Q = LaunchActivity.Q();
                                            Context context2 = getContext();
                                            long B0 = zi.B0(this.Q0.k);
                                            int f13 = this.Q0.f1();
                                            int[] iArr = ci.t0.q2;
                                            dg.a m10 = dg.a.m(tL_messageActionStarGiftPurchaseOffer.price);
                                            dg.b bVar = m10.a;
                                            int i15 = this.I;
                                            dg.b bVar2 = dg.b.a;
                                            if (bVar == bVar2) {
                                                c2 = 3;
                                                i11 = ((org.telegram.messenger.j0) hp.s1(i15).x7.n.b).c;
                                            } else {
                                                c2 = 3;
                                                i11 = ((org.telegram.messenger.j0) hp.s1(i15).x7.o.b).c;
                                            }
                                            dg.a i16 = dg.a.i((m10.b * i11) / 1000, bVar);
                                            TL_stars.StarGift starGift = tL_messageActionStarGiftPurchaseOffer.gift;
                                            StringBuilder sb2 = new StringBuilder();
                                            sb2.append(starGift.title);
                                            sb2.append(" #");
                                            String l10 = k2.p1.l(starGift.num, ',', sb2);
                                            if (B0 >= 0) {
                                                j10 = 0;
                                                M0 = hp.s1(i15).a2(Long.valueOf(B0));
                                            } else {
                                                j10 = 0;
                                                M0 = hp.s1(i15).M0(Long.valueOf(-B0));
                                            }
                                            String d = m10.d();
                                            String d10 = i16.d();
                                            if (bVar == dg.b.b) {
                                                str = l10;
                                                context = context2;
                                                z10 = true;
                                            } else {
                                                str = l10;
                                                context = context2;
                                                z10 = false;
                                            }
                                            LinearLayout f14 = org.telegram.messenger.k5.f(context, 1);
                                            f14.addView(new ci.j5(context, starGift, M0), mf.t(-1, -2, 48, 0, -4, 0, 0));
                                            TextView textView = new TextView(context);
                                            org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.j5, e6Var);
                                            textView.setTextSize(1, 16.0f);
                                            if (bVar == bVar2) {
                                                String t10 = org.telegram.messenger.m5.t(B0);
                                                Object[] objArr = new Object[4];
                                                objArr[0] = d;
                                                objArr[1] = t10;
                                                objArr[2] = str;
                                                objArr[c2] = d10;
                                                a02 = bd.a0(null, null, 2131749693, objArr);
                                            } else {
                                                String t11 = org.telegram.messenger.m5.t(B0);
                                                Object[] objArr2 = new Object[4];
                                                objArr2[0] = d;
                                                objArr2[1] = t11;
                                                objArr2[2] = str;
                                                objArr2[c2] = d10;
                                                a02 = bd.a0(null, null, 2131749692, objArr2);
                                            }
                                            textView.setText(org.telegram.messenger.g0.X2(a02));
                                            f14.addView(textView, mf.t(-1, -2, 48, 24, 4, 24, 4));
                                            FrameLayout frameLayout = new FrameLayout(context);
                                            frameLayout.setClipChildren(false);
                                            frameLayout.setClipToPadding(false);
                                            rx0 rx0Var = new rx0(context, e6Var);
                                            frameLayout.addView(rx0Var, mf.e(-1, -1, hs.E1));
                                            ci.l6.k1(rx0Var, ci.e9.l(starGift.attributes, TL_stars.starGiftAttributeModel.class));
                                            ci.l6.k1(rx0Var, ci.e9.l(starGift.attributes, TL_stars.starGiftAttributeBackdrop.class));
                                            ci.l6.k1(rx0Var, ci.e9.l(starGift.attributes, TL_stars.starGiftAttributePattern.class));
                                            f14.addView(frameLayout, mf.t(-1, -2, 48, 23, 16, 23, 4));
                                            dg.a j11 = dg.a.j(starGift.value_usd_amount / Math.pow(10.0d, org.telegram.messenger.r1.i().h("USD")), bVar);
                                            if (j11.c() > 0.0d && starGift.value_usd_amount > j10) {
                                                if (j11.b >= i16.b) {
                                                    int round = (int) Math.round((1.0d - (i16.c() / j11.c())) * 100.0d);
                                                    X2 = org.telegram.messenger.g0.X2(bd.a0(null, null, 2131749742, com.google.android.recaptcha.internal.a.h(round, "%"), starGift.title));
                                                    if (round > 10) {
                                                        z11 = true;
                                                        TextView textView2 = new TextView(context);
                                                        textView2.setTextSize(1, 13.0f);
                                                        textView2.setGravity(17);
                                                        textView2.setText(X2);
                                                        org.telegram.ui.ActionBar.r6.V(textView2, !z11 ? org.telegram.ui.ActionBar.k6.p7 : org.telegram.ui.ActionBar.k6.y6, e6Var);
                                                        f14.addView(textView2, mf.t(-1, -2, 49, 40, 12, 40, 9));
                                                    }
                                                } else {
                                                    X2 = org.telegram.messenger.g0.X2(bd.a0(null, null, 2131749745, com.google.android.recaptcha.internal.a.h((int) Math.round(((i16.c() / j11.c()) - 1.0d) * 100.0d), "%"), starGift.title));
                                                }
                                                z11 = false;
                                                TextView textView22 = new TextView(context);
                                                textView22.setTextSize(1, 13.0f);
                                                textView22.setGravity(17);
                                                textView22.setText(X2);
                                                org.telegram.ui.ActionBar.r6.V(textView22, !z11 ? org.telegram.ui.ActionBar.k6.p7 : org.telegram.ui.ActionBar.k6.y6, e6Var);
                                                f14.addView(textView22, mf.t(-1, -2, 49, 40, 12, 40, 9));
                                            }
                                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, e6Var);
                                            alertDialog$Builder.o(f14);
                                            alertDialog$Builder.k(wb.V0(bd.a0(null, null, 2131749710, d10), z10), new ci.m0(f13, i15, Q));
                                            alertDialog$Builder.h(bd.M0(2131752589, null), null);
                                            alertDialog$Builder.a.show();
                                        }
                                    }
                                } else {
                                    if (i14 == 7) {
                                        q0 q0Var2 = this.g1;
                                        org.telegram.ui.ActionBar.d2 E2 = q0Var2 != null ? q0Var2.E() : null;
                                        if (E2 != null && (ziVar2 = this.Q0) != null && (message2 = ziVar2.k) != null) {
                                            TLRPC.MessageAction messageAction2 = message2.action;
                                            if (messageAction2 instanceof TLRPC.TL_messageActionNoForwardsRequest) {
                                                final TLRPC.TL_messageActionNoForwardsRequest tL_messageActionNoForwardsRequest = (TLRPC.TL_messageActionNoForwardsRequest) messageAction2;
                                                final int i17 = 0;
                                                org.telegram.ui.Components.t4.u0(E2, bd.M0(tL_messageActionNoForwardsRequest.prev_value ? 2131745395 : 2131745384, null), bd.M0(tL_messageActionNoForwardsRequest.prev_value ? 2131745396 : 2131745385, null), bd.M0(2131745401, null), false, new Runnable(this) { // from class: org.telegram.ui.Cells.n0
                                                    public final /* synthetic */ t0 b;

                                                    {
                                                        this.b = this;
                                                    }

                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        switch (i17) {
                                                            case 0:
                                                                t0 t0Var = this.b;
                                                                hp.s1(t0Var.I).d5(zi.B0(t0Var.Q0.k), t0Var.Q0.f1(), tL_messageActionNoForwardsRequest.prev_value, null);
                                                                break;
                                                            default:
                                                                t0 t0Var2 = this.b;
                                                                hp.s1(t0Var2.I).d5(zi.B0(t0Var2.Q0.k), t0Var2.Q0.f1(), tL_messageActionNoForwardsRequest.new_value, null);
                                                                break;
                                                        }
                                                    }
                                                });
                                            }
                                        }
                                    } else if (i14 == 8) {
                                        q0 q0Var3 = this.g1;
                                        org.telegram.ui.ActionBar.d2 E3 = q0Var3 != null ? q0Var3.E() : null;
                                        if (E3 != null && (ziVar = this.Q0) != null && (message = ziVar.k) != null) {
                                            TLRPC.MessageAction messageAction3 = message.action;
                                            if (messageAction3 instanceof TLRPC.TL_messageActionNoForwardsRequest) {
                                                final TLRPC.TL_messageActionNoForwardsRequest tL_messageActionNoForwardsRequest2 = (TLRPC.TL_messageActionNoForwardsRequest) messageAction3;
                                                final int i18 = 1;
                                                org.telegram.ui.Components.t4.u0(E3, bd.M0(tL_messageActionNoForwardsRequest2.new_value ? 2131745395 : 2131745384, null), bd.M0(tL_messageActionNoForwardsRequest2.new_value ? 2131745394 : 2131745383, null), bd.M0(2131745401, null), false, new Runnable(this) { // from class: org.telegram.ui.Cells.n0
                                                    public final /* synthetic */ t0 b;

                                                    {
                                                        this.b = this;
                                                    }

                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        switch (i18) {
                                                            case 0:
                                                                t0 t0Var = this.b;
                                                                hp.s1(t0Var.I).d5(zi.B0(t0Var.Q0.k), t0Var.Q0.f1(), tL_messageActionNoForwardsRequest2.prev_value, null);
                                                                break;
                                                            default:
                                                                t0 t0Var2 = this.b;
                                                                hp.s1(t0Var2.I).d5(zi.B0(t0Var2.Q0.k), t0Var2.Q0.f1(), tL_messageActionNoForwardsRequest2.new_value, null);
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
                        T();
                        return false;
                    }
                } else if (motionEvent.getAction() == 3 && (i3 = this.m2) != -1) {
                    c0 c0Var3 = (c0) arrayList.get(i3);
                    y yVar2 = c0Var3.s;
                    if (yVar2 != null) {
                        yVar2.setState(StateSet.NOTHING);
                    }
                    c0Var3.b(false);
                    this.m2 = -1;
                    T();
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

    public final boolean y(float f10, int i3) {
        dh.o0 o0Var = this.F0;
        if (!o0Var.H) {
            return false;
        }
        float y9 = getY() + o0Var.c;
        return y9 > f10 && (y9 + ((float) o0Var.m)) - ((float) org.telegram.messenger.g0.L(16.0f)) < ((float) i3);
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
        int i3 = tL_messageActionGiftCode.months;
        TLRPC.Chat M0 = hp.s1(this.I).M0(Long.valueOf(-org.telegram.messenger.m5.o(tL_messageActionGiftCode.boost_peer)));
        String str = M0 == null ? null : M0.title;
        boolean z10 = tL_messageActionGiftCode.via_giveaway;
        String M02 = tL_messageActionGiftCode.unclaimed ? bd.M0(2131753176, "BoostingUnclaimedPrize") : bd.M0(2131753542, "BoostingCongratulations");
        String G = i3 == 12 ? bd.G(1, "BoldYears", new Object[0]) : bd.G(i3, "BoldMonths", new Object[0]);
        if (!z10) {
            spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.g0.X2(str == null ? bd.M0(2131753310, null) : bd.a0("BoostingReceivedGiftFrom", null, 2131753311, str)));
            spannableStringBuilder.append((CharSequence) "\n\n");
            org.telegram.messenger.k5.q(null, null, 2131753312, new Object[]{G}, spannableStringBuilder);
        } else if (tL_messageActionGiftCode.unclaimed) {
            spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.g0.X2(bd.a0(null, null, 2131753166, str)));
            spannableStringBuilder.append((CharSequence) "\n\n");
            org.telegram.messenger.k5.q(null, null, 2131753175, new Object[]{G}, spannableStringBuilder);
        } else {
            spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.g0.X2(bd.a0(null, null, 2131753307, str)));
            spannableStringBuilder.append((CharSequence) "\n\n");
            org.telegram.messenger.k5.q(null, null, 2131753308, new Object[]{G}, spannableStringBuilder);
        }
        String M03 = bd.M0(2131753309, "BoostingReceivedGiftOpenBtn");
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(M02);
        valueOf.setSpan(new o31(org.telegram.messenger.g0.o()), 0, valueOf.length(), 33);
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
        valueOf2.setSpan(new o31(org.telegram.messenger.g0.o()), 0, valueOf2.length(), 33);
        this.p1 = false;
        this.q1 = 0;
        this.x1 = null;
        StaticLayout staticLayout = new StaticLayout(valueOf2, (TextPaint) O("paintChatActionText"), L, alignment, 1.0f, 0.0f, false);
        this.y1 = staticLayout;
        this.z1 = true;
        this.E1 = Z(staticLayout);
    }

    public t0(Context context, org.telegram.ui.ActionBar.e6 e6Var, boolean z10) {
        super(context);
        this.n = new gc(this);
        int i3 = h10.t0;
        this.I = i3;
        ei.o7 o7Var = new ei.o7(null, false);
        this.e0 = o7Var;
        this.n0 = true;
        this.p0 = new RectF();
        this.q0 = new ArrayList();
        this.r0 = new Stack();
        this.F0 = new dh.o0(this);
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
        this.r1 = new org.telegram.ui.Components.u5(this, 0L, 320L, xq.h);
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
        o7Var.a = false;
        this.s = z10;
        this.h1 = e6Var;
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.J = imageReceiver;
        imageReceiver.J0(org.telegram.messenger.g0.u / 2);
        this.M = new org.telegram.ui.Components.u8((org.telegram.ui.ActionBar.e6) null);
        this.x = org.telegram.messenger.z5.q(i3).k();
        textPaint.setTextSize(TypedValue.applyDimension(1, 16.0f, getResources().getDisplayMetrics()));
        textPaint3.setTextSize(TypedValue.applyDimension(1, 15.0f, getResources().getDisplayMetrics()));
        textPaint2.setTextSize(TypedValue.applyDimension(1, 15.0f, getResources().getDisplayMetrics()));
        View view = new View(context);
        this.U1 = view;
        view.setBackground(org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.r1(0.1f, -16777216), 7, org.telegram.messenger.g0.L(16.0f)));
        view.setVisibility(8);
        addView(view);
        vg.s1 s1Var = new vg.s1(10);
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
    public final void invalidate(int i3, int i10, int i11, int i12) {
        super.invalidate(i3, i10, i11, i12);
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
    public final void i(long j10, long j11) {
    }

    @Override // org.telegram.messenger.x5
    public final void o(long j10, long j11) {
    }
}
