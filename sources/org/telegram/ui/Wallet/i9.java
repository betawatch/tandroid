package org.telegram.ui.Wallet;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Paint;
import android.graphics.drawable.GradientDrawable;
import android.text.InputFilter;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.RelativeSizeSpan;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import ei.kb;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.ca0;
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.w61;
import org.telegram.ui.Components.x61;
import org.telegram.ui.Components.x90;
import org.telegram.ui.Components.xc;
import org.telegram.ui.Components.yq;
import org.telegram.ui.fk0;
import org.telegram.ui.kk;
import org.telegram.ui.qn;
import org.telegram.ui.y21;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes4.dex */
public final class i9 extends x61 implements NotificationCenter.NotificationCenterDelegate {
    public EditTextBoldCursor E;
    public boolean F;
    public final Runnable G;
    public final ViewTreeObserver.OnWindowFocusChangeListener H;
    public SpannableString I;
    public SpannableString J;
    public org.telegram.ui.Components.q6 K;
    public TextView L;
    public TextView M;
    public x90 N;
    public TextView O;
    public SpannableString P;
    public kk Q;
    public SpannableString R;
    public boolean S;
    public boolean T;
    public float U;
    public ValueAnimator V;
    public LinearLayout W;
    public o1.k X;
    public float Y;
    public float Z;
    public ei.d a0;
    public long b0;
    public boolean c0;
    public TL_wallet.walletUserAddress d;
    public String d0;
    public TLRPC.User e;
    public boolean e0;
    public String f;
    public int f0;
    public int g0;
    public String h;
    public boolean h0;
    public boolean i0;
    public DecimalFormat j0;
    public DecimalFormat k0;
    public int l0;
    public boolean m0;
    public boolean n;
    public TL_wallet.walletTransaction n0;
    public o5 o0;
    public v9 p0;
    public qn q0;
    public long r;
    public e6 r0;
    public k8 s;
    public int s0;
    public ei.m5 v;
    public FrameLayout w;
    public LinearLayout x;
    public h9 y;

    public i9(TLRPC.User user) {
        this.r = 0L;
        this.G = new r8(this, 0);
        this.H = new ViewTreeObserver.OnWindowFocusChangeListener() { // from class: org.telegram.ui.Wallet.s8
            @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
            public final void onWindowFocusChanged(boolean z10) {
                EditTextBoldCursor editTextBoldCursor;
                i9 i9Var = i9.this;
                Runnable runnable = i9Var.G;
                if (z10 && i9Var.F && (editTextBoldCursor = i9Var.E) != null) {
                    editTextBoldCursor.removeCallbacks(runnable);
                    i9Var.E.post(runnable);
                }
            }
        };
        this.b0 = -1L;
        this.e0 = true;
        this.l0 = 6;
        this.e = user;
        this.f = null;
        this.n = true;
        m0.w(this.currentAccount).Y(user, new t8(this, 2));
    }

    public static void Y(i9 i9Var) {
        o5.E0(i9Var.getParentActivity(), i9Var.currentAccount, i9Var.getResourceProvider());
    }

    public static void Z(final i9 i9Var) {
        ei.d dVar = i9Var.a0;
        if (!dVar.W || dVar.N) {
            return;
        }
        final m0 w9 = m0.w(i9Var.currentAccount);
        long j02 = i9Var.j0();
        long u10 = w9.u();
        if (i9Var.n || !WalletEngine2.isValidRecipientAddress(i9Var.f) || j02 <= 0) {
            return;
        }
        long j10 = MessagesController.getInstance(i9Var.currentAccount).config.walletTransferMinNanos.get();
        if (j02 < j10) {
            String f02 = i9Var.h0 ? i9Var.f0(j10, i9Var.h0()) : k0(j10);
            i9Var.y.setAmountText(f02);
            i9Var.E.setSelection(f02.length());
            EditTextBoldCursor editTextBoldCursor = i9Var.E;
            int i10 = -i9Var.l0;
            i9Var.l0 = i10;
            AndroidUtilities.shakeViewSpring(editTextBoldCursor, i10);
            return;
        }
        if (j02 > u10) {
            BotWebViewVibrationEffect.APP_ERROR.vibrate();
            x90 x90Var = i9Var.N;
            int i11 = -i9Var.l0;
            i9Var.l0 = i11;
            AndroidUtilities.shakeViewSpring(x90Var, i11);
            return;
        }
        long j11 = i9Var.b0;
        if (j11 >= 0 && j02 + j11 > u10) {
            j02 -= j11;
        }
        i9Var.F = false;
        EditTextBoldCursor editTextBoldCursor2 = i9Var.E;
        if (editTextBoldCursor2 != null) {
            editTextBoldCursor2.removeCallbacks(i9Var.G);
            i9Var.fragmentView.requestFocus();
            AndroidUtilities.hideKeyboard(i9Var.E);
        }
        i9Var.a0.setLoading(true);
        i9Var.n0 = null;
        if (i9Var.e != null && TextUtils.isEmpty(i9Var.h)) {
            i9Var.m0 = true;
            w9.b0(i9Var.e, i9Var.f, j02, i9Var.d0, i9Var.e0 ? i9Var.l0() : null, null, null, new v8(i9Var, 0), new v8(i9Var, 1), null);
            return;
        }
        byte[] bArr = null;
        final String str = i9Var.d0;
        if (i9Var.e0) {
            bArr = i9Var.l0();
        }
        boolean z10 = bArr != null;
        if (!w9.D()) {
            final long j12 = j02;
            final boolean z11 = z10;
            w9.h(i9Var.f, j12, str, bArr, new Utilities.Callback2() { // from class: org.telegram.ui.Wallet.x8
                @Override // org.telegram.messenger.Utilities.Callback2
                public final void run(Object obj, Object obj2) {
                    TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                    String str2 = (String) obj2;
                    i9 i9Var2 = i9.this;
                    if (str2 != null) {
                        i9Var2.a0.setLoading(false);
                        xc.a0(i9Var2).e0(str2, false);
                        return;
                    }
                    wallettransaction.peer = m0.f(i9Var2.e, i9Var2.f, i9Var2.h);
                    wallettransaction.comment = str;
                    wallettransaction.comment_encrypted = z11;
                    wallettransaction.date = i9Var2.getConnectionsManager().getCurrentTime();
                    AndroidUtilities.hideKeyboard(i9Var2.E);
                    o5.B0(i9Var2.getParentActivity(), i9Var2.getCurrentAccount(), wallettransaction, new w8(i9Var2, w9, j12, 1), new t8(i9Var2, 4), i9Var2.l0(), null, i9Var2.getResourceProvider());
                    AndroidUtilities.runOnUIThread(new r8(i9Var2, 3), 1000L);
                }
            });
            return;
        }
        TL_wallet.walletTransaction wallettransaction = new TL_wallet.walletTransaction();
        wallettransaction.peer = m0.f(i9Var.e, i9Var.f, i9Var.h);
        wallettransaction.comment = str;
        wallettransaction.comment_encrypted = z10;
        wallettransaction.date = i9Var.getConnectionsManager().getCurrentTime();
        wallettransaction.fee = Math.max(0L, i9Var.b0);
        wallettransaction.gasless = true;
        wallettransaction.amount = j02;
        AndroidUtilities.hideKeyboard(i9Var.E);
        o5.B0(i9Var.getParentActivity(), i9Var.getCurrentAccount(), wallettransaction, new w8(i9Var, w9, j02, 0), new t8(i9Var, 3), i9Var.l0(), null, i9Var.getResourceProvider());
        AndroidUtilities.runOnUIThread(new r8(i9Var, 2), 1000L);
    }

