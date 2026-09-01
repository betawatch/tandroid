package j9;

import org.json.JSONObject;
import org.telegram.ui.Components.ai;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public abstract class n {
    public static final ai a;

    static {
        w9.d dVar = new w9.d();
        a aVar = a.a;
        dVar.b(n.class, aVar);
        dVar.b(b.class, aVar);
        a = new ai(dVar, 19);
    }

    public static b a(String str) {
        JSONObject jSONObject = new JSONObject(str);
        String string = jSONObject.getString("rolloutId");
        String string2 = jSONObject.getString("parameterKey");
        String string3 = jSONObject.getString("parameterValue");
        String string4 = jSONObject.getString("variantId");
        long j10 = jSONObject.getLong("templateVersion");
        if (string3.length() > 256) {
            string3 = string3.substring(0, 256);
        }
        return new b(string, string2, string3, string4, j10);
    }
}
