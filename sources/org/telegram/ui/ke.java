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
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
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

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class ke extends org.telegram.ui.Components.lw0 implements org.telegram.ui.ActionBar.p6 {
    public static ke t1;
    public static HashMap u1;
    public final fi.d A0;
    public int B0;
    public final bi.r C0;
    public TL_stars.StarsAmount D0;
    public final org.telegram.ui.Components.s6 E0;
    public final org.telegram.ui.Components.s6 F0;
    public final ae G0;
    public final org.telegram.ui.Components.zq[] H0;
    public final LinearLayout I0;
    public final fi.d J0;
    public final bi.s K0;
    public boolean L0;
    public boolean M0;
    public long N0;
    public final bi.t O0;
    public org.telegram.ui.Components.qc P0;
    public boolean Q0;
    public int R0;
    public Runnable S0;
    public final bi.cc T0;
    public int U0;
    public int V0;
    public int W0;
    public final org.telegram.ui.Components.r71 X0;
    public final FrameLayout Y0;
    public DecimalFormat Z0;
    public final ge a1;
    public final boolean b1;
    public final boolean c1;
    public final oi.q d1;
    public SpannableStringBuilder e1;
    public final qd f1;
    public double g1;
    public double h1;
    public org.telegram.ui.ActionBar.k i1;
    public boolean j1;
    public boolean k1;
    public i91 l1;
    public final w91 m0;
    public i91 m1;
    public final org.telegram.ui.ActionBar.u6 n0;
    public i91 n1;
    public final int o0;
    public boolean o1;
    public final long p0;
    public final he p1;
    public TL_stories.TL_premium_boostsStatus q0;
    public final he q1;
    public int r0;
    public final he r1;
    public final CharSequence s0;
    public final pd s1;
    public final CharSequence t0;
    public final CharSequence u0;
    public final CharSequence v0;
    public final bi.r w0;
    public final RelativeSizeSpan x0;
    public final org.telegram.ui.Components.s6 y0;
    public final org.telegram.ui.Components.s6 z0;

    public ke(final Activity activity, w91 w91Var, final int i10, final long j10, org.telegram.ui.ActionBar.u6 u6Var, oi.q qVar, boolean z10, boolean z11) {
        super(activity);
        this.D0 = TL_stars.StarsAmount.ofStars(0L);
        this.H0 = new org.telegram.ui.Components.zq[1];
        this.L0 = false;
        this.M0 = true;
        this.Q0 = true;
        this.R0 = -1;
        this.j1 = false;
        this.k1 = false;
        this.o1 = false;
        String string = LocaleController.getString(R.string.MonetizationOverviewAvailable);
        he heVar = new he();
        heVar.a = false;
        heVar.b = "TON";
        heVar.h = "XTR";
        heVar.c = string;
        this.p1 = heVar;
        String string2 = LocaleController.getString(R.string.MonetizationOverviewLastWithdrawal);
        he heVar2 = new he();
        heVar2.a = false;
        heVar2.b = "TON";
        heVar2.h = "XTR";
        heVar2.c = string2;
        this.q1 = heVar2;
        String string3 = LocaleController.getString(R.string.MonetizationOverviewTotal);
        he heVar3 = new he();
        heVar3.a = false;
        heVar3.b = "TON";
        heVar3.h = "XTR";
        heVar3.c = string3;
        this.r1 = heVar3;
        this.s1 = new pd(this, 7);
        this.d1 = qVar;
        this.b1 = z10;
        this.c1 = z11;
        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.US);
        decimalFormatSymbols.setDecimalSeparator('.');
        DecimalFormat decimalFormat = new DecimalFormat("#.##", decimalFormatSymbols);
        this.Z0 = decimalFormat;
        int i11 = 2;
        decimalFormat.setMinimumFractionDigits(2);
        int i12 = 12;
        this.Z0.setMaximumFractionDigits(12);
        this.Z0.setGroupingUsed(false);
        this.m0 = w91Var;
        this.n0 = u6Var;
        this.o0 = i10;
        this.p0 = j10;
        long j11 = -j10;
        TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(j11));
        if (chat != null) {
            this.r0 = chat.level;
        }
        MessagesController.getInstance(i10).getBoostsController().getBoostsStats(j10, new t3(this, i11));
        H(false);
        if (z10) {
            TLRPC.TL_payments_getStarsRevenueStats tL_payments_getStarsRevenueStats = new TLRPC.TL_payments_getStarsRevenueStats();
            tL_payments_getStarsRevenueStats.dark = org.telegram.ui.ActionBar.y6.I.q();
            tL_payments_getStarsRevenueStats.ton = true;
            tL_payments_getStarsRevenueStats.peer = MessagesController.getInstance(i10).getInputPeer(j10);
            TLRPC.ChatFull chatFull = MessagesController.getInstance(i10).getChatFull(j11);
            if (chatFull != null) {
                boolean z12 = chatFull.restricted_sponsored;
                this.j1 = z12;
                this.k1 = z12;
            }
            ConnectionsManager.getInstance(i10).sendRequest(tL_payments_getStarsRevenueStats, new wd(this, 1), null, null, 0, ConnectionsManager.DEFAULT_DATACENTER_ID, 1, true);
        }
        TLRPC.Chat chat2 = MessagesController.getInstance(i10).getChat(Long.valueOf(j11));
        this.s0 = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.MonetizationInfo, 50), -1, 3, new q1(w91Var, activity, u6Var, i12), u6Var), true);
        this.t0 = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(MessagesController.getInstance(i10).channelRevenueWithdrawalEnabled ? R.string.MonetizationBalanceInfo : R.string.MonetizationBalanceInfoNotAvailable), -1, 3, new pd(this, 0)), true);
        int i13 = 1;
        this.u0 = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString((z11 && z10) ? R.string.MonetizationProceedsStarsTONInfo : z11 ? R.string.MonetizationProceedsStarsInfo : R.string.MonetizationProceedsTONInfo), -1, 3, new qd(this, (z11 && z10) ? R.string.MonetizationProceedsStarsTONInfoLink : z11 ? R.string.MonetizationProceedsStarsInfoLink : R.string.MonetizationProceedsTONInfoLink, 0), u6Var), true);
        this.v0 = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(chat2) ? R.string.MonetizationStarsInfo : R.string.MonetizationStarsInfoGroup), new pd(this, i13)), true);
        setCommonInsetsManagedExternally(true);
        setGeometry(new f(this, 12));
        this.T0 = new bi.cc(this, activity, 24);
        int i14 = 2;
        ge geVar = new ge(this, activity, i10, j10, w91Var.getClassGuid(), new pd(this, i14), u6Var);
        this.a1 = geVar;
        bi.r rVar = new bi.r(activity, i14);
        this.w0 = rVar;
        rVar.setOrientation(1);
        int i15 = org.telegram.ui.ActionBar.y6.d6;
        org.telegram.ui.ActionBar.f7.i(i15, rVar, u6Var);
        rVar.setPadding(0, 0, 0, AndroidUtilities.dp(17.0f));
        org.telegram.ui.Components.s6 s6Var = new org.telegram.ui.Components.s6(activity, false, true, true);
        this.y0 = s6Var;
        s6Var.setTypeface(AndroidUtilities.bold());
        int i16 = org.telegram.ui.ActionBar.y6.G6;
        org.telegram.ui.ActionBar.f7.Z(s6Var, i16, u6Var);
        s6Var.setTextSize(AndroidUtilities.dp(32.0f));
        s6Var.setGravity(17);
        this.x0 = new RelativeSizeSpan(0.6770833f);
        rVar.addView(s6Var, org.telegram.ui.Components.gb1.x(-1, 38, 49, 22, 15, 22, 0));
        org.telegram.ui.Components.s6 s6Var2 = new org.telegram.ui.Components.s6(activity, true, true, true);
        this.z0 = s6Var2;
        s6Var2.setGravity(17);
        int i17 = org.telegram.ui.ActionBar.y6.y6;
        org.telegram.ui.ActionBar.f7.Z(s6Var2, i17, u6Var);
        s6Var2.setTextSize(AndroidUtilities.dp(14.0f));
        rVar.addView(s6Var2, org.telegram.ui.Components.gb1.h(-1, 17.0f, 49, 22.0f, 4.0f, 22.0f, 0.0f));
        fi.d dVar = new fi.d(activity, u6Var, true);
        dVar.setRoundRadius(24);
        this.A0 = dVar;
        dVar.setEnabled(MessagesController.getInstance(i10).channelRevenueWithdrawalEnabled);
        dVar.i(LocaleController.getString(R.string.MonetizationWithdraw), false, true);
        dVar.setVisibility(8);
        dVar.setOnClickListener(new org.telegram.ui.ActionBar.u1(8, this, w91Var));
        rVar.addView(dVar, org.telegram.ui.Components.gb1.h(-1, 48.0f, 55, 18.0f, 13.0f, 18.0f, 0.0f));
        bi.r rVar2 = new bi.r(activity, 3);
        this.C0 = rVar2;
        rVar2.setOrientation(1);
        org.telegram.ui.ActionBar.f7.i(i15, rVar2, u6Var);
        rVar2.setPadding(0, 0, 0, AndroidUtilities.dp(17.0f));
        org.telegram.ui.Components.s6 s6Var3 = new org.telegram.ui.Components.s6(activity, false, true, true);
        this.E0 = s6Var3;
        s6Var3.setTypeface(AndroidUtilities.bold());
        org.telegram.ui.ActionBar.f7.Z(s6Var3, i16, u6Var);
        s6Var3.setTextSize(AndroidUtilities.dp(32.0f));
        s6Var3.setGravity(17);
        new RelativeSizeSpan(0.6770833f);
        rVar2.addView(s6Var3, org.telegram.ui.Components.gb1.x(-1, 38, 49, 22, 15, 22, 0));
        org.telegram.ui.Components.s6 s6Var4 = new org.telegram.ui.Components.s6(activity, true, true, true);
        this.F0 = s6Var4;
        s6Var4.setGravity(17);
        org.telegram.ui.ActionBar.f7.Z(s6Var4, i17, u6Var);
        s6Var4.setTextSize(AndroidUtilities.dp(14.0f));
        rVar2.addView(s6Var4, org.telegram.ui.Components.gb1.h(-1, 17.0f, 49, 22.0f, 4.0f, 22.0f, 0.0f));
        bi.s sVar = new bi.s(this, activity, 1);
        this.K0 = sVar;
        sVar.setVisibility(8);
        sVar.setText(LocaleController.getString(R.string.BotStarsWithdrawPlaceholder));
        sVar.setLeftPadding(AndroidUtilities.dp(36.0f));
        bi.t tVar = new bi.t(activity, 2);
        this.O0 = tVar;
        tVar.setFocusable(false);
        org.telegram.ui.ActionBar.f7.V(tVar, i16, u6Var);
        tVar.setCursorSize(AndroidUtilities.dp(20.0f));
        tVar.setCursorWidth(1.5f);
        tVar.setBackground(null);
        tVar.setTextSize(1, 18.0f);
        tVar.setMaxLines(1);
        int dp = AndroidUtilities.dp(16.0f);
        tVar.setPadding(AndroidUtilities.dp(6.0f), dp, dp, dp);
        tVar.setInputType(2);
        tVar.setTypeface(Typeface.DEFAULT);
        org.telegram.ui.ActionBar.f7.D(tVar, org.telegram.ui.ActionBar.y6.uf, u6Var);
        org.telegram.ui.ActionBar.f7.m(tVar, 36, org.telegram.ui.ActionBar.y6.vf, u6Var);
        tVar.setGravity(LocaleController.isRTL ? 5 : 3);
        tVar.setOnFocusChangeListener(new rd(this, 0));
        tVar.addTextChangedListener(new zd(this));
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(0);
        ImageView imageView = new ImageView(activity);
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setImageResource(R.drawable.star_small_inner);
        linearLayout.addView(imageView, org.telegram.ui.Components.gb1.t(-2, -2, 0.0f, 19, 14, 0, 0, 0));
        linearLayout.addView(tVar, org.telegram.ui.Components.gb1.s(-1, -2, 1.0f, 119));
        sVar.e(tVar);
        sVar.addView(linearLayout, org.telegram.ui.Components.gb1.i(-1, -2, 48));
        rVar2.addView(sVar, org.telegram.ui.Components.gb1.x(-1, -2, 1, 18, 14, 18, 2));
        LinearLayout linearLayout2 = new LinearLayout(activity);
        this.I0 = linearLayout2;
        linearLayout2.setOrientation(0);
        ae aeVar = new ae(activity, u6Var, true);
        aeVar.setRoundRadius(24);
        this.G0 = aeVar;
        aeVar.setEnabled(false);
        aeVar.i(LocaleController.formatPluralString("MonetizationStarsWithdraw", 0, new Object[0]), false, true);
        aeVar.setVisibility(0);
        aeVar.setOnClickListener(new bi.pa(this, i10, w91Var, 4));
        fi.d dVar2 = new fi.d(activity, u6Var, true);
        dVar2.setRoundRadius(24);
        this.J0 = dVar2;
        dVar2.setEnabled(false);
        dVar2.i(LocaleController.getString(R.string.MonetizationStarsAds), false, true);
        dVar2.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.td
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (view.isEnabled()) {
                    ke keVar = ke.this;
                    fi.d dVar3 = keVar.J0;
                    if (dVar3.Q) {
                        return;
                    }
                    dVar3.setLoading(true);
                    TLRPC.TL_payments_getStarsRevenueAdsAccountUrl tL_payments_getStarsRevenueAdsAccountUrl = new TLRPC.TL_payments_getStarsRevenueAdsAccountUrl();
                    int i18 = i10;
                    tL_payments_getStarsRevenueAdsAccountUrl.peer = MessagesController.getInstance(i18).getInputPeer(j10);
                    ConnectionsManager.getInstance(i18).sendRequest(tL_payments_getStarsRevenueAdsAccountUrl, new z7(2, keVar, activity));
                }
            }
        });
        linearLayout2.addView(aeVar, org.telegram.ui.Components.gb1.s(-1, 48, 1.0f, 119));
        if (ChatObject.isChannelAndNotMegaGroup(chat2)) {
            linearLayout2.addView(new Space(activity), org.telegram.ui.Components.gb1.s(8, 48, 0.0f, 119));
            linearLayout2.addView(dVar2, org.telegram.ui.Components.gb1.s(-1, 48, 1.0f, 119));
        }
        rVar2.addView(linearLayout2, org.telegram.ui.Components.gb1.h(-1, 48.0f, 55, 18.0f, 13.0f, 18.0f, 0.0f));
        tVar.setOnEditorActionListener(new yd(0, this, w91Var));
        int i18 = 2;
        this.f1 = new qd(this, i10, i18);
        org.telegram.ui.Components.r71 r71Var = new org.telegram.ui.Components.r71(w91Var, new e5(this, i18), new od(this), new od(this));
        this.X0 = r71Var;
        ig.j0 j0Var = new ig.j0(5, this, false);
        r71Var.f3 = j0Var;
        r71Var.setLayoutManager(j0Var);
        r71Var.setClipToPadding(false);
        r71Var.u1();
        r71Var.setCaptureSectionsDecoratorAllowed(true);
        r71Var.g3.r = false;
        u(r71Var, new od(this));
        x(geVar, geVar.b, new m4.x0(28));
        View view = geVar.d;
        y(view);
        view.setLayoutParams(org.telegram.ui.Components.gb1.h(-1, -2.0f, 48, -4.0f, 0.0f, -4.0f, 0.0f));
        if (qVar != null) {
            qVar.b(r71Var);
        }
        LinearLayout f7 = org.telegram.messenger.t.f(activity, 1);
        FrameLayout frameLayout = new FrameLayout(activity);
        this.Y0 = frameLayout;
        org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.a7, frameLayout, u6Var);
        frameLayout.addView(f7, org.telegram.ui.Components.gb1.i(-2, -2, 17));
        org.telegram.ui.Components.ak0 ak0Var = new org.telegram.ui.Components.ak0(activity);
        ak0Var.setAutoRepeat(true);
        ak0Var.f(R.raw.statistic_preload, 120, 120, null);
        ak0Var.d();
        TextView textView = new TextView(activity);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        int i19 = org.telegram.ui.ActionBar.y6.Oi;
        org.telegram.ui.ActionBar.f7.V(textView, i19, null);
        textView.setTag(Integer.valueOf(i19));
        textView.setText(LocaleController.getString("LoadingStats", R.string.LoadingStats));
        textView.setGravity(1);
        TextView textView2 = new TextView(activity);
        textView2.setTextSize(1, 15.0f);
        int i20 = org.telegram.ui.ActionBar.y6.Pi;
        org.telegram.ui.ActionBar.f7.V(textView2, i20, null);
        textView2.setTag(Integer.valueOf(i20));
        org.telegram.messenger.vh.k(R.string.LoadingStatsDescription, textView2, 1);
        f7.addView(ak0Var, org.telegram.ui.Components.gb1.x(120, 120, 1, 0, 0, 0, 20));
        f7.addView(textView, org.telegram.ui.Components.gb1.x(-2, -2, 1, 0, 0, 0, 10));
        f7.addView(textView2, org.telegram.ui.Components.gb1.u(-2, -2, 1));
        addView(frameLayout, org.telegram.ui.Components.gb1.i(-1, -1, 119));
    }

    public static org.telegram.ui.ActionBar.k3 I(Context context, org.telegram.ui.ActionBar.u6 u6Var, boolean z10) {
        org.telegram.ui.ActionBar.k3 i10 = org.telegram.messenger.vh.i(1, context, u6Var, false);
        LinearLayout d = org.telegram.messenger.vh.d(context, 1);
        d.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        org.telegram.ui.Components.ak0 ak0Var = new org.telegram.ui.Components.ak0(context);
        ak0Var.setScaleType(ImageView.ScaleType.CENTER);
        ak0Var.setImageResource(R.drawable.large_monetize);
        ak0Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        int dp = AndroidUtilities.dp(80.0f);
        int i11 = org.telegram.ui.ActionBar.y6.Oh;
        ShapeDrawable K = org.telegram.ui.ActionBar.y6.K(dp, org.telegram.ui.ActionBar.y6.w0(i11, u6Var));
        org.telegram.ui.ActionBar.b7 N = org.telegram.ui.ActionBar.f7.N(i11);
        ak0Var.setBackground(K);
        org.telegram.ui.ActionBar.f7.k(ak0Var, K, N, null, u6Var);
        d.addView(ak0Var, org.telegram.ui.Components.gb1.x(80, 80, 1, 0, 16, 0, 16));
        TextView textView = new TextView(context);
        textView.setGravity(17);
        ic.a.o(20.0f, 1, textView);
        int i12 = org.telegram.ui.ActionBar.y6.G6;
        org.telegram.ui.ActionBar.f7.V(textView, i12, u6Var);
        textView.setText(LocaleController.getString(z10 ? R.string.BotMonetizationInfoTitle : R.string.MonetizationInfoTitle));
        d.addView(textView, org.telegram.ui.Components.gb1.o(8.0f, 0.0f, 8.0f, 25.0f, -1, -2));
        d.addView(new di.i4(context, R.drawable.msg_channel, LocaleController.getString(z10 ? R.string.BotMonetizationInfoFeature1Name : R.string.MonetizationInfoFeature1Name), LocaleController.getString(z10 ? R.string.BotMonetizationInfoFeature1Text : R.string.MonetizationInfoFeature1Text), u6Var), org.telegram.ui.Components.gb1.x(-1, -2, 49, 8, 0, 8, 16));
        d.addView(new di.i4(context, R.drawable.menu_feature_split, LocaleController.getString(z10 ? R.string.BotMonetizationInfoFeature2Name : R.string.MonetizationInfoFeature2Name), LocaleController.getString(z10 ? R.string.BotMonetizationInfoFeature2Text : R.string.MonetizationInfoFeature2Text), u6Var), org.telegram.ui.Components.gb1.x(-1, -2, 49, 8, 0, 8, 16));
        d.addView(new di.i4(context, R.drawable.menu_feature_withdrawals, LocaleController.getString(z10 ? R.string.BotMonetizationInfoFeature3Name : R.string.MonetizationInfoFeature3Name), LocaleController.getString(z10 ? R.string.BotMonetizationInfoFeature3Text : R.string.MonetizationInfoFeature3Text), u6Var), org.telegram.ui.Components.gb1.x(-1, -2, 49, 8, 0, 8, 16));
        View view = new View(context);
        org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.d7, view, u6Var);
        d.addView(view, org.telegram.ui.Components.gb1.w(-1, 55, 12, 0, 12, 1.0f / AndroidUtilities.density, 0));
        org.telegram.ui.Components.b6 b6Var = new org.telegram.ui.Components.b6(context);
        b6Var.setGravity(17);
        b6Var.setTextSize(1, 20.0f);
        b6Var.setTypeface(AndroidUtilities.bold());
        org.telegram.ui.ActionBar.f7.V(b6Var, i12, u6Var);
        SpannableString spannableString = new SpannableString("💎");
        org.telegram.ui.Components.zq zqVar = new org.telegram.ui.Components.zq(R.drawable.mini_gram_72, 0);
        zqVar.recolorDrawable = false;
        zqVar.setScale(0.9f, 0.9f);
        zqVar.setRelativeSize(b6Var.getPaint().getFontMetricsInt());
        zqVar.spaceScaleX = 0.9f;
        spannableString.setSpan(zqVar, 0, spannableString.length(), 33);
        b6Var.setText(AndroidUtilities.replaceCharSequence("💎", LocaleController.getString(z10 ? R.string.BotMonetizationInfoTONTitle : R.string.MonetizationInfoTONTitle), spannableString));
        d.addView(b6Var, org.telegram.ui.Components.gb1.o(8.0f, 20.0f, 8.0f, 0.0f, -1, -2));
        org.telegram.ui.Components.z90 z90Var = new org.telegram.ui.Components.z90(context, u6Var);
        z90Var.setGravity(17);
        z90Var.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.f7.V(z90Var, i12, u6Var);
        org.telegram.ui.ActionBar.f7.H(z90Var, org.telegram.ui.ActionBar.y6.gc, u6Var);
        z90Var.setText(AndroidUtilities.withLearnMore(AndroidUtilities.replaceTags(LocaleController.getString(z10 ? R.string.BotMonetizationInfoTONText : R.string.MonetizationInfoTONText)), new bh.n(23, context, z10)));
        d.addView(z90Var, org.telegram.ui.Components.gb1.o(28.0f, 9.0f, 28.0f, 0.0f, -1, -2));
        fi.d f7 = org.telegram.messenger.vh.f(24, context, u6Var, true);
        f7.i(LocaleController.getString(R.string.GotIt), false, true);
        f7.setOnClickListener(new sd(i10, 0));
        d.addView(f7, org.telegram.ui.Components.gb1.x(-1, 48, 55, 10, 25, 10, 14));
        i10.setCustomView(d);
        return i10;
    }

    public static CharSequence K(CharSequence charSequence, TextPaint textPaint, float f7, float f10, boolean z10) {
        if (u1 == null) {
            u1 = new HashMap();
        }
        int i10 = ((textPaint.getFontMetricsInt().bottom * (z10 ? 1 : -1)) * ((int) (f7 * 100.0f))) - ((int) (100.0f * f10));
        SpannableString spannableString = (SpannableString) u1.get(Integer.valueOf(i10));
        if (spannableString == null) {
            spannableString = new SpannableString("T");
            if (z10) {
                org.telegram.ui.Components.zq zqVar = new org.telegram.ui.Components.zq(R.drawable.mini_gram_72, 0);
                zqVar.recolorDrawable = false;
                zqVar.setScale(f7, f7);
                zqVar.setColorKey(org.telegram.ui.ActionBar.y6.o6);
                zqVar.setRelativeSize(textPaint.getFontMetricsInt());
                zqVar.spaceScaleX = 0.9f;
                spannableString.setSpan(zqVar, 0, spannableString.length(), 33);
            } else {
                org.telegram.ui.Components.zq zqVar2 = new org.telegram.ui.Components.zq(R.drawable.mini_gram_16, 0);
                zqVar2.recolorDrawable = false;
                zqVar2.setScale(f7, f7);
                zqVar2.setTranslateY(f10);
                zqVar2.spaceScaleX = 0.95f;
                spannableString.setSpan(zqVar2, 0, spannableString.length(), 33);
            }
            u1.put(Integer.valueOf(i10), spannableString);
        }
        return AndroidUtilities.replaceMultipleCharSequence("TON", charSequence, spannableString);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void M(Context context, int i10, TL_stats.BroadcastRevenueTransaction broadcastRevenueTransaction, long j10, org.telegram.ui.ActionBar.u6 u6Var) {
        long j11;
        org.telegram.ui.ActionBar.k3 k3Var;
        String string;
        long j12;
        long j13;
        long j14;
        boolean z10;
        char c10;
        String str;
        boolean z11;
        org.telegram.ui.ActionBar.k3 k3Var2;
        String userName;
        TLRPC.User user;
        org.telegram.ui.ActionBar.k3 i11 = org.telegram.messenger.vh.i(1, context, u6Var, false);
        LinearLayout d = org.telegram.messenger.vh.d(context, 1);
        boolean z12 = broadcastRevenueTransaction instanceof TL_stats.TL_broadcastRevenueTransactionWithdrawal;
        if (z12) {
            TL_stats.TL_broadcastRevenueTransactionWithdrawal tL_broadcastRevenueTransactionWithdrawal = (TL_stats.TL_broadcastRevenueTransactionWithdrawal) broadcastRevenueTransaction;
            String string2 = LocaleController.getString(R.string.MonetizationTransactionDetailWithdraw);
            long j15 = tL_broadcastRevenueTransactionWithdrawal.date;
            j11 = 0;
            j12 = tL_broadcastRevenueTransactionWithdrawal.amount;
            z10 = tL_broadcastRevenueTransactionWithdrawal.pending;
            j13 = j15;
            c10 = 65535;
            k3Var = i11;
            str = string2;
            j14 = 0;
            z11 = tL_broadcastRevenueTransactionWithdrawal.failed;
        } else {
            j11 = 0;
            if (broadcastRevenueTransaction instanceof TL_stats.TL_broadcastRevenueTransactionProceeds) {
                TL_stats.TL_broadcastRevenueTransactionProceeds tL_broadcastRevenueTransactionProceeds = (TL_stats.TL_broadcastRevenueTransactionProceeds) broadcastRevenueTransaction;
                string = LocaleController.getString(R.string.MonetizationTransactionDetailProceed);
                long j16 = tL_broadcastRevenueTransactionProceeds.from_date;
                long j17 = tL_broadcastRevenueTransactionProceeds.to_date;
                k3Var = i11;
                j12 = tL_broadcastRevenueTransactionProceeds.amount;
                j14 = j17;
                j13 = j16;
            } else {
                k3Var = i11;
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
            c10 = 1;
            str = string;
            z11 = false;
        }
        boolean z13 = z10;
        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.US);
        decimalFormatSymbols.setDecimalSeparator('.');
        long j19 = j14;
        DecimalFormat decimalFormat = new DecimalFormat("#.##", decimalFormatSymbols);
        decimalFormat.setMinimumFractionDigits(2);
        decimalFormat.setMaximumFractionDigits(12);
        decimalFormat.setGroupingUsed(false);
        TextView textView = new TextView(context);
        textView.setGravity(17);
        org.telegram.messenger.vh.j(18.0f, 1, textView);
        org.telegram.ui.ActionBar.f7.V(textView, c10 < 0 ? org.telegram.ui.ActionBar.y6.q7 : org.telegram.ui.ActionBar.y6.l8, null);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) (c10 < 0 ? "-" : "+"));
        spannableStringBuilder.append((CharSequence) decimalFormat.format(Math.round((Math.abs(j12) / 1.0E9d) * 100000.0d) / 100000.0d));
        spannableStringBuilder.append((CharSequence) " TON");
        int indexOf = TextUtils.indexOf(spannableStringBuilder, ".");
        if (indexOf >= 0) {
            spannableStringBuilder.setSpan(new RelativeSizeSpan(1.3333334f), 0, indexOf, 33);
        }
        textView.setText(spannableStringBuilder);
        d.addView(textView, org.telegram.ui.Components.gb1.x(-1, -2, 49, 0, 24, 0, 6));
        TextView textView2 = new TextView(context);
        textView2.setGravity(17);
        textView2.setTextSize(1, 13.0f);
        org.telegram.ui.ActionBar.f7.V(textView2, org.telegram.ui.ActionBar.y6.y6, u6Var);
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
            org.telegram.ui.ActionBar.f7.V(textView2, org.telegram.ui.ActionBar.y6.q7, u6Var);
            textView2.setText(TextUtils.concat(textView2.getText(), " — ", LocaleController.getString(R.string.MonetizationTransactionNotCompleted)));
        }
        d.addView(textView2, org.telegram.ui.Components.gb1.x(-1, -2, 49, 0, 0, 0, 0));
        TextView textView3 = new TextView(context);
        textView3.setGravity(17);
        org.telegram.messenger.vh.j(14.0f, 1, textView3);
        org.telegram.ui.ActionBar.f7.V(textView3, org.telegram.ui.ActionBar.y6.G6, u6Var);
        textView3.setText(str);
        d.addView(textView3, org.telegram.ui.Components.gb1.x(-1, -2, 49, 0, 27, 0, 0));
        if (broadcastRevenueTransaction instanceof TL_stats.TL_broadcastRevenueTransactionProceeds) {
            FrameLayout frameLayout = new FrameLayout(context);
            int dp = AndroidUtilities.dp(28.0f);
            int dp2 = AndroidUtilities.dp(28.0f);
            int i12 = org.telegram.ui.ActionBar.y6.ci;
            ShapeDrawable d02 = org.telegram.ui.ActionBar.y6.d0(dp, dp2, org.telegram.ui.ActionBar.y6.w0(i12, u6Var));
            org.telegram.ui.ActionBar.b7 N = org.telegram.ui.ActionBar.f7.N(i12);
            frameLayout.setBackground(d02);
            org.telegram.ui.ActionBar.f7.k(frameLayout, d02, N, null, u6Var);
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
            org.telegram.ui.Components.y9 y9Var = new org.telegram.ui.Components.y9(context);
            y9Var.setRoundRadius(AndroidUtilities.dp(28.0f));
            org.telegram.ui.Components.j9 j9Var = new org.telegram.ui.Components.j9((org.telegram.ui.ActionBar.u6) null);
            j9Var.p(user);
            y9Var.f(user, j9Var);
            frameLayout.addView(y9Var, org.telegram.ui.Components.gb1.i(28, 28, 51));
            TextView textView4 = new TextView(context);
            org.telegram.ui.ActionBar.f7.V(textView4, org.telegram.ui.ActionBar.y6.j5, u6Var);
            textView4.setTextSize(1, 13.0f);
            textView4.setSingleLine();
            textView4.setText(userName);
            frameLayout.addView(textView4, org.telegram.ui.Components.gb1.h(-2, -2.0f, 19, 37.0f, 0.0f, 10.0f, 0.0f));
            d.addView(frameLayout, org.telegram.ui.Components.gb1.x(-2, 28, 1, 42, 10, 42, 0));
        }
        int i13 = 1;
        fi.d f7 = org.telegram.messenger.vh.f(24, context, u6Var, true);
        if (z12) {
            TL_stats.TL_broadcastRevenueTransactionWithdrawal tL_broadcastRevenueTransactionWithdrawal2 = (TL_stats.TL_broadcastRevenueTransactionWithdrawal) broadcastRevenueTransaction;
            if ((tL_broadcastRevenueTransactionWithdrawal2.flags & 2) != 0) {
                f7.i(LocaleController.getString(R.string.MonetizationTransactionDetailWithdrawButton), false, true);
                f7.setOnClickListener(new org.telegram.ui.ActionBar.u1(9, context, tL_broadcastRevenueTransactionWithdrawal2));
                k3Var2 = k3Var;
                d.addView(f7, org.telegram.ui.Components.gb1.x(-1, 48, 55, 18, 30, 18, 14));
                k3Var2.setCustomView(d);
                k3Var2.show();
            }
        }
        f7.i(LocaleController.getString(R.string.OK), false, true);
        org.telegram.ui.ActionBar.k3 k3Var3 = k3Var;
        f7.setOnClickListener(new sd(k3Var3, i13));
        k3Var2 = k3Var3;
        d.addView(f7, org.telegram.ui.Components.gb1.x(-1, 48, 55, 18, 30, 18, 14));
        k3Var2.setCustomView(d);
        k3Var2.show();
    }

    public final void D(TLRPC.TL_payments_starsRevenueStats tL_payments_starsRevenueStats) {
        FrameLayout frameLayout;
        lg.b bVar;
        ArrayList arrayList;
        boolean z10 = this.n1 == null;
        this.h1 = tL_payments_starsRevenueStats.usd_rate;
        i91 e02 = w91.e0(tL_payments_starsRevenueStats.revenue_graph, LocaleController.getString(R.string.MonetizationGraphStarsRevenue), 2, false);
        this.n1 = e02;
        if (e02 != null && (bVar = e02.d) != null && (arrayList = bVar.d) != null && !arrayList.isEmpty() && this.n1.d.d.get(0) != null) {
            ((lg.a) this.n1.d.d.get(0)).g = org.telegram.ui.ActionBar.y6.kj;
            this.n1.d.h = (float) ((1.0d / this.h1) / 100.0d);
        }
        L(false, tL_payments_starsRevenueStats.status);
        if (!this.b1 && (frameLayout = this.Y0) != null) {
            frameLayout.animate().alpha(0.0f).setDuration(380L).setInterpolator(org.telegram.ui.Components.ds.h).withEndAction(new pd(this, 6)).start();
        }
        org.telegram.ui.Components.r71 r71Var = this.X0;
        if (r71Var != null) {
            r71Var.g3.O(!z10);
            if (z10) {
                r71Var.v0(0);
            }
        }
    }

    public final void E() {
        if (isAttachedToWindow() && this.b1 && this.o1 && MessagesController.getGlobalMainSettings().getBoolean("monetizationadshint", true)) {
            this.m0.showDialog(I(getContext(), this.n0, false));
            MessagesController.getGlobalMainSettings().edit().putBoolean("monetizationadshint", false).apply();
        }
    }

    public final void F(TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, TwoStepVerificationActivity twoStepVerificationActivity, boolean z10) {
        TLRPC.TL_payments_getStarsRevenueWithdrawalUrl tL_payments_getStarsRevenueWithdrawalUrl;
        w91 w91Var = this.m0;
        if (w91Var == null) {
            return;
        }
        Activity parentActivity = w91Var.getParentActivity();
        int i10 = this.o0;
        TLRPC.User currentUser = UserConfig.getInstance(i10).getCurrentUser();
        if (parentActivity == null || currentUser == null) {
            return;
        }
        long j10 = this.p0;
        if (z10) {
            tL_payments_getStarsRevenueWithdrawalUrl = new TLRPC.TL_payments_getStarsRevenueWithdrawalUrl();
            tL_payments_getStarsRevenueWithdrawalUrl.ton = false;
            tL_payments_getStarsRevenueWithdrawalUrl.peer = MessagesController.getInstance(i10).getInputPeer(j10);
            if (inputCheckPasswordSRP == null) {
                inputCheckPasswordSRP = new TLRPC.TL_inputCheckPasswordEmpty();
            }
            tL_payments_getStarsRevenueWithdrawalUrl.password = inputCheckPasswordSRP;
            tL_payments_getStarsRevenueWithdrawalUrl.flags |= 2;
            tL_payments_getStarsRevenueWithdrawalUrl.amount = this.N0;
        } else {
            tL_payments_getStarsRevenueWithdrawalUrl = new TLRPC.TL_payments_getStarsRevenueWithdrawalUrl();
            tL_payments_getStarsRevenueWithdrawalUrl.ton = true;
            tL_payments_getStarsRevenueWithdrawalUrl.peer = MessagesController.getInstance(i10).getInputPeer(j10);
            if (inputCheckPasswordSRP == null) {
                inputCheckPasswordSRP = new TLRPC.TL_inputCheckPasswordEmpty();
            }
            tL_payments_getStarsRevenueWithdrawalUrl.password = inputCheckPasswordSRP;
        }
        ConnectionsManager.getInstance(i10).sendRequest(tL_payments_getStarsRevenueWithdrawalUrl, new bi.d4(this, twoStepVerificationActivity, parentActivity, z10));
    }

    public final boolean G(float f7, float f10) {
        return this.Y0.getVisibility() != 0 && c() && f7 >= 0.0f && f7 < ((float) getWidth()) && f10 >= getTabsTop() && f10 < ((float) getHeight());
    }

    public final void H(boolean z10) {
        if (this.c1) {
            int i10 = this.o0;
            bi.m0 g7 = bi.m0.g(i10);
            long j10 = this.p0;
            TLRPC.TL_payments_starsRevenueStats h = g7.h(j10, z10);
            if (h != null) {
                AndroidUtilities.runOnUIThread(new ed(2, this, h));
                return;
            }
            TLRPC.TL_payments_getStarsRevenueStats tL_payments_getStarsRevenueStats = new TLRPC.TL_payments_getStarsRevenueStats();
            tL_payments_getStarsRevenueStats.peer = MessagesController.getInstance(i10).getInputPeer(j10);
            tL_payments_getStarsRevenueStats.dark = org.telegram.ui.ActionBar.y6.I.q();
            ConnectionsManager.getInstance(i10).sendRequest(tL_payments_getStarsRevenueStats, new wd(this, 2));
        }
    }

    public final void J() {
        ge geVar = this.a1;
        pd pdVar = geVar.f;
        boolean[] zArr = geVar.v;
        boolean a2 = geVar.a();
        for (int i10 = 0; i10 < 2; i10++) {
            if (zArr[i10]) {
                return;
            }
            if (i10 == 1) {
                geVar.n.clear();
                geVar.h = "";
            } else {
                geVar.r.clear();
                geVar.s = "";
            }
            zArr[i10] = false;
            geVar.c(i10);
        }
        if (geVar.a() == a2 || pdVar == null) {
            return;
        }
        geVar.e();
        pdVar.run();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void L(boolean z10, TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus) {
        he heVar;
        int i10;
        org.telegram.ui.Components.j71 j71Var;
        he heVar2;
        int i11;
        ke keVar = this;
        he heVar3 = keVar.r1;
        he heVar4 = keVar.q1;
        org.telegram.ui.Components.s6 s6Var = keVar.z0;
        RelativeSizeSpan relativeSizeSpan = keVar.x0;
        org.telegram.ui.Components.s6 s6Var2 = keVar.y0;
        he heVar5 = keVar.p1;
        if (z10) {
            heVar5.a = true;
            long j10 = tL_starsRevenueStatus.available_balance.amount;
            heVar5.d = j10;
            double d = j10 / 1.0E9d;
            long j11 = (long) (keVar.g1 * d * 100.0d);
            heVar5.e = j11;
            if (keVar.Z0 == null) {
                DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.US);
                decimalFormatSymbols.setDecimalSeparator('.');
                heVar2 = heVar3;
                DecimalFormat decimalFormat = new DecimalFormat("#.##", decimalFormatSymbols);
                keVar.Z0 = decimalFormat;
                decimalFormat.setMinimumFractionDigits(2);
                i11 = 6;
                keVar.Z0.setMaximumFractionDigits(6);
                keVar.Z0.setGroupingUsed(false);
            } else {
                heVar2 = heVar3;
                i11 = 6;
            }
            DecimalFormat decimalFormat2 = keVar.Z0;
            if (d > 1.5d) {
                i11 = 2;
            }
            decimalFormat2.setMaximumFractionDigits(i11);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(K("TON " + keVar.Z0.format(d), s6Var2.getPaint(), 0.9f, 0.0f, true));
            int indexOf = TextUtils.indexOf(spannableStringBuilder, ".");
            if (indexOf >= 0) {
                spannableStringBuilder.setSpan(relativeSizeSpan, indexOf, spannableStringBuilder.length(), 33);
            }
            s6Var2.setText(spannableStringBuilder);
            s6Var.setText("≈" + BillingController.getInstance().formatCurrency(j11, "USD"));
            heVar5.f = "USD";
            heVar4.a = true;
            long j12 = tL_starsRevenueStatus.current_balance.amount;
            heVar4.d = j12;
            keVar = this;
            double d10 = keVar.g1;
            heVar4.e = (long) ((j12 / 1.0E9d) * d10 * 100.0d);
            heVar4.f = "USD";
            he heVar6 = heVar2;
            heVar6.a = true;
            long j13 = tL_starsRevenueStatus.overall_revenue.amount;
            heVar6.d = j13;
            heVar6.e = (long) ((j13 / 1.0E9d) * d10 * 100.0d);
            heVar6.f = "USD";
            keVar.o1 = true;
            keVar.A0.setVisibility((tL_starsRevenueStatus.available_balance.amount <= 0 || !tL_starsRevenueStatus.withdrawal_enabled) ? 8 : 0);
        } else {
            double d11 = keVar.h1;
            if (d11 == 0.0d) {
                return;
            }
            heVar5.g = true;
            TL_stars.StarsAmount starsAmount = tL_starsRevenueStatus.available_balance;
            heVar5.i = starsAmount;
            heVar5.j = (long) (starsAmount.amount * d11 * 100.0d);
            int i12 = tL_starsRevenueStatus.next_withdrawal_at;
            ae aeVar = keVar.G0;
            if (s6Var2 == null || s6Var == null) {
                heVar = heVar3;
                i10 = 0;
            } else {
                heVar = heVar3;
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(bi.dd.W0(false, TextUtils.concat("XTR ", bi.dd.I0(starsAmount, 0.8f, ' ')), 1.0f, null));
                int indexOf2 = TextUtils.indexOf(spannableStringBuilder2, ".");
                if (indexOf2 >= 0) {
                    spannableStringBuilder2.setSpan(relativeSizeSpan, indexOf2, spannableStringBuilder2.length(), 33);
                }
                keVar.D0 = starsAmount;
                keVar.E0.setText(spannableStringBuilder2);
                keVar.F0.setText("≈" + BillingController.getInstance().formatCurrency((long) (keVar.h1 * starsAmount.amount * 100.0d), "USD"));
                keVar.K0.setVisibility(starsAmount.amount > 0 ? 0 : 8);
                if (keVar.M0) {
                    keVar.L0 = true;
                    long j14 = starsAmount.amount;
                    keVar.N0 = j14;
                    String l4 = Long.toString(j14);
                    bi.t tVar = keVar.O0;
                    tVar.setText(l4);
                    tVar.setSelection(tVar.getText().length());
                    i10 = 0;
                    keVar.L0 = false;
                    aeVar.setEnabled(keVar.N0 > 0);
                } else {
                    i10 = 0;
                }
                fi.d dVar = keVar.J0;
                if (dVar != null) {
                    dVar.setEnabled(starsAmount.amount > 0 ? 1 : i10);
                }
                keVar.B0 = i12;
                qd qdVar = keVar.f1;
                AndroidUtilities.cancelRunOnUIThread(qdVar);
                qdVar.run();
            }
            heVar5.f = "USD";
            heVar4.g = true;
            TL_stars.StarsAmount starsAmount2 = tL_starsRevenueStatus.current_balance;
            heVar4.i = starsAmount2;
            double d12 = starsAmount2.amount;
            double d13 = keVar.h1;
            heVar4.j = (long) (d12 * d13 * 100.0d);
            heVar4.f = "USD";
            he heVar7 = heVar;
            heVar7.g = true;
            heVar7.i = tL_starsRevenueStatus.overall_revenue;
            heVar7.j = (long) (r4.amount * d13 * 100.0d);
            heVar7.f = "USD";
            keVar.o1 = true;
            LinearLayout linearLayout = keVar.I0;
            if (linearLayout != null) {
                linearLayout.setVisibility(tL_starsRevenueStatus.withdrawal_enabled ? i10 : 8);
            }
            if (aeVar != null) {
                aeVar.setVisibility((tL_starsRevenueStatus.available_balance.amount > 0 || BuildVars.DEBUG_PRIVATE_VERSION) ? i10 : 8);
            }
        }
        org.telegram.ui.Components.r71 r71Var = keVar.X0;
        if (r71Var == null || (j71Var = r71Var.g3) == null) {
            return;
        }
        j71Var.O(true);
    }

    public View getTransactionTabs() {
        return this.a1.d;
    }

    @Override // org.telegram.ui.Components.lw0, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        t1 = this;
        super.onAttachedToWindow();
        E();
    }

    @Override // org.telegram.ui.Components.lw0, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        t1 = null;
        super.onDetachedFromWindow();
        org.telegram.ui.ActionBar.k kVar = this.i1;
        if (kVar != null) {
            kVar.setCastShadows(true);
        }
    }

    public void setActionBar(org.telegram.ui.ActionBar.k kVar) {
        this.i1 = kVar;
    }

    public void setTabsPinnedChangedListener(Runnable runnable) {
        this.S0 = runnable;
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final void updateColors() {
        try {
            bi.t tVar = this.O0;
            if (tVar != null) {
                tVar.setHandlesColor(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.vf, this.n0));
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
