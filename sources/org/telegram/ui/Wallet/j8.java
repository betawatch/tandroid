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
import di.zb;
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
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.a71;
import org.telegram.ui.Components.br;
import org.telegram.ui.Components.c71;
import org.telegram.ui.Components.d71;
import org.telegram.ui.Components.da0;
import org.telegram.ui.Components.es;
import org.telegram.ui.Components.ia0;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.zc;
import org.telegram.ui.fo;
import org.telegram.ui.ps0;
import org.telegram.ui.w41;
import org.telegram.ui.xk;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final class j8 extends d71 implements NotificationCenter.NotificationCenterDelegate {
    public EditTextBoldCursor E;
    public boolean F;
    public final Runnable G;
    public final ViewTreeObserver.OnWindowFocusChangeListener H;
    public SpannableString I;
    public SpannableString J;
    public org.telegram.ui.Components.s6 K;
    public TextView L;
    public TextView M;
    public da0 N;
    public TextView O;
    public SpannableString P;
    public xk Q;
    public SpannableString R;
    public boolean S;
    public boolean T;
    public float U;
    public ValueAnimator V;
    public LinearLayout W;
    public o1.k X;
    public float Y;
    public float Z;
    public di.d a0;
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
    public TL_wallet.walletTransaction m0;
    public boolean n;
    public a5 n0;
    public w8 o0;
    public fo p0;
    public v5 q0;
    public long r;
    public int r0;
    public n7 s;
    public di.v5 v;
    public FrameLayout w;
    public LinearLayout x;
    public i8 y;

    public j8(TLRPC.User user) {
        this.r = 0L;
        this.G = new t7(this, 0);
        this.H = new ViewTreeObserver.OnWindowFocusChangeListener() { // from class: org.telegram.ui.Wallet.y7
            @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
            public final void onWindowFocusChanged(boolean z10) {
                EditTextBoldCursor editTextBoldCursor;
                j8 j8Var = j8.this;
                Runnable runnable = j8Var.G;
                if (z10 && j8Var.F && (editTextBoldCursor = j8Var.E) != null) {
                    editTextBoldCursor.removeCallbacks(runnable);
                    j8Var.E.post(runnable);
                }
            }
        };
        this.b0 = -1L;
        this.e0 = true;
        this.l0 = 6;
        this.e = user;
        this.f = null;
        this.n = true;
        k0.v(this.currentAccount).W(user, new s7(this, 1));
    }

    public static void Y(j8 j8Var) {
        a5.u0(j8Var.getParentActivity(), j8Var.currentAccount, j8Var.getResourceProvider());
    }

    public static void Z(final j8 j8Var) {
        di.d dVar = j8Var.a0;
        if (!dVar.W || dVar.N) {
            return;
        }
        final k0 v = k0.v(j8Var.currentAccount);
        long j02 = j8Var.j0();
        long t10 = v.t();
        if (j8Var.n || !WalletEngine2.isValidRecipientAddress(j8Var.f) || j02 <= 0) {
            return;
        }
        long j10 = MessagesController.getInstance(j8Var.currentAccount).config.walletTransferMinNanos.get();
        if (j02 < j10) {
            String f02 = j8Var.h0 ? j8Var.f0(j10, j8Var.h0()) : k0(j10);
            j8Var.y.setAmountText(f02);
            j8Var.E.setSelection(f02.length());
            EditTextBoldCursor editTextBoldCursor = j8Var.E;
            int i10 = -j8Var.l0;
            j8Var.l0 = i10;
            AndroidUtilities.shakeViewSpring(editTextBoldCursor, i10);
            return;
        }
        if (j02 > t10) {
            BotWebViewVibrationEffect.APP_ERROR.vibrate();
            da0 da0Var = j8Var.N;
            int i11 = -j8Var.l0;
            j8Var.l0 = i11;
            AndroidUtilities.shakeViewSpring(da0Var, i11);
            return;
        }
        long j11 = j8Var.b0;
        if (j11 >= 0 && j02 + j11 > t10) {
            j02 -= j11;
        }
        j8Var.F = false;
        EditTextBoldCursor editTextBoldCursor2 = j8Var.E;
        if (editTextBoldCursor2 != null) {
            editTextBoldCursor2.removeCallbacks(j8Var.G);
            j8Var.fragmentView.requestFocus();
            AndroidUtilities.hideKeyboard(j8Var.E);
        }
        j8Var.a0.setLoading(true);
        j8Var.m0 = null;
        if (j8Var.e != null && TextUtils.isEmpty(j8Var.h)) {
            v.Z(j8Var.e, j8Var.f, j02, j8Var.d0, j8Var.e0 ? j8Var.l0() : null, null, null, new v7(j8Var, 0), new v7(j8Var, 1));
            return;
        }
        final String str = j8Var.d0;
        byte[] l02 = j8Var.e0 ? j8Var.l0() : null;
        boolean z10 = l02 != null;
        if (!v.C()) {
            final long j12 = j02;
            final boolean z11 = z10;
            v.h(j8Var.f, j12, str, l02, new Utilities.Callback2() { // from class: org.telegram.ui.Wallet.x7
                @Override // org.telegram.messenger.Utilities.Callback2
                public final void run(Object obj, Object obj2) {
                    TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                    String str2 = (String) obj2;
                    j8 j8Var2 = j8.this;
                    if (str2 != null) {
                        j8Var2.a0.setLoading(false);
                        zc.a0(j8Var2).e0(str2, false);
                        return;
                    }
                    wallettransaction.peer = k0.g(j8Var2.e, j8Var2.f, j8Var2.h);
                    wallettransaction.comment = str;
                    wallettransaction.comment_encrypted = z11;
                    wallettransaction.date = j8Var2.getConnectionsManager().getCurrentTime();
                    AndroidUtilities.hideKeyboard(j8Var2.E);
                    a5.s0(j8Var2.getParentActivity(), j8Var2.getCurrentAccount(), wallettransaction, new w7(j8Var2, v, j12, 1), new s7(j8Var2, 3), j8Var2.l0(), null, j8Var2.getResourceProvider());
                    AndroidUtilities.runOnUIThread(new t7(j8Var2, 2), 1000L);
                }
            });
            return;
        }
        TL_wallet.walletTransaction wallettransaction = new TL_wallet.walletTransaction();
        wallettransaction.peer = k0.g(j8Var.e, j8Var.f, j8Var.h);
        wallettransaction.comment = str;
        wallettransaction.comment_encrypted = z10;
        wallettransaction.date = j8Var.getConnectionsManager().getCurrentTime();
        wallettransaction.fee = Math.max(0L, j8Var.b0);
        wallettransaction.gasless = true;
        wallettransaction.amount = j02;
        AndroidUtilities.hideKeyboard(j8Var.E);
        a5.s0(j8Var.getParentActivity(), j8Var.getCurrentAccount(), wallettransaction, new w7(j8Var, v, j02, 0), new s7(j8Var, 2), j8Var.l0(), null, j8Var.getResourceProvider());
        AndroidUtilities.runOnUIThread(new t7(j8Var, 1), 1000L);
    }

    public static void a0(j8 j8Var, String str) {
        if ("PASSCODE_FAILED".equalsIgnoreCase(str)) {
            j8Var.a0.setLoading(false);
            return;
        }
        if (str != null) {
            j8Var.a0.setLoading(false);
            zc.a0(j8Var).e0(str, false);
            return;
        }
        if (!j8Var.c0) {
            j8Var.q0();
            return;
        }
        org.telegram.ui.ActionBar.b5 parentLayout = j8Var.getParentLayout();
        if (parentLayout == null) {
            j8Var.finishFragment();
            return;
        }
        long j10 = j8Var.e.id;
        ArrayList arrayList = new ArrayList(parentLayout.getFragmentStack());
        if (arrayList.isEmpty() || i2.d.h(1, arrayList) != j8Var) {
            return;
        }
        int size = arrayList.size() - 2;
        while (true) {
            if (size < 0) {
                break;
            }
            org.telegram.ui.ActionBar.m2 m2Var = (org.telegram.ui.ActionBar.m2) arrayList.get(size);
            if ((m2Var instanceof fo) && m2Var.getCurrentAccount() == j8Var.currentAccount) {
                fo foVar = (fo) m2Var;
                if (foVar.a() == j10 && foVar.R3 == 0) {
                    j8Var.p0 = foVar;
                    for (int size2 = arrayList.size() - 2; size2 > size; size2--) {
                        ((ActionBarLayout) parentLayout).a0((org.telegram.ui.ActionBar.m2) arrayList.get(size2), false);
                    }
                }
            }
            size--;
        }
        if (j8Var.p0 == null) {
            j8Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeProfileActivity, Long.valueOf(j10), Boolean.FALSE);
            fo W9 = fo.W9(j10);
            W9.setCurrentAccount(j8Var.currentAccount);
            if (!((ActionBarLayout) parentLayout).c(parentLayout.getFragmentStack().size() - 1, W9)) {
                j8Var.finishFragment();
                return;
            }
            j8Var.p0 = W9;
        }
        j8Var.finishFragment();
    }

    public static void b0(j8 j8Var, TL_wallet.walletUserAddress walletuseraddress) {
        j8Var.n = false;
        j8Var.d = walletuseraddress;
        if (walletuseraddress != null && walletuseraddress.user_id != 0) {
            j8Var.e = MessagesController.getInstance(j8Var.currentAccount).getUser(Long.valueOf(walletuseraddress.user_id));
        }
        c71 c71Var = j8Var.a;
        if (c71Var != null) {
            c71Var.W2.N(true);
        }
        j8Var.w0();
        n7 n7Var = j8Var.s;
        if (n7Var != null) {
            n7Var.a(j8Var.f, j8Var.e);
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
        i8 i8Var = this.y;
        float f12 = this.Y;
        i8Var.e(f12, max, this.X == null && f12 == 1.0f);
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

    @Override // org.telegram.ui.Components.d71
    public final CharSequence V() {
        return LocaleController.getString(R.string.WalletSendMoneyTo);
    }

    @Override // org.telegram.ui.Components.d71
    public final boolean X(m61 m61Var, View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.d71, org.telegram.ui.ActionBar.m2
    public final View createView(Context context) {
        View createView = super.createView(context);
        this.fragmentView = createView;
        final int i10 = 1;
        createView.setFocusableInTouchMode(true);
        this.a.setVisibility(8);
        View view = this.fragmentView;
        int i11 = org.telegram.ui.ActionBar.g6.d6;
        view.setBackgroundColor(getThemedColor(i11));
        this.actionBar.setBackgroundColor(getThemedColor(i11));
        final int i12 = 0;
        this.actionBar.setCastShadows(false);
        org.telegram.ui.ActionBar.u0 a2 = this.actionBar.n().a(1, R.drawable.ic_ab_other);
        a2.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        a2.e(2, R.drawable.msg_addbot, LocaleController.getString(R.string.WalletDepositFunds));
        a2.e(3, R.drawable.menu_comments, LocaleController.getString(R.string.WalletAddComment));
        this.actionBar.setActionBarMenuOnItemClick(new w41(this, 12));
        FrameLayout frameLayout = (FrameLayout) this.fragmentView;
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        n7 n7Var = new n7(context, new t7(this, 5), new t7(this, 6), this.resourceProvider);
        this.s = n7Var;
        frameLayout.addView(n7Var, w7.z5.a(64.0f, 16.0f, 5.0f, 16.0f, 0.0f, -2, 49));
        n7 n7Var2 = this.s;
        if (n7Var2 != null) {
            n7Var2.a(this.f, this.e);
        }
        di.v5 v5Var = new di.v5(this, context);
        this.v = v5Var;
        v5Var.setOrientation(1);
        this.v.setClipChildren(false);
        this.v.setClipToPadding(false);
        frameLayout.addView(this.v, w7.z5.e(-1, -2, 17));
        i8 i8Var = new i8(context, getResourceProvider());
        this.y = i8Var;
        if (i8Var.getDiamondView().f == null) {
            this.Z = 1.0f;
            this.Y = 1.0f;
        }
        this.v.addView(this.y, w7.z5.t(-1, 64, 49, 16, 0, 16, 0));
        EditTextBoldCursor editText = this.y.getEditText();
        this.E = editText;
        editText.setFilters(new InputFilter[]{new InputFilter() { // from class: org.telegram.ui.Wallet.b8
            @Override // android.text.InputFilter
            public final CharSequence filter(CharSequence charSequence, int i13, int i14, Spanned spanned, int i15, int i16) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(spanned.subSequence(0, i15).toString());
                sb2.append((Object) charSequence.subSequence(i13, i14));
                sb2.append((Object) spanned.subSequence(i16, spanned.length()));
                String sb3 = sb2.toString();
                int i17 = 9;
                BigDecimal valueOf = BigDecimal.valueOf(Long.MAX_VALUE, 9);
                j8 j8Var = j8.this;
                if (j8Var.h0) {
                    BigDecimal h02 = j8Var.h0();
                    valueOf = valueOf.multiply(h02);
                    i17 = j8.g0(h02);
                }
                int max = Math.max(sb3.indexOf(46), sb3.indexOf(44));
                if (max >= 0 && (sb3.length() - max) - 1 > i17) {
                    return spanned.subSequence(i15, i16);
                }
                if (j8.p0(sb3).compareTo(valueOf) > 0) {
                    return spanned.subSequence(i15, i16);
                }
                if (i13 == i14) {
                    return null;
                }
                boolean z10 = false;
                for (int i18 = 0; i18 < sb3.length(); i18++) {
                    char charAt = sb3.charAt(i18);
                    if (charAt == '.' || charAt == ',') {
                        if (z10) {
                            return spanned.subSequence(i15, i16);
                        }
                        z10 = true;
                    }
                }
                if (i15 == 0 && (sb3.startsWith(".") || sb3.startsWith(","))) {
                    return "0" + ((Object) charSequence.subSequence(i13, i14));
                }
                if (sb3.startsWith("00")) {
                    return spanned.subSequence(i15, i16);
                }
                return null;
            }
        }});
        this.E.setImeOptions(33554438);
        this.E.setOnEditorActionListener(new q7(this, i12));
        this.E.addTextChangedListener(new di.h2(this, 15));
        long j10 = this.r;
        if (j10 > 0) {
            i8 i8Var2 = this.y;
            BigDecimal valueOf = BigDecimal.valueOf(j10, 9);
            i8Var2.setAmountText((valueOf.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : valueOf.stripTrailingZeros()).toPlainString());
            EditTextBoldCursor editTextBoldCursor = this.E;
            editTextBoldCursor.setSelection(editTextBoldCursor.length());
        }
        this.I = new SpannableString("⇅");
        br brVar = new br(R.drawable.wallet_currency_exchange, 0);
        brVar.setAlpha(0.72f);
        SpannableString spannableString = this.I;
        spannableString.setSpan(brVar, 0, spannableString.length(), 33);
        this.J = new SpannableString("G");
        br brVar2 = new br(R.drawable.wallet_gram_small, 0);
        brVar2.recolorDrawable = false;
        SpannableString spannableString2 = this.J;
        spannableString2.setSpan(brVar2, 0, spannableString2.length(), 33);
        org.telegram.ui.Components.s6 s6Var = new org.telegram.ui.Components.s6(context, false, true, true, true, true);
        this.K = s6Var;
        s6Var.c.m(0.35f, 320L, 3.5f, es.h);
        this.K.setScaleProperty(0.25f);
        this.K.setText(i0(k0.v(this.currentAccount), 0L));
        org.telegram.ui.Components.s6 s6Var2 = this.K;
        int themedColor = getThemedColor(i11);
        int i13 = org.telegram.ui.ActionBar.g6.z6;
        s6Var2.setTextColor(org.telegram.ui.ActionBar.g6.v(themedColor, getThemedColor(i13)));
        this.K.setTextSize(AndroidUtilities.dp(14.0f));
        this.K.setTypeface(AndroidUtilities.getTypeface("fonts/gram.ttf"));
        this.K.setGravity(17);
        this.K.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
        this.K.setAllowCancel(true);
        this.K.setSizeableBackground(org.telegram.ui.ActionBar.g6.c0(AndroidUtilities.dp(14.0f), org.telegram.ui.ActionBar.g6.m1(0.08f, getThemedColor(i13))));
        this.v.addView(this.K, w7.z5.t(-2, 28, 49, 0, 8, 0, 0));
        w7.b6.a(this.K);
        this.K.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Wallet.r7
            public final /* synthetic */ j8 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i12) {
                    case 0:
                        j8 j8Var = this.b;
                        BigDecimal h02 = j8Var.h0();
                        if (j8Var.h0 || h02.signum() > 0) {
                            long j02 = j8Var.j0();
                            j8Var.h0 = !j8Var.h0;
                            j8Var.z0();
                            String f02 = j02 <= 0 ? "" : j8Var.h0 ? j8Var.f0(j02, h02) : j8.k0(j02);
                            j8Var.y.setAmountText(f02);
                            j8Var.E.setSelection(f02.length());
                            break;
                        }
                        break;
                    case 1:
                        j8.Y(this.b);
                        break;
                    case 2:
                        this.b.o0();
                        break;
                    default:
                        j8.Z(this.b);
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
        int i14 = org.telegram.ui.ActionBar.g6.Oh;
        textView2.setTextColor(getThemedColor(i14));
        this.L.setBackground(org.telegram.ui.ActionBar.g6.a0(org.telegram.ui.ActionBar.g6.m1(0.1f, getThemedColor(i14)), org.telegram.ui.ActionBar.g6.m1(0.25f, getThemedColor(i14)), 14, 14));
        this.L.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
        this.L.setGravity(17);
        this.L.setTypeface(AndroidUtilities.bold());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.WalletDepositFunds));
        spannableStringBuilder.append((CharSequence) " >");
        spannableStringBuilder.setSpan(new br(R.drawable.settings_arrow, 0).translate(0.0f, AndroidUtilities.dpf2(0.66f)), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        this.L.setText(spannableStringBuilder);
        this.w.addView(this.L, w7.z5.a(28.0f, 0.0f, 8.0f, 0.0f, 0.0f, -2, 49));
        w7.b6.a(this.L);
        this.L.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Wallet.r7
            public final /* synthetic */ j8 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i10) {
                    case 0:
                        j8 j8Var = this.b;
                        BigDecimal h02 = j8Var.h0();
                        if (j8Var.h0 || h02.signum() > 0) {
                            long j02 = j8Var.j0();
                            j8Var.h0 = !j8Var.h0;
                            j8Var.z0();
                            String f02 = j02 <= 0 ? "" : j8Var.h0 ? j8Var.f0(j02, h02) : j8.k0(j02);
                            j8Var.y.setAmountText(f02);
                            j8Var.E.setSelection(f02.length());
                            break;
                        }
                        break;
                    case 1:
                        j8.Y(this.b);
                        break;
                    case 2:
                        this.b.o0();
                        break;
                    default:
                        j8.Z(this.b);
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
        org.telegram.ui.ActionBar.d5 d5Var = new org.telegram.ui.ActionBar.d5(0, true, false, null);
        d5Var.x = false;
        Paint.Style style = Paint.Style.STROKE;
        Paint paint = d5Var.c;
        paint.setStyle(style);
        paint.setStrokeWidth(Math.max(1.0f, AndroidUtilities.dpf2(0.5f)));
        int i15 = org.telegram.ui.ActionBar.g6.kl;
        paint.setColor(getThemedColor(i15));
        d5Var.w = Integer.valueOf(getThemedColor(i15));
        this.M.setPadding(AndroidUtilities.dp(15.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(19.0f), AndroidUtilities.dp(8.0f));
        this.M.setBackground(d5Var);
        this.M.setTextSize(1, 14.0f);
        this.M.setTextColor(getThemedColor(i13));
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
        final int i16 = 2;
        this.M.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Wallet.r7
            public final /* synthetic */ j8 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i16) {
                    case 0:
                        j8 j8Var = this.b;
                        BigDecimal h02 = j8Var.h0();
                        if (j8Var.h0 || h02.signum() > 0) {
                            long j02 = j8Var.j0();
                            j8Var.h0 = !j8Var.h0;
                            j8Var.z0();
                            String f02 = j02 <= 0 ? "" : j8Var.h0 ? j8Var.f0(j02, h02) : j8.k0(j02);
                            j8Var.y.setAmountText(f02);
                            j8Var.E.setSelection(f02.length());
                            break;
                        }
                        break;
                    case 1:
                        j8.Y(this.b);
                        break;
                    case 2:
                        this.b.o0();
                        break;
                    default:
                        j8.Z(this.b);
                        break;
                }
            }
        });
        w7.b6.b(this.M, 0.02f, 1.2f);
        y0();
        da0 da0Var = new da0(context, this.resourceProvider);
        this.N = da0Var;
        da0Var.setTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.q7));
        this.N.setLinkTextColor(getThemedColor(i14));
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
        this.W.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{org.telegram.ui.ActionBar.g6.m1(0.0f, getThemedColor(i11)), getThemedColor(i11), getThemedColor(i11)}));
        TextView textView3 = new TextView(context);
        this.O = textView3;
        textView3.setTextColor(getThemedColor(i13));
        this.O.setTextSize(1, 14.0f);
        this.O.setGravity(17);
        this.W.addView(this.O, w7.z5.t(-1, -2, 55, 16, 0, 16, 0));
        this.P = new SpannableString(">");
        br brVar3 = new br(R.drawable.settings_arrow, 0);
        brVar3.translate(0.0f, AndroidUtilities.dp(1.0f));
        SpannableString spannableString3 = this.P;
        spannableString3.setSpan(brVar3, 0, spannableString3.length(), 33);
        xk xkVar = new xk(this, context, 6);
        this.Q = xkVar;
        xkVar.setTextColor(getThemedColor(i13));
        this.Q.setTextSize(1, 14.0f);
        this.Q.setGravity(17);
        this.Q.setPadding(0, AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f));
        this.Q.setVisibility(8);
        this.W.addView(this.Q, w7.z5.t(-1, -2, 55, 16, 0, 16, 0));
        SpannableString spannableString4 = new SpannableString(LocaleController.getString(R.string.Loading));
        this.R = spannableString4;
        spannableString4.setSpan(new ia0(AndroidUtilities.dp(80.0f), this.Q), 0, this.R.length(), 33);
        di.d dVar = new di.d(context, getResourceProvider(), true);
        dVar.setRoundRadius(24);
        this.a0 = dVar;
        dVar.setText(LocaleController.getString(R.string.WalletSendGrams));
        this.a0.setEnabled(false);
        final int i17 = 3;
        this.a0.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Wallet.r7
            public final /* synthetic */ j8 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i17) {
                    case 0:
                        j8 j8Var = this.b;
                        BigDecimal h02 = j8Var.h0();
                        if (j8Var.h0 || h02.signum() > 0) {
                            long j02 = j8Var.j0();
                            j8Var.h0 = !j8Var.h0;
                            j8Var.z0();
                            String f02 = j02 <= 0 ? "" : j8Var.h0 ? j8Var.f0(j02, h02) : j8.k0(j02);
                            j8Var.y.setAmountText(f02);
                            j8Var.E.setSelection(f02.length());
                            break;
                        }
                        break;
                    case 1:
                        j8.Y(this.b);
                        break;
                    case 2:
                        this.b.o0();
                        break;
                    default:
                        j8.Z(this.b);
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
        i8 i8Var = this.y;
        if (i8Var != null) {
            i8Var.getDiamondView().l(null);
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
        int max = Math.max(0, Math.min(m0 != null ? m0.exp : TextUtils.equals(k0.v(this.currentAccount).h.g(), "USD") ? 2 : 0, 20));
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
        f fVar = k0.v(this.currentAccount).h;
        fVar.f();
        double h = fVar.h();
        double d = MessagesController.getInstance(this.currentAccount).config.tonUsdRate.get();
        return (h <= 0.0d || d <= 0.0d || Double.isNaN(h) || Double.isInfinite(h) || Double.isNaN(d) || Double.isInfinite(d)) ? BigDecimal.ZERO : BigDecimal.valueOf(h).multiply(BigDecimal.valueOf(d));
    }

    public final SpannableStringBuilder i0(k0 k0Var, long j10) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("≈ ");
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append(k0Var.l(j10, false));
        int length2 = spannableStringBuilder.length();
        TL_wallet.currencyRate m0 = m0();
        t0(spannableStringBuilder, length, length2, (m0 == null || TextUtils.isEmpty(m0.decimalSeparator)) ? '.' : m0.decimalSeparator.charAt(0));
        return spannableStringBuilder.append((CharSequence) " ").append((CharSequence) this.I);
    }

    @Override // org.telegram.ui.ActionBar.m2
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
        f fVar = k0.v(this.currentAccount).h;
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
            k0 v = k0.v(this.currentAccount);
            if (!v.C() || k0.b(v.r(), this.f) || this.e == null || !TextUtils.isEmpty(this.h)) {
                v.h(this.f, 0L, this.d0, this.e0 ? l0() : null, new s7(this, 0));
            }
        }
    }

    public final void o0() {
        Activity parentActivity = getParentActivity();
        if (parentActivity == null) {
            return;
        }
        boolean z10 = this.g0 - this.f0 > AndroidUtilities.dp(20.0f);
        AlertDialog$Builder d2Var = z10 ? new org.telegram.ui.ActionBar.d2(parentActivity, 0, getResourceProvider()) : new AlertDialog$Builder(parentActivity, 0, getResourceProvider());
        String string = LocaleController.getString(R.string.WalletAddComment);
        org.telegram.ui.ActionBar.a2 a2Var = d2Var.a;
        a2Var.R = string;
        final ig.b1 b1Var = new ig.b1(this, parentActivity);
        b1Var.setTextSize(1, 18.0f);
        b1Var.setTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.j5));
        b1Var.setHintTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.t5));
        b1Var.setHint(LocaleController.getString(R.string.WalletCommentOptionalMessage));
        b1Var.setText(this.d0);
        b1Var.setSelection(b1Var.length());
        b1Var.setInputType(147457);
        b1Var.setMaxLines(5);
        b1Var.setImeOptions(6);
        b1Var.setLineColors(getThemedColor(org.telegram.ui.ActionBar.g6.k6), getThemedColor(org.telegram.ui.ActionBar.g6.l6), getThemedColor(org.telegram.ui.ActionBar.g6.p7));
        b1Var.setBackground(null);
        b1Var.setPadding(0, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(48.0f), AndroidUtilities.dp(10.0f));
        org.telegram.ui.Cells.a2 a2Var2 = new org.telegram.ui.Cells.a2(parentActivity, 1, getResourceProvider());
        a2Var2.setBackground(org.telegram.ui.ActionBar.g6.g0(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.i6, this.resourceProvider), 7, AndroidUtilities.dp(12.0f)));
        a2Var2.e(LocaleController.getString(R.string.WalletMakeCommentPublic), "", !this.e0 || l0() == null, false, false);
        a2Var2.setMultiline(true);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) a2Var2.getCheckBoxView().getLayoutParams();
        layoutParams.topMargin = 0;
        layoutParams.gravity = (LocaleController.isRTL ? 5 : 3) | 16;
        a2Var2.getCheckBoxView().setLayoutParams(layoutParams);
        a2Var2.setPadding(LocaleController.isRTL ? AndroidUtilities.dp(4.0f) : 0, AndroidUtilities.dp(12.0f), LocaleController.isRTL ? 0 : AndroidUtilities.dp(4.0f), AndroidUtilities.dp(12.0f));
        a2Var2.setEnabled(l0() != null);
        a2Var2.setOnClickListener(new k3(a2Var2, 4));
        LinearLayout linearLayout = new LinearLayout(parentActivity);
        linearLayout.setOrientation(1);
        linearLayout.addView(b1Var, w7.z5.k(24.0f, 4.0f, 24.0f, 4.0f, -1, -2));
        linearLayout.addView(a2Var2, w7.z5.t(-1, -2, 83, 8, 0, 8, 0));
        a2Var.G = 6;
        d2Var.n(linearLayout);
        a2Var.a = AndroidUtilities.dp(292.0f);
        d2Var.h(LocaleController.getString(R.string.Cancel), new ps0(11));
        d2Var.k(LocaleController.getString(R.string.Add), new f7(this, b1Var, a2Var2, 2));
        a2Var.setOnShowListener(new DialogInterface.OnShowListener() { // from class: org.telegram.ui.Wallet.u7
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                ig.b1 b1Var2 = ig.b1.this;
                b1Var2.requestFocus();
                AndroidUtilities.showKeyboard(b1Var2);
            }
        });
        a2Var.setOnDismissListener(new v3(this, 2));
        if (z10) {
            a2Var.q(250L);
        } else {
            a2Var.show();
        }
        a2Var.h0 = false;
        View d = a2Var.d(-1);
        if (!(d instanceof TextView) || TextUtils.isEmpty(this.d0)) {
            return;
        }
        b1Var.addTextChangedListener(new c8(b1Var, (TextView) d));
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final AnimatorSet onCustomTransitionAnimation(boolean z10, Runnable runnable) {
        View view;
        TL_wallet.walletTransaction wallettransaction;
        i8 i8Var;
        View view2;
        if (!z10 && this.p0 != null && (wallettransaction = this.m0) != null && wallettransaction.localMessageId != 0 && (i8Var = this.y) != null) {
            c6 diamondView = i8Var.getDiamondView();
            if (diamondView.f != null && diamondView.isShown() && diamondView.getAlpha() > 0.01f && (view2 = this.fragmentView) != null && (view2.getParent() instanceof View) && getParentLayout() != null) {
                v5 v5Var = new v5(getParentLayout().getView(), (View) this.fragmentView.getParent(), this.y.getDiamondView(), this.p0, this.m0, runnable, null);
                this.q0 = v5Var;
                return v5Var.m;
            }
        }
        if (z10 || this.n0 == null || this.m0 == null || this.y == null || (view = this.fragmentView) == null || !(view.getParent() instanceof View) || getParentLayout() == null) {
            return super.onCustomTransitionAnimation(z10, runnable);
        }
        w8 w8Var = new w8(getParentLayout().getView(), (View) this.fragmentView.getParent(), this.y.getDiamondView(), this.n0, this.m0, runnable, null);
        this.o0 = w8Var;
        return w8Var.m;
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final boolean onFragmentCreate() {
        getNotificationCenter().addObserver(this, NotificationCenter.walletUpdate);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final void onFragmentDestroy() {
        this.F = false;
        e0();
        v5 v5Var = this.q0;
        if (v5Var != null) {
            AnimatorSet animatorSet = v5Var.m;
            if (!v5Var.v) {
                if (animatorSet.isStarted()) {
                    animatorSet.cancel();
                } else {
                    v5Var.a(false);
                }
            }
            this.q0 = null;
        }
        w8 w8Var = this.o0;
        if (w8Var != null) {
            AnimatorSet animatorSet2 = w8Var.m;
            if (!w8Var.s) {
                if (animatorSet2.isStarted()) {
                    animatorSet2.cancel();
                } else {
                    w8Var.b();
                }
            }
            this.o0 = null;
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

    @Override // org.telegram.ui.ActionBar.m2
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.f0 = i13;
        if (this.W == null) {
            return;
        }
        int max = Math.max(0, this.g0 - i13);
        this.W.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(12.0f) + this.f0);
        if (this.r0 != max) {
            this.W.animate().cancel();
            this.W.animate().translationY(-max).setDuration(320L).setInterpolator(es.h).start();
            this.r0 = max;
        }
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final r0.l1 onInsetsInternal(View view, r0.l1 l1Var) {
        this.g0 = l1Var.a.f(8).d;
        return super.onInsetsInternal(view, l1Var);
    }

    @Override // org.telegram.ui.ActionBar.m2
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

    @Override // org.telegram.ui.ActionBar.m2
    public final void onResume() {
        super.onResume();
        n0();
    }

    @Override // org.telegram.ui.ActionBar.m2
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

    @Override // org.telegram.ui.ActionBar.m2
    public final void onTransitionAnimationStart(boolean z10, boolean z11) {
        EditTextBoldCursor editTextBoldCursor;
        i8 i8Var;
        super.onTransitionAnimationStart(z10, z11);
        if (z10 && !z11 && (i8Var = this.y) != null && this.Y < 1.0f) {
            i8Var.getDiamondView().l(new t7(this, 4));
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
        org.telegram.ui.ActionBar.b5 parentLayout = getParentLayout();
        if (parentLayout == null) {
            finishFragment();
            return;
        }
        ArrayList arrayList = new ArrayList(parentLayout.getFragmentStack());
        if (arrayList.isEmpty() || i2.d.h(1, arrayList) != this) {
            return;
        }
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            org.telegram.ui.ActionBar.m2 m2Var = (org.telegram.ui.ActionBar.m2) obj;
            if (m2Var instanceof s8) {
                ((ActionBarLayout) parentLayout).a0(m2Var, false);
            }
        }
        List fragmentStack = parentLayout.getFragmentStack();
        if (fragmentStack.size() >= 2 && (t8.b.g(2, fragmentStack) instanceof a5) && ((org.telegram.ui.ActionBar.m2) t8.b.g(2, fragmentStack)).getCurrentAccount() == this.currentAccount) {
            this.n0 = (a5) t8.b.g(2, fragmentStack);
        } else {
            a5 a5Var = new a5();
            a5Var.setCurrentAccount(this.currentAccount);
            if (((ActionBarLayout) parentLayout).c(fragmentStack.size() - 1, a5Var)) {
                this.n0 = a5Var;
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
            spannableStringBuilder.setSpan(new br(R.drawable.settings_arrow, 0).setOverrideColor(getThemedColor(org.telegram.ui.ActionBar.g6.Oh)).translate(0.0f, AndroidUtilities.dpf2(0.66f)), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
            spannableStringBuilder.setSpan(new zb(this, 9), length, spannableStringBuilder.length(), 33);
            this.N.setText(spannableStringBuilder);
        }
        this.N.animate().alpha(z10 ? 1.0f : 0.0f).scaleX(z10 ? 1.0f : 0.6f).scaleY(z10 ? 1.0f : 0.6f).setDuration(320L).setInterpolator(es.h).start();
    }

    public final void w0() {
        y0();
        if (this.E == null || this.a0 == null) {
            return;
        }
        k0 v = k0.v(this.currentAccount);
        long t10 = v.t();
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
        boolean z10 = WalletEngine2.isValidRecipientAddress(this.f) && !this.n && j02 > 0 && j02 <= t10;
        v0(!TextUtils.isEmpty(this.E.getText()) && j02 > t10);
        long j03 = j0();
        if (this.j0 == null) {
            this.j0 = new DecimalFormat("#,##0.#########", new DecimalFormatSymbols(Locale.US));
        }
        String format = j03 > 0 ? this.j0.format(BigDecimal.valueOf(j03, 9)) : "";
        this.a0.setLoading(this.n);
        this.a0.g(TextUtils.isEmpty(format) ? LocaleController.getString(R.string.WalletSendGrams) : LocaleController.formatSpannable(R.string.WalletSendAmount, k0.k("Grams", format, R.string.Grams_other)), true, true);
        this.a0.setEnabled(z10);
        x0();
        z0();
        if (!this.h0) {
            this.K.setText(i0(v, j02));
            return;
        }
        org.telegram.ui.Components.s6 s6Var = this.K;
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
        s6Var.setText(spannableStringBuilder.append((CharSequence) " ").append((CharSequence) this.I));
    }

    public final void x0() {
        if (this.O == null) {
            return;
        }
        k0 v = k0.v(this.currentAccount);
        this.O.setText(LocaleController.formatSpannable(R.string.WalletBalanceAmount, k0.q(v.t(), v.t() < 1000000000)));
        boolean z10 = this.T;
        EditTextBoldCursor editTextBoldCursor = this.E;
        this.T = z10 | ((editTextBoldCursor == null || TextUtils.isEmpty(editTextBoldCursor.getText())) ? false : true);
        boolean z11 = (!v.C() || k0.b(v.r(), this.f)) && this.T;
        if (z11) {
            long j10 = this.b0;
            if (j10 >= 0) {
                this.Q.setText(LocaleController.formatSpannable(R.string.WalletNetworkFeeAmount, k0.q(j10, false)));
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
        this.V.setInterpolator(es.h);
        this.V.addUpdateListener(new t2(this, 7));
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
        ViewPropertyAnimator duration = this.x.animate().alpha(z10 ? 1.0f : 0.0f).scaleX(z10 ? 1.0f : 0.8f).scaleY(z10 ? 1.0f : 0.8f).withEndAction(new Runnable(this) { // from class: org.telegram.ui.Wallet.a8
            public final /* synthetic */ j8 b;

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
        es esVar = es.h;
        duration.setInterpolator(esVar).start();
        final int i11 = 1;
        this.L.animate().alpha(z10 ? 0.0f : 1.0f).scaleX(!z10 ? 1.0f : 0.8f).scaleY(z10 ? 0.8f : 1.0f).withEndAction(new Runnable(this) { // from class: org.telegram.ui.Wallet.a8
            public final /* synthetic */ j8 b;

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
        }).setDuration(320L).setInterpolator(esVar).start();
    }

    public final void z0() {
        this.y.d(k0.v(this.currentAccount), this.h0);
    }

    public j8(String str) {
        this.r = 0L;
        this.G = new t7(this, 0);
        this.H = new ViewTreeObserver.OnWindowFocusChangeListener() { // from class: org.telegram.ui.Wallet.y7
            @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
            public final void onWindowFocusChanged(boolean z10) {
                EditTextBoldCursor editTextBoldCursor;
                j8 j8Var = j8.this;
                Runnable runnable = j8Var.G;
                if (z10 && j8Var.F && (editTextBoldCursor = j8Var.E) != null) {
                    editTextBoldCursor.removeCallbacks(runnable);
                    j8Var.E.post(runnable);
                }
            }
        };
        this.b0 = -1L;
        this.e0 = true;
        this.l0 = 6;
        this.e = null;
        this.f = str;
        n0();
        this.n = true;
        k0.v(this.currentAccount).V(str, new s7(this, 4));
    }

    @Override // org.telegram.ui.Components.d71
    public final void U(ArrayList arrayList, a71 a71Var) {
    }

    @Override // org.telegram.ui.Components.d71
    public final void W(m61 m61Var, View view) {
    }
}
