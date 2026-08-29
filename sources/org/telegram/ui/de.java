package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Typeface;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.RelativeSizeSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class de extends org.telegram.ui.Components.hv0 implements r0.n {
    public static de t1;
    public static HashMap u1;
    public final CharSequence A0;
    public final CharSequence B0;
    public final bg.y3 C0;
    public final RelativeSizeSpan D0;
    public final org.telegram.ui.Components.o6 E0;
    public final org.telegram.ui.Components.o6 F0;
    public final nh.d G0;
    public int H0;
    public final bg.y3 I0;
    public TL_stars.StarsAmount J0;
    public final org.telegram.ui.Components.o6 K0;
    public final org.telegram.ui.Components.o6 L0;
    public final ud M0;
    public final org.telegram.ui.Components.iq[] N0;
    public final LinearLayout O0;
    public final nh.d P0;
    public final jh.l Q0;
    public boolean R0;
    public boolean S0;
    public long T0;
    public final jh.m U0;
    public org.telegram.ui.Components.mc V0;
    public final org.telegram.ui.Components.u51 W0;
    public lg.k X0;
    public final FrameLayout Y0;
    public DecimalFormat Z0;
    public final zd a1;
    public final boolean b1;
    public final boolean c1;
    public SpannableStringBuilder d1;
    public final id e1;
    public double f1;
    public double g1;
    public org.telegram.ui.ActionBar.l h1;
    public boolean i1;
    public boolean j1;
    public f91 k1;
    public f91 l1;
    public f91 m1;
    public boolean n1;
    public final ae o1;
    public final ae p1;
    public final ae q1;
    public final jd r1;
    public final t91 s0;
    public final a5.e s1;
    public final org.telegram.ui.ActionBar.c6 t0;
    public final int u0;
    public final long v0;
    public TL_stories.TL_premium_boostsStatus w0;
    public int x0;
    public final CharSequence y0;
    public final CharSequence z0;

    public de(Activity activity, t91 t91Var, int i10, long j10, org.telegram.ui.ActionBar.c6 c6Var, boolean z10, boolean z11) {
        super(activity, null);
        this.J0 = TL_stars.StarsAmount.ofStars(0L);
        int i11 = 1;
        this.N0 = new org.telegram.ui.Components.iq[1];
        int i12 = 0;
        this.R0 = false;
        this.S0 = true;
        this.i1 = false;
        this.j1 = false;
        this.n1 = false;
        String string = LocaleController.getString(R.string.MonetizationOverviewAvailable);
        ae aeVar = new ae();
        aeVar.a = false;
        aeVar.b = "TON";
        aeVar.h = "XTR";
        aeVar.c = string;
        this.o1 = aeVar;
        String string2 = LocaleController.getString(R.string.MonetizationOverviewLastWithdrawal);
        ae aeVar2 = new ae();
        aeVar2.a = false;
        aeVar2.b = "TON";
        aeVar2.h = "XTR";
        aeVar2.c = string2;
        this.p1 = aeVar2;
        String string3 = LocaleController.getString(R.string.MonetizationOverviewTotal);
        ae aeVar3 = new ae();
        aeVar3.a = false;
        aeVar3.b = "TON";
        aeVar3.h = "XTR";
        aeVar3.c = string3;
        this.q1 = aeVar3;
        this.r1 = new jd(this, 3);
        this.s1 = new a5.e();
        this.b1 = z10;
        this.c1 = z11;
        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.US);
        decimalFormatSymbols.setDecimalSeparator('.');
        DecimalFormat decimalFormat = new DecimalFormat("#.##", decimalFormatSymbols);
        this.Z0 = decimalFormat;
        decimalFormat.setMinimumFractionDigits(2);
        this.Z0.setMaximumFractionDigits(12);
        this.Z0.setGroupingUsed(false);
        this.s0 = t91Var;
        this.t0 = c6Var;
        this.u0 = i10;
        this.v0 = j10;
        long j11 = -j10;
        TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(j11));
        if (chat != null) {
            this.x0 = chat.level;
        }
        MessagesController.getInstance(i10).getBoostsController().getBoostsStats(j10, new rb(this, i11));
        c0(false);
        if (z10) {
            TLRPC.TL_payments_getStarsRevenueStats tL_payments_getStarsRevenueStats = new TLRPC.TL_payments_getStarsRevenueStats();
            tL_payments_getStarsRevenueStats.dark = org.telegram.ui.ActionBar.g6.I.q();
            tL_payments_getStarsRevenueStats.ton = true;
            tL_payments_getStarsRevenueStats.peer = MessagesController.getInstance(i10).getInputPeer(j10);
            TLRPC.ChatFull chatFull = MessagesController.getInstance(i10).getChatFull(j11);
            if (chatFull != null) {
                boolean z12 = chatFull.restricted_sponsored;
                this.i1 = z12;
                this.j1 = z12;
            }
            ConnectionsManager.getInstance(i10).sendRequest(tL_payments_getStarsRevenueStats, new pd(this, i11), null, null, 0, ConnectionsManager.DEFAULT_DATACENTER_ID, 1, true);
        }
        TLRPC.Chat chat2 = MessagesController.getInstance(i10).getChat(Long.valueOf(j11));
        this.y0 = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.MonetizationInfo, 50), -1, 3, new u1(t91Var, activity, c6Var, 13), c6Var), true);
        this.z0 = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(MessagesController.getInstance(i10).channelRevenueWithdrawalEnabled ? R.string.MonetizationBalanceInfo : R.string.MonetizationBalanceInfoNotAvailable), -1, 3, new jd(this, 8)), true);
        this.A0 = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString((z11 && z10) ? R.string.MonetizationProceedsStarsTONInfo : z11 ? R.string.MonetizationProceedsStarsInfo : R.string.MonetizationProceedsTONInfo), -1, 3, new id(this, (z11 && z10) ? R.string.MonetizationProceedsStarsTONInfoLink : z11 ? R.string.MonetizationProceedsStarsInfoLink : R.string.MonetizationProceedsTONInfoLink, i12), c6Var), true);
        this.B0 = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(chat2) ? R.string.MonetizationStarsInfo : R.string.MonetizationStarsInfoGroup), new jd(this, i12)), true);
        int i13 = org.telegram.ui.ActionBar.g6.a7;
        setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(i13, c6Var));
        this.a1 = new zd(this, activity, i10, j10, t91Var.getClassGuid(), new jd(this, i11), c6Var);
        bg.y3 y3Var = new bg.y3(activity, 3);
        this.C0 = y3Var;
        y3Var.setOrientation(1);
        int i14 = org.telegram.ui.ActionBar.g6.d6;
        y3Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(i14, c6Var));
        y3Var.setPadding(0, 0, 0, AndroidUtilities.dp(17.0f));
        org.telegram.ui.Components.o6 o6Var = new org.telegram.ui.Components.o6(activity, false, true, true);
        this.E0 = o6Var;
        o6Var.setTypeface(AndroidUtilities.bold());
        int i15 = org.telegram.ui.ActionBar.g6.G6;
        o6Var.setTextColor(org.telegram.ui.ActionBar.g6.v0(i15, c6Var));
        o6Var.setTextSize(AndroidUtilities.dp(32.0f));
        o6Var.setGravity(17);
        this.D0 = new RelativeSizeSpan(0.6770833f);
        y3Var.addView(o6Var, i7.f6.t(-1, 38, 49, 22, 15, 22, 0));
        org.telegram.ui.Components.o6 o6Var2 = new org.telegram.ui.Components.o6(activity, true, true, true);
        this.F0 = o6Var2;
        o6Var2.setGravity(17);
        int i16 = org.telegram.ui.ActionBar.g6.y6;
        o6Var2.setTextColor(org.telegram.ui.ActionBar.g6.v0(i16, c6Var));
        o6Var2.setTextSize(AndroidUtilities.dp(14.0f));
        y3Var.addView(o6Var2, i7.f6.d(-1, 17.0f, 49, 22.0f, 4.0f, 22.0f, 0.0f));
        nh.d dVar = new nh.d(activity, c6Var, true);
        dVar.setRoundRadius(24);
        this.G0 = dVar;
        dVar.setEnabled(MessagesController.getInstance(i10).channelRevenueWithdrawalEnabled);
        dVar.g(LocaleController.getString(R.string.MonetizationWithdraw), false, true);
        dVar.setVisibility(8);
        dVar.setOnClickListener(new nh.r7(16, this, t91Var));
        y3Var.addView(dVar, i7.f6.d(-1, 48.0f, 55, 18.0f, 13.0f, 18.0f, 0.0f));
        bg.y3 y3Var2 = new bg.y3(activity, 4);
        this.I0 = y3Var2;
        y3Var2.setOrientation(1);
        y3Var2.setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(i14, c6Var));
        y3Var2.setPadding(0, 0, 0, AndroidUtilities.dp(17.0f));
        org.telegram.ui.Components.o6 o6Var3 = new org.telegram.ui.Components.o6(activity, false, true, true);
        this.K0 = o6Var3;
        o6Var3.setTypeface(AndroidUtilities.bold());
        o6Var3.setTextColor(org.telegram.ui.ActionBar.g6.v0(i15, c6Var));
        o6Var3.setTextSize(AndroidUtilities.dp(32.0f));
        o6Var3.setGravity(17);
        new RelativeSizeSpan(0.6770833f);
        y3Var2.addView(o6Var3, i7.f6.t(-1, 38, 49, 22, 15, 22, 0));
        org.telegram.ui.Components.o6 o6Var4 = new org.telegram.ui.Components.o6(activity, true, true, true);
        this.L0 = o6Var4;
        o6Var4.setGravity(17);
        o6Var4.setTextColor(org.telegram.ui.ActionBar.g6.v0(i16, c6Var));
        o6Var4.setTextSize(AndroidUtilities.dp(14.0f));
        y3Var2.addView(o6Var4, i7.f6.d(-1, 17.0f, 49, 22.0f, 4.0f, 22.0f, 0.0f));
        jh.l lVar = new jh.l(this, activity, i11);
        this.Q0 = lVar;
        lVar.setVisibility(8);
        lVar.setText(LocaleController.getString(R.string.BotStarsWithdrawPlaceholder));
        lVar.setLeftPadding(AndroidUtilities.dp(36.0f));
        jh.m mVar = new jh.m(activity, i11);
        this.U0 = mVar;
        mVar.setFocusable(false);
        mVar.setTextColor(org.telegram.ui.ActionBar.g6.v0(i15, c6Var));
        mVar.setCursorSize(AndroidUtilities.dp(20.0f));
        mVar.setCursorWidth(1.5f);
        mVar.setBackground(null);
        mVar.setTextSize(1, 18.0f);
        mVar.setMaxLines(1);
        int dp = AndroidUtilities.dp(16.0f);
        mVar.setPadding(AndroidUtilities.dp(6.0f), dp, dp, dp);
        mVar.setInputType(2);
        mVar.setTypeface(Typeface.DEFAULT);
        mVar.setHighlightColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.uf, c6Var));
        mVar.setHandlesColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.vf, c6Var));
        mVar.setGravity(LocaleController.isRTL ? 5 : 3);
        mVar.setOnFocusChangeListener(new kd(this, i12));
        mVar.addTextChangedListener(new td(this));
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(0);
        ImageView imageView = new ImageView(activity);
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setImageResource(R.drawable.star_small_inner);
        linearLayout.addView(imageView, i7.f6.p(-2, -2, 0.0f, 19, 14, 0, 0, 0));
        linearLayout.addView(mVar, i7.f6.o(-1, -2, 1.0f, 119));
        lVar.e(mVar);
        lVar.addView(linearLayout, i7.f6.e(-1, -2, 48));
        y3Var2.addView(lVar, i7.f6.t(-1, -2, 1, 18, 14, 18, 2));
        LinearLayout linearLayout2 = new LinearLayout(activity);
        this.O0 = linearLayout2;
        linearLayout2.setOrientation(0);
        ud udVar = new ud(activity, c6Var, true);
        udVar.setRoundRadius(24);
        this.M0 = udVar;
        udVar.setEnabled(false);
        udVar.g(LocaleController.formatPluralString("MonetizationStarsWithdraw", 0, new Object[0]), false, true);
        udVar.setVisibility(0);
        udVar.setOnClickListener(new bg.p2(this, i10, t91Var, 6));
        nh.d dVar2 = new nh.d(activity, c6Var, true);
        dVar2.setRoundRadius(24);
        this.P0 = dVar2;
        dVar2.setEnabled(false);
        dVar2.g(LocaleController.getString(R.string.MonetizationStarsAds), false, true);
        dVar2.setOnClickListener(new ld(this, i10, j10, activity));
        linearLayout2.addView(udVar, i7.f6.o(-1, 48, 1.0f, 119));
        if (ChatObject.isChannelAndNotMegaGroup(chat2)) {
            linearLayout2.addView(new Space(activity), i7.f6.o(8, 48, 0.0f, 119));
            linearLayout2.addView(dVar2, i7.f6.o(-1, 48, 1.0f, 119));
        }
        y3Var2.addView(linearLayout2, i7.f6.d(-1, 48.0f, 55, 18.0f, 13.0f, 18.0f, 0.0f));
        mVar.setOnEditorActionListener(new rd(0, this, t91Var));
        int i17 = 2;
        this.e1 = new id(this, i10, i17);
        org.telegram.ui.Components.u51 u51Var = new org.telegram.ui.Components.u51(t91Var, new b5(this, i17), new sd(this), new sd(this));
        this.W0 = u51Var;
        u51Var.setClipToPadding(false);
        u51Var.p1();
        addView(u51Var);
        LinearLayout linearLayout3 = new LinearLayout(activity);
        linearLayout3.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(activity);
        this.Y0 = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(i13, c6Var));
        frameLayout.addView(linearLayout3, i7.f6.e(-2, -2, 17));
        org.telegram.ui.Components.aj0 aj0Var = new org.telegram.ui.Components.aj0(activity);
        aj0Var.setAutoRepeat(true);
        aj0Var.f(R.raw.statistic_preload, 120, 120, null);
        aj0Var.d();
        TextView textView = new TextView(activity);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        int i18 = org.telegram.ui.ActionBar.g6.Oi;
        textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i18, false));
        textView.setTag(Integer.valueOf(i18));
        textView.setText(LocaleController.getString("LoadingStats", R.string.LoadingStats));
        textView.setGravity(1);
        TextView textView2 = new TextView(activity);
        textView2.setTextSize(1, 15.0f);
        int i19 = org.telegram.ui.ActionBar.g6.Pi;
        textView2.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i19, false));
        textView2.setTag(Integer.valueOf(i19));
        b.i(R.string.LoadingStatsDescription, textView2, 1);
        linearLayout3.addView(aj0Var, i7.f6.t(120, 120, 1, 0, 0, 0, 20));
        linearLayout3.addView(textView, i7.f6.t(-2, -2, 1, 0, 0, 0, 10));
        linearLayout3.addView(textView2, i7.f6.q(-2, -2, 1));
        addView(frameLayout, i7.f6.e(-1, -1, 119));
    }

    public static org.telegram.ui.ActionBar.f3 d0(Context context, org.telegram.ui.ActionBar.c6 c6Var, boolean z10) {
        org.telegram.ui.ActionBar.f3 q6 = org.telegram.messenger.x3.q(context, c6Var, false, false);
        LinearLayout g10 = org.telegram.messenger.x3.g(context, 1);
        g10.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        org.telegram.ui.Components.aj0 aj0Var = new org.telegram.ui.Components.aj0(context);
        aj0Var.setScaleType(ImageView.ScaleType.CENTER);
        aj0Var.setImageResource(R.drawable.large_monetize);
        aj0Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        aj0Var.setBackground(org.telegram.ui.ActionBar.g6.K(AndroidUtilities.dp(80.0f), org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Oh, c6Var)));
        g10.addView(aj0Var, i7.f6.t(80, 80, 1, 0, 16, 0, 16));
        TextView textView = new TextView(context);
        textView.setGravity(17);
        th.n(20.0f, 1, textView);
        int i10 = org.telegram.ui.ActionBar.g6.G6;
        textView.setTextColor(org.telegram.ui.ActionBar.g6.v0(i10, c6Var));
        textView.setText(LocaleController.getString(z10 ? R.string.BotMonetizationInfoTitle : R.string.MonetizationInfoTitle));
        g10.addView(textView, i7.f6.k(8.0f, 0.0f, 8.0f, 25.0f, -1, -2));
        g10.addView(new bh.d(context, R.drawable.msg_channel, LocaleController.getString(z10 ? R.string.BotMonetizationInfoFeature1Name : R.string.MonetizationInfoFeature1Name), LocaleController.getString(z10 ? R.string.BotMonetizationInfoFeature1Text : R.string.MonetizationInfoFeature1Text), c6Var), i7.f6.t(-1, -2, 49, 8, 0, 8, 16));
        g10.addView(new bh.d(context, R.drawable.menu_feature_split, LocaleController.getString(z10 ? R.string.BotMonetizationInfoFeature2Name : R.string.MonetizationInfoFeature2Name), LocaleController.getString(z10 ? R.string.BotMonetizationInfoFeature2Text : R.string.MonetizationInfoFeature2Text), c6Var), i7.f6.t(-1, -2, 49, 8, 0, 8, 16));
        g10.addView(new bh.d(context, R.drawable.menu_feature_withdrawals, LocaleController.getString(z10 ? R.string.BotMonetizationInfoFeature3Name : R.string.MonetizationInfoFeature3Name), LocaleController.getString(z10 ? R.string.BotMonetizationInfoFeature3Text : R.string.MonetizationInfoFeature3Text), c6Var), i7.f6.t(-1, -2, 49, 8, 0, 8, 16));
        View view = new View(context);
        view.setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.d7, c6Var));
        g10.addView(view, i7.f6.s(-1, 55, 12, 0, 12, 1.0f / AndroidUtilities.density, 0));
        org.telegram.ui.Components.x5 x5Var = new org.telegram.ui.Components.x5(context);
        x5Var.setGravity(17);
        x5Var.setTextSize(1, 20.0f);
        x5Var.setTypeface(AndroidUtilities.bold());
        x5Var.setTextColor(org.telegram.ui.ActionBar.g6.v0(i10, c6Var));
        SpannableString spannableString = new SpannableString("💎");
        org.telegram.ui.Components.iq iqVar = new org.telegram.ui.Components.iq(R.drawable.mini_gram_72, 0);
        iqVar.setScale(0.9f, 0.9f);
        iqVar.setColorKey(org.telegram.ui.ActionBar.g6.o6);
        iqVar.setRelativeSize(x5Var.getPaint().getFontMetricsInt());
        iqVar.spaceScaleX = 0.9f;
        spannableString.setSpan(iqVar, 0, spannableString.length(), 33);
        x5Var.setText(AndroidUtilities.replaceCharSequence("💎", LocaleController.getString(z10 ? R.string.BotMonetizationInfoTONTitle : R.string.MonetizationInfoTONTitle), spannableString));
        g10.addView(x5Var, i7.f6.k(8.0f, 20.0f, 8.0f, 0.0f, -1, -2));
        org.telegram.ui.Components.y80 y80Var = new org.telegram.ui.Components.y80(context, c6Var);
        y80Var.setGravity(17);
        y80Var.setTextSize(1, 14.0f);
        y80Var.setTextColor(org.telegram.ui.ActionBar.g6.v0(i10, c6Var));
        y80Var.setLinkTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.gc, c6Var));
        y80Var.setText(AndroidUtilities.withLearnMore(AndroidUtilities.replaceTags(LocaleController.getString(z10 ? R.string.BotMonetizationInfoTONText : R.string.MonetizationInfoTONText)), new hh.f(22, context, z10)));
        g10.addView(y80Var, i7.f6.k(28.0f, 9.0f, 28.0f, 0.0f, -1, -2));
        nh.d o10 = org.telegram.messenger.x3.o(24, context, c6Var, true);
        o10.g(LocaleController.getString(R.string.GotIt), false, true);
        o10.setOnClickListener(new md(q6, 1));
        g10.addView(o10, i7.f6.t(-1, 48, 55, 10, 25, 10, 14));
        q6.setCustomView(g10);
        return q6;
    }

    public static CharSequence f0(CharSequence charSequence, TextPaint textPaint, float f9, float f10, boolean z10) {
        if (u1 == null) {
            u1 = new HashMap();
        }
        int i10 = ((textPaint.getFontMetricsInt().bottom * (z10 ? 1 : -1)) * ((int) (f9 * 100.0f))) - ((int) (100.0f * f10));
        SpannableString spannableString = (SpannableString) u1.get(Integer.valueOf(i10));
        if (spannableString == null) {
            spannableString = new SpannableString("T");
            if (z10) {
                org.telegram.ui.Components.iq iqVar = new org.telegram.ui.Components.iq(R.drawable.mini_gram_72, 0);
                iqVar.setScale(f9, f9);
                iqVar.setColorKey(org.telegram.ui.ActionBar.g6.o6);
                iqVar.setRelativeSize(textPaint.getFontMetricsInt());
                iqVar.spaceScaleX = 0.9f;
                spannableString.setSpan(iqVar, 0, spannableString.length(), 33);
            } else {
                org.telegram.ui.Components.iq iqVar2 = new org.telegram.ui.Components.iq(R.drawable.mini_gram_16, 0);
                iqVar2.setScale(f9, f9);
                iqVar2.setTranslateY(f10);
                iqVar2.spaceScaleX = 0.95f;
                spannableString.setSpan(iqVar2, 0, spannableString.length(), 33);
            }
            u1.put(Integer.valueOf(i10), spannableString);
        }
        return AndroidUtilities.replaceMultipleCharSequence("TON", charSequence, spannableString);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void h0(Context context, int i10, TL_stats.BroadcastRevenueTransaction broadcastRevenueTransaction, long j10, org.telegram.ui.ActionBar.c6 c6Var) {
        long j11;
        org.telegram.ui.ActionBar.f3 f3Var;
        String string;
        long j12;
        long j13;
        long j14;
        boolean z10;
        char c3;
        String str;
        boolean z11;
        org.telegram.ui.ActionBar.f3 f3Var2;
        String userName;
        TLRPC.User user;
        org.telegram.ui.ActionBar.f3 q6 = org.telegram.messenger.x3.q(context, c6Var, false, false);
        LinearLayout g10 = org.telegram.messenger.x3.g(context, 1);
        boolean z12 = broadcastRevenueTransaction instanceof TL_stats.TL_broadcastRevenueTransactionWithdrawal;
        if (z12) {
            TL_stats.TL_broadcastRevenueTransactionWithdrawal tL_broadcastRevenueTransactionWithdrawal = (TL_stats.TL_broadcastRevenueTransactionWithdrawal) broadcastRevenueTransaction;
            String string2 = LocaleController.getString(R.string.MonetizationTransactionDetailWithdraw);
            long j15 = tL_broadcastRevenueTransactionWithdrawal.date;
            j11 = 0;
            j12 = tL_broadcastRevenueTransactionWithdrawal.amount;
            z10 = tL_broadcastRevenueTransactionWithdrawal.pending;
            f3Var = q6;
            j13 = j15;
            j14 = 0;
            c3 = 65535;
            str = string2;
            z11 = tL_broadcastRevenueTransactionWithdrawal.failed;
        } else {
            j11 = 0;
            if (broadcastRevenueTransaction instanceof TL_stats.TL_broadcastRevenueTransactionProceeds) {
                TL_stats.TL_broadcastRevenueTransactionProceeds tL_broadcastRevenueTransactionProceeds = (TL_stats.TL_broadcastRevenueTransactionProceeds) broadcastRevenueTransaction;
                string = LocaleController.getString(R.string.MonetizationTransactionDetailProceed);
                long j16 = tL_broadcastRevenueTransactionProceeds.from_date;
                long j17 = tL_broadcastRevenueTransactionProceeds.to_date;
                f3Var = q6;
                j12 = tL_broadcastRevenueTransactionProceeds.amount;
                j14 = j17;
                j13 = j16;
            } else {
                f3Var = q6;
                if (!(broadcastRevenueTransaction instanceof TL_stats.TL_broadcastRevenueTransactionRefund)) {
                    return;
                }
                TL_stats.TL_broadcastRevenueTransactionRefund tL_broadcastRevenueTransactionRefund = (TL_stats.TL_broadcastRevenueTransactionRefund) broadcastRevenueTransaction;
                string = LocaleController.getString(R.string.MonetizationTransactionDetailRefund);
                long j18 = tL_broadcastRevenueTransactionRefund.from_date;
                j12 = tL_broadcastRevenueTransactionRefund.amount;
                j13 = j18;
                j14 = 0;
            }
            z10 = false;
            c3 = 1;
            str = string;
            z11 = false;
        }
        long j19 = j14;
        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.US);
        decimalFormatSymbols.setDecimalSeparator('.');
        DecimalFormat decimalFormat = new DecimalFormat("#.##", decimalFormatSymbols);
        decimalFormat.setMinimumFractionDigits(2);
        decimalFormat.setMaximumFractionDigits(12);
        decimalFormat.setGroupingUsed(false);
        TextView textView = new TextView(context);
        textView.setGravity(17);
        boolean z13 = z10;
        b.g(18.0f, 1, textView);
        textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, c3 < 0 ? org.telegram.ui.ActionBar.g6.q7 : org.telegram.ui.ActionBar.g6.l8, false));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) (c3 < 0 ? "-" : "+"));
        spannableStringBuilder.append((CharSequence) decimalFormat.format(Math.round((Math.abs(j12) / 1.0E9d) * 100000.0d) / 100000.0d));
        spannableStringBuilder.append((CharSequence) " TON");
        int indexOf = TextUtils.indexOf(spannableStringBuilder, ".");
        if (indexOf >= 0) {
            spannableStringBuilder.setSpan(new RelativeSizeSpan(1.3333334f), 0, indexOf, 33);
        }
        textView.setText(spannableStringBuilder);
        g10.addView(textView, i7.f6.t(-1, -2, 49, 0, 24, 0, 6));
        TextView textView2 = new TextView(context);
        textView2.setGravity(17);
        textView2.setTextSize(1, 13.0f);
        textView2.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.y6, c6Var));
        if (z13) {
            textView2.setText(LocaleController.getString(R.string.MonetizationTransactionPending));
        } else if (j13 == j11) {
            textView2.setText(LocaleController.formatShortDateTime(j19));
        } else if (j19 == j11) {
            textView2.setText(LocaleController.formatShortDateTime(j13));
        } else {
            textView2.setText(LocaleController.formatShortDateTime(j13) + " - " + LocaleController.formatShortDateTime(j19));
        }
        if (z11) {
            textView2.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.q7, c6Var));
            textView2.setText(TextUtils.concat(textView2.getText(), " — ", LocaleController.getString(R.string.MonetizationTransactionNotCompleted)));
        }
        g10.addView(textView2, i7.f6.t(-1, -2, 49, 0, 0, 0, 0));
        TextView textView3 = new TextView(context);
        textView3.setGravity(17);
        b.g(14.0f, 1, textView3);
        textView3.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.G6, c6Var));
        textView3.setText(str);
        g10.addView(textView3, i7.f6.t(-1, -2, 49, 0, 27, 0, 0));
        if (broadcastRevenueTransaction instanceof TL_stats.TL_broadcastRevenueTransactionProceeds) {
            FrameLayout frameLayout = new FrameLayout(context);
            frameLayout.setBackground(org.telegram.ui.ActionBar.g6.c0(AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.ci, c6Var)));
            if (j10 < j11) {
                TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-j10));
                if (chat == 0) {
                    userName = "";
                    user = chat;
                } else {
                    userName = chat.title;
                    user = chat;
                }
            } else {
                TLRPC.User user2 = MessagesController.getInstance(i10).getUser(Long.valueOf(j10));
                userName = UserObject.getUserName(user2);
                user = user2;
            }
            org.telegram.ui.Components.t9 t9Var = new org.telegram.ui.Components.t9(context);
            t9Var.setRoundRadius(AndroidUtilities.dp(28.0f));
            org.telegram.ui.Components.e9 e9Var = new org.telegram.ui.Components.e9((org.telegram.ui.ActionBar.c6) null);
            e9Var.p(user);
            t9Var.e(user, e9Var);
            frameLayout.addView(t9Var, i7.f6.e(28, 28, 51));
            TextView textView4 = new TextView(context);
            textView4.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.j5, c6Var));
            textView4.setTextSize(1, 13.0f);
            textView4.setSingleLine();
            textView4.setText(userName);
            frameLayout.addView(textView4, i7.f6.d(-2, -2.0f, 19, 37.0f, 0.0f, 10.0f, 0.0f));
            g10.addView(frameLayout, i7.f6.t(-2, 28, 1, 42, 10, 42, 0));
        }
        nh.d o10 = org.telegram.messenger.x3.o(24, context, c6Var, true);
        if (z12) {
            TL_stats.TL_broadcastRevenueTransactionWithdrawal tL_broadcastRevenueTransactionWithdrawal2 = (TL_stats.TL_broadcastRevenueTransactionWithdrawal) broadcastRevenueTransaction;
            if ((tL_broadcastRevenueTransactionWithdrawal2.flags & 2) != 0) {
                o10.g(LocaleController.getString(R.string.MonetizationTransactionDetailWithdrawButton), false, true);
                o10.setOnClickListener(new nh.r7(17, context, tL_broadcastRevenueTransactionWithdrawal2));
                f3Var2 = f3Var;
                g10.addView(o10, i7.f6.t(-1, 48, 55, 18, 30, 18, 14));
                f3Var2.setCustomView(g10);
                f3Var2.show();
            }
        }
        o10.g(LocaleController.getString(R.string.OK), false, true);
        org.telegram.ui.ActionBar.f3 f3Var3 = f3Var;
        o10.setOnClickListener(new md(f3Var3, 0));
        f3Var2 = f3Var3;
        g10.addView(o10, i7.f6.t(-1, 48, 55, 18, 30, 18, 14));
        f3Var2.setCustomView(g10);
        f3Var2.show();
    }

    @Override // r0.m
    public final void E(ViewGroup viewGroup, int i10, int i11, int[] iArr, int i12) {
        org.telegram.ui.Components.u51 u51Var = this.W0;
        if (viewGroup == u51Var) {
            zd zdVar = this.a1;
            if (zdVar.isAttachedToWindow()) {
                ((View) zdVar.getParent()).getTop();
                int i13 = AndroidUtilities.REPLACING_TAG_TYPE_LINK;
                org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
                int bottom = ((View) zdVar.getParent()).getBottom();
                if (i11 >= 0) {
                    if (i11 > 0) {
                        org.telegram.ui.Components.jl0 currentListView = zdVar.getCurrentListView();
                        if (u51Var.getHeight() - bottom < AndroidUtilities.dp(8.0f) + u51Var.getPaddingBottom() || currentListView == null || currentListView.canScrollVertically(1)) {
                            return;
                        }
                        iArr[1] = i11;
                        u51Var.B0();
                        return;
                    }
                    return;
                }
                org.telegram.ui.ActionBar.l lVar = this.h1;
                if (lVar != null) {
                    lVar.setCastShadows(!isAttachedToWindow() || u51Var.getHeight() - bottom < 0);
                }
                if (u51Var.getHeight() - bottom >= AndroidUtilities.dp(8.0f) + u51Var.getPaddingBottom()) {
                    org.telegram.ui.Components.jl0 currentListView2 = zdVar.getCurrentListView();
                    int L0 = ((f2.j0) currentListView2.getLayoutManager()).L0();
                    if (L0 != -1) {
                        f2.n1 K = currentListView2.K(L0);
                        int top = K != null ? K.a.getTop() : -1;
                        int paddingTop = currentListView2.getPaddingTop();
                        if (top == paddingTop && L0 == 0) {
                            return;
                        }
                        iArr[1] = L0 != 0 ? i11 : Math.max(i11, top - paddingTop);
                        currentListView2.scrollBy(0, i11);
                    }
                }
            }
        }
    }

    public final void Z(TLRPC.TL_payments_starsRevenueStats tL_payments_starsRevenueStats) {
        FrameLayout frameLayout;
        uf.b bVar;
        ArrayList arrayList;
        boolean z10 = this.m1 == null;
        this.g1 = tL_payments_starsRevenueStats.usd_rate;
        f91 f02 = t91.f0(tL_payments_starsRevenueStats.revenue_graph, LocaleController.getString(R.string.MonetizationGraphStarsRevenue), 2, false);
        this.m1 = f02;
        if (f02 != null && (bVar = f02.d) != null && (arrayList = bVar.d) != null && !arrayList.isEmpty() && this.m1.d.d.get(0) != null) {
            ((uf.a) this.m1.d.d.get(0)).g = org.telegram.ui.ActionBar.g6.kj;
            this.m1.d.h = (float) ((1.0d / this.g1) / 100.0d);
        }
        g0(false, tL_payments_starsRevenueStats.status);
        if (!this.b1 && (frameLayout = this.Y0) != null) {
            frameLayout.animate().alpha(0.0f).setDuration(380L).setInterpolator(org.telegram.ui.Components.jr.h).withEndAction(new jd(this, 7)).start();
        }
        org.telegram.ui.Components.u51 u51Var = this.W0;
        if (u51Var != null) {
            u51Var.U2.N(!z10);
            if (z10) {
                u51Var.u0(0);
            }
        }
    }

    public final void a0() {
        if (isAttachedToWindow() && this.b1 && this.n1 && MessagesController.getGlobalMainSettings().getBoolean("monetizationadshint", true)) {
            this.s0.showDialog(d0(getContext(), this.t0, false));
            MessagesController.getGlobalMainSettings().edit().putBoolean("monetizationadshint", false).apply();
        }
    }

    public final void b0(boolean z10, TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, TwoStepVerificationActivity twoStepVerificationActivity) {
        TLRPC.TL_payments_getStarsRevenueWithdrawalUrl tL_payments_getStarsRevenueWithdrawalUrl;
        t91 t91Var = this.s0;
        if (t91Var == null) {
            return;
        }
        Activity parentActivity = t91Var.getParentActivity();
        int i10 = this.u0;
        TLRPC.User currentUser = UserConfig.getInstance(i10).getCurrentUser();
        if (parentActivity == null || currentUser == null) {
            return;
        }
        long j10 = this.v0;
        if (z10) {
            tL_payments_getStarsRevenueWithdrawalUrl = new TLRPC.TL_payments_getStarsRevenueWithdrawalUrl();
            tL_payments_getStarsRevenueWithdrawalUrl.ton = false;
            tL_payments_getStarsRevenueWithdrawalUrl.peer = MessagesController.getInstance(i10).getInputPeer(j10);
            if (inputCheckPasswordSRP == null) {
                inputCheckPasswordSRP = new TLRPC.TL_inputCheckPasswordEmpty();
            }
            tL_payments_getStarsRevenueWithdrawalUrl.password = inputCheckPasswordSRP;
            tL_payments_getStarsRevenueWithdrawalUrl.flags |= 2;
            tL_payments_getStarsRevenueWithdrawalUrl.amount = this.T0;
        } else {
            tL_payments_getStarsRevenueWithdrawalUrl = new TLRPC.TL_payments_getStarsRevenueWithdrawalUrl();
            tL_payments_getStarsRevenueWithdrawalUrl.ton = true;
            tL_payments_getStarsRevenueWithdrawalUrl.peer = MessagesController.getInstance(i10).getInputPeer(j10);
            if (inputCheckPasswordSRP == null) {
                inputCheckPasswordSRP = new TLRPC.TL_inputCheckPasswordEmpty();
            }
            tL_payments_getStarsRevenueWithdrawalUrl.password = inputCheckPasswordSRP;
        }
        ConnectionsManager.getInstance(i10).sendRequest(tL_payments_getStarsRevenueWithdrawalUrl, new nh.q1(this, twoStepVerificationActivity, parentActivity, z10, 1));
    }

    public final void c0(boolean z10) {
        if (this.c1) {
            int i10 = this.u0;
            jh.b0 g10 = jh.b0.g(i10);
            long j10 = this.v0;
            TLRPC.TL_payments_starsRevenueStats h = g10.h(j10, z10);
            if (h != null) {
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.c(28, this, h));
                return;
            }
            TLRPC.TL_payments_getStarsRevenueStats tL_payments_getStarsRevenueStats = new TLRPC.TL_payments_getStarsRevenueStats();
            tL_payments_getStarsRevenueStats.peer = MessagesController.getInstance(i10).getInputPeer(j10);
            tL_payments_getStarsRevenueStats.dark = org.telegram.ui.ActionBar.g6.I.q();
            ConnectionsManager.getInstance(i10).sendRequest(tL_payments_getStarsRevenueStats, new pd(this, 2));
        }
    }

    public final void e0() {
        zd zdVar = this.a1;
        jd jdVar = zdVar.e;
        boolean[] zArr = zdVar.s;
        boolean a2 = zdVar.a();
        for (int i10 = 0; i10 < 2; i10++) {
            if (zArr[i10]) {
                return;
            }
            if (i10 == 1) {
                zdVar.h.clear();
                zdVar.f = "";
            } else {
                zdVar.n.clear();
                zdVar.r = "";
            }
            zArr[i10] = false;
            zdVar.c(i10);
        }
        if (zdVar.a() == a2 || jdVar == null) {
            return;
        }
        zdVar.e();
        jdVar.run();
    }

    public final void g0(boolean z10, TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus) {
        ae aeVar;
        org.telegram.ui.Components.k51 k51Var;
        ae aeVar2;
        int i10;
        de deVar = this;
        ae aeVar3 = deVar.q1;
        ae aeVar4 = deVar.p1;
        org.telegram.ui.Components.o6 o6Var = deVar.F0;
        RelativeSizeSpan relativeSizeSpan = deVar.D0;
        org.telegram.ui.Components.o6 o6Var2 = deVar.E0;
        ae aeVar5 = deVar.o1;
        if (z10) {
            aeVar5.a = true;
            long j10 = tL_starsRevenueStatus.available_balance.amount;
            aeVar5.d = j10;
            double d = j10 / 1.0E9d;
            long j11 = (long) (deVar.f1 * d * 100.0d);
            aeVar5.e = j11;
            if (deVar.Z0 == null) {
                DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.US);
                decimalFormatSymbols.setDecimalSeparator('.');
                aeVar2 = aeVar3;
                DecimalFormat decimalFormat = new DecimalFormat("#.##", decimalFormatSymbols);
                deVar.Z0 = decimalFormat;
                decimalFormat.setMinimumFractionDigits(2);
                i10 = 6;
                deVar.Z0.setMaximumFractionDigits(6);
                deVar.Z0.setGroupingUsed(false);
            } else {
                aeVar2 = aeVar3;
                i10 = 6;
            }
            DecimalFormat decimalFormat2 = deVar.Z0;
            if (d > 1.5d) {
                i10 = 2;
            }
            decimalFormat2.setMaximumFractionDigits(i10);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(f0("TON " + deVar.Z0.format(d), o6Var2.getPaint(), 0.9f, 0.0f, true));
            int indexOf = TextUtils.indexOf(spannableStringBuilder, ".");
            if (indexOf >= 0) {
                spannableStringBuilder.setSpan(relativeSizeSpan, indexOf, spannableStringBuilder.length(), 33);
            }
            o6Var2.setText(spannableStringBuilder);
            o6Var.setText("≈" + BillingController.getInstance().formatCurrency(j11, "USD"));
            aeVar5.f = "USD";
            aeVar4.a = true;
            long j12 = tL_starsRevenueStatus.current_balance.amount;
            aeVar4.d = j12;
            deVar = this;
            double d10 = deVar.f1;
            aeVar4.e = (long) ((j12 / 1.0E9d) * d10 * 100.0d);
            aeVar4.f = "USD";
            ae aeVar6 = aeVar2;
            aeVar6.a = true;
            long j13 = tL_starsRevenueStatus.overall_revenue.amount;
            aeVar6.d = j13;
            aeVar6.e = (long) ((j13 / 1.0E9d) * d10 * 100.0d);
            aeVar6.f = "USD";
            deVar.n1 = true;
            deVar.G0.setVisibility((tL_starsRevenueStatus.available_balance.amount <= 0 || !tL_starsRevenueStatus.withdrawal_enabled) ? 8 : 0);
        } else {
            double d11 = deVar.g1;
            if (d11 == 0.0d) {
                return;
            }
            aeVar5.g = true;
            TL_stars.StarsAmount starsAmount = tL_starsRevenueStatus.available_balance;
            aeVar5.i = starsAmount;
            aeVar5.j = (long) (starsAmount.amount * d11 * 100.0d);
            int i11 = tL_starsRevenueStatus.next_withdrawal_at;
            ud udVar = deVar.M0;
            if (o6Var2 == null || o6Var == null) {
                aeVar = aeVar3;
            } else {
                aeVar = aeVar3;
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(jh.ia.X0(false, TextUtils.concat("XTR ", jh.ia.J0(starsAmount, 0.8f, ' ')), 1.0f, null));
                int indexOf2 = TextUtils.indexOf(spannableStringBuilder2, ".");
                if (indexOf2 >= 0) {
                    spannableStringBuilder2.setSpan(relativeSizeSpan, indexOf2, spannableStringBuilder2.length(), 33);
                }
                deVar.J0 = starsAmount;
                deVar.K0.setText(spannableStringBuilder2);
                deVar.L0.setText("≈" + BillingController.getInstance().formatCurrency((long) (deVar.g1 * starsAmount.amount * 100.0d), "USD"));
                deVar.Q0.setVisibility(starsAmount.amount > 0 ? 0 : 8);
                if (deVar.S0) {
                    deVar.R0 = true;
                    long j14 = starsAmount.amount;
                    deVar.T0 = j14;
                    String l10 = Long.toString(j14);
                    jh.m mVar = deVar.U0;
                    mVar.setText(l10);
                    mVar.setSelection(mVar.getText().length());
                    deVar.R0 = false;
                    udVar.setEnabled(deVar.T0 > 0);
                }
                nh.d dVar = deVar.P0;
                if (dVar != null) {
                    dVar.setEnabled(starsAmount.amount > 0);
                }
                deVar.H0 = i11;
                id idVar = deVar.e1;
                AndroidUtilities.cancelRunOnUIThread(idVar);
                idVar.run();
            }
            aeVar5.f = "USD";
            aeVar4.g = true;
            TL_stars.StarsAmount starsAmount2 = tL_starsRevenueStatus.current_balance;
            aeVar4.i = starsAmount2;
            double d12 = starsAmount2.amount;
            double d13 = deVar.g1;
            aeVar4.j = (long) (d12 * d13 * 100.0d);
            aeVar4.f = "USD";
            ae aeVar7 = aeVar;
            aeVar7.g = true;
            aeVar7.i = tL_starsRevenueStatus.overall_revenue;
            aeVar7.j = (long) (r4.amount * d13 * 100.0d);
            aeVar7.f = "USD";
            deVar.n1 = true;
            LinearLayout linearLayout = deVar.O0;
            if (linearLayout != null) {
                linearLayout.setVisibility(tL_starsRevenueStatus.withdrawal_enabled ? 0 : 8);
            }
            if (udVar != null) {
                udVar.setVisibility((tL_starsRevenueStatus.available_balance.amount > 0 || BuildVars.DEBUG_PRIVATE_VERSION) ? 0 : 8);
            }
        }
        org.telegram.ui.Components.u51 u51Var = deVar.W0;
        if (u51Var == null || (k51Var = u51Var.U2) == null) {
            return;
        }
        k51Var.N(true);
    }

    @Override // org.telegram.ui.Components.hv0
    public /* bridge */ /* synthetic */ int[] getColorKeys() {
        return null;
    }

    @Override // r0.n
    public final void i(ViewGroup viewGroup, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        boolean z10;
        zd zdVar = this.a1;
        org.telegram.ui.Components.u51 u51Var = this.W0;
        if (viewGroup == u51Var) {
            try {
                if (zdVar.isAttachedToWindow()) {
                    org.telegram.ui.Components.jl0 currentListView = zdVar.getCurrentListView();
                    int bottom = ((View) zdVar.getParent()).getBottom();
                    org.telegram.ui.ActionBar.l lVar = this.h1;
                    if (lVar != null) {
                        if (isAttachedToWindow() && u51Var.getHeight() - bottom >= 0) {
                            z10 = false;
                            lVar.setCastShadows(z10);
                        }
                        z10 = true;
                        lVar.setCastShadows(z10);
                    }
                    if (u51Var.getHeight() - bottom >= u51Var.getPaddingBottom() + AndroidUtilities.dp(8.0f)) {
                        iArr[1] = i13;
                        currentListView.scrollBy(0, i13);
                    }
                }
            } catch (Throwable th2) {
                FileLog.e(th2);
                AndroidUtilities.runOnUIThread(new jd(this, 2));
            }
        }
    }

    @Override // r0.m
    public final void n(int i10, View view) {
        this.s1.a = 0;
    }

    @Override // r0.m
    public final boolean o(View view, View view2, int i10, int i11) {
        return i10 == 2;
    }

    @Override // org.telegram.ui.Components.hv0, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        t1 = this;
        super.onAttachedToWindow();
        a0();
    }

    @Override // org.telegram.ui.Components.hv0, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        t1 = null;
        super.onDetachedFromWindow();
        org.telegram.ui.ActionBar.l lVar = this.h1;
        if (lVar != null) {
            lVar.setCastShadows(true);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
    }

    @Override // r0.m
    public final void s(View view, View view2, int i10, int i11) {
        this.s1.a = i10;
    }

    public void setActionBar(org.telegram.ui.ActionBar.l lVar) {
        this.h1 = lVar;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
    }

    @Override // r0.m
    public final void c(ViewGroup viewGroup, int i10, int i11, int i12, int i13, int i14) {
    }
}
