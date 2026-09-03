package mh;

import android.app.Activity;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Typeface;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.RelativeSizeSpan;
import android.view.View;
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
import org.telegram.ui.Components.ao;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.oq;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.w51;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.he;
import org.telegram.ui.ke;
import org.telegram.ui.na1;
import org.telegram.ui.po;
import org.telegram.ui.yh;
import org.telegram.ui.z91;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final class p extends org.telegram.ui.ActionBar.p2 implements NotificationCenter.NotificationCenterDelegate {
    public final CharSequence B;
    public ia C;
    public int D;
    public eg.s3 E;
    public LinearLayout F;
    public RelativeSizeSpan G;
    public org.telegram.ui.Components.k6 H;
    public org.telegram.ui.Components.k6 I;
    public l J;
    public boolean K;
    public boolean L;
    public long M;
    public m N;
    public n O;
    public qh.d P;
    public final oq[] Q;
    public eg.s3 R;
    public RelativeSizeSpan S;
    public org.telegram.ui.Components.k6 T;
    public org.telegram.ui.Components.k6 U;
    public qh.d V;
    public double W;
    public ic X;
    public CharSequence Y;
    public CharSequence Z;
    public final int a;
    public CharSequence a0;
    public final long b;
    public boolean b0;
    public final boolean c;
    public z91 c0;
    public ao d;
    public z91 d0;
    public h61 e;
    public boolean e0;
    public TLRPC.TL_payments_starsRevenueStats f;
    public boolean f0;
    public final ArrayList g0;
    public TLRPC.TL_starsRevenueStatus h;
    public String h0;
    public DecimalFormat i0;
    public SpannableStringBuilder j0;
    public final c k0;
    public final int l0;
    public z91 n;
    public final he r;
    public final he s;
    public final he v;
    public final he w;
    public final he x;
    public final he y;

    public p(int i10, long j10) {
        super(null);
        this.r = he.a("XTR", LocaleController.getString(R.string.BotStarsOverviewAvailableBalance));
        this.s = he.a("XTR", LocaleController.getString(R.string.BotStarsOverviewTotalBalance));
        this.v = he.a("XTR", LocaleController.getString(R.string.BotStarsOverviewTotalProceeds));
        this.w = he.a("TON", LocaleController.getString(R.string.BotMonetizationOverviewAvailable));
        this.x = he.a("TON", LocaleController.getString(R.string.BotMonetizationOverviewLastWithdrawal));
        this.y = he.a("TON", LocaleController.getString(R.string.BotMonetizationOverviewTotal));
        this.K = false;
        this.L = true;
        this.Q = new oq[1];
        this.e0 = false;
        this.f0 = false;
        this.g0 = new ArrayList();
        this.h0 = "";
        this.k0 = new c(this, 0);
        this.l0 = -1;
        this.a = i10;
        this.b = j10;
        boolean z4 = j10 == getUserConfig().getClientUserId();
        this.c = z4;
        if (i10 == 0) {
            a0.g(this.currentAccount).r(j10);
            if (!z4) {
                a0.g(this.currentAccount).l(j10);
            }
        } else if (i10 == 1) {
            a0 g10 = a0.g(this.currentAccount);
            Long l10 = (Long) g10.d.get(Long.valueOf(j10));
            g10.j(j10, l10 == null || System.currentTimeMillis() - l10.longValue() > 30000);
        }
        this.B = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(z4 ? LocaleController.formatPluralStringComma("SelfStarsWithdrawInfo", (int) getMessagesController().starsRevenueWithdrawalMin) : LocaleController.getString(R.string.BotStarsWithdrawInfo), new c(this, 4)), true);
    }

    public static void U(p pVar) {
        c cVar = pVar.k0;
        ic.e();
        TLRPC.TL_payments_starsRevenueStats h = a0.g(pVar.currentAccount).h(pVar.b, false);
        long j10 = h == null ? 0L : h.status.available_balance.amount;
        if (j10 < pVar.getMessagesController().starsRevenueWithdrawalMin) {
            pVar.L = true;
            pVar.M = j10;
        } else {
            pVar.L = false;
            pVar.M = pVar.getMessagesController().starsRevenueWithdrawalMin;
        }
        pVar.K = true;
        pVar.N.setText(Long.toString(pVar.M));
        m mVar = pVar.N;
        mVar.setSelection(mVar.getText().length());
        pVar.K = false;
        AndroidUtilities.cancelRunOnUIThread(cVar);
        cVar.run();
    }

    public static void V(p pVar) {
        pVar.showDialog(ke.d0(pVar.getParentActivity(), pVar.resourceProvider, true));
    }

    public static void W(p pVar, h51 h51Var) {
        if (h51Var.G(da.class)) {
            ja.h1(pVar.getParentActivity(), true, pVar.b, pVar.currentAccount, (TL_stars.StarsTransaction) h51Var.G, pVar.getResourceProvider());
        } else if (h51Var.G instanceof TL_stats.BroadcastRevenueTransaction) {
            ke.h0(pVar.getParentActivity(), pVar.currentAccount, (TL_stats.BroadcastRevenueTransaction) h51Var.G, pVar.b, pVar.resourceProvider);
        } else if (h51Var.d == 2) {
            pVar.presentFragment(new sh.d3(pVar.b));
        }
    }

    public static void X(p pVar, Context context, View view) {
        if (view.isEnabled()) {
            qh.d dVar = pVar.P;
            if (dVar.K) {
                return;
            }
            dVar.setLoading(true);
            TLRPC.TL_payments_getStarsRevenueAdsAccountUrl tL_payments_getStarsRevenueAdsAccountUrl = new TLRPC.TL_payments_getStarsRevenueAdsAccountUrl();
            tL_payments_getStarsRevenueAdsAccountUrl.peer = MessagesController.getInstance(pVar.currentAccount).getInputPeer(pVar.b);
            ConnectionsManager.getInstance(pVar.currentAccount).sendRequest(tL_payments_getStarsRevenueAdsAccountUrl, new eg.b3(5, pVar, context));
        }
    }

    public static void Y(p pVar, ArrayList arrayList) {
        int i10;
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus;
        double d;
        int i11;
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus2;
        he heVar = pVar.x;
        ArrayList arrayList2 = pVar.g0;
        he heVar2 = pVar.y;
        he heVar3 = pVar.v;
        he heVar4 = pVar.s;
        he heVar5 = pVar.r;
        long j10 = pVar.b;
        he heVar6 = pVar.w;
        boolean z4 = pVar.c;
        int i12 = pVar.l0;
        a0 g10 = a0.g(pVar.currentAccount);
        int i13 = pVar.a;
        if (i13 == 0) {
            arrayList.add(h51.h(2, i12, pVar.n));
            arrayList.add(h51.A(-1, null));
            arrayList.add(h51.b(LocaleController.getString(R.string.BotStarsOverview)));
            TLRPC.TL_payments_starsRevenueStats h = g10.h(j10, false);
            if (h != null && (tL_starsRevenueStatus2 = h.status) != null) {
                heVar5.a = false;
                heVar5.g = true;
                TL_stars.StarsAmount starsAmount = tL_starsRevenueStatus2.available_balance;
                heVar5.i = starsAmount;
                heVar5.h = "XTR";
                heVar5.f = "USD";
                double d10 = starsAmount.amount;
                double d11 = pVar.W;
                heVar5.j = (long) (d10 * d11 * 100.0d);
                heVar4.a = false;
                heVar4.g = true;
                heVar4.i = tL_starsRevenueStatus2.current_balance;
                heVar4.h = "XTR";
                heVar4.j = (long) (r9.amount * d11 * 100.0d);
                heVar4.f = "USD";
                heVar3.a = false;
                heVar3.g = true;
                heVar3.i = tL_starsRevenueStatus2.overall_revenue;
                heVar3.h = "XTR";
                heVar3.j = (long) (r9.amount * d11 * 100.0d);
                heVar3.f = "USD";
                pVar.i0(starsAmount, tL_starsRevenueStatus2.next_withdrawal_at);
                pVar.F.setVisibility(h.status.withdrawal_enabled ? 0 : 8);
            }
            arrayList.add(h51.u(heVar5));
            arrayList.add(h51.u(heVar4));
            arrayList.add(h51.u(heVar3));
            arrayList.add(h51.A(-2, LocaleController.getString(z4 ? R.string.SelfStarsOverviewInfo : R.string.BotStarsOverviewInfo)));
            arrayList.add(h51.b(LocaleController.getString(R.string.BotStarsAvailableBalance)));
            arrayList.add(h51.j(1, pVar.E));
            arrayList.add(h51.A(-3, pVar.B));
            if (z4) {
                return;
            }
            if (pVar.getMessagesController().starrefConnectAllowed) {
                arrayList.add(sh.f.a(2, org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.uj, pVar.resourceProvider), R.drawable.filled_earn_stars, po.d0(LocaleController.getString(R.string.BotAffiliateProgramRowTitle)), LocaleController.getString(R.string.BotAffiliateProgramRowText)));
                arrayList.add(h51.A(-4, null));
            }
            arrayList.add(h51.p(pVar.C, 0, false));
            return;
        }
        if (i13 == 1) {
            TLRPC.TL_payments_starsRevenueStats j11 = g10.j(j10, true);
            if (!z4) {
                if (pVar.Y == null) {
                    pVar.Y = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.BotMonetizationInfo, 50), -1, 3, new c(pVar, 2), pVar.resourceProvider), true);
                }
                arrayList.add(h51.g(pVar.Y));
            }
            if (pVar.c0 == null && j11 != null) {
                z91 f02 = na1.f0(j11.top_hours_graph, LocaleController.getString(R.string.BotMonetizationGraphImpressions), 0, false);
                pVar.c0 = f02;
                if (f02 != null) {
                    f02.n = true;
                }
            }
            z91 z91Var = pVar.c0;
            if (z91Var != null && !z91Var.l) {
                arrayList.add(h51.h(5, i12, z91Var));
                arrayList.add(h51.A(-1, null));
            }
            if (pVar.d0 != null || j11 == null) {
                i10 = 2;
            } else {
                TL_stats.StatsGraph statsGraph = j11.revenue_graph;
                if (statsGraph != null) {
                    statsGraph.rate = (float) (1.0E7d / j11.usd_rate);
                }
                i10 = 2;
                pVar.d0 = na1.f0(statsGraph, LocaleController.getString(R.string.BotMonetizationGraphRevenue), 2, false);
            }
            z91 z91Var2 = pVar.d0;
            if (z91Var2 != null && !z91Var2.l) {
                arrayList.add(h51.h(i10, i12, z91Var2));
                arrayList.add(h51.A(-2, null));
            }
            if (!pVar.b0 && j11 != null && (tL_starsRevenueStatus = j11.status) != null) {
                double d12 = j11.usd_rate;
                long j12 = tL_starsRevenueStatus.available_balance.amount;
                heVar6.d = j12;
                double d13 = j12 / 1.0E9d;
                long j13 = (long) (d13 * d12 * 100.0d);
                heVar6.e = j13;
                if (pVar.i0 == null) {
                    DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.US);
                    decimalFormatSymbols.setDecimalSeparator('.');
                    d = d12;
                    DecimalFormat decimalFormat = new DecimalFormat("#.##", decimalFormatSymbols);
                    pVar.i0 = decimalFormat;
                    decimalFormat.setMinimumFractionDigits(2);
                    i11 = 6;
                    pVar.i0.setMaximumFractionDigits(6);
                    pVar.i0.setGroupingUsed(false);
                } else {
                    d = d12;
                    i11 = 6;
                }
                DecimalFormat decimalFormat2 = pVar.i0;
                if (d13 > 1.5d) {
                    i11 = 2;
                }
                decimalFormat2.setMaximumFractionDigits(i11);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(ke.f0("TON " + pVar.i0.format(d13), pVar.T.getPaint(), 0.9f, 0.0f, true));
                int indexOf = TextUtils.indexOf(spannableStringBuilder, ".");
                if (indexOf >= 0) {
                    spannableStringBuilder.setSpan(pVar.S, indexOf, spannableStringBuilder.length(), 33);
                }
                pVar.T.setText(spannableStringBuilder);
                pVar.U.setText("≈" + BillingController.getInstance().formatCurrency(j13, "USD"));
                heVar6.f = "USD";
                TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus3 = j11.status;
                long j14 = tL_starsRevenueStatus3.current_balance.amount;
                heVar.d = j14;
                heVar.e = (long) ((j14 / 1.0E9d) * d * 100.0d);
                heVar.f = "USD";
                heVar2.a = true;
                long j15 = tL_starsRevenueStatus3.overall_revenue.amount;
                heVar2.d = j15;
                heVar2.e = (long) ((j15 / 1.0E9d) * d * 100.0d);
                heVar2.f = "USD";
                pVar.b0 = true;
                pVar.V.setVisibility((tL_starsRevenueStatus3.available_balance.amount <= 0 || !tL_starsRevenueStatus3.withdrawal_enabled) ? 8 : 0);
            }
            if (pVar.b0) {
                arrayList.add(h51.b(LocaleController.getString(R.string.BotMonetizationOverview)));
                arrayList.add(h51.u(heVar6));
                arrayList.add(h51.u(heVar));
                arrayList.add(h51.u(heVar2));
                if (pVar.Z == null) {
                    pVar.Z = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.BotMonetizationProceedsTONInfo), -1, 3, new af.b(pVar, R.string.BotMonetizationProceedsTONInfoLink, 8), pVar.resourceProvider), true);
                }
                arrayList.add(h51.A(-4, pVar.Z));
            }
            arrayList.add(h51.b(LocaleController.getString(R.string.BotMonetizationBalance)));
            arrayList.add(h51.k(pVar.R));
            if (pVar.a0 == null) {
                pVar.a0 = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(MessagesController.getInstance(pVar.currentAccount).channelRevenueWithdrawalEnabled ? R.string.BotMonetizationBalanceInfo : R.string.BotMonetizationBalanceInfoNotAvailable), -1, 3, new c(pVar, 3)), true);
            }
            arrayList.add(h51.A(-5, pVar.a0));
            if (!pVar.f0 || !arrayList2.isEmpty()) {
                arrayList.add(h51.b(LocaleController.getString(R.string.BotMonetizationTransactions)));
                int size = arrayList2.size();
                int i14 = 0;
                while (i14 < size) {
                    Object obj = arrayList2.get(i14);
                    i14++;
                    int i15 = da.a;
                    h51 J = h51.J(da.class);
                    J.G = (TL_stars.StarsTransaction) obj;
                    J.q = true;
                    arrayList.add(J);
                }
                if (!pVar.f0) {
                    arrayList.add(h51.o(1, 7));
                    arrayList.add(h51.o(2, 7));
                    arrayList.add(h51.o(3, 7));
                }
            }
            arrayList.add(h51.A(-6, null));
        }
    }

    public static void Z(p pVar, TLRPC.TL_error tL_error, TwoStepVerificationActivity twoStepVerificationActivity, Activity activity, boolean z4, long j10, TLObject tLObject) {
        int i10;
        if (tL_error == null) {
            twoStepVerificationActivity.o0();
            twoStepVerificationActivity.finishFragment();
            if (tLObject instanceof TL_stats.TL_broadcastRevenueWithdrawalUrl) {
                af.g.u(pVar.getParentActivity(), ((TL_stats.TL_broadcastRevenueWithdrawalUrl) tLObject).url);
                return;
            } else {
                if (tLObject instanceof TLRPC.TL_payments_starsRevenueWithdrawalUrl) {
                    pVar.L = true;
                    af.g.u(pVar.getParentActivity(), ((TLRPC.TL_payments_starsRevenueWithdrawalUrl) tLObject).url);
                    return;
                }
                return;
            }
        }
        if (!"PASSWORD_MISSING".equals(tL_error.text) && !tL_error.text.startsWith("PASSWORD_TOO_FRESH_") && !tL_error.text.startsWith("SESSION_TOO_FRESH_")) {
            if ("SRP_ID_INVALID".equals(tL_error.text)) {
                ConnectionsManager.getInstance(pVar.currentAccount).sendRequest(new TL_account.getPassword(), new h(pVar, twoStepVerificationActivity, z4, j10, 0), 8);
                return;
            }
            twoStepVerificationActivity.o0();
            twoStepVerificationActivity.finishFragment();
            qc.b0(tL_error);
            return;
        }
        twoStepVerificationActivity.o0();
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
        alertDialog$Builder.a.O = LocaleController.getString(R.string.EditAdminTransferAlertTitle);
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setPadding(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(24.0f), 0);
        linearLayout.setOrientation(1);
        alertDialog$Builder.n(linearLayout);
        TextView textView = new TextView(activity);
        int i11 = org.telegram.ui.ActionBar.k6.j5;
        textView.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, i11, false));
        textView.setTextSize(1, 16.0f);
        textView.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        textView.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.WithdrawChannelAlertText)));
        linearLayout.addView(textView, k7.c6.n(-1, -2));
        LinearLayout linearLayout2 = new LinearLayout(activity);
        linearLayout2.setOrientation(0);
        linearLayout.addView(linearLayout2, k7.c6.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
        ImageView imageView = new ImageView(activity);
        imageView.setImageResource(R.drawable.list_circle);
        imageView.setPadding(LocaleController.isRTL ? AndroidUtilities.dp(11.0f) : 0, AndroidUtilities.dp(9.0f), LocaleController.isRTL ? 0 : AndroidUtilities.dp(11.0f), 0);
        int w02 = org.telegram.ui.ActionBar.k6.w0(null, i11, false);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        imageView.setColorFilter(new PorterDuffColorFilter(w02, mode));
        TextView textView2 = new TextView(activity);
        textView2.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, i11, false));
        textView2.setTextSize(1, 16.0f);
        textView2.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        org.telegram.messenger.y3.q(R.string.EditAdminTransferAlertText1, textView2);
        if (LocaleController.isRTL) {
            linearLayout2.addView(textView2, k7.c6.n(-1, -2));
            linearLayout2.addView(imageView, k7.c6.q(-2, -2, 5));
        } else {
            linearLayout2.addView(imageView, k7.c6.n(-2, -2));
            linearLayout2.addView(textView2, k7.c6.n(-1, -2));
        }
        LinearLayout h = l.d.h(activity, 0);
        linearLayout.addView(h, k7.c6.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
        ImageView imageView2 = new ImageView(activity);
        imageView2.setImageResource(R.drawable.list_circle);
        imageView2.setPadding(LocaleController.isRTL ? AndroidUtilities.dp(11.0f) : 0, AndroidUtilities.dp(9.0f), LocaleController.isRTL ? 0 : AndroidUtilities.dp(11.0f), 0);
        imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.w0(null, i11, false), mode));
        TextView textView3 = new TextView(activity);
        textView3.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, i11, false));
        textView3.setTextSize(1, 16.0f);
        textView3.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        org.telegram.messenger.y3.q(R.string.EditAdminTransferAlertText2, textView3);
        if (LocaleController.isRTL) {
            h.addView(textView3, k7.c6.n(-1, -2));
            i10 = 5;
            h.addView(imageView2, k7.c6.q(-2, -2, 5));
        } else {
            i10 = 5;
            h.addView(imageView2, k7.c6.n(-2, -2));
            h.addView(textView3, k7.c6.n(-1, -2));
        }
        if ("PASSWORD_MISSING".equals(tL_error.text)) {
            alertDialog$Builder.k(LocaleController.getString(R.string.EditAdminTransferSetPassword), new g(pVar));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        } else {
            TextView textView4 = new TextView(activity);
            textView4.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, i11, false));
            textView4.setTextSize(1, 16.0f);
            if (!LocaleController.isRTL) {
                i10 = 3;
            }
            textView4.setGravity(i10 | 48);
            textView4.setText(LocaleController.getString(R.string.EditAdminTransferAlertText3));
            linearLayout.addView(textView4, k7.c6.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
            alertDialog$Builder.h(LocaleController.getString(R.string.OK), null);
        }
        twoStepVerificationActivity.showDialog(alertDialog$Builder.a);
    }

    public static /* synthetic */ void a0(p pVar, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject instanceof TL_stars.StarsStatus) {
            TL_stars.StarsStatus starsStatus = (TL_stars.StarsStatus) tLObject;
            MessagesController.getInstance(pVar.currentAccount).putUsers(starsStatus.users, false);
            MessagesController.getInstance(pVar.currentAccount).putChats(starsStatus.chats, false);
            pVar.h0 = starsStatus.next_offset;
            pVar.g0.addAll(starsStatus.history);
            pVar.f0 = starsStatus.history.isEmpty() || starsStatus.next_offset == null;
        } else if (tL_error != null) {
            qc.b0(tL_error);
            pVar.f0 = true;
        }
        pVar.e0 = false;
        w51 w51Var = pVar.e.V2;
        if (w51Var != null) {
            w51Var.N(true);
        }
    }

    public static void e0(p pVar) {
        if (pVar.e0 || pVar.f0 || pVar.h0 == null) {
            return;
        }
        pVar.e0 = true;
        TL_stars.TL_payments_getStarsTransactions tL_payments_getStarsTransactions = new TL_stars.TL_payments_getStarsTransactions();
        tL_payments_getStarsTransactions.ton = true;
        tL_payments_getStarsTransactions.peer = MessagesController.getInstance(pVar.currentAccount).getInputPeer(pVar.b);
        tL_payments_getStarsTransactions.offset = pVar.h0;
        tL_payments_getStarsTransactions.limit = pVar.g0.isEmpty() ? 5 : 20;
        ConnectionsManager.getInstance(pVar.currentAccount).sendRequest(tL_payments_getStarsTransactions, new gf.a(pVar, 5));
    }

    public static String j0(int i10) {
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

    @Override // org.telegram.ui.ActionBar.p2
    public final View createView(Context context) {
        o oVar = new o(this, context);
        ao aoVar = new ao(context, null, false, null);
        this.d = aoVar;
        boolean z4 = true;
        aoVar.setOccupyStatusBar(!AndroidUtilities.isTablet());
        this.d.getAvatarImageView().setScaleX(0.9f);
        this.d.getAvatarImageView().setScaleY(0.9f);
        this.d.setRightAvatarPadding(-AndroidUtilities.dp(3.0f));
        this.actionBar.addView(this.d, 0, k7.c6.d(-2, -1.0f, 51, !this.inPreviewMode ? 50.0f : 0.0f, 0.0f, 40.0f, 0.0f));
        TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.b));
        this.d.k(user, true);
        this.d.setTitle(UserObject.getUserName(user));
        if (this.a == 0) {
            this.d.setSubtitle(LocaleController.getString(R.string.BotStatsStars));
        } else {
            this.d.setSubtitle(LocaleController.getString(R.string.BotStatsTON));
        }
        yh.z(false, this.actionBar);
        this.actionBar.setActionBarMenuOnItemClick(new fg.l1(this, 2));
        ao aoVar2 = this.d;
        int i10 = org.telegram.ui.ActionBar.k6.Oi;
        aoVar2.i(org.telegram.ui.ActionBar.k6.w0(null, i10, false), org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.Pi, false));
        this.actionBar.C(org.telegram.ui.ActionBar.k6.w0(null, i10, false), false);
        this.actionBar.C(org.telegram.ui.ActionBar.k6.w0(null, i10, false), true);
        this.actionBar.B(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.z8, false), false);
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i11 = org.telegram.ui.ActionBar.k6.d6;
        kVar.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, i11, false));
        this.C = new ia(context, this.currentAccount, false, this.b, getClassGuid(), getResourceProvider());
        eg.s3 s3Var = new eg.s3(context, 1);
        this.E = s3Var;
        s3Var.setOrientation(1);
        this.E.setBackgroundColor(org.telegram.ui.ActionBar.k6.v0(i11, getResourceProvider()));
        this.E.setPadding(0, 0, 0, AndroidUtilities.dp(17.0f));
        org.telegram.ui.Components.k6 k6Var = new org.telegram.ui.Components.k6(context, false, true, true);
        this.H = k6Var;
        k6Var.setTypeface(AndroidUtilities.bold());
        org.telegram.ui.Components.k6 k6Var2 = this.H;
        int i12 = org.telegram.ui.ActionBar.k6.G6;
        k6Var2.setTextColor(org.telegram.ui.ActionBar.k6.v0(i12, getResourceProvider()));
        this.H.setTextSize(AndroidUtilities.dp(32.0f));
        this.H.setGravity(17);
        this.G = new RelativeSizeSpan(0.6770833f);
        this.E.addView(this.H, k7.c6.t(-1, 38, 49, 22, 15, 22, 0));
        org.telegram.ui.Components.k6 k6Var3 = new org.telegram.ui.Components.k6(context, true, true, true);
        this.I = k6Var3;
        k6Var3.setGravity(17);
        org.telegram.ui.Components.k6 k6Var4 = this.I;
        int i13 = org.telegram.ui.ActionBar.k6.y6;
        k6Var4.setTextColor(org.telegram.ui.ActionBar.k6.v0(i13, getResourceProvider()));
        this.I.setTextSize(AndroidUtilities.dp(14.0f));
        this.E.addView(this.I, k7.c6.d(-1, 17.0f, 49, 22.0f, 4.0f, 22.0f, 0.0f));
        l lVar = new l(this, context, 0);
        this.J = lVar;
        lVar.setText(LocaleController.getString(R.string.BotStarsWithdrawPlaceholder));
        this.J.setLeftPadding(AndroidUtilities.dp(36.0f));
        m mVar = new m(context, 0);
        this.N = mVar;
        mVar.setFocusable(false);
        this.N.setTextColor(getThemedColor(i12));
        this.N.setCursorSize(AndroidUtilities.dp(20.0f));
        this.N.setCursorWidth(1.5f);
        this.N.setBackground(null);
        this.N.setTextSize(1, 18.0f);
        this.N.setMaxLines(1);
        int dp = AndroidUtilities.dp(16.0f);
        this.N.setPadding(AndroidUtilities.dp(6.0f), dp, dp, dp);
        this.N.setInputType(2);
        this.N.setTypeface(Typeface.DEFAULT);
        this.N.setHighlightColor(getThemedColor(org.telegram.ui.ActionBar.k6.uf));
        this.N.setHandlesColor(getThemedColor(org.telegram.ui.ActionBar.k6.vf));
        this.N.setGravity(LocaleController.isRTL ? 5 : 3);
        this.N.setOnFocusChangeListener(new dg.z(this, 2));
        this.N.addTextChangedListener(new eh.c(this, 4));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setImageResource(R.drawable.star_small_inner);
        linearLayout.addView(imageView, k7.c6.p(-2, -2, 0.0f, 19, 14, 0, 0, 0));
        linearLayout.addView(this.N, k7.c6.o(-1, -2, 1.0f, 119));
        this.J.e(this.N);
        this.J.addView(linearLayout, k7.c6.e(-1, -2, 48));
        this.N.setOnEditorActionListener(new j(this, 0));
        this.E.addView(this.J, k7.c6.t(-1, -2, 1, 18, 14, 18, 2));
        this.J.setVisibility(8);
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.F = linearLayout2;
        linearLayout2.setOrientation(0);
        n nVar = new n(0, context, getResourceProvider(), z4);
        nVar.setRoundRadius(24);
        this.O = nVar;
        nVar.setEnabled(MessagesController.getInstance(this.currentAccount).channelRevenueWithdrawalEnabled);
        this.O.g(LocaleController.getString(R.string.BotStarsButtonWithdrawShortAll), false, true);
        final int i14 = 0;
        this.O.setOnClickListener(new View.OnClickListener(this) { // from class: mh.k
            public final /* synthetic */ p b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i14) {
                    case 0:
                        this.b.k0();
                        break;
                    default:
                        if (view.isEnabled()) {
                            p pVar = this.b;
                            if (!pVar.V.K) {
                                TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                                c1.b bVar = new c1.b(27, pVar, twoStepVerificationActivity);
                                twoStepVerificationActivity.W = 1;
                                twoStepVerificationActivity.Y = bVar;
                                pVar.V.setLoading(true);
                                twoStepVerificationActivity.s0(new d(pVar, twoStepVerificationActivity, 0));
                                break;
                            }
                        }
                        break;
                }
            }
        });
        qh.d dVar = new qh.d(context, getResourceProvider(), true);
        dVar.setRoundRadius(24);
        this.P = dVar;
        dVar.setEnabled(true);
        this.P.g(LocaleController.getString(R.string.MonetizationStarsAds), false, true);
        this.P.setOnClickListener(new dg.n(16, this, context));
        this.F.addView(this.O, k7.c6.o(-1, 48, 1.0f, 119));
        boolean z10 = this.c;
        if (!z10) {
            this.F.addView(new Space(context), k7.c6.o(8, 48, 0.0f, 119));
            this.F.addView(this.P, k7.c6.o(-1, 48, 1.0f, 119));
        }
        this.E.addView(this.F, k7.c6.d(-1, 48.0f, 55, 18.0f, 13.0f, 18.0f, 0.0f));
        eg.s3 s3Var2 = new eg.s3(context, 2);
        this.R = s3Var2;
        s3Var2.setOrientation(1);
        this.R.setBackgroundColor(org.telegram.ui.ActionBar.k6.v0(i11, this.resourceProvider));
        this.R.setPadding(0, 0, 0, AndroidUtilities.dp(17.0f));
        org.telegram.ui.Components.k6 k6Var5 = new org.telegram.ui.Components.k6(context, false, true, true);
        this.T = k6Var5;
        k6Var5.setTypeface(AndroidUtilities.bold());
        this.T.setTextColor(org.telegram.ui.ActionBar.k6.v0(i12, this.resourceProvider));
        this.T.setTextSize(AndroidUtilities.dp(32.0f));
        this.T.setGravity(17);
        this.S = new RelativeSizeSpan(0.6770833f);
        this.R.addView(this.T, k7.c6.t(-1, 38, 49, 22, 15, 22, 0));
        org.telegram.ui.Components.k6 k6Var6 = new org.telegram.ui.Components.k6(context, true, true, true);
        this.U = k6Var6;
        k6Var6.setGravity(17);
        this.U.setTextColor(org.telegram.ui.ActionBar.k6.v0(i13, this.resourceProvider));
        this.U.setTextSize(AndroidUtilities.dp(14.0f));
        this.R.addView(this.U, k7.c6.d(-1, 17.0f, 49, 22.0f, 4.0f, 22.0f, 0.0f));
        qh.d dVar2 = new qh.d(context, this.resourceProvider, true);
        this.V = dVar2;
        dVar2.setEnabled(MessagesController.getInstance(this.currentAccount).channelRevenueWithdrawalEnabled);
        this.V.g(LocaleController.getString(z10 ? R.string.MonetizationSelfWithdraw : R.string.MonetizationWithdraw), false, true);
        this.V.setVisibility(8);
        final int i15 = 1;
        this.V.setOnClickListener(new View.OnClickListener(this) { // from class: mh.k
            public final /* synthetic */ p b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i15) {
                    case 0:
                        this.b.k0();
                        break;
                    default:
                        if (view.isEnabled()) {
                            p pVar = this.b;
                            if (!pVar.V.K) {
                                TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                                c1.b bVar = new c1.b(27, pVar, twoStepVerificationActivity);
                                twoStepVerificationActivity.W = 1;
                                twoStepVerificationActivity.Y = bVar;
                                pVar.V.setLoading(true);
                                twoStepVerificationActivity.s0(new d(pVar, twoStepVerificationActivity, 0));
                                break;
                            }
                        }
                        break;
                }
            }
        });
        this.R.addView(this.V, k7.c6.d(-1, 48.0f, 55, 18.0f, 13.0f, 18.0f, 0.0f));
        h61 h61Var = new h61(this, new eg.p1(this, 14), new g(this), new g(this));
        this.e = h61Var;
        h61Var.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.k6.a7));
        this.e.o1();
        oVar.addView(this.e, k7.c6.c(-1.0f, -1));
        this.e.setOnScrollListener(new fg.e2(this, 6));
        this.actionBar.setAdaptiveBackground(this.e);
        this.fragmentView = oVar;
        return oVar;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.botStarsUpdated && ((Long) objArr[0]).longValue() == this.b) {
            g0();
        }
    }

    public final void g0() {
        xf.b bVar;
        ArrayList arrayList;
        TLRPC.TL_payments_starsRevenueStats h = a0.g(this.currentAccount).h(this.b, false);
        if (h == this.f) {
            if ((h == null ? null : h.status) == this.h) {
                return;
            }
        }
        this.f = h;
        this.h = h != null ? h.status : null;
        if (h != null) {
            this.W = h.usd_rate;
            z91 f02 = na1.f0(h.revenue_graph, LocaleController.getString(R.string.BotStarsChartRevenue), 2, false);
            this.n = f02;
            if (f02 != null && (bVar = f02.d) != null && (arrayList = bVar.d) != null && !arrayList.isEmpty() && this.n.d.d.get(0) != null) {
                z91 z91Var = this.n;
                z91Var.h = true;
                ((xf.a) z91Var.d.d.get(0)).g = org.telegram.ui.ActionBar.k6.yj;
                this.n.d.h = (float) ((1.0d / this.W) / 100.0d);
            }
            TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus = h.status;
            i0(tL_starsRevenueStatus.available_balance, tL_starsRevenueStatus.next_withdrawal_at);
            h61 h61Var = this.e;
            if (h61Var != null) {
                h61Var.V2.N(true);
            }
        }
    }

    public final void h0(boolean z4, long j10, TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, TwoStepVerificationActivity twoStepVerificationActivity) {
        TLRPC.TL_payments_getStarsRevenueWithdrawalUrl tL_payments_getStarsRevenueWithdrawalUrl;
        Activity parentActivity = getParentActivity();
        TLRPC.User currentUser = UserConfig.getInstance(this.currentAccount).getCurrentUser();
        if (parentActivity == null || currentUser == null) {
            return;
        }
        long j11 = this.b;
        if (z4) {
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
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_payments_getStarsRevenueWithdrawalUrl, new e(this, twoStepVerificationActivity, parentActivity, z4, j10));
    }

    public final void i0(TL_stars.StarsAmount starsAmount, int i10) {
        if (this.H == null || this.I == null) {
            return;
        }
        long j10 = (long) (this.W * starsAmount.amount * 100.0d);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(ja.X0(false, TextUtils.concat("XTR ", ja.J0(starsAmount, 0.8f, ' ')), 1.0f, null));
        int indexOf = TextUtils.indexOf(spannableStringBuilder, ".");
        if (indexOf >= 0) {
            spannableStringBuilder.setSpan(this.G, indexOf, spannableStringBuilder.length(), 33);
        }
        this.H.setText(spannableStringBuilder);
        this.I.setText("≈" + BillingController.getInstance().formatCurrency(j10, "USD"));
        this.J.setVisibility(j10 > 0 ? 0 : 8);
        if (this.L) {
            this.K = true;
            m mVar = this.N;
            long j11 = starsAmount.amount;
            this.M = j11;
            mVar.setText(Long.toString(j11));
            m mVar2 = this.N;
            mVar2.setSelection(mVar2.getText().length());
            this.K = false;
            this.O.setEnabled(this.M > 0);
        }
        this.D = i10;
        c cVar = this.k0;
        AndroidUtilities.cancelRunOnUIThread(cVar);
        cVar.run();
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean isLightStatusBar() {
        return AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.d6, false)) > 0.721f;
    }

    public final void k0() {
        n nVar = this.O;
        if (!nVar.T || nVar.K) {
            return;
        }
        int currentTime = getConnectionsManager().getCurrentTime();
        int i10 = 1;
        if (this.D > currentTime) {
            this.X = qc.a0(this).Q(R.raw.timer_3, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BotStarsWithdrawalToast, j0(this.D - currentTime)))).j();
            return;
        }
        if (this.M < getMessagesController().starsRevenueWithdrawalMin) {
            qc.a0(this).L(getParentActivity().getResources().getDrawable(R.drawable.star_small_inner).mutate(), AndroidUtilities.replaceSingleTag(LocaleController.formatPluralString("BotStarsWithdrawMinLimit", (int) getMessagesController().starsRevenueWithdrawalMin, new Object[0]), new c(this, i10))).j();
            return;
        }
        long j10 = this.M;
        TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
        e3.f fVar = new e3.f(this, j10, twoStepVerificationActivity, 3);
        twoStepVerificationActivity.W = 1;
        twoStepVerificationActivity.Y = fVar;
        this.O.setLoading(true);
        twoStepVerificationActivity.s0(new d(this, twoStepVerificationActivity, i10));
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean onFragmentCreate() {
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.botStarsUpdated);
        g0();
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onFragmentDestroy() {
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.botStarsUpdated);
        super.onFragmentDestroy();
    }
}
