package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
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

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class dl extends ni implements NotificationCenter.NotificationCenterDelegate {
    public boolean A0;
    public float B0;
    public float C0;
    public float D0;
    public byte[] E;
    public float E0;
    public boolean F;
    public float F0;
    public boolean G;
    public float G0;
    public boolean H;
    public boolean H0;
    public Activity I;
    public boolean I0;
    public int J;
    public boolean J0;
    public final al K;
    public boolean K0;
    public final LinearLayout L;
    public bi.g L0;
    public final FrameLayout M;
    public TL_wallet.walletTransaction M0;
    public final TextView N;
    public org.telegram.ui.Wallet.u5 N0;
    public final org.telegram.ui.Wallet.h8 O;
    public org.telegram.ui.Wallet.w8 O0;
    public final EditTextBoldCursor P;
    public boolean P0;
    public final s6 Q;
    public org.telegram.ui.ActionBar.a2 Q0;
    public final TextView R;
    public boolean R0;
    public final da0 S;
    public DecimalFormat S0;
    public final TextView T;
    public final TextView U;
    public final SpannableString V;
    public boolean W;
    public boolean a0;
    public float b0;
    public ValueAnimator c0;
    public long d0;
    public boolean e0;
    public org.telegram.ui.Wallet.m f0;
    public final FrameLayout g0;
    public final FrameLayout h0;
    public o1.k i0;
    public float j0;
    public float k0;
    public final di.d l0;
    public boolean m0;
    public final int n;
    public final SpannableString n0;
    public final SpannableString o0;
    public String p0;
    public boolean q0;
    public final TLRPC.User r;
    public boolean r0;
    public final FrameLayout s;
    public int s0;
    public DecimalFormat t0;
    public final int[] u0;
    public final org.telegram.ui.Wallet.m7 v;
    public boolean v0;
    public final org.telegram.ui.ActionBar.u0 w;
    public float w0;
    public final org.telegram.ui.ActionBar.u0 x;
    public float x0;
    public String y;
    public boolean y0;
    public boolean z0;

    public dl(vi viVar, Context context, int i10, TLRPC.User user, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, c6Var, viVar);
        this.d0 = -1L;
        this.j0 = 1.0f;
        this.k0 = 1.0f;
        final int i11 = 1;
        this.q0 = true;
        this.s0 = 6;
        this.u0 = new int[2];
        this.n = i10;
        this.r = user;
        FrameLayout frameLayout = new FrameLayout(context);
        this.s = frameLayout;
        final int i12 = 0;
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        addView(frameLayout, w7.a6.e(-1, -1, 55));
        org.telegram.ui.ActionBar.u0 a2 = this.b.a1.n().a(31, R.drawable.ic_ab_other);
        this.w = a2;
        a2.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        a2.e(2, R.drawable.msg_addbot, LocaleController.getString(R.string.WalletDepositFunds));
        a2.e(3, R.drawable.menu_comments, LocaleController.getString(R.string.WalletAddComment));
        a2.setVisibility(8);
        org.telegram.ui.ActionBar.u0 u0Var = new org.telegram.ui.ActionBar.u0(context, null, 0, org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.G6, this.a), false, c6Var);
        this.x = u0Var;
        u0Var.setIcon(R.drawable.ic_ab_other);
        u0Var.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        u0Var.setBackground(org.telegram.ui.ActionBar.g6.g0(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.i6, this.a), 1, -1));
        u0Var.setOnClickListener(new org.telegram.ui.Cells.sa(this, c6Var, i10, 6));
        org.telegram.ui.Wallet.m7 m7Var = new org.telegram.ui.Wallet.m7(context, new sk(i12, this, user), new sk(i11, this, c6Var), c6Var);
        this.v = m7Var;
        m7Var.a(this.y, user);
        addView(m7Var, w7.a6.a(64.0f, 6.0f, 0.0f, 6.0f, 0.0f, -2, 49));
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setClipChildren(false);
        frameLayout2.setClipToPadding(false);
        frameLayout.addView(frameLayout2, w7.a6.e(-1, -1, 55));
        al alVar = new al(context);
        this.K = alVar;
        alVar.setOrientation(1);
        alVar.setClipChildren(false);
        alVar.setClipToPadding(false);
        final int i13 = 3;
        alVar.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.rk
            public final /* synthetic */ dl b;

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
                        dl.N(this.b);
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
                        dl.P(this.b);
                        break;
                }
            }
        });
        frameLayout2.addView(alVar, w7.a6.e(-1, -2, 17));
        org.telegram.ui.Wallet.h8 h8Var = new org.telegram.ui.Wallet.h8(context, c6Var);
        this.O = h8Var;
        final int i14 = 4;
        h8Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.rk
            public final /* synthetic */ dl b;

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
                        dl.N(this.b);
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
                        dl.P(this.b);
                        break;
                }
            }
        });
        alVar.addView(h8Var, w7.a6.t(-1, 64, 49, 16, 0, 16, 0));
        EditTextBoldCursor editText = h8Var.getEditText();
        this.P = editText;
        editText.setFilters(new InputFilter[]{new tk(i12, this)});
        editText.setImeOptions(33554438);
        editText.setOnTouchListener(new uk(this, i12));
        final int i15 = 5;
        editText.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.rk
            public final /* synthetic */ dl b;

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
                        dl.N(this.b);
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
                        dl.P(this.b);
                        break;
                }
            }
        });
        editText.setOnEditorActionListener(new e1(this, i11));
        editText.addTextChangedListener(new bl(this));
        SpannableString spannableString = new SpannableString("⇅");
        this.n0 = spannableString;
        br brVar = new br(R.drawable.wallet_currency_exchange, 0);
        brVar.setAlpha(0.72f);
        spannableString.setSpan(brVar, 0, spannableString.length(), 33);
        SpannableString spannableString2 = new SpannableString("G");
        this.o0 = spannableString2;
        br brVar2 = new br(R.drawable.wallet_gram_small, 0);
        brVar2.recolorDrawable = false;
        spannableString2.setSpan(brVar2, 0, spannableString2.length(), 33);
        s6 s6Var = new s6(context, false, true, true, true, true);
        this.Q = s6Var;
        s6Var.c.m(0.35f, 320L, 3.5f, es.h);
        s6Var.setScaleProperty(0.35f);
        s6Var.setText(U(org.telegram.ui.Wallet.j0.v(i10), 0L));
        int w02 = org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.d6, this.a);
        int i16 = org.telegram.ui.ActionBar.g6.z6;
        s6Var.setTextColor(org.telegram.ui.ActionBar.g6.v(w02, org.telegram.ui.ActionBar.g6.w0(i16, this.a)));
        s6Var.setTextSize(AndroidUtilities.dp(14.0f));
        s6Var.setTypeface(AndroidUtilities.getTypeface("fonts/gram.ttf"));
        s6Var.setGravity(17);
        s6Var.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
        s6Var.setAllowCancel(true);
        s6Var.setSizeableBackground(org.telegram.ui.ActionBar.g6.c0(AndroidUtilities.dp(14.0f), org.telegram.ui.ActionBar.g6.m1(0.08f, org.telegram.ui.ActionBar.g6.w0(i16, this.a))));
        alVar.addView(s6Var, w7.a6.t(-2, 28, 49, 0, 8, 0, 0));
        w7.c6.a(s6Var);
        final int i17 = 6;
        s6Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.rk
            public final /* synthetic */ dl b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i17) {
                    case 0:
                        this.b.c0();
                        break;
                    case 1:
                        this.b.Z();
                        break;
                    case 2:
                        dl.N(this.b);
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
                        dl.P(this.b);
                        break;
                }
            }
        });
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.M = frameLayout3;
        alVar.addView(frameLayout3, w7.a6.q(-2, -2, 49));
        LinearLayout linearLayout = new LinearLayout(context);
        this.L = linearLayout;
        linearLayout.setOrientation(1);
        frameLayout3.addView(linearLayout, w7.a6.e(-2, -2, 49));
        TextView textView = new TextView(context);
        this.N = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(i16, this.a));
        textView.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
        textView.setGravity(17);
        textView.setText(LocaleController.getString(R.string.WalletTapToSetAmount));
        frameLayout3.addView(textView, w7.a6.a(28.0f, 0.0f, 8.0f, 0.0f, 0.0f, -2, 49));
        w7.c6.a(textView);
        textView.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.rk
            public final /* synthetic */ dl b;

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
                        dl.N(this.b);
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
                        dl.P(this.b);
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
        this.R0 = false;
        TextView textView2 = new TextView(context);
        this.R = textView2;
        org.telegram.ui.ActionBar.d5 d5Var = new org.telegram.ui.ActionBar.d5(0, true, false, null);
        d5Var.x = false;
        Paint.Style style = Paint.Style.STROKE;
        Paint paint = d5Var.c;
        paint.setStyle(style);
        paint.setStrokeWidth(Math.max(1.0f, AndroidUtilities.dpf2(0.5f)));
        int i18 = org.telegram.ui.ActionBar.g6.kl;
        paint.setColor(org.telegram.ui.ActionBar.g6.w0(i18, this.a));
        d5Var.w = Integer.valueOf(org.telegram.ui.ActionBar.g6.w0(i18, this.a));
        textView2.setPadding(AndroidUtilities.dp(15.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(19.0f), AndroidUtilities.dp(8.0f));
        textView2.setBackground(d5Var);
        textView2.setTextSize(1, 14.0f);
        textView2.setTextColor(org.telegram.ui.ActionBar.g6.w0(i16, this.a));
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setVisibility(8);
        textView2.setEllipsize(TextUtils.TruncateAt.END);
        textView2.setMaxLines(4);
        linearLayout.addView(textView2, w7.a6.t(-2, -2, 49, 32, 12, 32, 0));
        textView2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.rk
            public final /* synthetic */ dl b;

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
                        dl.N(this.b);
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
                        dl.P(this.b);
                        break;
                }
            }
        });
        w7.c6.b(textView2, 0.02f, 1.2f);
        da0 da0Var = new da0(context, c6Var);
        this.S = da0Var;
        da0Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.q7, this.a));
        da0Var.setLinkTextColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.Oh, this.a));
        da0Var.setTextSize(1, 14.0f);
        da0Var.setGravity(17);
        da0Var.setTypeface(AndroidUtilities.bold());
        da0Var.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
        e0(false);
        linearLayout.addView(da0Var, w7.a6.t(-2, -2, 49, 0, 10, 0, 0));
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.g0 = frameLayout4;
        frameLayout4.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(12.0f));
        FrameLayout frameLayout5 = new FrameLayout(context);
        this.h0 = frameLayout5;
        frameLayout4.setClipChildren(false);
        frameLayout4.setClipToPadding(false);
        frameLayout5.setClipChildren(false);
        frameLayout5.setClipToPadding(false);
        frameLayout4.addView(frameLayout5, w7.a6.d(-1.0f, -1));
        TextView textView3 = new TextView(context);
        this.T = textView3;
        org.telegram.messenger.yh.n(i16, this.a, textView3, 1, 14.0f);
        textView3.setGravity(17);
        frameLayout5.addView(textView3, w7.a6.e(-1, 20, 55));
        TextView textView4 = new TextView(context);
        this.U = textView4;
        org.telegram.messenger.yh.n(i16, this.a, textView4, 1, 14.0f);
        textView4.setGravity(17);
        textView4.setPadding(0, AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f));
        textView4.setVisibility(8);
        frameLayout5.addView(textView4, w7.a6.a(-2.0f, 0.0f, 24.0f, 0.0f, 0.0f, -1, 55));
        SpannableString spannableString3 = new SpannableString(LocaleController.getString(R.string.Loading));
        this.V = spannableString3;
        spannableString3.setSpan(new ia0(AndroidUtilities.dp(80.0f), textView4), 0, spannableString3.length(), 33);
        di.d f7 = org.telegram.messenger.yh.f(24, context, c6Var, true);
        this.l0 = f7;
        f7.setText(LocaleController.getString(R.string.WalletSendGrams));
        f7.setEnabled(false);
        final int i19 = 2;
        f7.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.rk
            public final /* synthetic */ dl b;

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
                        dl.N(this.b);
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
                        dl.P(this.b);
                        break;
                }
            }
        });
        frameLayout5.addView(f7, w7.a6.e(-1, 48, 87));
        frameLayout.addView(frameLayout4, w7.a6.a(92.0f, 0.0f, 0.0f, 0.0f, 70.0f, -1, 87));
        m0(false, false);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.walletUpdate);
        h0();
        this.F = true;
        org.telegram.ui.Wallet.j0.v(i10).W(user, new wk(this, 0));
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void N(final dl dlVar) {
        boolean z10;
        bi.g gVar;
        EditTextBoldCursor editTextBoldCursor = dlVar.P;
        int i10 = dlVar.n;
        di.d dVar = dlVar.l0;
        if (!dVar.W || dVar.N) {
            return;
        }
        org.telegram.ui.Wallet.j0 v = org.telegram.ui.Wallet.j0.v(i10);
        long gramNanoAmount = dlVar.getGramNanoAmount();
        long t10 = v.t();
        if (!WalletEngine2.isValidAddress(dlVar.y) || gramNanoAmount <= 0) {
            return;
        }
        long j10 = MessagesController.getInstance(i10).config.walletTransferMinNanos.get();
        if (gramNanoAmount < j10) {
            String S = dlVar.r0 ? dlVar.S(j10, dlVar.getCurrencyPerGram()) : V(j10);
            editTextBoldCursor.setText(S);
            editTextBoldCursor.setSelection(S.length());
            int i11 = -dlVar.s0;
            dlVar.s0 = i11;
            AndroidUtilities.shakeViewSpring(editTextBoldCursor, i11);
            return;
        }
        if (gramNanoAmount > t10) {
            BotWebViewVibrationEffect.APP_ERROR.vibrate();
            da0 da0Var = dlVar.S;
            int i12 = -dlVar.s0;
            dlVar.s0 = i12;
            AndroidUtilities.shakeViewSpring(da0Var, i12);
            return;
        }
        MessagesController messagesController = MessagesController.getInstance(i10);
        long sendPaidMessagesStars = messagesController.getSendPaidMessagesStars(dlVar.r.id);
        if (messagesController.config.walletPaidMessageRecipientMessageAmountCheck.get() && sendPaidMessagesStars > 0) {
            if (messagesController.config.tonUsdRate.get() * (gramNanoAmount / 1.0E9d) < (sendPaidMessagesStars / 1000.0d) * messagesController.starsUsdWithdrawRate1000) {
                z10 = true;
                dlVar.P0 = z10;
                dVar.setLoading(true);
                dlVar.K0 = true;
                dlVar.J0 = false;
                gVar = dlVar.L0;
                if (gVar != null) {
                    dlVar.removeCallbacks(gVar);
                    dlVar.L0 = null;
                }
                dlVar.M0 = null;
                TLRPC.User user = dlVar.r;
                String str = dlVar.y;
                String str2 = dlVar.p0;
                byte[] publicKey = dlVar.q0 ? dlVar.getPublicKey() : null;
                final int i13 = 0;
                Utilities.Callback callback = new Utilities.Callback(dlVar) { // from class: org.telegram.ui.Components.yk
                    public final /* synthetic */ dl b;

                    {
                        this.b = dlVar;
                    }

                    @Override // org.telegram.messenger.Utilities.Callback
                    public final void run(Object obj) {
                        switch (i13) {
                            case 0:
                                String str3 = (String) obj;
                                dl dlVar2 = this.b;
                                di.d dVar2 = dlVar2.l0;
                                vi viVar = dlVar2.b;
                                if (!dlVar2.H && !viVar.isDismissed()) {
                                    if (!"PASSCODE_FAILED".equalsIgnoreCase(str3)) {
                                        if (!TextUtils.isEmpty(str3)) {
                                            dVar2.setLoading(false);
                                            dlVar2.K0 = false;
                                            zc.X().e0(str3, false);
                                            break;
                                        } else {
                                            viVar.dismiss();
                                            break;
                                        }
                                    } else {
                                        dVar2.setLoading(false);
                                        dlVar2.K0 = false;
                                        break;
                                    }
                                }
                                break;
                            default:
                                this.b.M0 = (TL_wallet.walletTransaction) obj;
                                break;
                        }
                    }
                };
                final int i14 = 1;
                v.Z(user, str, gramNanoAmount, str2, publicKey, null, null, callback, new Utilities.Callback(dlVar) { // from class: org.telegram.ui.Components.yk
                    public final /* synthetic */ dl b;

                    {
                        this.b = dlVar;
                    }

                    @Override // org.telegram.messenger.Utilities.Callback
                    public final void run(Object obj) {
                        switch (i14) {
                            case 0:
                                String str3 = (String) obj;
                                dl dlVar2 = this.b;
                                di.d dVar2 = dlVar2.l0;
                                vi viVar = dlVar2.b;
                                if (!dlVar2.H && !viVar.isDismissed()) {
                                    if (!"PASSCODE_FAILED".equalsIgnoreCase(str3)) {
                                        if (!TextUtils.isEmpty(str3)) {
                                            dVar2.setLoading(false);
                                            dlVar2.K0 = false;
                                            zc.X().e0(str3, false);
                                            break;
                                        } else {
                                            viVar.dismiss();
                                            break;
                                        }
                                    } else {
                                        dVar2.setLoading(false);
                                        dlVar2.K0 = false;
                                        break;
                                    }
                                }
                                break;
                            default:
                                this.b.M0 = (TL_wallet.walletTransaction) obj;
                                break;
                        }
                    }
                });
            }
        }
        z10 = false;
        dlVar.P0 = z10;
        dVar.setLoading(true);
        dlVar.K0 = true;
        dlVar.J0 = false;
        gVar = dlVar.L0;
        if (gVar != null) {
        }
        dlVar.M0 = null;
        TLRPC.User user2 = dlVar.r;
        String str3 = dlVar.y;
        String str22 = dlVar.p0;
        if (dlVar.q0) {
        }
        final int i132 = 0;
        Utilities.Callback callback2 = new Utilities.Callback(dlVar) { // from class: org.telegram.ui.Components.yk
            public final /* synthetic */ dl b;

            {
                this.b = dlVar;
            }

            @Override // org.telegram.messenger.Utilities.Callback
            public final void run(Object obj) {
                switch (i132) {
                    case 0:
                        String str32 = (String) obj;
                        dl dlVar2 = this.b;
                        di.d dVar2 = dlVar2.l0;
                        vi viVar = dlVar2.b;
                        if (!dlVar2.H && !viVar.isDismissed()) {
                            if (!"PASSCODE_FAILED".equalsIgnoreCase(str32)) {
                                if (!TextUtils.isEmpty(str32)) {
                                    dVar2.setLoading(false);
                                    dlVar2.K0 = false;
                                    zc.X().e0(str32, false);
                                    break;
                                } else {
                                    viVar.dismiss();
                                    break;
                                }
                            } else {
                                dVar2.setLoading(false);
                                dlVar2.K0 = false;
                                break;
                            }
                        }
                        break;
                    default:
                        this.b.M0 = (TL_wallet.walletTransaction) obj;
                        break;
                }
            }
        };
        final int i142 = 1;
        v.Z(user2, str3, gramNanoAmount, str22, publicKey, null, null, callback2, new Utilities.Callback(dlVar) { // from class: org.telegram.ui.Components.yk
            public final /* synthetic */ dl b;

            {
                this.b = dlVar;
            }

            @Override // org.telegram.messenger.Utilities.Callback
            public final void run(Object obj) {
                switch (i142) {
                    case 0:
                        String str32 = (String) obj;
                        dl dlVar2 = this.b;
                        di.d dVar2 = dlVar2.l0;
                        vi viVar = dlVar2.b;
                        if (!dlVar2.H && !viVar.isDismissed()) {
                            if (!"PASSCODE_FAILED".equalsIgnoreCase(str32)) {
                                if (!TextUtils.isEmpty(str32)) {
                                    dVar2.setLoading(false);
                                    dlVar2.K0 = false;
                                    zc.X().e0(str32, false);
                                    break;
                                } else {
                                    viVar.dismiss();
                                    break;
                                }
                            } else {
                                dVar2.setLoading(false);
                                dlVar2.K0 = false;
                                break;
                            }
                        }
                        break;
                    default:
                        this.b.M0 = (TL_wallet.walletTransaction) obj;
                        break;
                }
            }
        });
    }

    public static void P(dl dlVar) {
        EditTextBoldCursor editTextBoldCursor = dlVar.P;
        BigDecimal currencyPerGram = dlVar.getCurrencyPerGram();
        if (dlVar.r0 || currencyPerGram.signum() > 0) {
            long gramNanoAmount = dlVar.getGramNanoAmount();
            dlVar.r0 = !dlVar.r0;
            dlVar.O.d(org.telegram.ui.Wallet.j0.v(dlVar.n), dlVar.r0);
            String S = gramNanoAmount <= 0 ? "" : dlVar.r0 ? dlVar.S(gramNanoAmount, currencyPerGram) : V(gramNanoAmount);
            editTextBoldCursor.setText(S);
            editTextBoldCursor.setSelection(S.length());
        }
    }

    public static /* synthetic */ CharSequence Q(dl dlVar, CharSequence charSequence, int i10, int i11, Spanned spanned, int i12, int i13) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(spanned.subSequence(0, i12).toString());
        sb2.append((Object) charSequence.subSequence(i10, i11));
        sb2.append((Object) spanned.subSequence(i13, spanned.length()));
        String sb3 = sb2.toString();
        int i14 = 9;
        BigDecimal valueOf = BigDecimal.valueOf(Long.MAX_VALUE, 9);
        if (dlVar.r0) {
            BigDecimal currencyPerGram = dlVar.getCurrencyPerGram();
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
        return W(this.g0);
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
        return selectedCurrencyRate != null ? selectedCurrencyRate.exp : TextUtils.equals(org.telegram.ui.Wallet.j0.v(this.n).h.g(), "USD") ? 2 : 0;
    }

    private BigDecimal getCurrencyPerGram() {
        int i10 = this.n;
        org.telegram.ui.Wallet.f fVar = org.telegram.ui.Wallet.j0.v(i10).h;
        fVar.f();
        double h = fVar.h();
        double d = MessagesController.getInstance(i10).config.tonUsdRate.get();
        return (h <= 0.0d || d <= 0.0d || Double.isNaN(h) || Double.isInfinite(h) || Double.isNaN(d) || Double.isInfinite(d)) ? BigDecimal.ZERO : BigDecimal.valueOf(h).multiply(BigDecimal.valueOf(d));
    }

    private long getGramNanoAmount() {
        BigDecimal a02 = a0(this.P.getText().toString());
        if (this.r0) {
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
        if (this.S0 == null) {
            this.S0 = new DecimalFormat("#,##0.#########", new DecimalFormatSymbols(Locale.US));
        }
        return gramNanoAmount > 0 ? this.S0.format(BigDecimal.valueOf(gramNanoAmount, 9)) : "";
    }

    private TL_wallet.currencyRate getSelectedCurrencyRate() {
        org.telegram.ui.Wallet.f fVar = org.telegram.ui.Wallet.j0.v(this.n).h;
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
        this.b0 = f7;
        TextView textView = this.U;
        textView.setAlpha(f7);
        textView.setVisibility(f7 > 0.0f ? 0 : 8);
        requestLayout();
    }

    @Override // org.telegram.ui.Components.ni
    public final void A() {
        R();
        f0();
    }

    @Override // org.telegram.ui.Components.ni
    public final void B(int i10, int i11) {
        int i12;
        vi viVar = this.b;
        boolean z10 = viVar.u1.R() > AndroidUtilities.dp(20.0f);
        this.v0 = z10;
        this.f = z10;
        int dp = z10 ? 0 : AndroidUtilities.dp(70.0f);
        int round = Math.round(AndroidUtilities.dp(32.0f) * this.b0) + AndroidUtilities.dp(92.0f);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.g0.getLayoutParams();
        layoutParams.height = round;
        layoutParams.bottomMargin = dp;
        if (this.v0) {
            i12 = AndroidUtilities.dp(56.0f);
            viVar.setAllowNestedScroll(false);
        } else {
            if (!AndroidUtilities.isTablet()) {
                Point point = AndroidUtilities.displaySize;
                if (point.x > point.y) {
                    i12 = (int) (i11 / 3.5f);
                    viVar.setAllowNestedScroll(true);
                }
            }
            i12 = (i11 / 5) * 2;
            viVar.setAllowNestedScroll(true);
        }
        int c10 = org.telegram.messenger.q.c(1.0f, i12, 0) + AndroidUtilities.statusBarHeight;
        FrameLayout frameLayout = this.s;
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
        if (layoutParams2.topMargin != c10) {
            layoutParams2.topMargin = c10;
            frameLayout.setLayoutParams(layoutParams2);
        }
        int z11 = org.telegram.messenger.q.z(4.0f, c10 - AndroidUtilities.statusBarHeight, 0);
        org.telegram.ui.Wallet.m7 m7Var = this.v;
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) m7Var.getLayoutParams();
        int max = Math.max(0, this.v0 ? AndroidUtilities.dp(4.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() : z11 - AndroidUtilities.dp(4.0f));
        if (layoutParams3.topMargin != max) {
            layoutParams3.topMargin = max;
            m7Var.setLayoutParams(layoutParams3);
        }
        i0();
    }

    @Override // org.telegram.ui.Components.ni
    public final void G(ni niVar) {
        Activity findActivity;
        R();
        if (this.I == null && !AndroidUtilities.isTablet()) {
            Point point = AndroidUtilities.displaySize;
            if (Math.min(point.x, point.y) < AndroidUtilities.dp(700.0f) && (findActivity = AndroidUtilities.findActivity(getContext())) != null) {
                try {
                    this.J = findActivity.getRequestedOrientation();
                    findActivity.setRequestedOrientation(1);
                    this.I = findActivity;
                } catch (Exception e) {
                    FileLog.e(e);
                }
            }
        }
        this.I0 = false;
        this.K0 = false;
        EditTextBoldCursor editTextBoldCursor = this.P;
        editTextBoldCursor.setFocusableInTouchMode(true);
        editTextBoldCursor.setShowSoftInputOnFocus(true);
        this.J0 = false;
        this.y0 = false;
        this.H0 = false;
        this.K.setTranslationY(0.0f);
        this.g0.setTranslationY(0.0f);
        org.telegram.ui.Wallet.m7 m7Var = this.v;
        m7Var.setTranslationY(0.0f);
        m7Var.setAlpha(1.0f);
        this.A0 = false;
        vi viVar = this.b;
        viVar.a1.setTitle(LocaleController.getString(R.string.WalletSendMoneyTo));
        viVar.a1.setDrawGlassTitle(false);
        this.w.setVisibility(0);
        editTextBoldCursor.clearFocus();
        Y();
        org.telegram.ui.Wallet.h8 h8Var = this.O;
        float f7 = h8Var.getDiamondView().f == null ? 1.0f : 0.0f;
        this.k0 = f7;
        this.j0 = f7;
        k0();
        if (this.j0 < 1.0f) {
            h8Var.getDiamondView().l(new xk(this, 3));
        }
    }

    @Override // org.telegram.ui.Components.ni
    public final void I() {
        this.I0 = true;
        post(new xk(this, 4));
    }

    @Override // org.telegram.ui.Components.ni
    public final boolean M() {
        return !this.K0;
    }

    public final void R() {
        this.O.getDiamondView().l(null);
        o1.k kVar = this.i0;
        if (kVar != null) {
            kVar.c();
        }
        this.j0 = 1.0f;
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

    public final SpannableStringBuilder U(org.telegram.ui.Wallet.j0 j0Var, long j10) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("≈ ");
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append(j0Var.l(j10, false));
        d0(spannableStringBuilder, length, spannableStringBuilder.length(), getCurrencyDecimalSeparator());
        return spannableStringBuilder.append((CharSequence) " ").append((CharSequence) this.n0);
    }

    public final float W(View view) {
        float f7 = 0.0f;
        while (view.getParent() instanceof View) {
            View view2 = (View) view.getParent();
            f7 += view.getY() - view2.getScrollY();
            view = view2;
        }
        view.getLocationOnScreen(this.u0);
        return ((f7 + r1[1]) + this.w0) - this.b.y0;
    }

    public final float X(View view) {
        if (view.getVisibility() != 0 || view.getAlpha() <= 0.0f) {
            return Float.POSITIVE_INFINITY;
        }
        return ((1.0f - view.getScaleY()) * view.getPivotY()) + (W(view) - this.h0.getTranslationY());
    }

    public final void Y() {
        if (this.H || TextUtils.isEmpty(this.y)) {
            return;
        }
        org.telegram.ui.Wallet.m mVar = this.f0;
        if (mVar != null) {
            mVar.run();
            this.f0 = null;
        }
        this.d0 = -1L;
        h0();
        org.telegram.ui.Wallet.j0 v = org.telegram.ui.Wallet.j0.v(this.n);
        if (this.e0) {
            this.f0 = v.h(this.y, Math.max(100000000L, getGramNanoAmount()), this.p0, this.q0 ? getPublicKey() : null, new wk(this, 1));
        }
    }

    public final void Z() {
        if (this.H || this.K0 || this.L0 != null || this.Q0 != null) {
            return;
        }
        c0();
        bi.g gVar = new bi.g(this, SystemClock.uptimeMillis() + 1500, 22);
        this.L0 = gVar;
        post(gVar);
    }

    public final void b0() {
        if (!this.I0 || this.y0 || this.H0 || !isAttachedToWindow() || Math.abs(getTranslationY()) >= 0.5f || this.K.getHeight() <= 0 || this.g0.getHeight() <= 0) {
            return;
        }
        this.B0 = getBottomYOnScreen();
        this.C0 = W(this.v);
        this.A0 = true;
    }

    public final void c0() {
        if (this.H || this.K0) {
            return;
        }
        vi viVar = this.b;
        if (viVar.isDismissed()) {
            return;
        }
        if (!this.I0) {
            this.J0 = true;
            return;
        }
        this.J0 = false;
        EditTextBoldCursor editTextBoldCursor = this.P;
        editTextBoldCursor.setFocusableInTouchMode(true);
        editTextBoldCursor.setShowSoftInputOnFocus(true);
        viVar.w1(editTextBoldCursor, true);
        editTextBoldCursor.requestFocus();
        AndroidUtilities.showKeyboard(editTextBoldCursor);
        editTextBoldCursor.postDelayed(new xk(this, 1), 220L);
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.walletUpdate) {
            boolean z10 = this.e0;
            g0();
            if (z10 != this.e0) {
                Y();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        this.b.a1.getAlpha();
        j0();
        if (this.i0 != null || this.j0 < 1.0f) {
            k0();
        }
        super.dispatchDraw(canvas);
        b0();
    }

    public final void e0(boolean z10) {
        da0 da0Var = this.S;
        if (z10) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.WalletInsufficientFunds));
            spannableStringBuilder.append((CharSequence) " ");
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.WalletDepositFunds));
            spannableStringBuilder.append((CharSequence) " >");
            spannableStringBuilder.setSpan(new br(R.drawable.settings_arrow, 0).setOverrideColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.Oh, this.a)).translate(0.0f, AndroidUtilities.dpf2(0.66f)), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
            spannableStringBuilder.setSpan(new di.zb(this, 6), length, spannableStringBuilder.length(), 33);
            da0Var.setText(spannableStringBuilder);
        }
        da0Var.animate().alpha(z10 ? 1.0f : 0.0f).scaleX(z10 ? 1.0f : 0.6f).scaleY(z10 ? 1.0f : 0.6f).setDuration(320L).setInterpolator(es.h).start();
    }

    public final void f0() {
        if (!this.K0 || this.H) {
            return;
        }
        this.J0 = false;
        EditTextBoldCursor editTextBoldCursor = this.P;
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
        org.telegram.ui.Wallet.j0 v = org.telegram.ui.Wallet.j0.v(i10);
        long t10 = v.t();
        long gramNanoAmount = getGramNanoAmount();
        long j10 = MessagesController.getInstance(i10).config.walletTransferMinNanos.get();
        EditTextBoldCursor editTextBoldCursor = this.P;
        if (gramNanoAmount > 0 && gramNanoAmount < j10) {
            String S = this.r0 ? S(j10, getCurrencyPerGram()) : V(j10);
            editTextBoldCursor.setText(S);
            editTextBoldCursor.setSelection(S.length());
            int i11 = -this.s0;
            this.s0 = i11;
            AndroidUtilities.shakeViewSpring(editTextBoldCursor, i11);
            return;
        }
        boolean z10 = false;
        boolean z11 = WalletEngine2.isValidAddress(this.y) && gramNanoAmount <= t10;
        e0(!TextUtils.isEmpty(editTextBoldCursor.getText()) && gramNanoAmount > t10);
        String gramsText = getGramsText();
        boolean z12 = this.y == null && this.F;
        di.d dVar = this.l0;
        dVar.setLoading(z12);
        dVar.g(TextUtils.isEmpty(gramsText) ? LocaleController.getString(R.string.WalletSendGrams) : LocaleController.formatSpannable(R.string.WalletSendAmount, org.telegram.ui.Wallet.j0.k("Grams", gramsText, R.string.Grams_other)), true, true);
        boolean isEmpty = TextUtils.isEmpty(editTextBoldCursor.getText());
        boolean z13 = !isEmpty;
        if (!isEmpty && z11 && !this.G) {
            z10 = true;
        }
        dVar.setEnabled(z10);
        m0(z13, this.I0);
        h0();
        this.O.d(org.telegram.ui.Wallet.j0.v(i10), this.r0);
        if (this.r0) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) this.o0).append((CharSequence) " ");
            int length = spannableStringBuilder.length();
            if (this.t0 == null) {
                DecimalFormat decimalFormat = new DecimalFormat("#,##0.##", new DecimalFormatSymbols(Locale.US));
                this.t0 = decimalFormat;
                decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
            }
            spannableStringBuilder.append((CharSequence) this.t0.format(BigDecimal.valueOf(gramNanoAmount).movePointLeft(9)));
            d0(spannableStringBuilder, length, spannableStringBuilder.length(), '.');
            spannableStringBuilder.append((CharSequence) " ");
            int length2 = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.GramCurrency));
            spannableStringBuilder.setSpan(new RelativeSizeSpan(0.85714287f), length2, spannableStringBuilder.length(), 33);
            U = spannableStringBuilder.append((CharSequence) " ").append((CharSequence) this.n0);
        } else {
            U = U(v, gramNanoAmount);
        }
        this.Q.setText(U);
    }

    @Override // org.telegram.ui.Components.ni
    public int getButtonsHideOffset() {
        return AndroidUtilities.dp(62.0f);
    }

    @Override // org.telegram.ui.Components.ni
    public int getCurrentItemTop() {
        int top = this.s.getTop();
        if (top <= 0) {
            top = getListTopPadding();
        }
        return AndroidUtilities.dp(13.0f) + Math.max(0, top - (AndroidUtilities.dp(12.0f) + AndroidUtilities.statusBarHeight));
    }

    @Override // org.telegram.ui.Components.ni
    public int getCustomBackground() {
        return org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.d6, this.a);
    }

    @Override // org.telegram.ui.Components.ni
    public int getFirstOffset() {
        return AndroidUtilities.dp(5.0f) + getListTopPadding();
    }

    @Override // org.telegram.ui.Components.ni
    public int getListTopPadding() {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.s.getLayoutParams();
        if (layoutParams == null) {
            return 0;
        }
        return layoutParams.topMargin;
    }

    public byte[] getPublicKey() {
        if (this.E == null) {
            return null;
        }
        int i10 = 0;
        while (true) {
            byte[] bArr = this.E;
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
        org.telegram.ui.Wallet.j0 v = org.telegram.ui.Wallet.j0.v(i10);
        this.T.setText(LocaleController.formatSpannable(R.string.WalletBalanceAmount, org.telegram.ui.Wallet.j0.q(v.t(), true)));
        this.e0 = !v.C() && v.t() >= MessagesController.getInstance(i10).config.walletTransferMinNanos.get();
        boolean z10 = this.a0 | (!TextUtils.isEmpty(this.P.getText()));
        this.a0 = z10;
        boolean z11 = this.e0 && z10;
        if (this.W != z11) {
            this.W = z11;
            ValueAnimator valueAnimator = this.c0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.c0 = null;
            }
            float f7 = z11 ? 1.0f : 0.0f;
            if (this.I0 && isAttachedToWindow()) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.b0, f7);
                this.c0 = ofFloat;
                ofFloat.setDuration(320L);
                this.c0.setInterpolator(es.h);
                this.c0.addUpdateListener(new n6(this, 11));
                this.c0.start();
            } else {
                setFeeVisibilityProgress(f7);
            }
        }
        long j10 = this.d0;
        TextView textView = this.U;
        if (j10 >= 0) {
            textView.setText(LocaleController.formatSpannable(R.string.WalletNetworkFeeAmount, org.telegram.ui.Wallet.j0.q(j10, false)));
        } else {
            textView.setText(LocaleController.formatSpannable(R.string.WalletNetworkFeeAmount, this.V));
        }
    }

    @Override // org.telegram.ui.Components.ni
    public final int i() {
        return 1;
    }

    public final void i0() {
        TextView textView;
        LinearLayout linearLayout = this.L;
        if (linearLayout == null || (textView = this.N) == null) {
            return;
        }
        final boolean z10 = getGramNanoAmount() > 0 || this.R.getVisibility() == 0 || this.v0;
        if (z10 == this.R0) {
            return;
        }
        this.R0 = z10;
        linearLayout.setVisibility(0);
        textView.setVisibility(0);
        final int i10 = 0;
        ViewPropertyAnimator duration = linearLayout.animate().alpha(z10 ? 1.0f : 0.0f).scaleX(z10 ? 1.0f : 0.8f).scaleY(z10 ? 1.0f : 0.8f).withEndAction(new Runnable(this) { // from class: org.telegram.ui.Components.zk
            public final /* synthetic */ dl b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i10) {
                    case 0:
                        this.b.L.setVisibility(z10 ? 0 : 4);
                        break;
                    default:
                        this.b.N.setVisibility(!z10 ? 0 : 4);
                        break;
                }
            }
        }).setDuration(320L);
        es esVar = es.h;
        duration.setInterpolator(esVar).start();
        final int i11 = 1;
        textView.animate().alpha(z10 ? 0.0f : 1.0f).scaleX(!z10 ? 1.0f : 0.8f).scaleY(z10 ? 0.8f : 1.0f).withEndAction(new Runnable(this) { // from class: org.telegram.ui.Components.zk
            public final /* synthetic */ dl b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i11) {
                    case 0:
                        this.b.L.setVisibility(z10 ? 0 : 4);
                        break;
                    default:
                        this.b.N.setVisibility(!z10 ? 0 : 4);
                        break;
                }
            }
        }).setDuration(320L).setInterpolator(esVar).start();
    }

    @Override // org.telegram.ui.Components.ni
    public final boolean j() {
        if (this.b.u1.R() <= AndroidUtilities.dp(20.0f)) {
            return false;
        }
        this.J0 = false;
        bi.g gVar = this.L0;
        if (gVar != null) {
            removeCallbacks(gVar);
            this.L0 = null;
        }
        EditTextBoldCursor editTextBoldCursor = this.P;
        editTextBoldCursor.clearFocus();
        AndroidUtilities.hideKeyboard(editTextBoldCursor);
        return true;
    }

    public final void j0() {
        float f7;
        View view = this.K;
        if (view.getHeight() > 0) {
            if (this.g0.getHeight() <= 0) {
                return;
            }
            float W = W(this.s);
            org.telegram.ui.Wallet.m7 m7Var = this.v;
            if (m7Var.getVisibility() == 0) {
                f7 = Math.max(W, (m7Var.getScaleY() * (m7Var.getContentBottom() - m7Var.getPivotY())) + m7Var.getPivotY() + W(m7Var));
            } else {
                f7 = W;
            }
            float max = Math.max(0.0f, Math.min(Math.min(Math.min((W + r2.getHeight()) - ((FrameLayout.LayoutParams) r1.getLayoutParams()).bottomMargin, X(this.T)), X(this.U)), X(this.l0)) - f7);
            float min = Math.min(1.0f, Math.max(0.0f, max - (Math.min(AndroidUtilities.dp(12.0f), max / 4.0f) * 2.0f)) / view.getHeight());
            view.setPivotX(view.getWidth() / 2.0f);
            view.setPivotY(view.getHeight() / 2.0f);
            view.setScaleX(min);
            view.setScaleY(min);
            view.setTranslationY(((max / 2.0f) + f7) - ((view.getHeight() / 2.0f) + (W(view) - view.getTranslationY())));
        }
    }

    public final void k0() {
        float max = Math.max(this.k0, Math.max(0.0f, Math.min(1.0f, this.j0)));
        this.k0 = max;
        float f7 = 1.0f - max;
        float f10 = this.j0;
        boolean z10 = this.i0 == null && f10 == 1.0f;
        org.telegram.ui.Wallet.h8 h8Var = this.O;
        h8Var.e(f10, max, z10);
        h8Var.setTranslationY((1.0f - this.j0) * (((this.K.getHeight() / 2.0f) - h8Var.getTop()) - (h8Var.getHeight() / 2.0f)));
        float f11 = this.k0;
        s6 s6Var = this.Q;
        s6Var.setAlpha(f11);
        s6Var.setTranslationY(AndroidUtilities.dp(16.0f) * f7);
        float f12 = this.k0;
        FrameLayout frameLayout = this.M;
        frameLayout.setAlpha(f12);
        frameLayout.setTranslationY(AndroidUtilities.dp(16.0f) * f7);
        float f13 = this.k0;
        FrameLayout frameLayout2 = this.h0;
        frameLayout2.setAlpha(f13);
        frameLayout2.setTranslationY(AndroidUtilities.dp(24.0f) * f7);
    }

    public final void l0() {
        if (!this.y0 || this.K.getHeight() <= 0) {
            return;
        }
        FrameLayout frameLayout = this.g0;
        if (frameLayout.getHeight() <= 0) {
            return;
        }
        float f7 = this.z0 ? this.x0 : 1.0f - this.x0;
        float f10 = this.F0;
        float y3 = com.google.android.gms.internal.play_billing.k3.y(this.G0, f10, f7, f10);
        float f11 = this.D0;
        float y10 = com.google.android.gms.internal.play_billing.k3.y(this.E0, f11, f7, f11);
        frameLayout.setTranslationY(y3 - (getBottomYOnScreen() - frameLayout.getTranslationY()));
        org.telegram.ui.Wallet.m7 m7Var = this.v;
        m7Var.setTranslationY(y10 - (W(m7Var) - m7Var.getTranslationY()));
        j0();
    }

    @Override // org.telegram.ui.Components.ni
    public final void m(float f7, float f10) {
        this.w0 = f7;
        this.x0 = f10;
        l0();
    }

    public final void m0(boolean z10, boolean z11) {
        if (z11 && this.m0 == z10) {
            return;
        }
        this.m0 = z10;
        di.d dVar = this.l0;
        dVar.animate().cancel();
        TextView textView = this.T;
        textView.animate().cancel();
        TextView textView2 = this.U;
        textView2.animate().cancel();
        float f7 = z10 ? 1.0f : 0.0f;
        float f10 = z10 ? 1.0f : 0.8f;
        float dp = z10 ? 0.0f : AndroidUtilities.dp(60.0f);
        if (z11) {
            dVar.setVisibility(0);
            ViewPropertyAnimator duration = dVar.animate().alpha(f7).scaleX(f10).scaleY(f10).setDuration(320L);
            es esVar = es.h;
            duration.setInterpolator(esVar).withEndAction(new xk(this, 5)).start();
            textView.animate().translationY(dp).setDuration(320L).setInterpolator(esVar).start();
            textView2.animate().translationY(dp).setDuration(320L).setInterpolator(esVar).start();
            return;
        }
        dVar.setVisibility(z10 ? 0 : 4);
        dVar.setAlpha(f7);
        dVar.setScaleX(f10);
        dVar.setScaleY(f10);
        textView.setTranslationY(dp);
        textView2.setTranslationY(dp);
    }

    @Override // org.telegram.ui.Components.ni
    public final void o() {
        if (this.H) {
            return;
        }
        this.H = true;
        R();
        org.telegram.ui.Wallet.u5 u5Var = this.N0;
        if (u5Var != null) {
            AnimatorSet animatorSet = u5Var.m;
            if (!u5Var.v) {
                if (animatorSet.isStarted()) {
                    animatorSet.cancel();
                } else {
                    u5Var.a(false);
                }
            }
            this.N0 = null;
        }
        org.telegram.ui.Wallet.w8 w8Var = this.O0;
        if (w8Var != null) {
            AnimatorSet animatorSet2 = w8Var.m;
            if (!w8Var.s) {
                if (animatorSet2.isStarted()) {
                    animatorSet2.cancel();
                } else {
                    w8Var.b();
                }
            }
            this.O0 = null;
        }
        ValueAnimator valueAnimator = this.c0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.c0 = null;
        }
        Activity activity = this.I;
        if (activity != null) {
            try {
                activity.setRequestedOrientation(this.J);
            } catch (Exception e) {
                FileLog.e(e);
            }
            this.I = null;
        }
        this.L.animate().cancel();
        this.N.animate().cancel();
        this.S.animate().cancel();
        this.l0.animate().cancel();
        this.T.animate().cancel();
        this.U.animate().cancel();
        bi.g gVar = this.L0;
        if (gVar != null) {
            removeCallbacks(gVar);
            this.L0 = null;
        }
        org.telegram.ui.ActionBar.a2 a2Var = this.Q0;
        if (a2Var != null) {
            a2Var.dismiss();
        }
        org.telegram.ui.Wallet.m mVar = this.f0;
        if (mVar != null) {
            mVar.run();
            this.f0 = null;
        }
        NotificationCenter.getInstance(this.n).removeObserver(this, NotificationCenter.walletUpdate);
        this.b.a1.n().removeView(this.w);
        AndroidUtilities.hideKeyboard(this.P);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (this.H0) {
            this.H0 = false;
            this.K.setTranslationY(0.0f);
            this.g0.setTranslationY(0.0f);
            this.v.setTranslationY(0.0f);
            b0();
        } else if (this.y0) {
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
        this.v.setAlpha(1.0f - f7);
    }

    @Override // android.view.View
    public void setTranslationY(float f7) {
        super.setTranslationY(f7);
        this.b.getSheetContainer().invalidate();
    }

    @Override // org.telegram.ui.Components.ni
    public final void u() {
        R();
        Activity activity = this.I;
        if (activity != null) {
            try {
                activity.setRequestedOrientation(this.J);
            } catch (Exception e) {
                FileLog.e(e);
            }
            this.I = null;
        }
        this.b.a1.setDrawGlassTitle(true);
        this.I0 = false;
        this.J0 = false;
        bi.g gVar = this.L0;
        if (gVar != null) {
            removeCallbacks(gVar);
            this.L0 = null;
        }
        org.telegram.ui.ActionBar.a2 a2Var = this.Q0;
        if (a2Var != null) {
            a2Var.dismiss();
        }
        this.w.setVisibility(8);
        EditTextBoldCursor editTextBoldCursor = this.P;
        AndroidUtilities.hideKeyboard(editTextBoldCursor);
        editTextBoldCursor.clearFocus();
    }

    @Override // org.telegram.ui.Components.ni
    public final void w(int i10) {
        if (i10 == 2) {
            org.telegram.ui.Wallet.z4.u0(getContext(), this.n, this.a);
        } else if (i10 == 3) {
            Z();
        }
    }

    @Override // org.telegram.ui.Components.ni
    public final void y() {
        if (this.y0) {
            this.y0 = false;
            float bottomYOnScreen = getBottomYOnScreen();
            FrameLayout frameLayout = this.g0;
            frameLayout.setTranslationY(this.G0 - (bottomYOnScreen - frameLayout.getTranslationY()));
            org.telegram.ui.Wallet.m7 m7Var = this.v;
            m7Var.setTranslationY(this.E0 - (W(m7Var) - m7Var.getTranslationY()));
            this.H0 = true;
            requestLayout();
        }
    }

    @Override // org.telegram.ui.Components.ni
    public final void z(int i10, boolean z10) {
        this.y0 = true;
        this.H0 = false;
        this.z0 = z10;
        this.x0 = z10 ? 0.0f : 1.0f;
        this.F0 = this.A0 ? this.B0 : getBottomYOnScreen();
        boolean z11 = this.A0;
        org.telegram.ui.Wallet.m7 m7Var = this.v;
        this.D0 = z11 ? this.C0 : W(m7Var);
        this.G0 = getBottomYOnScreen() - this.g0.getTranslationY();
        this.E0 = W(m7Var) - m7Var.getTranslationY();
        l0();
    }
}
