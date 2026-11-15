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

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public abstract class j00 {
    /* JADX WARN: Removed duplicated region for block: B:15:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x013a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void a(Activity activity, int i7, String str, TLObject tLObject, TL_fragment.TL_collectibleInfo tL_collectibleInfo, org.telegram.ui.ActionBar.e6 e6Var) {
        String str2;
        String str3;
        org.telegram.ui.ActionBar.u2 u2Var;
        String a02;
        String b10;
        String str4;
        String str5;
        org.telegram.ui.ActionBar.e6 e6Var2;
        org.telegram.ui.Components.sp0 sp0Var;
        org.telegram.ui.ActionBar.u2 u2Var2 = new org.telegram.ui.ActionBar.u2(1, (Context) activity, e6Var, false);
        u2Var2.Q(org.telegram.ui.ActionBar.j6.h5);
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), 0);
        FrameLayout frameLayout = new FrameLayout(activity);
        int L = org.telegram.messenger.g0.L(80.0f);
        int i10 = org.telegram.ui.ActionBar.j6.Fi;
        ShapeDrawable L2 = org.telegram.ui.ActionBar.j6.L(L, org.telegram.ui.ActionBar.j6.w0(i10, e6Var));
        org.telegram.ui.ActionBar.m6 M = org.telegram.ui.ActionBar.q6.M(i10);
        frameLayout.setBackground(L2);
        org.telegram.ui.ActionBar.q6.j(frameLayout, L2, M, null, e6Var);
        linearLayout.addView(frameLayout, c8.ja.t(80, 80, 1, 0, 16, 0, 16));
        org.telegram.ui.Components.fh0 fh0Var = new org.telegram.ui.Components.fh0(activity);
        fh0Var.setScaleType(ImageView.ScaleType.CENTER);
        int i11 = i7 == 0 ? 70 : 78;
        fh0Var.f(i7 == 0 ? R.raw.fragment_username : R.raw.fragment, i11, i11, null);
        fh0Var.d();
        fh0Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        if (i7 == 0) {
            fh0Var.setScaleX(0.86f);
            fh0Var.setScaleY(0.86f);
        } else {
            fh0Var.setTranslationY(org.telegram.messenger.g0.L(2.0f));
        }
        frameLayout.addView(fh0Var, c8.ja.r(-1, -1, 17));
        if (tLObject instanceof TLRPC.User) {
            str3 = org.telegram.messenger.q10.p((TLRPC.User) tLObject);
        } else {
            if (!(tLObject instanceof TLRPC.Chat)) {
                str2 = "";
                String f10 = org.telegram.messenger.r1.i().f(tL_collectibleInfo.amount, tL_collectibleInfo.currency);
                String f11 = org.telegram.messenger.r1.i().f(tL_collectibleInfo.crypto_amount, tL_collectibleInfo.crypto_currency);
                if (i7 != 0) {
                    str4 = org.telegram.messenger.hd.a0(null, null, 2131750512, r.b.k("@", str));
                    u2Var = u2Var2;
                    a02 = org.telegram.messenger.hd.a0(null, null, 2131750514, org.telegram.messenger.hd.Q(tL_collectibleInfo.purchase_date), f11, TextUtils.isEmpty(f10) ? "" : a8.p0.p("(", f10, ")"));
                    b10 = org.telegram.ui.Cells.y0.m(org.telegram.messenger.np.s1(org.telegram.messenger.m10.t0).V2, "/", str, new StringBuilder());
                } else {
                    u2Var = u2Var2;
                    if (i7 != 1) {
                        return;
                    }
                    String a03 = org.telegram.messenger.hd.a0(null, null, 2131750516, pf.b.c().b("+" + str));
                    a02 = org.telegram.messenger.hd.a0(null, null, 2131750517, org.telegram.messenger.hd.Q(tL_collectibleInfo.purchase_date), f11, TextUtils.isEmpty(f10) ? "" : a8.p0.p("(", f10, ")"));
                    b10 = pf.b.c().b("+" + str);
                    str4 = a03;
                }
                String str6 = a02;
                str5 = b10;
                if (str5 == null) {
                    e6Var2 = e6Var;
                    sp0Var = new org.telegram.ui.Components.sp0(str5, i7, u2Var, e6Var2, 7);
                } else {
                    e6Var2 = e6Var;
                    sp0Var = null;
                }
                SpannableStringBuilder U2 = org.telegram.messenger.g0.U2(str4, sp0Var);
                SpannableString spannableString = new SpannableString("TON");
                org.telegram.ui.Components.eq eqVar = new org.telegram.ui.Components.eq(R.drawable.mini_gram_16, 0);
                eqVar.d = false;
                eqVar.F = org.telegram.messenger.g0.L(13.0f);
                spannableString.setSpan(eqVar, 0, spannableString.length(), 33);
                SpannableStringBuilder K2 = org.telegram.messenger.g0.K2(org.telegram.messenger.g0.X2(str6), spannableString, "TON");
                org.telegram.ui.Components.z70 z70Var = new org.telegram.ui.Components.z70(activity, null);
                z70Var.setTypeface(org.telegram.messenger.g0.o());
                z70Var.setGravity(17);
                int i12 = org.telegram.ui.ActionBar.j6.j5;
                org.telegram.ui.ActionBar.q6.U(z70Var, i12, e6Var2);
                org.telegram.ui.ActionBar.q6.G(z70Var, org.telegram.ui.ActionBar.j6.o6, e6Var2);
                z70Var.setTextSize(1, 16.0f);
                z70Var.setText(U2);
                linearLayout.addView(z70Var, c8.ja.t(-1, -2, 1, 42, 0, 42, 0));
                FrameLayout frameLayout2 = new FrameLayout(activity);
                int L3 = org.telegram.messenger.g0.L(28.0f);
                int L4 = org.telegram.messenger.g0.L(28.0f);
                int i13 = org.telegram.ui.ActionBar.j6.Ti;
                ShapeDrawable e02 = org.telegram.ui.ActionBar.j6.e0(L3, L4, org.telegram.ui.ActionBar.j6.w0(i13, e6Var2));
                org.telegram.ui.ActionBar.m6 M2 = org.telegram.ui.ActionBar.q6.M(i13);
                frameLayout2.setBackground(e02);
                org.telegram.ui.ActionBar.q6.j(frameLayout2, e02, M2, null, e6Var2);
                org.telegram.ui.Components.i9 i9Var = new org.telegram.ui.Components.i9(activity);
                i9Var.setRoundRadius(org.telegram.messenger.g0.L(28.0f));
                org.telegram.ui.Components.t8 t8Var = new org.telegram.ui.Components.t8((org.telegram.ui.ActionBar.e6) null);
                t8Var.l(tLObject);
                i9Var.f(tLObject, t8Var);
                frameLayout2.addView(i9Var, c8.ja.e(28, 28, 51));
                TextView textView = new TextView(activity);
                org.telegram.ui.ActionBar.q6.U(textView, i12, e6Var2);
                textView.setTextSize(1, 13.0f);
                textView.setSingleLine();
                textView.setText(org.telegram.messenger.j6.m(str2, textView.getPaint().getFontMetricsInt(), false, null, 0));
                frameLayout2.addView(textView, c8.ja.d(-2, -2.0f, 19, 37.0f, 0.0f, 10.0f, 0.0f));
                linearLayout.addView(frameLayout2, c8.ja.t(-2, 28, 1, 42, 10, 42, 18));
                TextView textView2 = new TextView(activity);
                textView2.setGravity(17);
                org.telegram.ui.ActionBar.q6.U(textView2, i12, e6Var2);
                textView2.setTextSize(1, 14.0f);
                textView2.setText(K2);
                linearLayout.addView(textView2, c8.ja.t(-1, -2, 1, 32, 0, 32, 19));
                hi.d dVar = new hi.d(activity, e6Var2, true);
                dVar.setRoundRadius(24);
                dVar.i(org.telegram.messenger.hd.M0(2131750513, null), false, true);
                dVar.setOnClickListener(new org.telegram.ui.Components.vv0(22, activity, tL_collectibleInfo));
                linearLayout.addView(dVar, c8.ja.k(6.0f, 0.0f, 6.0f, 0.0f, -1, 48));
                if (sp0Var != null) {
                    hi.d dVar2 = new hi.d(activity, e6Var2, true);
                    dVar2.setRoundRadius(24);
                    dVar2.e();
                    dVar2.i(org.telegram.messenger.hd.M0(i7 == 0 ? 2131750515 : 2131750518, null), false, true);
                    dVar2.setOnClickListener(new org.telegram.ui.Components.vv0(23, sp0Var, u2Var));
                    linearLayout.addView(dVar2, c8.ja.k(6.0f, 6.0f, 6.0f, 0.0f, -1, 48));
                }
                u2Var.O = linearLayout;
                u2Var.show();
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
        SpannableStringBuilder U22 = org.telegram.messenger.g0.U2(str4, sp0Var);
        SpannableString spannableString2 = new SpannableString("TON");
        org.telegram.ui.Components.eq eqVar2 = new org.telegram.ui.Components.eq(R.drawable.mini_gram_16, 0);
        eqVar2.d = false;
        eqVar2.F = org.telegram.messenger.g0.L(13.0f);
        spannableString2.setSpan(eqVar2, 0, spannableString2.length(), 33);
        SpannableStringBuilder K22 = org.telegram.messenger.g0.K2(org.telegram.messenger.g0.X2(str62), spannableString2, "TON");
        org.telegram.ui.Components.z70 z70Var2 = new org.telegram.ui.Components.z70(activity, null);
        z70Var2.setTypeface(org.telegram.messenger.g0.o());
        z70Var2.setGravity(17);
        int i122 = org.telegram.ui.ActionBar.j6.j5;
        org.telegram.ui.ActionBar.q6.U(z70Var2, i122, e6Var2);
        org.telegram.ui.ActionBar.q6.G(z70Var2, org.telegram.ui.ActionBar.j6.o6, e6Var2);
        z70Var2.setTextSize(1, 16.0f);
        z70Var2.setText(U22);
        linearLayout.addView(z70Var2, c8.ja.t(-1, -2, 1, 42, 0, 42, 0));
        FrameLayout frameLayout22 = new FrameLayout(activity);
        int L32 = org.telegram.messenger.g0.L(28.0f);
        int L42 = org.telegram.messenger.g0.L(28.0f);
        int i132 = org.telegram.ui.ActionBar.j6.Ti;
        ShapeDrawable e022 = org.telegram.ui.ActionBar.j6.e0(L32, L42, org.telegram.ui.ActionBar.j6.w0(i132, e6Var2));
        org.telegram.ui.ActionBar.m6 M22 = org.telegram.ui.ActionBar.q6.M(i132);
        frameLayout22.setBackground(e022);
        org.telegram.ui.ActionBar.q6.j(frameLayout22, e022, M22, null, e6Var2);
        org.telegram.ui.Components.i9 i9Var2 = new org.telegram.ui.Components.i9(activity);
        i9Var2.setRoundRadius(org.telegram.messenger.g0.L(28.0f));
        org.telegram.ui.Components.t8 t8Var2 = new org.telegram.ui.Components.t8((org.telegram.ui.ActionBar.e6) null);
        t8Var2.l(tLObject);
        i9Var2.f(tLObject, t8Var2);
        frameLayout22.addView(i9Var2, c8.ja.e(28, 28, 51));
        TextView textView3 = new TextView(activity);
        org.telegram.ui.ActionBar.q6.U(textView3, i122, e6Var2);
        textView3.setTextSize(1, 13.0f);
        textView3.setSingleLine();
        textView3.setText(org.telegram.messenger.j6.m(str2, textView3.getPaint().getFontMetricsInt(), false, null, 0));
        frameLayout22.addView(textView3, c8.ja.d(-2, -2.0f, 19, 37.0f, 0.0f, 10.0f, 0.0f));
        linearLayout.addView(frameLayout22, c8.ja.t(-2, 28, 1, 42, 10, 42, 18));
        TextView textView22 = new TextView(activity);
        textView22.setGravity(17);
        org.telegram.ui.ActionBar.q6.U(textView22, i122, e6Var2);
        textView22.setTextSize(1, 14.0f);
        textView22.setText(K22);
        linearLayout.addView(textView22, c8.ja.t(-1, -2, 1, 32, 0, 32, 19));
        hi.d dVar3 = new hi.d(activity, e6Var2, true);
        dVar3.setRoundRadius(24);
        dVar3.i(org.telegram.messenger.hd.M0(2131750513, null), false, true);
        dVar3.setOnClickListener(new org.telegram.ui.Components.vv0(22, activity, tL_collectibleInfo));
        linearLayout.addView(dVar3, c8.ja.k(6.0f, 0.0f, 6.0f, 0.0f, -1, 48));
        if (sp0Var != null) {
        }
        u2Var.O = linearLayout;
        u2Var.show();
    }
}
