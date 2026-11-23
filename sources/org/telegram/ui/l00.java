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

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public abstract class l00 {
    /* JADX WARN: Removed duplicated region for block: B:15:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x013a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void a(Activity activity, int i7, String str, TLObject tLObject, TL_fragment.TL_collectibleInfo tL_collectibleInfo, org.telegram.ui.ActionBar.i6 i6Var) {
        String str2;
        String str3;
        org.telegram.ui.ActionBar.w2 w2Var;
        String a02;
        String b10;
        String str4;
        String str5;
        org.telegram.ui.ActionBar.i6 i6Var2;
        org.telegram.ui.Components.kp0 kp0Var;
        org.telegram.ui.ActionBar.w2 w2Var2 = new org.telegram.ui.ActionBar.w2(1, (Context) activity, i6Var, false);
        w2Var2.Q(org.telegram.ui.ActionBar.n6.h5);
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), 0);
        FrameLayout frameLayout = new FrameLayout(activity);
        int L = org.telegram.messenger.g0.L(80.0f);
        int i10 = org.telegram.ui.ActionBar.n6.Fi;
        ShapeDrawable L2 = org.telegram.ui.ActionBar.n6.L(L, org.telegram.ui.ActionBar.n6.w0(i10, i6Var));
        org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i10);
        frameLayout.setBackground(L2);
        org.telegram.ui.ActionBar.u6.j(frameLayout, L2, M, null, i6Var);
        linearLayout.addView(frameLayout, c8.na.t(80, 80, 1, 0, 16, 0, 16));
        org.telegram.ui.Components.qh0 qh0Var = new org.telegram.ui.Components.qh0(activity);
        qh0Var.setScaleType(ImageView.ScaleType.CENTER);
        int i11 = i7 == 0 ? 70 : 78;
        qh0Var.f(i7 == 0 ? R.raw.fragment_username : R.raw.fragment, i11, i11, null);
        qh0Var.d();
        qh0Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        if (i7 == 0) {
            qh0Var.setScaleX(0.86f);
            qh0Var.setScaleY(0.86f);
        } else {
            qh0Var.setTranslationY(org.telegram.messenger.g0.L(2.0f));
        }
        frameLayout.addView(qh0Var, c8.na.r(-1, -1, 17));
        if (tLObject instanceof TLRPC.User) {
            str3 = org.telegram.messenger.n10.q((TLRPC.User) tLObject);
        } else {
            if (!(tLObject instanceof TLRPC.Chat)) {
                str2 = "";
                String f10 = org.telegram.messenger.r1.i().f(tL_collectibleInfo.amount, tL_collectibleInfo.currency);
                String f11 = org.telegram.messenger.r1.i().f(tL_collectibleInfo.crypto_amount, tL_collectibleInfo.crypto_currency);
                if (i7 != 0) {
                    str4 = org.telegram.messenger.gd.a0(null, null, 2131750495, p5.c.k("@", str));
                    w2Var = w2Var2;
                    a02 = org.telegram.messenger.gd.a0(null, null, 2131750497, org.telegram.messenger.gd.Q(tL_collectibleInfo.purchase_date), f11, TextUtils.isEmpty(f10) ? "" : a8.p0.p("(", f10, ")"));
                    b10 = p5.c.m(org.telegram.messenger.mp.u1(org.telegram.messenger.i10.t0).X2, "/", str, new StringBuilder());
                } else {
                    w2Var = w2Var2;
                    if (i7 != 1) {
                        return;
                    }
                    String a03 = org.telegram.messenger.gd.a0(null, null, 2131750499, pf.b.c().b("+" + str));
                    a02 = org.telegram.messenger.gd.a0(null, null, 2131750500, org.telegram.messenger.gd.Q(tL_collectibleInfo.purchase_date), f11, TextUtils.isEmpty(f10) ? "" : a8.p0.p("(", f10, ")"));
                    b10 = pf.b.c().b("+" + str);
                    str4 = a03;
                }
                String str6 = a02;
                str5 = b10;
                if (str5 == null) {
                    i6Var2 = i6Var;
                    kp0Var = new org.telegram.ui.Components.kp0(str5, i7, w2Var, i6Var2, 9);
                } else {
                    i6Var2 = i6Var;
                    kp0Var = null;
                }
                SpannableStringBuilder T2 = org.telegram.messenger.g0.T2(str4, kp0Var);
                SpannableString spannableString = new SpannableString("TON");
                org.telegram.ui.Components.kq kqVar = new org.telegram.ui.Components.kq(R.drawable.mini_gram_16, 0);
                kqVar.d = false;
                kqVar.F = org.telegram.messenger.g0.L(13.0f);
                spannableString.setSpan(kqVar, 0, spannableString.length(), 33);
                SpannableStringBuilder K2 = org.telegram.messenger.g0.K2(org.telegram.messenger.g0.W2(str6), spannableString, "TON");
                org.telegram.ui.Components.j80 j80Var = new org.telegram.ui.Components.j80(activity, null);
                j80Var.setTypeface(org.telegram.messenger.g0.o());
                j80Var.setGravity(17);
                int i12 = org.telegram.ui.ActionBar.n6.j5;
                org.telegram.ui.ActionBar.u6.U(j80Var, i12, i6Var2);
                org.telegram.ui.ActionBar.u6.G(j80Var, org.telegram.ui.ActionBar.n6.o6, i6Var2);
                j80Var.setTextSize(1, 16.0f);
                j80Var.setText(T2);
                linearLayout.addView(j80Var, c8.na.t(-1, -2, 1, 42, 0, 42, 0));
                FrameLayout frameLayout2 = new FrameLayout(activity);
                int L3 = org.telegram.messenger.g0.L(28.0f);
                int L4 = org.telegram.messenger.g0.L(28.0f);
                int i13 = org.telegram.ui.ActionBar.n6.Ti;
                ShapeDrawable e02 = org.telegram.ui.ActionBar.n6.e0(L3, L4, org.telegram.ui.ActionBar.n6.w0(i13, i6Var2));
                org.telegram.ui.ActionBar.q6 M2 = org.telegram.ui.ActionBar.u6.M(i13);
                frameLayout2.setBackground(e02);
                org.telegram.ui.ActionBar.u6.j(frameLayout2, e02, M2, null, i6Var2);
                org.telegram.ui.Components.p9 p9Var = new org.telegram.ui.Components.p9(activity);
                p9Var.setRoundRadius(org.telegram.messenger.g0.L(28.0f));
                org.telegram.ui.Components.a9 a9Var = new org.telegram.ui.Components.a9((org.telegram.ui.ActionBar.i6) null);
                a9Var.l(tLObject);
                p9Var.f(tLObject, a9Var);
                frameLayout2.addView(p9Var, c8.na.e(28, 28, 51));
                TextView textView = new TextView(activity);
                org.telegram.ui.ActionBar.u6.U(textView, i12, i6Var2);
                textView.setTextSize(1, 13.0f);
                textView.setSingleLine();
                textView.setText(org.telegram.messenger.j6.m(str2, textView.getPaint().getFontMetricsInt(), false, null, 0));
                frameLayout2.addView(textView, c8.na.d(-2, -2.0f, 19, 37.0f, 0.0f, 10.0f, 0.0f));
                linearLayout.addView(frameLayout2, c8.na.t(-2, 28, 1, 42, 10, 42, 18));
                TextView textView2 = new TextView(activity);
                textView2.setGravity(17);
                org.telegram.ui.ActionBar.u6.U(textView2, i12, i6Var2);
                textView2.setTextSize(1, 14.0f);
                textView2.setText(K2);
                linearLayout.addView(textView2, c8.na.t(-1, -2, 1, 32, 0, 32, 19));
                hi.e eVar = new hi.e(activity, i6Var2, true);
                eVar.setRoundRadius(24);
                eVar.i(org.telegram.messenger.gd.N0(2131750496, null), false, true);
                eVar.setOnClickListener(new org.telegram.ui.Components.p31(16, activity, tL_collectibleInfo));
                linearLayout.addView(eVar, c8.na.k(6.0f, 0.0f, 6.0f, 0.0f, -1, 48));
                if (kp0Var != null) {
                    hi.e eVar2 = new hi.e(activity, i6Var2, true);
                    eVar2.setRoundRadius(24);
                    eVar2.e();
                    eVar2.i(org.telegram.messenger.gd.N0(i7 == 0 ? 2131750498 : 2131750501, null), false, true);
                    eVar2.setOnClickListener(new org.telegram.ui.Components.p31(17, kp0Var, w2Var));
                    linearLayout.addView(eVar2, c8.na.k(6.0f, 6.0f, 6.0f, 0.0f, -1, 48));
                }
                w2Var.O = linearLayout;
                w2Var.show();
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
        SpannableStringBuilder T22 = org.telegram.messenger.g0.T2(str4, kp0Var);
        SpannableString spannableString2 = new SpannableString("TON");
        org.telegram.ui.Components.kq kqVar2 = new org.telegram.ui.Components.kq(R.drawable.mini_gram_16, 0);
        kqVar2.d = false;
        kqVar2.F = org.telegram.messenger.g0.L(13.0f);
        spannableString2.setSpan(kqVar2, 0, spannableString2.length(), 33);
        SpannableStringBuilder K22 = org.telegram.messenger.g0.K2(org.telegram.messenger.g0.W2(str62), spannableString2, "TON");
        org.telegram.ui.Components.j80 j80Var2 = new org.telegram.ui.Components.j80(activity, null);
        j80Var2.setTypeface(org.telegram.messenger.g0.o());
        j80Var2.setGravity(17);
        int i122 = org.telegram.ui.ActionBar.n6.j5;
        org.telegram.ui.ActionBar.u6.U(j80Var2, i122, i6Var2);
        org.telegram.ui.ActionBar.u6.G(j80Var2, org.telegram.ui.ActionBar.n6.o6, i6Var2);
        j80Var2.setTextSize(1, 16.0f);
        j80Var2.setText(T22);
        linearLayout.addView(j80Var2, c8.na.t(-1, -2, 1, 42, 0, 42, 0));
        FrameLayout frameLayout22 = new FrameLayout(activity);
        int L32 = org.telegram.messenger.g0.L(28.0f);
        int L42 = org.telegram.messenger.g0.L(28.0f);
        int i132 = org.telegram.ui.ActionBar.n6.Ti;
        ShapeDrawable e022 = org.telegram.ui.ActionBar.n6.e0(L32, L42, org.telegram.ui.ActionBar.n6.w0(i132, i6Var2));
        org.telegram.ui.ActionBar.q6 M22 = org.telegram.ui.ActionBar.u6.M(i132);
        frameLayout22.setBackground(e022);
        org.telegram.ui.ActionBar.u6.j(frameLayout22, e022, M22, null, i6Var2);
        org.telegram.ui.Components.p9 p9Var2 = new org.telegram.ui.Components.p9(activity);
        p9Var2.setRoundRadius(org.telegram.messenger.g0.L(28.0f));
        org.telegram.ui.Components.a9 a9Var2 = new org.telegram.ui.Components.a9((org.telegram.ui.ActionBar.i6) null);
        a9Var2.l(tLObject);
        p9Var2.f(tLObject, a9Var2);
        frameLayout22.addView(p9Var2, c8.na.e(28, 28, 51));
        TextView textView3 = new TextView(activity);
        org.telegram.ui.ActionBar.u6.U(textView3, i122, i6Var2);
        textView3.setTextSize(1, 13.0f);
        textView3.setSingleLine();
        textView3.setText(org.telegram.messenger.j6.m(str2, textView3.getPaint().getFontMetricsInt(), false, null, 0));
        frameLayout22.addView(textView3, c8.na.d(-2, -2.0f, 19, 37.0f, 0.0f, 10.0f, 0.0f));
        linearLayout.addView(frameLayout22, c8.na.t(-2, 28, 1, 42, 10, 42, 18));
        TextView textView22 = new TextView(activity);
        textView22.setGravity(17);
        org.telegram.ui.ActionBar.u6.U(textView22, i122, i6Var2);
        textView22.setTextSize(1, 14.0f);
        textView22.setText(K22);
        linearLayout.addView(textView22, c8.na.t(-1, -2, 1, 32, 0, 32, 19));
        hi.e eVar3 = new hi.e(activity, i6Var2, true);
        eVar3.setRoundRadius(24);
        eVar3.i(org.telegram.messenger.gd.N0(2131750496, null), false, true);
        eVar3.setOnClickListener(new org.telegram.ui.Components.p31(16, activity, tL_collectibleInfo));
        linearLayout.addView(eVar3, c8.na.k(6.0f, 0.0f, 6.0f, 0.0f, -1, 48));
        if (kp0Var != null) {
        }
        w2Var.O = linearLayout;
        w2Var.show();
    }
}
