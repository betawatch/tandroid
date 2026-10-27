package org.telegram.ui.Wallet;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
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
import bi.mb;
import bi.ob;
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
import org.telegram.messenger.wh;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.a21;
import org.telegram.ui.Components.aa0;
import org.telegram.ui.Components.c10;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.dy0;
import org.telegram.ui.Components.fa0;
import org.telegram.ui.Components.k71;
import org.telegram.ui.Components.kb1;
import org.telegram.ui.Components.l80;
import org.telegram.ui.Components.m71;
import org.telegram.ui.Components.ml;
import org.telegram.ui.Components.n71;
import org.telegram.ui.Components.p10;
import org.telegram.ui.Components.s71;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.u91;
import org.telegram.ui.Components.v91;
import org.telegram.ui.Components.wt;
import org.telegram.ui.Components.x01;
import org.telegram.ui.Components.z11;
import org.telegram.ui.Components.zq;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PasscodeActivity;
import org.telegram.ui.bu0;
import org.telegram.ui.fg1;
import org.telegram.ui.hc1;
import org.telegram.ui.ob0;
import org.telegram.ui.pc0;
import org.telegram.ui.yc1;
import org.telegram.ui.yg1;
import org.telegram.ui.za1;
import org.telegram.ui.zd0;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class m5 extends n71 implements NotificationCenter.NotificationCenterDelegate {
    public static Typeface U0;
    public float A0;
    public fi.d B0;
    public fi.d C0;
    public k0 D0;
    public bh.p E;
    public d0 E0;
    public boolean F;
    public boolean F0;
    public float H0;
    public float I0;
    public ValueAnimator J0;
    public org.telegram.ui.ActionBar.w0 L0;
    public ai.o0 M0;
    public int N0;
    public SpannableString Q0;
    public bh.r R;
    public boolean R0;
    public u4 S;
    public boolean S0;
    public FrameLayout T;
    public yg1 T0;
    public TextView U;
    public FrameLayout V;
    public TextView W;
    public FrameLayout X;
    public TextView Y;
    public aa0 Z;
    public v4 a0;
    public boolean b0;
    public FrameLayout c0;
    public FrameLayout d0;
    public y4 e;
    public v4 f;
    public boolean f0;
    public u91 g0;
    public int h;
    public FrameLayout h0;
    public n8 i0;
    public t7 j0;
    public float l0;
    public ValueAnimator m0;
    public z4 n;
    public bi.r n0;
    public boolean o0;
    public fi.h1 p0;
    public i5 q0;
    public int r;
    public boolean s;
    public LinearLayout s0;
    public org.telegram.ui.Components.s6 t0;
    public org.telegram.ui.Components.s6 u0;
    public v5 v0;
    public b5 w0;
    public FrameLayout x;
    public float x0;
    public View y;
    public float y0;
    public za1 z0;
    public final dy0 v = new dy0(this, 6);
    public final s3 w = new wt() { // from class: org.telegram.ui.Wallet.s3
        @Override // org.telegram.ui.Components.wt
        public final void a(int i10, boolean z10) {
            m71 m71Var;
            m5 m5Var = m5.this;
            dy0 dy0Var = m5Var.v;
            if ((i10 == 1 || i10 == 3) && (m71Var = m5Var.a) != null) {
                m5Var.s = z10;
                m71Var.removeCallbacks(dy0Var);
                dy0Var.run();
            }
        }
    };
    public final Rect G = new Rect();
    public final Matrix H = new Matrix();
    public final Matrix I = new Matrix();
    public final Matrix J = new Matrix();
    public final float[] K = new float[8];
    public final float[] L = new float[8];
    public final float[] M = new float[8];
    public final int[] N = new int[2];
    public final int[] O = new int[2];
    public final int[] P = new int[2];
    public final int[] Q = new int[2];
    public int e0 = 0;
    public String k0 = "";
    public final s71[] r0 = new s71[2];
    public final o3 G0 = new o3(this, 3);
    public final o3 K0 = new o3(this, 4);
    public final CharSequence[] O0 = new CharSequence[2];
    public final HashSet P0 = new HashSet();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v3, types: [org.telegram.ui.Components.v91, org.telegram.ui.Wallet.k4] */
    public static void C0(Context context, int i10, TL_wallet.walletTransaction wallettransaction, Utilities.Callback3 callback3, Utilities.Callback2 callback2, byte[] bArr, org.telegram.ui.Cells.o0 o0Var, org.telegram.ui.ActionBar.u6 u6Var) {
        j2[] j2VarArr;
        View[] viewArr;
        Utilities.Callback2 callback22;
        LinearLayout p02;
        TL_wallet.nftItem nftitem;
        if (context == null) {
            return;
        }
        if ((wallettransaction.peer instanceof TL_wallet.walletTransactionPeerTelegramGift) && (nftitem = wallettransaction.nft) != null) {
            TL_stars.StarGift starGift = nftitem.gift;
            if (starGift instanceof TL_stars.TL_starGiftUnique) {
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) starGift;
                bi.h7 h7Var = new bi.h7(context, i10, 0L, u6Var, null);
                h7Var.i1 = wallettransaction;
                h7Var.J2(tL_starGiftUnique.slug, tL_starGiftUnique, null);
                h7Var.show();
                return;
            }
        }
        j2[] j2VarArr2 = new j2[1];
        View[] viewArr2 = new View[1];
        k0 B = l0.x(i10).B();
        ArrayList arrayList = new ArrayList(B.c);
        int i11 = 0;
        while (true) {
            if (i11 >= arrayList.size()) {
                i11 = -1;
                break;
            } else if (arrayList.get(i11) == wallettransaction || l0.i0(wallettransaction, (TL_wallet.walletTransaction) arrayList.get(i11))) {
                break;
            } else {
                i11++;
            }
        }
        if (callback3 == null && o0Var == null && i11 >= 0) {
            Rect rect = new Rect();
            context.getResources().getDrawable(R.drawable.sheet_shadow_round).getPadding(rect);
            viewArr = viewArr2;
            ?? k4Var = new k4(context, u6Var, arrayList, B, i10, rect, viewArr);
            k4Var.setPosition(i11);
            j2VarArr = j2VarArr2;
            k4Var.setAdapter(new l4(arrayList, context, u6Var, rect, i10, j2VarArr2));
            callback22 = callback2;
            p02 = k4Var;
        } else {
            j2VarArr = j2VarArr2;
            viewArr = viewArr2;
            callback22 = callback2;
            p02 = p0(context, i10, wallettransaction, callback3, callback2, bArr, o0Var, u6Var, j2VarArr, false);
        }
        j2[] j2VarArr3 = j2VarArr;
        m4 m4Var = new m4(context, p02, u6Var, p02, viewArr, context);
        j2VarArr3[0] = m4Var;
        if ((p02 instanceof v91) && callback22 != null) {
            m4Var.setOnDismissListener(new yc1(22, callback22, wallettransaction));
        }
        j2VarArr3[0].setFocusable(callback3 != null);
        j2 j2Var = j2VarArr3[0];
        j2Var.useBackgroundTopPadding = false;
        j2Var.show();
    }

    public static void E0(Context context, org.telegram.ui.ActionBar.u6 u6Var) {
        int i10 = 1;
        org.telegram.ui.ActionBar.k3 i11 = wh.i(1, context, u6Var, false);
        FrameLayout frameLayout = new FrameLayout(context);
        int dp = AndroidUtilities.dp(16.0f);
        int i12 = org.telegram.ui.ActionBar.y6.h5;
        Drawable c02 = org.telegram.ui.ActionBar.y6.c0(dp, org.telegram.ui.ActionBar.y6.w0(i12, u6Var));
        org.telegram.ui.ActionBar.b7 N = org.telegram.ui.ActionBar.f7.N(i12);
        frameLayout.setBackground(c02);
        org.telegram.ui.ActionBar.f7.k(frameLayout, c02, N, null, u6Var);
        frameLayout.setPadding(AndroidUtilities.dp(36.0f), 0, AndroidUtilities.dp(36.0f), AndroidUtilities.dp(14.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(1);
        frameLayout.addView(linearLayout, kb1.g(-2.0f, -1));
        linearLayout.addView(new m6(160, context, false), kb1.x(160, 160, 1, 0, -12, 0, -8));
        TextView textView = new TextView(context);
        textView.setText(LocaleController.getString(R.string.WalletHowItWorks));
        org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.j5, u6Var);
        textView.setTextSize(1, 17.0f);
        textView.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
        textView.setGravity(17);
        TextView e = wh.e(linearLayout, textView, kb1.x(-1, -2, 1, 0, 0, 0, 6), context);
        e.setText(LocaleController.getString(R.string.WalletHowItWorksInfo));
        int i13 = org.telegram.ui.ActionBar.y6.z6;
        org.telegram.ui.ActionBar.f7.V(e, i13, u6Var);
        e.setTextSize(1, 14.0f);
        e.setGravity(17);
        e.setLineSpacing(AndroidUtilities.dp(1.0f), 1.0f);
        linearLayout.addView(e, kb1.x(-1, -2, 1, 0, 0, 0, 24));
        d5 d5Var = new d5(context, u6Var);
        d5Var.setPadding(AndroidUtilities.dp(0.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(0.0f), AndroidUtilities.dp(8.0f));
        d5Var.a(LocaleController.getString(R.string.WalletSendInstantly), LocaleController.getString(R.string.WalletSendInstantlyInfo), R.drawable.wallet_learn_instant);
        linearLayout.addView(d5Var, kb1.o(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
        d5 d5Var2 = new d5(context, u6Var);
        d5Var2.setPadding(AndroidUtilities.dp(0.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(0.0f), AndroidUtilities.dp(8.0f));
        d5Var2.a(LocaleController.getString(R.string.WalletNoFees), LocaleController.getString(R.string.WalletNoFeesInfo), R.drawable.wallet_learn_fees);
        linearLayout.addView(d5Var2, kb1.o(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
        d5 d5Var3 = new d5(context, u6Var);
        d5Var3.setPadding(AndroidUtilities.dp(0.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(0.0f), AndroidUtilities.dp(8.0f));
        d5Var3.a(LocaleController.getString(R.string.WalletBlockchainVerified), LocaleController.getString(R.string.WalletBlockchainVerifiedInfo), R.drawable.wallet_learn_verified);
        linearLayout.addView(d5Var3, kb1.o(0.0f, 0.0f, 0.0f, 14.0f, -1, -2));
        fi.d f7 = wh.f(24, context, u6Var, true);
        f7.setText(LocaleController.getString(R.string.WalletGotIt));
        linearLayout.addView(f7, kb1.x(-1, 48, 1, 0, 0, 0, 0));
        kb1.c(f7, 0.02f, 1.1f);
        aa0 aa0Var = new aa0(context, null);
        org.telegram.ui.ActionBar.f7.V(aa0Var, i13, u6Var);
        aa0Var.setTextSize(1, 13.0f);
        aa0Var.setGravity(17);
        aa0Var.setText(M0(LocaleController.getString(R.string.WalletTermsOfService), org.telegram.ui.ActionBar.y6.gc, u6Var, new p3(context, i10)));
        linearLayout.addView(aa0Var, kb1.o(0.0f, 12.0f, 0.0f, 6.0f, -1, -2));
        i11.customView = frameLayout;
        org.telegram.ui.ActionBar.k3[] k3VarArr = {i11};
        k3VarArr[0].setAllowNestedScroll(true);
        k3VarArr[0].fixNavigationBar();
        f7.setOnClickListener(new w3(k3VarArr, i10));
        k3VarArr[0].show();
    }

    public static void F0(Context context, int i10, org.telegram.ui.ActionBar.u6 u6Var) {
        l0 x9 = l0.x(i10);
        if (x9.G()) {
            String t10 = x9.t();
            if (TextUtils.isEmpty(t10)) {
                return;
            }
            org.telegram.ui.ActionBar.k3 k3Var = new org.telegram.ui.ActionBar.k3(1, context, u6Var, false);
            k3Var.setBackgroundColor(-12207881);
            k3Var.fixNavigationBar(-12207881);
            FrameLayout frameLayout = new FrameLayout(context);
            frameLayout.setBackground(new l5());
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            linearLayout.setGravity(1);
            frameLayout.addView(linearLayout, kb1.j(-2.0f, 55, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(30.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f) + AndroidUtilities.navigationBarHeight));
            k5 k5Var = new k5(context, t10);
            linearLayout.addView(k5Var, kb1.u(288, 302, 1));
            TextView textView = new TextView(context);
            textView.setText(LocaleController.getString(R.string.WalletReceiveInfo));
            textView.setTextColor(-1);
            textView.setTextSize(1, 14.0f);
            textView.setGravity(17);
            textView.setLineSpacing(AndroidUtilities.dp(1.0f), 1.0f);
            linearLayout.addView(textView, kb1.x(-1, -2, 1, 24, 0, 24, 20));
            fi.d dVar = new fi.d(context, null, true);
            dVar.setRoundRadius(24);
            dVar.setColor(-1);
            dVar.setTextColor(-15556886);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) "$");
            spannableStringBuilder.setSpan(new zq(R.drawable.wallet_buy, 0), 0, spannableStringBuilder.length(), 33);
            spannableStringBuilder.append((CharSequence) " ").append((CharSequence) LocaleController.getString(R.string.WalletBuyWithCashOrCrypto));
            dVar.setText(spannableStringBuilder);
            linearLayout.addView(dVar, kb1.x(-1, 48, 1, 0, 0, 0, 0));
            ImageView imageView = new ImageView(context);
            imageView.setImageResource(R.drawable.ic_close_white);
            imageView.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f));
            imageView.setContentDescription(LocaleController.getString(R.string.Close));
            kb1.b(imageView);
            frameLayout.addView(imageView, kb1.h(48, 48.0f, 51, 4.0f, 2.0f, 0.0f, 0.0f));
            k3Var.customView = frameLayout;
            k3Var.occupyNavigationBar = true;
            k3Var.setApplyTopPadding(false);
            k3Var.setApplyBottomPadding(false);
            k3Var.fixNavigationBar(-12207881);
            imageView.setOnClickListener(new n3(k3Var, 0));
            k5Var.e = new q0(t10, 1);
            k3Var.show();
            k3Var.setOverlayNavBarColor(-12207881);
            AndroidUtilities.setNavigationBarColor((Dialog) k3Var, -12207881, false);
            AndroidUtilities.setLightNavigationBar((Dialog) k3Var, false);
            if (Build.VERSION.SDK_INT >= 29 && k3Var.getWindow() != null) {
                k3Var.getWindow().setNavigationBarContrastEnforced(false);
            }
            dVar.setOnClickListener(new di.c6(dVar, i10, k3Var, u6Var, 7));
        }
    }

    public static SpannableStringBuilder M0(String str, int i10, org.telegram.ui.ActionBar.u6 u6Var, Runnable runnable) {
        int i11;
        int i12;
        int indexOf = str.indexOf("**");
        int indexOf2 = str.indexOf("**", indexOf + 1);
        String replace = str.replace("**", "");
        if (indexOf < 0 || indexOf2 < 0 || (i12 = indexOf2 - indexOf) <= 2) {
            indexOf = -1;
            i11 = 0;
        } else {
            i11 = i12 - 2;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(replace);
        if (indexOf >= 0) {
            spannableStringBuilder.setSpan(new h5(i10, u6Var, runnable), indexOf, i11 + indexOf, 0);
        }
        return spannableStringBuilder;
    }

    public static void U0(s71 s71Var, boolean z10) {
        boolean canScrollVertically = s71Var.canScrollVertically(-1);
        s71Var.g3.O(z10);
        s71Var.a0();
        if (canScrollVertically) {
            return;
        }
        s71Var.f3.h1(0, 0);
    }

    public static Uri X0(String str) {
        Uri parse = Uri.parse(str.trim());
        if (parse.getScheme() == null) {
            Uri parse2 = Uri.parse("https://" + str.trim());
            if (x0(parse2.getHost())) {
                return parse2;
            }
        }
        return parse;
    }

    public static String Y0(Uri uri) {
        if (!x0(uri.getHost())) {
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

    public static void Z(m5 m5Var) {
        l0 x9 = l0.x(m5Var.currentAccount);
        fi.d dVar = m5Var.C0;
        if (dVar.Q) {
            return;
        }
        dVar.setLoading(true);
        boolean z10 = false;
        x9.m0(new e2.p0(x9, new s(8, m5Var, x9), z10, z10, 3));
    }

    public static void a0(m5 m5Var) {
        qf.d.r(m5Var.getParentActivity(), l0.x(m5Var.currentAccount).j);
    }

    public static void b0(m5 m5Var) {
        F0(m5Var.getParentActivity(), m5Var.currentAccount, m5Var.getResourceProvider());
    }

    public static void c0(m5 m5Var, String str, l0 l0Var, l80 l80Var, LinearLayout linearLayout, TL_wallet.currencyRate currencyrate) {
        if (currencyrate == null) {
            return;
        }
        org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(2, m5Var.getParentActivity(), m5Var.resourceProvider, false, false);
        g1Var.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
        g1Var.setText(currencyrate.currency);
        g1Var.setSubtext(!TextUtils.isEmpty(currencyrate.translatedTitle) ? currencyrate.translatedTitle : currencyrate.title);
        boolean equals = TextUtils.equals(str, currencyrate.currency);
        g1Var.b.setPadding(0, 0, AndroidUtilities.dp(equals ? 42.0f : 0.0f), 0);
        g1Var.setChecked(equals);
        g1Var.setOnClickListener(new m1(l0Var, currencyrate, l80Var, 2));
        linearLayout.addView(g1Var, kb1.r(200, -2));
    }

    public static void d0(m5 m5Var) {
        org.telegram.ui.ActionBar.k kVar;
        if (m5Var.E == null || (kVar = m5Var.actionBar) == null || !(kVar.getParent() instanceof ViewGroup)) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) m5Var.actionBar.getParent();
        viewGroup.setClipChildren(false);
        viewGroup.setClipToPadding(false);
        if (m5Var.E.getParent() != m5Var.actionBar) {
            AndroidUtilities.removeFromParent(m5Var.E);
            m5Var.actionBar.addView(m5Var.E, kb1.g(-1.0f, -1));
        }
        m5Var.E.bringToFront();
        m5Var.actionBar.bringToFront();
        m5Var.E.post(new o3(m5Var, 10));
    }

    public static void e0(m5 m5Var) {
        F0(m5Var.getParentActivity(), m5Var.currentAccount, m5Var.getResourceProvider());
    }

    public static void f0(m5 m5Var, String str) {
        Uri X0 = X0(str);
        String Y0 = Y0(X0);
        if (Y0 != null) {
            int i10 = m5Var.currentAccount;
            MessagesController.getInstance(i10).getUserNameResolver().resolve(Y0, new fi.c4(i10, new v3(m5Var, 4)));
        } else {
            if ((m5Var.getParentActivity() instanceof LaunchActivity) && new ob0((LaunchActivity) m5Var.getParentActivity(), m5Var.currentAccount, null, false).g(X0)) {
                return;
            }
            AndroidUtilities.runOnUIThread(new o3(m5Var, 11));
        }
    }

    public static void g0(m5 m5Var, LinearLayout linearLayout, l0 l0Var, l80 l80Var) {
        TL_wallet.currencyRate currencyrate;
        m5 m5Var2;
        ArrayList<TL_wallet.currencyRate> arrayList;
        LinearLayout linearLayout2 = linearLayout;
        l0 l0Var2 = l0Var;
        linearLayout2.removeAllViews();
        String g7 = l0Var2.h.g();
        TL_wallet.currencyRates f7 = l0Var2.h.f();
        if (f7 == null) {
            for (int i10 = 0; i10 < 3; i10++) {
                c10 c10Var = new c10(m5Var.getParentActivity(), m5Var.getResourceProvider());
                c10Var.setIsSingleCell(true);
                c10Var.setViewType(31);
                linearLayout2.addView(c10Var, kb1.r(200, -2));
            }
            return;
        }
        f fVar = l0Var2.h;
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
                c0(m5Var, g7, l0Var2, l80Var, linearLayout2, currencyrate7);
            }
            i13++;
            l0Var2 = l0Var;
        }
        if (hashSet.isEmpty() || f7.rates.isEmpty()) {
            m5Var2 = m5Var;
        } else {
            m5Var2 = m5Var;
            linearLayout2.addView(new org.telegram.ui.ActionBar.l1(m5Var.getParentActivity(), m5Var2.resourceProvider), kb1.r(-1, 8));
        }
        int i14 = 0;
        while (i14 < f7.rates.size()) {
            TL_wallet.currencyRate currencyrate8 = f7.rates.get(i14);
            if (currencyrate8 != null && !hashSet.contains(currencyrate8.currency)) {
                c0(m5Var2, g7, l0Var, l80Var, linearLayout2, currencyrate8);
            }
            i14++;
            m5Var2 = m5Var;
            linearLayout2 = linearLayout;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void h0(final m5 m5Var, Context context, View view) {
        l0 x9 = l0.x(m5Var.currentAccount);
        final l80 I = l80.I(m5Var, view);
        I.a0(0.0f, -AndroidUtilities.dp(48.0f));
        final int i10 = 0;
        I.s = 0;
        I.V(5);
        l80 J = I.J();
        J.c(R.drawable.ic_ab_back, LocaleController.getString(R.string.WalletBack), new bu0(I, 26), false);
        J.k();
        ScrollView scrollView = new ScrollView(context);
        LinearLayout linearLayout = new LinearLayout(context);
        final int i11 = 1;
        linearLayout.setOrientation(1);
        scrollView.addView(linearLayout);
        w6 w6Var = new w6(m5Var, linearLayout, x9, I, 10);
        J.r(scrollView, kb1.r(-1, 350));
        I.c(R.drawable.wallet_globe, LocaleController.getString(R.string.WalletCurrency), new h(w6Var, I, J, 8), false);
        org.telegram.ui.ActionBar.g1 y3 = I.y();
        f fVar = x9.h;
        String i12 = fVar.i();
        boolean isEmpty = TextUtils.isEmpty(i12);
        String str = i12;
        if (isEmpty) {
            y3.setSubtext("USD");
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.Loading));
            spannableStringBuilder.setSpan(new fa0(AndroidUtilities.dp(75.0f), y3.b), 0, spannableStringBuilder.length(), 33);
            str = spannableStringBuilder;
        }
        y3.setSubtext(str);
        w6 w6Var2 = new w6(x9, new boolean[]{fVar.f() != null}, y3, w6Var, 11);
        m5Var.P0.add(w6Var2);
        w6Var.run();
        I.c(R.drawable.wallet_lock, LocaleController.getString(R.string.Passcode), new Runnable(m5Var) { // from class: org.telegram.ui.Wallet.z3
            public final /* synthetic */ m5 b;

            {
                this.b = m5Var;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i10) {
                    case 0:
                        m5 m5Var2 = this.b;
                        m5Var2.getClass();
                        I.u();
                        m5Var2.presentFragment(PasscodeActivity.l0());
                        break;
                    case 1:
                        m5 m5Var3 = this.b;
                        m5Var3.getClass();
                        I.u();
                        m5Var3.presentFragment(new h8());
                        break;
                    case 2:
                        m5 m5Var4 = this.b;
                        m5Var4.getClass();
                        I.u();
                        m5Var4.presentFragment(new ca());
                        break;
                    default:
                        I.u();
                        m5 m5Var5 = this.b;
                        m5.E0(m5Var5.getParentActivity(), m5Var5.getResourceProvider());
                        break;
                }
            }
        }, false);
        I.c(R.drawable.wallet_key, LocaleController.getString(R.string.WalletKeysAndBackup), new Runnable(m5Var) { // from class: org.telegram.ui.Wallet.z3
            public final /* synthetic */ m5 b;

            {
                this.b = m5Var;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i11) {
                    case 0:
                        m5 m5Var2 = this.b;
                        m5Var2.getClass();
                        I.u();
                        m5Var2.presentFragment(PasscodeActivity.l0());
                        break;
                    case 1:
                        m5 m5Var3 = this.b;
                        m5Var3.getClass();
                        I.u();
                        m5Var3.presentFragment(new h8());
                        break;
                    case 2:
                        m5 m5Var4 = this.b;
                        m5Var4.getClass();
                        I.u();
                        m5Var4.presentFragment(new ca());
                        break;
                    default:
                        I.u();
                        m5 m5Var5 = this.b;
                        m5.E0(m5Var5.getParentActivity(), m5Var5.getResourceProvider());
                        break;
                }
            }
        }, false);
        final int i13 = 2;
        I.l(R.drawable.wallet_apps, LocaleController.getString(R.string.WalletConnectedApps), new Runnable(m5Var) { // from class: org.telegram.ui.Wallet.z3
            public final /* synthetic */ m5 b;

            {
                this.b = m5Var;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i13) {
                    case 0:
                        m5 m5Var2 = this.b;
                        m5Var2.getClass();
                        I.u();
                        m5Var2.presentFragment(PasscodeActivity.l0());
                        break;
                    case 1:
                        m5 m5Var3 = this.b;
                        m5Var3.getClass();
                        I.u();
                        m5Var3.presentFragment(new h8());
                        break;
                    case 2:
                        m5 m5Var4 = this.b;
                        m5Var4.getClass();
                        I.u();
                        m5Var4.presentFragment(new ca());
                        break;
                    default:
                        I.u();
                        m5 m5Var5 = this.b;
                        m5.E0(m5Var5.getParentActivity(), m5Var5.getResourceProvider());
                        break;
                }
            }
        }, true ^ x9.g.d.isEmpty());
        I.k();
        final int i14 = 3;
        I.c(R.drawable.wallet_help, LocaleController.getString(R.string.WalletWhatIsWallet), new Runnable(m5Var) { // from class: org.telegram.ui.Wallet.z3
            public final /* synthetic */ m5 b;

            {
                this.b = m5Var;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i14) {
                    case 0:
                        m5 m5Var2 = this.b;
                        m5Var2.getClass();
                        I.u();
                        m5Var2.presentFragment(PasscodeActivity.l0());
                        break;
                    case 1:
                        m5 m5Var3 = this.b;
                        m5Var3.getClass();
                        I.u();
                        m5Var3.presentFragment(new h8());
                        break;
                    case 2:
                        m5 m5Var4 = this.b;
                        m5Var4.getClass();
                        I.u();
                        m5Var4.presentFragment(new ca());
                        break;
                    default:
                        I.u();
                        m5 m5Var5 = this.b;
                        m5.E0(m5Var5.getParentActivity(), m5Var5.getResourceProvider());
                        break;
                }
            }
        }, false);
        I.p = new yc1(24, m5Var, w6Var2);
        I.Z();
    }

    public static void i0(m5 m5Var, long j10) {
        o3 o3Var = m5Var.K0;
        if (m5Var.a == null) {
            return;
        }
        n8 n8Var = m5Var.i0;
        if (n8Var != null) {
            n8Var.a();
        }
        if (m5Var.I0 <= 0.0f && m5Var.w0()) {
            int top = m5Var.a.f3.m(m5Var.h).getTop() - m5Var.a.getPaddingTop();
            m5Var.a.C0();
            if (top < 0) {
                m5Var.a.w0(0, top, ds.h);
                return;
            }
            return;
        }
        m5Var.a.C0();
        m5Var.o0(true);
        AndroidUtilities.cancelRunOnUIThread(o3Var);
        if (j10 > 0) {
            AndroidUtilities.runOnUIThread(o3Var, j10 + 260);
        }
    }

    public static Typeface n0(Context context) {
        if (U0 == null) {
            if (Build.VERSION.SDK_INT >= 26) {
                U0 = new Typeface.Builder(context.getAssets(), "fonts/rmono_var.ttf").setFontVariationSettings("'wght' 500").setWeight(500).build();
            } else {
                U0 = AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MONO);
            }
        }
        return U0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:112:0x03a6  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x03d6 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x03e7  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x05b7  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x063e  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0688  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0625  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0553  */
    /* JADX WARN: Type inference failed for: r14v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v33 */
    /* JADX WARN: Type inference failed for: r1v34, types: [android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r1v36 */
    /* JADX WARN: Type inference failed for: r2v1, types: [android.view.View, android.view.ViewGroup, android.widget.LinearLayout] */
    /* JADX WARN: Type inference failed for: r5v0, types: [android.view.ViewGroup, android.widget.LinearLayout] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static LinearLayout p0(final Context context, int i10, TL_wallet.walletTransaction wallettransaction, Utilities.Callback3 callback3, Utilities.Callback2 callback2, byte[] bArr, Runnable runnable, org.telegram.ui.ActionBar.u6 u6Var, j2[] j2VarArr, boolean z10) {
        String t10;
        String str;
        n4 n4Var;
        ImageView imageView;
        ImageView imageView2;
        int i11;
        float f7;
        final org.telegram.ui.ActionBar.u6 u6Var2;
        ImageView imageView3;
        TextView textView;
        x01 x01Var;
        SpannableString[] spannableStringArr;
        LinearLayout linearLayout;
        String[] strArr;
        TextView[] textViewArr;
        final boolean[] zArr;
        TL_wallet.walletTransaction wallettransaction2;
        int i12;
        q4 q4Var;
        o4 o4Var;
        int i13;
        q4 q4Var2;
        final j2[] j2VarArr2;
        Object s10;
        int i14;
        ?? r12;
        float f10;
        boolean z11 = callback3 != null;
        final ?? d = wh.d(context, 1);
        FrameLayout frameLayout = new FrameLayout(context);
        d.addView(frameLayout, kb1.r(-1, 56));
        int i15 = org.telegram.ui.ActionBar.y6.G6;
        org.telegram.ui.ActionBar.y6.w0(i15, u6Var);
        int i16 = org.telegram.ui.ActionBar.y6.i6;
        int w02 = org.telegram.ui.ActionBar.y6.w0(i16, u6Var);
        ImageView imageView4 = new ImageView(context);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView4.setScaleType(scaleType);
        imageView4.setImageResource(R.drawable.ic_ab_close);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        org.telegram.ui.ActionBar.f7.t(imageView4, i15, u6Var, mode);
        org.telegram.ui.Cells.y g02 = org.telegram.ui.ActionBar.y6.g0(w02, 1, -1);
        org.telegram.ui.ActionBar.b7 N = org.telegram.ui.ActionBar.f7.N(i16);
        imageView4.setBackground(g02);
        org.telegram.ui.ActionBar.f7.k(imageView4, g02, null, N, u6Var);
        imageView4.setContentDescription(LocaleController.getString(R.string.Close));
        frameLayout.addView(imageView4, kb1.h(48, 48.0f, 19, 4.0f, -2.0f, 0.0f, 0.0f));
        ImageView imageView5 = new ImageView(context);
        imageView5.setScaleType(scaleType);
        imageView5.setImageResource(R.drawable.ic_ab_other);
        org.telegram.ui.ActionBar.f7.t(imageView5, i15, u6Var, mode);
        org.telegram.ui.Cells.y g03 = org.telegram.ui.ActionBar.y6.g0(w02, 1, -1);
        org.telegram.ui.ActionBar.b7 N2 = org.telegram.ui.ActionBar.f7.N(i16);
        imageView5.setBackground(g03);
        org.telegram.ui.ActionBar.f7.k(imageView5, g03, null, N2, u6Var);
        imageView5.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        imageView5.setVisibility(callback3 != null ? 8 : 0);
        frameLayout.addView(imageView5, kb1.h(44, 48.0f, 21, 0.0f, 2.0f, 4.0f, 0.0f));
        ?? linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        linearLayout2.setGravity(1);
        d.addView(linearLayout2, kb1.o(14.0f, wallettransaction.key_change ? -20.0f : -40.0f, 14.0f, 24.0f, -1, -2));
        m6 m6Var = new m6(120, context, z10);
        m6Var.setTag(m6.class);
        linearLayout2.addView(m6Var, kb1.x(120, 120, 1, 0, 0, 0, -8));
        n4 n4Var2 = new n4(context);
        n4Var2.setSingleLine(true);
        n4Var2.setGravity(17);
        n4Var2.setIncludeFontPadding(false);
        n4Var2.setTextSize(1, 40.0f);
        n4Var2.setTypeface(AndroidUtilities.bold());
        linearLayout2.addView(n4Var2, kb1.u(-1, 50, 1));
        TextView textView2 = new TextView(context);
        textView2.setGravity(17);
        textView2.setIncludeFontPadding(false);
        textView2.setTextSize(1, 14.0f);
        int i17 = org.telegram.ui.ActionBar.y6.z6;
        org.telegram.ui.ActionBar.f7.V(textView2, i17, u6Var);
        linearLayout2.addView(textView2, kb1.x(-1, 20, 1, 0, 3, 0, 0));
        if (wallettransaction.key_change) {
            linearLayout2.removeAllViews();
            FrameLayout frameLayout2 = new FrameLayout(context);
            frameLayout2.setBackground(org.telegram.ui.ActionBar.y6.L(AndroidUtilities.dp(76.0f), -7956054, -9534569));
            ImageView imageView6 = new ImageView(context);
            imageView6.setImageResource(R.drawable.wallet_transaction_key);
            imageView6.setScaleType(ImageView.ScaleType.FIT_CENTER);
            frameLayout2.addView(imageView6, kb1.i(44, 44, 17));
            linearLayout2.addView(frameLayout2, kb1.u(76, 76, 1));
            TextView textView3 = new TextView(context);
            textView3.setText(LocaleController.getString(R.string.WalletKeyUpdate));
            org.telegram.ui.ActionBar.f7.V(textView3, i15, u6Var);
            textView3.setTextSize(1, 18.0f);
            textView3.setTypeface(AndroidUtilities.bold());
            textView3.setGravity(17);
            textView3.setIncludeFontPadding(false);
            linearLayout2.addView(textView3, kb1.x(-1, 24, 1, 12, 12, 12, 0));
        } else if (wallettransaction.nft != null) {
            linearLayout2.removeAllViews();
            TL_wallet.nftItem nftitem = wallettransaction.nft;
            org.telegram.ui.Components.y9 y9Var = new org.telegram.ui.Components.y9(context);
            y9Var.setRoundRadius(AndroidUtilities.dp(12.0f));
            y9Var.setContentDescription(nftitem.name);
            Drawable mutate = context.getResources().getDrawable(R.drawable.wallet_nft_placeholder).mutate();
            org.telegram.ui.ActionBar.f7.y(y9Var, mutate, i17, u6Var, mode);
            ImageLocation c10 = c.c(nftitem, false);
            if (c10 != null) {
                y9Var.h(c10, "120_120", mutate, nftitem);
            } else {
                y9Var.setImageDrawable(mutate);
            }
            linearLayout2.addView(y9Var, kb1.u(120, 120, 1));
            TextView textView4 = new TextView(context);
            textView4.setText(TextUtils.isEmpty(nftitem.name) ? LocaleController.getString(R.string.WalletCollectible) : nftitem.name);
            org.telegram.messenger.t.r(textView4, i15, u6Var, 1, 17.0f);
            textView4.setGravity(17);
            linearLayout2.addView(textView4, kb1.o(12.0f, 16.0f, 12.0f, 0.0f, -1, -2));
        }
        if (wallettransaction.incoming) {
            TL_wallet.WalletTransactionPeer walletTransactionPeer = wallettransaction.peer;
            if (walletTransactionPeer == null) {
                str = null;
                if (callback3 != null) {
                    float f11 = 15.0f;
                    if (wallettransaction.comment_encrypted || wallettransaction.comment_encrypted_preparing) {
                        f7 = 11.0f;
                        if (wallettransaction.comment_encrypted_preparing || !TextUtils.isEmpty(str)) {
                            xh.n nVar = new xh.n(context, u6Var, false);
                            nVar.r = false;
                            nVar.setTextSize(1, 15.0f);
                            org.telegram.ui.ActionBar.f7.V(nVar, i15, u6Var);
                            StringBuilder sb2 = new StringBuilder(25);
                            int i18 = 0;
                            while (true) {
                                f10 = f11;
                                if (i18 >= 25) {
                                    break;
                                }
                                sb2.append("a");
                                i18++;
                                f11 = f10;
                            }
                            SpannableString spannableString = new SpannableString(sb2.toString());
                            z11 z11Var = new z11();
                            z11Var.a |= 256;
                            spannableString.setSpan(new a21(z11Var, 0), 0, spannableString.length(), 33);
                            nVar.setText(spannableString);
                            org.telegram.ui.ActionBar.l5 l5Var = new org.telegram.ui.ActionBar.l5(0, false, false, null);
                            l5Var.x = false;
                            l5Var.w = Integer.valueOf(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.jl, u6Var));
                            nVar.setBackground(l5Var);
                            nVar.setPadding(AndroidUtilities.dp(19.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(f10), AndroidUtilities.dp(11.0f));
                            linearLayout2.addView(nVar, kb1.x(-2, -2, 1, 32, 15, 32, 0));
                            kb1.b(nVar);
                            i11 = 1;
                            n4Var = n4Var2;
                            imageView = imageView4;
                            imageView2 = imageView5;
                            u6Var2 = u6Var;
                            nVar.setOnClickListener(new ob(new boolean[]{false}, j2VarArr, u6Var, nVar, wallettransaction, i10, str));
                            SpannableString[] spannableStringArr2 = new SpannableString[i11];
                            TextView[] textViewArr2 = new TextView[i11];
                            x01 x01Var2 = new x01(context, u6Var2);
                            d.addView(x01Var2, kb1.o(14.0f, 0.0f, 14.0f, 0.0f, -1, -2));
                            final String[] strArr2 = {wallettransaction.comment};
                            boolean[] zArr2 = {(wallettransaction.comment_encrypted || (z11 && bArr == null)) ? false : true};
                            if (callback3 != null) {
                                FrameLayout frameLayout3 = new FrameLayout(context);
                                int dp = AndroidUtilities.dp(22.0f);
                                int dp2 = AndroidUtilities.dp(22.0f);
                                int i19 = org.telegram.ui.ActionBar.y6.a7;
                                ShapeDrawable d02 = org.telegram.ui.ActionBar.y6.d0(dp, dp2, org.telegram.ui.ActionBar.y6.w0(i19, u6Var2));
                                org.telegram.ui.ActionBar.b7 N3 = org.telegram.ui.ActionBar.f7.N(i19);
                                frameLayout3.setBackground(d02);
                                org.telegram.ui.ActionBar.f7.k(frameLayout3, d02, N3, null, u6Var2);
                                final yc1 yc1Var = new yc1(21, textViewArr2, spannableStringArr2);
                                final Runnable[] runnableArr = new Runnable[1];
                                ImageView imageView7 = imageView;
                                textView = textView2;
                                final FrameLayout frameLayout4 = frameLayout3;
                                final org.telegram.messenger.e6 e6Var = new org.telegram.messenger.e6(runnableArr, textViewArr2, i10, u6Var, wallettransaction, strArr2, zArr2, bArr);
                                textViewArr = textViewArr2;
                                zArr = zArr2;
                                wallettransaction2 = wallettransaction;
                                o4 o4Var2 = new o4(context, u6Var);
                                o4Var2.setHint(LocaleController.getString(R.string.WalletOptionalComment));
                                o4Var2.setText(strArr2[0]);
                                x01Var = x01Var2;
                                o4Var2.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(f7), AndroidUtilities.dp(64.0f), AndroidUtilities.dp(12.0f));
                                int i20 = org.telegram.ui.ActionBar.y6.G6;
                                org.telegram.ui.ActionBar.f7.V(o4Var2, i20, u6Var);
                                org.telegram.ui.ActionBar.b7 L = org.telegram.ui.ActionBar.f7.L(0.65f, i20);
                                spannableStringArr = spannableStringArr2;
                                org.telegram.ui.ActionBar.f7.o(o4Var2, 1, L.a, -1, 2, L.d, u6Var);
                                u6Var2 = u6Var;
                                o4Var2.setMaxLines(4);
                                frameLayout4.addView(o4Var2, kb1.h(-1, -2.0f, 119, 0.0f, 0.0f, (wallettransaction2.nft != null || bArr == null) ? 0.0f : 44.0f, 0.0f));
                                o4Var2.addTextChangedListener(new p4(strArr2, yc1Var, runnableArr, e6Var));
                                if (wallettransaction2.nft != null || bArr == null) {
                                    strArr = strArr2;
                                    r12 = d;
                                    o4Var = o4Var2;
                                    imageView3 = imageView7;
                                    i12 = 0;
                                    q4Var = null;
                                } else {
                                    FrameLayout frameLayout5 = new FrameLayout(context);
                                    kb1.b(frameLayout5);
                                    final ImageView imageView8 = new ImageView(context);
                                    frameLayout5.addView(imageView8, kb1.g(-1.0f, -1));
                                    imageView8.setScaleType(ImageView.ScaleType.CENTER);
                                    org.telegram.ui.ActionBar.f7.t(imageView8, zArr[0] ? org.telegram.ui.ActionBar.y6.Oh : org.telegram.ui.ActionBar.y6.z6, u6Var2, PorterDuff.Mode.SRC_IN);
                                    imageView8.setImageResource(zArr[0] ? R.drawable.wallet_comment_locked : R.drawable.wallet_comment_unlocked);
                                    int i21 = org.telegram.ui.ActionBar.y6.i6;
                                    org.telegram.ui.Cells.y g04 = org.telegram.ui.ActionBar.y6.g0(org.telegram.ui.ActionBar.y6.w0(i21, u6Var2), 1, -1);
                                    org.telegram.ui.ActionBar.b7 N4 = org.telegram.ui.ActionBar.f7.N(i21);
                                    imageView8.setBackground(g04);
                                    org.telegram.ui.ActionBar.f7.k(imageView8, g04, null, N4, u6Var2);
                                    q4Var = null;
                                    final fi.v3[] v3VarArr = new fi.v3[1];
                                    i12 = 0;
                                    imageView3 = imageView7;
                                    o4Var = o4Var2;
                                    View.OnClickListener onClickListener = new View.OnClickListener() { // from class: org.telegram.ui.Wallet.y3
                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view) {
                                            final boolean[] zArr3 = zArr;
                                            zArr3[0] = !zArr3[0];
                                            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
                                            final AtomicBoolean atomicBoolean = new AtomicBoolean();
                                            final ImageView imageView9 = imageView8;
                                            final org.telegram.ui.ActionBar.u6 u6Var3 = u6Var2;
                                            duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Wallet.c4
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
                                                        org.telegram.ui.ActionBar.f7.t(imageView10, zArr4[0] ? org.telegram.ui.ActionBar.y6.Oh : org.telegram.ui.ActionBar.y6.z6, u6Var3, PorterDuff.Mode.SRC_IN);
                                                        imageView10.setImageResource(zArr4[0] ? R.drawable.wallet_comment_locked : R.drawable.wallet_comment_unlocked);
                                                    }
                                                }
                                            });
                                            duration.setInterpolator(ds.h);
                                            duration.setDuration(420L);
                                            duration.start();
                                            fi.v3[] v3VarArr2 = v3VarArr;
                                            fi.v3 v3Var = v3VarArr2[0];
                                            if (v3Var != null) {
                                                v3Var.e(true);
                                                v3VarArr2[0] = null;
                                            }
                                            LinearLayout linearLayout3 = d;
                                            if (linearLayout3.getParent() instanceof FrameLayout) {
                                                FrameLayout frameLayout6 = (FrameLayout) linearLayout3.getParent();
                                                fi.v3 v3Var2 = new fi.v3(context, 3);
                                                v3VarArr2[0] = v3Var2;
                                                v3Var2.r();
                                                v3Var2.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
                                                v3Var2.s(LocaleController.getString(zArr3[0] ? R.string.WalletPrivateCommentInfo : R.string.WalletPublicCommentInfo));
                                                v3Var2.setTranslationY(-(AndroidUtilities.dp(44.0f) + (linearLayout3.getHeight() - frameLayout4.getBottom())));
                                                v3Var2.m(1.0f, -AndroidUtilities.dp(26.0f));
                                                v3Var2.q(20.0f);
                                                float dp3 = AndroidUtilities.dp(12.0f);
                                                float dp4 = AndroidUtilities.dp(4.0f);
                                                int o12 = org.telegram.ui.ActionBar.y6.o1(0.25f, -16777216);
                                                v3Var2.i0 = dp3;
                                                v3Var2.j0 = dp4;
                                                v3Var2.k0 = o12;
                                                v3Var2.F.setShadowLayer(dp3, 0.0f, dp4, o12);
                                                frameLayout6.addView(v3Var2, kb1.i(-1, 200, 87));
                                                v3Var2.u();
                                                v3Var2.l0 = new m(v3Var2, 7);
                                            }
                                            if (TextUtils.isEmpty(strArr2[0])) {
                                                return;
                                            }
                                            yc1Var.run();
                                            Runnable[] runnableArr2 = runnableArr;
                                            Runnable runnable2 = runnableArr2[0];
                                            if (runnable2 != null) {
                                                runnable2.run();
                                                runnableArr2[0] = null;
                                            }
                                            org.telegram.messenger.e6 e6Var2 = e6Var;
                                            AndroidUtilities.cancelRunOnUIThread(e6Var2);
                                            AndroidUtilities.runOnUIThread(e6Var2, 1000L);
                                        }
                                    };
                                    r12 = d;
                                    frameLayout4 = frameLayout4;
                                    strArr = strArr2;
                                    u6Var2 = u6Var2;
                                    frameLayout5.setOnClickListener(onClickListener);
                                    frameLayout4.addView(frameLayout5, kb1.i(44, 44, 85));
                                }
                                r12.addView(frameLayout4, kb1.o(14.0f, 12.0f, 14.0f, 8.0f, -1, -2));
                                linearLayout = r12;
                            } else {
                                imageView3 = imageView;
                                textView = textView2;
                                x01Var = x01Var2;
                                spannableStringArr = spannableStringArr2;
                                linearLayout = d;
                                strArr = strArr2;
                                textViewArr = textViewArr2;
                                zArr = zArr2;
                                wallettransaction2 = wallettransaction;
                                i12 = 0;
                                q4Var = null;
                                o4Var = null;
                            }
                            fi.d f12 = wh.f(24, context, u6Var2, true);
                            f12.setText(LocaleController.getString(R.string.OK));
                            linearLayout.addView(f12, kb1.o(14.0f, 14.0f, 14.0f, 14.0f, -1, 48));
                            TL_wallet.walletTransaction[] wallettransactionArr = new TL_wallet.walletTransaction[1];
                            wallettransactionArr[i12] = wallettransaction2;
                            di.s sVar = new di.s(linearLayout, n4Var, u6Var2, i10, textView, j2VarArr, x01Var, callback3, context, textViewArr, spannableStringArr);
                            LinearLayout linearLayout3 = linearLayout;
                            linearLayout3.setTag(new yc1(23, sVar, wallettransactionArr));
                            sVar.run(wallettransaction2);
                            if (z11) {
                                i13 = i10;
                                q4Var2 = q4Var;
                            } else {
                                i13 = i10;
                                q4 q4Var3 = new q4(i13, wallettransactionArr, sVar);
                                if (wallettransaction2.preview) {
                                    l0 x9 = l0.x(i13);
                                    String str2 = wallettransaction2.id;
                                    o oVar = new o(wallettransaction2, sVar, wallettransactionArr, 4);
                                    HashMap hashMap = x9.K;
                                    k0 k0Var = x9.n;
                                    if (k0Var != null) {
                                        ArrayList arrayList = k0Var.c;
                                        int size = arrayList.size();
                                        int i22 = i12;
                                        while (i22 < size) {
                                            Object obj = arrayList.get(i22);
                                            i22++;
                                            TL_wallet.walletTransaction wallettransaction3 = (TL_wallet.walletTransaction) obj;
                                            if (TextUtils.equals(wallettransaction3.id, str2)) {
                                                oVar.run(wallettransaction3);
                                                break;
                                            }
                                        }
                                    }
                                    if (hashMap.get(str2) != null) {
                                        oVar.run((TL_wallet.walletTransaction) hashMap.get(str2));
                                    } else {
                                        TL_wallet.getTransactionsByIDs gettransactionsbyids = new TL_wallet.getTransactionsByIDs();
                                        gettransactionsbyids.id.add(str2);
                                        ConnectionsManager.getInstance(x9.a).sendRequestTyped(gettransactionsbyids, new org.telegram.messenger.a(), new j(x9, (Object) oVar, (Object) str2, 2));
                                    }
                                }
                                q4Var2 = q4Var3;
                            }
                            String[] strArr3 = strArr;
                            linearLayout3.addOnAttachStateChangeListener(new r4(sVar, wallettransactionArr, q4Var2, i13, callback2, j2VarArr, strArr3, zArr));
                            if (callback3 != null) {
                                int i23 = R.string.WalletSendAmount;
                                TL_wallet.nftItem nftitem2 = wallettransaction2.nft;
                                if (nftitem2 != null) {
                                    s10 = TextUtils.isEmpty(nftitem2.name) ? LocaleController.getString(R.string.WalletCollectible) : wallettransaction2.nft.name;
                                    i14 = i12;
                                } else {
                                    long abs = Math.abs(wallettransaction2.amount);
                                    ?? r14 = i12;
                                    s10 = l0.s(abs, r14);
                                    i14 = r14;
                                }
                                Object[] objArr = new Object[1];
                                objArr[i14] = s10;
                                f12.setText(LocaleController.formatSpannable(i23, objArr));
                                j2VarArr2 = j2VarArr;
                                f12.setOnClickListener(new org.telegram.messenger.video.f(f12, o4Var, callback3, strArr3, zArr, j2VarArr2, u6Var));
                            } else {
                                j2VarArr2 = j2VarArr;
                                if (runnable != null) {
                                    f12.setText(LocaleController.getString(R.string.WalletOpenMyWallet));
                                    f12.setOnClickListener(new zd0(26, runnable, j2VarArr2));
                                } else {
                                    final int i24 = 0;
                                    f12.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Wallet.x3
                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view) {
                                            switch (i24) {
                                                case 0:
                                                    j2VarArr2[0].dismiss();
                                                    break;
                                                default:
                                                    j2VarArr2[0].dismiss();
                                                    break;
                                            }
                                        }
                                    });
                                }
                            }
                            final int i25 = 1;
                            imageView3.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Wallet.x3
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    switch (i25) {
                                        case 0:
                                            j2VarArr2[0].dismiss();
                                            break;
                                        default:
                                            j2VarArr2[0].dismiss();
                                            break;
                                    }
                                }
                            });
                            ImageView imageView9 = imageView2;
                            imageView9.setOnClickListener(new mb(j2VarArr2, u6Var, imageView9, wallettransactionArr, context, i10));
                            return linearLayout3;
                        }
                    } else if (TextUtils.isEmpty(wallettransaction.comment)) {
                        f7 = 11.0f;
                    } else {
                        xh.n nVar2 = new xh.n(context);
                        nVar2.setTextSize(1, 15.0f);
                        org.telegram.ui.ActionBar.f7.V(nVar2, i15, u6Var);
                        f7 = 11.0f;
                        nVar2.setText(Emoji.replaceEmoji(wallettransaction.comment, nVar2.getPaint().getFontMetricsInt(), false));
                        nVar2.setTextIsSelectable(true);
                        org.telegram.ui.ActionBar.l5 l5Var2 = new org.telegram.ui.ActionBar.l5(0, false, false, null);
                        l5Var2.x = false;
                        l5Var2.w = Integer.valueOf(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.jl, u6Var));
                        nVar2.setBackground(l5Var2);
                        nVar2.setPadding(AndroidUtilities.dp(19.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(15.0f), AndroidUtilities.dp(8.0f));
                        linearLayout2.addView(nVar2, kb1.x(-2, -2, 1, 32, 16, 32, 0));
                    }
                    n4Var = n4Var2;
                    imageView = imageView4;
                    imageView2 = imageView5;
                    i11 = 1;
                } else {
                    n4Var = n4Var2;
                    imageView = imageView4;
                    imageView2 = imageView5;
                    i11 = 1;
                    f7 = 11.0f;
                }
                u6Var2 = u6Var;
                SpannableString[] spannableStringArr22 = new SpannableString[i11];
                TextView[] textViewArr22 = new TextView[i11];
                x01 x01Var22 = new x01(context, u6Var2);
                d.addView(x01Var22, kb1.o(14.0f, 0.0f, 14.0f, 0.0f, -1, -2));
                final String[] strArr22 = {wallettransaction.comment};
                boolean[] zArr22 = {(wallettransaction.comment_encrypted || (z11 && bArr == null)) ? false : true};
                if (callback3 != null) {
                }
                fi.d f122 = wh.f(24, context, u6Var2, true);
                f122.setText(LocaleController.getString(R.string.OK));
                linearLayout.addView(f122, kb1.o(14.0f, 14.0f, 14.0f, 14.0f, -1, 48));
                TL_wallet.walletTransaction[] wallettransactionArr2 = new TL_wallet.walletTransaction[1];
                wallettransactionArr2[i12] = wallettransaction2;
                di.s sVar2 = new di.s(linearLayout, n4Var, u6Var2, i10, textView, j2VarArr, x01Var, callback3, context, textViewArr, spannableStringArr);
                LinearLayout linearLayout32 = linearLayout;
                linearLayout32.setTag(new yc1(23, sVar2, wallettransactionArr2));
                sVar2.run(wallettransaction2);
                if (z11) {
                }
                String[] strArr32 = strArr;
                linearLayout32.addOnAttachStateChangeListener(new r4(sVar2, wallettransactionArr2, q4Var2, i13, callback2, j2VarArr, strArr32, zArr));
                if (callback3 != null) {
                }
                final int i252 = 1;
                imageView3.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Wallet.x3
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i252) {
                            case 0:
                                j2VarArr2[0].dismiss();
                                break;
                            default:
                                j2VarArr2[0].dismiss();
                                break;
                        }
                    }
                });
                ImageView imageView92 = imageView2;
                imageView92.setOnClickListener(new mb(j2VarArr2, u6Var, imageView92, wallettransactionArr2, context, i10));
                return linearLayout32;
            }
            t10 = walletTransactionPeer.address;
        } else {
            t10 = l0.x(i10).t();
        }
        str = t10;
        if (callback3 != null) {
        }
        u6Var2 = u6Var;
        SpannableString[] spannableStringArr222 = new SpannableString[i11];
        TextView[] textViewArr222 = new TextView[i11];
        x01 x01Var222 = new x01(context, u6Var2);
        d.addView(x01Var222, kb1.o(14.0f, 0.0f, 14.0f, 0.0f, -1, -2));
        final String[] strArr222 = {wallettransaction.comment};
        boolean[] zArr222 = {(wallettransaction.comment_encrypted || (z11 && bArr == null)) ? false : true};
        if (callback3 != null) {
        }
        fi.d f1222 = wh.f(24, context, u6Var2, true);
        f1222.setText(LocaleController.getString(R.string.OK));
        linearLayout.addView(f1222, kb1.o(14.0f, 14.0f, 14.0f, 14.0f, -1, 48));
        TL_wallet.walletTransaction[] wallettransactionArr22 = new TL_wallet.walletTransaction[1];
        wallettransactionArr22[i12] = wallettransaction2;
        di.s sVar22 = new di.s(linearLayout, n4Var, u6Var2, i10, textView, j2VarArr, x01Var, callback3, context, textViewArr, spannableStringArr);
        LinearLayout linearLayout322 = linearLayout;
        linearLayout322.setTag(new yc1(23, sVar22, wallettransactionArr22));
        sVar22.run(wallettransaction2);
        if (z11) {
        }
        String[] strArr322 = strArr;
        linearLayout322.addOnAttachStateChangeListener(new r4(sVar22, wallettransactionArr22, q4Var2, i13, callback2, j2VarArr, strArr322, zArr));
        if (callback3 != null) {
        }
        final int i2522 = 1;
        imageView3.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Wallet.x3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i2522) {
                    case 0:
                        j2VarArr2[0].dismiss();
                        break;
                    default:
                        j2VarArr2[0].dismiss();
                        break;
                }
            }
        });
        ImageView imageView922 = imageView2;
        imageView922.setOnClickListener(new mb(j2VarArr2, u6Var, imageView922, wallettransactionArr22, context, i10));
        return linearLayout322;
    }

    public static String r0(String str) {
        StringBuilder sb2 = new StringBuilder((str.length() / 4) + str.length());
        for (int i10 = 0; i10 < str.length(); i10++) {
            if (i10 > 0 && i10 % 4 == 0) {
                sb2.append(' ');
            }
            sb2.append(str.charAt(i10));
        }
        return sb2.toString();
    }

    public static SpannableStringBuilder s0(int i10, long j10, org.telegram.ui.ActionBar.u6 u6Var) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("G ");
        zq zqVar = new zq(R.drawable.wallet_gram_small, 2);
        zqVar.recolorDrawable = false;
        zqVar.setSize(AndroidUtilities.dp(16.0f));
        spannableStringBuilder.setSpan(zqVar, 0, 1, 33);
        BigDecimal movePointLeft = new BigDecimal(j10).movePointLeft(9);
        spannableStringBuilder.append((CharSequence) (movePointLeft.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : movePointLeft.stripTrailingZeros()).toPlainString());
        CharSequence m10 = l0.x(i10).m(j10, true);
        if (!TextUtils.isEmpty(m10)) {
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) "  ~\u2009").append(m10);
            spannableStringBuilder.setSpan(new p10(org.telegram.ui.ActionBar.y6.z6, u6Var), length, spannableStringBuilder.length(), 33);
        }
        return spannableStringBuilder;
    }

    public static boolean x0(String str) {
        if (str != null) {
            return "t.me".equalsIgnoreCase(str) || "telegram.me".equalsIgnoreCase(str) || "telegram.dog".equalsIgnoreCase(str);
        }
        return false;
    }

    public static boolean y0(Uri uri) {
        String scheme = uri.getScheme();
        if (!"ton".equalsIgnoreCase(scheme) && !"tc".equalsIgnoreCase(scheme)) {
            if (("https".equalsIgnoreCase(scheme) || "http".equalsIgnoreCase(scheme)) && x0(uri.getHost())) {
                List<String> pathSegments = uri.getPathSegments();
                if (pathSegments.size() != 1 || (!"sendgrams".equalsIgnoreCase(pathSegments.get(0)) && Y0(uri) == null)) {
                }
            }
            return false;
        }
        return true;
    }

    public final void A0() {
        k0 k0Var;
        s71 s71Var = this.r0[0];
        if (s71Var == null || !s71Var.G || (k0Var = this.D0) == null || k0Var.h || s71Var.f3.N0() < s71Var.g3.y.size() - 3) {
            return;
        }
        this.D0.h();
    }

    public final CharSequence B0(int i10) {
        CharSequence[] charSequenceArr = this.O0;
        if (charSequenceArr[i10] == null) {
            charSequenceArr[i10] = new SpannableString("l");
            fa0 fa0Var = new fa0(AndroidUtilities.dp(i10 == 0 ? 100.0f : 50.0f), i10 == 0 ? this.t0 : this.u0);
            fa0Var.a(org.telegram.ui.ActionBar.y6.o1(0.45f, -1), org.telegram.ui.ActionBar.y6.o1(0.2f, -1));
            CharSequence charSequence = charSequenceArr[i10];
            ((SpannableString) charSequence).setSpan(fa0Var, 0, charSequence.length(), 33);
        }
        return charSequenceArr[i10];
    }

    public final void D0(TL_wallet.nftItem nftitem) {
        TL_stars.StarGift starGift = nftitem.gift;
        if (starGift instanceof TL_stars.TL_starGiftUnique) {
            TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) starGift;
            bi.h7 h7Var = new bi.h7(getParentActivity(), this.currentAccount, 0L, getResourceProvider(), null);
            h7Var.f1 = nftitem;
            if (this.j0 != null) {
                h7Var.g1 = new s4(this, tL_starGiftUnique, nftitem);
                h7Var.h1 = new t4(this, nftitem);
            }
            h7Var.J2(tL_starGiftUnique.slug, tL_starGiftUnique, null);
            showDialog(h7Var);
            return;
        }
        Activity parentActivity = getParentActivity();
        org.telegram.ui.ActionBar.u6 resourceProvider = getResourceProvider();
        if (parentActivity != null) {
            int w02 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.a7, resourceProvider);
            int i10 = org.telegram.ui.ActionBar.y6.G6;
            org.telegram.ui.ActionBar.y6.w0(i10, resourceProvider);
            i4 i4Var = new i4(parentActivity, resourceProvider);
            i4Var.setBackgroundColor(w02);
            i4Var.fixNavigationBar(w02);
            ScrollView scrollView = new ScrollView(parentActivity);
            scrollView.setFillViewport(true);
            scrollView.setVerticalScrollBarEnabled(false);
            LinearLayout linearLayout = new LinearLayout(parentActivity);
            linearLayout.setOrientation(1);
            linearLayout.setGravity(1);
            linearLayout.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(28.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f));
            scrollView.addView(linearLayout, new FrameLayout.LayoutParams(-1, -2));
            org.telegram.ui.Components.y9 y9Var = new org.telegram.ui.Components.y9(parentActivity);
            y9Var.setRoundRadius(AndroidUtilities.dp(12.0f));
            y9Var.setContentDescription(nftitem.name);
            Drawable mutate = parentActivity.getResources().getDrawable(R.drawable.wallet_nft_placeholder).mutate();
            int i11 = org.telegram.ui.ActionBar.y6.z6;
            org.telegram.ui.ActionBar.f7.y(y9Var, mutate, i11, resourceProvider, PorterDuff.Mode.SRC_IN);
            ImageLocation c10 = c.c(nftitem, false);
            if (c10 != null) {
                y9Var.h(c10, "120_120", mutate, nftitem);
            } else {
                y9Var.setImageDrawable(mutate);
            }
            linearLayout.addView(y9Var, kb1.u(120, 120, 1));
            TextView textView = new TextView(parentActivity);
            textView.setText(TextUtils.isEmpty(nftitem.name) ? LocaleController.getString(R.string.WalletCollectible) : nftitem.name);
            org.telegram.messenger.t.r(textView, i10, resourceProvider, 1, 17.0f);
            int i12 = 17;
            textView.setGravity(17);
            linearLayout.addView(textView, kb1.o(12.0f, 16.0f, 12.0f, 0.0f, -1, -2));
            TextView textView2 = new TextView(parentActivity);
            textView2.setText(nftitem.description);
            org.telegram.ui.ActionBar.f7.V(textView2, i11, resourceProvider);
            textView2.setTextSize(1, 14.0f);
            textView2.setGravity(17);
            textView2.setVisibility(TextUtils.isEmpty(nftitem.description) ? 8 : 0);
            linearLayout.addView(textView2, kb1.o(12.0f, 4.0f, 12.0f, 0.0f, -1, -2));
            LinearLayout linearLayout2 = new LinearLayout(parentActivity);
            linearLayout2.setOrientation(0);
            linearLayout.addView(linearLayout2, kb1.o(0.0f, 20.0f, 0.0f, 16.0f, -1, 54));
            int i13 = 0;
            while (i13 < 2) {
                LinearLayout linearLayout3 = new LinearLayout(parentActivity);
                linearLayout3.setOrientation(1);
                linearLayout3.setGravity(i12);
                int dp = AndroidUtilities.dp(16.0f);
                int i14 = org.telegram.ui.ActionBar.y6.d6;
                int w03 = org.telegram.ui.ActionBar.y6.w0(i14, resourceProvider);
                int i15 = org.telegram.ui.ActionBar.y6.i6;
                int w04 = org.telegram.ui.ActionBar.y6.w0(i15, resourceProvider);
                org.telegram.ui.Cells.y j02 = org.telegram.ui.ActionBar.y6.j0(dp, dp, dp, dp, w03, w04, w04);
                org.telegram.ui.ActionBar.b7 N = org.telegram.ui.ActionBar.f7.N(i14);
                org.telegram.ui.ActionBar.b7 N2 = org.telegram.ui.ActionBar.f7.N(i15);
                linearLayout3.setBackground(j02);
                org.telegram.ui.ActionBar.f7.k(linearLayout3, j02, N, N2, resourceProvider);
                linearLayout3.setClickable(true);
                linearLayout3.setFocusable(true);
                String string = LocaleController.getString(i13 == 0 ? R.string.WalletTransfer : R.string.WalletSell);
                linearLayout3.setContentDescription(string);
                ImageView imageView = new ImageView(parentActivity);
                imageView.setImageResource(i13 == 0 ? R.drawable.wallet_transfer : R.drawable.wallet_sell);
                imageView.setImportantForAccessibility(2);
                int i16 = org.telegram.ui.ActionBar.y6.G6;
                org.telegram.ui.ActionBar.f7.t(imageView, i16, resourceProvider, PorterDuff.Mode.SRC_IN);
                linearLayout3.addView(imageView, kb1.r(24, 24));
                TextView textView3 = new TextView(parentActivity);
                textView3.setText(string);
                org.telegram.messenger.t.r(textView3, i16, resourceProvider, 1, 12.0f);
                textView3.setGravity(17);
                linearLayout3.addView(textView3, kb1.o(0.0f, 2.0f, 0.0f, 0.0f, -2, -2));
                linearLayout2.addView(linearLayout3, kb1.q(1.0f, 0, -1, i13 == 0 ? 0 : 4, i13 == 0 ? 4 : 0, 0));
                i13++;
                i12 = 17;
            }
            ArrayList<TL_wallet.nftAttribute> arrayList = nftitem.attributes;
            if (arrayList != null && !arrayList.isEmpty()) {
                x01 x01Var = new x01(parentActivity, resourceProvider);
                int dp2 = AndroidUtilities.dp(10.0f);
                int i17 = org.telegram.ui.ActionBar.y6.d6;
                ShapeDrawable c02 = org.telegram.ui.ActionBar.y6.c0(dp2, org.telegram.ui.ActionBar.y6.w0(i17, resourceProvider));
                org.telegram.ui.ActionBar.b7 N3 = org.telegram.ui.ActionBar.f7.N(i17);
                x01Var.setBackground(c02);
                org.telegram.ui.ActionBar.f7.k(x01Var, c02, N3, null, resourceProvider);
                ArrayList<TL_wallet.nftAttribute> arrayList2 = nftitem.attributes;
                int size = arrayList2.size();
                int i18 = 0;
                while (i18 < size) {
                    TL_wallet.nftAttribute nftattribute = arrayList2.get(i18);
                    i18++;
                    TL_wallet.nftAttribute nftattribute2 = nftattribute;
                    x01Var.c(nftattribute2.trait_type, nftattribute2.value, null, null);
                }
                linearLayout.addView(x01Var, kb1.o(0.0f, 0.0f, 0.0f, 14.0f, -1, -2));
            }
            fi.d dVar = new fi.d(parentActivity, resourceProvider, true);
            dVar.setRoundRadius(24);
            dVar.setText(LocaleController.getString(R.string.WalletOK));
            linearLayout.addView(dVar, kb1.r(-1, 48));
            i4Var.setCustomView(scrollView);
            i4Var.useBackgroundTopPadding = false;
            linearLayout2.getChildAt(0).setOnClickListener(new zd0(25, i4Var, nftitem));
            linearLayout2.getChildAt(1).setOnClickListener(new s2(parentActivity, 1));
            dVar.setOnClickListener(new s2(i4Var, 2));
            i4Var.show();
            i4Var.fixNavigationBar(w02);
            AndroidUtilities.setNavigationBarColor((Dialog) i4Var, w02, false);
        }
    }

    public final void G0() {
        if (getParentActivity() == null || this.M0 != null || this.L0 == null) {
            return;
        }
        if (getParentActivity().checkSelfPermission("android.permission.CAMERA") != 0) {
            getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 44);
        } else {
            this.M0 = ai.o0.k(this, this.L0, new ai.d0(14), new v3(this, 3), new o3(this, 8));
        }
    }

    public final void H0(boolean z10) {
        this.f0 = z10;
        if (!z10) {
            this.e0 = 0;
        }
        if (this.p0 == null || this.h0 == null) {
            return;
        }
        if (!z10) {
            this.i0.b(false);
            this.p0.setPosition(0);
        }
        V0();
        ValueAnimator valueAnimator = this.m0;
        if (valueAnimator != null) {
            this.m0 = null;
            valueAnimator.cancel();
        }
        float f7 = z10 ? 1.0f : 0.0f;
        boolean z11 = this.n0.isAttachedToWindow() && this.n0.isLaidOut();
        if (z10) {
            this.p0.o(false);
        }
        if (!z11 || this.l0 == f7) {
            I0(f7);
            this.p0.o(false);
        } else {
            this.h0.setVisibility(0);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.l0, f7);
            this.m0 = ofFloat;
            ofFloat.setDuration(250L);
            this.m0.setInterpolator(ds.h);
            this.m0.addUpdateListener(new u3(this, 0));
            this.m0.addListener(new org.telegram.ui.ActionBar.a1(this, f7, 8));
            this.m0.start();
        }
        if (this.a == null || this.o0 == J0()) {
            return;
        }
        T0(false);
    }

    public final void I0(float f7) {
        this.l0 = f7;
        this.h0.setVisibility((f7 > 0.0f || this.m0 != null) ? 0 : 8);
        this.h0.setAlpha(f7);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.h0.getLayoutParams();
        layoutParams.height = Math.round(AndroidUtilities.dp(52.0f) * f7);
        layoutParams.bottomMargin = -Math.round(AndroidUtilities.dp(6.0f) * f7);
        this.h0.setLayoutParams(layoutParams);
    }

    public final boolean J0() {
        k0 k0Var;
        if (this.f0 || (k0Var = this.D0) == null || !k0Var.c.isEmpty()) {
            return false;
        }
        k0 k0Var2 = this.D0;
        k0Var2.getClass();
        return k0Var2.h;
    }

    public final void K0() {
        this.F0 = false;
        n8 n8Var = this.i0;
        if (n8Var != null) {
            n8Var.b(false);
        }
        this.e0 = 0;
        fi.h1 h1Var = this.p0;
        if (h1Var != null) {
            h1Var.setPosition(0);
        }
    }

    public final void L0() {
        this.s = false;
        m71 m71Var = this.a;
        if (m71Var != null) {
            m71Var.D2.b.remove(this.w);
            this.a.removeCallbacks(this.v);
        }
        y4 y4Var = this.e;
        if (y4Var != null) {
            y4Var.setAdditionalTilt(0.0f);
        }
    }

    public final void N0() {
        l0 x9 = l0.x(this.currentAccount);
        W0();
        this.C0.setEnabled(x9.G() && x9.e());
        if (!x9.G()) {
            this.t0.setText(B0(0));
            this.u0.setText(B0(1));
            return;
        }
        long v = x9.v();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (this.Q0 == null) {
            this.Q0 = new SpannableString("G");
            y4 y4Var = this.e;
            y4Var.getClass();
            v5 v5Var = new v5(y4Var, R.drawable.wallet_gram_large);
            this.v0 = v5Var;
            SpannableString spannableString = this.Q0;
            spannableString.setSpan(v5Var, 0, spannableString.length(), 33);
        }
        spannableStringBuilder.append((CharSequence) this.Q0);
        spannableStringBuilder.append((CharSequence) " ");
        spannableStringBuilder.append((CharSequence) w5.e(v));
        spannableStringBuilder.append((CharSequence) " ");
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.GramCurrency));
        if (this.w0 == null) {
            b5 b5Var = new b5();
            b5Var.a = -9577217;
            this.w0 = b5Var;
        }
        spannableStringBuilder.setSpan(this.w0, length, spannableStringBuilder.length(), 33);
        this.t0.setText(spannableStringBuilder);
        CharSequence m10 = l0.x(this.currentAccount).m(v, false);
        if (TextUtils.isEmpty(m10)) {
            this.u0.setText(B0(1));
        } else {
            this.u0.setText(m10);
        }
        Q0(this.x0);
        d0 d0Var = this.E0;
        if (d0Var != null && !d0Var.h && !d0Var.i && d0Var.k == null) {
            d0Var.e();
        }
        String t10 = x9.t();
        if (TextUtils.isEmpty(t10)) {
            return;
        }
        this.e.setCardNumber(r0(t10.toUpperCase()));
    }

    public final void O0() {
        float[] fArr;
        float[] fArr2;
        Rect rect = this.G;
        if (rect.isEmpty() || !this.y.isAttachedToWindow()) {
            return;
        }
        y4 y4Var = this.e;
        bh.p pVar = this.E;
        Matrix matrix = this.H;
        if (y4Var.g(pVar, matrix)) {
            float width = rect.width();
            float height = rect.height();
            int i10 = 0;
            while (true) {
                fArr = this.K;
                fArr2 = this.L;
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
            bh.p pVar2 = this.E;
            int[] iArr = this.O;
            pVar2.getLocationInWindow(iArr);
            View view = this.y;
            int[] iArr2 = this.N;
            view.getLocationInWindow(iArr2);
            this.e.i(this.x0, this.x.getWidth() / 0.7826087f);
            float f11 = iArr2[0] - iArr[0];
            float A = org.telegram.ui.d3.A(height, 0.7826087f, 0.5f, iArr2[1] - iArr[1]);
            for (int i13 = 0; i13 < 4; i13++) {
                int i14 = i13 * 2;
                float lerp = AndroidUtilities.lerp(fArr2[i14], (fArr[i14] * 0.7826087f) + f11, this.x0);
                float[] fArr3 = this.M;
                fArr3[i14] = lerp;
                int i15 = i14 + 1;
                fArr3[i15] = AndroidUtilities.lerp(fArr2[i15], (fArr[i15] * 0.7826087f) + A, this.x0);
            }
            Matrix matrix2 = this.J;
            boolean polyToPoly = matrix2.setPolyToPoly(this.K, 0, this.M, 0, 4);
            Matrix matrix3 = this.I;
            if (polyToPoly && !matrix3.equals(matrix2)) {
                matrix3.set(matrix2);
                this.E.invalidate();
            }
            y4 y4Var2 = this.e;
            Matrix matrix4 = y4Var2.c;
            Matrix matrix5 = y4Var2.e;
            Matrix matrix6 = y4Var2.d;
            if (matrix.invert(matrix6)) {
                matrix5.setConcat(matrix6, matrix3);
                if (!y4Var2.n || !matrix4.equals(matrix5)) {
                    matrix4.set(matrix5);
                    y4Var2.n = true;
                    y4Var2.N.invalidate();
                }
            }
            float lerp2 = AndroidUtilities.lerp(1.0f, 1.0952381f, this.x0);
            this.u0.setPivotX(0.0f);
            this.u0.setPivotY(0.0f);
            this.u0.setScaleX(lerp2);
            this.u0.setScaleY(lerp2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v2 */
    public final void P0() {
        bh.p pVar;
        ?? r16;
        LinearLayout linearLayout;
        float min;
        float f7;
        if (this.a == null || this.e == null || this.s0 == null || this.y == null || (pVar = this.E) == null || this.actionBar == null) {
            return;
        }
        pVar.bringToFront();
        View m10 = this.a.f3.m(this.h);
        float clamp = m10 == null ? this.a.f3.L0() > this.h ? 1.0f : 0.0f : Utilities.clamp((this.a.getPaddingTop() - m10.getTop()) / m10.getHeight(), 1.0f, 0.0f);
        this.y0 = clamp;
        float f10 = this.I0;
        boolean z10 = f10 > 0.0f || this.H0 > 0.0f;
        if (z10) {
            clamp = f10 > 0.0f ? 0.0f : (1.0f - this.H0) * clamp;
        }
        this.x0 = clamp;
        S0();
        float max = m10 != null ? Math.max(0.0f, (m10.getHeight() / 2.0f) + AndroidUtilities.dp(24.0f)) * this.x0 : 0.0f;
        float lerp = AndroidUtilities.lerp(1.0f, 0.8f, this.x0);
        this.e.setPivotX(r11.getWidth() * 0.5f);
        this.e.setPivotY(0.0f);
        this.e.setScaleX(lerp);
        this.e.setScaleY(lerp);
        this.e.setAlpha(1.0f - Utilities.clamp01(AndroidUtilities.ilerp(clamp, 0.75f, 1.0f)));
        this.e.setVisibility((z10 || (m10 != null && clamp < 1.0f && m10.getBottom() > this.a.getPaddingTop() && m10.getTop() < this.a.getHeight() - this.a.getPaddingBottom())) ? 0 : 4);
        int[] iArr = this.Q;
        int[] iArr2 = this.P;
        if (m10 != null) {
            this.a.getLocationInWindow(iArr2);
            this.n.getLocationInWindow(iArr);
            r16 = 1;
            this.e.setTranslationX(((this.f.getWidth() - this.e.getWidth()) / 2.0f) + this.f.getX() + m10.getX() + (iArr2[0] - iArr[0]));
            this.e.setTranslationY(this.f.getY() + m10.getY() + (iArr2[1] - iArr[1]) + max);
        } else {
            r16 = 1;
        }
        if (z10) {
            boolean z11 = this.I0 == 0.0f ? r16 : false;
            float f11 = this.H0;
            if (z11) {
                min = 0.3f * f11;
                f7 = 0.6f;
            } else {
                min = Math.min(1.0f, 1.8f * f11) * 0.06f;
                f7 = 0.84f;
            }
            float f12 = min + f7;
            this.actionBar.getLocationInWindow(iArr2);
            this.n.getLocationInWindow(iArr);
            float dp = (AndroidUtilities.dp(4.0f) + (this.actionBar.getHeight() + (iArr2[r16] - iArr[r16]))) - ((1.0f - f11) * (z11 ? 0.0f : this.e.getHeight() * 0.35f));
            if (z11) {
                dp = a1.g.C(0.9f - f12, this.e.getHeight(), 2.0f, dp);
            }
            float width = (this.n.getWidth() - this.e.getWidth()) / 2.0f;
            if (!z11) {
                f11 = Math.min(1.0f, f11 * 2.0f);
            }
            if (m10 != null) {
                this.a.getLocationInWindow(iArr2);
                float width2 = ((this.f.getWidth() - this.e.getWidth()) / 2.0f) + this.f.getX() + m10.getX() + (iArr2[0] - iArr[0]);
                float y3 = this.f.getY() + m10.getY() + (iArr2[r16] - iArr[r16]);
                float clamp01 = Utilities.clamp01(1.0f - ((dp - y3) / (this.e.getHeight() * 0.5f)));
                if (clamp01 >= 1.0f) {
                    AndroidUtilities.cancelRunOnUIThread(this.K0);
                    ValueAnimator valueAnimator = this.J0;
                    if (valueAnimator != null) {
                        this.J0 = null;
                        valueAnimator.cancel();
                    }
                    this.H0 = 0.0f;
                    this.I0 = 0.0f;
                    P0();
                    return;
                }
                width = AndroidUtilities.lerp(width, width2, clamp01);
                dp = AndroidUtilities.lerp(dp, y3, clamp01);
                f12 = AndroidUtilities.lerp(f12, 1.0f, clamp01);
                f11 = AndroidUtilities.lerp(f11, 1.0f, clamp01);
            }
            this.e.setPivotX(r1.getWidth() * 0.5f);
            this.e.setPivotY(0.0f);
            this.e.setScaleX(f12);
            this.e.setScaleY(f12);
            this.e.setTranslationX(width);
            this.e.setTranslationY(dp);
            this.e.setAlpha(f11);
        }
        boolean z12 = clamp > 0.0f ? r16 : false;
        if (this.F != z12 && (linearLayout = this.s0) != null) {
            Rect rect = this.G;
            if (z12) {
                if (linearLayout.getWidth() != 0 && this.s0.getHeight() != 0) {
                    rect.set(this.s0.getLeft(), this.s0.getTop(), this.s0.getRight(), this.s0.getBottom());
                }
            }
            this.e.setOnFrontContentPresented(null);
            AndroidUtilities.removeFromParent(this.s0);
            this.F = z12;
            if (z12) {
                this.E.addView(this.s0, new FrameLayout.LayoutParams(rect.width(), rect.height(), 51));
                this.s0.layout(0, 0, rect.width(), rect.height());
                O0();
            } else {
                y4 y4Var = this.e;
                y4Var.i(0.0f, 0.0f);
                LinearLayout linearLayout2 = y4Var.M;
                AndroidUtilities.removeFromParent(linearLayout2);
                linearLayout2.setScaleX(1.0f);
                linearLayout2.setScaleY(1.0f);
                linearLayout2.setRotationX(0.0f);
                linearLayout2.setRotationY(0.0f);
                linearLayout2.setTranslationX(0.0f);
                linearLayout2.setTranslationY(0.0f);
                u5 u5Var = y4Var.O;
                u5Var.setScaleX(1.0f);
                u5Var.setScaleY(1.0f);
                y4Var.E.addView(linearLayout2, y4Var.P);
                this.s0.layout(rect.left, rect.top, rect.right, rect.bottom);
                this.e.getClass();
                O0();
            }
            this.E.invalidate();
        }
        Q0(clamp);
        if (this.F) {
            O0();
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

    public final void Q0(float f7) {
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.y6.G6);
        this.t0.setTextColor(AndroidUtilities.lerpColor(-1, themedColor, f7));
        org.telegram.ui.Components.s6 s6Var = this.u0;
        float[] fArr = this.e.a0;
        int i10 = -7868417;
        if (fArr != null) {
            i10 = i0.a.f(fArr[8], h7.p(fArr, -7868417, 0), h7.p(fArr, -7868417, 3));
        }
        s6Var.setTextColor(AndroidUtilities.lerpColor(i10, i0.a.o(themedColor, Math.round(142.8f)), f7));
        v5 v5Var = this.v0;
        if (v5Var != null) {
            v5Var.setOverrideColor(AndroidUtilities.lerpColor(-1, getThemedColor(org.telegram.ui.ActionBar.y6.Oh), f7));
        }
        b5 b5Var = this.w0;
        if (b5Var != null) {
            float[] fArr2 = this.e.a0;
            int i11 = -9577217;
            if (fArr2 != null) {
                i11 = i0.a.f(fArr2[8], h7.p(fArr2, -9577217, 0), h7.p(fArr2, -9577217, 3));
            }
            b5Var.a = i0.a.o(i11, Math.round((1.0f - f7) * 255.0f));
        }
        this.t0.invalidate();
    }

    public final void R0(float[] fArr) {
        if (this.B0 == null || this.C0 == null) {
            return;
        }
        float f7 = h7.j(getThemedColor(org.telegram.ui.ActionBar.y6.a7))[0];
        boolean z10 = f7 < 0.6f;
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.y6.Oh);
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
        if (themedColor == this.N0) {
            return;
        }
        this.N0 = themedColor;
        int themedColor2 = i0.a.h(themedColor) <= 0.550000011920929d ? getThemedColor(org.telegram.ui.ActionBar.y6.Sh) : -16777216;
        fi.d[] dVarArr = {this.B0, this.C0};
        for (int i12 = 0; i12 < 2; i12++) {
            fi.d dVar = dVarArr[i12];
            dVar.setColor(themedColor);
            dVar.setTextColor(themedColor2);
        }
    }

    public final void S0() {
        m71 m71Var = this.a;
        if (m71Var == null || this.e == null) {
            return;
        }
        float b10 = m71Var.D2.b(1);
        this.e.setAdditionalTilt(Math.max(0.0f, (this.x0 * 10.0f) + ((((float) Math.sqrt(Utilities.clamp01(this.x0))) * 90.0f) - 10.0f)) + Math.min(10.0f, this.a.D2.b(3) * 40.0f) + (-Math.min(10.0f, b10 * 40.0f)));
        this.e.setUseGyroscope(1.0f - ((float) Math.pow(this.x0, 0.33000001311302185d)));
    }

    public final void T0(boolean z10) {
        boolean J0 = J0();
        m71 m71Var = this.a;
        s71[] s71VarArr = this.r0;
        if (m71Var != null && this.o0 != J0) {
            this.o0 = J0;
            m71Var.C0();
            for (s71 s71Var : s71VarArr) {
                if (s71Var != null) {
                    s71Var.C0();
                }
            }
            this.a.g3.O(false);
            this.a.f3.h1(0, 0);
            this.a.post(new o3(this, 10));
        }
        if (J0) {
            return;
        }
        for (s71 s71Var2 : s71VarArr) {
            if (s71Var2 != null) {
                U0(s71Var2, z10);
            }
        }
        bi.r rVar = this.n0;
        if (rVar != null) {
            rVar.post(new o3(this, 5));
            this.n0.post(new o3(this, 6));
        }
    }

    @Override // org.telegram.ui.Components.n71
    public final void V(ArrayList arrayList, k71 k71Var) {
        l0 x9 = l0.x(this.currentAccount);
        W0();
        arrayList.add(u61.m(this.R));
        this.h = arrayList.size();
        v4 v4Var = this.f;
        u61 u61Var = new u61(-4);
        u61Var.c = v4Var;
        u61Var.z = -1;
        u61Var.e = true;
        arrayList.add(u61Var);
        arrayList.add(u61.m(this.z0));
        boolean J0 = J0();
        this.o0 = J0;
        if (J0) {
            int i10 = R.drawable.wallet_learn_instant;
            String string = LocaleController.getString(R.string.WalletSendInstantly);
            String string2 = LocaleController.getString(R.string.WalletSendInstantlyInfo);
            int i11 = c5.a;
            u61 K = u61.K(c5.class);
            K.k = i10;
            K.l = string;
            K.m = string2;
            arrayList.add(K);
            int i12 = R.drawable.wallet_learn_fees;
            String string3 = LocaleController.getString(R.string.WalletNoFees);
            String string4 = LocaleController.getString(R.string.WalletNoFeesInfo);
            u61 K2 = u61.K(c5.class);
            K2.k = i12;
            K2.l = string3;
            K2.m = string4;
            arrayList.add(K2);
            int i13 = R.drawable.wallet_learn_verified;
            String string5 = LocaleController.getString(R.string.WalletBlockchainVerified);
            String string6 = LocaleController.getString(R.string.WalletBlockchainVerifiedInfo);
            u61 K3 = u61.K(c5.class);
            K3.k = i13;
            K3.l = string5;
            K3.m = string6;
            arrayList.add(K3);
            arrayList.add(u61.m(this.a0));
        } else if (this.n0 != null) {
            if (this.R0 && !this.S0 && x9.v() > 500000000) {
                arrayList.add(u61.k(this.c0));
            }
            bi.r rVar = this.n0;
            u61 u61Var2 = new u61(-3);
            u61Var2.c = rVar;
            u61Var2.z = 0;
            u61Var2.y = 1;
            arrayList.add(u61Var2);
        }
        aa0 aa0Var = this.Z;
        if (aa0Var != null) {
            this.b0 = false;
            aa0Var.animate().cancel();
            this.Z.setAlpha(0.0f);
            this.Z.setVisibility(4);
        }
    }

    public final void V0() {
        n8 n8Var = this.i0;
        if (n8Var == null || this.p0 == null || n8Var.w == 0.0f) {
            return;
        }
        n8Var.w = 0.0f;
        n8Var.c.setVisibility(8);
        n8Var.invalidate();
    }

    @Override // org.telegram.ui.Components.n71
    public final CharSequence W() {
        return LocaleController.getString(R.string.WalletTitle);
    }

    public final void W0() {
        if (this.S == null) {
            return;
        }
        l0 x9 = l0.x(this.currentAccount);
        boolean z10 = this.S.isAttachedToWindow() && this.S.isLaidOut();
        u4 u4Var = this.S;
        FrameLayout frameLayout = this.T;
        Boolean bool = x9.i;
        u4Var.i(frameLayout, (bool == null || !bool.booleanValue() || TextUtils.isEmpty(x9.j)) ? false : true, z10);
        ArrayList arrayList = x9.G;
        int size = arrayList.size();
        int i10 = 0;
        long j10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            h0 h0Var = (h0) obj;
            if (!h0Var.e) {
                long j11 = h0Var.c;
                if (j11 >= 0) {
                    j10 += j11;
                }
            }
        }
        boolean z11 = j10 > 500000000;
        if (z11) {
            this.W.setText(t0(R.string.WalletOldWalletsBalance, j10));
        }
        this.S.i(this.V, z11, z10);
        long j12 = bi.ca.y(this.currentAccount, true).p().amount;
        boolean z12 = j12 > 500000000;
        if (z12) {
            this.Y.setText(t0(R.string.WalletGramEarningsBalance, j12));
        }
        this.S.i(this.X, z12, z10);
    }

    @Override // org.telegram.ui.Components.n71
    public final void X(u61 u61Var, View view) {
        d0 d0Var;
        Object obj = u61Var.G;
        if (obj instanceof TL_wallet.nftItem) {
            D0((TL_wallet.nftItem) obj);
            return;
        }
        if (u61Var.d == -10001 && (d0Var = this.E0) != null) {
            d0Var.e();
        } else if (obj instanceof TL_wallet.walletTransaction) {
            C0(getParentActivity(), this.currentAccount, (TL_wallet.walletTransaction) u61Var.G, null, null, null, null, getResourceProvider());
        }
    }

    @Override // org.telegram.ui.Components.n71
    public final boolean Y(u61 u61Var, View view) {
        t7 t7Var;
        if (!(view instanceof g7) || (t7Var = this.j0) == null) {
            return false;
        }
        t7Var.S((g7) view);
        return true;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean canBeginSlide() {
        t7 t7Var = this.j0;
        return (t7Var == null || !t7Var.p0) && super.canBeginSlide();
    }

    @Override // org.telegram.ui.Components.n71, org.telegram.ui.ActionBar.r2
    public final View createView(Context context) {
        ValueAnimator valueAnimator = this.m0;
        if (valueAnimator != null) {
            this.m0 = null;
            valueAnimator.cancel();
        }
        L0();
        i5 i5Var = this.q0;
        if (i5Var != null) {
            i5Var.b(null);
        }
        this.f = null;
        this.S = null;
        this.R = null;
        this.n0 = null;
        this.p0 = null;
        s71[] s71VarArr = this.r0;
        int i10 = 0;
        s71VarArr[0] = null;
        final int i11 = 1;
        s71VarArr[1] = null;
        d0 d0Var = this.E0;
        boolean z10 = (d0Var == null || d0Var.a.isEmpty()) ? false : true;
        this.f0 = z10;
        if (!z10) {
            this.e0 = 0;
        } else if (this.F0) {
            this.e0 = 1;
        }
        t7 t7Var = this.j0;
        if (t7Var != null) {
            t7Var.p();
        }
        this.j0 = null;
        View createView = super.createView(context);
        pc0 pc0Var = new pc0(this, context);
        pc0Var.addView(createView, kb1.g(-1.0f, -1));
        this.fragmentView = pc0Var;
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i12 = org.telegram.ui.ActionBar.y6.a7;
        org.telegram.ui.ActionBar.f7.i(i12, kVar, getResourceProvider());
        this.actionBar.setCastShadows(false);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setClipChildren(false);
        this.actionBar.setClipToPadding(false);
        org.telegram.ui.ActionBar.z l4 = this.actionBar.l();
        org.telegram.ui.ActionBar.w0 a2 = l4.a(2, R.drawable.scan_qr);
        this.L0 = a2;
        final int i13 = 3;
        a2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Wallet.q3
            public final /* synthetic */ m5 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i13) {
                    case 0:
                        m5 m5Var = this.b;
                        m5Var.getClass();
                        m5Var.presentFragment(new fg1(6, null));
                        break;
                    case 1:
                        m5.b0(this.b);
                        break;
                    case 2:
                        m5.e0(this.b);
                        break;
                    case 3:
                        this.b.G0();
                        break;
                    default:
                        m5.Z(this.b);
                        break;
                }
            }
        });
        l4.a(1, R.drawable.ic_ab_other).setOnClickListener(new zd0(27, this, context));
        bh.r rVar = new bh.r(this, context, 29);
        this.R = rVar;
        rVar.setClipToPadding(false);
        this.R.setClipChildren(false);
        this.R.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(4.0f));
        u4 u4Var = new u4(this, context);
        this.S = u4Var;
        u4Var.setDefaultRadiusDp(22);
        this.S.setOnAnimatedHeightChangedListener(new o3(this, 12));
        TextView textView = new TextView(context);
        this.U = textView;
        textView.setText(LocaleController.getString(R.string.WalletWaltFunds));
        this.T = q0(this.U, new o3(this, i10));
        TextView textView2 = new TextView(context);
        this.W = textView2;
        this.V = q0(textView2, new o3(this, i11));
        TextView textView3 = new TextView(context);
        this.Y = textView3;
        this.X = q0(textView3, new o3(this, 2));
        this.R.addView(this.S, kb1.g(-2.0f, -1));
        aa0 aa0Var = new aa0(context, null);
        this.Z = aa0Var;
        this.b0 = false;
        aa0Var.setAlpha(0.0f);
        aa0 aa0Var2 = this.Z;
        int i14 = org.telegram.ui.ActionBar.y6.z6;
        org.telegram.ui.ActionBar.f7.V(aa0Var2, i14, this.resourceProvider);
        this.Z.setTextSize(1, 13.0f);
        this.Z.setGravity(17);
        this.Z.setText(M0(LocaleController.getString(R.string.WalletTermsOfService), org.telegram.ui.ActionBar.y6.gc, this.resourceProvider, new p3(context, i10)));
        final int i15 = 4;
        this.Z.setVisibility(4);
        FrameLayout frameLayout = (FrameLayout) createView;
        if (frameLayout != null) {
            frameLayout.addView(this.Z, kb1.h(-1, -2.0f, 81, 12.0f, 0.0f, 12.0f, 24.0f));
        }
        v4 v4Var = new v4(this, context, i10);
        this.a0 = v4Var;
        v4Var.setImportantForAccessibility(2);
        this.c0 = new FrameLayout(context);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.d0 = frameLayout2;
        int i16 = org.telegram.ui.ActionBar.y6.d6;
        int themedColor = getThemedColor(i16);
        int themedColor2 = getThemedColor(i16);
        int i17 = org.telegram.ui.ActionBar.y6.i6;
        org.telegram.ui.Cells.y a02 = org.telegram.ui.ActionBar.y6.a0(themedColor, org.telegram.ui.ActionBar.y6.v(themedColor2, getThemedColor(i17)), 16, 16);
        org.telegram.ui.ActionBar.b7 N = org.telegram.ui.ActionBar.f7.N(i16);
        org.telegram.ui.ActionBar.b7 q5 = org.telegram.ui.ActionBar.f7.q(i16, i17);
        org.telegram.ui.ActionBar.u6 resourceProvider = getResourceProvider();
        frameLayout2.setBackground(a02);
        org.telegram.ui.ActionBar.f7.k(frameLayout2, a02, N, q5, resourceProvider);
        this.c0.addView(this.d0, kb1.h(-1, -2.0f, 55, 12.0f, 0.0f, 12.0f, 12.0f));
        ImageView imageView = new ImageView(context);
        float dpf2 = AndroidUtilities.dpf2(10.0f);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{dpf2, dpf2, dpf2, dpf2, dpf2, dpf2, dpf2, dpf2}, null, null));
        shapeDrawable.setShaderFactory(new w4());
        imageView.setBackground(shapeDrawable);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.wallet_protect);
        this.d0.addView(imageView, kb1.h(28, 28.0f, 19, 14.0f, 11.0f, 16.0f, 11.0f));
        TextView textView4 = new TextView(context);
        org.telegram.ui.ActionBar.f7.V(textView4, org.telegram.ui.ActionBar.y6.q7, this.resourceProvider);
        textView4.setTextSize(1, 16.0f);
        textView4.setText(LocaleController.getString(R.string.WalletProtectAccount));
        this.d0.addView(textView4, kb1.h(-1, -2.0f, 19, 58.0f, 0.0f, 32.0f, 0.0f));
        final int i18 = 0;
        this.d0.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Wallet.q3
            public final /* synthetic */ m5 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i18) {
                    case 0:
                        m5 m5Var = this.b;
                        m5Var.getClass();
                        m5Var.presentFragment(new fg1(6, null));
                        break;
                    case 1:
                        m5.b0(this.b);
                        break;
                    case 2:
                        m5.e0(this.b);
                        break;
                    case 3:
                        this.b.G0();
                        break;
                    default:
                        m5.Z(this.b);
                        break;
                }
            }
        });
        kb1.c(this.d0, 0.02f, 1.2f);
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.x = frameLayout3;
        frameLayout3.setClipChildren(false);
        this.x.setClipToPadding(false);
        this.actionBar.addView(this.x, kb1.h(-1, 56.0f, 87, 64.0f, 0.0f, 96.0f, 0.0f));
        View view = new View(context);
        this.y = view;
        int i19 = 19;
        this.x.addView(view, kb1.i(1, 1, 19));
        this.F = false;
        this.G.setEmpty();
        this.I.reset();
        bh.p pVar = new bh.p(this, context);
        this.E = pVar;
        pVar.setClipChildren(false);
        this.E.setClipToPadding(false);
        y4 y4Var = new y4(this, context);
        this.e = y4Var;
        y4Var.setDiamondOnCard(true);
        this.e.setCardOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Wallet.q3
            public final /* synthetic */ m5 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i11) {
                    case 0:
                        m5 m5Var = this.b;
                        m5Var.getClass();
                        m5Var.presentFragment(new fg1(6, null));
                        break;
                    case 1:
                        m5.b0(this.b);
                        break;
                    case 2:
                        m5.e0(this.b);
                        break;
                    case 3:
                        this.b.G0();
                        break;
                    default:
                        m5.Z(this.b);
                        break;
                }
            }
        });
        this.a.D2.b.add(this.w);
        v4 v4Var2 = new v4(this, context, i11);
        this.f = v4Var2;
        v4Var2.setImportantForAccessibility(2);
        z4 z4Var = new z4(this, context);
        this.n = z4Var;
        z4Var.setClipChildren(false);
        this.n.setClipToPadding(false);
        this.n.addView(this.e, kb1.g(-2.0f, -1));
        pc0Var.addView(this.n, kb1.g(-1.0f, -1));
        this.a.setClipChildren(false);
        this.a.setClipToPadding(false);
        this.s0 = this.e.getBalanceLayout();
        this.t0 = this.e.getBalanceView();
        this.u0 = this.e.getUsdBalanceView();
        this.e.setCardHolder(UserObject.getUserName(getUserConfig().getCurrentUser()).toUpperCase());
        this.A0 = 0.0f;
        za1 za1Var = new za1(this, context, 20);
        this.z0 = za1Var;
        za1Var.setOrientation(0);
        this.z0.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(12.0f));
        fi.d dVar = new fi.d(context, this.resourceProvider, true);
        dVar.setRoundRadius(24);
        this.B0 = dVar;
        dVar.setText(LocaleController.getString(R.string.WalletAddFunds));
        this.z0.addView(this.B0, kb1.q(1.0f, 0, 48, 0, 4, 0));
        final int i20 = 2;
        this.B0.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Wallet.q3
            public final /* synthetic */ m5 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i20) {
                    case 0:
                        m5 m5Var = this.b;
                        m5Var.getClass();
                        m5Var.presentFragment(new fg1(6, null));
                        break;
                    case 1:
                        m5.b0(this.b);
                        break;
                    case 2:
                        m5.e0(this.b);
                        break;
                    case 3:
                        this.b.G0();
                        break;
                    default:
                        m5.Z(this.b);
                        break;
                }
            }
        });
        fi.d dVar2 = new fi.d(context, this.resourceProvider, true);
        dVar2.setRoundRadius(24);
        this.C0 = dVar2;
        dVar2.setText(LocaleController.getString(R.string.WalletSend));
        this.C0.setEnabled(l0.x(this.currentAccount).e());
        this.C0.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Wallet.q3
            public final /* synthetic */ m5 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i15) {
                    case 0:
                        m5 m5Var = this.b;
                        m5Var.getClass();
                        m5Var.presentFragment(new fg1(6, null));
                        break;
                    case 1:
                        m5.b0(this.b);
                        break;
                    case 2:
                        m5.e0(this.b);
                        break;
                    case 3:
                        this.b.G0();
                        break;
                    default:
                        m5.Z(this.b);
                        break;
                }
            }
        });
        this.z0.addView(this.C0, kb1.q(1.0f, 0, 48, 4, 0, 0));
        R0(this.e.getStickerStyle());
        this.D0 = l0.x(this.currentAccount).B();
        this.a.setDescendantFocusability(131072);
        t7 t7Var2 = new t7(this, this.e, new m4.c(this, pc0Var, false, 14), null);
        this.j0 = t7Var2;
        pc0Var.addView(t7Var2, kb1.g(-1.0f, -1));
        this.k0 = "";
        bi.r rVar2 = new bi.r(context, 7);
        this.n0 = rVar2;
        rVar2.setOrientation(1);
        org.telegram.ui.ActionBar.f7.i(i12, this.n0, getResourceProvider());
        int i21 = 10;
        fi.h1 h1Var = new fi.h1(this, context, this.resourceProvider, i21);
        this.p0 = h1Var;
        h1Var.setAllowDisallowInterceptTouch(false);
        this.p0.setAdapter(new h4(this, context));
        u91 n10 = this.p0.n(-2, true);
        this.g0 = n10;
        n10.g(i14, org.telegram.ui.ActionBar.y6.G6, i14, i17, i16);
        org.telegram.ui.ActionBar.f7.C(this.g0, org.telegram.ui.ActionBar.y6.c0(AndroidUtilities.dp(20.0f), getThemedColor(i16)), org.telegram.ui.ActionBar.f7.N(i16), getResourceProvider());
        this.h0 = new FrameLayout(context);
        n8 n8Var = new n8(context, this.g0, this.resourceProvider, new v3(this, 0), new v3(this, 1), new v3(this, 2));
        this.i0 = n8Var;
        this.h0.addView(n8Var, kb1.h(-1, 40.0f, 48, 16.0f, 0.0f, 16.0f, 0.0f));
        this.p0.setPosition(this.e0);
        V0();
        this.n0.addView(this.h0, kb1.o(0.0f, 0.0f, 0.0f, -6.0f, -1, 52));
        this.n0.addView(this.p0, kb1.p(1.0f, -1, 0));
        H0(this.f0);
        d0 d0Var2 = this.E0;
        if (d0Var2 != null) {
            this.j0.Y(d0Var2);
        }
        this.a.j(new ml(this, i19));
        k71 k71Var = this.a.g3;
        k71Var.r = false;
        k71Var.O(false);
        i5 i5Var2 = new i5(this);
        this.q0 = i5Var2;
        i5Var2.b(this.a);
        N0();
        this.D0.h();
        this.actionBar.post(new o3(this, 9));
        this.a.post(new o3(this, i21));
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        m71 m71Var;
        k71 k71Var;
        if (i11 != this.currentAccount) {
            return;
        }
        if (i10 == NotificationCenter.walletUpdate && this.t0 != null) {
            N0();
            Iterator it = this.P0.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
            return;
        }
        if (i10 == NotificationCenter.starBalanceUpdated) {
            W0();
            return;
        }
        if (i10 == NotificationCenter.didSetOrRemoveTwoStepPassword) {
            if (objArr.length > 0) {
                Object obj = objArr[0];
                if (obj instanceof TL_account.Password) {
                    this.R0 = true;
                    this.S0 = ((TL_account.Password) obj).has_password;
                    m71 m71Var2 = this.a;
                    if (m71Var2 == null || (k71Var = m71Var2.g3) == null) {
                        return;
                    }
                    k71Var.O(true);
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
        k0 k0Var = this.D0;
        if (obj2 != k0Var || (m71Var = this.a) == null || m71Var.g3 == null) {
            return;
        }
        if (k0Var.b.isEmpty()) {
            k0 k0Var2 = this.D0;
            if (!k0Var2.h) {
                k0Var2.h();
            }
        }
        T0(true);
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void o0(boolean z10) {
        AndroidUtilities.cancelRunOnUIThread(this.K0);
        float f7 = z10 ? 1.0f : 0.0f;
        if (this.I0 == f7) {
            return;
        }
        this.I0 = f7;
        ValueAnimator valueAnimator = this.J0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        P0();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.H0, f7);
        this.J0 = ofFloat;
        ofFloat.setDuration(z10 ? 260L : 120L);
        this.J0.setInterpolator(z10 ? new ds(0.05d, 0.7d, 0.1d, 1.0d) : new ds(0.4d, 0.0d, 0.2d, 1.0d));
        this.J0.addUpdateListener(new u3(this, 1));
        this.J0.addListener(new hc1(this, 7));
        this.J0.start();
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean onBackPressed(boolean z10) {
        ai.o0 o0Var = this.M0;
        if (o0Var != null) {
            if (z10) {
                o0Var.e();
            }
            return false;
        }
        n8 n8Var = this.i0;
        if (n8Var == null || !n8Var.x) {
            return super.onBackPressed(z10);
        }
        if (z10) {
            n8Var.b(false);
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onBeginSlide() {
        i5 i5Var = this.q0;
        if (i5Var != null) {
            i5Var.c();
        }
        m71 m71Var = this.a;
        if (m71Var != null) {
            m71Var.C0();
        }
        s71 u02 = u0();
        if (u02 != null) {
            u02.C0();
        }
        super.onBeginSlide();
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean onFragmentCreate() {
        Context context = ApplicationLoader.applicationContext;
        if (n5.k0.compareAndSet(false, true)) {
            n5.l0.postRunnable(new p3(context, 2));
        }
        getNotificationCenter().addWeakObserver(this, NotificationCenter.walletUpdate);
        getNotificationCenter().addWeakObserver(this, NotificationCenter.starBalanceUpdated);
        getNotificationCenter().addWeakObserver(this, NotificationCenter.walletTransactionsUpdate);
        getNotificationCenter().addWeakObserver(this, NotificationCenter.didSetOrRemoveTwoStepPassword);
        l0 x9 = l0.x(this.currentAccount);
        if (x9.o == null) {
            x9.o = new d0(x9);
        }
        d0 d0Var = x9.o;
        this.E0 = d0Var;
        o3 o3Var = this.G0;
        ArrayList arrayList = d0Var.d;
        if (!arrayList.contains(o3Var)) {
            arrayList.add(o3Var);
        }
        yg1 yg1Var = this.T0;
        if (yg1Var != null) {
            yg1Var.run();
        }
        int i10 = x9.D;
        x9.D = i10 + 1;
        HashSet hashSet = x9.E;
        boolean isEmpty = hashSet.isEmpty();
        hashSet.add(Integer.valueOf(i10));
        if (isEmpty) {
            x9.S();
        }
        this.T0 = new yg1(x9, i10, 1);
        getConnectionsManager().sendRequestTyped(new TL_account.getPassword(), new org.telegram.messenger.a(), new d(this, 7));
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onFragmentDestroy() {
        ai.o0 o0Var = this.M0;
        if (o0Var != null) {
            o0Var.g();
            AndroidUtilities.removeFromParent(this.M0);
            this.M0 = null;
        }
        AndroidUtilities.cancelRunOnUIThread(this.K0);
        ValueAnimator valueAnimator = this.J0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        t7 t7Var = this.j0;
        if (t7Var != null) {
            t7Var.p();
        }
        y4 y4Var = this.e;
        if (y4Var != null) {
            y4Var.setOnFrontContentPresented(null);
        }
        ValueAnimator valueAnimator2 = this.m0;
        if (valueAnimator2 != null) {
            this.m0 = null;
            valueAnimator2.cancel();
        }
        d0 d0Var = this.E0;
        if (d0Var != null) {
            d0Var.d.remove(this.G0);
        }
        L0();
        i5 i5Var = this.q0;
        if (i5Var != null) {
            i5Var.b(null);
        }
        getNotificationCenter().removeObserver(this, NotificationCenter.walletUpdate);
        getNotificationCenter().removeObserver(this, NotificationCenter.starBalanceUpdated);
        getNotificationCenter().removeObserver(this, NotificationCenter.walletTransactionsUpdate);
        getNotificationCenter().removeObserver(this, NotificationCenter.didSetOrRemoveTwoStepPassword);
        AndroidUtilities.removeFromParent(this.E);
        k0 k0Var = this.D0;
        if (k0Var != null) {
            k0Var.a();
        }
        super.onFragmentDestroy();
        yg1 yg1Var = this.T0;
        if (yg1Var != null) {
            yg1Var.run();
            this.T0 = null;
        }
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.a.setPadding(0, 0, 0, i13);
        this.a.setClipToPadding(false);
        aa0 aa0Var = this.Z;
        if (aa0Var != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) aa0Var.getLayoutParams();
            layoutParams.bottomMargin = AndroidUtilities.dp(24.0f) + i13;
            this.Z.setLayoutParams(layoutParams);
        }
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onPause() {
        super.onPause();
        ai.o0 o0Var = this.M0;
        if (o0Var != null) {
            o0Var.g();
            AndroidUtilities.removeFromParent(this.M0);
            this.M0 = null;
        }
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onRequestPermissionsResultFragment(int i10, String[] strArr, int[] iArr) {
        if (i10 != 44 || getParentActivity() == null) {
            return;
        }
        if (iArr.length > 0 && iArr[0] == 0) {
            G0();
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        alertDialog$Builder.a.T = AndroidUtilities.replaceTags(LocaleController.getString(R.string.QRCodePermissionNoCameraWithHint));
        alertDialog$Builder.k(LocaleController.getString(R.string.PermissionOpenSettings), new r3(this));
        alertDialog$Builder.h(LocaleController.getString(R.string.ContactsPermissionAlertNotNow), null);
        int i11 = R.raw.permission_request_camera;
        int i12 = org.telegram.ui.ActionBar.y6.L5;
        alertDialog$Builder.m(i11, 72, org.telegram.ui.ActionBar.y6.x0(null, i12, false), null);
        alertDialog$Builder.n(i12, null);
        alertDialog$Builder.p();
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onResume() {
        super.onResume();
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar != null) {
            kVar.post(new o3(this, 9));
        }
        l0.x(this.currentAccount).E();
        if (this.E0 != null && l0.x(this.currentAccount).G()) {
            d0 d0Var = this.E0;
            if (!d0Var.j) {
                d0Var.b();
                d0Var.f(true);
            }
        }
        N0();
        if (this.a != null) {
            T0(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onThemeColorsChanged() {
        super.onThemeColorsChanged();
        try {
            if (this.t0 != null && this.u0 != null && this.e != null) {
                Q0(this.x0);
            }
            y4 y4Var = this.e;
            if (y4Var != null && this.B0 != null && this.C0 != null) {
                R0(y4Var.getStickerStyle());
            }
            aa0 aa0Var = this.Z;
            if (aa0Var != null) {
                aa0Var.invalidate();
            }
            TextView textView = this.W;
            if (textView != null) {
                textView.invalidate();
            }
            TextView textView2 = this.Y;
            if (textView2 != null) {
                textView2.invalidate();
            }
            u4 u4Var = this.S;
            if (u4Var != null) {
                u4Var.invalidate();
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public final FrameLayout q0(TextView textView, Runnable runnable) {
        Context context = textView.getContext();
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(14.0f));
        int i10 = org.telegram.ui.ActionBar.y6.i6;
        org.telegram.ui.Cells.y g02 = org.telegram.ui.ActionBar.y6.g0(getThemedColor(i10), 2, -1);
        org.telegram.ui.ActionBar.b7 N = org.telegram.ui.ActionBar.f7.N(i10);
        org.telegram.ui.ActionBar.u6 resourceProvider = getResourceProvider();
        frameLayout.setBackground(g02);
        org.telegram.ui.ActionBar.f7.k(frameLayout, g02, null, N, resourceProvider);
        org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.G6, getResourceProvider());
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(19);
        frameLayout.addView(textView, kb1.h(-1, -2.0f, 3, 0.0f, 0.0f, 42.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(R.drawable.attach_arrow_right);
        org.telegram.ui.ActionBar.f7.t(imageView, org.telegram.ui.ActionBar.y6.z6, getResourceProvider(), PorterDuff.Mode.SRC_IN);
        frameLayout.addView(imageView, kb1.i(-2, -2, 21));
        frameLayout.setOnClickListener(new s2(runnable, 3));
        textView.setDuplicateParentStateEnabled(true);
        kb1.c(textView, 0.02f, 1.2f);
        this.S.addView(frameLayout, kb1.r(-1, -2));
        return frameLayout;
    }

    public final CharSequence t0(int i10, long j10) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((char) 65532);
        zq zqVar = new zq(R.drawable.mini_gram_16, 0);
        zqVar.recolorDrawable = false;
        spannableStringBuilder.setSpan(zqVar, length, spannableStringBuilder.length(), 33);
        spannableStringBuilder.append((CharSequence) " ");
        int length2 = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) l0.o(j10, false));
        spannableStringBuilder.setSpan(new p10(org.telegram.ui.ActionBar.y6.Oh, getResourceProvider()), length2, spannableStringBuilder.length(), 33);
        return LocaleController.formatSpannable(i10, spannableStringBuilder);
    }

    public final s71 u0() {
        if (v0()) {
            fi.h1 h1Var = this.p0;
            View currentView = h1Var == null ? null : h1Var.getCurrentView();
            if (currentView instanceof s71) {
                return (s71) currentView;
            }
        }
        return null;
    }

    public final boolean v0() {
        bi.r rVar;
        if (this.o0 || (rVar = this.n0) == null || !rVar.isAttachedToWindow()) {
            return false;
        }
        ViewParent parent = this.n0.getParent();
        m71 m71Var = this.a;
        return parent == m71Var.f3.m(m71Var.g3.y.size() - 1);
    }

    public final boolean w0() {
        View m10;
        m71 m71Var = this.a;
        return m71Var != null && (m10 = m71Var.f3.m(this.h)) != null && this.y0 < 0.5f && m10.getBottom() > this.a.getPaddingTop();
    }

    public final void z0() {
        d0 d0Var;
        s71 s71Var = this.r0[1];
        if (this.e0 != 1 || s71Var == null || !s71Var.G || (d0Var = this.E0) == null || d0Var.i || d0Var.g || d0Var.k != null || s71Var.f3.N0() < s71Var.g3.y.size() - 3) {
            return;
        }
        this.E0.e();
    }
}
