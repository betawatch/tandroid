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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public abstract class i10 {
    /* JADX WARN: Removed duplicated region for block: B:15:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x013a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void a(Activity activity, int i10, String str, TLObject tLObject, TL_fragment.TL_collectibleInfo tL_collectibleInfo, org.telegram.ui.ActionBar.p6 p6Var) {
        String str2;
        String str3;
        org.telegram.ui.ActionBar.z2 z2Var;
        String a02;
        String b10;
        String str4;
        String str5;
        org.telegram.ui.ActionBar.p6 p6Var2;
        org.telegram.ui.Components.c11 c11Var;
        org.telegram.ui.ActionBar.z2 z2Var2 = new org.telegram.ui.ActionBar.z2(1, (Context) activity, p6Var, false);
        z2Var2.Q(org.telegram.ui.ActionBar.t6.h5);
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(org.telegram.messenger.i0.L(16.0f), 0, org.telegram.messenger.i0.L(16.0f), 0);
        FrameLayout frameLayout = new FrameLayout(activity);
        int L = org.telegram.messenger.i0.L(80.0f);
        int i11 = org.telegram.ui.ActionBar.t6.Ci;
        ShapeDrawable L2 = org.telegram.ui.ActionBar.t6.L(L, org.telegram.ui.ActionBar.t6.w0(i11, p6Var));
        org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i11);
        frameLayout.setBackground(L2);
        org.telegram.ui.ActionBar.a7.k(frameLayout, L2, N, null, p6Var);
        linearLayout.addView(frameLayout, w7.b6.t(80, 80, 1, 0, 16, 0, 16));
        org.telegram.ui.Components.ei0 ei0Var = new org.telegram.ui.Components.ei0(activity);
        ei0Var.setScaleType(ImageView.ScaleType.CENTER);
        int i12 = i10 == 0 ? 70 : 78;
        ei0Var.f(i10 == 0 ? R.raw.fragment_username : R.raw.fragment, i12, i12, null);
        ei0Var.d();
        ei0Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        if (i10 == 0) {
            ei0Var.setScaleX(0.86f);
            ei0Var.setScaleY(0.86f);
        } else {
            ei0Var.setTranslationY(org.telegram.messenger.i0.L(2.0f));
        }
        frameLayout.addView(ei0Var, w7.b6.r(-1, -1, 17));
        if (tLObject instanceof TLRPC.User) {
            str3 = org.telegram.messenger.h20.p((TLRPC.User) tLObject);
        } else {
            if (!(tLObject instanceof TLRPC.Chat)) {
                str2 = "";
                String f7 = org.telegram.messenger.u1.i().f(tL_collectibleInfo.amount, tL_collectibleInfo.currency);
                String f10 = org.telegram.messenger.u1.i().f(tL_collectibleInfo.crypto_amount, tL_collectibleInfo.crypto_currency);
                if (i10 != 0) {
                    str4 = org.telegram.messenger.cd.a0(null, null, 2131750521, sc.e.h("@", str));
                    z2Var = z2Var2;
                    a02 = org.telegram.messenger.cd.a0(null, null, 2131750523, org.telegram.messenger.cd.Q(tL_collectibleInfo.purchase_date), f10, TextUtils.isEmpty(f7) ? "" : a1.g.n("(", f7, ")"));
                    b10 = a1.g.o(org.telegram.messenger.vp.r1(org.telegram.messenger.d20.s0).U2, "/", str, new StringBuilder());
                } else {
                    z2Var = z2Var2;
                    if (i10 != 1) {
                        return;
                    }
                    String a03 = org.telegram.messenger.cd.a0(null, null, 2131750525, af.b.c().b("+" + str));
                    a02 = org.telegram.messenger.cd.a0(null, null, 2131750526, org.telegram.messenger.cd.Q(tL_collectibleInfo.purchase_date), f10, TextUtils.isEmpty(f7) ? "" : a1.g.n("(", f7, ")"));
                    b10 = af.b.c().b("+" + str);
                    str4 = a03;
                }
                String str6 = a02;
                str5 = b10;
                if (str5 == null) {
                    p6Var2 = p6Var;
                    c11Var = new org.telegram.ui.Components.c11(str5, i10, z2Var, p6Var2, 2);
                } else {
                    p6Var2 = p6Var;
                    c11Var = null;
                }
                SpannableStringBuilder T2 = org.telegram.messenger.i0.T2(str4, c11Var);
                SpannableString spannableString = new SpannableString("TON");
                org.telegram.ui.Components.dq dqVar = new org.telegram.ui.Components.dq(R.drawable.mini_gram_16, 0);
                dqVar.d = false;
                dqVar.E = org.telegram.messenger.i0.L(13.0f);
                spannableString.setSpan(dqVar, 0, spannableString.length(), 33);
                SpannableStringBuilder J2 = org.telegram.messenger.i0.J2(org.telegram.messenger.i0.W2(str6), spannableString, "TON");
                org.telegram.ui.Components.p80 p80Var = new org.telegram.ui.Components.p80(activity, null);
                p80Var.setTypeface(org.telegram.messenger.i0.o());
                p80Var.setGravity(17);
                int i13 = org.telegram.ui.ActionBar.t6.j5;
                org.telegram.ui.ActionBar.a7.V(p80Var, i13, p6Var2);
                org.telegram.ui.ActionBar.a7.H(p80Var, org.telegram.ui.ActionBar.t6.o6, p6Var2);
                p80Var.setTextSize(1, 16.0f);
                p80Var.setText(T2);
                linearLayout.addView(p80Var, w7.b6.t(-1, -2, 1, 42, 0, 42, 0));
                FrameLayout frameLayout2 = new FrameLayout(activity);
                int L3 = org.telegram.messenger.i0.L(28.0f);
                int L4 = org.telegram.messenger.i0.L(28.0f);
                int i14 = org.telegram.ui.ActionBar.t6.Qi;
                ShapeDrawable e02 = org.telegram.ui.ActionBar.t6.e0(L3, L4, org.telegram.ui.ActionBar.t6.w0(i14, p6Var2));
                org.telegram.ui.ActionBar.w6 N2 = org.telegram.ui.ActionBar.a7.N(i14);
                frameLayout2.setBackground(e02);
                org.telegram.ui.ActionBar.a7.k(frameLayout2, e02, N2, null, p6Var2);
                org.telegram.ui.Components.g9 g9Var = new org.telegram.ui.Components.g9(activity);
                g9Var.setRoundRadius(org.telegram.messenger.i0.L(28.0f));
                org.telegram.ui.Components.r8 r8Var = new org.telegram.ui.Components.r8((org.telegram.ui.ActionBar.p6) null);
                r8Var.l(tLObject);
                g9Var.e(tLObject, r8Var);
                frameLayout2.addView(g9Var, w7.b6.e(28, 28, 51));
                TextView textView = new TextView(activity);
                org.telegram.ui.ActionBar.a7.V(textView, i13, p6Var2);
                textView.setTextSize(1, 13.0f);
                textView.setSingleLine();
                textView.setText(org.telegram.messenger.k6.m(str2, textView.getPaint().getFontMetricsInt(), false, null, 0));
                frameLayout2.addView(textView, w7.b6.d(-2, -2.0f, 19, 37.0f, 0.0f, 10.0f, 0.0f));
                linearLayout.addView(frameLayout2, w7.b6.t(-2, 28, 1, 42, 10, 42, 18));
                TextView textView2 = new TextView(activity);
                textView2.setGravity(17);
                org.telegram.ui.ActionBar.a7.V(textView2, i13, p6Var2);
                textView2.setTextSize(1, 14.0f);
                textView2.setText(J2);
                linearLayout.addView(textView2, w7.b6.t(-1, -2, 1, 32, 0, 32, 19));
                vh.d dVar = new vh.d(activity, p6Var2, true);
                dVar.setRoundRadius(24);
                dVar.i(org.telegram.messenger.cd.L0(2131750522, null), false, true);
                dVar.setOnClickListener(new wu(7, activity, tL_collectibleInfo));
                linearLayout.addView(dVar, w7.b6.k(6.0f, 0.0f, 6.0f, 0.0f, -1, 48));
                if (c11Var != null) {
                    vh.d dVar2 = new vh.d(activity, p6Var2, true);
                    dVar2.setRoundRadius(24);
                    dVar2.e();
                    dVar2.i(org.telegram.messenger.cd.L0(i10 == 0 ? 2131750524 : 2131750527, null), false, true);
                    dVar2.setOnClickListener(new wu(8, c11Var, z2Var));
                    linearLayout.addView(dVar2, w7.b6.k(6.0f, 6.0f, 6.0f, 0.0f, -1, 48));
                }
                z2Var.N = linearLayout;
                z2Var.show();
            }
            str3 = ((TLRPC.Chat) tLObject).title;
        }
        str2 = str3;
        String f72 = org.telegram.messenger.u1.i().f(tL_collectibleInfo.amount, tL_collectibleInfo.currency);
        String f102 = org.telegram.messenger.u1.i().f(tL_collectibleInfo.crypto_amount, tL_collectibleInfo.crypto_currency);
        if (i10 != 0) {
        }
        String str62 = a02;
        str5 = b10;
        if (str5 == null) {
        }
        SpannableStringBuilder T22 = org.telegram.messenger.i0.T2(str4, c11Var);
        SpannableString spannableString2 = new SpannableString("TON");
        org.telegram.ui.Components.dq dqVar2 = new org.telegram.ui.Components.dq(R.drawable.mini_gram_16, 0);
        dqVar2.d = false;
        dqVar2.E = org.telegram.messenger.i0.L(13.0f);
        spannableString2.setSpan(dqVar2, 0, spannableString2.length(), 33);
        SpannableStringBuilder J22 = org.telegram.messenger.i0.J2(org.telegram.messenger.i0.W2(str62), spannableString2, "TON");
        org.telegram.ui.Components.p80 p80Var2 = new org.telegram.ui.Components.p80(activity, null);
        p80Var2.setTypeface(org.telegram.messenger.i0.o());
        p80Var2.setGravity(17);
        int i132 = org.telegram.ui.ActionBar.t6.j5;
        org.telegram.ui.ActionBar.a7.V(p80Var2, i132, p6Var2);
        org.telegram.ui.ActionBar.a7.H(p80Var2, org.telegram.ui.ActionBar.t6.o6, p6Var2);
        p80Var2.setTextSize(1, 16.0f);
        p80Var2.setText(T22);
        linearLayout.addView(p80Var2, w7.b6.t(-1, -2, 1, 42, 0, 42, 0));
        FrameLayout frameLayout22 = new FrameLayout(activity);
        int L32 = org.telegram.messenger.i0.L(28.0f);
        int L42 = org.telegram.messenger.i0.L(28.0f);
        int i142 = org.telegram.ui.ActionBar.t6.Qi;
        ShapeDrawable e022 = org.telegram.ui.ActionBar.t6.e0(L32, L42, org.telegram.ui.ActionBar.t6.w0(i142, p6Var2));
        org.telegram.ui.ActionBar.w6 N22 = org.telegram.ui.ActionBar.a7.N(i142);
        frameLayout22.setBackground(e022);
        org.telegram.ui.ActionBar.a7.k(frameLayout22, e022, N22, null, p6Var2);
        org.telegram.ui.Components.g9 g9Var2 = new org.telegram.ui.Components.g9(activity);
        g9Var2.setRoundRadius(org.telegram.messenger.i0.L(28.0f));
        org.telegram.ui.Components.r8 r8Var2 = new org.telegram.ui.Components.r8((org.telegram.ui.ActionBar.p6) null);
        r8Var2.l(tLObject);
        g9Var2.e(tLObject, r8Var2);
        frameLayout22.addView(g9Var2, w7.b6.e(28, 28, 51));
        TextView textView3 = new TextView(activity);
        org.telegram.ui.ActionBar.a7.V(textView3, i132, p6Var2);
        textView3.setTextSize(1, 13.0f);
        textView3.setSingleLine();
        textView3.setText(org.telegram.messenger.k6.m(str2, textView3.getPaint().getFontMetricsInt(), false, null, 0));
        frameLayout22.addView(textView3, w7.b6.d(-2, -2.0f, 19, 37.0f, 0.0f, 10.0f, 0.0f));
        linearLayout.addView(frameLayout22, w7.b6.t(-2, 28, 1, 42, 10, 42, 18));
        TextView textView22 = new TextView(activity);
        textView22.setGravity(17);
        org.telegram.ui.ActionBar.a7.V(textView22, i132, p6Var2);
        textView22.setTextSize(1, 14.0f);
        textView22.setText(J22);
        linearLayout.addView(textView22, w7.b6.t(-1, -2, 1, 32, 0, 32, 19));
        vh.d dVar3 = new vh.d(activity, p6Var2, true);
        dVar3.setRoundRadius(24);
        dVar3.i(org.telegram.messenger.cd.L0(2131750522, null), false, true);
        dVar3.setOnClickListener(new wu(7, activity, tL_collectibleInfo));
        linearLayout.addView(dVar3, w7.b6.k(6.0f, 0.0f, 6.0f, 0.0f, -1, 48));
        if (c11Var != null) {
        }
        z2Var.N = linearLayout;
        z2Var.show();
    }
}
