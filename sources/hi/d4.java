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
import bi.mb;
import bi.ra;
import bi.sb;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.vh;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.b7;
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.gb1;
import org.telegram.ui.Components.j71;
import org.telegram.ui.Components.j9;
import org.telegram.ui.Components.k80;
import org.telegram.ui.Components.q61;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.vn;
import org.telegram.ui.Components.y9;
import org.telegram.ui.Components.z90;
import org.telegram.ui.Components.zq;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.d20;
import org.telegram.ui.z10;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final class d4 extends d20 implements NotificationCenter.NotificationCenterDelegate {
    public final long R;
    public FrameLayout S;
    public ug.n T;
    public vn U;
    public v3 V;

    public d4(long j10) {
        this.R = j10;
        this.M = true;
        this.L = AndroidUtilities.dp(60.0f);
    }

    public static boolean A0(d4 d4Var, Context context, View view, int i10) {
        v3 v3Var = d4Var.V;
        if (v3Var != null) {
            Object obj = v3Var.G(i10).G;
            if (obj instanceof TL_payments.connectedBotStarRef) {
                TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) obj;
                TLRPC.User user = MessagesController.getInstance(d4Var.currentAccount).getUser(Long.valueOf(connectedbotstarref.bot_id));
                k80 H = k80.H(d4Var, view);
                H.l(R.drawable.msg_bot, LocaleController.getString(R.string.ProfileBotOpenApp), new u2(1, d4Var, user), user.bot_has_main_app);
                H.l(R.drawable.msg_bot, LocaleController.getString(R.string.BotWebViewOpenBot), new u2(2, d4Var, connectedbotstarref), !user.bot_has_main_app);
                H.c(R.drawable.msg_link2, LocaleController.getString(R.string.CopyLink), new e2.m0(d4Var, connectedbotstarref, user, 13), false);
                H.m(R.drawable.msg_leave, new ai.e0(d4Var, context, user, connectedbotstarref, 18), LocaleController.getString(R.string.LeaveAffiliateLinkButton), !connectedbotstarref.revoked, true);
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
    public static void F0(Context context, int i10, final TL_payments.starRefProgram starrefprogram, long j10, u6 u6Var, boolean z10) {
        long[] jArr;
        String str;
        String str2;
        ?? r15;
        String formatPluralString;
        y9 y9Var;
        TextView textView;
        LinearLayout linearLayout;
        if (starrefprogram == null || context == null) {
            return;
        }
        final org.telegram.ui.ActionBar.k3 i11 = vh.i(1, context, u6Var, false);
        long[] jArr2 = {j10};
        TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(starrefprogram.bot_id));
        LinearLayout d = vh.d(context, 1);
        d.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f));
        d.setClipChildren(false);
        d.setClipToPadding(false);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setClipToPadding(false);
        frameLayout.setClipChildren(false);
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setClipToPadding(false);
        frameLayout2.setClipChildren(false);
        frameLayout.addView(frameLayout2, gb1.h(60, 60.0f, 19, 0.0f, 0.0f, 0.0f, 0.0f));
        y9 y9Var2 = new y9(context);
        y9Var2.setRoundRadius(AndroidUtilities.dp(30.0f));
        j9 j9Var = new j9((u6) null);
        j9Var.r(user);
        y9Var2.f(user, j9Var);
        gb1.b(y9Var2);
        frameLayout2.addView(y9Var2, gb1.i(60, 60, 119));
        if (starrefprogram.daily_revenue_per_user.positive()) {
            FrameLayout frameLayout3 = new FrameLayout(context);
            int dp = AndroidUtilities.dp(10.0f);
            int i12 = y6.h5;
            ShapeDrawable c02 = y6.c0(dp, y6.w0(i12, u6Var));
            b7 N = f7.N(i12);
            frameLayout3.setBackground(c02);
            f7.k(frameLayout3, c02, N, null, u6Var);
            frameLayout3.setPadding(AndroidUtilities.dp(1.33f), AndroidUtilities.dp(1.33f), AndroidUtilities.dp(1.33f), AndroidUtilities.dp(1.33f));
            TextView textView2 = new TextView(context);
            int dp2 = AndroidUtilities.dp(10.0f);
            int i13 = y6.uj;
            ShapeDrawable c03 = y6.c0(dp2, y6.w0(i13, u6Var));
            b7 N2 = f7.N(i13);
            textView2.setBackground(c03);
            f7.k(textView2, c03, N2, null, u6Var);
            textView2.setTypeface(AndroidUtilities.bold());
            textView2.setTextSize(1, 10.0f);
            textView2.setPadding(AndroidUtilities.dp(5.33f), 0, AndroidUtilities.dp(5.33f), 0);
            textView2.setTextColor(-1);
            textView2.setGravity(17);
            StringBuilder sb2 = new StringBuilder("⭐️ ");
            jArr = jArr2;
            sb2.append((Object) dd.J0(starrefprogram.daily_revenue_per_user, 1.0f, ','));
            textView2.setText(dd.Q0(sb2.toString(), 0.75f, new zq[1]));
            frameLayout3.addView(textView2, gb1.g(15.66f, -2));
            frameLayout2.addView(frameLayout3, gb1.h(-2, -2.0f, 81, 0.0f, 0.0f, 0.0f, -4.0f));
        } else {
            jArr = jArr2;
        }
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(R.drawable.msg_arrow_avatar);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setTranslationX(-AndroidUtilities.dp(2.0825f));
        int i14 = y6.E6;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        f7.t(imageView, i14, u6Var, mode);
        frameLayout.addView(imageView, gb1.h(36, 60.0f, 17, 60.0f, 0.0f, 60.0f, 0.0f));
        FrameLayout frameLayout4 = new FrameLayout(context);
        frameLayout4.setClipToPadding(false);
        frameLayout4.setClipChildren(false);
        frameLayout.addView(frameLayout4, gb1.h(60, 60.0f, 21, 0.0f, 0.0f, 5.66f, 0.0f));
        y9 y9Var3 = new y9(context);
        y9Var3.setRoundRadius(AndroidUtilities.dp(30.0f));
        frameLayout4.addView(y9Var3, gb1.i(60, 60, 119));
        FrameLayout frameLayout5 = new FrameLayout(context);
        int dp3 = AndroidUtilities.dp(10.0f);
        int i15 = y6.h5;
        Drawable c04 = y6.c0(dp3, y6.w0(i15, u6Var));
        b7 N3 = f7.N(i15);
        frameLayout5.setBackground(c04);
        f7.k(frameLayout5, c04, N3, null, u6Var);
        frameLayout5.setPadding(AndroidUtilities.dp(1.33f), AndroidUtilities.dp(1.33f), AndroidUtilities.dp(1.33f), AndroidUtilities.dp(1.33f));
        TextView textView3 = new TextView(context);
        int dp4 = AndroidUtilities.dp(10.0f);
        int i16 = y6.Oh;
        Drawable c05 = y6.c0(dp4, y6.w0(i16, u6Var));
        b7 N4 = f7.N(i16);
        textView3.setBackground(c05);
        f7.k(textView3, c05, N4, null, u6Var);
        textView3.setTypeface(AndroidUtilities.bold());
        textView3.setTextSize(1, 10.0f);
        textView3.setPadding(AndroidUtilities.dp(5.33f), 0, AndroidUtilities.dp(5.33f), 0);
        textView3.setTextColor(-1);
        textView3.setGravity(17);
        SpannableString spannableString = new SpannableString("s " + ((Object) k.F0(starrefprogram.commission_permille)));
        zq zqVar = new zq(R.drawable.msg_link_1, 0);
        zqVar.setScale(0.65f, 0.65f);
        zqVar.spaceScaleX = 0.7f;
        zqVar.translate(AndroidUtilities.dp(-2.0f), AndroidUtilities.dp(0.0f));
        spannableString.setSpan(zqVar, 0, 1, 33);
        textView3.setText(spannableString);
        frameLayout5.addView(textView3, gb1.g(15.66f, -2));
        frameLayout4.addView(frameLayout5, gb1.h(-2, -2.0f, 81, 0.0f, 0.0f, 0.0f, -4.0f));
        d.addView(frameLayout, gb1.x(-2, -2, 1, 0, 0, 0, 0));
        TextView textView4 = new TextView(context);
        int i17 = y6.G6;
        f7.V(textView4, i17, u6Var);
        textView4.setTextSize(1, 20.0f);
        textView4.setGravity(17);
        textView4.setText(LocaleController.getString(R.string.ChannelAffiliateProgramJoinTitle));
        textView4.setTypeface(AndroidUtilities.bold());
        d.addView(textView4, gb1.o(0.0f, 21.0f, 0.0f, 9.0f, -1, -2));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        int dp5 = AndroidUtilities.dp(28.0f);
        int i18 = y6.a7;
        ShapeDrawable c06 = y6.c0(dp5, y6.w0(i18, u6Var));
        b7 N5 = f7.N(i18);
        linearLayout2.setBackground(c06);
        f7.k(linearLayout2, c06, N5, null, u6Var);
        TextView textView5 = new TextView(context);
        textView5.setTextSize(1, 13.0f);
        f7.V(textView5, i17, u6Var);
        textView5.setText(LocaleController.formatString(R.string.ChannelAffiliateProgramJoinViewBot, DialogObject.getName(i10, starrefprogram.bot_id)));
        linearLayout2.addView(textView5, gb1.x(-2, -2, 16, 11, 0, 0, 0));
        ImageView imageView2 = new ImageView(context);
        imageView2.setScaleType(scaleType);
        int i19 = y6.r5;
        f7.t(imageView2, i19, u6Var, mode);
        imageView2.setImageResource(R.drawable.settings_arrow);
        imageView2.setScaleX(1.2f);
        imageView2.setScaleY(1.2f);
        linearLayout2.addView(imageView2, gb1.x(-2, -2, 16, 5, 0, 8, 0));
        d.addView(linearLayout2, gb1.x(-2, 28, 1, 4, 0, 4, 0));
        gb1.b(linearLayout2);
        TextView textView6 = new TextView(context);
        f7.V(textView6, i17, u6Var);
        textView6.setTextSize(1, 14.0f);
        textView6.setGravity(17);
        NotificationCenter.listenEmojiLoading(textView6);
        SpannableString spannableString2 = new SpannableString(dd.J0(starrefprogram.daily_revenue_per_user, 0.95f, ','));
        spannableString2.setSpan(new q61(AndroidUtilities.bold()), 0, spannableString2.length(), 33);
        textView6.setText(dd.W0(false, LocaleController.formatSpannable(R.string.ChannelAffiliateProgramJoinRevenue, spannableString2), 0.725f, null));
        TextView e = vh.e(d, textView6, gb1.o(0.0f, 10.0f, 0.0f, 20.0f, -1, -2), context);
        f7.V(e, i17, u6Var);
        e.setTextSize(1, 14.0f);
        e.setGravity(17);
        NotificationCenter.listenEmojiLoading(e);
        int i20 = R.string.ChannelAffiliateProgramJoinText;
        String userName = UserObject.getUserName(user);
        String F0 = k.F0(starrefprogram.commission_permille);
        int i21 = starrefprogram.duration_months;
        if (i21 <= 0) {
            formatPluralString = LocaleController.getString(R.string.ChannelAffiliateProgramJoinText_Lifetime);
            str = userName;
        } else {
            if (i21 < 12 || i21 % 12 != 0) {
                str = userName;
                str2 = F0;
                r15 = 0;
                formatPluralString = LocaleController.formatPluralString("ChannelAffiliateProgramJoinText_Months", i21, new Object[0]);
                Object[] objArr = new Object[3];
                objArr[r15] = str;
                objArr[1] = str2;
                objArr[2] = formatPluralString;
                e.setText(Emoji.replaceEmoji(AndroidUtilities.replaceTags(LocaleController.formatString(i20, objArr)), e.getPaint().getFontMetricsInt(), r15));
                d.addView(e, gb1.o(0.0f, 0.0f, 0.0f, 22.0f, -1, -2));
                if (j10 < 0) {
                    TextView textView7 = new TextView(context);
                    f7.V(textView7, i17, u6Var);
                    textView7.setTextSize(1, 14.0f);
                    textView7.setGravity(17);
                    textView7.setText(LocaleController.getString(R.string.ChannelAffiliateProgramLinkSendTo));
                    d.addView(textView7, gb1.o(20.0f, 0.0f, 20.0f, 0.0f, -1, -2));
                    LinearLayout linearLayout3 = new LinearLayout(context);
                    linearLayout3.setOrientation(0);
                    ShapeDrawable c07 = y6.c0(AndroidUtilities.dp(28.0f), y6.w0(i18, u6Var));
                    b7 N6 = f7.N(i18);
                    linearLayout3.setBackground(c07);
                    f7.k(linearLayout3, c07, N6, null, u6Var);
                    int dp6 = AndroidUtilities.dp(28.0f);
                    int w02 = y6.w0(i18, u6Var);
                    int w03 = y6.w0(i18, u6Var);
                    int i22 = y6.i6;
                    int v = y6.v(w03, y6.w0(i22, u6Var));
                    org.telegram.ui.Cells.y j02 = y6.j0(dp6, dp6, dp6, dp6, w02, v, v);
                    b7 N7 = f7.N(i18);
                    b7 q5 = f7.q(i18, i22);
                    linearLayout3.setBackground(j02);
                    f7.k(linearLayout3, j02, N7, q5, u6Var);
                    y9Var = new y9(context);
                    y9Var.setRoundRadius(AndroidUtilities.dp(14.0f));
                    linearLayout3.addView(y9Var, gb1.r(28, 28));
                    TextView textView8 = new TextView(context);
                    textView8.setTextSize(1, 13.0f);
                    f7.V(textView8, i17, u6Var);
                    linearLayout3.addView(textView8, gb1.x(-2, -2, 16, 6, 0, 0, 0));
                    ImageView imageView3 = new ImageView(context);
                    imageView3.setScaleType(scaleType);
                    f7.t(imageView3, i19, u6Var, mode);
                    imageView3.setImageResource(R.drawable.arrows_select);
                    linearLayout3.addView(imageView3, gb1.x(-2, -2, 16, 2, 0, 5, 0));
                    d.addView(linearLayout3, gb1.x(-2, 28, 1, 0, 11, 0, 20));
                    linearLayout = linearLayout3;
                    textView = textView8;
                } else {
                    y9Var = null;
                    textView = null;
                    linearLayout = null;
                }
                fi.d dVar = new fi.d(context, u6Var, true);
                dVar.i(LocaleController.getString(R.string.ChannelAffiliateProgramJoinButton), false, true);
                d.addView(dVar, gb1.r(-1, 48));
                z90 z90Var = new z90(context, u6Var);
                z90Var.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.ChannelAffiliateProgramJoinButtonInfo), new ra(context, 8)));
                z90Var.setGravity(17);
                z90Var.setTextSize(1, 12.0f);
                f7.V(z90Var, y6.B6, u6Var);
                f7.H(z90Var, y6.gc, u6Var);
                d.addView(z90Var, gb1.x(-1, -2, 49, 14, 14, 14, 6));
                i11.customView = d;
                final int i23 = 1;
                y9Var2.setOnClickListener(new View.OnClickListener() { // from class: hi.n3
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i23) {
                            case 0:
                                org.telegram.ui.ActionBar.r2 U = LaunchActivity.U();
                                if (U != null) {
                                    org.telegram.ui.ActionBar.k3 k3Var = i11;
                                    k3Var.dismiss();
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("user_id", starrefprogram.bot_id);
                                    U.presentFragment(new y3(bundle, k3Var));
                                    break;
                                }
                                break;
                            default:
                                org.telegram.ui.ActionBar.r2 U2 = LaunchActivity.U();
                                if (U2 != null) {
                                    i11.dismiss();
                                    U2.presentFragment(ProfileActivity.t4(starrefprogram.bot_id));
                                    break;
                                }
                                break;
                        }
                    }
                });
                dVar.setOnClickListener(new u3(dVar, jArr, i10, starrefprogram, i11, j10, z10, context, u6Var, user));
                i11.setOnDismissListener(new fi.e1(7));
                sb sbVar = new sb(jArr, i10, y9Var3, y9Var, textView, 1);
                sbVar.run();
                if (linearLayout != null) {
                    bi.m0.g(i10).n();
                    bi.m0.g(i10).o();
                    LinearLayout linearLayout4 = linearLayout;
                    linearLayout4.setOnClickListener(new mb(i10, i11, u6Var, linearLayout4, jArr, sbVar));
                }
                final int i24 = 0;
                linearLayout2.setOnClickListener(new View.OnClickListener() { // from class: hi.n3
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i24) {
                            case 0:
                                org.telegram.ui.ActionBar.r2 U = LaunchActivity.U();
                                if (U != null) {
                                    org.telegram.ui.ActionBar.k3 k3Var = i11;
                                    k3Var.dismiss();
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("user_id", starrefprogram.bot_id);
                                    U.presentFragment(new y3(bundle, k3Var));
                                    break;
                                }
                                break;
                            default:
                                org.telegram.ui.ActionBar.r2 U2 = LaunchActivity.U();
                                if (U2 != null) {
                                    i11.dismiss();
                                    U2.presentFragment(ProfileActivity.t4(starrefprogram.bot_id));
                                    break;
                                }
                                break;
                        }
                    }
                });
                i11.fixNavigationBarKey(i15);
                i11.show();
            }
            str = userName;
            formatPluralString = LocaleController.formatPluralString("ChannelAffiliateProgramJoinText_Years", i21 / 12, new Object[0]);
        }
        str2 = F0;
        r15 = 0;
        Object[] objArr2 = new Object[3];
        objArr2[r15] = str;
        objArr2[1] = str2;
        objArr2[2] = formatPluralString;
        e.setText(Emoji.replaceEmoji(AndroidUtilities.replaceTags(LocaleController.formatString(i20, objArr2)), e.getPaint().getFontMetricsInt(), r15));
        d.addView(e, gb1.o(0.0f, 0.0f, 0.0f, 22.0f, -1, -2));
        if (j10 < 0) {
        }
        fi.d dVar2 = new fi.d(context, u6Var, true);
        dVar2.i(LocaleController.getString(R.string.ChannelAffiliateProgramJoinButton), false, true);
        d.addView(dVar2, gb1.r(-1, 48));
        z90 z90Var2 = new z90(context, u6Var);
        z90Var2.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.ChannelAffiliateProgramJoinButtonInfo), new ra(context, 8)));
        z90Var2.setGravity(17);
        z90Var2.setTextSize(1, 12.0f);
        f7.V(z90Var2, y6.B6, u6Var);
        f7.H(z90Var2, y6.gc, u6Var);
        d.addView(z90Var2, gb1.x(-1, -2, 49, 14, 14, 14, 6));
        i11.customView = d;
        final int i232 = 1;
        y9Var2.setOnClickListener(new View.OnClickListener() { // from class: hi.n3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i232) {
                    case 0:
                        org.telegram.ui.ActionBar.r2 U = LaunchActivity.U();
                        if (U != null) {
                            org.telegram.ui.ActionBar.k3 k3Var = i11;
                            k3Var.dismiss();
                            Bundle bundle = new Bundle();
                            bundle.putLong("user_id", starrefprogram.bot_id);
                            U.presentFragment(new y3(bundle, k3Var));
                            break;
                        }
                        break;
                    default:
                        org.telegram.ui.ActionBar.r2 U2 = LaunchActivity.U();
                        if (U2 != null) {
                            i11.dismiss();
                            U2.presentFragment(ProfileActivity.t4(starrefprogram.bot_id));
                            break;
                        }
                        break;
                }
            }
        });
        dVar2.setOnClickListener(new u3(dVar2, jArr, i10, starrefprogram, i11, j10, z10, context, u6Var, user));
        i11.setOnDismissListener(new fi.e1(7));
        sb sbVar2 = new sb(jArr, i10, y9Var3, y9Var, textView, 1);
        sbVar2.run();
        if (linearLayout != null) {
        }
        final int i242 = 0;
        linearLayout2.setOnClickListener(new View.OnClickListener() { // from class: hi.n3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i242) {
                    case 0:
                        org.telegram.ui.ActionBar.r2 U = LaunchActivity.U();
                        if (U != null) {
                            org.telegram.ui.ActionBar.k3 k3Var = i11;
                            k3Var.dismiss();
                            Bundle bundle = new Bundle();
                            bundle.putLong("user_id", starrefprogram.bot_id);
                            U.presentFragment(new y3(bundle, k3Var));
                            break;
                        }
                        break;
                    default:
                        org.telegram.ui.ActionBar.r2 U2 = LaunchActivity.U();
                        if (U2 != null) {
                            i11.dismiss();
                            U2.presentFragment(ProfileActivity.t4(starrefprogram.bot_id));
                            break;
                        }
                        break;
                }
            }
        });
        i11.fixNavigationBarKey(i15);
        i11.show();
    }

    public static org.telegram.ui.ActionBar.k3 G0(Context context, int i10, TL_payments.connectedBotStarRef connectedbotstarref, long j10, u6 u6Var) {
        ImageView.ScaleType scaleType;
        LinearLayout linearLayout;
        int i11;
        org.telegram.ui.ActionBar.k3 k3Var;
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
        org.telegram.ui.ActionBar.k3 i15 = vh.i(1, context, u6Var, false);
        TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(connectedbotstarref.bot_id));
        LinearLayout d = vh.d(context, 1);
        d.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f));
        d.setClipChildren(false);
        d.setClipToPadding(false);
        FrameLayout frameLayout = new FrameLayout(context);
        View view = new View(context);
        Drawable K = y6.K(AndroidUtilities.dp(40.0f), y6.w0(connectedbotstarref.revoked ? y6.wj : y6.Oh, u6Var));
        b7 N = f7.N(connectedbotstarref.revoked ? y6.wj : y6.Oh);
        view.setBackground(K);
        f7.k(view, K, N, null, u6Var);
        frameLayout.addView(view, gb1.h(80, 80.0f, 49, 0.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        ImageView.ScaleType scaleType2 = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType2);
        imageView.setImageResource(connectedbotstarref.revoked ? R.drawable.msg_link_2 : R.drawable.msg_limit_links);
        imageView.setScaleX(connectedbotstarref.revoked ? 2.0f : 1.8f);
        imageView.setScaleY(connectedbotstarref.revoked ? 2.0f : 1.8f);
        frameLayout.addView(imageView, gb1.h(80, 80.0f, 49, 0.0f, 0.0f, 0.0f, 0.0f));
        if (connectedbotstarref.participants > 0) {
            FrameLayout frameLayout2 = new FrameLayout(context);
            int dp = AndroidUtilities.dp(50.0f);
            int i16 = y6.h5;
            Drawable c02 = y6.c0(dp, y6.w0(i16, u6Var));
            b7 N2 = f7.N(i16);
            frameLayout2.setBackground(c02);
            f7.k(frameLayout2, c02, N2, null, u6Var);
            frameLayout.addView(frameLayout2, gb1.h(-2, -2.0f, 49, 0.0f, 66.0f, 0.0f, 0.0f));
            TextView textView = new TextView(context);
            textView.setTypeface(AndroidUtilities.bold());
            textView.setTextSize(1, 12.0f);
            Drawable c03 = y6.c0(AndroidUtilities.dp(9.5f), y6.w0(connectedbotstarref.revoked ? y6.wj : y6.uj, u6Var));
            b7 N3 = f7.N(connectedbotstarref.revoked ? y6.wj : y6.uj);
            textView.setBackground(c03);
            f7.k(textView, c03, N3, null, u6Var);
            textView.setTextColor(-1);
            textView.setPadding(AndroidUtilities.dp(6.66f), 0, AndroidUtilities.dp(6.66f), 0);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) "s ");
            zq zqVar = new zq(R.drawable.mini_reply_user, 0);
            zqVar.setScale(0.937f, 0.937f);
            zqVar.translate(-AndroidUtilities.dp(1.33f), AndroidUtilities.dp(1.0f));
            zqVar.spaceScaleX = 0.8f;
            scaleType = scaleType2;
            spannableStringBuilder.setSpan(zqVar, 0, 1, 33);
            spannableStringBuilder.append((CharSequence) String.valueOf(connectedbotstarref.participants));
            textView.setText(spannableStringBuilder);
            textView.setGravity(17);
            frameLayout2.addView(textView, gb1.h(-1, 19.0f, 119, 1.33f, 1.33f, 1.33f, 1.33f));
        } else {
            scaleType = scaleType2;
        }
        d.addView(frameLayout, gb1.x(-2, -2, 1, 0, 0, 0, 0));
        TextView textView2 = new TextView(context);
        int i17 = y6.G6;
        f7.V(textView2, i17, u6Var);
        textView2.setTextSize(1, 20.0f);
        textView2.setGravity(17);
        textView2.setText(LocaleController.getString(R.string.ChannelAffiliateProgramLinkTitle));
        textView2.setTypeface(AndroidUtilities.bold());
        d.addView(textView2, gb1.o(20.0f, 16.0f, 20.0f, 9.33f, -1, -2));
        LinearLayout linearLayout3 = new LinearLayout(context);
        linearLayout3.setOrientation(0);
        int dp2 = AndroidUtilities.dp(28.0f);
        int i18 = y6.a7;
        ShapeDrawable c04 = y6.c0(dp2, y6.w0(i18, u6Var));
        b7 N4 = f7.N(i18);
        linearLayout3.setBackground(c04);
        f7.k(linearLayout3, c04, N4, null, u6Var);
        y9 y9Var = new y9(context);
        y9Var.setRoundRadius(AndroidUtilities.dp(14.0f));
        j9 j9Var = new j9((u6) null);
        linearLayout3.addView(y9Var, gb1.r(28, 28));
        TextView textView3 = new TextView(context);
        textView3.setTextSize(1, 13.0f);
        f7.V(textView3, i17, u6Var);
        textView3.setText(DialogObject.getName(i10, connectedbotstarref.bot_id));
        j9Var.r(user);
        y9Var.f(user, j9Var);
        linearLayout3.addView(textView3, gb1.x(-2, -2, 16, 6, 0, 0, 0));
        ImageView imageView2 = new ImageView(context);
        ImageView.ScaleType scaleType3 = scaleType;
        imageView2.setScaleType(scaleType3);
        int i19 = y6.r5;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        f7.t(imageView2, i19, u6Var, mode);
        imageView2.setImageResource(R.drawable.settings_arrow);
        imageView2.setScaleX(1.2f);
        imageView2.setScaleY(1.2f);
        linearLayout3.addView(imageView2, gb1.x(-2, -2, 16, 5, 0, 8, 0));
        d.addView(linearLayout3, gb1.x(-2, 28, 1, 4, 0, 4, 0));
        gb1.b(linearLayout3);
        TextView textView4 = new TextView(context);
        f7.V(textView4, i17, u6Var);
        textView4.setTextSize(1, 14.0f);
        textView4.setGravity(17);
        if (connectedbotstarref.revoked) {
            org.telegram.messenger.t.n(R.string.ChannelAffiliateProgramLinkTextRevoked, textView4);
            i11 = i19;
            k3Var = i15;
            linearLayout = linearLayout3;
        } else {
            linearLayout = linearLayout3;
            if (j10 < 0) {
                int i20 = R.string.ChannelAffiliateProgramLinkTextChannel;
                k3Var = i15;
                String F0 = k.F0(connectedbotstarref.commission_permille);
                String userName = UserObject.getUserName(user);
                int i21 = connectedbotstarref.duration_months;
                if (i21 <= 0) {
                    formatPluralString2 = LocaleController.getString(R.string.ChannelAffiliateProgramJoinText_Lifetime);
                    i11 = i19;
                    c11 = 0;
                } else {
                    i11 = i19;
                    if (i21 < 12 || i21 % 12 != 0) {
                        c11 = 0;
                        formatPluralString2 = LocaleController.formatPluralString("ChannelAffiliateProgramJoinText_Months", i21, new Object[0]);
                    } else {
                        c11 = 0;
                        formatPluralString2 = LocaleController.formatPluralString("ChannelAffiliateProgramJoinText_Years", i21 / 12, new Object[0]);
                    }
                }
                Object[] objArr = new Object[3];
                objArr[c11] = F0;
                objArr[1] = userName;
                objArr[2] = formatPluralString2;
                vh.o(i20, objArr, textView4);
            } else {
                i11 = i19;
                k3Var = i15;
                int i22 = R.string.ChannelAffiliateProgramLinkTextUser;
                String F02 = k.F0(connectedbotstarref.commission_permille);
                String userName2 = UserObject.getUserName(user);
                int i23 = connectedbotstarref.duration_months;
                if (i23 <= 0) {
                    formatPluralString = LocaleController.getString(R.string.ChannelAffiliateProgramJoinText_Lifetime);
                    str = userName2;
                    i12 = 3;
                    c10 = 0;
                } else {
                    str = userName2;
                    if (i23 < 12 || i23 % 12 != 0) {
                        c10 = 0;
                        formatPluralString = LocaleController.formatPluralString("ChannelAffiliateProgramJoinText_Months", i23, new Object[0]);
                    } else {
                        c10 = 0;
                        formatPluralString = LocaleController.formatPluralString("ChannelAffiliateProgramJoinText_Years", i23 / 12, new Object[0]);
                    }
                    i12 = 3;
                }
                Object[] objArr2 = new Object[i12];
                objArr2[c10] = F02;
                objArr2[1] = str;
                objArr2[2] = formatPluralString;
                vh.o(i22, objArr2, textView4);
            }
        }
        d.addView(textView4, gb1.o(20.0f, 19.0f, 20.0f, 18.0f, -1, -2));
        if (connectedbotstarref.revoked) {
            i13 = i18;
            linearLayout2 = null;
        } else {
            TextView textView5 = new TextView(context);
            f7.V(textView5, i17, u6Var);
            textView5.setTextSize(1, 14.0f);
            textView5.setGravity(17);
            textView5.setText(LocaleController.getString(R.string.ChannelAffiliateProgramLinkSendTo));
            d.addView(textView5, gb1.o(20.0f, 0.0f, 20.0f, 0.0f, -1, -2));
            LinearLayout linearLayout4 = new LinearLayout(context);
            linearLayout4.setOrientation(0);
            Drawable c05 = y6.c0(AndroidUtilities.dp(28.0f), y6.w0(i18, u6Var));
            b7 N5 = f7.N(i18);
            linearLayout4.setBackground(c05);
            f7.k(linearLayout4, c05, N5, null, u6Var);
            y9 y9Var2 = new y9(context);
            y9Var2.setRoundRadius(AndroidUtilities.dp(14.0f));
            j9 j9Var2 = new j9((u6) null);
            linearLayout4.addView(y9Var2, gb1.r(28, 28));
            TextView textView6 = new TextView(context);
            textView6.setTextSize(1, 13.0f);
            f7.V(textView6, i17, u6Var);
            if (j10 >= 0) {
                TLRPC.User user2 = MessagesController.getInstance(i10).getUser(Long.valueOf(j10));
                j9Var2.r(user2);
                y9Var2.f(user2, j9Var2);
                textView6.setText(UserObject.getUserName(user2));
                i13 = i18;
            } else {
                i13 = i18;
                TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-j10));
                j9Var2.q(chat);
                y9Var2.f(chat, j9Var2);
                textView6.setText(chat == null ? "" : chat.title);
            }
            linearLayout4.addView(textView6, gb1.x(-2, -2, 16, 6, 0, 0, 0));
            ImageView imageView3 = new ImageView(context);
            imageView3.setScaleType(scaleType3);
            f7.t(imageView3, i11, u6Var, mode);
            imageView3.setImageResource(R.drawable.arrows_select);
            linearLayout4.addView(imageView3, gb1.x(-2, -2, 16, 2, 0, 5, 0));
            d.addView(linearLayout4, gb1.x(-2, 28, 1, 0, 9, 0, 22));
            linearLayout2 = linearLayout4;
        }
        TextView textView7 = new TextView(context);
        textView7.setTextSize(1, 16.0f);
        textView7.setGravity(17);
        f7.V(textView7, i17, u6Var);
        int dp3 = AndroidUtilities.dp(8.0f);
        int i24 = i13;
        int w02 = y6.w0(i24, u6Var);
        int w03 = y6.w0(i24, u6Var);
        int i25 = y6.i6;
        int v = y6.v(w03, y6.w0(i25, u6Var));
        org.telegram.ui.Cells.y j02 = y6.j0(dp3, dp3, dp3, dp3, w02, v, v);
        b7 N6 = f7.N(i24);
        b7 q5 = f7.q(i24, i25);
        textView7.setBackground(j02);
        f7.k(textView7, j02, N6, q5, u6Var);
        textView7.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(14.66f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(14.66f));
        String str2 = connectedbotstarref.url;
        textView7.setText((str2 == null || !str2.startsWith("https://")) ? connectedbotstarref.url : connectedbotstarref.url.substring(8));
        d.addView(textView7, gb1.h(-1, -2.0f, 7, 0.0f, 0.0f, 0.0f, 12.0f));
        fi.d dVar = new fi.d(context, u6Var, true);
        if (connectedbotstarref.revoked) {
            dVar.i(LocaleController.getString(R.string.ChannelAffiliateProgramLinkRejoin), false, true);
        } else {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            spannableStringBuilder2.append((CharSequence) "c ");
            spannableStringBuilder2.setSpan(new zq(R.drawable.msg_copy_filled, 0), 0, 1, 33);
            spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.ChannelAffiliateProgramLinkCopy));
            dVar.i(spannableStringBuilder2, false, true);
        }
        d.addView(dVar, gb1.r(-1, 48));
        z90 z90Var = new z90(context, u6Var);
        long j11 = connectedbotstarref.participants;
        if (j11 <= 0) {
            i14 = 1;
            formatPluralString3 = LocaleController.formatString(R.string.ChannelAffiliateProgramLinkOpenedNone, UserObject.getUserName(user));
        } else {
            i14 = 1;
            formatPluralString3 = LocaleController.formatPluralString("ChannelAffiliateProgramLinkOpened", (int) j11, UserObject.getUserName(user));
        }
        z90Var.setText(formatPluralString3);
        z90Var.setGravity(17);
        z90Var.setTextSize(i14, 12.0f);
        f7.V(z90Var, y6.B6, u6Var);
        f7.H(z90Var, y6.gc, u6Var);
        d.addView(z90Var, gb1.x(-1, -2, 49, 14, 12, 14, 2));
        org.telegram.ui.ActionBar.k3 k3Var2 = k3Var;
        k3Var2.customView = d;
        ai.e0 e0Var = new ai.e0(connectedbotstarref, k3Var2, u6Var, user, 17);
        if (!connectedbotstarref.revoked) {
            textView7.setOnClickListener(new ai.s(e0Var, 28));
        }
        dVar.setOnClickListener(new t3(connectedbotstarref, i10, k3Var2, context, j10, u6Var, e0Var));
        k3Var2.setOnDismissListener(new fi.e1(7));
        if (linearLayout2 != null) {
            bi.m0.g(i10).n();
            bi.m0.g(i10).o();
            LinearLayout linearLayout5 = linearLayout2;
            connectedbotstarref2 = connectedbotstarref;
            linearLayout5.setOnClickListener(new t3(i10, k3Var2, u6Var, linearLayout5, j10, context, connectedbotstarref));
        } else {
            connectedbotstarref2 = connectedbotstarref;
        }
        linearLayout.setOnClickListener(new bi.q(19, k3Var2, connectedbotstarref2));
        k3Var2.fixNavigationBarKey(y6.h5);
        org.telegram.ui.ActionBar.r2 U = LaunchActivity.U();
        if (!AndroidUtilities.isTablet() && U != null && !AndroidUtilities.hasDialogOnTop(U)) {
            k3Var2.makeAttached(U);
        }
        k3Var2.show();
        return k3Var2;
    }

    public static void w0(d4 d4Var, Context context, TLRPC.User user, TL_payments.connectedBotStarRef connectedbotstarref) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, d4Var.resourceProvider);
        String string = LocaleController.getString(R.string.LeaveAffiliateLink);
        org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.a;
        e2Var.R = string;
        e2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.LeaveAffiliateLinkAlert, UserObject.getUserName(user)));
        alertDialog$Builder.k(LocaleController.getString(R.string.LeaveAffiliateLinkButton), new ai.f0(15, d4Var, connectedbotstarref));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        alertDialog$Builder.d(-1);
        alertDialog$Builder.p();
    }

    public static void x0(d4 d4Var, TL_payments.connectedBotStarRef connectedbotstarref) {
        org.telegram.ui.ActionBar.e2 e2Var = new org.telegram.ui.ActionBar.e2(d4Var.getParentActivity(), 3, null);
        e2Var.r(200L);
        TL_payments.editConnectedStarRefBot editconnectedstarrefbot = new TL_payments.editConnectedStarRefBot();
        editconnectedstarrefbot.link = connectedbotstarref.url;
        editconnectedstarrefbot.peer = MessagesController.getInstance(d4Var.currentAccount).getInputPeer(d4Var.R);
        editconnectedstarrefbot.revoked = true;
        d4Var.getConnectionsManager().sendRequest(editconnectedstarrefbot, new bi.j(17, d4Var, e2Var));
    }

    public static /* synthetic */ void y0(d4 d4Var, Context context, int i10) {
        v3 v3Var = d4Var.V;
        if (v3Var == null) {
            return;
        }
        Object obj = v3Var.G(i10).G;
        if (obj instanceof TL_payments.starRefProgram) {
            F0(context, d4Var.currentAccount, (TL_payments.starRefProgram) obj, d4Var.R, d4Var.resourceProvider, false);
        } else if (obj instanceof TL_payments.connectedBotStarRef) {
            G0(context, d4Var.currentAccount, (TL_payments.connectedBotStarRef) obj, d4Var.R, d4Var.resourceProvider);
        }
    }

    public static void z0(d4 d4Var, TLObject tLObject, org.telegram.ui.ActionBar.e2 e2Var) {
        long j10 = d4Var.R;
        if (tLObject instanceof TL_payments.connectedStarRefBots) {
            TL_payments.connectedStarRefBots connectedstarrefbots = (TL_payments.connectedStarRefBots) tLObject;
            bi.j0 d = bi.m0.g(d4Var.currentAccount).d(j10);
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
            bi.k0 e = bi.m0.g(d4Var.currentAccount).e(j10);
            e.c = 0;
            e.d = false;
            e.i = false;
            e.f = 0L;
            e.j = null;
            e.h = false;
            e.a();
            d4Var.V.O(true);
        }
        e2Var.dismiss();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x01a5 A[LOOP:0: B:20:0x019f->B:22:0x01a5, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void E0(ArrayList arrayList, j71 j71Var) {
        SpannableString spannableString;
        if (getParentActivity() == null) {
            return;
        }
        z10 z10Var = (z10) k0(getParentActivity());
        t61 t61Var = new t61(-2);
        t61Var.c = z10Var;
        arrayList.add(t61Var);
        arrayList.add(i.a(R.drawable.menu_feature_reliable, LocaleController.getString(R.string.ChannelAffiliateProgramFeature1Title), LocaleController.getString(R.string.ChannelAffiliateProgramFeature1)));
        arrayList.add(i.a(R.drawable.menu_feature_transparent, LocaleController.getString(R.string.ChannelAffiliateProgramFeature2Title), LocaleController.getString(R.string.ChannelAffiliateProgramFeature2)));
        arrayList.add(i.a(R.drawable.menu_feature_simple, LocaleController.getString(R.string.ChannelAffiliateProgramFeature3Title), LocaleController.getString(R.string.ChannelAffiliateProgramFeature3)));
        arrayList.add(t61.B(1, null));
        bi.m0 g7 = bi.m0.g(this.currentAccount);
        long j10 = this.R;
        bi.j0 d = g7.d(j10);
        ArrayList arrayList2 = d.e;
        if (!arrayList2.isEmpty() || d.c > 0) {
            ic.a.p(R.string.ChannelAffiliateProgramMyPrograms, arrayList);
            for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) arrayList2.get(i10);
                int i11 = z3.a;
                t61 K = t61.K(z3.class);
                K.G = connectedbotstarref;
                K.r = true;
                arrayList.add(K);
            }
            if (!d.d || d.g) {
                arrayList.add(t61.p(29));
                arrayList.add(t61.p(29));
                arrayList.add(t61.p(29));
            }
            arrayList.add(t61.B(2, null));
        }
        bi.k0 e = bi.m0.g(this.currentAccount).e(j10);
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
                int i13 = b4.a;
                t61 K2 = t61.K(b4.class);
                K2.l = string;
                K2.m = spannableStringBuilder;
                arrayList.add(K2);
                for (int i14 = 0; i14 < arrayList3.size(); i14++) {
                    Object obj = arrayList3.get(i14);
                    int i15 = z3.a;
                    t61 K3 = t61.K(z3.class);
                    K3.G = obj;
                    K3.r = true;
                    arrayList.add(K3);
                }
                if (e.d || e.h) {
                    arrayList.add(t61.p(29));
                    arrayList.add(t61.p(29));
                    arrayList.add(t61.p(29));
                }
                arrayList.add(t61.B(3, null));
            }
            zq zqVar = new zq(R.drawable.arrow_more, 0);
            zqVar.useLinkPaintColor = true;
            zqVar.setScale(0.6f, 0.6f);
            spannableString.setSpan(zqVar, spannableString.length() - 1, spannableString.length(), 33);
            spannableString.setSpan(new x3(this, i12, bi.m0.g(this.currentAccount).e(j10)), 0, spannableString.length(), 33);
            spannableStringBuilder.append((CharSequence) spannableString);
            int i132 = b4.a;
            t61 K22 = t61.K(b4.class);
            K22.l = string;
            K22.m = spannableStringBuilder;
            arrayList.add(K22);
            while (i14 < arrayList3.size()) {
            }
            if (e.d) {
            }
            arrayList.add(t61.p(29));
            arrayList.add(t61.p(29));
            arrayList.add(t61.p(29));
            arrayList.add(t61.B(3, null));
        }
        arrayList.add(t61.k(this.U));
    }

    @Override // org.telegram.ui.d20, org.telegram.ui.ActionBar.r2
    public final View createView(Context context) {
        this.G = false;
        this.E = AndroidUtilities.dp(238.0f);
        vn vnVar = new vn(context, 3);
        this.U = vnVar;
        f7.i(y6.i5, vnVar, null);
        super.createView(context);
        this.S = new FrameLayout(context);
        ug.n nVar = new ug.n(context, 1, 3);
        this.T = nVar;
        nVar.setImportantForAccessibility(4);
        ug.g gVar = this.T.b;
        gVar.z = y6.fk;
        gVar.A = y6.gk;
        gVar.b();
        this.T.setStarParticlesView(this.e);
        this.S.addView(this.T, gb1.h(190, 190.0f, 17, 0.0f, 32.0f, 0.0f, 12.0f));
        f0(LocaleController.getString(R.string.ChannelAffiliateProgramTitle), AndroidUtilities.replaceTags(LocaleController.getString(R.string.ChannelAffiliateProgramText)), this.S, null);
        this.c.setOnItemClickListener(new di.x4(2, this, context));
        this.c.setOnItemLongClickListener(new ai.f0(16, this, context));
        s4.l lVar = new s4.l();
        lVar.m = false;
        lVar.C = false;
        lVar.o(ds.h);
        lVar.n(350L);
        this.c.setItemAnimator(lVar);
        this.c.setOnScrollListener(new ai.b(this, 13));
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        v3 v3Var;
        int i12 = NotificationCenter.channelConnectedBotsUpdate;
        long j10 = this.R;
        if (i10 != i12) {
            if (i10 == NotificationCenter.channelSuggestedBotsUpdate && ((Long) objArr[0]).longValue() == j10 && (v3Var = this.V) != null) {
                v3Var.O(true);
                return;
            }
            return;
        }
        if (((Long) objArr[0]).longValue() == j10) {
            v3 v3Var2 = this.V;
            if (v3Var2 != null) {
                v3Var2.O(true);
            }
            bi.m0.g(this.currentAccount).d(j10).a();
        }
    }

    @Override // org.telegram.ui.d20
    public final s4.h0 g0() {
        v3 v3Var = new v3(this, this.c, getParentActivity(), this.currentAccount, this.classGuid, new e2(this, 1), getResourceProvider());
        this.V = v3Var;
        return v3Var;
    }

    @Override // org.telegram.ui.d20
    public final tg.x1 i0() {
        e eVar = new e(getParentActivity(), 1);
        eVar.c();
        return eVar;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean onFragmentCreate() {
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.channelConnectedBotsUpdate);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.channelSuggestedBotsUpdate);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.channelConnectedBotsUpdate);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.channelSuggestedBotsUpdate);
    }

    @Override // org.telegram.ui.d20, org.telegram.ui.ActionBar.r2
    public final void onPause() {
        super.onPause();
        ug.n nVar = this.T;
        if (nVar != null) {
            nVar.setPaused(true);
            this.T.setDialogVisible(true);
        }
    }

    @Override // org.telegram.ui.d20, org.telegram.ui.ActionBar.r2
    public final void onResume() {
        super.onResume();
        ug.n nVar = this.T;
        if (nVar != null) {
            nVar.setPaused(false);
            this.T.setDialogVisible(false);
        }
    }
}
