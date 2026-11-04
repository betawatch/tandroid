package org.telegram.ui;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stats;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class d41 {
    public boolean a;
    public String b;
    public long c;
    public ng.b d;
    public ng.b e;
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

    public d41(String str, int i3) {
        this.j = str;
        this.i = i3;
    }

    public final void a(int i3, int i10, int i11, org.telegram.messenger.m10 m10Var) {
        if (this.k) {
            return;
        }
        this.k = true;
        TL_stats.TL_loadAsyncGraph tL_loadAsyncGraph = new TL_stats.TL_loadAsyncGraph();
        tL_loadAsyncGraph.token = this.f;
        ConnectionsManager.getInstance(i3).bindRequestToGuid(ConnectionsManager.getInstance(i3).sendRequest(tL_loadAsyncGraph, new m21(3, this, m10Var), null, null, 0, i11, 1, true), i10);
    }
}
