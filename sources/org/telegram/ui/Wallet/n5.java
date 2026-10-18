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
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.lk;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.a71;
import org.telegram.ui.Components.b10;
import org.telegram.ui.Components.b91;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.c91;
import org.telegram.ui.Components.ca0;
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.i80;
import org.telegram.ui.Components.j01;
import org.telegram.ui.Components.kv;
import org.telegram.ui.Components.l11;
import org.telegram.ui.Components.m11;
import org.telegram.ui.Components.s61;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.ut;
import org.telegram.ui.Components.v61;
import org.telegram.ui.Components.x90;
import org.telegram.ui.Components.yq;
import org.telegram.ui.PasscodeActivity;
import org.telegram.ui.ef0;
import org.telegram.ui.i01;
import org.telegram.ui.nc0;
import org.telegram.ui.sa1;
import org.telegram.ui.ut0;
import org.telegram.ui.vf1;
import org.telegram.ui.xf1;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes4.dex */
public final class n5 extends v61 implements NotificationCenter.NotificationCenterDelegate {
    public static Typeface R0;
    public ei.d A0;
    public ei.d B0;
    public l0 C0;
    public e0 D0;
    public boolean E;
    public boolean E0;
    public float G0;
    public float H0;
    public ValueAnimator I0;
    public int K0;
    public SpannableString N0;
    public boolean O0;
    public boolean P0;
    public ah.x Q;
    public j Q0;
    public w4 R;
    public FrameLayout S;
    public TextView T;
    public FrameLayout U;
    public TextView V;
    public FrameLayout W;
    public TextView X;
    public x90 Y;
    public x4 Z;
    public boolean a0;
    public FrameLayout b0;
    public FrameLayout c0;
    public a5 d;
    public x4 e;
    public boolean e0;
    public int f;
    public b91 f0;
    public FrameLayout g0;
    public b5 h;
    public n8 h0;
    public t7 i0;
    public float k0;
    public ValueAnimator l0;
    public ai.r m0;
    public int n;
    public boolean n0;
    public ei.h1 o0;
    public j5 p0;
    public boolean r;
    public LinearLayout r0;
    public org.telegram.ui.Components.q6 s0;
    public org.telegram.ui.Components.q6 t0;
    public w5 u0;
    public d5 v0;
    public FrameLayout w;
    public float w0;
    public View x;
    public float x0;
    public ah.v y;
    public sa1 y0;
    public float z0;
    public final org.telegram.ui.Cells.k7 s = new org.telegram.ui.Cells.k7(this, 27);
    public final s3 v = new ut() { // from class: org.telegram.ui.Wallet.s3
        @Override // org.telegram.ui.Components.ut
        public final void a(int i10, boolean z10) {
            u61 u61Var;
            n5 n5Var = n5.this;
            org.telegram.ui.Cells.k7 k7Var = n5Var.s;
            if ((i10 == 1 || i10 == 3) && (u61Var = n5Var.a) != null) {
                n5Var.r = z10;
                u61Var.removeCallbacks(k7Var);
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
    public final a71[] q0 = new a71[2];
    public final o3 F0 = new o3(this, 3);
    public final o3 J0 = new o3(this, 4);
    public final CharSequence[] L0 = new CharSequence[2];
    public final HashSet M0 = new HashSet();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v3, types: [org.telegram.ui.Components.c91, org.telegram.ui.Wallet.m4] */
    public static void A0(Context context, int i10, TL_wallet.walletTransaction wallettransaction, Utilities.Callback3 callback3, Utilities.Callback2 callback2, byte[] bArr, org.telegram.ui.Cells.p0 p0Var, org.telegram.ui.ActionBar.d6 d6Var) {
        View[] viewArr;
        k2[] k2VarArr;
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
                ai.k7 k7Var = new ai.k7(context, i10, 0L, d6Var, null);
                k7Var.i1 = wallettransaction;
                k7Var.D2(tL_starGiftUnique.slug, tL_starGiftUnique, null);
                k7Var.show();
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
            ?? m4Var = new m4(context, d6Var, A, arrayList, i10, rect, viewArr);
            m4Var.setPosition(i11);
            n4 n4Var = new n4(arrayList, context, d6Var, rect, i10, k2VarArr2);
            k2VarArr = k2VarArr2;
            m4Var.setAdapter(n4Var);
            callback22 = callback2;
            p02 = m4Var;
        } else {
            viewArr = viewArr2;
            k2VarArr = k2VarArr2;
            callback22 = callback2;
            p02 = p0(context, i10, wallettransaction, callback3, callback2, bArr, p0Var, d6Var, k2VarArr);
        }
        k2[] k2VarArr3 = k2VarArr;
        o4 o4Var = new o4(context, p02, d6Var, p02, viewArr, context);
        k2VarArr3[0] = o4Var;
        if ((p02 instanceof c91) && callback22 != null) {
            o4Var.setOnDismissListener(new v3(2, callback22, wallettransaction));
        }
        k2VarArr3[0].setFocusable(callback3 != null);
        k2 k2Var = k2VarArr3[0];
        k2Var.useBackgroundTopPadding = false;
        k2Var.show();
    }

    public static void C0(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        int i10 = 1;
        org.telegram.ui.ActionBar.f3 i11 = lk.i(1, context, d6Var, false);
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
        lk.o(org.telegram.ui.ActionBar.h6.j5, d6Var, textView, 1, 17.0f);
        textView.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
        textView.setGravity(17);
        TextView i12 = com.google.android.gms.internal.play_billing.k3.i(linearLayout, textView, w7.z5.t(-1, -2, 1, 0, 0, 0, 6), context);
        i12.setText(LocaleController.getString(R.string.WalletHowItWorksInfo));
        int i13 = org.telegram.ui.ActionBar.h6.z6;
        lk.o(i13, d6Var, i12, 1, 14.0f);
        i12.setGravity(17);
        i12.setLineSpacing(AndroidUtilities.dp(1.0f), 1.0f);
        linearLayout.addView(i12, w7.z5.t(-1, -2, 1, 0, 0, 0, 24));
        f5 f5Var = new f5(context, d6Var);
        f5Var.setPadding(AndroidUtilities.dp(0.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(0.0f), AndroidUtilities.dp(8.0f));
        f5Var.a(LocaleController.getString(R.string.WalletSendInstantly), LocaleController.getString(R.string.WalletSendInstantlyInfo), R.drawable.wallet_learn_instant);
        linearLayout.addView(f5Var, w7.z5.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
        f5 f5Var2 = new f5(context, d6Var);
        f5Var2.setPadding(AndroidUtilities.dp(0.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(0.0f), AndroidUtilities.dp(8.0f));
        f5Var2.a(LocaleController.getString(R.string.WalletNoFees), LocaleController.getString(R.string.WalletNoFeesInfo), R.drawable.wallet_learn_fees);
        linearLayout.addView(f5Var2, w7.z5.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
        f5 f5Var3 = new f5(context, d6Var);
        f5Var3.setPadding(AndroidUtilities.dp(0.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(0.0f), AndroidUtilities.dp(8.0f));
        f5Var3.a(LocaleController.getString(R.string.WalletBlockchainVerified), LocaleController.getString(R.string.WalletBlockchainVerifiedInfo), R.drawable.wallet_learn_verified);
        linearLayout.addView(f5Var3, w7.z5.k(0.0f, 0.0f, 0.0f, 14.0f, -1, -2));
        ei.d f7 = lk.f(24, context, d6Var, true);
        f7.setText(LocaleController.getString(R.string.WalletGotIt));
        linearLayout.addView(f7, w7.z5.t(-1, 48, 1, 0, 0, 0, 0));
        w7.b6.b(f7, 0.02f, 1.1f);
        x90 x90Var = new x90(context, null);
        x90Var.setTextColor(org.telegram.ui.ActionBar.h6.w0(i13, d6Var));
        x90Var.setTextSize(1, 13.0f);
        x90Var.setGravity(17);
        x90Var.setText(AndroidUtilities.replaceSingleLink(LocaleController.getString(R.string.WalletTermsOfService), org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.gc, d6Var), new p3(context, i10)));
        linearLayout.addView(x90Var, w7.z5.k(0.0f, 12.0f, 0.0f, 6.0f, -1, -2));
        i11.customView = frameLayout;
        org.telegram.ui.ActionBar.f3[] f3VarArr = {i11};
        f3VarArr[0].setAllowNestedScroll(true);
        f3VarArr[0].fixNavigationBar();
        f7.setOnClickListener(new b4(f3VarArr, i10));
        f3VarArr[0].show();
    }

    public static void D0(Context context, int i10, org.telegram.ui.ActionBar.d6 d6Var) {
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
            frameLayout.setBackground(new m5());
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            linearLayout.setGravity(1);
            frameLayout.addView(linearLayout, w7.z5.f(-2.0f, 55, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(30.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f) + AndroidUtilities.navigationBarHeight));
            l5 l5Var = new l5(context, s10);
            linearLayout.addView(l5Var, w7.z5.q(288, 302, 1));
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
            imageView.setOnClickListener(new n3(f3Var, 0));
            l5Var.e = new r0(s10, 1);
            f3Var.show();
            f3Var.setOverlayNavBarColor(-12207881);
            AndroidUtilities.setNavigationBarColor((Dialog) f3Var, -12207881, false);
            AndroidUtilities.setLightNavigationBar((Dialog) f3Var, false);
            if (Build.VERSION.SDK_INT >= 29 && f3Var.getWindow() != null) {
                f3Var.getWindow().setNavigationBarContrastEnforced(false);
            }
            dVar.setOnClickListener(new ci.c6(dVar, i10, f3Var, d6Var, 7));
        }
    }

    public static void R0(a71 a71Var, boolean z10) {
        boolean canScrollVertically = a71Var.canScrollVertically(-1);
        a71Var.W2.N(z10);
        a71Var.a0();
        if (canScrollVertically) {
            return;
        }
        a71Var.V2.h1(0, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void Y(final n5 n5Var, Context context, View view) {
        m0 w9 = m0.w(n5Var.currentAccount);
        final i80 I = i80.I(n5Var, view);
        I.a0(0.0f, -AndroidUtilities.dp(48.0f));
        final int i10 = 0;
        I.s = 0;
        I.V(5);
        i80 J = I.J();
        int i11 = 26;
        J.c(R.drawable.ic_ab_back, LocaleController.getString(R.string.WalletBack), new ut0(I, i11), false);
        J.k();
        ScrollView scrollView = new ScrollView(context);
        LinearLayout linearLayout = new LinearLayout(context);
        final int i12 = 1;
        linearLayout.setOrientation(1);
        scrollView.addView(linearLayout);
        w6 w6Var = new w6(n5Var, linearLayout, w9, I, 10);
        J.r(scrollView, w7.z5.n(-1, 350));
        I.c(R.drawable.wallet_globe, LocaleController.getString(R.string.WalletCurrency), new h(w6Var, I, J, 9), false);
        org.telegram.ui.ActionBar.e1 y3 = I.y();
        f fVar = w9.h;
        String i13 = fVar.i();
        boolean isEmpty = TextUtils.isEmpty(i13);
        String str = i13;
        if (isEmpty) {
            y3.setSubtext("USD");
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.Loading));
            spannableStringBuilder.setSpan(new ca0(AndroidUtilities.dp(75.0f), y3.b), 0, spannableStringBuilder.length(), 33);
            str = spannableStringBuilder;
        }
        y3.setSubtext(str);
        w6 w6Var2 = new w6(w9, new boolean[]{fVar.f() != null}, y3, w6Var, 11);
        n5Var.M0.add(w6Var2);
        w6Var.run();
        I.c(R.drawable.wallet_lock, LocaleController.getString(R.string.Passcode), new Runnable(n5Var) { // from class: org.telegram.ui.Wallet.y3
            public final /* synthetic */ n5 b;

            {
                this.b = n5Var;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i10) {
                    case 0:
                        n5 n5Var2 = this.b;
                        n5Var2.getClass();
                        I.u();
                        n5Var2.presentFragment(PasscodeActivity.e0());
                        break;
                    case 1:
                        n5 n5Var3 = this.b;
                        n5Var3.getClass();
                        I.u();
                        n5Var3.presentFragment(new h8());
                        break;
                    case 2:
                        n5 n5Var4 = this.b;
                        n5Var4.getClass();
                        I.u();
                        n5Var4.presentFragment(new ba());
                        break;
                    default:
                        I.u();
                        n5 n5Var5 = this.b;
                        n5.C0(n5Var5.getParentActivity(), n5Var5.getResourceProvider());
                        break;
                }
            }
        }, false);
        I.c(R.drawable.wallet_key, LocaleController.getString(R.string.WalletKeysAndBackup), new Runnable(n5Var) { // from class: org.telegram.ui.Wallet.y3
            public final /* synthetic */ n5 b;

            {
                this.b = n5Var;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i12) {
                    case 0:
                        n5 n5Var2 = this.b;
                        n5Var2.getClass();
                        I.u();
                        n5Var2.presentFragment(PasscodeActivity.e0());
                        break;
                    case 1:
                        n5 n5Var3 = this.b;
                        n5Var3.getClass();
                        I.u();
                        n5Var3.presentFragment(new h8());
                        break;
                    case 2:
                        n5 n5Var4 = this.b;
                        n5Var4.getClass();
                        I.u();
                        n5Var4.presentFragment(new ba());
                        break;
                    default:
                        I.u();
                        n5 n5Var5 = this.b;
                        n5.C0(n5Var5.getParentActivity(), n5Var5.getResourceProvider());
                        break;
                }
            }
        }, false);
        final int i14 = 2;
        I.l(R.drawable.wallet_apps, LocaleController.getString(R.string.WalletConnectedApps), new Runnable(n5Var) { // from class: org.telegram.ui.Wallet.y3
            public final /* synthetic */ n5 b;

            {
                this.b = n5Var;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i14) {
                    case 0:
                        n5 n5Var2 = this.b;
                        n5Var2.getClass();
                        I.u();
                        n5Var2.presentFragment(PasscodeActivity.e0());
                        break;
                    case 1:
                        n5 n5Var3 = this.b;
                        n5Var3.getClass();
                        I.u();
                        n5Var3.presentFragment(new h8());
                        break;
                    case 2:
                        n5 n5Var4 = this.b;
                        n5Var4.getClass();
                        I.u();
                        n5Var4.presentFragment(new ba());
                        break;
                    default:
                        I.u();
                        n5 n5Var5 = this.b;
                        n5.C0(n5Var5.getParentActivity(), n5Var5.getResourceProvider());
                        break;
                }
            }
        }, !w9.g.d.isEmpty());
        I.k();
        final int i15 = 3;
        I.c(R.drawable.wallet_help, LocaleController.getString(R.string.WalletWhatIsWallet), new Runnable(n5Var) { // from class: org.telegram.ui.Wallet.y3
            public final /* synthetic */ n5 b;

            {
                this.b = n5Var;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i15) {
                    case 0:
                        n5 n5Var2 = this.b;
                        n5Var2.getClass();
                        I.u();
                        n5Var2.presentFragment(PasscodeActivity.e0());
                        break;
                    case 1:
                        n5 n5Var3 = this.b;
                        n5Var3.getClass();
                        I.u();
                        n5Var3.presentFragment(new h8());
                        break;
                    case 2:
                        n5 n5Var4 = this.b;
                        n5Var4.getClass();
                        I.u();
                        n5Var4.presentFragment(new ba());
                        break;
                    default:
                        I.u();
                        n5 n5Var5 = this.b;
                        n5.C0(n5Var5.getParentActivity(), n5Var5.getResourceProvider());
                        break;
                }
            }
        }, false);
        if (BuildVars.DEBUG_PRIVATE_VERSION) {
            I.k();
            i80 J2 = I.J();
            J2.c(R.drawable.ic_ab_back, LocaleController.getString(R.string.WalletBack), new ut0(I, i11), false);
            J2.k();
            ScrollView scrollView2 = new ScrollView(context);
            LinearLayout linearLayout2 = new LinearLayout(context);
            linearLayout2.setOrientation(1);
            scrollView2.addView(linearLayout2);
            J2.r(scrollView2, w7.z5.n(-1, 350));
            int i16 = n5Var.currentAccount;
            zh.d[] dVarArr = zh.d.f;
            if (dVarArr[i16] == null) {
                dVarArr[i16] = new zh.d(i16);
            }
            zh.d dVar = dVarArr[i16];
            boolean[] zArr = {true};
            i01 i01Var = new i01(new i01(n5Var, linearLayout2, context, I, dVar, 8), I, J2, dVar, zArr, 7);
            I = I;
            I.c(0, "Card backdrop (debug)", i01Var, false);
            I.p = new h(n5Var, zArr, w6Var2, 8);
        }
        if (!BuildVars.DEBUG_PRIVATE_VERSION) {
            I.p = new v3(i15, n5Var, w6Var2);
        }
        I.Z();
    }

    public static void Z(n5 n5Var, String str, m0 m0Var, i80 i80Var, LinearLayout linearLayout, TL_wallet.currencyRate currencyrate) {
        if (currencyrate == null) {
            return;
        }
        org.telegram.ui.ActionBar.e1 e1Var = new org.telegram.ui.ActionBar.e1(2, n5Var.getParentActivity(), n5Var.resourceProvider, false, false);
        e1Var.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
        e1Var.setText(currencyrate.currency);
        e1Var.setSubtext(!TextUtils.isEmpty(currencyrate.translatedTitle) ? currencyrate.translatedTitle : currencyrate.title);
        boolean equals = TextUtils.equals(str, currencyrate.currency);
        e1Var.b.setPadding(0, 0, AndroidUtilities.dp(equals ? 42.0f : 0.0f), 0);
        e1Var.setChecked(equals);
        e1Var.setOnClickListener(new n1(m0Var, currencyrate, i80Var, 3));
        linearLayout.addView(e1Var, w7.z5.n(200, -2));
    }

    public static void a0(n5 n5Var) {
        D0(n5Var.getParentActivity(), n5Var.currentAccount, n5Var.getResourceProvider());
    }

    public static void b0(n5 n5Var) {
        pf.d.r(n5Var.getParentActivity(), m0.w(n5Var.currentAccount).j);
    }

    public static void c0(n5 n5Var) {
        org.telegram.ui.ActionBar.k kVar;
        if (n5Var.y == null || (kVar = n5Var.actionBar) == null || !(kVar.getParent() instanceof ViewGroup)) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) n5Var.actionBar.getParent();
        viewGroup.setClipChildren(false);
        viewGroup.setClipToPadding(false);
        if (n5Var.y.getParent() != n5Var.actionBar) {
            AndroidUtilities.removeFromParent(n5Var.y);
            n5Var.actionBar.addView(n5Var.y, w7.z5.c(-1.0f, -1));
        }
        n5Var.y.bringToFront();
        n5Var.actionBar.bringToFront();
        n5Var.y.post(new o3(n5Var, 10));
    }

