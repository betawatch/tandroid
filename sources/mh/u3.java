package mh;

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
import g7.e6;
import g7.g6;
import gh.oa;
import gh.v8;
import java.util.ArrayList;
import kh.b8;
import kh.o8;
import kh.x8;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.ll;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.an;
import org.telegram.ui.Components.eq;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.i41;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.l80;
import org.telegram.ui.Components.o9;
import org.telegram.ui.Components.x60;
import org.telegram.ui.Components.z41;
import org.telegram.ui.Components.z8;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.x10;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class u3 extends x10 implements NotificationCenter.NotificationCenterDelegate {
    public final long L;
    public FrameLayout M;
    public ag.j N;
    public an O;
    public m3 P;

    public u3(long j10) {
        this.L = j10;
        this.I = true;
        this.H = AndroidUtilities.dp(60.0f);
    }

    public static boolean A0(u3 u3Var, Context context, View view, int i9) {
        m3 m3Var = u3Var.P;
        if (m3Var != null) {
            Object obj = m3Var.G(i9).G;
            if (obj instanceof TL_payments.connectedBotStarRef) {
                TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) obj;
                TLRPC.User user = MessagesController.getInstance(u3Var.currentAccount).getUser(Long.valueOf(connectedbotstarref.bot_id));
                x60 H = x60.H(u3Var, view);
                H.l(R.drawable.msg_bot, LocaleController.getString(R.string.ProfileBotOpenApp), new o8(7, u3Var, user), user.bot_has_main_app);
                H.l(R.drawable.msg_bot, LocaleController.getString(R.string.BotWebViewOpenBot), new o8(8, u3Var, connectedbotstarref), !user.bot_has_main_app);
                H.c(R.drawable.msg_link2, LocaleController.getString(R.string.CopyLink), new ih.h3(u3Var, connectedbotstarref, user, 22), false);
                H.m(!connectedbotstarref.revoked, R.drawable.msg_leave, LocaleController.getString(R.string.LeaveAffiliateLinkButton), true, new androidx.car.app.utils.c(u3Var, context, user, connectedbotstarref, 19));
                H.V(5);
                H.Z();
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0467  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x05f4  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0613  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x054a  */
    /* JADX WARN: Type inference failed for: r14v17 */
    /* JADX WARN: Type inference failed for: r14v20, types: [boolean] */
    /* JADX WARN: Type inference failed for: r14v22 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void F0(Context context, int i9, final TL_payments.starRefProgram starrefprogram, long j10, b6 b6Var, boolean z10) {
        long[] jArr;
        float f10;
        String str;
        String str2;
        ?? r14;
        String formatPluralString;
        LinearLayout linearLayout;
        o9 o9Var;
        TextView textView;
        b6 b6Var2;
        if (starrefprogram == null || context == null) {
            return;
        }
        final org.telegram.ui.ActionBar.f3 j11 = ll.j(context, b6Var, false, false);
        long[] jArr2 = {j10};
        TLRPC.User user = MessagesController.getInstance(i9).getUser(Long.valueOf(starrefprogram.bot_id));
        LinearLayout f11 = ll.f(context, 1);
        f11.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f));
        f11.setClipChildren(false);
        f11.setClipToPadding(false);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setClipToPadding(false);
        frameLayout.setClipChildren(false);
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setClipToPadding(false);
        frameLayout2.setClipChildren(false);
        frameLayout.addView(frameLayout2, e6.d(60, 60.0f, 19, 0.0f, 0.0f, 0.0f, 0.0f));
        o9 o9Var2 = new o9(context);
        o9Var2.setRoundRadius(AndroidUtilities.dp(30.0f));
        z8 z8Var = new z8((b6) null);
        z8Var.r(user);
        o9Var2.e(user, z8Var);
        g6.a(o9Var2);
        frameLayout2.addView(o9Var2, e6.e(60, 60, 119));
        if (starrefprogram.daily_revenue_per_user.positive()) {
            FrameLayout frameLayout3 = new FrameLayout(context);
            frameLayout3.setBackground(f6.b0(AndroidUtilities.dp(10.0f), f6.v0(f6.h5, b6Var)));
            frameLayout3.setPadding(AndroidUtilities.dp(1.33f), AndroidUtilities.dp(1.33f), AndroidUtilities.dp(1.33f), AndroidUtilities.dp(1.33f));
            TextView textView2 = new TextView(context);
            textView2.setBackground(f6.b0(AndroidUtilities.dp(10.0f), f6.v0(f6.uj, b6Var)));
            textView2.setTypeface(AndroidUtilities.bold());
            textView2.setTextSize(1, 10.0f);
            f10 = 10.0f;
            textView2.setPadding(AndroidUtilities.dp(5.33f), 0, AndroidUtilities.dp(5.33f), 0);
            textView2.setTextColor(-1);
            textView2.setGravity(17);
            StringBuilder sb2 = new StringBuilder("⭐️ ");
            jArr = jArr2;
            sb2.append((Object) oa.K0(starrefprogram.daily_revenue_per_user, 1.0f, ','));
            textView2.setText(oa.R0(sb2.toString(), 0.75f, new eq[1]));
            frameLayout3.addView(textView2, e6.c(15.66f, -2));
            frameLayout2.addView(frameLayout3, e6.d(-2, -2.0f, 81, 0.0f, 0.0f, 0.0f, -4.0f));
        } else {
            jArr = jArr2;
            f10 = 10.0f;
        }
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(R.drawable.msg_arrow_avatar);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setTranslationX(-AndroidUtilities.dp(2.0825f));
        int v02 = f6.v0(f6.E6, b6Var);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView.setColorFilter(new PorterDuffColorFilter(v02, mode));
        frameLayout.addView(imageView, e6.d(36, 60.0f, 17, 60.0f, 0.0f, 60.0f, 0.0f));
        FrameLayout frameLayout4 = new FrameLayout(context);
        frameLayout4.setClipToPadding(false);
        frameLayout4.setClipChildren(false);
        frameLayout.addView(frameLayout4, e6.d(60, 60.0f, 21, 0.0f, 0.0f, 5.66f, 0.0f));
        o9 o9Var3 = new o9(context);
        o9Var3.setRoundRadius(AndroidUtilities.dp(30.0f));
        frameLayout4.addView(o9Var3, e6.e(60, 60, 119));
        FrameLayout frameLayout5 = new FrameLayout(context);
        int dp = AndroidUtilities.dp(f10);
        int i10 = f6.h5;
        frameLayout5.setBackground(f6.b0(dp, f6.v0(i10, b6Var)));
        frameLayout5.setPadding(AndroidUtilities.dp(1.33f), AndroidUtilities.dp(1.33f), AndroidUtilities.dp(1.33f), AndroidUtilities.dp(1.33f));
        TextView textView3 = new TextView(context);
        textView3.setBackground(f6.b0(AndroidUtilities.dp(f10), f6.v0(f6.Oh, b6Var)));
        textView3.setTypeface(AndroidUtilities.bold());
        textView3.setTextSize(1, 10.0f);
        textView3.setPadding(AndroidUtilities.dp(5.33f), 0, AndroidUtilities.dp(5.33f), 0);
        textView3.setTextColor(-1);
        textView3.setGravity(17);
        SpannableString spannableString = new SpannableString("s " + ((Object) l.F0(starrefprogram.commission_permille)));
        eq eqVar = new eq(R.drawable.msg_link_1, 0);
        eqVar.setScale(0.65f, 0.65f);
        eqVar.spaceScaleX = 0.7f;
        eqVar.translate(AndroidUtilities.dp(-2.0f), AndroidUtilities.dp(0.0f));
        spannableString.setSpan(eqVar, 0, 1, 33);
        textView3.setText(spannableString);
        frameLayout5.addView(textView3, e6.c(15.66f, -2));
        frameLayout4.addView(frameLayout5, e6.d(-2, -2.0f, 81, 0.0f, 0.0f, 0.0f, -4.0f));
        f11.addView(frameLayout, e6.t(-2, -2, 1, 0, 0, 0, 0));
        TextView textView4 = new TextView(context);
        int i11 = f6.G6;
        ll.n(i11, b6Var, textView4, 1, 20.0f);
        textView4.setGravity(17);
        textView4.setText(LocaleController.getString(R.string.ChannelAffiliateProgramJoinTitle));
        textView4.setTypeface(AndroidUtilities.bold());
        f11.addView(textView4, e6.k(0.0f, 21.0f, 0.0f, 9.0f, -1, -2));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        int dp2 = AndroidUtilities.dp(28.0f);
        int i12 = f6.a7;
        linearLayout2.setBackground(f6.b0(dp2, f6.v0(i12, b6Var)));
        TextView textView5 = new TextView(context);
        textView5.setTextSize(1, 13.0f);
        textView5.setTextColor(f6.v0(i11, b6Var));
        textView5.setText(LocaleController.formatString(R.string.ChannelAffiliateProgramJoinViewBot, DialogObject.getName(i9, starrefprogram.bot_id)));
        linearLayout2.addView(textView5, e6.t(-2, -2, 16, 11, 0, 0, 0));
        ImageView imageView2 = new ImageView(context);
        imageView2.setScaleType(scaleType);
        int i13 = f6.r5;
        imageView2.setColorFilter(new PorterDuffColorFilter(f6.v0(i13, b6Var), mode));
        imageView2.setImageResource(R.drawable.settings_arrow);
        imageView2.setScaleX(1.2f);
        imageView2.setScaleY(1.2f);
        linearLayout2.addView(imageView2, e6.t(-2, -2, 16, 5, 0, 8, 0));
        f11.addView(linearLayout2, e6.t(-2, 28, 1, 4, 0, 4, 0));
        g6.a(linearLayout2);
        TextView textView6 = new TextView(context);
        ll.n(i11, b6Var, textView6, 1, 14.0f);
        textView6.setGravity(17);
        NotificationCenter.listenEmojiLoading(textView6);
        SpannableString spannableString2 = new SpannableString(oa.K0(starrefprogram.daily_revenue_per_user, 0.95f, ','));
        spannableString2.setSpan(new i41(AndroidUtilities.bold()), 0, spannableString2.length(), 33);
        textView6.setText(oa.X0(false, LocaleController.formatSpannable(R.string.ChannelAffiliateProgramJoinRevenue, spannableString2), 0.725f, null));
        TextView h = j3.r0.h(f11, textView6, e6.k(0.0f, 10.0f, 0.0f, 20.0f, -1, -2), context);
        ll.n(i11, b6Var, h, 1, 14.0f);
        h.setGravity(17);
        NotificationCenter.listenEmojiLoading(h);
        int i14 = R.string.ChannelAffiliateProgramJoinText;
        String userName = UserObject.getUserName(user);
        String F0 = l.F0(starrefprogram.commission_permille);
        int i15 = starrefprogram.duration_months;
        if (i15 <= 0) {
            formatPluralString = LocaleController.getString(R.string.ChannelAffiliateProgramJoinText_Lifetime);
            str = userName;
        } else {
            if (i15 < 12 || i15 % 12 != 0) {
                str = userName;
                str2 = F0;
                r14 = 0;
                formatPluralString = LocaleController.formatPluralString("ChannelAffiliateProgramJoinText_Months", i15, new Object[0]);
                Object[] objArr = new Object[3];
                objArr[r14] = str;
                objArr[1] = str2;
                objArr[2] = formatPluralString;
                h.setText(Emoji.replaceEmoji(AndroidUtilities.replaceTags(LocaleController.formatString(i14, objArr)), h.getPaint().getFontMetricsInt(), r14));
                f11.addView(h, e6.k(0.0f, 0.0f, 0.0f, 22.0f, -1, -2));
                if (j10 < 0) {
                    TextView textView7 = new TextView(context);
                    ll.n(i11, b6Var, textView7, 1, 14.0f);
                    textView7.setGravity(17);
                    textView7.setText(LocaleController.getString(R.string.ChannelAffiliateProgramLinkSendTo));
                    f11.addView(textView7, e6.k(20.0f, 0.0f, 20.0f, 0.0f, -1, -2));
                    LinearLayout linearLayout3 = new LinearLayout(context);
                    linearLayout3.setOrientation(0);
                    linearLayout3.setBackground(f6.b0(AndroidUtilities.dp(28.0f), f6.v0(i12, b6Var)));
                    int dp3 = AndroidUtilities.dp(28.0f);
                    int v03 = f6.v0(i12, b6Var);
                    int v = f6.v(f6.v0(i12, b6Var), f6.v0(f6.i6, b6Var));
                    linearLayout3.setBackground(f6.i0(dp3, dp3, dp3, dp3, v03, v, v));
                    o9 o9Var4 = new o9(context);
                    o9Var4.setRoundRadius(AndroidUtilities.dp(14.0f));
                    linearLayout3.addView(o9Var4, e6.n(28, 28));
                    TextView textView8 = new TextView(context);
                    textView8.setTextSize(1, 13.0f);
                    textView8.setTextColor(f6.v0(i11, b6Var));
                    linearLayout3.addView(textView8, e6.t(-2, -2, 16, 6, 0, 0, 0));
                    ImageView imageView3 = new ImageView(context);
                    imageView3.setScaleType(scaleType);
                    imageView3.setColorFilter(new PorterDuffColorFilter(f6.v0(i13, b6Var), mode));
                    imageView3.setImageResource(R.drawable.arrows_select);
                    linearLayout3.addView(imageView3, e6.t(-2, -2, 16, 2, 0, 5, 0));
                    f11.addView(linearLayout3, e6.t(-2, 28, 1, 0, 11, 0, 20));
                    textView = textView8;
                    linearLayout = linearLayout3;
                    o9Var = o9Var4;
                } else {
                    linearLayout = null;
                    o9Var = null;
                    textView = null;
                }
                kh.d dVar = new kh.d(context, b6Var, true);
                dVar.g(LocaleController.getString(R.string.ChannelAffiliateProgramJoinButton), false, true);
                f11.addView(dVar, e6.n(-1, 48));
                l80 l80Var = new l80(context, b6Var);
                l80Var.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.ChannelAffiliateProgramJoinButtonInfo), new e2.f(context, 12)));
                l80Var.setGravity(17);
                l80Var.setTextSize(1, 12.0f);
                l80Var.setTextColor(f6.v0(f6.B6, b6Var));
                l80Var.setLinkTextColor(f6.v0(f6.gc, b6Var));
                f11.addView(l80Var, e6.t(-1, -2, 49, 14, 14, 14, 6));
                j11.customView = f11;
                final int i16 = 1;
                o9Var2.setOnClickListener(new View.OnClickListener() { // from class: mh.d3
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i16) {
                            case 0:
                                org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                                if (U != null) {
                                    org.telegram.ui.ActionBar.f3 f3Var = j11;
                                    f3Var.dismiss();
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("user_id", starrefprogram.bot_id);
                                    U.presentFragment(new p3(bundle, f3Var));
                                    break;
                                }
                                break;
                            default:
                                org.telegram.ui.ActionBar.o2 U2 = LaunchActivity.U();
                                if (U2 != null) {
                                    j11.dismiss();
                                    U2.presentFragment(ProfileActivity.m4(starrefprogram.bot_id));
                                    break;
                                }
                                break;
                        }
                    }
                });
                dVar.setOnClickListener(new l3(dVar, jArr, i9, starrefprogram, j11, j10, z10, context, b6Var, user));
                j11.setOnDismissListener(new kh.g1(6));
                fh.g1 g1Var = new fh.g1(jArr, i9, o9Var3, o9Var, textView, 2);
                g1Var.run();
                if (linearLayout == null) {
                    gh.c0.g(i9).n();
                    gh.c0.g(i9).o();
                    LinearLayout linearLayout4 = linearLayout;
                    b6Var2 = b6Var;
                    linearLayout4.setOnClickListener(new v8(i9, j11, b6Var2, linearLayout4, jArr, g1Var));
                } else {
                    b6Var2 = b6Var;
                }
                final int i17 = 0;
                linearLayout2.setOnClickListener(new View.OnClickListener() { // from class: mh.d3
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i17) {
                            case 0:
                                org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                                if (U != null) {
                                    org.telegram.ui.ActionBar.f3 f3Var = j11;
                                    f3Var.dismiss();
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("user_id", starrefprogram.bot_id);
                                    U.presentFragment(new p3(bundle, f3Var));
                                    break;
                                }
                                break;
                            default:
                                org.telegram.ui.ActionBar.o2 U2 = LaunchActivity.U();
                                if (U2 != null) {
                                    j11.dismiss();
                                    U2.presentFragment(ProfileActivity.m4(starrefprogram.bot_id));
                                    break;
                                }
                                break;
                        }
                    }
                });
                j11.fixNavigationBar(f6.v0(i10, b6Var2));
                j11.show();
            }
            str = userName;
            formatPluralString = LocaleController.formatPluralString("ChannelAffiliateProgramJoinText_Years", i15 / 12, new Object[0]);
        }
        str2 = F0;
        r14 = 0;
        Object[] objArr2 = new Object[3];
        objArr2[r14] = str;
        objArr2[1] = str2;
        objArr2[2] = formatPluralString;
        h.setText(Emoji.replaceEmoji(AndroidUtilities.replaceTags(LocaleController.formatString(i14, objArr2)), h.getPaint().getFontMetricsInt(), r14));
        f11.addView(h, e6.k(0.0f, 0.0f, 0.0f, 22.0f, -1, -2));
        if (j10 < 0) {
        }
        kh.d dVar2 = new kh.d(context, b6Var, true);
        dVar2.g(LocaleController.getString(R.string.ChannelAffiliateProgramJoinButton), false, true);
        f11.addView(dVar2, e6.n(-1, 48));
        l80 l80Var2 = new l80(context, b6Var);
        l80Var2.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.ChannelAffiliateProgramJoinButtonInfo), new e2.f(context, 12)));
        l80Var2.setGravity(17);
        l80Var2.setTextSize(1, 12.0f);
        l80Var2.setTextColor(f6.v0(f6.B6, b6Var));
        l80Var2.setLinkTextColor(f6.v0(f6.gc, b6Var));
        f11.addView(l80Var2, e6.t(-1, -2, 49, 14, 14, 14, 6));
        j11.customView = f11;
        final int i162 = 1;
        o9Var2.setOnClickListener(new View.OnClickListener() { // from class: mh.d3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i162) {
                    case 0:
                        org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                        if (U != null) {
                            org.telegram.ui.ActionBar.f3 f3Var = j11;
                            f3Var.dismiss();
                            Bundle bundle = new Bundle();
                            bundle.putLong("user_id", starrefprogram.bot_id);
                            U.presentFragment(new p3(bundle, f3Var));
                            break;
                        }
                        break;
                    default:
                        org.telegram.ui.ActionBar.o2 U2 = LaunchActivity.U();
                        if (U2 != null) {
                            j11.dismiss();
                            U2.presentFragment(ProfileActivity.m4(starrefprogram.bot_id));
                            break;
                        }
                        break;
                }
            }
        });
        dVar2.setOnClickListener(new l3(dVar2, jArr, i9, starrefprogram, j11, j10, z10, context, b6Var, user));
        j11.setOnDismissListener(new kh.g1(6));
        fh.g1 g1Var2 = new fh.g1(jArr, i9, o9Var3, o9Var, textView, 2);
        g1Var2.run();
        if (linearLayout == null) {
        }
        final int i172 = 0;
        linearLayout2.setOnClickListener(new View.OnClickListener() { // from class: mh.d3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i172) {
                    case 0:
                        org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                        if (U != null) {
                            org.telegram.ui.ActionBar.f3 f3Var = j11;
                            f3Var.dismiss();
                            Bundle bundle = new Bundle();
                            bundle.putLong("user_id", starrefprogram.bot_id);
                            U.presentFragment(new p3(bundle, f3Var));
                            break;
                        }
                        break;
                    default:
                        org.telegram.ui.ActionBar.o2 U2 = LaunchActivity.U();
                        if (U2 != null) {
                            j11.dismiss();
                            U2.presentFragment(ProfileActivity.m4(starrefprogram.bot_id));
                            break;
                        }
                        break;
                }
            }
        });
        j11.fixNavigationBar(f6.v0(i10, b6Var2));
        j11.show();
    }

    public static org.telegram.ui.ActionBar.f3 G0(Context context, int i9, TL_payments.connectedBotStarRef connectedbotstarref, long j10, b6 b6Var) {
        ImageView.ScaleType scaleType;
        TLRPC.User user;
        LinearLayout linearLayout;
        String str;
        char c10;
        String formatPluralString;
        int i10;
        char c11;
        String formatPluralString2;
        org.telegram.ui.ActionBar.f3 f3Var;
        int i11;
        LinearLayout linearLayout2;
        int i12;
        String formatPluralString3;
        TL_payments.connectedBotStarRef connectedbotstarref2;
        b6 b6Var2;
        PorterDuff.Mode mode;
        if (connectedbotstarref == null || context == null) {
            return null;
        }
        org.telegram.ui.ActionBar.f3 j11 = ll.j(context, b6Var, false, false);
        TLRPC.User user2 = MessagesController.getInstance(i9).getUser(Long.valueOf(connectedbotstarref.bot_id));
        LinearLayout f10 = ll.f(context, 1);
        f10.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f));
        f10.setClipChildren(false);
        f10.setClipToPadding(false);
        FrameLayout frameLayout = new FrameLayout(context);
        View view = new View(context);
        view.setBackground(f6.K(AndroidUtilities.dp(40.0f), f6.v0(connectedbotstarref.revoked ? f6.wj : f6.Oh, b6Var)));
        frameLayout.addView(view, e6.d(80, 80.0f, 49, 0.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        ImageView.ScaleType scaleType2 = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType2);
        imageView.setImageResource(connectedbotstarref.revoked ? R.drawable.msg_link_2 : R.drawable.msg_limit_links);
        imageView.setScaleX(connectedbotstarref.revoked ? 2.0f : 1.8f);
        imageView.setScaleY(connectedbotstarref.revoked ? 2.0f : 1.8f);
        frameLayout.addView(imageView, e6.d(80, 80.0f, 49, 0.0f, 0.0f, 0.0f, 0.0f));
        if (connectedbotstarref.participants > 0) {
            FrameLayout frameLayout2 = new FrameLayout(context);
            frameLayout2.setBackground(f6.b0(AndroidUtilities.dp(50.0f), f6.v0(f6.h5, b6Var)));
            frameLayout.addView(frameLayout2, e6.d(-2, -2.0f, 49, 0.0f, 66.0f, 0.0f, 0.0f));
            TextView textView = new TextView(context);
            textView.setTypeface(AndroidUtilities.bold());
            textView.setTextSize(1, 12.0f);
            textView.setBackground(f6.b0(AndroidUtilities.dp(9.5f), f6.v0(connectedbotstarref.revoked ? f6.wj : f6.uj, b6Var)));
            textView.setTextColor(-1);
            textView.setPadding(AndroidUtilities.dp(6.66f), 0, AndroidUtilities.dp(6.66f), 0);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) "s ");
            eq eqVar = new eq(R.drawable.mini_reply_user, 0);
            eqVar.setScale(0.937f, 0.937f);
            eqVar.translate(-AndroidUtilities.dp(1.33f), AndroidUtilities.dp(1.0f));
            eqVar.spaceScaleX = 0.8f;
            scaleType = scaleType2;
            spannableStringBuilder.setSpan(eqVar, 0, 1, 33);
            spannableStringBuilder.append((CharSequence) String.valueOf(connectedbotstarref.participants));
            textView.setText(spannableStringBuilder);
            textView.setGravity(17);
            frameLayout2.addView(textView, e6.d(-1, 19.0f, 119, 1.33f, 1.33f, 1.33f, 1.33f));
        } else {
            scaleType = scaleType2;
        }
        f10.addView(frameLayout, e6.t(-2, -2, 1, 0, 0, 0, 0));
        TextView textView2 = new TextView(context);
        int i13 = f6.G6;
        ll.n(i13, b6Var, textView2, 1, 20.0f);
        textView2.setGravity(17);
        textView2.setText(LocaleController.getString(R.string.ChannelAffiliateProgramLinkTitle));
        textView2.setTypeface(AndroidUtilities.bold());
        f10.addView(textView2, e6.k(20.0f, 16.0f, 20.0f, 9.33f, -1, -2));
        LinearLayout linearLayout3 = new LinearLayout(context);
        linearLayout3.setOrientation(0);
        int dp = AndroidUtilities.dp(28.0f);
        int i14 = f6.a7;
        linearLayout3.setBackground(f6.b0(dp, f6.v0(i14, b6Var)));
        o9 o9Var = new o9(context);
        o9Var.setRoundRadius(AndroidUtilities.dp(14.0f));
        z8 z8Var = new z8((b6) null);
        linearLayout3.addView(o9Var, e6.n(28, 28));
        TextView textView3 = new TextView(context);
        textView3.setTextSize(1, 13.0f);
        textView3.setTextColor(f6.v0(i13, b6Var));
        textView3.setText(DialogObject.getName(i9, connectedbotstarref.bot_id));
        z8Var.r(user2);
        o9Var.e(user2, z8Var);
        linearLayout3.addView(textView3, e6.t(-2, -2, 16, 6, 0, 0, 0));
        ImageView imageView2 = new ImageView(context);
        ImageView.ScaleType scaleType3 = scaleType;
        imageView2.setScaleType(scaleType3);
        int i15 = f6.r5;
        int v02 = f6.v0(i15, b6Var);
        PorterDuff.Mode mode2 = PorterDuff.Mode.SRC_IN;
        imageView2.setColorFilter(new PorterDuffColorFilter(v02, mode2));
        imageView2.setImageResource(R.drawable.settings_arrow);
        imageView2.setScaleX(1.2f);
        imageView2.setScaleY(1.2f);
        linearLayout3.addView(imageView2, e6.t(-2, -2, 16, 5, 0, 8, 0));
        f10.addView(linearLayout3, e6.t(-2, 28, 1, 4, 0, 4, 0));
        g6.a(linearLayout3);
        TextView textView4 = new TextView(context);
        ll.n(i13, b6Var, textView4, 1, 14.0f);
        textView4.setGravity(17);
        if (connectedbotstarref.revoked) {
            org.telegram.messenger.l0.m(R.string.ChannelAffiliateProgramLinkTextRevoked, textView4);
            user = user2;
            linearLayout = linearLayout3;
        } else {
            user = user2;
            if (j10 < 0) {
                int i16 = R.string.ChannelAffiliateProgramLinkTextChannel;
                String F0 = l.F0(connectedbotstarref.commission_permille);
                String userName = UserObject.getUserName(user);
                int i17 = connectedbotstarref.duration_months;
                if (i17 <= 0) {
                    formatPluralString2 = LocaleController.getString(R.string.ChannelAffiliateProgramJoinText_Lifetime);
                    linearLayout = linearLayout3;
                    c11 = 0;
                } else {
                    linearLayout = linearLayout3;
                    if (i17 < 12 || i17 % 12 != 0) {
                        c11 = 0;
                        formatPluralString2 = LocaleController.formatPluralString("ChannelAffiliateProgramJoinText_Months", i17, new Object[0]);
                    } else {
                        c11 = 0;
                        formatPluralString2 = LocaleController.formatPluralString("ChannelAffiliateProgramJoinText_Years", i17 / 12, new Object[0]);
                    }
                }
                Object[] objArr = new Object[3];
                objArr[c11] = F0;
                objArr[1] = userName;
                objArr[2] = formatPluralString2;
                ll.q(i16, objArr, textView4);
            } else {
                linearLayout = linearLayout3;
                int i18 = R.string.ChannelAffiliateProgramLinkTextUser;
                String F02 = l.F0(connectedbotstarref.commission_permille);
                String userName2 = UserObject.getUserName(user);
                int i19 = connectedbotstarref.duration_months;
                if (i19 <= 0) {
                    formatPluralString = LocaleController.getString(R.string.ChannelAffiliateProgramJoinText_Lifetime);
                    str = userName2;
                    i10 = 3;
                    c10 = 0;
                } else {
                    str = userName2;
                    if (i19 < 12 || i19 % 12 != 0) {
                        c10 = 0;
                        formatPluralString = LocaleController.formatPluralString("ChannelAffiliateProgramJoinText_Months", i19, new Object[0]);
                    } else {
                        c10 = 0;
                        formatPluralString = LocaleController.formatPluralString("ChannelAffiliateProgramJoinText_Years", i19 / 12, new Object[0]);
                    }
                    i10 = 3;
                }
                Object[] objArr2 = new Object[i10];
                objArr2[c10] = F02;
                objArr2[1] = str;
                objArr2[2] = formatPluralString;
                ll.q(i18, objArr2, textView4);
            }
        }
        f10.addView(textView4, e6.k(20.0f, 19.0f, 20.0f, 18.0f, -1, -2));
        if (connectedbotstarref.revoked) {
            f3Var = j11;
            i11 = i13;
            linearLayout2 = null;
        } else {
            TextView textView5 = new TextView(context);
            ll.n(i13, b6Var, textView5, 1, 14.0f);
            textView5.setGravity(17);
            textView5.setText(LocaleController.getString(R.string.ChannelAffiliateProgramLinkSendTo));
            f10.addView(textView5, e6.k(20.0f, 0.0f, 20.0f, 0.0f, -1, -2));
            LinearLayout linearLayout4 = new LinearLayout(context);
            linearLayout4.setOrientation(0);
            linearLayout4.setBackground(f6.b0(AndroidUtilities.dp(28.0f), f6.v0(i14, b6Var)));
            o9 o9Var2 = new o9(context);
            o9Var2.setRoundRadius(AndroidUtilities.dp(14.0f));
            z8 z8Var2 = new z8((b6) null);
            linearLayout4.addView(o9Var2, e6.n(28, 28));
            TextView textView6 = new TextView(context);
            textView6.setTextSize(1, 13.0f);
            textView6.setTextColor(f6.v0(i13, b6Var));
            if (j10 >= 0) {
                TLRPC.User user3 = MessagesController.getInstance(i9).getUser(Long.valueOf(j10));
                z8Var2.r(user3);
                o9Var2.e(user3, z8Var2);
                textView6.setText(UserObject.getUserName(user3));
                f3Var = j11;
                i11 = i13;
                mode = mode2;
            } else {
                f3Var = j11;
                i11 = i13;
                mode = mode2;
                TLRPC.Chat chat = MessagesController.getInstance(i9).getChat(Long.valueOf(-j10));
                z8Var2.q(chat);
                o9Var2.e(chat, z8Var2);
                textView6.setText(chat == null ? "" : chat.title);
            }
            linearLayout4.addView(textView6, e6.t(-2, -2, 16, 6, 0, 0, 0));
            ImageView imageView3 = new ImageView(context);
            imageView3.setScaleType(scaleType3);
            imageView3.setColorFilter(new PorterDuffColorFilter(f6.v0(i15, b6Var), mode));
            imageView3.setImageResource(R.drawable.arrows_select);
            linearLayout4.addView(imageView3, e6.t(-2, -2, 16, 2, 0, 5, 0));
            f10.addView(linearLayout4, e6.t(-2, 28, 1, 0, 9, 0, 22));
            linearLayout2 = linearLayout4;
        }
        TextView textView7 = new TextView(context);
        textView7.setTextSize(1, 16.0f);
        textView7.setGravity(17);
        textView7.setTextColor(f6.v0(i11, b6Var));
        int dp2 = AndroidUtilities.dp(8.0f);
        int v03 = f6.v0(i14, b6Var);
        int v = f6.v(f6.v0(i14, b6Var), f6.v0(f6.i6, b6Var));
        textView7.setBackground(f6.i0(dp2, dp2, dp2, dp2, v03, v, v));
        textView7.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(14.66f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(14.66f));
        String str2 = connectedbotstarref.url;
        textView7.setText((str2 == null || !str2.startsWith("https://")) ? connectedbotstarref.url : connectedbotstarref.url.substring(8));
        f10.addView(textView7, e6.d(-1, -2.0f, 7, 0.0f, 0.0f, 0.0f, 12.0f));
        kh.d dVar = new kh.d(context, b6Var, true);
        if (connectedbotstarref.revoked) {
            dVar.g(LocaleController.getString(R.string.ChannelAffiliateProgramLinkRejoin), false, true);
        } else {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            spannableStringBuilder2.append((CharSequence) "c ");
            spannableStringBuilder2.setSpan(new eq(R.drawable.msg_copy_filled, 0), 0, 1, 33);
            spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.ChannelAffiliateProgramLinkCopy));
            dVar.g(spannableStringBuilder2, false, true);
        }
        f10.addView(dVar, e6.n(-1, 48));
        l80 l80Var = new l80(context, b6Var);
        long j12 = connectedbotstarref.participants;
        if (j12 <= 0) {
            i12 = 1;
            formatPluralString3 = LocaleController.formatString(R.string.ChannelAffiliateProgramLinkOpenedNone, UserObject.getUserName(user));
        } else {
            i12 = 1;
            formatPluralString3 = LocaleController.formatPluralString("ChannelAffiliateProgramLinkOpened", (int) j12, UserObject.getUserName(user));
        }
        l80Var.setText(formatPluralString3);
        l80Var.setGravity(17);
        l80Var.setTextSize(i12, 12.0f);
        l80Var.setTextColor(f6.v0(f6.B6, b6Var));
        l80Var.setLinkTextColor(f6.v0(f6.gc, b6Var));
        f10.addView(l80Var, e6.t(-1, -2, 49, 14, 12, 14, 2));
        org.telegram.ui.ActionBar.f3 f3Var2 = f3Var;
        f3Var2.customView = f10;
        androidx.car.app.utils.c cVar = new androidx.car.app.utils.c(connectedbotstarref, f3Var2, b6Var, user, 18);
        if (!connectedbotstarref.revoked) {
            textView7.setOnClickListener(new x8(cVar, 4));
        }
        dVar.setOnClickListener(new j3(connectedbotstarref, i9, f3Var2, context, j10, b6Var, cVar));
        f3Var2.setOnDismissListener(new kh.g1(6));
        if (linearLayout2 != null) {
            gh.c0.g(i9).n();
            gh.c0.g(i9).o();
            LinearLayout linearLayout5 = linearLayout2;
            b6Var2 = b6Var;
            connectedbotstarref2 = connectedbotstarref;
            linearLayout5.setOnClickListener(new j3(i9, f3Var2, b6Var, linearLayout5, j10, context, connectedbotstarref));
        } else {
            connectedbotstarref2 = connectedbotstarref;
            b6Var2 = b6Var;
        }
        linearLayout.setOnClickListener(new k3(0, f3Var2, connectedbotstarref2));
        f3Var2.fixNavigationBar(f6.v0(f6.h5, b6Var2));
        org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
        if (!AndroidUtilities.isTablet() && U != null && !AndroidUtilities.hasDialogOnTop(U)) {
            f3Var2.makeAttached(U);
        }
        f3Var2.show();
        return f3Var2;
    }

    public static void w0(u3 u3Var, Context context, TLRPC.User user, TL_payments.connectedBotStarRef connectedbotstarref) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, u3Var.resourceProvider);
        String string = LocaleController.getString(R.string.LeaveAffiliateLink);
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
        c2Var.N = string;
        c2Var.P = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.LeaveAffiliateLinkAlert, UserObject.getUserName(user)));
        alertDialog$Builder.k(LocaleController.getString(R.string.LeaveAffiliateLinkButton), new ih.v3(4, u3Var, connectedbotstarref));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        alertDialog$Builder.d(-1);
        alertDialog$Builder.o();
    }

    public static void x0(u3 u3Var, TL_payments.connectedBotStarRef connectedbotstarref) {
        org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(u3Var.getParentActivity(), 3, null);
        c2Var.q(200L);
        TL_payments.editConnectedStarRefBot editconnectedstarrefbot = new TL_payments.editConnectedStarRefBot();
        editconnectedstarrefbot.link = connectedbotstarref.url;
        editconnectedstarrefbot.peer = MessagesController.getInstance(u3Var.currentAccount).getInputPeer(u3Var.L);
        editconnectedstarrefbot.revoked = true;
        u3Var.getConnectionsManager().sendRequest(editconnectedstarrefbot, new bg.j0(19, u3Var, c2Var));
    }

    public static /* synthetic */ void y0(u3 u3Var, Context context, int i9) {
        m3 m3Var = u3Var.P;
        if (m3Var == null) {
            return;
        }
        Object obj = m3Var.G(i9).G;
        if (obj instanceof TL_payments.starRefProgram) {
            F0(context, u3Var.currentAccount, (TL_payments.starRefProgram) obj, u3Var.L, u3Var.resourceProvider, false);
        } else if (obj instanceof TL_payments.connectedBotStarRef) {
            G0(context, u3Var.currentAccount, (TL_payments.connectedBotStarRef) obj, u3Var.L, u3Var.resourceProvider);
        }
    }

    public static void z0(u3 u3Var, TLObject tLObject, org.telegram.ui.ActionBar.c2 c2Var) {
        long j10 = u3Var.L;
        if (tLObject instanceof TL_payments.connectedStarRefBots) {
            TL_payments.connectedStarRefBots connectedstarrefbots = (TL_payments.connectedStarRefBots) tLObject;
            gh.z d = gh.c0.g(u3Var.currentAccount).d(j10);
            ArrayList arrayList = d.e;
            int i9 = d.a;
            MessagesController.getInstance(i9).putUsers(connectedstarrefbots.users, false);
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
            NotificationCenter.getInstance(i9).lambda$postNotificationNameOnUIThread$1(NotificationCenter.channelConnectedBotsUpdate, Long.valueOf(d.b));
            d.a();
            gh.a0 e10 = gh.c0.g(u3Var.currentAccount).e(j10);
            e10.c = 0;
            e10.d = false;
            e10.i = false;
            e10.f = 0L;
            e10.j = null;
            e10.h = false;
            e10.a();
            u3Var.P.N(true);
        }
        c2Var.dismiss();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x01a5 A[LOOP:0: B:20:0x019f->B:22:0x01a5, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void E0(ArrayList arrayList, z41 z41Var) {
        SpannableString spannableString;
        if (getParentActivity() == null) {
            return;
        }
        fh.l2 l2Var = (fh.l2) q0(getParentActivity());
        l41 l41Var = new l41(-2);
        l41Var.c = l2Var;
        arrayList.add(l41Var);
        arrayList.add(j.a(R.drawable.menu_feature_reliable, LocaleController.getString(R.string.ChannelAffiliateProgramFeature1Title), LocaleController.getString(R.string.ChannelAffiliateProgramFeature1)));
        arrayList.add(j.a(R.drawable.menu_feature_transparent, LocaleController.getString(R.string.ChannelAffiliateProgramFeature2Title), LocaleController.getString(R.string.ChannelAffiliateProgramFeature2)));
        arrayList.add(j.a(R.drawable.menu_feature_simple, LocaleController.getString(R.string.ChannelAffiliateProgramFeature3Title), LocaleController.getString(R.string.ChannelAffiliateProgramFeature3)));
        arrayList.add(l41.A(1, null));
        gh.c0 g10 = gh.c0.g(this.currentAccount);
        long j10 = this.L;
        gh.z d = g10.d(j10);
        ArrayList arrayList2 = d.e;
        if (!arrayList2.isEmpty() || d.c > 0) {
            org.telegram.ui.Cells.j2.l(R.string.ChannelAffiliateProgramMyPrograms, arrayList);
            for (int i9 = 0; i9 < arrayList2.size(); i9++) {
                TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) arrayList2.get(i9);
                int i10 = q3.a;
                l41 J = l41.J(q3.class);
                J.G = connectedbotstarref;
                J.r = true;
                arrayList.add(J);
            }
            if (!d.d || d.g) {
                arrayList.add(l41.n(29));
                arrayList.add(l41.n(29));
                arrayList.add(l41.n(29));
            }
            arrayList.add(l41.A(2, null));
        }
        gh.a0 e10 = gh.c0.g(this.currentAccount).e(j10);
        ArrayList arrayList3 = e10.e;
        if (!arrayList3.isEmpty() || e10.c > 0) {
            String string = LocaleController.getString(R.string.ChannelAffiliateProgramPrograms);
            int i11 = e10.g;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.ChannelAffiliateProgramProgramsSort)).append((CharSequence) " ");
            if (i11 == 1) {
                spannableString = new SpannableString(LocaleController.getString(R.string.ChannelAffiliateProgramProgramsSortProfitability) + "v");
            } else if (i11 == 2) {
                spannableString = new SpannableString(LocaleController.getString(R.string.ChannelAffiliateProgramProgramsSortRevenue) + "v");
            } else {
                if (i11 == 3) {
                    spannableString = new SpannableString(LocaleController.getString(R.string.ChannelAffiliateProgramProgramsSortDate) + "v");
                }
                int i12 = s3.a;
                l41 J2 = l41.J(s3.class);
                J2.l = string;
                J2.m = spannableStringBuilder;
                arrayList.add(J2);
                for (int i13 = 0; i13 < arrayList3.size(); i13++) {
                    Object obj = arrayList3.get(i13);
                    int i14 = q3.a;
                    l41 J3 = l41.J(q3.class);
                    J3.G = obj;
                    J3.r = true;
                    arrayList.add(J3);
                }
                if (e10.d || e10.h) {
                    arrayList.add(l41.n(29));
                    arrayList.add(l41.n(29));
                    arrayList.add(l41.n(29));
                }
                arrayList.add(l41.A(3, null));
            }
            eq eqVar = new eq(R.drawable.arrow_more, 0);
            eqVar.useLinkPaintColor = true;
            eqVar.setScale(0.6f, 0.6f);
            spannableString.setSpan(eqVar, spannableString.length() - 1, spannableString.length(), 33);
            spannableString.setSpan(new o3(this, i11, gh.c0.g(this.currentAccount).e(j10)), 0, spannableString.length(), 33);
            spannableStringBuilder.append((CharSequence) spannableString);
            int i122 = s3.a;
            l41 J22 = l41.J(s3.class);
            J22.l = string;
            J22.m = spannableStringBuilder;
            arrayList.add(J22);
            while (i13 < arrayList3.size()) {
            }
            if (e10.d) {
            }
            arrayList.add(l41.n(29));
            arrayList.add(l41.n(29));
            arrayList.add(l41.n(29));
            arrayList.add(l41.A(3, null));
        }
        arrayList.add(l41.k(this.O));
    }

    @Override // org.telegram.ui.x10, org.telegram.ui.ActionBar.o2
    public final View createView(Context context) {
        this.C = false;
        this.A = AndroidUtilities.dp(238.0f);
        an anVar = new an(context, 4);
        this.O = anVar;
        anVar.setBackgroundColor(f6.w0(null, f6.i5, false));
        super.createView(context);
        this.M = new FrameLayout(context);
        ag.j jVar = new ag.j(context, 1, 3);
        this.N = jVar;
        jVar.setImportantForAccessibility(4);
        ag.a aVar = this.N.b;
        aVar.w = f6.fk;
        aVar.x = f6.gk;
        aVar.b();
        this.N.setStarParticlesView(this.e);
        this.M.addView(this.N, e6.d(190, 190.0f, 17, 0.0f, 32.0f, 0.0f, 12.0f));
        l0(LocaleController.getString(R.string.ChannelAffiliateProgramTitle), AndroidUtilities.replaceTags(LocaleController.getString(R.string.ChannelAffiliateProgramText)), this.M, null);
        this.c.setOnItemClickListener(new bg.b1(4, this, context));
        this.c.setOnItemLongClickListener(new ih.v3(5, this, context));
        f2.n nVar = new f2.n();
        nVar.m = false;
        nVar.C = false;
        nVar.o(gr.h);
        nVar.n(350L);
        this.c.setItemAnimator(nVar);
        this.c.setOnScrollListener(new bg.o2(this, 15));
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        m3 m3Var;
        int i11 = NotificationCenter.channelConnectedBotsUpdate;
        long j10 = this.L;
        if (i9 != i11) {
            if (i9 == NotificationCenter.channelSuggestedBotsUpdate && ((Long) objArr[0]).longValue() == j10 && (m3Var = this.P) != null) {
                m3Var.N(true);
                return;
            }
            return;
        }
        if (((Long) objArr[0]).longValue() == j10) {
            m3 m3Var2 = this.P;
            if (m3Var2 != null) {
                m3Var2.N(true);
            }
            gh.c0.g(this.currentAccount).d(j10).a();
        }
    }

    @Override // org.telegram.ui.x10
    public final f2.r0 m0() {
        m3 m3Var = new m3(this, this.c, getParentActivity(), this.currentAccount, this.classGuid, new b8(this, 10), getResourceProvider());
        this.P = m3Var;
        return m3Var;
    }

    @Override // org.telegram.ui.x10
    public final zf.w1 o0() {
        f fVar = new f(getParentActivity(), 1);
        fVar.b();
        return fVar;
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

    @Override // org.telegram.ui.x10, org.telegram.ui.ActionBar.o2
    public final void onPause() {
        super.onPause();
        ag.j jVar = this.N;
        if (jVar != null) {
            jVar.setPaused(true);
            this.N.setDialogVisible(true);
        }
    }

    @Override // org.telegram.ui.x10, org.telegram.ui.ActionBar.o2
    public final void onResume() {
        super.onResume();
        ag.j jVar = this.N;
        if (jVar != null) {
            jVar.setPaused(false);
            this.N.setDialogVisible(false);
        }
    }
}
