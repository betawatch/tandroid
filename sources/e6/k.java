package e6;

import android.util.Log;
import com.google.android.gms.cast.MediaInfo;
import java.util.regex.Pattern;
import n4.y;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.scilab.forge.jlatexmath.TeXSymbolParser;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class k extends p {
    public final /* synthetic */ int r;
    public final /* synthetic */ h s;
    public final /* synthetic */ Object t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(h hVar, Object obj, int i10) {
        super(hVar, false);
        this.r = i10;
        this.s = hVar;
        this.t = obj;
    }

    @Override // e6.p
    public final void n() {
        JSONObject jSONObject;
        int i10 = this.r;
        Object obj = this.t;
        h hVar = this.s;
        boolean z10 = false;
        switch (i10) {
            case 0:
                g6.m mVar = hVar.c;
                g6.n o9 = o();
                int[] iArr = (int[]) obj;
                mVar.getClass();
                JSONObject jSONObject2 = new JSONObject();
                long b10 = mVar.b();
                try {
                    jSONObject2.put("requestId", b10);
                    jSONObject2.put(TeXSymbolParser.TYPE_ATTR, "QUEUE_GET_ITEMS");
                    jSONObject2.put("mediaSessionId", mVar.p());
                    JSONArray jSONArray = new JSONArray();
                    for (int i11 : iArr) {
                        jSONArray.put(i11);
                    }
                    jSONObject2.put("itemIds", jSONArray);
                } catch (JSONException unused) {
                }
                mVar.c(b10, jSONObject2.toString());
                mVar.s.a(b10, o9);
                return;
            case 1:
                g6.m mVar2 = hVar.c;
                g6.n o10 = o();
                c6.k kVar = (c6.k) obj;
                mVar2.getClass();
                MediaInfo mediaInfo = kVar.a;
                c6.n nVar = kVar.b;
                if (mediaInfo == null && nVar == null) {
                    throw new IllegalArgumentException("MediaInfo and MediaQueueData should not be both null");
                }
                long[] jArr = kVar.f;
                JSONObject jSONObject3 = new JSONObject();
                try {
                    MediaInfo mediaInfo2 = kVar.a;
                    if (mediaInfo2 != null) {
                        jSONObject3.put("media", mediaInfo2.b());
                    }
                    if (nVar != null) {
                        jSONObject3.put("queueData", nVar.b());
                    }
                    jSONObject3.putOpt("autoplay", kVar.c);
                    long j3 = kVar.d;
                    if (j3 != -1) {
                        Pattern pattern = g6.a.a;
                        jSONObject3.put("currentTime", j3 / 1000.0d);
                    }
                    jSONObject3.put("playbackRate", kVar.e);
                    jSONObject3.putOpt("credentials", kVar.r);
                    jSONObject3.putOpt("credentialsType", kVar.s);
                    jSONObject3.putOpt("atvCredentials", kVar.v);
                    jSONObject3.putOpt("atvCredentialsType", kVar.w);
                    if (jArr != null) {
                        JSONArray jSONArray2 = new JSONArray();
                        for (int i12 = 0; i12 < jArr.length; i12++) {
                            jSONArray2.put(i12, jArr[i12]);
                        }
                        jSONObject3.put("activeTrackIds", jSONArray2);
                    }
                    jSONObject3.putOpt("customData", kVar.n);
                    jSONObject3.put("requestId", kVar.x);
                    jSONObject = jSONObject3;
                } catch (JSONException e) {
                    g6.b bVar = c6.k.y;
                    Log.e(bVar.a, bVar.d("Error transforming MediaLoadRequestData into JSONObject", e));
                    jSONObject = new JSONObject();
                }
                long b11 = mVar2.b();
                try {
                    jSONObject.put("requestId", b11);
                    jSONObject.put(TeXSymbolParser.TYPE_ATTR, "LOAD");
                } catch (JSONException unused2) {
                }
                mVar2.c(b11, jSONObject.toString());
                mVar2.j.a(b11, o10);
                return;
            default:
                g6.m mVar3 = hVar.c;
                g6.n o11 = o();
                mVar3.getClass();
                JSONObject jSONObject4 = new JSONObject();
                long b12 = mVar3.b();
                long j10 = ((c6.p) obj).a;
                try {
                    jSONObject4.put("requestId", b12);
                    jSONObject4.put(TeXSymbolParser.TYPE_ATTR, "SEEK");
                    jSONObject4.put("mediaSessionId", mVar3.p());
                    Pattern pattern2 = g6.a.a;
                    jSONObject4.put("currentTime", j10 / 1000.0d);
                } catch (JSONException unused3) {
                }
                mVar3.c(b12, jSONObject4.toString());
                mVar3.g = Long.valueOf(j10);
                mVar3.m.a(b12, new y(mVar3, o11, z10 ? 1 : 0, 19));
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(h hVar, int[] iArr) {
        super(hVar, true);
        this.r = 0;
        this.s = hVar;
        this.t = iArr;
    }
}
