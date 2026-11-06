package a8;

import android.util.Base64;
import java.util.LinkedHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public abstract class m9 {
    public static byte[] a(JSONObject jSONObject) {
        LinkedHashMap linkedHashMap = d1.g.a;
        String optString = jSONObject.optString("challenge", "");
        kotlin.jvm.internal.j.b(optString);
        if (optString.length() == 0) {
            throw new JSONException("Challenge not found in request or is unexpectedly empty");
        }
        byte[] decode = Base64.decode(optString, 11);
        kotlin.jvm.internal.j.d(decode, "decode(...)");
        return decode;
    }
}
