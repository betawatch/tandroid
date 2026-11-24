// default package

import android.os.Bundle;
import org.json.JSONObject;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class a13 extends i03 {
    public final String d;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public a13(String str) {
        super(r0, r7, r2);
        str.getClass();
        try {
            JSONObject jSONObject = new JSONObject(str).getJSONObject("user");
            String string = jSONObject.getString("name");
            String string2 = jSONObject.isNull("displayName") ? null : jSONObject.getString("displayName");
            string.getClass();
            i5 i5Var = new i5(string, string2, (byte) 1);
            Bundle bundle = new Bundle();
            bundle.putString("androidx.credentials.BUNDLE_KEY_SUBTYPE", "androidx.credentials.BUNDLE_VALUE_SUBTYPE_CREATE_PUBLIC_KEY_CREDENTIAL_REQUEST");
            bundle.putString("androidx.credentials.BUNDLE_KEY_REQUEST_JSON", str);
            bundle.putByteArray("androidx.credentials.BUNDLE_KEY_CLIENT_DATA_HASH", null);
            Bundle bundle2 = new Bundle();
            bundle2.putString("androidx.credentials.BUNDLE_KEY_SUBTYPE", "androidx.credentials.BUNDLE_VALUE_SUBTYPE_CREATE_PUBLIC_KEY_CREDENTIAL_REQUEST");
            bundle2.putString("androidx.credentials.BUNDLE_KEY_REQUEST_JSON", str);
            bundle2.putByteArray("androidx.credentials.BUNDLE_KEY_CLIENT_DATA_HASH", null);
            this.d = str;
            if (str.length() != 0) {
                try {
                    new JSONObject(str);
                    return;
                } catch (Exception unused) {
                }
            }
            w26.j("requestJson must not be empty, and must be a valid JSON");
            throw null;
        } catch (Exception unused2) {
            w26.j("user.name must be defined in requestJson");
            throw null;
        }
    }
}
