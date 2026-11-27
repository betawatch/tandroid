// default package

import android.util.Base64;
import java.util.LinkedHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
