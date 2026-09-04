package e6;

import org.json.JSONException;
import org.json.JSONObject;
import org.scilab.forge.jlatexmath.TeXSymbolParser;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final class j extends p {
    public final /* synthetic */ int r;
    public final /* synthetic */ h s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(h hVar, int i10) {
        super(hVar, false);
        this.r = i10;
        this.s = hVar;
    }

    @Override // e6.p
    public final void n() {
        switch (this.r) {
            case 0:
                g6.m mVar = this.s.c;
                g6.n o9 = o();
                mVar.getClass();
                JSONObject jSONObject = new JSONObject();
                long b10 = mVar.b();
                try {
                    jSONObject.put("requestId", b10);
                    jSONObject.put(TeXSymbolParser.TYPE_ATTR, "GET_STATUS");
                    c6.q qVar = mVar.f;
                    if (qVar != null) {
                        jSONObject.put("mediaSessionId", qVar.b);
                    }
                } catch (JSONException unused) {
                }
                mVar.c(b10, jSONObject.toString());
                mVar.p.a(b10, o9);
                break;
            case 1:
                this.s.c.d(o(), -1, null);
                break;
            case 2:
                this.s.c.d(o(), 1, null);
                break;
            case 3:
                this.s.c.d(o(), 0, 2);
                break;
            case 4:
                g6.m mVar2 = this.s.c;
                g6.n o10 = o();
                mVar2.getClass();
                JSONObject jSONObject2 = new JSONObject();
                long b11 = mVar2.b();
                try {
                    jSONObject2.put("requestId", b11);
                    jSONObject2.put(TeXSymbolParser.TYPE_ATTR, "QUEUE_GET_ITEM_IDS");
                    jSONObject2.put("mediaSessionId", mVar2.p());
                } catch (JSONException unused2) {
                }
                mVar2.c(b11, jSONObject2.toString());
                mVar2.r.a(b11, o10);
                break;
            case 5:
                g6.m mVar3 = this.s.c;
                g6.n o11 = o();
                mVar3.getClass();
                JSONObject jSONObject3 = new JSONObject();
                long b12 = mVar3.b();
                try {
                    jSONObject3.put("requestId", b12);
                    jSONObject3.put(TeXSymbolParser.TYPE_ATTR, "PAUSE");
                    jSONObject3.put("mediaSessionId", mVar3.p());
                } catch (JSONException unused3) {
                }
                mVar3.c(b12, jSONObject3.toString());
                mVar3.k.a(b12, o11);
                break;
            default:
                g6.m mVar4 = this.s.c;
                g6.n o12 = o();
                mVar4.getClass();
                JSONObject jSONObject4 = new JSONObject();
                long b13 = mVar4.b();
                try {
                    jSONObject4.put("requestId", b13);
                    jSONObject4.put(TeXSymbolParser.TYPE_ATTR, "PLAY");
                    jSONObject4.put("mediaSessionId", mVar4.p());
                } catch (JSONException unused4) {
                }
                mVar4.c(b13, jSONObject4.toString());
                mVar4.l.a(b13, o12);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(h hVar) {
        super(hVar, true);
        this.r = 4;
        this.s = hVar;
    }
}
