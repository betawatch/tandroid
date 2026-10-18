package ai;

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
import org.telegram.ui.Components.a71;
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.oo;
import org.telegram.ui.Components.s61;
import org.telegram.ui.Components.yq;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.d91;
import org.telegram.ui.ko;
import org.telegram.ui.r91;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes4.dex */
public final class x extends org.telegram.ui.ActionBar.n2 implements NotificationCenter.NotificationCenterDelegate {
    public final CharSequence E;
    public ld F;
    public int G;
    public r H;
    public LinearLayout I;
    public RelativeSizeSpan J;
    public org.telegram.ui.Components.q6 K;
    public org.telegram.ui.Components.q6 L;
    public s M;
    public boolean N;
    public boolean O;
    public long P;
    public t Q;
    public v R;
    public ei.d S;
    public final yq[] T;
    public r U;
    public RelativeSizeSpan V;
    public org.telegram.ui.Components.q6 W;
    public org.telegram.ui.Components.q6 X;
    public ei.d Y;
    public double Z;
    public final int a;
    public org.telegram.ui.Components.qc a0;
    public final long b;
    public CharSequence b0;
    public final boolean c;
    public CharSequence c0;
    public oo d;
    public CharSequence d0;
    public a71 e;
    public boolean e0;
    public TLRPC.TL_payments_starsRevenueStats f;
    public d91 f0;
    public d91 g0;
    public TLRPC.TL_starsRevenueStatus h;
    public boolean h0;
    public boolean i0;
    public final ArrayList j0;
    public String k0;
    public DecimalFormat l0;
    public SpannableStringBuilder m0;
    public d91 n;
    public final d n0;
    public final int o0;
    public final org.telegram.ui.he r;
    public final org.telegram.ui.he s;
    public final org.telegram.ui.he v;
    public final org.telegram.ui.he w;
    public final org.telegram.ui.he x;
    public final org.telegram.ui.he y;

