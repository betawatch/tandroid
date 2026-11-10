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
import org.telegram.ui.Components.dt;
import org.telegram.ui.Components.k60;
import org.telegram.ui.Components.lz;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.o41;
import org.telegram.ui.Components.r41;
import org.telegram.ui.Components.ti;
import org.telegram.ui.Components.tx0;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.uy0;
import org.telegram.ui.Components.v61;
import org.telegram.ui.Components.vy0;
import org.telegram.ui.Components.w41;
import org.telegram.ui.Components.w70;
import org.telegram.ui.Components.wp;
import org.telegram.ui.Components.wq;
import org.telegram.ui.Components.x31;
import org.telegram.ui.Components.xz;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PasscodeActivity;
import org.telegram.ui.cb1;
import org.telegram.ui.e61;
import org.telegram.ui.h10;
import org.telegram.ui.ik0;
import org.telegram.ui.jq0;
import org.telegram.ui.ra0;
import org.telegram.ui.s90;
import org.telegram.ui.sb1;
import org.telegram.ui.u81;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes4.dex */
public final class z5 extends o41 implements ls {
    public static Typeface U0;
    public float A0;
    public fi.d B0;
    public fi.d C0;
    public View D;
    public k0 D0;
    public bi.x5 E;
    public d0 E0;
    public boolean F;
    public boolean F0;
    public float H0;
    public float I0;
    public ValueAnimator J0;
    public org.telegram.ui.ActionBar.r0 L0;
    public ai.i0 M0;
    public int N0;
    public SpannableString Q0;
    public w41 R;
    public boolean R0;
    public j5 S;
    public boolean S0;
    public FrameLayout T;
    public org.telegram.ui.Components.q2 T0;
    public TextView U;
    public FrameLayout V;
    public TextView W;
    public FrameLayout X;
    public TextView Y;
    public w70 Z;
    public k5 a0;
    public boolean b0;
    public FrameLayout c0;
    public FrameLayout d0;
    public n5 e;
    public k5 f;
    public boolean f0;
    public u61 g0;
    public int h;
    public FrameLayout h0;
    public u8 i0;
    public d8 j0;
    public float l0;
    public ValueAnimator m0;
    public o5 n;
    public bi.t n0;
    public boolean o0;
    public fi.g1 p0;
    public v5 q0;
    public int r;
    public boolean s;
    public LinearLayout s0;
    public org.telegram.ui.Components.i6 t0;
    public org.telegram.ui.Components.i6 u0;
    public h6 v0;
    public q5 w0;
    public float x0;
    public FrameLayout y;
    public float y0;
    public e61 z0;
    public final dt w = new dt(this, 24);
    public final j4 x = new org.telegram.ui.Components.ls() { // from class: org.telegram.ui.Wallet.j4
        @Override // org.telegram.ui.Components.ls
        public final void a(int i7, boolean z9) {
            fi.w3 w3Var;
            z5 z5Var = z5.this;
            dt dtVar = z5Var.w;
            if ((i7 == 1 || i7 == 3) && (w3Var = z5Var.a) != null) {
                z5Var.s = z9;
                w3Var.removeCallbacks(dtVar);
                dtVar.run();
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
    public final r41[] r0 = new r41[2];
    public final f4 G0 = new f4(this, 4);
    public final f4 K0 = new f4(this, 5);
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
                if (pathSegments.size() != 1 || (!"sendgrams".equalsIgnoreCase(pathSegments.get(0)) && d1(uri) == null)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v3, types: [org.telegram.ui.Components.v61, org.telegram.ui.Wallet.z4] */
    public static void G0(Context context, int i7, TL_wallet.walletTransaction wallettransaction, x10 x10Var, v10 v10Var, byte[] bArr, org.telegram.ui.Cells.m0 m0Var, org.telegram.ui.ActionBar.h6 h6Var) {
        y2[] y2VarArr;
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
                bi.k7 k7Var = new bi.k7(context, i7, 0L, h6Var, null);
                k7Var.d3 = wallettransaction;
                k7Var.g2(tL_starGiftUnique.slug, tL_starGiftUnique, null);
                k7Var.show();
                return;
            }
        }
        y2[] y2VarArr2 = new y2[1];
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
        if (x10Var == null && m0Var == null && i10 >= 0) {
            Rect rect = new Rect();
            context.getResources().getDrawable(R.drawable.sheet_shadow_round).getPadding(rect);
            viewArr = viewArr2;
            ?? z4Var = new z4(context, h6Var, arrayList, B, i7, rect, viewArr);
            z4Var.setPosition(i10);
            y2VarArr = y2VarArr2;
            z4Var.setAdapter(new a5(arrayList, context, h6Var, rect, i7, y2VarArr2));
            v10Var2 = v10Var;
            t02 = z4Var;
        } else {
            y2VarArr = y2VarArr2;
            viewArr = viewArr2;
            v10Var2 = v10Var;
            t02 = t0(context, i7, wallettransaction, x10Var, v10Var, bArr, m0Var, h6Var, y2VarArr, false);
        }
        y2[] y2VarArr3 = y2VarArr;
        b5 b5Var = new b5(context, t02, h6Var, t02, viewArr, context);
        y2VarArr3[0] = b5Var;
        if ((t02 instanceof v61) && v10Var2 != null) {
            b5Var.n(new sb1(11, v10Var2, wallettransaction));
        }
        y2VarArr3[0].A0(x10Var != null);
        y2 y2Var = y2VarArr3[0];
        y2Var.T0 = false;
        y2Var.show();
    }

    public static void I0(Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        int i7 = 1;
        org.telegram.ui.ActionBar.w2 l10 = org.telegram.messenger.k5.l(1, context, h6Var, false);
        FrameLayout frameLayout = new FrameLayout(context);
        int L = org.telegram.messenger.g0.L(16.0f);
        int i10 = org.telegram.ui.ActionBar.m6.h5;
        Drawable d02 = org.telegram.ui.ActionBar.m6.d0(L, org.telegram.ui.ActionBar.m6.w0(i10, h6Var));
        org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i10);
        frameLayout.setBackground(d02);
        org.telegram.ui.ActionBar.t6.j(frameLayout, d02, M, null, h6Var);
        frameLayout.setPadding(org.telegram.messenger.g0.L(36.0f), 0, org.telegram.messenger.g0.L(36.0f), org.telegram.messenger.g0.L(14.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(1);
        frameLayout.addView(linearLayout, c8.ha.c(-2.0f, -1));
        linearLayout.addView(new x6(qs.q2, context, false), c8.ha.t(qs.q2, qs.q2, 1, 0, -12, 0, -8));
        TextView textView = new TextView(context);
        textView.setText(id.M0(2131743097, null));
        org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.j5, h6Var);
        textView.setTextSize(1, 17.0f);
        textView.setTypeface(org.telegram.messenger.g0.o1("fonts/rmedium.ttf"));
        textView.setGravity(17);
        TextView f10 = org.telegram.messenger.camera.q.f(linearLayout, textView, c8.ha.t(-1, -2, 1, 0, 0, 0, 6), context);
        f10.setText(id.M0(2131743096, null));
        int i11 = org.telegram.ui.ActionBar.m6.z6;
        org.telegram.ui.ActionBar.t6.U(f10, i11, h6Var);
        f10.setTextSize(1, 14.0f);
        f10.setGravity(17);
        f10.setLineSpacing(org.telegram.messenger.g0.L(1.0f), 1.0f);
        linearLayout.addView(f10, c8.ha.t(-1, -2, 1, 0, 0, 0, 24));
        s5 s5Var = new s5(context, h6Var);
        s5Var.setPadding(org.telegram.messenger.g0.L(0.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(0.0f), org.telegram.messenger.g0.L(8.0f));
        s5Var.a(R.drawable.wallet_learn_instant, id.M0(2131743019, null), id.M0(2131743018, null));
        linearLayout.addView(s5Var, c8.ha.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
        s5 s5Var2 = new s5(context, h6Var);
        s5Var2.setPadding(org.telegram.messenger.g0.L(0.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(0.0f), org.telegram.messenger.g0.L(8.0f));
        s5Var2.a(R.drawable.wallet_learn_fees, id.M0(2131743068, null), id.M0(2131743067, null));
        linearLayout.addView(s5Var2, c8.ha.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
        s5 s5Var3 = new s5(context, h6Var);
        s5Var3.setPadding(org.telegram.messenger.g0.L(0.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(0.0f), org.telegram.messenger.g0.L(8.0f));
        s5Var3.a(R.drawable.wallet_learn_verified, id.M0(2131743182, null), id.M0(2131743181, null));
        linearLayout.addView(s5Var3, c8.ha.k(0.0f, 0.0f, 0.0f, 14.0f, -1, -2));
        fi.d h = org.telegram.messenger.k5.h(24, context, h6Var, true);
        h.setText(id.M0(2131743101, null));
        linearLayout.addView(h, c8.ha.t(-1, 48, 1, 0, 0, 0, 0));
        c8.ka.b(h, 0.02f, 1.1f);
        w70 w70Var = new w70(context, null);
        org.telegram.ui.ActionBar.t6.U(w70Var, i11, h6Var);
        w70Var.setTextSize(1, 13.0f);
        w70Var.setGravity(17);
        w70Var.setText(R0(id.M0(2131743006, null), org.telegram.ui.ActionBar.m6.Uc, h6Var, new g4(context, i7)));
        linearLayout.addView(w70Var, c8.ha.k(0.0f, 12.0f, 0.0f, 6.0f, -1, -2));
        l10.N = frameLayout;
        org.telegram.ui.ActionBar.w2[] w2VarArr = {l10};
        w2VarArr[0].u0(true);
        w2VarArr[0].N();
        h.setOnClickListener(new n4(w2VarArr, i7));
        w2VarArr[0].show();
    }

    public static void J0(int i7, Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        l0 x10 = l0.x(i7);
        if (x10.G()) {
            String t6 = x10.t();
            if (TextUtils.isEmpty(t6)) {
                return;
            }
            K0(context, i7, t6, true, null, h6Var);
        }
    }

    public static void K0(Context context, final int i7, String str, final boolean z9, final g gVar, final org.telegram.ui.ActionBar.h6 h6Var) {
        float f10;
        int i10 = 1;
        int i11 = 0;
        final org.telegram.ui.ActionBar.w2 w2Var = new org.telegram.ui.ActionBar.w2(1, context, h6Var, false);
        w2Var.v0(-12207881);
        w2Var.O(-12207881);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackground(new y5());
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(1);
        frameLayout.addView(linearLayout, c8.ha.f(-2.0f, -1, 55, org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(30.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f) + org.telegram.messenger.g0.n));
        x5 x5Var = new x5(context, str);
        if (!z9) {
            x5Var.b.setText(id.M0(2131746500, null));
        }
        linearLayout.addView(x5Var, c8.ha.r(qs.L4, qs.Z4, 1));
        TextView textView = new TextView(context);
        textView.setText(id.M0(2131743041, null));
        textView.setTextColor(-1);
        textView.setTextSize(1, 14.0f);
        textView.setGravity(17);
        textView.setLineSpacing(org.telegram.messenger.g0.L(1.0f), 1.0f);
        linearLayout.addView(textView, c8.ha.t(-1, -2, 1, 24, 0, 24, 20));
        final fi.d dVar = new fi.d(context, null, true);
        dVar.setRoundRadius(24);
        dVar.setColor(-1);
        dVar.setTextColor(-15556886);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (z9) {
            f10 = 12.0f;
            spannableStringBuilder.append((CharSequence) "$");
            spannableStringBuilder.setSpan(new wp(R.drawable.wallet_buy, 0), 0, spannableStringBuilder.length(), 33);
            spannableStringBuilder.append((CharSequence) " ").append((CharSequence) id.M0(2131743180, null));
        } else {
            f10 = 12.0f;
            wp wpVar = new wp(R.drawable.mini_gram_24, 0);
            wpVar.c(org.telegram.messenger.g0.L(20.0f));
            spannableStringBuilder.append((CharSequence) "G");
            spannableStringBuilder.setSpan(wpVar, 0, spannableStringBuilder.length(), 33);
            spannableStringBuilder.append((CharSequence) "  ").append((CharSequence) id.M0(2131743017, null));
        }
        dVar.setText(spannableStringBuilder);
        linearLayout.addView(dVar, c8.ha.t(-1, 48, 1, 0, 0, 0, 0));
        if (!z9) {
            textView.setVisibility(8);
            dVar.setVisibility(gVar != null ? 0 : 8);
        }
        View e10 = org.telegram.messenger.camera.q.e(context, R.drawable.ic_close_white);
        e10.setPadding(org.telegram.messenger.g0.L(f10), org.telegram.messenger.g0.L(f10), org.telegram.messenger.g0.L(f10), org.telegram.messenger.g0.L(f10));
        e10.setContentDescription(id.M0(2131752041, null));
        c8.ka.a(e10);
        frameLayout.addView(e10, c8.ha.d(48, 48.0f, 51, 4.0f, 2.0f, 0.0f, 0.0f));
        w2Var.N = frameLayout;
        w2Var.x = true;
        w2Var.u0 = false;
        w2Var.v0 = false;
        w2Var.O(-12207881);
        e10.setOnClickListener(new e4(w2Var, i11));
        x5Var.f = new q0(str, i10);
        w2Var.show();
        w2Var.E0(-12207881);
        org.telegram.messenger.g0.u3(w2Var, -12207881, false, null);
        org.telegram.messenger.g0.n3(w2Var, false);
        if (Build.VERSION.SDK_INT >= 29 && w2Var.getWindow() != null) {
            w2Var.getWindow().setNavigationBarContrastEnforced(false);
        }
        dVar.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Wallet.k4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                boolean z10 = z9;
                org.telegram.ui.ActionBar.w2 w2Var2 = w2Var;
                if (!z10) {
                    w2Var2.dismiss();
                    gVar.run();
                    return;
                }
                fi.d dVar2 = dVar;
                if (dVar2.Q) {
                    return;
                }
                dVar2.setLoading(true);
                p4 p4Var = new p4(dVar2, w2Var2, h6Var, 0);
                int i12 = i7;
                l0 x10 = l0.x(i12);
                x10.m0(new h10(i12, p4Var, x10));
            }
        });
    }

    public static SpannableStringBuilder R0(String str, int i7, org.telegram.ui.ActionBar.h6 h6Var, Runnable runnable) {
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
            spannableStringBuilder.setSpan(new hi.k3(i7, h6Var, runnable), indexOf, i10 + indexOf, 0);
        }
        return spannableStringBuilder;
    }

    public static void Z0(r41 r41Var, boolean z9) {
        boolean canScrollVertically = r41Var.canScrollVertically(-1);
        r41Var.f3.O(z9);
        r41Var.a0();
        if (canScrollVertically) {
            return;
        }
        r41Var.e3.h1(0, 0);
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

    public static void d0(z5 z5Var) {
        l0 x10 = l0.x(z5Var.currentAccount);
        fi.d dVar = z5Var.C0;
        if (dVar.Q) {
            return;
        }
        dVar.setLoading(true);
        boolean z9 = false;
        x10.m0(new h2.o0(x10, new s(8, z5Var, x10), z9, z9, 4));
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

    public static void e0(z5 z5Var) {
        vf.c.t(z5Var.getParentActivity(), l0.x(z5Var.currentAccount).j);
    }

    public static void f0(z5 z5Var) {
        J0(z5Var.currentAccount, z5Var.getParentActivity(), z5Var.getResourceProvider());
    }

    public static void g0(z5 z5Var, String str, l0 l0Var, k60 k60Var, LinearLayout linearLayout, TL_wallet.currencyRate currencyrate) {
        if (currencyrate == null) {
            return;
        }
        org.telegram.ui.ActionBar.z0 z0Var = new org.telegram.ui.ActionBar.z0(2, z5Var.getParentActivity(), z5Var.resourceProvider, false, false);
        z0Var.setPadding(org.telegram.messenger.g0.L(18.0f), 0, org.telegram.messenger.g0.L(18.0f), 0);
        z0Var.setText(currencyrate.currency);
        z0Var.setSubtext(!TextUtils.isEmpty(currencyrate.translatedTitle) ? currencyrate.translatedTitle : currencyrate.title);
        boolean equals = TextUtils.equals(str, currencyrate.currency);
        z0Var.b.setPadding(0, 0, org.telegram.messenger.g0.L(equals ? 42.0f : 0.0f), 0);
        z0Var.setChecked(equals);
        z0Var.setOnClickListener(new i1(l0Var, currencyrate, k60Var, 1));
        linearLayout.addView(z0Var, c8.ha.o(qs.e3, -2));
    }

    public static void h0(z5 z5Var) {
        org.telegram.ui.ActionBar.l lVar;
        if (z5Var.E == null || (lVar = z5Var.actionBar) == null || !(lVar.getParent() instanceof ViewGroup)) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) z5Var.actionBar.getParent();
        viewGroup.setClipChildren(false);
        viewGroup.setClipToPadding(false);
        if (z5Var.E.getParent() != z5Var.actionBar) {
            org.telegram.messenger.g0.E2(z5Var.E);
            z5Var.actionBar.addView(z5Var.E, c8.ha.c(-1.0f, -1));
        }
        z5Var.E.bringToFront();
        z5Var.actionBar.bringToFront();
        z5Var.E.post(new f4(z5Var, 12));
    }

    public static void i0(z5 z5Var) {
        J0(z5Var.currentAccount, z5Var.getParentActivity(), z5Var.getResourceProvider());
    }

    public static void j0(z5 z5Var, String str) {
        Uri c12 = c1(str);
        String d12 = d1(c12);
        if (d12 != null) {
            int i7 = z5Var.currentAccount;
            qp.s1(i7).d2().a(d12, null, new fi.t3(new m4(z5Var, 4), i7));
        } else {
            if ((z5Var.getParentActivity() instanceof LaunchActivity) && new s90((LaunchActivity) z5Var.getParentActivity(), z5Var.currentAccount, null, false).g(c12)) {
                return;
            }
            org.telegram.messenger.g0.h3(new f4(z5Var, 11));
        }
    }

    public static void k0(z5 z5Var, LinearLayout linearLayout, l0 l0Var, k60 k60Var) {
        TL_wallet.currencyRate currencyrate;
        z5 z5Var2;
        ArrayList<TL_wallet.currencyRate> arrayList;
        LinearLayout linearLayout2 = linearLayout;
        l0 l0Var2 = l0Var;
        linearLayout2.removeAllViews();
        String g10 = l0Var2.h.g();
        TL_wallet.currencyRates f10 = l0Var2.h.f();
        if (f10 == null) {
            for (int i7 = 0; i7 < 3; i7++) {
                lz lzVar = new lz(z5Var.getParentActivity(), z5Var.getResourceProvider());
                lzVar.setIsSingleCell(true);
                lzVar.setViewType(31);
                linearLayout2.addView(lzVar, c8.ha.o(qs.e3, -2));
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
                g0(z5Var, g10, l0Var2, k60Var, linearLayout2, currencyrate7);
            }
            i12++;
            l0Var2 = l0Var;
        }
        if (hashSet.isEmpty() || f10.rates.isEmpty()) {
            z5Var2 = z5Var;
        } else {
            z5Var2 = z5Var;
            linearLayout2.addView(new org.telegram.ui.ActionBar.d1(z5Var.getParentActivity(), z5Var2.resourceProvider), c8.ha.o(-1, 8));
        }
        int i13 = 0;
        while (i13 < f10.rates.size()) {
            TL_wallet.currencyRate currencyrate8 = f10.rates.get(i13);
            if (currencyrate8 != null && !hashSet.contains(currencyrate8.currency)) {
                g0(z5Var2, g10, l0Var, k60Var, linearLayout2, currencyrate8);
            }
            i13++;
            z5Var2 = z5Var;
            linearLayout2 = linearLayout;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void l0(final z5 z5Var, Context context, View view) {
        l0 x10 = l0.x(z5Var.currentAccount);
        final k60 I = k60.I(z5Var, view);
        I.a0(0.0f, -org.telegram.messenger.g0.L(48.0f));
        final int i7 = 0;
        I.s = 0;
        I.V(5);
        k60 J = I.J();
        J.c(R.drawable.ic_ab_back, id.M0(2131743192, null), new jq0(I, 27), false);
        J.k();
        ScrollView scrollView = new ScrollView(context);
        LinearLayout linearLayout = new LinearLayout(context);
        final int i10 = 1;
        linearLayout.setOrientation(1);
        scrollView.addView(linearLayout);
        h7 h7Var = new h7(z5Var, linearLayout, x10, I, 11);
        J.r(scrollView, c8.ha.o(-1, 350));
        I.c(R.drawable.wallet_globe, id.M0(2131743148, null), new g(h7Var, I, J, 11), false);
        org.telegram.ui.ActionBar.z0 y10 = I.y();
        f fVar = x10.h;
        String i11 = fVar.i();
        boolean isEmpty = TextUtils.isEmpty(i11);
        String str = i11;
        if (isEmpty) {
            y10.setSubtext("USD");
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(id.M0(2131748779, null));
            spannableStringBuilder.setSpan(new b80(org.telegram.messenger.g0.L(75.0f), y10.b), 0, spannableStringBuilder.length(), 33);
            str = spannableStringBuilder;
        }
        y10.setSubtext(str);
        h7 h7Var2 = new h7(x10, new boolean[]{fVar.f() != null}, y10, h7Var, 12);
        z5Var.P0.add(h7Var2);
        h7Var.run();
        I.c(R.drawable.wallet_lock, id.M0(2131747657, null), new Runnable(z5Var) { // from class: org.telegram.ui.Wallet.r4
            public final /* synthetic */ z5 b;

            {
                this.b = z5Var;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i7) {
                    case 0:
                        z5 z5Var2 = this.b;
                        z5Var2.getClass();
                        I.u();
                        z5Var2.presentFragment(PasscodeActivity.p0());
                        break;
                    case 1:
                        z5 z5Var3 = this.b;
                        z5Var3.getClass();
                        I.u();
                        z5Var3.presentFragment(new p8());
                        break;
                    case 2:
                        z5 z5Var4 = this.b;
                        z5Var4.getClass();
                        I.u();
                        z5Var4.presentFragment(new ja());
                        break;
                    default:
                        I.u();
                        z5 z5Var5 = this.b;
                        z5.I0(z5Var5.getParentActivity(), z5Var5.getResourceProvider());
                        break;
                }
            }
        }, false);
        I.c(R.drawable.wallet_key, id.M0(2131743080, null), new Runnable(z5Var) { // from class: org.telegram.ui.Wallet.r4
            public final /* synthetic */ z5 b;

            {
                this.b = z5Var;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i10) {
                    case 0:
                        z5 z5Var2 = this.b;
                        z5Var2.getClass();
                        I.u();
                        z5Var2.presentFragment(PasscodeActivity.p0());
                        break;
                    case 1:
                        z5 z5Var3 = this.b;
                        z5Var3.getClass();
                        I.u();
                        z5Var3.presentFragment(new p8());
                        break;
                    case 2:
                        z5 z5Var4 = this.b;
                        z5Var4.getClass();
                        I.u();
                        z5Var4.presentFragment(new ja());
                        break;
                    default:
                        I.u();
                        z5 z5Var5 = this.b;
                        z5.I0(z5Var5.getParentActivity(), z5Var5.getResourceProvider());
                        break;
                }
            }
        }, false);
        final int i12 = 2;
        I.l(R.drawable.wallet_apps, id.M0(2131743156, null), new Runnable(z5Var) { // from class: org.telegram.ui.Wallet.r4
            public final /* synthetic */ z5 b;

            {
                this.b = z5Var;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i12) {
                    case 0:
                        z5 z5Var2 = this.b;
                        z5Var2.getClass();
                        I.u();
                        z5Var2.presentFragment(PasscodeActivity.p0());
                        break;
                    case 1:
                        z5 z5Var3 = this.b;
                        z5Var3.getClass();
                        I.u();
                        z5Var3.presentFragment(new p8());
                        break;
                    case 2:
                        z5 z5Var4 = this.b;
                        z5Var4.getClass();
                        I.u();
                        z5Var4.presentFragment(new ja());
                        break;
                    default:
                        I.u();
                        z5 z5Var5 = this.b;
                        z5.I0(z5Var5.getParentActivity(), z5Var5.getResourceProvider());
                        break;
                }
            }
        }, true ^ x10.g.d.isEmpty());
        I.k();
        final int i13 = 3;
        I.c(R.drawable.wallet_help, id.M0(2131742960, null), new Runnable(z5Var) { // from class: org.telegram.ui.Wallet.r4
            public final /* synthetic */ z5 b;

            {
                this.b = z5Var;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i13) {
                    case 0:
                        z5 z5Var2 = this.b;
                        z5Var2.getClass();
                        I.u();
                        z5Var2.presentFragment(PasscodeActivity.p0());
                        break;
                    case 1:
                        z5 z5Var3 = this.b;
                        z5Var3.getClass();
                        I.u();
                        z5Var3.presentFragment(new p8());
                        break;
                    case 2:
                        z5 z5Var4 = this.b;
                        z5Var4.getClass();
                        I.u();
                        z5Var4.presentFragment(new ja());
                        break;
                    default:
                        I.u();
                        z5 z5Var5 = this.b;
                        z5.I0(z5Var5.getParentActivity(), z5Var5.getResourceProvider());
                        break;
                }
            }
        }, false);
        I.p = new sb1(12, z5Var, h7Var2);
        I.Z();
    }

    public static void m0(z5 z5Var, long j3) {
        f4 f4Var = z5Var.K0;
        if (z5Var.a == null) {
            return;
        }
        u8 u8Var = z5Var.i0;
        if (u8Var != null) {
            u8Var.a();
        }
        if (z5Var.I0 <= 0.0f && z5Var.A0()) {
            int top = z5Var.a.e3.m(z5Var.h).getTop() - z5Var.a.getPaddingTop();
            z5Var.a.C0();
            if (top < 0) {
                z5Var.a.w0(0, top, wq.h);
                return;
            }
            return;
        }
        z5Var.a.C0();
        z5Var.s0(true);
        org.telegram.messenger.g0.r(f4Var);
        if (j3 > 0) {
            org.telegram.messenger.g0.i3(f4Var, j3 + 260);
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
    public static LinearLayout t0(final Context context, int i7, TL_wallet.walletTransaction wallettransaction, x10 x10Var, v10 v10Var, byte[] bArr, Runnable runnable, org.telegram.ui.ActionBar.h6 h6Var, y2[] y2VarArr, boolean z9) {
        String t6;
        String str;
        c5 c5Var;
        TextView textView;
        ImageView imageView;
        ImageView imageView2;
        float f10;
        int i10;
        ImageView imageView3;
        tx0 tx0Var;
        SpannableString[] spannableStringArr;
        LinearLayout linearLayout;
        String[] strArr;
        boolean[] zArr;
        TextView[] textViewArr;
        TL_wallet.walletTransaction wallettransaction2;
        d5 d5Var;
        int i11;
        f5 f5Var;
        final y2[] y2VarArr2;
        char c10;
        Object s5;
        int i12;
        final FrameLayout frameLayout;
        final org.telegram.ui.ActionBar.h6 h6Var2 = h6Var;
        boolean z10 = x10Var != null;
        final LinearLayout f11 = org.telegram.messenger.k5.f(context, 1);
        FrameLayout frameLayout2 = new FrameLayout(context);
        f11.addView(frameLayout2, c8.ha.o(-1, 56));
        int i13 = org.telegram.ui.ActionBar.m6.G6;
        org.telegram.ui.ActionBar.m6.w0(i13, h6Var2);
        int i14 = org.telegram.ui.ActionBar.m6.i6;
        int w02 = org.telegram.ui.ActionBar.m6.w0(i14, h6Var2);
        ImageView imageView4 = new ImageView(context);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView4.setScaleType(scaleType);
        imageView4.setImageResource(R.drawable.ic_ab_close);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        org.telegram.ui.ActionBar.t6.s(imageView4, i13, h6Var2, mode);
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.m6.h0(w02, 1, -1);
        org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i14);
        imageView4.setBackground(h02);
        org.telegram.ui.ActionBar.t6.j(imageView4, h02, null, M, h6Var2);
        imageView4.setContentDescription(id.M0(2131752041, null));
        frameLayout2.addView(imageView4, c8.ha.d(48, 48.0f, 19, 4.0f, -2.0f, 0.0f, 0.0f));
        ImageView imageView5 = new ImageView(context);
        imageView5.setScaleType(scaleType);
        imageView5.setImageResource(R.drawable.ic_ab_other);
        org.telegram.ui.ActionBar.t6.s(imageView5, i13, h6Var2, mode);
        org.telegram.ui.Cells.y h03 = org.telegram.ui.ActionBar.m6.h0(w02, 1, -1);
        org.telegram.ui.ActionBar.p6 M2 = org.telegram.ui.ActionBar.t6.M(i14);
        imageView5.setBackground(h03);
        org.telegram.ui.ActionBar.t6.j(imageView5, h03, null, M2, h6Var2);
        imageView5.setContentDescription(id.M0(2131754839, null));
        imageView5.setVisibility(x10Var != null ? 8 : 0);
        frameLayout2.addView(imageView5, c8.ha.d(44, 48.0f, 21, 0.0f, 2.0f, 4.0f, 0.0f));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        linearLayout2.setGravity(1);
        f11.addView(linearLayout2, c8.ha.k(14.0f, wallettransaction.key_change ? -20.0f : -40.0f, 14.0f, 24.0f, -1, -2));
        View x6Var = new x6(120, context, z9);
        x6Var.setTag(x6.class);
        linearLayout2.addView(x6Var, c8.ha.t(120, 120, 1, 0, 0, 0, -8));
        c5 c5Var2 = new c5(context);
        c5Var2.setSingleLine(true);
        c5Var2.setGravity(17);
        c5Var2.setIncludeFontPadding(false);
        c5Var2.setTextSize(1, 40.0f);
        c5Var2.setTypeface(org.telegram.messenger.g0.o());
        linearLayout2.addView(c5Var2, c8.ha.r(-1, 50, 1));
        TextView textView2 = new TextView(context);
        textView2.setGravity(17);
        textView2.setIncludeFontPadding(false);
        textView2.setTextSize(1, 14.0f);
        int i15 = org.telegram.ui.ActionBar.m6.z6;
        org.telegram.ui.ActionBar.t6.U(textView2, i15, h6Var2);
        linearLayout2.addView(textView2, c8.ha.t(-1, 20, 1, 0, 3, 0, 0));
        if (wallettransaction.key_change) {
            linearLayout2.removeAllViews();
            FrameLayout frameLayout3 = new FrameLayout(context);
            frameLayout3.setBackground(org.telegram.ui.ActionBar.m6.M(org.telegram.messenger.g0.L(76.0f), -7956054, -9534569));
            ImageView imageView6 = new ImageView(context);
            imageView6.setImageResource(R.drawable.wallet_transaction_key);
            imageView6.setScaleType(ImageView.ScaleType.FIT_CENTER);
            frameLayout3.addView(imageView6, c8.ha.e(44, 44, 17));
            linearLayout2.addView(frameLayout3, c8.ha.r(76, 76, 1));
            TextView textView3 = new TextView(context);
            textView3.setText(id.M0(2131743081, null));
            org.telegram.messenger.k5.n(textView3, i13, h6Var2, 1, 18.0f);
            textView3.setGravity(17);
            textView3.setIncludeFontPadding(false);
            linearLayout2.addView(textView3, c8.ha.t(-1, 24, 1, 12, 12, 12, 0));
        } else if (wallettransaction.nft != null) {
            linearLayout2.removeAllViews();
            TL_wallet.nftItem nftitem = wallettransaction.nft;
            org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9(context);
            k9Var.setRoundRadius(org.telegram.messenger.g0.L(12.0f));
            k9Var.setContentDescription(nftitem.name);
            Drawable mutate = context.getResources().getDrawable(R.drawable.wallet_nft_placeholder).mutate();
            org.telegram.ui.ActionBar.t6.x(k9Var, mutate, i15, h6Var2, mode);
            hc c11 = c.c(nftitem, false);
            if (c11 != null) {
                k9Var.j(c11, "120_120", mutate, nftitem);
            } else {
                k9Var.setImageDrawable(mutate);
            }
            linearLayout2.addView(k9Var, c8.ha.r(120, 120, 1));
            TextView textView4 = new TextView(context);
            textView4.setText(TextUtils.isEmpty(nftitem.name) ? id.M0(2131743176, null) : nftitem.name);
            org.telegram.messenger.k5.n(textView4, i13, h6Var2, 1, 17.0f);
            textView4.setGravity(17);
            linearLayout2.addView(textView4, c8.ha.k(12.0f, 16.0f, 12.0f, 0.0f, -1, -2));
            if (wallettransaction.incoming) {
                t6 = l0.x(i7).t();
            } else {
                TL_wallet.WalletTransactionPeer walletTransactionPeer = wallettransaction.peer;
                if (walletTransactionPeer == null) {
                    str = null;
                    if (x10Var == null) {
                        if (wallettransaction.comment_encrypted || wallettransaction.comment_encrypted_preparing) {
                            f10 = 11.0f;
                            if (wallettransaction.comment_encrypted_preparing || !TextUtils.isEmpty(str)) {
                                xh.l lVar = new xh.l(context, h6Var2, false);
                                lVar.r = false;
                                lVar.setTextSize(1, 15.0f);
                                org.telegram.ui.ActionBar.t6.U(lVar, i13, h6Var2);
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
                                org.telegram.ui.ActionBar.u4 u4Var = new org.telegram.ui.ActionBar.u4(0, false, false, null);
                                u4Var.x = false;
                                u4Var.w = Integer.valueOf(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Xl, h6Var2));
                                lVar.setBackground(u4Var);
                                lVar.setPadding(org.telegram.messenger.g0.L(19.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(15.0f), org.telegram.messenger.g0.L(11.0f));
                                linearLayout2.addView(lVar, c8.ha.t(-2, -2, 1, 32, 15, 32, 0));
                                c8.ka.a(lVar);
                                i10 = 1;
                                textView = textView2;
                                c5Var = c5Var2;
                                imageView = imageView4;
                                imageView2 = imageView5;
                                lVar.setOnClickListener(new lb(new boolean[]{false}, y2VarArr, h6Var2, lVar, wallettransaction, i7, str));
                                SpannableString[] spannableStringArr2 = new SpannableString[i10];
                                TextView[] textViewArr2 = new TextView[i10];
                                tx0 tx0Var2 = new tx0(context, h6Var2);
                                f11.addView(tx0Var2, c8.ha.k(14.0f, 0.0f, 14.0f, 0.0f, -1, -2));
                                final String[] strArr2 = {wallettransaction.comment};
                                final boolean[] zArr2 = {(wallettransaction.comment_encrypted || (z10 && bArr == null)) ? false : true};
                                if (x10Var == null) {
                                    FrameLayout frameLayout4 = new FrameLayout(context);
                                    int L = org.telegram.messenger.g0.L(22.0f);
                                    int L2 = org.telegram.messenger.g0.L(22.0f);
                                    int i18 = org.telegram.ui.ActionBar.m6.a7;
                                    ShapeDrawable e02 = org.telegram.ui.ActionBar.m6.e0(L, L2, org.telegram.ui.ActionBar.m6.w0(i18, h6Var2));
                                    org.telegram.ui.ActionBar.p6 M3 = org.telegram.ui.ActionBar.t6.M(i18);
                                    frameLayout4.setBackground(e02);
                                    org.telegram.ui.ActionBar.t6.j(frameLayout4, e02, M3, null, h6Var2);
                                    final sb1 sb1Var = new sb1(9, textViewArr2, spannableStringArr2);
                                    final Runnable[] runnableArr = new Runnable[1];
                                    final ee eeVar = new ee(runnableArr, textViewArr2, i7, h6Var2, wallettransaction, strArr2, zArr2, bArr);
                                    tx0Var = tx0Var2;
                                    textViewArr = textViewArr2;
                                    wallettransaction2 = wallettransaction;
                                    d5 d5Var2 = new d5(context, h6Var2);
                                    d5Var2.setHint(id.M0(2131743059, null));
                                    d5Var2.setText(strArr2[0]);
                                    ImageView imageView7 = imageView;
                                    d5Var2.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(f10), org.telegram.messenger.g0.L(64.0f), org.telegram.messenger.g0.L(12.0f));
                                    int i19 = org.telegram.ui.ActionBar.m6.G6;
                                    org.telegram.ui.ActionBar.t6.U(d5Var2, i19, h6Var2);
                                    org.telegram.ui.ActionBar.p6 K = org.telegram.ui.ActionBar.t6.K(0.65f, i19);
                                    org.telegram.ui.ActionBar.t6.n(d5Var2, 1, K.a, -1, 2, K.d, h6Var);
                                    d5Var2.setMaxLines(4);
                                    frameLayout4.addView(d5Var2, c8.ha.d(-1, -2.0f, qs.E1, 0.0f, 0.0f, (wallettransaction2.nft != null || bArr == null) ? 0.0f : 44.0f, 0.0f));
                                    d5Var2.addTextChangedListener(new e5(strArr2, sb1Var, runnableArr, eeVar));
                                    if (wallettransaction2.nft != null || bArr == null) {
                                        frameLayout = frameLayout4;
                                        h6Var2 = h6Var;
                                        imageView3 = imageView7;
                                        spannableStringArr = spannableStringArr2;
                                        strArr = strArr2;
                                        linearLayout = f11;
                                        d5Var = d5Var2;
                                        zArr = zArr2;
                                    } else {
                                        FrameLayout frameLayout5 = new FrameLayout(context);
                                        c8.ka.a(frameLayout5);
                                        final ImageView imageView8 = new ImageView(context);
                                        frameLayout5.addView(imageView8, c8.ha.c(-1.0f, -1));
                                        imageView8.setScaleType(ImageView.ScaleType.CENTER);
                                        org.telegram.ui.ActionBar.t6.s(imageView8, zArr2[0] ? org.telegram.ui.ActionBar.m6.Ci : org.telegram.ui.ActionBar.m6.z6, h6Var, PorterDuff.Mode.SRC_IN);
                                        imageView8.setImageResource(zArr2[0] ? R.drawable.wallet_comment_locked : R.drawable.wallet_comment_unlocked);
                                        int i20 = org.telegram.ui.ActionBar.m6.i6;
                                        org.telegram.ui.Cells.y h04 = org.telegram.ui.ActionBar.m6.h0(org.telegram.ui.ActionBar.m6.w0(i20, h6Var), 1, -1);
                                        org.telegram.ui.ActionBar.p6 M4 = org.telegram.ui.ActionBar.t6.M(i20);
                                        imageView8.setBackground(h04);
                                        org.telegram.ui.ActionBar.t6.j(imageView8, h04, null, M4, h6Var);
                                        final fi.m3[] m3VarArr = new fi.m3[1];
                                        frameLayout = frameLayout4;
                                        h6Var2 = h6Var;
                                        imageView3 = imageView7;
                                        spannableStringArr = spannableStringArr2;
                                        d5Var = d5Var2;
                                        zArr = zArr2;
                                        linearLayout = f11;
                                        strArr = strArr2;
                                        frameLayout5.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Wallet.q4
                                            @Override // android.view.View.OnClickListener
                                            public final void onClick(View view) {
                                                final boolean[] zArr3 = zArr2;
                                                zArr3[0] = !zArr3[0];
                                                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
                                                final AtomicBoolean atomicBoolean = new AtomicBoolean();
                                                final ImageView imageView9 = imageView8;
                                                final org.telegram.ui.ActionBar.h6 h6Var3 = h6Var2;
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
                                                            org.telegram.ui.ActionBar.t6.s(imageView10, zArr4[0] ? org.telegram.ui.ActionBar.m6.Ci : org.telegram.ui.ActionBar.m6.z6, h6Var3, PorterDuff.Mode.SRC_IN);
                                                            imageView10.setImageResource(zArr4[0] ? R.drawable.wallet_comment_locked : R.drawable.wallet_comment_unlocked);
                                                        }
                                                    }
                                                });
                                                duration.setInterpolator(wq.h);
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
                                                    m3Var2.u(id.M0(zArr3[0] ? 2131743047 : 2131743042, null));
                                                    m3Var2.setTranslationY(-(org.telegram.messenger.g0.L(44.0f) + (linearLayout3.getHeight() - frameLayout.getBottom())));
                                                    m3Var2.p(1.0f, -org.telegram.messenger.g0.L(26.0f));
                                                    m3Var2.s(20.0f);
                                                    float L3 = org.telegram.messenger.g0.L(12.0f);
                                                    float L4 = org.telegram.messenger.g0.L(4.0f);
                                                    int r12 = org.telegram.ui.ActionBar.m6.r1(0.25f, -16777216);
                                                    m3Var2.i0 = L3;
                                                    m3Var2.j0 = L4;
                                                    m3Var2.k0 = r12;
                                                    m3Var2.F.setShadowLayer(L3, 0.0f, L4, r12);
                                                    frameLayout6.addView(m3Var2, c8.ha.e(-1, qs.e3, 87));
                                                    m3Var2.w();
                                                    m3Var2.q0 = new l(m3Var2, 7);
                                                }
                                                if (TextUtils.isEmpty(strArr2[0])) {
                                                    return;
                                                }
                                                sb1Var.run();
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
                                    zArr = zArr2;
                                    textViewArr = textViewArr2;
                                    wallettransaction2 = wallettransaction;
                                    d5Var = null;
                                }
                                fi.d h = org.telegram.messenger.k5.h(24, context, h6Var2, true);
                                h.setText(id.M0(2131747831, null));
                                linearLayout.addView(h, c8.ha.k(14.0f, 14.0f, 14.0f, 14.0f, -1, 48));
                                TL_wallet.walletTransaction[] wallettransactionArr = {wallettransaction2};
                                di.r rVar = new di.r(linearLayout, c5Var, h6Var2, i7, textView, y2VarArr, tx0Var, x10Var, context, textViewArr, spannableStringArr);
                                LinearLayout linearLayout3 = linearLayout;
                                linearLayout3.setTag(new sb1(10, rVar, wallettransactionArr));
                                rVar.a(wallettransaction2);
                                if (z10) {
                                    i11 = i7;
                                    f5 f5Var2 = new f5(i11, wallettransactionArr, rVar);
                                    if (wallettransaction2.preview) {
                                        l0 x10 = l0.x(i11);
                                        String str2 = wallettransaction2.id;
                                        m mVar = new m(wallettransaction2, rVar, wallettransactionArr, 4);
                                        HashMap hashMap = x10.K;
                                        k0 k0Var = x10.n;
                                        if (k0Var != null) {
                                            ArrayList arrayList = k0Var.c;
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
                                    f5Var = f5Var2;
                                } else {
                                    i11 = i7;
                                    f5Var = null;
                                }
                                String[] strArr3 = strArr;
                                boolean[] zArr3 = zArr;
                                linearLayout3.addOnAttachStateChangeListener(new g5(rVar, wallettransactionArr, f5Var, i11, v10Var, y2VarArr, strArr3, zArr3));
                                if (x10Var == null) {
                                    TL_wallet.nftItem nftitem2 = wallettransaction2.nft;
                                    if (nftitem2 != null) {
                                        s5 = TextUtils.isEmpty(nftitem2.name) ? id.M0(2131743176, null) : wallettransaction2.nft.name;
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
                                    h.setText(id.V(null, null, 2131743021, objArr));
                                    y2VarArr2 = y2VarArr;
                                    h.setOnClickListener(new org.telegram.messenger.video.f(h, d5Var, x10Var, strArr3, zArr3, y2VarArr2, h6Var));
                                } else {
                                    y2VarArr2 = y2VarArr;
                                    final int i22 = 0;
                                    if (runnable != null) {
                                        h.setText(id.M0(2131743060, null));
                                        h.setOnClickListener(new ik0(19, runnable, y2VarArr2));
                                    } else {
                                        h.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Wallet.o4
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
                                imageView3.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Wallet.o4
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
                                imageView9.setOnClickListener(new jb(y2VarArr2, h6Var, imageView9, wallettransactionArr, context, i7));
                                return linearLayout3;
                            }
                        } else if (TextUtils.isEmpty(wallettransaction.comment)) {
                            f10 = 11.0f;
                        } else {
                            xh.l lVar2 = new xh.l(context);
                            lVar2.setTextSize(1, 15.0f);
                            org.telegram.ui.ActionBar.t6.U(lVar2, i13, h6Var2);
                            f10 = 11.0f;
                            lVar2.setText(org.telegram.messenger.i6.m(wallettransaction.comment, lVar2.getPaint().getFontMetricsInt(), false, null, 0));
                            lVar2.setTextIsSelectable(true);
                            org.telegram.ui.ActionBar.u4 u4Var2 = new org.telegram.ui.ActionBar.u4(0, false, false, null);
                            u4Var2.x = false;
                            u4Var2.w = Integer.valueOf(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Xl, h6Var2));
                            lVar2.setBackground(u4Var2);
                            lVar2.setPadding(org.telegram.messenger.g0.L(19.0f), org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(15.0f), org.telegram.messenger.g0.L(8.0f));
                            linearLayout2.addView(lVar2, c8.ha.t(-2, -2, 1, 32, 16, 32, 0));
                        }
                        c5Var = c5Var2;
                        textView = textView2;
                        imageView = imageView4;
                        imageView2 = imageView5;
                    } else {
                        c5Var = c5Var2;
                        textView = textView2;
                        imageView = imageView4;
                        imageView2 = imageView5;
                        f10 = 11.0f;
                    }
                    i10 = 1;
                    SpannableString[] spannableStringArr22 = new SpannableString[i10];
                    TextView[] textViewArr22 = new TextView[i10];
                    tx0 tx0Var22 = new tx0(context, h6Var2);
                    f11.addView(tx0Var22, c8.ha.k(14.0f, 0.0f, 14.0f, 0.0f, -1, -2));
                    final String[] strArr22 = {wallettransaction.comment};
                    final boolean[] zArr22 = {(wallettransaction.comment_encrypted || (z10 && bArr == null)) ? false : true};
                    if (x10Var == null) {
                    }
                    fi.d h7 = org.telegram.messenger.k5.h(24, context, h6Var2, true);
                    h7.setText(id.M0(2131747831, null));
                    linearLayout.addView(h7, c8.ha.k(14.0f, 14.0f, 14.0f, 14.0f, -1, 48));
                    TL_wallet.walletTransaction[] wallettransactionArr2 = {wallettransaction2};
                    di.r rVar2 = new di.r(linearLayout, c5Var, h6Var2, i7, textView, y2VarArr, tx0Var, x10Var, context, textViewArr, spannableStringArr);
                    LinearLayout linearLayout32 = linearLayout;
                    linearLayout32.setTag(new sb1(10, rVar2, wallettransactionArr2));
                    rVar2.a(wallettransaction2);
                    if (z10) {
                    }
                    String[] strArr32 = strArr;
                    boolean[] zArr32 = zArr;
                    linearLayout32.addOnAttachStateChangeListener(new g5(rVar2, wallettransactionArr2, f5Var, i11, v10Var, y2VarArr, strArr32, zArr32));
                    if (x10Var == null) {
                    }
                    final int i232 = 1;
                    imageView3.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Wallet.o4
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
                    imageView92.setOnClickListener(new jb(y2VarArr2, h6Var, imageView92, wallettransactionArr2, context, i7));
                    return linearLayout32;
                }
                t6 = walletTransactionPeer.address;
            }
            str = t6;
            if (x10Var == null) {
            }
            i10 = 1;
            SpannableString[] spannableStringArr222 = new SpannableString[i10];
            TextView[] textViewArr222 = new TextView[i10];
            tx0 tx0Var222 = new tx0(context, h6Var2);
            f11.addView(tx0Var222, c8.ha.k(14.0f, 0.0f, 14.0f, 0.0f, -1, -2));
            final String[] strArr222 = {wallettransaction.comment};
            final boolean[] zArr222 = {(wallettransaction.comment_encrypted || (z10 && bArr == null)) ? false : true};
            if (x10Var == null) {
            }
            fi.d h72 = org.telegram.messenger.k5.h(24, context, h6Var2, true);
            h72.setText(id.M0(2131747831, null));
            linearLayout.addView(h72, c8.ha.k(14.0f, 14.0f, 14.0f, 14.0f, -1, 48));
            TL_wallet.walletTransaction[] wallettransactionArr22 = {wallettransaction2};
            di.r rVar22 = new di.r(linearLayout, c5Var, h6Var2, i7, textView, y2VarArr, tx0Var, x10Var, context, textViewArr, spannableStringArr);
            LinearLayout linearLayout322 = linearLayout;
            linearLayout322.setTag(new sb1(10, rVar22, wallettransactionArr22));
            rVar22.a(wallettransaction2);
            if (z10) {
            }
            String[] strArr322 = strArr;
            boolean[] zArr322 = zArr;
            linearLayout322.addOnAttachStateChangeListener(new g5(rVar22, wallettransactionArr22, f5Var, i11, v10Var, y2VarArr, strArr322, zArr322));
            if (x10Var == null) {
            }
            final int i2322 = 1;
            imageView3.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Wallet.o4
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
            imageView922.setOnClickListener(new jb(y2VarArr2, h6Var, imageView922, wallettransactionArr22, context, i7));
            return linearLayout322;
        }
        if (wallettransaction.incoming) {
        }
        str = t6;
        if (x10Var == null) {
        }
        i10 = 1;
        SpannableString[] spannableStringArr2222 = new SpannableString[i10];
        TextView[] textViewArr2222 = new TextView[i10];
        tx0 tx0Var2222 = new tx0(context, h6Var2);
        f11.addView(tx0Var2222, c8.ha.k(14.0f, 0.0f, 14.0f, 0.0f, -1, -2));
        final String[] strArr2222 = {wallettransaction.comment};
        final boolean[] zArr2222 = {(wallettransaction.comment_encrypted || (z10 && bArr == null)) ? false : true};
        if (x10Var == null) {
        }
        fi.d h722 = org.telegram.messenger.k5.h(24, context, h6Var2, true);
        h722.setText(id.M0(2131747831, null));
        linearLayout.addView(h722, c8.ha.k(14.0f, 14.0f, 14.0f, 14.0f, -1, 48));
        TL_wallet.walletTransaction[] wallettransactionArr222 = {wallettransaction2};
        di.r rVar222 = new di.r(linearLayout, c5Var, h6Var2, i7, textView, y2VarArr, tx0Var, x10Var, context, textViewArr, spannableStringArr);
        LinearLayout linearLayout3222 = linearLayout;
        linearLayout3222.setTag(new sb1(10, rVar222, wallettransactionArr222));
        rVar222.a(wallettransaction2);
        if (z10) {
        }
        String[] strArr3222 = strArr;
        boolean[] zArr3222 = zArr;
        linearLayout3222.addOnAttachStateChangeListener(new g5(rVar222, wallettransactionArr222, f5Var, i11, v10Var, y2VarArr, strArr3222, zArr3222));
        if (x10Var == null) {
        }
        final int i23222 = 1;
        imageView3.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Wallet.o4
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
        imageView9222.setOnClickListener(new jb(y2VarArr2, h6Var, imageView9222, wallettransactionArr222, context, i7));
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

    public static SpannableStringBuilder w0(int i7, long j3, org.telegram.ui.ActionBar.h6 h6Var) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("G ");
        wp wpVar = new wp(R.drawable.wallet_gram_small, 2);
        wpVar.d = false;
        wpVar.c(org.telegram.messenger.g0.L(16.0f));
        spannableStringBuilder.setSpan(wpVar, 0, 1, 33);
        BigDecimal movePointLeft = new BigDecimal(j3).movePointLeft(9);
        spannableStringBuilder.append((CharSequence) (movePointLeft.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : movePointLeft.stripTrailingZeros()).toPlainString());
        CharSequence m10 = l0.x(i7).m(j3, true);
        if (!TextUtils.isEmpty(m10)) {
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) "  ~\u2009").append(m10);
            spannableStringBuilder.setSpan(new xz(org.telegram.ui.ActionBar.m6.z6, h6Var), length, spannableStringBuilder.length(), 33);
        }
        return spannableStringBuilder;
    }

    public final boolean A0() {
        View m10;
        fi.w3 w3Var = this.a;
        return w3Var != null && (m10 = w3Var.e3.m(this.h)) != null && this.y0 < 0.5f && m10.getBottom() > this.a.getPaddingTop();
    }

    public final void D0() {
        d0 d0Var;
        r41 r41Var = this.r0[1];
        if (this.e0 != 1 || r41Var == null || !r41Var.G || (d0Var = this.E0) == null || d0Var.i || d0Var.g || d0Var.k != null || r41Var.e3.N0() < r41Var.f3.D.size() - 3) {
            return;
        }
        this.E0.e();
    }

    public final void E0() {
        k0 k0Var;
        r41 r41Var = this.r0[0];
        if (r41Var == null || !r41Var.G || (k0Var = this.D0) == null || k0Var.h || r41Var.e3.N0() < r41Var.f3.D.size() - 3) {
            return;
        }
        this.D0.h();
    }

    public final CharSequence F0(int i7) {
        CharSequence[] charSequenceArr = this.O0;
        if (charSequenceArr[i7] == null) {
            charSequenceArr[i7] = new SpannableString("l");
            b80 b80Var = new b80(org.telegram.messenger.g0.L(i7 == 0 ? 100.0f : 50.0f), i7 == 0 ? this.t0 : this.u0);
            b80Var.a(org.telegram.ui.ActionBar.m6.r1(0.45f, -1), org.telegram.ui.ActionBar.m6.r1(0.2f, -1));
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
            k7Var.a3 = nftitem;
            if (this.j0 != null) {
                k7Var.b3 = new h5(this, tL_starGiftUnique, nftitem);
                k7Var.c3 = new i5(this, nftitem);
            }
            k7Var.g2(tL_starGiftUnique.slug, tL_starGiftUnique, null);
            showDialog(k7Var);
            return;
        }
        Activity parentActivity = getParentActivity();
        org.telegram.ui.ActionBar.h6 resourceProvider = getResourceProvider();
        if (parentActivity != null) {
            int i7 = org.telegram.ui.ActionBar.m6.a7;
            int w02 = org.telegram.ui.ActionBar.m6.w0(i7, resourceProvider);
            int i10 = org.telegram.ui.ActionBar.m6.G6;
            org.telegram.ui.ActionBar.m6.w0(i10, resourceProvider);
            x4 x4Var = new x4(1, parentActivity, resourceProvider, false);
            x4Var.a0 = i7;
            x4Var.v0(w02);
            x4Var.O(w02);
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
            int i11 = org.telegram.ui.ActionBar.m6.z6;
            org.telegram.ui.ActionBar.t6.x(k9Var, mutate, i11, resourceProvider, PorterDuff.Mode.SRC_IN);
            hc c10 = c.c(nftitem, false);
            if (c10 != null) {
                k9Var.j(c10, "120_120", mutate, nftitem);
            } else {
                k9Var.setImageDrawable(mutate);
            }
            linearLayout.addView(k9Var, c8.ha.r(120, 120, 1));
            TextView textView = new TextView(parentActivity);
            textView.setText(TextUtils.isEmpty(nftitem.name) ? id.M0(2131743176, null) : nftitem.name);
            org.telegram.messenger.k5.n(textView, i10, resourceProvider, 1, 17.0f);
            int i12 = 17;
            textView.setGravity(17);
            linearLayout.addView(textView, c8.ha.k(12.0f, 16.0f, 12.0f, 0.0f, -1, -2));
            TextView textView2 = new TextView(parentActivity);
            textView2.setText(nftitem.description);
            org.telegram.ui.ActionBar.t6.U(textView2, i11, resourceProvider);
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
                int i14 = org.telegram.ui.ActionBar.m6.d6;
                int w03 = org.telegram.ui.ActionBar.m6.w0(i14, resourceProvider);
                int i15 = org.telegram.ui.ActionBar.m6.i6;
                int w04 = org.telegram.ui.ActionBar.m6.w0(i15, resourceProvider);
                org.telegram.ui.Cells.y k02 = org.telegram.ui.ActionBar.m6.k0(L, L, L, L, w03, w04, w04);
                org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i14);
                org.telegram.ui.ActionBar.p6 M2 = org.telegram.ui.ActionBar.t6.M(i15);
                linearLayout3.setBackground(k02);
                org.telegram.ui.ActionBar.t6.j(linearLayout3, k02, M, M2, resourceProvider);
                linearLayout3.setClickable(true);
                linearLayout3.setFocusable(true);
                String M0 = id.M0(i13 == 0 ? 2131742981 : 2131743023, str);
                linearLayout3.setContentDescription(M0);
                ImageView imageView = new ImageView(parentActivity);
                imageView.setImageResource(i13 == 0 ? R.drawable.wallet_transfer : R.drawable.wallet_sell);
                imageView.setImportantForAccessibility(2);
                int i16 = org.telegram.ui.ActionBar.m6.G6;
                org.telegram.ui.ActionBar.t6.s(imageView, i16, resourceProvider, PorterDuff.Mode.SRC_IN);
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
                int i17 = org.telegram.ui.ActionBar.m6.d6;
                ShapeDrawable d02 = org.telegram.ui.ActionBar.m6.d0(L2, org.telegram.ui.ActionBar.m6.w0(i17, resourceProvider));
                org.telegram.ui.ActionBar.p6 M3 = org.telegram.ui.ActionBar.t6.M(i17);
                tx0Var.setBackground(d02);
                org.telegram.ui.ActionBar.t6.j(tx0Var, d02, M3, null, resourceProvider);
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
            dVar.setText(id.M0(2131743063, null));
            linearLayout.addView(dVar, c8.ha.o(-1, 48));
            x4Var.N = scrollView;
            x4Var.T0 = false;
            linearLayout2.getChildAt(0).setOnClickListener(new ik0(18, x4Var, nftitem));
            linearLayout2.getChildAt(1).setOnClickListener(new h3(parentActivity, 1));
            dVar.setOnClickListener(new h3(x4Var, 2));
            x4Var.show();
            x4Var.O(w02);
            org.telegram.messenger.g0.u3(x4Var, w02, false, null);
        }
    }

