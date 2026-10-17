package org.telegram.ui.Wallet;

import ai.mb;
import ai.ob;
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
import org.telegram.messenger.wh;
import org.telegram.tgnet.ConnectionsManager;
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
import org.telegram.ui.nc0;
import org.telegram.ui.sa1;
import org.telegram.ui.ut0;
import org.telegram.ui.vf1;
import org.telegram.ui.xf1;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes4.dex */
public final class l5 extends v61 implements NotificationCenter.NotificationCenterDelegate {
    public static Typeface T0;
    public sa1 A0;
    public float B0;
    public ei.d C0;
    public ei.d D0;
    public ah.v E;
    public l0 E0;
    public boolean F;
    public e0 F0;
    public boolean G;
    public boolean G0;
    public float I0;
    public float J0;
    public ValueAnimator K0;
    public int M0;
    public SpannableString P0;
    public boolean Q0;
    public boolean R0;
    public ah.x S;
    public j S0;
    public u4 T;
    public FrameLayout U;
    public TextView V;
    public FrameLayout W;
    public TextView X;
    public FrameLayout Y;
    public TextView Z;
    public x90 a0;
    public v4 b0;
    public boolean c0;
    public y4 d;
    public FrameLayout d0;
    public v4 e;
    public FrameLayout e0;
    public int f;
    public boolean g0;
    public z4 h;
    public b91 h0;
    public FrameLayout i0;
    public q8 j0;
    public w7 k0;
    public float m0;
    public int n;
    public ValueAnimator n0;
    public ai.r o0;
    public boolean p0;
    public ei.h1 q0;
    public boolean r;
    public h5 r0;
    public LinearLayout t0;
    public org.telegram.ui.Components.q6 u0;
    public org.telegram.ui.Components.q6 v0;
    public u5 w0;
    public FrameLayout x;
    public b5 x0;
    public View y;
    public float y0;
    public float z0;
    public final org.telegram.ui.Cells.k7 s = new org.telegram.ui.Cells.k7(this, 27);
    public final r3 v = new ut() { // from class: org.telegram.ui.Wallet.r3
        @Override // org.telegram.ui.Components.ut
        public final void a(int i10, boolean z10) {
            u61 u61Var;
            l5 l5Var = l5.this;
            org.telegram.ui.Cells.k7 k7Var = l5Var.s;
            if ((i10 == 1 || i10 == 3) && (u61Var = l5Var.a) != null) {
                l5Var.r = z10;
                u61Var.removeCallbacks(k7Var);
                k7Var.run();
            }
        }
    };
    public boolean w = false;
    public final Rect H = new Rect();
    public final Matrix I = new Matrix();
    public final Matrix J = new Matrix();
    public final Matrix K = new Matrix();
    public final float[] L = new float[8];
    public final float[] M = new float[8];
    public final float[] N = new float[8];
    public final int[] O = new int[2];
    public final int[] P = new int[2];
    public final int[] Q = new int[2];
    public final int[] R = new int[2];
    public int f0 = 0;
    public String l0 = "";
    public final a71[] s0 = new a71[2];
    public final m3 H0 = new m3(this, 3);
    public final m3 L0 = new m3(this, 4);
    public final CharSequence[] N0 = new CharSequence[2];
    public final HashSet O0 = new HashSet();

