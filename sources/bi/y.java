package bi;

import android.app.Activity;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.RelativeSizeSpan;
import android.view.MotionEvent;
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
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.kb1;
import org.telegram.ui.Components.mw0;
import org.telegram.ui.Components.pm0;
import org.telegram.ui.Components.po;
import org.telegram.ui.Components.s71;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.v91;
import org.telegram.ui.Components.zq;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.he;
import org.telegram.ui.k91;
import org.telegram.ui.ke;
import org.telegram.ui.oo;
import org.telegram.ui.y91;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class y extends org.telegram.ui.ActionBar.r2 implements NotificationCenter.NotificationCenterDelegate {
    public final he E;
    public final he F;
    public final he G;
    public final he H;
    public final he I;
    public final CharSequence J;
    public cd K;
    public FrameLayout L;
    public FrameLayout M;
    public v91 N;
    public boolean O;
    public int P;
    public r Q;
    public LinearLayout R;
    public RelativeSizeSpan S;
    public org.telegram.ui.Components.s6 T;
    public org.telegram.ui.Components.s6 U;
    public s V;
    public boolean W;
    public boolean X;
    public long Y;
    public t Z;
    public final int a;
    public v a0;
    public final long b;
    public fi.d b0;
    public final boolean c;
    public final zq[] c0;
    public po d;
    public r d0;
    public s71 e;
    public RelativeSizeSpan e0;
    public mw0 f;
    public org.telegram.ui.Components.s6 f0;
    public org.telegram.ui.Components.s6 g0;
    public cc h;
    public fi.d h0;
    public double i0;
    public org.telegram.ui.Components.qc j0;
    public CharSequence k0;
    public CharSequence l0;
    public CharSequence m0;
    public int n;
    public boolean n0;
    public k91 o0;
    public k91 p0;
    public DecimalFormat q0;
    public View r;
    public SpannableStringBuilder r0;
    public oe.b s;
    public final d s0;
    public final int t0;
    public TLRPC.TL_payments_starsRevenueStats v;
    public TLRPC.TL_starsRevenueStatus w;
    public k91 x;
    public final he y;

    public y(int i10, long j10) {
        super(null);
        this.n = -1;
        this.y = he.a("XTR", LocaleController.getString(R.string.BotStarsOverviewAvailableBalance));
        this.E = he.a("XTR", LocaleController.getString(R.string.BotStarsOverviewTotalBalance));
        this.F = he.a("XTR", LocaleController.getString(R.string.BotStarsOverviewTotalProceeds));
        this.G = he.a("TON", LocaleController.getString(R.string.BotMonetizationOverviewAvailable));
        this.H = he.a("TON", LocaleController.getString(R.string.BotMonetizationOverviewLastWithdrawal));
        this.I = he.a("TON", LocaleController.getString(R.string.BotMonetizationOverviewTotal));
        this.W = false;
        this.X = true;
        this.c0 = new zq[1];
        this.s0 = new d(this, 0);
        this.t0 = -1;
        this.a = i10;
        this.b = j10;
        boolean z10 = j10 == getUserConfig().getClientUserId();
        this.c = z10;
        if (i10 == 0) {
            m0.g(this.currentAccount).r(j10);
            if (!z10) {
                m0.g(this.currentAccount).l(j10);
            }
        } else if (i10 == 1) {
            m0 g7 = m0.g(this.currentAccount);
            Long l4 = (Long) g7.d.get(Long.valueOf(j10));
            g7.j(j10, l4 == null || System.currentTimeMillis() - l4.longValue() > 30000);
        }
        this.J = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(z10 ? LocaleController.formatPluralStringComma("SelfStarsWithdrawInfo", (int) getMessagesController().starsRevenueWithdrawalMin) : LocaleController.getString(R.string.BotStarsWithdrawInfo), new d(this, 2)), true);
    }

    public static void V(y yVar) {
        yVar.showDialog(ke.I(yVar.getParentActivity(), yVar.resourceProvider, true));
    }

    public static void W(y yVar, u61 u61Var) {
        if (u61Var.H(xc.class)) {
            dd.g1(yVar.getParentActivity(), true, yVar.b, yVar.currentAccount, (TL_stars.StarsTransaction) u61Var.G, yVar.getResourceProvider());
        } else if (u61Var.G instanceof TL_stats.BroadcastRevenueTransaction) {
            ke.M(yVar.getParentActivity(), yVar.currentAccount, (TL_stats.BroadcastRevenueTransaction) u61Var.G, yVar.b, yVar.resourceProvider);
        } else if (u61Var.d == 2) {
            yVar.presentFragment(new hi.d4(yVar.b));
        }
    }

    public static void X(y yVar) {
        d dVar = yVar.s0;
        org.telegram.ui.Components.qc.e();
        TLRPC.TL_payments_starsRevenueStats h = m0.g(yVar.currentAccount).h(yVar.b, false);
        long j10 = h == null ? 0L : h.status.available_balance.amount;
        if (j10 < yVar.getMessagesController().starsRevenueWithdrawalMin) {
            yVar.X = true;
            yVar.Y = j10;
        } else {
            yVar.X = false;
            yVar.Y = yVar.getMessagesController().starsRevenueWithdrawalMin;
        }
        yVar.W = true;
        yVar.Z.setText(Long.toString(yVar.Y));
        t tVar = yVar.Z;
        tVar.setSelection(tVar.getText().length());
        yVar.W = false;
        AndroidUtilities.cancelRunOnUIThread(dVar);
        dVar.run();
    }

    public static void Y(y yVar, Context context, View view) {
        if (view.isEnabled()) {
            fi.d dVar = yVar.b0;
            if (dVar.Q) {
                return;
            }
            dVar.setLoading(true);
            TLRPC.TL_payments_getStarsRevenueAdsAccountUrl tL_payments_getStarsRevenueAdsAccountUrl = new TLRPC.TL_payments_getStarsRevenueAdsAccountUrl();
            tL_payments_getStarsRevenueAdsAccountUrl.peer = MessagesController.getInstance(yVar.currentAccount).getInputPeer(yVar.b);
            ConnectionsManager.getInstance(yVar.currentAccount).sendRequest(tL_payments_getStarsRevenueAdsAccountUrl, new j(0, yVar, context));
        }
    }

    public static void Z(y yVar, TLRPC.TL_error tL_error, TwoStepVerificationActivity twoStepVerificationActivity, Activity activity, boolean z10, long j10, TLObject tLObject) {
        int i10;
        if (tL_error == null) {
            twoStepVerificationActivity.p0();
            twoStepVerificationActivity.finishFragment();
            if (tLObject instanceof TL_stats.TL_broadcastRevenueWithdrawalUrl) {
                qf.d.t(yVar.getParentActivity(), ((TL_stats.TL_broadcastRevenueWithdrawalUrl) tLObject).url);
                return;
            } else {
                if (tLObject instanceof TLRPC.TL_payments_starsRevenueWithdrawalUrl) {
                    yVar.X = true;
                    qf.d.t(yVar.getParentActivity(), ((TLRPC.TL_payments_starsRevenueWithdrawalUrl) tLObject).url);
                    return;
                }
                return;
            }
        }
        if (!"PASSWORD_MISSING".equals(tL_error.text) && !tL_error.text.startsWith("PASSWORD_TOO_FRESH_") && !tL_error.text.startsWith("SESSION_TOO_FRESH_")) {
            if ("SRP_ID_INVALID".equals(tL_error.text)) {
                ConnectionsManager.getInstance(yVar.currentAccount).sendRequest(new TL_account.getPassword(), new m(yVar, twoStepVerificationActivity, z10, j10, 0), 8);
                return;
            }
            twoStepVerificationActivity.p0();
            twoStepVerificationActivity.finishFragment();
            org.telegram.ui.Components.wc.e0(tL_error);
            return;
        }
        twoStepVerificationActivity.p0();
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
        alertDialog$Builder.a.R = LocaleController.getString(R.string.EditAdminTransferAlertTitle);
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setPadding(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(24.0f), 0);
        linearLayout.setOrientation(1);
        alertDialog$Builder.o(linearLayout);
        TextView textView = new TextView(activity);
        int i11 = org.telegram.ui.ActionBar.y6.j5;
        org.telegram.ui.ActionBar.f7.V(textView, i11, null);
        textView.setTextSize(1, 16.0f);
        textView.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        textView.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.WithdrawChannelAlertText)));
        linearLayout.addView(textView, kb1.r(-1, -2));
        LinearLayout linearLayout2 = new LinearLayout(activity);
        linearLayout2.setOrientation(0);
        linearLayout.addView(linearLayout2, kb1.o(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
        ImageView imageView = new ImageView(activity);
        imageView.setImageResource(R.drawable.list_circle);
        imageView.setPadding(LocaleController.isRTL ? AndroidUtilities.dp(11.0f) : 0, AndroidUtilities.dp(9.0f), LocaleController.isRTL ? 0 : AndroidUtilities.dp(11.0f), 0);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        org.telegram.ui.ActionBar.f7.t(imageView, i11, null, mode);
        TextView textView2 = new TextView(activity);
        org.telegram.ui.ActionBar.f7.V(textView2, i11, null);
        textView2.setTextSize(1, 16.0f);
        textView2.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        org.telegram.messenger.t.n(R.string.EditAdminTransferAlertText1, textView2);
        if (LocaleController.isRTL) {
            linearLayout2.addView(textView2, kb1.r(-1, -2));
            linearLayout2.addView(imageView, kb1.u(-2, -2, 5));
        } else {
            linearLayout2.addView(imageView, kb1.r(-2, -2));
            linearLayout2.addView(textView2, kb1.r(-1, -2));
        }
        LinearLayout f7 = org.telegram.messenger.t.f(activity, 0);
        linearLayout.addView(f7, kb1.o(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
        ImageView imageView2 = new ImageView(activity);
        imageView2.setImageResource(R.drawable.list_circle);
        imageView2.setPadding(LocaleController.isRTL ? AndroidUtilities.dp(11.0f) : 0, AndroidUtilities.dp(9.0f), LocaleController.isRTL ? 0 : AndroidUtilities.dp(11.0f), 0);
        org.telegram.ui.ActionBar.f7.t(imageView2, i11, null, mode);
        TextView textView3 = new TextView(activity);
        org.telegram.ui.ActionBar.f7.V(textView3, i11, null);
        textView3.setTextSize(1, 16.0f);
        textView3.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        org.telegram.messenger.t.n(R.string.EditAdminTransferAlertText2, textView3);
        if (LocaleController.isRTL) {
            f7.addView(textView3, kb1.r(-1, -2));
            i10 = 5;
            f7.addView(imageView2, kb1.u(-2, -2, 5));
        } else {
            i10 = 5;
            f7.addView(imageView2, kb1.r(-2, -2));
            f7.addView(textView3, kb1.r(-1, -2));
        }
        if ("PASSWORD_MISSING".equals(tL_error.text)) {
            alertDialog$Builder.k(LocaleController.getString(R.string.EditAdminTransferSetPassword), new e(yVar));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        } else {
            TextView textView4 = new TextView(activity);
            org.telegram.ui.ActionBar.f7.V(textView4, i11, null);
            textView4.setTextSize(1, 16.0f);
            textView4.setGravity((LocaleController.isRTL ? i10 : 3) | 48);
            textView4.setText(LocaleController.getString(R.string.EditAdminTransferAlertText3));
            linearLayout.addView(textView4, kb1.o(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
            alertDialog$Builder.h(LocaleController.getString(R.string.OK), null);
        }
        twoStepVerificationActivity.showDialog(alertDialog$Builder.a);
    }

    public static void a0(y yVar, ArrayList arrayList) {
        int i10;
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus;
        int i11;
        boolean z10;
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus2;
        he heVar = yVar.I;
        he heVar2 = yVar.H;
        he heVar3 = yVar.F;
        he heVar4 = yVar.E;
        he heVar5 = yVar.y;
        long j10 = yVar.b;
        he heVar6 = yVar.G;
        boolean z11 = yVar.c;
        int i12 = yVar.t0;
        yVar.n = -1;
        m0 g7 = m0.g(yVar.currentAccount);
        int i13 = yVar.a;
        if (i13 == 0) {
            arrayList.add(u61.h(2, i12, yVar.x));
            arrayList.add(u61.B(-1, null));
            arrayList.add(u61.b(LocaleController.getString(R.string.BotStarsOverview)));
            TLRPC.TL_payments_starsRevenueStats h = g7.h(j10, false);
            if (h == null || (tL_starsRevenueStatus2 = h.status) == null) {
                z10 = z11;
            } else {
                heVar5.a = false;
                heVar5.g = true;
                TL_stars.StarsAmount starsAmount = tL_starsRevenueStatus2.available_balance;
                heVar5.i = starsAmount;
                heVar5.h = "XTR";
                heVar5.f = "USD";
                double d = starsAmount.amount;
                double d10 = yVar.i0;
                z10 = z11;
                heVar5.j = (long) (d * d10 * 100.0d);
                heVar4.a = false;
                heVar4.g = true;
                heVar4.i = tL_starsRevenueStatus2.current_balance;
                heVar4.h = "XTR";
                heVar4.j = (long) (r9.amount * d10 * 100.0d);
                heVar4.f = "USD";
                heVar3.a = false;
                heVar3.g = true;
                heVar3.i = tL_starsRevenueStatus2.overall_revenue;
                heVar3.h = "XTR";
                heVar3.j = (long) (r9.amount * d10 * 100.0d);
                heVar3.f = "USD";
                yVar.r0(starsAmount, tL_starsRevenueStatus2.next_withdrawal_at);
                yVar.R.setVisibility(h.status.withdrawal_enabled ? 0 : 8);
            }
            arrayList.add(u61.v(heVar5));
            arrayList.add(u61.v(heVar4));
            arrayList.add(u61.v(heVar3));
            arrayList.add(u61.B(-2, LocaleController.getString(z10 ? R.string.SelfStarsOverviewInfo : R.string.BotStarsOverviewInfo)));
            arrayList.add(u61.b(LocaleController.getString(R.string.BotStarsAvailableBalance)));
            arrayList.add(u61.j(1, yVar.Q));
            arrayList.add(u61.B(-3, yVar.J));
            if (z10) {
                return;
            }
            if (yVar.getMessagesController().starrefConnectAllowed) {
                arrayList.add(hi.g.a(2, org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.uj, yVar.resourceProvider), R.drawable.filled_earn_stars, oo.e0(LocaleController.getString(R.string.BotAffiliateProgramRowTitle)), LocaleController.getString(R.string.BotAffiliateProgramRowText)));
                arrayList.add(u61.B(-4, null));
            }
            yVar.n = arrayList.size();
            arrayList.add(u61.n(yVar.h, -2));
            return;
        }
        if (i13 == 1) {
            TLRPC.TL_payments_starsRevenueStats j11 = g7.j(j10, true);
            int i14 = 3;
            if (!z11) {
                if (yVar.k0 == null) {
                    yVar.k0 = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.BotMonetizationInfo, 50), -1, 3, new d(yVar, i14), yVar.resourceProvider), true);
                }
                arrayList.add(u61.g(yVar.k0));
            }
            if (yVar.o0 == null && j11 != null) {
                k91 e02 = y91.e0(j11.top_hours_graph, LocaleController.getString(R.string.BotMonetizationGraphImpressions), 0, false);
                yVar.o0 = e02;
                if (e02 != null) {
                    e02.n = true;
                }
            }
            k91 k91Var = yVar.o0;
            if (k91Var != null && !k91Var.l) {
                arrayList.add(u61.h(5, i12, k91Var));
                arrayList.add(u61.B(-1, null));
            }
            if (yVar.p0 != null || j11 == null) {
                i10 = 2;
            } else {
                TL_stats.StatsGraph statsGraph = j11.revenue_graph;
                if (statsGraph != null) {
                    statsGraph.rate = (float) (1.0E7d / j11.usd_rate);
                }
                i10 = 2;
                yVar.p0 = y91.e0(statsGraph, LocaleController.getString(R.string.BotMonetizationGraphRevenue), 2, false);
            }
            k91 k91Var2 = yVar.p0;
            if (k91Var2 != null && !k91Var2.l) {
                arrayList.add(u61.h(i10, i12, k91Var2));
                arrayList.add(u61.B(-2, null));
            }
            if (!yVar.n0 && j11 != null && (tL_starsRevenueStatus = j11.status) != null) {
                double d11 = j11.usd_rate;
                long j12 = tL_starsRevenueStatus.available_balance.amount;
                heVar6.d = j12;
                double d12 = j12 / 1.0E9d;
                long j13 = (long) (d12 * d11 * 100.0d);
                heVar6.e = j13;
                if (yVar.q0 == null) {
                    DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.US);
                    decimalFormatSymbols.setDecimalSeparator('.');
                    DecimalFormat decimalFormat = new DecimalFormat("#.##", decimalFormatSymbols);
                    yVar.q0 = decimalFormat;
                    decimalFormat.setMinimumFractionDigits(2);
                    i11 = 6;
                    yVar.q0.setMaximumFractionDigits(6);
                    yVar.q0.setGroupingUsed(false);
                } else {
                    i11 = 6;
                }
                DecimalFormat decimalFormat2 = yVar.q0;
                if (d12 > 1.5d) {
                    i11 = 2;
                }
                decimalFormat2.setMaximumFractionDigits(i11);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(ke.K("TON " + yVar.q0.format(d12), yVar.f0.getPaint(), 0.9f, 0.0f, true));
                int indexOf = TextUtils.indexOf(spannableStringBuilder, ".");
                if (indexOf >= 0) {
                    spannableStringBuilder.setSpan(yVar.e0, indexOf, spannableStringBuilder.length(), 33);
                }
                yVar.f0.setText(spannableStringBuilder);
                yVar.g0.setText("≈" + BillingController.getInstance().formatCurrency(j13, "USD"));
                heVar6.f = "USD";
                TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus3 = j11.status;
                long j14 = tL_starsRevenueStatus3.current_balance.amount;
                heVar2.d = j14;
                heVar2.e = (long) ((j14 / 1.0E9d) * d11 * 100.0d);
                heVar2.f = "USD";
                heVar.a = true;
                long j15 = tL_starsRevenueStatus3.overall_revenue.amount;
                heVar.d = j15;
                heVar.e = (long) ((j15 / 1.0E9d) * d11 * 100.0d);
                heVar.f = "USD";
                yVar.n0 = true;
                yVar.h0.setVisibility((tL_starsRevenueStatus3.available_balance.amount <= 0 || !tL_starsRevenueStatus3.withdrawal_enabled) ? 8 : 0);
            }
            if (yVar.n0) {
                arrayList.add(u61.b(LocaleController.getString(R.string.BotMonetizationOverview)));
                arrayList.add(u61.v(heVar6));
                arrayList.add(u61.v(heVar2));
                arrayList.add(u61.v(heVar));
                if (yVar.l0 == null) {
                    yVar.l0 = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.BotMonetizationProceedsTONInfo), -1, 3, new ag.r0(yVar, R.string.BotMonetizationProceedsTONInfoLink, 2), yVar.resourceProvider), true);
                }
                arrayList.add(u61.B(-4, yVar.l0));
            }
            arrayList.add(u61.b(LocaleController.getString(R.string.BotMonetizationBalance)));
            arrayList.add(u61.k(yVar.d0));
            if (yVar.m0 == null) {
                yVar.m0 = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(MessagesController.getInstance(yVar.currentAccount).channelRevenueWithdrawalEnabled ? R.string.BotMonetizationBalanceInfo : R.string.BotMonetizationBalanceInfoNotAvailable), -1, 3, new d(yVar, 4)), true);
            }
            arrayList.add(u61.B(-5, yVar.m0));
            yVar.n = arrayList.size();
            arrayList.add(u61.n(yVar.h, -2));
        }
    }

    public static String s0(int i10) {
        int i11 = i10 / 86400;
        int i12 = i10 - (86400 * i11);
        int i13 = i12 / 3600;
        int i14 = i12 - (i13 * 3600);
        int i15 = i14 / 60;
        int i16 = i14 - (i15 * 60);
        if (i11 == 0) {
            return i13 == 0 ? String.format(Locale.ENGLISH, "%02d:%02d", Integer.valueOf(i15), Integer.valueOf(i16)) : String.format(Locale.ENGLISH, "%02d:%02d:%02d", Integer.valueOf(i13), Integer.valueOf(i15), Integer.valueOf(i16));
        }
        int i17 = R.string.PeriodDHM;
        Locale locale = Locale.ENGLISH;
        return LocaleController.formatString(i17, String.format(locale, "%02d", Integer.valueOf(i11)), String.format(locale, "%02d", Integer.valueOf(i13)), String.format(locale, "%02d", Integer.valueOf(i15)));
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final View createView(Context context) {
        FrameLayout frameLayout;
        boolean z10;
        boolean z11 = this.c;
        int i10 = this.a;
        if (i10 == 1 || !z11) {
            mw0 mw0Var = new mw0(context);
            this.f = mw0Var;
            mw0Var.setCommonInsetsManagedExternally(true);
            this.f.setGeometry(new b6.i(this, 7));
            mw0 mw0Var2 = this.f;
            mw0Var2.getClass();
            this.h = new cc(mw0Var2, context, 24);
            frameLayout = this.f;
        } else {
            this.f = null;
            this.h = null;
            frameLayout = new FrameLayout(context);
        }
        FrameLayout frameLayout2 = frameLayout;
        frameLayout2.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.y6.a7));
        this.d = new po(context, null, false, getResourceProvider());
        TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.b));
        this.d.k(user, true);
        this.simpleActionBar.setTitle(UserObject.getUserName(user));
        if (i10 == 0) {
            this.simpleActionBar.setSubtitle(LocaleController.getString(R.string.BotStatsStars));
        } else {
            this.simpleActionBar.setSubtitle(LocaleController.getString(R.string.BotStatsTON));
        }
        this.simpleActionBar.setBackButtonDrawable(new org.telegram.ui.ActionBar.j2(false));
        this.simpleActionBar.setActionBarMenuOnItemClick(new bh.m(this, 1));
        this.simpleActionBar.setBackground(null);
        cd cdVar = (i10 != 0 || this.f == null) ? null : new cd(context, this.currentAccount, false, this.b, getClassGuid(), getResourceProvider(), this.f);
        this.K = cdVar;
        if (i10 == 1) {
            FrameLayout frameLayout3 = new FrameLayout(context);
            this.L = frameLayout3;
            frameLayout3.setClipChildren(false);
            this.L.setClipToPadding(false);
            pm0 pm0Var = new pm0(context, this.resourceProvider, this.f);
            this.N = pm0Var;
            pm0Var.setAdapter(new w(this, context, pm0Var));
            FrameLayout frameLayout4 = new FrameLayout(context);
            this.M = frameLayout4;
            frameLayout4.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
            this.M.addView(pm0Var.n(-2, true), kb1.i(-1, 48, 48));
            this.L.addView(pm0Var, kb1.g(-1.0f, -1));
        } else if (cdVar != null) {
            this.N = cdVar.getViewPager();
            this.M = this.K.getTabsContainer();
        }
        r rVar = new r(context, 0);
        this.Q = rVar;
        rVar.setOrientation(1);
        r rVar2 = this.Q;
        int i11 = org.telegram.ui.ActionBar.y6.d6;
        org.telegram.ui.ActionBar.f7.i(i11, rVar2, getResourceProvider());
        this.Q.setPadding(0, 0, 0, AndroidUtilities.dp(17.0f));
        org.telegram.ui.Components.s6 s6Var = new org.telegram.ui.Components.s6(context, false, true, true);
        this.T = s6Var;
        s6Var.setTypeface(AndroidUtilities.bold());
        org.telegram.ui.Components.s6 s6Var2 = this.T;
        int i12 = org.telegram.ui.ActionBar.y6.G6;
        org.telegram.ui.ActionBar.f7.Z(s6Var2, i12, getResourceProvider());
        this.T.setTextSize(AndroidUtilities.dp(32.0f));
        this.T.setGravity(17);
        this.S = new RelativeSizeSpan(0.6770833f);
        this.Q.addView(this.T, kb1.x(-1, 38, 49, 22, 15, 22, 0));
        org.telegram.ui.Components.s6 s6Var3 = new org.telegram.ui.Components.s6(context, true, true, true);
        this.U = s6Var3;
        s6Var3.setGravity(17);
        org.telegram.ui.Components.s6 s6Var4 = this.U;
        int i13 = org.telegram.ui.ActionBar.y6.y6;
        org.telegram.ui.ActionBar.f7.Z(s6Var4, i13, getResourceProvider());
        this.U.setTextSize(AndroidUtilities.dp(14.0f));
        this.Q.addView(this.U, kb1.h(-1, 17.0f, 49, 22.0f, 4.0f, 22.0f, 0.0f));
        s sVar = new s(this, context, 0);
        this.V = sVar;
        sVar.setText(LocaleController.getString(R.string.BotStarsWithdrawPlaceholder));
        this.V.setLeftPadding(AndroidUtilities.dp(36.0f));
        t tVar = new t(context, 0);
        this.Z = tVar;
        tVar.setFocusable(false);
        org.telegram.ui.ActionBar.f7.V(this.Z, i12, getResourceProvider());
        this.Z.setCursorSize(AndroidUtilities.dp(20.0f));
        this.Z.setCursorWidth(1.5f);
        this.Z.setBackground(null);
        this.Z.setTextSize(1, 18.0f);
        this.Z.setMaxLines(1);
        int dp = AndroidUtilities.dp(16.0f);
        this.Z.setPadding(AndroidUtilities.dp(6.0f), dp, dp, dp);
        this.Z.setInputType(2);
        this.Z.setTypeface(Typeface.DEFAULT);
        org.telegram.ui.ActionBar.f7.D(this.Z, org.telegram.ui.ActionBar.y6.uf, getResourceProvider());
        org.telegram.ui.ActionBar.f7.z(this.Z, org.telegram.ui.ActionBar.y6.vf, getResourceProvider());
        this.Z.setGravity(LocaleController.isRTL ? 5 : 3);
        this.Z.setOnFocusChangeListener(new bh.j0(this, 1));
        this.Z.addTextChangedListener(new u(this, 0));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setImageResource(R.drawable.star_small_inner);
        linearLayout.addView(imageView, kb1.t(-2, -2, 0.0f, 19, 14, 0, 0, 0));
        linearLayout.addView(this.Z, kb1.s(-1, -2, 1.0f, 119));
        this.V.e(this.Z);
        this.V.addView(linearLayout, kb1.i(-1, -2, 48));
        this.Z.setOnEditorActionListener(new o(this, 0));
        this.Q.addView(this.V, kb1.x(-1, -2, 1, 18, 14, 18, 2));
        this.V.setVisibility(8);
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.R = linearLayout2;
        linearLayout2.setOrientation(0);
        v vVar = new v(0, context, getResourceProvider(), true);
        vVar.setRoundRadius(24);
        this.a0 = vVar;
        vVar.setEnabled(MessagesController.getInstance(this.currentAccount).channelRevenueWithdrawalEnabled);
        this.a0.i(LocaleController.getString(R.string.BotStarsButtonWithdrawShortAll), false, true);
        final int i14 = 0;
        this.a0.setOnClickListener(new View.OnClickListener(this) { // from class: bi.p
            public final /* synthetic */ y b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i14) {
                    case 0:
                        this.b.u0();
                        break;
                    default:
                        if (view.isEnabled()) {
                            y yVar = this.b;
                            if (!yVar.h0.Q) {
                                TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                                ai.f0 f0Var = new ai.f0(3, yVar, twoStepVerificationActivity);
                                twoStepVerificationActivity.Z = 1;
                                twoStepVerificationActivity.b0 = f0Var;
                                yVar.h0.setLoading(true);
                                twoStepVerificationActivity.t0(new h(yVar, twoStepVerificationActivity, 0));
                                break;
                            }
                        }
                        break;
                }
            }
        });
        fi.d dVar = new fi.d(context, getResourceProvider(), true);
        dVar.setRoundRadius(24);
        this.b0 = dVar;
        dVar.setEnabled(true);
        this.b0.i(LocaleController.getString(R.string.MonetizationStarsAds), false, true);
        this.b0.setOnClickListener(new q(0, this, context));
        this.R.addView(this.a0, kb1.s(-1, 48, 1.0f, 119));
        if (!z11) {
            this.R.addView(new Space(context), kb1.s(8, 48, 0.0f, 119));
            this.R.addView(this.b0, kb1.s(-1, 48, 1.0f, 119));
        }
        this.Q.addView(this.R, kb1.h(-1, 48.0f, 55, 18.0f, 13.0f, 18.0f, 0.0f));
        r rVar3 = new r(context, 1);
        this.d0 = rVar3;
        rVar3.setOrientation(1);
        org.telegram.ui.ActionBar.f7.i(i11, this.d0, this.resourceProvider);
        this.d0.setPadding(0, 0, 0, AndroidUtilities.dp(17.0f));
        org.telegram.ui.Components.s6 s6Var5 = new org.telegram.ui.Components.s6(context, false, true, true);
        this.f0 = s6Var5;
        s6Var5.setTypeface(AndroidUtilities.bold());
        org.telegram.ui.ActionBar.f7.Z(this.f0, i12, this.resourceProvider);
        this.f0.setTextSize(AndroidUtilities.dp(32.0f));
        this.f0.setGravity(17);
        this.e0 = new RelativeSizeSpan(0.6770833f);
        this.d0.addView(this.f0, kb1.x(-1, 38, 49, 22, 15, 22, 0));
        org.telegram.ui.Components.s6 s6Var6 = new org.telegram.ui.Components.s6(context, true, true, true);
        this.g0 = s6Var6;
        s6Var6.setGravity(17);
        org.telegram.ui.ActionBar.f7.Z(this.g0, i13, this.resourceProvider);
        this.g0.setTextSize(AndroidUtilities.dp(14.0f));
        this.d0.addView(this.g0, kb1.h(-1, 17.0f, 49, 22.0f, 4.0f, 22.0f, 0.0f));
        fi.d dVar2 = new fi.d(context, this.resourceProvider, true);
        dVar2.setRoundRadius(24);
        this.h0 = dVar2;
        dVar2.setEnabled(MessagesController.getInstance(this.currentAccount).channelRevenueWithdrawalEnabled);
        this.h0.i(LocaleController.getString(z11 ? R.string.MonetizationSelfWithdraw : R.string.MonetizationWithdraw), false, true);
        this.h0.setVisibility(8);
        final int i15 = 1;
        this.h0.setOnClickListener(new View.OnClickListener(this) { // from class: bi.p
            public final /* synthetic */ y b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i15) {
                    case 0:
                        this.b.u0();
                        break;
                    default:
                        if (view.isEnabled()) {
                            y yVar = this.b;
                            if (!yVar.h0.Q) {
                                TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                                ai.f0 f0Var = new ai.f0(3, yVar, twoStepVerificationActivity);
                                twoStepVerificationActivity.Z = 1;
                                twoStepVerificationActivity.b0 = f0Var;
                                yVar.h0.setLoading(true);
                                twoStepVerificationActivity.t0(new h(yVar, twoStepVerificationActivity, 0));
                                break;
                            }
                        }
                        break;
                }
            }
        });
        this.d0.addView(this.h0, kb1.h(-1, 48.0f, 55, 18.0f, 13.0f, 18.0f, 0.0f));
        s71 s71Var = new s71(this, new ai.e(this, 2), new e(this), new e(this));
        this.e = s71Var;
        s71Var.u1();
        s71 s71Var2 = this.e;
        s71Var2.g3.r = false;
        s71Var2.setCaptureSectionsDecoratorAllowed(true);
        this.e.setClipToPadding(false);
        this.e.setOverScrollMode(0);
        mw0 mw0Var3 = this.f;
        if (mw0Var3 != null) {
            s71 s71Var3 = this.e;
            getParentActivity();
            ig.j0 j0Var = new ig.j0(5, mw0Var3, false);
            s71Var3.f3 = j0Var;
            s71Var3.setLayoutManager(j0Var);
            this.f.u(this.e, new e(this));
            z10 = true;
            this.f.x(i10 == 1 ? this.L : this.K, this.N, new e(this));
            FrameLayout frameLayout5 = this.M;
            this.f.y(frameLayout5);
            frameLayout5.setLayoutParams(kb1.h(-1, -2.0f, 48, -4.0f, 0.0f, -4.0f, 0.0f));
        } else {
            z10 = true;
            frameLayout2.addView(this.e, kb1.g(-1.0f, -1));
        }
        this.fragmentView = frameLayout2;
        getBaseSimpleGlass().e(frameLayout2, this.e, this.simpleActionBar, this.resourceProvider);
        this.simpleActionBar.setBackground(null);
        this.r = new View(getParentActivity());
        frameLayout2.addView(this.r, frameLayout2.indexOfChild(this.f != null ? this.M : this.simpleActionBar), kb1.i(-1, 0, 48));
        this.r.setBackground(getBaseSimpleGlass().a(this.r));
        oe.b bVar = new oe.b(0, new e(this), ds.h, 380L, false);
        this.s = bVar;
        mw0 mw0Var4 = this.f;
        bVar.a((mw0Var4 == null || !mw0Var4.e0) ? false : z10, false);
        if (this.f != null) {
            getBaseSimpleGlass().h = this.f;
            cd cdVar2 = this.K;
            if (cdVar2 != null) {
                cdVar2.setGlassEngine(this.glassEngine);
            } else {
                this.glassEngine.c(this.N);
            }
            getBaseSimpleGlass().i = new g(0, this, new f(0, frameLayout2));
            View view = this.M;
            eh.d c10 = getBaseSimpleGlass().c.c(view, null, false);
            c10.v(gh.c.m(this.resourceProvider));
            c10.w(AndroidUtilities.dp(9.66f));
            c10.x(AndroidUtilities.dp(18.0f));
            view.setBackground(c10);
        }
        AndroidUtilities.removeFromParent(this.d.e);
        frameLayout2.addView(this.d.e, kb1.i(42, 42, 53));
        o0();
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.botStarsUpdated && ((Long) objArr[0]).longValue() == this.b) {
            p0();
        }
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean isLightStatusBar() {
        return AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.d6, false)) > 0.721f;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        v91 v91Var = this.N;
        if (v91Var == null || !v91Var.canScrollHorizontally(-1)) {
            return super.isSwipeBackEnabled(motionEvent);
        }
        return false;
    }

    public final void o0() {
        if (this.e == null) {
            return;
        }
        AndroidUtilities.setViewLayoutMargins(this.d.e, 0, ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - AndroidUtilities.dp(42.0f)) / 2) + this.mSystemInsets.b, AndroidUtilities.dp(6.0f), 0);
        s71 s71Var = this.e;
        i0.b bVar = this.mSystemInsets;
        oi.a.d(s71Var, bVar.b, bVar.d, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), 0);
        if (this.f != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.e.getLayoutParams();
            this.f.z(-marginLayoutParams.topMargin, -marginLayoutParams.bottomMargin);
            mw0 mw0Var = this.f;
            mw0Var.B();
            mw0Var.requestLayout();
            mw0Var.invalidate();
        }
        if (this.r != null) {
            int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + this.mSystemInsets.b + (this.f != null ? AndroidUtilities.dp(44.0f) : 0);
            ViewGroup.LayoutParams layoutParams = this.r.getLayoutParams();
            if (layoutParams.height != currentActionBarHeight) {
                layoutParams.height = currentActionBarHeight;
                this.r.setLayoutParams(layoutParams);
            }
            t0();
        }
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean onFragmentCreate() {
        NotificationCenter.getInstance(this.currentAccount).addWeakObserver(this, NotificationCenter.botStarsUpdated);
        p0();
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onFragmentDestroy() {
        this.O = true;
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.botStarsUpdated);
        super.onFragmentDestroy();
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onInsets(int i10, int i11, int i12, int i13) {
        o0();
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            po poVar = this.d;
            if (poVar != null) {
                poVar.i(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.Oi, false), org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.Pi, false));
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public final void p0() {
        lg.b bVar;
        ArrayList arrayList;
        TLRPC.TL_payments_starsRevenueStats h = m0.g(this.currentAccount).h(this.b, false);
        if (h == this.v) {
            if ((h == null ? null : h.status) == this.w) {
                return;
            }
        }
        this.v = h;
        this.w = h != null ? h.status : null;
        if (h != null) {
            this.i0 = h.usd_rate;
            k91 e02 = y91.e0(h.revenue_graph, LocaleController.getString(R.string.BotStarsChartRevenue), 2, false);
            this.x = e02;
            if (e02 != null && (bVar = e02.d) != null && (arrayList = bVar.d) != null && !arrayList.isEmpty() && this.x.d.d.get(0) != null) {
                k91 k91Var = this.x;
                k91Var.h = true;
                ((lg.a) k91Var.d.d.get(0)).g = org.telegram.ui.ActionBar.y6.yj;
                this.x.d.h = (float) ((1.0d / this.i0) / 100.0d);
            }
            TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus = h.status;
            r0(tL_starsRevenueStatus.available_balance, tL_starsRevenueStatus.next_withdrawal_at);
            s71 s71Var = this.e;
            if (s71Var != null) {
                mw0 mw0Var = this.f;
                boolean z10 = mw0Var != null && mw0Var.e0;
                s71Var.g3.O(mw0Var == null);
                if (z10) {
                    this.f.a();
                }
            }
        }
    }

    public final void q0(boolean z10, long j10, TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, TwoStepVerificationActivity twoStepVerificationActivity) {
        TLRPC.TL_payments_getStarsRevenueWithdrawalUrl tL_payments_getStarsRevenueWithdrawalUrl;
        Activity parentActivity = getParentActivity();
        TLRPC.User currentUser = UserConfig.getInstance(this.currentAccount).getCurrentUser();
        if (parentActivity == null || currentUser == null) {
            return;
        }
        long j11 = this.b;
        if (z10) {
            tL_payments_getStarsRevenueWithdrawalUrl = new TLRPC.TL_payments_getStarsRevenueWithdrawalUrl();
            tL_payments_getStarsRevenueWithdrawalUrl.ton = false;
            tL_payments_getStarsRevenueWithdrawalUrl.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(j11);
            if (inputCheckPasswordSRP == null) {
                inputCheckPasswordSRP = new TLRPC.TL_inputCheckPasswordEmpty();
            }
            tL_payments_getStarsRevenueWithdrawalUrl.password = inputCheckPasswordSRP;
            tL_payments_getStarsRevenueWithdrawalUrl.flags |= 2;
            tL_payments_getStarsRevenueWithdrawalUrl.amount = j10;
        } else {
            tL_payments_getStarsRevenueWithdrawalUrl = new TLRPC.TL_payments_getStarsRevenueWithdrawalUrl();
            tL_payments_getStarsRevenueWithdrawalUrl.ton = true;
            tL_payments_getStarsRevenueWithdrawalUrl.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(j11);
            if (inputCheckPasswordSRP == null) {
                inputCheckPasswordSRP = new TLRPC.TL_inputCheckPasswordEmpty();
            }
            tL_payments_getStarsRevenueWithdrawalUrl.password = inputCheckPasswordSRP;
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_payments_getStarsRevenueWithdrawalUrl, new k(this, twoStepVerificationActivity, parentActivity, z10, j10));
    }

    public final void r0(TL_stars.StarsAmount starsAmount, int i10) {
        if (this.T == null || this.U == null) {
            return;
        }
        long j10 = (long) (this.i0 * starsAmount.amount * 100.0d);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(dd.W0(false, TextUtils.concat("XTR ", dd.I0(starsAmount, 0.8f, ' ')), 1.0f, null));
        int indexOf = TextUtils.indexOf(spannableStringBuilder, ".");
        if (indexOf >= 0) {
            spannableStringBuilder.setSpan(this.S, indexOf, spannableStringBuilder.length(), 33);
        }
        this.T.setText(spannableStringBuilder);
        this.U.setText("≈" + BillingController.getInstance().formatCurrency(j10, "USD"));
        this.V.setVisibility(j10 > 0 ? 0 : 8);
        if (this.X) {
            this.W = true;
            t tVar = this.Z;
            long j11 = starsAmount.amount;
            this.Y = j11;
            tVar.setText(Long.toString(j11));
            t tVar2 = this.Z;
            tVar2.setSelection(tVar2.getText().length());
            this.W = false;
            this.a0.setEnabled(this.Y > 0);
        }
        this.P = i10;
        d dVar = this.s0;
        AndroidUtilities.cancelRunOnUIThread(dVar);
        dVar.run();
    }

    public final void t0() {
        View view = this.r;
        if (view == null) {
            return;
        }
        oe.b bVar = this.s;
        view.setTranslationY(this.f != null ? AndroidUtilities.dp(44.0f) * (-(1.0f - (bVar == null ? 0.0f : bVar.e))) : 0.0f);
    }

    public final void u0() {
        v vVar = this.a0;
        if (!vVar.c0 || vVar.Q) {
            return;
        }
        int currentTime = getConnectionsManager().getCurrentTime();
        int i10 = 1;
        if (this.P > currentTime) {
            this.j0 = org.telegram.ui.Components.wc.b0(this).R(R.raw.timer_3, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BotStarsWithdrawalToast, s0(this.P - currentTime)))).j();
            return;
        }
        if (this.Y < getMessagesController().starsRevenueWithdrawalMin) {
            org.telegram.ui.Components.wc.b0(this).L(getParentActivity().getResources().getDrawable(R.drawable.star_small_inner).mutate(), AndroidUtilities.replaceSingleTag(LocaleController.formatPluralString("BotStarsWithdrawMinLimit", (int) getMessagesController().starsRevenueWithdrawalMin, new Object[0]), new d(this, i10))).j();
            return;
        }
        long j10 = this.Y;
        TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
        i iVar = new i(this, j10, twoStepVerificationActivity, 0);
        twoStepVerificationActivity.Z = 1;
        twoStepVerificationActivity.b0 = iVar;
        this.a0.setLoading(true);
        twoStepVerificationActivity.t0(new h(this, twoStepVerificationActivity, i10));
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean useSimpleActionBar() {
        return true;
    }
}