    public static void d0(n5 n5Var, LinearLayout linearLayout, Context context, i80 i80Var, zh.d dVar) {
        ArrayList arrayList;
        linearLayout.removeAllViews();
        org.telegram.ui.ActionBar.e1 e1Var = new org.telegram.ui.ActionBar.e1(2, context, n5Var.resourceProvider, false, false);
        e1Var.setText("Use card backdrop");
        a5 a5Var = n5Var.d;
        e1Var.setChecked(a5Var != null && a5Var.getDebugBackdropName() == null);
        e1Var.setOnClickListener(new ef0(26, n5Var, i80Var));
        linearLayout.addView(e1Var, w7.z5.n(240, -2));
        TLRPC.TL_shareThemeBackdrops tL_shareThemeBackdrops = dVar.b;
        ArrayList<TLRPC.TL_shareThemeBackdropOption> arrayList2 = tL_shareThemeBackdrops != null ? tL_shareThemeBackdrops.backdrops : null;
        if (arrayList2 == null || arrayList2.isEmpty()) {
            arrayList = new ArrayList();
            for (int i10 = 0; i10 < zh.a.a.length; i10++) {
                TLRPC.TL_shareThemeBackdropOption tL_shareThemeBackdropOption = new TLRPC.TL_shareThemeBackdropOption();
                tL_shareThemeBackdropOption.name = zh.a.a[i10];
                tL_shareThemeBackdropOption.center_color = zh.a.b[i10];
                tL_shareThemeBackdropOption.edge_color = zh.a.c[i10];
                tL_shareThemeBackdropOption.pattern_color = zh.a.d[i10];
                tL_shareThemeBackdropOption.text_color = zh.a.e[i10];
                arrayList.add(tL_shareThemeBackdropOption);
            }
        } else {
            arrayList = new ArrayList(arrayList2);
        }
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            int i12 = i11 + 1;
            TLRPC.TL_shareThemeBackdropOption tL_shareThemeBackdropOption2 = (TLRPC.TL_shareThemeBackdropOption) arrayList.get(i11);
            org.telegram.ui.ActionBar.e1 e1Var2 = new org.telegram.ui.ActionBar.e1(2, context, n5Var.resourceProvider, false, false);
            e1Var2.setText(tL_shareThemeBackdropOption2.name);
            a5 a5Var2 = n5Var.d;
            e1Var2.setChecked(a5Var2 != null && TextUtils.equals(a5Var2.getDebugBackdropName(), tL_shareThemeBackdropOption2.name));
            e1Var2.setOnClickListener(new n1(n5Var, tL_shareThemeBackdropOption2, i80Var, 2));
            linearLayout.addView(e1Var2, w7.z5.n(240, -2));
            i11 = i12;
        }
    }

    public static void e0(n5 n5Var) {
        D0(n5Var.getParentActivity(), n5Var.currentAccount, n5Var.getResourceProvider());
    }

    public static void f0(n5 n5Var, LinearLayout linearLayout, m0 m0Var, i80 i80Var) {
        TL_wallet.currencyRate currencyrate;
        n5 n5Var2;
        ArrayList<TL_wallet.currencyRate> arrayList;
        LinearLayout linearLayout2 = linearLayout;
        m0 m0Var2 = m0Var;
        linearLayout2.removeAllViews();
        String g10 = m0Var2.h.g();
        TL_wallet.currencyRates f7 = m0Var2.h.f();
        if (f7 == null) {
            for (int i10 = 0; i10 < 3; i10++) {
                b10 b10Var = new b10(n5Var.getParentActivity(), n5Var.getResourceProvider());
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
                Z(n5Var, g10, m0Var2, i80Var, linearLayout2, currencyrate7);
            }
            i13++;
            m0Var2 = m0Var;
        }
        if (hashSet.isEmpty() || f7.rates.isEmpty()) {
            n5Var2 = n5Var;
        } else {
            n5Var2 = n5Var;
            linearLayout2.addView(new org.telegram.ui.ActionBar.j1(n5Var.getParentActivity(), n5Var2.resourceProvider), w7.z5.n(-1, 8));
        }
        int i14 = 0;
        while (i14 < f7.rates.size()) {
            TL_wallet.currencyRate currencyrate8 = f7.rates.get(i14);
            if (currencyrate8 != null && !hashSet.contains(currencyrate8.currency)) {
                Z(n5Var2, g10, m0Var, i80Var, linearLayout2, currencyrate8);
            }
            i14++;
            n5Var2 = n5Var;
            linearLayout2 = linearLayout;
        }
    }

    public static void g0(n5 n5Var) {
        m0 w9 = m0.w(n5Var.currentAccount);
        ei.d dVar = n5Var.B0;
        if (dVar.N) {
            return;
        }
        dVar.setLoading(true);
        boolean z10 = false;
        w9.j0(new e2.o0(w9, new x(6, n5Var, w9), z10, z10, 3));
    }

    public static void h0(n5 n5Var, long j10) {
        o3 o3Var = n5Var.J0;
        if (n5Var.a == null) {
            return;
        }
        n8 n8Var = n5Var.h0;
        if (n8Var != null) {
            n8Var.a();
        }
        if (n5Var.H0 <= 0.0f && n5Var.w0()) {
            int top = n5Var.a.V2.m(n5Var.f).getTop() - n5Var.a.getPaddingTop();
            n5Var.a.B0();
            if (top < 0) {
                n5Var.a.v0(0, top, bs.h);
                return;
            }
            return;
        }
        n5Var.a.B0();
        n5Var.o0(true);
        AndroidUtilities.cancelRunOnUIThread(o3Var);
        if (j10 > 0) {
            AndroidUtilities.runOnUIThread(o3Var, j10 + 260);
        }
    }

    public static Typeface n0(Context context) {
        if (R0 == null) {
            if (Build.VERSION.SDK_INT >= 26) {
                R0 = new Typeface.Builder(context.getAssets(), "fonts/rmono_var.ttf").setFontVariationSettings("'wght' 500").setWeight(500).build();
            } else {
                R0 = AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MONO);
            }
        }
        return R0;
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x03c2  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x03ee A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x03ff  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x05bd  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x063f  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0687  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0628  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x055a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static LinearLayout p0(Context context, int i10, TL_wallet.walletTransaction wallettransaction, Utilities.Callback3 callback3, Utilities.Callback2 callback2, byte[] bArr, Runnable runnable, org.telegram.ui.ActionBar.d6 d6Var, k2[] k2VarArr) {
        p4 p4Var;
        ImageView imageView;
        String s10;
        String str;
        int i11;
        float f7;
        int i12;
        boolean[] zArr;
        TextView[] textViewArr;
        TL_wallet.walletTransaction wallettransaction2;
        String[] strArr;
        ImageView imageView2;
        LinearLayout linearLayout;
        j01 j01Var;
        TextView textView;
        q4 q4Var;
        int i13;
        s4 s4Var;
        final k2[] k2VarArr2;
        char c10;
        Object r10;
        int i14;
        q4 q4Var2;
        final FrameLayout frameLayout;
        final Context context2 = context;
        final org.telegram.ui.ActionBar.d6 d6Var2 = d6Var;
        boolean z10 = callback3 != null;
        final LinearLayout e = lk.e(context2, 1);
        FrameLayout frameLayout2 = new FrameLayout(context2);
        e.addView(frameLayout2, w7.z5.n(-1, 56));
        int i15 = org.telegram.ui.ActionBar.h6.G6;
        int w02 = org.telegram.ui.ActionBar.h6.w0(i15, d6Var2);
        int w03 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.i6, d6Var2);
        ImageView imageView3 = new ImageView(context2);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView3.setScaleType(scaleType);
        imageView3.setImageResource(R.drawable.ic_ab_close);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView3.setColorFilter(new PorterDuffColorFilter(w02, mode));
        imageView3.setBackground(org.telegram.ui.ActionBar.h6.g0(w03, 1, -1));
        imageView3.setContentDescription(LocaleController.getString(R.string.Close));
        frameLayout2.addView(imageView3, w7.z5.d(48, 48.0f, 19, 4.0f, -2.0f, 0.0f, 0.0f));
        ImageView imageView4 = new ImageView(context2);
        imageView4.setScaleType(scaleType);
        imageView4.setImageResource(R.drawable.ic_ab_other);
        imageView4.setColorFilter(new PorterDuffColorFilter(w02, mode));
        imageView4.setBackground(org.telegram.ui.ActionBar.h6.g0(w03, 1, -1));
        imageView4.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        imageView4.setVisibility(callback3 != null ? 8 : 0);
        frameLayout2.addView(imageView4, w7.z5.d(44, 48.0f, 21, 0.0f, 2.0f, 4.0f, 0.0f));
        LinearLayout linearLayout2 = new LinearLayout(context2);
        linearLayout2.setOrientation(1);
        linearLayout2.setGravity(1);
        e.addView(linearLayout2, w7.z5.k(14.0f, wallettransaction.key_change ? -20.0f : -40.0f, 14.0f, 24.0f, -1, -2));
        View m6Var = new m6(120, context2, false);
        m6Var.setTag(m6.class);
        linearLayout2.addView(m6Var, w7.z5.t(120, 120, 1, 0, 0, 0, -8));
        p4 p4Var2 = new p4(context2);
        p4Var2.setSingleLine(true);
        p4Var2.setGravity(17);
        p4Var2.setIncludeFontPadding(false);
        p4Var2.setTextSize(1, 40.0f);
        p4Var2.setTypeface(AndroidUtilities.bold());
        linearLayout2.addView(p4Var2, w7.z5.q(-1, 50, 1));
        TextView textView2 = new TextView(context2);
        textView2.setGravity(17);
        textView2.setIncludeFontPadding(false);
        textView2.setTextSize(1, 14.0f);
        int i16 = org.telegram.ui.ActionBar.h6.z6;
        textView2.setTextColor(org.telegram.ui.ActionBar.h6.w0(i16, d6Var2));
        linearLayout2.addView(textView2, w7.z5.t(-1, 20, 1, 0, 3, 0, 0));
        if (wallettransaction.key_change) {
            linearLayout2.removeAllViews();
            FrameLayout frameLayout3 = new FrameLayout(context2);
            frameLayout3.setBackground(org.telegram.ui.ActionBar.h6.L(AndroidUtilities.dp(76.0f), -7956054, -9534569));
            ImageView imageView5 = new ImageView(context2);
            imageView5.setImageResource(R.drawable.wallet_transaction_key);
            imageView5.setScaleType(ImageView.ScaleType.FIT_CENTER);
            p4Var = p4Var2;
            frameLayout3.addView(imageView5, w7.z5.e(44, 44, 17));
            linearLayout2.addView(frameLayout3, w7.z5.q(76, 76, 1));
            TextView textView3 = new TextView(context2);
            textView3.setText(LocaleController.getString(R.string.WalletKeyUpdate));
            textView3.setTextColor(w02);
            textView3.setTextSize(1, 18.0f);
            textView3.setTypeface(AndroidUtilities.bold());
            textView3.setGravity(17);
            textView3.setIncludeFontPadding(false);
            linearLayout2.addView(textView3, w7.z5.t(-1, 24, 1, 12, 12, 12, 0));
        } else {
            p4Var = p4Var2;
            if (wallettransaction.nft != null) {
                linearLayout2.removeAllViews();
                TL_wallet.nftItem nftitem = wallettransaction.nft;
                org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(context2);
                w9Var.setRoundRadius(AndroidUtilities.dp(12.0f));
                w9Var.setContentDescription(nftitem.name);
                imageView = imageView4;
                Drawable mutate = context2.getResources().getDrawable(R.drawable.wallet_nft_placeholder).mutate();
                mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(i16, d6Var2), mode));
                ImageLocation c11 = c.c(nftitem, false);
                if (c11 != null) {
                    w9Var.h(c11, "120_120", mutate, nftitem);
                } else {
                    w9Var.setImageDrawable(mutate);
                }
                linearLayout2.addView(w9Var, w7.z5.q(120, 120, 1));
                TextView textView4 = new TextView(context2);
                textView4.setText(TextUtils.isEmpty(nftitem.name) ? LocaleController.getString(R.string.WalletCollectible) : nftitem.name);
                textView4.setTextColor(w02);
                textView4.setTextSize(1, 17.0f);
                textView4.setTypeface(AndroidUtilities.bold());
                textView4.setGravity(17);
                linearLayout2.addView(textView4, w7.z5.k(12.0f, 16.0f, 12.0f, 0.0f, -1, -2));
                if (wallettransaction.incoming) {
                    s10 = m0.w(i10).s();
                } else {
                    TL_wallet.WalletTransactionPeer walletTransactionPeer = wallettransaction.peer;
                    if (walletTransactionPeer == null) {
                        str = null;
                        if (callback3 == null) {
                            if (wallettransaction.comment_encrypted || wallettransaction.comment_encrypted_preparing) {
                                f7 = 11.0f;
                                if (wallettransaction.comment_encrypted_preparing || !TextUtils.isEmpty(str)) {
                                    wh.n nVar = new wh.n(context2, d6Var2, false);
                                    nVar.r = false;
                                    nVar.setTextSize(1, 15.0f);
                                    nVar.setTextColor(org.telegram.ui.ActionBar.h6.w0(i15, d6Var2));
                                    StringBuilder sb2 = new StringBuilder(25);
                                    int i17 = 0;
                                    for (int i18 = 25; i17 < i18; i18 = 25) {
                                        sb2.append("a");
                                        i17++;
                                    }
                                    SpannableString spannableString = new SpannableString(sb2.toString());
                                    l11 l11Var = new l11();
                                    l11Var.a |= 256;
                                    spannableString.setSpan(new m11(l11Var, 0), 0, spannableString.length(), 33);
                                    nVar.setText(spannableString);
                                    org.telegram.ui.ActionBar.f5 f5Var = new org.telegram.ui.ActionBar.f5(0, false, false, null);
                                    f5Var.x = false;
                                    f5Var.w = Integer.valueOf(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.jl, d6Var2));
                                    nVar.setBackground(f5Var);
                                    nVar.setPadding(AndroidUtilities.dp(19.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(15.0f), AndroidUtilities.dp(11.0f));
                                    linearLayout2.addView(nVar, w7.z5.t(-2, -2, 1, 32, 15, 32, 0));
                                    w7.b6.a(nVar);
                                    i11 = 1;
                                    nVar.setOnClickListener(new pb(new boolean[]{false}, k2VarArr, d6Var2, nVar, wallettransaction, i10, str));
                                }
                            } else if (TextUtils.isEmpty(wallettransaction.comment)) {
                                f7 = 11.0f;
                            } else {
                                wh.n nVar2 = new wh.n(context2);
                                nVar2.setTextSize(1, 15.0f);
                                nVar2.setTextColor(org.telegram.ui.ActionBar.h6.w0(i15, d6Var2));
                                f7 = 11.0f;
                                nVar2.setText(Emoji.replaceEmoji(wallettransaction.comment, nVar2.getPaint().getFontMetricsInt(), false));
                                nVar2.setTextIsSelectable(true);
                                org.telegram.ui.ActionBar.f5 f5Var2 = new org.telegram.ui.ActionBar.f5(0, false, false, null);
                                f5Var2.x = false;
                                f5Var2.w = Integer.valueOf(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.jl, d6Var2));
                                nVar2.setBackground(f5Var2);
                                nVar2.setPadding(AndroidUtilities.dp(19.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(15.0f), AndroidUtilities.dp(8.0f));
                                linearLayout2.addView(nVar2, w7.z5.t(-2, -2, 1, 32, 16, 32, 0));
                            }
                            i12 = w02;
                            i11 = 1;
                            SpannableString[] spannableStringArr = new SpannableString[i11];
                            TextView[] textViewArr2 = new TextView[i11];
                            j01 j01Var2 = new j01(context2, d6Var2);
                            e.addView(j01Var2, w7.z5.k(14.0f, 0.0f, 14.0f, 0.0f, -1, -2));
                            final String[] strArr2 = {wallettransaction.comment};
                            final boolean[] zArr2 = {(wallettransaction.comment_encrypted || (z10 && bArr == null)) ? false : true};
                            if (callback3 == null) {
                                FrameLayout frameLayout4 = new FrameLayout(context2);
                                frameLayout4.setBackground(org.telegram.ui.ActionBar.h6.d0(AndroidUtilities.dp(22.0f), AndroidUtilities.dp(22.0f), org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.a7, d6Var2)));
                                final v3 v3Var = new v3(0, textViewArr2, spannableStringArr);
                                final Runnable[] runnableArr = new Runnable[1];
                                imageView2 = imageView3;
                                textView = textView2;
                                final org.telegram.messenger.b6 b6Var = new org.telegram.messenger.b6(runnableArr, textViewArr2, i10, d6Var2, wallettransaction, strArr2, zArr2, bArr);
                                textViewArr = textViewArr2;
                                d6Var2 = d6Var2;
                                q4 q4Var3 = new q4(context2, d6Var2);
                                q4Var3.setHint(LocaleController.getString(R.string.WalletOptionalComment));
                                q4Var3.setText(strArr2[0]);
                                j01Var = j01Var2;
                                q4Var3.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(f7), AndroidUtilities.dp(64.0f), AndroidUtilities.dp(12.0f));
                                int i19 = org.telegram.ui.ActionBar.h6.G6;
                                q4Var3.setTextColor(org.telegram.ui.ActionBar.h6.w0(i19, d6Var2));
                                q4Var3.setHintTextColor(org.telegram.ui.ActionBar.h6.m1(0.65f, org.telegram.ui.ActionBar.h6.w0(i19, d6Var2)));
                                q4Var3.setMaxLines(4);
                                frameLayout4.addView(q4Var3, w7.z5.d(-1, -2.0f, 119, 0.0f, 0.0f, (wallettransaction.nft != null || bArr == null) ? 0.0f : 44.0f, 0.0f));
                                q4Var3.addTextChangedListener(new r4(strArr2, v3Var, runnableArr, b6Var));
                                if (wallettransaction.nft != null || bArr == null) {
                                    wallettransaction2 = wallettransaction;
                                    q4Var2 = q4Var3;
                                    strArr = strArr2;
                                    zArr = zArr2;
                                    frameLayout = frameLayout4;
                                    linearLayout = e;
                                } else {
                                    FrameLayout frameLayout5 = new FrameLayout(context2);
                                    w7.b6.a(frameLayout5);
                                    final ImageView imageView6 = new ImageView(context2);
                                    frameLayout5.addView(imageView6, w7.z5.c(-1.0f, -1));
                                    imageView6.setScaleType(ImageView.ScaleType.CENTER);
                                    imageView6.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(zArr2[0] ? org.telegram.ui.ActionBar.h6.Oh : org.telegram.ui.ActionBar.h6.z6, d6Var2), PorterDuff.Mode.SRC_IN));
                                    imageView6.setImageResource(zArr2[0] ? R.drawable.wallet_comment_locked : R.drawable.wallet_comment_unlocked);
                                    imageView6.setBackground(org.telegram.ui.ActionBar.h6.g0(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.i6, d6Var2), 1, -1));
                                    final ei.x3[] x3VarArr = new ei.x3[1];
                                    frameLayout = frameLayout4;
                                    q4Var2 = q4Var3;
                                    wallettransaction2 = wallettransaction;
                                    View.OnClickListener onClickListener = new View.OnClickListener() { // from class: org.telegram.ui.Wallet.w3
                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view) {
                                            final boolean[] zArr3 = zArr2;
                                            zArr3[0] = !zArr3[0];
                                            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
                                            final AtomicBoolean atomicBoolean = new AtomicBoolean();
                                            final ImageView imageView7 = imageView6;
                                            final org.telegram.ui.ActionBar.d6 d6Var3 = d6Var2;
                                            duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Wallet.c4
                                                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                                                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                                    float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                                    float abs = ((Math.abs(floatValue - 0.5f) / 0.5f) * 0.25f) + 0.75f;
                                                    ImageView imageView8 = imageView7;
                                                    imageView8.setScaleX(abs);
                                                    imageView8.setScaleY(abs);
                                                    if (floatValue >= 0.5f) {
                                                        AtomicBoolean atomicBoolean2 = atomicBoolean;
                                                        if (atomicBoolean2.get()) {
                                                            return;
                                                        }
                                                        atomicBoolean2.set(true);
                                                        boolean[] zArr4 = zArr3;
                                                        imageView8.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(zArr4[0] ? org.telegram.ui.ActionBar.h6.Oh : org.telegram.ui.ActionBar.h6.z6, d6Var3), PorterDuff.Mode.SRC_IN));
                                                        imageView8.setImageResource(zArr4[0] ? R.drawable.wallet_comment_locked : R.drawable.wallet_comment_unlocked);
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
                                                ei.x3 x3Var2 = new ei.x3(context2, 3);
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
                                            v3Var.run();
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
                                    };
                                    zArr = zArr2;
                                    linearLayout = e;
                                    context2 = context2;
                                    strArr = strArr2;
                                    frameLayout5.setOnClickListener(onClickListener);
                                    frameLayout.addView(frameLayout5, w7.z5.e(44, 44, 85));
                                }
                                linearLayout.addView(frameLayout, w7.z5.k(14.0f, 12.0f, 14.0f, 8.0f, -1, -2));
                                q4Var = q4Var2;
                            } else {
                                zArr = zArr2;
                                textViewArr = textViewArr2;
                                wallettransaction2 = wallettransaction;
                                strArr = strArr2;
                                imageView2 = imageView3;
                                linearLayout = e;
                                j01Var = j01Var2;
                                textView = textView2;
                                q4Var = null;
                            }
                            ei.d f10 = lk.f(24, context2, d6Var2, true);
                            f10.setText(LocaleController.getString(R.string.OK));
                            linearLayout.addView(f10, w7.z5.k(14.0f, 14.0f, 14.0f, 14.0f, -1, 48));
                            TL_wallet.walletTransaction[] wallettransactionArr = {wallettransaction2};
                            q4 q4Var4 = q4Var;
                            x3 x3Var = new x3(linearLayout, p4Var, d6Var2, i10, textView, k2VarArr, j01Var, callback3, context2, textViewArr, i12, spannableStringArr);
                            LinearLayout linearLayout3 = linearLayout;
                            linearLayout3.setTag(new v3(1, x3Var, wallettransactionArr));
                            x3Var.run(wallettransaction2);
                            if (z10) {
                                i13 = i10;
                                s4 s4Var2 = new s4(i13, wallettransactionArr, x3Var);
                                if (wallettransaction2.preview) {
                                    m0 w9 = m0.w(i13);
                                    String str2 = wallettransaction2.id;
                                    p pVar = new p(wallettransaction2, x3Var, wallettransactionArr, 4);
                                    HashMap hashMap = w9.K;
                                    l0 l0Var = w9.n;
                                    if (l0Var != null) {
                                        ArrayList arrayList = l0Var.c;
                                        int size = arrayList.size();
                                        int i20 = 0;
                                        while (i20 < size) {
                                            Object obj = arrayList.get(i20);
                                            i20++;
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
                                s4Var = s4Var2;
                            } else {
                                i13 = i10;
                                s4Var = null;
                            }
                            String[] strArr3 = strArr;
                            boolean[] zArr3 = zArr;
                            linearLayout3.addOnAttachStateChangeListener(new t4(x3Var, wallettransactionArr, s4Var, i13, callback2, k2VarArr, strArr3, zArr3));
                            if (callback3 == null) {
                                int i21 = R.string.WalletSendAmount;
                                TL_wallet.nftItem nftitem2 = wallettransaction2.nft;
                                if (nftitem2 != null) {
                                    r10 = TextUtils.isEmpty(nftitem2.name) ? LocaleController.getString(R.string.WalletCollectible) : wallettransaction2.nft.name;
                                    i14 = 1;
                                    c10 = 0;
                                } else {
                                    c10 = 0;
                                    r10 = m0.r(Math.abs(wallettransaction2.amount), false);
                                    i14 = 1;
                                }
                                Object[] objArr = new Object[i14];
                                objArr[c10] = r10;
                                f10.setText(LocaleController.formatSpannable(i21, objArr));
                                k2VarArr2 = k2VarArr;
                                f10.setOnClickListener(new org.telegram.messenger.video.f(f10, q4Var4, callback3, strArr3, zArr3, k2VarArr2, d6Var));
                            } else {
                                k2VarArr2 = k2VarArr;
                                if (runnable != null) {
                                    f10.setText(LocaleController.getString(R.string.WalletOpenMyWallet));
                                    f10.setOnClickListener(new ef0(25, runnable, k2VarArr2));
                                } else {
                                    final int i22 = 0;
                                    f10.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Wallet.u3
                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view) {
                                            switch (i22) {
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
                            final int i23 = 1;
                            imageView2.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Wallet.u3
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
                            ImageView imageView7 = imageView;
                            imageView7.setOnClickListener(new nb(k2VarArr2, d6Var, imageView7, wallettransactionArr, context, i10));
                            return linearLayout3;
                        }
                        i11 = 1;
                        f7 = 11.0f;
                        i12 = w02;
                        SpannableString[] spannableStringArr2 = new SpannableString[i11];
                        TextView[] textViewArr22 = new TextView[i11];
                        j01 j01Var22 = new j01(context2, d6Var2);
                        e.addView(j01Var22, w7.z5.k(14.0f, 0.0f, 14.0f, 0.0f, -1, -2));
                        final String[] strArr22 = {wallettransaction.comment};
                        final boolean[] zArr22 = {(wallettransaction.comment_encrypted || (z10 && bArr == null)) ? false : true};
                        if (callback3 == null) {
                        }
                        ei.d f102 = lk.f(24, context2, d6Var2, true);
                        f102.setText(LocaleController.getString(R.string.OK));
                        linearLayout.addView(f102, w7.z5.k(14.0f, 14.0f, 14.0f, 14.0f, -1, 48));
                        TL_wallet.walletTransaction[] wallettransactionArr2 = {wallettransaction2};
                        q4 q4Var42 = q4Var;
                        x3 x3Var2 = new x3(linearLayout, p4Var, d6Var2, i10, textView, k2VarArr, j01Var, callback3, context2, textViewArr, i12, spannableStringArr2);
                        LinearLayout linearLayout32 = linearLayout;
                        linearLayout32.setTag(new v3(1, x3Var2, wallettransactionArr2));
                        x3Var2.run(wallettransaction2);
                        if (z10) {
                        }
                        String[] strArr32 = strArr;
                        boolean[] zArr32 = zArr;
                        linearLayout32.addOnAttachStateChangeListener(new t4(x3Var2, wallettransactionArr2, s4Var, i13, callback2, k2VarArr, strArr32, zArr32));
                        if (callback3 == null) {
                        }
                        final int i232 = 1;
                        imageView2.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Wallet.u3
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                switch (i232) {
                                    case 0:
                                        k2VarArr2[0].dismiss();
                                        break;
                                    default:
                                        k2VarArr2[0].dismiss();
                                        break;
                                }
                            }
                        });
                        ImageView imageView72 = imageView;
                        imageView72.setOnClickListener(new nb(k2VarArr2, d6Var, imageView72, wallettransactionArr2, context, i10));
                        return linearLayout32;
                    }
                    s10 = walletTransactionPeer.address;
                }
                str = s10;
                if (callback3 == null) {
                }
                i12 = w02;
                SpannableString[] spannableStringArr22 = new SpannableString[i11];
                TextView[] textViewArr222 = new TextView[i11];
                j01 j01Var222 = new j01(context2, d6Var2);
                e.addView(j01Var222, w7.z5.k(14.0f, 0.0f, 14.0f, 0.0f, -1, -2));
                final String[] strArr222 = {wallettransaction.comment};
                final boolean[] zArr222 = {(wallettransaction.comment_encrypted || (z10 && bArr == null)) ? false : true};
                if (callback3 == null) {
                }
                ei.d f1022 = lk.f(24, context2, d6Var2, true);
                f1022.setText(LocaleController.getString(R.string.OK));
                linearLayout.addView(f1022, w7.z5.k(14.0f, 14.0f, 14.0f, 14.0f, -1, 48));
                TL_wallet.walletTransaction[] wallettransactionArr22 = {wallettransaction2};
                q4 q4Var422 = q4Var;
                x3 x3Var22 = new x3(linearLayout, p4Var, d6Var2, i10, textView, k2VarArr, j01Var, callback3, context2, textViewArr, i12, spannableStringArr22);
                LinearLayout linearLayout322 = linearLayout;
                linearLayout322.setTag(new v3(1, x3Var22, wallettransactionArr22));
                x3Var22.run(wallettransaction2);
                if (z10) {
                }
                String[] strArr322 = strArr;
                boolean[] zArr322 = zArr;
                linearLayout322.addOnAttachStateChangeListener(new t4(x3Var22, wallettransactionArr22, s4Var, i13, callback2, k2VarArr, strArr322, zArr322));
                if (callback3 == null) {
                }
                final int i2322 = 1;
                imageView2.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Wallet.u3
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i2322) {
                            case 0:
                                k2VarArr2[0].dismiss();
                                break;
                            default:
                                k2VarArr2[0].dismiss();
                                break;
                        }
                    }
                });
                ImageView imageView722 = imageView;
                imageView722.setOnClickListener(new nb(k2VarArr2, d6Var, imageView722, wallettransactionArr22, context, i10));
                return linearLayout322;
            }
        }
        imageView = imageView4;
        if (wallettransaction.incoming) {
        }
        str = s10;
        if (callback3 == null) {
        }
        i12 = w02;
        SpannableString[] spannableStringArr222 = new SpannableString[i11];
        TextView[] textViewArr2222 = new TextView[i11];
        j01 j01Var2222 = new j01(context2, d6Var2);
        e.addView(j01Var2222, w7.z5.k(14.0f, 0.0f, 14.0f, 0.0f, -1, -2));
        final String[] strArr2222 = {wallettransaction.comment};
        final boolean[] zArr2222 = {(wallettransaction.comment_encrypted || (z10 && bArr == null)) ? false : true};
        if (callback3 == null) {
        }
        ei.d f10222 = lk.f(24, context2, d6Var2, true);
        f10222.setText(LocaleController.getString(R.string.OK));
        linearLayout.addView(f10222, w7.z5.k(14.0f, 14.0f, 14.0f, 14.0f, -1, 48));
        TL_wallet.walletTransaction[] wallettransactionArr222 = {wallettransaction2};
        q4 q4Var4222 = q4Var;
        x3 x3Var222 = new x3(linearLayout, p4Var, d6Var2, i10, textView, k2VarArr, j01Var, callback3, context2, textViewArr, i12, spannableStringArr222);
        LinearLayout linearLayout3222 = linearLayout;
        linearLayout3222.setTag(new v3(1, x3Var222, wallettransactionArr222));
        x3Var222.run(wallettransaction2);
        if (z10) {
        }
        String[] strArr3222 = strArr;
        boolean[] zArr3222 = zArr;
        linearLayout3222.addOnAttachStateChangeListener(new t4(x3Var222, wallettransactionArr222, s4Var, i13, callback2, k2VarArr, strArr3222, zArr3222));
        if (callback3 == null) {
        }
        final int i23222 = 1;
        imageView2.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Wallet.u3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i23222) {
                    case 0:
                        k2VarArr2[0].dismiss();
                        break;
                    default:
                        k2VarArr2[0].dismiss();
                        break;
                }
            }
        });
        ImageView imageView7222 = imageView;
        imageView7222.setOnClickListener(new nb(k2VarArr2, d6Var, imageView7222, wallettransactionArr222, context, i10));
        return linearLayout3222;
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

    public static SpannableStringBuilder s0(int i10, long j10, org.telegram.ui.ActionBar.d6 d6Var) {
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

    public final void B0(TL_wallet.nftItem nftitem) {
        TL_stars.StarGift starGift = nftitem.gift;
        if (starGift instanceof TL_stars.TL_starGiftUnique) {
            TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) starGift;
            ai.k7 k7Var = new ai.k7(getParentActivity(), this.currentAccount, 0L, getResourceProvider(), null);
            k7Var.f1 = nftitem;
            if (this.i0 != null) {
                k7Var.g1 = new u4(this, tL_starGiftUnique, nftitem);
                k7Var.h1 = new v4(this, nftitem);
            }
            k7Var.D2(tL_starGiftUnique.slug, tL_starGiftUnique, null);
            showDialog(k7Var);
            return;
        }
        Activity parentActivity = getParentActivity();
        org.telegram.ui.ActionBar.d6 resourceProvider = getResourceProvider();
        if (parentActivity != null) {
            int w02 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.a7, resourceProvider);
            int w03 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.G6, resourceProvider);
            k4 k4Var = new k4(parentActivity, resourceProvider);
            k4Var.setBackgroundColor(w02);
            k4Var.fixNavigationBar(w02);
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
                j01 j01Var = new j01(parentActivity, resourceProvider);
                j01Var.setBackground(org.telegram.ui.ActionBar.h6.c0(AndroidUtilities.dp(10.0f), org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.d6, resourceProvider)));
                ArrayList<TL_wallet.nftAttribute> arrayList2 = nftitem.attributes;
                int size = arrayList2.size();
                int i13 = 0;
                while (i13 < size) {
                    TL_wallet.nftAttribute nftattribute = arrayList2.get(i13);
                    i13++;
                    TL_wallet.nftAttribute nftattribute2 = nftattribute;
                    j01Var.c(nftattribute2.trait_type, nftattribute2.value, null, null);
                }
                linearLayout.addView(j01Var, w7.z5.k(0.0f, 0.0f, 0.0f, 14.0f, -1, -2));
            }
            ei.d dVar = new ei.d(parentActivity, resourceProvider, true);
            dVar.setRoundRadius(24);
            dVar.setText(LocaleController.getString(R.string.WalletOK));
            linearLayout.addView(dVar, w7.z5.n(-1, 48));
            k4Var.setCustomView(scrollView);
            k4Var.useBackgroundTopPadding = false;
            linearLayout2.getChildAt(0).setOnClickListener(new ef0(24, k4Var, nftitem));
            linearLayout2.getChildAt(1).setOnClickListener(new t2(parentActivity, 1));
            dVar.setOnClickListener(new t2(k4Var, 2));
            k4Var.show();
            k4Var.fixNavigationBar(w02);
            AndroidUtilities.setNavigationBarColor((Dialog) k4Var, w02, false);
        }
    }

    public final void E0() {
        if (getParentActivity() == null) {
            return;
        }
        if (getParentActivity().checkSelfPermission("android.permission.CAMERA") != 0) {
            getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 44);
        } else {
            org.telegram.ui.y9.e0(getParentActivity(), true, 1, new ki.t1(this, 19));
        }
    }

    public final void F0(boolean z10) {
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
        S0();
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
            G0(f7);
            this.o0.o(false);
        } else {
            this.g0.setVisibility(0);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.k0, f7);
            this.l0 = ofFloat;
            ofFloat.setDuration(250L);
            this.l0.setInterpolator(bs.h);
            this.l0.addUpdateListener(new z3(this, 0));
            this.l0.addListener(new org.telegram.ui.ActionBar.y0(this, f7, 7));
            this.l0.start();
        }
        if (this.a == null || this.n0 == H0()) {
            return;
        }
        Q0(false);
    }

    public final void G0(float f7) {
        this.k0 = f7;
        this.g0.setVisibility((f7 > 0.0f || this.l0 != null) ? 0 : 8);
        this.g0.setAlpha(f7);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.g0.getLayoutParams();
        layoutParams.height = Math.round(AndroidUtilities.dp(52.0f) * f7);
        layoutParams.bottomMargin = -Math.round(AndroidUtilities.dp(6.0f) * f7);
        this.g0.setLayoutParams(layoutParams);
    }

    public final boolean H0() {
        l0 l0Var;
        if (this.e0 || (l0Var = this.C0) == null || !l0Var.c.isEmpty()) {
            return false;
        }
        l0 l0Var2 = this.C0;
        l0Var2.getClass();
        return l0Var2.h;
    }

    public final void I0() {
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

    public final void J0() {
        this.r = false;
        u61 u61Var = this.a;
        if (u61Var != null) {
            u61Var.C2.b.remove(this.v);
            this.a.removeCallbacks(this.s);
        }
        a5 a5Var = this.d;
        if (a5Var != null) {
            a5Var.setAdditionalTilt(0.0f);
        }
    }

    public final void K0() {
        m0 w9 = m0.w(this.currentAccount);
        T0();
        this.B0.setEnabled(w9.E() && w9.d());
        if (!w9.E()) {
            this.s0.setText(z0(0));
            this.t0.setText(z0(1));
            return;
        }
        long u10 = w9.u();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (this.N0 == null) {
            this.N0 = new SpannableString("G");
            a5 a5Var = this.d;
            a5Var.getClass();
            w5 w5Var = new w5(a5Var, R.drawable.wallet_gram_large);
            this.u0 = w5Var;
            SpannableString spannableString = this.N0;
            spannableString.setSpan(w5Var, 0, spannableString.length(), 33);
        }
        spannableStringBuilder.append((CharSequence) this.N0);
        spannableStringBuilder.append((CharSequence) " ");
        spannableStringBuilder.append((CharSequence) x5.d(u10));
        spannableStringBuilder.append((CharSequence) " ");
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.GramCurrency));
        if (this.v0 == null) {
            d5 d5Var = new d5();
            d5Var.a = -9577217;
            this.v0 = d5Var;
        }
        spannableStringBuilder.setSpan(this.v0, length, spannableStringBuilder.length(), 33);
        this.s0.setText(spannableStringBuilder);
        CharSequence l4 = m0.w(this.currentAccount).l(u10, false);
        if (TextUtils.isEmpty(l4)) {
            this.t0.setText(z0(1));
        } else {
            this.t0.setText(l4);
        }
        N0(this.w0);
        e0 e0Var = this.D0;
        if (e0Var != null && !e0Var.h && !e0Var.i && e0Var.k == null) {
            e0Var.e();
        }
        String s10 = w9.s();
        if (TextUtils.isEmpty(s10)) {
            return;
        }
        this.d.setCardNumber(r0(s10.toUpperCase()));
    }

    public final void L0() {
        float[] fArr;
        float[] fArr2;
        Rect rect = this.F;
        if (rect.isEmpty() || !this.x.isAttachedToWindow()) {
            return;
        }
        a5 a5Var = this.d;
        ah.v vVar = this.y;
        Matrix matrix = this.G;
        if (a5Var.g(vVar, matrix)) {
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
            a5 a5Var2 = this.d;
            Matrix matrix4 = a5Var2.c;
            Matrix matrix5 = a5Var2.e;
            Matrix matrix6 = a5Var2.d;
            if (matrix.invert(matrix6)) {
                matrix5.setConcat(matrix6, matrix3);
                if (!a5Var2.n || !matrix4.equals(matrix5)) {
                    matrix4.set(matrix5);
                    a5Var2.n = true;
                    a5Var2.O.invalidate();
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
    public final void M0() {
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
        P0();
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
                    M0();
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
                L0();
            } else {
                a5 a5Var = this.d;
                a5Var.i(0.0f, 0.0f);
                LinearLayout linearLayout2 = a5Var.N;
                AndroidUtilities.removeFromParent(linearLayout2);
                linearLayout2.setScaleX(1.0f);
                linearLayout2.setScaleY(1.0f);
                linearLayout2.setRotationX(0.0f);
                linearLayout2.setRotationY(0.0f);
                linearLayout2.setTranslationX(0.0f);
                linearLayout2.setTranslationY(0.0f);
                v5 v5Var = a5Var.P;
                v5Var.setScaleX(1.0f);
                v5Var.setScaleY(1.0f);
                a5Var.E.addView(linearLayout2, a5Var.Q);
                this.r0.layout(rect.left, rect.top, rect.right, rect.bottom);
                this.d.getClass();
                L0();
            }
            this.y.invalidate();
        }
        N0(clamp);
        if (this.E) {
            L0();
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

    public final void N0(float f7) {
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.h6.G6);
        this.s0.setTextColor(AndroidUtilities.lerpColor(-1, themedColor, f7));
        org.telegram.ui.Components.q6 q6Var = this.t0;
        float[] fArr = this.d.b0;
        int i10 = -7868417;
        if (fArr != null) {
            i10 = i0.a.f(fArr[8], h7.q(fArr, -7868417, 0), h7.q(fArr, -7868417, 3));
        }
        q6Var.setTextColor(AndroidUtilities.lerpColor(i10, i0.a.o(themedColor, Math.round(142.8f)), f7));
        w5 w5Var = this.u0;
        if (w5Var != null) {
            w5Var.setOverrideColor(AndroidUtilities.lerpColor(-1, getThemedColor(org.telegram.ui.ActionBar.h6.Oh), f7));
        }
        d5 d5Var = this.v0;
        if (d5Var != null) {
            float[] fArr2 = this.d.b0;
            int i11 = -9577217;
            if (fArr2 != null) {
                i11 = i0.a.f(fArr2[8], h7.q(fArr2, -9577217, 0), h7.q(fArr2, -9577217, 3));
            }
            d5Var.a = i0.a.o(i11, Math.round((1.0f - f7) * 255.0f));
        }
        this.s0.invalidate();
    }

    public final void O0(float[] fArr) {
        if (this.A0 == null || this.B0 == null) {
            return;
        }
        float f7 = h7.k(getThemedColor(org.telegram.ui.ActionBar.h6.a7))[0];
        boolean z10 = f7 < 0.6f;
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.h6.Oh);
        if (fArr != null && fArr.length >= 18) {
            int[] iArr = new int[2];
            for (int i10 = 0; i10 < 2; i10++) {
                int i11 = i10 * 4;
                float f10 = fArr[i11 + 10];
                iArr[i10] = f10 < 0.0f ? themedColor : h7.o(themedColor, (int) f10, (int) fArr[i11 + 11]);
            }
            themedColor = i0.a.f(fArr[8], iArr[0], iArr[1]);
        }
        float f11 = z10 ? f7 + 0.25f : 0.0f;
        float f12 = z10 ? 1.0f : f7 - 0.2f;
        float[] k10 = h7.k(themedColor);
        float f13 = k10[0];
        if (f13 < f11 || f13 > f12) {
            themedColor = (themedColor & (-16777216)) | (h7.m(Math.max(f11, Math.min(f12, f13)), k10[1], k10[2]) & 16777215);
        }
        if (themedColor == this.K0) {
            return;
        }
        this.K0 = themedColor;
        int themedColor2 = i0.a.h(themedColor) <= 0.550000011920929d ? getThemedColor(org.telegram.ui.ActionBar.h6.Sh) : -16777216;
        ei.d[] dVarArr = {this.A0, this.B0};
        for (int i12 = 0; i12 < 2; i12++) {
            ei.d dVar = dVarArr[i12];
            dVar.setColor(themedColor);
            dVar.setTextColor(themedColor2);
        }
    }

    public final void P0() {
        u61 u61Var = this.a;
        if (u61Var == null || this.d == null) {
            return;
        }
        float b10 = u61Var.C2.b(1);
        this.d.setAdditionalTilt(Math.max(0.0f, (this.w0 * 10.0f) + ((((float) Math.sqrt(Utilities.clamp01(this.w0))) * 90.0f) - 10.0f)) + Math.min(10.0f, this.a.C2.b(3) * 40.0f) + (-Math.min(10.0f, b10 * 40.0f)));
        this.d.setUseGyroscope(1.0f - ((float) Math.pow(this.w0, 0.33000001311302185d)));
    }

    public final void Q0(boolean z10) {
        boolean H0 = H0();
        u61 u61Var = this.a;
        a71[] a71VarArr = this.q0;
        if (u61Var != null && this.n0 != H0) {
            this.n0 = H0;
            u61Var.B0();
            for (a71 a71Var : a71VarArr) {
                if (a71Var != null) {
                    a71Var.B0();
                }
            }
            this.a.W2.N(false);
            this.a.V2.h1(0, 0);
            this.a.post(new o3(this, 10));
        }
        if (H0) {
            return;
        }
        for (a71 a71Var2 : a71VarArr) {
            if (a71Var2 != null) {
                R0(a71Var2, z10);
            }
        }
        ai.r rVar = this.m0;
        if (rVar != null) {
            rVar.post(new o3(this, 5));
            this.m0.post(new o3(this, 6));
        }
    }

    public final void S0() {
        n8 n8Var = this.h0;
        if (n8Var == null || this.o0 == null || n8Var.w == 0.0f) {
            return;
        }
        n8Var.w = 0.0f;
        n8Var.c.setVisibility(8);
        n8Var.invalidate();
    }

    public final void T0() {
        if (this.R == null) {
            return;
        }
        m0 w9 = m0.w(this.currentAccount);
        boolean z10 = this.R.isAttachedToWindow() && this.R.isLaidOut();
        w4 w4Var = this.R;
        FrameLayout frameLayout = this.S;
        Boolean bool = w9.i;
        w4Var.i(frameLayout, (bool == null || !bool.booleanValue() || TextUtils.isEmpty(w9.j)) ? false : true, z10);
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
            this.V.setText(t0(R.string.WalletOldWalletsBalance, j10));
        }
        this.R.i(this.U, z11, z10);
        long j12 = ai.ga.y(this.currentAccount, true).p().amount;
        boolean z12 = j12 > 500000000;
        if (z12) {
            this.X.setText(t0(R.string.WalletGramEarningsBalance, j12));
        }
        this.R.i(this.W, z12, z10);
    }

    @Override // org.telegram.ui.Components.v61
    public final void U(ArrayList arrayList, s61 s61Var) {
        m0 w9 = m0.w(this.currentAccount);
        T0();
        arrayList.add(f61.l(this.Q));
        this.f = arrayList.size();
        x4 x4Var = this.e;
        f61 f61Var = new f61(-4);
        f61Var.c = x4Var;
        f61Var.z = -1;
        f61Var.e = true;
        arrayList.add(f61Var);
        arrayList.add(f61.l(this.y0));
        boolean H0 = H0();
        this.n0 = H0;
        if (H0) {
            int i10 = R.drawable.wallet_learn_instant;
            String string = LocaleController.getString(R.string.WalletSendInstantly);
            String string2 = LocaleController.getString(R.string.WalletSendInstantlyInfo);
            int i11 = e5.a;
            f61 J = f61.J(e5.class);
            J.k = i10;
            J.l = string;
            J.m = string2;
            arrayList.add(J);
            int i12 = R.drawable.wallet_learn_fees;
            String string3 = LocaleController.getString(R.string.WalletNoFees);
            String string4 = LocaleController.getString(R.string.WalletNoFeesInfo);
            f61 J2 = f61.J(e5.class);
            J2.k = i12;
            J2.l = string3;
            J2.m = string4;
            arrayList.add(J2);
            int i13 = R.drawable.wallet_learn_verified;
            String string5 = LocaleController.getString(R.string.WalletBlockchainVerified);
            String string6 = LocaleController.getString(R.string.WalletBlockchainVerifiedInfo);
            f61 J3 = f61.J(e5.class);
            J3.k = i13;
            J3.l = string5;
            J3.m = string6;
            arrayList.add(J3);
            arrayList.add(f61.l(this.Z));
        } else if (this.m0 != null) {
            if (this.O0 && !this.P0 && w9.u() > 500000000) {
                arrayList.add(f61.k(this.b0));
            }
            arrayList.add(f61.p(this.m0, 0, true));
        }
        x90 x90Var = this.Y;
        if (x90Var != null) {
            this.a0 = false;
            x90Var.animate().cancel();
            this.Y.setAlpha(0.0f);
            this.Y.setVisibility(4);
        }
    }

    @Override // org.telegram.ui.Components.v61
    public final CharSequence V() {
        return LocaleController.getString(R.string.WalletTitle);
    }

    @Override // org.telegram.ui.Components.v61
    public final void W(f61 f61Var, View view) {
        e0 e0Var;
        Object obj = f61Var.G;
        if (obj instanceof TL_wallet.nftItem) {
            B0((TL_wallet.nftItem) obj);
            return;
        }
        if (f61Var.d == -10001 && (e0Var = this.D0) != null) {
            e0Var.e();
        } else if (obj instanceof TL_wallet.walletTransaction) {
            A0(getParentActivity(), this.currentAccount, (TL_wallet.walletTransaction) f61Var.G, null, null, null, null, getResourceProvider());
        }
    }

    @Override // org.telegram.ui.Components.v61
    public final boolean X(f61 f61Var, View view) {
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
    @Override // org.telegram.ui.Components.v61, org.telegram.ui.ActionBar.n2
    public final View createView(Context context) {
        ValueAnimator valueAnimator = this.l0;
        if (valueAnimator != null) {
            this.l0 = null;
            valueAnimator.cancel();
        }
        J0();
        j5 j5Var = this.p0;
        if (j5Var != null) {
            j5Var.b(null);
        }
        this.e = null;
        this.R = null;
        this.Q = null;
        this.m0 = null;
        this.o0 = null;
        a71[] a71VarArr = this.q0;
        int i10 = 0;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        Object[] objArr5 = 0;
        a71VarArr[0] = null;
        final int i11 = 1;
        a71VarArr[1] = null;
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
        nc0 nc0Var = new nc0(this, context);
        nc0Var.addView(createView, w7.z5.c(-1.0f, -1));
        this.fragmentView = nc0Var;
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i12 = org.telegram.ui.ActionBar.h6.a7;
        kVar.setBackgroundColor(getThemedColor(i12));
        this.actionBar.setCastShadows(false);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setClipChildren(false);
        this.actionBar.setClipToPadding(false);
        org.telegram.ui.ActionBar.y n10 = this.actionBar.n();
        final int i13 = 3;
        n10.a(2, R.drawable.scan_qr).setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Wallet.q3
            public final /* synthetic */ n5 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i13) {
                    case 0:
                        n5 n5Var = this.b;
                        n5Var.getClass();
                        n5Var.presentFragment(new xf1(6, null));
                        break;
                    case 1:
                        n5.e0(this.b);
                        break;
                    case 2:
                        n5.a0(this.b);
                        break;
                    case 3:
                        this.b.E0();
                        break;
                    default:
                        n5.g0(this.b);
                        break;
                }
            }
        });
        n10.a(1, R.drawable.ic_ab_other).setOnClickListener(new ef0(27, this, context));
        ah.x xVar = new ah.x(this, context, 28);
        this.Q = xVar;
        xVar.setClipToPadding(false);
        this.Q.setClipChildren(false);
        this.Q.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(4.0f));
        w4 w4Var = new w4(this, context);
        this.R = w4Var;
        w4Var.setDefaultRadiusDp(22);
        this.R.setOnAnimatedHeightChangedListener(new o3(this, 11));
        TextView textView = new TextView(context);
        this.T = textView;
        textView.setText(LocaleController.getString(R.string.WalletWaltFunds));
        this.S = q0(this.T, new o3(this, i10));
        TextView textView2 = new TextView(context);
        this.V = textView2;
        this.U = q0(textView2, new o3(this, i11));
        TextView textView3 = new TextView(context);
        this.X = textView3;
        this.W = q0(textView3, new o3(this, 2));
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
        this.Y.setText(AndroidUtilities.replaceSingleLink(LocaleController.getString(R.string.WalletTermsOfService), org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.gc, this.resourceProvider), new p3(context, objArr5 == true ? 1 : 0)));
        this.Y.setVisibility(4);
        ((FrameLayout) createView).addView(this.Y, w7.z5.d(-1, -2.0f, 81, 12.0f, 0.0f, 12.0f, 24.0f));
        x4 x4Var = new x4(this, context, objArr4 == true ? 1 : 0);
        this.Z = x4Var;
        x4Var.setImportantForAccessibility(2);
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
        shapeDrawable.setShaderFactory(new y4());
        imageView.setBackground(shapeDrawable);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.wallet_protect);
        this.c0.addView(imageView, w7.z5.d(28, 28.0f, 19, 14.0f, 11.0f, 16.0f, 11.0f));
        TextView textView4 = new TextView(context);
        lk.o(org.telegram.ui.ActionBar.h6.q7, this.resourceProvider, textView4, 1, 16.0f);
        textView4.setText(LocaleController.getString(R.string.WalletProtectAccount));
        this.c0.addView(textView4, w7.z5.d(-1, -2.0f, 19, 58.0f, 0.0f, 32.0f, 0.0f));
        FrameLayout frameLayout2 = this.c0;
        final Object[] objArr6 = objArr3 == true ? 1 : 0;
        frameLayout2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Wallet.q3
            public final /* synthetic */ n5 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (objArr6) {
                    case 0:
                        n5 n5Var = this.b;
                        n5Var.getClass();
                        n5Var.presentFragment(new xf1(6, null));
                        break;
                    case 1:
                        n5.e0(this.b);
                        break;
                    case 2:
                        n5.a0(this.b);
                        break;
                    case 3:
                        this.b.E0();
                        break;
                    default:
                        n5.g0(this.b);
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
        a5 a5Var = new a5(this, context);
        this.d = a5Var;
        a5Var.setDiamondOnCard(true);
        this.d.setCardOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Wallet.q3
            public final /* synthetic */ n5 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i11) {
                    case 0:
                        n5 n5Var = this.b;
                        n5Var.getClass();
                        n5Var.presentFragment(new xf1(6, null));
                        break;
                    case 1:
                        n5.e0(this.b);
                        break;
                    case 2:
                        n5.a0(this.b);
                        break;
                    case 3:
                        this.b.E0();
                        break;
                    default:
                        n5.g0(this.b);
                        break;
                }
            }
        });
        this.a.C2.b.add(this.v);
        x4 x4Var2 = new x4(this, context, i11);
        this.e = x4Var2;
        x4Var2.setImportantForAccessibility(2);
        b5 b5Var = new b5(this, context);
        this.h = b5Var;
        b5Var.setClipChildren(false);
        this.h.setClipToPadding(false);
        this.h.addView(this.d, w7.z5.c(-2.0f, -1));
        nc0Var.addView(this.h, w7.z5.c(-1.0f, -1));
        this.a.setClipChildren(false);
        this.a.setClipToPadding(false);
        this.r0 = this.d.getBalanceLayout();
        this.s0 = this.d.getBalanceView();
        this.t0 = this.d.getUsdBalanceView();
        this.d.setCardHolder(UserObject.getUserName(getUserConfig().getCurrentUser()).toUpperCase());
        this.z0 = 0.0f;
        sa1 sa1Var = new sa1(this, context, 19);
        this.y0 = sa1Var;
        sa1Var.setOrientation(0);
        this.y0.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(12.0f));
        ei.d dVar = new ei.d(context, this.resourceProvider, true);
        dVar.setRoundRadius(24);
        this.A0 = dVar;
        dVar.setText(LocaleController.getString(R.string.WalletAddFunds));
        this.y0.addView(this.A0, w7.z5.m(1.0f, 0, 48, 0, 4, 0));
        final int i17 = 2;
        this.A0.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Wallet.q3
            public final /* synthetic */ n5 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i17) {
                    case 0:
                        n5 n5Var = this.b;
                        n5Var.getClass();
                        n5Var.presentFragment(new xf1(6, null));
                        break;
                    case 1:
                        n5.e0(this.b);
                        break;
                    case 2:
                        n5.a0(this.b);
                        break;
                    case 3:
                        this.b.E0();
                        break;
                    default:
                        n5.g0(this.b);
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
        this.B0.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Wallet.q3
            public final /* synthetic */ n5 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i18) {
                    case 0:
                        n5 n5Var = this.b;
                        n5Var.getClass();
                        n5Var.presentFragment(new xf1(6, null));
                        break;
                    case 1:
                        n5.e0(this.b);
                        break;
                    case 2:
                        n5.a0(this.b);
                        break;
                    case 3:
                        this.b.E0();
                        break;
                    default:
                        n5.g0(this.b);
                        break;
                }
            }
        });
        this.y0.addView(this.B0, w7.z5.m(1.0f, 0, 48, 4, 0, 0));
        O0(this.d.getStickerStyle());
        this.C0 = m0.w(this.currentAccount).A();
        this.a.setDescendantFocusability(131072);
        t7 t7Var2 = new t7(this, this.d, new n2.e(this, nc0Var, objArr2 == true ? 1 : 0, 12), null);
        this.i0 = t7Var2;
        nc0Var.addView(t7Var2, w7.z5.c(-1.0f, -1));
        this.j0 = "";
        ai.r rVar = new ai.r(context, 8);
        this.m0 = rVar;
        rVar.setOrientation(1);
        this.m0.setBackgroundColor(getThemedColor(i12));
        ei.h1 h1Var = new ei.h1(this, context, this.resourceProvider, 10);
        this.o0 = h1Var;
        h1Var.setAllowDisallowInterceptTouch(false);
        this.o0.setAdapter(new j4(this, context));
        b91 n11 = this.o0.n(-2, true);
        this.f0 = n11;
        n11.g(i14, org.telegram.ui.ActionBar.h6.G6, i14, i16, i15);
        this.f0.setBackground(org.telegram.ui.ActionBar.h6.c0(AndroidUtilities.dp(20.0f), getThemedColor(i15)));
        this.g0 = new FrameLayout(context);
        n8 n8Var = new n8(context, this.f0, this.resourceProvider, new a4(this, objArr == true ? 1 : 0), new a4(this, i11), new a4(this, 2));
        this.h0 = n8Var;
        this.g0.addView(n8Var, w7.z5.d(-1, 40.0f, 48, 16.0f, 0.0f, 16.0f, 0.0f));
        this.o0.setPosition(this.d0);
        S0();
        this.m0.addView(this.g0, w7.z5.k(0.0f, 0.0f, 0.0f, -6.0f, -1, 52));
        this.m0.addView(this.o0, w7.z5.l(1.0f, -1, 0));
        F0(this.e0);
        e0 e0Var2 = this.D0;
        if (e0Var2 != null) {
            this.i0.Y(e0Var2);
        }
        this.a.j(new kv(this, 14));
        s61 s61Var = this.a.W2;
        s61Var.r = false;
        s61Var.N(false);
        j5 j5Var2 = new j5(this);
        this.p0 = j5Var2;
        j5Var2.b(this.a);
        K0();
        this.C0.g();
        this.actionBar.post(new o3(this, 9));
        this.a.post(new o3(this, 10));
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        u61 u61Var;
        s61 s61Var;
        if (i11 != this.currentAccount) {
            return;
        }
        if (i10 == NotificationCenter.walletUpdate && this.s0 != null) {
            K0();
            Iterator it = this.M0.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
            return;
        }
        if (i10 == NotificationCenter.starBalanceUpdated) {
            T0();
            return;
        }
        if (i10 == NotificationCenter.didSetOrRemoveTwoStepPassword) {
            if (objArr.length > 0) {
                Object obj = objArr[0];
                if (obj instanceof TL_account.Password) {
                    this.O0 = true;
                    this.P0 = ((TL_account.Password) obj).has_password;
                    u61 u61Var2 = this.a;
                    if (u61Var2 == null || (s61Var = u61Var2.W2) == null) {
                        return;
                    }
                    s61Var.N(true);
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
        if (obj2 != l0Var || (u61Var = this.a) == null || u61Var.W2 == null) {
            return;
        }
        if (l0Var.b.isEmpty()) {
            l0 l0Var2 = this.C0;
            if (!l0Var2.h) {
                l0Var2.g();
            }
        }
        Q0(true);
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void o0(boolean z10) {
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
        M0();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.G0, f7);
        this.I0 = ofFloat;
        ofFloat.setDuration(z10 ? 260L : 120L);
        this.I0.setInterpolator(z10 ? new bs(0.05d, 0.7d, 0.1d, 1.0d) : new bs(0.4d, 0.0d, 0.2d, 1.0d));
        this.I0.addUpdateListener(new z3(this, 1));
        this.I0.addListener(new vf1(this, 4));
        this.I0.start();
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean onBackPressed(boolean z10) {
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
        j5 j5Var = this.p0;
        if (j5Var != null) {
            j5Var.c();
        }
        u61 u61Var = this.a;
        if (u61Var != null) {
            u61Var.B0();
        }
        a71 u02 = u0();
        if (u02 != null) {
            u02.B0();
        }
        super.onBeginSlide();
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean onFragmentCreate() {
        Context context = ApplicationLoader.applicationContext;
        if (o5.k0.compareAndSet(false, true)) {
            o5.l0.postRunnable(new p3(context, 2));
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
        o3 o3Var = this.F0;
        ArrayList arrayList = e0Var.d;
        if (!arrayList.contains(o3Var)) {
            arrayList.add(o3Var);
        }
        j jVar = this.Q0;
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
        this.Q0 = new j(w9, i10, 0);
        getConnectionsManager().sendRequestTyped(new TL_account.getPassword(), new org.telegram.messenger.a(), new d(this, 7));
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onFragmentDestroy() {
        AndroidUtilities.cancelRunOnUIThread(this.J0);
        ValueAnimator valueAnimator = this.I0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        t7 t7Var = this.i0;
        if (t7Var != null) {
            t7Var.p();
        }
        a5 a5Var = this.d;
        if (a5Var != null) {
            a5Var.setOnFrontContentPresented(null);
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
        J0();
        j5 j5Var = this.p0;
        if (j5Var != null) {
            j5Var.b(null);
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
        j jVar = this.Q0;
        if (jVar != null) {
            jVar.run();
            this.Q0 = null;
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
    public final void onRequestPermissionsResultFragment(int i10, String[] strArr, int[] iArr) {
        if (i10 != 44 || getParentActivity() == null) {
            return;
        }
        if (iArr.length > 0 && iArr[0] == 0) {
            E0();
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        alertDialog$Builder.a.T = AndroidUtilities.replaceTags(LocaleController.getString(R.string.QRCodePermissionNoCameraWithHint));
        alertDialog$Builder.k(LocaleController.getString(R.string.PermissionOpenSettings), new r3(this));
        alertDialog$Builder.h(LocaleController.getString(R.string.ContactsPermissionAlertNotNow), null);
        alertDialog$Builder.m(R.raw.permission_request_camera, 72, org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.L5, false), null);
        alertDialog$Builder.o();
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onResume() {
        super.onResume();
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar != null) {
            kVar.post(new o3(this, 9));
        }
        m0.w(this.currentAccount).C();
        if (this.D0 != null && m0.w(this.currentAccount).E()) {
            e0 e0Var = this.D0;
            if (!e0Var.j) {
                e0Var.b();
                e0Var.f(true);
            }
        }
        K0();
        if (this.a != null) {
            Q0(true);
        }
    }

    public final FrameLayout q0(TextView textView, Runnable runnable) {
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

    public final CharSequence t0(int i10, long j10) {
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

    public final a71 u0() {
        if (v0()) {
            ei.h1 h1Var = this.o0;
            View currentView = h1Var == null ? null : h1Var.getCurrentView();
            if (currentView instanceof a71) {
                return (a71) currentView;
            }
        }
        return null;
    }

    public final boolean v0() {
        ai.r rVar;
        if (this.n0 || (rVar = this.m0) == null || !rVar.isAttachedToWindow()) {
            return false;
        }
        ViewParent parent = this.m0.getParent();
        u61 u61Var = this.a;
        return parent == u61Var.V2.m(u61Var.W2.x.size() - 1);
    }

    public final boolean w0() {
        View m10;
        u61 u61Var = this.a;
        return u61Var != null && (m10 = u61Var.V2.m(this.f)) != null && this.x0 < 0.5f && m10.getBottom() > this.a.getPaddingTop();
    }

    public final void x0() {
        e0 e0Var;
        a71 a71Var = this.q0[1];
        if (this.d0 != 1 || a71Var == null || !a71Var.G || (e0Var = this.D0) == null || e0Var.i || e0Var.g || e0Var.k != null || a71Var.V2.N0() < a71Var.W2.x.size() - 3) {
            return;
        }
        this.D0.e();
    }

    public final void y0() {
        l0 l0Var;
        a71 a71Var = this.q0[0];
        if (a71Var == null || !a71Var.G || (l0Var = this.C0) == null || l0Var.h || a71Var.V2.N0() < a71Var.W2.x.size() - 3) {
            return;
        }
        this.C0.g();
    }

    public final CharSequence z0(int i10) {
        CharSequence[] charSequenceArr = this.L0;
        if (charSequenceArr[i10] == null) {
            charSequenceArr[i10] = new SpannableString("l");
            ca0 ca0Var = new ca0(AndroidUtilities.dp(i10 == 0 ? 100.0f : 50.0f), i10 == 0 ? this.s0 : this.t0);
            ca0Var.a(org.telegram.ui.ActionBar.h6.m1(0.45f, -1), org.telegram.ui.ActionBar.h6.m1(0.2f, -1));
            CharSequence charSequence = charSequenceArr[i10];
            ((SpannableString) charSequence).setSpan(ca0Var, 0, charSequence.length(), 33);
        }
        return charSequenceArr[i10];
    }
}
