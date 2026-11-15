package ki;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import bi.x5;
import bi.z4;
import c8.ja;
import c8.na;
import di.lb;
import di.v9;
import hi.p5;
import hi.q4;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hd;
import org.telegram.messenger.i20;
import org.telegram.messenger.is;
import org.telegram.messenger.k5;
import org.telegram.messenger.m5;
import org.telegram.messenger.np;
import org.telegram.messenger.ns;
import org.telegram.messenger.q10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.Components.b41;
import org.telegram.ui.Components.bn;
import org.telegram.ui.Components.eq;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.i9;
import org.telegram.ui.Components.m60;
import org.telegram.ui.Components.p41;
import org.telegram.ui.Components.t8;
import org.telegram.ui.Components.y31;
import org.telegram.ui.Components.z70;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.p00;
import org.telegram.ui.rv;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes4.dex */
public final class n3 extends p00 implements is {
    public final long S;
    public FrameLayout T;
    public vg.m U;
    public bn V;
    public x5 W;

    public n3(long j3) {
        this.S = j3;
        this.N = true;
        this.M = org.telegram.messenger.g0.L(60.0f);
    }

    public static void A0(n3 n3Var, Context context, TLRPC.User user, TL_payments.connectedBotStarRef connectedbotstarref) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, n3Var.resourceProvider);
        String M0 = hd.M0(2131749007, null);
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
        t1Var.S = M0;
        t1Var.U = org.telegram.messenger.g0.X2(hd.a0(null, null, 2131749006, q10.p(user)));
        alertDialog$Builder.k(hd.M0(2131749005, null), new ab.g(26, n3Var, connectedbotstarref));
        alertDialog$Builder.h(hd.M0(2131752589, null), null);
        alertDialog$Builder.d(-1);
        alertDialog$Builder.p();
    }

    public static void B0(n3 n3Var, TL_payments.connectedBotStarRef connectedbotstarref) {
        org.telegram.ui.ActionBar.t1 t1Var = new org.telegram.ui.ActionBar.t1(3, n3Var.getParentActivity(), null);
        t1Var.r(200L);
        TL_payments.editConnectedStarRefBot editconnectedstarrefbot = new TL_payments.editConnectedStarRefBot();
        editconnectedstarrefbot.link = connectedbotstarref.url;
        editconnectedstarrefbot.peer = np.s1(n3Var.currentAccount).j1(n3Var.S);
        editconnectedstarrefbot.revoked = true;
        n3Var.getConnectionsManager().sendRequest(editconnectedstarrefbot, new bi.v2(23, n3Var, t1Var));
    }

    public static /* synthetic */ void C0(n3 n3Var, Context context, int i7) {
        x5 x5Var = n3Var.W;
        if (x5Var == null) {
            return;
        }
        Object obj = x5Var.G(i7).G;
        if (obj instanceof TL_payments.starRefProgram) {
            J0(context, n3Var.currentAccount, (TL_payments.starRefProgram) obj, n3Var.S, n3Var.resourceProvider, false);
        } else if (obj instanceof TL_payments.connectedBotStarRef) {
            K0(context, n3Var.currentAccount, (TL_payments.connectedBotStarRef) obj, n3Var.S, n3Var.resourceProvider);
        }
    }

    public static void D0(n3 n3Var, TLObject tLObject, org.telegram.ui.ActionBar.t1 t1Var) {
        long j3 = n3Var.S;
        if (tLObject instanceof TL_payments.connectedStarRefBots) {
            TL_payments.connectedStarRefBots connectedstarrefbots = (TL_payments.connectedStarRefBots) tLObject;
            di.b0 d = di.e0.g(n3Var.currentAccount).d(j3);
            ArrayList arrayList = d.e;
            int i7 = d.a;
            np.s1(i7).Y3(connectedstarrefbots.users, false);
            for (int i10 = 0; i10 < connectedstarrefbots.connected_bots.size(); i10++) {
                TL_payments.connectedBotStarRef connectedbotstarref = connectedstarrefbots.connected_bots.get(i10);
                int i11 = 0;
                while (true) {
                    if (i11 >= arrayList.size()) {
                        break;
                    }
                    if (((TL_payments.connectedBotStarRef) arrayList.get(i11)).bot_id != connectedbotstarref.bot_id) {
                        i11++;
                    } else if (connectedbotstarref.revoked) {
                        arrayList.remove(i11);
                        d.c = Math.max(d.c - 1, 0);
                    } else {
                        arrayList.set(i11, connectedbotstarref);
                    }
                }
            }
            ns.f(i7).k(ns.L3, Long.valueOf(d.b));
            d.a();
            di.c0 e10 = di.e0.g(n3Var.currentAccount).e(j3);
            e10.c = 0;
            e10.d = false;
            e10.i = false;
            e10.f = 0L;
            e10.j = null;
            e10.h = false;
            e10.a();
            n3Var.W.O(true);
        }
        t1Var.dismiss();
    }

    public static boolean E0(n3 n3Var, Context context, View view, int i7) {
        x5 x5Var = n3Var.W;
        if (x5Var != null) {
            Object obj = x5Var.G(i7).G;
            if (obj instanceof TL_payments.connectedBotStarRef) {
                TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) obj;
                TLRPC.User a22 = np.s1(n3Var.currentAccount).a2(Long.valueOf(connectedbotstarref.bot_id));
                m60 H = m60.H(n3Var, view);
                H.l(R.drawable.msg_bot, hd.M0(2131746708, null), new kg.t1(7, n3Var, a22), a22.bot_has_main_app);
                H.l(R.drawable.msg_bot, hd.M0(2131752912, null), new kg.t1(8, n3Var, connectedbotstarref), !a22.bot_has_main_app);
                H.c(R.drawable.msg_link2, hd.M0(2131751762, null), new n(n3Var, connectedbotstarref, a22, 3), false);
                H.m(R.drawable.msg_leave, new ai.r(n3Var, context, a22, connectedbotstarref, 24), hd.M0(2131749005, null), !connectedbotstarref.revoked, true);
                H.V(5);
                H.Z();
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0481  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x060e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x056c  */
    /* JADX WARN: Type inference failed for: r15v24 */
    /* JADX WARN: Type inference failed for: r15v28, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r15v36 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void J0(Context context, int i7, final TL_payments.starRefProgram starrefprogram, long j3, e6 e6Var, boolean z10) {
        long[] jArr;
        String str;
        ?? r15;
        String G;
        i9 i9Var;
        TextView textView;
        LinearLayout linearLayout;
        if (starrefprogram == null || context == null) {
            return;
        }
        final org.telegram.ui.ActionBar.u2 k10 = k5.k(1, context, e6Var, false);
        long[] jArr2 = {j3};
        TLRPC.User a22 = np.s1(i7).a2(Long.valueOf(starrefprogram.bot_id));
        LinearLayout f10 = k5.f(context, 1);
        f10.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(8.0f));
        f10.setClipChildren(false);
        f10.setClipToPadding(false);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setClipToPadding(false);
        frameLayout.setClipChildren(false);
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setClipToPadding(false);
        frameLayout2.setClipChildren(false);
        frameLayout.addView(frameLayout2, ja.d(60, 60.0f, 19, 0.0f, 0.0f, 0.0f, 0.0f));
        i9 i9Var2 = new i9(context);
        i9Var2.setRoundRadius(org.telegram.messenger.g0.L(30.0f));
        t8 t8Var = new t8((e6) null);
        t8Var.r(a22);
        i9Var2.f(a22, t8Var);
        na.a(i9Var2);
        frameLayout2.addView(i9Var2, ja.e(60, 60, ns.E1));
        if (starrefprogram.daily_revenue_per_user.positive()) {
            FrameLayout frameLayout3 = new FrameLayout(context);
            int L = org.telegram.messenger.g0.L(10.0f);
            int i10 = j6.h5;
            ShapeDrawable d02 = j6.d0(L, j6.w0(i10, e6Var));
            m6 M = q6.M(i10);
            frameLayout3.setBackground(d02);
            q6.j(frameLayout3, d02, M, null, e6Var);
            frameLayout3.setPadding(org.telegram.messenger.g0.L(1.33f), org.telegram.messenger.g0.L(1.33f), org.telegram.messenger.g0.L(1.33f), org.telegram.messenger.g0.L(1.33f));
            TextView textView2 = new TextView(context);
            int L2 = org.telegram.messenger.g0.L(10.0f);
            int i11 = j6.lk;
            ShapeDrawable d03 = j6.d0(L2, j6.w0(i11, e6Var));
            m6 M2 = q6.M(i11);
            textView2.setBackground(d03);
            q6.j(textView2, d03, M2, null, e6Var);
            textView2.setTypeface(org.telegram.messenger.g0.o());
            textView2.setTextSize(1, 10.0f);
            textView2.setPadding(org.telegram.messenger.g0.L(5.33f), 0, org.telegram.messenger.g0.L(5.33f), 0);
            textView2.setTextColor(-1);
            textView2.setGravity(17);
            StringBuilder sb2 = new StringBuilder("⭐️ ");
            jArr = jArr2;
            sb2.append((Object) lb.N0(starrefprogram.daily_revenue_per_user, 1.0f, ','));
            textView2.setText(lb.U0(sb2.toString(), 0.75f, new eq[1]));
            frameLayout3.addView(textView2, ja.c(15.66f, -2));
            frameLayout2.addView(frameLayout3, ja.d(-2, -2.0f, 81, 0.0f, 0.0f, 0.0f, -4.0f));
        } else {
            jArr = jArr2;
        }
        ImageView e10 = i20.e(context, R.drawable.msg_arrow_avatar);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        e10.setScaleType(scaleType);
        e10.setTranslationX(-org.telegram.messenger.g0.L(2.0825f));
        int i12 = j6.E6;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        q6.s(e10, i12, e6Var, mode);
        frameLayout.addView(e10, ja.d(36, 60.0f, 17, 60.0f, 0.0f, 60.0f, 0.0f));
        FrameLayout frameLayout4 = new FrameLayout(context);
        frameLayout4.setClipToPadding(false);
        frameLayout4.setClipChildren(false);
        frameLayout.addView(frameLayout4, ja.d(60, 60.0f, 21, 0.0f, 0.0f, 5.66f, 0.0f));
        i9 i9Var3 = new i9(context);
        i9Var3.setRoundRadius(org.telegram.messenger.g0.L(30.0f));
        frameLayout4.addView(i9Var3, ja.e(60, 60, ns.E1));
        FrameLayout frameLayout5 = new FrameLayout(context);
        int L3 = org.telegram.messenger.g0.L(10.0f);
        int i13 = j6.h5;
        Drawable d04 = j6.d0(L3, j6.w0(i13, e6Var));
        m6 M3 = q6.M(i13);
        frameLayout5.setBackground(d04);
        q6.j(frameLayout5, d04, M3, null, e6Var);
        frameLayout5.setPadding(org.telegram.messenger.g0.L(1.33f), org.telegram.messenger.g0.L(1.33f), org.telegram.messenger.g0.L(1.33f), org.telegram.messenger.g0.L(1.33f));
        TextView textView3 = new TextView(context);
        int L4 = org.telegram.messenger.g0.L(10.0f);
        int i14 = j6.Fi;
        Drawable d05 = j6.d0(L4, j6.w0(i14, e6Var));
        m6 M4 = q6.M(i14);
        textView3.setBackground(d05);
        q6.j(textView3, d05, M4, null, e6Var);
        textView3.setTypeface(org.telegram.messenger.g0.o());
        textView3.setTextSize(1, 10.0f);
        textView3.setPadding(org.telegram.messenger.g0.L(5.33f), 0, org.telegram.messenger.g0.L(5.33f), 0);
        textView3.setTextColor(-1);
        textView3.setGravity(17);
        SpannableString spannableString = new SpannableString("s " + ((Object) k.J0(starrefprogram.commission_permille)));
        eq eqVar = new eq(R.drawable.msg_link_1, 0);
        eqVar.I = 0.65f;
        eqVar.J = 0.65f;
        eqVar.H = 0.7f;
        float L5 = org.telegram.messenger.g0.L(-2.0f);
        float L6 = org.telegram.messenger.g0.L(0.0f);
        eqVar.r = L5;
        eqVar.s = L6;
        spannableString.setSpan(eqVar, 0, 1, 33);
        textView3.setText(spannableString);
        frameLayout5.addView(textView3, ja.c(15.66f, -2));
        frameLayout4.addView(frameLayout5, ja.d(-2, -2.0f, 81, 0.0f, 0.0f, 0.0f, -4.0f));
        f10.addView(frameLayout, ja.t(-2, -2, 1, 0, 0, 0, 0));
        TextView textView4 = new TextView(context);
        int i15 = j6.G6;
        q6.U(textView4, i15, e6Var);
        textView4.setTextSize(1, 20.0f);
        textView4.setGravity(17);
        textView4.setText(hd.M0(2131752494, null));
        textView4.setTypeface(org.telegram.messenger.g0.o());
        f10.addView(textView4, ja.k(0.0f, 21.0f, 0.0f, 9.0f, -1, -2));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        int L7 = org.telegram.messenger.g0.L(28.0f);
        int i16 = j6.a7;
        ShapeDrawable d06 = j6.d0(L7, j6.w0(i16, e6Var));
        m6 M5 = q6.M(i16);
        linearLayout2.setBackground(d06);
        q6.j(linearLayout2, d06, M5, null, e6Var);
        TextView textView5 = new TextView(context);
        textView5.setTextSize(1, 13.0f);
        q6.U(textView5, i15, e6Var);
        textView5.setText(hd.a0(null, null, 2131752493, m5.l(i7, starrefprogram.bot_id)));
        linearLayout2.addView(textView5, ja.t(-2, -2, 16, 11, 0, 0, 0));
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(scaleType);
        int i17 = j6.r5;
        q6.s(imageView, i17, e6Var, mode);
        imageView.setImageResource(R.drawable.settings_arrow);
        imageView.setScaleX(1.2f);
        imageView.setScaleY(1.2f);
        linearLayout2.addView(imageView, ja.t(-2, -2, 16, 5, 0, 8, 0));
        f10.addView(linearLayout2, ja.t(-2, 28, 1, 4, 0, 4, 0));
        na.a(linearLayout2);
        TextView textView6 = new TextView(context);
        q6.U(textView6, i15, e6Var);
        textView6.setTextSize(1, 14.0f);
        textView6.setGravity(17);
        ns.i(textView6);
        SpannableString spannableString2 = new SpannableString(lb.N0(starrefprogram.daily_revenue_per_user, 0.95f, ','));
        spannableString2.setSpan(new y31(org.telegram.messenger.g0.o()), 0, spannableString2.length(), 33);
        textView6.setText(lb.a1(false, hd.V(null, null, 2131752503, spannableString2), 0.725f, null));
        TextView f11 = i20.f(f10, textView6, ja.k(0.0f, 10.0f, 0.0f, 20.0f, -1, -2), context);
        q6.U(f11, i15, e6Var);
        f11.setTextSize(1, 14.0f);
        f11.setGravity(17);
        ns.i(f11);
        String p10 = q10.p(a22);
        String J0 = k.J0(starrefprogram.commission_permille);
        int i18 = starrefprogram.duration_months;
        if (i18 <= 0) {
            G = hd.M0(2131752501, null);
        } else {
            if (i18 < 12 || i18 % 12 != 0) {
                str = p10;
                r15 = 0;
                G = hd.G(i18, "ChannelAffiliateProgramJoinText_Months", new Object[0]);
                Object[] objArr = new Object[3];
                objArr[r15] = str;
                objArr[1] = J0;
                objArr[2] = G;
                f11.setText(org.telegram.messenger.j6.m(org.telegram.messenger.g0.X2(hd.a0(null, null, 2131752502, objArr)), f11.getPaint().getFontMetricsInt(), r15, null, r15));
                f10.addView(f11, ja.k(0.0f, 0.0f, 0.0f, 22.0f, -1, -2));
                if (j3 < 0) {
                    TextView textView7 = new TextView(context);
                    q6.U(textView7, i15, e6Var);
                    textView7.setTextSize(1, 14.0f);
                    k5.l(textView7, 17, null, 2131752486);
                    f10.addView(textView7, ja.k(20.0f, 0.0f, 20.0f, 0.0f, -1, -2));
                    LinearLayout linearLayout3 = new LinearLayout(context);
                    linearLayout3.setOrientation(0);
                    ShapeDrawable d07 = j6.d0(org.telegram.messenger.g0.L(28.0f), j6.w0(i16, e6Var));
                    m6 M6 = q6.M(i16);
                    linearLayout3.setBackground(d07);
                    q6.j(linearLayout3, d07, M6, null, e6Var);
                    int L8 = org.telegram.messenger.g0.L(28.0f);
                    int w02 = j6.w0(i16, e6Var);
                    int w03 = j6.w0(i16, e6Var);
                    int i19 = j6.i6;
                    int w10 = j6.w(w03, j6.w0(i19, e6Var));
                    org.telegram.ui.Cells.y k02 = j6.k0(L8, L8, L8, L8, w02, w10, w10);
                    m6 M7 = q6.M(i16);
                    m6 p11 = q6.p(i16, i19);
                    linearLayout3.setBackground(k02);
                    q6.j(linearLayout3, k02, M7, p11, e6Var);
                    i9 i9Var4 = new i9(context);
                    i9Var4.setRoundRadius(org.telegram.messenger.g0.L(14.0f));
                    linearLayout3.addView(i9Var4, ja.o(28, 28));
                    TextView textView8 = new TextView(context);
                    textView8.setTextSize(1, 13.0f);
                    q6.U(textView8, i15, e6Var);
                    linearLayout3.addView(textView8, ja.t(-2, -2, 16, 6, 0, 0, 0));
                    ImageView imageView2 = new ImageView(context);
                    imageView2.setScaleType(scaleType);
                    q6.s(imageView2, i17, e6Var, mode);
                    imageView2.setImageResource(R.drawable.arrows_select);
                    linearLayout3.addView(imageView2, ja.t(-2, -2, 16, 2, 0, 5, 0));
                    f10.addView(linearLayout3, ja.t(-2, 28, 1, 0, 11, 0, 20));
                    linearLayout = linearLayout3;
                    i9Var = i9Var4;
                    textView = textView8;
                } else {
                    i9Var = null;
                    textView = null;
                    linearLayout = null;
                }
                hi.d dVar = new hi.d(context, e6Var, true);
                dVar.i(hd.M0(2131752508, null), false, true);
                f10.addView(dVar, ja.o(-1, 48));
                z70 z70Var = new z70(context, e6Var);
                z70Var.setText(org.telegram.messenger.g0.U2(hd.M0(2131752507, null), new ai.a(context, 10)));
                z70Var.setGravity(17);
                z70Var.setTextSize(1, 12.0f);
                q6.U(z70Var, j6.B6, e6Var);
                q6.G(z70Var, j6.Xc, e6Var);
                f10.addView(z70Var, ja.t(-1, -2, 49, 14, 14, 14, 6));
                k10.O = f10;
                final int i20 = 1;
                i9Var2.setOnClickListener(new View.OnClickListener() { // from class: ki.y2
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i20) {
                            case 0:
                                org.telegram.ui.ActionBar.e2 T = LaunchActivity.T();
                                if (T != null) {
                                    org.telegram.ui.ActionBar.u2 u2Var = k10;
                                    u2Var.dismiss();
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("user_id", starrefprogram.bot_id);
                                    T.presentFragment(new i3(bundle, u2Var));
                                    break;
                                }
                                break;
                            default:
                                org.telegram.ui.ActionBar.e2 T2 = LaunchActivity.T();
                                if (T2 != null) {
                                    k10.dismiss();
                                    T2.presentFragment(ProfileActivity.C4(starrefprogram.bot_id));
                                    break;
                                }
                                break;
                        }
                    }
                });
                dVar.setOnClickListener(new f3(dVar, jArr, i7, starrefprogram, k10, j3, z10, context, e6Var, a22));
                k10.setOnDismissListener(new hi.f1(6));
                ai.g1 g1Var = new ai.g1(jArr, i7, i9Var3, i9Var, textView, 6);
                g1Var.run();
                if (linearLayout != null) {
                    di.e0.g(i7).n();
                    di.e0.g(i7).o();
                    LinearLayout linearLayout4 = linearLayout;
                    linearLayout4.setOnClickListener(new v9(i7, k10, e6Var, linearLayout4, jArr, g1Var));
                }
                final int i21 = 0;
                linearLayout2.setOnClickListener(new View.OnClickListener() { // from class: ki.y2
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i21) {
                            case 0:
                                org.telegram.ui.ActionBar.e2 T = LaunchActivity.T();
                                if (T != null) {
                                    org.telegram.ui.ActionBar.u2 u2Var = k10;
                                    u2Var.dismiss();
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("user_id", starrefprogram.bot_id);
                                    T.presentFragment(new i3(bundle, u2Var));
                                    break;
                                }
                                break;
                            default:
                                org.telegram.ui.ActionBar.e2 T2 = LaunchActivity.T();
                                if (T2 != null) {
                                    k10.dismiss();
                                    T2.presentFragment(ProfileActivity.C4(starrefprogram.bot_id));
                                    break;
                                }
                                break;
                        }
                    }
                });
                k10.Q(i13);
                k10.show();
            }
            G = hd.G(i18 / 12, "ChannelAffiliateProgramJoinText_Years", new Object[0]);
        }
        str = p10;
        r15 = 0;
        Object[] objArr2 = new Object[3];
        objArr2[r15] = str;
        objArr2[1] = J0;
        objArr2[2] = G;
        f11.setText(org.telegram.messenger.j6.m(org.telegram.messenger.g0.X2(hd.a0(null, null, 2131752502, objArr2)), f11.getPaint().getFontMetricsInt(), r15, null, r15));
        f10.addView(f11, ja.k(0.0f, 0.0f, 0.0f, 22.0f, -1, -2));
        if (j3 < 0) {
        }
        hi.d dVar2 = new hi.d(context, e6Var, true);
        dVar2.i(hd.M0(2131752508, null), false, true);
        f10.addView(dVar2, ja.o(-1, 48));
        z70 z70Var2 = new z70(context, e6Var);
        z70Var2.setText(org.telegram.messenger.g0.U2(hd.M0(2131752507, null), new ai.a(context, 10)));
        z70Var2.setGravity(17);
        z70Var2.setTextSize(1, 12.0f);
        q6.U(z70Var2, j6.B6, e6Var);
        q6.G(z70Var2, j6.Xc, e6Var);
        f10.addView(z70Var2, ja.t(-1, -2, 49, 14, 14, 14, 6));
        k10.O = f10;
        final int i202 = 1;
        i9Var2.setOnClickListener(new View.OnClickListener() { // from class: ki.y2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i202) {
                    case 0:
                        org.telegram.ui.ActionBar.e2 T = LaunchActivity.T();
                        if (T != null) {
                            org.telegram.ui.ActionBar.u2 u2Var = k10;
                            u2Var.dismiss();
                            Bundle bundle = new Bundle();
                            bundle.putLong("user_id", starrefprogram.bot_id);
                            T.presentFragment(new i3(bundle, u2Var));
                            break;
                        }
                        break;
                    default:
                        org.telegram.ui.ActionBar.e2 T2 = LaunchActivity.T();
                        if (T2 != null) {
                            k10.dismiss();
                            T2.presentFragment(ProfileActivity.C4(starrefprogram.bot_id));
                            break;
                        }
                        break;
                }
            }
        });
        dVar2.setOnClickListener(new f3(dVar2, jArr, i7, starrefprogram, k10, j3, z10, context, e6Var, a22));
        k10.setOnDismissListener(new hi.f1(6));
        ai.g1 g1Var2 = new ai.g1(jArr, i7, i9Var3, i9Var, textView, 6);
        g1Var2.run();
        if (linearLayout != null) {
        }
        final int i212 = 0;
        linearLayout2.setOnClickListener(new View.OnClickListener() { // from class: ki.y2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i212) {
                    case 0:
                        org.telegram.ui.ActionBar.e2 T = LaunchActivity.T();
                        if (T != null) {
                            org.telegram.ui.ActionBar.u2 u2Var = k10;
                            u2Var.dismiss();
                            Bundle bundle = new Bundle();
                            bundle.putLong("user_id", starrefprogram.bot_id);
                            T.presentFragment(new i3(bundle, u2Var));
                            break;
                        }
                        break;
                    default:
                        org.telegram.ui.ActionBar.e2 T2 = LaunchActivity.T();
                        if (T2 != null) {
                            k10.dismiss();
                            T2.presentFragment(ProfileActivity.C4(starrefprogram.bot_id));
                            break;
                        }
                        break;
                }
            }
        });
        k10.Q(i13);
        k10.show();
    }

    public static org.telegram.ui.ActionBar.u2 K0(Context context, int i7, TL_payments.connectedBotStarRef connectedbotstarref, long j3, e6 e6Var) {
        ImageView.ScaleType scaleType;
        LinearLayout linearLayout;
        int i10;
        org.telegram.ui.ActionBar.u2 u2Var;
        char c10;
        String G;
        char c11;
        String G2;
        int i11;
        LinearLayout linearLayout2;
        TL_payments.connectedBotStarRef connectedbotstarref2;
        if (connectedbotstarref == null || context == null) {
            return null;
        }
        org.telegram.ui.ActionBar.u2 k10 = k5.k(1, context, e6Var, false);
        TLRPC.User a22 = np.s1(i7).a2(Long.valueOf(connectedbotstarref.bot_id));
        LinearLayout f10 = k5.f(context, 1);
        f10.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(8.0f));
        f10.setClipChildren(false);
        f10.setClipToPadding(false);
        FrameLayout frameLayout = new FrameLayout(context);
        View view = new View(context);
        Drawable L = j6.L(org.telegram.messenger.g0.L(40.0f), j6.w0(connectedbotstarref.revoked ? j6.nk : j6.Fi, e6Var));
        m6 M = q6.M(connectedbotstarref.revoked ? j6.nk : j6.Fi);
        view.setBackground(L);
        q6.j(view, L, M, null, e6Var);
        frameLayout.addView(view, ja.d(80, 80.0f, 49, 0.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        ImageView.ScaleType scaleType2 = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType2);
        imageView.setImageResource(connectedbotstarref.revoked ? R.drawable.msg_link_2 : R.drawable.msg_limit_links);
        imageView.setScaleX(connectedbotstarref.revoked ? 2.0f : 1.8f);
        imageView.setScaleY(connectedbotstarref.revoked ? 2.0f : 1.8f);
        frameLayout.addView(imageView, ja.d(80, 80.0f, 49, 0.0f, 0.0f, 0.0f, 0.0f));
        if (connectedbotstarref.participants > 0) {
            FrameLayout frameLayout2 = new FrameLayout(context);
            int L2 = org.telegram.messenger.g0.L(50.0f);
            int i12 = j6.h5;
            Drawable d02 = j6.d0(L2, j6.w0(i12, e6Var));
            m6 M2 = q6.M(i12);
            frameLayout2.setBackground(d02);
            q6.j(frameLayout2, d02, M2, null, e6Var);
            frameLayout.addView(frameLayout2, ja.d(-2, -2.0f, 49, 0.0f, 66.0f, 0.0f, 0.0f));
            TextView textView = new TextView(context);
            textView.setTypeface(org.telegram.messenger.g0.o());
            textView.setTextSize(1, 12.0f);
            Drawable d03 = j6.d0(org.telegram.messenger.g0.L(9.5f), j6.w0(connectedbotstarref.revoked ? j6.nk : j6.lk, e6Var));
            m6 M3 = q6.M(connectedbotstarref.revoked ? j6.nk : j6.lk);
            textView.setBackground(d03);
            q6.j(textView, d03, M3, null, e6Var);
            textView.setTextColor(-1);
            textView.setPadding(org.telegram.messenger.g0.L(6.66f), 0, org.telegram.messenger.g0.L(6.66f), 0);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) "s ");
            eq eqVar = new eq(R.drawable.mini_reply_user, 0);
            eqVar.I = 0.937f;
            eqVar.J = 0.937f;
            float f11 = -org.telegram.messenger.g0.L(1.33f);
            float L3 = org.telegram.messenger.g0.L(1.0f);
            eqVar.r = f11;
            eqVar.s = L3;
            eqVar.H = 0.8f;
            scaleType = scaleType2;
            spannableStringBuilder.setSpan(eqVar, 0, 1, 33);
            spannableStringBuilder.append((CharSequence) String.valueOf(connectedbotstarref.participants));
            textView.setText(spannableStringBuilder);
            textView.setGravity(17);
            frameLayout2.addView(textView, ja.d(-1, 19.0f, ns.E1, 1.33f, 1.33f, 1.33f, 1.33f));
        } else {
            scaleType = scaleType2;
        }
        f10.addView(frameLayout, ja.t(-2, -2, 1, 0, 0, 0, 0));
        TextView textView2 = new TextView(context);
        int i13 = j6.G6;
        q6.U(textView2, i13, e6Var);
        textView2.setTextSize(1, 20.0f);
        textView2.setGravity(17);
        textView2.setText(hd.M0(2131752482, null));
        textView2.setTypeface(org.telegram.messenger.g0.o());
        f10.addView(textView2, ja.k(20.0f, 16.0f, 20.0f, 9.33f, -1, -2));
        LinearLayout linearLayout3 = new LinearLayout(context);
        linearLayout3.setOrientation(0);
        int L4 = org.telegram.messenger.g0.L(28.0f);
        int i14 = j6.a7;
        ShapeDrawable d04 = j6.d0(L4, j6.w0(i14, e6Var));
        m6 M4 = q6.M(i14);
        linearLayout3.setBackground(d04);
        q6.j(linearLayout3, d04, M4, null, e6Var);
        i9 i9Var = new i9(context);
        i9Var.setRoundRadius(org.telegram.messenger.g0.L(14.0f));
        t8 t8Var = new t8((e6) null);
        linearLayout3.addView(i9Var, ja.o(28, 28));
        TextView textView3 = new TextView(context);
        textView3.setTextSize(1, 13.0f);
        q6.U(textView3, i13, e6Var);
        textView3.setText(m5.l(i7, connectedbotstarref.bot_id));
        t8Var.r(a22);
        i9Var.f(a22, t8Var);
        linearLayout3.addView(textView3, ja.t(-2, -2, 16, 6, 0, 0, 0));
        ImageView imageView2 = new ImageView(context);
        ImageView.ScaleType scaleType3 = scaleType;
        imageView2.setScaleType(scaleType3);
        int i15 = j6.r5;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        q6.s(imageView2, i15, e6Var, mode);
        imageView2.setImageResource(R.drawable.settings_arrow);
        imageView2.setScaleX(1.2f);
        imageView2.setScaleY(1.2f);
        linearLayout3.addView(imageView2, ja.t(-2, -2, 16, 5, 0, 8, 0));
        f10.addView(linearLayout3, ja.t(-2, 28, 1, 4, 0, 4, 0));
        na.a(linearLayout3);
        TextView textView4 = new TextView(context);
        q6.U(textView4, i13, e6Var);
        textView4.setTextSize(1, 14.0f);
        textView4.setGravity(17);
        if (connectedbotstarref.revoked) {
            textView4.setText(org.telegram.messenger.g0.X2(hd.M0(2131752484, null)));
            i10 = i15;
            u2Var = k10;
            linearLayout = linearLayout3;
        } else {
            linearLayout = linearLayout3;
            if (j3 < 0) {
                String J0 = k.J0(connectedbotstarref.commission_permille);
                String p10 = q10.p(a22);
                int i16 = connectedbotstarref.duration_months;
                i10 = i15;
                u2Var = k10;
                if (i16 <= 0) {
                    G2 = hd.M0(2131752501, null);
                    c11 = 0;
                } else if (i16 < 12 || i16 % 12 != 0) {
                    c11 = 0;
                    G2 = hd.G(i16, "ChannelAffiliateProgramJoinText_Months", new Object[0]);
                } else {
                    c11 = 0;
                    G2 = hd.G(i16 / 12, "ChannelAffiliateProgramJoinText_Years", new Object[0]);
                }
                Object[] objArr = new Object[3];
                objArr[c11] = J0;
                objArr[1] = p10;
                objArr[2] = G2;
                k5.q(null, null, 2131752485, objArr, textView4);
            } else {
                i10 = i15;
                u2Var = k10;
                String J02 = k.J0(connectedbotstarref.commission_permille);
                String p11 = q10.p(a22);
                int i17 = connectedbotstarref.duration_months;
                if (i17 <= 0) {
                    G = hd.M0(2131752501, null);
                    c10 = 0;
                } else if (i17 < 12 || i17 % 12 != 0) {
                    c10 = 0;
                    G = hd.G(i17, "ChannelAffiliateProgramJoinText_Months", new Object[0]);
                } else {
                    c10 = 0;
                    G = hd.G(i17 / 12, "ChannelAffiliateProgramJoinText_Years", new Object[0]);
                }
                Object[] objArr2 = new Object[3];
                objArr2[c10] = J02;
                objArr2[1] = p11;
                objArr2[2] = G;
                k5.q(null, null, 2131752483, objArr2, textView4);
            }
        }
        f10.addView(textView4, ja.k(20.0f, 19.0f, 20.0f, 18.0f, -1, -2));
        if (connectedbotstarref.revoked) {
            i11 = i14;
            linearLayout2 = null;
        } else {
            TextView textView5 = new TextView(context);
            q6.U(textView5, i13, e6Var);
            textView5.setTextSize(1, 14.0f);
            k5.l(textView5, 17, null, 2131752486);
            f10.addView(textView5, ja.k(20.0f, 0.0f, 20.0f, 0.0f, -1, -2));
            LinearLayout linearLayout4 = new LinearLayout(context);
            linearLayout4.setOrientation(0);
            Drawable d05 = j6.d0(org.telegram.messenger.g0.L(28.0f), j6.w0(i14, e6Var));
            m6 M5 = q6.M(i14);
            linearLayout4.setBackground(d05);
            q6.j(linearLayout4, d05, M5, null, e6Var);
            i9 i9Var2 = new i9(context);
            i9Var2.setRoundRadius(org.telegram.messenger.g0.L(14.0f));
            t8 t8Var2 = new t8((e6) null);
            linearLayout4.addView(i9Var2, ja.o(28, 28));
            TextView textView6 = new TextView(context);
            textView6.setTextSize(1, 13.0f);
            q6.U(textView6, i13, e6Var);
            if (j3 >= 0) {
                TLRPC.User a23 = np.s1(i7).a2(Long.valueOf(j3));
                t8Var2.r(a23);
                i9Var2.f(a23, t8Var2);
                textView6.setText(q10.p(a23));
                i11 = i14;
            } else {
                i11 = i14;
                TLRPC.Chat M0 = np.s1(i7).M0(Long.valueOf(-j3));
                t8Var2.q(M0);
                i9Var2.f(M0, t8Var2);
                textView6.setText(M0 == null ? "" : M0.title);
            }
            linearLayout4.addView(textView6, ja.t(-2, -2, 16, 6, 0, 0, 0));
            ImageView imageView3 = new ImageView(context);
            imageView3.setScaleType(scaleType3);
            q6.s(imageView3, i10, e6Var, mode);
            imageView3.setImageResource(R.drawable.arrows_select);
            linearLayout4.addView(imageView3, ja.t(-2, -2, 16, 2, 0, 5, 0));
            f10.addView(linearLayout4, ja.t(-2, 28, 1, 0, 9, 0, 22));
            linearLayout2 = linearLayout4;
        }
        TextView textView7 = new TextView(context);
        textView7.setTextSize(1, 16.0f);
        textView7.setGravity(17);
        q6.U(textView7, i13, e6Var);
        int L5 = org.telegram.messenger.g0.L(8.0f);
        int i18 = i11;
        int w02 = j6.w0(i18, e6Var);
        int w03 = j6.w0(i18, e6Var);
        int i19 = j6.i6;
        int w10 = j6.w(w03, j6.w0(i19, e6Var));
        org.telegram.ui.Cells.y k02 = j6.k0(L5, L5, L5, L5, w02, w10, w10);
        m6 M6 = q6.M(i18);
        m6 p12 = q6.p(i18, i19);
        textView7.setBackground(k02);
        q6.j(textView7, k02, M6, p12, e6Var);
        textView7.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(14.66f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(14.66f));
        String str = connectedbotstarref.url;
        textView7.setText((str == null || !str.startsWith("https://")) ? connectedbotstarref.url : connectedbotstarref.url.substring(8));
        f10.addView(textView7, ja.d(-1, -2.0f, 7, 0.0f, 0.0f, 0.0f, 12.0f));
        hi.d dVar = new hi.d(context, e6Var, true);
        if (connectedbotstarref.revoked) {
            dVar.i(hd.M0(2131752487, null), false, true);
        } else {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            spannableStringBuilder2.append((CharSequence) "c ");
            spannableStringBuilder2.setSpan(new eq(R.drawable.msg_copy_filled, 0), 0, 1, 33);
            spannableStringBuilder2.append((CharSequence) hd.M0(2131752492, null));
            dVar.i(spannableStringBuilder2, false, true);
        }
        f10.addView(dVar, ja.o(-1, 48));
        z70 z70Var = new z70(context, e6Var);
        long j10 = connectedbotstarref.participants;
        z70Var.setText(j10 <= 0 ? hd.a0(null, null, 2131752490, q10.p(a22)) : hd.G((int) j10, "ChannelAffiliateProgramLinkOpened", q10.p(a22)));
        z70Var.setGravity(17);
        z70Var.setTextSize(1, 12.0f);
        q6.U(z70Var, j6.B6, e6Var);
        q6.G(z70Var, j6.Xc, e6Var);
        f10.addView(z70Var, ja.t(-1, -2, 49, 14, 12, 14, 2));
        org.telegram.ui.ActionBar.u2 u2Var2 = u2Var;
        u2Var2.O = f10;
        ai.r rVar = new ai.r(connectedbotstarref, u2Var2, e6Var, a22, 23);
        if (!connectedbotstarref.revoked) {
            textView7.setOnClickListener(new p5(rVar, 11));
        }
        e3 e3Var = new e3(connectedbotstarref, i7, u2Var2, context, j3, e6Var, rVar);
        org.telegram.ui.ActionBar.u2 u2Var3 = u2Var2;
        dVar.setOnClickListener(e3Var);
        u2Var3.setOnDismissListener(new hi.f1(6));
        if (linearLayout2 != null) {
            di.e0.g(i7).n();
            di.e0.g(i7).o();
            LinearLayout linearLayout5 = linearLayout2;
            View.OnClickListener e3Var2 = new e3(i7, u2Var3, e6Var, linearLayout5, j3, context, connectedbotstarref);
            u2Var3 = u2Var3;
            connectedbotstarref2 = connectedbotstarref;
            linearLayout5.setOnClickListener(e3Var2);
        } else {
            connectedbotstarref2 = connectedbotstarref;
        }
        linearLayout.setOnClickListener(new ai.v2(27, u2Var3, connectedbotstarref2));
        u2Var3.Q(j6.h5);
        org.telegram.ui.ActionBar.e2 T = LaunchActivity.T();
        if (!org.telegram.messenger.g0.Q1() && T != null && !org.telegram.messenger.g0.u1(T)) {
            u2Var3.a0(T);
        }
        u2Var3.show();
        return u2Var3;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x01c2 A[LOOP:0: B:20:0x01bc->B:22:0x01c2, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void I0(ArrayList arrayList, p41 p41Var) {
        int i7;
        SpannableString spannableString;
        int i10;
        if (getParentActivity() == null) {
            return;
        }
        rv rvVar = (rv) o0(getParentActivity());
        b41 b41Var = new b41(-2);
        b41Var.c = rvVar;
        arrayList.add(b41Var);
        arrayList.add(i.i(R.drawable.menu_feature_reliable, hd.M0(2131752513, null), hd.M0(2131752514, null)));
        arrayList.add(i.i(R.drawable.menu_feature_transparent, hd.M0(2131752511, null), hd.M0(2131752512, null)));
        arrayList.add(i.i(R.drawable.menu_feature_simple, hd.M0(2131752509, null), hd.M0(2131752510, null)));
        arrayList.add(b41.B(1, null));
        di.e0 g10 = di.e0.g(this.currentAccount);
        long j3 = this.S;
        di.b0 d = g10.d(j3);
        ArrayList arrayList2 = d.e;
        if (!arrayList2.isEmpty() || d.c > 0) {
            arrayList.add(b41.u(hd.M0(2131752481, null)));
            for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) arrayList2.get(i11);
                int i12 = j3.b;
                b41 K = b41.K(j3.class);
                K.G = connectedbotstarref;
                K.r = true;
                arrayList.add(K);
            }
            if (!d.d || d.g) {
                arrayList.add(b41.p(29));
                arrayList.add(b41.p(29));
                arrayList.add(b41.p(29));
            }
            arrayList.add(b41.B(2, null));
        }
        di.c0 e10 = di.e0.g(this.currentAccount).e(j3);
        ArrayList arrayList3 = e10.e;
        if (!arrayList3.isEmpty() || e10.c > 0) {
            String M0 = hd.M0(2131752480, null);
            int i13 = e10.g;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) hd.M0(2131752479, null)).append((CharSequence) " ");
            if (i13 == 1) {
                spannableString = new SpannableString(hd.M0(2131752477, null) + "v");
            } else if (i13 == 2) {
                spannableString = new SpannableString(hd.M0(2131752476, null) + "v");
            } else if (i13 == 3) {
                spannableString = new SpannableString(hd.M0(2131752478, null) + "v");
            } else {
                i7 = 0;
                int i14 = l3.b;
                b41 K2 = b41.K(l3.class);
                K2.l = M0;
                K2.m = spannableStringBuilder;
                arrayList.add(K2);
                for (i10 = i7; i10 < arrayList3.size(); i10++) {
                    Object obj = arrayList3.get(i10);
                    int i15 = j3.b;
                    b41 K3 = b41.K(j3.class);
                    K3.G = obj;
                    K3.r = true;
                    arrayList.add(K3);
                }
                if (e10.d || e10.h) {
                    arrayList.add(b41.p(29));
                    arrayList.add(b41.p(29));
                    arrayList.add(b41.p(29));
                }
                arrayList.add(b41.B(3, null));
            }
            eq eqVar = new eq(R.drawable.arrow_more, 0);
            eqVar.f = true;
            eqVar.I = 0.6f;
            eqVar.J = 0.6f;
            spannableString.setSpan(eqVar, spannableString.length() - 1, spannableString.length(), 33);
            i7 = 0;
            spannableString.setSpan(new h3(this, i13, di.e0.g(this.currentAccount).e(j3)), 0, spannableString.length(), 33);
            spannableStringBuilder.append((CharSequence) spannableString);
            int i142 = l3.b;
            b41 K22 = b41.K(l3.class);
            K22.l = M0;
            K22.m = spannableStringBuilder;
            arrayList.add(K22);
            while (i10 < arrayList3.size()) {
            }
            if (e10.d) {
            }
            arrayList.add(b41.p(29));
            arrayList.add(b41.p(29));
            arrayList.add(b41.p(29));
            arrayList.add(b41.B(3, null));
        }
        arrayList.add(b41.k(this.V));
    }

    @Override // org.telegram.ui.p00, org.telegram.ui.ActionBar.e2
    public final View createView(Context context) {
        this.H = false;
        this.F = org.telegram.messenger.g0.L(238.0f);
        bn bnVar = new bn(context, 6);
        this.V = bnVar;
        q6.h(j6.i5, bnVar, null);
        super.createView(context);
        this.T = new FrameLayout(context);
        vg.m mVar = new vg.m(context, 1, 3);
        this.U = mVar;
        mVar.setImportantForAccessibility(4);
        vg.f fVar = this.U.b;
        fVar.z = j6.Wk;
        fVar.A = j6.Xk;
        fVar.b();
        this.U.setStarParticlesView(this.e);
        this.T.addView(this.U, ja.d(ns.U2, 190.0f, 17, 0.0f, 32.0f, 0.0f, 12.0f));
        j0(hd.M0(2131752472, null), org.telegram.messenger.g0.X2(hd.M0(2131752473, null)), this.T, null);
        this.c.setOnItemClickListener(new fi.i4(2, this, context));
        this.c.setOnItemLongClickListener(new ab.g(27, this, context));
        v4.k kVar = new v4.k();
        kVar.m = false;
        kVar.C = false;
        kVar.o(er.h);
        kVar.n(350L);
        this.c.setItemAnimator(kVar);
        this.c.setOnScrollListener(new z4(this, 21));
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.is
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        x5 x5Var;
        int i11 = ns.L3;
        long j3 = this.S;
        if (i7 != i11) {
            if (i7 == ns.K3 && ((Long) objArr[0]).longValue() == j3 && (x5Var = this.W) != null) {
                x5Var.O(true);
                return;
            }
            return;
        }
        if (((Long) objArr[0]).longValue() == j3) {
            x5 x5Var2 = this.W;
            if (x5Var2 != null) {
                x5Var2.O(true);
            }
            di.e0.g(this.currentAccount).d(j3).a();
        }
    }

    @Override // org.telegram.ui.p00
    public final v4.h0 k0() {
        x5 x5Var = new x5(this, this.c, getParentActivity(), this.currentAccount, this.classGuid, new q4(this, 21), getResourceProvider(), 5);
        this.W = x5Var;
        return x5Var;
    }

    @Override // org.telegram.ui.p00
    public final ug.s1 m0() {
        f fVar = new f(getParentActivity(), 1);
        fVar.c();
        return fVar;
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final boolean onFragmentCreate() {
        ns.f(this.currentAccount).c(this, ns.L3);
        ns.f(this.currentAccount).c(this, ns.K3);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        ns.f(this.currentAccount).n(this, ns.L3);
        ns.f(this.currentAccount).n(this, ns.K3);
    }

    @Override // org.telegram.ui.p00, org.telegram.ui.ActionBar.e2
    public final void onPause() {
        super.onPause();
        vg.m mVar = this.U;
        if (mVar != null) {
            mVar.setPaused(true);
            this.U.setDialogVisible(true);
        }
    }

    @Override // org.telegram.ui.p00, org.telegram.ui.ActionBar.e2
    public final void onResume() {
        super.onResume();
        vg.m mVar = this.U;
        if (mVar != null) {
            mVar.setPaused(false);
            this.U.setDialogVisible(false);
        }
    }
}
