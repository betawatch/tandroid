package org.telegram.ui;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stats;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class e61 {
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

    public e61(String str, int i10) {
        this.j = str;
        this.i = i10;
    }

    public final void a(int i10, int i11, int i12, org.telegram.messenger.j20 j20Var) {
        if (this.k) {
            return;
        }
        this.k = true;
        TL_stats.TL_loadAsyncGraph tL_loadAsyncGraph = new TL_stats.TL_loadAsyncGraph();
        tL_loadAsyncGraph.token = this.f;
        ConnectionsManager.getInstance(i10).bindRequestToGuid(ConnectionsManager.getInstance(i10).sendRequest(tL_loadAsyncGraph, new sl0(14, this, j20Var), null, null, 0, i12, 1, true), i11);
    }
}
