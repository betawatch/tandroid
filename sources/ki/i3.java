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
import bi.e8;
import c8.ma;
import c8.ra;
import di.pb;
import di.y9;
import fi.g4;
import hi.e7;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.fs;
import org.telegram.messenger.gd;
import org.telegram.messenger.j6;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.messenger.n10;
import org.telegram.messenger.n5;
import org.telegram.messenger.o10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.b9;
import org.telegram.ui.Components.i41;
import org.telegram.ui.Components.jn;
import org.telegram.ui.Components.k80;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.lq;
import org.telegram.ui.Components.lr;
import org.telegram.ui.Components.q9;
import org.telegram.ui.Components.y60;
import org.telegram.ui.Components.z41;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.s00;
import org.telegram.ui.uv;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public final class i3 extends s00 implements fs {
    public final long S;
    public FrameLayout T;
    public vg.m U;
    public jn V;
    public e8 W;

    public i3(long j3) {
        this.S = j3;
        this.N = true;
        this.M = org.telegram.messenger.g0.L(60.0f);
    }

    public static void A0(i3 i3Var, Context context, TLRPC.User user, TL_payments.connectedBotStarRef connectedbotstarref) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, i3Var.resourceProvider);
        String M0 = gd.M0(2131748815, null);
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
        u1Var.S = M0;
        u1Var.U = org.telegram.messenger.g0.W2(gd.a0(null, null, 2131748814, o10.q(user)));
        alertDialog$Builder.k(gd.M0(2131748813, null), new ab.g(24, i3Var, connectedbotstarref));
        alertDialog$Builder.h(gd.M0(2131752578, null), null);
        alertDialog$Builder.d(-1);
        alertDialog$Builder.p();
    }

    public static void B0(i3 i3Var, TL_payments.connectedBotStarRef connectedbotstarref) {
        org.telegram.ui.ActionBar.u1 u1Var = new org.telegram.ui.ActionBar.u1(3, i3Var.getParentActivity(), null);
        u1Var.r(200L);
        TL_payments.editConnectedStarRefBot editconnectedstarrefbot = new TL_payments.editConnectedStarRefBot();
        editconnectedstarrefbot.link = connectedbotstarref.url;
        editconnectedstarrefbot.peer = mp.u1(i3Var.currentAccount).l1(i3Var.S);
        editconnectedstarrefbot.revoked = true;
        i3Var.getConnectionsManager().sendRequest(editconnectedstarrefbot, new bi.k1(25, i3Var, u1Var));
    }

    public static /* synthetic */ void C0(i3 i3Var, Context context, int i7) {
        e8 e8Var = i3Var.W;
        if (e8Var == null) {
            return;
        }
        Object obj = e8Var.G(i7).H;
        if (obj instanceof TL_payments.starRefProgram) {
            J0(context, i3Var.currentAccount, (TL_payments.starRefProgram) obj, i3Var.S, i3Var.resourceProvider, false);
        } else if (obj instanceof TL_payments.connectedBotStarRef) {
            K0(context, i3Var.currentAccount, (TL_payments.connectedBotStarRef) obj, i3Var.S, i3Var.resourceProvider);
        }
    }

    public static void D0(i3 i3Var, TLObject tLObject, org.telegram.ui.ActionBar.u1 u1Var) {
        long j3 = i3Var.S;
        if (tLObject instanceof TL_payments.connectedStarRefBots) {
            TL_payments.connectedStarRefBots connectedstarrefbots = (TL_payments.connectedStarRefBots) tLObject;
            di.b0 d = di.e0.g(i3Var.currentAccount).d(j3);
            ArrayList arrayList = d.e;
            int i7 = d.a;
            mp.u1(i7).f4(connectedstarrefbots.users, false);
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
            ks.f(i7).k(ks.N3, Long.valueOf(d.b));
            d.a();
            di.c0 e10 = di.e0.g(i3Var.currentAccount).e(j3);
            e10.c = 0;
            e10.d = false;
            e10.i = false;
            e10.f = 0L;
            e10.j = null;
            e10.h = false;
            e10.a();
            i3Var.W.O(true);
        }
        u1Var.dismiss();
    }

    public static boolean E0(i3 i3Var, Context context, View view, int i7) {
        e8 e8Var = i3Var.W;
        if (e8Var != null) {
            Object obj = e8Var.G(i7).H;
            if (obj instanceof TL_payments.connectedBotStarRef) {
                TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) obj;
                TLRPC.User c22 = mp.u1(i3Var.currentAccount).c2(Long.valueOf(connectedbotstarref.bot_id));
                y60 I = y60.I(i3Var, view);
                I.l(R.drawable.msg_bot, gd.M0(2131746513, null), new kg.h0(10, i3Var, c22), c22.bot_has_main_app);
                I.l(R.drawable.msg_bot, gd.M0(2131752901, null), new kg.h0(11, i3Var, connectedbotstarref), !c22.bot_has_main_app);
                I.c(R.drawable.msg_link2, gd.M0(2131751751, null), new kg.i0(i3Var, connectedbotstarref, c22, 7), false);
                I.m(R.drawable.msg_leave, new ai.s(i3Var, context, c22, connectedbotstarref, 27), gd.M0(2131748813, null), !connectedbotstarref.revoked, true);
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
    public static void J0(Context context, int i7, final TL_payments.starRefProgram starrefprogram, long j3, i6 i6Var, boolean z10) {
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
        final org.telegram.ui.ActionBar.x2 j10 = org.telegram.messenger.f3.j(1, context, i6Var, false);
        long[] jArr2 = {j3};
        TLRPC.User c22 = mp.u1(i7).c2(Long.valueOf(starrefprogram.bot_id));
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
        b9 b9Var = new b9((i6) null);
        b9Var.r(c22);
        q9Var2.f(c22, b9Var);
        ra.a(q9Var2);
        frameLayout2.addView(q9Var2, ma.e(60, 60, ks.E1));
        if (starrefprogram.daily_revenue_per_user.positive()) {
            FrameLayout frameLayout3 = new FrameLayout(context);
            int L = org.telegram.messenger.g0.L(10.0f);
            int i10 = n6.h5;
            ShapeDrawable d02 = n6.d0(L, n6.w0(i10, i6Var));
            q6 M = u6.M(i10);
            frameLayout3.setBackground(d02);
            u6.j(frameLayout3, d02, M, null, i6Var);
            frameLayout3.setPadding(org.telegram.messenger.g0.L(1.33f), org.telegram.messenger.g0.L(1.33f), org.telegram.messenger.g0.L(1.33f), org.telegram.messenger.g0.L(1.33f));
            TextView textView2 = new TextView(context);
            int L2 = org.telegram.messenger.g0.L(10.0f);
            int i11 = n6.lk;
            ShapeDrawable d03 = n6.d0(L2, n6.w0(i11, i6Var));
            q6 M2 = u6.M(i11);
            textView2.setBackground(d03);
            u6.j(textView2, d03, M2, null, i6Var);
            textView2.setTypeface(org.telegram.messenger.g0.o());
            textView2.setTextSize(1, 10.0f);
            textView2.setPadding(org.telegram.messenger.g0.L(5.33f), 0, org.telegram.messenger.g0.L(5.33f), 0);
            textView2.setTextColor(-1);
            textView2.setGravity(17);
            StringBuilder sb2 = new StringBuilder("⭐️ ");
            jArr = jArr2;
            sb2.append((Object) pb.N0(starrefprogram.daily_revenue_per_user, 1.0f, ','));
            textView2.setText(pb.U0(sb2.toString(), 0.75f, new lq[1]));
            frameLayout3.addView(textView2, ma.c(15.66f, -2));
            frameLayout2.addView(frameLayout3, ma.d(-2, -2.0f, 81, 0.0f, 0.0f, 0.0f, -4.0f));
        } else {
            jArr = jArr2;
        }
        ImageView e10 = n10.e(context, R.drawable.msg_arrow_avatar);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        e10.setScaleType(scaleType);
        e10.setTranslationX(-org.telegram.messenger.g0.L(2.0825f));
        int i12 = n6.E6;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        u6.s(e10, i12, i6Var, mode);
        frameLayout.addView(e10, ma.d(36, 60.0f, 17, 60.0f, 0.0f, 60.0f, 0.0f));
        FrameLayout frameLayout4 = new FrameLayout(context);
        frameLayout4.setClipToPadding(false);
        frameLayout4.setClipChildren(false);
        frameLayout.addView(frameLayout4, ma.d(60, 60.0f, 21, 0.0f, 0.0f, 5.66f, 0.0f));
        q9 q9Var3 = new q9(context);
        q9Var3.setRoundRadius(org.telegram.messenger.g0.L(30.0f));
        frameLayout4.addView(q9Var3, ma.e(60, 60, ks.E1));
        FrameLayout frameLayout5 = new FrameLayout(context);
        int L3 = org.telegram.messenger.g0.L(10.0f);
        int i13 = n6.h5;
        Drawable d04 = n6.d0(L3, n6.w0(i13, i6Var));
        q6 M3 = u6.M(i13);
        frameLayout5.setBackground(d04);
        u6.j(frameLayout5, d04, M3, null, i6Var);
        frameLayout5.setPadding(org.telegram.messenger.g0.L(1.33f), org.telegram.messenger.g0.L(1.33f), org.telegram.messenger.g0.L(1.33f), org.telegram.messenger.g0.L(1.33f));
        TextView textView3 = new TextView(context);
        int L4 = org.telegram.messenger.g0.L(10.0f);
        int i14 = n6.Fi;
        Drawable d05 = n6.d0(L4, n6.w0(i14, i6Var));
        q6 M4 = u6.M(i14);
        textView3.setBackground(d05);
        u6.j(textView3, d05, M4, null, i6Var);
        textView3.setTypeface(org.telegram.messenger.g0.o());
        textView3.setTextSize(1, 10.0f);
        textView3.setPadding(org.telegram.messenger.g0.L(5.33f), 0, org.telegram.messenger.g0.L(5.33f), 0);
        textView3.setTextColor(-1);
        textView3.setGravity(17);
        SpannableString spannableString = new SpannableString("s " + ((Object) k.J0(starrefprogram.commission_permille)));
        lq lqVar = new lq(R.drawable.msg_link_1, 0);
        lqVar.I = 0.65f;
        lqVar.J = 0.65f;
        lqVar.H = 0.7f;
        float L5 = org.telegram.messenger.g0.L(-2.0f);
        float L6 = org.telegram.messenger.g0.L(0.0f);
        lqVar.r = L5;
        lqVar.s = L6;
        spannableString.setSpan(lqVar, 0, 1, 33);
        textView3.setText(spannableString);
        frameLayout5.addView(textView3, ma.c(15.66f, -2));
        frameLayout4.addView(frameLayout5, ma.d(-2, -2.0f, 81, 0.0f, 0.0f, 0.0f, -4.0f));
        g10.addView(frameLayout, ma.t(-2, -2, 1, 0, 0, 0, 0));
        TextView textView4 = new TextView(context);
        int i15 = n6.G6;
        u6.U(textView4, i15, i6Var);
        textView4.setTextSize(1, 20.0f);
        textView4.setGravity(17);
        textView4.setText(gd.M0(2131752483, null));
        textView4.setTypeface(org.telegram.messenger.g0.o());
        g10.addView(textView4, ma.k(0.0f, 21.0f, 0.0f, 9.0f, -1, -2));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        int L7 = org.telegram.messenger.g0.L(28.0f);
        int i16 = n6.a7;
        ShapeDrawable d06 = n6.d0(L7, n6.w0(i16, i6Var));
        q6 M5 = u6.M(i16);
        linearLayout2.setBackground(d06);
        u6.j(linearLayout2, d06, M5, null, i6Var);
        TextView textView5 = new TextView(context);
        textView5.setTextSize(1, 13.0f);
        u6.U(textView5, i15, i6Var);
        textView5.setText(gd.a0(null, null, 2131752482, n5.l(i7, starrefprogram.bot_id)));
        linearLayout2.addView(textView5, ma.t(-2, -2, 16, 11, 0, 0, 0));
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(scaleType);
        int i17 = n6.r5;
        u6.s(imageView, i17, i6Var, mode);
        imageView.setImageResource(R.drawable.settings_arrow);
        imageView.setScaleX(1.2f);
        imageView.setScaleY(1.2f);
        linearLayout2.addView(imageView, ma.t(-2, -2, 16, 5, 0, 8, 0));
        g10.addView(linearLayout2, ma.t(-2, 28, 1, 4, 0, 4, 0));
        ra.a(linearLayout2);
        TextView textView6 = new TextView(context);
        u6.U(textView6, i15, i6Var);
        textView6.setTextSize(1, 14.0f);
        textView6.setGravity(17);
        ks.i(textView6);
        SpannableString spannableString2 = new SpannableString(pb.N0(starrefprogram.daily_revenue_per_user, 0.95f, ','));
        spannableString2.setSpan(new i41(org.telegram.messenger.g0.o()), 0, spannableString2.length(), 33);
        textView6.setText(pb.b1(false, gd.V(null, null, 2131752492, spannableString2), 0.725f, null));
        TextView f10 = n10.f(g10, textView6, ma.k(0.0f, 10.0f, 0.0f, 20.0f, -1, -2), context);
        u6.U(f10, i15, i6Var);
        f10.setTextSize(1, 14.0f);
        f10.setGravity(17);
        ks.i(f10);
        String q10 = o10.q(c22);
        String J0 = k.J0(starrefprogram.commission_permille);
        int i18 = starrefprogram.duration_months;
        if (i18 <= 0) {
            G = gd.M0(2131752490, null);
        } else {
            if (i18 < 12 || i18 % 12 != 0) {
                str = q10;
                r15 = 0;
                G = gd.G(i18, "ChannelAffiliateProgramJoinText_Months", new Object[0]);
                Object[] objArr = new Object[3];
                objArr[r15] = str;
                objArr[1] = J0;
                objArr[2] = G;
                f10.setText(j6.m(org.telegram.messenger.g0.W2(gd.a0(null, null, 2131752491, objArr)), f10.getPaint().getFontMetricsInt(), r15, null, r15));
                g10.addView(f10, ma.k(0.0f, 0.0f, 0.0f, 22.0f, -1, -2));
                if (j3 < 0) {
                    TextView textView7 = new TextView(context);
                    u6.U(textView7, i15, i6Var);
                    textView7.setTextSize(1, 14.0f);
                    org.telegram.messenger.f3.k(textView7, 17, null, 2131752475);
                    g10.addView(textView7, ma.k(20.0f, 0.0f, 20.0f, 0.0f, -1, -2));
                    LinearLayout linearLayout3 = new LinearLayout(context);
                    linearLayout3.setOrientation(0);
                    ShapeDrawable d07 = n6.d0(org.telegram.messenger.g0.L(28.0f), n6.w0(i16, i6Var));
                    q6 M6 = u6.M(i16);
                    linearLayout3.setBackground(d07);
                    u6.j(linearLayout3, d07, M6, null, i6Var);
                    int L8 = org.telegram.messenger.g0.L(28.0f);
                    int w02 = n6.w0(i16, i6Var);
                    int w03 = n6.w0(i16, i6Var);
                    int i19 = n6.i6;
                    int w10 = n6.w(w03, n6.w0(i19, i6Var));
                    org.telegram.ui.Cells.y k02 = n6.k0(L8, L8, L8, L8, w02, w10, w10);
                    q6 M7 = u6.M(i16);
                    q6 p10 = u6.p(i16, i19);
                    linearLayout3.setBackground(k02);
                    u6.j(linearLayout3, k02, M7, p10, i6Var);
                    q9 q9Var4 = new q9(context);
                    q9Var4.setRoundRadius(org.telegram.messenger.g0.L(14.0f));
                    linearLayout3.addView(q9Var4, ma.o(28, 28));
                    TextView textView8 = new TextView(context);
                    textView8.setTextSize(1, 13.0f);
                    u6.U(textView8, i15, i6Var);
                    linearLayout3.addView(textView8, ma.t(-2, -2, 16, 6, 0, 0, 0));
                    ImageView imageView2 = new ImageView(context);
                    imageView2.setScaleType(scaleType);
                    u6.s(imageView2, i17, i6Var, mode);
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
                hi.d dVar = new hi.d(context, i6Var, true);
                dVar.i(gd.M0(2131752497, null), false, true);
                g10.addView(dVar, ma.o(-1, 48));
                k80 k80Var = new k80(context, i6Var);
                k80Var.setText(org.telegram.messenger.g0.T2(gd.M0(2131752496, null), new ai.a(context, 10)));
                k80Var.setGravity(17);
                k80Var.setTextSize(1, 12.0f);
                u6.U(k80Var, n6.B6, i6Var);
                u6.G(k80Var, n6.Xc, i6Var);
                g10.addView(k80Var, ma.t(-1, -2, 49, 14, 14, 14, 6));
                j10.O = g10;
                final int i20 = 1;
                q9Var2.setOnClickListener(new View.OnClickListener() { // from class: ki.u2
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i20) {
                            case 0:
                                org.telegram.ui.ActionBar.h2 T = LaunchActivity.T();
                                if (T != null) {
                                    org.telegram.ui.ActionBar.x2 x2Var = j10;
                                    x2Var.dismiss();
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("user_id", starrefprogram.bot_id);
                                    T.presentFragment(new d3(bundle, x2Var));
                                    break;
                                }
                                break;
                            default:
                                org.telegram.ui.ActionBar.h2 T2 = LaunchActivity.T();
                                if (T2 != null) {
                                    j10.dismiss();
                                    T2.presentFragment(ProfileActivity.D4(starrefprogram.bot_id));
                                    break;
                                }
                                break;
                        }
                    }
                });
                dVar.setOnClickListener(new a3(dVar, jArr, i7, starrefprogram, j10, j3, z10, context, i6Var, c22));
                j10.setOnDismissListener(new hi.f1(6));
                ai.g1 g1Var = new ai.g1(jArr, i7, q9Var3, q9Var, textView, 6);
                g1Var.run();
                if (linearLayout != null) {
                    di.e0.g(i7).n();
                    di.e0.g(i7).o();
                    LinearLayout linearLayout4 = linearLayout;
                    linearLayout4.setOnClickListener(new y9(i7, j10, i6Var, linearLayout4, jArr, g1Var));
                }
                final int i21 = 0;
                linearLayout2.setOnClickListener(new View.OnClickListener() { // from class: ki.u2
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i21) {
                            case 0:
                                org.telegram.ui.ActionBar.h2 T = LaunchActivity.T();
                                if (T != null) {
                                    org.telegram.ui.ActionBar.x2 x2Var = j10;
                                    x2Var.dismiss();
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("user_id", starrefprogram.bot_id);
                                    T.presentFragment(new d3(bundle, x2Var));
                                    break;
                                }
                                break;
                            default:
                                org.telegram.ui.ActionBar.h2 T2 = LaunchActivity.T();
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
            G = gd.G(i18 / 12, "ChannelAffiliateProgramJoinText_Years", new Object[0]);
        }
        str = q10;
        r15 = 0;
        Object[] objArr2 = new Object[3];
        objArr2[r15] = str;
        objArr2[1] = J0;
        objArr2[2] = G;
        f10.setText(j6.m(org.telegram.messenger.g0.W2(gd.a0(null, null, 2131752491, objArr2)), f10.getPaint().getFontMetricsInt(), r15, null, r15));
        g10.addView(f10, ma.k(0.0f, 0.0f, 0.0f, 22.0f, -1, -2));
        if (j3 < 0) {
        }
        hi.d dVar2 = new hi.d(context, i6Var, true);
        dVar2.i(gd.M0(2131752497, null), false, true);
        g10.addView(dVar2, ma.o(-1, 48));
        k80 k80Var2 = new k80(context, i6Var);
        k80Var2.setText(org.telegram.messenger.g0.T2(gd.M0(2131752496, null), new ai.a(context, 10)));
        k80Var2.setGravity(17);
        k80Var2.setTextSize(1, 12.0f);
        u6.U(k80Var2, n6.B6, i6Var);
        u6.G(k80Var2, n6.Xc, i6Var);
        g10.addView(k80Var2, ma.t(-1, -2, 49, 14, 14, 14, 6));
        j10.O = g10;
        final int i202 = 1;
        q9Var2.setOnClickListener(new View.OnClickListener() { // from class: ki.u2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i202) {
                    case 0:
                        org.telegram.ui.ActionBar.h2 T = LaunchActivity.T();
                        if (T != null) {
                            org.telegram.ui.ActionBar.x2 x2Var = j10;
                            x2Var.dismiss();
                            Bundle bundle = new Bundle();
                            bundle.putLong("user_id", starrefprogram.bot_id);
                            T.presentFragment(new d3(bundle, x2Var));
                            break;
                        }
                        break;
                    default:
                        org.telegram.ui.ActionBar.h2 T2 = LaunchActivity.T();
                        if (T2 != null) {
                            j10.dismiss();
                            T2.presentFragment(ProfileActivity.D4(starrefprogram.bot_id));
                            break;
                        }
                        break;
                }
            }
        });
        dVar2.setOnClickListener(new a3(dVar2, jArr, i7, starrefprogram, j10, j3, z10, context, i6Var, c22));
        j10.setOnDismissListener(new hi.f1(6));
        ai.g1 g1Var2 = new ai.g1(jArr, i7, q9Var3, q9Var, textView, 6);
        g1Var2.run();
        if (linearLayout != null) {
        }
        final int i212 = 0;
        linearLayout2.setOnClickListener(new View.OnClickListener() { // from class: ki.u2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i212) {
                    case 0:
                        org.telegram.ui.ActionBar.h2 T = LaunchActivity.T();
                        if (T != null) {
                            org.telegram.ui.ActionBar.x2 x2Var = j10;
                            x2Var.dismiss();
                            Bundle bundle = new Bundle();
                            bundle.putLong("user_id", starrefprogram.bot_id);
                            T.presentFragment(new d3(bundle, x2Var));
                            break;
                        }
                        break;
                    default:
                        org.telegram.ui.ActionBar.h2 T2 = LaunchActivity.T();
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

    public static org.telegram.ui.ActionBar.x2 K0(Context context, int i7, TL_payments.connectedBotStarRef connectedbotstarref, long j3, i6 i6Var) {
        ImageView.ScaleType scaleType;
        LinearLayout linearLayout;
        int i10;
        org.telegram.ui.ActionBar.x2 x2Var;
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
        org.telegram.ui.ActionBar.x2 j10 = org.telegram.messenger.f3.j(1, context, i6Var, false);
        TLRPC.User c22 = mp.u1(i7).c2(Long.valueOf(connectedbotstarref.bot_id));
        LinearLayout g10 = org.telegram.messenger.f3.g(context, 1);
        g10.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(8.0f));
        g10.setClipChildren(false);
        g10.setClipToPadding(false);
        FrameLayout frameLayout = new FrameLayout(context);
        View view = new View(context);
        Drawable L = n6.L(org.telegram.messenger.g0.L(40.0f), n6.w0(connectedbotstarref.revoked ? n6.nk : n6.Fi, i6Var));
        q6 M = u6.M(connectedbotstarref.revoked ? n6.nk : n6.Fi);
        view.setBackground(L);
        u6.j(view, L, M, null, i6Var);
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
            int i12 = n6.h5;
            Drawable d02 = n6.d0(L2, n6.w0(i12, i6Var));
            q6 M2 = u6.M(i12);
            frameLayout2.setBackground(d02);
            u6.j(frameLayout2, d02, M2, null, i6Var);
            frameLayout.addView(frameLayout2, ma.d(-2, -2.0f, 49, 0.0f, 66.0f, 0.0f, 0.0f));
            TextView textView = new TextView(context);
            textView.setTypeface(org.telegram.messenger.g0.o());
            textView.setTextSize(1, 12.0f);
            Drawable d03 = n6.d0(org.telegram.messenger.g0.L(9.5f), n6.w0(connectedbotstarref.revoked ? n6.nk : n6.lk, i6Var));
            q6 M3 = u6.M(connectedbotstarref.revoked ? n6.nk : n6.lk);
            textView.setBackground(d03);
            u6.j(textView, d03, M3, null, i6Var);
            textView.setTextColor(-1);
            textView.setPadding(org.telegram.messenger.g0.L(6.66f), 0, org.telegram.messenger.g0.L(6.66f), 0);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) "s ");
            lq lqVar = new lq(R.drawable.mini_reply_user, 0);
            lqVar.I = 0.937f;
            lqVar.J = 0.937f;
            float f10 = -org.telegram.messenger.g0.L(1.33f);
            float L3 = org.telegram.messenger.g0.L(1.0f);
            lqVar.r = f10;
            lqVar.s = L3;
            lqVar.H = 0.8f;
            scaleType = scaleType2;
            spannableStringBuilder.setSpan(lqVar, 0, 1, 33);
            spannableStringBuilder.append((CharSequence) String.valueOf(connectedbotstarref.participants));
            textView.setText(spannableStringBuilder);
            textView.setGravity(17);
            frameLayout2.addView(textView, ma.d(-1, 19.0f, ks.E1, 1.33f, 1.33f, 1.33f, 1.33f));
        } else {
            scaleType = scaleType2;
        }
        g10.addView(frameLayout, ma.t(-2, -2, 1, 0, 0, 0, 0));
        TextView textView2 = new TextView(context);
        int i13 = n6.G6;
        u6.U(textView2, i13, i6Var);
        textView2.setTextSize(1, 20.0f);
        textView2.setGravity(17);
        textView2.setText(gd.M0(2131752471, null));
        textView2.setTypeface(org.telegram.messenger.g0.o());
        g10.addView(textView2, ma.k(20.0f, 16.0f, 20.0f, 9.33f, -1, -2));
        LinearLayout linearLayout3 = new LinearLayout(context);
        linearLayout3.setOrientation(0);
        int L4 = org.telegram.messenger.g0.L(28.0f);
        int i14 = n6.a7;
        ShapeDrawable d04 = n6.d0(L4, n6.w0(i14, i6Var));
        q6 M4 = u6.M(i14);
        linearLayout3.setBackground(d04);
        u6.j(linearLayout3, d04, M4, null, i6Var);
        q9 q9Var = new q9(context);
        q9Var.setRoundRadius(org.telegram.messenger.g0.L(14.0f));
        b9 b9Var = new b9((i6) null);
        linearLayout3.addView(q9Var, ma.o(28, 28));
        TextView textView3 = new TextView(context);
        textView3.setTextSize(1, 13.0f);
        u6.U(textView3, i13, i6Var);
        textView3.setText(n5.l(i7, connectedbotstarref.bot_id));
        b9Var.r(c22);
        q9Var.f(c22, b9Var);
        linearLayout3.addView(textView3, ma.t(-2, -2, 16, 6, 0, 0, 0));
        ImageView imageView2 = new ImageView(context);
        ImageView.ScaleType scaleType3 = scaleType;
        imageView2.setScaleType(scaleType3);
        int i15 = n6.r5;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        u6.s(imageView2, i15, i6Var, mode);
        imageView2.setImageResource(R.drawable.settings_arrow);
        imageView2.setScaleX(1.2f);
        imageView2.setScaleY(1.2f);
        linearLayout3.addView(imageView2, ma.t(-2, -2, 16, 5, 0, 8, 0));
        g10.addView(linearLayout3, ma.t(-2, 28, 1, 4, 0, 4, 0));
        ra.a(linearLayout3);
        TextView textView4 = new TextView(context);
        u6.U(textView4, i13, i6Var);
        textView4.setTextSize(1, 14.0f);
        textView4.setGravity(17);
        if (connectedbotstarref.revoked) {
            textView4.setText(org.telegram.messenger.g0.W2(gd.M0(2131752473, null)));
            i10 = i15;
            x2Var = j10;
            linearLayout = linearLayout3;
        } else {
            linearLayout = linearLayout3;
            if (j3 < 0) {
                String J0 = k.J0(connectedbotstarref.commission_permille);
                String q10 = o10.q(c22);
                int i16 = connectedbotstarref.duration_months;
                i10 = i15;
                x2Var = j10;
                if (i16 <= 0) {
                    G2 = gd.M0(2131752490, null);
                    c11 = 0;
                } else if (i16 < 12 || i16 % 12 != 0) {
                    c11 = 0;
                    G2 = gd.G(i16, "ChannelAffiliateProgramJoinText_Months", new Object[0]);
                } else {
                    c11 = 0;
                    G2 = gd.G(i16 / 12, "ChannelAffiliateProgramJoinText_Years", new Object[0]);
                }
                Object[] objArr = new Object[3];
                objArr[c11] = J0;
                objArr[1] = q10;
                objArr[2] = G2;
                org.telegram.messenger.f3.q(null, null, 2131752474, objArr, textView4);
            } else {
                i10 = i15;
                x2Var = j10;
                String J02 = k.J0(connectedbotstarref.commission_permille);
                String q11 = o10.q(c22);
                int i17 = connectedbotstarref.duration_months;
                if (i17 <= 0) {
                    G = gd.M0(2131752490, null);
                    c10 = 0;
                } else if (i17 < 12 || i17 % 12 != 0) {
                    c10 = 0;
                    G = gd.G(i17, "ChannelAffiliateProgramJoinText_Months", new Object[0]);
                } else {
                    c10 = 0;
                    G = gd.G(i17 / 12, "ChannelAffiliateProgramJoinText_Years", new Object[0]);
                }
                Object[] objArr2 = new Object[3];
                objArr2[c10] = J02;
                objArr2[1] = q11;
                objArr2[2] = G;
                org.telegram.messenger.f3.q(null, null, 2131752472, objArr2, textView4);
            }
        }
        g10.addView(textView4, ma.k(20.0f, 19.0f, 20.0f, 18.0f, -1, -2));
        if (connectedbotstarref.revoked) {
            i11 = i14;
            linearLayout2 = null;
        } else {
            TextView textView5 = new TextView(context);
            u6.U(textView5, i13, i6Var);
            textView5.setTextSize(1, 14.0f);
            org.telegram.messenger.f3.k(textView5, 17, null, 2131752475);
            g10.addView(textView5, ma.k(20.0f, 0.0f, 20.0f, 0.0f, -1, -2));
            LinearLayout linearLayout4 = new LinearLayout(context);
            linearLayout4.setOrientation(0);
            Drawable d05 = n6.d0(org.telegram.messenger.g0.L(28.0f), n6.w0(i14, i6Var));
            q6 M5 = u6.M(i14);
            linearLayout4.setBackground(d05);
            u6.j(linearLayout4, d05, M5, null, i6Var);
            q9 q9Var2 = new q9(context);
            q9Var2.setRoundRadius(org.telegram.messenger.g0.L(14.0f));
            b9 b9Var2 = new b9((i6) null);
            linearLayout4.addView(q9Var2, ma.o(28, 28));
            TextView textView6 = new TextView(context);
            textView6.setTextSize(1, 13.0f);
            u6.U(textView6, i13, i6Var);
            if (j3 >= 0) {
                TLRPC.User c23 = mp.u1(i7).c2(Long.valueOf(j3));
                b9Var2.r(c23);
                q9Var2.f(c23, b9Var2);
                textView6.setText(o10.q(c23));
                i11 = i14;
            } else {
                i11 = i14;
                TLRPC.Chat O0 = mp.u1(i7).O0(Long.valueOf(-j3));
                b9Var2.q(O0);
                q9Var2.f(O0, b9Var2);
                textView6.setText(O0 == null ? "" : O0.title);
            }
            linearLayout4.addView(textView6, ma.t(-2, -2, 16, 6, 0, 0, 0));
            ImageView imageView3 = new ImageView(context);
            imageView3.setScaleType(scaleType3);
            u6.s(imageView3, i10, i6Var, mode);
            imageView3.setImageResource(R.drawable.arrows_select);
            linearLayout4.addView(imageView3, ma.t(-2, -2, 16, 2, 0, 5, 0));
            g10.addView(linearLayout4, ma.t(-2, 28, 1, 0, 9, 0, 22));
            linearLayout2 = linearLayout4;
        }
        TextView textView7 = new TextView(context);
        textView7.setTextSize(1, 16.0f);
        textView7.setGravity(17);
        u6.U(textView7, i13, i6Var);
        int L5 = org.telegram.messenger.g0.L(8.0f);
        int i18 = i11;
        int w02 = n6.w0(i18, i6Var);
        int w03 = n6.w0(i18, i6Var);
        int i19 = n6.i6;
        int w10 = n6.w(w03, n6.w0(i19, i6Var));
        org.telegram.ui.Cells.y k02 = n6.k0(L5, L5, L5, L5, w02, w10, w10);
        q6 M6 = u6.M(i18);
        q6 p10 = u6.p(i18, i19);
        textView7.setBackground(k02);
        u6.j(textView7, k02, M6, p10, i6Var);
        textView7.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(14.66f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(14.66f));
        String str = connectedbotstarref.url;
        textView7.setText((str == null || !str.startsWith("https://")) ? connectedbotstarref.url : connectedbotstarref.url.substring(8));
        g10.addView(textView7, ma.d(-1, -2.0f, 7, 0.0f, 0.0f, 0.0f, 12.0f));
        hi.d dVar = new hi.d(context, i6Var, true);
        if (connectedbotstarref.revoked) {
            dVar.i(gd.M0(2131752476, null), false, true);
        } else {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            spannableStringBuilder2.append((CharSequence) "c ");
            spannableStringBuilder2.setSpan(new lq(R.drawable.msg_copy_filled, 0), 0, 1, 33);
            spannableStringBuilder2.append((CharSequence) gd.M0(2131752481, null));
            dVar.i(spannableStringBuilder2, false, true);
        }
        g10.addView(dVar, ma.o(-1, 48));
        k80 k80Var = new k80(context, i6Var);
        long j11 = connectedbotstarref.participants;
        k80Var.setText(j11 <= 0 ? gd.a0(null, null, 2131752479, o10.q(c22)) : gd.G((int) j11, "ChannelAffiliateProgramLinkOpened", o10.q(c22)));
        k80Var.setGravity(17);
        k80Var.setTextSize(1, 12.0f);
        u6.U(k80Var, n6.B6, i6Var);
        u6.G(k80Var, n6.Xc, i6Var);
        g10.addView(k80Var, ma.t(-1, -2, 49, 14, 12, 14, 2));
        org.telegram.ui.ActionBar.x2 x2Var2 = x2Var;
        x2Var2.O = g10;
        ai.s sVar = new ai.s(connectedbotstarref, x2Var2, i6Var, c22, 26);
        if (!connectedbotstarref.revoked) {
            textView7.setOnClickListener(new hi.o0(sVar, 13));
        }
        z2 z2Var = new z2(connectedbotstarref, i7, x2Var2, context, j3, i6Var, sVar);
        org.telegram.ui.ActionBar.x2 x2Var3 = x2Var2;
        dVar.setOnClickListener(z2Var);
        x2Var3.setOnDismissListener(new hi.f1(6));
        if (linearLayout2 != null) {
            di.e0.g(i7).n();
            di.e0.g(i7).o();
            LinearLayout linearLayout5 = linearLayout2;
            View.OnClickListener z2Var2 = new z2(i7, x2Var3, i6Var, linearLayout5, j3, context, connectedbotstarref);
            x2Var3 = x2Var3;
            connectedbotstarref2 = connectedbotstarref;
            linearLayout5.setOnClickListener(z2Var2);
        } else {
            connectedbotstarref2 = connectedbotstarref;
        }
        linearLayout.setOnClickListener(new ai.v2(29, x2Var3, connectedbotstarref2));
        x2Var3.Q(n6.h5);
        org.telegram.ui.ActionBar.h2 T = LaunchActivity.T();
        if (!org.telegram.messenger.g0.Q1() && T != null && !org.telegram.messenger.g0.u1(T)) {
            x2Var3.a0(T);
        }
        x2Var3.show();
        return x2Var3;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x01ba A[LOOP:0: B:20:0x01b4->B:22:0x01ba, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void I0(ArrayList arrayList, z41 z41Var) {
        int i7;
        SpannableString spannableString;
        int i10;
        if (getParentActivity() == null) {
            return;
        }
        uv uvVar = (uv) o0(getParentActivity());
        l41 l41Var = new l41(-2);
        l41Var.c = uvVar;
        arrayList.add(l41Var);
        arrayList.add(i.i(R.drawable.menu_feature_reliable, gd.M0(2131752502, null), gd.M0(2131752503, null)));
        arrayList.add(i.i(R.drawable.menu_feature_transparent, gd.M0(2131752500, null), gd.M0(2131752501, null)));
        arrayList.add(i.i(R.drawable.menu_feature_simple, gd.M0(2131752498, null), gd.M0(2131752499, null)));
        arrayList.add(l41.B(1, null));
        di.e0 g10 = di.e0.g(this.currentAccount);
        long j3 = this.S;
        di.b0 d = g10.d(j3);
        ArrayList arrayList2 = d.e;
        if (!arrayList2.isEmpty() || d.c > 0) {
            i5.c.s(2131752470, null, arrayList);
            for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) arrayList2.get(i11);
                int i12 = e3.b;
                l41 K = l41.K(e3.class);
                K.H = connectedbotstarref;
                K.s = true;
                arrayList.add(K);
            }
            if (!d.d || d.g) {
                arrayList.add(l41.p(29));
                arrayList.add(l41.p(29));
                arrayList.add(l41.p(29));
            }
            arrayList.add(l41.B(2, null));
        }
        di.c0 e10 = di.e0.g(this.currentAccount).e(j3);
        ArrayList arrayList3 = e10.e;
        if (!arrayList3.isEmpty() || e10.c > 0) {
            String M0 = gd.M0(2131752469, null);
            int i13 = e10.g;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) gd.M0(2131752468, null)).append((CharSequence) " ");
            if (i13 == 1) {
                spannableString = new SpannableString(gd.M0(2131752466, null) + "v");
            } else if (i13 == 2) {
                spannableString = new SpannableString(gd.M0(2131752465, null) + "v");
            } else if (i13 == 3) {
                spannableString = new SpannableString(gd.M0(2131752467, null) + "v");
            } else {
                i7 = 0;
                int i14 = g3.b;
                l41 K2 = l41.K(g3.class);
                K2.m = M0;
                K2.n = spannableStringBuilder;
                arrayList.add(K2);
                for (i10 = i7; i10 < arrayList3.size(); i10++) {
                    Object obj = arrayList3.get(i10);
                    int i15 = e3.b;
                    l41 K3 = l41.K(e3.class);
                    K3.H = obj;
                    K3.s = true;
                    arrayList.add(K3);
                }
                if (e10.d || e10.h) {
                    arrayList.add(l41.p(29));
                    arrayList.add(l41.p(29));
                    arrayList.add(l41.p(29));
                }
                arrayList.add(l41.B(3, null));
            }
            lq lqVar = new lq(R.drawable.arrow_more, 0);
            lqVar.f = true;
            lqVar.I = 0.6f;
            lqVar.J = 0.6f;
            spannableString.setSpan(lqVar, spannableString.length() - 1, spannableString.length(), 33);
            i7 = 0;
            spannableString.setSpan(new c3(this, i13, di.e0.g(this.currentAccount).e(j3)), 0, spannableString.length(), 33);
            spannableStringBuilder.append((CharSequence) spannableString);
            int i142 = g3.b;
            l41 K22 = l41.K(g3.class);
            K22.m = M0;
            K22.n = spannableStringBuilder;
            arrayList.add(K22);
            while (i10 < arrayList3.size()) {
            }
            if (e10.d) {
            }
            arrayList.add(l41.p(29));
            arrayList.add(l41.p(29));
            arrayList.add(l41.p(29));
            arrayList.add(l41.B(3, null));
        }
        arrayList.add(l41.k(this.V));
    }

    @Override // org.telegram.ui.s00, org.telegram.ui.ActionBar.h2
    public final View createView(Context context) {
        this.H = false;
        this.F = org.telegram.messenger.g0.L(238.0f);
        jn jnVar = new jn(context, 6);
        this.V = jnVar;
        u6.h(n6.i5, jnVar, null);
        super.createView(context);
        this.T = new FrameLayout(context);
        vg.m mVar = new vg.m(context, 1, 3);
        this.U = mVar;
        mVar.setImportantForAccessibility(4);
        vg.f fVar = this.U.b;
        fVar.z = n6.Wk;
        fVar.A = n6.Xk;
        fVar.b();
        this.U.setStarParticlesView(this.e);
        this.T.addView(this.U, ma.d(ks.U2, 190.0f, 17, 0.0f, 32.0f, 0.0f, 12.0f));
        j0(gd.M0(2131752461, null), org.telegram.messenger.g0.W2(gd.M0(2131752462, null)), this.T, null);
        this.c.setOnItemClickListener(new g4(2, this, context));
        this.c.setOnItemLongClickListener(new ab.g(25, this, context));
        v4.k kVar = new v4.k();
        kVar.m = false;
        kVar.C = false;
        kVar.o(lr.h);
        kVar.n(350L);
        this.c.setItemAnimator(kVar);
        this.c.setOnScrollListener(new bi.q1(this, 22));
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.fs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        e8 e8Var;
        int i11 = ks.N3;
        long j3 = this.S;
        if (i7 != i11) {
            if (i7 == ks.M3 && ((Long) objArr[0]).longValue() == j3 && (e8Var = this.W) != null) {
                e8Var.O(true);
                return;
            }
            return;
        }
        if (((Long) objArr[0]).longValue() == j3) {
            e8 e8Var2 = this.W;
            if (e8Var2 != null) {
                e8Var2.O(true);
            }
            di.e0.g(this.currentAccount).d(j3).a();
        }
    }

    @Override // org.telegram.ui.s00
    public final v4.i0 k0() {
        e8 e8Var = new e8(this, this.c, getParentActivity(), this.currentAccount, this.classGuid, new e7(this, 21), getResourceProvider(), 5);
        this.W = e8Var;
        return e8Var;
    }

    @Override // org.telegram.ui.s00
    public final ug.u1 m0() {
        f fVar = new f(getParentActivity(), 1);
        fVar.c();
        return fVar;
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final boolean onFragmentCreate() {
        ks.f(this.currentAccount).c(this, ks.N3);
        ks.f(this.currentAccount).c(this, ks.M3);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        ks.f(this.currentAccount).n(this, ks.N3);
        ks.f(this.currentAccount).n(this, ks.M3);
    }

    @Override // org.telegram.ui.s00, org.telegram.ui.ActionBar.h2
    public final void onPause() {
        super.onPause();
        vg.m mVar = this.U;
        if (mVar != null) {
            mVar.setPaused(true);
            this.U.setDialogVisible(true);
        }
    }

    @Override // org.telegram.ui.s00, org.telegram.ui.ActionBar.h2
    public final void onResume() {
        super.onResume();
        vg.m mVar = this.U;
        if (mVar != null) {
            mVar.setPaused(false);
            this.U.setDialogVisible(false);
        }
    }
}
