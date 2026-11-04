package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stats;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class jd implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ xd b;

    public /* synthetic */ jd(xd xdVar, int i3) {
        this.a = i3;
        this.b = xdVar;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                if (tL_error == null) {
                    if (tLObject instanceof TLRPC.Updates) {
                        xd xdVar = this.b;
                        org.telegram.messenger.g0.h3(new cd(xdVar, 3));
                        org.telegram.messenger.hp.s1(xdVar.p0).O3((TLRPC.Updates) tLObject, false);
                        break;
                    }
                } else {
                    org.telegram.messenger.g0.h3(new xp0(tL_error, 22));
                    break;
                }
                break;
            case 1:
                final int i3 = 0;
                final xd xdVar2 = this.b;
                org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.kd
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i10 = i3;
                        TLObject tLObject2 = tLObject;
                        xd xdVar3 = xdVar2;
                        switch (i10) {
                            case 0:
                                if (tLObject2 instanceof TLRPC.TL_payments_starsRevenueStats) {
                                    TLRPC.TL_payments_starsRevenueStats tL_payments_starsRevenueStats = (TLRPC.TL_payments_starsRevenueStats) tLObject2;
                                    xdVar3.m1 = r41.i0(tL_payments_starsRevenueStats.top_hours_graph, org.telegram.messenger.bd.M0(2131748410, null), 0, false);
                                    TL_stats.StatsGraph statsGraph = tL_payments_starsRevenueStats.revenue_graph;
                                    if (statsGraph != null) {
                                        statsGraph.rate = (float) (1.0E7d / tL_payments_starsRevenueStats.usd_rate);
                                    }
                                    xdVar3.n1 = r41.i0(statsGraph, org.telegram.messenger.bd.M0(2131748409, null), 2, false);
                                    d41 d41Var = xdVar3.m1;
                                    if (d41Var != null) {
                                        d41Var.n = true;
                                    }
                                    xdVar3.h1 = tL_payments_starsRevenueStats.usd_rate;
                                    xdVar3.L(true, tL_payments_starsRevenueStats.status);
                                    xdVar3.Z0.animate().alpha(0.0f).setDuration(380L).setInterpolator(org.telegram.ui.Components.xq.h).withEndAction(new cd(xdVar3, 5)).start();
                                    xdVar3.E();
                                    break;
                                }
                                break;
                            default:
                                if (!(tLObject2 instanceof TLRPC.TL_payments_starsRevenueStats)) {
                                    xdVar3.getClass();
                                    break;
                                } else {
                                    xdVar3.D((TLRPC.TL_payments_starsRevenueStats) tLObject2);
                                    break;
                                }
                        }
                    }
                });
                break;
            default:
                final int i10 = 1;
                final xd xdVar3 = this.b;
                org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.kd
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i102 = i10;
                        TLObject tLObject2 = tLObject;
                        xd xdVar32 = xdVar3;
                        switch (i102) {
                            case 0:
                                if (tLObject2 instanceof TLRPC.TL_payments_starsRevenueStats) {
                                    TLRPC.TL_payments_starsRevenueStats tL_payments_starsRevenueStats = (TLRPC.TL_payments_starsRevenueStats) tLObject2;
                                    xdVar32.m1 = r41.i0(tL_payments_starsRevenueStats.top_hours_graph, org.telegram.messenger.bd.M0(2131748410, null), 0, false);
                                    TL_stats.StatsGraph statsGraph = tL_payments_starsRevenueStats.revenue_graph;
                                    if (statsGraph != null) {
                                        statsGraph.rate = (float) (1.0E7d / tL_payments_starsRevenueStats.usd_rate);
                                    }
                                    xdVar32.n1 = r41.i0(statsGraph, org.telegram.messenger.bd.M0(2131748409, null), 2, false);
                                    d41 d41Var = xdVar32.m1;
                                    if (d41Var != null) {
                                        d41Var.n = true;
                                    }
                                    xdVar32.h1 = tL_payments_starsRevenueStats.usd_rate;
                                    xdVar32.L(true, tL_payments_starsRevenueStats.status);
                                    xdVar32.Z0.animate().alpha(0.0f).setDuration(380L).setInterpolator(org.telegram.ui.Components.xq.h).withEndAction(new cd(xdVar32, 5)).start();
                                    xdVar32.E();
                                    break;
                                }
                                break;
                            default:
                                if (!(tLObject2 instanceof TLRPC.TL_payments_starsRevenueStats)) {
                                    xdVar32.getClass();
                                    break;
                                } else {
                                    xdVar32.D((TLRPC.TL_payments_starsRevenueStats) tLObject2);
                                    break;
                                }
                        }
                    }
                });
                break;
        }
    }
}
