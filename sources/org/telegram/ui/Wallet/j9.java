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
import org.telegram.ui.Components.b71;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.d71;
import org.telegram.ui.Components.da0;
import org.telegram.ui.Components.e71;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.xc;
import org.telegram.ui.Components.xq;
import org.telegram.ui.Components.y90;
import org.telegram.ui.c31;
import org.telegram.ui.lk;
import org.telegram.ui.sn;
import org.telegram.ui.wv;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes4.dex */
public final class j9 extends e71 implements NotificationCenter.NotificationCenterDelegate {
    public ShapeDrawable E;
    public org.telegram.ui.ActionBar.j5 F;
    public EditTextBoldCursor G;
    public boolean H;
    public final Runnable I;
    public final ViewTreeObserver.OnWindowFocusChangeListener J;
    public SpannableString K;
    public SpannableString L;
    public org.telegram.ui.Components.q6 M;
    public TextView N;
    public TextView O;
    public y90 P;
    public TextView Q;
    public SpannableString R;
    public lk S;
    public SpannableString T;
    public boolean U;
    public boolean V;
    public float W;
    public ValueAnimator X;
    public LinearLayout Y;
    public o1.k Z;
    public float a0;
    public float b0;
    public ei.d c0;
    public TL_wallet.walletUserAddress d;
    public long d0;
    public TLRPC.User e;
    public boolean e0;
    public String f;
    public String f0;
    public boolean g0;
    public String h;
    public int h0;
    public int i0;
    public boolean j0;
    public boolean k0;
    public DecimalFormat l0;
    public DecimalFormat m0;
    public boolean n;
    public int n0;
    public boolean o0;
    public TL_wallet.walletTransaction p0;
    public o5 q0;
    public long r;
    public w9 r0;
    public l8 s;
    public sn s0;
    public e6 t0;
    public int u0;
    public ei.m5 v;
    public int v0;
    public FrameLayout w;
    public LinearLayout x;
    public i9 y;

    public j9(TLRPC.User user) {
        this.r = 0L;
        this.I = new s8(this, 0);
        this.J = new ViewTreeObserver.OnWindowFocusChangeListener() { // from class: org.telegram.ui.Wallet.t8
            @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
            public final void onWindowFocusChanged(boolean z10) {
                EditTextBoldCursor editTextBoldCursor;
                j9 j9Var = j9.this;
                Runnable runnable = j9Var.I;
                if (z10 && j9Var.H && (editTextBoldCursor = j9Var.G) != null) {
                    editTextBoldCursor.removeCallbacks(runnable);
                    j9Var.G.post(runnable);
                }
            }
        };
        this.d0 = -1L;
        this.g0 = true;
        this.n0 = 6;
        this.e = user;
        this.f = null;
        this.n = true;
        l0.w(this.currentAccount).Y(user, new u8(this, 2));
    }

    public static void Y(j9 j9Var) {
        o5.E0(j9Var.getParentActivity(), j9Var.currentAccount, j9Var.getResourceProvider());
    }

    public static void Z(final j9 j9Var) {
        ei.d dVar = j9Var.c0;
        if (!dVar.c0 || dVar.Q) {
            return;
        }
        final l0 w9 = l0.w(j9Var.currentAccount);
        long k02 = j9Var.k0();
        long u10 = w9.u();
        if (j9Var.n || !WalletEngine2.isValidRecipientAddress(j9Var.f) || k02 <= 0) {
            return;
        }
        long j10 = MessagesController.getInstance(j9Var.currentAccount).config.walletTransferMinNanos.get();
        if (k02 < j10) {
            String g02 = j9Var.j0 ? j9Var.g0(j10, j9Var.i0()) : l0(j10);
            j9Var.y.setAmountText(g02);
            j9Var.G.setSelection(g02.length());
            EditTextBoldCursor editTextBoldCursor = j9Var.G;
            int i10 = -j9Var.n0;
            j9Var.n0 = i10;
            AndroidUtilities.shakeViewSpring(editTextBoldCursor, i10);
            return;
        }
        if (k02 > u10) {
            BotWebViewVibrationEffect.APP_ERROR.vibrate();
            y90 y90Var = j9Var.P;
            int i11 = -j9Var.n0;
            j9Var.n0 = i11;
            AndroidUtilities.shakeViewSpring(y90Var, i11);
            return;
        }
        long j11 = j9Var.d0;
        if (j11 >= 0 && k02 + j11 > u10) {
            k02 -= j11;
        }
        j9Var.H = false;
        EditTextBoldCursor editTextBoldCursor2 = j9Var.G;
        if (editTextBoldCursor2 != null) {
            editTextBoldCursor2.removeCallbacks(j9Var.I);
            j9Var.fragmentView.requestFocus();
            AndroidUtilities.hideKeyboard(j9Var.G);
        }
        j9Var.c0.setLoading(true);
        j9Var.p0 = null;
        if (j9Var.e != null && TextUtils.isEmpty(j9Var.h)) {
            j9Var.o0 = true;
            w9.b0(j9Var.e, j9Var.f, k02, j9Var.f0, j9Var.g0 ? j9Var.m0() : null, null, null, new w8(j9Var, 0), new w8(j9Var, 1), null);
            return;
        }
        byte[] bArr = null;
        final String str = j9Var.f0;
        if (j9Var.g0) {
            bArr = j9Var.m0();
        }
        boolean z10 = bArr != null;
        if (!w9.D()) {
            final long j12 = k02;
            final boolean z11 = z10;
            w9.h(j9Var.f, j12, str, bArr, new Utilities.Callback2() { // from class: org.telegram.ui.Wallet.y8
                @Override // org.telegram.messenger.Utilities.Callback2
                public final void run(Object obj, Object obj2) {
                    TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                    String str2 = (String) obj2;
                    j9 j9Var2 = j9.this;
                    if (str2 != null) {
                        j9Var2.c0.setLoading(false);
                        xc.a0(j9Var2).e0(str2, false);
                        return;
                    }
                    wallettransaction.peer = l0.f(j9Var2.e, j9Var2.f, j9Var2.h);
                    wallettransaction.comment = str;
                    wallettransaction.comment_encrypted = z11;
                    wallettransaction.date = j9Var2.getConnectionsManager().getCurrentTime();
                    AndroidUtilities.hideKeyboard(j9Var2.G);
                    o5.B0(j9Var2.getParentActivity(), j9Var2.getCurrentAccount(), wallettransaction, new x8(j9Var2, w9, j12, 1), new u8(j9Var2, 4), j9Var2.m0(), null, j9Var2.getResourceProvider());
                    AndroidUtilities.runOnUIThread(new s8(j9Var2, 3), 1000L);
                }
            });
            return;
        }
        TL_wallet.walletTransaction wallettransaction = new TL_wallet.walletTransaction();
        wallettransaction.peer = l0.f(j9Var.e, j9Var.f, j9Var.h);
        wallettransaction.comment = str;
        wallettransaction.comment_encrypted = z10;
        wallettransaction.date = j9Var.getConnectionsManager().getCurrentTime();
        wallettransaction.fee = Math.max(0L, j9Var.d0);
        wallettransaction.gasless = true;
        wallettransaction.amount = k02;
        AndroidUtilities.hideKeyboard(j9Var.G);
        o5.B0(j9Var.getParentActivity(), j9Var.getCurrentAccount(), wallettransaction, new x8(j9Var, w9, k02, 0), new u8(j9Var, 3), j9Var.m0(), null, j9Var.getResourceProvider());
        AndroidUtilities.runOnUIThread(new s8(j9Var, 2), 1000L);
    }

