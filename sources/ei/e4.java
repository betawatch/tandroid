package ei;

import ai.i5;
import ai.o6;
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
import ci.bb;
import ci.y8;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.bi;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.ao;
import org.telegram.ui.Components.c71;
import org.telegram.ui.Components.ea0;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.hs;
import org.telegram.ui.Components.j9;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.p61;
import org.telegram.ui.Components.p80;
import org.telegram.ui.Components.y9;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.p20;
import w7.x5;
import w7.z5;
import yh.p7;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final class e4 extends p20 implements NotificationCenter.NotificationCenterDelegate {
    public final long P;
    public FrameLayout Q;
    public sg.n R;
    public ao S;
    public w3 T;

    public e4(long j3) {
        this.P = j3;
        this.M = true;
        this.L = AndroidUtilities.dp(60.0f);
    }

    public static /* synthetic */ void A0(e4 e4Var, Context context, int i10) {
        w3 w3Var = e4Var.T;
        if (w3Var == null) {
            return;
        }
        Object obj = w3Var.G(i10).G;
        if (obj instanceof TL_payments.starRefProgram) {
            H0(context, e4Var.currentAccount, (TL_payments.starRefProgram) obj, e4Var.P, e4Var.resourceProvider, false);
        } else if (obj instanceof TL_payments.connectedBotStarRef) {
            I0(context, e4Var.currentAccount, (TL_payments.connectedBotStarRef) obj, e4Var.P, e4Var.resourceProvider);
        }
    }

    public static void B0(e4 e4Var, TLObject tLObject, org.telegram.ui.ActionBar.b2 b2Var) {
        long j3 = e4Var.P;
        if (tLObject instanceof TL_payments.connectedStarRefBots) {
            TL_payments.connectedStarRefBots connectedstarrefbots = (TL_payments.connectedStarRefBots) tLObject;
            yh.l d = yh.o.g(e4Var.currentAccount).d(j3);
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
            yh.m e7 = yh.o.g(e4Var.currentAccount).e(j3);
            e7.c = 0;
            e7.d = false;
            e7.i = false;
            e7.f = 0L;
            e7.j = null;
            e7.h = false;
            e7.a();
            e4Var.T.N(true);
        }
        b2Var.dismiss();
    }

    public static boolean C0(e4 e4Var, Context context, View view, int i10) {
        w3 w3Var = e4Var.T;
        if (w3Var != null) {
            Object obj = w3Var.G(i10).G;
            if (obj instanceof TL_payments.connectedBotStarRef) {
                TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) obj;
                TLRPC.User user = MessagesController.getInstance(e4Var.currentAccount).getUser(Long.valueOf(connectedbotstarref.bot_id));
                p80 H = p80.H(e4Var, view);
                H.l(R.drawable.msg_bot, LocaleController.getString(R.string.ProfileBotOpenApp), new y8(19, e4Var, user), user.bot_has_main_app);
                H.l(R.drawable.msg_bot, LocaleController.getString(R.string.BotWebViewOpenBot), new y8(20, e4Var, connectedbotstarref), !user.bot_has_main_app);
                H.c(R.drawable.msg_link2, LocaleController.getString(R.string.CopyLink), new a3.k0(e4Var, connectedbotstarref, user, 27), false);
                H.m(!connectedbotstarref.revoked, R.drawable.msg_leave, LocaleController.getString(R.string.LeaveAffiliateLinkButton), true, new i5(e4Var, context, user, connectedbotstarref, 9));
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
    public static void H0(Context context, int i10, final TL_payments.starRefProgram starrefprogram, long j3, e6 e6Var, boolean z10) {
        long[] jArr;
        float f7;
        String str;
        String str2;
        ?? r14;
        String formatPluralString;
        LinearLayout linearLayout;
        y9 y9Var;
        TextView textView;
        e6 e6Var2;
        if (starrefprogram == null || context == null) {
            return;
        }
        final org.telegram.ui.ActionBar.f3 i11 = bi.i(1, context, e6Var, false);
        long[] jArr2 = {j3};
        TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(starrefprogram.bot_id));
        LinearLayout e7 = bi.e(context, 1);
        e7.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f));
        e7.setClipChildren(false);
        e7.setClipToPadding(false);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setClipToPadding(false);
        frameLayout.setClipChildren(false);
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setClipToPadding(false);
        frameLayout2.setClipChildren(false);
        frameLayout.addView(frameLayout2, x5.a(60.0f, 0.0f, 0.0f, 0.0f, 0.0f, 60, 19));
        y9 y9Var2 = new y9(context);
        y9Var2.setRoundRadius(AndroidUtilities.dp(30.0f));
        j9 j9Var = new j9((e6) null);
        j9Var.r(user);
        y9Var2.e(user, j9Var);
        z5.a(y9Var2);
        frameLayout2.addView(y9Var2, x5.e(60, 60, 119));
        if (starrefprogram.daily_revenue_per_user.positive()) {
            FrameLayout frameLayout3 = new FrameLayout(context);
            frameLayout3.setBackground(i6.c0(AndroidUtilities.dp(10.0f), i6.w0(i6.h5, e6Var)));
            frameLayout3.setPadding(AndroidUtilities.dp(1.33f), AndroidUtilities.dp(1.33f), AndroidUtilities.dp(1.33f), AndroidUtilities.dp(1.33f));
            TextView textView2 = new TextView(context);
            textView2.setBackground(i6.c0(AndroidUtilities.dp(10.0f), i6.w0(i6.uj, e6Var)));
            textView2.setTypeface(AndroidUtilities.bold());
            textView2.setTextSize(1, 10.0f);
            f7 = 10.0f;
            textView2.setPadding(AndroidUtilities.dp(5.33f), 0, AndroidUtilities.dp(5.33f), 0);
            textView2.setTextColor(-1);
            textView2.setGravity(17);
            StringBuilder sb2 = new StringBuilder("⭐️ ");
            jArr = jArr2;
            sb2.append((Object) p7.L0(starrefprogram.daily_revenue_per_user, 1.0f, ','));
            textView2.setText(p7.S0(sb2.toString(), 0.75f, new er[1]));
            frameLayout3.addView(textView2, x5.d(15.66f, -2));
            frameLayout2.addView(frameLayout3, x5.a(-2.0f, 0.0f, 0.0f, 0.0f, -4.0f, -2, 81));
        } else {
            jArr = jArr2;
            f7 = 10.0f;
        }
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(R.drawable.msg_arrow_avatar);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setTranslationX(-AndroidUtilities.dp(2.0825f));
        int w02 = i6.w0(i6.E6, e6Var);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView.setColorFilter(new PorterDuffColorFilter(w02, mode));
        frameLayout.addView(imageView, x5.a(60.0f, 60.0f, 0.0f, 60.0f, 0.0f, 36, 17));
        FrameLayout frameLayout4 = new FrameLayout(context);
        frameLayout4.setClipToPadding(false);
        frameLayout4.setClipChildren(false);
        frameLayout.addView(frameLayout4, x5.a(60.0f, 0.0f, 0.0f, 5.66f, 0.0f, 60, 21));
        y9 y9Var3 = new y9(context);
        y9Var3.setRoundRadius(AndroidUtilities.dp(30.0f));
        frameLayout4.addView(y9Var3, x5.e(60, 60, 119));
        FrameLayout frameLayout5 = new FrameLayout(context);
        int dp = AndroidUtilities.dp(f7);
        int i12 = i6.h5;
        frameLayout5.setBackground(i6.c0(dp, i6.w0(i12, e6Var)));
        frameLayout5.setPadding(AndroidUtilities.dp(1.33f), AndroidUtilities.dp(1.33f), AndroidUtilities.dp(1.33f), AndroidUtilities.dp(1.33f));
        TextView textView3 = new TextView(context);
        textView3.setBackground(i6.c0(AndroidUtilities.dp(f7), i6.w0(i6.Oh, e6Var)));
        textView3.setTypeface(AndroidUtilities.bold());
        textView3.setTextSize(1, f7);
        textView3.setPadding(AndroidUtilities.dp(5.33f), 0, AndroidUtilities.dp(5.33f), 0);
        textView3.setTextColor(-1);
        textView3.setGravity(17);
        SpannableString spannableString = new SpannableString("s " + ((Object) l.H0(starrefprogram.commission_permille)));
        er erVar = new er(R.drawable.msg_link_1, 0);
        erVar.setScale(0.65f, 0.65f);
        erVar.spaceScaleX = 0.7f;
        erVar.translate(AndroidUtilities.dp(-2.0f), AndroidUtilities.dp(0.0f));
        spannableString.setSpan(erVar, 0, 1, 33);
        textView3.setText(spannableString);
        frameLayout5.addView(textView3, x5.d(15.66f, -2));
        frameLayout4.addView(frameLayout5, x5.a(-2.0f, 0.0f, 0.0f, 0.0f, -4.0f, -2, 81));
        e7.addView(frameLayout, x5.t(-2, -2, 1, 0, 0, 0, 0));
        TextView textView4 = new TextView(context);
        int i13 = i6.G6;
        bi.o(i13, e6Var, textView4, 1, 20.0f);
        textView4.setGravity(17);
        textView4.setText(LocaleController.getString(R.string.ChannelAffiliateProgramJoinTitle));
        textView4.setTypeface(AndroidUtilities.bold());
        e7.addView(textView4, x5.k(0.0f, 21.0f, 0.0f, 9.0f, -1, -2));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        int dp2 = AndroidUtilities.dp(28.0f);
        int i14 = i6.a7;
        linearLayout2.setBackground(i6.c0(dp2, i6.w0(i14, e6Var)));
        TextView textView5 = new TextView(context);
        textView5.setTextSize(1, 13.0f);
        textView5.setTextColor(i6.w0(i13, e6Var));
        textView5.setText(LocaleController.formatString(R.string.ChannelAffiliateProgramJoinViewBot, DialogObject.getName(i10, starrefprogram.bot_id)));
        linearLayout2.addView(textView5, x5.t(-2, -2, 16, 11, 0, 0, 0));
        ImageView imageView2 = new ImageView(context);
        imageView2.setScaleType(scaleType);
        int i15 = i6.r5;
        imageView2.setColorFilter(new PorterDuffColorFilter(i6.w0(i15, e6Var), mode));
        imageView2.setImageResource(R.drawable.settings_arrow);
        imageView2.setScaleX(1.2f);
        imageView2.setScaleY(1.2f);
        linearLayout2.addView(imageView2, x5.t(-2, -2, 16, 5, 0, 8, 0));
        e7.addView(linearLayout2, x5.t(-2, 28, 1, 4, 0, 4, 0));
        z5.a(linearLayout2);
        TextView textView6 = new TextView(context);
        bi.o(i13, e6Var, textView6, 1, 14.0f);
        textView6.setGravity(17);
        NotificationCenter.listenEmojiLoading(textView6);
        SpannableString spannableString2 = new SpannableString(p7.L0(starrefprogram.daily_revenue_per_user, 0.95f, ','));
        spannableString2.setSpan(new m61(AndroidUtilities.bold()), 0, spannableString2.length(), 33);
        textView6.setText(p7.Y0(false, LocaleController.formatSpannable(R.string.ChannelAffiliateProgramJoinRevenue, spannableString2), 0.725f, null));
        TextView h = com.google.android.gms.internal.vision.e2.h(e7, textView6, x5.k(0.0f, 10.0f, 0.0f, 20.0f, -1, -2), context);
        bi.o(i13, e6Var, h, 1, 14.0f);
        h.setGravity(17);
        NotificationCenter.listenEmojiLoading(h);
        int i16 = R.string.ChannelAffiliateProgramJoinText;
        String userName = UserObject.getUserName(user);
        String H0 = l.H0(starrefprogram.commission_permille);
        int i17 = starrefprogram.duration_months;
        if (i17 <= 0) {
            formatPluralString = LocaleController.getString(R.string.ChannelAffiliateProgramJoinText_Lifetime);
            str = userName;
        } else {
            if (i17 < 12 || i17 % 12 != 0) {
                str = userName;
                str2 = H0;
                r14 = 0;
                formatPluralString = LocaleController.formatPluralString("ChannelAffiliateProgramJoinText_Months", i17, new Object[0]);
                Object[] objArr = new Object[3];
                objArr[r14] = str;
                objArr[1] = str2;
                objArr[2] = formatPluralString;
                h.setText(Emoji.replaceEmoji(AndroidUtilities.replaceTags(LocaleController.formatString(i16, objArr)), h.getPaint().getFontMetricsInt(), r14));
                e7.addView(h, x5.k(0.0f, 0.0f, 0.0f, 22.0f, -1, -2));
                if (j3 < 0) {
                    TextView textView7 = new TextView(context);
                    bi.o(i13, e6Var, textView7, 1, 14.0f);
                    textView7.setGravity(17);
                    textView7.setText(LocaleController.getString(R.string.ChannelAffiliateProgramLinkSendTo));
                    e7.addView(textView7, x5.k(20.0f, 0.0f, 20.0f, 0.0f, -1, -2));
                    LinearLayout linearLayout3 = new LinearLayout(context);
                    linearLayout3.setOrientation(0);
                    linearLayout3.setBackground(i6.c0(AndroidUtilities.dp(28.0f), i6.w0(i14, e6Var)));
                    int dp3 = AndroidUtilities.dp(28.0f);
                    int w03 = i6.w0(i14, e6Var);
                    int v = i6.v(i6.w0(i14, e6Var), i6.w0(i6.i6, e6Var));
                    linearLayout3.setBackground(i6.j0(dp3, dp3, dp3, dp3, w03, v, v));
                    y9 y9Var4 = new y9(context);
                    y9Var4.setRoundRadius(AndroidUtilities.dp(14.0f));
                    linearLayout3.addView(y9Var4, x5.n(28, 28));
                    TextView textView8 = new TextView(context);
                    textView8.setTextSize(1, 13.0f);
                    textView8.setTextColor(i6.w0(i13, e6Var));
                    linearLayout3.addView(textView8, x5.t(-2, -2, 16, 6, 0, 0, 0));
                    ImageView imageView3 = new ImageView(context);
                    imageView3.setScaleType(scaleType);
                    imageView3.setColorFilter(new PorterDuffColorFilter(i6.w0(i15, e6Var), mode));
                    imageView3.setImageResource(R.drawable.arrows_select);
                    linearLayout3.addView(imageView3, x5.t(-2, -2, 16, 2, 0, 5, 0));
                    e7.addView(linearLayout3, x5.t(-2, 28, 1, 0, 11, 0, 20));
                    textView = textView8;
                    linearLayout = linearLayout3;
                    y9Var = y9Var4;
                } else {
                    linearLayout = null;
                    y9Var = null;
                    textView = null;
                }
                ci.d dVar = new ci.d(context, e6Var, true);
                dVar.g(LocaleController.getString(R.string.ChannelAffiliateProgramJoinButton), false, true);
                e7.addView(dVar, x5.n(-1, 48));
                ea0 ea0Var = new ea0(context, e6Var);
                ea0Var.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.ChannelAffiliateProgramJoinButtonInfo), new di.a(context, 1)));
                ea0Var.setGravity(17);
                ea0Var.setTextSize(1, 12.0f);
                ea0Var.setTextColor(i6.w0(i6.B6, e6Var));
                ea0Var.setLinkTextColor(i6.w0(i6.gc, e6Var));
                e7.addView(ea0Var, x5.t(-1, -2, 49, 14, 14, 14, 6));
                i11.customView = e7;
                final int i18 = 1;
                y9Var2.setOnClickListener(new View.OnClickListener() { // from class: ei.n3
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i18) {
                            case 0:
                                org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                                if (U != null) {
                                    org.telegram.ui.ActionBar.f3 f3Var = i11;
                                    f3Var.dismiss();
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("user_id", starrefprogram.bot_id);
                                    U.presentFragment(new z3(bundle, f3Var));
                                    break;
                                }
                                break;
                            default:
                                org.telegram.ui.ActionBar.n2 U2 = LaunchActivity.U();
                                if (U2 != null) {
                                    i11.dismiss();
                                    U2.presentFragment(ProfileActivity.m4(starrefprogram.bot_id));
                                    break;
                                }
                                break;
                        }
                    }
                });
                dVar.setOnClickListener(new v3(dVar, jArr, i10, starrefprogram, i11, j3, z10, context, e6Var, user));
                i11.setOnDismissListener(new ci.e1(6));
                l3 l3Var = new l3(jArr, i10, y9Var3, y9Var, textView, 0);
                l3Var.run();
                if (linearLayout == null) {
                    yh.o.g(i10).n();
                    yh.o.g(i10).o();
                    LinearLayout linearLayout4 = linearLayout;
                    e6Var2 = e6Var;
                    linearLayout4.setOnClickListener(new m3(i10, i11, e6Var2, linearLayout4, jArr, l3Var));
                } else {
                    e6Var2 = e6Var;
                }
                final int i19 = 0;
                linearLayout2.setOnClickListener(new View.OnClickListener() { // from class: ei.n3
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i19) {
                            case 0:
                                org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                                if (U != null) {
                                    org.telegram.ui.ActionBar.f3 f3Var = i11;
                                    f3Var.dismiss();
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("user_id", starrefprogram.bot_id);
                                    U.presentFragment(new z3(bundle, f3Var));
                                    break;
                                }
                                break;
                            default:
                                org.telegram.ui.ActionBar.n2 U2 = LaunchActivity.U();
                                if (U2 != null) {
                                    i11.dismiss();
                                    U2.presentFragment(ProfileActivity.m4(starrefprogram.bot_id));
                                    break;
                                }
                                break;
                        }
                    }
                });
                i11.fixNavigationBar(i6.w0(i12, e6Var2));
                i11.show();
            }
            str = userName;
            formatPluralString = LocaleController.formatPluralString("ChannelAffiliateProgramJoinText_Years", i17 / 12, new Object[0]);
        }
        str2 = H0;
        r14 = 0;
        Object[] objArr2 = new Object[3];
        objArr2[r14] = str;
        objArr2[1] = str2;
        objArr2[2] = formatPluralString;
        h.setText(Emoji.replaceEmoji(AndroidUtilities.replaceTags(LocaleController.formatString(i16, objArr2)), h.getPaint().getFontMetricsInt(), r14));
        e7.addView(h, x5.k(0.0f, 0.0f, 0.0f, 22.0f, -1, -2));
        if (j3 < 0) {
        }
        ci.d dVar2 = new ci.d(context, e6Var, true);
        dVar2.g(LocaleController.getString(R.string.ChannelAffiliateProgramJoinButton), false, true);
        e7.addView(dVar2, x5.n(-1, 48));
        ea0 ea0Var2 = new ea0(context, e6Var);
        ea0Var2.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.ChannelAffiliateProgramJoinButtonInfo), new di.a(context, 1)));
        ea0Var2.setGravity(17);
        ea0Var2.setTextSize(1, 12.0f);
        ea0Var2.setTextColor(i6.w0(i6.B6, e6Var));
        ea0Var2.setLinkTextColor(i6.w0(i6.gc, e6Var));
        e7.addView(ea0Var2, x5.t(-1, -2, 49, 14, 14, 14, 6));
        i11.customView = e7;
        final int i182 = 1;
        y9Var2.setOnClickListener(new View.OnClickListener() { // from class: ei.n3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i182) {
                    case 0:
                        org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                        if (U != null) {
                            org.telegram.ui.ActionBar.f3 f3Var = i11;
                            f3Var.dismiss();
                            Bundle bundle = new Bundle();
                            bundle.putLong("user_id", starrefprogram.bot_id);
                            U.presentFragment(new z3(bundle, f3Var));
                            break;
                        }
                        break;
                    default:
                        org.telegram.ui.ActionBar.n2 U2 = LaunchActivity.U();
                        if (U2 != null) {
                            i11.dismiss();
                            U2.presentFragment(ProfileActivity.m4(starrefprogram.bot_id));
                            break;
                        }
                        break;
                }
            }
        });
        dVar2.setOnClickListener(new v3(dVar2, jArr, i10, starrefprogram, i11, j3, z10, context, e6Var, user));
        i11.setOnDismissListener(new ci.e1(6));
        l3 l3Var2 = new l3(jArr, i10, y9Var3, y9Var, textView, 0);
        l3Var2.run();
        if (linearLayout == null) {
        }
        final int i192 = 0;
        linearLayout2.setOnClickListener(new View.OnClickListener() { // from class: ei.n3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i192) {
                    case 0:
                        org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                        if (U != null) {
                            org.telegram.ui.ActionBar.f3 f3Var = i11;
                            f3Var.dismiss();
                            Bundle bundle = new Bundle();
                            bundle.putLong("user_id", starrefprogram.bot_id);
                            U.presentFragment(new z3(bundle, f3Var));
                            break;
                        }
                        break;
                    default:
                        org.telegram.ui.ActionBar.n2 U2 = LaunchActivity.U();
                        if (U2 != null) {
                            i11.dismiss();
                            U2.presentFragment(ProfileActivity.m4(starrefprogram.bot_id));
                            break;
                        }
                        break;
                }
            }
        });
        i11.fixNavigationBar(i6.w0(i12, e6Var2));
        i11.show();
    }

    public static org.telegram.ui.ActionBar.f3 I0(Context context, int i10, TL_payments.connectedBotStarRef connectedbotstarref, long j3, e6 e6Var) {
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
        e6 e6Var2;
        int i14;
        PorterDuff.Mode mode;
        if (connectedbotstarref == null || context == null) {
            return null;
        }
        org.telegram.ui.ActionBar.f3 i15 = bi.i(1, context, e6Var, false);
        TLRPC.User user2 = MessagesController.getInstance(i10).getUser(Long.valueOf(connectedbotstarref.bot_id));
        LinearLayout e7 = bi.e(context, 1);
        e7.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f));
        e7.setClipChildren(false);
        e7.setClipToPadding(false);
        FrameLayout frameLayout = new FrameLayout(context);
        View view = new View(context);
        view.setBackground(i6.K(AndroidUtilities.dp(40.0f), i6.w0(connectedbotstarref.revoked ? i6.wj : i6.Oh, e6Var)));
        frameLayout.addView(view, x5.a(80.0f, 0.0f, 0.0f, 0.0f, 0.0f, 80, 49));
        ImageView imageView = new ImageView(context);
        ImageView.ScaleType scaleType2 = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType2);
        imageView.setImageResource(connectedbotstarref.revoked ? R.drawable.msg_link_2 : R.drawable.msg_limit_links);
        imageView.setScaleX(connectedbotstarref.revoked ? 2.0f : 1.8f);
        imageView.setScaleY(connectedbotstarref.revoked ? 2.0f : 1.8f);
        frameLayout.addView(imageView, x5.a(80.0f, 0.0f, 0.0f, 0.0f, 0.0f, 80, 49));
        if (connectedbotstarref.participants > 0) {
            FrameLayout frameLayout2 = new FrameLayout(context);
            frameLayout2.setBackground(i6.c0(AndroidUtilities.dp(50.0f), i6.w0(i6.h5, e6Var)));
            frameLayout.addView(frameLayout2, x5.a(-2.0f, 0.0f, 66.0f, 0.0f, 0.0f, -2, 49));
            TextView textView = new TextView(context);
            textView.setTypeface(AndroidUtilities.bold());
            textView.setTextSize(1, 12.0f);
            textView.setBackground(i6.c0(AndroidUtilities.dp(9.5f), i6.w0(connectedbotstarref.revoked ? i6.wj : i6.uj, e6Var)));
            textView.setTextColor(-1);
            textView.setPadding(AndroidUtilities.dp(6.66f), 0, AndroidUtilities.dp(6.66f), 0);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) "s ");
            er erVar = new er(R.drawable.mini_reply_user, 0);
            erVar.setScale(0.937f, 0.937f);
            erVar.translate(-AndroidUtilities.dp(1.33f), AndroidUtilities.dp(1.0f));
            erVar.spaceScaleX = 0.8f;
            scaleType = scaleType2;
            spannableStringBuilder.setSpan(erVar, 0, 1, 33);
            spannableStringBuilder.append((CharSequence) String.valueOf(connectedbotstarref.participants));
            textView.setText(spannableStringBuilder);
            textView.setGravity(17);
            frameLayout2.addView(textView, x5.a(19.0f, 1.33f, 1.33f, 1.33f, 1.33f, -1, 119));
        } else {
            scaleType = scaleType2;
        }
        e7.addView(frameLayout, x5.t(-2, -2, 1, 0, 0, 0, 0));
        TextView textView2 = new TextView(context);
        int i16 = i6.G6;
        bi.o(i16, e6Var, textView2, 1, 20.0f);
        textView2.setGravity(17);
        textView2.setText(LocaleController.getString(R.string.ChannelAffiliateProgramLinkTitle));
        textView2.setTypeface(AndroidUtilities.bold());
        e7.addView(textView2, x5.k(20.0f, 16.0f, 20.0f, 9.33f, -1, -2));
        LinearLayout linearLayout3 = new LinearLayout(context);
        linearLayout3.setOrientation(0);
        int dp = AndroidUtilities.dp(28.0f);
        int i17 = i6.a7;
        linearLayout3.setBackground(i6.c0(dp, i6.w0(i17, e6Var)));
        y9 y9Var = new y9(context);
        y9Var.setRoundRadius(AndroidUtilities.dp(14.0f));
        j9 j9Var = new j9((e6) null);
        linearLayout3.addView(y9Var, x5.n(28, 28));
        TextView textView3 = new TextView(context);
        textView3.setTextSize(1, 13.0f);
        textView3.setTextColor(i6.w0(i16, e6Var));
        textView3.setText(DialogObject.getName(i10, connectedbotstarref.bot_id));
        j9Var.r(user2);
        y9Var.e(user2, j9Var);
        linearLayout3.addView(textView3, x5.t(-2, -2, 16, 6, 0, 0, 0));
        ImageView imageView2 = new ImageView(context);
        ImageView.ScaleType scaleType3 = scaleType;
        imageView2.setScaleType(scaleType3);
        int i18 = i6.r5;
        int w02 = i6.w0(i18, e6Var);
        PorterDuff.Mode mode2 = PorterDuff.Mode.SRC_IN;
        imageView2.setColorFilter(new PorterDuffColorFilter(w02, mode2));
        imageView2.setImageResource(R.drawable.settings_arrow);
        imageView2.setScaleX(1.2f);
        imageView2.setScaleY(1.2f);
        linearLayout3.addView(imageView2, x5.t(-2, -2, 16, 5, 0, 8, 0));
        e7.addView(linearLayout3, x5.t(-2, 28, 1, 4, 0, 4, 0));
        z5.a(linearLayout3);
        TextView textView4 = new TextView(context);
        bi.o(i16, e6Var, textView4, 1, 14.0f);
        textView4.setGravity(17);
        if (connectedbotstarref.revoked) {
            org.telegram.messenger.q.n(R.string.ChannelAffiliateProgramLinkTextRevoked, textView4);
            user = user2;
            linearLayout = linearLayout3;
        } else {
            user = user2;
            if (j3 < 0) {
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
                bi.r(i19, objArr, textView4);
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
                bi.r(i21, objArr2, textView4);
            }
        }
        e7.addView(textView4, x5.k(20.0f, 19.0f, 20.0f, 18.0f, -1, -2));
        if (connectedbotstarref.revoked) {
            j10 = j3;
            i12 = i16;
            linearLayout2 = null;
        } else {
            TextView textView5 = new TextView(context);
            bi.o(i16, e6Var, textView5, 1, 14.0f);
            textView5.setGravity(17);
            textView5.setText(LocaleController.getString(R.string.ChannelAffiliateProgramLinkSendTo));
            e7.addView(textView5, x5.k(20.0f, 0.0f, 20.0f, 0.0f, -1, -2));
            LinearLayout linearLayout4 = new LinearLayout(context);
            linearLayout4.setOrientation(0);
            linearLayout4.setBackground(i6.c0(AndroidUtilities.dp(28.0f), i6.w0(i17, e6Var)));
            y9 y9Var2 = new y9(context);
            y9Var2.setRoundRadius(AndroidUtilities.dp(14.0f));
            j9 j9Var2 = new j9((e6) null);
            linearLayout4.addView(y9Var2, x5.n(28, 28));
            TextView textView6 = new TextView(context);
            textView6.setTextSize(1, 13.0f);
            textView6.setTextColor(i6.w0(i16, e6Var));
            if (j3 >= 0) {
                TLRPC.User user3 = MessagesController.getInstance(i10).getUser(Long.valueOf(j3));
                j9Var2.r(user3);
                y9Var2.e(user3, j9Var2);
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
                j9Var2.q(chat);
                y9Var2.e(chat, j9Var2);
                textView6.setText(chat == null ? "" : chat.title);
            }
            linearLayout4.addView(textView6, x5.t(-2, -2, 16, 6, 0, 0, 0));
            ImageView imageView3 = new ImageView(context);
            imageView3.setScaleType(scaleType3);
            imageView3.setColorFilter(new PorterDuffColorFilter(i6.w0(i14, e6Var), mode));
            imageView3.setImageResource(R.drawable.arrows_select);
            linearLayout4.addView(imageView3, x5.t(-2, -2, 16, 2, 0, 5, 0));
            e7.addView(linearLayout4, x5.t(-2, 28, 1, 0, 9, 0, 22));
            linearLayout2 = linearLayout4;
        }
        TextView textView7 = new TextView(context);
        textView7.setTextSize(1, 16.0f);
        textView7.setGravity(17);
        textView7.setTextColor(i6.w0(i12, e6Var));
        int dp2 = AndroidUtilities.dp(8.0f);
        int w03 = i6.w0(i17, e6Var);
        int v = i6.v(i6.w0(i17, e6Var), i6.w0(i6.i6, e6Var));
        textView7.setBackground(i6.j0(dp2, dp2, dp2, dp2, w03, v, v));
        textView7.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(14.66f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(14.66f));
        String str2 = connectedbotstarref.url;
        textView7.setText((str2 == null || !str2.startsWith("https://")) ? connectedbotstarref.url : connectedbotstarref.url.substring(8));
        e7.addView(textView7, x5.a(-2.0f, 0.0f, 0.0f, 0.0f, 12.0f, -1, 7));
        ci.d dVar = new ci.d(context, e6Var, true);
        if (connectedbotstarref.revoked) {
            dVar.g(LocaleController.getString(R.string.ChannelAffiliateProgramLinkRejoin), false, true);
        } else {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            spannableStringBuilder2.append((CharSequence) "c ");
            spannableStringBuilder2.setSpan(new er(R.drawable.msg_copy_filled, 0), 0, 1, 33);
            spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.ChannelAffiliateProgramLinkCopy));
            dVar.g(spannableStringBuilder2, false, true);
        }
        e7.addView(dVar, x5.n(-1, 48));
        ea0 ea0Var = new ea0(context, e6Var);
        long j11 = connectedbotstarref.participants;
        if (j11 <= 0) {
            i13 = 1;
            formatPluralString3 = LocaleController.formatString(R.string.ChannelAffiliateProgramLinkOpenedNone, UserObject.getUserName(user));
        } else {
            i13 = 1;
            formatPluralString3 = LocaleController.formatPluralString("ChannelAffiliateProgramLinkOpened", (int) j11, UserObject.getUserName(user));
        }
        ea0Var.setText(formatPluralString3);
        ea0Var.setGravity(17);
        ea0Var.setTextSize(i13, 12.0f);
        ea0Var.setTextColor(i6.w0(i6.B6, e6Var));
        ea0Var.setLinkTextColor(i6.w0(i6.gc, e6Var));
        e7.addView(ea0Var, x5.t(-1, -2, 49, 14, 12, 14, 2));
        i15.customView = e7;
        i5 i5Var = new i5(connectedbotstarref, i15, e6Var, user, 8);
        if (!connectedbotstarref.revoked) {
            textView7.setOnClickListener(new ai.v0(i5Var, 16));
        }
        dVar.setOnClickListener(new u3(connectedbotstarref, i10, i15, context, j10, e6Var, i5Var));
        i15.setOnDismissListener(new ci.e1(6));
        if (linearLayout2 != null) {
            yh.o.g(i10).n();
            yh.o.g(i10).o();
            LinearLayout linearLayout5 = linearLayout2;
            e6Var2 = e6Var;
            connectedbotstarref2 = connectedbotstarref;
            linearLayout5.setOnClickListener(new u3(i10, i15, e6Var, linearLayout5, j3, context, connectedbotstarref));
        } else {
            connectedbotstarref2 = connectedbotstarref;
            e6Var2 = e6Var;
        }
        linearLayout.setOnClickListener(new ai.f2(9, i15, connectedbotstarref2));
        i15.fixNavigationBar(i6.w0(i6.h5, e6Var2));
        org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
        if (!AndroidUtilities.isTablet() && U != null && !AndroidUtilities.hasDialogOnTop(U)) {
            i15.makeAttached(U);
        }
        i15.show();
        return i15;
    }

    public static void y0(e4 e4Var, Context context, TLRPC.User user, TL_payments.connectedBotStarRef connectedbotstarref) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, e4Var.resourceProvider);
        String string = LocaleController.getString(R.string.LeaveAffiliateLink);
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
        b2Var.R = string;
        b2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.LeaveAffiliateLinkAlert, UserObject.getUserName(user)));
        alertDialog$Builder.k(LocaleController.getString(R.string.LeaveAffiliateLinkButton), new ah.b(10, e4Var, connectedbotstarref));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        alertDialog$Builder.d(-1);
        alertDialog$Builder.o();
    }

    public static void z0(e4 e4Var, TL_payments.connectedBotStarRef connectedbotstarref) {
        org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(e4Var.getParentActivity(), 3, null);
        b2Var.q(200L);
        TL_payments.editConnectedStarRefBot editconnectedstarrefbot = new TL_payments.editConnectedStarRefBot();
        editconnectedstarrefbot.link = connectedbotstarref.url;
        editconnectedstarrefbot.peer = MessagesController.getInstance(e4Var.currentAccount).getInputPeer(e4Var.P);
        editconnectedstarrefbot.revoked = true;
        e4Var.getConnectionsManager().sendRequest(editconnectedstarrefbot, new ai.v1(9, e4Var, b2Var));
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x01a5 A[LOOP:0: B:20:0x019f->B:22:0x01a5, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void G0(ArrayList arrayList, c71 c71Var) {
        SpannableString spannableString;
        if (getParentActivity() == null) {
            return;
        }
        bb bbVar = (bb) r0(getParentActivity());
        p61 p61Var = new p61(-2);
        p61Var.c = bbVar;
        arrayList.add(p61Var);
        arrayList.add(j.a(R.drawable.menu_feature_reliable, LocaleController.getString(R.string.ChannelAffiliateProgramFeature1Title), LocaleController.getString(R.string.ChannelAffiliateProgramFeature1)));
        arrayList.add(j.a(R.drawable.menu_feature_transparent, LocaleController.getString(R.string.ChannelAffiliateProgramFeature2Title), LocaleController.getString(R.string.ChannelAffiliateProgramFeature2)));
        arrayList.add(j.a(R.drawable.menu_feature_simple, LocaleController.getString(R.string.ChannelAffiliateProgramFeature3Title), LocaleController.getString(R.string.ChannelAffiliateProgramFeature3)));
        arrayList.add(p61.A(1, null));
        yh.o g10 = yh.o.g(this.currentAccount);
        long j3 = this.P;
        yh.l d = g10.d(j3);
        ArrayList arrayList2 = d.e;
        if (!arrayList2.isEmpty() || d.c > 0) {
            com.google.android.gms.internal.vision.e2.n(R.string.ChannelAffiliateProgramMyPrograms, arrayList);
            for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) arrayList2.get(i10);
                int i11 = a4.a;
                p61 J = p61.J(a4.class);
                J.G = connectedbotstarref;
                J.r = true;
                arrayList.add(J);
            }
            if (!d.d || d.g) {
                arrayList.add(p61.n(29));
                arrayList.add(p61.n(29));
                arrayList.add(p61.n(29));
            }
            arrayList.add(p61.A(2, null));
        }
        yh.m e7 = yh.o.g(this.currentAccount).e(j3);
        ArrayList arrayList3 = e7.e;
        if (!arrayList3.isEmpty() || e7.c > 0) {
            String string = LocaleController.getString(R.string.ChannelAffiliateProgramPrograms);
            int i12 = e7.g;
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
                int i13 = c4.a;
                p61 J2 = p61.J(c4.class);
                J2.l = string;
                J2.m = spannableStringBuilder;
                arrayList.add(J2);
                for (int i14 = 0; i14 < arrayList3.size(); i14++) {
                    Object obj = arrayList3.get(i14);
                    int i15 = a4.a;
                    p61 J3 = p61.J(a4.class);
                    J3.G = obj;
                    J3.r = true;
                    arrayList.add(J3);
                }
                if (e7.d || e7.h) {
                    arrayList.add(p61.n(29));
                    arrayList.add(p61.n(29));
                    arrayList.add(p61.n(29));
                }
                arrayList.add(p61.A(3, null));
            }
            er erVar = new er(R.drawable.arrow_more, 0);
            erVar.useLinkPaintColor = true;
            erVar.setScale(0.6f, 0.6f);
            spannableString.setSpan(erVar, spannableString.length() - 1, spannableString.length(), 33);
            spannableString.setSpan(new y3(this, i12, yh.o.g(this.currentAccount).e(j3)), 0, spannableString.length(), 33);
            spannableStringBuilder.append((CharSequence) spannableString);
            int i132 = c4.a;
            p61 J22 = p61.J(c4.class);
            J22.l = string;
            J22.m = spannableStringBuilder;
            arrayList.add(J22);
            while (i14 < arrayList3.size()) {
            }
            if (e7.d) {
            }
            arrayList.add(p61.n(29));
            arrayList.add(p61.n(29));
            arrayList.add(p61.n(29));
            arrayList.add(p61.A(3, null));
        }
        arrayList.add(p61.k(this.S));
    }

    @Override // org.telegram.ui.p20, org.telegram.ui.ActionBar.n2
    public final View createView(Context context) {
        this.G = false;
        this.E = AndroidUtilities.dp(238.0f);
        ao aoVar = new ao(context, 3);
        this.S = aoVar;
        aoVar.setBackgroundColor(i6.x0(null, i6.i5, false));
        super.createView(context);
        this.Q = new FrameLayout(context);
        sg.n nVar = new sg.n(context, 1, 3);
        this.R = nVar;
        nVar.setImportantForAccessibility(4);
        sg.g gVar = this.R.b;
        gVar.z = i6.fk;
        gVar.A = i6.gk;
        gVar.b();
        this.R.setStarParticlesView(this.e);
        this.Q.addView(this.R, x5.a(190.0f, 0.0f, 32.0f, 0.0f, 12.0f, 190, 17));
        m0(LocaleController.getString(R.string.ChannelAffiliateProgramTitle), AndroidUtilities.replaceTags(LocaleController.getString(R.string.ChannelAffiliateProgramText)), this.Q, null);
        this.c.setOnItemClickListener(new o6(2, this, context));
        this.c.setOnItemLongClickListener(new ah.b(11, this, context));
        s4.j jVar = new s4.j();
        jVar.m = false;
        jVar.C = false;
        jVar.o(hs.h);
        jVar.n(350L);
        this.c.setItemAnimator(jVar);
        this.c.setOnScrollListener(new ai.r(this, 4));
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        w3 w3Var;
        int i12 = NotificationCenter.channelConnectedBotsUpdate;
        long j3 = this.P;
        if (i10 != i12) {
            if (i10 == NotificationCenter.channelSuggestedBotsUpdate && ((Long) objArr[0]).longValue() == j3 && (w3Var = this.T) != null) {
                w3Var.N(true);
                return;
            }
            return;
        }
        if (((Long) objArr[0]).longValue() == j3) {
            w3 w3Var2 = this.T;
            if (w3Var2 != null) {
                w3Var2.N(true);
            }
            yh.o.g(this.currentAccount).d(j3).a();
        }
    }

    @Override // org.telegram.ui.p20
    public final s4.i0 n0() {
        w3 w3Var = new w3(this, this.c, getParentActivity(), this.currentAccount, this.classGuid, new bi.v(this, 17), getResourceProvider());
        this.T = w3Var;
        return w3Var;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean onFragmentCreate() {
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.channelConnectedBotsUpdate);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.channelSuggestedBotsUpdate);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.channelConnectedBotsUpdate);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.channelSuggestedBotsUpdate);
    }

    @Override // org.telegram.ui.p20, org.telegram.ui.ActionBar.n2
    public final void onPause() {
        super.onPause();
        sg.n nVar = this.R;
        if (nVar != null) {
            nVar.setPaused(true);
            this.R.setDialogVisible(true);
        }
    }

    @Override // org.telegram.ui.p20, org.telegram.ui.ActionBar.n2
    public final void onResume() {
        super.onResume();
        sg.n nVar = this.R;
        if (nVar != null) {
            nVar.setPaused(false);
            this.R.setDialogVisible(false);
        }
    }

    @Override // org.telegram.ui.p20
    public final rg.w1 p0() {
        f fVar = new f(getParentActivity(), 1);
        fVar.c();
        return fVar;
    }
}
