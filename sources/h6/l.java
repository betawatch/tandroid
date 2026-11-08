package h6;

import org.json.JSONException;
import org.json.JSONObject;
import org.scilab.forge.jlatexmath.TeXSymbolParser;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public final class l extends o {
    public final /* synthetic */ int r;
    public final /* synthetic */ double s;
    public final /* synthetic */ h t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(h hVar, double d, int i7) {
        super(hVar, false);
        this.r = i7;
        this.t = hVar;
        this.s = d;
    }

    @Override // h6.o
    public final void n() {
        switch (this.r) {
            case 0:
                j6.m mVar = this.t.c;
                j6.n o4 = o();
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
                mVar.n.a(b10, o4);
                return;
            default:
                j6.m mVar2 = this.t.c;
                j6.n o10 = o();
                double d2 = this.s;
                if (mVar2.f == null) {
                    throw new j6.k();
                }
                JSONObject jSONObject3 = new JSONObject();
                long b11 = mVar2.b();
                try {
                    jSONObject3.put("requestId", b11);
                    jSONObject3.put(TeXSymbolParser.TYPE_ATTR, "SET_PLAYBACK_RATE");
                    jSONObject3.put("playbackRate", d2);
                    q6.m.h(mVar2.f, "mediaStatus should not be null");
                    jSONObject3.put("mediaSessionId", mVar2.f.b);
                } catch (JSONException unused2) {
                }
                mVar2.c(b11, jSONObject3.toString());
                mVar2.u.a(b11, o10);
                return;
        }
    }
}
