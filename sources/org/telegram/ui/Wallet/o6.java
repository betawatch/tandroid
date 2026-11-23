package org.telegram.ui.Wallet;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
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
import org.telegram.messenger.ce;
import org.telegram.messenger.fc;
import org.telegram.messenger.fs;
import org.telegram.messenger.gd;
import org.telegram.messenger.ks;
import org.telegram.messenger.m10;
import org.telegram.messenger.mp;
import org.telegram.messenger.n10;
import org.telegram.messenger.p10;
import org.telegram.messenger.r10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.d51;
import org.telegram.ui.Components.dy0;
import org.telegram.ui.Components.e21;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.ez0;
import org.telegram.ui.Components.fz0;
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.i00;
import org.telegram.ui.Components.j71;
import org.telegram.ui.Components.j80;
import org.telegram.ui.Components.k71;
import org.telegram.ui.Components.kq;
import org.telegram.ui.Components.kr;
import org.telegram.ui.Components.n41;
import org.telegram.ui.Components.o80;
import org.telegram.ui.Components.vz;
import org.telegram.ui.Components.x60;
import org.telegram.ui.Components.ys;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PasscodeActivity;
import org.telegram.ui.a31;
import org.telegram.ui.ao0;
import org.telegram.ui.b61;
import org.telegram.ui.hq0;
import org.telegram.ui.i71;
import org.telegram.ui.ig0;
import org.telegram.ui.oa0;
import org.telegram.ui.r90;
import org.telegram.ui.w61;
import org.telegram.ui.za1;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final class o6 extends d51 implements fs {
    public static Typeface Y0;
    public float A0;
    public float B0;
    public b61 C0;
    public float D0;
    public View E;
    public hi.e E0;
    public w61 F;
    public hi.e F0;
    public boolean G;
    public u0 G0;
    public m0 H0;
    public boolean I0;
    public View K0;
    public float L0;
    public float M0;
    public ValueAnimator N0;
    public org.telegram.ui.ActionBar.g5 P0;
    public ci.b0 Q0;
    public int R0;
    public k5 S;
    public y5 T;
    public FrameLayout U;
    public SpannableString U0;
    public TextView V;
    public boolean V0;
    public FrameLayout W;
    public boolean W0;
    public TextView X;
    public ao0 X0;
    public FrameLayout Y;
    public TextView Z;
    public j80 a0;
    public z5 b0;
    public boolean c0;
    public FrameLayout d0;
    public c6 e;
    public FrameLayout e0;
    public z5 f;
    public boolean g0;
    public int h;
    public j71 h0;
    public FrameLayout i0;
    public k9 j0;
    public s8 k0;
    public float m0;
    public d6 n;
    public ValueAnimator n0;
    public k5 o0;
    public int p0;
    public boolean q0;
    public int r;
    public boolean r0;
    public boolean s;
    public hi.q1 s0;
    public k6 t0;
    public LinearLayout v0;
    public org.telegram.ui.Components.n6 w0;
    public org.telegram.ui.Components.n6 x0;
    public FrameLayout y;
    public x6 y0;
    public f6 z0;
    public final o5 w = new o5(this, 0);
    public final q4 x = new ys() { // from class: org.telegram.ui.Wallet.q4
        @Override // org.telegram.ui.Components.ys
        public final void a(int i7, boolean z10) {
            bi.i6 i6Var;
            o6 o6Var = o6.this;
            o5 o5Var = o6Var.w;
            if ((i7 == 1 || i7 == 3) && (i6Var = o6Var.a) != null) {
                o6Var.s = z10;
                i6Var.removeCallbacks(o5Var);
                o5Var.run();
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
    public final g51[] u0 = new g51[2];
    public final r4 J0 = new r4(this, 0);
    public final r4 O0 = new r4(this, 1);
    public final CharSequence[] S0 = new CharSequence[2];
    public final HashSet T0 = new HashSet();

    public static boolean F0(String str) {
        if (str != null) {
            return "t.me".equalsIgnoreCase(str) || "telegram.me".equalsIgnoreCase(str) || "telegram.dog".equalsIgnoreCase(str);
        }
        return false;
    }

    public static boolean G0(Uri uri) {
        String scheme = uri.getScheme();
        if (!"ton".equalsIgnoreCase(scheme) && !"tc".equalsIgnoreCase(scheme)) {
            if (("https".equalsIgnoreCase(scheme) || "http".equalsIgnoreCase(scheme)) && F0(uri.getHost())) {
                List<String> pathSegments = uri.getPathSegments();
                if (pathSegments.size() != 1 || (!"sendgrams".equalsIgnoreCase(pathSegments.get(0)) && j1(uri) == null)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v4, types: [org.telegram.ui.Components.k71, org.telegram.ui.Wallet.n5] */
    public static void K0(Context context, int i7, TL_wallet.walletTransaction wallettransaction, r10 r10Var, p10 p10Var, byte[] bArr, org.telegram.ui.Cells.n0 n0Var, org.telegram.ui.ActionBar.i6 i6Var) {
        TL_wallet.nftItem nftitem;
        f3[] f3VarArr;
        View[] viewArr;
        p10 p10Var2;
        LinearLayout u02;
        if (context == null) {
            return;
        }
        TL_wallet.WalletTransactionPeer walletTransactionPeer = wallettransaction.peer;
        if (((walletTransactionPeer instanceof TL_wallet.walletTransactionPeerTelegramGift) || (walletTransactionPeer instanceof TL_wallet.walletTransactionPeerOnchainGift)) && (nftitem = wallettransaction.nft) != null) {
            TL_stars.StarGift starGift = nftitem.gift;
            if (starGift instanceof TL_stars.TL_starGiftUnique) {
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) starGift;
                di.f6 f6Var = new di.f6(context, i7, 0L, i6Var, null);
                f6Var.e3 = wallettransaction;
                g3 c10 = g3.c(wallettransaction);
                f6Var.b2.setStatusPill(c10 != null ? c10.e() : null);
                f6Var.u2(tL_starGiftUnique.slug, tL_starGiftUnique, null);
                f6Var.show();
                return;
            }
        }
        f3[] f3VarArr2 = new f3[1];
        View[] viewArr2 = new View[1];
        u0 H = v0.D(i7).H();
        ArrayList arrayList = new ArrayList(H.c);
        int i10 = 0;
        while (true) {
            if (i10 >= arrayList.size()) {
                i10 = -1;
                break;
            } else if (arrayList.get(i10) == wallettransaction || v0.t0(wallettransaction, (TL_wallet.walletTransaction) arrayList.get(i10))) {
                break;
            } else {
                i10++;
            }
        }
        if (r10Var == null && n0Var == null && i10 >= 0) {
            Rect rect = new Rect();
            context.getResources().getDrawable(R.drawable.sheet_shadow_round).getPadding(rect);
            viewArr = viewArr2;
            ?? n5Var = new n5(context, i6Var, arrayList, H, i7, rect, viewArr);
            n5Var.setPosition(i10);
            f3VarArr = f3VarArr2;
            n5Var.setAdapter(new p5(arrayList, context, i6Var, rect, i7, f3VarArr2));
            p10Var2 = p10Var;
            u02 = n5Var;
        } else {
            f3VarArr = f3VarArr2;
            viewArr = viewArr2;
            p10Var2 = p10Var;
            u02 = u0(context, i7, wallettransaction, r10Var, p10Var, bArr, n0Var, i6Var, f3VarArr, false);
        }
        f3[] f3VarArr3 = f3VarArr;
        q5 q5Var = new q5(context, u02, i6Var, u02, viewArr, context);
        f3VarArr3[0] = q5Var;
        if ((u02 instanceof k71) && p10Var2 != null) {
            q5Var.n(new r(4, p10Var2, wallettransaction));
        }
        f3VarArr3[0].A0(r10Var != null);
        f3 f3Var = f3VarArr3[0];
        f3Var.U0 = false;
        f3Var.show();
    }

    public static void M0(Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        org.telegram.ui.ActionBar.w2 j3 = org.telegram.messenger.f3.j(1, context, i6Var, false);
        FrameLayout frameLayout = new FrameLayout(context);
        int L = org.telegram.messenger.g0.L(16.0f);
        int i7 = org.telegram.ui.ActionBar.n6.h5;
        Drawable d02 = org.telegram.ui.ActionBar.n6.d0(L, org.telegram.ui.ActionBar.n6.w0(i7, i6Var));
        org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i7);
        frameLayout.setBackground(d02);
        org.telegram.ui.ActionBar.u6.j(frameLayout, d02, M, null, i6Var);
        frameLayout.setPadding(org.telegram.messenger.g0.L(36.0f), 0, org.telegram.messenger.g0.L(36.0f), org.telegram.messenger.g0.L(14.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(1);
        frameLayout.addView(linearLayout, c8.na.c(-2.0f, -1));
        linearLayout.addView(new n7(ks.q2, context, false), c8.na.t(ks.q2, ks.q2, 1, 0, -12, 0, -8));
        TextView textView = new TextView(context);
        textView.setText(gd.N0(2131742845, null));
        org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.j5, i6Var);
        textView.setTextSize(1, 17.0f);
        textView.setTypeface(org.telegram.messenger.g0.o1("fonts/rmedium.ttf"));
        textView.setGravity(17);
        TextView f10 = m10.f(linearLayout, textView, c8.na.t(-1, -2, 1, 0, 0, 0, 6), context);
        f10.setText(gd.N0(2131742844, null));
        int i10 = org.telegram.ui.ActionBar.n6.z6;
        org.telegram.ui.ActionBar.u6.U(f10, i10, i6Var);
        f10.setTextSize(1, 14.0f);
        f10.setGravity(17);
        f10.setLineSpacing(org.telegram.messenger.g0.L(1.0f), 1.0f);
        linearLayout.addView(f10, c8.na.t(-1, -2, 1, 0, 0, 0, 24));
        h6 h6Var = new h6(context, i6Var);
        h6Var.setPadding(org.telegram.messenger.g0.L(0.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(0.0f), org.telegram.messenger.g0.L(8.0f));
        h6Var.a(R.drawable.wallet_learn_instant, gd.N0(2131742748, null), gd.N0(2131742747, null));
        linearLayout.addView(h6Var, c8.na.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
        h6 h6Var2 = new h6(context, i6Var);
        h6Var2.setPadding(org.telegram.messenger.g0.L(0.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(0.0f), org.telegram.messenger.g0.L(8.0f));
        h6Var2.a(R.drawable.wallet_learn_fees, gd.N0(2131742816, null), gd.N0(2131742815, null));
        linearLayout.addView(h6Var2, c8.na.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
        h6 h6Var3 = new h6(context, i6Var);
        h6Var3.setPadding(org.telegram.messenger.g0.L(0.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(0.0f), org.telegram.messenger.g0.L(8.0f));
        h6Var3.a(R.drawable.wallet_learn_verified, gd.N0(2131742931, null), gd.N0(2131742930, null));
        linearLayout.addView(h6Var3, c8.na.k(0.0f, 0.0f, 0.0f, 14.0f, -1, -2));
        hi.e g10 = m10.g(24, context, i6Var, true);
        g10.setText(gd.N0(2131742849, null));
        linearLayout.addView(g10, c8.na.t(-1, 48, 1, 0, 0, 0, 0));
        c8.sa.b(g10, 0.02f, 1.1f);
        j80 j80Var = new j80(context, null);
        org.telegram.ui.ActionBar.u6.U(j80Var, i10, i6Var);
        j80Var.setTextSize(1, 13.0f);
        j80Var.setGravity(17);
        j80Var.setText(V0(gd.N0(2131742735, null), org.telegram.ui.ActionBar.n6.Xc, i6Var, new d5(context, 0)));
        linearLayout.addView(j80Var, c8.na.k(0.0f, 12.0f, 0.0f, 6.0f, -1, -2));
        j3.O = frameLayout;
        org.telegram.ui.ActionBar.w2[] w2VarArr = {j3};
        w2VarArr[0].u0(true);
        w2VarArr[0].O();
        g10.setOnClickListener(new a5(w2VarArr, 1));
        w2VarArr[0].show();
    }

    public static void N0(int i7, Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        v0 D = v0.D(i7);
        if (D.N()) {
            String y10 = D.y();
            if (TextUtils.isEmpty(y10)) {
                return;
            }
            O0(context, i7, y10, true, null, i6Var);
        }
    }

    public static void O0(Context context, final int i7, String str, final boolean z10, final p pVar, final org.telegram.ui.ActionBar.i6 i6Var) {
        float f10;
        int i10 = 1;
        int i11 = 0;
        final org.telegram.ui.ActionBar.w2 w2Var = new org.telegram.ui.ActionBar.w2(1, context, i6Var, false);
        w2Var.v0(-12207881);
        w2Var.P(-12207881);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackground(new n6());
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(1);
        frameLayout.addView(linearLayout, c8.na.f(-2.0f, -1, 55, org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(30.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f) + org.telegram.messenger.g0.n));
        m6 m6Var = new m6(context, str);
        if (!z10) {
            m6Var.b.setText(gd.N0(2131746304, null));
        }
        linearLayout.addView(m6Var, c8.na.r(ks.L4, ks.Z4, 1));
        TextView textView = new TextView(context);
        textView.setText(gd.N0(2131742770, null));
        textView.setTextColor(-1);
        textView.setTextSize(1, 14.0f);
        textView.setGravity(17);
        textView.setLineSpacing(org.telegram.messenger.g0.L(1.0f), 1.0f);
        linearLayout.addView(textView, c8.na.t(-1, -2, 1, 24, 0, 24, 20));
        final hi.e eVar = new hi.e(context, null, true);
        eVar.setRoundRadius(24);
        eVar.setColor(-1);
        eVar.setTextColor(-15556886);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (z10) {
            f10 = 12.0f;
            spannableStringBuilder.append((CharSequence) "$");
            spannableStringBuilder.setSpan(new kq(R.drawable.wallet_buy, 0), 0, spannableStringBuilder.length(), 33);
            spannableStringBuilder.append((CharSequence) " ").append((CharSequence) gd.N0(2131742929, null));
        } else {
            f10 = 12.0f;
            kq kqVar = new kq(R.drawable.mini_gram_24, 0);
            kqVar.c(org.telegram.messenger.g0.L(20.0f));
            spannableStringBuilder.append((CharSequence) "G");
            spannableStringBuilder.setSpan(kqVar, 0, spannableStringBuilder.length(), 33);
            spannableStringBuilder.append((CharSequence) "  ").append((CharSequence) gd.N0(2131742746, null));
        }
        eVar.setText(spannableStringBuilder);
        linearLayout.addView(eVar, c8.na.t(-1, 48, 1, 0, 0, 0, 0));
        if (!z10) {
            textView.setVisibility(8);
            eVar.setVisibility(pVar != null ? 0 : 8);
        }
        View e10 = m10.e(context, R.drawable.ic_close_white);
        e10.setPadding(org.telegram.messenger.g0.L(f10), org.telegram.messenger.g0.L(f10), org.telegram.messenger.g0.L(f10), org.telegram.messenger.g0.L(f10));
        e10.setContentDescription(gd.N0(2131752029, null));
        c8.sa.a(e10);
        frameLayout.addView(e10, c8.na.d(48, 48.0f, 51, 4.0f, 2.0f, 0.0f, 0.0f));
        w2Var.O = frameLayout;
        w2Var.x = true;
        w2Var.v0 = false;
        w2Var.w0 = false;
        w2Var.P(-12207881);
        e10.setOnClickListener(new s4(w2Var, i11));
        m6Var.f = new b1(str, i10);
        w2Var.show();
        w2Var.E0(-12207881);
        org.telegram.messenger.g0.s3(w2Var, -12207881, false, null);
        org.telegram.messenger.g0.m3(w2Var, false);
        if (Build.VERSION.SDK_INT >= 29 && w2Var.getWindow() != null) {
            w2Var.getWindow().setNavigationBarContrastEnforced(false);
        }
        eVar.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Wallet.t4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                boolean z11 = z10;
                org.telegram.ui.ActionBar.w2 w2Var2 = w2Var;
                if (!z11) {
                    w2Var2.dismiss();
                    pVar.run();
                    return;
                }
                hi.e eVar2 = eVar;
                if (eVar2.R) {
                    return;
                }
                eVar2.setLoading(true);
                x4 x4Var = new x4(eVar2, w2Var2, i6Var, 0);
                int i12 = i7;
                v0 D = v0.D(i12);
                D.x0(new e21(i12, x4Var, D));
            }
        });
    }

    public static SpannableStringBuilder V0(String str, int i7, org.telegram.ui.ActionBar.i6 i6Var, Runnable runnable) {
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
            spannableStringBuilder.setSpan(new ki.c3(i7, i6Var, runnable), indexOf, i10 + indexOf, 0);
        }
        return spannableStringBuilder;
    }

    public static void d0(o6 o6Var) {
        N0(o6Var.currentAccount, o6Var.getParentActivity(), o6Var.getResourceProvider());
    }

    public static void d1(g51 g51Var, boolean z10) {
        boolean canScrollVertically = g51Var.canScrollVertically(-1);
        g51Var.g3.O(z10);
        g51Var.a0();
        if (canScrollVertically) {
            return;
        }
        g51Var.f3.h1(0, 0);
    }

    public static void e0(o6 o6Var, String str, v0 v0Var, x60 x60Var, LinearLayout linearLayout, TL_wallet.currencyRate currencyrate) {
        if (currencyrate == null) {
            return;
        }
        org.telegram.ui.ActionBar.y0 y0Var = new org.telegram.ui.ActionBar.y0(2, o6Var.getParentActivity(), o6Var.resourceProvider, false, false);
        y0Var.setPadding(org.telegram.messenger.g0.L(18.0f), 0, org.telegram.messenger.g0.L(18.0f), 0);
        y0Var.setText(currencyrate.currency);
        y0Var.setSubtext(!TextUtils.isEmpty(currencyrate.translatedTitle) ? currencyrate.translatedTitle : currencyrate.title);
        boolean equals = TextUtils.equals(str, currencyrate.currency);
        y0Var.b.setPadding(0, 0, org.telegram.messenger.g0.L(equals ? 42.0f : 0.0f), 0);
        y0Var.setChecked(equals);
        y0Var.setOnClickListener(new s1(v0Var, currencyrate, x60Var, 2));
        linearLayout.addView(y0Var, c8.na.o(ks.e3, -2));
    }

    public static void f0(o6 o6Var) {
        N0(o6Var.currentAccount, o6Var.getParentActivity(), o6Var.getResourceProvider());
    }

    public static void g0(o6 o6Var) {
        org.telegram.ui.ActionBar.z4 z4Var;
        if (o6Var.F == null || (z4Var = o6Var.simpleActionBar) == null || !(z4Var.getParent() instanceof ViewGroup)) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) o6Var.simpleActionBar.getParent();
        viewGroup.setClipChildren(false);
        viewGroup.setClipToPadding(false);
        if (o6Var.F.getParent() != o6Var.simpleActionBar) {
            org.telegram.messenger.g0.E2(o6Var.F);
            o6Var.simpleActionBar.addView(o6Var.F, c8.na.c(56.0f, -1));
        }
        o6Var.F.bringToFront();
        o6Var.F.post(new r4(o6Var, 6));
    }

    public static void h0(o6 o6Var) {
        v0 D = v0.D(o6Var.currentAccount);
        hi.e eVar = o6Var.F0;
        if (eVar.R) {
            return;
        }
        eVar.setLoading(true);
        boolean z10 = false;
        D.x0(new h2.n0(D, new a31(13, o6Var, D), z10, z10, 4));
    }

    public static void i0(o6 o6Var, LinearLayout linearLayout, v0 v0Var, x60 x60Var) {
        TL_wallet.currencyRate currencyrate;
        o6 o6Var2;
        ArrayList<TL_wallet.currencyRate> arrayList;
        LinearLayout linearLayout2 = linearLayout;
        v0 v0Var2 = v0Var;
        linearLayout2.removeAllViews();
        String g10 = v0Var2.h.g();
        TL_wallet.currencyRates f10 = v0Var2.h.f();
        if (f10 == null) {
            for (int i7 = 0; i7 < 3; i7++) {
                vz vzVar = new vz(o6Var.getParentActivity(), o6Var.getResourceProvider());
                vzVar.setIsSingleCell(true);
                vzVar.setViewType(31);
                linearLayout2.addView(vzVar, c8.na.o(ks.e3, -2));
            }
            return;
        }
        g gVar = v0Var2.h;
        gVar.getClass();
        ArrayList arrayList2 = new ArrayList();
        TL_wallet.currencyRates f11 = gVar.f();
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
            currencyrate2 = g.e();
        }
        arrayList2.add(currencyrate2);
        if (currencyrate != null) {
            arrayList2.add(currencyrate);
        }
        if (f11 != null && f11.rates != null) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            linkedHashSet.add(gVar.g());
            try {
                InputMethodManager inputMethodManager = (InputMethodManager) org.telegram.messenger.t0.b.getSystemService("input_method");
                if (inputMethodManager != null) {
                    g.b(linkedHashSet, inputMethodManager.getCurrentInputMethodSubtype());
                    Iterator<InputMethodInfo> it = inputMethodManager.getEnabledInputMethodList().iterator();
                    while (it.hasNext()) {
                        Iterator<InputMethodSubtype> it2 = inputMethodManager.getEnabledInputMethodSubtypeList(it.next(), true).iterator();
                        while (it2.hasNext()) {
                            g.b(linkedHashSet, it2.next());
                        }
                    }
                }
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
            g.a(linkedHashSet, ((org.telegram.messenger.n0) mp.u1(gVar.a).A7.T.b).c);
            g.c(linkedHashSet, gd.E0().y);
            g.c(linkedHashSet, gd.E0().z);
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
                e0(o6Var, g10, v0Var2, x60Var, linearLayout2, currencyrate7);
            }
            i12++;
            v0Var2 = v0Var;
        }
        if (hashSet.isEmpty() || f10.rates.isEmpty()) {
            o6Var2 = o6Var;
        } else {
            o6Var2 = o6Var;
            linearLayout2.addView(new org.telegram.ui.ActionBar.d1(o6Var.getParentActivity(), o6Var2.resourceProvider), c8.na.o(-1, 8));
        }
        int i13 = 0;
        while (i13 < f10.rates.size()) {
            TL_wallet.currencyRate currencyrate8 = f10.rates.get(i13);
            if (currencyrate8 != null && !hashSet.contains(currencyrate8.currency)) {
                e0(o6Var2, g10, v0Var, x60Var, linearLayout2, currencyrate8);
            }
            i13++;
            o6Var2 = o6Var;
            linearLayout2 = linearLayout;
        }
    }

    public static Uri i1(String str) {
        Uri parse = Uri.parse(str.trim());
        if (parse.getScheme() == null) {
            Uri parse2 = Uri.parse("https://" + str.trim());
            if (F0(parse2.getHost())) {
                return parse2;
            }
        }
        return parse;
    }

    public static void j0(o6 o6Var) {
        vf.c.t(o6Var.getParentActivity(), v0.D(o6Var.currentAccount).j);
    }

    public static String j1(Uri uri) {
        if (!F0(uri.getHost())) {
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

    public static void k0(o6 o6Var, String str) {
        Uri i12 = i1(str);
        String j12 = j1(i12);
        if (j12 != null) {
            int i7 = o6Var.currentAccount;
            mp.u1(i7).f2().a(j12, null, new hi.a4(i7, new w4(o6Var, 4), 7));
        } else {
            if ((o6Var.getParentActivity() instanceof LaunchActivity) && new r90((LaunchActivity) o6Var.getParentActivity(), o6Var.currentAccount, null, false).g(i12)) {
                return;
            }
            org.telegram.messenger.g0.g3(new r4(o6Var, 9));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void l0(final o6 o6Var, Context context, org.telegram.ui.ActionBar.g5 g5Var, View view) {
        v0 D = v0.D(o6Var.currentAccount);
        final x60 J = x60.J(o6Var, view);
        J.b0(0.0f, -org.telegram.messenger.g0.L(48.0f));
        final int i7 = 0;
        J.s = 0;
        J.W(5);
        x60 K = J.K();
        K.c(R.drawable.ic_ab_back, gd.N0(2131742941, null), new hq0(J, 27), false);
        K.k();
        ScrollView scrollView = new ScrollView(context);
        LinearLayout linearLayout = new LinearLayout(context);
        final int i10 = 1;
        linearLayout.setOrientation(1);
        scrollView.addView(linearLayout);
        w7 w7Var = new w7(o6Var, linearLayout, D, J, 10);
        K.r(scrollView, c8.na.o(-1, ks.V5));
        J.c(R.drawable.wallet_globe, gd.N0(2131742897, null), new p(w7Var, J, K, 11), false);
        org.telegram.ui.ActionBar.y0 z10 = J.z();
        g gVar = D.h;
        String i11 = gVar.i();
        boolean isEmpty = TextUtils.isEmpty(i11);
        String str = i11;
        if (isEmpty) {
            z10.setSubtext("USD");
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(gd.N0(2131748586, null));
            spannableStringBuilder.setSpan(new o80(org.telegram.messenger.g0.L(75.0f), z10.b), 0, spannableStringBuilder.length(), 33);
            str = spannableStringBuilder;
        }
        z10.setSubtext(str);
        final w7 w7Var2 = new w7(D, new boolean[]{gVar.f() != null}, z10, w7Var, 11);
        o6Var.T0.add(w7Var2);
        w7Var.run();
        J.c(R.drawable.wallet_lock, gd.N0(2131747463, null), new Runnable(o6Var) { // from class: org.telegram.ui.Wallet.z4
            public final /* synthetic */ o6 b;

            {
                this.b = o6Var;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i7) {
                    case 0:
                        o6 o6Var2 = this.b;
                        o6Var2.getClass();
                        J.v();
                        o6Var2.presentFragment(PasscodeActivity.p0());
                        break;
                    case 1:
                        o6 o6Var3 = this.b;
                        o6Var3.getClass();
                        J.v();
                        o6Var3.presentFragment(new e9());
                        break;
                    case 2:
                        o6 o6Var4 = this.b;
                        o6Var4.getClass();
                        J.v();
                        o6Var4.presentFragment(new za());
                        break;
                    default:
                        J.v();
                        o6 o6Var5 = this.b;
                        o6.M0(o6Var5.getParentActivity(), o6Var5.getResourceProvider());
                        break;
                }
            }
        }, false);
        J.c(R.drawable.wallet_key, gd.N0(2131742828, null), new Runnable(o6Var) { // from class: org.telegram.ui.Wallet.z4
            public final /* synthetic */ o6 b;

            {
                this.b = o6Var;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i10) {
                    case 0:
                        o6 o6Var2 = this.b;
                        o6Var2.getClass();
                        J.v();
                        o6Var2.presentFragment(PasscodeActivity.p0());
                        break;
                    case 1:
                        o6 o6Var3 = this.b;
                        o6Var3.getClass();
                        J.v();
                        o6Var3.presentFragment(new e9());
                        break;
                    case 2:
                        o6 o6Var4 = this.b;
                        o6Var4.getClass();
                        J.v();
                        o6Var4.presentFragment(new za());
                        break;
                    default:
                        J.v();
                        o6 o6Var5 = this.b;
                        o6.M0(o6Var5.getParentActivity(), o6Var5.getResourceProvider());
                        break;
                }
            }
        }, false);
        final int i12 = 2;
        J.l(R.drawable.wallet_apps, gd.N0(2131742905, null), new Runnable(o6Var) { // from class: org.telegram.ui.Wallet.z4
            public final /* synthetic */ o6 b;

            {
                this.b = o6Var;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i12) {
                    case 0:
                        o6 o6Var2 = this.b;
                        o6Var2.getClass();
                        J.v();
                        o6Var2.presentFragment(PasscodeActivity.p0());
                        break;
                    case 1:
                        o6 o6Var3 = this.b;
                        o6Var3.getClass();
                        J.v();
                        o6Var3.presentFragment(new e9());
                        break;
                    case 2:
                        o6 o6Var4 = this.b;
                        o6Var4.getClass();
                        J.v();
                        o6Var4.presentFragment(new za());
                        break;
                    default:
                        J.v();
                        o6 o6Var5 = this.b;
                        o6.M0(o6Var5.getParentActivity(), o6Var5.getResourceProvider());
                        break;
                }
            }
        }, !D.g.d.isEmpty());
        J.k();
        final int i13 = 3;
        J.c(R.drawable.wallet_help, gd.N0(2131742689, null), new Runnable(o6Var) { // from class: org.telegram.ui.Wallet.z4
            public final /* synthetic */ o6 b;

            {
                this.b = o6Var;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i13) {
                    case 0:
                        o6 o6Var2 = this.b;
                        o6Var2.getClass();
                        J.v();
                        o6Var2.presentFragment(PasscodeActivity.p0());
                        break;
                    case 1:
                        o6 o6Var3 = this.b;
                        o6Var3.getClass();
                        J.v();
                        o6Var3.presentFragment(new e9());
                        break;
                    case 2:
                        o6 o6Var4 = this.b;
                        o6Var4.getClass();
                        J.v();
                        o6Var4.presentFragment(new za());
                        break;
                    default:
                        J.v();
                        o6 o6Var5 = this.b;
                        o6.M0(o6Var5.getParentActivity(), o6Var5.getResourceProvider());
                        break;
                }
            }
        }, false);
        org.telegram.ui.ActionBar.k5 simpleMenuOverlay = o6Var.getSimpleMenuOverlay();
        if (simpleMenuOverlay != null) {
            simpleMenuOverlay.setOutlineProvider(null);
            simpleMenuOverlay.setTranslationZ(org.telegram.messenger.g0.L(20.0f));
        }
        if (simpleMenuOverlay != null) {
            ViewGroup viewGroup = J.A;
            if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                org.telegram.ui.ActionBar.z4 z4Var = o6Var.simpleActionBar;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) viewGroup;
                org.telegram.ui.ActionBar.k5 menuOverlay = z4Var.getMenuOverlay();
                if (menuOverlay != null && g5Var.getParent() == z4Var.d) {
                    menuOverlay.d(z4Var, g5Var, actionBarPopupWindow$ActionBarPopupWindowLayout);
                    J.p = new m(simpleMenuOverlay, 6);
                    simpleMenuOverlay.setOnClosed(new Runnable(o6Var) { // from class: org.telegram.ui.Wallet.y4
                        public final /* synthetic */ o6 b;

                        {
                            this.b = o6Var;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i10) {
                                case 0:
                                    this.b.T0.remove(w7Var2);
                                    break;
                                default:
                                    this.b.T0.remove(w7Var2);
                                    break;
                            }
                        }
                    });
                    return;
                }
            }
        }
        J.p = new Runnable(o6Var) { // from class: org.telegram.ui.Wallet.y4
            public final /* synthetic */ o6 b;

            {
                this.b = o6Var;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i7) {
                    case 0:
                        this.b.T0.remove(w7Var2);
                        break;
                    default:
                        this.b.T0.remove(w7Var2);
                        break;
                }
            }
        };
        J.a0();
    }

    public static void m0(o6 o6Var, long j3) {
        r4 r4Var = o6Var.O0;
        if (o6Var.a == null) {
            return;
        }
        k9 k9Var = o6Var.j0;
        if (k9Var != null) {
            k9Var.a();
        }
        if (o6Var.M0 <= 0.0f && o6Var.D0()) {
            int top = o6Var.a.f3.m(o6Var.h).getTop() - o6Var.a.getPaddingTop();
            o6Var.a.C0();
            if (top < 0) {
                o6Var.a.w0(0, top, kr.h);
                return;
            }
            return;
        }
        o6Var.a.C0();
        o6Var.t0(true);
        org.telegram.messenger.g0.r(r4Var);
        if (j3 > 0) {
            org.telegram.messenger.g0.h3(r4Var, j3 + 260);
        }
    }

    public static Typeface s0(Context context) {
        if (Y0 == null) {
            if (Build.VERSION.SDK_INT >= 26) {
                Y0 = new Typeface.Builder(context.getAssets(), "fonts/rmono_var.ttf").setFontVariationSettings("'wght' 500").setWeight(500).build();
            } else {
                Y0 = org.telegram.messenger.g0.o1("fonts/rmono.ttf");
            }
        }
        return Y0;
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x03aa  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x03db A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x03ed  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x05b7  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x063e  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0689  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0625  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0557  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static LinearLayout u0(final Context context, int i7, TL_wallet.walletTransaction wallettransaction, r10 r10Var, p10 p10Var, byte[] bArr, Runnable runnable, org.telegram.ui.ActionBar.i6 i6Var, f3[] f3VarArr, boolean z10) {
        String y10;
        String str;
        r5 r5Var;
        TextView textView;
        ImageView imageView;
        ImageView imageView2;
        float f10;
        int i10;
        ImageView imageView3;
        dy0 dy0Var;
        SpannableString[] spannableStringArr;
        LinearLayout linearLayout;
        final String[] strArr;
        boolean[] zArr;
        TextView[] textViewArr;
        TL_wallet.walletTransaction wallettransaction2;
        s5 s5Var;
        int i11;
        u5 u5Var;
        final f3[] f3VarArr2;
        char c10;
        Object x10;
        int i12;
        final FrameLayout frameLayout;
        final org.telegram.ui.ActionBar.i6 i6Var2 = i6Var;
        boolean z11 = r10Var != null;
        final LinearLayout g10 = org.telegram.messenger.f3.g(context, 1);
        FrameLayout frameLayout2 = new FrameLayout(context);
        g10.addView(frameLayout2, c8.na.o(-1, 56));
        int i13 = org.telegram.ui.ActionBar.n6.G6;
        org.telegram.ui.ActionBar.n6.w0(i13, i6Var2);
        int i14 = org.telegram.ui.ActionBar.n6.i6;
        int w02 = org.telegram.ui.ActionBar.n6.w0(i14, i6Var2);
        ImageView imageView4 = new ImageView(context);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView4.setScaleType(scaleType);
        imageView4.setImageResource(R.drawable.ic_ab_close);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        org.telegram.ui.ActionBar.u6.s(imageView4, i13, i6Var2, mode);
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.n6.h0(w02, 1, -1);
        org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i14);
        imageView4.setBackground(h02);
        org.telegram.ui.ActionBar.u6.j(imageView4, h02, null, M, i6Var2);
        imageView4.setContentDescription(gd.N0(2131752029, null));
        frameLayout2.addView(imageView4, c8.na.d(48, 48.0f, 19, 4.0f, -2.0f, 0.0f, 0.0f));
        ImageView imageView5 = new ImageView(context);
        imageView5.setScaleType(scaleType);
        imageView5.setImageResource(R.drawable.ic_ab_other);
        org.telegram.ui.ActionBar.u6.s(imageView5, i13, i6Var2, mode);
        org.telegram.ui.Cells.y h03 = org.telegram.ui.ActionBar.n6.h0(w02, 1, -1);
        org.telegram.ui.ActionBar.q6 M2 = org.telegram.ui.ActionBar.u6.M(i14);
        imageView5.setBackground(h03);
        org.telegram.ui.ActionBar.u6.j(imageView5, h03, null, M2, i6Var2);
        imageView5.setContentDescription(gd.N0(2131754838, null));
        imageView5.setVisibility(r10Var != null ? 8 : 0);
        frameLayout2.addView(imageView5, c8.na.d(44, 48.0f, 21, 0.0f, 2.0f, 4.0f, 0.0f));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        linearLayout2.setGravity(1);
        g10.addView(linearLayout2, c8.na.k(14.0f, wallettransaction.key_change ? -20.0f : -40.0f, 14.0f, 24.0f, -1, -2));
        View n7Var = new n7(120, context, z10);
        n7Var.setTag(n7.class);
        linearLayout2.addView(n7Var, c8.na.t(120, 120, 1, 0, 0, 0, -8));
        r5 r5Var2 = new r5(context);
        r5Var2.setSingleLine(true);
        r5Var2.setGravity(17);
        r5Var2.setIncludeFontPadding(false);
        r5Var2.setTextSize(1, 40.0f);
        r5Var2.setTypeface(org.telegram.messenger.g0.o());
        linearLayout2.addView(r5Var2, c8.na.r(-1, 50, 1));
        TextView textView2 = new TextView(context);
        textView2.setGravity(17);
        textView2.setIncludeFontPadding(false);
        textView2.setTextSize(1, 14.0f);
        int i15 = org.telegram.ui.ActionBar.n6.z6;
        org.telegram.ui.ActionBar.u6.U(textView2, i15, i6Var2);
        linearLayout2.addView(textView2, c8.na.t(-1, 20, 1, 0, 3, 0, 0));
        if (wallettransaction.key_change) {
            linearLayout2.removeAllViews();
            FrameLayout frameLayout3 = new FrameLayout(context);
            frameLayout3.setBackground(org.telegram.ui.ActionBar.n6.M(org.telegram.messenger.g0.L(76.0f), -7956054, -9534569));
            ImageView imageView6 = new ImageView(context);
            imageView6.setImageResource(R.drawable.wallet_transaction_key);
            imageView6.setScaleType(ImageView.ScaleType.FIT_CENTER);
            frameLayout3.addView(imageView6, c8.na.e(44, 44, 17));
            linearLayout2.addView(frameLayout3, c8.na.r(76, 76, 1));
            TextView textView3 = new TextView(context);
            textView3.setText(gd.N0(2131742829, null));
            org.telegram.messenger.f3.l(textView3, i13, i6Var2, 1, 18.0f);
            textView3.setGravity(17);
            textView3.setIncludeFontPadding(false);
            linearLayout2.addView(textView3, c8.na.t(-1, 24, 1, 12, 12, 12, 0));
        } else if (wallettransaction.nft != null) {
            linearLayout2.removeAllViews();
            TL_wallet.nftItem nftitem = wallettransaction.nft;
            org.telegram.ui.Components.p9 p9Var = new org.telegram.ui.Components.p9(context);
            p9Var.setRoundRadius(org.telegram.messenger.g0.L(12.0f));
            p9Var.setContentDescription(nftitem.name);
            Drawable mutate = context.getResources().getDrawable(R.drawable.wallet_nft_placeholder).mutate();
            org.telegram.ui.ActionBar.u6.x(p9Var, mutate, i15, i6Var2, mode);
            fc c11 = c.c(nftitem, false);
            if (c11 != null) {
                p9Var.j(c11, "120_120", mutate, nftitem);
            } else {
                p9Var.setImageDrawable(mutate);
            }
            linearLayout2.addView(p9Var, c8.na.r(120, 120, 1));
            TextView textView4 = new TextView(context);
            textView4.setText(TextUtils.isEmpty(nftitem.name) ? gd.N0(2131742925, null) : nftitem.name);
            org.telegram.messenger.f3.l(textView4, i13, i6Var2, 1, 17.0f);
            textView4.setGravity(17);
            linearLayout2.addView(textView4, c8.na.k(12.0f, 16.0f, 12.0f, 0.0f, -1, -2));
            if (wallettransaction.incoming) {
                y10 = v0.D(i7).y();
            } else {
                TL_wallet.WalletTransactionPeer walletTransactionPeer = wallettransaction.peer;
                if (walletTransactionPeer == null) {
                    str = null;
                    if (r10Var == null) {
                        if (wallettransaction.comment_encrypted || wallettransaction.comment_encrypted_preparing) {
                            f10 = 11.0f;
                            if (wallettransaction.comment_encrypted_preparing || !TextUtils.isEmpty(str)) {
                                xh.l lVar = new xh.l(context, i6Var2, false);
                                lVar.r = false;
                                lVar.setTextSize(1, 15.0f);
                                org.telegram.ui.ActionBar.u6.U(lVar, i13, i6Var2);
                                StringBuilder sb2 = new StringBuilder(25);
                                int i16 = 0;
                                for (int i17 = 25; i16 < i17; i17 = 25) {
                                    sb2.append("a");
                                    i16++;
                                }
                                SpannableString spannableString = new SpannableString(sb2.toString());
                                ez0 ez0Var = new ez0();
                                ez0Var.a |= 256;
                                spannableString.setSpan(new fz0(ez0Var, 0), 0, spannableString.length(), 33);
                                lVar.setText(spannableString);
                                org.telegram.ui.ActionBar.u4 u4Var = new org.telegram.ui.ActionBar.u4(0, false, false, null);
                                u4Var.x = false;
                                u4Var.w = Integer.valueOf(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.am, i6Var2));
                                lVar.setBackground(u4Var);
                                lVar.setPadding(org.telegram.messenger.g0.L(19.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(15.0f), org.telegram.messenger.g0.L(11.0f));
                                linearLayout2.addView(lVar, c8.na.t(-2, -2, 1, 32, 15, 32, 0));
                                c8.sa.a(lVar);
                                i10 = 1;
                                textView = textView2;
                                r5Var = r5Var2;
                                imageView = imageView4;
                                imageView2 = imageView5;
                                lVar.setOnClickListener(new di.ba(new boolean[]{false}, f3VarArr, i6Var2, lVar, wallettransaction, i7, str));
                                SpannableString[] spannableStringArr2 = new SpannableString[i10];
                                TextView[] textViewArr2 = new TextView[i10];
                                dy0 dy0Var2 = new dy0(context, i6Var2);
                                g10.addView(dy0Var2, c8.na.k(14.0f, 0.0f, 14.0f, 0.0f, -1, -2));
                                String[] strArr2 = {wallettransaction.comment};
                                final boolean[] zArr2 = {(wallettransaction.comment_encrypted || (z11 && bArr == null)) ? false : true};
                                int i18 = 5;
                                if (r10Var == null) {
                                    FrameLayout frameLayout4 = new FrameLayout(context);
                                    int L = org.telegram.messenger.g0.L(22.0f);
                                    int L2 = org.telegram.messenger.g0.L(22.0f);
                                    int i19 = org.telegram.ui.ActionBar.n6.a7;
                                    ShapeDrawable e02 = org.telegram.ui.ActionBar.n6.e0(L, L2, org.telegram.ui.ActionBar.n6.w0(i19, i6Var2));
                                    org.telegram.ui.ActionBar.q6 M3 = org.telegram.ui.ActionBar.u6.M(i19);
                                    frameLayout4.setBackground(e02);
                                    org.telegram.ui.ActionBar.u6.j(frameLayout4, e02, M3, null, i6Var2);
                                    final r rVar = new r(i18, textViewArr2, spannableStringArr2);
                                    final Runnable[] runnableArr = new Runnable[1];
                                    ImageView imageView7 = imageView;
                                    final ce ceVar = new ce(runnableArr, textViewArr2, i7, i6Var2, wallettransaction, strArr2, zArr2, bArr);
                                    dy0Var = dy0Var2;
                                    textViewArr = textViewArr2;
                                    wallettransaction2 = wallettransaction;
                                    s5 s5Var2 = new s5(context, i6Var2);
                                    s5Var2.setHint(gd.N0(2131742788, null));
                                    s5Var2.setText(strArr2[0]);
                                    s5Var2.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(f10), org.telegram.messenger.g0.L(64.0f), org.telegram.messenger.g0.L(12.0f));
                                    int i20 = org.telegram.ui.ActionBar.n6.G6;
                                    org.telegram.ui.ActionBar.u6.U(s5Var2, i20, i6Var2);
                                    org.telegram.ui.ActionBar.q6 K = org.telegram.ui.ActionBar.u6.K(0.65f, i20);
                                    spannableStringArr = spannableStringArr2;
                                    org.telegram.ui.ActionBar.u6.n(s5Var2, 1, K.a, -1, 2, K.d, i6Var);
                                    s5Var2.setMaxLines(4);
                                    frameLayout4.addView(s5Var2, c8.na.d(-1, -2.0f, ks.E1, 0.0f, 0.0f, (wallettransaction2.nft != null || bArr == null) ? 0.0f : 44.0f, 0.0f));
                                    s5Var2.addTextChangedListener(new t5(strArr2, rVar, runnableArr, ceVar));
                                    if (wallettransaction2.nft != null || bArr == null) {
                                        frameLayout = frameLayout4;
                                        i6Var2 = i6Var;
                                        zArr = zArr2;
                                        strArr = strArr2;
                                        linearLayout = g10;
                                        s5Var = s5Var2;
                                        imageView3 = imageView7;
                                    } else {
                                        FrameLayout frameLayout5 = new FrameLayout(context);
                                        c8.sa.a(frameLayout5);
                                        final ImageView imageView8 = new ImageView(context);
                                        frameLayout5.addView(imageView8, c8.na.c(-1.0f, -1));
                                        imageView8.setScaleType(ImageView.ScaleType.CENTER);
                                        org.telegram.ui.ActionBar.u6.s(imageView8, zArr2[0] ? org.telegram.ui.ActionBar.n6.Fi : org.telegram.ui.ActionBar.n6.z6, i6Var, PorterDuff.Mode.SRC_IN);
                                        imageView8.setImageResource(zArr2[0] ? R.drawable.wallet_comment_locked : R.drawable.wallet_comment_unlocked);
                                        int i21 = org.telegram.ui.ActionBar.n6.i6;
                                        strArr = strArr2;
                                        org.telegram.ui.Cells.y h04 = org.telegram.ui.ActionBar.n6.h0(org.telegram.ui.ActionBar.n6.w0(i21, i6Var), 1, -1);
                                        org.telegram.ui.ActionBar.q6 M4 = org.telegram.ui.ActionBar.u6.M(i21);
                                        imageView8.setBackground(h04);
                                        org.telegram.ui.ActionBar.u6.j(imageView8, h04, null, M4, i6Var);
                                        final hi.u3[] u3VarArr = new hi.u3[1];
                                        frameLayout = frameLayout4;
                                        i6Var2 = i6Var;
                                        s5Var = s5Var2;
                                        imageView3 = imageView7;
                                        zArr = zArr2;
                                        linearLayout = g10;
                                        frameLayout5.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Wallet.c5
                                            @Override // android.view.View.OnClickListener
                                            public final void onClick(View view) {
                                                final boolean[] zArr3 = zArr2;
                                                zArr3[0] = !zArr3[0];
                                                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
                                                final AtomicBoolean atomicBoolean = new AtomicBoolean();
                                                final ImageView imageView9 = imageView8;
                                                final org.telegram.ui.ActionBar.i6 i6Var3 = i6Var2;
                                                duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Wallet.e5
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
                                                            org.telegram.ui.ActionBar.u6.s(imageView10, zArr4[0] ? org.telegram.ui.ActionBar.n6.Fi : org.telegram.ui.ActionBar.n6.z6, i6Var3, PorterDuff.Mode.SRC_IN);
                                                            imageView10.setImageResource(zArr4[0] ? R.drawable.wallet_comment_locked : R.drawable.wallet_comment_unlocked);
                                                        }
                                                    }
                                                });
                                                duration.setInterpolator(kr.h);
                                                duration.setDuration(420L);
                                                duration.start();
                                                hi.u3[] u3VarArr2 = u3VarArr;
                                                hi.u3 u3Var = u3VarArr2[0];
                                                if (u3Var != null) {
                                                    u3Var.f(true);
                                                    u3VarArr2[0] = null;
                                                }
                                                LinearLayout linearLayout3 = g10;
                                                if (linearLayout3.getParent() instanceof FrameLayout) {
                                                    FrameLayout frameLayout6 = (FrameLayout) linearLayout3.getParent();
                                                    hi.u3 u3Var2 = new hi.u3(context, 3);
                                                    u3VarArr2[0] = u3Var2;
                                                    u3Var2.t();
                                                    u3Var2.setPadding(org.telegram.messenger.g0.L(10.0f), 0, org.telegram.messenger.g0.L(10.0f), 0);
                                                    u3Var2.v(gd.N0(zArr3[0] ? 2131742776 : 2131742771, null));
                                                    u3Var2.setTranslationY(-(org.telegram.messenger.g0.L(44.0f) + (linearLayout3.getHeight() - frameLayout.getBottom())));
                                                    u3Var2.p(1.0f, -org.telegram.messenger.g0.L(26.0f));
                                                    u3Var2.s(20.0f);
                                                    u3Var2.u(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.ui.ActionBar.n6.r1(0.25f, -16777216));
                                                    frameLayout6.addView(u3Var2, c8.na.e(-1, ks.e3, 87));
                                                    u3Var2.x();
                                                    u3Var2.r0 = new m(u3Var2, 7);
                                                }
                                                if (TextUtils.isEmpty(strArr[0])) {
                                                    return;
                                                }
                                                rVar.run();
                                                Runnable[] runnableArr2 = runnableArr;
                                                Runnable runnable2 = runnableArr2[0];
                                                if (runnable2 != null) {
                                                    runnable2.run();
                                                    runnableArr2[0] = null;
                                                }
                                                ce ceVar2 = ceVar;
                                                org.telegram.messenger.g0.r(ceVar2);
                                                org.telegram.messenger.g0.h3(ceVar2, 1000L);
                                            }
                                        });
                                        frameLayout.addView(frameLayout5, c8.na.e(44, 44, 85));
                                    }
                                    linearLayout.addView(frameLayout, c8.na.k(14.0f, 12.0f, 14.0f, 8.0f, -1, -2));
                                } else {
                                    imageView3 = imageView;
                                    dy0Var = dy0Var2;
                                    spannableStringArr = spannableStringArr2;
                                    linearLayout = g10;
                                    strArr = strArr2;
                                    zArr = zArr2;
                                    textViewArr = textViewArr2;
                                    wallettransaction2 = wallettransaction;
                                    s5Var = null;
                                }
                                hi.e g11 = m10.g(24, context, i6Var2, true);
                                g11.setText(gd.N0(2131747637, null));
                                linearLayout.addView(g11, c8.na.k(14.0f, 14.0f, 14.0f, 14.0f, -1, 48));
                                TL_wallet.walletTransaction[] wallettransactionArr = {wallettransaction2};
                                fi.r rVar2 = new fi.r(linearLayout, r5Var, i6Var2, i7, textView, f3VarArr, dy0Var, r10Var, context, textViewArr, spannableStringArr);
                                LinearLayout linearLayout3 = linearLayout;
                                linearLayout3.setTag(new r(6, rVar2, wallettransactionArr));
                                rVar2.a(wallettransaction2);
                                if (z11) {
                                    i11 = i7;
                                    u5 u5Var2 = new u5(i11, wallettransactionArr, rVar2);
                                    if (wallettransaction2.preview) {
                                        v0 D = v0.D(i11);
                                        String str2 = wallettransaction2.id;
                                        o oVar = new o(wallettransaction2, rVar2, wallettransactionArr, 5);
                                        HashMap hashMap = D.N;
                                        u0 u0Var = D.n;
                                        if (u0Var != null) {
                                            ArrayList arrayList = u0Var.c;
                                            int size = arrayList.size();
                                            int i22 = 0;
                                            while (i22 < size) {
                                                Object obj = arrayList.get(i22);
                                                i22++;
                                                TL_wallet.walletTransaction wallettransaction3 = (TL_wallet.walletTransaction) obj;
                                                if (TextUtils.equals(wallettransaction3.id, str2)) {
                                                    oVar.a(wallettransaction3);
                                                    break;
                                                }
                                            }
                                        }
                                        if (hashMap.get(str2) != null) {
                                            oVar.a((TL_wallet.walletTransaction) hashMap.get(str2));
                                        } else {
                                            TL_wallet.getTransactionsByIDs gettransactionsbyids = new TL_wallet.getTransactionsByIDs();
                                            gettransactionsbyids.id.add(str2);
                                            ConnectionsManager.getInstance(D.a).sendRequestTyped(gettransactionsbyids, new d3.b(1), new j(D, (Object) oVar, (Object) str2, 3));
                                        }
                                    }
                                    u5Var = u5Var2;
                                } else {
                                    i11 = i7;
                                    u5Var = null;
                                }
                                String[] strArr3 = strArr;
                                boolean[] zArr3 = zArr;
                                linearLayout3.addOnAttachStateChangeListener(new v5(rVar2, wallettransactionArr, u5Var, i11, p10Var, f3VarArr, strArr3, zArr3));
                                if (r10Var == null) {
                                    TL_wallet.nftItem nftitem2 = wallettransaction2.nft;
                                    if (nftitem2 != null) {
                                        x10 = TextUtils.isEmpty(nftitem2.name) ? gd.N0(2131742925, null) : wallettransaction2.nft.name;
                                        i12 = 1;
                                        c10 = 0;
                                    } else {
                                        long abs = Math.abs(wallettransaction2.amount);
                                        c10 = 0;
                                        x10 = v0.x(abs, false);
                                        i12 = 1;
                                    }
                                    Object[] objArr = new Object[i12];
                                    objArr[c10] = x10;
                                    g11.setText(gd.V(null, null, 2131742750, objArr));
                                    f3VarArr2 = f3VarArr;
                                    g11.setOnClickListener(new org.telegram.messenger.video.f(g11, s5Var, r10Var, strArr3, zArr3, f3VarArr2, i6Var));
                                } else {
                                    f3VarArr2 = f3VarArr;
                                    final int i23 = 0;
                                    if (runnable != null) {
                                        g11.setText(gd.N0(2131742789, null));
                                        g11.setOnClickListener(new ig0(21, runnable, f3VarArr2));
                                    } else {
                                        g11.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Wallet.b5
                                            @Override // android.view.View.OnClickListener
                                            public final void onClick(View view) {
                                                switch (i23) {
                                                    case 0:
                                                        f3VarArr2[0].dismiss();
                                                        break;
                                                    default:
                                                        f3VarArr2[0].dismiss();
                                                        break;
                                                }
                                            }
                                        });
                                    }
                                }
                                final int i24 = 1;
                                imageView3.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Wallet.b5
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view) {
                                        switch (i24) {
                                            case 0:
                                                f3VarArr2[0].dismiss();
                                                break;
                                            default:
                                                f3VarArr2[0].dismiss();
                                                break;
                                        }
                                    }
                                });
                                ImageView imageView9 = imageView2;
                                imageView9.setOnClickListener(new di.z9(f3VarArr2, i6Var, imageView9, wallettransactionArr, context, i7));
                                return linearLayout3;
                            }
                        } else if (TextUtils.isEmpty(wallettransaction.comment)) {
                            f10 = 11.0f;
                        } else {
                            xh.l lVar2 = new xh.l(context);
                            lVar2.setTextSize(1, 15.0f);
                            org.telegram.ui.ActionBar.u6.U(lVar2, i13, i6Var2);
                            f10 = 11.0f;
                            lVar2.setText(org.telegram.messenger.j6.m(wallettransaction.comment, lVar2.getPaint().getFontMetricsInt(), false, null, 0));
                            lVar2.setTextIsSelectable(true);
                            org.telegram.ui.ActionBar.u4 u4Var2 = new org.telegram.ui.ActionBar.u4(0, false, false, null);
                            u4Var2.x = false;
                            u4Var2.w = Integer.valueOf(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.am, i6Var2));
                            lVar2.setBackground(u4Var2);
                            lVar2.setPadding(org.telegram.messenger.g0.L(19.0f), org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(15.0f), org.telegram.messenger.g0.L(8.0f));
                            linearLayout2.addView(lVar2, c8.na.t(-2, -2, 1, 32, 16, 32, 0));
                        }
                        r5Var = r5Var2;
                        textView = textView2;
                        imageView = imageView4;
                        imageView2 = imageView5;
                    } else {
                        r5Var = r5Var2;
                        textView = textView2;
                        imageView = imageView4;
                        imageView2 = imageView5;
                        f10 = 11.0f;
                    }
                    i10 = 1;
                    SpannableString[] spannableStringArr22 = new SpannableString[i10];
                    TextView[] textViewArr22 = new TextView[i10];
                    dy0 dy0Var22 = new dy0(context, i6Var2);
                    g10.addView(dy0Var22, c8.na.k(14.0f, 0.0f, 14.0f, 0.0f, -1, -2));
                    String[] strArr22 = {wallettransaction.comment};
                    final boolean[] zArr22 = {(wallettransaction.comment_encrypted || (z11 && bArr == null)) ? false : true};
                    int i182 = 5;
                    if (r10Var == null) {
                    }
                    hi.e g112 = m10.g(24, context, i6Var2, true);
                    g112.setText(gd.N0(2131747637, null));
                    linearLayout.addView(g112, c8.na.k(14.0f, 14.0f, 14.0f, 14.0f, -1, 48));
                    TL_wallet.walletTransaction[] wallettransactionArr2 = {wallettransaction2};
                    fi.r rVar22 = new fi.r(linearLayout, r5Var, i6Var2, i7, textView, f3VarArr, dy0Var, r10Var, context, textViewArr, spannableStringArr);
                    LinearLayout linearLayout32 = linearLayout;
                    linearLayout32.setTag(new r(6, rVar22, wallettransactionArr2));
                    rVar22.a(wallettransaction2);
                    if (z11) {
                    }
                    String[] strArr32 = strArr;
                    boolean[] zArr32 = zArr;
                    linearLayout32.addOnAttachStateChangeListener(new v5(rVar22, wallettransactionArr2, u5Var, i11, p10Var, f3VarArr, strArr32, zArr32));
                    if (r10Var == null) {
                    }
                    final int i242 = 1;
                    imageView3.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Wallet.b5
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i242) {
                                case 0:
                                    f3VarArr2[0].dismiss();
                                    break;
                                default:
                                    f3VarArr2[0].dismiss();
                                    break;
                            }
                        }
                    });
                    ImageView imageView92 = imageView2;
                    imageView92.setOnClickListener(new di.z9(f3VarArr2, i6Var, imageView92, wallettransactionArr2, context, i7));
                    return linearLayout32;
                }
                y10 = walletTransactionPeer.address;
            }
            str = y10;
            if (r10Var == null) {
            }
            i10 = 1;
            SpannableString[] spannableStringArr222 = new SpannableString[i10];
            TextView[] textViewArr222 = new TextView[i10];
            dy0 dy0Var222 = new dy0(context, i6Var2);
            g10.addView(dy0Var222, c8.na.k(14.0f, 0.0f, 14.0f, 0.0f, -1, -2));
            String[] strArr222 = {wallettransaction.comment};
            final boolean[] zArr222 = {(wallettransaction.comment_encrypted || (z11 && bArr == null)) ? false : true};
            int i1822 = 5;
            if (r10Var == null) {
            }
            hi.e g1122 = m10.g(24, context, i6Var2, true);
            g1122.setText(gd.N0(2131747637, null));
            linearLayout.addView(g1122, c8.na.k(14.0f, 14.0f, 14.0f, 14.0f, -1, 48));
            TL_wallet.walletTransaction[] wallettransactionArr22 = {wallettransaction2};
            fi.r rVar222 = new fi.r(linearLayout, r5Var, i6Var2, i7, textView, f3VarArr, dy0Var, r10Var, context, textViewArr, spannableStringArr);
            LinearLayout linearLayout322 = linearLayout;
            linearLayout322.setTag(new r(6, rVar222, wallettransactionArr22));
            rVar222.a(wallettransaction2);
            if (z11) {
            }
            String[] strArr322 = strArr;
            boolean[] zArr322 = zArr;
            linearLayout322.addOnAttachStateChangeListener(new v5(rVar222, wallettransactionArr22, u5Var, i11, p10Var, f3VarArr, strArr322, zArr322));
            if (r10Var == null) {
            }
            final int i2422 = 1;
            imageView3.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Wallet.b5
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i2422) {
                        case 0:
                            f3VarArr2[0].dismiss();
                            break;
                        default:
                            f3VarArr2[0].dismiss();
                            break;
                    }
                }
            });
            ImageView imageView922 = imageView2;
            imageView922.setOnClickListener(new di.z9(f3VarArr2, i6Var, imageView922, wallettransactionArr22, context, i7));
            return linearLayout322;
        }
        if (wallettransaction.incoming) {
        }
        str = y10;
        if (r10Var == null) {
        }
        i10 = 1;
        SpannableString[] spannableStringArr2222 = new SpannableString[i10];
        TextView[] textViewArr2222 = new TextView[i10];
        dy0 dy0Var2222 = new dy0(context, i6Var2);
        g10.addView(dy0Var2222, c8.na.k(14.0f, 0.0f, 14.0f, 0.0f, -1, -2));
        String[] strArr2222 = {wallettransaction.comment};
        final boolean[] zArr2222 = {(wallettransaction.comment_encrypted || (z11 && bArr == null)) ? false : true};
        int i18222 = 5;
        if (r10Var == null) {
        }
        hi.e g11222 = m10.g(24, context, i6Var2, true);
        g11222.setText(gd.N0(2131747637, null));
        linearLayout.addView(g11222, c8.na.k(14.0f, 14.0f, 14.0f, 14.0f, -1, 48));
        TL_wallet.walletTransaction[] wallettransactionArr222 = {wallettransaction2};
        fi.r rVar2222 = new fi.r(linearLayout, r5Var, i6Var2, i7, textView, f3VarArr, dy0Var, r10Var, context, textViewArr, spannableStringArr);
        LinearLayout linearLayout3222 = linearLayout;
        linearLayout3222.setTag(new r(6, rVar2222, wallettransactionArr222));
        rVar2222.a(wallettransaction2);
        if (z11) {
        }
        String[] strArr3222 = strArr;
        boolean[] zArr3222 = zArr;
        linearLayout3222.addOnAttachStateChangeListener(new v5(rVar2222, wallettransactionArr222, u5Var, i11, p10Var, f3VarArr, strArr3222, zArr3222));
        if (r10Var == null) {
        }
        final int i24222 = 1;
        imageView3.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Wallet.b5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i24222) {
                    case 0:
                        f3VarArr2[0].dismiss();
                        break;
                    default:
                        f3VarArr2[0].dismiss();
                        break;
                }
            }
        });
        ImageView imageView9222 = imageView2;
        imageView9222.setOnClickListener(new di.z9(f3VarArr2, i6Var, imageView9222, wallettransactionArr222, context, i7));
        return linearLayout3222;
    }

    public static String x0(String str) {
        StringBuilder sb2 = new StringBuilder((str.length() / 4) + str.length());
        for (int i7 = 0; i7 < str.length(); i7++) {
            if (i7 > 0 && i7 % 4 == 0) {
                sb2.append(' ');
            }
            sb2.append(str.charAt(i7));
        }
        return sb2.toString();
    }

    public static CharSequence y0(String str, Runnable runnable) {
        if (TextUtils.isEmpty(str)) {
            return gd.N0(2131742702, null);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int i7 = 0;
        while (true) {
            if (i7 >= str.length()) {
                spannableStringBuilder.setSpan(new org.telegram.ui.Cells.h(str, runnable, r4), 0, spannableStringBuilder.length(), 33);
                return spannableStringBuilder;
            }
            if (i7 > 0 && i7 % 4 == 0) {
                spannableStringBuilder.append(i7 % 16 != 0 ? ' ' : '\n');
                spannableStringBuilder.length();
            }
            spannableStringBuilder.append(str.charAt(i7));
            if (i7 % 4 == 3) {
                spannableStringBuilder.length();
            }
            i7++;
        }
    }

    public static SpannableStringBuilder z0(int i7, long j3, org.telegram.ui.ActionBar.i6 i6Var) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("G ");
        kq kqVar = new kq(R.drawable.wallet_gram_small, 2);
        kqVar.d = false;
        kqVar.c(org.telegram.messenger.g0.L(16.0f));
        spannableStringBuilder.setSpan(kqVar, 0, 1, 33);
        BigDecimal movePointLeft = new BigDecimal(j3).movePointLeft(9);
        spannableStringBuilder.append((CharSequence) (movePointLeft.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : movePointLeft.stripTrailingZeros()).toPlainString());
        CharSequence r10 = v0.D(i7).r(j3, true);
        if (!TextUtils.isEmpty(r10)) {
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) "  ~\u2009").append(r10);
            spannableStringBuilder.setSpan(new i00(org.telegram.ui.ActionBar.n6.z6, i6Var), length, spannableStringBuilder.length(), 33);
        }
        return spannableStringBuilder;
    }

    public final CharSequence A0(int i7, long j3) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((char) 65532);
        kq kqVar = new kq(R.drawable.mini_gram_16, 0);
        kqVar.d = false;
        spannableStringBuilder.setSpan(kqVar, length, spannableStringBuilder.length(), 33);
        spannableStringBuilder.append((CharSequence) " ");
        int length2 = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) v0.t(j3, false));
        spannableStringBuilder.setSpan(new i00(org.telegram.ui.ActionBar.n6.Fi, getResourceProvider()), length2, spannableStringBuilder.length(), 33);
        return gd.V(null, null, i7, spannableStringBuilder);
    }

    public final g51 B0() {
        if (C0()) {
            hi.q1 q1Var = this.s0;
            View currentView = q1Var == null ? null : q1Var.getCurrentView();
            if (currentView instanceof g51) {
                return (g51) currentView;
            }
        }
        return null;
    }

    public final boolean C0() {
        k5 k5Var;
        if (this.r0 || (k5Var = this.o0) == null || !k5Var.isAttachedToWindow()) {
            return false;
        }
        ViewParent parent = this.o0.getParent();
        bi.i6 i6Var = this.a;
        return parent == i6Var.f3.m(i6Var.g3.E.size() - 1);
    }

    public final boolean D0() {
        View m10;
        bi.i6 i6Var = this.a;
        return i6Var != null && (m10 = i6Var.f3.m(this.h)) != null && this.B0 < 0.5f && m10.getBottom() > this.a.getPaddingTop();
    }

    public final boolean E0() {
        k5 k5Var = this.o0;
        return k5Var != null && this.a != null && (k5Var.getParent() instanceof View) && ((View) this.o0.getParent()).getTop() <= this.a.getPaddingTop();
    }

    public final void H0() {
        m0 m0Var;
        g51 g51Var = this.u0[1];
        if (this.f0 != 1 || g51Var == null || !g51Var.H || (m0Var = this.H0) == null || m0Var.i || m0Var.g || m0Var.m != null || g51Var.f3.N0() < g51Var.g3.E.size() - 3) {
            return;
        }
        this.H0.f();
    }

    public final void I0() {
        u0 u0Var;
        g51 g51Var = this.u0[0];
        if (g51Var == null || !g51Var.H || (u0Var = this.G0) == null || u0Var.k || u0Var.h || g51Var.f3.N0() < g51Var.g3.E.size() - 3) {
            return;
        }
        this.G0.h();
    }

    public final CharSequence J0(int i7) {
        CharSequence[] charSequenceArr = this.S0;
        if (charSequenceArr[i7] == null) {
            charSequenceArr[i7] = new SpannableString("l");
            o80 o80Var = new o80(org.telegram.messenger.g0.L(i7 == 0 ? 100.0f : 50.0f), i7 == 0 ? this.w0 : this.x0);
            o80Var.a(org.telegram.ui.ActionBar.n6.r1(0.45f, -1), org.telegram.ui.ActionBar.n6.r1(0.2f, -1));
            CharSequence charSequence = charSequenceArr[i7];
            ((SpannableString) charSequence).setSpan(o80Var, 0, charSequence.length(), 33);
        }
        return charSequenceArr[i7];
    }

    public final void L0(TL_wallet.nftItem nftitem) {
        TL_stars.StarGift starGift = nftitem.gift;
        String str = null;
        if (starGift instanceof TL_stars.TL_starGiftUnique) {
            TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) starGift;
            di.f6 f6Var = new di.f6(getParentActivity(), this.currentAccount, 0L, getResourceProvider(), null);
            f6Var.b3 = nftitem;
            if (this.k0 != null) {
                f6Var.c3 = new w5(this, tL_starGiftUnique, nftitem);
                f6Var.d3 = new x5(this, nftitem);
            }
            f6Var.u2(tL_starGiftUnique.slug, tL_starGiftUnique, null);
            showDialog(f6Var);
            return;
        }
        Activity parentActivity = getParentActivity();
        org.telegram.ui.ActionBar.i6 resourceProvider = getResourceProvider();
        if (parentActivity != null) {
            int i7 = org.telegram.ui.ActionBar.n6.a7;
            int w02 = org.telegram.ui.ActionBar.n6.w0(i7, resourceProvider);
            int i10 = org.telegram.ui.ActionBar.n6.G6;
            org.telegram.ui.ActionBar.n6.w0(i10, resourceProvider);
            l5 l5Var = new l5(1, parentActivity, resourceProvider, false);
            l5Var.b0 = i7;
            l5Var.v0(w02);
            l5Var.P(w02);
            ScrollView scrollView = new ScrollView(parentActivity);
            scrollView.setFillViewport(true);
            scrollView.setVerticalScrollBarEnabled(false);
            LinearLayout linearLayout = new LinearLayout(parentActivity);
            linearLayout.setOrientation(1);
            linearLayout.setGravity(1);
            float f10 = 12.0f;
            linearLayout.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(28.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f));
            scrollView.addView(linearLayout, new FrameLayout.LayoutParams(-1, -2));
            org.telegram.ui.Components.p9 p9Var = new org.telegram.ui.Components.p9(parentActivity);
            p9Var.setRoundRadius(org.telegram.messenger.g0.L(12.0f));
            p9Var.setContentDescription(nftitem.name);
            Drawable mutate = parentActivity.getResources().getDrawable(R.drawable.wallet_nft_placeholder).mutate();
            int i11 = org.telegram.ui.ActionBar.n6.z6;
            org.telegram.ui.ActionBar.u6.x(p9Var, mutate, i11, resourceProvider, PorterDuff.Mode.SRC_IN);
            fc c10 = c.c(nftitem, false);
            if (c10 != null) {
                p9Var.j(c10, "120_120", mutate, nftitem);
            } else {
                p9Var.setImageDrawable(mutate);
            }
            linearLayout.addView(p9Var, c8.na.r(120, 120, 1));
            TextView textView = new TextView(parentActivity);
            textView.setText(TextUtils.isEmpty(nftitem.name) ? gd.N0(2131742925, null) : nftitem.name);
            org.telegram.messenger.f3.l(textView, i10, resourceProvider, 1, 17.0f);
            int i12 = 17;
            textView.setGravity(17);
            linearLayout.addView(textView, c8.na.k(12.0f, 16.0f, 12.0f, 0.0f, -1, -2));
            TextView textView2 = new TextView(parentActivity);
            textView2.setText(nftitem.description);
            org.telegram.ui.ActionBar.u6.U(textView2, i11, resourceProvider);
            textView2.setTextSize(1, 14.0f);
            textView2.setGravity(17);
            textView2.setVisibility(TextUtils.isEmpty(nftitem.description) ? 8 : 0);
            linearLayout.addView(textView2, c8.na.k(12.0f, 4.0f, 12.0f, 0.0f, -1, -2));
            LinearLayout linearLayout2 = new LinearLayout(parentActivity);
            linearLayout2.setOrientation(0);
            linearLayout.addView(linearLayout2, c8.na.k(0.0f, 20.0f, 0.0f, 16.0f, -1, 54));
            int i13 = 0;
            while (i13 < 2) {
                LinearLayout linearLayout3 = new LinearLayout(parentActivity);
                linearLayout3.setOrientation(1);
                linearLayout3.setGravity(i12);
                int L = org.telegram.messenger.g0.L(16.0f);
                int i14 = org.telegram.ui.ActionBar.n6.d6;
                int w03 = org.telegram.ui.ActionBar.n6.w0(i14, resourceProvider);
                int i15 = org.telegram.ui.ActionBar.n6.i6;
                int w04 = org.telegram.ui.ActionBar.n6.w0(i15, resourceProvider);
                org.telegram.ui.Cells.y k02 = org.telegram.ui.ActionBar.n6.k0(L, L, L, L, w03, w04, w04);
                org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i14);
                org.telegram.ui.ActionBar.q6 M2 = org.telegram.ui.ActionBar.u6.M(i15);
                linearLayout3.setBackground(k02);
                org.telegram.ui.ActionBar.u6.j(linearLayout3, k02, M, M2, resourceProvider);
                linearLayout3.setClickable(true);
                linearLayout3.setFocusable(true);
                String N0 = gd.N0(i13 == 0 ? 2131742710 : 2131742752, str);
                linearLayout3.setContentDescription(N0);
                ImageView imageView = new ImageView(parentActivity);
                imageView.setImageResource(i13 == 0 ? R.drawable.wallet_transfer : R.drawable.wallet_sell);
                imageView.setImportantForAccessibility(2);
                int i16 = org.telegram.ui.ActionBar.n6.G6;
                org.telegram.ui.ActionBar.u6.s(imageView, i16, resourceProvider, PorterDuff.Mode.SRC_IN);
                linearLayout3.addView(imageView, c8.na.o(24, 24));
                TextView textView3 = new TextView(parentActivity);
                textView3.setText(N0);
                float f11 = f10;
                org.telegram.messenger.f3.l(textView3, i16, resourceProvider, 1, f11);
                textView3.setGravity(17);
                linearLayout3.addView(textView3, c8.na.k(0.0f, 2.0f, 0.0f, 0.0f, -2, -2));
                linearLayout2.addView(linearLayout3, c8.na.m(1.0f, 0, -1, i13 == 0 ? 0 : 4, i13 == 0 ? 4 : 0, 0));
                i13++;
                f10 = f11;
                i12 = 17;
                str = null;
            }
            ArrayList<TL_wallet.nftAttribute> arrayList = nftitem.attributes;
            if (arrayList != null && !arrayList.isEmpty()) {
                dy0 dy0Var = new dy0(parentActivity, resourceProvider);
                int L2 = org.telegram.messenger.g0.L(10.0f);
                int i17 = org.telegram.ui.ActionBar.n6.d6;
                ShapeDrawable d02 = org.telegram.ui.ActionBar.n6.d0(L2, org.telegram.ui.ActionBar.n6.w0(i17, resourceProvider));
                org.telegram.ui.ActionBar.q6 M3 = org.telegram.ui.ActionBar.u6.M(i17);
                dy0Var.setBackground(d02);
                org.telegram.ui.ActionBar.u6.j(dy0Var, d02, M3, null, resourceProvider);
                ArrayList<TL_wallet.nftAttribute> arrayList2 = nftitem.attributes;
                int size = arrayList2.size();
                int i18 = 0;
                while (i18 < size) {
                    TL_wallet.nftAttribute nftattribute = arrayList2.get(i18);
                    i18++;
                    TL_wallet.nftAttribute nftattribute2 = nftattribute;
                    dy0Var.e(nftattribute2.trait_type, nftattribute2.value, null, null);
                }
                linearLayout.addView(dy0Var, c8.na.k(0.0f, 0.0f, 0.0f, 14.0f, -1, -2));
            }
            hi.e eVar = new hi.e(parentActivity, resourceProvider, true);
            eVar.setRoundRadius(24);
            eVar.setText(gd.N0(2131742811, null));
            linearLayout.addView(eVar, c8.na.o(-1, 48));
            l5Var.O = scrollView;
            l5Var.U0 = false;
            linearLayout2.getChildAt(0).setOnClickListener(new ig0(20, l5Var, nftitem));
            linearLayout2.getChildAt(1).setOnClickListener(new p3(parentActivity, 1));
            eVar.setOnClickListener(new p3(l5Var, 2));
            l5Var.show();
            l5Var.P(w02);
            org.telegram.messenger.g0.s3(l5Var, w02, false, null);
        }
    }

    public final void P0() {
        if (getParentActivity() == null || this.Q0 != null || this.P0 == null) {
            return;
        }
        if (getParentActivity().checkSelfPermission("android.permission.CAMERA") != 0) {
            getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 44);
        } else {
            this.Q0 = ci.b0.k(this, this.P0, new ci.y(12), new w4(this, 3), new r4(this, 7));
        }
    }

    public final void Q0(boolean z10) {
        this.g0 = z10;
        if (!z10) {
            this.f0 = 0;
        }
        if (this.s0 == null || this.i0 == null) {
            return;
        }
        if (!z10) {
            this.j0.b(false);
            this.s0.setPosition(0);
        }
        g1();
        ValueAnimator valueAnimator = this.n0;
        if (valueAnimator != null) {
            this.n0 = null;
            valueAnimator.cancel();
        }
        float f10 = z10 ? 1.0f : 0.0f;
        boolean z11 = this.o0.isAttachedToWindow() && this.o0.isLaidOut();
        if (z10) {
            this.s0.l(false);
        }
        if (!z11 || this.m0 == f10) {
            R0(f10);
            this.s0.l(false);
        } else {
            this.i0.setVisibility(0);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.m0, f10);
            this.n0 = ofFloat;
            ofFloat.setDuration(250L);
            this.n0.setInterpolator(kr.h);
            this.n0.addUpdateListener(new v4(this, 0));
            this.n0.addListener(new org.telegram.ui.ActionBar.s0(this, f10, 8));
            this.n0.start();
        }
        if (this.a == null || this.r0 == S0()) {
            return;
        }
        c1(false);
    }

    public final void R0(float f10) {
        this.m0 = f10;
        this.i0.setAlpha(f10);
        f1();
        int round = Math.round(org.telegram.messenger.g0.L(46.0f) * f10);
        if (this.p0 != round) {
            this.p0 = round;
            e1(0);
            e1(1);
        }
    }

    public final boolean S0() {
        u0 u0Var;
        if (this.g0 || (u0Var = this.G0) == null || !u0Var.c.isEmpty()) {
            return false;
        }
        u0 u0Var2 = this.G0;
        return !u0Var2.k && u0Var2.h;
    }

    public final void T0() {
        this.I0 = false;
        k9 k9Var = this.j0;
        if (k9Var != null) {
            k9Var.b(false);
        }
        this.f0 = 0;
        hi.q1 q1Var = this.s0;
        if (q1Var != null) {
            q1Var.setPosition(0);
        }
    }

    public final void U0() {
        this.s = false;
        bi.i6 i6Var = this.a;
        if (i6Var != null) {
            i6Var.E2.b.remove(this.x);
            this.a.removeCallbacks(this.w);
        }
        c6 c6Var = this.e;
        if (c6Var != null) {
            c6Var.setAdditionalTilt(0.0f);
        }
    }

    public final void W0() {
        v0 D = v0.D(this.currentAccount);
        h1();
        this.F0.setEnabled(D.N() && D.f());
        if (!D.N()) {
            this.w0.setText(J0(0));
            this.x0.setText(J0(1));
            return;
        }
        long A = D.A();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (this.U0 == null) {
            this.U0 = new SpannableString("G");
            c6 c6Var = this.e;
            c6Var.getClass();
            x6 x6Var = new x6(c6Var);
            this.y0 = x6Var;
            SpannableString spannableString = this.U0;
            spannableString.setSpan(x6Var, 0, spannableString.length(), 33);
        }
        spannableStringBuilder.append((CharSequence) this.U0);
        spannableStringBuilder.append((CharSequence) " ");
        spannableStringBuilder.append((CharSequence) y6.e(A));
        spannableStringBuilder.append((CharSequence) " ");
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) gd.N0(2131749340, null));
        if (this.z0 == null) {
            f6 f6Var = new f6();
            f6Var.a = -9577217;
            this.z0 = f6Var;
        }
        spannableStringBuilder.setSpan(this.z0, length, spannableStringBuilder.length(), 33);
        this.w0.setText(spannableStringBuilder);
        CharSequence r10 = v0.D(this.currentAccount).r(A, false);
        if (TextUtils.isEmpty(r10)) {
            this.x0.setText(J0(1));
        } else {
            this.x0.setText(r10);
        }
        Z0(this.A0);
        m0 m0Var = this.H0;
        if (m0Var != null && !m0Var.h && !m0Var.i && m0Var.m == null) {
            m0Var.f();
        }
        String y10 = D.y();
        if (TextUtils.isEmpty(y10)) {
            return;
        }
        this.e.setCardNumber(x0(y10.toUpperCase()));
    }

    public final void X0() {
        float[] fArr;
        float[] fArr2;
        Rect rect = this.H;
        if (rect.isEmpty() || !this.E.isAttachedToWindow()) {
            return;
        }
        c6 c6Var = this.e;
        w61 w61Var = this.F;
        Matrix matrix = this.I;
        if (c6Var.g(w61Var, matrix)) {
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
            this.e.i(this.A0, this.y.getWidth() / 0.7826087f);
            float f12 = iArr2[0] - iArr[0];
            float z10 = org.telegram.ui.Cells.c0.z(height, 0.7826087f, 0.5f, iArr2[1] - iArr[1]);
            for (int i12 = 0; i12 < 4; i12++) {
                int i13 = i12 * 2;
                float T1 = org.telegram.messenger.g0.T1(fArr2[i13], (fArr[i13] * 0.7826087f) + f12, this.A0);
                float[] fArr3 = this.N;
                fArr3[i13] = T1;
                int i14 = i13 + 1;
                fArr3[i14] = org.telegram.messenger.g0.T1(fArr2[i14], (fArr[i14] * 0.7826087f) + z10, this.A0);
            }
            Matrix matrix2 = this.K;
            boolean polyToPoly = matrix2.setPolyToPoly(this.L, 0, this.N, 0, 4);
            Matrix matrix3 = this.J;
            if (polyToPoly && !matrix3.equals(matrix2)) {
                matrix3.set(matrix2);
                this.F.invalidate();
            }
            c6 c6Var2 = this.e;
            Matrix matrix4 = c6Var2.c;
            Matrix matrix5 = c6Var2.e;
            Matrix matrix6 = c6Var2.d;
            if (matrix.invert(matrix6)) {
                matrix5.setConcat(matrix6, matrix3);
                if (!c6Var2.n || !matrix4.equals(matrix5)) {
                    matrix4.set(matrix5);
                    c6Var2.n = true;
                    c6Var2.O.invalidate();
                }
            }
            float T12 = org.telegram.messenger.g0.T1(1.0f, 1.0952381f, this.A0);
            this.x0.setPivotX(0.0f);
            this.x0.setPivotY(0.0f);
            this.x0.setScaleX(T12);
            this.x0.setScaleY(T12);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v2 */
    public final void Y0() {
        w61 w61Var;
        ?? r16;
        LinearLayout linearLayout;
        float min;
        float f10;
        if (this.a == null || this.e == null || this.v0 == null || this.E == null || (w61Var = this.F) == null || this.simpleActionBar == null) {
            return;
        }
        w61Var.bringToFront();
        View m10 = this.a.f3.m(this.h);
        float i7 = m10 == null ? this.a.f3.L0() > this.h ? 1.0f : 0.0f : Utilities.i((this.a.getPaddingTop() - m10.getTop()) / m10.getHeight(), 1.0f, 0.0f);
        this.B0 = i7;
        float f11 = this.M0;
        boolean z10 = f11 > 0.0f || this.L0 > 0.0f;
        if (z10) {
            i7 = f11 > 0.0f ? 0.0f : (1.0f - this.L0) * i7;
        }
        this.A0 = i7;
        b1();
        float max = m10 != null ? Math.max(0.0f, (m10.getHeight() / 2.0f) + org.telegram.messenger.g0.L(24.0f)) * this.A0 : 0.0f;
        float T1 = org.telegram.messenger.g0.T1(1.0f, 0.8f, this.A0);
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
            boolean z11 = this.M0 == 0.0f ? r16 : false;
            float f12 = this.L0;
            if (z11) {
                min = 0.3f * f12;
                f10 = 0.6f;
            } else {
                min = Math.min(1.0f, 1.8f * f12) * 0.06f;
                f10 = 0.84f;
            }
            float f13 = min + f10;
            this.simpleActionBar.getLocationInWindow(iArr2);
            this.n.getLocationInWindow(iArr);
            float L = (org.telegram.messenger.g0.L(4.0f) + (this.simpleActionBar.getHeight() + (iArr2[r16] - iArr[r16]))) - ((1.0f - f12) * (z11 ? 0.0f : this.e.getHeight() * 0.35f));
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
                    org.telegram.messenger.g0.r(this.O0);
                    ValueAnimator valueAnimator = this.N0;
                    if (valueAnimator != null) {
                        this.N0 = null;
                        valueAnimator.cancel();
                    }
                    this.L0 = 0.0f;
                    this.M0 = 0.0f;
                    Y0();
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
        if (this.G != z12 && (linearLayout = this.v0) != null) {
            Rect rect = this.H;
            if (z12) {
                if (linearLayout.getWidth() != 0 && this.v0.getHeight() != 0) {
                    rect.set(this.v0.getLeft(), this.v0.getTop(), this.v0.getRight(), this.v0.getBottom());
                }
            }
            this.e.setOnFrontContentPresented(null);
            org.telegram.messenger.g0.E2(this.v0);
            this.G = z12;
            if (z12) {
                this.F.addView(this.v0, new FrameLayout.LayoutParams(rect.width(), rect.height(), 51));
                this.v0.layout(0, 0, rect.width(), rect.height());
                X0();
            } else {
                c6 c6Var = this.e;
                c6Var.i(0.0f, 0.0f);
                LinearLayout linearLayout2 = c6Var.N;
                org.telegram.messenger.g0.E2(linearLayout2);
                linearLayout2.setScaleX(1.0f);
                linearLayout2.setScaleY(1.0f);
                linearLayout2.setRotationX(0.0f);
                linearLayout2.setRotationY(0.0f);
                linearLayout2.setTranslationX(0.0f);
                linearLayout2.setTranslationY(0.0f);
                w6 w6Var = c6Var.P;
                w6Var.setScaleX(1.0f);
                w6Var.setScaleY(1.0f);
                c6Var.F.addView(linearLayout2, c6Var.Q);
                this.v0.layout(rect.left, rect.top, rect.right, rect.bottom);
                this.e.getClass();
                X0();
            }
            this.F.invalidate();
        }
        Z0(i7);
        if (this.G) {
            X0();
        }
        float f14 = 1.0f - i7;
        this.simpleActionBar.setTitlesAlpha(f14);
        if (this.simpleActionBar.getTitleTextView() != null) {
            this.simpleActionBar.getTitleTextView().setTranslationY((1.0f - f14) * (-org.telegram.messenger.g0.L(8.0f)));
        }
    }

    @Override // org.telegram.ui.Components.d51
    public final void Z(ArrayList arrayList, b51 b51Var) {
        v0 D = v0.D(this.currentAccount);
        h1();
        arrayList.add(n41.m(this.S));
        this.h = arrayList.size();
        z5 z5Var = this.f;
        n41 n41Var = new n41(-4);
        n41Var.c = z5Var;
        n41Var.A = -1;
        n41Var.e = true;
        arrayList.add(n41Var);
        arrayList.add(n41.m(this.C0));
        boolean S0 = S0();
        this.r0 = S0;
        if (S0) {
            String N0 = gd.N0(2131742748, null);
            String N02 = gd.N0(2131742747, null);
            int i7 = g6.b;
            n41 K = n41.K(g6.class);
            K.k = R.drawable.wallet_learn_instant;
            K.m = N0;
            K.n = N02;
            arrayList.add(K);
            String N03 = gd.N0(2131742816, null);
            String N04 = gd.N0(2131742815, null);
            n41 K2 = n41.K(g6.class);
            K2.k = R.drawable.wallet_learn_fees;
            K2.m = N03;
            K2.n = N04;
            arrayList.add(K2);
            String N05 = gd.N0(2131742931, null);
            String N06 = gd.N0(2131742930, null);
            n41 K3 = n41.K(g6.class);
            K3.k = R.drawable.wallet_learn_verified;
            K3.m = N05;
            K3.n = N06;
            arrayList.add(K3);
            arrayList.add(n41.m(this.b0));
        } else if (this.o0 != null) {
            if (this.V0 && !this.W0 && D.A() > 500000000) {
                arrayList.add(n41.k(this.d0));
            }
            k5 k5Var = this.o0;
            n41 n41Var2 = new n41(-3);
            n41Var2.c = k5Var;
            n41Var2.A = 0;
            n41Var2.z = 1;
            arrayList.add(n41Var2);
        }
        j80 j80Var = this.a0;
        if (j80Var != null) {
            this.c0 = false;
            j80Var.animate().cancel();
            this.a0.setAlpha(0.0f);
            this.a0.setVisibility(4);
        }
    }

    public final void Z0(float f10) {
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.n6.G6);
        this.w0.setTextColor(org.telegram.messenger.g0.d2(f10, -1, themedColor));
        org.telegram.ui.Components.n6 n6Var = this.x0;
        float[] fArr = this.e.b0;
        int i7 = -7868417;
        if (fArr != null) {
            i7 = i0.a.f(fArr[8], g8.p(-7868417, 0, fArr), g8.p(-7868417, 3, fArr));
        }
        n6Var.setTextColor(org.telegram.messenger.g0.d2(f10, i7, i0.a.o(themedColor, Math.round(142.8f))));
        x6 x6Var = this.y0;
        if (x6Var != null) {
            x6Var.y = org.telegram.messenger.g0.d2(f10, -1, getThemedColor(org.telegram.ui.ActionBar.n6.Fi));
        }
        f6 f6Var = this.z0;
        if (f6Var != null) {
            float[] fArr2 = this.e.b0;
            int i10 = -9577217;
            if (fArr2 != null) {
                i10 = i0.a.f(fArr2[8], g8.p(-9577217, 0, fArr2), g8.p(-9577217, 3, fArr2));
            }
            f6Var.a = i0.a.o(i10, Math.round((1.0f - f10) * 255.0f));
        }
        this.w0.invalidate();
    }

    @Override // org.telegram.ui.Components.d51
    public final CharSequence a0() {
        return gd.N0(2131742732, null);
    }

    public final void a1(float[] fArr) {
        if (this.E0 == null || this.F0 == null) {
            return;
        }
        float f10 = g8.j(getThemedColor(org.telegram.ui.ActionBar.n6.a7))[0];
        boolean z10 = f10 < 0.6f;
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.n6.Fi);
        if (fArr != null && fArr.length >= 18) {
            int[] iArr = new int[2];
            for (int i7 = 0; i7 < 2; i7++) {
                int i10 = i7 * 4;
                float f11 = fArr[i10 + 10];
                iArr[i7] = f11 < 0.0f ? themedColor : g8.n(themedColor, (int) f11, (int) fArr[i10 + 11]);
            }
            themedColor = i0.a.f(fArr[8], iArr[0], iArr[1]);
        }
        float f12 = z10 ? f10 + 0.25f : 0.0f;
        float f13 = z10 ? 1.0f : f10 - 0.2f;
        float[] j3 = g8.j(themedColor);
        float f14 = j3[0];
        if (f14 < f12 || f14 > f13) {
            themedColor = (themedColor & (-16777216)) | (g8.l(Math.max(f12, Math.min(f13, f14)), j3[1], j3[2]) & 16777215);
        }
        if (themedColor == this.R0) {
            return;
        }
        this.R0 = themedColor;
        int themedColor2 = i0.a.h(themedColor) <= 0.550000011920929d ? getThemedColor(org.telegram.ui.ActionBar.n6.Ji) : -16777216;
        hi.e[] eVarArr = {this.E0, this.F0};
        for (int i11 = 0; i11 < 2; i11++) {
            hi.e eVar = eVarArr[i11];
            eVar.setColor(themedColor);
            eVar.setTextColor(themedColor2);
        }
    }

    @Override // org.telegram.ui.Components.d51
    public final void b0(n41 n41Var, View view) {
        m0 m0Var;
        Object obj = n41Var.H;
        if (obj instanceof TL_wallet.nftItem) {
            L0((TL_wallet.nftItem) obj);
            return;
        }
        if (n41Var.d == -10001 && (m0Var = this.H0) != null) {
            m0Var.f();
        } else if (obj instanceof TL_wallet.walletTransaction) {
            K0(getParentActivity(), this.currentAccount, (TL_wallet.walletTransaction) n41Var.H, null, null, null, null, getResourceProvider());
        }
    }

    public final void b1() {
        bi.i6 i6Var = this.a;
        if (i6Var == null || this.e == null) {
            return;
        }
        float b10 = i6Var.E2.b(1);
        this.e.setAdditionalTilt(Math.max(0.0f, (this.A0 * 10.0f) + ((((float) Math.sqrt(Utilities.l(this.A0))) * 90.0f) - 10.0f)) + Math.min(10.0f, this.a.E2.b(3) * 40.0f) + (-Math.min(10.0f, b10 * 40.0f)));
        this.e.setUseGyroscope(1.0f - ((float) Math.pow(this.A0, 0.33000001311302185d)));
    }

    @Override // org.telegram.ui.Components.d51
    public final boolean c0(n41 n41Var, View view) {
        s8 s8Var;
        if (!(view instanceof f8) || (s8Var = this.k0) == null) {
            return false;
        }
        s8Var.S((f8) view);
        return true;
    }

    public final void c1(boolean z10) {
        boolean S0 = S0();
        bi.i6 i6Var = this.a;
        g51[] g51VarArr = this.u0;
        if (i6Var != null && this.r0 != S0) {
            this.r0 = S0;
            i6Var.C0();
            for (g51 g51Var : g51VarArr) {
                if (g51Var != null) {
                    g51Var.C0();
                }
            }
            this.a.g3.O(false);
            this.a.f3.h1(0, 0);
            this.a.post(new r4(this, 6));
        }
        if (S0) {
            return;
        }
        for (g51 g51Var2 : g51VarArr) {
            if (g51Var2 != null) {
                d1(g51Var2, z10);
            }
        }
        k5 k5Var = this.o0;
        if (k5Var != null) {
            k5Var.post(new r4(this, 2));
            this.o0.post(new r4(this, 3));
        }
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final boolean canBeginSlide() {
        s8 s8Var = this.k0;
        return (s8Var == null || !s8Var.q0) && super.canBeginSlide();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.telegram.ui.Components.d51, org.telegram.ui.ActionBar.g2
    public final View createView(Context context) {
        ValueAnimator valueAnimator = this.n0;
        if (valueAnimator != null) {
            this.n0 = null;
            valueAnimator.cancel();
        }
        U0();
        k6 k6Var = this.t0;
        if (k6Var != null) {
            k6Var.b(null);
        }
        this.f = null;
        this.T = null;
        this.S = null;
        this.o0 = null;
        this.s0 = null;
        g51[] g51VarArr = this.u0;
        final int i7 = 0;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        g51VarArr[0] = null;
        final int i10 = 1;
        g51VarArr[1] = null;
        m0 m0Var = this.H0;
        boolean z10 = (m0Var == null || m0Var.a.isEmpty()) ? false : true;
        this.g0 = z10;
        if (!z10) {
            this.f0 = 0;
        } else if (this.I0) {
            this.f0 = 1;
        }
        s8 s8Var = this.k0;
        if (s8Var != null) {
            s8Var.p();
        }
        this.k0 = null;
        View createView = super.createView(context);
        oa0 oa0Var = new oa0(this, context);
        oa0Var.addView(createView, c8.na.c(-1.0f, -1));
        this.fragmentView = oa0Var;
        org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.a7, oa0Var, getResourceProvider());
        this.simpleActionBar.setClipChildren(false);
        this.simpleActionBar.setClipToPadding(false);
        org.telegram.ui.ActionBar.f5 t6 = this.simpleActionBar.t();
        final int i11 = 2;
        org.telegram.ui.ActionBar.g5 b10 = t6.b(2, R.drawable.scan_qr);
        this.P0 = b10;
        b10.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Wallet.o4
            public final /* synthetic */ o6 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i7) {
                    case 0:
                        this.b.P0();
                        break;
                    case 1:
                        o6 o6Var = this.b;
                        o6Var.getClass();
                        o6Var.presentFragment(new za1(6, null));
                        break;
                    case 2:
                        o6.d0(this.b);
                        break;
                    case 3:
                        o6.f0(this.b);
                        break;
                    default:
                        o6.h0(this.b);
                        break;
                }
            }
        });
        org.telegram.ui.ActionBar.g5 b11 = t6.b(1, R.drawable.ic_ab_other);
        b11.setOnClickListener(new s1(this, context, b11, i10));
        k5 k5Var = new k5(this, context, i10);
        this.S = k5Var;
        k5Var.setClipToPadding(false);
        this.S.setClipChildren(false);
        this.S.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(4.0f));
        y5 y5Var = new y5(this, context);
        this.T = y5Var;
        y5Var.setDefaultRadiusDp(22);
        this.T.setOnAnimatedHeightChangedListener(new r4(this, 8));
        TextView textView = new TextView(context);
        this.V = textView;
        textView.setText(gd.N0(2131742691, null));
        this.U = v0(this.V, new r4(this, 10));
        TextView textView2 = new TextView(context);
        this.X = textView2;
        this.W = v0(textView2, new r4(this, 11));
        TextView textView3 = new TextView(context);
        this.Z = textView3;
        this.Y = v0(textView3, new r4(this, 12));
        this.S.addView(this.T, c8.na.c(-2.0f, -1));
        j80 j80Var = new j80(context, null);
        this.a0 = j80Var;
        this.c0 = false;
        j80Var.setAlpha(0.0f);
        j80 j80Var2 = this.a0;
        int i12 = org.telegram.ui.ActionBar.n6.z6;
        org.telegram.ui.ActionBar.u6.U(j80Var2, i12, this.resourceProvider);
        this.a0.setTextSize(1, 13.0f);
        this.a0.setGravity(17);
        this.a0.setText(V0(gd.N0(2131742735, null), org.telegram.ui.ActionBar.n6.Xc, this.resourceProvider, new d5(context, i10)));
        final int i13 = 4;
        this.a0.setVisibility(4);
        FrameLayout frameLayout = (FrameLayout) createView;
        if (frameLayout != null) {
            frameLayout.addView(this.a0, c8.na.d(-1, -2.0f, 81, 12.0f, 0.0f, 12.0f, 24.0f));
        }
        z5 z5Var = new z5(this, context, objArr4 == true ? 1 : 0);
        this.b0 = z5Var;
        z5Var.setImportantForAccessibility(2);
        this.d0 = new FrameLayout(context);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.e0 = frameLayout2;
        int i14 = org.telegram.ui.ActionBar.n6.d6;
        int themedColor = getThemedColor(i14);
        int themedColor2 = getThemedColor(i14);
        int i15 = org.telegram.ui.ActionBar.n6.i6;
        org.telegram.ui.Cells.y b02 = org.telegram.ui.ActionBar.n6.b0(themedColor, org.telegram.ui.ActionBar.n6.w(themedColor2, getThemedColor(i15)), 16, 16);
        org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i14);
        org.telegram.ui.ActionBar.q6 p10 = org.telegram.ui.ActionBar.u6.p(i14, i15);
        org.telegram.ui.ActionBar.i6 resourceProvider = getResourceProvider();
        frameLayout2.setBackground(b02);
        org.telegram.ui.ActionBar.u6.j(frameLayout2, b02, M, p10, resourceProvider);
        this.d0.addView(this.e0, c8.na.d(-1, -2.0f, 55, 12.0f, 0.0f, 12.0f, 12.0f));
        ImageView imageView = new ImageView(context);
        float N = org.telegram.messenger.g0.N(10.0f);
        int i16 = 6;
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{N, N, N, N, N, N, N, N}, null, null));
        shapeDrawable.setShaderFactory(new a6());
        imageView.setBackground(shapeDrawable);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.wallet_protect);
        this.e0.addView(imageView, c8.na.d(28, 28.0f, 19, 14.0f, 11.0f, 16.0f, 11.0f));
        TextView textView4 = new TextView(context);
        org.telegram.ui.ActionBar.u6.U(textView4, org.telegram.ui.ActionBar.n6.q7, this.resourceProvider);
        i5.c.r(16.0f, 1, 2131742773, textView4, null);
        this.e0.addView(textView4, c8.na.d(-1, -2.0f, 19, 58.0f, 0.0f, 32.0f, 0.0f));
        this.e0.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Wallet.o4
            public final /* synthetic */ o6 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        this.b.P0();
                        break;
                    case 1:
                        o6 o6Var = this.b;
                        o6Var.getClass();
                        o6Var.presentFragment(new za1(6, null));
                        break;
                    case 2:
                        o6.d0(this.b);
                        break;
                    case 3:
                        o6.f0(this.b);
                        break;
                    default:
                        o6.h0(this.b);
                        break;
                }
            }
        });
        c8.sa.b(this.e0, 0.02f, 1.2f);
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.y = frameLayout3;
        frameLayout3.setClipChildren(false);
        this.y.setClipToPadding(false);
        this.simpleActionBar.addView(this.y, c8.na.d(-1, 56.0f, 3, 64.0f, 0.0f, 96.0f, 0.0f));
        View view = new View(context);
        this.E = view;
        this.y.addView(view, c8.na.e(1, 1, 19));
        this.G = false;
        this.H.setEmpty();
        this.J.reset();
        w61 w61Var = new w61(this, context);
        this.F = w61Var;
        w61Var.setClipChildren(false);
        this.F.setClipToPadding(false);
        c6 c6Var = new c6(this, context);
        this.e = c6Var;
        c6Var.setDiamondOnCard(true);
        this.e.setCardOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Wallet.o4
            public final /* synthetic */ o6 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i11) {
                    case 0:
                        this.b.P0();
                        break;
                    case 1:
                        o6 o6Var = this.b;
                        o6Var.getClass();
                        o6Var.presentFragment(new za1(6, null));
                        break;
                    case 2:
                        o6.d0(this.b);
                        break;
                    case 3:
                        o6.f0(this.b);
                        break;
                    default:
                        o6.h0(this.b);
                        break;
                }
            }
        });
        this.a.E2.b.add(this.x);
        z5 z5Var2 = new z5(this, context, i10);
        this.f = z5Var2;
        z5Var2.setImportantForAccessibility(2);
        d6 d6Var = new d6(this, context);
        this.n = d6Var;
        d6Var.setClipChildren(false);
        this.n.setClipToPadding(false);
        this.n.addView(this.e, c8.na.c(-2.0f, -1));
        oa0Var.addView(this.n, c8.na.c(-1.0f, -1));
        this.a.setClipChildren(false);
        this.a.setClipToPadding(false);
        this.v0 = this.e.getBalanceLayout();
        this.w0 = this.e.getBalanceView();
        this.x0 = this.e.getUsdBalanceView();
        this.e.setCardHolder(n10.q(getUserConfig().f()).toUpperCase());
        this.D0 = 0.0f;
        int i17 = 24;
        b61 b61Var = new b61(i17, context, this);
        this.C0 = b61Var;
        b61Var.setOrientation(0);
        this.C0.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(12.0f));
        hi.e eVar = new hi.e(context, this.resourceProvider, true);
        eVar.setRoundRadius(24);
        this.E0 = eVar;
        eVar.setText(gd.N0(2131742953, null));
        this.C0.addView(this.E0, c8.na.m(1.0f, 0, 48, 0, 4, 0));
        final int i18 = 3;
        this.E0.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Wallet.o4
            public final /* synthetic */ o6 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i18) {
                    case 0:
                        this.b.P0();
                        break;
                    case 1:
                        o6 o6Var = this.b;
                        o6Var.getClass();
                        o6Var.presentFragment(new za1(6, null));
                        break;
                    case 2:
                        o6.d0(this.b);
                        break;
                    case 3:
                        o6.f0(this.b);
                        break;
                    default:
                        o6.h0(this.b);
                        break;
                }
            }
        });
        hi.e eVar2 = new hi.e(context, this.resourceProvider, true);
        eVar2.setRoundRadius(24);
        this.F0 = eVar2;
        eVar2.setText(gd.N0(2131742751, null));
        this.F0.setEnabled(v0.D(this.currentAccount).f());
        this.F0.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Wallet.o4
            public final /* synthetic */ o6 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i13) {
                    case 0:
                        this.b.P0();
                        break;
                    case 1:
                        o6 o6Var = this.b;
                        o6Var.getClass();
                        o6Var.presentFragment(new za1(6, null));
                        break;
                    case 2:
                        o6.d0(this.b);
                        break;
                    case 3:
                        o6.f0(this.b);
                        break;
                    default:
                        o6.h0(this.b);
                        break;
                }
            }
        });
        this.C0.addView(this.F0, c8.na.m(1.0f, 0, 48, 4, 0, 0));
        a1(this.e.getStickerStyle());
        this.G0 = v0.D(this.currentAccount).H();
        this.a.setDescendantFocusability(131072);
        s8 s8Var2 = new s8(this, this.e, new jb.m(this, oa0Var, objArr3 == true ? 1 : 0, 21), null);
        this.k0 = s8Var2;
        oa0Var.addView(s8Var2, c8.na.c(-1.0f, -1));
        this.l0 = "";
        this.o0 = new k5(this, context, objArr2 == true ? 1 : 0);
        int i19 = 9;
        hi.q1 q1Var = new hi.q1(this, context, this.resourceProvider, i19);
        this.s0 = q1Var;
        q1Var.setAllowDisallowInterceptTouch(false);
        this.s0.setAdapter(new di.i4(i19, context, this));
        this.glassEngine.c(this.s0);
        j71 k10 = this.s0.k(-2, true);
        this.h0 = k10;
        k10.h(i12, org.telegram.ui.ActionBar.n6.G6, i12, i15, i14);
        ri.a baseSimpleGlass = getBaseSimpleGlass();
        gh.e m10 = c8.j0.m(this.resourceProvider);
        j71 j71Var = this.h0;
        fh.g c10 = baseSimpleGlass.c.c(j71Var, null, false);
        c10.p(m10);
        c10.r(org.telegram.messenger.g0.L(20.0f));
        j71Var.setBlurredBackground(c10);
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.i0 = frameLayout4;
        frameLayout4.setTranslationZ(org.telegram.messenger.g0.L(20.0f));
        this.i0.setClipChildren(false);
        this.i0.setClipToPadding(false);
        k9 k9Var = new k9(context, this.h0, this.resourceProvider, new w4(this, objArr == true ? 1 : 0), new w4(this, i10), new w4(this, 2));
        this.j0 = k9Var;
        k9Var.setClipChildren(false);
        k9 k9Var2 = this.j0;
        fh.g c11 = baseSimpleGlass.c.c(k9Var2, null, false);
        c11.p(m10);
        c11.r(org.telegram.messenger.g0.L(20.0f));
        k9Var2.y = c11;
        k9Var2.invalidate();
        this.i0.addView(this.j0, c8.na.d(-1, 40.0f, 48, 16.0f, 0.0f, 16.0f, 0.0f));
        this.s0.setPosition(this.f0);
        g1();
        this.o0.addView(this.s0);
        ViewGroup viewGroup = (ViewGroup) this.fragmentView;
        FrameLayout frameLayout5 = this.i0;
        s8 s8Var3 = this.k0;
        viewGroup.addView(frameLayout5, s8Var3 != null ? viewGroup.indexOfChild(s8Var3) : viewGroup.getChildCount(), c8.na.e(-1, 40, 48));
        Q0(this.g0);
        m0 m0Var2 = this.H0;
        if (m0Var2 != null) {
            this.k0.Y(m0Var2);
        }
        this.a.j(new org.telegram.ui.Components.na(this, i17));
        b51 b51Var = this.a.g3;
        b51Var.r = false;
        b51Var.O(false);
        k6 k6Var2 = new k6(this);
        this.t0 = k6Var2;
        k6Var2.b(this.a);
        W0();
        this.G0.h();
        this.simpleActionBar.post(new r4(this, 5));
        this.a.post(new r4(this, i16));
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.fs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        bi.i6 i6Var;
        b51 b51Var;
        if (i10 != this.currentAccount) {
            return;
        }
        if (i7 == ks.d4 && this.w0 != null) {
            W0();
            Iterator it = this.T0.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
            return;
        }
        if (i7 == ks.A3) {
            h1();
            return;
        }
        if (i7 == ks.q0) {
            if (objArr.length > 0) {
                Object obj = objArr[0];
                if (obj instanceof TL_account.Password) {
                    this.V0 = true;
                    this.W0 = ((TL_account.Password) obj).has_password;
                    bi.i6 i6Var2 = this.a;
                    if (i6Var2 == null || (b51Var = i6Var2.g3) == null) {
                        return;
                    }
                    b51Var.O(true);
                    return;
                }
            }
            getConnectionsManager().sendRequestTyped(new TL_account.getPassword(), new d3.b(1), new e(this, 7));
            return;
        }
        if (i7 != ks.e4 || objArr.length <= 0) {
            return;
        }
        Object obj2 = objArr[0];
        u0 u0Var = this.G0;
        if (obj2 != u0Var || (i6Var = this.a) == null || i6Var.g3 == null) {
            return;
        }
        if (u0Var.b.isEmpty()) {
            u0 u0Var2 = this.G0;
            if (!u0Var2.h) {
                u0Var2.h();
            }
        }
        c1(true);
    }

    public final void e1(int i7) {
        g51 g51Var = this.u0[i7];
        if (g51Var == null) {
            return;
        }
        bi.i6 i6Var = this.a;
        int paddingTop = (i6Var != null ? i6Var.getPaddingTop() : 0) + this.p0 + (i7 == 1 ? org.telegram.messenger.g0.L(4.0f) : 0);
        bi.i6 i6Var2 = this.a;
        int paddingBottom = (i6Var2 != null ? i6Var2.getPaddingBottom() : 0) + (i7 == 1 ? org.telegram.messenger.g0.L(12.0f) : 0);
        if (g51Var.getPaddingTop() == paddingTop && g51Var.getPaddingBottom() == paddingBottom) {
            return;
        }
        boolean canScrollVertically = g51Var.canScrollVertically(-1);
        if (i7 == 1) {
            g51Var.setPadding(org.telegram.messenger.g0.L(9.0f), paddingTop, org.telegram.messenger.g0.L(9.0f), paddingBottom);
        } else {
            g51Var.setPadding(0, paddingTop, 0, paddingBottom);
        }
        if (canScrollVertically) {
            return;
        }
        g51Var.f3.h1(0, 0);
    }

    public final void f1() {
        k5 k5Var;
        if (this.i0 == null) {
            return;
        }
        boolean E0 = E0();
        if (this.q0 != E0 && (k5Var = this.o0) != null) {
            this.q0 = E0;
            k5Var.invalidate();
        }
        View view = C0() ? (View) this.o0.getParent() : null;
        boolean z10 = view != null && (this.m0 > 0.0f || this.n0 != null);
        this.i0.setVisibility(z10 ? 0 : 8);
        View view2 = (View) this.a.getParent();
        org.telegram.ui.ActionBar.z4 z4Var = this.simpleActionBar;
        int height = z4Var != null ? z4Var.getHeight() : 0;
        if (z10) {
            float y10 = this.a.getY() + view2.getY();
            float y11 = view.getY() + y10 + org.telegram.messenger.g0.L(2.0f);
            this.i0.setTranslationY(y11);
            float paddingTop = y10 + this.a.getPaddingTop() + org.telegram.messenger.g0.L(2.0f);
            float L = (org.telegram.messenger.g0.L(46.0f) + paddingTop) - Math.max(0.0f, y11 - paddingTop);
            float f10 = this.m0;
            height = Math.max(height, Math.round(((1.0f - f10) * height) + (L * f10)));
        }
        w0(this.S);
        w0(this.C0);
        w0(this.d0);
        View view3 = this.K0;
        if (view3 == null || view3.getLayoutParams().height == height) {
            return;
        }
        this.K0.getLayoutParams().height = height;
        this.K0.requestLayout();
    }

    public final void g1() {
        k9 k9Var = this.j0;
        if (k9Var == null || this.s0 == null || k9Var.x == 0.0f) {
            return;
        }
        k9Var.x = 0.0f;
        k9Var.c.setVisibility(8);
        k9Var.invalidate();
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final ek0 getListViewForSimpleGlass() {
        return this.a;
    }

    public final void h1() {
        if (this.T == null) {
            return;
        }
        v0 D = v0.D(this.currentAccount);
        boolean z10 = this.T.isAttachedToWindow() && this.T.isLaidOut();
        y5 y5Var = this.T;
        FrameLayout frameLayout = this.U;
        Boolean bool = D.i;
        y5Var.j(frameLayout, (bool == null || !bool.booleanValue() || TextUtils.isEmpty(D.j)) ? false : true, z10);
        long j3 = 0;
        if (!TextUtils.isEmpty(D.y())) {
            ArrayList arrayList = D.J;
            int size = arrayList.size();
            int i7 = 0;
            long j10 = 0;
            while (i7 < size) {
                Object obj = arrayList.get(i7);
                i7++;
                r0 r0Var = (r0) obj;
                if (!r0Var.e) {
                    long j11 = r0Var.c;
                    if (j11 >= 0) {
                        j10 += j11;
                    }
                }
            }
            j3 = j10;
        }
        boolean z11 = j3 > 500000000;
        if (z11) {
            this.X.setText(A0(2131742810, j3));
        }
        this.T.j(this.W, z11, z10);
        long j12 = di.y8.y(this.currentAccount, true).p().amount;
        boolean z12 = j12 > 500000000;
        if (z12) {
            this.Z.setText(A0(2131742848, j12));
        }
        this.T.j(this.Y, z12, z10);
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final boolean onBackPressed(boolean z10) {
        ci.b0 b0Var = this.Q0;
        if (b0Var != null) {
            if (z10) {
                b0Var.e();
            }
            return false;
        }
        k9 k9Var = this.j0;
        if (k9Var == null || !k9Var.E) {
            return super.onBackPressed(z10);
        }
        if (z10) {
            k9Var.b(false);
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void onBeginSlide() {
        k6 k6Var = this.t0;
        if (k6Var != null) {
            k6Var.c();
        }
        bi.i6 i6Var = this.a;
        if (i6Var != null) {
            i6Var.C0();
        }
        g51 B0 = B0();
        if (B0 != null) {
            B0.C0();
        }
        super.onBeginSlide();
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final boolean onFragmentCreate() {
        Context context = org.telegram.messenger.t0.b;
        if (q6.k0.compareAndSet(false, true)) {
            q6.l0.postRunnable(new d5(context, 2));
        }
        getNotificationCenter().c(this, ks.d4);
        getNotificationCenter().c(this, ks.A3);
        getNotificationCenter().c(this, ks.e4);
        getNotificationCenter().c(this, ks.q0);
        v0 D = v0.D(this.currentAccount);
        m0 B = D.B();
        this.H0 = B;
        r4 r4Var = this.J0;
        ArrayList arrayList = B.d;
        if (!arrayList.contains(r4Var)) {
            arrayList.add(r4Var);
        }
        ao0 ao0Var = this.X0;
        if (ao0Var != null) {
            ao0Var.run();
        }
        int i7 = D.F;
        D.F = i7 + 1;
        HashSet hashSet = D.G;
        boolean isEmpty = hashSet.isEmpty();
        hashSet.add(Integer.valueOf(i7));
        if (isEmpty) {
            D.a0();
        }
        this.X0 = new ao0(D, i7, 7);
        getConnectionsManager().sendRequestTyped(new TL_account.getPassword(), new d3.b(1), new e(this, 7));
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void onFragmentDestroy() {
        ci.b0 b0Var = this.Q0;
        if (b0Var != null) {
            b0Var.g();
            org.telegram.messenger.g0.E2(this.Q0);
            this.Q0 = null;
        }
        org.telegram.messenger.g0.r(this.O0);
        ValueAnimator valueAnimator = this.N0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        s8 s8Var = this.k0;
        if (s8Var != null) {
            s8Var.p();
        }
        c6 c6Var = this.e;
        if (c6Var != null) {
            c6Var.setOnFrontContentPresented(null);
        }
        ValueAnimator valueAnimator2 = this.n0;
        if (valueAnimator2 != null) {
            this.n0 = null;
            valueAnimator2.cancel();
        }
        m0 m0Var = this.H0;
        if (m0Var != null) {
            m0Var.d.remove(this.J0);
        }
        U0();
        k6 k6Var = this.t0;
        if (k6Var != null) {
            k6Var.b(null);
        }
        getNotificationCenter().n(this, ks.d4);
        getNotificationCenter().n(this, ks.A3);
        getNotificationCenter().n(this, ks.e4);
        getNotificationCenter().n(this, ks.q0);
        org.telegram.messenger.g0.E2(this.F);
        u0 u0Var = this.G0;
        if (u0Var != null) {
            u0Var.a();
        }
        super.onFragmentDestroy();
        ao0 ao0Var = this.X0;
        if (ao0Var != null) {
            ao0Var.run();
            this.X0 = null;
        }
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void onInsets(int i7, int i10, int i11, int i12) {
        if (this.o0 != null) {
            e1(0);
            e1(1);
            this.o0.requestLayout();
        }
        j80 j80Var = this.a0;
        if (j80Var != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) j80Var.getLayoutParams();
            layoutParams.bottomMargin = org.telegram.messenger.g0.L(24.0f) + i12;
            this.a0.setLayoutParams(layoutParams);
        }
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void onPause() {
        super.onPause();
        ci.b0 b0Var = this.Q0;
        if (b0Var != null) {
            b0Var.g();
            org.telegram.messenger.g0.E2(this.Q0);
            this.Q0 = null;
        }
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void onRequestPermissionsResultFragment(int i7, String[] strArr, int[] iArr) {
        if (i7 != 44 || getParentActivity() == null) {
            return;
        }
        if (iArr.length > 0 && iArr[0] == 0) {
            P0();
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        alertDialog$Builder.a.U = org.telegram.messenger.g0.W2(gd.N0(2131746307, null));
        alertDialog$Builder.k(gd.N0(2131747106, null), new p4(this));
        alertDialog$Builder.h(gd.N0(2131751760, null), null);
        int i10 = org.telegram.ui.ActionBar.n6.L5;
        alertDialog$Builder.m(R.raw.permission_request_camera, 72, org.telegram.ui.ActionBar.n6.x0(null, i10, false), null);
        alertDialog$Builder.n(i10, null);
        alertDialog$Builder.p();
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void onResume() {
        super.onResume();
        org.telegram.ui.ActionBar.z4 z4Var = this.simpleActionBar;
        if (z4Var != null) {
            z4Var.post(new r4(this, 5));
        }
        v0.D(this.currentAccount).K();
        if (this.H0 != null && v0.D(this.currentAccount).N()) {
            this.H0.e();
        }
        W0();
        if (this.a != null) {
            c1(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void onThemeColorsChanged() {
        super.onThemeColorsChanged();
        try {
            if (this.w0 != null && this.x0 != null && this.e != null) {
                Z0(this.A0);
            }
            c6 c6Var = this.e;
            if (c6Var != null && this.E0 != null && this.F0 != null) {
                a1(c6Var.getStickerStyle());
            }
            j80 j80Var = this.a0;
            if (j80Var != null) {
                j80Var.invalidate();
            }
            TextView textView = this.X;
            if (textView != null) {
                textView.invalidate();
            }
            TextView textView2 = this.Z;
            if (textView2 != null) {
                textView2.invalidate();
            }
            y5 y5Var = this.T;
            if (y5Var != null) {
                y5Var.invalidate();
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        org.telegram.ui.ActionBar.z4 z4Var = this.simpleActionBar;
        if (z4Var != null && z4Var.getParent() == view) {
            FrameLayout frameLayout = (FrameLayout) view;
            View view2 = new View(view.getContext());
            this.K0 = view2;
            view2.setOutlineProvider(null);
            this.K0.setTranslationZ(org.telegram.messenger.g0.L(20.0f));
            int indexOfChild = frameLayout.indexOfChild(this.simpleActionBar);
            FrameLayout frameLayout2 = this.i0;
            if (frameLayout2 != null && frameLayout2.getParent() == frameLayout) {
                indexOfChild = Math.min(indexOfChild, frameLayout.indexOfChild(this.i0));
            }
            frameLayout.addView(this.K0, indexOfChild, c8.na.e(-1, 0, 48));
            this.K0.setBackground(getBaseSimpleGlass().a(this.K0));
            this.simpleActionBar.setBackground(null);
        }
        org.telegram.ui.ActionBar.z4 z4Var2 = this.simpleActionBar;
        if (z4Var2 != null) {
            z4Var2.setOutlineProvider(null);
            this.simpleActionBar.setTranslationZ(org.telegram.messenger.g0.L(20.0f));
        }
        getBaseSimpleGlass().o = new eh.a() { // from class: org.telegram.ui.Wallet.u4
            @Override // eh.a
            public final void c(dh.a aVar, RectF rectF) {
                aVar.a = true;
            }

            @Override // eh.a
            public final void d(Canvas canvas, RectF rectF) {
                Canvas canvas2;
                o6 o6Var = o6.this;
                bi.i6 i6Var = o6Var.a;
                ih.d.a(i6Var, canvas, rectF, i6Var, (ViewGroup) o6Var.fragmentView);
                c6 c6Var = o6Var.e;
                if (c6Var == null || o6Var.n == null || c6Var.getVisibility() != 0 || o6Var.e.getAlpha() <= 0.0f) {
                    return;
                }
                int save = canvas.save();
                canvas.translate(o6Var.n.getX() + o6Var.e.getLeft(), o6Var.n.getY() + o6Var.e.getTop());
                canvas.concat(o6Var.e.getMatrix());
                if (o6Var.e.getAlpha() < 1.0f) {
                    canvas2 = canvas;
                    canvas2.saveLayerAlpha(0.0f, 0.0f, o6Var.e.getWidth(), o6Var.e.getHeight(), (int) (o6Var.e.getAlpha() * 255.0f));
                } else {
                    canvas2 = canvas;
                }
                o6Var.e.draw(canvas2);
                canvas2.restoreToCount(save);
            }
        };
    }

    public final void t0(boolean z10) {
        org.telegram.messenger.g0.r(this.O0);
        float f10 = z10 ? 1.0f : 0.0f;
        if (this.M0 == f10) {
            return;
        }
        this.M0 = f10;
        ValueAnimator valueAnimator = this.N0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        Y0();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.L0, f10);
        this.N0 = ofFloat;
        ofFloat.setDuration(z10 ? 260L : 120L);
        this.N0.setInterpolator(z10 ? new kr(0.05d, 0.7d, 0.1d, 1.0d) : new kr(0.4d, 0.0d, 0.2d, 1.0d));
        this.N0.addUpdateListener(new v4(this, 1));
        this.N0.addListener(new i71(this, 7));
        this.N0.start();
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final boolean useFadeDrawableForActionBar() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final boolean useSimpleActionBar() {
        return true;
    }

    public final FrameLayout v0(TextView textView, Runnable runnable) {
        Context context = textView.getContext();
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(14.0f));
        int i7 = org.telegram.ui.ActionBar.n6.i6;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.n6.h0(getThemedColor(i7), 2, -1);
        org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i7);
        org.telegram.ui.ActionBar.i6 resourceProvider = getResourceProvider();
        frameLayout.setBackground(h02);
        org.telegram.ui.ActionBar.u6.j(frameLayout, h02, null, M, resourceProvider);
        org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.G6, getResourceProvider());
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setGravity(19);
        frameLayout.addView(textView, c8.na.d(-1, -2.0f, 3, 0.0f, 0.0f, 42.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(R.drawable.attach_arrow_right);
        org.telegram.ui.ActionBar.u6.s(imageView, org.telegram.ui.ActionBar.n6.z6, getResourceProvider(), PorterDuff.Mode.SRC_IN);
        frameLayout.addView(imageView, c8.na.e(-2, -2, 21));
        frameLayout.setOnClickListener(new p3(runnable, 3));
        textView.setDuplicateParentStateEnabled(true);
        c8.sa.b(textView, 0.02f, 1.2f);
        this.T.addView(frameLayout, c8.na.o(-1, -2));
        return frameLayout;
    }

    public final void w0(ViewGroup viewGroup) {
        if (viewGroup == null) {
            return;
        }
        float f10 = 0.0f;
        View view = viewGroup;
        while (view != null && view != this.a) {
            f10 += view.getY();
            view = view.getParent() instanceof View ? (View) view.getParent() : null;
        }
        float l10 = (view == null || viewGroup.getHeight() <= 0) ? 1.0f : Utilities.l(((f10 + viewGroup.getHeight()) - this.a.getPaddingTop()) / viewGroup.getHeight());
        if (viewGroup.getAlpha() != l10) {
            viewGroup.setAlpha(l10);
        }
    }
}
