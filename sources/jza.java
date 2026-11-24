// default package

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stats;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class jza {
    public boolean a;
    public String b;
    public long c;
    public nl1 d;
    public nl1 e;
    public String f;
    public String g;
    public boolean h;
    public final byte i;
    public final String j;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean n;
    public boolean o;

    /* JADX WARN: Multi-variable type inference failed */
    public jza(String str, int i) {
        this.j = str;
        this.i = i;
    }

    public final void a(int i, int i2, int i3, iac iacVar) {
        if (this.k) {
            return;
        }
        this.k = true;
        TL_stats.TL_loadAsyncGraph tL_loadAsyncGraph = new TL_stats.TL_loadAsyncGraph();
        tL_loadAsyncGraph.token = this.f;
        ConnectionsManager.getInstance(i).bindRequestToGuid(ConnectionsManager.getInstance(i).sendRequest(tL_loadAsyncGraph, new ara(this, iacVar, (byte) 3), null, null, 0, i3, 1, true), i2);
    }
}
