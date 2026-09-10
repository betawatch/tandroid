package di;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import bi.af;
import bi.cb;
import bi.nc;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.em;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.g9;
import org.telegram.ui.Components.j61;
import org.telegram.ui.Components.m90;
import org.telegram.ui.Components.qn;
import org.telegram.ui.Components.s51;
import org.telegram.ui.Components.uq;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.w70;
import org.telegram.ui.Components.w9;
import org.telegram.ui.Components.wr;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.s20;
import w7.a6;
import w7.c6;
import xh.z7;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class h4 extends s20 implements NotificationCenter.NotificationCenterDelegate {
    public final long P;
    public FrameLayout Q;
    public rg.f R;
    public qn S;
    public z3 T;

    public h4(long j3) {
        this.P = j3;
        this.M = true;
        this.L = AndroidUtilities.dp(60.0f);
    }

    public static void A0(h4 h4Var, TLObject tLObject, org.telegram.ui.ActionBar.d2 d2Var) {
        long j3 = h4Var.P;
        if (tLObject instanceof TL_payments.connectedStarRefBots) {
            TL_payments.connectedStarRefBots connectedstarrefbots = (TL_payments.connectedStarRefBots) tLObject;
            xh.m d = xh.p.g(h4Var.currentAccount).d(j3);
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
            xh.n e = xh.p.g(h4Var.currentAccount).e(j3);
            e.c = 0;
            e.d = false;
            e.i = false;
            e.f = 0L;
            e.j = null;
            e.h = false;
            e.a();
            h4Var.T.N(true);
        }
        d2Var.dismiss();
    }

    public static boolean B0(h4 h4Var, Context context, View view, int i10) {
        z3 z3Var = h4Var.T;
        if (z3Var != null) {
            Object obj = z3Var.G(i10).G;
            if (obj instanceof TL_payments.connectedBotStarRef) {
                TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) obj;
                TLRPC.User user = MessagesController.getInstance(h4Var.currentAccount).getUser(Long.valueOf(connectedbotstarref.bot_id));
                w70 H = w70.H(h4Var, view);
                H.l(R.drawable.msg_bot, LocaleController.getString(R.string.ProfileBotOpenApp), new af(13, h4Var, user), user.bot_has_main_app);
                H.l(R.drawable.msg_bot, LocaleController.getString(R.string.BotWebViewOpenBot), new af(14, h4Var, connectedbotstarref), !user.bot_has_main_app);
                H.c(R.drawable.msg_link2, LocaleController.getString(R.string.CopyLink), new a3.k0(h4Var, connectedbotstarref, user, 17), false);
                H.m(!connectedbotstarref.revoked, R.drawable.msg_leave, LocaleController.getString(R.string.LeaveAffiliateLinkButton), true, new androidx.car.app.utils.b(h4Var, context, user, connectedbotstarref, 5));
                H.V(5);
                H.Z();
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0467  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x05f1  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0610  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x054a  */
    /* JADX WARN: Type inference failed for: r14v17 */
    /* JADX WARN: Type inference failed for: r14v20, types: [boolean] */
    /* JADX WARN: Type inference failed for: r14v22 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void G0(Context context, int i10, final TL_payments.starRefProgram starrefprogram, long j3, f6 f6Var, boolean z10) {
        long[] jArr;
        float f7;
        String str;
        String str2;
        ?? r14;
        String formatPluralString;
        LinearLayout linearLayout;
        w9 w9Var;
        TextView textView;
        f6 f6Var2;
        if (starrefprogram == null || context == null) {
            return;
        }
        final org.telegram.ui.ActionBar.h3 i11 = em.i(1, context, f6Var, false);
        long[] jArr2 = {j3};
        TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(starrefprogram.bot_id));
        LinearLayout f10 = em.f(context, 1);
        f10.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f));
        f10.setClipChildren(false);
        f10.setClipToPadding(false);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setClipToPadding(false);
        frameLayout.setClipChildren(false);
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setClipToPadding(false);
        frameLayout2.setClipChildren(false);
        frameLayout.addView(frameLayout2, a6.d(60, 60.0f, 19, 0.0f, 0.0f, 0.0f, 0.0f));
        w9 w9Var2 = new w9(context);
        w9Var2.setRoundRadius(AndroidUtilities.dp(30.0f));
        g9 g9Var = new g9((f6) null);
        g9Var.r(user);
        w9Var2.e(user, g9Var);
        c6.a(w9Var2);
        frameLayout2.addView(w9Var2, a6.e(60, 60, 119));
        if (starrefprogram.daily_revenue_per_user.positive()) {
            FrameLayout frameLayout3 = new FrameLayout(context);
            frameLayout3.setBackground(j6.b0(AndroidUtilities.dp(10.0f), j6.v0(j6.h5, f6Var)));
            frameLayout3.setPadding(AndroidUtilities.dp(1.33f), AndroidUtilities.dp(1.33f), AndroidUtilities.dp(1.33f), AndroidUtilities.dp(1.33f));
            TextView textView2 = new TextView(context);
            textView2.setBackground(j6.b0(AndroidUtilities.dp(10.0f), j6.v0(j6.uj, f6Var)));
            textView2.setTypeface(AndroidUtilities.bold());
            textView2.setTextSize(1, 10.0f);
            f7 = 10.0f;
            textView2.setPadding(AndroidUtilities.dp(5.33f), 0, AndroidUtilities.dp(5.33f), 0);
            textView2.setTextColor(-1);
            textView2.setGravity(17);
            StringBuilder sb2 = new StringBuilder("⭐️ ");
            jArr = jArr2;
            sb2.append((Object) z7.K0(starrefprogram.daily_revenue_per_user, 1.0f, ','));
            textView2.setText(z7.R0(sb2.toString(), 0.75f, new uq[1]));
            frameLayout3.addView(textView2, a6.c(15.66f, -2));
            frameLayout2.addView(frameLayout3, a6.d(-2, -2.0f, 81, 0.0f, 0.0f, 0.0f, -4.0f));
        } else {
            jArr = jArr2;
            f7 = 10.0f;
        }
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(R.drawable.msg_arrow_avatar);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setTranslationX(-AndroidUtilities.dp(2.0825f));
        int v02 = j6.v0(j6.E6, f6Var);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView.setColorFilter(new PorterDuffColorFilter(v02, mode));
        frameLayout.addView(imageView, a6.d(36, 60.0f, 17, 60.0f, 0.0f, 60.0f, 0.0f));
        FrameLayout frameLayout4 = new FrameLayout(context);
        frameLayout4.setClipToPadding(false);
        frameLayout4.setClipChildren(false);
        frameLayout.addView(frameLayout4, a6.d(60, 60.0f, 21, 0.0f, 0.0f, 5.66f, 0.0f));
        w9 w9Var3 = new w9(context);
        w9Var3.setRoundRadius(AndroidUtilities.dp(30.0f));
        frameLayout4.addView(w9Var3, a6.e(60, 60, 119));
        FrameLayout frameLayout5 = new FrameLayout(context);
        int dp = AndroidUtilities.dp(f7);
        int i12 = j6.h5;
        frameLayout5.setBackground(j6.b0(dp, j6.v0(i12, f6Var)));
        frameLayout5.setPadding(AndroidUtilities.dp(1.33f), AndroidUtilities.dp(1.33f), AndroidUtilities.dp(1.33f), AndroidUtilities.dp(1.33f));
        TextView textView3 = new TextView(context);
        textView3.setBackground(j6.b0(AndroidUtilities.dp(f7), j6.v0(j6.Oh, f6Var)));
        textView3.setTypeface(AndroidUtilities.bold());
        textView3.setTextSize(1, 10.0f);
        textView3.setPadding(AndroidUtilities.dp(5.33f), 0, AndroidUtilities.dp(5.33f), 0);
        textView3.setTextColor(-1);
        textView3.setGravity(17);
        SpannableString spannableString = new SpannableString("s " + ((Object) m.G0(starrefprogram.commission_permille)));
        uq uqVar = new uq(R.drawable.msg_link_1, 0);
        uqVar.setScale(0.65f, 0.65f);
        uqVar.spaceScaleX = 0.7f;
        uqVar.translate(AndroidUtilities.dp(-2.0f), AndroidUtilities.dp(0.0f));
        spannableString.setSpan(uqVar, 0, 1, 33);
        textView3.setText(spannableString);
        frameLayout5.addView(textView3, a6.c(15.66f, -2));
        frameLayout4.addView(frameLayout5, a6.d(-2, -2.0f, 81, 0.0f, 0.0f, 0.0f, -4.0f));
        f10.addView(frameLayout, a6.t(-2, -2, 1, 0, 0, 0, 0));
        TextView textView4 = new TextView(context);
        int i13 = j6.G6;
        em.n(i13, f6Var, textView4, 1, 20.0f);
        textView4.setGravity(17);
        textView4.setText(LocaleController.getString(R.string.ChannelAffiliateProgramJoinTitle));
        textView4.setTypeface(AndroidUtilities.bold());
        f10.addView(textView4, a6.k(0.0f, 21.0f, 0.0f, 9.0f, -1, -2));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        int dp2 = AndroidUtilities.dp(28.0f);
        int i14 = j6.a7;
        linearLayout2.setBackground(j6.b0(dp2, j6.v0(i14, f6Var)));
        TextView textView5 = new TextView(context);
        textView5.setTextSize(1, 13.0f);
        textView5.setTextColor(j6.v0(i13, f6Var));
        textView5.setText(LocaleController.formatString(R.string.ChannelAffiliateProgramJoinViewBot, DialogObject.getName(i10, starrefprogram.bot_id)));
        linearLayout2.addView(textView5, a6.t(-2, -2, 16, 11, 0, 0, 0));
        ImageView imageView2 = new ImageView(context);
        imageView2.setScaleType(scaleType);
        int i15 = j6.r5;
        imageView2.setColorFilter(new PorterDuffColorFilter(j6.v0(i15, f6Var), mode));
        imageView2.setImageResource(R.drawable.settings_arrow);
        imageView2.setScaleX(1.2f);
        imageView2.setScaleY(1.2f);
        linearLayout2.addView(imageView2, a6.t(-2, -2, 16, 5, 0, 8, 0));
        f10.addView(linearLayout2, a6.t(-2, 28, 1, 4, 0, 4, 0));
        c6.a(linearLayout2);
        TextView textView6 = new TextView(context);
        em.n(i13, f6Var, textView6, 1, 14.0f);
        textView6.setGravity(17);
        NotificationCenter.listenEmojiLoading(textView6);
        SpannableString spannableString2 = new SpannableString(z7.K0(starrefprogram.daily_revenue_per_user, 0.95f, ','));
        spannableString2.setSpan(new s51(AndroidUtilities.bold()), 0, spannableString2.length(), 33);
        textView6.setText(z7.X0(false, LocaleController.formatSpannable(R.string.ChannelAffiliateProgramJoinRevenue, spannableString2), 0.725f, null));
        TextView g10 = com.google.android.gms.internal.vision.e2.g(f10, textView6, a6.k(0.0f, 10.0f, 0.0f, 20.0f, -1, -2), context);
        em.n(i13, f6Var, g10, 1, 14.0f);
        g10.setGravity(17);
        NotificationCenter.listenEmojiLoading(g10);
        int i16 = R.string.ChannelAffiliateProgramJoinText;
        String userName = UserObject.getUserName(user);
        String G0 = m.G0(starrefprogram.commission_permille);
        int i17 = starrefprogram.duration_months;
        if (i17 <= 0) {
            formatPluralString = LocaleController.getString(R.string.ChannelAffiliateProgramJoinText_Lifetime);
            str = userName;
        } else {
            if (i17 < 12 || i17 % 12 != 0) {
                str = userName;
                str2 = G0;
                r14 = 0;
                formatPluralString = LocaleController.formatPluralString("ChannelAffiliateProgramJoinText_Months", i17, new Object[0]);
                Object[] objArr = new Object[3];
                objArr[r14] = str;
                objArr[1] = str2;
                objArr[2] = formatPluralString;
                g10.setText(Emoji.replaceEmoji(AndroidUtilities.replaceTags(LocaleController.formatString(i16, objArr)), g10.getPaint().getFontMetricsInt(), r14));
                f10.addView(g10, a6.k(0.0f, 0.0f, 0.0f, 22.0f, -1, -2));
                if (j3 < 0) {
                    TextView textView7 = new TextView(context);
                    em.n(i13, f6Var, textView7, 1, 14.0f);
                    textView7.setGravity(17);
                    textView7.setText(LocaleController.getString(R.string.ChannelAffiliateProgramLinkSendTo));
                    f10.addView(textView7, a6.k(20.0f, 0.0f, 20.0f, 0.0f, -1, -2));
                    LinearLayout linearLayout3 = new LinearLayout(context);
                    linearLayout3.setOrientation(0);
                    linearLayout3.setBackground(j6.b0(AndroidUtilities.dp(28.0f), j6.v0(i14, f6Var)));
                    int dp3 = AndroidUtilities.dp(28.0f);
                    int v03 = j6.v0(i14, f6Var);
                    int v = j6.v(j6.v0(i14, f6Var), j6.v0(j6.i6, f6Var));
                    linearLayout3.setBackground(j6.i0(dp3, dp3, dp3, dp3, v03, v, v));
                    w9 w9Var4 = new w9(context);
                    w9Var4.setRoundRadius(AndroidUtilities.dp(14.0f));
                    linearLayout3.addView(w9Var4, a6.n(28, 28));
                    TextView textView8 = new TextView(context);
                    textView8.setTextSize(1, 13.0f);
                    textView8.setTextColor(j6.v0(i13, f6Var));
                    linearLayout3.addView(textView8, a6.t(-2, -2, 16, 6, 0, 0, 0));
                    ImageView imageView3 = new ImageView(context);
                    imageView3.setScaleType(scaleType);
                    imageView3.setColorFilter(new PorterDuffColorFilter(j6.v0(i15, f6Var), mode));
                    imageView3.setImageResource(R.drawable.arrows_select);
                    linearLayout3.addView(imageView3, a6.t(-2, -2, 16, 2, 0, 5, 0));
                    f10.addView(linearLayout3, a6.t(-2, 28, 1, 0, 11, 0, 20));
                    textView = textView8;
                    linearLayout = linearLayout3;
                    w9Var = w9Var4;
                } else {
                    linearLayout = null;
                    w9Var = null;
                    textView = null;
                }
                bi.d dVar = new bi.d(context, f6Var, true);
                dVar.g(LocaleController.getString(R.string.ChannelAffiliateProgramJoinButton), false, true);
                f10.addView(dVar, a6.n(-1, 48));
                m90 m90Var = new m90(context, f6Var);
                m90Var.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.ChannelAffiliateProgramJoinButtonInfo), new ci.a(context, 1)));
                m90Var.setGravity(17);
                m90Var.setTextSize(1, 12.0f);
                m90Var.setTextColor(j6.v0(j6.B6, f6Var));
                m90Var.setLinkTextColor(j6.v0(j6.gc, f6Var));
                f10.addView(m90Var, a6.t(-1, -2, 49, 14, 14, 14, 6));
                i11.customView = f10;
                final int i18 = 1;
                w9Var2.setOnClickListener(new View.OnClickListener() { // from class: di.q3
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i18) {
                            case 0:
                                org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
                                if (U != null) {
                                    org.telegram.ui.ActionBar.h3 h3Var = i11;
                                    h3Var.dismiss();
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("user_id", starrefprogram.bot_id);
                                    U.presentFragment(new c4(bundle, h3Var));
                                    break;
                                }
                                break;
                            default:
                                org.telegram.ui.ActionBar.p2 U2 = LaunchActivity.U();
                                if (U2 != null) {
                                    i11.dismiss();
                                    U2.presentFragment(ProfileActivity.m4(starrefprogram.bot_id));
                                    break;
                                }
                                break;
                        }
                    }
                });
                dVar.setOnClickListener(new y3(dVar, jArr, i10, starrefprogram, i11, j3, z10, context, f6Var, user));
                i11.setOnDismissListener(new bi.k1(6));
                o3 o3Var = new o3(jArr, i10, w9Var3, w9Var, textView, 0);
                o3Var.run();
                if (linearLayout == null) {
                    xh.p.g(i10).n();
                    xh.p.g(i10).o();
                    LinearLayout linearLayout4 = linearLayout;
                    f6Var2 = f6Var;
                    linearLayout4.setOnClickListener(new p3(i10, i11, f6Var2, linearLayout4, jArr, o3Var));
                } else {
                    f6Var2 = f6Var;
                }
                final int i19 = 0;
                linearLayout2.setOnClickListener(new View.OnClickListener() { // from class: di.q3
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i19) {
                            case 0:
                                org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
                                if (U != null) {
                                    org.telegram.ui.ActionBar.h3 h3Var = i11;
                                    h3Var.dismiss();
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("user_id", starrefprogram.bot_id);
                                    U.presentFragment(new c4(bundle, h3Var));
                                    break;
                                }
                                break;
                            default:
                                org.telegram.ui.ActionBar.p2 U2 = LaunchActivity.U();
                                if (U2 != null) {
                                    i11.dismiss();
                                    U2.presentFragment(ProfileActivity.m4(starrefprogram.bot_id));
                                    break;
                                }
                                break;
                        }
                    }
                });
                i11.fixNavigationBar(j6.v0(i12, f6Var2));
                i11.show();
            }
            str = userName;
            formatPluralString = LocaleController.formatPluralString("ChannelAffiliateProgramJoinText_Years", i17 / 12, new Object[0]);
        }
        str2 = G0;
        r14 = 0;
        Object[] objArr2 = new Object[3];
        objArr2[r14] = str;
        objArr2[1] = str2;
        objArr2[2] = formatPluralString;
        g10.setText(Emoji.replaceEmoji(AndroidUtilities.replaceTags(LocaleController.formatString(i16, objArr2)), g10.getPaint().getFontMetricsInt(), r14));
        f10.addView(g10, a6.k(0.0f, 0.0f, 0.0f, 22.0f, -1, -2));
        if (j3 < 0) {
        }
        bi.d dVar2 = new bi.d(context, f6Var, true);
        dVar2.g(LocaleController.getString(R.string.ChannelAffiliateProgramJoinButton), false, true);
        f10.addView(dVar2, a6.n(-1, 48));
        m90 m90Var2 = new m90(context, f6Var);
        m90Var2.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.ChannelAffiliateProgramJoinButtonInfo), new ci.a(context, 1)));
        m90Var2.setGravity(17);
        m90Var2.setTextSize(1, 12.0f);
        m90Var2.setTextColor(j6.v0(j6.B6, f6Var));
        m90Var2.setLinkTextColor(j6.v0(j6.gc, f6Var));
        f10.addView(m90Var2, a6.t(-1, -2, 49, 14, 14, 14, 6));
        i11.customView = f10;
        final int i182 = 1;
        w9Var2.setOnClickListener(new View.OnClickListener() { // from class: di.q3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i182) {
                    case 0:
                        org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
                        if (U != null) {
                            org.telegram.ui.ActionBar.h3 h3Var = i11;
                            h3Var.dismiss();
                            Bundle bundle = new Bundle();
                            bundle.putLong("user_id", starrefprogram.bot_id);
                            U.presentFragment(new c4(bundle, h3Var));
                            break;
                        }
                        break;
                    default:
                        org.telegram.ui.ActionBar.p2 U2 = LaunchActivity.U();
                        if (U2 != null) {
                            i11.dismiss();
                            U2.presentFragment(ProfileActivity.m4(starrefprogram.bot_id));
                            break;
                        }
                        break;
                }
            }
        });
        dVar2.setOnClickListener(new y3(dVar2, jArr, i10, starrefprogram, i11, j3, z10, context, f6Var, user));
        i11.setOnDismissListener(new bi.k1(6));
        o3 o3Var2 = new o3(jArr, i10, w9Var3, w9Var, textView, 0);
        o3Var2.run();
        if (linearLayout == null) {
        }
        final int i192 = 0;
        linearLayout2.setOnClickListener(new View.OnClickListener() { // from class: di.q3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i192) {
                    case 0:
                        org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
                        if (U != null) {
                            org.telegram.ui.ActionBar.h3 h3Var = i11;
                            h3Var.dismiss();
                            Bundle bundle = new Bundle();
                            bundle.putLong("user_id", starrefprogram.bot_id);
                            U.presentFragment(new c4(bundle, h3Var));
                            break;
                        }
                        break;
                    default:
                        org.telegram.ui.ActionBar.p2 U2 = LaunchActivity.U();
                        if (U2 != null) {
                            i11.dismiss();
                            U2.presentFragment(ProfileActivity.m4(starrefprogram.bot_id));
                            break;
                        }
                        break;
                }
            }
        });
        i11.fixNavigationBar(j6.v0(i12, f6Var2));
        i11.show();
    }

    public static org.telegram.ui.ActionBar.h3 H0(Context context, int i10, TL_payments.connectedBotStarRef connectedbotstarref, long j3, f6 f6Var) {
        ImageView.ScaleType scaleType;
        TLRPC.User user;
        LinearLayout linearLayout;
        String str;
        char c10;
        String formatPluralString;
        int i11;
        char c11;
        String formatPluralString2;
        long j10;
        int i12;
        LinearLayout linearLayout2;
        int i13;
        String formatPluralString3;
        TL_payments.connectedBotStarRef connectedbotstarref2;
        f6 f6Var2;
        int i14;
        PorterDuff.Mode mode;
        if (connectedbotstarref == null || context == null) {
            return null;
        }
        org.telegram.ui.ActionBar.h3 i15 = em.i(1, context, f6Var, false);
        TLRPC.User user2 = MessagesController.getInstance(i10).getUser(Long.valueOf(connectedbotstarref.bot_id));
        LinearLayout f7 = em.f(context, 1);
        f7.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f));
        f7.setClipChildren(false);
        f7.setClipToPadding(false);
        FrameLayout frameLayout = new FrameLayout(context);
        View view = new View(context);
        view.setBackground(j6.K(AndroidUtilities.dp(40.0f), j6.v0(connectedbotstarref.revoked ? j6.wj : j6.Oh, f6Var)));
        frameLayout.addView(view, a6.d(80, 80.0f, 49, 0.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        ImageView.ScaleType scaleType2 = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType2);
        imageView.setImageResource(connectedbotstarref.revoked ? R.drawable.msg_link_2 : R.drawable.msg_limit_links);
        imageView.setScaleX(connectedbotstarref.revoked ? 2.0f : 1.8f);
        imageView.setScaleY(connectedbotstarref.revoked ? 2.0f : 1.8f);
        frameLayout.addView(imageView, a6.d(80, 80.0f, 49, 0.0f, 0.0f, 0.0f, 0.0f));
        if (connectedbotstarref.participants > 0) {
            FrameLayout frameLayout2 = new FrameLayout(context);
            frameLayout2.setBackground(j6.b0(AndroidUtilities.dp(50.0f), j6.v0(j6.h5, f6Var)));
            frameLayout.addView(frameLayout2, a6.d(-2, -2.0f, 49, 0.0f, 66.0f, 0.0f, 0.0f));
            TextView textView = new TextView(context);
            textView.setTypeface(AndroidUtilities.bold());
            textView.setTextSize(1, 12.0f);
            textView.setBackground(j6.b0(AndroidUtilities.dp(9.5f), j6.v0(connectedbotstarref.revoked ? j6.wj : j6.uj, f6Var)));
            textView.setTextColor(-1);
            textView.setPadding(AndroidUtilities.dp(6.66f), 0, AndroidUtilities.dp(6.66f), 0);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) "s ");
            uq uqVar = new uq(R.drawable.mini_reply_user, 0);
            uqVar.setScale(0.937f, 0.937f);
            uqVar.translate(-AndroidUtilities.dp(1.33f), AndroidUtilities.dp(1.0f));
            uqVar.spaceScaleX = 0.8f;
            scaleType = scaleType2;
            spannableStringBuilder.setSpan(uqVar, 0, 1, 33);
            spannableStringBuilder.append((CharSequence) String.valueOf(connectedbotstarref.participants));
            textView.setText(spannableStringBuilder);
            textView.setGravity(17);
            frameLayout2.addView(textView, a6.d(-1, 19.0f, 119, 1.33f, 1.33f, 1.33f, 1.33f));
        } else {
            scaleType = scaleType2;
        }
        f7.addView(frameLayout, a6.t(-2, -2, 1, 0, 0, 0, 0));
        TextView textView2 = new TextView(context);
        int i16 = j6.G6;
        em.n(i16, f6Var, textView2, 1, 20.0f);
        textView2.setGravity(17);
        textView2.setText(LocaleController.getString(R.string.ChannelAffiliateProgramLinkTitle));
        textView2.setTypeface(AndroidUtilities.bold());
        f7.addView(textView2, a6.k(20.0f, 16.0f, 20.0f, 9.33f, -1, -2));
        LinearLayout linearLayout3 = new LinearLayout(context);
        linearLayout3.setOrientation(0);
        int dp = AndroidUtilities.dp(28.0f);
        int i17 = j6.a7;
        linearLayout3.setBackground(j6.b0(dp, j6.v0(i17, f6Var)));
        w9 w9Var = new w9(context);
        w9Var.setRoundRadius(AndroidUtilities.dp(14.0f));
        g9 g9Var = new g9((f6) null);
        linearLayout3.addView(w9Var, a6.n(28, 28));
        TextView textView3 = new TextView(context);
        textView3.setTextSize(1, 13.0f);
        textView3.setTextColor(j6.v0(i16, f6Var));
        textView3.setText(DialogObject.getName(i10, connectedbotstarref.bot_id));
        g9Var.r(user2);
        w9Var.e(user2, g9Var);
        linearLayout3.addView(textView3, a6.t(-2, -2, 16, 6, 0, 0, 0));
        ImageView imageView2 = new ImageView(context);
        ImageView.ScaleType scaleType3 = scaleType;
        imageView2.setScaleType(scaleType3);
        int i18 = j6.r5;
        int v02 = j6.v0(i18, f6Var);
        PorterDuff.Mode mode2 = PorterDuff.Mode.SRC_IN;
        imageView2.setColorFilter(new PorterDuffColorFilter(v02, mode2));
        imageView2.setImageResource(R.drawable.settings_arrow);
        imageView2.setScaleX(1.2f);
        imageView2.setScaleY(1.2f);
        linearLayout3.addView(imageView2, a6.t(-2, -2, 16, 5, 0, 8, 0));
        f7.addView(linearLayout3, a6.t(-2, 28, 1, 4, 0, 4, 0));
        c6.a(linearLayout3);
        TextView textView4 = new TextView(context);
        em.n(i16, f6Var, textView4, 1, 14.0f);
        textView4.setGravity(17);
        if (connectedbotstarref.revoked) {
            org.telegram.messenger.a2.n(R.string.ChannelAffiliateProgramLinkTextRevoked, textView4);
            user = user2;
            linearLayout = linearLayout3;
        } else {
            user = user2;
            if (j3 < 0) {
                int i19 = R.string.ChannelAffiliateProgramLinkTextChannel;
                String G0 = m.G0(connectedbotstarref.commission_permille);
                String userName = UserObject.getUserName(user);
                int i20 = connectedbotstarref.duration_months;
                if (i20 <= 0) {
                    formatPluralString2 = LocaleController.getString(R.string.ChannelAffiliateProgramJoinText_Lifetime);
                    linearLayout = linearLayout3;
                    c11 = 0;
                } else {
                    linearLayout = linearLayout3;
                    if (i20 < 12 || i20 % 12 != 0) {
                        c11 = 0;
                        formatPluralString2 = LocaleController.formatPluralString("ChannelAffiliateProgramJoinText_Months", i20, new Object[0]);
                    } else {
                        c11 = 0;
                        formatPluralString2 = LocaleController.formatPluralString("ChannelAffiliateProgramJoinText_Years", i20 / 12, new Object[0]);
                    }
                }
                Object[] objArr = new Object[3];
                objArr[c11] = G0;
                objArr[1] = userName;
                objArr[2] = formatPluralString2;
                em.p(i19, objArr, textView4);
            } else {
                linearLayout = linearLayout3;
                int i21 = R.string.ChannelAffiliateProgramLinkTextUser;
                String G02 = m.G0(connectedbotstarref.commission_permille);
                String userName2 = UserObject.getUserName(user);
                int i22 = connectedbotstarref.duration_months;
                if (i22 <= 0) {
                    formatPluralString = LocaleController.getString(R.string.ChannelAffiliateProgramJoinText_Lifetime);
                    str = userName2;
                    i11 = 3;
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
                    i11 = 3;
                }
                Object[] objArr2 = new Object[i11];
                objArr2[c10] = G02;
                objArr2[1] = str;
                objArr2[2] = formatPluralString;
                em.p(i21, objArr2, textView4);
            }
        }
        f7.addView(textView4, a6.k(20.0f, 19.0f, 20.0f, 18.0f, -1, -2));
        if (connectedbotstarref.revoked) {
            j10 = j3;
            i12 = i16;
            linearLayout2 = null;
        } else {
            TextView textView5 = new TextView(context);
            em.n(i16, f6Var, textView5, 1, 14.0f);
            textView5.setGravity(17);
            textView5.setText(LocaleController.getString(R.string.ChannelAffiliateProgramLinkSendTo));
            f7.addView(textView5, a6.k(20.0f, 0.0f, 20.0f, 0.0f, -1, -2));
            LinearLayout linearLayout4 = new LinearLayout(context);
            linearLayout4.setOrientation(0);
            linearLayout4.setBackground(j6.b0(AndroidUtilities.dp(28.0f), j6.v0(i17, f6Var)));
            w9 w9Var2 = new w9(context);
            w9Var2.setRoundRadius(AndroidUtilities.dp(14.0f));
            g9 g9Var2 = new g9((f6) null);
            linearLayout4.addView(w9Var2, a6.n(28, 28));
            TextView textView6 = new TextView(context);
            textView6.setTextSize(1, 13.0f);
            textView6.setTextColor(j6.v0(i16, f6Var));
            if (j3 >= 0) {
                TLRPC.User user3 = MessagesController.getInstance(i10).getUser(Long.valueOf(j3));
                g9Var2.r(user3);
                w9Var2.e(user3, g9Var2);
                textView6.setText(UserObject.getUserName(user3));
                i12 = i16;
                i14 = i18;
                mode = mode2;
                j10 = j3;
            } else {
                i12 = i16;
                i14 = i18;
                mode = mode2;
                j10 = j3;
                TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-j10));
                g9Var2.q(chat);
                w9Var2.e(chat, g9Var2);
                textView6.setText(chat == null ? "" : chat.title);
            }
            linearLayout4.addView(textView6, a6.t(-2, -2, 16, 6, 0, 0, 0));
            ImageView imageView3 = new ImageView(context);
            imageView3.setScaleType(scaleType3);
            imageView3.setColorFilter(new PorterDuffColorFilter(j6.v0(i14, f6Var), mode));
            imageView3.setImageResource(R.drawable.arrows_select);
            linearLayout4.addView(imageView3, a6.t(-2, -2, 16, 2, 0, 5, 0));
            f7.addView(linearLayout4, a6.t(-2, 28, 1, 0, 9, 0, 22));
            linearLayout2 = linearLayout4;
        }
        TextView textView7 = new TextView(context);
        textView7.setTextSize(1, 16.0f);
        textView7.setGravity(17);
        textView7.setTextColor(j6.v0(i12, f6Var));
        int dp2 = AndroidUtilities.dp(8.0f);
        int v03 = j6.v0(i17, f6Var);
        int v = j6.v(j6.v0(i17, f6Var), j6.v0(j6.i6, f6Var));
        textView7.setBackground(j6.i0(dp2, dp2, dp2, dp2, v03, v, v));
        textView7.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(14.66f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(14.66f));
        String str2 = connectedbotstarref.url;
        textView7.setText((str2 == null || !str2.startsWith("https://")) ? connectedbotstarref.url : connectedbotstarref.url.substring(8));
        f7.addView(textView7, a6.d(-1, -2.0f, 7, 0.0f, 0.0f, 0.0f, 12.0f));
        bi.d dVar = new bi.d(context, f6Var, true);
        if (connectedbotstarref.revoked) {
            dVar.g(LocaleController.getString(R.string.ChannelAffiliateProgramLinkRejoin), false, true);
        } else {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            spannableStringBuilder2.append((CharSequence) "c ");
            spannableStringBuilder2.setSpan(new uq(R.drawable.msg_copy_filled, 0), 0, 1, 33);
            spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.ChannelAffiliateProgramLinkCopy));
            dVar.g(spannableStringBuilder2, false, true);
        }
        f7.addView(dVar, a6.n(-1, 48));
        m90 m90Var = new m90(context, f6Var);
        long j11 = connectedbotstarref.participants;
        if (j11 <= 0) {
            i13 = 1;
            formatPluralString3 = LocaleController.formatString(R.string.ChannelAffiliateProgramLinkOpenedNone, UserObject.getUserName(user));
        } else {
            i13 = 1;
            formatPluralString3 = LocaleController.formatPluralString("ChannelAffiliateProgramLinkOpened", (int) j11, UserObject.getUserName(user));
        }
        m90Var.setText(formatPluralString3);
        m90Var.setGravity(17);
        m90Var.setTextSize(i13, 12.0f);
        m90Var.setTextColor(j6.v0(j6.B6, f6Var));
        m90Var.setLinkTextColor(j6.v0(j6.gc, f6Var));
        f7.addView(m90Var, a6.t(-1, -2, 49, 14, 12, 14, 2));
        i15.customView = f7;
        androidx.car.app.utils.b bVar = new androidx.car.app.utils.b(connectedbotstarref, i15, f6Var, user, 4);
        if (!connectedbotstarref.revoked) {
            textView7.setOnClickListener(new ai.u(bVar, 11));
        }
        dVar.setOnClickListener(new x3(connectedbotstarref, i10, i15, context, j10, f6Var, bVar));
        i15.setOnDismissListener(new bi.k1(6));
        if (linearLayout2 != null) {
            xh.p.g(i10).n();
            xh.p.g(i10).o();
            LinearLayout linearLayout5 = linearLayout2;
            f6Var2 = f6Var;
            connectedbotstarref2 = connectedbotstarref;
            linearLayout5.setOnClickListener(new x3(i10, i15, f6Var, linearLayout5, j3, context, connectedbotstarref));
        } else {
            connectedbotstarref2 = connectedbotstarref;
            f6Var2 = f6Var;
        }
        linearLayout.setOnClickListener(new bi.n3(5, i15, connectedbotstarref2));
        i15.fixNavigationBar(j6.v0(j6.h5, f6Var2));
        org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
        if (!AndroidUtilities.isTablet() && U != null && !AndroidUtilities.hasDialogOnTop(U)) {
            i15.makeAttached(U);
        }
        i15.show();
        return i15;
    }

    public static void x0(h4 h4Var, Context context, TLRPC.User user, TL_payments.connectedBotStarRef connectedbotstarref) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, h4Var.resourceProvider);
        String string = LocaleController.getString(R.string.LeaveAffiliateLink);
        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
        d2Var.R = string;
        d2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.LeaveAffiliateLinkAlert, UserObject.getUserName(user)));
        alertDialog$Builder.k(LocaleController.getString(R.string.LeaveAffiliateLinkButton), new cb(6, h4Var, connectedbotstarref));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        alertDialog$Builder.d(-1);
        alertDialog$Builder.o();
    }

    public static void y0(h4 h4Var, TL_payments.connectedBotStarRef connectedbotstarref) {
        org.telegram.ui.ActionBar.d2 d2Var = new org.telegram.ui.ActionBar.d2(h4Var.getParentActivity(), 3, null);
        d2Var.q(200L);
        TL_payments.editConnectedStarRefBot editconnectedstarrefbot = new TL_payments.editConnectedStarRefBot();
        editconnectedstarrefbot.link = connectedbotstarref.url;
        editconnectedstarrefbot.peer = MessagesController.getInstance(h4Var.currentAccount).getInputPeer(h4Var.P);
        editconnectedstarrefbot.revoked = true;
        h4Var.getConnectionsManager().sendRequest(editconnectedstarrefbot, new bi.o2(4, h4Var, d2Var));
    }

    public static /* synthetic */ void z0(h4 h4Var, Context context, int i10) {
        z3 z3Var = h4Var.T;
        if (z3Var == null) {
            return;
        }
        Object obj = z3Var.G(i10).G;
        if (obj instanceof TL_payments.starRefProgram) {
            G0(context, h4Var.currentAccount, (TL_payments.starRefProgram) obj, h4Var.P, h4Var.resourceProvider, false);
        } else if (obj instanceof TL_payments.connectedBotStarRef) {
            H0(context, h4Var.currentAccount, (TL_payments.connectedBotStarRef) obj, h4Var.P, h4Var.resourceProvider);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x01a5 A[LOOP:0: B:20:0x019f->B:22:0x01a5, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void F0(ArrayList arrayList, j61 j61Var) {
        SpannableString spannableString;
        if (getParentActivity() == null) {
            return;
        }
        nc ncVar = (nc) r0(getParentActivity());
        v51 v51Var = new v51(-2);
        v51Var.c = ncVar;
        arrayList.add(v51Var);
        arrayList.add(k.a(R.drawable.menu_feature_reliable, LocaleController.getString(R.string.ChannelAffiliateProgramFeature1Title), LocaleController.getString(R.string.ChannelAffiliateProgramFeature1)));
        arrayList.add(k.a(R.drawable.menu_feature_transparent, LocaleController.getString(R.string.ChannelAffiliateProgramFeature2Title), LocaleController.getString(R.string.ChannelAffiliateProgramFeature2)));
        arrayList.add(k.a(R.drawable.menu_feature_simple, LocaleController.getString(R.string.ChannelAffiliateProgramFeature3Title), LocaleController.getString(R.string.ChannelAffiliateProgramFeature3)));
        arrayList.add(v51.A(1, null));
        xh.p g10 = xh.p.g(this.currentAccount);
        long j3 = this.P;
        xh.m d = g10.d(j3);
        ArrayList arrayList2 = d.e;
        if (!arrayList2.isEmpty() || d.c > 0) {
            com.google.android.gms.internal.vision.e2.m(R.string.ChannelAffiliateProgramMyPrograms, arrayList);
            for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) arrayList2.get(i10);
                int i11 = d4.a;
                v51 J = v51.J(d4.class);
                J.G = connectedbotstarref;
                J.r = true;
                arrayList.add(J);
            }
            if (!d.d || d.g) {
                arrayList.add(v51.n(29));
                arrayList.add(v51.n(29));
                arrayList.add(v51.n(29));
            }
            arrayList.add(v51.A(2, null));
        }
        xh.n e = xh.p.g(this.currentAccount).e(j3);
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
                int i13 = f4.a;
                v51 J2 = v51.J(f4.class);
                J2.l = string;
                J2.m = spannableStringBuilder;
                arrayList.add(J2);
                for (int i14 = 0; i14 < arrayList3.size(); i14++) {
                    Object obj = arrayList3.get(i14);
                    int i15 = d4.a;
                    v51 J3 = v51.J(d4.class);
                    J3.G = obj;
                    J3.r = true;
                    arrayList.add(J3);
                }
                if (e.d || e.h) {
                    arrayList.add(v51.n(29));
                    arrayList.add(v51.n(29));
                    arrayList.add(v51.n(29));
                }
                arrayList.add(v51.A(3, null));
            }
            uq uqVar = new uq(R.drawable.arrow_more, 0);
            uqVar.useLinkPaintColor = true;
            uqVar.setScale(0.6f, 0.6f);
            spannableString.setSpan(uqVar, spannableString.length() - 1, spannableString.length(), 33);
            spannableString.setSpan(new b4(this, i12, xh.p.g(this.currentAccount).e(j3)), 0, spannableString.length(), 33);
            spannableStringBuilder.append((CharSequence) spannableString);
            int i132 = f4.a;
            v51 J22 = v51.J(f4.class);
            J22.l = string;
            J22.m = spannableStringBuilder;
            arrayList.add(J22);
            while (i14 < arrayList3.size()) {
            }
            if (e.d) {
            }
            arrayList.add(v51.n(29));
            arrayList.add(v51.n(29));
            arrayList.add(v51.n(29));
            arrayList.add(v51.A(3, null));
        }
        arrayList.add(v51.k(this.S));
    }

    @Override // org.telegram.ui.s20, org.telegram.ui.ActionBar.p2
    public final View createView(Context context) {
        this.G = false;
        this.E = AndroidUtilities.dp(238.0f);
        qn qnVar = new qn(context, 2);
        this.S = qnVar;
        qnVar.setBackgroundColor(j6.w0(null, j6.i5, false));
        super.createView(context);
        this.Q = new FrameLayout(context);
        rg.f fVar = new rg.f(context, 1, 3);
        this.R = fVar;
        fVar.setImportantForAccessibility(4);
        rg.a aVar = this.R.b;
        aVar.w = j6.fk;
        aVar.x = j6.gk;
        aVar.b();
        this.R.setStarParticlesView(this.e);
        this.Q.addView(this.R, a6.d(190, 190.0f, 17, 0.0f, 32.0f, 0.0f, 12.0f));
        m0(LocaleController.getString(R.string.ChannelAffiliateProgramTitle), AndroidUtilities.replaceTags(LocaleController.getString(R.string.ChannelAffiliateProgramText)), this.Q, null);
        this.c.setOnItemClickListener(new ai.b0(1, this, context));
        this.c.setOnItemLongClickListener(new cb(7, this, context));
        s4.j jVar = new s4.j();
        jVar.m = false;
        jVar.C = false;
        jVar.o(wr.h);
        jVar.n(350L);
        this.c.setItemAnimator(jVar);
        this.c.setOnScrollListener(new bi.a2(this, 3));
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        z3 z3Var;
        int i12 = NotificationCenter.channelConnectedBotsUpdate;
        long j3 = this.P;
        if (i10 != i12) {
            if (i10 == NotificationCenter.channelSuggestedBotsUpdate && ((Long) objArr[0]).longValue() == j3 && (z3Var = this.T) != null) {
                z3Var.N(true);
                return;
            }
            return;
        }
        if (((Long) objArr[0]).longValue() == j3) {
            z3 z3Var2 = this.T;
            if (z3Var2 != null) {
                z3Var2.N(true);
            }
            xh.p.g(this.currentAccount).d(j3).a();
        }
    }

    @Override // org.telegram.ui.s20
    public final s4.h0 n0() {
        z3 z3Var = new z3(this, this.c, getParentActivity(), this.currentAccount, this.classGuid, new ai.c0(this, 17), getResourceProvider());
        this.T = z3Var;
        return z3Var;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean onFragmentCreate() {
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.channelConnectedBotsUpdate);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.channelSuggestedBotsUpdate);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.channelConnectedBotsUpdate);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.channelSuggestedBotsUpdate);
    }

    @Override // org.telegram.ui.s20, org.telegram.ui.ActionBar.p2
    public final void onPause() {
        super.onPause();
        rg.f fVar = this.R;
        if (fVar != null) {
            fVar.setPaused(true);
            this.R.setDialogVisible(true);
        }
    }

    @Override // org.telegram.ui.s20, org.telegram.ui.ActionBar.p2
    public final void onResume() {
        super.onResume();
        rg.f fVar = this.R;
        if (fVar != null) {
            fVar.setPaused(false);
            this.R.setDialogVisible(false);
        }
    }

    @Override // org.telegram.ui.s20
    public final qg.x1 p0() {
        f fVar = new f(getParentActivity(), 1);
        fVar.b();
        return fVar;
    }
}
