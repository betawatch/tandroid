// default package

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class o35 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ p35 c;

    public o35(p35 p35Var, int i, long j) {
        this.c = p35Var;
        this.a = i;
        this.b = j;
    }

    public final void a(cwc cwcVar, gwc gwcVar, gwc gwcVar2, boolean z) {
        StringBuilder sb = new StringBuilder("websocket disconnected; closedByServer=");
        sb.append(z);
        sb.append(", serverCloseCode=");
        sb.append(gwcVar == null ? "none" : Integer.valueOf(gwcVar.b()));
        sb.append(", clientCloseCode=");
        sb.append(gwcVar2 != null ? Integer.valueOf(gwcVar2.b()) : "none");
        gm.c3(new up6((Object) this.c, (Object) cwcVar, this.a, (Object) sb.toString(), (byte) 25));
    }

    public final void b(cwc cwcVar, String str) {
        StringBuilder sb = new StringBuilder("[gram-wallet-streaming] account=");
        sb.append(this.c.a);
        sb.append(" generation=");
        int i = this.a;
        sb.append(i);
        sb.append(" receive <- ");
        sb.append(str);
        fc4.b(sb.toString());
        try {
            gm.c3(new up6((Object) this, (Object) cwcVar, i, (Object) new JSONObject(str), (byte) 26));
        } catch (JSONException unused) {
            gm.c3(new wc7((Object) this, (Object) cwcVar, i, (byte) 29));
        }
    }
}
