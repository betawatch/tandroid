package hh;

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
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.cq;
import org.telegram.ui.Components.ec;
import org.telegram.ui.Components.k51;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.n41;
import org.telegram.ui.Components.rn;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.c91;
import org.telegram.ui.ce;
import org.telegram.ui.fe;
import org.telegram.ui.jo;
import org.telegram.ui.q91;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class r extends org.telegram.ui.ActionBar.n2 implements NotificationCenter.NotificationCenterDelegate {
    public final CharSequence A;
    public na B;
    public int C;
    public m D;
    public LinearLayout E;
    public RelativeSizeSpan F;
    public org.telegram.ui.Components.j6 G;
    public org.telegram.ui.Components.j6 H;
    public n I;
    public boolean J;
    public boolean K;
    public long L;
    public o M;
    public p N;
    public lh.d O;
    public final cq[] P;
    public m Q;
    public RelativeSizeSpan R;
    public org.telegram.ui.Components.j6 S;
    public org.telegram.ui.Components.j6 T;
    public lh.d U;
    public double V;
    public ec W;
    public CharSequence X;
    public CharSequence Y;
    public CharSequence Z;
    public final int a;
    public boolean a0;
    public final long b;
    public c91 b0;
    public final boolean c;
    public c91 c0;
    public rn d;
    public boolean d0;
    public k51 e;
    public boolean e0;
    public TLRPC.TL_payments_starsRevenueStats f;
    public final ArrayList f0;
    public String g0;
    public TLRPC.TL_starsRevenueStatus h;
    public DecimalFormat h0;
    public SpannableStringBuilder i0;
    public final c j0;
    public final int k0;
    public c91 n;
    public final ce r;
    public final ce s;
    public final ce v;
    public final ce w;
    public final ce x;
    public final ce y;

    public r(int i10, long j10) {
        super(null);
        this.r = ce.a("XTR", LocaleController.getString(R.string.BotStarsOverviewAvailableBalance));
        this.s = ce.a("XTR", LocaleController.getString(R.string.BotStarsOverviewTotalBalance));
        this.v = ce.a("XTR", LocaleController.getString(R.string.BotStarsOverviewTotalProceeds));
        this.w = ce.a("TON", LocaleController.getString(R.string.BotMonetizationOverviewAvailable));
        this.x = ce.a("TON", LocaleController.getString(R.string.BotMonetizationOverviewLastWithdrawal));
        this.y = ce.a("TON", LocaleController.getString(R.string.BotMonetizationOverviewTotal));
        this.J = false;
        this.K = true;
        this.P = new cq[1];
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
            c0.g(this.currentAccount).r(j10);
            if (!z10) {
                c0.g(this.currentAccount).l(j10);
            }
        } else if (i10 == 1) {
            c0 g10 = c0.g(this.currentAccount);
            Long l10 = (Long) g10.d.get(Long.valueOf(j10));
            g10.j(j10, l10 == null || System.currentTimeMillis() - l10.longValue() > 30000);
        }
        this.A = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(z10 ? LocaleController.formatPluralStringComma("SelfStarsWithdrawInfo", (int) getMessagesController().starsRevenueWithdrawalMin) : LocaleController.getString(R.string.BotStarsWithdrawInfo), new c(this, 4)), true);
    }

    public static void U(r rVar) {
        c cVar = rVar.j0;
        ec.e();
        TLRPC.TL_payments_starsRevenueStats h = c0.g(rVar.currentAccount).h(rVar.b, false);
        long j10 = h == null ? 0L : h.status.available_balance.amount;
        if (j10 < rVar.getMessagesController().starsRevenueWithdrawalMin) {
            rVar.K = true;
            rVar.L = j10;
        } else {
            rVar.K = false;
            rVar.L = rVar.getMessagesController().starsRevenueWithdrawalMin;
        }
        rVar.J = true;
        rVar.M.setText(Long.toString(rVar.L));
        o oVar = rVar.M;
        oVar.setSelection(oVar.getText().length());
        rVar.J = false;
        AndroidUtilities.cancelRunOnUIThread(cVar);
        cVar.run();
    }

    public static void V(r rVar) {
        rVar.showDialog(fe.d0(rVar.getParentActivity(), rVar.resourceProvider, true));
    }

    public static void W(r rVar, n41 n41Var) {
        if (n41Var.G(ia.class)) {
            oa.h1(rVar.getParentActivity(), true, rVar.b, rVar.currentAccount, (TL_stars.StarsTransaction) n41Var.G, rVar.getResourceProvider());
        } else if (n41Var.G instanceof TL_stats.BroadcastRevenueTransaction) {
            fe.h0(rVar.getParentActivity(), rVar.currentAccount, (TL_stats.BroadcastRevenueTransaction) n41Var.G, rVar.b, rVar.resourceProvider);
        } else if (n41Var.d == 2) {
            rVar.presentFragment(new nh.s3(rVar.b));
        }
    }

    public static void X(r rVar, Context context, View view) {
        if (view.isEnabled()) {
            lh.d dVar = rVar.O;
            if (dVar.J) {
                return;
            }
            dVar.setLoading(true);
            TLRPC.TL_payments_getStarsRevenueAdsAccountUrl tL_payments_getStarsRevenueAdsAccountUrl = new TLRPC.TL_payments_getStarsRevenueAdsAccountUrl();
            tL_payments_getStarsRevenueAdsAccountUrl.peer = MessagesController.getInstance(rVar.currentAccount).getInputPeer(rVar.b);
            ConnectionsManager.getInstance(rVar.currentAccount).sendRequest(tL_payments_getStarsRevenueAdsAccountUrl, new cg.g0(4, rVar, context));
        }
    }

    public static void Y(r rVar, ArrayList arrayList) {
        int i10;
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus;
        double d;
        int i11;
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus2;
        ce ceVar = rVar.x;
        ArrayList arrayList2 = rVar.f0;
        ce ceVar2 = rVar.y;
        ce ceVar3 = rVar.v;
        ce ceVar4 = rVar.s;
        ce ceVar5 = rVar.r;
        long j10 = rVar.b;
        ce ceVar6 = rVar.w;
        boolean z10 = rVar.c;
        int i12 = rVar.k0;
        c0 g10 = c0.g(rVar.currentAccount);
        int i13 = rVar.a;
        if (i13 == 0) {
            arrayList.add(n41.h(2, i12, rVar.n));
            arrayList.add(n41.A(-1, null));
            arrayList.add(n41.b(LocaleController.getString(R.string.BotStarsOverview)));
            TLRPC.TL_payments_starsRevenueStats h = g10.h(j10, false);
            if (h != null && (tL_starsRevenueStatus2 = h.status) != null) {
                ceVar5.a = false;
                ceVar5.g = true;
                TL_stars.StarsAmount starsAmount = tL_starsRevenueStatus2.available_balance;
                ceVar5.i = starsAmount;
                ceVar5.h = "XTR";
                ceVar5.f = "USD";
                double d10 = starsAmount.amount;
                double d11 = rVar.V;
                ceVar5.j = (long) (d10 * d11 * 100.0d);
                ceVar4.a = false;
                ceVar4.g = true;
                ceVar4.i = tL_starsRevenueStatus2.current_balance;
                ceVar4.h = "XTR";
                ceVar4.j = (long) (r9.amount * d11 * 100.0d);
                ceVar4.f = "USD";
                ceVar3.a = false;
                ceVar3.g = true;
                ceVar3.i = tL_starsRevenueStatus2.overall_revenue;
                ceVar3.h = "XTR";
                ceVar3.j = (long) (r9.amount * d11 * 100.0d);
                ceVar3.f = "USD";
                rVar.i0(starsAmount, tL_starsRevenueStatus2.next_withdrawal_at);
                rVar.E.setVisibility(h.status.withdrawal_enabled ? 0 : 8);
            }
            arrayList.add(n41.u(ceVar5));
            arrayList.add(n41.u(ceVar4));
            arrayList.add(n41.u(ceVar3));
            arrayList.add(n41.A(-2, LocaleController.getString(z10 ? R.string.SelfStarsOverviewInfo : R.string.BotStarsOverviewInfo)));
            arrayList.add(n41.b(LocaleController.getString(R.string.BotStarsAvailableBalance)));
            arrayList.add(n41.j(1, rVar.D));
            arrayList.add(n41.A(-3, rVar.A));
            if (z10) {
                return;
            }
            if (rVar.getMessagesController().starrefConnectAllowed) {
                arrayList.add(nh.g.a(2, org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.uj, rVar.resourceProvider), R.drawable.filled_earn_stars, jo.d0(LocaleController.getString(R.string.BotAffiliateProgramRowTitle)), LocaleController.getString(R.string.BotAffiliateProgramRowText)));
                arrayList.add(n41.A(-4, null));
            }
            arrayList.add(n41.p(rVar.B, 0, false));
            return;
        }
        if (i13 == 1) {
            TLRPC.TL_payments_starsRevenueStats j11 = g10.j(j10, true);
            if (!z10) {
                if (rVar.X == null) {
                    rVar.X = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.BotMonetizationInfo, 50), -1, 3, new c(rVar, 2), rVar.resourceProvider), true);
                }
                arrayList.add(n41.g(rVar.X));
            }
            if (rVar.b0 == null && j11 != null) {
                c91 f02 = q91.f0(j11.top_hours_graph, LocaleController.getString(R.string.BotMonetizationGraphImpressions), 0, false);
                rVar.b0 = f02;
                if (f02 != null) {
                    f02.n = true;
                }
            }
            c91 c91Var = rVar.b0;
            if (c91Var != null && !c91Var.l) {
                arrayList.add(n41.h(5, i12, c91Var));
                arrayList.add(n41.A(-1, null));
            }
            if (rVar.c0 != null || j11 == null) {
                i10 = 2;
            } else {
                TL_stats.StatsGraph statsGraph = j11.revenue_graph;
                if (statsGraph != null) {
                    statsGraph.rate = (float) (1.0E7d / j11.usd_rate);
                }
                i10 = 2;
                rVar.c0 = q91.f0(statsGraph, LocaleController.getString(R.string.BotMonetizationGraphRevenue), 2, false);
            }
            c91 c91Var2 = rVar.c0;
            if (c91Var2 != null && !c91Var2.l) {
                arrayList.add(n41.h(i10, i12, c91Var2));
                arrayList.add(n41.A(-2, null));
            }
            if (!rVar.a0 && j11 != null && (tL_starsRevenueStatus = j11.status) != null) {
                double d12 = j11.usd_rate;
                long j12 = tL_starsRevenueStatus.available_balance.amount;
                ceVar6.d = j12;
                double d13 = j12 / 1.0E9d;
                long j13 = (long) (d13 * d12 * 100.0d);
                ceVar6.e = j13;
                if (rVar.h0 == null) {
                    DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.US);
                    decimalFormatSymbols.setDecimalSeparator('.');
                    d = d12;
                    DecimalFormat decimalFormat = new DecimalFormat("#.##", decimalFormatSymbols);
                    rVar.h0 = decimalFormat;
                    decimalFormat.setMinimumFractionDigits(2);
                    i11 = 6;
                    rVar.h0.setMaximumFractionDigits(6);
                    rVar.h0.setGroupingUsed(false);
                } else {
                    d = d12;
                    i11 = 6;
                }
                DecimalFormat decimalFormat2 = rVar.h0;
                if (d13 > 1.5d) {
                    i11 = 2;
                }
                decimalFormat2.setMaximumFractionDigits(i11);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(fe.f0("TON " + rVar.h0.format(d13), rVar.S.getPaint(), 0.9f, 0.0f, true));
                int indexOf = TextUtils.indexOf(spannableStringBuilder, ".");
                if (indexOf >= 0) {
                    spannableStringBuilder.setSpan(rVar.R, indexOf, spannableStringBuilder.length(), 33);
                }
                rVar.S.setText(spannableStringBuilder);
                rVar.T.setText("≈" + BillingController.getInstance().formatCurrency(j13, "USD"));
                ceVar6.f = "USD";
                TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus3 = j11.status;
                long j14 = tL_starsRevenueStatus3.current_balance.amount;
                ceVar.d = j14;
                ceVar.e = (long) ((j14 / 1.0E9d) * d * 100.0d);
                ceVar.f = "USD";
                ceVar2.a = true;
                long j15 = tL_starsRevenueStatus3.overall_revenue.amount;
                ceVar2.d = j15;
                ceVar2.e = (long) ((j15 / 1.0E9d) * d * 100.0d);
                ceVar2.f = "USD";
                rVar.a0 = true;
                rVar.U.setVisibility((tL_starsRevenueStatus3.available_balance.amount <= 0 || !tL_starsRevenueStatus3.withdrawal_enabled) ? 8 : 0);
            }
            if (rVar.a0) {
                arrayList.add(n41.b(LocaleController.getString(R.string.BotMonetizationOverview)));
                arrayList.add(n41.u(ceVar6));
                arrayList.add(n41.u(ceVar));
                arrayList.add(n41.u(ceVar2));
                if (rVar.Y == null) {
                    rVar.Y = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.BotMonetizationProceedsTONInfo), -1, 3, new cg.w1(rVar, R.string.BotMonetizationProceedsTONInfoLink, 3), rVar.resourceProvider), true);
                }
                arrayList.add(n41.A(-4, rVar.Y));
            }
            arrayList.add(n41.b(LocaleController.getString(R.string.BotMonetizationBalance)));
            arrayList.add(n41.k(rVar.Q));
            if (rVar.Z == null) {
                rVar.Z = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(MessagesController.getInstance(rVar.currentAccount).channelRevenueWithdrawalEnabled ? R.string.BotMonetizationBalanceInfo : R.string.BotMonetizationBalanceInfoNotAvailable), -1, 3, new c(rVar, 3)), true);
            }
            arrayList.add(n41.A(-5, rVar.Z));
            if (!rVar.e0 || !arrayList2.isEmpty()) {
                arrayList.add(n41.b(LocaleController.getString(R.string.BotMonetizationTransactions)));
                int size = arrayList2.size();
                int i14 = 0;
                while (i14 < size) {
                    Object obj = arrayList2.get(i14);
                    i14++;
                    int i15 = ia.a;
                    n41 J = n41.J(ia.class);
                    J.G = (TL_stars.StarsTransaction) obj;
                    J.q = true;
                    arrayList.add(J);
                }
                if (!rVar.e0) {
                    arrayList.add(n41.o(1, 7));
                    arrayList.add(n41.o(2, 7));
                    arrayList.add(n41.o(3, 7));
                }
            }
            arrayList.add(n41.A(-6, null));
        }
    }

    public static void Z(r rVar, TLRPC.TL_error tL_error, TwoStepVerificationActivity twoStepVerificationActivity, Activity activity, boolean z10, long j10, TLObject tLObject) {
        int i10;
        if (tL_error == null) {
            twoStepVerificationActivity.o0();
            twoStepVerificationActivity.finishFragment();
            if (tLObject instanceof TL_stats.TL_broadcastRevenueWithdrawalUrl) {
                we.e.u(rVar.getParentActivity(), ((TL_stats.TL_broadcastRevenueWithdrawalUrl) tLObject).url);
                return;
            } else {
                if (tLObject instanceof TLRPC.TL_payments_starsRevenueWithdrawalUrl) {
                    rVar.K = true;
                    we.e.u(rVar.getParentActivity(), ((TLRPC.TL_payments_starsRevenueWithdrawalUrl) tLObject).url);
                    return;
                }
                return;
            }
        }
        if (!"PASSWORD_MISSING".equals(tL_error.text) && !tL_error.text.startsWith("PASSWORD_TOO_FRESH_") && !tL_error.text.startsWith("SESSION_TOO_FRESH_")) {
            if ("SRP_ID_INVALID".equals(tL_error.text)) {
                ConnectionsManager.getInstance(rVar.currentAccount).sendRequest(new TL_account.getPassword(), new h(rVar, twoStepVerificationActivity, z10, j10, 0), 8);
                return;
            }
            twoStepVerificationActivity.o0();
            twoStepVerificationActivity.finishFragment();
            mc.b0(tL_error);
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
        linearLayout.addView(textView, h7.z5.n(-1, -2));
        LinearLayout linearLayout2 = new LinearLayout(activity);
        linearLayout2.setOrientation(0);
        linearLayout.addView(linearLayout2, h7.z5.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
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
        org.telegram.messenger.y1.p(R.string.EditAdminTransferAlertText1, textView2);
        if (LocaleController.isRTL) {
            linearLayout2.addView(textView2, h7.z5.n(-1, -2));
            linearLayout2.addView(imageView, h7.z5.q(-2, -2, 5));
        } else {
            linearLayout2.addView(imageView, h7.z5.n(-2, -2));
            linearLayout2.addView(textView2, h7.z5.n(-1, -2));
        }
        LinearLayout f10 = org.telegram.messenger.y1.f(activity, 0);
        linearLayout.addView(f10, h7.z5.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
        ImageView imageView2 = new ImageView(activity);
        imageView2.setImageResource(R.drawable.list_circle);
        imageView2.setPadding(LocaleController.isRTL ? AndroidUtilities.dp(11.0f) : 0, AndroidUtilities.dp(9.0f), LocaleController.isRTL ? 0 : AndroidUtilities.dp(11.0f), 0);
        imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, i11, false), mode));
        TextView textView3 = new TextView(activity);
        textView3.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i11, false));
        textView3.setTextSize(1, 16.0f);
        textView3.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        org.telegram.messenger.y1.p(R.string.EditAdminTransferAlertText2, textView3);
        if (LocaleController.isRTL) {
            f10.addView(textView3, h7.z5.n(-1, -2));
            i10 = 5;
            f10.addView(imageView2, h7.z5.q(-2, -2, 5));
        } else {
            i10 = 5;
            f10.addView(imageView2, h7.z5.n(-2, -2));
            f10.addView(textView3, h7.z5.n(-1, -2));
        }
        if ("PASSWORD_MISSING".equals(tL_error.text)) {
            alertDialog$Builder.k(LocaleController.getString(R.string.EditAdminTransferSetPassword), new g(rVar));
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
            linearLayout.addView(textView4, h7.z5.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
            alertDialog$Builder.h(LocaleController.getString(R.string.OK), null);
        }
        twoStepVerificationActivity.showDialog(alertDialog$Builder.a);
    }

    public static /* synthetic */ void a0(r rVar, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject instanceof TL_stars.StarsStatus) {
            TL_stars.StarsStatus starsStatus = (TL_stars.StarsStatus) tLObject;
            MessagesController.getInstance(rVar.currentAccount).putUsers(starsStatus.users, false);
            MessagesController.getInstance(rVar.currentAccount).putChats(starsStatus.chats, false);
            rVar.g0 = starsStatus.next_offset;
            rVar.f0.addAll(starsStatus.history);
            rVar.e0 = starsStatus.history.isEmpty() || starsStatus.next_offset == null;
        } else if (tL_error != null) {
            mc.b0(tL_error);
            rVar.e0 = true;
        }
        rVar.d0 = false;
        b51 b51Var = rVar.e.U2;
        if (b51Var != null) {
            b51Var.N(true);
        }
    }

    public static void e0(r rVar) {
        if (rVar.d0 || rVar.e0 || rVar.g0 == null) {
            return;
        }
        rVar.d0 = true;
        TL_stars.TL_payments_getStarsTransactions tL_payments_getStarsTransactions = new TL_stars.TL_payments_getStarsTransactions();
        tL_payments_getStarsTransactions.ton = true;
        tL_payments_getStarsTransactions.peer = MessagesController.getInstance(rVar.currentAccount).getInputPeer(rVar.b);
        tL_payments_getStarsTransactions.offset = rVar.g0;
        tL_payments_getStarsTransactions.limit = rVar.f0.isEmpty() ? 5 : 20;
        ConnectionsManager.getInstance(rVar.currentAccount).sendRequest(tL_payments_getStarsTransactions, new cf.a(rVar, 5));
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

    @Override // org.telegram.ui.ActionBar.n2
    public final View createView(Context context) {
        q qVar = new q(this, context);
        rn rnVar = new rn(context, null, false, null);
        this.d = rnVar;
        boolean z10 = true;
        rnVar.setOccupyStatusBar(!AndroidUtilities.isTablet());
        this.d.getAvatarImageView().setScaleX(0.9f);
        this.d.getAvatarImageView().setScaleY(0.9f);
        this.d.setRightAvatarPadding(-AndroidUtilities.dp(3.0f));
        this.actionBar.addView(this.d, 0, h7.z5.d(-2, -1.0f, 51, !this.inPreviewMode ? 50.0f : 0.0f, 0.0f, 40.0f, 0.0f));
        TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.b));
        this.d.k(user, true);
        this.d.setTitle(UserObject.getUserName(user));
        if (this.a == 0) {
            this.d.setSubtitle(LocaleController.getString(R.string.BotStatsStars));
        } else {
            this.d.setSubtitle(LocaleController.getString(R.string.BotStatsTON));
        }
        org.telegram.ui.Cells.pa.x(false, this.actionBar);
        this.actionBar.setActionBarMenuOnItemClick(new ag.e2(this, 2));
        rn rnVar2 = this.d;
        int i10 = org.telegram.ui.ActionBar.g6.Oi;
        rnVar2.i(org.telegram.ui.ActionBar.g6.w0(null, i10, false), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Pi, false));
        this.actionBar.D(org.telegram.ui.ActionBar.g6.w0(null, i10, false), false);
        this.actionBar.D(org.telegram.ui.ActionBar.g6.w0(null, i10, false), true);
        this.actionBar.C(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.z8, false), false);
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i11 = org.telegram.ui.ActionBar.g6.d6;
        kVar.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, i11, false));
        this.B = new na(context, this.currentAccount, false, this.b, getClassGuid(), getResourceProvider());
        m mVar = new m(context, 0);
        this.D = mVar;
        mVar.setOrientation(1);
        this.D.setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(i11, getResourceProvider()));
        this.D.setPadding(0, 0, 0, AndroidUtilities.dp(17.0f));
        org.telegram.ui.Components.j6 j6Var = new org.telegram.ui.Components.j6(context, false, true, true);
        this.G = j6Var;
        j6Var.setTypeface(AndroidUtilities.bold());
        org.telegram.ui.Components.j6 j6Var2 = this.G;
        int i12 = org.telegram.ui.ActionBar.g6.G6;
        j6Var2.setTextColor(org.telegram.ui.ActionBar.g6.v0(i12, getResourceProvider()));
        this.G.setTextSize(AndroidUtilities.dp(32.0f));
        this.G.setGravity(17);
        this.F = new RelativeSizeSpan(0.6770833f);
        this.D.addView(this.G, h7.z5.t(-1, 38, 49, 22, 15, 22, 0));
        org.telegram.ui.Components.j6 j6Var3 = new org.telegram.ui.Components.j6(context, true, true, true);
        this.H = j6Var3;
        j6Var3.setGravity(17);
        org.telegram.ui.Components.j6 j6Var4 = this.H;
        int i13 = org.telegram.ui.ActionBar.g6.y6;
        j6Var4.setTextColor(org.telegram.ui.ActionBar.g6.v0(i13, getResourceProvider()));
        this.H.setTextSize(AndroidUtilities.dp(14.0f));
        this.D.addView(this.H, h7.z5.d(-1, 17.0f, 49, 22.0f, 4.0f, 22.0f, 0.0f));
        n nVar = new n(this, context, 0);
        this.I = nVar;
        nVar.setText(LocaleController.getString(R.string.BotStarsWithdrawPlaceholder));
        this.I.setLeftPadding(AndroidUtilities.dp(36.0f));
        o oVar = new o(context, 0);
        this.M = oVar;
        oVar.setFocusable(false);
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
        this.M.setOnFocusChangeListener(new j(this, 0));
        this.M.addTextChangedListener(new ch.e(this, 2));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setImageResource(R.drawable.star_small_inner);
        linearLayout.addView(imageView, h7.z5.p(-2, -2, 0.0f, 19, 14, 0, 0, 0));
        linearLayout.addView(this.M, h7.z5.o(-1, -2, 1.0f, 119));
        this.I.e(this.M);
        this.I.addView(linearLayout, h7.z5.e(-1, -2, 48));
        this.M.setOnEditorActionListener(new k(this, 0));
        this.D.addView(this.I, h7.z5.t(-1, -2, 1, 18, 14, 18, 2));
        this.I.setVisibility(8);
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.E = linearLayout2;
        linearLayout2.setOrientation(0);
        p pVar = new p(0, context, getResourceProvider(), z10);
        pVar.setRoundRadius(24);
        this.N = pVar;
        pVar.setEnabled(MessagesController.getInstance(this.currentAccount).channelRevenueWithdrawalEnabled);
        this.N.g(LocaleController.getString(R.string.BotStarsButtonWithdrawShortAll), false, true);
        final int i14 = 0;
        this.N.setOnClickListener(new View.OnClickListener(this) { // from class: hh.l
            public final /* synthetic */ r b;

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
                            r rVar = this.b;
                            if (!rVar.U.J) {
                                TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                                ag.h0 h0Var = new ag.h0(22, rVar, twoStepVerificationActivity);
                                twoStepVerificationActivity.V = 1;
                                twoStepVerificationActivity.X = h0Var;
                                rVar.U.setLoading(true);
                                twoStepVerificationActivity.s0(new d(rVar, twoStepVerificationActivity, 0));
                                break;
                            }
                        }
                        break;
                }
            }
        });
        lh.d dVar = new lh.d(context, getResourceProvider(), true);
        dVar.setRoundRadius(24);
        this.O = dVar;
        dVar.setEnabled(true);
        this.O.g(LocaleController.getString(R.string.MonetizationStarsAds), false, true);
        this.O.setOnClickListener(new ag.q0(13, this, context));
        this.E.addView(this.N, h7.z5.o(-1, 48, 1.0f, 119));
        boolean z11 = this.c;
        if (!z11) {
            this.E.addView(new Space(context), h7.z5.o(8, 48, 0.0f, 119));
            this.E.addView(this.O, h7.z5.o(-1, 48, 1.0f, 119));
        }
        this.D.addView(this.E, h7.z5.d(-1, 48.0f, 55, 18.0f, 13.0f, 18.0f, 0.0f));
        m mVar2 = new m(context, 1);
        this.Q = mVar2;
        mVar2.setOrientation(1);
        this.Q.setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(i11, this.resourceProvider));
        this.Q.setPadding(0, 0, 0, AndroidUtilities.dp(17.0f));
        org.telegram.ui.Components.j6 j6Var5 = new org.telegram.ui.Components.j6(context, false, true, true);
        this.S = j6Var5;
        j6Var5.setTypeface(AndroidUtilities.bold());
        this.S.setTextColor(org.telegram.ui.ActionBar.g6.v0(i12, this.resourceProvider));
        this.S.setTextSize(AndroidUtilities.dp(32.0f));
        this.S.setGravity(17);
        this.R = new RelativeSizeSpan(0.6770833f);
        this.Q.addView(this.S, h7.z5.t(-1, 38, 49, 22, 15, 22, 0));
        org.telegram.ui.Components.j6 j6Var6 = new org.telegram.ui.Components.j6(context, true, true, true);
        this.T = j6Var6;
        j6Var6.setGravity(17);
        this.T.setTextColor(org.telegram.ui.ActionBar.g6.v0(i13, this.resourceProvider));
        this.T.setTextSize(AndroidUtilities.dp(14.0f));
        this.Q.addView(this.T, h7.z5.d(-1, 17.0f, 49, 22.0f, 4.0f, 22.0f, 0.0f));
        lh.d dVar2 = new lh.d(context, this.resourceProvider, true);
        this.U = dVar2;
        dVar2.setEnabled(MessagesController.getInstance(this.currentAccount).channelRevenueWithdrawalEnabled);
        this.U.g(LocaleController.getString(z11 ? R.string.MonetizationSelfWithdraw : R.string.MonetizationWithdraw), false, true);
        this.U.setVisibility(8);
        final int i15 = 1;
        this.U.setOnClickListener(new View.OnClickListener(this) { // from class: hh.l
            public final /* synthetic */ r b;

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
                            r rVar = this.b;
                            if (!rVar.U.J) {
                                TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                                ag.h0 h0Var = new ag.h0(22, rVar, twoStepVerificationActivity);
                                twoStepVerificationActivity.V = 1;
                                twoStepVerificationActivity.X = h0Var;
                                rVar.U.setLoading(true);
                                twoStepVerificationActivity.s0(new d(rVar, twoStepVerificationActivity, 0));
                                break;
                            }
                        }
                        break;
                }
            }
        });
        this.Q.addView(this.U, h7.z5.d(-1, 48.0f, 55, 18.0f, 13.0f, 18.0f, 0.0f));
        k51 k51Var = new k51(this, new ch.c(this, 13), new g(this), new g(this));
        this.e = k51Var;
        k51Var.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.g6.a7));
        this.e.p1();
        qVar.addView(this.e, h7.z5.c(-1.0f, -1));
        this.e.setOnScrollListener(new ag.z2(this, 6));
        this.actionBar.setAdaptiveBackground(this.e);
        this.fragmentView = qVar;
        return qVar;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.botStarsUpdated && ((Long) objArr[0]).longValue() == this.b) {
            g0();
        }
    }

    public final void g0() {
        sf.b bVar;
        ArrayList arrayList;
        TLRPC.TL_payments_starsRevenueStats h = c0.g(this.currentAccount).h(this.b, false);
        if (h == this.f) {
            if ((h == null ? null : h.status) == this.h) {
                return;
            }
        }
        this.f = h;
        this.h = h != null ? h.status : null;
        if (h != null) {
            this.V = h.usd_rate;
            c91 f02 = q91.f0(h.revenue_graph, LocaleController.getString(R.string.BotStarsChartRevenue), 2, false);
            this.n = f02;
            if (f02 != null && (bVar = f02.d) != null && (arrayList = bVar.d) != null && !arrayList.isEmpty() && this.n.d.d.get(0) != null) {
                c91 c91Var = this.n;
                c91Var.h = true;
                ((sf.a) c91Var.d.d.get(0)).g = org.telegram.ui.ActionBar.g6.yj;
                this.n.d.h = (float) ((1.0d / this.V) / 100.0d);
            }
            TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus = h.status;
            i0(tL_starsRevenueStatus.available_balance, tL_starsRevenueStatus.next_withdrawal_at);
            k51 k51Var = this.e;
            if (k51Var != null) {
                k51Var.U2.N(true);
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
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(oa.X0(false, TextUtils.concat("XTR ", oa.J0(starsAmount, 0.8f, ' ')), 1.0f, null));
        int indexOf = TextUtils.indexOf(spannableStringBuilder, ".");
        if (indexOf >= 0) {
            spannableStringBuilder.setSpan(this.F, indexOf, spannableStringBuilder.length(), 33);
        }
        this.G.setText(spannableStringBuilder);
        this.H.setText("≈" + BillingController.getInstance().formatCurrency(j10, "USD"));
        this.I.setVisibility(j10 > 0 ? 0 : 8);
        if (this.K) {
            this.J = true;
            o oVar = this.M;
            long j11 = starsAmount.amount;
            this.L = j11;
            oVar.setText(Long.toString(j11));
            o oVar2 = this.M;
            oVar2.setSelection(oVar2.getText().length());
            this.J = false;
            this.N.setEnabled(this.L > 0);
        }
        this.C = i10;
        c cVar = this.j0;
        AndroidUtilities.cancelRunOnUIThread(cVar);
        cVar.run();
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean isLightStatusBar() {
        return AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.d6, false)) > 0.721f;
    }

    public final void k0() {
        p pVar = this.N;
        if (!pVar.S || pVar.J) {
            return;
        }
        int currentTime = getConnectionsManager().getCurrentTime();
        int i10 = 1;
        if (this.C > currentTime) {
            this.W = mc.a0(this).Q(R.raw.timer_3, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BotStarsWithdrawalToast, j0(this.C - currentTime)))).j();
            return;
        }
        if (this.L < getMessagesController().starsRevenueWithdrawalMin) {
            mc.a0(this).L(getParentActivity().getResources().getDrawable(R.drawable.star_small_inner).mutate(), AndroidUtilities.replaceSingleTag(LocaleController.formatPluralString("BotStarsWithdrawMinLimit", (int) getMessagesController().starsRevenueWithdrawalMin, new Object[0]), new c(this, i10))).j();
            return;
        }
        long j10 = this.L;
        TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
        c3.f fVar = new c3.f(this, j10, twoStepVerificationActivity, 3);
        twoStepVerificationActivity.V = 1;
        twoStepVerificationActivity.X = fVar;
        this.N.setLoading(true);
        twoStepVerificationActivity.s0(new d(this, twoStepVerificationActivity, i10));
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean onFragmentCreate() {
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.botStarsUpdated);
        g0();
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onFragmentDestroy() {
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.botStarsUpdated);
        super.onFragmentDestroy();
    }
}
