// default package

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stats;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class gxa {
    public boolean a;
    public String b;
    public long c;
    public fk1 d;
    public fk1 e;
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
    public gxa(String str, int i) {
        this.j = str;
        this.i = i;
    }

    public final void a(int i, int i2, int i3, h8c h8cVar) {
        if (this.k) {
            return;
        }
        this.k = true;
        TL_stats.TL_loadAsyncGraph tL_loadAsyncGraph = new TL_stats.TL_loadAsyncGraph();
        tL_loadAsyncGraph.token = this.f;
        ConnectionsManager.getInstance(i).bindRequestToGuid(ConnectionsManager.getInstance(i).sendRequest(tL_loadAsyncGraph, new apa(this, h8cVar, (byte) 3), null, null, 0, i3, 1, true), i2);
    }
}
