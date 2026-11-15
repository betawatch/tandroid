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

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class qk extends ci implements org.telegram.messenger.is {
    public float A0;
    public float B0;
    public boolean C0;
    public boolean D0;
    public final ShapeDrawable E;
    public boolean E0;
    public final org.telegram.ui.ActionBar.r4 F;
    public float F0;
    public eq G;
    public float G0;
    public String H;
    public float H0;
    public byte[] I;
    public float I0;
    public boolean J;
    public float J0;
    public boolean K;
    public float K0;
    public boolean L;
    public boolean L0;
    public Activity M;
    public boolean M0;
    public int N;
    public boolean N0;
    public final nk O;
    public boolean O0;
    public final LinearLayout P;
    public di.x2 P0;
    public final FrameLayout Q;
    public TL_wallet.walletTransaction Q0;
    public final TextView R;
    public org.telegram.ui.Wallet.o6 R0;
    public final org.telegram.ui.Wallet.o9 S;
    public org.telegram.ui.Wallet.da S0;
    public final EditTextBoldCursor T;
    public boolean T0;
    public final h6 U;
    public org.telegram.ui.ActionBar.t1 U0;
    public final TextView V;
    public boolean V0;
    public final z70 W;
    public DecimalFormat W0;
    public final TextView a0;
    public final TextView b0;
    public final SpannableString c0;
    public boolean d0;
    public boolean e0;
    public float f0;
    public ValueAnimator g0;
    public long h0;
    public boolean i0;
    public org.telegram.ui.Wallet.l j0;
    public final FrameLayout k0;
    public final FrameLayout l0;
    public r1.g m0;
    public final int n;
    public float n0;
    public float o0;
    public final hi.d p0;
    public boolean q0;
    public final TLRPC.User r;
    public final SpannableString r0;
    public final FrameLayout s;
    public final SpannableString s0;
    public String t0;
    public boolean u0;
    public boolean v0;
    public final org.telegram.ui.Wallet.s8 w;
    public int w0;
    public final org.telegram.ui.ActionBar.q0 x;
    public DecimalFormat x0;
    public final org.telegram.ui.ActionBar.q0 y;
    public final int[] y0;
    public boolean z0;

    public qk(ki kiVar, Context context, int i7, TLRPC.User user, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, e6Var, kiVar);
        this.h0 = -1L;
        this.n0 = 1.0f;
        this.o0 = 1.0f;
        final int i10 = 1;
        this.u0 = true;
        this.w0 = 6;
        this.y0 = new int[2];
        this.n = i7;
        this.r = user;
        FrameLayout frameLayout = new FrameLayout(context);
        this.s = frameLayout;
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        addView(frameLayout, c8.ja.e(-1, -1, 55));
        org.telegram.ui.ActionBar.q0 a10 = this.b.V2.s().a(31, R.drawable.ic_ab_other);
        this.x = a10;
        a10.setContentDescription(org.telegram.messenger.hd.M0(2131754839, null));
        a10.e(2, R.drawable.msg_addbot, org.telegram.messenger.hd.M0(2131743137, null));
        a10.e(3, R.drawable.menu_comments, org.telegram.messenger.hd.M0(2131743205, null));
        a10.setVisibility(8);
        org.telegram.ui.ActionBar.q0 q0Var = new org.telegram.ui.ActionBar.q0(context, null, 0, org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.G6, this.a), false, e6Var);
        this.y = q0Var;
        q0Var.setIcon(R.drawable.ic_ab_other);
        q0Var.setContentDescription(org.telegram.messenger.hd.M0(2131754839, null));
        int i11 = org.telegram.ui.ActionBar.j6.i6;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.j6.h0(org.telegram.ui.ActionBar.j6.w0(i11, this.a), 1, -1);
        org.telegram.ui.ActionBar.m6 M = org.telegram.ui.ActionBar.q6.M(i11);
        q0Var.setBackground(h02);
        org.telegram.ui.ActionBar.q6.j(q0Var, h02, null, M, e6Var);
        q0Var.setOnClickListener(new bi.x2(this, e6Var, i7, 11));
        org.telegram.ui.Wallet.s8 s8Var = new org.telegram.ui.Wallet.s8(context, new od(15, this, user), new od(16, this, e6Var), e6Var);
        this.w = s8Var;
        s8Var.a(this.H, user);
        addView(s8Var, c8.ja.d(-2, 64.0f, 49, 6.0f, 0.0f, 6.0f, 0.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setClipChildren(false);
        frameLayout2.setClipToPadding(false);
        frameLayout.addView(frameLayout2, c8.ja.e(-1, -1, 55));
        nk nkVar = new nk(context);
        this.O = nkVar;
        nkVar.setOrientation(1);
        nkVar.setClipChildren(false);
        nkVar.setClipToPadding(false);
        final int i12 = 3;
        nkVar.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.fk
            public final /* synthetic */ qk b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        this.b.e0();
                        break;
                    case 1:
                        this.b.b0();
                        break;
                    case 2:
                        qk.P(this.b);
                        break;
                    case 3:
                        this.b.e0();
                        break;
                    case 4:
                        this.b.e0();
                        break;
                    case 5:
                        this.b.e0();
                        break;
                    default:
                        qk.R(this.b);
                        break;
                }
            }
        });
        frameLayout2.addView(nkVar, c8.ja.e(-1, -2, 17));
        org.telegram.ui.Wallet.o9 o9Var = new org.telegram.ui.Wallet.o9(context, e6Var);
        this.S = o9Var;
        final int i13 = 4;
        o9Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.fk
            public final /* synthetic */ qk b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i13) {
                    case 0:
                        this.b.e0();
                        break;
                    case 1:
                        this.b.b0();
                        break;
                    case 2:
                        qk.P(this.b);
                        break;
                    case 3:
                        this.b.e0();
                        break;
                    case 4:
                        this.b.e0();
                        break;
                    case 5:
                        this.b.e0();
                        break;
                    default:
                        qk.R(this.b);
                        break;
                }
            }
        });
        nkVar.addView(o9Var, c8.ja.t(-1, 64, 49, 16, 0, 16, 0));
        EditTextBoldCursor editText = o9Var.getEditText();
        this.T = editText;
        int i14 = 0;
        editText.setFilters(new InputFilter[]{new gk(i14, this)});
        editText.setImeOptions(33554438);
        editText.setOnTouchListener(new hk(this, i14));
        final int i15 = 5;
        editText.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.fk
            public final /* synthetic */ qk b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i15) {
                    case 0:
                        this.b.e0();
                        break;
                    case 1:
                        this.b.b0();
                        break;
                    case 2:
                        qk.P(this.b);
                        break;
                    case 3:
                        this.b.e0();
                        break;
                    case 4:
                        this.b.e0();
                        break;
                    case 5:
                        this.b.e0();
                        break;
                    default:
                        qk.R(this.b);
                        break;
                }
            }
        });
        editText.setOnEditorActionListener(new q0(this, i10));
        editText.addTextChangedListener(new ok(this));
        SpannableString spannableString = new SpannableString("⇅");
        this.r0 = spannableString;
        eq eqVar = new eq(R.drawable.wallet_currency_exchange, 0);
        eqVar.x = 0.72f;
        spannableString.setSpan(eqVar, 0, spannableString.length(), 33);
        SpannableString spannableString2 = new SpannableString("G");
        this.s0 = spannableString2;
        eq eqVar2 = new eq(R.drawable.wallet_gram_small, 0);
        eqVar2.d = false;
        spannableString2.setSpan(eqVar2, 0, spannableString2.length(), 33);
        h6 h6Var = new h6(context, false, true, true, true, true);
        this.U = h6Var;
        h6Var.c.m(0.35f, 320L, 3.5f, er.h);
        h6Var.setScaleProperty(0.35f);
        h6Var.setText(W(org.telegram.ui.Wallet.l0.x(i7), 0L));
        int i16 = org.telegram.ui.ActionBar.j6.d6;
        int i17 = org.telegram.ui.ActionBar.j6.z6;
        org.telegram.ui.ActionBar.m6 p10 = org.telegram.ui.ActionBar.q6.p(i16, i17);
        org.telegram.ui.ActionBar.q6.m(h6Var, p10.a, p10.b, 4, 0.0f, e6Var);
        h6Var.setTextSize(org.telegram.messenger.g0.L(14.0f));
        h6Var.setTypeface(org.telegram.messenger.g0.o1("fonts/gram.ttf"));
        h6Var.setGravity(17);
        h6Var.setPadding(org.telegram.messenger.g0.L(10.0f), 0, org.telegram.messenger.g0.L(10.0f), 0);
        h6Var.setAllowCancel(true);
        ShapeDrawable d02 = org.telegram.ui.ActionBar.j6.d0(org.telegram.messenger.g0.L(14.0f), org.telegram.ui.ActionBar.j6.r1(0.08f, org.telegram.ui.ActionBar.j6.w0(i17, this.a)));
        this.E = d02;
        h6Var.setSizeableBackground(d02);
        nkVar.addView(h6Var, c8.ja.t(-2, 28, 49, 0, 8, 0, 0));
        c8.na.a(h6Var);
        final int i18 = 6;
        h6Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.fk
            public final /* synthetic */ qk b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i18) {
                    case 0:
                        this.b.e0();
                        break;
                    case 1:
                        this.b.b0();
                        break;
                    case 2:
                        qk.P(this.b);
                        break;
                    case 3:
                        this.b.e0();
                        break;
                    case 4:
                        this.b.e0();
                        break;
                    case 5:
                        this.b.e0();
                        break;
                    default:
                        qk.R(this.b);
                        break;
                }
            }
        });
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.Q = frameLayout3;
        nkVar.addView(frameLayout3, c8.ja.r(-2, -2, 49));
        LinearLayout linearLayout = new LinearLayout(context);
        this.P = linearLayout;
        linearLayout.setOrientation(1);
        frameLayout3.addView(linearLayout, c8.ja.e(-2, -2, 49));
        TextView textView = new TextView(context);
        this.R = textView;
        textView.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.q6.U(textView, i17, e6Var);
        textView.setPadding(org.telegram.messenger.g0.L(10.0f), 0, org.telegram.messenger.g0.L(10.0f), 0);
        org.telegram.messenger.k5.l(textView, 17, null, 2131743007);
        frameLayout3.addView(textView, c8.ja.d(-2, 28.0f, 49, 0.0f, 8.0f, 0.0f, 0.0f));
        c8.na.a(textView);
        final int i19 = 0;
        textView.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.fk
            public final /* synthetic */ qk b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i19) {
                    case 0:
                        this.b.e0();
                        break;
                    case 1:
                        this.b.b0();
                        break;
                    case 2:
                        qk.P(this.b);
                        break;
                    case 3:
                        this.b.e0();
                        break;
                    case 4:
                        this.b.e0();
                        break;
                    case 5:
                        this.b.e0();
                        break;
                    default:
                        qk.R(this.b);
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
        this.V0 = false;
        TextView textView2 = new TextView(context);
        this.V = textView2;
        org.telegram.ui.ActionBar.r4 r4Var = new org.telegram.ui.ActionBar.r4(0, true, false, null);
        this.F = r4Var;
        r4Var.x = false;
        Paint.Style style = Paint.Style.STROKE;
        Paint paint = r4Var.c;
        paint.setStyle(style);
        paint.setStrokeWidth(Math.max(1.0f, org.telegram.messenger.g0.N(0.5f)));
        int i20 = org.telegram.ui.ActionBar.j6.bm;
        paint.setColor(org.telegram.ui.ActionBar.j6.w0(i20, this.a));
        r4Var.w = Integer.valueOf(org.telegram.ui.ActionBar.j6.w0(i20, this.a));
        textView2.setPadding(org.telegram.messenger.g0.L(15.0f), org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(19.0f), org.telegram.messenger.g0.L(8.0f));
        textView2.setBackground(r4Var);
        textView2.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.q6.U(textView2, i17, e6Var);
        textView2.setTypeface(org.telegram.messenger.g0.o());
        textView2.setVisibility(8);
        textView2.setEllipsize(TextUtils.TruncateAt.END);
        textView2.setMaxLines(4);
        linearLayout.addView(textView2, c8.ja.t(-2, -2, 49, 32, 12, 32, 0));
        textView2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.fk
            public final /* synthetic */ qk b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        this.b.e0();
                        break;
                    case 1:
                        this.b.b0();
                        break;
                    case 2:
                        qk.P(this.b);
                        break;
                    case 3:
                        this.b.e0();
                        break;
                    case 4:
                        this.b.e0();
                        break;
                    case 5:
                        this.b.e0();
                        break;
                    default:
                        qk.R(this.b);
                        break;
                }
            }
        });
        c8.na.b(textView2, 0.02f, 1.2f);
        z70 z70Var = new z70(context, e6Var);
        this.W = z70Var;
        org.telegram.ui.ActionBar.q6.U(z70Var, org.telegram.ui.ActionBar.j6.q7, e6Var);
        org.telegram.ui.ActionBar.q6.G(z70Var, org.telegram.ui.ActionBar.j6.Fi, e6Var);
        z70Var.setTextSize(1, 14.0f);
        z70Var.setGravity(17);
        z70Var.setTypeface(org.telegram.messenger.g0.o());
        z70Var.setPadding(org.telegram.messenger.g0.L(10.0f), 0, org.telegram.messenger.g0.L(10.0f), 0);
        g0(false);
        linearLayout.addView(z70Var, c8.ja.t(-2, -2, 49, 0, 10, 0, 0));
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.k0 = frameLayout4;
        frameLayout4.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(12.0f));
        FrameLayout frameLayout5 = new FrameLayout(context);
        this.l0 = frameLayout5;
        frameLayout4.setClipChildren(false);
        frameLayout4.setClipToPadding(false);
        frameLayout5.setClipChildren(false);
        frameLayout5.setClipToPadding(false);
        frameLayout4.addView(frameLayout5, c8.ja.c(-1.0f, -1));
        TextView textView3 = new TextView(context);
        this.a0 = textView3;
        org.telegram.ui.ActionBar.q6.U(textView3, i17, e6Var);
        textView3.setTextSize(1, 14.0f);
        textView3.setGravity(17);
        frameLayout5.addView(textView3, c8.ja.e(-1, 20, 55));
        TextView textView4 = new TextView(context);
        this.b0 = textView4;
        org.telegram.ui.ActionBar.q6.U(textView4, i17, e6Var);
        textView4.setTextSize(1, 14.0f);
        textView4.setGravity(17);
        textView4.setPadding(0, org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f));
        textView4.setVisibility(8);
        frameLayout5.addView(textView4, c8.ja.d(-1, -2.0f, 55, 0.0f, 24.0f, 0.0f, 0.0f));
        SpannableString spannableString3 = new SpannableString(org.telegram.messenger.hd.M0(2131748779, null));
        this.c0 = spannableString3;
        spannableString3.setSpan(new e80(org.telegram.messenger.g0.L(80.0f), textView4), 0, spannableString3.length(), 33);
        hi.d g10 = org.telegram.messenger.i20.g(24, context, e6Var, true);
        this.p0 = g10;
        g10.setText(org.telegram.messenger.hd.M0(2131743020, null));
        g10.setEnabled(false);
        final int i21 = 2;
        g10.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.fk
            public final /* synthetic */ qk b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i21) {
                    case 0:
                        this.b.e0();
                        break;
                    case 1:
                        this.b.b0();
                        break;
                    case 2:
                        qk.P(this.b);
                        break;
                    case 3:
                        this.b.e0();
                        break;
                    case 4:
                        this.b.e0();
                        break;
                    case 5:
                        this.b.e0();
                        break;
                    default:
                        qk.R(this.b);
                        break;
                }
            }
        });
        frameLayout5.addView(g10, c8.ja.e(-1, 48, 87));
        frameLayout.addView(frameLayout4, c8.ja.d(-1, 92.0f, 87, 0.0f, 0.0f, 0.0f, 70.0f));
        o0(false, false);
        org.telegram.messenger.ns.f(i7).c(this, org.telegram.messenger.ns.a4);
        j0();
        this.J = true;
        org.telegram.ui.Wallet.l0.x(i7).a0(user, new jk(this, 0));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16, types: [org.telegram.tgnet.tl.TL_wallet$walletTransaction] */
    /* JADX WARN: Type inference failed for: r4v17 */
    public static void P(final qk qkVar) {
        ?? r42;
        EditTextBoldCursor editTextBoldCursor = qkVar.T;
        int i7 = qkVar.n;
        hi.d dVar = qkVar.p0;
        if (!dVar.d0 || dVar.R) {
            return;
        }
        org.telegram.ui.Wallet.l0 x10 = org.telegram.ui.Wallet.l0.x(i7);
        long gramNanoAmount = qkVar.getGramNanoAmount();
        long v = x10.v();
        if (!WalletEngine2.isValidAddress(qkVar.H) || gramNanoAmount <= 0) {
            return;
        }
        long j3 = ((org.telegram.messenger.l0) org.telegram.messenger.np.s1(i7).y7.l0.b).c;
        if (gramNanoAmount < j3) {
            String U = qkVar.v0 ? qkVar.U(j3, qkVar.getCurrencyPerGram()) : X(j3);
            editTextBoldCursor.setText(U);
            editTextBoldCursor.setSelection(U.length());
            int i10 = -qkVar.w0;
            qkVar.w0 = i10;
            org.telegram.messenger.g0.F3(i10, editTextBoldCursor, null);
            return;
        }
        if (gramNanoAmount > v) {
            org.telegram.messenger.p2.E.a();
            z70 z70Var = qkVar.W;
            int i11 = -qkVar.w0;
            qkVar.w0 = i11;
            org.telegram.messenger.g0.F3(i11, z70Var, null);
            return;
        }
        org.telegram.messenger.np s12 = org.telegram.messenger.np.s1(i7);
        long N1 = s12.N1(qkVar.r.id);
        org.telegram.messenger.p0 p0Var = s12.y7;
        qkVar.T0 = ((org.telegram.messenger.h0) p0Var.k0.b).c && N1 > 0 && (((double) gramNanoAmount) / 1.0E9d) * ((org.telegram.messenger.i0) p0Var.l.b).a < (((double) N1) / 1000.0d) * ((double) s12.d6);
        dVar.setLoading(true);
        qkVar.O0 = true;
        qkVar.N0 = false;
        di.x2 x2Var = qkVar.P0;
        if (x2Var != null) {
            qkVar.removeCallbacks(x2Var);
            r42 = 0;
            qkVar.P0 = null;
        } else {
            r42 = 0;
        }
        qkVar.Q0 = r42;
        TLRPC.User user = qkVar.r;
        String str = qkVar.H;
        String str2 = qkVar.t0;
        byte[] publicKey = qkVar.u0 ? qkVar.getPublicKey() : r42;
        final int i12 = 0;
        org.telegram.messenger.z10 z10Var = new org.telegram.messenger.z10(qkVar) { // from class: org.telegram.ui.Components.lk
            public final /* synthetic */ qk b;

            {
                this.b = qkVar;
            }

            @Override // org.telegram.messenger.z10
            public final void a(Object obj) {
                switch (i12) {
                    case 0:
                        String str3 = (String) obj;
                        qk qkVar2 = this.b;
                        hi.d dVar2 = qkVar2.p0;
                        ki kiVar = qkVar2.b;
                        if (!qkVar2.L && !kiVar.J) {
                            if (!"PASSCODE_FAILED".equalsIgnoreCase(str3)) {
                                if (!TextUtils.isEmpty(str3)) {
                                    dVar2.setLoading(false);
                                    qkVar2.O0 = false;
                                    cc.X().e0(str3, false);
                                    break;
                                } else {
                                    kiVar.dismiss();
                                    break;
                                }
                            } else {
                                dVar2.setLoading(false);
                                qkVar2.O0 = false;
                                break;
                            }
                        }
                        break;
                    default:
                        this.b.Q0 = (TL_wallet.walletTransaction) obj;
                        break;
                }
            }
        };
        final int i13 = 1;
        x10.d0(user, str, gramNanoAmount, str2, publicKey, null, null, z10Var, new org.telegram.messenger.z10(qkVar) { // from class: org.telegram.ui.Components.lk
            public final /* synthetic */ qk b;

            {
                this.b = qkVar;
            }

            @Override // org.telegram.messenger.z10
            public final void a(Object obj) {
                switch (i13) {
                    case 0:
                        String str3 = (String) obj;
                        qk qkVar2 = this.b;
                        hi.d dVar2 = qkVar2.p0;
                        ki kiVar = qkVar2.b;
                        if (!qkVar2.L && !kiVar.J) {
                            if (!"PASSCODE_FAILED".equalsIgnoreCase(str3)) {
                                if (!TextUtils.isEmpty(str3)) {
                                    dVar2.setLoading(false);
                                    qkVar2.O0 = false;
                                    cc.X().e0(str3, false);
                                    break;
                                } else {
                                    kiVar.dismiss();
                                    break;
                                }
                            } else {
                                dVar2.setLoading(false);
                                qkVar2.O0 = false;
                                break;
                            }
                        }
                        break;
                    default:
                        this.b.Q0 = (TL_wallet.walletTransaction) obj;
                        break;
                }
            }
        }, null);
    }

    public static void R(qk qkVar) {
        EditTextBoldCursor editTextBoldCursor = qkVar.T;
        BigDecimal currencyPerGram = qkVar.getCurrencyPerGram();
        if (qkVar.v0 || currencyPerGram.signum() > 0) {
            long gramNanoAmount = qkVar.getGramNanoAmount();
            qkVar.v0 = !qkVar.v0;
            qkVar.S.d(org.telegram.ui.Wallet.l0.x(qkVar.n), qkVar.v0);
            String U = gramNanoAmount <= 0 ? "" : qkVar.v0 ? qkVar.U(gramNanoAmount, currencyPerGram) : X(gramNanoAmount);
            editTextBoldCursor.setText(U);
            editTextBoldCursor.setSelection(U.length());
        }
    }

    public static /* synthetic */ CharSequence S(qk qkVar, CharSequence charSequence, int i7, int i10, Spanned spanned, int i11, int i12) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(spanned.subSequence(0, i11).toString());
        sb2.append((Object) charSequence.subSequence(i7, i10));
        sb2.append((Object) spanned.subSequence(i12, spanned.length()));
        String sb3 = sb2.toString();
        int i13 = 9;
        BigDecimal valueOf = BigDecimal.valueOf(Long.MAX_VALUE, 9);
        if (qkVar.v0) {
            BigDecimal currencyPerGram = qkVar.getCurrencyPerGram();
            valueOf = valueOf.multiply(currencyPerGram);
            i13 = V(currencyPerGram);
        }
        int max = Math.max(sb3.indexOf(46), sb3.indexOf(44));
        if (max >= 0 && (sb3.length() - max) - 1 > i13) {
            return spanned.subSequence(i11, i12);
        }
        if (c0(sb3).compareTo(valueOf) > 0) {
            return spanned.subSequence(i11, i12);
        }
        if (i7 == i10) {
            return null;
        }
        boolean z10 = false;
        for (int i14 = 0; i14 < sb3.length(); i14++) {
            char charAt = sb3.charAt(i14);
            if (charAt == '.' || charAt == ',') {
                if (z10) {
                    return spanned.subSequence(i11, i12);
                }
                z10 = true;
            }
        }
        if (i11 == 0 && (sb3.startsWith(".") || sb3.startsWith(","))) {
            return "0" + ((Object) charSequence.subSequence(i7, i10));
        }
        if (sb3.startsWith("00")) {
            return spanned.subSequence(i11, i12);
        }
        return null;
    }

    public static int V(BigDecimal bigDecimal) {
        if (bigDecimal.signum() <= 0) {
            return 9;
        }
        BigDecimal movePointLeft = bigDecimal.movePointLeft(9);
        int i7 = 0;
        for (BigDecimal movePointLeft2 = BigDecimal.ONE.movePointLeft(1); movePointLeft2.compareTo(movePointLeft) >= 0; movePointLeft2 = movePointLeft2.movePointLeft(1)) {
            i7++;
        }
        return i7;
    }

    public static String X(long j3) {
        BigDecimal scale = BigDecimal.valueOf(j3).movePointLeft(9).setScale(2, RoundingMode.HALF_UP);
        return (scale.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : scale.stripTrailingZeros()).toPlainString();
    }

    public static BigDecimal c0(String str) {
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

    public static void f0(SpannableStringBuilder spannableStringBuilder, int i7, int i10, char c10) {
        int i11 = i7 + 1;
        while (true) {
            int i12 = i11 + 1;
            if (i12 >= i10) {
                return;
            }
            if (spannableStringBuilder.charAt(i11) == c10 && Character.isDigit(spannableStringBuilder.charAt(i11 - 1)) && Character.isDigit(spannableStringBuilder.charAt(i12))) {
                int i13 = i12;
                while (i13 < i10 && Character.isDigit(spannableStringBuilder.charAt(i13))) {
                    i13++;
                }
                spannableStringBuilder.setSpan(new RelativeSizeSpan(0.85714287f), i12, i13, 33);
                return;
            }
            i11 = i12;
        }
    }

    private float getBottomYOnScreen() {
        return Y(this.k0);
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
        return selectedCurrencyRate != null ? selectedCurrencyRate.exp : TextUtils.equals(org.telegram.ui.Wallet.l0.x(this.n).h.g(), "USD") ? 2 : 0;
    }

    private BigDecimal getCurrencyPerGram() {
        int i7 = this.n;
        org.telegram.ui.Wallet.f fVar = org.telegram.ui.Wallet.l0.x(i7).h;
        fVar.f();
        double h = fVar.h();
        double d = ((org.telegram.messenger.i0) org.telegram.messenger.np.s1(i7).y7.l.b).a;
        return (h <= 0.0d || d <= 0.0d || Double.isNaN(h) || Double.isInfinite(h) || Double.isNaN(d) || Double.isInfinite(d)) ? BigDecimal.ZERO : BigDecimal.valueOf(h).multiply(BigDecimal.valueOf(d));
    }

    private long getGramNanoAmount() {
        BigDecimal c02 = c0(this.T.getText().toString());
        if (this.v0) {
            BigDecimal currencyPerGram = getCurrencyPerGram();
            if (currencyPerGram.signum() <= 0) {
                return 0L;
            }
            c02 = c02.divide(currencyPerGram, 9, RoundingMode.DOWN).setScale(2, RoundingMode.HALF_UP);
        }
        BigInteger bigInteger = c02.movePointRight(9).toBigInteger();
        if (bigInteger.compareTo(BigInteger.valueOf(Long.MAX_VALUE)) > 0) {
            return Long.MAX_VALUE;
        }
        return bigInteger.longValue();
    }

    private String getGramsText() {
        long gramNanoAmount = getGramNanoAmount();
        if (this.W0 == null) {
            this.W0 = new DecimalFormat("#,##0.#########", new DecimalFormatSymbols(Locale.US));
        }
        return gramNanoAmount > 0 ? this.W0.format(BigDecimal.valueOf(gramNanoAmount, 9)) : "";
    }

    private TL_wallet.currencyRate getSelectedCurrencyRate() {
        org.telegram.ui.Wallet.f fVar = org.telegram.ui.Wallet.l0.x(this.n).h;
        TL_wallet.currencyRates f10 = fVar.f();
        if (f10 == null) {
            return null;
        }
        ArrayList<TL_wallet.currencyRate> arrayList = f10.rates;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            TL_wallet.currencyRate currencyrate = arrayList.get(i7);
            i7++;
            TL_wallet.currencyRate currencyrate2 = currencyrate;
            if (currencyrate2 != null && TextUtils.equals(currencyrate2.currency, fVar.g())) {
                return currencyrate2;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFeeVisibilityProgress(float f10) {
        this.f0 = f10;
        TextView textView = this.b0;
        textView.setAlpha(f10);
        textView.setVisibility(f10 > 0.0f ? 0 : 8);
        requestLayout();
    }

    @Override // org.telegram.ui.Components.ci
    public final void A() {
        T();
        h0();
    }

    @Override // org.telegram.ui.Components.ci
    public final void B(int i7, int i10) {
        int i11;
        ki kiVar = this.b;
        boolean z10 = kiVar.p3.Q() > org.telegram.messenger.g0.L(20.0f);
        this.z0 = z10;
        this.f = z10;
        int L = z10 ? 0 : org.telegram.messenger.g0.L(70.0f);
        int round = Math.round(org.telegram.messenger.g0.L(32.0f) * this.f0) + org.telegram.messenger.g0.L(92.0f);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.k0.getLayoutParams();
        layoutParams.height = round;
        layoutParams.bottomMargin = L;
        if (this.z0) {
            i11 = org.telegram.messenger.g0.L(56.0f);
            kiVar.r0 = false;
        } else {
            if (!org.telegram.messenger.g0.Q1()) {
                Point point = org.telegram.messenger.g0.q;
                if (point.x > point.y) {
                    i11 = (int) (i10 / 3.5f);
                    kiVar.r0 = true;
                }
            }
            i11 = (i10 / 5) * 2;
            kiVar.r0 = true;
        }
        int d = i5.c.d(1.0f, i11, 0) + org.telegram.messenger.g0.m;
        FrameLayout frameLayout = this.s;
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
        if (layoutParams2.topMargin != d) {
            layoutParams2.topMargin = d;
            frameLayout.setLayoutParams(layoutParams2);
        }
        int b10 = org.telegram.messenger.k5.b(4.0f, d - org.telegram.messenger.g0.m, 0);
        org.telegram.ui.Wallet.s8 s8Var = this.w;
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) s8Var.getLayoutParams();
        int max = Math.max(0, this.z0 ? org.telegram.messenger.g0.L(4.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() : b10 - org.telegram.messenger.g0.L(4.0f));
        if (layoutParams3.topMargin != max) {
            layoutParams3.topMargin = max;
            s8Var.setLayoutParams(layoutParams3);
        }
        k0();
    }

    @Override // org.telegram.ui.Components.ci
    public final void I(ci ciVar) {
        Activity W;
        T();
        if (this.M == null && !org.telegram.messenger.g0.Q1()) {
            Point point = org.telegram.messenger.g0.q;
            if (Math.min(point.x, point.y) < org.telegram.messenger.g0.L(700.0f) && (W = org.telegram.messenger.g0.W(getContext())) != null) {
                try {
                    this.N = W.getRequestedOrientation();
                    W.setRequestedOrientation(1);
                    this.M = W;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
            }
        }
        this.M0 = false;
        this.O0 = false;
        EditTextBoldCursor editTextBoldCursor = this.T;
        editTextBoldCursor.setFocusableInTouchMode(true);
        editTextBoldCursor.setShowSoftInputOnFocus(true);
        this.N0 = false;
        this.C0 = false;
        this.L0 = false;
        this.O.setTranslationY(0.0f);
        this.k0.setTranslationY(0.0f);
        org.telegram.ui.Wallet.s8 s8Var = this.w;
        s8Var.setTranslationY(0.0f);
        s8Var.setAlpha(1.0f);
        this.E0 = false;
        ki kiVar = this.b;
        kiVar.V2.setTitle(org.telegram.messenger.hd.M0(2131743016, null));
        kiVar.V2.setDrawGlassTitle(false);
        this.x.setVisibility(0);
        editTextBoldCursor.clearFocus();
        a0();
        org.telegram.ui.Wallet.o9 o9Var = this.S;
        float f10 = o9Var.getDiamondView().f == null ? 1.0f : 0.0f;
        this.o0 = f10;
        this.n0 = f10;
        m0();
        if (this.n0 < 1.0f) {
            o9Var.getDiamondView().l(new kk(this, 3));
        }
    }

    @Override // org.telegram.ui.Components.ci
    public final void J() {
        this.M0 = true;
        post(new kk(this, 4));
    }

    @Override // org.telegram.ui.Components.ci
    public final boolean O() {
        return !this.O0;
    }

    public final void T() {
        this.S.getDiamondView().l(null);
        r1.g gVar = this.m0;
        if (gVar != null) {
            gVar.d();
        }
        this.n0 = 1.0f;
        m0();
    }

    public final String U(long j3, BigDecimal bigDecimal) {
        BigDecimal movePointLeft = BigDecimal.valueOf(j3).multiply(bigDecimal).movePointLeft(9);
        int max = Math.max(0, Math.min(getCurrencyFractionDigits(), 20));
        RoundingMode roundingMode = RoundingMode.HALF_UP;
        BigDecimal scale = movePointLeft.setScale(max, roundingMode);
        if (scale.signum() == 0 && movePointLeft.signum() != 0) {
            scale = movePointLeft.setScale(Math.min(20, Math.max(max, movePointLeft.scale())), roundingMode);
        }
        int V = V(bigDecimal);
        if (scale.scale() > V) {
            scale = scale.setScale(V, RoundingMode.DOWN);
        }
        BigDecimal multiply = BigDecimal.valueOf(Long.MAX_VALUE, 9).multiply(bigDecimal);
        if (scale.compareTo(multiply) > 0) {
            scale = multiply.setScale(scale.scale(), RoundingMode.DOWN);
        }
        return (scale.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : scale.stripTrailingZeros()).toPlainString();
    }

    public final SpannableStringBuilder W(org.telegram.ui.Wallet.l0 l0Var, long j3) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("≈ ");
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append(l0Var.m(j3, false));
        f0(spannableStringBuilder, length, spannableStringBuilder.length(), getCurrencyDecimalSeparator());
        return spannableStringBuilder.append((CharSequence) " ").append((CharSequence) this.r0);
    }

    public final float Y(View view) {
        float f10 = 0.0f;
        while (view.getParent() instanceof View) {
            View view2 = (View) view.getParent();
            f10 += view.getY() - view2.getScrollY();
            view = view2;
        }
        view.getLocationOnScreen(this.y0);
        return ((f10 + r1[1]) + this.A0) - this.b.t2;
    }

    public final float Z(View view) {
        if (view.getVisibility() != 0 || view.getAlpha() <= 0.0f) {
            return Float.POSITIVE_INFINITY;
        }
        return ((1.0f - view.getScaleY()) * view.getPivotY()) + (Y(view) - this.l0.getTranslationY());
    }

    public final void a0() {
        if (this.L || TextUtils.isEmpty(this.H)) {
            return;
        }
        org.telegram.ui.Wallet.l lVar = this.j0;
        if (lVar != null) {
            lVar.run();
            this.j0 = null;
        }
        this.h0 = -1L;
        j0();
        org.telegram.ui.Wallet.l0 x10 = org.telegram.ui.Wallet.l0.x(this.n);
        if (this.i0) {
            this.j0 = x10.i(this.H, Math.max(100000000L, getGramNanoAmount()), this.t0, this.u0 ? getPublicKey() : null, new jk(this, 1));
        }
    }

    public final void b0() {
        if (this.L || this.O0 || this.P0 != null || this.U0 != null) {
            return;
        }
        e0();
        di.x2 x2Var = new di.x2(this, SystemClock.uptimeMillis() + 1500, 22);
        this.P0 = x2Var;
        post(x2Var);
    }

    @Override // org.telegram.ui.Components.ci
    public final void d() {
        try {
            org.telegram.ui.ActionBar.q0 q0Var = this.y;
            org.telegram.ui.ActionBar.e6 e6Var = this.a;
            if (q0Var != null) {
                q0Var.setIconColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.G6, e6Var));
            }
            ShapeDrawable shapeDrawable = this.E;
            if (shapeDrawable != null) {
                org.telegram.ui.ActionBar.j6.C1(org.telegram.ui.ActionBar.j6.r1(0.08f, org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.z6, e6Var)), shapeDrawable);
                h6 h6Var = this.U;
                if (h6Var != null) {
                    h6Var.invalidate();
                }
            }
            org.telegram.ui.ActionBar.r4 r4Var = this.F;
            if (r4Var != null) {
                int w02 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.bm, e6Var);
                r4Var.c.setColor(w02);
                r4Var.w = Integer.valueOf(w02);
                TextView textView = this.V;
                if (textView != null) {
                    textView.invalidate();
                }
            }
            eq eqVar = this.G;
            if (eqVar != null) {
                eqVar.y = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.Fi, e6Var);
                z70 z70Var = this.W;
                if (z70Var != null) {
                    z70Var.invalidate();
                }
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final void d0() {
        if (!this.M0 || this.C0 || this.L0 || !isAttachedToWindow() || Math.abs(getTranslationY()) >= 0.5f || this.O.getHeight() <= 0 || this.k0.getHeight() <= 0) {
            return;
        }
        this.F0 = getBottomYOnScreen();
        this.G0 = Y(this.w);
        this.E0 = true;
    }

    @Override // org.telegram.messenger.is
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.ns.a4) {
            boolean z10 = this.i0;
            i0();
            if (z10 != this.i0) {
                a0();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        this.b.V2.getAlpha();
        l0();
        if (this.m0 != null || this.n0 < 1.0f) {
            m0();
        }
        super.dispatchDraw(canvas);
        d0();
    }

    public final void e0() {
        if (this.L || this.O0) {
            return;
        }
        ki kiVar = this.b;
        if (kiVar.J) {
            return;
        }
        if (!this.M0) {
            this.N0 = true;
            return;
        }
        this.N0 = false;
        EditTextBoldCursor editTextBoldCursor = this.T;
        editTextBoldCursor.setFocusableInTouchMode(true);
        editTextBoldCursor.setShowSoftInputOnFocus(true);
        kiVar.h1(editTextBoldCursor, true);
        editTextBoldCursor.requestFocus();
        org.telegram.messenger.g0.J3(editTextBoldCursor);
        editTextBoldCursor.postDelayed(new kk(this, 1), 220L);
    }

    public final void g0(boolean z10) {
        z70 z70Var = this.W;
        if (z10) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) org.telegram.messenger.hd.M0(2131743084, null));
            spannableStringBuilder.append((CharSequence) " ");
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) org.telegram.messenger.hd.M0(2131743137, null));
            spannableStringBuilder.append((CharSequence) " >");
            eq eqVar = new eq(R.drawable.settings_arrow, 0);
            eqVar.y = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.Fi, this.a);
            float N = org.telegram.messenger.g0.N(0.66f);
            eqVar.r = 0.0f;
            eqVar.s = N;
            this.G = eqVar;
            spannableStringBuilder.setSpan(eqVar, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
            spannableStringBuilder.setSpan(new hi.ha(this, 6), length, spannableStringBuilder.length(), 33);
            z70Var.setText(spannableStringBuilder);
        }
        z70Var.animate().alpha(z10 ? 1.0f : 0.0f).scaleX(z10 ? 1.0f : 0.6f).scaleY(z10 ? 1.0f : 0.6f).setDuration(320L).setInterpolator(er.h).start();
    }

    @Override // org.telegram.ui.Components.ci
    public int getButtonsHideOffset() {
        return org.telegram.messenger.g0.L(62.0f);
    }

    @Override // org.telegram.ui.Components.ci
    public int getCurrentItemTop() {
        int top = this.s.getTop();
        if (top <= 0) {
            top = getListTopPadding();
        }
        return org.telegram.messenger.g0.L(13.0f) + Math.max(0, top - (org.telegram.messenger.g0.L(12.0f) + org.telegram.messenger.g0.m));
    }

    @Override // org.telegram.ui.Components.ci
    public int getCustomBackground() {
        return org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.d6, this.a);
    }

    @Override // org.telegram.ui.Components.ci
    public int getFirstOffset() {
        return org.telegram.messenger.g0.L(5.0f) + getListTopPadding();
    }

    @Override // org.telegram.ui.Components.ci
    public int getListTopPadding() {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.s.getLayoutParams();
        if (layoutParams == null) {
            return 0;
        }
        return layoutParams.topMargin;
    }

    public byte[] getPublicKey() {
        if (this.I == null) {
            return null;
        }
        int i7 = 0;
        while (true) {
            byte[] bArr = this.I;
            if (i7 >= bArr.length) {
                return null;
            }
            if (bArr[i7] != 0) {
                return bArr;
            }
            i7++;
        }
    }

    public final void h0() {
        if (!this.O0 || this.L) {
            return;
        }
        this.N0 = false;
        EditTextBoldCursor editTextBoldCursor = this.T;
        editTextBoldCursor.setShowSoftInputOnFocus(false);
        editTextBoldCursor.setFocusable(false);
        editTextBoldCursor.clearFocus();
        setFocusableInTouchMode(true);
        requestFocus();
    }

    public final void i0() {
        SpannableStringBuilder W;
        k0();
        int i7 = this.n;
        org.telegram.ui.Wallet.l0 x10 = org.telegram.ui.Wallet.l0.x(i7);
        long v = x10.v();
        long gramNanoAmount = getGramNanoAmount();
        long j3 = ((org.telegram.messenger.l0) org.telegram.messenger.np.s1(i7).y7.l0.b).c;
        EditTextBoldCursor editTextBoldCursor = this.T;
        if (gramNanoAmount > 0 && gramNanoAmount < j3) {
            String U = this.v0 ? U(j3, getCurrencyPerGram()) : X(j3);
            editTextBoldCursor.setText(U);
            editTextBoldCursor.setSelection(U.length());
            int i10 = -this.w0;
            this.w0 = i10;
            org.telegram.messenger.g0.F3(i10, editTextBoldCursor, null);
            return;
        }
        boolean z10 = false;
        boolean z11 = WalletEngine2.isValidAddress(this.H) && gramNanoAmount <= v;
        g0(!TextUtils.isEmpty(editTextBoldCursor.getText()) && gramNanoAmount > v);
        String gramsText = getGramsText();
        boolean z12 = this.H == null && this.J;
        hi.d dVar = this.p0;
        dVar.setLoading(z12);
        dVar.i(TextUtils.isEmpty(gramsText) ? org.telegram.messenger.hd.M0(2131743020, null) : org.telegram.messenger.hd.V(null, null, 2131743021, org.telegram.ui.Wallet.l0.l("Grams", gramsText, 2131749507)), true, true);
        boolean isEmpty = TextUtils.isEmpty(editTextBoldCursor.getText());
        boolean z13 = !isEmpty;
        if (!isEmpty && z11 && !this.K) {
            z10 = true;
        }
        dVar.setEnabled(z10);
        o0(z13, this.M0);
        j0();
        this.S.d(org.telegram.ui.Wallet.l0.x(i7), this.v0);
        if (this.v0) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) this.s0).append((CharSequence) " ");
            int length = spannableStringBuilder.length();
            if (this.x0 == null) {
                DecimalFormat decimalFormat = new DecimalFormat("#,##0.##", new DecimalFormatSymbols(Locale.US));
                this.x0 = decimalFormat;
                decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
            }
            spannableStringBuilder.append((CharSequence) this.x0.format(BigDecimal.valueOf(gramNanoAmount).movePointLeft(9)));
            f0(spannableStringBuilder, length, spannableStringBuilder.length(), '.');
            spannableStringBuilder.append((CharSequence) " ");
            int length2 = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) org.telegram.messenger.hd.M0(2131749516, null));
            spannableStringBuilder.setSpan(new RelativeSizeSpan(0.85714287f), length2, spannableStringBuilder.length(), 33);
            W = spannableStringBuilder.append((CharSequence) " ").append((CharSequence) this.r0);
        } else {
            W = W(x10, gramNanoAmount);
        }
        this.U.setText(W);
    }

    @Override // org.telegram.ui.Components.ci
    public final int j() {
        return 1;
    }

    public final void j0() {
        int i7 = this.n;
        org.telegram.ui.Wallet.l0 x10 = org.telegram.ui.Wallet.l0.x(i7);
        this.a0.setText(org.telegram.messenger.hd.V(null, null, 2131743185, org.telegram.ui.Wallet.l0.l("Grams", org.telegram.ui.Wallet.l0.p(x10.v(), true), 2131749507)));
        this.i0 = !x10.F() && x10.v() >= ((org.telegram.messenger.l0) org.telegram.messenger.np.s1(i7).y7.l0.b).c;
        boolean z10 = this.e0 | (!TextUtils.isEmpty(this.T.getText()));
        this.e0 = z10;
        boolean z11 = this.i0 && z10;
        if (this.d0 != z11) {
            this.d0 = z11;
            ValueAnimator valueAnimator = this.g0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.g0 = null;
            }
            float f10 = z11 ? 1.0f : 0.0f;
            if (this.M0 && isAttachedToWindow()) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f0, f10);
                this.g0 = ofFloat;
                ofFloat.setDuration(320L);
                this.g0.setInterpolator(er.h);
                this.g0.addUpdateListener(new c6(this, 11));
                this.g0.start();
            } else {
                setFeeVisibilityProgress(f10);
            }
        }
        long j3 = this.h0;
        TextView textView = this.b0;
        if (j3 >= 0) {
            textView.setText(org.telegram.messenger.hd.V(null, null, 2131743072, org.telegram.ui.Wallet.l0.s(j3, false)));
        } else {
            textView.setText(org.telegram.messenger.hd.V(null, null, 2131743072, this.c0));
        }
    }

    @Override // org.telegram.ui.Components.ci
    public final boolean k() {
        if (this.b.p3.Q() <= org.telegram.messenger.g0.L(20.0f)) {
            return false;
        }
        this.N0 = false;
        di.x2 x2Var = this.P0;
        if (x2Var != null) {
            removeCallbacks(x2Var);
            this.P0 = null;
        }
        EditTextBoldCursor editTextBoldCursor = this.T;
        editTextBoldCursor.clearFocus();
        org.telegram.messenger.g0.v1(editTextBoldCursor);
        return true;
    }

    public final void k0() {
        TextView textView;
        LinearLayout linearLayout = this.P;
        if (linearLayout == null || (textView = this.R) == null) {
            return;
        }
        final boolean z10 = getGramNanoAmount() > 0 || this.V.getVisibility() == 0 || this.z0;
        if (z10 == this.V0) {
            return;
        }
        this.V0 = z10;
        linearLayout.setVisibility(0);
        textView.setVisibility(0);
        final int i7 = 0;
        ViewPropertyAnimator duration = linearLayout.animate().alpha(z10 ? 1.0f : 0.0f).scaleX(z10 ? 1.0f : 0.8f).scaleY(z10 ? 1.0f : 0.8f).withEndAction(new Runnable(this) { // from class: org.telegram.ui.Components.mk
            public final /* synthetic */ qk b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i7) {
                    case 0:
                        this.b.P.setVisibility(z10 ? 0 : 4);
                        break;
                    default:
                        this.b.R.setVisibility(!z10 ? 0 : 4);
                        break;
                }
            }
        }).setDuration(320L);
        er erVar = er.h;
        duration.setInterpolator(erVar).start();
        final int i10 = 1;
        textView.animate().alpha(z10 ? 0.0f : 1.0f).scaleX(!z10 ? 1.0f : 0.8f).scaleY(z10 ? 0.8f : 1.0f).withEndAction(new Runnable(this) { // from class: org.telegram.ui.Components.mk
            public final /* synthetic */ qk b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i10) {
                    case 0:
                        this.b.P.setVisibility(z10 ? 0 : 4);
                        break;
                    default:
                        this.b.R.setVisibility(!z10 ? 0 : 4);
                        break;
                }
            }
        }).setDuration(320L).setInterpolator(erVar).start();
    }

    public final void l0() {
        float f10;
        View view = this.O;
        if (view.getHeight() > 0) {
            if (this.k0.getHeight() <= 0) {
                return;
            }
            float Y = Y(this.s);
            org.telegram.ui.Wallet.s8 s8Var = this.w;
            if (s8Var.getVisibility() == 0) {
                f10 = Math.max(Y, (s8Var.getScaleY() * (s8Var.getContentBottom() - s8Var.getPivotY())) + s8Var.getPivotY() + Y(s8Var));
            } else {
                f10 = Y;
            }
            float max = Math.max(0.0f, Math.min(Math.min(Math.min((Y + r2.getHeight()) - ((FrameLayout.LayoutParams) r1.getLayoutParams()).bottomMargin, Z(this.a0)), Z(this.b0)), Z(this.p0)) - f10);
            float min = Math.min(1.0f, Math.max(0.0f, max - (Math.min(org.telegram.messenger.g0.L(12.0f), max / 4.0f) * 2.0f)) / view.getHeight());
            view.setPivotX(view.getWidth() / 2.0f);
            view.setPivotY(view.getHeight() / 2.0f);
            view.setScaleX(min);
            view.setScaleY(min);
            view.setTranslationY(((max / 2.0f) + f10) - ((view.getHeight() / 2.0f) + (Y(view) - view.getTranslationY())));
        }
    }

    public final void m0() {
        float max = Math.max(this.o0, Math.max(0.0f, Math.min(1.0f, this.n0)));
        this.o0 = max;
        float f10 = 1.0f - max;
        float f11 = this.n0;
        boolean z10 = this.m0 == null && f11 == 1.0f;
        org.telegram.ui.Wallet.o9 o9Var = this.S;
        o9Var.e(f11, max, z10);
        o9Var.setTranslationY((1.0f - this.n0) * (((this.O.getHeight() / 2.0f) - o9Var.getTop()) - (o9Var.getHeight() / 2.0f)));
        float f12 = this.o0;
        h6 h6Var = this.U;
        h6Var.setAlpha(f12);
        h6Var.setTranslationY(org.telegram.messenger.g0.L(16.0f) * f10);
        float f13 = this.o0;
        FrameLayout frameLayout = this.Q;
        frameLayout.setAlpha(f13);
        frameLayout.setTranslationY(org.telegram.messenger.g0.L(16.0f) * f10);
        float f14 = this.o0;
        FrameLayout frameLayout2 = this.l0;
        frameLayout2.setAlpha(f14);
        frameLayout2.setTranslationY(org.telegram.messenger.g0.L(24.0f) * f10);
    }

    @Override // org.telegram.ui.Components.ci
    public final void n(float f10, float f11) {
        this.A0 = f10;
        this.B0 = f11;
        n0();
    }

    public final void n0() {
        if (!this.C0 || this.O.getHeight() <= 0) {
            return;
        }
        FrameLayout frameLayout = this.k0;
        if (frameLayout.getHeight() <= 0) {
            return;
        }
        float f10 = this.D0 ? this.B0 : 1.0f - this.B0;
        float f11 = this.J0;
        float z10 = com.google.android.gms.internal.vision.e2.z(this.K0, f11, f10, f11);
        float f12 = this.H0;
        float z11 = com.google.android.gms.internal.vision.e2.z(this.I0, f12, f10, f12);
        frameLayout.setTranslationY(z10 - (getBottomYOnScreen() - frameLayout.getTranslationY()));
        org.telegram.ui.Wallet.s8 s8Var = this.w;
        s8Var.setTranslationY(z11 - (Y(s8Var) - s8Var.getTranslationY()));
        l0();
    }

    public final void o0(boolean z10, boolean z11) {
        if (z11 && this.q0 == z10) {
            return;
        }
        this.q0 = z10;
        hi.d dVar = this.p0;
        dVar.animate().cancel();
        TextView textView = this.a0;
        textView.animate().cancel();
        TextView textView2 = this.b0;
        textView2.animate().cancel();
        float f10 = z10 ? 1.0f : 0.0f;
        float f11 = z10 ? 1.0f : 0.8f;
        float L = z10 ? 0.0f : org.telegram.messenger.g0.L(60.0f);
        if (z11) {
            dVar.setVisibility(0);
            ViewPropertyAnimator duration = dVar.animate().alpha(f10).scaleX(f11).scaleY(f11).setDuration(320L);
            er erVar = er.h;
            duration.setInterpolator(erVar).withEndAction(new kk(this, 5)).start();
            textView.animate().translationY(L).setDuration(320L).setInterpolator(erVar).start();
            textView2.animate().translationY(L).setDuration(320L).setInterpolator(erVar).start();
            return;
        }
        dVar.setVisibility(z10 ? 0 : 4);
        dVar.setAlpha(f10);
        dVar.setScaleX(f11);
        dVar.setScaleY(f11);
        textView.setTranslationY(L);
        textView2.setTranslationY(L);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        if (this.L0) {
            this.L0 = false;
            this.O.setTranslationY(0.0f);
            this.k0.setTranslationY(0.0f);
            this.w.setTranslationY(0.0f);
            d0();
        } else if (this.C0) {
            n0();
        }
        l0();
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z10) {
        if (!z10) {
            h0();
        }
        super.onWindowFocusChanged(z10);
    }

    @Override // org.telegram.ui.Components.ci
    public final void p() {
        if (this.L) {
            return;
        }
        this.L = true;
        T();
        org.telegram.ui.Wallet.o6 o6Var = this.R0;
        if (o6Var != null) {
            AnimatorSet animatorSet = o6Var.m;
            if (!o6Var.v) {
                if (animatorSet.isStarted()) {
                    animatorSet.cancel();
                } else {
                    o6Var.a(false);
                }
            }
            this.R0 = null;
        }
        org.telegram.ui.Wallet.da daVar = this.S0;
        if (daVar != null) {
            AnimatorSet animatorSet2 = daVar.m;
            if (!daVar.s) {
                if (animatorSet2.isStarted()) {
                    animatorSet2.cancel();
                } else {
                    daVar.b();
                }
            }
            this.S0 = null;
        }
        ValueAnimator valueAnimator = this.g0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.g0 = null;
        }
        Activity activity = this.M;
        if (activity != null) {
            try {
                activity.setRequestedOrientation(this.N);
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
            this.M = null;
        }
        this.P.animate().cancel();
        this.R.animate().cancel();
        this.W.animate().cancel();
        this.p0.animate().cancel();
        this.a0.animate().cancel();
        this.b0.animate().cancel();
        di.x2 x2Var = this.P0;
        if (x2Var != null) {
            removeCallbacks(x2Var);
            this.P0 = null;
        }
        org.telegram.ui.ActionBar.t1 t1Var = this.U0;
        if (t1Var != null) {
            t1Var.dismiss();
        }
        org.telegram.ui.Wallet.l lVar = this.j0;
        if (lVar != null) {
            lVar.run();
            this.j0 = null;
        }
        org.telegram.messenger.ns.f(this.n).n(this, org.telegram.messenger.ns.a4);
        this.b.V2.s().removeView(this.x);
        org.telegram.messenger.g0.v1(this.T);
    }

    public void setSendTransitionProgress(float f10) {
        this.w.setAlpha(1.0f - f10);
    }

    @Override // android.view.View
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        this.b.b.invalidate();
    }

    @Override // org.telegram.ui.Components.ci
    public final void u() {
        T();
        Activity activity = this.M;
        if (activity != null) {
            try {
                activity.setRequestedOrientation(this.N);
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
            this.M = null;
        }
        this.b.V2.setDrawGlassTitle(true);
        this.M0 = false;
        this.N0 = false;
        di.x2 x2Var = this.P0;
        if (x2Var != null) {
            removeCallbacks(x2Var);
            this.P0 = null;
        }
        org.telegram.ui.ActionBar.t1 t1Var = this.U0;
        if (t1Var != null) {
            t1Var.dismiss();
        }
        this.x.setVisibility(8);
        EditTextBoldCursor editTextBoldCursor = this.T;
        org.telegram.messenger.g0.v1(editTextBoldCursor);
        editTextBoldCursor.clearFocus();
    }

    @Override // org.telegram.ui.Components.ci
    public final void w(int i7) {
        if (i7 == 2) {
            org.telegram.ui.Wallet.y5.J0(this.n, getContext(), this.a);
        } else if (i7 == 3) {
            b0();
        }
    }

    @Override // org.telegram.ui.Components.ci
    public final void y() {
        if (this.C0) {
            this.C0 = false;
            float bottomYOnScreen = getBottomYOnScreen();
            FrameLayout frameLayout = this.k0;
            frameLayout.setTranslationY(this.K0 - (bottomYOnScreen - frameLayout.getTranslationY()));
            org.telegram.ui.Wallet.s8 s8Var = this.w;
            s8Var.setTranslationY(this.I0 - (Y(s8Var) - s8Var.getTranslationY()));
            this.L0 = true;
            requestLayout();
        }
    }

    @Override // org.telegram.ui.Components.ci
    public final void z(int i7, boolean z10) {
        this.C0 = true;
        this.L0 = false;
        this.D0 = z10;
        this.B0 = z10 ? 0.0f : 1.0f;
        this.J0 = this.E0 ? this.F0 : getBottomYOnScreen();
        boolean z11 = this.E0;
        org.telegram.ui.Wallet.s8 s8Var = this.w;
        this.H0 = z11 ? this.G0 : Y(s8Var);
        this.K0 = getBottomYOnScreen() - this.k0.getTranslationY();
        this.I0 = Y(s8Var) - s8Var.getTranslationY();
        n0();
    }
}
