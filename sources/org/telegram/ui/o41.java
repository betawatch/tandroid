package org.telegram.ui;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stats;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class o41 {
    public boolean a;
    public String b;
    public long c;
    public mg.b d;
    public mg.b e;
    public String f;
    public String g;
    public boolean h;
    public final int i;
    public final String j;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean n;
    public boolean o;

    public o41(String str, int i7) {
        this.j = str;
        this.i = i7;
    }

    public final void a(int i7, int i10, int i11, org.telegram.messenger.u10 u10Var) {
        if (this.k) {
            return;
        }
        this.k = true;
        TL_stats.TL_loadAsyncGraph tL_loadAsyncGraph = new TL_stats.TL_loadAsyncGraph();
        tL_loadAsyncGraph.token = this.f;
        ConnectionsManager.getInstance(i7).bindRequestToGuid(ConnectionsManager.getInstance(i7).sendRequest(tL_loadAsyncGraph, new n41(0, this, u10Var), null, null, 0, i11, 1, true), i10);
    }
}
