// default package

import android.util.Base64;
import java.util.LinkedHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public abstract class mwe {
    public static byte[] a(JSONObject jSONObject) {
        LinkedHashMap linkedHashMap = ux8.a;
        String optString = jSONObject.optString("challenge", "");
        optString.getClass();
        if (optString.length() == 0) {
            throw new JSONException("Challenge not found in request or is unexpectedly empty");
        }
        byte[] decode = Base64.decode(optString, 11);
        decode.getClass();
        return decode;
    }
}
