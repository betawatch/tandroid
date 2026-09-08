package e6;

import org.json.JSONException;
import org.json.JSONObject;
import org.scilab.forge.jlatexmath.TeXSymbolParser;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class m extends p {
    public final /* synthetic */ int r;
    public final /* synthetic */ double s;
    public final /* synthetic */ h t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(h hVar, double d, int i10) {
        super(hVar, false);
        this.r = i10;
        this.t = hVar;
        this.s = d;
    }

    @Override // e6.p
    public final void n() {
        switch (this.r) {
            case 0:
                g6.m mVar = this.t.c;
                g6.n o9 = o();
                mVar.getClass();
                double d = this.s;
                if (Double.isInfinite(d) || Double.isNaN(d)) {
                    throw new IllegalArgumentException("Volume cannot be " + d);
                }
                JSONObject jSONObject = new JSONObject();
                long b10 = mVar.b();
                try {
                    jSONObject.put("requestId", b10);
                    jSONObject.put(TeXSymbolParser.TYPE_ATTR, "SET_VOLUME");
                    jSONObject.put("mediaSessionId", mVar.p());
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("level", d);
                    jSONObject.put("volume", jSONObject2);
                } catch (JSONException unused) {
                }
                mVar.c(b10, jSONObject.toString());
                mVar.n.a(b10, o9);
                return;
            default:
                g6.m mVar2 = this.t.c;
                g6.n o10 = o();
                double d10 = this.s;
                if (mVar2.f == null) {
                    throw new g6.k();
                }
                JSONObject jSONObject3 = new JSONObject();
                long b11 = mVar2.b();
                try {
                    jSONObject3.put("requestId", b11);
                    jSONObject3.put(TeXSymbolParser.TYPE_ATTR, "SET_PLAYBACK_RATE");
                    jSONObject3.put("playbackRate", d10);
                    n6.l.i(mVar2.f, "mediaStatus should not be null");
                    jSONObject3.put("mediaSessionId", mVar2.f.b);
                } catch (JSONException unused2) {
                }
                mVar2.c(b11, jSONObject3.toString());
                mVar2.u.a(b11, o10);
                return;
        }
    }
}
