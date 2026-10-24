package gi;

import ai.jc;
import ai.nd;
import ai.ob;
import ai.sa;
import ai.vb;
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
import ci.x4;
import ei.p6;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.sl;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.b71;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.h9;
import org.telegram.ui.Components.j61;
import org.telegram.ui.Components.j80;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.un;
import org.telegram.ui.Components.w9;
import org.telegram.ui.Components.xq;
import org.telegram.ui.Components.y90;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.b20;
import w7.b6;
import w7.z5;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes4.dex */
public final class u3 extends b20 implements NotificationCenter.NotificationCenterDelegate {
    public final long R;
    public FrameLayout S;
    public tg.n T;
    public un U;
    public m3 V;

    public u3(long j10) {
        this.R = j10;
        this.M = true;
        this.L = AndroidUtilities.dp(60.0f);
    }

    public static /* synthetic */ void A0(u3 u3Var, Context context, int i10) {
        m3 m3Var = u3Var.V;
        if (m3Var == null) {
            return;
        }
        Object obj = m3Var.G(i10).G;
        if (obj instanceof TL_payments.starRefProgram) {
            H0(context, u3Var.currentAccount, (TL_payments.starRefProgram) obj, u3Var.R, u3Var.resourceProvider, false);
        } else if (obj instanceof TL_payments.connectedBotStarRef) {
            I0(context, u3Var.currentAccount, (TL_payments.connectedBotStarRef) obj, u3Var.R, u3Var.resourceProvider);
        }
    }

