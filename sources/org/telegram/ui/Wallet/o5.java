package org.telegram.ui.Wallet;

import ai.nb;
import ai.pb;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.net.Uri;
import android.os.Build;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.inputmethod.InputMethodInfo;
import android.view.inputmethod.InputMethodManager;
import android.view.inputmethod.InputMethodSubtype;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.nk;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.b10;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.c71;
import org.telegram.ui.Components.ca0;
import org.telegram.ui.Components.d91;
import org.telegram.ui.Components.e91;
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.i80;
import org.telegram.ui.Components.kv;
import org.telegram.ui.Components.l01;
import org.telegram.ui.Components.n11;
import org.telegram.ui.Components.o11;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.ut;
import org.telegram.ui.Components.w61;
import org.telegram.ui.Components.x61;
import org.telegram.ui.Components.x90;
import org.telegram.ui.Components.yq;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PasscodeActivity;
import org.telegram.ui.cf0;
import org.telegram.ui.ib0;
import org.telegram.ui.lc0;
import org.telegram.ui.qa1;
import org.telegram.ui.st0;
import org.telegram.ui.tf1;
import org.telegram.ui.vf1;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes4.dex */
public final class o5 extends x61 implements NotificationCenter.NotificationCenterDelegate {
    public static Typeface T0;
    public ei.d A0;
    public ei.d B0;
    public l0 C0;
    public e0 D0;
    public boolean E;
    public boolean E0;
    public float G0;
    public float H0;
    public ValueAnimator I0;
    public org.telegram.ui.ActionBar.u0 K0;
    public zh.b0 L0;
    public int M0;
    public SpannableString P0;
    public ah.x Q;
    public boolean Q0;
    public x4 R;
    public boolean R0;
    public FrameLayout S;
    public j S0;
    public TextView T;
    public FrameLayout U;
    public TextView V;
    public FrameLayout W;
    public TextView X;
    public x90 Y;
    public y4 Z;
    public boolean a0;
    public FrameLayout b0;
    public FrameLayout c0;
    public b5 d;
    public y4 e;
    public boolean e0;
    public int f;
    public d91 f0;
    public FrameLayout g0;
    public c5 h;
    public n8 h0;
    public t7 i0;
    public float k0;
    public ValueAnimator l0;
    public ai.r m0;
    public int n;
    public boolean n0;
    public ei.h1 o0;
    public k5 p0;
    public boolean r;
    public LinearLayout r0;
    public org.telegram.ui.Components.q6 s0;
    public org.telegram.ui.Components.q6 t0;
    public w5 u0;
    public e5 v0;
    public FrameLayout w;
    public float w0;
    public View x;
    public float x0;
    public ah.v y;
    public qa1 y0;
    public float z0;
    public final org.telegram.ui.Cells.k7 s = new org.telegram.ui.Cells.k7(this, 27);
    public final t3 v = new ut() { // from class: org.telegram.ui.Wallet.t3
        @Override // org.telegram.ui.Components.ut
        public final void a(int i10, boolean z10) {
            w61 w61Var;
            o5 o5Var = o5.this;
            org.telegram.ui.Cells.k7 k7Var = o5Var.s;
            if ((i10 == 1 || i10 == 3) && (w61Var = o5Var.a) != null) {
                o5Var.r = z10;
                w61Var.removeCallbacks(k7Var);
                k7Var.run();
            }
        }
    };
    public final Rect F = new Rect();
    public final Matrix G = new Matrix();
    public final Matrix H = new Matrix();
    public final Matrix I = new Matrix();
    public final float[] J = new float[8];
    public final float[] K = new float[8];
    public final float[] L = new float[8];
    public final int[] M = new int[2];
    public final int[] N = new int[2];
    public final int[] O = new int[2];
    public final int[] P = new int[2];
    public int d0 = 0;
    public String j0 = "";
    public final c71[] q0 = new c71[2];
    public final p3 F0 = new p3(this, 3);
    public final p3 J0 = new p3(this, 4);
    public final CharSequence[] N0 = new CharSequence[2];
    public final HashSet O0 = new HashSet();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v3, types: [org.telegram.ui.Components.e91, org.telegram.ui.Wallet.n4] */
    public static void B0(Context context, int i10, TL_wallet.walletTransaction wallettransaction, Utilities.Callback3 callback3, Utilities.Callback2 callback2, byte[] bArr, org.telegram.ui.Cells.p0 p0Var, org.telegram.ui.ActionBar.d6 d6Var) {
        k2[] k2VarArr;
        View[] viewArr;
        Utilities.Callback2 callback22;
        LinearLayout o02;
        TL_wallet.nftItem nftitem;
        if (context == null) {
            return;
        }
        if ((wallettransaction.peer instanceof TL_wallet.walletTransactionPeerTelegramGift) && (nftitem = wallettransaction.nft) != null) {
            TL_stars.StarGift starGift = nftitem.gift;
            if (starGift instanceof TL_stars.TL_starGiftUnique) {
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) starGift;
                ai.l7 l7Var = new ai.l7(context, i10, 0L, d6Var, null);
                l7Var.i1 = wallettransaction;
                l7Var.K2(tL_starGiftUnique.slug, tL_starGiftUnique, null);
                l7Var.show();
                return;
            }
        }
        k2[] k2VarArr2 = new k2[1];
        View[] viewArr2 = new View[1];
        l0 A = m0.w(i10).A();
        ArrayList arrayList = new ArrayList(A.c);
        int i11 = 0;
        while (true) {
            if (i11 >= arrayList.size()) {
                i11 = -1;
                break;
            } else if (arrayList.get(i11) == wallettransaction || m0.f0(wallettransaction, (TL_wallet.walletTransaction) arrayList.get(i11))) {
                break;
            } else {
                i11++;
            }
        }
        if (callback3 == null && p0Var == null && i11 >= 0) {
            Rect rect = new Rect();
            context.getResources().getDrawable(R.drawable.sheet_shadow_round).getPadding(rect);
            viewArr = viewArr2;
            ?? n4Var = new n4(context, d6Var, A, arrayList, i10, rect, viewArr);
            n4Var.setPosition(i11);
            o4 o4Var = new o4(arrayList, context, d6Var, rect, i10, k2VarArr2);
            k2VarArr = k2VarArr2;
            n4Var.setAdapter(o4Var);
            callback22 = callback2;
            o02 = n4Var;
        } else {
            k2VarArr = k2VarArr2;
            viewArr = viewArr2;
            callback22 = callback2;
            o02 = o0(context, i10, wallettransaction, callback3, callback2, bArr, p0Var, d6Var, k2VarArr, false);
        }
        k2[] k2VarArr3 = k2VarArr;
        p4 p4Var = new p4(context, o02, d6Var, o02, viewArr, context);
        k2VarArr3[0] = p4Var;
        if ((o02 instanceof e91) && callback22 != null) {
            p4Var.setOnDismissListener(new z3(1, callback22, wallettransaction));
        }
        k2VarArr3[0].setFocusable(callback3 != null);
        k2 k2Var = k2VarArr3[0];
        k2Var.useBackgroundTopPadding = false;
        k2Var.show();
    }

    public static void D0(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        int i10 = 1;
        org.telegram.ui.ActionBar.f3 i11 = nk.i(1, context, d6Var, false);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackground(org.telegram.ui.ActionBar.h6.c0(AndroidUtilities.dp(16.0f), org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.h5, d6Var)));
        frameLayout.setPadding(AndroidUtilities.dp(36.0f), 0, AndroidUtilities.dp(36.0f), AndroidUtilities.dp(14.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(1);
        frameLayout.addView(linearLayout, w7.z5.c(-2.0f, -1));
        linearLayout.addView(new m6(160, context, false), w7.z5.t(160, 160, 1, 0, -12, 0, -8));
        TextView textView = new TextView(context);
        textView.setText(LocaleController.getString(R.string.WalletHowItWorks));
        nk.o(org.telegram.ui.ActionBar.h6.j5, d6Var, textView, 1, 17.0f);
        textView.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
        textView.setGravity(17);
        TextView i12 = com.google.android.gms.internal.play_billing.k3.i(linearLayout, textView, w7.z5.t(-1, -2, 1, 0, 0, 0, 6), context);
        i12.setText(LocaleController.getString(R.string.WalletHowItWorksInfo));
        int i13 = org.telegram.ui.ActionBar.h6.z6;
        nk.o(i13, d6Var, i12, 1, 14.0f);
        i12.setGravity(17);
        i12.setLineSpacing(AndroidUtilities.dp(1.0f), 1.0f);
        linearLayout.addView(i12, w7.z5.t(-1, -2, 1, 0, 0, 0, 24));
        g5 g5Var = new g5(context, d6Var);
        g5Var.setPadding(AndroidUtilities.dp(0.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(0.0f), AndroidUtilities.dp(8.0f));
        g5Var.a(LocaleController.getString(R.string.WalletSendInstantly), LocaleController.getString(R.string.WalletSendInstantlyInfo), R.drawable.wallet_learn_instant);
        linearLayout.addView(g5Var, w7.z5.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
        g5 g5Var2 = new g5(context, d6Var);
        g5Var2.setPadding(AndroidUtilities.dp(0.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(0.0f), AndroidUtilities.dp(8.0f));
        g5Var2.a(LocaleController.getString(R.string.WalletNoFees), LocaleController.getString(R.string.WalletNoFeesInfo), R.drawable.wallet_learn_fees);
        linearLayout.addView(g5Var2, w7.z5.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
        g5 g5Var3 = new g5(context, d6Var);
        g5Var3.setPadding(AndroidUtilities.dp(0.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(0.0f), AndroidUtilities.dp(8.0f));
        g5Var3.a(LocaleController.getString(R.string.WalletBlockchainVerified), LocaleController.getString(R.string.WalletBlockchainVerifiedInfo), R.drawable.wallet_learn_verified);
        linearLayout.addView(g5Var3, w7.z5.k(0.0f, 0.0f, 0.0f, 14.0f, -1, -2));
        ei.d f7 = nk.f(24, context, d6Var, true);
        f7.setText(LocaleController.getString(R.string.WalletGotIt));
        linearLayout.addView(f7, w7.z5.t(-1, 48, 1, 0, 0, 0, 0));
        w7.b6.b(f7, 0.02f, 1.1f);
        x90 x90Var = new x90(context, null);
        x90Var.setTextColor(org.telegram.ui.ActionBar.h6.w0(i13, d6Var));
        x90Var.setTextSize(1, 13.0f);
        x90Var.setGravity(17);
        x90Var.setText(AndroidUtilities.replaceSingleLink(LocaleController.getString(R.string.WalletTermsOfService), org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.gc, d6Var), new q3(context, i10)));
        linearLayout.addView(x90Var, w7.z5.k(0.0f, 12.0f, 0.0f, 6.0f, -1, -2));
        i11.customView = frameLayout;
        org.telegram.ui.ActionBar.f3[] f3VarArr = {i11};
        f3VarArr[0].setAllowNestedScroll(true);
        f3VarArr[0].fixNavigationBar();
        f7.setOnClickListener(new x3(f3VarArr, i10));
        f3VarArr[0].show();
    }

    public static void E0(Context context, int i10, org.telegram.ui.ActionBar.d6 d6Var) {
        m0 w9 = m0.w(i10);
        if (w9.E()) {
            String s10 = w9.s();
            if (TextUtils.isEmpty(s10)) {
                return;
            }
            org.telegram.ui.ActionBar.f3 f3Var = new org.telegram.ui.ActionBar.f3(1, context, d6Var, false);
            f3Var.setBackgroundColor(-12207881);
            f3Var.fixNavigationBar(-12207881);
            FrameLayout frameLayout = new FrameLayout(context);
            frameLayout.setBackground(new n5());
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            linearLayout.setGravity(1);
            frameLayout.addView(linearLayout, w7.z5.f(-2.0f, 55, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(30.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f) + AndroidUtilities.navigationBarHeight));
            m5 m5Var = new m5(context, s10);
            linearLayout.addView(m5Var, w7.z5.q(288, 302, 1));
            TextView textView = new TextView(context);
            textView.setText(LocaleController.getString(R.string.WalletReceiveInfo));
            textView.setTextColor(-1);
            textView.setTextSize(1, 14.0f);
            textView.setGravity(17);
            textView.setLineSpacing(AndroidUtilities.dp(1.0f), 1.0f);
            linearLayout.addView(textView, w7.z5.t(-1, -2, 1, 24, 0, 24, 20));
            ei.d dVar = new ei.d(context, null, true);
            dVar.setRoundRadius(24);
            dVar.setColor(-1);
            dVar.setTextColor(-15556886);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) "$");
            spannableStringBuilder.setSpan(new yq(R.drawable.wallet_buy, 0), 0, spannableStringBuilder.length(), 33);
            spannableStringBuilder.append((CharSequence) " ").append((CharSequence) LocaleController.getString(R.string.WalletBuyWithCashOrCrypto));
            dVar.setText(spannableStringBuilder);
            linearLayout.addView(dVar, w7.z5.t(-1, 48, 1, 0, 0, 0, 0));
            ImageView imageView = new ImageView(context);
            imageView.setImageResource(R.drawable.ic_close_white);
            imageView.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f));
            imageView.setContentDescription(LocaleController.getString(R.string.Close));
            w7.b6.a(imageView);
            frameLayout.addView(imageView, w7.z5.d(48, 48.0f, 51, 4.0f, 2.0f, 0.0f, 0.0f));
            f3Var.customView = frameLayout;
            f3Var.occupyNavigationBar = true;
            f3Var.setApplyTopPadding(false);
            f3Var.setApplyBottomPadding(false);
            f3Var.fixNavigationBar(-12207881);
            imageView.setOnClickListener(new o3(f3Var, 0));
            m5Var.e = new r0(s10, 1);
            f3Var.show();
            f3Var.setOverlayNavBarColor(-12207881);
            AndroidUtilities.setNavigationBarColor((Dialog) f3Var, -12207881, false);
            AndroidUtilities.setLightNavigationBar((Dialog) f3Var, false);
            if (Build.VERSION.SDK_INT >= 29 && f3Var.getWindow() != null) {
                f3Var.getWindow().setNavigationBarContrastEnforced(false);
            }
            dVar.setOnClickListener(new ci.d6(dVar, i10, f3Var, d6Var, 7));
        }
    }

    public static void S0(c71 c71Var, boolean z10) {
        boolean canScrollVertically = c71Var.canScrollVertically(-1);
        c71Var.W2.N(z10);
        c71Var.a0();
        if (canScrollVertically) {
            return;
        }
        c71Var.V2.h1(0, 0);
    }

    public static Uri V0(String str) {
        Uri parse = Uri.parse(str.trim());
        if (parse.getScheme() == null) {
            Uri parse2 = Uri.parse("https://" + str.trim());
            if (w0(parse2.getHost())) {
                return parse2;
            }
        }
        return parse;
    }

    public static String W0(Uri uri) {
        if (!w0(uri.getHost())) {
            return null;
        }
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments.size() != 1) {
            return null;
        }
        String str = pathSegments.get(0);
        if ("sendgrams".equalsIgnoreCase(str) || !str.matches("[a-zA-Z][a-zA-Z0-9_]{3,31}")) {
            return null;
        }
        return str;
    }

    public static void Y(o5 o5Var) {
        m0 w9 = m0.w(o5Var.currentAccount);
        ei.d dVar = o5Var.B0;
        if (dVar.N) {
            return;
        }
        dVar.setLoading(true);
        boolean z10 = false;
        w9.j0(new e2.o0(w9, new x(6, o5Var, w9), z10, z10, 3));
    }

    public static void Z(o5 o5Var) {
        pf.d.r(o5Var.getParentActivity(), m0.w(o5Var.currentAccount).j);
    }

    public static void a0(o5 o5Var) {
        E0(o5Var.getParentActivity(), o5Var.currentAccount, o5Var.getResourceProvider());
    }

    public static void b0(o5 o5Var, String str, m0 m0Var, i80 i80Var, LinearLayout linearLayout, TL_wallet.currencyRate currencyrate) {
        if (currencyrate == null) {
            return;
        }
        org.telegram.ui.ActionBar.e1 e1Var = new org.telegram.ui.ActionBar.e1(2, o5Var.getParentActivity(), o5Var.resourceProvider, false, false);
        e1Var.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
        e1Var.setText(currencyrate.currency);
        e1Var.setSubtext(!TextUtils.isEmpty(currencyrate.translatedTitle) ? currencyrate.translatedTitle : currencyrate.title);
        boolean equals = TextUtils.equals(str, currencyrate.currency);
        e1Var.b.setPadding(0, 0, AndroidUtilities.dp(equals ? 42.0f : 0.0f), 0);
        e1Var.setChecked(equals);
        e1Var.setOnClickListener(new n1(m0Var, currencyrate, i80Var, 2));
        linearLayout.addView(e1Var, w7.z5.n(200, -2));
    }

    public static void c0(o5 o5Var) {
        org.telegram.ui.ActionBar.k kVar;
        if (o5Var.y == null || (kVar = o5Var.actionBar) == null || !(kVar.getParent() instanceof ViewGroup)) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) o5Var.actionBar.getParent();
        viewGroup.setClipChildren(false);
        viewGroup.setClipToPadding(false);
        if (o5Var.y.getParent() != o5Var.actionBar) {
            AndroidUtilities.removeFromParent(o5Var.y);
            o5Var.actionBar.addView(o5Var.y, w7.z5.c(-1.0f, -1));
        }
        o5Var.y.bringToFront();
        o5Var.actionBar.bringToFront();
        o5Var.y.post(new p3(o5Var, 10));
    }

    public static void d0(o5 o5Var) {
        E0(o5Var.getParentActivity(), o5Var.currentAccount, o5Var.getResourceProvider());
    }

    public static void e0(o5 o5Var, String str) {
        Uri V0 = V0(str);
        String W0 = W0(V0);
        if (W0 != null) {
            int i10 = o5Var.currentAccount;
            MessagesController.getInstance(i10).getUserNameResolver().resolve(W0, new ei.e4(i10, new w3(o5Var, 4)));
        } else {
            if ((o5Var.getParentActivity() instanceof LaunchActivity) && new ib0((LaunchActivity) o5Var.getParentActivity(), o5Var.currentAccount, null, false).g(V0)) {
                return;
            }
            AndroidUtilities.runOnUIThread(new p3(o5Var, 11));
        }
    }

    public static void f0(o5 o5Var, LinearLayout linearLayout, m0 m0Var, i80 i80Var) {
        TL_wallet.currencyRate currencyrate;
        o5 o5Var2;
        ArrayList<TL_wallet.currencyRate> arrayList;
        LinearLayout linearLayout2 = linearLayout;
        m0 m0Var2 = m0Var;
        linearLayout2.removeAllViews();
        String g10 = m0Var2.h.g();
        TL_wallet.currencyRates f7 = m0Var2.h.f();
        if (f7 == null) {
            for (int i10 = 0; i10 < 3; i10++) {
                b10 b10Var = new b10(o5Var.getParentActivity(), o5Var.getResourceProvider());
                b10Var.setIsSingleCell(true);
                b10Var.setViewType(31);
                linearLayout2.addView(b10Var, w7.z5.n(200, -2));
            }
            return;
        }
        f fVar = m0Var2.h;
        fVar.getClass();
        ArrayList arrayList2 = new ArrayList();
        TL_wallet.currencyRates f10 = fVar.f();
        TL_wallet.currencyRate currencyrate2 = null;
        if (f10 == null || (arrayList = f10.rates) == null) {
            currencyrate = null;
        } else {
            int size = arrayList.size();
            currencyrate = null;
            int i11 = 0;
            while (i11 < size) {
                TL_wallet.currencyRate currencyrate3 = arrayList.get(i11);
                i11++;
                TL_wallet.currencyRate currencyrate4 = currencyrate3;
                if (currencyrate4 != null && TextUtils.equals(currencyrate4.currency, "USD")) {
                    currencyrate2 = currencyrate4;
                } else if (currencyrate4 != null && TextUtils.equals(currencyrate4.currency, "EUR")) {
                    currencyrate = currencyrate4;
                }
            }
        }
        if (currencyrate2 == null) {
            currencyrate2 = f.e();
        }
        arrayList2.add(currencyrate2);
        if (currencyrate != null) {
            arrayList2.add(currencyrate);
        }
        if (f10 != null && f10.rates != null) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            linkedHashSet.add(fVar.g());
            try {
                InputMethodManager inputMethodManager = (InputMethodManager) ApplicationLoader.applicationContext.getSystemService("input_method");
                if (inputMethodManager != null) {
                    f.b(linkedHashSet, inputMethodManager.getCurrentInputMethodSubtype());
                    Iterator<InputMethodInfo> it = inputMethodManager.getEnabledInputMethodList().iterator();
                    while (it.hasNext()) {
                        Iterator<InputMethodSubtype> it2 = inputMethodManager.getEnabledInputMethodSubtypeList(it.next(), true).iterator();
                        while (it2.hasNext()) {
                            f.b(linkedHashSet, it2.next());
                        }
                    }
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
            f.a(linkedHashSet, MessagesController.getInstance(fVar.a).config.phoneCountryIso2.get());
            f.c(linkedHashSet, LocaleController.getInstance().getCurrentLocale());
            f.c(linkedHashSet, LocaleController.getInstance().getSystemDefaultLocale());
            Iterator it3 = linkedHashSet.iterator();
            while (it3.hasNext()) {
                String str = (String) it3.next();
                if (!TextUtils.equals(str, "USD") && !TextUtils.equals(str, "EUR")) {
                    ArrayList<TL_wallet.currencyRate> arrayList3 = f10.rates;
                    int size2 = arrayList3.size();
                    int i12 = 0;
                    while (true) {
                        if (i12 < size2) {
                            TL_wallet.currencyRate currencyrate5 = arrayList3.get(i12);
                            i12++;
                            TL_wallet.currencyRate currencyrate6 = currencyrate5;
                            if (currencyrate6 != null && TextUtils.equals(currencyrate6.currency, str)) {
                                arrayList2.add(currencyrate6);
                                break;
                            }
                        }
                    }
                }
            }
        }
        HashSet hashSet = new HashSet();
        int i13 = 0;
        while (i13 < arrayList2.size()) {
            TL_wallet.currencyRate currencyrate7 = (TL_wallet.currencyRate) arrayList2.get(i13);
            if (currencyrate7 != null && hashSet.add(currencyrate7.currency)) {
                b0(o5Var, g10, m0Var2, i80Var, linearLayout2, currencyrate7);
            }
            i13++;
            m0Var2 = m0Var;
        }
        if (hashSet.isEmpty() || f7.rates.isEmpty()) {
            o5Var2 = o5Var;
        } else {
            o5Var2 = o5Var;
            linearLayout2.addView(new org.telegram.ui.ActionBar.j1(o5Var.getParentActivity(), o5Var2.resourceProvider), w7.z5.n(-1, 8));
        }
        int i14 = 0;
        while (i14 < f7.rates.size()) {
            TL_wallet.currencyRate currencyrate8 = f7.rates.get(i14);
            if (currencyrate8 != null && !hashSet.contains(currencyrate8.currency)) {
                b0(o5Var2, g10, m0Var, i80Var, linearLayout2, currencyrate8);
            }
            i14++;
            o5Var2 = o5Var;
            linearLayout2 = linearLayout;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void g0(final o5 o5Var, Context context, View view) {
        m0 w9 = m0.w(o5Var.currentAccount);
        final i80 I = i80.I(o5Var, view);
        I.a0(0.0f, -AndroidUtilities.dp(48.0f));
        final int i10 = 0;
        I.s = 0;
        I.V(5);
        i80 J = I.J();
        J.c(R.drawable.ic_ab_back, LocaleController.getString(R.string.WalletBack), new st0(I, 26), false);
        J.k();
        ScrollView scrollView = new ScrollView(context);
        LinearLayout linearLayout = new LinearLayout(context);
        final int i11 = 1;
        linearLayout.setOrientation(1);
        scrollView.addView(linearLayout);
        w6 w6Var = new w6(o5Var, linearLayout, w9, I, 10);
        J.r(scrollView, w7.z5.n(-1, 350));
        I.c(R.drawable.wallet_globe, LocaleController.getString(R.string.WalletCurrency), new h(w6Var, I, J, 8), false);
        org.telegram.ui.ActionBar.e1 y3 = I.y();
        f fVar = w9.h;
        String i12 = fVar.i();
        boolean isEmpty = TextUtils.isEmpty(i12);
        String str = i12;
        if (isEmpty) {
            y3.setSubtext("USD");
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.Loading));
            spannableStringBuilder.setSpan(new ca0(AndroidUtilities.dp(75.0f), y3.b), 0, spannableStringBuilder.length(), 33);
            str = spannableStringBuilder;
        }
        y3.setSubtext(str);
        w6 w6Var2 = new w6(w9, new boolean[]{fVar.f() != null}, y3, w6Var, 11);
        o5Var.O0.add(w6Var2);
        w6Var.run();
        I.c(R.drawable.wallet_lock, LocaleController.getString(R.string.Passcode), new Runnable(o5Var) { // from class: org.telegram.ui.Wallet.c4
            public final /* synthetic */ o5 b;

            {
                this.b = o5Var;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i10) {
                    case 0:
                        o5 o5Var2 = this.b;
                        o5Var2.getClass();
                        I.u();
                        o5Var2.presentFragment(PasscodeActivity.e0());
                        break;
                    case 1:
                        o5 o5Var3 = this.b;
                        o5Var3.getClass();
                        I.u();
                        o5Var3.presentFragment(new h8());
                        break;
                    case 2:
                        o5 o5Var4 = this.b;
                        o5Var4.getClass();
                        I.u();
                        o5Var4.presentFragment(new ca());
                        break;
                    default:
                        I.u();
                        o5 o5Var5 = this.b;
                        o5.D0(o5Var5.getParentActivity(), o5Var5.getResourceProvider());
                        break;
                }
            }
        }, false);
        I.c(R.drawable.wallet_key, LocaleController.getString(R.string.WalletKeysAndBackup), new Runnable(o5Var) { // from class: org.telegram.ui.Wallet.c4
            public final /* synthetic */ o5 b;

            {
                this.b = o5Var;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i11) {
                    case 0:
                        o5 o5Var2 = this.b;
                        o5Var2.getClass();
                        I.u();
                        o5Var2.presentFragment(PasscodeActivity.e0());
                        break;
                    case 1:
                        o5 o5Var3 = this.b;
                        o5Var3.getClass();
                        I.u();
                        o5Var3.presentFragment(new h8());
                        break;
                    case 2:
                        o5 o5Var4 = this.b;
                        o5Var4.getClass();
                        I.u();
                        o5Var4.presentFragment(new ca());
                        break;
                    default:
                        I.u();
                        o5 o5Var5 = this.b;
                        o5.D0(o5Var5.getParentActivity(), o5Var5.getResourceProvider());
                        break;
                }
            }
        }, false);
        final int i13 = 2;
        I.l(R.drawable.wallet_apps, LocaleController.getString(R.string.WalletConnectedApps), new Runnable(o5Var) { // from class: org.telegram.ui.Wallet.c4
            public final /* synthetic */ o5 b;

            {
                this.b = o5Var;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i13) {
                    case 0:
                        o5 o5Var2 = this.b;
                        o5Var2.getClass();
                        I.u();
                        o5Var2.presentFragment(PasscodeActivity.e0());
                        break;
                    case 1:
                        o5 o5Var3 = this.b;
                        o5Var3.getClass();
                        I.u();
                        o5Var3.presentFragment(new h8());
                        break;
                    case 2:
                        o5 o5Var4 = this.b;
                        o5Var4.getClass();
                        I.u();
                        o5Var4.presentFragment(new ca());
                        break;
                    default:
                        I.u();
                        o5 o5Var5 = this.b;
                        o5.D0(o5Var5.getParentActivity(), o5Var5.getResourceProvider());
                        break;
                }
            }
        }, true ^ w9.g.d.isEmpty());
        I.k();
        final int i14 = 3;
        I.c(R.drawable.wallet_help, LocaleController.getString(R.string.WalletWhatIsWallet), new Runnable(o5Var) { // from class: org.telegram.ui.Wallet.c4
            public final /* synthetic */ o5 b;

            {
                this.b = o5Var;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i14) {
                    case 0:
                        o5 o5Var2 = this.b;
                        o5Var2.getClass();
                        I.u();
                        o5Var2.presentFragment(PasscodeActivity.e0());
                        break;
                    case 1:
                        o5 o5Var3 = this.b;
                        o5Var3.getClass();
                        I.u();
                        o5Var3.presentFragment(new h8());
                        break;
                    case 2:
                        o5 o5Var4 = this.b;
                        o5Var4.getClass();
                        I.u();
                        o5Var4.presentFragment(new ca());
                        break;
                    default:
                        I.u();
                        o5 o5Var5 = this.b;
                        o5.D0(o5Var5.getParentActivity(), o5Var5.getResourceProvider());
                        break;
                }
            }
        }, false);
        I.p = new z3(i14, o5Var, w6Var2);
        I.Z();
    }

    public static void h0(o5 o5Var, long j10) {
        p3 p3Var = o5Var.J0;
        if (o5Var.a == null) {
            return;
        }
        n8 n8Var = o5Var.h0;
        if (n8Var != null) {
            n8Var.a();
        }
        if (o5Var.H0 <= 0.0f && o5Var.v0()) {
            int top = o5Var.a.V2.m(o5Var.f).getTop() - o5Var.a.getPaddingTop();
            o5Var.a.B0();
            if (top < 0) {
                o5Var.a.v0(0, top, bs.h);
                return;
            }
            return;
        }
        o5Var.a.B0();
        o5Var.n0(true);
        AndroidUtilities.cancelRunOnUIThread(p3Var);
        if (j10 > 0) {
            AndroidUtilities.runOnUIThread(p3Var, j10 + 260);
        }
    }

    public static Typeface m0(Context context) {
        if (T0 == null) {
            if (Build.VERSION.SDK_INT >= 26) {
                T0 = new Typeface.Builder(context.getAssets(), "fonts/rmono_var.ttf").setFontVariationSettings("'wght' 500").setWeight(500).build();
            } else {
                T0 = AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MONO);
            }
        }
        return T0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0570  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x03c6  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x03f8 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x040a  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x05d4  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x065c  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x06a7  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0642  */
    /* JADX WARN: Type inference failed for: r10v12, types: [android.view.View, android.view.ViewGroup, android.widget.FrameLayout] */
    /* JADX WARN: Type inference failed for: r13v6, types: [boolean] */
    /* JADX WARN: Type inference failed for: r15v16, types: [android.view.View, android.widget.TextView, org.telegram.ui.Components.EditTextBoldCursor, org.telegram.ui.Components.ku, org.telegram.ui.Wallet.r4] */
    /* JADX WARN: Type inference failed for: r2v1, types: [android.view.View, android.view.ViewGroup, android.widget.LinearLayout] */
    /* JADX WARN: Type inference failed for: r2v17, types: [org.telegram.ui.Wallet.r4] */
    /* JADX WARN: Type inference failed for: r5v0, types: [android.view.ViewGroup, android.widget.LinearLayout] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static LinearLayout o0(final Context context, int i10, TL_wallet.walletTransaction wallettransaction, Utilities.Callback3 callback3, Utilities.Callback2 callback2, byte[] bArr, Runnable runnable, org.telegram.ui.ActionBar.d6 d6Var, k2[] k2VarArr, boolean z10) {
        q4 q4Var;
        String s10;
        String str;
        int i11;
        ImageView imageView;
        TextView textView;
        q4 q4Var2;
        int i12;
        float f7;
        ImageView imageView2;
        ImageView imageView3;
        t4 t4Var;
        SpannableString[] spannableStringArr;
        l01 l01Var;
        LinearLayout linearLayout;
        String[] strArr;
        TL_wallet.walletTransaction wallettransaction2;
        boolean[] zArr;
        int i13;
        TextView[] textViewArr;
        t4 t4Var2;
        int i14;
        t4 t4Var3;
        final k2[] k2VarArr2;
        Object r10;
        int i15;
        final FrameLayout frameLayout;
        t4 t4Var4;
        final org.telegram.ui.ActionBar.d6 d6Var2 = d6Var;
        boolean z11 = callback3 != null;
        final ?? e = nk.e(context, 1);
        FrameLayout frameLayout2 = new FrameLayout(context);
        e.addView(frameLayout2, w7.z5.n(-1, 56));
        int i16 = org.telegram.ui.ActionBar.h6.G6;
        int w02 = org.telegram.ui.ActionBar.h6.w0(i16, d6Var2);
        int w03 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.i6, d6Var2);
        ImageView imageView4 = new ImageView(context);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView4.setScaleType(scaleType);
        imageView4.setImageResource(R.drawable.ic_ab_close);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView4.setColorFilter(new PorterDuffColorFilter(w02, mode));
        imageView4.setBackground(org.telegram.ui.ActionBar.h6.g0(w03, 1, -1));
        imageView4.setContentDescription(LocaleController.getString(R.string.Close));
        frameLayout2.addView(imageView4, w7.z5.d(48, 48.0f, 19, 4.0f, -2.0f, 0.0f, 0.0f));
        ImageView imageView5 = new ImageView(context);
        imageView5.setScaleType(scaleType);
        imageView5.setImageResource(R.drawable.ic_ab_other);
        imageView5.setColorFilter(new PorterDuffColorFilter(w02, mode));
        imageView5.setBackground(org.telegram.ui.ActionBar.h6.g0(w03, 1, -1));
        imageView5.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        imageView5.setVisibility(callback3 != null ? 8 : 0);
        frameLayout2.addView(imageView5, w7.z5.d(44, 48.0f, 21, 0.0f, 2.0f, 4.0f, 0.0f));
        ?? linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        linearLayout2.setGravity(1);
        e.addView(linearLayout2, w7.z5.k(14.0f, wallettransaction.key_change ? -20.0f : -40.0f, 14.0f, 24.0f, -1, -2));
        m6 m6Var = new m6(120, context, z10);
        m6Var.setTag(m6.class);
        linearLayout2.addView(m6Var, w7.z5.t(120, 120, 1, 0, 0, 0, -8));
        q4 q4Var3 = new q4(context);
        q4Var3.setSingleLine(true);
        q4Var3.setGravity(17);
        q4Var3.setIncludeFontPadding(false);
        q4Var3.setTextSize(1, 40.0f);
        q4Var3.setTypeface(AndroidUtilities.bold());
        linearLayout2.addView(q4Var3, w7.z5.q(-1, 50, 1));
        TextView textView2 = new TextView(context);
        textView2.setGravity(17);
        textView2.setIncludeFontPadding(false);
        textView2.setTextSize(1, 14.0f);
        int i17 = org.telegram.ui.ActionBar.h6.z6;
        textView2.setTextColor(org.telegram.ui.ActionBar.h6.w0(i17, d6Var2));
        linearLayout2.addView(textView2, w7.z5.t(-1, 20, 1, 0, 3, 0, 0));
        if (wallettransaction.key_change) {
            linearLayout2.removeAllViews();
            FrameLayout frameLayout3 = new FrameLayout(context);
            frameLayout3.setBackground(org.telegram.ui.ActionBar.h6.L(AndroidUtilities.dp(76.0f), -7956054, -9534569));
            ImageView imageView6 = new ImageView(context);
            imageView6.setImageResource(R.drawable.wallet_transaction_key);
            imageView6.setScaleType(ImageView.ScaleType.FIT_CENTER);
            frameLayout3.addView(imageView6, w7.z5.e(44, 44, 17));
            linearLayout2.addView(frameLayout3, w7.z5.q(76, 76, 1));
            TextView textView3 = new TextView(context);
            textView3.setText(LocaleController.getString(R.string.WalletKeyUpdate));
            textView3.setTextColor(w02);
            textView3.setTextSize(1, 18.0f);
            textView3.setTypeface(AndroidUtilities.bold());
            textView3.setGravity(17);
            textView3.setIncludeFontPadding(false);
            linearLayout2.addView(textView3, w7.z5.t(-1, 24, 1, 12, 12, 12, 0));
        } else if (wallettransaction.nft != null) {
            linearLayout2.removeAllViews();
            TL_wallet.nftItem nftitem = wallettransaction.nft;
            org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(context);
            w9Var.setRoundRadius(AndroidUtilities.dp(12.0f));
            w9Var.setContentDescription(nftitem.name);
            q4Var = q4Var3;
            Drawable mutate = context.getResources().getDrawable(R.drawable.wallet_nft_placeholder).mutate();
            mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(i17, d6Var2), mode));
            ImageLocation c10 = c.c(nftitem, false);
            if (c10 != null) {
                w9Var.h(c10, "120_120", mutate, nftitem);
            } else {
                w9Var.setImageDrawable(mutate);
            }
            linearLayout2.addView(w9Var, w7.z5.q(120, 120, 1));
            TextView textView4 = new TextView(context);
            textView4.setText(TextUtils.isEmpty(nftitem.name) ? LocaleController.getString(R.string.WalletCollectible) : nftitem.name);
            textView4.setTextColor(w02);
            textView4.setTextSize(1, 17.0f);
            textView4.setTypeface(AndroidUtilities.bold());
            textView4.setGravity(17);
            linearLayout2.addView(textView4, w7.z5.k(12.0f, 16.0f, 12.0f, 0.0f, -1, -2));
            t4 t4Var5 = null;
            if (wallettransaction.incoming) {
                s10 = m0.w(i10).s();
            } else {
                TL_wallet.WalletTransactionPeer walletTransactionPeer = wallettransaction.peer;
                if (walletTransactionPeer == null) {
                    str = null;
                    if (callback3 == null) {
                        f7 = 11.0f;
                        if (wallettransaction.comment_encrypted || wallettransaction.comment_encrypted_preparing) {
                            if (wallettransaction.comment_encrypted_preparing || !TextUtils.isEmpty(str)) {
                                wh.n nVar = new wh.n(context, d6Var2, false);
                                nVar.r = false;
                                nVar.setTextSize(1, 15.0f);
                                nVar.setTextColor(org.telegram.ui.ActionBar.h6.w0(i16, d6Var2));
                                StringBuilder sb2 = new StringBuilder(25);
                                int i18 = 0;
                                for (int i19 = 25; i18 < i19; i19 = 25) {
                                    sb2.append("a");
                                    i18++;
                                }
                                SpannableString spannableString = new SpannableString(sb2.toString());
                                n11 n11Var = new n11();
                                n11Var.a |= 256;
                                spannableString.setSpan(new o11(n11Var, 0), 0, spannableString.length(), 33);
                                nVar.setText(spannableString);
                                t4Var5 = null;
                                org.telegram.ui.ActionBar.f5 f5Var = new org.telegram.ui.ActionBar.f5(0, false, false, null);
                                f5Var.x = false;
                                f5Var.w = Integer.valueOf(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.jl, d6Var2));
                                nVar.setBackground(f5Var);
                                nVar.setPadding(AndroidUtilities.dp(19.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(15.0f), AndroidUtilities.dp(11.0f));
                                linearLayout2.addView(nVar, w7.z5.t(-2, -2, 1, 32, 15, 32, 0));
                                w7.b6.a(nVar);
                                i12 = 1;
                                i11 = w02;
                                textView = textView2;
                                q4Var2 = q4Var;
                                imageView2 = imageView5;
                                imageView = imageView4;
                                nVar.setOnClickListener(new pb(new boolean[]{false}, k2VarArr, d6Var2, nVar, wallettransaction, i10, str));
                                SpannableString[] spannableStringArr2 = new SpannableString[i12];
                                TextView[] textViewArr2 = new TextView[i12];
                                l01 l01Var2 = new l01(context, d6Var2);
                                e.addView(l01Var2, w7.z5.k(14.0f, 0.0f, 14.0f, 0.0f, -1, -2));
                                final String[] strArr2 = {wallettransaction.comment};
                                final boolean[] zArr2 = {(wallettransaction.comment_encrypted || (z11 && bArr == null)) ? false : true};
                                if (callback3 == null) {
                                    ?? frameLayout4 = new FrameLayout(context);
                                    frameLayout4.setBackground(org.telegram.ui.ActionBar.h6.d0(AndroidUtilities.dp(22.0f), AndroidUtilities.dp(22.0f), org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.a7, d6Var2)));
                                    final z3 z3Var = new z3(0, textViewArr2, spannableStringArr2);
                                    final Runnable[] runnableArr = new Runnable[1];
                                    ImageView imageView7 = imageView;
                                    final org.telegram.messenger.b6 b6Var = new org.telegram.messenger.b6(runnableArr, textViewArr2, i10, d6Var2, wallettransaction, strArr2, zArr2, bArr);
                                    wallettransaction2 = wallettransaction;
                                    textViewArr = textViewArr2;
                                    ?? r4Var = new r4(context, d6Var2);
                                    r4Var.setHint(LocaleController.getString(R.string.WalletOptionalComment));
                                    r4Var.setText(strArr2[0]);
                                    spannableStringArr = spannableStringArr2;
                                    l01Var = l01Var2;
                                    r4Var.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(f7), AndroidUtilities.dp(64.0f), AndroidUtilities.dp(12.0f));
                                    int i20 = org.telegram.ui.ActionBar.h6.G6;
                                    r4Var.setTextColor(org.telegram.ui.ActionBar.h6.w0(i20, d6Var2));
                                    r4Var.setHintTextColor(org.telegram.ui.ActionBar.h6.m1(0.65f, org.telegram.ui.ActionBar.h6.w0(i20, d6Var2)));
                                    r4Var.setMaxLines(4);
                                    frameLayout4.addView(r4Var, w7.z5.d(-1, -2.0f, 119, 0.0f, 0.0f, (wallettransaction2.nft != null || bArr == null) ? 0.0f : 44.0f, 0.0f));
                                    r4Var.addTextChangedListener(new s4(strArr2, z3Var, runnableArr, b6Var));
                                    if (wallettransaction2.nft != null || bArr == null) {
                                        frameLayout = frameLayout4;
                                        d6Var2 = d6Var2;
                                        linearLayout = e;
                                        strArr = strArr2;
                                        zArr = zArr2;
                                        t4Var4 = r4Var;
                                        imageView3 = imageView7;
                                        t4Var = null;
                                        i13 = 0;
                                    } else {
                                        FrameLayout frameLayout5 = new FrameLayout(context);
                                        w7.b6.a(frameLayout5);
                                        final ImageView imageView8 = new ImageView(context);
                                        frameLayout5.addView(imageView8, w7.z5.c(-1.0f, -1));
                                        imageView8.setScaleType(ImageView.ScaleType.CENTER);
                                        i13 = 0;
                                        imageView8.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(zArr2[0] ? org.telegram.ui.ActionBar.h6.Oh : org.telegram.ui.ActionBar.h6.z6, d6Var2), PorterDuff.Mode.SRC_IN));
                                        imageView8.setImageResource(zArr2[0] ? R.drawable.wallet_comment_locked : R.drawable.wallet_comment_unlocked);
                                        imageView8.setBackground(org.telegram.ui.ActionBar.h6.g0(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.i6, d6Var2), 1, -1));
                                        final ei.x3[] x3VarArr = new ei.x3[1];
                                        frameLayout = frameLayout4;
                                        d6Var2 = d6Var2;
                                        t4Var4 = r4Var;
                                        imageView3 = imageView7;
                                        t4Var = null;
                                        zArr = zArr2;
                                        linearLayout = e;
                                        strArr = strArr2;
                                        frameLayout5.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Wallet.a4
                                            @Override // android.view.View.OnClickListener
                                            public final void onClick(View view) {
                                                final boolean[] zArr3 = zArr2;
                                                zArr3[0] = !zArr3[0];
                                                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
                                                final AtomicBoolean atomicBoolean = new AtomicBoolean();
                                                final ImageView imageView9 = imageView8;
                                                final org.telegram.ui.ActionBar.d6 d6Var3 = d6Var2;
                                                duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Wallet.f4
                                                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                                                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                                        float abs = ((Math.abs(floatValue - 0.5f) / 0.5f) * 0.25f) + 0.75f;
                                                        ImageView imageView10 = imageView9;
                                                        imageView10.setScaleX(abs);
                                                        imageView10.setScaleY(abs);
                                                        if (floatValue >= 0.5f) {
                                                            AtomicBoolean atomicBoolean2 = atomicBoolean;
                                                            if (atomicBoolean2.get()) {
                                                                return;
                                                            }
                                                            atomicBoolean2.set(true);
                                                            boolean[] zArr4 = zArr3;
                                                            imageView10.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(zArr4[0] ? org.telegram.ui.ActionBar.h6.Oh : org.telegram.ui.ActionBar.h6.z6, d6Var3), PorterDuff.Mode.SRC_IN));
                                                            imageView10.setImageResource(zArr4[0] ? R.drawable.wallet_comment_locked : R.drawable.wallet_comment_unlocked);
                                                        }
                                                    }
                                                });
                                                duration.setInterpolator(bs.h);
                                                duration.setDuration(420L);
                                                duration.start();
                                                ei.x3[] x3VarArr2 = x3VarArr;
                                                ei.x3 x3Var = x3VarArr2[0];
                                                if (x3Var != null) {
                                                    x3Var.e(true);
                                                    x3VarArr2[0] = null;
                                                }
                                                LinearLayout linearLayout3 = e;
                                                if (linearLayout3.getParent() instanceof FrameLayout) {
                                                    FrameLayout frameLayout6 = (FrameLayout) linearLayout3.getParent();
                                                    ei.x3 x3Var2 = new ei.x3(context, 3);
                                                    x3VarArr2[0] = x3Var2;
                                                    x3Var2.r();
                                                    x3Var2.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
                                                    x3Var2.s(LocaleController.getString(zArr3[0] ? R.string.WalletPrivateCommentInfo : R.string.WalletPublicCommentInfo));
                                                    x3Var2.setTranslationY(-(AndroidUtilities.dp(44.0f) + (linearLayout3.getHeight() - frameLayout.getBottom())));
                                                    x3Var2.m(1.0f, -AndroidUtilities.dp(26.0f));
                                                    x3Var2.q(20.0f);
                                                    float dp = AndroidUtilities.dp(12.0f);
                                                    float dp2 = AndroidUtilities.dp(4.0f);
                                                    int m12 = org.telegram.ui.ActionBar.h6.m1(0.25f, -16777216);
                                                    x3Var2.i0 = dp;
                                                    x3Var2.j0 = dp2;
                                                    x3Var2.k0 = m12;
                                                    x3Var2.F.setShadowLayer(dp, 0.0f, dp2, m12);
                                                    frameLayout6.addView(x3Var2, w7.z5.e(-1, 200, 87));
                                                    x3Var2.u();
                                                    x3Var2.l0 = new n(x3Var2, 7);
                                                }
                                                if (TextUtils.isEmpty(strArr2[0])) {
                                                    return;
                                                }
                                                z3Var.run();
                                                Runnable[] runnableArr2 = runnableArr;
                                                Runnable runnable2 = runnableArr2[0];
                                                if (runnable2 != null) {
                                                    runnable2.run();
                                                    runnableArr2[0] = null;
                                                }
                                                org.telegram.messenger.b6 b6Var2 = b6Var;
                                                AndroidUtilities.cancelRunOnUIThread(b6Var2);
                                                AndroidUtilities.runOnUIThread(b6Var2, 1000L);
                                            }
                                        });
                                        frameLayout.addView(frameLayout5, w7.z5.e(44, 44, 85));
                                    }
                                    linearLayout.addView(frameLayout, w7.z5.k(14.0f, 12.0f, 14.0f, 8.0f, -1, -2));
                                    t4Var2 = t4Var4;
                                } else {
                                    imageView3 = imageView;
                                    t4Var = t4Var5;
                                    spannableStringArr = spannableStringArr2;
                                    l01Var = l01Var2;
                                    linearLayout = e;
                                    strArr = strArr2;
                                    wallettransaction2 = wallettransaction;
                                    zArr = zArr2;
                                    i13 = 0;
                                    textViewArr = textViewArr2;
                                    t4Var2 = t4Var;
                                }
                                ei.d f10 = nk.f(24, context, d6Var2, true);
                                f10.setText(LocaleController.getString(R.string.OK));
                                linearLayout.addView(f10, w7.z5.k(14.0f, 14.0f, 14.0f, 14.0f, -1, 48));
                                TL_wallet.walletTransaction[] wallettransactionArr = new TL_wallet.walletTransaction[1];
                                wallettransactionArr[i13] = wallettransaction2;
                                b4 b4Var = new b4(linearLayout, q4Var2, d6Var2, i10, textView, k2VarArr, l01Var, callback3, context, textViewArr, i11, spannableStringArr);
                                LinearLayout linearLayout3 = linearLayout;
                                linearLayout3.setTag(new z3(2, b4Var, wallettransactionArr));
                                b4Var.run(wallettransaction2);
                                if (z11) {
                                    i14 = i10;
                                    t4 t4Var6 = new t4(i14, wallettransactionArr, b4Var);
                                    if (wallettransaction2.preview) {
                                        m0 w9 = m0.w(i14);
                                        String str2 = wallettransaction2.id;
                                        p pVar = new p(wallettransaction2, b4Var, wallettransactionArr, 4);
                                        HashMap hashMap = w9.K;
                                        l0 l0Var = w9.n;
                                        if (l0Var != null) {
                                            ArrayList arrayList = l0Var.c;
                                            int size = arrayList.size();
                                            int i21 = i13;
                                            while (i21 < size) {
                                                Object obj = arrayList.get(i21);
                                                i21++;
                                                TL_wallet.walletTransaction wallettransaction3 = (TL_wallet.walletTransaction) obj;
                                                if (TextUtils.equals(wallettransaction3.id, str2)) {
                                                    pVar.run(wallettransaction3);
                                                    break;
                                                }
                                            }
                                        }
                                        if (hashMap.get(str2) != null) {
                                            pVar.run((TL_wallet.walletTransaction) hashMap.get(str2));
                                        } else {
                                            TL_wallet.getTransactionsByIDs gettransactionsbyids = new TL_wallet.getTransactionsByIDs();
                                            gettransactionsbyids.id.add(str2);
                                            ConnectionsManager.getInstance(w9.a).sendRequestTyped(gettransactionsbyids, new org.telegram.messenger.a(), new k(w9, (Object) pVar, (Object) str2, 2));
                                        }
                                    }
                                    t4Var3 = t4Var6;
                                } else {
                                    i14 = i10;
                                    t4Var3 = t4Var;
                                }
                                String[] strArr3 = strArr;
                                boolean[] zArr3 = zArr;
                                linearLayout3.addOnAttachStateChangeListener(new u4(b4Var, wallettransactionArr, t4Var3, i14, callback2, k2VarArr, strArr3, zArr3));
                                if (callback3 == null) {
                                    int i22 = R.string.WalletSendAmount;
                                    TL_wallet.nftItem nftitem2 = wallettransaction2.nft;
                                    if (nftitem2 != null) {
                                        r10 = TextUtils.isEmpty(nftitem2.name) ? LocaleController.getString(R.string.WalletCollectible) : wallettransaction2.nft.name;
                                        i15 = i13;
                                    } else {
                                        long abs = Math.abs(wallettransaction2.amount);
                                        ?? r13 = i13;
                                        r10 = m0.r(abs, r13);
                                        i15 = r13;
                                    }
                                    Object[] objArr = new Object[1];
                                    objArr[i15] = r10;
                                    f10.setText(LocaleController.formatSpannable(i22, objArr));
                                    k2VarArr2 = k2VarArr;
                                    f10.setOnClickListener(new org.telegram.messenger.video.f(f10, t4Var2, callback3, strArr3, zArr3, k2VarArr2, d6Var));
                                } else {
                                    k2VarArr2 = k2VarArr;
                                    if (runnable != null) {
                                        f10.setText(LocaleController.getString(R.string.WalletOpenMyWallet));
                                        f10.setOnClickListener(new cf0(25, runnable, k2VarArr2));
                                    } else {
                                        final int i23 = 0;
                                        f10.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Wallet.y3
                                            @Override // android.view.View.OnClickListener
                                            public final void onClick(View view) {
                                                switch (i23) {
                                                    case 0:
                                                        k2VarArr2[0].dismiss();
                                                        break;
                                                    default:
                                                        k2VarArr2[0].dismiss();
                                                        break;
                                                }
                                            }
                                        });
                                    }
                                }
                                final int i24 = 1;
                                imageView3.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Wallet.y3
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view) {
                                        switch (i24) {
                                            case 0:
                                                k2VarArr2[0].dismiss();
                                                break;
                                            default:
                                                k2VarArr2[0].dismiss();
                                                break;
                                        }
                                    }
                                });
                                ImageView imageView9 = imageView2;
                                imageView9.setOnClickListener(new nb(k2VarArr2, d6Var, imageView9, wallettransactionArr, context, i10));
                                return linearLayout3;
                            }
                        } else if (!TextUtils.isEmpty(wallettransaction.comment)) {
                            wh.n nVar2 = new wh.n(context);
                            nVar2.setTextSize(1, 15.0f);
                            nVar2.setTextColor(org.telegram.ui.ActionBar.h6.w0(i16, d6Var2));
                            nVar2.setText(Emoji.replaceEmoji(wallettransaction.comment, nVar2.getPaint().getFontMetricsInt(), false));
                            nVar2.setTextIsSelectable(true);
                            org.telegram.ui.ActionBar.f5 f5Var2 = new org.telegram.ui.ActionBar.f5(0, false, false, null);
                            f5Var2.x = false;
                            f5Var2.w = Integer.valueOf(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.jl, d6Var2));
                            nVar2.setBackground(f5Var2);
                            nVar2.setPadding(AndroidUtilities.dp(19.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(15.0f), AndroidUtilities.dp(8.0f));
                            linearLayout2.addView(nVar2, w7.z5.t(-2, -2, 1, 32, 16, 32, 0));
                        }
                        i11 = w02;
                        imageView = imageView4;
                        textView = textView2;
                        q4Var2 = q4Var;
                        i12 = 1;
                    } else {
                        i11 = w02;
                        imageView = imageView4;
                        textView = textView2;
                        q4Var2 = q4Var;
                        i12 = 1;
                        f7 = 11.0f;
                    }
                    imageView2 = imageView5;
                    SpannableString[] spannableStringArr22 = new SpannableString[i12];
                    TextView[] textViewArr22 = new TextView[i12];
                    l01 l01Var22 = new l01(context, d6Var2);
                    e.addView(l01Var22, w7.z5.k(14.0f, 0.0f, 14.0f, 0.0f, -1, -2));
                    final String[] strArr22 = {wallettransaction.comment};
                    final boolean[] zArr22 = {(wallettransaction.comment_encrypted || (z11 && bArr == null)) ? false : true};
                    if (callback3 == null) {
                    }
                    ei.d f102 = nk.f(24, context, d6Var2, true);
                    f102.setText(LocaleController.getString(R.string.OK));
                    linearLayout.addView(f102, w7.z5.k(14.0f, 14.0f, 14.0f, 14.0f, -1, 48));
                    TL_wallet.walletTransaction[] wallettransactionArr2 = new TL_wallet.walletTransaction[1];
                    wallettransactionArr2[i13] = wallettransaction2;
                    b4 b4Var2 = new b4(linearLayout, q4Var2, d6Var2, i10, textView, k2VarArr, l01Var, callback3, context, textViewArr, i11, spannableStringArr);
                    LinearLayout linearLayout32 = linearLayout;
                    linearLayout32.setTag(new z3(2, b4Var2, wallettransactionArr2));
                    b4Var2.run(wallettransaction2);
                    if (z11) {
                    }
                    String[] strArr32 = strArr;
                    boolean[] zArr32 = zArr;
                    linearLayout32.addOnAttachStateChangeListener(new u4(b4Var2, wallettransactionArr2, t4Var3, i14, callback2, k2VarArr, strArr32, zArr32));
                    if (callback3 == null) {
                    }
                    final int i242 = 1;
                    imageView3.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Wallet.y3
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i242) {
                                case 0:
                                    k2VarArr2[0].dismiss();
                                    break;
                                default:
                                    k2VarArr2[0].dismiss();
                                    break;
                            }
                        }
                    });
                    ImageView imageView92 = imageView2;
                    imageView92.setOnClickListener(new nb(k2VarArr2, d6Var, imageView92, wallettransactionArr2, context, i10));
                    return linearLayout32;
                }
                s10 = walletTransactionPeer.address;
            }
            str = s10;
            if (callback3 == null) {
            }
            imageView2 = imageView5;
            SpannableString[] spannableStringArr222 = new SpannableString[i12];
            TextView[] textViewArr222 = new TextView[i12];
            l01 l01Var222 = new l01(context, d6Var2);
            e.addView(l01Var222, w7.z5.k(14.0f, 0.0f, 14.0f, 0.0f, -1, -2));
            final String[] strArr222 = {wallettransaction.comment};
            final boolean[] zArr222 = {(wallettransaction.comment_encrypted || (z11 && bArr == null)) ? false : true};
            if (callback3 == null) {
            }
            ei.d f1022 = nk.f(24, context, d6Var2, true);
            f1022.setText(LocaleController.getString(R.string.OK));
            linearLayout.addView(f1022, w7.z5.k(14.0f, 14.0f, 14.0f, 14.0f, -1, 48));
            TL_wallet.walletTransaction[] wallettransactionArr22 = new TL_wallet.walletTransaction[1];
            wallettransactionArr22[i13] = wallettransaction2;
            b4 b4Var22 = new b4(linearLayout, q4Var2, d6Var2, i10, textView, k2VarArr, l01Var, callback3, context, textViewArr, i11, spannableStringArr);
            LinearLayout linearLayout322 = linearLayout;
            linearLayout322.setTag(new z3(2, b4Var22, wallettransactionArr22));
            b4Var22.run(wallettransaction2);
            if (z11) {
            }
            String[] strArr322 = strArr;
            boolean[] zArr322 = zArr;
            linearLayout322.addOnAttachStateChangeListener(new u4(b4Var22, wallettransactionArr22, t4Var3, i14, callback2, k2VarArr, strArr322, zArr322));
            if (callback3 == null) {
            }
            final int i2422 = 1;
            imageView3.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Wallet.y3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i2422) {
                        case 0:
                            k2VarArr2[0].dismiss();
                            break;
                        default:
                            k2VarArr2[0].dismiss();
                            break;
                    }
                }
            });
            ImageView imageView922 = imageView2;
            imageView922.setOnClickListener(new nb(k2VarArr2, d6Var, imageView922, wallettransactionArr22, context, i10));
            return linearLayout322;
        }
        q4Var = q4Var3;
        t4 t4Var52 = null;
        if (wallettransaction.incoming) {
        }
        str = s10;
        if (callback3 == null) {
        }
        imageView2 = imageView5;
        SpannableString[] spannableStringArr2222 = new SpannableString[i12];
        TextView[] textViewArr2222 = new TextView[i12];
        l01 l01Var2222 = new l01(context, d6Var2);
        e.addView(l01Var2222, w7.z5.k(14.0f, 0.0f, 14.0f, 0.0f, -1, -2));
        final String[] strArr2222 = {wallettransaction.comment};
        final boolean[] zArr2222 = {(wallettransaction.comment_encrypted || (z11 && bArr == null)) ? false : true};
        if (callback3 == null) {
        }
        ei.d f10222 = nk.f(24, context, d6Var2, true);
        f10222.setText(LocaleController.getString(R.string.OK));
        linearLayout.addView(f10222, w7.z5.k(14.0f, 14.0f, 14.0f, 14.0f, -1, 48));
        TL_wallet.walletTransaction[] wallettransactionArr222 = new TL_wallet.walletTransaction[1];
        wallettransactionArr222[i13] = wallettransaction2;
        b4 b4Var222 = new b4(linearLayout, q4Var2, d6Var2, i10, textView, k2VarArr, l01Var, callback3, context, textViewArr, i11, spannableStringArr);
        LinearLayout linearLayout3222 = linearLayout;
        linearLayout3222.setTag(new z3(2, b4Var222, wallettransactionArr222));
        b4Var222.run(wallettransaction2);
        if (z11) {
        }
        String[] strArr3222 = strArr;
        boolean[] zArr3222 = zArr;
        linearLayout3222.addOnAttachStateChangeListener(new u4(b4Var222, wallettransactionArr222, t4Var3, i14, callback2, k2VarArr, strArr3222, zArr3222));
        if (callback3 == null) {
        }
        final int i24222 = 1;
        imageView3.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Wallet.y3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i24222) {
                    case 0:
                        k2VarArr2[0].dismiss();
                        break;
                    default:
                        k2VarArr2[0].dismiss();
                        break;
                }
            }
        });
        ImageView imageView9222 = imageView2;
        imageView9222.setOnClickListener(new nb(k2VarArr2, d6Var, imageView9222, wallettransactionArr222, context, i10));
        return linearLayout3222;
    }

    public static String q0(String str) {
        StringBuilder sb2 = new StringBuilder((str.length() / 4) + str.length());
        for (int i10 = 0; i10 < str.length(); i10++) {
            if (i10 > 0 && i10 % 4 == 0) {
                sb2.append(' ');
            }
            sb2.append(str.charAt(i10));
        }
        return sb2.toString();
    }

    public static SpannableStringBuilder r0(int i10, long j10, org.telegram.ui.ActionBar.d6 d6Var) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("G ");
        yq yqVar = new yq(R.drawable.wallet_gram_small, 2);
        yqVar.recolorDrawable = false;
        yqVar.setSize(AndroidUtilities.dp(16.0f));
        spannableStringBuilder.setSpan(yqVar, 0, 1, 33);
        BigDecimal movePointLeft = new BigDecimal(j10).movePointLeft(9);
        spannableStringBuilder.append((CharSequence) (movePointLeft.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : movePointLeft.stripTrailingZeros()).toPlainString());
        CharSequence l4 = m0.w(i10).l(j10, true);
        if (!TextUtils.isEmpty(l4)) {
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) "  ~\u2009").append(l4);
            spannableStringBuilder.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.z6, d6Var)), length, spannableStringBuilder.length(), 33);
        }
        return spannableStringBuilder;
    }

    public static boolean w0(String str) {
        if (str != null) {
            return "t.me".equalsIgnoreCase(str) || "telegram.me".equalsIgnoreCase(str) || "telegram.dog".equalsIgnoreCase(str);
        }
        return false;
    }

    public static boolean x0(Uri uri) {
        String scheme = uri.getScheme();
        if (!"ton".equalsIgnoreCase(scheme) && !"tc".equalsIgnoreCase(scheme)) {
            if (("https".equalsIgnoreCase(scheme) || "http".equalsIgnoreCase(scheme)) && w0(uri.getHost())) {
                List<String> pathSegments = uri.getPathSegments();
                if (pathSegments.size() != 1 || (!"sendgrams".equalsIgnoreCase(pathSegments.get(0)) && W0(uri) == null)) {
                }
            }
            return false;
        }
        return true;
    }

    public final CharSequence A0(int i10) {
        CharSequence[] charSequenceArr = this.N0;
        if (charSequenceArr[i10] == null) {
            charSequenceArr[i10] = new SpannableString("l");
            ca0 ca0Var = new ca0(AndroidUtilities.dp(i10 == 0 ? 100.0f : 50.0f), i10 == 0 ? this.s0 : this.t0);
            ca0Var.a(org.telegram.ui.ActionBar.h6.m1(0.45f, -1), org.telegram.ui.ActionBar.h6.m1(0.2f, -1));
            CharSequence charSequence = charSequenceArr[i10];
            ((SpannableString) charSequence).setSpan(ca0Var, 0, charSequence.length(), 33);
        }
        return charSequenceArr[i10];
    }

    public final void C0(TL_wallet.nftItem nftitem) {
        TL_stars.StarGift starGift = nftitem.gift;
        if (starGift instanceof TL_stars.TL_starGiftUnique) {
            TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) starGift;
            ai.l7 l7Var = new ai.l7(getParentActivity(), this.currentAccount, 0L, getResourceProvider(), null);
            l7Var.f1 = nftitem;
            if (this.i0 != null) {
                l7Var.g1 = new v4(this, tL_starGiftUnique, nftitem);
                l7Var.h1 = new w4(this, nftitem);
            }
            l7Var.K2(tL_starGiftUnique.slug, tL_starGiftUnique, null);
            showDialog(l7Var);
            return;
        }
        Activity parentActivity = getParentActivity();
        org.telegram.ui.ActionBar.d6 resourceProvider = getResourceProvider();
        if (parentActivity != null) {
            int w02 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.a7, resourceProvider);
            int w03 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.G6, resourceProvider);
            l4 l4Var = new l4(parentActivity, resourceProvider);
            l4Var.setBackgroundColor(w02);
            l4Var.fixNavigationBar(w02);
            ScrollView scrollView = new ScrollView(parentActivity);
            scrollView.setFillViewport(true);
            scrollView.setVerticalScrollBarEnabled(false);
            LinearLayout linearLayout = new LinearLayout(parentActivity);
            linearLayout.setOrientation(1);
            linearLayout.setGravity(1);
            linearLayout.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(28.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f));
            scrollView.addView(linearLayout, new FrameLayout.LayoutParams(-1, -2));
            org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(parentActivity);
            w9Var.setRoundRadius(AndroidUtilities.dp(12.0f));
            w9Var.setContentDescription(nftitem.name);
            Drawable mutate = parentActivity.getResources().getDrawable(R.drawable.wallet_nft_placeholder).mutate();
            int i10 = org.telegram.ui.ActionBar.h6.z6;
            mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(i10, resourceProvider), PorterDuff.Mode.SRC_IN));
            ImageLocation c10 = c.c(nftitem, false);
            if (c10 != null) {
                w9Var.h(c10, "120_120", mutate, nftitem);
            } else {
                w9Var.setImageDrawable(mutate);
            }
            linearLayout.addView(w9Var, w7.z5.q(120, 120, 1));
            TextView textView = new TextView(parentActivity);
            textView.setText(TextUtils.isEmpty(nftitem.name) ? LocaleController.getString(R.string.WalletCollectible) : nftitem.name);
            textView.setTextColor(w03);
            textView.setTextSize(1, 17.0f);
            textView.setTypeface(AndroidUtilities.bold());
            int i11 = 17;
            textView.setGravity(17);
            linearLayout.addView(textView, w7.z5.k(12.0f, 16.0f, 12.0f, 0.0f, -1, -2));
            TextView textView2 = new TextView(parentActivity);
            textView2.setText(nftitem.description);
            textView2.setTextColor(org.telegram.ui.ActionBar.h6.w0(i10, resourceProvider));
            textView2.setTextSize(1, 14.0f);
            textView2.setGravity(17);
            textView2.setVisibility(TextUtils.isEmpty(nftitem.description) ? 8 : 0);
            linearLayout.addView(textView2, w7.z5.k(12.0f, 4.0f, 12.0f, 0.0f, -1, -2));
            LinearLayout linearLayout2 = new LinearLayout(parentActivity);
            linearLayout2.setOrientation(0);
            linearLayout.addView(linearLayout2, w7.z5.k(0.0f, 20.0f, 0.0f, 16.0f, -1, 54));
            int i12 = 0;
            while (i12 < 2) {
                LinearLayout linearLayout3 = new LinearLayout(parentActivity);
                linearLayout3.setOrientation(1);
                linearLayout3.setGravity(i11);
                int dp = AndroidUtilities.dp(16.0f);
                int w04 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.d6, resourceProvider);
                int w05 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.i6, resourceProvider);
                linearLayout3.setBackground(org.telegram.ui.ActionBar.h6.j0(dp, dp, dp, dp, w04, w05, w05));
                linearLayout3.setClickable(true);
                linearLayout3.setFocusable(true);
                String string = LocaleController.getString(i12 == 0 ? R.string.WalletTransfer : R.string.WalletSell);
                linearLayout3.setContentDescription(string);
                ImageView imageView = new ImageView(parentActivity);
                imageView.setImageResource(i12 == 0 ? R.drawable.wallet_transfer : R.drawable.wallet_sell);
                imageView.setImportantForAccessibility(2);
                imageView.setColorFilter(new PorterDuffColorFilter(w03, PorterDuff.Mode.SRC_IN));
                linearLayout3.addView(imageView, w7.z5.n(24, 24));
                TextView textView3 = new TextView(parentActivity);
                textView3.setText(string);
                textView3.setTextColor(w03);
                textView3.setTextSize(1, 12.0f);
                textView3.setTypeface(AndroidUtilities.bold());
                textView3.setGravity(17);
                linearLayout3.addView(textView3, w7.z5.k(0.0f, 2.0f, 0.0f, 0.0f, -2, -2));
                linearLayout2.addView(linearLayout3, w7.z5.m(1.0f, 0, -1, i12 == 0 ? 0 : 4, i12 == 0 ? 4 : 0, 0));
                i12++;
                i11 = 17;
            }
            ArrayList<TL_wallet.nftAttribute> arrayList = nftitem.attributes;
            if (arrayList != null && !arrayList.isEmpty()) {
                l01 l01Var = new l01(parentActivity, resourceProvider);
                l01Var.setBackground(org.telegram.ui.ActionBar.h6.c0(AndroidUtilities.dp(10.0f), org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.d6, resourceProvider)));
                ArrayList<TL_wallet.nftAttribute> arrayList2 = nftitem.attributes;
                int size = arrayList2.size();
                int i13 = 0;
                while (i13 < size) {
                    TL_wallet.nftAttribute nftattribute = arrayList2.get(i13);
                    i13++;
                    TL_wallet.nftAttribute nftattribute2 = nftattribute;
                    l01Var.c(nftattribute2.trait_type, nftattribute2.value, null, null);
                }
                linearLayout.addView(l01Var, w7.z5.k(0.0f, 0.0f, 0.0f, 14.0f, -1, -2));
            }
            ei.d dVar = new ei.d(parentActivity, resourceProvider, true);
            dVar.setRoundRadius(24);
            dVar.setText(LocaleController.getString(R.string.WalletOK));
            linearLayout.addView(dVar, w7.z5.n(-1, 48));
            l4Var.setCustomView(scrollView);
            l4Var.useBackgroundTopPadding = false;
            linearLayout2.getChildAt(0).setOnClickListener(new cf0(24, l4Var, nftitem));
            linearLayout2.getChildAt(1).setOnClickListener(new t2(parentActivity, 1));
            dVar.setOnClickListener(new t2(l4Var, 2));
            l4Var.show();
            l4Var.fixNavigationBar(w02);
            AndroidUtilities.setNavigationBarColor((Dialog) l4Var, w02, false);
        }
    }

    public final void F0() {
        if (getParentActivity() == null || this.L0 != null || this.K0 == null) {
            return;
        }
        if (getParentActivity().checkSelfPermission("android.permission.CAMERA") != 0) {
            getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 44);
        } else {
            this.L0 = zh.b0.k(this, this.K0, new gi.c(10), new w3(this, 3), new p3(this, 8));
        }
    }

    public final void G0(boolean z10) {
        this.e0 = z10;
        if (!z10) {
            this.d0 = 0;
        }
        if (this.o0 == null || this.g0 == null) {
            return;
        }
        if (!z10) {
            this.h0.b(false);
            this.o0.setPosition(0);
        }
        T0();
        ValueAnimator valueAnimator = this.l0;
        if (valueAnimator != null) {
            this.l0 = null;
            valueAnimator.cancel();
        }
        float f7 = z10 ? 1.0f : 0.0f;
        boolean z11 = this.m0.isAttachedToWindow() && this.m0.isLaidOut();
        if (z10) {
            this.o0.o(false);
        }
        if (!z11 || this.k0 == f7) {
            H0(f7);
            this.o0.o(false);
        } else {
            this.g0.setVisibility(0);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.k0, f7);
            this.l0 = ofFloat;
            ofFloat.setDuration(250L);
            this.l0.setInterpolator(bs.h);
            this.l0.addUpdateListener(new v3(this, 0));
            this.l0.addListener(new org.telegram.ui.ActionBar.y0(this, f7, 7));
            this.l0.start();
        }
        if (this.a == null || this.n0 == I0()) {
            return;
        }
        R0(false);
    }

    public final void H0(float f7) {
        this.k0 = f7;
        this.g0.setVisibility((f7 > 0.0f || this.l0 != null) ? 0 : 8);
        this.g0.setAlpha(f7);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.g0.getLayoutParams();
        layoutParams.height = Math.round(AndroidUtilities.dp(52.0f) * f7);
        layoutParams.bottomMargin = -Math.round(AndroidUtilities.dp(6.0f) * f7);
        this.g0.setLayoutParams(layoutParams);
    }

    public final boolean I0() {
        l0 l0Var;
        if (this.e0 || (l0Var = this.C0) == null || !l0Var.c.isEmpty()) {
            return false;
        }
        l0 l0Var2 = this.C0;
        l0Var2.getClass();
        return l0Var2.h;
    }

    public final void J0() {
        this.E0 = false;
        n8 n8Var = this.h0;
        if (n8Var != null) {
            n8Var.b(false);
        }
        this.d0 = 0;
        ei.h1 h1Var = this.o0;
        if (h1Var != null) {
            h1Var.setPosition(0);
        }
    }

    public final void K0() {
        this.r = false;
        w61 w61Var = this.a;
        if (w61Var != null) {
            w61Var.C2.b.remove(this.v);
            this.a.removeCallbacks(this.s);
        }
        b5 b5Var = this.d;
        if (b5Var != null) {
            b5Var.setAdditionalTilt(0.0f);
        }
    }

    public final void L0() {
        m0 w9 = m0.w(this.currentAccount);
        U0();
        this.B0.setEnabled(w9.E() && w9.d());
        if (!w9.E()) {
            this.s0.setText(A0(0));
            this.t0.setText(A0(1));
            return;
        }
        long u10 = w9.u();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (this.P0 == null) {
            this.P0 = new SpannableString("G");
            b5 b5Var = this.d;
            b5Var.getClass();
            w5 w5Var = new w5(b5Var, R.drawable.wallet_gram_large);
            this.u0 = w5Var;
            SpannableString spannableString = this.P0;
            spannableString.setSpan(w5Var, 0, spannableString.length(), 33);
        }
        spannableStringBuilder.append((CharSequence) this.P0);
        spannableStringBuilder.append((CharSequence) " ");
        spannableStringBuilder.append((CharSequence) x5.e(u10));
        spannableStringBuilder.append((CharSequence) " ");
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.GramCurrency));
        if (this.v0 == null) {
            e5 e5Var = new e5();
            e5Var.a = -9577217;
            this.v0 = e5Var;
        }
        spannableStringBuilder.setSpan(this.v0, length, spannableStringBuilder.length(), 33);
        this.s0.setText(spannableStringBuilder);
        CharSequence l4 = m0.w(this.currentAccount).l(u10, false);
        if (TextUtils.isEmpty(l4)) {
            this.t0.setText(A0(1));
        } else {
            this.t0.setText(l4);
        }
        O0(this.w0);
        e0 e0Var = this.D0;
        if (e0Var != null && !e0Var.h && !e0Var.i && e0Var.k == null) {
            e0Var.e();
        }
        String s10 = w9.s();
        if (TextUtils.isEmpty(s10)) {
            return;
        }
        this.d.setCardNumber(q0(s10.toUpperCase()));
    }

    public final void M0() {
        float[] fArr;
        float[] fArr2;
        Rect rect = this.F;
        if (rect.isEmpty() || !this.x.isAttachedToWindow()) {
            return;
        }
        b5 b5Var = this.d;
        ah.v vVar = this.y;
        Matrix matrix = this.G;
        if (b5Var.g(vVar, matrix)) {
            float width = rect.width();
            float height = rect.height();
            int i10 = 0;
            while (true) {
                fArr = this.J;
                fArr2 = this.K;
                float f7 = 0.0f;
                if (i10 >= 4) {
                    break;
                }
                float f10 = (i10 == 1 || i10 == 2) ? width : 0.0f;
                if (i10 >= 2) {
                    f7 = height;
                }
                int i11 = i10 * 2;
                fArr[i11] = f10;
                int i12 = i11 + 1;
                fArr[i12] = f7;
                fArr2[i11] = rect.left + f10;
                fArr2[i12] = rect.top + f7;
                i10++;
            }
            matrix.mapPoints(fArr2);
            ah.v vVar2 = this.y;
            int[] iArr = this.N;
            vVar2.getLocationInWindow(iArr);
            View view = this.x;
            int[] iArr2 = this.M;
            view.getLocationInWindow(iArr2);
            this.d.i(this.w0, this.w.getWidth() / 0.7826087f);
            float f11 = iArr2[0] - iArr[0];
            float z10 = org.telegram.ui.Cells.c1.z(height, 0.7826087f, 0.5f, iArr2[1] - iArr[1]);
            for (int i13 = 0; i13 < 4; i13++) {
                int i14 = i13 * 2;
                float lerp = AndroidUtilities.lerp(fArr2[i14], (fArr[i14] * 0.7826087f) + f11, this.w0);
                float[] fArr3 = this.L;
                fArr3[i14] = lerp;
                int i15 = i14 + 1;
                fArr3[i15] = AndroidUtilities.lerp(fArr2[i15], (fArr[i15] * 0.7826087f) + z10, this.w0);
            }
            Matrix matrix2 = this.I;
            boolean polyToPoly = matrix2.setPolyToPoly(this.J, 0, this.L, 0, 4);
            Matrix matrix3 = this.H;
            if (polyToPoly && !matrix3.equals(matrix2)) {
                matrix3.set(matrix2);
                this.y.invalidate();
            }
            b5 b5Var2 = this.d;
            Matrix matrix4 = b5Var2.c;
            Matrix matrix5 = b5Var2.e;
            Matrix matrix6 = b5Var2.d;
            if (matrix.invert(matrix6)) {
                matrix5.setConcat(matrix6, matrix3);
                if (!b5Var2.n || !matrix4.equals(matrix5)) {
                    matrix4.set(matrix5);
                    b5Var2.n = true;
                    b5Var2.N.invalidate();
                }
            }
            float lerp2 = AndroidUtilities.lerp(1.0f, 1.0952381f, this.w0);
            this.t0.setPivotX(0.0f);
            this.t0.setPivotY(0.0f);
            this.t0.setScaleX(lerp2);
            this.t0.setScaleY(lerp2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v2 */
    public final void N0() {
        ah.v vVar;
        ?? r16;
        LinearLayout linearLayout;
        float min;
        float f7;
        if (this.a == null || this.d == null || this.r0 == null || this.x == null || (vVar = this.y) == null || this.actionBar == null) {
            return;
        }
        vVar.bringToFront();
        View m10 = this.a.V2.m(this.f);
        float clamp = m10 == null ? this.a.V2.L0() > this.f ? 1.0f : 0.0f : Utilities.clamp((this.a.getPaddingTop() - m10.getTop()) / m10.getHeight(), 1.0f, 0.0f);
        this.x0 = clamp;
        float f10 = this.H0;
        boolean z10 = f10 > 0.0f || this.G0 > 0.0f;
        if (z10) {
            clamp = f10 > 0.0f ? 0.0f : (1.0f - this.G0) * clamp;
        }
        this.w0 = clamp;
        Q0();
        float max = m10 != null ? Math.max(0.0f, (m10.getHeight() / 2.0f) + AndroidUtilities.dp(24.0f)) * this.w0 : 0.0f;
        float lerp = AndroidUtilities.lerp(1.0f, 0.8f, this.w0);
        this.d.setPivotX(r11.getWidth() * 0.5f);
        this.d.setPivotY(0.0f);
        this.d.setScaleX(lerp);
        this.d.setScaleY(lerp);
        this.d.setAlpha(1.0f - Utilities.clamp01(AndroidUtilities.ilerp(clamp, 0.75f, 1.0f)));
        this.d.setVisibility((z10 || (m10 != null && clamp < 1.0f && m10.getBottom() > this.a.getPaddingTop() && m10.getTop() < this.a.getHeight() - this.a.getPaddingBottom())) ? 0 : 4);
        int[] iArr = this.P;
        int[] iArr2 = this.O;
        if (m10 != null) {
            this.a.getLocationInWindow(iArr2);
            this.h.getLocationInWindow(iArr);
            r16 = 1;
            this.d.setTranslationX(((this.e.getWidth() - this.d.getWidth()) / 2.0f) + this.e.getX() + m10.getX() + (iArr2[0] - iArr[0]));
            this.d.setTranslationY(this.e.getY() + m10.getY() + (iArr2[1] - iArr[1]) + max);
        } else {
            r16 = 1;
        }
        if (z10) {
            boolean z11 = this.H0 == 0.0f ? r16 : false;
            float f11 = this.G0;
            if (z11) {
                min = 0.3f * f11;
                f7 = 0.6f;
            } else {
                min = Math.min(1.0f, 1.8f * f11) * 0.06f;
                f7 = 0.84f;
            }
            float f12 = min + f7;
            this.actionBar.getLocationInWindow(iArr2);
            this.h.getLocationInWindow(iArr);
            float dp = (AndroidUtilities.dp(4.0f) + (this.actionBar.getHeight() + (iArr2[r16] - iArr[r16]))) - ((1.0f - f11) * (z11 ? 0.0f : this.d.getHeight() * 0.35f));
            if (z11) {
                dp = a1.g.B(0.9f - f12, this.d.getHeight(), 2.0f, dp);
            }
            float width = (this.h.getWidth() - this.d.getWidth()) / 2.0f;
            if (!z11) {
                f11 = Math.min(1.0f, f11 * 2.0f);
            }
            if (m10 != null) {
                this.a.getLocationInWindow(iArr2);
                float width2 = ((this.e.getWidth() - this.d.getWidth()) / 2.0f) + this.e.getX() + m10.getX() + (iArr2[0] - iArr[0]);
                float y3 = this.e.getY() + m10.getY() + (iArr2[r16] - iArr[r16]);
                float clamp01 = Utilities.clamp01(1.0f - ((dp - y3) / (this.d.getHeight() * 0.5f)));
                if (clamp01 >= 1.0f) {
                    AndroidUtilities.cancelRunOnUIThread(this.J0);
                    ValueAnimator valueAnimator = this.I0;
                    if (valueAnimator != null) {
                        this.I0 = null;
                        valueAnimator.cancel();
                    }
                    this.G0 = 0.0f;
                    this.H0 = 0.0f;
                    N0();
                    return;
                }
                width = AndroidUtilities.lerp(width, width2, clamp01);
                dp = AndroidUtilities.lerp(dp, y3, clamp01);
                f12 = AndroidUtilities.lerp(f12, 1.0f, clamp01);
                f11 = AndroidUtilities.lerp(f11, 1.0f, clamp01);
            }
            this.d.setPivotX(r1.getWidth() * 0.5f);
            this.d.setPivotY(0.0f);
            this.d.setScaleX(f12);
            this.d.setScaleY(f12);
            this.d.setTranslationX(width);
            this.d.setTranslationY(dp);
            this.d.setAlpha(f11);
        }
        boolean z12 = clamp > 0.0f ? r16 : false;
        if (this.E != z12 && (linearLayout = this.r0) != null) {
            Rect rect = this.F;
            if (z12) {
                if (linearLayout.getWidth() != 0 && this.r0.getHeight() != 0) {
                    rect.set(this.r0.getLeft(), this.r0.getTop(), this.r0.getRight(), this.r0.getBottom());
                }
            }
            this.d.setOnFrontContentPresented(null);
            AndroidUtilities.removeFromParent(this.r0);
            this.E = z12;
            if (z12) {
                this.y.addView(this.r0, new FrameLayout.LayoutParams(rect.width(), rect.height(), 51));
                this.r0.layout(0, 0, rect.width(), rect.height());
                M0();
            } else {
                b5 b5Var = this.d;
                b5Var.i(0.0f, 0.0f);
                LinearLayout linearLayout2 = b5Var.M;
                AndroidUtilities.removeFromParent(linearLayout2);
                linearLayout2.setScaleX(1.0f);
                linearLayout2.setScaleY(1.0f);
                linearLayout2.setRotationX(0.0f);
                linearLayout2.setRotationY(0.0f);
                linearLayout2.setTranslationX(0.0f);
                linearLayout2.setTranslationY(0.0f);
                v5 v5Var = b5Var.O;
                v5Var.setScaleX(1.0f);
                v5Var.setScaleY(1.0f);
                b5Var.E.addView(linearLayout2, b5Var.P);
                this.r0.layout(rect.left, rect.top, rect.right, rect.bottom);
                this.d.getClass();
                M0();
            }
            this.y.invalidate();
        }
        O0(clamp);
        if (this.E) {
            M0();
        }
        float f13 = 1.0f - clamp;
        float f14 = (1.0f - f13) * (-AndroidUtilities.dp(8.0f));
        if (this.actionBar.getTitleTextView() != null) {
            this.actionBar.getTitleTextView().setAlpha(f13);
            this.actionBar.getTitleTextView().setTranslationY(f14);
        }
        if (this.actionBar.getTitleTextView2() != null) {
            this.actionBar.getTitleTextView2().setAlpha(f13);
            this.actionBar.getTitleTextView2().setTranslationY(f14);
        }
    }

    public final void O0(float f7) {
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.h6.G6);
        this.s0.setTextColor(AndroidUtilities.lerpColor(-1, themedColor, f7));
        org.telegram.ui.Components.q6 q6Var = this.t0;
        float[] fArr = this.d.a0;
        int i10 = -7868417;
        if (fArr != null) {
            i10 = i0.a.f(fArr[8], h7.p(fArr, -7868417, 0), h7.p(fArr, -7868417, 3));
        }
        q6Var.setTextColor(AndroidUtilities.lerpColor(i10, i0.a.o(themedColor, Math.round(142.8f)), f7));
        w5 w5Var = this.u0;
        if (w5Var != null) {
            w5Var.setOverrideColor(AndroidUtilities.lerpColor(-1, getThemedColor(org.telegram.ui.ActionBar.h6.Oh), f7));
        }
        e5 e5Var = this.v0;
        if (e5Var != null) {
            float[] fArr2 = this.d.a0;
            int i11 = -9577217;
            if (fArr2 != null) {
                i11 = i0.a.f(fArr2[8], h7.p(fArr2, -9577217, 0), h7.p(fArr2, -9577217, 3));
            }
            e5Var.a = i0.a.o(i11, Math.round((1.0f - f7) * 255.0f));
        }
        this.s0.invalidate();
    }

    public final void P0(float[] fArr) {
        if (this.A0 == null || this.B0 == null) {
            return;
        }
        float f7 = h7.j(getThemedColor(org.telegram.ui.ActionBar.h6.a7))[0];
        boolean z10 = f7 < 0.6f;
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.h6.Oh);
        if (fArr != null && fArr.length >= 18) {
            int[] iArr = new int[2];
            for (int i10 = 0; i10 < 2; i10++) {
                int i11 = i10 * 4;
                float f10 = fArr[i11 + 10];
                iArr[i10] = f10 < 0.0f ? themedColor : h7.n(themedColor, (int) f10, (int) fArr[i11 + 11]);
            }
            themedColor = i0.a.f(fArr[8], iArr[0], iArr[1]);
        }
        float f11 = z10 ? f7 + 0.25f : 0.0f;
        float f12 = z10 ? 1.0f : f7 - 0.2f;
        float[] j10 = h7.j(themedColor);
        float f13 = j10[0];
        if (f13 < f11 || f13 > f12) {
            themedColor = (themedColor & (-16777216)) | (h7.l(Math.max(f11, Math.min(f12, f13)), j10[1], j10[2]) & 16777215);
        }
        if (themedColor == this.M0) {
            return;
        }
        this.M0 = themedColor;
        int themedColor2 = i0.a.h(themedColor) <= 0.550000011920929d ? getThemedColor(org.telegram.ui.ActionBar.h6.Sh) : -16777216;
        ei.d[] dVarArr = {this.A0, this.B0};
        for (int i12 = 0; i12 < 2; i12++) {
            ei.d dVar = dVarArr[i12];
            dVar.setColor(themedColor);
            dVar.setTextColor(themedColor2);
        }
    }

    public final void Q0() {
        w61 w61Var = this.a;
        if (w61Var == null || this.d == null) {
            return;
        }
        float b10 = w61Var.C2.b(1);
        this.d.setAdditionalTilt(Math.max(0.0f, (this.w0 * 10.0f) + ((((float) Math.sqrt(Utilities.clamp01(this.w0))) * 90.0f) - 10.0f)) + Math.min(10.0f, this.a.C2.b(3) * 40.0f) + (-Math.min(10.0f, b10 * 40.0f)));
        this.d.setUseGyroscope(1.0f - ((float) Math.pow(this.w0, 0.33000001311302185d)));
    }

    public final void R0(boolean z10) {
        boolean I0 = I0();
        w61 w61Var = this.a;
        c71[] c71VarArr = this.q0;
        if (w61Var != null && this.n0 != I0) {
            this.n0 = I0;
            w61Var.B0();
            for (c71 c71Var : c71VarArr) {
                if (c71Var != null) {
                    c71Var.B0();
                }
            }
            this.a.W2.N(false);
            this.a.V2.h1(0, 0);
            this.a.post(new p3(this, 10));
        }
        if (I0) {
            return;
        }
        for (c71 c71Var2 : c71VarArr) {
            if (c71Var2 != null) {
                S0(c71Var2, z10);
            }
        }
        ai.r rVar = this.m0;
        if (rVar != null) {
            rVar.post(new p3(this, 5));
            this.m0.post(new p3(this, 6));
        }
    }

    public final void T0() {
        n8 n8Var = this.h0;
        if (n8Var == null || this.o0 == null || n8Var.w == 0.0f) {
            return;
        }
        n8Var.w = 0.0f;
        n8Var.c.setVisibility(8);
        n8Var.invalidate();
    }

    @Override // org.telegram.ui.Components.x61
    public final void U(ArrayList arrayList, u61 u61Var) {
        m0 w9 = m0.w(this.currentAccount);
        U0();
        arrayList.add(h61.l(this.Q));
        this.f = arrayList.size();
        y4 y4Var = this.e;
        h61 h61Var = new h61(-4);
        h61Var.c = y4Var;
        h61Var.z = -1;
        h61Var.e = true;
        arrayList.add(h61Var);
        arrayList.add(h61.l(this.y0));
        boolean I0 = I0();
        this.n0 = I0;
        if (I0) {
            int i10 = R.drawable.wallet_learn_instant;
            String string = LocaleController.getString(R.string.WalletSendInstantly);
            String string2 = LocaleController.getString(R.string.WalletSendInstantlyInfo);
            int i11 = f5.a;
            h61 J = h61.J(f5.class);
            J.k = i10;
            J.l = string;
            J.m = string2;
            arrayList.add(J);
            int i12 = R.drawable.wallet_learn_fees;
            String string3 = LocaleController.getString(R.string.WalletNoFees);
            String string4 = LocaleController.getString(R.string.WalletNoFeesInfo);
            h61 J2 = h61.J(f5.class);
            J2.k = i12;
            J2.l = string3;
            J2.m = string4;
            arrayList.add(J2);
            int i13 = R.drawable.wallet_learn_verified;
            String string5 = LocaleController.getString(R.string.WalletBlockchainVerified);
            String string6 = LocaleController.getString(R.string.WalletBlockchainVerifiedInfo);
            h61 J3 = h61.J(f5.class);
            J3.k = i13;
            J3.l = string5;
            J3.m = string6;
            arrayList.add(J3);
            arrayList.add(h61.l(this.Z));
        } else if (this.m0 != null) {
            if (this.Q0 && !this.R0 && w9.u() > 500000000) {
                arrayList.add(h61.k(this.b0));
            }
            arrayList.add(h61.p(this.m0, 0, true));
        }
        x90 x90Var = this.Y;
        if (x90Var != null) {
            this.a0 = false;
            x90Var.animate().cancel();
            this.Y.setAlpha(0.0f);
            this.Y.setVisibility(4);
        }
    }

    public final void U0() {
        if (this.R == null) {
            return;
        }
        m0 w9 = m0.w(this.currentAccount);
        boolean z10 = this.R.isAttachedToWindow() && this.R.isLaidOut();
        x4 x4Var = this.R;
        FrameLayout frameLayout = this.S;
        Boolean bool = w9.i;
        x4Var.i(frameLayout, (bool == null || !bool.booleanValue() || TextUtils.isEmpty(w9.j)) ? false : true, z10);
        ArrayList arrayList = w9.G;
        int size = arrayList.size();
        int i10 = 0;
        long j10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            i0 i0Var = (i0) obj;
            if (!i0Var.e) {
                long j11 = i0Var.c;
                if (j11 >= 0) {
                    j10 += j11;
                }
            }
        }
        boolean z11 = j10 > 500000000;
        if (z11) {
            this.V.setText(s0(R.string.WalletOldWalletsBalance, j10));
        }
        this.R.i(this.U, z11, z10);
        long j12 = ai.ga.y(this.currentAccount, true).p().amount;
        boolean z12 = j12 > 500000000;
        if (z12) {
            this.X.setText(s0(R.string.WalletGramEarningsBalance, j12));
        }
        this.R.i(this.W, z12, z10);
    }

    @Override // org.telegram.ui.Components.x61
    public final CharSequence V() {
        return LocaleController.getString(R.string.WalletTitle);
    }

    @Override // org.telegram.ui.Components.x61
    public final void W(h61 h61Var, View view) {
        e0 e0Var;
        Object obj = h61Var.G;
        if (obj instanceof TL_wallet.nftItem) {
            C0((TL_wallet.nftItem) obj);
            return;
        }
        if (h61Var.d == -10001 && (e0Var = this.D0) != null) {
            e0Var.e();
        } else if (obj instanceof TL_wallet.walletTransaction) {
            B0(getParentActivity(), this.currentAccount, (TL_wallet.walletTransaction) h61Var.G, null, null, null, null, getResourceProvider());
        }
    }

    @Override // org.telegram.ui.Components.x61
    public final boolean X(h61 h61Var, View view) {
        t7 t7Var;
        if (!(view instanceof g7) || (t7Var = this.i0) == null) {
            return false;
        }
        t7Var.S((g7) view);
        return true;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean canBeginSlide() {
        t7 t7Var = this.i0;
        return (t7Var == null || !t7Var.p0) && super.canBeginSlide();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.telegram.ui.Components.x61, org.telegram.ui.ActionBar.n2
    public final View createView(Context context) {
        ValueAnimator valueAnimator = this.l0;
        if (valueAnimator != null) {
            this.l0 = null;
            valueAnimator.cancel();
        }
        K0();
        k5 k5Var = this.p0;
        if (k5Var != null) {
            k5Var.b(null);
        }
        this.e = null;
        this.R = null;
        this.Q = null;
        this.m0 = null;
        this.o0 = null;
        c71[] c71VarArr = this.q0;
        int i10 = 0;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        Object[] objArr5 = 0;
        c71VarArr[0] = null;
        final int i11 = 1;
        c71VarArr[1] = null;
        e0 e0Var = this.D0;
        boolean z10 = (e0Var == null || e0Var.a.isEmpty()) ? false : true;
        this.e0 = z10;
        if (!z10) {
            this.d0 = 0;
        } else if (this.E0) {
            this.d0 = 1;
        }
        t7 t7Var = this.i0;
        if (t7Var != null) {
            t7Var.p();
        }
        this.i0 = null;
        View createView = super.createView(context);
        lc0 lc0Var = new lc0(this, context);
        lc0Var.addView(createView, w7.z5.c(-1.0f, -1));
        this.fragmentView = lc0Var;
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i12 = org.telegram.ui.ActionBar.h6.a7;
        kVar.setBackgroundColor(getThemedColor(i12));
        this.actionBar.setCastShadows(false);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setClipChildren(false);
        this.actionBar.setClipToPadding(false);
        org.telegram.ui.ActionBar.y n10 = this.actionBar.n();
        org.telegram.ui.ActionBar.u0 a2 = n10.a(2, R.drawable.scan_qr);
        this.K0 = a2;
        final int i13 = 3;
        a2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Wallet.r3
            public final /* synthetic */ o5 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i13) {
                    case 0:
                        o5 o5Var = this.b;
                        o5Var.getClass();
                        o5Var.presentFragment(new vf1(6, null));
                        break;
                    case 1:
                        o5.a0(this.b);
                        break;
                    case 2:
                        o5.d0(this.b);
                        break;
                    case 3:
                        this.b.F0();
                        break;
                    default:
                        o5.Y(this.b);
                        break;
                }
            }
        });
        n10.a(1, R.drawable.ic_ab_other).setOnClickListener(new cf0(26, this, context));
        ah.x xVar = new ah.x(this, context, 27);
        this.Q = xVar;
        xVar.setClipToPadding(false);
        this.Q.setClipChildren(false);
        this.Q.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(4.0f));
        x4 x4Var = new x4(this, context);
        this.R = x4Var;
        x4Var.setDefaultRadiusDp(22);
        this.R.setOnAnimatedHeightChangedListener(new p3(this, 12));
        TextView textView = new TextView(context);
        this.T = textView;
        textView.setText(LocaleController.getString(R.string.WalletWaltFunds));
        this.S = p0(this.T, new p3(this, i10));
        TextView textView2 = new TextView(context);
        this.V = textView2;
        this.U = p0(textView2, new p3(this, i11));
        TextView textView3 = new TextView(context);
        this.X = textView3;
        this.W = p0(textView3, new p3(this, 2));
        this.Q.addView(this.R, w7.z5.c(-2.0f, -1));
        x90 x90Var = new x90(context, null);
        this.Y = x90Var;
        this.a0 = false;
        x90Var.setAlpha(0.0f);
        x90 x90Var2 = this.Y;
        int i14 = org.telegram.ui.ActionBar.h6.z6;
        x90Var2.setTextColor(org.telegram.ui.ActionBar.h6.w0(i14, this.resourceProvider));
        this.Y.setTextSize(1, 13.0f);
        this.Y.setGravity(17);
        this.Y.setText(AndroidUtilities.replaceSingleLink(LocaleController.getString(R.string.WalletTermsOfService), org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.gc, this.resourceProvider), new q3(context, objArr5 == true ? 1 : 0)));
        this.Y.setVisibility(4);
        ((FrameLayout) createView).addView(this.Y, w7.z5.d(-1, -2.0f, 81, 12.0f, 0.0f, 12.0f, 24.0f));
        y4 y4Var = new y4(this, context, objArr4 == true ? 1 : 0);
        this.Z = y4Var;
        y4Var.setImportantForAccessibility(2);
        this.b0 = new FrameLayout(context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.c0 = frameLayout;
        int i15 = org.telegram.ui.ActionBar.h6.d6;
        int themedColor = getThemedColor(i15);
        int themedColor2 = getThemedColor(i15);
        int i16 = org.telegram.ui.ActionBar.h6.i6;
        frameLayout.setBackground(org.telegram.ui.ActionBar.h6.a0(themedColor, org.telegram.ui.ActionBar.h6.v(themedColor2, getThemedColor(i16)), 16, 16));
        this.b0.addView(this.c0, w7.z5.d(-1, -2.0f, 55, 12.0f, 0.0f, 12.0f, 12.0f));
        ImageView imageView = new ImageView(context);
        float dpf2 = AndroidUtilities.dpf2(10.0f);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{dpf2, dpf2, dpf2, dpf2, dpf2, dpf2, dpf2, dpf2}, null, null));
        shapeDrawable.setShaderFactory(new z4());
        imageView.setBackground(shapeDrawable);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.wallet_protect);
        this.c0.addView(imageView, w7.z5.d(28, 28.0f, 19, 14.0f, 11.0f, 16.0f, 11.0f));
        TextView textView4 = new TextView(context);
        nk.o(org.telegram.ui.ActionBar.h6.q7, this.resourceProvider, textView4, 1, 16.0f);
        textView4.setText(LocaleController.getString(R.string.WalletProtectAccount));
        this.c0.addView(textView4, w7.z5.d(-1, -2.0f, 19, 58.0f, 0.0f, 32.0f, 0.0f));
        FrameLayout frameLayout2 = this.c0;
        final Object[] objArr6 = objArr3 == true ? 1 : 0;
        frameLayout2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Wallet.r3
            public final /* synthetic */ o5 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (objArr6) {
                    case 0:
                        o5 o5Var = this.b;
                        o5Var.getClass();
                        o5Var.presentFragment(new vf1(6, null));
                        break;
                    case 1:
                        o5.a0(this.b);
                        break;
                    case 2:
                        o5.d0(this.b);
                        break;
                    case 3:
                        this.b.F0();
                        break;
                    default:
                        o5.Y(this.b);
                        break;
                }
            }
        });
        w7.b6.b(this.c0, 0.02f, 1.2f);
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.w = frameLayout3;
        frameLayout3.setClipChildren(false);
        this.w.setClipToPadding(false);
        this.actionBar.addView(this.w, w7.z5.d(-1, 56.0f, 87, 64.0f, 0.0f, 96.0f, 0.0f));
        View view = new View(context);
        this.x = view;
        this.w.addView(view, w7.z5.e(1, 1, 19));
        this.E = false;
        this.F.setEmpty();
        this.H.reset();
        ah.v vVar = new ah.v(this, context);
        this.y = vVar;
        vVar.setClipChildren(false);
        this.y.setClipToPadding(false);
        b5 b5Var = new b5(this, context);
        this.d = b5Var;
        b5Var.setDiamondOnCard(true);
        this.d.setCardOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Wallet.r3
            public final /* synthetic */ o5 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i11) {
                    case 0:
                        o5 o5Var = this.b;
                        o5Var.getClass();
                        o5Var.presentFragment(new vf1(6, null));
                        break;
                    case 1:
                        o5.a0(this.b);
                        break;
                    case 2:
                        o5.d0(this.b);
                        break;
                    case 3:
                        this.b.F0();
                        break;
                    default:
                        o5.Y(this.b);
                        break;
                }
            }
        });
        this.a.C2.b.add(this.v);
        y4 y4Var2 = new y4(this, context, i11);
        this.e = y4Var2;
        y4Var2.setImportantForAccessibility(2);
        c5 c5Var = new c5(this, context);
        this.h = c5Var;
        c5Var.setClipChildren(false);
        this.h.setClipToPadding(false);
        this.h.addView(this.d, w7.z5.c(-2.0f, -1));
        lc0Var.addView(this.h, w7.z5.c(-1.0f, -1));
        this.a.setClipChildren(false);
        this.a.setClipToPadding(false);
        this.r0 = this.d.getBalanceLayout();
        this.s0 = this.d.getBalanceView();
        this.t0 = this.d.getUsdBalanceView();
        this.d.setCardHolder(UserObject.getUserName(getUserConfig().getCurrentUser()).toUpperCase());
        this.z0 = 0.0f;
        qa1 qa1Var = new qa1(this, context, 19);
        this.y0 = qa1Var;
        qa1Var.setOrientation(0);
        this.y0.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(12.0f));
        ei.d dVar = new ei.d(context, this.resourceProvider, true);
        dVar.setRoundRadius(24);
        this.A0 = dVar;
        dVar.setText(LocaleController.getString(R.string.WalletAddFunds));
        this.y0.addView(this.A0, w7.z5.m(1.0f, 0, 48, 0, 4, 0));
        final int i17 = 2;
        this.A0.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Wallet.r3
            public final /* synthetic */ o5 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i17) {
                    case 0:
                        o5 o5Var = this.b;
                        o5Var.getClass();
                        o5Var.presentFragment(new vf1(6, null));
                        break;
                    case 1:
                        o5.a0(this.b);
                        break;
                    case 2:
                        o5.d0(this.b);
                        break;
                    case 3:
                        this.b.F0();
                        break;
                    default:
                        o5.Y(this.b);
                        break;
                }
            }
        });
        ei.d dVar2 = new ei.d(context, this.resourceProvider, true);
        dVar2.setRoundRadius(24);
        this.B0 = dVar2;
        dVar2.setText(LocaleController.getString(R.string.WalletSend));
        this.B0.setEnabled(m0.w(this.currentAccount).d());
        final int i18 = 4;
        this.B0.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Wallet.r3
            public final /* synthetic */ o5 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i18) {
                    case 0:
                        o5 o5Var = this.b;
                        o5Var.getClass();
                        o5Var.presentFragment(new vf1(6, null));
                        break;
                    case 1:
                        o5.a0(this.b);
                        break;
                    case 2:
                        o5.d0(this.b);
                        break;
                    case 3:
                        this.b.F0();
                        break;
                    default:
                        o5.Y(this.b);
                        break;
                }
            }
        });
        this.y0.addView(this.B0, w7.z5.m(1.0f, 0, 48, 4, 0, 0));
        P0(this.d.getStickerStyle());
        this.C0 = m0.w(this.currentAccount).A();
        this.a.setDescendantFocusability(131072);
        t7 t7Var2 = new t7(this, this.d, new n2.e(this, lc0Var, objArr2 == true ? 1 : 0, 12), null);
        this.i0 = t7Var2;
        lc0Var.addView(t7Var2, w7.z5.c(-1.0f, -1));
        this.j0 = "";
        ai.r rVar = new ai.r(context, 8);
        this.m0 = rVar;
        rVar.setOrientation(1);
        this.m0.setBackgroundColor(getThemedColor(i12));
        ei.h1 h1Var = new ei.h1(this, context, this.resourceProvider, 10);
        this.o0 = h1Var;
        h1Var.setAllowDisallowInterceptTouch(false);
        this.o0.setAdapter(new k4(this, context));
        d91 n11 = this.o0.n(-2, true);
        this.f0 = n11;
        n11.g(i14, org.telegram.ui.ActionBar.h6.G6, i14, i16, i15);
        this.f0.setBackground(org.telegram.ui.ActionBar.h6.c0(AndroidUtilities.dp(20.0f), getThemedColor(i15)));
        this.g0 = new FrameLayout(context);
        n8 n8Var = new n8(context, this.f0, this.resourceProvider, new w3(this, objArr == true ? 1 : 0), new w3(this, i11), new w3(this, 2));
        this.h0 = n8Var;
        this.g0.addView(n8Var, w7.z5.d(-1, 40.0f, 48, 16.0f, 0.0f, 16.0f, 0.0f));
        this.o0.setPosition(this.d0);
        T0();
        this.m0.addView(this.g0, w7.z5.k(0.0f, 0.0f, 0.0f, -6.0f, -1, 52));
        this.m0.addView(this.o0, w7.z5.l(1.0f, -1, 0));
        G0(this.e0);
        e0 e0Var2 = this.D0;
        if (e0Var2 != null) {
            this.i0.Y(e0Var2);
        }
        this.a.j(new kv(this, 14));
        u61 u61Var = this.a.W2;
        u61Var.r = false;
        u61Var.N(false);
        k5 k5Var2 = new k5(this);
        this.p0 = k5Var2;
        k5Var2.b(this.a);
        L0();
        this.C0.h();
        this.actionBar.post(new p3(this, 9));
        this.a.post(new p3(this, 10));
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        w61 w61Var;
        u61 u61Var;
        if (i11 != this.currentAccount) {
            return;
        }
        if (i10 == NotificationCenter.walletUpdate && this.s0 != null) {
            L0();
            Iterator it = this.O0.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
            return;
        }
        if (i10 == NotificationCenter.starBalanceUpdated) {
            U0();
            return;
        }
        if (i10 == NotificationCenter.didSetOrRemoveTwoStepPassword) {
            if (objArr.length > 0) {
                Object obj = objArr[0];
                if (obj instanceof TL_account.Password) {
                    this.Q0 = true;
                    this.R0 = ((TL_account.Password) obj).has_password;
                    w61 w61Var2 = this.a;
                    if (w61Var2 == null || (u61Var = w61Var2.W2) == null) {
                        return;
                    }
                    u61Var.N(true);
                    return;
                }
            }
            getConnectionsManager().sendRequestTyped(new TL_account.getPassword(), new org.telegram.messenger.a(), new d(this, 7));
            return;
        }
        if (i10 != NotificationCenter.walletTransactionsUpdate || objArr.length <= 0) {
            return;
        }
        Object obj2 = objArr[0];
        l0 l0Var = this.C0;
        if (obj2 != l0Var || (w61Var = this.a) == null || w61Var.W2 == null) {
            return;
        }
        if (l0Var.b.isEmpty()) {
            l0 l0Var2 = this.C0;
            if (!l0Var2.h) {
                l0Var2.h();
            }
        }
        R0(true);
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void n0(boolean z10) {
        AndroidUtilities.cancelRunOnUIThread(this.J0);
        float f7 = z10 ? 1.0f : 0.0f;
        if (this.H0 == f7) {
            return;
        }
        this.H0 = f7;
        ValueAnimator valueAnimator = this.I0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        N0();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.G0, f7);
        this.I0 = ofFloat;
        ofFloat.setDuration(z10 ? 260L : 120L);
        this.I0.setInterpolator(z10 ? new bs(0.05d, 0.7d, 0.1d, 1.0d) : new bs(0.4d, 0.0d, 0.2d, 1.0d));
        this.I0.addUpdateListener(new v3(this, 1));
        this.I0.addListener(new tf1(this, 4));
        this.I0.start();
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean onBackPressed(boolean z10) {
        zh.b0 b0Var = this.L0;
        if (b0Var != null) {
            if (z10) {
                b0Var.e();
            }
            return false;
        }
        n8 n8Var = this.h0;
        if (n8Var == null || !n8Var.x) {
            return super.onBackPressed(z10);
        }
        if (z10) {
            n8Var.b(false);
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onBeginSlide() {
        k5 k5Var = this.p0;
        if (k5Var != null) {
            k5Var.c();
        }
        w61 w61Var = this.a;
        if (w61Var != null) {
            w61Var.B0();
        }
        c71 t02 = t0();
        if (t02 != null) {
            t02.B0();
        }
        super.onBeginSlide();
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean onFragmentCreate() {
        Context context = ApplicationLoader.applicationContext;
        if (p5.k0.compareAndSet(false, true)) {
            p5.l0.postRunnable(new q3(context, 2));
        }
        getNotificationCenter().addObserver(this, NotificationCenter.walletUpdate);
        getNotificationCenter().addObserver(this, NotificationCenter.starBalanceUpdated);
        getNotificationCenter().addObserver(this, NotificationCenter.walletTransactionsUpdate);
        getNotificationCenter().addObserver(this, NotificationCenter.didSetOrRemoveTwoStepPassword);
        m0 w9 = m0.w(this.currentAccount);
        if (w9.o == null) {
            w9.o = new e0(w9);
        }
        e0 e0Var = w9.o;
        this.D0 = e0Var;
        p3 p3Var = this.F0;
        ArrayList arrayList = e0Var.d;
        if (!arrayList.contains(p3Var)) {
            arrayList.add(p3Var);
        }
        j jVar = this.S0;
        if (jVar != null) {
            jVar.run();
        }
        int i10 = w9.D;
        w9.D = i10 + 1;
        HashSet hashSet = w9.E;
        boolean isEmpty = hashSet.isEmpty();
        hashSet.add(Integer.valueOf(i10));
        if (isEmpty) {
            w9.Q();
        }
        this.S0 = new j(w9, i10, 0);
        getConnectionsManager().sendRequestTyped(new TL_account.getPassword(), new org.telegram.messenger.a(), new d(this, 7));
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onFragmentDestroy() {
        zh.b0 b0Var = this.L0;
        if (b0Var != null) {
            b0Var.g();
            AndroidUtilities.removeFromParent(this.L0);
            this.L0 = null;
        }
        AndroidUtilities.cancelRunOnUIThread(this.J0);
        ValueAnimator valueAnimator = this.I0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        t7 t7Var = this.i0;
        if (t7Var != null) {
            t7Var.p();
        }
        b5 b5Var = this.d;
        if (b5Var != null) {
            b5Var.setOnFrontContentPresented(null);
        }
        ValueAnimator valueAnimator2 = this.l0;
        if (valueAnimator2 != null) {
            this.l0 = null;
            valueAnimator2.cancel();
        }
        e0 e0Var = this.D0;
        if (e0Var != null) {
            e0Var.d.remove(this.F0);
        }
        K0();
        k5 k5Var = this.p0;
        if (k5Var != null) {
            k5Var.b(null);
        }
        getNotificationCenter().removeObserver(this, NotificationCenter.walletUpdate);
        getNotificationCenter().removeObserver(this, NotificationCenter.starBalanceUpdated);
        getNotificationCenter().removeObserver(this, NotificationCenter.walletTransactionsUpdate);
        getNotificationCenter().removeObserver(this, NotificationCenter.didSetOrRemoveTwoStepPassword);
        AndroidUtilities.removeFromParent(this.y);
        l0 l0Var = this.C0;
        if (l0Var != null) {
            l0Var.a();
        }
        super.onFragmentDestroy();
        j jVar = this.S0;
        if (jVar != null) {
            jVar.run();
            this.S0 = null;
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.a.setPadding(0, 0, 0, i13);
        this.a.setClipToPadding(false);
        x90 x90Var = this.Y;
        if (x90Var != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) x90Var.getLayoutParams();
            layoutParams.bottomMargin = AndroidUtilities.dp(24.0f) + i13;
            this.Y.setLayoutParams(layoutParams);
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onPause() {
        super.onPause();
        zh.b0 b0Var = this.L0;
        if (b0Var != null) {
            b0Var.g();
            AndroidUtilities.removeFromParent(this.L0);
            this.L0 = null;
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onRequestPermissionsResultFragment(int i10, String[] strArr, int[] iArr) {
        if (i10 != 44 || getParentActivity() == null) {
            return;
        }
        if (iArr.length > 0 && iArr[0] == 0) {
            F0();
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        alertDialog$Builder.a.T = AndroidUtilities.replaceTags(LocaleController.getString(R.string.QRCodePermissionNoCameraWithHint));
        alertDialog$Builder.k(LocaleController.getString(R.string.PermissionOpenSettings), new s3(this));
        alertDialog$Builder.h(LocaleController.getString(R.string.ContactsPermissionAlertNotNow), null);
        alertDialog$Builder.m(R.raw.permission_request_camera, 72, org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.L5, false), null);
        alertDialog$Builder.o();
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onResume() {
        super.onResume();
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar != null) {
            kVar.post(new p3(this, 9));
        }
        m0.w(this.currentAccount).C();
        if (this.D0 != null && m0.w(this.currentAccount).E()) {
            e0 e0Var = this.D0;
            if (!e0Var.j) {
                e0Var.b();
                e0Var.f(true);
            }
        }
        L0();
        if (this.a != null) {
            R0(true);
        }
    }

    public final FrameLayout p0(TextView textView, Runnable runnable) {
        Context context = textView.getContext();
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(14.0f));
        frameLayout.setBackground(org.telegram.ui.ActionBar.h6.g0(getThemedColor(org.telegram.ui.ActionBar.h6.i6), 2, -1));
        textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.h6.G6));
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(19);
        frameLayout.addView(textView, w7.z5.d(-1, -2.0f, 3, 0.0f, 0.0f, 42.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(R.drawable.attach_arrow_right);
        imageView.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.h6.z6), PorterDuff.Mode.SRC_IN));
        frameLayout.addView(imageView, w7.z5.e(-2, -2, 21));
        frameLayout.setOnClickListener(new t2(runnable, 3));
        textView.setDuplicateParentStateEnabled(true);
        w7.b6.b(textView, 0.02f, 1.2f);
        this.R.addView(frameLayout, w7.z5.n(-1, -2));
        return frameLayout;
    }

    public final CharSequence s0(int i10, long j10) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((char) 65532);
        yq yqVar = new yq(R.drawable.mini_gram_16, 0);
        yqVar.recolorDrawable = false;
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.h6.Oh);
        spannableStringBuilder.setSpan(yqVar, length, spannableStringBuilder.length(), 33);
        spannableStringBuilder.append((CharSequence) " ");
        int length2 = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) m0.n(j10, false));
        spannableStringBuilder.setSpan(new ForegroundColorSpan(themedColor), length2, spannableStringBuilder.length(), 33);
        return LocaleController.formatSpannable(i10, spannableStringBuilder);
    }

    public final c71 t0() {
        if (u0()) {
            ei.h1 h1Var = this.o0;
            View currentView = h1Var == null ? null : h1Var.getCurrentView();
            if (currentView instanceof c71) {
                return (c71) currentView;
            }
        }
        return null;
    }

    public final boolean u0() {
        ai.r rVar;
        if (this.n0 || (rVar = this.m0) == null || !rVar.isAttachedToWindow()) {
            return false;
        }
        ViewParent parent = this.m0.getParent();
        w61 w61Var = this.a;
        return parent == w61Var.V2.m(w61Var.W2.x.size() - 1);
    }

    public final boolean v0() {
        View m10;
        w61 w61Var = this.a;
        return w61Var != null && (m10 = w61Var.V2.m(this.f)) != null && this.x0 < 0.5f && m10.getBottom() > this.a.getPaddingTop();
    }

    public final void y0() {
        e0 e0Var;
        c71 c71Var = this.q0[1];
        if (this.d0 != 1 || c71Var == null || !c71Var.G || (e0Var = this.D0) == null || e0Var.i || e0Var.g || e0Var.k != null || c71Var.V2.N0() < c71Var.W2.x.size() - 3) {
            return;
        }
        this.D0.e();
    }

    public final void z0() {
        l0 l0Var;
        c71 c71Var = this.q0[0];
        if (c71Var == null || !c71Var.G || (l0Var = this.C0) == null || l0Var.h || c71Var.V2.N0() < c71Var.W2.x.size() - 3) {
            return;
        }
        this.C0.h();
    }
}
