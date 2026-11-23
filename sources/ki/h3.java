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
import bi.g8;
import c8.ma;
import c8.ra;
import di.pb;
import di.z9;
import fi.g4;
import hi.d7;
import hi.o4;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.gs;
import org.telegram.messenger.hd;
import org.telegram.messenger.j6;
import org.telegram.messenger.ls;
import org.telegram.messenger.n5;
import org.telegram.messenger.np;
import org.telegram.messenger.o10;
import org.telegram.messenger.p10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.a70;
import org.telegram.ui.Components.b9;
import org.telegram.ui.Components.c51;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.ln;
import org.telegram.ui.Components.m80;
import org.telegram.ui.Components.nq;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.o41;
import org.telegram.ui.Components.q9;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.s00;
import org.telegram.ui.uv;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes4.dex */
public final class h3 extends s00 implements gs {
    public final long S;
    public FrameLayout T;
    public vg.m U;
    public ln V;
    public g8 W;

    public h3(long j3) {
        this.S = j3;
        this.N = true;
        this.M = org.telegram.messenger.g0.L(60.0f);
    }

    public static void A0(h3 h3Var, Context context, TLRPC.User user, TL_payments.connectedBotStarRef connectedbotstarref) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, h3Var.resourceProvider);
        String N0 = hd.N0(2131748814, null);
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
        t1Var.S = N0;
        t1Var.U = org.telegram.messenger.g0.W2(hd.a0(null, null, 2131748813, p10.q(user)));
        alertDialog$Builder.k(hd.N0(2131748812, null), new ab.g(24, h3Var, connectedbotstarref));
        alertDialog$Builder.h(hd.N0(2131752577, null), null);
        alertDialog$Builder.d(-1);
        alertDialog$Builder.p();
    }

    public static void B0(h3 h3Var, TL_payments.connectedBotStarRef connectedbotstarref) {
        org.telegram.ui.ActionBar.t1 t1Var = new org.telegram.ui.ActionBar.t1(3, h3Var.getParentActivity(), null);
        t1Var.r(200L);
        TL_payments.editConnectedStarRefBot editconnectedstarrefbot = new TL_payments.editConnectedStarRefBot();
        editconnectedstarrefbot.link = connectedbotstarref.url;
        editconnectedstarrefbot.peer = np.u1(h3Var.currentAccount).l1(h3Var.S);
        editconnectedstarrefbot.revoked = true;
        h3Var.getConnectionsManager().sendRequest(editconnectedstarrefbot, new bi.o1(25, h3Var, t1Var));
    }

    public static /* synthetic */ void C0(h3 h3Var, Context context, int i7) {
        g8 g8Var = h3Var.W;
        if (g8Var == null) {
            return;
        }
        Object obj = g8Var.G(i7).H;
        if (obj instanceof TL_payments.starRefProgram) {
            J0(context, h3Var.currentAccount, (TL_payments.starRefProgram) obj, h3Var.S, h3Var.resourceProvider, false);
        } else if (obj instanceof TL_payments.connectedBotStarRef) {
            K0(context, h3Var.currentAccount, (TL_payments.connectedBotStarRef) obj, h3Var.S, h3Var.resourceProvider);
        }
    }

    public static void D0(h3 h3Var, TLObject tLObject, org.telegram.ui.ActionBar.t1 t1Var) {
        long j3 = h3Var.S;
        if (tLObject instanceof TL_payments.connectedStarRefBots) {
            TL_payments.connectedStarRefBots connectedstarrefbots = (TL_payments.connectedStarRefBots) tLObject;
            di.b0 d = di.e0.g(h3Var.currentAccount).d(j3);
            ArrayList arrayList = d.e;
            int i7 = d.a;
            np.u1(i7).f4(connectedstarrefbots.users, false);
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
            ls.f(i7).k(ls.O3, Long.valueOf(d.b));
            d.a();
            di.c0 e10 = di.e0.g(h3Var.currentAccount).e(j3);
            e10.c = 0;
            e10.d = false;
            e10.i = false;
            e10.f = 0L;
            e10.j = null;
            e10.h = false;
            e10.a();
            h3Var.W.O(true);
        }
        t1Var.dismiss();
    }

    public static boolean E0(h3 h3Var, Context context, View view, int i7) {
        g8 g8Var = h3Var.W;
        if (g8Var != null) {
            Object obj = g8Var.G(i7).H;
            if (obj instanceof TL_payments.connectedBotStarRef) {
                TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) obj;
                TLRPC.User c22 = np.u1(h3Var.currentAccount).c2(Long.valueOf(connectedbotstarref.bot_id));
                a70 I = a70.I(h3Var, view);
                I.l(R.drawable.msg_bot, hd.N0(2131746512, null), new ji.i(12, h3Var, c22), c22.bot_has_main_app);
                I.l(R.drawable.msg_bot, hd.N0(2131752900, null), new ji.i(13, h3Var, connectedbotstarref), !c22.bot_has_main_app);
                I.c(R.drawable.msg_link2, hd.N0(2131751750, null), new kg.y(h3Var, connectedbotstarref, c22, 8), false);
                I.m(R.drawable.msg_leave, new ai.r(h3Var, context, c22, connectedbotstarref, 27), hd.N0(2131748812, null), !connectedbotstarref.revoked, true);
                I.W(5);
                I.a0();
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
    public static void J0(Context context, int i7, final TL_payments.starRefProgram starrefprogram, long j3, h6 h6Var, boolean z10) {
        long[] jArr;
        String str;
        ?? r15;
        String G;
        q9 q9Var;
        TextView textView;
        LinearLayout linearLayout;
        if (starrefprogram == null || context == null) {
            return;
        }
        final org.telegram.ui.ActionBar.w2 j10 = org.telegram.messenger.f3.j(1, context, h6Var, false);
        long[] jArr2 = {j3};
        TLRPC.User c22 = np.u1(i7).c2(Long.valueOf(starrefprogram.bot_id));
        LinearLayout g10 = org.telegram.messenger.f3.g(context, 1);
        g10.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(8.0f));
        g10.setClipChildren(false);
        g10.setClipToPadding(false);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setClipToPadding(false);
        frameLayout.setClipChildren(false);
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setClipToPadding(false);
        frameLayout2.setClipChildren(false);
        frameLayout.addView(frameLayout2, ma.d(60, 60.0f, 19, 0.0f, 0.0f, 0.0f, 0.0f));
        q9 q9Var2 = new q9(context);
        q9Var2.setRoundRadius(org.telegram.messenger.g0.L(30.0f));
        b9 b9Var = new b9((h6) null);
        b9Var.r(c22);
        q9Var2.f(c22, b9Var);
        ra.a(q9Var2);
        frameLayout2.addView(q9Var2, ma.e(60, 60, ls.E1));
        if (starrefprogram.daily_revenue_per_user.positive()) {
            FrameLayout frameLayout3 = new FrameLayout(context);
            int L = org.telegram.messenger.g0.L(10.0f);
            int i10 = m6.h5;
            ShapeDrawable d02 = m6.d0(L, m6.w0(i10, h6Var));
            p6 M = t6.M(i10);
            frameLayout3.setBackground(d02);
            t6.j(frameLayout3, d02, M, null, h6Var);
            frameLayout3.setPadding(org.telegram.messenger.g0.L(1.33f), org.telegram.messenger.g0.L(1.33f), org.telegram.messenger.g0.L(1.33f), org.telegram.messenger.g0.L(1.33f));
            TextView textView2 = new TextView(context);
            int L2 = org.telegram.messenger.g0.L(10.0f);
            int i11 = m6.lk;
            ShapeDrawable d03 = m6.d0(L2, m6.w0(i11, h6Var));
            p6 M2 = t6.M(i11);
            textView2.setBackground(d03);
            t6.j(textView2, d03, M2, null, h6Var);
            textView2.setTypeface(org.telegram.messenger.g0.o());
            textView2.setTextSize(1, 10.0f);
            textView2.setPadding(org.telegram.messenger.g0.L(5.33f), 0, org.telegram.messenger.g0.L(5.33f), 0);
            textView2.setTextColor(-1);
            textView2.setGravity(17);
            StringBuilder sb2 = new StringBuilder("⭐️ ");
            jArr = jArr2;
            sb2.append((Object) pb.N0(starrefprogram.daily_revenue_per_user, 1.0f, ','));
            textView2.setText(pb.U0(sb2.toString(), 0.75f, new nq[1]));
            frameLayout3.addView(textView2, ma.c(15.66f, -2));
            frameLayout2.addView(frameLayout3, ma.d(-2, -2.0f, 81, 0.0f, 0.0f, 0.0f, -4.0f));
        } else {
            jArr = jArr2;
        }
        ImageView e10 = o10.e(context, R.drawable.msg_arrow_avatar);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        e10.setScaleType(scaleType);
        e10.setTranslationX(-org.telegram.messenger.g0.L(2.0825f));
        int i12 = m6.E6;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        t6.s(e10, i12, h6Var, mode);
        frameLayout.addView(e10, ma.d(36, 60.0f, 17, 60.0f, 0.0f, 60.0f, 0.0f));
        FrameLayout frameLayout4 = new FrameLayout(context);
        frameLayout4.setClipToPadding(false);
        frameLayout4.setClipChildren(false);
        frameLayout.addView(frameLayout4, ma.d(60, 60.0f, 21, 0.0f, 0.0f, 5.66f, 0.0f));
        q9 q9Var3 = new q9(context);
        q9Var3.setRoundRadius(org.telegram.messenger.g0.L(30.0f));
        frameLayout4.addView(q9Var3, ma.e(60, 60, ls.E1));
        FrameLayout frameLayout5 = new FrameLayout(context);
        int L3 = org.telegram.messenger.g0.L(10.0f);
        int i13 = m6.h5;
        Drawable d04 = m6.d0(L3, m6.w0(i13, h6Var));
        p6 M3 = t6.M(i13);
        frameLayout5.setBackground(d04);
        t6.j(frameLayout5, d04, M3, null, h6Var);
        frameLayout5.setPadding(org.telegram.messenger.g0.L(1.33f), org.telegram.messenger.g0.L(1.33f), org.telegram.messenger.g0.L(1.33f), org.telegram.messenger.g0.L(1.33f));
        TextView textView3 = new TextView(context);
        int L4 = org.telegram.messenger.g0.L(10.0f);
        int i14 = m6.Fi;
        Drawable d05 = m6.d0(L4, m6.w0(i14, h6Var));
        p6 M4 = t6.M(i14);
        textView3.setBackground(d05);
        t6.j(textView3, d05, M4, null, h6Var);
        textView3.setTypeface(org.telegram.messenger.g0.o());
        textView3.setTextSize(1, 10.0f);
        textView3.setPadding(org.telegram.messenger.g0.L(5.33f), 0, org.telegram.messenger.g0.L(5.33f), 0);
        textView3.setTextColor(-1);
        textView3.setGravity(17);
        SpannableString spannableString = new SpannableString("s " + ((Object) j.J0(starrefprogram.commission_permille)));
        nq nqVar = new nq(R.drawable.msg_link_1, 0);
        nqVar.I = 0.65f;
        nqVar.J = 0.65f;
        nqVar.H = 0.7f;
        float L5 = org.telegram.messenger.g0.L(-2.0f);
        float L6 = org.telegram.messenger.g0.L(0.0f);
        nqVar.r = L5;
        nqVar.s = L6;
        spannableString.setSpan(nqVar, 0, 1, 33);
        textView3.setText(spannableString);
        frameLayout5.addView(textView3, ma.c(15.66f, -2));
        frameLayout4.addView(frameLayout5, ma.d(-2, -2.0f, 81, 0.0f, 0.0f, 0.0f, -4.0f));
        g10.addView(frameLayout, ma.t(-2, -2, 1, 0, 0, 0, 0));
        TextView textView4 = new TextView(context);
        int i15 = m6.G6;
        t6.U(textView4, i15, h6Var);
        textView4.setTextSize(1, 20.0f);
        textView4.setGravity(17);
        textView4.setText(hd.N0(2131752482, null));
        textView4.setTypeface(org.telegram.messenger.g0.o());
        g10.addView(textView4, ma.k(0.0f, 21.0f, 0.0f, 9.0f, -1, -2));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        int L7 = org.telegram.messenger.g0.L(28.0f);
        int i16 = m6.a7;
        ShapeDrawable d06 = m6.d0(L7, m6.w0(i16, h6Var));
        p6 M5 = t6.M(i16);
        linearLayout2.setBackground(d06);
        t6.j(linearLayout2, d06, M5, null, h6Var);
        TextView textView5 = new TextView(context);
        textView5.setTextSize(1, 13.0f);
        t6.U(textView5, i15, h6Var);
        textView5.setText(hd.a0(null, null, 2131752481, n5.l(i7, starrefprogram.bot_id)));
        linearLayout2.addView(textView5, ma.t(-2, -2, 16, 11, 0, 0, 0));
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(scaleType);
        int i17 = m6.r5;
        t6.s(imageView, i17, h6Var, mode);
        imageView.setImageResource(R.drawable.settings_arrow);
        imageView.setScaleX(1.2f);
        imageView.setScaleY(1.2f);
        linearLayout2.addView(imageView, ma.t(-2, -2, 16, 5, 0, 8, 0));
        g10.addView(linearLayout2, ma.t(-2, 28, 1, 4, 0, 4, 0));
        ra.a(linearLayout2);
        TextView textView6 = new TextView(context);
        t6.U(textView6, i15, h6Var);
        textView6.setTextSize(1, 14.0f);
        textView6.setGravity(17);
        ls.i(textView6);
        SpannableString spannableString2 = new SpannableString(pb.N0(starrefprogram.daily_revenue_per_user, 0.95f, ','));
        spannableString2.setSpan(new l41(org.telegram.messenger.g0.o()), 0, spannableString2.length(), 33);
        textView6.setText(pb.b1(false, hd.V(null, null, 2131752491, spannableString2), 0.725f, null));
        TextView f10 = o10.f(g10, textView6, ma.k(0.0f, 10.0f, 0.0f, 20.0f, -1, -2), context);
        t6.U(f10, i15, h6Var);
        f10.setTextSize(1, 14.0f);
        f10.setGravity(17);
        ls.i(f10);
        String q10 = p10.q(c22);
        String J0 = j.J0(starrefprogram.commission_permille);
        int i18 = starrefprogram.duration_months;
        if (i18 <= 0) {
            G = hd.N0(2131752489, null);
        } else {
            if (i18 < 12 || i18 % 12 != 0) {
                str = q10;
                r15 = 0;
                G = hd.G(i18, "ChannelAffiliateProgramJoinText_Months", new Object[0]);
                Object[] objArr = new Object[3];
                objArr[r15] = str;
                objArr[1] = J0;
                objArr[2] = G;
                f10.setText(j6.m(org.telegram.messenger.g0.W2(hd.a0(null, null, 2131752490, objArr)), f10.getPaint().getFontMetricsInt(), r15, null, r15));
                g10.addView(f10, ma.k(0.0f, 0.0f, 0.0f, 22.0f, -1, -2));
                if (j3 < 0) {
                    TextView textView7 = new TextView(context);
                    t6.U(textView7, i15, h6Var);
                    textView7.setTextSize(1, 14.0f);
                    org.telegram.messenger.f3.k(textView7, 17, null, 2131752474);
                    g10.addView(textView7, ma.k(20.0f, 0.0f, 20.0f, 0.0f, -1, -2));
                    LinearLayout linearLayout3 = new LinearLayout(context);
                    linearLayout3.setOrientation(0);
                    ShapeDrawable d07 = m6.d0(org.telegram.messenger.g0.L(28.0f), m6.w0(i16, h6Var));
                    p6 M6 = t6.M(i16);
                    linearLayout3.setBackground(d07);
                    t6.j(linearLayout3, d07, M6, null, h6Var);
                    int L8 = org.telegram.messenger.g0.L(28.0f);
                    int w02 = m6.w0(i16, h6Var);
                    int w03 = m6.w0(i16, h6Var);
                    int i19 = m6.i6;
                    int w10 = m6.w(w03, m6.w0(i19, h6Var));
                    org.telegram.ui.Cells.y k02 = m6.k0(L8, L8, L8, L8, w02, w10, w10);
                    p6 M7 = t6.M(i16);
                    p6 p10 = t6.p(i16, i19);
                    linearLayout3.setBackground(k02);
                    t6.j(linearLayout3, k02, M7, p10, h6Var);
                    q9 q9Var4 = new q9(context);
                    q9Var4.setRoundRadius(org.telegram.messenger.g0.L(14.0f));
                    linearLayout3.addView(q9Var4, ma.o(28, 28));
                    TextView textView8 = new TextView(context);
                    textView8.setTextSize(1, 13.0f);
                    t6.U(textView8, i15, h6Var);
                    linearLayout3.addView(textView8, ma.t(-2, -2, 16, 6, 0, 0, 0));
                    ImageView imageView2 = new ImageView(context);
                    imageView2.setScaleType(scaleType);
                    t6.s(imageView2, i17, h6Var, mode);
                    imageView2.setImageResource(R.drawable.arrows_select);
                    linearLayout3.addView(imageView2, ma.t(-2, -2, 16, 2, 0, 5, 0));
                    g10.addView(linearLayout3, ma.t(-2, 28, 1, 0, 11, 0, 20));
                    linearLayout = linearLayout3;
                    q9Var = q9Var4;
                    textView = textView8;
                } else {
                    q9Var = null;
                    textView = null;
                    linearLayout = null;
                }
                hi.e eVar = new hi.e(context, h6Var, true);
                eVar.i(hd.N0(2131752496, null), false, true);
                g10.addView(eVar, ma.o(-1, 48));
                m80 m80Var = new m80(context, h6Var);
                m80Var.setText(org.telegram.messenger.g0.T2(hd.N0(2131752495, null), new ai.a(context, 10)));
                m80Var.setGravity(17);
                m80Var.setTextSize(1, 12.0f);
                t6.U(m80Var, m6.B6, h6Var);
                t6.G(m80Var, m6.Xc, h6Var);
                g10.addView(m80Var, ma.t(-1, -2, 49, 14, 14, 14, 6));
                j10.O = g10;
                final int i20 = 1;
                q9Var2.setOnClickListener(new View.OnClickListener() { // from class: ki.t2
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i20) {
                            case 0:
                                org.telegram.ui.ActionBar.g2 T = LaunchActivity.T();
                                if (T != null) {
                                    org.telegram.ui.ActionBar.w2 w2Var = j10;
                                    w2Var.dismiss();
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("user_id", starrefprogram.bot_id);
                                    T.presentFragment(new c3(bundle, w2Var));
                                    break;
                                }
                                break;
                            default:
                                org.telegram.ui.ActionBar.g2 T2 = LaunchActivity.T();
                                if (T2 != null) {
                                    j10.dismiss();
                                    T2.presentFragment(ProfileActivity.D4(starrefprogram.bot_id));
                                    break;
                                }
                                break;
                        }
                    }
                });
                eVar.setOnClickListener(new z2(eVar, jArr, i7, starrefprogram, j10, j3, z10, context, h6Var, c22));
                j10.setOnDismissListener(new hi.f1(6));
                ai.i1 i1Var = new ai.i1(jArr, i7, q9Var3, q9Var, textView, 6);
                i1Var.run();
                if (linearLayout != null) {
                    di.e0.g(i7).n();
                    di.e0.g(i7).o();
                    LinearLayout linearLayout4 = linearLayout;
                    linearLayout4.setOnClickListener(new z9(i7, j10, h6Var, linearLayout4, jArr, i1Var));
                }
                final int i21 = 0;
                linearLayout2.setOnClickListener(new View.OnClickListener() { // from class: ki.t2
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i21) {
                            case 0:
                                org.telegram.ui.ActionBar.g2 T = LaunchActivity.T();
                                if (T != null) {
                                    org.telegram.ui.ActionBar.w2 w2Var = j10;
                                    w2Var.dismiss();
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("user_id", starrefprogram.bot_id);
                                    T.presentFragment(new c3(bundle, w2Var));
                                    break;
                                }
                                break;
                            default:
                                org.telegram.ui.ActionBar.g2 T2 = LaunchActivity.T();
                                if (T2 != null) {
                                    j10.dismiss();
                                    T2.presentFragment(ProfileActivity.D4(starrefprogram.bot_id));
                                    break;
                                }
                                break;
                        }
                    }
                });
                j10.Q(i13);
                j10.show();
            }
            G = hd.G(i18 / 12, "ChannelAffiliateProgramJoinText_Years", new Object[0]);
        }
        str = q10;
        r15 = 0;
        Object[] objArr2 = new Object[3];
        objArr2[r15] = str;
        objArr2[1] = J0;
        objArr2[2] = G;
        f10.setText(j6.m(org.telegram.messenger.g0.W2(hd.a0(null, null, 2131752490, objArr2)), f10.getPaint().getFontMetricsInt(), r15, null, r15));
        g10.addView(f10, ma.k(0.0f, 0.0f, 0.0f, 22.0f, -1, -2));
        if (j3 < 0) {
        }
        hi.e eVar2 = new hi.e(context, h6Var, true);
        eVar2.i(hd.N0(2131752496, null), false, true);
        g10.addView(eVar2, ma.o(-1, 48));
        m80 m80Var2 = new m80(context, h6Var);
        m80Var2.setText(org.telegram.messenger.g0.T2(hd.N0(2131752495, null), new ai.a(context, 10)));
        m80Var2.setGravity(17);
        m80Var2.setTextSize(1, 12.0f);
        t6.U(m80Var2, m6.B6, h6Var);
        t6.G(m80Var2, m6.Xc, h6Var);
        g10.addView(m80Var2, ma.t(-1, -2, 49, 14, 14, 14, 6));
        j10.O = g10;
        final int i202 = 1;
        q9Var2.setOnClickListener(new View.OnClickListener() { // from class: ki.t2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i202) {
                    case 0:
                        org.telegram.ui.ActionBar.g2 T = LaunchActivity.T();
                        if (T != null) {
                            org.telegram.ui.ActionBar.w2 w2Var = j10;
                            w2Var.dismiss();
                            Bundle bundle = new Bundle();
                            bundle.putLong("user_id", starrefprogram.bot_id);
                            T.presentFragment(new c3(bundle, w2Var));
                            break;
                        }
                        break;
                    default:
                        org.telegram.ui.ActionBar.g2 T2 = LaunchActivity.T();
                        if (T2 != null) {
                            j10.dismiss();
                            T2.presentFragment(ProfileActivity.D4(starrefprogram.bot_id));
                            break;
                        }
                        break;
                }
            }
        });
        eVar2.setOnClickListener(new z2(eVar2, jArr, i7, starrefprogram, j10, j3, z10, context, h6Var, c22));
        j10.setOnDismissListener(new hi.f1(6));
        ai.i1 i1Var2 = new ai.i1(jArr, i7, q9Var3, q9Var, textView, 6);
        i1Var2.run();
        if (linearLayout != null) {
        }
        final int i212 = 0;
        linearLayout2.setOnClickListener(new View.OnClickListener() { // from class: ki.t2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i212) {
                    case 0:
                        org.telegram.ui.ActionBar.g2 T = LaunchActivity.T();
                        if (T != null) {
                            org.telegram.ui.ActionBar.w2 w2Var = j10;
                            w2Var.dismiss();
                            Bundle bundle = new Bundle();
                            bundle.putLong("user_id", starrefprogram.bot_id);
                            T.presentFragment(new c3(bundle, w2Var));
                            break;
                        }
                        break;
                    default:
                        org.telegram.ui.ActionBar.g2 T2 = LaunchActivity.T();
                        if (T2 != null) {
                            j10.dismiss();
                            T2.presentFragment(ProfileActivity.D4(starrefprogram.bot_id));
                            break;
                        }
                        break;
                }
            }
        });
        j10.Q(i13);
        j10.show();
    }

    public static org.telegram.ui.ActionBar.w2 K0(Context context, int i7, TL_payments.connectedBotStarRef connectedbotstarref, long j3, h6 h6Var) {
        ImageView.ScaleType scaleType;
        LinearLayout linearLayout;
        int i10;
        org.telegram.ui.ActionBar.w2 w2Var;
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
        org.telegram.ui.ActionBar.w2 j10 = org.telegram.messenger.f3.j(1, context, h6Var, false);
        TLRPC.User c22 = np.u1(i7).c2(Long.valueOf(connectedbotstarref.bot_id));
        LinearLayout g10 = org.telegram.messenger.f3.g(context, 1);
        g10.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(8.0f));
        g10.setClipChildren(false);
        g10.setClipToPadding(false);
        FrameLayout frameLayout = new FrameLayout(context);
        View view = new View(context);
        Drawable L = m6.L(org.telegram.messenger.g0.L(40.0f), m6.w0(connectedbotstarref.revoked ? m6.nk : m6.Fi, h6Var));
        p6 M = t6.M(connectedbotstarref.revoked ? m6.nk : m6.Fi);
        view.setBackground(L);
        t6.j(view, L, M, null, h6Var);
        frameLayout.addView(view, ma.d(80, 80.0f, 49, 0.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        ImageView.ScaleType scaleType2 = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType2);
        imageView.setImageResource(connectedbotstarref.revoked ? R.drawable.msg_link_2 : R.drawable.msg_limit_links);
        imageView.setScaleX(connectedbotstarref.revoked ? 2.0f : 1.8f);
        imageView.setScaleY(connectedbotstarref.revoked ? 2.0f : 1.8f);
        frameLayout.addView(imageView, ma.d(80, 80.0f, 49, 0.0f, 0.0f, 0.0f, 0.0f));
        if (connectedbotstarref.participants > 0) {
            FrameLayout frameLayout2 = new FrameLayout(context);
            int L2 = org.telegram.messenger.g0.L(50.0f);
            int i12 = m6.h5;
            Drawable d02 = m6.d0(L2, m6.w0(i12, h6Var));
            p6 M2 = t6.M(i12);
            frameLayout2.setBackground(d02);
            t6.j(frameLayout2, d02, M2, null, h6Var);
            frameLayout.addView(frameLayout2, ma.d(-2, -2.0f, 49, 0.0f, 66.0f, 0.0f, 0.0f));
            TextView textView = new TextView(context);
            textView.setTypeface(org.telegram.messenger.g0.o());
            textView.setTextSize(1, 12.0f);
            Drawable d03 = m6.d0(org.telegram.messenger.g0.L(9.5f), m6.w0(connectedbotstarref.revoked ? m6.nk : m6.lk, h6Var));
            p6 M3 = t6.M(connectedbotstarref.revoked ? m6.nk : m6.lk);
            textView.setBackground(d03);
            t6.j(textView, d03, M3, null, h6Var);
            textView.setTextColor(-1);
            textView.setPadding(org.telegram.messenger.g0.L(6.66f), 0, org.telegram.messenger.g0.L(6.66f), 0);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) "s ");
            nq nqVar = new nq(R.drawable.mini_reply_user, 0);
            nqVar.I = 0.937f;
            nqVar.J = 0.937f;
            float f10 = -org.telegram.messenger.g0.L(1.33f);
            float L3 = org.telegram.messenger.g0.L(1.0f);
            nqVar.r = f10;
            nqVar.s = L3;
            nqVar.H = 0.8f;
            scaleType = scaleType2;
            spannableStringBuilder.setSpan(nqVar, 0, 1, 33);
            spannableStringBuilder.append((CharSequence) String.valueOf(connectedbotstarref.participants));
            textView.setText(spannableStringBuilder);
            textView.setGravity(17);
            frameLayout2.addView(textView, ma.d(-1, 19.0f, ls.E1, 1.33f, 1.33f, 1.33f, 1.33f));
        } else {
            scaleType = scaleType2;
        }
        g10.addView(frameLayout, ma.t(-2, -2, 1, 0, 0, 0, 0));
        TextView textView2 = new TextView(context);
        int i13 = m6.G6;
        t6.U(textView2, i13, h6Var);
        textView2.setTextSize(1, 20.0f);
        textView2.setGravity(17);
        textView2.setText(hd.N0(2131752470, null));
        textView2.setTypeface(org.telegram.messenger.g0.o());
        g10.addView(textView2, ma.k(20.0f, 16.0f, 20.0f, 9.33f, -1, -2));
        LinearLayout linearLayout3 = new LinearLayout(context);
        linearLayout3.setOrientation(0);
        int L4 = org.telegram.messenger.g0.L(28.0f);
        int i14 = m6.a7;
        ShapeDrawable d04 = m6.d0(L4, m6.w0(i14, h6Var));
        p6 M4 = t6.M(i14);
        linearLayout3.setBackground(d04);
        t6.j(linearLayout3, d04, M4, null, h6Var);
        q9 q9Var = new q9(context);
        q9Var.setRoundRadius(org.telegram.messenger.g0.L(14.0f));
        b9 b9Var = new b9((h6) null);
        linearLayout3.addView(q9Var, ma.o(28, 28));
        TextView textView3 = new TextView(context);
        textView3.setTextSize(1, 13.0f);
        t6.U(textView3, i13, h6Var);
        textView3.setText(n5.l(i7, connectedbotstarref.bot_id));
        b9Var.r(c22);
        q9Var.f(c22, b9Var);
        linearLayout3.addView(textView3, ma.t(-2, -2, 16, 6, 0, 0, 0));
        ImageView imageView2 = new ImageView(context);
        ImageView.ScaleType scaleType3 = scaleType;
        imageView2.setScaleType(scaleType3);
        int i15 = m6.r5;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        t6.s(imageView2, i15, h6Var, mode);
        imageView2.setImageResource(R.drawable.settings_arrow);
        imageView2.setScaleX(1.2f);
        imageView2.setScaleY(1.2f);
        linearLayout3.addView(imageView2, ma.t(-2, -2, 16, 5, 0, 8, 0));
        g10.addView(linearLayout3, ma.t(-2, 28, 1, 4, 0, 4, 0));
        ra.a(linearLayout3);
        TextView textView4 = new TextView(context);
        t6.U(textView4, i13, h6Var);
        textView4.setTextSize(1, 14.0f);
        textView4.setGravity(17);
        if (connectedbotstarref.revoked) {
            textView4.setText(org.telegram.messenger.g0.W2(hd.N0(2131752472, null)));
            i10 = i15;
            w2Var = j10;
            linearLayout = linearLayout3;
        } else {
            linearLayout = linearLayout3;
            if (j3 < 0) {
                String J0 = j.J0(connectedbotstarref.commission_permille);
                String q10 = p10.q(c22);
                int i16 = connectedbotstarref.duration_months;
                i10 = i15;
                w2Var = j10;
                if (i16 <= 0) {
                    G2 = hd.N0(2131752489, null);
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
                objArr[1] = q10;
                objArr[2] = G2;
                org.telegram.messenger.f3.q(null, null, 2131752473, objArr, textView4);
            } else {
                i10 = i15;
                w2Var = j10;
                String J02 = j.J0(connectedbotstarref.commission_permille);
                String q11 = p10.q(c22);
                int i17 = connectedbotstarref.duration_months;
                if (i17 <= 0) {
                    G = hd.N0(2131752489, null);
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
                objArr2[1] = q11;
                objArr2[2] = G;
                org.telegram.messenger.f3.q(null, null, 2131752471, objArr2, textView4);
            }
        }
        g10.addView(textView4, ma.k(20.0f, 19.0f, 20.0f, 18.0f, -1, -2));
        if (connectedbotstarref.revoked) {
            i11 = i14;
            linearLayout2 = null;
        } else {
            TextView textView5 = new TextView(context);
            t6.U(textView5, i13, h6Var);
            textView5.setTextSize(1, 14.0f);
            org.telegram.messenger.f3.k(textView5, 17, null, 2131752474);
            g10.addView(textView5, ma.k(20.0f, 0.0f, 20.0f, 0.0f, -1, -2));
            LinearLayout linearLayout4 = new LinearLayout(context);
            linearLayout4.setOrientation(0);
            Drawable d05 = m6.d0(org.telegram.messenger.g0.L(28.0f), m6.w0(i14, h6Var));
            p6 M5 = t6.M(i14);
            linearLayout4.setBackground(d05);
            t6.j(linearLayout4, d05, M5, null, h6Var);
            q9 q9Var2 = new q9(context);
            q9Var2.setRoundRadius(org.telegram.messenger.g0.L(14.0f));
            b9 b9Var2 = new b9((h6) null);
            linearLayout4.addView(q9Var2, ma.o(28, 28));
            TextView textView6 = new TextView(context);
            textView6.setTextSize(1, 13.0f);
            t6.U(textView6, i13, h6Var);
            if (j3 >= 0) {
                TLRPC.User c23 = np.u1(i7).c2(Long.valueOf(j3));
                b9Var2.r(c23);
                q9Var2.f(c23, b9Var2);
                textView6.setText(p10.q(c23));
                i11 = i14;
            } else {
                i11 = i14;
                TLRPC.Chat O0 = np.u1(i7).O0(Long.valueOf(-j3));
                b9Var2.q(O0);
                q9Var2.f(O0, b9Var2);
                textView6.setText(O0 == null ? "" : O0.title);
            }
            linearLayout4.addView(textView6, ma.t(-2, -2, 16, 6, 0, 0, 0));
            ImageView imageView3 = new ImageView(context);
            imageView3.setScaleType(scaleType3);
            t6.s(imageView3, i10, h6Var, mode);
            imageView3.setImageResource(R.drawable.arrows_select);
            linearLayout4.addView(imageView3, ma.t(-2, -2, 16, 2, 0, 5, 0));
            g10.addView(linearLayout4, ma.t(-2, 28, 1, 0, 9, 0, 22));
            linearLayout2 = linearLayout4;
        }
        TextView textView7 = new TextView(context);
        textView7.setTextSize(1, 16.0f);
        textView7.setGravity(17);
        t6.U(textView7, i13, h6Var);
        int L5 = org.telegram.messenger.g0.L(8.0f);
        int i18 = i11;
        int w02 = m6.w0(i18, h6Var);
        int w03 = m6.w0(i18, h6Var);
        int i19 = m6.i6;
        int w10 = m6.w(w03, m6.w0(i19, h6Var));
        org.telegram.ui.Cells.y k02 = m6.k0(L5, L5, L5, L5, w02, w10, w10);
        p6 M6 = t6.M(i18);
        p6 p10 = t6.p(i18, i19);
        textView7.setBackground(k02);
        t6.j(textView7, k02, M6, p10, h6Var);
        textView7.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(14.66f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(14.66f));
        String str = connectedbotstarref.url;
        textView7.setText((str == null || !str.startsWith("https://")) ? connectedbotstarref.url : connectedbotstarref.url.substring(8));
        g10.addView(textView7, ma.d(-1, -2.0f, 7, 0.0f, 0.0f, 0.0f, 12.0f));
        hi.e eVar = new hi.e(context, h6Var, true);
        if (connectedbotstarref.revoked) {
            eVar.i(hd.N0(2131752475, null), false, true);
        } else {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            spannableStringBuilder2.append((CharSequence) "c ");
            spannableStringBuilder2.setSpan(new nq(R.drawable.msg_copy_filled, 0), 0, 1, 33);
            spannableStringBuilder2.append((CharSequence) hd.N0(2131752480, null));
            eVar.i(spannableStringBuilder2, false, true);
        }
        g10.addView(eVar, ma.o(-1, 48));
        m80 m80Var = new m80(context, h6Var);
        long j11 = connectedbotstarref.participants;
        m80Var.setText(j11 <= 0 ? hd.a0(null, null, 2131752478, p10.q(c22)) : hd.G((int) j11, "ChannelAffiliateProgramLinkOpened", p10.q(c22)));
        m80Var.setGravity(17);
        m80Var.setTextSize(1, 12.0f);
        t6.U(m80Var, m6.B6, h6Var);
        t6.G(m80Var, m6.Xc, h6Var);
        g10.addView(m80Var, ma.t(-1, -2, 49, 14, 12, 14, 2));
        org.telegram.ui.ActionBar.w2 w2Var2 = w2Var;
        w2Var2.O = g10;
        ai.r rVar = new ai.r(connectedbotstarref, w2Var2, h6Var, c22, 26);
        if (!connectedbotstarref.revoked) {
            textView7.setOnClickListener(new o4(rVar, 12));
        }
        y2 y2Var = new y2(connectedbotstarref, i7, w2Var2, context, j3, h6Var, rVar);
        org.telegram.ui.ActionBar.w2 w2Var3 = w2Var2;
        eVar.setOnClickListener(y2Var);
        w2Var3.setOnDismissListener(new hi.f1(6));
        if (linearLayout2 != null) {
            di.e0.g(i7).n();
            di.e0.g(i7).o();
            LinearLayout linearLayout5 = linearLayout2;
            View.OnClickListener y2Var2 = new y2(i7, w2Var3, h6Var, linearLayout5, j3, context, connectedbotstarref);
            w2Var3 = w2Var3;
            connectedbotstarref2 = connectedbotstarref;
            linearLayout5.setOnClickListener(y2Var2);
        } else {
            connectedbotstarref2 = connectedbotstarref;
        }
        linearLayout.setOnClickListener(new ai.y2(28, w2Var3, connectedbotstarref2));
        w2Var3.Q(m6.h5);
        org.telegram.ui.ActionBar.g2 T = LaunchActivity.T();
        if (!org.telegram.messenger.g0.Q1() && T != null && !org.telegram.messenger.g0.u1(T)) {
            w2Var3.a0(T);
        }
        w2Var3.show();
        return w2Var3;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x01ba A[LOOP:0: B:20:0x01b4->B:22:0x01ba, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void I0(ArrayList arrayList, c51 c51Var) {
        int i7;
        SpannableString spannableString;
        int i10;
        if (getParentActivity() == null) {
            return;
        }
        uv uvVar = (uv) o0(getParentActivity());
        o41 o41Var = new o41(-2);
        o41Var.c = uvVar;
        arrayList.add(o41Var);
        arrayList.add(h.i(R.drawable.menu_feature_reliable, hd.N0(2131752501, null), hd.N0(2131752502, null)));
        arrayList.add(h.i(R.drawable.menu_feature_transparent, hd.N0(2131752499, null), hd.N0(2131752500, null)));
        arrayList.add(h.i(R.drawable.menu_feature_simple, hd.N0(2131752497, null), hd.N0(2131752498, null)));
        arrayList.add(o41.B(1, null));
        di.e0 g10 = di.e0.g(this.currentAccount);
        long j3 = this.S;
        di.b0 d = g10.d(j3);
        ArrayList arrayList2 = d.e;
        if (!arrayList2.isEmpty() || d.c > 0) {
            i5.c.s(2131752469, null, arrayList);
            for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) arrayList2.get(i11);
                int i12 = d3.b;
                o41 K = o41.K(d3.class);
                K.H = connectedbotstarref;
                K.s = true;
                arrayList.add(K);
            }
            if (!d.d || d.g) {
                arrayList.add(o41.p(29));
                arrayList.add(o41.p(29));
                arrayList.add(o41.p(29));
            }
            arrayList.add(o41.B(2, null));
        }
        di.c0 e10 = di.e0.g(this.currentAccount).e(j3);
        ArrayList arrayList3 = e10.e;
        if (!arrayList3.isEmpty() || e10.c > 0) {
            String N0 = hd.N0(2131752468, null);
            int i13 = e10.g;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) hd.N0(2131752467, null)).append((CharSequence) " ");
            if (i13 == 1) {
                spannableString = new SpannableString(hd.N0(2131752465, null) + "v");
            } else if (i13 == 2) {
                spannableString = new SpannableString(hd.N0(2131752464, null) + "v");
            } else if (i13 == 3) {
                spannableString = new SpannableString(hd.N0(2131752466, null) + "v");
            } else {
                i7 = 0;
                int i14 = f3.b;
                o41 K2 = o41.K(f3.class);
                K2.m = N0;
                K2.n = spannableStringBuilder;
                arrayList.add(K2);
                for (i10 = i7; i10 < arrayList3.size(); i10++) {
                    Object obj = arrayList3.get(i10);
                    int i15 = d3.b;
                    o41 K3 = o41.K(d3.class);
                    K3.H = obj;
                    K3.s = true;
                    arrayList.add(K3);
                }
                if (e10.d || e10.h) {
                    arrayList.add(o41.p(29));
                    arrayList.add(o41.p(29));
                    arrayList.add(o41.p(29));
                }
                arrayList.add(o41.B(3, null));
            }
            nq nqVar = new nq(R.drawable.arrow_more, 0);
            nqVar.f = true;
            nqVar.I = 0.6f;
            nqVar.J = 0.6f;
            spannableString.setSpan(nqVar, spannableString.length() - 1, spannableString.length(), 33);
            i7 = 0;
            spannableString.setSpan(new b3(this, i13, di.e0.g(this.currentAccount).e(j3)), 0, spannableString.length(), 33);
            spannableStringBuilder.append((CharSequence) spannableString);
            int i142 = f3.b;
            o41 K22 = o41.K(f3.class);
            K22.m = N0;
            K22.n = spannableStringBuilder;
            arrayList.add(K22);
            while (i10 < arrayList3.size()) {
            }
            if (e10.d) {
            }
            arrayList.add(o41.p(29));
            arrayList.add(o41.p(29));
            arrayList.add(o41.p(29));
            arrayList.add(o41.B(3, null));
        }
        arrayList.add(o41.k(this.V));
    }

    @Override // org.telegram.ui.s00, org.telegram.ui.ActionBar.g2
    public final View createView(Context context) {
        this.H = false;
        this.F = org.telegram.messenger.g0.L(238.0f);
        ln lnVar = new ln(context, 6);
        this.V = lnVar;
        t6.h(m6.i5, lnVar, null);
        super.createView(context);
        this.T = new FrameLayout(context);
        vg.m mVar = new vg.m(context, 1, 3);
        this.U = mVar;
        mVar.setImportantForAccessibility(4);
        vg.f fVar = this.U.b;
        fVar.z = m6.Wk;
        fVar.A = m6.Xk;
        fVar.b();
        this.U.setStarParticlesView(this.e);
        this.T.addView(this.U, ma.d(ls.U2, 190.0f, 17, 0.0f, 32.0f, 0.0f, 12.0f));
        j0(hd.N0(2131752460, null), org.telegram.messenger.g0.W2(hd.N0(2131752461, null)), this.T, null);
        this.c.setOnItemClickListener(new g4(2, this, context));
        this.c.setOnItemLongClickListener(new ab.g(25, this, context));
        v4.k kVar = new v4.k();
        kVar.m = false;
        kVar.C = false;
        kVar.o(nr.h);
        kVar.n(350L);
        this.c.setItemAnimator(kVar);
        this.c.setOnScrollListener(new bi.u1(this, 22));
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.gs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        g8 g8Var;
        int i11 = ls.O3;
        long j3 = this.S;
        if (i7 != i11) {
            if (i7 == ls.N3 && ((Long) objArr[0]).longValue() == j3 && (g8Var = this.W) != null) {
                g8Var.O(true);
                return;
            }
            return;
        }
        if (((Long) objArr[0]).longValue() == j3) {
            g8 g8Var2 = this.W;
            if (g8Var2 != null) {
                g8Var2.O(true);
            }
            di.e0.g(this.currentAccount).d(j3).a();
        }
    }

    @Override // org.telegram.ui.s00
    public final v4.i0 k0() {
        g8 g8Var = new g8(this, this.c, getParentActivity(), this.currentAccount, this.classGuid, new d7(this, 21), getResourceProvider(), 5);
        this.W = g8Var;
        return g8Var;
    }

    @Override // org.telegram.ui.s00
    public final ug.t1 m0() {
        e eVar = new e(getParentActivity(), 1);
        eVar.c();
        return eVar;
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final boolean onFragmentCreate() {
        ls.f(this.currentAccount).c(this, ls.O3);
        ls.f(this.currentAccount).c(this, ls.N3);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        ls.f(this.currentAccount).n(this, ls.O3);
        ls.f(this.currentAccount).n(this, ls.N3);
    }

    @Override // org.telegram.ui.s00, org.telegram.ui.ActionBar.g2
    public final void onPause() {
        super.onPause();
        vg.m mVar = this.U;
        if (mVar != null) {
            mVar.setPaused(true);
            this.U.setDialogVisible(true);
        }
    }

    @Override // org.telegram.ui.s00, org.telegram.ui.ActionBar.g2
    public final void onResume() {
        super.onResume();
        vg.m mVar = this.U;
        if (mVar != null) {
            mVar.setPaused(false);
            this.U.setDialogVisible(false);
        }
    }
}
