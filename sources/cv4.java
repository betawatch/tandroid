// default package

import android.os.Bundle;
import org.json.JSONObject;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class cv4 extends c33 {
    public final String e;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public cv4(String str) {
        super("androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL", r2, r3, true, q34.a);
        str.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("androidx.credentials.BUNDLE_KEY_SUBTYPE", "androidx.credentials.BUNDLE_VALUE_SUBTYPE_GET_PUBLIC_KEY_CREDENTIAL_OPTION");
        bundle.putString("androidx.credentials.BUNDLE_KEY_REQUEST_JSON", str);
        bundle.putByteArray("androidx.credentials.BUNDLE_KEY_CLIENT_DATA_HASH", null);
        Bundle bundle2 = new Bundle();
        bundle2.putString("androidx.credentials.BUNDLE_KEY_SUBTYPE", "androidx.credentials.BUNDLE_VALUE_SUBTYPE_GET_PUBLIC_KEY_CREDENTIAL_OPTION");
        bundle2.putString("androidx.credentials.BUNDLE_KEY_REQUEST_JSON", str);
        bundle2.putByteArray("androidx.credentials.BUNDLE_KEY_CLIENT_DATA_HASH", null);
        this.e = str;
        if (str.length() != 0) {
            try {
                new JSONObject(str);
                return;
            } catch (Exception unused) {
            }
        }
        u36.j("requestJson must not be empty, and must be a valid JSON");
        throw null;
    }
}