    public static void B0(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        int i10 = 1;
        org.telegram.ui.ActionBar.f3 i11 = wh.i(1, context, d6Var, false);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackground(org.telegram.ui.ActionBar.h6.c0(AndroidUtilities.dp(16.0f), org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.h5, d6Var)));
        frameLayout.setPadding(AndroidUtilities.dp(36.0f), 0, AndroidUtilities.dp(36.0f), AndroidUtilities.dp(14.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(1);
        frameLayout.addView(linearLayout, w7.z5.d(-2.0f, -1));
        linearLayout.addView(new p6(160, context, false), w7.z5.t(160, 160, 1, 0, -12, 0, -8));
        TextView textView = new TextView(context);
        textView.setText(LocaleController.getString(R.string.WalletHowItWorks));
        wh.o(org.telegram.ui.ActionBar.h6.j5, d6Var, textView, 1, 17.0f);
        textView.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
        textView.setGravity(17);
        TextView i12 = com.google.android.gms.internal.cast.a6.i(linearLayout, textView, w7.z5.t(-1, -2, 1, 0, 0, 0, 6), context);
        i12.setText(LocaleController.getString(R.string.WalletHowItWorksInfo));
        int i13 = org.telegram.ui.ActionBar.h6.z6;
        wh.o(i13, d6Var, i12, 1, 14.0f);
        i12.setGravity(17);
        i12.setLineSpacing(AndroidUtilities.dp(1.0f), 1.0f);
        linearLayout.addView(i12, w7.z5.t(-1, -2, 1, 0, 0, 0, 24));
        d5 d5Var = new d5(context, d6Var);
        d5Var.setPadding(AndroidUtilities.dp(0.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(0.0f), AndroidUtilities.dp(8.0f));
        d5Var.a(LocaleController.getString(R.string.WalletSendInstantly), LocaleController.getString(R.string.WalletSendInstantlyInfo), R.drawable.wallet_learn_instant);
        linearLayout.addView(d5Var, w7.z5.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
        d5 d5Var2 = new d5(context, d6Var);
        d5Var2.setPadding(AndroidUtilities.dp(0.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(0.0f), AndroidUtilities.dp(8.0f));
        d5Var2.a(LocaleController.getString(R.string.WalletNoFees), LocaleController.getString(R.string.WalletNoFeesInfo), R.drawable.wallet_learn_fees);
        linearLayout.addView(d5Var2, w7.z5.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
        d5 d5Var3 = new d5(context, d6Var);
        d5Var3.setPadding(AndroidUtilities.dp(0.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(0.0f), AndroidUtilities.dp(8.0f));
        d5Var3.a(LocaleController.getString(R.string.WalletBlockchainVerified), LocaleController.getString(R.string.WalletBlockchainVerifiedInfo), R.drawable.wallet_learn_verified);
        linearLayout.addView(d5Var3, w7.z5.k(0.0f, 0.0f, 0.0f, 14.0f, -1, -2));
        ei.d f7 = wh.f(24, context, d6Var, true);
        f7.setText(LocaleController.getString(R.string.WalletGotIt));
        linearLayout.addView(f7, w7.z5.t(-1, 48, 1, 0, 0, 0, 0));
        w7.b6.b(f7, 0.02f, 1.1f);
        x90 x90Var = new x90(context, null);
        x90Var.setTextColor(org.telegram.ui.ActionBar.h6.w0(i13, d6Var));
        x90Var.setTextSize(1, 13.0f);
        x90Var.setGravity(17);
        x90Var.setText(AndroidUtilities.replaceSingleLink(LocaleController.getString(R.string.WalletTermsOfService), org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.gc, d6Var), new n3(context, i10)));
        linearLayout.addView(x90Var, w7.z5.k(0.0f, 12.0f, 0.0f, 6.0f, -1, -2));
        i11.customView = frameLayout;
        org.telegram.ui.ActionBar.f3[] f3VarArr = {i11};
        f3VarArr[0].setAllowNestedScroll(true);
        f3VarArr[0].fixNavigationBar();
        f7.setOnClickListener(new z3(f3VarArr, i10));
        f3VarArr[0].show();
    }

    public static void C0(Context context, int i10, org.telegram.ui.ActionBar.d6 d6Var) {
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
            frameLayout.setBackground(new k5(0));
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            linearLayout.setGravity(1);
            frameLayout.addView(linearLayout, w7.z5.f(-2.0f, 55, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(30.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f) + AndroidUtilities.navigationBarHeight));
            j5 j5Var = new j5(context, s10);
            linearLayout.addView(j5Var, w7.z5.q(288, 302, 1));
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
            frameLayout.addView(imageView, w7.z5.a(48.0f, 4.0f, 2.0f, 0.0f, 0.0f, 48, 51));
            f3Var.customView = frameLayout;
            f3Var.occupyNavigationBar = true;
            f3Var.setApplyTopPadding(false);
            f3Var.setApplyBottomPadding(false);
            f3Var.fixNavigationBar(-12207881);
            imageView.setOnClickListener(new l3(f3Var, 0));
            j5Var.e = new r0(s10, 1);
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
    public static void Y(final l5 l5Var, Context context, View view) {
        m0 w9 = m0.w(l5Var.currentAccount);
        final i80 I = i80.I(l5Var, view);
        I.a0(0.0f, -AndroidUtilities.dp(48.0f));
        final int i10 = 0;
        I.s = 0;
        I.V(5);
        i80 J = I.J();
        J.c(R.drawable.ic_ab_back, LocaleController.getString(R.string.WalletBack), new ut0(I, 26), false);
        J.k();
        ScrollView scrollView = new ScrollView(context);
        LinearLayout linearLayout = new LinearLayout(context);
        final int i11 = 1;
        linearLayout.setOrientation(1);
        scrollView.addView(linearLayout);
        z6 z6Var = new z6(l5Var, linearLayout, w9, I, 10);
        J.r(scrollView, w7.z5.n(-1, 350));
        I.c(R.drawable.wallet_globe, LocaleController.getString(R.string.WalletCurrency), new h(z6Var, I, J, 8), false);
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
        z6 z6Var2 = new z6(w9, new boolean[]{fVar.f() != null}, y3, z6Var, 11);
        l5Var.O0.add(z6Var2);
        z6Var.run();
        I.c(R.drawable.wallet_lock, LocaleController.getString(R.string.Passcode), new Runnable(l5Var) { // from class: org.telegram.ui.Wallet.w3
            public final /* synthetic */ l5 b;

            {
                this.b = l5Var;
            }

            @Override // java.lang.Runnable
            public final void run() {
                y4 y4Var;
                switch (i10) {
                    case 0:
                        l5 l5Var2 = this.b;
                        l5Var2.getClass();
                        I.u();
                        l5Var2.presentFragment(PasscodeActivity.e0());
                        break;
                    case 1:
                        l5 l5Var3 = this.b;
                        l5Var3.getClass();
                        I.u();
                        l5Var3.presentFragment(new k8());
                        break;
                    case 2:
                        l5 l5Var4 = this.b;
                        l5Var4.getClass();
                        I.u();
                        l5Var4.presentFragment(new da());
                        break;
                    case 3:
                        I.u();
                        l5 l5Var5 = this.b;
                        l5.B0(l5Var5.getParentActivity(), l5Var5.getResourceProvider());
                        break;
                    default:
                        I.u();
                        l5 l5Var6 = this.b;
                        boolean z10 = l5Var6.w;
                        boolean z11 = !z10;
                        if (z10 != z11 && (y4Var = l5Var6.d) != null) {
                            l5Var6.w = z11;
                            y4Var.setUse2D(z11);
                            l5Var6.e.requestLayout();
                            l5Var6.d.post(new m3(l5Var6, 11));
                            break;
                        }
                        break;
                }
            }
        }, false);
        I.c(R.drawable.wallet_key, LocaleController.getString(R.string.WalletKeysAndBackup), new Runnable(l5Var) { // from class: org.telegram.ui.Wallet.w3
            public final /* synthetic */ l5 b;

            {
                this.b = l5Var;
            }

            @Override // java.lang.Runnable
            public final void run() {
                y4 y4Var;
                switch (i11) {
                    case 0:
                        l5 l5Var2 = this.b;
                        l5Var2.getClass();
                        I.u();
                        l5Var2.presentFragment(PasscodeActivity.e0());
                        break;
                    case 1:
                        l5 l5Var3 = this.b;
                        l5Var3.getClass();
                        I.u();
                        l5Var3.presentFragment(new k8());
                        break;
                    case 2:
                        l5 l5Var4 = this.b;
                        l5Var4.getClass();
                        I.u();
                        l5Var4.presentFragment(new da());
                        break;
                    case 3:
                        I.u();
                        l5 l5Var5 = this.b;
                        l5.B0(l5Var5.getParentActivity(), l5Var5.getResourceProvider());
                        break;
                    default:
                        I.u();
                        l5 l5Var6 = this.b;
                        boolean z10 = l5Var6.w;
                        boolean z11 = !z10;
                        if (z10 != z11 && (y4Var = l5Var6.d) != null) {
                            l5Var6.w = z11;
                            y4Var.setUse2D(z11);
                            l5Var6.e.requestLayout();
                            l5Var6.d.post(new m3(l5Var6, 11));
                            break;
                        }
                        break;
                }
            }
        }, false);
        final int i13 = 2;
        I.l(R.drawable.wallet_apps, LocaleController.getString(R.string.WalletConnectedApps), new Runnable(l5Var) { // from class: org.telegram.ui.Wallet.w3
            public final /* synthetic */ l5 b;

            {
                this.b = l5Var;
            }

            @Override // java.lang.Runnable
            public final void run() {
                y4 y4Var;
                switch (i13) {
                    case 0:
                        l5 l5Var2 = this.b;
                        l5Var2.getClass();
                        I.u();
                        l5Var2.presentFragment(PasscodeActivity.e0());
                        break;
                    case 1:
                        l5 l5Var3 = this.b;
                        l5Var3.getClass();
                        I.u();
                        l5Var3.presentFragment(new k8());
                        break;
                    case 2:
                        l5 l5Var4 = this.b;
                        l5Var4.getClass();
                        I.u();
                        l5Var4.presentFragment(new da());
                        break;
                    case 3:
                        I.u();
                        l5 l5Var5 = this.b;
                        l5.B0(l5Var5.getParentActivity(), l5Var5.getResourceProvider());
                        break;
                    default:
                        I.u();
                        l5 l5Var6 = this.b;
                        boolean z10 = l5Var6.w;
                        boolean z11 = !z10;
                        if (z10 != z11 && (y4Var = l5Var6.d) != null) {
                            l5Var6.w = z11;
                            y4Var.setUse2D(z11);
                            l5Var6.e.requestLayout();
                            l5Var6.d.post(new m3(l5Var6, 11));
                            break;
                        }
                        break;
                }
            }
        }, true ^ w9.g.d.isEmpty());
        I.k();
        final int i14 = 3;
        I.c(R.drawable.wallet_help, LocaleController.getString(R.string.WalletWhatIsWallet), new Runnable(l5Var) { // from class: org.telegram.ui.Wallet.w3
            public final /* synthetic */ l5 b;

            {
                this.b = l5Var;
            }

            @Override // java.lang.Runnable
            public final void run() {
                y4 y4Var;
                switch (i14) {
                    case 0:
                        l5 l5Var2 = this.b;
                        l5Var2.getClass();
                        I.u();
                        l5Var2.presentFragment(PasscodeActivity.e0());
                        break;
                    case 1:
                        l5 l5Var3 = this.b;
                        l5Var3.getClass();
                        I.u();
                        l5Var3.presentFragment(new k8());
                        break;
                    case 2:
                        l5 l5Var4 = this.b;
                        l5Var4.getClass();
                        I.u();
                        l5Var4.presentFragment(new da());
                        break;
                    case 3:
                        I.u();
                        l5 l5Var5 = this.b;
                        l5.B0(l5Var5.getParentActivity(), l5Var5.getResourceProvider());
                        break;
                    default:
                        I.u();
                        l5 l5Var6 = this.b;
                        boolean z10 = l5Var6.w;
                        boolean z11 = !z10;
                        if (z10 != z11 && (y4Var = l5Var6.d) != null) {
                            l5Var6.w = z11;
                            y4Var.setUse2D(z11);
                            l5Var6.e.requestLayout();
                            l5Var6.d.post(new m3(l5Var6, 11));
                            break;
                        }
                        break;
                }
            }
        }, false);
        if (BuildVars.DEBUG_VERSION) {
            I.k();
            final int i15 = 4;
            I.c(0, LocaleController.getString(l5Var.w ? R.string.WalletCard3D : R.string.WalletCard2D), new Runnable(l5Var) { // from class: org.telegram.ui.Wallet.w3
                public final /* synthetic */ l5 b;

                {
                    this.b = l5Var;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    y4 y4Var;
                    switch (i15) {
                        case 0:
                            l5 l5Var2 = this.b;
                            l5Var2.getClass();
                            I.u();
                            l5Var2.presentFragment(PasscodeActivity.e0());
                            break;
                        case 1:
                            l5 l5Var3 = this.b;
                            l5Var3.getClass();
                            I.u();
                            l5Var3.presentFragment(new k8());
                            break;
                        case 2:
                            l5 l5Var4 = this.b;
                            l5Var4.getClass();
                            I.u();
                            l5Var4.presentFragment(new da());
                            break;
                        case 3:
                            I.u();
                            l5 l5Var5 = this.b;
                            l5.B0(l5Var5.getParentActivity(), l5Var5.getResourceProvider());
                            break;
                        default:
                            I.u();
                            l5 l5Var6 = this.b;
                            boolean z10 = l5Var6.w;
                            boolean z11 = !z10;
                            if (z10 != z11 && (y4Var = l5Var6.d) != null) {
                                l5Var6.w = z11;
                                y4Var.setUse2D(z11);
                                l5Var6.e.requestLayout();
                                l5Var6.d.post(new m3(l5Var6, 11));
                                break;
                            }
                            break;
                    }
                }
            }, false);
        }
        I.p = new t3(i14, l5Var, z6Var2);
        I.Z();
    }

    public static void Z(l5 l5Var, String str, m0 m0Var, i80 i80Var, LinearLayout linearLayout, TL_wallet.currencyRate currencyrate) {
        if (currencyrate == null) {
            return;
        }
        org.telegram.ui.ActionBar.e1 e1Var = new org.telegram.ui.ActionBar.e1(2, l5Var.getParentActivity(), l5Var.resourceProvider, false, false);
        e1Var.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
        e1Var.setText(currencyrate.currency);
        e1Var.setSubtext(!TextUtils.isEmpty(currencyrate.translatedTitle) ? currencyrate.translatedTitle : currencyrate.title);
        boolean equals = TextUtils.equals(str, currencyrate.currency);
        e1Var.b.setPadding(0, 0, AndroidUtilities.dp(equals ? 42.0f : 0.0f), 0);
        e1Var.setChecked(equals);
        e1Var.setOnClickListener(new n1(m0Var, currencyrate, i80Var, 2));
        linearLayout.addView(e1Var, w7.z5.n(200, -2));
    }

    public static void a0(l5 l5Var) {
        m0 w9 = m0.w(l5Var.currentAccount);
        ei.d dVar = l5Var.D0;
        if (dVar.N) {
            return;
        }
        dVar.setLoading(true);
        boolean z10 = false;
        w9.j0(new e2.o0(w9, new x(6, l5Var, w9), z10, z10, 3));
    }

    public static void b0(l5 l5Var) {
        org.telegram.ui.ActionBar.k kVar;
        if (l5Var.E == null || (kVar = l5Var.actionBar) == null || !(kVar.getParent() instanceof ViewGroup)) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) l5Var.actionBar.getParent();
        viewGroup.setClipChildren(false);
        viewGroup.setClipToPadding(false);
        if (l5Var.E.getParent() != l5Var.actionBar) {
            AndroidUtilities.removeFromParent(l5Var.E);
            l5Var.actionBar.addView(l5Var.E, w7.z5.d(-1.0f, -1));
        }
        l5Var.E.bringToFront();
        l5Var.actionBar.bringToFront();
        l5Var.E.post(new m3(l5Var, 11));
    }

    public static void c0(l5 l5Var) {
        C0(l5Var.getParentActivity(), l5Var.currentAccount, l5Var.getResourceProvider());
    }

    public static void d0(l5 l5Var, LinearLayout linearLayout, m0 m0Var, i80 i80Var) {
        TL_wallet.currencyRate currencyrate;
        l5 l5Var2;
        ArrayList<TL_wallet.currencyRate> arrayList;
        LinearLayout linearLayout2 = linearLayout;
        m0 m0Var2 = m0Var;
        linearLayout2.removeAllViews();
        String g10 = m0Var2.h.g();
        TL_wallet.currencyRates f7 = m0Var2.h.f();
        if (f7 == null) {
            for (int i10 = 0; i10 < 3; i10++) {
                b10 b10Var = new b10(l5Var.getParentActivity(), l5Var.getResourceProvider());
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
                Z(l5Var, g10, m0Var2, i80Var, linearLayout2, currencyrate7);
            }
            i13++;
            m0Var2 = m0Var;
        }
        if (hashSet.isEmpty() || f7.rates.isEmpty()) {
            l5Var2 = l5Var;
        } else {
            l5Var2 = l5Var;
            linearLayout2.addView(new org.telegram.ui.ActionBar.j1(l5Var.getParentActivity(), l5Var2.resourceProvider), w7.z5.n(-1, 8));
        }
        int i14 = 0;
        while (i14 < f7.rates.size()) {
            TL_wallet.currencyRate currencyrate8 = f7.rates.get(i14);
            if (currencyrate8 != null && !hashSet.contains(currencyrate8.currency)) {
                Z(l5Var2, g10, m0Var, i80Var, linearLayout2, currencyrate8);
            }
            i14++;
            l5Var2 = l5Var;
            linearLayout2 = linearLayout;
        }
    }

    public static void e0(l5 l5Var) {
        pf.d.r(l5Var.getParentActivity(), m0.w(l5Var.currentAccount).j);
    }

    public static void f0(l5 l5Var) {
        C0(l5Var.getParentActivity(), l5Var.currentAccount, l5Var.getResourceProvider());
    }

    public static void g0(l5 l5Var, long j10) {
        m3 m3Var = l5Var.L0;
        if (l5Var.a == null) {
            return;
        }
        q8 q8Var = l5Var.j0;
        if (q8Var != null) {
            q8Var.a();
        }
        if (l5Var.J0 <= 0.0f && l5Var.v0()) {
            int top = l5Var.a.V2.m(l5Var.f).getTop() - l5Var.a.getPaddingTop();
            l5Var.a.B0();
            if (top < 0) {
                l5Var.a.v0(0, top, bs.h);
                return;
            }
            return;
        }
        l5Var.a.B0();
        l5Var.n0(true);
        AndroidUtilities.cancelRunOnUIThread(m3Var);
        if (j10 > 0) {
            AndroidUtilities.runOnUIThread(m3Var, j10 + 260);
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
    public static LinearLayout o0(Context context, int i10, TL_wallet.walletTransaction wallettransaction, Utilities.Callback3 callback3, Utilities.Callback2 callback2, byte[] bArr, Runnable runnable, org.telegram.ui.ActionBar.d6 d6Var, k2[] k2VarArr) {
        n4 n4Var;
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
        o4 o4Var;
        int i13;
        q4 q4Var;
        final k2[] k2VarArr2;
        char c10;
        Object r10;
        int i14;
        o4 o4Var2;
        final FrameLayout frameLayout;
        final Context context2 = context;
        final org.telegram.ui.ActionBar.d6 d6Var2 = d6Var;
        boolean z10 = callback3 != null;
        final LinearLayout e = wh.e(context2, 1);
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
        frameLayout2.addView(imageView3, w7.z5.a(48.0f, 4.0f, -2.0f, 0.0f, 0.0f, 48, 19));
        ImageView imageView4 = new ImageView(context2);
        imageView4.setScaleType(scaleType);
        imageView4.setImageResource(R.drawable.ic_ab_other);
        imageView4.setColorFilter(new PorterDuffColorFilter(w02, mode));
        imageView4.setBackground(org.telegram.ui.ActionBar.h6.g0(w03, 1, -1));
        imageView4.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        imageView4.setVisibility(callback3 != null ? 8 : 0);
        frameLayout2.addView(imageView4, w7.z5.a(48.0f, 0.0f, 2.0f, 4.0f, 0.0f, 44, 21));
        LinearLayout linearLayout2 = new LinearLayout(context2);
        linearLayout2.setOrientation(1);
        linearLayout2.setGravity(1);
        e.addView(linearLayout2, w7.z5.k(14.0f, wallettransaction.key_change ? -20.0f : -40.0f, 14.0f, 24.0f, -1, -2));
        View p6Var = new p6(120, context2, false);
        p6Var.setTag(p6.class);
        linearLayout2.addView(p6Var, w7.z5.t(120, 120, 1, 0, 0, 0, -8));
        n4 n4Var2 = new n4(context2);
        n4Var2.setSingleLine(true);
        n4Var2.setGravity(17);
        n4Var2.setIncludeFontPadding(false);
        n4Var2.setTextSize(1, 40.0f);
        n4Var2.setTypeface(AndroidUtilities.bold());
        linearLayout2.addView(n4Var2, w7.z5.q(-1, 50, 1));
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
            n4Var = n4Var2;
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
            n4Var = n4Var2;
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
                                    nVar.setOnClickListener(new ob(new boolean[]{false}, k2VarArr, d6Var2, nVar, wallettransaction, i10, str));
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
                                final t3 t3Var = new t3(0, textViewArr2, spannableStringArr);
                                final Runnable[] runnableArr = new Runnable[1];
                                imageView2 = imageView3;
                                textView = textView2;
                                final org.telegram.messenger.a6 a6Var = new org.telegram.messenger.a6(runnableArr, textViewArr2, i10, d6Var2, wallettransaction, strArr2, zArr2, bArr);
                                textViewArr = textViewArr2;
                                d6Var2 = d6Var2;
                                o4 o4Var3 = new o4(context2, d6Var2);
                                o4Var3.setHint(LocaleController.getString(R.string.WalletOptionalComment));
                                o4Var3.setText(strArr2[0]);
                                j01Var = j01Var2;
                                o4Var3.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(f7), AndroidUtilities.dp(64.0f), AndroidUtilities.dp(12.0f));
                                int i19 = org.telegram.ui.ActionBar.h6.G6;
                                o4Var3.setTextColor(org.telegram.ui.ActionBar.h6.w0(i19, d6Var2));
                                o4Var3.setHintTextColor(org.telegram.ui.ActionBar.h6.m1(0.65f, org.telegram.ui.ActionBar.h6.w0(i19, d6Var2)));
                                o4Var3.setMaxLines(4);
                                frameLayout4.addView(o4Var3, w7.z5.a(-2.0f, 0.0f, 0.0f, (wallettransaction.nft != null || bArr == null) ? 0.0f : 44.0f, 0.0f, -1, 119));
                                o4Var3.addTextChangedListener(new p4(strArr2, t3Var, runnableArr, a6Var));
                                if (wallettransaction.nft != null || bArr == null) {
                                    wallettransaction2 = wallettransaction;
                                    o4Var2 = o4Var3;
                                    strArr = strArr2;
                                    zArr = zArr2;
                                    frameLayout = frameLayout4;
                                    linearLayout = e;
                                } else {
                                    FrameLayout frameLayout5 = new FrameLayout(context2);
                                    w7.b6.a(frameLayout5);
                                    final ImageView imageView6 = new ImageView(context2);
                                    frameLayout5.addView(imageView6, w7.z5.d(-1.0f, -1));
                                    imageView6.setScaleType(ImageView.ScaleType.CENTER);
                                    imageView6.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(zArr2[0] ? org.telegram.ui.ActionBar.h6.Oh : org.telegram.ui.ActionBar.h6.z6, d6Var2), PorterDuff.Mode.SRC_IN));
                                    imageView6.setImageResource(zArr2[0] ? R.drawable.wallet_comment_locked : R.drawable.wallet_comment_unlocked);
                                    imageView6.setBackground(org.telegram.ui.ActionBar.h6.g0(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.i6, d6Var2), 1, -1));
                                    final ei.x3[] x3VarArr = new ei.x3[1];
                                    frameLayout = frameLayout4;
                                    o4Var2 = o4Var3;
                                    wallettransaction2 = wallettransaction;
                                    View.OnClickListener onClickListener = new View.OnClickListener() { // from class: org.telegram.ui.Wallet.u3
                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view) {
                                            final boolean[] zArr3 = zArr2;
                                            zArr3[0] = !zArr3[0];
                                            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
                                            final AtomicBoolean atomicBoolean = new AtomicBoolean();
                                            final ImageView imageView7 = imageView6;
                                            final org.telegram.ui.ActionBar.d6 d6Var3 = d6Var2;
                                            duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Wallet.a4
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
                                                x3Var2.l0 = new n(x3Var2, 8);
                                            }
                                            if (TextUtils.isEmpty(strArr2[0])) {
                                                return;
                                            }
                                            t3Var.run();
                                            Runnable[] runnableArr2 = runnableArr;
                                            Runnable runnable2 = runnableArr2[0];
                                            if (runnable2 != null) {
                                                runnable2.run();
                                                runnableArr2[0] = null;
                                            }
                                            org.telegram.messenger.a6 a6Var2 = a6Var;
                                            AndroidUtilities.cancelRunOnUIThread(a6Var2);
                                            AndroidUtilities.runOnUIThread(a6Var2, 1000L);
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
                                o4Var = o4Var2;
                            } else {
                                zArr = zArr2;
                                textViewArr = textViewArr2;
                                wallettransaction2 = wallettransaction;
                                strArr = strArr2;
                                imageView2 = imageView3;
                                linearLayout = e;
                                j01Var = j01Var2;
                                textView = textView2;
                                o4Var = null;
                            }
                            ei.d f10 = wh.f(24, context2, d6Var2, true);
                            f10.setText(LocaleController.getString(R.string.OK));
                            linearLayout.addView(f10, w7.z5.k(14.0f, 14.0f, 14.0f, 14.0f, -1, 48));
                            TL_wallet.walletTransaction[] wallettransactionArr = {wallettransaction2};
                            o4 o4Var4 = o4Var;
                            v3 v3Var = new v3(linearLayout, n4Var, d6Var2, i10, textView, k2VarArr, j01Var, callback3, context2, textViewArr, i12, spannableStringArr);
                            LinearLayout linearLayout3 = linearLayout;
                            linearLayout3.setTag(new t3(1, v3Var, wallettransactionArr));
                            v3Var.run(wallettransaction2);
                            if (z10) {
                                i13 = i10;
                                q4 q4Var2 = new q4(i13, wallettransactionArr, v3Var);
                                if (wallettransaction2.preview) {
                                    m0 w9 = m0.w(i13);
                                    String str2 = wallettransaction2.id;
                                    p pVar = new p(wallettransaction2, v3Var, wallettransactionArr, 4);
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
                                q4Var = q4Var2;
                            } else {
                                i13 = i10;
                                q4Var = null;
                            }
                            String[] strArr3 = strArr;
                            boolean[] zArr3 = zArr;
                            linearLayout3.addOnAttachStateChangeListener(new r4(v3Var, wallettransactionArr, q4Var, i13, callback2, k2VarArr, strArr3, zArr3));
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
                                f10.setOnClickListener(new org.telegram.messenger.video.f(f10, o4Var4, callback3, strArr3, zArr3, k2VarArr2, d6Var));
                            } else {
                                k2VarArr2 = k2VarArr;
                                if (runnable != null) {
                                    f10.setText(LocaleController.getString(R.string.WalletOpenMyWallet));
                                    f10.setOnClickListener(new ef0(25, runnable, k2VarArr2));
                                } else {
                                    final int i22 = 0;
                                    f10.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Wallet.s3
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
                            imageView2.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Wallet.s3
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
                            imageView7.setOnClickListener(new mb(k2VarArr2, d6Var, imageView7, wallettransactionArr, context, i10));
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
                        ei.d f102 = wh.f(24, context2, d6Var2, true);
                        f102.setText(LocaleController.getString(R.string.OK));
                        linearLayout.addView(f102, w7.z5.k(14.0f, 14.0f, 14.0f, 14.0f, -1, 48));
                        TL_wallet.walletTransaction[] wallettransactionArr2 = {wallettransaction2};
                        o4 o4Var42 = o4Var;
                        v3 v3Var2 = new v3(linearLayout, n4Var, d6Var2, i10, textView, k2VarArr, j01Var, callback3, context2, textViewArr, i12, spannableStringArr2);
                        LinearLayout linearLayout32 = linearLayout;
                        linearLayout32.setTag(new t3(1, v3Var2, wallettransactionArr2));
                        v3Var2.run(wallettransaction2);
                        if (z10) {
                        }
                        String[] strArr32 = strArr;
                        boolean[] zArr32 = zArr;
                        linearLayout32.addOnAttachStateChangeListener(new r4(v3Var2, wallettransactionArr2, q4Var, i13, callback2, k2VarArr, strArr32, zArr32));
                        if (callback3 == null) {
                        }
                        final int i232 = 1;
                        imageView2.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Wallet.s3
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
                        imageView72.setOnClickListener(new mb(k2VarArr2, d6Var, imageView72, wallettransactionArr2, context, i10));
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
                ei.d f1022 = wh.f(24, context2, d6Var2, true);
                f1022.setText(LocaleController.getString(R.string.OK));
                linearLayout.addView(f1022, w7.z5.k(14.0f, 14.0f, 14.0f, 14.0f, -1, 48));
                TL_wallet.walletTransaction[] wallettransactionArr22 = {wallettransaction2};
                o4 o4Var422 = o4Var;
                v3 v3Var22 = new v3(linearLayout, n4Var, d6Var2, i10, textView, k2VarArr, j01Var, callback3, context2, textViewArr, i12, spannableStringArr22);
                LinearLayout linearLayout322 = linearLayout;
                linearLayout322.setTag(new t3(1, v3Var22, wallettransactionArr22));
                v3Var22.run(wallettransaction2);
                if (z10) {
                }
                String[] strArr322 = strArr;
                boolean[] zArr322 = zArr;
                linearLayout322.addOnAttachStateChangeListener(new r4(v3Var22, wallettransactionArr22, q4Var, i13, callback2, k2VarArr, strArr322, zArr322));
                if (callback3 == null) {
                }
                final int i2322 = 1;
                imageView2.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Wallet.s3
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
                imageView722.setOnClickListener(new mb(k2VarArr2, d6Var, imageView722, wallettransactionArr22, context, i10));
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
        ei.d f10222 = wh.f(24, context2, d6Var2, true);
        f10222.setText(LocaleController.getString(R.string.OK));
        linearLayout.addView(f10222, w7.z5.k(14.0f, 14.0f, 14.0f, 14.0f, -1, 48));
        TL_wallet.walletTransaction[] wallettransactionArr222 = {wallettransaction2};
        o4 o4Var4222 = o4Var;
        v3 v3Var222 = new v3(linearLayout, n4Var, d6Var2, i10, textView, k2VarArr, j01Var, callback3, context2, textViewArr, i12, spannableStringArr222);
        LinearLayout linearLayout3222 = linearLayout;
        linearLayout3222.setTag(new t3(1, v3Var222, wallettransactionArr222));
        v3Var222.run(wallettransaction2);
        if (z10) {
        }
        String[] strArr3222 = strArr;
        boolean[] zArr3222 = zArr;
        linearLayout3222.addOnAttachStateChangeListener(new r4(v3Var222, wallettransactionArr222, q4Var, i13, callback2, k2VarArr, strArr3222, zArr3222));
        if (callback3 == null) {
        }
        final int i23222 = 1;
        imageView2.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Wallet.s3
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
        imageView7222.setOnClickListener(new mb(k2VarArr2, d6Var, imageView7222, wallettransactionArr222, context, i10));
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v3, types: [org.telegram.ui.Components.c91, org.telegram.ui.Wallet.k4] */
    public static void z0(Context context, int i10, TL_wallet.walletTransaction wallettransaction, Utilities.Callback3 callback3, Utilities.Callback2 callback2, byte[] bArr, org.telegram.ui.Cells.p0 p0Var, org.telegram.ui.ActionBar.d6 d6Var) {
        View[] viewArr;
        k2[] k2VarArr;
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
                ai.k7 k7Var = new ai.k7(context, i10, 0L, d6Var, null);
                k7Var.i1 = wallettransaction;
                k7Var.A2(tL_starGiftUnique.slug, tL_starGiftUnique, null);
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
            ?? k4Var = new k4(context, d6Var, A, arrayList, i10, rect, viewArr);
            k4Var.setPosition(i11);
            l4 l4Var = new l4(arrayList, context, d6Var, rect, i10, k2VarArr2);
            k2VarArr = k2VarArr2;
            k4Var.setAdapter(l4Var);
            callback22 = callback2;
            o02 = k4Var;
        } else {
            viewArr = viewArr2;
            k2VarArr = k2VarArr2;
            callback22 = callback2;
            o02 = o0(context, i10, wallettransaction, callback3, callback2, bArr, p0Var, d6Var, k2VarArr);
        }
        k2[] k2VarArr3 = k2VarArr;
        m4 m4Var = new m4(context, o02, d6Var, o02, viewArr, context);
        k2VarArr3[0] = m4Var;
        if ((o02 instanceof c91) && callback22 != null) {
            m4Var.setOnDismissListener(new t3(2, callback22, wallettransaction));
        }
        k2VarArr3[0].setFocusable(callback3 != null);
        k2 k2Var = k2VarArr3[0];
        k2Var.useBackgroundTopPadding = false;
        k2Var.show();
    }

    public final void A0(TL_wallet.nftItem nftitem) {
        TL_stars.StarGift starGift = nftitem.gift;
        if (starGift instanceof TL_stars.TL_starGiftUnique) {
            TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) starGift;
            ai.k7 k7Var = new ai.k7(getParentActivity(), this.currentAccount, 0L, getResourceProvider(), null);
            k7Var.f1 = nftitem;
            if (this.k0 != null) {
                k7Var.g1 = new s4(this, tL_starGiftUnique, nftitem);
                k7Var.h1 = new t4(this, nftitem);
            }
            k7Var.A2(tL_starGiftUnique.slug, tL_starGiftUnique, null);
            showDialog(k7Var);
            return;
        }
        Activity parentActivity = getParentActivity();
        org.telegram.ui.ActionBar.d6 resourceProvider = getResourceProvider();
        if (parentActivity != null) {
            int w02 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.a7, resourceProvider);
            int w03 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.G6, resourceProvider);
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
            i4Var.setCustomView(scrollView);
            i4Var.useBackgroundTopPadding = false;
            linearLayout2.getChildAt(0).setOnClickListener(new ef0(24, i4Var, nftitem));
            linearLayout2.getChildAt(1).setOnClickListener(new t2(parentActivity, 1));
            dVar.setOnClickListener(new t2(i4Var, 2));
            i4Var.show();
            i4Var.fixNavigationBar(w02);
            AndroidUtilities.setNavigationBarColor((Dialog) i4Var, w02, false);
        }
    }

    public final void D0() {
        if (getParentActivity() == null) {
            return;
        }
        if (getParentActivity().checkSelfPermission("android.permission.CAMERA") != 0) {
            getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 44);
        } else {
            org.telegram.ui.y9.e0(getParentActivity(), true, 1, new ki.t1(this, 19));
        }
    }

    public final void E0(boolean z10) {
        this.g0 = z10;
        if (!z10) {
            this.f0 = 0;
        }
        if (this.q0 == null || this.i0 == null) {
            return;
        }
        if (!z10) {
            this.j0.b(false);
            this.q0.setPosition(0);
        }
        S0();
        ValueAnimator valueAnimator = this.n0;
        if (valueAnimator != null) {
            this.n0 = null;
            valueAnimator.cancel();
        }
        float f7 = z10 ? 1.0f : 0.0f;
        boolean z11 = this.o0.isAttachedToWindow() && this.o0.isLaidOut();
        if (z10) {
            this.q0.o(false);
        }
        if (!z11 || this.m0 == f7) {
            F0(f7);
            this.q0.o(false);
        } else {
            this.i0.setVisibility(0);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.m0, f7);
            this.n0 = ofFloat;
            ofFloat.setDuration(250L);
            this.n0.setInterpolator(bs.h);
            this.n0.addUpdateListener(new x3(this, 0));
            this.n0.addListener(new org.telegram.ui.ActionBar.y0(this, f7, 7));
            this.n0.start();
        }
        if (this.a == null || this.p0 == G0()) {
            return;
        }
        Q0(false);
    }

