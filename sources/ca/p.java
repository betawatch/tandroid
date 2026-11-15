package ca;

import org.json.JSONObject;
import org.telegram.ui.Components.cf;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public abstract class p {
    public static final cf a;

    static {
        pa.d dVar = new pa.d();
        a aVar = a.a;
        dVar.b(p.class, aVar);
        dVar.b(b.class, aVar);
        a = new cf(dVar);
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
