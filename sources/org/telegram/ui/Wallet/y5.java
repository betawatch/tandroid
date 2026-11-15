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
import org.telegram.messenger.beta.R;
import org.telegram.messenger.de;
import org.telegram.messenger.gc;
import org.telegram.messenger.hd;
import org.telegram.messenger.i20;
import org.telegram.messenger.is;
import org.telegram.messenger.np;
import org.telegram.messenger.ns;
import org.telegram.messenger.q10;
import org.telegram.messenger.s10;
import org.telegram.messenger.u10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.b00;
import org.telegram.ui.Components.b41;
import org.telegram.ui.Components.e80;
import org.telegram.ui.Components.eq;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.m01;
import org.telegram.ui.Components.m60;
import org.telegram.ui.Components.p41;
import org.telegram.ui.Components.pz;
import org.telegram.ui.Components.r41;
import org.telegram.ui.Components.ri;
import org.telegram.ui.Components.ss;
import org.telegram.ui.Components.u11;
import org.telegram.ui.Components.u41;
import org.telegram.ui.Components.v61;
import org.telegram.ui.Components.vx0;
import org.telegram.ui.Components.wy0;
import org.telegram.ui.Components.xy0;
import org.telegram.ui.Components.z70;
import org.telegram.ui.Components.zj;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PasscodeActivity;
import org.telegram.ui.a90;
import org.telegram.ui.fq0;
import org.telegram.ui.g71;
import org.telegram.ui.nb1;
import org.telegram.ui.oa0;
import org.telegram.ui.q90;
import org.telegram.ui.w61;
import org.telegram.ui.x21;
import org.telegram.ui.xa1;
import org.telegram.ui.z51;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes4.dex */
public final class y5 extends r41 implements is {
    public static Typeface V0;
    public z51 A0;
    public float B0;
    public hi.d C0;
    public hi.d D0;
    public View E;
    public k0 E0;
    public w61 F;
    public d0 F0;
    public boolean G;
    public boolean G0;
    public float I0;
    public float J0;
    public ValueAnimator K0;
    public org.telegram.ui.ActionBar.q0 M0;
    public ci.a0 N0;
    public int O0;
    public SpannableString R0;
    public m01 S;
    public boolean S0;
    public i5 T;
    public boolean T0;
    public FrameLayout U;
    public nb1 U0;
    public TextView V;
    public FrameLayout W;
    public TextView X;
    public FrameLayout Y;
    public TextView Z;
    public z70 a0;
    public j5 b0;
    public boolean c0;
    public FrameLayout d0;
    public m5 e;
    public FrameLayout e0;
    public j5 f;
    public boolean g0;
    public int h;
    public v61 h0;
    public FrameLayout i0;
    public u8 j0;
    public c8 k0;
    public float m0;
    public n5 n;
    public ValueAnimator n0;
    public ai.r2 o0;
    public boolean p0;
    public hi.i1 q0;
    public int r;
    public u5 r0;
    public boolean s;
    public LinearLayout t0;
    public org.telegram.ui.Components.h6 u0;
    public org.telegram.ui.Components.h6 v0;
    public g6 w0;
    public p5 x0;
    public FrameLayout y;
    public float y0;
    public float z0;
    public final zj w = new zj(this, 27);
    public final i4 x = new ss() { // from class: org.telegram.ui.Wallet.i4
        @Override // org.telegram.ui.Components.ss
        public final void a(int i7, boolean z10) {
            bi.v3 v3Var;
            y5 y5Var = y5.this;
            zj zjVar = y5Var.w;
            if ((i7 == 1 || i7 == 3) && (v3Var = y5Var.a) != null) {
                y5Var.s = z10;
                v3Var.removeCallbacks(zjVar);
                zjVar.run();
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
    public final u41[] s0 = new u41[2];
    public final e4 H0 = new e4(this, 4);
    public final e4 L0 = new e4(this, 5);
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
                if (pathSegments.size() != 1 || (!"sendgrams".equalsIgnoreCase(pathSegments.get(0)) && d1(uri) == null)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v3, types: [org.telegram.ui.Components.w61, org.telegram.ui.Wallet.y4] */
    public static void G0(Context context, int i7, TL_wallet.walletTransaction wallettransaction, u10 u10Var, s10 s10Var, byte[] bArr, org.telegram.ui.Cells.m0 m0Var, org.telegram.ui.ActionBar.e6 e6Var) {
        x2[] x2VarArr;
        View[] viewArr;
        s10 s10Var2;
        LinearLayout t02;
        TL_wallet.nftItem nftitem;
        if (context == null) {
            return;
        }
        if ((wallettransaction.peer instanceof TL_wallet.walletTransactionPeerTelegramGift) && (nftitem = wallettransaction.nft) != null) {
            TL_stars.StarGift starGift = nftitem.gift;
            if (starGift instanceof TL_stars.TL_starGiftUnique) {
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) starGift;
                di.c6 c6Var = new di.c6(context, i7, 0L, e6Var, null);
                c6Var.e3 = wallettransaction;
                c6Var.i2(tL_starGiftUnique.slug, tL_starGiftUnique, null);
                c6Var.show();
                return;
            }
        }
        x2[] x2VarArr2 = new x2[1];
        View[] viewArr2 = new View[1];
        k0 B = l0.x(i7).B();
        ArrayList arrayList = new ArrayList(B.c);
        int i10 = 0;
        while (true) {
            if (i10 >= arrayList.size()) {
                i10 = -1;
                break;
            } else if (arrayList.get(i10) == wallettransaction || l0.i0(wallettransaction, (TL_wallet.walletTransaction) arrayList.get(i10))) {
                break;
            } else {
                i10++;
            }
        }
        if (u10Var == null && m0Var == null && i10 >= 0) {
            Rect rect = new Rect();
            context.getResources().getDrawable(R.drawable.sheet_shadow_round).getPadding(rect);
            viewArr = viewArr2;
            ?? y4Var = new y4(context, e6Var, arrayList, B, i7, rect, viewArr);
            y4Var.setPosition(i10);
            x2VarArr = x2VarArr2;
            y4Var.setAdapter(new z4(arrayList, context, e6Var, rect, i7, x2VarArr2));
            s10Var2 = s10Var;
            t02 = y4Var;
        } else {
            x2VarArr = x2VarArr2;
            viewArr = viewArr2;
            s10Var2 = s10Var;
            t02 = t0(context, i7, wallettransaction, u10Var, s10Var, bArr, m0Var, e6Var, x2VarArr, false);
        }
        x2[] x2VarArr3 = x2VarArr;
        a5 a5Var = new a5(context, t02, e6Var, t02, viewArr, context);
        x2VarArr3[0] = a5Var;
        if ((t02 instanceof org.telegram.ui.Components.w61) && s10Var2 != null) {
            a5Var.n(new r(6, s10Var2, wallettransaction));
        }
        x2VarArr3[0].A0(u10Var != null);
        x2 x2Var = x2VarArr3[0];
        x2Var.U0 = false;
        x2Var.show();
    }

    public static void I0(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        int i7 = 1;
        org.telegram.ui.ActionBar.u2 k10 = org.telegram.messenger.k5.k(1, context, e6Var, false);
        FrameLayout frameLayout = new FrameLayout(context);
        int L = org.telegram.messenger.g0.L(16.0f);
        int i10 = org.telegram.ui.ActionBar.j6.h5;
        Drawable d02 = org.telegram.ui.ActionBar.j6.d0(L, org.telegram.ui.ActionBar.j6.w0(i10, e6Var));
        org.telegram.ui.ActionBar.m6 M = org.telegram.ui.ActionBar.q6.M(i10);
        frameLayout.setBackground(d02);
        org.telegram.ui.ActionBar.q6.j(frameLayout, d02, M, null, e6Var);
        frameLayout.setPadding(org.telegram.messenger.g0.L(36.0f), 0, org.telegram.messenger.g0.L(36.0f), org.telegram.messenger.g0.L(14.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(1);
        frameLayout.addView(linearLayout, c8.ja.c(-2.0f, -1));
        linearLayout.addView(new w6(ns.q2, context, false), c8.ja.t(ns.q2, ns.q2, 1, 0, -12, 0, -8));
        TextView textView = new TextView(context);
        textView.setText(hd.M0(2131743097, null));
        org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.j5, e6Var);
        textView.setTextSize(1, 17.0f);
        textView.setTypeface(org.telegram.messenger.g0.o1("fonts/rmedium.ttf"));
        textView.setGravity(17);
        TextView f10 = i20.f(linearLayout, textView, c8.ja.t(-1, -2, 1, 0, 0, 0, 6), context);
        f10.setText(hd.M0(2131743096, null));
        int i11 = org.telegram.ui.ActionBar.j6.z6;
        org.telegram.ui.ActionBar.q6.U(f10, i11, e6Var);
        f10.setTextSize(1, 14.0f);
        f10.setGravity(17);
        f10.setLineSpacing(org.telegram.messenger.g0.L(1.0f), 1.0f);
        linearLayout.addView(f10, c8.ja.t(-1, -2, 1, 0, 0, 0, 24));
        r5 r5Var = new r5(context, e6Var);
        r5Var.setPadding(org.telegram.messenger.g0.L(0.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(0.0f), org.telegram.messenger.g0.L(8.0f));
        r5Var.a(R.drawable.wallet_learn_instant, hd.M0(2131743019, null), hd.M0(2131743018, null));
        linearLayout.addView(r5Var, c8.ja.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
        r5 r5Var2 = new r5(context, e6Var);
        r5Var2.setPadding(org.telegram.messenger.g0.L(0.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(0.0f), org.telegram.messenger.g0.L(8.0f));
        r5Var2.a(R.drawable.wallet_learn_fees, hd.M0(2131743068, null), hd.M0(2131743067, null));
        linearLayout.addView(r5Var2, c8.ja.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
        r5 r5Var3 = new r5(context, e6Var);
        r5Var3.setPadding(org.telegram.messenger.g0.L(0.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(0.0f), org.telegram.messenger.g0.L(8.0f));
        r5Var3.a(R.drawable.wallet_learn_verified, hd.M0(2131743182, null), hd.M0(2131743181, null));
        linearLayout.addView(r5Var3, c8.ja.k(0.0f, 0.0f, 0.0f, 14.0f, -1, -2));
        hi.d g10 = i20.g(24, context, e6Var, true);
        g10.setText(hd.M0(2131743101, null));
        linearLayout.addView(g10, c8.ja.t(-1, 48, 1, 0, 0, 0, 0));
        c8.na.b(g10, 0.02f, 1.1f);
        z70 z70Var = new z70(context, null);
        org.telegram.ui.ActionBar.q6.U(z70Var, i11, e6Var);
        z70Var.setTextSize(1, 13.0f);
        z70Var.setGravity(17);
        z70Var.setText(R0(hd.M0(2131743006, null), org.telegram.ui.ActionBar.j6.Xc, e6Var, new f4(context, i7)));
        linearLayout.addView(z70Var, c8.ja.k(0.0f, 12.0f, 0.0f, 6.0f, -1, -2));
        k10.O = frameLayout;
        org.telegram.ui.ActionBar.u2[] u2VarArr = {k10};
        u2VarArr[0].u0(true);
        u2VarArr[0].O();
        g10.setOnClickListener(new m4(u2VarArr, i7));
        u2VarArr[0].show();
    }

    public static void J0(int i7, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        l0 x10 = l0.x(i7);
        if (x10.G()) {
            String t6 = x10.t();
            if (TextUtils.isEmpty(t6)) {
                return;
            }
            K0(context, i7, t6, true, null, e6Var);
        }
    }

    public static void K0(Context context, final int i7, String str, final boolean z10, final g gVar, final org.telegram.ui.ActionBar.e6 e6Var) {
        float f10;
        int i10 = 1;
        int i11 = 0;
        final org.telegram.ui.ActionBar.u2 u2Var = new org.telegram.ui.ActionBar.u2(1, context, e6Var, false);
        u2Var.v0(-12207881);
        u2Var.P(-12207881);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackground(new x5());
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(1);
        frameLayout.addView(linearLayout, c8.ja.f(-2.0f, -1, 55, org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(30.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f) + org.telegram.messenger.g0.n));
        w5 w5Var = new w5(context, str);
        if (!z10) {
            w5Var.b.setText(hd.M0(2131746500, null));
        }
        linearLayout.addView(w5Var, c8.ja.r(ns.L4, ns.Z4, 1));
        TextView textView = new TextView(context);
        textView.setText(hd.M0(2131743041, null));
        textView.setTextColor(-1);
        textView.setTextSize(1, 14.0f);
        textView.setGravity(17);
        textView.setLineSpacing(org.telegram.messenger.g0.L(1.0f), 1.0f);
        linearLayout.addView(textView, c8.ja.t(-1, -2, 1, 24, 0, 24, 20));
        final hi.d dVar = new hi.d(context, null, true);
        dVar.setRoundRadius(24);
        dVar.setColor(-1);
        dVar.setTextColor(-15556886);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (z10) {
            f10 = 12.0f;
            spannableStringBuilder.append((CharSequence) "$");
            spannableStringBuilder.setSpan(new eq(R.drawable.wallet_buy, 0), 0, spannableStringBuilder.length(), 33);
            spannableStringBuilder.append((CharSequence) " ").append((CharSequence) hd.M0(2131743180, null));
        } else {
            f10 = 12.0f;
            eq eqVar = new eq(R.drawable.mini_gram_24, 0);
            eqVar.c(org.telegram.messenger.g0.L(20.0f));
            spannableStringBuilder.append((CharSequence) "G");
            spannableStringBuilder.setSpan(eqVar, 0, spannableStringBuilder.length(), 33);
            spannableStringBuilder.append((CharSequence) "  ").append((CharSequence) hd.M0(2131743017, null));
        }
        dVar.setText(spannableStringBuilder);
        linearLayout.addView(dVar, c8.ja.t(-1, 48, 1, 0, 0, 0, 0));
        if (!z10) {
            textView.setVisibility(8);
            dVar.setVisibility(gVar != null ? 0 : 8);
        }
        View e10 = i20.e(context, R.drawable.ic_close_white);
        e10.setPadding(org.telegram.messenger.g0.L(f10), org.telegram.messenger.g0.L(f10), org.telegram.messenger.g0.L(f10), org.telegram.messenger.g0.L(f10));
        e10.setContentDescription(hd.M0(2131752041, null));
        c8.na.a(e10);
        frameLayout.addView(e10, c8.ja.d(48, 48.0f, 51, 4.0f, 2.0f, 0.0f, 0.0f));
        u2Var.O = frameLayout;
        u2Var.x = true;
        u2Var.v0 = false;
        u2Var.w0 = false;
        u2Var.P(-12207881);
        e10.setOnClickListener(new d4(u2Var, i11));
        w5Var.f = new q0(str, i10);
        u2Var.show();
        u2Var.E0(-12207881);
        org.telegram.messenger.g0.t3(u2Var, -12207881, false, null);
        org.telegram.messenger.g0.n3(u2Var, false);
        if (Build.VERSION.SDK_INT >= 29 && u2Var.getWindow() != null) {
            u2Var.getWindow().setNavigationBarContrastEnforced(false);
        }
        dVar.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Wallet.j4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                boolean z11 = z10;
                org.telegram.ui.ActionBar.u2 u2Var2 = u2Var;
                if (!z11) {
                    u2Var2.dismiss();
                    gVar.run();
                    return;
                }
                hi.d dVar2 = dVar;
                if (dVar2.R) {
                    return;
                }
                dVar2.setLoading(true);
                o4 o4Var = new o4(dVar2, u2Var2, e6Var, 0);
                int i12 = i7;
                l0 x10 = l0.x(i12);
                x10.m0(new u11(i12, o4Var, x10));
            }
        });
    }

    public static SpannableStringBuilder R0(String str, int i7, org.telegram.ui.ActionBar.e6 e6Var, Runnable runnable) {
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
            spannableStringBuilder.setSpan(new ki.h3(i7, e6Var, runnable), indexOf, i10 + indexOf, 0);
        }
        return spannableStringBuilder;
    }

    public static void Z0(u41 u41Var, boolean z10) {
        boolean canScrollVertically = u41Var.canScrollVertically(-1);
        u41Var.g3.O(z10);
        u41Var.a0();
        if (canScrollVertically) {
            return;
        }
        u41Var.f3.h1(0, 0);
    }

    public static Uri c1(String str) {
        Uri parse = Uri.parse(str.trim());
        if (parse.getScheme() == null) {
            Uri parse2 = Uri.parse("https://" + str.trim());
            if (B0(parse2.getHost())) {
                return parse2;
            }
        }
        return parse;
    }

    public static void d0(y5 y5Var) {
        l0 x10 = l0.x(y5Var.currentAccount);
        hi.d dVar = y5Var.D0;
        if (dVar.R) {
            return;
        }
        dVar.setLoading(true);
        boolean z10 = false;
        x10.m0(new h2.n0(x10, new x21(13, y5Var, x10), z10, z10, 4));
    }

    public static String d1(Uri uri) {
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

    public static void e0(y5 y5Var) {
        vf.c.t(y5Var.getParentActivity(), l0.x(y5Var.currentAccount).j);
    }

    public static void f0(y5 y5Var) {
        J0(y5Var.currentAccount, y5Var.getParentActivity(), y5Var.getResourceProvider());
    }

    public static void g0(y5 y5Var, String str, l0 l0Var, m60 m60Var, LinearLayout linearLayout, TL_wallet.currencyRate currencyrate) {
        if (currencyrate == null) {
            return;
        }
        org.telegram.ui.ActionBar.z0 z0Var = new org.telegram.ui.ActionBar.z0(2, y5Var.getParentActivity(), y5Var.resourceProvider, false, false);
        z0Var.setPadding(org.telegram.messenger.g0.L(18.0f), 0, org.telegram.messenger.g0.L(18.0f), 0);
        z0Var.setText(currencyrate.currency);
        z0Var.setSubtext(!TextUtils.isEmpty(currencyrate.translatedTitle) ? currencyrate.translatedTitle : currencyrate.title);
        boolean equals = TextUtils.equals(str, currencyrate.currency);
        z0Var.b.setPadding(0, 0, org.telegram.messenger.g0.L(equals ? 42.0f : 0.0f), 0);
        z0Var.setChecked(equals);
        z0Var.setOnClickListener(new i1(l0Var, currencyrate, m60Var, 1));
        linearLayout.addView(z0Var, c8.ja.o(ns.e3, -2));
    }

    public static void h0(y5 y5Var) {
        org.telegram.ui.ActionBar.k kVar;
        if (y5Var.F == null || (kVar = y5Var.actionBar) == null || !(kVar.getParent() instanceof ViewGroup)) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) y5Var.actionBar.getParent();
        viewGroup.setClipChildren(false);
        viewGroup.setClipToPadding(false);
        if (y5Var.F.getParent() != y5Var.actionBar) {
            org.telegram.messenger.g0.E2(y5Var.F);
            y5Var.actionBar.addView(y5Var.F, c8.ja.c(-1.0f, -1));
        }
        y5Var.F.bringToFront();
        y5Var.actionBar.bringToFront();
        y5Var.F.post(new e4(y5Var, 12));
    }

    public static void i0(y5 y5Var) {
        J0(y5Var.currentAccount, y5Var.getParentActivity(), y5Var.getResourceProvider());
    }

    public static void j0(y5 y5Var, String str) {
        Uri c12 = c1(str);
        String d12 = d1(c12);
        if (d12 != null) {
            int i7 = y5Var.currentAccount;
            np.s1(i7).d2().a(d12, null, new ai.y1(new l4(y5Var, 4), i7));
        } else {
            if ((y5Var.getParentActivity() instanceof LaunchActivity) && new q90((LaunchActivity) y5Var.getParentActivity(), y5Var.currentAccount, null, false).g(c12)) {
                return;
            }
            org.telegram.messenger.g0.h3(new e4(y5Var, 11));
        }
    }

    public static void k0(y5 y5Var, LinearLayout linearLayout, l0 l0Var, m60 m60Var) {
        TL_wallet.currencyRate currencyrate;
        y5 y5Var2;
        ArrayList<TL_wallet.currencyRate> arrayList;
        LinearLayout linearLayout2 = linearLayout;
        l0 l0Var2 = l0Var;
        linearLayout2.removeAllViews();
        String g10 = l0Var2.h.g();
        TL_wallet.currencyRates f10 = l0Var2.h.f();
        if (f10 == null) {
            for (int i7 = 0; i7 < 3; i7++) {
                pz pzVar = new pz(y5Var.getParentActivity(), y5Var.getResourceProvider());
                pzVar.setIsSingleCell(true);
                pzVar.setViewType(31);
                linearLayout2.addView(pzVar, c8.ja.o(ns.e3, -2));
            }
            return;
        }
        f fVar = l0Var2.h;
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
            f.a(linkedHashSet, ((org.telegram.messenger.n0) np.s1(fVar.a).y7.O.b).c);
            f.c(linkedHashSet, hd.E0().y);
            f.c(linkedHashSet, hd.E0().z);
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
                g0(y5Var, g10, l0Var2, m60Var, linearLayout2, currencyrate7);
            }
            i12++;
            l0Var2 = l0Var;
        }
        if (hashSet.isEmpty() || f10.rates.isEmpty()) {
            y5Var2 = y5Var;
        } else {
            y5Var2 = y5Var;
            linearLayout2.addView(new org.telegram.ui.ActionBar.d1(y5Var.getParentActivity(), y5Var2.resourceProvider), c8.ja.o(-1, 8));
        }
        int i13 = 0;
        while (i13 < f10.rates.size()) {
            TL_wallet.currencyRate currencyrate8 = f10.rates.get(i13);
            if (currencyrate8 != null && !hashSet.contains(currencyrate8.currency)) {
                g0(y5Var2, g10, l0Var, m60Var, linearLayout2, currencyrate8);
            }
            i13++;
            y5Var2 = y5Var;
            linearLayout2 = linearLayout;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void l0(final y5 y5Var, Context context, View view) {
        l0 x10 = l0.x(y5Var.currentAccount);
        final m60 I = m60.I(y5Var, view);
        I.a0(0.0f, -org.telegram.messenger.g0.L(48.0f));
        final int i7 = 0;
        I.s = 0;
        I.V(5);
        m60 J = I.J();
        J.c(R.drawable.ic_ab_back, hd.M0(2131743192, null), new fq0(I, 27), false);
        J.k();
        ScrollView scrollView = new ScrollView(context);
        LinearLayout linearLayout = new LinearLayout(context);
        final int i10 = 1;
        linearLayout.setOrientation(1);
        scrollView.addView(linearLayout);
        g7 g7Var = new g7(y5Var, linearLayout, x10, I, 11);
        J.r(scrollView, c8.ja.o(-1, 350));
        I.c(R.drawable.wallet_globe, hd.M0(2131743148, null), new g(g7Var, I, J, 11), false);
        org.telegram.ui.ActionBar.z0 y10 = I.y();
        f fVar = x10.h;
        String i11 = fVar.i();
        boolean isEmpty = TextUtils.isEmpty(i11);
        String str = i11;
        if (isEmpty) {
            y10.setSubtext("USD");
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(hd.M0(2131748779, null));
            spannableStringBuilder.setSpan(new e80(org.telegram.messenger.g0.L(75.0f), y10.b), 0, spannableStringBuilder.length(), 33);
            str = spannableStringBuilder;
        }
        y10.setSubtext(str);
        g7 g7Var2 = new g7(x10, new boolean[]{fVar.f() != null}, y10, g7Var, 12);
        y5Var.Q0.add(g7Var2);
        g7Var.run();
        I.c(R.drawable.wallet_lock, hd.M0(2131747657, null), new Runnable(y5Var) { // from class: org.telegram.ui.Wallet.q4
            public final /* synthetic */ y5 b;

            {
                this.b = y5Var;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i7) {
                    case 0:
                        y5 y5Var2 = this.b;
                        y5Var2.getClass();
                        I.u();
                        y5Var2.presentFragment(PasscodeActivity.p0());
                        break;
                    case 1:
                        y5 y5Var3 = this.b;
                        y5Var3.getClass();
                        I.u();
                        y5Var3.presentFragment(new p8());
                        break;
                    case 2:
                        y5 y5Var4 = this.b;
                        y5Var4.getClass();
                        I.u();
                        y5Var4.presentFragment(new ka());
                        break;
                    default:
                        I.u();
                        y5 y5Var5 = this.b;
                        y5.I0(y5Var5.getParentActivity(), y5Var5.getResourceProvider());
                        break;
                }
            }
        }, false);
        I.c(R.drawable.wallet_key, hd.M0(2131743080, null), new Runnable(y5Var) { // from class: org.telegram.ui.Wallet.q4
            public final /* synthetic */ y5 b;

            {
                this.b = y5Var;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i10) {
                    case 0:
                        y5 y5Var2 = this.b;
                        y5Var2.getClass();
                        I.u();
                        y5Var2.presentFragment(PasscodeActivity.p0());
                        break;
                    case 1:
                        y5 y5Var3 = this.b;
                        y5Var3.getClass();
                        I.u();
                        y5Var3.presentFragment(new p8());
                        break;
                    case 2:
                        y5 y5Var4 = this.b;
                        y5Var4.getClass();
                        I.u();
                        y5Var4.presentFragment(new ka());
                        break;
                    default:
                        I.u();
                        y5 y5Var5 = this.b;
                        y5.I0(y5Var5.getParentActivity(), y5Var5.getResourceProvider());
                        break;
                }
            }
        }, false);
        final int i12 = 2;
        I.l(R.drawable.wallet_apps, hd.M0(2131743156, null), new Runnable(y5Var) { // from class: org.telegram.ui.Wallet.q4
            public final /* synthetic */ y5 b;

            {
                this.b = y5Var;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i12) {
                    case 0:
                        y5 y5Var2 = this.b;
                        y5Var2.getClass();
                        I.u();
                        y5Var2.presentFragment(PasscodeActivity.p0());
                        break;
                    case 1:
                        y5 y5Var3 = this.b;
                        y5Var3.getClass();
                        I.u();
                        y5Var3.presentFragment(new p8());
                        break;
                    case 2:
                        y5 y5Var4 = this.b;
                        y5Var4.getClass();
                        I.u();
                        y5Var4.presentFragment(new ka());
                        break;
                    default:
                        I.u();
                        y5 y5Var5 = this.b;
                        y5.I0(y5Var5.getParentActivity(), y5Var5.getResourceProvider());
                        break;
                }
            }
        }, true ^ x10.g.d.isEmpty());
        I.k();
        final int i13 = 3;
        I.c(R.drawable.wallet_help, hd.M0(2131742960, null), new Runnable(y5Var) { // from class: org.telegram.ui.Wallet.q4
            public final /* synthetic */ y5 b;

            {
                this.b = y5Var;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i13) {
                    case 0:
                        y5 y5Var2 = this.b;
                        y5Var2.getClass();
                        I.u();
                        y5Var2.presentFragment(PasscodeActivity.p0());
                        break;
                    case 1:
                        y5 y5Var3 = this.b;
                        y5Var3.getClass();
                        I.u();
                        y5Var3.presentFragment(new p8());
                        break;
                    case 2:
                        y5 y5Var4 = this.b;
                        y5Var4.getClass();
                        I.u();
                        y5Var4.presentFragment(new ka());
                        break;
                    default:
                        I.u();
                        y5 y5Var5 = this.b;
                        y5.I0(y5Var5.getParentActivity(), y5Var5.getResourceProvider());
                        break;
                }
            }
        }, false);
        I.p = new r(7, y5Var, g7Var2);
        I.Z();
    }

    public static void m0(y5 y5Var, long j3) {
        e4 e4Var = y5Var.L0;
        if (y5Var.a == null) {
            return;
        }
        u8 u8Var = y5Var.j0;
        if (u8Var != null) {
            u8Var.a();
        }
        if (y5Var.J0 <= 0.0f && y5Var.A0()) {
            int top = y5Var.a.f3.m(y5Var.h).getTop() - y5Var.a.getPaddingTop();
            y5Var.a.C0();
            if (top < 0) {
                y5Var.a.w0(0, top, er.h);
                return;
            }
            return;
        }
        y5Var.a.C0();
        y5Var.s0(true);
        org.telegram.messenger.g0.r(e4Var);
        if (j3 > 0) {
            org.telegram.messenger.g0.i3(e4Var, j3 + 260);
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
    /* JADX WARN: Removed duplicated region for block: B:39:0x03ed  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x05c0  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x064a  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0695  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0631  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0560  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static LinearLayout t0(final Context context, int i7, TL_wallet.walletTransaction wallettransaction, u10 u10Var, s10 s10Var, byte[] bArr, Runnable runnable, org.telegram.ui.ActionBar.e6 e6Var, x2[] x2VarArr, boolean z10) {
        String t6;
        String str;
        b5 b5Var;
        TextView textView;
        ImageView imageView;
        ImageView imageView2;
        float f10;
        int i10;
        ImageView imageView3;
        vx0 vx0Var;
        SpannableString[] spannableStringArr;
        LinearLayout linearLayout;
        String[] strArr;
        boolean[] zArr;
        TextView[] textViewArr;
        TL_wallet.walletTransaction wallettransaction2;
        c5 c5Var;
        int i11;
        e5 e5Var;
        final x2[] x2VarArr2;
        char c10;
        Object s5;
        int i12;
        final FrameLayout frameLayout;
        final org.telegram.ui.ActionBar.e6 e6Var2 = e6Var;
        boolean z11 = u10Var != null;
        final LinearLayout f11 = org.telegram.messenger.k5.f(context, 1);
        FrameLayout frameLayout2 = new FrameLayout(context);
        f11.addView(frameLayout2, c8.ja.o(-1, 56));
        int i13 = org.telegram.ui.ActionBar.j6.G6;
        org.telegram.ui.ActionBar.j6.w0(i13, e6Var2);
        int i14 = org.telegram.ui.ActionBar.j6.i6;
        int w02 = org.telegram.ui.ActionBar.j6.w0(i14, e6Var2);
        ImageView imageView4 = new ImageView(context);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView4.setScaleType(scaleType);
        imageView4.setImageResource(R.drawable.ic_ab_close);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        org.telegram.ui.ActionBar.q6.s(imageView4, i13, e6Var2, mode);
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.j6.h0(w02, 1, -1);
        org.telegram.ui.ActionBar.m6 M = org.telegram.ui.ActionBar.q6.M(i14);
        imageView4.setBackground(h02);
        org.telegram.ui.ActionBar.q6.j(imageView4, h02, null, M, e6Var2);
        imageView4.setContentDescription(hd.M0(2131752041, null));
        frameLayout2.addView(imageView4, c8.ja.d(48, 48.0f, 19, 4.0f, -2.0f, 0.0f, 0.0f));
        ImageView imageView5 = new ImageView(context);
        imageView5.setScaleType(scaleType);
        imageView5.setImageResource(R.drawable.ic_ab_other);
        org.telegram.ui.ActionBar.q6.s(imageView5, i13, e6Var2, mode);
        org.telegram.ui.Cells.y h03 = org.telegram.ui.ActionBar.j6.h0(w02, 1, -1);
        org.telegram.ui.ActionBar.m6 M2 = org.telegram.ui.ActionBar.q6.M(i14);
        imageView5.setBackground(h03);
        org.telegram.ui.ActionBar.q6.j(imageView5, h03, null, M2, e6Var2);
        imageView5.setContentDescription(hd.M0(2131754839, null));
        imageView5.setVisibility(u10Var != null ? 8 : 0);
        frameLayout2.addView(imageView5, c8.ja.d(44, 48.0f, 21, 0.0f, 2.0f, 4.0f, 0.0f));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        linearLayout2.setGravity(1);
        f11.addView(linearLayout2, c8.ja.k(14.0f, wallettransaction.key_change ? -20.0f : -40.0f, 14.0f, 24.0f, -1, -2));
        View w6Var = new w6(120, context, z10);
        w6Var.setTag(w6.class);
        linearLayout2.addView(w6Var, c8.ja.t(120, 120, 1, 0, 0, 0, -8));
        b5 b5Var2 = new b5(context);
        b5Var2.setSingleLine(true);
        b5Var2.setGravity(17);
        b5Var2.setIncludeFontPadding(false);
        b5Var2.setTextSize(1, 40.0f);
        b5Var2.setTypeface(org.telegram.messenger.g0.o());
        linearLayout2.addView(b5Var2, c8.ja.r(-1, 50, 1));
        TextView textView2 = new TextView(context);
        textView2.setGravity(17);
        textView2.setIncludeFontPadding(false);
        textView2.setTextSize(1, 14.0f);
        int i15 = org.telegram.ui.ActionBar.j6.z6;
        org.telegram.ui.ActionBar.q6.U(textView2, i15, e6Var2);
        linearLayout2.addView(textView2, c8.ja.t(-1, 20, 1, 0, 3, 0, 0));
        if (wallettransaction.key_change) {
            linearLayout2.removeAllViews();
            FrameLayout frameLayout3 = new FrameLayout(context);
            frameLayout3.setBackground(org.telegram.ui.ActionBar.j6.M(org.telegram.messenger.g0.L(76.0f), -7956054, -9534569));
            ImageView imageView6 = new ImageView(context);
            imageView6.setImageResource(R.drawable.wallet_transaction_key);
            imageView6.setScaleType(ImageView.ScaleType.FIT_CENTER);
            frameLayout3.addView(imageView6, c8.ja.e(44, 44, 17));
            linearLayout2.addView(frameLayout3, c8.ja.r(76, 76, 1));
            TextView textView3 = new TextView(context);
            textView3.setText(hd.M0(2131743081, null));
            org.telegram.messenger.k5.m(textView3, i13, e6Var2, 1, 18.0f);
            textView3.setGravity(17);
            textView3.setIncludeFontPadding(false);
            linearLayout2.addView(textView3, c8.ja.t(-1, 24, 1, 12, 12, 12, 0));
        } else if (wallettransaction.nft != null) {
            linearLayout2.removeAllViews();
            TL_wallet.nftItem nftitem = wallettransaction.nft;
            org.telegram.ui.Components.i9 i9Var = new org.telegram.ui.Components.i9(context);
            i9Var.setRoundRadius(org.telegram.messenger.g0.L(12.0f));
            i9Var.setContentDescription(nftitem.name);
            Drawable mutate = context.getResources().getDrawable(R.drawable.wallet_nft_placeholder).mutate();
            org.telegram.ui.ActionBar.q6.x(i9Var, mutate, i15, e6Var2, mode);
            gc c11 = c.c(nftitem, false);
            if (c11 != null) {
                i9Var.j(c11, "120_120", mutate, nftitem);
            } else {
                i9Var.setImageDrawable(mutate);
            }
            linearLayout2.addView(i9Var, c8.ja.r(120, 120, 1));
            TextView textView4 = new TextView(context);
            textView4.setText(TextUtils.isEmpty(nftitem.name) ? hd.M0(2131743176, null) : nftitem.name);
            org.telegram.messenger.k5.m(textView4, i13, e6Var2, 1, 17.0f);
            textView4.setGravity(17);
            linearLayout2.addView(textView4, c8.ja.k(12.0f, 16.0f, 12.0f, 0.0f, -1, -2));
            if (wallettransaction.incoming) {
                t6 = l0.x(i7).t();
            } else {
                TL_wallet.WalletTransactionPeer walletTransactionPeer = wallettransaction.peer;
                if (walletTransactionPeer == null) {
                    str = null;
                    if (u10Var == null) {
                        if (wallettransaction.comment_encrypted || wallettransaction.comment_encrypted_preparing) {
                            f10 = 11.0f;
                            if (wallettransaction.comment_encrypted_preparing || !TextUtils.isEmpty(str)) {
                                xh.l lVar = new xh.l(context, e6Var2, false);
                                lVar.r = false;
                                lVar.setTextSize(1, 15.0f);
                                org.telegram.ui.ActionBar.q6.U(lVar, i13, e6Var2);
                                StringBuilder sb2 = new StringBuilder(25);
                                int i16 = 0;
                                for (int i17 = 25; i16 < i17; i17 = 25) {
                                    sb2.append("a");
                                    i16++;
                                }
                                SpannableString spannableString = new SpannableString(sb2.toString());
                                wy0 wy0Var = new wy0();
                                wy0Var.a |= 256;
                                spannableString.setSpan(new xy0(wy0Var, 0), 0, spannableString.length(), 33);
                                lVar.setText(spannableString);
                                org.telegram.ui.ActionBar.r4 r4Var = new org.telegram.ui.ActionBar.r4(0, false, false, null);
                                r4Var.x = false;
                                r4Var.w = Integer.valueOf(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.am, e6Var2));
                                lVar.setBackground(r4Var);
                                lVar.setPadding(org.telegram.messenger.g0.L(19.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(15.0f), org.telegram.messenger.g0.L(11.0f));
                                linearLayout2.addView(lVar, c8.ja.t(-2, -2, 1, 32, 15, 32, 0));
                                c8.na.a(lVar);
                                i10 = 1;
                                textView = textView2;
                                b5Var = b5Var2;
                                imageView = imageView4;
                                imageView2 = imageView5;
                                lVar.setOnClickListener(new di.x9(new boolean[]{false}, x2VarArr, e6Var2, lVar, wallettransaction, i7, str));
                                SpannableString[] spannableStringArr2 = new SpannableString[i10];
                                TextView[] textViewArr2 = new TextView[i10];
                                vx0 vx0Var2 = new vx0(context, e6Var2);
                                f11.addView(vx0Var2, c8.ja.k(14.0f, 0.0f, 14.0f, 0.0f, -1, -2));
                                final String[] strArr2 = {wallettransaction.comment};
                                final boolean[] zArr2 = {(wallettransaction.comment_encrypted || (z11 && bArr == null)) ? false : true};
                                int i18 = 4;
                                if (u10Var == null) {
                                    FrameLayout frameLayout4 = new FrameLayout(context);
                                    int L = org.telegram.messenger.g0.L(22.0f);
                                    int L2 = org.telegram.messenger.g0.L(22.0f);
                                    int i19 = org.telegram.ui.ActionBar.j6.a7;
                                    ShapeDrawable e02 = org.telegram.ui.ActionBar.j6.e0(L, L2, org.telegram.ui.ActionBar.j6.w0(i19, e6Var2));
                                    org.telegram.ui.ActionBar.m6 M3 = org.telegram.ui.ActionBar.q6.M(i19);
                                    frameLayout4.setBackground(e02);
                                    org.telegram.ui.ActionBar.q6.j(frameLayout4, e02, M3, null, e6Var2);
                                    final r rVar = new r(i18, textViewArr2, spannableStringArr2);
                                    final Runnable[] runnableArr = new Runnable[1];
                                    final de deVar = new de(runnableArr, textViewArr2, i7, e6Var2, wallettransaction, strArr2, zArr2, bArr);
                                    vx0Var = vx0Var2;
                                    textViewArr = textViewArr2;
                                    wallettransaction2 = wallettransaction;
                                    c5 c5Var2 = new c5(context, e6Var2);
                                    c5Var2.setHint(hd.M0(2131743059, null));
                                    c5Var2.setText(strArr2[0]);
                                    ImageView imageView7 = imageView;
                                    c5Var2.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(f10), org.telegram.messenger.g0.L(64.0f), org.telegram.messenger.g0.L(12.0f));
                                    int i20 = org.telegram.ui.ActionBar.j6.G6;
                                    org.telegram.ui.ActionBar.q6.U(c5Var2, i20, e6Var2);
                                    org.telegram.ui.ActionBar.m6 K = org.telegram.ui.ActionBar.q6.K(0.65f, i20);
                                    org.telegram.ui.ActionBar.q6.n(c5Var2, 1, K.a, -1, 2, K.d, e6Var);
                                    c5Var2.setMaxLines(4);
                                    frameLayout4.addView(c5Var2, c8.ja.d(-1, -2.0f, ns.E1, 0.0f, 0.0f, (wallettransaction2.nft != null || bArr == null) ? 0.0f : 44.0f, 0.0f));
                                    c5Var2.addTextChangedListener(new d5(strArr2, rVar, runnableArr, deVar));
                                    if (wallettransaction2.nft != null || bArr == null) {
                                        frameLayout = frameLayout4;
                                        e6Var2 = e6Var;
                                        imageView3 = imageView7;
                                        spannableStringArr = spannableStringArr2;
                                        strArr = strArr2;
                                        linearLayout = f11;
                                        c5Var = c5Var2;
                                        zArr = zArr2;
                                    } else {
                                        FrameLayout frameLayout5 = new FrameLayout(context);
                                        c8.na.a(frameLayout5);
                                        final ImageView imageView8 = new ImageView(context);
                                        frameLayout5.addView(imageView8, c8.ja.c(-1.0f, -1));
                                        imageView8.setScaleType(ImageView.ScaleType.CENTER);
                                        org.telegram.ui.ActionBar.q6.s(imageView8, zArr2[0] ? org.telegram.ui.ActionBar.j6.Fi : org.telegram.ui.ActionBar.j6.z6, e6Var, PorterDuff.Mode.SRC_IN);
                                        imageView8.setImageResource(zArr2[0] ? R.drawable.wallet_comment_locked : R.drawable.wallet_comment_unlocked);
                                        int i21 = org.telegram.ui.ActionBar.j6.i6;
                                        org.telegram.ui.Cells.y h04 = org.telegram.ui.ActionBar.j6.h0(org.telegram.ui.ActionBar.j6.w0(i21, e6Var), 1, -1);
                                        org.telegram.ui.ActionBar.m6 M4 = org.telegram.ui.ActionBar.q6.M(i21);
                                        imageView8.setBackground(h04);
                                        org.telegram.ui.ActionBar.q6.j(imageView8, h04, null, M4, e6Var);
                                        final hi.l3[] l3VarArr = new hi.l3[1];
                                        frameLayout = frameLayout4;
                                        e6Var2 = e6Var;
                                        imageView3 = imageView7;
                                        spannableStringArr = spannableStringArr2;
                                        c5Var = c5Var2;
                                        zArr = zArr2;
                                        linearLayout = f11;
                                        strArr = strArr2;
                                        frameLayout5.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Wallet.p4
                                            @Override // android.view.View.OnClickListener
                                            public final void onClick(View view) {
                                                final boolean[] zArr3 = zArr2;
                                                zArr3[0] = !zArr3[0];
                                                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
                                                final AtomicBoolean atomicBoolean = new AtomicBoolean();
                                                final ImageView imageView9 = imageView8;
                                                final org.telegram.ui.ActionBar.e6 e6Var3 = e6Var2;
                                                duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Wallet.t4
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
                                                            org.telegram.ui.ActionBar.q6.s(imageView10, zArr4[0] ? org.telegram.ui.ActionBar.j6.Fi : org.telegram.ui.ActionBar.j6.z6, e6Var3, PorterDuff.Mode.SRC_IN);
                                                            imageView10.setImageResource(zArr4[0] ? R.drawable.wallet_comment_locked : R.drawable.wallet_comment_unlocked);
                                                        }
                                                    }
                                                });
                                                duration.setInterpolator(er.h);
                                                duration.setDuration(420L);
                                                duration.start();
                                                hi.l3[] l3VarArr2 = l3VarArr;
                                                hi.l3 l3Var = l3VarArr2[0];
                                                if (l3Var != null) {
                                                    l3Var.f(true);
                                                    l3VarArr2[0] = null;
                                                }
                                                LinearLayout linearLayout3 = f11;
                                                if (linearLayout3.getParent() instanceof FrameLayout) {
                                                    FrameLayout frameLayout6 = (FrameLayout) linearLayout3.getParent();
                                                    hi.l3 l3Var2 = new hi.l3(context, 3);
                                                    l3VarArr2[0] = l3Var2;
                                                    l3Var2.t();
                                                    l3Var2.setPadding(org.telegram.messenger.g0.L(10.0f), 0, org.telegram.messenger.g0.L(10.0f), 0);
                                                    l3Var2.u(hd.M0(zArr3[0] ? 2131743047 : 2131743042, null));
                                                    l3Var2.setTranslationY(-(org.telegram.messenger.g0.L(44.0f) + (linearLayout3.getHeight() - frameLayout.getBottom())));
                                                    l3Var2.p(1.0f, -org.telegram.messenger.g0.L(26.0f));
                                                    l3Var2.s(20.0f);
                                                    float L3 = org.telegram.messenger.g0.L(12.0f);
                                                    float L4 = org.telegram.messenger.g0.L(4.0f);
                                                    int r12 = org.telegram.ui.ActionBar.j6.r1(0.25f, -16777216);
                                                    l3Var2.j0 = L3;
                                                    l3Var2.k0 = L4;
                                                    l3Var2.l0 = r12;
                                                    l3Var2.G.setShadowLayer(L3, 0.0f, L4, r12);
                                                    frameLayout6.addView(l3Var2, c8.ja.e(-1, ns.e3, 87));
                                                    l3Var2.w();
                                                    l3Var2.r0 = new l(l3Var2, 7);
                                                }
                                                if (TextUtils.isEmpty(strArr2[0])) {
                                                    return;
                                                }
                                                rVar.run();
                                                Runnable[] runnableArr2 = runnableArr;
                                                Runnable runnable2 = runnableArr2[0];
                                                if (runnable2 != null) {
                                                    runnable2.run();
                                                    runnableArr2[0] = null;
                                                }
                                                de deVar2 = deVar;
                                                org.telegram.messenger.g0.r(deVar2);
                                                org.telegram.messenger.g0.i3(deVar2, 1000L);
                                            }
                                        });
                                        frameLayout.addView(frameLayout5, c8.ja.e(44, 44, 85));
                                    }
                                    linearLayout.addView(frameLayout, c8.ja.k(14.0f, 12.0f, 14.0f, 8.0f, -1, -2));
                                } else {
                                    imageView3 = imageView;
                                    vx0Var = vx0Var2;
                                    spannableStringArr = spannableStringArr2;
                                    linearLayout = f11;
                                    strArr = strArr2;
                                    zArr = zArr2;
                                    textViewArr = textViewArr2;
                                    wallettransaction2 = wallettransaction;
                                    c5Var = null;
                                }
                                hi.d g10 = i20.g(24, context, e6Var2, true);
                                g10.setText(hd.M0(2131747831, null));
                                linearLayout.addView(g10, c8.ja.k(14.0f, 14.0f, 14.0f, 14.0f, -1, 48));
                                TL_wallet.walletTransaction[] wallettransactionArr = {wallettransaction2};
                                fi.r rVar2 = new fi.r(linearLayout, b5Var, e6Var2, i7, textView, x2VarArr, vx0Var, u10Var, context, textViewArr, spannableStringArr);
                                LinearLayout linearLayout3 = linearLayout;
                                linearLayout3.setTag(new r(5, rVar2, wallettransactionArr));
                                rVar2.a(wallettransaction2);
                                if (z11) {
                                    i11 = i7;
                                    e5 e5Var2 = new e5(i11, wallettransactionArr, rVar2);
                                    if (wallettransaction2.preview) {
                                        l0 x10 = l0.x(i11);
                                        String str2 = wallettransaction2.id;
                                        m mVar = new m(wallettransaction2, rVar2, wallettransactionArr, 4);
                                        HashMap hashMap = x10.K;
                                        k0 k0Var = x10.n;
                                        if (k0Var != null) {
                                            ArrayList arrayList = k0Var.c;
                                            int size = arrayList.size();
                                            int i22 = 0;
                                            while (i22 < size) {
                                                Object obj = arrayList.get(i22);
                                                i22++;
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
                                            ConnectionsManager.getInstance(x10.a).sendRequestTyped(gettransactionsbyids, new d3.b(1), new j(x10, (Object) mVar, (Object) str2, 4));
                                        }
                                    }
                                    e5Var = e5Var2;
                                } else {
                                    i11 = i7;
                                    e5Var = null;
                                }
                                String[] strArr3 = strArr;
                                boolean[] zArr3 = zArr;
                                linearLayout3.addOnAttachStateChangeListener(new f5(rVar2, wallettransactionArr, e5Var, i11, s10Var, x2VarArr, strArr3, zArr3));
                                if (u10Var == null) {
                                    TL_wallet.nftItem nftitem2 = wallettransaction2.nft;
                                    if (nftitem2 != null) {
                                        s5 = TextUtils.isEmpty(nftitem2.name) ? hd.M0(2131743176, null) : wallettransaction2.nft.name;
                                        i12 = 1;
                                        c10 = 0;
                                    } else {
                                        long abs = Math.abs(wallettransaction2.amount);
                                        c10 = 0;
                                        s5 = l0.s(abs, false);
                                        i12 = 1;
                                    }
                                    Object[] objArr = new Object[i12];
                                    objArr[c10] = s5;
                                    g10.setText(hd.V(null, null, 2131743021, objArr));
                                    x2VarArr2 = x2VarArr;
                                    g10.setOnClickListener(new org.telegram.messenger.video.g(g10, c5Var, u10Var, strArr3, zArr3, x2VarArr2, e6Var));
                                } else {
                                    x2VarArr2 = x2VarArr;
                                    final int i23 = 0;
                                    if (runnable != null) {
                                        g10.setText(hd.M0(2131743060, null));
                                        g10.setOnClickListener(new a90(27, runnable, x2VarArr2));
                                    } else {
                                        g10.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Wallet.n4
                                            @Override // android.view.View.OnClickListener
                                            public final void onClick(View view) {
                                                switch (i23) {
                                                    case 0:
                                                        x2VarArr2[0].dismiss();
                                                        break;
                                                    default:
                                                        x2VarArr2[0].dismiss();
                                                        break;
                                                }
                                            }
                                        });
                                    }
                                }
                                final int i24 = 1;
                                imageView3.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Wallet.n4
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view) {
                                        switch (i24) {
                                            case 0:
                                                x2VarArr2[0].dismiss();
                                                break;
                                            default:
                                                x2VarArr2[0].dismiss();
                                                break;
                                        }
                                    }
                                });
                                ImageView imageView9 = imageView2;
                                imageView9.setOnClickListener(new di.v9(x2VarArr2, e6Var, imageView9, wallettransactionArr, context, i7));
                                return linearLayout3;
                            }
                        } else if (TextUtils.isEmpty(wallettransaction.comment)) {
                            f10 = 11.0f;
                        } else {
                            xh.l lVar2 = new xh.l(context);
                            lVar2.setTextSize(1, 15.0f);
                            org.telegram.ui.ActionBar.q6.U(lVar2, i13, e6Var2);
                            f10 = 11.0f;
                            lVar2.setText(org.telegram.messenger.j6.m(wallettransaction.comment, lVar2.getPaint().getFontMetricsInt(), false, null, 0));
                            lVar2.setTextIsSelectable(true);
                            org.telegram.ui.ActionBar.r4 r4Var2 = new org.telegram.ui.ActionBar.r4(0, false, false, null);
                            r4Var2.x = false;
                            r4Var2.w = Integer.valueOf(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.am, e6Var2));
                            lVar2.setBackground(r4Var2);
                            lVar2.setPadding(org.telegram.messenger.g0.L(19.0f), org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(15.0f), org.telegram.messenger.g0.L(8.0f));
                            linearLayout2.addView(lVar2, c8.ja.t(-2, -2, 1, 32, 16, 32, 0));
                        }
                        b5Var = b5Var2;
                        textView = textView2;
                        imageView = imageView4;
                        imageView2 = imageView5;
                    } else {
                        b5Var = b5Var2;
                        textView = textView2;
                        imageView = imageView4;
                        imageView2 = imageView5;
                        f10 = 11.0f;
                    }
                    i10 = 1;
                    SpannableString[] spannableStringArr22 = new SpannableString[i10];
                    TextView[] textViewArr22 = new TextView[i10];
                    vx0 vx0Var22 = new vx0(context, e6Var2);
                    f11.addView(vx0Var22, c8.ja.k(14.0f, 0.0f, 14.0f, 0.0f, -1, -2));
                    final String[] strArr22 = {wallettransaction.comment};
                    final boolean[] zArr22 = {(wallettransaction.comment_encrypted || (z11 && bArr == null)) ? false : true};
                    int i182 = 4;
                    if (u10Var == null) {
                    }
                    hi.d g102 = i20.g(24, context, e6Var2, true);
                    g102.setText(hd.M0(2131747831, null));
                    linearLayout.addView(g102, c8.ja.k(14.0f, 14.0f, 14.0f, 14.0f, -1, 48));
                    TL_wallet.walletTransaction[] wallettransactionArr2 = {wallettransaction2};
                    fi.r rVar22 = new fi.r(linearLayout, b5Var, e6Var2, i7, textView, x2VarArr, vx0Var, u10Var, context, textViewArr, spannableStringArr);
                    LinearLayout linearLayout32 = linearLayout;
                    linearLayout32.setTag(new r(5, rVar22, wallettransactionArr2));
                    rVar22.a(wallettransaction2);
                    if (z11) {
                    }
                    String[] strArr32 = strArr;
                    boolean[] zArr32 = zArr;
                    linearLayout32.addOnAttachStateChangeListener(new f5(rVar22, wallettransactionArr2, e5Var, i11, s10Var, x2VarArr, strArr32, zArr32));
                    if (u10Var == null) {
                    }
                    final int i242 = 1;
                    imageView3.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Wallet.n4
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i242) {
                                case 0:
                                    x2VarArr2[0].dismiss();
                                    break;
                                default:
                                    x2VarArr2[0].dismiss();
                                    break;
                            }
                        }
                    });
                    ImageView imageView92 = imageView2;
                    imageView92.setOnClickListener(new di.v9(x2VarArr2, e6Var, imageView92, wallettransactionArr2, context, i7));
                    return linearLayout32;
                }
                t6 = walletTransactionPeer.address;
            }
            str = t6;
            if (u10Var == null) {
            }
            i10 = 1;
            SpannableString[] spannableStringArr222 = new SpannableString[i10];
            TextView[] textViewArr222 = new TextView[i10];
            vx0 vx0Var222 = new vx0(context, e6Var2);
            f11.addView(vx0Var222, c8.ja.k(14.0f, 0.0f, 14.0f, 0.0f, -1, -2));
            final String[] strArr222 = {wallettransaction.comment};
            final boolean[] zArr222 = {(wallettransaction.comment_encrypted || (z11 && bArr == null)) ? false : true};
            int i1822 = 4;
            if (u10Var == null) {
            }
            hi.d g1022 = i20.g(24, context, e6Var2, true);
            g1022.setText(hd.M0(2131747831, null));
            linearLayout.addView(g1022, c8.ja.k(14.0f, 14.0f, 14.0f, 14.0f, -1, 48));
            TL_wallet.walletTransaction[] wallettransactionArr22 = {wallettransaction2};
            fi.r rVar222 = new fi.r(linearLayout, b5Var, e6Var2, i7, textView, x2VarArr, vx0Var, u10Var, context, textViewArr, spannableStringArr);
            LinearLayout linearLayout322 = linearLayout;
            linearLayout322.setTag(new r(5, rVar222, wallettransactionArr22));
            rVar222.a(wallettransaction2);
            if (z11) {
            }
            String[] strArr322 = strArr;
            boolean[] zArr322 = zArr;
            linearLayout322.addOnAttachStateChangeListener(new f5(rVar222, wallettransactionArr22, e5Var, i11, s10Var, x2VarArr, strArr322, zArr322));
            if (u10Var == null) {
            }
            final int i2422 = 1;
            imageView3.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Wallet.n4
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i2422) {
                        case 0:
                            x2VarArr2[0].dismiss();
                            break;
                        default:
                            x2VarArr2[0].dismiss();
                            break;
                    }
                }
            });
            ImageView imageView922 = imageView2;
            imageView922.setOnClickListener(new di.v9(x2VarArr2, e6Var, imageView922, wallettransactionArr22, context, i7));
            return linearLayout322;
        }
        if (wallettransaction.incoming) {
        }
        str = t6;
        if (u10Var == null) {
        }
        i10 = 1;
        SpannableString[] spannableStringArr2222 = new SpannableString[i10];
        TextView[] textViewArr2222 = new TextView[i10];
        vx0 vx0Var2222 = new vx0(context, e6Var2);
        f11.addView(vx0Var2222, c8.ja.k(14.0f, 0.0f, 14.0f, 0.0f, -1, -2));
        final String[] strArr2222 = {wallettransaction.comment};
        final boolean[] zArr2222 = {(wallettransaction.comment_encrypted || (z11 && bArr == null)) ? false : true};
        int i18222 = 4;
        if (u10Var == null) {
        }
        hi.d g10222 = i20.g(24, context, e6Var2, true);
        g10222.setText(hd.M0(2131747831, null));
        linearLayout.addView(g10222, c8.ja.k(14.0f, 14.0f, 14.0f, 14.0f, -1, 48));
        TL_wallet.walletTransaction[] wallettransactionArr222 = {wallettransaction2};
        fi.r rVar2222 = new fi.r(linearLayout, b5Var, e6Var2, i7, textView, x2VarArr, vx0Var, u10Var, context, textViewArr, spannableStringArr);
        LinearLayout linearLayout3222 = linearLayout;
        linearLayout3222.setTag(new r(5, rVar2222, wallettransactionArr222));
        rVar2222.a(wallettransaction2);
        if (z11) {
        }
        String[] strArr3222 = strArr;
        boolean[] zArr3222 = zArr;
        linearLayout3222.addOnAttachStateChangeListener(new f5(rVar2222, wallettransactionArr222, e5Var, i11, s10Var, x2VarArr, strArr3222, zArr3222));
        if (u10Var == null) {
        }
        final int i24222 = 1;
        imageView3.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Wallet.n4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i24222) {
                    case 0:
                        x2VarArr2[0].dismiss();
                        break;
                    default:
                        x2VarArr2[0].dismiss();
                        break;
                }
            }
        });
        ImageView imageView9222 = imageView2;
        imageView9222.setOnClickListener(new di.v9(x2VarArr2, e6Var, imageView9222, wallettransactionArr222, context, i7));
        return linearLayout3222;
    }

    public static String v0(String str) {
        StringBuilder sb2 = new StringBuilder((str.length() / 4) + str.length());
        for (int i7 = 0; i7 < str.length(); i7++) {
            if (i7 > 0 && i7 % 4 == 0) {
                sb2.append(' ');
            }
            sb2.append(str.charAt(i7));
        }
        return sb2.toString();
    }

    public static SpannableStringBuilder w0(int i7, long j3, org.telegram.ui.ActionBar.e6 e6Var) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("G ");
        eq eqVar = new eq(R.drawable.wallet_gram_small, 2);
        eqVar.d = false;
        eqVar.c(org.telegram.messenger.g0.L(16.0f));
        spannableStringBuilder.setSpan(eqVar, 0, 1, 33);
        BigDecimal movePointLeft = new BigDecimal(j3).movePointLeft(9);
        spannableStringBuilder.append((CharSequence) (movePointLeft.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : movePointLeft.stripTrailingZeros()).toPlainString());
        CharSequence m10 = l0.x(i7).m(j3, true);
        if (!TextUtils.isEmpty(m10)) {
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) "  ~\u2009").append(m10);
            spannableStringBuilder.setSpan(new b00(org.telegram.ui.ActionBar.j6.z6, e6Var), length, spannableStringBuilder.length(), 33);
        }
        return spannableStringBuilder;
    }

    public final boolean A0() {
        View m10;
        bi.v3 v3Var = this.a;
        return v3Var != null && (m10 = v3Var.f3.m(this.h)) != null && this.z0 < 0.5f && m10.getBottom() > this.a.getPaddingTop();
    }

    public final void D0() {
        d0 d0Var;
        u41 u41Var = this.s0[1];
        if (this.f0 != 1 || u41Var == null || !u41Var.H || (d0Var = this.F0) == null || d0Var.i || d0Var.g || d0Var.k != null || u41Var.f3.N0() < u41Var.g3.E.size() - 3) {
            return;
        }
        this.F0.e();
    }

    public final void E0() {
        k0 k0Var;
        u41 u41Var = this.s0[0];
        if (u41Var == null || !u41Var.H || (k0Var = this.E0) == null || k0Var.h || u41Var.f3.N0() < u41Var.g3.E.size() - 3) {
            return;
        }
        this.E0.h();
    }

    public final CharSequence F0(int i7) {
        CharSequence[] charSequenceArr = this.P0;
        if (charSequenceArr[i7] == null) {
            charSequenceArr[i7] = new SpannableString("l");
            e80 e80Var = new e80(org.telegram.messenger.g0.L(i7 == 0 ? 100.0f : 50.0f), i7 == 0 ? this.u0 : this.v0);
            e80Var.a(org.telegram.ui.ActionBar.j6.r1(0.45f, -1), org.telegram.ui.ActionBar.j6.r1(0.2f, -1));
            CharSequence charSequence = charSequenceArr[i7];
            ((SpannableString) charSequence).setSpan(e80Var, 0, charSequence.length(), 33);
        }
        return charSequenceArr[i7];
    }

    public final void H0(TL_wallet.nftItem nftitem) {
        TL_stars.StarGift starGift = nftitem.gift;
        String str = null;
        if (starGift instanceof TL_stars.TL_starGiftUnique) {
            TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) starGift;
            di.c6 c6Var = new di.c6(getParentActivity(), this.currentAccount, 0L, getResourceProvider(), null);
            c6Var.b3 = nftitem;
            if (this.k0 != null) {
                c6Var.c3 = new g5(this, tL_starGiftUnique, nftitem);
                c6Var.d3 = new h5(this, nftitem);
            }
            c6Var.i2(tL_starGiftUnique.slug, tL_starGiftUnique, null);
            showDialog(c6Var);
            return;
        }
        Activity parentActivity = getParentActivity();
        org.telegram.ui.ActionBar.e6 resourceProvider = getResourceProvider();
        if (parentActivity != null) {
            int i7 = org.telegram.ui.ActionBar.j6.a7;
            int w02 = org.telegram.ui.ActionBar.j6.w0(i7, resourceProvider);
            int i10 = org.telegram.ui.ActionBar.j6.G6;
            org.telegram.ui.ActionBar.j6.w0(i10, resourceProvider);
            w4 w4Var = new w4(1, parentActivity, resourceProvider, false);
            w4Var.b0 = i7;
            w4Var.v0(w02);
            w4Var.P(w02);
            ScrollView scrollView = new ScrollView(parentActivity);
            scrollView.setFillViewport(true);
            scrollView.setVerticalScrollBarEnabled(false);
            LinearLayout linearLayout = new LinearLayout(parentActivity);
            linearLayout.setOrientation(1);
            linearLayout.setGravity(1);
            float f10 = 12.0f;
            linearLayout.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(28.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f));
            scrollView.addView(linearLayout, new FrameLayout.LayoutParams(-1, -2));
            org.telegram.ui.Components.i9 i9Var = new org.telegram.ui.Components.i9(parentActivity);
            i9Var.setRoundRadius(org.telegram.messenger.g0.L(12.0f));
            i9Var.setContentDescription(nftitem.name);
            Drawable mutate = parentActivity.getResources().getDrawable(R.drawable.wallet_nft_placeholder).mutate();
            int i11 = org.telegram.ui.ActionBar.j6.z6;
            org.telegram.ui.ActionBar.q6.x(i9Var, mutate, i11, resourceProvider, PorterDuff.Mode.SRC_IN);
            gc c10 = c.c(nftitem, false);
            if (c10 != null) {
                i9Var.j(c10, "120_120", mutate, nftitem);
            } else {
                i9Var.setImageDrawable(mutate);
            }
            linearLayout.addView(i9Var, c8.ja.r(120, 120, 1));
            TextView textView = new TextView(parentActivity);
            textView.setText(TextUtils.isEmpty(nftitem.name) ? hd.M0(2131743176, null) : nftitem.name);
            org.telegram.messenger.k5.m(textView, i10, resourceProvider, 1, 17.0f);
            int i12 = 17;
            textView.setGravity(17);
            linearLayout.addView(textView, c8.ja.k(12.0f, 16.0f, 12.0f, 0.0f, -1, -2));
            TextView textView2 = new TextView(parentActivity);
            textView2.setText(nftitem.description);
            org.telegram.ui.ActionBar.q6.U(textView2, i11, resourceProvider);
            textView2.setTextSize(1, 14.0f);
            textView2.setGravity(17);
            textView2.setVisibility(TextUtils.isEmpty(nftitem.description) ? 8 : 0);
            linearLayout.addView(textView2, c8.ja.k(12.0f, 4.0f, 12.0f, 0.0f, -1, -2));
            LinearLayout linearLayout2 = new LinearLayout(parentActivity);
            linearLayout2.setOrientation(0);
            linearLayout.addView(linearLayout2, c8.ja.k(0.0f, 20.0f, 0.0f, 16.0f, -1, 54));
            int i13 = 0;
            while (i13 < 2) {
                LinearLayout linearLayout3 = new LinearLayout(parentActivity);
                linearLayout3.setOrientation(1);
                linearLayout3.setGravity(i12);
                int L = org.telegram.messenger.g0.L(16.0f);
                int i14 = org.telegram.ui.ActionBar.j6.d6;
                int w03 = org.telegram.ui.ActionBar.j6.w0(i14, resourceProvider);
                int i15 = org.telegram.ui.ActionBar.j6.i6;
                int w04 = org.telegram.ui.ActionBar.j6.w0(i15, resourceProvider);
                org.telegram.ui.Cells.y k02 = org.telegram.ui.ActionBar.j6.k0(L, L, L, L, w03, w04, w04);
                org.telegram.ui.ActionBar.m6 M = org.telegram.ui.ActionBar.q6.M(i14);
                org.telegram.ui.ActionBar.m6 M2 = org.telegram.ui.ActionBar.q6.M(i15);
                linearLayout3.setBackground(k02);
                org.telegram.ui.ActionBar.q6.j(linearLayout3, k02, M, M2, resourceProvider);
                linearLayout3.setClickable(true);
                linearLayout3.setFocusable(true);
                String M0 = hd.M0(i13 == 0 ? 2131742981 : 2131743023, str);
                linearLayout3.setContentDescription(M0);
                ImageView imageView = new ImageView(parentActivity);
                imageView.setImageResource(i13 == 0 ? R.drawable.wallet_transfer : R.drawable.wallet_sell);
                imageView.setImportantForAccessibility(2);
                int i16 = org.telegram.ui.ActionBar.j6.G6;
                org.telegram.ui.ActionBar.q6.s(imageView, i16, resourceProvider, PorterDuff.Mode.SRC_IN);
                linearLayout3.addView(imageView, c8.ja.o(24, 24));
                TextView textView3 = new TextView(parentActivity);
                textView3.setText(M0);
                float f11 = f10;
                org.telegram.messenger.k5.m(textView3, i16, resourceProvider, 1, f11);
                textView3.setGravity(17);
                linearLayout3.addView(textView3, c8.ja.k(0.0f, 2.0f, 0.0f, 0.0f, -2, -2));
                linearLayout2.addView(linearLayout3, c8.ja.m(1.0f, 0, -1, i13 == 0 ? 0 : 4, i13 == 0 ? 4 : 0, 0));
                i13++;
                f10 = f11;
                i12 = 17;
                str = null;
            }
            ArrayList<TL_wallet.nftAttribute> arrayList = nftitem.attributes;
            if (arrayList != null && !arrayList.isEmpty()) {
                vx0 vx0Var = new vx0(parentActivity, resourceProvider);
                int L2 = org.telegram.messenger.g0.L(10.0f);
                int i17 = org.telegram.ui.ActionBar.j6.d6;
                ShapeDrawable d02 = org.telegram.ui.ActionBar.j6.d0(L2, org.telegram.ui.ActionBar.j6.w0(i17, resourceProvider));
                org.telegram.ui.ActionBar.m6 M3 = org.telegram.ui.ActionBar.q6.M(i17);
                vx0Var.setBackground(d02);
                org.telegram.ui.ActionBar.q6.j(vx0Var, d02, M3, null, resourceProvider);
                ArrayList<TL_wallet.nftAttribute> arrayList2 = nftitem.attributes;
                int size = arrayList2.size();
                int i18 = 0;
                while (i18 < size) {
                    TL_wallet.nftAttribute nftattribute = arrayList2.get(i18);
                    i18++;
                    TL_wallet.nftAttribute nftattribute2 = nftattribute;
                    vx0Var.c(nftattribute2.trait_type, nftattribute2.value, null, null);
                }
                linearLayout.addView(vx0Var, c8.ja.k(0.0f, 0.0f, 0.0f, 14.0f, -1, -2));
            }
            hi.d dVar = new hi.d(parentActivity, resourceProvider, true);
            dVar.setRoundRadius(24);
            dVar.setText(hd.M0(2131743063, null));
            linearLayout.addView(dVar, c8.ja.o(-1, 48));
            w4Var.O = scrollView;
            w4Var.U0 = false;
            linearLayout2.getChildAt(0).setOnClickListener(new a90(26, w4Var, nftitem));
            linearLayout2.getChildAt(1).setOnClickListener(new g3(parentActivity, 1));
            dVar.setOnClickListener(new g3(w4Var, 2));
            w4Var.show();
            w4Var.P(w02);
            org.telegram.messenger.g0.t3(w4Var, w02, false, null);
        }
    }

    public final void L0() {
        if (getParentActivity() == null || this.N0 != null || this.M0 == null) {
            return;
        }
        if (getParentActivity().checkSelfPermission("android.permission.CAMERA") != 0) {
            getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 44);
        } else {
            this.N0 = ci.a0.k(this, this.M0, new ci.x(12), new l4(this, 3), new e4(this, 9));
        }
    }

    public final void M0(boolean z10) {
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
        a1();
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
            N0(f10);
            this.q0.k(false);
        } else {
            this.i0.setVisibility(0);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.m0, f10);
            this.n0 = ofFloat;
            ofFloat.setDuration(250L);
            this.n0.setInterpolator(er.h);
            this.n0.addUpdateListener(new k4(this, 0));
            this.n0.addListener(new org.telegram.ui.ActionBar.t0(this, f10, 7));
            this.n0.start();
        }
        if (this.a == null || this.p0 == O0()) {
            return;
        }
        Y0(false);
    }

    public final void N0(float f10) {
        this.m0 = f10;
        this.i0.setVisibility((f10 > 0.0f || this.n0 != null) ? 0 : 8);
        this.i0.setAlpha(f10);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.i0.getLayoutParams();
        layoutParams.height = Math.round(org.telegram.messenger.g0.L(52.0f) * f10);
        layoutParams.bottomMargin = -Math.round(org.telegram.messenger.g0.L(6.0f) * f10);
        this.i0.setLayoutParams(layoutParams);
    }

    public final boolean O0() {
        k0 k0Var;
        if (this.g0 || (k0Var = this.E0) == null || !k0Var.c.isEmpty()) {
            return false;
        }
        k0 k0Var2 = this.E0;
        k0Var2.getClass();
        return k0Var2.h;
    }

    public final void P0() {
        this.G0 = false;
        u8 u8Var = this.j0;
        if (u8Var != null) {
            u8Var.b(false);
        }
        this.f0 = 0;
        hi.i1 i1Var = this.q0;
        if (i1Var != null) {
            i1Var.setPosition(0);
        }
    }

    public final void Q0() {
        this.s = false;
        bi.v3 v3Var = this.a;
        if (v3Var != null) {
            v3Var.E2.b.remove(this.x);
            this.a.removeCallbacks(this.w);
        }
        m5 m5Var = this.e;
        if (m5Var != null) {
            m5Var.setAdditionalTilt(0.0f);
        }
    }

    public final void S0() {
        l0 x10 = l0.x(this.currentAccount);
        b1();
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
            m5 m5Var = this.e;
            m5Var.getClass();
            g6 g6Var = new g6(m5Var);
            this.w0 = g6Var;
            SpannableString spannableString = this.R0;
            spannableString.setSpan(g6Var, 0, spannableString.length(), 33);
        }
        spannableStringBuilder.append((CharSequence) this.R0);
        spannableStringBuilder.append((CharSequence) " ");
        spannableStringBuilder.append((CharSequence) h6.e(v));
        spannableStringBuilder.append((CharSequence) " ");
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) hd.M0(2131749516, null));
        if (this.x0 == null) {
            p5 p5Var = new p5();
            p5Var.a = -9577217;
            this.x0 = p5Var;
        }
        spannableStringBuilder.setSpan(this.x0, length, spannableStringBuilder.length(), 33);
        this.u0.setText(spannableStringBuilder);
        CharSequence m10 = l0.x(this.currentAccount).m(v, false);
        if (TextUtils.isEmpty(m10)) {
            this.v0.setText(F0(1));
        } else {
            this.v0.setText(m10);
        }
        V0(this.y0);
        d0 d0Var = this.F0;
        if (d0Var != null && !d0Var.h && !d0Var.i && d0Var.k == null) {
            d0Var.e();
        }
        String t6 = x10.t();
        if (TextUtils.isEmpty(t6)) {
            return;
        }
        this.e.setCardNumber(v0(t6.toUpperCase()));
    }

    public final void T0() {
        float[] fArr;
        float[] fArr2;
        Rect rect = this.H;
        if (rect.isEmpty() || !this.E.isAttachedToWindow()) {
            return;
        }
        m5 m5Var = this.e;
        w61 w61Var = this.F;
        Matrix matrix = this.I;
        if (m5Var.g(w61Var, matrix)) {
            float width = rect.width();
            float height = rect.height();
            int i7 = 0;
            while (true) {
                fArr = this.L;
                fArr2 = this.M;
                float f10 = 0.0f;
                if (i7 >= 4) {
                    break;
                }
                float f11 = (i7 == 1 || i7 == 2) ? width : 0.0f;
                if (i7 >= 2) {
                    f10 = height;
                }
                int i10 = i7 * 2;
                fArr[i10] = f11;
                int i11 = i10 + 1;
                fArr[i11] = f10;
                fArr2[i10] = rect.left + f11;
                fArr2[i11] = rect.top + f10;
                i7++;
            }
            matrix.mapPoints(fArr2);
            w61 w61Var2 = this.F;
            int[] iArr = this.P;
            w61Var2.getLocationInWindow(iArr);
            View view = this.E;
            int[] iArr2 = this.O;
            view.getLocationInWindow(iArr2);
            this.e.i(this.y0, this.y.getWidth() / 0.7826087f);
            float f12 = iArr2[0] - iArr[0];
            float x10 = org.telegram.ui.Cells.y0.x(height, 0.7826087f, 0.5f, iArr2[1] - iArr[1]);
            for (int i12 = 0; i12 < 4; i12++) {
                int i13 = i12 * 2;
                float T1 = org.telegram.messenger.g0.T1(fArr2[i13], (fArr[i13] * 0.7826087f) + f12, this.y0);
                float[] fArr3 = this.N;
                fArr3[i13] = T1;
                int i14 = i13 + 1;
                fArr3[i14] = org.telegram.messenger.g0.T1(fArr2[i14], (fArr[i14] * 0.7826087f) + x10, this.y0);
            }
            Matrix matrix2 = this.K;
            boolean polyToPoly = matrix2.setPolyToPoly(this.L, 0, this.N, 0, 4);
            Matrix matrix3 = this.J;
            if (polyToPoly && !matrix3.equals(matrix2)) {
                matrix3.set(matrix2);
                this.F.invalidate();
            }
            m5 m5Var2 = this.e;
            Matrix matrix4 = m5Var2.c;
            Matrix matrix5 = m5Var2.e;
            Matrix matrix6 = m5Var2.d;
            if (matrix.invert(matrix6)) {
                matrix5.setConcat(matrix6, matrix3);
                if (!m5Var2.n || !matrix4.equals(matrix5)) {
                    matrix4.set(matrix5);
                    m5Var2.n = true;
                    m5Var2.O.invalidate();
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
    public final void U0() {
        w61 w61Var;
        ?? r16;
        LinearLayout linearLayout;
        float min;
        float f10;
        if (this.a == null || this.e == null || this.t0 == null || this.E == null || (w61Var = this.F) == null || this.actionBar == null) {
            return;
        }
        w61Var.bringToFront();
        View m10 = this.a.f3.m(this.h);
        float i7 = m10 == null ? this.a.f3.L0() > this.h ? 1.0f : 0.0f : Utilities.i((this.a.getPaddingTop() - m10.getTop()) / m10.getHeight(), 1.0f, 0.0f);
        this.z0 = i7;
        float f11 = this.J0;
        boolean z10 = f11 > 0.0f || this.I0 > 0.0f;
        if (z10) {
            i7 = f11 > 0.0f ? 0.0f : (1.0f - this.I0) * i7;
        }
        this.y0 = i7;
        X0();
        float max = m10 != null ? Math.max(0.0f, (m10.getHeight() / 2.0f) + org.telegram.messenger.g0.L(24.0f)) * this.y0 : 0.0f;
        float T1 = org.telegram.messenger.g0.T1(1.0f, 0.8f, this.y0);
        this.e.setPivotX(r11.getWidth() * 0.5f);
        this.e.setPivotY(0.0f);
        this.e.setScaleX(T1);
        this.e.setScaleY(T1);
        this.e.setAlpha(1.0f - Utilities.l(org.telegram.messenger.g0.z1(i7, 0.75f, 1.0f)));
        this.e.setVisibility((z10 || (m10 != null && i7 < 1.0f && m10.getBottom() > this.a.getPaddingTop() && m10.getTop() < this.a.getHeight() - this.a.getPaddingBottom())) ? 0 : 4);
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
                L = a8.p0.f(0.9f - f13, this.e.getHeight(), 2.0f, L);
            }
            float width = (this.n.getWidth() - this.e.getWidth()) / 2.0f;
            if (!z11) {
                f12 = Math.min(1.0f, f12 * 2.0f);
            }
            if (m10 != null) {
                this.a.getLocationInWindow(iArr2);
                float width2 = ((this.f.getWidth() - this.e.getWidth()) / 2.0f) + this.f.getX() + m10.getX() + (iArr2[0] - iArr[0]);
                float y10 = this.f.getY() + m10.getY() + (iArr2[r16] - iArr[r16]);
                float l10 = Utilities.l(1.0f - ((L - y10) / (this.e.getHeight() * 0.5f)));
                if (l10 >= 1.0f) {
                    org.telegram.messenger.g0.r(this.L0);
                    ValueAnimator valueAnimator = this.K0;
                    if (valueAnimator != null) {
                        this.K0 = null;
                        valueAnimator.cancel();
                    }
                    this.I0 = 0.0f;
                    this.J0 = 0.0f;
                    U0();
                    return;
                }
                width = org.telegram.messenger.g0.T1(width, width2, l10);
                L = org.telegram.messenger.g0.T1(L, y10, l10);
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
        boolean z12 = i7 > 0.0f ? r16 : false;
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
                T0();
            } else {
                m5 m5Var = this.e;
                m5Var.i(0.0f, 0.0f);
                LinearLayout linearLayout2 = m5Var.N;
                org.telegram.messenger.g0.E2(linearLayout2);
                linearLayout2.setScaleX(1.0f);
                linearLayout2.setScaleY(1.0f);
                linearLayout2.setRotationX(0.0f);
                linearLayout2.setRotationY(0.0f);
                linearLayout2.setTranslationX(0.0f);
                linearLayout2.setTranslationY(0.0f);
                f6 f6Var = m5Var.P;
                f6Var.setScaleX(1.0f);
                f6Var.setScaleY(1.0f);
                m5Var.F.addView(linearLayout2, m5Var.Q);
                this.t0.layout(rect.left, rect.top, rect.right, rect.bottom);
                this.e.getClass();
                T0();
            }
            this.F.invalidate();
        }
        V0(i7);
        if (this.G) {
            T0();
        }
        float f14 = 1.0f - i7;
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

    public final void V0(float f10) {
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.j6.G6);
        this.u0.setTextColor(org.telegram.messenger.g0.d2(f10, -1, themedColor));
        org.telegram.ui.Components.h6 h6Var = this.v0;
        float[] fArr = this.e.b0;
        int i7 = -7868417;
        if (fArr != null) {
            i7 = i0.a.f(fArr[8], q7.p(-7868417, 0, fArr), q7.p(-7868417, 3, fArr));
        }
        h6Var.setTextColor(org.telegram.messenger.g0.d2(f10, i7, i0.a.o(themedColor, Math.round(142.8f))));
        g6 g6Var = this.w0;
        if (g6Var != null) {
            g6Var.y = org.telegram.messenger.g0.d2(f10, -1, getThemedColor(org.telegram.ui.ActionBar.j6.Fi));
        }
        p5 p5Var = this.x0;
        if (p5Var != null) {
            float[] fArr2 = this.e.b0;
            int i10 = -9577217;
            if (fArr2 != null) {
                i10 = i0.a.f(fArr2[8], q7.p(-9577217, 0, fArr2), q7.p(-9577217, 3, fArr2));
            }
            p5Var.a = i0.a.o(i10, Math.round((1.0f - f10) * 255.0f));
        }
        this.u0.invalidate();
    }

    public final void W0(float[] fArr) {
        if (this.C0 == null || this.D0 == null) {
            return;
        }
        float f10 = q7.j(getThemedColor(org.telegram.ui.ActionBar.j6.a7))[0];
        boolean z10 = f10 < 0.6f;
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.j6.Fi);
        if (fArr != null && fArr.length >= 18) {
            int[] iArr = new int[2];
            for (int i7 = 0; i7 < 2; i7++) {
                int i10 = i7 * 4;
                float f11 = fArr[i10 + 10];
                iArr[i7] = f11 < 0.0f ? themedColor : q7.n(themedColor, (int) f11, (int) fArr[i10 + 11]);
            }
            themedColor = i0.a.f(fArr[8], iArr[0], iArr[1]);
        }
        float f12 = z10 ? f10 + 0.25f : 0.0f;
        float f13 = z10 ? 1.0f : f10 - 0.2f;
        float[] j3 = q7.j(themedColor);
        float f14 = j3[0];
        if (f14 < f12 || f14 > f13) {
            themedColor = (themedColor & (-16777216)) | (q7.l(Math.max(f12, Math.min(f13, f14)), j3[1], j3[2]) & 16777215);
        }
        if (themedColor == this.O0) {
            return;
        }
        this.O0 = themedColor;
        int themedColor2 = i0.a.h(themedColor) <= 0.550000011920929d ? getThemedColor(org.telegram.ui.ActionBar.j6.Ji) : -16777216;
        hi.d[] dVarArr = {this.C0, this.D0};
        for (int i11 = 0; i11 < 2; i11++) {
            hi.d dVar = dVarArr[i11];
            dVar.setColor(themedColor);
            dVar.setTextColor(themedColor2);
        }
    }

    public final void X0() {
        bi.v3 v3Var = this.a;
        if (v3Var == null || this.e == null) {
            return;
        }
        float b10 = v3Var.E2.b(1);
        this.e.setAdditionalTilt(Math.max(0.0f, (this.y0 * 10.0f) + ((((float) Math.sqrt(Utilities.l(this.y0))) * 90.0f) - 10.0f)) + Math.min(10.0f, this.a.E2.b(3) * 40.0f) + (-Math.min(10.0f, b10 * 40.0f)));
        this.e.setUseGyroscope(1.0f - ((float) Math.pow(this.y0, 0.33000001311302185d)));
    }

    public final void Y0(boolean z10) {
        boolean O0 = O0();
        bi.v3 v3Var = this.a;
        u41[] u41VarArr = this.s0;
        if (v3Var != null && this.p0 != O0) {
            this.p0 = O0;
            v3Var.C0();
            for (u41 u41Var : u41VarArr) {
                if (u41Var != null) {
                    u41Var.C0();
                }
            }
            this.a.g3.O(false);
            this.a.f3.h1(0, 0);
            this.a.post(new e4(this, 12));
        }
        if (O0) {
            return;
        }
        for (u41 u41Var2 : u41VarArr) {
            if (u41Var2 != null) {
                Z0(u41Var2, z10);
            }
        }
        ai.r2 r2Var = this.o0;
        if (r2Var != null) {
            r2Var.post(new e4(this, 6));
            this.o0.post(new e4(this, 7));
        }
    }

    @Override // org.telegram.ui.Components.r41
    public final void Z(ArrayList arrayList, p41 p41Var) {
        l0 x10 = l0.x(this.currentAccount);
        b1();
        arrayList.add(b41.m(this.S));
        this.h = arrayList.size();
        j5 j5Var = this.f;
        b41 b41Var = new b41(-4);
        b41Var.c = j5Var;
        b41Var.z = -1;
        b41Var.e = true;
        arrayList.add(b41Var);
        arrayList.add(b41.m(this.A0));
        boolean O0 = O0();
        this.p0 = O0;
        if (O0) {
            String M0 = hd.M0(2131743019, null);
            String M02 = hd.M0(2131743018, null);
            int i7 = q5.b;
            b41 K = b41.K(q5.class);
            K.k = R.drawable.wallet_learn_instant;
            K.l = M0;
            K.m = M02;
            arrayList.add(K);
            String M03 = hd.M0(2131743068, null);
            String M04 = hd.M0(2131743067, null);
            b41 K2 = b41.K(q5.class);
            K2.k = R.drawable.wallet_learn_fees;
            K2.l = M03;
            K2.m = M04;
            arrayList.add(K2);
            String M05 = hd.M0(2131743182, null);
            String M06 = hd.M0(2131743181, null);
            b41 K3 = b41.K(q5.class);
            K3.k = R.drawable.wallet_learn_verified;
            K3.l = M05;
            K3.m = M06;
            arrayList.add(K3);
            arrayList.add(b41.m(this.b0));
        } else if (this.o0 != null) {
            if (this.S0 && !this.T0 && x10.v() > 500000000) {
                arrayList.add(b41.k(this.d0));
            }
            ai.r2 r2Var = this.o0;
            b41 b41Var2 = new b41(-3);
            b41Var2.c = r2Var;
            b41Var2.z = 0;
            b41Var2.y = 1;
            arrayList.add(b41Var2);
        }
        z70 z70Var = this.a0;
        if (z70Var != null) {
            this.c0 = false;
            z70Var.animate().cancel();
            this.a0.setAlpha(0.0f);
            this.a0.setVisibility(4);
        }
    }

    @Override // org.telegram.ui.Components.r41
    public final CharSequence a0() {
        return hd.M0(2131743003, null);
    }

    public final void a1() {
        u8 u8Var = this.j0;
        if (u8Var == null || this.q0 == null || u8Var.x == 0.0f) {
            return;
        }
        u8Var.x = 0.0f;
        u8Var.c.setVisibility(8);
        u8Var.invalidate();
    }

    @Override // org.telegram.ui.Components.r41
    public final void b0(b41 b41Var, View view) {
        d0 d0Var;
        Object obj = b41Var.G;
        if (obj instanceof TL_wallet.nftItem) {
            H0((TL_wallet.nftItem) obj);
            return;
        }
        if (b41Var.d == -10001 && (d0Var = this.F0) != null) {
            d0Var.e();
        } else if (obj instanceof TL_wallet.walletTransaction) {
            G0(getParentActivity(), this.currentAccount, (TL_wallet.walletTransaction) b41Var.G, null, null, null, null, getResourceProvider());
        }
    }

    public final void b1() {
        if (this.T == null) {
            return;
        }
        l0 x10 = l0.x(this.currentAccount);
        boolean z10 = this.T.isAttachedToWindow() && this.T.isLaidOut();
        i5 i5Var = this.T;
        FrameLayout frameLayout = this.U;
        Boolean bool = x10.i;
        i5Var.i(frameLayout, (bool == null || !bool.booleanValue() || TextUtils.isEmpty(x10.j)) ? false : true, z10);
        ArrayList arrayList = x10.G;
        int size = arrayList.size();
        int i7 = 0;
        long j3 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            h0 h0Var = (h0) obj;
            if (!h0Var.e) {
                long j10 = h0Var.c;
                if (j10 >= 0) {
                    j3 += j10;
                }
            }
        }
        boolean z11 = j3 > 500000000;
        if (z11) {
            this.X.setText(x0(2131743062, j3));
        }
        this.T.i(this.W, z11, z10);
        long j11 = di.u8.y(this.currentAccount, true).p().amount;
        boolean z12 = j11 > 500000000;
        if (z12) {
            this.Z.setText(x0(2131743100, j11));
        }
        this.T.i(this.Y, z12, z10);
    }

    @Override // org.telegram.ui.Components.r41
    public final boolean c0(b41 b41Var, View view) {
        c8 c8Var;
        if (!(view instanceof p7) || (c8Var = this.k0) == null) {
            return false;
        }
        c8Var.S((p7) view);
        return true;
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final boolean canBeginSlide() {
        c8 c8Var = this.k0;
        return (c8Var == null || !c8Var.q0) && super.canBeginSlide();
    }

    @Override // org.telegram.ui.Components.r41, org.telegram.ui.ActionBar.e2
    public final View createView(Context context) {
        ValueAnimator valueAnimator = this.n0;
        if (valueAnimator != null) {
            this.n0 = null;
            valueAnimator.cancel();
        }
        Q0();
        u5 u5Var = this.r0;
        if (u5Var != null) {
            u5Var.b(null);
        }
        this.f = null;
        this.T = null;
        this.S = null;
        this.o0 = null;
        this.q0 = null;
        u41[] u41VarArr = this.s0;
        final int i7 = 0;
        u41VarArr[0] = null;
        final int i10 = 1;
        u41VarArr[1] = null;
        d0 d0Var = this.F0;
        boolean z10 = (d0Var == null || d0Var.a.isEmpty()) ? false : true;
        this.g0 = z10;
        if (!z10) {
            this.f0 = 0;
        } else if (this.G0) {
            this.f0 = 1;
        }
        c8 c8Var = this.k0;
        if (c8Var != null) {
            c8Var.p();
        }
        this.k0 = null;
        View createView = super.createView(context);
        oa0 oa0Var = new oa0(this, context);
        oa0Var.addView(createView, c8.ja.c(-1.0f, -1));
        this.fragmentView = oa0Var;
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i11 = org.telegram.ui.ActionBar.j6.a7;
        org.telegram.ui.ActionBar.q6.h(i11, kVar, getResourceProvider());
        this.actionBar.setCastShadows(false);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setClipChildren(false);
        this.actionBar.setClipToPadding(false);
        org.telegram.ui.ActionBar.y s5 = this.actionBar.s();
        org.telegram.ui.ActionBar.q0 a10 = s5.a(2, R.drawable.scan_qr);
        this.M0 = a10;
        final int i12 = 3;
        a10.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Wallet.g4
            public final /* synthetic */ y5 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        y5 y5Var = this.b;
                        y5Var.getClass();
                        y5Var.presentFragment(new xa1(6, null));
                        break;
                    case 1:
                        y5.f0(this.b);
                        break;
                    case 2:
                        y5.i0(this.b);
                        break;
                    case 3:
                        this.b.L0();
                        break;
                    default:
                        y5.d0(this.b);
                        break;
                }
            }
        });
        s5.a(1, R.drawable.ic_ab_other).setOnClickListener(new a90(28, this, context));
        m01 m01Var = new m01(i12, context, this);
        this.S = m01Var;
        m01Var.setClipToPadding(false);
        this.S.setClipChildren(false);
        this.S.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(4.0f));
        i5 i5Var = new i5(this, context);
        this.T = i5Var;
        i5Var.setDefaultRadiusDp(22);
        this.T.setOnAnimatedHeightChangedListener(new e4(this, i7));
        TextView textView = new TextView(context);
        this.V = textView;
        textView.setText(hd.M0(2131742962, null));
        this.U = u0(this.V, new e4(this, i10));
        TextView textView2 = new TextView(context);
        this.X = textView2;
        this.W = u0(textView2, new e4(this, 2));
        TextView textView3 = new TextView(context);
        this.Z = textView3;
        this.Y = u0(textView3, new e4(this, i12));
        this.S.addView(this.T, c8.ja.c(-2.0f, -1));
        z70 z70Var = new z70(context, null);
        this.a0 = z70Var;
        this.c0 = false;
        z70Var.setAlpha(0.0f);
        z70 z70Var2 = this.a0;
        int i13 = org.telegram.ui.ActionBar.j6.z6;
        org.telegram.ui.ActionBar.q6.U(z70Var2, i13, this.resourceProvider);
        this.a0.setTextSize(1, 13.0f);
        this.a0.setGravity(17);
        this.a0.setText(R0(hd.M0(2131743006, null), org.telegram.ui.ActionBar.j6.Xc, this.resourceProvider, new f4(context, i7)));
        final int i14 = 4;
        this.a0.setVisibility(4);
        FrameLayout frameLayout = (FrameLayout) createView;
        if (frameLayout != null) {
            frameLayout.addView(this.a0, c8.ja.d(-1, -2.0f, 81, 12.0f, 0.0f, 12.0f, 24.0f));
        }
        j5 j5Var = new j5(this, context, i7);
        this.b0 = j5Var;
        j5Var.setImportantForAccessibility(2);
        this.d0 = new FrameLayout(context);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.e0 = frameLayout2;
        int i15 = org.telegram.ui.ActionBar.j6.d6;
        int themedColor = getThemedColor(i15);
        int themedColor2 = getThemedColor(i15);
        int i16 = org.telegram.ui.ActionBar.j6.i6;
        org.telegram.ui.Cells.y b02 = org.telegram.ui.ActionBar.j6.b0(themedColor, org.telegram.ui.ActionBar.j6.w(themedColor2, getThemedColor(i16)), 16, 16);
        org.telegram.ui.ActionBar.m6 M = org.telegram.ui.ActionBar.q6.M(i15);
        org.telegram.ui.ActionBar.m6 p10 = org.telegram.ui.ActionBar.q6.p(i15, i16);
        org.telegram.ui.ActionBar.e6 resourceProvider = getResourceProvider();
        frameLayout2.setBackground(b02);
        org.telegram.ui.ActionBar.q6.j(frameLayout2, b02, M, p10, resourceProvider);
        this.d0.addView(this.e0, c8.ja.d(-1, -2.0f, 55, 12.0f, 0.0f, 12.0f, 12.0f));
        ImageView imageView = new ImageView(context);
        float N = org.telegram.messenger.g0.N(10.0f);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{N, N, N, N, N, N, N, N}, null, null));
        shapeDrawable.setShaderFactory(new k5());
        imageView.setBackground(shapeDrawable);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.wallet_protect);
        this.e0.addView(imageView, c8.ja.d(28, 28.0f, 19, 14.0f, 11.0f, 16.0f, 11.0f));
        TextView textView4 = new TextView(context);
        org.telegram.ui.ActionBar.q6.U(textView4, org.telegram.ui.ActionBar.j6.q7, this.resourceProvider);
        i5.c.w(textView4, 1, 16.0f, null, 2131743044);
        this.e0.addView(textView4, c8.ja.d(-1, -2.0f, 19, 58.0f, 0.0f, 32.0f, 0.0f));
        this.e0.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Wallet.g4
            public final /* synthetic */ y5 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i7) {
                    case 0:
                        y5 y5Var = this.b;
                        y5Var.getClass();
                        y5Var.presentFragment(new xa1(6, null));
                        break;
                    case 1:
                        y5.f0(this.b);
                        break;
                    case 2:
                        y5.i0(this.b);
                        break;
                    case 3:
                        this.b.L0();
                        break;
                    default:
                        y5.d0(this.b);
                        break;
                }
            }
        });
        c8.na.b(this.e0, 0.02f, 1.2f);
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.y = frameLayout3;
        frameLayout3.setClipChildren(false);
        this.y.setClipToPadding(false);
        this.actionBar.addView(this.y, c8.ja.d(-1, 56.0f, 87, 64.0f, 0.0f, 96.0f, 0.0f));
        View view = new View(context);
        this.E = view;
        this.y.addView(view, c8.ja.e(1, 1, 19));
        this.G = false;
        this.H.setEmpty();
        this.J.reset();
        w61 w61Var = new w61(this, context);
        this.F = w61Var;
        w61Var.setClipChildren(false);
        this.F.setClipToPadding(false);
        m5 m5Var = new m5(this, context);
        this.e = m5Var;
        m5Var.setDiamondOnCard(true);
        this.e.setCardOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Wallet.g4
            public final /* synthetic */ y5 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i10) {
                    case 0:
                        y5 y5Var = this.b;
                        y5Var.getClass();
                        y5Var.presentFragment(new xa1(6, null));
                        break;
                    case 1:
                        y5.f0(this.b);
                        break;
                    case 2:
                        y5.i0(this.b);
                        break;
                    case 3:
                        this.b.L0();
                        break;
                    default:
                        y5.d0(this.b);
                        break;
                }
            }
        });
        this.a.E2.b.add(this.x);
        j5 j5Var2 = new j5(this, context, i10);
        this.f = j5Var2;
        j5Var2.setImportantForAccessibility(2);
        n5 n5Var = new n5(this, context);
        this.n = n5Var;
        n5Var.setClipChildren(false);
        this.n.setClipToPadding(false);
        this.n.addView(this.e, c8.ja.c(-2.0f, -1));
        oa0Var.addView(this.n, c8.ja.c(-1.0f, -1));
        this.a.setClipChildren(false);
        this.a.setClipToPadding(false);
        this.t0 = this.e.getBalanceLayout();
        this.u0 = this.e.getBalanceView();
        this.v0 = this.e.getUsdBalanceView();
        this.e.setCardHolder(q10.p(getUserConfig().f()).toUpperCase());
        this.B0 = 0.0f;
        z51 z51Var = new z51(25, context, this);
        this.A0 = z51Var;
        z51Var.setOrientation(0);
        this.A0.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(12.0f));
        hi.d dVar = new hi.d(context, this.resourceProvider, true);
        dVar.setRoundRadius(24);
        this.C0 = dVar;
        dVar.setText(hd.M0(2131743204, null));
        this.A0.addView(this.C0, c8.ja.m(1.0f, 0, 48, 0, 4, 0));
        final int i17 = 2;
        this.C0.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Wallet.g4
            public final /* synthetic */ y5 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i17) {
                    case 0:
                        y5 y5Var = this.b;
                        y5Var.getClass();
                        y5Var.presentFragment(new xa1(6, null));
                        break;
                    case 1:
                        y5.f0(this.b);
                        break;
                    case 2:
                        y5.i0(this.b);
                        break;
                    case 3:
                        this.b.L0();
                        break;
                    default:
                        y5.d0(this.b);
                        break;
                }
            }
        });
        hi.d dVar2 = new hi.d(context, this.resourceProvider, true);
        dVar2.setRoundRadius(24);
        this.D0 = dVar2;
        dVar2.setText(hd.M0(2131743022, null));
        this.D0.setEnabled(l0.x(this.currentAccount).e());
        this.D0.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Wallet.g4
            public final /* synthetic */ y5 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i14) {
                    case 0:
                        y5 y5Var = this.b;
                        y5Var.getClass();
                        y5Var.presentFragment(new xa1(6, null));
                        break;
                    case 1:
                        y5.f0(this.b);
                        break;
                    case 2:
                        y5.i0(this.b);
                        break;
                    case 3:
                        this.b.L0();
                        break;
                    default:
                        y5.d0(this.b);
                        break;
                }
            }
        });
        this.A0.addView(this.D0, c8.ja.m(1.0f, 0, 48, 4, 0, 0));
        W0(this.e.getStickerStyle());
        this.E0 = l0.x(this.currentAccount).B();
        this.a.setDescendantFocusability(131072);
        c8 c8Var2 = new c8(this, this.e, new k8.a(20, this, oa0Var), null);
        this.k0 = c8Var2;
        oa0Var.addView(c8Var2, c8.ja.c(-1.0f, -1));
        this.l0 = "";
        int i18 = 9;
        ai.r2 r2Var = new ai.r2(context, i18);
        this.o0 = r2Var;
        r2Var.setOrientation(1);
        org.telegram.ui.ActionBar.q6.h(i11, this.o0, getResourceProvider());
        hi.i1 i1Var = new hi.i1(this, context, this.resourceProvider, i18);
        this.q0 = i1Var;
        i1Var.setAllowDisallowInterceptTouch(false);
        this.q0.setAdapter(new di.f4(i18, context, this));
        v61 i19 = this.q0.i(-2, true);
        this.h0 = i19;
        i19.g(i13, org.telegram.ui.ActionBar.j6.G6, i13, i16, i15);
        org.telegram.ui.ActionBar.q6.B(this.h0, org.telegram.ui.ActionBar.j6.d0(org.telegram.messenger.g0.L(20.0f), getThemedColor(i15)), org.telegram.ui.ActionBar.q6.M(i15), getResourceProvider());
        this.i0 = new FrameLayout(context);
        u8 u8Var = new u8(context, this.h0, this.resourceProvider, new l4(this, i7), new l4(this, i10), new l4(this, 2));
        this.j0 = u8Var;
        this.i0.addView(u8Var, c8.ja.d(-1, 40.0f, 48, 16.0f, 0.0f, 16.0f, 0.0f));
        this.q0.setPosition(this.f0);
        a1();
        this.o0.addView(this.i0, c8.ja.k(0.0f, 0.0f, 0.0f, -6.0f, -1, 52));
        this.o0.addView(this.q0, c8.ja.l(1.0f, -1, 0));
        M0(this.g0);
        d0 d0Var2 = this.F0;
        if (d0Var2 != null) {
            this.k0.Y(d0Var2);
        }
        this.a.j(new ri(this, 23));
        p41 p41Var = this.a.g3;
        p41Var.r = false;
        p41Var.O(false);
        u5 u5Var2 = new u5(this);
        this.r0 = u5Var2;
        u5Var2.b(this.a);
        S0();
        this.E0.h();
        this.actionBar.post(new e4(this, 10));
        this.a.post(new e4(this, 12));
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.is
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        bi.v3 v3Var;
        p41 p41Var;
        if (i10 != this.currentAccount) {
            return;
        }
        if (i7 == ns.a4 && this.u0 != null) {
            S0();
            Iterator it = this.Q0.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
            return;
        }
        if (i7 == ns.y3) {
            b1();
            return;
        }
        if (i7 == ns.q0) {
            if (objArr.length > 0) {
                Object obj = objArr[0];
                if (obj instanceof TL_account.Password) {
                    this.S0 = true;
                    this.T0 = ((TL_account.Password) obj).has_password;
                    bi.v3 v3Var2 = this.a;
                    if (v3Var2 == null || (p41Var = v3Var2.g3) == null) {
                        return;
                    }
                    p41Var.O(true);
                    return;
                }
            }
            getConnectionsManager().sendRequestTyped(new TL_account.getPassword(), new d3.b(1), new d(this, 7));
            return;
        }
        if (i7 != ns.b4 || objArr.length <= 0) {
            return;
        }
        Object obj2 = objArr[0];
        k0 k0Var = this.E0;
        if (obj2 != k0Var || (v3Var = this.a) == null || v3Var.g3 == null) {
            return;
        }
        if (k0Var.b.isEmpty()) {
            k0 k0Var2 = this.E0;
            if (!k0Var2.h) {
                k0Var2.h();
            }
        }
        Y0(true);
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final boolean onBackPressed(boolean z10) {
        ci.a0 a0Var = this.N0;
        if (a0Var != null) {
            if (z10) {
                a0Var.e();
            }
            return false;
        }
        u8 u8Var = this.j0;
        if (u8Var == null || !u8Var.y) {
            return super.onBackPressed(z10);
        }
        if (z10) {
            u8Var.b(false);
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final void onBeginSlide() {
        u5 u5Var = this.r0;
        if (u5Var != null) {
            u5Var.c();
        }
        bi.v3 v3Var = this.a;
        if (v3Var != null) {
            v3Var.C0();
        }
        u41 y02 = y0();
        if (y02 != null) {
            y02.C0();
        }
        super.onBeginSlide();
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final boolean onFragmentCreate() {
        Context context = org.telegram.messenger.t0.b;
        if (z5.k0.compareAndSet(false, true)) {
            z5.l0.postRunnable(new f4(context, 2));
        }
        getNotificationCenter().c(this, ns.a4);
        getNotificationCenter().c(this, ns.y3);
        getNotificationCenter().c(this, ns.b4);
        getNotificationCenter().c(this, ns.q0);
        l0 x10 = l0.x(this.currentAccount);
        if (x10.o == null) {
            x10.o = new d0(x10);
        }
        d0 d0Var = x10.o;
        this.F0 = d0Var;
        e4 e4Var = this.H0;
        ArrayList arrayList = d0Var.d;
        if (!arrayList.contains(e4Var)) {
            arrayList.add(e4Var);
        }
        nb1 nb1Var = this.U0;
        if (nb1Var != null) {
            nb1Var.run();
        }
        int i7 = x10.D;
        x10.D = i7 + 1;
        HashSet hashSet = x10.E;
        boolean isEmpty = hashSet.isEmpty();
        hashSet.add(Integer.valueOf(i7));
        if (isEmpty) {
            x10.S();
        }
        int i10 = 1;
        this.U0 = new nb1(x10, i7, i10);
        getConnectionsManager().sendRequestTyped(new TL_account.getPassword(), new d3.b(i10), new d(this, 7));
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final void onFragmentDestroy() {
        ci.a0 a0Var = this.N0;
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
        c8 c8Var = this.k0;
        if (c8Var != null) {
            c8Var.p();
        }
        m5 m5Var = this.e;
        if (m5Var != null) {
            m5Var.setOnFrontContentPresented(null);
        }
        ValueAnimator valueAnimator2 = this.n0;
        if (valueAnimator2 != null) {
            this.n0 = null;
            valueAnimator2.cancel();
        }
        d0 d0Var = this.F0;
        if (d0Var != null) {
            d0Var.d.remove(this.H0);
        }
        Q0();
        u5 u5Var = this.r0;
        if (u5Var != null) {
            u5Var.b(null);
        }
        getNotificationCenter().n(this, ns.a4);
        getNotificationCenter().n(this, ns.y3);
        getNotificationCenter().n(this, ns.b4);
        getNotificationCenter().n(this, ns.q0);
        org.telegram.messenger.g0.E2(this.F);
        k0 k0Var = this.E0;
        if (k0Var != null) {
            k0Var.a();
        }
        super.onFragmentDestroy();
        nb1 nb1Var = this.U0;
        if (nb1Var != null) {
            nb1Var.run();
            this.U0 = null;
        }
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final void onInsets(int i7, int i10, int i11, int i12) {
        this.a.setPadding(0, 0, 0, i12);
        this.a.setClipToPadding(false);
        z70 z70Var = this.a0;
        if (z70Var != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) z70Var.getLayoutParams();
            layoutParams.bottomMargin = org.telegram.messenger.g0.L(24.0f) + i12;
            this.a0.setLayoutParams(layoutParams);
        }
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final void onPause() {
        super.onPause();
        ci.a0 a0Var = this.N0;
        if (a0Var != null) {
            a0Var.g();
            org.telegram.messenger.g0.E2(this.N0);
            this.N0 = null;
        }
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final void onRequestPermissionsResultFragment(int i7, String[] strArr, int[] iArr) {
        if (i7 != 44 || getParentActivity() == null) {
            return;
        }
        if (iArr.length > 0 && iArr[0] == 0) {
            L0();
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        alertDialog$Builder.a.U = org.telegram.messenger.g0.X2(hd.M0(2131746503, null));
        alertDialog$Builder.k(hd.M0(2131747300, null), new h4(this));
        alertDialog$Builder.h(hd.M0(2131751772, null), null);
        int i10 = org.telegram.ui.ActionBar.j6.L5;
        alertDialog$Builder.m(R.raw.permission_request_camera, 72, org.telegram.ui.ActionBar.j6.x0(null, i10, false), null);
        alertDialog$Builder.n(i10, null);
        alertDialog$Builder.p();
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final void onResume() {
        super.onResume();
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar != null) {
            kVar.post(new e4(this, 10));
        }
        l0.x(this.currentAccount).E();
        if (this.F0 != null && l0.x(this.currentAccount).G()) {
            d0 d0Var = this.F0;
            if (!d0Var.j) {
                d0Var.b();
                d0Var.f(true);
            }
        }
        S0();
        if (this.a != null) {
            Y0(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final void onThemeColorsChanged() {
        super.onThemeColorsChanged();
        try {
            if (this.u0 != null && this.v0 != null && this.e != null) {
                V0(this.y0);
            }
            m5 m5Var = this.e;
            if (m5Var != null && this.C0 != null && this.D0 != null) {
                W0(m5Var.getStickerStyle());
            }
            z70 z70Var = this.a0;
            if (z70Var != null) {
                z70Var.invalidate();
            }
            TextView textView = this.X;
            if (textView != null) {
                textView.invalidate();
            }
            TextView textView2 = this.Z;
            if (textView2 != null) {
                textView2.invalidate();
            }
            i5 i5Var = this.T;
            if (i5Var != null) {
                i5Var.invalidate();
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
        U0();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.I0, f10);
        this.K0 = ofFloat;
        ofFloat.setDuration(z10 ? 260L : 120L);
        this.K0.setInterpolator(z10 ? new er(0.05d, 0.7d, 0.1d, 1.0d) : new er(0.4d, 0.0d, 0.2d, 1.0d));
        this.K0.addUpdateListener(new k4(this, 1));
        this.K0.addListener(new g71(this, 7));
        this.K0.start();
    }

    public final FrameLayout u0(TextView textView, Runnable runnable) {
        Context context = textView.getContext();
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(14.0f));
        int i7 = org.telegram.ui.ActionBar.j6.i6;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.j6.h0(getThemedColor(i7), 2, -1);
        org.telegram.ui.ActionBar.m6 M = org.telegram.ui.ActionBar.q6.M(i7);
        org.telegram.ui.ActionBar.e6 resourceProvider = getResourceProvider();
        frameLayout.setBackground(h02);
        org.telegram.ui.ActionBar.q6.j(frameLayout, h02, null, M, resourceProvider);
        org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.G6, getResourceProvider());
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setGravity(19);
        frameLayout.addView(textView, c8.ja.d(-1, -2.0f, 3, 0.0f, 0.0f, 42.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(R.drawable.attach_arrow_right);
        org.telegram.ui.ActionBar.q6.s(imageView, org.telegram.ui.ActionBar.j6.z6, getResourceProvider(), PorterDuff.Mode.SRC_IN);
        frameLayout.addView(imageView, c8.ja.e(-2, -2, 21));
        frameLayout.setOnClickListener(new g3(runnable, 3));
        textView.setDuplicateParentStateEnabled(true);
        c8.na.b(textView, 0.02f, 1.2f);
        this.T.addView(frameLayout, c8.ja.o(-1, -2));
        return frameLayout;
    }

    public final CharSequence x0(int i7, long j3) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((char) 65532);
        eq eqVar = new eq(R.drawable.mini_gram_16, 0);
        eqVar.d = false;
        spannableStringBuilder.setSpan(eqVar, length, spannableStringBuilder.length(), 33);
        spannableStringBuilder.append((CharSequence) " ");
        int length2 = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) l0.o(j3, false));
        spannableStringBuilder.setSpan(new b00(org.telegram.ui.ActionBar.j6.Fi, getResourceProvider()), length2, spannableStringBuilder.length(), 33);
        return hd.V(null, null, i7, spannableStringBuilder);
    }

    public final u41 y0() {
        if (z0()) {
            hi.i1 i1Var = this.q0;
            View currentView = i1Var == null ? null : i1Var.getCurrentView();
            if (currentView instanceof u41) {
                return (u41) currentView;
            }
        }
        return null;
    }

    public final boolean z0() {
        ai.r2 r2Var;
        if (this.p0 || (r2Var = this.o0) == null || !r2Var.isAttachedToWindow()) {
            return false;
        }
        ViewParent parent = this.o0.getParent();
        bi.v3 v3Var = this.a;
        return parent == v3Var.f3.m(v3Var.g3.E.size() - 1);
    }
}
