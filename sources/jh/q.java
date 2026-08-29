package jh;

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
import org.telegram.ui.Components.iq;
import org.telegram.ui.Components.k51;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.tc;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.w41;
import org.telegram.ui.Components.xn;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.ae;
import org.telegram.ui.de;
import org.telegram.ui.f91;
import org.telegram.ui.ko;
import org.telegram.ui.t91;
import org.telegram.ui.th;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class q extends org.telegram.ui.ActionBar.o2 implements NotificationCenter.NotificationCenterDelegate {
    public final CharSequence A;
    public ha B;
    public int C;
    public bg.y3 D;
    public LinearLayout E;
    public RelativeSizeSpan F;
    public org.telegram.ui.Components.o6 G;
    public org.telegram.ui.Components.o6 H;
    public l I;
    public boolean J;
    public boolean K;
    public long L;
    public m M;
    public n N;
    public nh.d O;
    public final iq[] P;
    public bg.y3 Q;
    public RelativeSizeSpan R;
    public org.telegram.ui.Components.o6 S;
    public org.telegram.ui.Components.o6 T;
    public nh.d U;
    public double V;
    public mc W;
    public CharSequence X;
    public CharSequence Y;
    public CharSequence Z;
    public final int a;
    public boolean a0;
    public final long b;
    public f91 b0;
    public final boolean c;
    public f91 c0;
    public xn d;
    public boolean d0;
    public u51 e;
    public boolean e0;
    public TLRPC.TL_payments_starsRevenueStats f;
    public final ArrayList f0;
    public String g0;
    public TLRPC.TL_starsRevenueStatus h;
    public DecimalFormat h0;
    public SpannableStringBuilder i0;
    public final c j0;
    public final int k0;
    public f91 n;
    public final ae r;
    public final ae s;
    public final ae v;
    public final ae w;
    public final ae x;
    public final ae y;

    public q(int i10, long j10) {
        super(null);
        this.r = ae.a("XTR", LocaleController.getString(R.string.BotStarsOverviewAvailableBalance));
        this.s = ae.a("XTR", LocaleController.getString(R.string.BotStarsOverviewTotalBalance));
        this.v = ae.a("XTR", LocaleController.getString(R.string.BotStarsOverviewTotalProceeds));
        this.w = ae.a("TON", LocaleController.getString(R.string.BotMonetizationOverviewAvailable));
        this.x = ae.a("TON", LocaleController.getString(R.string.BotMonetizationOverviewLastWithdrawal));
        this.y = ae.a("TON", LocaleController.getString(R.string.BotMonetizationOverviewTotal));
        this.J = false;
        this.K = true;
        this.P = new iq[1];
        this.d0 = false;
        this.e0 = false;
        this.f0 = new ArrayList();
        this.g0 = "";
        this.j0 = new c(this, 0);
        this.k0 = -1;
        this.a = i10;
        this.b = j10;
        boolean z10 = j10 == getUserConfig().getClientUserId();
        this.c = z10;
        if (i10 == 0) {
            b0.g(this.currentAccount).r(j10);
            if (!z10) {
                b0.g(this.currentAccount).l(j10);
            }
        } else if (i10 == 1) {
            b0 g10 = b0.g(this.currentAccount);
            Long l10 = (Long) g10.d.get(Long.valueOf(j10));
            g10.j(j10, l10 == null || System.currentTimeMillis() - l10.longValue() > 30000);
        }
        this.A = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(z10 ? LocaleController.formatPluralStringComma("SelfStarsWithdrawInfo", (int) getMessagesController().starsRevenueWithdrawalMin) : LocaleController.getString(R.string.BotStarsWithdrawInfo), new c(this, 4)), true);
    }

    public static void U(q qVar) {
        c cVar = qVar.j0;
        mc.e();
        TLRPC.TL_payments_starsRevenueStats h = b0.g(qVar.currentAccount).h(qVar.b, false);
        long j10 = h == null ? 0L : h.status.available_balance.amount;
        if (j10 < qVar.getMessagesController().starsRevenueWithdrawalMin) {
            qVar.K = true;
            qVar.L = j10;
        } else {
            qVar.K = false;
            qVar.L = qVar.getMessagesController().starsRevenueWithdrawalMin;
        }
        qVar.J = true;
        qVar.M.setText(Long.toString(qVar.L));
        m mVar = qVar.M;
        mVar.setSelection(mVar.getText().length());
        qVar.J = false;
        AndroidUtilities.cancelRunOnUIThread(cVar);
        cVar.run();
    }

    public static void V(q qVar) {
        qVar.showDialog(de.d0(qVar.getParentActivity(), qVar.resourceProvider, true));
    }

    public static void W(q qVar, w41 w41Var) {
        if (w41Var.G(ca.class)) {
            ia.h1(qVar.getParentActivity(), true, qVar.b, qVar.currentAccount, (TL_stars.StarsTransaction) w41Var.G, qVar.getResourceProvider());
        } else if (w41Var.G instanceof TL_stats.BroadcastRevenueTransaction) {
            de.h0(qVar.getParentActivity(), qVar.currentAccount, (TL_stats.BroadcastRevenueTransaction) w41Var.G, qVar.b, qVar.resourceProvider);
        } else if (w41Var.d == 2) {
            qVar.presentFragment(new ph.d3(qVar.b));
        }
    }

    public static void X(q qVar, Context context, View view) {
        if (view.isEnabled()) {
            nh.d dVar = qVar.O;
            if (dVar.J) {
                return;
            }
            dVar.setLoading(true);
            TLRPC.TL_payments_getStarsRevenueAdsAccountUrl tL_payments_getStarsRevenueAdsAccountUrl = new TLRPC.TL_payments_getStarsRevenueAdsAccountUrl();
            tL_payments_getStarsRevenueAdsAccountUrl.peer = MessagesController.getInstance(qVar.currentAccount).getInputPeer(qVar.b);
            ConnectionsManager.getInstance(qVar.currentAccount).sendRequest(tL_payments_getStarsRevenueAdsAccountUrl, new bg.h3(5, qVar, context));
        }
    }

    public static void Y(q qVar, ArrayList arrayList) {
        int i10;
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus;
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus2;
        ae aeVar = qVar.x;
        ArrayList arrayList2 = qVar.f0;
        ae aeVar2 = qVar.y;
        ae aeVar3 = qVar.v;
        ae aeVar4 = qVar.s;
        ae aeVar5 = qVar.r;
        long j10 = qVar.b;
        ae aeVar6 = qVar.w;
        boolean z10 = qVar.c;
        int i11 = qVar.k0;
        b0 g10 = b0.g(qVar.currentAccount);
        int i12 = qVar.a;
        if (i12 == 0) {
            arrayList.add(w41.h(2, i11, qVar.n));
            arrayList.add(w41.A(-1, null));
            arrayList.add(w41.b(LocaleController.getString(R.string.BotStarsOverview)));
            TLRPC.TL_payments_starsRevenueStats h = g10.h(j10, false);
            if (h != null && (tL_starsRevenueStatus2 = h.status) != null) {
                aeVar5.a = false;
                aeVar5.g = true;
                TL_stars.StarsAmount starsAmount = tL_starsRevenueStatus2.available_balance;
                aeVar5.i = starsAmount;
                aeVar5.h = "XTR";
                aeVar5.f = "USD";
                double d = starsAmount.amount;
                double d10 = qVar.V;
                aeVar5.j = (long) (d * d10 * 100.0d);
                aeVar4.a = false;
                aeVar4.g = true;
                aeVar4.i = tL_starsRevenueStatus2.current_balance;
                aeVar4.h = "XTR";
                aeVar4.j = (long) (r9.amount * d10 * 100.0d);
                aeVar4.f = "USD";
                aeVar3.a = false;
                aeVar3.g = true;
                aeVar3.i = tL_starsRevenueStatus2.overall_revenue;
                aeVar3.h = "XTR";
                aeVar3.j = (long) (r9.amount * d10 * 100.0d);
                aeVar3.f = "USD";
                qVar.i0(starsAmount, tL_starsRevenueStatus2.next_withdrawal_at);
                qVar.E.setVisibility(h.status.withdrawal_enabled ? 0 : 8);
            }
            arrayList.add(w41.u(aeVar5));
            arrayList.add(w41.u(aeVar4));
            arrayList.add(w41.u(aeVar3));
            arrayList.add(w41.A(-2, LocaleController.getString(z10 ? R.string.SelfStarsOverviewInfo : R.string.BotStarsOverviewInfo)));
            arrayList.add(w41.b(LocaleController.getString(R.string.BotStarsAvailableBalance)));
            arrayList.add(w41.j(1, qVar.D));
            arrayList.add(w41.A(-3, qVar.A));
            if (z10) {
                return;
            }
            if (qVar.getMessagesController().starrefConnectAllowed) {
                arrayList.add(ph.f.a(2, org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.uj, qVar.resourceProvider), R.drawable.filled_earn_stars, ko.d0(LocaleController.getString(R.string.BotAffiliateProgramRowTitle)), LocaleController.getString(R.string.BotAffiliateProgramRowText)));
                arrayList.add(w41.A(-4, null));
            }
            arrayList.add(w41.p(qVar.B, 0, false));
            return;
        }
        if (i12 == 1) {
            TLRPC.TL_payments_starsRevenueStats j11 = g10.j(j10, true);
            if (!z10) {
                if (qVar.X == null) {
                    qVar.X = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.BotMonetizationInfo, 50), -1, 3, new c(qVar, 2), qVar.resourceProvider), true);
                }
                arrayList.add(w41.g(qVar.X));
            }
            if (qVar.b0 == null && j11 != null) {
                f91 f02 = t91.f0(j11.top_hours_graph, LocaleController.getString(R.string.BotMonetizationGraphImpressions), 0, false);
                qVar.b0 = f02;
                if (f02 != null) {
                    f02.n = true;
                }
            }
            f91 f91Var = qVar.b0;
            if (f91Var != null && !f91Var.l) {
                arrayList.add(w41.h(5, i11, f91Var));
                arrayList.add(w41.A(-1, null));
            }
            if (qVar.c0 != null || j11 == null) {
                i10 = 2;
            } else {
                TL_stats.StatsGraph statsGraph = j11.revenue_graph;
                if (statsGraph != null) {
                    statsGraph.rate = (float) (1.0E7d / j11.usd_rate);
                }
                i10 = 2;
                qVar.c0 = t91.f0(statsGraph, LocaleController.getString(R.string.BotMonetizationGraphRevenue), 2, false);
            }
            f91 f91Var2 = qVar.c0;
            if (f91Var2 != null && !f91Var2.l) {
                arrayList.add(w41.h(i10, i11, f91Var2));
                arrayList.add(w41.A(-2, null));
            }
            if (!qVar.a0 && j11 != null && (tL_starsRevenueStatus = j11.status) != null) {
                double d11 = j11.usd_rate;
                long j12 = tL_starsRevenueStatus.available_balance.amount;
                aeVar6.d = j12;
                double d12 = j12 / 1.0E9d;
                long j13 = (long) (d12 * d11 * 100.0d);
                aeVar6.e = j13;
                if (qVar.h0 == null) {
                    DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.US);
                    decimalFormatSymbols.setDecimalSeparator('.');
                    DecimalFormat decimalFormat = new DecimalFormat("#.##", decimalFormatSymbols);
                    qVar.h0 = decimalFormat;
                    decimalFormat.setMinimumFractionDigits(2);
                    qVar.h0.setMaximumFractionDigits(6);
                    qVar.h0.setGroupingUsed(false);
                }
                qVar.h0.setMaximumFractionDigits(d12 > 1.5d ? 2 : 6);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(de.f0("TON " + qVar.h0.format(d12), qVar.S.getPaint(), 0.9f, 0.0f, true));
                int indexOf = TextUtils.indexOf(spannableStringBuilder, ".");
                if (indexOf >= 0) {
                    spannableStringBuilder.setSpan(qVar.R, indexOf, spannableStringBuilder.length(), 33);
                }
                qVar.S.setText(spannableStringBuilder);
                qVar.T.setText("≈" + BillingController.getInstance().formatCurrency(j13, "USD"));
                aeVar6.f = "USD";
                TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus3 = j11.status;
                long j14 = tL_starsRevenueStatus3.current_balance.amount;
                aeVar.d = j14;
                aeVar.e = (long) ((j14 / 1.0E9d) * d11 * 100.0d);
                aeVar.f = "USD";
                aeVar2.a = true;
                long j15 = tL_starsRevenueStatus3.overall_revenue.amount;
                aeVar2.d = j15;
                aeVar2.e = (long) ((j15 / 1.0E9d) * d11 * 100.0d);
                aeVar2.f = "USD";
                qVar.a0 = true;
                qVar.U.setVisibility((tL_starsRevenueStatus3.available_balance.amount <= 0 || !tL_starsRevenueStatus3.withdrawal_enabled) ? 8 : 0);
            }
            if (qVar.a0) {
                arrayList.add(w41.b(LocaleController.getString(R.string.BotMonetizationOverview)));
                arrayList.add(w41.u(aeVar6));
                arrayList.add(w41.u(aeVar));
                arrayList.add(w41.u(aeVar2));
                if (qVar.Y == null) {
                    qVar.Y = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.BotMonetizationProceedsTONInfo), -1, 3, new bg.f(qVar, R.string.BotMonetizationProceedsTONInfoLink, 6), qVar.resourceProvider), true);
                }
                arrayList.add(w41.A(-4, qVar.Y));
            }
            arrayList.add(w41.b(LocaleController.getString(R.string.BotMonetizationBalance)));
            arrayList.add(w41.k(qVar.Q));
            if (qVar.Z == null) {
                qVar.Z = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(MessagesController.getInstance(qVar.currentAccount).channelRevenueWithdrawalEnabled ? R.string.BotMonetizationBalanceInfo : R.string.BotMonetizationBalanceInfoNotAvailable), -1, 3, new c(qVar, 3)), true);
            }
            arrayList.add(w41.A(-5, qVar.Z));
            if (!qVar.e0 || !arrayList2.isEmpty()) {
                arrayList.add(w41.b(LocaleController.getString(R.string.BotMonetizationTransactions)));
                int size = arrayList2.size();
                int i13 = 0;
                while (i13 < size) {
                    Object obj = arrayList2.get(i13);
                    i13++;
                    int i14 = ca.a;
                    w41 J = w41.J(ca.class);
                    J.G = (TL_stars.StarsTransaction) obj;
                    J.q = true;
                    arrayList.add(J);
                }
                if (!qVar.e0) {
                    arrayList.add(w41.o(1, 7));
                    arrayList.add(w41.o(2, 7));
                    arrayList.add(w41.o(3, 7));
                }
            }
            arrayList.add(w41.A(-6, null));
        }
    }

    public static void Z(q qVar, TLRPC.TL_error tL_error, TwoStepVerificationActivity twoStepVerificationActivity, Activity activity, boolean z10, long j10, TLObject tLObject) {
        int i10;
        if (tL_error == null) {
            twoStepVerificationActivity.o0();
            twoStepVerificationActivity.finishFragment();
            if (tLObject instanceof TL_stats.TL_broadcastRevenueWithdrawalUrl) {
                ye.d.u(qVar.getParentActivity(), ((TL_stats.TL_broadcastRevenueWithdrawalUrl) tLObject).url);
                return;
            } else {
                if (tLObject instanceof TLRPC.TL_payments_starsRevenueWithdrawalUrl) {
                    qVar.K = true;
                    ye.d.u(qVar.getParentActivity(), ((TLRPC.TL_payments_starsRevenueWithdrawalUrl) tLObject).url);
                    return;
                }
                return;
            }
        }
        if (!"PASSWORD_MISSING".equals(tL_error.text) && !tL_error.text.startsWith("PASSWORD_TOO_FRESH_") && !tL_error.text.startsWith("SESSION_TOO_FRESH_")) {
            if ("SRP_ID_INVALID".equals(tL_error.text)) {
                ConnectionsManager.getInstance(qVar.currentAccount).sendRequest(new TL_account.getPassword(), new h(qVar, twoStepVerificationActivity, z10, j10, 0), 8);
                return;
            }
            twoStepVerificationActivity.o0();
            twoStepVerificationActivity.finishFragment();
            tc.b0(tL_error);
            return;
        }
        twoStepVerificationActivity.o0();
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
        alertDialog$Builder.a.N = LocaleController.getString(R.string.EditAdminTransferAlertTitle);
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setPadding(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(24.0f), 0);
        linearLayout.setOrientation(1);
        alertDialog$Builder.n(linearLayout);
        TextView textView = new TextView(activity);
        int i11 = org.telegram.ui.ActionBar.g6.j5;
        textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i11, false));
        textView.setTextSize(1, 16.0f);
        textView.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        textView.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.WithdrawChannelAlertText)));
        linearLayout.addView(textView, i7.f6.n(-1, -2));
        LinearLayout linearLayout2 = new LinearLayout(activity);
        linearLayout2.setOrientation(0);
        linearLayout.addView(linearLayout2, i7.f6.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
        ImageView imageView = new ImageView(activity);
        imageView.setImageResource(R.drawable.list_circle);
        imageView.setPadding(LocaleController.isRTL ? AndroidUtilities.dp(11.0f) : 0, AndroidUtilities.dp(9.0f), LocaleController.isRTL ? 0 : AndroidUtilities.dp(11.0f), 0);
        int w02 = org.telegram.ui.ActionBar.g6.w0(null, i11, false);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        imageView.setColorFilter(new PorterDuffColorFilter(w02, mode));
        TextView textView2 = new TextView(activity);
        textView2.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i11, false));
        textView2.setTextSize(1, 16.0f);
        textView2.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        org.telegram.messenger.x3.r(R.string.EditAdminTransferAlertText1, textView2);
        if (LocaleController.isRTL) {
            linearLayout2.addView(textView2, i7.f6.n(-1, -2));
            linearLayout2.addView(imageView, i7.f6.q(-2, -2, 5));
        } else {
            linearLayout2.addView(imageView, i7.f6.n(-2, -2));
            linearLayout2.addView(textView2, i7.f6.n(-1, -2));
        }
        LinearLayout f9 = org.telegram.messenger.x3.f(activity, 0);
        linearLayout.addView(f9, i7.f6.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
        ImageView imageView2 = new ImageView(activity);
        imageView2.setImageResource(R.drawable.list_circle);
        imageView2.setPadding(LocaleController.isRTL ? AndroidUtilities.dp(11.0f) : 0, AndroidUtilities.dp(9.0f), LocaleController.isRTL ? 0 : AndroidUtilities.dp(11.0f), 0);
        imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, i11, false), mode));
        TextView textView3 = new TextView(activity);
        textView3.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i11, false));
        textView3.setTextSize(1, 16.0f);
        textView3.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        org.telegram.messenger.x3.r(R.string.EditAdminTransferAlertText2, textView3);
        if (LocaleController.isRTL) {
            f9.addView(textView3, i7.f6.n(-1, -2));
            i10 = 5;
            f9.addView(imageView2, i7.f6.q(-2, -2, 5));
        } else {
            i10 = 5;
            f9.addView(imageView2, i7.f6.n(-2, -2));
            f9.addView(textView3, i7.f6.n(-1, -2));
        }
        if ("PASSWORD_MISSING".equals(tL_error.text)) {
            alertDialog$Builder.k(LocaleController.getString(R.string.EditAdminTransferSetPassword), new g(qVar));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        } else {
            TextView textView4 = new TextView(activity);
            textView4.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i11, false));
            textView4.setTextSize(1, 16.0f);
            if (!LocaleController.isRTL) {
                i10 = 3;
            }
            textView4.setGravity(i10 | 48);
            textView4.setText(LocaleController.getString(R.string.EditAdminTransferAlertText3));
            linearLayout.addView(textView4, i7.f6.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
            alertDialog$Builder.h(LocaleController.getString(R.string.OK), null);
        }
        twoStepVerificationActivity.showDialog(alertDialog$Builder.a);
    }

    public static /* synthetic */ void a0(q qVar, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject instanceof TL_stars.StarsStatus) {
            TL_stars.StarsStatus starsStatus = (TL_stars.StarsStatus) tLObject;
            MessagesController.getInstance(qVar.currentAccount).putUsers(starsStatus.users, false);
            MessagesController.getInstance(qVar.currentAccount).putChats(starsStatus.chats, false);
            qVar.g0 = starsStatus.next_offset;
            qVar.f0.addAll(starsStatus.history);
            qVar.e0 = starsStatus.history.isEmpty() || starsStatus.next_offset == null;
        } else if (tL_error != null) {
            tc.b0(tL_error);
            qVar.e0 = true;
        }
        qVar.d0 = false;
        k51 k51Var = qVar.e.U2;
        if (k51Var != null) {
            k51Var.N(true);
        }
    }

    public static void e0(q qVar) {
        if (qVar.d0 || qVar.e0 || qVar.g0 == null) {
            return;
        }
        qVar.d0 = true;
        TL_stars.TL_payments_getStarsTransactions tL_payments_getStarsTransactions = new TL_stars.TL_payments_getStarsTransactions();
        tL_payments_getStarsTransactions.ton = true;
        tL_payments_getStarsTransactions.peer = MessagesController.getInstance(qVar.currentAccount).getInputPeer(qVar.b);
        tL_payments_getStarsTransactions.offset = qVar.g0;
        tL_payments_getStarsTransactions.limit = qVar.f0.isEmpty() ? 5 : 20;
        ConnectionsManager.getInstance(qVar.currentAccount).sendRequest(tL_payments_getStarsTransactions, new ef.a(qVar, 5));
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

    @Override // org.telegram.ui.ActionBar.o2
    public final View createView(Context context) {
        p pVar = new p(this, context);
        xn xnVar = new xn(context, null, false, null);
        this.d = xnVar;
        boolean z10 = true;
        xnVar.setOccupyStatusBar(!AndroidUtilities.isTablet());
        this.d.getAvatarImageView().setScaleX(0.9f);
        this.d.getAvatarImageView().setScaleY(0.9f);
        this.d.setRightAvatarPadding(-AndroidUtilities.dp(3.0f));
        this.actionBar.addView(this.d, 0, i7.f6.d(-2, -1.0f, 51, !this.inPreviewMode ? 50.0f : 0.0f, 0.0f, 40.0f, 0.0f));
        TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.b));
        this.d.k(user, true);
        this.d.setTitle(UserObject.getUserName(user));
        if (this.a == 0) {
            this.d.setSubtitle(LocaleController.getString(R.string.BotStatsStars));
        } else {
            this.d.setSubtitle(LocaleController.getString(R.string.BotStatsTON));
        }
        th.y(false, this.actionBar);
        this.actionBar.setActionBarMenuOnItemClick(new cg.n1(this, 2));
        xn xnVar2 = this.d;
        int i10 = org.telegram.ui.ActionBar.g6.Oi;
        xnVar2.i(org.telegram.ui.ActionBar.g6.w0(null, i10, false), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Pi, false));
        this.actionBar.C(org.telegram.ui.ActionBar.g6.w0(null, i10, false), false);
        this.actionBar.C(org.telegram.ui.ActionBar.g6.w0(null, i10, false), true);
        this.actionBar.B(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.z8, false), false);
        org.telegram.ui.ActionBar.l lVar = this.actionBar;
        int i11 = org.telegram.ui.ActionBar.g6.d6;
        lVar.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, i11, false));
        this.B = new ha(context, this.currentAccount, false, this.b, getClassGuid(), getResourceProvider());
        bg.y3 y3Var = new bg.y3(context, 1);
        this.D = y3Var;
        y3Var.setOrientation(1);
        this.D.setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(i11, getResourceProvider()));
        this.D.setPadding(0, 0, 0, AndroidUtilities.dp(17.0f));
        org.telegram.ui.Components.o6 o6Var = new org.telegram.ui.Components.o6(context, false, true, true);
        this.G = o6Var;
        o6Var.setTypeface(AndroidUtilities.bold());
        org.telegram.ui.Components.o6 o6Var2 = this.G;
        int i12 = org.telegram.ui.ActionBar.g6.G6;
        o6Var2.setTextColor(org.telegram.ui.ActionBar.g6.v0(i12, getResourceProvider()));
        this.G.setTextSize(AndroidUtilities.dp(32.0f));
        this.G.setGravity(17);
        this.F = new RelativeSizeSpan(0.6770833f);
        this.D.addView(this.G, i7.f6.t(-1, 38, 49, 22, 15, 22, 0));
        org.telegram.ui.Components.o6 o6Var3 = new org.telegram.ui.Components.o6(context, true, true, true);
        this.H = o6Var3;
        o6Var3.setGravity(17);
        org.telegram.ui.Components.o6 o6Var4 = this.H;
        int i13 = org.telegram.ui.ActionBar.g6.y6;
        o6Var4.setTextColor(org.telegram.ui.ActionBar.g6.v0(i13, getResourceProvider()));
        this.H.setTextSize(AndroidUtilities.dp(14.0f));
        this.D.addView(this.H, i7.f6.d(-1, 17.0f, 49, 22.0f, 4.0f, 22.0f, 0.0f));
        l lVar2 = new l(this, context, 0);
        this.I = lVar2;
        lVar2.setText(LocaleController.getString(R.string.BotStarsWithdrawPlaceholder));
        this.I.setLeftPadding(AndroidUtilities.dp(36.0f));
        m mVar = new m(context, 0);
        this.M = mVar;
        mVar.setFocusable(false);
        this.M.setTextColor(getThemedColor(i12));
        this.M.setCursorSize(AndroidUtilities.dp(20.0f));
        this.M.setCursorWidth(1.5f);
        this.M.setBackground(null);
        this.M.setTextSize(1, 18.0f);
        this.M.setMaxLines(1);
        int dp = AndroidUtilities.dp(16.0f);
        this.M.setPadding(AndroidUtilities.dp(6.0f), dp, dp, dp);
        this.M.setInputType(2);
        this.M.setTypeface(Typeface.DEFAULT);
        this.M.setHighlightColor(getThemedColor(org.telegram.ui.ActionBar.g6.uf));
        this.M.setHandlesColor(getThemedColor(org.telegram.ui.ActionBar.g6.vf));
        this.M.setGravity(LocaleController.isRTL ? 5 : 3);
        this.M.setOnFocusChangeListener(new ag.a0(this, 2));
        this.M.addTextChangedListener(new bh.c(this, 3));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setImageResource(R.drawable.star_small_inner);
        linearLayout.addView(imageView, i7.f6.p(-2, -2, 0.0f, 19, 14, 0, 0, 0));
        linearLayout.addView(this.M, i7.f6.o(-1, -2, 1.0f, 119));
        this.I.e(this.M);
        this.I.addView(linearLayout, i7.f6.e(-1, -2, 48));
        this.M.setOnEditorActionListener(new j(this, 0));
        this.D.addView(this.I, i7.f6.t(-1, -2, 1, 18, 14, 18, 2));
        this.I.setVisibility(8);
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.E = linearLayout2;
        linearLayout2.setOrientation(0);
        n nVar = new n(0, context, getResourceProvider(), z10);
        nVar.setRoundRadius(24);
        this.N = nVar;
        nVar.setEnabled(MessagesController.getInstance(this.currentAccount).channelRevenueWithdrawalEnabled);
        this.N.g(LocaleController.getString(R.string.BotStarsButtonWithdrawShortAll), false, true);
        final int i14 = 0;
        this.N.setOnClickListener(new View.OnClickListener(this) { // from class: jh.k
            public final /* synthetic */ q b;

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
                            q qVar = this.b;
                            if (!qVar.U.J) {
                                TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                                a9.s sVar = new a9.s(24, qVar, twoStepVerificationActivity);
                                twoStepVerificationActivity.V = 1;
                                twoStepVerificationActivity.X = sVar;
                                qVar.U.setLoading(true);
                                twoStepVerificationActivity.s0(new d(qVar, twoStepVerificationActivity, 0));
                                break;
                            }
                        }
                        break;
                }
            }
        });
        nh.d dVar = new nh.d(context, getResourceProvider(), true);
        dVar.setRoundRadius(24);
        this.O = dVar;
        dVar.setEnabled(true);
        this.O.g(LocaleController.getString(R.string.MonetizationStarsAds), false, true);
        this.O.setOnClickListener(new ag.n(16, this, context));
        this.E.addView(this.N, i7.f6.o(-1, 48, 1.0f, 119));
        boolean z11 = this.c;
        if (!z11) {
            this.E.addView(new Space(context), i7.f6.o(8, 48, 0.0f, 119));
            this.E.addView(this.O, i7.f6.o(-1, 48, 1.0f, 119));
        }
        this.D.addView(this.E, i7.f6.d(-1, 48.0f, 55, 18.0f, 13.0f, 18.0f, 0.0f));
        bg.y3 y3Var2 = new bg.y3(context, 2);
        this.Q = y3Var2;
        y3Var2.setOrientation(1);
        this.Q.setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(i11, this.resourceProvider));
        this.Q.setPadding(0, 0, 0, AndroidUtilities.dp(17.0f));
        org.telegram.ui.Components.o6 o6Var5 = new org.telegram.ui.Components.o6(context, false, true, true);
        this.S = o6Var5;
        o6Var5.setTypeface(AndroidUtilities.bold());
        this.S.setTextColor(org.telegram.ui.ActionBar.g6.v0(i12, this.resourceProvider));
        this.S.setTextSize(AndroidUtilities.dp(32.0f));
        this.S.setGravity(17);
        this.R = new RelativeSizeSpan(0.6770833f);
        this.Q.addView(this.S, i7.f6.t(-1, 38, 49, 22, 15, 22, 0));
        org.telegram.ui.Components.o6 o6Var6 = new org.telegram.ui.Components.o6(context, true, true, true);
        this.T = o6Var6;
        o6Var6.setGravity(17);
        this.T.setTextColor(org.telegram.ui.ActionBar.g6.v0(i13, this.resourceProvider));
        this.T.setTextSize(AndroidUtilities.dp(14.0f));
        this.Q.addView(this.T, i7.f6.d(-1, 17.0f, 49, 22.0f, 4.0f, 22.0f, 0.0f));
        nh.d dVar2 = new nh.d(context, this.resourceProvider, true);
        this.U = dVar2;
        dVar2.setEnabled(MessagesController.getInstance(this.currentAccount).channelRevenueWithdrawalEnabled);
        this.U.g(LocaleController.getString(z11 ? R.string.MonetizationSelfWithdraw : R.string.MonetizationWithdraw), false, true);
        this.U.setVisibility(8);
        final int i15 = 1;
        this.U.setOnClickListener(new View.OnClickListener(this) { // from class: jh.k
            public final /* synthetic */ q b;

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
                            q qVar = this.b;
                            if (!qVar.U.J) {
                                TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                                a9.s sVar = new a9.s(24, qVar, twoStepVerificationActivity);
                                twoStepVerificationActivity.V = 1;
                                twoStepVerificationActivity.X = sVar;
                                qVar.U.setLoading(true);
                                twoStepVerificationActivity.s0(new d(qVar, twoStepVerificationActivity, 0));
                                break;
                            }
                        }
                        break;
                }
            }
        });
        this.Q.addView(this.U, i7.f6.d(-1, 48.0f, 55, 18.0f, 13.0f, 18.0f, 0.0f));
        u51 u51Var = new u51(this, new bg.t1(this, 14), new g(this), new g(this));
        this.e = u51Var;
        u51Var.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.g6.a7));
        this.e.p1();
        pVar.addView(this.e, i7.f6.c(-1.0f, -1));
        this.e.setOnScrollListener(new cg.g2(this, 6));
        this.actionBar.setAdaptiveBackground(this.e);
        this.fragmentView = pVar;
        return pVar;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.botStarsUpdated && ((Long) objArr[0]).longValue() == this.b) {
            g0();
        }
    }

    public final void g0() {
        uf.b bVar;
        ArrayList arrayList;
        TLRPC.TL_payments_starsRevenueStats h = b0.g(this.currentAccount).h(this.b, false);
        if (h == this.f) {
            if ((h == null ? null : h.status) == this.h) {
                return;
            }
        }
        this.f = h;
        this.h = h != null ? h.status : null;
        if (h != null) {
            this.V = h.usd_rate;
            f91 f02 = t91.f0(h.revenue_graph, LocaleController.getString(R.string.BotStarsChartRevenue), 2, false);
            this.n = f02;
            if (f02 != null && (bVar = f02.d) != null && (arrayList = bVar.d) != null && !arrayList.isEmpty() && this.n.d.d.get(0) != null) {
                f91 f91Var = this.n;
                f91Var.h = true;
                ((uf.a) f91Var.d.d.get(0)).g = org.telegram.ui.ActionBar.g6.yj;
                this.n.d.h = (float) ((1.0d / this.V) / 100.0d);
            }
            TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus = h.status;
            i0(tL_starsRevenueStatus.available_balance, tL_starsRevenueStatus.next_withdrawal_at);
            u51 u51Var = this.e;
            if (u51Var != null) {
                u51Var.U2.N(true);
            }
        }
    }

    public final void h0(boolean z10, long j10, TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, TwoStepVerificationActivity twoStepVerificationActivity) {
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
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_payments_getStarsRevenueWithdrawalUrl, new e(this, twoStepVerificationActivity, parentActivity, z10, j10));
    }

    public final void i0(TL_stars.StarsAmount starsAmount, int i10) {
        if (this.G == null || this.H == null) {
            return;
        }
        long j10 = (long) (this.V * starsAmount.amount * 100.0d);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(ia.X0(false, TextUtils.concat("XTR ", ia.J0(starsAmount, 0.8f, ' ')), 1.0f, null));
        int indexOf = TextUtils.indexOf(spannableStringBuilder, ".");
        if (indexOf >= 0) {
            spannableStringBuilder.setSpan(this.F, indexOf, spannableStringBuilder.length(), 33);
        }
        this.G.setText(spannableStringBuilder);
        this.H.setText("≈" + BillingController.getInstance().formatCurrency(j10, "USD"));
        this.I.setVisibility(j10 > 0 ? 0 : 8);
        if (this.K) {
            this.J = true;
            m mVar = this.M;
            long j11 = starsAmount.amount;
            this.L = j11;
            mVar.setText(Long.toString(j11));
            m mVar2 = this.M;
            mVar2.setSelection(mVar2.getText().length());
            this.J = false;
            this.N.setEnabled(this.L > 0);
        }
        this.C = i10;
        c cVar = this.j0;
        AndroidUtilities.cancelRunOnUIThread(cVar);
        cVar.run();
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean isLightStatusBar() {
        return AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.d6, false)) > 0.721f;
    }

    public final void k0() {
        n nVar = this.N;
        if (!nVar.S || nVar.J) {
            return;
        }
        int currentTime = getConnectionsManager().getCurrentTime();
        int i10 = 1;
        if (this.C > currentTime) {
            this.W = tc.a0(this).Q(R.raw.timer_3, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BotStarsWithdrawalToast, j0(this.C - currentTime)))).j();
            return;
        }
        if (this.L < getMessagesController().starsRevenueWithdrawalMin) {
            tc.a0(this).L(getParentActivity().getResources().getDrawable(R.drawable.star_small_inner).mutate(), AndroidUtilities.replaceSingleTag(LocaleController.formatPluralString("BotStarsWithdrawMinLimit", (int) getMessagesController().starsRevenueWithdrawalMin, new Object[0]), new c(this, i10))).j();
            return;
        }
        long j10 = this.L;
        TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
        d9.a aVar = new d9.a(this, j10, twoStepVerificationActivity, 3);
        twoStepVerificationActivity.V = 1;
        twoStepVerificationActivity.X = aVar;
        this.N.setLoading(true);
        twoStepVerificationActivity.s0(new d(this, twoStepVerificationActivity, i10));
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean onFragmentCreate() {
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.botStarsUpdated);
        g0();
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onFragmentDestroy() {
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.botStarsUpdated);
        super.onFragmentDestroy();
    }
}
