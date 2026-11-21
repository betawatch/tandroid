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

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public abstract class m00 {
    public static void a(Activity activity, int i7, String str, TLObject tLObject, TL_fragment.TL_collectibleInfo tL_collectibleInfo, org.telegram.ui.ActionBar.h6 h6Var) {
        String b10;
        String str2;
        String str3;
        org.telegram.ui.ActionBar.w2 w2Var = new org.telegram.ui.ActionBar.w2(1, (Context) activity, h6Var, false);
        w2Var.Q(org.telegram.ui.ActionBar.m6.h5);
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), 0);
        FrameLayout frameLayout = new FrameLayout(activity);
        int L = org.telegram.messenger.g0.L(80.0f);
        int i10 = org.telegram.ui.ActionBar.m6.Fi;
        ShapeDrawable L2 = org.telegram.ui.ActionBar.m6.L(L, org.telegram.ui.ActionBar.m6.w0(i10, h6Var));
        org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i10);
        frameLayout.setBackground(L2);
        org.telegram.ui.ActionBar.t6.j(frameLayout, L2, M, null, h6Var);
        linearLayout.addView(frameLayout, c8.ma.t(80, 80, 1, 0, 16, 0, 16));
        org.telegram.ui.Components.rh0 rh0Var = new org.telegram.ui.Components.rh0(activity);
        rh0Var.setScaleType(ImageView.ScaleType.CENTER);
        int i11 = i7 == 0 ? 70 : 78;
        rh0Var.f(i7 == 0 ? R.raw.fragment_username : R.raw.fragment, i11, i11, null);
        rh0Var.d();
        rh0Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        if (i7 == 0) {
            rh0Var.setScaleX(0.86f);
            rh0Var.setScaleY(0.86f);
        } else {
            rh0Var.setTranslationY(org.telegram.messenger.g0.L(2.0f));
        }
        frameLayout.addView(rh0Var, c8.ma.r(-1, -1, 17));
        String q10 = tLObject instanceof TLRPC.User ? org.telegram.messenger.o10.q((TLRPC.User) tLObject) : tLObject instanceof TLRPC.Chat ? ((TLRPC.Chat) tLObject).title : "";
        String f10 = org.telegram.messenger.r1.i().f(tL_collectibleInfo.amount, tL_collectibleInfo.currency);
        String f11 = org.telegram.messenger.r1.i().f(tL_collectibleInfo.crypto_amount, tL_collectibleInfo.crypto_currency);
        if (i7 == 0) {
            String a02 = org.telegram.messenger.gd.a0(null, null, 2131750495, p5.c.k("@", str));
            str2 = org.telegram.messenger.gd.a0(null, null, 2131750497, org.telegram.messenger.gd.Q(tL_collectibleInfo.purchase_date), f11, TextUtils.isEmpty(f10) ? "" : a8.p0.p("(", f10, ")"));
            b10 = p5.c.m(org.telegram.messenger.mp.u1(org.telegram.messenger.j10.t0).X2, "/", str, new StringBuilder());
            str3 = a02;
        } else {
            if (i7 != 1) {
                return;
            }
            String a03 = org.telegram.messenger.gd.a0(null, null, 2131750499, pf.b.c().b("+" + str));
            String a04 = org.telegram.messenger.gd.a0(null, null, 2131750500, org.telegram.messenger.gd.Q(tL_collectibleInfo.purchase_date), f11, TextUtils.isEmpty(f10) ? "" : a8.p0.p("(", f10, ")"));
            b10 = pf.b.c().b("+" + str);
            str2 = a04;
            str3 = a03;
        }
        org.telegram.ui.Components.mp0 mp0Var = b10 != null ? new org.telegram.ui.Components.mp0(b10, i7, w2Var, h6Var) : null;
        SpannableStringBuilder T2 = org.telegram.messenger.g0.T2(str3, mp0Var);
        SpannableString spannableString = new SpannableString("TON");
        org.telegram.ui.Components.nq nqVar = new org.telegram.ui.Components.nq(R.drawable.mini_gram_16, 0);
        nqVar.d = false;
        nqVar.F = org.telegram.messenger.g0.L(13.0f);
        spannableString.setSpan(nqVar, 0, spannableString.length(), 33);
        SpannableStringBuilder K2 = org.telegram.messenger.g0.K2(org.telegram.messenger.g0.W2(str2), spannableString, "TON");
        org.telegram.ui.Components.m80 m80Var = new org.telegram.ui.Components.m80(activity, null);
        m80Var.setTypeface(org.telegram.messenger.g0.o());
        m80Var.setGravity(17);
        int i12 = org.telegram.ui.ActionBar.m6.j5;
        org.telegram.ui.ActionBar.t6.U(m80Var, i12, h6Var);
        org.telegram.ui.ActionBar.t6.G(m80Var, org.telegram.ui.ActionBar.m6.o6, h6Var);
        m80Var.setTextSize(1, 16.0f);
        m80Var.setText(T2);
        linearLayout.addView(m80Var, c8.ma.t(-1, -2, 1, 42, 0, 42, 0));
        FrameLayout frameLayout2 = new FrameLayout(activity);
        int L3 = org.telegram.messenger.g0.L(28.0f);
        int L4 = org.telegram.messenger.g0.L(28.0f);
        int i13 = org.telegram.ui.ActionBar.m6.Ti;
        ShapeDrawable e02 = org.telegram.ui.ActionBar.m6.e0(L3, L4, org.telegram.ui.ActionBar.m6.w0(i13, h6Var));
        org.telegram.ui.ActionBar.p6 M2 = org.telegram.ui.ActionBar.t6.M(i13);
        frameLayout2.setBackground(e02);
        org.telegram.ui.ActionBar.t6.j(frameLayout2, e02, M2, null, h6Var);
        org.telegram.ui.Components.q9 q9Var = new org.telegram.ui.Components.q9(activity);
        q9Var.setRoundRadius(org.telegram.messenger.g0.L(28.0f));
        org.telegram.ui.Components.b9 b9Var = new org.telegram.ui.Components.b9((org.telegram.ui.ActionBar.h6) null);
        b9Var.l(tLObject);
        q9Var.f(tLObject, b9Var);
        frameLayout2.addView(q9Var, c8.ma.e(28, 28, 51));
        TextView textView = new TextView(activity);
        org.telegram.ui.ActionBar.t6.U(textView, i12, h6Var);
        textView.setTextSize(1, 13.0f);
        textView.setSingleLine();
        textView.setText(org.telegram.messenger.j6.m(q10, textView.getPaint().getFontMetricsInt(), false, null, 0));
        frameLayout2.addView(textView, c8.ma.d(-2, -2.0f, 19, 37.0f, 0.0f, 10.0f, 0.0f));
        linearLayout.addView(frameLayout2, c8.ma.t(-2, 28, 1, 42, 10, 42, 18));
        TextView textView2 = new TextView(activity);
        textView2.setGravity(17);
        org.telegram.ui.ActionBar.t6.U(textView2, i12, h6Var);
        textView2.setTextSize(1, 14.0f);
        textView2.setText(K2);
        linearLayout.addView(textView2, c8.ma.t(-1, -2, 1, 32, 0, 32, 19));
        hi.e eVar = new hi.e(activity, h6Var, true);
        eVar.setRoundRadius(24);
        eVar.i(org.telegram.messenger.gd.N0(2131750496, null), false, true);
        eVar.setOnClickListener(new org.telegram.ui.Components.q31(16, activity, tL_collectibleInfo));
        linearLayout.addView(eVar, c8.ma.k(6.0f, 0.0f, 6.0f, 0.0f, -1, 48));
        if (mp0Var != null) {
            hi.e eVar2 = new hi.e(activity, h6Var, true);
            eVar2.setRoundRadius(24);
            eVar2.e();
            eVar2.i(org.telegram.messenger.gd.N0(i7 == 0 ? 2131750498 : 2131750501, null), false, true);
            eVar2.setOnClickListener(new org.telegram.ui.Components.q31(17, mp0Var, w2Var));
            linearLayout.addView(eVar2, c8.ma.k(6.0f, 6.0f, 6.0f, 0.0f, -1, 48));
        }
        w2Var.O = linearLayout;
        w2Var.show();
    }
}
