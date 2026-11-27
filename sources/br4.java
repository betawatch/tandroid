// default package

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

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public abstract class br4 {
    public static void a(Activity activity, int i, String str, TLObject tLObject, TL_fragment.TL_collectibleInfo tL_collectibleInfo, vnb vnbVar) {
        int i2;
        int i3;
        String e;
        String str2;
        String str3;
        nx0 nx0Var = new nx0(1, vnbVar, (Context) activity, false);
        nx0Var.L(aob.h5);
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(hl.L(16.0f), 0, hl.L(16.0f), 0);
        FrameLayout frameLayout = new FrameLayout(activity);
        int L = hl.L(80.0f);
        int i4 = aob.Fi;
        ShapeDrawable K = aob.K(L, aob.v0(i4, vnbVar));
        uob M = yob.M(i4);
        frameLayout.setBackground(K);
        yob.j(frameLayout, K, M, null, vnbVar);
        linearLayout.addView(frameLayout, tre.t(80, 80, 1, 0, 16, 0, 16));
        e29 e29Var = new e29(activity);
        e29Var.setScaleType(ImageView.ScaleType.CENTER);
        if (i == 0) {
            i2 = 70;
            i3 = R.raw.fragment_username;
        } else {
            i2 = 78;
            i3 = R.raw.fragment;
        }
        e29Var.f(i3, i2, i2, null);
        e29Var.d();
        e29Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        if (i == 0) {
            e29Var.setScaleX(0.86f);
            e29Var.setScaleY(0.86f);
        } else {
            e29Var.setTranslationY(hl.L(2.0f));
        }
        frameLayout.addView(e29Var, tre.r(-1, -1, 17));
        String r = tLObject instanceof TLRPC.User ? lbc.r((TLRPC.User) tLObject) : tLObject instanceof TLRPC.Chat ? ((TLRPC.Chat) tLObject).title : "";
        String e2 = di0.h().e(tL_collectibleInfo.amount, tL_collectibleInfo.currency);
        String str4 = r;
        String e3 = di0.h().e(tL_collectibleInfo.crypto_amount, tL_collectibleInfo.crypto_currency);
        if (i == 0) {
            String a0 = ob6.a0(null, null, 2131750473, c00.i("@", str));
            str2 = ob6.a0(null, null, 2131750475, ob6.Q(tL_collectibleInfo.purchase_date), e3, TextUtils.isEmpty(e2) ? "" : qd4.y("(", e2, ")"));
            e = qu6.o(uc7.s1(yac.t0).N2, "/", str, new StringBuilder());
            str3 = a0;
        } else {
            if (i != 1) {
                return;
            }
            String a02 = ob6.a0(null, null, 2131750477, f78.f().e("+" + str));
            String a03 = ob6.a0(null, null, 2131750478, ob6.Q(tL_collectibleInfo.purchase_date), e3, TextUtils.isEmpty(e2) ? "" : qd4.y("(", e2, ")"));
            e = f78.f().e("+" + str);
            str2 = a03;
            str3 = a02;
        }
        lg lgVar = e != null ? new lg(e, i, nx0Var, vnbVar) : null;
        SpannableStringBuilder N2 = hl.N2(str3, -1, 0, lgVar, null);
        SpannableString spannableString = new SpannableString("TON");
        wm2 wm2Var = new wm2(R.drawable.mini_gram_16, 0);
        wm2Var.d = false;
        wm2Var.F = hl.L(13.0f);
        spannableString.setSpan(wm2Var, 0, spannableString.length(), 33);
        SpannableStringBuilder G2 = hl.G2(hl.S2(str2), spannableString, "TON");
        p66 p66Var = new p66(activity, null);
        p66Var.setTypeface(hl.o());
        p66Var.setGravity(17);
        int i5 = aob.j5;
        yob.X(p66Var, i5, vnbVar);
        yob.G(p66Var, aob.o6, vnbVar);
        p66Var.setTextSize(1, 16.0f);
        p66Var.setText(N2);
        linearLayout.addView(p66Var, tre.t(-1, -2, 1, 42, 0, 42, 0));
        FrameLayout frameLayout2 = new FrameLayout(activity);
        int L2 = hl.L(28.0f);
        int L3 = hl.L(28.0f);
        int i6 = aob.Ti;
        ShapeDrawable c0 = aob.c0(L2, L3, aob.v0(i6, vnbVar));
        uob M2 = yob.M(i6);
        frameLayout2.setBackground(c0);
        yob.j(frameLayout2, c0, M2, null, vnbVar);
        de0 de0Var = new de0(activity);
        de0Var.setRoundRadius(hl.L(28.0f));
        rb0 rb0Var = new rb0((vnb) null);
        rb0Var.k(tLObject);
        de0Var.f(tLObject, rb0Var);
        frameLayout2.addView(de0Var, tre.e(28, 28, 51));
        TextView textView = new TextView(activity);
        yob.X(textView, i5, vnbVar);
        textView.setTextSize(1, 13.0f);
        textView.setSingleLine();
        textView.setText(pv3.m(str4, textView.getPaint().getFontMetricsInt(), false, null, 0));
        frameLayout2.addView(textView, tre.d(-2, -2.0f, 19, 37.0f, 0.0f, 10.0f, 0.0f));
        linearLayout.addView(frameLayout2, tre.t(-2, 28, 1, 42, 10, 42, 18));
        TextView textView2 = new TextView(activity);
        textView2.setGravity(17);
        yob.X(textView2, i5, vnbVar);
        textView2.setTextSize(1, 14.0f);
        textView2.setText(G2);
        linearLayout.addView(textView2, tre.t(-1, -2, 1, 32, 0, 32, 19));
        c51 c51Var = new c51(vnbVar, activity, true);
        c51Var.setRoundRadius(24);
        c51Var.i(ob6.M0(2131750474, null), false, true);
        c51Var.setOnClickListener(new je3(activity, tL_collectibleInfo, (byte) 15));
        linearLayout.addView(c51Var, tre.k(6.0f, 0.0f, 6.0f, 0.0f, -1, 48));
        if (lgVar != null) {
            c51 c51Var2 = new c51(vnbVar, activity, true);
            c51Var2.setRoundRadius(24);
            c51Var2.e();
            c51Var2.i(ob6.M0(i == 0 ? 2131750476 : 2131750479, null), false, true);
            c51Var2.setOnClickListener(new je3(lgVar, nx0Var, (byte) 16));
            linearLayout.addView(c51Var2, tre.k(6.0f, 6.0f, 6.0f, 0.0f, -1, 48));
        }
        nx0Var.O = linearLayout;
        nx0Var.show();
    }
}
