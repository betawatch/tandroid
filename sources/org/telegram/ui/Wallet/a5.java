package org.telegram.ui.Wallet;

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
import org.telegram.messenger.sk;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.a71;
import org.telegram.ui.Components.br;
import org.telegram.ui.Components.c71;
import org.telegram.ui.Components.d71;
import org.telegram.ui.Components.da0;
import org.telegram.ui.Components.es;
import org.telegram.ui.Components.f10;
import org.telegram.ui.Components.i71;
import org.telegram.ui.Components.ia0;
import org.telegram.ui.Components.k91;
import org.telegram.ui.Components.kc0;
import org.telegram.ui.Components.l80;
import org.telegram.ui.Components.l91;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.o01;
import org.telegram.ui.Components.q11;
import org.telegram.ui.Components.r11;
import org.telegram.ui.Components.z9;
import org.telegram.ui.Components.zt;
import org.telegram.ui.PasscodeActivity;
import org.telegram.ui.bz0;
import org.telegram.ui.jd0;
import org.telegram.ui.ju;
import org.telegram.ui.mt;
import org.telegram.ui.oh1;
import org.telegram.ui.su0;
import org.telegram.ui.wg1;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final class a5 extends d71 implements NotificationCenter.NotificationCenterDelegate {
    public static Typeface I0;
    public c0 A0;
    public ah.v E;
    public SpannableString E0;
    public boolean F;
    public boolean F0;
    public boolean G;
    public boolean G0;
    public i H0;
    public ah.x S;
    public j4 T;
    public FrameLayout U;
    public TextView V;
    public FrameLayout W;
    public TextView X;
    public FrameLayout Y;
    public TextView Z;
    public da0 a0;
    public k4 b0;
    public boolean c0;
    public n4 d;
    public FrameLayout d0;
    public k4 e;
    public FrameLayout e0;
    public int f;
    public boolean g0;
    public o4 h;
    public k91 h0;
    public y3 i0;
    public float j0;
    public ValueAnimator k0;
    public LinearLayout l0;
    public boolean m0;
    public int n;
    public di.h1 n0;
    public w4 o0;
    public LinearLayout q0;
    public boolean r;
    public org.telegram.ui.Components.s6 r0;
    public org.telegram.ui.Components.s6 s0;
    public h5 t0;
    public q4 u0;
    public float v0;
    public LinearLayout w0;
    public FrameLayout x;
    public di.d x0;
    public View y;
    public di.d y0;
    public j0 z0;
    public final org.telegram.ui.Cells.l7 s = new org.telegram.ui.Cells.l7(this, 27);
    public final l3 v = new zt() { // from class: org.telegram.ui.Wallet.l3
        @Override // org.telegram.ui.Components.zt
        public final void a(int i10, boolean z10) {
            c71 c71Var;
            a5 a5Var = a5.this;
            org.telegram.ui.Cells.l7 l7Var = a5Var.s;
            if ((i10 == 1 || i10 == 3) && (c71Var = a5Var.a) != null) {
                a5Var.r = z10;
                c71Var.removeCallbacks(l7Var);
                l7Var.run();
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
    public final i71[] p0 = new i71[2];
    public final g3 B0 = new g3(this, 4);
    public final CharSequence[] C0 = new CharSequence[2];
    public final HashSet D0 = new HashSet();

    /* JADX WARN: Multi-variable type inference failed */
    public static void Y(final a5 a5Var, Context context, View view) {
        k0 v = k0.v(a5Var.currentAccount);
        final l80 I = l80.I(a5Var, view);
        I.a0(0.0f, -AndroidUtilities.dp(48.0f));
        final int i10 = 0;
        I.s = 0;
        I.V(5);
        l80 J = I.J();
        J.c(R.drawable.ic_ab_back, LocaleController.getString(R.string.WalletBack), new su0(I, 26), false);
        J.k();
        ScrollView scrollView = new ScrollView(context);
        LinearLayout linearLayout = new LinearLayout(context);
        final int i11 = 1;
        linearLayout.setOrientation(1);
        scrollView.addView(linearLayout);
        m6 m6Var = new m6(a5Var, linearLayout, v, I, 9);
        J.r(scrollView, w7.z5.n(-1, 350));
        I.c(R.drawable.wallet_globe, LocaleController.getString(R.string.WalletCurrency), new l(m6Var, I, J, 8), false);
        org.telegram.ui.ActionBar.e1 y3 = I.y();
        f fVar = v.h;
        String i12 = fVar.i();
        boolean isEmpty = TextUtils.isEmpty(i12);
        String str = i12;
        if (isEmpty) {
            y3.setSubtext("USD");
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.Loading));
            spannableStringBuilder.setSpan(new ia0(AndroidUtilities.dp(75.0f), y3.b), 0, spannableStringBuilder.length(), 33);
            str = spannableStringBuilder;
        }
        y3.setSubtext(str);
        m6 m6Var2 = new m6(v, new boolean[]{fVar.f() != null}, y3, m6Var, 10);
        a5Var.D0.add(m6Var2);
        m6Var.run();
        I.c(R.drawable.wallet_lock, LocaleController.getString(R.string.Passcode), new Runnable(a5Var) { // from class: org.telegram.ui.Wallet.q3
            public final /* synthetic */ a5 b;

            {
                this.b = a5Var;
            }

            @Override // java.lang.Runnable
            public final void run() {
                n4 n4Var;
                switch (i10) {
                    case 0:
                        a5 a5Var2 = this.b;
                        a5Var2.getClass();
                        I.u();
                        a5Var2.presentFragment(PasscodeActivity.e0());
                        break;
                    case 1:
                        a5 a5Var3 = this.b;
                        a5Var3.getClass();
                        I.u();
                        a5Var3.presentFragment(new l7());
                        break;
                    case 2:
                        a5 a5Var4 = this.b;
                        a5Var4.getClass();
                        I.u();
                        a5Var4.presentFragment(new c9());
                        break;
                    case 3:
                        I.u();
                        a5 a5Var5 = this.b;
                        a5.t0(a5Var5.getParentActivity(), a5Var5.getResourceProvider());
                        break;
                    default:
                        I.u();
                        a5 a5Var6 = this.b;
                        boolean z10 = a5Var6.w;
                        boolean z11 = !z10;
                        if (z10 != z11 && (n4Var = a5Var6.d) != null) {
                            a5Var6.w = z11;
                            n4Var.setUse2D(z11);
                            a5Var6.e.requestLayout();
                            a5Var6.d.post(new g3(a5Var6, 11));
                            break;
                        }
                        break;
                }
            }
        }, false);
        I.c(R.drawable.wallet_key, LocaleController.getString(R.string.WalletKeysAndBackup), new Runnable(a5Var) { // from class: org.telegram.ui.Wallet.q3
            public final /* synthetic */ a5 b;

            {
                this.b = a5Var;
            }

            @Override // java.lang.Runnable
            public final void run() {
                n4 n4Var;
                switch (i11) {
                    case 0:
                        a5 a5Var2 = this.b;
                        a5Var2.getClass();
                        I.u();
                        a5Var2.presentFragment(PasscodeActivity.e0());
                        break;
                    case 1:
                        a5 a5Var3 = this.b;
                        a5Var3.getClass();
                        I.u();
                        a5Var3.presentFragment(new l7());
                        break;
                    case 2:
                        a5 a5Var4 = this.b;
                        a5Var4.getClass();
                        I.u();
                        a5Var4.presentFragment(new c9());
                        break;
                    case 3:
                        I.u();
                        a5 a5Var5 = this.b;
                        a5.t0(a5Var5.getParentActivity(), a5Var5.getResourceProvider());
                        break;
                    default:
                        I.u();
                        a5 a5Var6 = this.b;
                        boolean z10 = a5Var6.w;
                        boolean z11 = !z10;
                        if (z10 != z11 && (n4Var = a5Var6.d) != null) {
                            a5Var6.w = z11;
                            n4Var.setUse2D(z11);
                            a5Var6.e.requestLayout();
                            a5Var6.d.post(new g3(a5Var6, 11));
                            break;
                        }
                        break;
                }
            }
        }, false);
        final int i13 = 2;
        I.l(R.drawable.wallet_apps, LocaleController.getString(R.string.WalletConnectedApps), new Runnable(a5Var) { // from class: org.telegram.ui.Wallet.q3
            public final /* synthetic */ a5 b;

            {
                this.b = a5Var;
            }

            @Override // java.lang.Runnable
            public final void run() {
                n4 n4Var;
                switch (i13) {
                    case 0:
                        a5 a5Var2 = this.b;
                        a5Var2.getClass();
                        I.u();
                        a5Var2.presentFragment(PasscodeActivity.e0());
                        break;
                    case 1:
                        a5 a5Var3 = this.b;
                        a5Var3.getClass();
                        I.u();
                        a5Var3.presentFragment(new l7());
                        break;
                    case 2:
                        a5 a5Var4 = this.b;
                        a5Var4.getClass();
                        I.u();
                        a5Var4.presentFragment(new c9());
                        break;
                    case 3:
                        I.u();
                        a5 a5Var5 = this.b;
                        a5.t0(a5Var5.getParentActivity(), a5Var5.getResourceProvider());
                        break;
                    default:
                        I.u();
                        a5 a5Var6 = this.b;
                        boolean z10 = a5Var6.w;
                        boolean z11 = !z10;
                        if (z10 != z11 && (n4Var = a5Var6.d) != null) {
                            a5Var6.w = z11;
                            n4Var.setUse2D(z11);
                            a5Var6.e.requestLayout();
                            a5Var6.d.post(new g3(a5Var6, 11));
                            break;
                        }
                        break;
                }
            }
        }, true ^ v.g.d.isEmpty());
        I.k();
        final int i14 = 3;
        I.c(R.drawable.wallet_help, LocaleController.getString(R.string.WalletWhatIsWallet), new Runnable(a5Var) { // from class: org.telegram.ui.Wallet.q3
            public final /* synthetic */ a5 b;

            {
                this.b = a5Var;
            }

            @Override // java.lang.Runnable
            public final void run() {
                n4 n4Var;
                switch (i14) {
                    case 0:
                        a5 a5Var2 = this.b;
                        a5Var2.getClass();
                        I.u();
                        a5Var2.presentFragment(PasscodeActivity.e0());
                        break;
                    case 1:
                        a5 a5Var3 = this.b;
                        a5Var3.getClass();
                        I.u();
                        a5Var3.presentFragment(new l7());
                        break;
                    case 2:
                        a5 a5Var4 = this.b;
                        a5Var4.getClass();
                        I.u();
                        a5Var4.presentFragment(new c9());
                        break;
                    case 3:
                        I.u();
                        a5 a5Var5 = this.b;
                        a5.t0(a5Var5.getParentActivity(), a5Var5.getResourceProvider());
                        break;
                    default:
                        I.u();
                        a5 a5Var6 = this.b;
                        boolean z10 = a5Var6.w;
                        boolean z11 = !z10;
                        if (z10 != z11 && (n4Var = a5Var6.d) != null) {
                            a5Var6.w = z11;
                            n4Var.setUse2D(z11);
                            a5Var6.e.requestLayout();
                            a5Var6.d.post(new g3(a5Var6, 11));
                            break;
                        }
                        break;
                }
            }
        }, false);
        if (BuildVars.DEBUG_VERSION) {
            I.k();
            final int i15 = 4;
            I.c(0, LocaleController.getString(a5Var.w ? R.string.WalletCard3D : R.string.WalletCard2D), new Runnable(a5Var) { // from class: org.telegram.ui.Wallet.q3
                public final /* synthetic */ a5 b;

                {
                    this.b = a5Var;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    n4 n4Var;
                    switch (i15) {
                        case 0:
                            a5 a5Var2 = this.b;
                            a5Var2.getClass();
                            I.u();
                            a5Var2.presentFragment(PasscodeActivity.e0());
                            break;
                        case 1:
                            a5 a5Var3 = this.b;
                            a5Var3.getClass();
                            I.u();
                            a5Var3.presentFragment(new l7());
                            break;
                        case 2:
                            a5 a5Var4 = this.b;
                            a5Var4.getClass();
                            I.u();
                            a5Var4.presentFragment(new c9());
                            break;
                        case 3:
                            I.u();
                            a5 a5Var5 = this.b;
                            a5.t0(a5Var5.getParentActivity(), a5Var5.getResourceProvider());
                            break;
                        default:
                            I.u();
                            a5 a5Var6 = this.b;
                            boolean z10 = a5Var6.w;
                            boolean z11 = !z10;
                            if (z10 != z11 && (n4Var = a5Var6.d) != null) {
                                a5Var6.w = z11;
                                n4Var.setUse2D(z11);
                                a5Var6.e.requestLayout();
                                a5Var6.d.post(new g3(a5Var6, 11));
                                break;
                            }
                            break;
                    }
                }
            }, false);
        }
        I.p = new wg1(14, a5Var, m6Var2);
        I.Z();
    }

    public static void Z(a5 a5Var, String str, k0 k0Var, l80 l80Var, LinearLayout linearLayout, TL_wallet.currencyRate currencyrate) {
        if (currencyrate == null) {
            return;
        }
        org.telegram.ui.ActionBar.e1 e1Var = new org.telegram.ui.ActionBar.e1(2, a5Var.getParentActivity(), a5Var.resourceProvider, false, false);
        e1Var.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
        e1Var.setText(currencyrate.currency);
        e1Var.setSubtext(!TextUtils.isEmpty(currencyrate.translatedTitle) ? currencyrate.translatedTitle : currencyrate.title);
        boolean equals = TextUtils.equals(str, currencyrate.currency);
        e1Var.b.setPadding(0, 0, AndroidUtilities.dp(equals ? 42.0f : 0.0f), 0);
        e1Var.setChecked(equals);
        e1Var.setOnClickListener(new m1(k0Var, currencyrate, l80Var, 1));
        linearLayout.addView(e1Var, w7.z5.n(200, -2));
    }

    public static void a0(a5 a5Var) {
        k0 v = k0.v(a5Var.currentAccount);
        di.d dVar = a5Var.y0;
        if (dVar.N) {
            return;
        }
        dVar.setLoading(true);
        boolean z10 = false;
        v.h0(new e2.o0(v, new mt(29, a5Var, v), z10, z10, 3));
    }

    public static void b0(a5 a5Var) {
        org.telegram.ui.ActionBar.k kVar;
        if (a5Var.E == null || (kVar = a5Var.actionBar) == null || !(kVar.getParent() instanceof ViewGroup)) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) a5Var.actionBar.getParent();
        viewGroup.setClipChildren(false);
        viewGroup.setClipToPadding(false);
        if (a5Var.E.getParent() != a5Var.actionBar) {
            AndroidUtilities.removeFromParent(a5Var.E);
            a5Var.actionBar.addView(a5Var.E, w7.z5.d(-1.0f, -1));
        }
        a5Var.E.bringToFront();
        a5Var.actionBar.bringToFront();
        a5Var.E.post(new g3(a5Var, 11));
    }

    public static void c0(a5 a5Var) {
        u0(a5Var.getParentActivity(), a5Var.currentAccount, a5Var.getResourceProvider());
    }

    public static void d0(a5 a5Var, LinearLayout linearLayout, k0 k0Var, l80 l80Var) {
        TL_wallet.currencyRate currencyrate;
        a5 a5Var2;
        ArrayList<TL_wallet.currencyRate> arrayList;
        LinearLayout linearLayout2 = linearLayout;
        k0 k0Var2 = k0Var;
        linearLayout2.removeAllViews();
        String g10 = k0Var2.h.g();
        TL_wallet.currencyRates f7 = k0Var2.h.f();
        if (f7 == null) {
            for (int i10 = 0; i10 < 3; i10++) {
                f10 f10Var = new f10(a5Var.getParentActivity(), a5Var.getResourceProvider());
                f10Var.setIsSingleCell(true);
                f10Var.setViewType(31);
                linearLayout2.addView(f10Var, w7.z5.n(200, -2));
            }
            return;
        }
        f fVar = k0Var2.h;
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
                Z(a5Var, g10, k0Var2, l80Var, linearLayout2, currencyrate7);
            }
            i13++;
            k0Var2 = k0Var;
        }
        if (hashSet.isEmpty() || f7.rates.isEmpty()) {
            a5Var2 = a5Var;
        } else {
            a5Var2 = a5Var;
            linearLayout2.addView(new org.telegram.ui.ActionBar.j1(a5Var.getParentActivity(), a5Var2.resourceProvider), w7.z5.n(-1, 8));
        }
        int i14 = 0;
        while (i14 < f7.rates.size()) {
            TL_wallet.currencyRate currencyrate8 = f7.rates.get(i14);
            if (currencyrate8 != null && !hashSet.contains(currencyrate8.currency)) {
                Z(a5Var2, g10, k0Var, l80Var, linearLayout2, currencyrate8);
            }
            i14++;
            a5Var2 = a5Var;
            linearLayout2 = linearLayout;
        }
    }

    public static void e0(a5 a5Var) {
        pf.d.r(a5Var.getParentActivity(), k0.v(a5Var.currentAccount).j);
    }

    public static void f0(a5 a5Var) {
        u0(a5Var.getParentActivity(), a5Var.currentAccount, a5Var.getResourceProvider());
    }

    public static Typeface h0(Context context) {
        if (I0 == null) {
            if (Build.VERSION.SDK_INT >= 26) {
                I0 = new Typeface.Builder(context.getAssets(), "fonts/rmono_var.ttf").setFontVariationSettings("'wght' 500").setWeight(500).build();
            } else {
                I0 = AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MONO);
            }
        }
        return I0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:112:0x03ce  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0401 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0413  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x05d2  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0658  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x06a1  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x063e  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x056f  */
    /* JADX WARN: Type inference failed for: r10v14, types: [android.view.View, android.view.ViewGroup, android.widget.FrameLayout] */
    /* JADX WARN: Type inference failed for: r13v6, types: [boolean] */
    /* JADX WARN: Type inference failed for: r15v16, types: [android.view.View, android.widget.TextView, org.telegram.ui.Components.EditTextBoldCursor, org.telegram.ui.Components.pu, org.telegram.ui.Wallet.f4] */
    /* JADX WARN: Type inference failed for: r2v1, types: [android.view.View, android.view.ViewGroup, android.widget.LinearLayout] */
    /* JADX WARN: Type inference failed for: r2v16, types: [org.telegram.ui.Wallet.f4] */
    /* JADX WARN: Type inference failed for: r5v0, types: [android.view.ViewGroup, android.widget.LinearLayout] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static LinearLayout i0(final Context context, int i10, TL_wallet.walletTransaction wallettransaction, Utilities.Callback3 callback3, Utilities.Callback2 callback2, byte[] bArr, Runnable runnable, org.telegram.ui.ActionBar.c6 c6Var, j2[] j2VarArr) {
        int i11;
        e4 e4Var;
        String r10;
        String str;
        h4 h4Var;
        int i12;
        ImageView imageView;
        TextView textView;
        e4 e4Var2;
        int i13;
        float f7;
        ImageView imageView2;
        ImageView imageView3;
        SpannableString[] spannableStringArr;
        o01 o01Var;
        h4 h4Var2;
        LinearLayout linearLayout;
        String[] strArr;
        TL_wallet.walletTransaction wallettransaction2;
        boolean[] zArr;
        int i14;
        TextView[] textViewArr;
        h4 h4Var3;
        int i15;
        h4 h4Var4;
        final j2[] j2VarArr2;
        Object q6;
        int i16;
        final FrameLayout frameLayout;
        final org.telegram.ui.ActionBar.c6 c6Var2 = c6Var;
        boolean z10 = callback3 != null;
        final ?? e = sk.e(context, 1);
        FrameLayout frameLayout2 = new FrameLayout(context);
        e.addView(frameLayout2, w7.z5.n(-1, 56));
        int i17 = org.telegram.ui.ActionBar.g6.G6;
        int w02 = org.telegram.ui.ActionBar.g6.w0(i17, c6Var2);
        int w03 = org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.i6, c6Var2);
        ImageView imageView4 = new ImageView(context);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView4.setScaleType(scaleType);
        imageView4.setImageResource(R.drawable.ic_ab_close);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView4.setColorFilter(new PorterDuffColorFilter(w02, mode));
        imageView4.setBackground(org.telegram.ui.ActionBar.g6.g0(w03, 1, -1));
        imageView4.setContentDescription(LocaleController.getString(R.string.Close));
        frameLayout2.addView(imageView4, w7.z5.a(48.0f, 4.0f, -2.0f, 0.0f, 0.0f, 48, 19));
        ImageView imageView5 = new ImageView(context);
        imageView5.setScaleType(scaleType);
        imageView5.setImageResource(R.drawable.ic_ab_other);
        imageView5.setColorFilter(new PorterDuffColorFilter(w02, mode));
        imageView5.setBackground(org.telegram.ui.ActionBar.g6.g0(w03, 1, -1));
        imageView5.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        imageView5.setVisibility(callback3 != null ? 8 : 0);
        frameLayout2.addView(imageView5, w7.z5.a(48.0f, 0.0f, 2.0f, 4.0f, 0.0f, 44, 21));
        ?? linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        linearLayout2.setGravity(1);
        e.addView(linearLayout2, w7.z5.k(14.0f, wallettransaction.key_change ? -20.0f : -40.0f, 14.0f, 24.0f, -1, -2));
        c6 c6Var3 = new c6(120, context, false);
        c6Var3.setTag(c6.class);
        linearLayout2.addView(c6Var3, w7.z5.t(120, 120, 1, 0, 0, 0, -8));
        e4 e4Var3 = new e4(context);
        e4Var3.setSingleLine(true);
        e4Var3.setGravity(17);
        e4Var3.setIncludeFontPadding(false);
        e4Var3.setTextSize(1, 40.0f);
        e4Var3.setTypeface(AndroidUtilities.bold());
        linearLayout2.addView(e4Var3, w7.z5.q(-1, 50, 1));
        TextView textView2 = new TextView(context);
        textView2.setGravity(17);
        textView2.setIncludeFontPadding(false);
        textView2.setTextSize(1, 14.0f);
        int i18 = org.telegram.ui.ActionBar.g6.z6;
        textView2.setTextColor(org.telegram.ui.ActionBar.g6.w0(i18, c6Var2));
        linearLayout2.addView(textView2, w7.z5.t(-1, 20, 1, 0, 3, 0, 0));
        if (wallettransaction.key_change) {
            linearLayout2.removeAllViews();
            FrameLayout frameLayout3 = new FrameLayout(context);
            frameLayout3.setBackground(org.telegram.ui.ActionBar.g6.L(AndroidUtilities.dp(76.0f), -7956054, -9534569));
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
            e4Var = e4Var3;
            i11 = 44;
        } else {
            i11 = 44;
            if (wallettransaction.nft != null) {
                linearLayout2.removeAllViews();
                TL_wallet.nftItem nftitem = wallettransaction.nft;
                z9 z9Var = new z9(context);
                z9Var.setRoundRadius(AndroidUtilities.dp(12.0f));
                z9Var.setContentDescription(nftitem.name);
                e4Var = e4Var3;
                Drawable mutate = context.getResources().getDrawable(R.drawable.wallet_nft_placeholder).mutate();
                mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(i18, c6Var2), mode));
                ImageLocation b10 = c.b(nftitem, false);
                if (b10 != null) {
                    z9Var.h(b10, "120_120", mutate, nftitem);
                } else {
                    z9Var.setImageDrawable(mutate);
                }
                linearLayout2.addView(z9Var, w7.z5.q(120, 120, 1));
                TextView textView4 = new TextView(context);
                textView4.setText(TextUtils.isEmpty(nftitem.name) ? LocaleController.getString(R.string.WalletCollectible) : nftitem.name);
                textView4.setTextColor(w02);
                textView4.setTextSize(1, 17.0f);
                textView4.setTypeface(AndroidUtilities.bold());
                textView4.setGravity(17);
                linearLayout2.addView(textView4, w7.z5.k(12.0f, 16.0f, 12.0f, 0.0f, -1, -2));
            } else {
                e4Var = e4Var3;
            }
        }
        if (wallettransaction.incoming) {
            TL_wallet.WalletTransactionPeer walletTransactionPeer = wallettransaction.peer;
            if (walletTransactionPeer == null) {
                str = null;
                if (callback3 != null) {
                    if (wallettransaction.comment_encrypted || wallettransaction.comment_encrypted_preparing) {
                        f7 = 11.0f;
                        if (wallettransaction.comment_encrypted_preparing || !TextUtils.isEmpty(str)) {
                            wh.n nVar = new wh.n(context, c6Var2, false);
                            nVar.r = false;
                            nVar.setTextSize(1, 15.0f);
                            nVar.setTextColor(org.telegram.ui.ActionBar.g6.w0(i17, c6Var2));
                            StringBuilder sb2 = new StringBuilder(25);
                            int i19 = 0;
                            for (int i20 = 25; i19 < i20; i20 = 25) {
                                sb2.append("a");
                                i19++;
                            }
                            SpannableString spannableString = new SpannableString(sb2.toString());
                            q11 q11Var = new q11();
                            q11Var.a |= 256;
                            spannableString.setSpan(new r11(q11Var, 0), 0, spannableString.length(), 33);
                            nVar.setText(spannableString);
                            h4Var = null;
                            org.telegram.ui.ActionBar.d5 d5Var = new org.telegram.ui.ActionBar.d5(0, false, false, null);
                            d5Var.x = false;
                            d5Var.w = Integer.valueOf(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.jl, c6Var2));
                            nVar.setBackground(d5Var);
                            nVar.setPadding(AndroidUtilities.dp(19.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(15.0f), AndroidUtilities.dp(11.0f));
                            linearLayout2.addView(nVar, w7.z5.t(-2, -2, 1, 32, 15, 32, 0));
                            w7.b6.a(nVar);
                            i13 = 1;
                            i12 = w02;
                            textView = textView2;
                            e4Var2 = e4Var;
                            imageView2 = imageView5;
                            imageView = imageView4;
                            nVar.setOnClickListener(new ju(new boolean[]{false}, j2VarArr, c6Var2, nVar, wallettransaction, i10, str));
                            SpannableString[] spannableStringArr2 = new SpannableString[i13];
                            TextView[] textViewArr2 = new TextView[i13];
                            o01 o01Var2 = new o01(context, c6Var2);
                            e.addView(o01Var2, w7.z5.k(14.0f, 0.0f, 14.0f, 0.0f, -1, -2));
                            final String[] strArr2 = {wallettransaction.comment};
                            final boolean[] zArr2 = {(wallettransaction.comment_encrypted || (z10 && bArr == null)) ? false : true};
                            if (callback3 != null) {
                                ?? frameLayout4 = new FrameLayout(context);
                                frameLayout4.setBackground(org.telegram.ui.ActionBar.g6.d0(AndroidUtilities.dp(22.0f), AndroidUtilities.dp(22.0f), org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.a7, c6Var2)));
                                final wg1 wg1Var = new wg1(12, textViewArr2, spannableStringArr2);
                                final Runnable[] runnableArr = new Runnable[1];
                                ImageView imageView7 = imageView;
                                final org.telegram.messenger.b6 b6Var = new org.telegram.messenger.b6(runnableArr, textViewArr2, i10, c6Var2, wallettransaction, strArr2, zArr2, bArr);
                                wallettransaction2 = wallettransaction;
                                textViewArr = textViewArr2;
                                ?? f4Var = new f4(context, c6Var2);
                                f4Var.setHint(LocaleController.getString(R.string.WalletOptionalComment));
                                f4Var.setText(strArr2[0]);
                                spannableStringArr = spannableStringArr2;
                                o01Var = o01Var2;
                                f4Var.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(f7), AndroidUtilities.dp(64.0f), AndroidUtilities.dp(12.0f));
                                int i21 = org.telegram.ui.ActionBar.g6.G6;
                                f4Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(i21, c6Var2));
                                f4Var.setHintTextColor(org.telegram.ui.ActionBar.g6.m1(0.65f, org.telegram.ui.ActionBar.g6.w0(i21, c6Var2)));
                                f4Var.setMaxLines(4);
                                frameLayout4.addView(f4Var, w7.z5.a(-2.0f, 0.0f, 0.0f, (wallettransaction2.nft != null || bArr == null) ? 0.0f : 44.0f, 0.0f, -1, 119));
                                f4Var.addTextChangedListener(new g4(strArr2, wg1Var, runnableArr, b6Var));
                                if (wallettransaction2.nft != null || bArr == null) {
                                    frameLayout = frameLayout4;
                                    c6Var2 = c6Var2;
                                    linearLayout = e;
                                    strArr = strArr2;
                                    zArr = zArr2;
                                    h4Var3 = f4Var;
                                    imageView3 = imageView7;
                                    h4Var2 = null;
                                    i14 = 0;
                                } else {
                                    FrameLayout frameLayout5 = new FrameLayout(context);
                                    w7.b6.a(frameLayout5);
                                    final ImageView imageView8 = new ImageView(context);
                                    frameLayout5.addView(imageView8, w7.z5.d(-1.0f, -1));
                                    imageView8.setScaleType(ImageView.ScaleType.CENTER);
                                    i14 = 0;
                                    imageView8.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(zArr2[0] ? org.telegram.ui.ActionBar.g6.Oh : org.telegram.ui.ActionBar.g6.z6, c6Var2), PorterDuff.Mode.SRC_IN));
                                    imageView8.setImageResource(zArr2[0] ? R.drawable.wallet_comment_locked : R.drawable.wallet_comment_unlocked);
                                    imageView8.setBackground(org.telegram.ui.ActionBar.g6.g0(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.i6, c6Var2), 1, -1));
                                    final di.d4[] d4VarArr = new di.d4[1];
                                    frameLayout = frameLayout4;
                                    c6Var2 = c6Var2;
                                    h4Var3 = f4Var;
                                    int i22 = i11;
                                    imageView3 = imageView7;
                                    h4Var2 = null;
                                    zArr = zArr2;
                                    linearLayout = e;
                                    strArr = strArr2;
                                    frameLayout5.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Wallet.n3
                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view) {
                                            final boolean[] zArr3 = zArr2;
                                            zArr3[0] = !zArr3[0];
                                            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
                                            final AtomicBoolean atomicBoolean = new AtomicBoolean();
                                            final ImageView imageView9 = imageView8;
                                            final org.telegram.ui.ActionBar.c6 c6Var4 = c6Var2;
                                            duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Wallet.s3
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
                                                        imageView10.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(zArr4[0] ? org.telegram.ui.ActionBar.g6.Oh : org.telegram.ui.ActionBar.g6.z6, c6Var4), PorterDuff.Mode.SRC_IN));
                                                        imageView10.setImageResource(zArr4[0] ? R.drawable.wallet_comment_locked : R.drawable.wallet_comment_unlocked);
                                                    }
                                                }
                                            });
                                            duration.setInterpolator(es.h);
                                            duration.setDuration(420L);
                                            duration.start();
                                            di.d4[] d4VarArr2 = d4VarArr;
                                            di.d4 d4Var = d4VarArr2[0];
                                            if (d4Var != null) {
                                                d4Var.e(true);
                                                d4VarArr2[0] = null;
                                            }
                                            LinearLayout linearLayout3 = e;
                                            if (linearLayout3.getParent() instanceof FrameLayout) {
                                                FrameLayout frameLayout6 = (FrameLayout) linearLayout3.getParent();
                                                di.d4 d4Var2 = new di.d4(context, 3);
                                                d4VarArr2[0] = d4Var2;
                                                d4Var2.r();
                                                d4Var2.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
                                                d4Var2.s(LocaleController.getString(zArr3[0] ? R.string.WalletPrivateCommentInfo : R.string.WalletPublicCommentInfo));
                                                d4Var2.setTranslationY(-(AndroidUtilities.dp(44.0f) + (linearLayout3.getHeight() - frameLayout.getBottom())));
                                                d4Var2.m(1.0f, -AndroidUtilities.dp(26.0f));
                                                d4Var2.q(20.0f);
                                                float dp = AndroidUtilities.dp(12.0f);
                                                float dp2 = AndroidUtilities.dp(4.0f);
                                                int m12 = org.telegram.ui.ActionBar.g6.m1(0.25f, -16777216);
                                                d4Var2.i0 = dp;
                                                d4Var2.j0 = dp2;
                                                d4Var2.k0 = m12;
                                                d4Var2.F.setShadowLayer(dp, 0.0f, dp2, m12);
                                                frameLayout6.addView(d4Var2, w7.z5.e(-1, 200, 87));
                                                d4Var2.u();
                                                d4Var2.l0 = new n(d4Var2, 6);
                                            }
                                            if (TextUtils.isEmpty(strArr2[0])) {
                                                return;
                                            }
                                            wg1Var.run();
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
                                    frameLayout.addView(frameLayout5, w7.z5.e(i22, i22, 85));
                                }
                                linearLayout.addView(frameLayout, w7.z5.k(14.0f, 12.0f, 14.0f, 8.0f, -1, -2));
                            } else {
                                imageView3 = imageView;
                                spannableStringArr = spannableStringArr2;
                                o01Var = o01Var2;
                                h4Var2 = h4Var;
                                linearLayout = e;
                                strArr = strArr2;
                                wallettransaction2 = wallettransaction;
                                zArr = zArr2;
                                i14 = 0;
                                textViewArr = textViewArr2;
                                h4Var3 = h4Var2;
                            }
                            di.d f10 = sk.f(24, context, c6Var2, true);
                            f10.setText(LocaleController.getString(R.string.OK));
                            linearLayout.addView(f10, w7.z5.k(14.0f, 14.0f, 14.0f, 14.0f, -1, 48));
                            TL_wallet.walletTransaction[] wallettransactionArr = new TL_wallet.walletTransaction[1];
                            wallettransactionArr[i14] = wallettransaction2;
                            o3 o3Var = new o3(linearLayout, e4Var2, c6Var2, i10, textView, j2VarArr, o01Var, callback3, context, textViewArr, i12, spannableStringArr);
                            LinearLayout linearLayout3 = linearLayout;
                            linearLayout3.setTag(new wg1(13, o3Var, wallettransactionArr));
                            o3Var.run(wallettransaction2);
                            if (z10) {
                                i15 = i10;
                                h4Var4 = h4Var2;
                            } else {
                                i15 = i10;
                                h4 h4Var5 = new h4(i15, wallettransactionArr, o3Var);
                                if (wallettransaction2.preview) {
                                    k0 v = k0.v(i15);
                                    String str2 = wallettransaction2.id;
                                    p pVar = new p(wallettransaction2, o3Var, wallettransactionArr, 4);
                                    HashMap hashMap = v.G;
                                    j0 j0Var = v.n;
                                    if (j0Var != null) {
                                        ArrayList arrayList = j0Var.c;
                                        int size = arrayList.size();
                                        int i23 = i14;
                                        while (i23 < size) {
                                            Object obj = arrayList.get(i23);
                                            i23++;
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
                                        ConnectionsManager.getInstance(v.a).sendRequestTyped(gettransactionsbyids, new org.telegram.messenger.a(), new j(v, (Object) pVar, (Object) str2, 2));
                                    }
                                }
                                h4Var4 = h4Var5;
                            }
                            String[] strArr3 = strArr;
                            boolean[] zArr3 = zArr;
                            linearLayout3.addOnAttachStateChangeListener(new i4(o3Var, wallettransactionArr, h4Var4, i15, callback2, j2VarArr, strArr3, zArr3));
                            if (callback3 != null) {
                                int i24 = R.string.WalletSendAmount;
                                TL_wallet.nftItem nftitem2 = wallettransaction2.nft;
                                if (nftitem2 != null) {
                                    q6 = TextUtils.isEmpty(nftitem2.name) ? LocaleController.getString(R.string.WalletCollectible) : wallettransaction2.nft.name;
                                    i16 = i14;
                                } else {
                                    long abs = Math.abs(wallettransaction2.amount);
                                    ?? r13 = i14;
                                    q6 = k0.q(abs, r13);
                                    i16 = r13;
                                }
                                Object[] objArr = new Object[1];
                                objArr[i16] = q6;
                                f10.setText(LocaleController.formatSpannable(i24, objArr));
                                j2VarArr2 = j2VarArr;
                                f10.setOnClickListener(new org.telegram.messenger.video.g(f10, h4Var3, callback3, strArr3, zArr3, j2VarArr2, c6Var));
                            } else {
                                j2VarArr2 = j2VarArr;
                                if (runnable != null) {
                                    f10.setText(LocaleController.getString(R.string.WalletOpenMyWallet));
                                    f10.setOnClickListener(new bz0(14, runnable, j2VarArr2));
                                } else {
                                    final int i25 = 0;
                                    f10.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Wallet.m3
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
                                }
                            }
                            final int i26 = 1;
                            imageView3.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Wallet.m3
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    switch (i26) {
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
                            imageView9.setOnClickListener(new fi.m3(j2VarArr2, i10, c6Var, imageView9, wallettransactionArr, context, 4));
                            return linearLayout3;
                        }
                    } else if (TextUtils.isEmpty(wallettransaction.comment)) {
                        f7 = 11.0f;
                    } else {
                        wh.n nVar2 = new wh.n(context);
                        nVar2.setTextSize(1, 15.0f);
                        nVar2.setTextColor(org.telegram.ui.ActionBar.g6.w0(i17, c6Var2));
                        f7 = 11.0f;
                        nVar2.setText(Emoji.replaceEmoji(wallettransaction.comment, nVar2.getPaint().getFontMetricsInt(), false));
                        nVar2.setTextIsSelectable(true);
                        org.telegram.ui.ActionBar.d5 d5Var2 = new org.telegram.ui.ActionBar.d5(0, false, false, null);
                        d5Var2.x = false;
                        d5Var2.w = Integer.valueOf(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.jl, c6Var2));
                        nVar2.setBackground(d5Var2);
                        nVar2.setPadding(AndroidUtilities.dp(19.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(15.0f), AndroidUtilities.dp(8.0f));
                        linearLayout2.addView(nVar2, w7.z5.t(-2, -2, 1, 32, 16, 32, 0));
                    }
                    h4Var = null;
                    i12 = w02;
                    imageView = imageView4;
                    textView = textView2;
                    e4Var2 = e4Var;
                    i13 = 1;
                } else {
                    h4Var = null;
                    i12 = w02;
                    imageView = imageView4;
                    textView = textView2;
                    e4Var2 = e4Var;
                    i13 = 1;
                    f7 = 11.0f;
                }
                imageView2 = imageView5;
                SpannableString[] spannableStringArr22 = new SpannableString[i13];
                TextView[] textViewArr22 = new TextView[i13];
                o01 o01Var22 = new o01(context, c6Var2);
                e.addView(o01Var22, w7.z5.k(14.0f, 0.0f, 14.0f, 0.0f, -1, -2));
                final String[] strArr22 = {wallettransaction.comment};
                final boolean[] zArr22 = {(wallettransaction.comment_encrypted || (z10 && bArr == null)) ? false : true};
                if (callback3 != null) {
                }
                di.d f102 = sk.f(24, context, c6Var2, true);
                f102.setText(LocaleController.getString(R.string.OK));
                linearLayout.addView(f102, w7.z5.k(14.0f, 14.0f, 14.0f, 14.0f, -1, 48));
                TL_wallet.walletTransaction[] wallettransactionArr2 = new TL_wallet.walletTransaction[1];
                wallettransactionArr2[i14] = wallettransaction2;
                o3 o3Var2 = new o3(linearLayout, e4Var2, c6Var2, i10, textView, j2VarArr, o01Var, callback3, context, textViewArr, i12, spannableStringArr);
                LinearLayout linearLayout32 = linearLayout;
                linearLayout32.setTag(new wg1(13, o3Var2, wallettransactionArr2));
                o3Var2.run(wallettransaction2);
                if (z10) {
                }
                String[] strArr32 = strArr;
                boolean[] zArr32 = zArr;
                linearLayout32.addOnAttachStateChangeListener(new i4(o3Var2, wallettransactionArr2, h4Var4, i15, callback2, j2VarArr, strArr32, zArr32));
                if (callback3 != null) {
                }
                final int i262 = 1;
                imageView3.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Wallet.m3
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i262) {
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
                imageView92.setOnClickListener(new fi.m3(j2VarArr2, i10, c6Var, imageView92, wallettransactionArr2, context, 4));
                return linearLayout32;
            }
            r10 = walletTransactionPeer.address;
        } else {
            r10 = k0.v(i10).r();
        }
        str = r10;
        if (callback3 != null) {
        }
        imageView2 = imageView5;
        SpannableString[] spannableStringArr222 = new SpannableString[i13];
        TextView[] textViewArr222 = new TextView[i13];
        o01 o01Var222 = new o01(context, c6Var2);
        e.addView(o01Var222, w7.z5.k(14.0f, 0.0f, 14.0f, 0.0f, -1, -2));
        final String[] strArr222 = {wallettransaction.comment};
        final boolean[] zArr222 = {(wallettransaction.comment_encrypted || (z10 && bArr == null)) ? false : true};
        if (callback3 != null) {
        }
        di.d f1022 = sk.f(24, context, c6Var2, true);
        f1022.setText(LocaleController.getString(R.string.OK));
        linearLayout.addView(f1022, w7.z5.k(14.0f, 14.0f, 14.0f, 14.0f, -1, 48));
        TL_wallet.walletTransaction[] wallettransactionArr22 = new TL_wallet.walletTransaction[1];
        wallettransactionArr22[i14] = wallettransaction2;
        o3 o3Var22 = new o3(linearLayout, e4Var2, c6Var2, i10, textView, j2VarArr, o01Var, callback3, context, textViewArr, i12, spannableStringArr);
        LinearLayout linearLayout322 = linearLayout;
        linearLayout322.setTag(new wg1(13, o3Var22, wallettransactionArr22));
        o3Var22.run(wallettransaction2);
        if (z10) {
        }
        String[] strArr322 = strArr;
        boolean[] zArr322 = zArr;
        linearLayout322.addOnAttachStateChangeListener(new i4(o3Var22, wallettransactionArr22, h4Var4, i15, callback2, j2VarArr, strArr322, zArr322));
        if (callback3 != null) {
        }
        final int i2622 = 1;
        imageView3.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Wallet.m3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i2622) {
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
        imageView922.setOnClickListener(new fi.m3(j2VarArr2, i10, c6Var, imageView922, wallettransactionArr22, context, 4));
        return linearLayout322;
    }

    public static String k0(String str) {
        StringBuilder sb2 = new StringBuilder((str.length() / 4) + str.length());
        for (int i10 = 0; i10 < str.length(); i10++) {
            if (i10 > 0 && i10 % 4 == 0) {
                sb2.append(' ');
            }
            sb2.append(str.charAt(i10));
        }
        return sb2.toString();
    }

    public static SpannableStringBuilder l0(int i10, long j10, org.telegram.ui.ActionBar.c6 c6Var) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("G ");
        br brVar = new br(R.drawable.wallet_gram_small, 2);
        brVar.recolorDrawable = false;
        brVar.setSize(AndroidUtilities.dp(16.0f));
        spannableStringBuilder.setSpan(brVar, 0, 1, 33);
        BigDecimal movePointLeft = new BigDecimal(j10).movePointLeft(9);
        spannableStringBuilder.append((CharSequence) (movePointLeft.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : movePointLeft.stripTrailingZeros()).toPlainString());
        CharSequence l4 = k0.v(i10).l(j10, true);
        if (!TextUtils.isEmpty(l4)) {
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) "  ~\u2009").append(l4);
            spannableStringBuilder.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.z6, c6Var)), length, spannableStringBuilder.length(), 33);
        }
        return spannableStringBuilder;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r10v2, types: [org.telegram.ui.Components.l91, org.telegram.ui.Wallet.b4] */
    /* JADX WARN: Type inference failed for: r10v4 */
    public static void s0(Context context, int i10, TL_wallet.walletTransaction wallettransaction, Utilities.Callback3 callback3, Utilities.Callback2 callback2, byte[] bArr, org.telegram.ui.Cells.p0 p0Var, org.telegram.ui.ActionBar.c6 c6Var) {
        View[] viewArr;
        ?? r10;
        TL_wallet.walletTransaction wallettransaction2;
        j2[] j2VarArr;
        Utilities.Callback2 callback22;
        LinearLayout linearLayout;
        if (context == null) {
            return;
        }
        j2[] j2VarArr2 = new j2[1];
        View[] viewArr2 = new View[1];
        j0 z10 = k0.v(i10).z();
        ArrayList arrayList = new ArrayList(z10.c);
        int i11 = 0;
        while (true) {
            if (i11 >= arrayList.size()) {
                i11 = -1;
                break;
            } else if (arrayList.get(i11) == wallettransaction || k0.d0(wallettransaction, (TL_wallet.walletTransaction) arrayList.get(i11))) {
                break;
            } else {
                i11++;
            }
        }
        if (callback3 == null && p0Var == null && i11 >= 0) {
            Rect rect = new Rect();
            context.getResources().getDrawable(R.drawable.sheet_shadow_round).getPadding(rect);
            viewArr = viewArr2;
            ?? b4Var = new b4(context, c6Var, z10, arrayList, i10, rect, viewArr);
            b4Var.setPosition(i11);
            j2VarArr = j2VarArr2;
            b4Var.setAdapter(new c4(arrayList, context, c6Var, rect, i10, j2VarArr));
            r10 = 0;
            wallettransaction2 = wallettransaction;
            linearLayout = b4Var;
            callback22 = callback2;
        } else {
            viewArr = viewArr2;
            r10 = 0;
            LinearLayout i02 = i0(context, i10, wallettransaction, callback3, callback2, bArr, p0Var, c6Var, j2VarArr2);
            wallettransaction2 = wallettransaction;
            j2VarArr = j2VarArr2;
            callback22 = callback2;
            linearLayout = i02;
        }
        d4 d4Var = new d4(context, linearLayout, c6Var, linearLayout, viewArr, context);
        j2VarArr[r10] = d4Var;
        if ((linearLayout instanceof l91) && callback22 != null) {
            d4Var.setOnDismissListener(new wg1(15, callback22, wallettransaction2));
        }
        j2VarArr[r10].setFocusable(callback3 == null ? r10 : true);
        j2 j2Var = j2VarArr[r10];
        j2Var.useBackgroundTopPadding = r10;
        j2Var.show();
    }

    public static void t0(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        int i10 = 1;
        org.telegram.ui.ActionBar.e3 i11 = sk.i(1, context, c6Var, false);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackground(org.telegram.ui.ActionBar.g6.c0(AndroidUtilities.dp(16.0f), org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.h5, c6Var)));
        frameLayout.setPadding(AndroidUtilities.dp(36.0f), 0, AndroidUtilities.dp(36.0f), AndroidUtilities.dp(14.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(1);
        frameLayout.addView(linearLayout, w7.z5.d(-2.0f, -1));
        linearLayout.addView(new c6(160, context, false), w7.z5.t(160, 160, 1, 0, -12, 0, -8));
        TextView textView = new TextView(context);
        textView.setText(LocaleController.getString(R.string.WalletHowItWorks));
        sk.o(org.telegram.ui.ActionBar.g6.j5, c6Var, textView, 1, 17.0f);
        textView.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
        textView.setGravity(17);
        TextView i12 = com.google.android.gms.internal.play_billing.k3.i(linearLayout, textView, w7.z5.t(-1, -2, 1, 0, 0, 0, 6), context);
        i12.setText(LocaleController.getString(R.string.WalletHowItWorksInfo));
        int i13 = org.telegram.ui.ActionBar.g6.z6;
        sk.o(i13, c6Var, i12, 1, 14.0f);
        i12.setGravity(17);
        i12.setLineSpacing(AndroidUtilities.dp(1.0f), 1.0f);
        linearLayout.addView(i12, w7.z5.t(-1, -2, 1, 0, 0, 0, 24));
        s4 s4Var = new s4(context, c6Var);
        s4Var.setPadding(AndroidUtilities.dp(0.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(0.0f), AndroidUtilities.dp(8.0f));
        s4Var.a(LocaleController.getString(R.string.WalletSendInstantly), LocaleController.getString(R.string.WalletSendInstantlyInfo), R.drawable.wallet_learn_instant);
        linearLayout.addView(s4Var, w7.z5.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
        s4 s4Var2 = new s4(context, c6Var);
        s4Var2.setPadding(AndroidUtilities.dp(0.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(0.0f), AndroidUtilities.dp(8.0f));
        s4Var2.a(LocaleController.getString(R.string.WalletNoFees), LocaleController.getString(R.string.WalletNoFeesInfo), R.drawable.wallet_learn_fees);
        linearLayout.addView(s4Var2, w7.z5.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
        s4 s4Var3 = new s4(context, c6Var);
        s4Var3.setPadding(AndroidUtilities.dp(0.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(0.0f), AndroidUtilities.dp(8.0f));
        s4Var3.a(LocaleController.getString(R.string.WalletBlockchainVerified), LocaleController.getString(R.string.WalletBlockchainVerifiedInfo), R.drawable.wallet_learn_verified);
        linearLayout.addView(s4Var3, w7.z5.k(0.0f, 0.0f, 0.0f, 14.0f, -1, -2));
        di.d f7 = sk.f(24, context, c6Var, true);
        f7.setText(LocaleController.getString(R.string.WalletGotIt));
        linearLayout.addView(f7, w7.z5.t(-1, 48, 1, 0, 0, 0, 0));
        w7.b6.b(f7, 0.02f, 1.1f);
        da0 da0Var = new da0(context, null);
        da0Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(i13, c6Var));
        da0Var.setTextSize(1, 13.0f);
        da0Var.setGravity(17);
        da0Var.setText(AndroidUtilities.replaceSingleLink(LocaleController.getString(R.string.WalletTermsOfService), org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.gc, c6Var), new h3(context, i10)));
        linearLayout.addView(da0Var, w7.z5.k(0.0f, 12.0f, 0.0f, 6.0f, -1, -2));
        i11.customView = frameLayout;
        org.telegram.ui.ActionBar.e3[] e3VarArr = {i11};
        e3VarArr[0].setAllowNestedScroll(true);
        e3VarArr[0].fixNavigationBar();
        f7.setOnClickListener(new r3(e3VarArr, i10));
        e3VarArr[0].show();
    }

    public static void u0(Context context, int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        k0 v = k0.v(i10);
        if (v.D()) {
            String r10 = v.r();
            if (TextUtils.isEmpty(r10)) {
                return;
            }
            org.telegram.ui.ActionBar.e3 e3Var = new org.telegram.ui.ActionBar.e3(1, context, c6Var, false);
            e3Var.setBackgroundColor(-12207881);
            e3Var.fixNavigationBar(-12207881);
            FrameLayout frameLayout = new FrameLayout(context);
            frameLayout.setBackground(new z4());
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            linearLayout.setGravity(1);
            frameLayout.addView(linearLayout, w7.z5.f(-2.0f, 55, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(30.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f) + AndroidUtilities.navigationBarHeight));
            y4 y4Var = new y4(context, r10);
            linearLayout.addView(y4Var, w7.z5.q(288, 302, 1));
            TextView textView = new TextView(context);
            textView.setText(LocaleController.getString(R.string.WalletReceiveInfo));
            textView.setTextColor(-1);
            textView.setTextSize(1, 14.0f);
            textView.setGravity(17);
            textView.setLineSpacing(AndroidUtilities.dp(1.0f), 1.0f);
            linearLayout.addView(textView, w7.z5.t(-1, -2, 1, 24, 0, 24, 20));
            di.d dVar = new di.d(context, null, true);
            dVar.setRoundRadius(24);
            dVar.setColor(-1);
            dVar.setTextColor(-15556886);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) "$");
            spannableStringBuilder.setSpan(new br(R.drawable.wallet_buy, 0), 0, spannableStringBuilder.length(), 33);
            spannableStringBuilder.append((CharSequence) " ").append((CharSequence) LocaleController.getString(R.string.WalletBuyWithCashOrCrypto));
            dVar.setText(spannableStringBuilder);
            linearLayout.addView(dVar, w7.z5.t(-1, 48, 1, 0, 0, 0, 0));
            ImageView imageView = new ImageView(context);
            imageView.setImageResource(R.drawable.ic_close_white);
            imageView.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f));
            imageView.setContentDescription(LocaleController.getString(R.string.Close));
            w7.b6.a(imageView);
            frameLayout.addView(imageView, w7.z5.a(48.0f, 4.0f, 2.0f, 0.0f, 0.0f, 48, 51));
            e3Var.customView = frameLayout;
            e3Var.occupyNavigationBar = true;
            e3Var.setApplyTopPadding(false);
            e3Var.setApplyBottomPadding(false);
            e3Var.fixNavigationBar(-12207881);
            imageView.setOnClickListener(new f3(e3Var, 0));
            y4Var.e = new q0(r10, 1);
            e3Var.show();
            e3Var.setOverlayNavBarColor(-12207881);
            AndroidUtilities.setNavigationBarColor((Dialog) e3Var, -12207881, false);
            AndroidUtilities.setLightNavigationBar((Dialog) e3Var, false);
            if (Build.VERSION.SDK_INT >= 29 && e3Var.getWindow() != null) {
                e3Var.getWindow().setNavigationBarContrastEnforced(false);
            }
            dVar.setOnClickListener(new bi.f7(dVar, i10, e3Var, c6Var, 7));
        }
    }

    public final void A0() {
        k0 v = k0.v(this.currentAccount);
        G0();
        this.y0.setEnabled(v.D() && v.e());
        if (!v.D()) {
            this.r0.setText(r0(0));
            this.s0.setText(r0(1));
            return;
        }
        long t10 = v.t();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (this.E0 == null) {
            this.E0 = new SpannableString("G");
            n4 n4Var = this.d;
            n4Var.getClass();
            h5 h5Var = new h5(n4Var, R.drawable.wallet_gram_large);
            this.t0 = h5Var;
            SpannableString spannableString = this.E0;
            spannableString.setSpan(h5Var, 0, spannableString.length(), 33);
        }
        spannableStringBuilder.append((CharSequence) this.E0);
        spannableStringBuilder.append((CharSequence) " ");
        spannableStringBuilder.append((CharSequence) i5.c(t10));
        spannableStringBuilder.append((CharSequence) " ");
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.GramCurrency));
        if (this.u0 == null) {
            q4 q4Var = new q4();
            q4Var.a = -9577217;
            this.u0 = q4Var;
        }
        spannableStringBuilder.setSpan(this.u0, length, spannableStringBuilder.length(), 33);
        this.r0.setText(spannableStringBuilder);
        CharSequence l4 = k0.v(this.currentAccount).l(t10, false);
        if (TextUtils.isEmpty(l4)) {
            this.s0.setText(r0(1));
        } else {
            this.s0.setText(l4);
        }
        D0(this.v0);
        c0 c0Var = this.A0;
        if (c0Var != null && !c0Var.h && !c0Var.i && c0Var.k == null) {
            c0Var.d();
        }
        String r10 = v.r();
        if (TextUtils.isEmpty(r10)) {
            return;
        }
        this.d.setCardNumber(k0(r10.toUpperCase()));
    }

    public final void B0() {
        float[] fArr;
        float[] fArr2;
        Rect rect = this.H;
        if (rect.isEmpty() || !this.y.isAttachedToWindow()) {
            return;
        }
        n4 n4Var = this.d;
        ah.v vVar = this.E;
        Matrix matrix = n4Var.y;
        Matrix matrix2 = n4Var.x;
        Matrix matrix3 = n4Var.w;
        if (n4Var.isAttachedToWindow() && vVar.isAttachedToWindow() && n4Var.getRootView() == vVar.getRootView()) {
            View view = (View) n4Var.F.getParent();
            FrameLayout frameLayout = n4Var.E;
            if (frameLayout instanceof d5) {
                matrix3.set((Matrix) ((d5) frameLayout).b.b);
            } else {
                matrix3.set(((q5) frameLayout).v.a);
            }
            Matrix matrix4 = this.I;
            i5.f(view, matrix4);
            matrix4.preConcat(matrix3);
            matrix4.preTranslate(n4Var.F.getLeft() - view.getScrollX(), n4Var.F.getTop() - view.getScrollY());
            matrix4.preConcat(n4Var.F.getMatrix());
            i5.f(vVar, matrix2);
            if (matrix2.invert(matrix)) {
                matrix4.postConcat(matrix);
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
                matrix4.mapPoints(fArr2);
                ah.v vVar2 = this.E;
                int[] iArr = this.P;
                vVar2.getLocationInWindow(iArr);
                View view2 = this.y;
                int[] iArr2 = this.O;
                view2.getLocationInWindow(iArr2);
                this.d.e(this.v0, this.x.getWidth() / 0.75f);
                float f11 = iArr2[0] - iArr[0];
                float f12 = (iArr2[1] - iArr[1]) - ((height * 0.75f) * 0.5f);
                for (int i13 = 0; i13 < 4; i13++) {
                    int i14 = i13 * 2;
                    float lerp = AndroidUtilities.lerp(fArr2[i14], (fArr[i14] * 0.75f) + f11, this.v0);
                    float[] fArr3 = this.N;
                    fArr3[i14] = lerp;
                    int i15 = i14 + 1;
                    fArr3[i15] = AndroidUtilities.lerp(fArr2[i15], (fArr[i15] * 0.75f) + f12, this.v0);
                }
                Matrix matrix5 = this.K;
                boolean polyToPoly = matrix5.setPolyToPoly(this.L, 0, this.N, 0, 4);
                Matrix matrix6 = this.J;
                if (polyToPoly && !matrix6.equals(matrix5)) {
                    matrix6.set(matrix5);
                    this.E.invalidate();
                }
                n4 n4Var2 = this.d;
                Matrix matrix7 = n4Var2.c;
                Matrix matrix8 = n4Var2.e;
                Matrix matrix9 = n4Var2.d;
                if (matrix4.invert(matrix9)) {
                    matrix8.setConcat(matrix9, matrix6);
                    if (!n4Var2.h || !matrix7.equals(matrix8)) {
                        matrix7.set(matrix8);
                        n4Var2.h = true;
                        n4Var2.L.invalidate();
                    }
                }
                float lerp2 = AndroidUtilities.lerp(1.0f, 1.1428572f, this.v0);
                this.s0.setPivotX(0.0f);
                this.s0.setPivotY(0.0f);
                this.s0.setScaleX(lerp2);
                this.s0.setScaleY(lerp2);
            }
        }
    }

    public final void C0() {
        ah.v vVar;
        LinearLayout linearLayout;
        if (this.a == null || this.d == null || this.q0 == null || this.y == null || (vVar = this.E) == null || this.actionBar == null) {
            return;
        }
        vVar.bringToFront();
        View m10 = this.a.V2.m(this.f);
        float clamp = m10 == null ? this.a.V2.L0() > this.f ? 1.0f : 0.0f : Utilities.clamp((this.a.getPaddingTop() - m10.getTop()) / m10.getHeight(), 1.0f, 0.0f);
        this.v0 = clamp;
        E0();
        float max = m10 != null ? Math.max(0.0f, (m10.getHeight() / 2.0f) + AndroidUtilities.dp(24.0f)) * this.v0 : 0.0f;
        float lerp = AndroidUtilities.lerp(1.0f, 0.8f, this.v0);
        this.d.setPivotX(r7.getWidth() * 0.5f);
        this.d.setPivotY(0.0f);
        this.d.setScaleX(lerp);
        this.d.setScaleY(lerp);
        this.d.setAlpha(1.0f - Utilities.clamp01(AndroidUtilities.ilerp(clamp, 0.75f, 1.0f)));
        this.d.setVisibility((m10 == null || clamp >= 1.0f || m10.getBottom() <= this.a.getPaddingTop() || m10.getTop() >= this.a.getHeight() - this.a.getPaddingBottom()) ? 4 : 0);
        if (m10 != null) {
            this.a.getLocationInWindow(this.Q);
            this.h.getLocationInWindow(this.R);
            this.d.setTranslationX(((this.e.getWidth() - this.d.getWidth()) / 2.0f) + this.e.getX() + m10.getX() + (r9[0] - r10[0]));
            this.d.setTranslationY(this.e.getY() + m10.getY() + (r9[1] - r10[1]) + max);
        }
        boolean z10 = clamp > 0.0f;
        if (this.F != z10 && (linearLayout = this.q0) != null) {
            Rect rect = this.H;
            if (z10) {
                if (linearLayout.getWidth() != 0 && this.q0.getHeight() != 0) {
                    rect.set(this.q0.getLeft(), this.q0.getTop(), this.q0.getRight(), this.q0.getBottom());
                }
            }
            this.d.setOnFrontContentPresented(null);
            this.G = false;
            AndroidUtilities.removeFromParent(this.q0);
            this.F = z10;
            if (z10) {
                this.E.addView(this.q0, new FrameLayout.LayoutParams(rect.width(), rect.height(), 51));
                this.q0.layout(0, 0, rect.width(), rect.height());
                B0();
            } else {
                n4 n4Var = this.d;
                n4Var.e(0.0f, 0.0f);
                LinearLayout linearLayout2 = n4Var.K;
                AndroidUtilities.removeFromParent(linearLayout2);
                linearLayout2.setScaleX(1.0f);
                linearLayout2.setScaleY(1.0f);
                linearLayout2.setRotationX(0.0f);
                linearLayout2.setRotationY(0.0f);
                linearLayout2.setTranslationX(0.0f);
                linearLayout2.setTranslationY(0.0f);
                org.telegram.ui.Components.s6 s6Var = n4Var.M;
                s6Var.setScaleX(1.0f);
                s6Var.setScaleY(1.0f);
                n4Var.F.addView(linearLayout2, n4Var.N);
                this.q0.layout(rect.left, rect.top, rect.right, rect.bottom);
                this.G = !this.d.n;
                B0();
                if (this.G) {
                    this.d.setOnFrontContentPresented(new g3(this, 9));
                }
            }
            this.E.invalidate();
        }
        D0(clamp);
        if (this.F) {
            B0();
        }
        float f7 = 1.0f - clamp;
        float f10 = (1.0f - f7) * (-AndroidUtilities.dp(8.0f));
        if (this.actionBar.getTitleTextView() != null) {
            this.actionBar.getTitleTextView().setAlpha(f7);
            this.actionBar.getTitleTextView().setTranslationY(f10);
        }
        if (this.actionBar.getTitleTextView2() != null) {
            this.actionBar.getTitleTextView2().setAlpha(f7);
            this.actionBar.getTitleTextView2().setTranslationY(f10);
        }
    }

    public final void D0(float f7) {
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.g6.G6);
        this.r0.setTextColor(AndroidUtilities.lerpColor(-1, themedColor, f7));
        this.s0.setTextColor(AndroidUtilities.lerpColor(-7868417, i0.a.k(themedColor, Math.round(142.8f)), f7));
        h5 h5Var = this.t0;
        if (h5Var != null) {
            h5Var.setOverrideColor(AndroidUtilities.lerpColor(-1, getThemedColor(org.telegram.ui.ActionBar.g6.Oh), f7));
        }
        q4 q4Var = this.u0;
        if (q4Var != null) {
            q4Var.a = i0.a.k(-9577217, Math.round((1.0f - f7) * 255.0f));
        }
        this.r0.invalidate();
    }

    public final void E0() {
        c71 c71Var = this.a;
        if (c71Var == null || this.d == null) {
            return;
        }
        float b10 = c71Var.C2.b(1);
        this.d.setAdditionalTilt(Math.max(0.0f, (this.v0 * 10.0f) + ((((float) Math.sqrt(Utilities.clamp01(this.v0))) * 90.0f) - 10.0f)) + Math.min(10.0f, this.a.C2.b(3) * 40.0f) + (-Math.min(10.0f, b10 * 40.0f)));
        this.d.setUseGyroscope(1.0f - ((float) Math.pow(this.v0, 0.33000001311302185d)));
    }

    public final void F0(boolean z10) {
        boolean y02 = y0();
        c71 c71Var = this.a;
        i71[] i71VarArr = this.p0;
        if (c71Var != null && this.m0 != y02) {
            this.m0 = y02;
            c71Var.B0();
            for (i71 i71Var : i71VarArr) {
                if (i71Var != null) {
                    i71Var.B0();
                }
            }
            this.a.W2.N(false);
            this.a.V2.h1(0, 0);
            this.a.post(new g3(this, 11));
        }
        if (y02) {
            return;
        }
        for (i71 i71Var2 : i71VarArr) {
            if (i71Var2 != null) {
                boolean canScrollVertically = i71Var2.canScrollVertically(-1);
                i71Var2.W2.N(z10);
                i71Var2.a0();
                if (!canScrollVertically) {
                    i71Var2.V2.h1(0, 0);
                }
            }
        }
        LinearLayout linearLayout = this.l0;
        if (linearLayout != null) {
            linearLayout.post(new g3(this, 5));
            this.l0.post(new g3(this, 6));
        }
    }

    public final void G0() {
        if (this.T == null) {
            return;
        }
        k0 v = k0.v(this.currentAccount);
        boolean z10 = this.T.isAttachedToWindow() && this.T.isLaidOut();
        j4 j4Var = this.T;
        FrameLayout frameLayout = this.U;
        Boolean bool = v.i;
        j4Var.i(frameLayout, (bool == null || !bool.booleanValue() || TextUtils.isEmpty(v.j)) ? false : true, z10);
        ArrayList arrayList = v.C;
        int size = arrayList.size();
        int i10 = 0;
        long j10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            g0 g0Var = (g0) obj;
            if (!g0Var.e) {
                long j11 = g0Var.c;
                if (j11 >= 0) {
                    j10 += j11;
                }
            }
        }
        boolean z11 = j10 > 500000000;
        if (z11) {
            this.X.setText(m0(R.string.WalletOldWalletsBalance, j10));
        }
        this.T.i(this.W, z11, z10);
        long j12 = zh.n5.y(this.currentAccount, true).p().amount;
        boolean z12 = j12 > 500000000;
        if (z12) {
            this.Z.setText(m0(R.string.WalletGramEarningsBalance, j12));
        }
        this.T.i(this.Y, z12, z10);
    }

    @Override // org.telegram.ui.Components.d71
    public final void U(ArrayList arrayList, a71 a71Var) {
        k0 v = k0.v(this.currentAccount);
        G0();
        arrayList.add(m61.l(this.S));
        this.f = arrayList.size();
        k4 k4Var = this.e;
        m61 m61Var = new m61(-4);
        m61Var.c = k4Var;
        m61Var.z = -1;
        m61Var.e = true;
        arrayList.add(m61Var);
        arrayList.add(m61.l(this.w0));
        boolean y02 = y0();
        this.m0 = y02;
        if (y02) {
            int i10 = R.drawable.wallet_learn_instant;
            String string = LocaleController.getString(R.string.WalletSendInstantly);
            String string2 = LocaleController.getString(R.string.WalletSendInstantlyInfo);
            int i11 = r4.a;
            m61 J = m61.J(r4.class);
            J.k = i10;
            J.l = string;
            J.m = string2;
            arrayList.add(J);
            int i12 = R.drawable.wallet_learn_fees;
            String string3 = LocaleController.getString(R.string.WalletNoFees);
            String string4 = LocaleController.getString(R.string.WalletNoFeesInfo);
            m61 J2 = m61.J(r4.class);
            J2.k = i12;
            J2.l = string3;
            J2.m = string4;
            arrayList.add(J2);
            int i13 = R.drawable.wallet_learn_verified;
            String string5 = LocaleController.getString(R.string.WalletBlockchainVerified);
            String string6 = LocaleController.getString(R.string.WalletBlockchainVerifiedInfo);
            m61 J3 = m61.J(r4.class);
            J3.k = i13;
            J3.l = string5;
            J3.m = string6;
            arrayList.add(J3);
            arrayList.add(m61.l(this.b0));
        } else if (this.l0 != null) {
            if (this.F0 && !this.G0 && v.t() > 500000000) {
                arrayList.add(m61.k(this.d0));
            }
            arrayList.add(m61.p(this.l0, 0, true));
        }
        da0 da0Var = this.a0;
        if (da0Var != null) {
            this.c0 = false;
            da0Var.animate().cancel();
            this.a0.setAlpha(0.0f);
            this.a0.setVisibility(4);
        }
    }

    @Override // org.telegram.ui.Components.d71
    public final CharSequence V() {
        return LocaleController.getString(R.string.WalletTitle);
    }

    @Override // org.telegram.ui.Components.d71
    public final void W(m61 m61Var, View view) {
        c0 c0Var;
        Object obj = m61Var.G;
        if (!(obj instanceof TL_wallet.nftItem)) {
            if (m61Var.d == -10001 && (c0Var = this.A0) != null) {
                c0Var.d();
                return;
            } else {
                if (obj instanceof TL_wallet.walletTransaction) {
                    s0(getParentActivity(), this.currentAccount, (TL_wallet.walletTransaction) m61Var.G, null, null, null, null, getResourceProvider());
                    return;
                }
                return;
            }
        }
        Activity parentActivity = getParentActivity();
        TL_wallet.nftItem nftitem = (TL_wallet.nftItem) m61Var.G;
        org.telegram.ui.ActionBar.c6 resourceProvider = getResourceProvider();
        if (parentActivity == null || nftitem == null) {
            return;
        }
        int w02 = org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.a7, resourceProvider);
        int w03 = org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.G6, resourceProvider);
        z3 z3Var = new z3(parentActivity, resourceProvider);
        z3Var.setBackgroundColor(w02);
        z3Var.fixNavigationBar(w02);
        ScrollView scrollView = new ScrollView(parentActivity);
        scrollView.setFillViewport(true);
        scrollView.setVerticalScrollBarEnabled(false);
        LinearLayout linearLayout = new LinearLayout(parentActivity);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(1);
        linearLayout.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(28.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f));
        scrollView.addView(linearLayout, new FrameLayout.LayoutParams(-1, -2));
        z9 z9Var = new z9(parentActivity);
        z9Var.setRoundRadius(AndroidUtilities.dp(12.0f));
        z9Var.setContentDescription(nftitem.name);
        Drawable mutate = parentActivity.getResources().getDrawable(R.drawable.wallet_nft_placeholder).mutate();
        int i10 = org.telegram.ui.ActionBar.g6.z6;
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(i10, resourceProvider), PorterDuff.Mode.SRC_IN));
        ImageLocation b10 = c.b(nftitem, false);
        if (b10 != null) {
            z9Var.h(b10, "120_120", mutate, nftitem);
        } else {
            z9Var.setImageDrawable(mutate);
        }
        linearLayout.addView(z9Var, w7.z5.q(120, 120, 1));
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
        textView2.setTextColor(org.telegram.ui.ActionBar.g6.w0(i10, resourceProvider));
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
            int w04 = org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.d6, resourceProvider);
            int w05 = org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.i6, resourceProvider);
            linearLayout3.setBackground(org.telegram.ui.ActionBar.g6.j0(dp, dp, dp, dp, w04, w05, w05));
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
            o01 o01Var = new o01(parentActivity, resourceProvider);
            o01Var.setBackground(org.telegram.ui.ActionBar.g6.c0(AndroidUtilities.dp(10.0f), org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.d6, resourceProvider)));
            ArrayList<TL_wallet.nftAttribute> arrayList2 = nftitem.attributes;
            int size = arrayList2.size();
            int i13 = 0;
            while (i13 < size) {
                TL_wallet.nftAttribute nftattribute = arrayList2.get(i13);
                i13++;
                TL_wallet.nftAttribute nftattribute2 = nftattribute;
                o01Var.c(nftattribute2.trait_type, nftattribute2.value, null, null);
            }
            linearLayout.addView(o01Var, w7.z5.k(0.0f, 0.0f, 0.0f, 14.0f, -1, -2));
        }
        di.d dVar = new di.d(parentActivity, resourceProvider, true);
        dVar.setRoundRadius(24);
        dVar.setText(LocaleController.getString(R.string.WalletOK));
        linearLayout.addView(dVar, w7.z5.n(-1, 48));
        z3Var.setCustomView(scrollView);
        z3Var.useBackgroundTopPadding = false;
        linearLayout2.getChildAt(0).setOnClickListener(new bz0(13, z3Var, nftitem));
        linearLayout2.getChildAt(1).setOnClickListener(new k3(parentActivity, 0));
        dVar.setOnClickListener(new k3(z3Var, 1));
        z3Var.show();
        z3Var.fixNavigationBar(w02);
        AndroidUtilities.setNavigationBarColor((Dialog) z3Var, w02, false);
    }

    @Override // org.telegram.ui.Components.d71
    public final boolean X(m61 m61Var, View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.d71, org.telegram.ui.ActionBar.m2
    public final View createView(Context context) {
        ValueAnimator valueAnimator = this.k0;
        if (valueAnimator != null) {
            this.k0 = null;
            valueAnimator.cancel();
        }
        z0();
        w4 w4Var = this.o0;
        if (w4Var != null) {
            w4Var.b(null);
        }
        this.e = null;
        this.T = null;
        this.S = null;
        this.l0 = null;
        this.n0 = null;
        i71[] i71VarArr = this.p0;
        final int i10 = 0;
        i71VarArr[0] = null;
        final int i11 = 1;
        i71VarArr[1] = null;
        c0 c0Var = this.A0;
        boolean z10 = (c0Var == null || c0Var.a.isEmpty()) ? false : true;
        this.g0 = z10;
        if (!z10) {
            this.f0 = 0;
        }
        View createView = super.createView(context);
        jd0 jd0Var = new jd0(this, context);
        jd0Var.addView(createView, w7.z5.d(-1.0f, -1));
        this.fragmentView = jd0Var;
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i12 = org.telegram.ui.ActionBar.g6.a7;
        kVar.setBackgroundColor(getThemedColor(i12));
        this.actionBar.setCastShadows(false);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setClipChildren(false);
        this.actionBar.setClipToPadding(false);
        org.telegram.ui.ActionBar.y n10 = this.actionBar.n();
        final int i13 = 3;
        n10.a(2, R.drawable.scan_qr).setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Wallet.i3
            public final /* synthetic */ a5 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i13) {
                    case 0:
                        a5 a5Var = this.b;
                        a5Var.getClass();
                        a5Var.presentFragment(new oh1(6, null));
                        break;
                    case 1:
                        a5.c0(this.b);
                        break;
                    case 2:
                        a5.f0(this.b);
                        break;
                    case 3:
                        this.b.v0();
                        break;
                    default:
                        a5.a0(this.b);
                        break;
                }
            }
        });
        n10.a(1, R.drawable.ic_ab_other).setOnClickListener(new bz0(15, this, context));
        ah.x xVar = new ah.x(this, context, 25);
        this.S = xVar;
        xVar.setClipToPadding(false);
        this.S.setClipChildren(false);
        this.S.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(4.0f));
        j4 j4Var = new j4(this, context);
        this.T = j4Var;
        j4Var.setDefaultRadiusDp(22);
        this.T.setOnAnimatedHeightChangedListener(new g3(this, i10));
        TextView textView = new TextView(context);
        this.V = textView;
        textView.setText(LocaleController.getString(R.string.WalletWaltFunds));
        this.U = j0(this.V, new g3(this, i11));
        TextView textView2 = new TextView(context);
        this.X = textView2;
        this.W = j0(textView2, new g3(this, 2));
        TextView textView3 = new TextView(context);
        this.Z = textView3;
        this.Y = j0(textView3, new g3(this, i13));
        this.S.addView(this.T, w7.z5.d(-2.0f, -1));
        da0 da0Var = new da0(context, null);
        this.a0 = da0Var;
        this.c0 = false;
        da0Var.setAlpha(0.0f);
        da0 da0Var2 = this.a0;
        int i14 = org.telegram.ui.ActionBar.g6.z6;
        da0Var2.setTextColor(org.telegram.ui.ActionBar.g6.w0(i14, this.resourceProvider));
        this.a0.setTextSize(1, 13.0f);
        this.a0.setGravity(17);
        this.a0.setText(AndroidUtilities.replaceSingleLink(LocaleController.getString(R.string.WalletTermsOfService), org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.gc, this.resourceProvider), new h3(context, i10)));
        final int i15 = 4;
        this.a0.setVisibility(4);
        ((FrameLayout) createView).addView(this.a0, w7.z5.a(-2.0f, 12.0f, 0.0f, 12.0f, 24.0f, -1, 81));
        k4 k4Var = new k4(this, context, i10);
        this.b0 = k4Var;
        k4Var.setImportantForAccessibility(2);
        this.d0 = new FrameLayout(context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.e0 = frameLayout;
        int i16 = org.telegram.ui.ActionBar.g6.d6;
        int themedColor = getThemedColor(i16);
        int themedColor2 = getThemedColor(i16);
        int i17 = org.telegram.ui.ActionBar.g6.i6;
        frameLayout.setBackground(org.telegram.ui.ActionBar.g6.a0(themedColor, org.telegram.ui.ActionBar.g6.v(themedColor2, getThemedColor(i17)), 16, 16));
        this.d0.addView(this.e0, w7.z5.a(-2.0f, 12.0f, 0.0f, 12.0f, 12.0f, -1, 55));
        ImageView imageView = new ImageView(context);
        float dpf2 = AndroidUtilities.dpf2(10.0f);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{dpf2, dpf2, dpf2, dpf2, dpf2, dpf2, dpf2, dpf2}, null, null));
        shapeDrawable.setShaderFactory(new l4());
        imageView.setBackground(shapeDrawable);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.wallet_protect);
        this.e0.addView(imageView, w7.z5.a(28.0f, 14.0f, 11.0f, 16.0f, 11.0f, 28, 19));
        TextView textView4 = new TextView(context);
        sk.o(org.telegram.ui.ActionBar.g6.q7, this.resourceProvider, textView4, 1, 16.0f);
        textView4.setText(LocaleController.getString(R.string.WalletProtectAccount));
        this.e0.addView(textView4, w7.z5.a(-2.0f, 58.0f, 0.0f, 32.0f, 0.0f, -1, 19));
        this.e0.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Wallet.i3
            public final /* synthetic */ a5 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        a5 a5Var = this.b;
                        a5Var.getClass();
                        a5Var.presentFragment(new oh1(6, null));
                        break;
                    case 1:
                        a5.c0(this.b);
                        break;
                    case 2:
                        a5.f0(this.b);
                        break;
                    case 3:
                        this.b.v0();
                        break;
                    default:
                        a5.a0(this.b);
                        break;
                }
            }
        });
        w7.b6.b(this.e0, 0.02f, 1.2f);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.x = frameLayout2;
        frameLayout2.setClipChildren(false);
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
        n4 n4Var = new n4(this, context, this.w);
        this.d = n4Var;
        n4Var.setDiamondOnCard(true);
        this.d.setCardOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Wallet.i3
            public final /* synthetic */ a5 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i11) {
                    case 0:
                        a5 a5Var = this.b;
                        a5Var.getClass();
                        a5Var.presentFragment(new oh1(6, null));
                        break;
                    case 1:
                        a5.c0(this.b);
                        break;
                    case 2:
                        a5.f0(this.b);
                        break;
                    case 3:
                        this.b.v0();
                        break;
                    default:
                        a5.a0(this.b);
                        break;
                }
            }
        });
        this.a.C2.b.add(this.v);
        k4 k4Var2 = new k4(this, context, i11);
        this.e = k4Var2;
        k4Var2.setImportantForAccessibility(2);
        o4 o4Var = new o4(this, context);
        this.h = o4Var;
        o4Var.setClipChildren(false);
        this.h.setClipToPadding(false);
        this.h.addView(this.d, w7.z5.d(-2.0f, -1));
        jd0Var.addView(this.h, w7.z5.d(-1.0f, -1));
        this.a.setClipChildren(false);
        this.a.setClipToPadding(false);
        this.q0 = this.d.getBalanceLayout();
        this.r0 = this.d.getBalanceView();
        this.s0 = this.d.getUsdBalanceView();
        this.d.setCardHolder(UserObject.getUserName(getUserConfig().getCurrentUser()).toUpperCase());
        LinearLayout linearLayout = new LinearLayout(context);
        this.w0 = linearLayout;
        linearLayout.setOrientation(0);
        this.w0.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(12.0f));
        di.d dVar = new di.d(context, this.resourceProvider, true);
        dVar.setRoundRadius(24);
        this.x0 = dVar;
        dVar.setText(LocaleController.getString(R.string.WalletAddFunds));
        this.w0.addView(this.x0, w7.z5.m(1.0f, 0, 48, 0, 4, 0));
        final int i18 = 2;
        this.x0.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Wallet.i3
            public final /* synthetic */ a5 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i18) {
                    case 0:
                        a5 a5Var = this.b;
                        a5Var.getClass();
                        a5Var.presentFragment(new oh1(6, null));
                        break;
                    case 1:
                        a5.c0(this.b);
                        break;
                    case 2:
                        a5.f0(this.b);
                        break;
                    case 3:
                        this.b.v0();
                        break;
                    default:
                        a5.a0(this.b);
                        break;
                }
            }
        });
        di.d dVar2 = new di.d(context, this.resourceProvider, true);
        dVar2.setRoundRadius(24);
        this.y0 = dVar2;
        dVar2.setText(LocaleController.getString(R.string.WalletSend));
        this.y0.setEnabled(k0.v(this.currentAccount).e());
        this.y0.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Wallet.i3
            public final /* synthetic */ a5 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i15) {
                    case 0:
                        a5 a5Var = this.b;
                        a5Var.getClass();
                        a5Var.presentFragment(new oh1(6, null));
                        break;
                    case 1:
                        a5.c0(this.b);
                        break;
                    case 2:
                        a5.f0(this.b);
                        break;
                    case 3:
                        this.b.v0();
                        break;
                    default:
                        a5.a0(this.b);
                        break;
                }
            }
        });
        this.w0.addView(this.y0, w7.z5.m(1.0f, 0, 48, 4, 0, 0));
        this.z0 = k0.v(this.currentAccount).z();
        this.a.setDescendantFocusability(131072);
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.l0 = linearLayout2;
        linearLayout2.setOrientation(1);
        this.l0.setBackgroundColor(getThemedColor(i12));
        int i19 = 10;
        di.h1 h1Var = new di.h1(this, context, this.resourceProvider, i19);
        this.n0 = h1Var;
        h1Var.setAllowDisallowInterceptTouch(false);
        this.n0.setAdapter(new x3(this));
        k91 n11 = this.n0.n(-2, true);
        this.h0 = n11;
        int i20 = org.telegram.ui.ActionBar.g6.Oh;
        n11.g(i20, i20, i14, i17, i16);
        this.h0.setBackground(org.telegram.ui.ActionBar.g6.c0(AndroidUtilities.dp(18.0f), getThemedColor(i16)));
        y3 y3Var = new y3(this, context);
        this.i0 = y3Var;
        y3Var.setPadding(0, 0, 0, AndroidUtilities.dp(12.0f));
        this.i0.addView(this.h0, w7.z5.e(-2, 36, 49));
        this.n0.setPosition(this.f0);
        this.l0.addView(this.i0, w7.z5.k(0.0f, 0.0f, 0.0f, -6.0f, -1, 48));
        this.l0.addView(this.n0, w7.z5.l(1.0f, -1, 0));
        w0(this.g0);
        this.a.j(new kc0(this, i19));
        a71 a71Var = this.a.W2;
        a71Var.r = false;
        a71Var.N(false);
        w4 w4Var2 = new w4(this);
        this.o0 = w4Var2;
        w4Var2.b(this.a);
        A0();
        this.z0.e();
        this.actionBar.post(new g3(this, i19));
        this.a.post(new g3(this, 11));
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        c71 c71Var;
        a71 a71Var;
        if (i11 != this.currentAccount) {
            return;
        }
        if (i10 == NotificationCenter.walletUpdate && this.r0 != null) {
            A0();
            Iterator it = this.D0.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
            return;
        }
        if (i10 == NotificationCenter.starBalanceUpdated) {
            G0();
            return;
        }
        if (i10 == NotificationCenter.didSetOrRemoveTwoStepPassword) {
            if (objArr.length > 0) {
                Object obj = objArr[0];
                if (obj instanceof TL_account.Password) {
                    this.F0 = true;
                    this.G0 = ((TL_account.Password) obj).has_password;
                    c71 c71Var2 = this.a;
                    if (c71Var2 == null || (a71Var = c71Var2.W2) == null) {
                        return;
                    }
                    a71Var.N(true);
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
        j0 j0Var = this.z0;
        if (obj2 != j0Var || (c71Var = this.a) == null || c71Var.W2 == null) {
            return;
        }
        if (j0Var.b.isEmpty()) {
            j0 j0Var2 = this.z0;
            if (!j0Var2.g) {
                j0Var2.e();
            }
        }
        F0(true);
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final FrameLayout j0(TextView textView, Runnable runnable) {
        Context context = textView.getContext();
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(14.0f));
        frameLayout.setBackground(org.telegram.ui.ActionBar.g6.g0(getThemedColor(org.telegram.ui.ActionBar.g6.i6), 2, -1));
        textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.G6));
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(19);
        frameLayout.addView(textView, w7.z5.a(-2.0f, 0.0f, 0.0f, 42.0f, 0.0f, -1, 3));
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(R.drawable.attach_arrow_right);
        imageView.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.g6.z6), PorterDuff.Mode.SRC_IN));
        frameLayout.addView(imageView, w7.z5.e(-2, -2, 21));
        frameLayout.setOnClickListener(new k3(runnable, 2));
        textView.setDuplicateParentStateEnabled(true);
        w7.b6.b(textView, 0.02f, 1.2f);
        this.T.addView(frameLayout, w7.z5.n(-1, -2));
        return frameLayout;
    }

    public final CharSequence m0(int i10, long j10) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((char) 65532);
        br brVar = new br(R.drawable.mini_gram_16, 0);
        brVar.recolorDrawable = false;
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.g6.Oh);
        spannableStringBuilder.setSpan(brVar, length, spannableStringBuilder.length(), 33);
        spannableStringBuilder.append((CharSequence) " ");
        int length2 = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) k0.n(j10, false));
        spannableStringBuilder.setSpan(new ForegroundColorSpan(themedColor), length2, spannableStringBuilder.length(), 33);
        return LocaleController.formatSpannable(i10, spannableStringBuilder);
    }

    public final i71 n0() {
        if (o0()) {
            di.h1 h1Var = this.n0;
            View currentView = h1Var == null ? null : h1Var.getCurrentView();
            if (currentView instanceof i71) {
                return (i71) currentView;
            }
        }
        return null;
    }

    public final boolean o0() {
        LinearLayout linearLayout;
        if (this.m0 || (linearLayout = this.l0) == null || !linearLayout.isAttachedToWindow()) {
            return false;
        }
        ViewParent parent = this.l0.getParent();
        c71 c71Var = this.a;
        return parent == c71Var.V2.m(c71Var.W2.x.size() - 1);
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final void onBeginSlide() {
        w4 w4Var = this.o0;
        if (w4Var != null) {
            w4Var.c();
        }
        c71 c71Var = this.a;
        if (c71Var != null) {
            c71Var.B0();
        }
        i71 n02 = n0();
        if (n02 != null) {
            n02.B0();
        }
        super.onBeginSlide();
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final boolean onFragmentCreate() {
        getNotificationCenter().addObserver(this, NotificationCenter.walletUpdate);
        getNotificationCenter().addObserver(this, NotificationCenter.starBalanceUpdated);
        getNotificationCenter().addObserver(this, NotificationCenter.walletTransactionsUpdate);
        getNotificationCenter().addObserver(this, NotificationCenter.didSetOrRemoveTwoStepPassword);
        k0 v = k0.v(this.currentAccount);
        if (v.o == null) {
            v.o = new c0(v);
        }
        c0 c0Var = v.o;
        this.A0 = c0Var;
        ArrayList arrayList = c0Var.d;
        g3 g3Var = this.B0;
        if (!arrayList.contains(g3Var)) {
            arrayList.add(g3Var);
        }
        i iVar = this.H0;
        if (iVar != null) {
            iVar.run();
        }
        int i10 = v.z;
        v.z = i10 + 1;
        HashSet hashSet = v.A;
        boolean isEmpty = hashSet.isEmpty();
        hashSet.add(Integer.valueOf(i10));
        if (isEmpty) {
            v.P();
        }
        this.H0 = new i(v, i10, 0);
        getConnectionsManager().sendRequestTyped(new TL_account.getPassword(), new org.telegram.messenger.a(), new d(this, 7));
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final void onFragmentDestroy() {
        n4 n4Var = this.d;
        if (n4Var != null) {
            n4Var.setOnFrontContentPresented(null);
        }
        this.G = false;
        ValueAnimator valueAnimator = this.k0;
        if (valueAnimator != null) {
            this.k0 = null;
            valueAnimator.cancel();
        }
        c0 c0Var = this.A0;
        if (c0Var != null) {
            c0Var.d.remove(this.B0);
        }
        z0();
        w4 w4Var = this.o0;
        if (w4Var != null) {
            w4Var.b(null);
        }
        getNotificationCenter().removeObserver(this, NotificationCenter.walletUpdate);
        getNotificationCenter().removeObserver(this, NotificationCenter.starBalanceUpdated);
        getNotificationCenter().removeObserver(this, NotificationCenter.walletTransactionsUpdate);
        getNotificationCenter().removeObserver(this, NotificationCenter.didSetOrRemoveTwoStepPassword);
        AndroidUtilities.removeFromParent(this.E);
        j0 j0Var = this.z0;
        if (j0Var != null) {
            j0Var.a();
        }
        super.onFragmentDestroy();
        i iVar = this.H0;
        if (iVar != null) {
            iVar.run();
            this.H0 = null;
        }
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.a.setPadding(0, 0, 0, i13);
        this.a.setClipToPadding(false);
        da0 da0Var = this.a0;
        if (da0Var != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) da0Var.getLayoutParams();
            layoutParams.bottomMargin = AndroidUtilities.dp(24.0f) + i13;
            this.a0.setLayoutParams(layoutParams);
        }
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final void onRequestPermissionsResultFragment(int i10, String[] strArr, int[] iArr) {
        if (i10 != 44 || getParentActivity() == null) {
            return;
        }
        if (iArr.length > 0 && iArr[0] == 0) {
            v0();
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        alertDialog$Builder.a.T = AndroidUtilities.replaceTags(LocaleController.getString(R.string.QRCodePermissionNoCameraWithHint));
        alertDialog$Builder.k(LocaleController.getString(R.string.PermissionOpenSettings), new j3(this));
        alertDialog$Builder.h(LocaleController.getString(R.string.ContactsPermissionAlertNotNow), null);
        alertDialog$Builder.m(R.raw.permission_request_camera, 72, org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.L5, false), null);
        alertDialog$Builder.o();
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final void onResume() {
        super.onResume();
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar != null) {
            kVar.post(new g3(this, 10));
        }
        k0.v(this.currentAccount).B();
        if (this.A0 != null && k0.v(this.currentAccount).D()) {
            c0 c0Var = this.A0;
            if (!c0Var.j) {
                c0Var.b();
                c0Var.e(true);
            }
        }
        A0();
        if (this.a != null) {
            F0(true);
        }
    }

    public final void p0() {
        c0 c0Var;
        i71 i71Var = this.p0[1];
        if (this.f0 != 1 || i71Var == null || !i71Var.G || (c0Var = this.A0) == null || c0Var.i || c0Var.g || c0Var.k != null || i71Var.V2.N0() < i71Var.W2.x.size() - 3) {
            return;
        }
        this.A0.d();
    }

    public final void q0() {
        j0 j0Var;
        i71 i71Var = this.p0[0];
        if (i71Var == null || !i71Var.G || (j0Var = this.z0) == null || j0Var.g || i71Var.V2.N0() < i71Var.W2.x.size() - 3) {
            return;
        }
        this.z0.e();
    }

    public final CharSequence r0(int i10) {
        CharSequence[] charSequenceArr = this.C0;
        if (charSequenceArr[i10] == null) {
            charSequenceArr[i10] = new SpannableString("l");
            ia0 ia0Var = new ia0(AndroidUtilities.dp(i10 == 0 ? 100.0f : 50.0f), i10 == 0 ? this.r0 : this.s0);
            ia0Var.a(org.telegram.ui.ActionBar.g6.m1(0.45f, -1), org.telegram.ui.ActionBar.g6.m1(0.2f, -1));
            CharSequence charSequence = charSequenceArr[i10];
            ((SpannableString) charSequence).setSpan(ia0Var, 0, charSequence.length(), 33);
        }
        return charSequenceArr[i10];
    }

    public final void v0() {
        if (getParentActivity() == null) {
            return;
        }
        if (getParentActivity().checkSelfPermission("android.permission.CAMERA") != 0) {
            getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 44);
        } else {
            org.telegram.ui.z9.e0(getParentActivity(), true, 1, new m.l(this));
        }
    }

    public final void w0(boolean z10) {
        this.g0 = z10;
        if (!z10) {
            this.f0 = 0;
        }
        di.h1 h1Var = this.n0;
        if (h1Var == null || this.i0 == null) {
            return;
        }
        if (!z10) {
            h1Var.setPosition(0);
        }
        ValueAnimator valueAnimator = this.k0;
        if (valueAnimator != null) {
            this.k0 = null;
            valueAnimator.cancel();
        }
        float f7 = z10 ? 1.0f : 0.0f;
        int i10 = 1;
        boolean z11 = this.l0.isAttachedToWindow() && this.l0.isLaidOut();
        if (z10) {
            this.n0.o(false);
        }
        if (!z11 || this.j0 == f7) {
            x0(f7);
            this.n0.o(false);
        } else {
            this.i0.setVisibility(0);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.j0, f7);
            this.k0 = ofFloat;
            ofFloat.setDuration(250L);
            this.k0.setInterpolator(es.h);
            this.k0.addUpdateListener(new t2(this, i10));
            this.k0.addListener(new org.telegram.ui.ActionBar.y0(this, f7, 6));
            this.k0.start();
        }
        if (this.a == null || this.m0 == y0()) {
            return;
        }
        F0(false);
    }

    public final void x0(float f7) {
        this.j0 = f7;
        this.i0.setVisibility((f7 > 0.0f || this.k0 != null) ? 0 : 8);
        this.i0.setAlpha(f7);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.i0.getLayoutParams();
        layoutParams.height = Math.round(AndroidUtilities.dp(48.0f) * f7);
        layoutParams.bottomMargin = -Math.round(AndroidUtilities.dp(6.0f) * f7);
        this.i0.setLayoutParams(layoutParams);
    }

    public final boolean y0() {
        j0 j0Var;
        if (this.g0 || (j0Var = this.z0) == null || !j0Var.c.isEmpty()) {
            return false;
        }
        j0 j0Var2 = this.z0;
        j0Var2.getClass();
        return j0Var2.g;
    }

    public final void z0() {
        this.r = false;
        c71 c71Var = this.a;
        if (c71Var != null) {
            c71Var.C2.b.remove(this.v);
            this.a.removeCallbacks(this.s);
        }
        n4 n4Var = this.d;
        if (n4Var != null) {
            n4Var.setAdditionalTilt(0.0f);
        }
    }
}