    public static void a0(j9 j9Var, String str) {
        if ("PASSCODE_FAILED".equalsIgnoreCase(str)) {
            j9Var.o0 = false;
            j9Var.c0.setLoading(false);
            return;
        }
        if (str != null) {
            j9Var.o0 = false;
            j9Var.c0.setLoading(false);
            xc.a0(j9Var).e0(str, false);
            return;
        }
        if (!j9Var.e0) {
            j9Var.r0();
            return;
        }
        org.telegram.ui.ActionBar.h5 parentLayout = j9Var.getParentLayout();
        if (parentLayout == null) {
            j9Var.finishFragment();
            return;
        }
        long j10 = j9Var.e.id;
        ArrayList arrayList = new ArrayList(parentLayout.getFragmentStack());
        if (arrayList.isEmpty() || i2.o1.i(1, arrayList) != j9Var) {
            return;
        }
        int size = arrayList.size() - 2;
        while (true) {
            if (size < 0) {
                break;
            }
            org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) arrayList.get(size);
            if ((o2Var instanceof sn) && o2Var.getCurrentAccount() == j9Var.currentAccount) {
                sn snVar = (sn) o2Var;
                if (snVar.a() == j10 && snVar.d4 == 0) {
                    j9Var.s0 = snVar;
                    for (int size2 = arrayList.size() - 2; size2 > size; size2--) {
                        ((ActionBarLayout) parentLayout).b0((org.telegram.ui.ActionBar.o2) arrayList.get(size2), false);
                    }
                }
            }
            size--;
        }
        if (j9Var.s0 == null) {
            j9Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeProfileActivity, Long.valueOf(j10), Boolean.FALSE);
            sn W9 = sn.W9(j10);
            W9.setCurrentAccount(j9Var.currentAccount);
            if (!((ActionBarLayout) parentLayout).c(parentLayout.getFragmentStack().size() - 1, W9)) {
                j9Var.finishFragment();
                return;
            }
            j9Var.s0 = W9;
        }
        j9Var.finishFragment();
    }

    public static void b0(j9 j9Var, TL_wallet.walletUserAddress walletuseraddress) {
        j9Var.n = false;
        j9Var.d = walletuseraddress;
        if (walletuseraddress != null && walletuseraddress.user_id != 0) {
            j9Var.e = MessagesController.getInstance(j9Var.currentAccount).getUser(Long.valueOf(walletuseraddress.user_id));
        }
        d71 d71Var = j9Var.a;
        if (d71Var != null) {
            d71Var.Z2.N(true);
        }
        j9Var.x0();
        l8 l8Var = j9Var.s;
        if (l8Var != null) {
            l8Var.a(j9Var.f, j9Var.e);
        }
    }

    public static int h0(BigDecimal bigDecimal) {
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

    public static String l0(long j10) {
        BigDecimal scale = BigDecimal.valueOf(j10).movePointLeft(9).setScale(2, RoundingMode.HALF_UP);
        return (scale.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : scale.stripTrailingZeros()).toPlainString();
    }

    public static BigDecimal q0(String str) {
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

    public static void u0(SpannableStringBuilder spannableStringBuilder, int i10, int i11, char c10) {
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
        this.y.d(l0.w(this.currentAccount), this.j0);
    }

    public final void B0() {
        float f7 = this.a0;
        float f10 = 1.0f - f7;
        float max = Math.max(this.b0, Math.max(0.0f, Math.min(1.0f, f7)));
        this.b0 = max;
        float f11 = 1.0f - max;
        i9 i9Var = this.y;
        float f12 = this.a0;
        i9Var.e(f12, max, this.Z == null && f12 == 1.0f);
        this.y.setTranslationY((((this.v.getHeight() / 2.0f) - this.y.getTop()) - (this.y.getHeight() / 2.0f)) * f10);
        this.M.setAlpha(this.b0);
        this.M.setTranslationY(AndroidUtilities.dp(16.0f) * f11);
        this.w.setAlpha(this.b0);
        this.w.setTranslationY(AndroidUtilities.dp(16.0f) * f11);
        this.Y.setAlpha(this.b0);
        for (int i10 = 0; i10 < this.Y.getChildCount(); i10++) {
            this.Y.getChildAt(i10).setTranslationY(AndroidUtilities.dp(24.0f) * f11);
        }
    }

    @Override // org.telegram.ui.Components.e71
    public final CharSequence V() {
        return LocaleController.getString(R.string.WalletSendMoneyTo);
    }

    @Override // org.telegram.ui.Components.e71
    public final boolean X(m61 m61Var, View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.e71, org.telegram.ui.ActionBar.o2
    public final View createView(Context context) {
        View createView = super.createView(context);
        this.fragmentView = createView;
        final int i10 = 1;
        createView.setFocusableInTouchMode(true);
        this.a.setVisibility(8);
        View view = this.fragmentView;
        int i11 = org.telegram.ui.ActionBar.k6.d6;
        org.telegram.ui.ActionBar.r6.i(i11, view, getResourceProvider());
        org.telegram.ui.ActionBar.r6.i(i11, this.actionBar, getResourceProvider());
        final int i12 = 0;
        this.actionBar.setCastShadows(false);
        org.telegram.ui.ActionBar.u0 a2 = this.actionBar.m().a(1, R.drawable.ic_ab_other);
        a2.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        final int i13 = 2;
        a2.e(2, R.drawable.msg_addbot, LocaleController.getString(R.string.WalletDepositFunds));
        a2.e(3, R.drawable.menu_comments, LocaleController.getString(R.string.WalletAddComment));
        this.actionBar.setActionBarMenuOnItemClick(new c31(this, 13));
        FrameLayout frameLayout = (FrameLayout) this.fragmentView;
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        l8 l8Var = new l8(context, new s8(this, 5), new s8(this, 6), this.resourceProvider);
        this.s = l8Var;
        frameLayout.addView(l8Var, w7.z5.d(-2, 64.0f, 49, 16.0f, 5.0f, 16.0f, 0.0f));
        l8 l8Var2 = this.s;
        if (l8Var2 != null) {
            l8Var2.a(this.f, this.e);
        }
        ei.m5 m5Var = new ei.m5(this, context);
        this.v = m5Var;
        m5Var.setOrientation(1);
        this.v.setClipChildren(false);
        this.v.setClipToPadding(false);
        frameLayout.addView(this.v, w7.z5.e(-1, -2, 17));
        i9 i9Var = new i9(context, getResourceProvider());
        this.y = i9Var;
        if (i9Var.getDiamondView().f == null) {
            this.b0 = 1.0f;
            this.a0 = 1.0f;
        }
        this.v.addView(this.y, w7.z5.t(-1, 64, 49, 16, 0, 16, 0));
        EditTextBoldCursor editText = this.y.getEditText();
        this.G = editText;
        editText.setFilters(new InputFilter[]{new InputFilter() { // from class: org.telegram.ui.Wallet.b9
            @Override // android.text.InputFilter
            public final CharSequence filter(CharSequence charSequence, int i14, int i15, Spanned spanned, int i16, int i17) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(spanned.subSequence(0, i16).toString());
                sb2.append((Object) charSequence.subSequence(i14, i15));
                sb2.append((Object) spanned.subSequence(i17, spanned.length()));
                String sb3 = sb2.toString();
                int i18 = 9;
                BigDecimal valueOf = BigDecimal.valueOf(Long.MAX_VALUE, 9);
                j9 j9Var = j9.this;
                if (j9Var.j0) {
                    BigDecimal i02 = j9Var.i0();
                    valueOf = valueOf.multiply(i02);
                    i18 = j9.h0(i02);
                }
                int max = Math.max(sb3.indexOf(46), sb3.indexOf(44));
                if (max >= 0 && (sb3.length() - max) - 1 > i18) {
                    return spanned.subSequence(i16, i17);
                }
                if (j9.q0(sb3).compareTo(valueOf) > 0) {
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
        this.G.setImeOptions(33554438);
        this.G.setOnEditorActionListener(new m8(this, i10));
        this.G.addTextChangedListener(new ai.u(this, 16));
        long j10 = this.r;
        if (j10 > 0) {
            i9 i9Var2 = this.y;
            BigDecimal valueOf = BigDecimal.valueOf(j10, 9);
            i9Var2.setAmountText((valueOf.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : valueOf.stripTrailingZeros()).toPlainString());
            EditTextBoldCursor editTextBoldCursor = this.G;
            editTextBoldCursor.setSelection(editTextBoldCursor.length());
        }
        this.K = new SpannableString("⇅");
        xq xqVar = new xq(R.drawable.wallet_currency_exchange, 0);
        xqVar.setAlpha(0.72f);
        SpannableString spannableString = this.K;
        spannableString.setSpan(xqVar, 0, spannableString.length(), 33);
        this.L = new SpannableString("G");
        xq xqVar2 = new xq(R.drawable.wallet_gram_small, 0);
        xqVar2.recolorDrawable = false;
        SpannableString spannableString2 = this.L;
        spannableString2.setSpan(xqVar2, 0, spannableString2.length(), 33);
        org.telegram.ui.Components.q6 q6Var = new org.telegram.ui.Components.q6(context, false, true, true, true, true);
        this.M = q6Var;
        q6Var.c.m(0.35f, 320L, 3.5f, bs.h);
        this.M.setScaleProperty(0.25f);
        this.M.setText(j0(l0.w(this.currentAccount), 0L));
        org.telegram.ui.Components.q6 q6Var2 = this.M;
        int i14 = org.telegram.ui.ActionBar.k6.z6;
        org.telegram.ui.ActionBar.n6 q6 = org.telegram.ui.ActionBar.r6.q(i11, i14);
        org.telegram.ui.ActionBar.r6.n(q6Var2, q6.a, q6.b, 4, 0.0f, getResourceProvider());
        this.M.setTextSize(AndroidUtilities.dp(14.0f));
        this.M.setTypeface(AndroidUtilities.getTypeface("fonts/gram.ttf"));
        this.M.setGravity(17);
        this.M.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
        this.M.setAllowCancel(true);
        int o12 = org.telegram.ui.ActionBar.k6.o1(0.08f, getThemedColor(i14));
        org.telegram.ui.Components.q6 q6Var3 = this.M;
        ShapeDrawable c02 = org.telegram.ui.ActionBar.k6.c0(AndroidUtilities.dp(14.0f), o12);
        this.E = c02;
        q6Var3.setSizeableBackground(c02);
        this.v.addView(this.M, w7.z5.t(-2, 28, 49, 0, 8, 0, 0));
        w7.b6.a(this.M);
        this.M.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Wallet.r8
            public final /* synthetic */ j9 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i13) {
                    case 0:
                        this.b.p0();
                        break;
                    case 1:
                        j9.Z(this.b);
                        break;
                    case 2:
                        j9 j9Var = this.b;
                        BigDecimal i02 = j9Var.i0();
                        if (j9Var.j0 || i02.signum() > 0) {
                            long k02 = j9Var.k0();
                            j9Var.j0 = !j9Var.j0;
                            j9Var.A0();
                            String g02 = k02 <= 0 ? "" : j9Var.j0 ? j9Var.g0(k02, i02) : j9.l0(k02);
                            j9Var.y.setAmountText(g02);
                            j9Var.G.setSelection(g02.length());
                            break;
                        }
                        break;
                    default:
                        j9.Y(this.b);
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
        this.N = textView;
        textView.setTextSize(1, 14.0f);
        TextView textView2 = this.N;
        int i15 = org.telegram.ui.ActionBar.k6.Oh;
        org.telegram.ui.ActionBar.r6.W(textView2, i15, getResourceProvider());
        org.telegram.ui.ActionBar.r6.S(this.N, org.telegram.ui.ActionBar.k6.a0(org.telegram.ui.ActionBar.k6.o1(0.1f, getThemedColor(i15)), org.telegram.ui.ActionBar.k6.o1(0.25f, getThemedColor(i15)), 14, 14), org.telegram.ui.ActionBar.r6.M(0.1f, i15), org.telegram.ui.ActionBar.r6.M(0.25f, i15), getResourceProvider());
        this.N.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
        this.N.setGravity(17);
        this.N.setTypeface(AndroidUtilities.bold());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.WalletDepositFunds));
        spannableStringBuilder.append((CharSequence) " >");
        spannableStringBuilder.setSpan(new xq(R.drawable.settings_arrow, 0).translate(0.0f, AndroidUtilities.dpf2(0.66f)), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        this.N.setText(spannableStringBuilder);
        this.w.addView(this.N, w7.z5.d(-2, 28.0f, 49, 0.0f, 8.0f, 0.0f, 0.0f));
        w7.b6.a(this.N);
        final int i16 = 3;
        this.N.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Wallet.r8
            public final /* synthetic */ j9 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i16) {
                    case 0:
                        this.b.p0();
                        break;
                    case 1:
                        j9.Z(this.b);
                        break;
                    case 2:
                        j9 j9Var = this.b;
                        BigDecimal i02 = j9Var.i0();
                        if (j9Var.j0 || i02.signum() > 0) {
                            long k02 = j9Var.k0();
                            j9Var.j0 = !j9Var.j0;
                            j9Var.A0();
                            String g02 = k02 <= 0 ? "" : j9Var.j0 ? j9Var.g0(k02, i02) : j9.l0(k02);
                            j9Var.y.setAmountText(g02);
                            j9Var.G.setSelection(g02.length());
                            break;
                        }
                        break;
                    default:
                        j9.Y(this.b);
                        break;
                }
            }
        });
        this.x.setVisibility(4);
        this.x.setAlpha(0.0f);
        this.x.setScaleX(0.8f);
        this.x.setScaleY(0.8f);
        this.N.setVisibility(0);
        this.N.setAlpha(1.0f);
        this.N.setScaleX(1.0f);
        this.N.setScaleY(1.0f);
        this.k0 = false;
        this.O = new TextView(context);
        org.telegram.ui.ActionBar.j5 j5Var = new org.telegram.ui.ActionBar.j5(0, true, false, null);
        j5Var.x = false;
        Paint.Style style = Paint.Style.STROKE;
        Paint paint = j5Var.c;
        paint.setStyle(style);
        paint.setStrokeWidth(Math.max(1.0f, AndroidUtilities.dpf2(0.5f)));
        int i17 = org.telegram.ui.ActionBar.k6.kl;
        paint.setColor(getThemedColor(i17));
        j5Var.w = Integer.valueOf(getThemedColor(i17));
        this.O.setPadding(AndroidUtilities.dp(15.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(19.0f), AndroidUtilities.dp(8.0f));
        this.O.setBackground(j5Var);
        this.F = j5Var;
        this.O.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.r6.W(this.O, i14, getResourceProvider());
        this.O.setTypeface(AndroidUtilities.bold());
        this.O.setEllipsize(TextUtils.TruncateAt.END);
        this.O.setMaxLines(4);
        if (TextUtils.isEmpty(this.f0)) {
            this.O.setVisibility(8);
        } else {
            this.O.setText(this.f0);
            this.O.setVisibility(0);
        }
        this.x.addView(this.O, w7.z5.t(-2, -2, 49, 32, 12, 32, 0));
        this.O.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Wallet.r8
            public final /* synthetic */ j9 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i12) {
                    case 0:
                        this.b.p0();
                        break;
                    case 1:
                        j9.Z(this.b);
                        break;
                    case 2:
                        j9 j9Var = this.b;
                        BigDecimal i02 = j9Var.i0();
                        if (j9Var.j0 || i02.signum() > 0) {
                            long k02 = j9Var.k0();
                            j9Var.j0 = !j9Var.j0;
                            j9Var.A0();
                            String g02 = k02 <= 0 ? "" : j9Var.j0 ? j9Var.g0(k02, i02) : j9.l0(k02);
                            j9Var.y.setAmountText(g02);
                            j9Var.G.setSelection(g02.length());
                            break;
                        }
                        break;
                    default:
                        j9.Y(this.b);
                        break;
                }
            }
        });
        w7.b6.b(this.O, 0.02f, 1.2f);
        z0();
        y90 y90Var = new y90(context, this.resourceProvider);
        this.P = y90Var;
        org.telegram.ui.ActionBar.r6.W(y90Var, org.telegram.ui.ActionBar.k6.q7, getResourceProvider());
        org.telegram.ui.ActionBar.r6.I(this.P, i15, getResourceProvider());
        this.P.setTextSize(1, 14.0f);
        this.P.setGravity(17);
        this.P.setTypeface(AndroidUtilities.bold());
        this.P.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
        w0(false);
        this.x.addView(this.P, w7.z5.t(-2, -2, 49, 0, 10, 0, 0));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.Y = linearLayout2;
        linearLayout2.setOrientation(1);
        this.Y.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(12.0f));
        this.Y.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{org.telegram.ui.ActionBar.k6.o1(0.0f, getThemedColor(i11)), getThemedColor(i11), getThemedColor(i11)}));
        TextView textView3 = new TextView(context);
        this.Q = textView3;
        org.telegram.ui.ActionBar.r6.W(textView3, i14, getResourceProvider());
        this.Q.setTextSize(1, 14.0f);
        this.Q.setGravity(17);
        this.Y.addView(this.Q, w7.z5.t(-1, -2, 55, 16, 0, 16, 0));
        this.R = new SpannableString(">");
        xq xqVar3 = new xq(R.drawable.settings_arrow, 0);
        xqVar3.translate(0.0f, AndroidUtilities.dp(1.0f));
        SpannableString spannableString3 = this.R;
        spannableString3.setSpan(xqVar3, 0, spannableString3.length(), 33);
        lk lkVar = new lk(this, context, 7);
        this.S = lkVar;
        org.telegram.ui.ActionBar.r6.W(lkVar, i14, getResourceProvider());
        this.S.setTextSize(1, 14.0f);
        this.S.setGravity(17);
        this.S.setPadding(0, AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f));
        this.S.setVisibility(8);
        this.Y.addView(this.S, w7.z5.t(-1, -2, 55, 16, 0, 16, 0));
        SpannableString spannableString4 = new SpannableString(LocaleController.getString(R.string.Loading));
        this.T = spannableString4;
        spannableString4.setSpan(new da0(AndroidUtilities.dp(80.0f), this.S), 0, this.T.length(), 33);
        ei.d dVar = new ei.d(context, getResourceProvider(), true);
        dVar.setRoundRadius(24);
        this.c0 = dVar;
        dVar.setText(LocaleController.getString(R.string.WalletSendGrams));
        this.c0.setEnabled(false);
        this.c0.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Wallet.r8
            public final /* synthetic */ j9 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i10) {
                    case 0:
                        this.b.p0();
                        break;
                    case 1:
                        j9.Z(this.b);
                        break;
                    case 2:
                        j9 j9Var = this.b;
                        BigDecimal i02 = j9Var.i0();
                        if (j9Var.j0 || i02.signum() > 0) {
                            long k02 = j9Var.k0();
                            j9Var.j0 = !j9Var.j0;
                            j9Var.A0();
                            String g02 = k02 <= 0 ? "" : j9Var.j0 ? j9Var.g0(k02, i02) : j9.l0(k02);
                            j9Var.y.setAmountText(g02);
                            j9Var.G.setSelection(g02.length());
                            break;
                        }
                        break;
                    default:
                        j9.Y(this.b);
                        break;
                }
            }
        });
        this.Y.addView(this.c0, w7.z5.t(-1, 48, 87, 0, 14, 0, 0));
        frameLayout.addView(this.Y, w7.z5.e(-1, -2, 87));
        x0();
        B0();
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.walletUpdate) {
            y0();
            x0();
        }
    }

    public final void e0() {
        try {
            ShapeDrawable shapeDrawable = this.E;
            if (shapeDrawable != null) {
                shapeDrawable.getPaint().setColor(org.telegram.ui.ActionBar.k6.o1(0.08f, getThemedColor(org.telegram.ui.ActionBar.k6.z6)));
                this.E.invalidateSelf();
                org.telegram.ui.Components.q6 q6Var = this.M;
                if (q6Var != null) {
                    q6Var.invalidate();
                }
            }
            if (this.F != null) {
                int themedColor = getThemedColor(org.telegram.ui.ActionBar.k6.kl);
                this.F.c.setColor(themedColor);
                this.F.w = Integer.valueOf(themedColor);
                this.F.invalidateSelf();
                TextView textView = this.O;
                if (textView != null) {
                    textView.invalidate();
                }
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public final void f0() {
        i9 i9Var = this.y;
        if (i9Var != null) {
            i9Var.getDiamondView().l(null);
        }
        o1.k kVar = this.Z;
        if (kVar != null) {
            kVar.c();
        }
        this.a0 = 1.0f;
        if (this.y != null) {
            B0();
        }
    }

    public final String g0(long j10, BigDecimal bigDecimal) {
        BigDecimal movePointLeft = BigDecimal.valueOf(j10).multiply(bigDecimal).movePointLeft(9);
        TL_wallet.currencyRate n02 = n0();
        int max = Math.max(0, Math.min(n02 != null ? n02.exp : TextUtils.equals(l0.w(this.currentAccount).h.g(), "USD") ? 2 : 0, 20));
        RoundingMode roundingMode = RoundingMode.HALF_UP;
        BigDecimal scale = movePointLeft.setScale(max, roundingMode);
        if (scale.signum() == 0 && movePointLeft.signum() != 0) {
            scale = movePointLeft.setScale(Math.min(20, Math.max(max, movePointLeft.scale())), roundingMode);
        }
        int h02 = h0(bigDecimal);
        if (scale.scale() > h02) {
            scale = scale.setScale(h02, RoundingMode.DOWN);
        }
        BigDecimal multiply = BigDecimal.valueOf(Long.MAX_VALUE, 9).multiply(bigDecimal);
        if (scale.compareTo(multiply) > 0) {
            scale = multiply.setScale(scale.scale(), RoundingMode.DOWN);
        }
        return (scale.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : scale.stripTrailingZeros()).toPlainString();
    }

    public final BigDecimal i0() {
        f fVar = l0.w(this.currentAccount).h;
        fVar.f();
        double h = fVar.h();
        double d = MessagesController.getInstance(this.currentAccount).config.tonUsdRate.get();
        return (h <= 0.0d || d <= 0.0d || Double.isNaN(h) || Double.isInfinite(h) || Double.isNaN(d) || Double.isInfinite(d)) ? BigDecimal.ZERO : BigDecimal.valueOf(h).multiply(BigDecimal.valueOf(d));
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final SpannableStringBuilder j0(l0 l0Var, long j10) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("≈ ");
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append(l0Var.l(j10, false));
        int length2 = spannableStringBuilder.length();
        TL_wallet.currencyRate n02 = n0();
        u0(spannableStringBuilder, length, length2, (n02 == null || TextUtils.isEmpty(n02.decimalSeparator)) ? '.' : n02.decimalSeparator.charAt(0));
        return spannableStringBuilder.append((CharSequence) " ").append((CharSequence) this.K);
    }

    public final long k0() {
        EditTextBoldCursor editTextBoldCursor = this.G;
        if (editTextBoldCursor == null) {
            return 0L;
        }
        BigDecimal q02 = q0(editTextBoldCursor.getText().toString());
        if (this.j0) {
            BigDecimal i02 = i0();
            if (i02.signum() <= 0) {
                return 0L;
            }
            q02 = q02.divide(i02, 9, RoundingMode.DOWN).setScale(2, RoundingMode.HALF_UP);
        }
        BigInteger bigInteger = q02.movePointRight(9).toBigInteger();
        if (bigInteger.compareTo(BigInteger.valueOf(Long.MAX_VALUE)) > 0) {
            return Long.MAX_VALUE;
        }
        return bigInteger.longValue();
    }

    public final byte[] m0() {
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

    public final TL_wallet.currencyRate n0() {
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

    public final void o0() {
        if (WalletEngine2.isValidRecipientAddress(this.f)) {
            this.d0 = -1L;
            y0();
            l0 w9 = l0.w(this.currentAccount);
            if (!w9.D() || l0.a(w9.s(), this.f) || this.e == null || !TextUtils.isEmpty(this.h)) {
                w9.h(this.f, 0L, this.f0, this.g0 ? m0() : null, new u8(this, 1));
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final AnimatorSet onCustomTransitionAnimation(boolean z10, Runnable runnable) {
        View view;
        TL_wallet.walletTransaction wallettransaction;
        i9 i9Var;
        View view2;
        if (!z10 && this.s0 != null && (wallettransaction = this.p0) != null && wallettransaction.localMessageId != 0 && (i9Var = this.y) != null) {
            m6 diamondView = i9Var.getDiamondView();
            if (diamondView.f != null && diamondView.isShown() && diamondView.getAlpha() > 0.01f && (view2 = this.fragmentView) != null && (view2.getParent() instanceof View) && getParentLayout() != null) {
                e6 e6Var = new e6(getParentLayout().getView(), (View) this.fragmentView.getParent(), this.y.getDiamondView(), this.s0, this.p0, runnable, null);
                this.t0 = e6Var;
                return e6Var.m;
            }
        }
        if (z10 || this.q0 == null || this.p0 == null || this.y == null || (view = this.fragmentView) == null || !(view.getParent() instanceof View) || getParentLayout() == null) {
            return super.onCustomTransitionAnimation(z10, runnable);
        }
        w9 w9Var = new w9(getParentLayout().getView(), (View) this.fragmentView.getParent(), this.y.getDiamondView(), this.q0, this.p0, runnable, null);
        this.r0 = w9Var;
        return w9Var.m;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean onFragmentCreate() {
        getNotificationCenter().addObserver(this, NotificationCenter.walletUpdate);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onFragmentDestroy() {
        this.H = false;
        f0();
        e6 e6Var = this.t0;
        if (e6Var != null) {
            AnimatorSet animatorSet = e6Var.m;
            if (!e6Var.v) {
                if (animatorSet.isStarted()) {
                    animatorSet.cancel();
                } else {
                    e6Var.a(false);
                }
            }
            this.t0 = null;
        }
        w9 w9Var = this.r0;
        if (w9Var != null) {
            AnimatorSet animatorSet2 = w9Var.m;
            if (!w9Var.s) {
                if (animatorSet2.isStarted()) {
                    animatorSet2.cancel();
                } else {
                    w9Var.b();
                }
            }
            this.r0 = null;
        }
        ValueAnimator valueAnimator = this.X;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.X = null;
        }
        EditTextBoldCursor editTextBoldCursor = this.G;
        if (editTextBoldCursor != null) {
            editTextBoldCursor.removeCallbacks(this.I);
        }
        getNotificationCenter().removeObserver(this, NotificationCenter.walletUpdate);
        super.onFragmentDestroy();
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.h0 = i13;
        if (this.Y == null) {
            return;
        }
        int max = Math.max(0, this.i0 - i13);
        this.Y.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(12.0f) + this.h0);
        if (this.u0 != max) {
            this.Y.animate().cancel();
            this.Y.animate().translationY(-max).setDuration(320L).setInterpolator(bs.h).start();
            this.u0 = max;
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final r0.k1 onInsetsInternal(View view, r0.k1 k1Var) {
        this.i0 = k1Var.a.f(8).d;
        return super.onInsetsInternal(view, k1Var);
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onPause() {
        f0();
        this.H = false;
        EditTextBoldCursor editTextBoldCursor = this.G;
        if (editTextBoldCursor != null) {
            editTextBoldCursor.removeCallbacks(this.I);
            this.fragmentView.requestFocus();
            AndroidUtilities.hideKeyboard(this.G);
        }
        super.onPause();
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onResume() {
        super.onResume();
        o0();
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            e0();
            int themedColor = getThemedColor(org.telegram.ui.ActionBar.k6.d6);
            LinearLayout linearLayout = this.Y;
            if (linearLayout == null || themedColor == this.v0 || !(linearLayout.getBackground() instanceof GradientDrawable)) {
                return;
            }
            this.v0 = themedColor;
            ((GradientDrawable) this.Y.getBackground()).setColors(new int[]{org.telegram.ui.ActionBar.k6.o1(0.0f, themedColor), themedColor, themedColor});
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        EditTextBoldCursor editTextBoldCursor;
        super.onTransitionAnimationEnd(z10, z11);
        if (!z10 || z11 || !this.H || (editTextBoldCursor = this.G) == null) {
            return;
        }
        Runnable runnable = this.I;
        editTextBoldCursor.removeCallbacks(runnable);
        this.G.post(runnable);
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onTransitionAnimationStart(boolean z10, boolean z11) {
        EditTextBoldCursor editTextBoldCursor;
        i9 i9Var;
        super.onTransitionAnimationStart(z10, z11);
        if (z10 && !z11 && (i9Var = this.y) != null && this.a0 < 1.0f) {
            i9Var.getDiamondView().l(new s8(this, 1));
        }
        if (!z10 || z11 || (editTextBoldCursor = this.G) == null) {
            return;
        }
        Runnable runnable = this.I;
        editTextBoldCursor.removeCallbacks(runnable);
        if (this.r > 0) {
            EditTextBoldCursor editTextBoldCursor2 = this.G;
            editTextBoldCursor2.setSelection(editTextBoldCursor2.length());
        } else {
            this.H = true;
            this.G.requestFocus();
            this.G.post(runnable);
        }
    }

    public final void p0() {
        Activity parentActivity = getParentActivity();
        if (parentActivity == null) {
            return;
        }
        boolean z10 = this.i0 - this.h0 > AndroidUtilities.dp(20.0f);
        AlertDialog$Builder f2Var = z10 ? new org.telegram.ui.ActionBar.f2(parentActivity, 0, getResourceProvider()) : new AlertDialog$Builder(parentActivity, 0, getResourceProvider());
        String string = LocaleController.getString(R.string.WalletAddComment);
        org.telegram.ui.ActionBar.c2 c2Var = f2Var.a;
        c2Var.R = string;
        final ig.z0 z0Var = new ig.z0(this, parentActivity);
        z0Var.setTextSize(1, 18.0f);
        org.telegram.ui.ActionBar.r6.W(z0Var, org.telegram.ui.ActionBar.k6.j5, getResourceProvider());
        org.telegram.ui.ActionBar.r6.F(z0Var, org.telegram.ui.ActionBar.k6.t5, getResourceProvider());
        z0Var.setHint(LocaleController.getString(R.string.WalletCommentOptionalMessage));
        z0Var.setText(this.f0);
        z0Var.setSelection(z0Var.length());
        z0Var.setInputType(147457);
        z0Var.setMaxLines(5);
        z0Var.setImeOptions(6);
        org.telegram.ui.ActionBar.r6.H(z0Var, org.telegram.ui.ActionBar.k6.k6, org.telegram.ui.ActionBar.k6.l6, org.telegram.ui.ActionBar.k6.p7, getResourceProvider());
        z0Var.setBackground(null);
        z0Var.setPadding(0, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(48.0f), AndroidUtilities.dp(10.0f));
        org.telegram.ui.Cells.z1 z1Var = new org.telegram.ui.Cells.z1(parentActivity, 1, getResourceProvider());
        int i10 = org.telegram.ui.ActionBar.k6.i6;
        org.telegram.ui.Cells.y g02 = org.telegram.ui.ActionBar.k6.g0(org.telegram.ui.ActionBar.k6.w0(i10, this.resourceProvider), 7, AndroidUtilities.dp(12.0f));
        org.telegram.ui.ActionBar.n6 O = org.telegram.ui.ActionBar.r6.O(i10);
        org.telegram.ui.ActionBar.g6 g6Var = this.resourceProvider;
        z1Var.setBackground(g02);
        org.telegram.ui.ActionBar.r6.k(z1Var, g02, null, O, g6Var);
        z1Var.e(LocaleController.getString(R.string.WalletMakeCommentPublic), "", !this.g0 || m0() == null, false, false);
        z1Var.setMultiline(true);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) z1Var.getCheckBoxView().getLayoutParams();
        layoutParams.topMargin = 0;
        layoutParams.gravity = (LocaleController.isRTL ? 5 : 3) | 16;
        z1Var.getCheckBoxView().setLayoutParams(layoutParams);
        z1Var.setPadding(LocaleController.isRTL ? AndroidUtilities.dp(4.0f) : 0, AndroidUtilities.dp(12.0f), LocaleController.isRTL ? 0 : AndroidUtilities.dp(4.0f), AndroidUtilities.dp(12.0f));
        z1Var.setEnabled(m0() != null);
        z1Var.setOnClickListener(new s2(z1Var, 6));
        LinearLayout linearLayout = new LinearLayout(parentActivity);
        linearLayout.setOrientation(1);
        linearLayout.addView(z0Var, w7.z5.k(24.0f, 4.0f, 24.0f, 4.0f, -1, -2));
        linearLayout.addView(z1Var, w7.z5.t(-1, -2, 83, 8, 0, 8, 0));
        c2Var.G = 6;
        f2Var.o(linearLayout);
        c2Var.a = AndroidUtilities.dp(292.0f);
        f2Var.h(LocaleController.getString(R.string.Cancel), new wv(27));
        f2Var.k(LocaleController.getString(R.string.Add), new b8(this, z0Var, z1Var, 2));
        c2Var.setOnShowListener(new DialogInterface.OnShowListener() { // from class: org.telegram.ui.Wallet.v8
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                ig.z0 z0Var2 = ig.z0.this;
                z0Var2.requestFocus();
                AndroidUtilities.showKeyboard(z0Var2);
            }
        });
        c2Var.setOnDismissListener(new g4(this, 1));
        if (z10) {
            c2Var.r(250L);
        } else {
            c2Var.show();
        }
        c2Var.j0 = false;
        View d = c2Var.d(-1);
        if (!(d instanceof TextView) || TextUtils.isEmpty(this.f0)) {
            return;
        }
        z0Var.addTextChangedListener(new c9(z0Var, (TextView) d));
    }

    public final void r0() {
        org.telegram.ui.ActionBar.h5 parentLayout = getParentLayout();
        if (parentLayout == null) {
            finishFragment();
            return;
        }
        ArrayList arrayList = new ArrayList(parentLayout.getFragmentStack());
        if (arrayList.isEmpty() || i2.o1.i(1, arrayList) != this) {
            return;
        }
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) obj;
            if (o2Var instanceof s9) {
                ((ActionBarLayout) parentLayout).b0(o2Var, false);
            }
        }
        List fragmentStack = parentLayout.getFragmentStack();
        if (fragmentStack.size() >= 2 && (si.o0.g(2, fragmentStack) instanceof o5) && ((org.telegram.ui.ActionBar.o2) si.o0.g(2, fragmentStack)).getCurrentAccount() == this.currentAccount) {
            this.q0 = (o5) si.o0.g(2, fragmentStack);
        } else {
            o5 o5Var = new o5();
            o5Var.setCurrentAccount(this.currentAccount);
            if (((ActionBarLayout) parentLayout).c(fragmentStack.size() - 1, o5Var)) {
                this.q0 = o5Var;
            }
        }
        finishFragment();
    }

    public final void s0() {
        this.e0 = true;
    }

    public final void t0(float f7) {
        this.W = f7;
        this.S.setAlpha(f7);
        this.S.setVisibility(f7 > 0.0f ? 0 : 8);
        ((LinearLayout.LayoutParams) this.S.getLayoutParams()).topMargin = Math.round(AndroidUtilities.dp(4.0f) * f7);
        this.S.requestLayout();
    }

    public final void v0(String str) {
        this.h = str;
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar != null) {
            kVar.setTitle(LocaleController.getString(R.string.WalletSendMoneyTo));
        }
    }

    public final void w0(boolean z10) {
        if (z10) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.WalletInsufficientFunds));
            spannableStringBuilder.append((CharSequence) " ");
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.WalletDepositFunds));
            spannableStringBuilder.append((CharSequence) " >");
            spannableStringBuilder.setSpan(new xq(R.drawable.settings_arrow, 0).translate(0.0f, AndroidUtilities.dpf2(0.66f)), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
            spannableStringBuilder.setSpan(new kb(this, 9), length, spannableStringBuilder.length(), 33);
            this.P.setText(spannableStringBuilder);
        }
        this.P.animate().alpha(z10 ? 1.0f : 0.0f).scaleX(z10 ? 1.0f : 0.6f).scaleY(z10 ? 1.0f : 0.6f).setDuration(320L).setInterpolator(bs.h).start();
    }

    public final void x0() {
        z0();
        if (this.G == null || this.c0 == null) {
            return;
        }
        l0 w9 = l0.w(this.currentAccount);
        long u10 = w9.u();
        long k02 = k0();
        long j10 = MessagesController.getInstance(this.currentAccount).config.walletTransferMinNanos.get();
        if (k02 > 0 && k02 < j10) {
            String g02 = this.j0 ? g0(j10, i0()) : l0(j10);
            this.y.setAmountText(g02);
            this.G.setSelection(g02.length());
            EditTextBoldCursor editTextBoldCursor = this.G;
            int i10 = -this.n0;
            this.n0 = i10;
            AndroidUtilities.shakeViewSpring(editTextBoldCursor, i10);
            return;
        }
        boolean z10 = WalletEngine2.isValidRecipientAddress(this.f) && !this.n && k02 > 0 && k02 <= u10;
        w0(!TextUtils.isEmpty(this.G.getText()) && k02 > u10);
        long k03 = k0();
        if (this.l0 == null) {
            this.l0 = new DecimalFormat("#,##0.#########", new DecimalFormatSymbols(Locale.US));
        }
        String format = k03 > 0 ? this.l0.format(BigDecimal.valueOf(k03, 9)) : "";
        this.c0.setLoading(this.n || this.o0);
        this.c0.i(TextUtils.isEmpty(format) ? LocaleController.getString(R.string.WalletSendGrams) : LocaleController.formatSpannable(R.string.WalletSendAmount, l0.k("Grams", format, R.string.Grams_other)), true, true);
        this.c0.setEnabled(z10);
        y0();
        A0();
        if (!this.j0) {
            this.M.setText(j0(w9, k02));
            return;
        }
        org.telegram.ui.Components.q6 q6Var = this.M;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) this.L).append((CharSequence) " ");
        int length = spannableStringBuilder.length();
        if (this.m0 == null) {
            DecimalFormat decimalFormat = new DecimalFormat("#,##0.##", new DecimalFormatSymbols(Locale.US));
            this.m0 = decimalFormat;
            decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
        }
        spannableStringBuilder.append((CharSequence) this.m0.format(BigDecimal.valueOf(k02).movePointLeft(9)));
        u0(spannableStringBuilder, length, spannableStringBuilder.length(), '.');
        spannableStringBuilder.append((CharSequence) " ");
        int length2 = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.GramCurrency));
        spannableStringBuilder.setSpan(new RelativeSizeSpan(0.85714287f), length2, spannableStringBuilder.length(), 33);
        q6Var.setText(spannableStringBuilder.append((CharSequence) " ").append((CharSequence) this.K));
    }

    public final void y0() {
        if (this.Q == null) {
            return;
        }
        l0 w9 = l0.w(this.currentAccount);
        this.Q.setText(LocaleController.formatSpannable(R.string.WalletBalanceAmount, l0.k("Grams", l0.o(w9.u(), false), R.string.Grams_other)));
        boolean z10 = this.V;
        EditTextBoldCursor editTextBoldCursor = this.G;
        this.V = z10 | ((editTextBoldCursor == null || TextUtils.isEmpty(editTextBoldCursor.getText())) ? false : true);
        boolean z11 = (!w9.D() || l0.a(w9.s(), this.f)) && this.V;
        if (z11) {
            long j10 = this.d0;
            if (j10 >= 0) {
                this.S.setText(LocaleController.formatSpannable(R.string.WalletNetworkFeeAmount, l0.r(j10, false)));
            } else {
                this.S.setText(LocaleController.formatSpannable(R.string.WalletNetworkFeeAmount, this.T));
            }
        }
        if (this.U == z11) {
            return;
        }
        this.U = z11;
        ValueAnimator valueAnimator = this.X;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.X = null;
        }
        float f7 = z11 ? 1.0f : 0.0f;
        if (!this.S.isAttachedToWindow()) {
            t0(f7);
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.W, f7);
        this.X = ofFloat;
        ofFloat.setDuration(320L);
        this.X.setInterpolator(bs.h);
        this.X.addUpdateListener(new a3(this, 8));
        this.X.start();
    }

    public final void z0() {
        if (this.x == null || this.N == null) {
            return;
        }
        final boolean z10 = k0() > 0 || this.O.getVisibility() == 0;
        if (z10 == this.k0) {
            return;
        }
        this.k0 = z10;
        this.x.setVisibility(0);
        this.N.setVisibility(0);
        final int i10 = 0;
        ViewPropertyAnimator duration = this.x.animate().alpha(z10 ? 1.0f : 0.0f).scaleX(z10 ? 1.0f : 0.8f).scaleY(z10 ? 1.0f : 0.8f).withEndAction(new Runnable(this) { // from class: org.telegram.ui.Wallet.z8
            public final /* synthetic */ j9 b;

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
                        this.b.N.setVisibility(!z10 ? 0 : 4);
                        break;
                }
            }
        }).setDuration(320L);
        bs bsVar = bs.h;
        duration.setInterpolator(bsVar).start();
        final int i11 = 1;
        this.N.animate().alpha(z10 ? 0.0f : 1.0f).scaleX(!z10 ? 1.0f : 0.8f).scaleY(z10 ? 0.8f : 1.0f).withEndAction(new Runnable(this) { // from class: org.telegram.ui.Wallet.z8
            public final /* synthetic */ j9 b;

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
                        this.b.N.setVisibility(!z10 ? 0 : 4);
                        break;
                }
            }
        }).setDuration(320L).setInterpolator(bsVar).start();
    }

    public j9(String str) {
        this(UserConfig.selectedAccount, str);
    }

    public j9(int i10, String str) {
        this.r = 0L;
        this.I = new s8(this, 0);
        this.J = new ViewTreeObserver.OnWindowFocusChangeListener() { // from class: org.telegram.ui.Wallet.t8
            @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
            public final void onWindowFocusChanged(boolean z10) {
                EditTextBoldCursor editTextBoldCursor;
                j9 j9Var = j9.this;
                Runnable runnable = j9Var.I;
                if (z10 && j9Var.H && (editTextBoldCursor = j9Var.G) != null) {
                    editTextBoldCursor.removeCallbacks(runnable);
                    j9Var.G.post(runnable);
                }
            }
        };
        this.d0 = -1L;
        this.g0 = true;
        this.n0 = 6;
        setCurrentAccount(i10);
        this.e = null;
        this.f = str;
        o0();
        this.n = true;
        l0.w(this.currentAccount).X(str, new u8(this, 0));
    }

    @Override // org.telegram.ui.Components.e71
    public final void U(ArrayList arrayList, b71 b71Var) {
    }

    @Override // org.telegram.ui.Components.e71
    public final void W(m61 m61Var, View view) {
    }
}
