package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.drawable.ShapeDrawable;
import android.os.SystemClock;
import android.text.InputFilter;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.RelativeSizeSpan;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Wallet.WalletEngine2;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class kk extends uh implements org.telegram.messenger.us {
    public float A0;
    public boolean B0;
    public boolean C0;
    public final ShapeDrawable D;
    public boolean D0;
    public final org.telegram.ui.ActionBar.c5 E;
    public float E0;
    public dq F;
    public float F0;
    public String G;
    public float G0;
    public byte[] H;
    public float H0;
    public boolean I;
    public float I0;
    public boolean J;
    public float J0;
    public boolean K;
    public boolean K0;
    public Activity L;
    public boolean L0;
    public int M;
    public boolean M0;
    public final hk N;
    public boolean N0;
    public final LinearLayout O;
    public bi.e O0;
    public final FrameLayout P;
    public TL_wallet.walletTransaction P0;
    public final TextView Q;
    public org.telegram.ui.Wallet.s6 Q0;
    public final org.telegram.ui.Wallet.q9 R;
    public org.telegram.ui.Wallet.fa R0;
    public final EditTextBoldCursor S;
    public boolean S0;
    public final f6 T;
    public org.telegram.ui.ActionBar.x1 T0;
    public final TextView U;
    public boolean U0;
    public final p80 V;
    public DecimalFormat V0;
    public final TextView W;
    public final TextView a0;
    public final SpannableString b0;
    public boolean c0;
    public boolean d0;
    public float e0;
    public ValueAnimator f0;
    public long g0;
    public boolean h0;
    public org.telegram.ui.Wallet.l i0;
    public final FrameLayout j0;
    public final FrameLayout k0;
    public o1.j l0;
    public float m0;
    public final int n;
    public float n0;
    public final vh.d o0;
    public boolean p0;
    public final SpannableString q0;
    public final TLRPC.User r;
    public final SpannableString r0;
    public final FrameLayout s;
    public String s0;
    public boolean t0;
    public boolean u0;
    public int v0;
    public final org.telegram.ui.Wallet.w8 w;
    public DecimalFormat w0;
    public final org.telegram.ui.ActionBar.t0 x;
    public final int[] x0;
    public final org.telegram.ui.ActionBar.t0 y;
    public boolean y0;
    public float z0;

    public kk(bi biVar, Context context, int i10, TLRPC.User user, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context, p6Var, biVar);
        this.g0 = -1L;
        this.m0 = 1.0f;
        this.n0 = 1.0f;
        final int i11 = 1;
        this.t0 = true;
        this.v0 = 6;
        this.x0 = new int[2];
        this.n = i10;
        this.r = user;
        FrameLayout frameLayout = new FrameLayout(context);
        this.s = frameLayout;
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        addView(frameLayout, w7.b6.e(-1, -1, 55));
        org.telegram.ui.ActionBar.t0 a2 = this.b.R2.p().a(31, R.drawable.ic_ab_other);
        this.x = a2;
        a2.setContentDescription(org.telegram.messenger.cd.L0(2131754839, null));
        a2.e(2, R.drawable.msg_addbot, org.telegram.messenger.cd.L0(2131743163, null));
        a2.e(3, R.drawable.menu_comments, org.telegram.messenger.cd.L0(2131743231, null));
        a2.setVisibility(8);
        org.telegram.ui.ActionBar.t0 t0Var = new org.telegram.ui.ActionBar.t0(context, null, 0, org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.G6, this.a), false, p6Var);
        this.y = t0Var;
        t0Var.setIcon(R.drawable.ic_ab_other);
        t0Var.setContentDescription(org.telegram.messenger.cd.L0(2131754839, null));
        int i12 = org.telegram.ui.ActionBar.t6.i6;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.t6.h0(org.telegram.ui.ActionBar.t6.w0(i12, this.a), 1, -1);
        org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i12);
        t0Var.setBackground(h02);
        org.telegram.ui.ActionBar.a7.k(t0Var, h02, null, N, p6Var);
        t0Var.setOnClickListener(new jg.w1(this, p6Var, i10, 8));
        org.telegram.ui.Wallet.w8 w8Var = new org.telegram.ui.Wallet.w8(context, new cd(15, this, user), new cd(16, this, p6Var), p6Var);
        this.w = w8Var;
        w8Var.a(this.G, user);
        addView(w8Var, w7.b6.d(-2, 64.0f, 49, 6.0f, 0.0f, 6.0f, 0.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setClipChildren(false);
        frameLayout2.setClipToPadding(false);
        frameLayout.addView(frameLayout2, w7.b6.e(-1, -1, 55));
        hk hkVar = new hk(context);
        this.N = hkVar;
        hkVar.setOrientation(1);
        hkVar.setClipChildren(false);
        hkVar.setClipToPadding(false);
        final int i13 = 3;
        hkVar.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.zj
            public final /* synthetic */ kk b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i13) {
                    case 0:
                        this.b.c0();
                        break;
                    case 1:
                        this.b.Z();
                        break;
                    case 2:
                        kk.N(this.b);
                        break;
                    case 3:
                        this.b.c0();
                        break;
                    case 4:
                        this.b.c0();
                        break;
                    case 5:
                        this.b.c0();
                        break;
                    default:
                        kk.P(this.b);
                        break;
                }
            }
        });
        frameLayout2.addView(hkVar, w7.b6.e(-1, -2, 17));
        org.telegram.ui.Wallet.q9 q9Var = new org.telegram.ui.Wallet.q9(context, p6Var);
        this.R = q9Var;
        final int i14 = 4;
        q9Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.zj
            public final /* synthetic */ kk b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i14) {
                    case 0:
                        this.b.c0();
                        break;
                    case 1:
                        this.b.Z();
                        break;
                    case 2:
                        kk.N(this.b);
                        break;
                    case 3:
                        this.b.c0();
                        break;
                    case 4:
                        this.b.c0();
                        break;
                    case 5:
                        this.b.c0();
                        break;
                    default:
                        kk.P(this.b);
                        break;
                }
            }
        });
        hkVar.addView(q9Var, w7.b6.t(-1, 64, 49, 16, 0, 16, 0));
        EditTextBoldCursor editText = q9Var.getEditText();
        this.S = editText;
        int i15 = 0;
        editText.setFilters(new InputFilter[]{new ak(i15, this)});
        editText.setImeOptions(33554438);
        editText.setOnTouchListener(new bk(this, i15));
        final int i16 = 5;
        editText.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.zj
            public final /* synthetic */ kk b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i16) {
                    case 0:
                        this.b.c0();
                        break;
                    case 1:
                        this.b.Z();
                        break;
                    case 2:
                        kk.N(this.b);
                        break;
                    case 3:
                        this.b.c0();
                        break;
                    case 4:
                        this.b.c0();
                        break;
                    case 5:
                        this.b.c0();
                        break;
                    default:
                        kk.P(this.b);
                        break;
                }
            }
        });
        editText.setOnEditorActionListener(new t0(this, i11));
        editText.addTextChangedListener(new ik(this));
        SpannableString spannableString = new SpannableString("⇅");
        this.q0 = spannableString;
        dq dqVar = new dq(R.drawable.wallet_currency_exchange, 0);
        dqVar.x = 0.72f;
        spannableString.setSpan(dqVar, 0, spannableString.length(), 33);
        SpannableString spannableString2 = new SpannableString("G");
        this.r0 = spannableString2;
        dq dqVar2 = new dq(R.drawable.wallet_gram_small, 0);
        dqVar2.d = false;
        spannableString2.setSpan(dqVar2, 0, spannableString2.length(), 33);
        f6 f6Var = new f6(context, false, true, true, true, true);
        this.T = f6Var;
        f6Var.c.m(0.35f, 320L, 3.5f, gr.h);
        f6Var.setScaleProperty(0.35f);
        f6Var.setText(U(org.telegram.ui.Wallet.k0.x(i10), 0L));
        int i17 = org.telegram.ui.ActionBar.t6.d6;
        int i18 = org.telegram.ui.ActionBar.t6.z6;
        org.telegram.ui.ActionBar.w6 q6 = org.telegram.ui.ActionBar.a7.q(i17, i18);
        org.telegram.ui.ActionBar.a7.n(f6Var, q6.a, q6.b, 4, 0.0f, p6Var);
        f6Var.setTextSize(org.telegram.messenger.i0.L(14.0f));
        f6Var.setTypeface(org.telegram.messenger.i0.o1("fonts/gram.ttf"));
        f6Var.setGravity(17);
        f6Var.setPadding(org.telegram.messenger.i0.L(10.0f), 0, org.telegram.messenger.i0.L(10.0f), 0);
        f6Var.setAllowCancel(true);
        ShapeDrawable d02 = org.telegram.ui.ActionBar.t6.d0(org.telegram.messenger.i0.L(14.0f), org.telegram.ui.ActionBar.t6.r1(0.08f, org.telegram.ui.ActionBar.t6.w0(i18, this.a)));
        this.D = d02;
        f6Var.setSizeableBackground(d02);
        hkVar.addView(f6Var, w7.b6.t(-2, 28, 49, 0, 8, 0, 0));
        w7.e6.a(f6Var);
        final int i19 = 6;
        f6Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.zj
            public final /* synthetic */ kk b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i19) {
                    case 0:
                        this.b.c0();
                        break;
                    case 1:
                        this.b.Z();
                        break;
                    case 2:
                        kk.N(this.b);
                        break;
                    case 3:
                        this.b.c0();
                        break;
                    case 4:
                        this.b.c0();
                        break;
                    case 5:
                        this.b.c0();
                        break;
                    default:
                        kk.P(this.b);
                        break;
                }
            }
        });
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.P = frameLayout3;
        hkVar.addView(frameLayout3, w7.b6.r(-2, -2, 49));
        LinearLayout linearLayout = new LinearLayout(context);
        this.O = linearLayout;
        linearLayout.setOrientation(1);
        frameLayout3.addView(linearLayout, w7.b6.e(-2, -2, 49));
        TextView textView = new TextView(context);
        this.Q = textView;
        textView.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.a7.V(textView, i18, p6Var);
        textView.setPadding(org.telegram.messenger.i0.L(10.0f), 0, org.telegram.messenger.i0.L(10.0f), 0);
        org.telegram.messenger.m5.l(textView, 17, null, 2131743033);
        frameLayout3.addView(textView, w7.b6.d(-2, 28.0f, 49, 0.0f, 8.0f, 0.0f, 0.0f));
        w7.e6.a(textView);
        final int i20 = 0;
        textView.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.zj
            public final /* synthetic */ kk b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i20) {
                    case 0:
                        this.b.c0();
                        break;
                    case 1:
                        this.b.Z();
                        break;
                    case 2:
                        kk.N(this.b);
                        break;
                    case 3:
                        this.b.c0();
                        break;
                    case 4:
                        this.b.c0();
                        break;
                    case 5:
                        this.b.c0();
                        break;
                    default:
                        kk.P(this.b);
                        break;
                }
            }
        });
        linearLayout.setVisibility(4);
        linearLayout.setAlpha(0.0f);
        linearLayout.setScaleX(0.8f);
        linearLayout.setScaleY(0.8f);
        textView.setVisibility(0);
        textView.setAlpha(1.0f);
        textView.setScaleX(1.0f);
        textView.setScaleY(1.0f);
        this.U0 = false;
        TextView textView2 = new TextView(context);
        this.U = textView2;
        org.telegram.ui.ActionBar.c5 c5Var = new org.telegram.ui.ActionBar.c5(0, true, false, null);
        this.E = c5Var;
        c5Var.x = false;
        Paint.Style style = Paint.Style.STROKE;
        Paint paint = c5Var.c;
        paint.setStyle(style);
        paint.setStrokeWidth(Math.max(1.0f, org.telegram.messenger.i0.N(0.5f)));
        int i21 = org.telegram.ui.ActionBar.t6.Yl;
        paint.setColor(org.telegram.ui.ActionBar.t6.w0(i21, this.a));
        c5Var.w = Integer.valueOf(org.telegram.ui.ActionBar.t6.w0(i21, this.a));
        textView2.setPadding(org.telegram.messenger.i0.L(15.0f), org.telegram.messenger.i0.L(7.0f), org.telegram.messenger.i0.L(19.0f), org.telegram.messenger.i0.L(8.0f));
        textView2.setBackground(c5Var);
        textView2.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.a7.V(textView2, i18, p6Var);
        textView2.setTypeface(org.telegram.messenger.i0.o());
        textView2.setVisibility(8);
        textView2.setEllipsize(TextUtils.TruncateAt.END);
        textView2.setMaxLines(4);
        linearLayout.addView(textView2, w7.b6.t(-2, -2, 49, 32, 12, 32, 0));
        textView2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.zj
            public final /* synthetic */ kk b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        this.b.c0();
                        break;
                    case 1:
                        this.b.Z();
                        break;
                    case 2:
                        kk.N(this.b);
                        break;
                    case 3:
                        this.b.c0();
                        break;
                    case 4:
                        this.b.c0();
                        break;
                    case 5:
                        this.b.c0();
                        break;
                    default:
                        kk.P(this.b);
                        break;
                }
            }
        });
        w7.e6.b(textView2, 0.02f, 1.2f);
        p80 p80Var = new p80(context, p6Var);
        this.V = p80Var;
        org.telegram.ui.ActionBar.a7.V(p80Var, org.telegram.ui.ActionBar.t6.q7, p6Var);
        org.telegram.ui.ActionBar.a7.H(p80Var, org.telegram.ui.ActionBar.t6.Ci, p6Var);
        p80Var.setTextSize(1, 14.0f);
        p80Var.setGravity(17);
        p80Var.setTypeface(org.telegram.messenger.i0.o());
        p80Var.setPadding(org.telegram.messenger.i0.L(10.0f), 0, org.telegram.messenger.i0.L(10.0f), 0);
        e0(false);
        linearLayout.addView(p80Var, w7.b6.t(-2, -2, 49, 0, 10, 0, 0));
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.j0 = frameLayout4;
        frameLayout4.setPadding(org.telegram.messenger.i0.L(16.0f), 0, org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(12.0f));
        FrameLayout frameLayout5 = new FrameLayout(context);
        this.k0 = frameLayout5;
        frameLayout4.setClipChildren(false);
        frameLayout4.setClipToPadding(false);
        frameLayout5.setClipChildren(false);
        frameLayout5.setClipToPadding(false);
        frameLayout4.addView(frameLayout5, w7.b6.c(-1.0f, -1));
        TextView textView3 = new TextView(context);
        this.W = textView3;
        org.telegram.ui.ActionBar.a7.V(textView3, i18, p6Var);
        textView3.setTextSize(1, 14.0f);
        textView3.setGravity(17);
        frameLayout5.addView(textView3, w7.b6.e(-1, 20, 55));
        TextView textView4 = new TextView(context);
        this.a0 = textView4;
        org.telegram.ui.ActionBar.a7.V(textView4, i18, p6Var);
        textView4.setTextSize(1, 14.0f);
        textView4.setGravity(17);
        textView4.setPadding(0, org.telegram.messenger.i0.L(4.0f), 0, org.telegram.messenger.i0.L(4.0f));
        textView4.setVisibility(8);
        frameLayout5.addView(textView4, w7.b6.d(-1, -2.0f, 55, 0.0f, 24.0f, 0.0f, 0.0f));
        SpannableString spannableString3 = new SpannableString(org.telegram.messenger.cd.L0(2131748789, null));
        this.b0 = spannableString3;
        spannableString3.setSpan(new u80(org.telegram.messenger.i0.L(80.0f), textView4), 0, spannableString3.length(), 33);
        vh.d i22 = org.telegram.messenger.z20.i(24, context, p6Var, true);
        this.o0 = i22;
        i22.setText(org.telegram.messenger.cd.L0(2131743046, null));
        i22.setEnabled(false);
        final int i23 = 2;
        i22.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.zj
            public final /* synthetic */ kk b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i23) {
                    case 0:
                        this.b.c0();
                        break;
                    case 1:
                        this.b.Z();
                        break;
                    case 2:
                        kk.N(this.b);
                        break;
                    case 3:
                        this.b.c0();
                        break;
                    case 4:
                        this.b.c0();
                        break;
                    case 5:
                        this.b.c0();
                        break;
                    default:
                        kk.P(this.b);
                        break;
                }
            }
        });
        frameLayout5.addView(i22, w7.b6.e(-1, 48, 87));
        frameLayout.addView(frameLayout4, w7.b6.d(-1, 92.0f, 87, 0.0f, 0.0f, 0.0f, 70.0f));
        m0(false, false);
        org.telegram.messenger.zs.f(i10).c(this, org.telegram.messenger.zs.a4);
        h0();
        this.I = true;
        org.telegram.ui.Wallet.k0.x(i10).a0(user, new dk(this, 0));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15, types: [org.telegram.tgnet.tl.TL_wallet$walletTransaction] */
    /* JADX WARN: Type inference failed for: r4v16 */
    public static void N(final kk kkVar) {
        ?? r42;
        EditTextBoldCursor editTextBoldCursor = kkVar.S;
        int i10 = kkVar.n;
        vh.d dVar = kkVar.o0;
        if (!dVar.c0 || dVar.Q) {
            return;
        }
        org.telegram.ui.Wallet.k0 x10 = org.telegram.ui.Wallet.k0.x(i10);
        long gramNanoAmount = kkVar.getGramNanoAmount();
        long v = x10.v();
        if (!WalletEngine2.isValidAddress(kkVar.G) || gramNanoAmount <= 0) {
            return;
        }
        long j10 = org.telegram.messenger.vp.r1(i10).y7.l0.a.c;
        if (gramNanoAmount < j10) {
            String S = kkVar.u0 ? kkVar.S(j10, kkVar.getCurrencyPerGram()) : V(j10);
            editTextBoldCursor.setText(S);
            editTextBoldCursor.setSelection(S.length());
            int i11 = -kkVar.v0;
            kkVar.v0 = i11;
            org.telegram.messenger.i0.F3(i11, editTextBoldCursor, null);
            return;
        }
        if (gramNanoAmount > v) {
            org.telegram.messenger.t2.D.a();
            p80 p80Var = kkVar.V;
            int i12 = -kkVar.v0;
            kkVar.v0 = i12;
            org.telegram.messenger.i0.F3(i12, p80Var, null);
            return;
        }
        org.telegram.messenger.vp r12 = org.telegram.messenger.vp.r1(i10);
        long M1 = r12.M1(kkVar.r.id);
        org.telegram.messenger.s0 s0Var = r12.y7;
        kkVar.S0 = ((org.telegram.messenger.j0) s0Var.k0.b).c && M1 > 0 && (((double) gramNanoAmount) / 1.0E9d) * ((org.telegram.messenger.k0) s0Var.l.b).a < (((double) M1) / 1000.0d) * ((double) r12.d6);
        dVar.setLoading(true);
        kkVar.N0 = true;
        kkVar.M0 = false;
        bi.e eVar = kkVar.O0;
        if (eVar != null) {
            kkVar.removeCallbacks(eVar);
            r42 = 0;
            kkVar.O0 = null;
        } else {
            r42 = 0;
        }
        kkVar.P0 = r42;
        TLRPC.User user = kkVar.r;
        String str = kkVar.G;
        String str2 = kkVar.s0;
        byte[] publicKey = kkVar.t0 ? kkVar.getPublicKey() : r42;
        final int i13 = 0;
        org.telegram.messenger.q20 q20Var = new org.telegram.messenger.q20(kkVar) { // from class: org.telegram.ui.Components.fk
            public final /* synthetic */ kk b;

            {
                this.b = kkVar;
            }

            @Override // org.telegram.messenger.q20
            public final void a(Object obj) {
                switch (i13) {
                    case 0:
                        String str3 = (String) obj;
                        kk kkVar2 = this.b;
                        vh.d dVar2 = kkVar2.o0;
                        bi biVar = kkVar2.b;
                        if (!kkVar2.K && !biVar.I) {
                            if (!"PASSCODE_FAILED".equalsIgnoreCase(str3)) {
                                if (!TextUtils.isEmpty(str3)) {
                                    dVar2.setLoading(false);
                                    kkVar2.N0 = false;
                                    cc.X().e0(str3, false);
                                    break;
                                } else {
                                    biVar.dismiss();
                                    break;
                                }
                            } else {
                                dVar2.setLoading(false);
                                kkVar2.N0 = false;
                                break;
                            }
                        }
                        break;
                    default:
                        this.b.P0 = (TL_wallet.walletTransaction) obj;
                        break;
                }
            }
        };
        final int i14 = 1;
        x10.d0(user, str, gramNanoAmount, str2, publicKey, null, null, q20Var, new org.telegram.messenger.q20(kkVar) { // from class: org.telegram.ui.Components.fk
            public final /* synthetic */ kk b;

            {
                this.b = kkVar;
            }

            @Override // org.telegram.messenger.q20
            public final void a(Object obj) {
                switch (i14) {
                    case 0:
                        String str3 = (String) obj;
                        kk kkVar2 = this.b;
                        vh.d dVar2 = kkVar2.o0;
                        bi biVar = kkVar2.b;
                        if (!kkVar2.K && !biVar.I) {
                            if (!"PASSCODE_FAILED".equalsIgnoreCase(str3)) {
                                if (!TextUtils.isEmpty(str3)) {
                                    dVar2.setLoading(false);
                                    kkVar2.N0 = false;
                                    cc.X().e0(str3, false);
                                    break;
                                } else {
                                    biVar.dismiss();
                                    break;
                                }
                            } else {
                                dVar2.setLoading(false);
                                kkVar2.N0 = false;
                                break;
                            }
                        }
                        break;
                    default:
                        this.b.P0 = (TL_wallet.walletTransaction) obj;
                        break;
                }
            }
        }, null);
    }

    public static void P(kk kkVar) {
        EditTextBoldCursor editTextBoldCursor = kkVar.S;
        BigDecimal currencyPerGram = kkVar.getCurrencyPerGram();
        if (kkVar.u0 || currencyPerGram.signum() > 0) {
            long gramNanoAmount = kkVar.getGramNanoAmount();
            kkVar.u0 = !kkVar.u0;
            kkVar.R.d(org.telegram.ui.Wallet.k0.x(kkVar.n), kkVar.u0);
            String S = gramNanoAmount <= 0 ? "" : kkVar.u0 ? kkVar.S(gramNanoAmount, currencyPerGram) : V(gramNanoAmount);
            editTextBoldCursor.setText(S);
            editTextBoldCursor.setSelection(S.length());
        }
    }

    public static /* synthetic */ CharSequence Q(kk kkVar, CharSequence charSequence, int i10, int i11, Spanned spanned, int i12, int i13) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(spanned.subSequence(0, i12).toString());
        sb2.append((Object) charSequence.subSequence(i10, i11));
        sb2.append((Object) spanned.subSequence(i13, spanned.length()));
        String sb3 = sb2.toString();
        int i14 = 9;
        BigDecimal valueOf = BigDecimal.valueOf(Long.MAX_VALUE, 9);
        if (kkVar.u0) {
            BigDecimal currencyPerGram = kkVar.getCurrencyPerGram();
            valueOf = valueOf.multiply(currencyPerGram);
            i14 = T(currencyPerGram);
        }
        int max = Math.max(sb3.indexOf(46), sb3.indexOf(44));
        if (max >= 0 && (sb3.length() - max) - 1 > i14) {
            return spanned.subSequence(i12, i13);
        }
        if (a0(sb3).compareTo(valueOf) > 0) {
            return spanned.subSequence(i12, i13);
        }
        if (i10 == i11) {
            return null;
        }
        boolean z10 = false;
        for (int i15 = 0; i15 < sb3.length(); i15++) {
            char charAt = sb3.charAt(i15);
            if (charAt == '.' || charAt == ',') {
                if (z10) {
                    return spanned.subSequence(i12, i13);
                }
                z10 = true;
            }
        }
        if (i12 == 0 && (sb3.startsWith(".") || sb3.startsWith(","))) {
            return "0" + ((Object) charSequence.subSequence(i10, i11));
        }
        if (sb3.startsWith("00")) {
            return spanned.subSequence(i12, i13);
        }
        return null;
    }

    public static int T(BigDecimal bigDecimal) {
        if (bigDecimal.signum() <= 0) {
            return 9;
        }
        BigDecimal movePointLeft = bigDecimal.movePointLeft(9);
        int i10 = 0;
        for (BigDecimal movePointLeft2 = BigDecimal.ONE.movePointLeft(1); movePointLeft2.compareTo(movePointLeft) >= 0; movePointLeft2 = movePointLeft2.movePointLeft(1)) {
            i10++;
        }
        return i10;
    }

    public static String V(long j10) {
        BigDecimal scale = BigDecimal.valueOf(j10).movePointLeft(9).setScale(2, RoundingMode.HALF_UP);
        return (scale.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : scale.stripTrailingZeros()).toPlainString();
    }

    public static BigDecimal a0(String str) {
        if (TextUtils.isEmpty(str)) {
            return BigDecimal.ZERO;
        }
        try {
            BigDecimal bigDecimal = new BigDecimal(str.replace(',', '.'));
            return bigDecimal.signum() < 0 ? BigDecimal.ZERO : bigDecimal;
        } catch (NumberFormatException unused) {
            return BigDecimal.ZERO;
        }
    }

    public static void d0(SpannableStringBuilder spannableStringBuilder, int i10, int i11, char c10) {
        int i12 = i10 + 1;
        while (true) {
            int i13 = i12 + 1;
            if (i13 >= i11) {
                return;
            }
            if (spannableStringBuilder.charAt(i12) == c10 && Character.isDigit(spannableStringBuilder.charAt(i12 - 1)) && Character.isDigit(spannableStringBuilder.charAt(i13))) {
                int i14 = i13;
                while (i14 < i11 && Character.isDigit(spannableStringBuilder.charAt(i14))) {
                    i14++;
                }
                spannableStringBuilder.setSpan(new RelativeSizeSpan(0.85714287f), i13, i14, 33);
                return;
            }
            i12 = i13;
        }
    }

    private float getBottomYOnScreen() {
        return W(this.j0);
    }

    private char getCurrencyDecimalSeparator() {
        TL_wallet.currencyRate selectedCurrencyRate = getSelectedCurrencyRate();
        if (selectedCurrencyRate == null || TextUtils.isEmpty(selectedCurrencyRate.decimalSeparator)) {
            return '.';
        }
        return selectedCurrencyRate.decimalSeparator.charAt(0);
    }

    private int getCurrencyFractionDigits() {
        TL_wallet.currencyRate selectedCurrencyRate = getSelectedCurrencyRate();
        return selectedCurrencyRate != null ? selectedCurrencyRate.exp : TextUtils.equals(org.telegram.ui.Wallet.k0.x(this.n).h.g(), "USD") ? 2 : 0;
    }

    private BigDecimal getCurrencyPerGram() {
        int i10 = this.n;
        org.telegram.ui.Wallet.f fVar = org.telegram.ui.Wallet.k0.x(i10).h;
        fVar.f();
        double h = fVar.h();
        double d = ((org.telegram.messenger.k0) org.telegram.messenger.vp.r1(i10).y7.l.b).a;
        return (h <= 0.0d || d <= 0.0d || Double.isNaN(h) || Double.isInfinite(h) || Double.isNaN(d) || Double.isInfinite(d)) ? BigDecimal.ZERO : BigDecimal.valueOf(h).multiply(BigDecimal.valueOf(d));
    }

    private long getGramNanoAmount() {
        BigDecimal a02 = a0(this.S.getText().toString());
        if (this.u0) {
            BigDecimal currencyPerGram = getCurrencyPerGram();
            if (currencyPerGram.signum() <= 0) {
                return 0L;
            }
            a02 = a02.divide(currencyPerGram, 9, RoundingMode.DOWN).setScale(2, RoundingMode.HALF_UP);
        }
        BigInteger bigInteger = a02.movePointRight(9).toBigInteger();
        if (bigInteger.compareTo(BigInteger.valueOf(Long.MAX_VALUE)) > 0) {
            return Long.MAX_VALUE;
        }
        return bigInteger.longValue();
    }

    private String getGramsText() {
        long gramNanoAmount = getGramNanoAmount();
        if (this.V0 == null) {
            this.V0 = new DecimalFormat("#,##0.#########", new DecimalFormatSymbols(Locale.US));
        }
        return gramNanoAmount > 0 ? this.V0.format(BigDecimal.valueOf(gramNanoAmount, 9)) : "";
    }

    private TL_wallet.currencyRate getSelectedCurrencyRate() {
        org.telegram.ui.Wallet.f fVar = org.telegram.ui.Wallet.k0.x(this.n).h;
        TL_wallet.currencyRates f7 = fVar.f();
        if (f7 == null) {
            return null;
        }
        ArrayList<TL_wallet.currencyRate> arrayList = f7.rates;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            TL_wallet.currencyRate currencyrate = arrayList.get(i10);
            i10++;
            TL_wallet.currencyRate currencyrate2 = currencyrate;
            if (currencyrate2 != null && TextUtils.equals(currencyrate2.currency, fVar.g())) {
                return currencyrate2;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFeeVisibilityProgress(float f7) {
        this.e0 = f7;
        TextView textView = this.a0;
        textView.setAlpha(f7);
        textView.setVisibility(f7 > 0.0f ? 0 : 8);
        requestLayout();
    }

    @Override // org.telegram.ui.Components.uh
    public final void A() {
        R();
        f0();
    }

    @Override // org.telegram.ui.Components.uh
    public final void B(int i10, int i11) {
        int i12;
        bi biVar = this.b;
        boolean z10 = biVar.l3.Q() > org.telegram.messenger.i0.L(20.0f);
        this.y0 = z10;
        this.f = z10;
        int L = z10 ? 0 : org.telegram.messenger.i0.L(70.0f);
        int round = Math.round(org.telegram.messenger.i0.L(32.0f) * this.e0) + org.telegram.messenger.i0.L(92.0f);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.j0.getLayoutParams();
        layoutParams.height = round;
        layoutParams.bottomMargin = L;
        if (this.y0) {
            i12 = org.telegram.messenger.i0.L(56.0f);
            biVar.q0 = false;
        } else {
            if (!org.telegram.messenger.i0.Q1()) {
                Point point = org.telegram.messenger.i0.q;
                if (point.x > point.y) {
                    i12 = (int) (i11 / 3.5f);
                    biVar.q0 = true;
                }
            }
            i12 = (i11 / 5) * 2;
            biVar.q0 = true;
        }
        int d = i0.a.d(1.0f, i12, 0) + org.telegram.messenger.i0.m;
        FrameLayout frameLayout = this.s;
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
        if (layoutParams2.topMargin != d) {
            layoutParams2.topMargin = d;
            frameLayout.setLayoutParams(layoutParams2);
        }
        int b10 = org.telegram.messenger.m5.b(4.0f, d - org.telegram.messenger.i0.m, 0);
        org.telegram.ui.Wallet.w8 w8Var = this.w;
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) w8Var.getLayoutParams();
        int max = Math.max(0, this.y0 ? org.telegram.messenger.i0.L(4.0f) + org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() : b10 - org.telegram.messenger.i0.L(4.0f));
        if (layoutParams3.topMargin != max) {
            layoutParams3.topMargin = max;
            w8Var.setLayoutParams(layoutParams3);
        }
        i0();
    }

    @Override // org.telegram.ui.Components.uh
    public final void G(uh uhVar) {
        Activity W;
        R();
        if (this.L == null && !org.telegram.messenger.i0.Q1()) {
            Point point = org.telegram.messenger.i0.q;
            if (Math.min(point.x, point.y) < org.telegram.messenger.i0.L(700.0f) && (W = org.telegram.messenger.i0.W(getContext())) != null) {
                try {
                    this.M = W.getRequestedOrientation();
                    W.setRequestedOrientation(1);
                    this.L = W;
                } catch (Exception e) {
                    org.telegram.messenger.f8.g(e, true);
                }
            }
        }
        this.L0 = false;
        this.N0 = false;
        EditTextBoldCursor editTextBoldCursor = this.S;
        editTextBoldCursor.setFocusableInTouchMode(true);
        editTextBoldCursor.setShowSoftInputOnFocus(true);
        this.M0 = false;
        this.B0 = false;
        this.K0 = false;
        this.N.setTranslationY(0.0f);
        this.j0.setTranslationY(0.0f);
        org.telegram.ui.Wallet.w8 w8Var = this.w;
        w8Var.setTranslationY(0.0f);
        w8Var.setAlpha(1.0f);
        this.D0 = false;
        bi biVar = this.b;
        biVar.R2.setTitle(org.telegram.messenger.cd.L0(2131743042, null));
        biVar.R2.setDrawGlassTitle(false);
        this.x.setVisibility(0);
        editTextBoldCursor.clearFocus();
        Y();
        org.telegram.ui.Wallet.q9 q9Var = this.R;
        float f7 = q9Var.getDiamondView().f == null ? 1.0f : 0.0f;
        this.n0 = f7;
        this.m0 = f7;
        k0();
        if (this.m0 < 1.0f) {
            q9Var.getDiamondView().l(new ek(this, 3));
        }
    }

    @Override // org.telegram.ui.Components.uh
    public final void H() {
        this.L0 = true;
        post(new ek(this, 4));
    }

    @Override // org.telegram.ui.Components.uh
    public final boolean M() {
        return !this.N0;
    }

    public final void R() {
        this.R.getDiamondView().l(null);
        o1.j jVar = this.l0;
        if (jVar != null) {
            jVar.d();
        }
        this.m0 = 1.0f;
        k0();
    }

    public final String S(long j10, BigDecimal bigDecimal) {
        BigDecimal movePointLeft = BigDecimal.valueOf(j10).multiply(bigDecimal).movePointLeft(9);
        int max = Math.max(0, Math.min(getCurrencyFractionDigits(), 20));
        RoundingMode roundingMode = RoundingMode.HALF_UP;
        BigDecimal scale = movePointLeft.setScale(max, roundingMode);
        if (scale.signum() == 0 && movePointLeft.signum() != 0) {
            scale = movePointLeft.setScale(Math.min(20, Math.max(max, movePointLeft.scale())), roundingMode);
        }
        int T = T(bigDecimal);
        if (scale.scale() > T) {
            scale = scale.setScale(T, RoundingMode.DOWN);
        }
        BigDecimal multiply = BigDecimal.valueOf(Long.MAX_VALUE, 9).multiply(bigDecimal);
        if (scale.compareTo(multiply) > 0) {
            scale = multiply.setScale(scale.scale(), RoundingMode.DOWN);
        }
        return (scale.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : scale.stripTrailingZeros()).toPlainString();
    }

    public final SpannableStringBuilder U(org.telegram.ui.Wallet.k0 k0Var, long j10) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("≈ ");
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append(k0Var.m(j10, false));
        d0(spannableStringBuilder, length, spannableStringBuilder.length(), getCurrencyDecimalSeparator());
        return spannableStringBuilder.append((CharSequence) " ").append((CharSequence) this.q0);
    }

    public final float W(View view) {
        float f7 = 0.0f;
        while (view.getParent() instanceof View) {
            View view2 = (View) view.getParent();
            f7 += view.getY() - view2.getScrollY();
            view = view2;
        }
        view.getLocationOnScreen(this.x0);
        return ((f7 + r1[1]) + this.z0) - this.b.p2;
    }

    public final float X(View view) {
        if (view.getVisibility() != 0 || view.getAlpha() <= 0.0f) {
            return Float.POSITIVE_INFINITY;
        }
        return ((1.0f - view.getScaleY()) * view.getPivotY()) + (W(view) - this.k0.getTranslationY());
    }

    public final void Y() {
        if (this.K || TextUtils.isEmpty(this.G)) {
            return;
        }
        org.telegram.ui.Wallet.l lVar = this.i0;
        if (lVar != null) {
            lVar.run();
            this.i0 = null;
        }
        this.g0 = -1L;
        h0();
        org.telegram.ui.Wallet.k0 x10 = org.telegram.ui.Wallet.k0.x(this.n);
        if (this.h0) {
            this.i0 = x10.i(this.G, Math.max(100000000L, getGramNanoAmount()), this.s0, this.t0 ? getPublicKey() : null, new dk(this, 1));
        }
    }

    public final void Z() {
        if (this.K || this.N0 || this.O0 != null || this.T0 != null) {
            return;
        }
        c0();
        bi.e eVar = new bi.e(this, SystemClock.uptimeMillis() + 1500, 11);
        this.O0 = eVar;
        post(eVar);
    }

    public final void b0() {
        if (!this.L0 || this.B0 || this.K0 || !isAttachedToWindow() || Math.abs(getTranslationY()) >= 0.5f || this.N.getHeight() <= 0 || this.j0.getHeight() <= 0) {
            return;
        }
        this.E0 = getBottomYOnScreen();
        this.F0 = W(this.w);
        this.D0 = true;
    }

    public final void c0() {
        if (this.K || this.N0) {
            return;
        }
        bi biVar = this.b;
        if (biVar.I) {
            return;
        }
        if (!this.L0) {
            this.M0 = true;
            return;
        }
        this.M0 = false;
        EditTextBoldCursor editTextBoldCursor = this.S;
        editTextBoldCursor.setFocusableInTouchMode(true);
        editTextBoldCursor.setShowSoftInputOnFocus(true);
        biVar.g1(editTextBoldCursor, true);
        editTextBoldCursor.requestFocus();
        org.telegram.messenger.i0.J3(editTextBoldCursor);
        editTextBoldCursor.postDelayed(new ek(this, 1), 220L);
    }

    @Override // org.telegram.ui.Components.uh
    public final void d() {
        try {
            org.telegram.ui.ActionBar.t0 t0Var = this.y;
            org.telegram.ui.ActionBar.p6 p6Var = this.a;
            if (t0Var != null) {
                t0Var.setIconColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.G6, p6Var));
            }
            ShapeDrawable shapeDrawable = this.D;
            if (shapeDrawable != null) {
                org.telegram.ui.ActionBar.t6.C1(org.telegram.ui.ActionBar.t6.r1(0.08f, org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.z6, p6Var)), shapeDrawable);
                f6 f6Var = this.T;
                if (f6Var != null) {
                    f6Var.invalidate();
                }
            }
            org.telegram.ui.ActionBar.c5 c5Var = this.E;
            if (c5Var != null) {
                int w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Yl, p6Var);
                c5Var.c.setColor(w02);
                c5Var.w = Integer.valueOf(w02);
                TextView textView = this.U;
                if (textView != null) {
                    textView.invalidate();
                }
            }
            dq dqVar = this.F;
            if (dqVar != null) {
                dqVar.y = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Ci, p6Var);
                p80 p80Var = this.V;
                if (p80Var != null) {
                    p80Var.invalidate();
                }
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override // org.telegram.messenger.us
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == org.telegram.messenger.zs.a4) {
            boolean z10 = this.h0;
            g0();
            if (z10 != this.h0) {
                Y();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        this.b.R2.getAlpha();
        j0();
        if (this.l0 != null || this.m0 < 1.0f) {
            k0();
        }
        super.dispatchDraw(canvas);
        b0();
    }

    public final void e0(boolean z10) {
        p80 p80Var = this.V;
        if (z10) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) org.telegram.messenger.cd.L0(2131743110, null));
            spannableStringBuilder.append((CharSequence) " ");
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) org.telegram.messenger.cd.L0(2131743163, null));
            spannableStringBuilder.append((CharSequence) " >");
            dq dqVar = new dq(R.drawable.settings_arrow, 0);
            dqVar.y = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Ci, this.a);
            float N = org.telegram.messenger.i0.N(0.66f);
            dqVar.r = 0.0f;
            dqVar.s = N;
            this.F = dqVar;
            spannableStringBuilder.setSpan(dqVar, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
            spannableStringBuilder.setSpan(new dh.a(this, 7), length, spannableStringBuilder.length(), 33);
            p80Var.setText(spannableStringBuilder);
        }
        p80Var.animate().alpha(z10 ? 1.0f : 0.0f).scaleX(z10 ? 1.0f : 0.6f).scaleY(z10 ? 1.0f : 0.6f).setDuration(320L).setInterpolator(gr.h).start();
    }

    public final void f0() {
        if (!this.N0 || this.K) {
            return;
        }
        this.M0 = false;
        EditTextBoldCursor editTextBoldCursor = this.S;
        editTextBoldCursor.setShowSoftInputOnFocus(false);
        editTextBoldCursor.setFocusable(false);
        editTextBoldCursor.clearFocus();
        setFocusableInTouchMode(true);
        requestFocus();
    }

    public final void g0() {
        SpannableStringBuilder U;
        i0();
        int i10 = this.n;
        org.telegram.ui.Wallet.k0 x10 = org.telegram.ui.Wallet.k0.x(i10);
        long v = x10.v();
        long gramNanoAmount = getGramNanoAmount();
        long j10 = org.telegram.messenger.vp.r1(i10).y7.l0.a.c;
        EditTextBoldCursor editTextBoldCursor = this.S;
        if (gramNanoAmount > 0 && gramNanoAmount < j10) {
            String S = this.u0 ? S(j10, getCurrencyPerGram()) : V(j10);
            editTextBoldCursor.setText(S);
            editTextBoldCursor.setSelection(S.length());
            int i11 = -this.v0;
            this.v0 = i11;
            org.telegram.messenger.i0.F3(i11, editTextBoldCursor, null);
            return;
        }
        boolean z10 = false;
        boolean z11 = WalletEngine2.isValidAddress(this.G) && gramNanoAmount <= v;
        e0(!TextUtils.isEmpty(editTextBoldCursor.getText()) && gramNanoAmount > v);
        String gramsText = getGramsText();
        boolean z12 = this.G == null && this.I;
        vh.d dVar = this.o0;
        dVar.setLoading(z12);
        dVar.i(TextUtils.isEmpty(gramsText) ? org.telegram.messenger.cd.L0(2131743046, null) : org.telegram.messenger.cd.V(null, null, 2131743047, org.telegram.ui.Wallet.k0.l("Grams", gramsText, 2131749516)), true, true);
        boolean isEmpty = TextUtils.isEmpty(editTextBoldCursor.getText());
        boolean z13 = !isEmpty;
        if (!isEmpty && z11 && !this.J) {
            z10 = true;
        }
        dVar.setEnabled(z10);
        m0(z13, this.L0);
        h0();
        this.R.d(org.telegram.ui.Wallet.k0.x(i10), this.u0);
        if (this.u0) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) this.r0).append((CharSequence) " ");
            int length = spannableStringBuilder.length();
            if (this.w0 == null) {
                DecimalFormat decimalFormat = new DecimalFormat("#,##0.##", new DecimalFormatSymbols(Locale.US));
                this.w0 = decimalFormat;
                decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
            }
            spannableStringBuilder.append((CharSequence) this.w0.format(BigDecimal.valueOf(gramNanoAmount).movePointLeft(9)));
            d0(spannableStringBuilder, length, spannableStringBuilder.length(), '.');
            spannableStringBuilder.append((CharSequence) " ");
            int length2 = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) org.telegram.messenger.cd.L0(2131749525, null));
            spannableStringBuilder.setSpan(new RelativeSizeSpan(0.85714287f), length2, spannableStringBuilder.length(), 33);
            U = spannableStringBuilder.append((CharSequence) " ").append((CharSequence) this.q0);
        } else {
            U = U(x10, gramNanoAmount);
        }
        this.T.setText(U);
    }

    @Override // org.telegram.ui.Components.uh
    public int getButtonsHideOffset() {
        return org.telegram.messenger.i0.L(62.0f);
    }

    @Override // org.telegram.ui.Components.uh
    public int getCurrentItemTop() {
        int top = this.s.getTop();
        if (top <= 0) {
            top = getListTopPadding();
        }
        return org.telegram.messenger.i0.L(13.0f) + Math.max(0, top - (org.telegram.messenger.i0.L(12.0f) + org.telegram.messenger.i0.m));
    }

    @Override // org.telegram.ui.Components.uh
    public int getCustomBackground() {
        return org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.d6, this.a);
    }

    @Override // org.telegram.ui.Components.uh
    public int getFirstOffset() {
        return org.telegram.messenger.i0.L(5.0f) + getListTopPadding();
    }

    @Override // org.telegram.ui.Components.uh
    public int getListTopPadding() {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.s.getLayoutParams();
        if (layoutParams == null) {
            return 0;
        }
        return layoutParams.topMargin;
    }

    public byte[] getPublicKey() {
        if (this.H == null) {
            return null;
        }
        int i10 = 0;
        while (true) {
            byte[] bArr = this.H;
            if (i10 >= bArr.length) {
                return null;
            }
            if (bArr[i10] != 0) {
                return bArr;
            }
            i10++;
        }
    }

    public final void h0() {
        int i10 = this.n;
        org.telegram.ui.Wallet.k0 x10 = org.telegram.ui.Wallet.k0.x(i10);
        this.W.setText(org.telegram.messenger.cd.V(null, null, 2131743211, org.telegram.ui.Wallet.k0.l("Grams", org.telegram.ui.Wallet.k0.p(x10.v(), true), 2131749516)));
        this.h0 = !x10.F() && x10.v() >= org.telegram.messenger.vp.r1(i10).y7.l0.a.c;
        boolean z10 = this.d0 | (!TextUtils.isEmpty(this.S.getText()));
        this.d0 = z10;
        boolean z11 = this.h0 && z10;
        if (this.c0 != z11) {
            this.c0 = z11;
            ValueAnimator valueAnimator = this.f0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f0 = null;
            }
            float f7 = z11 ? 1.0f : 0.0f;
            if (this.L0 && isAttachedToWindow()) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.e0, f7);
                this.f0 = ofFloat;
                ofFloat.setDuration(320L);
                this.f0.setInterpolator(gr.h);
                this.f0.addUpdateListener(new a6(this, 11));
                this.f0.start();
            } else {
                setFeeVisibilityProgress(f7);
            }
        }
        long j10 = this.g0;
        TextView textView = this.a0;
        if (j10 >= 0) {
            textView.setText(org.telegram.messenger.cd.V(null, null, 2131743098, org.telegram.ui.Wallet.k0.s(j10, false)));
        } else {
            textView.setText(org.telegram.messenger.cd.V(null, null, 2131743098, this.b0));
        }
    }

    @Override // org.telegram.ui.Components.uh
    public final int i() {
        return 1;
    }

    public final void i0() {
        TextView textView;
        LinearLayout linearLayout = this.O;
        if (linearLayout == null || (textView = this.Q) == null) {
            return;
        }
        final boolean z10 = getGramNanoAmount() > 0 || this.U.getVisibility() == 0 || this.y0;
        if (z10 == this.U0) {
            return;
        }
        this.U0 = z10;
        linearLayout.setVisibility(0);
        textView.setVisibility(0);
        final int i10 = 0;
        ViewPropertyAnimator duration = linearLayout.animate().alpha(z10 ? 1.0f : 0.0f).scaleX(z10 ? 1.0f : 0.8f).scaleY(z10 ? 1.0f : 0.8f).withEndAction(new Runnable(this) { // from class: org.telegram.ui.Components.gk
            public final /* synthetic */ kk b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i10) {
                    case 0:
                        this.b.O.setVisibility(z10 ? 0 : 4);
                        break;
                    default:
                        this.b.Q.setVisibility(!z10 ? 0 : 4);
                        break;
                }
            }
        }).setDuration(320L);
        gr grVar = gr.h;
        duration.setInterpolator(grVar).start();
        final int i11 = 1;
        textView.animate().alpha(z10 ? 0.0f : 1.0f).scaleX(!z10 ? 1.0f : 0.8f).scaleY(z10 ? 0.8f : 1.0f).withEndAction(new Runnable(this) { // from class: org.telegram.ui.Components.gk
            public final /* synthetic */ kk b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i11) {
                    case 0:
                        this.b.O.setVisibility(z10 ? 0 : 4);
                        break;
                    default:
                        this.b.Q.setVisibility(!z10 ? 0 : 4);
                        break;
                }
            }
        }).setDuration(320L).setInterpolator(grVar).start();
    }

    @Override // org.telegram.ui.Components.uh
    public final boolean j() {
        if (this.b.l3.Q() <= org.telegram.messenger.i0.L(20.0f)) {
            return false;
        }
        this.M0 = false;
        bi.e eVar = this.O0;
        if (eVar != null) {
            removeCallbacks(eVar);
            this.O0 = null;
        }
        EditTextBoldCursor editTextBoldCursor = this.S;
        editTextBoldCursor.clearFocus();
        org.telegram.messenger.i0.v1(editTextBoldCursor);
        return true;
    }

    public final void j0() {
        float f7;
        View view = this.N;
        if (view.getHeight() > 0) {
            if (this.j0.getHeight() <= 0) {
                return;
            }
            float W = W(this.s);
            org.telegram.ui.Wallet.w8 w8Var = this.w;
            if (w8Var.getVisibility() == 0) {
                f7 = Math.max(W, (w8Var.getScaleY() * (w8Var.getContentBottom() - w8Var.getPivotY())) + w8Var.getPivotY() + W(w8Var));
            } else {
                f7 = W;
            }
            float max = Math.max(0.0f, Math.min(Math.min(Math.min((W + r2.getHeight()) - ((FrameLayout.LayoutParams) r1.getLayoutParams()).bottomMargin, X(this.W)), X(this.a0)), X(this.o0)) - f7);
            float min = Math.min(1.0f, Math.max(0.0f, max - (Math.min(org.telegram.messenger.i0.L(12.0f), max / 4.0f) * 2.0f)) / view.getHeight());
            view.setPivotX(view.getWidth() / 2.0f);
            view.setPivotY(view.getHeight() / 2.0f);
            view.setScaleX(min);
            view.setScaleY(min);
            view.setTranslationY(((max / 2.0f) + f7) - ((view.getHeight() / 2.0f) + (W(view) - view.getTranslationY())));
        }
    }

    public final void k0() {
        float max = Math.max(this.n0, Math.max(0.0f, Math.min(1.0f, this.m0)));
        this.n0 = max;
        float f7 = 1.0f - max;
        float f10 = this.m0;
        boolean z10 = this.l0 == null && f10 == 1.0f;
        org.telegram.ui.Wallet.q9 q9Var = this.R;
        q9Var.e(f10, max, z10);
        q9Var.setTranslationY((1.0f - this.m0) * (((this.N.getHeight() / 2.0f) - q9Var.getTop()) - (q9Var.getHeight() / 2.0f)));
        float f11 = this.n0;
        f6 f6Var = this.T;
        f6Var.setAlpha(f11);
        f6Var.setTranslationY(org.telegram.messenger.i0.L(16.0f) * f7);
        float f12 = this.n0;
        FrameLayout frameLayout = this.P;
        frameLayout.setAlpha(f12);
        frameLayout.setTranslationY(org.telegram.messenger.i0.L(16.0f) * f7);
        float f13 = this.n0;
        FrameLayout frameLayout2 = this.k0;
        frameLayout2.setAlpha(f13);
        frameLayout2.setTranslationY(org.telegram.messenger.i0.L(24.0f) * f7);
    }

    public final void l0() {
        if (!this.B0 || this.N.getHeight() <= 0) {
            return;
        }
        FrameLayout frameLayout = this.j0;
        if (frameLayout.getHeight() <= 0) {
            return;
        }
        float f7 = this.C0 ? this.A0 : 1.0f - this.A0;
        float f10 = this.I0;
        float z10 = c3.i0.z(this.J0, f10, f7, f10);
        float f11 = this.G0;
        float z11 = c3.i0.z(this.H0, f11, f7, f11);
        frameLayout.setTranslationY(z10 - (getBottomYOnScreen() - frameLayout.getTranslationY()));
        org.telegram.ui.Wallet.w8 w8Var = this.w;
        w8Var.setTranslationY(z11 - (W(w8Var) - w8Var.getTranslationY()));
        j0();
    }

    @Override // org.telegram.ui.Components.uh
    public final void m(float f7, float f10) {
        this.z0 = f7;
        this.A0 = f10;
        l0();
    }

    public final void m0(boolean z10, boolean z11) {
        if (z11 && this.p0 == z10) {
            return;
        }
        this.p0 = z10;
        vh.d dVar = this.o0;
        dVar.animate().cancel();
        TextView textView = this.W;
        textView.animate().cancel();
        TextView textView2 = this.a0;
        textView2.animate().cancel();
        float f7 = z10 ? 1.0f : 0.0f;
        float f10 = z10 ? 1.0f : 0.8f;
        float L = z10 ? 0.0f : org.telegram.messenger.i0.L(60.0f);
        if (z11) {
            dVar.setVisibility(0);
            ViewPropertyAnimator duration = dVar.animate().alpha(f7).scaleX(f10).scaleY(f10).setDuration(320L);
            gr grVar = gr.h;
            duration.setInterpolator(grVar).withEndAction(new ek(this, 5)).start();
            textView.animate().translationY(L).setDuration(320L).setInterpolator(grVar).start();
            textView2.animate().translationY(L).setDuration(320L).setInterpolator(grVar).start();
            return;
        }
        dVar.setVisibility(z10 ? 0 : 4);
        dVar.setAlpha(f7);
        dVar.setScaleX(f10);
        dVar.setScaleY(f10);
        textView.setTranslationY(L);
        textView2.setTranslationY(L);
    }

    @Override // org.telegram.ui.Components.uh
    public final void o() {
        if (this.K) {
            return;
        }
        this.K = true;
        R();
        org.telegram.ui.Wallet.s6 s6Var = this.Q0;
        if (s6Var != null) {
            AnimatorSet animatorSet = s6Var.m;
            if (!s6Var.v) {
                if (animatorSet.isStarted()) {
                    animatorSet.cancel();
                } else {
                    s6Var.a(false);
                }
            }
            this.Q0 = null;
        }
        org.telegram.ui.Wallet.fa faVar = this.R0;
        if (faVar != null) {
            AnimatorSet animatorSet2 = faVar.m;
            if (!faVar.s) {
                if (animatorSet2.isStarted()) {
                    animatorSet2.cancel();
                } else {
                    faVar.b();
                }
            }
            this.R0 = null;
        }
        ValueAnimator valueAnimator = this.f0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f0 = null;
        }
        Activity activity = this.L;
        if (activity != null) {
            try {
                activity.setRequestedOrientation(this.M);
            } catch (Exception e) {
                org.telegram.messenger.f8.g(e, true);
            }
            this.L = null;
        }
        this.O.animate().cancel();
        this.Q.animate().cancel();
        this.V.animate().cancel();
        this.o0.animate().cancel();
        this.W.animate().cancel();
        this.a0.animate().cancel();
        bi.e eVar = this.O0;
        if (eVar != null) {
            removeCallbacks(eVar);
            this.O0 = null;
        }
        org.telegram.ui.ActionBar.x1 x1Var = this.T0;
        if (x1Var != null) {
            x1Var.dismiss();
        }
        org.telegram.ui.Wallet.l lVar = this.i0;
        if (lVar != null) {
            lVar.run();
            this.i0 = null;
        }
        org.telegram.messenger.zs.f(this.n).n(this, org.telegram.messenger.zs.a4);
        this.b.R2.p().removeView(this.x);
        org.telegram.messenger.i0.v1(this.S);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (this.K0) {
            this.K0 = false;
            this.N.setTranslationY(0.0f);
            this.j0.setTranslationY(0.0f);
            this.w.setTranslationY(0.0f);
            b0();
        } else if (this.B0) {
            l0();
        }
        j0();
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z10) {
        if (!z10) {
            f0();
        }
        super.onWindowFocusChanged(z10);
    }

    public void setSendTransitionProgress(float f7) {
        this.w.setAlpha(1.0f - f7);
    }

    @Override // android.view.View
    public void setTranslationY(float f7) {
        super.setTranslationY(f7);
        this.b.b.invalidate();
    }

    @Override // org.telegram.ui.Components.uh
    public final void t() {
        R();
        Activity activity = this.L;
        if (activity != null) {
            try {
                activity.setRequestedOrientation(this.M);
            } catch (Exception e) {
                org.telegram.messenger.f8.g(e, true);
            }
            this.L = null;
        }
        this.b.R2.setDrawGlassTitle(true);
        this.L0 = false;
        this.M0 = false;
        bi.e eVar = this.O0;
        if (eVar != null) {
            removeCallbacks(eVar);
            this.O0 = null;
        }
        org.telegram.ui.ActionBar.x1 x1Var = this.T0;
        if (x1Var != null) {
            x1Var.dismiss();
        }
        this.x.setVisibility(8);
        EditTextBoldCursor editTextBoldCursor = this.S;
        org.telegram.messenger.i0.v1(editTextBoldCursor);
        editTextBoldCursor.clearFocus();
    }

    @Override // org.telegram.ui.Components.uh
    public final void w(int i10) {
        if (i10 == 2) {
            org.telegram.ui.Wallet.b6.I0(this.n, getContext(), this.a);
        } else if (i10 == 3) {
            Z();
        }
    }

    @Override // org.telegram.ui.Components.uh
    public final void y() {
        if (this.B0) {
            this.B0 = false;
            float bottomYOnScreen = getBottomYOnScreen();
            FrameLayout frameLayout = this.j0;
            frameLayout.setTranslationY(this.J0 - (bottomYOnScreen - frameLayout.getTranslationY()));
            org.telegram.ui.Wallet.w8 w8Var = this.w;
            w8Var.setTranslationY(this.H0 - (W(w8Var) - w8Var.getTranslationY()));
            this.K0 = true;
            requestLayout();
        }
    }

    @Override // org.telegram.ui.Components.uh
    public final void z(int i10, boolean z10) {
        this.B0 = true;
        this.K0 = false;
        this.C0 = z10;
        this.A0 = z10 ? 0.0f : 1.0f;
        this.I0 = this.D0 ? this.E0 : getBottomYOnScreen();
        boolean z11 = this.D0;
        org.telegram.ui.Wallet.w8 w8Var = this.w;
        this.G0 = z11 ? this.F0 : W(w8Var);
        this.J0 = getBottomYOnScreen() - this.j0.getTranslationY();
        this.H0 = W(w8Var) - w8Var.getTranslationY();
        l0();
    }
}