    public final void F0(float f7) {
        this.m0 = f7;
        this.i0.setVisibility((f7 > 0.0f || this.n0 != null) ? 0 : 8);
        this.i0.setAlpha(f7);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.i0.getLayoutParams();
        layoutParams.height = Math.round(AndroidUtilities.dp(52.0f) * f7);
        layoutParams.bottomMargin = -Math.round(AndroidUtilities.dp(6.0f) * f7);
        this.i0.setLayoutParams(layoutParams);
    }

    public final boolean G0() {
        l0 l0Var;
        if (this.g0 || (l0Var = this.E0) == null || !l0Var.c.isEmpty()) {
            return false;
        }
        l0 l0Var2 = this.E0;
        l0Var2.getClass();
        return l0Var2.h;
    }

    public final void H0() {
        q8 q8Var = this.j0;
        if (q8Var != null) {
            q8Var.b(false);
        }
        if (!this.g0) {
            this.G0 = true;
            return;
        }
        this.G0 = false;
        this.f0 = 1;
        ei.h1 h1Var = this.q0;
        if (h1Var != null) {
            h1Var.setPosition(1);
        }
    }

    public final void I0() {
        this.G0 = false;
        q8 q8Var = this.j0;
        if (q8Var != null) {
            q8Var.b(false);
        }
        this.f0 = 0;
        ei.h1 h1Var = this.q0;
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
        y4 y4Var = this.d;
        if (y4Var != null) {
            y4Var.setAdditionalTilt(0.0f);
        }
    }

