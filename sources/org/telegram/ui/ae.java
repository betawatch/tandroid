package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stats;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ae implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ qe b;

    public /* synthetic */ ae(qe qeVar, int i10) {
        this.a = i10;
        this.b = qeVar;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                if (tL_error == null) {
                    if (tLObject instanceof TLRPC.Updates) {
                        qe qeVar = this.b;
                        AndroidUtilities.runOnUIThread(new ud(qeVar, 4));
                        MessagesController.getInstance(qeVar.y0).lambda$processUpdates$377((TLRPC.Updates) tLObject, false);
                        break;
                    }
                } else {
                    AndroidUtilities.runOnUIThread(new su0(tL_error, 22));
                    break;
                }
                break;
            case 1:
                final int i10 = 0;
                final qe qeVar2 = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.be
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 instanceof TLRPC.TL_payments_starsRevenueStats) {
                                    TLRPC.TL_payments_starsRevenueStats tL_payments_starsRevenueStats = (TLRPC.TL_payments_starsRevenueStats) tLObject2;
                                    ta1 f02 = hb1.f0(tL_payments_starsRevenueStats.top_hours_graph, LocaleController.getString(R.string.MonetizationGraphImpressions), 0, false);
                                    qe qeVar3 = qeVar2;
                                    qeVar3.o1 = f02;
                                    TL_stats.StatsGraph statsGraph = tL_payments_starsRevenueStats.revenue_graph;
                                    if (statsGraph != null) {
                                        statsGraph.rate = (float) (1.0E7d / tL_payments_starsRevenueStats.usd_rate);
                                    }
                                    qeVar3.p1 = hb1.f0(statsGraph, LocaleController.getString(R.string.MonetizationGraphRevenue), 2, false);
                                    ta1 ta1Var = qeVar3.o1;
                                    if (ta1Var != null) {
                                        ta1Var.n = true;
                                    }
                                    qeVar3.j1 = tL_payments_starsRevenueStats.usd_rate;
                                    qeVar3.g0(true, tL_payments_starsRevenueStats.status);
                                    qeVar3.c1.animate().alpha(0.0f).setDuration(380L).setInterpolator(org.telegram.ui.Components.es.h).withEndAction(new ud(qeVar3, 6)).start();
                                    qeVar3.a0();
                                    break;
                                }
                                break;
                            default:
                                TLObject tLObject3 = tLObject;
                                boolean z10 = tLObject3 instanceof TLRPC.TL_payments_starsRevenueStats;
                                qe qeVar4 = qeVar2;
                                if (!z10) {
                                    qeVar4.getClass();
                                    break;
                                } else {
                                    qeVar4.Z((TLRPC.TL_payments_starsRevenueStats) tLObject3);
                                    break;
                                }
                        }
                    }
                });
                break;
            default:
                final int i11 = 1;
                final qe qeVar3 = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.be
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 instanceof TLRPC.TL_payments_starsRevenueStats) {
                                    TLRPC.TL_payments_starsRevenueStats tL_payments_starsRevenueStats = (TLRPC.TL_payments_starsRevenueStats) tLObject2;
                                    ta1 f02 = hb1.f0(tL_payments_starsRevenueStats.top_hours_graph, LocaleController.getString(R.string.MonetizationGraphImpressions), 0, false);
                                    qe qeVar32 = qeVar3;
                                    qeVar32.o1 = f02;
                                    TL_stats.StatsGraph statsGraph = tL_payments_starsRevenueStats.revenue_graph;
                                    if (statsGraph != null) {
                                        statsGraph.rate = (float) (1.0E7d / tL_payments_starsRevenueStats.usd_rate);
                                    }
                                    qeVar32.p1 = hb1.f0(statsGraph, LocaleController.getString(R.string.MonetizationGraphRevenue), 2, false);
                                    ta1 ta1Var = qeVar32.o1;
                                    if (ta1Var != null) {
                                        ta1Var.n = true;
                                    }
                                    qeVar32.j1 = tL_payments_starsRevenueStats.usd_rate;
                                    qeVar32.g0(true, tL_payments_starsRevenueStats.status);
                                    qeVar32.c1.animate().alpha(0.0f).setDuration(380L).setInterpolator(org.telegram.ui.Components.es.h).withEndAction(new ud(qeVar32, 6)).start();
                                    qeVar32.a0();
                                    break;
                                }
                                break;
                            default:
                                TLObject tLObject3 = tLObject;
                                boolean z10 = tLObject3 instanceof TLRPC.TL_payments_starsRevenueStats;
                                qe qeVar4 = qeVar3;
                                if (!z10) {
                                    qeVar4.getClass();
                                    break;
                                } else {
                                    qeVar4.Z((TLRPC.TL_payments_starsRevenueStats) tLObject3);
                                    break;
                                }
                        }
                    }
                });
                break;
        }
    }
}
