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

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class ik extends vh implements org.telegram.messenger.ls {
    public float A0;
    public boolean B0;
    public boolean C0;
    public final ShapeDrawable D;
    public boolean D0;
    public final org.telegram.ui.ActionBar.t4 E;
    public float E0;
    public wp F;
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
    public final fk N;
    public boolean N0;
    public final LinearLayout O;
    public bi.r3 O0;
    public final FrameLayout P;
    public TL_wallet.walletTransaction P0;
    public final TextView Q;
    public org.telegram.ui.Wallet.o6 Q0;
    public final org.telegram.ui.Wallet.m9 R;
    public org.telegram.ui.Wallet.ba R0;
    public final EditTextBoldCursor S;
    public boolean S0;
    public final j6 T;
    public org.telegram.ui.ActionBar.u1 T0;
    public final TextView U;
    public boolean U0;
    public final w70 V;
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
    public r1.g l0;
    public float m0;
    public final int n;
    public float n0;
    public final fi.d o0;
    public boolean p0;
    public final SpannableString q0;
    public final TLRPC.User r;
    public final SpannableString r0;
    public final FrameLayout s;
    public String s0;
    public boolean t0;
    public boolean u0;
    public int v0;
    public final org.telegram.ui.Wallet.r8 w;
    public DecimalFormat w0;
    public final org.telegram.ui.ActionBar.r0 x;
    public final int[] x0;
    public final org.telegram.ui.ActionBar.r0 y;
    public boolean y0;
    public float z0;

    public ik(di diVar, Context context, int i7, TLRPC.User user, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, f6Var, diVar);
        this.g0 = -1L;
        this.m0 = 1.0f;
        this.n0 = 1.0f;
        final int i10 = 1;
        this.t0 = true;
        this.v0 = 6;
        this.x0 = new int[2];
        this.n = i7;
        this.r = user;
        FrameLayout frameLayout = new FrameLayout(context);
        this.s = frameLayout;
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        addView(frameLayout, c8.ha.e(-1, -1, 55));
        org.telegram.ui.ActionBar.r0 a10 = this.b.R2.q().a(31, R.drawable.ic_ab_other);
        this.x = a10;
        a10.setContentDescription(org.telegram.messenger.hd.M0(2131754839, null));
        a10.e(2, R.drawable.msg_addbot, org.telegram.messenger.hd.M0(2131743138, null));
        a10.e(3, R.drawable.menu_comments, org.telegram.messenger.hd.M0(2131743206, null));
        a10.setVisibility(8);
        org.telegram.ui.ActionBar.r0 r0Var = new org.telegram.ui.ActionBar.r0(context, null, 0, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.G6, this.a), false, f6Var);
        this.y = r0Var;
        r0Var.setIcon(R.drawable.ic_ab_other);
        r0Var.setContentDescription(org.telegram.messenger.hd.M0(2131754839, null));
        int i11 = org.telegram.ui.ActionBar.k6.i6;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.w0(i11, this.a), 1, -1);
        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i11);
        r0Var.setBackground(h02);
        org.telegram.ui.ActionBar.r6.k(r0Var, h02, null, N, f6Var);
        r0Var.setOnClickListener(new bi.la(this, f6Var, i7, 8));
        org.telegram.ui.Wallet.r8 r8Var = new org.telegram.ui.Wallet.r8(context, new f(21, this, user), new f(22, this, f6Var), f6Var);
        this.w = r8Var;
        r8Var.a(this.G, user);
        addView(r8Var, c8.ha.d(-2, 64.0f, 49, 6.0f, 0.0f, 6.0f, 0.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setClipChildren(false);
        frameLayout2.setClipToPadding(false);
        frameLayout.addView(frameLayout2, c8.ha.e(-1, -1, 55));
        fk fkVar = new fk(context);
        this.N = fkVar;
        fkVar.setOrientation(1);
        fkVar.setClipChildren(false);
        fkVar.setClipToPadding(false);
        final int i12 = 3;
        fkVar.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.xj
            public final /* synthetic */ ik b;

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
                        ik.O(this.b);
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
                        ik.Q(this.b);
                        break;
                }
            }
        });
        frameLayout2.addView(fkVar, c8.ha.e(-1, -2, 17));
        org.telegram.ui.Wallet.m9 m9Var = new org.telegram.ui.Wallet.m9(context, f6Var);
        this.R = m9Var;
        final int i13 = 4;
        m9Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.xj
            public final /* synthetic */ ik b;

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
                        ik.O(this.b);
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
                        ik.Q(this.b);
                        break;
                }
            }
        });
        fkVar.addView(m9Var, c8.ha.t(-1, 64, 49, 16, 0, 16, 0));
        EditTextBoldCursor editText = m9Var.getEditText();
        this.S = editText;
        int i14 = 0;
        editText.setFilters(new InputFilter[]{new yj(i14, this)});
        editText.setImeOptions(33554438);
        editText.setOnTouchListener(new zj(this, i14));
        final int i15 = 5;
        editText.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.xj
            public final /* synthetic */ ik b;

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
                        ik.O(this.b);
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
                        ik.Q(this.b);
                        break;
                }
            }
        });
        editText.setOnEditorActionListener(new t0(this, i10));
        editText.addTextChangedListener(new gk(this));
        SpannableString spannableString = new SpannableString("⇅");
        this.q0 = spannableString;
        wp wpVar = new wp(R.drawable.wallet_currency_exchange, 0);
        wpVar.x = 0.72f;
        spannableString.setSpan(wpVar, 0, spannableString.length(), 33);
        SpannableString spannableString2 = new SpannableString("G");
        this.r0 = spannableString2;
        wp wpVar2 = new wp(R.drawable.wallet_gram_small, 0);
        wpVar2.d = false;
        spannableString2.setSpan(wpVar2, 0, spannableString2.length(), 33);
        j6 j6Var = new j6(context, false, true, true, true, true);
        this.T = j6Var;
        j6Var.c.m(0.35f, 320L, 3.5f, xq.h);
        j6Var.setScaleProperty(0.35f);
        j6Var.setText(V(org.telegram.ui.Wallet.n0.x(i7), 0L));
        int i16 = org.telegram.ui.ActionBar.k6.d6;
        int i17 = org.telegram.ui.ActionBar.k6.z6;
        org.telegram.ui.ActionBar.n6 q10 = org.telegram.ui.ActionBar.r6.q(i16, i17);
        org.telegram.ui.ActionBar.r6.n(j6Var, q10.a, q10.b, 4, 0.0f, f6Var);
        j6Var.setTextSize(org.telegram.messenger.g0.L(14.0f));
        j6Var.setTypeface(org.telegram.messenger.g0.o1("fonts/gram.ttf"));
        j6Var.setGravity(17);
        j6Var.setPadding(org.telegram.messenger.g0.L(10.0f), 0, org.telegram.messenger.g0.L(10.0f), 0);
        j6Var.setAllowCancel(true);
        ShapeDrawable d02 = org.telegram.ui.ActionBar.k6.d0(org.telegram.messenger.g0.L(14.0f), org.telegram.ui.ActionBar.k6.r1(0.08f, org.telegram.ui.ActionBar.k6.w0(i17, this.a)));
        this.D = d02;
        j6Var.setSizeableBackground(d02);
        fkVar.addView(j6Var, c8.ha.t(-2, 28, 49, 0, 8, 0, 0));
        c8.ka.a(j6Var);
        final int i18 = 6;
        j6Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.xj
            public final /* synthetic */ ik b;

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
                        ik.O(this.b);
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
                        ik.Q(this.b);
                        break;
                }
            }
        });
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.P = frameLayout3;
        fkVar.addView(frameLayout3, c8.ha.r(-2, -2, 49));
        LinearLayout linearLayout = new LinearLayout(context);
        this.O = linearLayout;
        linearLayout.setOrientation(1);
        frameLayout3.addView(linearLayout, c8.ha.e(-2, -2, 49));
        TextView textView = new TextView(context);
        this.Q = textView;
        textView.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.r6.V(textView, i17, f6Var);
        textView.setPadding(org.telegram.messenger.g0.L(10.0f), 0, org.telegram.messenger.g0.L(10.0f), 0);
        org.telegram.messenger.k5.m(textView, 17, null, 2131743008);
        frameLayout3.addView(textView, c8.ha.d(-2, 28.0f, 49, 0.0f, 8.0f, 0.0f, 0.0f));
        c8.ka.a(textView);
        final int i19 = 0;
        textView.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.xj
            public final /* synthetic */ ik b;

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
                        ik.O(this.b);
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
                        ik.Q(this.b);
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
        org.telegram.ui.ActionBar.t4 t4Var = new org.telegram.ui.ActionBar.t4(0, true, false, null);
        this.E = t4Var;
        t4Var.x = false;
        Paint.Style style = Paint.Style.STROKE;
        Paint paint = t4Var.c;
        paint.setStyle(style);
        paint.setStrokeWidth(Math.max(1.0f, org.telegram.messenger.g0.N(0.5f)));
        int i20 = org.telegram.ui.ActionBar.k6.Yl;
        paint.setColor(org.telegram.ui.ActionBar.k6.w0(i20, this.a));
        t4Var.w = Integer.valueOf(org.telegram.ui.ActionBar.k6.w0(i20, this.a));
        textView2.setPadding(org.telegram.messenger.g0.L(15.0f), org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(19.0f), org.telegram.messenger.g0.L(8.0f));
        textView2.setBackground(t4Var);
        textView2.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.r6.V(textView2, i17, f6Var);
        textView2.setTypeface(org.telegram.messenger.g0.o());
        textView2.setVisibility(8);
        textView2.setEllipsize(TextUtils.TruncateAt.END);
        textView2.setMaxLines(4);
        linearLayout.addView(textView2, c8.ha.t(-2, -2, 49, 32, 12, 32, 0));
        textView2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.xj
            public final /* synthetic */ ik b;

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
                        ik.O(this.b);
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
                        ik.Q(this.b);
                        break;
                }
            }
        });
        c8.ka.b(textView2, 0.02f, 1.2f);
        w70 w70Var = new w70(context, f6Var);
        this.V = w70Var;
        org.telegram.ui.ActionBar.r6.V(w70Var, org.telegram.ui.ActionBar.k6.q7, f6Var);
        org.telegram.ui.ActionBar.r6.H(w70Var, org.telegram.ui.ActionBar.k6.Ci, f6Var);
        w70Var.setTextSize(1, 14.0f);
        w70Var.setGravity(17);
        w70Var.setTypeface(org.telegram.messenger.g0.o());
        w70Var.setPadding(org.telegram.messenger.g0.L(10.0f), 0, org.telegram.messenger.g0.L(10.0f), 0);
        g0(false);
        linearLayout.addView(w70Var, c8.ha.t(-2, -2, 49, 0, 10, 0, 0));
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.j0 = frameLayout4;
        frameLayout4.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(12.0f));
        FrameLayout frameLayout5 = new FrameLayout(context);
        this.k0 = frameLayout5;
        frameLayout4.setClipChildren(false);
        frameLayout4.setClipToPadding(false);
        frameLayout5.setClipChildren(false);
        frameLayout5.setClipToPadding(false);
        frameLayout4.addView(frameLayout5, c8.ha.c(-1.0f, -1));
        TextView textView3 = new TextView(context);
        this.W = textView3;
        org.telegram.ui.ActionBar.r6.V(textView3, i17, f6Var);
        textView3.setTextSize(1, 14.0f);
        textView3.setGravity(17);
        frameLayout5.addView(textView3, c8.ha.e(-1, 20, 55));
        TextView textView4 = new TextView(context);
        this.a0 = textView4;
        org.telegram.ui.ActionBar.r6.V(textView4, i17, f6Var);
        textView4.setTextSize(1, 14.0f);
        textView4.setGravity(17);
        textView4.setPadding(0, org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f));
        textView4.setVisibility(8);
        frameLayout5.addView(textView4, c8.ha.d(-1, -2.0f, 55, 0.0f, 24.0f, 0.0f, 0.0f));
        SpannableString spannableString3 = new SpannableString(org.telegram.messenger.hd.M0(2131748778, null));
        this.b0 = spannableString3;
        spannableString3.setSpan(new b80(org.telegram.messenger.g0.L(80.0f), textView4), 0, spannableString3.length(), 33);
        fi.d h = org.telegram.messenger.k5.h(24, context, f6Var, true);
        this.o0 = h;
        h.setText(org.telegram.messenger.hd.M0(2131743021, null));
        h.setEnabled(false);
        final int i21 = 2;
        h.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.xj
            public final /* synthetic */ ik b;

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
                        ik.O(this.b);
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
                        ik.Q(this.b);
                        break;
                }
            }
        });
        frameLayout5.addView(h, c8.ha.e(-1, 48, 87));
        frameLayout.addView(frameLayout4, c8.ha.d(-1, 92.0f, 87, 0.0f, 0.0f, 0.0f, 70.0f));
        o0(false, false);
        org.telegram.messenger.qs.f(i7).c(this, org.telegram.messenger.qs.a4);
        j0();
        this.I = true;
        org.telegram.ui.Wallet.n0.x(i7).a0(user, new bk(this, 0));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16, types: [org.telegram.tgnet.tl.TL_wallet$walletTransaction] */
    /* JADX WARN: Type inference failed for: r4v17 */
    public static void O(final ik ikVar) {
        ?? r42;
        EditTextBoldCursor editTextBoldCursor = ikVar.S;
        int i7 = ikVar.n;
        fi.d dVar = ikVar.o0;
        if (!dVar.c0 || dVar.Q) {
            return;
        }
        org.telegram.ui.Wallet.n0 x10 = org.telegram.ui.Wallet.n0.x(i7);
        long gramNanoAmount = ikVar.getGramNanoAmount();
        long v = x10.v();
        if (!WalletEngine2.isValidAddress(ikVar.G) || gramNanoAmount <= 0) {
            return;
        }
        long j3 = ((org.telegram.messenger.l0) org.telegram.messenger.qp.s1(i7).x7.l0.b).c;
        if (gramNanoAmount < j3) {
            String T = ikVar.u0 ? ikVar.T(j3, ikVar.getCurrencyPerGram()) : W(j3);
            editTextBoldCursor.setText(T);
            editTextBoldCursor.setSelection(T.length());
            int i10 = -ikVar.v0;
            ikVar.v0 = i10;
            org.telegram.messenger.g0.G3(i10, editTextBoldCursor, null);
            return;
        }
        if (gramNanoAmount > v) {
            org.telegram.messenger.p2.D.a();
            w70 w70Var = ikVar.V;
            int i11 = -ikVar.v0;
            ikVar.v0 = i11;
            org.telegram.messenger.g0.G3(i11, w70Var, null);
            return;
        }
        org.telegram.messenger.qp s12 = org.telegram.messenger.qp.s1(i7);
        long N1 = s12.N1(ikVar.r.id);
        org.telegram.messenger.p0 p0Var = s12.x7;
        ikVar.S0 = ((org.telegram.messenger.h0) p0Var.k0.b).c && N1 > 0 && (((double) gramNanoAmount) / 1.0E9d) * ((org.telegram.messenger.i0) p0Var.l.b).a < (((double) N1) / 1000.0d) * ((double) s12.c6);
        dVar.setLoading(true);
        ikVar.N0 = true;
        ikVar.M0 = false;
        bi.r3 r3Var = ikVar.O0;
        if (r3Var != null) {
            ikVar.removeCallbacks(r3Var);
            r42 = 0;
            ikVar.O0 = null;
        } else {
            r42 = 0;
        }
        ikVar.P0 = r42;
        TLRPC.User user = ikVar.r;
        String str = ikVar.G;
        String str2 = ikVar.s0;
        byte[] publicKey = ikVar.t0 ? ikVar.getPublicKey() : r42;
        final int i12 = 0;
        org.telegram.messenger.c20 c20Var = new org.telegram.messenger.c20(ikVar) { // from class: org.telegram.ui.Components.dk
            public final /* synthetic */ ik b;

            {
                this.b = ikVar;
            }

            @Override // org.telegram.messenger.c20
            public final void a(Object obj) {
                switch (i12) {
                    case 0:
                        String str3 = (String) obj;
                        ik ikVar2 = this.b;
                        fi.d dVar2 = ikVar2.o0;
                        di diVar = ikVar2.b;
                        if (!ikVar2.K && !diVar.I) {
                            if (!"PASSCODE_FAILED".equalsIgnoreCase(str3)) {
                                if (!TextUtils.isEmpty(str3)) {
                                    dVar2.setLoading(false);
                                    ikVar2.N0 = false;
                                    hc.X().e0(str3, false);
                                    break;
                                } else {
                                    diVar.dismiss();
                                    break;
                                }
                            } else {
                                dVar2.setLoading(false);
                                ikVar2.N0 = false;
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
        final int i13 = 1;
        x10.d0(user, str, gramNanoAmount, str2, publicKey, null, null, c20Var, new org.telegram.messenger.c20(ikVar) { // from class: org.telegram.ui.Components.dk
            public final /* synthetic */ ik b;

            {
                this.b = ikVar;
            }

            @Override // org.telegram.messenger.c20
            public final void a(Object obj) {
                switch (i13) {
                    case 0:
                        String str3 = (String) obj;
                        ik ikVar2 = this.b;
                        fi.d dVar2 = ikVar2.o0;
                        di diVar = ikVar2.b;
                        if (!ikVar2.K && !diVar.I) {
                            if (!"PASSCODE_FAILED".equalsIgnoreCase(str3)) {
                                if (!TextUtils.isEmpty(str3)) {
                                    dVar2.setLoading(false);
                                    ikVar2.N0 = false;
                                    hc.X().e0(str3, false);
                                    break;
                                } else {
                                    diVar.dismiss();
                                    break;
                                }
                            } else {
                                dVar2.setLoading(false);
                                ikVar2.N0 = false;
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

    public static void Q(ik ikVar) {
        EditTextBoldCursor editTextBoldCursor = ikVar.S;
        BigDecimal currencyPerGram = ikVar.getCurrencyPerGram();
        if (ikVar.u0 || currencyPerGram.signum() > 0) {
            long gramNanoAmount = ikVar.getGramNanoAmount();
            ikVar.u0 = !ikVar.u0;
            ikVar.R.d(org.telegram.ui.Wallet.n0.x(ikVar.n), ikVar.u0);
            String T = gramNanoAmount <= 0 ? "" : ikVar.u0 ? ikVar.T(gramNanoAmount, currencyPerGram) : W(gramNanoAmount);
            editTextBoldCursor.setText(T);
            editTextBoldCursor.setSelection(T.length());
        }
    }

    public static /* synthetic */ CharSequence R(ik ikVar, CharSequence charSequence, int i7, int i10, Spanned spanned, int i11, int i12) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(spanned.subSequence(0, i11).toString());
        sb2.append((Object) charSequence.subSequence(i7, i10));
        sb2.append((Object) spanned.subSequence(i12, spanned.length()));
        String sb3 = sb2.toString();
        int i13 = 9;
        BigDecimal valueOf = BigDecimal.valueOf(Long.MAX_VALUE, 9);
        if (ikVar.u0) {
            BigDecimal currencyPerGram = ikVar.getCurrencyPerGram();
            valueOf = valueOf.multiply(currencyPerGram);
            i13 = U(currencyPerGram);
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
        boolean z9 = false;
        for (int i14 = 0; i14 < sb3.length(); i14++) {
            char charAt = sb3.charAt(i14);
            if (charAt == '.' || charAt == ',') {
                if (z9) {
                    return spanned.subSequence(i11, i12);
                }
                z9 = true;
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

    public static int U(BigDecimal bigDecimal) {
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

    public static String W(long j3) {
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
        return X(this.j0);
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
        return selectedCurrencyRate != null ? selectedCurrencyRate.exp : TextUtils.equals(org.telegram.ui.Wallet.n0.x(this.n).h.g(), "USD") ? 2 : 0;
    }

    private BigDecimal getCurrencyPerGram() {
        int i7 = this.n;
        org.telegram.ui.Wallet.f fVar = org.telegram.ui.Wallet.n0.x(i7).h;
        fVar.f();
        double h = fVar.h();
        double d = ((org.telegram.messenger.i0) org.telegram.messenger.qp.s1(i7).x7.l.b).a;
        return (h <= 0.0d || d <= 0.0d || Double.isNaN(h) || Double.isInfinite(h) || Double.isNaN(d) || Double.isInfinite(d)) ? BigDecimal.ZERO : BigDecimal.valueOf(h).multiply(BigDecimal.valueOf(d));
    }

    private long getGramNanoAmount() {
        BigDecimal c02 = c0(this.S.getText().toString());
        if (this.u0) {
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
        if (this.V0 == null) {
            this.V0 = new DecimalFormat("#,##0.#########", new DecimalFormatSymbols(Locale.US));
        }
        return gramNanoAmount > 0 ? this.V0.format(BigDecimal.valueOf(gramNanoAmount, 9)) : "";
    }

    private TL_wallet.currencyRate getSelectedCurrencyRate() {
        org.telegram.ui.Wallet.f fVar = org.telegram.ui.Wallet.n0.x(this.n).h;
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
        this.e0 = f10;
        TextView textView = this.a0;
        textView.setAlpha(f10);
        textView.setVisibility(f10 > 0.0f ? 0 : 8);
        requestLayout();
    }

    @Override // org.telegram.ui.Components.vh
    public final void A() {
        S();
        h0();
    }

    @Override // org.telegram.ui.Components.vh
    public final void B(int i7, int i10) {
        int i11;
        di diVar = this.b;
        boolean z9 = diVar.l3.Q() > org.telegram.messenger.g0.L(20.0f);
        this.y0 = z9;
        this.f = z9;
        int L = z9 ? 0 : org.telegram.messenger.g0.L(70.0f);
        int round = Math.round(org.telegram.messenger.g0.L(32.0f) * this.e0) + org.telegram.messenger.g0.L(92.0f);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.j0.getLayoutParams();
        layoutParams.height = round;
        layoutParams.bottomMargin = L;
        if (this.y0) {
            i11 = org.telegram.messenger.g0.L(56.0f);
            diVar.q0 = false;
        } else {
            if (!org.telegram.messenger.g0.Q1()) {
                Point point = org.telegram.messenger.g0.q;
                if (point.x > point.y) {
                    i11 = (int) (i10 / 3.5f);
                    diVar.q0 = true;
                }
            }
            i11 = (i10 / 5) * 2;
            diVar.q0 = true;
        }
        int e10 = jg.g.e(1.0f, i11, 0) + org.telegram.messenger.g0.m;
        FrameLayout frameLayout = this.s;
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
        if (layoutParams2.topMargin != e10) {
            layoutParams2.topMargin = e10;
            frameLayout.setLayoutParams(layoutParams2);
        }
        int b10 = org.telegram.messenger.k5.b(4.0f, e10 - org.telegram.messenger.g0.m, 0);
        org.telegram.ui.Wallet.r8 r8Var = this.w;
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) r8Var.getLayoutParams();
        int max = Math.max(0, this.y0 ? org.telegram.messenger.g0.L(4.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() : b10 - org.telegram.messenger.g0.L(4.0f));
        if (layoutParams3.topMargin != max) {
            layoutParams3.topMargin = max;
            r8Var.setLayoutParams(layoutParams3);
        }
        k0();
    }

    @Override // org.telegram.ui.Components.vh
    public final void H(vh vhVar) {
        Activity W;
        S();
        if (this.L == null && !org.telegram.messenger.g0.Q1()) {
            Point point = org.telegram.messenger.g0.q;
            if (Math.min(point.x, point.y) < org.telegram.messenger.g0.L(700.0f) && (W = org.telegram.messenger.g0.W(getContext())) != null) {
                try {
                    this.M = W.getRequestedOrientation();
                    W.setRequestedOrientation(1);
                    this.L = W;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
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
        org.telegram.ui.Wallet.r8 r8Var = this.w;
        r8Var.setTranslationY(0.0f);
        r8Var.setAlpha(1.0f);
        this.D0 = false;
        di diVar = this.b;
        diVar.R2.setTitle(org.telegram.messenger.hd.M0(2131743017, null));
        diVar.R2.setDrawGlassTitle(false);
        this.x.setVisibility(0);
        editTextBoldCursor.clearFocus();
        a0();
        org.telegram.ui.Wallet.m9 m9Var = this.R;
        float f10 = m9Var.getDiamondView().f == null ? 1.0f : 0.0f;
        this.n0 = f10;
        this.m0 = f10;
        m0();
        if (this.m0 < 1.0f) {
            m9Var.getDiamondView().l(new ck(this, 3));
        }
    }

    @Override // org.telegram.ui.Components.vh
    public final void I() {
        this.L0 = true;
        post(new ck(this, 4));
    }

    @Override // org.telegram.ui.Components.vh
    public final boolean N() {
        return !this.N0;
    }

    public final void S() {
        this.R.getDiamondView().l(null);
        r1.g gVar = this.l0;
        if (gVar != null) {
            gVar.d();
        }
        this.m0 = 1.0f;
        m0();
    }

    public final String T(long j3, BigDecimal bigDecimal) {
        BigDecimal movePointLeft = BigDecimal.valueOf(j3).multiply(bigDecimal).movePointLeft(9);
        int max = Math.max(0, Math.min(getCurrencyFractionDigits(), 20));
        RoundingMode roundingMode = RoundingMode.HALF_UP;
        BigDecimal scale = movePointLeft.setScale(max, roundingMode);
        if (scale.signum() == 0 && movePointLeft.signum() != 0) {
            scale = movePointLeft.setScale(Math.min(20, Math.max(max, movePointLeft.scale())), roundingMode);
        }
        int U = U(bigDecimal);
        if (scale.scale() > U) {
            scale = scale.setScale(U, RoundingMode.DOWN);
        }
        BigDecimal multiply = BigDecimal.valueOf(Long.MAX_VALUE, 9).multiply(bigDecimal);
        if (scale.compareTo(multiply) > 0) {
            scale = multiply.setScale(scale.scale(), RoundingMode.DOWN);
        }
        return (scale.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : scale.stripTrailingZeros()).toPlainString();
    }

    public final SpannableStringBuilder V(org.telegram.ui.Wallet.n0 n0Var, long j3) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("≈ ");
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append(n0Var.m(j3, false));
        f0(spannableStringBuilder, length, spannableStringBuilder.length(), getCurrencyDecimalSeparator());
        return spannableStringBuilder.append((CharSequence) " ").append((CharSequence) this.q0);
    }

    public final float X(View view) {
        float f10 = 0.0f;
        while (view.getParent() instanceof View) {
            View view2 = (View) view.getParent();
            f10 += view.getY() - view2.getScrollY();
            view = view2;
        }
        view.getLocationOnScreen(this.x0);
        return ((f10 + r1[1]) + this.z0) - this.b.p2;
    }

    public final float Z(View view) {
        if (view.getVisibility() != 0 || view.getAlpha() <= 0.0f) {
            return Float.POSITIVE_INFINITY;
        }
        return ((1.0f - view.getScaleY()) * view.getPivotY()) + (X(view) - this.k0.getTranslationY());
    }

    public final void a0() {
        if (this.K || TextUtils.isEmpty(this.G)) {
            return;
        }
        org.telegram.ui.Wallet.l lVar = this.i0;
        if (lVar != null) {
            lVar.run();
            this.i0 = null;
        }
        this.g0 = -1L;
        j0();
        org.telegram.ui.Wallet.n0 x10 = org.telegram.ui.Wallet.n0.x(this.n);
        if (this.h0) {
            this.i0 = x10.i(this.G, Math.max(100000000L, getGramNanoAmount()), this.s0, this.t0 ? getPublicKey() : null, new bk(this, 1));
        }
    }

    public final void b0() {
        if (this.K || this.N0 || this.O0 != null || this.T0 != null) {
            return;
        }
        e0();
        bi.r3 r3Var = new bi.r3(this, SystemClock.uptimeMillis() + 1500, 22);
        this.O0 = r3Var;
        post(r3Var);
    }

    @Override // org.telegram.ui.Components.vh
    public final void d() {
        try {
            org.telegram.ui.ActionBar.r0 r0Var = this.y;
            org.telegram.ui.ActionBar.f6 f6Var = this.a;
            if (r0Var != null) {
                r0Var.setIconColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.G6, f6Var));
            }
            ShapeDrawable shapeDrawable = this.D;
            if (shapeDrawable != null) {
                org.telegram.ui.ActionBar.k6.C1(org.telegram.ui.ActionBar.k6.r1(0.08f, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.z6, f6Var)), shapeDrawable);
                j6 j6Var = this.T;
                if (j6Var != null) {
                    j6Var.invalidate();
                }
            }
            org.telegram.ui.ActionBar.t4 t4Var = this.E;
            if (t4Var != null) {
                int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Yl, f6Var);
                t4Var.c.setColor(w02);
                t4Var.w = Integer.valueOf(w02);
                TextView textView = this.U;
                if (textView != null) {
                    textView.invalidate();
                }
            }
            wp wpVar = this.F;
            if (wpVar != null) {
                wpVar.y = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Ci, f6Var);
                w70 w70Var = this.V;
                if (w70Var != null) {
                    w70Var.invalidate();
                }
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final void d0() {
        if (!this.L0 || this.B0 || this.K0 || !isAttachedToWindow() || Math.abs(getTranslationY()) >= 0.5f || this.N.getHeight() <= 0 || this.j0.getHeight() <= 0) {
            return;
        }
        this.E0 = getBottomYOnScreen();
        this.F0 = X(this.w);
        this.D0 = true;
    }

    @Override // org.telegram.messenger.ls
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.qs.a4) {
            boolean z9 = this.h0;
            i0();
            if (z9 != this.h0) {
                a0();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        this.b.R2.getAlpha();
        l0();
        if (this.l0 != null || this.m0 < 1.0f) {
            m0();
        }
        super.dispatchDraw(canvas);
        d0();
    }

    public final void e0() {
        if (this.K || this.N0) {
            return;
        }
        di diVar = this.b;
        if (diVar.I) {
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
        diVar.h1(editTextBoldCursor, true);
        editTextBoldCursor.requestFocus();
        org.telegram.messenger.g0.K3(editTextBoldCursor);
        editTextBoldCursor.postDelayed(new ck(this, 1), 220L);
    }

    public final void g0(boolean z9) {
        w70 w70Var = this.V;
        if (z9) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) org.telegram.messenger.hd.M0(2131743085, null));
            spannableStringBuilder.append((CharSequence) " ");
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) org.telegram.messenger.hd.M0(2131743138, null));
            spannableStringBuilder.append((CharSequence) " >");
            wp wpVar = new wp(R.drawable.settings_arrow, 0);
            wpVar.y = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Ci, this.a);
            float N = org.telegram.messenger.g0.N(0.66f);
            wpVar.r = 0.0f;
            wpVar.s = N;
            this.F = wpVar;
            spannableStringBuilder.setSpan(wpVar, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
            spannableStringBuilder.setSpan(new fi.ka(this, 6), length, spannableStringBuilder.length(), 33);
            w70Var.setText(spannableStringBuilder);
        }
        w70Var.animate().alpha(z9 ? 1.0f : 0.0f).scaleX(z9 ? 1.0f : 0.6f).scaleY(z9 ? 1.0f : 0.6f).setDuration(320L).setInterpolator(xq.h).start();
    }

    @Override // org.telegram.ui.Components.vh
    public int getButtonsHideOffset() {
        return org.telegram.messenger.g0.L(62.0f);
    }

    @Override // org.telegram.ui.Components.vh
    public int getCurrentItemTop() {
        int top = this.s.getTop();
        if (top <= 0) {
            top = getListTopPadding();
        }
        return org.telegram.messenger.g0.L(13.0f) + Math.max(0, top - (org.telegram.messenger.g0.L(12.0f) + org.telegram.messenger.g0.m));
    }

    @Override // org.telegram.ui.Components.vh
    public int getCustomBackground() {
        return org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.d6, this.a);
    }

    @Override // org.telegram.ui.Components.vh
    public int getFirstOffset() {
        return org.telegram.messenger.g0.L(5.0f) + getListTopPadding();
    }

    @Override // org.telegram.ui.Components.vh
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
        int i7 = 0;
        while (true) {
            byte[] bArr = this.H;
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

    public final void i0() {
        SpannableStringBuilder V;
        k0();
        int i7 = this.n;
        org.telegram.ui.Wallet.n0 x10 = org.telegram.ui.Wallet.n0.x(i7);
        long v = x10.v();
        long gramNanoAmount = getGramNanoAmount();
        long j3 = ((org.telegram.messenger.l0) org.telegram.messenger.qp.s1(i7).x7.l0.b).c;
        EditTextBoldCursor editTextBoldCursor = this.S;
        if (gramNanoAmount > 0 && gramNanoAmount < j3) {
            String T = this.u0 ? T(j3, getCurrencyPerGram()) : W(j3);
            editTextBoldCursor.setText(T);
            editTextBoldCursor.setSelection(T.length());
            int i10 = -this.v0;
            this.v0 = i10;
            org.telegram.messenger.g0.G3(i10, editTextBoldCursor, null);
            return;
        }
        boolean z9 = false;
        boolean z10 = WalletEngine2.isValidAddress(this.G) && gramNanoAmount <= v;
        g0(!TextUtils.isEmpty(editTextBoldCursor.getText()) && gramNanoAmount > v);
        String gramsText = getGramsText();
        boolean z11 = this.G == null && this.I;
        fi.d dVar = this.o0;
        dVar.setLoading(z11);
        dVar.i(TextUtils.isEmpty(gramsText) ? org.telegram.messenger.hd.M0(2131743021, null) : org.telegram.messenger.hd.V(null, null, 2131743022, org.telegram.ui.Wallet.n0.l("Grams", gramsText, 2131749506)), true, true);
        boolean isEmpty = TextUtils.isEmpty(editTextBoldCursor.getText());
        boolean z12 = !isEmpty;
        if (!isEmpty && z10 && !this.J) {
            z9 = true;
        }
        dVar.setEnabled(z9);
        o0(z12, this.L0);
        j0();
        this.R.d(org.telegram.ui.Wallet.n0.x(i7), this.u0);
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
            f0(spannableStringBuilder, length, spannableStringBuilder.length(), '.');
            spannableStringBuilder.append((CharSequence) " ");
            int length2 = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) org.telegram.messenger.hd.M0(2131749515, null));
            spannableStringBuilder.setSpan(new RelativeSizeSpan(0.85714287f), length2, spannableStringBuilder.length(), 33);
            V = spannableStringBuilder.append((CharSequence) " ").append((CharSequence) this.q0);
        } else {
            V = V(x10, gramNanoAmount);
        }
        this.T.setText(V);
    }

    @Override // org.telegram.ui.Components.vh
    public final int j() {
        return 1;
    }

    public final void j0() {
        int i7 = this.n;
        org.telegram.ui.Wallet.n0 x10 = org.telegram.ui.Wallet.n0.x(i7);
        this.W.setText(org.telegram.messenger.hd.V(null, null, 2131743186, org.telegram.ui.Wallet.n0.l("Grams", org.telegram.ui.Wallet.n0.p(x10.v(), true), 2131749506)));
        this.h0 = !x10.F() && x10.v() >= ((org.telegram.messenger.l0) org.telegram.messenger.qp.s1(i7).x7.l0.b).c;
        boolean z9 = this.d0 | (!TextUtils.isEmpty(this.S.getText()));
        this.d0 = z9;
        boolean z10 = this.h0 && z9;
        if (this.c0 != z10) {
            this.c0 = z10;
            ValueAnimator valueAnimator = this.f0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f0 = null;
            }
            float f10 = z10 ? 1.0f : 0.0f;
            if (this.L0 && isAttachedToWindow()) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.e0, f10);
                this.f0 = ofFloat;
                ofFloat.setDuration(320L);
                this.f0.setInterpolator(xq.h);
                this.f0.addUpdateListener(new e6(this, 11));
                this.f0.start();
            } else {
                setFeeVisibilityProgress(f10);
            }
        }
        long j3 = this.g0;
        TextView textView = this.a0;
        if (j3 >= 0) {
            textView.setText(org.telegram.messenger.hd.V(null, null, 2131743073, org.telegram.ui.Wallet.n0.s(j3, false)));
        } else {
            textView.setText(org.telegram.messenger.hd.V(null, null, 2131743073, this.b0));
        }
    }

    @Override // org.telegram.ui.Components.vh
    public final boolean k() {
        if (this.b.l3.Q() <= org.telegram.messenger.g0.L(20.0f)) {
            return false;
        }
        this.M0 = false;
        bi.r3 r3Var = this.O0;
        if (r3Var != null) {
            removeCallbacks(r3Var);
            this.O0 = null;
        }
        EditTextBoldCursor editTextBoldCursor = this.S;
        editTextBoldCursor.clearFocus();
        org.telegram.messenger.g0.v1(editTextBoldCursor);
        return true;
    }

    public final void k0() {
        TextView textView;
        LinearLayout linearLayout = this.O;
        if (linearLayout == null || (textView = this.Q) == null) {
            return;
        }
        final boolean z9 = getGramNanoAmount() > 0 || this.U.getVisibility() == 0 || this.y0;
        if (z9 == this.U0) {
            return;
        }
        this.U0 = z9;
        linearLayout.setVisibility(0);
        textView.setVisibility(0);
        final int i7 = 0;
        ViewPropertyAnimator duration = linearLayout.animate().alpha(z9 ? 1.0f : 0.0f).scaleX(z9 ? 1.0f : 0.8f).scaleY(z9 ? 1.0f : 0.8f).withEndAction(new Runnable(this) { // from class: org.telegram.ui.Components.ek
            public final /* synthetic */ ik b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i7) {
                    case 0:
                        this.b.O.setVisibility(z9 ? 0 : 4);
                        break;
                    default:
                        this.b.Q.setVisibility(!z9 ? 0 : 4);
                        break;
                }
            }
        }).setDuration(320L);
        xq xqVar = xq.h;
        duration.setInterpolator(xqVar).start();
        final int i10 = 1;
        textView.animate().alpha(z9 ? 0.0f : 1.0f).scaleX(!z9 ? 1.0f : 0.8f).scaleY(z9 ? 0.8f : 1.0f).withEndAction(new Runnable(this) { // from class: org.telegram.ui.Components.ek
            public final /* synthetic */ ik b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i10) {
                    case 0:
                        this.b.O.setVisibility(z9 ? 0 : 4);
                        break;
                    default:
                        this.b.Q.setVisibility(!z9 ? 0 : 4);
                        break;
                }
            }
        }).setDuration(320L).setInterpolator(xqVar).start();
    }

    public final void l0() {
        float f10;
        View view = this.N;
        if (view.getHeight() > 0) {
            if (this.j0.getHeight() <= 0) {
                return;
            }
            float X = X(this.s);
            org.telegram.ui.Wallet.r8 r8Var = this.w;
            if (r8Var.getVisibility() == 0) {
                f10 = Math.max(X, (r8Var.getScaleY() * (r8Var.getContentBottom() - r8Var.getPivotY())) + r8Var.getPivotY() + X(r8Var));
            } else {
                f10 = X;
            }
            float max = Math.max(0.0f, Math.min(Math.min(Math.min((X + r2.getHeight()) - ((FrameLayout.LayoutParams) r1.getLayoutParams()).bottomMargin, Z(this.W)), Z(this.a0)), Z(this.o0)) - f10);
            float min = Math.min(1.0f, Math.max(0.0f, max - (Math.min(org.telegram.messenger.g0.L(12.0f), max / 4.0f) * 2.0f)) / view.getHeight());
            view.setPivotX(view.getWidth() / 2.0f);
            view.setPivotY(view.getHeight() / 2.0f);
            view.setScaleX(min);
            view.setScaleY(min);
            view.setTranslationY(((max / 2.0f) + f10) - ((view.getHeight() / 2.0f) + (X(view) - view.getTranslationY())));
        }
    }

    public final void m0() {
        float max = Math.max(this.n0, Math.max(0.0f, Math.min(1.0f, this.m0)));
        this.n0 = max;
        float f10 = 1.0f - max;
        float f11 = this.m0;
        boolean z9 = this.l0 == null && f11 == 1.0f;
        org.telegram.ui.Wallet.m9 m9Var = this.R;
        m9Var.e(f11, max, z9);
        m9Var.setTranslationY((1.0f - this.m0) * (((this.N.getHeight() / 2.0f) - m9Var.getTop()) - (m9Var.getHeight() / 2.0f)));
        float f12 = this.n0;
        j6 j6Var = this.T;
        j6Var.setAlpha(f12);
        j6Var.setTranslationY(org.telegram.messenger.g0.L(16.0f) * f10);
        float f13 = this.n0;
        FrameLayout frameLayout = this.P;
        frameLayout.setAlpha(f13);
        frameLayout.setTranslationY(org.telegram.messenger.g0.L(16.0f) * f10);
        float f14 = this.n0;
        FrameLayout frameLayout2 = this.k0;
        frameLayout2.setAlpha(f14);
        frameLayout2.setTranslationY(org.telegram.messenger.g0.L(24.0f) * f10);
    }

    @Override // org.telegram.ui.Components.vh
    public final void n(float f10, float f11) {
        this.z0 = f10;
        this.A0 = f11;
        n0();
    }

    public final void n0() {
        if (!this.B0 || this.N.getHeight() <= 0) {
            return;
        }
        FrameLayout frameLayout = this.j0;
        if (frameLayout.getHeight() <= 0) {
            return;
        }
        float f10 = this.C0 ? this.A0 : 1.0f - this.A0;
        float f11 = this.I0;
        float z9 = com.google.android.recaptcha.internal.a.z(this.J0, f11, f10, f11);
        float f12 = this.G0;
        float z10 = com.google.android.recaptcha.internal.a.z(this.H0, f12, f10, f12);
        frameLayout.setTranslationY(z9 - (getBottomYOnScreen() - frameLayout.getTranslationY()));
        org.telegram.ui.Wallet.r8 r8Var = this.w;
        r8Var.setTranslationY(z10 - (X(r8Var) - r8Var.getTranslationY()));
        l0();
    }

    public final void o0(boolean z9, boolean z10) {
        if (z10 && this.p0 == z9) {
            return;
        }
        this.p0 = z9;
        fi.d dVar = this.o0;
        dVar.animate().cancel();
        TextView textView = this.W;
        textView.animate().cancel();
        TextView textView2 = this.a0;
        textView2.animate().cancel();
        float f10 = z9 ? 1.0f : 0.0f;
        float f11 = z9 ? 1.0f : 0.8f;
        float L = z9 ? 0.0f : org.telegram.messenger.g0.L(60.0f);
        if (z10) {
            dVar.setVisibility(0);
            ViewPropertyAnimator duration = dVar.animate().alpha(f10).scaleX(f11).scaleY(f11).setDuration(320L);
            xq xqVar = xq.h;
            duration.setInterpolator(xqVar).withEndAction(new ck(this, 5)).start();
            textView.animate().translationY(L).setDuration(320L).setInterpolator(xqVar).start();
            textView2.animate().translationY(L).setDuration(320L).setInterpolator(xqVar).start();
            return;
        }
        dVar.setVisibility(z9 ? 0 : 4);
        dVar.setAlpha(f10);
        dVar.setScaleX(f11);
        dVar.setScaleY(f11);
        textView.setTranslationY(L);
        textView2.setTranslationY(L);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        super.onLayout(z9, i7, i10, i11, i12);
        if (this.K0) {
            this.K0 = false;
            this.N.setTranslationY(0.0f);
            this.j0.setTranslationY(0.0f);
            this.w.setTranslationY(0.0f);
            d0();
        } else if (this.B0) {
            n0();
        }
        l0();
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z9) {
        if (!z9) {
            h0();
        }
        super.onWindowFocusChanged(z9);
    }

    @Override // org.telegram.ui.Components.vh
    public final void p() {
        if (this.K) {
            return;
        }
        this.K = true;
        S();
        org.telegram.ui.Wallet.o6 o6Var = this.Q0;
        if (o6Var != null) {
            AnimatorSet animatorSet = o6Var.m;
            if (!o6Var.v) {
                if (animatorSet.isStarted()) {
                    animatorSet.cancel();
                } else {
                    o6Var.a(false);
                }
            }
            this.Q0 = null;
        }
        org.telegram.ui.Wallet.ba baVar = this.R0;
        if (baVar != null) {
            AnimatorSet animatorSet2 = baVar.m;
            if (!baVar.s) {
                if (animatorSet2.isStarted()) {
                    animatorSet2.cancel();
                } else {
                    baVar.b();
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
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
            this.L = null;
        }
        this.O.animate().cancel();
        this.Q.animate().cancel();
        this.V.animate().cancel();
        this.o0.animate().cancel();
        this.W.animate().cancel();
        this.a0.animate().cancel();
        bi.r3 r3Var = this.O0;
        if (r3Var != null) {
            removeCallbacks(r3Var);
            this.O0 = null;
        }
        org.telegram.ui.ActionBar.u1 u1Var = this.T0;
        if (u1Var != null) {
            u1Var.dismiss();
        }
        org.telegram.ui.Wallet.l lVar = this.i0;
        if (lVar != null) {
            lVar.run();
            this.i0 = null;
        }
        org.telegram.messenger.qs.f(this.n).n(this, org.telegram.messenger.qs.a4);
        this.b.R2.q().removeView(this.x);
        org.telegram.messenger.g0.v1(this.S);
    }

    public void setSendTransitionProgress(float f10) {
        this.w.setAlpha(1.0f - f10);
    }

    @Override // android.view.View
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        this.b.b.invalidate();
    }

    @Override // org.telegram.ui.Components.vh
    public final void u() {
        S();
        Activity activity = this.L;
        if (activity != null) {
            try {
                activity.setRequestedOrientation(this.M);
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
            this.L = null;
        }
        this.b.R2.setDrawGlassTitle(true);
        this.L0 = false;
        this.M0 = false;
        bi.r3 r3Var = this.O0;
        if (r3Var != null) {
            removeCallbacks(r3Var);
            this.O0 = null;
        }
        org.telegram.ui.ActionBar.u1 u1Var = this.T0;
        if (u1Var != null) {
            u1Var.dismiss();
        }
        this.x.setVisibility(8);
        EditTextBoldCursor editTextBoldCursor = this.S;
        org.telegram.messenger.g0.v1(editTextBoldCursor);
        editTextBoldCursor.clearFocus();
    }

    @Override // org.telegram.ui.Components.vh
    public final void w(int i7) {
        if (i7 == 2) {
            org.telegram.ui.Wallet.y5.J0(this.n, getContext(), this.a);
        } else if (i7 == 3) {
            b0();
        }
    }

    @Override // org.telegram.ui.Components.vh
    public final void y() {
        if (this.B0) {
            this.B0 = false;
            float bottomYOnScreen = getBottomYOnScreen();
            FrameLayout frameLayout = this.j0;
            frameLayout.setTranslationY(this.J0 - (bottomYOnScreen - frameLayout.getTranslationY()));
            org.telegram.ui.Wallet.r8 r8Var = this.w;
            r8Var.setTranslationY(this.H0 - (X(r8Var) - r8Var.getTranslationY()));
            this.K0 = true;
            requestLayout();
        }
    }

    @Override // org.telegram.ui.Components.vh
    public final void z(int i7, boolean z9) {
        this.B0 = true;
        this.K0 = false;
        this.C0 = z9;
        this.A0 = z9 ? 0.0f : 1.0f;
        this.I0 = this.D0 ? this.E0 : getBottomYOnScreen();
        boolean z10 = this.D0;
        org.telegram.ui.Wallet.r8 r8Var = this.w;
        this.G0 = z10 ? this.F0 : X(r8Var);
        this.J0 = getBottomYOnScreen() - this.j0.getTranslationY();
        this.H0 = X(r8Var) - r8Var.getTranslationY();
        n0();
    }
}
