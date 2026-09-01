package i6;

import b6.m;
import java.util.Iterator;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public abstract class c {
    static {
        Pattern.compile("\\\\.");
        Pattern.compile("[\\\\\"/\b\f\n\r\t]");
    }

    public static boolean a(Object obj, Object obj2) {
        int i10;
        if (obj == null && obj2 == null) {
            return true;
        }
        if (obj != null && obj2 != null) {
            try {
                if ((obj instanceof JSONObject) && (obj2 instanceof JSONObject)) {
                    JSONObject jSONObject = (JSONObject) obj;
                    JSONObject jSONObject2 = (JSONObject) obj2;
                    if (jSONObject.length() == jSONObject2.length()) {
                        Iterator<String> keys = jSONObject.keys();
                        while (keys.hasNext()) {
                            String next = keys.next();
                            if (jSONObject2.has(next)) {
                                m.h(next);
                                if (a(jSONObject.get(next), jSONObject2.get(next))) {
                                }
                            }
                        }
                        return true;
                    }
                } else {
                    if (!(obj instanceof JSONArray) || !(obj2 instanceof JSONArray)) {
                        return obj.equals(obj2);
                    }
                    JSONArray jSONArray = (JSONArray) obj;
                    JSONArray jSONArray2 = (JSONArray) obj2;
                    if (jSONArray.length() == jSONArray2.length()) {
                        while (i10 < jSONArray.length()) {
                            i10 = a(jSONArray.get(i10), jSONArray2.get(i10)) ? i10 + 1 : 0;
                        }
                        return true;
                    }
                }
            } catch (JSONException unused) {
            }
        }
        return false;
    }
}
