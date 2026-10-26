package org.telegram.ui.Wallet;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Paint;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.ShapeDrawable;
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
import fi.hb;
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
import org.telegram.messenger.FileLog;
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
import org.telegram.ui.Components.b10;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.ea0;
import org.telegram.ui.Components.gb1;
import org.telegram.ui.Components.j71;
import org.telegram.ui.Components.l71;
import org.telegram.ui.Components.m71;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.wc;
import org.telegram.ui.Components.z90;
import org.telegram.ui.Components.zq;
import org.telegram.ui.mk;
import org.telegram.ui.p11;
import org.telegram.ui.un;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final class i9 extends m71 implements NotificationCenter.NotificationCenterDelegate {
    public h9 E;
    public ShapeDrawable F;
    public org.telegram.ui.ActionBar.l5 G;
    public EditTextBoldCursor H;
    public boolean I;
    public final Runnable J;
    public final ViewTreeObserver.OnWindowFocusChangeListener K;
    public SpannableString L;
    public SpannableString M;
    public org.telegram.ui.Components.s6 N;
    public TextView O;
    public TextView P;
    public z90 Q;
    public TextView R;
    public SpannableString S;
    public mk T;
    public SpannableString U;
    public boolean V;
    public boolean W;
    public float X;
    public ValueAnimator Y;
    public LinearLayout Z;
    public o1.j a0;
    public float b0;
    public float c0;
    public fi.d d0;
    public TL_wallet.walletUserAddress e;
    public long e0;
    public TLRPC.User f;
    public boolean f0;
    public String g0;
    public String h;
    public boolean h0;
    public int i0;
    public int j0;
    public boolean k0;
    public boolean l0;
    public DecimalFormat m0;
    public String n;
    public DecimalFormat n0;
    public int o0;
    public boolean p0;
    public TL_wallet.walletTransaction q0;
    public boolean r;
    public m5 r0;
    public long s;
    public v9 s0;
    public un t0;
    public d6 u0;
    public k8 v;
    public int v0;
    public fi.l5 w;
    public int w0;
    public FrameLayout x;
    public LinearLayout y;

    public i9(TLRPC.User user) {
        this.s = 0L;
        this.J = new r8(this, 0);
        this.K = new ViewTreeObserver.OnWindowFocusChangeListener() { // from class: org.telegram.ui.Wallet.s8
            @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
            public final void onWindowFocusChanged(boolean z10) {
                EditTextBoldCursor editTextBoldCursor;
                i9 i9Var = i9.this;
                Runnable runnable = i9Var.J;
                if (z10 && i9Var.I && (editTextBoldCursor = i9Var.H) != null) {
                    editTextBoldCursor.removeCallbacks(runnable);
                    i9Var.H.post(runnable);
                }
            }
        };
        this.e0 = -1L;
        this.h0 = true;
        this.o0 = 6;
        this.f = user;
        this.h = null;
        this.r = true;
        l0.w(this.currentAccount).Y(user, new t8(this, 2));
    }

    public static void Z(i9 i9Var) {
        m5.F0(i9Var.getParentActivity(), i9Var.currentAccount, i9Var.getResourceProvider());
    }

    public static void a0(final i9 i9Var) {
        fi.d dVar = i9Var.d0;
        if (!dVar.c0 || dVar.Q) {
            return;
        }
        final l0 w10 = l0.w(i9Var.currentAccount);
        long l02 = i9Var.l0();
        long u10 = w10.u();
        if (i9Var.r || !WalletEngine2.isValidRecipientAddress(i9Var.h) || l02 <= 0) {
            return;
        }
        long j10 = MessagesController.getInstance(i9Var.currentAccount).config.walletTransferMinNanos.get();
        if (l02 < j10) {
            String h02 = i9Var.k0 ? i9Var.h0(j10, i9Var.j0()) : m0(j10);
            i9Var.E.setAmountText(h02);
            i9Var.H.setSelection(h02.length());
            EditTextBoldCursor editTextBoldCursor = i9Var.H;
            int i10 = -i9Var.o0;
            i9Var.o0 = i10;
            AndroidUtilities.shakeViewSpring(editTextBoldCursor, i10);
            return;
        }
        if (l02 > u10) {
            BotWebViewVibrationEffect.APP_ERROR.vibrate();
            z90 z90Var = i9Var.Q;
            int i11 = -i9Var.o0;
            i9Var.o0 = i11;
            AndroidUtilities.shakeViewSpring(z90Var, i11);
            return;
        }
        long j11 = i9Var.e0;
        if (j11 >= 0 && l02 + j11 > u10) {
            l02 -= j11;
        }
        i9Var.I = false;
        EditTextBoldCursor editTextBoldCursor2 = i9Var.H;
        if (editTextBoldCursor2 != null) {
            editTextBoldCursor2.removeCallbacks(i9Var.J);
            i9Var.fragmentView.requestFocus();
            AndroidUtilities.hideKeyboard(i9Var.H);
        }
        i9Var.d0.setLoading(true);
        i9Var.q0 = null;
        if (i9Var.f != null && TextUtils.isEmpty(i9Var.n)) {
            i9Var.p0 = true;
            w10.b0(i9Var.f, i9Var.h, l02, i9Var.g0, i9Var.h0 ? i9Var.n0() : null, null, null, new v8(i9Var, 0), new v8(i9Var, 1), null);
            return;
        }
        byte[] bArr = null;
        final String str = i9Var.g0;
        if (i9Var.h0) {
            bArr = i9Var.n0();
        }
        boolean z10 = bArr != null;
        if (!w10.D()) {
            final long j12 = l02;
            final boolean z11 = z10;
            w10.h(i9Var.h, j12, str, bArr, new Utilities.Callback2() { // from class: org.telegram.ui.Wallet.x8
                @Override // org.telegram.messenger.Utilities.Callback2
                public final void run(Object obj, Object obj2) {
                    TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                    String str2 = (String) obj2;
                    i9 i9Var2 = i9.this;
                    if (str2 != null) {
                        i9Var2.d0.setLoading(false);
                        wc.b0(i9Var2).f0(str2, false);
                        return;
                    }
                    wallettransaction.peer = l0.f(i9Var2.f, i9Var2.h, i9Var2.n);
                    wallettransaction.comment = str;
                    wallettransaction.comment_encrypted = z11;
                    wallettransaction.date = i9Var2.getConnectionsManager().getCurrentTime();
                    AndroidUtilities.hideKeyboard(i9Var2.H);
                    m5.C0(i9Var2.getParentActivity(), i9Var2.getCurrentAccount(), wallettransaction, new w8(i9Var2, w10, j12, 1), new t8(i9Var2, 4), i9Var2.n0(), null, i9Var2.getResourceProvider());
                    AndroidUtilities.runOnUIThread(new r8(i9Var2, 3), 1000L);
                }
            });
            return;
        }
        TL_wallet.walletTransaction wallettransaction = new TL_wallet.walletTransaction();
        wallettransaction.peer = l0.f(i9Var.f, i9Var.h, i9Var.n);
        wallettransaction.comment = str;
        wallettransaction.comment_encrypted = z10;
        wallettransaction.date = i9Var.getConnectionsManager().getCurrentTime();
        wallettransaction.fee = Math.max(0L, i9Var.e0);
        wallettransaction.gasless = true;
        wallettransaction.amount = l02;
        AndroidUtilities.hideKeyboard(i9Var.H);
        m5.C0(i9Var.getParentActivity(), i9Var.getCurrentAccount(), wallettransaction, new w8(i9Var, w10, l02, 0), new t8(i9Var, 3), i9Var.n0(), null, i9Var.getResourceProvider());
        AndroidUtilities.runOnUIThread(new r8(i9Var, 2), 1000L);
    }

    public static void b0(i9 i9Var, String str) {
        if ("PASSCODE_FAILED".equalsIgnoreCase(str)) {
            i9Var.p0 = false;
            i9Var.d0.setLoading(false);
            return;
        }
        if (str != null) {
            i9Var.p0 = false;
            i9Var.d0.setLoading(false);
            wc.b0(i9Var).f0(str, false);
            return;
        }
        if (!i9Var.f0) {
            i9Var.s0();
            return;
        }
        org.telegram.ui.ActionBar.j5 parentLayout = i9Var.getParentLayout();
        if (parentLayout == null) {
            i9Var.finishFragment();
            return;
        }
        long j10 = i9Var.f.id;
        ArrayList arrayList = new ArrayList(parentLayout.getFragmentStack());
        if (arrayList.isEmpty() || ic.a.g(1, arrayList) != i9Var) {
            return;
        }
        int size = arrayList.size() - 2;
        while (true) {
            if (size < 0) {
                break;
            }
            org.telegram.ui.ActionBar.r2 r2Var = (org.telegram.ui.ActionBar.r2) arrayList.get(size);
            if ((r2Var instanceof un) && r2Var.getCurrentAccount() == i9Var.currentAccount) {
                un unVar = (un) r2Var;
                if (unVar.a() == j10 && unVar.d4 == 0) {
                    i9Var.t0 = unVar;
                    for (int size2 = arrayList.size() - 2; size2 > size; size2--) {
                        ((ActionBarLayout) parentLayout).c0((org.telegram.ui.ActionBar.r2) arrayList.get(size2), false);
                    }
                }
            }
            size--;
        }
        if (i9Var.t0 == null) {
            i9Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeProfileActivity, Long.valueOf(j10), Boolean.FALSE);
            un ba2 = un.ba(j10);
            ba2.setCurrentAccount(i9Var.currentAccount);
            if (!((ActionBarLayout) parentLayout).c(parentLayout.getFragmentStack().size() - 1, ba2)) {
                i9Var.finishFragment();
                return;
            }
            i9Var.t0 = ba2;
        }
        i9Var.finishFragment();
    }

    public static void c0(i9 i9Var, TL_wallet.walletUserAddress walletuseraddress) {
        i9Var.r = false;
        i9Var.e = walletuseraddress;
        if (walletuseraddress != null && walletuseraddress.user_id != 0) {
            i9Var.f = MessagesController.getInstance(i9Var.currentAccount).getUser(Long.valueOf(walletuseraddress.user_id));
        }
        l71 l71Var = i9Var.a;
        if (l71Var != null) {
            l71Var.g3.O(true);
        }
        i9Var.y0();
        k8 k8Var = i9Var.v;
        if (k8Var != null) {
            k8Var.a(i9Var.h, i9Var.f);
        }
    }

    public static int i0(BigDecimal bigDecimal) {
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

    public static String m0(long j10) {
        BigDecimal scale = BigDecimal.valueOf(j10).movePointLeft(9).setScale(2, RoundingMode.HALF_UP);
        return (scale.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : scale.stripTrailingZeros()).toPlainString();
    }

    public static BigDecimal r0(String str) {
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

    public static void v0(SpannableStringBuilder spannableStringBuilder, int i10, int i11, char c10) {
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
        if (this.y == null || this.O == null) {
            return;
        }
        final boolean z10 = l0() > 0 || this.P.getVisibility() == 0;
        if (z10 == this.l0) {
            return;
        }
        this.l0 = z10;
        this.y.setVisibility(0);
        this.O.setVisibility(0);
        final int i10 = 0;
        ViewPropertyAnimator duration = this.y.animate().alpha(z10 ? 1.0f : 0.0f).scaleX(z10 ? 1.0f : 0.8f).scaleY(z10 ? 1.0f : 0.8f).withEndAction(new Runnable(this) { // from class: org.telegram.ui.Wallet.y8
            public final /* synthetic */ i9 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i10) {
                    case 0:
                        this.b.y.setVisibility(z10 ? 0 : 4);
                        break;
                    default:
                        this.b.O.setVisibility(!z10 ? 0 : 4);
                        break;
                }
            }
        }).setDuration(320L);
        ds dsVar = ds.h;
        duration.setInterpolator(dsVar).start();
        final int i11 = 1;
        this.O.animate().alpha(z10 ? 0.0f : 1.0f).scaleX(!z10 ? 1.0f : 0.8f).scaleY(z10 ? 0.8f : 1.0f).withEndAction(new Runnable(this) { // from class: org.telegram.ui.Wallet.y8
            public final /* synthetic */ i9 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i11) {
                    case 0:
                        this.b.y.setVisibility(z10 ? 0 : 4);
                        break;
                    default:
                        this.b.O.setVisibility(!z10 ? 0 : 4);
                        break;
                }
            }
        }).setDuration(320L).setInterpolator(dsVar).start();
    }

    public final void B0() {
        this.E.d(l0.w(this.currentAccount), this.k0);
    }

    public final void C0() {
        float f7 = this.b0;
        float f10 = 1.0f - f7;
        float max = Math.max(this.c0, Math.max(0.0f, Math.min(1.0f, f7)));
        this.c0 = max;
        float f11 = 1.0f - max;
        h9 h9Var = this.E;
        float f12 = this.b0;
        h9Var.e(f12, max, this.a0 == null && f12 == 1.0f);
        this.E.setTranslationY((((this.w.getHeight() / 2.0f) - this.E.getTop()) - (this.E.getHeight() / 2.0f)) * f10);
        this.N.setAlpha(this.c0);
        this.N.setTranslationY(AndroidUtilities.dp(16.0f) * f11);
        this.x.setAlpha(this.c0);
        this.x.setTranslationY(AndroidUtilities.dp(16.0f) * f11);
        this.Z.setAlpha(this.c0);
        for (int i10 = 0; i10 < this.Z.getChildCount(); i10++) {
            this.Z.getChildAt(i10).setTranslationY(AndroidUtilities.dp(24.0f) * f11);
        }
    }

    @Override // org.telegram.ui.Components.m71
    public final CharSequence W() {
        return LocaleController.getString(R.string.WalletSendMoneyTo);
    }

    @Override // org.telegram.ui.Components.m71
    public final boolean Y(t61 t61Var, View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.m71, org.telegram.ui.ActionBar.r2
    public final View createView(Context context) {
        View createView = super.createView(context);
        this.fragmentView = createView;
        final int i10 = 1;
        createView.setFocusableInTouchMode(true);
        this.a.setVisibility(8);
        View view = this.fragmentView;
        int i11 = org.telegram.ui.ActionBar.y6.d6;
        org.telegram.ui.ActionBar.f7.i(i11, view, getResourceProvider());
        org.telegram.ui.ActionBar.f7.i(i11, this.actionBar, getResourceProvider());
        final int i12 = 0;
        this.actionBar.setCastShadows(false);
        org.telegram.ui.ActionBar.w0 a2 = this.actionBar.l().a(1, R.drawable.ic_ab_other);
        a2.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        final int i13 = 2;
        a2.e(2, R.drawable.msg_addbot, LocaleController.getString(R.string.WalletDepositFunds));
        a2.e(3, R.drawable.menu_comments, LocaleController.getString(R.string.WalletAddComment));
        int i14 = 16;
        this.actionBar.setActionBarMenuOnItemClick(new p11(this, i14));
        FrameLayout frameLayout = (FrameLayout) this.fragmentView;
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        k8 k8Var = new k8(context, new r8(this, 5), new r8(this, 6), this.resourceProvider);
        this.v = k8Var;
        frameLayout.addView(k8Var, gb1.h(-2, 64.0f, 49, 16.0f, 5.0f, 16.0f, 0.0f));
        k8 k8Var2 = this.v;
        if (k8Var2 != null) {
            k8Var2.a(this.h, this.f);
        }
        fi.l5 l5Var = new fi.l5(this, context);
        this.w = l5Var;
        l5Var.setOrientation(1);
        this.w.setClipChildren(false);
        this.w.setClipToPadding(false);
        frameLayout.addView(this.w, gb1.i(-1, -2, 17));
        h9 h9Var = new h9(context, getResourceProvider());
        this.E = h9Var;
        if (h9Var.getDiamondView().f == null) {
            this.c0 = 1.0f;
            this.b0 = 1.0f;
        }
        this.w.addView(this.E, gb1.x(-1, 64, 49, 16, 0, 16, 0));
        EditTextBoldCursor editText = this.E.getEditText();
        this.H = editText;
        editText.setFilters(new InputFilter[]{new InputFilter() { // from class: org.telegram.ui.Wallet.a9
            @Override // android.text.InputFilter
            public final CharSequence filter(CharSequence charSequence, int i15, int i16, Spanned spanned, int i17, int i18) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(spanned.subSequence(0, i17).toString());
                sb2.append((Object) charSequence.subSequence(i15, i16));
                sb2.append((Object) spanned.subSequence(i18, spanned.length()));
                String sb3 = sb2.toString();
                int i19 = 9;
                BigDecimal valueOf = BigDecimal.valueOf(Long.MAX_VALUE, 9);
                i9 i9Var = i9.this;
                if (i9Var.k0) {
                    BigDecimal j02 = i9Var.j0();
                    valueOf = valueOf.multiply(j02);
                    i19 = i9.i0(j02);
                }
                int max = Math.max(sb3.indexOf(46), sb3.indexOf(44));
                if (max >= 0 && (sb3.length() - max) - 1 > i19) {
                    return spanned.subSequence(i17, i18);
                }
                if (i9.r0(sb3).compareTo(valueOf) > 0) {
                    return spanned.subSequence(i17, i18);
                }
                if (i15 == i16) {
                    return null;
                }
                boolean z10 = false;
                for (int i20 = 0; i20 < sb3.length(); i20++) {
                    char charAt = sb3.charAt(i20);
                    if (charAt == '.' || charAt == ',') {
                        if (z10) {
                            return spanned.subSequence(i17, i18);
                        }
                        z10 = true;
                    }
                }
                if (i17 == 0 && (sb3.startsWith(".") || sb3.startsWith(","))) {
                    return "0" + ((Object) charSequence.subSequence(i15, i16));
                }
                if (sb3.startsWith("00")) {
                    return spanned.subSequence(i17, i18);
                }
                return null;
            }
        }});
        this.H.setImeOptions(33554438);
        this.H.setOnEditorActionListener(new l8(this, i10));
        this.H.addTextChangedListener(new bi.u(this, i14));
        long j10 = this.s;
        if (j10 > 0) {
            h9 h9Var2 = this.E;
            BigDecimal valueOf = BigDecimal.valueOf(j10, 9);
            h9Var2.setAmountText((valueOf.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : valueOf.stripTrailingZeros()).toPlainString());
            EditTextBoldCursor editTextBoldCursor = this.H;
            editTextBoldCursor.setSelection(editTextBoldCursor.length());
        }
        this.L = new SpannableString("⇅");
        zq zqVar = new zq(R.drawable.wallet_currency_exchange, 0);
        zqVar.setAlpha(0.72f);
        SpannableString spannableString = this.L;
        spannableString.setSpan(zqVar, 0, spannableString.length(), 33);
        this.M = new SpannableString("G");
        zq zqVar2 = new zq(R.drawable.wallet_gram_small, 0);
        zqVar2.recolorDrawable = false;
        SpannableString spannableString2 = this.M;
        spannableString2.setSpan(zqVar2, 0, spannableString2.length(), 33);
        org.telegram.ui.Components.s6 s6Var = new org.telegram.ui.Components.s6(context, false, true, true, true, true);
        this.N = s6Var;
        s6Var.c.m(0.35f, 320L, 3.5f, ds.h);
        this.N.setScaleProperty(0.25f);
        this.N.setText(k0(l0.w(this.currentAccount), 0L));
        org.telegram.ui.Components.s6 s6Var2 = this.N;
        int i15 = org.telegram.ui.ActionBar.y6.z6;
        org.telegram.ui.ActionBar.b7 q5 = org.telegram.ui.ActionBar.f7.q(i11, i15);
        org.telegram.ui.ActionBar.f7.n(s6Var2, q5.a, q5.b, 4, 0.0f, getResourceProvider());
        this.N.setTextSize(AndroidUtilities.dp(14.0f));
        this.N.setTypeface(AndroidUtilities.getTypeface("fonts/gram.ttf"));
        this.N.setGravity(17);
        this.N.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
        this.N.setAllowCancel(true);
        int o12 = org.telegram.ui.ActionBar.y6.o1(0.08f, getThemedColor(i15));
        org.telegram.ui.Components.s6 s6Var3 = this.N;
        ShapeDrawable c02 = org.telegram.ui.ActionBar.y6.c0(AndroidUtilities.dp(14.0f), o12);
        this.F = c02;
        s6Var3.setSizeableBackground(c02);
        this.w.addView(this.N, gb1.x(-2, 28, 49, 0, 8, 0, 0));
        gb1.b(this.N);
        this.N.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Wallet.q8
            public final /* synthetic */ i9 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i13) {
                    case 0:
                        this.b.q0();
                        break;
                    case 1:
                        i9.a0(this.b);
                        break;
                    case 2:
                        i9 i9Var = this.b;
                        BigDecimal j02 = i9Var.j0();
                        if (i9Var.k0 || j02.signum() > 0) {
                            long l02 = i9Var.l0();
                            i9Var.k0 = !i9Var.k0;
                            i9Var.B0();
                            String h02 = l02 <= 0 ? "" : i9Var.k0 ? i9Var.h0(l02, j02) : i9.m0(l02);
                            i9Var.E.setAmountText(h02);
                            i9Var.H.setSelection(h02.length());
                            break;
                        }
                        break;
                    default:
                        i9.Z(this.b);
                        break;
                }
            }
        });
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.x = frameLayout2;
        this.w.addView(frameLayout2, gb1.u(-2, -2, 49));
        LinearLayout linearLayout = new LinearLayout(context);
        this.y = linearLayout;
        linearLayout.setOrientation(1);
        this.x.addView(this.y, gb1.i(-2, -2, 49));
        TextView textView = new TextView(context);
        this.O = textView;
        textView.setTextSize(1, 14.0f);
        TextView textView2 = this.O;
        int i16 = org.telegram.ui.ActionBar.y6.Oh;
        org.telegram.ui.ActionBar.f7.V(textView2, i16, getResourceProvider());
        org.telegram.ui.ActionBar.f7.R(this.O, org.telegram.ui.ActionBar.y6.a0(org.telegram.ui.ActionBar.y6.o1(0.1f, getThemedColor(i16)), org.telegram.ui.ActionBar.y6.o1(0.25f, getThemedColor(i16)), 14, 14), org.telegram.ui.ActionBar.f7.L(0.1f, i16), org.telegram.ui.ActionBar.f7.L(0.25f, i16), getResourceProvider());
        this.O.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
        this.O.setGravity(17);
        this.O.setTypeface(AndroidUtilities.bold());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.WalletDepositFunds));
        spannableStringBuilder.append((CharSequence) " >");
        spannableStringBuilder.setSpan(new zq(R.drawable.settings_arrow, 0).translate(0.0f, AndroidUtilities.dpf2(0.66f)), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        this.O.setText(spannableStringBuilder);
        this.x.addView(this.O, gb1.h(-2, 28.0f, 49, 0.0f, 8.0f, 0.0f, 0.0f));
        gb1.b(this.O);
        final int i17 = 3;
        this.O.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Wallet.q8
            public final /* synthetic */ i9 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i17) {
                    case 0:
                        this.b.q0();
                        break;
                    case 1:
                        i9.a0(this.b);
                        break;
                    case 2:
                        i9 i9Var = this.b;
                        BigDecimal j02 = i9Var.j0();
                        if (i9Var.k0 || j02.signum() > 0) {
                            long l02 = i9Var.l0();
                            i9Var.k0 = !i9Var.k0;
                            i9Var.B0();
                            String h02 = l02 <= 0 ? "" : i9Var.k0 ? i9Var.h0(l02, j02) : i9.m0(l02);
                            i9Var.E.setAmountText(h02);
                            i9Var.H.setSelection(h02.length());
                            break;
                        }
                        break;
                    default:
                        i9.Z(this.b);
                        break;
                }
            }
        });
        this.y.setVisibility(4);
        this.y.setAlpha(0.0f);
        this.y.setScaleX(0.8f);
        this.y.setScaleY(0.8f);
        this.O.setVisibility(0);
        this.O.setAlpha(1.0f);
        this.O.setScaleX(1.0f);
        this.O.setScaleY(1.0f);
        this.l0 = false;
        this.P = new TextView(context);
        org.telegram.ui.ActionBar.l5 l5Var2 = new org.telegram.ui.ActionBar.l5(0, true, false, null);
        l5Var2.x = false;
        Paint.Style style = Paint.Style.STROKE;
        Paint paint = l5Var2.c;
        paint.setStyle(style);
        paint.setStrokeWidth(Math.max(1.0f, AndroidUtilities.dpf2(0.5f)));
        int i18 = org.telegram.ui.ActionBar.y6.kl;
        paint.setColor(getThemedColor(i18));
        l5Var2.w = Integer.valueOf(getThemedColor(i18));
        this.P.setPadding(AndroidUtilities.dp(15.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(19.0f), AndroidUtilities.dp(8.0f));
        this.P.setBackground(l5Var2);
        this.G = l5Var2;
        this.P.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.f7.V(this.P, i15, getResourceProvider());
        this.P.setTypeface(AndroidUtilities.bold());
        this.P.setEllipsize(TextUtils.TruncateAt.END);
        this.P.setMaxLines(4);
        if (TextUtils.isEmpty(this.g0)) {
            this.P.setVisibility(8);
        } else {
            this.P.setText(this.g0);
            this.P.setVisibility(0);
        }
        this.y.addView(this.P, gb1.x(-2, -2, 49, 32, 12, 32, 0));
        this.P.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Wallet.q8
            public final /* synthetic */ i9 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i12) {
                    case 0:
                        this.b.q0();
                        break;
                    case 1:
                        i9.a0(this.b);
                        break;
                    case 2:
                        i9 i9Var = this.b;
                        BigDecimal j02 = i9Var.j0();
                        if (i9Var.k0 || j02.signum() > 0) {
                            long l02 = i9Var.l0();
                            i9Var.k0 = !i9Var.k0;
                            i9Var.B0();
                            String h02 = l02 <= 0 ? "" : i9Var.k0 ? i9Var.h0(l02, j02) : i9.m0(l02);
                            i9Var.E.setAmountText(h02);
                            i9Var.H.setSelection(h02.length());
                            break;
                        }
                        break;
                    default:
                        i9.Z(this.b);
                        break;
                }
            }
        });
        gb1.c(this.P, 0.02f, 1.2f);
        A0();
        z90 z90Var = new z90(context, this.resourceProvider);
        this.Q = z90Var;
        org.telegram.ui.ActionBar.f7.V(z90Var, org.telegram.ui.ActionBar.y6.q7, getResourceProvider());
        org.telegram.ui.ActionBar.f7.H(this.Q, i16, getResourceProvider());
        this.Q.setTextSize(1, 14.0f);
        this.Q.setGravity(17);
        this.Q.setTypeface(AndroidUtilities.bold());
        this.Q.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
        x0(false);
        this.y.addView(this.Q, gb1.x(-2, -2, 49, 0, 10, 0, 0));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.Z = linearLayout2;
        linearLayout2.setOrientation(1);
        this.Z.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(12.0f));
        this.Z.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{org.telegram.ui.ActionBar.y6.o1(0.0f, getThemedColor(i11)), getThemedColor(i11), getThemedColor(i11)}));
        TextView textView3 = new TextView(context);
        this.R = textView3;
        org.telegram.ui.ActionBar.f7.V(textView3, i15, getResourceProvider());
        this.R.setTextSize(1, 14.0f);
        this.R.setGravity(17);
        this.Z.addView(this.R, gb1.x(-1, -2, 55, 16, 0, 16, 0));
        this.S = new SpannableString(">");
        zq zqVar3 = new zq(R.drawable.settings_arrow, 0);
        zqVar3.translate(0.0f, AndroidUtilities.dp(1.0f));
        SpannableString spannableString3 = this.S;
        spannableString3.setSpan(zqVar3, 0, spannableString3.length(), 33);
        mk mkVar = new mk(this, context, 7);
        this.T = mkVar;
        org.telegram.ui.ActionBar.f7.V(mkVar, i15, getResourceProvider());
        this.T.setTextSize(1, 14.0f);
        this.T.setGravity(17);
        this.T.setPadding(0, AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f));
        this.T.setVisibility(8);
        this.Z.addView(this.T, gb1.x(-1, -2, 55, 16, 0, 16, 0));
        SpannableString spannableString4 = new SpannableString(LocaleController.getString(R.string.Loading));
        this.U = spannableString4;
        spannableString4.setSpan(new ea0(AndroidUtilities.dp(80.0f), this.T), 0, this.U.length(), 33);
        fi.d dVar = new fi.d(context, getResourceProvider(), true);
        dVar.setRoundRadius(24);
        this.d0 = dVar;
        dVar.setText(LocaleController.getString(R.string.WalletSendGrams));
        this.d0.setEnabled(false);
        this.d0.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Wallet.q8
            public final /* synthetic */ i9 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i10) {
                    case 0:
                        this.b.q0();
                        break;
                    case 1:
                        i9.a0(this.b);
                        break;
                    case 2:
                        i9 i9Var = this.b;
                        BigDecimal j02 = i9Var.j0();
                        if (i9Var.k0 || j02.signum() > 0) {
                            long l02 = i9Var.l0();
                            i9Var.k0 = !i9Var.k0;
                            i9Var.B0();
                            String h02 = l02 <= 0 ? "" : i9Var.k0 ? i9Var.h0(l02, j02) : i9.m0(l02);
                            i9Var.E.setAmountText(h02);
                            i9Var.H.setSelection(h02.length());
                            break;
                        }
                        break;
                    default:
                        i9.Z(this.b);
                        break;
                }
            }
        });
        this.Z.addView(this.d0, gb1.x(-1, 48, 87, 0, 14, 0, 0));
        frameLayout.addView(this.Z, gb1.i(-1, -2, 87));
        y0();
        C0();
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.walletUpdate) {
            z0();
            y0();
        }
    }

    public final void f0() {
        try {
            ShapeDrawable shapeDrawable = this.F;
            if (shapeDrawable != null) {
                shapeDrawable.getPaint().setColor(org.telegram.ui.ActionBar.y6.o1(0.08f, getThemedColor(org.telegram.ui.ActionBar.y6.z6)));
                this.F.invalidateSelf();
                org.telegram.ui.Components.s6 s6Var = this.N;
                if (s6Var != null) {
                    s6Var.invalidate();
                }
            }
            if (this.G != null) {
                int themedColor = getThemedColor(org.telegram.ui.ActionBar.y6.kl);
                this.G.c.setColor(themedColor);
                this.G.w = Integer.valueOf(themedColor);
                this.G.invalidateSelf();
                TextView textView = this.P;
                if (textView != null) {
                    textView.invalidate();
                }
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public final void g0() {
        h9 h9Var = this.E;
        if (h9Var != null) {
            h9Var.getDiamondView().l(null);
        }
        o1.j jVar = this.a0;
        if (jVar != null) {
            jVar.c();
        }
        this.b0 = 1.0f;
        if (this.E != null) {
            C0();
        }
    }

    public final String h0(long j10, BigDecimal bigDecimal) {
        BigDecimal movePointLeft = BigDecimal.valueOf(j10).multiply(bigDecimal).movePointLeft(9);
        TL_wallet.currencyRate o02 = o0();
        int max = Math.max(0, Math.min(o02 != null ? o02.exp : TextUtils.equals(l0.w(this.currentAccount).h.g(), "USD") ? 2 : 0, 20));
        RoundingMode roundingMode = RoundingMode.HALF_UP;
        BigDecimal scale = movePointLeft.setScale(max, roundingMode);
        if (scale.signum() == 0 && movePointLeft.signum() != 0) {
            scale = movePointLeft.setScale(Math.min(20, Math.max(max, movePointLeft.scale())), roundingMode);
        }
        int i02 = i0(bigDecimal);
        if (scale.scale() > i02) {
            scale = scale.setScale(i02, RoundingMode.DOWN);
        }
        BigDecimal multiply = BigDecimal.valueOf(Long.MAX_VALUE, 9).multiply(bigDecimal);
        if (scale.compareTo(multiply) > 0) {
            scale = multiply.setScale(scale.scale(), RoundingMode.DOWN);
        }
        return (scale.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : scale.stripTrailingZeros()).toPlainString();
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final BigDecimal j0() {
        f fVar = l0.w(this.currentAccount).h;
        fVar.f();
        double h = fVar.h();
        double d = MessagesController.getInstance(this.currentAccount).config.tonUsdRate.get();
        return (h <= 0.0d || d <= 0.0d || Double.isNaN(h) || Double.isInfinite(h) || Double.isNaN(d) || Double.isInfinite(d)) ? BigDecimal.ZERO : BigDecimal.valueOf(h).multiply(BigDecimal.valueOf(d));
    }

    public final SpannableStringBuilder k0(l0 l0Var, long j10) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("≈ ");
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append(l0Var.l(j10, false));
        int length2 = spannableStringBuilder.length();
        TL_wallet.currencyRate o02 = o0();
        v0(spannableStringBuilder, length, length2, (o02 == null || TextUtils.isEmpty(o02.decimalSeparator)) ? '.' : o02.decimalSeparator.charAt(0));
        return spannableStringBuilder.append((CharSequence) " ").append((CharSequence) this.L);
    }

    public final long l0() {
        EditTextBoldCursor editTextBoldCursor = this.H;
        if (editTextBoldCursor == null) {
            return 0L;
        }
        BigDecimal r02 = r0(editTextBoldCursor.getText().toString());
        if (this.k0) {
            BigDecimal j02 = j0();
            if (j02.signum() <= 0) {
                return 0L;
            }
            r02 = r02.divide(j02, 9, RoundingMode.DOWN).setScale(2, RoundingMode.HALF_UP);
        }
        BigInteger bigInteger = r02.movePointRight(9).toBigInteger();
        if (bigInteger.compareTo(BigInteger.valueOf(Long.MAX_VALUE)) > 0) {
            return Long.MAX_VALUE;
        }
        return bigInteger.longValue();
    }

    public final byte[] n0() {
        TL_wallet.walletUserAddress walletuseraddress = this.e;
        if (walletuseraddress == null || walletuseraddress.public_key == null) {
            return null;
        }
        int i10 = 0;
        while (true) {
            byte[] bArr = this.e.public_key;
            if (i10 >= bArr.length) {
                return null;
            }
            if (bArr[i10] != 0) {
                return bArr;
            }
            i10++;
        }
    }

    public final TL_wallet.currencyRate o0() {
        f fVar = l0.w(this.currentAccount).h;
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

    @Override // org.telegram.ui.ActionBar.r2
    public final AnimatorSet onCustomTransitionAnimation(boolean z10, Runnable runnable) {
        View view;
        TL_wallet.walletTransaction wallettransaction;
        h9 h9Var;
        View view2;
        if (!z10 && this.t0 != null && (wallettransaction = this.q0) != null && wallettransaction.localMessageId != 0 && (h9Var = this.E) != null) {
            l6 diamondView = h9Var.getDiamondView();
            if (diamondView.f != null && diamondView.isShown() && diamondView.getAlpha() > 0.01f && (view2 = this.fragmentView) != null && (view2.getParent() instanceof View) && getParentLayout() != null) {
                d6 d6Var = new d6(getParentLayout().getView(), (View) this.fragmentView.getParent(), this.E.getDiamondView(), this.t0, this.q0, runnable, null);
                this.u0 = d6Var;
                return d6Var.m;
            }
        }
        if (z10 || this.r0 == null || this.q0 == null || this.E == null || (view = this.fragmentView) == null || !(view.getParent() instanceof View) || getParentLayout() == null) {
            return super.onCustomTransitionAnimation(z10, runnable);
        }
        v9 v9Var = new v9(getParentLayout().getView(), (View) this.fragmentView.getParent(), this.E.getDiamondView(), this.r0, this.q0, runnable, null);
        this.s0 = v9Var;
        return v9Var.m;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean onFragmentCreate() {
        getNotificationCenter().addObserver(this, NotificationCenter.walletUpdate);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onFragmentDestroy() {
        this.I = false;
        g0();
        d6 d6Var = this.u0;
        if (d6Var != null) {
            AnimatorSet animatorSet = d6Var.m;
            if (!d6Var.v) {
                if (animatorSet.isStarted()) {
                    animatorSet.cancel();
                } else {
                    d6Var.a(false);
                }
            }
            this.u0 = null;
        }
        v9 v9Var = this.s0;
        if (v9Var != null) {
            AnimatorSet animatorSet2 = v9Var.m;
            if (!v9Var.s) {
                if (animatorSet2.isStarted()) {
                    animatorSet2.cancel();
                } else {
                    v9Var.b();
                }
            }
            this.s0 = null;
        }
        ValueAnimator valueAnimator = this.Y;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.Y = null;
        }
        EditTextBoldCursor editTextBoldCursor = this.H;
        if (editTextBoldCursor != null) {
            editTextBoldCursor.removeCallbacks(this.J);
        }
        getNotificationCenter().removeObserver(this, NotificationCenter.walletUpdate);
        super.onFragmentDestroy();
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.i0 = i13;
        if (this.Z == null) {
            return;
        }
        int max = Math.max(0, this.j0 - i13);
        this.Z.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(12.0f) + this.i0);
        if (this.v0 != max) {
            this.Z.animate().cancel();
            this.Z.animate().translationY(-max).setDuration(320L).setInterpolator(ds.h).start();
            this.v0 = max;
        }
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final r0.k1 onInsetsInternal(View view, r0.k1 k1Var) {
        this.j0 = k1Var.a.f(8).d;
        return super.onInsetsInternal(view, k1Var);
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onPause() {
        g0();
        this.I = false;
        EditTextBoldCursor editTextBoldCursor = this.H;
        if (editTextBoldCursor != null) {
            editTextBoldCursor.removeCallbacks(this.J);
            this.fragmentView.requestFocus();
            AndroidUtilities.hideKeyboard(this.H);
        }
        super.onPause();
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onResume() {
        super.onResume();
        p0();
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            f0();
            int themedColor = getThemedColor(org.telegram.ui.ActionBar.y6.d6);
            LinearLayout linearLayout = this.Z;
            if (linearLayout == null || themedColor == this.w0 || !(linearLayout.getBackground() instanceof GradientDrawable)) {
                return;
            }
            this.w0 = themedColor;
            ((GradientDrawable) this.Z.getBackground()).setColors(new int[]{org.telegram.ui.ActionBar.y6.o1(0.0f, themedColor), themedColor, themedColor});
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        EditTextBoldCursor editTextBoldCursor;
        super.onTransitionAnimationEnd(z10, z11);
        if (!z10 || z11 || !this.I || (editTextBoldCursor = this.H) == null) {
            return;
        }
        Runnable runnable = this.J;
        editTextBoldCursor.removeCallbacks(runnable);
        this.H.post(runnable);
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onTransitionAnimationStart(boolean z10, boolean z11) {
        EditTextBoldCursor editTextBoldCursor;
        h9 h9Var;
        super.onTransitionAnimationStart(z10, z11);
        if (z10 && !z11 && (h9Var = this.E) != null && this.b0 < 1.0f) {
            h9Var.getDiamondView().l(new r8(this, 1));
        }
        if (!z10 || z11 || (editTextBoldCursor = this.H) == null) {
            return;
        }
        Runnable runnable = this.J;
        editTextBoldCursor.removeCallbacks(runnable);
        if (this.s > 0) {
            EditTextBoldCursor editTextBoldCursor2 = this.H;
            editTextBoldCursor2.setSelection(editTextBoldCursor2.length());
        } else {
            this.I = true;
            this.H.requestFocus();
            this.H.post(runnable);
        }
    }

    public final void p0() {
        if (WalletEngine2.isValidRecipientAddress(this.h)) {
            this.e0 = -1L;
            z0();
            l0 w10 = l0.w(this.currentAccount);
            if (!w10.D() || l0.a(w10.s(), this.h) || this.f == null || !TextUtils.isEmpty(this.n)) {
                w10.h(this.h, 0L, this.g0, this.h0 ? n0() : null, new t8(this, 1));
            }
        }
    }

    public final void q0() {
        Activity parentActivity = getParentActivity();
        if (parentActivity == null) {
            return;
        }
        boolean z10 = this.j0 - this.i0 > AndroidUtilities.dp(20.0f);
        AlertDialog$Builder h2Var = z10 ? new org.telegram.ui.ActionBar.h2(parentActivity, 0, getResourceProvider()) : new AlertDialog$Builder(parentActivity, 0, getResourceProvider());
        String string = LocaleController.getString(R.string.WalletAddComment);
        org.telegram.ui.ActionBar.e2 e2Var = h2Var.a;
        e2Var.R = string;
        final jg.a1 a1Var = new jg.a1(this, parentActivity);
        a1Var.setTextSize(1, 18.0f);
        org.telegram.ui.ActionBar.f7.V(a1Var, org.telegram.ui.ActionBar.y6.j5, getResourceProvider());
        org.telegram.ui.ActionBar.f7.E(a1Var, org.telegram.ui.ActionBar.y6.t5, getResourceProvider());
        a1Var.setHint(LocaleController.getString(R.string.WalletCommentOptionalMessage));
        a1Var.setText(this.g0);
        a1Var.setSelection(a1Var.length());
        a1Var.setInputType(147457);
        a1Var.setMaxLines(5);
        a1Var.setImeOptions(6);
        org.telegram.ui.ActionBar.f7.G(a1Var, org.telegram.ui.ActionBar.y6.k6, org.telegram.ui.ActionBar.y6.l6, org.telegram.ui.ActionBar.y6.p7, getResourceProvider());
        a1Var.setBackground(null);
        a1Var.setPadding(0, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(48.0f), AndroidUtilities.dp(10.0f));
        org.telegram.ui.Cells.y1 y1Var = new org.telegram.ui.Cells.y1(parentActivity, 1, getResourceProvider());
        int i10 = org.telegram.ui.ActionBar.y6.i6;
        org.telegram.ui.Cells.y g02 = org.telegram.ui.ActionBar.y6.g0(org.telegram.ui.ActionBar.y6.w0(i10, this.resourceProvider), 7, AndroidUtilities.dp(12.0f));
        org.telegram.ui.ActionBar.b7 N = org.telegram.ui.ActionBar.f7.N(i10);
        org.telegram.ui.ActionBar.u6 u6Var = this.resourceProvider;
        y1Var.setBackground(g02);
        org.telegram.ui.ActionBar.f7.k(y1Var, g02, null, N, u6Var);
        y1Var.e(LocaleController.getString(R.string.WalletMakeCommentPublic), "", !this.h0 || n0() == null, false, false);
        y1Var.setMultiline(true);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) y1Var.getCheckBoxView().getLayoutParams();
        layoutParams.topMargin = 0;
        layoutParams.gravity = (LocaleController.isRTL ? 5 : 3) | 16;
        y1Var.getCheckBoxView().setLayoutParams(layoutParams);
        y1Var.setPadding(LocaleController.isRTL ? AndroidUtilities.dp(4.0f) : 0, AndroidUtilities.dp(12.0f), LocaleController.isRTL ? 0 : AndroidUtilities.dp(4.0f), AndroidUtilities.dp(12.0f));
        y1Var.setEnabled(n0() != null);
        y1Var.setOnClickListener(new s2(y1Var, 6));
        LinearLayout linearLayout = new LinearLayout(parentActivity);
        linearLayout.setOrientation(1);
        linearLayout.addView(a1Var, gb1.o(24.0f, 4.0f, 24.0f, 4.0f, -1, -2));
        linearLayout.addView(y1Var, gb1.x(-1, -2, 83, 8, 0, 8, 0));
        e2Var.G = 6;
        h2Var.o(linearLayout);
        e2Var.a = AndroidUtilities.dp(292.0f);
        h2Var.h(LocaleController.getString(R.string.Cancel), new org.telegram.ui.Components.voip.c1(29));
        h2Var.k(LocaleController.getString(R.string.Add), new b8(this, a1Var, y1Var, 2));
        e2Var.setOnShowListener(new DialogInterface.OnShowListener() { // from class: org.telegram.ui.Wallet.u8
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                jg.a1 a1Var2 = jg.a1.this;
                a1Var2.requestFocus();
                AndroidUtilities.showKeyboard(a1Var2);
            }
        });
        e2Var.setOnDismissListener(new f4(this, 1));
        if (z10) {
            e2Var.r(250L);
        } else {
            e2Var.show();
        }
        e2Var.j0 = false;
        View d = e2Var.d(-1);
        if (!(d instanceof TextView) || TextUtils.isEmpty(this.g0)) {
            return;
        }
        a1Var.addTextChangedListener(new b9(a1Var, (TextView) d));
    }

    public final void s0() {
        org.telegram.ui.ActionBar.j5 parentLayout = getParentLayout();
        if (parentLayout == null) {
            finishFragment();
            return;
        }
        ArrayList arrayList = new ArrayList(parentLayout.getFragmentStack());
        if (arrayList.isEmpty() || ic.a.g(1, arrayList) != this) {
            return;
        }
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            org.telegram.ui.ActionBar.r2 r2Var = (org.telegram.ui.ActionBar.r2) obj;
            if (r2Var instanceof r9) {
                ((ActionBarLayout) parentLayout).c0(r2Var, false);
            }
        }
        List fragmentStack = parentLayout.getFragmentStack();
        if (fragmentStack.size() >= 2 && (b10.h(2, fragmentStack) instanceof m5) && ((org.telegram.ui.ActionBar.r2) b10.h(2, fragmentStack)).getCurrentAccount() == this.currentAccount) {
            this.r0 = (m5) b10.h(2, fragmentStack);
        } else {
            m5 m5Var = new m5();
            m5Var.setCurrentAccount(this.currentAccount);
            if (((ActionBarLayout) parentLayout).c(fragmentStack.size() - 1, m5Var)) {
                this.r0 = m5Var;
            }
        }
        finishFragment();
    }

    public final void t0() {
        this.f0 = true;
    }

    public final void u0(float f7) {
        this.X = f7;
        this.T.setAlpha(f7);
        this.T.setVisibility(f7 > 0.0f ? 0 : 8);
        ((LinearLayout.LayoutParams) this.T.getLayoutParams()).topMargin = Math.round(AndroidUtilities.dp(4.0f) * f7);
        this.T.requestLayout();
    }

    public final void w0(String str) {
        this.n = str;
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar != null) {
            kVar.setTitle(LocaleController.getString(R.string.WalletSendMoneyTo));
        }
    }

    public final void x0(boolean z10) {
        if (z10) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.WalletInsufficientFunds));
            spannableStringBuilder.append((CharSequence) " ");
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.WalletDepositFunds));
            spannableStringBuilder.append((CharSequence) " >");
            spannableStringBuilder.setSpan(new zq(R.drawable.settings_arrow, 0).translate(0.0f, AndroidUtilities.dpf2(0.66f)), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
            spannableStringBuilder.setSpan(new hb(this, 9), length, spannableStringBuilder.length(), 33);
            this.Q.setText(spannableStringBuilder);
        }
        this.Q.animate().alpha(z10 ? 1.0f : 0.0f).scaleX(z10 ? 1.0f : 0.6f).scaleY(z10 ? 1.0f : 0.6f).setDuration(320L).setInterpolator(ds.h).start();
    }

    public final void y0() {
        A0();
        if (this.H == null || this.d0 == null) {
            return;
        }
        l0 w10 = l0.w(this.currentAccount);
        long u10 = w10.u();
        long l02 = l0();
        long j10 = MessagesController.getInstance(this.currentAccount).config.walletTransferMinNanos.get();
        if (l02 > 0 && l02 < j10) {
            String h02 = this.k0 ? h0(j10, j0()) : m0(j10);
            this.E.setAmountText(h02);
            this.H.setSelection(h02.length());
            EditTextBoldCursor editTextBoldCursor = this.H;
            int i10 = -this.o0;
            this.o0 = i10;
            AndroidUtilities.shakeViewSpring(editTextBoldCursor, i10);
            return;
        }
        boolean z10 = WalletEngine2.isValidRecipientAddress(this.h) && !this.r && l02 > 0 && l02 <= u10;
        x0(!TextUtils.isEmpty(this.H.getText()) && l02 > u10);
        long l03 = l0();
        if (this.m0 == null) {
            this.m0 = new DecimalFormat("#,##0.#########", new DecimalFormatSymbols(Locale.US));
        }
        String format = l03 > 0 ? this.m0.format(BigDecimal.valueOf(l03, 9)) : "";
        this.d0.setLoading(this.r || this.p0);
        this.d0.i(TextUtils.isEmpty(format) ? LocaleController.getString(R.string.WalletSendGrams) : LocaleController.formatSpannable(R.string.WalletSendAmount, l0.k("Grams", format, R.string.Grams_other)), true, true);
        this.d0.setEnabled(z10);
        z0();
        B0();
        if (!this.k0) {
            this.N.setText(k0(w10, l02));
            return;
        }
        org.telegram.ui.Components.s6 s6Var = this.N;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) this.M).append((CharSequence) " ");
        int length = spannableStringBuilder.length();
        if (this.n0 == null) {
            DecimalFormat decimalFormat = new DecimalFormat("#,##0.##", new DecimalFormatSymbols(Locale.US));
            this.n0 = decimalFormat;
            decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
        }
        spannableStringBuilder.append((CharSequence) this.n0.format(BigDecimal.valueOf(l02).movePointLeft(9)));
        v0(spannableStringBuilder, length, spannableStringBuilder.length(), '.');
        spannableStringBuilder.append((CharSequence) " ");
        int length2 = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.GramCurrency));
        spannableStringBuilder.setSpan(new RelativeSizeSpan(0.85714287f), length2, spannableStringBuilder.length(), 33);
        s6Var.setText(spannableStringBuilder.append((CharSequence) " ").append((CharSequence) this.L));
    }

    public final void z0() {
        if (this.R == null) {
            return;
        }
        l0 w10 = l0.w(this.currentAccount);
        this.R.setText(LocaleController.formatSpannable(R.string.WalletBalanceAmount, l0.k("Grams", l0.o(w10.u(), false), R.string.Grams_other)));
        boolean z10 = this.W;
        EditTextBoldCursor editTextBoldCursor = this.H;
        this.W = z10 | ((editTextBoldCursor == null || TextUtils.isEmpty(editTextBoldCursor.getText())) ? false : true);
        boolean z11 = (!w10.D() || l0.a(w10.s(), this.h)) && this.W;
        if (z11) {
            long j10 = this.e0;
            if (j10 >= 0) {
                this.T.setText(LocaleController.formatSpannable(R.string.WalletNetworkFeeAmount, l0.r(j10, false)));
            } else {
                this.T.setText(LocaleController.formatSpannable(R.string.WalletNetworkFeeAmount, this.U));
            }
        }
        if (this.V == z11) {
            return;
        }
        this.V = z11;
        ValueAnimator valueAnimator = this.Y;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.Y = null;
        }
        float f7 = z11 ? 1.0f : 0.0f;
        if (!this.T.isAttachedToWindow()) {
            u0(f7);
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.X, f7);
        this.Y = ofFloat;
        ofFloat.setDuration(320L);
        this.Y.setInterpolator(ds.h);
        this.Y.addUpdateListener(new a3(this, 8));
        this.Y.start();
    }

    public i9(String str) {
        this(UserConfig.selectedAccount, str);
    }

    public i9(int i10, String str) {
        this.s = 0L;
        this.J = new r8(this, 0);
        this.K = new ViewTreeObserver.OnWindowFocusChangeListener() { // from class: org.telegram.ui.Wallet.s8
            @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
            public final void onWindowFocusChanged(boolean z10) {
                EditTextBoldCursor editTextBoldCursor;
                i9 i9Var = i9.this;
                Runnable runnable = i9Var.J;
                if (z10 && i9Var.I && (editTextBoldCursor = i9Var.H) != null) {
                    editTextBoldCursor.removeCallbacks(runnable);
                    i9Var.H.post(runnable);
                }
            }
        };
        this.e0 = -1L;
        this.h0 = true;
        this.o0 = 6;
        setCurrentAccount(i10);
        this.f = null;
        this.h = str;
        p0();
        this.r = true;
        l0.w(this.currentAccount).X(str, new t8(this, 0));
    }

    @Override // org.telegram.ui.Components.m71
    public final void V(ArrayList arrayList, j71 j71Var) {
    }

    @Override // org.telegram.ui.Components.m71
    public final void X(t61 t61Var, View view) {
    }
}
