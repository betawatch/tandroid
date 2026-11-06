package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stats;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class kd implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ zd b;

    public /* synthetic */ kd(zd zdVar, int i7) {
        this.a = i7;
        this.b = zdVar;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                if (tL_error == null) {
                    if (tLObject instanceof TLRPC.Updates) {
                        zd zdVar = this.b;
                        org.telegram.messenger.g0.h3(new dd(zdVar, 3));
                        org.telegram.messenger.qp.s1(zdVar.o0).O3((TLRPC.Updates) tLObject, false);
                        break;
                    }
                } else {
                    org.telegram.messenger.g0.h3(new gq0(tL_error, 22));
                    break;
                }
                break;
            case 1:
                final int i7 = 0;
                final zd zdVar2 = this.b;
                org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.md
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i10 = i7;
                        TLObject tLObject2 = tLObject;
                        zd zdVar3 = zdVar2;
                        switch (i10) {
                            case 0:
                                if (tLObject2 instanceof TLRPC.TL_payments_starsRevenueStats) {
                                    TLRPC.TL_payments_starsRevenueStats tL_payments_starsRevenueStats = (TLRPC.TL_payments_starsRevenueStats) tLObject2;
                                    zdVar3.l1 = c51.i0(tL_payments_starsRevenueStats.top_hours_graph, org.telegram.messenger.hd.M0(2131748401, null), 0, false);
                                    TL_stats.StatsGraph statsGraph = tL_payments_starsRevenueStats.revenue_graph;
                                    if (statsGraph != null) {
                                        statsGraph.rate = (float) (1.0E7d / tL_payments_starsRevenueStats.usd_rate);
                                    }
                                    zdVar3.m1 = c51.i0(statsGraph, org.telegram.messenger.hd.M0(2131748400, null), 2, false);
                                    o41 o41Var = zdVar3.l1;
                                    if (o41Var != null) {
                                        o41Var.n = true;
                                    }
                                    zdVar3.g1 = tL_payments_starsRevenueStats.usd_rate;
                                    zdVar3.L(true, tL_payments_starsRevenueStats.status);
                                    zdVar3.Y0.animate().alpha(0.0f).setDuration(380L).setInterpolator(org.telegram.ui.Components.xq.h).withEndAction(new dd(zdVar3, 5)).start();
                                    zdVar3.E();
                                    break;
                                }
                                break;
                            default:
                                if (!(tLObject2 instanceof TLRPC.TL_payments_starsRevenueStats)) {
                                    zdVar3.getClass();
                                    break;
                                } else {
                                    zdVar3.D((TLRPC.TL_payments_starsRevenueStats) tLObject2);
                                    break;
                                }
                        }
                    }
                });
                break;
            default:
                final int i10 = 1;
                final zd zdVar3 = this.b;
                org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.md
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i102 = i10;
                        TLObject tLObject2 = tLObject;
                        zd zdVar32 = zdVar3;
                        switch (i102) {
                            case 0:
                                if (tLObject2 instanceof TLRPC.TL_payments_starsRevenueStats) {
                                    TLRPC.TL_payments_starsRevenueStats tL_payments_starsRevenueStats = (TLRPC.TL_payments_starsRevenueStats) tLObject2;
                                    zdVar32.l1 = c51.i0(tL_payments_starsRevenueStats.top_hours_graph, org.telegram.messenger.hd.M0(2131748401, null), 0, false);
                                    TL_stats.StatsGraph statsGraph = tL_payments_starsRevenueStats.revenue_graph;
                                    if (statsGraph != null) {
                                        statsGraph.rate = (float) (1.0E7d / tL_payments_starsRevenueStats.usd_rate);
                                    }
                                    zdVar32.m1 = c51.i0(statsGraph, org.telegram.messenger.hd.M0(2131748400, null), 2, false);
                                    o41 o41Var = zdVar32.l1;
                                    if (o41Var != null) {
                                        o41Var.n = true;
                                    }
                                    zdVar32.g1 = tL_payments_starsRevenueStats.usd_rate;
                                    zdVar32.L(true, tL_payments_starsRevenueStats.status);
                                    zdVar32.Y0.animate().alpha(0.0f).setDuration(380L).setInterpolator(org.telegram.ui.Components.xq.h).withEndAction(new dd(zdVar32, 5)).start();
                                    zdVar32.E();
                                    break;
                                }
                                break;
                            default:
                                if (!(tLObject2 instanceof TLRPC.TL_payments_starsRevenueStats)) {
                                    zdVar32.getClass();
                                    break;
                                } else {
                                    zdVar32.D((TLRPC.TL_payments_starsRevenueStats) tLObject2);
                                    break;
                                }
                        }
                    }
                });
                break;
        }
    }
}