    public final void L0() {
        if (getParentActivity() == null || this.M0 != null || this.L0 == null) {
            return;
        }
        if (getParentActivity().checkSelfPermission("android.permission.CAMERA") != 0) {
            getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 44);
        } else {
            this.M0 = ai.i0.k(this, this.L0, new ai.c0(12), new m4(this, 3), new f4(this, 9));
        }
    }

    public final void M0(boolean z9) {
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
        a1();
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
            N0(f10);
            this.p0.o(false);
        } else {
            this.h0.setVisibility(0);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.l0, f10);
            this.m0 = ofFloat;
            ofFloat.setDuration(250L);
            this.m0.setInterpolator(wq.h);
            this.m0.addUpdateListener(new l4(this, 0));
            this.m0.addListener(new org.telegram.ui.ActionBar.t0(this, f10, 7));
            this.m0.start();
        }
        if (this.a == null || this.o0 == O0()) {
            return;
        }
        Y0(false);
    }

    public final void N0(float f10) {
        this.l0 = f10;
        this.h0.setVisibility((f10 > 0.0f || this.m0 != null) ? 0 : 8);
        this.h0.setAlpha(f10);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.h0.getLayoutParams();
        layoutParams.height = Math.round(org.telegram.messenger.g0.L(52.0f) * f10);
        layoutParams.bottomMargin = -Math.round(org.telegram.messenger.g0.L(6.0f) * f10);
        this.h0.setLayoutParams(layoutParams);
    }

    public final boolean O0() {
        k0 k0Var;
        if (this.f0 || (k0Var = this.D0) == null || !k0Var.c.isEmpty()) {
            return false;
        }
        k0 k0Var2 = this.D0;
        k0Var2.getClass();
        return k0Var2.h;
    }

    public final void P0() {
        this.F0 = false;
        u8 u8Var = this.i0;
        if (u8Var != null) {
            u8Var.b(false);
        }
        this.e0 = 0;
        fi.g1 g1Var = this.p0;
        if (g1Var != null) {
            g1Var.setPosition(0);
        }
    }

    public final void Q0() {
        this.s = false;
        fi.w3 w3Var = this.a;
        if (w3Var != null) {
            w3Var.D2.b.remove(this.x);
            this.a.removeCallbacks(this.w);
        }
        n5 n5Var = this.e;
        if (n5Var != null) {
            n5Var.setAdditionalTilt(0.0f);
        }
    }

    public final void S0() {
        l0 x10 = l0.x(this.currentAccount);
        b1();
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
            n5 n5Var = this.e;
            n5Var.getClass();
            h6 h6Var = new h6(n5Var);
            this.v0 = h6Var;
            SpannableString spannableString = this.Q0;
            spannableString.setSpan(h6Var, 0, spannableString.length(), 33);
        }
        spannableStringBuilder.append((CharSequence) this.Q0);
        spannableStringBuilder.append((CharSequence) " ");
        spannableStringBuilder.append((CharSequence) i6.e(v));
        spannableStringBuilder.append((CharSequence) " ");
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) id.M0(2131749516, null));
        if (this.w0 == null) {
            q5 q5Var = new q5();
            q5Var.a = -9577217;
            this.w0 = q5Var;
        }
        spannableStringBuilder.setSpan(this.w0, length, spannableStringBuilder.length(), 33);
        this.t0.setText(spannableStringBuilder);
        CharSequence m10 = l0.x(this.currentAccount).m(v, false);
        if (TextUtils.isEmpty(m10)) {
            this.u0.setText(F0(1));
        } else {
            this.u0.setText(m10);
        }
        V0(this.x0);
        d0 d0Var = this.E0;
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
        Rect rect = this.G;
        if (rect.isEmpty() || !this.D.isAttachedToWindow()) {
            return;
        }
        n5 n5Var = this.e;
        bi.x5 x5Var = this.E;
        Matrix matrix = this.H;
        if (n5Var.g(x5Var, matrix)) {
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
            n5 n5Var2 = this.e;
            Matrix matrix4 = n5Var2.c;
            Matrix matrix5 = n5Var2.e;
            Matrix matrix6 = n5Var2.d;
            if (matrix.invert(matrix6)) {
                matrix5.setConcat(matrix6, matrix3);
                if (!n5Var2.n || !matrix4.equals(matrix5)) {
                    matrix4.set(matrix5);
                    n5Var2.n = true;
                    n5Var2.N.invalidate();
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
    public final void U0() {
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
        X0();
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
                T0();
            } else {
                n5 n5Var = this.e;
                n5Var.i(0.0f, 0.0f);
                LinearLayout linearLayout2 = n5Var.M;
                org.telegram.messenger.g0.E2(linearLayout2);
                linearLayout2.setScaleX(1.0f);
                linearLayout2.setScaleY(1.0f);
                linearLayout2.setRotationX(0.0f);
                linearLayout2.setRotationY(0.0f);
                linearLayout2.setTranslationX(0.0f);
                linearLayout2.setTranslationY(0.0f);
                g6 g6Var = n5Var.O;
                g6Var.setScaleX(1.0f);
                g6Var.setScaleY(1.0f);
                n5Var.E.addView(linearLayout2, n5Var.P);
                this.s0.layout(rect.left, rect.top, rect.right, rect.bottom);
                this.e.getClass();
                T0();
            }
            this.E.invalidate();
        }
        V0(i7);
        if (this.F) {
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
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.m6.G6);
        this.t0.setTextColor(org.telegram.messenger.g0.d2(f10, -1, themedColor));
        org.telegram.ui.Components.i6 i6Var = this.u0;
        float[] fArr = this.e.a0;
        int i7 = -7868417;
        if (fArr != null) {
            i7 = i0.a.f(fArr[8], r7.p(-7868417, 0, fArr), r7.p(-7868417, 3, fArr));
        }
        i6Var.setTextColor(org.telegram.messenger.g0.d2(f10, i7, i0.a.o(themedColor, Math.round(142.8f))));
        h6 h6Var = this.v0;
        if (h6Var != null) {
            h6Var.y = org.telegram.messenger.g0.d2(f10, -1, getThemedColor(org.telegram.ui.ActionBar.m6.Ci));
        }
        q5 q5Var = this.w0;
        if (q5Var != null) {
            float[] fArr2 = this.e.a0;
            int i10 = -9577217;
            if (fArr2 != null) {
                i10 = i0.a.f(fArr2[8], r7.p(-9577217, 0, fArr2), r7.p(-9577217, 3, fArr2));
            }
            q5Var.a = i0.a.o(i10, Math.round((1.0f - f10) * 255.0f));
        }
        this.t0.invalidate();
    }

    public final void W0(float[] fArr) {
        if (this.B0 == null || this.C0 == null) {
            return;
        }
        float f10 = r7.j(getThemedColor(org.telegram.ui.ActionBar.m6.a7))[0];
        boolean z9 = f10 < 0.6f;
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.m6.Ci);
        if (fArr != null && fArr.length >= 18) {
            int[] iArr = new int[2];
            for (int i7 = 0; i7 < 2; i7++) {
                int i10 = i7 * 4;
                float f11 = fArr[i10 + 10];
                iArr[i7] = f11 < 0.0f ? themedColor : r7.n(themedColor, (int) f11, (int) fArr[i10 + 11]);
            }
            themedColor = i0.a.f(fArr[8], iArr[0], iArr[1]);
        }
        float f12 = z9 ? f10 + 0.25f : 0.0f;
        float f13 = z9 ? 1.0f : f10 - 0.2f;
        float[] j3 = r7.j(themedColor);
        float f14 = j3[0];
        if (f14 < f12 || f14 > f13) {
            themedColor = (themedColor & (-16777216)) | (r7.l(Math.max(f12, Math.min(f13, f14)), j3[1], j3[2]) & 16777215);
        }
        if (themedColor == this.N0) {
            return;
        }
        this.N0 = themedColor;
        int themedColor2 = i0.a.h(themedColor) <= 0.550000011920929d ? getThemedColor(org.telegram.ui.ActionBar.m6.Gi) : -16777216;
        fi.d[] dVarArr = {this.B0, this.C0};
        for (int i11 = 0; i11 < 2; i11++) {
            fi.d dVar = dVarArr[i11];
            dVar.setColor(themedColor);
            dVar.setTextColor(themedColor2);
        }
    }

    public final void X0() {
        fi.w3 w3Var = this.a;
        if (w3Var == null || this.e == null) {
            return;
        }
        float b10 = w3Var.D2.b(1);
        this.e.setAdditionalTilt(Math.max(0.0f, (this.x0 * 10.0f) + ((((float) Math.sqrt(Utilities.l(this.x0))) * 90.0f) - 10.0f)) + Math.min(10.0f, this.a.D2.b(3) * 40.0f) + (-Math.min(10.0f, b10 * 40.0f)));
        this.e.setUseGyroscope(1.0f - ((float) Math.pow(this.x0, 0.33000001311302185d)));
    }

    public final void Y0(boolean z9) {
        boolean O0 = O0();
        fi.w3 w3Var = this.a;
        r41[] r41VarArr = this.r0;
        if (w3Var != null && this.o0 != O0) {
            this.o0 = O0;
            w3Var.C0();
            for (r41 r41Var : r41VarArr) {
                if (r41Var != null) {
                    r41Var.C0();
                }
            }
            this.a.f3.O(false);
            this.a.e3.h1(0, 0);
            this.a.post(new f4(this, 12));
        }
        if (O0) {
            return;
        }
        for (r41 r41Var2 : r41VarArr) {
            if (r41Var2 != null) {
                Z0(r41Var2, z9);
            }
        }
        bi.t tVar = this.n0;
        if (tVar != null) {
            tVar.post(new f4(this, 6));
            this.n0.post(new f4(this, 7));
        }
    }

    @Override // org.telegram.ui.Components.o41
    public final void Z(ArrayList arrayList, m41 m41Var) {
        l0 x10 = l0.x(this.currentAccount);
        b1();
        arrayList.add(x31.m(this.R));
        this.h = arrayList.size();
        k5 k5Var = this.f;
        x31 x31Var = new x31(-4);
        x31Var.c = k5Var;
        x31Var.z = -1;
        x31Var.e = true;
        arrayList.add(x31Var);
        arrayList.add(x31.m(this.z0));
        boolean O0 = O0();
        this.o0 = O0;
        if (O0) {
            String M0 = id.M0(2131743019, null);
            String M02 = id.M0(2131743018, null);
            int i7 = r5.b;
            x31 K = x31.K(r5.class);
            K.k = R.drawable.wallet_learn_instant;
            K.l = M0;
            K.m = M02;
            arrayList.add(K);
            String M03 = id.M0(2131743068, null);
            String M04 = id.M0(2131743067, null);
            x31 K2 = x31.K(r5.class);
            K2.k = R.drawable.wallet_learn_fees;
            K2.l = M03;
            K2.m = M04;
            arrayList.add(K2);
            String M05 = id.M0(2131743182, null);
            String M06 = id.M0(2131743181, null);
            x31 K3 = x31.K(r5.class);
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

    @Override // org.telegram.ui.Components.o41
    public final CharSequence a0() {
        return id.M0(2131743003, null);
    }

    public final void a1() {
        u8 u8Var = this.i0;
        if (u8Var == null || this.p0 == null || u8Var.x == 0.0f) {
            return;
        }
        u8Var.x = 0.0f;
        u8Var.c.setVisibility(8);
        u8Var.invalidate();
    }

    @Override // org.telegram.ui.Components.o41
    public final void b0(x31 x31Var, View view) {
        d0 d0Var;
        Object obj = x31Var.G;
        if (obj instanceof TL_wallet.nftItem) {
            H0((TL_wallet.nftItem) obj);
            return;
        }
        if (x31Var.d == -10001 && (d0Var = this.E0) != null) {
            d0Var.e();
        } else if (obj instanceof TL_wallet.walletTransaction) {
            G0(getParentActivity(), this.currentAccount, (TL_wallet.walletTransaction) x31Var.G, null, null, null, null, getResourceProvider());
        }
    }

    public final void b1() {
        if (this.S == null) {
            return;
        }
        l0 x10 = l0.x(this.currentAccount);
        boolean z9 = this.S.isAttachedToWindow() && this.S.isLaidOut();
        j5 j5Var = this.S;
        FrameLayout frameLayout = this.T;
        Boolean bool = x10.i;
        j5Var.i(frameLayout, (bool == null || !bool.booleanValue() || TextUtils.isEmpty(x10.j)) ? false : true, z9);
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
        boolean z10 = j3 > 500000000;
        if (z10) {
            this.W.setText(x0(2131743062, j3));
        }
        this.S.i(this.V, z10, z9);
        long j11 = bi.ea.y(this.currentAccount, true).p().amount;
        boolean z11 = j11 > 500000000;
        if (z11) {
            this.Y.setText(x0(2131743100, j11));
        }
        this.S.i(this.X, z11, z9);
    }

    @Override // org.telegram.ui.Components.o41
    public final boolean c0(x31 x31Var, View view) {
        d8 d8Var;
        if (!(view instanceof q7) || (d8Var = this.j0) == null) {
            return false;
        }
        d8Var.S((q7) view);
        return true;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean canBeginSlide() {
        d8 d8Var = this.j0;
        return (d8Var == null || !d8Var.p0) && super.canBeginSlide();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.telegram.ui.Components.o41, org.telegram.ui.ActionBar.f2
    public final View createView(Context context) {
        ValueAnimator valueAnimator = this.m0;
        if (valueAnimator != null) {
            this.m0 = null;
            valueAnimator.cancel();
        }
        Q0();
        v5 v5Var = this.q0;
        if (v5Var != null) {
            v5Var.b(null);
        }
        this.f = null;
        this.S = null;
        this.R = null;
        this.n0 = null;
        this.p0 = null;
        r41[] r41VarArr = this.r0;
        int i7 = 0;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        Object[] objArr5 = 0;
        r41VarArr[0] = null;
        final int i10 = 1;
        r41VarArr[1] = null;
        d0 d0Var = this.E0;
        boolean z9 = (d0Var == null || d0Var.a.isEmpty()) ? false : true;
        this.f0 = z9;
        if (!z9) {
            this.e0 = 0;
        } else if (this.F0) {
            this.e0 = 1;
        }
        d8 d8Var = this.j0;
        if (d8Var != null) {
            d8Var.p();
        }
        this.j0 = null;
        View createView = super.createView(context);
        ra0 ra0Var = new ra0(this, context);
        ra0Var.addView(createView, c8.ha.c(-1.0f, -1));
        this.fragmentView = ra0Var;
        org.telegram.ui.ActionBar.l lVar = this.actionBar;
        int i11 = org.telegram.ui.ActionBar.m6.a7;
        org.telegram.ui.ActionBar.t6.h(i11, lVar, getResourceProvider());
        this.actionBar.setCastShadows(false);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setClipChildren(false);
        this.actionBar.setClipToPadding(false);
        org.telegram.ui.ActionBar.y s5 = this.actionBar.s();
        int i12 = 2;
        org.telegram.ui.ActionBar.r0 a10 = s5.a(2, R.drawable.scan_qr);
        this.L0 = a10;
        final int i13 = 3;
        a10.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Wallet.h4
            public final /* synthetic */ z5 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i13) {
                    case 0:
                        z5 z5Var = this.b;
                        z5Var.getClass();
                        z5Var.presentFragment(new cb1(6, null));
                        break;
                    case 1:
                        z5.f0(this.b);
                        break;
                    case 2:
                        z5.i0(this.b);
                        break;
                    case 3:
                        this.b.L0();
                        break;
                    default:
                        z5.d0(this.b);
                        break;
                }
            }
        });
        s5.a(1, R.drawable.ic_ab_other).setOnClickListener(new ik0(20, this, context));
        w41 w41Var = new w41(i12, context, this);
        this.R = w41Var;
        w41Var.setClipToPadding(false);
        this.R.setClipChildren(false);
        this.R.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(4.0f));
        j5 j5Var = new j5(this, context);
        this.S = j5Var;
        j5Var.setDefaultRadiusDp(22);
        this.S.setOnAnimatedHeightChangedListener(new f4(this, i7));
        TextView textView = new TextView(context);
        this.U = textView;
        textView.setText(id.M0(2131742962, null));
        this.T = u0(this.U, new f4(this, i10));
        TextView textView2 = new TextView(context);
        this.W = textView2;
        this.V = u0(textView2, new f4(this, i12));
        TextView textView3 = new TextView(context);
        this.Y = textView3;
        this.X = u0(textView3, new f4(this, i13));
        this.R.addView(this.S, c8.ha.c(-2.0f, -1));
        w70 w70Var = new w70(context, null);
        this.Z = w70Var;
        this.b0 = false;
        w70Var.setAlpha(0.0f);
        w70 w70Var2 = this.Z;
        int i14 = org.telegram.ui.ActionBar.m6.z6;
        org.telegram.ui.ActionBar.t6.U(w70Var2, i14, this.resourceProvider);
        this.Z.setTextSize(1, 13.0f);
        this.Z.setGravity(17);
        this.Z.setText(R0(id.M0(2131743006, null), org.telegram.ui.ActionBar.m6.Uc, this.resourceProvider, new g4(context, objArr5 == true ? 1 : 0)));
        final int i15 = 4;
        this.Z.setVisibility(4);
        FrameLayout frameLayout = (FrameLayout) createView;
        if (frameLayout != null) {
            frameLayout.addView(this.Z, c8.ha.d(-1, -2.0f, 81, 12.0f, 0.0f, 12.0f, 24.0f));
        }
        k5 k5Var = new k5(this, context, objArr4 == true ? 1 : 0);
        this.a0 = k5Var;
        k5Var.setImportantForAccessibility(2);
        this.c0 = new FrameLayout(context);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.d0 = frameLayout2;
        int i16 = org.telegram.ui.ActionBar.m6.d6;
        int themedColor = getThemedColor(i16);
        int themedColor2 = getThemedColor(i16);
        int i17 = org.telegram.ui.ActionBar.m6.i6;
        org.telegram.ui.Cells.y b02 = org.telegram.ui.ActionBar.m6.b0(themedColor, org.telegram.ui.ActionBar.m6.w(themedColor2, getThemedColor(i17)), 16, 16);
        org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i16);
        org.telegram.ui.ActionBar.p6 p10 = org.telegram.ui.ActionBar.t6.p(i16, i17);
        org.telegram.ui.ActionBar.h6 resourceProvider = getResourceProvider();
        frameLayout2.setBackground(b02);
        org.telegram.ui.ActionBar.t6.j(frameLayout2, b02, M, p10, resourceProvider);
        this.c0.addView(this.d0, c8.ha.d(-1, -2.0f, 55, 12.0f, 0.0f, 12.0f, 12.0f));
        ImageView imageView = new ImageView(context);
        float N = org.telegram.messenger.g0.N(10.0f);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{N, N, N, N, N, N, N, N}, null, null));
        shapeDrawable.setShaderFactory(new l5());
        imageView.setBackground(shapeDrawable);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.wallet_protect);
        this.d0.addView(imageView, c8.ha.d(28, 28.0f, 19, 14.0f, 11.0f, 16.0f, 11.0f));
        TextView textView4 = new TextView(context);
        org.telegram.ui.ActionBar.t6.U(textView4, org.telegram.ui.ActionBar.m6.q7, this.resourceProvider);
        jg.g.v(textView4, 1, 16.0f, null, 2131743044);
        this.d0.addView(textView4, c8.ha.d(-1, -2.0f, 19, 58.0f, 0.0f, 32.0f, 0.0f));
        FrameLayout frameLayout3 = this.d0;
        final Object[] objArr6 = objArr3 == true ? 1 : 0;
        frameLayout3.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Wallet.h4
            public final /* synthetic */ z5 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (objArr6) {
                    case 0:
                        z5 z5Var = this.b;
                        z5Var.getClass();
                        z5Var.presentFragment(new cb1(6, null));
                        break;
                    case 1:
                        z5.f0(this.b);
                        break;
                    case 2:
                        z5.i0(this.b);
                        break;
                    case 3:
                        this.b.L0();
                        break;
                    default:
                        z5.d0(this.b);
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
        n5 n5Var = new n5(this, context);
        this.e = n5Var;
        n5Var.setDiamondOnCard(true);
        this.e.setCardOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Wallet.h4
            public final /* synthetic */ z5 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i10) {
                    case 0:
                        z5 z5Var = this.b;
                        z5Var.getClass();
                        z5Var.presentFragment(new cb1(6, null));
                        break;
                    case 1:
                        z5.f0(this.b);
                        break;
                    case 2:
                        z5.i0(this.b);
                        break;
                    case 3:
                        this.b.L0();
                        break;
                    default:
                        z5.d0(this.b);
                        break;
                }
            }
        });
        this.a.D2.b.add(this.x);
        k5 k5Var2 = new k5(this, context, i10);
        this.f = k5Var2;
        k5Var2.setImportantForAccessibility(2);
        o5 o5Var = new o5(this, context);
        this.n = o5Var;
        o5Var.setClipChildren(false);
        this.n.setClipToPadding(false);
        this.n.addView(this.e, c8.ha.c(-2.0f, -1));
        ra0Var.addView(this.n, c8.ha.c(-1.0f, -1));
        this.a.setClipChildren(false);
        this.a.setClipToPadding(false);
        this.s0 = this.e.getBalanceLayout();
        this.t0 = this.e.getBalanceView();
        this.u0 = this.e.getUsdBalanceView();
        this.e.setCardHolder(t10.p(getUserConfig().f()).toUpperCase());
        this.A0 = 0.0f;
        e61 e61Var = new e61(23, context, this);
        this.z0 = e61Var;
        e61Var.setOrientation(0);
        this.z0.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(12.0f));
        fi.d dVar = new fi.d(context, this.resourceProvider, true);
        dVar.setRoundRadius(24);
        this.B0 = dVar;
        dVar.setText(id.M0(2131743204, null));
        this.z0.addView(this.B0, c8.ha.m(1.0f, 0, 48, 0, 4, 0));
        final int i18 = 2;
        this.B0.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Wallet.h4
            public final /* synthetic */ z5 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i18) {
                    case 0:
                        z5 z5Var = this.b;
                        z5Var.getClass();
                        z5Var.presentFragment(new cb1(6, null));
                        break;
                    case 1:
                        z5.f0(this.b);
                        break;
                    case 2:
                        z5.i0(this.b);
                        break;
                    case 3:
                        this.b.L0();
                        break;
                    default:
                        z5.d0(this.b);
                        break;
                }
            }
        });
        fi.d dVar2 = new fi.d(context, this.resourceProvider, true);
        dVar2.setRoundRadius(24);
        this.C0 = dVar2;
        dVar2.setText(id.M0(2131743022, null));
        this.C0.setEnabled(l0.x(this.currentAccount).e());
        this.C0.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Wallet.h4
            public final /* synthetic */ z5 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i15) {
                    case 0:
                        z5 z5Var = this.b;
                        z5Var.getClass();
                        z5Var.presentFragment(new cb1(6, null));
                        break;
                    case 1:
                        z5.f0(this.b);
                        break;
                    case 2:
                        z5.i0(this.b);
                        break;
                    case 3:
                        this.b.L0();
                        break;
                    default:
                        z5.d0(this.b);
                        break;
                }
            }
        });
        this.z0.addView(this.C0, c8.ha.m(1.0f, 0, 48, 4, 0, 0));
        W0(this.e.getStickerStyle());
        this.D0 = l0.x(this.currentAccount).B();
        this.a.setDescendantFocusability(131072);
        d8 d8Var2 = new d8(this, this.e, new m4.d0(this, ra0Var, objArr2 == true ? 1 : 0), null);
        this.j0 = d8Var2;
        ra0Var.addView(d8Var2, c8.ha.c(-1.0f, -1));
        this.k0 = "";
        int i19 = 9;
        bi.t tVar = new bi.t(context, i19);
        this.n0 = tVar;
        tVar.setOrientation(1);
        org.telegram.ui.ActionBar.t6.h(i11, this.n0, getResourceProvider());
        fi.g1 g1Var = new fi.g1(this, context, this.resourceProvider, i19);
        this.p0 = g1Var;
        g1Var.setAllowDisallowInterceptTouch(false);
        this.p0.setAdapter(new bi.g5(i19, context, this));
        u61 n10 = this.p0.n(-2, true);
        this.g0 = n10;
        n10.g(i14, org.telegram.ui.ActionBar.m6.G6, i14, i17, i16);
        org.telegram.ui.ActionBar.t6.B(this.g0, org.telegram.ui.ActionBar.m6.d0(org.telegram.messenger.g0.L(20.0f), getThemedColor(i16)), org.telegram.ui.ActionBar.t6.M(i16), getResourceProvider());
        this.h0 = new FrameLayout(context);
        u8 u8Var = new u8(context, this.g0, this.resourceProvider, new m4(this, objArr == true ? 1 : 0), new m4(this, i10), new m4(this, 2));
        this.i0 = u8Var;
        this.h0.addView(u8Var, c8.ha.d(-1, 40.0f, 48, 16.0f, 0.0f, 16.0f, 0.0f));
        this.p0.setPosition(this.e0);
        a1();
        this.n0.addView(this.h0, c8.ha.k(0.0f, 0.0f, 0.0f, -6.0f, -1, 52));
        this.n0.addView(this.p0, c8.ha.l(1.0f, -1, 0));
        M0(this.f0);
        d0 d0Var2 = this.E0;
        if (d0Var2 != null) {
            this.j0.Y(d0Var2);
        }
        this.a.j(new ti(this, 21));
        m41 m41Var = this.a.f3;
        m41Var.r = false;
        m41Var.O(false);
        v5 v5Var2 = new v5(this);
        this.q0 = v5Var2;
        v5Var2.b(this.a);
        S0();
        this.D0.h();
        this.actionBar.post(new f4(this, 10));
        this.a.post(new f4(this, 12));
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.ls
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        fi.w3 w3Var;
        m41 m41Var;
        if (i10 != this.currentAccount) {
            return;
        }
        if (i7 == qs.a4 && this.t0 != null) {
            S0();
            Iterator it = this.P0.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
            return;
        }
        if (i7 == qs.y3) {
            b1();
            return;
        }
        if (i7 == qs.q0) {
            if (objArr.length > 0) {
                Object obj = objArr[0];
                if (obj instanceof TL_account.Password) {
                    this.R0 = true;
                    this.S0 = ((TL_account.Password) obj).has_password;
                    fi.w3 w3Var2 = this.a;
                    if (w3Var2 == null || (m41Var = w3Var2.f3) == null) {
                        return;
                    }
                    m41Var.O(true);
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
        k0 k0Var = this.D0;
        if (obj2 != k0Var || (w3Var = this.a) == null || w3Var.f3 == null) {
            return;
        }
        if (k0Var.b.isEmpty()) {
            k0 k0Var2 = this.D0;
            if (!k0Var2.h) {
                k0Var2.h();
            }
        }
        Y0(true);
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
        u8 u8Var = this.i0;
        if (u8Var == null || !u8Var.y) {
            return super.onBackPressed(z9);
        }
        if (z9) {
            u8Var.b(false);
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onBeginSlide() {
        v5 v5Var = this.q0;
        if (v5Var != null) {
            v5Var.c();
        }
        fi.w3 w3Var = this.a;
        if (w3Var != null) {
            w3Var.C0();
        }
        r41 y02 = y0();
        if (y02 != null) {
            y02.C0();
        }
        super.onBeginSlide();
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean onFragmentCreate() {
        Context context = org.telegram.messenger.t0.b;
        if (a6.k0.compareAndSet(false, true)) {
            a6.l0.postRunnable(new g4(context, 2));
        }
        getNotificationCenter().c(this, qs.a4);
        getNotificationCenter().c(this, qs.y3);
        getNotificationCenter().c(this, qs.b4);
        getNotificationCenter().c(this, qs.q0);
        l0 x10 = l0.x(this.currentAccount);
        if (x10.o == null) {
            x10.o = new d0(x10);
        }
        d0 d0Var = x10.o;
        this.E0 = d0Var;
        f4 f4Var = this.G0;
        ArrayList arrayList = d0Var.d;
        if (!arrayList.contains(f4Var)) {
            arrayList.add(f4Var);
        }
        org.telegram.ui.Components.q2 q2Var = this.T0;
        if (q2Var != null) {
            q2Var.run();
        }
        int i7 = x10.D;
        x10.D = i7 + 1;
        HashSet hashSet = x10.E;
        boolean isEmpty = hashSet.isEmpty();
        hashSet.add(Integer.valueOf(i7));
        if (isEmpty) {
            x10.S();
        }
        this.T0 = new org.telegram.ui.Components.q2(x10, i7, 28);
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
        d8 d8Var = this.j0;
        if (d8Var != null) {
            d8Var.p();
        }
        n5 n5Var = this.e;
        if (n5Var != null) {
            n5Var.setOnFrontContentPresented(null);
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
        Q0();
        v5 v5Var = this.q0;
        if (v5Var != null) {
            v5Var.b(null);
        }
        getNotificationCenter().n(this, qs.a4);
        getNotificationCenter().n(this, qs.y3);
        getNotificationCenter().n(this, qs.b4);
        getNotificationCenter().n(this, qs.q0);
        org.telegram.messenger.g0.E2(this.E);
        k0 k0Var = this.D0;
        if (k0Var != null) {
            k0Var.a();
        }
        super.onFragmentDestroy();
        org.telegram.ui.Components.q2 q2Var = this.T0;
        if (q2Var != null) {
            q2Var.run();
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
            L0();
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        alertDialog$Builder.a.T = org.telegram.messenger.g0.X2(id.M0(2131746503, null));
        alertDialog$Builder.k(id.M0(2131747300, null), new i4(this));
        alertDialog$Builder.h(id.M0(2131751772, null), null);
        int i10 = org.telegram.ui.ActionBar.m6.L5;
        alertDialog$Builder.m(R.raw.permission_request_camera, 72, org.telegram.ui.ActionBar.m6.x0(null, i10, false), null);
        alertDialog$Builder.n(i10, null);
        alertDialog$Builder.p();
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onResume() {
        super.onResume();
        org.telegram.ui.ActionBar.l lVar = this.actionBar;
        if (lVar != null) {
            lVar.post(new f4(this, 10));
        }
        l0.x(this.currentAccount).E();
        if (this.E0 != null && l0.x(this.currentAccount).G()) {
            d0 d0Var = this.E0;
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

    @Override // org.telegram.ui.ActionBar.f2
    public final void onThemeColorsChanged() {
        super.onThemeColorsChanged();
        try {
            if (this.t0 != null && this.u0 != null && this.e != null) {
                V0(this.x0);
            }
            n5 n5Var = this.e;
            if (n5Var != null && this.B0 != null && this.C0 != null) {
                W0(n5Var.getStickerStyle());
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
            j5 j5Var = this.S;
            if (j5Var != null) {
                j5Var.invalidate();
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
        U0();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.H0, f10);
        this.J0 = ofFloat;
        ofFloat.setDuration(z9 ? 260L : 120L);
        this.J0.setInterpolator(z9 ? new wq(0.05d, 0.7d, 0.1d, 1.0d) : new wq(0.4d, 0.0d, 0.2d, 1.0d));
        this.J0.addUpdateListener(new l4(this, 1));
        this.J0.addListener(new u81(this, 6));
        this.J0.start();
    }

    public final FrameLayout u0(TextView textView, Runnable runnable) {
        Context context = textView.getContext();
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(14.0f));
        int i7 = org.telegram.ui.ActionBar.m6.i6;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.m6.h0(getThemedColor(i7), 2, -1);
        org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i7);
        org.telegram.ui.ActionBar.h6 resourceProvider = getResourceProvider();
        frameLayout.setBackground(h02);
        org.telegram.ui.ActionBar.t6.j(frameLayout, h02, null, M, resourceProvider);
        org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.G6, getResourceProvider());
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setGravity(19);
        frameLayout.addView(textView, c8.ha.d(-1, -2.0f, 3, 0.0f, 0.0f, 42.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(R.drawable.attach_arrow_right);
        org.telegram.ui.ActionBar.t6.s(imageView, org.telegram.ui.ActionBar.m6.z6, getResourceProvider(), PorterDuff.Mode.SRC_IN);
        frameLayout.addView(imageView, c8.ha.e(-2, -2, 21));
        frameLayout.setOnClickListener(new h3(runnable, 3));
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
        spannableStringBuilder.append((CharSequence) l0.o(j3, false));
        spannableStringBuilder.setSpan(new xz(org.telegram.ui.ActionBar.m6.Ci, getResourceProvider()), length2, spannableStringBuilder.length(), 33);
        return id.V(null, null, i7, spannableStringBuilder);
    }

    public final r41 y0() {
        if (z0()) {
            fi.g1 g1Var = this.p0;
            View currentView = g1Var == null ? null : g1Var.getCurrentView();
            if (currentView instanceof r41) {
                return (r41) currentView;
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
