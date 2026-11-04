package ii;

import ai.f6;
import ai.j5;
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
import b8.mf;
import b8.pf;
import ci.ga;
import ci.wb;
import ei.h9;
import java.util.ArrayList;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cs;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.messenger.i6;
import org.telegram.messenger.k5;
import org.telegram.messenger.l10;
import org.telegram.messenger.m5;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.f60;
import org.telegram.ui.Components.k9;
import org.telegram.ui.Components.o31;
import org.telegram.ui.Components.r31;
import org.telegram.ui.Components.s70;
import org.telegram.ui.Components.sm;
import org.telegram.ui.Components.u8;
import org.telegram.ui.Components.wp;
import org.telegram.ui.Components.xq;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.l00;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class q3 extends l00 implements cs {
    public final long S;
    public FrameLayout T;
    public wg.m U;
    public sm V;
    public f6 W;

    public q3(long j10) {
        this.S = j10;
        this.N = true;
        this.M = org.telegram.messenger.g0.L(60.0f);
    }

    public static void A0(q3 q3Var, Context context, TLRPC.User user, TL_payments.connectedBotStarRef connectedbotstarref) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, q3Var.resourceProvider);
        String M0 = bd.M0(2131749015, null);
        org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
        s1Var.S = M0;
        s1Var.U = org.telegram.messenger.g0.X2(bd.a0(null, null, 2131749014, l10.p(user)));
        alertDialog$Builder.k(bd.M0(2131749013, null), new ai.n(19, q3Var, connectedbotstarref));
        alertDialog$Builder.h(bd.M0(2131752589, null), null);
        alertDialog$Builder.d(-1);
        alertDialog$Builder.p();
    }

    public static void B0(q3 q3Var, TL_payments.connectedBotStarRef connectedbotstarref) {
        org.telegram.ui.ActionBar.s1 s1Var = new org.telegram.ui.ActionBar.s1(3, q3Var.getParentActivity(), null);
        s1Var.r(200L);
        TL_payments.editConnectedStarRefBot editconnectedstarrefbot = new TL_payments.editConnectedStarRefBot();
        editconnectedstarrefbot.link = connectedbotstarref.url;
        editconnectedstarrefbot.peer = hp.s1(q3Var.currentAccount).j1(q3Var.S);
        editconnectedstarrefbot.revoked = true;
        q3Var.getConnectionsManager().sendRequest(editconnectedstarrefbot, new ai.f3(19, q3Var, s1Var));
    }

    public static /* synthetic */ void C0(q3 q3Var, Context context, int i3) {
        f6 f6Var = q3Var.W;
        if (f6Var == null) {
            return;
        }
        Object obj = f6Var.G(i3).G;
        if (obj instanceof TL_payments.starRefProgram) {
            J0(context, q3Var.currentAccount, (TL_payments.starRefProgram) obj, q3Var.S, q3Var.resourceProvider, false);
        } else if (obj instanceof TL_payments.connectedBotStarRef) {
            K0(context, q3Var.currentAccount, (TL_payments.connectedBotStarRef) obj, q3Var.S, q3Var.resourceProvider);
        }
    }

    public static void D0(q3 q3Var, TLObject tLObject, org.telegram.ui.ActionBar.s1 s1Var) {
        long j10 = q3Var.S;
        if (tLObject instanceof TL_payments.connectedStarRefBots) {
            TL_payments.connectedStarRefBots connectedstarrefbots = (TL_payments.connectedStarRefBots) tLObject;
            ci.f0 d = ci.i0.g(q3Var.currentAccount).d(j10);
            ArrayList arrayList = d.e;
            int i3 = d.a;
            hp.s1(i3).Y3(connectedstarrefbots.users, false);
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
            hs.f(i3).k(hs.L3, Long.valueOf(d.b));
            d.a();
            ci.g0 e10 = ci.i0.g(q3Var.currentAccount).e(j10);
            e10.c = 0;
            e10.d = false;
            e10.i = false;
            e10.f = 0L;
            e10.j = null;
            e10.h = false;
            e10.a();
            q3Var.W.O(true);
        }
        s1Var.dismiss();
    }

    public static boolean E0(q3 q3Var, Context context, View view, int i3) {
        f6 f6Var = q3Var.W;
        if (f6Var != null) {
            Object obj = f6Var.G(i3).G;
            if (obj instanceof TL_payments.connectedBotStarRef) {
                TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) obj;
                TLRPC.User a22 = hp.s1(q3Var.currentAccount).a2(Long.valueOf(connectedbotstarref.bot_id));
                f60 H = f60.H(q3Var, view);
                H.l(R.drawable.msg_bot, bd.M0(2131746716, null), new e(4, q3Var, a22), a22.bot_has_main_app);
                H.l(R.drawable.msg_bot, bd.M0(2131752912, null), new e(5, q3Var, connectedbotstarref), !a22.bot_has_main_app);
                H.c(R.drawable.msg_link2, bd.M0(2131751762, null), new h9(q3Var, connectedbotstarref, a22, 16), false);
                H.m(R.drawable.msg_leave, new ai.z3(q3Var, context, a22, connectedbotstarref, 20), bd.M0(2131749013, null), !connectedbotstarref.revoked, true);
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
    public static void J0(Context context, int i3, final TL_payments.starRefProgram starrefprogram, long j10, e6 e6Var, boolean z10) {
        long[] jArr;
        String str;
        ?? r15;
        String G;
        k9 k9Var;
        TextView textView;
        LinearLayout linearLayout;
        if (starrefprogram == null || context == null) {
            return;
        }
        final org.telegram.ui.ActionBar.t2 l10 = k5.l(1, context, e6Var, false);
        long[] jArr2 = {j10};
        TLRPC.User a22 = hp.s1(i3).a2(Long.valueOf(starrefprogram.bot_id));
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
        frameLayout.addView(frameLayout2, mf.d(60, 60.0f, 19, 0.0f, 0.0f, 0.0f, 0.0f));
        k9 k9Var2 = new k9(context);
        k9Var2.setRoundRadius(org.telegram.messenger.g0.L(30.0f));
        u8 u8Var = new u8((e6) null);
        u8Var.r(a22);
        k9Var2.e(a22, u8Var);
        pf.a(k9Var2);
        frameLayout2.addView(k9Var2, mf.e(60, 60, hs.E1));
        if (starrefprogram.daily_revenue_per_user.positive()) {
            FrameLayout frameLayout3 = new FrameLayout(context);
            int L = org.telegram.messenger.g0.L(10.0f);
            int i10 = k6.h5;
            ShapeDrawable d02 = k6.d0(L, k6.w0(i10, e6Var));
            n6 N = r6.N(i10);
            frameLayout3.setBackground(d02);
            r6.k(frameLayout3, d02, N, null, e6Var);
            frameLayout3.setPadding(org.telegram.messenger.g0.L(1.33f), org.telegram.messenger.g0.L(1.33f), org.telegram.messenger.g0.L(1.33f), org.telegram.messenger.g0.L(1.33f));
            TextView textView2 = new TextView(context);
            int L2 = org.telegram.messenger.g0.L(10.0f);
            int i11 = k6.ik;
            ShapeDrawable d03 = k6.d0(L2, k6.w0(i11, e6Var));
            n6 N2 = r6.N(i11);
            textView2.setBackground(d03);
            r6.k(textView2, d03, N2, null, e6Var);
            textView2.setTypeface(org.telegram.messenger.g0.o());
            textView2.setTextSize(1, 10.0f);
            textView2.setPadding(org.telegram.messenger.g0.L(5.33f), 0, org.telegram.messenger.g0.L(5.33f), 0);
            textView2.setTextColor(-1);
            textView2.setGravity(17);
            StringBuilder sb2 = new StringBuilder("⭐️ ");
            jArr = jArr2;
            sb2.append((Object) wb.N0(starrefprogram.daily_revenue_per_user, 1.0f, ','));
            textView2.setText(wb.U0(sb2.toString(), 0.75f, new wp[1]));
            frameLayout3.addView(textView2, mf.c(15.66f, -2));
            frameLayout2.addView(frameLayout3, mf.d(-2, -2.0f, 81, 0.0f, 0.0f, 0.0f, -4.0f));
        } else {
            jArr = jArr2;
        }
        ImageView e10 = org.telegram.messenger.camera.q.e(context, R.drawable.msg_arrow_avatar);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        e10.setScaleType(scaleType);
        e10.setTranslationX(-org.telegram.messenger.g0.L(2.0825f));
        int i12 = k6.E6;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        r6.t(e10, i12, e6Var, mode);
        frameLayout.addView(e10, mf.d(36, 60.0f, 17, 60.0f, 0.0f, 60.0f, 0.0f));
        FrameLayout frameLayout4 = new FrameLayout(context);
        frameLayout4.setClipToPadding(false);
        frameLayout4.setClipChildren(false);
        frameLayout.addView(frameLayout4, mf.d(60, 60.0f, 21, 0.0f, 0.0f, 5.66f, 0.0f));
        k9 k9Var3 = new k9(context);
        k9Var3.setRoundRadius(org.telegram.messenger.g0.L(30.0f));
        frameLayout4.addView(k9Var3, mf.e(60, 60, hs.E1));
        FrameLayout frameLayout5 = new FrameLayout(context);
        int L3 = org.telegram.messenger.g0.L(10.0f);
        int i13 = k6.h5;
        Drawable d04 = k6.d0(L3, k6.w0(i13, e6Var));
        n6 N3 = r6.N(i13);
        frameLayout5.setBackground(d04);
        r6.k(frameLayout5, d04, N3, null, e6Var);
        frameLayout5.setPadding(org.telegram.messenger.g0.L(1.33f), org.telegram.messenger.g0.L(1.33f), org.telegram.messenger.g0.L(1.33f), org.telegram.messenger.g0.L(1.33f));
        TextView textView3 = new TextView(context);
        int L4 = org.telegram.messenger.g0.L(10.0f);
        int i14 = k6.Ci;
        Drawable d05 = k6.d0(L4, k6.w0(i14, e6Var));
        n6 N4 = r6.N(i14);
        textView3.setBackground(d05);
        r6.k(textView3, d05, N4, null, e6Var);
        textView3.setTypeface(org.telegram.messenger.g0.o());
        textView3.setTextSize(1, 10.0f);
        textView3.setPadding(org.telegram.messenger.g0.L(5.33f), 0, org.telegram.messenger.g0.L(5.33f), 0);
        textView3.setTextColor(-1);
        textView3.setGravity(17);
        SpannableString spannableString = new SpannableString("s " + ((Object) k.J0(starrefprogram.commission_permille)));
        wp wpVar = new wp(R.drawable.msg_link_1, 0);
        wpVar.I = 0.65f;
        wpVar.J = 0.65f;
        wpVar.H = 0.7f;
        float L5 = org.telegram.messenger.g0.L(-2.0f);
        float L6 = org.telegram.messenger.g0.L(0.0f);
        wpVar.r = L5;
        wpVar.s = L6;
        spannableString.setSpan(wpVar, 0, 1, 33);
        textView3.setText(spannableString);
        frameLayout5.addView(textView3, mf.c(15.66f, -2));
        frameLayout4.addView(frameLayout5, mf.d(-2, -2.0f, 81, 0.0f, 0.0f, 0.0f, -4.0f));
        f10.addView(frameLayout, mf.t(-2, -2, 1, 0, 0, 0, 0));
        TextView textView4 = new TextView(context);
        int i15 = k6.G6;
        r6.V(textView4, i15, e6Var);
        textView4.setTextSize(1, 20.0f);
        textView4.setGravity(17);
        textView4.setText(bd.M0(2131752494, null));
        textView4.setTypeface(org.telegram.messenger.g0.o());
        f10.addView(textView4, mf.k(0.0f, 21.0f, 0.0f, 9.0f, -1, -2));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        int L7 = org.telegram.messenger.g0.L(28.0f);
        int i16 = k6.a7;
        ShapeDrawable d06 = k6.d0(L7, k6.w0(i16, e6Var));
        n6 N5 = r6.N(i16);
        linearLayout2.setBackground(d06);
        r6.k(linearLayout2, d06, N5, null, e6Var);
        TextView textView5 = new TextView(context);
        textView5.setTextSize(1, 13.0f);
        r6.V(textView5, i15, e6Var);
        textView5.setText(bd.a0(null, null, 2131752493, m5.l(i3, starrefprogram.bot_id)));
        linearLayout2.addView(textView5, mf.t(-2, -2, 16, 11, 0, 0, 0));
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(scaleType);
        int i17 = k6.r5;
        r6.t(imageView, i17, e6Var, mode);
        imageView.setImageResource(R.drawable.settings_arrow);
        imageView.setScaleX(1.2f);
        imageView.setScaleY(1.2f);
        linearLayout2.addView(imageView, mf.t(-2, -2, 16, 5, 0, 8, 0));
        f10.addView(linearLayout2, mf.t(-2, 28, 1, 4, 0, 4, 0));
        pf.a(linearLayout2);
        TextView textView6 = new TextView(context);
        r6.V(textView6, i15, e6Var);
        textView6.setTextSize(1, 14.0f);
        textView6.setGravity(17);
        hs.i(textView6);
        SpannableString spannableString2 = new SpannableString(wb.N0(starrefprogram.daily_revenue_per_user, 0.95f, ','));
        spannableString2.setSpan(new o31(org.telegram.messenger.g0.o()), 0, spannableString2.length(), 33);
        textView6.setText(wb.a1(false, bd.V(null, null, 2131752503, spannableString2), 0.725f, null));
        TextView f11 = org.telegram.messenger.camera.q.f(f10, textView6, mf.k(0.0f, 10.0f, 0.0f, 20.0f, -1, -2), context);
        r6.V(f11, i15, e6Var);
        f11.setTextSize(1, 14.0f);
        f11.setGravity(17);
        hs.i(f11);
        String p10 = l10.p(a22);
        String J0 = k.J0(starrefprogram.commission_permille);
        int i18 = starrefprogram.duration_months;
        if (i18 <= 0) {
            G = bd.M0(2131752501, null);
        } else {
            if (i18 < 12 || i18 % 12 != 0) {
                str = p10;
                r15 = 0;
                G = bd.G(i18, "ChannelAffiliateProgramJoinText_Months", new Object[0]);
                Object[] objArr = new Object[3];
                objArr[r15] = str;
                objArr[1] = J0;
                objArr[2] = G;
                f11.setText(i6.m(org.telegram.messenger.g0.X2(bd.a0(null, null, 2131752502, objArr)), f11.getPaint().getFontMetricsInt(), r15, null, r15));
                f10.addView(f11, mf.k(0.0f, 0.0f, 0.0f, 22.0f, -1, -2));
                if (j10 < 0) {
                    TextView textView7 = new TextView(context);
                    r6.V(textView7, i15, e6Var);
                    textView7.setTextSize(1, 14.0f);
                    k5.m(textView7, 17, null, 2131752486);
                    f10.addView(textView7, mf.k(20.0f, 0.0f, 20.0f, 0.0f, -1, -2));
                    LinearLayout linearLayout3 = new LinearLayout(context);
                    linearLayout3.setOrientation(0);
                    ShapeDrawable d07 = k6.d0(org.telegram.messenger.g0.L(28.0f), k6.w0(i16, e6Var));
                    n6 N6 = r6.N(i16);
                    linearLayout3.setBackground(d07);
                    r6.k(linearLayout3, d07, N6, null, e6Var);
                    int L8 = org.telegram.messenger.g0.L(28.0f);
                    int w02 = k6.w0(i16, e6Var);
                    int w03 = k6.w0(i16, e6Var);
                    int i19 = k6.i6;
                    int w10 = k6.w(w03, k6.w0(i19, e6Var));
                    org.telegram.ui.Cells.y k02 = k6.k0(L8, L8, L8, L8, w02, w10, w10);
                    n6 N7 = r6.N(i16);
                    n6 q10 = r6.q(i16, i19);
                    linearLayout3.setBackground(k02);
                    r6.k(linearLayout3, k02, N7, q10, e6Var);
                    k9 k9Var4 = new k9(context);
                    k9Var4.setRoundRadius(org.telegram.messenger.g0.L(14.0f));
                    linearLayout3.addView(k9Var4, mf.o(28, 28));
                    TextView textView8 = new TextView(context);
                    textView8.setTextSize(1, 13.0f);
                    r6.V(textView8, i15, e6Var);
                    linearLayout3.addView(textView8, mf.t(-2, -2, 16, 6, 0, 0, 0));
                    ImageView imageView2 = new ImageView(context);
                    imageView2.setScaleType(scaleType);
                    r6.t(imageView2, i17, e6Var, mode);
                    imageView2.setImageResource(R.drawable.arrows_select);
                    linearLayout3.addView(imageView2, mf.t(-2, -2, 16, 2, 0, 5, 0));
                    f10.addView(linearLayout3, mf.t(-2, 28, 1, 0, 11, 0, 20));
                    linearLayout = linearLayout3;
                    k9Var = k9Var4;
                    textView = textView8;
                } else {
                    k9Var = null;
                    textView = null;
                    linearLayout = null;
                }
                gi.d dVar = new gi.d(context, e6Var, true);
                dVar.i(bd.M0(2131752508, null), false, true);
                f10.addView(dVar, mf.o(-1, 48));
                s70 s70Var = new s70(context, e6Var);
                s70Var.setText(org.telegram.messenger.g0.U2(bd.M0(2131752507, null), new ai.s1(context, 9)));
                s70Var.setGravity(17);
                s70Var.setTextSize(1, 12.0f);
                r6.V(s70Var, k6.B6, e6Var);
                r6.H(s70Var, k6.Uc, e6Var);
                f10.addView(s70Var, mf.t(-1, -2, 49, 14, 14, 14, 6));
                l10.O = f10;
                final int i20 = 1;
                k9Var2.setOnClickListener(new View.OnClickListener() { // from class: ii.b3
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i20) {
                            case 0:
                                org.telegram.ui.ActionBar.d2 T = LaunchActivity.T();
                                if (T != null) {
                                    org.telegram.ui.ActionBar.t2 t2Var = l10;
                                    t2Var.dismiss();
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("user_id", starrefprogram.bot_id);
                                    T.presentFragment(new l3(bundle, t2Var));
                                    break;
                                }
                                break;
                            default:
                                org.telegram.ui.ActionBar.d2 T2 = LaunchActivity.T();
                                if (T2 != null) {
                                    l10.dismiss();
                                    T2.presentFragment(ProfileActivity.A4(starrefprogram.bot_id));
                                    break;
                                }
                                break;
                        }
                    }
                });
                dVar.setOnClickListener(new i3(dVar, jArr, i3, starrefprogram, l10, j10, z10, context, e6Var, a22));
                l10.setOnDismissListener(new gi.d1(6));
                ai.p1 p1Var = new ai.p1(jArr, i3, k9Var3, k9Var, textView, 2);
                p1Var.run();
                if (linearLayout != null) {
                    ci.i0.g(i3).n();
                    ci.i0.g(i3).o();
                    LinearLayout linearLayout4 = linearLayout;
                    linearLayout4.setOnClickListener(new ga(i3, l10, e6Var, linearLayout4, jArr, p1Var));
                }
                final int i21 = 0;
                linearLayout2.setOnClickListener(new View.OnClickListener() { // from class: ii.b3
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i21) {
                            case 0:
                                org.telegram.ui.ActionBar.d2 T = LaunchActivity.T();
                                if (T != null) {
                                    org.telegram.ui.ActionBar.t2 t2Var = l10;
                                    t2Var.dismiss();
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("user_id", starrefprogram.bot_id);
                                    T.presentFragment(new l3(bundle, t2Var));
                                    break;
                                }
                                break;
                            default:
                                org.telegram.ui.ActionBar.d2 T2 = LaunchActivity.T();
                                if (T2 != null) {
                                    l10.dismiss();
                                    T2.presentFragment(ProfileActivity.A4(starrefprogram.bot_id));
                                    break;
                                }
                                break;
                        }
                    }
                });
                l10.P(i13);
                l10.show();
            }
            G = bd.G(i18 / 12, "ChannelAffiliateProgramJoinText_Years", new Object[0]);
        }
        str = p10;
        r15 = 0;
        Object[] objArr2 = new Object[3];
        objArr2[r15] = str;
        objArr2[1] = J0;
        objArr2[2] = G;
        f11.setText(i6.m(org.telegram.messenger.g0.X2(bd.a0(null, null, 2131752502, objArr2)), f11.getPaint().getFontMetricsInt(), r15, null, r15));
        f10.addView(f11, mf.k(0.0f, 0.0f, 0.0f, 22.0f, -1, -2));
        if (j10 < 0) {
        }
        gi.d dVar2 = new gi.d(context, e6Var, true);
        dVar2.i(bd.M0(2131752508, null), false, true);
        f10.addView(dVar2, mf.o(-1, 48));
        s70 s70Var2 = new s70(context, e6Var);
        s70Var2.setText(org.telegram.messenger.g0.U2(bd.M0(2131752507, null), new ai.s1(context, 9)));
        s70Var2.setGravity(17);
        s70Var2.setTextSize(1, 12.0f);
        r6.V(s70Var2, k6.B6, e6Var);
        r6.H(s70Var2, k6.Uc, e6Var);
        f10.addView(s70Var2, mf.t(-1, -2, 49, 14, 14, 14, 6));
        l10.O = f10;
        final int i202 = 1;
        k9Var2.setOnClickListener(new View.OnClickListener() { // from class: ii.b3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i202) {
                    case 0:
                        org.telegram.ui.ActionBar.d2 T = LaunchActivity.T();
                        if (T != null) {
                            org.telegram.ui.ActionBar.t2 t2Var = l10;
                            t2Var.dismiss();
                            Bundle bundle = new Bundle();
                            bundle.putLong("user_id", starrefprogram.bot_id);
                            T.presentFragment(new l3(bundle, t2Var));
                            break;
                        }
                        break;
                    default:
                        org.telegram.ui.ActionBar.d2 T2 = LaunchActivity.T();
                        if (T2 != null) {
                            l10.dismiss();
                            T2.presentFragment(ProfileActivity.A4(starrefprogram.bot_id));
                            break;
                        }
                        break;
                }
            }
        });
        dVar2.setOnClickListener(new i3(dVar2, jArr, i3, starrefprogram, l10, j10, z10, context, e6Var, a22));
        l10.setOnDismissListener(new gi.d1(6));
        ai.p1 p1Var2 = new ai.p1(jArr, i3, k9Var3, k9Var, textView, 2);
        p1Var2.run();
        if (linearLayout != null) {
        }
        final int i212 = 0;
        linearLayout2.setOnClickListener(new View.OnClickListener() { // from class: ii.b3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i212) {
                    case 0:
                        org.telegram.ui.ActionBar.d2 T = LaunchActivity.T();
                        if (T != null) {
                            org.telegram.ui.ActionBar.t2 t2Var = l10;
                            t2Var.dismiss();
                            Bundle bundle = new Bundle();
                            bundle.putLong("user_id", starrefprogram.bot_id);
                            T.presentFragment(new l3(bundle, t2Var));
                            break;
                        }
                        break;
                    default:
                        org.telegram.ui.ActionBar.d2 T2 = LaunchActivity.T();
                        if (T2 != null) {
                            l10.dismiss();
                            T2.presentFragment(ProfileActivity.A4(starrefprogram.bot_id));
                            break;
                        }
                        break;
                }
            }
        });
        l10.P(i13);
        l10.show();
    }

    public static org.telegram.ui.ActionBar.t2 K0(Context context, int i3, TL_payments.connectedBotStarRef connectedbotstarref, long j10, e6 e6Var) {
        ImageView.ScaleType scaleType;
        int i10;
        LinearLayout linearLayout;
        int i11;
        org.telegram.ui.ActionBar.t2 t2Var;
        char c2;
        String G;
        char c10;
        String G2;
        int i12;
        LinearLayout linearLayout2;
        TL_payments.connectedBotStarRef connectedbotstarref2;
        if (connectedbotstarref == null || context == null) {
            return null;
        }
        org.telegram.ui.ActionBar.t2 l10 = k5.l(1, context, e6Var, false);
        TLRPC.User a22 = hp.s1(i3).a2(Long.valueOf(connectedbotstarref.bot_id));
        LinearLayout f10 = k5.f(context, 1);
        f10.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(8.0f));
        f10.setClipChildren(false);
        f10.setClipToPadding(false);
        FrameLayout frameLayout = new FrameLayout(context);
        View view = new View(context);
        Drawable L = k6.L(org.telegram.messenger.g0.L(40.0f), k6.w0(connectedbotstarref.revoked ? k6.kk : k6.Ci, e6Var));
        n6 N = r6.N(connectedbotstarref.revoked ? k6.kk : k6.Ci);
        view.setBackground(L);
        r6.k(view, L, N, null, e6Var);
        frameLayout.addView(view, mf.d(80, 80.0f, 49, 0.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        ImageView.ScaleType scaleType2 = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType2);
        imageView.setImageResource(connectedbotstarref.revoked ? R.drawable.msg_link_2 : R.drawable.msg_limit_links);
        imageView.setScaleX(connectedbotstarref.revoked ? 2.0f : 1.8f);
        imageView.setScaleY(connectedbotstarref.revoked ? 2.0f : 1.8f);
        frameLayout.addView(imageView, mf.d(80, 80.0f, 49, 0.0f, 0.0f, 0.0f, 0.0f));
        if (connectedbotstarref.participants > 0) {
            FrameLayout frameLayout2 = new FrameLayout(context);
            int L2 = org.telegram.messenger.g0.L(50.0f);
            int i13 = k6.h5;
            Drawable d02 = k6.d0(L2, k6.w0(i13, e6Var));
            n6 N2 = r6.N(i13);
            frameLayout2.setBackground(d02);
            r6.k(frameLayout2, d02, N2, null, e6Var);
            frameLayout.addView(frameLayout2, mf.d(-2, -2.0f, 49, 0.0f, 66.0f, 0.0f, 0.0f));
            TextView textView = new TextView(context);
            textView.setTypeface(org.telegram.messenger.g0.o());
            textView.setTextSize(1, 12.0f);
            Drawable d03 = k6.d0(org.telegram.messenger.g0.L(9.5f), k6.w0(connectedbotstarref.revoked ? k6.kk : k6.ik, e6Var));
            n6 N3 = r6.N(connectedbotstarref.revoked ? k6.kk : k6.ik);
            textView.setBackground(d03);
            r6.k(textView, d03, N3, null, e6Var);
            textView.setTextColor(-1);
            textView.setPadding(org.telegram.messenger.g0.L(6.66f), 0, org.telegram.messenger.g0.L(6.66f), 0);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) "s ");
            wp wpVar = new wp(R.drawable.mini_reply_user, 0);
            wpVar.I = 0.937f;
            wpVar.J = 0.937f;
            float f11 = -org.telegram.messenger.g0.L(1.33f);
            float L3 = org.telegram.messenger.g0.L(1.0f);
            wpVar.r = f11;
            wpVar.s = L3;
            wpVar.H = 0.8f;
            scaleType = scaleType2;
            spannableStringBuilder.setSpan(wpVar, 0, 1, 33);
            spannableStringBuilder.append((CharSequence) String.valueOf(connectedbotstarref.participants));
            textView.setText(spannableStringBuilder);
            textView.setGravity(17);
            frameLayout2.addView(textView, mf.d(-1, 19.0f, hs.E1, 1.33f, 1.33f, 1.33f, 1.33f));
        } else {
            scaleType = scaleType2;
        }
        f10.addView(frameLayout, mf.t(-2, -2, 1, 0, 0, 0, 0));
        TextView textView2 = new TextView(context);
        int i14 = k6.G6;
        r6.V(textView2, i14, e6Var);
        textView2.setTextSize(1, 20.0f);
        textView2.setGravity(17);
        textView2.setText(bd.M0(2131752482, null));
        textView2.setTypeface(org.telegram.messenger.g0.o());
        f10.addView(textView2, mf.k(20.0f, 16.0f, 20.0f, 9.33f, -1, -2));
        LinearLayout linearLayout3 = new LinearLayout(context);
        linearLayout3.setOrientation(0);
        int L4 = org.telegram.messenger.g0.L(28.0f);
        int i15 = k6.a7;
        ShapeDrawable d04 = k6.d0(L4, k6.w0(i15, e6Var));
        n6 N4 = r6.N(i15);
        linearLayout3.setBackground(d04);
        r6.k(linearLayout3, d04, N4, null, e6Var);
        k9 k9Var = new k9(context);
        k9Var.setRoundRadius(org.telegram.messenger.g0.L(14.0f));
        u8 u8Var = new u8((e6) null);
        linearLayout3.addView(k9Var, mf.o(28, 28));
        TextView textView3 = new TextView(context);
        textView3.setTextSize(1, 13.0f);
        r6.V(textView3, i14, e6Var);
        textView3.setText(m5.l(i3, connectedbotstarref.bot_id));
        u8Var.r(a22);
        k9Var.e(a22, u8Var);
        linearLayout3.addView(textView3, mf.t(-2, -2, 16, 6, 0, 0, 0));
        ImageView imageView2 = new ImageView(context);
        ImageView.ScaleType scaleType3 = scaleType;
        imageView2.setScaleType(scaleType3);
        int i16 = k6.r5;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        r6.t(imageView2, i16, e6Var, mode);
        imageView2.setImageResource(R.drawable.settings_arrow);
        imageView2.setScaleX(1.2f);
        imageView2.setScaleY(1.2f);
        linearLayout3.addView(imageView2, mf.t(-2, -2, 16, 5, 0, 8, 0));
        f10.addView(linearLayout3, mf.t(-2, 28, 1, 4, 0, 4, 0));
        pf.a(linearLayout3);
        TextView textView4 = new TextView(context);
        r6.V(textView4, i14, e6Var);
        textView4.setTextSize(1, 14.0f);
        textView4.setGravity(17);
        if (connectedbotstarref.revoked) {
            i10 = 2;
            textView4.setText(org.telegram.messenger.g0.X2(bd.M0(2131752484, null)));
            i11 = i16;
            t2Var = l10;
            linearLayout = linearLayout3;
        } else {
            i10 = 2;
            linearLayout = linearLayout3;
            if (j10 < 0) {
                String J0 = k.J0(connectedbotstarref.commission_permille);
                String p10 = l10.p(a22);
                int i17 = connectedbotstarref.duration_months;
                i11 = i16;
                t2Var = l10;
                if (i17 <= 0) {
                    G2 = bd.M0(2131752501, null);
                    c10 = 0;
                } else if (i17 < 12 || i17 % 12 != 0) {
                    c10 = 0;
                    G2 = bd.G(i17, "ChannelAffiliateProgramJoinText_Months", new Object[0]);
                } else {
                    c10 = 0;
                    G2 = bd.G(i17 / 12, "ChannelAffiliateProgramJoinText_Years", new Object[0]);
                }
                Object[] objArr = new Object[3];
                objArr[c10] = J0;
                objArr[1] = p10;
                objArr[2] = G2;
                k5.r(null, null, 2131752485, objArr, textView4);
            } else {
                i11 = i16;
                t2Var = l10;
                String J02 = k.J0(connectedbotstarref.commission_permille);
                String p11 = l10.p(a22);
                int i18 = connectedbotstarref.duration_months;
                if (i18 <= 0) {
                    G = bd.M0(2131752501, null);
                    c2 = 0;
                } else if (i18 < 12 || i18 % 12 != 0) {
                    c2 = 0;
                    G = bd.G(i18, "ChannelAffiliateProgramJoinText_Months", new Object[0]);
                } else {
                    c2 = 0;
                    G = bd.G(i18 / 12, "ChannelAffiliateProgramJoinText_Years", new Object[0]);
                }
                Object[] objArr2 = new Object[3];
                objArr2[c2] = J02;
                objArr2[1] = p11;
                objArr2[2] = G;
                k5.r(null, null, 2131752483, objArr2, textView4);
            }
        }
        f10.addView(textView4, mf.k(20.0f, 19.0f, 20.0f, 18.0f, -1, -2));
        if (connectedbotstarref.revoked) {
            i12 = i15;
            linearLayout2 = null;
        } else {
            TextView textView5 = new TextView(context);
            r6.V(textView5, i14, e6Var);
            textView5.setTextSize(1, 14.0f);
            k5.m(textView5, 17, null, 2131752486);
            f10.addView(textView5, mf.k(20.0f, 0.0f, 20.0f, 0.0f, -1, -2));
            LinearLayout linearLayout4 = new LinearLayout(context);
            linearLayout4.setOrientation(0);
            Drawable d05 = k6.d0(org.telegram.messenger.g0.L(28.0f), k6.w0(i15, e6Var));
            n6 N5 = r6.N(i15);
            linearLayout4.setBackground(d05);
            r6.k(linearLayout4, d05, N5, null, e6Var);
            k9 k9Var2 = new k9(context);
            k9Var2.setRoundRadius(org.telegram.messenger.g0.L(14.0f));
            u8 u8Var2 = new u8((e6) null);
            linearLayout4.addView(k9Var2, mf.o(28, 28));
            TextView textView6 = new TextView(context);
            textView6.setTextSize(1, 13.0f);
            r6.V(textView6, i14, e6Var);
            if (j10 >= 0) {
                TLRPC.User a23 = hp.s1(i3).a2(Long.valueOf(j10));
                u8Var2.r(a23);
                k9Var2.e(a23, u8Var2);
                textView6.setText(l10.p(a23));
                i12 = i15;
            } else {
                i12 = i15;
                TLRPC.Chat M0 = hp.s1(i3).M0(Long.valueOf(-j10));
                u8Var2.q(M0);
                k9Var2.e(M0, u8Var2);
                textView6.setText(M0 == null ? "" : M0.title);
            }
            linearLayout4.addView(textView6, mf.t(-2, -2, 16, 6, 0, 0, 0));
            ImageView imageView3 = new ImageView(context);
            imageView3.setScaleType(scaleType3);
            r6.t(imageView3, i11, e6Var, mode);
            imageView3.setImageResource(R.drawable.arrows_select);
            linearLayout4.addView(imageView3, mf.t(-2, -2, 16, 2, 0, 5, 0));
            f10.addView(linearLayout4, mf.t(-2, 28, 1, 0, 9, 0, 22));
            linearLayout2 = linearLayout4;
        }
        TextView textView7 = new TextView(context);
        textView7.setTextSize(1, 16.0f);
        textView7.setGravity(17);
        r6.V(textView7, i14, e6Var);
        int L5 = org.telegram.messenger.g0.L(8.0f);
        int i19 = i12;
        int w02 = k6.w0(i19, e6Var);
        int w03 = k6.w0(i19, e6Var);
        int i20 = k6.i6;
        int w10 = k6.w(w03, k6.w0(i20, e6Var));
        org.telegram.ui.Cells.y k02 = k6.k0(L5, L5, L5, L5, w02, w10, w10);
        n6 N6 = r6.N(i19);
        n6 q10 = r6.q(i19, i20);
        textView7.setBackground(k02);
        r6.k(textView7, k02, N6, q10, e6Var);
        textView7.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(14.66f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(14.66f));
        String str = connectedbotstarref.url;
        textView7.setText((str == null || !str.startsWith("https://")) ? connectedbotstarref.url : connectedbotstarref.url.substring(8));
        f10.addView(textView7, mf.d(-1, -2.0f, 7, 0.0f, 0.0f, 0.0f, 12.0f));
        gi.d dVar = new gi.d(context, e6Var, true);
        if (connectedbotstarref.revoked) {
            dVar.i(bd.M0(2131752487, null), false, true);
        } else {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            spannableStringBuilder2.append((CharSequence) "c ");
            spannableStringBuilder2.setSpan(new wp(R.drawable.msg_copy_filled, 0), 0, 1, 33);
            spannableStringBuilder2.append((CharSequence) bd.M0(2131752492, null));
            dVar.i(spannableStringBuilder2, false, true);
        }
        f10.addView(dVar, mf.o(-1, 48));
        s70 s70Var = new s70(context, e6Var);
        long j11 = connectedbotstarref.participants;
        s70Var.setText(j11 <= 0 ? bd.a0(null, null, 2131752490, l10.p(a22)) : bd.G((int) j11, "ChannelAffiliateProgramLinkOpened", l10.p(a22)));
        s70Var.setGravity(17);
        s70Var.setTextSize(1, 12.0f);
        r6.V(s70Var, k6.B6, e6Var);
        r6.H(s70Var, k6.Uc, e6Var);
        f10.addView(s70Var, mf.t(-1, -2, 49, 14, 12, 14, 2));
        org.telegram.ui.ActionBar.t2 t2Var2 = t2Var;
        t2Var2.O = f10;
        ai.z3 z3Var = new ai.z3(connectedbotstarref, t2Var2, e6Var, a22, 19);
        if (!connectedbotstarref.revoked) {
            textView7.setOnClickListener(new m(z3Var, i10));
        }
        h3 h3Var = new h3(connectedbotstarref, i3, t2Var2, context, j10, e6Var, z3Var);
        org.telegram.ui.ActionBar.t2 t2Var3 = t2Var2;
        dVar.setOnClickListener(h3Var);
        t2Var3.setOnDismissListener(new gi.d1(6));
        if (linearLayout2 != null) {
            ci.i0.g(i3).n();
            ci.i0.g(i3).o();
            LinearLayout linearLayout5 = linearLayout2;
            View.OnClickListener h3Var2 = new h3(i3, t2Var3, e6Var, linearLayout5, j10, context, connectedbotstarref);
            t2Var3 = t2Var3;
            connectedbotstarref2 = connectedbotstarref;
            linearLayout5.setOnClickListener(h3Var2);
        } else {
            connectedbotstarref2 = connectedbotstarref;
        }
        linearLayout.setOnClickListener(new ai.d(24, t2Var3, connectedbotstarref2));
        t2Var3.P(k6.h5);
        org.telegram.ui.ActionBar.d2 T = LaunchActivity.T();
        if (!org.telegram.messenger.g0.Q1() && T != null && !org.telegram.messenger.g0.u1(T)) {
            t2Var3.a0(T);
        }
        t2Var3.show();
        return t2Var3;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x01c2 A[LOOP:0: B:20:0x01bc->B:22:0x01c2, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void I0(ArrayList arrayList, f41 f41Var) {
        int i3;
        SpannableString spannableString;
        int i10;
        if (getParentActivity() == null) {
            return;
        }
        org.telegram.ui.Components.voip.r0 r0Var = (org.telegram.ui.Components.voip.r0) o0(getParentActivity());
        r31 r31Var = new r31(-2);
        r31Var.c = r0Var;
        arrayList.add(r31Var);
        arrayList.add(i.i(R.drawable.menu_feature_reliable, bd.M0(2131752513, null), bd.M0(2131752514, null)));
        arrayList.add(i.i(R.drawable.menu_feature_transparent, bd.M0(2131752511, null), bd.M0(2131752512, null)));
        arrayList.add(i.i(R.drawable.menu_feature_simple, bd.M0(2131752509, null), bd.M0(2131752510, null)));
        arrayList.add(r31.B(1, null));
        ci.i0 g7 = ci.i0.g(this.currentAccount);
        long j10 = this.S;
        ci.f0 d = g7.d(j10);
        ArrayList arrayList2 = d.e;
        if (!arrayList2.isEmpty() || d.c > 0) {
            arrayList.add(r31.u(bd.M0(2131752481, null)));
            for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) arrayList2.get(i11);
                int i12 = m3.b;
                r31 K = r31.K(m3.class);
                K.G = connectedbotstarref;
                K.r = true;
                arrayList.add(K);
            }
            if (!d.d || d.g) {
                arrayList.add(r31.p(29));
                arrayList.add(r31.p(29));
                arrayList.add(r31.p(29));
            }
            arrayList.add(r31.B(2, null));
        }
        ci.g0 e10 = ci.i0.g(this.currentAccount).e(j10);
        ArrayList arrayList3 = e10.e;
        if (!arrayList3.isEmpty() || e10.c > 0) {
            String M0 = bd.M0(2131752480, null);
            int i13 = e10.g;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) bd.M0(2131752479, null)).append((CharSequence) " ");
            if (i13 == 1) {
                spannableString = new SpannableString(bd.M0(2131752477, null) + "v");
            } else if (i13 == 2) {
                spannableString = new SpannableString(bd.M0(2131752476, null) + "v");
            } else if (i13 == 3) {
                spannableString = new SpannableString(bd.M0(2131752478, null) + "v");
            } else {
                i3 = 0;
                int i14 = o3.b;
                r31 K2 = r31.K(o3.class);
                K2.l = M0;
                K2.m = spannableStringBuilder;
                arrayList.add(K2);
                for (i10 = i3; i10 < arrayList3.size(); i10++) {
                    Object obj = arrayList3.get(i10);
                    int i15 = m3.b;
                    r31 K3 = r31.K(m3.class);
                    K3.G = obj;
                    K3.r = true;
                    arrayList.add(K3);
                }
                if (e10.d || e10.h) {
                    arrayList.add(r31.p(29));
                    arrayList.add(r31.p(29));
                    arrayList.add(r31.p(29));
                }
                arrayList.add(r31.B(3, null));
            }
            wp wpVar = new wp(R.drawable.arrow_more, 0);
            wpVar.f = true;
            wpVar.I = 0.6f;
            wpVar.J = 0.6f;
            spannableString.setSpan(wpVar, spannableString.length() - 1, spannableString.length(), 33);
            i3 = 0;
            spannableString.setSpan(new k3(this, i13, ci.i0.g(this.currentAccount).e(j10)), 0, spannableString.length(), 33);
            spannableStringBuilder.append((CharSequence) spannableString);
            int i142 = o3.b;
            r31 K22 = r31.K(o3.class);
            K22.l = M0;
            K22.m = spannableStringBuilder;
            arrayList.add(K22);
            while (i10 < arrayList3.size()) {
            }
            if (e10.d) {
            }
            arrayList.add(r31.p(29));
            arrayList.add(r31.p(29));
            arrayList.add(r31.p(29));
            arrayList.add(r31.B(3, null));
        }
        arrayList.add(r31.k(this.V));
    }

    @Override // org.telegram.ui.l00, org.telegram.ui.ActionBar.d2
    public final View createView(Context context) {
        this.H = false;
        this.F = org.telegram.messenger.g0.L(238.0f);
        sm smVar = new sm(context, 3);
        this.V = smVar;
        r6.i(k6.i5, smVar, null);
        super.createView(context);
        this.T = new FrameLayout(context);
        wg.m mVar = new wg.m(context, 1, 3);
        this.U = mVar;
        mVar.setImportantForAccessibility(4);
        wg.f fVar = this.U.b;
        fVar.z = k6.Tk;
        fVar.A = k6.Uk;
        fVar.b();
        this.U.setStarParticlesView(this.e);
        this.T.addView(this.U, mf.d(hs.U2, 190.0f, 17, 0.0f, 32.0f, 0.0f, 12.0f));
        j0(bd.M0(2131752472, null), org.telegram.messenger.g0.X2(bd.M0(2131752473, null)), this.T, null);
        this.c.setOnItemClickListener(new ei.q4(2, this, context));
        this.c.setOnItemLongClickListener(new ai.n(20, this, context));
        u4.k kVar = new u4.k();
        kVar.m = false;
        kVar.C = false;
        kVar.o(xq.h);
        kVar.n(350L);
        this.c.setItemAnimator(kVar);
        this.c.setOnScrollListener(new j5(this, 18));
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.cs
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        f6 f6Var;
        int i11 = hs.L3;
        long j10 = this.S;
        if (i3 != i11) {
            if (i3 == hs.K3 && ((Long) objArr[0]).longValue() == j10 && (f6Var = this.W) != null) {
                f6Var.O(true);
                return;
            }
            return;
        }
        if (((Long) objArr[0]).longValue() == j10) {
            f6 f6Var2 = this.W;
            if (f6Var2 != null) {
                f6Var2.O(true);
            }
            ci.i0.g(this.currentAccount).d(j10).a();
        }
    }

    @Override // org.telegram.ui.l00
    public final u4.h0 k0() {
        f6 f6Var = new f6(this, this.c, getParentActivity(), this.currentAccount, this.classGuid, new gi.q4(this, 11), getResourceProvider(), 5);
        this.W = f6Var;
        return f6Var;
    }

    @Override // org.telegram.ui.l00
    public final vg.t1 m0() {
        f fVar = new f(getParentActivity(), 1);
        fVar.c();
        return fVar;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean onFragmentCreate() {
        hs.f(this.currentAccount).c(this, hs.L3);
        hs.f(this.currentAccount).c(this, hs.K3);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        hs.f(this.currentAccount).n(this, hs.L3);
        hs.f(this.currentAccount).n(this, hs.K3);
    }

    @Override // org.telegram.ui.l00, org.telegram.ui.ActionBar.d2
    public final void onPause() {
        super.onPause();
        wg.m mVar = this.U;
        if (mVar != null) {
            mVar.setPaused(true);
            this.U.setDialogVisible(true);
        }
    }

    @Override // org.telegram.ui.l00, org.telegram.ui.ActionBar.d2
    public final void onResume() {
        super.onResume();
        wg.m mVar = this.U;
        if (mVar != null) {
            mVar.setPaused(false);
            this.U.setDialogVisible(false);
        }
    }
}
