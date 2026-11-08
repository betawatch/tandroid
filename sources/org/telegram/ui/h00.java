package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.ShapeDrawable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_fragment;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public abstract class h00 {
    /* JADX WARN: Removed duplicated region for block: B:15:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x013a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void a(Activity activity, int i7, String str, TLObject tLObject, TL_fragment.TL_collectibleInfo tL_collectibleInfo, org.telegram.ui.ActionBar.f6 f6Var) {
        String str2;
        String str3;
        org.telegram.ui.ActionBar.v2 v2Var;
        String a02;
        String b10;
        String str4;
        String str5;
        org.telegram.ui.ActionBar.f6 f6Var2;
        org.telegram.ui.Components.pp0 pp0Var;
        org.telegram.ui.ActionBar.v2 v2Var2 = new org.telegram.ui.ActionBar.v2(1, (Context) activity, f6Var, false);
        v2Var2.P(org.telegram.ui.ActionBar.k6.h5);
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), 0);
        FrameLayout frameLayout = new FrameLayout(activity);
        int L = org.telegram.messenger.g0.L(80.0f);
        int i10 = org.telegram.ui.ActionBar.k6.Ci;
        ShapeDrawable L2 = org.telegram.ui.ActionBar.k6.L(L, org.telegram.ui.ActionBar.k6.w0(i10, f6Var));
        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i10);
        frameLayout.setBackground(L2);
        org.telegram.ui.ActionBar.r6.k(frameLayout, L2, N, null, f6Var);
        linearLayout.addView(frameLayout, c8.ha.t(80, 80, 1, 0, 16, 0, 16));
        org.telegram.ui.Components.ch0 ch0Var = new org.telegram.ui.Components.ch0(activity);
        ch0Var.setScaleType(ImageView.ScaleType.CENTER);
        int i11 = i7 == 0 ? 70 : 78;
        ch0Var.f(i7 == 0 ? R.raw.fragment_username : R.raw.fragment, i11, i11, null);
        ch0Var.d();
        ch0Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        if (i7 == 0) {
            ch0Var.setScaleX(0.86f);
            ch0Var.setScaleY(0.86f);
        } else {
            ch0Var.setTranslationY(org.telegram.messenger.g0.L(2.0f));
        }
        frameLayout.addView(ch0Var, c8.ha.r(-1, -1, 17));
        if (tLObject instanceof TLRPC.User) {
            str3 = org.telegram.messenger.t10.p((TLRPC.User) tLObject);
        } else {
            if (!(tLObject instanceof TLRPC.Chat)) {
                str2 = "";
                String f10 = org.telegram.messenger.r1.i().f(tL_collectibleInfo.amount, tL_collectibleInfo.currency);
                String f11 = org.telegram.messenger.r1.i().f(tL_collectibleInfo.crypto_amount, tL_collectibleInfo.crypto_currency);
                if (i7 != 0) {
                    str4 = org.telegram.messenger.id.a0(null, null, 2131750513, rf.b.i("@", str));
                    v2Var = v2Var2;
                    a02 = org.telegram.messenger.id.a0(null, null, 2131750515, org.telegram.messenger.id.Q(tL_collectibleInfo.purchase_date), f11, TextUtils.isEmpty(f10) ? "" : a8.p0.p("(", f10, ")"));
                    b10 = org.telegram.ui.Cells.f1.n(org.telegram.messenger.qp.s1(org.telegram.messenger.p10.s0).U2, "/", str, new StringBuilder());
                } else {
                    v2Var = v2Var2;
                    if (i7 != 1) {
                        return;
                    }
                    String a03 = org.telegram.messenger.id.a0(null, null, 2131750517, pf.b.c().b("+" + str));
                    a02 = org.telegram.messenger.id.a0(null, null, 2131750518, org.telegram.messenger.id.Q(tL_collectibleInfo.purchase_date), f11, TextUtils.isEmpty(f10) ? "" : a8.p0.p("(", f10, ")"));
                    b10 = pf.b.c().b("+" + str);
                    str4 = a03;
                }
                String str6 = a02;
                str5 = b10;
                if (str5 == null) {
                    f6Var2 = f6Var;
                    pp0Var = new org.telegram.ui.Components.pp0(str5, i7, v2Var, f6Var2, 7);
                } else {
                    f6Var2 = f6Var;
                    pp0Var = null;
                }
                SpannableStringBuilder U2 = org.telegram.messenger.g0.U2(str4, pp0Var);
                SpannableString spannableString = new SpannableString("TON");
                org.telegram.ui.Components.wp wpVar = new org.telegram.ui.Components.wp(R.drawable.mini_gram_16, 0);
                wpVar.d = false;
                wpVar.E = org.telegram.messenger.g0.L(13.0f);
                spannableString.setSpan(wpVar, 0, spannableString.length(), 33);
                SpannableStringBuilder K2 = org.telegram.messenger.g0.K2(org.telegram.messenger.g0.X2(str6), spannableString, "TON");
                org.telegram.ui.Components.w70 w70Var = new org.telegram.ui.Components.w70(activity, null);
                w70Var.setTypeface(org.telegram.messenger.g0.o());
                w70Var.setGravity(17);
                int i12 = org.telegram.ui.ActionBar.k6.j5;
                org.telegram.ui.ActionBar.r6.V(w70Var, i12, f6Var2);
                org.telegram.ui.ActionBar.r6.H(w70Var, org.telegram.ui.ActionBar.k6.o6, f6Var2);
                w70Var.setTextSize(1, 16.0f);
                w70Var.setText(U2);
                linearLayout.addView(w70Var, c8.ha.t(-1, -2, 1, 42, 0, 42, 0));
                FrameLayout frameLayout2 = new FrameLayout(activity);
                int L3 = org.telegram.messenger.g0.L(28.0f);
                int L4 = org.telegram.messenger.g0.L(28.0f);
                int i13 = org.telegram.ui.ActionBar.k6.Qi;
                ShapeDrawable e02 = org.telegram.ui.ActionBar.k6.e0(L3, L4, org.telegram.ui.ActionBar.k6.w0(i13, f6Var2));
                org.telegram.ui.ActionBar.n6 N2 = org.telegram.ui.ActionBar.r6.N(i13);
                frameLayout2.setBackground(e02);
                org.telegram.ui.ActionBar.r6.k(frameLayout2, e02, N2, null, f6Var2);
                org.telegram.ui.Components.l9 l9Var = new org.telegram.ui.Components.l9(activity);
                l9Var.setRoundRadius(org.telegram.messenger.g0.L(28.0f));
                org.telegram.ui.Components.w8 w8Var = new org.telegram.ui.Components.w8((org.telegram.ui.ActionBar.f6) null);
                w8Var.l(tLObject);
                l9Var.e(tLObject, w8Var);
                frameLayout2.addView(l9Var, c8.ha.e(28, 28, 51));
                TextView textView = new TextView(activity);
                org.telegram.ui.ActionBar.r6.V(textView, i12, f6Var2);
                textView.setTextSize(1, 13.0f);
                textView.setSingleLine();
                textView.setText(org.telegram.messenger.i6.m(str2, textView.getPaint().getFontMetricsInt(), false, null, 0));
                frameLayout2.addView(textView, c8.ha.d(-2, -2.0f, 19, 37.0f, 0.0f, 10.0f, 0.0f));
                linearLayout.addView(frameLayout2, c8.ha.t(-2, 28, 1, 42, 10, 42, 18));
                TextView textView2 = new TextView(activity);
                textView2.setGravity(17);
                org.telegram.ui.ActionBar.r6.V(textView2, i12, f6Var2);
                textView2.setTextSize(1, 14.0f);
                textView2.setText(K2);
                linearLayout.addView(textView2, c8.ha.t(-1, -2, 1, 32, 0, 32, 19));
                fi.d dVar = new fi.d(activity, f6Var2, true);
                dVar.setRoundRadius(24);
                dVar.i(org.telegram.messenger.id.M0(2131750514, null), false, true);
                dVar.setOnClickListener(new org.telegram.ui.Components.t41(14, activity, tL_collectibleInfo));
                linearLayout.addView(dVar, c8.ha.k(6.0f, 0.0f, 6.0f, 0.0f, -1, 48));
                if (pp0Var != null) {
                    fi.d dVar2 = new fi.d(activity, f6Var2, true);
                    dVar2.setRoundRadius(24);
                    dVar2.e();
                    dVar2.i(org.telegram.messenger.id.M0(i7 == 0 ? 2131750516 : 2131750519, null), false, true);
                    dVar2.setOnClickListener(new org.telegram.ui.Components.t41(15, pp0Var, v2Var));
                    linearLayout.addView(dVar2, c8.ha.k(6.0f, 6.0f, 6.0f, 0.0f, -1, 48));
                }
                v2Var.N = linearLayout;
                v2Var.show();
            }
            str3 = ((TLRPC.Chat) tLObject).title;
        }
        str2 = str3;
        String f102 = org.telegram.messenger.r1.i().f(tL_collectibleInfo.amount, tL_collectibleInfo.currency);
        String f112 = org.telegram.messenger.r1.i().f(tL_collectibleInfo.crypto_amount, tL_collectibleInfo.crypto_currency);
        if (i7 != 0) {
        }
        String str62 = a02;
        str5 = b10;
        if (str5 == null) {
        }
        SpannableStringBuilder U22 = org.telegram.messenger.g0.U2(str4, pp0Var);
        SpannableString spannableString2 = new SpannableString("TON");
        org.telegram.ui.Components.wp wpVar2 = new org.telegram.ui.Components.wp(R.drawable.mini_gram_16, 0);
        wpVar2.d = false;
        wpVar2.E = org.telegram.messenger.g0.L(13.0f);
        spannableString2.setSpan(wpVar2, 0, spannableString2.length(), 33);
        SpannableStringBuilder K22 = org.telegram.messenger.g0.K2(org.telegram.messenger.g0.X2(str62), spannableString2, "TON");
        org.telegram.ui.Components.w70 w70Var2 = new org.telegram.ui.Components.w70(activity, null);
        w70Var2.setTypeface(org.telegram.messenger.g0.o());
        w70Var2.setGravity(17);
        int i122 = org.telegram.ui.ActionBar.k6.j5;
        org.telegram.ui.ActionBar.r6.V(w70Var2, i122, f6Var2);
        org.telegram.ui.ActionBar.r6.H(w70Var2, org.telegram.ui.ActionBar.k6.o6, f6Var2);
        w70Var2.setTextSize(1, 16.0f);
        w70Var2.setText(U22);
        linearLayout.addView(w70Var2, c8.ha.t(-1, -2, 1, 42, 0, 42, 0));
        FrameLayout frameLayout22 = new FrameLayout(activity);
        int L32 = org.telegram.messenger.g0.L(28.0f);
        int L42 = org.telegram.messenger.g0.L(28.0f);
        int i132 = org.telegram.ui.ActionBar.k6.Qi;
        ShapeDrawable e022 = org.telegram.ui.ActionBar.k6.e0(L32, L42, org.telegram.ui.ActionBar.k6.w0(i132, f6Var2));
        org.telegram.ui.ActionBar.n6 N22 = org.telegram.ui.ActionBar.r6.N(i132);
        frameLayout22.setBackground(e022);
        org.telegram.ui.ActionBar.r6.k(frameLayout22, e022, N22, null, f6Var2);
        org.telegram.ui.Components.l9 l9Var2 = new org.telegram.ui.Components.l9(activity);
        l9Var2.setRoundRadius(org.telegram.messenger.g0.L(28.0f));
        org.telegram.ui.Components.w8 w8Var2 = new org.telegram.ui.Components.w8((org.telegram.ui.ActionBar.f6) null);
        w8Var2.l(tLObject);
        l9Var2.e(tLObject, w8Var2);
        frameLayout22.addView(l9Var2, c8.ha.e(28, 28, 51));
        TextView textView3 = new TextView(activity);
        org.telegram.ui.ActionBar.r6.V(textView3, i122, f6Var2);
        textView3.setTextSize(1, 13.0f);
        textView3.setSingleLine();
        textView3.setText(org.telegram.messenger.i6.m(str2, textView3.getPaint().getFontMetricsInt(), false, null, 0));
        frameLayout22.addView(textView3, c8.ha.d(-2, -2.0f, 19, 37.0f, 0.0f, 10.0f, 0.0f));
        linearLayout.addView(frameLayout22, c8.ha.t(-2, 28, 1, 42, 10, 42, 18));
        TextView textView22 = new TextView(activity);
        textView22.setGravity(17);
        org.telegram.ui.ActionBar.r6.V(textView22, i122, f6Var2);
        textView22.setTextSize(1, 14.0f);
        textView22.setText(K22);
        linearLayout.addView(textView22, c8.ha.t(-1, -2, 1, 32, 0, 32, 19));
        fi.d dVar3 = new fi.d(activity, f6Var2, true);
        dVar3.setRoundRadius(24);
        dVar3.i(org.telegram.messenger.id.M0(2131750514, null), false, true);
        dVar3.setOnClickListener(new org.telegram.ui.Components.t41(14, activity, tL_collectibleInfo));
        linearLayout.addView(dVar3, c8.ha.k(6.0f, 0.0f, 6.0f, 0.0f, -1, 48));
        if (pp0Var != null) {
        }
        v2Var.N = linearLayout;
        v2Var.show();
    }
}
