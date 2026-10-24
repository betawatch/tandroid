package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Typeface;
import android.graphics.drawable.ShapeDrawable;
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

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class ie extends org.telegram.ui.Components.ow0 implements r0.m {
    public static ie x1;
    public static HashMap y1;
    public TL_stories.TL_premium_boostsStatus A0;
    public int B0;
    public final CharSequence C0;
    public final CharSequence D0;
    public final CharSequence E0;
    public final CharSequence F0;
    public final ai.r G0;
    public final RelativeSizeSpan H0;
    public final org.telegram.ui.Components.q6 I0;
    public final org.telegram.ui.Components.q6 J0;
    public final ei.d K0;
    public int L0;
    public final ai.r M0;
    public TL_stars.StarsAmount N0;
    public final org.telegram.ui.Components.q6 O0;
    public final org.telegram.ui.Components.q6 P0;
    public final zd Q0;
    public final org.telegram.ui.Components.xq[] R0;
    public final LinearLayout S0;
    public final ei.d T0;
    public final ai.s U0;
    public boolean V0;
    public boolean W0;
    public long X0;
    public final ai.t Y0;
    public org.telegram.ui.Components.qc Z0;
    public final org.telegram.ui.Components.j71 a1;
    public bh.l b1;
    public final FrameLayout c1;
    public DecimalFormat d1;
    public final ee e1;
    public final boolean f1;
    public final boolean g1;
    public SpannableStringBuilder h1;
    public final nd i1;
    public double j1;
    public double k1;
    public org.telegram.ui.ActionBar.k l1;
    public boolean m1;
    public boolean n1;
    public g91 o1;
    public g91 p1;
    public g91 q1;
    public boolean r1;
    public final fe s1;
    public final fe t1;
    public final fe u1;
    public final od v1;
    public final u91 w0;
    public final b2.u0 w1;
    public final org.telegram.ui.ActionBar.g6 x0;
    public final int y0;
    public final long z0;

    public ie(Activity activity, u91 u91Var, int i10, long j10, org.telegram.ui.ActionBar.g6 g6Var, boolean z10, boolean z11) {
        super(activity, null);
        this.N0 = TL_stars.StarsAmount.ofStars(0L);
        int i11 = 1;
        this.R0 = new org.telegram.ui.Components.xq[1];
        int i12 = 0;
        this.V0 = false;
        this.W0 = true;
        this.m1 = false;
        this.n1 = false;
        this.r1 = false;
        String string = LocaleController.getString(R.string.MonetizationOverviewAvailable);
        fe feVar = new fe();
        feVar.a = false;
        feVar.b = "TON";
        feVar.h = "XTR";
        feVar.c = string;
        this.s1 = feVar;
        String string2 = LocaleController.getString(R.string.MonetizationOverviewLastWithdrawal);
        fe feVar2 = new fe();
        feVar2.a = false;
        feVar2.b = "TON";
        feVar2.h = "XTR";
        feVar2.c = string2;
        this.t1 = feVar2;
        String string3 = LocaleController.getString(R.string.MonetizationOverviewTotal);
        fe feVar3 = new fe();
        feVar3.a = false;
        feVar3.b = "TON";
        feVar3.h = "XTR";
        feVar3.c = string3;
        this.u1 = feVar3;
        this.v1 = new od(this, 3);
        this.w1 = new b2.u0();
        this.f1 = z10;
        this.g1 = z11;
        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.US);
        decimalFormatSymbols.setDecimalSeparator('.');
        DecimalFormat decimalFormat = new DecimalFormat("#.##", decimalFormatSymbols);
        this.d1 = decimalFormat;
        int i13 = 2;
        decimalFormat.setMinimumFractionDigits(2);
        this.d1.setMaximumFractionDigits(12);
        this.d1.setGroupingUsed(false);
        this.w0 = u91Var;
        this.x0 = g6Var;
        this.y0 = i10;
        this.z0 = j10;
        long j11 = -j10;
        TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(j11));
        if (chat != null) {
            this.B0 = chat.level;
        }
        MessagesController.getInstance(i10).getBoostsController().getBoostsStats(j10, new u3(this, i13));
        b0(false);
        if (z10) {
            TLRPC.TL_payments_getStarsRevenueStats tL_payments_getStarsRevenueStats = new TLRPC.TL_payments_getStarsRevenueStats();
            tL_payments_getStarsRevenueStats.dark = org.telegram.ui.ActionBar.k6.I.q();
            tL_payments_getStarsRevenueStats.ton = true;
            tL_payments_getStarsRevenueStats.peer = MessagesController.getInstance(i10).getInputPeer(j10);
            TLRPC.ChatFull chatFull = MessagesController.getInstance(i10).getChatFull(j11);
            if (chatFull != null) {
                boolean z12 = chatFull.restricted_sponsored;
                this.m1 = z12;
                this.n1 = z12;
            }
            ConnectionsManager.getInstance(i10).sendRequest(tL_payments_getStarsRevenueStats, new ud(this, i11), null, null, 0, ConnectionsManager.DEFAULT_DATACENTER_ID, 1, true);
        }
        TLRPC.Chat chat2 = MessagesController.getInstance(i10).getChat(Long.valueOf(j11));
        this.C0 = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.MonetizationInfo, 50), -1, 3, new s1(u91Var, activity, g6Var, 13), g6Var), true);
        this.D0 = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(MessagesController.getInstance(i10).channelRevenueWithdrawalEnabled ? R.string.MonetizationBalanceInfo : R.string.MonetizationBalanceInfoNotAvailable), -1, 3, new od(this, 8)), true);
        this.E0 = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString((z11 && z10) ? R.string.MonetizationProceedsStarsTONInfo : z11 ? R.string.MonetizationProceedsStarsInfo : R.string.MonetizationProceedsTONInfo), -1, 3, new nd(this, (z11 && z10) ? R.string.MonetizationProceedsStarsTONInfoLink : z11 ? R.string.MonetizationProceedsStarsInfoLink : R.string.MonetizationProceedsTONInfoLink, i12), g6Var), true);
        this.F0 = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(chat2) ? R.string.MonetizationStarsInfo : R.string.MonetizationStarsInfoGroup), new od(this, i12)), true);
        int i14 = org.telegram.ui.ActionBar.k6.a7;
        org.telegram.ui.ActionBar.r6.i(i14, this, g6Var);
        this.e1 = new ee(this, activity, i10, j10, u91Var.getClassGuid(), new od(this, i11), g6Var);
        ai.r rVar = new ai.r(activity, 2);
        this.G0 = rVar;
        rVar.setOrientation(1);
        int i15 = org.telegram.ui.ActionBar.k6.d6;
        org.telegram.ui.ActionBar.r6.i(i15, rVar, g6Var);
        rVar.setPadding(0, 0, 0, AndroidUtilities.dp(17.0f));
        org.telegram.ui.Components.q6 q6Var = new org.telegram.ui.Components.q6(activity, false, true, true);
        this.I0 = q6Var;
        q6Var.setTypeface(AndroidUtilities.bold());
        int i16 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.r6.a0(q6Var, i16, g6Var);
        q6Var.setTextSize(AndroidUtilities.dp(32.0f));
        q6Var.setGravity(17);
        this.H0 = new RelativeSizeSpan(0.6770833f);
        rVar.addView(q6Var, w7.z5.t(-1, 38, 49, 22, 15, 22, 0));
        org.telegram.ui.Components.q6 q6Var2 = new org.telegram.ui.Components.q6(activity, true, true, true);
        this.J0 = q6Var2;
        q6Var2.setGravity(17);
        int i17 = org.telegram.ui.ActionBar.k6.y6;
        org.telegram.ui.ActionBar.r6.a0(q6Var2, i17, g6Var);
        q6Var2.setTextSize(AndroidUtilities.dp(14.0f));
        rVar.addView(q6Var2, w7.z5.d(-1, 17.0f, 49, 22.0f, 4.0f, 22.0f, 0.0f));
        ei.d dVar = new ei.d(activity, g6Var, true);
        dVar.setRoundRadius(24);
        this.K0 = dVar;
        dVar.setEnabled(MessagesController.getInstance(i10).channelRevenueWithdrawalEnabled);
        dVar.i(LocaleController.getString(R.string.MonetizationWithdraw), false, true);
        dVar.setVisibility(8);
        dVar.setOnClickListener(new org.telegram.ui.ActionBar.s1(8, this, u91Var));
        rVar.addView(dVar, w7.z5.d(-1, 48.0f, 55, 18.0f, 13.0f, 18.0f, 0.0f));
        ai.r rVar2 = new ai.r(activity, 3);
        this.M0 = rVar2;
        rVar2.setOrientation(1);
        org.telegram.ui.ActionBar.r6.i(i15, rVar2, g6Var);
        rVar2.setPadding(0, 0, 0, AndroidUtilities.dp(17.0f));
        org.telegram.ui.Components.q6 q6Var3 = new org.telegram.ui.Components.q6(activity, false, true, true);
        this.O0 = q6Var3;
        q6Var3.setTypeface(AndroidUtilities.bold());
        org.telegram.ui.ActionBar.r6.a0(q6Var3, i16, g6Var);
        q6Var3.setTextSize(AndroidUtilities.dp(32.0f));
        q6Var3.setGravity(17);
        new RelativeSizeSpan(0.6770833f);
        rVar2.addView(q6Var3, w7.z5.t(-1, 38, 49, 22, 15, 22, 0));
        org.telegram.ui.Components.q6 q6Var4 = new org.telegram.ui.Components.q6(activity, true, true, true);
        this.P0 = q6Var4;
        q6Var4.setGravity(17);
        org.telegram.ui.ActionBar.r6.a0(q6Var4, i17, g6Var);
        q6Var4.setTextSize(AndroidUtilities.dp(14.0f));
        rVar2.addView(q6Var4, w7.z5.d(-1, 17.0f, 49, 22.0f, 4.0f, 22.0f, 0.0f));
        ai.s sVar = new ai.s(this, activity, i11);
        this.U0 = sVar;
        sVar.setVisibility(8);
        sVar.setText(LocaleController.getString(R.string.BotStarsWithdrawPlaceholder));
        sVar.setLeftPadding(AndroidUtilities.dp(36.0f));
        ai.t tVar = new ai.t(activity, 2);
        this.Y0 = tVar;
        tVar.setFocusable(false);
        org.telegram.ui.ActionBar.r6.W(tVar, i16, g6Var);
        tVar.setCursorSize(AndroidUtilities.dp(20.0f));
        tVar.setCursorWidth(1.5f);
        tVar.setBackground(null);
        tVar.setTextSize(1, 18.0f);
        tVar.setMaxLines(1);
        int dp = AndroidUtilities.dp(16.0f);
        tVar.setPadding(AndroidUtilities.dp(6.0f), dp, dp, dp);
        tVar.setInputType(2);
        tVar.setTypeface(Typeface.DEFAULT);
        org.telegram.ui.ActionBar.r6.E(tVar, org.telegram.ui.ActionBar.k6.uf, g6Var);
        org.telegram.ui.ActionBar.r6.m(tVar, 36, org.telegram.ui.ActionBar.k6.vf, g6Var);
        tVar.setGravity(LocaleController.isRTL ? 5 : 3);
        tVar.setOnFocusChangeListener(new pd(this, i12));
        tVar.addTextChangedListener(new yd(this));
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(0);
        ImageView imageView = new ImageView(activity);
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setImageResource(R.drawable.star_small_inner);
        linearLayout.addView(imageView, w7.z5.p(-2, -2, 0.0f, 19, 14, 0, 0, 0));
        linearLayout.addView(tVar, w7.z5.o(-1, -2, 1.0f, 119));
        sVar.e(tVar);
        sVar.addView(linearLayout, w7.z5.e(-1, -2, 48));
        rVar2.addView(sVar, w7.z5.t(-1, -2, 1, 18, 14, 18, 2));
        LinearLayout linearLayout2 = new LinearLayout(activity);
        this.S0 = linearLayout2;
        linearLayout2.setOrientation(0);
        zd zdVar = new zd(activity, g6Var, true);
        zdVar.setRoundRadius(24);
        this.Q0 = zdVar;
        zdVar.setEnabled(false);
        zdVar.i(LocaleController.formatPluralString("MonetizationStarsWithdraw", 0, new Object[0]), false, true);
        zdVar.setVisibility(0);
        zdVar.setOnClickListener(new ai.ia(this, i10, u91Var, 3));
        ei.d dVar2 = new ei.d(activity, g6Var, true);
        dVar2.setRoundRadius(24);
        this.T0 = dVar2;
        dVar2.setEnabled(false);
        dVar2.i(LocaleController.getString(R.string.MonetizationStarsAds), false, true);
        dVar2.setOnClickListener(new qd(this, i10, j10, activity));
        linearLayout2.addView(zdVar, w7.z5.o(-1, 48, 1.0f, 119));
        if (ChatObject.isChannelAndNotMegaGroup(chat2)) {
            linearLayout2.addView(new Space(activity), w7.z5.o(8, 48, 0.0f, 119));
            linearLayout2.addView(dVar2, w7.z5.o(-1, 48, 1.0f, 119));
        }
        rVar2.addView(linearLayout2, w7.z5.d(-1, 48.0f, 55, 18.0f, 13.0f, 18.0f, 0.0f));
        tVar.setOnEditorActionListener(new wd(0, this, u91Var));
        int i18 = 2;
        this.i1 = new nd(this, i10, i18);
        org.telegram.ui.Components.j71 j71Var = new org.telegram.ui.Components.j71(u91Var, new f5(this, i18), new xd(this), new xd(this));
        this.a1 = j71Var;
        j71Var.setClipToPadding(false);
        j71Var.t1();
        addView(j71Var);
        LinearLayout linearLayout3 = new LinearLayout(activity);
        linearLayout3.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(activity);
        this.c1 = frameLayout;
        org.telegram.ui.ActionBar.r6.i(i14, frameLayout, g6Var);
        frameLayout.addView(linearLayout3, w7.z5.e(-2, -2, 17));
        org.telegram.ui.Components.bk0 bk0Var = new org.telegram.ui.Components.bk0(activity);
        bk0Var.setAutoRepeat(true);
        bk0Var.f(R.raw.statistic_preload, 120, 120, null);
        bk0Var.d();
        TextView textView = new TextView(activity);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        int i19 = org.telegram.ui.ActionBar.k6.Oi;
        org.telegram.ui.ActionBar.r6.W(textView, i19, null);
        textView.setTag(Integer.valueOf(i19));
        textView.setText(LocaleController.getString("LoadingStats", R.string.LoadingStats));
        textView.setGravity(1);
        TextView textView2 = new TextView(activity);
        textView2.setTextSize(1, 15.0f);
        int i20 = org.telegram.ui.ActionBar.k6.Pi;
        org.telegram.ui.ActionBar.r6.W(textView2, i20, null);
        textView2.setTag(Integer.valueOf(i20));
        org.telegram.messenger.sl.m(R.string.LoadingStatsDescription, textView2, 1);
        linearLayout3.addView(bk0Var, w7.z5.t(120, 120, 1, 0, 0, 0, 20));
        linearLayout3.addView(textView, w7.z5.t(-2, -2, 1, 0, 0, 0, 10));
        linearLayout3.addView(textView2, w7.z5.q(-2, -2, 1));
        addView(frameLayout, w7.z5.e(-1, -1, 119));
    }

    public static org.telegram.ui.ActionBar.h3 c0(Context context, org.telegram.ui.ActionBar.g6 g6Var, boolean z10) {
        org.telegram.ui.ActionBar.h3 j10 = org.telegram.messenger.sl.j(1, context, g6Var, false);
        LinearLayout e = org.telegram.messenger.sl.e(context, 1);
        e.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        org.telegram.ui.Components.bk0 bk0Var = new org.telegram.ui.Components.bk0(context);
        bk0Var.setScaleType(ImageView.ScaleType.CENTER);
        bk0Var.setImageResource(R.drawable.large_monetize);
        bk0Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        int dp = AndroidUtilities.dp(80.0f);
        int i10 = org.telegram.ui.ActionBar.k6.Oh;
        ShapeDrawable K = org.telegram.ui.ActionBar.k6.K(dp, org.telegram.ui.ActionBar.k6.w0(i10, g6Var));
        org.telegram.ui.ActionBar.n6 O = org.telegram.ui.ActionBar.r6.O(i10);
        bk0Var.setBackground(K);
        org.telegram.ui.ActionBar.r6.k(bk0Var, K, O, null, g6Var);
        e.addView(bk0Var, w7.z5.t(80, 80, 1, 0, 16, 0, 16));
        TextView textView = new TextView(context);
        textView.setGravity(17);
        com.google.android.gms.internal.play_billing.k3.m(20.0f, 1, textView);
        int i11 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.r6.W(textView, i11, g6Var);
        textView.setText(LocaleController.getString(z10 ? R.string.BotMonetizationInfoTitle : R.string.MonetizationInfoTitle));
        e.addView(textView, w7.z5.k(8.0f, 0.0f, 8.0f, 25.0f, -1, -2));
        e.addView(new ci.h4(context, R.drawable.msg_channel, LocaleController.getString(z10 ? R.string.BotMonetizationInfoFeature1Name : R.string.MonetizationInfoFeature1Name), LocaleController.getString(z10 ? R.string.BotMonetizationInfoFeature1Text : R.string.MonetizationInfoFeature1Text), g6Var), w7.z5.t(-1, -2, 49, 8, 0, 8, 16));
        e.addView(new ci.h4(context, R.drawable.menu_feature_split, LocaleController.getString(z10 ? R.string.BotMonetizationInfoFeature2Name : R.string.MonetizationInfoFeature2Name), LocaleController.getString(z10 ? R.string.BotMonetizationInfoFeature2Text : R.string.MonetizationInfoFeature2Text), g6Var), w7.z5.t(-1, -2, 49, 8, 0, 8, 16));
        e.addView(new ci.h4(context, R.drawable.menu_feature_withdrawals, LocaleController.getString(z10 ? R.string.BotMonetizationInfoFeature3Name : R.string.MonetizationInfoFeature3Name), LocaleController.getString(z10 ? R.string.BotMonetizationInfoFeature3Text : R.string.MonetizationInfoFeature3Text), g6Var), w7.z5.t(-1, -2, 49, 8, 0, 8, 16));
        View view = new View(context);
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d7, view, g6Var);
        e.addView(view, w7.z5.s(-1, 55, 12, 0, 12, 1.0f / AndroidUtilities.density, 0));
        org.telegram.ui.Components.z5 z5Var = new org.telegram.ui.Components.z5(context);
        z5Var.setGravity(17);
        z5Var.setTextSize(1, 20.0f);
        z5Var.setTypeface(AndroidUtilities.bold());
        org.telegram.ui.ActionBar.r6.W(z5Var, i11, g6Var);
        SpannableString spannableString = new SpannableString("💎");
        org.telegram.ui.Components.xq xqVar = new org.telegram.ui.Components.xq(R.drawable.mini_gram_72, 0);
        xqVar.recolorDrawable = false;
        xqVar.setScale(0.9f, 0.9f);
        xqVar.setRelativeSize(z5Var.getPaint().getFontMetricsInt());
        xqVar.spaceScaleX = 0.9f;
        spannableString.setSpan(xqVar, 0, spannableString.length(), 33);
        z5Var.setText(AndroidUtilities.replaceCharSequence("💎", LocaleController.getString(z10 ? R.string.BotMonetizationInfoTONTitle : R.string.MonetizationInfoTONTitle), spannableString));
        e.addView(z5Var, w7.z5.k(8.0f, 20.0f, 8.0f, 0.0f, -1, -2));
        org.telegram.ui.Components.y90 y90Var = new org.telegram.ui.Components.y90(context, g6Var);
        y90Var.setGravity(17);
        y90Var.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.r6.W(y90Var, i11, g6Var);
        org.telegram.ui.ActionBar.r6.I(y90Var, org.telegram.ui.ActionBar.k6.gc, g6Var);
        y90Var.setText(AndroidUtilities.withLearnMore(AndroidUtilities.replaceTags(LocaleController.getString(z10 ? R.string.BotMonetizationInfoTONText : R.string.MonetizationInfoTONText)), new ah.t(23, context, z10)));
        e.addView(y90Var, w7.z5.k(28.0f, 9.0f, 28.0f, 0.0f, -1, -2));
        ei.d g10 = org.telegram.messenger.sl.g(24, context, g6Var, true);
        g10.i(LocaleController.getString(R.string.GotIt), false, true);
        g10.setOnClickListener(new rd(j10, 1));
        e.addView(g10, w7.z5.t(-1, 48, 55, 10, 25, 10, 14));
        j10.setCustomView(e);
        return j10;
    }

    public static CharSequence e0(CharSequence charSequence, TextPaint textPaint, float f7, float f10, boolean z10) {
        if (y1 == null) {
            y1 = new HashMap();
        }
        int i10 = ((textPaint.getFontMetricsInt().bottom * (z10 ? 1 : -1)) * ((int) (f7 * 100.0f))) - ((int) (100.0f * f10));
        SpannableString spannableString = (SpannableString) y1.get(Integer.valueOf(i10));
        if (spannableString == null) {
            spannableString = new SpannableString("T");
            if (z10) {
                org.telegram.ui.Components.xq xqVar = new org.telegram.ui.Components.xq(R.drawable.mini_gram_72, 0);
                xqVar.recolorDrawable = false;
                xqVar.setScale(f7, f7);
                xqVar.setColorKey(org.telegram.ui.ActionBar.k6.o6);
                xqVar.setRelativeSize(textPaint.getFontMetricsInt());
                xqVar.spaceScaleX = 0.9f;
                spannableString.setSpan(xqVar, 0, spannableString.length(), 33);
            } else {
                org.telegram.ui.Components.xq xqVar2 = new org.telegram.ui.Components.xq(R.drawable.mini_gram_16, 0);
                xqVar2.recolorDrawable = false;
                xqVar2.setScale(f7, f7);
                xqVar2.setTranslateY(f10);
                xqVar2.spaceScaleX = 0.95f;
                spannableString.setSpan(xqVar2, 0, spannableString.length(), 33);
            }
            y1.put(Integer.valueOf(i10), spannableString);
        }
        return AndroidUtilities.replaceMultipleCharSequence("TON", charSequence, spannableString);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void g0(Context context, int i10, TL_stats.BroadcastRevenueTransaction broadcastRevenueTransaction, long j10, org.telegram.ui.ActionBar.g6 g6Var) {
        long j11;
        org.telegram.ui.ActionBar.h3 h3Var;
        String string;
        long j12;
        long j13;
        long j14;
        boolean z10;
        char c10;
        String str;
        boolean z11;
        org.telegram.ui.ActionBar.h3 h3Var2;
        String userName;
        TLRPC.User user;
        org.telegram.ui.ActionBar.h3 j15 = org.telegram.messenger.sl.j(1, context, g6Var, false);
        LinearLayout e = org.telegram.messenger.sl.e(context, 1);
        boolean z12 = broadcastRevenueTransaction instanceof TL_stats.TL_broadcastRevenueTransactionWithdrawal;
        if (z12) {
            TL_stats.TL_broadcastRevenueTransactionWithdrawal tL_broadcastRevenueTransactionWithdrawal = (TL_stats.TL_broadcastRevenueTransactionWithdrawal) broadcastRevenueTransaction;
            String string2 = LocaleController.getString(R.string.MonetizationTransactionDetailWithdraw);
            long j16 = tL_broadcastRevenueTransactionWithdrawal.date;
            j11 = 0;
            j12 = tL_broadcastRevenueTransactionWithdrawal.amount;
            z10 = tL_broadcastRevenueTransactionWithdrawal.pending;
            j13 = j16;
            c10 = 65535;
            h3Var = j15;
            str = string2;
            j14 = 0;
            z11 = tL_broadcastRevenueTransactionWithdrawal.failed;
        } else {
            j11 = 0;
            if (broadcastRevenueTransaction instanceof TL_stats.TL_broadcastRevenueTransactionProceeds) {
                TL_stats.TL_broadcastRevenueTransactionProceeds tL_broadcastRevenueTransactionProceeds = (TL_stats.TL_broadcastRevenueTransactionProceeds) broadcastRevenueTransaction;
                string = LocaleController.getString(R.string.MonetizationTransactionDetailProceed);
                long j17 = tL_broadcastRevenueTransactionProceeds.from_date;
                long j18 = tL_broadcastRevenueTransactionProceeds.to_date;
                h3Var = j15;
                j12 = tL_broadcastRevenueTransactionProceeds.amount;
                j14 = j18;
                j13 = j17;
            } else {
                h3Var = j15;
                if (!(broadcastRevenueTransaction instanceof TL_stats.TL_broadcastRevenueTransactionRefund)) {
                    return;
                }
                TL_stats.TL_broadcastRevenueTransactionRefund tL_broadcastRevenueTransactionRefund = (TL_stats.TL_broadcastRevenueTransactionRefund) broadcastRevenueTransaction;
                string = LocaleController.getString(R.string.MonetizationTransactionDetailRefund);
                long j19 = tL_broadcastRevenueTransactionRefund.from_date;
                j12 = tL_broadcastRevenueTransactionRefund.amount;
                j13 = j19;
                j14 = 0;
            }
            z10 = false;
            c10 = 1;
            str = string;
            z11 = false;
        }
        boolean z13 = z10;
        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.US);
        decimalFormatSymbols.setDecimalSeparator('.');
        long j20 = j14;
        DecimalFormat decimalFormat = new DecimalFormat("#.##", decimalFormatSymbols);
        decimalFormat.setMinimumFractionDigits(2);
        decimalFormat.setMaximumFractionDigits(12);
        decimalFormat.setGroupingUsed(false);
        TextView textView = new TextView(context);
        textView.setGravity(17);
        org.telegram.messenger.sl.k(18.0f, 1, textView);
        org.telegram.ui.ActionBar.r6.W(textView, c10 < 0 ? org.telegram.ui.ActionBar.k6.q7 : org.telegram.ui.ActionBar.k6.l8, null);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) (c10 < 0 ? "-" : "+"));
        spannableStringBuilder.append((CharSequence) decimalFormat.format(Math.round((Math.abs(j12) / 1.0E9d) * 100000.0d) / 100000.0d));
        spannableStringBuilder.append((CharSequence) " TON");
        int indexOf = TextUtils.indexOf(spannableStringBuilder, ".");
        if (indexOf >= 0) {
            spannableStringBuilder.setSpan(new RelativeSizeSpan(1.3333334f), 0, indexOf, 33);
        }
        textView.setText(spannableStringBuilder);
        e.addView(textView, w7.z5.t(-1, -2, 49, 0, 24, 0, 6));
        TextView textView2 = new TextView(context);
        textView2.setGravity(17);
        textView2.setTextSize(1, 13.0f);
        org.telegram.ui.ActionBar.r6.W(textView2, org.telegram.ui.ActionBar.k6.y6, g6Var);
        if (z13) {
            textView2.setText(LocaleController.getString(R.string.MonetizationTransactionPending));
        } else if (j13 == j11) {
            textView2.setText(LocaleController.formatShortDateTime(j20));
        } else if (j20 == j11) {
            textView2.setText(LocaleController.formatShortDateTime(j13));
        } else {
            textView2.setText(LocaleController.formatShortDateTime(j13) + " - " + LocaleController.formatShortDateTime(j20));
        }
        if (z11) {
            org.telegram.ui.ActionBar.r6.W(textView2, org.telegram.ui.ActionBar.k6.q7, g6Var);
            textView2.setText(TextUtils.concat(textView2.getText(), " — ", LocaleController.getString(R.string.MonetizationTransactionNotCompleted)));
        }
        e.addView(textView2, w7.z5.t(-1, -2, 49, 0, 0, 0, 0));
        TextView textView3 = new TextView(context);
        textView3.setGravity(17);
        org.telegram.messenger.sl.k(14.0f, 1, textView3);
        org.telegram.ui.ActionBar.r6.W(textView3, org.telegram.ui.ActionBar.k6.G6, g6Var);
        textView3.setText(str);
        e.addView(textView3, w7.z5.t(-1, -2, 49, 0, 27, 0, 0));
        if (broadcastRevenueTransaction instanceof TL_stats.TL_broadcastRevenueTransactionProceeds) {
            FrameLayout frameLayout = new FrameLayout(context);
            int dp = AndroidUtilities.dp(28.0f);
            int dp2 = AndroidUtilities.dp(28.0f);
            int i11 = org.telegram.ui.ActionBar.k6.ci;
            ShapeDrawable d02 = org.telegram.ui.ActionBar.k6.d0(dp, dp2, org.telegram.ui.ActionBar.k6.w0(i11, g6Var));
            org.telegram.ui.ActionBar.n6 O = org.telegram.ui.ActionBar.r6.O(i11);
            frameLayout.setBackground(d02);
            org.telegram.ui.ActionBar.r6.k(frameLayout, d02, O, null, g6Var);
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
            org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(context);
            w9Var.setRoundRadius(AndroidUtilities.dp(28.0f));
            org.telegram.ui.Components.h9 h9Var = new org.telegram.ui.Components.h9((org.telegram.ui.ActionBar.g6) null);
            h9Var.p(user);
            w9Var.e(user, h9Var);
            frameLayout.addView(w9Var, w7.z5.e(28, 28, 51));
            TextView textView4 = new TextView(context);
            org.telegram.ui.ActionBar.r6.W(textView4, org.telegram.ui.ActionBar.k6.j5, g6Var);
            textView4.setTextSize(1, 13.0f);
            textView4.setSingleLine();
            textView4.setText(userName);
            frameLayout.addView(textView4, w7.z5.d(-2, -2.0f, 19, 37.0f, 0.0f, 10.0f, 0.0f));
            e.addView(frameLayout, w7.z5.t(-2, 28, 1, 42, 10, 42, 0));
        }
        ei.d g10 = org.telegram.messenger.sl.g(24, context, g6Var, true);
        if (z12) {
            TL_stats.TL_broadcastRevenueTransactionWithdrawal tL_broadcastRevenueTransactionWithdrawal2 = (TL_stats.TL_broadcastRevenueTransactionWithdrawal) broadcastRevenueTransaction;
            if ((tL_broadcastRevenueTransactionWithdrawal2.flags & 2) != 0) {
                g10.i(LocaleController.getString(R.string.MonetizationTransactionDetailWithdrawButton), false, true);
                g10.setOnClickListener(new org.telegram.ui.ActionBar.s1(9, context, tL_broadcastRevenueTransactionWithdrawal2));
                h3Var2 = h3Var;
                e.addView(g10, w7.z5.t(-1, 48, 55, 18, 30, 18, 14));
                h3Var2.setCustomView(e);
                h3Var2.show();
            }
        }
        g10.i(LocaleController.getString(R.string.OK), false, true);
        org.telegram.ui.ActionBar.h3 h3Var3 = h3Var;
        g10.setOnClickListener(new rd(h3Var3, 0));
        h3Var2 = h3Var3;
        e.addView(g10, w7.z5.t(-1, 48, 55, 18, 30, 18, 14));
        h3Var2.setCustomView(e);
        h3Var2.show();
    }

    @Override // r0.l
    public final void D(ViewGroup viewGroup, int i10, int i11, int[] iArr, int i12) {
        org.telegram.ui.Components.j71 j71Var = this.a1;
        if (viewGroup == j71Var) {
            ee eeVar = this.e1;
            if (eeVar.isAttachedToWindow()) {
                ((View) eeVar.getParent()).getTop();
                int i13 = AndroidUtilities.REPLACING_TAG_TYPE_LINK;
                org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                int bottom = ((View) eeVar.getParent()).getBottom();
                if (i11 >= 0) {
                    if (i11 > 0) {
                        org.telegram.ui.Components.mm0 currentListView = eeVar.getCurrentListView();
                        if (j71Var.getHeight() - bottom < AndroidUtilities.dp(8.0f) + j71Var.getPaddingBottom() || currentListView == null || currentListView.canScrollVertically(1)) {
                            return;
                        }
                        iArr[1] = i11;
                        j71Var.B0();
                        return;
                    }
                    return;
                }
                org.telegram.ui.ActionBar.k kVar = this.l1;
                if (kVar != null) {
                    kVar.setCastShadows(!isAttachedToWindow() || j71Var.getHeight() - bottom < 0);
                }
                if (j71Var.getHeight() - bottom >= AndroidUtilities.dp(8.0f) + j71Var.getPaddingBottom()) {
                    org.telegram.ui.Components.mm0 currentListView2 = eeVar.getCurrentListView();
                    int L0 = ((s4.b0) currentListView2.getLayoutManager()).L0();
                    if (L0 != -1) {
                        s4.b1 K = currentListView2.K(L0);
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

    public final void Y(TLRPC.TL_payments_starsRevenueStats tL_payments_starsRevenueStats) {
        FrameLayout frameLayout;
        kg.b bVar;
        ArrayList arrayList;
        boolean z10 = this.q1 == null;
        this.k1 = tL_payments_starsRevenueStats.usd_rate;
        g91 f02 = u91.f0(tL_payments_starsRevenueStats.revenue_graph, LocaleController.getString(R.string.MonetizationGraphStarsRevenue), 2, false);
        this.q1 = f02;
        if (f02 != null && (bVar = f02.d) != null && (arrayList = bVar.d) != null && !arrayList.isEmpty() && this.q1.d.d.get(0) != null) {
            ((kg.a) this.q1.d.d.get(0)).g = org.telegram.ui.ActionBar.k6.kj;
            this.q1.d.h = (float) ((1.0d / this.k1) / 100.0d);
        }
        f0(false, tL_payments_starsRevenueStats.status);
        if (!this.f1 && (frameLayout = this.c1) != null) {
            frameLayout.animate().alpha(0.0f).setDuration(380L).setInterpolator(org.telegram.ui.Components.bs.h).withEndAction(new od(this, 7)).start();
        }
        org.telegram.ui.Components.j71 j71Var = this.a1;
        if (j71Var != null) {
            j71Var.Z2.N(!z10);
            if (z10) {
                j71Var.u0(0);
            }
        }
    }

    public final void Z() {
        if (isAttachedToWindow() && this.f1 && this.r1 && MessagesController.getGlobalMainSettings().getBoolean("monetizationadshint", true)) {
            this.w0.showDialog(c0(getContext(), this.x0, false));
            MessagesController.getGlobalMainSettings().edit().putBoolean("monetizationadshint", false).apply();
        }
    }

    public final void a0(TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, TwoStepVerificationActivity twoStepVerificationActivity, boolean z10) {
        TLRPC.TL_payments_getStarsRevenueWithdrawalUrl tL_payments_getStarsRevenueWithdrawalUrl;
        u91 u91Var = this.w0;
        if (u91Var == null) {
            return;
        }
        Activity parentActivity = u91Var.getParentActivity();
        int i10 = this.y0;
        TLRPC.User currentUser = UserConfig.getInstance(i10).getCurrentUser();
        if (parentActivity == null || currentUser == null) {
            return;
        }
        long j10 = this.z0;
        if (z10) {
            tL_payments_getStarsRevenueWithdrawalUrl = new TLRPC.TL_payments_getStarsRevenueWithdrawalUrl();
            tL_payments_getStarsRevenueWithdrawalUrl.ton = false;
            tL_payments_getStarsRevenueWithdrawalUrl.peer = MessagesController.getInstance(i10).getInputPeer(j10);
            if (inputCheckPasswordSRP == null) {
                inputCheckPasswordSRP = new TLRPC.TL_inputCheckPasswordEmpty();
            }
            tL_payments_getStarsRevenueWithdrawalUrl.password = inputCheckPasswordSRP;
            tL_payments_getStarsRevenueWithdrawalUrl.flags |= 2;
            tL_payments_getStarsRevenueWithdrawalUrl.amount = this.X0;
        } else {
            tL_payments_getStarsRevenueWithdrawalUrl = new TLRPC.TL_payments_getStarsRevenueWithdrawalUrl();
            tL_payments_getStarsRevenueWithdrawalUrl.ton = true;
            tL_payments_getStarsRevenueWithdrawalUrl.peer = MessagesController.getInstance(i10).getInputPeer(j10);
            if (inputCheckPasswordSRP == null) {
                inputCheckPasswordSRP = new TLRPC.TL_inputCheckPasswordEmpty();
            }
            tL_payments_getStarsRevenueWithdrawalUrl.password = inputCheckPasswordSRP;
        }
        ConnectionsManager.getInstance(i10).sendRequest(tL_payments_getStarsRevenueWithdrawalUrl, new ai.i4(this, twoStepVerificationActivity, parentActivity, z10));
    }

    public final void b0(boolean z10) {
        if (this.g1) {
            int i10 = this.y0;
            ai.k0 g10 = ai.k0.g(i10);
            long j10 = this.z0;
            TLRPC.TL_payments_starsRevenueStats h = g10.h(j10, z10);
            if (h != null) {
                AndroidUtilities.runOnUIThread(new h0(21, this, h));
                return;
            }
            TLRPC.TL_payments_getStarsRevenueStats tL_payments_getStarsRevenueStats = new TLRPC.TL_payments_getStarsRevenueStats();
            tL_payments_getStarsRevenueStats.peer = MessagesController.getInstance(i10).getInputPeer(j10);
            tL_payments_getStarsRevenueStats.dark = org.telegram.ui.ActionBar.k6.I.q();
            ConnectionsManager.getInstance(i10).sendRequest(tL_payments_getStarsRevenueStats, new ud(this, 2));
        }
    }

    public final void d0() {
        ee eeVar = this.e1;
        od odVar = eeVar.e;
        boolean[] zArr = eeVar.s;
        boolean a2 = eeVar.a();
        for (int i10 = 0; i10 < 2; i10++) {
            if (zArr[i10]) {
                return;
            }
            if (i10 == 1) {
                eeVar.h.clear();
                eeVar.f = "";
            } else {
                eeVar.n.clear();
                eeVar.r = "";
            }
            zArr[i10] = false;
            eeVar.c(i10);
        }
        if (eeVar.a() == a2 || odVar == null) {
            return;
        }
        eeVar.e();
        odVar.run();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void f0(boolean z10, TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus) {
        fe feVar;
        int i10;
        org.telegram.ui.Components.b71 b71Var;
        fe feVar2;
        int i11;
        ie ieVar = this;
        fe feVar3 = ieVar.u1;
        fe feVar4 = ieVar.t1;
        org.telegram.ui.Components.q6 q6Var = ieVar.J0;
        RelativeSizeSpan relativeSizeSpan = ieVar.H0;
        org.telegram.ui.Components.q6 q6Var2 = ieVar.I0;
        fe feVar5 = ieVar.s1;
        if (z10) {
            feVar5.a = true;
            long j10 = tL_starsRevenueStatus.available_balance.amount;
            feVar5.d = j10;
            double d = j10 / 1.0E9d;
            long j11 = (long) (ieVar.j1 * d * 100.0d);
            feVar5.e = j11;
            if (ieVar.d1 == null) {
                DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.US);
                decimalFormatSymbols.setDecimalSeparator('.');
                feVar2 = feVar3;
                DecimalFormat decimalFormat = new DecimalFormat("#.##", decimalFormatSymbols);
                ieVar.d1 = decimalFormat;
                decimalFormat.setMinimumFractionDigits(2);
                i11 = 6;
                ieVar.d1.setMaximumFractionDigits(6);
                ieVar.d1.setGroupingUsed(false);
            } else {
                feVar2 = feVar3;
                i11 = 6;
            }
            DecimalFormat decimalFormat2 = ieVar.d1;
            if (d > 1.5d) {
                i11 = 2;
            }
            decimalFormat2.setMaximumFractionDigits(i11);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(e0("TON " + ieVar.d1.format(d), q6Var2.getPaint(), 0.9f, 0.0f, true));
            int indexOf = TextUtils.indexOf(spannableStringBuilder, ".");
            if (indexOf >= 0) {
                spannableStringBuilder.setSpan(relativeSizeSpan, indexOf, spannableStringBuilder.length(), 33);
            }
            q6Var2.setText(spannableStringBuilder);
            q6Var.setText("≈" + BillingController.getInstance().formatCurrency(j11, "USD"));
            feVar5.f = "USD";
            feVar4.a = true;
            long j12 = tL_starsRevenueStatus.current_balance.amount;
            feVar4.d = j12;
            ieVar = this;
            double d10 = ieVar.j1;
            feVar4.e = (long) ((j12 / 1.0E9d) * d10 * 100.0d);
            feVar4.f = "USD";
            fe feVar6 = feVar2;
            feVar6.a = true;
            long j13 = tL_starsRevenueStatus.overall_revenue.amount;
            feVar6.d = j13;
            feVar6.e = (long) ((j13 / 1.0E9d) * d10 * 100.0d);
            feVar6.f = "USD";
            ieVar.r1 = true;
            ieVar.K0.setVisibility((tL_starsRevenueStatus.available_balance.amount <= 0 || !tL_starsRevenueStatus.withdrawal_enabled) ? 8 : 0);
        } else {
            double d11 = ieVar.k1;
            if (d11 == 0.0d) {
                return;
            }
            feVar5.g = true;
            TL_stars.StarsAmount starsAmount = tL_starsRevenueStatus.available_balance;
            feVar5.i = starsAmount;
            feVar5.j = (long) (starsAmount.amount * d11 * 100.0d);
            int i12 = tL_starsRevenueStatus.next_withdrawal_at;
            zd zdVar = ieVar.Q0;
            if (q6Var2 == null || q6Var == null) {
                feVar = feVar3;
                i10 = 0;
            } else {
                feVar = feVar3;
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(ai.nd.Y0(false, TextUtils.concat("XTR ", ai.nd.K0(starsAmount, 0.8f, ' ')), 1.0f, null));
                int indexOf2 = TextUtils.indexOf(spannableStringBuilder2, ".");
                if (indexOf2 >= 0) {
                    spannableStringBuilder2.setSpan(relativeSizeSpan, indexOf2, spannableStringBuilder2.length(), 33);
                }
                ieVar.N0 = starsAmount;
                ieVar.O0.setText(spannableStringBuilder2);
                ieVar.P0.setText("≈" + BillingController.getInstance().formatCurrency((long) (ieVar.k1 * starsAmount.amount * 100.0d), "USD"));
                ieVar.U0.setVisibility(starsAmount.amount > 0 ? 0 : 8);
                if (ieVar.W0) {
                    ieVar.V0 = true;
                    long j14 = starsAmount.amount;
                    ieVar.X0 = j14;
                    String l4 = Long.toString(j14);
                    ai.t tVar = ieVar.Y0;
                    tVar.setText(l4);
                    tVar.setSelection(tVar.getText().length());
                    i10 = 0;
                    ieVar.V0 = false;
                    zdVar.setEnabled(ieVar.X0 > 0);
                } else {
                    i10 = 0;
                }
                ei.d dVar = ieVar.T0;
                if (dVar != null) {
                    dVar.setEnabled(starsAmount.amount > 0 ? 1 : i10);
                }
                ieVar.L0 = i12;
                nd ndVar = ieVar.i1;
                AndroidUtilities.cancelRunOnUIThread(ndVar);
                ndVar.run();
            }
            feVar5.f = "USD";
            feVar4.g = true;
            TL_stars.StarsAmount starsAmount2 = tL_starsRevenueStatus.current_balance;
            feVar4.i = starsAmount2;
            double d12 = starsAmount2.amount;
            double d13 = ieVar.k1;
            feVar4.j = (long) (d12 * d13 * 100.0d);
            feVar4.f = "USD";
            fe feVar7 = feVar;
            feVar7.g = true;
            feVar7.i = tL_starsRevenueStatus.overall_revenue;
            feVar7.j = (long) (r4.amount * d13 * 100.0d);
            feVar7.f = "USD";
            ieVar.r1 = true;
            LinearLayout linearLayout = ieVar.S0;
            if (linearLayout != null) {
                linearLayout.setVisibility(tL_starsRevenueStatus.withdrawal_enabled ? i10 : 8);
            }
            if (zdVar != null) {
                zdVar.setVisibility((tL_starsRevenueStatus.available_balance.amount > 0 || BuildVars.DEBUG_PRIVATE_VERSION) ? i10 : 8);
            }
        }
        org.telegram.ui.Components.j71 j71Var = ieVar.a1;
        if (j71Var == null || (b71Var = j71Var.Z2) == null) {
            return;
        }
        b71Var.N(true);
    }

    @Override // r0.m
    public final void h(ViewGroup viewGroup, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        boolean z10;
        ee eeVar = this.e1;
        org.telegram.ui.Components.j71 j71Var = this.a1;
        if (viewGroup == j71Var) {
            try {
                if (eeVar.isAttachedToWindow()) {
                    org.telegram.ui.Components.mm0 currentListView = eeVar.getCurrentListView();
                    int bottom = ((View) eeVar.getParent()).getBottom();
                    org.telegram.ui.ActionBar.k kVar = this.l1;
                    if (kVar != null) {
                        if (isAttachedToWindow() && j71Var.getHeight() - bottom >= 0) {
                            z10 = false;
                            kVar.setCastShadows(z10);
                        }
                        z10 = true;
                        kVar.setCastShadows(z10);
                    }
                    if (j71Var.getHeight() - bottom >= j71Var.getPaddingBottom() + AndroidUtilities.dp(8.0f)) {
                        iArr[1] = i13;
                        currentListView.scrollBy(0, i13);
                    }
                }
            } catch (Throwable th2) {
                FileLog.e(th2);
                AndroidUtilities.runOnUIThread(new od(this, 2));
            }
        }
    }

    @Override // r0.l
    public final void m(int i10, View view) {
        this.w1.a = 0;
    }

    @Override // r0.l
    public final boolean o(View view, View view2, int i10, int i11) {
        return i10 == 2;
    }

    @Override // org.telegram.ui.Components.ow0, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        x1 = this;
        super.onAttachedToWindow();
        Z();
    }

    @Override // org.telegram.ui.Components.ow0, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        x1 = null;
        super.onDetachedFromWindow();
        org.telegram.ui.ActionBar.k kVar = this.l1;
        if (kVar != null) {
            kVar.setCastShadows(true);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
    }

    @Override // r0.l
    public final void r(View view, View view2, int i10, int i11) {
        this.w1.a = i10;
    }

    public void setActionBar(org.telegram.ui.ActionBar.k kVar) {
        this.l1 = kVar;
    }

    @Override // org.telegram.ui.Components.ow0, org.telegram.ui.ActionBar.b6
    public final void updateColors() {
        try {
            ai.t tVar = this.Y0;
            if (tVar != null) {
                tVar.setHandlesColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.vf, this.x0));
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
    }

    @Override // r0.l
    public final void b(ViewGroup viewGroup, int i10, int i11, int i12, int i13, int i14) {
    }
}
