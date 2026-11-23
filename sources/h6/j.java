package h6;

import android.util.Log;
import com.google.android.gms.cast.MediaInfo;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.scilab.forge.jlatexmath.TeXSymbolParser;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final class j extends p {
    public final /* synthetic */ int r;
    public final /* synthetic */ h s;
    public final /* synthetic */ Object t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(h hVar, Object obj, int i7) {
        super(hVar, false);
        this.r = i7;
        this.s = hVar;
        this.t = obj;
    }

    @Override // h6.p
    public final void n() {
        JSONObject jSONObject;
        int i7 = this.r;
        Object obj = this.t;
        h hVar = this.s;
        boolean z10 = false;
        switch (i7) {
            case 0:
                j6.n nVar = hVar.c;
                j6.o o4 = o();
                int[] iArr = (int[]) obj;
                nVar.getClass();
                JSONObject jSONObject2 = new JSONObject();
                long b10 = nVar.b();
                try {
                    jSONObject2.put("requestId", b10);
                    jSONObject2.put(TeXSymbolParser.TYPE_ATTR, "QUEUE_GET_ITEMS");
                    jSONObject2.put("mediaSessionId", nVar.p());
                    JSONArray jSONArray = new JSONArray();
                    for (int i10 : iArr) {
                        jSONArray.put(i10);
                    }
                    jSONObject2.put("itemIds", jSONArray);
                } catch (JSONException unused) {
                }
                nVar.c(b10, jSONObject2.toString());
                nVar.s.a(b10, o4);
                return;
            case 1:
                j6.n nVar2 = hVar.c;
                j6.o o10 = o();
                f6.k kVar = (f6.k) obj;
                nVar2.getClass();
                MediaInfo mediaInfo = kVar.a;
                f6.n nVar3 = kVar.b;
                if (mediaInfo == null && nVar3 == null) {
                    throw new IllegalArgumentException("MediaInfo and MediaQueueData should not be both null");
                }
                long[] jArr = kVar.f;
                JSONObject jSONObject3 = new JSONObject();
                try {
                    MediaInfo mediaInfo2 = kVar.a;
                    if (mediaInfo2 != null) {
                        jSONObject3.put("media", mediaInfo2.b());
                    }
                    if (nVar3 != null) {
                        jSONObject3.put("queueData", nVar3.b());
                    }
                    jSONObject3.putOpt("autoplay", kVar.c);
                    long j3 = kVar.d;
                    if (j3 != -1) {
                        Pattern pattern = j6.a.a;
                        jSONObject3.put("currentTime", j3 / 1000.0d);
                    }
                    jSONObject3.put("playbackRate", kVar.e);
                    jSONObject3.putOpt("credentials", kVar.r);
                    jSONObject3.putOpt("credentialsType", kVar.s);
                    jSONObject3.putOpt("atvCredentials", kVar.w);
                    jSONObject3.putOpt("atvCredentialsType", kVar.x);
                    if (jArr != null) {
                        JSONArray jSONArray2 = new JSONArray();
                        for (int i11 = 0; i11 < jArr.length; i11++) {
                            jSONArray2.put(i11, jArr[i11]);
                        }
                        jSONObject3.put("activeTrackIds", jSONArray2);
                    }
                    jSONObject3.putOpt("customData", kVar.n);
                    jSONObject3.put("requestId", kVar.y);
                    jSONObject = jSONObject3;
                } catch (JSONException e10) {
                    j6.b bVar = f6.k.E;
                    Log.e(bVar.a, bVar.d("Error transforming MediaLoadRequestData into JSONObject", e10));
                    jSONObject = new JSONObject();
                }
                long b11 = nVar2.b();
                try {
                    jSONObject.put("requestId", b11);
                    jSONObject.put(TeXSymbolParser.TYPE_ATTR, "LOAD");
                } catch (JSONException unused2) {
                }
                nVar2.c(b11, jSONObject.toString());
                nVar2.j.a(b11, o10);
                return;
            default:
                j6.n nVar4 = hVar.c;
                j6.o o11 = o();
                nVar4.getClass();
                JSONObject jSONObject4 = new JSONObject();
                long b12 = nVar4.b();
                long j10 = ((f6.p) obj).a;
                try {
                    jSONObject4.put("requestId", b12);
                    jSONObject4.put(TeXSymbolParser.TYPE_ATTR, "SEEK");
                    jSONObject4.put("mediaSessionId", nVar4.p());
                    Pattern pattern2 = j6.a.a;
                    jSONObject4.put("currentTime", j10 / 1000.0d);
                } catch (JSONException unused3) {
                }
                nVar4.c(b12, jSONObject4.toString());
                nVar4.g = Long.valueOf(j10);
                nVar4.m.a(b12, new wf.b(nVar4, o11, z10 ? 1 : 0, 28));
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(h hVar, int[] iArr) {
        super(hVar, true);
        this.r = 0;
        this.s = hVar;
        this.t = iArr;
    }
}
