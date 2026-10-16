package fi;

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
import di.ab;
import di.y6;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.sk;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.a71;
import org.telegram.ui.Components.br;
import org.telegram.ui.Components.da0;
import org.telegram.ui.Components.es;
import org.telegram.ui.Components.j61;
import org.telegram.ui.Components.k9;
import org.telegram.ui.Components.l80;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.xn;
import org.telegram.ui.Components.z9;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.v20;
import w7.b6;
import w7.z5;
import zh.p7;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final class f4 extends v20 implements NotificationCenter.NotificationCenterDelegate {
    public final long P;
    public FrameLayout Q;
    public tg.n R;
    public xn S;
    public x3 T;

    public f4(long j10) {
        this.P = j10;
        this.M = true;
        this.L = AndroidUtilities.dp(60.0f);
    }

    public static /* synthetic */ void A0(f4 f4Var, Context context, int i10) {
        x3 x3Var = f4Var.T;
        if (x3Var == null) {
            return;
        }
        Object obj = x3Var.G(i10).G;
        if (obj instanceof TL_payments.starRefProgram) {
            H0(context, f4Var.currentAccount, (TL_payments.starRefProgram) obj, f4Var.P, f4Var.resourceProvider, false);
        } else if (obj instanceof TL_payments.connectedBotStarRef) {
            I0(context, f4Var.currentAccount, (TL_payments.connectedBotStarRef) obj, f4Var.P, f4Var.resourceProvider);
        }
    }

    public static void B0(f4 f4Var, TLObject tLObject, org.telegram.ui.ActionBar.a2 a2Var) {
        long j10 = f4Var.P;
        if (tLObject instanceof TL_payments.connectedStarRefBots) {
            TL_payments.connectedStarRefBots connectedstarrefbots = (TL_payments.connectedStarRefBots) tLObject;
            zh.l d = zh.p.g(f4Var.currentAccount).d(j10);
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
            zh.n e = zh.p.g(f4Var.currentAccount).e(j10);
            e.c = 0;
            e.d = false;
            e.i = false;
            e.f = 0L;
            e.j = null;
            e.h = false;
            e.a();
            f4Var.T.N(true);
        }
        a2Var.dismiss();
    }

    public static boolean C0(f4 f4Var, Context context, View view, int i10) {
        x3 x3Var = f4Var.T;
        if (x3Var != null) {
            Object obj = x3Var.G(i10).G;
            if (obj instanceof TL_payments.connectedBotStarRef) {
                TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) obj;
                TLRPC.User user = MessagesController.getInstance(f4Var.currentAccount).getUser(Long.valueOf(connectedbotstarref.bot_id));
                l80 H = l80.H(f4Var, view);
                H.l(R.drawable.msg_bot, LocaleController.getString(R.string.ProfileBotOpenApp), new y6(29, f4Var, user), user.bot_has_main_app);
                H.l(R.drawable.msg_bot, LocaleController.getString(R.string.BotWebViewOpenBot), new q3(0, f4Var, connectedbotstarref), !user.bot_has_main_app);
                H.c(R.drawable.msg_link2, LocaleController.getString(R.string.CopyLink), new a3.l0(f4Var, connectedbotstarref, user, 27), false);
                H.m(!connectedbotstarref.revoked, R.drawable.msg_leave, LocaleController.getString(R.string.LeaveAffiliateLinkButton), true, new androidx.car.app.utils.b(f4Var, context, user, connectedbotstarref, 9));
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
    public static void H0(Context context, int i10, final TL_payments.starRefProgram starrefprogram, long j10, c6 c6Var, boolean z10) {
        long[] jArr;
        float f7;
        String str;
        String str2;
        ?? r14;
        String formatPluralString;
        LinearLayout linearLayout;
        z9 z9Var;
        TextView textView;
        c6 c6Var2;
        if (starrefprogram == null || context == null) {
            return;
        }
        final org.telegram.ui.ActionBar.e3 i11 = sk.i(1, context, c6Var, false);
        long[] jArr2 = {j10};
        TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(starrefprogram.bot_id));
        LinearLayout e = sk.e(context, 1);
        e.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f));
        e.setClipChildren(false);
        e.setClipToPadding(false);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setClipToPadding(false);
        frameLayout.setClipChildren(false);
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setClipToPadding(false);
        frameLayout2.setClipChildren(false);
        frameLayout.addView(frameLayout2, z5.a(60.0f, 0.0f, 0.0f, 0.0f, 0.0f, 60, 19));
        z9 z9Var2 = new z9(context);
        z9Var2.setRoundRadius(AndroidUtilities.dp(30.0f));
        k9 k9Var = new k9((c6) null);
        k9Var.r(user);
        z9Var2.e(user, k9Var);
        b6.a(z9Var2);
        frameLayout2.addView(z9Var2, z5.e(60, 60, 119));
        if (starrefprogram.daily_revenue_per_user.positive()) {
            FrameLayout frameLayout3 = new FrameLayout(context);
            frameLayout3.setBackground(g6.c0(AndroidUtilities.dp(10.0f), g6.w0(g6.h5, c6Var)));
            frameLayout3.setPadding(AndroidUtilities.dp(1.33f), AndroidUtilities.dp(1.33f), AndroidUtilities.dp(1.33f), AndroidUtilities.dp(1.33f));
            TextView textView2 = new TextView(context);
            textView2.setBackground(g6.c0(AndroidUtilities.dp(10.0f), g6.w0(g6.uj, c6Var)));
            textView2.setTypeface(AndroidUtilities.bold());
            textView2.setTextSize(1, 10.0f);
            f7 = 10.0f;
            textView2.setPadding(AndroidUtilities.dp(5.33f), 0, AndroidUtilities.dp(5.33f), 0);
            textView2.setTextColor(-1);
            textView2.setGravity(17);
            StringBuilder sb2 = new StringBuilder("⭐️ ");
            jArr = jArr2;
            sb2.append((Object) p7.L0(starrefprogram.daily_revenue_per_user, 1.0f, ','));
            textView2.setText(p7.S0(sb2.toString(), 0.75f, new br[1]));
            frameLayout3.addView(textView2, z5.d(15.66f, -2));
            frameLayout2.addView(frameLayout3, z5.a(-2.0f, 0.0f, 0.0f, 0.0f, -4.0f, -2, 81));
        } else {
            jArr = jArr2;
            f7 = 10.0f;
        }
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(R.drawable.msg_arrow_avatar);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setTranslationX(-AndroidUtilities.dp(2.0825f));
        int w02 = g6.w0(g6.E6, c6Var);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView.setColorFilter(new PorterDuffColorFilter(w02, mode));
        frameLayout.addView(imageView, z5.a(60.0f, 60.0f, 0.0f, 60.0f, 0.0f, 36, 17));
        FrameLayout frameLayout4 = new FrameLayout(context);
        frameLayout4.setClipToPadding(false);
        frameLayout4.setClipChildren(false);
        frameLayout.addView(frameLayout4, z5.a(60.0f, 0.0f, 0.0f, 5.66f, 0.0f, 60, 21));
        z9 z9Var3 = new z9(context);
        z9Var3.setRoundRadius(AndroidUtilities.dp(30.0f));
        frameLayout4.addView(z9Var3, z5.e(60, 60, 119));
        FrameLayout frameLayout5 = new FrameLayout(context);
        int dp = AndroidUtilities.dp(f7);
        int i12 = g6.h5;
        frameLayout5.setBackground(g6.c0(dp, g6.w0(i12, c6Var)));
        frameLayout5.setPadding(AndroidUtilities.dp(1.33f), AndroidUtilities.dp(1.33f), AndroidUtilities.dp(1.33f), AndroidUtilities.dp(1.33f));
        TextView textView3 = new TextView(context);
        textView3.setBackground(g6.c0(AndroidUtilities.dp(f7), g6.w0(g6.Oh, c6Var)));
        textView3.setTypeface(AndroidUtilities.bold());
        textView3.setTextSize(1, f7);
        textView3.setPadding(AndroidUtilities.dp(5.33f), 0, AndroidUtilities.dp(5.33f), 0);
        textView3.setTextColor(-1);
        textView3.setGravity(17);
        SpannableString spannableString = new SpannableString("s " + ((Object) l.H0(starrefprogram.commission_permille)));
        br brVar = new br(R.drawable.msg_link_1, 0);
        brVar.setScale(0.65f, 0.65f);
        brVar.spaceScaleX = 0.7f;
        brVar.translate(AndroidUtilities.dp(-2.0f), AndroidUtilities.dp(0.0f));
        spannableString.setSpan(brVar, 0, 1, 33);
        textView3.setText(spannableString);
        frameLayout5.addView(textView3, z5.d(15.66f, -2));
        frameLayout4.addView(frameLayout5, z5.a(-2.0f, 0.0f, 0.0f, 0.0f, -4.0f, -2, 81));
        e.addView(frameLayout, z5.t(-2, -2, 1, 0, 0, 0, 0));
        TextView textView4 = new TextView(context);
        int i13 = g6.G6;
        sk.o(i13, c6Var, textView4, 1, 20.0f);
        textView4.setGravity(17);
        textView4.setText(LocaleController.getString(R.string.ChannelAffiliateProgramJoinTitle));
        textView4.setTypeface(AndroidUtilities.bold());
        e.addView(textView4, z5.k(0.0f, 21.0f, 0.0f, 9.0f, -1, -2));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        int dp2 = AndroidUtilities.dp(28.0f);
        int i14 = g6.a7;
        linearLayout2.setBackground(g6.c0(dp2, g6.w0(i14, c6Var)));
        TextView textView5 = new TextView(context);
        textView5.setTextSize(1, 13.0f);
        textView5.setTextColor(g6.w0(i13, c6Var));
        textView5.setText(LocaleController.formatString(R.string.ChannelAffiliateProgramJoinViewBot, DialogObject.getName(i10, starrefprogram.bot_id)));
        linearLayout2.addView(textView5, z5.t(-2, -2, 16, 11, 0, 0, 0));
        ImageView imageView2 = new ImageView(context);
        imageView2.setScaleType(scaleType);
        int i15 = g6.r5;
        imageView2.setColorFilter(new PorterDuffColorFilter(g6.w0(i15, c6Var), mode));
        imageView2.setImageResource(R.drawable.settings_arrow);
        imageView2.setScaleX(1.2f);
        imageView2.setScaleY(1.2f);
        linearLayout2.addView(imageView2, z5.t(-2, -2, 16, 5, 0, 8, 0));
        e.addView(linearLayout2, z5.t(-2, 28, 1, 4, 0, 4, 0));
        b6.a(linearLayout2);
        TextView textView6 = new TextView(context);
        sk.o(i13, c6Var, textView6, 1, 14.0f);
        textView6.setGravity(17);
        NotificationCenter.listenEmojiLoading(textView6);
        SpannableString spannableString2 = new SpannableString(p7.L0(starrefprogram.daily_revenue_per_user, 0.95f, ','));
        spannableString2.setSpan(new j61(AndroidUtilities.bold()), 0, spannableString2.length(), 33);
        textView6.setText(p7.Y0(false, LocaleController.formatSpannable(R.string.ChannelAffiliateProgramJoinRevenue, spannableString2), 0.725f, null));
        TextView i16 = com.google.android.gms.internal.play_billing.k3.i(e, textView6, z5.k(0.0f, 10.0f, 0.0f, 20.0f, -1, -2), context);
        sk.o(i13, c6Var, i16, 1, 14.0f);
        i16.setGravity(17);
        NotificationCenter.listenEmojiLoading(i16);
        int i17 = R.string.ChannelAffiliateProgramJoinText;
        String userName = UserObject.getUserName(user);
        String H0 = l.H0(starrefprogram.commission_permille);
        int i18 = starrefprogram.duration_months;
        if (i18 <= 0) {
            formatPluralString = LocaleController.getString(R.string.ChannelAffiliateProgramJoinText_Lifetime);
            str = userName;
        } else {
            if (i18 < 12 || i18 % 12 != 0) {
                str = userName;
                str2 = H0;
                r14 = 0;
                formatPluralString = LocaleController.formatPluralString("ChannelAffiliateProgramJoinText_Months", i18, new Object[0]);
                Object[] objArr = new Object[3];
                objArr[r14] = str;
                objArr[1] = str2;
                objArr[2] = formatPluralString;
                i16.setText(Emoji.replaceEmoji(AndroidUtilities.replaceTags(LocaleController.formatString(i17, objArr)), i16.getPaint().getFontMetricsInt(), r14));
                e.addView(i16, z5.k(0.0f, 0.0f, 0.0f, 22.0f, -1, -2));
                if (j10 < 0) {
                    TextView textView7 = new TextView(context);
                    sk.o(i13, c6Var, textView7, 1, 14.0f);
                    textView7.setGravity(17);
                    textView7.setText(LocaleController.getString(R.string.ChannelAffiliateProgramLinkSendTo));
                    e.addView(textView7, z5.k(20.0f, 0.0f, 20.0f, 0.0f, -1, -2));
                    LinearLayout linearLayout3 = new LinearLayout(context);
                    linearLayout3.setOrientation(0);
                    linearLayout3.setBackground(g6.c0(AndroidUtilities.dp(28.0f), g6.w0(i14, c6Var)));
                    int dp3 = AndroidUtilities.dp(28.0f);
                    int w03 = g6.w0(i14, c6Var);
                    int v = g6.v(g6.w0(i14, c6Var), g6.w0(g6.i6, c6Var));
                    linearLayout3.setBackground(g6.j0(dp3, dp3, dp3, dp3, w03, v, v));
                    z9 z9Var4 = new z9(context);
                    z9Var4.setRoundRadius(AndroidUtilities.dp(14.0f));
                    linearLayout3.addView(z9Var4, z5.n(28, 28));
                    TextView textView8 = new TextView(context);
                    textView8.setTextSize(1, 13.0f);
                    textView8.setTextColor(g6.w0(i13, c6Var));
                    linearLayout3.addView(textView8, z5.t(-2, -2, 16, 6, 0, 0, 0));
                    ImageView imageView3 = new ImageView(context);
                    imageView3.setScaleType(scaleType);
                    imageView3.setColorFilter(new PorterDuffColorFilter(g6.w0(i15, c6Var), mode));
                    imageView3.setImageResource(R.drawable.arrows_select);
                    linearLayout3.addView(imageView3, z5.t(-2, -2, 16, 2, 0, 5, 0));
                    e.addView(linearLayout3, z5.t(-2, 28, 1, 0, 11, 0, 20));
                    textView = textView8;
                    linearLayout = linearLayout3;
                    z9Var = z9Var4;
                } else {
                    linearLayout = null;
                    z9Var = null;
                    textView = null;
                }
                di.d dVar = new di.d(context, c6Var, true);
                dVar.g(LocaleController.getString(R.string.ChannelAffiliateProgramJoinButton), false, true);
                e.addView(dVar, z5.n(-1, 48));
                da0 da0Var = new da0(context, c6Var);
                da0Var.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.ChannelAffiliateProgramJoinButtonInfo), new ei.a(context, 1)));
                da0Var.setGravity(17);
                da0Var.setTextSize(1, 12.0f);
                da0Var.setTextColor(g6.w0(g6.B6, c6Var));
                da0Var.setLinkTextColor(g6.w0(g6.gc, c6Var));
                e.addView(da0Var, z5.t(-1, -2, 49, 14, 14, 14, 6));
                i11.customView = e;
                final int i19 = 1;
                z9Var2.setOnClickListener(new View.OnClickListener() { // from class: fi.n3
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i19) {
                            case 0:
                                org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
                                if (U != null) {
                                    org.telegram.ui.ActionBar.e3 e3Var = i11;
                                    e3Var.dismiss();
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("user_id", starrefprogram.bot_id);
                                    U.presentFragment(new a4(bundle, e3Var));
                                    break;
                                }
                                break;
                            default:
                                org.telegram.ui.ActionBar.m2 U2 = LaunchActivity.U();
                                if (U2 != null) {
                                    i11.dismiss();
                                    U2.presentFragment(ProfileActivity.m4(starrefprogram.bot_id));
                                    break;
                                }
                                break;
                        }
                    }
                });
                dVar.setOnClickListener(new w3(dVar, jArr, i10, starrefprogram, i11, j10, z10, context, c6Var, user));
                i11.setOnDismissListener(new di.e1(6));
                l3 l3Var = new l3(jArr, i10, z9Var3, z9Var, textView, 0);
                l3Var.run();
                if (linearLayout == null) {
                    zh.p.g(i10).n();
                    zh.p.g(i10).o();
                    LinearLayout linearLayout4 = linearLayout;
                    c6Var2 = c6Var;
                    linearLayout4.setOnClickListener(new m3(i10, i11, c6Var2, linearLayout4, jArr, l3Var));
                } else {
                    c6Var2 = c6Var;
                }
                final int i20 = 0;
                linearLayout2.setOnClickListener(new View.OnClickListener() { // from class: fi.n3
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i20) {
                            case 0:
                                org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
                                if (U != null) {
                                    org.telegram.ui.ActionBar.e3 e3Var = i11;
                                    e3Var.dismiss();
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("user_id", starrefprogram.bot_id);
                                    U.presentFragment(new a4(bundle, e3Var));
                                    break;
                                }
                                break;
                            default:
                                org.telegram.ui.ActionBar.m2 U2 = LaunchActivity.U();
                                if (U2 != null) {
                                    i11.dismiss();
                                    U2.presentFragment(ProfileActivity.m4(starrefprogram.bot_id));
                                    break;
                                }
                                break;
                        }
                    }
                });
                i11.fixNavigationBar(g6.w0(i12, c6Var2));
                i11.show();
            }
            str = userName;
            formatPluralString = LocaleController.formatPluralString("ChannelAffiliateProgramJoinText_Years", i18 / 12, new Object[0]);
        }
        str2 = H0;
        r14 = 0;
        Object[] objArr2 = new Object[3];
        objArr2[r14] = str;
        objArr2[1] = str2;
        objArr2[2] = formatPluralString;
        i16.setText(Emoji.replaceEmoji(AndroidUtilities.replaceTags(LocaleController.formatString(i17, objArr2)), i16.getPaint().getFontMetricsInt(), r14));
        e.addView(i16, z5.k(0.0f, 0.0f, 0.0f, 22.0f, -1, -2));
        if (j10 < 0) {
        }
        di.d dVar2 = new di.d(context, c6Var, true);
        dVar2.g(LocaleController.getString(R.string.ChannelAffiliateProgramJoinButton), false, true);
        e.addView(dVar2, z5.n(-1, 48));
        da0 da0Var2 = new da0(context, c6Var);
        da0Var2.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.ChannelAffiliateProgramJoinButtonInfo), new ei.a(context, 1)));
        da0Var2.setGravity(17);
        da0Var2.setTextSize(1, 12.0f);
        da0Var2.setTextColor(g6.w0(g6.B6, c6Var));
        da0Var2.setLinkTextColor(g6.w0(g6.gc, c6Var));
        e.addView(da0Var2, z5.t(-1, -2, 49, 14, 14, 14, 6));
        i11.customView = e;
        final int i192 = 1;
        z9Var2.setOnClickListener(new View.OnClickListener() { // from class: fi.n3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i192) {
                    case 0:
                        org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
                        if (U != null) {
                            org.telegram.ui.ActionBar.e3 e3Var = i11;
                            e3Var.dismiss();
                            Bundle bundle = new Bundle();
                            bundle.putLong("user_id", starrefprogram.bot_id);
                            U.presentFragment(new a4(bundle, e3Var));
                            break;
                        }
                        break;
                    default:
                        org.telegram.ui.ActionBar.m2 U2 = LaunchActivity.U();
                        if (U2 != null) {
                            i11.dismiss();
                            U2.presentFragment(ProfileActivity.m4(starrefprogram.bot_id));
                            break;
                        }
                        break;
                }
            }
        });
        dVar2.setOnClickListener(new w3(dVar2, jArr, i10, starrefprogram, i11, j10, z10, context, c6Var, user));
        i11.setOnDismissListener(new di.e1(6));
        l3 l3Var2 = new l3(jArr, i10, z9Var3, z9Var, textView, 0);
        l3Var2.run();
        if (linearLayout == null) {
        }
        final int i202 = 0;
        linearLayout2.setOnClickListener(new View.OnClickListener() { // from class: fi.n3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i202) {
                    case 0:
                        org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
                        if (U != null) {
                            org.telegram.ui.ActionBar.e3 e3Var = i11;
                            e3Var.dismiss();
                            Bundle bundle = new Bundle();
                            bundle.putLong("user_id", starrefprogram.bot_id);
                            U.presentFragment(new a4(bundle, e3Var));
                            break;
                        }
                        break;
                    default:
                        org.telegram.ui.ActionBar.m2 U2 = LaunchActivity.U();
                        if (U2 != null) {
                            i11.dismiss();
                            U2.presentFragment(ProfileActivity.m4(starrefprogram.bot_id));
                            break;
                        }
                        break;
                }
            }
        });
        i11.fixNavigationBar(g6.w0(i12, c6Var2));
        i11.show();
    }

    public static org.telegram.ui.ActionBar.e3 I0(Context context, int i10, TL_payments.connectedBotStarRef connectedbotstarref, long j10, c6 c6Var) {
        ImageView.ScaleType scaleType;
        TLRPC.User user;
        LinearLayout linearLayout;
        String str;
        char c10;
        String formatPluralString;
        int i11;
        char c11;
        String formatPluralString2;
        long j11;
        int i12;
        LinearLayout linearLayout2;
        int i13;
        String formatPluralString3;
        TL_payments.connectedBotStarRef connectedbotstarref2;
        c6 c6Var2;
        int i14;
        PorterDuff.Mode mode;
        if (connectedbotstarref == null || context == null) {
            return null;
        }
        org.telegram.ui.ActionBar.e3 i15 = sk.i(1, context, c6Var, false);
        TLRPC.User user2 = MessagesController.getInstance(i10).getUser(Long.valueOf(connectedbotstarref.bot_id));
        LinearLayout e = sk.e(context, 1);
        e.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f));
        e.setClipChildren(false);
        e.setClipToPadding(false);
        FrameLayout frameLayout = new FrameLayout(context);
        View view = new View(context);
        view.setBackground(g6.K(AndroidUtilities.dp(40.0f), g6.w0(connectedbotstarref.revoked ? g6.wj : g6.Oh, c6Var)));
        frameLayout.addView(view, z5.a(80.0f, 0.0f, 0.0f, 0.0f, 0.0f, 80, 49));
        ImageView imageView = new ImageView(context);
        ImageView.ScaleType scaleType2 = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType2);
        imageView.setImageResource(connectedbotstarref.revoked ? R.drawable.msg_link_2 : R.drawable.msg_limit_links);
        imageView.setScaleX(connectedbotstarref.revoked ? 2.0f : 1.8f);
        imageView.setScaleY(connectedbotstarref.revoked ? 2.0f : 1.8f);
        frameLayout.addView(imageView, z5.a(80.0f, 0.0f, 0.0f, 0.0f, 0.0f, 80, 49));
        if (connectedbotstarref.participants > 0) {
            FrameLayout frameLayout2 = new FrameLayout(context);
            frameLayout2.setBackground(g6.c0(AndroidUtilities.dp(50.0f), g6.w0(g6.h5, c6Var)));
            frameLayout.addView(frameLayout2, z5.a(-2.0f, 0.0f, 66.0f, 0.0f, 0.0f, -2, 49));
            TextView textView = new TextView(context);
            textView.setTypeface(AndroidUtilities.bold());
            textView.setTextSize(1, 12.0f);
            textView.setBackground(g6.c0(AndroidUtilities.dp(9.5f), g6.w0(connectedbotstarref.revoked ? g6.wj : g6.uj, c6Var)));
            textView.setTextColor(-1);
            textView.setPadding(AndroidUtilities.dp(6.66f), 0, AndroidUtilities.dp(6.66f), 0);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) "s ");
            br brVar = new br(R.drawable.mini_reply_user, 0);
            brVar.setScale(0.937f, 0.937f);
            brVar.translate(-AndroidUtilities.dp(1.33f), AndroidUtilities.dp(1.0f));
            brVar.spaceScaleX = 0.8f;
            scaleType = scaleType2;
            spannableStringBuilder.setSpan(brVar, 0, 1, 33);
            spannableStringBuilder.append((CharSequence) String.valueOf(connectedbotstarref.participants));
            textView.setText(spannableStringBuilder);
            textView.setGravity(17);
            frameLayout2.addView(textView, z5.a(19.0f, 1.33f, 1.33f, 1.33f, 1.33f, -1, 119));
        } else {
            scaleType = scaleType2;
        }
        e.addView(frameLayout, z5.t(-2, -2, 1, 0, 0, 0, 0));
        TextView textView2 = new TextView(context);
        int i16 = g6.G6;
        sk.o(i16, c6Var, textView2, 1, 20.0f);
        textView2.setGravity(17);
        textView2.setText(LocaleController.getString(R.string.ChannelAffiliateProgramLinkTitle));
        textView2.setTypeface(AndroidUtilities.bold());
        e.addView(textView2, z5.k(20.0f, 16.0f, 20.0f, 9.33f, -1, -2));
        LinearLayout linearLayout3 = new LinearLayout(context);
        linearLayout3.setOrientation(0);
        int dp = AndroidUtilities.dp(28.0f);
        int i17 = g6.a7;
        linearLayout3.setBackground(g6.c0(dp, g6.w0(i17, c6Var)));
        z9 z9Var = new z9(context);
        z9Var.setRoundRadius(AndroidUtilities.dp(14.0f));
        k9 k9Var = new k9((c6) null);
        linearLayout3.addView(z9Var, z5.n(28, 28));
        TextView textView3 = new TextView(context);
        textView3.setTextSize(1, 13.0f);
        textView3.setTextColor(g6.w0(i16, c6Var));
        textView3.setText(DialogObject.getName(i10, connectedbotstarref.bot_id));
        k9Var.r(user2);
        z9Var.e(user2, k9Var);
        linearLayout3.addView(textView3, z5.t(-2, -2, 16, 6, 0, 0, 0));
        ImageView imageView2 = new ImageView(context);
        ImageView.ScaleType scaleType3 = scaleType;
        imageView2.setScaleType(scaleType3);
        int i18 = g6.r5;
        int w02 = g6.w0(i18, c6Var);
        PorterDuff.Mode mode2 = PorterDuff.Mode.SRC_IN;
        imageView2.setColorFilter(new PorterDuffColorFilter(w02, mode2));
        imageView2.setImageResource(R.drawable.settings_arrow);
        imageView2.setScaleX(1.2f);
        imageView2.setScaleY(1.2f);
        linearLayout3.addView(imageView2, z5.t(-2, -2, 16, 5, 0, 8, 0));
        e.addView(linearLayout3, z5.t(-2, 28, 1, 4, 0, 4, 0));
        b6.a(linearLayout3);
        TextView textView4 = new TextView(context);
        sk.o(i16, c6Var, textView4, 1, 14.0f);
        textView4.setGravity(17);
        if (connectedbotstarref.revoked) {
            org.telegram.messenger.g0.n(R.string.ChannelAffiliateProgramLinkTextRevoked, textView4);
            user = user2;
            linearLayout = linearLayout3;
        } else {
            user = user2;
            if (j10 < 0) {
                int i19 = R.string.ChannelAffiliateProgramLinkTextChannel;
                String H0 = l.H0(connectedbotstarref.commission_permille);
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
                objArr[c11] = H0;
                objArr[1] = userName;
                objArr[2] = formatPluralString2;
                sk.r(i19, objArr, textView4);
            } else {
                linearLayout = linearLayout3;
                int i21 = R.string.ChannelAffiliateProgramLinkTextUser;
                String H02 = l.H0(connectedbotstarref.commission_permille);
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
                objArr2[c10] = H02;
                objArr2[1] = str;
                objArr2[2] = formatPluralString;
                sk.r(i21, objArr2, textView4);
            }
        }
        e.addView(textView4, z5.k(20.0f, 19.0f, 20.0f, 18.0f, -1, -2));
        if (connectedbotstarref.revoked) {
            j11 = j10;
            i12 = i16;
            linearLayout2 = null;
        } else {
            TextView textView5 = new TextView(context);
            sk.o(i16, c6Var, textView5, 1, 14.0f);
            textView5.setGravity(17);
            textView5.setText(LocaleController.getString(R.string.ChannelAffiliateProgramLinkSendTo));
            e.addView(textView5, z5.k(20.0f, 0.0f, 20.0f, 0.0f, -1, -2));
            LinearLayout linearLayout4 = new LinearLayout(context);
            linearLayout4.setOrientation(0);
            linearLayout4.setBackground(g6.c0(AndroidUtilities.dp(28.0f), g6.w0(i17, c6Var)));
            z9 z9Var2 = new z9(context);
            z9Var2.setRoundRadius(AndroidUtilities.dp(14.0f));
            k9 k9Var2 = new k9((c6) null);
            linearLayout4.addView(z9Var2, z5.n(28, 28));
            TextView textView6 = new TextView(context);
            textView6.setTextSize(1, 13.0f);
            textView6.setTextColor(g6.w0(i16, c6Var));
            if (j10 >= 0) {
                TLRPC.User user3 = MessagesController.getInstance(i10).getUser(Long.valueOf(j10));
                k9Var2.r(user3);
                z9Var2.e(user3, k9Var2);
                textView6.setText(UserObject.getUserName(user3));
                i12 = i16;
                i14 = i18;
                mode = mode2;
                j11 = j10;
            } else {
                i12 = i16;
                i14 = i18;
                mode = mode2;
                j11 = j10;
                TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-j11));
                k9Var2.q(chat);
                z9Var2.e(chat, k9Var2);
                textView6.setText(chat == null ? "" : chat.title);
            }
            linearLayout4.addView(textView6, z5.t(-2, -2, 16, 6, 0, 0, 0));
            ImageView imageView3 = new ImageView(context);
            imageView3.setScaleType(scaleType3);
            imageView3.setColorFilter(new PorterDuffColorFilter(g6.w0(i14, c6Var), mode));
            imageView3.setImageResource(R.drawable.arrows_select);
            linearLayout4.addView(imageView3, z5.t(-2, -2, 16, 2, 0, 5, 0));
            e.addView(linearLayout4, z5.t(-2, 28, 1, 0, 9, 0, 22));
            linearLayout2 = linearLayout4;
        }
        TextView textView7 = new TextView(context);
        textView7.setTextSize(1, 16.0f);
        textView7.setGravity(17);
        textView7.setTextColor(g6.w0(i12, c6Var));
        int dp2 = AndroidUtilities.dp(8.0f);
        int w03 = g6.w0(i17, c6Var);
        int v = g6.v(g6.w0(i17, c6Var), g6.w0(g6.i6, c6Var));
        textView7.setBackground(g6.j0(dp2, dp2, dp2, dp2, w03, v, v));
        textView7.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(14.66f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(14.66f));
        String str2 = connectedbotstarref.url;
        textView7.setText((str2 == null || !str2.startsWith("https://")) ? connectedbotstarref.url : connectedbotstarref.url.substring(8));
        e.addView(textView7, z5.a(-2.0f, 0.0f, 0.0f, 0.0f, 12.0f, -1, 7));
        di.d dVar = new di.d(context, c6Var, true);
        if (connectedbotstarref.revoked) {
            dVar.g(LocaleController.getString(R.string.ChannelAffiliateProgramLinkRejoin), false, true);
        } else {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            spannableStringBuilder2.append((CharSequence) "c ");
            spannableStringBuilder2.setSpan(new br(R.drawable.msg_copy_filled, 0), 0, 1, 33);
            spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.ChannelAffiliateProgramLinkCopy));
            dVar.g(spannableStringBuilder2, false, true);
        }
        e.addView(dVar, z5.n(-1, 48));
        da0 da0Var = new da0(context, c6Var);
        long j12 = connectedbotstarref.participants;
        if (j12 <= 0) {
            i13 = 1;
            formatPluralString3 = LocaleController.formatString(R.string.ChannelAffiliateProgramLinkOpenedNone, UserObject.getUserName(user));
        } else {
            i13 = 1;
            formatPluralString3 = LocaleController.formatPluralString("ChannelAffiliateProgramLinkOpened", (int) j12, UserObject.getUserName(user));
        }
        da0Var.setText(formatPluralString3);
        da0Var.setGravity(17);
        da0Var.setTextSize(i13, 12.0f);
        da0Var.setTextColor(g6.w0(g6.B6, c6Var));
        da0Var.setLinkTextColor(g6.w0(g6.gc, c6Var));
        e.addView(da0Var, z5.t(-1, -2, 49, 14, 12, 14, 2));
        i15.customView = e;
        androidx.car.app.utils.b bVar = new androidx.car.app.utils.b(connectedbotstarref, i15, c6Var, user, 8);
        if (!connectedbotstarref.revoked) {
            textView7.setOnClickListener(new ah.g0(bVar, 17));
        }
        dVar.setOnClickListener(new v3(connectedbotstarref, i10, i15, context, j11, c6Var, bVar));
        i15.setOnDismissListener(new di.e1(6));
        if (linearLayout2 != null) {
            zh.p.g(i10).n();
            zh.p.g(i10).o();
            LinearLayout linearLayout5 = linearLayout2;
            c6Var2 = c6Var;
            connectedbotstarref2 = connectedbotstarref;
            linearLayout5.setOnClickListener(new v3(i10, i15, c6Var, linearLayout5, j10, context, connectedbotstarref));
        } else {
            connectedbotstarref2 = connectedbotstarref;
            c6Var2 = c6Var;
        }
        linearLayout.setOnClickListener(new bi.u1(9, i15, connectedbotstarref2));
        i15.fixNavigationBar(g6.w0(g6.h5, c6Var2));
        org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
        if (!AndroidUtilities.isTablet() && U != null && !AndroidUtilities.hasDialogOnTop(U)) {
            i15.makeAttached(U);
        }
        i15.show();
        return i15;
    }

    public static void y0(f4 f4Var, Context context, TLRPC.User user, TL_payments.connectedBotStarRef connectedbotstarref) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, f4Var.resourceProvider);
        String string = LocaleController.getString(R.string.LeaveAffiliateLink);
        org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.a;
        a2Var.R = string;
        a2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.LeaveAffiliateLinkAlert, UserObject.getUserName(user)));
        alertDialog$Builder.k(LocaleController.getString(R.string.LeaveAffiliateLinkButton), new ah.h0(11, f4Var, connectedbotstarref));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        alertDialog$Builder.d(-1);
        alertDialog$Builder.o();
    }

    public static void z0(f4 f4Var, TL_payments.connectedBotStarRef connectedbotstarref) {
        org.telegram.ui.ActionBar.a2 a2Var = new org.telegram.ui.ActionBar.a2(f4Var.getParentActivity(), 3, null);
        a2Var.q(200L);
        TL_payments.editConnectedStarRefBot editconnectedstarrefbot = new TL_payments.editConnectedStarRefBot();
        editconnectedstarrefbot.link = connectedbotstarref.url;
        editconnectedstarrefbot.peer = MessagesController.getInstance(f4Var.currentAccount).getInputPeer(f4Var.P);
        editconnectedstarrefbot.revoked = true;
        f4Var.getConnectionsManager().sendRequest(editconnectedstarrefbot, new bi.m1(9, f4Var, a2Var));
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x01a5 A[LOOP:0: B:20:0x019f->B:22:0x01a5, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void G0(ArrayList arrayList, a71 a71Var) {
        SpannableString spannableString;
        if (getParentActivity() == null) {
            return;
        }
        ab abVar = (ab) r0(getParentActivity());
        m61 m61Var = new m61(-2);
        m61Var.c = abVar;
        arrayList.add(m61Var);
        arrayList.add(j.a(R.drawable.menu_feature_reliable, LocaleController.getString(R.string.ChannelAffiliateProgramFeature1Title), LocaleController.getString(R.string.ChannelAffiliateProgramFeature1)));
        arrayList.add(j.a(R.drawable.menu_feature_transparent, LocaleController.getString(R.string.ChannelAffiliateProgramFeature2Title), LocaleController.getString(R.string.ChannelAffiliateProgramFeature2)));
        arrayList.add(j.a(R.drawable.menu_feature_simple, LocaleController.getString(R.string.ChannelAffiliateProgramFeature3Title), LocaleController.getString(R.string.ChannelAffiliateProgramFeature3)));
        arrayList.add(m61.A(1, null));
        zh.p g10 = zh.p.g(this.currentAccount);
        long j10 = this.P;
        zh.l d = g10.d(j10);
        ArrayList arrayList2 = d.e;
        if (!arrayList2.isEmpty() || d.c > 0) {
            i2.d.p(R.string.ChannelAffiliateProgramMyPrograms, arrayList);
            for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) arrayList2.get(i10);
                int i11 = b4.a;
                m61 J = m61.J(b4.class);
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
        zh.n e = zh.p.g(this.currentAccount).e(j10);
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
                int i13 = d4.a;
                m61 J2 = m61.J(d4.class);
                J2.l = string;
                J2.m = spannableStringBuilder;
                arrayList.add(J2);
                for (int i14 = 0; i14 < arrayList3.size(); i14++) {
                    Object obj = arrayList3.get(i14);
                    int i15 = b4.a;
                    m61 J3 = m61.J(b4.class);
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
            br brVar = new br(R.drawable.arrow_more, 0);
            brVar.useLinkPaintColor = true;
            brVar.setScale(0.6f, 0.6f);
            spannableString.setSpan(brVar, spannableString.length() - 1, spannableString.length(), 33);
            spannableString.setSpan(new z3(this, i12, zh.p.g(this.currentAccount).e(j10)), 0, spannableString.length(), 33);
            spannableStringBuilder.append((CharSequence) spannableString);
            int i132 = d4.a;
            m61 J22 = m61.J(d4.class);
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
        arrayList.add(m61.k(this.S));
    }

    @Override // org.telegram.ui.v20, org.telegram.ui.ActionBar.m2
    public final View createView(Context context) {
        this.G = false;
        this.E = AndroidUtilities.dp(238.0f);
        xn xnVar = new xn(context, 3);
        this.S = xnVar;
        xnVar.setBackgroundColor(g6.x0(null, g6.i5, false));
        super.createView(context);
        this.Q = new FrameLayout(context);
        tg.n nVar = new tg.n(context, 1, 3);
        this.R = nVar;
        nVar.setImportantForAccessibility(4);
        tg.g gVar = this.R.b;
        gVar.z = g6.fk;
        gVar.A = g6.gk;
        gVar.b();
        this.R.setStarParticlesView(this.e);
        this.Q.addView(this.R, z5.a(190.0f, 0.0f, 32.0f, 0.0f, 12.0f, 190, 17));
        m0(LocaleController.getString(R.string.ChannelAffiliateProgramTitle), AndroidUtilities.replaceTags(LocaleController.getString(R.string.ChannelAffiliateProgramText)), this.Q, null);
        this.c.setOnItemClickListener(new bi.z5(2, this, context));
        this.c.setOnItemLongClickListener(new ah.h0(12, this, context));
        s4.k kVar = new s4.k();
        kVar.m = false;
        kVar.C = false;
        kVar.o(es.h);
        kVar.n(350L);
        this.c.setItemAnimator(kVar);
        this.c.setOnScrollListener(new ah.d0(this, 5));
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        x3 x3Var;
        int i12 = NotificationCenter.channelConnectedBotsUpdate;
        long j10 = this.P;
        if (i10 != i12) {
            if (i10 == NotificationCenter.channelSuggestedBotsUpdate && ((Long) objArr[0]).longValue() == j10 && (x3Var = this.T) != null) {
                x3Var.N(true);
                return;
            }
            return;
        }
        if (((Long) objArr[0]).longValue() == j10) {
            x3 x3Var2 = this.T;
            if (x3Var2 != null) {
                x3Var2.N(true);
            }
            zh.p.g(this.currentAccount).d(j10).a();
        }
    }

    @Override // org.telegram.ui.v20
    public final s4.g0 n0() {
        x3 x3Var = new x3(this, this.c, getParentActivity(), this.currentAccount, this.classGuid, new ci.u(this, 17), getResourceProvider());
        this.T = x3Var;
        return x3Var;
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final boolean onFragmentCreate() {
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.channelConnectedBotsUpdate);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.channelSuggestedBotsUpdate);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.channelConnectedBotsUpdate);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.channelSuggestedBotsUpdate);
    }

    @Override // org.telegram.ui.v20, org.telegram.ui.ActionBar.m2
    public final void onPause() {
        super.onPause();
        tg.n nVar = this.R;
        if (nVar != null) {
            nVar.setPaused(true);
            this.R.setDialogVisible(true);
        }
    }

    @Override // org.telegram.ui.v20, org.telegram.ui.ActionBar.m2
    public final void onResume() {
        super.onResume();
        tg.n nVar = this.R;
        if (nVar != null) {
            nVar.setPaused(false);
            this.R.setDialogVisible(false);
        }
    }

    @Override // org.telegram.ui.v20
    public final sg.x1 p0() {
        f fVar = new f(getParentActivity(), 1);
        fVar.c();
        return fVar;
    }
}