    public x(int i10, long j10) {
        super(null);
        this.r = org.telegram.ui.he.a("XTR", LocaleController.getString(R.string.BotStarsOverviewAvailableBalance));
        this.s = org.telegram.ui.he.a("XTR", LocaleController.getString(R.string.BotStarsOverviewTotalBalance));
        this.v = org.telegram.ui.he.a("XTR", LocaleController.getString(R.string.BotStarsOverviewTotalProceeds));
        this.w = org.telegram.ui.he.a("TON", LocaleController.getString(R.string.BotMonetizationOverviewAvailable));
        this.x = org.telegram.ui.he.a("TON", LocaleController.getString(R.string.BotMonetizationOverviewLastWithdrawal));
        this.y = org.telegram.ui.he.a("TON", LocaleController.getString(R.string.BotMonetizationOverviewTotal));
        this.N = false;
        this.O = true;
        this.T = new yq[1];
        this.h0 = false;
        this.i0 = false;
        this.j0 = new ArrayList();
        this.k0 = "";
        this.n0 = new d(this, 0);
        this.o0 = -1;
        this.a = i10;
        this.b = j10;
        boolean z10 = j10 == getUserConfig().getClientUserId();
        this.c = z10;
        if (i10 == 0) {
            k0.g(this.currentAccount).r(j10);
            if (!z10) {
                k0.g(this.currentAccount).l(j10);
            }
        } else if (i10 == 1) {
            k0 g10 = k0.g(this.currentAccount);
            Long l4 = (Long) g10.d.get(Long.valueOf(j10));
            g10.j(j10, l4 == null || System.currentTimeMillis() - l4.longValue() > 30000);
        }
        this.E = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(z10 ? LocaleController.formatPluralStringComma("SelfStarsWithdrawInfo", (int) getMessagesController().starsRevenueWithdrawalMin) : LocaleController.getString(R.string.BotStarsWithdrawInfo), new d(this, 4)), true);
    }

    public static void U(x xVar) {
        d dVar = xVar.n0;
        org.telegram.ui.Components.qc.e();
        TLRPC.TL_payments_starsRevenueStats h = k0.g(xVar.currentAccount).h(xVar.b, false);
        long j10 = h == null ? 0L : h.status.available_balance.amount;
        if (j10 < xVar.getMessagesController().starsRevenueWithdrawalMin) {
            xVar.O = true;
            xVar.P = j10;
        } else {
            xVar.O = false;
            xVar.P = xVar.getMessagesController().starsRevenueWithdrawalMin;
        }
        xVar.N = true;
        xVar.Q.setText(Long.toString(xVar.P));
        t tVar = xVar.Q;
        tVar.setSelection(tVar.getText().length());
        xVar.N = false;
        AndroidUtilities.cancelRunOnUIThread(dVar);
        dVar.run();
    }

    public static void V(x xVar) {
        xVar.showDialog(org.telegram.ui.ke.d0(xVar.getParentActivity(), xVar.resourceProvider, true));
    }

    public static void W(x xVar, f61 f61Var) {
        if (f61Var.G(gd.class)) {
            md.i1(xVar.getParentActivity(), true, xVar.b, xVar.currentAccount, (TL_stars.StarsTransaction) f61Var.G, xVar.getResourceProvider());
        } else if (f61Var.G instanceof TL_stats.BroadcastRevenueTransaction) {
            org.telegram.ui.ke.h0(xVar.getParentActivity(), xVar.currentAccount, (TL_stats.BroadcastRevenueTransaction) f61Var.G, xVar.b, xVar.resourceProvider);
        } else if (f61Var.d == 2) {
            xVar.presentFragment(new gi.u3(xVar.b));
        }
    }

    public static void X(x xVar, Context context, View view) {
        if (view.isEnabled()) {
            ei.d dVar = xVar.S;
            if (dVar.N) {
                return;
            }
            dVar.setLoading(true);
            TLRPC.TL_payments_getStarsRevenueAdsAccountUrl tL_payments_getStarsRevenueAdsAccountUrl = new TLRPC.TL_payments_getStarsRevenueAdsAccountUrl();
            tL_payments_getStarsRevenueAdsAccountUrl.peer = MessagesController.getInstance(xVar.currentAccount).getInputPeer(xVar.b);
            ConnectionsManager.getInstance(xVar.currentAccount).sendRequest(tL_payments_getStarsRevenueAdsAccountUrl, new g(0, xVar, context));
        }
    }

    public static void Y(x xVar, ArrayList arrayList) {
        int i10;
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus;
        double d;
        int i11;
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus2;
        org.telegram.ui.he heVar = xVar.x;
        ArrayList arrayList2 = xVar.j0;
        org.telegram.ui.he heVar2 = xVar.y;
        org.telegram.ui.he heVar3 = xVar.v;
        org.telegram.ui.he heVar4 = xVar.s;
        org.telegram.ui.he heVar5 = xVar.r;
        long j10 = xVar.b;
        org.telegram.ui.he heVar6 = xVar.w;
        boolean z10 = xVar.c;
        int i12 = xVar.o0;
        k0 g10 = k0.g(xVar.currentAccount);
        int i13 = xVar.a;
        if (i13 == 0) {
            arrayList.add(f61.h(2, i12, xVar.n));
            arrayList.add(f61.A(-1, null));
            arrayList.add(f61.b(LocaleController.getString(R.string.BotStarsOverview)));
            TLRPC.TL_payments_starsRevenueStats h = g10.h(j10, false);
            if (h != null && (tL_starsRevenueStatus2 = h.status) != null) {
                heVar5.a = false;
                heVar5.g = true;
                TL_stars.StarsAmount starsAmount = tL_starsRevenueStatus2.available_balance;
                heVar5.i = starsAmount;
                heVar5.h = "XTR";
                heVar5.f = "USD";
                double d10 = starsAmount.amount;
                double d11 = xVar.Z;
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
                xVar.i0(starsAmount, tL_starsRevenueStatus2.next_withdrawal_at);
                xVar.I.setVisibility(h.status.withdrawal_enabled ? 0 : 8);
            }
            arrayList.add(f61.u(heVar5));
            arrayList.add(f61.u(heVar4));
            arrayList.add(f61.u(heVar3));
            arrayList.add(f61.A(-2, LocaleController.getString(z10 ? R.string.SelfStarsOverviewInfo : R.string.BotStarsOverviewInfo)));
            arrayList.add(f61.b(LocaleController.getString(R.string.BotStarsAvailableBalance)));
            arrayList.add(f61.j(1, xVar.H));
            arrayList.add(f61.A(-3, xVar.E));
            if (z10) {
                return;
            }
            if (xVar.getMessagesController().starrefConnectAllowed) {
                arrayList.add(gi.h.a(2, org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.uj, xVar.resourceProvider), R.drawable.filled_earn_stars, ko.d0(LocaleController.getString(R.string.BotAffiliateProgramRowTitle)), LocaleController.getString(R.string.BotAffiliateProgramRowText)));
                arrayList.add(f61.A(-4, null));
            }
            arrayList.add(f61.p(xVar.F, 0, false));
            return;
        }
        if (i13 == 1) {
            TLRPC.TL_payments_starsRevenueStats j11 = g10.j(j10, true);
            if (!z10) {
                if (xVar.b0 == null) {
                    xVar.b0 = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.BotMonetizationInfo, 50), -1, 3, new d(xVar, 2), xVar.resourceProvider), true);
                }
                arrayList.add(f61.g(xVar.b0));
            }
            if (xVar.f0 == null && j11 != null) {
                d91 f02 = r91.f0(j11.top_hours_graph, LocaleController.getString(R.string.BotMonetizationGraphImpressions), 0, false);
                xVar.f0 = f02;
                if (f02 != null) {
                    f02.n = true;
                }
            }
            d91 d91Var = xVar.f0;
            if (d91Var != null && !d91Var.l) {
                arrayList.add(f61.h(5, i12, d91Var));
                arrayList.add(f61.A(-1, null));
            }
            if (xVar.g0 != null || j11 == null) {
                i10 = 2;
            } else {
                TL_stats.StatsGraph statsGraph = j11.revenue_graph;
                if (statsGraph != null) {
                    statsGraph.rate = (float) (1.0E7d / j11.usd_rate);
                }
                i10 = 2;
                xVar.g0 = r91.f0(statsGraph, LocaleController.getString(R.string.BotMonetizationGraphRevenue), 2, false);
            }
            d91 d91Var2 = xVar.g0;
            if (d91Var2 != null && !d91Var2.l) {
                arrayList.add(f61.h(i10, i12, d91Var2));
                arrayList.add(f61.A(-2, null));
            }
            if (!xVar.e0 && j11 != null && (tL_starsRevenueStatus = j11.status) != null) {
                double d12 = j11.usd_rate;
                long j12 = tL_starsRevenueStatus.available_balance.amount;
                heVar6.d = j12;
                double d13 = j12 / 1.0E9d;
                long j13 = (long) (d13 * d12 * 100.0d);
                heVar6.e = j13;
                if (xVar.l0 == null) {
                    DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.US);
                    decimalFormatSymbols.setDecimalSeparator('.');
                    d = d12;
                    DecimalFormat decimalFormat = new DecimalFormat("#.##", decimalFormatSymbols);
                    xVar.l0 = decimalFormat;
                    decimalFormat.setMinimumFractionDigits(2);
                    i11 = 6;
                    xVar.l0.setMaximumFractionDigits(6);
                    xVar.l0.setGroupingUsed(false);
                } else {
                    d = d12;
                    i11 = 6;
                }
                DecimalFormat decimalFormat2 = xVar.l0;
                if (d13 > 1.5d) {
                    i11 = 2;
                }
                decimalFormat2.setMaximumFractionDigits(i11);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(org.telegram.ui.ke.f0("TON " + xVar.l0.format(d13), xVar.W.getPaint(), 0.9f, 0.0f, true));
                int indexOf = TextUtils.indexOf(spannableStringBuilder, ".");
                if (indexOf >= 0) {
                    spannableStringBuilder.setSpan(xVar.V, indexOf, spannableStringBuilder.length(), 33);
                }
                xVar.W.setText(spannableStringBuilder);
                xVar.X.setText("≈" + BillingController.getInstance().formatCurrency(j13, "USD"));
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
                xVar.e0 = true;
                xVar.Y.setVisibility((tL_starsRevenueStatus3.available_balance.amount <= 0 || !tL_starsRevenueStatus3.withdrawal_enabled) ? 8 : 0);
            }
            if (xVar.e0) {
                arrayList.add(f61.b(LocaleController.getString(R.string.BotMonetizationOverview)));
                arrayList.add(f61.u(heVar6));
                arrayList.add(f61.u(heVar));
                arrayList.add(f61.u(heVar2));
                if (xVar.c0 == null) {
                    xVar.c0 = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.BotMonetizationProceedsTONInfo), -1, 3, new ah.g(xVar, R.string.BotMonetizationProceedsTONInfoLink, 1), xVar.resourceProvider), true);
                }
                arrayList.add(f61.A(-4, xVar.c0));
            }
            arrayList.add(f61.b(LocaleController.getString(R.string.BotMonetizationBalance)));
            arrayList.add(f61.k(xVar.U));
            if (xVar.d0 == null) {
                xVar.d0 = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(MessagesController.getInstance(xVar.currentAccount).channelRevenueWithdrawalEnabled ? R.string.BotMonetizationBalanceInfo : R.string.BotMonetizationBalanceInfoNotAvailable), -1, 3, new d(xVar, 3)), true);
            }
            arrayList.add(f61.A(-5, xVar.d0));
            if (!xVar.i0 || !arrayList2.isEmpty()) {
                arrayList.add(f61.b(LocaleController.getString(R.string.BotMonetizationTransactions)));
                int size = arrayList2.size();
                int i14 = 0;
                while (i14 < size) {
                    Object obj = arrayList2.get(i14);
                    i14++;
                    int i15 = gd.a;
                    f61 J = f61.J(gd.class);
                    J.G = (TL_stars.StarsTransaction) obj;
                    J.q = true;
                    arrayList.add(J);
                }
                if (!xVar.i0) {
                    arrayList.add(f61.o(1, 7));
                    arrayList.add(f61.o(2, 7));
                    arrayList.add(f61.o(3, 7));
                }
            }
            arrayList.add(f61.A(-6, null));
        }
    }

    public static void Z(x xVar, TLRPC.TL_error tL_error, TwoStepVerificationActivity twoStepVerificationActivity, Activity activity, boolean z10, long j10, TLObject tLObject) {
        int i10;
        if (tL_error == null) {
            twoStepVerificationActivity.o0();
            twoStepVerificationActivity.finishFragment();
            if (tLObject instanceof TL_stats.TL_broadcastRevenueWithdrawalUrl) {
                pf.d.t(xVar.getParentActivity(), ((TL_stats.TL_broadcastRevenueWithdrawalUrl) tLObject).url);
                return;
            } else {
                if (tLObject instanceof TLRPC.TL_payments_starsRevenueWithdrawalUrl) {
                    xVar.O = true;
                    pf.d.t(xVar.getParentActivity(), ((TLRPC.TL_payments_starsRevenueWithdrawalUrl) tLObject).url);
                    return;
                }
                return;
            }
        }
        if (!"PASSWORD_MISSING".equals(tL_error.text) && !tL_error.text.startsWith("PASSWORD_TOO_FRESH_") && !tL_error.text.startsWith("SESSION_TOO_FRESH_")) {
            if ("SRP_ID_INVALID".equals(tL_error.text)) {
                ConnectionsManager.getInstance(xVar.currentAccount).sendRequest(new TL_account.getPassword(), new l(xVar, twoStepVerificationActivity, z10, j10, 0), 8);
                return;
            }
            twoStepVerificationActivity.o0();
            twoStepVerificationActivity.finishFragment();
            org.telegram.ui.Components.xc.d0(tL_error);
            return;
        }
        twoStepVerificationActivity.o0();
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
        alertDialog$Builder.a.R = LocaleController.getString(R.string.EditAdminTransferAlertTitle);
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setPadding(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(24.0f), 0);
        linearLayout.setOrientation(1);
        alertDialog$Builder.n(linearLayout);
        TextView textView = new TextView(activity);
        int i11 = org.telegram.ui.ActionBar.h6.j5;
        textView.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i11, false));
        textView.setTextSize(1, 16.0f);
        textView.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        textView.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.WithdrawChannelAlertText)));
        linearLayout.addView(textView, w7.z5.n(-1, -2));
        LinearLayout linearLayout2 = new LinearLayout(activity);
        linearLayout2.setOrientation(0);
        linearLayout.addView(linearLayout2, w7.z5.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
        ImageView imageView = new ImageView(activity);
        imageView.setImageResource(R.drawable.list_circle);
        imageView.setPadding(LocaleController.isRTL ? AndroidUtilities.dp(11.0f) : 0, AndroidUtilities.dp(9.0f), LocaleController.isRTL ? 0 : AndroidUtilities.dp(11.0f), 0);
        int x02 = org.telegram.ui.ActionBar.h6.x0(null, i11, false);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        imageView.setColorFilter(new PorterDuffColorFilter(x02, mode));
        TextView textView2 = new TextView(activity);
        textView2.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i11, false));
        textView2.setTextSize(1, 16.0f);
        textView2.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        org.telegram.messenger.g0.n(R.string.EditAdminTransferAlertText1, textView2);
        if (LocaleController.isRTL) {
            linearLayout2.addView(textView2, w7.z5.n(-1, -2));
            linearLayout2.addView(imageView, w7.z5.q(-2, -2, 5));
        } else {
            linearLayout2.addView(imageView, w7.z5.n(-2, -2));
            linearLayout2.addView(textView2, w7.z5.n(-1, -2));
        }
        LinearLayout e = org.telegram.messenger.g0.e(activity, 0);
        linearLayout.addView(e, w7.z5.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
        ImageView imageView2 = new ImageView(activity);
        imageView2.setImageResource(R.drawable.list_circle);
        imageView2.setPadding(LocaleController.isRTL ? AndroidUtilities.dp(11.0f) : 0, AndroidUtilities.dp(9.0f), LocaleController.isRTL ? 0 : AndroidUtilities.dp(11.0f), 0);
        imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.x0(null, i11, false), mode));
        TextView textView3 = new TextView(activity);
        textView3.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i11, false));
        textView3.setTextSize(1, 16.0f);
        textView3.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        org.telegram.messenger.g0.n(R.string.EditAdminTransferAlertText2, textView3);
        if (LocaleController.isRTL) {
            e.addView(textView3, w7.z5.n(-1, -2));
            i10 = 5;
            e.addView(imageView2, w7.z5.q(-2, -2, 5));
        } else {
            i10 = 5;
            e.addView(imageView2, w7.z5.n(-2, -2));
            e.addView(textView3, w7.z5.n(-1, -2));
        }
        if ("PASSWORD_MISSING".equals(tL_error.text)) {
            alertDialog$Builder.k(LocaleController.getString(R.string.EditAdminTransferSetPassword), new k(xVar));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        } else {
            TextView textView4 = new TextView(activity);
            textView4.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i11, false));
            textView4.setTextSize(1, 16.0f);
            if (!LocaleController.isRTL) {
                i10 = 3;
            }
            textView4.setGravity(i10 | 48);
            textView4.setText(LocaleController.getString(R.string.EditAdminTransferAlertText3));
            linearLayout.addView(textView4, w7.z5.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
            alertDialog$Builder.h(LocaleController.getString(R.string.OK), null);
        }
        twoStepVerificationActivity.showDialog(alertDialog$Builder.a);
    }

    public static /* synthetic */ void a0(x xVar, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject instanceof TL_stars.StarsStatus) {
            TL_stars.StarsStatus starsStatus = (TL_stars.StarsStatus) tLObject;
            MessagesController.getInstance(xVar.currentAccount).putUsers(starsStatus.users, false);
            MessagesController.getInstance(xVar.currentAccount).putChats(starsStatus.chats, false);
            xVar.k0 = starsStatus.next_offset;
            xVar.j0.addAll(starsStatus.history);
            xVar.i0 = starsStatus.history.isEmpty() || starsStatus.next_offset == null;
        } else if (tL_error != null) {
            org.telegram.ui.Components.xc.d0(tL_error);
            xVar.i0 = true;
        }
        xVar.h0 = false;
        s61 s61Var = xVar.e.W2;
        if (s61Var != null) {
            s61Var.N(true);
        }
    }

    public static void e0(x xVar) {
        if (xVar.h0 || xVar.i0 || xVar.k0 == null) {
            return;
        }
        xVar.h0 = true;
        TL_stars.TL_payments_getStarsTransactions tL_payments_getStarsTransactions = new TL_stars.TL_payments_getStarsTransactions();
        tL_payments_getStarsTransactions.ton = true;
        tL_payments_getStarsTransactions.peer = MessagesController.getInstance(xVar.currentAccount).getInputPeer(xVar.b);
        tL_payments_getStarsTransactions.offset = xVar.k0;
        tL_payments_getStarsTransactions.limit = xVar.j0.isEmpty() ? 5 : 20;
        ConnectionsManager.getInstance(xVar.currentAccount).sendRequest(tL_payments_getStarsTransactions, new h(xVar, 0));
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
        w wVar = new w(this, context);
        oo ooVar = new oo(context, null, false, null);
        this.d = ooVar;
        boolean z10 = true;
        ooVar.setOccupyStatusBar(!AndroidUtilities.isTablet());
        this.d.getAvatarImageView().setScaleX(0.9f);
        this.d.getAvatarImageView().setScaleY(0.9f);
        this.d.setRightAvatarPadding(-AndroidUtilities.dp(3.0f));
        this.actionBar.addView(this.d, 0, w7.z5.d(-2, -1.0f, 51, !this.inPreviewMode ? 50.0f : 0.0f, 0.0f, 40.0f, 0.0f));
        TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.b));
        this.d.k(user, true);
        this.d.setTitle(UserObject.getUserName(user));
        if (this.a == 0) {
            this.d.setSubtitle(LocaleController.getString(R.string.BotStatsStars));
        } else {
            this.d.setSubtitle(LocaleController.getString(R.string.BotStatsTON));
        }
        i2.d.y(false, this.actionBar);
        this.actionBar.setActionBarMenuOnItemClick(new ah.s(this, 1));
        oo ooVar2 = this.d;
        int i10 = org.telegram.ui.ActionBar.h6.Oi;
        ooVar2.i(org.telegram.ui.ActionBar.h6.x0(null, i10, false), org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Pi, false));
        this.actionBar.C(org.telegram.ui.ActionBar.h6.x0(null, i10, false), false);
        this.actionBar.C(org.telegram.ui.ActionBar.h6.x0(null, i10, false), true);
        this.actionBar.B(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.z8, false), false);
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i11 = org.telegram.ui.ActionBar.h6.d6;
        kVar.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, i11, false));
        this.F = new ld(context, this.currentAccount, false, this.b, getClassGuid(), getResourceProvider());
        r rVar = new r(context, 0);
        this.H = rVar;
        rVar.setOrientation(1);
        this.H.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(i11, getResourceProvider()));
        this.H.setPadding(0, 0, 0, AndroidUtilities.dp(17.0f));
        org.telegram.ui.Components.q6 q6Var = new org.telegram.ui.Components.q6(context, false, true, true);
        this.K = q6Var;
        q6Var.setTypeface(AndroidUtilities.bold());
        org.telegram.ui.Components.q6 q6Var2 = this.K;
        int i12 = org.telegram.ui.ActionBar.h6.G6;
        q6Var2.setTextColor(org.telegram.ui.ActionBar.h6.w0(i12, getResourceProvider()));
        this.K.setTextSize(AndroidUtilities.dp(32.0f));
        this.K.setGravity(17);
        this.J = new RelativeSizeSpan(0.6770833f);
        this.H.addView(this.K, w7.z5.t(-1, 38, 49, 22, 15, 22, 0));
        org.telegram.ui.Components.q6 q6Var3 = new org.telegram.ui.Components.q6(context, true, true, true);
        this.L = q6Var3;
        q6Var3.setGravity(17);
        org.telegram.ui.Components.q6 q6Var4 = this.L;
        int i13 = org.telegram.ui.ActionBar.h6.y6;
        q6Var4.setTextColor(org.telegram.ui.ActionBar.h6.w0(i13, getResourceProvider()));
        this.L.setTextSize(AndroidUtilities.dp(14.0f));
        this.H.addView(this.L, w7.z5.d(-1, 17.0f, 49, 22.0f, 4.0f, 22.0f, 0.0f));
        s sVar = new s(this, context, 0);
        this.M = sVar;
        sVar.setText(LocaleController.getString(R.string.BotStarsWithdrawPlaceholder));
        this.M.setLeftPadding(AndroidUtilities.dp(36.0f));
        t tVar = new t(context, 0);
        this.Q = tVar;
        tVar.setFocusable(false);
        this.Q.setTextColor(getThemedColor(i12));
        this.Q.setCursorSize(AndroidUtilities.dp(20.0f));
        this.Q.setCursorWidth(1.5f);
        this.Q.setBackground(null);
        this.Q.setTextSize(1, 18.0f);
        this.Q.setMaxLines(1);
        int dp = AndroidUtilities.dp(16.0f);
        this.Q.setPadding(AndroidUtilities.dp(6.0f), dp, dp, dp);
        this.Q.setInputType(2);
        this.Q.setTypeface(Typeface.DEFAULT);
        this.Q.setHighlightColor(getThemedColor(org.telegram.ui.ActionBar.h6.uf));
        this.Q.setHandlesColor(getThemedColor(org.telegram.ui.ActionBar.h6.vf));
        this.Q.setGravity(LocaleController.isRTL ? 5 : 3);
        this.Q.setOnFocusChangeListener(new ah.u0(this, 1));
        this.Q.addTextChangedListener(new u(this, 0));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setImageResource(R.drawable.star_small_inner);
        linearLayout.addView(imageView, w7.z5.p(-2, -2, 0.0f, 19, 14, 0, 0, 0));
        linearLayout.addView(this.Q, w7.z5.o(-1, -2, 1.0f, 119));
        this.M.e(this.Q);
        this.M.addView(linearLayout, w7.z5.e(-1, -2, 48));
        this.Q.setOnEditorActionListener(new n(this, 0));
        this.H.addView(this.M, w7.z5.t(-1, -2, 1, 18, 14, 18, 2));
        this.M.setVisibility(8);
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.I = linearLayout2;
        linearLayout2.setOrientation(0);
        v vVar = new v(0, context, getResourceProvider(), z10);
        vVar.setRoundRadius(24);
        this.R = vVar;
        vVar.setEnabled(MessagesController.getInstance(this.currentAccount).channelRevenueWithdrawalEnabled);
        this.R.g(LocaleController.getString(R.string.BotStarsButtonWithdrawShortAll), false, true);
        final int i14 = 0;
        this.R.setOnClickListener(new View.OnClickListener(this) { // from class: ai.o
            public final /* synthetic */ x b;

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
                            x xVar = this.b;
                            if (!xVar.Y.N) {
                                TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                                ah.h0 h0Var = new ah.h0(1, xVar, twoStepVerificationActivity);
                                twoStepVerificationActivity.Z = 1;
                                twoStepVerificationActivity.b0 = h0Var;
                                xVar.Y.setLoading(true);
                                twoStepVerificationActivity.s0(new e(xVar, twoStepVerificationActivity, 0));
                                break;
                            }
                        }
                        break;
                }
            }
        });
        ei.d dVar = new ei.d(context, getResourceProvider(), true);
        dVar.setRoundRadius(24);
        this.S = dVar;
        dVar.setEnabled(true);
        this.S.g(LocaleController.getString(R.string.MonetizationStarsAds), false, true);
        this.S.setOnClickListener(new p(i14, this, context));
        this.I.addView(this.R, w7.z5.o(-1, 48, 1.0f, 119));
        boolean z11 = this.c;
        if (!z11) {
            this.I.addView(new Space(context), w7.z5.o(8, 48, 0.0f, 119));
            this.I.addView(this.S, w7.z5.o(-1, 48, 1.0f, 119));
        }
        this.H.addView(this.I, w7.z5.d(-1, 48.0f, 55, 18.0f, 13.0f, 18.0f, 0.0f));
        r rVar2 = new r(context, 1);
        this.U = rVar2;
        rVar2.setOrientation(1);
        this.U.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(i11, this.resourceProvider));
        this.U.setPadding(0, 0, 0, AndroidUtilities.dp(17.0f));
        org.telegram.ui.Components.q6 q6Var5 = new org.telegram.ui.Components.q6(context, false, true, true);
        this.W = q6Var5;
        q6Var5.setTypeface(AndroidUtilities.bold());
        this.W.setTextColor(org.telegram.ui.ActionBar.h6.w0(i12, this.resourceProvider));
        this.W.setTextSize(AndroidUtilities.dp(32.0f));
        this.W.setGravity(17);
        this.V = new RelativeSizeSpan(0.6770833f);
        this.U.addView(this.W, w7.z5.t(-1, 38, 49, 22, 15, 22, 0));
        org.telegram.ui.Components.q6 q6Var6 = new org.telegram.ui.Components.q6(context, true, true, true);
        this.X = q6Var6;
        q6Var6.setGravity(17);
        this.X.setTextColor(org.telegram.ui.ActionBar.h6.w0(i13, this.resourceProvider));
        this.X.setTextSize(AndroidUtilities.dp(14.0f));
        this.U.addView(this.X, w7.z5.d(-1, 17.0f, 49, 22.0f, 4.0f, 22.0f, 0.0f));
        ei.d dVar2 = new ei.d(context, this.resourceProvider, true);
        dVar2.setRoundRadius(24);
        this.Y = dVar2;
        dVar2.setEnabled(MessagesController.getInstance(this.currentAccount).channelRevenueWithdrawalEnabled);
        this.Y.g(LocaleController.getString(z11 ? R.string.MonetizationSelfWithdraw : R.string.MonetizationWithdraw), false, true);
        this.Y.setVisibility(8);
        final int i15 = 1;
        this.Y.setOnClickListener(new View.OnClickListener(this) { // from class: ai.o
            public final /* synthetic */ x b;

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
                            x xVar = this.b;
                            if (!xVar.Y.N) {
                                TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                                ah.h0 h0Var = new ah.h0(1, xVar, twoStepVerificationActivity);
                                twoStepVerificationActivity.Z = 1;
                                twoStepVerificationActivity.b0 = h0Var;
                                xVar.Y.setLoading(true);
                                twoStepVerificationActivity.s0(new e(xVar, twoStepVerificationActivity, 0));
                                break;
                            }
                        }
                        break;
                }
            }
        });
        this.U.addView(this.Y, w7.z5.d(-1, 48.0f, 55, 18.0f, 13.0f, 18.0f, 0.0f));
        a71 a71Var = new a71(this, new q(this, 0), new k(this), new k(this));
        this.e = a71Var;
        a71Var.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.h6.a7));
        this.e.p1();
        wVar.addView(this.e, w7.z5.c(-1.0f, -1));
        this.e.setOnScrollListener(new ah.d0(this, 1));
        this.actionBar.setAdaptiveBackground(this.e);
        this.fragmentView = wVar;
        return wVar;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.botStarsUpdated && ((Long) objArr[0]).longValue() == this.b) {
            g0();
        }
    }

    public final void g0() {
        kg.b bVar;
        ArrayList arrayList;
        TLRPC.TL_payments_starsRevenueStats h = k0.g(this.currentAccount).h(this.b, false);
        if (h == this.f) {
            if ((h == null ? null : h.status) == this.h) {
                return;
            }
        }
        this.f = h;
        this.h = h != null ? h.status : null;
        if (h != null) {
            this.Z = h.usd_rate;
            d91 f02 = r91.f0(h.revenue_graph, LocaleController.getString(R.string.BotStarsChartRevenue), 2, false);
            this.n = f02;
            if (f02 != null && (bVar = f02.d) != null && (arrayList = bVar.d) != null && !arrayList.isEmpty() && this.n.d.d.get(0) != null) {
                d91 d91Var = this.n;
                d91Var.h = true;
                ((kg.a) d91Var.d.d.get(0)).g = org.telegram.ui.ActionBar.h6.yj;
                this.n.d.h = (float) ((1.0d / this.Z) / 100.0d);
            }
            TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus = h.status;
            i0(tL_starsRevenueStatus.available_balance, tL_starsRevenueStatus.next_withdrawal_at);
            a71 a71Var = this.e;
            if (a71Var != null) {
                a71Var.W2.N(true);
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
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_payments_getStarsRevenueWithdrawalUrl, new i(this, twoStepVerificationActivity, parentActivity, z10, j10));
    }

    public final void i0(TL_stars.StarsAmount starsAmount, int i10) {
        if (this.K == null || this.L == null) {
            return;
        }
        long j10 = (long) (this.Z * starsAmount.amount * 100.0d);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(md.Y0(false, TextUtils.concat("XTR ", md.K0(starsAmount, 0.8f, ' ')), 1.0f, null));
        int indexOf = TextUtils.indexOf(spannableStringBuilder, ".");
        if (indexOf >= 0) {
            spannableStringBuilder.setSpan(this.J, indexOf, spannableStringBuilder.length(), 33);
        }
        this.K.setText(spannableStringBuilder);
        this.L.setText("≈" + BillingController.getInstance().formatCurrency(j10, "USD"));
        this.M.setVisibility(j10 > 0 ? 0 : 8);
        if (this.O) {
            this.N = true;
            t tVar = this.Q;
            long j11 = starsAmount.amount;
            this.P = j11;
            tVar.setText(Long.toString(j11));
            t tVar2 = this.Q;
            tVar2.setSelection(tVar2.getText().length());
            this.N = false;
            this.R.setEnabled(this.P > 0);
        }
        this.G = i10;
        d dVar = this.n0;
        AndroidUtilities.cancelRunOnUIThread(dVar);
        dVar.run();
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean isLightStatusBar() {
        return AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.d6, false)) > 0.721f;
    }

    public final void k0() {
        v vVar = this.R;
        if (!vVar.W || vVar.N) {
            return;
        }
        int currentTime = getConnectionsManager().getCurrentTime();
        int i10 = 1;
        if (this.G > currentTime) {
            this.a0 = org.telegram.ui.Components.xc.a0(this).Q(R.raw.timer_3, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BotStarsWithdrawalToast, j0(this.G - currentTime)))).j();
            return;
        }
        if (this.P < getMessagesController().starsRevenueWithdrawalMin) {
            org.telegram.ui.Components.xc.a0(this).L(getParentActivity().getResources().getDrawable(R.drawable.star_small_inner).mutate(), AndroidUtilities.replaceSingleTag(LocaleController.formatPluralString("BotStarsWithdrawMinLimit", (int) getMessagesController().starsRevenueWithdrawalMin, new Object[0]), new d(this, i10))).j();
            return;
        }
        long j10 = this.P;
        TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
        f fVar = new f(this, j10, twoStepVerificationActivity, 0);
        twoStepVerificationActivity.Z = 1;
        twoStepVerificationActivity.b0 = fVar;
        this.R.setLoading(true);
        twoStepVerificationActivity.s0(new e(this, twoStepVerificationActivity, i10));
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
