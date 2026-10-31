package org.telegram.ui;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stats;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class g61 {
    public boolean a;
    public String b;
    public long c;
    public cg.b d;
    public cg.b e;
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

    public g61(String str, int i10) {
        this.j = str;
        this.i = i10;
    }

    public final void a(int i10, int i11, int i12, org.telegram.messenger.i20 i20Var) {
        if (this.k) {
            return;
        }
        this.k = true;
        TL_stats.TL_loadAsyncGraph tL_loadAsyncGraph = new TL_stats.TL_loadAsyncGraph();
        tL_loadAsyncGraph.token = this.f;
        ConnectionsManager.getInstance(i10).bindRequestToGuid(ConnectionsManager.getInstance(i10).sendRequest(tL_loadAsyncGraph, new ul0(14, this, i20Var), null, null, 0, i12, 1, true), i11);
    }
}
