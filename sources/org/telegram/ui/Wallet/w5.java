package org.telegram.ui.Wallet;

import android.animation.ValueAnimator;
import android.app.Activity;
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
import b8.mf;
import b8.pf;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.ac;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cs;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.messenger.l10;
import org.telegram.messenger.n10;
import org.telegram.messenger.p10;
import org.telegram.messenger.yd;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.f60;
import org.telegram.ui.Components.h41;
import org.telegram.ui.Components.iz;
import org.telegram.ui.Components.ji;
import org.telegram.ui.Components.kw0;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.lt;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.ms;
import org.telegram.ui.Components.r31;
import org.telegram.ui.Components.rx0;
import org.telegram.ui.Components.s70;
import org.telegram.ui.Components.ty0;
import org.telegram.ui.Components.tz;
import org.telegram.ui.Components.uy0;
import org.telegram.ui.Components.wp;
import org.telegram.ui.Components.x70;
import org.telegram.ui.Components.xq;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PasscodeActivity;
import org.telegram.ui.e51;
import org.telegram.ui.hb0;
import org.telegram.ui.i81;
import org.telegram.ui.ka0;
import org.telegram.ui.m90;
import org.telegram.ui.ma1;
import org.telegram.ui.n61;
import org.telegram.ui.ra1;
import org.telegram.ui.s51;
import org.telegram.ui.xp0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class w5 extends h41 implements cs {
    public static Typeface V0;
    public s51 A0;
    public float B0;
    public gi.d C0;
    public gi.d D0;
    public View E;
    public j0 E0;
    public n61 F;
    public c0 F0;
    public boolean G;
    public boolean G0;
    public float I0;
    public float J0;
    public ValueAnimator K0;
    public org.telegram.ui.ActionBar.q0 M0;
    public bi.a0 N0;
    public int O0;
    public SpannableString R0;
    public kw0 S;
    public boolean S0;
    public g5 T;
    public boolean T0;
    public FrameLayout U;
    public org.telegram.ui.Components.o2 U0;
    public TextView V;
    public FrameLayout W;
    public TextView X;
    public FrameLayout Y;
    public TextView Z;
    public s70 a0;
    public h5 b0;
    public boolean c0;
    public FrameLayout d0;
    public k5 e;
    public FrameLayout e0;
    public h5 f;
    public boolean g0;
    public int h;
    public m61 h0;
    public FrameLayout i0;
    public s8 j0;
    public b8 k0;
    public float m0;
    public l5 n;
    public ValueAnimator n0;
    public ci.q o0;
    public boolean p0;
    public gi.g1 q0;
    public int r;
    public s5 r0;
    public boolean s;
    public LinearLayout t0;
    public org.telegram.ui.Components.h6 u0;
    public org.telegram.ui.Components.h6 v0;
    public e6 w0;
    public n5 x0;
    public FrameLayout y;
    public float y0;
    public float z0;
    public final lt w = new lt(this, 19);
    public final h4 x = new ms() { // from class: org.telegram.ui.Wallet.h4
        @Override // org.telegram.ui.Components.ms
        public final void a(int i3, boolean z10) {
            ai.h4 h4Var;
            w5 w5Var = w5.this;
            lt ltVar = w5Var.w;
            if ((i3 == 1 || i3 == 3) && (h4Var = w5Var.a) != null) {
                w5Var.s = z10;
                h4Var.removeCallbacks(ltVar);
                ltVar.run();
            }
        }
    };
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
    public final l41[] s0 = new l41[2];
    public final d4 H0 = new d4(this, 3);
    public final d4 L0 = new d4(this, 4);
    public final CharSequence[] P0 = new CharSequence[2];
    public final HashSet Q0 = new HashSet();

    public static boolean B0(String str) {
        if (str != null) {
            return "t.me".equalsIgnoreCase(str) || "telegram.me".equalsIgnoreCase(str) || "telegram.dog".equalsIgnoreCase(str);
        }
        return false;
    }

    public static boolean C0(Uri uri) {
        String scheme = uri.getScheme();
        if (!"ton".equalsIgnoreCase(scheme) && !"tc".equalsIgnoreCase(scheme)) {
            if (("https".equalsIgnoreCase(scheme) || "http".equalsIgnoreCase(scheme)) && B0(uri.getHost())) {
                List<String> pathSegments = uri.getPathSegments();
                if (pathSegments.size() != 1 || (!"sendgrams".equalsIgnoreCase(pathSegments.get(0)) && c1(uri) == null)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v3, types: [org.telegram.ui.Components.n61, org.telegram.ui.Wallet.w4] */
    public static void G0(Context context, int i3, TL_wallet.walletTransaction wallettransaction, p10 p10Var, n10 n10Var, byte[] bArr, org.telegram.ui.Cells.m0 m0Var, org.telegram.ui.ActionBar.e6 e6Var) {
        y2[] y2VarArr;
        View[] viewArr;
        n10 n10Var2;
        LinearLayout t02;
        TL_wallet.nftItem nftitem;
        if (context == null) {
            return;
        }
        if ((wallettransaction.peer instanceof TL_wallet.walletTransactionPeerTelegramGift) && (nftitem = wallettransaction.nft) != null) {
            TL_stars.StarGift starGift = nftitem.gift;
            if (starGift instanceof TL_stars.TL_starGiftUnique) {
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) starGift;
                ci.l6 l6Var = new ci.l6(context, i3, 0L, e6Var, null);
                l6Var.b3 = wallettransaction;
                l6Var.h2(tL_starGiftUnique.slug, tL_starGiftUnique, null);
                l6Var.show();
                return;
            }
        }
        y2[] y2VarArr2 = new y2[1];
        View[] viewArr2 = new View[1];
        j0 B = k0.x(i3).B();
        ArrayList arrayList = new ArrayList(B.c);
        int i10 = 0;
        while (true) {
            if (i10 >= arrayList.size()) {
                i10 = -1;
                break;
            } else if (arrayList.get(i10) == wallettransaction || k0.i0(wallettransaction, (TL_wallet.walletTransaction) arrayList.get(i10))) {
                break;
            } else {
                i10++;
            }
        }
        if (p10Var == null && m0Var == null && i10 >= 0) {
            Rect rect = new Rect();
            context.getResources().getDrawable(R.drawable.sheet_shadow_round).getPadding(rect);
            viewArr = viewArr2;
            ?? w4Var = new w4(context, e6Var, arrayList, B, i3, rect, viewArr);
            w4Var.setPosition(i10);
            y2VarArr = y2VarArr2;
            w4Var.setAdapter(new x4(arrayList, context, e6Var, rect, i3, y2VarArr2));
            n10Var2 = n10Var;
            t02 = w4Var;
        } else {
            y2VarArr = y2VarArr2;
            viewArr = viewArr2;
            n10Var2 = n10Var;
            t02 = t0(context, i3, wallettransaction, p10Var, n10Var, bArr, m0Var, e6Var, y2VarArr, false);
        }
        y2[] y2VarArr3 = y2VarArr;
        y4 y4Var = new y4(context, t02, e6Var, t02, viewArr, context);
        y2VarArr3[0] = y4Var;
        if ((t02 instanceof org.telegram.ui.Components.n61) && n10Var2 != null) {
            y4Var.n(new ma1(14, n10Var2, wallettransaction));
        }
        y2VarArr3[0].A0(p10Var != null);
        y2 y2Var = y2VarArr3[0];
        y2Var.U0 = false;
        y2Var.show();
    }

    public static void I0(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        int i3 = 1;
        org.telegram.ui.ActionBar.t2 l10 = org.telegram.messenger.k5.l(1, context, e6Var, false);
        FrameLayout frameLayout = new FrameLayout(context);
        int L = org.telegram.messenger.g0.L(16.0f);
        int i10 = org.telegram.ui.ActionBar.k6.h5;
        Drawable d02 = org.telegram.ui.ActionBar.k6.d0(L, org.telegram.ui.ActionBar.k6.w0(i10, e6Var));
        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i10);
        frameLayout.setBackground(d02);
        org.telegram.ui.ActionBar.r6.k(frameLayout, d02, N, null, e6Var);
        frameLayout.setPadding(org.telegram.messenger.g0.L(36.0f), 0, org.telegram.messenger.g0.L(36.0f), org.telegram.messenger.g0.L(14.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(1);
        frameLayout.addView(linearLayout, mf.c(-2.0f, -1));
        linearLayout.addView(new u6(hs.q2, context, false), mf.t(hs.q2, hs.q2, 1, 0, -12, 0, -8));
        TextView textView = new TextView(context);
        textView.setText(bd.M0(2131743107, null));
        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.j5, e6Var);
        textView.setTextSize(1, 17.0f);
        textView.setTypeface(org.telegram.messenger.g0.o1("fonts/rmedium.ttf"));
        textView.setGravity(17);
        TextView f10 = org.telegram.messenger.camera.q.f(linearLayout, textView, mf.t(-1, -2, 1, 0, 0, 0, 6), context);
        f10.setText(bd.M0(2131743106, null));
        int i11 = org.telegram.ui.ActionBar.k6.z6;
        org.telegram.ui.ActionBar.r6.V(f10, i11, e6Var);
        f10.setTextSize(1, 14.0f);
        f10.setGravity(17);
        f10.setLineSpacing(org.telegram.messenger.g0.L(1.0f), 1.0f);
        linearLayout.addView(f10, mf.t(-1, -2, 1, 0, 0, 0, 24));
        p5 p5Var = new p5(context, e6Var);
        p5Var.setPadding(org.telegram.messenger.g0.L(0.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(0.0f), org.telegram.messenger.g0.L(8.0f));
        p5Var.a(R.drawable.wallet_learn_instant, bd.M0(2131743029, null), bd.M0(2131743028, null));
        linearLayout.addView(p5Var, mf.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
        p5 p5Var2 = new p5(context, e6Var);
        p5Var2.setPadding(org.telegram.messenger.g0.L(0.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(0.0f), org.telegram.messenger.g0.L(8.0f));
        p5Var2.a(R.drawable.wallet_learn_fees, bd.M0(2131743078, null), bd.M0(2131743077, null));
        linearLayout.addView(p5Var2, mf.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
        p5 p5Var3 = new p5(context, e6Var);
        p5Var3.setPadding(org.telegram.messenger.g0.L(0.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(0.0f), org.telegram.messenger.g0.L(8.0f));
        p5Var3.a(R.drawable.wallet_learn_verified, bd.M0(2131743192, null), bd.M0(2131743191, null));
        linearLayout.addView(p5Var3, mf.k(0.0f, 0.0f, 0.0f, 14.0f, -1, -2));
        gi.d h = org.telegram.messenger.k5.h(24, context, e6Var, true);
        h.setText(bd.M0(2131743111, null));
        linearLayout.addView(h, mf.t(-1, 48, 1, 0, 0, 0, 0));
        pf.b(h, 0.02f, 1.1f);
        s70 s70Var = new s70(context, null);
        org.telegram.ui.ActionBar.r6.V(s70Var, i11, e6Var);
        s70Var.setTextSize(1, 13.0f);
        s70Var.setGravity(17);
        s70Var.setText(Q0(bd.M0(2131743016, null), org.telegram.ui.ActionBar.k6.Uc, e6Var, new e4(context, i3)));
        linearLayout.addView(s70Var, mf.k(0.0f, 12.0f, 0.0f, 6.0f, -1, -2));
        l10.O = frameLayout;
        org.telegram.ui.ActionBar.t2[] t2VarArr = {l10};
        t2VarArr[0].u0(true);
        t2VarArr[0].N();
        h.setOnClickListener(new l4(t2VarArr, i3));
        t2VarArr[0].show();
    }

    public static void J0(int i3, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        k0 x10 = k0.x(i3);
        if (x10.G()) {
            String t10 = x10.t();
            if (TextUtils.isEmpty(t10)) {
                return;
            }
            org.telegram.ui.ActionBar.t2 t2Var = new org.telegram.ui.ActionBar.t2(1, context, e6Var, false);
            t2Var.v0(-12207881);
            t2Var.O(-12207881);
            FrameLayout frameLayout = new FrameLayout(context);
            frameLayout.setBackground(new v5());
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            linearLayout.setGravity(1);
            frameLayout.addView(linearLayout, mf.f(-2.0f, -1, 55, org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(30.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f) + org.telegram.messenger.g0.n));
            u5 u5Var = new u5(context, t10);
            linearLayout.addView(u5Var, mf.r(hs.L4, hs.Z4, 1));
            TextView textView = new TextView(context);
            textView.setText(bd.M0(2131743051, null));
            textView.setTextColor(-1);
            textView.setTextSize(1, 14.0f);
            textView.setGravity(17);
            textView.setLineSpacing(org.telegram.messenger.g0.L(1.0f), 1.0f);
            linearLayout.addView(textView, mf.t(-1, -2, 1, 24, 0, 24, 20));
            gi.d dVar = new gi.d(context, null, true);
            dVar.setRoundRadius(24);
            dVar.setColor(-1);
            dVar.setTextColor(-15556886);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) "$");
            spannableStringBuilder.setSpan(new wp(R.drawable.wallet_buy, 0), 0, spannableStringBuilder.length(), 33);
            spannableStringBuilder.append((CharSequence) " ").append((CharSequence) bd.M0(2131743190, null));
            dVar.setText(spannableStringBuilder);
            linearLayout.addView(dVar, mf.t(-1, 48, 1, 0, 0, 0, 0));
            ImageView imageView = new ImageView(context);
            imageView.setImageResource(R.drawable.ic_close_white);
            imageView.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f));
            imageView.setContentDescription(bd.M0(2131752041, null));
            pf.a(imageView);
            frameLayout.addView(imageView, mf.d(48, 48.0f, 51, 4.0f, 2.0f, 0.0f, 0.0f));
            t2Var.O = frameLayout;
            t2Var.x = true;
            t2Var.v0 = false;
            t2Var.w0 = false;
            t2Var.O(-12207881);
            imageView.setOnClickListener(new c4(t2Var, 0));
            u5Var.e = new p0(t10, 1);
            t2Var.show();
            t2Var.E0(-12207881);
            org.telegram.messenger.g0.u3(t2Var, -12207881, false, null);
            org.telegram.messenger.g0.n3(t2Var, false);
            if (Build.VERSION.SDK_INT >= 29 && t2Var.getWindow() != null) {
                t2Var.getWindow().setNavigationBarContrastEnforced(false);
            }
            dVar.setOnClickListener(new ei.t5(dVar, i3, t2Var, e6Var, 7));
        }
    }

    public static SpannableStringBuilder Q0(String str, int i3, org.telegram.ui.ActionBar.e6 e6Var, Runnable runnable) {
        int i10;
        int i11;
        int indexOf = str.indexOf("**");
        int indexOf2 = str.indexOf("**", indexOf + 1);
        String replace = str.replace("**", "");
        if (indexOf < 0 || indexOf2 < 0 || (i11 = indexOf2 - indexOf) <= 2) {
            indexOf = -1;
            i10 = 0;
        } else {
            i10 = i11 - 2;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(replace);
        if (indexOf >= 0) {
            spannableStringBuilder.setSpan(new ii.k3(i3, e6Var, runnable), indexOf, i10 + indexOf, 0);
        }
        return spannableStringBuilder;
    }

    public static void Y0(l41 l41Var, boolean z10) {
        boolean canScrollVertically = l41Var.canScrollVertically(-1);
        l41Var.g3.O(z10);
        l41Var.a0();
        if (canScrollVertically) {
            return;
        }
        l41Var.f3.h1(0, 0);
    }

    public static Uri b1(String str) {
        Uri parse = Uri.parse(str.trim());
        if (parse.getScheme() == null) {
            Uri parse2 = Uri.parse("https://" + str.trim());
            if (B0(parse2.getHost())) {
                return parse2;
            }
        }
        return parse;
    }

    public static String c1(Uri uri) {
        if (!B0(uri.getHost())) {
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

    public static void d0(w5 w5Var) {
        k0 x10 = k0.x(w5Var.currentAccount);
        gi.d dVar = w5Var.D0;
        if (dVar.R) {
            return;
        }
        dVar.setLoading(true);
        boolean z10 = false;
        x10.m0(new g2.p0(x10, new e51(11, w5Var, x10), z10, z10, 4));
    }

    public static void e0(w5 w5Var) {
        sf.c.t(w5Var.getParentActivity(), k0.x(w5Var.currentAccount).j);
    }

    public static void f0(w5 w5Var) {
        J0(w5Var.currentAccount, w5Var.getParentActivity(), w5Var.getResourceProvider());
    }

    public static void g0(w5 w5Var, String str, k0 k0Var, f60 f60Var, LinearLayout linearLayout, TL_wallet.currencyRate currencyrate) {
        if (currencyrate == null) {
            return;
        }
        org.telegram.ui.ActionBar.y0 y0Var = new org.telegram.ui.ActionBar.y0(2, w5Var.getParentActivity(), w5Var.resourceProvider, false, false);
        y0Var.setPadding(org.telegram.messenger.g0.L(18.0f), 0, org.telegram.messenger.g0.L(18.0f), 0);
        y0Var.setText(currencyrate.currency);
        y0Var.setSubtext(!TextUtils.isEmpty(currencyrate.translatedTitle) ? currencyrate.translatedTitle : currencyrate.title);
        boolean equals = TextUtils.equals(str, currencyrate.currency);
        y0Var.b.setPadding(0, 0, org.telegram.messenger.g0.L(equals ? 42.0f : 0.0f), 0);
        y0Var.setChecked(equals);
        y0Var.setOnClickListener(new h1(k0Var, currencyrate, f60Var, 2));
        linearLayout.addView(y0Var, mf.o(hs.e3, -2));
    }

    public static void h0(w5 w5Var) {
        org.telegram.ui.ActionBar.k kVar;
        if (w5Var.F == null || (kVar = w5Var.actionBar) == null || !(kVar.getParent() instanceof ViewGroup)) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) w5Var.actionBar.getParent();
        viewGroup.setClipChildren(false);
        viewGroup.setClipToPadding(false);
        if (w5Var.F.getParent() != w5Var.actionBar) {
            org.telegram.messenger.g0.E2(w5Var.F);
            w5Var.actionBar.addView(w5Var.F, mf.c(-1.0f, -1));
        }
        w5Var.F.bringToFront();
        w5Var.actionBar.bringToFront();
        w5Var.F.post(new d4(w5Var, 10));
    }

    public static void i0(w5 w5Var) {
        J0(w5Var.currentAccount, w5Var.getParentActivity(), w5Var.getResourceProvider());
    }

    public static void j0(w5 w5Var, String str) {
        Uri b12 = b1(str);
        String c12 = c1(b12);
        if (c12 != null) {
            int i3 = w5Var.currentAccount;
            hp.s1(i3).d2().a(c12, null, new gi.s3(new k4(w5Var, 4), i3));
        } else {
            if ((w5Var.getParentActivity() instanceof LaunchActivity) && new m90((LaunchActivity) w5Var.getParentActivity(), w5Var.currentAccount, null, false).g(b12)) {
                return;
            }
            org.telegram.messenger.g0.h3(new d4(w5Var, 11));
        }
    }

    public static void k0(w5 w5Var, LinearLayout linearLayout, k0 k0Var, f60 f60Var) {
        TL_wallet.currencyRate currencyrate;
        w5 w5Var2;
        ArrayList<TL_wallet.currencyRate> arrayList;
        LinearLayout linearLayout2 = linearLayout;
        k0 k0Var2 = k0Var;
        linearLayout2.removeAllViews();
        String g7 = k0Var2.h.g();
        TL_wallet.currencyRates f10 = k0Var2.h.f();
        if (f10 == null) {
            for (int i3 = 0; i3 < 3; i3++) {
                iz izVar = new iz(w5Var.getParentActivity(), w5Var.getResourceProvider());
                izVar.setIsSingleCell(true);
                izVar.setViewType(31);
                linearLayout2.addView(izVar, mf.o(hs.e3, -2));
            }
            return;
        }
        f fVar = k0Var2.h;
        fVar.getClass();
        ArrayList arrayList2 = new ArrayList();
        TL_wallet.currencyRates f11 = fVar.f();
        TL_wallet.currencyRate currencyrate2 = null;
        if (f11 == null || (arrayList = f11.rates) == null) {
            currencyrate = null;
        } else {
            int size = arrayList.size();
            currencyrate = null;
            int i10 = 0;
            while (i10 < size) {
                TL_wallet.currencyRate currencyrate3 = arrayList.get(i10);
                i10++;
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
        if (f11 != null && f11.rates != null) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            linkedHashSet.add(fVar.g());
            try {
                InputMethodManager inputMethodManager = (InputMethodManager) org.telegram.messenger.t0.b.getSystemService("input_method");
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
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
            f.a(linkedHashSet, ((org.telegram.messenger.n0) hp.s1(fVar.a).x7.O.b).c);
            f.c(linkedHashSet, bd.E0().y);
            f.c(linkedHashSet, bd.E0().z);
            Iterator it3 = linkedHashSet.iterator();
            while (it3.hasNext()) {
                String str = (String) it3.next();
                if (!TextUtils.equals(str, "USD") && !TextUtils.equals(str, "EUR")) {
                    ArrayList<TL_wallet.currencyRate> arrayList3 = f11.rates;
                    int size2 = arrayList3.size();
                    int i11 = 0;
                    while (true) {
                        if (i11 < size2) {
                            TL_wallet.currencyRate currencyrate5 = arrayList3.get(i11);
                            i11++;
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
        int i12 = 0;
        while (i12 < arrayList2.size()) {
            TL_wallet.currencyRate currencyrate7 = (TL_wallet.currencyRate) arrayList2.get(i12);
            if (currencyrate7 != null && hashSet.add(currencyrate7.currency)) {
                g0(w5Var, g7, k0Var2, f60Var, linearLayout2, currencyrate7);
            }
            i12++;
            k0Var2 = k0Var;
        }
        if (hashSet.isEmpty() || f10.rates.isEmpty()) {
            w5Var2 = w5Var;
        } else {
            w5Var2 = w5Var;
            linearLayout2.addView(new org.telegram.ui.ActionBar.c1(w5Var.getParentActivity(), w5Var2.resourceProvider), mf.o(-1, 8));
        }
        int i13 = 0;
        while (i13 < f10.rates.size()) {
            TL_wallet.currencyRate currencyrate8 = f10.rates.get(i13);
            if (currencyrate8 != null && !hashSet.contains(currencyrate8.currency)) {
                g0(w5Var2, g7, k0Var, f60Var, linearLayout2, currencyrate8);
            }
            i13++;
            w5Var2 = w5Var;
            linearLayout2 = linearLayout;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void l0(final w5 w5Var, Context context, View view) {
        k0 x10 = k0.x(w5Var.currentAccount);
        final f60 I = f60.I(w5Var, view);
        I.a0(0.0f, -org.telegram.messenger.g0.L(48.0f));
        final int i3 = 0;
        I.s = 0;
        I.V(5);
        f60 J = I.J();
        J.c(R.drawable.ic_ab_back, bd.M0(2131743202, null), new xp0(I, 27), false);
        J.k();
        ScrollView scrollView = new ScrollView(context);
        LinearLayout linearLayout = new LinearLayout(context);
        final int i10 = 1;
        linearLayout.setOrientation(1);
        scrollView.addView(linearLayout);
        e7 e7Var = new e7(w5Var, linearLayout, x10, I, 11);
        J.r(scrollView, mf.o(-1, 350));
        I.c(R.drawable.wallet_globe, bd.M0(2131743158, null), new g(e7Var, I, J, 10), false);
        org.telegram.ui.ActionBar.y0 y9 = I.y();
        f fVar = x10.h;
        String i11 = fVar.i();
        boolean isEmpty = TextUtils.isEmpty(i11);
        String str = i11;
        if (isEmpty) {
            y9.setSubtext("USD");
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(bd.M0(2131748787, null));
            spannableStringBuilder.setSpan(new x70(org.telegram.messenger.g0.L(75.0f), y9.b), 0, spannableStringBuilder.length(), 33);
            str = spannableStringBuilder;
        }
        y9.setSubtext(str);
        e7 e7Var2 = new e7(x10, new boolean[]{fVar.f() != null}, y9, e7Var, 12);
        w5Var.Q0.add(e7Var2);
        e7Var.run();
        I.c(R.drawable.wallet_lock, bd.M0(2131747665, null), new Runnable(w5Var) { // from class: org.telegram.ui.Wallet.o4
            public final /* synthetic */ w5 b;

            {
                this.b = w5Var;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i3) {
                    case 0:
                        w5 w5Var2 = this.b;
                        w5Var2.getClass();
                        I.u();
                        w5Var2.presentFragment(PasscodeActivity.p0());
                        break;
                    case 1:
                        w5 w5Var3 = this.b;
                        w5Var3.getClass();
                        I.u();
                        w5Var3.presentFragment(new n8());
                        break;
                    case 2:
                        w5 w5Var4 = this.b;
                        w5Var4.getClass();
                        I.u();
                        w5Var4.presentFragment(new ha());
                        break;
                    default:
                        I.u();
                        w5 w5Var5 = this.b;
                        w5.I0(w5Var5.getParentActivity(), w5Var5.getResourceProvider());
                        break;
                }
            }
        }, false);
        I.c(R.drawable.wallet_key, bd.M0(2131743090, null), new Runnable(w5Var) { // from class: org.telegram.ui.Wallet.o4
            public final /* synthetic */ w5 b;

            {
                this.b = w5Var;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i10) {
                    case 0:
                        w5 w5Var2 = this.b;
                        w5Var2.getClass();
                        I.u();
                        w5Var2.presentFragment(PasscodeActivity.p0());
                        break;
                    case 1:
                        w5 w5Var3 = this.b;
                        w5Var3.getClass();
                        I.u();
                        w5Var3.presentFragment(new n8());
                        break;
                    case 2:
                        w5 w5Var4 = this.b;
                        w5Var4.getClass();
                        I.u();
                        w5Var4.presentFragment(new ha());
                        break;
                    default:
                        I.u();
                        w5 w5Var5 = this.b;
                        w5.I0(w5Var5.getParentActivity(), w5Var5.getResourceProvider());
                        break;
                }
            }
        }, false);
        final int i12 = 2;
        I.l(R.drawable.wallet_apps, bd.M0(2131743166, null), new Runnable(w5Var) { // from class: org.telegram.ui.Wallet.o4
            public final /* synthetic */ w5 b;

            {
                this.b = w5Var;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i12) {
                    case 0:
                        w5 w5Var2 = this.b;
                        w5Var2.getClass();
                        I.u();
                        w5Var2.presentFragment(PasscodeActivity.p0());
                        break;
                    case 1:
                        w5 w5Var3 = this.b;
                        w5Var3.getClass();
                        I.u();
                        w5Var3.presentFragment(new n8());
                        break;
                    case 2:
                        w5 w5Var4 = this.b;
                        w5Var4.getClass();
                        I.u();
                        w5Var4.presentFragment(new ha());
                        break;
                    default:
                        I.u();
                        w5 w5Var5 = this.b;
                        w5.I0(w5Var5.getParentActivity(), w5Var5.getResourceProvider());
                        break;
                }
            }
        }, true ^ x10.g.d.isEmpty());
        I.k();
        final int i13 = 3;
        I.c(R.drawable.wallet_help, bd.M0(2131742970, null), new Runnable(w5Var) { // from class: org.telegram.ui.Wallet.o4
            public final /* synthetic */ w5 b;

            {
                this.b = w5Var;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i13) {
                    case 0:
                        w5 w5Var2 = this.b;
                        w5Var2.getClass();
                        I.u();
                        w5Var2.presentFragment(PasscodeActivity.p0());
                        break;
                    case 1:
                        w5 w5Var3 = this.b;
                        w5Var3.getClass();
                        I.u();
                        w5Var3.presentFragment(new n8());
                        break;
                    case 2:
                        w5 w5Var4 = this.b;
                        w5Var4.getClass();
                        I.u();
                        w5Var4.presentFragment(new ha());
                        break;
                    default:
                        I.u();
                        w5 w5Var5 = this.b;
                        w5.I0(w5Var5.getParentActivity(), w5Var5.getResourceProvider());
                        break;
                }
            }
        }, false);
        I.p = new ma1(16, w5Var, e7Var2);
        I.Z();
    }

    public static void m0(w5 w5Var, long j10) {
        d4 d4Var = w5Var.L0;
        if (w5Var.a == null) {
            return;
        }
        s8 s8Var = w5Var.j0;
        if (s8Var != null) {
            s8Var.a();
        }
        if (w5Var.J0 <= 0.0f && w5Var.A0()) {
            int top = w5Var.a.f3.m(w5Var.h).getTop() - w5Var.a.getPaddingTop();
            w5Var.a.C0();
            if (top < 0) {
                w5Var.a.w0(0, top, xq.h);
                return;
            }
            return;
        }
        w5Var.a.C0();
        w5Var.s0(true);
        org.telegram.messenger.g0.r(d4Var);
        if (j10 > 0) {
            org.telegram.messenger.g0.i3(d4Var, j10 + 260);
        }
    }

    public static Typeface r0(Context context) {
        if (V0 == null) {
            if (Build.VERSION.SDK_INT >= 26) {
                V0 = new Typeface.Builder(context.getAssets(), "fonts/rmono_var.ttf").setFontVariationSettings("'wght' 500").setWeight(500).build();
            } else {
                V0 = org.telegram.messenger.g0.o1("fonts/rmono.ttf");
            }
        }
        return V0;
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x03aa  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x03db A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x03ec  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x05c2  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x064c  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0697  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0633  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0561  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static LinearLayout t0(final Context context, int i3, TL_wallet.walletTransaction wallettransaction, p10 p10Var, n10 n10Var, byte[] bArr, Runnable runnable, org.telegram.ui.ActionBar.e6 e6Var, y2[] y2VarArr, boolean z10) {
        String t10;
        String str;
        z4 z4Var;
        TextView textView;
        ImageView imageView;
        ImageView imageView2;
        float f10;
        int i10;
        ImageView imageView3;
        rx0 rx0Var;
        SpannableString[] spannableStringArr;
        LinearLayout linearLayout;
        String[] strArr;
        boolean[] zArr;
        TextView[] textViewArr;
        TL_wallet.walletTransaction wallettransaction2;
        a5 a5Var;
        int i11;
        c5 c5Var;
        final y2[] y2VarArr2;
        char c2;
        Object s6;
        int i12;
        final FrameLayout frameLayout;
        final org.telegram.ui.ActionBar.e6 e6Var2 = e6Var;
        boolean z11 = p10Var != null;
        final LinearLayout f11 = org.telegram.messenger.k5.f(context, 1);
        FrameLayout frameLayout2 = new FrameLayout(context);
        f11.addView(frameLayout2, mf.o(-1, 56));
        int i13 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.k6.w0(i13, e6Var2);
        int i14 = org.telegram.ui.ActionBar.k6.i6;
        int w02 = org.telegram.ui.ActionBar.k6.w0(i14, e6Var2);
        ImageView imageView4 = new ImageView(context);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView4.setScaleType(scaleType);
        imageView4.setImageResource(R.drawable.ic_ab_close);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        org.telegram.ui.ActionBar.r6.t(imageView4, i13, e6Var2, mode);
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.k6.h0(w02, 1, -1);
        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i14);
        imageView4.setBackground(h02);
        org.telegram.ui.ActionBar.r6.k(imageView4, h02, null, N, e6Var2);
        imageView4.setContentDescription(bd.M0(2131752041, null));
        frameLayout2.addView(imageView4, mf.d(48, 48.0f, 19, 4.0f, -2.0f, 0.0f, 0.0f));
        ImageView imageView5 = new ImageView(context);
        imageView5.setScaleType(scaleType);
        imageView5.setImageResource(R.drawable.ic_ab_other);
        org.telegram.ui.ActionBar.r6.t(imageView5, i13, e6Var2, mode);
        org.telegram.ui.Cells.y h03 = org.telegram.ui.ActionBar.k6.h0(w02, 1, -1);
        org.telegram.ui.ActionBar.n6 N2 = org.telegram.ui.ActionBar.r6.N(i14);
        imageView5.setBackground(h03);
        org.telegram.ui.ActionBar.r6.k(imageView5, h03, null, N2, e6Var2);
        imageView5.setContentDescription(bd.M0(2131754839, null));
        imageView5.setVisibility(p10Var != null ? 8 : 0);
        frameLayout2.addView(imageView5, mf.d(44, 48.0f, 21, 0.0f, 2.0f, 4.0f, 0.0f));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        linearLayout2.setGravity(1);
        f11.addView(linearLayout2, mf.k(14.0f, wallettransaction.key_change ? -20.0f : -40.0f, 14.0f, 24.0f, -1, -2));
        View u6Var = new u6(120, context, z10);
        u6Var.setTag(u6.class);
        linearLayout2.addView(u6Var, mf.t(120, 120, 1, 0, 0, 0, -8));
        z4 z4Var2 = new z4(context);
        z4Var2.setSingleLine(true);
        z4Var2.setGravity(17);
        z4Var2.setIncludeFontPadding(false);
        z4Var2.setTextSize(1, 40.0f);
        z4Var2.setTypeface(org.telegram.messenger.g0.o());
        linearLayout2.addView(z4Var2, mf.r(-1, 50, 1));
        TextView textView2 = new TextView(context);
        textView2.setGravity(17);
        textView2.setIncludeFontPadding(false);
        textView2.setTextSize(1, 14.0f);
        int i15 = org.telegram.ui.ActionBar.k6.z6;
        org.telegram.ui.ActionBar.r6.V(textView2, i15, e6Var2);
        linearLayout2.addView(textView2, mf.t(-1, 20, 1, 0, 3, 0, 0));
        if (wallettransaction.key_change) {
            linearLayout2.removeAllViews();
            FrameLayout frameLayout3 = new FrameLayout(context);
            frameLayout3.setBackground(org.telegram.ui.ActionBar.k6.M(org.telegram.messenger.g0.L(76.0f), -7956054, -9534569));
            ImageView imageView6 = new ImageView(context);
            imageView6.setImageResource(R.drawable.wallet_transaction_key);
            imageView6.setScaleType(ImageView.ScaleType.FIT_CENTER);
            frameLayout3.addView(imageView6, mf.e(44, 44, 17));
            linearLayout2.addView(frameLayout3, mf.r(76, 76, 1));
            TextView textView3 = new TextView(context);
            textView3.setText(bd.M0(2131743091, null));
            org.telegram.messenger.k5.n(textView3, i13, e6Var2, 1, 18.0f);
            textView3.setGravity(17);
            textView3.setIncludeFontPadding(false);
            linearLayout2.addView(textView3, mf.t(-1, 24, 1, 12, 12, 12, 0));
        } else if (wallettransaction.nft != null) {
            linearLayout2.removeAllViews();
            TL_wallet.nftItem nftitem = wallettransaction.nft;
            org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9(context);
            k9Var.setRoundRadius(org.telegram.messenger.g0.L(12.0f));
            k9Var.setContentDescription(nftitem.name);
            Drawable mutate = context.getResources().getDrawable(R.drawable.wallet_nft_placeholder).mutate();
            org.telegram.ui.ActionBar.r6.y(k9Var, mutate, i15, e6Var2, mode);
            ac c10 = c.c(nftitem, false);
            if (c10 != null) {
                k9Var.j(c10, "120_120", mutate, nftitem);
            } else {
                k9Var.setImageDrawable(mutate);
            }
            linearLayout2.addView(k9Var, mf.r(120, 120, 1));
            TextView textView4 = new TextView(context);
            textView4.setText(TextUtils.isEmpty(nftitem.name) ? bd.M0(2131743186, null) : nftitem.name);
            org.telegram.messenger.k5.n(textView4, i13, e6Var2, 1, 17.0f);
            textView4.setGravity(17);
            linearLayout2.addView(textView4, mf.k(12.0f, 16.0f, 12.0f, 0.0f, -1, -2));
            if (wallettransaction.incoming) {
                t10 = k0.x(i3).t();
            } else {
                TL_wallet.WalletTransactionPeer walletTransactionPeer = wallettransaction.peer;
                if (walletTransactionPeer == null) {
                    str = null;
                    if (p10Var == null) {
                        if (wallettransaction.comment_encrypted || wallettransaction.comment_encrypted_preparing) {
                            f10 = 11.0f;
                            if (wallettransaction.comment_encrypted_preparing || !TextUtils.isEmpty(str)) {
                                yh.l lVar = new yh.l(context, e6Var2, false);
                                lVar.r = false;
                                lVar.setTextSize(1, 15.0f);
                                org.telegram.ui.ActionBar.r6.V(lVar, i13, e6Var2);
                                StringBuilder sb2 = new StringBuilder(25);
                                int i16 = 0;
                                for (int i17 = 25; i16 < i17; i17 = 25) {
                                    sb2.append("a");
                                    i16++;
                                }
                                SpannableString spannableString = new SpannableString(sb2.toString());
                                ty0 ty0Var = new ty0();
                                ty0Var.a |= 256;
                                spannableString.setSpan(new uy0(ty0Var, 0), 0, spannableString.length(), 33);
                                lVar.setText(spannableString);
                                org.telegram.ui.ActionBar.t4 t4Var = new org.telegram.ui.ActionBar.t4(0, false, false, null);
                                t4Var.x = false;
                                t4Var.w = Integer.valueOf(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Xl, e6Var2));
                                lVar.setBackground(t4Var);
                                lVar.setPadding(org.telegram.messenger.g0.L(19.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(15.0f), org.telegram.messenger.g0.L(11.0f));
                                linearLayout2.addView(lVar, mf.t(-2, -2, 1, 32, 15, 32, 0));
                                pf.a(lVar);
                                i10 = 1;
                                textView = textView2;
                                z4Var = z4Var2;
                                imageView = imageView4;
                                imageView2 = imageView5;
                                lVar.setOnClickListener(new ci.ia(new boolean[]{false}, y2VarArr, e6Var2, lVar, wallettransaction, i3, str));
                                SpannableString[] spannableStringArr2 = new SpannableString[i10];
                                TextView[] textViewArr2 = new TextView[i10];
                                rx0 rx0Var2 = new rx0(context, e6Var2);
                                f11.addView(rx0Var2, mf.k(14.0f, 0.0f, 14.0f, 0.0f, -1, -2));
                                final String[] strArr2 = {wallettransaction.comment};
                                final boolean[] zArr2 = {(wallettransaction.comment_encrypted || (z11 && bArr == null)) ? false : true};
                                if (p10Var == null) {
                                    FrameLayout frameLayout4 = new FrameLayout(context);
                                    int L = org.telegram.messenger.g0.L(22.0f);
                                    int L2 = org.telegram.messenger.g0.L(22.0f);
                                    int i18 = org.telegram.ui.ActionBar.k6.a7;
                                    ShapeDrawable e02 = org.telegram.ui.ActionBar.k6.e0(L, L2, org.telegram.ui.ActionBar.k6.w0(i18, e6Var2));
                                    org.telegram.ui.ActionBar.n6 N3 = org.telegram.ui.ActionBar.r6.N(i18);
                                    frameLayout4.setBackground(e02);
                                    org.telegram.ui.ActionBar.r6.k(frameLayout4, e02, N3, null, e6Var2);
                                    final ma1 ma1Var = new ma1(13, textViewArr2, spannableStringArr2);
                                    final Runnable[] runnableArr = new Runnable[1];
                                    final yd ydVar = new yd(runnableArr, textViewArr2, i3, e6Var2, wallettransaction, strArr2, zArr2, bArr);
                                    rx0Var = rx0Var2;
                                    textViewArr = textViewArr2;
                                    wallettransaction2 = wallettransaction;
                                    a5 a5Var2 = new a5(context, e6Var2);
                                    a5Var2.setHint(bd.M0(2131743069, null));
                                    a5Var2.setText(strArr2[0]);
                                    ImageView imageView7 = imageView;
                                    a5Var2.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(f10), org.telegram.messenger.g0.L(64.0f), org.telegram.messenger.g0.L(12.0f));
                                    int i19 = org.telegram.ui.ActionBar.k6.G6;
                                    org.telegram.ui.ActionBar.r6.V(a5Var2, i19, e6Var2);
                                    org.telegram.ui.ActionBar.n6 L3 = org.telegram.ui.ActionBar.r6.L(0.65f, i19);
                                    org.telegram.ui.ActionBar.r6.o(a5Var2, 1, L3.a, -1, 2, L3.d, e6Var);
                                    a5Var2.setMaxLines(4);
                                    frameLayout4.addView(a5Var2, mf.d(-1, -2.0f, hs.E1, 0.0f, 0.0f, (wallettransaction2.nft != null || bArr == null) ? 0.0f : 44.0f, 0.0f));
                                    a5Var2.addTextChangedListener(new b5(strArr2, ma1Var, runnableArr, ydVar));
                                    if (wallettransaction2.nft != null || bArr == null) {
                                        frameLayout = frameLayout4;
                                        e6Var2 = e6Var;
                                        imageView3 = imageView7;
                                        spannableStringArr = spannableStringArr2;
                                        strArr = strArr2;
                                        linearLayout = f11;
                                        a5Var = a5Var2;
                                        zArr = zArr2;
                                    } else {
                                        FrameLayout frameLayout5 = new FrameLayout(context);
                                        pf.a(frameLayout5);
                                        final ImageView imageView8 = new ImageView(context);
                                        frameLayout5.addView(imageView8, mf.c(-1.0f, -1));
                                        imageView8.setScaleType(ImageView.ScaleType.CENTER);
                                        org.telegram.ui.ActionBar.r6.t(imageView8, zArr2[0] ? org.telegram.ui.ActionBar.k6.Ci : org.telegram.ui.ActionBar.k6.z6, e6Var, PorterDuff.Mode.SRC_IN);
                                        imageView8.setImageResource(zArr2[0] ? R.drawable.wallet_comment_locked : R.drawable.wallet_comment_unlocked);
                                        int i20 = org.telegram.ui.ActionBar.k6.i6;
                                        org.telegram.ui.Cells.y h04 = org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.w0(i20, e6Var), 1, -1);
                                        org.telegram.ui.ActionBar.n6 N4 = org.telegram.ui.ActionBar.r6.N(i20);
                                        imageView8.setBackground(h04);
                                        org.telegram.ui.ActionBar.r6.k(imageView8, h04, null, N4, e6Var);
                                        final gi.l3[] l3VarArr = new gi.l3[1];
                                        frameLayout = frameLayout4;
                                        e6Var2 = e6Var;
                                        imageView3 = imageView7;
                                        spannableStringArr = spannableStringArr2;
                                        a5Var = a5Var2;
                                        zArr = zArr2;
                                        linearLayout = f11;
                                        strArr = strArr2;
                                        frameLayout5.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Wallet.n4
                                            @Override // android.view.View.OnClickListener
                                            public final void onClick(View view) {
                                                final boolean[] zArr3 = zArr2;
                                                zArr3[0] = !zArr3[0];
                                                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
                                                final AtomicBoolean atomicBoolean = new AtomicBoolean();
                                                final ImageView imageView9 = imageView8;
                                                final org.telegram.ui.ActionBar.e6 e6Var3 = e6Var2;
                                                duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Wallet.r4
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
                                                            org.telegram.ui.ActionBar.r6.t(imageView10, zArr4[0] ? org.telegram.ui.ActionBar.k6.Ci : org.telegram.ui.ActionBar.k6.z6, e6Var3, PorterDuff.Mode.SRC_IN);
                                                            imageView10.setImageResource(zArr4[0] ? R.drawable.wallet_comment_locked : R.drawable.wallet_comment_unlocked);
                                                        }
                                                    }
                                                });
                                                duration.setInterpolator(xq.h);
                                                duration.setDuration(420L);
                                                duration.start();
                                                gi.l3[] l3VarArr2 = l3VarArr;
                                                gi.l3 l3Var = l3VarArr2[0];
                                                if (l3Var != null) {
                                                    l3Var.f(true);
                                                    l3VarArr2[0] = null;
                                                }
                                                LinearLayout linearLayout3 = f11;
                                                if (linearLayout3.getParent() instanceof FrameLayout) {
                                                    FrameLayout frameLayout6 = (FrameLayout) linearLayout3.getParent();
                                                    gi.l3 l3Var2 = new gi.l3(context, 3);
                                                    l3VarArr2[0] = l3Var2;
                                                    l3Var2.t();
                                                    l3Var2.setPadding(org.telegram.messenger.g0.L(10.0f), 0, org.telegram.messenger.g0.L(10.0f), 0);
                                                    l3Var2.u(bd.M0(zArr3[0] ? 2131743057 : 2131743052, null));
                                                    l3Var2.setTranslationY(-(org.telegram.messenger.g0.L(44.0f) + (linearLayout3.getHeight() - frameLayout.getBottom())));
                                                    l3Var2.p(1.0f, -org.telegram.messenger.g0.L(26.0f));
                                                    l3Var2.s(20.0f);
                                                    float L4 = org.telegram.messenger.g0.L(12.0f);
                                                    float L5 = org.telegram.messenger.g0.L(4.0f);
                                                    int r12 = org.telegram.ui.ActionBar.k6.r1(0.25f, -16777216);
                                                    l3Var2.j0 = L4;
                                                    l3Var2.k0 = L5;
                                                    l3Var2.l0 = r12;
                                                    l3Var2.G.setShadowLayer(L4, 0.0f, L5, r12);
                                                    frameLayout6.addView(l3Var2, mf.e(-1, hs.e3, 87));
                                                    l3Var2.w();
                                                    l3Var2.r0 = new l(l3Var2, 7);
                                                }
                                                if (TextUtils.isEmpty(strArr2[0])) {
                                                    return;
                                                }
                                                ma1Var.run();
                                                Runnable[] runnableArr2 = runnableArr;
                                                Runnable runnable2 = runnableArr2[0];
                                                if (runnable2 != null) {
                                                    runnable2.run();
                                                    runnableArr2[0] = null;
                                                }
                                                yd ydVar2 = ydVar;
                                                org.telegram.messenger.g0.r(ydVar2);
                                                org.telegram.messenger.g0.i3(ydVar2, 1000L);
                                            }
                                        });
                                        frameLayout.addView(frameLayout5, mf.e(44, 44, 85));
                                    }
                                    linearLayout.addView(frameLayout, mf.k(14.0f, 12.0f, 14.0f, 8.0f, -1, -2));
                                } else {
                                    imageView3 = imageView;
                                    rx0Var = rx0Var2;
                                    spannableStringArr = spannableStringArr2;
                                    linearLayout = f11;
                                    strArr = strArr2;
                                    zArr = zArr2;
                                    textViewArr = textViewArr2;
                                    wallettransaction2 = wallettransaction;
                                    a5Var = null;
                                }
                                gi.d h = org.telegram.messenger.k5.h(24, context, e6Var2, true);
                                h.setText(bd.M0(2131747839, null));
                                linearLayout.addView(h, mf.k(14.0f, 14.0f, 14.0f, 14.0f, -1, 48));
                                TL_wallet.walletTransaction[] wallettransactionArr = {wallettransaction2};
                                ei.s sVar = new ei.s(linearLayout, z4Var, e6Var2, i3, textView, y2VarArr, rx0Var, p10Var, context, textViewArr, spannableStringArr);
                                LinearLayout linearLayout3 = linearLayout;
                                linearLayout3.setTag(new ma1(15, sVar, wallettransactionArr));
                                sVar.a(wallettransaction2);
                                if (z11) {
                                    i11 = i3;
                                    c5 c5Var2 = new c5(i11, wallettransactionArr, sVar);
                                    if (wallettransaction2.preview) {
                                        k0 x10 = k0.x(i11);
                                        String str2 = wallettransaction2.id;
                                        m mVar = new m(wallettransaction2, sVar, wallettransactionArr, 4);
                                        HashMap hashMap = x10.K;
                                        j0 j0Var = x10.n;
                                        if (j0Var != null) {
                                            ArrayList arrayList = j0Var.c;
                                            int size = arrayList.size();
                                            int i21 = 0;
                                            while (i21 < size) {
                                                Object obj = arrayList.get(i21);
                                                i21++;
                                                TL_wallet.walletTransaction wallettransaction3 = (TL_wallet.walletTransaction) obj;
                                                if (TextUtils.equals(wallettransaction3.id, str2)) {
                                                    mVar.a(wallettransaction3);
                                                    break;
                                                }
                                            }
                                        }
                                        if (hashMap.get(str2) != null) {
                                            mVar.a((TL_wallet.walletTransaction) hashMap.get(str2));
                                        } else {
                                            TL_wallet.getTransactionsByIDs gettransactionsbyids = new TL_wallet.getTransactionsByIDs();
                                            gettransactionsbyids.id.add(str2);
                                            ConnectionsManager.getInstance(x10.a).sendRequestTyped(gettransactionsbyids, new c3.b(1), new j(x10, (Object) mVar, (Object) str2, 4));
                                        }
                                    }
                                    c5Var = c5Var2;
                                } else {
                                    i11 = i3;
                                    c5Var = null;
                                }
                                String[] strArr3 = strArr;
                                boolean[] zArr3 = zArr;
                                linearLayout3.addOnAttachStateChangeListener(new d5(sVar, wallettransactionArr, c5Var, i11, n10Var, y2VarArr, strArr3, zArr3));
                                if (p10Var == null) {
                                    TL_wallet.nftItem nftitem2 = wallettransaction2.nft;
                                    if (nftitem2 != null) {
                                        s6 = TextUtils.isEmpty(nftitem2.name) ? bd.M0(2131743186, null) : wallettransaction2.nft.name;
                                        i12 = 1;
                                        c2 = 0;
                                    } else {
                                        long abs = Math.abs(wallettransaction2.amount);
                                        c2 = 0;
                                        s6 = k0.s(abs, false);
                                        i12 = 1;
                                    }
                                    Object[] objArr = new Object[i12];
                                    objArr[c2] = s6;
                                    h.setText(bd.V(null, null, 2131743031, objArr));
                                    y2VarArr2 = y2VarArr;
                                    h.setOnClickListener(new org.telegram.messenger.video.f(h, a5Var, p10Var, strArr3, zArr3, y2VarArr2, e6Var));
                                } else {
                                    y2VarArr2 = y2VarArr;
                                    final int i22 = 0;
                                    if (runnable != null) {
                                        h.setText(bd.M0(2131743070, null));
                                        h.setOnClickListener(new hb0(26, runnable, y2VarArr2));
                                    } else {
                                        h.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Wallet.m4
                                            @Override // android.view.View.OnClickListener
                                            public final void onClick(View view) {
                                                switch (i22) {
                                                    case 0:
                                                        y2VarArr2[0].dismiss();
                                                        break;
                                                    default:
                                                        y2VarArr2[0].dismiss();
                                                        break;
                                                }
                                            }
                                        });
                                    }
                                }
                                final int i23 = 1;
                                imageView3.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Wallet.m4
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view) {
                                        switch (i23) {
                                            case 0:
                                                y2VarArr2[0].dismiss();
                                                break;
                                            default:
                                                y2VarArr2[0].dismiss();
                                                break;
                                        }
                                    }
                                });
                                ImageView imageView9 = imageView2;
                                imageView9.setOnClickListener(new ci.ga(y2VarArr2, e6Var, imageView9, wallettransactionArr, context, i3));
                                return linearLayout3;
                            }
                        } else if (TextUtils.isEmpty(wallettransaction.comment)) {
                            f10 = 11.0f;
                        } else {
                            yh.l lVar2 = new yh.l(context);
                            lVar2.setTextSize(1, 15.0f);
                            org.telegram.ui.ActionBar.r6.V(lVar2, i13, e6Var2);
                            f10 = 11.0f;
                            lVar2.setText(org.telegram.messenger.i6.m(wallettransaction.comment, lVar2.getPaint().getFontMetricsInt(), false, null, 0));
                            lVar2.setTextIsSelectable(true);
                            org.telegram.ui.ActionBar.t4 t4Var2 = new org.telegram.ui.ActionBar.t4(0, false, false, null);
                            t4Var2.x = false;
                            t4Var2.w = Integer.valueOf(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Xl, e6Var2));
                            lVar2.setBackground(t4Var2);
                            lVar2.setPadding(org.telegram.messenger.g0.L(19.0f), org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(15.0f), org.telegram.messenger.g0.L(8.0f));
                            linearLayout2.addView(lVar2, mf.t(-2, -2, 1, 32, 16, 32, 0));
                        }
                        z4Var = z4Var2;
                        textView = textView2;
                        imageView = imageView4;
                        imageView2 = imageView5;
                    } else {
                        z4Var = z4Var2;
                        textView = textView2;
                        imageView = imageView4;
                        imageView2 = imageView5;
                        f10 = 11.0f;
                    }
                    i10 = 1;
                    SpannableString[] spannableStringArr22 = new SpannableString[i10];
                    TextView[] textViewArr22 = new TextView[i10];
                    rx0 rx0Var22 = new rx0(context, e6Var2);
                    f11.addView(rx0Var22, mf.k(14.0f, 0.0f, 14.0f, 0.0f, -1, -2));
                    final String[] strArr22 = {wallettransaction.comment};
                    final boolean[] zArr22 = {(wallettransaction.comment_encrypted || (z11 && bArr == null)) ? false : true};
                    if (p10Var == null) {
                    }
                    gi.d h7 = org.telegram.messenger.k5.h(24, context, e6Var2, true);
                    h7.setText(bd.M0(2131747839, null));
                    linearLayout.addView(h7, mf.k(14.0f, 14.0f, 14.0f, 14.0f, -1, 48));
                    TL_wallet.walletTransaction[] wallettransactionArr2 = {wallettransaction2};
                    ei.s sVar2 = new ei.s(linearLayout, z4Var, e6Var2, i3, textView, y2VarArr, rx0Var, p10Var, context, textViewArr, spannableStringArr);
                    LinearLayout linearLayout32 = linearLayout;
                    linearLayout32.setTag(new ma1(15, sVar2, wallettransactionArr2));
                    sVar2.a(wallettransaction2);
                    if (z11) {
                    }
                    String[] strArr32 = strArr;
                    boolean[] zArr32 = zArr;
                    linearLayout32.addOnAttachStateChangeListener(new d5(sVar2, wallettransactionArr2, c5Var, i11, n10Var, y2VarArr, strArr32, zArr32));
                    if (p10Var == null) {
                    }
                    final int i232 = 1;
                    imageView3.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Wallet.m4
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i232) {
                                case 0:
                                    y2VarArr2[0].dismiss();
                                    break;
                                default:
                                    y2VarArr2[0].dismiss();
                                    break;
                            }
                        }
                    });
                    ImageView imageView92 = imageView2;
                    imageView92.setOnClickListener(new ci.ga(y2VarArr2, e6Var, imageView92, wallettransactionArr2, context, i3));
                    return linearLayout32;
                }
                t10 = walletTransactionPeer.address;
            }
            str = t10;
            if (p10Var == null) {
            }
            i10 = 1;
            SpannableString[] spannableStringArr222 = new SpannableString[i10];
            TextView[] textViewArr222 = new TextView[i10];
            rx0 rx0Var222 = new rx0(context, e6Var2);
            f11.addView(rx0Var222, mf.k(14.0f, 0.0f, 14.0f, 0.0f, -1, -2));
            final String[] strArr222 = {wallettransaction.comment};
            final boolean[] zArr222 = {(wallettransaction.comment_encrypted || (z11 && bArr == null)) ? false : true};
            if (p10Var == null) {
            }
            gi.d h72 = org.telegram.messenger.k5.h(24, context, e6Var2, true);
            h72.setText(bd.M0(2131747839, null));
            linearLayout.addView(h72, mf.k(14.0f, 14.0f, 14.0f, 14.0f, -1, 48));
            TL_wallet.walletTransaction[] wallettransactionArr22 = {wallettransaction2};
            ei.s sVar22 = new ei.s(linearLayout, z4Var, e6Var2, i3, textView, y2VarArr, rx0Var, p10Var, context, textViewArr, spannableStringArr);
            LinearLayout linearLayout322 = linearLayout;
            linearLayout322.setTag(new ma1(15, sVar22, wallettransactionArr22));
            sVar22.a(wallettransaction2);
            if (z11) {
            }
            String[] strArr322 = strArr;
            boolean[] zArr322 = zArr;
            linearLayout322.addOnAttachStateChangeListener(new d5(sVar22, wallettransactionArr22, c5Var, i11, n10Var, y2VarArr, strArr322, zArr322));
            if (p10Var == null) {
            }
            final int i2322 = 1;
            imageView3.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Wallet.m4
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i2322) {
                        case 0:
                            y2VarArr2[0].dismiss();
                            break;
                        default:
                            y2VarArr2[0].dismiss();
                            break;
                    }
                }
            });
            ImageView imageView922 = imageView2;
            imageView922.setOnClickListener(new ci.ga(y2VarArr2, e6Var, imageView922, wallettransactionArr22, context, i3));
            return linearLayout322;
        }
        if (wallettransaction.incoming) {
        }
        str = t10;
        if (p10Var == null) {
        }
        i10 = 1;
        SpannableString[] spannableStringArr2222 = new SpannableString[i10];
        TextView[] textViewArr2222 = new TextView[i10];
        rx0 rx0Var2222 = new rx0(context, e6Var2);
        f11.addView(rx0Var2222, mf.k(14.0f, 0.0f, 14.0f, 0.0f, -1, -2));
        final String[] strArr2222 = {wallettransaction.comment};
        final boolean[] zArr2222 = {(wallettransaction.comment_encrypted || (z11 && bArr == null)) ? false : true};
        if (p10Var == null) {
        }
        gi.d h722 = org.telegram.messenger.k5.h(24, context, e6Var2, true);
        h722.setText(bd.M0(2131747839, null));
        linearLayout.addView(h722, mf.k(14.0f, 14.0f, 14.0f, 14.0f, -1, 48));
        TL_wallet.walletTransaction[] wallettransactionArr222 = {wallettransaction2};
        ei.s sVar222 = new ei.s(linearLayout, z4Var, e6Var2, i3, textView, y2VarArr, rx0Var, p10Var, context, textViewArr, spannableStringArr);
        LinearLayout linearLayout3222 = linearLayout;
        linearLayout3222.setTag(new ma1(15, sVar222, wallettransactionArr222));
        sVar222.a(wallettransaction2);
        if (z11) {
        }
        String[] strArr3222 = strArr;
        boolean[] zArr3222 = zArr;
        linearLayout3222.addOnAttachStateChangeListener(new d5(sVar222, wallettransactionArr222, c5Var, i11, n10Var, y2VarArr, strArr3222, zArr3222));
        if (p10Var == null) {
        }
        final int i23222 = 1;
        imageView3.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Wallet.m4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i23222) {
                    case 0:
                        y2VarArr2[0].dismiss();
                        break;
                    default:
                        y2VarArr2[0].dismiss();
                        break;
                }
            }
        });
        ImageView imageView9222 = imageView2;
        imageView9222.setOnClickListener(new ci.ga(y2VarArr2, e6Var, imageView9222, wallettransactionArr222, context, i3));
        return linearLayout3222;
    }

    public static String v0(String str) {
        StringBuilder sb2 = new StringBuilder((str.length() / 4) + str.length());
        for (int i3 = 0; i3 < str.length(); i3++) {
            if (i3 > 0 && i3 % 4 == 0) {
                sb2.append(' ');
            }
            sb2.append(str.charAt(i3));
        }
        return sb2.toString();
    }

    public static SpannableStringBuilder w0(int i3, long j10, org.telegram.ui.ActionBar.e6 e6Var) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("G ");
        wp wpVar = new wp(R.drawable.wallet_gram_small, 2);
        wpVar.d = false;
        wpVar.c(org.telegram.messenger.g0.L(16.0f));
        spannableStringBuilder.setSpan(wpVar, 0, 1, 33);
        BigDecimal movePointLeft = new BigDecimal(j10).movePointLeft(9);
        spannableStringBuilder.append((CharSequence) (movePointLeft.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : movePointLeft.stripTrailingZeros()).toPlainString());
        CharSequence m10 = k0.x(i3).m(j10, true);
        if (!TextUtils.isEmpty(m10)) {
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) "  ~\u2009").append(m10);
            spannableStringBuilder.setSpan(new tz(org.telegram.ui.ActionBar.k6.z6, e6Var), length, spannableStringBuilder.length(), 33);
        }
        return spannableStringBuilder;
    }

    public final boolean A0() {
        View m10;
        ai.h4 h4Var = this.a;
        return h4Var != null && (m10 = h4Var.f3.m(this.h)) != null && this.z0 < 0.5f && m10.getBottom() > this.a.getPaddingTop();
    }

    public final void D0() {
        c0 c0Var;
        l41 l41Var = this.s0[1];
        if (this.f0 != 1 || l41Var == null || !l41Var.H || (c0Var = this.F0) == null || c0Var.i || c0Var.g || c0Var.k != null || l41Var.f3.N0() < l41Var.g3.E.size() - 3) {
            return;
        }
        this.F0.e();
    }

    public final void E0() {
        j0 j0Var;
        l41 l41Var = this.s0[0];
        if (l41Var == null || !l41Var.H || (j0Var = this.E0) == null || j0Var.h || l41Var.f3.N0() < l41Var.g3.E.size() - 3) {
            return;
        }
        this.E0.h();
    }

    public final CharSequence F0(int i3) {
        CharSequence[] charSequenceArr = this.P0;
        if (charSequenceArr[i3] == null) {
            charSequenceArr[i3] = new SpannableString("l");
            x70 x70Var = new x70(org.telegram.messenger.g0.L(i3 == 0 ? 100.0f : 50.0f), i3 == 0 ? this.u0 : this.v0);
            x70Var.a(org.telegram.ui.ActionBar.k6.r1(0.45f, -1), org.telegram.ui.ActionBar.k6.r1(0.2f, -1));
            CharSequence charSequence = charSequenceArr[i3];
            ((SpannableString) charSequence).setSpan(x70Var, 0, charSequence.length(), 33);
        }
        return charSequenceArr[i3];
    }

    public final void H0(TL_wallet.nftItem nftitem) {
        TL_stars.StarGift starGift = nftitem.gift;
        String str = null;
        if (starGift instanceof TL_stars.TL_starGiftUnique) {
            TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) starGift;
            ci.l6 l6Var = new ci.l6(getParentActivity(), this.currentAccount, 0L, getResourceProvider(), null);
            l6Var.Y2 = nftitem;
            if (this.k0 != null) {
                l6Var.Z2 = new e5(this, tL_starGiftUnique, nftitem);
                l6Var.a3 = new f5(this, nftitem);
            }
            l6Var.h2(tL_starGiftUnique.slug, tL_starGiftUnique, null);
            showDialog(l6Var);
            return;
        }
        Activity parentActivity = getParentActivity();
        org.telegram.ui.ActionBar.e6 resourceProvider = getResourceProvider();
        if (parentActivity != null) {
            int i3 = org.telegram.ui.ActionBar.k6.a7;
            int w02 = org.telegram.ui.ActionBar.k6.w0(i3, resourceProvider);
            int i10 = org.telegram.ui.ActionBar.k6.G6;
            org.telegram.ui.ActionBar.k6.w0(i10, resourceProvider);
            u4 u4Var = new u4(1, parentActivity, resourceProvider, false);
            u4Var.b0 = i3;
            u4Var.v0(w02);
            u4Var.O(w02);
            ScrollView scrollView = new ScrollView(parentActivity);
            scrollView.setFillViewport(true);
            scrollView.setVerticalScrollBarEnabled(false);
            LinearLayout linearLayout = new LinearLayout(parentActivity);
            linearLayout.setOrientation(1);
            linearLayout.setGravity(1);
            float f10 = 12.0f;
            linearLayout.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(28.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f));
            scrollView.addView(linearLayout, new FrameLayout.LayoutParams(-1, -2));
            org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9(parentActivity);
            k9Var.setRoundRadius(org.telegram.messenger.g0.L(12.0f));
            k9Var.setContentDescription(nftitem.name);
            Drawable mutate = parentActivity.getResources().getDrawable(R.drawable.wallet_nft_placeholder).mutate();
            int i11 = org.telegram.ui.ActionBar.k6.z6;
            org.telegram.ui.ActionBar.r6.y(k9Var, mutate, i11, resourceProvider, PorterDuff.Mode.SRC_IN);
            ac c2 = c.c(nftitem, false);
            if (c2 != null) {
                k9Var.j(c2, "120_120", mutate, nftitem);
            } else {
                k9Var.setImageDrawable(mutate);
            }
            linearLayout.addView(k9Var, mf.r(120, 120, 1));
            TextView textView = new TextView(parentActivity);
            textView.setText(TextUtils.isEmpty(nftitem.name) ? bd.M0(2131743186, null) : nftitem.name);
            org.telegram.messenger.k5.n(textView, i10, resourceProvider, 1, 17.0f);
            int i12 = 17;
            textView.setGravity(17);
            linearLayout.addView(textView, mf.k(12.0f, 16.0f, 12.0f, 0.0f, -1, -2));
            TextView textView2 = new TextView(parentActivity);
            textView2.setText(nftitem.description);
            org.telegram.ui.ActionBar.r6.V(textView2, i11, resourceProvider);
            textView2.setTextSize(1, 14.0f);
            textView2.setGravity(17);
            textView2.setVisibility(TextUtils.isEmpty(nftitem.description) ? 8 : 0);
            linearLayout.addView(textView2, mf.k(12.0f, 4.0f, 12.0f, 0.0f, -1, -2));
            LinearLayout linearLayout2 = new LinearLayout(parentActivity);
            linearLayout2.setOrientation(0);
            linearLayout.addView(linearLayout2, mf.k(0.0f, 20.0f, 0.0f, 16.0f, -1, 54));
            int i13 = 0;
            while (i13 < 2) {
                LinearLayout linearLayout3 = new LinearLayout(parentActivity);
                linearLayout3.setOrientation(1);
                linearLayout3.setGravity(i12);
                int L = org.telegram.messenger.g0.L(16.0f);
                int i14 = org.telegram.ui.ActionBar.k6.d6;
                int w03 = org.telegram.ui.ActionBar.k6.w0(i14, resourceProvider);
                int i15 = org.telegram.ui.ActionBar.k6.i6;
                int w04 = org.telegram.ui.ActionBar.k6.w0(i15, resourceProvider);
                org.telegram.ui.Cells.y k02 = org.telegram.ui.ActionBar.k6.k0(L, L, L, L, w03, w04, w04);
                org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i14);
                org.telegram.ui.ActionBar.n6 N2 = org.telegram.ui.ActionBar.r6.N(i15);
                linearLayout3.setBackground(k02);
                org.telegram.ui.ActionBar.r6.k(linearLayout3, k02, N, N2, resourceProvider);
                linearLayout3.setClickable(true);
                linearLayout3.setFocusable(true);
                String M0 = bd.M0(i13 == 0 ? 2131742991 : 2131743033, str);
                linearLayout3.setContentDescription(M0);
                ImageView imageView = new ImageView(parentActivity);
                imageView.setImageResource(i13 == 0 ? R.drawable.wallet_transfer : R.drawable.wallet_sell);
                imageView.setImportantForAccessibility(2);
                int i16 = org.telegram.ui.ActionBar.k6.G6;
                org.telegram.ui.ActionBar.r6.t(imageView, i16, resourceProvider, PorterDuff.Mode.SRC_IN);
                linearLayout3.addView(imageView, mf.o(24, 24));
                TextView textView3 = new TextView(parentActivity);
                textView3.setText(M0);
                float f11 = f10;
                org.telegram.messenger.k5.n(textView3, i16, resourceProvider, 1, f11);
                textView3.setGravity(17);
                linearLayout3.addView(textView3, mf.k(0.0f, 2.0f, 0.0f, 0.0f, -2, -2));
                linearLayout2.addView(linearLayout3, mf.m(1.0f, 0, -1, i13 == 0 ? 0 : 4, i13 == 0 ? 4 : 0, 0));
                i13++;
                f10 = f11;
                i12 = 17;
                str = null;
            }
            ArrayList<TL_wallet.nftAttribute> arrayList = nftitem.attributes;
            if (arrayList != null && !arrayList.isEmpty()) {
                rx0 rx0Var = new rx0(parentActivity, resourceProvider);
                int L2 = org.telegram.messenger.g0.L(10.0f);
                int i17 = org.telegram.ui.ActionBar.k6.d6;
                ShapeDrawable d02 = org.telegram.ui.ActionBar.k6.d0(L2, org.telegram.ui.ActionBar.k6.w0(i17, resourceProvider));
                org.telegram.ui.ActionBar.n6 N3 = org.telegram.ui.ActionBar.r6.N(i17);
                rx0Var.setBackground(d02);
                org.telegram.ui.ActionBar.r6.k(rx0Var, d02, N3, null, resourceProvider);
                ArrayList<TL_wallet.nftAttribute> arrayList2 = nftitem.attributes;
                int size = arrayList2.size();
                int i18 = 0;
                while (i18 < size) {
                    TL_wallet.nftAttribute nftattribute = arrayList2.get(i18);
                    i18++;
                    TL_wallet.nftAttribute nftattribute2 = nftattribute;
                    rx0Var.c(nftattribute2.trait_type, nftattribute2.value, null, null);
                }
                linearLayout.addView(rx0Var, mf.k(0.0f, 0.0f, 0.0f, 14.0f, -1, -2));
            }
            gi.d dVar = new gi.d(parentActivity, resourceProvider, true);
            dVar.setRoundRadius(24);
            dVar.setText(bd.M0(2131743073, null));
            linearLayout.addView(dVar, mf.o(-1, 48));
            u4Var.O = scrollView;
            u4Var.U0 = false;
            linearLayout2.getChildAt(0).setOnClickListener(new hb0(25, u4Var, nftitem));
            linearLayout2.getChildAt(1).setOnClickListener(new h3(parentActivity, 1));
            dVar.setOnClickListener(new h3(u4Var, 2));
            u4Var.show();
            u4Var.O(w02);
            org.telegram.messenger.g0.u3(u4Var, w02, false, null);
        }
    }

    public final void K0() {
        if (getParentActivity() == null || this.N0 != null || this.M0 == null) {
            return;
        }
        if (getParentActivity().checkSelfPermission("android.permission.CAMERA") != 0) {
            getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 44);
        } else {
            this.N0 = bi.a0.k(this, this.M0, new bi.x(12), new k4(this, 3), new d4(this, 8));
        }
    }

    public final void L0(boolean z10) {
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
        Z0();
        ValueAnimator valueAnimator = this.n0;
        if (valueAnimator != null) {
            this.n0 = null;
            valueAnimator.cancel();
        }
        float f10 = z10 ? 1.0f : 0.0f;
        boolean z11 = this.o0.isAttachedToWindow() && this.o0.isLaidOut();
        if (z10) {
            this.q0.k(false);
        }
        if (!z11 || this.m0 == f10) {
            M0(f10);
            this.q0.k(false);
        } else {
            this.i0.setVisibility(0);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.m0, f10);
            this.n0 = ofFloat;
            ofFloat.setDuration(250L);
            this.n0.setInterpolator(xq.h);
            this.n0.addUpdateListener(new j4(this, 0));
            this.n0.addListener(new org.telegram.ui.ActionBar.s0(this, f10, 7));
            this.n0.start();
        }
        if (this.a == null || this.p0 == N0()) {
            return;
        }
        X0(false);
    }

    public final void M0(float f10) {
        this.m0 = f10;
        this.i0.setVisibility((f10 > 0.0f || this.n0 != null) ? 0 : 8);
        this.i0.setAlpha(f10);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.i0.getLayoutParams();
        layoutParams.height = Math.round(org.telegram.messenger.g0.L(52.0f) * f10);
        layoutParams.bottomMargin = -Math.round(org.telegram.messenger.g0.L(6.0f) * f10);
        this.i0.setLayoutParams(layoutParams);
    }

    public final boolean N0() {
        j0 j0Var;
        if (this.g0 || (j0Var = this.E0) == null || !j0Var.c.isEmpty()) {
            return false;
        }
        j0 j0Var2 = this.E0;
        j0Var2.getClass();
        return j0Var2.h;
    }

    public final void O0() {
        this.G0 = false;
        s8 s8Var = this.j0;
        if (s8Var != null) {
            s8Var.b(false);
        }
        this.f0 = 0;
        gi.g1 g1Var = this.q0;
        if (g1Var != null) {
            g1Var.setPosition(0);
        }
    }

    public final void P0() {
        this.s = false;
        ai.h4 h4Var = this.a;
        if (h4Var != null) {
            h4Var.E2.b.remove(this.x);
            this.a.removeCallbacks(this.w);
        }
        k5 k5Var = this.e;
        if (k5Var != null) {
            k5Var.setAdditionalTilt(0.0f);
        }
    }

    public final void R0() {
        k0 x10 = k0.x(this.currentAccount);
        a1();
        this.D0.setEnabled(x10.G() && x10.e());
        if (!x10.G()) {
            this.u0.setText(F0(0));
            this.v0.setText(F0(1));
            return;
        }
        long v = x10.v();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (this.R0 == null) {
            this.R0 = new SpannableString("G");
            k5 k5Var = this.e;
            k5Var.getClass();
            e6 e6Var = new e6(k5Var);
            this.w0 = e6Var;
            SpannableString spannableString = this.R0;
            spannableString.setSpan(e6Var, 0, spannableString.length(), 33);
        }
        spannableStringBuilder.append((CharSequence) this.R0);
        spannableStringBuilder.append((CharSequence) " ");
        spannableStringBuilder.append((CharSequence) f6.e(v));
        spannableStringBuilder.append((CharSequence) " ");
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) bd.M0(2131749524, null));
        if (this.x0 == null) {
            n5 n5Var = new n5();
            n5Var.a = -9577217;
            this.x0 = n5Var;
        }
        spannableStringBuilder.setSpan(this.x0, length, spannableStringBuilder.length(), 33);
        this.u0.setText(spannableStringBuilder);
        CharSequence m10 = k0.x(this.currentAccount).m(v, false);
        if (TextUtils.isEmpty(m10)) {
            this.v0.setText(F0(1));
        } else {
            this.v0.setText(m10);
        }
        U0(this.y0);
        c0 c0Var = this.F0;
        if (c0Var != null && !c0Var.h && !c0Var.i && c0Var.k == null) {
            c0Var.e();
        }
        String t10 = x10.t();
        if (TextUtils.isEmpty(t10)) {
            return;
        }
        this.e.setCardNumber(v0(t10.toUpperCase()));
    }

    public final void S0() {
        float[] fArr;
        float[] fArr2;
        Rect rect = this.H;
        if (rect.isEmpty() || !this.E.isAttachedToWindow()) {
            return;
        }
        k5 k5Var = this.e;
        n61 n61Var = this.F;
        Matrix matrix = this.I;
        if (k5Var.g(n61Var, matrix)) {
            float width = rect.width();
            float height = rect.height();
            int i3 = 0;
            while (true) {
                fArr = this.L;
                fArr2 = this.M;
                float f10 = 0.0f;
                if (i3 >= 4) {
                    break;
                }
                float f11 = (i3 == 1 || i3 == 2) ? width : 0.0f;
                if (i3 >= 2) {
                    f10 = height;
                }
                int i10 = i3 * 2;
                fArr[i10] = f11;
                int i11 = i10 + 1;
                fArr[i11] = f10;
                fArr2[i10] = rect.left + f11;
                fArr2[i11] = rect.top + f10;
                i3++;
            }
            matrix.mapPoints(fArr2);
            n61 n61Var2 = this.F;
            int[] iArr = this.P;
            n61Var2.getLocationInWindow(iArr);
            View view = this.E;
            int[] iArr2 = this.O;
            view.getLocationInWindow(iArr2);
            this.e.i(this.y0, this.y.getWidth() / 0.7826087f);
            float f12 = iArr2[0] - iArr[0];
            float A = org.telegram.ui.Cells.f1.A(height, 0.7826087f, 0.5f, iArr2[1] - iArr[1]);
            for (int i12 = 0; i12 < 4; i12++) {
                int i13 = i12 * 2;
                float T1 = org.telegram.messenger.g0.T1(fArr2[i13], (fArr[i13] * 0.7826087f) + f12, this.y0);
                float[] fArr3 = this.N;
                fArr3[i13] = T1;
                int i14 = i13 + 1;
                fArr3[i14] = org.telegram.messenger.g0.T1(fArr2[i14], (fArr[i14] * 0.7826087f) + A, this.y0);
            }
            Matrix matrix2 = this.K;
            boolean polyToPoly = matrix2.setPolyToPoly(this.L, 0, this.N, 0, 4);
            Matrix matrix3 = this.J;
            if (polyToPoly && !matrix3.equals(matrix2)) {
                matrix3.set(matrix2);
                this.F.invalidate();
            }
            k5 k5Var2 = this.e;
            Matrix matrix4 = k5Var2.c;
            Matrix matrix5 = k5Var2.e;
            Matrix matrix6 = k5Var2.d;
            if (matrix.invert(matrix6)) {
                matrix5.setConcat(matrix6, matrix3);
                if (!k5Var2.n || !matrix4.equals(matrix5)) {
                    matrix4.set(matrix5);
                    k5Var2.n = true;
                    k5Var2.O.invalidate();
                }
            }
            float T12 = org.telegram.messenger.g0.T1(1.0f, 1.0952381f, this.y0);
            this.v0.setPivotX(0.0f);
            this.v0.setPivotY(0.0f);
            this.v0.setScaleX(T12);
            this.v0.setScaleY(T12);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v2 */
    public final void T0() {
        n61 n61Var;
        ?? r16;
        LinearLayout linearLayout;
        float min;
        float f10;
        if (this.a == null || this.e == null || this.t0 == null || this.E == null || (n61Var = this.F) == null || this.actionBar == null) {
            return;
        }
        n61Var.bringToFront();
        View m10 = this.a.f3.m(this.h);
        float i3 = m10 == null ? this.a.f3.L0() > this.h ? 1.0f : 0.0f : Utilities.i((this.a.getPaddingTop() - m10.getTop()) / m10.getHeight(), 1.0f, 0.0f);
        this.z0 = i3;
        float f11 = this.J0;
        boolean z10 = f11 > 0.0f || this.I0 > 0.0f;
        if (z10) {
            i3 = f11 > 0.0f ? 0.0f : (1.0f - this.I0) * i3;
        }
        this.y0 = i3;
        W0();
        float max = m10 != null ? Math.max(0.0f, (m10.getHeight() / 2.0f) + org.telegram.messenger.g0.L(24.0f)) * this.y0 : 0.0f;
        float T1 = org.telegram.messenger.g0.T1(1.0f, 0.8f, this.y0);
        this.e.setPivotX(r11.getWidth() * 0.5f);
        this.e.setPivotY(0.0f);
        this.e.setScaleX(T1);
        this.e.setScaleY(T1);
        this.e.setAlpha(1.0f - Utilities.l(org.telegram.messenger.g0.z1(i3, 0.75f, 1.0f)));
        this.e.setVisibility((z10 || (m10 != null && i3 < 1.0f && m10.getBottom() > this.a.getPaddingTop() && m10.getTop() < this.a.getHeight() - this.a.getPaddingBottom())) ? 0 : 4);
        int[] iArr = this.R;
        int[] iArr2 = this.Q;
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
            boolean z11 = this.J0 == 0.0f ? r16 : false;
            float f12 = this.I0;
            if (z11) {
                min = 0.3f * f12;
                f10 = 0.6f;
            } else {
                min = Math.min(1.0f, 1.8f * f12) * 0.06f;
                f10 = 0.84f;
            }
            float f13 = min + f10;
            this.actionBar.getLocationInWindow(iArr2);
            this.n.getLocationInWindow(iArr);
            float L = (org.telegram.messenger.g0.L(4.0f) + (this.actionBar.getHeight() + (iArr2[r16] - iArr[r16]))) - ((1.0f - f12) * (z11 ? 0.0f : this.e.getHeight() * 0.35f));
            if (z11) {
                L = a1.g.e(0.9f - f13, this.e.getHeight(), 2.0f, L);
            }
            float width = (this.n.getWidth() - this.e.getWidth()) / 2.0f;
            if (!z11) {
                f12 = Math.min(1.0f, f12 * 2.0f);
            }
            if (m10 != null) {
                this.a.getLocationInWindow(iArr2);
                float width2 = ((this.f.getWidth() - this.e.getWidth()) / 2.0f) + this.f.getX() + m10.getX() + (iArr2[0] - iArr[0]);
                float y9 = this.f.getY() + m10.getY() + (iArr2[r16] - iArr[r16]);
                float l10 = Utilities.l(1.0f - ((L - y9) / (this.e.getHeight() * 0.5f)));
                if (l10 >= 1.0f) {
                    org.telegram.messenger.g0.r(this.L0);
                    ValueAnimator valueAnimator = this.K0;
                    if (valueAnimator != null) {
                        this.K0 = null;
                        valueAnimator.cancel();
                    }
                    this.I0 = 0.0f;
                    this.J0 = 0.0f;
                    T0();
                    return;
                }
                width = org.telegram.messenger.g0.T1(width, width2, l10);
                L = org.telegram.messenger.g0.T1(L, y9, l10);
                f13 = org.telegram.messenger.g0.T1(f13, 1.0f, l10);
                f12 = org.telegram.messenger.g0.T1(f12, 1.0f, l10);
            }
            this.e.setPivotX(r1.getWidth() * 0.5f);
            this.e.setPivotY(0.0f);
            this.e.setScaleX(f13);
            this.e.setScaleY(f13);
            this.e.setTranslationX(width);
            this.e.setTranslationY(L);
            this.e.setAlpha(f12);
        }
        boolean z12 = i3 > 0.0f ? r16 : false;
        if (this.G != z12 && (linearLayout = this.t0) != null) {
            Rect rect = this.H;
            if (z12) {
                if (linearLayout.getWidth() != 0 && this.t0.getHeight() != 0) {
                    rect.set(this.t0.getLeft(), this.t0.getTop(), this.t0.getRight(), this.t0.getBottom());
                }
            }
            this.e.setOnFrontContentPresented(null);
            org.telegram.messenger.g0.E2(this.t0);
            this.G = z12;
            if (z12) {
                this.F.addView(this.t0, new FrameLayout.LayoutParams(rect.width(), rect.height(), 51));
                this.t0.layout(0, 0, rect.width(), rect.height());
                S0();
            } else {
                k5 k5Var = this.e;
                k5Var.i(0.0f, 0.0f);
                LinearLayout linearLayout2 = k5Var.N;
                org.telegram.messenger.g0.E2(linearLayout2);
                linearLayout2.setScaleX(1.0f);
                linearLayout2.setScaleY(1.0f);
                linearLayout2.setRotationX(0.0f);
                linearLayout2.setRotationY(0.0f);
                linearLayout2.setTranslationX(0.0f);
                linearLayout2.setTranslationY(0.0f);
                d6 d6Var = k5Var.P;
                d6Var.setScaleX(1.0f);
                d6Var.setScaleY(1.0f);
                k5Var.F.addView(linearLayout2, k5Var.Q);
                this.t0.layout(rect.left, rect.top, rect.right, rect.bottom);
                this.e.getClass();
                S0();
            }
            this.F.invalidate();
        }
        U0(i3);
        if (this.G) {
            S0();
        }
        float f14 = 1.0f - i3;
        float f15 = (1.0f - f14) * (-org.telegram.messenger.g0.L(8.0f));
        if (this.actionBar.getTitleTextView() != null) {
            this.actionBar.getTitleTextView().setAlpha(f14);
            this.actionBar.getTitleTextView().setTranslationY(f15);
        }
        if (this.actionBar.getTitleTextView2() != null) {
            this.actionBar.getTitleTextView2().setAlpha(f14);
            this.actionBar.getTitleTextView2().setTranslationY(f15);
        }
    }

    public final void U0(float f10) {
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.k6.G6);
        this.u0.setTextColor(org.telegram.messenger.g0.d2(f10, -1, themedColor));
        org.telegram.ui.Components.h6 h6Var = this.v0;
        float[] fArr = this.e.b0;
        int i3 = -7868417;
        if (fArr != null) {
            i3 = i0.a.f(fArr[8], p7.p(-7868417, 0, fArr), p7.p(-7868417, 3, fArr));
        }
        h6Var.setTextColor(org.telegram.messenger.g0.d2(f10, i3, i0.a.o(themedColor, Math.round(142.8f))));
        e6 e6Var = this.w0;
        if (e6Var != null) {
            e6Var.y = org.telegram.messenger.g0.d2(f10, -1, getThemedColor(org.telegram.ui.ActionBar.k6.Ci));
        }
        n5 n5Var = this.x0;
        if (n5Var != null) {
            float[] fArr2 = this.e.b0;
            int i10 = -9577217;
            if (fArr2 != null) {
                i10 = i0.a.f(fArr2[8], p7.p(-9577217, 0, fArr2), p7.p(-9577217, 3, fArr2));
            }
            n5Var.a = i0.a.o(i10, Math.round((1.0f - f10) * 255.0f));
        }
        this.u0.invalidate();
    }

    public final void V0(float[] fArr) {
        if (this.C0 == null || this.D0 == null) {
            return;
        }
        float f10 = p7.j(getThemedColor(org.telegram.ui.ActionBar.k6.a7))[0];
        boolean z10 = f10 < 0.6f;
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.k6.Ci);
        if (fArr != null && fArr.length >= 18) {
            int[] iArr = new int[2];
            for (int i3 = 0; i3 < 2; i3++) {
                int i10 = i3 * 4;
                float f11 = fArr[i10 + 10];
                iArr[i3] = f11 < 0.0f ? themedColor : p7.n(themedColor, (int) f11, (int) fArr[i10 + 11]);
            }
            themedColor = i0.a.f(fArr[8], iArr[0], iArr[1]);
        }
        float f12 = z10 ? f10 + 0.25f : 0.0f;
        float f13 = z10 ? 1.0f : f10 - 0.2f;
        float[] j10 = p7.j(themedColor);
        float f14 = j10[0];
        if (f14 < f12 || f14 > f13) {
            themedColor = (themedColor & (-16777216)) | (p7.l(Math.max(f12, Math.min(f13, f14)), j10[1], j10[2]) & 16777215);
        }
        if (themedColor == this.O0) {
            return;
        }
        this.O0 = themedColor;
        int themedColor2 = i0.a.h(themedColor) <= 0.550000011920929d ? getThemedColor(org.telegram.ui.ActionBar.k6.Gi) : -16777216;
        gi.d[] dVarArr = {this.C0, this.D0};
        for (int i11 = 0; i11 < 2; i11++) {
            gi.d dVar = dVarArr[i11];
            dVar.setColor(themedColor);
            dVar.setTextColor(themedColor2);
        }
    }

    public final void W0() {
        ai.h4 h4Var = this.a;
        if (h4Var == null || this.e == null) {
            return;
        }
        float b10 = h4Var.E2.b(1);
        this.e.setAdditionalTilt(Math.max(0.0f, (this.y0 * 10.0f) + ((((float) Math.sqrt(Utilities.l(this.y0))) * 90.0f) - 10.0f)) + Math.min(10.0f, this.a.E2.b(3) * 40.0f) + (-Math.min(10.0f, b10 * 40.0f)));
        this.e.setUseGyroscope(1.0f - ((float) Math.pow(this.y0, 0.33000001311302185d)));
    }

    public final void X0(boolean z10) {
        boolean N0 = N0();
        ai.h4 h4Var = this.a;
        l41[] l41VarArr = this.s0;
        if (h4Var != null && this.p0 != N0) {
            this.p0 = N0;
            h4Var.C0();
            for (l41 l41Var : l41VarArr) {
                if (l41Var != null) {
                    l41Var.C0();
                }
            }
            this.a.g3.O(false);
            this.a.f3.h1(0, 0);
            this.a.post(new d4(this, 10));
        }
        if (N0) {
            return;
        }
        for (l41 l41Var2 : l41VarArr) {
            if (l41Var2 != null) {
                Y0(l41Var2, z10);
            }
        }
        ci.q qVar = this.o0;
        if (qVar != null) {
            qVar.post(new d4(this, 5));
            this.o0.post(new d4(this, 6));
        }
    }

    @Override // org.telegram.ui.Components.h41
    public final void Z(ArrayList arrayList, f41 f41Var) {
        k0 x10 = k0.x(this.currentAccount);
        a1();
        arrayList.add(r31.m(this.S));
        this.h = arrayList.size();
        h5 h5Var = this.f;
        r31 r31Var = new r31(-4);
        r31Var.c = h5Var;
        r31Var.z = -1;
        r31Var.e = true;
        arrayList.add(r31Var);
        arrayList.add(r31.m(this.A0));
        boolean N0 = N0();
        this.p0 = N0;
        if (N0) {
            String M0 = bd.M0(2131743029, null);
            String M02 = bd.M0(2131743028, null);
            int i3 = o5.b;
            r31 K = r31.K(o5.class);
            K.k = R.drawable.wallet_learn_instant;
            K.l = M0;
            K.m = M02;
            arrayList.add(K);
            String M03 = bd.M0(2131743078, null);
            String M04 = bd.M0(2131743077, null);
            r31 K2 = r31.K(o5.class);
            K2.k = R.drawable.wallet_learn_fees;
            K2.l = M03;
            K2.m = M04;
            arrayList.add(K2);
            String M05 = bd.M0(2131743192, null);
            String M06 = bd.M0(2131743191, null);
            r31 K3 = r31.K(o5.class);
            K3.k = R.drawable.wallet_learn_verified;
            K3.l = M05;
            K3.m = M06;
            arrayList.add(K3);
            arrayList.add(r31.m(this.b0));
        } else if (this.o0 != null) {
            if (this.S0 && !this.T0 && x10.v() > 500000000) {
                arrayList.add(r31.k(this.d0));
            }
            ci.q qVar = this.o0;
            r31 r31Var2 = new r31(-3);
            r31Var2.c = qVar;
            r31Var2.z = 0;
            r31Var2.y = 1;
            arrayList.add(r31Var2);
        }
        s70 s70Var = this.a0;
        if (s70Var != null) {
            this.c0 = false;
            s70Var.animate().cancel();
            this.a0.setAlpha(0.0f);
            this.a0.setVisibility(4);
        }
    }

    public final void Z0() {
        s8 s8Var = this.j0;
        if (s8Var == null || this.q0 == null || s8Var.x == 0.0f) {
            return;
        }
        s8Var.x = 0.0f;
        s8Var.c.setVisibility(8);
        s8Var.invalidate();
    }

    @Override // org.telegram.ui.Components.h41
    public final CharSequence a0() {
        return bd.M0(2131743013, null);
    }

    public final void a1() {
        if (this.T == null) {
            return;
        }
        k0 x10 = k0.x(this.currentAccount);
        boolean z10 = this.T.isAttachedToWindow() && this.T.isLaidOut();
        g5 g5Var = this.T;
        FrameLayout frameLayout = this.U;
        Boolean bool = x10.i;
        g5Var.i(frameLayout, (bool == null || !bool.booleanValue() || TextUtils.isEmpty(x10.j)) ? false : true, z10);
        ArrayList arrayList = x10.G;
        int size = arrayList.size();
        int i3 = 0;
        long j10 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
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
            this.X.setText(x0(2131743072, j10));
        }
        this.T.i(this.W, z11, z10);
        long j12 = ci.e9.y(this.currentAccount, true).p().amount;
        boolean z12 = j12 > 500000000;
        if (z12) {
            this.Z.setText(x0(2131743110, j12));
        }
        this.T.i(this.Y, z12, z10);
    }

    @Override // org.telegram.ui.Components.h41
    public final void b0(r31 r31Var, View view) {
        c0 c0Var;
        Object obj = r31Var.G;
        if (obj instanceof TL_wallet.nftItem) {
            H0((TL_wallet.nftItem) obj);
            return;
        }
        if (r31Var.d == -10001 && (c0Var = this.F0) != null) {
            c0Var.e();
        } else if (obj instanceof TL_wallet.walletTransaction) {
            G0(getParentActivity(), this.currentAccount, (TL_wallet.walletTransaction) r31Var.G, null, null, null, null, getResourceProvider());
        }
    }

    @Override // org.telegram.ui.Components.h41
    public final boolean c0(r31 r31Var, View view) {
        b8 b8Var;
        if (!(view instanceof o7) || (b8Var = this.k0) == null) {
            return false;
        }
        b8Var.S((o7) view);
        return true;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean canBeginSlide() {
        b8 b8Var = this.k0;
        return (b8Var == null || !b8Var.q0) && super.canBeginSlide();
    }

    @Override // org.telegram.ui.Components.h41, org.telegram.ui.ActionBar.d2
    public final View createView(Context context) {
        ValueAnimator valueAnimator = this.n0;
        if (valueAnimator != null) {
            this.n0 = null;
            valueAnimator.cancel();
        }
        P0();
        s5 s5Var = this.r0;
        if (s5Var != null) {
            s5Var.b(null);
        }
        this.f = null;
        this.T = null;
        this.S = null;
        this.o0 = null;
        this.q0 = null;
        l41[] l41VarArr = this.s0;
        final int i3 = 0;
        l41VarArr[0] = null;
        int i10 = 1;
        l41VarArr[1] = null;
        c0 c0Var = this.F0;
        boolean z10 = (c0Var == null || c0Var.a.isEmpty()) ? false : true;
        this.g0 = z10;
        if (!z10) {
            this.f0 = 0;
        } else if (this.G0) {
            this.f0 = 1;
        }
        b8 b8Var = this.k0;
        if (b8Var != null) {
            b8Var.p();
        }
        this.k0 = null;
        View createView = super.createView(context);
        ka0 ka0Var = new ka0(this, context);
        ka0Var.addView(createView, mf.c(-1.0f, -1));
        this.fragmentView = ka0Var;
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i11 = org.telegram.ui.ActionBar.k6.a7;
        org.telegram.ui.ActionBar.r6.i(i11, kVar, getResourceProvider());
        this.actionBar.setCastShadows(false);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setClipChildren(false);
        this.actionBar.setClipToPadding(false);
        org.telegram.ui.ActionBar.x q10 = this.actionBar.q();
        final int i12 = 2;
        org.telegram.ui.ActionBar.q0 a10 = q10.a(2, R.drawable.scan_qr);
        this.M0 = a10;
        final int i13 = 3;
        a10.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Wallet.f4
            public final /* synthetic */ w5 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i13) {
                    case 0:
                        w5 w5Var = this.b;
                        w5Var.getClass();
                        w5Var.presentFragment(new ra1(6, null));
                        break;
                    case 1:
                        w5.f0(this.b);
                        break;
                    case 2:
                        w5.i0(this.b);
                        break;
                    case 3:
                        this.b.K0();
                        break;
                    default:
                        w5.d0(this.b);
                        break;
                }
            }
        });
        q10.a(1, R.drawable.ic_ab_other).setOnClickListener(new hb0(27, this, context));
        final int i14 = 4;
        kw0 kw0Var = new kw0(i14, context, this);
        this.S = kw0Var;
        kw0Var.setClipToPadding(false);
        this.S.setClipChildren(false);
        this.S.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(4.0f));
        g5 g5Var = new g5(this, context);
        this.T = g5Var;
        g5Var.setDefaultRadiusDp(22);
        this.T.setOnAnimatedHeightChangedListener(new d4(this, 12));
        TextView textView = new TextView(context);
        this.V = textView;
        textView.setText(bd.M0(2131742972, null));
        this.U = u0(this.V, new d4(this, i3));
        TextView textView2 = new TextView(context);
        this.X = textView2;
        this.W = u0(textView2, new d4(this, i10));
        TextView textView3 = new TextView(context);
        this.Z = textView3;
        this.Y = u0(textView3, new d4(this, i12));
        this.S.addView(this.T, mf.c(-2.0f, -1));
        s70 s70Var = new s70(context, null);
        this.a0 = s70Var;
        this.c0 = false;
        s70Var.setAlpha(0.0f);
        s70 s70Var2 = this.a0;
        int i15 = org.telegram.ui.ActionBar.k6.z6;
        org.telegram.ui.ActionBar.r6.V(s70Var2, i15, this.resourceProvider);
        this.a0.setTextSize(1, 13.0f);
        this.a0.setGravity(17);
        this.a0.setText(Q0(bd.M0(2131743016, null), org.telegram.ui.ActionBar.k6.Uc, this.resourceProvider, new e4(context, i3)));
        this.a0.setVisibility(4);
        FrameLayout frameLayout = (FrameLayout) createView;
        if (frameLayout != null) {
            frameLayout.addView(this.a0, mf.d(-1, -2.0f, 81, 12.0f, 0.0f, 12.0f, 24.0f));
        }
        h5 h5Var = new h5(this, context, i3);
        this.b0 = h5Var;
        h5Var.setImportantForAccessibility(2);
        this.d0 = new FrameLayout(context);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.e0 = frameLayout2;
        int i16 = org.telegram.ui.ActionBar.k6.d6;
        int themedColor = getThemedColor(i16);
        int themedColor2 = getThemedColor(i16);
        int i17 = org.telegram.ui.ActionBar.k6.i6;
        org.telegram.ui.Cells.y b02 = org.telegram.ui.ActionBar.k6.b0(themedColor, org.telegram.ui.ActionBar.k6.w(themedColor2, getThemedColor(i17)), 16, 16);
        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i16);
        org.telegram.ui.ActionBar.n6 q11 = org.telegram.ui.ActionBar.r6.q(i16, i17);
        org.telegram.ui.ActionBar.e6 resourceProvider = getResourceProvider();
        frameLayout2.setBackground(b02);
        org.telegram.ui.ActionBar.r6.k(frameLayout2, b02, N, q11, resourceProvider);
        this.d0.addView(this.e0, mf.d(-1, -2.0f, 55, 12.0f, 0.0f, 12.0f, 12.0f));
        ImageView imageView = new ImageView(context);
        float N2 = org.telegram.messenger.g0.N(10.0f);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{N2, N2, N2, N2, N2, N2, N2, N2}, null, null));
        shapeDrawable.setShaderFactory(new i5());
        imageView.setBackground(shapeDrawable);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.wallet_protect);
        this.e0.addView(imageView, mf.d(28, 28.0f, 19, 14.0f, 11.0f, 16.0f, 11.0f));
        TextView textView4 = new TextView(context);
        org.telegram.ui.ActionBar.r6.V(textView4, org.telegram.ui.ActionBar.k6.q7, this.resourceProvider);
        k2.p1.u(textView4, 1, 16.0f, null, 2131743054);
        this.e0.addView(textView4, mf.d(-1, -2.0f, 19, 58.0f, 0.0f, 32.0f, 0.0f));
        this.e0.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Wallet.f4
            public final /* synthetic */ w5 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i3) {
                    case 0:
                        w5 w5Var = this.b;
                        w5Var.getClass();
                        w5Var.presentFragment(new ra1(6, null));
                        break;
                    case 1:
                        w5.f0(this.b);
                        break;
                    case 2:
                        w5.i0(this.b);
                        break;
                    case 3:
                        this.b.K0();
                        break;
                    default:
                        w5.d0(this.b);
                        break;
                }
            }
        });
        pf.b(this.e0, 0.02f, 1.2f);
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.y = frameLayout3;
        frameLayout3.setClipChildren(false);
        this.y.setClipToPadding(false);
        this.actionBar.addView(this.y, mf.d(-1, 56.0f, 87, 64.0f, 0.0f, 96.0f, 0.0f));
        View view = new View(context);
        this.E = view;
        this.y.addView(view, mf.e(1, 1, 19));
        this.G = false;
        this.H.setEmpty();
        this.J.reset();
        n61 n61Var = new n61(this, context);
        this.F = n61Var;
        n61Var.setClipChildren(false);
        this.F.setClipToPadding(false);
        k5 k5Var = new k5(this, context);
        this.e = k5Var;
        final int i18 = 1;
        k5Var.setDiamondOnCard(true);
        this.e.setCardOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Wallet.f4
            public final /* synthetic */ w5 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i18) {
                    case 0:
                        w5 w5Var = this.b;
                        w5Var.getClass();
                        w5Var.presentFragment(new ra1(6, null));
                        break;
                    case 1:
                        w5.f0(this.b);
                        break;
                    case 2:
                        w5.i0(this.b);
                        break;
                    case 3:
                        this.b.K0();
                        break;
                    default:
                        w5.d0(this.b);
                        break;
                }
            }
        });
        this.a.E2.b.add(this.x);
        h5 h5Var2 = new h5(this, context, i18);
        this.f = h5Var2;
        h5Var2.setImportantForAccessibility(2);
        l5 l5Var = new l5(this, context);
        this.n = l5Var;
        l5Var.setClipChildren(false);
        this.n.setClipToPadding(false);
        this.n.addView(this.e, mf.c(-2.0f, -1));
        ka0Var.addView(this.n, mf.c(-1.0f, -1));
        this.a.setClipChildren(false);
        this.a.setClipToPadding(false);
        this.t0 = this.e.getBalanceLayout();
        this.u0 = this.e.getBalanceView();
        this.v0 = this.e.getUsdBalanceView();
        this.e.setCardHolder(l10.p(getUserConfig().f()).toUpperCase());
        this.B0 = 0.0f;
        s51 s51Var = new s51(24, context, this);
        this.A0 = s51Var;
        s51Var.setOrientation(0);
        this.A0.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(12.0f));
        gi.d dVar = new gi.d(context, this.resourceProvider, true);
        dVar.setRoundRadius(24);
        this.C0 = dVar;
        dVar.setText(bd.M0(2131743214, null));
        this.A0.addView(this.C0, mf.m(1.0f, 0, 48, 0, 4, 0));
        this.C0.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Wallet.f4
            public final /* synthetic */ w5 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i12) {
                    case 0:
                        w5 w5Var = this.b;
                        w5Var.getClass();
                        w5Var.presentFragment(new ra1(6, null));
                        break;
                    case 1:
                        w5.f0(this.b);
                        break;
                    case 2:
                        w5.i0(this.b);
                        break;
                    case 3:
                        this.b.K0();
                        break;
                    default:
                        w5.d0(this.b);
                        break;
                }
            }
        });
        gi.d dVar2 = new gi.d(context, this.resourceProvider, true);
        dVar2.setRoundRadius(24);
        this.D0 = dVar2;
        dVar2.setText(bd.M0(2131743032, null));
        this.D0.setEnabled(k0.x(this.currentAccount).e());
        this.D0.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Wallet.f4
            public final /* synthetic */ w5 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i14) {
                    case 0:
                        w5 w5Var = this.b;
                        w5Var.getClass();
                        w5Var.presentFragment(new ra1(6, null));
                        break;
                    case 1:
                        w5.f0(this.b);
                        break;
                    case 2:
                        w5.i0(this.b);
                        break;
                    case 3:
                        this.b.K0();
                        break;
                    default:
                        w5.d0(this.b);
                        break;
                }
            }
        });
        this.A0.addView(this.D0, mf.m(1.0f, 0, 48, 4, 0, 0));
        V0(this.e.getStickerStyle());
        this.E0 = k0.x(this.currentAccount).B();
        this.a.setDescendantFocusability(131072);
        b8 b8Var2 = new b8(this, this.e, new m2.t(17, this, ka0Var), null);
        this.k0 = b8Var2;
        ka0Var.addView(b8Var2, mf.c(-1.0f, -1));
        this.l0 = "";
        int i19 = 9;
        ci.q qVar = new ci.q(context, i19);
        this.o0 = qVar;
        qVar.setOrientation(1);
        org.telegram.ui.ActionBar.r6.i(i11, this.o0, getResourceProvider());
        gi.g1 g1Var = new gi.g1(this, context, this.resourceProvider, i19);
        this.q0 = g1Var;
        g1Var.setAllowDisallowInterceptTouch(false);
        this.q0.setAdapter(new ci.o4(i19, context, this));
        m61 j10 = this.q0.j(-2, true);
        this.h0 = j10;
        j10.g(i15, org.telegram.ui.ActionBar.k6.G6, i15, i17, i16);
        org.telegram.ui.ActionBar.r6.C(this.h0, org.telegram.ui.ActionBar.k6.d0(org.telegram.messenger.g0.L(20.0f), getThemedColor(i16)), org.telegram.ui.ActionBar.r6.N(i16), getResourceProvider());
        this.i0 = new FrameLayout(context);
        s8 s8Var = new s8(context, this.h0, this.resourceProvider, new k4(this, i3), new k4(this, 1), new k4(this, i12));
        this.j0 = s8Var;
        this.i0.addView(s8Var, mf.d(-1, 40.0f, 48, 16.0f, 0.0f, 16.0f, 0.0f));
        this.q0.setPosition(this.f0);
        Z0();
        this.o0.addView(this.i0, mf.k(0.0f, 0.0f, 0.0f, -6.0f, -1, 52));
        this.o0.addView(this.q0, mf.l(1.0f, -1, 0));
        L0(this.g0);
        c0 c0Var2 = this.F0;
        if (c0Var2 != null) {
            this.k0.Y(c0Var2);
        }
        this.a.j(new ji(this, 23));
        f41 f41Var = this.a.g3;
        f41Var.r = false;
        f41Var.O(false);
        s5 s5Var2 = new s5(this);
        this.r0 = s5Var2;
        s5Var2.b(this.a);
        R0();
        this.E0.h();
        this.actionBar.post(new d4(this, i19));
        this.a.post(new d4(this, 10));
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.cs
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        ai.h4 h4Var;
        f41 f41Var;
        if (i10 != this.currentAccount) {
            return;
        }
        if (i3 == hs.a4 && this.u0 != null) {
            R0();
            Iterator it = this.Q0.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
            return;
        }
        if (i3 == hs.y3) {
            a1();
            return;
        }
        if (i3 == hs.q0) {
            if (objArr.length > 0) {
                Object obj = objArr[0];
                if (obj instanceof TL_account.Password) {
                    this.S0 = true;
                    this.T0 = ((TL_account.Password) obj).has_password;
                    ai.h4 h4Var2 = this.a;
                    if (h4Var2 == null || (f41Var = h4Var2.g3) == null) {
                        return;
                    }
                    f41Var.O(true);
                    return;
                }
            }
            getConnectionsManager().sendRequestTyped(new TL_account.getPassword(), new c3.b(1), new d(this, 7));
            return;
        }
        if (i3 != hs.b4 || objArr.length <= 0) {
            return;
        }
        Object obj2 = objArr[0];
        j0 j0Var = this.E0;
        if (obj2 != j0Var || (h4Var = this.a) == null || h4Var.g3 == null) {
            return;
        }
        if (j0Var.b.isEmpty()) {
            j0 j0Var2 = this.E0;
            if (!j0Var2.h) {
                j0Var2.h();
            }
        }
        X0(true);
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean onBackPressed(boolean z10) {
        bi.a0 a0Var = this.N0;
        if (a0Var != null) {
            if (z10) {
                a0Var.e();
            }
            return false;
        }
        s8 s8Var = this.j0;
        if (s8Var == null || !s8Var.y) {
            return super.onBackPressed(z10);
        }
        if (z10) {
            s8Var.b(false);
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onBeginSlide() {
        s5 s5Var = this.r0;
        if (s5Var != null) {
            s5Var.c();
        }
        ai.h4 h4Var = this.a;
        if (h4Var != null) {
            h4Var.C0();
        }
        l41 y02 = y0();
        if (y02 != null) {
            y02.C0();
        }
        super.onBeginSlide();
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean onFragmentCreate() {
        Context context = org.telegram.messenger.t0.b;
        if (x5.k0.compareAndSet(false, true)) {
            x5.l0.postRunnable(new e4(context, 2));
        }
        getNotificationCenter().c(this, hs.a4);
        getNotificationCenter().c(this, hs.y3);
        getNotificationCenter().c(this, hs.b4);
        getNotificationCenter().c(this, hs.q0);
        k0 x10 = k0.x(this.currentAccount);
        if (x10.o == null) {
            x10.o = new c0(x10);
        }
        c0 c0Var = x10.o;
        this.F0 = c0Var;
        d4 d4Var = this.H0;
        ArrayList arrayList = c0Var.d;
        if (!arrayList.contains(d4Var)) {
            arrayList.add(d4Var);
        }
        org.telegram.ui.Components.o2 o2Var = this.U0;
        if (o2Var != null) {
            o2Var.run();
        }
        int i3 = x10.D;
        x10.D = i3 + 1;
        HashSet hashSet = x10.E;
        boolean isEmpty = hashSet.isEmpty();
        hashSet.add(Integer.valueOf(i3));
        if (isEmpty) {
            x10.S();
        }
        this.U0 = new org.telegram.ui.Components.o2(x10, i3, 28);
        getConnectionsManager().sendRequestTyped(new TL_account.getPassword(), new c3.b(1), new d(this, 7));
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onFragmentDestroy() {
        bi.a0 a0Var = this.N0;
        if (a0Var != null) {
            a0Var.g();
            org.telegram.messenger.g0.E2(this.N0);
            this.N0 = null;
        }
        org.telegram.messenger.g0.r(this.L0);
        ValueAnimator valueAnimator = this.K0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        b8 b8Var = this.k0;
        if (b8Var != null) {
            b8Var.p();
        }
        k5 k5Var = this.e;
        if (k5Var != null) {
            k5Var.setOnFrontContentPresented(null);
        }
        ValueAnimator valueAnimator2 = this.n0;
        if (valueAnimator2 != null) {
            this.n0 = null;
            valueAnimator2.cancel();
        }
        c0 c0Var = this.F0;
        if (c0Var != null) {
            c0Var.d.remove(this.H0);
        }
        P0();
        s5 s5Var = this.r0;
        if (s5Var != null) {
            s5Var.b(null);
        }
        getNotificationCenter().n(this, hs.a4);
        getNotificationCenter().n(this, hs.y3);
        getNotificationCenter().n(this, hs.b4);
        getNotificationCenter().n(this, hs.q0);
        org.telegram.messenger.g0.E2(this.F);
        j0 j0Var = this.E0;
        if (j0Var != null) {
            j0Var.a();
        }
        super.onFragmentDestroy();
        org.telegram.ui.Components.o2 o2Var = this.U0;
        if (o2Var != null) {
            o2Var.run();
            this.U0 = null;
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onInsets(int i3, int i10, int i11, int i12) {
        this.a.setPadding(0, 0, 0, i12);
        this.a.setClipToPadding(false);
        s70 s70Var = this.a0;
        if (s70Var != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) s70Var.getLayoutParams();
            layoutParams.bottomMargin = org.telegram.messenger.g0.L(24.0f) + i12;
            this.a0.setLayoutParams(layoutParams);
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onPause() {
        super.onPause();
        bi.a0 a0Var = this.N0;
        if (a0Var != null) {
            a0Var.g();
            org.telegram.messenger.g0.E2(this.N0);
            this.N0 = null;
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onRequestPermissionsResultFragment(int i3, String[] strArr, int[] iArr) {
        if (i3 != 44 || getParentActivity() == null) {
            return;
        }
        if (iArr.length > 0 && iArr[0] == 0) {
            K0();
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        alertDialog$Builder.a.U = org.telegram.messenger.g0.X2(bd.M0(2131746511, null));
        alertDialog$Builder.k(bd.M0(2131747308, null), new g4(this));
        alertDialog$Builder.h(bd.M0(2131751772, null), null);
        int i10 = org.telegram.ui.ActionBar.k6.L5;
        alertDialog$Builder.m(R.raw.permission_request_camera, 72, org.telegram.ui.ActionBar.k6.x0(null, i10, false), null);
        alertDialog$Builder.n(i10, null);
        alertDialog$Builder.p();
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onResume() {
        super.onResume();
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar != null) {
            kVar.post(new d4(this, 9));
        }
        k0.x(this.currentAccount).E();
        if (this.F0 != null && k0.x(this.currentAccount).G()) {
            c0 c0Var = this.F0;
            if (!c0Var.j) {
                c0Var.b();
                c0Var.f(true);
            }
        }
        R0();
        if (this.a != null) {
            X0(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onThemeColorsChanged() {
        super.onThemeColorsChanged();
        try {
            if (this.u0 != null && this.v0 != null && this.e != null) {
                U0(this.y0);
            }
            k5 k5Var = this.e;
            if (k5Var != null && this.C0 != null && this.D0 != null) {
                V0(k5Var.getStickerStyle());
            }
            s70 s70Var = this.a0;
            if (s70Var != null) {
                s70Var.invalidate();
            }
            TextView textView = this.X;
            if (textView != null) {
                textView.invalidate();
            }
            TextView textView2 = this.Z;
            if (textView2 != null) {
                textView2.invalidate();
            }
            g5 g5Var = this.T;
            if (g5Var != null) {
                g5Var.invalidate();
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final void s0(boolean z10) {
        org.telegram.messenger.g0.r(this.L0);
        float f10 = z10 ? 1.0f : 0.0f;
        if (this.J0 == f10) {
            return;
        }
        this.J0 = f10;
        ValueAnimator valueAnimator = this.K0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        T0();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.I0, f10);
        this.K0 = ofFloat;
        ofFloat.setDuration(z10 ? 260L : 120L);
        this.K0.setInterpolator(z10 ? new xq(0.05d, 0.7d, 0.1d, 1.0d) : new xq(0.4d, 0.0d, 0.2d, 1.0d));
        this.K0.addUpdateListener(new j4(this, 1));
        this.K0.addListener(new i81(this, 6));
        this.K0.start();
    }

    public final FrameLayout u0(TextView textView, Runnable runnable) {
        Context context = textView.getContext();
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(14.0f));
        int i3 = org.telegram.ui.ActionBar.k6.i6;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.k6.h0(getThemedColor(i3), 2, -1);
        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i3);
        org.telegram.ui.ActionBar.e6 resourceProvider = getResourceProvider();
        frameLayout.setBackground(h02);
        org.telegram.ui.ActionBar.r6.k(frameLayout, h02, null, N, resourceProvider);
        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.G6, getResourceProvider());
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setGravity(19);
        frameLayout.addView(textView, mf.d(-1, -2.0f, 3, 0.0f, 0.0f, 42.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(R.drawable.attach_arrow_right);
        org.telegram.ui.ActionBar.r6.t(imageView, org.telegram.ui.ActionBar.k6.z6, getResourceProvider(), PorterDuff.Mode.SRC_IN);
        frameLayout.addView(imageView, mf.e(-2, -2, 21));
        frameLayout.setOnClickListener(new h3(runnable, 3));
        textView.setDuplicateParentStateEnabled(true);
        pf.b(textView, 0.02f, 1.2f);
        this.T.addView(frameLayout, mf.o(-1, -2));
        return frameLayout;
    }

    public final CharSequence x0(int i3, long j10) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((char) 65532);
        wp wpVar = new wp(R.drawable.mini_gram_16, 0);
        wpVar.d = false;
        spannableStringBuilder.setSpan(wpVar, length, spannableStringBuilder.length(), 33);
        spannableStringBuilder.append((CharSequence) " ");
        int length2 = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) k0.o(j10, false));
        spannableStringBuilder.setSpan(new tz(org.telegram.ui.ActionBar.k6.Ci, getResourceProvider()), length2, spannableStringBuilder.length(), 33);
        return bd.V(null, null, i3, spannableStringBuilder);
    }

    public final l41 y0() {
        if (z0()) {
            gi.g1 g1Var = this.q0;
            View currentView = g1Var == null ? null : g1Var.getCurrentView();
            if (currentView instanceof l41) {
                return (l41) currentView;
            }
        }
        return null;
    }

    public final boolean z0() {
        ci.q qVar;
        if (this.p0 || (qVar = this.o0) == null || !qVar.isAttachedToWindow()) {
            return false;
        }
        ViewParent parent = this.o0.getParent();
        ai.h4 h4Var = this.a;
        return parent == h4Var.f3.m(h4Var.g3.E.size() - 1);
    }
}
