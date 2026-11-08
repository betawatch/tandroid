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
import bi.jb;
import bi.lb;
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
import org.telegram.messenger.ee;
import org.telegram.messenger.hc;
import org.telegram.messenger.id;
import org.telegram.messenger.ls;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.messenger.t10;
import org.telegram.messenger.v10;
import org.telegram.messenger.x10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.b80;
import org.telegram.ui.Components.et;
import org.telegram.ui.Components.k60;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.ms;
import org.telegram.ui.Components.mz;
import org.telegram.ui.Components.n41;
import org.telegram.ui.Components.q41;
import org.telegram.ui.Components.tx0;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.ui;
import org.telegram.ui.Components.uy0;
import org.telegram.ui.Components.v41;
import org.telegram.ui.Components.v61;
import org.telegram.ui.Components.vy0;
import org.telegram.ui.Components.w70;
import org.telegram.ui.Components.wp;
import org.telegram.ui.Components.x31;
import org.telegram.ui.Components.xq;
import org.telegram.ui.Components.yz;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PasscodeActivity;
import org.telegram.ui.c61;
import org.telegram.ui.fk0;
import org.telegram.ui.gq0;
import org.telegram.ui.oa0;
import org.telegram.ui.p90;
import org.telegram.ui.s81;
import org.telegram.ui.za1;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes4.dex */
public final class x5 extends n41 implements ls {
    public static Typeface U0;
    public float A0;
    public fi.d B0;
    public fi.d C0;
    public View D;
    public l0 D0;
    public bi.x5 E;
    public e0 E0;
    public boolean F;
    public boolean F0;
    public float H0;
    public float I0;
    public ValueAnimator J0;
    public org.telegram.ui.ActionBar.r0 L0;
    public ai.i0 M0;
    public int N0;
    public SpannableString Q0;
    public v41 R;
    public boolean R0;
    public h5 S;
    public boolean S0;
    public FrameLayout T;
    public org.telegram.ui.Components.r2 T0;
    public TextView U;
    public FrameLayout V;
    public TextView W;
    public FrameLayout X;
    public TextView Y;
    public w70 Z;
    public i5 a0;
    public boolean b0;
    public FrameLayout c0;
    public FrameLayout d0;
    public l5 e;
    public i5 f;
    public boolean f0;
    public u61 g0;
    public int h;
    public FrameLayout h0;
    public s8 i0;
    public b8 j0;
    public float l0;
    public ValueAnimator m0;
    public m5 n;
    public bi.t n0;
    public boolean o0;
    public fi.g1 p0;
    public t5 q0;
    public int r;
    public boolean s;
    public LinearLayout s0;
    public org.telegram.ui.Components.j6 t0;
    public org.telegram.ui.Components.j6 u0;
    public f6 v0;
    public o5 w0;
    public float x0;
    public FrameLayout y;
    public float y0;
    public c61 z0;
    public final et w = new et(this, 24);
    public final i4 x = new ms() { // from class: org.telegram.ui.Wallet.i4
        @Override // org.telegram.ui.Components.ms
        public final void a(int i7, boolean z9) {
            fi.w3 w3Var;
            x5 x5Var = x5.this;
            et etVar = x5Var.w;
            if ((i7 == 1 || i7 == 3) && (w3Var = x5Var.a) != null) {
                x5Var.s = z9;
                w3Var.removeCallbacks(etVar);
                etVar.run();
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
    public final q41[] r0 = new q41[2];
    public final e4 G0 = new e4(this, 3);
    public final e4 K0 = new e4(this, 4);
    public final CharSequence[] O0 = new CharSequence[2];
    public final HashSet P0 = new HashSet();

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
    /* JADX WARN: Type inference failed for: r4v3, types: [org.telegram.ui.Components.v61, org.telegram.ui.Wallet.x4] */
    public static void G0(Context context, int i7, TL_wallet.walletTransaction wallettransaction, x10 x10Var, v10 v10Var, byte[] bArr, org.telegram.ui.Cells.m0 m0Var, org.telegram.ui.ActionBar.f6 f6Var) {
        z2[] z2VarArr;
        View[] viewArr;
        v10 v10Var2;
        LinearLayout t02;
        TL_wallet.nftItem nftitem;
        if (context == null) {
            return;
        }
        if ((wallettransaction.peer instanceof TL_wallet.walletTransactionPeerTelegramGift) && (nftitem = wallettransaction.nft) != null) {
            TL_stars.StarGift starGift = nftitem.gift;
            if (starGift instanceof TL_stars.TL_starGiftUnique) {
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) starGift;
                bi.k7 k7Var = new bi.k7(context, i7, 0L, f6Var, null);
                k7Var.a3 = wallettransaction;
                k7Var.h2(tL_starGiftUnique.slug, tL_starGiftUnique, null);
                k7Var.show();
                return;
            }
        }
        z2[] z2VarArr2 = new z2[1];
        View[] viewArr2 = new View[1];
        l0 B = m0.x(i7).B();
        ArrayList arrayList = new ArrayList(B.c);
        int i10 = 0;
        while (true) {
            if (i10 >= arrayList.size()) {
                i10 = -1;
                break;
            } else if (arrayList.get(i10) == wallettransaction || m0.i0(wallettransaction, (TL_wallet.walletTransaction) arrayList.get(i10))) {
                break;
            } else {
                i10++;
            }
        }
        if (x10Var == null && m0Var == null && i10 >= 0) {
            Rect rect = new Rect();
            context.getResources().getDrawable(R.drawable.sheet_shadow_round).getPadding(rect);
            viewArr = viewArr2;
            ?? x4Var = new x4(context, f6Var, arrayList, B, i7, rect, viewArr);
            x4Var.setPosition(i10);
            z2VarArr = z2VarArr2;
            x4Var.setAdapter(new y4(arrayList, context, f6Var, rect, i7, z2VarArr2));
            v10Var2 = v10Var;
            t02 = x4Var;
        } else {
            z2VarArr = z2VarArr2;
            viewArr = viewArr2;
            v10Var2 = v10Var;
            t02 = t0(context, i7, wallettransaction, x10Var, v10Var, bArr, m0Var, f6Var, z2VarArr, false);
        }
        z2[] z2VarArr3 = z2VarArr;
        z4 z4Var = new z4(context, t02, f6Var, t02, viewArr, context);
        z2VarArr3[0] = z4Var;
        if ((t02 instanceof v61) && v10Var2 != null) {
            z4Var.n(new n(9, v10Var2, wallettransaction));
        }
        z2VarArr3[0].A0(x10Var != null);
        z2 z2Var = z2VarArr3[0];
        z2Var.T0 = false;
        z2Var.show();
    }

    public static void I0(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        int i7 = 1;
        org.telegram.ui.ActionBar.v2 l10 = org.telegram.messenger.k5.l(1, context, f6Var, false);
        FrameLayout frameLayout = new FrameLayout(context);
        int L = org.telegram.messenger.g0.L(16.0f);
        int i10 = org.telegram.ui.ActionBar.k6.h5;
        Drawable d02 = org.telegram.ui.ActionBar.k6.d0(L, org.telegram.ui.ActionBar.k6.w0(i10, f6Var));
        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i10);
        frameLayout.setBackground(d02);
        org.telegram.ui.ActionBar.r6.k(frameLayout, d02, N, null, f6Var);
        frameLayout.setPadding(org.telegram.messenger.g0.L(36.0f), 0, org.telegram.messenger.g0.L(36.0f), org.telegram.messenger.g0.L(14.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(1);
        frameLayout.addView(linearLayout, c8.ha.c(-2.0f, -1));
        linearLayout.addView(new v6(qs.q2, context, false), c8.ha.t(qs.q2, qs.q2, 1, 0, -12, 0, -8));
        TextView textView = new TextView(context);
        textView.setText(id.M0(2131743100, null));
        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.j5, f6Var);
        textView.setTextSize(1, 17.0f);
        textView.setTypeface(org.telegram.messenger.g0.o1("fonts/rmedium.ttf"));
        textView.setGravity(17);
        TextView f10 = org.telegram.messenger.camera.q.f(linearLayout, textView, c8.ha.t(-1, -2, 1, 0, 0, 0, 6), context);
        f10.setText(id.M0(2131743099, null));
        int i11 = org.telegram.ui.ActionBar.k6.z6;
        org.telegram.ui.ActionBar.r6.V(f10, i11, f6Var);
        f10.setTextSize(1, 14.0f);
        f10.setGravity(17);
        f10.setLineSpacing(org.telegram.messenger.g0.L(1.0f), 1.0f);
        linearLayout.addView(f10, c8.ha.t(-1, -2, 1, 0, 0, 0, 24));
        q5 q5Var = new q5(context, f6Var);
        q5Var.setPadding(org.telegram.messenger.g0.L(0.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(0.0f), org.telegram.messenger.g0.L(8.0f));
        q5Var.a(R.drawable.wallet_learn_instant, id.M0(2131743022, null), id.M0(2131743021, null));
        linearLayout.addView(q5Var, c8.ha.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
        q5 q5Var2 = new q5(context, f6Var);
        q5Var2.setPadding(org.telegram.messenger.g0.L(0.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(0.0f), org.telegram.messenger.g0.L(8.0f));
        q5Var2.a(R.drawable.wallet_learn_fees, id.M0(2131743071, null), id.M0(2131743070, null));
        linearLayout.addView(q5Var2, c8.ha.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
        q5 q5Var3 = new q5(context, f6Var);
        q5Var3.setPadding(org.telegram.messenger.g0.L(0.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(0.0f), org.telegram.messenger.g0.L(8.0f));
        q5Var3.a(R.drawable.wallet_learn_verified, id.M0(2131743185, null), id.M0(2131743184, null));
        linearLayout.addView(q5Var3, c8.ha.k(0.0f, 0.0f, 0.0f, 14.0f, -1, -2));
        fi.d h = org.telegram.messenger.k5.h(24, context, f6Var, true);
        h.setText(id.M0(2131743104, null));
        linearLayout.addView(h, c8.ha.t(-1, 48, 1, 0, 0, 0, 0));
        c8.ka.b(h, 0.02f, 1.1f);
        w70 w70Var = new w70(context, null);
        org.telegram.ui.ActionBar.r6.V(w70Var, i11, f6Var);
        w70Var.setTextSize(1, 13.0f);
        w70Var.setGravity(17);
        w70Var.setText(Q0(id.M0(2131743009, null), org.telegram.ui.ActionBar.k6.Uc, f6Var, new f4(context, i7)));
        linearLayout.addView(w70Var, c8.ha.k(0.0f, 12.0f, 0.0f, 6.0f, -1, -2));
        l10.N = frameLayout;
        org.telegram.ui.ActionBar.v2[] v2VarArr = {l10};
        v2VarArr[0].u0(true);
        v2VarArr[0].N();
        h.setOnClickListener(new m4(v2VarArr, i7));
        v2VarArr[0].show();
    }

    public static void J0(int i7, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        m0 x10 = m0.x(i7);
        if (x10.G()) {
            String t6 = x10.t();
            if (TextUtils.isEmpty(t6)) {
                return;
            }
            org.telegram.ui.ActionBar.v2 v2Var = new org.telegram.ui.ActionBar.v2(1, context, f6Var, false);
            v2Var.v0(-12207881);
            v2Var.O(-12207881);
            FrameLayout frameLayout = new FrameLayout(context);
            frameLayout.setBackground(new w5());
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            linearLayout.setGravity(1);
            frameLayout.addView(linearLayout, c8.ha.f(-2.0f, -1, 55, org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(30.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f) + org.telegram.messenger.g0.n));
            v5 v5Var = new v5(context, t6);
            linearLayout.addView(v5Var, c8.ha.r(qs.L4, qs.Z4, 1));
            TextView textView = new TextView(context);
            textView.setText(id.M0(2131743044, null));
            textView.setTextColor(-1);
            textView.setTextSize(1, 14.0f);
            textView.setGravity(17);
            textView.setLineSpacing(org.telegram.messenger.g0.L(1.0f), 1.0f);
            linearLayout.addView(textView, c8.ha.t(-1, -2, 1, 24, 0, 24, 20));
            fi.d dVar = new fi.d(context, null, true);
            dVar.setRoundRadius(24);
            dVar.setColor(-1);
            dVar.setTextColor(-15556886);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) "$");
            spannableStringBuilder.setSpan(new wp(R.drawable.wallet_buy, 0), 0, spannableStringBuilder.length(), 33);
            spannableStringBuilder.append((CharSequence) " ").append((CharSequence) id.M0(2131743183, null));
            dVar.setText(spannableStringBuilder);
            linearLayout.addView(dVar, c8.ha.t(-1, 48, 1, 0, 0, 0, 0));
            ImageView imageView = new ImageView(context);
            imageView.setImageResource(R.drawable.ic_close_white);
            imageView.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f));
            imageView.setContentDescription(id.M0(2131752041, null));
            c8.ka.a(imageView);
            frameLayout.addView(imageView, c8.ha.d(48, 48.0f, 51, 4.0f, 2.0f, 0.0f, 0.0f));
            v2Var.N = frameLayout;
            v2Var.x = true;
            v2Var.u0 = false;
            v2Var.v0 = false;
            v2Var.O(-12207881);
            imageView.setOnClickListener(new d4(v2Var, 0));
            v5Var.e = new r0(t6, 1);
            v2Var.show();
            v2Var.E0(-12207881);
            org.telegram.messenger.g0.u3(v2Var, -12207881, false, null);
            org.telegram.messenger.g0.n3(v2Var, false);
            if (Build.VERSION.SDK_INT >= 29 && v2Var.getWindow() != null) {
                v2Var.getWindow().setNavigationBarContrastEnforced(false);
            }
            dVar.setOnClickListener(new di.t5(dVar, i7, v2Var, f6Var, 7));
        }
    }

    public static SpannableStringBuilder Q0(String str, int i7, org.telegram.ui.ActionBar.f6 f6Var, Runnable runnable) {
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
            spannableStringBuilder.setSpan(new hi.k3(i7, f6Var, runnable), indexOf, i10 + indexOf, 0);
        }
        return spannableStringBuilder;
    }

    public static void Y0(q41 q41Var, boolean z9) {
        boolean canScrollVertically = q41Var.canScrollVertically(-1);
        q41Var.f3.O(z9);
        q41Var.a0();
        if (canScrollVertically) {
            return;
        }
        q41Var.e3.h1(0, 0);
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

    public static void d0(x5 x5Var) {
        m0 x10 = m0.x(x5Var.currentAccount);
        fi.d dVar = x5Var.C0;
        if (dVar.Q) {
            return;
        }
        dVar.setLoading(true);
        boolean z9 = false;
        x10.m0(new h2.o0(x10, new t(8, x5Var, x10), z9, z9, 4));
    }

    public static void e0(x5 x5Var) {
        vf.c.t(x5Var.getParentActivity(), m0.x(x5Var.currentAccount).j);
    }

    public static void f0(x5 x5Var) {
        J0(x5Var.currentAccount, x5Var.getParentActivity(), x5Var.getResourceProvider());
    }

    public static void g0(x5 x5Var, String str, m0 m0Var, k60 k60Var, LinearLayout linearLayout, TL_wallet.currencyRate currencyrate) {
        if (currencyrate == null) {
            return;
        }
        org.telegram.ui.ActionBar.z0 z0Var = new org.telegram.ui.ActionBar.z0(2, x5Var.getParentActivity(), x5Var.resourceProvider, false, false);
        z0Var.setPadding(org.telegram.messenger.g0.L(18.0f), 0, org.telegram.messenger.g0.L(18.0f), 0);
        z0Var.setText(currencyrate.currency);
        z0Var.setSubtext(!TextUtils.isEmpty(currencyrate.translatedTitle) ? currencyrate.translatedTitle : currencyrate.title);
        boolean equals = TextUtils.equals(str, currencyrate.currency);
        z0Var.b.setPadding(0, 0, org.telegram.messenger.g0.L(equals ? 42.0f : 0.0f), 0);
        z0Var.setChecked(equals);
        z0Var.setOnClickListener(new j1(m0Var, currencyrate, k60Var, 2));
        linearLayout.addView(z0Var, c8.ha.o(qs.e3, -2));
    }

    public static void h0(x5 x5Var) {
        org.telegram.ui.ActionBar.k kVar;
        if (x5Var.E == null || (kVar = x5Var.actionBar) == null || !(kVar.getParent() instanceof ViewGroup)) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) x5Var.actionBar.getParent();
        viewGroup.setClipChildren(false);
        viewGroup.setClipToPadding(false);
        if (x5Var.E.getParent() != x5Var.actionBar) {
            org.telegram.messenger.g0.E2(x5Var.E);
            x5Var.actionBar.addView(x5Var.E, c8.ha.c(-1.0f, -1));
        }
        x5Var.E.bringToFront();
        x5Var.actionBar.bringToFront();
        x5Var.E.post(new e4(x5Var, 10));
    }

    public static void i0(x5 x5Var) {
        J0(x5Var.currentAccount, x5Var.getParentActivity(), x5Var.getResourceProvider());
    }

    public static void j0(x5 x5Var, String str) {
        Uri b12 = b1(str);
        String c12 = c1(b12);
        if (c12 != null) {
            int i7 = x5Var.currentAccount;
            qp.s1(i7).d2().a(c12, null, new fi.t3(new l4(x5Var, 4), i7));
        } else {
            if ((x5Var.getParentActivity() instanceof LaunchActivity) && new p90((LaunchActivity) x5Var.getParentActivity(), x5Var.currentAccount, null, false).g(b12)) {
                return;
            }
            org.telegram.messenger.g0.h3(new e4(x5Var, 11));
        }
    }

    public static void k0(x5 x5Var, LinearLayout linearLayout, m0 m0Var, k60 k60Var) {
        TL_wallet.currencyRate currencyrate;
        x5 x5Var2;
        ArrayList<TL_wallet.currencyRate> arrayList;
        LinearLayout linearLayout2 = linearLayout;
        m0 m0Var2 = m0Var;
        linearLayout2.removeAllViews();
        String g10 = m0Var2.h.g();
        TL_wallet.currencyRates f10 = m0Var2.h.f();
        if (f10 == null) {
            for (int i7 = 0; i7 < 3; i7++) {
                mz mzVar = new mz(x5Var.getParentActivity(), x5Var.getResourceProvider());
                mzVar.setIsSingleCell(true);
                mzVar.setViewType(31);
                linearLayout2.addView(mzVar, c8.ha.o(qs.e3, -2));
            }
            return;
        }
        f fVar = m0Var2.h;
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
            f.a(linkedHashSet, ((org.telegram.messenger.n0) qp.s1(fVar.a).x7.O.b).c);
            f.c(linkedHashSet, id.E0().y);
            f.c(linkedHashSet, id.E0().z);
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
                g0(x5Var, g10, m0Var2, k60Var, linearLayout2, currencyrate7);
            }
            i12++;
            m0Var2 = m0Var;
        }
        if (hashSet.isEmpty() || f10.rates.isEmpty()) {
            x5Var2 = x5Var;
        } else {
            x5Var2 = x5Var;
            linearLayout2.addView(new org.telegram.ui.ActionBar.d1(x5Var.getParentActivity(), x5Var2.resourceProvider), c8.ha.o(-1, 8));
        }
        int i13 = 0;
        while (i13 < f10.rates.size()) {
            TL_wallet.currencyRate currencyrate8 = f10.rates.get(i13);
            if (currencyrate8 != null && !hashSet.contains(currencyrate8.currency)) {
                g0(x5Var2, g10, m0Var, k60Var, linearLayout2, currencyrate8);
            }
            i13++;
            x5Var2 = x5Var;
            linearLayout2 = linearLayout;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void l0(final x5 x5Var, Context context, View view) {
        m0 x10 = m0.x(x5Var.currentAccount);
        final k60 I = k60.I(x5Var, view);
        I.a0(0.0f, -org.telegram.messenger.g0.L(48.0f));
        final int i7 = 0;
        I.s = 0;
        I.V(5);
        k60 J = I.J();
        J.c(R.drawable.ic_ab_back, id.M0(2131743195, null), new gq0(I, 27), false);
        J.k();
        ScrollView scrollView = new ScrollView(context);
        LinearLayout linearLayout = new LinearLayout(context);
        final int i10 = 1;
        linearLayout.setOrientation(1);
        scrollView.addView(linearLayout);
        f7 f7Var = new f7(x5Var, linearLayout, x10, I, 11);
        J.r(scrollView, c8.ha.o(-1, 350));
        I.c(R.drawable.wallet_globe, id.M0(2131743151, null), new g(f7Var, I, J, 10), false);
        org.telegram.ui.ActionBar.z0 y10 = I.y();
        f fVar = x10.h;
        String i11 = fVar.i();
        boolean isEmpty = TextUtils.isEmpty(i11);
        String str = i11;
        if (isEmpty) {
            y10.setSubtext("USD");
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(id.M0(2131748780, null));
            spannableStringBuilder.setSpan(new b80(org.telegram.messenger.g0.L(75.0f), y10.b), 0, spannableStringBuilder.length(), 33);
            str = spannableStringBuilder;
        }
        y10.setSubtext(str);
        f7 f7Var2 = new f7(x10, new boolean[]{fVar.f() != null}, y10, f7Var, 12);
        x5Var.P0.add(f7Var2);
        f7Var.run();
        I.c(R.drawable.wallet_lock, id.M0(2131747658, null), new Runnable(x5Var) { // from class: org.telegram.ui.Wallet.p4
            public final /* synthetic */ x5 b;

            {
                this.b = x5Var;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i7) {
                    case 0:
                        x5 x5Var2 = this.b;
                        x5Var2.getClass();
                        I.u();
                        x5Var2.presentFragment(PasscodeActivity.p0());
                        break;
                    case 1:
                        x5 x5Var3 = this.b;
                        x5Var3.getClass();
                        I.u();
                        x5Var3.presentFragment(new n8());
                        break;
                    case 2:
                        x5 x5Var4 = this.b;
                        x5Var4.getClass();
                        I.u();
                        x5Var4.presentFragment(new ha());
                        break;
                    default:
                        I.u();
                        x5 x5Var5 = this.b;
                        x5.I0(x5Var5.getParentActivity(), x5Var5.getResourceProvider());
                        break;
                }
            }
        }, false);
        I.c(R.drawable.wallet_key, id.M0(2131743083, null), new Runnable(x5Var) { // from class: org.telegram.ui.Wallet.p4
            public final /* synthetic */ x5 b;

            {
                this.b = x5Var;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i10) {
                    case 0:
                        x5 x5Var2 = this.b;
                        x5Var2.getClass();
                        I.u();
                        x5Var2.presentFragment(PasscodeActivity.p0());
                        break;
                    case 1:
                        x5 x5Var3 = this.b;
                        x5Var3.getClass();
                        I.u();
                        x5Var3.presentFragment(new n8());
                        break;
                    case 2:
                        x5 x5Var4 = this.b;
                        x5Var4.getClass();
                        I.u();
                        x5Var4.presentFragment(new ha());
                        break;
                    default:
                        I.u();
                        x5 x5Var5 = this.b;
                        x5.I0(x5Var5.getParentActivity(), x5Var5.getResourceProvider());
                        break;
                }
            }
        }, false);
        final int i12 = 2;
        I.l(R.drawable.wallet_apps, id.M0(2131743159, null), new Runnable(x5Var) { // from class: org.telegram.ui.Wallet.p4
            public final /* synthetic */ x5 b;

            {
                this.b = x5Var;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i12) {
                    case 0:
                        x5 x5Var2 = this.b;
                        x5Var2.getClass();
                        I.u();
                        x5Var2.presentFragment(PasscodeActivity.p0());
                        break;
                    case 1:
                        x5 x5Var3 = this.b;
                        x5Var3.getClass();
                        I.u();
                        x5Var3.presentFragment(new n8());
                        break;
                    case 2:
                        x5 x5Var4 = this.b;
                        x5Var4.getClass();
                        I.u();
                        x5Var4.presentFragment(new ha());
                        break;
                    default:
                        I.u();
                        x5 x5Var5 = this.b;
                        x5.I0(x5Var5.getParentActivity(), x5Var5.getResourceProvider());
                        break;
                }
            }
        }, true ^ x10.g.d.isEmpty());
        I.k();
        final int i13 = 3;
        I.c(R.drawable.wallet_help, id.M0(2131742963, null), new Runnable(x5Var) { // from class: org.telegram.ui.Wallet.p4
            public final /* synthetic */ x5 b;

            {
                this.b = x5Var;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i13) {
                    case 0:
                        x5 x5Var2 = this.b;
                        x5Var2.getClass();
                        I.u();
                        x5Var2.presentFragment(PasscodeActivity.p0());
                        break;
                    case 1:
                        x5 x5Var3 = this.b;
                        x5Var3.getClass();
                        I.u();
                        x5Var3.presentFragment(new n8());
                        break;
                    case 2:
                        x5 x5Var4 = this.b;
                        x5Var4.getClass();
                        I.u();
                        x5Var4.presentFragment(new ha());
                        break;
                    default:
                        I.u();
                        x5 x5Var5 = this.b;
                        x5.I0(x5Var5.getParentActivity(), x5Var5.getResourceProvider());
                        break;
                }
            }
        }, false);
        I.p = new n(11, x5Var, f7Var2);
        I.Z();
    }

    public static void m0(x5 x5Var, long j3) {
        e4 e4Var = x5Var.K0;
        if (x5Var.a == null) {
            return;
        }
        s8 s8Var = x5Var.i0;
        if (s8Var != null) {
            s8Var.a();
        }
        if (x5Var.I0 <= 0.0f && x5Var.A0()) {
            int top = x5Var.a.e3.m(x5Var.h).getTop() - x5Var.a.getPaddingTop();
            x5Var.a.C0();
            if (top < 0) {
                x5Var.a.w0(0, top, xq.h);
                return;
            }
            return;
        }
        x5Var.a.C0();
        x5Var.s0(true);
        org.telegram.messenger.g0.r(e4Var);
        if (j3 > 0) {
            org.telegram.messenger.g0.i3(e4Var, j3 + 260);
        }
    }

    public static Typeface r0(Context context) {
        if (U0 == null) {
            if (Build.VERSION.SDK_INT >= 26) {
                U0 = new Typeface.Builder(context.getAssets(), "fonts/rmono_var.ttf").setFontVariationSettings("'wght' 500").setWeight(500).build();
            } else {
                U0 = org.telegram.messenger.g0.o1("fonts/rmono.ttf");
            }
        }
        return U0;
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x03ad  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x03de A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x03ef  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x05bb  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0645  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0690  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x062c  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x055b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static LinearLayout t0(final Context context, int i7, TL_wallet.walletTransaction wallettransaction, x10 x10Var, v10 v10Var, byte[] bArr, Runnable runnable, org.telegram.ui.ActionBar.f6 f6Var, z2[] z2VarArr, boolean z9) {
        String t6;
        String str;
        a5 a5Var;
        ImageView imageView;
        TextView textView;
        ImageView imageView2;
        float f10;
        int i10;
        int i11;
        ImageView imageView3;
        tx0 tx0Var;
        SpannableString[] spannableStringArr;
        LinearLayout linearLayout;
        final String[] strArr;
        TextView[] textViewArr;
        boolean[] zArr;
        TL_wallet.walletTransaction wallettransaction2;
        b5 b5Var;
        int i12;
        d5 d5Var;
        final z2[] z2VarArr2;
        char c10;
        Object s5;
        final FrameLayout frameLayout;
        final org.telegram.ui.ActionBar.f6 f6Var2 = f6Var;
        boolean z10 = x10Var != null;
        final LinearLayout f11 = org.telegram.messenger.k5.f(context, 1);
        FrameLayout frameLayout2 = new FrameLayout(context);
        f11.addView(frameLayout2, c8.ha.o(-1, 56));
        int i13 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.k6.w0(i13, f6Var2);
        int i14 = org.telegram.ui.ActionBar.k6.i6;
        int w02 = org.telegram.ui.ActionBar.k6.w0(i14, f6Var2);
        ImageView imageView4 = new ImageView(context);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView4.setScaleType(scaleType);
        imageView4.setImageResource(R.drawable.ic_ab_close);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        org.telegram.ui.ActionBar.r6.t(imageView4, i13, f6Var2, mode);
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.k6.h0(w02, 1, -1);
        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i14);
        imageView4.setBackground(h02);
        org.telegram.ui.ActionBar.r6.k(imageView4, h02, null, N, f6Var2);
        imageView4.setContentDescription(id.M0(2131752041, null));
        frameLayout2.addView(imageView4, c8.ha.d(48, 48.0f, 19, 4.0f, -2.0f, 0.0f, 0.0f));
        ImageView imageView5 = new ImageView(context);
        imageView5.setScaleType(scaleType);
        imageView5.setImageResource(R.drawable.ic_ab_other);
        org.telegram.ui.ActionBar.r6.t(imageView5, i13, f6Var2, mode);
        org.telegram.ui.Cells.y h03 = org.telegram.ui.ActionBar.k6.h0(w02, 1, -1);
        org.telegram.ui.ActionBar.n6 N2 = org.telegram.ui.ActionBar.r6.N(i14);
        imageView5.setBackground(h03);
        org.telegram.ui.ActionBar.r6.k(imageView5, h03, null, N2, f6Var2);
        imageView5.setContentDescription(id.M0(2131754839, null));
        imageView5.setVisibility(x10Var != null ? 8 : 0);
        frameLayout2.addView(imageView5, c8.ha.d(44, 48.0f, 21, 0.0f, 2.0f, 4.0f, 0.0f));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        linearLayout2.setGravity(1);
        f11.addView(linearLayout2, c8.ha.k(14.0f, wallettransaction.key_change ? -20.0f : -40.0f, 14.0f, 24.0f, -1, -2));
        View v6Var = new v6(120, context, z9);
        v6Var.setTag(v6.class);
        linearLayout2.addView(v6Var, c8.ha.t(120, 120, 1, 0, 0, 0, -8));
        a5 a5Var2 = new a5(context);
        a5Var2.setSingleLine(true);
        a5Var2.setGravity(17);
        a5Var2.setIncludeFontPadding(false);
        a5Var2.setTextSize(1, 40.0f);
        a5Var2.setTypeface(org.telegram.messenger.g0.o());
        linearLayout2.addView(a5Var2, c8.ha.r(-1, 50, 1));
        TextView textView2 = new TextView(context);
        textView2.setGravity(17);
        textView2.setIncludeFontPadding(false);
        textView2.setTextSize(1, 14.0f);
        int i15 = org.telegram.ui.ActionBar.k6.z6;
        org.telegram.ui.ActionBar.r6.V(textView2, i15, f6Var2);
        linearLayout2.addView(textView2, c8.ha.t(-1, 20, 1, 0, 3, 0, 0));
        if (wallettransaction.key_change) {
            linearLayout2.removeAllViews();
            FrameLayout frameLayout3 = new FrameLayout(context);
            frameLayout3.setBackground(org.telegram.ui.ActionBar.k6.M(org.telegram.messenger.g0.L(76.0f), -7956054, -9534569));
            ImageView imageView6 = new ImageView(context);
            imageView6.setImageResource(R.drawable.wallet_transaction_key);
            imageView6.setScaleType(ImageView.ScaleType.FIT_CENTER);
            frameLayout3.addView(imageView6, c8.ha.e(44, 44, 17));
            linearLayout2.addView(frameLayout3, c8.ha.r(76, 76, 1));
            TextView textView3 = new TextView(context);
            textView3.setText(id.M0(2131743084, null));
            org.telegram.messenger.k5.n(textView3, i13, f6Var2, 1, 18.0f);
            textView3.setGravity(17);
            textView3.setIncludeFontPadding(false);
            linearLayout2.addView(textView3, c8.ha.t(-1, 24, 1, 12, 12, 12, 0));
        } else if (wallettransaction.nft != null) {
            linearLayout2.removeAllViews();
            TL_wallet.nftItem nftitem = wallettransaction.nft;
            org.telegram.ui.Components.l9 l9Var = new org.telegram.ui.Components.l9(context);
            l9Var.setRoundRadius(org.telegram.messenger.g0.L(12.0f));
            l9Var.setContentDescription(nftitem.name);
            Drawable mutate = context.getResources().getDrawable(R.drawable.wallet_nft_placeholder).mutate();
            org.telegram.ui.ActionBar.r6.y(l9Var, mutate, i15, f6Var2, mode);
            hc c11 = c.c(nftitem, false);
            if (c11 != null) {
                l9Var.j(c11, "120_120", mutate, nftitem);
            } else {
                l9Var.setImageDrawable(mutate);
            }
            linearLayout2.addView(l9Var, c8.ha.r(120, 120, 1));
            TextView textView4 = new TextView(context);
            textView4.setText(TextUtils.isEmpty(nftitem.name) ? id.M0(2131743179, null) : nftitem.name);
            org.telegram.messenger.k5.n(textView4, i13, f6Var2, 1, 17.0f);
            textView4.setGravity(17);
            linearLayout2.addView(textView4, c8.ha.k(12.0f, 16.0f, 12.0f, 0.0f, -1, -2));
            if (wallettransaction.incoming) {
                t6 = m0.x(i7).t();
            } else {
                TL_wallet.WalletTransactionPeer walletTransactionPeer = wallettransaction.peer;
                if (walletTransactionPeer == null) {
                    str = null;
                    if (x10Var == null) {
                        if (wallettransaction.comment_encrypted || wallettransaction.comment_encrypted_preparing) {
                            f10 = 11.0f;
                            if (wallettransaction.comment_encrypted_preparing || !TextUtils.isEmpty(str)) {
                                xh.l lVar = new xh.l(context, f6Var2, false);
                                lVar.r = false;
                                lVar.setTextSize(1, 15.0f);
                                org.telegram.ui.ActionBar.r6.V(lVar, i13, f6Var2);
                                StringBuilder sb2 = new StringBuilder(25);
                                int i16 = 0;
                                for (int i17 = 25; i16 < i17; i17 = 25) {
                                    sb2.append("a");
                                    i16++;
                                }
                                SpannableString spannableString = new SpannableString(sb2.toString());
                                uy0 uy0Var = new uy0();
                                uy0Var.a |= 256;
                                spannableString.setSpan(new vy0(uy0Var, 0), 0, spannableString.length(), 33);
                                lVar.setText(spannableString);
                                org.telegram.ui.ActionBar.t4 t4Var = new org.telegram.ui.ActionBar.t4(0, false, false, null);
                                t4Var.x = false;
                                t4Var.w = Integer.valueOf(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Xl, f6Var2));
                                lVar.setBackground(t4Var);
                                lVar.setPadding(org.telegram.messenger.g0.L(19.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(15.0f), org.telegram.messenger.g0.L(11.0f));
                                linearLayout2.addView(lVar, c8.ha.t(-2, -2, 1, 32, 15, 32, 0));
                                c8.ka.a(lVar);
                                i11 = 1;
                                a5Var = a5Var2;
                                imageView = imageView4;
                                textView = textView2;
                                imageView2 = imageView5;
                                i10 = 8;
                                lVar.setOnClickListener(new lb(new boolean[]{false}, z2VarArr, f6Var2, lVar, wallettransaction, i7, str));
                                SpannableString[] spannableStringArr2 = new SpannableString[i11];
                                TextView[] textViewArr2 = new TextView[i11];
                                tx0 tx0Var2 = new tx0(context, f6Var2);
                                f11.addView(tx0Var2, c8.ha.k(14.0f, 0.0f, 14.0f, 0.0f, -1, -2));
                                String[] strArr2 = {wallettransaction.comment};
                                final boolean[] zArr2 = {(wallettransaction.comment_encrypted || (z10 && bArr == null)) ? false : true};
                                if (x10Var == null) {
                                    FrameLayout frameLayout4 = new FrameLayout(context);
                                    int L = org.telegram.messenger.g0.L(22.0f);
                                    int L2 = org.telegram.messenger.g0.L(22.0f);
                                    int i18 = org.telegram.ui.ActionBar.k6.a7;
                                    ShapeDrawable e02 = org.telegram.ui.ActionBar.k6.e0(L, L2, org.telegram.ui.ActionBar.k6.w0(i18, f6Var2));
                                    org.telegram.ui.ActionBar.n6 N3 = org.telegram.ui.ActionBar.r6.N(i18);
                                    frameLayout4.setBackground(e02);
                                    org.telegram.ui.ActionBar.r6.k(frameLayout4, e02, N3, null, f6Var2);
                                    final n nVar = new n(i10, textViewArr2, spannableStringArr2);
                                    final Runnable[] runnableArr = new Runnable[1];
                                    ImageView imageView7 = imageView;
                                    final ee eeVar = new ee(runnableArr, textViewArr2, i7, f6Var2, wallettransaction, strArr2, zArr2, bArr);
                                    tx0Var = tx0Var2;
                                    textViewArr = textViewArr2;
                                    wallettransaction2 = wallettransaction;
                                    b5 b5Var2 = new b5(context, f6Var2);
                                    b5Var2.setHint(id.M0(2131743062, null));
                                    b5Var2.setText(strArr2[0]);
                                    b5Var2.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(f10), org.telegram.messenger.g0.L(64.0f), org.telegram.messenger.g0.L(12.0f));
                                    int i19 = org.telegram.ui.ActionBar.k6.G6;
                                    org.telegram.ui.ActionBar.r6.V(b5Var2, i19, f6Var2);
                                    org.telegram.ui.ActionBar.n6 L3 = org.telegram.ui.ActionBar.r6.L(0.65f, i19);
                                    spannableStringArr = spannableStringArr2;
                                    org.telegram.ui.ActionBar.r6.o(b5Var2, 1, L3.a, -1, 2, L3.d, f6Var);
                                    b5Var2.setMaxLines(4);
                                    frameLayout4.addView(b5Var2, c8.ha.d(-1, -2.0f, qs.E1, 0.0f, 0.0f, (wallettransaction2.nft != null || bArr == null) ? 0.0f : 44.0f, 0.0f));
                                    b5Var2.addTextChangedListener(new c5(strArr2, nVar, runnableArr, eeVar));
                                    if (wallettransaction2.nft != null || bArr == null) {
                                        zArr = zArr2;
                                        strArr = strArr2;
                                        linearLayout = f11;
                                        f6Var2 = f6Var;
                                        b5Var = b5Var2;
                                        imageView3 = imageView7;
                                        frameLayout = frameLayout4;
                                    } else {
                                        FrameLayout frameLayout5 = new FrameLayout(context);
                                        c8.ka.a(frameLayout5);
                                        final ImageView imageView8 = new ImageView(context);
                                        frameLayout5.addView(imageView8, c8.ha.c(-1.0f, -1));
                                        imageView8.setScaleType(ImageView.ScaleType.CENTER);
                                        org.telegram.ui.ActionBar.r6.t(imageView8, zArr2[0] ? org.telegram.ui.ActionBar.k6.Ci : org.telegram.ui.ActionBar.k6.z6, f6Var, PorterDuff.Mode.SRC_IN);
                                        imageView8.setImageResource(zArr2[0] ? R.drawable.wallet_comment_locked : R.drawable.wallet_comment_unlocked);
                                        int i20 = org.telegram.ui.ActionBar.k6.i6;
                                        strArr = strArr2;
                                        org.telegram.ui.Cells.y h04 = org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.w0(i20, f6Var), 1, -1);
                                        org.telegram.ui.ActionBar.n6 N4 = org.telegram.ui.ActionBar.r6.N(i20);
                                        imageView8.setBackground(h04);
                                        org.telegram.ui.ActionBar.r6.k(imageView8, h04, null, N4, f6Var);
                                        final fi.m3[] m3VarArr = new fi.m3[1];
                                        f6Var2 = f6Var;
                                        frameLayout = frameLayout4;
                                        b5Var = b5Var2;
                                        imageView3 = imageView7;
                                        zArr = zArr2;
                                        linearLayout = f11;
                                        frameLayout5.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Wallet.o4
                                            @Override // android.view.View.OnClickListener
                                            public final void onClick(View view) {
                                                final boolean[] zArr3 = zArr2;
                                                zArr3[0] = !zArr3[0];
                                                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
                                                final AtomicBoolean atomicBoolean = new AtomicBoolean();
                                                final ImageView imageView9 = imageView8;
                                                final org.telegram.ui.ActionBar.f6 f6Var3 = f6Var2;
                                                duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Wallet.s4
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
                                                            org.telegram.ui.ActionBar.r6.t(imageView10, zArr4[0] ? org.telegram.ui.ActionBar.k6.Ci : org.telegram.ui.ActionBar.k6.z6, f6Var3, PorterDuff.Mode.SRC_IN);
                                                            imageView10.setImageResource(zArr4[0] ? R.drawable.wallet_comment_locked : R.drawable.wallet_comment_unlocked);
                                                        }
                                                    }
                                                });
                                                duration.setInterpolator(xq.h);
                                                duration.setDuration(420L);
                                                duration.start();
                                                fi.m3[] m3VarArr2 = m3VarArr;
                                                fi.m3 m3Var = m3VarArr2[0];
                                                if (m3Var != null) {
                                                    m3Var.f(true);
                                                    m3VarArr2[0] = null;
                                                }
                                                LinearLayout linearLayout3 = f11;
                                                if (linearLayout3.getParent() instanceof FrameLayout) {
                                                    FrameLayout frameLayout6 = (FrameLayout) linearLayout3.getParent();
                                                    fi.m3 m3Var2 = new fi.m3(context, 3);
                                                    m3VarArr2[0] = m3Var2;
                                                    m3Var2.t();
                                                    m3Var2.setPadding(org.telegram.messenger.g0.L(10.0f), 0, org.telegram.messenger.g0.L(10.0f), 0);
                                                    m3Var2.u(id.M0(zArr3[0] ? 2131743050 : 2131743045, null));
                                                    m3Var2.setTranslationY(-(org.telegram.messenger.g0.L(44.0f) + (linearLayout3.getHeight() - frameLayout.getBottom())));
                                                    m3Var2.p(1.0f, -org.telegram.messenger.g0.L(26.0f));
                                                    m3Var2.s(20.0f);
                                                    float L4 = org.telegram.messenger.g0.L(12.0f);
                                                    float L5 = org.telegram.messenger.g0.L(4.0f);
                                                    int r12 = org.telegram.ui.ActionBar.k6.r1(0.25f, -16777216);
                                                    m3Var2.i0 = L4;
                                                    m3Var2.j0 = L5;
                                                    m3Var2.k0 = r12;
                                                    m3Var2.F.setShadowLayer(L4, 0.0f, L5, r12);
                                                    frameLayout6.addView(m3Var2, c8.ha.e(-1, qs.e3, 87));
                                                    m3Var2.w();
                                                    m3Var2.q0 = new l(m3Var2, 7);
                                                }
                                                if (TextUtils.isEmpty(strArr[0])) {
                                                    return;
                                                }
                                                nVar.run();
                                                Runnable[] runnableArr2 = runnableArr;
                                                Runnable runnable2 = runnableArr2[0];
                                                if (runnable2 != null) {
                                                    runnable2.run();
                                                    runnableArr2[0] = null;
                                                }
                                                ee eeVar2 = eeVar;
                                                org.telegram.messenger.g0.r(eeVar2);
                                                org.telegram.messenger.g0.i3(eeVar2, 1000L);
                                            }
                                        });
                                        frameLayout.addView(frameLayout5, c8.ha.e(44, 44, 85));
                                    }
                                    linearLayout.addView(frameLayout, c8.ha.k(14.0f, 12.0f, 14.0f, 8.0f, -1, -2));
                                } else {
                                    imageView3 = imageView;
                                    tx0Var = tx0Var2;
                                    spannableStringArr = spannableStringArr2;
                                    linearLayout = f11;
                                    strArr = strArr2;
                                    textViewArr = textViewArr2;
                                    zArr = zArr2;
                                    wallettransaction2 = wallettransaction;
                                    b5Var = null;
                                }
                                fi.d h = org.telegram.messenger.k5.h(24, context, f6Var2, true);
                                h.setText(id.M0(2131747832, null));
                                linearLayout.addView(h, c8.ha.k(14.0f, 14.0f, 14.0f, 14.0f, -1, 48));
                                TL_wallet.walletTransaction[] wallettransactionArr = {wallettransaction2};
                                di.r rVar = new di.r(linearLayout, a5Var, f6Var2, i7, textView, z2VarArr, tx0Var, x10Var, context, textViewArr, spannableStringArr);
                                LinearLayout linearLayout3 = linearLayout;
                                linearLayout3.setTag(new n(10, rVar, wallettransactionArr));
                                rVar.a(wallettransaction2);
                                if (z10) {
                                    i12 = i7;
                                    d5 d5Var2 = new d5(i12, wallettransactionArr, rVar);
                                    if (wallettransaction2.preview) {
                                        m0 x10 = m0.x(i12);
                                        String str2 = wallettransaction2.id;
                                        m mVar = new m(wallettransaction2, rVar, wallettransactionArr, 4);
                                        HashMap hashMap = x10.K;
                                        l0 l0Var = x10.n;
                                        if (l0Var != null) {
                                            ArrayList arrayList = l0Var.c;
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
                                            ConnectionsManager.getInstance(x10.a).sendRequestTyped(gettransactionsbyids, new d3.b(1), new j(x10, (Object) mVar, (Object) str2, 4));
                                        }
                                    }
                                    d5Var = d5Var2;
                                } else {
                                    i12 = i7;
                                    d5Var = null;
                                }
                                boolean[] zArr3 = zArr;
                                String[] strArr3 = strArr;
                                linearLayout3.addOnAttachStateChangeListener(new e5(rVar, wallettransactionArr, d5Var, i12, v10Var, z2VarArr, strArr3, zArr3));
                                if (x10Var == null) {
                                    TL_wallet.nftItem nftitem2 = wallettransaction2.nft;
                                    if (nftitem2 != null) {
                                        s5 = TextUtils.isEmpty(nftitem2.name) ? id.M0(2131743179, null) : wallettransaction2.nft.name;
                                        c10 = 0;
                                    } else {
                                        c10 = 0;
                                        s5 = m0.s(Math.abs(wallettransaction2.amount), false);
                                    }
                                    Object[] objArr = new Object[1];
                                    objArr[c10] = s5;
                                    h.setText(id.V(null, null, 2131743024, objArr));
                                    z2VarArr2 = z2VarArr;
                                    h.setOnClickListener(new org.telegram.messenger.video.f(h, b5Var, x10Var, strArr3, zArr3, z2VarArr2, f6Var));
                                } else {
                                    z2VarArr2 = z2VarArr;
                                    final int i22 = 0;
                                    if (runnable != null) {
                                        h.setText(id.M0(2131743063, null));
                                        h.setOnClickListener(new fk0(20, runnable, z2VarArr2));
                                    } else {
                                        h.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Wallet.n4
                                            @Override // android.view.View.OnClickListener
                                            public final void onClick(View view) {
                                                switch (i22) {
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
                                final int i23 = 1;
                                imageView3.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Wallet.n4
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view) {
                                        switch (i23) {
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
                                imageView9.setOnClickListener(new jb(z2VarArr2, f6Var, imageView9, wallettransactionArr, context, i7));
                                return linearLayout3;
                            }
                        } else if (TextUtils.isEmpty(wallettransaction.comment)) {
                            f10 = 11.0f;
                        } else {
                            xh.l lVar2 = new xh.l(context);
                            lVar2.setTextSize(1, 15.0f);
                            org.telegram.ui.ActionBar.r6.V(lVar2, i13, f6Var2);
                            f10 = 11.0f;
                            lVar2.setText(org.telegram.messenger.i6.m(wallettransaction.comment, lVar2.getPaint().getFontMetricsInt(), false, null, 0));
                            lVar2.setTextIsSelectable(true);
                            org.telegram.ui.ActionBar.t4 t4Var2 = new org.telegram.ui.ActionBar.t4(0, false, false, null);
                            t4Var2.x = false;
                            t4Var2.w = Integer.valueOf(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Xl, f6Var2));
                            lVar2.setBackground(t4Var2);
                            lVar2.setPadding(org.telegram.messenger.g0.L(19.0f), org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(15.0f), org.telegram.messenger.g0.L(8.0f));
                            linearLayout2.addView(lVar2, c8.ha.t(-2, -2, 1, 32, 16, 32, 0));
                        }
                        a5Var = a5Var2;
                        imageView = imageView4;
                        textView = textView2;
                        imageView2 = imageView5;
                    } else {
                        a5Var = a5Var2;
                        imageView = imageView4;
                        textView = textView2;
                        imageView2 = imageView5;
                        f10 = 11.0f;
                    }
                    i11 = 1;
                    i10 = 8;
                    SpannableString[] spannableStringArr22 = new SpannableString[i11];
                    TextView[] textViewArr22 = new TextView[i11];
                    tx0 tx0Var22 = new tx0(context, f6Var2);
                    f11.addView(tx0Var22, c8.ha.k(14.0f, 0.0f, 14.0f, 0.0f, -1, -2));
                    String[] strArr22 = {wallettransaction.comment};
                    final boolean[] zArr22 = {(wallettransaction.comment_encrypted || (z10 && bArr == null)) ? false : true};
                    if (x10Var == null) {
                    }
                    fi.d h7 = org.telegram.messenger.k5.h(24, context, f6Var2, true);
                    h7.setText(id.M0(2131747832, null));
                    linearLayout.addView(h7, c8.ha.k(14.0f, 14.0f, 14.0f, 14.0f, -1, 48));
                    TL_wallet.walletTransaction[] wallettransactionArr2 = {wallettransaction2};
                    di.r rVar2 = new di.r(linearLayout, a5Var, f6Var2, i7, textView, z2VarArr, tx0Var, x10Var, context, textViewArr, spannableStringArr);
                    LinearLayout linearLayout32 = linearLayout;
                    linearLayout32.setTag(new n(10, rVar2, wallettransactionArr2));
                    rVar2.a(wallettransaction2);
                    if (z10) {
                    }
                    boolean[] zArr32 = zArr;
                    String[] strArr32 = strArr;
                    linearLayout32.addOnAttachStateChangeListener(new e5(rVar2, wallettransactionArr2, d5Var, i12, v10Var, z2VarArr, strArr32, zArr32));
                    if (x10Var == null) {
                    }
                    final int i232 = 1;
                    imageView3.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Wallet.n4
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i232) {
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
                    imageView92.setOnClickListener(new jb(z2VarArr2, f6Var, imageView92, wallettransactionArr2, context, i7));
                    return linearLayout32;
                }
                t6 = walletTransactionPeer.address;
            }
            str = t6;
            if (x10Var == null) {
            }
            i11 = 1;
            i10 = 8;
            SpannableString[] spannableStringArr222 = new SpannableString[i11];
            TextView[] textViewArr222 = new TextView[i11];
            tx0 tx0Var222 = new tx0(context, f6Var2);
            f11.addView(tx0Var222, c8.ha.k(14.0f, 0.0f, 14.0f, 0.0f, -1, -2));
            String[] strArr222 = {wallettransaction.comment};
            final boolean[] zArr222 = {(wallettransaction.comment_encrypted || (z10 && bArr == null)) ? false : true};
            if (x10Var == null) {
            }
            fi.d h72 = org.telegram.messenger.k5.h(24, context, f6Var2, true);
            h72.setText(id.M0(2131747832, null));
            linearLayout.addView(h72, c8.ha.k(14.0f, 14.0f, 14.0f, 14.0f, -1, 48));
            TL_wallet.walletTransaction[] wallettransactionArr22 = {wallettransaction2};
            di.r rVar22 = new di.r(linearLayout, a5Var, f6Var2, i7, textView, z2VarArr, tx0Var, x10Var, context, textViewArr, spannableStringArr);
            LinearLayout linearLayout322 = linearLayout;
            linearLayout322.setTag(new n(10, rVar22, wallettransactionArr22));
            rVar22.a(wallettransaction2);
            if (z10) {
            }
            boolean[] zArr322 = zArr;
            String[] strArr322 = strArr;
            linearLayout322.addOnAttachStateChangeListener(new e5(rVar22, wallettransactionArr22, d5Var, i12, v10Var, z2VarArr, strArr322, zArr322));
            if (x10Var == null) {
            }
            final int i2322 = 1;
            imageView3.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Wallet.n4
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i2322) {
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
            imageView922.setOnClickListener(new jb(z2VarArr2, f6Var, imageView922, wallettransactionArr22, context, i7));
            return linearLayout322;
        }
        if (wallettransaction.incoming) {
        }
        str = t6;
        if (x10Var == null) {
        }
        i11 = 1;
        i10 = 8;
        SpannableString[] spannableStringArr2222 = new SpannableString[i11];
        TextView[] textViewArr2222 = new TextView[i11];
        tx0 tx0Var2222 = new tx0(context, f6Var2);
        f11.addView(tx0Var2222, c8.ha.k(14.0f, 0.0f, 14.0f, 0.0f, -1, -2));
        String[] strArr2222 = {wallettransaction.comment};
        final boolean[] zArr2222 = {(wallettransaction.comment_encrypted || (z10 && bArr == null)) ? false : true};
        if (x10Var == null) {
        }
        fi.d h722 = org.telegram.messenger.k5.h(24, context, f6Var2, true);
        h722.setText(id.M0(2131747832, null));
        linearLayout.addView(h722, c8.ha.k(14.0f, 14.0f, 14.0f, 14.0f, -1, 48));
        TL_wallet.walletTransaction[] wallettransactionArr222 = {wallettransaction2};
        di.r rVar222 = new di.r(linearLayout, a5Var, f6Var2, i7, textView, z2VarArr, tx0Var, x10Var, context, textViewArr, spannableStringArr);
        LinearLayout linearLayout3222 = linearLayout;
        linearLayout3222.setTag(new n(10, rVar222, wallettransactionArr222));
        rVar222.a(wallettransaction2);
        if (z10) {
        }
        boolean[] zArr3222 = zArr;
        String[] strArr3222 = strArr;
        linearLayout3222.addOnAttachStateChangeListener(new e5(rVar222, wallettransactionArr222, d5Var, i12, v10Var, z2VarArr, strArr3222, zArr3222));
        if (x10Var == null) {
        }
        final int i23222 = 1;
        imageView3.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Wallet.n4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i23222) {
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
        imageView9222.setOnClickListener(new jb(z2VarArr2, f6Var, imageView9222, wallettransactionArr222, context, i7));
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

    public static SpannableStringBuilder w0(int i7, long j3, org.telegram.ui.ActionBar.f6 f6Var) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("G ");
        wp wpVar = new wp(R.drawable.wallet_gram_small, 2);
        wpVar.d = false;
        wpVar.c(org.telegram.messenger.g0.L(16.0f));
        spannableStringBuilder.setSpan(wpVar, 0, 1, 33);
        BigDecimal movePointLeft = new BigDecimal(j3).movePointLeft(9);
        spannableStringBuilder.append((CharSequence) (movePointLeft.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : movePointLeft.stripTrailingZeros()).toPlainString());
        CharSequence m10 = m0.x(i7).m(j3, true);
        if (!TextUtils.isEmpty(m10)) {
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) "  ~\u2009").append(m10);
            spannableStringBuilder.setSpan(new yz(org.telegram.ui.ActionBar.k6.z6, f6Var), length, spannableStringBuilder.length(), 33);
        }
        return spannableStringBuilder;
    }

    public final boolean A0() {
        View m10;
        fi.w3 w3Var = this.a;
        return w3Var != null && (m10 = w3Var.e3.m(this.h)) != null && this.y0 < 0.5f && m10.getBottom() > this.a.getPaddingTop();
    }

    public final void D0() {
        e0 e0Var;
        q41 q41Var = this.r0[1];
        if (this.e0 != 1 || q41Var == null || !q41Var.G || (e0Var = this.E0) == null || e0Var.i || e0Var.g || e0Var.k != null || q41Var.e3.N0() < q41Var.f3.D.size() - 3) {
            return;
        }
        this.E0.e();
    }

    public final void E0() {
        l0 l0Var;
        q41 q41Var = this.r0[0];
        if (q41Var == null || !q41Var.G || (l0Var = this.D0) == null || l0Var.h || q41Var.e3.N0() < q41Var.f3.D.size() - 3) {
            return;
        }
        this.D0.h();
    }

    public final CharSequence F0(int i7) {
        CharSequence[] charSequenceArr = this.O0;
        if (charSequenceArr[i7] == null) {
            charSequenceArr[i7] = new SpannableString("l");
            b80 b80Var = new b80(org.telegram.messenger.g0.L(i7 == 0 ? 100.0f : 50.0f), i7 == 0 ? this.t0 : this.u0);
            b80Var.a(org.telegram.ui.ActionBar.k6.r1(0.45f, -1), org.telegram.ui.ActionBar.k6.r1(0.2f, -1));
            CharSequence charSequence = charSequenceArr[i7];
            ((SpannableString) charSequence).setSpan(b80Var, 0, charSequence.length(), 33);
        }
        return charSequenceArr[i7];
    }

    public final void H0(TL_wallet.nftItem nftitem) {
        TL_stars.StarGift starGift = nftitem.gift;
        String str = null;
        if (starGift instanceof TL_stars.TL_starGiftUnique) {
            TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) starGift;
            bi.k7 k7Var = new bi.k7(getParentActivity(), this.currentAccount, 0L, getResourceProvider(), null);
            k7Var.X2 = nftitem;
            if (this.j0 != null) {
                k7Var.Y2 = new f5(this, tL_starGiftUnique, nftitem);
                k7Var.Z2 = new g5(this, nftitem);
            }
            k7Var.h2(tL_starGiftUnique.slug, tL_starGiftUnique, null);
            showDialog(k7Var);
            return;
        }
        Activity parentActivity = getParentActivity();
        org.telegram.ui.ActionBar.f6 resourceProvider = getResourceProvider();
        if (parentActivity != null) {
            int i7 = org.telegram.ui.ActionBar.k6.a7;
            int w02 = org.telegram.ui.ActionBar.k6.w0(i7, resourceProvider);
            int i10 = org.telegram.ui.ActionBar.k6.G6;
            org.telegram.ui.ActionBar.k6.w0(i10, resourceProvider);
            v4 v4Var = new v4(1, parentActivity, resourceProvider, false);
            v4Var.a0 = i7;
            v4Var.v0(w02);
            v4Var.O(w02);
            ScrollView scrollView = new ScrollView(parentActivity);
            scrollView.setFillViewport(true);
            scrollView.setVerticalScrollBarEnabled(false);
            LinearLayout linearLayout = new LinearLayout(parentActivity);
            linearLayout.setOrientation(1);
            linearLayout.setGravity(1);
            float f10 = 12.0f;
            linearLayout.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(28.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f));
            scrollView.addView(linearLayout, new FrameLayout.LayoutParams(-1, -2));
            org.telegram.ui.Components.l9 l9Var = new org.telegram.ui.Components.l9(parentActivity);
            l9Var.setRoundRadius(org.telegram.messenger.g0.L(12.0f));
            l9Var.setContentDescription(nftitem.name);
            Drawable mutate = parentActivity.getResources().getDrawable(R.drawable.wallet_nft_placeholder).mutate();
            int i11 = org.telegram.ui.ActionBar.k6.z6;
            org.telegram.ui.ActionBar.r6.y(l9Var, mutate, i11, resourceProvider, PorterDuff.Mode.SRC_IN);
            hc c10 = c.c(nftitem, false);
            if (c10 != null) {
                l9Var.j(c10, "120_120", mutate, nftitem);
            } else {
                l9Var.setImageDrawable(mutate);
            }
            linearLayout.addView(l9Var, c8.ha.r(120, 120, 1));
            TextView textView = new TextView(parentActivity);
            textView.setText(TextUtils.isEmpty(nftitem.name) ? id.M0(2131743179, null) : nftitem.name);
            org.telegram.messenger.k5.n(textView, i10, resourceProvider, 1, 17.0f);
            int i12 = 17;
            textView.setGravity(17);
            linearLayout.addView(textView, c8.ha.k(12.0f, 16.0f, 12.0f, 0.0f, -1, -2));
            TextView textView2 = new TextView(parentActivity);
            textView2.setText(nftitem.description);
            org.telegram.ui.ActionBar.r6.V(textView2, i11, resourceProvider);
            textView2.setTextSize(1, 14.0f);
            textView2.setGravity(17);
            textView2.setVisibility(TextUtils.isEmpty(nftitem.description) ? 8 : 0);
            linearLayout.addView(textView2, c8.ha.k(12.0f, 4.0f, 12.0f, 0.0f, -1, -2));
            LinearLayout linearLayout2 = new LinearLayout(parentActivity);
            linearLayout2.setOrientation(0);
            linearLayout.addView(linearLayout2, c8.ha.k(0.0f, 20.0f, 0.0f, 16.0f, -1, 54));
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
                String M0 = id.M0(i13 == 0 ? 2131742984 : 2131743026, str);
                linearLayout3.setContentDescription(M0);
                ImageView imageView = new ImageView(parentActivity);
                imageView.setImageResource(i13 == 0 ? R.drawable.wallet_transfer : R.drawable.wallet_sell);
                imageView.setImportantForAccessibility(2);
                int i16 = org.telegram.ui.ActionBar.k6.G6;
                org.telegram.ui.ActionBar.r6.t(imageView, i16, resourceProvider, PorterDuff.Mode.SRC_IN);
                linearLayout3.addView(imageView, c8.ha.o(24, 24));
                TextView textView3 = new TextView(parentActivity);
                textView3.setText(M0);
                float f11 = f10;
                org.telegram.messenger.k5.n(textView3, i16, resourceProvider, 1, f11);
                textView3.setGravity(17);
                linearLayout3.addView(textView3, c8.ha.k(0.0f, 2.0f, 0.0f, 0.0f, -2, -2));
                linearLayout2.addView(linearLayout3, c8.ha.m(1.0f, 0, -1, i13 == 0 ? 0 : 4, i13 == 0 ? 4 : 0, 0));
                i13++;
                f10 = f11;
                i12 = 17;
                str = null;
            }
            ArrayList<TL_wallet.nftAttribute> arrayList = nftitem.attributes;
            if (arrayList != null && !arrayList.isEmpty()) {
                tx0 tx0Var = new tx0(parentActivity, resourceProvider);
                int L2 = org.telegram.messenger.g0.L(10.0f);
                int i17 = org.telegram.ui.ActionBar.k6.d6;
                ShapeDrawable d02 = org.telegram.ui.ActionBar.k6.d0(L2, org.telegram.ui.ActionBar.k6.w0(i17, resourceProvider));
                org.telegram.ui.ActionBar.n6 N3 = org.telegram.ui.ActionBar.r6.N(i17);
                tx0Var.setBackground(d02);
                org.telegram.ui.ActionBar.r6.k(tx0Var, d02, N3, null, resourceProvider);
                ArrayList<TL_wallet.nftAttribute> arrayList2 = nftitem.attributes;
                int size = arrayList2.size();
                int i18 = 0;
                while (i18 < size) {
                    TL_wallet.nftAttribute nftattribute = arrayList2.get(i18);
                    i18++;
                    TL_wallet.nftAttribute nftattribute2 = nftattribute;
                    tx0Var.c(nftattribute2.trait_type, nftattribute2.value, null, null);
                }
                linearLayout.addView(tx0Var, c8.ha.k(0.0f, 0.0f, 0.0f, 14.0f, -1, -2));
            }
            fi.d dVar = new fi.d(parentActivity, resourceProvider, true);
            dVar.setRoundRadius(24);
            dVar.setText(id.M0(2131743066, null));
            linearLayout.addView(dVar, c8.ha.o(-1, 48));
            v4Var.N = scrollView;
            v4Var.T0 = false;
            linearLayout2.getChildAt(0).setOnClickListener(new fk0(19, v4Var, nftitem));
            linearLayout2.getChildAt(1).setOnClickListener(new i3(parentActivity, 1));
            dVar.setOnClickListener(new i3(v4Var, 2));
            v4Var.show();
            v4Var.O(w02);
            org.telegram.messenger.g0.u3(v4Var, w02, false, null);
        }
    }

    public final void K0() {
        if (getParentActivity() == null || this.M0 != null || this.L0 == null) {
            return;
        }
        if (getParentActivity().checkSelfPermission("android.permission.CAMERA") != 0) {
            getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 44);
        } else {
            this.M0 = ai.i0.k(this, this.L0, new ai.c0(12), new l4(this, 3), new e4(this, 8));
        }
    }

    public final void L0(boolean z9) {
        this.f0 = z9;
        if (!z9) {
            this.e0 = 0;
        }
        if (this.p0 == null || this.h0 == null) {
            return;
        }
        if (!z9) {
            this.i0.b(false);
            this.p0.setPosition(0);
        }
        Z0();
        ValueAnimator valueAnimator = this.m0;
        if (valueAnimator != null) {
            this.m0 = null;
            valueAnimator.cancel();
        }
        float f10 = z9 ? 1.0f : 0.0f;
        boolean z10 = this.n0.isAttachedToWindow() && this.n0.isLaidOut();
        if (z9) {
            this.p0.o(false);
        }
        if (!z10 || this.l0 == f10) {
            M0(f10);
            this.p0.o(false);
        } else {
            this.h0.setVisibility(0);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.l0, f10);
            this.m0 = ofFloat;
            ofFloat.setDuration(250L);
            this.m0.setInterpolator(xq.h);
            this.m0.addUpdateListener(new k4(this, 0));
            this.m0.addListener(new org.telegram.ui.ActionBar.t0(this, f10, 7));
            this.m0.start();
        }
        if (this.a == null || this.o0 == N0()) {
            return;
        }
        X0(false);
    }

    public final void M0(float f10) {
        this.l0 = f10;
        this.h0.setVisibility((f10 > 0.0f || this.m0 != null) ? 0 : 8);
        this.h0.setAlpha(f10);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.h0.getLayoutParams();
        layoutParams.height = Math.round(org.telegram.messenger.g0.L(52.0f) * f10);
        layoutParams.bottomMargin = -Math.round(org.telegram.messenger.g0.L(6.0f) * f10);
        this.h0.setLayoutParams(layoutParams);
    }

    public final boolean N0() {
        l0 l0Var;
        if (this.f0 || (l0Var = this.D0) == null || !l0Var.c.isEmpty()) {
            return false;
        }
        l0 l0Var2 = this.D0;
        l0Var2.getClass();
        return l0Var2.h;
    }

    public final void O0() {
        this.F0 = false;
        s8 s8Var = this.i0;
        if (s8Var != null) {
            s8Var.b(false);
        }
        this.e0 = 0;
        fi.g1 g1Var = this.p0;
        if (g1Var != null) {
            g1Var.setPosition(0);
        }
    }

    public final void P0() {
        this.s = false;
        fi.w3 w3Var = this.a;
        if (w3Var != null) {
            w3Var.D2.b.remove(this.x);
            this.a.removeCallbacks(this.w);
        }
        l5 l5Var = this.e;
        if (l5Var != null) {
            l5Var.setAdditionalTilt(0.0f);
        }
    }

    public final void R0() {
        m0 x10 = m0.x(this.currentAccount);
        a1();
        this.C0.setEnabled(x10.G() && x10.e());
        if (!x10.G()) {
            this.t0.setText(F0(0));
            this.u0.setText(F0(1));
            return;
        }
        long v = x10.v();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (this.Q0 == null) {
            this.Q0 = new SpannableString("G");
            l5 l5Var = this.e;
            l5Var.getClass();
            f6 f6Var = new f6(l5Var);
            this.v0 = f6Var;
            SpannableString spannableString = this.Q0;
            spannableString.setSpan(f6Var, 0, spannableString.length(), 33);
        }
        spannableStringBuilder.append((CharSequence) this.Q0);
        spannableStringBuilder.append((CharSequence) " ");
        spannableStringBuilder.append((CharSequence) g6.e(v));
        spannableStringBuilder.append((CharSequence) " ");
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) id.M0(2131749517, null));
        if (this.w0 == null) {
            o5 o5Var = new o5();
            o5Var.a = -9577217;
            this.w0 = o5Var;
        }
        spannableStringBuilder.setSpan(this.w0, length, spannableStringBuilder.length(), 33);
        this.t0.setText(spannableStringBuilder);
        CharSequence m10 = m0.x(this.currentAccount).m(v, false);
        if (TextUtils.isEmpty(m10)) {
            this.u0.setText(F0(1));
        } else {
            this.u0.setText(m10);
        }
        U0(this.x0);
        e0 e0Var = this.E0;
        if (e0Var != null && !e0Var.h && !e0Var.i && e0Var.k == null) {
            e0Var.e();
        }
        String t6 = x10.t();
        if (TextUtils.isEmpty(t6)) {
            return;
        }
        this.e.setCardNumber(v0(t6.toUpperCase()));
    }

    public final void S0() {
        float[] fArr;
        float[] fArr2;
        Rect rect = this.G;
        if (rect.isEmpty() || !this.D.isAttachedToWindow()) {
            return;
        }
        l5 l5Var = this.e;
        bi.x5 x5Var = this.E;
        Matrix matrix = this.H;
        if (l5Var.g(x5Var, matrix)) {
            float width = rect.width();
            float height = rect.height();
            int i7 = 0;
            while (true) {
                fArr = this.K;
                fArr2 = this.L;
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
            bi.x5 x5Var2 = this.E;
            int[] iArr = this.O;
            x5Var2.getLocationInWindow(iArr);
            View view = this.D;
            int[] iArr2 = this.N;
            view.getLocationInWindow(iArr2);
            this.e.i(this.x0, this.y.getWidth() / 0.7826087f);
            float f12 = iArr2[0] - iArr[0];
            float x10 = org.telegram.ui.Cells.f1.x(height, 0.7826087f, 0.5f, iArr2[1] - iArr[1]);
            for (int i12 = 0; i12 < 4; i12++) {
                int i13 = i12 * 2;
                float T1 = org.telegram.messenger.g0.T1(fArr2[i13], (fArr[i13] * 0.7826087f) + f12, this.x0);
                float[] fArr3 = this.M;
                fArr3[i13] = T1;
                int i14 = i13 + 1;
                fArr3[i14] = org.telegram.messenger.g0.T1(fArr2[i14], (fArr[i14] * 0.7826087f) + x10, this.x0);
            }
            Matrix matrix2 = this.J;
            boolean polyToPoly = matrix2.setPolyToPoly(this.K, 0, this.M, 0, 4);
            Matrix matrix3 = this.I;
            if (polyToPoly && !matrix3.equals(matrix2)) {
                matrix3.set(matrix2);
                this.E.invalidate();
            }
            l5 l5Var2 = this.e;
            Matrix matrix4 = l5Var2.c;
            Matrix matrix5 = l5Var2.e;
            Matrix matrix6 = l5Var2.d;
            if (matrix.invert(matrix6)) {
                matrix5.setConcat(matrix6, matrix3);
                if (!l5Var2.n || !matrix4.equals(matrix5)) {
                    matrix4.set(matrix5);
                    l5Var2.n = true;
                    l5Var2.N.invalidate();
                }
            }
            float T12 = org.telegram.messenger.g0.T1(1.0f, 1.0952381f, this.x0);
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
    public final void T0() {
        bi.x5 x5Var;
        ?? r16;
        LinearLayout linearLayout;
        float min;
        float f10;
        if (this.a == null || this.e == null || this.s0 == null || this.D == null || (x5Var = this.E) == null || this.actionBar == null) {
            return;
        }
        x5Var.bringToFront();
        View m10 = this.a.e3.m(this.h);
        float i7 = m10 == null ? this.a.e3.L0() > this.h ? 1.0f : 0.0f : Utilities.i((this.a.getPaddingTop() - m10.getTop()) / m10.getHeight(), 1.0f, 0.0f);
        this.y0 = i7;
        float f11 = this.I0;
        boolean z9 = f11 > 0.0f || this.H0 > 0.0f;
        if (z9) {
            i7 = f11 > 0.0f ? 0.0f : (1.0f - this.H0) * i7;
        }
        this.x0 = i7;
        W0();
        float max = m10 != null ? Math.max(0.0f, (m10.getHeight() / 2.0f) + org.telegram.messenger.g0.L(24.0f)) * this.x0 : 0.0f;
        float T1 = org.telegram.messenger.g0.T1(1.0f, 0.8f, this.x0);
        this.e.setPivotX(r11.getWidth() * 0.5f);
        this.e.setPivotY(0.0f);
        this.e.setScaleX(T1);
        this.e.setScaleY(T1);
        this.e.setAlpha(1.0f - Utilities.l(org.telegram.messenger.g0.z1(i7, 0.75f, 1.0f)));
        this.e.setVisibility((z9 || (m10 != null && i7 < 1.0f && m10.getBottom() > this.a.getPaddingTop() && m10.getTop() < this.a.getHeight() - this.a.getPaddingBottom())) ? 0 : 4);
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
        if (z9) {
            boolean z10 = this.I0 == 0.0f ? r16 : false;
            float f12 = this.H0;
            if (z10) {
                min = 0.3f * f12;
                f10 = 0.6f;
            } else {
                min = Math.min(1.0f, 1.8f * f12) * 0.06f;
                f10 = 0.84f;
            }
            float f13 = min + f10;
            this.actionBar.getLocationInWindow(iArr2);
            this.n.getLocationInWindow(iArr);
            float L = (org.telegram.messenger.g0.L(4.0f) + (this.actionBar.getHeight() + (iArr2[r16] - iArr[r16]))) - ((1.0f - f12) * (z10 ? 0.0f : this.e.getHeight() * 0.35f));
            if (z10) {
                L = a8.p0.f(0.9f - f13, this.e.getHeight(), 2.0f, L);
            }
            float width = (this.n.getWidth() - this.e.getWidth()) / 2.0f;
            if (!z10) {
                f12 = Math.min(1.0f, f12 * 2.0f);
            }
            if (m10 != null) {
                this.a.getLocationInWindow(iArr2);
                float width2 = ((this.f.getWidth() - this.e.getWidth()) / 2.0f) + this.f.getX() + m10.getX() + (iArr2[0] - iArr[0]);
                float y10 = this.f.getY() + m10.getY() + (iArr2[r16] - iArr[r16]);
                float l10 = Utilities.l(1.0f - ((L - y10) / (this.e.getHeight() * 0.5f)));
                if (l10 >= 1.0f) {
                    org.telegram.messenger.g0.r(this.K0);
                    ValueAnimator valueAnimator = this.J0;
                    if (valueAnimator != null) {
                        this.J0 = null;
                        valueAnimator.cancel();
                    }
                    this.H0 = 0.0f;
                    this.I0 = 0.0f;
                    T0();
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
        boolean z11 = i7 > 0.0f ? r16 : false;
        if (this.F != z11 && (linearLayout = this.s0) != null) {
            Rect rect = this.G;
            if (z11) {
                if (linearLayout.getWidth() != 0 && this.s0.getHeight() != 0) {
                    rect.set(this.s0.getLeft(), this.s0.getTop(), this.s0.getRight(), this.s0.getBottom());
                }
            }
            this.e.setOnFrontContentPresented(null);
            org.telegram.messenger.g0.E2(this.s0);
            this.F = z11;
            if (z11) {
                this.E.addView(this.s0, new FrameLayout.LayoutParams(rect.width(), rect.height(), 51));
                this.s0.layout(0, 0, rect.width(), rect.height());
                S0();
            } else {
                l5 l5Var = this.e;
                l5Var.i(0.0f, 0.0f);
                LinearLayout linearLayout2 = l5Var.M;
                org.telegram.messenger.g0.E2(linearLayout2);
                linearLayout2.setScaleX(1.0f);
                linearLayout2.setScaleY(1.0f);
                linearLayout2.setRotationX(0.0f);
                linearLayout2.setRotationY(0.0f);
                linearLayout2.setTranslationX(0.0f);
                linearLayout2.setTranslationY(0.0f);
                e6 e6Var = l5Var.O;
                e6Var.setScaleX(1.0f);
                e6Var.setScaleY(1.0f);
                l5Var.E.addView(linearLayout2, l5Var.P);
                this.s0.layout(rect.left, rect.top, rect.right, rect.bottom);
                this.e.getClass();
                S0();
            }
            this.E.invalidate();
        }
        U0(i7);
        if (this.F) {
            S0();
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

    public final void U0(float f10) {
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.k6.G6);
        this.t0.setTextColor(org.telegram.messenger.g0.d2(f10, -1, themedColor));
        org.telegram.ui.Components.j6 j6Var = this.u0;
        float[] fArr = this.e.a0;
        int i7 = -7868417;
        if (fArr != null) {
            i7 = i0.a.f(fArr[8], p7.p(-7868417, 0, fArr), p7.p(-7868417, 3, fArr));
        }
        j6Var.setTextColor(org.telegram.messenger.g0.d2(f10, i7, i0.a.o(themedColor, Math.round(142.8f))));
        f6 f6Var = this.v0;
        if (f6Var != null) {
            f6Var.y = org.telegram.messenger.g0.d2(f10, -1, getThemedColor(org.telegram.ui.ActionBar.k6.Ci));
        }
        o5 o5Var = this.w0;
        if (o5Var != null) {
            float[] fArr2 = this.e.a0;
            int i10 = -9577217;
            if (fArr2 != null) {
                i10 = i0.a.f(fArr2[8], p7.p(-9577217, 0, fArr2), p7.p(-9577217, 3, fArr2));
            }
            o5Var.a = i0.a.o(i10, Math.round((1.0f - f10) * 255.0f));
        }
        this.t0.invalidate();
    }

    public final void V0(float[] fArr) {
        if (this.B0 == null || this.C0 == null) {
            return;
        }
        float f10 = p7.j(getThemedColor(org.telegram.ui.ActionBar.k6.a7))[0];
        boolean z9 = f10 < 0.6f;
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.k6.Ci);
        if (fArr != null && fArr.length >= 18) {
            int[] iArr = new int[2];
            for (int i7 = 0; i7 < 2; i7++) {
                int i10 = i7 * 4;
                float f11 = fArr[i10 + 10];
                iArr[i7] = f11 < 0.0f ? themedColor : p7.n(themedColor, (int) f11, (int) fArr[i10 + 11]);
            }
            themedColor = i0.a.f(fArr[8], iArr[0], iArr[1]);
        }
        float f12 = z9 ? f10 + 0.25f : 0.0f;
        float f13 = z9 ? 1.0f : f10 - 0.2f;
        float[] j3 = p7.j(themedColor);
        float f14 = j3[0];
        if (f14 < f12 || f14 > f13) {
            themedColor = (themedColor & (-16777216)) | (p7.l(Math.max(f12, Math.min(f13, f14)), j3[1], j3[2]) & 16777215);
        }
        if (themedColor == this.N0) {
            return;
        }
        this.N0 = themedColor;
        int themedColor2 = i0.a.h(themedColor) <= 0.550000011920929d ? getThemedColor(org.telegram.ui.ActionBar.k6.Gi) : -16777216;
        fi.d[] dVarArr = {this.B0, this.C0};
        for (int i11 = 0; i11 < 2; i11++) {
            fi.d dVar = dVarArr[i11];
            dVar.setColor(themedColor);
            dVar.setTextColor(themedColor2);
        }
    }

    public final void W0() {
        fi.w3 w3Var = this.a;
        if (w3Var == null || this.e == null) {
            return;
        }
        float b10 = w3Var.D2.b(1);
        this.e.setAdditionalTilt(Math.max(0.0f, (this.x0 * 10.0f) + ((((float) Math.sqrt(Utilities.l(this.x0))) * 90.0f) - 10.0f)) + Math.min(10.0f, this.a.D2.b(3) * 40.0f) + (-Math.min(10.0f, b10 * 40.0f)));
        this.e.setUseGyroscope(1.0f - ((float) Math.pow(this.x0, 0.33000001311302185d)));
    }

    public final void X0(boolean z9) {
        boolean N0 = N0();
        fi.w3 w3Var = this.a;
        q41[] q41VarArr = this.r0;
        if (w3Var != null && this.o0 != N0) {
            this.o0 = N0;
            w3Var.C0();
            for (q41 q41Var : q41VarArr) {
                if (q41Var != null) {
                    q41Var.C0();
                }
            }
            this.a.f3.O(false);
            this.a.e3.h1(0, 0);
            this.a.post(new e4(this, 10));
        }
        if (N0) {
            return;
        }
        for (q41 q41Var2 : q41VarArr) {
            if (q41Var2 != null) {
                Y0(q41Var2, z9);
            }
        }
        bi.t tVar = this.n0;
        if (tVar != null) {
            tVar.post(new e4(this, 5));
            this.n0.post(new e4(this, 6));
        }
    }

    @Override // org.telegram.ui.Components.n41
    public final void Z(ArrayList arrayList, l41 l41Var) {
        m0 x10 = m0.x(this.currentAccount);
        a1();
        arrayList.add(x31.m(this.R));
        this.h = arrayList.size();
        i5 i5Var = this.f;
        x31 x31Var = new x31(-4);
        x31Var.c = i5Var;
        x31Var.z = -1;
        x31Var.e = true;
        arrayList.add(x31Var);
        arrayList.add(x31.m(this.z0));
        boolean N0 = N0();
        this.o0 = N0;
        if (N0) {
            String M0 = id.M0(2131743022, null);
            String M02 = id.M0(2131743021, null);
            int i7 = p5.b;
            x31 K = x31.K(p5.class);
            K.k = R.drawable.wallet_learn_instant;
            K.l = M0;
            K.m = M02;
            arrayList.add(K);
            String M03 = id.M0(2131743071, null);
            String M04 = id.M0(2131743070, null);
            x31 K2 = x31.K(p5.class);
            K2.k = R.drawable.wallet_learn_fees;
            K2.l = M03;
            K2.m = M04;
            arrayList.add(K2);
            String M05 = id.M0(2131743185, null);
            String M06 = id.M0(2131743184, null);
            x31 K3 = x31.K(p5.class);
            K3.k = R.drawable.wallet_learn_verified;
            K3.l = M05;
            K3.m = M06;
            arrayList.add(K3);
            arrayList.add(x31.m(this.a0));
        } else if (this.n0 != null) {
            if (this.R0 && !this.S0 && x10.v() > 500000000) {
                arrayList.add(x31.k(this.c0));
            }
            bi.t tVar = this.n0;
            x31 x31Var2 = new x31(-3);
            x31Var2.c = tVar;
            x31Var2.z = 0;
            x31Var2.y = 1;
            arrayList.add(x31Var2);
        }
        w70 w70Var = this.Z;
        if (w70Var != null) {
            this.b0 = false;
            w70Var.animate().cancel();
            this.Z.setAlpha(0.0f);
            this.Z.setVisibility(4);
        }
    }

    public final void Z0() {
        s8 s8Var = this.i0;
        if (s8Var == null || this.p0 == null || s8Var.x == 0.0f) {
            return;
        }
        s8Var.x = 0.0f;
        s8Var.c.setVisibility(8);
        s8Var.invalidate();
    }

    @Override // org.telegram.ui.Components.n41
    public final CharSequence a0() {
        return id.M0(2131743006, null);
    }

    public final void a1() {
        if (this.S == null) {
            return;
        }
        m0 x10 = m0.x(this.currentAccount);
        boolean z9 = this.S.isAttachedToWindow() && this.S.isLaidOut();
        h5 h5Var = this.S;
        FrameLayout frameLayout = this.T;
        Boolean bool = x10.i;
        h5Var.i(frameLayout, (bool == null || !bool.booleanValue() || TextUtils.isEmpty(x10.j)) ? false : true, z9);
        ArrayList arrayList = x10.G;
        int size = arrayList.size();
        int i7 = 0;
        long j3 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            i0 i0Var = (i0) obj;
            if (!i0Var.e) {
                long j10 = i0Var.c;
                if (j10 >= 0) {
                    j3 += j10;
                }
            }
        }
        boolean z10 = j3 > 500000000;
        if (z10) {
            this.W.setText(x0(2131743065, j3));
        }
        this.S.i(this.V, z10, z9);
        long j11 = bi.ea.y(this.currentAccount, true).p().amount;
        boolean z11 = j11 > 500000000;
        if (z11) {
            this.Y.setText(x0(2131743103, j11));
        }
        this.S.i(this.X, z11, z9);
    }

    @Override // org.telegram.ui.Components.n41
    public final void b0(x31 x31Var, View view) {
        e0 e0Var;
        Object obj = x31Var.G;
        if (obj instanceof TL_wallet.nftItem) {
            H0((TL_wallet.nftItem) obj);
            return;
        }
        if (x31Var.d == -10001 && (e0Var = this.E0) != null) {
            e0Var.e();
        } else if (obj instanceof TL_wallet.walletTransaction) {
            G0(getParentActivity(), this.currentAccount, (TL_wallet.walletTransaction) x31Var.G, null, null, null, null, getResourceProvider());
        }
    }

    @Override // org.telegram.ui.Components.n41
    public final boolean c0(x31 x31Var, View view) {
        b8 b8Var;
        if (!(view instanceof o7) || (b8Var = this.j0) == null) {
            return false;
        }
        b8Var.S((o7) view);
        return true;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean canBeginSlide() {
        b8 b8Var = this.j0;
        return (b8Var == null || !b8Var.p0) && super.canBeginSlide();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.telegram.ui.Components.n41, org.telegram.ui.ActionBar.f2
    public final View createView(Context context) {
        ValueAnimator valueAnimator = this.m0;
        if (valueAnimator != null) {
            this.m0 = null;
            valueAnimator.cancel();
        }
        P0();
        t5 t5Var = this.q0;
        if (t5Var != null) {
            t5Var.b(null);
        }
        this.f = null;
        this.S = null;
        this.R = null;
        this.n0 = null;
        this.p0 = null;
        q41[] q41VarArr = this.r0;
        int i7 = 0;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        Object[] objArr5 = 0;
        q41VarArr[0] = null;
        final int i10 = 1;
        q41VarArr[1] = null;
        e0 e0Var = this.E0;
        boolean z9 = (e0Var == null || e0Var.a.isEmpty()) ? false : true;
        this.f0 = z9;
        if (!z9) {
            this.e0 = 0;
        } else if (this.F0) {
            this.e0 = 1;
        }
        b8 b8Var = this.j0;
        if (b8Var != null) {
            b8Var.p();
        }
        this.j0 = null;
        View createView = super.createView(context);
        oa0 oa0Var = new oa0(this, context);
        oa0Var.addView(createView, c8.ha.c(-1.0f, -1));
        this.fragmentView = oa0Var;
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i11 = org.telegram.ui.ActionBar.k6.a7;
        org.telegram.ui.ActionBar.r6.i(i11, kVar, getResourceProvider());
        this.actionBar.setCastShadows(false);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setClipChildren(false);
        this.actionBar.setClipToPadding(false);
        org.telegram.ui.ActionBar.y q10 = this.actionBar.q();
        int i12 = 2;
        org.telegram.ui.ActionBar.r0 a10 = q10.a(2, R.drawable.scan_qr);
        this.L0 = a10;
        final int i13 = 3;
        a10.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Wallet.g4
            public final /* synthetic */ x5 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i13) {
                    case 0:
                        x5 x5Var = this.b;
                        x5Var.getClass();
                        x5Var.presentFragment(new za1(6, null));
                        break;
                    case 1:
                        x5.f0(this.b);
                        break;
                    case 2:
                        x5.i0(this.b);
                        break;
                    case 3:
                        this.b.K0();
                        break;
                    default:
                        x5.d0(this.b);
                        break;
                }
            }
        });
        q10.a(1, R.drawable.ic_ab_other).setOnClickListener(new fk0(21, this, context));
        v41 v41Var = new v41(i12, context, this);
        this.R = v41Var;
        v41Var.setClipToPadding(false);
        this.R.setClipChildren(false);
        this.R.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(4.0f));
        h5 h5Var = new h5(this, context);
        this.S = h5Var;
        h5Var.setDefaultRadiusDp(22);
        this.S.setOnAnimatedHeightChangedListener(new e4(this, 12));
        TextView textView = new TextView(context);
        this.U = textView;
        textView.setText(id.M0(2131742965, null));
        this.T = u0(this.U, new e4(this, i7));
        TextView textView2 = new TextView(context);
        this.W = textView2;
        this.V = u0(textView2, new e4(this, i10));
        TextView textView3 = new TextView(context);
        this.Y = textView3;
        this.X = u0(textView3, new e4(this, i12));
        this.R.addView(this.S, c8.ha.c(-2.0f, -1));
        w70 w70Var = new w70(context, null);
        this.Z = w70Var;
        this.b0 = false;
        w70Var.setAlpha(0.0f);
        w70 w70Var2 = this.Z;
        int i14 = org.telegram.ui.ActionBar.k6.z6;
        org.telegram.ui.ActionBar.r6.V(w70Var2, i14, this.resourceProvider);
        this.Z.setTextSize(1, 13.0f);
        this.Z.setGravity(17);
        this.Z.setText(Q0(id.M0(2131743009, null), org.telegram.ui.ActionBar.k6.Uc, this.resourceProvider, new f4(context, objArr5 == true ? 1 : 0)));
        final int i15 = 4;
        this.Z.setVisibility(4);
        FrameLayout frameLayout = (FrameLayout) createView;
        if (frameLayout != null) {
            frameLayout.addView(this.Z, c8.ha.d(-1, -2.0f, 81, 12.0f, 0.0f, 12.0f, 24.0f));
        }
        i5 i5Var = new i5(this, context, objArr4 == true ? 1 : 0);
        this.a0 = i5Var;
        i5Var.setImportantForAccessibility(2);
        this.c0 = new FrameLayout(context);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.d0 = frameLayout2;
        int i16 = org.telegram.ui.ActionBar.k6.d6;
        int themedColor = getThemedColor(i16);
        int themedColor2 = getThemedColor(i16);
        int i17 = org.telegram.ui.ActionBar.k6.i6;
        org.telegram.ui.Cells.y b02 = org.telegram.ui.ActionBar.k6.b0(themedColor, org.telegram.ui.ActionBar.k6.w(themedColor2, getThemedColor(i17)), 16, 16);
        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i16);
        org.telegram.ui.ActionBar.n6 q11 = org.telegram.ui.ActionBar.r6.q(i16, i17);
        org.telegram.ui.ActionBar.f6 resourceProvider = getResourceProvider();
        frameLayout2.setBackground(b02);
        org.telegram.ui.ActionBar.r6.k(frameLayout2, b02, N, q11, resourceProvider);
        this.c0.addView(this.d0, c8.ha.d(-1, -2.0f, 55, 12.0f, 0.0f, 12.0f, 12.0f));
        ImageView imageView = new ImageView(context);
        float N2 = org.telegram.messenger.g0.N(10.0f);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{N2, N2, N2, N2, N2, N2, N2, N2}, null, null));
        shapeDrawable.setShaderFactory(new j5());
        imageView.setBackground(shapeDrawable);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.wallet_protect);
        this.d0.addView(imageView, c8.ha.d(28, 28.0f, 19, 14.0f, 11.0f, 16.0f, 11.0f));
        TextView textView4 = new TextView(context);
        org.telegram.ui.ActionBar.r6.V(textView4, org.telegram.ui.ActionBar.k6.q7, this.resourceProvider);
        jg.g.v(textView4, 1, 16.0f, null, 2131743047);
        this.d0.addView(textView4, c8.ha.d(-1, -2.0f, 19, 58.0f, 0.0f, 32.0f, 0.0f));
        FrameLayout frameLayout3 = this.d0;
        final Object[] objArr6 = objArr3 == true ? 1 : 0;
        frameLayout3.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Wallet.g4
            public final /* synthetic */ x5 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (objArr6) {
                    case 0:
                        x5 x5Var = this.b;
                        x5Var.getClass();
                        x5Var.presentFragment(new za1(6, null));
                        break;
                    case 1:
                        x5.f0(this.b);
                        break;
                    case 2:
                        x5.i0(this.b);
                        break;
                    case 3:
                        this.b.K0();
                        break;
                    default:
                        x5.d0(this.b);
                        break;
                }
            }
        });
        c8.ka.b(this.d0, 0.02f, 1.2f);
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.y = frameLayout4;
        frameLayout4.setClipChildren(false);
        this.y.setClipToPadding(false);
        this.actionBar.addView(this.y, c8.ha.d(-1, 56.0f, 87, 64.0f, 0.0f, 96.0f, 0.0f));
        View view = new View(context);
        this.D = view;
        this.y.addView(view, c8.ha.e(1, 1, 19));
        this.F = false;
        this.G.setEmpty();
        this.I.reset();
        bi.x5 x5Var = new bi.x5(this, context);
        this.E = x5Var;
        x5Var.setClipChildren(false);
        this.E.setClipToPadding(false);
        l5 l5Var = new l5(this, context);
        this.e = l5Var;
        l5Var.setDiamondOnCard(true);
        this.e.setCardOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Wallet.g4
            public final /* synthetic */ x5 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i10) {
                    case 0:
                        x5 x5Var2 = this.b;
                        x5Var2.getClass();
                        x5Var2.presentFragment(new za1(6, null));
                        break;
                    case 1:
                        x5.f0(this.b);
                        break;
                    case 2:
                        x5.i0(this.b);
                        break;
                    case 3:
                        this.b.K0();
                        break;
                    default:
                        x5.d0(this.b);
                        break;
                }
            }
        });
        this.a.D2.b.add(this.x);
        i5 i5Var2 = new i5(this, context, i10);
        this.f = i5Var2;
        i5Var2.setImportantForAccessibility(2);
        m5 m5Var = new m5(this, context);
        this.n = m5Var;
        m5Var.setClipChildren(false);
        this.n.setClipToPadding(false);
        this.n.addView(this.e, c8.ha.c(-2.0f, -1));
        oa0Var.addView(this.n, c8.ha.c(-1.0f, -1));
        this.a.setClipChildren(false);
        this.a.setClipToPadding(false);
        this.s0 = this.e.getBalanceLayout();
        this.t0 = this.e.getBalanceView();
        this.u0 = this.e.getUsdBalanceView();
        this.e.setCardHolder(t10.p(getUserConfig().f()).toUpperCase());
        this.A0 = 0.0f;
        c61 c61Var = new c61(23, context, this);
        this.z0 = c61Var;
        c61Var.setOrientation(0);
        this.z0.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(12.0f));
        fi.d dVar = new fi.d(context, this.resourceProvider, true);
        dVar.setRoundRadius(24);
        this.B0 = dVar;
        dVar.setText(id.M0(2131743207, null));
        this.z0.addView(this.B0, c8.ha.m(1.0f, 0, 48, 0, 4, 0));
        final int i18 = 2;
        this.B0.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Wallet.g4
            public final /* synthetic */ x5 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i18) {
                    case 0:
                        x5 x5Var2 = this.b;
                        x5Var2.getClass();
                        x5Var2.presentFragment(new za1(6, null));
                        break;
                    case 1:
                        x5.f0(this.b);
                        break;
                    case 2:
                        x5.i0(this.b);
                        break;
                    case 3:
                        this.b.K0();
                        break;
                    default:
                        x5.d0(this.b);
                        break;
                }
            }
        });
        fi.d dVar2 = new fi.d(context, this.resourceProvider, true);
        dVar2.setRoundRadius(24);
        this.C0 = dVar2;
        dVar2.setText(id.M0(2131743025, null));
        this.C0.setEnabled(m0.x(this.currentAccount).e());
        this.C0.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Wallet.g4
            public final /* synthetic */ x5 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i15) {
                    case 0:
                        x5 x5Var2 = this.b;
                        x5Var2.getClass();
                        x5Var2.presentFragment(new za1(6, null));
                        break;
                    case 1:
                        x5.f0(this.b);
                        break;
                    case 2:
                        x5.i0(this.b);
                        break;
                    case 3:
                        this.b.K0();
                        break;
                    default:
                        x5.d0(this.b);
                        break;
                }
            }
        });
        this.z0.addView(this.C0, c8.ha.m(1.0f, 0, 48, 4, 0, 0));
        V0(this.e.getStickerStyle());
        this.D0 = m0.x(this.currentAccount).B();
        this.a.setDescendantFocusability(131072);
        b8 b8Var2 = new b8(this, this.e, new m4.d0(this, oa0Var, objArr2 == true ? 1 : 0), null);
        this.j0 = b8Var2;
        oa0Var.addView(b8Var2, c8.ha.c(-1.0f, -1));
        this.k0 = "";
        int i19 = 9;
        bi.t tVar = new bi.t(context, i19);
        this.n0 = tVar;
        tVar.setOrientation(1);
        org.telegram.ui.ActionBar.r6.i(i11, this.n0, getResourceProvider());
        fi.g1 g1Var = new fi.g1(this, context, this.resourceProvider, i19);
        this.p0 = g1Var;
        g1Var.setAllowDisallowInterceptTouch(false);
        this.p0.setAdapter(new bi.g5(i19, context, this));
        u61 n10 = this.p0.n(-2, true);
        this.g0 = n10;
        n10.g(i14, org.telegram.ui.ActionBar.k6.G6, i14, i17, i16);
        org.telegram.ui.ActionBar.r6.C(this.g0, org.telegram.ui.ActionBar.k6.d0(org.telegram.messenger.g0.L(20.0f), getThemedColor(i16)), org.telegram.ui.ActionBar.r6.N(i16), getResourceProvider());
        this.h0 = new FrameLayout(context);
        s8 s8Var = new s8(context, this.g0, this.resourceProvider, new l4(this, objArr == true ? 1 : 0), new l4(this, i10), new l4(this, 2));
        this.i0 = s8Var;
        this.h0.addView(s8Var, c8.ha.d(-1, 40.0f, 48, 16.0f, 0.0f, 16.0f, 0.0f));
        this.p0.setPosition(this.e0);
        Z0();
        this.n0.addView(this.h0, c8.ha.k(0.0f, 0.0f, 0.0f, -6.0f, -1, 52));
        this.n0.addView(this.p0, c8.ha.l(1.0f, -1, 0));
        L0(this.f0);
        e0 e0Var2 = this.E0;
        if (e0Var2 != null) {
            this.j0.Y(e0Var2);
        }
        this.a.j(new ui(this, 21));
        l41 l41Var = this.a.f3;
        l41Var.r = false;
        l41Var.O(false);
        t5 t5Var2 = new t5(this);
        this.q0 = t5Var2;
        t5Var2.b(this.a);
        R0();
        this.D0.h();
        this.actionBar.post(new e4(this, i19));
        this.a.post(new e4(this, 10));
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.ls
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        fi.w3 w3Var;
        l41 l41Var;
        if (i10 != this.currentAccount) {
            return;
        }
        if (i7 == qs.a4 && this.t0 != null) {
            R0();
            Iterator it = this.P0.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
            return;
        }
        if (i7 == qs.y3) {
            a1();
            return;
        }
        if (i7 == qs.q0) {
            if (objArr.length > 0) {
                Object obj = objArr[0];
                if (obj instanceof TL_account.Password) {
                    this.R0 = true;
                    this.S0 = ((TL_account.Password) obj).has_password;
                    fi.w3 w3Var2 = this.a;
                    if (w3Var2 == null || (l41Var = w3Var2.f3) == null) {
                        return;
                    }
                    l41Var.O(true);
                    return;
                }
            }
            getConnectionsManager().sendRequestTyped(new TL_account.getPassword(), new d3.b(1), new d(this, 7));
            return;
        }
        if (i7 != qs.b4 || objArr.length <= 0) {
            return;
        }
        Object obj2 = objArr[0];
        l0 l0Var = this.D0;
        if (obj2 != l0Var || (w3Var = this.a) == null || w3Var.f3 == null) {
            return;
        }
        if (l0Var.b.isEmpty()) {
            l0 l0Var2 = this.D0;
            if (!l0Var2.h) {
                l0Var2.h();
            }
        }
        X0(true);
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean onBackPressed(boolean z9) {
        ai.i0 i0Var = this.M0;
        if (i0Var != null) {
            if (z9) {
                i0Var.e();
            }
            return false;
        }
        s8 s8Var = this.i0;
        if (s8Var == null || !s8Var.y) {
            return super.onBackPressed(z9);
        }
        if (z9) {
            s8Var.b(false);
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onBeginSlide() {
        t5 t5Var = this.q0;
        if (t5Var != null) {
            t5Var.c();
        }
        fi.w3 w3Var = this.a;
        if (w3Var != null) {
            w3Var.C0();
        }
        q41 y02 = y0();
        if (y02 != null) {
            y02.C0();
        }
        super.onBeginSlide();
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean onFragmentCreate() {
        Context context = org.telegram.messenger.t0.b;
        if (y5.k0.compareAndSet(false, true)) {
            y5.l0.postRunnable(new f4(context, 2));
        }
        getNotificationCenter().c(this, qs.a4);
        getNotificationCenter().c(this, qs.y3);
        getNotificationCenter().c(this, qs.b4);
        getNotificationCenter().c(this, qs.q0);
        m0 x10 = m0.x(this.currentAccount);
        if (x10.o == null) {
            x10.o = new e0(x10);
        }
        e0 e0Var = x10.o;
        this.E0 = e0Var;
        e4 e4Var = this.G0;
        ArrayList arrayList = e0Var.d;
        if (!arrayList.contains(e4Var)) {
            arrayList.add(e4Var);
        }
        org.telegram.ui.Components.r2 r2Var = this.T0;
        if (r2Var != null) {
            r2Var.run();
        }
        int i7 = x10.D;
        x10.D = i7 + 1;
        HashSet hashSet = x10.E;
        boolean isEmpty = hashSet.isEmpty();
        hashSet.add(Integer.valueOf(i7));
        if (isEmpty) {
            x10.S();
        }
        this.T0 = new org.telegram.ui.Components.r2(x10, i7, 28);
        getConnectionsManager().sendRequestTyped(new TL_account.getPassword(), new d3.b(1), new d(this, 7));
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onFragmentDestroy() {
        ai.i0 i0Var = this.M0;
        if (i0Var != null) {
            i0Var.g();
            org.telegram.messenger.g0.E2(this.M0);
            this.M0 = null;
        }
        org.telegram.messenger.g0.r(this.K0);
        ValueAnimator valueAnimator = this.J0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        b8 b8Var = this.j0;
        if (b8Var != null) {
            b8Var.p();
        }
        l5 l5Var = this.e;
        if (l5Var != null) {
            l5Var.setOnFrontContentPresented(null);
        }
        ValueAnimator valueAnimator2 = this.m0;
        if (valueAnimator2 != null) {
            this.m0 = null;
            valueAnimator2.cancel();
        }
        e0 e0Var = this.E0;
        if (e0Var != null) {
            e0Var.d.remove(this.G0);
        }
        P0();
        t5 t5Var = this.q0;
        if (t5Var != null) {
            t5Var.b(null);
        }
        getNotificationCenter().n(this, qs.a4);
        getNotificationCenter().n(this, qs.y3);
        getNotificationCenter().n(this, qs.b4);
        getNotificationCenter().n(this, qs.q0);
        org.telegram.messenger.g0.E2(this.E);
        l0 l0Var = this.D0;
        if (l0Var != null) {
            l0Var.a();
        }
        super.onFragmentDestroy();
        org.telegram.ui.Components.r2 r2Var = this.T0;
        if (r2Var != null) {
            r2Var.run();
            this.T0 = null;
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onInsets(int i7, int i10, int i11, int i12) {
        this.a.setPadding(0, 0, 0, i12);
        this.a.setClipToPadding(false);
        w70 w70Var = this.Z;
        if (w70Var != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) w70Var.getLayoutParams();
            layoutParams.bottomMargin = org.telegram.messenger.g0.L(24.0f) + i12;
            this.Z.setLayoutParams(layoutParams);
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onPause() {
        super.onPause();
        ai.i0 i0Var = this.M0;
        if (i0Var != null) {
            i0Var.g();
            org.telegram.messenger.g0.E2(this.M0);
            this.M0 = null;
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onRequestPermissionsResultFragment(int i7, String[] strArr, int[] iArr) {
        if (i7 != 44 || getParentActivity() == null) {
            return;
        }
        if (iArr.length > 0 && iArr[0] == 0) {
            K0();
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        alertDialog$Builder.a.T = org.telegram.messenger.g0.X2(id.M0(2131746504, null));
        alertDialog$Builder.k(id.M0(2131747301, null), new h4(this));
        alertDialog$Builder.h(id.M0(2131751772, null), null);
        int i10 = org.telegram.ui.ActionBar.k6.L5;
        alertDialog$Builder.m(R.raw.permission_request_camera, 72, org.telegram.ui.ActionBar.k6.x0(null, i10, false), null);
        alertDialog$Builder.n(i10, null);
        alertDialog$Builder.p();
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onResume() {
        super.onResume();
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar != null) {
            kVar.post(new e4(this, 9));
        }
        m0.x(this.currentAccount).E();
        if (this.E0 != null && m0.x(this.currentAccount).G()) {
            e0 e0Var = this.E0;
            if (!e0Var.j) {
                e0Var.b();
                e0Var.f(true);
            }
        }
        R0();
        if (this.a != null) {
            X0(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onThemeColorsChanged() {
        super.onThemeColorsChanged();
        try {
            if (this.t0 != null && this.u0 != null && this.e != null) {
                U0(this.x0);
            }
            l5 l5Var = this.e;
            if (l5Var != null && this.B0 != null && this.C0 != null) {
                V0(l5Var.getStickerStyle());
            }
            w70 w70Var = this.Z;
            if (w70Var != null) {
                w70Var.invalidate();
            }
            TextView textView = this.W;
            if (textView != null) {
                textView.invalidate();
            }
            TextView textView2 = this.Y;
            if (textView2 != null) {
                textView2.invalidate();
            }
            h5 h5Var = this.S;
            if (h5Var != null) {
                h5Var.invalidate();
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final void s0(boolean z9) {
        org.telegram.messenger.g0.r(this.K0);
        float f10 = z9 ? 1.0f : 0.0f;
        if (this.I0 == f10) {
            return;
        }
        this.I0 = f10;
        ValueAnimator valueAnimator = this.J0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        T0();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.H0, f10);
        this.J0 = ofFloat;
        ofFloat.setDuration(z9 ? 260L : 120L);
        this.J0.setInterpolator(z9 ? new xq(0.05d, 0.7d, 0.1d, 1.0d) : new xq(0.4d, 0.0d, 0.2d, 1.0d));
        this.J0.addUpdateListener(new k4(this, 1));
        this.J0.addListener(new s81(this, 6));
        this.J0.start();
    }

    public final FrameLayout u0(TextView textView, Runnable runnable) {
        Context context = textView.getContext();
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(14.0f));
        int i7 = org.telegram.ui.ActionBar.k6.i6;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.k6.h0(getThemedColor(i7), 2, -1);
        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i7);
        org.telegram.ui.ActionBar.f6 resourceProvider = getResourceProvider();
        frameLayout.setBackground(h02);
        org.telegram.ui.ActionBar.r6.k(frameLayout, h02, null, N, resourceProvider);
        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.G6, getResourceProvider());
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setGravity(19);
        frameLayout.addView(textView, c8.ha.d(-1, -2.0f, 3, 0.0f, 0.0f, 42.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(R.drawable.attach_arrow_right);
        org.telegram.ui.ActionBar.r6.t(imageView, org.telegram.ui.ActionBar.k6.z6, getResourceProvider(), PorterDuff.Mode.SRC_IN);
        frameLayout.addView(imageView, c8.ha.e(-2, -2, 21));
        frameLayout.setOnClickListener(new i3(runnable, 3));
        textView.setDuplicateParentStateEnabled(true);
        c8.ka.b(textView, 0.02f, 1.2f);
        this.S.addView(frameLayout, c8.ha.o(-1, -2));
        return frameLayout;
    }

    public final CharSequence x0(int i7, long j3) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((char) 65532);
        wp wpVar = new wp(R.drawable.mini_gram_16, 0);
        wpVar.d = false;
        spannableStringBuilder.setSpan(wpVar, length, spannableStringBuilder.length(), 33);
        spannableStringBuilder.append((CharSequence) " ");
        int length2 = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) m0.o(j3, false));
        spannableStringBuilder.setSpan(new yz(org.telegram.ui.ActionBar.k6.Ci, getResourceProvider()), length2, spannableStringBuilder.length(), 33);
        return id.V(null, null, i7, spannableStringBuilder);
    }

    public final q41 y0() {
        if (z0()) {
            fi.g1 g1Var = this.p0;
            View currentView = g1Var == null ? null : g1Var.getCurrentView();
            if (currentView instanceof q41) {
                return (q41) currentView;
            }
        }
        return null;
    }

    public final boolean z0() {
        bi.t tVar;
        if (this.o0 || (tVar = this.n0) == null || !tVar.isAttachedToWindow()) {
            return false;
        }
        ViewParent parent = this.n0.getParent();
        fi.w3 w3Var = this.a;
        return parent == w3Var.e3.m(w3Var.f3.D.size() - 1);
    }
}
