// default package

import android.os.Bundle;
import org.json.JSONObject;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class m23 extends u13 {
    public final String d;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public m23(String str) {
        super(r0, r7, r2);
        str.getClass();
        try {
            JSONObject jSONObject = new JSONObject(str).getJSONObject("user");
            String string = jSONObject.getString("name");
            String string2 = jSONObject.isNull("displayName") ? null : jSONObject.getString("displayName");
            string.getClass();
            s13 s13Var = new s13(string, string2, (byte) 0);
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
            u36.j("requestJson must not be empty, and must be a valid JSON");
            throw null;
        } catch (Exception unused2) {
            u36.j("user.name must be defined in requestJson");
            throw null;
        }
    }
}
