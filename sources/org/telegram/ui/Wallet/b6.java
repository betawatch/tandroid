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
import org.telegram.messenger.cd;
import org.telegram.messenger.ce;
import org.telegram.messenger.h20;
import org.telegram.messenger.ic;
import org.telegram.messenger.j20;
import org.telegram.messenger.l20;
import org.telegram.messenger.us;
import org.telegram.messenger.vp;
import org.telegram.messenger.z20;
import org.telegram.messenger.zs;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.a51;
import org.telegram.ui.Components.bu0;
import org.telegram.ui.Components.dq;
import org.telegram.ui.Components.ew;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.ii;
import org.telegram.ui.Components.l00;
import org.telegram.ui.Components.p51;
import org.telegram.ui.Components.p80;
import org.telegram.ui.Components.qq;
import org.telegram.ui.Components.r51;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.u80;
import org.telegram.ui.Components.v71;
import org.telegram.ui.Components.w71;
import org.telegram.ui.Components.wy0;
import org.telegram.ui.Components.xs;
import org.telegram.ui.Components.yz0;
import org.telegram.ui.Components.z60;
import org.telegram.ui.Components.zz;
import org.telegram.ui.Components.zz0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PasscodeActivity;
import org.telegram.ui.f11;
import org.telegram.ui.hk;
import org.telegram.ui.ns0;
import org.telegram.ui.rr0;
import org.telegram.ui.rv0;
import org.telegram.ui.tc1;
import org.telegram.ui.u71;
import org.telegram.ui.ua0;
import org.telegram.ui.vf;
import org.telegram.ui.wb0;
import org.telegram.ui.wt;
import org.telegram.ui.ya;
import org.telegram.ui.zh;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class b6 extends r51 implements us {
    public static Typeface U0;
    public float A0;
    public vh.d B0;
    public vh.d C0;
    public View D;
    public j0 D0;
    public fg.i E;
    public c0 E0;
    public boolean F;
    public boolean F0;
    public float H0;
    public float I0;
    public ValueAnimator J0;
    public org.telegram.ui.ActionBar.t0 L0;
    public qh.y M0;
    public int N0;
    public SpannableString Q0;
    public org.telegram.ui.Components.voip.i0 R;
    public boolean R0;
    public k5 S;
    public boolean S0;
    public FrameLayout T;
    public qq T0;
    public TextView U;
    public FrameLayout V;
    public TextView W;
    public FrameLayout X;
    public TextView Y;
    public p80 Z;
    public l5 a0;
    public boolean b0;
    public FrameLayout c0;
    public FrameLayout d0;
    public o5 e;
    public l5 f;
    public boolean f0;
    public v71 g0;
    public int h;
    public FrameLayout h0;
    public y8 i0;
    public h8 j0;
    public float l0;
    public ValueAnimator m0;
    public p5 n;
    public jg.z2 n0;
    public boolean o0;
    public hk p0;
    public x5 q0;
    public int r;
    public boolean s;
    public LinearLayout s0;
    public org.telegram.ui.Components.f6 t0;
    public org.telegram.ui.Components.f6 u0;
    public k6 v0;
    public r5 w0;
    public float x0;
    public FrameLayout y;
    public float y0;
    public u71 z0;
    public final ew w = new ew(this, 18);
    public final j4 x = new xs() { // from class: org.telegram.ui.Wallet.j4
        @Override // org.telegram.ui.Components.xs
        public final void a(int i10, boolean z10) {
            ii iiVar;
            b6 b6Var = b6.this;
            ew ewVar = b6Var.w;
            if ((i10 == 1 || i10 == 3) && (iiVar = b6Var.a) != null) {
                b6Var.s = z10;
                iiVar.removeCallbacks(ewVar);
                ewVar.run();
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
    public final u51[] r0 = new u51[2];
    public final f4 G0 = new f4(this, 3);
    public final f4 K0 = new f4(this, 4);
    public final CharSequence[] O0 = new CharSequence[2];
    public final HashSet P0 = new HashSet();

    public static boolean A0(String str) {
        if (str != null) {
            return "t.me".equalsIgnoreCase(str) || "telegram.me".equalsIgnoreCase(str) || "telegram.dog".equalsIgnoreCase(str);
        }
        return false;
    }

    public static boolean B0(Uri uri) {
        String scheme = uri.getScheme();
        if (!"ton".equalsIgnoreCase(scheme) && !"tc".equalsIgnoreCase(scheme)) {
            if (("https".equalsIgnoreCase(scheme) || "http".equalsIgnoreCase(scheme)) && A0(uri.getHost())) {
                List<String> pathSegments = uri.getPathSegments();
                if (pathSegments.size() != 1 || (!"sendgrams".equalsIgnoreCase(pathSegments.get(0)) && b1(uri) == null)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v3, types: [org.telegram.ui.Components.w71, org.telegram.ui.Wallet.z4] */
    public static void F0(Context context, int i10, TL_wallet.walletTransaction wallettransaction, l20 l20Var, j20 j20Var, byte[] bArr, org.telegram.ui.Cells.m0 m0Var, org.telegram.ui.ActionBar.p6 p6Var) {
        z2[] z2VarArr;
        View[] viewArr;
        j20 j20Var2;
        LinearLayout s02;
        TL_wallet.nftItem nftitem;
        if (context == null) {
            return;
        }
        if ((wallettransaction.peer instanceof TL_wallet.walletTransactionPeerTelegramGift) && (nftitem = wallettransaction.nft) != null) {
            TL_stars.StarGift starGift = nftitem.gift;
            if (starGift instanceof TL_stars.TL_starGiftUnique) {
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) starGift;
                rh.e4 e4Var = new rh.e4(context, i10, 0L, p6Var, null);
                e4Var.a3 = wallettransaction;
                e4Var.h2(tL_starGiftUnique.slug, tL_starGiftUnique, null);
                e4Var.show();
                return;
            }
        }
        z2[] z2VarArr2 = new z2[1];
        View[] viewArr2 = new View[1];
        j0 B = k0.x(i10).B();
        ArrayList arrayList = new ArrayList(B.c);
        int i11 = 0;
        while (true) {
            if (i11 >= arrayList.size()) {
                i11 = -1;
                break;
            } else if (arrayList.get(i11) == wallettransaction || k0.i0(wallettransaction, (TL_wallet.walletTransaction) arrayList.get(i11))) {
                break;
            } else {
                i11++;
            }
        }
        if (l20Var == null && m0Var == null && i11 >= 0) {
            Rect rect = new Rect();
            context.getResources().getDrawable(R.drawable.sheet_shadow_round).getPadding(rect);
            viewArr = viewArr2;
            ?? z4Var = new z4(context, p6Var, arrayList, B, i10, rect, viewArr);
            z4Var.setPosition(i11);
            z2VarArr = z2VarArr2;
            z4Var.setAdapter(new a5(arrayList, context, p6Var, rect, i10, z2VarArr2));
            j20Var2 = j20Var;
            s02 = z4Var;
        } else {
            z2VarArr = z2VarArr2;
            viewArr = viewArr2;
            j20Var2 = j20Var;
            s02 = s0(context, i10, wallettransaction, l20Var, j20Var, bArr, m0Var, p6Var, z2VarArr, false);
        }
        z2[] z2VarArr3 = z2VarArr;
        c5 c5Var = new c5(context, s02, p6Var, s02, viewArr, context);
        z2VarArr3[0] = c5Var;
        if ((s02 instanceof w71) && j20Var2 != null) {
            c5Var.o(new k3(2, j20Var2, wallettransaction));
        }
        z2VarArr3[0].A0(l20Var != null);
        z2 z2Var = z2VarArr3[0];
        z2Var.T0 = false;
        z2Var.show();
    }

    public static void H0(Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        int i10 = 1;
        org.telegram.ui.ActionBar.z2 k10 = org.telegram.messenger.m5.k(1, context, p6Var, false);
        FrameLayout frameLayout = new FrameLayout(context);
        int L = org.telegram.messenger.i0.L(16.0f);
        int i11 = org.telegram.ui.ActionBar.t6.h5;
        Drawable d02 = org.telegram.ui.ActionBar.t6.d0(L, org.telegram.ui.ActionBar.t6.w0(i11, p6Var));
        org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i11);
        frameLayout.setBackground(d02);
        org.telegram.ui.ActionBar.a7.k(frameLayout, d02, N, null, p6Var);
        frameLayout.setPadding(org.telegram.messenger.i0.L(36.0f), 0, org.telegram.messenger.i0.L(36.0f), org.telegram.messenger.i0.L(14.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(1);
        frameLayout.addView(linearLayout, w7.b6.c(-2.0f, -1));
        linearLayout.addView(new a7(zs.q2, context, false), w7.b6.t(zs.q2, zs.q2, 1, 0, -12, 0, -8));
        TextView textView = new TextView(context);
        textView.setText(cd.L0(2131743123, null));
        org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.j5, p6Var);
        textView.setTextSize(1, 17.0f);
        textView.setTypeface(org.telegram.messenger.i0.o1("fonts/rmedium.ttf"));
        textView.setGravity(17);
        TextView f7 = z20.f(linearLayout, textView, w7.b6.t(-1, -2, 1, 0, 0, 0, 6), context);
        f7.setText(cd.L0(2131743122, null));
        int i12 = org.telegram.ui.ActionBar.t6.z6;
        org.telegram.ui.ActionBar.a7.V(f7, i12, p6Var);
        f7.setTextSize(1, 14.0f);
        f7.setGravity(17);
        f7.setLineSpacing(org.telegram.messenger.i0.L(1.0f), 1.0f);
        linearLayout.addView(f7, w7.b6.t(-1, -2, 1, 0, 0, 0, 24));
        t5 t5Var = new t5(context, p6Var);
        t5Var.setPadding(org.telegram.messenger.i0.L(0.0f), org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(0.0f), org.telegram.messenger.i0.L(8.0f));
        t5Var.a(R.drawable.wallet_learn_instant, cd.L0(2131743045, null), cd.L0(2131743044, null));
        linearLayout.addView(t5Var, w7.b6.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
        t5 t5Var2 = new t5(context, p6Var);
        t5Var2.setPadding(org.telegram.messenger.i0.L(0.0f), org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(0.0f), org.telegram.messenger.i0.L(8.0f));
        t5Var2.a(R.drawable.wallet_learn_fees, cd.L0(2131743094, null), cd.L0(2131743093, null));
        linearLayout.addView(t5Var2, w7.b6.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
        t5 t5Var3 = new t5(context, p6Var);
        t5Var3.setPadding(org.telegram.messenger.i0.L(0.0f), org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(0.0f), org.telegram.messenger.i0.L(8.0f));
        t5Var3.a(R.drawable.wallet_learn_verified, cd.L0(2131743208, null), cd.L0(2131743207, null));
        linearLayout.addView(t5Var3, w7.b6.k(0.0f, 0.0f, 0.0f, 14.0f, -1, -2));
        vh.d i13 = z20.i(24, context, p6Var, true);
        i13.setText(cd.L0(2131743127, null));
        linearLayout.addView(i13, w7.b6.t(-1, 48, 1, 0, 0, 0, 0));
        w7.e6.b(i13, 0.02f, 1.1f);
        p80 p80Var = new p80(context, null);
        org.telegram.ui.ActionBar.a7.V(p80Var, i12, p6Var);
        p80Var.setTextSize(1, 13.0f);
        p80Var.setGravity(17);
        p80Var.setText(P0(cd.L0(2131743032, null), org.telegram.ui.ActionBar.t6.Uc, p6Var, new g4(context, i10)));
        linearLayout.addView(p80Var, w7.b6.k(0.0f, 12.0f, 0.0f, 6.0f, -1, -2));
        k10.N = frameLayout;
        org.telegram.ui.ActionBar.z2[] z2VarArr = {k10};
        z2VarArr[0].u0(true);
        z2VarArr[0].O();
        i13.setOnClickListener(new n4(z2VarArr, i10));
        z2VarArr[0].show();
    }

    public static void I0(int i10, Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        k0 x10 = k0.x(i10);
        if (x10.G()) {
            String t10 = x10.t();
            if (TextUtils.isEmpty(t10)) {
                return;
            }
            org.telegram.ui.ActionBar.z2 z2Var = new org.telegram.ui.ActionBar.z2(1, context, p6Var, false);
            z2Var.v0(-12207881);
            z2Var.P(-12207881);
            FrameLayout frameLayout = new FrameLayout(context);
            frameLayout.setBackground(new a6());
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            linearLayout.setGravity(1);
            frameLayout.addView(linearLayout, w7.b6.f(-2.0f, -1, 55, org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(30.0f), org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(12.0f) + org.telegram.messenger.i0.n));
            z5 z5Var = new z5(context, t10);
            linearLayout.addView(z5Var, w7.b6.r(zs.L4, zs.Z4, 1));
            TextView textView = new TextView(context);
            textView.setText(cd.L0(2131743067, null));
            textView.setTextColor(-1);
            textView.setTextSize(1, 14.0f);
            textView.setGravity(17);
            textView.setLineSpacing(org.telegram.messenger.i0.L(1.0f), 1.0f);
            linearLayout.addView(textView, w7.b6.t(-1, -2, 1, 24, 0, 24, 20));
            vh.d dVar = new vh.d(context, null, true);
            dVar.setRoundRadius(24);
            dVar.setColor(-1);
            dVar.setTextColor(-15556886);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) "$");
            spannableStringBuilder.setSpan(new dq(R.drawable.wallet_buy, 0), 0, spannableStringBuilder.length(), 33);
            spannableStringBuilder.append((CharSequence) " ").append((CharSequence) cd.L0(2131743206, null));
            dVar.setText(spannableStringBuilder);
            linearLayout.addView(dVar, w7.b6.t(-1, 48, 1, 0, 0, 0, 0));
            ImageView imageView = new ImageView(context);
            imageView.setImageResource(R.drawable.ic_close_white);
            imageView.setPadding(org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(12.0f));
            imageView.setContentDescription(cd.L0(2131752041, null));
            w7.e6.a(imageView);
            frameLayout.addView(imageView, w7.b6.d(48, 48.0f, 51, 4.0f, 2.0f, 0.0f, 0.0f));
            z2Var.N = frameLayout;
            z2Var.x = true;
            z2Var.u0 = false;
            z2Var.v0 = false;
            z2Var.P(-12207881);
            imageView.setOnClickListener(new e4(z2Var, 0));
            z5Var.e = new q0(t10, 1);
            z2Var.show();
            z2Var.E0(-12207881);
            org.telegram.messenger.i0.t3(z2Var, -12207881, false, null);
            org.telegram.messenger.i0.m3(z2Var, false);
            if (Build.VERSION.SDK_INT >= 29 && z2Var.getWindow() != null) {
                z2Var.getWindow().setNavigationBarContrastEnforced(false);
            }
            dVar.setOnClickListener(new ya(dVar, i10, z2Var, p6Var, 6));
        }
    }

    public static SpannableStringBuilder P0(String str, int i10, org.telegram.ui.ActionBar.p6 p6Var, Runnable runnable) {
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
            spannableStringBuilder.setSpan(new w5(i10, p6Var, runnable), indexOf, i11 + indexOf, 0);
        }
        return spannableStringBuilder;
    }

    public static void X0(u51 u51Var, boolean z10) {
        boolean canScrollVertically = u51Var.canScrollVertically(-1);
        u51Var.f3.O(z10);
        u51Var.a0();
        if (canScrollVertically) {
            return;
        }
        u51Var.e3.h1(0, 0);
    }

    public static Uri a1(String str) {
        Uri parse = Uri.parse(str.trim());
        if (parse.getScheme() == null) {
            Uri parse2 = Uri.parse("https://" + str.trim());
            if (A0(parse2.getHost())) {
                return parse2;
            }
        }
        return parse;
    }

    public static String b1(Uri uri) {
        if (!A0(uri.getHost())) {
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

    public static void c0(b6 b6Var) {
        k0 x10 = k0.x(b6Var.currentAccount);
        vh.d dVar = b6Var.C0;
        if (dVar.Q) {
            return;
        }
        dVar.setLoading(true);
        boolean z10 = false;
        x10.m0(new e2.n0(x10, new f11(14, b6Var, x10), z10, z10, 4));
    }

    public static void d0(b6 b6Var) {
        gf.f.r(b6Var.getParentActivity(), k0.x(b6Var.currentAccount).j);
    }

    public static void e0(b6 b6Var) {
        I0(b6Var.currentAccount, b6Var.getParentActivity(), b6Var.getResourceProvider());
    }

    public static void f0(b6 b6Var, String str, k0 k0Var, z60 z60Var, LinearLayout linearLayout, TL_wallet.currencyRate currencyrate) {
        if (currencyrate == null) {
            return;
        }
        org.telegram.ui.ActionBar.b1 b1Var = new org.telegram.ui.ActionBar.b1(2, b6Var.getParentActivity(), b6Var.resourceProvider, false, false);
        b1Var.setPadding(org.telegram.messenger.i0.L(18.0f), 0, org.telegram.messenger.i0.L(18.0f), 0);
        b1Var.setText(currencyrate.currency);
        b1Var.setSubtext(!TextUtils.isEmpty(currencyrate.translatedTitle) ? currencyrate.translatedTitle : currencyrate.title);
        boolean equals = TextUtils.equals(str, currencyrate.currency);
        b1Var.b.setPadding(0, 0, org.telegram.messenger.i0.L(equals ? 42.0f : 0.0f), 0);
        b1Var.setChecked(equals);
        b1Var.setOnClickListener(new j1(k0Var, currencyrate, z60Var, 2));
        linearLayout.addView(b1Var, w7.b6.o(zs.e3, -2));
    }

    public static void g0(b6 b6Var) {
        org.telegram.ui.ActionBar.l lVar;
        if (b6Var.E == null || (lVar = b6Var.actionBar) == null || !(lVar.getParent() instanceof ViewGroup)) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) b6Var.actionBar.getParent();
        viewGroup.setClipChildren(false);
        viewGroup.setClipToPadding(false);
        if (b6Var.E.getParent() != b6Var.actionBar) {
            org.telegram.messenger.i0.E2(b6Var.E);
            b6Var.actionBar.addView(b6Var.E, w7.b6.c(-1.0f, -1));
        }
        b6Var.E.bringToFront();
        b6Var.actionBar.bringToFront();
        b6Var.E.post(new f4(b6Var, 10));
    }

    public static void h0(b6 b6Var) {
        I0(b6Var.currentAccount, b6Var.getParentActivity(), b6Var.getResourceProvider());
    }

    public static void i0(b6 b6Var, String str) {
        Uri a12 = a1(str);
        String b12 = b1(a12);
        if (b12 != null) {
            int i10 = b6Var.currentAccount;
            vp.r1(i10).c2().a(b12, null, new ag.s2(new m4(b6Var, 4), i10));
        } else {
            if ((b6Var.getParentActivity() instanceof LaunchActivity) && new ua0((LaunchActivity) b6Var.getParentActivity(), b6Var.currentAccount, null, false).g(a12)) {
                return;
            }
            org.telegram.messenger.i0.g3(new f4(b6Var, 11));
        }
    }

    public static void j0(b6 b6Var, LinearLayout linearLayout, k0 k0Var, z60 z60Var) {
        TL_wallet.currencyRate currencyrate;
        b6 b6Var2;
        ArrayList<TL_wallet.currencyRate> arrayList;
        LinearLayout linearLayout2 = linearLayout;
        k0 k0Var2 = k0Var;
        linearLayout2.removeAllViews();
        String g10 = k0Var2.h.g();
        TL_wallet.currencyRates f7 = k0Var2.h.f();
        if (f7 == null) {
            for (int i10 = 0; i10 < 3; i10++) {
                zz zzVar = new zz(b6Var.getParentActivity(), b6Var.getResourceProvider());
                zzVar.setIsSingleCell(true);
                zzVar.setViewType(31);
                linearLayout2.addView(zzVar, w7.b6.o(zs.e3, -2));
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
                InputMethodManager inputMethodManager = (InputMethodManager) org.telegram.messenger.w0.b.getSystemService("input_method");
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
                org.telegram.messenger.f8.g(e, true);
            }
            f.a(linkedHashSet, ((org.telegram.messenger.q0) vp.r1(fVar.a).y7.O.b).c);
            f.c(linkedHashSet, cd.D0().y);
            f.c(linkedHashSet, cd.D0().z);
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
                f0(b6Var, g10, k0Var2, z60Var, linearLayout2, currencyrate7);
            }
            i13++;
            k0Var2 = k0Var;
        }
        if (hashSet.isEmpty() || f7.rates.isEmpty()) {
            b6Var2 = b6Var;
        } else {
            b6Var2 = b6Var;
            linearLayout2.addView(new org.telegram.ui.ActionBar.h1(b6Var.getParentActivity(), b6Var2.resourceProvider), w7.b6.o(-1, 8));
        }
        int i14 = 0;
        while (i14 < f7.rates.size()) {
            TL_wallet.currencyRate currencyrate8 = f7.rates.get(i14);
            if (currencyrate8 != null && !hashSet.contains(currencyrate8.currency)) {
                f0(b6Var2, g10, k0Var, z60Var, linearLayout2, currencyrate8);
            }
            i14++;
            b6Var2 = b6Var;
            linearLayout2 = linearLayout;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void k0(final b6 b6Var, Context context, View view) {
        k0 x10 = k0.x(b6Var.currentAccount);
        final z60 I = z60.I(b6Var, view);
        I.a0(0.0f, -org.telegram.messenger.i0.L(48.0f));
        final int i10 = 0;
        I.s = 0;
        I.V(5);
        z60 J = I.J();
        J.c(R.drawable.ic_ab_back, cd.L0(2131743218, null), new rr0(I, 27), false);
        J.k();
        ScrollView scrollView = new ScrollView(context);
        LinearLayout linearLayout = new LinearLayout(context);
        final int i11 = 1;
        linearLayout.setOrientation(1);
        scrollView.addView(linearLayout);
        k7 k7Var = new k7(b6Var, linearLayout, x10, I, 11);
        J.r(scrollView, w7.b6.o(-1, 350));
        I.c(R.drawable.wallet_globe, cd.L0(2131743174, null), new g(k7Var, I, J, 10), false);
        org.telegram.ui.ActionBar.b1 y3 = I.y();
        f fVar = x10.h;
        String i12 = fVar.i();
        boolean isEmpty = TextUtils.isEmpty(i12);
        String str = i12;
        if (isEmpty) {
            y3.setSubtext("USD");
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(cd.L0(2131748789, null));
            spannableStringBuilder.setSpan(new u80(org.telegram.messenger.i0.L(75.0f), y3.b), 0, spannableStringBuilder.length(), 33);
            str = spannableStringBuilder;
        }
        y3.setSubtext(str);
        k7 k7Var2 = new k7(x10, new boolean[]{fVar.f() != null}, y3, k7Var, 12);
        b6Var.P0.add(k7Var2);
        k7Var.run();
        I.c(R.drawable.wallet_lock, cd.L0(2131747673, null), new Runnable(b6Var) { // from class: org.telegram.ui.Wallet.r4
            public final /* synthetic */ b6 b;

            {
                this.b = b6Var;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i10) {
                    case 0:
                        b6 b6Var2 = this.b;
                        b6Var2.getClass();
                        I.u();
                        b6Var2.presentFragment(PasscodeActivity.o0());
                        break;
                    case 1:
                        b6 b6Var3 = this.b;
                        b6Var3.getClass();
                        I.u();
                        b6Var3.presentFragment(new t8());
                        break;
                    case 2:
                        b6 b6Var4 = this.b;
                        b6Var4.getClass();
                        I.u();
                        b6Var4.presentFragment(new ma());
                        break;
                    default:
                        I.u();
                        b6 b6Var5 = this.b;
                        b6.H0(b6Var5.getParentActivity(), b6Var5.getResourceProvider());
                        break;
                }
            }
        }, false);
        I.c(R.drawable.wallet_key, cd.L0(2131743106, null), new Runnable(b6Var) { // from class: org.telegram.ui.Wallet.r4
            public final /* synthetic */ b6 b;

            {
                this.b = b6Var;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i11) {
                    case 0:
                        b6 b6Var2 = this.b;
                        b6Var2.getClass();
                        I.u();
                        b6Var2.presentFragment(PasscodeActivity.o0());
                        break;
                    case 1:
                        b6 b6Var3 = this.b;
                        b6Var3.getClass();
                        I.u();
                        b6Var3.presentFragment(new t8());
                        break;
                    case 2:
                        b6 b6Var4 = this.b;
                        b6Var4.getClass();
                        I.u();
                        b6Var4.presentFragment(new ma());
                        break;
                    default:
                        I.u();
                        b6 b6Var5 = this.b;
                        b6.H0(b6Var5.getParentActivity(), b6Var5.getResourceProvider());
                        break;
                }
            }
        }, false);
        final int i13 = 2;
        I.l(R.drawable.wallet_apps, cd.L0(2131743182, null), new Runnable(b6Var) { // from class: org.telegram.ui.Wallet.r4
            public final /* synthetic */ b6 b;

            {
                this.b = b6Var;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i13) {
                    case 0:
                        b6 b6Var2 = this.b;
                        b6Var2.getClass();
                        I.u();
                        b6Var2.presentFragment(PasscodeActivity.o0());
                        break;
                    case 1:
                        b6 b6Var3 = this.b;
                        b6Var3.getClass();
                        I.u();
                        b6Var3.presentFragment(new t8());
                        break;
                    case 2:
                        b6 b6Var4 = this.b;
                        b6Var4.getClass();
                        I.u();
                        b6Var4.presentFragment(new ma());
                        break;
                    default:
                        I.u();
                        b6 b6Var5 = this.b;
                        b6.H0(b6Var5.getParentActivity(), b6Var5.getResourceProvider());
                        break;
                }
            }
        }, true ^ x10.g.d.isEmpty());
        I.k();
        final int i14 = 3;
        I.c(R.drawable.wallet_help, cd.L0(2131742986, null), new Runnable(b6Var) { // from class: org.telegram.ui.Wallet.r4
            public final /* synthetic */ b6 b;

            {
                this.b = b6Var;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i14) {
                    case 0:
                        b6 b6Var2 = this.b;
                        b6Var2.getClass();
                        I.u();
                        b6Var2.presentFragment(PasscodeActivity.o0());
                        break;
                    case 1:
                        b6 b6Var3 = this.b;
                        b6Var3.getClass();
                        I.u();
                        b6Var3.presentFragment(new t8());
                        break;
                    case 2:
                        b6 b6Var4 = this.b;
                        b6Var4.getClass();
                        I.u();
                        b6Var4.presentFragment(new ma());
                        break;
                    default:
                        I.u();
                        b6 b6Var5 = this.b;
                        b6.H0(b6Var5.getParentActivity(), b6Var5.getResourceProvider());
                        break;
                }
            }
        }, false);
        I.p = new k3(4, b6Var, k7Var2);
        I.Z();
    }

    public static void l0(b6 b6Var, long j10) {
        f4 f4Var = b6Var.K0;
        if (b6Var.a == null) {
            return;
        }
        y8 y8Var = b6Var.i0;
        if (y8Var != null) {
            y8Var.a();
        }
        if (b6Var.I0 <= 0.0f && b6Var.z0()) {
            int top = b6Var.a.e3.m(b6Var.h).getTop() - b6Var.a.getPaddingTop();
            b6Var.a.C0();
            if (top < 0) {
                b6Var.a.w0(0, top, gr.h);
                return;
            }
            return;
        }
        b6Var.a.C0();
        b6Var.r0(true);
        org.telegram.messenger.i0.r(f4Var);
        if (j10 > 0) {
            org.telegram.messenger.i0.h3(f4Var, j10 + 260);
        }
    }

    public static Typeface q0(Context context) {
        if (U0 == null) {
            if (Build.VERSION.SDK_INT >= 26) {
                U0 = new Typeface.Builder(context.getAssets(), "fonts/rmono_var.ttf").setFontVariationSettings("'wght' 500").setWeight(500).build();
            } else {
                U0 = org.telegram.messenger.i0.o1("fonts/rmono.ttf");
            }
        }
        return U0;
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x03aa  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x03db A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x03ec  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x05bf  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0649  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0694  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0630  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x055f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static LinearLayout s0(final Context context, int i10, TL_wallet.walletTransaction wallettransaction, l20 l20Var, j20 j20Var, byte[] bArr, Runnable runnable, org.telegram.ui.ActionBar.p6 p6Var, z2[] z2VarArr, boolean z10) {
        String t10;
        String str;
        d5 d5Var;
        TextView textView;
        ImageView imageView;
        ImageView imageView2;
        float f7;
        int i11;
        ImageView imageView3;
        wy0 wy0Var;
        SpannableString[] spannableStringArr;
        LinearLayout linearLayout;
        String[] strArr;
        boolean[] zArr;
        TextView[] textViewArr;
        TL_wallet.walletTransaction wallettransaction2;
        e5 e5Var;
        int i12;
        g5 g5Var;
        final z2[] z2VarArr2;
        char c10;
        Object s10;
        int i13;
        final FrameLayout frameLayout;
        final org.telegram.ui.ActionBar.p6 p6Var2 = p6Var;
        boolean z11 = l20Var != null;
        final LinearLayout f10 = org.telegram.messenger.m5.f(context, 1);
        FrameLayout frameLayout2 = new FrameLayout(context);
        f10.addView(frameLayout2, w7.b6.o(-1, 56));
        int i14 = org.telegram.ui.ActionBar.t6.G6;
        org.telegram.ui.ActionBar.t6.w0(i14, p6Var2);
        int i15 = org.telegram.ui.ActionBar.t6.i6;
        int w02 = org.telegram.ui.ActionBar.t6.w0(i15, p6Var2);
        ImageView imageView4 = new ImageView(context);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView4.setScaleType(scaleType);
        imageView4.setImageResource(R.drawable.ic_ab_close);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        org.telegram.ui.ActionBar.a7.t(imageView4, i14, p6Var2, mode);
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.t6.h0(w02, 1, -1);
        org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i15);
        imageView4.setBackground(h02);
        org.telegram.ui.ActionBar.a7.k(imageView4, h02, null, N, p6Var2);
        imageView4.setContentDescription(cd.L0(2131752041, null));
        frameLayout2.addView(imageView4, w7.b6.d(48, 48.0f, 19, 4.0f, -2.0f, 0.0f, 0.0f));
        ImageView imageView5 = new ImageView(context);
        imageView5.setScaleType(scaleType);
        imageView5.setImageResource(R.drawable.ic_ab_other);
        org.telegram.ui.ActionBar.a7.t(imageView5, i14, p6Var2, mode);
        org.telegram.ui.Cells.y h03 = org.telegram.ui.ActionBar.t6.h0(w02, 1, -1);
        org.telegram.ui.ActionBar.w6 N2 = org.telegram.ui.ActionBar.a7.N(i15);
        imageView5.setBackground(h03);
        org.telegram.ui.ActionBar.a7.k(imageView5, h03, null, N2, p6Var2);
        imageView5.setContentDescription(cd.L0(2131754839, null));
        imageView5.setVisibility(l20Var != null ? 8 : 0);
        frameLayout2.addView(imageView5, w7.b6.d(44, 48.0f, 21, 0.0f, 2.0f, 4.0f, 0.0f));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        linearLayout2.setGravity(1);
        f10.addView(linearLayout2, w7.b6.k(14.0f, wallettransaction.key_change ? -20.0f : -40.0f, 14.0f, 24.0f, -1, -2));
        View a7Var = new a7(120, context, z10);
        a7Var.setTag(a7.class);
        linearLayout2.addView(a7Var, w7.b6.t(120, 120, 1, 0, 0, 0, -8));
        d5 d5Var2 = new d5(context);
        d5Var2.setSingleLine(true);
        d5Var2.setGravity(17);
        d5Var2.setIncludeFontPadding(false);
        d5Var2.setTextSize(1, 40.0f);
        d5Var2.setTypeface(org.telegram.messenger.i0.o());
        linearLayout2.addView(d5Var2, w7.b6.r(-1, 50, 1));
        TextView textView2 = new TextView(context);
        textView2.setGravity(17);
        textView2.setIncludeFontPadding(false);
        textView2.setTextSize(1, 14.0f);
        int i16 = org.telegram.ui.ActionBar.t6.z6;
        org.telegram.ui.ActionBar.a7.V(textView2, i16, p6Var2);
        linearLayout2.addView(textView2, w7.b6.t(-1, 20, 1, 0, 3, 0, 0));
        if (wallettransaction.key_change) {
            linearLayout2.removeAllViews();
            FrameLayout frameLayout3 = new FrameLayout(context);
            frameLayout3.setBackground(org.telegram.ui.ActionBar.t6.M(org.telegram.messenger.i0.L(76.0f), -7956054, -9534569));
            ImageView imageView6 = new ImageView(context);
            imageView6.setImageResource(R.drawable.wallet_transaction_key);
            imageView6.setScaleType(ImageView.ScaleType.FIT_CENTER);
            frameLayout3.addView(imageView6, w7.b6.e(44, 44, 17));
            linearLayout2.addView(frameLayout3, w7.b6.r(76, 76, 1));
            TextView textView3 = new TextView(context);
            textView3.setText(cd.L0(2131743107, null));
            org.telegram.messenger.m5.m(textView3, i14, p6Var2, 1, 18.0f);
            textView3.setGravity(17);
            textView3.setIncludeFontPadding(false);
            linearLayout2.addView(textView3, w7.b6.t(-1, 24, 1, 12, 12, 12, 0));
        } else if (wallettransaction.nft != null) {
            linearLayout2.removeAllViews();
            TL_wallet.nftItem nftitem = wallettransaction.nft;
            org.telegram.ui.Components.g9 g9Var = new org.telegram.ui.Components.g9(context);
            g9Var.setRoundRadius(org.telegram.messenger.i0.L(12.0f));
            g9Var.setContentDescription(nftitem.name);
            Drawable mutate = context.getResources().getDrawable(R.drawable.wallet_nft_placeholder).mutate();
            org.telegram.ui.ActionBar.a7.y(g9Var, mutate, i16, p6Var2, mode);
            ic c11 = c.c(nftitem, false);
            if (c11 != null) {
                g9Var.j(c11, "120_120", mutate, nftitem);
            } else {
                g9Var.setImageDrawable(mutate);
            }
            linearLayout2.addView(g9Var, w7.b6.r(120, 120, 1));
            TextView textView4 = new TextView(context);
            textView4.setText(TextUtils.isEmpty(nftitem.name) ? cd.L0(2131743202, null) : nftitem.name);
            org.telegram.messenger.m5.m(textView4, i14, p6Var2, 1, 17.0f);
            textView4.setGravity(17);
            linearLayout2.addView(textView4, w7.b6.k(12.0f, 16.0f, 12.0f, 0.0f, -1, -2));
            if (wallettransaction.incoming) {
                t10 = k0.x(i10).t();
            } else {
                TL_wallet.WalletTransactionPeer walletTransactionPeer = wallettransaction.peer;
                if (walletTransactionPeer == null) {
                    str = null;
                    if (l20Var == null) {
                        if (wallettransaction.comment_encrypted || wallettransaction.comment_encrypted_preparing) {
                            f7 = 11.0f;
                            if (wallettransaction.comment_encrypted_preparing || !TextUtils.isEmpty(str)) {
                                nh.p pVar = new nh.p(context, p6Var2, false);
                                pVar.r = false;
                                pVar.setTextSize(1, 15.0f);
                                org.telegram.ui.ActionBar.a7.V(pVar, i14, p6Var2);
                                StringBuilder sb2 = new StringBuilder(25);
                                int i17 = 0;
                                for (int i18 = 25; i17 < i18; i18 = 25) {
                                    sb2.append("a");
                                    i17++;
                                }
                                SpannableString spannableString = new SpannableString(sb2.toString());
                                yz0 yz0Var = new yz0();
                                yz0Var.a |= 256;
                                spannableString.setSpan(new zz0(yz0Var, 0), 0, spannableString.length(), 33);
                                pVar.setText(spannableString);
                                org.telegram.ui.ActionBar.c5 c5Var = new org.telegram.ui.ActionBar.c5(0, false, false, null);
                                c5Var.x = false;
                                c5Var.w = Integer.valueOf(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Xl, p6Var2));
                                pVar.setBackground(c5Var);
                                pVar.setPadding(org.telegram.messenger.i0.L(19.0f), org.telegram.messenger.i0.L(6.0f), org.telegram.messenger.i0.L(15.0f), org.telegram.messenger.i0.L(11.0f));
                                linearLayout2.addView(pVar, w7.b6.t(-2, -2, 1, 32, 15, 32, 0));
                                w7.e6.a(pVar);
                                i11 = 1;
                                textView = textView2;
                                d5Var = d5Var2;
                                imageView = imageView4;
                                imageView2 = imageView5;
                                pVar.setOnClickListener(new wt(new boolean[]{false}, z2VarArr, p6Var2, pVar, wallettransaction, i10, str));
                                SpannableString[] spannableStringArr2 = new SpannableString[i11];
                                TextView[] textViewArr2 = new TextView[i11];
                                wy0 wy0Var2 = new wy0(context, p6Var2);
                                f10.addView(wy0Var2, w7.b6.k(14.0f, 0.0f, 14.0f, 0.0f, -1, -2));
                                final String[] strArr2 = {wallettransaction.comment};
                                final boolean[] zArr2 = {(wallettransaction.comment_encrypted || (z11 && bArr == null)) ? false : true};
                                if (l20Var == null) {
                                    FrameLayout frameLayout4 = new FrameLayout(context);
                                    int L = org.telegram.messenger.i0.L(22.0f);
                                    int L2 = org.telegram.messenger.i0.L(22.0f);
                                    int i19 = org.telegram.ui.ActionBar.t6.a7;
                                    ShapeDrawable e02 = org.telegram.ui.ActionBar.t6.e0(L, L2, org.telegram.ui.ActionBar.t6.w0(i19, p6Var2));
                                    org.telegram.ui.ActionBar.w6 N3 = org.telegram.ui.ActionBar.a7.N(i19);
                                    frameLayout4.setBackground(e02);
                                    org.telegram.ui.ActionBar.a7.k(frameLayout4, e02, N3, null, p6Var2);
                                    final k3 k3Var = new k3(1, textViewArr2, spannableStringArr2);
                                    final Runnable[] runnableArr = new Runnable[1];
                                    final ce ceVar = new ce(runnableArr, textViewArr2, i10, p6Var2, wallettransaction, strArr2, zArr2, bArr);
                                    wy0Var = wy0Var2;
                                    textViewArr = textViewArr2;
                                    wallettransaction2 = wallettransaction;
                                    e5 e5Var2 = new e5(context, p6Var2);
                                    e5Var2.setHint(cd.L0(2131743085, null));
                                    e5Var2.setText(strArr2[0]);
                                    ImageView imageView7 = imageView;
                                    e5Var2.setPadding(org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(f7), org.telegram.messenger.i0.L(64.0f), org.telegram.messenger.i0.L(12.0f));
                                    int i20 = org.telegram.ui.ActionBar.t6.G6;
                                    org.telegram.ui.ActionBar.a7.V(e5Var2, i20, p6Var2);
                                    org.telegram.ui.ActionBar.w6 L3 = org.telegram.ui.ActionBar.a7.L(0.65f, i20);
                                    org.telegram.ui.ActionBar.a7.o(e5Var2, 1, L3.a, -1, 2, L3.d, p6Var);
                                    e5Var2.setMaxLines(4);
                                    frameLayout4.addView(e5Var2, w7.b6.d(-1, -2.0f, zs.E1, 0.0f, 0.0f, (wallettransaction2.nft != null || bArr == null) ? 0.0f : 44.0f, 0.0f));
                                    e5Var2.addTextChangedListener(new f5(strArr2, k3Var, runnableArr, ceVar));
                                    if (wallettransaction2.nft != null || bArr == null) {
                                        frameLayout = frameLayout4;
                                        p6Var2 = p6Var;
                                        imageView3 = imageView7;
                                        spannableStringArr = spannableStringArr2;
                                        strArr = strArr2;
                                        linearLayout = f10;
                                        e5Var = e5Var2;
                                        zArr = zArr2;
                                    } else {
                                        FrameLayout frameLayout5 = new FrameLayout(context);
                                        w7.e6.a(frameLayout5);
                                        final ImageView imageView8 = new ImageView(context);
                                        frameLayout5.addView(imageView8, w7.b6.c(-1.0f, -1));
                                        imageView8.setScaleType(ImageView.ScaleType.CENTER);
                                        org.telegram.ui.ActionBar.a7.t(imageView8, zArr2[0] ? org.telegram.ui.ActionBar.t6.Ci : org.telegram.ui.ActionBar.t6.z6, p6Var, PorterDuff.Mode.SRC_IN);
                                        imageView8.setImageResource(zArr2[0] ? R.drawable.wallet_comment_locked : R.drawable.wallet_comment_unlocked);
                                        int i21 = org.telegram.ui.ActionBar.t6.i6;
                                        org.telegram.ui.Cells.y h04 = org.telegram.ui.ActionBar.t6.h0(org.telegram.ui.ActionBar.t6.w0(i21, p6Var), 1, -1);
                                        org.telegram.ui.ActionBar.w6 N4 = org.telegram.ui.ActionBar.a7.N(i21);
                                        imageView8.setBackground(h04);
                                        org.telegram.ui.ActionBar.a7.k(imageView8, h04, null, N4, p6Var);
                                        final vh.p2[] p2VarArr = new vh.p2[1];
                                        frameLayout = frameLayout4;
                                        p6Var2 = p6Var;
                                        imageView3 = imageView7;
                                        spannableStringArr = spannableStringArr2;
                                        e5Var = e5Var2;
                                        zArr = zArr2;
                                        linearLayout = f10;
                                        strArr = strArr2;
                                        frameLayout5.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Wallet.p4
                                            @Override // android.view.View.OnClickListener
                                            public final void onClick(View view) {
                                                final boolean[] zArr3 = zArr2;
                                                zArr3[0] = !zArr3[0];
                                                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
                                                final AtomicBoolean atomicBoolean = new AtomicBoolean();
                                                final ImageView imageView9 = imageView8;
                                                final org.telegram.ui.ActionBar.p6 p6Var3 = p6Var2;
                                                duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Wallet.u4
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
                                                            org.telegram.ui.ActionBar.a7.t(imageView10, zArr4[0] ? org.telegram.ui.ActionBar.t6.Ci : org.telegram.ui.ActionBar.t6.z6, p6Var3, PorterDuff.Mode.SRC_IN);
                                                            imageView10.setImageResource(zArr4[0] ? R.drawable.wallet_comment_locked : R.drawable.wallet_comment_unlocked);
                                                        }
                                                    }
                                                });
                                                duration.setInterpolator(gr.h);
                                                duration.setDuration(420L);
                                                duration.start();
                                                vh.p2[] p2VarArr2 = p2VarArr;
                                                vh.p2 p2Var = p2VarArr2[0];
                                                if (p2Var != null) {
                                                    p2Var.e(true);
                                                    p2VarArr2[0] = null;
                                                }
                                                LinearLayout linearLayout3 = f10;
                                                if (linearLayout3.getParent() instanceof FrameLayout) {
                                                    FrameLayout frameLayout6 = (FrameLayout) linearLayout3.getParent();
                                                    vh.p2 p2Var2 = new vh.p2(context, 3);
                                                    p2VarArr2[0] = p2Var2;
                                                    p2Var2.r();
                                                    p2Var2.setPadding(org.telegram.messenger.i0.L(10.0f), 0, org.telegram.messenger.i0.L(10.0f), 0);
                                                    p2Var2.s(cd.L0(zArr3[0] ? 2131743073 : 2131743068, null));
                                                    p2Var2.setTranslationY(-(org.telegram.messenger.i0.L(44.0f) + (linearLayout3.getHeight() - frameLayout.getBottom())));
                                                    p2Var2.m(1.0f, -org.telegram.messenger.i0.L(26.0f));
                                                    p2Var2.q(20.0f);
                                                    float L4 = org.telegram.messenger.i0.L(12.0f);
                                                    float L5 = org.telegram.messenger.i0.L(4.0f);
                                                    int r12 = org.telegram.ui.ActionBar.t6.r1(0.25f, -16777216);
                                                    p2Var2.i0 = L4;
                                                    p2Var2.j0 = L5;
                                                    p2Var2.k0 = r12;
                                                    p2Var2.F.setShadowLayer(L4, 0.0f, L5, r12);
                                                    frameLayout6.addView(p2Var2, w7.b6.e(-1, zs.e3, 87));
                                                    p2Var2.u();
                                                    p2Var2.l0 = new l(p2Var2, 7);
                                                }
                                                if (TextUtils.isEmpty(strArr2[0])) {
                                                    return;
                                                }
                                                k3Var.run();
                                                Runnable[] runnableArr2 = runnableArr;
                                                Runnable runnable2 = runnableArr2[0];
                                                if (runnable2 != null) {
                                                    runnable2.run();
                                                    runnableArr2[0] = null;
                                                }
                                                ce ceVar2 = ceVar;
                                                org.telegram.messenger.i0.r(ceVar2);
                                                org.telegram.messenger.i0.h3(ceVar2, 1000L);
                                            }
                                        });
                                        frameLayout.addView(frameLayout5, w7.b6.e(44, 44, 85));
                                    }
                                    linearLayout.addView(frameLayout, w7.b6.k(14.0f, 12.0f, 14.0f, 8.0f, -1, -2));
                                } else {
                                    imageView3 = imageView;
                                    wy0Var = wy0Var2;
                                    spannableStringArr = spannableStringArr2;
                                    linearLayout = f10;
                                    strArr = strArr2;
                                    zArr = zArr2;
                                    textViewArr = textViewArr2;
                                    wallettransaction2 = wallettransaction;
                                    e5Var = null;
                                }
                                vh.d i22 = z20.i(24, context, p6Var2, true);
                                i22.setText(cd.L0(2131747847, null));
                                linearLayout.addView(i22, w7.b6.k(14.0f, 14.0f, 14.0f, 14.0f, -1, 48));
                                TL_wallet.walletTransaction[] wallettransactionArr = {wallettransaction2};
                                q4 q4Var = new q4(linearLayout, d5Var, p6Var2, i10, textView, z2VarArr, wy0Var, l20Var, context, textViewArr, spannableStringArr);
                                LinearLayout linearLayout3 = linearLayout;
                                linearLayout3.setTag(new k3(3, q4Var, wallettransactionArr));
                                q4Var.a(wallettransaction2);
                                if (z11) {
                                    i12 = i10;
                                    g5 g5Var2 = new g5(i12, wallettransactionArr, q4Var);
                                    if (wallettransaction2.preview) {
                                        k0 x10 = k0.x(i12);
                                        String str2 = wallettransaction2.id;
                                        m mVar = new m(wallettransaction2, q4Var, wallettransactionArr, 4);
                                        HashMap hashMap = x10.K;
                                        j0 j0Var = x10.n;
                                        if (j0Var != null) {
                                            ArrayList arrayList = j0Var.c;
                                            int size = arrayList.size();
                                            int i23 = 0;
                                            while (i23 < size) {
                                                Object obj = arrayList.get(i23);
                                                i23++;
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
                                            ConnectionsManager.getInstance(x10.a).sendRequestTyped(gettransactionsbyids, new a3.b(1), new j(x10, (Object) mVar, (Object) str2, 4));
                                        }
                                    }
                                    g5Var = g5Var2;
                                } else {
                                    i12 = i10;
                                    g5Var = null;
                                }
                                String[] strArr3 = strArr;
                                boolean[] zArr3 = zArr;
                                linearLayout3.addOnAttachStateChangeListener(new h5(q4Var, wallettransactionArr, g5Var, i12, j20Var, z2VarArr, strArr3, zArr3));
                                if (l20Var == null) {
                                    TL_wallet.nftItem nftitem2 = wallettransaction2.nft;
                                    if (nftitem2 != null) {
                                        s10 = TextUtils.isEmpty(nftitem2.name) ? cd.L0(2131743202, null) : wallettransaction2.nft.name;
                                        i13 = 1;
                                        c10 = 0;
                                    } else {
                                        long abs = Math.abs(wallettransaction2.amount);
                                        c10 = 0;
                                        s10 = k0.s(abs, false);
                                        i13 = 1;
                                    }
                                    Object[] objArr = new Object[i13];
                                    objArr[c10] = s10;
                                    i22.setText(cd.V(null, null, 2131743047, objArr));
                                    z2VarArr2 = z2VarArr;
                                    i22.setOnClickListener(new org.telegram.messenger.video.f(i22, e5Var, l20Var, strArr3, zArr3, z2VarArr2, p6Var));
                                } else {
                                    z2VarArr2 = z2VarArr;
                                    final int i24 = 0;
                                    if (runnable != null) {
                                        i22.setText(cd.L0(2131743086, null));
                                        i22.setOnClickListener(new rv0(14, runnable, z2VarArr2));
                                    } else {
                                        i22.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Wallet.o4
                                            @Override // android.view.View.OnClickListener
                                            public final void onClick(View view) {
                                                switch (i24) {
                                                    case 0:
                                                        z2VarArr2[0].dismiss();
                                                        break;
                                                    default:
                                                        z2VarArr2[0].dismiss();
                                                        break;
                                                }
                                            }
                                        });
                                    }
                                }
                                final int i25 = 1;
                                imageView3.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Wallet.o4
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view) {
                                        switch (i25) {
                                            case 0:
                                                z2VarArr2[0].dismiss();
                                                break;
                                            default:
                                                z2VarArr2[0].dismiss();
                                                break;
                                        }
                                    }
                                });
                                ImageView imageView9 = imageView2;
                                imageView9.setOnClickListener(new vf(z2VarArr2, p6Var, imageView9, wallettransactionArr, context, i10, 3));
                                return linearLayout3;
                            }
                        } else if (TextUtils.isEmpty(wallettransaction.comment)) {
                            f7 = 11.0f;
                        } else {
                            nh.p pVar2 = new nh.p(context);
                            pVar2.setTextSize(1, 15.0f);
                            org.telegram.ui.ActionBar.a7.V(pVar2, i14, p6Var2);
                            f7 = 11.0f;
                            pVar2.setText(org.telegram.messenger.k6.m(wallettransaction.comment, pVar2.getPaint().getFontMetricsInt(), false, null, 0));
                            pVar2.setTextIsSelectable(true);
                            org.telegram.ui.ActionBar.c5 c5Var2 = new org.telegram.ui.ActionBar.c5(0, false, false, null);
                            c5Var2.x = false;
                            c5Var2.w = Integer.valueOf(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Xl, p6Var2));
                            pVar2.setBackground(c5Var2);
                            pVar2.setPadding(org.telegram.messenger.i0.L(19.0f), org.telegram.messenger.i0.L(9.0f), org.telegram.messenger.i0.L(15.0f), org.telegram.messenger.i0.L(8.0f));
                            linearLayout2.addView(pVar2, w7.b6.t(-2, -2, 1, 32, 16, 32, 0));
                        }
                        d5Var = d5Var2;
                        textView = textView2;
                        imageView = imageView4;
                        imageView2 = imageView5;
                    } else {
                        d5Var = d5Var2;
                        textView = textView2;
                        imageView = imageView4;
                        imageView2 = imageView5;
                        f7 = 11.0f;
                    }
                    i11 = 1;
                    SpannableString[] spannableStringArr22 = new SpannableString[i11];
                    TextView[] textViewArr22 = new TextView[i11];
                    wy0 wy0Var22 = new wy0(context, p6Var2);
                    f10.addView(wy0Var22, w7.b6.k(14.0f, 0.0f, 14.0f, 0.0f, -1, -2));
                    final String[] strArr22 = {wallettransaction.comment};
                    final boolean[] zArr22 = {(wallettransaction.comment_encrypted || (z11 && bArr == null)) ? false : true};
                    if (l20Var == null) {
                    }
                    vh.d i222 = z20.i(24, context, p6Var2, true);
                    i222.setText(cd.L0(2131747847, null));
                    linearLayout.addView(i222, w7.b6.k(14.0f, 14.0f, 14.0f, 14.0f, -1, 48));
                    TL_wallet.walletTransaction[] wallettransactionArr2 = {wallettransaction2};
                    q4 q4Var2 = new q4(linearLayout, d5Var, p6Var2, i10, textView, z2VarArr, wy0Var, l20Var, context, textViewArr, spannableStringArr);
                    LinearLayout linearLayout32 = linearLayout;
                    linearLayout32.setTag(new k3(3, q4Var2, wallettransactionArr2));
                    q4Var2.a(wallettransaction2);
                    if (z11) {
                    }
                    String[] strArr32 = strArr;
                    boolean[] zArr32 = zArr;
                    linearLayout32.addOnAttachStateChangeListener(new h5(q4Var2, wallettransactionArr2, g5Var, i12, j20Var, z2VarArr, strArr32, zArr32));
                    if (l20Var == null) {
                    }
                    final int i252 = 1;
                    imageView3.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Wallet.o4
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i252) {
                                case 0:
                                    z2VarArr2[0].dismiss();
                                    break;
                                default:
                                    z2VarArr2[0].dismiss();
                                    break;
                            }
                        }
                    });
                    ImageView imageView92 = imageView2;
                    imageView92.setOnClickListener(new vf(z2VarArr2, p6Var, imageView92, wallettransactionArr2, context, i10, 3));
                    return linearLayout32;
                }
                t10 = walletTransactionPeer.address;
            }
            str = t10;
            if (l20Var == null) {
            }
            i11 = 1;
            SpannableString[] spannableStringArr222 = new SpannableString[i11];
            TextView[] textViewArr222 = new TextView[i11];
            wy0 wy0Var222 = new wy0(context, p6Var2);
            f10.addView(wy0Var222, w7.b6.k(14.0f, 0.0f, 14.0f, 0.0f, -1, -2));
            final String[] strArr222 = {wallettransaction.comment};
            final boolean[] zArr222 = {(wallettransaction.comment_encrypted || (z11 && bArr == null)) ? false : true};
            if (l20Var == null) {
            }
            vh.d i2222 = z20.i(24, context, p6Var2, true);
            i2222.setText(cd.L0(2131747847, null));
            linearLayout.addView(i2222, w7.b6.k(14.0f, 14.0f, 14.0f, 14.0f, -1, 48));
            TL_wallet.walletTransaction[] wallettransactionArr22 = {wallettransaction2};
            q4 q4Var22 = new q4(linearLayout, d5Var, p6Var2, i10, textView, z2VarArr, wy0Var, l20Var, context, textViewArr, spannableStringArr);
            LinearLayout linearLayout322 = linearLayout;
            linearLayout322.setTag(new k3(3, q4Var22, wallettransactionArr22));
            q4Var22.a(wallettransaction2);
            if (z11) {
            }
            String[] strArr322 = strArr;
            boolean[] zArr322 = zArr;
            linearLayout322.addOnAttachStateChangeListener(new h5(q4Var22, wallettransactionArr22, g5Var, i12, j20Var, z2VarArr, strArr322, zArr322));
            if (l20Var == null) {
            }
            final int i2522 = 1;
            imageView3.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Wallet.o4
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i2522) {
                        case 0:
                            z2VarArr2[0].dismiss();
                            break;
                        default:
                            z2VarArr2[0].dismiss();
                            break;
                    }
                }
            });
            ImageView imageView922 = imageView2;
            imageView922.setOnClickListener(new vf(z2VarArr2, p6Var, imageView922, wallettransactionArr22, context, i10, 3));
            return linearLayout322;
        }
        if (wallettransaction.incoming) {
        }
        str = t10;
        if (l20Var == null) {
        }
        i11 = 1;
        SpannableString[] spannableStringArr2222 = new SpannableString[i11];
        TextView[] textViewArr2222 = new TextView[i11];
        wy0 wy0Var2222 = new wy0(context, p6Var2);
        f10.addView(wy0Var2222, w7.b6.k(14.0f, 0.0f, 14.0f, 0.0f, -1, -2));
        final String[] strArr2222 = {wallettransaction.comment};
        final boolean[] zArr2222 = {(wallettransaction.comment_encrypted || (z11 && bArr == null)) ? false : true};
        if (l20Var == null) {
        }
        vh.d i22222 = z20.i(24, context, p6Var2, true);
        i22222.setText(cd.L0(2131747847, null));
        linearLayout.addView(i22222, w7.b6.k(14.0f, 14.0f, 14.0f, 14.0f, -1, 48));
        TL_wallet.walletTransaction[] wallettransactionArr222 = {wallettransaction2};
        q4 q4Var222 = new q4(linearLayout, d5Var, p6Var2, i10, textView, z2VarArr, wy0Var, l20Var, context, textViewArr, spannableStringArr);
        LinearLayout linearLayout3222 = linearLayout;
        linearLayout3222.setTag(new k3(3, q4Var222, wallettransactionArr222));
        q4Var222.a(wallettransaction2);
        if (z11) {
        }
        String[] strArr3222 = strArr;
        boolean[] zArr3222 = zArr;
        linearLayout3222.addOnAttachStateChangeListener(new h5(q4Var222, wallettransactionArr222, g5Var, i12, j20Var, z2VarArr, strArr3222, zArr3222));
        if (l20Var == null) {
        }
        final int i25222 = 1;
        imageView3.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Wallet.o4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i25222) {
                    case 0:
                        z2VarArr2[0].dismiss();
                        break;
                    default:
                        z2VarArr2[0].dismiss();
                        break;
                }
            }
        });
        ImageView imageView9222 = imageView2;
        imageView9222.setOnClickListener(new vf(z2VarArr2, p6Var, imageView9222, wallettransactionArr222, context, i10, 3));
        return linearLayout3222;
    }

    public static String u0(String str) {
        StringBuilder sb2 = new StringBuilder((str.length() / 4) + str.length());
        for (int i10 = 0; i10 < str.length(); i10++) {
            if (i10 > 0 && i10 % 4 == 0) {
                sb2.append(' ');
            }
            sb2.append(str.charAt(i10));
        }
        return sb2.toString();
    }

    public static SpannableStringBuilder v0(int i10, long j10, org.telegram.ui.ActionBar.p6 p6Var) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("G ");
        dq dqVar = new dq(R.drawable.wallet_gram_small, 2);
        dqVar.d = false;
        dqVar.c(org.telegram.messenger.i0.L(16.0f));
        spannableStringBuilder.setSpan(dqVar, 0, 1, 33);
        BigDecimal movePointLeft = new BigDecimal(j10).movePointLeft(9);
        spannableStringBuilder.append((CharSequence) (movePointLeft.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : movePointLeft.stripTrailingZeros()).toPlainString());
        CharSequence m10 = k0.x(i10).m(j10, true);
        if (!TextUtils.isEmpty(m10)) {
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) "  ~\u2009").append(m10);
            spannableStringBuilder.setSpan(new l00(org.telegram.ui.ActionBar.t6.z6, p6Var), length, spannableStringBuilder.length(), 33);
        }
        return spannableStringBuilder;
    }

    public final void C0() {
        c0 c0Var;
        u51 u51Var = this.r0[1];
        if (this.e0 != 1 || u51Var == null || !u51Var.G || (c0Var = this.E0) == null || c0Var.i || c0Var.g || c0Var.k != null || u51Var.e3.N0() < u51Var.f3.D.size() - 3) {
            return;
        }
        this.E0.e();
    }

    public final void D0() {
        j0 j0Var;
        u51 u51Var = this.r0[0];
        if (u51Var == null || !u51Var.G || (j0Var = this.D0) == null || j0Var.h || u51Var.e3.N0() < u51Var.f3.D.size() - 3) {
            return;
        }
        this.D0.h();
    }

    public final CharSequence E0(int i10) {
        CharSequence[] charSequenceArr = this.O0;
        if (charSequenceArr[i10] == null) {
            charSequenceArr[i10] = new SpannableString("l");
            u80 u80Var = new u80(org.telegram.messenger.i0.L(i10 == 0 ? 100.0f : 50.0f), i10 == 0 ? this.t0 : this.u0);
            u80Var.a(org.telegram.ui.ActionBar.t6.r1(0.45f, -1), org.telegram.ui.ActionBar.t6.r1(0.2f, -1));
            CharSequence charSequence = charSequenceArr[i10];
            ((SpannableString) charSequence).setSpan(u80Var, 0, charSequence.length(), 33);
        }
        return charSequenceArr[i10];
    }

    public final void G0(TL_wallet.nftItem nftitem) {
        TL_stars.StarGift starGift = nftitem.gift;
        String str = null;
        if (starGift instanceof TL_stars.TL_starGiftUnique) {
            TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) starGift;
            rh.e4 e4Var = new rh.e4(getParentActivity(), this.currentAccount, 0L, getResourceProvider(), null);
            e4Var.X2 = nftitem;
            if (this.j0 != null) {
                e4Var.Y2 = new i5(this, tL_starGiftUnique, nftitem);
                e4Var.Z2 = new j5(this, nftitem);
            }
            e4Var.h2(tL_starGiftUnique.slug, tL_starGiftUnique, null);
            showDialog(e4Var);
            return;
        }
        Activity parentActivity = getParentActivity();
        org.telegram.ui.ActionBar.p6 resourceProvider = getResourceProvider();
        if (parentActivity != null) {
            int i10 = org.telegram.ui.ActionBar.t6.a7;
            int w02 = org.telegram.ui.ActionBar.t6.w0(i10, resourceProvider);
            int i11 = org.telegram.ui.ActionBar.t6.G6;
            org.telegram.ui.ActionBar.t6.w0(i11, resourceProvider);
            x4 x4Var = new x4(1, parentActivity, resourceProvider, false);
            x4Var.a0 = i10;
            x4Var.v0(w02);
            x4Var.P(w02);
            ScrollView scrollView = new ScrollView(parentActivity);
            scrollView.setFillViewport(true);
            scrollView.setVerticalScrollBarEnabled(false);
            LinearLayout linearLayout = new LinearLayout(parentActivity);
            linearLayout.setOrientation(1);
            linearLayout.setGravity(1);
            float f7 = 12.0f;
            linearLayout.setPadding(org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(28.0f), org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(12.0f));
            scrollView.addView(linearLayout, new FrameLayout.LayoutParams(-1, -2));
            org.telegram.ui.Components.g9 g9Var = new org.telegram.ui.Components.g9(parentActivity);
            g9Var.setRoundRadius(org.telegram.messenger.i0.L(12.0f));
            g9Var.setContentDescription(nftitem.name);
            Drawable mutate = parentActivity.getResources().getDrawable(R.drawable.wallet_nft_placeholder).mutate();
            int i12 = org.telegram.ui.ActionBar.t6.z6;
            org.telegram.ui.ActionBar.a7.y(g9Var, mutate, i12, resourceProvider, PorterDuff.Mode.SRC_IN);
            ic c10 = c.c(nftitem, false);
            if (c10 != null) {
                g9Var.j(c10, "120_120", mutate, nftitem);
            } else {
                g9Var.setImageDrawable(mutate);
            }
            linearLayout.addView(g9Var, w7.b6.r(120, 120, 1));
            TextView textView = new TextView(parentActivity);
            textView.setText(TextUtils.isEmpty(nftitem.name) ? cd.L0(2131743202, null) : nftitem.name);
            org.telegram.messenger.m5.m(textView, i11, resourceProvider, 1, 17.0f);
            int i13 = 17;
            textView.setGravity(17);
            linearLayout.addView(textView, w7.b6.k(12.0f, 16.0f, 12.0f, 0.0f, -1, -2));
            TextView textView2 = new TextView(parentActivity);
            textView2.setText(nftitem.description);
            org.telegram.ui.ActionBar.a7.V(textView2, i12, resourceProvider);
            textView2.setTextSize(1, 14.0f);
            textView2.setGravity(17);
            textView2.setVisibility(TextUtils.isEmpty(nftitem.description) ? 8 : 0);
            linearLayout.addView(textView2, w7.b6.k(12.0f, 4.0f, 12.0f, 0.0f, -1, -2));
            LinearLayout linearLayout2 = new LinearLayout(parentActivity);
            linearLayout2.setOrientation(0);
            linearLayout.addView(linearLayout2, w7.b6.k(0.0f, 20.0f, 0.0f, 16.0f, -1, 54));
            int i14 = 0;
            while (i14 < 2) {
                LinearLayout linearLayout3 = new LinearLayout(parentActivity);
                linearLayout3.setOrientation(1);
                linearLayout3.setGravity(i13);
                int L = org.telegram.messenger.i0.L(16.0f);
                int i15 = org.telegram.ui.ActionBar.t6.d6;
                int w03 = org.telegram.ui.ActionBar.t6.w0(i15, resourceProvider);
                int i16 = org.telegram.ui.ActionBar.t6.i6;
                int w04 = org.telegram.ui.ActionBar.t6.w0(i16, resourceProvider);
                org.telegram.ui.Cells.y k02 = org.telegram.ui.ActionBar.t6.k0(L, L, L, L, w03, w04, w04);
                org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i15);
                org.telegram.ui.ActionBar.w6 N2 = org.telegram.ui.ActionBar.a7.N(i16);
                linearLayout3.setBackground(k02);
                org.telegram.ui.ActionBar.a7.k(linearLayout3, k02, N, N2, resourceProvider);
                linearLayout3.setClickable(true);
                linearLayout3.setFocusable(true);
                String L0 = cd.L0(i14 == 0 ? 2131743007 : 2131743049, str);
                linearLayout3.setContentDescription(L0);
                ImageView imageView = new ImageView(parentActivity);
                imageView.setImageResource(i14 == 0 ? R.drawable.wallet_transfer : R.drawable.wallet_sell);
                imageView.setImportantForAccessibility(2);
                int i17 = org.telegram.ui.ActionBar.t6.G6;
                org.telegram.ui.ActionBar.a7.t(imageView, i17, resourceProvider, PorterDuff.Mode.SRC_IN);
                linearLayout3.addView(imageView, w7.b6.o(24, 24));
                TextView textView3 = new TextView(parentActivity);
                textView3.setText(L0);
                float f10 = f7;
                org.telegram.messenger.m5.m(textView3, i17, resourceProvider, 1, f10);
                textView3.setGravity(17);
                linearLayout3.addView(textView3, w7.b6.k(0.0f, 2.0f, 0.0f, 0.0f, -2, -2));
                linearLayout2.addView(linearLayout3, w7.b6.m(1.0f, 0, -1, i14 == 0 ? 0 : 4, i14 == 0 ? 4 : 0, 0));
                i14++;
                f7 = f10;
                i13 = 17;
                str = null;
            }
            ArrayList<TL_wallet.nftAttribute> arrayList = nftitem.attributes;
            if (arrayList != null && !arrayList.isEmpty()) {
                wy0 wy0Var = new wy0(parentActivity, resourceProvider);
                int L2 = org.telegram.messenger.i0.L(10.0f);
                int i18 = org.telegram.ui.ActionBar.t6.d6;
                ShapeDrawable d02 = org.telegram.ui.ActionBar.t6.d0(L2, org.telegram.ui.ActionBar.t6.w0(i18, resourceProvider));
                org.telegram.ui.ActionBar.w6 N3 = org.telegram.ui.ActionBar.a7.N(i18);
                wy0Var.setBackground(d02);
                org.telegram.ui.ActionBar.a7.k(wy0Var, d02, N3, null, resourceProvider);
                ArrayList<TL_wallet.nftAttribute> arrayList2 = nftitem.attributes;
                int size = arrayList2.size();
                int i19 = 0;
                while (i19 < size) {
                    TL_wallet.nftAttribute nftattribute = arrayList2.get(i19);
                    i19++;
                    TL_wallet.nftAttribute nftattribute2 = nftattribute;
                    wy0Var.c(nftattribute2.trait_type, nftattribute2.value, null, null);
                }
                linearLayout.addView(wy0Var, w7.b6.k(0.0f, 0.0f, 0.0f, 14.0f, -1, -2));
            }
            vh.d dVar = new vh.d(parentActivity, resourceProvider, true);
            dVar.setRoundRadius(24);
            dVar.setText(cd.L0(2131743089, null));
            linearLayout.addView(dVar, w7.b6.o(-1, 48));
            x4Var.N = scrollView;
            x4Var.T0 = false;
            linearLayout2.getChildAt(0).setOnClickListener(new rv0(13, x4Var, nftitem));
            linearLayout2.getChildAt(1).setOnClickListener(new i3(parentActivity, 1));
            dVar.setOnClickListener(new i3(x4Var, 2));
            x4Var.show();
            x4Var.P(w02);
            org.telegram.messenger.i0.t3(x4Var, w02, false, null);
        }
    }

    public final void J0() {
        if (getParentActivity() == null || this.M0 != null || this.L0 == null) {
            return;
        }
        if (getParentActivity().checkSelfPermission("android.permission.CAMERA") != 0) {
            getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 44);
        } else {
            this.M0 = qh.y.k(this, this.L0, new zh(9), new m4(this, 3), new f4(this, 8));
        }
    }

    public final void K0(boolean z10) {
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
        Y0();
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
            L0(f7);
            this.p0.o(false);
        } else {
            this.h0.setVisibility(0);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.l0, f7);
            this.m0 = ofFloat;
            ofFloat.setDuration(250L);
            this.m0.setInterpolator(gr.h);
            this.m0.addUpdateListener(new l4(this, 0));
            this.m0.addListener(new org.telegram.ui.ActionBar.v0(this, f7, 7));
            this.m0.start();
        }
        if (this.a == null || this.o0 == M0()) {
            return;
        }
        W0(false);
    }

    public final void L0(float f7) {
        this.l0 = f7;
        this.h0.setVisibility((f7 > 0.0f || this.m0 != null) ? 0 : 8);
        this.h0.setAlpha(f7);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.h0.getLayoutParams();
        layoutParams.height = Math.round(org.telegram.messenger.i0.L(52.0f) * f7);
        layoutParams.bottomMargin = -Math.round(org.telegram.messenger.i0.L(6.0f) * f7);
        this.h0.setLayoutParams(layoutParams);
    }

    public final boolean M0() {
        j0 j0Var;
        if (this.f0 || (j0Var = this.D0) == null || !j0Var.c.isEmpty()) {
            return false;
        }
        j0 j0Var2 = this.D0;
        j0Var2.getClass();
        return j0Var2.h;
    }

    public final void N0() {
        this.F0 = false;
        y8 y8Var = this.i0;
        if (y8Var != null) {
            y8Var.b(false);
        }
        this.e0 = 0;
        hk hkVar = this.p0;
        if (hkVar != null) {
            hkVar.setPosition(0);
        }
    }

    public final void O0() {
        this.s = false;
        ii iiVar = this.a;
        if (iiVar != null) {
            iiVar.D2.b.remove(this.x);
            this.a.removeCallbacks(this.w);
        }
        o5 o5Var = this.e;
        if (o5Var != null) {
            o5Var.setAdditionalTilt(0.0f);
        }
    }

    public final void Q0() {
        k0 x10 = k0.x(this.currentAccount);
        Z0();
        this.C0.setEnabled(x10.G() && x10.e());
        if (!x10.G()) {
            this.t0.setText(E0(0));
            this.u0.setText(E0(1));
            return;
        }
        long v = x10.v();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (this.Q0 == null) {
            this.Q0 = new SpannableString("G");
            o5 o5Var = this.e;
            o5Var.getClass();
            k6 k6Var = new k6(o5Var);
            this.v0 = k6Var;
            SpannableString spannableString = this.Q0;
            spannableString.setSpan(k6Var, 0, spannableString.length(), 33);
        }
        spannableStringBuilder.append((CharSequence) this.Q0);
        spannableStringBuilder.append((CharSequence) " ");
        spannableStringBuilder.append((CharSequence) l6.e(v));
        spannableStringBuilder.append((CharSequence) " ");
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) cd.L0(2131749525, null));
        if (this.w0 == null) {
            r5 r5Var = new r5();
            r5Var.a = -9577217;
            this.w0 = r5Var;
        }
        spannableStringBuilder.setSpan(this.w0, length, spannableStringBuilder.length(), 33);
        this.t0.setText(spannableStringBuilder);
        CharSequence m10 = k0.x(this.currentAccount).m(v, false);
        if (TextUtils.isEmpty(m10)) {
            this.u0.setText(E0(1));
        } else {
            this.u0.setText(m10);
        }
        T0(this.x0);
        c0 c0Var = this.E0;
        if (c0Var != null && !c0Var.h && !c0Var.i && c0Var.k == null) {
            c0Var.e();
        }
        String t10 = x10.t();
        if (TextUtils.isEmpty(t10)) {
            return;
        }
        this.e.setCardNumber(u0(t10.toUpperCase()));
    }

    public final void R0() {
        float[] fArr;
        float[] fArr2;
        Rect rect = this.G;
        if (rect.isEmpty() || !this.D.isAttachedToWindow()) {
            return;
        }
        o5 o5Var = this.e;
        fg.i iVar = this.E;
        Matrix matrix = this.H;
        if (o5Var.g(iVar, matrix)) {
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
            fg.i iVar2 = this.E;
            int[] iArr = this.O;
            iVar2.getLocationInWindow(iArr);
            View view = this.D;
            int[] iArr2 = this.N;
            view.getLocationInWindow(iArr2);
            this.e.i(this.x0, this.y.getWidth() / 0.7826087f);
            float f11 = iArr2[0] - iArr[0];
            float x10 = org.telegram.ui.Cells.f1.x(height, 0.7826087f, 0.5f, iArr2[1] - iArr[1]);
            for (int i13 = 0; i13 < 4; i13++) {
                int i14 = i13 * 2;
                float T1 = org.telegram.messenger.i0.T1(fArr2[i14], (fArr[i14] * 0.7826087f) + f11, this.x0);
                float[] fArr3 = this.M;
                fArr3[i14] = T1;
                int i15 = i14 + 1;
                fArr3[i15] = org.telegram.messenger.i0.T1(fArr2[i15], (fArr[i15] * 0.7826087f) + x10, this.x0);
            }
            Matrix matrix2 = this.J;
            boolean polyToPoly = matrix2.setPolyToPoly(this.K, 0, this.M, 0, 4);
            Matrix matrix3 = this.I;
            if (polyToPoly && !matrix3.equals(matrix2)) {
                matrix3.set(matrix2);
                this.E.invalidate();
            }
            o5 o5Var2 = this.e;
            Matrix matrix4 = o5Var2.c;
            Matrix matrix5 = o5Var2.e;
            Matrix matrix6 = o5Var2.d;
            if (matrix.invert(matrix6)) {
                matrix5.setConcat(matrix6, matrix3);
                if (!o5Var2.n || !matrix4.equals(matrix5)) {
                    matrix4.set(matrix5);
                    o5Var2.n = true;
                    o5Var2.N.invalidate();
                }
            }
            float T12 = org.telegram.messenger.i0.T1(1.0f, 1.0952381f, this.x0);
            this.u0.setPivotX(0.0f);
            this.u0.setPivotY(0.0f);
            this.u0.setScaleX(T12);
            this.u0.setScaleY(T12);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v2 */
    public final void S0() {
        fg.i iVar;
        ?? r16;
        LinearLayout linearLayout;
        float min;
        float f7;
        if (this.a == null || this.e == null || this.s0 == null || this.D == null || (iVar = this.E) == null || this.actionBar == null) {
            return;
        }
        iVar.bringToFront();
        View m10 = this.a.e3.m(this.h);
        float i10 = m10 == null ? this.a.e3.L0() > this.h ? 1.0f : 0.0f : Utilities.i((this.a.getPaddingTop() - m10.getTop()) / m10.getHeight(), 1.0f, 0.0f);
        this.y0 = i10;
        float f10 = this.I0;
        boolean z10 = f10 > 0.0f || this.H0 > 0.0f;
        if (z10) {
            i10 = f10 > 0.0f ? 0.0f : (1.0f - this.H0) * i10;
        }
        this.x0 = i10;
        V0();
        float max = m10 != null ? Math.max(0.0f, (m10.getHeight() / 2.0f) + org.telegram.messenger.i0.L(24.0f)) * this.x0 : 0.0f;
        float T1 = org.telegram.messenger.i0.T1(1.0f, 0.8f, this.x0);
        this.e.setPivotX(r11.getWidth() * 0.5f);
        this.e.setPivotY(0.0f);
        this.e.setScaleX(T1);
        this.e.setScaleY(T1);
        this.e.setAlpha(1.0f - Utilities.l(org.telegram.messenger.i0.z1(i10, 0.75f, 1.0f)));
        this.e.setVisibility((z10 || (m10 != null && i10 < 1.0f && m10.getBottom() > this.a.getPaddingTop() && m10.getTop() < this.a.getHeight() - this.a.getPaddingBottom())) ? 0 : 4);
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
            float L = (org.telegram.messenger.i0.L(4.0f) + (this.actionBar.getHeight() + (iArr2[r16] - iArr[r16]))) - ((1.0f - f11) * (z11 ? 0.0f : this.e.getHeight() * 0.35f));
            if (z11) {
                L = a1.g.A(0.9f - f12, this.e.getHeight(), 2.0f, L);
            }
            float width = (this.n.getWidth() - this.e.getWidth()) / 2.0f;
            if (!z11) {
                f11 = Math.min(1.0f, f11 * 2.0f);
            }
            if (m10 != null) {
                this.a.getLocationInWindow(iArr2);
                float width2 = ((this.f.getWidth() - this.e.getWidth()) / 2.0f) + this.f.getX() + m10.getX() + (iArr2[0] - iArr[0]);
                float y3 = this.f.getY() + m10.getY() + (iArr2[r16] - iArr[r16]);
                float l4 = Utilities.l(1.0f - ((L - y3) / (this.e.getHeight() * 0.5f)));
                if (l4 >= 1.0f) {
                    org.telegram.messenger.i0.r(this.K0);
                    ValueAnimator valueAnimator = this.J0;
                    if (valueAnimator != null) {
                        this.J0 = null;
                        valueAnimator.cancel();
                    }
                    this.H0 = 0.0f;
                    this.I0 = 0.0f;
                    S0();
                    return;
                }
                width = org.telegram.messenger.i0.T1(width, width2, l4);
                L = org.telegram.messenger.i0.T1(L, y3, l4);
                f12 = org.telegram.messenger.i0.T1(f12, 1.0f, l4);
                f11 = org.telegram.messenger.i0.T1(f11, 1.0f, l4);
            }
            this.e.setPivotX(r1.getWidth() * 0.5f);
            this.e.setPivotY(0.0f);
            this.e.setScaleX(f12);
            this.e.setScaleY(f12);
            this.e.setTranslationX(width);
            this.e.setTranslationY(L);
            this.e.setAlpha(f11);
        }
        boolean z12 = i10 > 0.0f ? r16 : false;
        if (this.F != z12 && (linearLayout = this.s0) != null) {
            Rect rect = this.G;
            if (z12) {
                if (linearLayout.getWidth() != 0 && this.s0.getHeight() != 0) {
                    rect.set(this.s0.getLeft(), this.s0.getTop(), this.s0.getRight(), this.s0.getBottom());
                }
            }
            this.e.setOnFrontContentPresented(null);
            org.telegram.messenger.i0.E2(this.s0);
            this.F = z12;
            if (z12) {
                this.E.addView(this.s0, new FrameLayout.LayoutParams(rect.width(), rect.height(), 51));
                this.s0.layout(0, 0, rect.width(), rect.height());
                R0();
            } else {
                o5 o5Var = this.e;
                o5Var.i(0.0f, 0.0f);
                LinearLayout linearLayout2 = o5Var.M;
                org.telegram.messenger.i0.E2(linearLayout2);
                linearLayout2.setScaleX(1.0f);
                linearLayout2.setScaleY(1.0f);
                linearLayout2.setRotationX(0.0f);
                linearLayout2.setRotationY(0.0f);
                linearLayout2.setTranslationX(0.0f);
                linearLayout2.setTranslationY(0.0f);
                j6 j6Var = o5Var.O;
                j6Var.setScaleX(1.0f);
                j6Var.setScaleY(1.0f);
                o5Var.E.addView(linearLayout2, o5Var.P);
                this.s0.layout(rect.left, rect.top, rect.right, rect.bottom);
                this.e.getClass();
                R0();
            }
            this.E.invalidate();
        }
        T0(i10);
        if (this.F) {
            R0();
        }
        float f13 = 1.0f - i10;
        float f14 = (1.0f - f13) * (-org.telegram.messenger.i0.L(8.0f));
        if (this.actionBar.getTitleTextView() != null) {
            this.actionBar.getTitleTextView().setAlpha(f13);
            this.actionBar.getTitleTextView().setTranslationY(f14);
        }
        if (this.actionBar.getTitleTextView2() != null) {
            this.actionBar.getTitleTextView2().setAlpha(f13);
            this.actionBar.getTitleTextView2().setTranslationY(f14);
        }
    }

    public final void T0(float f7) {
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.t6.G6);
        this.t0.setTextColor(org.telegram.messenger.i0.d2(f7, -1, themedColor));
        org.telegram.ui.Components.f6 f6Var = this.u0;
        float[] fArr = this.e.a0;
        int i10 = -7868417;
        if (fArr != null) {
            i10 = i0.b.f(fArr[8], v7.p(-7868417, 0, fArr), v7.p(-7868417, 3, fArr));
        }
        f6Var.setTextColor(org.telegram.messenger.i0.d2(f7, i10, i0.b.o(themedColor, Math.round(142.8f))));
        k6 k6Var = this.v0;
        if (k6Var != null) {
            k6Var.y = org.telegram.messenger.i0.d2(f7, -1, getThemedColor(org.telegram.ui.ActionBar.t6.Ci));
        }
        r5 r5Var = this.w0;
        if (r5Var != null) {
            float[] fArr2 = this.e.a0;
            int i11 = -9577217;
            if (fArr2 != null) {
                i11 = i0.b.f(fArr2[8], v7.p(-9577217, 0, fArr2), v7.p(-9577217, 3, fArr2));
            }
            r5Var.a = i0.b.o(i11, Math.round((1.0f - f7) * 255.0f));
        }
        this.t0.invalidate();
    }

    public final void U0(float[] fArr) {
        if (this.B0 == null || this.C0 == null) {
            return;
        }
        float f7 = v7.j(getThemedColor(org.telegram.ui.ActionBar.t6.a7))[0];
        boolean z10 = f7 < 0.6f;
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.t6.Ci);
        if (fArr != null && fArr.length >= 18) {
            int[] iArr = new int[2];
            for (int i10 = 0; i10 < 2; i10++) {
                int i11 = i10 * 4;
                float f10 = fArr[i11 + 10];
                iArr[i10] = f10 < 0.0f ? themedColor : v7.n(themedColor, (int) f10, (int) fArr[i11 + 11]);
            }
            themedColor = i0.b.f(fArr[8], iArr[0], iArr[1]);
        }
        float f11 = z10 ? f7 + 0.25f : 0.0f;
        float f12 = z10 ? 1.0f : f7 - 0.2f;
        float[] j10 = v7.j(themedColor);
        float f13 = j10[0];
        if (f13 < f11 || f13 > f12) {
            themedColor = (themedColor & (-16777216)) | (v7.l(Math.max(f11, Math.min(f12, f13)), j10[1], j10[2]) & 16777215);
        }
        if (themedColor == this.N0) {
            return;
        }
        this.N0 = themedColor;
        int themedColor2 = i0.b.h(themedColor) <= 0.550000011920929d ? getThemedColor(org.telegram.ui.ActionBar.t6.Gi) : -16777216;
        vh.d[] dVarArr = {this.B0, this.C0};
        for (int i12 = 0; i12 < 2; i12++) {
            vh.d dVar = dVarArr[i12];
            dVar.setColor(themedColor);
            dVar.setTextColor(themedColor2);
        }
    }

    public final void V0() {
        ii iiVar = this.a;
        if (iiVar == null || this.e == null) {
            return;
        }
        float b10 = iiVar.D2.b(1);
        this.e.setAdditionalTilt(Math.max(0.0f, (this.x0 * 10.0f) + ((((float) Math.sqrt(Utilities.l(this.x0))) * 90.0f) - 10.0f)) + Math.min(10.0f, this.a.D2.b(3) * 40.0f) + (-Math.min(10.0f, b10 * 40.0f)));
        this.e.setUseGyroscope(1.0f - ((float) Math.pow(this.x0, 0.33000001311302185d)));
    }

    public final void W0(boolean z10) {
        boolean M0 = M0();
        ii iiVar = this.a;
        u51[] u51VarArr = this.r0;
        if (iiVar != null && this.o0 != M0) {
            this.o0 = M0;
            iiVar.C0();
            for (u51 u51Var : u51VarArr) {
                if (u51Var != null) {
                    u51Var.C0();
                }
            }
            this.a.f3.O(false);
            this.a.e3.h1(0, 0);
            this.a.post(new f4(this, 10));
        }
        if (M0) {
            return;
        }
        for (u51 u51Var2 : u51VarArr) {
            if (u51Var2 != null) {
                X0(u51Var2, z10);
            }
        }
        jg.z2 z2Var = this.n0;
        if (z2Var != null) {
            z2Var.post(new f4(this, 5));
            this.n0.post(new f4(this, 6));
        }
    }

    @Override // org.telegram.ui.Components.r51
    public final void Y(ArrayList arrayList, p51 p51Var) {
        k0 x10 = k0.x(this.currentAccount);
        Z0();
        arrayList.add(a51.m(this.R));
        this.h = arrayList.size();
        l5 l5Var = this.f;
        a51 a51Var = new a51(-4);
        a51Var.c = l5Var;
        a51Var.z = -1;
        a51Var.e = true;
        arrayList.add(a51Var);
        arrayList.add(a51.m(this.z0));
        boolean M0 = M0();
        this.o0 = M0;
        if (M0) {
            String L0 = cd.L0(2131743045, null);
            String L02 = cd.L0(2131743044, null);
            int i10 = s5.b;
            a51 K = a51.K(s5.class);
            K.k = R.drawable.wallet_learn_instant;
            K.l = L0;
            K.m = L02;
            arrayList.add(K);
            String L03 = cd.L0(2131743094, null);
            String L04 = cd.L0(2131743093, null);
            a51 K2 = a51.K(s5.class);
            K2.k = R.drawable.wallet_learn_fees;
            K2.l = L03;
            K2.m = L04;
            arrayList.add(K2);
            String L05 = cd.L0(2131743208, null);
            String L06 = cd.L0(2131743207, null);
            a51 K3 = a51.K(s5.class);
            K3.k = R.drawable.wallet_learn_verified;
            K3.l = L05;
            K3.m = L06;
            arrayList.add(K3);
            arrayList.add(a51.m(this.a0));
        } else if (this.n0 != null) {
            if (this.R0 && !this.S0 && x10.v() > 500000000) {
                arrayList.add(a51.k(this.c0));
            }
            jg.z2 z2Var = this.n0;
            a51 a51Var2 = new a51(-3);
            a51Var2.c = z2Var;
            a51Var2.z = 0;
            a51Var2.y = 1;
            arrayList.add(a51Var2);
        }
        p80 p80Var = this.Z;
        if (p80Var != null) {
            this.b0 = false;
            p80Var.animate().cancel();
            this.Z.setAlpha(0.0f);
            this.Z.setVisibility(4);
        }
    }

    public final void Y0() {
        y8 y8Var = this.i0;
        if (y8Var == null || this.p0 == null || y8Var.x == 0.0f) {
            return;
        }
        y8Var.x = 0.0f;
        y8Var.c.setVisibility(8);
        y8Var.invalidate();
    }

    @Override // org.telegram.ui.Components.r51
    public final CharSequence Z() {
        return cd.L0(2131743029, null);
    }

    public final void Z0() {
        if (this.S == null) {
            return;
        }
        k0 x10 = k0.x(this.currentAccount);
        boolean z10 = this.S.isAttachedToWindow() && this.S.isLaidOut();
        k5 k5Var = this.S;
        FrameLayout frameLayout = this.T;
        Boolean bool = x10.i;
        k5Var.i(frameLayout, (bool == null || !bool.booleanValue() || TextUtils.isEmpty(x10.j)) ? false : true, z10);
        ArrayList arrayList = x10.G;
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
            this.W.setText(w0(2131743088, j10));
        }
        this.S.i(this.V, z11, z10);
        long j12 = rh.e6.y(this.currentAccount, true).p().amount;
        boolean z12 = j12 > 500000000;
        if (z12) {
            this.Y.setText(w0(2131743126, j12));
        }
        this.S.i(this.X, z12, z10);
    }

    @Override // org.telegram.ui.Components.r51
    public final void a0(a51 a51Var, View view) {
        c0 c0Var;
        Object obj = a51Var.G;
        if (obj instanceof TL_wallet.nftItem) {
            G0((TL_wallet.nftItem) obj);
            return;
        }
        if (a51Var.d == -10001 && (c0Var = this.E0) != null) {
            c0Var.e();
        } else if (obj instanceof TL_wallet.walletTransaction) {
            F0(getParentActivity(), this.currentAccount, (TL_wallet.walletTransaction) a51Var.G, null, null, null, null, getResourceProvider());
        }
    }

    @Override // org.telegram.ui.Components.r51
    public final boolean b0(a51 a51Var, View view) {
        h8 h8Var;
        if (!(view instanceof u7) || (h8Var = this.j0) == null) {
            return false;
        }
        h8Var.S((u7) view);
        return true;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean canBeginSlide() {
        h8 h8Var = this.j0;
        return (h8Var == null || !h8Var.p0) && super.canBeginSlide();
    }

    @Override // org.telegram.ui.Components.r51, org.telegram.ui.ActionBar.k2
    public final View createView(Context context) {
        ValueAnimator valueAnimator = this.m0;
        if (valueAnimator != null) {
            this.m0 = null;
            valueAnimator.cancel();
        }
        O0();
        x5 x5Var = this.q0;
        if (x5Var != null) {
            x5Var.b(null);
        }
        this.f = null;
        this.S = null;
        this.R = null;
        this.n0 = null;
        this.p0 = null;
        u51[] u51VarArr = this.r0;
        final int i10 = 0;
        u51VarArr[0] = null;
        final int i11 = 1;
        u51VarArr[1] = null;
        c0 c0Var = this.E0;
        boolean z10 = (c0Var == null || c0Var.a.isEmpty()) ? false : true;
        this.f0 = z10;
        if (!z10) {
            this.e0 = 0;
        } else if (this.F0) {
            this.e0 = 1;
        }
        h8 h8Var = this.j0;
        if (h8Var != null) {
            h8Var.p();
        }
        this.j0 = null;
        View createView = super.createView(context);
        wb0 wb0Var = new wb0(this, context);
        wb0Var.addView(createView, w7.b6.c(-1.0f, -1));
        this.fragmentView = wb0Var;
        org.telegram.ui.ActionBar.l lVar = this.actionBar;
        int i12 = org.telegram.ui.ActionBar.t6.a7;
        org.telegram.ui.ActionBar.a7.i(i12, lVar, getResourceProvider());
        this.actionBar.setCastShadows(false);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setClipChildren(false);
        this.actionBar.setClipToPadding(false);
        org.telegram.ui.ActionBar.y p5 = this.actionBar.p();
        org.telegram.ui.ActionBar.t0 a2 = p5.a(2, R.drawable.scan_qr);
        this.L0 = a2;
        final int i13 = 3;
        a2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Wallet.h4
            public final /* synthetic */ b6 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i13) {
                    case 0:
                        b6 b6Var = this.b;
                        b6Var.getClass();
                        b6Var.presentFragment(new tc1(6, null));
                        break;
                    case 1:
                        b6.e0(this.b);
                        break;
                    case 2:
                        b6.h0(this.b);
                        break;
                    case 3:
                        this.b.J0();
                        break;
                    default:
                        b6.c0(this.b);
                        break;
                }
            }
        });
        p5.a(1, R.drawable.ic_ab_other).setOnClickListener(new rv0(15, this, context));
        org.telegram.ui.Components.voip.i0 i0Var = new org.telegram.ui.Components.voip.i0(this, context, i11);
        this.R = i0Var;
        i0Var.setClipToPadding(false);
        this.R.setClipChildren(false);
        this.R.setPadding(org.telegram.messenger.i0.L(16.0f), 0, org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(4.0f));
        k5 k5Var = new k5(this, context);
        this.S = k5Var;
        k5Var.setDefaultRadiusDp(22);
        this.S.setOnAnimatedHeightChangedListener(new f4(this, 12));
        TextView textView = new TextView(context);
        this.U = textView;
        textView.setText(cd.L0(2131742988, null));
        this.T = t0(this.U, new f4(this, i10));
        TextView textView2 = new TextView(context);
        this.W = textView2;
        this.V = t0(textView2, new f4(this, i11));
        TextView textView3 = new TextView(context);
        this.Y = textView3;
        this.X = t0(textView3, new f4(this, 2));
        this.R.addView(this.S, w7.b6.c(-2.0f, -1));
        p80 p80Var = new p80(context, null);
        this.Z = p80Var;
        this.b0 = false;
        p80Var.setAlpha(0.0f);
        p80 p80Var2 = this.Z;
        int i14 = org.telegram.ui.ActionBar.t6.z6;
        org.telegram.ui.ActionBar.a7.V(p80Var2, i14, this.resourceProvider);
        this.Z.setTextSize(1, 13.0f);
        this.Z.setGravity(17);
        this.Z.setText(P0(cd.L0(2131743032, null), org.telegram.ui.ActionBar.t6.Uc, this.resourceProvider, new g4(context, i10)));
        final int i15 = 4;
        this.Z.setVisibility(4);
        FrameLayout frameLayout = (FrameLayout) createView;
        if (frameLayout != null) {
            frameLayout.addView(this.Z, w7.b6.d(-1, -2.0f, 81, 12.0f, 0.0f, 12.0f, 24.0f));
        }
        l5 l5Var = new l5(this, context, i10);
        this.a0 = l5Var;
        l5Var.setImportantForAccessibility(2);
        this.c0 = new FrameLayout(context);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.d0 = frameLayout2;
        int i16 = org.telegram.ui.ActionBar.t6.d6;
        int themedColor = getThemedColor(i16);
        int themedColor2 = getThemedColor(i16);
        int i17 = org.telegram.ui.ActionBar.t6.i6;
        org.telegram.ui.Cells.y b02 = org.telegram.ui.ActionBar.t6.b0(themedColor, org.telegram.ui.ActionBar.t6.w(themedColor2, getThemedColor(i17)), 16, 16);
        org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i16);
        org.telegram.ui.ActionBar.w6 q6 = org.telegram.ui.ActionBar.a7.q(i16, i17);
        org.telegram.ui.ActionBar.p6 resourceProvider = getResourceProvider();
        frameLayout2.setBackground(b02);
        org.telegram.ui.ActionBar.a7.k(frameLayout2, b02, N, q6, resourceProvider);
        this.c0.addView(this.d0, w7.b6.d(-1, -2.0f, 55, 12.0f, 0.0f, 12.0f, 12.0f));
        ImageView imageView = new ImageView(context);
        float N2 = org.telegram.messenger.i0.N(10.0f);
        int i18 = 6;
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{N2, N2, N2, N2, N2, N2, N2, N2}, null, null));
        shapeDrawable.setShaderFactory(new m5());
        imageView.setBackground(shapeDrawable);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.wallet_protect);
        this.d0.addView(imageView, w7.b6.d(28, 28.0f, 19, 14.0f, 11.0f, 16.0f, 11.0f));
        TextView textView4 = new TextView(context);
        org.telegram.ui.ActionBar.a7.V(textView4, org.telegram.ui.ActionBar.t6.q7, this.resourceProvider);
        sc.e.u(textView4, 1, 16.0f, null, 2131743070);
        this.d0.addView(textView4, w7.b6.d(-1, -2.0f, 19, 58.0f, 0.0f, 32.0f, 0.0f));
        this.d0.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Wallet.h4
            public final /* synthetic */ b6 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        b6 b6Var = this.b;
                        b6Var.getClass();
                        b6Var.presentFragment(new tc1(6, null));
                        break;
                    case 1:
                        b6.e0(this.b);
                        break;
                    case 2:
                        b6.h0(this.b);
                        break;
                    case 3:
                        this.b.J0();
                        break;
                    default:
                        b6.c0(this.b);
                        break;
                }
            }
        });
        w7.e6.b(this.d0, 0.02f, 1.2f);
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.y = frameLayout3;
        frameLayout3.setClipChildren(false);
        this.y.setClipToPadding(false);
        this.actionBar.addView(this.y, w7.b6.d(-1, 56.0f, 87, 64.0f, 0.0f, 96.0f, 0.0f));
        View view = new View(context);
        this.D = view;
        this.y.addView(view, w7.b6.e(1, 1, 19));
        this.F = false;
        this.G.setEmpty();
        this.I.reset();
        fg.i iVar = new fg.i(this, context);
        this.E = iVar;
        iVar.setClipChildren(false);
        this.E.setClipToPadding(false);
        o5 o5Var = new o5(this, context);
        this.e = o5Var;
        o5Var.setDiamondOnCard(true);
        this.e.setCardOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Wallet.h4
            public final /* synthetic */ b6 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i11) {
                    case 0:
                        b6 b6Var = this.b;
                        b6Var.getClass();
                        b6Var.presentFragment(new tc1(6, null));
                        break;
                    case 1:
                        b6.e0(this.b);
                        break;
                    case 2:
                        b6.h0(this.b);
                        break;
                    case 3:
                        this.b.J0();
                        break;
                    default:
                        b6.c0(this.b);
                        break;
                }
            }
        });
        this.a.D2.b.add(this.x);
        l5 l5Var2 = new l5(this, context, i11);
        this.f = l5Var2;
        l5Var2.setImportantForAccessibility(2);
        p5 p5Var = new p5(this, context);
        this.n = p5Var;
        p5Var.setClipChildren(false);
        this.n.setClipToPadding(false);
        this.n.addView(this.e, w7.b6.c(-2.0f, -1));
        wb0Var.addView(this.n, w7.b6.c(-1.0f, -1));
        this.a.setClipChildren(false);
        this.a.setClipToPadding(false);
        this.s0 = this.e.getBalanceLayout();
        this.t0 = this.e.getBalanceView();
        this.u0 = this.e.getUsdBalanceView();
        this.e.setCardHolder(h20.p(getUserConfig().f()).toUpperCase());
        this.A0 = 0.0f;
        u71 u71Var = new u71(this, context, 19);
        this.z0 = u71Var;
        u71Var.setOrientation(0);
        this.z0.setPadding(org.telegram.messenger.i0.L(16.0f), 0, org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(12.0f));
        vh.d dVar = new vh.d(context, this.resourceProvider, true);
        dVar.setRoundRadius(24);
        this.B0 = dVar;
        dVar.setText(cd.L0(2131743230, null));
        this.z0.addView(this.B0, w7.b6.m(1.0f, 0, 48, 0, 4, 0));
        final int i19 = 2;
        this.B0.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Wallet.h4
            public final /* synthetic */ b6 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i19) {
                    case 0:
                        b6 b6Var = this.b;
                        b6Var.getClass();
                        b6Var.presentFragment(new tc1(6, null));
                        break;
                    case 1:
                        b6.e0(this.b);
                        break;
                    case 2:
                        b6.h0(this.b);
                        break;
                    case 3:
                        this.b.J0();
                        break;
                    default:
                        b6.c0(this.b);
                        break;
                }
            }
        });
        vh.d dVar2 = new vh.d(context, this.resourceProvider, true);
        dVar2.setRoundRadius(24);
        this.C0 = dVar2;
        dVar2.setText(cd.L0(2131743048, null));
        this.C0.setEnabled(k0.x(this.currentAccount).e());
        this.C0.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Wallet.h4
            public final /* synthetic */ b6 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i15) {
                    case 0:
                        b6 b6Var = this.b;
                        b6Var.getClass();
                        b6Var.presentFragment(new tc1(6, null));
                        break;
                    case 1:
                        b6.e0(this.b);
                        break;
                    case 2:
                        b6.h0(this.b);
                        break;
                    case 3:
                        this.b.J0();
                        break;
                    default:
                        b6.c0(this.b);
                        break;
                }
            }
        });
        this.z0.addView(this.C0, w7.b6.m(1.0f, 0, 48, 4, 0, 0));
        U0(this.e.getStickerStyle());
        this.D0 = k0.x(this.currentAccount).B();
        this.a.setDescendantFocusability(131072);
        h8 h8Var2 = new h8(this, this.e, new m4.c(20, this, wb0Var), null);
        this.j0 = h8Var2;
        wb0Var.addView(h8Var2, w7.b6.c(-1.0f, -1));
        this.k0 = "";
        int i20 = 9;
        jg.z2 z2Var = new jg.z2(context, i20);
        this.n0 = z2Var;
        z2Var.setOrientation(1);
        org.telegram.ui.ActionBar.a7.i(i12, this.n0, getResourceProvider());
        hk hkVar = new hk(this, context, this.resourceProvider, i18);
        this.p0 = hkVar;
        hkVar.setAllowDisallowInterceptTouch(false);
        this.p0.setAdapter(new mg.s(this, context, 8));
        v71 n10 = this.p0.n(-2, true);
        this.g0 = n10;
        n10.g(i14, org.telegram.ui.ActionBar.t6.G6, i14, i17, i16);
        org.telegram.ui.ActionBar.a7.C(this.g0, org.telegram.ui.ActionBar.t6.d0(org.telegram.messenger.i0.L(20.0f), getThemedColor(i16)), org.telegram.ui.ActionBar.a7.N(i16), getResourceProvider());
        this.h0 = new FrameLayout(context);
        y8 y8Var = new y8(context, this.g0, this.resourceProvider, new m4(this, 0), new m4(this, i11), new m4(this, 2));
        this.i0 = y8Var;
        this.h0.addView(y8Var, w7.b6.d(-1, 40.0f, 48, 16.0f, 0.0f, 16.0f, 0.0f));
        this.p0.setPosition(this.e0);
        Y0();
        this.n0.addView(this.h0, w7.b6.k(0.0f, 0.0f, 0.0f, -6.0f, -1, 52));
        this.n0.addView(this.p0, w7.b6.l(1.0f, -1, 0));
        K0(this.f0);
        c0 c0Var2 = this.E0;
        if (c0Var2 != null) {
            this.j0.Y(c0Var2);
        }
        this.a.j(new bu0(this, i18));
        p51 p51Var = this.a.f3;
        p51Var.r = false;
        p51Var.O(false);
        x5 x5Var2 = new x5(this);
        this.q0 = x5Var2;
        x5Var2.b(this.a);
        Q0();
        this.D0.h();
        this.actionBar.post(new f4(this, i20));
        this.a.post(new f4(this, 10));
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.us
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        ii iiVar;
        p51 p51Var;
        if (i11 != this.currentAccount) {
            return;
        }
        if (i10 == zs.a4 && this.t0 != null) {
            Q0();
            Iterator it = this.P0.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
            return;
        }
        if (i10 == zs.y3) {
            Z0();
            return;
        }
        if (i10 == zs.q0) {
            if (objArr.length > 0) {
                Object obj = objArr[0];
                if (obj instanceof TL_account.Password) {
                    this.R0 = true;
                    this.S0 = ((TL_account.Password) obj).has_password;
                    ii iiVar2 = this.a;
                    if (iiVar2 == null || (p51Var = iiVar2.f3) == null) {
                        return;
                    }
                    p51Var.O(true);
                    return;
                }
            }
            getConnectionsManager().sendRequestTyped(new TL_account.getPassword(), new a3.b(1), new d(this, 7));
            return;
        }
        if (i10 != zs.b4 || objArr.length <= 0) {
            return;
        }
        Object obj2 = objArr[0];
        j0 j0Var = this.D0;
        if (obj2 != j0Var || (iiVar = this.a) == null || iiVar.f3 == null) {
            return;
        }
        if (j0Var.b.isEmpty()) {
            j0 j0Var2 = this.D0;
            if (!j0Var2.h) {
                j0Var2.h();
            }
        }
        W0(true);
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean onBackPressed(boolean z10) {
        qh.y yVar = this.M0;
        if (yVar != null) {
            if (z10) {
                yVar.e();
            }
            return false;
        }
        y8 y8Var = this.i0;
        if (y8Var == null || !y8Var.y) {
            return super.onBackPressed(z10);
        }
        if (z10) {
            y8Var.b(false);
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onBeginSlide() {
        x5 x5Var = this.q0;
        if (x5Var != null) {
            x5Var.c();
        }
        ii iiVar = this.a;
        if (iiVar != null) {
            iiVar.C0();
        }
        u51 x02 = x0();
        if (x02 != null) {
            x02.C0();
        }
        super.onBeginSlide();
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean onFragmentCreate() {
        Context context = org.telegram.messenger.w0.b;
        if (c6.k0.compareAndSet(false, true)) {
            c6.l0.postRunnable(new g4(context, 2));
        }
        getNotificationCenter().c(this, zs.a4);
        getNotificationCenter().c(this, zs.y3);
        getNotificationCenter().c(this, zs.b4);
        getNotificationCenter().c(this, zs.q0);
        k0 x10 = k0.x(this.currentAccount);
        if (x10.o == null) {
            x10.o = new c0(x10);
        }
        c0 c0Var = x10.o;
        this.E0 = c0Var;
        f4 f4Var = this.G0;
        ArrayList arrayList = c0Var.d;
        if (!arrayList.contains(f4Var)) {
            arrayList.add(f4Var);
        }
        qq qqVar = this.T0;
        if (qqVar != null) {
            qqVar.run();
        }
        int i10 = x10.D;
        x10.D = i10 + 1;
        HashSet hashSet = x10.E;
        boolean isEmpty = hashSet.isEmpty();
        hashSet.add(Integer.valueOf(i10));
        if (isEmpty) {
            x10.S();
        }
        this.T0 = new qq(x10, i10, 23);
        getConnectionsManager().sendRequestTyped(new TL_account.getPassword(), new a3.b(1), new d(this, 7));
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onFragmentDestroy() {
        qh.y yVar = this.M0;
        if (yVar != null) {
            yVar.g();
            org.telegram.messenger.i0.E2(this.M0);
            this.M0 = null;
        }
        org.telegram.messenger.i0.r(this.K0);
        ValueAnimator valueAnimator = this.J0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        h8 h8Var = this.j0;
        if (h8Var != null) {
            h8Var.p();
        }
        o5 o5Var = this.e;
        if (o5Var != null) {
            o5Var.setOnFrontContentPresented(null);
        }
        ValueAnimator valueAnimator2 = this.m0;
        if (valueAnimator2 != null) {
            this.m0 = null;
            valueAnimator2.cancel();
        }
        c0 c0Var = this.E0;
        if (c0Var != null) {
            c0Var.d.remove(this.G0);
        }
        O0();
        x5 x5Var = this.q0;
        if (x5Var != null) {
            x5Var.b(null);
        }
        getNotificationCenter().n(this, zs.a4);
        getNotificationCenter().n(this, zs.y3);
        getNotificationCenter().n(this, zs.b4);
        getNotificationCenter().n(this, zs.q0);
        org.telegram.messenger.i0.E2(this.E);
        j0 j0Var = this.D0;
        if (j0Var != null) {
            j0Var.a();
        }
        super.onFragmentDestroy();
        qq qqVar = this.T0;
        if (qqVar != null) {
            qqVar.run();
            this.T0 = null;
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.a.setPadding(0, 0, 0, i13);
        this.a.setClipToPadding(false);
        p80 p80Var = this.Z;
        if (p80Var != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) p80Var.getLayoutParams();
            layoutParams.bottomMargin = org.telegram.messenger.i0.L(24.0f) + i13;
            this.Z.setLayoutParams(layoutParams);
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onPause() {
        super.onPause();
        qh.y yVar = this.M0;
        if (yVar != null) {
            yVar.g();
            org.telegram.messenger.i0.E2(this.M0);
            this.M0 = null;
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onRequestPermissionsResultFragment(int i10, String[] strArr, int[] iArr) {
        if (i10 != 44 || getParentActivity() == null) {
            return;
        }
        if (iArr.length > 0 && iArr[0] == 0) {
            J0();
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        alertDialog$Builder.a.T = org.telegram.messenger.i0.W2(cd.L0(2131746518, null));
        alertDialog$Builder.k(cd.L0(2131747316, null), new i4(this));
        alertDialog$Builder.h(cd.L0(2131751772, null), null);
        int i11 = org.telegram.ui.ActionBar.t6.L5;
        alertDialog$Builder.m(R.raw.permission_request_camera, 72, org.telegram.ui.ActionBar.t6.x0(null, i11, false), null);
        alertDialog$Builder.n(i11, null);
        alertDialog$Builder.p();
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onResume() {
        super.onResume();
        org.telegram.ui.ActionBar.l lVar = this.actionBar;
        if (lVar != null) {
            lVar.post(new f4(this, 9));
        }
        k0.x(this.currentAccount).E();
        if (this.E0 != null && k0.x(this.currentAccount).G()) {
            c0 c0Var = this.E0;
            if (!c0Var.j) {
                c0Var.b();
                c0Var.f(true);
            }
        }
        Q0();
        if (this.a != null) {
            W0(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onThemeColorsChanged() {
        super.onThemeColorsChanged();
        try {
            if (this.t0 != null && this.u0 != null && this.e != null) {
                T0(this.x0);
            }
            o5 o5Var = this.e;
            if (o5Var != null && this.B0 != null && this.C0 != null) {
                U0(o5Var.getStickerStyle());
            }
            p80 p80Var = this.Z;
            if (p80Var != null) {
                p80Var.invalidate();
            }
            TextView textView = this.W;
            if (textView != null) {
                textView.invalidate();
            }
            TextView textView2 = this.Y;
            if (textView2 != null) {
                textView2.invalidate();
            }
            k5 k5Var = this.S;
            if (k5Var != null) {
                k5Var.invalidate();
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    public final void r0(boolean z10) {
        org.telegram.messenger.i0.r(this.K0);
        float f7 = z10 ? 1.0f : 0.0f;
        if (this.I0 == f7) {
            return;
        }
        this.I0 = f7;
        ValueAnimator valueAnimator = this.J0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        S0();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.H0, f7);
        this.J0 = ofFloat;
        ofFloat.setDuration(z10 ? 260L : 120L);
        this.J0.setInterpolator(z10 ? new gr(0.05d, 0.7d, 0.1d, 1.0d) : new gr(0.4d, 0.0d, 0.2d, 1.0d));
        this.J0.addUpdateListener(new l4(this, 1));
        this.J0.addListener(new ns0(this, 17));
        this.J0.start();
    }

    public final FrameLayout t0(TextView textView, Runnable runnable) {
        Context context = textView.getContext();
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setPadding(org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(14.0f), org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(14.0f));
        int i10 = org.telegram.ui.ActionBar.t6.i6;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.t6.h0(getThemedColor(i10), 2, -1);
        org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i10);
        org.telegram.ui.ActionBar.p6 resourceProvider = getResourceProvider();
        frameLayout.setBackground(h02);
        org.telegram.ui.ActionBar.a7.k(frameLayout, h02, null, N, resourceProvider);
        org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.G6, getResourceProvider());
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(org.telegram.messenger.i0.o());
        textView.setGravity(19);
        frameLayout.addView(textView, w7.b6.d(-1, -2.0f, 3, 0.0f, 0.0f, 42.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(R.drawable.attach_arrow_right);
        org.telegram.ui.ActionBar.a7.t(imageView, org.telegram.ui.ActionBar.t6.z6, getResourceProvider(), PorterDuff.Mode.SRC_IN);
        frameLayout.addView(imageView, w7.b6.e(-2, -2, 21));
        frameLayout.setOnClickListener(new i3(runnable, 3));
        textView.setDuplicateParentStateEnabled(true);
        w7.e6.b(textView, 0.02f, 1.2f);
        this.S.addView(frameLayout, w7.b6.o(-1, -2));
        return frameLayout;
    }

    public final CharSequence w0(int i10, long j10) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((char) 65532);
        dq dqVar = new dq(R.drawable.mini_gram_16, 0);
        dqVar.d = false;
        spannableStringBuilder.setSpan(dqVar, length, spannableStringBuilder.length(), 33);
        spannableStringBuilder.append((CharSequence) " ");
        int length2 = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) k0.o(j10, false));
        spannableStringBuilder.setSpan(new l00(org.telegram.ui.ActionBar.t6.Ci, getResourceProvider()), length2, spannableStringBuilder.length(), 33);
        return cd.V(null, null, i10, spannableStringBuilder);
    }

    public final u51 x0() {
        if (y0()) {
            hk hkVar = this.p0;
            View currentView = hkVar == null ? null : hkVar.getCurrentView();
            if (currentView instanceof u51) {
                return (u51) currentView;
            }
        }
        return null;
    }

    public final boolean y0() {
        jg.z2 z2Var;
        if (this.o0 || (z2Var = this.n0) == null || !z2Var.isAttachedToWindow()) {
            return false;
        }
        ViewParent parent = this.n0.getParent();
        ii iiVar = this.a;
        return parent == iiVar.e3.m(iiVar.f3.D.size() - 1);
    }

    public final boolean z0() {
        View m10;
        ii iiVar = this.a;
        return iiVar != null && (m10 = iiVar.e3.m(this.h)) != null && this.y0 < 0.5f && m10.getBottom() > this.a.getPaddingTop();
    }
}
