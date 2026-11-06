package h6;

import org.json.JSONException;
import org.json.JSONObject;
import org.scilab.forge.jlatexmath.TeXSymbolParser;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public final class i extends o {
    public final /* synthetic */ int r;
    public final /* synthetic */ h s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(h hVar, int i7) {
        super(hVar, false);
        this.r = i7;
        this.s = hVar;
    }

    @Override // h6.o
    public final void n() {
        switch (this.r) {
            case 0:
                j6.m mVar = this.s.c;
                j6.n o4 = o();
                mVar.getClass();
                JSONObject jSONObject = new JSONObject();
                long b10 = mVar.b();
                try {
                    jSONObject.put("requestId", b10);
                    jSONObject.put(TeXSymbolParser.TYPE_ATTR, "GET_STATUS");
                    f6.q qVar = mVar.f;
                    if (qVar != null) {
                        jSONObject.put("mediaSessionId", qVar.b);
                    }
                } catch (JSONException unused) {
                }
                mVar.c(b10, jSONObject.toString());
                mVar.p.a(b10, o4);
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
                j6.m mVar2 = this.s.c;
                j6.n o10 = o();
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
                j6.m mVar3 = this.s.c;
                j6.n o11 = o();
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
                j6.m mVar4 = this.s.c;
                j6.n o12 = o();
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
    public i(h hVar) {
        super(hVar, true);
        this.r = 4;
        this.s = hVar;
    }
}