    public static void a0(i9 i9Var, String str) {
        if ("PASSCODE_FAILED".equalsIgnoreCase(str)) {
            i9Var.m0 = false;
            i9Var.a0.setLoading(false);
            return;
        }
        if (str != null) {
            i9Var.m0 = false;
            i9Var.a0.setLoading(false);
            xc.a0(i9Var).e0(str, false);
            return;
        }
        if (!i9Var.c0) {
            i9Var.q0();
            return;
        }
        org.telegram.ui.ActionBar.d5 parentLayout = i9Var.getParentLayout();
        if (parentLayout == null) {
            i9Var.finishFragment();
            return;
        }
        long j10 = i9Var.e.id;
        ArrayList arrayList = new ArrayList(parentLayout.getFragmentStack());
        if (arrayList.isEmpty() || i2.e.h(1, arrayList) != i9Var) {
            return;
        }
        int size = arrayList.size() - 2;
        while (true) {
            if (size < 0) {
                break;
            }
            org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) arrayList.get(size);
            if ((n2Var instanceof qn) && n2Var.getCurrentAccount() == i9Var.currentAccount) {
                qn qnVar = (qn) n2Var;
                if (qnVar.a() == j10 && qnVar.R3 == 0) {
                    i9Var.q0 = qnVar;
                    for (int size2 = arrayList.size() - 2; size2 > size; size2--) {
                        ((ActionBarLayout) parentLayout).a0((org.telegram.ui.ActionBar.n2) arrayList.get(size2), false);
                    }
                }
            }
            size--;
        }
        if (i9Var.q0 == null) {
            i9Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeProfileActivity, Long.valueOf(j10), Boolean.FALSE);
            qn W9 = qn.W9(j10);
            W9.setCurrentAccount(i9Var.currentAccount);
            if (!((ActionBarLayout) parentLayout).c(parentLayout.getFragmentStack().size() - 1, W9)) {
                i9Var.finishFragment();
                return;
            }
            i9Var.q0 = W9;
        }
        i9Var.finishFragment();
    }

    public static void b0(i9 i9Var, TL_wallet.walletUserAddress walletuseraddress) {
        i9Var.n = false;
        i9Var.d = walletuseraddress;
        if (walletuseraddress != null && walletuseraddress.user_id != 0) {
            i9Var.e = MessagesController.getInstance(i9Var.currentAccount).getUser(Long.valueOf(walletuseraddress.user_id));
        }
        w61 w61Var = i9Var.a;
        if (w61Var != null) {
            w61Var.W2.N(true);
        }
        i9Var.w0();
        k8 k8Var = i9Var.s;
        if (k8Var != null) {
            k8Var.a(i9Var.f, i9Var.e);
        }
    }

    public static int g0(BigDecimal bigDecimal) {
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

    public static String k0(long j10) {
        BigDecimal scale = BigDecimal.valueOf(j10).movePointLeft(9).setScale(2, RoundingMode.HALF_UP);
        return (scale.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : scale.stripTrailingZeros()).toPlainString();
    }

    public static BigDecimal p0(String str) {
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

    public static void t0(SpannableStringBuilder spannableStringBuilder, int i10, int i11, char c10) {
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

    public final void A0() {
        float f7 = this.Y;
        float f10 = 1.0f - f7;
        float max = Math.max(this.Z, Math.max(0.0f, Math.min(1.0f, f7)));
        this.Z = max;
        float f11 = 1.0f - max;
        h9 h9Var = this.y;
        float f12 = this.Y;
        h9Var.e(f12, max, this.X == null && f12 == 1.0f);
        this.y.setTranslationY((((this.v.getHeight() / 2.0f) - this.y.getTop()) - (this.y.getHeight() / 2.0f)) * f10);
        this.K.setAlpha(this.Z);
        this.K.setTranslationY(AndroidUtilities.dp(16.0f) * f11);
        this.w.setAlpha(this.Z);
        this.w.setTranslationY(AndroidUtilities.dp(16.0f) * f11);
        this.W.setAlpha(this.Z);
        for (int i10 = 0; i10 < this.W.getChildCount(); i10++) {
            this.W.getChildAt(i10).setTranslationY(AndroidUtilities.dp(24.0f) * f11);
        }
    }

    @Override // org.telegram.ui.Components.x61
    public final CharSequence V() {
        return LocaleController.getString(R.string.WalletSendMoneyTo);
    }

    @Override // org.telegram.ui.Components.x61
    public final boolean X(h61 h61Var, View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.x61, org.telegram.ui.ActionBar.n2
    public final View createView(Context context) {
        View createView = super.createView(context);
        this.fragmentView = createView;
        final int i10 = 1;
        createView.setFocusableInTouchMode(true);
        this.a.setVisibility(8);
        View view = this.fragmentView;
        int i11 = org.telegram.ui.ActionBar.h6.d6;
        view.setBackgroundColor(getThemedColor(i11));
        this.actionBar.setBackgroundColor(getThemedColor(i11));
        final int i12 = 0;
        this.actionBar.setCastShadows(false);
        org.telegram.ui.ActionBar.u0 a2 = this.actionBar.n().a(1, R.drawable.ic_ab_other);
        a2.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        final int i13 = 2;
        a2.e(2, R.drawable.msg_addbot, LocaleController.getString(R.string.WalletDepositFunds));
        a2.e(3, R.drawable.menu_comments, LocaleController.getString(R.string.WalletAddComment));
        this.actionBar.setActionBarMenuOnItemClick(new y21(this, 13));
        FrameLayout frameLayout = (FrameLayout) this.fragmentView;
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        k8 k8Var = new k8(context, new r8(this, 5), new r8(this, 6), this.resourceProvider);
        this.s = k8Var;
        frameLayout.addView(k8Var, w7.z5.d(-2, 64.0f, 49, 16.0f, 5.0f, 16.0f, 0.0f));
        k8 k8Var2 = this.s;
        if (k8Var2 != null) {
            k8Var2.a(this.f, this.e);
        }
        ei.m5 m5Var = new ei.m5(this, context);
        this.v = m5Var;
        m5Var.setOrientation(1);
        this.v.setClipChildren(false);
        this.v.setClipToPadding(false);
        frameLayout.addView(this.v, w7.z5.e(-1, -2, 17));
        h9 h9Var = new h9(context, getResourceProvider());
        this.y = h9Var;
        if (h9Var.getDiamondView().f == null) {
            this.Z = 1.0f;
            this.Y = 1.0f;
        }
        this.v.addView(this.y, w7.z5.t(-1, 64, 49, 16, 0, 16, 0));
        EditTextBoldCursor editText = this.y.getEditText();
        this.E = editText;
        editText.setFilters(new InputFilter[]{new InputFilter() { // from class: org.telegram.ui.Wallet.a9
            @Override // android.text.InputFilter
            public final CharSequence filter(CharSequence charSequence, int i14, int i15, Spanned spanned, int i16, int i17) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(spanned.subSequence(0, i16).toString());
                sb2.append((Object) charSequence.subSequence(i14, i15));
                sb2.append((Object) spanned.subSequence(i17, spanned.length()));
                String sb3 = sb2.toString();
                int i18 = 9;
                BigDecimal valueOf = BigDecimal.valueOf(Long.MAX_VALUE, 9);
                i9 i9Var = i9.this;
                if (i9Var.h0) {
                    BigDecimal h02 = i9Var.h0();
                    valueOf = valueOf.multiply(h02);
                    i18 = i9.g0(h02);
                }
                int max = Math.max(sb3.indexOf(46), sb3.indexOf(44));
                if (max >= 0 && (sb3.length() - max) - 1 > i18) {
                    return spanned.subSequence(i16, i17);
                }
                if (i9.p0(sb3).compareTo(valueOf) > 0) {
                    return spanned.subSequence(i16, i17);
                }
                if (i14 == i15) {
                    return null;
                }
                boolean z10 = false;
                for (int i19 = 0; i19 < sb3.length(); i19++) {
                    char charAt = sb3.charAt(i19);
                    if (charAt == '.' || charAt == ',') {
                        if (z10) {
                            return spanned.subSequence(i16, i17);
                        }
                        z10 = true;
                    }
                }
                if (i16 == 0 && (sb3.startsWith(".") || sb3.startsWith(","))) {
                    return "0" + ((Object) charSequence.subSequence(i14, i15));
                }
                if (sb3.startsWith("00")) {
                    return spanned.subSequence(i16, i17);
                }
                return null;
            }
        }});
        this.E.setImeOptions(33554438);
        this.E.setOnEditorActionListener(new l8(this, i10));
        this.E.addTextChangedListener(new ai.u(this, 16));
        long j10 = this.r;
        if (j10 > 0) {
            h9 h9Var2 = this.y;
            BigDecimal valueOf = BigDecimal.valueOf(j10, 9);
            h9Var2.setAmountText((valueOf.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : valueOf.stripTrailingZeros()).toPlainString());
            EditTextBoldCursor editTextBoldCursor = this.E;
            editTextBoldCursor.setSelection(editTextBoldCursor.length());
        }
        this.I = new SpannableString("⇅");
        yq yqVar = new yq(R.drawable.wallet_currency_exchange, 0);
        yqVar.setAlpha(0.72f);
        SpannableString spannableString = this.I;
        spannableString.setSpan(yqVar, 0, spannableString.length(), 33);
        this.J = new SpannableString("G");
        yq yqVar2 = new yq(R.drawable.wallet_gram_small, 0);
        yqVar2.recolorDrawable = false;
        SpannableString spannableString2 = this.J;
        spannableString2.setSpan(yqVar2, 0, spannableString2.length(), 33);
        org.telegram.ui.Components.q6 q6Var = new org.telegram.ui.Components.q6(context, false, true, true, true, true);
        this.K = q6Var;
        q6Var.c.m(0.35f, 320L, 3.5f, bs.h);
        this.K.setScaleProperty(0.25f);
        this.K.setText(i0(m0.w(this.currentAccount), 0L));
        org.telegram.ui.Components.q6 q6Var2 = this.K;
        int themedColor = getThemedColor(i11);
        int i14 = org.telegram.ui.ActionBar.h6.z6;
        q6Var2.setTextColor(org.telegram.ui.ActionBar.h6.v(themedColor, getThemedColor(i14)));
        this.K.setTextSize(AndroidUtilities.dp(14.0f));
        this.K.setTypeface(AndroidUtilities.getTypeface("fonts/gram.ttf"));
        this.K.setGravity(17);
        this.K.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
        this.K.setAllowCancel(true);
        this.K.setSizeableBackground(org.telegram.ui.ActionBar.h6.c0(AndroidUtilities.dp(14.0f), org.telegram.ui.ActionBar.h6.m1(0.08f, getThemedColor(i14))));
        this.v.addView(this.K, w7.z5.t(-2, 28, 49, 0, 8, 0, 0));
        w7.b6.a(this.K);
        this.K.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Wallet.q8
            public final /* synthetic */ i9 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i13) {
                    case 0:
                        this.b.o0();
                        break;
                    case 1:
                        i9.Z(this.b);
                        break;
                    case 2:
                        i9 i9Var = this.b;
                        BigDecimal h02 = i9Var.h0();
                        if (i9Var.h0 || h02.signum() > 0) {
                            long j02 = i9Var.j0();
                            i9Var.h0 = !i9Var.h0;
                            i9Var.z0();
                            String f02 = j02 <= 0 ? "" : i9Var.h0 ? i9Var.f0(j02, h02) : i9.k0(j02);
                            i9Var.y.setAmountText(f02);
                            i9Var.E.setSelection(f02.length());
                            break;
                        }
                        break;
                    default:
                        i9.Y(this.b);
                        break;
                }
            }
        });
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.w = frameLayout2;
        this.v.addView(frameLayout2, w7.z5.q(-2, -2, 49));
        LinearLayout linearLayout = new LinearLayout(context);
        this.x = linearLayout;
        linearLayout.setOrientation(1);
        this.w.addView(this.x, w7.z5.e(-2, -2, 49));
        TextView textView = new TextView(context);
        this.L = textView;
        textView.setTextSize(1, 14.0f);
        TextView textView2 = this.L;
        int i15 = org.telegram.ui.ActionBar.h6.Oh;
        textView2.setTextColor(getThemedColor(i15));
        this.L.setBackground(org.telegram.ui.ActionBar.h6.a0(org.telegram.ui.ActionBar.h6.m1(0.1f, getThemedColor(i15)), org.telegram.ui.ActionBar.h6.m1(0.25f, getThemedColor(i15)), 14, 14));
        this.L.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
        this.L.setGravity(17);
        this.L.setTypeface(AndroidUtilities.bold());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.WalletDepositFunds));
        spannableStringBuilder.append((CharSequence) " >");
        spannableStringBuilder.setSpan(new yq(R.drawable.settings_arrow, 0).translate(0.0f, AndroidUtilities.dpf2(0.66f)), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        this.L.setText(spannableStringBuilder);
        this.w.addView(this.L, w7.z5.d(-2, 28.0f, 49, 0.0f, 8.0f, 0.0f, 0.0f));
        w7.b6.a(this.L);
        final int i16 = 3;
        this.L.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Wallet.q8
            public final /* synthetic */ i9 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i16) {
                    case 0:
                        this.b.o0();
                        break;
                    case 1:
                        i9.Z(this.b);
                        break;
                    case 2:
                        i9 i9Var = this.b;
                        BigDecimal h02 = i9Var.h0();
                        if (i9Var.h0 || h02.signum() > 0) {
                            long j02 = i9Var.j0();
                            i9Var.h0 = !i9Var.h0;
                            i9Var.z0();
                            String f02 = j02 <= 0 ? "" : i9Var.h0 ? i9Var.f0(j02, h02) : i9.k0(j02);
                            i9Var.y.setAmountText(f02);
                            i9Var.E.setSelection(f02.length());
                            break;
                        }
                        break;
                    default:
                        i9.Y(this.b);
                        break;
                }
            }
        });
        this.x.setVisibility(4);
        this.x.setAlpha(0.0f);
        this.x.setScaleX(0.8f);
        this.x.setScaleY(0.8f);
        this.L.setVisibility(0);
        this.L.setAlpha(1.0f);
        this.L.setScaleX(1.0f);
        this.L.setScaleY(1.0f);
        this.i0 = false;
        this.M = new TextView(context);
        org.telegram.ui.ActionBar.f5 f5Var = new org.telegram.ui.ActionBar.f5(0, true, false, null);
        f5Var.x = false;
        Paint.Style style = Paint.Style.STROKE;
        Paint paint = f5Var.c;
        paint.setStyle(style);
        paint.setStrokeWidth(Math.max(1.0f, AndroidUtilities.dpf2(0.5f)));
        int i17 = org.telegram.ui.ActionBar.h6.kl;
        paint.setColor(getThemedColor(i17));
        f5Var.w = Integer.valueOf(getThemedColor(i17));
        this.M.setPadding(AndroidUtilities.dp(15.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(19.0f), AndroidUtilities.dp(8.0f));
        this.M.setBackground(f5Var);
        this.M.setTextSize(1, 14.0f);
        this.M.setTextColor(getThemedColor(i14));
        this.M.setTypeface(AndroidUtilities.bold());
        this.M.setEllipsize(TextUtils.TruncateAt.END);
        this.M.setMaxLines(4);
        if (TextUtils.isEmpty(this.d0)) {
            this.M.setVisibility(8);
        } else {
            this.M.setText(this.d0);
            this.M.setVisibility(0);
        }
        this.x.addView(this.M, w7.z5.t(-2, -2, 49, 32, 12, 32, 0));
        this.M.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Wallet.q8
            public final /* synthetic */ i9 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i12) {
                    case 0:
                        this.b.o0();
                        break;
                    case 1:
                        i9.Z(this.b);
                        break;
                    case 2:
                        i9 i9Var = this.b;
                        BigDecimal h02 = i9Var.h0();
                        if (i9Var.h0 || h02.signum() > 0) {
                            long j02 = i9Var.j0();
                            i9Var.h0 = !i9Var.h0;
                            i9Var.z0();
                            String f02 = j02 <= 0 ? "" : i9Var.h0 ? i9Var.f0(j02, h02) : i9.k0(j02);
                            i9Var.y.setAmountText(f02);
                            i9Var.E.setSelection(f02.length());
                            break;
                        }
                        break;
                    default:
                        i9.Y(this.b);
                        break;
                }
            }
        });
        w7.b6.b(this.M, 0.02f, 1.2f);
        y0();
        x90 x90Var = new x90(context, this.resourceProvider);
        this.N = x90Var;
        x90Var.setTextColor(getThemedColor(org.telegram.ui.ActionBar.h6.q7));
        this.N.setLinkTextColor(getThemedColor(i15));
        this.N.setTextSize(1, 14.0f);
        this.N.setGravity(17);
        this.N.setTypeface(AndroidUtilities.bold());
        this.N.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
        v0(false);
        this.x.addView(this.N, w7.z5.t(-2, -2, 49, 0, 10, 0, 0));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.W = linearLayout2;
        linearLayout2.setOrientation(1);
        this.W.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(12.0f));
        this.W.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{org.telegram.ui.ActionBar.h6.m1(0.0f, getThemedColor(i11)), getThemedColor(i11), getThemedColor(i11)}));
        TextView textView3 = new TextView(context);
        this.O = textView3;
        textView3.setTextColor(getThemedColor(i14));
        this.O.setTextSize(1, 14.0f);
        this.O.setGravity(17);
        this.W.addView(this.O, w7.z5.t(-1, -2, 55, 16, 0, 16, 0));
        this.P = new SpannableString(">");
        yq yqVar3 = new yq(R.drawable.settings_arrow, 0);
        yqVar3.translate(0.0f, AndroidUtilities.dp(1.0f));
        SpannableString spannableString3 = this.P;
        spannableString3.setSpan(yqVar3, 0, spannableString3.length(), 33);
        kk kkVar = new kk(this, context, 7);
        this.Q = kkVar;
        kkVar.setTextColor(getThemedColor(i14));
        this.Q.setTextSize(1, 14.0f);
        this.Q.setGravity(17);
        this.Q.setPadding(0, AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f));
        this.Q.setVisibility(8);
        this.W.addView(this.Q, w7.z5.t(-1, -2, 55, 16, 0, 16, 0));
        SpannableString spannableString4 = new SpannableString(LocaleController.getString(R.string.Loading));
        this.R = spannableString4;
        spannableString4.setSpan(new ca0(AndroidUtilities.dp(80.0f), this.Q), 0, this.R.length(), 33);
        ei.d dVar = new ei.d(context, getResourceProvider(), true);
        dVar.setRoundRadius(24);
        this.a0 = dVar;
        dVar.setText(LocaleController.getString(R.string.WalletSendGrams));
        this.a0.setEnabled(false);
        this.a0.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Wallet.q8
            public final /* synthetic */ i9 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i10) {
                    case 0:
                        this.b.o0();
                        break;
                    case 1:
                        i9.Z(this.b);
                        break;
                    case 2:
                        i9 i9Var = this.b;
                        BigDecimal h02 = i9Var.h0();
                        if (i9Var.h0 || h02.signum() > 0) {
                            long j02 = i9Var.j0();
                            i9Var.h0 = !i9Var.h0;
                            i9Var.z0();
                            String f02 = j02 <= 0 ? "" : i9Var.h0 ? i9Var.f0(j02, h02) : i9.k0(j02);
                            i9Var.y.setAmountText(f02);
                            i9Var.E.setSelection(f02.length());
                            break;
                        }
                        break;
                    default:
                        i9.Y(this.b);
                        break;
                }
            }
        });
        this.W.addView(this.a0, w7.z5.t(-1, 48, 87, 0, 14, 0, 0));
        frameLayout.addView(this.W, w7.z5.e(-1, -2, 87));
        w0();
        A0();
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.walletUpdate) {
            x0();
            w0();
        }
    }

    public final void e0() {
        h9 h9Var = this.y;
        if (h9Var != null) {
            h9Var.getDiamondView().l(null);
        }
        o1.k kVar = this.X;
        if (kVar != null) {
            kVar.c();
        }
        this.Y = 1.0f;
        if (this.y != null) {
            A0();
        }
    }

    public final String f0(long j10, BigDecimal bigDecimal) {
        BigDecimal movePointLeft = BigDecimal.valueOf(j10).multiply(bigDecimal).movePointLeft(9);
        TL_wallet.currencyRate m0 = m0();
        int max = Math.max(0, Math.min(m0 != null ? m0.exp : TextUtils.equals(m0.w(this.currentAccount).h.g(), "USD") ? 2 : 0, 20));
        RoundingMode roundingMode = RoundingMode.HALF_UP;
        BigDecimal scale = movePointLeft.setScale(max, roundingMode);
        if (scale.signum() == 0 && movePointLeft.signum() != 0) {
            scale = movePointLeft.setScale(Math.min(20, Math.max(max, movePointLeft.scale())), roundingMode);
        }
        int g02 = g0(bigDecimal);
        if (scale.scale() > g02) {
            scale = scale.setScale(g02, RoundingMode.DOWN);
        }
        BigDecimal multiply = BigDecimal.valueOf(Long.MAX_VALUE, 9).multiply(bigDecimal);
        if (scale.compareTo(multiply) > 0) {
            scale = multiply.setScale(scale.scale(), RoundingMode.DOWN);
        }
        return (scale.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : scale.stripTrailingZeros()).toPlainString();
    }

    public final BigDecimal h0() {
        f fVar = m0.w(this.currentAccount).h;
        fVar.f();
        double h = fVar.h();
        double d = MessagesController.getInstance(this.currentAccount).config.tonUsdRate.get();
        return (h <= 0.0d || d <= 0.0d || Double.isNaN(h) || Double.isInfinite(h) || Double.isNaN(d) || Double.isInfinite(d)) ? BigDecimal.ZERO : BigDecimal.valueOf(h).multiply(BigDecimal.valueOf(d));
    }

    public final SpannableStringBuilder i0(m0 m0Var, long j10) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("≈ ");
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append(m0Var.l(j10, false));
        int length2 = spannableStringBuilder.length();
        TL_wallet.currencyRate m0 = m0();
        t0(spannableStringBuilder, length, length2, (m0 == null || TextUtils.isEmpty(m0.decimalSeparator)) ? '.' : m0.decimalSeparator.charAt(0));
        return spannableStringBuilder.append((CharSequence) " ").append((CharSequence) this.I);
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final long j0() {
        EditTextBoldCursor editTextBoldCursor = this.E;
        if (editTextBoldCursor == null) {
            return 0L;
        }
        BigDecimal p02 = p0(editTextBoldCursor.getText().toString());
        if (this.h0) {
            BigDecimal h02 = h0();
            if (h02.signum() <= 0) {
                return 0L;
            }
            p02 = p02.divide(h02, 9, RoundingMode.DOWN).setScale(2, RoundingMode.HALF_UP);
        }
        BigInteger bigInteger = p02.movePointRight(9).toBigInteger();
        if (bigInteger.compareTo(BigInteger.valueOf(Long.MAX_VALUE)) > 0) {
            return Long.MAX_VALUE;
        }
        return bigInteger.longValue();
    }

    public final byte[] l0() {
        TL_wallet.walletUserAddress walletuseraddress = this.d;
        if (walletuseraddress == null || walletuseraddress.public_key == null) {
            return null;
        }
        int i10 = 0;
        while (true) {
            byte[] bArr = this.d.public_key;
            if (i10 >= bArr.length) {
                return null;
            }
            if (bArr[i10] != 0) {
                return bArr;
            }
            i10++;
        }
    }

    public final TL_wallet.currencyRate m0() {
        f fVar = m0.w(this.currentAccount).h;
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

    public final void n0() {
        if (WalletEngine2.isValidRecipientAddress(this.f)) {
            this.b0 = -1L;
            x0();
            m0 w9 = m0.w(this.currentAccount);
            if (!w9.D() || m0.a(w9.s(), this.f) || this.e == null || !TextUtils.isEmpty(this.h)) {
                w9.h(this.f, 0L, this.d0, this.e0 ? l0() : null, new t8(this, 1));
            }
        }
    }

    public final void o0() {
        Activity parentActivity = getParentActivity();
        if (parentActivity == null) {
            return;
        }
        boolean z10 = this.g0 - this.f0 > AndroidUtilities.dp(20.0f);
        AlertDialog$Builder e2Var = z10 ? new org.telegram.ui.ActionBar.e2(parentActivity, 0, getResourceProvider()) : new AlertDialog$Builder(parentActivity, 0, getResourceProvider());
        String string = LocaleController.getString(R.string.WalletAddComment);
        org.telegram.ui.ActionBar.b2 b2Var = e2Var.a;
        b2Var.R = string;
        final ig.a1 a1Var = new ig.a1(this, parentActivity);
        a1Var.setTextSize(1, 18.0f);
        a1Var.setTextColor(getThemedColor(org.telegram.ui.ActionBar.h6.j5));
        a1Var.setHintTextColor(getThemedColor(org.telegram.ui.ActionBar.h6.t5));
        a1Var.setHint(LocaleController.getString(R.string.WalletCommentOptionalMessage));
        a1Var.setText(this.d0);
        a1Var.setSelection(a1Var.length());
        a1Var.setInputType(147457);
        a1Var.setMaxLines(5);
        a1Var.setImeOptions(6);
        a1Var.setLineColors(getThemedColor(org.telegram.ui.ActionBar.h6.k6), getThemedColor(org.telegram.ui.ActionBar.h6.l6), getThemedColor(org.telegram.ui.ActionBar.h6.p7));
        a1Var.setBackground(null);
        a1Var.setPadding(0, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(48.0f), AndroidUtilities.dp(10.0f));
        org.telegram.ui.Cells.a2 a2Var = new org.telegram.ui.Cells.a2(parentActivity, 1, getResourceProvider());
        a2Var.setBackground(org.telegram.ui.ActionBar.h6.g0(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.i6, this.resourceProvider), 7, AndroidUtilities.dp(12.0f)));
        a2Var.e(LocaleController.getString(R.string.WalletMakeCommentPublic), "", !this.e0 || l0() == null, false, false);
        a2Var.setMultiline(true);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) a2Var.getCheckBoxView().getLayoutParams();
        layoutParams.topMargin = 0;
        layoutParams.gravity = (LocaleController.isRTL ? 5 : 3) | 16;
        a2Var.getCheckBoxView().setLayoutParams(layoutParams);
        a2Var.setPadding(LocaleController.isRTL ? AndroidUtilities.dp(4.0f) : 0, AndroidUtilities.dp(12.0f), LocaleController.isRTL ? 0 : AndroidUtilities.dp(4.0f), AndroidUtilities.dp(12.0f));
        a2Var.setEnabled(l0() != null);
        a2Var.setOnClickListener(new t2(a2Var, 6));
        LinearLayout linearLayout = new LinearLayout(parentActivity);
        linearLayout.setOrientation(1);
        linearLayout.addView(a1Var, w7.z5.k(24.0f, 4.0f, 24.0f, 4.0f, -1, -2));
        linearLayout.addView(a2Var, w7.z5.t(-1, -2, 83, 8, 0, 8, 0));
        b2Var.G = 6;
        e2Var.n(linearLayout);
        b2Var.a = AndroidUtilities.dp(292.0f);
        e2Var.h(LocaleController.getString(R.string.Cancel), new fk0(15));
        e2Var.k(LocaleController.getString(R.string.Add), new b8(this, a1Var, a2Var, 2));
        b2Var.setOnShowListener(new DialogInterface.OnShowListener() { // from class: org.telegram.ui.Wallet.u8
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                ig.a1 a1Var2 = ig.a1.this;
                a1Var2.requestFocus();
                AndroidUtilities.showKeyboard(a1Var2);
            }
        });
        b2Var.setOnDismissListener(new i4(this, 1));
        if (z10) {
            b2Var.r(250L);
        } else {
            b2Var.show();
        }
        b2Var.h0 = false;
        View d = b2Var.d(-1);
        if (!(d instanceof TextView) || TextUtils.isEmpty(this.d0)) {
            return;
        }
        a1Var.addTextChangedListener(new b9(a1Var, (TextView) d));
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final AnimatorSet onCustomTransitionAnimation(boolean z10, Runnable runnable) {
        View view;
        TL_wallet.walletTransaction wallettransaction;
        h9 h9Var;
        View view2;
        if (!z10 && this.q0 != null && (wallettransaction = this.n0) != null && wallettransaction.localMessageId != 0 && (h9Var = this.y) != null) {
            m6 diamondView = h9Var.getDiamondView();
            if (diamondView.f != null && diamondView.isShown() && diamondView.getAlpha() > 0.01f && (view2 = this.fragmentView) != null && (view2.getParent() instanceof View) && getParentLayout() != null) {
                e6 e6Var = new e6(getParentLayout().getView(), (View) this.fragmentView.getParent(), this.y.getDiamondView(), this.q0, this.n0, runnable, null);
                this.r0 = e6Var;
                return e6Var.m;
            }
        }
        if (z10 || this.o0 == null || this.n0 == null || this.y == null || (view = this.fragmentView) == null || !(view.getParent() instanceof View) || getParentLayout() == null) {
            return super.onCustomTransitionAnimation(z10, runnable);
        }
        v9 v9Var = new v9(getParentLayout().getView(), (View) this.fragmentView.getParent(), this.y.getDiamondView(), this.o0, this.n0, runnable, null);
        this.p0 = v9Var;
        return v9Var.m;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean onFragmentCreate() {
        getNotificationCenter().addObserver(this, NotificationCenter.walletUpdate);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onFragmentDestroy() {
        this.F = false;
        e0();
        e6 e6Var = this.r0;
        if (e6Var != null) {
            AnimatorSet animatorSet = e6Var.m;
            if (!e6Var.v) {
                if (animatorSet.isStarted()) {
                    animatorSet.cancel();
                } else {
                    e6Var.a(false);
                }
            }
            this.r0 = null;
        }
        v9 v9Var = this.p0;
        if (v9Var != null) {
            AnimatorSet animatorSet2 = v9Var.m;
            if (!v9Var.s) {
                if (animatorSet2.isStarted()) {
                    animatorSet2.cancel();
                } else {
                    v9Var.b();
                }
            }
            this.p0 = null;
        }
        ValueAnimator valueAnimator = this.V;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.V = null;
        }
        EditTextBoldCursor editTextBoldCursor = this.E;
        if (editTextBoldCursor != null) {
            editTextBoldCursor.removeCallbacks(this.G);
        }
        getNotificationCenter().removeObserver(this, NotificationCenter.walletUpdate);
        super.onFragmentDestroy();
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.f0 = i13;
        if (this.W == null) {
            return;
        }
        int max = Math.max(0, this.g0 - i13);
        this.W.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(12.0f) + this.f0);
        if (this.s0 != max) {
            this.W.animate().cancel();
            this.W.animate().translationY(-max).setDuration(320L).setInterpolator(bs.h).start();
            this.s0 = max;
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final r0.k1 onInsetsInternal(View view, r0.k1 k1Var) {
        this.g0 = k1Var.a.f(8).d;
        return super.onInsetsInternal(view, k1Var);
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onPause() {
        e0();
        this.F = false;
        EditTextBoldCursor editTextBoldCursor = this.E;
        if (editTextBoldCursor != null) {
            editTextBoldCursor.removeCallbacks(this.G);
            this.fragmentView.requestFocus();
            AndroidUtilities.hideKeyboard(this.E);
        }
        super.onPause();
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onResume() {
        super.onResume();
        n0();
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        EditTextBoldCursor editTextBoldCursor;
        super.onTransitionAnimationEnd(z10, z11);
        if (!z10 || z11 || !this.F || (editTextBoldCursor = this.E) == null) {
            return;
        }
        Runnable runnable = this.G;
        editTextBoldCursor.removeCallbacks(runnable);
        this.E.post(runnable);
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onTransitionAnimationStart(boolean z10, boolean z11) {
        EditTextBoldCursor editTextBoldCursor;
        h9 h9Var;
        super.onTransitionAnimationStart(z10, z11);
        if (z10 && !z11 && (h9Var = this.y) != null && this.Y < 1.0f) {
            h9Var.getDiamondView().l(new r8(this, 1));
        }
        if (!z10 || z11 || (editTextBoldCursor = this.E) == null) {
            return;
        }
        Runnable runnable = this.G;
        editTextBoldCursor.removeCallbacks(runnable);
        if (this.r > 0) {
            EditTextBoldCursor editTextBoldCursor2 = this.E;
            editTextBoldCursor2.setSelection(editTextBoldCursor2.length());
        } else {
            this.F = true;
            this.E.requestFocus();
            this.E.post(runnable);
        }
    }

    public final void q0() {
        org.telegram.ui.ActionBar.d5 parentLayout = getParentLayout();
        if (parentLayout == null) {
            finishFragment();
            return;
        }
        ArrayList arrayList = new ArrayList(parentLayout.getFragmentStack());
        if (arrayList.isEmpty() || i2.e.h(1, arrayList) != this) {
            return;
        }
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) obj;
            if (n2Var instanceof r9) {
                ((ActionBarLayout) parentLayout).a0(n2Var, false);
            }
        }
        List fragmentStack = parentLayout.getFragmentStack();
        if (fragmentStack.size() >= 2 && (r4.c.f(2, fragmentStack) instanceof o5) && ((org.telegram.ui.ActionBar.n2) r4.c.f(2, fragmentStack)).getCurrentAccount() == this.currentAccount) {
            this.o0 = (o5) r4.c.f(2, fragmentStack);
        } else {
            o5 o5Var = new o5();
            o5Var.setCurrentAccount(this.currentAccount);
            if (((ActionBarLayout) parentLayout).c(fragmentStack.size() - 1, o5Var)) {
                this.o0 = o5Var;
            }
        }
        finishFragment();
    }

    public final void r0() {
        this.c0 = true;
    }

    public final void s0(float f7) {
        this.U = f7;
        this.Q.setAlpha(f7);
        this.Q.setVisibility(f7 > 0.0f ? 0 : 8);
        ((LinearLayout.LayoutParams) this.Q.getLayoutParams()).topMargin = Math.round(AndroidUtilities.dp(4.0f) * f7);
        this.Q.requestLayout();
    }

    public final void u0(String str) {
        this.h = str;
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar != null) {
            kVar.setTitle(LocaleController.getString(R.string.WalletSendMoneyTo));
        }
    }

    public final void v0(boolean z10) {
        if (z10) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.WalletInsufficientFunds));
            spannableStringBuilder.append((CharSequence) " ");
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.WalletDepositFunds));
            spannableStringBuilder.append((CharSequence) " >");
            spannableStringBuilder.setSpan(new yq(R.drawable.settings_arrow, 0).setOverrideColor(getThemedColor(org.telegram.ui.ActionBar.h6.Oh)).translate(0.0f, AndroidUtilities.dpf2(0.66f)), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
            spannableStringBuilder.setSpan(new kb(this, 9), length, spannableStringBuilder.length(), 33);
            this.N.setText(spannableStringBuilder);
        }
        this.N.animate().alpha(z10 ? 1.0f : 0.0f).scaleX(z10 ? 1.0f : 0.6f).scaleY(z10 ? 1.0f : 0.6f).setDuration(320L).setInterpolator(bs.h).start();
    }

    public final void w0() {
        y0();
        if (this.E == null || this.a0 == null) {
            return;
        }
        m0 w9 = m0.w(this.currentAccount);
        long u10 = w9.u();
        long j02 = j0();
        long j10 = MessagesController.getInstance(this.currentAccount).config.walletTransferMinNanos.get();
        if (j02 > 0 && j02 < j10) {
            String f02 = this.h0 ? f0(j10, h0()) : k0(j10);
            this.y.setAmountText(f02);
            this.E.setSelection(f02.length());
            EditTextBoldCursor editTextBoldCursor = this.E;
            int i10 = -this.l0;
            this.l0 = i10;
            AndroidUtilities.shakeViewSpring(editTextBoldCursor, i10);
            return;
        }
        boolean z10 = WalletEngine2.isValidRecipientAddress(this.f) && !this.n && j02 > 0 && j02 <= u10;
        v0(!TextUtils.isEmpty(this.E.getText()) && j02 > u10);
        long j03 = j0();
        if (this.j0 == null) {
            this.j0 = new DecimalFormat("#,##0.#########", new DecimalFormatSymbols(Locale.US));
        }
        String format = j03 > 0 ? this.j0.format(BigDecimal.valueOf(j03, 9)) : "";
        this.a0.setLoading(this.n || this.m0);
        this.a0.g(TextUtils.isEmpty(format) ? LocaleController.getString(R.string.WalletSendGrams) : LocaleController.formatSpannable(R.string.WalletSendAmount, m0.k("Grams", format, R.string.Grams_other)), true, true);
        this.a0.setEnabled(z10);
        x0();
        z0();
        if (!this.h0) {
            this.K.setText(i0(w9, j02));
            return;
        }
        org.telegram.ui.Components.q6 q6Var = this.K;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) this.J).append((CharSequence) " ");
        int length = spannableStringBuilder.length();
        if (this.k0 == null) {
            DecimalFormat decimalFormat = new DecimalFormat("#,##0.##", new DecimalFormatSymbols(Locale.US));
            this.k0 = decimalFormat;
            decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
        }
        spannableStringBuilder.append((CharSequence) this.k0.format(BigDecimal.valueOf(j02).movePointLeft(9)));
        t0(spannableStringBuilder, length, spannableStringBuilder.length(), '.');
        spannableStringBuilder.append((CharSequence) " ");
        int length2 = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.GramCurrency));
        spannableStringBuilder.setSpan(new RelativeSizeSpan(0.85714287f), length2, spannableStringBuilder.length(), 33);
        q6Var.setText(spannableStringBuilder.append((CharSequence) " ").append((CharSequence) this.I));
    }

    public final void x0() {
        if (this.O == null) {
            return;
        }
        m0 w9 = m0.w(this.currentAccount);
        this.O.setText(LocaleController.formatSpannable(R.string.WalletBalanceAmount, m0.k("Grams", m0.o(w9.u(), false), R.string.Grams_other)));
        boolean z10 = this.T;
        EditTextBoldCursor editTextBoldCursor = this.E;
        this.T = z10 | ((editTextBoldCursor == null || TextUtils.isEmpty(editTextBoldCursor.getText())) ? false : true);
        boolean z11 = (!w9.D() || m0.a(w9.s(), this.f)) && this.T;
        if (z11) {
            long j10 = this.b0;
            if (j10 >= 0) {
                this.Q.setText(LocaleController.formatSpannable(R.string.WalletNetworkFeeAmount, m0.r(j10, false)));
            } else {
                this.Q.setText(LocaleController.formatSpannable(R.string.WalletNetworkFeeAmount, this.R));
            }
        }
        if (this.S == z11) {
            return;
        }
        this.S = z11;
        ValueAnimator valueAnimator = this.V;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.V = null;
        }
        float f7 = z11 ? 1.0f : 0.0f;
        if (!this.Q.isAttachedToWindow()) {
            s0(f7);
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.U, f7);
        this.V = ofFloat;
        ofFloat.setDuration(320L);
        this.V.setInterpolator(bs.h);
        this.V.addUpdateListener(new b3(this, 8));
        this.V.start();
    }

    public final void y0() {
        if (this.x == null || this.L == null) {
            return;
        }
        final boolean z10 = j0() > 0 || this.M.getVisibility() == 0;
        if (z10 == this.i0) {
            return;
        }
        this.i0 = z10;
        this.x.setVisibility(0);
        this.L.setVisibility(0);
        final int i10 = 0;
        ViewPropertyAnimator duration = this.x.animate().alpha(z10 ? 1.0f : 0.0f).scaleX(z10 ? 1.0f : 0.8f).scaleY(z10 ? 1.0f : 0.8f).withEndAction(new Runnable(this) { // from class: org.telegram.ui.Wallet.y8
            public final /* synthetic */ i9 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i10) {
                    case 0:
                        this.b.x.setVisibility(z10 ? 0 : 4);
                        break;
                    default:
                        this.b.L.setVisibility(!z10 ? 0 : 4);
                        break;
                }
            }
        }).setDuration(320L);
        bs bsVar = bs.h;
        duration.setInterpolator(bsVar).start();
        final int i11 = 1;
        this.L.animate().alpha(z10 ? 0.0f : 1.0f).scaleX(!z10 ? 1.0f : 0.8f).scaleY(z10 ? 0.8f : 1.0f).withEndAction(new Runnable(this) { // from class: org.telegram.ui.Wallet.y8
            public final /* synthetic */ i9 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i11) {
                    case 0:
                        this.b.x.setVisibility(z10 ? 0 : 4);
                        break;
                    default:
                        this.b.L.setVisibility(!z10 ? 0 : 4);
                        break;
                }
            }
        }).setDuration(320L).setInterpolator(bsVar).start();
    }

    public final void z0() {
        this.y.d(m0.w(this.currentAccount), this.h0);
    }

    public i9(String str) {
        this(UserConfig.selectedAccount, str);
    }

    public i9(int i10, String str) {
        this.r = 0L;
        this.G = new r8(this, 0);
        this.H = new ViewTreeObserver.OnWindowFocusChangeListener() { // from class: org.telegram.ui.Wallet.s8
            @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
            public final void onWindowFocusChanged(boolean z10) {
                EditTextBoldCursor editTextBoldCursor;
                i9 i9Var = i9.this;
                Runnable runnable = i9Var.G;
                if (z10 && i9Var.F && (editTextBoldCursor = i9Var.E) != null) {
                    editTextBoldCursor.removeCallbacks(runnable);
                    i9Var.E.post(runnable);
                }
            }
        };
        this.b0 = -1L;
        this.e0 = true;
        this.l0 = 6;
        setCurrentAccount(i10);
        this.e = null;
        this.f = str;
        n0();
        this.n = true;
        m0.w(this.currentAccount).X(str, new t8(this, 0));
    }

    @Override // org.telegram.ui.Components.x61
    public final void U(ArrayList arrayList, u61 u61Var) {
    }

    @Override // org.telegram.ui.Components.x61
    public final void W(h61 h61Var, View view) {
    }
}
