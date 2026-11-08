package ca;

import org.json.JSONObject;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public abstract class p {
    public static final org.telegram.ui.Components.n a;

    static {
        pa.d dVar = new pa.d();
        a aVar = a.a;
        dVar.b(p.class, aVar);
        dVar.b(b.class, aVar);
        a = new org.telegram.ui.Components.n(dVar);
    }

    public static b a(String str) {
        JSONObject jSONObject = new JSONObject(str);
        String string = jSONObject.getString("rolloutId");
        String string2 = jSONObject.getString("parameterKey");
        String string3 = jSONObject.getString("parameterValue");
        String string4 = jSONObject.getString("variantId");
        long j3 = jSONObject.getLong("templateVersion");
        if (string3.length() > 256) {
            string3 = string3.substring(0, 256);
        }
        return new b(string, string2, string3, string4, j3);
    }
}
