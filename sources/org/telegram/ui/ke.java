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

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class ke extends org.telegram.ui.Components.ov0 implements r0.m {
    public static ke x1;
    public static HashMap y1;
    public TL_stories.TL_premium_boostsStatus A0;
    public int B0;
    public final CharSequence C0;
    public final CharSequence D0;
    public final CharSequence E0;
    public final CharSequence F0;
    public final yd G0;
    public final RelativeSizeSpan H0;
    public final org.telegram.ui.Components.q6 I0;
    public final org.telegram.ui.Components.q6 J0;
    public final di.d K0;
    public int L0;
    public final yd M0;
    public TL_stars.StarsAmount N0;
    public final org.telegram.ui.Components.q6 O0;
    public final org.telegram.ui.Components.q6 P0;
    public final be Q0;
    public final org.telegram.ui.Components.nq[] R0;
    public final LinearLayout S0;
    public final di.d T0;
    public final zd U0;
    public boolean V0;
    public boolean W0;
    public long X0;
    public final gi.o Y0;
    public org.telegram.ui.Components.qc Z0;
    public final org.telegram.ui.Components.d61 a1;
    public bh.l b1;
    public final FrameLayout c1;
    public DecimalFormat d1;
    public final ge e1;
    public final boolean f1;
    public final boolean g1;
    public SpannableStringBuilder h1;
    public final nd i1;
    public double j1;
    public double k1;
    public org.telegram.ui.ActionBar.k l1;
    public boolean m1;
    public boolean n1;
    public na1 o1;
    public na1 p1;
    public na1 q1;
    public boolean r1;
    public final he s1;
    public final he t1;
    public final he u1;
    public final od v1;
    public final bb1 w0;
    public final b2.q0 w1;
    public final org.telegram.ui.ActionBar.f6 x0;
    public final int y0;
    public final long z0;

    public ke(Activity activity, bb1 bb1Var, int i10, long j3, org.telegram.ui.ActionBar.f6 f6Var, boolean z10, boolean z11) {
        super(activity, null);
        this.N0 = TL_stars.StarsAmount.ofStars(0L);
        int i11 = 1;
        this.R0 = new org.telegram.ui.Components.nq[1];
        int i12 = 0;
        this.V0 = false;
        this.W0 = true;
        this.m1 = false;
        this.n1 = false;
        this.r1 = false;
        String string = LocaleController.getString(R.string.MonetizationOverviewAvailable);
        he heVar = new he();
        heVar.a = false;
        heVar.b = "TON";
        heVar.h = "XTR";
        heVar.c = string;
        this.s1 = heVar;
        String string2 = LocaleController.getString(R.string.MonetizationOverviewLastWithdrawal);
        he heVar2 = new he();
        heVar2.a = false;
        heVar2.b = "TON";
        heVar2.h = "XTR";
        heVar2.c = string2;
        this.t1 = heVar2;
        String string3 = LocaleController.getString(R.string.MonetizationOverviewTotal);
        he heVar3 = new he();
        heVar3.a = false;
        heVar3.b = "TON";
        heVar3.h = "XTR";
        heVar3.c = string3;
        this.u1 = heVar3;
        this.v1 = new od(this, 3);
        this.w1 = new b2.q0();
        this.f1 = z10;
        this.g1 = z11;
        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.US);
        decimalFormatSymbols.setDecimalSeparator('.');
        DecimalFormat decimalFormat = new DecimalFormat("#.##", decimalFormatSymbols);
        this.d1 = decimalFormat;
        decimalFormat.setMinimumFractionDigits(2);
        this.d1.setMaximumFractionDigits(12);
        this.d1.setGroupingUsed(false);
        this.w0 = bb1Var;
        this.x0 = f6Var;
        this.y0 = i10;
        this.z0 = j3;
        long j10 = -j3;
        TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(j10));
        if (chat != null) {
            this.B0 = chat.level;
        }
        MessagesController.getInstance(i10).getBoostsController().getBoostsStats(j3, new xb(this, i11));
        c0(false);
        if (z10) {
            TLRPC.TL_payments_getStarsRevenueStats tL_payments_getStarsRevenueStats = new TLRPC.TL_payments_getStarsRevenueStats();
            tL_payments_getStarsRevenueStats.dark = org.telegram.ui.ActionBar.j6.I.q();
            tL_payments_getStarsRevenueStats.ton = true;
            tL_payments_getStarsRevenueStats.peer = MessagesController.getInstance(i10).getInputPeer(j3);
            TLRPC.ChatFull chatFull = MessagesController.getInstance(i10).getChatFull(j10);
            if (chatFull != null) {
                boolean z12 = chatFull.restricted_sponsored;
                this.m1 = z12;
                this.n1 = z12;
            }
            ConnectionsManager.getInstance(i10).sendRequest(tL_payments_getStarsRevenueStats, new ud(this, i11), null, null, 0, ConnectionsManager.DEFAULT_DATACENTER_ID, 1, true);
        }
        TLRPC.Chat chat2 = MessagesController.getInstance(i10).getChat(Long.valueOf(j10));
        this.C0 = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.MonetizationInfo, 50), -1, 3, new r1(bb1Var, activity, f6Var, 13), f6Var), true);
        this.D0 = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(MessagesController.getInstance(i10).channelRevenueWithdrawalEnabled ? R.string.MonetizationBalanceInfo : R.string.MonetizationBalanceInfoNotAvailable), -1, 3, new od(this, 8)), true);
        this.E0 = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString((z11 && z10) ? R.string.MonetizationProceedsStarsTONInfo : z11 ? R.string.MonetizationProceedsStarsInfo : R.string.MonetizationProceedsTONInfo), -1, 3, new nd(this, (z11 && z10) ? R.string.MonetizationProceedsStarsTONInfoLink : z11 ? R.string.MonetizationProceedsStarsInfoLink : R.string.MonetizationProceedsTONInfoLink, i12), f6Var), true);
        this.F0 = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(chat2) ? R.string.MonetizationStarsInfo : R.string.MonetizationStarsInfoGroup), new od(this, i12)), true);
        int i13 = org.telegram.ui.ActionBar.j6.a7;
        setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(i13, f6Var));
        this.e1 = new ge(this, activity, i10, j3, bb1Var.getClassGuid(), new od(this, i11), f6Var);
        yd ydVar = new yd(activity, 0);
        this.G0 = ydVar;
        ydVar.setOrientation(1);
        int i14 = org.telegram.ui.ActionBar.j6.d6;
        ydVar.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(i14, f6Var));
        ydVar.setPadding(0, 0, 0, AndroidUtilities.dp(17.0f));
        org.telegram.ui.Components.q6 q6Var = new org.telegram.ui.Components.q6(activity, false, true, true);
        this.I0 = q6Var;
        q6Var.setTypeface(AndroidUtilities.bold());
        int i15 = org.telegram.ui.ActionBar.j6.G6;
        q6Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(i15, f6Var));
        q6Var.setTextSize(AndroidUtilities.dp(32.0f));
        q6Var.setGravity(17);
        this.H0 = new RelativeSizeSpan(0.6770833f);
        ydVar.addView(q6Var, w7.x5.t(-1, 38, 49, 22, 15, 22, 0));
        org.telegram.ui.Components.q6 q6Var2 = new org.telegram.ui.Components.q6(activity, true, true, true);
        this.J0 = q6Var2;
        q6Var2.setGravity(17);
        int i16 = org.telegram.ui.ActionBar.j6.y6;
        q6Var2.setTextColor(org.telegram.ui.ActionBar.j6.v0(i16, f6Var));
        q6Var2.setTextSize(AndroidUtilities.dp(14.0f));
        ydVar.addView(q6Var2, w7.x5.d(-1, 17.0f, 49, 22.0f, 4.0f, 22.0f, 0.0f));
        di.d dVar = new di.d(activity, f6Var, true);
        dVar.setRoundRadius(24);
        this.K0 = dVar;
        dVar.setEnabled(MessagesController.getInstance(i10).channelRevenueWithdrawalEnabled);
        dVar.g(LocaleController.getString(R.string.MonetizationWithdraw), false, true);
        dVar.setVisibility(8);
        dVar.setOnClickListener(new bi.u1(28, this, bb1Var));
        ydVar.addView(dVar, w7.x5.d(-1, 48.0f, 55, 18.0f, 13.0f, 18.0f, 0.0f));
        yd ydVar2 = new yd(activity, 1);
        this.M0 = ydVar2;
        ydVar2.setOrientation(1);
        ydVar2.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(i14, f6Var));
        ydVar2.setPadding(0, 0, 0, AndroidUtilities.dp(17.0f));
        org.telegram.ui.Components.q6 q6Var3 = new org.telegram.ui.Components.q6(activity, false, true, true);
        this.O0 = q6Var3;
        q6Var3.setTypeface(AndroidUtilities.bold());
        q6Var3.setTextColor(org.telegram.ui.ActionBar.j6.v0(i15, f6Var));
        q6Var3.setTextSize(AndroidUtilities.dp(32.0f));
        q6Var3.setGravity(17);
        new RelativeSizeSpan(0.6770833f);
        ydVar2.addView(q6Var3, w7.x5.t(-1, 38, 49, 22, 15, 22, 0));
        org.telegram.ui.Components.q6 q6Var4 = new org.telegram.ui.Components.q6(activity, true, true, true);
        this.P0 = q6Var4;
        q6Var4.setGravity(17);
        q6Var4.setTextColor(org.telegram.ui.ActionBar.j6.v0(i16, f6Var));
        q6Var4.setTextSize(AndroidUtilities.dp(14.0f));
        ydVar2.addView(q6Var4, w7.x5.d(-1, 17.0f, 49, 22.0f, 4.0f, 22.0f, 0.0f));
        zd zdVar = new zd(this, activity, i12);
        this.U0 = zdVar;
        zdVar.setVisibility(8);
        zdVar.setText(LocaleController.getString(R.string.BotStarsWithdrawPlaceholder));
        zdVar.setLeftPadding(AndroidUtilities.dp(36.0f));
        gi.o oVar = new gi.o(activity, i11);
        this.Y0 = oVar;
        oVar.setFocusable(false);
        oVar.setTextColor(org.telegram.ui.ActionBar.j6.v0(i15, f6Var));
        oVar.setCursorSize(AndroidUtilities.dp(20.0f));
        oVar.setCursorWidth(1.5f);
        oVar.setBackground(null);
        oVar.setTextSize(1, 18.0f);
        oVar.setMaxLines(1);
        int dp = AndroidUtilities.dp(16.0f);
        oVar.setPadding(AndroidUtilities.dp(6.0f), dp, dp, dp);
        oVar.setInputType(2);
        oVar.setTypeface(Typeface.DEFAULT);
        oVar.setHighlightColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.uf, f6Var));
        oVar.setHandlesColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.vf, f6Var));
        oVar.setGravity(LocaleController.isRTL ? 5 : 3);
        oVar.setOnFocusChangeListener(new pd(this, i12));
        oVar.addTextChangedListener(new ae(this));
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(0);
        ImageView imageView = new ImageView(activity);
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setImageResource(R.drawable.star_small_inner);
        linearLayout.addView(imageView, w7.x5.p(-2, -2, 0.0f, 19, 14, 0, 0, 0));
        linearLayout.addView(oVar, w7.x5.o(-1, -2, 1.0f, 119));
        zdVar.e(oVar);
        zdVar.addView(linearLayout, w7.x5.e(-1, -2, 48));
        ydVar2.addView(zdVar, w7.x5.t(-1, -2, 1, 18, 14, 18, 2));
        LinearLayout linearLayout2 = new LinearLayout(activity);
        this.S0 = linearLayout2;
        linearLayout2.setOrientation(0);
        be beVar = new be(activity, f6Var, true);
        beVar.setRoundRadius(24);
        this.Q0 = beVar;
        beVar.setEnabled(false);
        beVar.g(LocaleController.formatPluralString("MonetizationStarsWithdraw", 0, new Object[0]), false, true);
        beVar.setVisibility(0);
        beVar.setOnClickListener(new org.telegram.ui.Cells.ua(this, i10, bb1Var, 2));
        di.d dVar2 = new di.d(activity, f6Var, true);
        dVar2.setRoundRadius(24);
        this.T0 = dVar2;
        dVar2.setEnabled(false);
        dVar2.g(LocaleController.getString(R.string.MonetizationStarsAds), false, true);
        dVar2.setOnClickListener(new qd(this, i10, j3, activity));
        linearLayout2.addView(beVar, w7.x5.o(-1, 48, 1.0f, 119));
        if (ChatObject.isChannelAndNotMegaGroup(chat2)) {
            linearLayout2.addView(new Space(activity), w7.x5.o(8, 48, 0.0f, 119));
            linearLayout2.addView(dVar2, w7.x5.o(-1, 48, 1.0f, 119));
        }
        ydVar2.addView(linearLayout2, w7.x5.d(-1, 48.0f, 55, 18.0f, 13.0f, 18.0f, 0.0f));
        oVar.setOnEditorActionListener(new wd(0, this, bb1Var));
        int i17 = 2;
        this.i1 = new nd(this, i10, i17);
        org.telegram.ui.Components.d61 d61Var = new org.telegram.ui.Components.d61(bb1Var, new b5(this, i17), new xd(this), new xd(this));
        this.a1 = d61Var;
        d61Var.setClipToPadding(false);
        d61Var.o1();
        addView(d61Var);
        LinearLayout linearLayout3 = new LinearLayout(activity);
        linearLayout3.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(activity);
        this.c1 = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(i13, f6Var));
        frameLayout.addView(linearLayout3, w7.x5.e(-2, -2, 17));
        org.telegram.ui.Components.aj0 aj0Var = new org.telegram.ui.Components.aj0(activity);
        aj0Var.setAutoRepeat(true);
        aj0Var.f(R.raw.statistic_preload, 120, 120, null);
        aj0Var.d();
        TextView textView = new TextView(activity);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        int i18 = org.telegram.ui.ActionBar.j6.Oi;
        textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i18, false));
        textView.setTag(Integer.valueOf(i18));
        textView.setText(LocaleController.getString("LoadingStats", R.string.LoadingStats));
        textView.setGravity(1);
        TextView textView2 = new TextView(activity);
        textView2.setTextSize(1, 15.0f);
        int i19 = org.telegram.ui.ActionBar.j6.Pi;
        textView2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i19, false));
        textView2.setTag(Integer.valueOf(i19));
        org.telegram.messenger.wl.k(R.string.LoadingStatsDescription, textView2, 1);
        linearLayout3.addView(aj0Var, w7.x5.t(120, 120, 1, 0, 0, 0, 20));
        linearLayout3.addView(textView, w7.x5.t(-2, -2, 1, 0, 0, 0, 10));
        linearLayout3.addView(textView2, w7.x5.q(-2, -2, 1));
        addView(frameLayout, w7.x5.e(-1, -1, 119));
    }

    public static org.telegram.ui.ActionBar.f3 d0(Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z10) {
        org.telegram.ui.ActionBar.f3 i10 = org.telegram.messenger.wl.i(1, context, f6Var, false);
        LinearLayout f7 = org.telegram.messenger.wl.f(context, 1);
        f7.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        org.telegram.ui.Components.aj0 aj0Var = new org.telegram.ui.Components.aj0(context);
        aj0Var.setScaleType(ImageView.ScaleType.CENTER);
        aj0Var.setImageResource(R.drawable.large_monetize);
        aj0Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        aj0Var.setBackground(org.telegram.ui.ActionBar.j6.K(AndroidUtilities.dp(80.0f), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Oh, f6Var)));
        f7.addView(aj0Var, w7.x5.t(80, 80, 1, 0, 16, 0, 16));
        TextView textView = new TextView(context);
        textView.setGravity(17);
        com.google.android.gms.internal.vision.e2.m(20.0f, 1, textView);
        int i11 = org.telegram.ui.ActionBar.j6.G6;
        textView.setTextColor(org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
        textView.setText(LocaleController.getString(z10 ? R.string.BotMonetizationInfoTitle : R.string.MonetizationInfoTitle));
        f7.addView(textView, w7.x5.k(8.0f, 0.0f, 8.0f, 25.0f, -1, -2));
        f7.addView(new bi.g5(context, R.drawable.msg_channel, LocaleController.getString(z10 ? R.string.BotMonetizationInfoFeature1Name : R.string.MonetizationInfoFeature1Name), LocaleController.getString(z10 ? R.string.BotMonetizationInfoFeature1Text : R.string.MonetizationInfoFeature1Text), f6Var), w7.x5.t(-1, -2, 49, 8, 0, 8, 16));
        f7.addView(new bi.g5(context, R.drawable.menu_feature_split, LocaleController.getString(z10 ? R.string.BotMonetizationInfoFeature2Name : R.string.MonetizationInfoFeature2Name), LocaleController.getString(z10 ? R.string.BotMonetizationInfoFeature2Text : R.string.MonetizationInfoFeature2Text), f6Var), w7.x5.t(-1, -2, 49, 8, 0, 8, 16));
        f7.addView(new bi.g5(context, R.drawable.menu_feature_withdrawals, LocaleController.getString(z10 ? R.string.BotMonetizationInfoFeature3Name : R.string.MonetizationInfoFeature3Name), LocaleController.getString(z10 ? R.string.BotMonetizationInfoFeature3Text : R.string.MonetizationInfoFeature3Text), f6Var), w7.x5.t(-1, -2, 49, 8, 0, 8, 16));
        View view = new View(context);
        view.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.d7, f6Var));
        f7.addView(view, w7.x5.s(-1, 55, 12, 0, 12, 1.0f / AndroidUtilities.density, 0));
        org.telegram.ui.Components.y5 y5Var = new org.telegram.ui.Components.y5(context);
        y5Var.setGravity(17);
        y5Var.setTextSize(1, 20.0f);
        y5Var.setTypeface(AndroidUtilities.bold());
        y5Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
        SpannableString spannableString = new SpannableString("💎");
        org.telegram.ui.Components.nq nqVar = new org.telegram.ui.Components.nq(R.drawable.mini_gram_72, 0);
        nqVar.setScale(0.9f, 0.9f);
        nqVar.setColorKey(org.telegram.ui.ActionBar.j6.o6);
        nqVar.setRelativeSize(y5Var.getPaint().getFontMetricsInt());
        nqVar.spaceScaleX = 0.9f;
        spannableString.setSpan(nqVar, 0, spannableString.length(), 33);
        y5Var.setText(AndroidUtilities.replaceCharSequence("💎", LocaleController.getString(z10 ? R.string.BotMonetizationInfoTONTitle : R.string.MonetizationInfoTONTitle), spannableString));
        f7.addView(y5Var, w7.x5.k(8.0f, 20.0f, 8.0f, 0.0f, -1, -2));
        org.telegram.ui.Components.d90 d90Var = new org.telegram.ui.Components.d90(context, f6Var);
        d90Var.setGravity(17);
        d90Var.setTextSize(1, 14.0f);
        d90Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
        d90Var.setLinkTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.gc, f6Var));
        d90Var.setText(AndroidUtilities.withLearnMore(AndroidUtilities.replaceTags(LocaleController.getString(z10 ? R.string.BotMonetizationInfoTONText : R.string.MonetizationInfoTONText)), new ah.u(19, context, z10)));
        f7.addView(d90Var, w7.x5.k(28.0f, 9.0f, 28.0f, 0.0f, -1, -2));
        di.d g10 = org.telegram.messenger.wl.g(24, context, f6Var, true);
        g10.g(LocaleController.getString(R.string.GotIt), false, true);
        g10.setOnClickListener(new rd(i10, 1));
        f7.addView(g10, w7.x5.t(-1, 48, 55, 10, 25, 10, 14));
        i10.setCustomView(f7);
        return i10;
    }

    public static CharSequence f0(CharSequence charSequence, TextPaint textPaint, float f7, float f10, boolean z10) {
        if (y1 == null) {
            y1 = new HashMap();
        }
        int i10 = ((textPaint.getFontMetricsInt().bottom * (z10 ? 1 : -1)) * ((int) (f7 * 100.0f))) - ((int) (100.0f * f10));
        SpannableString spannableString = (SpannableString) y1.get(Integer.valueOf(i10));
        if (spannableString == null) {
            spannableString = new SpannableString("T");
            if (z10) {
                org.telegram.ui.Components.nq nqVar = new org.telegram.ui.Components.nq(R.drawable.mini_gram_72, 0);
                nqVar.setScale(f7, f7);
                nqVar.setColorKey(org.telegram.ui.ActionBar.j6.o6);
                nqVar.setRelativeSize(textPaint.getFontMetricsInt());
                nqVar.spaceScaleX = 0.9f;
                spannableString.setSpan(nqVar, 0, spannableString.length(), 33);
            } else {
                org.telegram.ui.Components.nq nqVar2 = new org.telegram.ui.Components.nq(R.drawable.mini_gram_16, 0);
                nqVar2.setScale(f7, f7);
                nqVar2.setTranslateY(f10);
                nqVar2.spaceScaleX = 0.95f;
                spannableString.setSpan(nqVar2, 0, spannableString.length(), 33);
            }
            y1.put(Integer.valueOf(i10), spannableString);
        }
        return AndroidUtilities.replaceMultipleCharSequence("TON", charSequence, spannableString);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void h0(Context context, int i10, TL_stats.BroadcastRevenueTransaction broadcastRevenueTransaction, long j3, org.telegram.ui.ActionBar.f6 f6Var) {
        long j10;
        org.telegram.ui.ActionBar.f3 f3Var;
        String string;
        long j11;
        long j12;
        long j13;
        boolean z10;
        char c10;
        String str;
        boolean z11;
        org.telegram.ui.ActionBar.f3 f3Var2;
        String userName;
        TLRPC.User user;
        org.telegram.ui.ActionBar.f3 i11 = org.telegram.messenger.wl.i(1, context, f6Var, false);
        LinearLayout f7 = org.telegram.messenger.wl.f(context, 1);
        boolean z12 = broadcastRevenueTransaction instanceof TL_stats.TL_broadcastRevenueTransactionWithdrawal;
        if (z12) {
            TL_stats.TL_broadcastRevenueTransactionWithdrawal tL_broadcastRevenueTransactionWithdrawal = (TL_stats.TL_broadcastRevenueTransactionWithdrawal) broadcastRevenueTransaction;
            String string2 = LocaleController.getString(R.string.MonetizationTransactionDetailWithdraw);
            long j14 = tL_broadcastRevenueTransactionWithdrawal.date;
            j10 = 0;
            j11 = tL_broadcastRevenueTransactionWithdrawal.amount;
            z10 = tL_broadcastRevenueTransactionWithdrawal.pending;
            f3Var = i11;
            j12 = j14;
            j13 = 0;
            c10 = 65535;
            str = string2;
            z11 = tL_broadcastRevenueTransactionWithdrawal.failed;
        } else {
            j10 = 0;
            if (broadcastRevenueTransaction instanceof TL_stats.TL_broadcastRevenueTransactionProceeds) {
                TL_stats.TL_broadcastRevenueTransactionProceeds tL_broadcastRevenueTransactionProceeds = (TL_stats.TL_broadcastRevenueTransactionProceeds) broadcastRevenueTransaction;
                string = LocaleController.getString(R.string.MonetizationTransactionDetailProceed);
                long j15 = tL_broadcastRevenueTransactionProceeds.from_date;
                long j16 = tL_broadcastRevenueTransactionProceeds.to_date;
                f3Var = i11;
                j11 = tL_broadcastRevenueTransactionProceeds.amount;
                j13 = j16;
                j12 = j15;
            } else {
                f3Var = i11;
                if (!(broadcastRevenueTransaction instanceof TL_stats.TL_broadcastRevenueTransactionRefund)) {
                    return;
                }
                TL_stats.TL_broadcastRevenueTransactionRefund tL_broadcastRevenueTransactionRefund = (TL_stats.TL_broadcastRevenueTransactionRefund) broadcastRevenueTransaction;
                string = LocaleController.getString(R.string.MonetizationTransactionDetailRefund);
                long j17 = tL_broadcastRevenueTransactionRefund.from_date;
                j11 = tL_broadcastRevenueTransactionRefund.amount;
                j12 = j17;
                j13 = 0;
            }
            z10 = false;
            c10 = 1;
            str = string;
            z11 = false;
        }
        boolean z13 = z10;
        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.US);
        decimalFormatSymbols.setDecimalSeparator('.');
        long j18 = j13;
        DecimalFormat decimalFormat = new DecimalFormat("#.##", decimalFormatSymbols);
        decimalFormat.setMinimumFractionDigits(2);
        decimalFormat.setMaximumFractionDigits(12);
        decimalFormat.setGroupingUsed(false);
        TextView textView = new TextView(context);
        textView.setGravity(17);
        org.telegram.messenger.wl.j(18.0f, 1, textView);
        textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, c10 < 0 ? org.telegram.ui.ActionBar.j6.q7 : org.telegram.ui.ActionBar.j6.l8, false));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) (c10 < 0 ? "-" : "+"));
        spannableStringBuilder.append((CharSequence) decimalFormat.format(Math.round((Math.abs(j11) / 1.0E9d) * 100000.0d) / 100000.0d));
        spannableStringBuilder.append((CharSequence) " TON");
        int indexOf = TextUtils.indexOf(spannableStringBuilder, ".");
        if (indexOf >= 0) {
            spannableStringBuilder.setSpan(new RelativeSizeSpan(1.3333334f), 0, indexOf, 33);
        }
        textView.setText(spannableStringBuilder);
        f7.addView(textView, w7.x5.t(-1, -2, 49, 0, 24, 0, 6));
        TextView textView2 = new TextView(context);
        textView2.setGravity(17);
        textView2.setTextSize(1, 13.0f);
        textView2.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.y6, f6Var));
        if (z13) {
            textView2.setText(LocaleController.getString(R.string.MonetizationTransactionPending));
        } else if (j12 == j10) {
            textView2.setText(LocaleController.formatShortDateTime(j18));
        } else if (j18 == j10) {
            textView2.setText(LocaleController.formatShortDateTime(j12));
        } else {
            textView2.setText(LocaleController.formatShortDateTime(j12) + " - " + LocaleController.formatShortDateTime(j18));
        }
        if (z11) {
            textView2.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.q7, f6Var));
            textView2.setText(TextUtils.concat(textView2.getText(), " — ", LocaleController.getString(R.string.MonetizationTransactionNotCompleted)));
        }
        f7.addView(textView2, w7.x5.t(-1, -2, 49, 0, 0, 0, 0));
        TextView textView3 = new TextView(context);
        textView3.setGravity(17);
        org.telegram.messenger.wl.j(14.0f, 1, textView3);
        textView3.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G6, f6Var));
        textView3.setText(str);
        f7.addView(textView3, w7.x5.t(-1, -2, 49, 0, 27, 0, 0));
        if (broadcastRevenueTransaction instanceof TL_stats.TL_broadcastRevenueTransactionProceeds) {
            FrameLayout frameLayout = new FrameLayout(context);
            frameLayout.setBackground(org.telegram.ui.ActionBar.j6.c0(AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.ci, f6Var)));
            if (j3 < j10) {
                TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-j3));
                if (chat == 0) {
                    userName = "";
                    user = chat;
                } else {
                    userName = chat.title;
                    user = chat;
                }
            } else {
                TLRPC.User user2 = MessagesController.getInstance(i10).getUser(Long.valueOf(j3));
                userName = UserObject.getUserName(user2);
                user = user2;
            }
            org.telegram.ui.Components.x9 x9Var = new org.telegram.ui.Components.x9(context);
            x9Var.setRoundRadius(AndroidUtilities.dp(28.0f));
            org.telegram.ui.Components.i9 i9Var = new org.telegram.ui.Components.i9((org.telegram.ui.ActionBar.f6) null);
            i9Var.p(user);
            x9Var.e(user, i9Var);
            frameLayout.addView(x9Var, w7.x5.e(28, 28, 51));
            TextView textView4 = new TextView(context);
            textView4.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.j5, f6Var));
            textView4.setTextSize(1, 13.0f);
            textView4.setSingleLine();
            textView4.setText(userName);
            frameLayout.addView(textView4, w7.x5.d(-2, -2.0f, 19, 37.0f, 0.0f, 10.0f, 0.0f));
            f7.addView(frameLayout, w7.x5.t(-2, 28, 1, 42, 10, 42, 0));
        }
        di.d g10 = org.telegram.messenger.wl.g(24, context, f6Var, true);
        if (z12) {
            TL_stats.TL_broadcastRevenueTransactionWithdrawal tL_broadcastRevenueTransactionWithdrawal2 = (TL_stats.TL_broadcastRevenueTransactionWithdrawal) broadcastRevenueTransaction;
            if ((tL_broadcastRevenueTransactionWithdrawal2.flags & 2) != 0) {
                g10.g(LocaleController.getString(R.string.MonetizationTransactionDetailWithdrawButton), false, true);
                g10.setOnClickListener(new bi.u1(context, tL_broadcastRevenueTransactionWithdrawal2));
                f3Var2 = f3Var;
                f7.addView(g10, w7.x5.t(-1, 48, 55, 18, 30, 18, 14));
                f3Var2.setCustomView(f7);
                f3Var2.show();
            }
        }
        g10.g(LocaleController.getString(R.string.OK), false, true);
        org.telegram.ui.ActionBar.f3 f3Var3 = f3Var;
        g10.setOnClickListener(new rd(f3Var3, 0));
        f3Var2 = f3Var3;
        f7.addView(g10, w7.x5.t(-1, 48, 55, 18, 30, 18, 14));
        f3Var2.setCustomView(f7);
        f3Var2.show();
    }

    @Override // r0.l
    public final void E(ViewGroup viewGroup, int i10, int i11, int[] iArr, int i12) {
        org.telegram.ui.Components.d61 d61Var = this.a1;
        if (viewGroup == d61Var) {
            ge geVar = this.e1;
            if (geVar.isAttachedToWindow()) {
                ((View) geVar.getParent()).getTop();
                int i13 = AndroidUtilities.REPLACING_TAG_TYPE_LINK;
                org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                int bottom = ((View) geVar.getParent()).getBottom();
                if (i11 >= 0) {
                    if (i11 > 0) {
                        org.telegram.ui.Components.ll0 currentListView = geVar.getCurrentListView();
                        if (d61Var.getHeight() - bottom < AndroidUtilities.dp(8.0f) + d61Var.getPaddingBottom() || currentListView == null || currentListView.canScrollVertically(1)) {
                            return;
                        }
                        iArr[1] = i11;
                        d61Var.B0();
                        return;
                    }
                    return;
                }
                org.telegram.ui.ActionBar.k kVar = this.l1;
                if (kVar != null) {
                    kVar.setCastShadows(!isAttachedToWindow() || d61Var.getHeight() - bottom < 0);
                }
                if (d61Var.getHeight() - bottom >= AndroidUtilities.dp(8.0f) + d61Var.getPaddingBottom()) {
                    org.telegram.ui.Components.ll0 currentListView2 = geVar.getCurrentListView();
                    int L0 = ((s4.c0) currentListView2.getLayoutManager()).L0();
                    if (L0 != -1) {
                        s4.c1 K = currentListView2.K(L0);
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
        kg.b bVar;
        ArrayList arrayList;
        boolean z10 = this.q1 == null;
        this.k1 = tL_payments_starsRevenueStats.usd_rate;
        na1 f02 = bb1.f0(tL_payments_starsRevenueStats.revenue_graph, LocaleController.getString(R.string.MonetizationGraphStarsRevenue), 2, false);
        this.q1 = f02;
        if (f02 != null && (bVar = f02.d) != null && (arrayList = bVar.d) != null && !arrayList.isEmpty() && this.q1.d.d.get(0) != null) {
            ((kg.a) this.q1.d.d.get(0)).g = org.telegram.ui.ActionBar.j6.kj;
            this.q1.d.h = (float) ((1.0d / this.k1) / 100.0d);
        }
        g0(false, tL_payments_starsRevenueStats.status);
        if (!this.f1 && (frameLayout = this.c1) != null) {
            frameLayout.animate().alpha(0.0f).setDuration(380L).setInterpolator(org.telegram.ui.Components.pr.h).withEndAction(new od(this, 7)).start();
        }
        org.telegram.ui.Components.d61 d61Var = this.a1;
        if (d61Var != null) {
            d61Var.Y2.N(!z10);
            if (z10) {
                d61Var.u0(0);
            }
        }
    }

    public final void a0() {
        if (isAttachedToWindow() && this.f1 && this.r1 && MessagesController.getGlobalMainSettings().getBoolean("monetizationadshint", true)) {
            this.w0.showDialog(d0(getContext(), this.x0, false));
            MessagesController.getGlobalMainSettings().edit().putBoolean("monetizationadshint", false).apply();
        }
    }

    public final void b0(boolean z10, TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, TwoStepVerificationActivity twoStepVerificationActivity) {
        TLRPC.TL_payments_getStarsRevenueWithdrawalUrl tL_payments_getStarsRevenueWithdrawalUrl;
        bb1 bb1Var = this.w0;
        if (bb1Var == null) {
            return;
        }
        Activity parentActivity = bb1Var.getParentActivity();
        int i10 = this.y0;
        TLRPC.User currentUser = UserConfig.getInstance(i10).getCurrentUser();
        if (parentActivity == null || currentUser == null) {
            return;
        }
        long j3 = this.z0;
        if (z10) {
            tL_payments_getStarsRevenueWithdrawalUrl = new TLRPC.TL_payments_getStarsRevenueWithdrawalUrl();
            tL_payments_getStarsRevenueWithdrawalUrl.ton = false;
            tL_payments_getStarsRevenueWithdrawalUrl.peer = MessagesController.getInstance(i10).getInputPeer(j3);
            if (inputCheckPasswordSRP == null) {
                inputCheckPasswordSRP = new TLRPC.TL_inputCheckPasswordEmpty();
            }
            tL_payments_getStarsRevenueWithdrawalUrl.password = inputCheckPasswordSRP;
            tL_payments_getStarsRevenueWithdrawalUrl.flags |= 2;
            tL_payments_getStarsRevenueWithdrawalUrl.amount = this.X0;
        } else {
            tL_payments_getStarsRevenueWithdrawalUrl = new TLRPC.TL_payments_getStarsRevenueWithdrawalUrl();
            tL_payments_getStarsRevenueWithdrawalUrl.ton = true;
            tL_payments_getStarsRevenueWithdrawalUrl.peer = MessagesController.getInstance(i10).getInputPeer(j3);
            if (inputCheckPasswordSRP == null) {
                inputCheckPasswordSRP = new TLRPC.TL_inputCheckPasswordEmpty();
            }
            tL_payments_getStarsRevenueWithdrawalUrl.password = inputCheckPasswordSRP;
        }
        ConnectionsManager.getInstance(i10).sendRequest(tL_payments_getStarsRevenueWithdrawalUrl, new di.t1(this, twoStepVerificationActivity, parentActivity, z10, 1));
    }

    public final void c0(boolean z10) {
        if (this.g1) {
            int i10 = this.y0;
            zh.o g10 = zh.o.g(i10);
            long j3 = this.z0;
            TLRPC.TL_payments_starsRevenueStats h = g10.h(j3, z10);
            if (h != null) {
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.c6(25, this, h));
                return;
            }
            TLRPC.TL_payments_getStarsRevenueStats tL_payments_getStarsRevenueStats = new TLRPC.TL_payments_getStarsRevenueStats();
            tL_payments_getStarsRevenueStats.peer = MessagesController.getInstance(i10).getInputPeer(j3);
            tL_payments_getStarsRevenueStats.dark = org.telegram.ui.ActionBar.j6.I.q();
            ConnectionsManager.getInstance(i10).sendRequest(tL_payments_getStarsRevenueStats, new ud(this, 2));
        }
    }

    public final void e0() {
        ge geVar = this.e1;
        od odVar = geVar.e;
        boolean[] zArr = geVar.s;
        boolean a2 = geVar.a();
        for (int i10 = 0; i10 < 2; i10++) {
            if (zArr[i10]) {
                return;
            }
            if (i10 == 1) {
                geVar.h.clear();
                geVar.f = "";
            } else {
                geVar.n.clear();
                geVar.r = "";
            }
            zArr[i10] = false;
            geVar.c(i10);
        }
        if (geVar.a() == a2 || odVar == null) {
            return;
        }
        geVar.e();
        odVar.run();
    }

    public final void g0(boolean z10, TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus) {
        he heVar;
        org.telegram.ui.Components.v51 v51Var;
        he heVar2;
        int i10;
        ke keVar = this;
        he heVar3 = keVar.u1;
        he heVar4 = keVar.t1;
        org.telegram.ui.Components.q6 q6Var = keVar.J0;
        RelativeSizeSpan relativeSizeSpan = keVar.H0;
        org.telegram.ui.Components.q6 q6Var2 = keVar.I0;
        he heVar5 = keVar.s1;
        if (z10) {
            heVar5.a = true;
            long j3 = tL_starsRevenueStatus.available_balance.amount;
            heVar5.d = j3;
            double d = j3 / 1.0E9d;
            long j10 = (long) (keVar.j1 * d * 100.0d);
            heVar5.e = j10;
            if (keVar.d1 == null) {
                DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.US);
                decimalFormatSymbols.setDecimalSeparator('.');
                heVar2 = heVar3;
                DecimalFormat decimalFormat = new DecimalFormat("#.##", decimalFormatSymbols);
                keVar.d1 = decimalFormat;
                decimalFormat.setMinimumFractionDigits(2);
                i10 = 6;
                keVar.d1.setMaximumFractionDigits(6);
                keVar.d1.setGroupingUsed(false);
            } else {
                heVar2 = heVar3;
                i10 = 6;
            }
            DecimalFormat decimalFormat2 = keVar.d1;
            if (d > 1.5d) {
                i10 = 2;
            }
            decimalFormat2.setMaximumFractionDigits(i10);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(f0("TON " + keVar.d1.format(d), q6Var2.getPaint(), 0.9f, 0.0f, true));
            int indexOf = TextUtils.indexOf(spannableStringBuilder, ".");
            if (indexOf >= 0) {
                spannableStringBuilder.setSpan(relativeSizeSpan, indexOf, spannableStringBuilder.length(), 33);
            }
            q6Var2.setText(spannableStringBuilder);
            q6Var.setText("≈" + BillingController.getInstance().formatCurrency(j10, "USD"));
            heVar5.f = "USD";
            heVar4.a = true;
            long j11 = tL_starsRevenueStatus.current_balance.amount;
            heVar4.d = j11;
            keVar = this;
            double d10 = keVar.j1;
            heVar4.e = (long) ((j11 / 1.0E9d) * d10 * 100.0d);
            heVar4.f = "USD";
            he heVar6 = heVar2;
            heVar6.a = true;
            long j12 = tL_starsRevenueStatus.overall_revenue.amount;
            heVar6.d = j12;
            heVar6.e = (long) ((j12 / 1.0E9d) * d10 * 100.0d);
            heVar6.f = "USD";
            keVar.r1 = true;
            keVar.K0.setVisibility((tL_starsRevenueStatus.available_balance.amount <= 0 || !tL_starsRevenueStatus.withdrawal_enabled) ? 8 : 0);
        } else {
            double d11 = keVar.k1;
            if (d11 == 0.0d) {
                return;
            }
            heVar5.g = true;
            TL_stars.StarsAmount starsAmount = tL_starsRevenueStatus.available_balance;
            heVar5.i = starsAmount;
            heVar5.j = (long) (starsAmount.amount * d11 * 100.0d);
            int i11 = tL_starsRevenueStatus.next_withdrawal_at;
            be beVar = keVar.Q0;
            if (q6Var2 == null || q6Var == null) {
                heVar = heVar3;
            } else {
                heVar = heVar3;
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(zh.v7.X0(false, TextUtils.concat("XTR ", zh.v7.J0(starsAmount, 0.8f, ' ')), 1.0f, null));
                int indexOf2 = TextUtils.indexOf(spannableStringBuilder2, ".");
                if (indexOf2 >= 0) {
                    spannableStringBuilder2.setSpan(relativeSizeSpan, indexOf2, spannableStringBuilder2.length(), 33);
                }
                keVar.N0 = starsAmount;
                keVar.O0.setText(spannableStringBuilder2);
                keVar.P0.setText("≈" + BillingController.getInstance().formatCurrency((long) (keVar.k1 * starsAmount.amount * 100.0d), "USD"));
                keVar.U0.setVisibility(starsAmount.amount > 0 ? 0 : 8);
                if (keVar.W0) {
                    keVar.V0 = true;
                    long j13 = starsAmount.amount;
                    keVar.X0 = j13;
                    String l4 = Long.toString(j13);
                    gi.o oVar = keVar.Y0;
                    oVar.setText(l4);
                    oVar.setSelection(oVar.getText().length());
                    keVar.V0 = false;
                    beVar.setEnabled(keVar.X0 > 0);
                }
                di.d dVar = keVar.T0;
                if (dVar != null) {
                    dVar.setEnabled(starsAmount.amount > 0);
                }
                keVar.L0 = i11;
                nd ndVar = keVar.i1;
                AndroidUtilities.cancelRunOnUIThread(ndVar);
                ndVar.run();
            }
            heVar5.f = "USD";
            heVar4.g = true;
            TL_stars.StarsAmount starsAmount2 = tL_starsRevenueStatus.current_balance;
            heVar4.i = starsAmount2;
            double d12 = starsAmount2.amount;
            double d13 = keVar.k1;
            heVar4.j = (long) (d12 * d13 * 100.0d);
            heVar4.f = "USD";
            he heVar7 = heVar;
            heVar7.g = true;
            heVar7.i = tL_starsRevenueStatus.overall_revenue;
            heVar7.j = (long) (r4.amount * d13 * 100.0d);
            heVar7.f = "USD";
            keVar.r1 = true;
            LinearLayout linearLayout = keVar.S0;
            if (linearLayout != null) {
                linearLayout.setVisibility(tL_starsRevenueStatus.withdrawal_enabled ? 0 : 8);
            }
            if (beVar != null) {
                beVar.setVisibility((tL_starsRevenueStatus.available_balance.amount > 0 || BuildVars.DEBUG_PRIVATE_VERSION) ? 0 : 8);
            }
        }
        org.telegram.ui.Components.d61 d61Var = keVar.a1;
        if (d61Var == null || (v51Var = d61Var.Y2) == null) {
            return;
        }
        v51Var.N(true);
    }

    @Override // org.telegram.ui.Components.ov0
    public /* bridge */ /* synthetic */ int[] getColorKeys() {
        return null;
    }

    @Override // r0.m
    public final void i(ViewGroup viewGroup, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        boolean z10;
        ge geVar = this.e1;
        org.telegram.ui.Components.d61 d61Var = this.a1;
        if (viewGroup == d61Var) {
            try {
                if (geVar.isAttachedToWindow()) {
                    org.telegram.ui.Components.ll0 currentListView = geVar.getCurrentListView();
                    int bottom = ((View) geVar.getParent()).getBottom();
                    org.telegram.ui.ActionBar.k kVar = this.l1;
                    if (kVar != null) {
                        if (isAttachedToWindow() && d61Var.getHeight() - bottom >= 0) {
                            z10 = false;
                            kVar.setCastShadows(z10);
                        }
                        z10 = true;
                        kVar.setCastShadows(z10);
                    }
                    if (d61Var.getHeight() - bottom >= d61Var.getPaddingBottom() + AndroidUtilities.dp(8.0f)) {
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
    public final void n(int i10, View view) {
        this.w1.a = 0;
    }

    @Override // org.telegram.ui.Components.ov0, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        x1 = this;
        super.onAttachedToWindow();
        a0();
    }

    @Override // org.telegram.ui.Components.ov0, android.view.ViewGroup, android.view.View
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
    public final boolean p(View view, View view2, int i10, int i11) {
        return i10 == 2;
    }

    @Override // r0.l
    public final void s(View view, View view2, int i10, int i11) {
        this.w1.a = i10;
    }

    public void setActionBar(org.telegram.ui.ActionBar.k kVar) {
        this.l1 = kVar;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
    }

    @Override // r0.l
    public final void b(ViewGroup viewGroup, int i10, int i11, int i12, int i13, int i14) {
    }
}
