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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Wallet.WalletEngine2;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class al extends li implements NotificationCenter.NotificationCenterDelegate {
    public float A0;
    public boolean B0;
    public boolean C0;
    public boolean D0;
    public final org.telegram.ui.ActionBar.j5 E;
    public float E0;
    public xq F;
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
    public final xk N;
    public boolean N0;
    public final LinearLayout O;
    public ai.v3 O0;
    public final FrameLayout P;
    public TL_wallet.walletTransaction P0;
    public final TextView Q;
    public org.telegram.ui.Wallet.e6 Q0;
    public final org.telegram.ui.Wallet.i9 R;
    public org.telegram.ui.Wallet.w9 R0;
    public final EditTextBoldCursor S;
    public boolean S0;
    public final q6 T;
    public org.telegram.ui.ActionBar.c2 T0;
    public final TextView U;
    public boolean U0;
    public final y90 V;
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
    public org.telegram.ui.Wallet.m i0;
    public final FrameLayout j0;
    public final FrameLayout k0;
    public o1.k l0;
    public float m0;
    public final int n;
    public float n0;
    public final ei.d o0;
    public boolean p0;
    public final SpannableString q0;
    public final TLRPC.User r;
    public final SpannableString r0;
    public final FrameLayout s;
    public String s0;
    public boolean t0;
    public boolean u0;
    public final org.telegram.ui.Wallet.l8 v;
    public int v0;
    public final org.telegram.ui.ActionBar.u0 w;
    public DecimalFormat w0;
    public final org.telegram.ui.ActionBar.u0 x;
    public final int[] x0;
    public final ShapeDrawable y;
    public boolean y0;
    public float z0;

    public al(ti tiVar, Context context, int i10, TLRPC.User user, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, g6Var, tiVar);
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
        final int i12 = 0;
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        addView(frameLayout, w7.z5.e(-1, -1, 55));
        org.telegram.ui.ActionBar.u0 a2 = this.b.a1.m().a(31, R.drawable.ic_ab_other);
        this.w = a2;
        a2.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        a2.e(2, R.drawable.msg_addbot, LocaleController.getString(R.string.WalletDepositFunds));
        final int i13 = 3;
        a2.e(3, R.drawable.menu_comments, LocaleController.getString(R.string.WalletAddComment));
        a2.setVisibility(8);
        org.telegram.ui.ActionBar.u0 u0Var = new org.telegram.ui.ActionBar.u0(context, null, 0, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.G6, this.a), false, g6Var);
        this.x = u0Var;
        u0Var.setIcon(R.drawable.ic_ab_other);
        u0Var.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        int i14 = org.telegram.ui.ActionBar.k6.i6;
        org.telegram.ui.Cells.y g02 = org.telegram.ui.ActionBar.k6.g0(org.telegram.ui.ActionBar.k6.w0(i14, this.a), 1, -1);
        org.telegram.ui.ActionBar.n6 O = org.telegram.ui.ActionBar.r6.O(i14);
        u0Var.setBackground(g02);
        org.telegram.ui.ActionBar.r6.k(u0Var, g02, null, O, g6Var);
        u0Var.setOnClickListener(new ai.ia(this, g6Var, i10, 7));
        org.telegram.ui.Wallet.l8 l8Var = new org.telegram.ui.Wallet.l8(context, new ee(14, this, user), new ee(15, this, g6Var), g6Var);
        this.v = l8Var;
        l8Var.a(this.G, user);
        addView(l8Var, w7.z5.d(-2, 64.0f, 49, 6.0f, 0.0f, 6.0f, 0.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setClipChildren(false);
        frameLayout2.setClipToPadding(false);
        frameLayout.addView(frameLayout2, w7.z5.e(-1, -1, 55));
        xk xkVar = new xk(context);
        this.N = xkVar;
        xkVar.setOrientation(1);
        xkVar.setClipChildren(false);
        xkVar.setClipToPadding(false);
        xkVar.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.pk
            public final /* synthetic */ al b;

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
                        al.N(this.b);
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
                        al.P(this.b);
                        break;
                }
            }
        });
        frameLayout2.addView(xkVar, w7.z5.e(-1, -2, 17));
        org.telegram.ui.Wallet.i9 i9Var = new org.telegram.ui.Wallet.i9(context, g6Var);
        this.R = i9Var;
        final int i15 = 4;
        i9Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.pk
            public final /* synthetic */ al b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i15) {
                    case 0:
                        this.b.c0();
                        break;
                    case 1:
                        this.b.Z();
                        break;
                    case 2:
                        al.N(this.b);
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
                        al.P(this.b);
                        break;
                }
            }
        });
        xkVar.addView(i9Var, w7.z5.t(-1, 64, 49, 16, 0, 16, 0));
        EditTextBoldCursor editText = i9Var.getEditText();
        this.S = editText;
        editText.setFilters(new InputFilter[]{new qk(i12, this)});
        editText.setImeOptions(33554438);
        editText.setOnTouchListener(new rk(this, i12));
        final int i16 = 5;
        editText.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.pk
            public final /* synthetic */ al b;

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
                        al.N(this.b);
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
                        al.P(this.b);
                        break;
                }
            }
        });
        editText.setOnEditorActionListener(new d1(this, i11));
        editText.addTextChangedListener(new yk(this));
        SpannableString spannableString = new SpannableString("⇅");
        this.q0 = spannableString;
        xq xqVar = new xq(R.drawable.wallet_currency_exchange, 0);
        xqVar.setAlpha(0.72f);
        spannableString.setSpan(xqVar, 0, spannableString.length(), 33);
        SpannableString spannableString2 = new SpannableString("G");
        this.r0 = spannableString2;
        xq xqVar2 = new xq(R.drawable.wallet_gram_small, 0);
        xqVar2.recolorDrawable = false;
        spannableString2.setSpan(xqVar2, 0, spannableString2.length(), 33);
        q6 q6Var = new q6(context, false, true, true, true, true);
        this.T = q6Var;
        q6Var.c.m(0.35f, 320L, 3.5f, bs.h);
        q6Var.setScaleProperty(0.35f);
        q6Var.setText(U(org.telegram.ui.Wallet.l0.w(i10), 0L));
        int i17 = org.telegram.ui.ActionBar.k6.d6;
        int i18 = org.telegram.ui.ActionBar.k6.z6;
        org.telegram.ui.ActionBar.n6 q6 = org.telegram.ui.ActionBar.r6.q(i17, i18);
        org.telegram.ui.ActionBar.r6.n(q6Var, q6.a, q6.b, 4, 0.0f, g6Var);
        q6Var.setTextSize(AndroidUtilities.dp(14.0f));
        q6Var.setTypeface(AndroidUtilities.getTypeface("fonts/gram.ttf"));
        q6Var.setGravity(17);
        q6Var.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
        q6Var.setAllowCancel(true);
        ShapeDrawable c02 = org.telegram.ui.ActionBar.k6.c0(AndroidUtilities.dp(14.0f), org.telegram.ui.ActionBar.k6.o1(0.08f, org.telegram.ui.ActionBar.k6.w0(i18, this.a)));
        this.y = c02;
        q6Var.setSizeableBackground(c02);
        xkVar.addView(q6Var, w7.z5.t(-2, 28, 49, 0, 8, 0, 0));
        w7.b6.a(q6Var);
        final int i19 = 6;
        q6Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.pk
            public final /* synthetic */ al b;

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
                        al.N(this.b);
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
                        al.P(this.b);
                        break;
                }
            }
        });
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.P = frameLayout3;
        xkVar.addView(frameLayout3, w7.z5.q(-2, -2, 49));
        LinearLayout linearLayout = new LinearLayout(context);
        this.O = linearLayout;
        linearLayout.setOrientation(1);
        frameLayout3.addView(linearLayout, w7.z5.e(-2, -2, 49));
        TextView textView = new TextView(context);
        this.Q = textView;
        textView.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.r6.W(textView, i18, g6Var);
        textView.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
        textView.setGravity(17);
        textView.setText(LocaleController.getString(R.string.WalletTapToSetAmount));
        frameLayout3.addView(textView, w7.z5.d(-2, 28.0f, 49, 0.0f, 8.0f, 0.0f, 0.0f));
        w7.b6.a(textView);
        textView.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.pk
            public final /* synthetic */ al b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        this.b.c0();
                        break;
                    case 1:
                        this.b.Z();
                        break;
                    case 2:
                        al.N(this.b);
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
                        al.P(this.b);
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
        org.telegram.ui.ActionBar.j5 j5Var = new org.telegram.ui.ActionBar.j5(0, true, false, null);
        this.E = j5Var;
        j5Var.x = false;
        Paint.Style style = Paint.Style.STROKE;
        Paint paint = j5Var.c;
        paint.setStyle(style);
        paint.setStrokeWidth(Math.max(1.0f, AndroidUtilities.dpf2(0.5f)));
        int i20 = org.telegram.ui.ActionBar.k6.kl;
        paint.setColor(org.telegram.ui.ActionBar.k6.w0(i20, this.a));
        j5Var.w = Integer.valueOf(org.telegram.ui.ActionBar.k6.w0(i20, this.a));
        textView2.setPadding(AndroidUtilities.dp(15.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(19.0f), AndroidUtilities.dp(8.0f));
        textView2.setBackground(j5Var);
        textView2.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.r6.W(textView2, i18, g6Var);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setVisibility(8);
        textView2.setEllipsize(TextUtils.TruncateAt.END);
        textView2.setMaxLines(4);
        linearLayout.addView(textView2, w7.z5.t(-2, -2, 49, 32, 12, 32, 0));
        textView2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.pk
            public final /* synthetic */ al b;

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
                        al.N(this.b);
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
                        al.P(this.b);
                        break;
                }
            }
        });
        w7.b6.b(textView2, 0.02f, 1.2f);
        y90 y90Var = new y90(context, g6Var);
        this.V = y90Var;
        org.telegram.ui.ActionBar.r6.W(y90Var, org.telegram.ui.ActionBar.k6.q7, g6Var);
        org.telegram.ui.ActionBar.r6.I(y90Var, org.telegram.ui.ActionBar.k6.Oh, g6Var);
        y90Var.setTextSize(1, 14.0f);
        y90Var.setGravity(17);
        y90Var.setTypeface(AndroidUtilities.bold());
        y90Var.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
        e0(false);
        linearLayout.addView(y90Var, w7.z5.t(-2, -2, 49, 0, 10, 0, 0));
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.j0 = frameLayout4;
        frameLayout4.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(12.0f));
        FrameLayout frameLayout5 = new FrameLayout(context);
        this.k0 = frameLayout5;
        frameLayout4.setClipChildren(false);
        frameLayout4.setClipToPadding(false);
        frameLayout5.setClipChildren(false);
        frameLayout5.setClipToPadding(false);
        frameLayout4.addView(frameLayout5, w7.z5.c(-1.0f, -1));
        TextView textView3 = new TextView(context);
        this.W = textView3;
        org.telegram.ui.ActionBar.r6.W(textView3, i18, g6Var);
        textView3.setTextSize(1, 14.0f);
        textView3.setGravity(17);
        frameLayout5.addView(textView3, w7.z5.e(-1, 20, 55));
        TextView textView4 = new TextView(context);
        this.a0 = textView4;
        org.telegram.ui.ActionBar.r6.W(textView4, i18, g6Var);
        textView4.setTextSize(1, 14.0f);
        textView4.setGravity(17);
        textView4.setPadding(0, AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f));
        textView4.setVisibility(8);
        frameLayout5.addView(textView4, w7.z5.d(-1, -2.0f, 55, 0.0f, 24.0f, 0.0f, 0.0f));
        SpannableString spannableString3 = new SpannableString(LocaleController.getString(R.string.Loading));
        this.b0 = spannableString3;
        spannableString3.setSpan(new da0(AndroidUtilities.dp(80.0f), textView4), 0, spannableString3.length(), 33);
        ei.d g10 = org.telegram.messenger.sl.g(24, context, g6Var, true);
        this.o0 = g10;
        g10.setText(LocaleController.getString(R.string.WalletSendGrams));
        g10.setEnabled(false);
        final int i21 = 2;
        g10.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.pk
            public final /* synthetic */ al b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i21) {
                    case 0:
                        this.b.c0();
                        break;
                    case 1:
                        this.b.Z();
                        break;
                    case 2:
                        al.N(this.b);
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
                        al.P(this.b);
                        break;
                }
            }
        });
        frameLayout5.addView(g10, w7.z5.e(-1, 48, 87));
        frameLayout.addView(frameLayout4, w7.z5.d(-1, 92.0f, 87, 0.0f, 0.0f, 0.0f, 70.0f));
        m0(false, false);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.walletUpdate);
        h0();
        this.I = true;
        org.telegram.ui.Wallet.l0.w(i10).Y(user, new tk(this, 0));
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void N(final al alVar) {
        boolean z10;
        ai.v3 v3Var;
        EditTextBoldCursor editTextBoldCursor = alVar.S;
        int i10 = alVar.n;
        ei.d dVar = alVar.o0;
        if (!dVar.c0 || dVar.Q) {
            return;
        }
        org.telegram.ui.Wallet.l0 w9 = org.telegram.ui.Wallet.l0.w(i10);
        long gramNanoAmount = alVar.getGramNanoAmount();
        long u10 = w9.u();
        if (!WalletEngine2.isValidAddress(alVar.G) || gramNanoAmount <= 0) {
            return;
        }
        long j10 = MessagesController.getInstance(i10).config.walletTransferMinNanos.get();
        if (gramNanoAmount < j10) {
            String S = alVar.u0 ? alVar.S(j10, alVar.getCurrencyPerGram()) : V(j10);
            editTextBoldCursor.setText(S);
            editTextBoldCursor.setSelection(S.length());
            int i11 = -alVar.v0;
            alVar.v0 = i11;
            AndroidUtilities.shakeViewSpring(editTextBoldCursor, i11);
            return;
        }
        if (gramNanoAmount > u10) {
            BotWebViewVibrationEffect.APP_ERROR.vibrate();
            y90 y90Var = alVar.V;
            int i12 = -alVar.v0;
            alVar.v0 = i12;
            AndroidUtilities.shakeViewSpring(y90Var, i12);
            return;
        }
        MessagesController messagesController = MessagesController.getInstance(i10);
        long sendPaidMessagesStars = messagesController.getSendPaidMessagesStars(alVar.r.id);
        if (messagesController.config.walletPaidMessageRecipientMessageAmountCheck.get() && sendPaidMessagesStars > 0) {
            if (messagesController.config.tonUsdRate.get() * (gramNanoAmount / 1.0E9d) < (sendPaidMessagesStars / 1000.0d) * messagesController.starsUsdWithdrawRate1000) {
                z10 = true;
                alVar.S0 = z10;
                dVar.setLoading(true);
                alVar.N0 = true;
                alVar.M0 = false;
                v3Var = alVar.O0;
                if (v3Var != null) {
                    alVar.removeCallbacks(v3Var);
                    alVar.O0 = null;
                }
                alVar.P0 = null;
                TLRPC.User user = alVar.r;
                String str = alVar.G;
                String str2 = alVar.s0;
                byte[] publicKey = alVar.t0 ? alVar.getPublicKey() : null;
                final int i13 = 0;
                Utilities.Callback callback = new Utilities.Callback(alVar) { // from class: org.telegram.ui.Components.vk
                    public final /* synthetic */ al b;

                    {
                        this.b = alVar;
                    }

                    @Override // org.telegram.messenger.Utilities.Callback
                    public final void run(Object obj) {
                        switch (i13) {
                            case 0:
                                String str3 = (String) obj;
                                al alVar2 = this.b;
                                ei.d dVar2 = alVar2.o0;
                                ti tiVar = alVar2.b;
                                if (!alVar2.K && !tiVar.isDismissed()) {
                                    if (!"PASSCODE_FAILED".equalsIgnoreCase(str3)) {
                                        if (!TextUtils.isEmpty(str3)) {
                                            dVar2.setLoading(false);
                                            alVar2.N0 = false;
                                            xc.X().e0(str3, false);
                                            break;
                                        } else {
                                            tiVar.dismiss();
                                            break;
                                        }
                                    } else {
                                        dVar2.setLoading(false);
                                        alVar2.N0 = false;
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
                w9.b0(user, str, gramNanoAmount, str2, publicKey, null, null, callback, new Utilities.Callback(alVar) { // from class: org.telegram.ui.Components.vk
                    public final /* synthetic */ al b;

                    {
                        this.b = alVar;
                    }

                    @Override // org.telegram.messenger.Utilities.Callback
                    public final void run(Object obj) {
                        switch (i14) {
                            case 0:
                                String str3 = (String) obj;
                                al alVar2 = this.b;
                                ei.d dVar2 = alVar2.o0;
                                ti tiVar = alVar2.b;
                                if (!alVar2.K && !tiVar.isDismissed()) {
                                    if (!"PASSCODE_FAILED".equalsIgnoreCase(str3)) {
                                        if (!TextUtils.isEmpty(str3)) {
                                            dVar2.setLoading(false);
                                            alVar2.N0 = false;
                                            xc.X().e0(str3, false);
                                            break;
                                        } else {
                                            tiVar.dismiss();
                                            break;
                                        }
                                    } else {
                                        dVar2.setLoading(false);
                                        alVar2.N0 = false;
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
        }
        z10 = false;
        alVar.S0 = z10;
        dVar.setLoading(true);
        alVar.N0 = true;
        alVar.M0 = false;
        v3Var = alVar.O0;
        if (v3Var != null) {
        }
        alVar.P0 = null;
        TLRPC.User user2 = alVar.r;
        String str3 = alVar.G;
        String str22 = alVar.s0;
        if (alVar.t0) {
        }
        final int i132 = 0;
        Utilities.Callback callback2 = new Utilities.Callback(alVar) { // from class: org.telegram.ui.Components.vk
            public final /* synthetic */ al b;

            {
                this.b = alVar;
            }

            @Override // org.telegram.messenger.Utilities.Callback
            public final void run(Object obj) {
                switch (i132) {
                    case 0:
                        String str32 = (String) obj;
                        al alVar2 = this.b;
                        ei.d dVar2 = alVar2.o0;
                        ti tiVar = alVar2.b;
                        if (!alVar2.K && !tiVar.isDismissed()) {
                            if (!"PASSCODE_FAILED".equalsIgnoreCase(str32)) {
                                if (!TextUtils.isEmpty(str32)) {
                                    dVar2.setLoading(false);
                                    alVar2.N0 = false;
                                    xc.X().e0(str32, false);
                                    break;
                                } else {
                                    tiVar.dismiss();
                                    break;
                                }
                            } else {
                                dVar2.setLoading(false);
                                alVar2.N0 = false;
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
        final int i142 = 1;
        w9.b0(user2, str3, gramNanoAmount, str22, publicKey, null, null, callback2, new Utilities.Callback(alVar) { // from class: org.telegram.ui.Components.vk
            public final /* synthetic */ al b;

            {
                this.b = alVar;
            }

            @Override // org.telegram.messenger.Utilities.Callback
            public final void run(Object obj) {
                switch (i142) {
                    case 0:
                        String str32 = (String) obj;
                        al alVar2 = this.b;
                        ei.d dVar2 = alVar2.o0;
                        ti tiVar = alVar2.b;
                        if (!alVar2.K && !tiVar.isDismissed()) {
                            if (!"PASSCODE_FAILED".equalsIgnoreCase(str32)) {
                                if (!TextUtils.isEmpty(str32)) {
                                    dVar2.setLoading(false);
                                    alVar2.N0 = false;
                                    xc.X().e0(str32, false);
                                    break;
                                } else {
                                    tiVar.dismiss();
                                    break;
                                }
                            } else {
                                dVar2.setLoading(false);
                                alVar2.N0 = false;
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

    public static void P(al alVar) {
        EditTextBoldCursor editTextBoldCursor = alVar.S;
        BigDecimal currencyPerGram = alVar.getCurrencyPerGram();
        if (alVar.u0 || currencyPerGram.signum() > 0) {
            long gramNanoAmount = alVar.getGramNanoAmount();
            alVar.u0 = !alVar.u0;
            alVar.R.d(org.telegram.ui.Wallet.l0.w(alVar.n), alVar.u0);
            String S = gramNanoAmount <= 0 ? "" : alVar.u0 ? alVar.S(gramNanoAmount, currencyPerGram) : V(gramNanoAmount);
            editTextBoldCursor.setText(S);
            editTextBoldCursor.setSelection(S.length());
        }
    }

    public static /* synthetic */ CharSequence Q(al alVar, CharSequence charSequence, int i10, int i11, Spanned spanned, int i12, int i13) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(spanned.subSequence(0, i12).toString());
        sb2.append((Object) charSequence.subSequence(i10, i11));
        sb2.append((Object) spanned.subSequence(i13, spanned.length()));
        String sb3 = sb2.toString();
        int i14 = 9;
        BigDecimal valueOf = BigDecimal.valueOf(Long.MAX_VALUE, 9);
        if (alVar.u0) {
            BigDecimal currencyPerGram = alVar.getCurrencyPerGram();
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
        return selectedCurrencyRate != null ? selectedCurrencyRate.exp : TextUtils.equals(org.telegram.ui.Wallet.l0.w(this.n).h.g(), "USD") ? 2 : 0;
    }

    private BigDecimal getCurrencyPerGram() {
        int i10 = this.n;
        org.telegram.ui.Wallet.f fVar = org.telegram.ui.Wallet.l0.w(i10).h;
        fVar.f();
        double h = fVar.h();
        double d = MessagesController.getInstance(i10).config.tonUsdRate.get();
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
        org.telegram.ui.Wallet.f fVar = org.telegram.ui.Wallet.l0.w(this.n).h;
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

    @Override // org.telegram.ui.Components.li
    public final void A() {
        R();
        f0();
    }

    @Override // org.telegram.ui.Components.li
    public final void B(int i10, int i11) {
        int i12;
        ti tiVar = this.b;
        boolean z10 = tiVar.u1.Q() > AndroidUtilities.dp(20.0f);
        this.y0 = z10;
        this.f = z10;
        int dp = z10 ? 0 : AndroidUtilities.dp(70.0f);
        int round = Math.round(AndroidUtilities.dp(32.0f) * this.e0) + AndroidUtilities.dp(92.0f);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.j0.getLayoutParams();
        layoutParams.height = round;
        layoutParams.bottomMargin = dp;
        if (this.y0) {
            i12 = AndroidUtilities.dp(56.0f);
            tiVar.setAllowNestedScroll(false);
        } else {
            if (!AndroidUtilities.isTablet()) {
                Point point = AndroidUtilities.displaySize;
                if (point.x > point.y) {
                    i12 = (int) (i11 / 3.5f);
                    tiVar.setAllowNestedScroll(true);
                }
            }
            i12 = (i11 / 5) * 2;
            tiVar.setAllowNestedScroll(true);
        }
        int g10 = i2.o1.g(1.0f, i12, 0) + AndroidUtilities.statusBarHeight;
        FrameLayout frameLayout = this.s;
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
        if (layoutParams2.topMargin != g10) {
            layoutParams2.topMargin = g10;
            frameLayout.setLayoutParams(layoutParams2);
        }
        int b10 = org.telegram.messenger.v0.b(4.0f, g10 - AndroidUtilities.statusBarHeight, 0);
        org.telegram.ui.Wallet.l8 l8Var = this.v;
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) l8Var.getLayoutParams();
        int max = Math.max(0, this.y0 ? AndroidUtilities.dp(4.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() : b10 - AndroidUtilities.dp(4.0f));
        if (layoutParams3.topMargin != max) {
            layoutParams3.topMargin = max;
            l8Var.setLayoutParams(layoutParams3);
        }
        i0();
    }

    @Override // org.telegram.ui.Components.li
    public final void F(li liVar) {
        Activity findActivity;
        R();
        if (this.L == null && !AndroidUtilities.isTablet()) {
            Point point = AndroidUtilities.displaySize;
            if (Math.min(point.x, point.y) < AndroidUtilities.dp(700.0f) && (findActivity = AndroidUtilities.findActivity(getContext())) != null) {
                try {
                    this.M = findActivity.getRequestedOrientation();
                    findActivity.setRequestedOrientation(1);
                    this.L = findActivity;
                } catch (Exception e) {
                    FileLog.e(e);
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
        org.telegram.ui.Wallet.l8 l8Var = this.v;
        l8Var.setTranslationY(0.0f);
        l8Var.setAlpha(1.0f);
        this.D0 = false;
        ti tiVar = this.b;
        tiVar.a1.setTitle(LocaleController.getString(R.string.WalletSendMoneyTo));
        tiVar.a1.setDrawGlassTitle(false);
        this.w.setVisibility(0);
        editTextBoldCursor.clearFocus();
        Y();
        org.telegram.ui.Wallet.i9 i9Var = this.R;
        float f7 = i9Var.getDiamondView().f == null ? 1.0f : 0.0f;
        this.n0 = f7;
        this.m0 = f7;
        k0();
        if (this.m0 < 1.0f) {
            i9Var.getDiamondView().l(new uk(this, 3));
        }
    }

    @Override // org.telegram.ui.Components.li
    public final void I() {
        this.L0 = true;
        post(new uk(this, 4));
    }

    @Override // org.telegram.ui.Components.li
    public final boolean M() {
        return !this.N0;
    }

    public final void R() {
        this.R.getDiamondView().l(null);
        o1.k kVar = this.l0;
        if (kVar != null) {
            kVar.c();
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

    public final SpannableStringBuilder U(org.telegram.ui.Wallet.l0 l0Var, long j10) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("≈ ");
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append(l0Var.l(j10, false));
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
        return ((f7 + r1[1]) + this.z0) - this.b.y0;
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
        org.telegram.ui.Wallet.m mVar = this.i0;
        if (mVar != null) {
            mVar.run();
            this.i0 = null;
        }
        this.g0 = -1L;
        h0();
        org.telegram.ui.Wallet.l0 w9 = org.telegram.ui.Wallet.l0.w(this.n);
        if (this.h0) {
            this.i0 = w9.h(this.G, Math.max(100000000L, getGramNanoAmount()), this.s0, this.t0 ? getPublicKey() : null, new tk(this, 1));
        }
    }

    public final void Z() {
        if (this.K || this.N0 || this.O0 != null || this.T0 != null) {
            return;
        }
        c0();
        ai.v3 v3Var = new ai.v3(this, SystemClock.uptimeMillis() + 1500, 24);
        this.O0 = v3Var;
        post(v3Var);
    }

    public final void b0() {
        if (!this.L0 || this.B0 || this.K0 || !isAttachedToWindow() || Math.abs(getTranslationY()) >= 0.5f || this.N.getHeight() <= 0 || this.j0.getHeight() <= 0) {
            return;
        }
        this.E0 = getBottomYOnScreen();
        this.F0 = W(this.v);
        this.D0 = true;
    }

    public final void c0() {
        if (this.K || this.N0) {
            return;
        }
        ti tiVar = this.b;
        if (tiVar.isDismissed()) {
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
        tiVar.z1(editTextBoldCursor, true);
        editTextBoldCursor.requestFocus();
        AndroidUtilities.showKeyboard(editTextBoldCursor);
        editTextBoldCursor.postDelayed(new uk(this, 1), 220L);
    }

    @Override // org.telegram.ui.Components.li
    public final void d() {
        try {
            org.telegram.ui.ActionBar.u0 u0Var = this.x;
            org.telegram.ui.ActionBar.g6 g6Var = this.a;
            if (u0Var != null) {
                u0Var.setIconColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.G6, g6Var));
            }
            ShapeDrawable shapeDrawable = this.y;
            if (shapeDrawable != null) {
                org.telegram.ui.ActionBar.k6.z1(org.telegram.ui.ActionBar.k6.o1(0.08f, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.z6, g6Var)), shapeDrawable);
                q6 q6Var = this.T;
                if (q6Var != null) {
                    q6Var.invalidate();
                }
            }
            org.telegram.ui.ActionBar.j5 j5Var = this.E;
            if (j5Var != null) {
                int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.kl, g6Var);
                j5Var.c.setColor(w02);
                j5Var.w = Integer.valueOf(w02);
                TextView textView = this.U;
                if (textView != null) {
                    textView.invalidate();
                }
            }
            xq xqVar = this.F;
            if (xqVar != null) {
                xqVar.setOverrideColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Oh, g6Var));
                y90 y90Var = this.V;
                if (y90Var != null) {
                    y90Var.invalidate();
                }
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.walletUpdate) {
            boolean z10 = this.h0;
            g0();
            if (z10 != this.h0) {
                Y();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        this.b.a1.getAlpha();
        j0();
        if (this.l0 != null || this.m0 < 1.0f) {
            k0();
        }
        super.dispatchDraw(canvas);
        b0();
    }

    public final void e0(boolean z10) {
        y90 y90Var = this.V;
        if (z10) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.WalletInsufficientFunds));
            spannableStringBuilder.append((CharSequence) " ");
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.WalletDepositFunds));
            spannableStringBuilder.append((CharSequence) " >");
            xq translate = new xq(R.drawable.settings_arrow, 0).setOverrideColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Oh, this.a)).translate(0.0f, AndroidUtilities.dpf2(0.66f));
            this.F = translate;
            spannableStringBuilder.setSpan(translate, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
            spannableStringBuilder.setSpan(new ei.kb(this, 6), length, spannableStringBuilder.length(), 33);
            y90Var.setText(spannableStringBuilder);
        }
        y90Var.animate().alpha(z10 ? 1.0f : 0.0f).scaleX(z10 ? 1.0f : 0.6f).scaleY(z10 ? 1.0f : 0.6f).setDuration(320L).setInterpolator(bs.h).start();
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
        org.telegram.ui.Wallet.l0 w9 = org.telegram.ui.Wallet.l0.w(i10);
        long u10 = w9.u();
        long gramNanoAmount = getGramNanoAmount();
        long j10 = MessagesController.getInstance(i10).config.walletTransferMinNanos.get();
        EditTextBoldCursor editTextBoldCursor = this.S;
        if (gramNanoAmount > 0 && gramNanoAmount < j10) {
            String S = this.u0 ? S(j10, getCurrencyPerGram()) : V(j10);
            editTextBoldCursor.setText(S);
            editTextBoldCursor.setSelection(S.length());
            int i11 = -this.v0;
            this.v0 = i11;
            AndroidUtilities.shakeViewSpring(editTextBoldCursor, i11);
            return;
        }
        boolean z10 = false;
        boolean z11 = WalletEngine2.isValidAddress(this.G) && gramNanoAmount <= u10;
        e0(!TextUtils.isEmpty(editTextBoldCursor.getText()) && gramNanoAmount > u10);
        String gramsText = getGramsText();
        boolean z12 = this.G == null && this.I;
        ei.d dVar = this.o0;
        dVar.setLoading(z12);
        dVar.i(TextUtils.isEmpty(gramsText) ? LocaleController.getString(R.string.WalletSendGrams) : LocaleController.formatSpannable(R.string.WalletSendAmount, org.telegram.ui.Wallet.l0.k("Grams", gramsText, R.string.Grams_other)), true, true);
        boolean isEmpty = TextUtils.isEmpty(editTextBoldCursor.getText());
        boolean z13 = !isEmpty;
        if (!isEmpty && z11 && !this.J) {
            z10 = true;
        }
        dVar.setEnabled(z10);
        m0(z13, this.L0);
        h0();
        this.R.d(org.telegram.ui.Wallet.l0.w(i10), this.u0);
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
            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.GramCurrency));
            spannableStringBuilder.setSpan(new RelativeSizeSpan(0.85714287f), length2, spannableStringBuilder.length(), 33);
            U = spannableStringBuilder.append((CharSequence) " ").append((CharSequence) this.q0);
        } else {
            U = U(w9, gramNanoAmount);
        }
        this.T.setText(U);
    }

    @Override // org.telegram.ui.Components.li
    public int getButtonsHideOffset() {
        return AndroidUtilities.dp(62.0f);
    }

    @Override // org.telegram.ui.Components.li
    public int getCurrentItemTop() {
        int top = this.s.getTop();
        if (top <= 0) {
            top = getListTopPadding();
        }
        return AndroidUtilities.dp(13.0f) + Math.max(0, top - (AndroidUtilities.dp(12.0f) + AndroidUtilities.statusBarHeight));
    }

    @Override // org.telegram.ui.Components.li
    public int getCustomBackground() {
        return org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.d6, this.a);
    }

    @Override // org.telegram.ui.Components.li
    public int getFirstOffset() {
        return AndroidUtilities.dp(5.0f) + getListTopPadding();
    }

    @Override // org.telegram.ui.Components.li
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
        org.telegram.ui.Wallet.l0 w9 = org.telegram.ui.Wallet.l0.w(i10);
        this.W.setText(LocaleController.formatSpannable(R.string.WalletBalanceAmount, org.telegram.ui.Wallet.l0.k("Grams", org.telegram.ui.Wallet.l0.o(w9.u(), true), R.string.Grams_other)));
        this.h0 = !w9.D() && w9.u() >= MessagesController.getInstance(i10).config.walletTransferMinNanos.get();
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
                this.f0.setInterpolator(bs.h);
                this.f0.addUpdateListener(new l6(this, 11));
                this.f0.start();
            } else {
                setFeeVisibilityProgress(f7);
            }
        }
        long j10 = this.g0;
        TextView textView = this.a0;
        if (j10 >= 0) {
            textView.setText(LocaleController.formatSpannable(R.string.WalletNetworkFeeAmount, org.telegram.ui.Wallet.l0.r(j10, false)));
        } else {
            textView.setText(LocaleController.formatSpannable(R.string.WalletNetworkFeeAmount, this.b0));
        }
    }

    @Override // org.telegram.ui.Components.li
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
        ViewPropertyAnimator duration = linearLayout.animate().alpha(z10 ? 1.0f : 0.0f).scaleX(z10 ? 1.0f : 0.8f).scaleY(z10 ? 1.0f : 0.8f).withEndAction(new Runnable(this) { // from class: org.telegram.ui.Components.wk
            public final /* synthetic */ al b;

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
        bs bsVar = bs.h;
        duration.setInterpolator(bsVar).start();
        final int i11 = 1;
        textView.animate().alpha(z10 ? 0.0f : 1.0f).scaleX(!z10 ? 1.0f : 0.8f).scaleY(z10 ? 0.8f : 1.0f).withEndAction(new Runnable(this) { // from class: org.telegram.ui.Components.wk
            public final /* synthetic */ al b;

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
        }).setDuration(320L).setInterpolator(bsVar).start();
    }

    @Override // org.telegram.ui.Components.li
    public final boolean j() {
        if (this.b.u1.Q() <= AndroidUtilities.dp(20.0f)) {
            return false;
        }
        this.M0 = false;
        ai.v3 v3Var = this.O0;
        if (v3Var != null) {
            removeCallbacks(v3Var);
            this.O0 = null;
        }
        EditTextBoldCursor editTextBoldCursor = this.S;
        editTextBoldCursor.clearFocus();
        AndroidUtilities.hideKeyboard(editTextBoldCursor);
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
            org.telegram.ui.Wallet.l8 l8Var = this.v;
            if (l8Var.getVisibility() == 0) {
                f7 = Math.max(W, (l8Var.getScaleY() * (l8Var.getContentBottom() - l8Var.getPivotY())) + l8Var.getPivotY() + W(l8Var));
            } else {
                f7 = W;
            }
            float max = Math.max(0.0f, Math.min(Math.min(Math.min((W + r2.getHeight()) - ((FrameLayout.LayoutParams) r1.getLayoutParams()).bottomMargin, X(this.W)), X(this.a0)), X(this.o0)) - f7);
            float min = Math.min(1.0f, Math.max(0.0f, max - (Math.min(AndroidUtilities.dp(12.0f), max / 4.0f) * 2.0f)) / view.getHeight());
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
        org.telegram.ui.Wallet.i9 i9Var = this.R;
        i9Var.e(f10, max, z10);
        i9Var.setTranslationY((1.0f - this.m0) * (((this.N.getHeight() / 2.0f) - i9Var.getTop()) - (i9Var.getHeight() / 2.0f)));
        float f11 = this.n0;
        q6 q6Var = this.T;
        q6Var.setAlpha(f11);
        q6Var.setTranslationY(AndroidUtilities.dp(16.0f) * f7);
        float f12 = this.n0;
        FrameLayout frameLayout = this.P;
        frameLayout.setAlpha(f12);
        frameLayout.setTranslationY(AndroidUtilities.dp(16.0f) * f7);
        float f13 = this.n0;
        FrameLayout frameLayout2 = this.k0;
        frameLayout2.setAlpha(f13);
        frameLayout2.setTranslationY(AndroidUtilities.dp(24.0f) * f7);
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
        float y3 = com.google.android.gms.internal.play_billing.k3.y(this.J0, f10, f7, f10);
        float f11 = this.G0;
        float y10 = com.google.android.gms.internal.play_billing.k3.y(this.H0, f11, f7, f11);
        frameLayout.setTranslationY(y3 - (getBottomYOnScreen() - frameLayout.getTranslationY()));
        org.telegram.ui.Wallet.l8 l8Var = this.v;
        l8Var.setTranslationY(y10 - (W(l8Var) - l8Var.getTranslationY()));
        j0();
    }

    @Override // org.telegram.ui.Components.li
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
        ei.d dVar = this.o0;
        dVar.animate().cancel();
        TextView textView = this.W;
        textView.animate().cancel();
        TextView textView2 = this.a0;
        textView2.animate().cancel();
        float f7 = z10 ? 1.0f : 0.0f;
        float f10 = z10 ? 1.0f : 0.8f;
        float dp = z10 ? 0.0f : AndroidUtilities.dp(60.0f);
        if (z11) {
            dVar.setVisibility(0);
            ViewPropertyAnimator duration = dVar.animate().alpha(f7).scaleX(f10).scaleY(f10).setDuration(320L);
            bs bsVar = bs.h;
            duration.setInterpolator(bsVar).withEndAction(new uk(this, 5)).start();
            textView.animate().translationY(dp).setDuration(320L).setInterpolator(bsVar).start();
            textView2.animate().translationY(dp).setDuration(320L).setInterpolator(bsVar).start();
            return;
        }
        dVar.setVisibility(z10 ? 0 : 4);
        dVar.setAlpha(f7);
        dVar.setScaleX(f10);
        dVar.setScaleY(f10);
        textView.setTranslationY(dp);
        textView2.setTranslationY(dp);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (this.K0) {
            this.K0 = false;
            this.N.setTranslationY(0.0f);
            this.j0.setTranslationY(0.0f);
            this.v.setTranslationY(0.0f);
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

    @Override // org.telegram.ui.Components.li
    public final void p() {
        if (this.K) {
            return;
        }
        this.K = true;
        R();
        org.telegram.ui.Wallet.e6 e6Var = this.Q0;
        if (e6Var != null) {
            AnimatorSet animatorSet = e6Var.m;
            if (!e6Var.v) {
                if (animatorSet.isStarted()) {
                    animatorSet.cancel();
                } else {
                    e6Var.a(false);
                }
            }
            this.Q0 = null;
        }
        org.telegram.ui.Wallet.w9 w9Var = this.R0;
        if (w9Var != null) {
            AnimatorSet animatorSet2 = w9Var.m;
            if (!w9Var.s) {
                if (animatorSet2.isStarted()) {
                    animatorSet2.cancel();
                } else {
                    w9Var.b();
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
                FileLog.e(e);
            }
            this.L = null;
        }
        this.O.animate().cancel();
        this.Q.animate().cancel();
        this.V.animate().cancel();
        this.o0.animate().cancel();
        this.W.animate().cancel();
        this.a0.animate().cancel();
        ai.v3 v3Var = this.O0;
        if (v3Var != null) {
            removeCallbacks(v3Var);
            this.O0 = null;
        }
        org.telegram.ui.ActionBar.c2 c2Var = this.T0;
        if (c2Var != null) {
            c2Var.dismiss();
        }
        org.telegram.ui.Wallet.m mVar = this.i0;
        if (mVar != null) {
            mVar.run();
            this.i0 = null;
        }
        NotificationCenter.getInstance(this.n).removeObserver(this, NotificationCenter.walletUpdate);
        this.b.a1.m().removeView(this.w);
        AndroidUtilities.hideKeyboard(this.S);
    }

    public void setSendTransitionProgress(float f7) {
        this.v.setAlpha(1.0f - f7);
    }

    @Override // android.view.View
    public void setTranslationY(float f7) {
        super.setTranslationY(f7);
        this.b.getSheetContainer().invalidate();
    }

    @Override // org.telegram.ui.Components.li
    public final void u() {
        R();
        Activity activity = this.L;
        if (activity != null) {
            try {
                activity.setRequestedOrientation(this.M);
            } catch (Exception e) {
                FileLog.e(e);
            }
            this.L = null;
        }
        this.b.a1.setDrawGlassTitle(true);
        this.L0 = false;
        this.M0 = false;
        ai.v3 v3Var = this.O0;
        if (v3Var != null) {
            removeCallbacks(v3Var);
            this.O0 = null;
        }
        org.telegram.ui.ActionBar.c2 c2Var = this.T0;
        if (c2Var != null) {
            c2Var.dismiss();
        }
        this.w.setVisibility(8);
        EditTextBoldCursor editTextBoldCursor = this.S;
        AndroidUtilities.hideKeyboard(editTextBoldCursor);
        editTextBoldCursor.clearFocus();
    }

    @Override // org.telegram.ui.Components.li
    public final void w(int i10) {
        if (i10 == 2) {
            org.telegram.ui.Wallet.o5.E0(getContext(), this.n, this.a);
        } else if (i10 == 3) {
            Z();
        }
    }

    @Override // org.telegram.ui.Components.li
    public final void y() {
        if (this.B0) {
            this.B0 = false;
            float bottomYOnScreen = getBottomYOnScreen();
            FrameLayout frameLayout = this.j0;
            frameLayout.setTranslationY(this.J0 - (bottomYOnScreen - frameLayout.getTranslationY()));
            org.telegram.ui.Wallet.l8 l8Var = this.v;
            l8Var.setTranslationY(this.H0 - (W(l8Var) - l8Var.getTranslationY()));
            this.K0 = true;
            requestLayout();
        }
    }

    @Override // org.telegram.ui.Components.li
    public final void z(int i10, boolean z10) {
        this.B0 = true;
        this.K0 = false;
        this.C0 = z10;
        this.A0 = z10 ? 0.0f : 1.0f;
        this.I0 = this.D0 ? this.E0 : getBottomYOnScreen();
        boolean z11 = this.D0;
        org.telegram.ui.Wallet.l8 l8Var = this.v;
        this.G0 = z11 ? this.F0 : W(l8Var);
        this.J0 = getBottomYOnScreen() - this.j0.getTranslationY();
        this.H0 = W(l8Var) - l8Var.getTranslationY();
        l0();
    }
}