    public static void B0(u3 u3Var, TLObject tLObject, org.telegram.ui.ActionBar.c2 c2Var) {
        long j10 = u3Var.R;
        if (tLObject instanceof TL_payments.connectedStarRefBots) {
            TL_payments.connectedStarRefBots connectedstarrefbots = (TL_payments.connectedStarRefBots) tLObject;
            ai.h0 d = ai.k0.g(u3Var.currentAccount).d(j10);
            ArrayList arrayList = d.e;
            int i10 = d.a;
            MessagesController.getInstance(i10).putUsers(connectedstarrefbots.users, false);
            for (int i11 = 0; i11 < connectedstarrefbots.connected_bots.size(); i11++) {
                TL_payments.connectedBotStarRef connectedbotstarref = connectedstarrefbots.connected_bots.get(i11);
                int i12 = 0;
                while (true) {
                    if (i12 >= arrayList.size()) {
                        break;
                    }
                    if (((TL_payments.connectedBotStarRef) arrayList.get(i12)).bot_id != connectedbotstarref.bot_id) {
                        i12++;
                    } else if (connectedbotstarref.revoked) {
                        arrayList.remove(i12);
                        d.c = Math.max(d.c - 1, 0);
                    } else {
                        arrayList.set(i12, connectedbotstarref);
                    }
                }
            }
            NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.channelConnectedBotsUpdate, Long.valueOf(d.b));
            d.a();
            ai.i0 e = ai.k0.g(u3Var.currentAccount).e(j10);
            e.c = 0;
            e.d = false;
            e.i = false;
            e.f = 0L;
            e.j = null;
            e.h = false;
            e.a();
            u3Var.V.N(true);
        }
        c2Var.dismiss();
    }

    public static boolean C0(u3 u3Var, Context context, View view, int i10) {
        m3 m3Var = u3Var.V;
        if (m3Var != null) {
            Object obj = m3Var.G(i10).G;
            if (obj instanceof TL_payments.connectedBotStarRef) {
                TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) obj;
                TLRPC.User user = MessagesController.getInstance(u3Var.currentAccount).getUser(Long.valueOf(connectedbotstarref.bot_id));
                j80 H = j80.H(u3Var, view);
                H.l(R.drawable.msg_bot, LocaleController.getString(R.string.ProfileBotOpenApp), new p6(18, u3Var, user), user.bot_has_main_app);
                H.l(R.drawable.msg_bot, LocaleController.getString(R.string.BotWebViewOpenBot), new p6(19, u3Var, connectedbotstarref), !user.bot_has_main_app);
                H.c(R.drawable.msg_link2, LocaleController.getString(R.string.CopyLink), new ei.z1(u3Var, connectedbotstarref, user, 12), false);
                H.m(!connectedbotstarref.revoked, R.drawable.msg_leave, LocaleController.getString(R.string.LeaveAffiliateLinkButton), true, new ai.y0(u3Var, context, user, connectedbotstarref, 15));
                H.V(5);
                H.Z();
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0484  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x060d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x056e  */
    /* JADX WARN: Type inference failed for: r15v25 */
    /* JADX WARN: Type inference failed for: r15v28, types: [boolean] */
    /* JADX WARN: Type inference failed for: r15v35 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void H0(Context context, int i10, final TL_payments.starRefProgram starrefprogram, long j10, g6 g6Var, boolean z10) {
        long[] jArr;
        String str;
        String str2;
        ?? r15;
        String formatPluralString;
        w9 w9Var;
        TextView textView;
        LinearLayout linearLayout;
        if (starrefprogram == null || context == null) {
            return;
        }
        final org.telegram.ui.ActionBar.h3 j11 = sl.j(1, context, g6Var, false);
        long[] jArr2 = {j10};
        TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(starrefprogram.bot_id));
        LinearLayout e = sl.e(context, 1);
        e.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f));
        e.setClipChildren(false);
        e.setClipToPadding(false);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setClipToPadding(false);
        frameLayout.setClipChildren(false);
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setClipToPadding(false);
        frameLayout2.setClipChildren(false);
        frameLayout.addView(frameLayout2, z5.d(60, 60.0f, 19, 0.0f, 0.0f, 0.0f, 0.0f));
        w9 w9Var2 = new w9(context);
        w9Var2.setRoundRadius(AndroidUtilities.dp(30.0f));
        h9 h9Var = new h9((g6) null);
        h9Var.r(user);
        w9Var2.e(user, h9Var);
        b6.a(w9Var2);
        frameLayout2.addView(w9Var2, z5.e(60, 60, 119));
        if (starrefprogram.daily_revenue_per_user.positive()) {
            FrameLayout frameLayout3 = new FrameLayout(context);
            int dp = AndroidUtilities.dp(10.0f);
            int i11 = k6.h5;
            ShapeDrawable c02 = k6.c0(dp, k6.w0(i11, g6Var));
            n6 O = r6.O(i11);
            frameLayout3.setBackground(c02);
            r6.k(frameLayout3, c02, O, null, g6Var);
            frameLayout3.setPadding(AndroidUtilities.dp(1.33f), AndroidUtilities.dp(1.33f), AndroidUtilities.dp(1.33f), AndroidUtilities.dp(1.33f));
            TextView textView2 = new TextView(context);
            int dp2 = AndroidUtilities.dp(10.0f);
            int i12 = k6.uj;
            ShapeDrawable c03 = k6.c0(dp2, k6.w0(i12, g6Var));
            n6 O2 = r6.O(i12);
            textView2.setBackground(c03);
            r6.k(textView2, c03, O2, null, g6Var);
            textView2.setTypeface(AndroidUtilities.bold());
            textView2.setTextSize(1, 10.0f);
            textView2.setPadding(AndroidUtilities.dp(5.33f), 0, AndroidUtilities.dp(5.33f), 0);
            textView2.setTextColor(-1);
            textView2.setGravity(17);
            StringBuilder sb2 = new StringBuilder("⭐️ ");
            jArr = jArr2;
            sb2.append((Object) nd.L0(starrefprogram.daily_revenue_per_user, 1.0f, ','));
            textView2.setText(nd.S0(sb2.toString(), 0.75f, new xq[1]));
            frameLayout3.addView(textView2, z5.c(15.66f, -2));
            frameLayout2.addView(frameLayout3, z5.d(-2, -2.0f, 81, 0.0f, 0.0f, 0.0f, -4.0f));
        } else {
            jArr = jArr2;
        }
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(R.drawable.msg_arrow_avatar);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setTranslationX(-AndroidUtilities.dp(2.0825f));
        int i13 = k6.E6;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        r6.t(imageView, i13, g6Var, mode);
        frameLayout.addView(imageView, z5.d(36, 60.0f, 17, 60.0f, 0.0f, 60.0f, 0.0f));
        FrameLayout frameLayout4 = new FrameLayout(context);
        frameLayout4.setClipToPadding(false);
        frameLayout4.setClipChildren(false);
        frameLayout.addView(frameLayout4, z5.d(60, 60.0f, 21, 0.0f, 0.0f, 5.66f, 0.0f));
        w9 w9Var3 = new w9(context);
        w9Var3.setRoundRadius(AndroidUtilities.dp(30.0f));
        frameLayout4.addView(w9Var3, z5.e(60, 60, 119));
        FrameLayout frameLayout5 = new FrameLayout(context);
        int dp3 = AndroidUtilities.dp(10.0f);
        int i14 = k6.h5;
        Drawable c04 = k6.c0(dp3, k6.w0(i14, g6Var));
        n6 O3 = r6.O(i14);
        frameLayout5.setBackground(c04);
        r6.k(frameLayout5, c04, O3, null, g6Var);
        frameLayout5.setPadding(AndroidUtilities.dp(1.33f), AndroidUtilities.dp(1.33f), AndroidUtilities.dp(1.33f), AndroidUtilities.dp(1.33f));
        TextView textView3 = new TextView(context);
        int dp4 = AndroidUtilities.dp(10.0f);
        int i15 = k6.Oh;
        Drawable c05 = k6.c0(dp4, k6.w0(i15, g6Var));
        n6 O4 = r6.O(i15);
        textView3.setBackground(c05);
        r6.k(textView3, c05, O4, null, g6Var);
        textView3.setTypeface(AndroidUtilities.bold());
        textView3.setTextSize(1, 10.0f);
        textView3.setPadding(AndroidUtilities.dp(5.33f), 0, AndroidUtilities.dp(5.33f), 0);
        textView3.setTextColor(-1);
        textView3.setGravity(17);
        SpannableString spannableString = new SpannableString("s " + ((Object) l.H0(starrefprogram.commission_permille)));
        xq xqVar = new xq(R.drawable.msg_link_1, 0);
        xqVar.setScale(0.65f, 0.65f);
        xqVar.spaceScaleX = 0.7f;
        xqVar.translate(AndroidUtilities.dp(-2.0f), AndroidUtilities.dp(0.0f));
        spannableString.setSpan(xqVar, 0, 1, 33);
        textView3.setText(spannableString);
        frameLayout5.addView(textView3, z5.c(15.66f, -2));
        frameLayout4.addView(frameLayout5, z5.d(-2, -2.0f, 81, 0.0f, 0.0f, 0.0f, -4.0f));
        e.addView(frameLayout, z5.t(-2, -2, 1, 0, 0, 0, 0));
        TextView textView4 = new TextView(context);
        int i16 = k6.G6;
        r6.W(textView4, i16, g6Var);
        textView4.setTextSize(1, 20.0f);
        textView4.setGravity(17);
        textView4.setText(LocaleController.getString(R.string.ChannelAffiliateProgramJoinTitle));
        textView4.setTypeface(AndroidUtilities.bold());
        e.addView(textView4, z5.k(0.0f, 21.0f, 0.0f, 9.0f, -1, -2));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        int dp5 = AndroidUtilities.dp(28.0f);
        int i17 = k6.a7;
        ShapeDrawable c06 = k6.c0(dp5, k6.w0(i17, g6Var));
        n6 O5 = r6.O(i17);
        linearLayout2.setBackground(c06);
        r6.k(linearLayout2, c06, O5, null, g6Var);
        TextView textView5 = new TextView(context);
        textView5.setTextSize(1, 13.0f);
        r6.W(textView5, i16, g6Var);
        textView5.setText(LocaleController.formatString(R.string.ChannelAffiliateProgramJoinViewBot, DialogObject.getName(i10, starrefprogram.bot_id)));
        linearLayout2.addView(textView5, z5.t(-2, -2, 16, 11, 0, 0, 0));
        ImageView imageView2 = new ImageView(context);
        imageView2.setScaleType(scaleType);
        int i18 = k6.r5;
        r6.t(imageView2, i18, g6Var, mode);
        imageView2.setImageResource(R.drawable.settings_arrow);
        imageView2.setScaleX(1.2f);
        imageView2.setScaleY(1.2f);
        linearLayout2.addView(imageView2, z5.t(-2, -2, 16, 5, 0, 8, 0));
        e.addView(linearLayout2, z5.t(-2, 28, 1, 4, 0, 4, 0));
        b6.a(linearLayout2);
        TextView textView6 = new TextView(context);
        r6.W(textView6, i16, g6Var);
        textView6.setTextSize(1, 14.0f);
        textView6.setGravity(17);
        NotificationCenter.listenEmojiLoading(textView6);
        SpannableString spannableString2 = new SpannableString(nd.L0(starrefprogram.daily_revenue_per_user, 0.95f, ','));
        spannableString2.setSpan(new j61(AndroidUtilities.bold()), 0, spannableString2.length(), 33);
        textView6.setText(nd.Y0(false, LocaleController.formatSpannable(R.string.ChannelAffiliateProgramJoinRevenue, spannableString2), 0.725f, null));
        TextView f7 = sl.f(e, textView6, z5.k(0.0f, 10.0f, 0.0f, 20.0f, -1, -2), context);
        r6.W(f7, i16, g6Var);
        f7.setTextSize(1, 14.0f);
        f7.setGravity(17);
        NotificationCenter.listenEmojiLoading(f7);
        int i19 = R.string.ChannelAffiliateProgramJoinText;
        String userName = UserObject.getUserName(user);
        String H0 = l.H0(starrefprogram.commission_permille);
        int i20 = starrefprogram.duration_months;
        if (i20 <= 0) {
            formatPluralString = LocaleController.getString(R.string.ChannelAffiliateProgramJoinText_Lifetime);
            str = userName;
        } else {
            if (i20 < 12 || i20 % 12 != 0) {
                str = userName;
                str2 = H0;
                r15 = 0;
                formatPluralString = LocaleController.formatPluralString("ChannelAffiliateProgramJoinText_Months", i20, new Object[0]);
                Object[] objArr = new Object[3];
                objArr[r15] = str;
                objArr[1] = str2;
                objArr[2] = formatPluralString;
                f7.setText(Emoji.replaceEmoji(AndroidUtilities.replaceTags(LocaleController.formatString(i19, objArr)), f7.getPaint().getFontMetricsInt(), r15));
                e.addView(f7, z5.k(0.0f, 0.0f, 0.0f, 22.0f, -1, -2));
                if (j10 < 0) {
                    TextView textView7 = new TextView(context);
                    r6.W(textView7, i16, g6Var);
                    textView7.setTextSize(1, 14.0f);
                    textView7.setGravity(17);
                    textView7.setText(LocaleController.getString(R.string.ChannelAffiliateProgramLinkSendTo));
                    e.addView(textView7, z5.k(20.0f, 0.0f, 20.0f, 0.0f, -1, -2));
                    LinearLayout linearLayout3 = new LinearLayout(context);
                    linearLayout3.setOrientation(0);
                    ShapeDrawable c07 = k6.c0(AndroidUtilities.dp(28.0f), k6.w0(i17, g6Var));
                    n6 O6 = r6.O(i17);
                    linearLayout3.setBackground(c07);
                    r6.k(linearLayout3, c07, O6, null, g6Var);
                    int dp6 = AndroidUtilities.dp(28.0f);
                    int w02 = k6.w0(i17, g6Var);
                    int w03 = k6.w0(i17, g6Var);
                    int i21 = k6.i6;
                    int v = k6.v(w03, k6.w0(i21, g6Var));
                    org.telegram.ui.Cells.y j02 = k6.j0(dp6, dp6, dp6, dp6, w02, v, v);
                    n6 O7 = r6.O(i17);
                    n6 q6 = r6.q(i17, i21);
                    linearLayout3.setBackground(j02);
                    r6.k(linearLayout3, j02, O7, q6, g6Var);
                    w9Var = new w9(context);
                    w9Var.setRoundRadius(AndroidUtilities.dp(14.0f));
                    linearLayout3.addView(w9Var, z5.n(28, 28));
                    TextView textView8 = new TextView(context);
                    textView8.setTextSize(1, 13.0f);
                    r6.W(textView8, i16, g6Var);
                    linearLayout3.addView(textView8, z5.t(-2, -2, 16, 6, 0, 0, 0));
                    ImageView imageView3 = new ImageView(context);
                    imageView3.setScaleType(scaleType);
                    r6.t(imageView3, i18, g6Var, mode);
                    imageView3.setImageResource(R.drawable.arrows_select);
                    linearLayout3.addView(imageView3, z5.t(-2, -2, 16, 2, 0, 5, 0));
                    e.addView(linearLayout3, z5.t(-2, 28, 1, 0, 11, 0, 20));
                    linearLayout = linearLayout3;
                    textView = textView8;
                } else {
                    w9Var = null;
                    textView = null;
                    linearLayout = null;
                }
                ei.d dVar = new ei.d(context, g6Var, true);
                dVar.i(LocaleController.getString(R.string.ChannelAffiliateProgramJoinButton), false, true);
                e.addView(dVar, z5.n(-1, 48));
                y90 y90Var = new y90(context, g6Var);
                y90Var.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.ChannelAffiliateProgramJoinButtonInfo), new sa(context, 8)));
                y90Var.setGravity(17);
                y90Var.setTextSize(1, 12.0f);
                r6.W(y90Var, k6.B6, g6Var);
                r6.I(y90Var, k6.gc, g6Var);
                e.addView(y90Var, z5.t(-1, -2, 49, 14, 14, 14, 6));
                j11.customView = e;
                final int i22 = 1;
                w9Var2.setOnClickListener(new View.OnClickListener() { // from class: gi.e3
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i22) {
                            case 0:
                                org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                                if (U != null) {
                                    org.telegram.ui.ActionBar.h3 h3Var = j11;
                                    h3Var.dismiss();
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("user_id", starrefprogram.bot_id);
                                    U.presentFragment(new p3(bundle, h3Var));
                                    break;
                                }
                                break;
                            default:
                                org.telegram.ui.ActionBar.o2 U2 = LaunchActivity.U();
                                if (U2 != null) {
                                    j11.dismiss();
                                    U2.presentFragment(ProfileActivity.o4(starrefprogram.bot_id));
                                    break;
                                }
                                break;
                        }
                    }
                });
                dVar.setOnClickListener(new l3(dVar, jArr, i10, starrefprogram, j11, j10, z10, context, g6Var, user));
                j11.setOnDismissListener(new ei.e1(6));
                vb vbVar = new vb(jArr, i10, w9Var3, w9Var, textView, 1);
                vbVar.run();
                if (linearLayout != null) {
                    ai.k0.g(i10).n();
                    ai.k0.g(i10).o();
                    LinearLayout linearLayout4 = linearLayout;
                    linearLayout4.setOnClickListener(new ob(i10, j11, g6Var, linearLayout4, jArr, vbVar));
                }
                final int i23 = 0;
                linearLayout2.setOnClickListener(new View.OnClickListener() { // from class: gi.e3
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i23) {
                            case 0:
                                org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                                if (U != null) {
                                    org.telegram.ui.ActionBar.h3 h3Var = j11;
                                    h3Var.dismiss();
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("user_id", starrefprogram.bot_id);
                                    U.presentFragment(new p3(bundle, h3Var));
                                    break;
                                }
                                break;
                            default:
                                org.telegram.ui.ActionBar.o2 U2 = LaunchActivity.U();
                                if (U2 != null) {
                                    j11.dismiss();
                                    U2.presentFragment(ProfileActivity.o4(starrefprogram.bot_id));
                                    break;
                                }
                                break;
                        }
                    }
                });
                j11.fixNavigationBarKey(i14);
                j11.show();
            }
            str = userName;
            formatPluralString = LocaleController.formatPluralString("ChannelAffiliateProgramJoinText_Years", i20 / 12, new Object[0]);
        }
        str2 = H0;
        r15 = 0;
        Object[] objArr2 = new Object[3];
        objArr2[r15] = str;
        objArr2[1] = str2;
        objArr2[2] = formatPluralString;
        f7.setText(Emoji.replaceEmoji(AndroidUtilities.replaceTags(LocaleController.formatString(i19, objArr2)), f7.getPaint().getFontMetricsInt(), r15));
        e.addView(f7, z5.k(0.0f, 0.0f, 0.0f, 22.0f, -1, -2));
        if (j10 < 0) {
        }
        ei.d dVar2 = new ei.d(context, g6Var, true);
        dVar2.i(LocaleController.getString(R.string.ChannelAffiliateProgramJoinButton), false, true);
        e.addView(dVar2, z5.n(-1, 48));
        y90 y90Var2 = new y90(context, g6Var);
        y90Var2.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.ChannelAffiliateProgramJoinButtonInfo), new sa(context, 8)));
        y90Var2.setGravity(17);
        y90Var2.setTextSize(1, 12.0f);
        r6.W(y90Var2, k6.B6, g6Var);
        r6.I(y90Var2, k6.gc, g6Var);
        e.addView(y90Var2, z5.t(-1, -2, 49, 14, 14, 14, 6));
        j11.customView = e;
        final int i222 = 1;
        w9Var2.setOnClickListener(new View.OnClickListener() { // from class: gi.e3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i222) {
                    case 0:
                        org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                        if (U != null) {
                            org.telegram.ui.ActionBar.h3 h3Var = j11;
                            h3Var.dismiss();
                            Bundle bundle = new Bundle();
                            bundle.putLong("user_id", starrefprogram.bot_id);
                            U.presentFragment(new p3(bundle, h3Var));
                            break;
                        }
                        break;
                    default:
                        org.telegram.ui.ActionBar.o2 U2 = LaunchActivity.U();
                        if (U2 != null) {
                            j11.dismiss();
                            U2.presentFragment(ProfileActivity.o4(starrefprogram.bot_id));
                            break;
                        }
                        break;
                }
            }
        });
        dVar2.setOnClickListener(new l3(dVar2, jArr, i10, starrefprogram, j11, j10, z10, context, g6Var, user));
        j11.setOnDismissListener(new ei.e1(6));
        vb vbVar2 = new vb(jArr, i10, w9Var3, w9Var, textView, 1);
        vbVar2.run();
        if (linearLayout != null) {
        }
        final int i232 = 0;
        linearLayout2.setOnClickListener(new View.OnClickListener() { // from class: gi.e3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i232) {
                    case 0:
                        org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                        if (U != null) {
                            org.telegram.ui.ActionBar.h3 h3Var = j11;
                            h3Var.dismiss();
                            Bundle bundle = new Bundle();
                            bundle.putLong("user_id", starrefprogram.bot_id);
                            U.presentFragment(new p3(bundle, h3Var));
                            break;
                        }
                        break;
                    default:
                        org.telegram.ui.ActionBar.o2 U2 = LaunchActivity.U();
                        if (U2 != null) {
                            j11.dismiss();
                            U2.presentFragment(ProfileActivity.o4(starrefprogram.bot_id));
                            break;
                        }
                        break;
                }
            }
        });
        j11.fixNavigationBarKey(i14);
        j11.show();
    }

    public static org.telegram.ui.ActionBar.h3 I0(Context context, int i10, TL_payments.connectedBotStarRef connectedbotstarref, long j10, g6 g6Var) {
        ImageView.ScaleType scaleType;
        LinearLayout linearLayout;
        int i11;
        org.telegram.ui.ActionBar.h3 h3Var;
        String str;
        char c10;
        String formatPluralString;
        int i12;
        char c11;
        String formatPluralString2;
        int i13;
        LinearLayout linearLayout2;
        int i14;
        String formatPluralString3;
        TL_payments.connectedBotStarRef connectedbotstarref2;
        if (connectedbotstarref == null || context == null) {
            return null;
        }
        org.telegram.ui.ActionBar.h3 j11 = sl.j(1, context, g6Var, false);
        TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(connectedbotstarref.bot_id));
        LinearLayout e = sl.e(context, 1);
        e.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f));
        e.setClipChildren(false);
        e.setClipToPadding(false);
        FrameLayout frameLayout = new FrameLayout(context);
        View view = new View(context);
        Drawable K = k6.K(AndroidUtilities.dp(40.0f), k6.w0(connectedbotstarref.revoked ? k6.wj : k6.Oh, g6Var));
        n6 O = r6.O(connectedbotstarref.revoked ? k6.wj : k6.Oh);
        view.setBackground(K);
        r6.k(view, K, O, null, g6Var);
        frameLayout.addView(view, z5.d(80, 80.0f, 49, 0.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        ImageView.ScaleType scaleType2 = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType2);
        imageView.setImageResource(connectedbotstarref.revoked ? R.drawable.msg_link_2 : R.drawable.msg_limit_links);
        imageView.setScaleX(connectedbotstarref.revoked ? 2.0f : 1.8f);
        imageView.setScaleY(connectedbotstarref.revoked ? 2.0f : 1.8f);
        frameLayout.addView(imageView, z5.d(80, 80.0f, 49, 0.0f, 0.0f, 0.0f, 0.0f));
        if (connectedbotstarref.participants > 0) {
            FrameLayout frameLayout2 = new FrameLayout(context);
            int dp = AndroidUtilities.dp(50.0f);
            int i15 = k6.h5;
            Drawable c02 = k6.c0(dp, k6.w0(i15, g6Var));
            n6 O2 = r6.O(i15);
            frameLayout2.setBackground(c02);
            r6.k(frameLayout2, c02, O2, null, g6Var);
            frameLayout.addView(frameLayout2, z5.d(-2, -2.0f, 49, 0.0f, 66.0f, 0.0f, 0.0f));
            TextView textView = new TextView(context);
            textView.setTypeface(AndroidUtilities.bold());
            textView.setTextSize(1, 12.0f);
            Drawable c03 = k6.c0(AndroidUtilities.dp(9.5f), k6.w0(connectedbotstarref.revoked ? k6.wj : k6.uj, g6Var));
            n6 O3 = r6.O(connectedbotstarref.revoked ? k6.wj : k6.uj);
            textView.setBackground(c03);
            r6.k(textView, c03, O3, null, g6Var);
            textView.setTextColor(-1);
            textView.setPadding(AndroidUtilities.dp(6.66f), 0, AndroidUtilities.dp(6.66f), 0);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) "s ");
            xq xqVar = new xq(R.drawable.mini_reply_user, 0);
            xqVar.setScale(0.937f, 0.937f);
            xqVar.translate(-AndroidUtilities.dp(1.33f), AndroidUtilities.dp(1.0f));
            xqVar.spaceScaleX = 0.8f;
            scaleType = scaleType2;
            spannableStringBuilder.setSpan(xqVar, 0, 1, 33);
            spannableStringBuilder.append((CharSequence) String.valueOf(connectedbotstarref.participants));
            textView.setText(spannableStringBuilder);
            textView.setGravity(17);
            frameLayout2.addView(textView, z5.d(-1, 19.0f, 119, 1.33f, 1.33f, 1.33f, 1.33f));
        } else {
            scaleType = scaleType2;
        }
        e.addView(frameLayout, z5.t(-2, -2, 1, 0, 0, 0, 0));
        TextView textView2 = new TextView(context);
        int i16 = k6.G6;
        r6.W(textView2, i16, g6Var);
        textView2.setTextSize(1, 20.0f);
        textView2.setGravity(17);
        textView2.setText(LocaleController.getString(R.string.ChannelAffiliateProgramLinkTitle));
        textView2.setTypeface(AndroidUtilities.bold());
        e.addView(textView2, z5.k(20.0f, 16.0f, 20.0f, 9.33f, -1, -2));
        LinearLayout linearLayout3 = new LinearLayout(context);
        linearLayout3.setOrientation(0);
        int dp2 = AndroidUtilities.dp(28.0f);
        int i17 = k6.a7;
        ShapeDrawable c04 = k6.c0(dp2, k6.w0(i17, g6Var));
        n6 O4 = r6.O(i17);
        linearLayout3.setBackground(c04);
        r6.k(linearLayout3, c04, O4, null, g6Var);
        w9 w9Var = new w9(context);
        w9Var.setRoundRadius(AndroidUtilities.dp(14.0f));
        h9 h9Var = new h9((g6) null);
        linearLayout3.addView(w9Var, z5.n(28, 28));
        TextView textView3 = new TextView(context);
        textView3.setTextSize(1, 13.0f);
        r6.W(textView3, i16, g6Var);
        textView3.setText(DialogObject.getName(i10, connectedbotstarref.bot_id));
        h9Var.r(user);
        w9Var.e(user, h9Var);
        linearLayout3.addView(textView3, z5.t(-2, -2, 16, 6, 0, 0, 0));
        ImageView imageView2 = new ImageView(context);
        ImageView.ScaleType scaleType3 = scaleType;
        imageView2.setScaleType(scaleType3);
        int i18 = k6.r5;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        r6.t(imageView2, i18, g6Var, mode);
        imageView2.setImageResource(R.drawable.settings_arrow);
        imageView2.setScaleX(1.2f);
        imageView2.setScaleY(1.2f);
        linearLayout3.addView(imageView2, z5.t(-2, -2, 16, 5, 0, 8, 0));
        e.addView(linearLayout3, z5.t(-2, 28, 1, 4, 0, 4, 0));
        b6.a(linearLayout3);
        TextView textView4 = new TextView(context);
        r6.W(textView4, i16, g6Var);
        textView4.setTextSize(1, 14.0f);
        textView4.setGravity(17);
        if (connectedbotstarref.revoked) {
            org.telegram.messenger.v0.m(R.string.ChannelAffiliateProgramLinkTextRevoked, textView4);
            i11 = i18;
            h3Var = j11;
            linearLayout = linearLayout3;
        } else {
            linearLayout = linearLayout3;
            if (j10 < 0) {
                int i19 = R.string.ChannelAffiliateProgramLinkTextChannel;
                h3Var = j11;
                String H0 = l.H0(connectedbotstarref.commission_permille);
                String userName = UserObject.getUserName(user);
                int i20 = connectedbotstarref.duration_months;
                if (i20 <= 0) {
                    formatPluralString2 = LocaleController.getString(R.string.ChannelAffiliateProgramJoinText_Lifetime);
                    i11 = i18;
                    c11 = 0;
                } else {
                    i11 = i18;
                    if (i20 < 12 || i20 % 12 != 0) {
                        c11 = 0;
                        formatPluralString2 = LocaleController.formatPluralString("ChannelAffiliateProgramJoinText_Months", i20, new Object[0]);
                    } else {
                        c11 = 0;
                        formatPluralString2 = LocaleController.formatPluralString("ChannelAffiliateProgramJoinText_Years", i20 / 12, new Object[0]);
                    }
                }
                Object[] objArr = new Object[3];
                objArr[c11] = H0;
                objArr[1] = userName;
                objArr[2] = formatPluralString2;
                sl.r(i19, objArr, textView4);
            } else {
                i11 = i18;
                h3Var = j11;
                int i21 = R.string.ChannelAffiliateProgramLinkTextUser;
                String H02 = l.H0(connectedbotstarref.commission_permille);
                String userName2 = UserObject.getUserName(user);
                int i22 = connectedbotstarref.duration_months;
                if (i22 <= 0) {
                    formatPluralString = LocaleController.getString(R.string.ChannelAffiliateProgramJoinText_Lifetime);
                    str = userName2;
                    i12 = 3;
                    c10 = 0;
                } else {
                    str = userName2;
                    if (i22 < 12 || i22 % 12 != 0) {
                        c10 = 0;
                        formatPluralString = LocaleController.formatPluralString("ChannelAffiliateProgramJoinText_Months", i22, new Object[0]);
                    } else {
                        c10 = 0;
                        formatPluralString = LocaleController.formatPluralString("ChannelAffiliateProgramJoinText_Years", i22 / 12, new Object[0]);
                    }
                    i12 = 3;
                }
                Object[] objArr2 = new Object[i12];
                objArr2[c10] = H02;
                objArr2[1] = str;
                objArr2[2] = formatPluralString;
                sl.r(i21, objArr2, textView4);
            }
        }
        e.addView(textView4, z5.k(20.0f, 19.0f, 20.0f, 18.0f, -1, -2));
        if (connectedbotstarref.revoked) {
            i13 = i17;
            linearLayout2 = null;
        } else {
            TextView textView5 = new TextView(context);
            r6.W(textView5, i16, g6Var);
            textView5.setTextSize(1, 14.0f);
            textView5.setGravity(17);
            textView5.setText(LocaleController.getString(R.string.ChannelAffiliateProgramLinkSendTo));
            e.addView(textView5, z5.k(20.0f, 0.0f, 20.0f, 0.0f, -1, -2));
            LinearLayout linearLayout4 = new LinearLayout(context);
            linearLayout4.setOrientation(0);
            Drawable c05 = k6.c0(AndroidUtilities.dp(28.0f), k6.w0(i17, g6Var));
            n6 O5 = r6.O(i17);
            linearLayout4.setBackground(c05);
            r6.k(linearLayout4, c05, O5, null, g6Var);
            w9 w9Var2 = new w9(context);
            w9Var2.setRoundRadius(AndroidUtilities.dp(14.0f));
            h9 h9Var2 = new h9((g6) null);
            linearLayout4.addView(w9Var2, z5.n(28, 28));
            TextView textView6 = new TextView(context);
            textView6.setTextSize(1, 13.0f);
            r6.W(textView6, i16, g6Var);
            if (j10 >= 0) {
                TLRPC.User user2 = MessagesController.getInstance(i10).getUser(Long.valueOf(j10));
                h9Var2.r(user2);
                w9Var2.e(user2, h9Var2);
                textView6.setText(UserObject.getUserName(user2));
                i13 = i17;
            } else {
                i13 = i17;
                TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-j10));
                h9Var2.q(chat);
                w9Var2.e(chat, h9Var2);
                textView6.setText(chat == null ? "" : chat.title);
            }
            linearLayout4.addView(textView6, z5.t(-2, -2, 16, 6, 0, 0, 0));
            ImageView imageView3 = new ImageView(context);
            imageView3.setScaleType(scaleType3);
            r6.t(imageView3, i11, g6Var, mode);
            imageView3.setImageResource(R.drawable.arrows_select);
            linearLayout4.addView(imageView3, z5.t(-2, -2, 16, 2, 0, 5, 0));
            e.addView(linearLayout4, z5.t(-2, 28, 1, 0, 9, 0, 22));
            linearLayout2 = linearLayout4;
        }
        TextView textView7 = new TextView(context);
        textView7.setTextSize(1, 16.0f);
        textView7.setGravity(17);
        r6.W(textView7, i16, g6Var);
        int dp3 = AndroidUtilities.dp(8.0f);
        int i23 = i13;
        int w02 = k6.w0(i23, g6Var);
        int w03 = k6.w0(i23, g6Var);
        int i24 = k6.i6;
        int v = k6.v(w03, k6.w0(i24, g6Var));
        org.telegram.ui.Cells.y j02 = k6.j0(dp3, dp3, dp3, dp3, w02, v, v);
        n6 O6 = r6.O(i23);
        n6 q6 = r6.q(i23, i24);
        textView7.setBackground(j02);
        r6.k(textView7, j02, O6, q6, g6Var);
        textView7.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(14.66f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(14.66f));
        String str2 = connectedbotstarref.url;
        textView7.setText((str2 == null || !str2.startsWith("https://")) ? connectedbotstarref.url : connectedbotstarref.url.substring(8));
        e.addView(textView7, z5.d(-1, -2.0f, 7, 0.0f, 0.0f, 0.0f, 12.0f));
        ei.d dVar = new ei.d(context, g6Var, true);
        if (connectedbotstarref.revoked) {
            dVar.i(LocaleController.getString(R.string.ChannelAffiliateProgramLinkRejoin), false, true);
        } else {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            spannableStringBuilder2.append((CharSequence) "c ");
            spannableStringBuilder2.setSpan(new xq(R.drawable.msg_copy_filled, 0), 0, 1, 33);
            spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.ChannelAffiliateProgramLinkCopy));
            dVar.i(spannableStringBuilder2, false, true);
        }
        e.addView(dVar, z5.n(-1, 48));
        y90 y90Var = new y90(context, g6Var);
        long j12 = connectedbotstarref.participants;
        if (j12 <= 0) {
            i14 = 1;
            formatPluralString3 = LocaleController.formatString(R.string.ChannelAffiliateProgramLinkOpenedNone, UserObject.getUserName(user));
        } else {
            i14 = 1;
            formatPluralString3 = LocaleController.formatPluralString("ChannelAffiliateProgramLinkOpened", (int) j12, UserObject.getUserName(user));
        }
        y90Var.setText(formatPluralString3);
        y90Var.setGravity(17);
        y90Var.setTextSize(i14, 12.0f);
        r6.W(y90Var, k6.B6, g6Var);
        r6.I(y90Var, k6.gc, g6Var);
        e.addView(y90Var, z5.t(-1, -2, 49, 14, 12, 14, 2));
        org.telegram.ui.ActionBar.h3 h3Var2 = h3Var;
        h3Var2.customView = e;
        ai.y0 y0Var = new ai.y0(connectedbotstarref, h3Var2, g6Var, user, 14);
        if (!connectedbotstarref.revoked) {
            textView7.setOnClickListener(new ah.g0(y0Var, 27));
        }
        dVar.setOnClickListener(new k3(connectedbotstarref, i10, h3Var2, context, j10, g6Var, y0Var));
        h3Var2.setOnDismissListener(new ei.e1(6));
        if (linearLayout2 != null) {
            ai.k0.g(i10).n();
            ai.k0.g(i10).o();
            LinearLayout linearLayout5 = linearLayout2;
            connectedbotstarref2 = connectedbotstarref;
            linearLayout5.setOnClickListener(new k3(i10, h3Var2, g6Var, linearLayout5, j10, context, connectedbotstarref));
        } else {
            connectedbotstarref2 = connectedbotstarref;
        }
        linearLayout.setOnClickListener(new ai.p(19, h3Var2, connectedbotstarref2));
        h3Var2.fixNavigationBarKey(k6.h5);
        org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
        if (!AndroidUtilities.isTablet() && U != null && !AndroidUtilities.hasDialogOnTop(U)) {
            h3Var2.makeAttached(U);
        }
        h3Var2.show();
        return h3Var2;
    }

    public static void y0(u3 u3Var, Context context, TLRPC.User user, TL_payments.connectedBotStarRef connectedbotstarref) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, u3Var.resourceProvider);
        String string = LocaleController.getString(R.string.LeaveAffiliateLink);
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
        c2Var.R = string;
        c2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.LeaveAffiliateLinkAlert, UserObject.getUserName(user)));
        alertDialog$Builder.k(LocaleController.getString(R.string.LeaveAffiliateLinkButton), new ah.h0(13, u3Var, connectedbotstarref));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        alertDialog$Builder.d(-1);
        alertDialog$Builder.p();
    }

    public static void z0(u3 u3Var, TL_payments.connectedBotStarRef connectedbotstarref) {
        org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(u3Var.getParentActivity(), 3, null);
        c2Var.r(200L);
        TL_payments.editConnectedStarRefBot editconnectedstarrefbot = new TL_payments.editConnectedStarRefBot();
        editconnectedstarrefbot.link = connectedbotstarref.url;
        editconnectedstarrefbot.peer = MessagesController.getInstance(u3Var.currentAccount).getInputPeer(u3Var.R);
        editconnectedstarrefbot.revoked = true;
        u3Var.getConnectionsManager().sendRequest(editconnectedstarrefbot, new ai.g(16, u3Var, c2Var));
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x01a5 A[LOOP:0: B:20:0x019f->B:22:0x01a5, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void G0(ArrayList arrayList, b71 b71Var) {
        SpannableString spannableString;
        if (getParentActivity() == null) {
            return;
        }
        jc jcVar = (jc) r0(getParentActivity());
        m61 m61Var = new m61(-2);
        m61Var.c = jcVar;
        arrayList.add(m61Var);
        arrayList.add(j.a(R.drawable.menu_feature_reliable, LocaleController.getString(R.string.ChannelAffiliateProgramFeature1Title), LocaleController.getString(R.string.ChannelAffiliateProgramFeature1)));
        arrayList.add(j.a(R.drawable.menu_feature_transparent, LocaleController.getString(R.string.ChannelAffiliateProgramFeature2Title), LocaleController.getString(R.string.ChannelAffiliateProgramFeature2)));
        arrayList.add(j.a(R.drawable.menu_feature_simple, LocaleController.getString(R.string.ChannelAffiliateProgramFeature3Title), LocaleController.getString(R.string.ChannelAffiliateProgramFeature3)));
        arrayList.add(m61.A(1, null));
        ai.k0 g10 = ai.k0.g(this.currentAccount);
        long j10 = this.R;
        ai.h0 d = g10.d(j10);
        ArrayList arrayList2 = d.e;
        if (!arrayList2.isEmpty() || d.c > 0) {
            i2.o1.q(R.string.ChannelAffiliateProgramMyPrograms, arrayList);
            for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) arrayList2.get(i10);
                int i11 = q3.a;
                m61 J = m61.J(q3.class);
                J.G = connectedbotstarref;
                J.r = true;
                arrayList.add(J);
            }
            if (!d.d || d.g) {
                arrayList.add(m61.n(29));
                arrayList.add(m61.n(29));
                arrayList.add(m61.n(29));
            }
            arrayList.add(m61.A(2, null));
        }
        ai.i0 e = ai.k0.g(this.currentAccount).e(j10);
        ArrayList arrayList3 = e.e;
        if (!arrayList3.isEmpty() || e.c > 0) {
            String string = LocaleController.getString(R.string.ChannelAffiliateProgramPrograms);
            int i12 = e.g;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.ChannelAffiliateProgramProgramsSort)).append((CharSequence) " ");
            if (i12 == 1) {
                spannableString = new SpannableString(LocaleController.getString(R.string.ChannelAffiliateProgramProgramsSortProfitability) + "v");
            } else if (i12 == 2) {
                spannableString = new SpannableString(LocaleController.getString(R.string.ChannelAffiliateProgramProgramsSortRevenue) + "v");
            } else {
                if (i12 == 3) {
                    spannableString = new SpannableString(LocaleController.getString(R.string.ChannelAffiliateProgramProgramsSortDate) + "v");
                }
                int i13 = s3.a;
                m61 J2 = m61.J(s3.class);
                J2.l = string;
                J2.m = spannableStringBuilder;
                arrayList.add(J2);
                for (int i14 = 0; i14 < arrayList3.size(); i14++) {
                    Object obj = arrayList3.get(i14);
                    int i15 = q3.a;
                    m61 J3 = m61.J(q3.class);
                    J3.G = obj;
                    J3.r = true;
                    arrayList.add(J3);
                }
                if (e.d || e.h) {
                    arrayList.add(m61.n(29));
                    arrayList.add(m61.n(29));
                    arrayList.add(m61.n(29));
                }
                arrayList.add(m61.A(3, null));
            }
            xq xqVar = new xq(R.drawable.arrow_more, 0);
            xqVar.useLinkPaintColor = true;
            xqVar.setScale(0.6f, 0.6f);
            spannableString.setSpan(xqVar, spannableString.length() - 1, spannableString.length(), 33);
            spannableString.setSpan(new o3(this, i12, ai.k0.g(this.currentAccount).e(j10)), 0, spannableString.length(), 33);
            spannableStringBuilder.append((CharSequence) spannableString);
            int i132 = s3.a;
            m61 J22 = m61.J(s3.class);
            J22.l = string;
            J22.m = spannableStringBuilder;
            arrayList.add(J22);
            while (i14 < arrayList3.size()) {
            }
            if (e.d) {
            }
            arrayList.add(m61.n(29));
            arrayList.add(m61.n(29));
            arrayList.add(m61.n(29));
            arrayList.add(m61.A(3, null));
        }
        arrayList.add(m61.k(this.U));
    }

    @Override // org.telegram.ui.b20, org.telegram.ui.ActionBar.o2
    public final View createView(Context context) {
        this.G = false;
        this.E = AndroidUtilities.dp(238.0f);
        un unVar = new un(context, 3);
        this.U = unVar;
        r6.i(k6.i5, unVar, null);
        super.createView(context);
        this.S = new FrameLayout(context);
        tg.n nVar = new tg.n(context, 1, 3);
        this.T = nVar;
        nVar.setImportantForAccessibility(4);
        tg.g gVar = this.T.b;
        gVar.z = k6.fk;
        gVar.A = k6.gk;
        gVar.b();
        this.T.setStarParticlesView(this.e);
        this.S.addView(this.T, z5.d(190, 190.0f, 17, 0.0f, 32.0f, 0.0f, 12.0f));
        m0(LocaleController.getString(R.string.ChannelAffiliateProgramTitle), AndroidUtilities.replaceTags(LocaleController.getString(R.string.ChannelAffiliateProgramText)), this.S, null);
        this.c.setOnItemClickListener(new x4(2, this, context));
        this.c.setOnItemLongClickListener(new ah.h0(14, this, context));
        s4.k kVar = new s4.k();
        kVar.m = false;
        kVar.C = false;
        kVar.o(bs.h);
        kVar.n(350L);
        this.c.setItemAnimator(kVar);
        this.c.setOnScrollListener(new ah.d0(this, 9));
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        m3 m3Var;
        int i12 = NotificationCenter.channelConnectedBotsUpdate;
        long j10 = this.R;
        if (i10 != i12) {
            if (i10 == NotificationCenter.channelSuggestedBotsUpdate && ((Long) objArr[0]).longValue() == j10 && (m3Var = this.V) != null) {
                m3Var.N(true);
                return;
            }
            return;
        }
        if (((Long) objArr[0]).longValue() == j10) {
            m3 m3Var2 = this.V;
            if (m3Var2 != null) {
                m3Var2.N(true);
            }
            ai.k0.g(this.currentAccount).d(j10).a();
        }
    }

    @Override // org.telegram.ui.b20
    public final s4.g0 n0() {
        m3 m3Var = new m3(this, this.c, getParentActivity(), this.currentAccount, this.classGuid, new ai.q(this, 28), getResourceProvider());
        this.V = m3Var;
        return m3Var;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean onFragmentCreate() {
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.channelConnectedBotsUpdate);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.channelSuggestedBotsUpdate);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.channelConnectedBotsUpdate);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.channelSuggestedBotsUpdate);
    }

    @Override // org.telegram.ui.b20, org.telegram.ui.ActionBar.o2
    public final void onPause() {
        super.onPause();
        tg.n nVar = this.T;
        if (nVar != null) {
            nVar.setPaused(true);
            this.T.setDialogVisible(true);
        }
    }

    @Override // org.telegram.ui.b20, org.telegram.ui.ActionBar.o2
    public final void onResume() {
        super.onResume();
        tg.n nVar = this.T;
        if (nVar != null) {
            nVar.setPaused(false);
            this.T.setDialogVisible(false);
        }
    }

    @Override // org.telegram.ui.b20
    public final sg.x1 p0() {
        f fVar = new f(getParentActivity(), 1);
        fVar.c();
        return fVar;
    }
}
