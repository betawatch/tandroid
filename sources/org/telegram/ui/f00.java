package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.ShapeDrawable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_fragment;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public abstract class f00 {
    public static void a(Activity activity, int i3, String str, TLObject tLObject, TL_fragment.TL_collectibleInfo tL_collectibleInfo, org.telegram.ui.ActionBar.e6 e6Var) {
        String b10;
        String str2;
        String str3;
        org.telegram.ui.ActionBar.t2 t2Var = new org.telegram.ui.ActionBar.t2(1, (Context) activity, e6Var, false);
        t2Var.P(org.telegram.ui.ActionBar.k6.h5);
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), 0);
        FrameLayout frameLayout = new FrameLayout(activity);
        int L = org.telegram.messenger.g0.L(80.0f);
        int i10 = org.telegram.ui.ActionBar.k6.Ci;
        ShapeDrawable L2 = org.telegram.ui.ActionBar.k6.L(L, org.telegram.ui.ActionBar.k6.w0(i10, e6Var));
        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i10);
        frameLayout.setBackground(L2);
        org.telegram.ui.ActionBar.r6.k(frameLayout, L2, N, null, e6Var);
        linearLayout.addView(frameLayout, b8.mf.t(80, 80, 1, 0, 16, 0, 16));
        org.telegram.ui.Components.fh0 fh0Var = new org.telegram.ui.Components.fh0(activity);
        fh0Var.setScaleType(ImageView.ScaleType.CENTER);
        int i11 = i3 == 0 ? 70 : 78;
        fh0Var.f(i3 == 0 ? R.raw.fragment_username : R.raw.fragment, i11, i11, null);
        fh0Var.d();
        fh0Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        if (i3 == 0) {
            fh0Var.setScaleX(0.86f);
            fh0Var.setScaleY(0.86f);
        } else {
            fh0Var.setTranslationY(org.telegram.messenger.g0.L(2.0f));
        }
        frameLayout.addView(fh0Var, b8.mf.r(-1, -1, 17));
        String p10 = tLObject instanceof TLRPC.User ? org.telegram.messenger.l10.p((TLRPC.User) tLObject) : tLObject instanceof TLRPC.Chat ? ((TLRPC.Chat) tLObject).title : "";
        String f10 = org.telegram.messenger.r1.i().f(tL_collectibleInfo.amount, tL_collectibleInfo.currency);
        String f11 = org.telegram.messenger.r1.i().f(tL_collectibleInfo.crypto_amount, tL_collectibleInfo.crypto_currency);
        if (i3 == 0) {
            String a02 = org.telegram.messenger.bd.a0(null, null, 2131750520, t4.c.f("@", str));
            str2 = org.telegram.messenger.bd.a0(null, null, 2131750522, org.telegram.messenger.bd.Q(tL_collectibleInfo.purchase_date), f11, TextUtils.isEmpty(f10) ? "" : a1.g.q("(", f10, ")"));
            b10 = org.telegram.ui.Cells.f1.r(org.telegram.messenger.hp.s1(org.telegram.messenger.h10.t0).V2, "/", str, new StringBuilder());
            str3 = a02;
        } else {
            if (i3 != 1) {
                return;
            }
            String a03 = org.telegram.messenger.bd.a0(null, null, 2131750524, mf.b.c().b("+" + str));
            String a04 = org.telegram.messenger.bd.a0(null, null, 2131750525, org.telegram.messenger.bd.Q(tL_collectibleInfo.purchase_date), f11, TextUtils.isEmpty(f10) ? "" : a1.g.q("(", f10, ")"));
            b10 = mf.b.c().b("+" + str);
            str2 = a04;
            str3 = a03;
        }
        org.telegram.ui.Components.zo0 zo0Var = b10 != null ? new org.telegram.ui.Components.zo0(b10, i3, t2Var, e6Var) : null;
        SpannableStringBuilder U2 = org.telegram.messenger.g0.U2(str3, zo0Var);
        SpannableString spannableString = new SpannableString("TON");
        org.telegram.ui.Components.wp wpVar = new org.telegram.ui.Components.wp(R.drawable.mini_gram_16, 0);
        wpVar.d = false;
        wpVar.F = org.telegram.messenger.g0.L(13.0f);
        spannableString.setSpan(wpVar, 0, spannableString.length(), 33);
        SpannableStringBuilder K2 = org.telegram.messenger.g0.K2(org.telegram.messenger.g0.X2(str2), spannableString, "TON");
        org.telegram.ui.Components.s70 s70Var = new org.telegram.ui.Components.s70(activity, null);
        s70Var.setTypeface(org.telegram.messenger.g0.o());
        s70Var.setGravity(17);
        int i12 = org.telegram.ui.ActionBar.k6.j5;
        org.telegram.ui.ActionBar.r6.V(s70Var, i12, e6Var);
        org.telegram.ui.ActionBar.r6.H(s70Var, org.telegram.ui.ActionBar.k6.o6, e6Var);
        s70Var.setTextSize(1, 16.0f);
        s70Var.setText(U2);
        linearLayout.addView(s70Var, b8.mf.t(-1, -2, 1, 42, 0, 42, 0));
        FrameLayout frameLayout2 = new FrameLayout(activity);
        int L3 = org.telegram.messenger.g0.L(28.0f);
        int L4 = org.telegram.messenger.g0.L(28.0f);
        int i13 = org.telegram.ui.ActionBar.k6.Qi;
        ShapeDrawable e02 = org.telegram.ui.ActionBar.k6.e0(L3, L4, org.telegram.ui.ActionBar.k6.w0(i13, e6Var));
        org.telegram.ui.ActionBar.n6 N2 = org.telegram.ui.ActionBar.r6.N(i13);
        frameLayout2.setBackground(e02);
        org.telegram.ui.ActionBar.r6.k(frameLayout2, e02, N2, null, e6Var);
        org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9(activity);
        k9Var.setRoundRadius(org.telegram.messenger.g0.L(28.0f));
        org.telegram.ui.Components.u8 u8Var = new org.telegram.ui.Components.u8((org.telegram.ui.ActionBar.e6) null);
        u8Var.l(tLObject);
        k9Var.e(tLObject, u8Var);
        frameLayout2.addView(k9Var, b8.mf.e(28, 28, 51));
        TextView textView = new TextView(activity);
        org.telegram.ui.ActionBar.r6.V(textView, i12, e6Var);
        textView.setTextSize(1, 13.0f);
        textView.setSingleLine();
        textView.setText(org.telegram.messenger.i6.m(p10, textView.getPaint().getFontMetricsInt(), false, null, 0));
        frameLayout2.addView(textView, b8.mf.d(-2, -2.0f, 19, 37.0f, 0.0f, 10.0f, 0.0f));
        linearLayout.addView(frameLayout2, b8.mf.t(-2, 28, 1, 42, 10, 42, 18));
        TextView textView2 = new TextView(activity);
        textView2.setGravity(17);
        org.telegram.ui.ActionBar.r6.V(textView2, i12, e6Var);
        textView2.setTextSize(1, 14.0f);
        textView2.setText(K2);
        linearLayout.addView(textView2, b8.mf.t(-1, -2, 1, 32, 0, 32, 19));
        gi.d dVar = new gi.d(activity, e6Var, true);
        dVar.setRoundRadius(24);
        dVar.i(org.telegram.messenger.bd.M0(2131750521, null), false, true);
        dVar.setOnClickListener(new org.telegram.ui.Components.ux0(20, (Object) activity, (Object) tL_collectibleInfo));
        linearLayout.addView(dVar, b8.mf.k(6.0f, 0.0f, 6.0f, 0.0f, -1, 48));
        if (zo0Var != null) {
            gi.d dVar2 = new gi.d(activity, e6Var, true);
            dVar2.setRoundRadius(24);
            dVar2.e();
            dVar2.i(org.telegram.messenger.bd.M0(i3 == 0 ? 2131750523 : 2131750526, null), false, true);
            dVar2.setOnClickListener(new org.telegram.ui.Components.ux0(21, (KeyEvent.Callback) t2Var, (Object) zo0Var));
            linearLayout.addView(dVar2, b8.mf.k(6.0f, 6.0f, 6.0f, 0.0f, -1, 48));
        }
        t2Var.O = linearLayout;
        t2Var.show();
    }
}
