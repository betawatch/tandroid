package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stats;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class e91 {
    public boolean a;
    public String b;
    public long c;
    public rf.b d;
    public rf.b e;
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

    public e91(String str, int i9) {
        this.j = str;
        this.i = i9;
    }

    public final void a(int i9, int i10, int i11, Utilities.Callback0Return callback0Return) {
        if (this.k) {
            return;
        }
        this.k = true;
        TL_stats.TL_loadAsyncGraph tL_loadAsyncGraph = new TL_stats.TL_loadAsyncGraph();
        tL_loadAsyncGraph.token = this.f;
        ConnectionsManager.getInstance(i9).bindRequestToGuid(ConnectionsManager.getInstance(i9).sendRequest(tL_loadAsyncGraph, new o71(1, this, callback0Return), null, null, 0, i11, 1, true), i10);
    }
}
