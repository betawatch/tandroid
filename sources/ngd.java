// default package

import org.json.JSONException;
import org.json.JSONObject;
import org.scilab.forge.jlatexmath.TeXSymbolParser;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class ngd extends fid {
    public final /* synthetic */ byte r;
    public final /* synthetic */ double s;
    public final /* synthetic */ v99 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ngd(v99 v99Var, double d, byte b) {
        super(v99Var, false);
        this.r = b;
        this.t = v99Var;
        this.s = d;
    }

    @Override // fid
    public final void n() {
        byte b = this.r;
        double d = this.s;
        v99 v99Var = this.t;
        switch (b) {
            case 0:
                rdd rddVar = v99Var.c;
                ydd o = o();
                rddVar.getClass();
                if (Double.isInfinite(d) || Double.isNaN(d)) {
                    throw new IllegalArgumentException("Volume cannot be " + d);
                }
                JSONObject jSONObject = new JSONObject();
                long l = rddVar.l();
                try {
                    jSONObject.put("requestId", l);
                    jSONObject.put(TeXSymbolParser.TYPE_ATTR, "SET_VOLUME");
                    jSONObject.put("mediaSessionId", rddVar.p());
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("level", d);
                    jSONObject.put("volume", jSONObject2);
                } catch (JSONException unused) {
                }
                rddVar.n(l, jSONObject.toString());
                rddVar.n.a(l, o);
                return;
            default:
                rdd rddVar2 = v99Var.c;
                ydd o2 = o();
                if (rddVar2.f == null) {
                    throw new fdd();
                }
                JSONObject jSONObject3 = new JSONObject();
                long l2 = rddVar2.l();
                try {
                    jSONObject3.put("requestId", l2);
                    jSONObject3.put(TeXSymbolParser.TYPE_ATTR, "SET_PLAYBACK_RATE");
                    jSONObject3.put("playbackRate", d);
                    xve.i(rddVar2.f, "mediaStatus should not be null");
                    jSONObject3.put("mediaSessionId", rddVar2.f.b);
                } catch (JSONException unused2) {
                }
                rddVar2.n(l2, jSONObject3.toString());
                rddVar2.u.a(l2, o2);
                return;
        }
    }
}
