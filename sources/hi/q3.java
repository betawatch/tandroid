package hi;

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
import bi.dd;
import bi.hc;
import bi.jb;
import bi.pa;
import bi.ub;
import c8.ha;
import c8.ka;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.i6;
import org.telegram.messenger.id;
import org.telegram.messenger.k5;
import org.telegram.messenger.ls;
import org.telegram.messenger.m5;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.messenger.t10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.k60;
import org.telegram.ui.Components.k9;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.sm;
import org.telegram.ui.Components.u31;
import org.telegram.ui.Components.v8;
import org.telegram.ui.Components.w70;
import org.telegram.ui.Components.wp;
import org.telegram.ui.Components.wq;
import org.telegram.ui.Components.x31;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.o00;
import org.telegram.ui.r00;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes4.dex */
public final class q3 extends r00 implements ls {
    public final long R;
    public FrameLayout S;
    public vg.m T;
    public sm U;
    public hc V;

    public q3(long j3) {
        this.R = j3;
        this.M = true;
        this.L = org.telegram.messenger.g0.L(60.0f);
    }

    public static void A0(q3 q3Var, Context context, TLRPC.User user, TL_payments.connectedBotStarRef connectedbotstarref) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, q3Var.resourceProvider);
        String M0 = id.M0(2131749007, null);
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
        u1Var.R = M0;
        u1Var.T = org.telegram.messenger.g0.X2(id.a0(null, null, 2131749006, t10.p(user)));
        alertDialog$Builder.k(id.M0(2131749005, null), new ab.g(15, q3Var, connectedbotstarref));
        alertDialog$Builder.h(id.M0(2131752589, null), null);
        alertDialog$Builder.d(-1);
        alertDialog$Builder.p();
    }

    public static void B0(q3 q3Var, TL_payments.connectedBotStarRef connectedbotstarref) {
        org.telegram.ui.ActionBar.u1 u1Var = new org.telegram.ui.ActionBar.u1(3, q3Var.getParentActivity(), null);
        u1Var.r(200L);
        TL_payments.editConnectedStarRefBot editconnectedstarrefbot = new TL_payments.editConnectedStarRefBot();
        editconnectedstarrefbot.link = connectedbotstarref.url;
        editconnectedstarrefbot.peer = qp.s1(q3Var.currentAccount).j1(q3Var.R);
        editconnectedstarrefbot.revoked = true;
        q3Var.getConnectionsManager().sendRequest(editconnectedstarrefbot, new bi.j(16, q3Var, u1Var));
    }

    public static /* synthetic */ void C0(q3 q3Var, Context context, int i7) {
        hc hcVar = q3Var.V;
        if (hcVar == null) {
            return;
        }
        Object obj = hcVar.G(i7).G;
        if (obj instanceof TL_payments.starRefProgram) {
            J0(context, q3Var.currentAccount, (TL_payments.starRefProgram) obj, q3Var.R, q3Var.resourceProvider, false);
        } else if (obj instanceof TL_payments.connectedBotStarRef) {
            K0(context, q3Var.currentAccount, (TL_payments.connectedBotStarRef) obj, q3Var.R, q3Var.resourceProvider);
        }
    }

    public static void D0(q3 q3Var, TLObject tLObject, org.telegram.ui.ActionBar.u1 u1Var) {
        long j3 = q3Var.R;
        if (tLObject instanceof TL_payments.connectedStarRefBots) {
            TL_payments.connectedStarRefBots connectedstarrefbots = (TL_payments.connectedStarRefBots) tLObject;
            bi.k0 d = bi.n0.g(q3Var.currentAccount).d(j3);
            ArrayList arrayList = d.e;
            int i7 = d.a;
            qp.s1(i7).Y3(connectedstarrefbots.users, false);
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
            qs.f(i7).k(qs.L3, Long.valueOf(d.b));
            d.a();
            bi.l0 e10 = bi.n0.g(q3Var.currentAccount).e(j3);
            e10.c = 0;
            e10.d = false;
            e10.i = false;
            e10.f = 0L;
            e10.j = null;
            e10.h = false;
            e10.a();
            q3Var.V.O(true);
        }
        u1Var.dismiss();
    }

    public static boolean E0(q3 q3Var, Context context, View view, int i7) {
        hc hcVar = q3Var.V;
        if (hcVar != null) {
            Object obj = hcVar.G(i7).G;
            if (obj instanceof TL_payments.connectedBotStarRef) {
                TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) obj;
                TLRPC.User a22 = qp.s1(q3Var.currentAccount).a2(Long.valueOf(connectedbotstarref.bot_id));
                k60 H = k60.H(q3Var, view);
                H.l(R.drawable.msg_bot, id.M0(2131746708, null), new ha.b(5, q3Var, a22), a22.bot_has_main_app);
                H.l(R.drawable.msg_bot, id.M0(2131752912, null), new ha.b(6, q3Var, connectedbotstarref), !a22.bot_has_main_app);
                H.c(R.drawable.msg_link2, id.M0(2131751762, null), new fi.x1(q3Var, connectedbotstarref, a22, 14), false);
                H.m(R.drawable.msg_leave, new ai.d0(q3Var, context, a22, connectedbotstarref, 19), id.M0(2131749005, null), !connectedbotstarref.revoked, true);
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
    public static void J0(Context context, int i7, final TL_payments.starRefProgram starrefprogram, long j3, h6 h6Var, boolean z9) {
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
        final org.telegram.ui.ActionBar.w2 l10 = k5.l(1, context, h6Var, false);
        long[] jArr2 = {j3};
        TLRPC.User a22 = qp.s1(i7).a2(Long.valueOf(starrefprogram.bot_id));
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
        frameLayout.addView(frameLayout2, ha.d(60, 60.0f, 19, 0.0f, 0.0f, 0.0f, 0.0f));
        k9 k9Var2 = new k9(context);
        k9Var2.setRoundRadius(org.telegram.messenger.g0.L(30.0f));
        v8 v8Var = new v8((h6) null);
        v8Var.r(a22);
        k9Var2.e(a22, v8Var);
        ka.a(k9Var2);
        frameLayout2.addView(k9Var2, ha.e(60, 60, qs.E1));
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
            int i11 = m6.ik;
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
            sb2.append((Object) dd.N0(starrefprogram.daily_revenue_per_user, 1.0f, ','));
            textView2.setText(dd.U0(sb2.toString(), 0.75f, new wp[1]));
            frameLayout3.addView(textView2, ha.c(15.66f, -2));
            frameLayout2.addView(frameLayout3, ha.d(-2, -2.0f, 81, 0.0f, 0.0f, 0.0f, -4.0f));
        } else {
            jArr = jArr2;
        }
        ImageView e10 = org.telegram.messenger.camera.q.e(context, R.drawable.msg_arrow_avatar);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        e10.setScaleType(scaleType);
        e10.setTranslationX(-org.telegram.messenger.g0.L(2.0825f));
        int i12 = m6.E6;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        t6.s(e10, i12, h6Var, mode);
        frameLayout.addView(e10, ha.d(36, 60.0f, 17, 60.0f, 0.0f, 60.0f, 0.0f));
        FrameLayout frameLayout4 = new FrameLayout(context);
        frameLayout4.setClipToPadding(false);
        frameLayout4.setClipChildren(false);
        frameLayout.addView(frameLayout4, ha.d(60, 60.0f, 21, 0.0f, 0.0f, 5.66f, 0.0f));
        k9 k9Var3 = new k9(context);
        k9Var3.setRoundRadius(org.telegram.messenger.g0.L(30.0f));
        frameLayout4.addView(k9Var3, ha.e(60, 60, qs.E1));
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
        int i14 = m6.Ci;
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
        wp wpVar = new wp(R.drawable.msg_link_1, 0);
        wpVar.H = 0.65f;
        wpVar.I = 0.65f;
        wpVar.G = 0.7f;
        float L5 = org.telegram.messenger.g0.L(-2.0f);
        float L6 = org.telegram.messenger.g0.L(0.0f);
        wpVar.r = L5;
        wpVar.s = L6;
        spannableString.setSpan(wpVar, 0, 1, 33);
        textView3.setText(spannableString);
        frameLayout5.addView(textView3, ha.c(15.66f, -2));
        frameLayout4.addView(frameLayout5, ha.d(-2, -2.0f, 81, 0.0f, 0.0f, 0.0f, -4.0f));
        f10.addView(frameLayout, ha.t(-2, -2, 1, 0, 0, 0, 0));
        TextView textView4 = new TextView(context);
        int i15 = m6.G6;
        t6.U(textView4, i15, h6Var);
        textView4.setTextSize(1, 20.0f);
        textView4.setGravity(17);
        textView4.setText(id.M0(2131752494, null));
        textView4.setTypeface(org.telegram.messenger.g0.o());
        f10.addView(textView4, ha.k(0.0f, 21.0f, 0.0f, 9.0f, -1, -2));
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
        textView5.setText(id.a0(null, null, 2131752493, m5.l(i7, starrefprogram.bot_id)));
        linearLayout2.addView(textView5, ha.t(-2, -2, 16, 11, 0, 0, 0));
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(scaleType);
        int i17 = m6.r5;
        t6.s(imageView, i17, h6Var, mode);
        imageView.setImageResource(R.drawable.settings_arrow);
        imageView.setScaleX(1.2f);
        imageView.setScaleY(1.2f);
        linearLayout2.addView(imageView, ha.t(-2, -2, 16, 5, 0, 8, 0));
        f10.addView(linearLayout2, ha.t(-2, 28, 1, 4, 0, 4, 0));
        ka.a(linearLayout2);
        TextView textView6 = new TextView(context);
        t6.U(textView6, i15, h6Var);
        textView6.setTextSize(1, 14.0f);
        textView6.setGravity(17);
        qs.i(textView6);
        SpannableString spannableString2 = new SpannableString(dd.N0(starrefprogram.daily_revenue_per_user, 0.95f, ','));
        spannableString2.setSpan(new u31(org.telegram.messenger.g0.o()), 0, spannableString2.length(), 33);
        textView6.setText(dd.a1(false, id.V(null, null, 2131752503, spannableString2), 0.725f, null));
        TextView f11 = org.telegram.messenger.camera.q.f(f10, textView6, ha.k(0.0f, 10.0f, 0.0f, 20.0f, -1, -2), context);
        t6.U(f11, i15, h6Var);
        f11.setTextSize(1, 14.0f);
        f11.setGravity(17);
        qs.i(f11);
        String p10 = t10.p(a22);
        String J0 = j.J0(starrefprogram.commission_permille);
        int i18 = starrefprogram.duration_months;
        if (i18 <= 0) {
            G = id.M0(2131752501, null);
        } else {
            if (i18 < 12 || i18 % 12 != 0) {
                str = p10;
                r15 = 0;
                G = id.G(i18, "ChannelAffiliateProgramJoinText_Months", new Object[0]);
                Object[] objArr = new Object[3];
                objArr[r15] = str;
                objArr[1] = J0;
                objArr[2] = G;
                f11.setText(i6.m(org.telegram.messenger.g0.X2(id.a0(null, null, 2131752502, objArr)), f11.getPaint().getFontMetricsInt(), r15, null, r15));
                f10.addView(f11, ha.k(0.0f, 0.0f, 0.0f, 22.0f, -1, -2));
                if (j3 < 0) {
                    TextView textView7 = new TextView(context);
                    t6.U(textView7, i15, h6Var);
                    textView7.setTextSize(1, 14.0f);
                    k5.m(textView7, 17, null, 2131752486);
                    f10.addView(textView7, ha.k(20.0f, 0.0f, 20.0f, 0.0f, -1, -2));
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
                    p6 p11 = t6.p(i16, i19);
                    linearLayout3.setBackground(k02);
                    t6.j(linearLayout3, k02, M7, p11, h6Var);
                    k9 k9Var4 = new k9(context);
                    k9Var4.setRoundRadius(org.telegram.messenger.g0.L(14.0f));
                    linearLayout3.addView(k9Var4, ha.o(28, 28));
                    TextView textView8 = new TextView(context);
                    textView8.setTextSize(1, 13.0f);
                    t6.U(textView8, i15, h6Var);
                    linearLayout3.addView(textView8, ha.t(-2, -2, 16, 6, 0, 0, 0));
                    ImageView imageView2 = new ImageView(context);
                    imageView2.setScaleType(scaleType);
                    t6.s(imageView2, i17, h6Var, mode);
                    imageView2.setImageResource(R.drawable.arrows_select);
                    linearLayout3.addView(imageView2, ha.t(-2, -2, 16, 2, 0, 5, 0));
                    f10.addView(linearLayout3, ha.t(-2, 28, 1, 0, 11, 0, 20));
                    linearLayout = linearLayout3;
                    k9Var = k9Var4;
                    textView = textView8;
                } else {
                    k9Var = null;
                    textView = null;
                    linearLayout = null;
                }
                fi.d dVar = new fi.d(context, h6Var, true);
                dVar.i(id.M0(2131752508, null), false, true);
                f10.addView(dVar, ha.o(-1, 48));
                w70 w70Var = new w70(context, h6Var);
                w70Var.setText(org.telegram.messenger.g0.U2(id.M0(2131752507, null), new pa(context, 8)));
                w70Var.setGravity(17);
                w70Var.setTextSize(1, 12.0f);
                t6.U(w70Var, m6.B6, h6Var);
                t6.G(w70Var, m6.Uc, h6Var);
                f10.addView(w70Var, ha.t(-1, -2, 49, 14, 14, 14, 6));
                l10.N = f10;
                final int i20 = 1;
                k9Var2.setOnClickListener(new View.OnClickListener() { // from class: hi.b3
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i20) {
                            case 0:
                                org.telegram.ui.ActionBar.f2 T = LaunchActivity.T();
                                if (T != null) {
                                    org.telegram.ui.ActionBar.w2 w2Var = l10;
                                    w2Var.dismiss();
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("user_id", starrefprogram.bot_id);
                                    T.presentFragment(new l3(bundle, w2Var));
                                    break;
                                }
                                break;
                            default:
                                org.telegram.ui.ActionBar.f2 T2 = LaunchActivity.T();
                                if (T2 != null) {
                                    l10.dismiss();
                                    T2.presentFragment(ProfileActivity.D4(starrefprogram.bot_id));
                                    break;
                                }
                                break;
                        }
                    }
                });
                dVar.setOnClickListener(new i3(dVar, jArr, i7, starrefprogram, l10, j3, z9, context, h6Var, a22));
                l10.setOnDismissListener(new fi.d1(6));
                ub ubVar = new ub(jArr, i7, k9Var3, k9Var, textView, 1);
                ubVar.run();
                if (linearLayout != null) {
                    bi.n0.g(i7).n();
                    bi.n0.g(i7).o();
                    LinearLayout linearLayout4 = linearLayout;
                    linearLayout4.setOnClickListener(new jb(i7, l10, h6Var, linearLayout4, jArr, ubVar));
                }
                final int i21 = 0;
                linearLayout2.setOnClickListener(new View.OnClickListener() { // from class: hi.b3
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i21) {
                            case 0:
                                org.telegram.ui.ActionBar.f2 T = LaunchActivity.T();
                                if (T != null) {
                                    org.telegram.ui.ActionBar.w2 w2Var = l10;
                                    w2Var.dismiss();
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("user_id", starrefprogram.bot_id);
                                    T.presentFragment(new l3(bundle, w2Var));
                                    break;
                                }
                                break;
                            default:
                                org.telegram.ui.ActionBar.f2 T2 = LaunchActivity.T();
                                if (T2 != null) {
                                    l10.dismiss();
                                    T2.presentFragment(ProfileActivity.D4(starrefprogram.bot_id));
                                    break;
                                }
                                break;
                        }
                    }
                });
                l10.P(i13);
                l10.show();
            }
            G = id.G(i18 / 12, "ChannelAffiliateProgramJoinText_Years", new Object[0]);
        }
        str = p10;
        r15 = 0;
        Object[] objArr2 = new Object[3];
        objArr2[r15] = str;
        objArr2[1] = J0;
        objArr2[2] = G;
        f11.setText(i6.m(org.telegram.messenger.g0.X2(id.a0(null, null, 2131752502, objArr2)), f11.getPaint().getFontMetricsInt(), r15, null, r15));
        f10.addView(f11, ha.k(0.0f, 0.0f, 0.0f, 22.0f, -1, -2));
        if (j3 < 0) {
        }
        fi.d dVar2 = new fi.d(context, h6Var, true);
        dVar2.i(id.M0(2131752508, null), false, true);
        f10.addView(dVar2, ha.o(-1, 48));
        w70 w70Var2 = new w70(context, h6Var);
        w70Var2.setText(org.telegram.messenger.g0.U2(id.M0(2131752507, null), new pa(context, 8)));
        w70Var2.setGravity(17);
        w70Var2.setTextSize(1, 12.0f);
        t6.U(w70Var2, m6.B6, h6Var);
        t6.G(w70Var2, m6.Uc, h6Var);
        f10.addView(w70Var2, ha.t(-1, -2, 49, 14, 14, 14, 6));
        l10.N = f10;
        final int i202 = 1;
        k9Var2.setOnClickListener(new View.OnClickListener() { // from class: hi.b3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i202) {
                    case 0:
                        org.telegram.ui.ActionBar.f2 T = LaunchActivity.T();
                        if (T != null) {
                            org.telegram.ui.ActionBar.w2 w2Var = l10;
                            w2Var.dismiss();
                            Bundle bundle = new Bundle();
                            bundle.putLong("user_id", starrefprogram.bot_id);
                            T.presentFragment(new l3(bundle, w2Var));
                            break;
                        }
                        break;
                    default:
                        org.telegram.ui.ActionBar.f2 T2 = LaunchActivity.T();
                        if (T2 != null) {
                            l10.dismiss();
                            T2.presentFragment(ProfileActivity.D4(starrefprogram.bot_id));
                            break;
                        }
                        break;
                }
            }
        });
        dVar2.setOnClickListener(new i3(dVar2, jArr, i7, starrefprogram, l10, j3, z9, context, h6Var, a22));
        l10.setOnDismissListener(new fi.d1(6));
        ub ubVar2 = new ub(jArr, i7, k9Var3, k9Var, textView, 1);
        ubVar2.run();
        if (linearLayout != null) {
        }
        final int i212 = 0;
        linearLayout2.setOnClickListener(new View.OnClickListener() { // from class: hi.b3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i212) {
                    case 0:
                        org.telegram.ui.ActionBar.f2 T = LaunchActivity.T();
                        if (T != null) {
                            org.telegram.ui.ActionBar.w2 w2Var = l10;
                            w2Var.dismiss();
                            Bundle bundle = new Bundle();
                            bundle.putLong("user_id", starrefprogram.bot_id);
                            T.presentFragment(new l3(bundle, w2Var));
                            break;
                        }
                        break;
                    default:
                        org.telegram.ui.ActionBar.f2 T2 = LaunchActivity.T();
                        if (T2 != null) {
                            l10.dismiss();
                            T2.presentFragment(ProfileActivity.D4(starrefprogram.bot_id));
                            break;
                        }
                        break;
                }
            }
        });
        l10.P(i13);
        l10.show();
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
        org.telegram.ui.ActionBar.w2 l10 = k5.l(1, context, h6Var, false);
        TLRPC.User a22 = qp.s1(i7).a2(Long.valueOf(connectedbotstarref.bot_id));
        LinearLayout f10 = k5.f(context, 1);
        f10.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(8.0f));
        f10.setClipChildren(false);
        f10.setClipToPadding(false);
        FrameLayout frameLayout = new FrameLayout(context);
        View view = new View(context);
        Drawable L = m6.L(org.telegram.messenger.g0.L(40.0f), m6.w0(connectedbotstarref.revoked ? m6.kk : m6.Ci, h6Var));
        p6 M = t6.M(connectedbotstarref.revoked ? m6.kk : m6.Ci);
        view.setBackground(L);
        t6.j(view, L, M, null, h6Var);
        frameLayout.addView(view, ha.d(80, 80.0f, 49, 0.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        ImageView.ScaleType scaleType2 = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType2);
        imageView.setImageResource(connectedbotstarref.revoked ? R.drawable.msg_link_2 : R.drawable.msg_limit_links);
        imageView.setScaleX(connectedbotstarref.revoked ? 2.0f : 1.8f);
        imageView.setScaleY(connectedbotstarref.revoked ? 2.0f : 1.8f);
        frameLayout.addView(imageView, ha.d(80, 80.0f, 49, 0.0f, 0.0f, 0.0f, 0.0f));
        if (connectedbotstarref.participants > 0) {
            FrameLayout frameLayout2 = new FrameLayout(context);
            int L2 = org.telegram.messenger.g0.L(50.0f);
            int i12 = m6.h5;
            Drawable d02 = m6.d0(L2, m6.w0(i12, h6Var));
            p6 M2 = t6.M(i12);
            frameLayout2.setBackground(d02);
            t6.j(frameLayout2, d02, M2, null, h6Var);
            frameLayout.addView(frameLayout2, ha.d(-2, -2.0f, 49, 0.0f, 66.0f, 0.0f, 0.0f));
            TextView textView = new TextView(context);
            textView.setTypeface(org.telegram.messenger.g0.o());
            textView.setTextSize(1, 12.0f);
            Drawable d03 = m6.d0(org.telegram.messenger.g0.L(9.5f), m6.w0(connectedbotstarref.revoked ? m6.kk : m6.ik, h6Var));
            p6 M3 = t6.M(connectedbotstarref.revoked ? m6.kk : m6.ik);
            textView.setBackground(d03);
            t6.j(textView, d03, M3, null, h6Var);
            textView.setTextColor(-1);
            textView.setPadding(org.telegram.messenger.g0.L(6.66f), 0, org.telegram.messenger.g0.L(6.66f), 0);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) "s ");
            wp wpVar = new wp(R.drawable.mini_reply_user, 0);
            wpVar.H = 0.937f;
            wpVar.I = 0.937f;
            float f11 = -org.telegram.messenger.g0.L(1.33f);
            float L3 = org.telegram.messenger.g0.L(1.0f);
            wpVar.r = f11;
            wpVar.s = L3;
            wpVar.G = 0.8f;
            scaleType = scaleType2;
            spannableStringBuilder.setSpan(wpVar, 0, 1, 33);
            spannableStringBuilder.append((CharSequence) String.valueOf(connectedbotstarref.participants));
            textView.setText(spannableStringBuilder);
            textView.setGravity(17);
            frameLayout2.addView(textView, ha.d(-1, 19.0f, qs.E1, 1.33f, 1.33f, 1.33f, 1.33f));
        } else {
            scaleType = scaleType2;
        }
        f10.addView(frameLayout, ha.t(-2, -2, 1, 0, 0, 0, 0));
        TextView textView2 = new TextView(context);
        int i13 = m6.G6;
        t6.U(textView2, i13, h6Var);
        textView2.setTextSize(1, 20.0f);
        textView2.setGravity(17);
        textView2.setText(id.M0(2131752482, null));
        textView2.setTypeface(org.telegram.messenger.g0.o());
        f10.addView(textView2, ha.k(20.0f, 16.0f, 20.0f, 9.33f, -1, -2));
        LinearLayout linearLayout3 = new LinearLayout(context);
        linearLayout3.setOrientation(0);
        int L4 = org.telegram.messenger.g0.L(28.0f);
        int i14 = m6.a7;
        ShapeDrawable d04 = m6.d0(L4, m6.w0(i14, h6Var));
        p6 M4 = t6.M(i14);
        linearLayout3.setBackground(d04);
        t6.j(linearLayout3, d04, M4, null, h6Var);
        k9 k9Var = new k9(context);
        k9Var.setRoundRadius(org.telegram.messenger.g0.L(14.0f));
        v8 v8Var = new v8((h6) null);
        linearLayout3.addView(k9Var, ha.o(28, 28));
        TextView textView3 = new TextView(context);
        textView3.setTextSize(1, 13.0f);
        t6.U(textView3, i13, h6Var);
        textView3.setText(m5.l(i7, connectedbotstarref.bot_id));
        v8Var.r(a22);
        k9Var.e(a22, v8Var);
        linearLayout3.addView(textView3, ha.t(-2, -2, 16, 6, 0, 0, 0));
        ImageView imageView2 = new ImageView(context);
        ImageView.ScaleType scaleType3 = scaleType;
        imageView2.setScaleType(scaleType3);
        int i15 = m6.r5;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        t6.s(imageView2, i15, h6Var, mode);
        imageView2.setImageResource(R.drawable.settings_arrow);
        imageView2.setScaleX(1.2f);
        imageView2.setScaleY(1.2f);
        linearLayout3.addView(imageView2, ha.t(-2, -2, 16, 5, 0, 8, 0));
        f10.addView(linearLayout3, ha.t(-2, 28, 1, 4, 0, 4, 0));
        ka.a(linearLayout3);
        TextView textView4 = new TextView(context);
        t6.U(textView4, i13, h6Var);
        textView4.setTextSize(1, 14.0f);
        textView4.setGravity(17);
        if (connectedbotstarref.revoked) {
            textView4.setText(org.telegram.messenger.g0.X2(id.M0(2131752484, null)));
            i10 = i15;
            w2Var = l10;
            linearLayout = linearLayout3;
        } else {
            linearLayout = linearLayout3;
            if (j3 < 0) {
                String J0 = j.J0(connectedbotstarref.commission_permille);
                String p10 = t10.p(a22);
                int i16 = connectedbotstarref.duration_months;
                i10 = i15;
                w2Var = l10;
                if (i16 <= 0) {
                    G2 = id.M0(2131752501, null);
                    c11 = 0;
                } else if (i16 < 12 || i16 % 12 != 0) {
                    c11 = 0;
                    G2 = id.G(i16, "ChannelAffiliateProgramJoinText_Months", new Object[0]);
                } else {
                    c11 = 0;
                    G2 = id.G(i16 / 12, "ChannelAffiliateProgramJoinText_Years", new Object[0]);
                }
                Object[] objArr = new Object[3];
                objArr[c11] = J0;
                objArr[1] = p10;
                objArr[2] = G2;
                k5.r(null, null, 2131752485, objArr, textView4);
            } else {
                i10 = i15;
                w2Var = l10;
                String J02 = j.J0(connectedbotstarref.commission_permille);
                String p11 = t10.p(a22);
                int i17 = connectedbotstarref.duration_months;
                if (i17 <= 0) {
                    G = id.M0(2131752501, null);
                    c10 = 0;
                } else if (i17 < 12 || i17 % 12 != 0) {
                    c10 = 0;
                    G = id.G(i17, "ChannelAffiliateProgramJoinText_Months", new Object[0]);
                } else {
                    c10 = 0;
                    G = id.G(i17 / 12, "ChannelAffiliateProgramJoinText_Years", new Object[0]);
                }
                Object[] objArr2 = new Object[3];
                objArr2[c10] = J02;
                objArr2[1] = p11;
                objArr2[2] = G;
                k5.r(null, null, 2131752483, objArr2, textView4);
            }
        }
        f10.addView(textView4, ha.k(20.0f, 19.0f, 20.0f, 18.0f, -1, -2));
        if (connectedbotstarref.revoked) {
            i11 = i14;
            linearLayout2 = null;
        } else {
            TextView textView5 = new TextView(context);
            t6.U(textView5, i13, h6Var);
            textView5.setTextSize(1, 14.0f);
            k5.m(textView5, 17, null, 2131752486);
            f10.addView(textView5, ha.k(20.0f, 0.0f, 20.0f, 0.0f, -1, -2));
            LinearLayout linearLayout4 = new LinearLayout(context);
            linearLayout4.setOrientation(0);
            Drawable d05 = m6.d0(org.telegram.messenger.g0.L(28.0f), m6.w0(i14, h6Var));
            p6 M5 = t6.M(i14);
            linearLayout4.setBackground(d05);
            t6.j(linearLayout4, d05, M5, null, h6Var);
            k9 k9Var2 = new k9(context);
            k9Var2.setRoundRadius(org.telegram.messenger.g0.L(14.0f));
            v8 v8Var2 = new v8((h6) null);
            linearLayout4.addView(k9Var2, ha.o(28, 28));
            TextView textView6 = new TextView(context);
            textView6.setTextSize(1, 13.0f);
            t6.U(textView6, i13, h6Var);
            if (j3 >= 0) {
                TLRPC.User a23 = qp.s1(i7).a2(Long.valueOf(j3));
                v8Var2.r(a23);
                k9Var2.e(a23, v8Var2);
                textView6.setText(t10.p(a23));
                i11 = i14;
            } else {
                i11 = i14;
                TLRPC.Chat M0 = qp.s1(i7).M0(Long.valueOf(-j3));
                v8Var2.q(M0);
                k9Var2.e(M0, v8Var2);
                textView6.setText(M0 == null ? "" : M0.title);
            }
            linearLayout4.addView(textView6, ha.t(-2, -2, 16, 6, 0, 0, 0));
            ImageView imageView3 = new ImageView(context);
            imageView3.setScaleType(scaleType3);
            t6.s(imageView3, i10, h6Var, mode);
            imageView3.setImageResource(R.drawable.arrows_select);
            linearLayout4.addView(imageView3, ha.t(-2, -2, 16, 2, 0, 5, 0));
            f10.addView(linearLayout4, ha.t(-2, 28, 1, 0, 9, 0, 22));
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
        p6 p12 = t6.p(i18, i19);
        textView7.setBackground(k02);
        t6.j(textView7, k02, M6, p12, h6Var);
        textView7.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(14.66f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(14.66f));
        String str = connectedbotstarref.url;
        textView7.setText((str == null || !str.startsWith("https://")) ? connectedbotstarref.url : connectedbotstarref.url.substring(8));
        f10.addView(textView7, ha.d(-1, -2.0f, 7, 0.0f, 0.0f, 0.0f, 12.0f));
        fi.d dVar = new fi.d(context, h6Var, true);
        if (connectedbotstarref.revoked) {
            dVar.i(id.M0(2131752487, null), false, true);
        } else {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            spannableStringBuilder2.append((CharSequence) "c ");
            spannableStringBuilder2.setSpan(new wp(R.drawable.msg_copy_filled, 0), 0, 1, 33);
            spannableStringBuilder2.append((CharSequence) id.M0(2131752492, null));
            dVar.i(spannableStringBuilder2, false, true);
        }
        f10.addView(dVar, ha.o(-1, 48));
        w70 w70Var = new w70(context, h6Var);
        long j10 = connectedbotstarref.participants;
        w70Var.setText(j10 <= 0 ? id.a0(null, null, 2131752490, t10.p(a22)) : id.G((int) j10, "ChannelAffiliateProgramLinkOpened", t10.p(a22)));
        w70Var.setGravity(17);
        w70Var.setTextSize(1, 12.0f);
        t6.U(w70Var, m6.B6, h6Var);
        t6.G(w70Var, m6.Uc, h6Var);
        f10.addView(w70Var, ha.t(-1, -2, 49, 14, 12, 14, 2));
        org.telegram.ui.ActionBar.w2 w2Var2 = w2Var;
        w2Var2.N = f10;
        ai.d0 d0Var = new ai.d0(connectedbotstarref, w2Var2, h6Var, a22, 18);
        if (!connectedbotstarref.revoked) {
            textView7.setOnClickListener(new ah.d(d0Var, 29));
        }
        h3 h3Var = new h3(connectedbotstarref, i7, w2Var2, context, j3, h6Var, d0Var);
        org.telegram.ui.ActionBar.w2 w2Var3 = w2Var2;
        dVar.setOnClickListener(h3Var);
        w2Var3.setOnDismissListener(new fi.d1(6));
        if (linearLayout2 != null) {
            bi.n0.g(i7).n();
            bi.n0.g(i7).o();
            LinearLayout linearLayout5 = linearLayout2;
            View.OnClickListener h3Var2 = new h3(i7, w2Var3, h6Var, linearLayout5, j3, context, connectedbotstarref);
            w2Var3 = w2Var3;
            connectedbotstarref2 = connectedbotstarref;
            linearLayout5.setOnClickListener(h3Var2);
        } else {
            connectedbotstarref2 = connectedbotstarref;
        }
        linearLayout.setOnClickListener(new bi.r(18, w2Var3, connectedbotstarref2));
        w2Var3.P(m6.h5);
        org.telegram.ui.ActionBar.f2 T = LaunchActivity.T();
        if (!org.telegram.messenger.g0.Q1() && T != null && !org.telegram.messenger.g0.u1(T)) {
            w2Var3.a0(T);
        }
        w2Var3.show();
        return w2Var3;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x01c2 A[LOOP:0: B:20:0x01bc->B:22:0x01c2, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void I0(ArrayList arrayList, m41 m41Var) {
        int i7;
        SpannableString spannableString;
        int i10;
        if (getParentActivity() == null) {
            return;
        }
        o00 o00Var = (o00) o0(getParentActivity());
        x31 x31Var = new x31(-2);
        x31Var.c = o00Var;
        arrayList.add(x31Var);
        arrayList.add(h.i(R.drawable.menu_feature_reliable, id.M0(2131752513, null), id.M0(2131752514, null)));
        arrayList.add(h.i(R.drawable.menu_feature_transparent, id.M0(2131752511, null), id.M0(2131752512, null)));
        arrayList.add(h.i(R.drawable.menu_feature_simple, id.M0(2131752509, null), id.M0(2131752510, null)));
        arrayList.add(x31.B(1, null));
        bi.n0 g10 = bi.n0.g(this.currentAccount);
        long j3 = this.R;
        bi.k0 d = g10.d(j3);
        ArrayList arrayList2 = d.e;
        if (!arrayList2.isEmpty() || d.c > 0) {
            arrayList.add(x31.u(id.M0(2131752481, null)));
            for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) arrayList2.get(i11);
                int i12 = m3.b;
                x31 K = x31.K(m3.class);
                K.G = connectedbotstarref;
                K.r = true;
                arrayList.add(K);
            }
            if (!d.d || d.g) {
                arrayList.add(x31.p(29));
                arrayList.add(x31.p(29));
                arrayList.add(x31.p(29));
            }
            arrayList.add(x31.B(2, null));
        }
        bi.l0 e10 = bi.n0.g(this.currentAccount).e(j3);
        ArrayList arrayList3 = e10.e;
        if (!arrayList3.isEmpty() || e10.c > 0) {
            String M0 = id.M0(2131752480, null);
            int i13 = e10.g;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) id.M0(2131752479, null)).append((CharSequence) " ");
            if (i13 == 1) {
                spannableString = new SpannableString(id.M0(2131752477, null) + "v");
            } else if (i13 == 2) {
                spannableString = new SpannableString(id.M0(2131752476, null) + "v");
            } else if (i13 == 3) {
                spannableString = new SpannableString(id.M0(2131752478, null) + "v");
            } else {
                i7 = 0;
                int i14 = o3.b;
                x31 K2 = x31.K(o3.class);
                K2.l = M0;
                K2.m = spannableStringBuilder;
                arrayList.add(K2);
                for (i10 = i7; i10 < arrayList3.size(); i10++) {
                    Object obj = arrayList3.get(i10);
                    int i15 = m3.b;
                    x31 K3 = x31.K(m3.class);
                    K3.G = obj;
                    K3.r = true;
                    arrayList.add(K3);
                }
                if (e10.d || e10.h) {
                    arrayList.add(x31.p(29));
                    arrayList.add(x31.p(29));
                    arrayList.add(x31.p(29));
                }
                arrayList.add(x31.B(3, null));
            }
            wp wpVar = new wp(R.drawable.arrow_more, 0);
            wpVar.f = true;
            wpVar.H = 0.6f;
            wpVar.I = 0.6f;
            spannableString.setSpan(wpVar, spannableString.length() - 1, spannableString.length(), 33);
            i7 = 0;
            spannableString.setSpan(new k3(this, i13, bi.n0.g(this.currentAccount).e(j3)), 0, spannableString.length(), 33);
            spannableStringBuilder.append((CharSequence) spannableString);
            int i142 = o3.b;
            x31 K22 = x31.K(o3.class);
            K22.l = M0;
            K22.m = spannableStringBuilder;
            arrayList.add(K22);
            while (i10 < arrayList3.size()) {
            }
            if (e10.d) {
            }
            arrayList.add(x31.p(29));
            arrayList.add(x31.p(29));
            arrayList.add(x31.p(29));
            arrayList.add(x31.B(3, null));
        }
        arrayList.add(x31.k(this.U));
    }

    @Override // org.telegram.ui.r00, org.telegram.ui.ActionBar.f2
    public final View createView(Context context) {
        this.G = false;
        this.E = org.telegram.messenger.g0.L(238.0f);
        sm smVar = new sm(context, 2);
        this.U = smVar;
        t6.h(m6.i5, smVar, null);
        super.createView(context);
        this.S = new FrameLayout(context);
        vg.m mVar = new vg.m(context, 1, 3);
        this.T = mVar;
        mVar.setImportantForAccessibility(4);
        vg.f fVar = this.T.b;
        fVar.z = m6.Tk;
        fVar.A = m6.Uk;
        fVar.b();
        this.T.setStarParticlesView(this.e);
        this.S.addView(this.T, ha.d(qs.U2, 190.0f, 17, 0.0f, 32.0f, 0.0f, 12.0f));
        j0(id.M0(2131752472, null), org.telegram.messenger.g0.X2(id.M0(2131752473, null)), this.S, null);
        this.c.setOnItemClickListener(new di.q4(2, this, context));
        this.c.setOnItemLongClickListener(new ab.g(16, this, context));
        v4.k kVar = new v4.k();
        kVar.m = false;
        kVar.C = false;
        kVar.o(wq.h);
        kVar.n(350L);
        this.c.setItemAnimator(kVar);
        this.c.setOnScrollListener(new ai.b(this, 15));
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.ls
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        hc hcVar;
        int i11 = qs.L3;
        long j3 = this.R;
        if (i7 != i11) {
            if (i7 == qs.K3 && ((Long) objArr[0]).longValue() == j3 && (hcVar = this.V) != null) {
                hcVar.O(true);
                return;
            }
            return;
        }
        if (((Long) objArr[0]).longValue() == j3) {
            hc hcVar2 = this.V;
            if (hcVar2 != null) {
                hcVar2.O(true);
            }
            bi.n0.g(this.currentAccount).d(j3).a();
        }
    }

    @Override // org.telegram.ui.r00
    public final v4.g0 k0() {
        hc hcVar = new hc(this, this.c, getParentActivity(), this.currentAccount, this.classGuid, new u1(this, 1), getResourceProvider(), 4);
        this.V = hcVar;
        return hcVar;
    }

    @Override // org.telegram.ui.r00
    public final ug.q1 m0() {
        e eVar = new e(getParentActivity(), 1);
        eVar.c();
        return eVar;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean onFragmentCreate() {
        qs.f(this.currentAccount).c(this, qs.L3);
        qs.f(this.currentAccount).c(this, qs.K3);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        qs.f(this.currentAccount).n(this, qs.L3);
        qs.f(this.currentAccount).n(this, qs.K3);
    }

    @Override // org.telegram.ui.r00, org.telegram.ui.ActionBar.f2
    public final void onPause() {
        super.onPause();
        vg.m mVar = this.T;
        if (mVar != null) {
            mVar.setPaused(true);
            this.T.setDialogVisible(true);
        }
    }

    @Override // org.telegram.ui.r00, org.telegram.ui.ActionBar.f2
    public final void onResume() {
        super.onResume();
        vg.m mVar = this.T;
        if (mVar != null) {
            mVar.setPaused(false);
            this.T.setDialogVisible(false);
        }
    }
}