    public final void K0() {
        m0 w9 = m0.w(this.currentAccount);
        T0();
        this.D0.setEnabled(w9.E() && w9.d());
        if (!w9.E()) {
            this.u0.setText(y0(0));
            this.v0.setText(y0(1));
            return;
        }
        long u10 = w9.u();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (this.P0 == null) {
            this.P0 = new SpannableString("G");
            y4 y4Var = this.d;
            y4Var.getClass();
            u5 u5Var = new u5(y4Var, R.drawable.wallet_gram_large);
            this.w0 = u5Var;
            SpannableString spannableString = this.P0;
            spannableString.setSpan(u5Var, 0, spannableString.length(), 33);
        }
        spannableStringBuilder.append((CharSequence) this.P0);
        spannableStringBuilder.append((CharSequence) " ");
        spannableStringBuilder.append((CharSequence) v5.f(u10));
        spannableStringBuilder.append((CharSequence) " ");
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.GramCurrency));
        if (this.x0 == null) {
            b5 b5Var = new b5();
            b5Var.a = -9577217;
            this.x0 = b5Var;
        }
        spannableStringBuilder.setSpan(this.x0, length, spannableStringBuilder.length(), 33);
        this.u0.setText(spannableStringBuilder);
        CharSequence l4 = m0.w(this.currentAccount).l(u10, false);
        if (TextUtils.isEmpty(l4)) {
            this.v0.setText(y0(1));
        } else {
            this.v0.setText(l4);
        }
        N0(this.y0);
        e0 e0Var = this.F0;
        if (e0Var != null && !e0Var.h && !e0Var.i && e0Var.k == null) {
            e0Var.e();
        }
        String s10 = w9.s();
        if (TextUtils.isEmpty(s10)) {
            return;
        }
        this.d.setCardNumber(q0(s10.toUpperCase()));
    }

    public final void L0() {
        float[] fArr;
        float[] fArr2;
        Rect rect = this.H;
        if (rect.isEmpty() || !this.y.isAttachedToWindow()) {
            return;
        }
        y4 y4Var = this.d;
        ah.v vVar = this.E;
        Matrix matrix = this.I;
        if (y4Var.i(vVar, matrix)) {
            float width = rect.width();
            float height = rect.height();
            int i10 = 0;
            while (true) {
                fArr = this.L;
                fArr2 = this.M;
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
            ah.v vVar2 = this.E;
            int[] iArr = this.P;
            vVar2.getLocationInWindow(iArr);
            View view = this.y;
            int[] iArr2 = this.O;
            view.getLocationInWindow(iArr2);
            this.d.k(this.y0, this.x.getWidth() / 0.7826087f);
            float f11 = iArr2[0] - iArr[0];
            float z10 = org.telegram.ui.Cells.t0.z(height, 0.7826087f, 0.5f, iArr2[1] - iArr[1]);
            for (int i13 = 0; i13 < 4; i13++) {
                int i14 = i13 * 2;
                float lerp = AndroidUtilities.lerp(fArr2[i14], (fArr[i14] * 0.7826087f) + f11, this.y0);
                float[] fArr3 = this.N;
                fArr3[i14] = lerp;
                int i15 = i14 + 1;
                fArr3[i15] = AndroidUtilities.lerp(fArr2[i15], (fArr[i15] * 0.7826087f) + z10, this.y0);
            }
            Matrix matrix2 = this.K;
            boolean polyToPoly = matrix2.setPolyToPoly(this.L, 0, this.N, 0, 4);
            Matrix matrix3 = this.J;
            if (polyToPoly && !matrix3.equals(matrix2)) {
                matrix3.set(matrix2);
                this.E.invalidate();
            }
            y4 y4Var2 = this.d;
            Matrix matrix4 = y4Var2.c;
            Matrix matrix5 = y4Var2.e;
            Matrix matrix6 = y4Var2.d;
            if (matrix.invert(matrix6)) {
                matrix5.setConcat(matrix6, matrix3);
                if (!y4Var2.r || !matrix4.equals(matrix5)) {
                    matrix4.set(matrix5);
                    y4Var2.r = true;
                    y4Var2.R.invalidate();
                }
            }
            float lerp2 = AndroidUtilities.lerp(1.0f, 1.0952381f, this.y0);
            this.v0.setPivotX(0.0f);
            this.v0.setPivotY(0.0f);
            this.v0.setScaleX(lerp2);
            this.v0.setScaleY(lerp2);
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
        if (this.a == null || this.d == null || this.t0 == null || this.y == null || (vVar = this.E) == null || this.actionBar == null) {
            return;
        }
        vVar.bringToFront();
        View m10 = this.a.V2.m(this.f);
        float clamp = m10 == null ? this.a.V2.L0() > this.f ? 1.0f : 0.0f : Utilities.clamp((this.a.getPaddingTop() - m10.getTop()) / m10.getHeight(), 1.0f, 0.0f);
        this.z0 = clamp;
        float f10 = this.J0;
        boolean z10 = f10 > 0.0f || this.I0 > 0.0f;
        if (z10) {
            clamp = f10 > 0.0f ? 0.0f : (1.0f - this.I0) * clamp;
        }
        this.y0 = clamp;
        P0();
        float max = m10 != null ? Math.max(0.0f, (m10.getHeight() / 2.0f) + AndroidUtilities.dp(24.0f)) * this.y0 : 0.0f;
        float lerp = AndroidUtilities.lerp(1.0f, 0.8f, this.y0);
        this.d.setPivotX(r11.getWidth() * 0.5f);
        this.d.setPivotY(0.0f);
        this.d.setScaleX(lerp);
        this.d.setScaleY(lerp);
        this.d.setAlpha(1.0f - Utilities.clamp01(AndroidUtilities.ilerp(clamp, 0.75f, 1.0f)));
        this.d.setVisibility((m10 == null || clamp >= 1.0f || m10.getBottom() <= this.a.getPaddingTop() || m10.getTop() >= this.a.getHeight() - this.a.getPaddingBottom()) ? 4 : 0);
        int[] iArr = this.R;
        int[] iArr2 = this.Q;
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
            boolean z11 = this.J0 == 0.0f ? r16 : false;
            float f11 = this.I0;
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
                    AndroidUtilities.cancelRunOnUIThread(this.L0);
                    ValueAnimator valueAnimator = this.K0;
                    if (valueAnimator != null) {
                        this.K0 = null;
                        valueAnimator.cancel();
                    }
                    this.I0 = 0.0f;
                    this.J0 = 0.0f;
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
            this.d.setVisibility(0);
        }
        boolean z12 = clamp > 0.0f ? r16 : false;
        if (this.F != z12 && (linearLayout = this.t0) != null) {
            Rect rect = this.H;
            if (z12) {
                if (linearLayout.getWidth() != 0 && this.t0.getHeight() != 0) {
                    rect.set(this.t0.getLeft(), this.t0.getTop(), this.t0.getRight(), this.t0.getBottom());
                }
            }
            this.d.setOnFrontContentPresented(null);
            this.G = false;
            AndroidUtilities.removeFromParent(this.t0);
            this.F = z12;
            if (z12) {
                this.E.addView(this.t0, new FrameLayout.LayoutParams(rect.width(), rect.height(), 51));
                this.t0.layout(0, 0, rect.width(), rect.height());
                L0();
            } else {
                y4 y4Var = this.d;
                y4Var.k(0.0f, 0.0f);
                LinearLayout linearLayout2 = y4Var.Q;
                AndroidUtilities.removeFromParent(linearLayout2);
                linearLayout2.setScaleX(1.0f);
                linearLayout2.setScaleY(1.0f);
                linearLayout2.setRotationX(0.0f);
                linearLayout2.setRotationY(0.0f);
                linearLayout2.setTranslationX(0.0f);
                linearLayout2.setTranslationY(0.0f);
                t5 t5Var = y4Var.S;
                t5Var.setScaleX(1.0f);
                t5Var.setScaleY(1.0f);
                y4Var.H.addView(linearLayout2, y4Var.T);
                this.t0.layout(rect.left, rect.top, rect.right, rect.bottom);
                this.G = !this.d.s;
                L0();
                if (this.G) {
                    this.d.setOnFrontContentPresented(new m3(this, 9));
                }
            }
            this.E.invalidate();
        }
        N0(clamp);
        if (this.F) {
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
        this.u0.setTextColor(AndroidUtilities.lerpColor(-1, themedColor, f7));
        org.telegram.ui.Components.q6 q6Var = this.v0;
        float[] fArr = this.d.e0;
        int i10 = -7868417;
        if (fArr != null) {
            i10 = i0.b.f(fArr[8], k7.m(fArr, -7868417, 0), k7.m(fArr, -7868417, 3));
        }
        q6Var.setTextColor(AndroidUtilities.lerpColor(i10, i0.b.o(themedColor, Math.round(142.8f)), f7));
        u5 u5Var = this.w0;
        if (u5Var != null) {
            u5Var.setOverrideColor(AndroidUtilities.lerpColor(-1, getThemedColor(org.telegram.ui.ActionBar.h6.Oh), f7));
        }
        b5 b5Var = this.x0;
        if (b5Var != null) {
            float[] fArr2 = this.d.e0;
            int i11 = -9577217;
            if (fArr2 != null) {
                i11 = i0.b.f(fArr2[8], k7.m(fArr2, -9577217, 0), k7.m(fArr2, -9577217, 3));
            }
            b5Var.a = i0.b.o(i11, Math.round((1.0f - f7) * 255.0f));
        }
        this.u0.invalidate();
    }

    public final void O0(float[] fArr) {
        if (this.C0 == null || this.D0 == null) {
            return;
        }
        float f7 = k7.h(getThemedColor(org.telegram.ui.ActionBar.h6.a7))[0];
        boolean z10 = f7 < 0.6f;
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.h6.Oh);
        if (fArr != null && fArr.length >= 18) {
            int[] iArr = new int[2];
            for (int i10 = 0; i10 < 2; i10++) {
                int i11 = i10 * 4;
                float f10 = fArr[i11 + 10];
                iArr[i10] = f10 < 0.0f ? themedColor : k7.l(themedColor, (int) f10, (int) fArr[i11 + 11]);
            }
            themedColor = i0.b.f(fArr[8], iArr[0], iArr[1]);
        }
        float f11 = z10 ? f7 + 0.25f : 0.0f;
        float f12 = z10 ? 1.0f : f7 - 0.2f;
        float[] h = k7.h(themedColor);
        float f13 = h[0];
        if (f13 < f11 || f13 > f12) {
            themedColor = (themedColor & (-16777216)) | (k7.j(Math.max(f11, Math.min(f12, f13)), h[1], h[2]) & 16777215);
        }
        if (themedColor == this.M0) {
            return;
        }
        this.M0 = themedColor;
        int themedColor2 = i0.b.h(themedColor) <= 0.550000011920929d ? getThemedColor(org.telegram.ui.ActionBar.h6.Sh) : -16777216;
        ei.d[] dVarArr = {this.C0, this.D0};
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
        this.d.setAdditionalTilt(Math.max(0.0f, (this.y0 * 10.0f) + ((((float) Math.sqrt(Utilities.clamp01(this.y0))) * 90.0f) - 10.0f)) + Math.min(10.0f, this.a.C2.b(3) * 40.0f) + (-Math.min(10.0f, b10 * 40.0f)));
        this.d.setUseGyroscope(1.0f - ((float) Math.pow(this.y0, 0.33000001311302185d)));
    }

    public final void Q0(boolean z10) {
        boolean G0 = G0();
        u61 u61Var = this.a;
        a71[] a71VarArr = this.s0;
        if (u61Var != null && this.p0 != G0) {
            this.p0 = G0;
            u61Var.B0();
            for (a71 a71Var : a71VarArr) {
                if (a71Var != null) {
                    a71Var.B0();
                }
            }
            this.a.W2.N(false);
            this.a.V2.h1(0, 0);
            this.a.post(new m3(this, 11));
        }
        if (G0) {
            return;
        }
        for (a71 a71Var2 : a71VarArr) {
            if (a71Var2 != null) {
                R0(a71Var2, z10);
            }
        }
        ai.r rVar = this.o0;
        if (rVar != null) {
            rVar.post(new m3(this, 5));
            this.o0.post(new m3(this, 6));
        }
    }

    public final void S0() {
        q8 q8Var = this.j0;
        if (q8Var == null || this.q0 == null || q8Var.w == 0.0f) {
            return;
        }
        q8Var.w = 0.0f;
        q8Var.c.setVisibility(8);
        q8Var.invalidate();
    }

    public final void T0() {
        if (this.T == null) {
            return;
        }
        m0 w9 = m0.w(this.currentAccount);
        boolean z10 = this.T.isAttachedToWindow() && this.T.isLaidOut();
        u4 u4Var = this.T;
        FrameLayout frameLayout = this.U;
        Boolean bool = w9.i;
        u4Var.i(frameLayout, (bool == null || !bool.booleanValue() || TextUtils.isEmpty(w9.j)) ? false : true, z10);
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
            this.X.setText(s0(R.string.WalletOldWalletsBalance, j10));
        }
        this.T.i(this.W, z11, z10);
        long j12 = ai.fa.y(this.currentAccount, true).p().amount;
        boolean z12 = j12 > 500000000;
        if (z12) {
            this.Z.setText(s0(R.string.WalletGramEarningsBalance, j12));
        }
        this.T.i(this.Y, z12, z10);
    }

    @Override // org.telegram.ui.Components.v61
    public final void U(ArrayList arrayList, s61 s61Var) {
        m0 w9 = m0.w(this.currentAccount);
        T0();
        arrayList.add(f61.l(this.S));
        this.f = arrayList.size();
        v4 v4Var = this.e;
        f61 f61Var = new f61(-4);
        f61Var.c = v4Var;
        f61Var.z = -1;
        f61Var.e = true;
        arrayList.add(f61Var);
        arrayList.add(f61.l(this.A0));
        boolean G0 = G0();
        this.p0 = G0;
        if (G0) {
            int i10 = R.drawable.wallet_learn_instant;
            String string = LocaleController.getString(R.string.WalletSendInstantly);
            String string2 = LocaleController.getString(R.string.WalletSendInstantlyInfo);
            int i11 = c5.a;
            f61 J = f61.J(c5.class);
            J.k = i10;
            J.l = string;
            J.m = string2;
            arrayList.add(J);
            int i12 = R.drawable.wallet_learn_fees;
            String string3 = LocaleController.getString(R.string.WalletNoFees);
            String string4 = LocaleController.getString(R.string.WalletNoFeesInfo);
            f61 J2 = f61.J(c5.class);
            J2.k = i12;
            J2.l = string3;
            J2.m = string4;
            arrayList.add(J2);
            int i13 = R.drawable.wallet_learn_verified;
            String string5 = LocaleController.getString(R.string.WalletBlockchainVerified);
            String string6 = LocaleController.getString(R.string.WalletBlockchainVerifiedInfo);
            f61 J3 = f61.J(c5.class);
            J3.k = i13;
            J3.l = string5;
            J3.m = string6;
            arrayList.add(J3);
            arrayList.add(f61.l(this.b0));
        } else if (this.o0 != null) {
            if (this.Q0 && !this.R0 && w9.u() > 500000000) {
                arrayList.add(f61.k(this.d0));
            }
            arrayList.add(f61.p(this.o0, 0, true));
        }
        x90 x90Var = this.a0;
        if (x90Var != null) {
            this.c0 = false;
            x90Var.animate().cancel();
            this.a0.setAlpha(0.0f);
            this.a0.setVisibility(4);
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
            A0((TL_wallet.nftItem) obj);
            return;
        }
        if (f61Var.d == -10001 && (e0Var = this.F0) != null) {
            e0Var.e();
        } else if (obj instanceof TL_wallet.walletTransaction) {
            z0(getParentActivity(), this.currentAccount, (TL_wallet.walletTransaction) f61Var.G, null, null, null, null, getResourceProvider());
        }
    }

    @Override // org.telegram.ui.Components.v61
    public final boolean X(f61 f61Var, View view) {
        w7 w7Var;
        if (!(view instanceof j7) || (w7Var = this.k0) == null) {
            return false;
        }
        w7Var.U((j7) view);
        return true;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean canBeginSlide() {
        w7 w7Var = this.k0;
        return (w7Var == null || !w7Var.k0) && super.canBeginSlide();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.telegram.ui.Components.v61, org.telegram.ui.ActionBar.n2
    public final View createView(Context context) {
        ValueAnimator valueAnimator = this.n0;
        if (valueAnimator != null) {
            this.n0 = null;
            valueAnimator.cancel();
        }
        J0();
        h5 h5Var = this.r0;
        if (h5Var != null) {
            h5Var.b(null);
        }
        this.e = null;
        this.T = null;
        this.S = null;
        this.o0 = null;
        this.q0 = null;
        a71[] a71VarArr = this.s0;
        int i10 = 0;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        Object[] objArr5 = 0;
        a71VarArr[0] = null;
        final int i11 = 1;
        a71VarArr[1] = null;
        e0 e0Var = this.F0;
        boolean z10 = (e0Var == null || e0Var.a.isEmpty()) ? false : true;
        this.g0 = z10;
        if (!z10) {
            this.f0 = 0;
        } else if (this.G0) {
            this.f0 = 1;
        }
        w7 w7Var = this.k0;
        if (w7Var != null) {
            w7Var.p();
        }
        this.k0 = null;
        View createView = super.createView(context);
        nc0 nc0Var = new nc0(this, context);
        nc0Var.addView(createView, w7.z5.d(-1.0f, -1));
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
        n10.a(2, R.drawable.scan_qr).setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Wallet.o3
            public final /* synthetic */ l5 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i13) {
                    case 0:
                        l5 l5Var = this.b;
                        l5Var.getClass();
                        l5Var.presentFragment(new xf1(6, null));
                        break;
                    case 1:
                        l5.c0(this.b);
                        break;
                    case 2:
                        l5.f0(this.b);
                        break;
                    case 3:
                        this.b.D0();
                        break;
                    default:
                        l5.a0(this.b);
                        break;
                }
            }
        });
        n10.a(1, R.drawable.ic_ab_other).setOnClickListener(new ef0(26, this, context));
        ah.x xVar = new ah.x(this, context, 27);
        this.S = xVar;
        xVar.setClipToPadding(false);
        this.S.setClipChildren(false);
        this.S.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(4.0f));
        u4 u4Var = new u4(this, context);
        this.T = u4Var;
        u4Var.setDefaultRadiusDp(22);
        this.T.setOnAnimatedHeightChangedListener(new m3(this, 12));
        TextView textView = new TextView(context);
        this.V = textView;
        textView.setText(LocaleController.getString(R.string.WalletWaltFunds));
        this.U = p0(this.V, new m3(this, i10));
        TextView textView2 = new TextView(context);
        this.X = textView2;
        this.W = p0(textView2, new m3(this, i11));
        TextView textView3 = new TextView(context);
        this.Z = textView3;
        this.Y = p0(textView3, new m3(this, 2));
        this.S.addView(this.T, w7.z5.d(-2.0f, -1));
        x90 x90Var = new x90(context, null);
        this.a0 = x90Var;
        this.c0 = false;
        x90Var.setAlpha(0.0f);
        x90 x90Var2 = this.a0;
        int i14 = org.telegram.ui.ActionBar.h6.z6;
        x90Var2.setTextColor(org.telegram.ui.ActionBar.h6.w0(i14, this.resourceProvider));
        this.a0.setTextSize(1, 13.0f);
        this.a0.setGravity(17);
        this.a0.setText(AndroidUtilities.replaceSingleLink(LocaleController.getString(R.string.WalletTermsOfService), org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.gc, this.resourceProvider), new n3(context, objArr5 == true ? 1 : 0)));
        this.a0.setVisibility(4);
        ((FrameLayout) createView).addView(this.a0, w7.z5.a(-2.0f, 12.0f, 0.0f, 12.0f, 24.0f, -1, 81));
        v4 v4Var = new v4(this, context, objArr4 == true ? 1 : 0);
        this.b0 = v4Var;
        v4Var.setImportantForAccessibility(2);
        this.d0 = new FrameLayout(context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.e0 = frameLayout;
        int i15 = org.telegram.ui.ActionBar.h6.d6;
        int themedColor = getThemedColor(i15);
        int themedColor2 = getThemedColor(i15);
        int i16 = org.telegram.ui.ActionBar.h6.i6;
        frameLayout.setBackground(org.telegram.ui.ActionBar.h6.a0(themedColor, org.telegram.ui.ActionBar.h6.v(themedColor2, getThemedColor(i16)), 16, 16));
        this.d0.addView(this.e0, w7.z5.a(-2.0f, 12.0f, 0.0f, 12.0f, 12.0f, -1, 55));
        ImageView imageView = new ImageView(context);
        float dpf2 = AndroidUtilities.dpf2(10.0f);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{dpf2, dpf2, dpf2, dpf2, dpf2, dpf2, dpf2, dpf2}, null, null));
        shapeDrawable.setShaderFactory(new w4());
        imageView.setBackground(shapeDrawable);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.wallet_protect);
        this.e0.addView(imageView, w7.z5.a(28.0f, 14.0f, 11.0f, 16.0f, 11.0f, 28, 19));
        TextView textView4 = new TextView(context);
        wh.o(org.telegram.ui.ActionBar.h6.q7, this.resourceProvider, textView4, 1, 16.0f);
        textView4.setText(LocaleController.getString(R.string.WalletProtectAccount));
        this.e0.addView(textView4, w7.z5.a(-2.0f, 58.0f, 0.0f, 32.0f, 0.0f, -1, 19));
        FrameLayout frameLayout2 = this.e0;
        final Object[] objArr6 = objArr3 == true ? 1 : 0;
        frameLayout2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Wallet.o3
            public final /* synthetic */ l5 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (objArr6) {
                    case 0:
                        l5 l5Var = this.b;
                        l5Var.getClass();
                        l5Var.presentFragment(new xf1(6, null));
                        break;
                    case 1:
                        l5.c0(this.b);
                        break;
                    case 2:
                        l5.f0(this.b);
                        break;
                    case 3:
                        this.b.D0();
                        break;
                    default:
                        l5.a0(this.b);
                        break;
                }
            }
        });
        w7.b6.b(this.e0, 0.02f, 1.2f);
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.x = frameLayout3;
        frameLayout3.setClipChildren(false);
        this.x.setClipToPadding(false);
        this.actionBar.addView(this.x, w7.z5.a(56.0f, 64.0f, 0.0f, 96.0f, 0.0f, -1, 87));
        View view = new View(context);
        this.y = view;
        this.x.addView(view, w7.z5.e(1, 1, 19));
        this.F = false;
        this.G = false;
        this.H.setEmpty();
        this.J.reset();
        ah.v vVar = new ah.v(this, context);
        this.E = vVar;
        vVar.setClipChildren(false);
        this.E.setClipToPadding(false);
        y4 y4Var = new y4(this, context, this.w);
        this.d = y4Var;
        y4Var.setDiamondOnCard(true);
        this.d.setCardOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Wallet.o3
            public final /* synthetic */ l5 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i11) {
                    case 0:
                        l5 l5Var = this.b;
                        l5Var.getClass();
                        l5Var.presentFragment(new xf1(6, null));
                        break;
                    case 1:
                        l5.c0(this.b);
                        break;
                    case 2:
                        l5.f0(this.b);
                        break;
                    case 3:
                        this.b.D0();
                        break;
                    default:
                        l5.a0(this.b);
                        break;
                }
            }
        });
        this.a.C2.b.add(this.v);
        v4 v4Var2 = new v4(this, context, i11);
        this.e = v4Var2;
        v4Var2.setImportantForAccessibility(2);
        z4 z4Var = new z4(this, context);
        this.h = z4Var;
        z4Var.setClipChildren(false);
        this.h.setClipToPadding(false);
        this.h.addView(this.d, w7.z5.d(-2.0f, -1));
        nc0Var.addView(this.h, w7.z5.d(-1.0f, -1));
        this.a.setClipChildren(false);
        this.a.setClipToPadding(false);
        this.t0 = this.d.getBalanceLayout();
        this.u0 = this.d.getBalanceView();
        this.v0 = this.d.getUsdBalanceView();
        this.d.setCardHolder(UserObject.getUserName(getUserConfig().getCurrentUser()).toUpperCase());
        this.B0 = 0.0f;
        sa1 sa1Var = new sa1(this, context, 19);
        this.A0 = sa1Var;
        sa1Var.setOrientation(0);
        this.A0.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(12.0f));
        ei.d dVar = new ei.d(context, this.resourceProvider, true);
        dVar.setRoundRadius(24);
        this.C0 = dVar;
        dVar.setText(LocaleController.getString(R.string.WalletAddFunds));
        this.A0.addView(this.C0, w7.z5.m(1.0f, 0, 48, 0, 4, 0));
        final int i17 = 2;
        this.C0.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Wallet.o3
            public final /* synthetic */ l5 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i17) {
                    case 0:
                        l5 l5Var = this.b;
                        l5Var.getClass();
                        l5Var.presentFragment(new xf1(6, null));
                        break;
                    case 1:
                        l5.c0(this.b);
                        break;
                    case 2:
                        l5.f0(this.b);
                        break;
                    case 3:
                        this.b.D0();
                        break;
                    default:
                        l5.a0(this.b);
                        break;
                }
            }
        });
        ei.d dVar2 = new ei.d(context, this.resourceProvider, true);
        dVar2.setRoundRadius(24);
        this.D0 = dVar2;
        dVar2.setText(LocaleController.getString(R.string.WalletSend));
        this.D0.setEnabled(m0.w(this.currentAccount).d());
        final int i18 = 4;
        this.D0.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Wallet.o3
            public final /* synthetic */ l5 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i18) {
                    case 0:
                        l5 l5Var = this.b;
                        l5Var.getClass();
                        l5Var.presentFragment(new xf1(6, null));
                        break;
                    case 1:
                        l5.c0(this.b);
                        break;
                    case 2:
                        l5.f0(this.b);
                        break;
                    case 3:
                        this.b.D0();
                        break;
                    default:
                        l5.a0(this.b);
                        break;
                }
            }
        });
        this.A0.addView(this.D0, w7.z5.m(1.0f, 0, 48, 4, 0, 0));
        O0(this.d.getStickerStyle());
        this.E0 = m0.w(this.currentAccount).A();
        this.a.setDescendantFocusability(131072);
        w7 w7Var2 = new w7(this, this.d, new n2.e(this, nc0Var, objArr2 == true ? 1 : 0, 12), null);
        this.k0 = w7Var2;
        nc0Var.addView(w7Var2, w7.z5.d(-1.0f, -1));
        this.l0 = "";
        ai.r rVar = new ai.r(context, 8);
        this.o0 = rVar;
        rVar.setOrientation(1);
        this.o0.setBackgroundColor(getThemedColor(i12));
        ei.h1 h1Var = new ei.h1(this, context, this.resourceProvider, 10);
        this.q0 = h1Var;
        h1Var.setAllowDisallowInterceptTouch(false);
        this.q0.setAdapter(new h4(this, context));
        b91 n11 = this.q0.n(-2, true);
        this.h0 = n11;
        n11.g(i14, org.telegram.ui.ActionBar.h6.G6, i14, i16, i15);
        this.h0.setBackground(org.telegram.ui.ActionBar.h6.c0(AndroidUtilities.dp(20.0f), getThemedColor(i15)));
        this.i0 = new FrameLayout(context);
        q8 q8Var = new q8(context, this.h0, this.resourceProvider, new y3(this, objArr == true ? 1 : 0), new y3(this, i11), new y3(this, 2));
        this.j0 = q8Var;
        this.i0.addView(q8Var, w7.z5.a(40.0f, 16.0f, 0.0f, 16.0f, 0.0f, -1, 48));
        this.q0.setPosition(this.f0);
        S0();
        this.o0.addView(this.i0, w7.z5.k(0.0f, 0.0f, 0.0f, -6.0f, -1, 52));
        this.o0.addView(this.q0, w7.z5.l(1.0f, -1, 0));
        E0(this.g0);
        e0 e0Var2 = this.F0;
        if (e0Var2 != null) {
            this.k0.a0(e0Var2);
        }
        this.a.j(new kv(this, 14));
        s61 s61Var = this.a.W2;
        s61Var.r = false;
        s61Var.N(false);
        h5 h5Var2 = new h5(this);
        this.r0 = h5Var2;
        h5Var2.b(this.a);
        K0();
        this.E0.g();
        this.actionBar.post(new m3(this, 10));
        this.a.post(new m3(this, 11));
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        u61 u61Var;
        s61 s61Var;
        if (i11 != this.currentAccount) {
            return;
        }
        if (i10 == NotificationCenter.walletUpdate && this.u0 != null) {
            K0();
            Iterator it = this.O0.iterator();
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
                    this.Q0 = true;
                    this.R0 = ((TL_account.Password) obj).has_password;
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
        l0 l0Var = this.E0;
        if (obj2 != l0Var || (u61Var = this.a) == null || u61Var.W2 == null) {
            return;
        }
        if (l0Var.b.isEmpty()) {
            l0 l0Var2 = this.E0;
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

    public final void n0(boolean z10) {
        AndroidUtilities.cancelRunOnUIThread(this.L0);
        float f7 = z10 ? 1.0f : 0.0f;
        if (this.J0 == f7) {
            return;
        }
        this.J0 = f7;
        ValueAnimator valueAnimator = this.K0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        M0();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.I0, f7);
        this.K0 = ofFloat;
        ofFloat.setDuration(z10 ? 260L : 120L);
        this.K0.setInterpolator(z10 ? new bs(0.05d, 0.7d, 0.1d, 1.0d) : new bs(0.4d, 0.0d, 0.2d, 1.0d));
        this.K0.addUpdateListener(new x3(this, 1));
        this.K0.addListener(new vf1(this, 4));
        this.K0.start();
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean onBackPressed(boolean z10) {
        q8 q8Var = this.j0;
        if (q8Var == null || !q8Var.x) {
            return super.onBackPressed(z10);
        }
        if (z10) {
            q8Var.b(false);
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onBeginSlide() {
        h5 h5Var = this.r0;
        if (h5Var != null) {
            h5Var.c();
        }
        u61 u61Var = this.a;
        if (u61Var != null) {
            u61Var.B0();
        }
        a71 t02 = t0();
        if (t02 != null) {
            t02.B0();
        }
        super.onBeginSlide();
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean onFragmentCreate() {
        getNotificationCenter().addObserver(this, NotificationCenter.walletUpdate);
        getNotificationCenter().addObserver(this, NotificationCenter.starBalanceUpdated);
        getNotificationCenter().addObserver(this, NotificationCenter.walletTransactionsUpdate);
        getNotificationCenter().addObserver(this, NotificationCenter.didSetOrRemoveTwoStepPassword);
        m0 w9 = m0.w(this.currentAccount);
        if (w9.o == null) {
            w9.o = new e0(w9);
        }
        e0 e0Var = w9.o;
        this.F0 = e0Var;
        ArrayList arrayList = e0Var.d;
        m3 m3Var = this.H0;
        if (!arrayList.contains(m3Var)) {
            arrayList.add(m3Var);
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
        AndroidUtilities.cancelRunOnUIThread(this.L0);
        ValueAnimator valueAnimator = this.K0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        w7 w7Var = this.k0;
        if (w7Var != null) {
            w7Var.p();
        }
        y4 y4Var = this.d;
        if (y4Var != null) {
            y4Var.setOnFrontContentPresented(null);
        }
        this.G = false;
        ValueAnimator valueAnimator2 = this.n0;
        if (valueAnimator2 != null) {
            this.n0 = null;
            valueAnimator2.cancel();
        }
        e0 e0Var = this.F0;
        if (e0Var != null) {
            e0Var.d.remove(this.H0);
        }
        J0();
        h5 h5Var = this.r0;
        if (h5Var != null) {
            h5Var.b(null);
        }
        getNotificationCenter().removeObserver(this, NotificationCenter.walletUpdate);
        getNotificationCenter().removeObserver(this, NotificationCenter.starBalanceUpdated);
        getNotificationCenter().removeObserver(this, NotificationCenter.walletTransactionsUpdate);
        getNotificationCenter().removeObserver(this, NotificationCenter.didSetOrRemoveTwoStepPassword);
        AndroidUtilities.removeFromParent(this.E);
        l0 l0Var = this.E0;
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
        x90 x90Var = this.a0;
        if (x90Var != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) x90Var.getLayoutParams();
            layoutParams.bottomMargin = AndroidUtilities.dp(24.0f) + i13;
            this.a0.setLayoutParams(layoutParams);
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onRequestPermissionsResultFragment(int i10, String[] strArr, int[] iArr) {
        if (i10 != 44 || getParentActivity() == null) {
            return;
        }
        if (iArr.length > 0 && iArr[0] == 0) {
            D0();
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        alertDialog$Builder.a.T = AndroidUtilities.replaceTags(LocaleController.getString(R.string.QRCodePermissionNoCameraWithHint));
        alertDialog$Builder.k(LocaleController.getString(R.string.PermissionOpenSettings), new p3(this));
        alertDialog$Builder.h(LocaleController.getString(R.string.ContactsPermissionAlertNotNow), null);
        alertDialog$Builder.m(R.raw.permission_request_camera, 72, org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.L5, false), null);
        alertDialog$Builder.o();
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onResume() {
        super.onResume();
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar != null) {
            kVar.post(new m3(this, 10));
        }
        m0.w(this.currentAccount).C();
        if (this.F0 != null && m0.w(this.currentAccount).E()) {
            e0 e0Var = this.F0;
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

    public final FrameLayout p0(TextView textView, Runnable runnable) {
        Context context = textView.getContext();
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(14.0f));
        frameLayout.setBackground(org.telegram.ui.ActionBar.h6.g0(getThemedColor(org.telegram.ui.ActionBar.h6.i6), 2, -1));
        textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.h6.G6));
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(19);
        frameLayout.addView(textView, w7.z5.a(-2.0f, 0.0f, 0.0f, 42.0f, 0.0f, -1, 3));
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(R.drawable.attach_arrow_right);
        imageView.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.h6.z6), PorterDuff.Mode.SRC_IN));
        frameLayout.addView(imageView, w7.z5.e(-2, -2, 21));
        frameLayout.setOnClickListener(new t2(runnable, 3));
        textView.setDuplicateParentStateEnabled(true);
        w7.b6.b(textView, 0.02f, 1.2f);
        this.T.addView(frameLayout, w7.z5.n(-1, -2));
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

    public final a71 t0() {
        if (u0()) {
            ei.h1 h1Var = this.q0;
            View currentView = h1Var == null ? null : h1Var.getCurrentView();
            if (currentView instanceof a71) {
                return (a71) currentView;
            }
        }
        return null;
    }

    public final boolean u0() {
        ai.r rVar;
        if (this.p0 || (rVar = this.o0) == null || !rVar.isAttachedToWindow()) {
            return false;
        }
        ViewParent parent = this.o0.getParent();
        u61 u61Var = this.a;
        return parent == u61Var.V2.m(u61Var.W2.x.size() - 1);
    }

    public final boolean v0() {
        View m10;
        u61 u61Var = this.a;
        return u61Var != null && (m10 = u61Var.V2.m(this.f)) != null && this.z0 < 0.5f && m10.getBottom() > this.a.getPaddingTop();
    }

    public final void w0() {
        e0 e0Var;
        a71 a71Var = this.s0[1];
        if (this.f0 != 1 || a71Var == null || !a71Var.G || (e0Var = this.F0) == null || e0Var.i || e0Var.g || e0Var.k != null || a71Var.V2.N0() < a71Var.W2.x.size() - 3) {
            return;
        }
        this.F0.e();
    }

    public final void x0() {
        l0 l0Var;
        a71 a71Var = this.s0[0];
        if (a71Var == null || !a71Var.G || (l0Var = this.E0) == null || l0Var.h || a71Var.V2.N0() < a71Var.W2.x.size() - 3) {
            return;
        }
        this.E0.g();
    }

    public final CharSequence y0(int i10) {
        CharSequence[] charSequenceArr = this.N0;
        if (charSequenceArr[i10] == null) {
            charSequenceArr[i10] = new SpannableString("l");
            ca0 ca0Var = new ca0(AndroidUtilities.dp(i10 == 0 ? 100.0f : 50.0f), i10 == 0 ? this.u0 : this.v0);
            ca0Var.a(org.telegram.ui.ActionBar.h6.m1(0.45f, -1), org.telegram.ui.ActionBar.h6.m1(0.2f, -1));
            CharSequence charSequence = charSequenceArr[i10];
            ((SpannableString) charSequence).setSpan(ca0Var, 0, charSequence.length(), 33);
        }
        return charSequenceArr[i10];
    }
}
