package f7;

import android.util.Base64;
import java.util.LinkedHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public abstract class p6 {
    public static byte[] a(JSONObject jSONObject) {
        LinkedHashMap linkedHashMap = d1.g.a;
        String optString = jSONObject.optString("challenge", "");
        kotlin.jvm.internal.i.b(optString);
        if (optString.length() == 0) {
            throw new JSONException("Challenge not found in request or is unexpectedly empty");
        }
        byte[] decode = Base64.decode(optString, 11);
        kotlin.jvm.internal.i.d(decode, "decode(...)");
        return decode;
    }
}
