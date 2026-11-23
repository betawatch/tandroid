package h6;

import org.json.JSONException;
import org.json.JSONObject;
import org.scilab.forge.jlatexmath.TeXSymbolParser;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final class i extends p {
    public final /* synthetic */ int r;
    public final /* synthetic */ h s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(h hVar, int i7) {
        super(hVar, false);
        this.r = i7;
        this.s = hVar;
    }

    @Override // h6.p
    public final void n() {
        switch (this.r) {
            case 0:
                j6.n nVar = this.s.c;
                j6.o o4 = o();
                nVar.getClass();
                JSONObject jSONObject = new JSONObject();
                long b10 = nVar.b();
                try {
                    jSONObject.put("requestId", b10);
                    jSONObject.put(TeXSymbolParser.TYPE_ATTR, "GET_STATUS");
                    f6.q qVar = nVar.f;
                    if (qVar != null) {
                        jSONObject.put("mediaSessionId", qVar.b);
                    }
                } catch (JSONException unused) {
                }
                nVar.c(b10, jSONObject.toString());
                nVar.p.a(b10, o4);
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
                j6.n nVar2 = this.s.c;
                j6.o o10 = o();
                nVar2.getClass();
                JSONObject jSONObject2 = new JSONObject();
                long b11 = nVar2.b();
                try {
                    jSONObject2.put("requestId", b11);
                    jSONObject2.put(TeXSymbolParser.TYPE_ATTR, "QUEUE_GET_ITEM_IDS");
                    jSONObject2.put("mediaSessionId", nVar2.p());
                } catch (JSONException unused2) {
                }
                nVar2.c(b11, jSONObject2.toString());
                nVar2.r.a(b11, o10);
                break;
            case 5:
                j6.n nVar3 = this.s.c;
                j6.o o11 = o();
                nVar3.getClass();
                JSONObject jSONObject3 = new JSONObject();
                long b12 = nVar3.b();
                try {
                    jSONObject3.put("requestId", b12);
                    jSONObject3.put(TeXSymbolParser.TYPE_ATTR, "PAUSE");
                    jSONObject3.put("mediaSessionId", nVar3.p());
                } catch (JSONException unused3) {
                }
                nVar3.c(b12, jSONObject3.toString());
                nVar3.k.a(b12, o11);
                break;
            default:
                j6.n nVar4 = this.s.c;
                j6.o o12 = o();
                nVar4.getClass();
                JSONObject jSONObject4 = new JSONObject();
                long b13 = nVar4.b();
                try {
                    jSONObject4.put("requestId", b13);
                    jSONObject4.put(TeXSymbolParser.TYPE_ATTR, "PLAY");
                    jSONObject4.put("mediaSessionId", nVar4.p());
                } catch (JSONException unused4) {
                }
                nVar4.c(b13, jSONObject4.toString());
                nVar4.l.a(b13, o12);
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
