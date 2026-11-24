// default package

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class o15 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ p15 c;

    public o15(p15 p15Var, int i, long j) {
        this.c = p15Var;
        this.a = i;
        this.b = j;
    }

    public final void a(buc bucVar, fuc fucVar, fuc fucVar2, boolean z) {
        StringBuilder sb = new StringBuilder("websocket disconnected; closedByServer=");
        sb.append(z);
        sb.append(", serverCloseCode=");
        sb.append(fucVar == null ? "none" : Integer.valueOf(fucVar.b()));
        sb.append(", clientCloseCode=");
        sb.append(fucVar2 != null ? Integer.valueOf(fucVar2.b()) : "none");
        gl.d3(new tn6((Object) this.c, (Object) bucVar, this.a, (Object) sb.toString(), (byte) 24));
    }

    public final void b(buc bucVar, String str) {
        StringBuilder sb = new StringBuilder("[gram-wallet-streaming] account=");
        sb.append(this.c.a);
        sb.append(" generation=");
        int i = this.a;
        sb.append(i);
        sb.append(" receive <- ");
        sb.append(str);
        fa4.b(sb.toString());
        try {
            gl.d3(new tn6((Object) this, (Object) bucVar, i, (Object) new JSONObject(str), (byte) 25));
        } catch (JSONException unused) {
            gl.d3(new va7((Object) this, (Object) bucVar, i, (byte) 29));
        }
    }
}
