package o5;

import org.json.JSONException;
import org.json.JSONObject;
import org.scilab.forge.jlatexmath.TeXSymbolParser;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class l extends n {
    public final /* synthetic */ int r;
    public final /* synthetic */ double s;
    public final /* synthetic */ h t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(h hVar, double d, int i10) {
        super(hVar, false);
        this.r = i10;
        this.t = hVar;
        this.s = d;
    }

    @Override // o5.n
    public final void n() {
        switch (this.r) {
            case 0:
                r5.n nVar = this.t.c;
                r5.o o10 = o();
                nVar.getClass();
                double d = this.s;
                if (Double.isInfinite(d) || Double.isNaN(d)) {
                    throw new IllegalArgumentException("Volume cannot be " + d);
                }
                JSONObject jSONObject = new JSONObject();
                long b10 = nVar.b();
                try {
                    jSONObject.put("requestId", b10);
                    jSONObject.put(TeXSymbolParser.TYPE_ATTR, "SET_VOLUME");
                    jSONObject.put("mediaSessionId", nVar.p());
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("level", d);
                    jSONObject.put("volume", jSONObject2);
                } catch (JSONException unused) {
                }
                nVar.c(b10, jSONObject.toString());
                nVar.n.a(b10, o10);
                return;
            default:
                r5.n nVar2 = this.t.c;
                r5.o o11 = o();
                double d10 = this.s;
                if (nVar2.f == null) {
                    throw new r5.l();
                }
                JSONObject jSONObject3 = new JSONObject();
                long b11 = nVar2.b();
                try {
                    jSONObject3.put("requestId", b11);
                    jSONObject3.put(TeXSymbolParser.TYPE_ATTR, "SET_PLAYBACK_RATE");
                    jSONObject3.put("playbackRate", d10);
                    y5.l.i(nVar2.f, "mediaStatus should not be null");
                    jSONObject3.put("mediaSessionId", nVar2.f.b);
                } catch (JSONException unused2) {
                }
                nVar2.c(b11, jSONObject3.toString());
                nVar2.u.a(b11, o11);
                return;
        }
    }
}
